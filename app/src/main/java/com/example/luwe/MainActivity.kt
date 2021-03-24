package com.example.luwe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFoods = findViewById(R.id.rv_list_item)
        rvFoods.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(list)
        rvFoods.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback {
            override fun onItemClicked(food: Food) {
                moveToDetailFood(food)
            }
        })
    }

    private fun moveToDetailFood(food: Food) {
        val moveWithDataIntent = Intent(this@MainActivity, DetailFoodActivity::class.java)
        moveWithDataIntent.putExtra(DetailFoodActivity.EXTRA_NAME, food.name)
        moveWithDataIntent.putExtra(DetailFoodActivity.EXTRA_PRICE, food.price)
        moveWithDataIntent.putExtra(DetailFoodActivity.EXTRA_DESC, food.desc)
        moveWithDataIntent.putExtra(DetailFoodActivity.EXTRA_IMG, food.img)
        startActivity(moveWithDataIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profile -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }

        }

        return super.onOptionsItemSelected(item)
    }


}
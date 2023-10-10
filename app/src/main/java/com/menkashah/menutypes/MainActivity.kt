package com.menkashah.menutypes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import com.menkashah.menutypes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.popmenu.setOnClickListener {
            showPopMenu(it)
        }
    }

    fun showPopMenu(it: View){
        val popupMenu=PopupMenu(this,it)
        popupMenu.inflate(R.menu.popupmenu)
        popupMenu.show()

        popupMenu.setOnMenuItemClickListener {item->
            when(item.itemId){
                R.id.phone->{
                    Toast.makeText(this,"home selectde",Toast.LENGTH_LONG).show()
                    true
                }R.id.phone->{
                Toast.makeText(this,"home selectde",Toast.LENGTH_LONG).show()
                true
                }R.id.home->{
                Toast.makeText(this,"home selectde",Toast.LENGTH_LONG).show()
                true
            }
            else->false
            }

        }

    }
      override   fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menuitem,menu)
            return super.onCreateOptionsMenu(menu)
        }















        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when(item.itemId){
                R.id.about->{
                    Toast.makeText(this,"abut selected",Toast.LENGTH_LONG).show()
                }

                R.id.home->{
                    Toast.makeText(this,"home selectde",Toast.LENGTH_LONG).show()
                }

                R.id.more->{
                    Toast.makeText(this,"more selectde",Toast.LENGTH_LONG).show()
                }

                R.id.phone->{
                    Toast.makeText(this,"phone selectde",Toast.LENGTH_LONG).show()
                }

                R.id.setting->{
                    Toast.makeText(this,"setting selectde",Toast.LENGTH_LONG).show()
                }

            }
            return true
        }

    }

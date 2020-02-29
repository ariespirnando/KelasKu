package com.app.elearning.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.app.elearning.R
import com.app.elearning.akun.AkunFragment
import com.app.elearning.chat.ChatFragment
import com.app.elearning.history.HistoryFragment
import kotlinx.android.synthetic.main.activity_home_screen.*

class HomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        val fragmentHome = HomeFragment()
        val fragmentChat = ChatFragment()
        val fragmentAkun = AkunFragment()
        val fragmentHistory = HistoryFragment()
        setFragment(fragmentHome)

        //Mengubah warna icon ketika di click
        lnacount.setOnClickListener {
            setFragment(fragmentAkun)
            changeIcon(btmenuacount, R.drawable.set_ic_on)
            changeIcon(btmenuchat, R.drawable.chat_ic)
            changeIcon(btmenuhistory, R.drawable.task_ic)
            changeIcon(btmenuhome, R.drawable.home_ic)
        }
        lnchat.setOnClickListener {
            setFragment(fragmentChat)
            changeIcon(btmenuchat, R.drawable.chat_ic_on)
            changeIcon(btmenuacount, R.drawable.set_ic)
            changeIcon(btmenuhistory, R.drawable.task_ic)
            changeIcon(btmenuhome, R.drawable.home_ic)
        }
        lnhistory.setOnClickListener {
            setFragment(fragmentHistory)
            changeIcon(btmenuhistory, R.drawable.task_ic_on)
            changeIcon(btmenuacount, R.drawable.set_ic)
            changeIcon(btmenuchat, R.drawable.chat_ic)
            changeIcon(btmenuhome, R.drawable.home_ic)
        }
        lnhome.setOnClickListener {
            setFragment(fragmentHome)
            changeIcon(btmenuhome, R.drawable.home_ic_on)
            changeIcon(btmenuhistory, R.drawable.task_ic)
            changeIcon(btmenuacount, R.drawable.set_ic)
            changeIcon(btmenuchat, R.drawable.chat_ic)
        }
    }

    //fungsi change icon
    private fun changeIcon(imageView: ImageView, int: Int){
        imageView.setImageResource(int)
    }
    //Ganti Fragment
    private fun setFragment(frg: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayoutMenu,frg)
        fragmentTransaction.commit()
    }
}

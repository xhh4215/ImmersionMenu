package com.project.immersionmenu
import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //获取当前的界面
        val decor = window.decorView
        //设置当前界面的ui属性
//        val option = View.SYSTEM_UI_FLAG_FULLSCREEN
        /***
         * 在kotlin中实现按位运算符是通过中缀表达式的方式实现的
         *  shl() 有符号左移
         *  shr() 有符号右移
         *  and() 位与
         *  or()  位或
         *  xor() 位异或
         *  inv() 位非
         */
//        val option = View.SYSTEM_UI_FLAG_FULLSCREEN and (View.SYSTEM_UI_FLAG_LAYOUT_STABLE)
//        val option = View.SYSTEM_UI_FLAG_FULLSCREEN and (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
//        decor.systemUiVisibility = option
//        window.setStatusBarColor(Color.TRANSPARENT)
        //设置actionbar的可见行
//        val actionbar = supportActionBar
//        actionbar?.hide()

    }

    /***
     * 加入以上的逻辑就是实现沉浸式菜单的方法
     */
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
    }

    /**
     * 隐藏虚拟按键，并且设置成全屏
     */

      fun   hideBottomUIMenu(){
        if(Build.VERSION.SDK_INT>=19){
            val decorview = window.decorView
            val uiOPtion = View.SYSTEM_UI_FLAG_LAYOUT_STABLE and (View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION) and (View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)and(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION) and(View.SYSTEM_UI_FLAG_FULLSCREEN)and (View.SYSTEM_UI_FLAG_IMMERSIVE)
             decorview.systemUiVisibility = uiOPtion
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
        }
    }
}

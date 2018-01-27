package card.work.mis.osama.app.testlistview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var users = ArrayList<Users>()

        users.add(Users("osama", "student", R.mipmap.ic_launcher))
        users.add(Users("ahmed", "uigyu", R.mipmap.ic_launcher))
        users.add(Users("omar", "ghgj", R.mipmap.ic_launcher))
        users.add(Users("ali", "hjhgf", R.mipmap.ic_launcher))

        list.adapter = ListAdapter(this, users)

           list.setOnItemClickListener{ _, _, p, _ ->

               var userpos = users[p]

               var intent = Intent(this, MainActivity::class.java)

                intent.putExtra("name", userpos.name)
               startActivity(intent)

           }
    }
}

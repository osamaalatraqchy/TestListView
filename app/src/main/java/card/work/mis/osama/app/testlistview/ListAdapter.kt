package card.work.mis.osama.app.testlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class ListAdapter(context: Context, users:ArrayList<Users>) : ArrayAdapter<Users>(context, 0, users) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var v = convertView

        if(v == null){
            v = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }

        var currentuser = getItem(position)

        var name = v!!.findViewById<TextView>(R.id.name)
        var job = v.findViewById<TextView>(R.id.job)
        var img = v.findViewById<ImageView>(R.id.img)

        name.text = currentuser.name
        job.text = currentuser.job
        img.setImageResource(currentuser.img)

        return v

    }

}
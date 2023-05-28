package au.edu.cqu.propertywatch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PropertyListFragment : Fragment() {

    companion object {
        fun newInstance() = PropertyListFragment()
    }

    val propertyArray: ArrayList<Property> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        propertyArray.add(Property( address="149-153 Bunda Street, Cairns",
            price=200000, phone="0403404111",
            lat=-16.928893272553427, lon=145.77021565990813))
        propertyArray.add(Property( address="197 Draper Street, Cairns",
            price=350000, phone="0403404222",
            lat=-16.928893272553427, lon=145.77021565990813))
        propertyArray.add(Property( address="198 Grafton Street, Cairns",
            price=800000, phone="0403404333",
            lat=-16.916479904985984, lon=145.76987256094102))
        propertyArray.add(Property( address="3 Cominos Place, Cairns",
            price=550000, phone="0403404444", lat=-16.922791, lon=145.745504))
        propertyArray.add(Property( address="6 McGuigan Street, Earlville",
            price=400000, phone="0403404555",
            lat=-16.945571, lon=145.741207))
        propertyArray.add(Property( address="6-8 Quigley Street, Manunda",
            price=455000, phone="0403404666",
            lat=-16.929026, lon=145.762279))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        val recyclerView = inflater.inflate(R.layout.property_list_fragment, container, false) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)

        recyclerView.adapter = PropertyAdapter(propertyArray)
        return recyclerView
    }
}

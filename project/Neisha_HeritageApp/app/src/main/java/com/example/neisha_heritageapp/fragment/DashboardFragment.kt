package com.example.neisha_heritageapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.neisha_heritageapp.Country
import com.example.neisha_heritageapp.CountryAdapter
import com.example.neisha_heritageapp.R
import kotlinx.android.synthetic.main.fragment_dashboard.*


class DashboardFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var countryList: ArrayList<Country>
    private lateinit var countryAdapter: CountryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL,false)

        countryList = ArrayList()

        countryList.add(Country(R.drawable.hava_mahal , "Hava Mahal" , "The Hawa Mahal is a palace in the city of Jaipur,India.Built from red and pink sandstone, it is on the edge of the City Palace, Jaipur.The structure was built in 1799 by the Maharaja Sawai Pratap Singh,grandson of King Sawai Jai Singh,the founder of the city of Jaipur,India.He was so inspired by the unique structure."))
        countryList.add(Country(R.drawable.taj_mahal , "Taj Mahal", "The Taj Mahal is an Islamic ivory-white marble mausoleum on the right bank of the river Yamuna in the Indian city of Agra. It was commissioned in 1631 by the Mughal emperor Shah Jahan (r. 1628–1658) to house the tomb of his favourite wife, Mumtaz Mahal. it also houses the tomb of Shah Jahan himself."))
        countryList.add(Country(R.drawable.sun_temple ,"Sun Temple", "The Sun Temple,Modhera is a Hindu temple dedicated to the solar deity Surya located at Modhera village of Mehsana district, Gujarat, India. It is situated on the bank of the river Pushpavati. It was built after 1026-27 CE during the reign of Bhima I of the Chaulukya dynasty.It is the famous tourist sites."))
        countryList.add(Country(R.drawable.chittoegarh_fort ,"Chittorgarh Fort", "The Chittorgarh (literally Chittor Fort),also known as Chittod Fort, is one of the largest forts in India. It is a UNESCO World Heritage Site. The fort was the capital of Mewar and is located in the present-day city of Chittorgarh. It sprawls over a hill 180 m in height.The fort covers 65 historic structures."))
        countryList.add(Country(R.drawable.qutub_minar , "Qutub Minar", "The Qutb Minar, also spelled Qutub Minar and Qutab Minar, is a minaret and 'victory tower' that forms part of the Qutb complex, which lies at the site of Delhi’s oldest fortified city, Lal Kot, founded by the Tomar Rajputs.It is a World Heritage Site in the Mehrauli area of South Delhi, India.It is one of the most visited tourist."))
        countryList.add(Country(R.drawable.lal_killa ,"Red Fort", "The Red Fort or Lal Qila is a historic fort in Old Delhi,Delhi in India that served as the main residence of the Mughal Emperors. Emperor Shah Jahan commissioned construction of the Red Fort on 12 May 1638, when he decided to shift his capital from Agra to Delhi. Originally red and white."))
        countryList.add(Country(R.drawable.chhatrapati_terminus ,"Chhatrapati Shivaji Terminus" ,"Chhatrapati Shivaji Terminus , Chhatrapati Shivaji Maharaj Terminus commonly known by the former name Victoria Terminus, Bombay stationThe terminus was designed by British architectural engineer Frederick William Stevens."))
        countryList.add(Country(R.drawable.agra_fort ,"Agra Fort", "Agra fort is a historical fort in the city of Agra in India also known as red fort. It was built during 1565-1573 for Mughal Emperor Akbar. It was the main residence of the rulers of Sikarwar clan of Rajputs until mughals occupied it and Mughal Dynasty until 1638, when the capital was shifted from Agra to Delhi."))
        countryList.add(Country(R.drawable.ellora_caves ,"Ellora Caves", "Ellora is a UNESCO World Heritage Site located in the Aurangabad district of Maharashtra, India. It is one of the largest rock-cut Hindu temple cave complexes in the world, with artwork dating from the period 600–1000 CE.Cave 16 features the largest single monolithic rock excavation in the world."))
        countryList.add(Country(R.drawable.mahabalipuram ,"MahaBaliPuram", "Mamallapuram, also known as Mahabalipuram, is a town in Chengalpattu district in the southeastern Indian state of Tamil Nadu, best known for the UNESCO World Heritage Site of 7th- and 8th-century Hindu Group of Monuments at Mahabalipuram. It is one of the famous tourist sites."))
        countryList.add(Country(R.drawable.humayun_tomb ,"Humayun Tomb", "Humayun's tomb (Persian: Maqbara-i Humayun) is the tomb of the Mughal Emperor Humayun in Delhi, India.The tomb was commissioned by Humayun's first wife and chief consort, Empress Bega Begum under her patronage in 1558, and designed by Mirak Mirza Ghiyas and his son, Sayyid Muhammad."))
        countryList.add(Country(R.drawable.fatehpur_sikri ,"Fatehpur Sikri", "Fatehpur Sikri is a town in the Agra District of Uttar Pradesh, India. Situated 35.7 kilometres from the district headquarters of Agra,Fatehpur Sikri itself was founded as the capital of Mughal Empire in 1571 by Emperor Akbar, serving this role from 1571 to 1585.It is the famous tourist sites."))
        countryList.add(Country(R.drawable.statue_of_unity_sardar_patel ,"Statue Of Unity", "The Statue of Unity is the world's tallest statue, with a height of 182 metres (597 feet),located near Kevadia in the state of Gujarat, India. It depicts Indian statesman and independence activist Vallabhbhai Patel (1875–1950), who was the first deputy prime minister and home minister."))
        countryList.add(Country(R.drawable.lotus_temple,"Lotus Temple", "The Lotus Temple, located in Delhi, India, is a Baháʼí House of Worship that was dedicated in December 1986. Notable for its flowerlike shape, it has become a prominent attraction in the city. Like all other Bahá’í Houses of Worship, the Lotus Temple is open to all, regardless of religion or any other qualification."))

        countryAdapter = CountryAdapter(countryList)
        recyclerView.adapter = countryAdapter


    }

}


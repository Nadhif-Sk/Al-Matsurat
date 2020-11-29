package com.example.almatsurot

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AdapterPetang(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val sore = listOf(
        AlfatihaFragment(),
        AwalAlbaqoroh(),
        AyatKursi(),
        LanjutanayatKursi(),
        AkhirAlbaqoroh(),
        AlikhlasFragment(),
        AlfalaqFragment(),
        AnnasFragment(), Doasore1Fragment(), Doasore2Fragment(), Doasore3Fragment(), Doasore4Fragment(),
        DoapujianFragment(),
        DoatasbihFragment(),
        DoaperlindunganFragment(),
        DoakeraguanFragment(),
        DoakesehatanFragment(),
        SayyidulistighfarFragment(),
        Istighfar1Fragment(),
        Sholawat1Fragment(),
        DzikirtasbihFragment(), DzikirtahlilFragment(), Sholawat2Fragment(), Doarobithoh1Fragment(),
        RobithohsoreFragment(), Doarobithoh2Fragment()
    )

    override fun getItem(position: Int): Fragment {
        return sore[position]
    }

    override fun getCount(): Int {
        return sore.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Tab 1"
            1 -> "Tab 2"
            else -> "Tab 3"
        }
    }
}
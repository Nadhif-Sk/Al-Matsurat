package com.example.almatsurot

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class DoaAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {

    private val pages = listOf(
        AlfatihaFragment(),
        AwalAlbaqoroh(),
        AyatKursi(),
        LanjutanayatKursi(),
        AkhirAlbaqoroh(),
        AlikhlasFragment(),
        AlfalaqFragment(),
        AnnasFragment(),
        Doapagi1Fragment(),
        Doapagi2Fragment(),
        Doapagi3Fragment(),
        Doapagi4Fragment(),
        DoapujianFragment(),
        DoatasbihFragment(),
        DoaperlindunganFragment(),
        DoakeraguanFragment(),
        DoakesehatanFragment(),
        SayyidulistighfarFragment(),
        Istighfar1Fragment(),
        Sholawat1Fragment(),
        DzikirtasbihFragment(), DzikirtahlilFragment(), Sholawat2Fragment(), Doarobithoh1Fragment(),
        RobithohpagiFragment(), Doarobithoh2Fragment()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "First Tab"
            1 -> "Secound Tab"
            else -> "Third Tab"
        }
    }
}
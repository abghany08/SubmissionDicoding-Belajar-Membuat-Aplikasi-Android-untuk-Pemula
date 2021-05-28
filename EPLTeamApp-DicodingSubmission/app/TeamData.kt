package com.gna.eplteamapp

object TeamData {
    private val teamNames = arrayOf("Arsenal",
            "Chelsea FC",
            "Everton",
            "Leicester City",
            "Liverpool FC",
            "Manchester City",
            "Manchester United",
            "Southampton FC",
            "Tottenham Hotspur",
            "Wolverhampton Wanderers")

    private val teamDetails = arrayOf("Arsenal didirikan pada 1886 di Woolwich dan pada tahun 1893 menjadi klub pertama dari selatan Inggris untuk bergabung dengan Football League. Pada tahun 1913, hal itu bergerak ke utara melintasi kota Stadion Arsenal di Highbury. Pada 1930, klub telah memenangkan lima gelar Liga Championship dan dua Piala FA.",
            "Chelsea Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris. Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955.",
            "Everton Football Club adalah sebuah klub sepak bola profesional yang bermarkas di Kota Liverpool, Inggris, dan merupakan klub rival dari klub sekota Liverpool. Didirikan pada tahun 1878 dan menjadi salah satu pendiri dari Liga Sepak Bola pada tahun 1888 serta Liga Primer pada tahun 1992.",
            "Leicester City F.C. adalah sebuah tim sepak bola Inggris berbasis di Leicester. Leicester Dikenal juga dengan sebutan The Foxes. Klub ini memainkan pertandingan kandangnya di Stadion King Power yang berkapsitas 32.000 penonton.",
            "Liverpool Football Club (dikenal pula sebagai Liverpool atau The Reds) adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris. Liverpool juga merupakan juara dari Liga Utama Inggris musim 2019–2020. Liverpool telah memenangkan 6 trofi Liga Champions UEFA (dulu Piala Champions) dan merupakan klub dengan pemegang gelar juara Liga Champions UEFA terbanyak di Inggris dan ketiga di Eropa setelah Real Madrid dan AC Milan. Selain itu Liverpool juga pemegang 3 gelar juara Liga Eropa UEFA dan 4 gelar Piala Super UEFA. Di kompetisi domestik, Liverpool adalah klub dengan 19 gelar juara Liga Inggris, 7 Piala FA, serta 8 kali juara Piala Liga. Liverpool didirikan pada tahun 1892 dan bergabung dengan Football League pada tahun berikutnya. Klub ini telah bermain di Stadion Anfield sejak pembentukannya yang terletak sekitar 4,8 km dari pusat kota Liverpool.",
            "Manchester City Football Club adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakaan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester. Pertandingan pertama dimainkan pada bulan November 1880.",
            "Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910. Manchester United telah memenangkan banyak trofi di sepak bola Inggris, termasuk rekor 20 gelar Liga, 12 Piala FA, empat Piala Liga dan rekor 21 FA Community Shield. Klub ini juga telah memenangkan tiga Piala Eropa, satu Piala UEFA, satu Piala Winners UEFA, satu Piala Super UEFA, satu Piala Interkontinental dan satu Piala Dunia Antarklub FIFA. Pada 1998-1999, klub memenangkan treble dari Liga Premier, Piala FA dan Liga Champions, prestasi belum pernah terjadi sebelumnya untuk klub Inggris.",
            "Southampton Football Club (berdiri dengan nama St. Mary's YMA) merupakan sebuah tim sepak bola Inggris yang didirikan tahun 1898. Bermarkas di Stadion St Mary's, Southampton, Hampshire, Southampton pada musim 2011-12 bermain di Football League Championship. Southampton juga dikenal sebagai akademi sepak bola Liverpool.",
            "Tottenham Hotspur Football Club, adalah klub sepak bola yang berasal dari Tottenham, sebuah daerah yang berada di wilayah utara London. Mereka juga dikenal sebagai Spurs, The Spurs dan Tottenham, sementara penggemar mereka memberi mereka nama the Lilywhites karena seragam tradisional mereka yang berwarna putih.",
            "Wolverhampton Wanderers Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Wolverhampton, Britania Raya yang bermain di Liga Utama Inggris. Klub ini memainkan pertandingan kandangnya di Stadion Molineux yang berkapasitas 32,050 penonton. Seragam mereka berwarna cokelat-hitam. Mereka dijuluki Wolves.")

    private val teamImages = intArrayOf(R.drawable.arsenal,
            R.drawable.chelsea,
            R.drawable.everton,
            R.drawable.leicester_city,
            R.drawable.liverpool,
            R.drawable.manchester_city,
            R.drawable.manchester_united,
            R.drawable.southampton,
            R.drawable.tottenham_hotspur,
            R.drawable.wolves)

    val listData: ArrayList<Team>
        get() {
            val list = arrayListOf<Team>()
            for (position in teamNames.indices) {
                val team = Team()
                team.name = teamNames[position]
                team.detail = teamDetails[position]
                team.photo = teamImages[position]
                list.add(team)
            }
            return list
        }
}
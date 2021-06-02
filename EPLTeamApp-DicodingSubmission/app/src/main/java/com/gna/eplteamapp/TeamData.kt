package com.gna.eplteamapp

object TeamData {
    private val teamNames = arrayOf("Arsenal",
            "Aston Villa FC",
            "Brighton & Hove Albion",
            "Burnley FC",
            "Chelsea FC",
            "Crystal Palace",
            "Everton",
            "Fulham FC",
            "Leeds United",
            "Leicester City",
            "Liverpool FC",
            "Manchester City",
            "Manchester United",
            "Newcastle United",
            "Sheffield United",
            "Southampton FC",
            "Tottenham Hotspur",
            "West Bromwich Albion",
            "West Ham United",
            "Wolverhampton Wanderers")

    private val teamDetails = arrayOf("Arsenal didirikan pada 1886 di Woolwich dan pada tahun 1893 menjadi klub pertama dari selatan Inggris untuk bergabung dengan Football League. Pada tahun 1913, hal itu bergerak ke utara melintasi kota Stadion Arsenal di Highbury. Pada 1930, klub telah memenangkan lima gelar Liga Championship dan dua Piala FA.",
            "Aston Villa Football Club juga dikenal sebagai Villa, The Villa, The Villans dan The Lions adalah klub sepak bola profesional yang bermarkas di Villa Park, Birmingham, Inggris. Klub ini bermain di Liga Utama Inggris dan merupakan salah satu klub pendiri Liga Sepak Bola (Football League) pada tahun 1888 serta Liga Utama Inggris pada tahun 1992. Aston Villa merupakan salah satu klub tertua dan tersukses Inggris.",
            "Brighton & Hove Albion Football Club adalah sebuah klub sepak bola profesional asal Inggris yang berbasis di kota pantai Brighton & Hove, di timur Sussex. Sering disebut sebagai Brighton & Hove Albion atau hanya sekadar sebagai Brighton. Tim ini dijuluki Seagulls (bahasa Indonesia: camar) atau Albion. Secara historis kostum klub adalah garis-garis biru dan putih, meskipun pernah diubah sebentar menjadi putih semua pada tahun 1970-an, dan menjadi biru polos pada tahun 1980-an pada masa kejayaan klub. Crystal Palace dianggap sebagai klub rivalnya, meskipun berada 40 mil jauhnya.",
            "Burnley Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Burnley, Lancashire. Klub ini sedang bermain di Liga Utama Inggris, kasta tertinggi sepak bola inggris di musim 2016-17 setelah memenangkan liga peringkat kedua yaitu Liga Championship Inggris di musim sebelumnya. Klub ini memainkan pertandingan kandangnya di stadion Turf Moor yang berkapasitas 22.546 penonton. Seragam mereka adalah berwarna nila, sehingga mereka dijuluki Clarets. Klub ini adalah salah satu anggota penemu English Football League pada tahun 1888. Burnley pernah dua kali menjadi juara Liga Inggris Divisi Pertama, di musim 1920–21 dan 1959–60, pernah memenangkan Piala FA sekali, pada tahun 1914, dan pernah memenangkan Community Shield dua kali, di 1960 dan 1973.",
            "Chelsea Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris. Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955.",
            "Crystal Palace Football Club merupakan sebuah tim sepak bola Inggris yang bermarkas di London Borough of Croydon dan didirikan pada tahun 1905. Klub ini memainkan pertandingan kandangnya di Selhurst Park yang berkapasitas 26.309 penonton. Seragam mereka berwarna merah-biru. Musim 2012-13 klub ini bermain di Liga Championship Inggris. Mulai musim 2013-14, klub akan bermain di Liga Utama Inggris setelah mendapatkan promosi karena menjadi juara dalam pertandingan final play-off Liga Championship Inggris, dengan mengalahkan Watford yang berlangsung di Stadion Wembley.",
            "Everton Football Club adalah sebuah klub sepak bola profesional yang bermarkas di Kota Liverpool, Inggris, dan merupakan klub rival dari klub sekota Liverpool. Didirikan pada tahun 1878 dan menjadi salah satu pendiri dari Liga Sepak Bola pada tahun 1888 serta Liga Primer pada tahun 1992.",
            "Fulham Football Club adalah sebuah klub sepak bola Inggris yang didirikan pada tahun 1879. Klub ini bermarkas di daerah Fulham, London dan berkompetisi di Liga Utama Inggris. Fulham memainkan pertandingan kandangnya di Stadion Craven Cottage yang berkapasitas 25.700 kursi penonton dan saat ini sedang diperbesar sehingga akan berkapasitas 30.500 orang. Seragam mereka berwarna hitam-putih. Prestasi terbaik dari klub ini di kancah domestik adalah sebagai finalis pada ajang Piala FA (1975) dan Liga Eropa UEFA (2010), posisi ke-7 pada Liga Premier Inggris musim 2008-09, dan babak perempat-final di Piala Liga. Sementara prestasi terbaik tim ini di kancah persepak bolaan Eropa adalah menjadi juara pada Piala Intertoto (bersama Málaga CF dan VfB Stuttgart), dan menjadi runner-up Piala UEFA musim 2009-2010 setelah dikalahkan Atlético Madrid 2-1 di final.",
            "Leeds United Football Club adalah sebuah klub sepak bola asal Inggris yang berbasis di Beeston, Leeds, West Yorkshire. Pada akhir musim 2019–20, mereka mampu menjadi juara Kejuaraan EFL, sehingga akan promosi ke Liga Utama Inggris pada musim selanjutnya. Sebelumnya mereka telah menghabiskan sebagian besar sejarah mereka di tingkat atas sepak bola Inggris yaitu Liga Utama Inggris. Klub ini dibentuk pada tahun 1919 menyusul pembubaran tim pendahulunya Leeds City FC oleh The Football League. Stadion mereka adalah Elland Road yang mempunyai kapasitas 39.460 kursi, yang telah mereka gunakan sejak pendirian mereka setelah mengambil alih dari Leeds City.",
            "Leicester City F.C. adalah sebuah tim sepak bola Inggris berbasis di Leicester. Leicester Dikenal juga dengan sebutan The Foxes. Klub ini memainkan pertandingan kandangnya di Stadion King Power yang berkapsitas 32.000 penonton.",
            "Liverpool Football Club (dikenal pula sebagai Liverpool atau The Reds) adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris. Liverpool juga merupakan juara dari Liga Utama Inggris musim 2019–2020. Liverpool telah memenangkan 6 trofi Liga Champions UEFA (dulu Piala Champions) dan merupakan klub dengan pemegang gelar juara Liga Champions UEFA terbanyak di Inggris dan ketiga di Eropa setelah Real Madrid dan AC Milan. Selain itu Liverpool juga pemegang 3 gelar juara Liga Eropa UEFA dan 4 gelar Piala Super UEFA. Di kompetisi domestik, Liverpool adalah klub dengan 19 gelar juara Liga Inggris, 7 Piala FA, serta 8 kali juara Piala Liga. Liverpool didirikan pada tahun 1892 dan bergabung dengan Football League pada tahun berikutnya. Klub ini telah bermain di Stadion Anfield sejak pembentukannya yang terletak sekitar 4,8 km dari pusat kota Liverpool.",
            "Manchester City Football Club adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakaan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester. Pertandingan pertama dimainkan pada bulan November 1880.",
            "Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910. Manchester United telah memenangkan banyak trofi di sepak bola Inggris, termasuk rekor 20 gelar Liga, 12 Piala FA, empat Piala Liga dan rekor 21 FA Community Shield. Klub ini juga telah memenangkan tiga Piala Eropa, satu Piala UEFA, satu Piala Winners UEFA, satu Piala Super UEFA, satu Piala Interkontinental dan satu Piala Dunia Antarklub FIFA. Pada 1998-1999, klub memenangkan treble dari Liga Premier, Piala FA dan Liga Champions, prestasi belum pernah terjadi sebelumnya untuk klub Inggris.",
            "Newcastle United Football Club adalah klub sepak bola profesional Inggris yang berbasis di Newcastle upon Tyne, dan bermain di Liga Utama Inggris, kompetisi tingkat teratas dalam sepak bola Inggris. Newcastle United didirikan pada tahun 1892 sebagai hasil penggabungan Newcastle East End dan Newcastle West End, dan bermain di kandangnya saat ini, St James' Park, sejak saat itu. Stadion tersebut dikembangkan menjadi stadion all-seater pada pertengahan 1990-an dan memiliki kapasitas 52.354.",
            "Sheffield United Football Club adalah sebuah tim sepak bola profesional Inggris yang bermarkas di kota Sheffield, Yorkshire Selatan, Inggris. Tim ini dibentuk tahun 1889. Saat ini klub Sheffield United bermain di Liga Utama Inggris, kompetisi tingkat ke-1 dalam sistem liga sepak bola Inggris. Mereka adalah tim olahraga pertama yang menggunakan nama 'United' dan dijuluki The Blades, berkat reputasi kota Sheffield yang mendunia untuk produksi baja. Klub ini memainkan pertandingan kandangnya di Bramall Lane yang berkapasitas 33.000 penonton, stadion utama tertua di dunia dan masih menjadi tempat pertandingan sepak bola.",
            "Southampton Football Club (berdiri dengan nama St. Mary's YMA) merupakan sebuah tim sepak bola Inggris yang didirikan tahun 1898. Bermarkas di Stadion St Mary's, Southampton, Hampshire, Southampton pada musim 2011-12 bermain di Football League Championship. Southampton juga dikenal sebagai akademi sepak bola Liverpool.",
            "Tottenham Hotspur Football Club, adalah klub sepak bola yang berasal dari Tottenham, sebuah daerah yang berada di wilayah utara London. Mereka juga dikenal sebagai Spurs, The Spurs dan Tottenham, sementara penggemar mereka memberi mereka nama the Lilywhites karena seragam tradisional mereka yang berwarna putih.",
            "West Bromwich Albion Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di West Bromwich, West Midlands. Didirikan pada tahun 1878. Sejak tahun 1900, klub ini memainkan pertandingan kandangnya di Stadion The Hawthorns yang berkapasitas 26.484 penonton. Seragam mereka adalah biru-putih sehingga mereka dijuluki The Baggies.",
            "West Ham United Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di London. Sejak 2016, klub ini memainkan pertandingan kandangnya di London Stadium yang berkapasitas 80.000 kursi. Sebelumnya Hammers bermain di Boleyn Ground. Seragam mereka berwarna merah-biru. West Ham berawal dari Thames Ironworks FC. Nama yang sekarang telah sejak 5 Juli 1900 yang dipakai hingga sekarang. Saat ini West Ham United memankan pertandingan kandangnya di London Stadium. Stadion ini sebelumnya dipakai untuk Olimpiade London 2012.",
            "Wolverhampton Wanderers Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Wolverhampton, Britania Raya yang bermain di Liga Utama Inggris. Klub ini memainkan pertandingan kandangnya di Stadion Molineux yang berkapasitas 32,050 penonton. Seragam mereka berwarna cokelat-hitam. Mereka dijuluki Wolves.")

    private val teamImages = intArrayOf(R.drawable.arsenal,
            R.drawable.aston_villa,
            R.drawable.brighton,
            R.drawable.burnley,
            R.drawable.chelsea,
            R.drawable.crystal_palace,
            R.drawable.everton,
            R.drawable.fulham,
            R.drawable.leeds_united,
            R.drawable.leicester_city,
            R.drawable.liverpool,
            R.drawable.manchester_city,
            R.drawable.manchester_united,
            R.drawable.newcastle_united,
            R.drawable.sheffield_united,
            R.drawable.southampton,
            R.drawable.tottenham_hotspur,
            R.drawable.west_bromwich,
            R.drawable.west_ham,
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
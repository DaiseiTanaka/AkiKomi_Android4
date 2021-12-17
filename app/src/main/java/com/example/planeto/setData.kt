package com.example.planeto

object setData {
    fun SetPlanets():List<PlanetData>{
        var Planetlist= mutableListOf<PlanetData>()
        Planetlist.add(
            PlanetData(
                1,
                "Library",
                "South Building",
                "4th",
                "70",
                "This is the library on the 4th floor of the South Building. The library is divided into two levels. There are two projectors on the first floor and various types of tables and chairs. On the first floor you are allowed to work on tasks while talking to your friends. On the 2nd floor, there are many engineering books and you can borrow them freely if you have a student ID card. However, talking is prohibited on the 2nd floor.",
                "topic_slibrary"
            )
        )
        Planetlist.add(
            PlanetData(
                2,
                "Learning Commons1",
                "South Building",
                "2nd",
                "108",
                "There are in total of four Learning Commons in this South Building. There are desks and chairs that can be used freely by students. This is the place that is designed for interaction with students from other grades and also graduate students. You can also use the air conditioner and whiteboard freely for meetings and self-study.",
                "topic_lc1"
            )
        )
        Planetlist.add(
            PlanetData(
                3,
                "Learning Commons2",
                "South Building",
                "2nd",
                "82",
                "There are in total of four Learning Commons in this South Building. There are desks and chairs that can be used freely by students. This is the place that is designed for interaction with students from other grades and also graduate students. You can also use the air conditioner and whiteboard freely for meetings and self-study.",
                "topic_lc2"
            )
        )
        Planetlist.add(
            PlanetData(
                4,
                "Learning Commons3",
                "South Building",
                "3rd",
                "59",
                "There are in total of four Learning Commons in this South Building. There are desks and chairs that can be used freely by students. This is the place that is designed for interaction with students from other grades and also graduate students. You can also use the air conditioner and whiteboard freely for meetings and self-study.",
                "topic_lc3"
            )
        )
        Planetlist.add(
            PlanetData(
                5,
                "Learning Commons4",
                "South Building",
                "4th",
                "116",
                "There are in total of four Learning Commons in this South Building. There are desks and chairs that can be used freely by students. This is the place that is designed for interaction with students from other grades and also graduate students. You can also use the air conditioner and whiteboard freely for meetings and self-study.",
                "topic_lc4"
            )
        )
        Planetlist.add(
            PlanetData(
                6,
                "S306",
                "South Building",
                "3rd",
                "216",
                "This room is usually used for students in the Faculty of Engineering. There are 3 screens so you can take the same lesson simultaneoulsy as the next room. After school, students are free to remain and study by themselves. The seats are not fixed and each student sits freely every morning. You are allowed to use airconditioner and adjust the temperature.",
                "topic_s306"
            )
        )
        Planetlist.add(
            PlanetData(
                7,
                "S307",
                "South Building",
                "3rd",
                "216",
                "This room is usually used for students in the Faculty of Engineering. There are 3 screens so you can take the same lesson simultaneoulsy as the next room. After school, students are free to remain and study by themselves. The seats are not fixed and each student sits freely every morning. You are allowed to use airconditioner and adjust the temperature.",
                "topic_s307"
            )
        )
        Planetlist.add(
            PlanetData(
                8,
                "S311",
                "South Building",
                "3rd",
                "108",
                "This room is usually used for students in the Faculty of Engineering. There are 3 screens so you can take the same lesson simultaneoulsy as the next room. After school, students are free to remain and study by themselves. The seats are not fixed and each student sits freely every morning. You are allowed to use airconditioner and adjust the temperature.",
                "topic_s311"
            )
        )
        Planetlist.add(
            PlanetData(
                9,
                "S312",
                "South Building",
                "3rd",
                "108",
                "This room is usually used for students in the Faculty of Engineering. There are 3 screens so you can take the same lesson simultaneoulsy as the next room. After school, students are free to remain and study by themselves. The seats are not fixed and each student sits freely every morning. You are allowed to use airconditioner and adjust the temperature.",
                "topic_s312"
            )
        )
        Planetlist.add(
            PlanetData(
                10,
                "Advanced Hall",
                "South Building",
                "1st",
                "168",
                "This room can be freely used by students and faculty members. Many people have lunch during lunch break and use this room as a study room after school. There are many desks and chairs that can be used freely. At the beginning of each semester, this room is used as medical examinations and selling textbooks. In addition, there are two large windows, from which you can overlook the garden, creating a space with a sense of openness.",
                "topic_advanced"
            )
        )
        Planetlist.add(
            PlanetData(
                11,
                "Sagano Hall",
                "South Building",
                "1st",
                "360",
                "This is a hall where meetings such as events and orientations are held. Since one of the wall is made of window glass, you can overlook the courtyard and feel a sense of openness. Additionaly, this hall is the largest hall in the South Building and can accommodate up to 360 people. Also, if the chairs and desks are removed, more than 500 people can enter the room.",
                "topic_sagano"
            )
        )
        Planetlist.add(
            PlanetData(
                12,
                "Science Praza",
                "South Building",
                "1st",
                "40",
                "Many of the latest machines and 3D printers are installed in this machine workshop. Some experiments and classes dealing with machines are conducted in this room. This workshop holds an annual 3D printer competition. In addition, the 3D printer in this workshop can be used by anyone who has permission to it. Also it is used for many cornerstone projects. To use this workshop, you need to attend the workshop orientation. If you are curious, please contact the student center or the teacher at the workshop.",
                "topic_mws"
            )
        )
        Planetlist.add(
            PlanetData(
                13,
                "Electronic Workshop",
                "South Building",
                "4th",
                "25",
                "This electronic workshop is equipped with many of the latest equipment. It can be used to conducts experiments and classes related to electricity. In addition, the walls on the south and north sides are all covered with glass, creating a very open space. In addition, you can go directly to Learning Commons from this electronic workshop where you can have meals and meetings. It is shared by several Cornerstone projects and used by many project members after school as well as holidays.",
                "topic_ews"
            )
        )
        return Planetlist
    }
}
package com.example.android.ebay

import com.example.android.ebay.models.BlogPost

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            val add = list.add(
                BlogPost(
                    "DUNFGEONS & DRAGONS",
                    "This is a fantasy role-playing game",
                    "https://github.com/huangwei0/ebay_image/blob/master/dungeons%26dragons.png",
                    "@Wizards_DnD"
                )
            )
            list.add(
                BlogPost(
                    "Polygon",
                    "15 tabletop gaming you should know ",
                    "https://github.com/huangwei0/ebay_image/blob/master/polygon.png",
                    "Will Williams"
                )
            )

            list.add(
                BlogPost(
                    "Tabletop RPGs",
                    "Twitch",
                    "https://github.com/huangwei0/ebay_image/blob/master/tabletop.png",
                    "RPG"
                )
            )
            list.add(
                BlogPost(
                    "Freelance Android Developer (Vasiliy Zukanov)",
                    "Vasiliy has been a freelance android developer for several years. He also has some of the best android development courses I've had the pleasure of taking on Udemy.com.",
                    "https://github.com/huangwei0/ebay_image/blob/master/dicebreaker.png",
                    "Steven"
                )
            )
            list.add(
                BlogPost(
                    "Youtube",
                    "Game video",
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/freelance_android_dev_donn_felker.png",
                    "Dicebreaker"
                )
            )
            list.add(
                BlogPost(
                    "Work Life Balance for Software Developers",
                    "What kind of hobbies do software developers have? It sounds like many software developers don't have a lot of hobbies and choose to focus on work. Is that a good idea?",
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/work_life_balance.png",
                    "Jessica"
                )
            )
            list.add(
                BlogPost(
                    "Full Stack Web Developer - Nicholas Olsen",
                    "In this podcast I interviewed the Fullsnack Developer (AKA Nicholas Olsen).\\r\\n\\r\\nNicholas is many things. What I mean by that is, he's good at many things.\\r\\n\\r\\n1. He’s an entrepreneur\\r\\n\\r\\n2. Web developer\\r\\n\\r\\n3. Artist\\r\\n\\r\\n4. Graphic designer\\r\\n\\r\\n5. Musician (drums)\\r\\n\\r\\n6. Professional BodyBuilder.",
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/fullsnack_developer.png",
                    "Guy"
                )
            )
            list.add(
                BlogPost(
                    "Javascript Expert - Wes Bos",
                    "Interviewing a web developer, javascript expert, entrepreneur, freelancer, podcaster, and much more.",
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/javascript_expert_wes_bos.png",
                    "Ruby"
                )
            )
            list.add(
                BlogPost(
                    "Senior Android Engineer - Kaushik Gopal",
                    "Kaushik Gopal is a Senior Android Engineer working in Silicon Valley.\r\n\r\nHe works as a Senior Staff engineer at Instacart.\r\n\r\nInstacart: https://www.instacart.com/",
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/senior_android_engineer_kaushik_gopal.png",
                    "mitch"
                )
            )
            return list
        }
    }
}


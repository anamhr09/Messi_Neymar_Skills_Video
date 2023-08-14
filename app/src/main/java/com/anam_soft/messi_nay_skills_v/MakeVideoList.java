
package com.anam_soft.messi_nay_skills_v;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayListForVideo(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForWebsite(String category_name, Integer drawable, String url){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("url", url);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForPDF(String category_name, Integer drawable, String pdfAssetName){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("pdfAssetName", pdfAssetName);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		/*
		//========================Video Item Category
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("hegsoEcow8Q", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("kLHCDZeTVJk", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		createPlayListForVideo("Funny Dog", R.drawable.category_1);

		//=========================Category for website loader
		createCategoryForWebsite("Prothom Alo", R.drawable.category_2, "https://www.prothomalo.com/");

		//=========================Category for website loader
		createCategoryForWebsite("PDF FromUrl", R.drawable.category_3, "https://drive.google.com/file/d/1vB-oWIwJU6KuIKnIoqWukjZEyNjrd7IJ/view?usp=sharing");

		//===========================Category for PDF Viewer
		createCategoryForPDF("PDF FromAsset", R.drawable.category_4, "my_sample_pdf.pdf");
		//==========================================================================*
		 */


		//========================Video Item Category

		addVideoItem("mXjW78AgGu4", "100 BEST SKILL MOVES", "Learn Football Skills By Watching Videos");
		addVideoItem("UXwUQmVLzik", "TOP 5 WAYS to SHOOT ", "Learn Football Skills By Watching Videos");
		addVideoItem("fsi6QrlnzVM", "5 SIMPLE First Touch", "Learn Football Skills By Watching Videos");
		addVideoItem("y7waNmOTAT0", "NUTMEG DEFENDERS ", "Learn Football Skills By Watching Videos");
		addVideoItem("Cv-1oWn3v70", "5 EASY WAYS to NEVER", "Learn Football Skills By Watching Videos");

		addVideoItem("JqxwTcpf07w", "TOP 5 WAYS to PASS", "Learn Football Skills By Watching Videos");
		addVideoItem("Xbs4wHEnFdU", "5 Things EVERY", "Learn Football Skills By Watching Videos");
		addVideoItem("1ReCNvOumbs", "5 BODY FEINTS", "Learn Football Skills By Watching Videos");
		addVideoItem("PagCekTH7XI", "5 BEST CROSSING ", "Learn Football Skills By Watching Videos");
		addVideoItem("Y9Af7MwsSvc", "How to Play Midfield", "Learn Football Skills By Watching Videos");


		addVideoItem("BJJb3-O0Q1U", "LEARN 69 FOOTBALL SKILLS", "Learn Football Skills By Watching Videos");
		addVideoItem("mXjW78AgGu4", "100 BEST SKILL MOVES", "Learn Football Skills By Watching Videos");
		addVideoItem("Txr2YQzsLDU", "Juggling a Soccer", "Learn Football Skills By Watching Videos");
		addVideoItem("UXwUQmVLzik", "TOP 5 WAYS to SHOOT )", "Learn Football Skills By Watching Videos");
		addVideoItem("fsi6QrlnzVM", "5 SIMPLE First Touch)", "Learn Football Skills By Watching Videos");
		addVideoItem("y7waNmOTAT0", "NUTMEG DEFENDERS )", "Learn Football Skills By Watching Videos");
		addVideoItem("Cv-1oWn3v70", "5 EASY WAYS to NEVER)", "Learn Football Skills By Watching Videos");

		addVideoItem("JqxwTcpf07w", "TOP 5 WAYS to PASS", "Learn Football Skills By Watching Videos");
		addVideoItem("Xbs4wHEnFdU", "5 Things EVERY", "Learn Football Skills By Watching Videos");
		addVideoItem("1ReCNvOumbs", "5 BODY FEINTS", "Learn Football Skills By Watching Videos");
		addVideoItem("PagCekTH7XI", "5 BEST CROSSING ", "Learn Football Skills By Watching Videos");
		addVideoItem("Y9Af7MwsSvc", "How to Play Midfield", "Learn Football Skills By Watching Videos");




		addVideoItem("adDby-cuFVU", "WHY Mbappe  FAST", "Learn Football Skills By Watching Videos");
		addVideoItem("vhJV2yiaqsM", "TOP SPEED", "Learn Football Skills By Watching Videos");
		addVideoItem("5id05CXShNo", "improve SPEED", "Learn Football Skills By Watching Videos");
		addVideoItem("cH7c12dp1Cc", "3 beginner skills", "Learn Football Skills By Watching Videos");
		addVideoItem("xliP62TKqIw", "Goalkeeper tutorial", "Learn Football Skills By Watching Videos");

		addVideoItem("iEiJaTCaXlg", "If you can't do skills", "Learn Football Skills By Watching Videos");
		addVideoItem("qcuQBm76x3k", "mpress your coach", "Learn Football Skills By Watching Videos");
		addVideoItem("3Bsa3MZsez4", "defenders FEAR", "Learn Football Skills By Watching Videos");
		addVideoItem("DmInBfaRTH4", "5 mistakes STRIKERS ", "Learn Football Skills By Watching Videos");
		addVideoItem("j88DYhjT49s", "Learn 5 skills", "Learn Football Skills By Watching Videos");



		addVideoItem("yTDy_k3dEgQ", "5 football SECRETS", "Learn Football Skills By Watching Videos");
		addVideoItem("EsoboC2FulQ", "You MUST learn", "Learn Football Skills By Watching Videos");
		addVideoItem("B-U3xM6Fyqg", "Learn 3 OLD BUT GOLD", "Learn Football Skills By Watching Videos");
		addVideoItem("6zUQ7wsmn6Y", " score more goals ", "Learn Football Skills By Watching Videos");
		addVideoItem("ePO3PMxfv1k", "25 dribbling skills", "Learn Football Skills By Watching Videos");

		addVideoItem("yQ7fPaGHcmc", "NEED to LEARN", "Learn Football Skills By Watching Videos");
		addVideoItem("1Ii8G1y-zR8", "Learn 3 SICK skills", "Learn Football Skills By Watching Videos");
		addVideoItem("KqQfrECrgtw", "LEARN 5 pro player's", "Learn Football Skills By Watching Videos");
		addVideoItem("EtTji_RkZnM", "5 useful skills", "Learn Football Skills By Watching Videos");
		addVideoItem("xs71MaLvV0o", "IMPROVE 1v1 dribbling", "Learn Football Skills By Watching Videos");



		addVideoItem("tavdXX_Srcg", " free kick tutorial", "Learn Football Skills By Watching Videos");
		addVideoItem("eH5LTUvU3rc", "5 pro football skills", "Learn Football Skills By Watching Videos");
		addVideoItem("a9Gxnoem_dE", "5 rules that all pros BREAK", "Learn Football Skills By Watching Videos");
		addVideoItem("a5voToLyoMI", "attacker's worst", "Learn Football Skills By Watching Videos");
		addVideoItem("2DQYXApD9Jc", "3 Things to Avoid", "Learn Football Skills By Watching Videos");

		addVideoItem("CDL7lXgyHlQ", "creative passes ", "Learn Football Skills By Watching Videos");
		addVideoItem("CFglzgtgXgc", "Change THIS", "Learn Football Skills By Watching Videos");
		addVideoItem("ixc5_2Dg0ak", "LEARN 5 pro player's", "Learn Football Skills By Watching Videos");
		addVideoItem("ixc5_2Dg0ak", "Learn to score with both", "Learn Football Skills By Watching Videos");


		addVideoItem("bQT3MP5Moq8", "improve your footwork", "Learn Football Skills By Watching Videos");
		addVideoItem("r_tEXmClvKI", "20 Fast Footwork ", "Learn Football Skills By Watching Videos");
		addVideoItem("GRzQk9R8Ekk", "LEARN 5 MESSI SIMPLE", "Learn Football Skills By Watching Videos");
		addVideoItem("0GHFEcxVQvI", "Mastery Workout ", "Learn Football Skills By Watching Videos");
		addVideoItem("4x4J2-IZIRI", "MITOMA 5 AMAZING", "Learn Football Skills By Watching Videos");

		addVideoItem("Gi_X98uM-1A", "change direction 5 skills", "Learn Football Skills By Watching Videos");
		addVideoItem("mXjW78AgGu4", "100 BEST SKILL MOVES", "Learn Football Skills By Watching Videos");
		addVideoItem("H5SMtN6Qa6w", "practice football ALONE", "Learn Football Skills By Watching Videos");
		addVideoItem("geIYxdG0WVQ", "7 Habits that will make You a GREAT ", "Learn Football Skills By Watching Videos");
		addVideoItem("XYRPzIjThfc", "12 AMAZING WAYS to PASS", "Learn Football Skills By Watching Videos");





		createPlayListForVideo("Top Skills", R.drawable.skill);

		//=========================



		//========================Video Item Category


		addVideoItem("TGtACZWU0TQ", "op 10 Skills |HD ", "Learn Football Skills By Watching Videos");
		addVideoItem("9C3NL3DImNg", "Lionel Messi•The", "Learn Football Skills By Watching Videos");
		addVideoItem("wp1ZltRNdJs", "Neymar Jr ●King", "Learn Football Skills By Watching Videos");
		addVideoItem("8MgQPU_HcWo", "Lionel Messi", "Learn Football Skills By Watching Videos");

		addVideoItem("wXt74aPFxb4", "Lionel Messi and Neymar", "Learn Football Skills By Watching Videos");
		addVideoItem("S6p8190CkPk", "Messi & Neymar Jr ● Pure Magic", "Learn Football Skills By Watching Videos");
		addVideoItem("rkijO1DmnKM", "Neymar & Messi Duo -", "Learn Football Skills By Watching Videos");
		addVideoItem("u9OOcnKlbzk", " Neymar Jr 2016 ", "Learn Football Skills By Watching Videos");
		addVideoItem("_cwcueZbYR0", "Dribbling Skills ", "Learn Football Skills By Watching Videos");

		addVideoItem("w8LMuTOLj8c", "Neymar Jr -", "Learn Football Skills By Watching Videos");
		addVideoItem("Peyuaa4pPV0", "Neymar Jr", "Learn Football Skills By Watching Videos");
		addVideoItem("eJNMBXqBal4", "Neymar Jr", "Learn Football Skills By Watching Videos");
		addVideoItem("cV3eplw4SAE", "Paulo Dybala", "Learn Football Skills By Watching Videos");
		addVideoItem("wjvDGarIGCs", "Lionel Messi - Bilionera ", "Learn Football Skills By Watching Videos");

		addVideoItem("7nfchMw0gB0", "Messi Crazy Skills", "Learn Football Skills By Watching Videos");
		addVideoItem("swfseJXHWM4", "Lionel Messi Magic", "Learn Football Skills By Watching Videos");
		addVideoItem("yHOhyAtm5yM", "Lionel Messi ▶Sia -", "Learn Football Skills By Watching Videos");
		addVideoItem("Mgry0b_jLB0", " Messi World Cup", "Learn Football Skills By Watching Videos");
		addVideoItem("C2dneCSzhcc", "Montage ", "Learn Football Skills By Watching Videos");

		addVideoItem("_OpKAGYfkHo", "Ronaldinho Magic ", "Learn Football Skills By Watching Videos");
		addVideoItem("erBZFOwEiyY", " The Legend", "Learn Football Skills By Watching Videos");
		addVideoItem("X6BNOhOMt9U", "RoNaLDinHo !", "Learn Football Skills By Watching Videos");
		addVideoItem("yHFak3p5x90", "Ronaldinho - Vivir ", "Learn Football Skills By Watching Videos");
		addVideoItem("7MOfXZXOKXk", "Ronaldinho ", "Learn Football Skills By Watching Videos");


		addVideoItem("1K-y8-1MCDo", "Vinicius Jr", "Learn Football Skills By Watching Videos");
		addVideoItem("hKOuug4QhhE", "Vinicius Jr", "Learn Football Skills By Watching Videos");
		addVideoItem("SM9Q8ijXW5I", "Antony", "Learn Football Skills By Watching Videos");
		addVideoItem("coa-TEOA2dk", " Neymar Jr.", "Learn Football Skills By Watching Videos");
		addVideoItem("9MIRKqg_F1k", "Neymar Jr ", "Learn Football Skills By Watching Videos");

		addVideoItem("BHA_u_hYOvM", "Parado no", "Learn Football Skills By Watching Videos");
		addVideoItem("whezEvRiUL0", "Neymar JR ", "Learn Football Skills By Watching Videos");
		addVideoItem("fba6eB5nKWM", "Neymar Jr 2023 ", "Learn Football Skills By Watching Videos");
		addVideoItem("gFcKNQ0oetY", "Paulo Dybala ", "Learn Football Skills By Watching Videos");
		addVideoItem("vJT91CX6PjA", "Paulo Dybala", "Learn Football Skills By Watching Videos");


		addVideoItem("leuGjeMJV-k", "Lionel Messi ", "Learn Football Skills By Watching Videos");
		addVideoItem("jZ6yn7qnkaE", "Neymar Jr • Mini Mini", "Learn Football Skills By Watching Videos");
		addVideoItem("jjPhrYo1J4I", "Dani Alves & Neymar", "Learn Football Skills By Watching Videos");
		addVideoItem("DLjeLJbj1As", "Neymar Jr .", "Learn Football Skills By Watching Videos");
		addVideoItem("iVj_w-zUQCE", "Brazil ● Danza Kuduro", "Learn Football Skills By Watching Videos");

		addVideoItem("7MFtfCZB_oA", "Lionel Messi ", "Learn Football Skills By Watching Videos");
		addVideoItem("zpwWkfHpoSs", "World Cup 2022 ", "Learn Football Skills By Watching Videos");
		addVideoItem("Pln8u5r2G6A", "Neymar Jr. ● Danza Kuduro", "Learn Football Skills By Watching Videos");
		addVideoItem("Q5_mArF5MnQ", "Neymar Jr", "Learn Football Skills By Watching Videos");
		addVideoItem("Ed2TepUl_QY", "Magic in the air", "Learn Football Skills By Watching Videos");

		addVideoItem("oyHWILD3KEE", "Ronaldo and Messi", "Learn Football Skills By Watching Videos");
		addVideoItem("ngclG5ffWw8", "Kylian Mbappe -", "Learn Football Skills By Watching Videos");
		addVideoItem("P64QZ3nWe0A", "Dani Alves & Neymar", "Learn Football Skills By Watching Videos");
		addVideoItem("EHT4INVjX2A", "Neymar Jr ►", "Learn Football Skills By Watching Videos");
		addVideoItem("GmKjLAvNyeM", "Neymar Jr • STAY", "Learn Football Skills By Watching Videos");

		addVideoItem("irm8u0XXqGQ", "Neymar Jr. ►Copines ", "Learn Football Skills By Watching Videos");
		addVideoItem("RUDBSmvClcY", "Neymar Jr 2023 ", "Learn Football Skills By Watching Videos");
		addVideoItem("cJNBk2dN-oc", "LIONEL MESSI", "Learn Football Skills By Watching Videos");
		addVideoItem("a-3phbNHZ0c", "Lionel Messi Faded 2016", "Learn Football Skills By Watching Videos");
		addVideoItem("eaGV51Ox-Zk", "Cristiano Ronaldo", "Learn Football Skills By Watching Videos");

		addVideoItem("DHO_cqG6nuQ", "Ronaldo and Messi", "Learn Football Skills By Watching Videos");
		addVideoItem("pmLZEymN4dA", "Cristiano Ronaldo", "Learn Football Skills By Watching Videos");
		addVideoItem("grFFzzwj5fs", "Messi & Neymar", "Learn Football Skills By Watching Videos");
		addVideoItem("4uD4ONrU5mg", "Paulo Dybala - Mood", "Learn Football Skills By Watching Videos");
		addVideoItem("S8WL8OH96D4", "Paulo Dybala ", "Learn Football Skills By Watching Videos");

		addVideoItem("K2wRenPNm8A", "Kylian Mbappe ", "Learn Football Skills By Watching Videos");
		addVideoItem("klDZmmUhAtA", "Vegedream ", "Learn Football Skills By Watching Videos");
		addVideoItem("8We8edHmPF0", "8We8edHmPF0", "Learn Football Skills By Watching Videos");
		addVideoItem("c_85isM1vFE", "Neymar Jr ►", "Learn Football Skills By Watching Videos");
		addVideoItem("jQOtv6_eo4Y", "Football Skills Mix", "Learn Football Skills By Watching Videos");


		createPlayListForVideo("Player Skills", R.drawable.skills_2);

		//=========================




		//========================Video Item Category

		addVideoItem("K4JR-gK1SXU", "How to Do a Cruyff Turn in Soccer", "Learn Football Skills By Watching Videos");
		addVideoItem("VdgJVwrwqTY", "How to Do the Ronaldo Chop ", "Learn Football Skills By Watching Videos");
		addVideoItem("S4EDBmx-Ib4", "What Is A Give And Go?", "Learn Football Skills By Watching Videos");
		addVideoItem("2UwRk0jasTQ", "How To Do A Scissor", "Learn Football Skills By Watching Videos");
		addVideoItem("eLH0B83NbCU", "How To Do A Step Over", "Learn Football Skills By Watching Videos");

		addVideoItem("vpT1kQ3ALN0", "How to Do a Poke Tackle", "Learn Football Skills By Watching Videos");
		addVideoItem("8mncCD2cd7w", "How To Shield The Ball in Soccer", "Learn Football Skills By Watching Videos");
		addVideoItem("x2WC8re2Lqg", "What is Dribbling in Soccer?", "Learn Football Skills By Watching Videos");
		addVideoItem("_lexjnjdYGc", "What is Passing in Soccer?", "Learn Football Skills By Watching Videos");
		addVideoItem("7Mjouoy-gSM", "Dribbling With Different ", "Learn Football Skills By Watching Videos");


		addVideoItem("nsGQsA9qBbI", "Receiving on the Ground ", "Learn Football Skills By Watching Videos");
		addVideoItem("p5_5gP2rqiE", "Goalkeeper Footwork ", "Learn Football Skills By Watching Videos");
		addVideoItem("LSXkUxOv1Hk", "Receiving with Different Parts", "Learn Football Skills By Watching Videos");
		addVideoItem("O7HnWFUPoQM", "How to Head the Ball", "Learn Football Skills By Watching Videos");
		addVideoItem("G5Wkrv4fPHU", "Small Touches vs. Big Touches", "Learn Football Skills By Watching Videos");

		addVideoItem("oclFQQgXLCQ", "What Is Balance?", "Learn Football Skills By Watching Videos");
		addVideoItem("-lYDqqVWVn0", "How To Chip The Ball", "Learn Football Skills By Watching Videos");
		addVideoItem("KByZalrdZO4", "KByZalrdZO4", "Learn Football Skills By Watching Videos");
		addVideoItem("RxgvI5IHN-c", "Common Shooting Mistakes", "Learn Football Skills By Watching Videos");
		addVideoItem("k1i6kWXi2Ls", "9 Essential Goalkeeping Skills", "Learn Football Skills By Watching Videos");


		createPlayListForVideo("Girls Video", R.drawable.girl);

		//=========================





		createCategoryForWebsite("BBC Sport", R.drawable.bbss, "https://www.bbc.com/sport/football");


		//=========================

















	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}


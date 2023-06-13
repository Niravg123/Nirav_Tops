Action()
{

	web_url("welcome.pl", 
		"URL=http://127.0.0.1:1080/cgi-bin/welcome.pl?signOff=true", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://127.0.0.1:1080/WebTours/index.htm", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=http://pki.goog/repo/certs/gts1c3.der", "Referer=", ENDITEM, 
		"Url=http://pki.goog/repo/certs/gtsr1.der", "Referer=", ENDITEM, 
		LAST);

	lr_save_string(lr_decrypt("6487f9418cf1d347"), "PasswordParameter");

	lr_think_time(7);

	web_submit_data("login.pl", 
		"Action=http://127.0.0.1:1080/cgi-bin/login.pl", 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://127.0.0.1:1080/cgi-bin/nav.pl?in=home", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=userSession", "Value=136624.765735115HAcHzDzpDiHftcVzfpiViDcf", ENDITEM, 
		"Name=username", "Value=jojo", ENDITEM, 
		"Name=password", "Value={PasswordParameter}", ENDITEM, 
		"Name=login.x", "Value=46", ENDITEM, 
		"Name=login.y", "Value=13", ENDITEM, 
		"Name=JSFormSubmit", "Value=off", ENDITEM, 
		LAST);

	web_image("Search Flights Button", 
		"Alt=Search Flights Button", 
		"Snapshot=t3.inf", 
		LAST);

	lr_think_time(4);

	web_image("Itinerary Button", 
		"Alt=Itinerary Button", 
		"Ordinal=1", 
		"Snapshot=t4.inf", 
		LAST);

	web_image("Home Button", 
		"Alt=Home Button", 
		"Ordinal=1", 
		"Snapshot=t5.inf", 
		LAST);

	web_image("SignOff Button", 
		"Alt=SignOff Button", 
		"Ordinal=1", 
		"Snapshot=t6.inf", 
		LAST);

	return 0;
}
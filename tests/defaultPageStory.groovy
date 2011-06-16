using "geb"

scenario "index page", {

    when "we open the index page", {
        go "http://reupholster.iriscouch.com:5984/couchapp-test/_design/app/index.html"
    }
    then "jquery runs, and changes text to trailhead", {

        $('div.huge').text().shouldBe "Trailhead"
    }
}


scenario "print all documents", {
	when "We are on the default page", {
		go "http://reupholster.iriscouch.com:5984/couchapp-test/_design/app/index.html"
	}
	then "there is list of all document ids", {
		$('li').size().shouldBeGreaterThan 0
	}
}
package info.bliki.api;

import info.bliki.api.Page;

import java.util.Arrays;
import java.util.List;

import info.bliki.api.Connector;
import info.bliki.api.User;

public class ConnectorTest {

	public static void main(String[] args) {
	    Connector subject;
	    //User user;
	    User anonUser;
	    
        subject = new Connector();
        anonUser = new User(null, null, "http://zh.wikipedia.org/w/api.php");
        User result = subject.login(anonUser);
        List<Page> pages = subject.queryContent1(anonUser, Arrays.asList("人"));

        Page page = pages.get(0);
        System.out.println(page.toString());
	}

}

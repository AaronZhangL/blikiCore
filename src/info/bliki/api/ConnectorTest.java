package info.bliki.api;

import info.bliki.api.Page;

import java.util.Arrays;
import java.util.List;

import info.bliki.api.Connector;
import info.bliki.api.User;
import info.bliki.html.HTML2TextConverter;

public class ConnectorTest {

	public static void main(String[] args) {
	    Connector subject;
	    //User user;
	    User anonUser;
	    
        subject = new Connector();
        anonUser = new User(null, null, "http://zh.wikipedia.org/w/api.php");
        //User result = subject.login(anonUser);
        List<Page> pages = subject.queryContent1(anonUser, Arrays.asList("人"));

        Page page = pages.get(0);
        System.out.println("====================HTML============================");
        System.out.println(page.toString());
        
        System.out.println("====================HTML2TEXT============================");
        HTML2TextConverter converter = new HTML2TextConverter();
        String txt = converter.html2text(page.toString());
        System.out.print(txt);
        
        System.out.println("====================HTML2TEXT DELETE [n]============================");
        String regex = "\\[[0-9]*\\]";
        String data = txt.replaceAll(regex, "");
        System.out.print(data);
	}

}

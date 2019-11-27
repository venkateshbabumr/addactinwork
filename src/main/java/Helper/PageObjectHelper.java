package Helper;

import org.openqa.selenium.WebDriver;

import com.pom.Checkouttestcase3;
import com.pom.Login;
import com.pom.Searchhotel;

public class PageObjectHelper {
	public static WebDriver driver;
	
	public PageObjectHelper(WebDriver xdriver) {
		this.driver=xdriver;
		
	}
private Login lg;
private Searchhotel sh;
private Checkouttestcase3 co;
public Login getLg() {
	if (lg==null) {
		lg=new Login(driver);
		
	}
	return lg;
}
public Searchhotel getSh() {
	if (sh==null) {
		sh=new Searchhotel(driver);
	}
	return sh;
}
public Checkouttestcase3 getCo() {
	if (co==null) {
		co=new Checkouttestcase3(driver);
	}
	return co;
}
}

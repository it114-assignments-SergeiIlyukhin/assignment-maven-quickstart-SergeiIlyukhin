package assignment_maven_quickstart_SergeiIlyukhin;

/**
 * Sergei
 *
 */
public class App {

	public static final String  NAME = "serg";
	public static final Integer AGE = 11;
	
	private String  name;
	private Integer age;
	
	public App() {
		this(App.NAME, App.AGE);
	}
	
	public App(String _name, Integer _age) {
		name = _name;
		age = _age;
	}
	
	public Integer add2age(Integer _add2age) {
		return age + _add2age;
	}

	public Integer add2age(String _add2age) {
		return age;
		
	}

	public String prefixedName(String _prefix2name) {
		return _prefix2name;
		
	}
	
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}


    public static void main( String[] args ){
       
    }
}
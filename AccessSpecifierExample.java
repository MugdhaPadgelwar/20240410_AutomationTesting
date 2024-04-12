package aspire;

public class AccessSpecifierExample {
	
	
	 public String publicString = "Public string";
	    protected String protectedString = "Protected string";
	    String defaultString = "Default string";
	    private String privateString = "Private string";

	    // Methods with different access modifiers
	    public void publicMethod() {
	        System.out.println("Public method called");
	    }

	    protected void protectedMethod() {
	        System.out.println("Protected method called");
	    }

	    void defaultMethod() {
	        System.out.println("Default method called");
	    }

	    private void privateMethod() {
	        System.out.println("Private method called");
	    }

	    // Main method to demonstrate access
	    public static void main(String[] args) {
	    	AccessSpecifierExample example = new AccessSpecifierExample();

	        // Accessing members from within the same class
	        System.out.println("Accessing members from within the same class:");
	        System.out.println(example.publicString);
	        System.out.println(example.protectedString);
	        System.out.println(example.defaultString);
	        System.out.println(example.privateString);
	        example.publicMethod();
	        example.protectedMethod();
	        example.defaultMethod();
	        example.privateMethod();

	        // Accessing members from another class in the same package
	        AnotherClass anotherClass = new AnotherClass();
	        System.out.println("\nAccessing members from another class in the same package:");
	        System.out.println(anotherClass.publicString);
	        System.out.println(anotherClass.protectedString);
	        System.out.println(anotherClass.defaultString);
	        // System.out.println(anotherClass.privateString); // Not accessible
	        anotherClass.publicMethod();
	        anotherClass.protectedMethod();
	        anotherClass.defaultMethod();
	        // anotherClass.privateMethod(); // Not accessible
	    }
	}

	// Another class in the same package
	class AnotherClass {
	    public String publicString = "Another public string";
	    protected String protectedString = "Another protected string";
	    String defaultString = "Another default string";
	    private String privateString = "Another private string";

	    public void publicMethod() {
	        System.out.println("Another public method called");
	    }

	    protected void protectedMethod() {
	        System.out.println("Another protected method called");
	    }

	    void defaultMethod() {
	        System.out.println("Another default method called");
	    }

	    private void privateMethod() {
	        System.out.println("Another private method called");
	    }

}

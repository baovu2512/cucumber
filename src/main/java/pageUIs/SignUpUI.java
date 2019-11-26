package pageUIs;

public class SignUpUI {
	public static final String SIGNUP_USER_TEXTBOX = "//input[@data-ng-model='signup.username']";
	public static final String SIGNUP_PASS_TEXTBOX = "//input[@data-ng-model='signup.password']";
	public static final String SIGNUP_EMAIL_TEXTBOX = "//input[@data-ng-model='signup.email']";
	public static final String SIGNUP_COMPANY_TEXTBOX = "//input[@data-ng-model='signup.companyName']";
	public static final String SIGNUP_ADDRESS_TEXTBOX = "//input[@data-ng-model='signup.addressCompany']";
	public static final String SIGNUP_PHONENUMB_TEXTBOX = "//input[@data-ng-model='signup.phoneNumber']";
	public static final String DONT_HAVE_ACCOUNT = "//a[contains(text(),'have an Account')]";
	public static final String SIGN_UP_TITLE = "//div[text()='Sign Up ']";
	public static final String ACCOUNT_MANAGER_TITLE = "//div[contains(text(),'Account management')]";
	public static final String COMPANY_INFOR_TITLE = "//div[contains(text(),'Company information')]";
	public static final String SUCCESS_MESSAGE = "//b[text()='Successfully']";

	public static final String SIGNIN_USER_TEXTBOX = "//input[@name='j_username']";
	public static final String SIGNIN_PASS_TEXTBOX = "//input[@name='j_password']";
	public static final String SIGNUP_NEXT_BUTTON = "//a[text()='Next step']";
	public static final String COMPLETE_BUTTON = "//button[text()='Complete']";

	public static final String DYNAMIC_ROLES_RADIOBUTTON = "//input[contains(text(),'$s')]/parent::label";
}

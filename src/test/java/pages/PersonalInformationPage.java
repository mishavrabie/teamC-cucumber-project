package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
@Data
public class PersonalInformationPage {

    public PersonalInformationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="b_firstName")
    private WebElement firstName;

    @FindBy(xpath = "//select[@id='b_suffix']")
    private WebElement maritalStatus;

    @FindBy(id="b_cell")
    private WebElement cellPhone;

    @FindBy(id="b_ssn")
    private WebElement ssn;

    @FindBy(id="select2-b_marital-container")
    private WebElement option;

    @FindBy(xpath = "//span[@data-select2-id='9']")
    private WebElement maritalStatus1;




}

package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests
{
    @Test
    public void testSelectOption()
    {
        String option = "Option 1";
        var dropdownPage = homePage.clickDropDown();
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of options returned");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
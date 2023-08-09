Feature: Open page
  Scenario: Deschide o pagina la alegere
    Given Open the browser
    When Access page "https://qa-practice.netlify.app/"
    And Press button "Form"
    And Press button "Login"
    And Complete field "Email" with value "admin@admin.com"
    And Complete field "Pass" with value "admin123"
    And Press button "Submit"
    And Close Browser

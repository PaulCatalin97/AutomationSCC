Feature: Open page
  Scenario: Deschide o pagina la alegere
    Given Open the browser
    When Access page "https://qa-practice.netlify.app/"
    And Press button "Btnactions"
    And Press button "Mouse Hover"
    And hover over button "Hover over me"
    And Close Browser
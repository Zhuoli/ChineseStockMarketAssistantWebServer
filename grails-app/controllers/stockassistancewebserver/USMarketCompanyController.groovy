package stockassistancewebserver

class USMarketCompanyController {

    def index() {
        def companies = USMarketCompany.findAll()
        [companyList : companies]
    }
}

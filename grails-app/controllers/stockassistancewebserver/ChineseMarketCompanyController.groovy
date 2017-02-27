package stockassistancewebserver

class ChineseMarketCompanyController {

    def index() {
        def companies = USMarketCompany.findAll()
        [companyList : companies]
    }
}

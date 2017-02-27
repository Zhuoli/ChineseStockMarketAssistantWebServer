package stockassistancewebserver

class ChineseMarketCompanyController {

    def index() {
        def companies = ChineseMarketCompany.findAll()
        [companyList : companies]
    }
}

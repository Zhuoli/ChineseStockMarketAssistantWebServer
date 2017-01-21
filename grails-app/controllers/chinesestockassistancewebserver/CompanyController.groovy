package chinesestockassistancewebserver

class CompanyController {

    def index() {
        def companies = Company.findAll()
        [companyList : companies]
    }
}

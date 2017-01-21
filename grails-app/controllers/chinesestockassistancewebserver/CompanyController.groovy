package chinesestockassistancewebserver

class CompanyController {

    def index() {
        def companies = Company.list()
        [companyList : companies]
    }
}

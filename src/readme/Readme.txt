Environment 

  application-dev.config -dev configs hosted here. 
  all entities to herit from BaseEntity 
  to turn logging on application.config logging.config logback turned off
  schedulers to be hosted under utils.schedulers
  Add column length to columns otherwise hibernate defaults will apply
     @Column(length = 100)

Coding styles 

  validations 
    through javax annotation validation 
      annotate @NonNull(for lombok support) and @notnull for mandatory fields

    Validating Look ups
      2 ways --> either through an enum on rest request object or through @listvalidation custom validator on request object attribute
      Add table to CodeTable enum if it doesnt exist 
      Add inserts to data-h2.sql 
      eg:@ListValidation(message = "Invalid country", codeTable = CodeTable.country)

  Accessors --> 
    Dont handcode getters/setters or constructors. use lombok @data instead.

  Copy Dto to Entity and reverse --> 
    Use Mapstruct to copy values from one object to another Dont use clone or other object copy libraries as they cause performance issues
    
  
    

    




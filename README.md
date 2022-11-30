## spring_crud_pracrtice
* spring introduction(인프런 강의) 참고

### http 구조  
home(/)  
  create  
    new  
  read  
  update  
  delete  
  
### project 구조
  - controller
    + (MemberContoller): 흩어져 있는 controller를 하나로 정리 필요
      * HomeColtroller: "/"
      * MemberController: "/create", "/create/new", "/read"
      * CreateController: (dto 역할) name, getName(), setName(String name)
  - dto
    + (requestDto)
    + (responseDto)
  - entity
    + Member: 필드 값 정의: DB 연결 필요
      * id, name 정의
      * getId(), setId(Long Id), getName(), setName(String name)
  - repository
    + MemberRepository: DB 연결 필요
      * save(Member member), findById(Long Id), findByName(String name), findAll()
  - service
    + MemberService: CURD 구현
      * join(Member member), validateDuplicateMember(Member member)
  - CrudPracApplication
  - resources/templates
    + members
      create.html
    + home.html
  

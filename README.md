
# 스프링부트의 스프링MVC

#### resourceHandlerMapping
리소스 관련 핸들러.<br/>
/resources/static 정적 리소스를 지원하는 기능. (이외 다른 디렉토리들도 지원.)<br/>
resourceHandlerMapping를 설정하면 캐싱 관련 정보들이 응답 헤더에 추가로 추가됨.<br/>
요청의 캐시 정보로 적절한 응답을 보낼 수 있음. <br/>
예를 들어, 리소스가 변경되지 않았으면 not modified(304)라는 응답으로 보내서 <br/>
브라우저가 캐싱하고 있는 리소스를 그대로 사용하도록 함. <br/>

#### RequestMappingHandlerAdapter
애노테이션 기반의 핸들러매핑을 처리할 수 있는 어댑터.<br/>

#### ContentNegotiatingViewResolver
본인이 직접 뷰를 처리하는게 아니라 다른 ViewResolver들에게 일 처리를 위임함.<br/>
ContentNegotiatingViewResolver가 가지고 있는 viewResolvers 프로퍼티가<br/>
다른 4개의 뷰리졸버들을 참조하고 있음. <br/>
때문에 뷰리졸버 중에 우선순위가 항상 최상위.  <br/>

<br/><br/>



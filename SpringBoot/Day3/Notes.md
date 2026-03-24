RestController vs Service vs Component vs Repository :

Similiarity: 

All these are aliases for the Component Annotation.
Means These annotations can atleast do the work which compoennt annotation can do.

Component annotation: is used to create bean.

Service, Respository are alias for component
RestController is alias for Controller and contorller is alias for component.


Rest Controller vs Component:

I can replace RestController with Component and start project: Beans will be created.
But when we hit api through postman it will give error.
Because it has additional fetature than Component:
-> They handle HTTP Requests.

So Componet class me aap API map nahi kr sakte aapko RestController use krna hoga to map api with your methods.

Service vs Component:

@Service can be replace with component and you will not get any error. 
Service is an alias for Component and there is no additional feature associated with it.
It is created just for readability for service classes.

Hume iss class ki sirf bean create krna hai me koi bhi annotation use kr sakta out of 4, even restcontroller error nahi aayega
but rest controller nahi use krna hai because we are not deaking any api mapping.

Repository vs Component:

Bean will be created if we replace with component (If there is no exception). It is still giving the api response.
Are they same ?
No.
-> Its additional feature is that it converts checked persistence exceptions to unchecked DataAccessException.
-> DB related koi bhi exception aata hai repository annotation converts that exception into runtimeexception and that exception class is DataAccessException.

API DONO me chlta hai agar exception ata hai tho but yahi hai repository se seeda DataAccessException aata.
But Component se NoResultException aaya that is jo bhi exception aata wo bhej deta but repository se humesha DataAccessException.
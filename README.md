# Spring-Boot-Internationalization
It is a sample spring boot application to demonstrate the concept and implementation of internalization

## Overview on Internationalization (i18n)

Internationalization is the process of designing the applications which _**aims in making the application more accessible and usable by people from different regions with different languages without requiring major code changes**_.

The following are some of the different steps involved in the process of internationalization:

- ```Text Extraction```: Identify all the user-facing strings, messages, labels, and any text that needs to be displayed in the application.


- ```Resource Bundles```: Store all the text and locale-specific resources in external files known as resource bundles. Each resource bundle corresponds to a specific language and culture.


- ```Locale Detection```: The application needs to detect the user's preferred locale, which includes language and region information. This can be done based on user preferences, browser settings, or other parameters.


- ```Message Formatting```: Ensure that your application can handle dynamic content, such as date and time formats, numerical formats, and pluralization rules specific to different languages.


- ```UI Layout and Design```: Account for potential changes in text length due to translations. User interface elements should be designed to accommodate varying text lengths without breaking the layout.


- ```Encoding and Fonts```: Ensure that your application supports character encodings and fonts required by different languages. Some languages may use characters not present in the English alphabet.

### i18n Implementation in Spring Boot
The following is an overview of how we can implement it in spring boot:

- ```Resource Bundles```: Create properties files for each supported locale. For example, you might have messages.properties for the default (usually English) locale, and messages_fr.properties for the French locale. Each file should contain key-value pairs for each message or label used in the application.


- ```Configuration```: Configure Spring Boot to use these resource bundles for message resolution. This can be done in the application.properties file by specifying the base name of the resource bundle, like so: ```spring.messages.basename=messages```


- ```Message Source```: Spring Boot's ```MessageSource``` is responsible for **loading the appropriate resource bundle based on the user's locale**. You can use this to retrieve localized messages in your code.


- ```Usage in Code```: Instead of hardcoding messages in your code, use keys that correspond to the keys in your resource bundles. Retrieve messages using the MessageSource.


- ```Locale Switching```: Implement a way for users to switch their preferred locale, and store this preference (e.g., in a user profile or session).

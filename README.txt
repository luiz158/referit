REFERIT
=======

ReferIt is a reference data service for domain specific applications. The idea is simple: In almost every database there are reference data tables rarely updated, but frequently read. For example: table of countries, states, cities, zip codes, languages, currencies, units, colors, sizes, and even suppliers, producers, stocks and so on. They are also called "reference data" or "master data".

The cost to implement the suport for reference data is relatively high. That's equivalent to a CRUD per reference table. This kind of data are useful for the business but they are not actually business data. We call business data those directly related to the operations, such as: order, delivery, patient, consultation, appointment, document, product, and so on. We believe that developers shold focus on business data and let reference data be managed by ReferIt. The cost to develop all thos CRUD would be simply removed from the project or significantly reduced.

With ReferIt, rather than go through all the layers to display reference data in comboboxes, lists, labels and other widgets, this data is provided by ReferIt RESTful services and rendered with JavaScript. What matters for the developer is the id of the selected values, not the the name or other related properties. The ids are, then related to the business data.

Let's contextualize ReferIt: When registering to JUG Management (https://github.com/htmfilho/jug) people select their country, province and city in the registration form. Nowadays, we have to create tables, entity classes, business classes, control classes, pages, and other resources to simply manage those data and display it to users in comboboxes. These data go through all these classes, cosuming resources and impacting performance. With ReferIt, Jug Management no longer need to handle such data. It's enough to use a script that access ReferIt RESTful services to populate widgets, using the client-side processing instead, and releasing the application from the cost of dealing with countries, states, cities, everything else that is not part of JUG's business. Jug Management just need the ids of the selected country, state and city. Nothing more. That would make Jug Management faster and simpler.

Now, imagine the benefits of ReferIt to your application! How many times you had to implement all those reference data in all different projects you have worked on? What about stop doing that and delegate the whole thing to ReferIt?! Do it! It is free and open source!


Contact
-------

           Project Leader: Hildeberto Mendonca
            Personal Blog: http://www.hildeberto.com
                Member of: CEJUG (Ceara Java User Group) http://www.cejug.org
            Email Address: me at hildeberto.com
   
          Project Website: https://github.com/htmfilho/referit
Application used by CEJUG: http://www.cejug.org/jug


Technologies In Use
-------------------

JDK 7: We are using the latest Java language features available, thus the Java Development Kit version 7 or superior is required.

JPA 2.0: Java Persistence API implements the persistence layer.

EclipseLink: Implementation of the JPA 2.0 specification (http://www.eclipse.org/eclipselink/) It actually makes JPA works.

Jersey 2.0-m11: Jersey is the open source JAX-RS (JSR 339) Reference Implementation for building RESTful Web services.

GWT 2.5: Google Web Toolkit

------------------------------
Copyright 2011-2013, Cejug.org
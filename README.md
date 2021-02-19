## Steps to Setup

**1. Clone the application**
```bash
https://github.com/AivarApsalon/Dentist-back
```

**2. Run**
```bash
src / main / java / com / example / demo / DemoApplication 
```

**3. Database**
```bash
Database: H2
```

```bash
Go to browser:  
**http://localhost:8085/h2-console**
Type into terminal: SELECT * FROM DENTIST 
There you see Table: DENTIST
```

**Important: Please add at least one id and one dentist into that table, before making requests from database!**


```bash
In database is used 2 tables:

+ table name: dentist
- Rows: id, dentist_name

+ table name: registrations
- Rows: id, date, time, first_name, last_name, id_card_nr, dentist_id
```

**5. Endpoints**


| Method | Url | Description |
| ------ | --- | ----------- | 
| GET    | http://localhost:8085/dentist/dentist-list | Get a list of dentists from database | 
| GET    | http://localhost:8085/dentist/registrations | Get all registrations from database | 
| GET    | http://localhost:8085/dentist/registrations-by-dentist-id/{dentist_id} | Get all registrations by dentist id | 
| POST   | http://localhost:8085/dentist/add-registration | Add new registration |
| PUT    | http://localhost:8085/dentist/change-registration/{registration_id} | Change existing registration |
| DELETE | http://localhost:8085/dentist/delete-registration/{registration_id} | Delete existing registration |



#### Samples of URLs with valid JSON Request Bodys

Get Dentist List
```bash
http://localhost:8085/dentist/dentist-list
```

Get All Registrations
```bash
http://localhost:8085/dentist/registrations
```

Get Registrations By Dentist Id
```bash
http://localhost:8085/dentist/registrations-by-dentist-id/2
```

Add Registration
```bash
http://localhost:8085/dentist/add-registration

{
    "date": "2021-03-01",
    "time": "10:00",
    "firstName": "John",
    "lastName": "Smith",
    "idCardNr": "AA000",
    "dentistId" : 2
}
```

Change Registration
```bash
http://localhost:8085/dentist/change-registration/2
{
    "date": "2020-11-05",
    "time": "14:00",
    "firstName": "John",
    "lastName": "Smith",
    "idCardNr": "AA000",
    "dentistId" : 2
}
```

Delete Registration
```bash
http://localhost:8085/dentist/delete-registration/2
```


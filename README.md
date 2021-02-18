## Steps to Setup

**1. Clone the application**
```bash
https://github.com/AivarApsalon/Dentist-back
```

**2. Run**
```bash
`src / main / java / com / example / demo / DemoApplication `
```

**3. Create PostgreSQL database**
```bash
- KÜSIMUS SIIMULE ANDMEBAASI KOHTA!
```

```bash
In database is used 2 tables:
```
```bash
+ table name: dentist
- Rows: id, dentist_name

Important: Please add at least one dentist into that table, before making requests from database!
```
```bash
+ Table name: registrations
- Rows: id, date, time, first_name, last_name, id_card_nr, dentist_id
```

**4. The app will start running at <http://localhost:8085>**


**5. Endpoints**

| Method | Url | Description |
| ------ | --- | ----------- | 
| GET    | /dentist/dentist-list | Get a list of dentists from database | 
| GET    | /dentist/registrations | Get all registrations from database | 
| GET    | /dentist/registrations-by-dentist-id/{dentist_id} | Get all registrations by dentist id | 
| POST   | /dentist/add-registration | Add new registration |
| PUT    | /dentist/change-registration/{registration_id} | Change existing registration |
| DELETE | /dentist/delete-registration/{registration_id} | Delete existing registration |

**6. Samples of URL-s with valid JSON Request Bodys **

```bash
/dentist/dentist-list
```

```bash
/dentist/registrations
```

```bash
/dentist/registrations-by-dentist-id/2
```

```bash
/dentist/add-registration

{
    "date": "2021-03-01",
    "time": "10:00",
    "firstName": "John",
    "lastName": "Smith",
    "idCardNr": "AA000",
    "dentistId" : 2
}
```

```bash
/dentist/change-registration/2
{
    "date": "2020-11-05",
    "time": "14:00",
    "firstName": "John",
    "lastName": "Smith",
    "idCardNr": "AA000",
    "dentistId" : 2
}
```

```bash
/dentist/delete-registration/2
```


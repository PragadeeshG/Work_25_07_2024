create table if not exists service_desk_data(
change_management_code varchar(255) not null,
change_management_name varchar(255) null,
localenvironment varchar(255) null,
tradeenvironment varchar(255) null,
short_description varchar(255) null,
multi_service_desk_option varchar(255) null,
change_management_params varchar(255) null,
upload_version Integer null,
launch_environment varchar(255) null,
manage_environment varchar(255) null,
status varchar(255) null,
constraint service_desk_data_pk primary key(change_management_code));
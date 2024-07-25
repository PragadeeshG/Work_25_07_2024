create table if not exists service_desk_pricing(
service_desk_subscription_code Integer not null,
subscription_type_code Integer null,
subscription_type_pricing varchar(255) null,
subscription_type_currency varchar(255) null,
gateway_tools varchar(255) null,
mode_of_payments varchar(255) null,
pricing_customization_available char null,
custom_factor varchar(255) null,
base_price varchar(255) null,
max_price varchar(255) null,
min_price varchar(255) null,
billing_address varchar(255) null,
mailing_address varchar(255) null,
multi_region_support varchar(255) null,
constraint service_desk_pricing_pk primary key(service_desk_subscription_code));
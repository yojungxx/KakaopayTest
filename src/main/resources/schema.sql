create table hyo_tb_mng_inf ( 
	brcode varchar(1) not null
           , brname varchar(100) not null
);

create table hyo_tb_de_iz ( 
	dedt varchar(8) not null
           , acctno varchar(8) not null
           , deno integer not null
           , sl_am integer not null
           , fe_am integer not null
           , can_yn varchar(1) not null
);

create table hyo_tb_acct_inf ( 
	acctno varchar(8) not null
           , name varchar(100) not null
           , brcode varchar(1) not null
);

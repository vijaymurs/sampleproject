CREATE TABLE IF NOT EXISTS users (
   user_id serial NOT NULL,
   username character varying (50) NOT NULL UNIQUE,
   passwords character varying (50) NOT NULL,
   first_name character varying (50) NOT NULL,
   last_name character varying (50) NOT NULL,
   email character varying (255) NOT NULL UNIQUE,
   created_on timestamp NOT NULL DEFAULT now (),
   last_login timestamp NOT NULL DEFAULT now ()
)
package com;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class ConvertPDLJSONToTextResume {

	public static void main(String[] args) {
		String json="{\r\n" + 
				"	\"status\": 200,\r\n" + 
				"	\"data\": [\r\n" + 
				"		{\r\n" + 
				"			\"id\": \"vCWZJECkRoOKh95ooFrjjw_0000\",\r\n" + 
				"			\"full_name\": \"katie donahue\",\r\n" + 
				"			\"first_name\": \"katie\",\r\n" + 
				"			\"middle_initial\": null,\r\n" + 
				"			\"middle_name\": null,\r\n" + 
				"			\"last_initial\": \"d\",\r\n" + 
				"			\"last_name\": \"donahue\",\r\n" + 
				"			\"gender\": \"female\",\r\n" + 
				"			\"birth_year\": null,\r\n" + 
				"			\"birth_date\": null,\r\n" + 
				"			\"linkedin_url\": \"linkedin.com/in/katie-donahue-95921013\",\r\n" + 
				"			\"linkedin_username\": \"katie-donahue-95921013\",\r\n" + 
				"			\"linkedin_id\": \"45309525\",\r\n" + 
				"			\"facebook_url\": \"facebook.com/katie.donahue.75\",\r\n" + 
				"			\"facebook_username\": \"katie.donahue.75\",\r\n" + 
				"			\"facebook_id\": \"64400464\",\r\n" + 
				"			\"twitter_url\": null,\r\n" + 
				"			\"twitter_username\": null,\r\n" + 
				"			\"github_url\": null,\r\n" + 
				"			\"github_username\": null,\r\n" + 
				"			\"work_email\": \"donahu54@msu.edu\",\r\n" + 
				"			\"personal_emails\": [],\r\n" + 
				"			\"mobile_phone\": \"+17346521317\",\r\n" + 
				"			\"industry\": \"higher education\",\r\n" + 
				"			\"job_title\": \"director of medical education international programs- merida, mexico\",\r\n" + 
				"			\"job_title_role\": \"health\",\r\n" + 
				"			\"job_title_sub_role\": null,\r\n" + 
				"			\"job_title_levels\": [\r\n" + 
				"				\"director\"\r\n" + 
				"			],\r\n" + 
				"			\"job_company_id\": \"michigan-state-university\",\r\n" + 
				"			\"job_company_name\": \"michigan state university\",\r\n" + 
				"			\"job_company_website\": \"msu.edu\",\r\n" + 
				"			\"job_company_size\": \"10001+\",\r\n" + 
				"			\"job_company_founded\": null,\r\n" + 
				"			\"job_company_industry\": \"higher education\",\r\n" + 
				"			\"job_company_linkedin_url\": \"linkedin.com/company/michigan-state-university\",\r\n" + 
				"			\"job_company_linkedin_id\": \"4695\",\r\n" + 
				"			\"job_company_facebook_url\": null,\r\n" + 
				"			\"job_company_twitter_url\": null,\r\n" + 
				"			\"job_company_location_name\": \"east lansing, michigan, united states\",\r\n" + 
				"			\"job_company_location_locality\": \"east lansing\",\r\n" + 
				"			\"job_company_location_metro\": \"lansing, michigan\",\r\n" + 
				"			\"job_company_location_region\": \"michigan\",\r\n" + 
				"			\"job_company_location_geo\": \"42.73,-84.48\",\r\n" + 
				"			\"job_company_location_street_address\": \"426 auditorium road\",\r\n" + 
				"			\"job_company_location_address_line_2\": null,\r\n" + 
				"			\"job_company_location_postal_code\": \"48824\",\r\n" + 
				"			\"job_company_location_country\": \"united states\",\r\n" + 
				"			\"job_company_location_continent\": \"north america\",\r\n" + 
				"			\"job_last_updated\": \"2018-12-01\",\r\n" + 
				"			\"job_start_date\": \"2015-10\",\r\n" + 
				"			\"location_name\": \"yucatan, mexico\",\r\n" + 
				"			\"location_locality\": null,\r\n" + 
				"			\"location_metro\": null,\r\n" + 
				"			\"location_region\": \"yucatan\",\r\n" + 
				"			\"location_country\": \"mexico\",\r\n" + 
				"			\"location_continent\": \"north america\",\r\n" + 
				"			\"location_street_address\": null,\r\n" + 
				"			\"location_address_line_2\": null,\r\n" + 
				"			\"location_postal_code\": null,\r\n" + 
				"			\"location_geo\": null,\r\n" + 
				"			\"location_last_updated\": \"2018-12-01\",\r\n" + 
				"			\"phone_numbers\": [\r\n" + 
				"				\"+17346521317\"\r\n" + 
				"			],\r\n" + 
				"			\"emails\": [\r\n" + 
				"				{\r\n" + 
				"					\"address\": \"donahu54@msu.edu\",\r\n" + 
				"					\"type\": \"current_professional\"\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"address\": \"donahuek@msu.edu\",\r\n" + 
				"					\"type\": \"current_professional\"\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"address\": \"katie.donahue@msu.edu\",\r\n" + 
				"					\"type\": \"current_professional\"\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"interests\": [\r\n" + 
				"				\"outdoor activities\",\r\n" + 
				"				\"nutrition\",\r\n" + 
				"				\"traveling\",\r\n" + 
				"				\"biking\",\r\n" + 
				"				\"running\",\r\n" + 
				"				\"swimming\"\r\n" + 
				"			],\r\n" + 
				"			\"skills\": [\r\n" + 
				"				\"medicine\",\r\n" + 
				"				\"healthcare\",\r\n" + 
				"				\"osteopathic manipulative medicine\",\r\n" + 
				"				\"nutrition\",\r\n" + 
				"				\"public health\",\r\n" + 
				"				\"public speaking\",\r\n" + 
				"				\"hospitals\",\r\n" + 
				"				\"healthcare information technology\",\r\n" + 
				"				\"board certified\",\r\n" + 
				"				\"event planning\",\r\n" + 
				"				\"clinical research\",\r\n" + 
				"				\"powerpoint\",\r\n" + 
				"				\"cpr certified\",\r\n" + 
				"				\"research\",\r\n" + 
				"				\"medical education\",\r\n" + 
				"				\"leadership\",\r\n" + 
				"				\"social media\",\r\n" + 
				"				\"microsoft office\",\r\n" + 
				"				\"teaching\"\r\n" + 
				"			],\r\n" + 
				"			\"location_names\": [\r\n" + 
				"				\"lansing, michigan, united states\",\r\n" + 
				"				\"merida, yucatan, mexico\"\r\n" + 
				"			],\r\n" + 
				"			\"regions\": [\r\n" + 
				"				\"yucatan, mexico\",\r\n" + 
				"				\"michigan, united states\"\r\n" + 
				"			],\r\n" + 
				"			\"countries\": [\r\n" + 
				"				\"united states\",\r\n" + 
				"				\"mexico\"\r\n" + 
				"			],\r\n" + 
				"			\"street_addresses\": [],\r\n" + 
				"			\"experience\": [\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"postgraduate american academy of osteopathy\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"start_date\": \"2014-03\",\r\n" + 
				"					\"end_date\": \"2015-03\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"chair\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"postgraduate american academy of osteopathy\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"start_date\": \"2013-03\",\r\n" + 
				"					\"end_date\": \"2014-03\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"vice chair\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"sparrow health system\",\r\n" + 
				"						\"size\": \"5001-10000\",\r\n" + 
				"						\"id\": \"sparrow-health-system\",\r\n" + 
				"						\"founded\": 1896,\r\n" + 
				"						\"industry\": \"hospital & health care\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"lansing, michigan, united states\",\r\n" + 
				"							\"locality\": \"lansing\",\r\n" + 
				"							\"region\": \"michigan\",\r\n" + 
				"							\"metro\": \"lansing, michigan\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"1120 east michigan avenue\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"48912\",\r\n" + 
				"							\"geo\": \"42.73,-84.55\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/sparrow-health-system\",\r\n" + 
				"						\"linkedin_id\": \"43278\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": \"twitter.com/sparrowhealth\",\r\n" + 
				"						\"website\": \"sparrow.org\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2013-06\",\r\n" + 
				"					\"start_date\": \"2012-07\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"osteopathic intern\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"training\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"mclaren macomb medical center\",\r\n" + 
				"						\"size\": \"1001-5000\",\r\n" + 
				"						\"id\": \"mount-clemens-regional-medical-center\",\r\n" + 
				"						\"founded\": 1944,\r\n" + 
				"						\"industry\": \"hospital & health care\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"mount clemens, michigan, united states\",\r\n" + 
				"							\"locality\": \"mount clemens\",\r\n" + 
				"							\"region\": \"michigan\",\r\n" + 
				"							\"metro\": \"detroit, michigan\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"1000 harrington street\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"48043\",\r\n" + 
				"							\"geo\": \"42.59,-82.87\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/mount-clemens-regional-medical-center\",\r\n" + 
				"						\"linkedin_id\": \"83383\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2012-08\",\r\n" + 
				"					\"start_date\": \"2010-07\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"extern\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"university of michigan\",\r\n" + 
				"						\"size\": \"10001+\",\r\n" + 
				"						\"id\": \"university-of-michigan\",\r\n" + 
				"						\"founded\": 1817,\r\n" + 
				"						\"industry\": \"higher education\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"ann arbor, michigan, united states\",\r\n" + 
				"							\"locality\": \"ann arbor\",\r\n" + 
				"							\"region\": \"michigan\",\r\n" + 
				"							\"metro\": \"ann arbor, michigan\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"1239 kipke drive\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"48109\",\r\n" + 
				"							\"geo\": \"42.27,-83.72\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/university-of-michigan\",\r\n" + 
				"						\"linkedin_id\": \"2516\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"umich.edu\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2007-08\",\r\n" + 
				"					\"start_date\": \"2007-05\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"assistant in scholarships and recruitment\",\r\n" + 
				"						\"role\": \"human_resources\",\r\n" + 
				"						\"sub_role\": \"recruiting\",\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"michigan state university\",\r\n" + 
				"						\"size\": \"10001+\",\r\n" + 
				"						\"id\": \"michigan-state-university\",\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": \"higher education\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"east lansing, michigan, united states\",\r\n" + 
				"							\"locality\": \"east lansing\",\r\n" + 
				"							\"region\": \"michigan\",\r\n" + 
				"							\"metro\": \"lansing, michigan\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"426 auditorium road\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"48824\",\r\n" + 
				"							\"geo\": \"42.73,-84.48\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/michigan-state-university\",\r\n" + 
				"						\"linkedin_id\": \"4695\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"msu.edu\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2015-06\",\r\n" + 
				"					\"start_date\": \"2013-07-01\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"nmm and omm resident and instructor\",\r\n" + 
				"						\"role\": \"education\",\r\n" + 
				"						\"sub_role\": \"professor\",\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"michigan state university\",\r\n" + 
				"						\"size\": \"10001+\",\r\n" + 
				"						\"id\": \"michigan-state-university\",\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": \"higher education\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"east lansing, michigan, united states\",\r\n" + 
				"							\"locality\": \"east lansing\",\r\n" + 
				"							\"region\": \"michigan\",\r\n" + 
				"							\"metro\": \"lansing, michigan\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"426 auditorium road\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"48824\",\r\n" + 
				"							\"geo\": \"42.73,-84.48\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/michigan-state-university\",\r\n" + 
				"						\"linkedin_id\": \"4695\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"msu.edu\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"east lansing, michigan, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": \"2015-07\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"physician provider\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"michigan state university\",\r\n" + 
				"						\"size\": \"10001+\",\r\n" + 
				"						\"id\": \"michigan-state-university\",\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": \"higher education\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"east lansing, michigan, united states\",\r\n" + 
				"							\"locality\": \"east lansing\",\r\n" + 
				"							\"region\": \"michigan\",\r\n" + 
				"							\"metro\": \"lansing, michigan\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"426 auditorium road\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"48824\",\r\n" + 
				"							\"geo\": \"42.73,-84.48\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/michigan-state-university\",\r\n" + 
				"						\"linkedin_id\": \"4695\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"msu.edu\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"east lansing, michigan, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": \"2015-10\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"director of medical education international programs- merida, mexico\",\r\n" + 
				"						\"role\": \"health\",\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"director\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": true\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"education\": [\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"michigan state university\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"website\": null,\r\n" + 
				"						\"domain\": null\r\n" + 
				"					},\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"start_date\": null,\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"majors\": [],\r\n" + 
				"					\"minors\": [],\r\n" + 
				"					\"gpa\": null\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"milan high school\",\r\n" + 
				"						\"type\": \"secondary school\",\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"website\": null,\r\n" + 
				"						\"domain\": null\r\n" + 
				"					},\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"start_date\": null,\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"majors\": [],\r\n" + 
				"					\"minors\": [],\r\n" + 
				"					\"gpa\": null\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"michigan state university college of osteopathic medicine\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": \"z7MffUtHDmQO2SZUCkdLAw_0\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"east lansing, michigan, united states\",\r\n" + 
				"							\"locality\": \"east lansing\",\r\n" + 
				"							\"region\": \"michigan\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/edu/188057\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": \"188057\",\r\n" + 
				"						\"website\": \"com.msu.edu\",\r\n" + 
				"						\"domain\": \"msu.edu\"\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"2012\",\r\n" + 
				"					\"start_date\": \"2008\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"medicine\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"st. bonaventure university\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": \"50D9DESbjM5nUcWdQ3rSgA_0\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"st. bonaventure, new york, united states\",\r\n" + 
				"							\"locality\": \"st. bonaventure\",\r\n" + 
				"							\"region\": \"new york\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/school/st-bonaventure-university\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/bonaventure\",\r\n" + 
				"						\"twitter_url\": \"twitter.com/stbonaventure\",\r\n" + 
				"						\"linkedin_id\": \"19012\",\r\n" + 
				"						\"website\": \"sbu.edu\",\r\n" + 
				"						\"domain\": \"sbu.edu\"\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"2008\",\r\n" + 
				"					\"start_date\": \"2004\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [\r\n" + 
				"						\"bachelors\",\r\n" + 
				"						\"bachelor of science\"\r\n" + 
				"					],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"biology\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"profiles\": [\r\n" + 
				"				{\r\n" + 
				"					\"network\": \"facebook\",\r\n" + 
				"					\"id\": \"64400464\",\r\n" + 
				"					\"url\": \"facebook.com/katie.donahue.75\",\r\n" + 
				"					\"username\": \"katie.donahue.75\"\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"network\": \"linkedin\",\r\n" + 
				"					\"id\": \"45309525\",\r\n" + 
				"					\"url\": \"linkedin.com/in/katie-donahue-95921013\",\r\n" + 
				"					\"username\": \"katie-donahue-95921013\"\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"version_status\": {\r\n" + 
				"				\"status\": \"\",\r\n" + 
				"				\"contains\": [],\r\n" + 
				"				\"previous_version\": \"\",\r\n" + 
				"				\"current_version\": \"\"\r\n" + 
				"			}\r\n" + 
				"		},\r\n" + 
				"		{\r\n" + 
				"			\"id\": \"FKYdlYTheSBkl1d-Tq2wZg_0000\",\r\n" + 
				"			\"full_name\": \"gabriel moreno\",\r\n" + 
				"			\"first_name\": \"gabriel\",\r\n" + 
				"			\"middle_initial\": null,\r\n" + 
				"			\"middle_name\": null,\r\n" + 
				"			\"last_initial\": \"m\",\r\n" + 
				"			\"last_name\": \"moreno\",\r\n" + 
				"			\"gender\": \"male\",\r\n" + 
				"			\"birth_year\": null,\r\n" + 
				"			\"birth_date\": null,\r\n" + 
				"			\"linkedin_url\": \"linkedin.com/in/gabrielmorenol\",\r\n" + 
				"			\"linkedin_username\": \"gabrielmorenol\",\r\n" + 
				"			\"linkedin_id\": \"153880828\",\r\n" + 
				"			\"facebook_url\": \"facebook.com/gabriel.moreno.31542\",\r\n" + 
				"			\"facebook_username\": \"gabriel.moreno.31542\",\r\n" + 
				"			\"facebook_id\": \"829214337\",\r\n" + 
				"			\"twitter_url\": null,\r\n" + 
				"			\"twitter_username\": null,\r\n" + 
				"			\"github_url\": null,\r\n" + 
				"			\"github_username\": null,\r\n" + 
				"			\"work_email\": null,\r\n" + 
				"			\"personal_emails\": [\r\n" + 
				"				\"gabrielmoreno_lomelin@hotmail.com\"\r\n" + 
				"			],\r\n" + 
				"			\"mobile_phone\": \"+18572064306\",\r\n" + 
				"			\"industry\": \"medical devices\",\r\n" + 
				"			\"job_title\": \"senior lead clinical data manager\",\r\n" + 
				"			\"job_title_role\": \"health\",\r\n" + 
				"			\"job_title_sub_role\": null,\r\n" + 
				"			\"job_title_levels\": [\r\n" + 
				"				\"manager\",\r\n" + 
				"				\"senior\"\r\n" + 
				"			],\r\n" + 
				"			\"job_company_id\": \"iqvia\",\r\n" + 
				"			\"job_company_name\": \"iqvia\",\r\n" + 
				"			\"job_company_website\": \"iqvia.com\",\r\n" + 
				"			\"job_company_size\": \"10001+\",\r\n" + 
				"			\"job_company_founded\": 2016,\r\n" + 
				"			\"job_company_industry\": \"hospital & health care\",\r\n" + 
				"			\"job_company_linkedin_url\": \"linkedin.com/company/iqvia\",\r\n" + 
				"			\"job_company_linkedin_id\": \"4057\",\r\n" + 
				"			\"job_company_facebook_url\": null,\r\n" + 
				"			\"job_company_twitter_url\": null,\r\n" + 
				"			\"job_company_location_name\": \"durham, north carolina, united states\",\r\n" + 
				"			\"job_company_location_locality\": \"durham\",\r\n" + 
				"			\"job_company_location_metro\": \"durham, north carolina\",\r\n" + 
				"			\"job_company_location_region\": \"north carolina\",\r\n" + 
				"			\"job_company_location_geo\": \"35.99,-78.89\",\r\n" + 
				"			\"job_company_location_street_address\": null,\r\n" + 
				"			\"job_company_location_address_line_2\": null,\r\n" + 
				"			\"job_company_location_postal_code\": null,\r\n" + 
				"			\"job_company_location_country\": \"united states\",\r\n" + 
				"			\"job_company_location_continent\": \"north america\",\r\n" + 
				"			\"job_last_updated\": \"2021-12-10\",\r\n" + 
				"			\"job_start_date\": \"2021-03\",\r\n" + 
				"			\"location_name\": \"miguel hidalgo, mexico city, mexico\",\r\n" + 
				"			\"location_locality\": \"miguel hidalgo\",\r\n" + 
				"			\"location_metro\": null,\r\n" + 
				"			\"location_region\": \"mexico city\",\r\n" + 
				"			\"location_country\": \"mexico\",\r\n" + 
				"			\"location_continent\": \"north america\",\r\n" + 
				"			\"location_street_address\": null,\r\n" + 
				"			\"location_address_line_2\": null,\r\n" + 
				"			\"location_postal_code\": null,\r\n" + 
				"			\"location_geo\": \"19.43,-99.20\",\r\n" + 
				"			\"location_last_updated\": \"2021-12-10\",\r\n" + 
				"			\"phone_numbers\": [\r\n" + 
				"				\"+18572064306\"\r\n" + 
				"			],\r\n" + 
				"			\"emails\": [\r\n" + 
				"				{\r\n" + 
				"					\"address\": \"gabrielmoreno_lomelin@hotmail.com\",\r\n" + 
				"					\"type\": \"personal\"\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"interests\": [\r\n" + 
				"				\"politics\",\r\n" + 
				"				\"education\",\r\n" + 
				"				\"environment\",\r\n" + 
				"				\"science and technology\",\r\n" + 
				"				\"health\"\r\n" + 
				"			],\r\n" + 
				"			\"skills\": [\r\n" + 
				"				\"good practices\",\r\n" + 
				"				\"computer system validation\",\r\n" + 
				"				\"scientific research\",\r\n" + 
				"				\"project management\",\r\n" + 
				"				\"training management\",\r\n" + 
				"				\"business development\",\r\n" + 
				"				\"sales\",\r\n" + 
				"				\"leadership\",\r\n" + 
				"				\"team work\",\r\n" + 
				"				\"resources allocation\",\r\n" + 
				"				\"problem solving\",\r\n" + 
				"				\"management\",\r\n" + 
				"				\"molecular biology\",\r\n" + 
				"				\"chemistry\",\r\n" + 
				"				\"strategic planning\",\r\n" + 
				"				\"microsoft office\",\r\n" + 
				"				\"teamwork\",\r\n" + 
				"				\"pharmaceutical industry\",\r\n" + 
				"				\"negotiation\",\r\n" + 
				"				\"team leadership\",\r\n" + 
				"				\"business strategy\",\r\n" + 
				"				\"quality system\",\r\n" + 
				"				\"fda gmp\",\r\n" + 
				"				\"social responsibility\",\r\n" + 
				"				\"international team coordination\",\r\n" + 
				"				\"project planning\",\r\n" + 
				"				\"medical devices\",\r\n" + 
				"				\"laboratory skills\",\r\n" + 
				"				\"gmp\",\r\n" + 
				"				\"time management\",\r\n" + 
				"				\"regulatory compliance\",\r\n" + 
				"				\"regulatory strategy development\",\r\n" + 
				"				\"regulatory projects\",\r\n" + 
				"				\"regulatory audits\",\r\n" + 
				"				\"iso 13485\",\r\n" + 
				"				\"cross functional team leadership\",\r\n" + 
				"				\"quality management\",\r\n" + 
				"				\"quality assurance\",\r\n" + 
				"				\"standard operating procedure\",\r\n" + 
				"				\"computerized system validation\",\r\n" + 
				"				\"process validation\",\r\n" + 
				"				\"u.s. food and drug administration\",\r\n" + 
				"				\"customer service management\",\r\n" + 
				"				\"life science industry\"\r\n" + 
				"			],\r\n" + 
				"			\"location_names\": [\r\n" + 
				"				\"santa clara, california, united states\",\r\n" + 
				"				\"san diego, california, united states\",\r\n" + 
				"				\"vancouver, washington, united states\",\r\n" + 
				"				\"denver, colorado, united states\",\r\n" + 
				"				\"houston, texas, united states\",\r\n" + 
				"				\"cambridge, massachusetts, united states\",\r\n" + 
				"				\"miguel hidalgo, mexico city, mexico\",\r\n" + 
				"				\"brady, texas, united states\",\r\n" + 
				"				\"dublin, dublin, ireland\",\r\n" + 
				"				\"mexico, distrito federal, mexico\"\r\n" + 
				"			],\r\n" + 
				"			\"regions\": [\r\n" + 
				"				\"california, united states\",\r\n" + 
				"				\"colorado, united states\",\r\n" + 
				"				\"mexico city, mexico\",\r\n" + 
				"				\"mexico, mexico\",\r\n" + 
				"				\"distrito federal, mexico\",\r\n" + 
				"				\"dublin, ireland\",\r\n" + 
				"				\"texas, united states\",\r\n" + 
				"				\"washington, united states\",\r\n" + 
				"				\"massachusetts, united states\"\r\n" + 
				"			],\r\n" + 
				"			\"countries\": [\r\n" + 
				"				\"ireland\",\r\n" + 
				"				\"united states\",\r\n" + 
				"				\"canada\",\r\n" + 
				"				\"mexico\"\r\n" + 
				"			],\r\n" + 
				"			\"street_addresses\": [],\r\n" + 
				"			\"experience\": [\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"pharma quality europe s.r.l quality sinergy\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2016\",\r\n" + 
				"					\"start_date\": \"2013\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"business development area manager latam\",\r\n" + 
				"						\"role\": \"sales\",\r\n" + 
				"						\"sub_role\": \"business_development\",\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"manager\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"cofepris\",\r\n" + 
				"						\"size\": \"1001-5000\",\r\n" + 
				"						\"id\": \"cofepris\",\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"cuauhtemoc, zacatecas, mexico\",\r\n" + 
				"							\"locality\": null,\r\n" + 
				"							\"region\": \"zacatecas\",\r\n" + 
				"							\"metro\": null,\r\n" + 
				"							\"country\": \"mexico\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": null,\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": null,\r\n" + 
				"							\"geo\": null\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/cofepris\",\r\n" + 
				"						\"linkedin_id\": \"6790104\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"cofepris.gob.mx\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2018-10\",\r\n" + 
				"					\"start_date\": \"2018-07\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"independent consultant\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"viewmind\",\r\n" + 
				"						\"size\": \"11-50\",\r\n" + 
				"						\"id\": \"viewmind\",\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": \"medical devices\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"argentina\",\r\n" + 
				"							\"locality\": null,\r\n" + 
				"							\"region\": null,\r\n" + 
				"							\"metro\": null,\r\n" + 
				"							\"country\": \"argentina\",\r\n" + 
				"							\"continent\": \"south america\",\r\n" + 
				"							\"street_address\": null,\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": null,\r\n" + 
				"							\"geo\": null\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/viewmind\",\r\n" + 
				"						\"linkedin_id\": \"11286666\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"viewmind.com.ar\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2018-08\",\r\n" + 
				"					\"start_date\": \"2018-07\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"independent consultant\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"xrhealth\",\r\n" + 
				"						\"size\": \"11-50\",\r\n" + 
				"						\"id\": \"xrhealth\",\r\n" + 
				"						\"founded\": 2016,\r\n" + 
				"						\"industry\": \"health, wellness and fitness\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"brookline, massachusetts, united states\",\r\n" + 
				"							\"locality\": \"brookline\",\r\n" + 
				"							\"region\": \"massachusetts\",\r\n" + 
				"							\"metro\": \"boston, massachusetts\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"1330 beacon street\",\r\n" + 
				"							\"address_line_2\": \"suite 209\",\r\n" + 
				"							\"postal_code\": \"02446\",\r\n" + 
				"							\"geo\": \"42.33,-71.12\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/xrhealth\",\r\n" + 
				"						\"linkedin_id\": \"18033972\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"xr.health\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"boston, massachusetts, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2017-08\",\r\n" + 
				"					\"start_date\": \"2017-06\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"qa and fda research graduate intern\",\r\n" + 
				"						\"role\": \"education\",\r\n" + 
				"						\"sub_role\": \"researcher\",\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"training\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"iqvia\",\r\n" + 
				"						\"size\": \"10001+\",\r\n" + 
				"						\"id\": \"iqvia\",\r\n" + 
				"						\"founded\": 2016,\r\n" + 
				"						\"industry\": \"hospital & health care\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"durham, north carolina, united states\",\r\n" + 
				"							\"locality\": \"durham\",\r\n" + 
				"							\"region\": \"north carolina\",\r\n" + 
				"							\"metro\": \"durham, north carolina\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": null,\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": null,\r\n" + 
				"							\"geo\": \"35.99,-78.89\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/iqvia\",\r\n" + 
				"						\"linkedin_id\": \"4057\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"iqvia.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": \"2021-03\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"senior lead clinical data manager\",\r\n" + 
				"						\"role\": \"health\",\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"manager\",\r\n" + 
				"							\"senior\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": true\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"c3internacional s.c\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"boston, massachusetts, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2017-10\",\r\n" + 
				"					\"start_date\": \"2017-08\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"senior consultant\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"senior\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"syneos health (previously inc research/inventiv health)\",\r\n" + 
				"						\"size\": \"10001+\",\r\n" + 
				"						\"id\": \"syneos-health\",\r\n" + 
				"						\"founded\": 2017,\r\n" + 
				"						\"industry\": \"pharmaceuticals\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"morrisville, north carolina, united states\",\r\n" + 
				"							\"locality\": \"morrisville\",\r\n" + 
				"							\"region\": \"north carolina\",\r\n" + 
				"							\"metro\": \"raleigh, north carolina\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"1030 sync street\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"27560\",\r\n" + 
				"							\"geo\": \"35.82,-78.82\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/syneos-health\",\r\n" + 
				"						\"linkedin_id\": \"11408925\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"syneoshealth.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2021-03\",\r\n" + 
				"					\"start_date\": \"2021-01\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"manager, clínical data management\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"manager\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"syneos health (previously inc research/inventiv health)\",\r\n" + 
				"						\"size\": \"10001+\",\r\n" + 
				"						\"id\": \"syneos-health\",\r\n" + 
				"						\"founded\": 2017,\r\n" + 
				"						\"industry\": \"pharmaceuticals\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"morrisville, north carolina, united states\",\r\n" + 
				"							\"locality\": \"morrisville\",\r\n" + 
				"							\"region\": \"north carolina\",\r\n" + 
				"							\"metro\": \"raleigh, north carolina\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"1030 sync street\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"27560\",\r\n" + 
				"							\"geo\": \"35.82,-78.82\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/syneos-health\",\r\n" + 
				"						\"linkedin_id\": \"11408925\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"syneoshealth.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2021-01\",\r\n" + 
				"					\"start_date\": \"2018-10\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"senior clinical project data manager\",\r\n" + 
				"						\"role\": \"health\",\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"manager\",\r\n" + 
				"							\"senior\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"xrhealth\",\r\n" + 
				"						\"size\": \"11-50\",\r\n" + 
				"						\"id\": \"xrhealth\",\r\n" + 
				"						\"founded\": 2016,\r\n" + 
				"						\"industry\": \"health, wellness and fitness\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"brookline, massachusetts, united states\",\r\n" + 
				"							\"locality\": \"brookline\",\r\n" + 
				"							\"region\": \"massachusetts\",\r\n" + 
				"							\"metro\": \"boston, massachusetts\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"1330 beacon street\",\r\n" + 
				"							\"address_line_2\": \"suite 209\",\r\n" + 
				"							\"postal_code\": \"02446\",\r\n" + 
				"							\"geo\": \"42.33,-71.12\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/xrhealth\",\r\n" + 
				"						\"linkedin_id\": \"18033972\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"xr.health\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"boston, massachusetts, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2018-06\",\r\n" + 
				"					\"start_date\": \"2017-10\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"compliance and regulatory strategy senior manager\",\r\n" + 
				"						\"role\": \"legal\",\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"manager\",\r\n" + 
				"							\"senior\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"c&o diseño\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2012-06\",\r\n" + 
				"					\"start_date\": \"2012-02\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"part-time consulting engagement\",\r\n" + 
				"						\"role\": \"marketing\",\r\n" + 
				"						\"sub_role\": \"brand_marketing\",\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"national institute of psyachiatry ramón de la fuente muñiz\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2011-12-01\",\r\n" + 
				"					\"start_date\": \"2011-06-01\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"part-time consulting engagement\",\r\n" + 
				"						\"role\": \"marketing\",\r\n" + 
				"						\"sub_role\": \"brand_marketing\",\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"pharma quality europe\",\r\n" + 
				"						\"size\": \"51-200\",\r\n" + 
				"						\"id\": \"pharma-quality-europe\",\r\n" + 
				"						\"founded\": 1998,\r\n" + 
				"						\"industry\": \"pharmaceuticals\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"reggello, tuscany, italy\",\r\n" + 
				"							\"locality\": \"reggello\",\r\n" + 
				"							\"region\": \"tuscany\",\r\n" + 
				"							\"metro\": null,\r\n" + 
				"							\"country\": \"italy\",\r\n" + 
				"							\"continent\": \"europe\",\r\n" + 
				"							\"street_address\": null,\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": null,\r\n" + 
				"							\"geo\": \"43.67,11.52\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/pharma-quality-europe\",\r\n" + 
				"						\"linkedin_id\": \"84095\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"pqe.eu\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2016-09\",\r\n" + 
				"					\"start_date\": \"2014-04\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"business development area manager latam | project manager and senior consultant\",\r\n" + 
				"						\"role\": \"sales\",\r\n" + 
				"						\"sub_role\": \"business_development\",\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"manager\",\r\n" + 
				"							\"senior\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"pfizer\",\r\n" + 
				"						\"size\": \"10001+\",\r\n" + 
				"						\"id\": \"pfizer\",\r\n" + 
				"						\"founded\": 1848,\r\n" + 
				"						\"industry\": \"pharmaceuticals\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"new york, new york, united states\",\r\n" + 
				"							\"locality\": \"new york\",\r\n" + 
				"							\"region\": \"new york\",\r\n" + 
				"							\"metro\": \"new york, new york\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": null,\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"10017\",\r\n" + 
				"							\"geo\": \"40.71,-74.00\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/pfizer\",\r\n" + 
				"						\"linkedin_id\": \"1185\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": \"twitter.com/pfizer_news\",\r\n" + 
				"						\"website\": \"pfizer.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2014\",\r\n" + 
				"					\"start_date\": \"2012\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"pharmaceuticals sales representative | primary care and vaccines\",\r\n" + 
				"						\"role\": \"sales\",\r\n" + 
				"						\"sub_role\": \"accounts\",\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"education\": [\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"hult international business school\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": \"2ZN9EJAl1Fwq8SAHxGl2EQ_0\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"cambridge, massachusetts, united states\",\r\n" + 
				"							\"locality\": \"cambridge\",\r\n" + 
				"							\"region\": \"massachusetts\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/school/hult-international-business-school\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/hult\",\r\n" + 
				"						\"twitter_url\": \"twitter.com/hult_biz\",\r\n" + 
				"						\"linkedin_id\": \"18487\",\r\n" + 
				"						\"website\": \"hult.edu\",\r\n" + 
				"						\"domain\": \"hult.edu\"\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"2017\",\r\n" + 
				"					\"start_date\": \"2016\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [\r\n" + 
				"						\"master of business administration\",\r\n" + 
				"						\"masters\"\r\n" + 
				"					],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"project management\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"universidad nacional autónoma de méxico\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": \"0B7bDsJEAhCkKh220a3tmQ_0\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"mexico\",\r\n" + 
				"							\"locality\": null,\r\n" + 
				"							\"region\": null,\r\n" + 
				"							\"country\": \"mexico\",\r\n" + 
				"							\"continent\": \"north america\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/school/universidad-nacional-autónoma-de-méxico\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/unam.mx.oficial\",\r\n" + 
				"						\"twitter_url\": \"twitter.com/unam_mx\",\r\n" + 
				"						\"linkedin_id\": \"15271\",\r\n" + 
				"						\"website\": \"unam.mx\",\r\n" + 
				"						\"domain\": \"unam.mx\"\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"2012\",\r\n" + 
				"					\"start_date\": \"2005\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"chemistry\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"profiles\": [\r\n" + 
				"				{\r\n" + 
				"					\"network\": \"linkedin\",\r\n" + 
				"					\"id\": \"153880828\",\r\n" + 
				"					\"url\": \"linkedin.com/in/gabrielmorenol\",\r\n" + 
				"					\"username\": \"gabrielmorenol\"\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"network\": \"linkedin\",\r\n" + 
				"					\"id\": \"153880828\",\r\n" + 
				"					\"url\": \"linkedin.com/in/gabriel-moreno-4a464b43\",\r\n" + 
				"					\"username\": \"gabriel-moreno-4a464b43\"\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"network\": \"facebook\",\r\n" + 
				"					\"id\": \"829214337\",\r\n" + 
				"					\"url\": \"facebook.com/gabriel.moreno.31542\",\r\n" + 
				"					\"username\": \"gabriel.moreno.31542\"\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"version_status\": {\r\n" + 
				"				\"status\": \"\",\r\n" + 
				"				\"contains\": [],\r\n" + 
				"				\"previous_version\": \"\",\r\n" + 
				"				\"current_version\": \"\"\r\n" + 
				"			}\r\n" + 
				"		},\r\n" + 
				"		{\r\n" + 
				"			\"id\": \"lyBFDKgbLr2saoTlcxAz6w_0000\",\r\n" + 
				"			\"full_name\": \"adriana aguerrebere\",\r\n" + 
				"			\"first_name\": \"adriana\",\r\n" + 
				"			\"middle_initial\": null,\r\n" + 
				"			\"middle_name\": null,\r\n" + 
				"			\"last_initial\": \"a\",\r\n" + 
				"			\"last_name\": \"aguerrebere\",\r\n" + 
				"			\"gender\": \"female\",\r\n" + 
				"			\"birth_year\": null,\r\n" + 
				"			\"birth_date\": null,\r\n" + 
				"			\"linkedin_url\": \"linkedin.com/in/adrianaaguerrebere\",\r\n" + 
				"			\"linkedin_username\": \"adrianaaguerrebere\",\r\n" + 
				"			\"linkedin_id\": \"3729114\",\r\n" + 
				"			\"facebook_url\": \"facebook.com/trixilia\",\r\n" + 
				"			\"facebook_username\": \"trixilia\",\r\n" + 
				"			\"facebook_id\": \"752720699\",\r\n" + 
				"			\"twitter_url\": \"twitter.com/trixilia\",\r\n" + 
				"			\"twitter_username\": \"trixilia\",\r\n" + 
				"			\"github_url\": null,\r\n" + 
				"			\"github_username\": null,\r\n" + 
				"			\"work_email\": null,\r\n" + 
				"			\"personal_emails\": [\r\n" + 
				"				\"aaguerrebere@gmail.com\"\r\n" + 
				"			],\r\n" + 
				"			\"mobile_phone\": null,\r\n" + 
				"			\"industry\": \"non-profit organization management\",\r\n" + 
				"			\"job_title\": \"founder and medical doctor\",\r\n" + 
				"			\"job_title_role\": \"health\",\r\n" + 
				"			\"job_title_sub_role\": \"doctor\",\r\n" + 
				"			\"job_title_levels\": [\r\n" + 
				"				\"owner\"\r\n" + 
				"			],\r\n" + 
				"			\"job_company_id\": \"ngoimpacto\",\r\n" + 
				"			\"job_company_name\": \"ngoimpacto\",\r\n" + 
				"			\"job_company_website\": null,\r\n" + 
				"			\"job_company_size\": \"11-50\",\r\n" + 
				"			\"job_company_founded\": 2012,\r\n" + 
				"			\"job_company_industry\": \"civic & social organization\",\r\n" + 
				"			\"job_company_linkedin_url\": \"linkedin.com/company/ngoimpacto\",\r\n" + 
				"			\"job_company_linkedin_id\": \"18275166\",\r\n" + 
				"			\"job_company_facebook_url\": null,\r\n" + 
				"			\"job_company_twitter_url\": null,\r\n" + 
				"			\"job_company_location_name\": \"ciudad de las casas, chiapas, mexico\",\r\n" + 
				"			\"job_company_location_locality\": \"ciudad de las casas\",\r\n" + 
				"			\"job_company_location_metro\": null,\r\n" + 
				"			\"job_company_location_region\": \"chiapas\",\r\n" + 
				"			\"job_company_location_geo\": \"16.75,-92.63\",\r\n" + 
				"			\"job_company_location_street_address\": null,\r\n" + 
				"			\"job_company_location_address_line_2\": null,\r\n" + 
				"			\"job_company_location_postal_code\": null,\r\n" + 
				"			\"job_company_location_country\": \"mexico\",\r\n" + 
				"			\"job_company_location_continent\": \"north america\",\r\n" + 
				"			\"job_last_updated\": \"2021-12-13\",\r\n" + 
				"			\"job_start_date\": \"2012-06\",\r\n" + 
				"			\"location_name\": \"tuxtla gutierrez, chiapas, mexico\",\r\n" + 
				"			\"location_locality\": \"tuxtla gutierrez\",\r\n" + 
				"			\"location_metro\": null,\r\n" + 
				"			\"location_region\": \"chiapas\",\r\n" + 
				"			\"location_country\": \"mexico\",\r\n" + 
				"			\"location_continent\": \"north america\",\r\n" + 
				"			\"location_street_address\": null,\r\n" + 
				"			\"location_address_line_2\": null,\r\n" + 
				"			\"location_postal_code\": null,\r\n" + 
				"			\"location_geo\": \"16.75,-93.11\",\r\n" + 
				"			\"location_last_updated\": \"2021-12-13\",\r\n" + 
				"			\"phone_numbers\": [\r\n" + 
				"				\"+13123370683\"\r\n" + 
				"			],\r\n" + 
				"			\"emails\": [\r\n" + 
				"				{\r\n" + 
				"					\"address\": \"aaguerrebere@gmail.com\",\r\n" + 
				"					\"type\": \"personal\"\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"interests\": [\r\n" + 
				"				\"community wealth generation\",\r\n" + 
				"				\"walk trekked mount kilimanjaro\",\r\n" + 
				"				\"social work\"\r\n" + 
				"			],\r\n" + 
				"			\"skills\": [\r\n" + 
				"				\"strategy\",\r\n" + 
				"				\"entrepreneurship\",\r\n" + 
				"				\"strategic planning\",\r\n" + 
				"				\"business strategy\",\r\n" + 
				"				\"leadership\",\r\n" + 
				"				\"marketing strategy\",\r\n" + 
				"				\"management\",\r\n" + 
				"				\"competitive analysis\",\r\n" + 
				"				\"business planning\",\r\n" + 
				"				\"management consulting\",\r\n" + 
				"				\"business development\",\r\n" + 
				"				\"cross functional team leadership\",\r\n" + 
				"				\"marketing\",\r\n" + 
				"				\"nonprofits\",\r\n" + 
				"				\"crm\",\r\n" + 
				"				\"consulting\",\r\n" + 
				"				\"strategic partnerships\",\r\n" + 
				"				\"fundraising\",\r\n" + 
				"				\"program management\",\r\n" + 
				"				\"integrated marketing\",\r\n" + 
				"				\"start ups\",\r\n" + 
				"				\"corporate social responsibility\",\r\n" + 
				"				\"executive management\",\r\n" + 
				"				\"strategic thinking\"\r\n" + 
				"			],\r\n" + 
				"			\"location_names\": [\r\n" + 
				"				\"chicago, illinois, united states\",\r\n" + 
				"				\"monterrey, nuevo leon, mexico\",\r\n" + 
				"				\"tuxtla gutierrez, chiapas, mexico\",\r\n" + 
				"				\"ciudad de las casas, chiapas, mexico\"\r\n" + 
				"			],\r\n" + 
				"			\"regions\": [\r\n" + 
				"				\"central luzon, philippines\",\r\n" + 
				"				\"mexico city, mexico\",\r\n" + 
				"				\"illinois, united states\",\r\n" + 
				"				\"nuevo leon, mexico\",\r\n" + 
				"				\"chiapas, mexico\"\r\n" + 
				"			],\r\n" + 
				"			\"countries\": [\r\n" + 
				"				\"belize\",\r\n" + 
				"				\"united states\",\r\n" + 
				"				\"mexico\",\r\n" + 
				"				\"philippines\"\r\n" + 
				"			],\r\n" + 
				"			\"street_addresses\": [\r\n" + 
				"				{\r\n" + 
				"					\"name\": \"chicago, illinois, united states\",\r\n" + 
				"					\"locality\": \"chicago\",\r\n" + 
				"					\"region\": \"illinois\",\r\n" + 
				"					\"metro\": \"chicago, illinois\",\r\n" + 
				"					\"country\": \"united states\",\r\n" + 
				"					\"continent\": \"north america\",\r\n" + 
				"					\"street_address\": \"1511 north mohawk street\",\r\n" + 
				"					\"address_line_2\": null,\r\n" + 
				"					\"postal_code\": \"60610\",\r\n" + 
				"					\"geo\": \"41.85,-87.65\"\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"experience\": [\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"foro para el desarrollo sustentable en chiapas a.c\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"start_date\": \"2009-01\",\r\n" + 
				"					\"end_date\": \"2010-02\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"project leader\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"manager\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"industrias jofre\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"start_date\": \"1991-03\",\r\n" + 
				"					\"end_date\": \"1996-08\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"founder and chief executive officer\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"owner\",\r\n" + 
				"							\"cxo\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"el colegio de la frontera sur ecosur\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2012-02\",\r\n" + 
				"					\"start_date\": \"2009-09\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"fundraising strategist\",\r\n" + 
				"						\"role\": \"operations\",\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"product\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"london, england, united kingdom\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2006-08\",\r\n" + 
				"					\"start_date\": \"2006-02\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"project manager\",\r\n" + 
				"						\"role\": \"operations\",\r\n" + 
				"						\"sub_role\": \"project_management\",\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"amigos de san cristóbal a.c\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": \"2011-03\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"board member\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"partner\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"motorola\",\r\n" + 
				"						\"size\": \"1001-5000\",\r\n" + 
				"						\"id\": \"motorola-mobility\",\r\n" + 
				"						\"founded\": 1928,\r\n" + 
				"						\"industry\": \"consumer electronics\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"chicago, illinois, united states\",\r\n" + 
				"							\"locality\": \"chicago\",\r\n" + 
				"							\"region\": \"illinois\",\r\n" + 
				"							\"metro\": \"chicago, illinois\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"222 west merchandise mart plaza\",\r\n" + 
				"							\"address_line_2\": \"suite 1800\",\r\n" + 
				"							\"postal_code\": \"60654\",\r\n" + 
				"							\"geo\": \"41.85,-87.65\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/motorola-mobility\",\r\n" + 
				"						\"linkedin_id\": \"1066\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/motousa\",\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"motorola.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2004-12\",\r\n" + 
				"					\"start_date\": \"2003-03\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"global marketing director\",\r\n" + 
				"						\"role\": \"marketing\",\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"director\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"mercer management consulting\",\r\n" + 
				"						\"size\": \"1001-5000\",\r\n" + 
				"						\"id\": \"mercer-management-consulting\",\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": \"management consulting\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"united states\",\r\n" + 
				"							\"locality\": null,\r\n" + 
				"							\"region\": null,\r\n" + 
				"							\"metro\": null,\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": null,\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": null,\r\n" + 
				"							\"geo\": null\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/mercer-management-consulting\",\r\n" + 
				"						\"linkedin_id\": \"2453\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"1998-08\",\r\n" + 
				"					\"start_date\": \"1996-09\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"senior associate\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"senior\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"e*trade\",\r\n" + 
				"						\"size\": \"1001-5000\",\r\n" + 
				"						\"id\": \"etrade\",\r\n" + 
				"						\"founded\": 1982,\r\n" + 
				"						\"industry\": \"financial services\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"united states\",\r\n" + 
				"							\"locality\": null,\r\n" + 
				"							\"region\": null,\r\n" + 
				"							\"metro\": null,\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": null,\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": null,\r\n" + 
				"							\"geo\": null\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/etrade\",\r\n" + 
				"						\"linkedin_id\": \"3030\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/etrade\",\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"etrade.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"london, greater london, united kingdom\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2008-11\",\r\n" + 
				"					\"start_date\": \"2006-12\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"international marketing director, brand and comms\",\r\n" + 
				"						\"role\": \"marketing\",\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"director\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"motorola\",\r\n" + 
				"						\"size\": \"1001-5000\",\r\n" + 
				"						\"id\": \"motorola-mobility\",\r\n" + 
				"						\"founded\": 1928,\r\n" + 
				"						\"industry\": \"consumer electronics\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"chicago, illinois, united states\",\r\n" + 
				"							\"locality\": \"chicago\",\r\n" + 
				"							\"region\": \"illinois\",\r\n" + 
				"							\"metro\": \"chicago, illinois\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"222 west merchandise mart plaza\",\r\n" + 
				"							\"address_line_2\": \"suite 1800\",\r\n" + 
				"							\"postal_code\": \"60654\",\r\n" + 
				"							\"geo\": \"41.85,-87.65\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/motorola-mobility\",\r\n" + 
				"						\"linkedin_id\": \"1066\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/motousa\",\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"motorola.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2003-02\",\r\n" + 
				"					\"start_date\": \"2000-09\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"global marketing strategy manager\",\r\n" + 
				"						\"role\": \"marketing\",\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"manager\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"ngoimpacto\",\r\n" + 
				"						\"size\": \"11-50\",\r\n" + 
				"						\"id\": \"ngoimpacto\",\r\n" + 
				"						\"founded\": 2012,\r\n" + 
				"						\"industry\": \"civic & social organization\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"ciudad de las casas, chiapas, mexico\",\r\n" + 
				"							\"locality\": \"ciudad de las casas\",\r\n" + 
				"							\"region\": \"chiapas\",\r\n" + 
				"							\"metro\": null,\r\n" + 
				"							\"country\": \"mexico\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": null,\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": null,\r\n" + 
				"							\"geo\": \"16.75,-92.63\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/ngoimpacto\",\r\n" + 
				"						\"linkedin_id\": \"18275166\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": \"2012-06\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"founder and medical doctor\",\r\n" + 
				"						\"role\": \"health\",\r\n" + 
				"						\"sub_role\": \"doctor\",\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"owner\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": true\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"pronatura a.c\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": \"2010-02\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"fundraiser coordinator\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"education\": [\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"american school\",\r\n" + 
				"						\"type\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"website\": null,\r\n" + 
				"						\"domain\": null\r\n" + 
				"					},\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"start_date\": null,\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"majors\": [],\r\n" + 
				"					\"minors\": [],\r\n" + 
				"					\"gpa\": null\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"northwestern university\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"website\": null,\r\n" + 
				"						\"domain\": null\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"2000\",\r\n" + 
				"					\"start_date\": null,\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [\r\n" + 
				"						\"master of business administration\",\r\n" + 
				"						\"masters\"\r\n" + 
				"					],\r\n" + 
				"					\"majors\": [],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"kellogg graduate school of management\",\r\n" + 
				"						\"type\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"website\": null,\r\n" + 
				"						\"domain\": null\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": null,\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [\r\n" + 
				"						\"master of business administration\",\r\n" + 
				"						\"masters\"\r\n" + 
				"					],\r\n" + 
				"					\"majors\": [],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"universidad de las americas, puebla\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"website\": null,\r\n" + 
				"						\"domain\": null\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"1990\",\r\n" + 
				"					\"start_date\": \"1985\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"industrial engineering\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"universidad de las americas, puebla\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"website\": null,\r\n" + 
				"						\"domain\": null\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"1996\",\r\n" + 
				"					\"start_date\": \"1992\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [\r\n" + 
				"						\"masters\"\r\n" + 
				"					],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"finance\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"universidad de las américas puebla\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": \"-t3okRBvBXS0aOOdVWTzhg_0\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"san andres cholula, puebla, mexico\",\r\n" + 
				"							\"locality\": \"san andres cholula\",\r\n" + 
				"							\"region\": \"puebla\",\r\n" + 
				"							\"country\": \"mexico\",\r\n" + 
				"							\"continent\": \"north america\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/school/fundación-universidad-de-las-américas-puebla\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/universidaddelasamericaspuebla\",\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": \"15004\",\r\n" + 
				"						\"website\": \"udlap.mx\",\r\n" + 
				"						\"domain\": \"udlap.mx\"\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"1996\",\r\n" + 
				"					\"start_date\": \"1992\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [\r\n" + 
				"						\"master of science\",\r\n" + 
				"						\"masters\"\r\n" + 
				"					],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"finance\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"universidad de las américas puebla\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": \"-t3okRBvBXS0aOOdVWTzhg_0\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"san andres cholula, puebla, mexico\",\r\n" + 
				"							\"locality\": \"san andres cholula\",\r\n" + 
				"							\"region\": \"puebla\",\r\n" + 
				"							\"country\": \"mexico\",\r\n" + 
				"							\"continent\": \"north america\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/school/fundación-universidad-de-las-américas-puebla\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/universidaddelasamericaspuebla\",\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": \"15004\",\r\n" + 
				"						\"website\": \"udlap.mx\",\r\n" + 
				"						\"domain\": \"udlap.mx\"\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"1990\",\r\n" + 
				"					\"start_date\": \"1985\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"industrial engineering\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"northwestern university - kellogg school of management\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": \"9Ogc-ljuh9ic5RPInzFauQ_0\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"evanston, illinois, united states\",\r\n" + 
				"							\"locality\": \"evanston\",\r\n" + 
				"							\"region\": \"illinois\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/school/kellogg-school-of-management\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": \"18291\",\r\n" + 
				"						\"website\": \"kellogg.northwestern.edu\",\r\n" + 
				"						\"domain\": \"northwestern.edu\"\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"2000\",\r\n" + 
				"					\"start_date\": \"1998-09\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [\r\n" + 
				"						\"master of business administration\",\r\n" + 
				"						\"masters\"\r\n" + 
				"					],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"marketing\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"profiles\": [\r\n" + 
				"				{\r\n" + 
				"					\"network\": \"linkedin\",\r\n" + 
				"					\"id\": \"3729114\",\r\n" + 
				"					\"url\": \"linkedin.com/in/adrianaaguerrebere\",\r\n" + 
				"					\"username\": \"adrianaaguerrebere\"\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"network\": \"facebook\",\r\n" + 
				"					\"id\": \"752720699\",\r\n" + 
				"					\"url\": \"facebook.com/trixilia\",\r\n" + 
				"					\"username\": \"trixilia\"\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"network\": \"twitter\",\r\n" + 
				"					\"id\": null,\r\n" + 
				"					\"url\": \"twitter.com/trixilia\",\r\n" + 
				"					\"username\": \"trixilia\"\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"version_status\": {\r\n" + 
				"				\"status\": \"\",\r\n" + 
				"				\"contains\": [],\r\n" + 
				"				\"previous_version\": \"\",\r\n" + 
				"				\"current_version\": \"\"\r\n" + 
				"			}\r\n" + 
				"		},\r\n" + 
				"		{\r\n" + 
				"			\"id\": \"4EHa5oBMnglSNaRtq9JukA_0000\",\r\n" + 
				"			\"full_name\": \"diana letts\",\r\n" + 
				"			\"first_name\": \"diana\",\r\n" + 
				"			\"middle_initial\": \"m\",\r\n" + 
				"			\"middle_name\": \"marceil cecelia\",\r\n" + 
				"			\"last_initial\": \"l\",\r\n" + 
				"			\"last_name\": \"letts\",\r\n" + 
				"			\"gender\": \"female\",\r\n" + 
				"			\"birth_year\": 1988,\r\n" + 
				"			\"birth_date\": null,\r\n" + 
				"			\"linkedin_url\": \"linkedin.com/in/dianamletts\",\r\n" + 
				"			\"linkedin_username\": \"dianamletts\",\r\n" + 
				"			\"linkedin_id\": \"163429614\",\r\n" + 
				"			\"facebook_url\": \"facebook.com/dianamarceilia\",\r\n" + 
				"			\"facebook_username\": \"dianamarceilia\",\r\n" + 
				"			\"facebook_id\": \"1493580522\",\r\n" + 
				"			\"twitter_url\": \"twitter.com/dianamarceil\",\r\n" + 
				"			\"twitter_username\": \"dianamarceil\",\r\n" + 
				"			\"github_url\": null,\r\n" + 
				"			\"github_username\": null,\r\n" + 
				"			\"work_email\": null,\r\n" + 
				"			\"personal_emails\": [\r\n" + 
				"				\"dianamcletts@gmail.com\"\r\n" + 
				"			],\r\n" + 
				"			\"mobile_phone\": \"+18434607839\",\r\n" + 
				"			\"industry\": \"health, wellness and fitness\",\r\n" + 
				"			\"job_title\": \"health and wellness coach\",\r\n" + 
				"			\"job_title_role\": \"health\",\r\n" + 
				"			\"job_title_sub_role\": \"wellness\",\r\n" + 
				"			\"job_title_levels\": [],\r\n" + 
				"			\"job_company_id\": null,\r\n" + 
				"			\"job_company_name\": \"majesty organix per contract\",\r\n" + 
				"			\"job_company_website\": null,\r\n" + 
				"			\"job_company_size\": null,\r\n" + 
				"			\"job_company_founded\": null,\r\n" + 
				"			\"job_company_industry\": null,\r\n" + 
				"			\"job_company_linkedin_url\": null,\r\n" + 
				"			\"job_company_linkedin_id\": null,\r\n" + 
				"			\"job_company_facebook_url\": null,\r\n" + 
				"			\"job_company_twitter_url\": null,\r\n" + 
				"			\"job_company_location_name\": null,\r\n" + 
				"			\"job_company_location_locality\": null,\r\n" + 
				"			\"job_company_location_metro\": null,\r\n" + 
				"			\"job_company_location_region\": null,\r\n" + 
				"			\"job_company_location_geo\": null,\r\n" + 
				"			\"job_company_location_street_address\": null,\r\n" + 
				"			\"job_company_location_address_line_2\": null,\r\n" + 
				"			\"job_company_location_postal_code\": null,\r\n" + 
				"			\"job_company_location_country\": null,\r\n" + 
				"			\"job_company_location_continent\": null,\r\n" + 
				"			\"job_last_updated\": \"2021-12-09\",\r\n" + 
				"			\"job_start_date\": null,\r\n" + 
				"			\"location_name\": \"san miguel de allende, guanajuato, mexico\",\r\n" + 
				"			\"location_locality\": \"san miguel de allende\",\r\n" + 
				"			\"location_metro\": null,\r\n" + 
				"			\"location_region\": \"guanajuato\",\r\n" + 
				"			\"location_country\": \"mexico\",\r\n" + 
				"			\"location_continent\": \"north america\",\r\n" + 
				"			\"location_street_address\": null,\r\n" + 
				"			\"location_address_line_2\": null,\r\n" + 
				"			\"location_postal_code\": null,\r\n" + 
				"			\"location_geo\": \"20.91,-100.74\",\r\n" + 
				"			\"location_last_updated\": \"2021-12-10\",\r\n" + 
				"			\"phone_numbers\": [\r\n" + 
				"				\"+19728704800\",\r\n" + 
				"				\"+18434607839\"\r\n" + 
				"			],\r\n" + 
				"			\"emails\": [\r\n" + 
				"				{\r\n" + 
				"					\"address\": \"dianamcletts@gmail.com\",\r\n" + 
				"					\"type\": \"personal\"\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"address\": \"diana.letts@mosaic.com\",\r\n" + 
				"					\"type\": \"professional\"\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"interests\": [\r\n" + 
				"				\"social services\",\r\n" + 
				"				\"children\",\r\n" + 
				"				\"economic empowerment\",\r\n" + 
				"				\"civil rights and social action\",\r\n" + 
				"				\"politics\",\r\n" + 
				"				\"education\",\r\n" + 
				"				\"environment\",\r\n" + 
				"				\"poverty alleviation\",\r\n" + 
				"				\"science and technology\",\r\n" + 
				"				\"disaster and humanitarian relief\",\r\n" + 
				"				\"human rights\",\r\n" + 
				"				\"animal welfare\",\r\n" + 
				"				\"arts and culture\",\r\n" + 
				"				\"health\"\r\n" + 
				"			],\r\n" + 
				"			\"skills\": [\r\n" + 
				"				\"event management\",\r\n" + 
				"				\"publicity\",\r\n" + 
				"				\"strategic alliances\",\r\n" + 
				"				\"press releases\",\r\n" + 
				"				\"fundraising\",\r\n" + 
				"				\"photography\",\r\n" + 
				"				\"editing\",\r\n" + 
				"				\"social media strategist\",\r\n" + 
				"				\"magazines\",\r\n" + 
				"				\"blogging\",\r\n" + 
				"				\"newsletters\",\r\n" + 
				"				\"social media consulting\",\r\n" + 
				"				\"coordinating events\",\r\n" + 
				"				\"event producing\",\r\n" + 
				"				\"facebook marketing\",\r\n" + 
				"				\"instagram\",\r\n" + 
				"				\"google analytics\",\r\n" + 
				"				\"promotional solutions\",\r\n" + 
				"				\"twitter\",\r\n" + 
				"				\"indesign\",\r\n" + 
				"				\"web design\",\r\n" + 
				"				\"acting\",\r\n" + 
				"				\"yoga\",\r\n" + 
				"				\"new business development\",\r\n" + 
				"				\"creative entrepreneurship\",\r\n" + 
				"				\"team leadership\",\r\n" + 
				"				\"travel management\",\r\n" + 
				"				\"strategic consulting\",\r\n" + 
				"				\"digital marketing\",\r\n" + 
				"				\"creative arts\",\r\n" + 
				"				\"image consulting\",\r\n" + 
				"				\"brand development\",\r\n" + 
				"				\"media and entertainment\",\r\n" + 
				"				\"casting\",\r\n" + 
				"				\"budget monitoring\",\r\n" + 
				"				\"directing talent\",\r\n" + 
				"				\"dual citizenship\",\r\n" + 
				"				\"corporate social responsibility\",\r\n" + 
				"				\"social networking\",\r\n" + 
				"				\"market research\",\r\n" + 
				"				\"benefits negotiation\",\r\n" + 
				"				\"international relations\",\r\n" + 
				"				\"strategic planning\",\r\n" + 
				"				\"event production\",\r\n" + 
				"				\"event planning\",\r\n" + 
				"				\"creative direction\",\r\n" + 
				"				\"content development\",\r\n" + 
				"				\"brand implementation\",\r\n" + 
				"				\"integrated marketing\",\r\n" + 
				"				\"salesforce.com\"\r\n" + 
				"			],\r\n" + 
				"			\"location_names\": [\r\n" + 
				"				\"parsippany, new jersey, united states\",\r\n" + 
				"				\"isle of palms, south carolina, united states\",\r\n" + 
				"				\"charleston, south carolina, united states\",\r\n" + 
				"				\"northampton, northamptonshire, united kingdom\",\r\n" + 
				"				\"rio de janeiro, rio de janeiro, brazil\",\r\n" + 
				"				\"north charleston, south carolina, united states\",\r\n" + 
				"				\"san miguel de allende, guanajuato, mexico\",\r\n" + 
				"				\"mount pleasant, south carolina, united states\"\r\n" + 
				"			],\r\n" + 
				"			\"regions\": [\r\n" + 
				"				\"rio de janeiro, brazil\",\r\n" + 
				"				\"northamptonshire, united kingdom\",\r\n" + 
				"				\"new jersey, united states\",\r\n" + 
				"				\"south carolina, united states\",\r\n" + 
				"				\"guanajuato, mexico\"\r\n" + 
				"			],\r\n" + 
				"			\"countries\": [\r\n" + 
				"				\"mexico\",\r\n" + 
				"				\"indonesia\",\r\n" + 
				"				\"brazil\",\r\n" + 
				"				\"united kingdom\",\r\n" + 
				"				\"united states\"\r\n" + 
				"			],\r\n" + 
				"			\"street_addresses\": [],\r\n" + 
				"			\"experience\": [\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"majesty organix per contract\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": null,\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"health and wellness coach\",\r\n" + 
				"						\"role\": \"health\",\r\n" + 
				"						\"sub_role\": \"wellness\",\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": true\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"itutorgroup\",\r\n" + 
				"						\"size\": \"1-10\",\r\n" + 
				"						\"id\": \"itutorgroup\",\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/itutorgroup\",\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": \"2018-11\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"english second language teacher\",\r\n" + 
				"						\"role\": \"education\",\r\n" + 
				"						\"sub_role\": \"teacher\",\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"i2 education\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"shenzhen, guangdong, china\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2019-11\",\r\n" + 
				"					\"start_date\": \"2019-07\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"english second language teacher\",\r\n" + 
				"						\"role\": \"education\",\r\n" + 
				"						\"sub_role\": \"teacher\",\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"seeking new agency/representation for the global market\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": \"2013-08\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"actress | director\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"director\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"per contract\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": \"2009-01\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"brand consultant\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"the forest house\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [],\r\n" + 
				"					\"end_date\": \"2016-12\",\r\n" + 
				"					\"start_date\": \"2016-11\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"social media specialist\",\r\n" + 
				"						\"role\": \"media\",\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"clarion hotel hospitality staff duvall catering & event design snelling snyder events\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2008-12\",\r\n" + 
				"					\"start_date\": \"2002-01\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"event hostess, banquet server\",\r\n" + 
				"						\"role\": \"public_relations\",\r\n" + 
				"						\"sub_role\": \"events\",\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"london hair salon\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2007-11\",\r\n" + 
				"					\"start_date\": \"2004-05\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"hair model\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"carmen borja entertainment\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2004-12\",\r\n" + 
				"					\"start_date\": \"2001-01\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"performer\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"per contract\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": \"2009-01\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"brand activation manager\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"manager\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"northwest services\",\r\n" + 
				"						\"size\": \"1-10\",\r\n" + 
				"						\"id\": \"northwest-services\",\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": \"education management\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"alanson, michigan, united states\",\r\n" + 
				"							\"locality\": \"alanson\",\r\n" + 
				"							\"region\": \"michigan\",\r\n" + 
				"							\"metro\": null,\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"7463 north conway road\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"49706\",\r\n" + 
				"							\"geo\": \"45.44,-84.78\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/northwest-services\",\r\n" + 
				"						\"linkedin_id\": \"4527235\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"nmhsi.org\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2016-02\",\r\n" + 
				"					\"start_date\": \"2015-08\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"local coordinator\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"fitletic, llc\",\r\n" + 
				"						\"size\": \"51-200\",\r\n" + 
				"						\"id\": \"ifitness-inc\",\r\n" + 
				"						\"founded\": 2008,\r\n" + 
				"						\"industry\": \"sporting goods\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"north miami beach, florida, united states\",\r\n" + 
				"							\"locality\": \"north miami beach\",\r\n" + 
				"							\"region\": \"florida\",\r\n" + 
				"							\"metro\": \"miami, florida\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"1891 northeast 146th street\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"33162\",\r\n" + 
				"							\"geo\": \"25.93,-80.16\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/ifitness-inc\",\r\n" + 
				"						\"linkedin_id\": \"851139\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": \"twitter.com/fitletic\",\r\n" + 
				"						\"website\": \"fitletic.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2015-02\",\r\n" + 
				"					\"start_date\": \"2014-02\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"brand ambassador\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"fourfour pictures\",\r\n" + 
				"						\"size\": \"11-50\",\r\n" + 
				"						\"id\": \"fourfour-pictures\",\r\n" + 
				"						\"founded\": 2013,\r\n" + 
				"						\"industry\": \"entertainment\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"troy, michigan, united states\",\r\n" + 
				"							\"locality\": \"troy\",\r\n" + 
				"							\"region\": \"michigan\",\r\n" + 
				"							\"metro\": \"detroit, michigan\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": null,\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": null,\r\n" + 
				"							\"geo\": \"42.60,-83.15\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/fourfour-pictures\",\r\n" + 
				"						\"linkedin_id\": \"3266870\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"fourfourpictures.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2014-06\",\r\n" + 
				"					\"start_date\": \"2014-05\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"assistant director\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"midlands center for expressive arts\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"columbia, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2012-11\",\r\n" + 
				"					\"start_date\": \"2012-08\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"social media manager, events coordinator\",\r\n" + 
				"						\"role\": \"public_relations\",\r\n" + 
				"						\"sub_role\": \"events\",\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"manager\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"carolina fitness\",\r\n" + 
				"						\"size\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": null\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2012-02\",\r\n" + 
				"					\"start_date\": \"2011-07\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"marketing and public relations consultant\",\r\n" + 
				"						\"role\": \"marketing\",\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"jamaican me tan\",\r\n" + 
				"						\"size\": \"1-10\",\r\n" + 
				"						\"id\": \"jamaican-me-tan\",\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": null,\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"vancouver, washington, united states\",\r\n" + 
				"							\"locality\": \"vancouver\",\r\n" + 
				"							\"region\": \"washington\",\r\n" + 
				"							\"metro\": \"portland, oregon\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"14200 northeast 53rd street\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"98682\",\r\n" + 
				"							\"geo\": \"45.63,-122.66\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/jamaican-me-tan\",\r\n" + 
				"						\"linkedin_id\": \"9830020\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"jamaicanmetanmo.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2010-05\",\r\n" + 
				"					\"start_date\": \"2009-07\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"key-holder, sales associate\",\r\n" + 
				"						\"role\": \"sales\",\r\n" + 
				"						\"sub_role\": \"accounts\",\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"bravo tv\",\r\n" + 
				"						\"size\": \"201-500\",\r\n" + 
				"						\"id\": \"bravo-tv\",\r\n" + 
				"						\"founded\": null,\r\n" + 
				"						\"industry\": \"entertainment\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"new york, new york, united states\",\r\n" + 
				"							\"locality\": \"new york\",\r\n" + 
				"							\"region\": \"new york\",\r\n" + 
				"							\"metro\": \"new york, new york\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": null,\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": null,\r\n" + 
				"							\"geo\": \"40.71,-74.00\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/bravo-tv\",\r\n" + 
				"						\"linkedin_id\": \"1558249\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": \"twitter.com/bravotv\",\r\n" + 
				"						\"website\": \"bravotv.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2016-05\",\r\n" + 
				"					\"start_date\": \"2016-05\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"production assistant\",\r\n" + 
				"						\"role\": \"media\",\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"doublz\",\r\n" + 
				"						\"size\": \"1-10\",\r\n" + 
				"						\"id\": \"doublz\",\r\n" + 
				"						\"founded\": 2014,\r\n" + 
				"						\"industry\": \"computer software\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"charleston, south carolina, united states\",\r\n" + 
				"							\"locality\": \"charleston\",\r\n" + 
				"							\"region\": \"south carolina\",\r\n" + 
				"							\"metro\": \"charleston, south carolina\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"78 alexander street\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"29403\",\r\n" + 
				"							\"geo\": \"32.77,-79.93\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/doublz\",\r\n" + 
				"						\"linkedin_id\": \"10062607\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"website\": \"getdoublz.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2015-11\",\r\n" + 
				"					\"start_date\": \"2015-09\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"brand ambassador\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"damy health\",\r\n" + 
				"						\"size\": \"1-10\",\r\n" + 
				"						\"id\": \"damy-health\",\r\n" + 
				"						\"founded\": 2009,\r\n" + 
				"						\"industry\": \"health, wellness and fitness\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"new westminster, british columbia, canada\",\r\n" + 
				"							\"locality\": \"new westminster\",\r\n" + 
				"							\"region\": \"british columbia\",\r\n" + 
				"							\"metro\": null,\r\n" + 
				"							\"country\": \"canada\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": null,\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": null,\r\n" + 
				"							\"geo\": \"49.20,-122.91\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/damy-health\",\r\n" + 
				"						\"linkedin_id\": \"2100728\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": \"twitter.com/damyhealth\",\r\n" + 
				"						\"website\": \"damyhealth.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2016-09\",\r\n" + 
				"					\"start_date\": \"2014-09\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"brand ambassador\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"vaya island\",\r\n" + 
				"						\"size\": \"11-50\",\r\n" + 
				"						\"id\": \"vaya-clothing-accessories\",\r\n" + 
				"						\"founded\": 2015,\r\n" + 
				"						\"industry\": \"apparel & fashion\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"longmeadow, massachusetts, united states\",\r\n" + 
				"							\"locality\": \"longmeadow\",\r\n" + 
				"							\"region\": \"massachusetts\",\r\n" + 
				"							\"metro\": \"springfield, massachusetts\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"817 williams street\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"01106\",\r\n" + 
				"							\"geo\": \"42.05,-72.58\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/vaya-clothing-accessories\",\r\n" + 
				"						\"linkedin_id\": \"9340044\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": \"twitter.com/vaya_official\",\r\n" + 
				"						\"website\": \"vayalifestyle.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2016-08\",\r\n" + 
				"					\"start_date\": \"2015-07\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"brand representative\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"pura vida bracelets\",\r\n" + 
				"						\"size\": \"11-50\",\r\n" + 
				"						\"id\": \"pura-vida-bracelets\",\r\n" + 
				"						\"founded\": 2010,\r\n" + 
				"						\"industry\": \"retail\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"la jolla, california, united states\",\r\n" + 
				"							\"locality\": \"la jolla\",\r\n" + 
				"							\"region\": \"california\",\r\n" + 
				"							\"metro\": \"san diego, california\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"1025 prospect street\",\r\n" + 
				"							\"address_line_2\": \"#350\",\r\n" + 
				"							\"postal_code\": \"92037\",\r\n" + 
				"							\"geo\": \"32.84,-117.27\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/pura-vida-bracelets\",\r\n" + 
				"						\"linkedin_id\": \"7597298\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": \"twitter.com/puravidabrac\",\r\n" + 
				"						\"website\": \"puravidabracelets.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"la jolla, california, united states\",\r\n" + 
				"						\"san diego, california, united states\",\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2017-01\",\r\n" + 
				"					\"start_date\": \"2015-06-01\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"brand representative\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"benefitfocus\",\r\n" + 
				"						\"size\": \"1001-5000\",\r\n" + 
				"						\"id\": \"benefitfocus\",\r\n" + 
				"						\"founded\": 2000,\r\n" + 
				"						\"industry\": \"computer software\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"charleston, south carolina, united states\",\r\n" + 
				"							\"locality\": \"charleston\",\r\n" + 
				"							\"region\": \"south carolina\",\r\n" + 
				"							\"metro\": \"charleston, south carolina\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"100 benefitfocus way\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"29492\",\r\n" + 
				"							\"geo\": \"32.77,-79.93\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/benefitfocus\",\r\n" + 
				"						\"linkedin_id\": \"13633\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": \"twitter.com/benefitfocus\",\r\n" + 
				"						\"website\": \"benefitfocus.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"charleston, south carolina, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2015-12\",\r\n" + 
				"					\"start_date\": \"2015-08\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"application consultant\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": []\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"company\": {\r\n" + 
				"						\"name\": \"mosaic sales solutions\",\r\n" + 
				"						\"size\": \"5001-10000\",\r\n" + 
				"						\"id\": \"mosaic-sales-solutions\",\r\n" + 
				"						\"founded\": 1986,\r\n" + 
				"						\"industry\": \"marketing and advertising\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"chicago, illinois, united states\",\r\n" + 
				"							\"locality\": \"chicago\",\r\n" + 
				"							\"region\": \"illinois\",\r\n" + 
				"							\"metro\": \"chicago, illinois\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\",\r\n" + 
				"							\"street_address\": \"320 north elizabeth street\",\r\n" + 
				"							\"address_line_2\": null,\r\n" + 
				"							\"postal_code\": \"60607\",\r\n" + 
				"							\"geo\": \"41.85,-87.65\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/company/mosaic-sales-solutions\",\r\n" + 
				"						\"linkedin_id\": \"313622\",\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": \"twitter.com/mosaicna\",\r\n" + 
				"						\"website\": \"mosaic.com\"\r\n" + 
				"					},\r\n" + 
				"					\"location_names\": [\r\n" + 
				"						\"irving, texas, united states\",\r\n" + 
				"						\"irving, texas, united states\"\r\n" + 
				"					],\r\n" + 
				"					\"end_date\": \"2017-01\",\r\n" + 
				"					\"start_date\": \"2016-04\",\r\n" + 
				"					\"title\": {\r\n" + 
				"						\"name\": \"team lead\",\r\n" + 
				"						\"role\": null,\r\n" + 
				"						\"sub_role\": null,\r\n" + 
				"						\"levels\": [\r\n" + 
				"							\"manager\"\r\n" + 
				"						]\r\n" + 
				"					},\r\n" + 
				"					\"is_primary\": false\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"education\": [\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"wando high school\",\r\n" + 
				"						\"type\": \"secondary school\",\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"website\": null,\r\n" + 
				"						\"domain\": null\r\n" + 
				"					},\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"start_date\": null,\r\n" + 
				"					\"end_date\": \"2007\",\r\n" + 
				"					\"majors\": [],\r\n" + 
				"					\"minors\": [],\r\n" + 
				"					\"gpa\": null\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"california state university - san bernardino\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": \"-ILzu5IHa4-7BXcSXCpCGA_0\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"san bernardino, california, united states\",\r\n" + 
				"							\"locality\": \"san bernardino\",\r\n" + 
				"							\"region\": \"california\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/school/california-state-university-san-bernardino\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/csusb\",\r\n" + 
				"						\"twitter_url\": \"twitter.com/csusbnews\",\r\n" + 
				"						\"linkedin_id\": \"17833\",\r\n" + 
				"						\"website\": \"csusb.edu\",\r\n" + 
				"						\"domain\": \"csusb.edu\"\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": null,\r\n" + 
				"					\"start_date\": null,\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"communication studies\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"universidade federal de santa catarina\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": \"10eKjx1pKBsfZntsVBP8kg_0\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"florianópolis, santa catarina, brazil\",\r\n" + 
				"							\"locality\": \"florianópolis\",\r\n" + 
				"							\"region\": \"santa catarina\",\r\n" + 
				"							\"country\": \"brazil\",\r\n" + 
				"							\"continent\": \"south america\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/school/ufsc\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/universidadeufsc\",\r\n" + 
				"						\"twitter_url\": \"twitter.com/ufsc\",\r\n" + 
				"						\"linkedin_id\": \"10677\",\r\n" + 
				"						\"website\": \"ufsc.br\",\r\n" + 
				"						\"domain\": \"ufsc.br\"\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"2013\",\r\n" + 
				"					\"start_date\": \"2013\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"sustainability\",\r\n" + 
				"						\"portuguese language\",\r\n" + 
				"						\"portuguese\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"università degli studi della tuscia\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": \"1Pk8lH40v3hmEaMa11Fs7Q_0\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"viterbo, lazio, italy\",\r\n" + 
				"							\"locality\": \"viterbo\",\r\n" + 
				"							\"region\": \"lazio\",\r\n" + 
				"							\"country\": \"italy\",\r\n" + 
				"							\"continent\": \"europe\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/school/università-degli-studi-della-tuscia\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/universitadeglistudidellatuscia\",\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": \"13862\",\r\n" + 
				"						\"website\": \"unitus.it\",\r\n" + 
				"						\"domain\": \"unitus.it\"\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"2012\",\r\n" + 
				"					\"start_date\": \"2012\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"writing\",\r\n" + 
				"						\"italian language\",\r\n" + 
				"						\"studio art\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"the culinary institute of charleston\",\r\n" + 
				"						\"type\": null,\r\n" + 
				"						\"id\": null,\r\n" + 
				"						\"location\": null,\r\n" + 
				"						\"linkedin_url\": null,\r\n" + 
				"						\"facebook_url\": null,\r\n" + 
				"						\"twitter_url\": null,\r\n" + 
				"						\"linkedin_id\": null,\r\n" + 
				"						\"website\": null,\r\n" + 
				"						\"domain\": null\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"2010\",\r\n" + 
				"					\"start_date\": \"2008\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"communication\",\r\n" + 
				"						\"management\",\r\n" + 
				"						\"culinary arts\",\r\n" + 
				"						\"tourism management\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"california state university - san bernardino\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": \"-ILzu5IHa4-7BXcSXCpCGA_0\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"san bernardino, california, united states\",\r\n" + 
				"							\"locality\": \"san bernardino\",\r\n" + 
				"							\"region\": \"california\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/school/california-state-university-san-bernardino\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/csusb\",\r\n" + 
				"						\"twitter_url\": \"twitter.com/csusbnews\",\r\n" + 
				"						\"linkedin_id\": \"17833\",\r\n" + 
				"						\"website\": \"csusb.edu\",\r\n" + 
				"						\"domain\": \"csusb.edu\"\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"2013\",\r\n" + 
				"					\"start_date\": \"2013\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"international communications\",\r\n" + 
				"						\"media management\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"school\": {\r\n" + 
				"						\"name\": \"university of south carolina\",\r\n" + 
				"						\"type\": \"post-secondary institution\",\r\n" + 
				"						\"id\": \"1zWM9nOB6zbDGoLsSsQxLQ_0\",\r\n" + 
				"						\"location\": {\r\n" + 
				"							\"name\": \"columbia, south carolina, united states\",\r\n" + 
				"							\"locality\": \"columbia\",\r\n" + 
				"							\"region\": \"south carolina\",\r\n" + 
				"							\"country\": \"united states\",\r\n" + 
				"							\"continent\": \"north america\"\r\n" + 
				"						},\r\n" + 
				"						\"linkedin_url\": \"linkedin.com/school/uofsc\",\r\n" + 
				"						\"facebook_url\": \"facebook.com/uofsc\",\r\n" + 
				"						\"twitter_url\": \"twitter.com/uofsc\",\r\n" + 
				"						\"linkedin_id\": \"19382\",\r\n" + 
				"						\"website\": \"sc.edu\",\r\n" + 
				"						\"domain\": \"sc.edu\"\r\n" + 
				"					},\r\n" + 
				"					\"end_date\": \"2013\",\r\n" + 
				"					\"start_date\": \"2010\",\r\n" + 
				"					\"gpa\": null,\r\n" + 
				"					\"degrees\": [\r\n" + 
				"						\"bachelors\",\r\n" + 
				"						\"bachelor of arts\"\r\n" + 
				"					],\r\n" + 
				"					\"majors\": [\r\n" + 
				"						\"communications\",\r\n" + 
				"						\"film\",\r\n" + 
				"						\"public relations\",\r\n" + 
				"						\"journalism\"\r\n" + 
				"					],\r\n" + 
				"					\"minors\": []\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"profiles\": [\r\n" + 
				"				{\r\n" + 
				"					\"network\": \"linkedin\",\r\n" + 
				"					\"id\": \"163429614\",\r\n" + 
				"					\"url\": \"linkedin.com/in/dianamletts\",\r\n" + 
				"					\"username\": \"dianamletts\"\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"network\": \"linkedin\",\r\n" + 
				"					\"id\": \"163429614\",\r\n" + 
				"					\"url\": \"linkedin.com/in/diana-letts-3a689546\",\r\n" + 
				"					\"username\": \"diana-letts-3a689546\"\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"network\": \"facebook\",\r\n" + 
				"					\"id\": \"1493580522\",\r\n" + 
				"					\"url\": \"facebook.com/dianamarceilia\",\r\n" + 
				"					\"username\": \"dianamarceilia\"\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"network\": \"twitter\",\r\n" + 
				"					\"id\": null,\r\n" + 
				"					\"url\": \"twitter.com/dianamarceil\",\r\n" + 
				"					\"username\": \"dianamarceil\"\r\n" + 
				"				}\r\n" + 
				"			],\r\n" + 
				"			\"version_status\": {\r\n" + 
				"				\"status\": \"\",\r\n" + 
				"				\"contains\": [],\r\n" + 
				"				\"previous_version\": \"\",\r\n" + 
				"				\"current_version\": \"\"\r\n" + 
				"			}\r\n" + 
				"		}\r\n" + 
				"	],\r\n" + 
				"	\"scroll_token\": \"31439$7.0005774\",\r\n" + 
				"	\"total\": 92\r\n" + 
				"}";
		
		
		String jsonSingle ="{\r\n"
				+ "  \"status\": 200,\r\n"
				+ "  \"likelihood\": 10,\r\n"
				+ "  \"data\": {\r\n"
				+ "    \"id\": \"qEnOZ5Oh0poWnQ1luFBfVw_0000\",\r\n"
				+ "    \"full_name\": \"sean thorne\",\r\n"
				+ "    \"first_name\": \"sean\",\r\n"
				+ "    \"middle_initial\": \"f\",\r\n"
				+ "    \"middle_name\": \"fong\",\r\n"
				+ "    \"last_name\": \"thorne\",\r\n"
				+ "    \"gender\": \"male\",\r\n"
				+ "    \"birth_year\": \"1990\",\r\n"
				+ "    \"birth_date\": null,\r\n"
				+ "    \"linkedin_url\": \"linkedin.com/in/seanthorne\",\r\n"
				+ "    \"linkedin_username\": \"seanthorne\",\r\n"
				+ "    \"linkedin_id\": \"145991517\",\r\n"
				+ "    \"facebook_url\": \"facebook.com/deseanthorne\",\r\n"
				+ "    \"facebook_username\": \"deseanthorne\",\r\n"
				+ "    \"facebook_id\": \"1089351304\",\r\n"
				+ "    \"twitter_url\": \"twitter.com/seanthorne5\",\r\n"
				+ "    \"twitter_username\": \"seanthorne5\",\r\n"
				+ "    \"github_url\": null,\r\n"
				+ "    \"github_username\": null,\r\n"
				+ "    \"work_email\": \"sean@peopledatalabs.com\",\r\n"
				+ "    \"personal_emails\": [\"sean@gmail.com\"],\r\n"
				+ "    \"mobile_phone\": \"+14155688413\",\r\n"
				+ "    \"industry\": \"computer software\",\r\n"
				+ "    \"job_title\": \"co-founder and chief executive officer\",\r\n"
				+ "    \"job_title_role\": null,\r\n"
				+ "    \"job_title_sub_role\": null,\r\n"
				+ "    \"job_title_levels\": [\r\n"
				+ "      \"owner\",\r\n"
				+ "      \"cxo\"\r\n"
				+ "    ],\r\n"
				+ "    \"job_company_id\": \"peopledatalabs\",\r\n"
				+ "    \"job_company_name\": \"people data labs\",\r\n"
				+ "    \"job_company_website\": \"peopledatalabs.com\",\r\n"
				+ "    \"job_company_size\": \"11-50\",\r\n"
				+ "    \"job_company_founded\": \"2015\",\r\n"
				+ "    \"job_company_industry\": \"computer software\",\r\n"
				+ "    \"job_company_linkedin_url\": \"linkedin.com/company/peopledatalabs\",\r\n"
				+ "    \"job_company_linkedin_id\": \"18170482\",\r\n"
				+ "    \"job_company_facebook_url\": \"facebook.com/peopledatalabs\",\r\n"
				+ "    \"job_company_twitter_url\": \"twitter.com/peopledatalabs\",\r\n"
				+ "    \"job_company_location_name\": \"san francisco, california, united states\",\r\n"
				+ "    \"job_company_location_locality\": \"san francisco\",\r\n"
				+ "    \"job_company_location_metro\": \"san francisco, california\",\r\n"
				+ "    \"job_company_location_region\": \"california\",\r\n"
				+ "    \"job_company_location_geo\": \"37.77,-122.41\",\r\n"
				+ "    \"job_company_location_street_address\": \"455 market street\",\r\n"
				+ "    \"job_company_location_address_line_2\": \"suite 1670\",\r\n"
				+ "    \"job_company_location_postal_code\": \"94105\",\r\n"
				+ "    \"job_company_location_country\": \"united states\",\r\n"
				+ "    \"job_company_location_continent\": \"north america\",\r\n"
				+ "    \"job_last_updated\": \"2020-12-01\",\r\n"
				+ "    \"job_start_date\": \"2015-03\",\r\n"
				+ "    \"location_name\": \"san francisco, california, united states\",\r\n"
				+ "    \"location_locality\": \"san francisco\",\r\n"
				+ "    \"location_metro\": \"san francisco, california\",\r\n"
				+ "    \"location_region\": \"california\",\r\n"
				+ "    \"location_country\": \"united states\",\r\n"
				+ "    \"location_continent\": \"north america\",\r\n"
				+ "    \"location_street_address\": null,\r\n"
				+ "    \"location_address_line_2\": null,\r\n"
				+ "    \"location_postal_code\": null,\r\n"
				+ "    \"location_geo\": \"37.77,-122.41\",\r\n"
				+ "    \"location_last_updated\": \"2020-12-01\",\r\n"
				+ "    \"phone_numbers\": [\r\n"
				+ "      \"+14155688413\"\r\n"
				+ "    ],\r\n"
				+ "    \"emails\": [\r\n"
				+ "      {\r\n"
				+ "        \"address\": \"sthorne@uoregon.edu\",\r\n"
				+ "        \"type\": null\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"address\": \"sean@hallspot.com\",\r\n"
				+ "        \"type\": \"professional\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"address\": \"sean@talentiq.co\",\r\n"
				+ "        \"type\": \"professional\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"address\": \"sean.thorne@talentiq.co\",\r\n"
				+ "        \"type\": \"professional\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"address\": \"sean@peopledatalabs.com\",\r\n"
				+ "        \"type\": \"current_professional\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"address\": \"sthorne@peopledatalabs.com\",\r\n"
				+ "        \"type\": \"current_professional\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"address\": \"sean.thorne@peopledatalabs.com\",\r\n"
				+ "        \"type\": \"current_professional\"\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"interests\": [\r\n"
				+ "      \"location based services\",\r\n"
				+ "      \"mobile\",\r\n"
				+ "      \"social media\",\r\n"
				+ "      \"colleges\",\r\n"
				+ "      \"university students\",\r\n"
				+ "      \"consumer internet\",\r\n"
				+ "      \"college campuses\"\r\n"
				+ "    ],\r\n"
				+ "    \"skills\": [\r\n"
				+ "      \"entrepreneurship\",\r\n"
				+ "      \"start ups\",\r\n"
				+ "      \"management\",\r\n"
				+ "      \"public speaking\",\r\n"
				+ "      \"strategic partnerships\",\r\n"
				+ "      \"strategy\",\r\n"
				+ "      \"fundraising\",\r\n"
				+ "      \"saas\",\r\n"
				+ "      \"enterprise technology sales\",\r\n"
				+ "      \"social networking\"\r\n"
				+ "    ],\r\n"
				+ "    \"location_names\": [\r\n"
				+ "      \"san francisco, california, united states\",\r\n"
				+ "      \"albany, california, united states\",\r\n"
				+ "      \"portland, oregon, united states\"\r\n"
				+ "    ],\r\n"
				+ "    \"regions\": [\r\n"
				+ "      \"california, united states\",\r\n"
				+ "      \"oregon, united states\"\r\n"
				+ "    ],\r\n"
				+ "    \"countries\": [\r\n"
				+ "      \"united states\"\r\n"
				+ "    ],\r\n"
				+ "    \"street_addresses\": [],\r\n"
				+ "    \"experience\": [\r\n"
				+ "      {\r\n"
				+ "        \"company\": {\r\n"
				+ "          \"name\": \"hallspot\",\r\n"
				+ "          \"size\": \"1-10\",\r\n"
				+ "          \"id\": \"hallspot\",\r\n"
				+ "          \"founded\": \"2013\",\r\n"
				+ "          \"industry\": \"computer software\",\r\n"
				+ "          \"location\": {\r\n"
				+ "            \"name\": \"portland, oregon, united states\",\r\n"
				+ "            \"locality\": \"portland\",\r\n"
				+ "            \"region\": \"oregon\",\r\n"
				+ "            \"metro\": \"portland, oregon\",\r\n"
				+ "            \"country\": \"united states\",\r\n"
				+ "            \"continent\": \"north america\",\r\n"
				+ "            \"street_address\": \"1231 northwest hoyt street\",\r\n"
				+ "            \"address_line_2\": \"suite 202\",\r\n"
				+ "            \"postal_code\": \"97209\",\r\n"
				+ "            \"geo\": \"45.52,-122.67\"\r\n"
				+ "          },\r\n"
				+ "          \"linkedin_url\": \"linkedin.com/company/hallspot\",\r\n"
				+ "          \"linkedin_id\": \"3019184\",\r\n"
				+ "          \"facebook_url\": null,\r\n"
				+ "          \"twitter_url\": \"twitter.com/hallspot\",\r\n"
				+ "          \"website\": \"hallspot.com\"\r\n"
				+ "        },\r\n"
				+ "        \"location_names\": [],\r\n"
				+ "        \"end_date\": \"2015-02\",\r\n"
				+ "        \"start_date\": \"2012-08\",\r\n"
				+ "        \"title\": {\r\n"
				+ "          \"name\": \"co-founder\",\r\n"
				+ "          \"role\": null,\r\n"
				+ "          \"sub_role\": null,\r\n"
				+ "          \"levels\": [\r\n"
				+ "            \"owner\"\r\n"
				+ "          ]\r\n"
				+ "        },\r\n"
				+ "        \"is_primary\": false\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"company\": {\r\n"
				+ "          \"name\": \"people data labs\",\r\n"
				+ "          \"size\": \"11-50\",\r\n"
				+ "          \"id\": \"peopledatalabs\",\r\n"
				+ "          \"founded\": \"2015\",\r\n"
				+ "          \"industry\": \"computer software\",\r\n"
				+ "          \"location\": {\r\n"
				+ "            \"name\": \"san francisco, california, united states\",\r\n"
				+ "            \"locality\": \"san francisco\",\r\n"
				+ "            \"region\": \"california\",\r\n"
				+ "            \"metro\": \"san francisco, california\",\r\n"
				+ "            \"country\": \"united states\",\r\n"
				+ "            \"continent\": \"north america\",\r\n"
				+ "            \"street_address\": \"455 market street\",\r\n"
				+ "            \"address_line_2\": \"suite 1670\",\r\n"
				+ "            \"postal_code\": \"94105\",\r\n"
				+ "            \"geo\": \"37.77,-122.41\"\r\n"
				+ "          },\r\n"
				+ "          \"linkedin_url\": \"linkedin.com/company/peopledatalabs\",\r\n"
				+ "          \"linkedin_id\": \"18170482\",\r\n"
				+ "          \"facebook_url\": \"facebook.com/peopledatalabs\",\r\n"
				+ "          \"twitter_url\": \"twitter.com/peopledatalabs\",\r\n"
				+ "          \"website\": \"peopledatalabs.com\"\r\n"
				+ "        },\r\n"
				+ "        \"location_names\": [],\r\n"
				+ "        \"end_date\": null,\r\n"
				+ "        \"start_date\": \"2015-03\",\r\n"
				+ "        \"title\": {\r\n"
				+ "          \"name\": \"co-founder and chief executive officer\",\r\n"
				+ "          \"role\": null,\r\n"
				+ "          \"sub_role\": null,\r\n"
				+ "          \"levels\": [\r\n"
				+ "            \"owner\",\r\n"
				+ "            \"cxo\"\r\n"
				+ "          ]\r\n"
				+ "        },\r\n"
				+ "        \"is_primary\": true\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"education\": [\r\n"
				+ "      {\r\n"
				+ "        \"school\": {\r\n"
				+ "          \"name\": \"university of oregon\",\r\n"
				+ "          \"type\": \"post-secondary institution\",\r\n"
				+ "          \"id\": \"64LkgfdwWYkCC2TjbldMDQ_0\",\r\n"
				+ "          \"location\": {\r\n"
				+ "            \"name\": \"eugene, oregon, united states\",\r\n"
				+ "            \"locality\": \"eugene\",\r\n"
				+ "            \"region\": \"oregon\",\r\n"
				+ "            \"country\": \"united states\",\r\n"
				+ "            \"continent\": \"north america\"\r\n"
				+ "          },\r\n"
				+ "          \"linkedin_url\": \"linkedin.com/school/university-of-oregon\",\r\n"
				+ "          \"facebook_url\": \"facebook.com/universityoforegon\",\r\n"
				+ "          \"twitter_url\": \"twitter.com/uoregon\",\r\n"
				+ "          \"linkedin_id\": \"19207\",\r\n"
				+ "          \"website\": \"uoregon.edu\",\r\n"
				+ "          \"domain\": \"uoregon.edu\"\r\n"
				+ "        },\r\n"
				+ "        \"end_date\": \"2014\",\r\n"
				+ "        \"start_date\": \"2010\",\r\n"
				+ "        \"gpa\": null,\r\n"
				+ "        \"degrees\": [],\r\n"
				+ "        \"majors\": [\r\n"
				+ "          \"entrepreneurship\"\r\n"
				+ "        ],\r\n"
				+ "        \"minors\": []\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"profiles\": [\r\n"
				+ "      {\r\n"
				+ "        \"network\": \"linkedin\",\r\n"
				+ "        \"id\": \"145991517\",\r\n"
				+ "        \"url\": \"linkedin.com/in/seanthorne\",\r\n"
				+ "        \"username\": \"seanthorne\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"network\": \"facebook\",\r\n"
				+ "        \"id\": \"1089351304\",\r\n"
				+ "        \"url\": \"facebook.com/deseanthorne\",\r\n"
				+ "        \"username\": \"deseanthorne\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"network\": \"twitter\",\r\n"
				+ "        \"id\": null,\r\n"
				+ "        \"url\": \"twitter.com/seanthorne5\",\r\n"
				+ "        \"username\": \"seanthorne5\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"network\": \"linkedin\",\r\n"
				+ "        \"id\": null,\r\n"
				+ "        \"url\": \"linkedin.com/in/sean-thorne-9b9a8540\",\r\n"
				+ "        \"username\": \"sean-thorne-9b9a8540\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"network\": \"angellist\",\r\n"
				+ "        \"id\": null,\r\n"
				+ "        \"url\": \"angel.co/deseanthorne\",\r\n"
				+ "        \"username\": \"deseanthorne\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"network\": \"gravatar\",\r\n"
				+ "        \"id\": null,\r\n"
				+ "        \"url\": \"gravatar.com/seanthorne5\",\r\n"
				+ "        \"username\": \"seanthorne5\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"network\": \"klout\",\r\n"
				+ "        \"id\": null,\r\n"
				+ "        \"url\": \"klout.com/seanthorne5\",\r\n"
				+ "        \"username\": \"seanthorne5\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"network\": \"aboutme\",\r\n"
				+ "        \"id\": null,\r\n"
				+ "        \"url\": \"about.me/sean_thorne\",\r\n"
				+ "        \"username\": \"sean_thorne\"\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}";
		
		System.out.println("Json reading starting...");
		
		//Add folder location where resume will be save   "Need to change"
		String filePath = "C:\\Users\\GitHub\\Desktop\\target\\";		
		
		JSONParser parser = new JSONParser();
		Object outputObject = null;
		try {
			// Change "jsonSingle"(this json have single resume object)  name with "json"(this json having multiple resume object in array)
			outputObject = parser.parse(jsonSingle.toString());
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		
		JSONObject root = (JSONObject) outputObject;
		JSONArray jsonArray = new JSONArray();
		
		if(root.get("data") instanceof ArrayList) {
			jsonArray = (JSONArray) root.get("data");
		}
		else if(root.get("data") instanceof JSONObject) {
			jsonArray.add(root.get("data"));
		}
		
		Iterator itr = jsonArray.iterator();		
				
		Map<String, Object> mapData = null;
		List<Map<String, Object>> resumeList = new ArrayList<>();
		
		
		while (itr.hasNext()) {
			
			JSONObject jsonObj = (JSONObject) itr.next();
			
			mapData = new HashMap<>();
			resumeList.add(mapData);
			
			//Read all json data and store within map
			for (Object key : jsonObj.keySet()) {
				// based on you key types
				String nodeName = (String) key;
				Object val = jsonObj.get(nodeName);	
				
				if(val==null) continue;
				
				mapData.put(nodeName, val);				
			}	
		}		
		
		
		//Get all resume content from list and create resume
		if(!resumeList.isEmpty()) {
			
			for(Map<String, Object> map : resumeList) {
				
				if(map.isEmpty()) continue;
				
				filePath = filePath+UUID.randomUUID() +"t_"+Calendar.getInstance().getTimeInMillis()+".txt";
				File fi = new File(filePath);
				try(FileWriter pw = new FileWriter(filePath,true)){			
					
					boolean comma = false;
					
					//Name capitalizeFirstLetterOfEachWord
					String name = (String) map.get("full_name");
					pw.append("Name : "+capitalizeFirstLetterOfEachWord(name));
					pw.append("\n\n");
					
					
					//Email				
					if(map.get("emails") instanceof ArrayList) {
						
						List<Object> emails = (ArrayList<Object>) map.get("emails");
						Iterator i = emails.iterator();	
						
						if(!emails.isEmpty() && !comma) {
							pw.append("Email :\n");
						}
						
						while(i.hasNext()) {
							
							Object val = i.next();							
							if(val instanceof Map) {
								
								HashMap<String, String> emailMap = (HashMap<String, String>) val;								
								String email = emailMap.get("address");								
								if(email == null) continue;
								pw.append("\t"+email);
								pw.append("\n");								
							}							
						}
					}
					pw.append("\n");
					comma = false;
					
					
					//Phone			
					if(map.get("phone_numbers") instanceof ArrayList) {
						
						List<String> phones = (List<String>) map.get("phone_numbers");
						Iterator i = phones.iterator();	
						
						if(!phones.isEmpty() && !comma) {
							pw.append("Phone :\n");
						}
						
						while(i.hasNext()) {
							
							Object val = i.next();
							if(val == null) continue;
							String phone = (String) val;
							
							pw.append("\t"+phone);
							pw.append("\n");
						}
					}
					pw.append("\n");
					comma = false;
					
					
					//Address: location_street_address, location_address_line_2,  location_name, location_continent, location_postal_code
					pw.append("Address : ");					
					if(map.get("location_street_address") instanceof String) {
						
						String street1 = (String) map.get("location_street_address");
						street1 = capitalizeFirstLetterOfEachWord(street1);
						pw.append(street1);
						comma = true;
					}
					if(map.get("location_address_line_2") instanceof String) {
						
						if(comma) pw.append(", ");
						String street2 = (String) map.get("location_address_line_2");
						street2 = capitalizeFirstLetterOfEachWord(street2);
						pw.append(street2);
						comma = true;
					}
					if(map.get("location_name") instanceof String) {
						
						if(comma) pw.append(", ");
						String addr = (String) map.get("location_name");
						addr = capitalizeFirstLetterOfEachWord(addr);
						pw.append(addr);
						comma = true;
					}
					if(map.get("location_continent") instanceof String) {
						
						if(comma) pw.append(", ");
						String addr = (String) map.get("location_continent");
						addr = capitalizeFirstLetterOfEachWord(addr);
						pw.append(addr);
						comma = true;
					}
					if(map.get("location_postal_code") instanceof String) {
						
						if(comma) pw.append(", ");
						String addr = (String) map.get("location_postal_code");
						pw.append(addr);
					}
					pw.append("\n\n");
					comma = false;
					
					
					//Education:  education, degrees, start_date, end_date
					if(map.get("education") instanceof ArrayList) {
						
						List<Object> education = (ArrayList<Object>) map.get("education");
						Iterator i = education.iterator();	
						if(!education.isEmpty()) {
							pw.append("Education :");
						}
						
						while(i.hasNext()) {
							
							Object val = i.next();							
							pw.append("\n");
							comma = false;
							boolean eduFound = false;
							if(val instanceof Map) {
								
								HashMap<String, Object> eduMap = (HashMap<String, Object>) val;
								
								//Institution name
								HashMap<String, Object> schoolMap = (HashMap<String, Object>) eduMap.get("school");									
								if(schoolMap.get("name") instanceof String) {
									
									String instName = (String) schoolMap.get("name");
									instName = capitalizeFirstLetterOfEachWord(instName);
									pw.append("\t"+instName);
									eduFound = true;
								}
								
								//location
								if(schoolMap.get("location") instanceof Map && eduFound) {
									
									HashMap<String, Object> insLocMap = (HashMap<String, Object>) schoolMap.get("location");	
									if(insLocMap.get("name") instanceof String) {
										
										String instLoc = (String) insLocMap.get("name");
										instLoc = capitalizeFirstLetterOfEachWord(instLoc);
										pw.append(", "+instLoc);
										pw.append("\n");								
									}									
								}
								else {
									pw.append("\n");
								}
								
								//degree
								if(eduMap.get("degrees") instanceof List && eduFound) {
									
									ArrayList<String> degrees = (ArrayList<String>) eduMap.get("degrees");
									if(!degrees.isEmpty()) {
										pw.append("\t");
										Iterator deg = degrees.iterator();
										comma = false;
										while(deg.hasNext()) {
											if(comma) pw.append(", ");
											String degree = (String)deg.next();
											degree = capitalizeFirstLetterOfEachWord(degree);
											pw.append(degree);
											comma = true;
										}
										pw.append("\n");
										comma = false;
									}									
								}
								
								//start date
								if(eduMap.get("start_date") instanceof String && eduFound) {
									
									String startDate = (String) eduMap.get("start_date");
									pw.append("\t"+startDate);
									comma = true;
								}
								//end date
								if(eduMap.get("end_date") instanceof String && eduFound) {
									
									if(comma) pw.append(" - ");
									else pw.append("\t");
									String endDate = (String) eduMap.get("end_date");
									pw.append(endDate);
									comma = true;
								}
								if(comma) pw.append("\n");
							}							
						}
					}//education
					pw.append("\n");
					comma = false;
					
					
					//Experience experience
					if(map.get("experience") instanceof ArrayList) {
						
						List<Object> experience = (ArrayList<Object>) map.get("experience");
						Iterator i = experience.iterator();	
						if(!experience.isEmpty()) {
							pw.append("Experience :");
						}
						while(i.hasNext()) {
							
							Object val = i.next();							
							pw.append("\n");
							comma = false;
						
							if(val instanceof Map) {
								
								HashMap<String, Object> expMap = (HashMap<String, Object>) val;
								
								//Employer name
								HashMap<String, Object> employerMap = (HashMap<String, Object>) expMap.get("company");									
								if(employerMap.get("name") instanceof String) {
									
									String empName = (String) employerMap.get("name");
									empName = capitalizeFirstLetterOfEachWord(empName);
									pw.append("\t"+empName);
									comma = true;
								}
								
								//Location
								if(employerMap.get("location") instanceof Map && comma) {
									
									HashMap<String, Object> locationMap = (HashMap<String, Object>) employerMap.get("location");
									if(locationMap.get("name") instanceof String) {
										
										if(comma) pw.append(", ");
										String empLoc = (String) locationMap.get("name");	
										empLoc = capitalizeFirstLetterOfEachWord(empLoc);
										pw.append(empLoc);
									}									
								}
								
								//Start date start_date
								boolean dateFlage = false;
								if(expMap.get("start_date") instanceof String && comma) {
									
									String startDate = (String) expMap.get("start_date");								
									pw.append("\t"+startDate);
									dateFlage = true;
								}
								//end date end_date
								if(expMap.get("end_date") instanceof String && comma) {
									
									if(dateFlage) pw.append(" - ");
									else pw.append("\t");
									String endDate = (String) expMap.get("end_date");
									pw.append(endDate);
								}
								if(comma) pw.append("\n");
								
								//JobProfile title
								HashMap<String, Object> profileMap = (HashMap<String, Object>) expMap.get("title");
								if(profileMap.get("name") instanceof String && comma) {
									
									String jobtitle = (String) profileMap.get("name");
									jobtitle = capitalizeFirstLetterOfEachWord(jobtitle);
									pw.append("\t"+jobtitle);
								}
							}
							pw.append("\n");
							
						}	
						pw.append("\n");
						comma = false;						
					}
					
					
					//Skills
					if(map.get("skills") instanceof ArrayList) {
						
						List<String> skills = (List<String>) map.get("skills");						
						Iterator i = skills.iterator();	
						
						if(!skills.isEmpty() && !comma) {
							pw.append("Skills :\n");
							comma = true;
						}
						
						while(i.hasNext()) {
							
							Object val = i.next();
							String skill = (String) val;
							skill = capitalizeFirstLetterOfEachWord(skill);
							pw.append("\t"+skill);
							pw.append("\n");
						}
						pw.append("\n");
						comma = false;
					}				
					
					
					//interests
					if(map.get("interests") instanceof ArrayList) {
						
						List<String> intrests = (List<String>) map.get("interests");						
						Iterator i = intrests.iterator();	
						
						if(!intrests.isEmpty()) {
							pw.append("Intrests :\n");
						}
						
						while(i.hasNext()) {
							
							Object val = i.next();
							String interest = (String) val;
							interest = capitalizeFirstLetterOfEachWord(interest);
							pw.append("\t"+interest);
							pw.append("\n");
						}
						pw.append("\n");
					}
					
					
					//Personal Information:  gender, profiles 
					pw.append("Personal Information :\n");
					if(map.get("gender") instanceof String) {
						
						String gender = (String) map.get("gender");
						pw.append("\tGender : "+capitalizeFirstLetterOfEachWord(gender)+"\n");
					}
					//profiles: network, url
					if(map.get("profiles") instanceof ArrayList) {
						
						List<Object> profiles = (ArrayList<Object>) map.get("profiles");
						Iterator i = profiles.iterator();	
						
						while(i.hasNext()) {
							
							Object val = i.next();							
							comma = false;
							if(val instanceof Map) {
								
								HashMap<String, String> profileMap = (HashMap<String, String>) val;
								
								String network = capitalizeFirstLetterOfEachWord(profileMap.get("network"));
								pw.append("\t"+network+" : "+profileMap.get("url")+"\n");									
							}							
						}						
					}				
					
				}
				catch (Exception e) {
					e.printStackTrace();
				}			
			}
			
		}//resumeList	
		
		System.out.println("Reading completed.");
		
	}//main

	public static String capitalizeFirstLetterOfEachWord(String s)
	{
		try {			
			char[] c = s.toCharArray();
			boolean b = true;
			for(int i=0; i<c.length; i++)
			{
				if(c[i]==' '){
					b = true;
					continue; // no need to perform UPpercase check, just go on
				}
				if(b && Character.isLetter(c[i])){ // only perform "isLetter" check if you want to capitalize the first <b>real</b> letter - '4life' will be '4Life'
					c[i] = Character.toUpperCase(c[i]);
					b = false;
				}
				else
				{
					c[i] = Character.toLowerCase(c[i]);
					b = false;
				}
			}
			return new String(c);
		}
		catch (Exception e) {
			return s;
		}
	}
	
}

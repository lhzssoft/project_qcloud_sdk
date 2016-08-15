package com.qcloud.uri;

public interface Constant 
{
	public static final String URI_NOTIFICATION_API = "http://openapi.xg.qq.com/v2/" ;
	
	public static final String URI_NOTIFICATION_PUSHSINGLEDEVICE = URI_NOTIFICATION_API + "push/single_device";
	public static final String URI_NOTIFICATION_PUSHSINGLEACCOUNT = URI_NOTIFICATION_API + "push/single_account";
	public static final String URI_NOTIFICATION_PUSHACCOUNTLIST = URI_NOTIFICATION_API + "push/account_list";
	public static final String URI_NOTIFICATION_PUSHALLDEVICE = URI_NOTIFICATION_API + "push/all_device";
	public static final String URI_NOTIFICATION_PUSHTAGS = URI_NOTIFICATION_API + "push/tags_device";
	public static final String URI_NOTIFICATION_QUERYPUSHSTATUS = URI_NOTIFICATION_API + "push/get_msg_status";
	public static final String URI_NOTIFICATION_QUERYDEVICECOUNT = URI_NOTIFICATION_API + "application/get_app_device_num";
	public static final String URI_NOTIFICATION_QUERYTAGS = URI_NOTIFICATION_API + "tags/query_app_tags";
	public static final String URI_NOTIFICATION_CANCELTIMINGPUSH = URI_NOTIFICATION_API + "push/cancel_timing_task";
	public static final String URI_NOTIFICATION_BATCHSETTAG = URI_NOTIFICATION_API + "tags/batch_set";
	public static final String URI_NOTIFICATION_BATCHDELTAG = URI_NOTIFICATION_API + "tags/batch_del";
	public static final String URI_NOTIFICATION_QUERYTOKENTAGS = URI_NOTIFICATION_API + "tags/query_token_tags";
	public static final String URI_NOTIFICATION_QUERYTAGTOKENNUM = URI_NOTIFICATION_API + "tags/query_tag_token_num";
	public static final String URI_NOTIFICATION_CREATEMULTIPUSH = URI_NOTIFICATION_API + "push/create_multipush";
	public static final String URI_NOTIFICATION_PUSHACCOUNTLISTMULTIPLE = URI_NOTIFICATION_API + "push/account_list_multiple";
	public static final String URI_NOTIFICATION_PUSHDEVICELISTMULTIPLE = URI_NOTIFICATION_API + "push/device_list_multiple";
	public static final String URI_NOTIFICATION_QUERYINFOOFTOKEN = URI_NOTIFICATION_API + "application/get_app_token_info";
	public static final String URI_NOTIFICATION_QUERYTOKENSOFACCOUNT = URI_NOTIFICATION_API + "application/get_app_account_tokens";
	public static final String URI_NOTIFICATION_DELETETOKENOFACCOUNT = URI_NOTIFICATION_API + "application/del_app_account_tokens";
	public static final String URI_NOTIFICATION_DELETEALLTOKENSOFACCOUNT = URI_NOTIFICATION_API + "application/del_app_account_all_tokens";
}

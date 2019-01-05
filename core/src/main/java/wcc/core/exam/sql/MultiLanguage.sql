
-- hap_org_companys 公司表字段描述
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orgcompanys.companyid','zh_CN','公司ID');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orgcompanys.companyid','en_GB','Company ID');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orgcompanys.companynumber','zh_CN','公司编号');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orgcompanys.companynumber','en_GB','Company Number');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orgcompanys.companyname','zh_CN','公司名称');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orgcompanys.companyname','en_GB','Company Name');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orgcompanys.enabledflag','zh_CN','启用标识');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orgcompanys.enabledflag','en_GB','Enable Flag');

-- hap_ar_customers 客户表字段描述
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('arcustomers.customerid','zh_CN','客户ID');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('arcustomers.customerid','en_GB','Client Id');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('arcustomers.customernumber','zh_CN','客户编号');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('arcustomers.customernumber','en_GB','Client Number');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('arcustomers.customername','zh_CN','客户名称');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('arcustomers.customername','en_GB','Client Name');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('arcustomers.enabledflag','zh_CN','启用标识');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('arcustomers.enabledflag','en_GB','Enable Flag');

-- HAP_INV_INVENTORY_ITEMS 物料表字段描述
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.enabledflag','zh_CN','启用标识');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.enabledflag','en_GB','Enable Flag');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.itemcode','zh_CN','物料编码');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.itemcode','en_GB','Item Code');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.itemuom','zh_CN','物料单位');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.itemuom','en_GB','Item UOM');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.itemdescription','zh_CN','物料描述');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.itemdescription','en_GB','Item Description');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.orderflag','zh_CN','是否能用于销售');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.orderflag','en_GB','Sale or not');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.startactivedate','zh_CN','生效起始时间');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.startactivedate','en_GB','Start active date');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.endactivedate','zh_CN','生效结束时间');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.endactivedate','en_GB','End active date');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.commonname','zh_CN','物料');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('invinventoryitems.commonname','en_GB','Inventory items');

-- HAP_OM _ORDER_HEADERS 订单头表字段描述
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderheaders.orderdate','zh_CN','订单日期');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderheaders.orderdate','en_GB','Order Date');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderheaders.ordernumber','zh_CN','订单编号');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderheaders.ordernumber','en_GB','Order Number');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderheaders.orderstatus','zh_CN','订单状态');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderheaders.orderstatus','en_GB','Order Status');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderheaders.totalprice','zh_CN','订单总金额');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderheaders.totalprice','en_GB','Total price');

-- HAP_OM _ORDER_LINES 订单行表字段描述
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.linenumber','zh_CN','行号');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.linenumber','en_GB','Line Number');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.quantity','zh_CN','数量');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.quantity','en_GB','Quantity');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.unitprice','zh_CN','单价');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.unitprice','en_GB','Unit Price');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.sellingprice','zh_CN','售价');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.sellingprice','en_GB','Selling Price');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.description','zh_CN','备注');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.description','en_GB','Description');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.orderquantityuom','zh_CN','产品单位');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.orderquantityuom','en_GB','Product UOM');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.addition1','zh_CN','附加信息1');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.addition1','en_GB','Addition1');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.addition2','zh_CN','附加信息2');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.addition2','en_GB','Addition2');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.addition3','zh_CN','附加信息3');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.addition3','en_GB','Addition3');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.addition4','zh_CN','附加信息4');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.addition4','en_GB','Addition4');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.addition5','zh_CN','附加信息5');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.addition5','en_GB','Addition5');

-- 其他提示信息
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.selectdata','zh_CN','选择数据');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.selectdata','en_GB','Choose data');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.orderdetail','zh_CN','订单详情');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.orderdetail','en_GB','Order Detail');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.orderquery','zh_CN','订单查询');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.orderquery','en_GB','Order Query');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.orderprice','zh_CN','金额');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.orderprice','en_GB','Amount');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.main','zh_CN','主要');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.main','en_GB','Main');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.other','zh_CN','其他');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.other','en_GB','Other');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.updating','zh_CN','更新中...');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.updating','en_GB','Updating');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.printpdf','zh_CN','·PDF打印');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.printpdf','en_GB','·PrintPDF');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.confirmdelete','zh_CN','确定要删除吗？');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.confirmdelete','en_GB','Are you sure that you want to delete them all?');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.operationcancled','zh_CN','您取消此次操作');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.operationcancled','en_GB','Operation canceled!');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.deleteall','zh_CN','已是最后一条，要删除整个订单吗？');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.deleteall','en_GB','This is the last one,do you want to delete the whole order?');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.headerfirst','zh_CN','请先保存订单头！');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.headerfirst','en_GB','Please save the header data first!');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orderbtns.approve','zh_CN','审批');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orderbtns.approve','en_GB','Approve');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orderbtns.reject','zh_CN','拒绝');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orderbtns.reject','en_GB','Reject');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orderbtns.deleteall','zh_CN','整单删除');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orderbtns.deleteall','en_GB','Delete All');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orderbtns.voucherprint','zh_CN','单据打印');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('orderbtns.voucherprint','en_GB','Voucher Print');

INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('hap.validation.invalid_form','zh_CN','表单数据非法，请检查！');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('hap.validation.invalid_form','en_GB','Oops! There is invalid data in the form');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('hap.validation.datefrom2016','zh_CN','只能选择2016年之后的日期');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('hap.validation.datefrom2016','en_GB','Oops! only date after 2016-1-1 can be choose!');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('hap.validation.number20','zh_CN','{0}只包含数字,且长度不能超过20位');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('hap.validation.number20','en_GB','{0}only contains number and length must shorter than 20');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('hap.validation.numberletter64','zh_CN','{0}只包含字母和数字,且长度不能超过64位');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('hap.validation.numberletter64','en_GB','{0}only contains number and letter and length must shorter than 64');

select * from sys_prompts where PROMPT_CODE = 'ordertips.orderquery';
SELECT * FROM sys_prompts where DESCRIPTION = '其他';


-- validation
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('hap.validation.invalid_form','zh_CN','表单数据非法，请检查！');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('hap.validation.invalid_form','en_GB','Oops! There is invalid data in the form');
SELECT * FROM sys_prompts WHERE prompt_code LIKE '%validation%';
SELECT * FROM sys_prompts WHERE PROMPT_CODE = 'hap.validation.invalid_form';

UPDATE sys_prompts set LANG='zh_CN' where LANG='zh_CH';
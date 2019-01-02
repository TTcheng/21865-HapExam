
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
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderheaders.totalprice','zh_CN','订单金额');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderheaders.totalprice','en_GB','Total price');

-- HAP_OM _ORDER_LINES 订单行表字段描述
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.linenumber','zh_CN','行号！');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.linenumber','en_GB','Line Number');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.quantity','zh_CN','数量');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.quantity','en_GB','Quantity');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.unitprice','zh_CN','单价');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.unitprice','en_GB','Unit Price');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.sellingprice','zh_CN','售价');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.sellingprice','en_GB','Selling Price');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.description','zh_CN','备注');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('omorderlines.description','en_GB','Description');

-- 其他提示信息
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.selectdata','zh_CN','选择数据');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('ordertips.selectdata','en_GB','Choose data');

select * from sys_prompts where PROMPT_CODE like 'ordertips%';


-- validation
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('hap.validation.invalid_form','zh_CN','表单数据非法，请检查！');
INSERT INTO sys_prompts(prompt_code, lang, description) VALUES ('hap.validation.invalid_form','en_GB','Oops! There is invalid data in the form');
SELECT * FROM sys_prompts WHERE prompt_code LIKE '%validation%';
SELECT * FROM sys_prompts WHERE PROMPT_CODE = 'hap.validation.invalid_form';

UPDATE sys_prompts set LANG='zh_CN' where LANG='zh_CH';
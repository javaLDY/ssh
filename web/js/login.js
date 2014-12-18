Ext.define("login",{
   extend : "Ext.panel.Panel",
    initComponent : function(){
        var connect_path="<%=request.getContextPath()%>";
        Ext.apply(this,{
           title : "登录",
           titleAlign : "center",
            width : 200,
            height : 200,
            items : [{
                xtype : "form",
                width : 200,
                id : "formid",
                height : 200,
                layout : "vbox",
                border : false,
                defaults : {
                    xtype : "textfield",
                    labelWidth : 35,
                    border : false,
                    labelAlign : "right",
                    margin : "5 5 5 5"
                },
                items : [{
                    fieldLabel : "姓名",
                    name : "stuname"
                }]
            }],
            buttonAlign : "center",
            buttons : [{
                text : "提交",
                handler : function(){
                    var form = Ext.getCmp("formid").getForm();
                    if(form.isValid()){
                        form.submit({
                            url : "/stuinfo/logintijiao",
                            success : function(form,action){
                                var msg = Ext.JSON.decode(action.response.responseText);
                                Ext.Msg.show({
                                    title : "系统提示",
                                    msg : msg.message,
                                    icon : Ext.Msg.WARNING,
                                    buttons : Ext.Msg.YES
                                })
                            },
                            failure : function(form,action){
                                var msg = Ext.JSON.decode(action.response.responseText);
                                Ext.Msg.show({
                                    title : "系统提示",
                                    msg : msg.message,
                                    icon : Ext.Msg.WARNING,
                                    buttons : Ext.Msg.YES
                                })
                            }
                        })
                    }
                }
            },{
                text : "重置",
                handler : function(){
                    Ext.getCmp("formid").getForm().reset();
                }
            }]
        });
        this.callParent();
    }
});
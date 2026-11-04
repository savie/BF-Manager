.class public final Ll/ۗۗۚ;
.super Ll/ۡۗۚ;
.source "1IS1"


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "dex_list_classes"

    return-object v0
.end method

.method public final ۙ(Ll/ᩳۨۚ;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 56
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "prefix"

    iget-object p1, p1, Ll/ᩳۨۚ;->۫:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;Ll/ۘۛۚ;)V
    .locals 9

    .line 61
    iget-object p2, p2, Ll/ۘۛۚ;->᩷:Ljava/util/ArrayList;

    .line 68
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 69
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚۚۚ;

    .line 70
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    iget-object v5, v1, Ll/ۚۚۚ;->ۙ:Ljava/lang/String;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v3, "dex_class"

    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 71
    invoke-static/range {v3 .. v8}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "locator"

    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "javaName"

    iget-object v4, v1, Ll/ۚۚۚ;->ۤ:Ljava/lang/String;

    .line 73
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "fieldCount"

    iget v4, v1, Ll/ۚۚۚ;->᩷:I

    .line 74
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "methodCount"

    iget v1, v1, Ll/ۚۚۚ;->᩸:I

    .line 75
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_0
    const-string p2, "items"

    .line 61
    invoke-virtual {p1, p2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-void
.end method

.method public final ۚ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 46
    invoke-static {}, Ll/ܶ᩵ۚ;->᩷()Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ۫()Lbin/mt/json/JSONObject;
    .locals 1

    .line 41
    invoke-static {}, Ll/ܶܿ֫;->ۤ()Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "List DEX Classes"

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const-string v0, "Page through DEX classes. Use prefix=\"\" for all classes and limit=200. Pass an exact dex_class locator to mt_apk_dex_read_class_outline for fields and methods, or mt_apk_dex_read_pseudocode for logic. Follow mt_apk_continue actions for later pages."

    return-object v0
.end method

.method public final ᩷(Lbin/mt/json/JSONObject;)Ll/ᩳۨۚ;
    .locals 0

    .line 51
    invoke-static {p1}, Ll/ۘ᩵ۚ;->ܺ(Lbin/mt/json/JSONObject;)Ll/ᩳۨۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_dex_list_classes"

    return-object v0
.end method

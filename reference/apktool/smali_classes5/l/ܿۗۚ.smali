.class public final Ll/ܿۗۚ;
.super Ll/ۡۗۚ;
.source "JIRM"


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "list_entries"

    return-object v0
.end method

.method public final ۙ(Ll/ᩳۨۚ;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 59
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "prefix"

    iget-object p1, p1, Ll/ᩳۨۚ;->۫:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;Ll/ۘۛۚ;)V
    .locals 12

    .line 64
    iget-object v0, p2, Ll/ۘۛۚ;->᩸:Ljava/util/ArrayList;

    iget-object p2, p2, Ll/ۘۛۚ;->ᩴ:Ljava/util/HashMap;

    .line 72
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳ᩵ۚ;

    .line 74
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v5, v2, Ll/ᩳ᩵ۚ;->ۙ:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v4, "zip_entry"

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 75
    invoke-static/range {v4 .. v9}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "locator"

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 77
    iget-object v4, v2, Ll/ᩳ᩵ۚ;->᩷:Ljava/lang/Long;

    if-nez v4, :cond_0

    sget-object v4, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_0
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object v4

    :goto_1
    const-string v5, "size"

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 78
    iget-object v2, v2, Ll/ᩳ᩵ۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤܽۚ;

    const-string v4, "referencedByResource"

    if-eqz v2, :cond_1

    .line 80
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const/4 v10, 0x0

    iget-object v11, v2, Ll/ۤܽۚ;->ۙ:Ljava/lang/String;

    const-string v6, "resource"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 81
    invoke-static/range {v6 .. v11}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "resourceLocator"

    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "resourceName"

    iget-object v2, v2, Ll/ۤܽۚ;->᩷:Ljava/lang/String;

    .line 83
    invoke-virtual {v5, v6, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 80
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_2

    .line 85
    :cond_1
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 87
    :goto_2
    invoke-virtual {v1, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_2
    const-string p2, "items"

    .line 64
    invoke-virtual {p1, p2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-void
.end method

.method public final ۚ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 49
    invoke-static {}, Ll/ܶ᩵ۚ;->ۤ()Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ۫()Lbin/mt/json/JSONObject;
    .locals 1

    .line 44
    invoke-static {}, Ll/ܶܿ֫;->᩸()Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "List APK Entries"

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const-string v0, "Page through APK ZIP entries. Use prefix=\"\" for all paths and limit=200. Inspect zip_entry locators with mt_apk_read_text or mt_apk_read_bytes. Follow mt_apk_continue actions for later pages."

    return-object v0
.end method

.method public final ᩷(Lbin/mt/json/JSONObject;)Ll/ᩳۨۚ;
    .locals 0

    .line 54
    invoke-static {p1}, Ll/ۘ᩵ۚ;->ܽ(Lbin/mt/json/JSONObject;)Ll/ᩳۨۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_list_entries"

    return-object v0
.end method

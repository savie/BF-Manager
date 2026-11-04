.class public final Ll/ۚ᩵ۚ;
.super Ll/ۡۗۚ;
.source "MIRS"


# direct methods
.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;
    .locals 8

    if-nez p1, :cond_0

    .line 119
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0

    :cond_0
    const-string v0, "zip_entry"

    .line 120
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v3, p1

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    const-string v0, "resource"

    .line 121
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v7, p1

    goto :goto_1

    :cond_2
    move-object v7, v1

    :goto_1
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    .line 119
    invoke-static/range {v2 .. v7}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "resource_list"

    return-object v0
.end method

.method public final ۙ(Ll/ᩳۨۚ;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 57
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "view"

    iget-object v2, p1, Ll/ᩳۨۚ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "typeName"

    iget-object v2, p1, Ll/ᩳۨۚ;->ۚ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "variant"

    iget-object p1, p1, Ll/ᩳۨۚ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;Ll/ۘۛۚ;)V
    .locals 11

    .line 62
    iget-object v0, p2, Ll/ۘۛۚ;->᩵:Ljava/lang/String;

    const-string v1, "view"

    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "resource_table"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "variant"

    if-eqz v0, :cond_1

    .line 63
    iget-object p2, p2, Ll/ۘۛۚ;->ܽ:Ljava/util/ArrayList;

    .line 70
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 71
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫ܶۚ;

    .line 81
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 2338
    iget v4, v2, Ll/۫ܶۚ;->ᩴ:I

    .line 788
    invoke-static {v4}, Ll/۟ܶۚ;->ۙ(I)Ljava/lang/String;

    move-result-object v10

    const-string v5, "resource"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 82
    invoke-static/range {v5 .. v10}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "locator"

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "type"

    iget-object v5, v2, Ll/۫ܶۚ;->ܳ:Ljava/lang/String;

    .line 84
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "name"

    iget-object v5, v2, Ll/۫ܶۚ;->᩷:Ljava/lang/String;

    .line 85
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "variantCount"

    iget v5, v2, Ll/۫ܶۚ;->֫:I

    .line 86
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "valueShape"

    iget-object v5, v2, Ll/۫ܶۚ;->ۚ:Ljava/lang/String;

    .line 87
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v2, v2, Ll/۫ܶۚ;->᩸:Ll/ۗܶۚ;

    if-nez v2, :cond_0

    .line 96
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    .line 98
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v5, v2, Ll/ۗܶۚ;->ۛ:Ljava/lang/String;

    .line 99
    invoke-virtual {v4, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "valueKind"

    iget-object v6, v2, Ll/ۗܶۚ;->᩹:Ljava/lang/String;

    .line 100
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "valueSnippet"

    iget-object v6, v2, Ll/ۗܶۚ;->ܶ:Ljava/lang/String;

    .line 101
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "styled"

    iget-boolean v6, v2, Ll/ۗܶۚ;->֫:Z

    .line 102
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "truncated"

    iget-boolean v6, v2, Ll/ۗܶۚ;->ܽ:Z

    .line 103
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "zip_entry"

    iget-object v6, v2, Ll/ۗܶۚ;->ۤ:Ljava/lang/String;

    .line 104
    invoke-static {v5, v6}, Ll/ۚ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "fileLocator"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "resource"

    iget-object v2, v2, Ll/ۗܶۚ;->ۧ:Ljava/lang/String;

    .line 105
    invoke-static {v5, v2}, Ll/ۚ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    const-string v5, "targetLocator"

    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    :goto_1
    const-string v4, "previewValue"

    .line 88
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 72
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto/16 :goto_0

    .line 63
    :cond_1
    iget-object p2, p2, Ll/ۘۛۚ;->ܶ:Ljava/util/ArrayList;

    .line 109
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 110
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿܶۚ;

    .line 111
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "packageId"

    iget-object v5, v2, Ll/ܿܶۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "packageName"

    iget-object v5, v2, Ll/ܿܶۚ;->ۤ:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "typeId"

    iget-object v5, v2, Ll/ܿܶۚ;->᩸:Ljava/lang/String;

    .line 112
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "typeName"

    iget-object v5, v2, Ll/ܿܶۚ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v4, v2, Ll/ܿܶۚ;->ܳ:Ljava/lang/String;

    .line 113
    invoke-virtual {v3, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "entryCount"

    iget v2, v2, Ll/ܿܶۚ;->ۙ:I

    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 111
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_2

    :cond_2
    const-string p2, "items"

    .line 62
    invoke-virtual {p1, p2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-void
.end method

.method public final ۚ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 47
    invoke-static {}, Ll/ܶ᩵ۚ;->᩸()Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ۫()Lbin/mt/json/JSONObject;
    .locals 1

    .line 42
    invoke-static {}, Ll/ܶܿ֫;->ᩴ()Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "List APK Resources"

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const-string v0, "List resources.arsc resources across all packages. Use view=resource_table to find resource locators for mt_apk_resource_read. To discover configurations, use view=resource_table_variants, then filter resource_table by the returned typeName and variant. Follow mt_apk_continue actions for later pages."

    return-object v0
.end method

.method public final ᩷(Lbin/mt/json/JSONObject;)Ll/ᩳۨۚ;
    .locals 0

    .line 52
    invoke-static {p1}, Ll/ۘ᩵ۚ;->ܶ(Lbin/mt/json/JSONObject;)Ll/ᩳۨۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_resource_list"

    return-object v0
.end method

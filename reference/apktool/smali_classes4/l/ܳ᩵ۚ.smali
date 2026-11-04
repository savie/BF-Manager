.class public final Ll/ܳ᩵ۚ;
.super Ljava/lang/Object;
.source "0IS3"


# direct methods
.method public static ۙ(Ll/ܶۛۚ;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 49
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    iget-object v2, p0, Ll/ܶۛۚ;->ᩴ:Ljava/lang/String;

    .line 50
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editSessionId"

    iget-object v2, p0, Ll/ܶۛۚ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "deletedResourceCount"

    iget v2, p0, Ll/ܶۛۚ;->ۙ:I

    .line 51
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "deletedValueCount"

    iget v2, p0, Ll/ܶۛۚ;->ۤ:I

    .line 52
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "deletedTypeVariantCount"

    iget p0, p0, Ll/ܶۛۚ;->᩷:I

    .line 53
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 49
    invoke-static {p0, v0}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۢܳۚ;Ll/᩺ۨۚ;I)V
    .locals 8

    .line 89
    iget-object p0, p0, Ll/ۢܳۚ;->ܿ:Lbin/mt/json/JSONObject;

    iget-object v0, p1, Ll/᩺ۨۚ;->ۤ:Ljava/lang/String;

    iget-object v1, p1, Ll/᩺ۨۚ;->ۙ:Ljava/util/ArrayList;

    const-string v2, "workspaceId"

    invoke-virtual {p0, v2, v0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "editSessionId"

    iget-object p1, p1, Ll/᩺ۨۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v2, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string p1, "deleteTarget"

    const-string v0, "failedDeleteIndex"

    if-ltz p2, :cond_4

    .line 90
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p2, v2, :cond_4

    .line 91
    invoke-virtual {p0, v0, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۛۨۚ;

    const-string v0, "type_variant"

    .line 99
    iget-object v1, p2, Ll/ۛۨۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 100
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "kind"

    iget-object v3, p2, Ll/ۛۨۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 101
    iget-object v2, p2, Ll/ۛۨۚ;->ۤ:Ljava/lang/String;

    if-nez v2, :cond_0

    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    const-string v3, "resource:"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    :goto_0
    const-string v3, "locator"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "0x%02x"

    if-eqz v0, :cond_1

    .line 102
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    iget v6, p2, Ll/ۛۨۚ;->᩷:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v7, v3, [Ljava/lang/Object;

    aput-object v6, v7, v2

    invoke-static {v5, v4, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    goto :goto_1

    :cond_1
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_1
    const-string v6, "packageId"

    invoke-virtual {v1, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    if-eqz v0, :cond_2

    .line 103
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    iget v5, p2, Ll/ۛۨۚ;->᩸:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v5, v3, v2

    invoke-static {v0, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    goto :goto_2

    :cond_2
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_2
    const-string v2, "typeId"

    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 104
    iget-object p2, p2, Ll/ۛۨۚ;->ᩴ:Ljava/lang/String;

    if-nez p2, :cond_3

    sget-object p2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_3

    :cond_3
    invoke-static {p2}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p2

    :goto_3
    const-string v1, "variant"

    invoke-virtual {v0, v1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 91
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-void

    .line 93
    :cond_4
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p2

    if-nez p2, :cond_5

    sget-object p2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-virtual {p0, v0, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 94
    :cond_5
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p2

    if-nez p2, :cond_6

    sget-object p2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_6
    return-void
.end method

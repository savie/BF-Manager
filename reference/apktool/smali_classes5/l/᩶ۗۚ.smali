.class public final Ll/᩶ۗۚ;
.super Ll/ᩳܳۚ;
.source "CIV3"


# direct methods
.method public static ۙ(Lbin/mt/json/JSONValue;)I
    .locals 2

    if-eqz p0, :cond_0

    .line 105
    :try_start_0
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    invoke-static {p0}, Ll/ۨᩴۚ;->᩷(Lbin/mt/json/JSONValue;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    const/16 v1, 0xc8

    if-gt v0, v1, :cond_0

    return v0

    :catch_0
    :cond_0
    const-string v0, "limit"

    .line 111
    invoke-static {v0, p0}, Ll/᩶ۗۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 99
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 100
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 100
    :cond_0
    invoke-static {p1, p0}, Ll/᩶ۗۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0
.end method

.method public static ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/֨ܳۚ;
    .locals 12

    .line 83
    invoke-static {p0, p1, p2, p3}, Ll/ۧ۫ۚ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/ۚ۫ۚ;

    move-result-object p3

    iget-object v0, p3, Ll/ۚ۫ۚ;->᩷:Lbin/mt/json/JSONArray;

    .line 84
    iget-boolean v1, p3, Ll/ۚ۫ۚ;->ۙ:Z

    const/16 v2, 0xc8

    const-string v3, "limitMax"

    const-string v4, "appType"

    const-string v5, "query"

    if-eqz v1, :cond_0

    .line 0
    invoke-static {v5, p0, v4, p2}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "recommendedLimit"

    .line 85
    invoke-virtual {v1, v6, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 86
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "afterPackage"

    iget-object v6, p3, Ll/ۚ۫ۚ;->ۤ:Ljava/lang/String;

    invoke-virtual {v1, v2, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const/4 v9, 0x0

    const-string v6, "installed_apps"

    const-string v7, "installed_apps"

    const-string v8, ""

    .line 120
    invoke-static/range {v6 .. v11}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 87
    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    const-string v7, "nextCursor"

    if-eqz v1, :cond_1

    const-string v8, "editSessionId"

    const-string v9, ""

    const-string v10, "workspaceId"

    const-string v11, "installed_apps"

    .line 0
    invoke-static {v10, v11, v8, v9}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 90
    invoke-virtual {v8, v7, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "limit"

    invoke-virtual {v8, v9, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v8, "mt_apk_continue"

    const-string v9, "continue"

    const-string v10, "Continue installed apps"

    .line 88
    invoke-static {p1, v8, v9, v10}, Ll/ۖܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {v2, p1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 91
    :cond_1
    iget-boolean p1, p3, Ll/ۚ۫ۚ;->ᩴ:Z

    const-string v8, "count"

    const-string v9, "code"

    if-eqz p1, :cond_2

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v10, "installed_apps_permission_denied"

    invoke-virtual {p1, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const/4 v10, 0x1

    invoke-virtual {p1, v8, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {v6, p1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 92
    :cond_2
    iget p1, p3, Ll/ۚ۫ۚ;->᩸:I

    if-lez p1, :cond_3

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v10, "metadata_unavailable"

    invoke-virtual {p1, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    iget v9, p3, Ll/ۚ۫ۚ;->᩸:I

    invoke-virtual {p1, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {v6, p1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 0
    :cond_3
    invoke-static {v5, p0, v4, p2}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "items"

    .line 93
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "warnings"

    invoke-virtual {p0, p1, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 94
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "hasMore"

    iget-boolean p3, p3, Ll/ۚ۫ۚ;->ۙ:Z

    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1, v7, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "returnedCount"

    .line 95
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const/16 p2, 0xc8

    invoke-virtual {p1, v3, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "totalAvailableCount"

    sget-object p3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "pagination"

    .line 94
    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 96
    new-instance p1, Ll/֨ܳۚ;

    invoke-static {p0, v2}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-direct {p1, p0}, Ll/֨ܳۚ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object p1
.end method

.method public static ۙ(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۢܳۚ;
    .locals 5

    .line 118
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "appType"

    const-string v2, "all"

    const-string v3, "query"

    const-string v4, ""

    .line 0
    invoke-static {v3, v4, v1, v2}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "limit"

    const/16 v3, 0x32

    .line 119
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid installed app query argument"

    .line 118
    invoke-static {v2, p0, p1, v0, v1}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 114
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x200

    if-gt v0, v1, :cond_2

    const-string p0, "all"

    .line 115
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "user"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "system"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, "appType"

    invoke-static {p1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-static {p0, p1}, Ll/᩶ۗۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-void

    :cond_2
    const-string p1, "query"

    .line 114
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {p1, p0}, Ll/᩶ۗۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final ۙ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 25
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 63
    invoke-static {p1}, Ll/ܳۧۤ;->ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
    .locals 5

    .line 66
    invoke-virtual {p1}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "limit"

    const-string v3, "appType"

    const-string v4, "query"

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 67
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-static {v1, p1}, Ll/᩶ۗۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    .line 69
    :cond_2
    invoke-static {p1, v4}, Ll/᩶ۗۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v3}, Ll/᩶ۗۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 70
    invoke-static {v0, v1}, Ll/᩶ۗۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۗۚ;->ۙ(Lbin/mt/json/JSONValue;)I

    move-result p1

    const-string v2, ""

    invoke-static {v0, p1, v1, v2}, Ll/᩶ۗۚ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/֨ܳۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
    .locals 4

    .line 76
    iget-object v0, p1, Ll/ܰ۫ۚ;->᩷:Lbin/mt/json/JSONObject;

    const-string v1, "query"

    invoke-static {v0, v1}, Ll/᩶ۗۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "appType"

    invoke-static {v0, v2}, Ll/᩶ۗۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 77
    invoke-static {v1, v0}, Ll/᩶ۗۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "limit"

    .line 78
    invoke-virtual {p2, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-nez v3, :cond_0

    iget p2, p1, Ll/ܰ۫ۚ;->᩸:I

    invoke-static {p2}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p2

    :goto_0
    invoke-static {p2}, Ll/᩶ۗۚ;->ۙ(Lbin/mt/json/JSONValue;)I

    move-result p2

    iget-object p1, p1, Ll/ܰ۫ۚ;->ۤ:Lbin/mt/json/JSONObject;

    const-string v2, "afterPackage"

    .line 79
    invoke-static {p1, v2}, Ll/᩶ۗۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 78
    invoke-static {v1, p2, v0, p1}, Ll/᩶ۗۚ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/֨ܳۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ۤ()Lbin/mt/json/JSONObject;
    .locals 1

    const-string v0, "{\"query\":{\"type\":\"string\",\"description\":\"One literal substring matched case-insensitively against the app name OR package name. Empty string disables filtering. Maximum 512 UTF-16 units.\"},\n \"appType\":{\"type\":\"string\",\"enum\":[\"all\",\"user\",\"system\"],\"description\":\"all: all visible installed apps, including disabled apps and apps without launcher icons; user: non-system apps; system: system apps and updated system apps. Use all unless a specific type is requested.\"},\n \"limit\":{\"type\":\"integer\",\"description\":\"Number of apps on the first page, 1..200; recommended 50.\"}}\n"

    .line 27
    invoke-static {v0}, Ll/ۜۚܺ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "List Installed Apps"

    return-object v0
.end method

.method public final ᩴ()Lbin/mt/json/JSONObject;
    .locals 7

    .line 34
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "App name in the current language."

    .line 103
    invoke-static {v1, v2}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "appLabel"

    .line 35
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Installed package name."

    .line 96
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "packageName"

    .line 36
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Display version."

    .line 103
    invoke-static {v1, v2}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "versionName"

    .line 37
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Full version code as a decimal string, preserving 64-bit precision."

    .line 96
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "versionCode"

    .line 38
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v3, "True for system apps and updated system apps; false for user apps."

    .line 124
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "systemApp"

    .line 39
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Whether the app is enabled."

    .line 124
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "enabled"

    .line 40
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "integer"

    const-string v3, "Minimum Android API level."

    .line 117
    invoke-static {v2, v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "minSdk"

    .line 41
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Target Android API level."

    .line 117
    invoke-static {v2, v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "targetSdk"

    .line 42
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Total base and split APK bytes, excluding data and cache."

    .line 117
    invoke-static {v2, v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "size"

    .line 43
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Base APK bytes."

    .line 117
    invoke-static {v2, v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "baseApkSize"

    .line 44
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Additional APK count, excluding base."

    .line 110
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "splitCount"

    .line 45
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "path"

    const-string v4, "Copy to mt_apk_workspace_open.path; resolves the currently installed base APK."

    const-string v5, "Metadata for one visible installed app. Unavailable fields are null."

    .line 0
    invoke-static {v0, v1, v4, v3, v5}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 47
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "installed_apps_permission_denied: apps may be hidden by permissions. metadata_unavailable: candidate apps have unreadable metadata and may be omitted when their names cannot be matched."

    .line 96
    invoke-static {v1, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "code"

    .line 48
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "count"

    const-string v5, "For metadata_unavailable, the number of affected candidates encountered on this page, including omitted candidates. For installed_apps_permission_denied, 1 marks a restriction, not the number of hidden apps."

    const-string v6, "A restriction or metadata failure encountered while producing this page."

    .line 0
    invoke-static {v3, v2, v5, v4, v6}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 50
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Keyword used."

    .line 96
    invoke-static {v1, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "query"

    .line 51
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Application type filter."

    .line 96
    invoke-static {v1, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "appType"

    .line 52
    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 53
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "type"

    const-string v5, "array"

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "items"

    invoke-virtual {v3, v6, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v6, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 54
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v6, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "description"

    const-string v3, "With warnings, even an empty last page does not prove an app is absent. Resolve permission restrictions or retry the query before concluding it is not installed."

    .line 55
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "warnings"

    .line 54
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Maximum page size."

    const-string v2, "Not calculated for this listing; always null. Use hasMore to decide whether to continue."

    const-string v3, "Apps returned on this page."

    .line 56
    invoke-static {v3, v1, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Installed app page."

    .line 50
    invoke-static {v0, v1}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 59
    invoke-static {}, Ll/ܰ᩵ۚ;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/ۤܳۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "continue"

    .line 61
    invoke-static {}, Ll/ܶܿ֫;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_continue"

    .line 60
    invoke-static {v3, v4, v2}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Lbin/mt/json/JSONObject;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const-string v2, "Next-page action; copy its complete arguments."

    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_list_installed_apps. Use nextActions for continuation."

    .line 58
    invoke-static {v3, v0, v1, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const-string v0, "Find apps installed for the current Android user that MT can see. To find APK files in Home instead, use mt_apk_list_available_apks. Pass a returned data.items[].path to mt_apk_workspace_open before inspecting APK contents; split apps open only their base APK. Installation or removal can change later pages; start a new query for a fresh full listing. Follow nextActions to continue."

    return-object v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_list_installed_apps"

    return-object v0
.end method

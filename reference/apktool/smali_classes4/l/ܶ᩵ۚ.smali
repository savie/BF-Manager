.class public final Ll/ܶ᩵ۚ;
.super Ljava/lang/Object;
.source "S79P"


# static fields
.field public static final ۙ:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "native_strings"

    const-string v1, "resource_table_file_paths"

    const-string v2, "smali"

    const-string v3, "native_symbols"

    .line 20
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܶ᩵ۚ;->ۙ:[Ljava/lang/String;

    return-void
.end method

.method public static ۙ(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;
    .locals 6

    const-string v0, "mt_apk_continue"

    const-string v1, "mt_apk_workspace_open"

    .line 641
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    .line 648
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    if-nez p0, :cond_0

    goto :goto_2

    .line 652
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbin/mt/json/JSONValue;

    .line 653
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "tool"

    const/4 v4, 0x0

    .line 665
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    :goto_1
    const/4 v5, 0x2

    if-ge v4, v5, :cond_1

    .line 666
    aget-object v5, v0, v4

    .line 667
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 655
    new-instance v3, Lbin/mt/json/JSONObject;

    invoke-direct {v3, v2}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v1, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    return-object v1
.end method

.method public static ۙ()Lbin/mt/json/JSONObject;
    .locals 4

    .line 696
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id for follow-up calls."

    .line 96
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 697
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Session id for follow-up calls; empty means the base APK."

    .line 96
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editSessionId"

    .line 698
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 13

    .line 103
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    const/4 v2, 0x0

    .line 104
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "temporary"

    const/4 v3, 0x0

    .line 105
    invoke-virtual {p0, v1, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "apkFileName"

    .line 106
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "packageName"

    .line 107
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "versionName"

    .line 108
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "versionCode"

    .line 109
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-static {v4}, Ll/ۨᩴۚ;->᩸(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "minSdk"

    .line 110
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-static {v4}, Ll/ۨᩴۚ;->᩸(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "targetSdk"

    .line 111
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-static {v4}, Ll/ۨᩴۚ;->᩸(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "appLabel"

    .line 112
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "installedApp"

    .line 113
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    if-nez v4, :cond_0

    sget-object v4, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    :goto_0
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "counts"

    .line 114
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    if-nez v4, :cond_1

    .line 229
    sget-object v4, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    .line 231
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "zipEntries"

    .line 232
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "dexEntries"

    .line 233
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "xmlEntries"

    .line 234
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "classes"

    .line 235
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v5, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 114
    :goto_1
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "capabilities"

    .line 115
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    if-nez v4, :cond_2

    .line 243
    sget-object v4, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_2

    .line 245
    :cond_2
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "canReadAxml"

    .line 246
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "canSearchDexNames"

    .line 247
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "canSearchDexStrings"

    .line 248
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "canReadResourceTable"

    .line 249
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v5, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 115
    :goto_2
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "signature"

    .line 116
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "error"

    const-string v6, "certificates"

    const-string v7, "hasDifferentCertificates"

    const-string v8, "signaturePresent"

    const-string v9, "available"

    const-string v10, "schemes"

    if-nez v4, :cond_3

    .line 0
    invoke-static {v9, v8, v3, v3}, Ll/᩺᩸ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;ZZ)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 260
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    invoke-virtual {v4, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 261
    invoke-virtual {v4, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 262
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Signature summary is unavailable."

    .line 263
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    goto :goto_5

    .line 265
    :cond_3
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 266
    invoke-virtual {v4, v9, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v12

    invoke-virtual {v11, v9, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 267
    invoke-virtual {v4, v8, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v11

    invoke-virtual {v9, v8, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 268
    invoke-virtual {v4, v10}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v9

    invoke-static {v9}, Ll/ܶ᩵ۚ;->᩷(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v9

    invoke-virtual {v8, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 269
    invoke-virtual {v4, v7, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v8, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 270
    invoke-virtual {v4, v6}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v7

    .line 278
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    if-nez v7, :cond_4

    goto :goto_4

    .line 282
    :cond_4
    invoke-virtual {v7}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lbin/mt/json/JSONValue;

    .line 283
    invoke-virtual {v9}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 284
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 285
    invoke-virtual {v9, v10}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v12

    invoke-static {v12}, Ll/ܶ᩵ۚ;->᩷(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v12

    invoke-virtual {v11, v10, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "sha256"

    .line 286
    invoke-virtual {v9, v12, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v12, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 284
    invoke-virtual {v8, v9}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_3

    .line 270
    :cond_5
    :goto_4
    invoke-virtual {v3, v6, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 271
    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 116
    :goto_5
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "resourceTableSummaryError"

    .line 117
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextActions"

    .line 118
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 7

    const-string v0, "description"

    const-string v1, "Current page items."

    const-string v2, "type"

    const-string v3, "array"

    .line 0
    invoke-static {v2, v3, v0, v1}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "items"

    .line 68
    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value."

    const-string v1, "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."

    const-string v2, "Number of items returned on this page."

    .line 1138
    invoke-static {v2, v0, v1}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 69
    invoke-static {v0}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "pagination"

    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string p1, "Result for "

    const-string v0, ". data.items contains the current page; nextActions carries continuation or recovery calls."

    .line 0
    invoke-static {p1, p2, v0}, Ll/ܰ۟ۙ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Successful list data."

    .line 71
    invoke-static {p0, p2}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 72
    invoke-static {}, Ll/ܰ᩵ۚ;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object p2

    invoke-static {p2}, Ll/ۤܳۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string v0, "continue"

    .line 1164
    invoke-static {}, Ll/ܶܿ֫;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_continue"

    .line 1163
    invoke-static {v1, v2, v0}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "retry"

    .line 1166
    invoke-static {}, Ll/ܶܿ֫;->۫()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_workspace_open"

    .line 1165
    invoke-static {v2, v3, v1}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 1168
    invoke-static {}, Ll/ܶܿ֫;->᩸()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_list_entries"

    const-string v4, "verify_workspace"

    .line 1167
    invoke-static {v2, v3, v4}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_dex_list_classes"

    .line 1170
    invoke-static {}, Ll/ܶܿ֫;->ۤ()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 1169
    invoke-static {v5, v3, v4}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "mt_apk_resource_list"

    .line 1172
    invoke-static {}, Ll/ܶܿ֫;->ᩴ()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 1171
    invoke-static {v6, v5, v4}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const/4 v5, 0x5

    new-array v5, v5, [Lbin/mt/json/JSONObject;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v3, v5, v0

    const/4 v0, 0x4

    aput-object v4, v5, v0

    const-string v0, "Executable continue or recovery actions; copy arguments directly."

    .line 1162
    invoke-static {v0, v5}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 70
    invoke-static {p1, p0, p2, v0}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 13

    const-string v11, "null_value"

    const-string v12, "unparsed"

    const-string v0, "text"

    const-string v1, "styled_text"

    const-string v2, "number"

    const-string v3, "boolean"

    const-string v4, "color"

    const-string v5, "dimension"

    const-string v6, "fraction"

    const-string v7, "reference"

    const-string v8, "attribute"

    const-string v9, "file_path"

    const-string v10, "item_list"

    .line 1132
    filled-new-array/range {v0 .. v12}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 214
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    iget-object v1, p0, Ll/ۢܳۚ;->۟:Lbin/mt/json/JSONArray;

    invoke-static {v1}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p0, v0, v1}, Ll/ܳۧۤ;->ۙ(Ll/ۢܳۚ;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V
    .locals 5

    const-string v0, "matchOffsets"

    .line 509
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    .line 562
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    .line 564
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, ""

    const-string v3, "text"

    .line 565
    invoke-virtual {p1, v3, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "textStartOffset"

    const/4 v3, 0x0

    .line 566
    invoke-virtual {p1, v2, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "textTruncated"

    .line 567
    invoke-virtual {p1, v2, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "start"

    .line 568
    invoke-virtual {p1, v2, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "end"

    .line 569
    invoke-virtual {p1, v2, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 509
    :goto_0
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-void
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)V
    .locals 4

    const-string v0, "string"

    const-string v1, "SO-local virtual address as lowercase 0x hex, or null."

    .line 103
    invoke-static {v0, v1}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "virtualAddress"

    .line 1015
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "SO-local file offset as lowercase 0x hex, or null."

    .line 103
    invoke-static {v0, v1}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "fileOffset"

    .line 1016
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "integer"

    const-string v2, "Decimal byteOffset safe to pass to mt_apk_read_bytes, or null when unavailable or outside the integer range."

    .line 117
    invoke-static {v1, v2}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "readBytesByteOffset"

    .line 1017
    invoke-virtual {p0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v2, "Non-negative. "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 110
    invoke-static {v1, p1}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "byteSize"

    .line 1018
    invoke-virtual {p0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "virtual"

    const-string v1, "file_offset"

    filled-new-array {p1, v1}, [Ljava/lang/String;

    move-result-object p1

    const-string v1, "addressKind to pass to mt_apk_native_xref, or null when xref is not directly available."

    .line 1019
    invoke-static {v1, p1}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "xrefAddressKind"

    invoke-virtual {p0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "Address string to pass to mt_apk_native_xref, or null when unavailable."

    .line 103
    invoke-static {v0, p1}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "xrefAddress"

    .line 1021
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-void
.end method

.method public static varargs ۙ(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V
    .locals 4

    if-eqz p0, :cond_2

    .line 519
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 520
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 521
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Native search nativeLocation is missing "

    .line 0
    invoke-static {p1, v2}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 521
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-void

    .line 517
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Native search hit is missing nativeLocation"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۚ()Lbin/mt/json/JSONObject;
    .locals 10

    .line 728
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id used for this xref result."

    .line 103
    invoke-static {v1, v2}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 729
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id used for this xref result; pass this value together with data.workspaceId when reading refs[i].sourceLocator."

    .line 103
    invoke-static {v1, v2}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 730
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Queried dex_method, dex_field, or dex_class locator."

    .line 103
    invoke-static {v1, v2}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "targetLocator"

    .line 731
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "field_access"

    const-string v3, "type_reference"

    const-string v4, "method_call"

    .line 1096
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "Reference kind for this result."

    invoke-static {v3, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "referenceKind"

    .line 732
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "exact"

    const-string v3, "slot"

    const-string v4, "dispatch"

    const-string v5, "not_applicable"

    .line 1105
    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "Method resolution mode used for method scans; field and type scans return not_applicable."

    invoke-static {v4, v3}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "methodResolution"

    .line 733
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "description"

    const-string v4, "Current page incoming instruction references. First pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator as mt_apk_dex_read_pseudocode.locator to understand the containing method."

    const-string v6, "type"

    const-string v7, "array"

    .line 0
    invoke-static {v6, v7, v3, v4}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1083
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Containing dex_method locator. First pass data.workspaceId, data.editSessionId, and this string as mt_apk_dex_read_pseudocode.locator for method logic. Use mt_apk_read_text only when exact instructions or editing are needed, pseudocode generation fails, or the logic remains unclear after reading the relevant pseudocode pages."

    .line 96
    invoke-static {v1, v6}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "sourceLocator"

    .line 1084
    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Raw bytecode reference operand at the instruction; method and field operands are smali references, type operands are descriptors. It may differ from the target part after the first colon in data.targetLocator for slot/dispatch method matches or array type references."

    .line 96
    invoke-static {v1, v6}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "referenceOperand"

    .line 1085
    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "possible_virtual_dispatch"

    const-string v7, "super_call"

    const-string v8, "exact_reference"

    const-string v9, "same_virtual_slot"

    .line 1114
    filled-new-array {v8, v9, v6, v7}, [Ljava/lang/String;

    move-result-object v6

    const-string v7, "Match category: exact_reference means the instruction operand exactly matched the target reference or class component; same_virtual_slot means method operand shares the target virtual slot; possible_virtual_dispatch means runtime method dispatch may reach the target; super_call means invoke-super matched the target under the selected methodResolution while referenceOperand remains the raw bytecode owner."

    invoke-static {v7, v6}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "matchKind"

    .line 1086
    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "possible"

    .line 1123
    filled-new-array {v2, v6, v5}, [Ljava/lang/String;

    move-result-object v2

    const-string v5, "Method dispatch certainty; field and type references return not_applicable."

    invoke-static {v5, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "dispatchCertainty"

    .line 1087
    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Instruction opcode name."

    .line 96
    invoke-static {v1, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "opcode"

    .line 1088
    invoke-virtual {v2, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "0-based instruction index within the caller method implementation."

    const-string v4, "integer"

    const-string v5, "instructionIndex"

    const-string v6, "One incoming instruction reference."

    .line 0
    invoke-static {v1, v4, v2, v5, v6}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "items"

    .line 1079
    invoke-virtual {v3, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "refs"

    .line 734
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value."

    const-string v2, "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."

    const-string v3, "Number of items returned on this page."

    .line 1138
    invoke-static {v3, v1, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 735
    invoke-static {v1}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Successful mt_apk_dex_xref data."

    .line 728
    invoke-static {v0, v1}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 96
    invoke-static {}, Ll/ܰ᩵ۚ;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/ۤܳۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {}, Ll/ܶ᩵ۚ;->۫()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_dex_xref. data.refs[] contains incoming instruction references; first pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator to mt_apk_dex_read_pseudocode to understand containing methods; nextActions carries continuation or retry calls."

    .line 95
    invoke-static {v3, v0, v1, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ۤ()Lbin/mt/json/JSONObject;
    .locals 6

    .line 52
    invoke-static {}, Ll/ܶ᩵ۚ;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 800
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "string"

    const-string v3, "zip_entry locator. Pass data.workspaceId, data.editSessionId, and this locator to mt_apk_read_text or mt_apk_read_bytes."

    .line 96
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "locator"

    .line 801
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "ZIP entry size in bytes, or null when an edited AXML overlay has not been encoded yet."

    const-string v4, "integer"

    .line 117
    invoke-static {v4, v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "size"

    .line 802
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 807
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Resource locator."

    .line 96
    invoke-static {v2, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "resourceLocator"

    .line 808
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Resource name."

    .line 96
    invoke-static {v2, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "resourceName"

    .line 809
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Resource table entry whose value points to this ZIP entry."

    .line 807
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 803
    invoke-static {v2}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "referencedByResource"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "One ZIP entry item."

    .line 800
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_list_entries"

    .line 52
    invoke-static {v0, v1, v2}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 8

    .line 159
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    const/4 v2, 0x0

    .line 160
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, ""

    const-string v3, "editSessionId"

    .line 161
    invoke-virtual {p0, v3, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "targetLocator"

    .line 162
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v3}, Ll/ۨᩴۚ;->ۤ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "referenceKind"

    .line 163
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "methodResolution"

    .line 164
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "data"

    .line 165
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 400
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    if-nez v1, :cond_0

    goto :goto_1

    .line 404
    :cond_0
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbin/mt/json/JSONValue;

    .line 405
    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 406
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "sourceLocator"

    .line 407
    invoke-virtual {v4, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-static {v7}, Ll/ۨᩴۚ;->ۤ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "referenceOperand"

    .line 408
    invoke-virtual {v4, v6, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "matchKind"

    .line 409
    invoke-virtual {v4, v6, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "dispatchCertainty"

    .line 410
    invoke-virtual {v4, v6, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "opcode"

    .line 411
    invoke-virtual {v4, v6, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const/4 v6, 0x0

    const-string v7, "instructionIndex"

    .line 412
    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v5, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 406
    invoke-virtual {v3, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_1
    :goto_1
    const-string v1, "refs"

    .line 165
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "pagination"

    .line 166
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/ۨᩴۚ;->ۙ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextActions"

    .line 167
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {p0}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۫()Lbin/mt/json/JSONObject;
    .locals 4

    const-string v0, "continue"

    .line 1192
    invoke-static {}, Ll/ܶܿ֫;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_continue"

    .line 1191
    invoke-static {v1, v2, v0}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "retry"

    .line 1194
    invoke-static {}, Ll/ܶܿ֫;->۫()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_workspace_open"

    .line 1193
    invoke-static {v2, v3, v1}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lbin/mt/json/JSONObject;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const-string v0, "Executable continue or retry actions; copy arguments directly."

    .line 1190
    invoke-static {v0, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ܳ()Lbin/mt/json/JSONObject;
    .locals 32

    .line 717
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id used for this search result."

    .line 103
    invoke-static {v1, v2}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 718
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id used for this search result; pass this value together with data.workspaceId for follow-up reads, native follow-up tools, mt_apk_dex_read_class_outline for dex_class locators, mt_apk_resource_xref for resource locators, or mt_apk_dex_xref for dex locators."

    .line 103
    invoke-static {v1, v2}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 719
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Current page search hits. Use data.workspaceId and data.editSessionId for follow-up calls. For dex_class or dex_method logic, first use mt_apk_dex_read_pseudocode; read dex_field directly with mt_apk_read_text. Use mt_apk_read_text only for text-like locators; class and method Smali reads are for exact instructions, editing, failed pseudocode generation, or logic that remains unclear after reading the relevant pseudocode pages. For resource value hits, mt_apk_resource_read needs reads[0].locator, reads[0].variant from hit.variant, and required budget fields. For dex_class hits, pass the full locator to mt_apk_dex_read_class_outline.locator. For native_symbol_name hits, use hit.nativeLocation with mt_apk_native_list_items or mt_apk_native_xref. For native_string hits, use mt_apk_native_xref data scan or mt_apk_read_bytes when hit.nativeLocation provides xref/read_bytes fields. snippet is readable context only; nativeLocation is the structured parameter source."

    const-string v3, "type"

    const-string v4, "array"

    const-string v5, "description"

    .line 0
    invoke-static {v3, v4, v5, v2}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 889
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Locator for follow-up reads. Copy data.workspaceId, data.editSessionId, and the full locator string. For dex_class or dex_method logic, first use mt_apk_dex_read_pseudocode; read dex_field directly with mt_apk_read_text. DEX method/field locators contain full Smali references regardless of the reading tool. For resource value hits, build mt_apk_resource_read reads[] with this locator and hit.variant, plus required budget fields. For dex_class hits, pass this full locator to mt_apk_dex_read_class_outline.locator if you need fields and methods. For resource hits, pass the locator to mt_apk_resource_xref when resource references are needed; for dex_class, dex_method, or dex_field hits, pass the locator to mt_apk_dex_xref when incoming dex references are needed. For native hits, the locator is the SO zip_entry locator."

    .line 96
    invoke-static {v1, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "locator"

    .line 890
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Search scope that produced this hit."

    .line 96
    invoke-static {v1, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "searchScope"

    .line 891
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 896
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "Search hit details selected by hit.kind. Each branch contains only fields that apply to that hit kind."

    .line 897
    invoke-virtual {v7, v5, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 898
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v9

    .line 909
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v11, "dex_field_name"

    const-string v12, "dex_method_name"

    const-string v13, "zip_entry_path"

    const-string v14, "dex_class_name"

    filled-new-array {v13, v14, v11, v12}, [Ljava/lang/String;

    move-result-object v11

    const-string v12, "Hit kind."

    .line 910
    invoke-static {v12, v11}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v13, "kind"

    invoke-virtual {v10, v13, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v11, "What part of the candidate matched, or null when unavailable."

    .line 103
    invoke-static {v1, v11}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "matchKind"

    .line 912
    invoke-virtual {v10, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 913
    invoke-static {}, Ll/ܶ᩵ۚ;->ᩴ()Lbin/mt/json/JSONObject;

    move-result-object v14

    invoke-static {v14}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v14

    move-object/from16 v16, v8

    const-string v8, "matchOffsets"

    invoke-virtual {v10, v8, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v14, "ZIP entry or dex name hit."

    .line 909
    invoke-static {v10, v14}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 899
    invoke-virtual {v9, v10}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v9

    .line 917
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v14, "axml_text"

    move-object/from16 v17, v0

    const-string v0, "smali_text"

    filled-new-array {v14, v0}, [Ljava/lang/String;

    move-result-object v0

    .line 918
    invoke-static {v12, v0}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v10, v13, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 103
    invoke-static {v1, v11}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 919
    invoke-virtual {v0, v15, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v10, "Bounded readable preview, or null when disabled or omitted by the preview budget."

    .line 103
    invoke-static {v1, v10}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    move-object/from16 v18, v2

    const-string v2, "snippet"

    .line 920
    invoke-virtual {v0, v2, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v14, "integer"

    move-object/from16 v19, v6

    const-string v6, "0-based line containing the match."

    .line 110
    invoke-static {v14, v6}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    move-object/from16 v20, v7

    const-string v7, "line"

    .line 921
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v6, "0-based column containing the match."

    .line 110
    invoke-static {v14, v6}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "column"

    .line 922
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 923
    invoke-static {}, Ll/ܶ᩵ۚ;->ᩴ()Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-static {v6}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-virtual {v0, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v6, "Decoded AXML or Smali text hit."

    .line 917
    invoke-static {v0, v6}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 900
    invoke-virtual {v9, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 927
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "resource_table_name"

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    .line 928
    invoke-static {v12, v7}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    invoke-virtual {v6, v13, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 103
    invoke-static {v1, v11}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 929
    invoke-virtual {v6, v15, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Resource table type name."

    .line 96
    invoke-static {v1, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 930
    invoke-virtual {v6, v3, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "Resource entry name."

    move-object/from16 v21, v4

    .line 96
    invoke-static {v1, v9}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v22, v5

    const-string v5, "name"

    .line 931
    invoke-virtual {v6, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "resource_id"

    move-object/from16 v23, v14

    filled-new-array {v6, v5}, [Ljava/lang/String;

    move-result-object v14

    move-object/from16 v24, v2

    const-string v2, "Matched resource field."

    .line 932
    invoke-static {v2, v14}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v14, "matchField"

    invoke-virtual {v4, v14, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 934
    invoke-static {}, Ll/ܶ᩵ۚ;->ᩴ()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Resource table id or name hit."

    .line 927
    invoke-static {v2, v4}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 901
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 938
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "resource_table_value"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    .line 939
    invoke-static {v12, v4}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v13, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 103
    invoke-static {v1, v11}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 940
    invoke-virtual {v2, v15, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 96
    invoke-static {v1, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 941
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 96
    invoke-static {v1, v9}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 942
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Variant containing the matched value, or null."

    .line 103
    invoke-static {v1, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "variant"

    .line 943
    invoke-virtual {v2, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Top-level resource value kind, or null."

    .line 944
    invoke-static {v4}, Ll/ܶ᩵ۚ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "valueKind"

    invoke-virtual {v2, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Matched resource value preview up to 300 chars, or null."

    .line 103
    invoke-static {v1, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "valueSnippet"

    .line 945
    invoke-virtual {v2, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "boolean"

    const-string v7, "Whether the matched resource value is styled text."

    .line 124
    invoke-static {v4, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "styled"

    .line 946
    invoke-virtual {v2, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v7, "Whether valueSnippet was truncated."

    .line 124
    invoke-static {v4, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "truncated"

    .line 947
    invoke-virtual {v2, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v7, "styledText"

    const-string v9, "file_path"

    move-object/from16 v25, v4

    const-string v4, "value"

    filled-new-array {v6, v5, v4, v7, v9}, [Ljava/lang/String;

    move-result-object v4

    const-string v6, "Matched resource field, or null."

    .line 948
    invoke-static {v6, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v14, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Matched file locator, or null."

    .line 103
    invoke-static {v1, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "fileLocator"

    .line 950
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Matched target resource locator, or null."

    .line 103
    invoke-static {v1, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "targetLocator"

    .line 951
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Item key for item value hits, or null."

    .line 103
    invoke-static {v1, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "itemKey"

    .line 952
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Item value kind for item value hits, or null."

    .line 953
    invoke-static {v4}, Ll/ܶ᩵ۚ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "itemValueKind"

    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Item key resource locator, or null."

    .line 103
    invoke-static {v1, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "itemKeyLocator"

    .line 954
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 955
    invoke-static {}, Ll/ܶ᩵ۚ;->ᩴ()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Resource table value hit."

    .line 938
    invoke-static {v2, v4}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 902
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 959
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "dex_string_matches"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    .line 960
    invoke-static {v12, v4}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v13, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 103
    invoke-static {v1, v11}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 961
    invoke-virtual {v2, v15, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 103
    invoke-static {v1, v10}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v6, v24

    .line 962
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 963
    invoke-static {}, Ll/ܶ᩵ۚ;->ᩴ()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Total dex string match count for this locator."

    move-object/from16 v7, v23

    .line 110
    invoke-static {v7, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v9, "matchCount"

    .line 964
    invoke-virtual {v2, v9, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Bounded dex_string match previews."

    move-object/from16 v9, v21

    move-object/from16 v11, v22

    .line 0
    invoke-static {v3, v9, v11, v4}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 1045
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v14

    move-object/from16 v21, v3

    const-string v3, "Continuous window of the original matched string, limited to 120 Unicode code points."

    .line 103
    invoke-static {v1, v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v22, v9

    const-string v9, "text"

    .line 1046
    invoke-virtual {v14, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "Zero-based UTF-16 start offset of text in the original string."

    .line 110
    invoke-static {v7, v9}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "textStartOffset"

    .line 1047
    invoke-virtual {v3, v14, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "Whether text omits any part of the original string."

    move-object/from16 v14, v25

    .line 124
    invoke-static {v14, v9}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    move-object/from16 v23, v11

    const-string v11, "textTruncated"

    .line 1048
    invoke-virtual {v3, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1036
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v11, "Inclusive match start in the original string."

    .line 110
    invoke-static {v7, v11}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    move-object/from16 v24, v5

    const-string v5, "start"

    .line 1037
    invoke-virtual {v9, v5, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v9, "Exclusive match end in the original string; may extend beyond the text preview when truncated."

    .line 110
    invoke-static {v7, v9}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "end"

    .line 1038
    invoke-virtual {v5, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "Matched dex string offsets when includeMatchOffsets=true. Zero-based UTF-16 positions in the original string; subtract the containing item\'s textStartOffset to locate the match within its text preview."

    .line 1035
    invoke-static {v5, v7}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 1049
    invoke-static {v5}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v3, v8, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "One matched dex string preview."

    .line 1045
    invoke-static {v3, v5}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "items"

    invoke-virtual {v4, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "matchedStrings"

    .line 965
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "matchedStringsTruncated"

    const-string v4, "Whether matchedStrings was truncated."

    const-string v7, "Dex string matches grouped by one class, field, or method locator."

    .line 0
    invoke-static {v2, v14, v4, v3, v7}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 903
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 970
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "native_symbol_name"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    .line 971
    invoke-static {v12, v3}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v13, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v30, "relocations.name"

    const-string v31, "relocations.demangledName"

    const-string v25, "imports.name"

    const-string v26, "imports.demangledName"

    const-string v27, "symbols.name"

    const-string v28, "symbols.demangledName"

    const-string v29, "entries.name"

    filled-new-array/range {v25 .. v31}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "Matched ELF name field. Its prefix equals nativeLocation.itemKind; entries only use the raw entries.name field."

    .line 972
    invoke-static {v4, v3}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v15, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 103
    invoke-static {v1, v10}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 975
    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 976
    invoke-static {}, Ll/ܶ᩵ۚ;->ᩴ()Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 998
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "entries"

    const-string v7, "relocations"

    const-string v9, "imports"

    const-string v11, "symbols"

    filled-new-array {v9, v11, v4, v7}, [Ljava/lang/String;

    move-result-object v4

    const-string v7, "ELF list containing this raw name. Copy it to mt_apk_native_list_items.itemKind."

    .line 999
    invoke-static {v7, v4}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "itemKind"

    invoke-virtual {v3, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Non-empty raw ELF name. Copy it to mt_apk_native_list_items.namePrefix; that tool has no name parameter."

    .line 96
    invoke-static {v1, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v7, v24

    .line 1001
    invoke-virtual {v3, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Readable C++ name when available; entries always use an empty string."

    .line 96
    invoke-static {v1, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "demangledName"

    .line 1002
    invoke-virtual {v3, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Whether the symbol is imported. imports always use true; relocations use false."

    .line 124
    invoke-static {v14, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "imported"

    .line 1003
    invoke-virtual {v3, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Symbol byte size when known; 0 for imports, relocations, or unknown. It is not a guaranteed function boundary."

    .line 1004
    invoke-static {v3, v4}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v4, "Structured native symbol follow-up values. xrefAddressKind and xrefAddress are either both non-null or both null; copy both to mt_apk_native_xref when present. For functions use scanKind=both and referenceKinds=[\"call\",\"jump\",\"data\"]. ARM32 errors may provide thumb/arm retry actions. Imports may lack an xref address; inspect same-name relocations or non-imported symbols. Relocation references concern the slot, not a complete caller graph."

    .line 1005
    invoke-static {v3, v4}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "nativeLocation"

    .line 977
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Native ELF symbol-like name hit with structured follow-up values."

    .line 970
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 904
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 981
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "native_string"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    .line 982
    invoke-static {v12, v3}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v13, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "strings.text"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v7, "Matched native string field."

    .line 983
    invoke-static {v7, v3}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v15, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 103
    invoke-static {v1, v10}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 984
    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 985
    invoke-static {}, Ll/ܶ᩵ۚ;->ᩴ()Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1009
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "ELF string byte length when known, otherwise 0."

    .line 1010
    invoke-static {v3, v6}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v6, "Structured native string follow-up values. xrefAddressKind and xrefAddress are either both non-null or both null; copy both to mt_apk_native_xref when present, with scanKind=data, referenceKinds=[\"data\"], and instructionMode=auto. Alternatively use readBytesByteOffset with mt_apk_read_bytes."

    .line 1011
    invoke-static {v3, v6}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 986
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Native ELF printable string hit with structured follow-up values."

    .line 981
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 905
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v2, "anyOf"

    move-object/from16 v3, v20

    .line 898
    invoke-virtual {v3, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "hit"

    move-object/from16 v3, v19

    .line 892
    invoke-virtual {v3, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "One search hit. locator is the follow-up read target; hit contains fields for the specific hit.kind."

    .line 888
    invoke-static {v0, v2}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v2, v18

    .line 884
    invoke-virtual {v2, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "hits"

    move-object/from16 v3, v17

    .line 720
    invoke-virtual {v3, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1070
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Stable hint code, or empty string when no hint applies."

    .line 96
    invoke-static {v1, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "code"

    .line 1071
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Short hint message, or empty string when no hint applies."

    const-string v6, "message"

    const-string v7, "Non-blocking filter hint. code=native_prefix_no_so_candidates means target=native_symbols/native_strings used a non-empty SO ZIP entry prefix that matched no lib/**/*.so candidate. Empty code/message means no hint applies."

    .line 0
    invoke-static {v2, v1, v3, v6, v7}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "filterHint"

    .line 721
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Public mt_apk_search target values not searched by target=overview. Empty for non-overview searches. This is a coverage hint, not an error list."

    move-object/from16 v3, v21

    move-object/from16 v7, v22

    move-object/from16 v8, v23

    .line 0
    invoke-static {v3, v7, v8, v2}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "A public mt_apk_search target value to call explicitly when needed."

    .line 96
    invoke-static {v1, v9}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 1066
    invoke-virtual {v2, v5, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "notSearchedTargets"

    .line 722
    invoke-virtual {v0, v9, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Scopes skipped because a partial search error did not fail the whole overview search."

    .line 0
    invoke-static {v3, v7, v8, v2}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1056
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "Skipped search scope."

    .line 96
    invoke-static {v1, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    move-object/from16 v8, v16

    .line 1057
    invoke-virtual {v3, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "Business error code for this skipped scope."

    .line 96
    invoke-static {v1, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 1058
    invoke-virtual {v3, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Human-readable skipped scope message."

    const-string v7, "One skipped search scope error."

    .line 0
    invoke-static {v3, v1, v4, v6, v7}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 1056
    invoke-virtual {v2, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "skippedScopes"

    .line 723
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value."

    const-string v2, "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."

    const-string v3, "Number of items returned on this page."

    .line 1138
    invoke-static {v3, v1, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 724
    invoke-static {v1}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Successful mt_apk_search data."

    .line 717
    invoke-static {v0, v1}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 88
    invoke-static {}, Ll/ܰ᩵ۚ;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/ۤܳۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {}, Ll/ܶ᩵ۚ;->۫()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_search. data.hits[] contains search hits with locators for follow-up calls; copy data.workspaceId and data.editSessionId into follow-up calls. data.notSearchedTargets lists public targets not covered by target=overview. data.filterHint is a non-blocking hint for likely filter misuse. Search is streamed: data.pagination.totalAvailableCount may be null, meaning unknown rather than zero. Continue while data.pagination.hasMore=true or nextActions includes mt_apk_continue. For native hits, data.hits[i].locator identifies the SO entry and data.hits[i].hit.nativeLocation contains structured values for mt_apk_native_list_items, mt_apk_native_xref, or mt_apk_read_bytes; snippet is readable context only. nextActions carries continuation or retry calls."

    .line 87
    invoke-static {v3, v0, v1, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩴ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 1026
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Continuous window of the actual searched candidate, including decoded text or normalized name aliases. Limited to 240 Unicode code points and the response preview budget; may be empty when that budget is exhausted. For native follow-up calls use hit.nativeLocation, not this preview."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "text"

    .line 1027
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "integer"

    const-string v2, "Start offset of text in the original candidate."

    .line 110
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "textStartOffset"

    .line 1028
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Whether text omits any part of the original candidate, including response budget truncation."

    const-string v3, "boolean"

    .line 124
    invoke-static {v3, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "textTruncated"

    .line 1029
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Inclusive match start in the original candidate."

    .line 110
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "start"

    .line 1030
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "end"

    const-string v3, "Exclusive match end in the original candidate; may exceed textStartOffset plus text length when truncated."

    const-string v4, "Match offsets and a bounded candidate text window when includeMatchOffsets=true. All offsets are zero-based UTF-16 positions in the original searched candidate, not byte offsets or edit ranges. Subtract textStartOffset from start/end to locate the match within text; a truncated window may omit part or all of the match."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩷(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;
    .locals 3

    .line 295
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    if-nez p0, :cond_0

    goto :goto_1

    .line 299
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    if-eqz v1, :cond_1

    .line 300
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 301
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static ᩷()Lbin/mt/json/JSONObject;
    .locals 6

    .line 57
    invoke-static {}, Ll/ܶ᩵ۚ;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 813
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "string"

    const-string v3, "dex_class locator. To call mt_apk_dex_read_class_outline, pass data.workspaceId, data.editSessionId, and this full locator."

    .line 96
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "locator"

    .line 814
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Java-style class name."

    .line 96
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "javaName"

    .line 815
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "integer"

    const-string v3, "Field count for this class."

    .line 110
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "fieldCount"

    .line 816
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "methodCount"

    const-string v4, "Method count for this class."

    const-string v5, "One dex class item."

    .line 0
    invoke-static {v1, v2, v4, v3, v5}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_dex_list_classes"

    .line 57
    invoke-static {v0, v1, v2}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 31

    move-object/from16 v0, p0

    .line 144
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    const/4 v3, 0x0

    .line 145
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editSessionId"

    const-string v4, ""

    .line 146
    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "data"

    .line 147
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 357
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    const-string v6, "searchScope"

    if-nez v2, :cond_1

    :cond_0
    move-object/from16 v17, v1

    move-object v1, v5

    move-object/from16 v18, v6

    goto/16 :goto_9

    .line 361
    :cond_1
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbin/mt/json/JSONValue;

    .line 362
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 363
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "locator"

    .line 364
    invoke-virtual {v7, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v10

    invoke-static {v10}, Ll/ۨᩴۚ;->ۤ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 365
    invoke-virtual {v7, v6, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "hit"

    .line 366
    invoke-virtual {v7, v9}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    if-nez v7, :cond_2

    .line 422
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    :cond_2
    const-string v10, "kind"

    .line 424
    invoke-virtual {v7, v10, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v11, "zip_entry_path"

    .line 489
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    const-string v13, "native_string"

    const-string v14, "native_symbol_name"

    const-string v15, "smali_text"

    move-object/from16 v16, v2

    const-string v2, "dex_string_matches"

    move-object/from16 v17, v11

    const-string v11, "resource_table_value"

    move-object/from16 v18, v6

    const-string v6, "resource_table_name"

    const-string v0, "axml_text"

    if-nez v12, :cond_4

    .line 490
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 491
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 492
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "dex_class_name"

    .line 493
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "dex_field_name"

    .line 494
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "dex_method_name"

    .line 495
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 496
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 497
    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 498
    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 499
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_1

    :cond_3
    move-object/from16 v3, v17

    :cond_4
    :goto_1
    const-string v12, "matchKind"

    move-object/from16 v17, v1

    const/4 v1, 0x0

    .line 425
    invoke-virtual {v7, v12, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v10, v3, v12, v1}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 429
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v12, "snippet"

    if-nez v0, :cond_10

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_7

    .line 434
    :cond_5
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v6, "type"

    const-string v15, "matchField"

    move-object/from16 v19, v5

    const-string v5, "name"

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    .line 435
    invoke-virtual {v7, v15, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_7

    const-string v2, "id"

    .line 437
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v2, "resource_id"

    goto :goto_2

    :cond_6
    move-object v2, v5

    .line 439
    :cond_7
    :goto_2
    invoke-virtual {v7, v6, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 440
    invoke-virtual {v7, v5, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 441
    invoke-virtual {v0, v15, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 442
    invoke-static {v10, v7}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    goto/16 :goto_6

    :cond_8
    const/4 v0, 0x0

    .line 443
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 444
    invoke-virtual {v7, v6, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 445
    invoke-virtual {v7, v5, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "variant"

    .line 446
    invoke-virtual {v7, v2, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "valueKind"

    .line 447
    invoke-virtual {v7, v2, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "valueSnippet"

    .line 448
    invoke-virtual {v7, v2, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "styled"

    const/4 v3, 0x0

    .line 449
    invoke-virtual {v7, v2, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "truncated"

    .line 450
    invoke-virtual {v7, v2, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 451
    invoke-virtual {v7, v15, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v15, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "fileLocator"

    .line 452
    invoke-virtual {v7, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v3}, Ll/ۨᩴۚ;->ۤ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetLocator"

    .line 453
    invoke-virtual {v7, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v3}, Ll/ۨᩴۚ;->ۤ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "itemKey"

    .line 454
    invoke-virtual {v7, v2, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "itemValueKind"

    .line 455
    invoke-virtual {v7, v2, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "itemKeyLocator"

    .line 456
    invoke-virtual {v7, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-static {v2}, Ll/ۨᩴۚ;->ۤ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 457
    invoke-static {v10, v7}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    goto/16 :goto_6

    .line 458
    :cond_9
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 459
    invoke-virtual {v7, v12, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v12, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 460
    invoke-static {v10, v7}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    const-string v0, "matchCount"

    const/4 v1, 0x0

    .line 461
    invoke-virtual {v7, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "matchedStrings"

    .line 462
    invoke-virtual {v7, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 588
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    if-nez v2, :cond_a

    goto :goto_5

    .line 592
    :cond_a
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbin/mt/json/JSONValue;

    .line 593
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 594
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v11, "text"

    const/4 v12, 0x0

    .line 595
    invoke-virtual {v5, v11, v12}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v11, "textStartOffset"

    const/4 v12, 0x0

    .line 596
    invoke-virtual {v5, v11, v12}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v13

    invoke-virtual {v6, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v11, "textTruncated"

    .line 597
    invoke-virtual {v5, v11, v12}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v13

    invoke-virtual {v6, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v11, "matchOffsets"

    .line 598
    invoke-virtual {v5, v11}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    if-nez v5, :cond_b

    .line 577
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_4

    .line 579
    :cond_b
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "start"

    .line 580
    invoke-virtual {v5, v14, v12}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v15

    invoke-virtual {v13, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "end"

    .line 581
    invoke-virtual {v5, v14, v12}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v13, v14, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 598
    :goto_4
    invoke-virtual {v6, v11, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 594
    invoke-virtual {v3, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_3

    :cond_c
    :goto_5
    const/4 v2, 0x0

    .line 462
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "matchedStringsTruncated"

    .line 463
    invoke-virtual {v7, v1, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    :goto_6
    move-object/from16 v20, v8

    goto/16 :goto_8

    .line 464
    :cond_d
    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "xrefAddress"

    const-string v2, "xrefAddressKind"

    const-string v6, "byteSize"

    const-string v11, "readBytesByteOffset"

    const-string v14, "fileOffset"

    const-string v15, "virtualAddress"

    move-object/from16 v20, v8

    const-string v8, "nativeLocation"

    if-eqz v0, :cond_e

    const/4 v0, 0x0

    .line 465
    invoke-virtual {v7, v12, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v12, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 466
    invoke-static {v10, v7}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    .line 468
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v29, "xrefAddressKind"

    const-string v30, "xrefAddress"

    const-string v21, "itemKind"

    const-string v22, "name"

    const-string v23, "demangledName"

    const-string v24, "imported"

    const-string v25, "virtualAddress"

    const-string v26, "fileOffset"

    const-string v27, "readBytesByteOffset"

    const-string v28, "byteSize"

    filled-new-array/range {v21 .. v30}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 531
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "itemKind"

    .line 532
    invoke-virtual {v0, v7, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v7, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 533
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "demangledName"

    .line 534
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "imported"

    const/4 v7, 0x0

    .line 535
    invoke-virtual {v0, v5, v7}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v5, 0x0

    .line 536
    invoke-virtual {v0, v15, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v15, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 537
    invoke-virtual {v0, v14, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v14, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 538
    invoke-virtual {v0, v11}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-static {v7}, Ll/ۨᩴۚ;->᩸(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v3, v11, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-wide/16 v11, 0x0

    .line 539
    invoke-virtual {v0, v6, v11, v12}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v11

    invoke-virtual {v3, v6, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 540
    invoke-virtual {v0, v2, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v2, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 541
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 467
    invoke-virtual {v10, v8, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto/16 :goto_8

    :cond_e
    const/4 v0, 0x0

    .line 472
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 473
    invoke-virtual {v7, v12, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v12, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 474
    invoke-static {v10, v7}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    .line 476
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v25, "xrefAddressKind"

    const-string v26, "xrefAddress"

    const-string v21, "virtualAddress"

    const-string v22, "fileOffset"

    const-string v23, "readBytesByteOffset"

    const-string v24, "byteSize"

    filled-new-array/range {v21 .. v26}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 548
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v5, 0x0

    .line 549
    invoke-virtual {v0, v15, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v15, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 550
    invoke-virtual {v0, v14, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v14, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 551
    invoke-virtual {v0, v11}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-static {v7}, Ll/ۨᩴۚ;->᩸(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v3, v11, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-wide/16 v11, 0x0

    .line 552
    invoke-virtual {v0, v6, v11, v12}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v11

    invoke-virtual {v3, v6, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 553
    invoke-virtual {v0, v2, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v2, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 554
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 475
    invoke-virtual {v10, v8, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_8

    .line 480
    :cond_f
    invoke-static {v10, v7}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    goto :goto_8

    :cond_10
    :goto_7
    move-object/from16 v19, v5

    move-object/from16 v20, v8

    const/4 v0, 0x0

    .line 430
    invoke-virtual {v7, v12, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v12, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "line"

    const/4 v2, 0x0

    .line 431
    invoke-virtual {v7, v1, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "column"

    .line 432
    invoke-virtual {v7, v1, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 433
    invoke-static {v10, v7}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    :goto_8
    move-object/from16 v0, v20

    .line 366
    invoke-virtual {v0, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, v19

    .line 363
    invoke-virtual {v1, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object v5, v1

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v6, v18

    goto/16 :goto_0

    :goto_9
    const/4 v0, 0x0

    const-string v2, "hits"

    move-object/from16 v3, v17

    .line 147
    invoke-virtual {v3, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "filterHint"

    move-object/from16 v3, p0

    .line 148
    invoke-virtual {v3, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "code"

    const-string v7, "message"

    if-nez v5, :cond_11

    .line 0
    invoke-static {v6, v4, v7, v4}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    goto :goto_a

    .line 391
    :cond_11
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 392
    invoke-virtual {v5, v6, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 393
    invoke-virtual {v5, v7, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 148
    :goto_a
    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "searchTarget"

    .line 149
    invoke-virtual {v3, v2, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 375
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    const-string v5, "overview"

    .line 376
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_c

    :cond_12
    :goto_b
    const/4 v2, 0x4

    if-ge v0, v2, :cond_13

    .line 379
    sget-object v2, Ll/ܶ᩵ۚ;->ۙ:[Ljava/lang/String;

    aget-object v2, v2, v0

    .line 380
    invoke-virtual {v4, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_13
    :goto_c
    const-string v0, "notSearchedTargets"

    .line 149
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "skippedScopeErrors"

    .line 150
    invoke-virtual {v3, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 607
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    if-nez v1, :cond_14

    goto :goto_e

    .line 611
    :cond_14
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbin/mt/json/JSONValue;

    .line 612
    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 613
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const/4 v8, 0x0

    move-object/from16 v9, v18

    .line 614
    invoke-virtual {v4, v9, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v10, "errorCode"

    .line 615
    invoke-virtual {v4, v10, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v6, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 616
    invoke-virtual {v4, v7, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 613
    invoke-virtual {v2, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_d

    :cond_15
    :goto_e
    const-string v1, "skippedScopes"

    .line 150
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "pagination"

    .line 151
    invoke-virtual {v3, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/ۨᩴۚ;->ۙ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextActions"

    .line 152
    invoke-virtual {v3, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {v1}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩷(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 221
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    iget-object v1, p0, Ll/ۢܳۚ;->۟:Lbin/mt/json/JSONArray;

    invoke-static {v1}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p0, v0, v1}, Ll/ܳۧۤ;->ۙ(Ll/ۢܳۚ;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ᩸()Lbin/mt/json/JSONObject;
    .locals 11

    .line 62
    invoke-static {}, Ll/ܶ᩵ۚ;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "resource_table"

    const-string v2, "resource_table_variants"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "Resource list view."

    .line 63
    invoke-static {v2, v1}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "view"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 64
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 821
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "string"

    const-string v5, "resource locator. To read a value, call mt_apk_resource_read with data.workspaceId, data.editSessionId, reads[0].locator set to this locator, a concrete reads[0].variant, and all required budget fields. See previewValue for variant selection."

    .line 96
    invoke-static {v4, v5}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "locator"

    .line 822
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Resource table type name."

    .line 96
    invoke-static {v4, v5}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "type"

    .line 823
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Resource entry name."

    .line 96
    invoke-static {v4, v5}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "name"

    .line 824
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "integer"

    const-string v6, "Number of configurations for this resource, including those excluded by the variant filter."

    .line 110
    invoke-static {v5, v6}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "variantCount"

    .line 825
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "item_list"

    const-string v7, "mixed"

    const-string v8, "single_value"

    filled-new-array {v8, v6, v7}, [Ljava/lang/String;

    move-result-object v6

    const-string v7, "Value structure across all configurations, regardless of the variant filter: single_value for scalar values, item_list for compound values, or mixed when both occur."

    .line 826
    invoke-static {v7, v6}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "valueShape"

    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 832
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Preview variant."

    .line 103
    invoke-static {v4, v7}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "variant"

    .line 833
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Preview value kind, or null."

    .line 834
    invoke-static {v7}, Ll/ܶ᩵ۚ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "valueKind"

    invoke-virtual {v6, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Plain value snippet up to 300 chars, or null."

    .line 103
    invoke-static {v4, v7}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "valueSnippet"

    .line 835
    invoke-virtual {v6, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "boolean"

    const-string v9, "Whether the preview value is styled."

    .line 124
    invoke-static {v7, v9}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "styled"

    .line 836
    invoke-virtual {v6, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "Whether the preview snippet was truncated."

    .line 124
    invoke-static {v7, v9}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "truncated"

    .line 837
    invoke-virtual {v6, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "ZIP entry locator for file_path values, or null."

    .line 103
    invoke-static {v4, v7}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "fileLocator"

    .line 838
    invoke-virtual {v6, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Resource locator for reference/attribute values, or null."

    .line 103
    invoke-static {v4, v7}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "targetLocator"

    .line 839
    invoke-virtual {v6, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Scalar preview of the requested variant, or a default-first preview when variant=*. Null if no scalar preview is available; other configurations are not substituted for a concrete variant. For mt_apk_resource_read, use the concrete requested variant; for variant=*, use this preview\'s variant, or try default if the preview is null and choose from the read result\'s variantSets if needed."

    .line 832
    invoke-static {v6, v7}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 828
    invoke-static {v6}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "previewValue"

    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "One resource table entry item."

    .line 821
    invoke-static {v3, v6}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 64
    invoke-virtual {v2, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 790
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Package ID, 0x plus two lowercase hex digits."

    .line 96
    invoke-static {v4, v6}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "packageId"

    .line 791
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Resource package name."

    .line 96
    invoke-static {v4, v6}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "packageName"

    .line 792
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Type ID within this package, 0x plus two lowercase hex digits."

    .line 96
    invoke-static {v4, v6}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "typeId"

    .line 793
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Resource type name, such as string or drawable."

    .line 96
    invoke-static {v4, v6}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "typeName"

    .line 794
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Concrete configuration: default or qualifiers with a leading hyphen."

    .line 96
    invoke-static {v4, v6}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 795
    invoke-virtual {v3, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "entryCount"

    const-string v6, "Actual entry count in this configuration, including session additions; zero for an empty configuration."

    const-string v7, "One resource type configuration; empty configurations are included."

    .line 0
    invoke-static {v3, v5, v6, v4, v7}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 64
    invoke-virtual {v2, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "anyOf"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_resource_list"

    .line 62
    invoke-static {v0, v1, v2}, Ll/ܶ᩵ۚ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

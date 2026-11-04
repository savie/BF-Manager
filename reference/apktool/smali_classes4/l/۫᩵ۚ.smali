.class public final Ll/۫᩵ۚ;
.super Ll/ᩳܳۚ;
.source "CIS3"


# instance fields
.field public ۙ:Lbin/mt/json/JSONObject;

.field public final ۤ:Ll/֫ۨۚ;

.field public ᩷:Lbin/mt/json/JSONObject;


# direct methods
.method public constructor <init>(Ll/֫ۨۚ;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ll/ᩳܳۚ;-><init>()V

    .line 23
    iput-object p1, p0, Ll/۫᩵ۚ;->ۤ:Ll/֫ۨۚ;

    return-void
.end method

.method public static ᩷(Lbin/mt/json/JSONObject;)V
    .locals 5

    const-string v0, "properties"

    .line 88
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "description"

    const-string v2, "Exact variant copied from the resource list: default for no qualifiers, or a value with a leading hyphen such as -zh-rCN. No wildcard or fallback matching."

    const-string v3, "type"

    const-string v4, "string"

    .line 0
    invoke-static {v3, v4, v1, v2}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "variant"

    .line 88
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string v0, "required"

    .line 90
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-virtual {p0, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    return-void
.end method


# virtual methods
.method public final ۙ()Lbin/mt/json/JSONObject;
    .locals 4

    const-string v0, "destructiveHint"

    const/4 v1, 0x1

    const-string v2, "readOnlyHint"

    const/4 v3, 0x0

    .line 0
    invoke-static {v2, v0, v3, v1}, Ll/᩺᩸ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;ZZ)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;
    .locals 10

    .line 58
    iget-object v0, p1, Ll/ۢܳۚ;->ܿ:Lbin/mt/json/JSONObject;

    const-string v1, "failedDeleteIndex"

    .line 59
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    const-string v3, "deleteTarget"

    .line 60
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    .line 61
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    if-eqz v2, :cond_0

    .line 62
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_0
    invoke-virtual {v4, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    if-eqz v3, :cond_1

    .line 63
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_1
    const-string v4, "target"

    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 64
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 65
    iget-object v4, p1, Ll/ۢܳۚ;->۟:Lbin/mt/json/JSONArray;

    invoke-virtual {v4}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbin/mt/json/JSONValue;

    .line 66
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "tool"

    .line 67
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "mt_apk_workspace_open"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const-string v7, "purpose"

    .line 68
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "retry"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 69
    new-instance v6, Lbin/mt/json/JSONObject;

    invoke-direct {v6, v5}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v2, v6}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_2

    :cond_3
    const-string v4, "workspaceId"

    .line 72
    invoke-virtual {v0, v4, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "editSessionId"

    .line 73
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v5, :cond_7

    if-eqz v0, :cond_7

    .line 74
    iget-object v8, p1, Ll/ۢܳۚ;->ܰ:Ljava/lang/String;

    const-string v9, "RESOURCE_NOT_FOUND"

    .line 108
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    const-string v9, "RESOURCE_VARIANT_NOT_FOUND"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    const-string v9, "RESOURCE_TYPE_VARIANT_NOT_FOUND"

    .line 109
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    const-string v9, "RESOURCE_TARGET_AMBIGUOUS"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    :cond_4
    if-eqz v3, :cond_5

    .line 75
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 76
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "kind"

    invoke-virtual {v3, v8, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "type_variant"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/4 v3, 0x1

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    .line 0
    :goto_3
    invoke-static {v4, v5, v7, v0}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-eqz v3, :cond_6

    const-string v3, "resource_table_variants"

    goto :goto_4

    :cond_6
    const-string v3, "resource_table"

    :goto_4
    const-string v4, "view"

    .line 78
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "typeName"

    const-string v4, "*"

    .line 79
    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "variant"

    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "limit"

    const/16 v4, 0xc8

    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "inspect"

    const-string v4, "Inspect the current resource table"

    const-string v5, "mt_apk_resource_list"

    .line 80
    invoke-static {v0, v5, v3, v4}, Ll/ۖܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 83
    :cond_7
    invoke-static {p1, v1, v2}, Ll/ܳۧۤ;->ۙ(Ll/ۢܳۚ;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
    .locals 2

    .line 115
    :try_start_0
    invoke-static {p1}, Ll/ۘ᩵ۚ;->۫(Lbin/mt/json/JSONObject;)Ll/᩺ۨۚ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    :try_start_1
    iget-object v0, p0, Ll/۫᩵ۚ;->ۤ:Ll/֫ۨۚ;

    invoke-virtual {v0, p1}, Ll/֫ۨۚ;->ۙ(Ll/᩺ۨۚ;)Ll/ܶۛۚ;

    move-result-object v0

    .line 118
    sget v1, Ll/᩺۫ۚ;->ۙ:I

    .line 119
    new-instance v1, Ll/֨ܳۚ;

    invoke-static {v0}, Ll/ܳ᩵ۚ;->ۙ(Ll/ܶۛۚ;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/֨ܳۚ;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_1
    .catch Ll/ۢܳۚ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v1

    :catch_0
    move-exception v0

    const/4 v1, -0x1

    .line 121
    :try_start_2
    invoke-static {v0, p1, v1}, Ll/ܳ᩵ۚ;->ۙ(Ll/ۢܳۚ;Ll/᩺ۨۚ;I)V

    .line 122
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    .line 125
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    .line 126
    throw p1
.end method

.method public final ۤ()Lbin/mt/json/JSONObject;
    .locals 8

    .line 52
    iget-object v0, p0, Ll/۫᩵ۚ;->ۙ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"kind\": {\"type\": \"string\", \"enum\": [\"resource\"], \"description\": \"Delete all values of one resource ID.\"},\n  \"locator\": {\"type\": \"string\", \"description\": \"Exact resource locator, such as resource:0x7f010000.\"}\n}\n"

    .line 53
    invoke-static {v0}, Ll/ۜۚܺ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "{\n  \"kind\": {\"type\": \"string\", \"enum\": [\"variant\"], \"description\": \"Delete one resource\'s value at the specified variant.\"},\n  \"locator\": {\"type\": \"string\", \"description\": \"Exact resource locator, such as resource:0x7f010000.\"}\n}\n"

    .line 59
    invoke-static {v1}, Ll/ۜۚܺ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "{\n  \"kind\": {\"type\": \"string\", \"enum\": [\"type_variant\"], \"description\": \"Delete the whole table for one package, type ID and variant, including all its resource values.\"},\n  \"packageId\": {\"type\": \"string\", \"description\": \"Package ID copied from resource_table_variants, as 0x plus two hex digits in 0x01..0xff.\"},\n  \"typeId\": {\"type\": \"string\", \"description\": \"Type ID copied from resource_table_variants, as 0x plus two hex digits in 0x01..0xff. Use the ID because type names may repeat.\"}\n}\n"

    .line 65
    invoke-static {v2}, Ll/ۜۚܺ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 72
    invoke-static {v1}, Ll/۫᩵ۚ;->᩷(Lbin/mt/json/JSONObject;)V

    .line 73
    invoke-static {v2}, Ll/۫᩵ۚ;->᩷(Lbin/mt/json/JSONObject;)V

    const-string v3, "{\n  \"workspaceId\": {\"type\": \"string\", \"description\": \"Workspace ID returned by mt_apk_workspace_open.\"},\n  \"editSessionId\": {\"type\": \"string\", \"description\": \"Non-empty edit session ID returned by mt_apk_session_create.\"}\n}\n"

    .line 74
    invoke-static {v3}, Ll/ۜۚܺ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iput-object v3, p0, Ll/۫᩵ۚ;->ۙ:Lbin/mt/json/JSONObject;

    const-string v4, "properties"

    .line 80
    invoke-virtual {v3, v4}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "description"

    const-string v5, "Batch of 1..200 exact targets. Every target must exist and be unambiguous. Wildcards, duplicates and overlaps are rejected."

    const-string v6, "type"

    const-string v7, "array"

    .line 0
    invoke-static {v6, v7, v4, v5}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 82
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    invoke-virtual {v6, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "anyOf"

    invoke-virtual {v5, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "items"

    invoke-virtual {v4, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "deletes"

    .line 80
    invoke-virtual {v3, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 83
    iget-object v0, p0, Ll/۫᩵ۚ;->ۙ:Lbin/mt/json/JSONObject;

    const-string v2, "required"

    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    .line 84
    iget-object v0, p0, Ll/۫᩵ۚ;->ۙ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Delete APK Resources"

    return-object v0
.end method

.method public final ᩴ()Lbin/mt/json/JSONObject;
    .locals 6

    .line 95
    iget-object v0, p0, Ll/۫᩵ۚ;->᩷:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 23
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace containing the modified session."

    .line 96
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 24
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session to use for further reads, edits and build."

    .line 96
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 25
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "integer"

    const-string v3, "Number of distinct resource IDs that lost their last value in this batch."

    .line 110
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "deletedResourceCount"

    .line 26
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Number of resource values removed, counting each resource ID and variant pair once."

    .line 110
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "deletedValueCount"

    .line 27
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "deletedTypeVariantCount"

    const-string v4, "Number of tables removed by type_variant targets, including empty tables."

    const-string v5, "Committed deletion counts for the entire batch."

    .line 0
    invoke-static {v0, v2, v4, v3, v5}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 29
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "resource, variant or type_variant."

    .line 103
    invoke-static {v1, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "kind"

    .line 30
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Resource locator for resource or variant."

    .line 103
    invoke-static {v1, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "locator"

    .line 31
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Package ID for type_variant."

    .line 103
    invoke-static {v1, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "packageId"

    .line 32
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Type ID for type_variant."

    .line 103
    invoke-static {v1, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "typeId"

    .line 33
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Exact variant for variant or type_variant."

    .line 103
    invoke-static {v1, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "variant"

    .line 34
    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Rejected normalized target; fields not used by its kind are null."

    .line 29
    invoke-static {v1, v3}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 35
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "0-based deletes[] index, or null when no single target caused the error."

    .line 117
    invoke-static {v2, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "failedDeleteIndex"

    .line 36
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "target"

    .line 37
    invoke-static {v1}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "A failed batch leaves the session unchanged."

    .line 35
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 39
    invoke-static {v1}, Ll/ۤܳۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "inspect"

    .line 42
    invoke-static {}, Ll/ܶܿ֫;->ᩴ()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_resource_list"

    .line 41
    invoke-static {v3, v4, v2}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "retry"

    .line 44
    invoke-static {}, Ll/ܶܿ֫;->۫()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "mt_apk_workspace_open"

    .line 43
    invoke-static {v4, v5, v3}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Lbin/mt/json/JSONObject;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v3, v4, v2

    const-string v2, "Success returns no action. A missing or ambiguous target may offer a resource list to inspect the same session."

    .line 39
    invoke-static {v2, v4}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_resource_delete."

    .line 38
    invoke-static {v3, v0, v1, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 95
    iput-object v0, p0, Ll/۫᩵ۚ;->᩷:Lbin/mt/json/JSONObject;

    .line 96
    :cond_0
    iget-object v0, p0, Ll/۫᩵ۚ;->᩷:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const-string v0, "Delete resources.arsc content from an APK edit session: all values of one resource ID, one value at a specific variant, or a whole type\'s variant table. Use mt_apk_resource_list with view=resource_table to find resource locators, or view=resource_table_variants to find packageId, typeId and variant for a whole table. The batch deletes the latest session content without targetVersion. Any failure leaves the session unchanged. Deleting individual resources or values keeps emptied tables; type_variant removes the table itself, including an already empty table. ZIP files and references to deleted resources are unchanged. Use mt_apk_build to generate the edited APK."

    return-object v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_resource_delete"

    return-object v0
.end method

.class public final Ll/ܿ۫ۚ;
.super Ljava/lang/Object;
.source "879H"


# direct methods
.method public static ֫(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;
    .locals 15

    .line 490
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "query"

    .line 491
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 492
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_0

    const-string v1, "literal"

    goto :goto_0

    :cond_0
    if-ne v1, v2, :cond_1d

    const-string v1, "regex"

    :goto_0
    const-string v5, "queryType"

    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "caseSensitive"

    .line 493
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ll/᩵ۚۤ;)Z

    move-result v5

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 494
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v1

    if-ne v1, v4, :cond_1

    const-string v1, "contains"

    goto :goto_1

    :cond_1
    if-ne v1, v2, :cond_1c

    const-string v1, "exact"

    :goto_1
    const-string v5, "matchMode"

    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 495
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v1

    and-int/lit16 v5, v1, -0x2000

    if-nez v5, :cond_1b

    if-eqz v1, :cond_1b

    .line 1062
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    const-string v6, "zip_entries"

    .line 1063
    invoke-static {v1, v4, v5, v6}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const-string v6, "axml"

    .line 1064
    invoke-static {v1, v2, v5, v6}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const-string v6, "resource_table_id"

    const/4 v7, 0x4

    .line 1065
    invoke-static {v1, v7, v5, v6}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const-string v6, "resource_table_name"

    const/16 v8, 0x8

    .line 1066
    invoke-static {v1, v8, v5, v6}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x10

    const-string v9, "resource_table_value"

    .line 1067
    invoke-static {v1, v6, v5, v9}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x400

    const-string v9, "resource_table_file_path"

    .line 1068
    invoke-static {v1, v6, v5, v9}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x20

    const-string v9, "dex_class"

    .line 1069
    invoke-static {v1, v6, v5, v9}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x40

    const-string v9, "dex_field"

    .line 1070
    invoke-static {v1, v6, v5, v9}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x80

    const-string v9, "dex_method"

    .line 1071
    invoke-static {v1, v6, v5, v9}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x100

    const-string v9, "dex_string"

    .line 1072
    invoke-static {v1, v6, v5, v9}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x200

    const-string v9, "smali"

    .line 1073
    invoke-static {v1, v6, v5, v9}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x800

    const-string v10, "native_symbol"

    .line 1074
    invoke-static {v1, v6, v5, v10}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x1000

    const-string v10, "native_string"

    .line 1075
    invoke-static {v1, v6, v5, v10}, Ll/ܿ۫ۚ;->ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const-string v1, "scopes"

    .line 495
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "includeSnippet"

    .line 496
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ll/᩵ۚۤ;)Z

    move-result v5

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "snippetMaxChars"

    .line 497
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v5

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "explicitScopes"

    .line 498
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ll/᩵ۚۤ;)Z

    move-result v5

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "includeMatchOffsets"

    .line 499
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ll/᩵ۚۤ;)Z

    move-result v5

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 974
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v1

    if-nez v1, :cond_2

    move-object v1, v3

    goto :goto_2

    :cond_2
    if-ne v1, v4, :cond_1a

    .line 978
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v1

    :goto_2
    const-string v5, "zipEntryPrefix"

    .line 500
    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 974
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v1

    if-nez v1, :cond_3

    move-object v1, v3

    goto :goto_3

    :cond_3
    if-ne v1, v4, :cond_19

    .line 978
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v1

    :goto_3
    const-string v5, "resourcePrefix"

    .line 501
    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 502
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v1

    if-nez v1, :cond_4

    const-string v5, "none"

    goto :goto_4

    :cond_4
    if-ne v1, v4, :cond_5

    const-string v5, "prefix"

    goto :goto_4

    :cond_5
    if-ne v1, v2, :cond_18

    const-string v5, "descriptorExact"

    :goto_4
    const-string v6, "classPrefixMode"

    .line 503
    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    if-nez v1, :cond_6

    move-object v1, v3

    goto :goto_5

    .line 504
    :cond_6
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v1

    :goto_5
    const-string v5, "classPrefix"

    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 505
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v1

    if-ne v1, v4, :cond_7

    const-string v1, "class"

    goto :goto_6

    :cond_7
    if-ne v1, v2, :cond_17

    const-string v1, "member"

    :goto_6
    const-string v5, "dexStringResultMode"

    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 506
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "scopeIndex"

    .line 507
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "entryIndex"

    .line 508
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "classIndex"

    .line 509
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 510
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v5

    sub-int/2addr v5, v4

    const-string v6, "memberIndex"

    invoke-virtual {v1, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "classCharOffset"

    .line 511
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 512
    invoke-virtual {p0}, Ll/᩵ۚۤ;->available()J

    move-result-wide v5

    const-string v10, "native_strings"

    const-string v11, "target"

    const-wide/16 v12, 0x0

    cmp-long v14, v5, v12

    if-lez v14, :cond_13

    .line 513
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v5

    if-ne v5, v4, :cond_8

    const-string v9, "overview"

    goto :goto_7

    :cond_8
    if-ne v5, v2, :cond_9

    const-string v9, "files"

    goto :goto_7

    :cond_9
    const/4 v2, 0x3

    if-ne v5, v2, :cond_a

    const-string v9, "resource_table_names"

    goto :goto_7

    :cond_a
    if-ne v5, v7, :cond_b

    const-string v9, "resource_table_values"

    goto :goto_7

    :cond_b
    const/4 v2, 0x5

    if-ne v5, v2, :cond_c

    const-string v9, "resource_table_file_paths"

    goto :goto_7

    :cond_c
    const/4 v2, 0x6

    if-ne v5, v2, :cond_d

    const-string v9, "dex_names"

    goto :goto_7

    :cond_d
    const/4 v2, 0x7

    if-ne v5, v2, :cond_e

    const-string v9, "dex_strings"

    goto :goto_7

    :cond_e
    if-ne v5, v8, :cond_f

    const-string v9, "dex_string_members"

    goto :goto_7

    :cond_f
    const/16 v2, 0x9

    if-ne v5, v2, :cond_10

    goto :goto_7

    :cond_10
    const/16 v2, 0xa

    if-ne v5, v2, :cond_11

    const-string v9, "native_symbols"

    goto :goto_7

    :cond_11
    const/16 v2, 0xb

    if-ne v5, v2, :cond_12

    move-object v9, v10

    :goto_7
    invoke-virtual {v0, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    goto :goto_8

    .line 1508
    :cond_12
    invoke-static {v3}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1385
    throw p0

    .line 515
    :cond_13
    :goto_8
    invoke-virtual {p0}, Ll/᩵ۚۤ;->available()J

    move-result-wide v4

    cmp-long v2, v4, v12

    if-lez v2, :cond_16

    .line 516
    invoke-virtual {v0, v11, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    const-string v2, "nativeStringTotalCount"

    .line 519
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 520
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ll/᩵ۚۤ;)Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-static {p0}, Ll/ܿ۫ۚ;->ܽ(Ll/᩵ۚۤ;)J

    move-result-wide v3

    goto :goto_9

    :cond_14
    const-wide/16 v3, -0x1

    :goto_9
    const-string p0, "nativeStringScanOffset"

    invoke-virtual {v2, p0, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    goto :goto_a

    .line 1508
    :cond_15
    invoke-static {v3}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 517
    throw p0

    .line 522
    :cond_16
    :goto_a
    new-instance p0, Ll/ܰ۫ۚ;

    invoke-direct {p0, v0, v1}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object p0

    .line 1508
    :cond_17
    invoke-static {v3}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1325
    throw p0

    .line 1508
    :cond_18
    invoke-static {v3}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1301
    throw p0

    .line 1508
    :cond_19
    invoke-static {v3}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 980
    throw p0

    .line 1508
    :cond_1a
    invoke-static {v3}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 980
    throw p0

    .line 1508
    :cond_1b
    invoke-static {v3}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1060
    throw p0

    .line 1508
    :cond_1c
    invoke-static {v3}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1273
    throw p0

    .line 1508
    :cond_1d
    invoke-static {v3}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1249
    throw p0
.end method

.method public static ۙ(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x14

    if-ne p0, v0, :cond_0

    const-string p0, "list_entries"

    return-object p0

    :cond_0
    const/16 v0, 0x15

    if-ne p0, v0, :cond_1

    const-string p0, "dex_list_classes"

    return-object p0

    :cond_1
    const/16 v0, 0x16

    if-ne p0, v0, :cond_2

    const-string p0, "resource_list"

    return-object p0

    :cond_2
    const/16 v0, 0x12

    if-ne p0, v0, :cond_3

    const-string p0, "installed_apps"

    return-object p0

    :cond_3
    const/16 v0, 0xc

    if-ne p0, v0, :cond_4

    const-string p0, "available_apks"

    return-object p0

    :cond_4
    const/4 v0, 0x6

    if-ne p0, v0, :cond_5

    const-string p0, "outline_class"

    return-object p0

    :cond_5
    const/16 v0, 0xe

    if-ne p0, v0, :cond_6

    const-string p0, "read"

    return-object p0

    :cond_6
    const/16 v0, 0x11

    if-ne p0, v0, :cond_7

    const-string p0, "java_pseudocode"

    return-object p0

    :cond_7
    const/16 v0, 0x8

    if-ne p0, v0, :cond_8

    const-string p0, "search"

    return-object p0

    :cond_8
    const/16 v0, 0x9

    if-eq p0, v0, :cond_d

    const/16 v0, 0xa

    if-ne p0, v0, :cond_9

    goto :goto_0

    :cond_9
    const/16 v0, 0xd

    if-ne p0, v0, :cond_a

    const-string p0, "resource_xref"

    return-object p0

    :cond_a
    const/16 v0, 0xf

    if-ne p0, v0, :cond_b

    const-string p0, "native_items"

    return-object p0

    :cond_b
    const/16 v0, 0x10

    if-ne p0, v0, :cond_c

    const-string p0, "native_xref"

    return-object p0

    :cond_c
    const/4 p0, 0x0

    .line 1508
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1153
    throw p0

    :cond_d
    :goto_0
    const-string p0, "xref"

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    const-string v3, "list_entries"

    .line 1092
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/16 v4, 0xc

    const/16 v5, 0x12

    const/16 v6, 0x16

    const/16 v7, 0x15

    const/16 v8, 0x14

    const/4 v9, 0x6

    if-eqz v3, :cond_0

    const/16 v3, 0x14

    const/16 v10, 0x14

    goto/16 :goto_0

    :cond_0
    const-string v3, "dex_list_classes"

    .line 1094
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x15

    const/16 v10, 0x15

    goto/16 :goto_0

    :cond_1
    const-string v3, "resource_list"

    .line 1096
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x16

    const/16 v10, 0x16

    goto/16 :goto_0

    :cond_2
    const-string v3, "installed_apps"

    .line 1098
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x12

    const/16 v10, 0x12

    goto/16 :goto_0

    :cond_3
    const-string v3, "available_apks"

    .line 1100
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0xc

    const/16 v10, 0xc

    goto :goto_0

    :cond_4
    const-string v3, "outline_class"

    .line 1102
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/4 v3, 0x6

    const/4 v10, 0x6

    goto :goto_0

    :cond_5
    const-string v3, "read"

    .line 1104
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0xe

    const/16 v10, 0xe

    goto :goto_0

    :cond_6
    const-string v3, "java_pseudocode"

    .line 1106
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x11

    const/16 v10, 0x11

    goto :goto_0

    :cond_7
    const-string v3, "search"

    .line 1108
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x8

    const/16 v10, 0x8

    goto :goto_0

    :cond_8
    const-string v3, "xref"

    .line 1110
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    const/16 v3, 0xa

    const/16 v10, 0xa

    goto :goto_0

    :cond_9
    const-string v3, "resource_xref"

    .line 1112
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/16 v3, 0xd

    const/16 v10, 0xd

    goto :goto_0

    :cond_a
    const-string v3, "native_items"

    .line 1114
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    const/16 v3, 0xf

    const/16 v10, 0xf

    goto :goto_0

    :cond_b
    const-string v3, "native_xref"

    .line 1116
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_59

    const/16 v3, 0x10

    const/16 v10, 0x10

    .line 129
    :goto_0
    new-instance v3, Ll/ۛۚۤ;

    const/16 v11, 0x80

    invoke-direct {v3, v11}, Ll/ۛۚۤ;-><init>(I)V

    const/4 v11, 0x3

    .line 130
    invoke-virtual {v3, v11}, Ll/ۛۚۤ;->writeByte(I)V

    .line 131
    invoke-virtual {v3, v10}, Ll/ۛۚۤ;->writeByte(I)V

    const-string v11, "recommendedLimit"

    const/4 v12, -0x1

    .line 132
    invoke-virtual {v1, v11, v12}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v11

    invoke-static {v3, v11}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v11, "limitMax"

    .line 133
    invoke-virtual {v1, v11, v12}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v11

    invoke-static {v3, v11}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v11, "prefix"

    const-string v13, "offset"

    const-string v14, ""

    if-eq v10, v8, :cond_57

    if-ne v10, v7, :cond_c

    goto/16 :goto_15

    :cond_c
    const-string v7, "variant"

    const-string v8, "resource_table"

    if-ne v10, v6, :cond_f

    const-string v0, "view"

    .line 313
    invoke-virtual {v1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1160
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    const/4 v0, 0x1

    goto :goto_1

    :cond_d
    const-string v4, "resource_table_variants"

    .line 1162
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    const/4 v0, 0x2

    .line 313
    :goto_1
    invoke-virtual {v3, v0}, Ll/ۛۚۤ;->writeByte(I)V

    const-string v0, "typeName"

    .line 314
    invoke-virtual {v1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    .line 315
    invoke-virtual {v1, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    .line 316
    invoke-virtual {v2, v13, v12}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    goto/16 :goto_17

    .line 1165
    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported list view: "

    .line 0
    invoke-static {v2, v0}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1165
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    const-string v6, "query"

    if-ne v10, v5, :cond_10

    .line 139
    invoke-virtual {v1, v6, v14}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v0, "appType"

    const-string v4, "all"

    .line 140
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v0, "afterPackage"

    .line 141
    invoke-virtual {v2, v0, v14}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    goto/16 :goto_17

    :cond_10
    if-ne v10, v4, :cond_11

    .line 330
    invoke-virtual {v1, v11, v14}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    .line 331
    invoke-virtual {v2, v13, v12}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    goto/16 :goto_16

    :cond_11
    const-string v4, "locator"

    const/4 v5, 0x0

    if-ne v10, v9, :cond_12

    .line 347
    invoke-virtual {v1, v4, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v0, "memberOffset"

    .line 348
    invoke-virtual {v2, v0, v12}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    goto/16 :goto_17

    :cond_12
    const-string v9, "lineCharOffset"

    const-string v12, "lineOffset"

    const-string v15, "maxChars"

    const-string v5, "target"

    const/16 v0, 0xe

    if-ne v10, v0, :cond_19

    const/4 v0, 0x0

    .line 364
    invoke-virtual {v1, v5, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 365
    invoke-static {v4}, Ll/ۘ᩵ۚ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ۫ۚ;->᩸(Ljava/lang/String;)I

    move-result v0

    const-string v5, "format"

    const-string v6, "text"

    .line 366
    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 814
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    const/4 v5, 0x1

    goto :goto_2

    :cond_13
    const-string v6, "hex"

    .line 816
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_18

    const/4 v5, 0x2

    :goto_2
    const/4 v6, 0x2

    if-ne v5, v6, :cond_15

    const/4 v8, 0x1

    if-ne v0, v8, :cond_14

    goto :goto_3

    .line 368
    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Byte read cursors are valid only for zip_entry targets"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 370
    :cond_15
    :goto_3
    invoke-virtual {v3, v0}, Ll/ۛۚۤ;->writeByte(I)V

    .line 371
    invoke-static {v3, v0, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;ILjava/lang/String;)V

    .line 372
    invoke-virtual {v3, v5}, Ll/ۛۚۤ;->writeByte(I)V

    if-ne v5, v6, :cond_16

    const-string v0, "hexOffset"

    const/4 v1, -0x1

    .line 374
    invoke-virtual {v2, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    goto/16 :goto_17

    :cond_16
    const/4 v4, 0x6

    const/4 v5, -0x1

    if-ne v0, v4, :cond_17

    const/4 v0, 0x0

    .line 376
    invoke-virtual {v1, v7, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v0, "maxValueChars"

    .line 377
    invoke-virtual {v1, v0, v5}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "maxValueXmlChars"

    const v4, 0x8000

    .line 379
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "maxItemsPerValue"

    .line 380
    invoke-virtual {v1, v0, v5}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "resolveDepth"

    .line 381
    invoke-virtual {v1, v0, v5}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "valueOffset"

    .line 382
    invoke-virtual {v2, v0, v5}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    goto/16 :goto_17

    .line 384
    :cond_17
    invoke-virtual {v1, v15, v5}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 385
    invoke-virtual {v2, v12, v5}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 386
    invoke-virtual {v2, v9, v5}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    goto/16 :goto_17

    .line 819
    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported read format: "

    .line 0
    invoke-static {v1, v5}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 819
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    const/16 v0, 0x11

    if-ne v10, v0, :cond_1a

    const/4 v0, 0x0

    .line 424
    invoke-virtual {v1, v5, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v4, "style"

    .line 425
    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v4, "textHash"

    .line 426
    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const/4 v0, -0x1

    .line 427
    invoke-virtual {v1, v15, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v3, v1}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 428
    invoke-virtual {v2, v12, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v3, v1}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 429
    invoke-virtual {v2, v9, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    goto/16 :goto_17

    :cond_1a
    const-string v0, "axml"

    const-string v7, "scopes"

    const-string v9, "exact"

    const-wide/16 v16, 0x0

    const-string v12, "memberIndex"

    const-string v15, "classIndex"

    move-object/from16 v18, v14

    const/16 v14, 0x8

    if-ne v10, v14, :cond_43

    const/4 v14, 0x0

    .line 445
    invoke-virtual {v1, v6, v14}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v4, "queryType"

    .line 446
    invoke-virtual {v1, v4, v14}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "literal"

    .line 1232
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    const/4 v4, 0x1

    goto :goto_4

    :cond_1b
    const-string v6, "regex"

    .line 1234
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_42

    const/4 v4, 0x2

    .line 446
    :goto_4
    invoke-virtual {v3, v4}, Ll/ۛۚۤ;->writeByte(I)V

    const-string v4, "caseSensitive"

    const/4 v6, 0x0

    .line 447
    invoke-virtual {v1, v4, v6}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 987
    invoke-virtual {v3, v4}, Ll/ۛۚۤ;->writeByte(I)V

    const-string v4, "matchMode"

    const/4 v6, 0x0

    .line 448
    invoke-virtual {v1, v4, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "contains"

    .line 1256
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1c

    const/4 v4, 0x1

    goto :goto_5

    .line 1258
    :cond_1c
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_41

    const/4 v4, 0x2

    .line 448
    :goto_5
    invoke-virtual {v3, v4}, Ll/ۛۚۤ;->writeByte(I)V

    .line 449
    invoke-virtual {v1, v7}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 1049
    :goto_6
    invoke-virtual {v4}, Lbin/mt/json/JSONArray;->size()I

    move-result v8

    const-string v9, "smali"

    if-ge v6, v8, :cond_2a

    .line 1050
    invoke-virtual {v4, v6}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v8

    const-string v13, "zip_entries"

    .line 1474
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1d

    const/4 v8, 0x1

    goto/16 :goto_7

    .line 1476
    :cond_1d
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1e

    const/4 v8, 0x2

    goto/16 :goto_7

    :cond_1e
    const-string v13, "resource_table_id"

    .line 1478
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1f

    const/4 v8, 0x4

    goto/16 :goto_7

    :cond_1f
    const-string v13, "resource_table_name"

    .line 1480
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_20

    const/16 v8, 0x8

    goto :goto_7

    :cond_20
    const-string v13, "resource_table_value"

    .line 1482
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_21

    const/16 v8, 0x10

    goto :goto_7

    :cond_21
    const-string v13, "resource_table_file_path"

    .line 1484
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_22

    const/16 v8, 0x400

    goto :goto_7

    :cond_22
    const-string v13, "dex_class"

    .line 1486
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_23

    const/16 v8, 0x20

    goto :goto_7

    :cond_23
    const-string v13, "dex_field"

    .line 1488
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_24

    const/16 v8, 0x40

    goto :goto_7

    :cond_24
    const-string v13, "dex_method"

    .line 1490
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_25

    const/16 v8, 0x80

    goto :goto_7

    :cond_25
    const-string v13, "dex_string"

    .line 1492
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_26

    const/16 v8, 0x100

    goto :goto_7

    .line 1494
    :cond_26
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_27

    const/16 v8, 0x200

    goto :goto_7

    :cond_27
    const-string v9, "native_symbol"

    .line 1496
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_28

    const/16 v8, 0x800

    goto :goto_7

    :cond_28
    const-string v9, "native_string"

    .line 1498
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_29

    const/16 v8, 0x1000

    :goto_7
    or-int/2addr v7, v8

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_6

    .line 1501
    :cond_29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported scope: "

    .line 0
    invoke-static {v1, v8}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1501
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 449
    :cond_2a
    invoke-static {v3, v7}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "includeSnippet"

    const/4 v4, 0x0

    .line 450
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 987
    invoke-virtual {v3, v0}, Ll/ۛۚۤ;->writeByte(I)V

    const-string v0, "snippetMaxChars"

    const/4 v6, -0x1

    .line 451
    invoke-virtual {v1, v0, v6}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "explicitScopes"

    .line 452
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 987
    invoke-virtual {v3, v0}, Ll/ۛۚۤ;->writeByte(I)V

    const-string v0, "includeMatchOffsets"

    .line 453
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 987
    invoke-virtual {v3, v0}, Ll/ۛۚۤ;->writeByte(I)V

    const-string v0, "zipEntryPrefix"

    const/4 v6, 0x0

    .line 454
    invoke-virtual {v1, v0, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2b

    .line 962
    invoke-virtual {v3, v4}, Ll/ۛۚۤ;->writeByte(I)V

    goto :goto_8

    :cond_2b
    const/4 v7, 0x1

    .line 964
    invoke-virtual {v3, v7}, Ll/ۛۚۤ;->writeByte(I)V

    .line 965
    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    :goto_8
    const/4 v0, 0x1

    const-string v7, "resourcePrefix"

    .line 455
    invoke-virtual {v1, v7, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_2c

    .line 962
    invoke-virtual {v3, v4}, Ll/ۛۚۤ;->writeByte(I)V

    goto :goto_9

    .line 964
    :cond_2c
    invoke-virtual {v3, v0}, Ll/ۛۚۤ;->writeByte(I)V

    .line 965
    invoke-static {v3, v7}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    :goto_9
    const-string v0, "classPrefixMode"

    .line 456
    invoke-virtual {v1, v0, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "none"

    .line 1280
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2d

    const/4 v0, 0x0

    goto :goto_a

    .line 1282
    :cond_2d
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2e

    const/4 v0, 0x1

    goto :goto_a

    :cond_2e
    const-string v4, "descriptorExact"

    .line 1284
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_40

    const/4 v0, 0x2

    .line 457
    :goto_a
    invoke-virtual {v3, v0}, Ll/ۛۚۤ;->writeByte(I)V

    if-eqz v0, :cond_2f

    const-string v0, "classPrefix"

    const/4 v4, 0x0

    .line 459
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    goto :goto_b

    :cond_2f
    const/4 v4, 0x0

    :goto_b
    const-string v0, "dexStringResultMode"

    .line 461
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "class"

    .line 1308
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_30

    const/4 v0, 0x1

    goto :goto_c

    :cond_30
    const-string v4, "member"

    .line 1310
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3f

    const/4 v0, 0x2

    .line 461
    :goto_c
    invoke-virtual {v3, v0}, Ll/ۛۚۤ;->writeByte(I)V

    const-string v0, "scopeIndex"

    const/4 v4, -0x1

    .line 462
    invoke-virtual {v2, v0, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "entryIndex"

    .line 463
    invoke-virtual {v2, v0, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 464
    invoke-virtual {v2, v15, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const/4 v0, -0x2

    .line 465
    invoke-virtual {v2, v12, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "classCharOffset"

    .line 466
    invoke-virtual {v2, v0, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const/4 v0, 0x0

    .line 467
    invoke-virtual {v1, v5, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "native_strings"

    if-eqz v0, :cond_3c

    .line 468
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3c

    const-string v4, "overview"

    .line 1332
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_31

    const/4 v4, 0x1

    goto/16 :goto_d

    :cond_31
    const-string v4, "files"

    .line 1334
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_32

    const/4 v4, 0x2

    goto :goto_d

    :cond_32
    const-string v4, "resource_table_names"

    .line 1336
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_33

    const/4 v4, 0x3

    goto :goto_d

    :cond_33
    const-string v4, "resource_table_values"

    .line 1338
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_34

    const/4 v4, 0x4

    goto :goto_d

    :cond_34
    const-string v4, "resource_table_file_paths"

    .line 1340
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_35

    const/4 v4, 0x5

    goto :goto_d

    :cond_35
    const-string v4, "dex_names"

    .line 1342
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_36

    const/4 v4, 0x6

    goto :goto_d

    :cond_36
    const-string v4, "dex_strings"

    .line 1344
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_37

    const/4 v4, 0x7

    goto :goto_d

    :cond_37
    const-string v4, "dex_string_members"

    .line 1346
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_38

    const/16 v4, 0x8

    goto :goto_d

    .line 1348
    :cond_38
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_39

    const/16 v4, 0x9

    goto :goto_d

    :cond_39
    const-string v4, "native_symbols"

    .line 1350
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3a

    const/16 v4, 0xa

    goto :goto_d

    .line 1352
    :cond_3a
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3b

    const/16 v4, 0xb

    .line 469
    :goto_d
    invoke-virtual {v3, v4}, Ll/ۛۚۤ;->writeByte(I)V

    goto :goto_e

    .line 1355
    :cond_3b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported search target: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3c
    :goto_e
    const-string v4, "nativeStringTotalCount"

    const/4 v5, -0x1

    .line 471
    invoke-virtual {v2, v4, v5}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    if-ltz v4, :cond_58

    .line 473
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3e

    .line 477
    invoke-static {v3, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "nativeStringScanOffset"

    const-wide/16 v4, -0x1

    .line 478
    invoke-virtual {v2, v0, v4, v5}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v2, v0, v16

    if-ltz v2, :cond_3d

    const/4 v4, 0x1

    goto :goto_f

    :cond_3d
    const/4 v4, 0x0

    .line 987
    :goto_f
    invoke-virtual {v3, v4}, Ll/ۛۚۤ;->writeByte(I)V

    if-ltz v2, :cond_58

    .line 481
    invoke-static {v3, v0, v1}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;J)V

    goto/16 :goto_17

    .line 474
    :cond_3e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Native string scan state requires native_strings target"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1313
    :cond_3f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported dex string result mode: "

    .line 0
    invoke-static {v2, v0}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1313
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1287
    :cond_40
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported classPrefixMode: "

    .line 0
    invoke-static {v2, v0}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1287
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1261
    :cond_41
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported matchMode: "

    .line 0
    invoke-static {v1, v4}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1261
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1237
    :cond_42
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported queryType: "

    .line 0
    invoke-static {v1, v4}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1237
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_43
    const/16 v5, 0xa

    if-ne v10, v5, :cond_4a

    const-string v0, "targetLocator"

    const/4 v4, 0x0

    .line 529
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 530
    invoke-static {v0}, Ll/ۘ᩵ۚ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ܿ۫ۚ;->᩸(Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x4

    if-eq v4, v5, :cond_45

    const/4 v5, 0x5

    if-eq v4, v5, :cond_45

    const/4 v5, 0x3

    if-ne v4, v5, :cond_44

    goto :goto_10

    .line 532
    :cond_44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Xref cursors are valid only for dex targets"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 534
    :cond_45
    :goto_10
    invoke-virtual {v3, v4}, Ll/ۛۚۤ;->writeByte(I)V

    .line 535
    invoke-static {v3, v4, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;ILjava/lang/String;)V

    const-string v0, "methodResolution"

    const/4 v4, 0x0

    .line 536
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1392
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_46

    const/4 v0, 0x1

    goto :goto_11

    :cond_46
    const-string v1, "slot"

    .line 1394
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_47

    const/4 v0, 0x2

    goto :goto_11

    :cond_47
    const-string v1, "dispatch"

    .line 1396
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_48

    const/4 v0, 0x3

    goto :goto_11

    :cond_48
    const-string v1, "not_applicable"

    .line 1398
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_49

    const/4 v0, 0x4

    .line 536
    :goto_11
    invoke-virtual {v3, v0}, Ll/ۛۚۤ;->writeByte(I)V

    const/4 v0, -0x1

    .line 537
    invoke-virtual {v2, v15, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v3, v1}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 538
    invoke-virtual {v2, v12, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v3, v1}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v1, "instructionIndex"

    .line 539
    invoke-virtual {v2, v1, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    goto/16 :goto_17

    .line 1401
    :cond_49
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported xref methodResolution: "

    .line 0
    invoke-static {v2, v0}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1401
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4a
    const/16 v5, 0xd

    if-ne v10, v5, :cond_50

    const-string v4, "targetLocator"

    const/4 v5, 0x0

    .line 580
    invoke-virtual {v1, v4, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 581
    invoke-static {v4}, Ll/ۘ᩵ۚ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ܿ۫ۚ;->᩸(Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x6

    if-ne v5, v6, :cond_4f

    .line 585
    invoke-static {v3, v5, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;ILjava/lang/String;)V

    .line 586
    invoke-virtual {v1, v7}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 587
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    invoke-static {v3, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const/4 v4, 0x0

    .line 588
    :goto_12
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->size()I

    move-result v5

    if-ge v4, v5, :cond_4e

    .line 589
    invoke-virtual {v1, v4}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v5

    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "dex"

    .line 1424
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4b

    const/4 v5, 0x1

    goto :goto_13

    .line 1426
    :cond_4b
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4c

    const/4 v5, 0x2

    goto :goto_13

    .line 1428
    :cond_4c
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4d

    const/4 v5, 0x3

    .line 589
    :goto_13
    invoke-virtual {v3, v5}, Ll/ۛۚۤ;->writeByte(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_12

    .line 1431
    :cond_4d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported resource xref scope: "

    .line 0
    invoke-static {v1, v5}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1431
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4e
    const-string v0, "scopeIndex"

    const/4 v1, -0x1

    .line 591
    invoke-virtual {v2, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "entryIndex"

    .line 592
    invoke-virtual {v2, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 593
    invoke-virtual {v2, v15, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 594
    invoke-virtual {v2, v12, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "instructionIndex"

    .line 595
    invoke-virtual {v2, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "innerIndex"

    .line 596
    invoke-virtual {v2, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    goto/16 :goto_17

    .line 583
    :cond_4f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Resource xref cursors are valid only for resource targets"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_50
    const/16 v0, 0xf

    if-ne v10, v0, :cond_54

    const/4 v0, 0x0

    .line 629
    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v4, "itemKind"

    .line 630
    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x0

    :goto_14
    const/16 v5, 0x9

    if-ge v0, v5, :cond_53

    .line 1453
    sget-object v5, Ll/ۤ۟ۧ;->ۙ:[Ljava/lang/String;

    aget-object v5, v5, v0

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_52

    add-int/lit8 v0, v0, 0x1

    .line 630
    invoke-virtual {v3, v0}, Ll/ۛۚۤ;->writeByte(I)V

    const-string v0, "namePrefix"

    const/4 v5, 0x0

    .line 631
    invoke-virtual {v1, v0, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v0, "demangle"

    const/4 v4, 0x0

    .line 632
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 987
    invoke-virtual {v3, v0}, Ll/ۛۚۤ;->writeByte(I)V

    const-string v0, "entrySize"

    const-wide/16 v4, -0x1

    .line 633
    invoke-virtual {v1, v0, v4, v5}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    invoke-static {v3, v6, v7}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;J)V

    const-string v0, "entryCrc"

    .line 634
    invoke-virtual {v1, v0, v4, v5}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long v0, v4, v16

    if-ltz v0, :cond_51

    const-wide v6, 0xffffffffL

    cmp-long v0, v4, v6

    if-gtz v0, :cond_51

    .line 638
    invoke-static {v3, v4, v5}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;J)V

    const-string v0, "totalCount"

    const/4 v4, -0x1

    .line 639
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 640
    invoke-virtual {v2, v13, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    goto/16 :goto_17

    .line 636
    :cond_51
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid native entry CRC"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_52
    const/4 v5, 0x0

    add-int/lit8 v0, v0, 0x1

    goto :goto_14

    .line 1457
    :cond_53
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported native itemKind: "

    .line 0
    invoke-static {v1, v4}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1457
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_54
    const/16 v0, 0x10

    if-ne v10, v0, :cond_56

    move-object/from16 v0, v18

    .line 669
    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v4, "addressKind"

    .line 670
    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v4, "address"

    const-wide/16 v5, -0x1

    .line 671
    invoke-virtual {v1, v4, v5, v6}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;J)V

    const-string v4, "instructionMode"

    .line 672
    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v4, "scanKind"

    .line 673
    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ۧ᩻ܺ;->ۤ(Ljava/lang/String;)V

    invoke-static {v3, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v4, "resolvedInstructionMode"

    .line 674
    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v4, "targetVirtualAddress"

    const-wide/16 v5, -0x1

    .line 675
    invoke-virtual {v1, v4, v5, v6}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;J)V

    const-string v4, "arch"

    .line 676
    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const-string v0, "bits"

    const/4 v4, -0x1

    .line 677
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "referenceKindMask"

    .line 680
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 679
    invoke-static {v0}, Ll/ۡ۟ۧ;->᩷(I)V

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "maxScanBytes"

    .line 681
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "entrySize"

    const-wide/16 v4, -0x1

    .line 682
    invoke-virtual {v1, v0, v4, v5}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    const-string v0, "entryCrc"

    .line 683
    invoke-virtual {v1, v0, v4, v5}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v4, v0, v16

    if-ltz v4, :cond_55

    const-wide v4, 0xffffffffL

    cmp-long v8, v0, v4

    if-gtz v8, :cond_55

    .line 687
    invoke-static {v3, v6, v7}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;J)V

    .line 688
    invoke-static {v3, v0, v1}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;J)V

    const-string v0, "phaseIndex"

    const/4 v1, -0x1

    .line 689
    invoke-virtual {v2, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "rangeIndex"

    .line 690
    invoke-virtual {v2, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const-string v0, "byteOffsetInRange"

    const-wide/16 v4, -0x1

    .line 691
    invoke-virtual {v2, v0, v4, v5}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;J)V

    const-string v0, "relocationIndex"

    .line 692
    invoke-virtual {v2, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    goto :goto_17

    .line 685
    :cond_55
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid native entry CRC"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 161
    :cond_56
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported cursor type: "

    move-object/from16 v2, p0

    .line 0
    invoke-static {v1, v2}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 161
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_57
    :goto_15
    move-object v0, v14

    .line 330
    invoke-virtual {v1, v11, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    const/4 v0, -0x1

    .line 331
    invoke-virtual {v2, v13, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    :goto_16
    invoke-static {v3, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 163
    :cond_58
    :goto_17
    invoke-virtual {v3}, Ll/ۛۚۤ;->size()I

    move-result v15

    .line 165
    invoke-virtual {v3}, Ll/ۛۚۤ;->᩷()[B

    move-result-object v14

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move/from16 v13, p3

    .line 164
    invoke-static/range {v10 .. v15}, Ll/ܿ۫ۚ;->ۙ(ILjava/lang/String;Ljava/lang/String;I[BI)[B

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 166
    invoke-virtual {v3, v0, v2, v1}, Ll/ۛۚۤ;->write([BII)V

    .line 167
    invoke-virtual {v3}, Ll/ۛۚۤ;->᩷()[B

    move-result-object v0

    invoke-virtual {v3}, Ll/ۛۚۤ;->size()I

    move-result v1

    const/16 v3, 0xb

    invoke-static {v0, v2, v1, v3}, Landroid/util/Base64;->encodeToString([BIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_59
    move-object v2, v0

    .line 1119
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported cursor type: "

    .line 0
    invoke-static {v1, v2}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1119
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(Ll/᩵ۚۤ;I)Ljava/lang/String;
    .locals 13

    const/4 v0, 0x6

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq p1, v6, :cond_6

    if-ne p1, v4, :cond_0

    goto :goto_0

    :cond_0
    if-ne p1, v3, :cond_1

    .line 765
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v7, "dex_class"

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    if-ne p1, v2, :cond_2

    .line 768
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    .line 769
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v0, "dex_method"

    const/4 v1, 0x0

    .line 768
    invoke-static/range {v0 .. v5}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    if-ne p1, v1, :cond_3

    .line 771
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    .line 772
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const-string v0, "dex_field"

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 771
    invoke-static/range {v0 .. v5}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    if-ne p1, v0, :cond_5

    .line 1017
    invoke-virtual {p0}, Ll/᩵ۚۤ;->available()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    cmp-long p1, v0, v2

    if-ltz p1, :cond_4

    .line 1020
    invoke-virtual {p0}, Ll/᩵ۚۤ;->readInt()I

    move-result p0

    .line 1041
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    new-array v0, v6, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "0x%08x"

    invoke-static {p1, p0, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "resource"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 774
    invoke-static/range {v1 .. v6}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1508
    :cond_4
    invoke-static {v5}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1018
    throw p0

    .line 1508
    :cond_5
    invoke-static {v5}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 777
    throw p0

    :cond_6
    :goto_0
    if-ne p1, v6, :cond_7

    const-string p1, "zip_entry"

    :goto_1
    move-object v0, p1

    goto :goto_2

    :cond_7
    if-ne p1, v4, :cond_8

    const-string p1, "axml"

    goto :goto_1

    :cond_8
    if-ne p1, v3, :cond_9

    const-string p1, "dex_class"

    goto :goto_1

    :cond_9
    if-ne p1, v2, :cond_a

    const-string p1, "dex_method"

    goto :goto_1

    :cond_a
    if-ne p1, v1, :cond_b

    const-string p1, "dex_field"

    goto :goto_1

    :cond_b
    if-ne p1, v0, :cond_c

    const-string p1, "resource"

    goto :goto_1

    .line 762
    :goto_2
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1508
    :cond_c
    invoke-static {v5}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1217
    throw p0
.end method

.method public static ۙ(Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 1516
    :cond_0
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    .line 1517
    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "<cursor>"

    const-string v3, "nextCursor"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid cursor"

    .line 1515
    invoke-static {v2, v3, p0, v0, v1}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/ܰ۫ۚ;
    .locals 11

    const/4 v0, 0x0

    if-eqz p0, :cond_14

    .line 220
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const/16 v1, 0xb

    .line 224
    :try_start_0
    invoke-static {p0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    .line 225
    array-length v2, v1

    const/4 v3, 0x2

    if-le v2, v3, :cond_13

    .line 228
    array-length v2, v1

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v8

    .line 229
    new-instance v2, Ll/᩵ۚۤ;

    invoke-direct {v2, v8}, Ll/᩵ۚۤ;-><init>([B)V

    .line 230
    invoke-static {v2}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v4

    const/4 v5, 0x3

    if-ne v4, v5, :cond_12

    .line 233
    invoke-static {v2}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v10

    .line 839
    array-length v9, v8

    move v4, v10

    move-object v5, p2

    move-object v6, p3

    move v7, p1

    invoke-static/range {v4 .. v9}, Ll/ܿ۫ۚ;->ۙ(ILjava/lang/String;Ljava/lang/String;I[BI)[B

    move-result-object p1

    .line 235
    array-length p2, v1

    sub-int/2addr p2, v3

    aget-byte p2, v1, p2

    const/4 p3, 0x0

    aget-byte p3, p1, p3

    if-ne p2, p3, :cond_11

    array-length p2, v1

    const/4 p3, 0x1

    sub-int/2addr p2, p3

    aget-byte p2, v1, p2

    aget-byte p1, p1, p3

    if-ne p2, p1, :cond_11

    .line 238
    invoke-static {v2}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v7

    .line 239
    invoke-static {v2}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v8
    :try_end_0
    .catch Ll/ۢܳۚ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-lt v7, p3, :cond_10

    if-lt v8, p3, :cond_10

    if-gt v7, v8, :cond_10

    const/16 p1, 0x14

    const-string p2, "offset"

    const-string p3, "prefix"

    if-eq v10, p1, :cond_e

    const/16 p1, 0x15

    if-ne v10, p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 p1, 0x16

    if-ne v10, p1, :cond_2

    .line 247
    :try_start_1
    invoke-static {v2}, Ll/ܿ۫ۚ;->۫(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;

    move-result-object p1

    goto/16 :goto_2

    :cond_2
    const/16 p1, 0x12

    if-ne v10, p1, :cond_3

    .line 250
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "query"

    invoke-static {v2}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "appType"

    invoke-static {v2}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 251
    new-instance p2, Ll/ܰ۫ۚ;

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v1, "afterPackage"

    invoke-static {v2}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    move-object p1, p2

    goto/16 :goto_2

    :cond_3
    const/16 p1, 0xc

    if-ne v10, p1, :cond_4

    .line 338
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {v2}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, p3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 339
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p3

    invoke-static {v2}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v1

    invoke-virtual {p3, p2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 340
    new-instance p3, Ll/ܰ۫ۚ;

    invoke-direct {p3, p1, p2}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    goto/16 :goto_1

    :cond_4
    const/4 p1, 0x6

    if-ne v10, p1, :cond_5

    .line 255
    invoke-static {v2}, Ll/ܿ۫ۚ;->᩸(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;

    move-result-object p1

    goto/16 :goto_2

    :cond_5
    const/16 p1, 0xe

    if-ne v10, p1, :cond_6

    .line 257
    invoke-static {v2}, Ll/ܿ۫ۚ;->ܳ(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;

    move-result-object p1

    goto :goto_2

    :cond_6
    const/16 p1, 0x11

    if-ne v10, p1, :cond_7

    .line 259
    invoke-static {v2}, Ll/ܿ۫ۚ;->ᩴ(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;

    move-result-object p1

    goto :goto_2

    :cond_7
    const/16 p1, 0x8

    if-ne v10, p1, :cond_8

    .line 261
    invoke-static {v2}, Ll/ܿ۫ۚ;->֫(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;

    move-result-object p1

    goto :goto_2

    :cond_8
    const/16 p1, 0x9

    if-ne v10, p1, :cond_9

    .line 263
    invoke-static {v2}, Ll/ܿ۫ۚ;->ܶ(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;

    move-result-object p1

    goto :goto_2

    :cond_9
    const/16 p1, 0xa

    if-ne v10, p1, :cond_a

    .line 265
    invoke-static {v2}, Ll/ܿ۫ۚ;->᩹(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;

    move-result-object p1

    goto :goto_2

    :cond_a
    const/16 p1, 0xd

    if-ne v10, p1, :cond_b

    .line 267
    invoke-static {v2}, Ll/ܿ۫ۚ;->ۚ(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;

    move-result-object p1

    goto :goto_2

    :cond_b
    const/16 p1, 0xf

    if-ne v10, p1, :cond_c

    .line 269
    invoke-static {v2}, Ll/ܿ۫ۚ;->᩷(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;

    move-result-object p1

    goto :goto_2

    :cond_c
    const/16 p1, 0x10

    if-ne v10, p1, :cond_d

    .line 271
    invoke-static {v2}, Ll/ܿ۫ۚ;->ۤ(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;

    move-result-object p1

    goto :goto_2

    .line 1508
    :cond_d
    invoke-static {v0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 273
    throw p1

    .line 338
    :cond_e
    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {v2}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, p3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 339
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p3

    invoke-static {v2}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v1

    invoke-virtual {p3, p2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 340
    new-instance p3, Ll/ܰ۫ۚ;

    invoke-direct {p3, p1, p2}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    :goto_1
    move-object p1, p3

    .line 275
    :goto_2
    invoke-virtual {v2}, Ll/᩵ۚۤ;->available()J

    move-result-wide p2

    const-wide/16 v1, 0x0

    cmp-long v3, p2, v1

    if-nez v3, :cond_f

    .line 278
    iget-object p2, p1, Ll/ܰ۫ۚ;->᩷:Lbin/mt/json/JSONObject;

    const-string p3, "recommendedLimit"

    invoke-virtual {p2, p3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "limitMax"

    .line 279
    invoke-virtual {p2, p3, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 280
    new-instance p2, Ll/ܰ۫ۚ;

    invoke-static {v10}, Ll/ܿ۫ۚ;->ۙ(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p1, Ll/ܰ۫ۚ;->᩷:Lbin/mt/json/JSONObject;

    iget-object v6, p1, Ll/ܰ۫ۚ;->ۤ:Lbin/mt/json/JSONObject;

    move-object v3, p2

    invoke-direct/range {v3 .. v8}, Ll/ܰ۫ۚ;-><init>(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;II)V

    return-object p2

    .line 1508
    :cond_f
    invoke-static {v0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 276
    throw p1

    .line 1508
    :cond_10
    invoke-static {v0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 241
    throw p1

    .line 1508
    :cond_11
    invoke-static {v0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 236
    throw p1

    .line 1508
    :cond_12
    invoke-static {v0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 231
    throw p1

    .line 1508
    :cond_13
    invoke-static {v0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 226
    throw p1
    :try_end_1
    .catch Ll/ۢܳۚ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 284
    :catch_0
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0

    .line 282
    :catch_1
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0

    :cond_14
    :goto_3
    return-object v0
.end method

.method public static ۙ(IILbin/mt/json/JSONArray;Ljava/lang/String;)V
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    .line 1084
    invoke-virtual {p2, p3}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/ۛۚۤ;I)V
    .locals 1

    if-ltz p1, :cond_1

    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-eqz v0, :cond_0

    and-int/lit8 v0, p1, 0x7f

    or-int/lit16 v0, v0, 0x80

    .line 876
    invoke-virtual {p0, v0}, Ll/ۛۚۤ;->writeByte(I)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    .line 879
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۛۚۤ;->writeByte(I)V

    return-void

    .line 873
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Negative varint"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ll/ۛۚۤ;ILjava/lang/String;)V
    .locals 7

    .line 737
    invoke-static {p2}, Ll/ۘ᩵ۚ;->۫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_7

    const/4 v6, 0x2

    if-ne p1, v6, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    .line 741
    invoke-static {p0, p2}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 743
    invoke-static {p2}, Ll/ܿ۫ۚ;->ۤ(Ljava/lang/String;)Ll/᩶۫ۚ;

    move-result-object p1

    .line 744
    iget-object p2, p1, Ll/᩶۫ۚ;->ۙ:Ljava/lang/String;

    invoke-static {p0, p2}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    .line 745
    iget-object p1, p1, Ll/᩶۫ۚ;->᩷:Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 v0, 0x5

    if-ne p1, v0, :cond_3

    .line 747
    invoke-static {p2}, Ll/ܿ۫ۚ;->ۤ(Ljava/lang/String;)Ll/᩶۫ۚ;

    move-result-object p1

    .line 748
    iget-object p2, p1, Ll/᩶۫ۚ;->ۙ:Ljava/lang/String;

    invoke-static {p0, p2}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    .line 749
    iget-object p1, p1, Ll/᩶۫ۚ;->᩷:Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    return-void

    :cond_3
    const/4 v0, 0x6

    if-ne p1, v0, :cond_6

    const-string p1, "Invalid resource key"

    if-eqz p2, :cond_5

    .line 1027
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_5

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "0x"

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1030
    invoke-virtual {p2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0x10

    invoke-static {p2, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-ltz p2, :cond_4

    const-wide v2, 0xffffffffL

    cmp-long p2, v0, v2

    if-gtz p2, :cond_4

    long-to-int p1, v0

    .line 751
    invoke-virtual {p0, p1}, Ll/ۛۚۤ;->writeInt(I)V

    return-void

    .line 1032
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1028
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 753
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unsupported read target"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 739
    :cond_7
    :goto_0
    invoke-static {p0, p2}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V

    return-void
.end method

.method public static ۙ(Ll/ۛۚۤ;J)V
    .locals 6

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    :goto_0
    const-wide/16 v2, -0x80

    and-long/2addr v2, p1

    cmp-long v4, v2, v0

    if-eqz v4, :cond_0

    const-wide/16 v2, 0x7f

    and-long/2addr v2, p1

    const-wide/16 v4, 0x80

    or-long/2addr v2, v4

    long-to-int v3, v2

    .line 910
    invoke-virtual {p0, v3}, Ll/ۛۚۤ;->writeByte(I)V

    const/4 v2, 0x7

    ushr-long/2addr p1, v2

    goto :goto_0

    :cond_0
    long-to-int p2, p1

    .line 913
    invoke-virtual {p0, p2}, Ll/ۛۚۤ;->writeByte(I)V

    return-void

    .line 907
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Negative varlong"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ll/ۛۚۤ;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 940
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 941
    array-length v0, p1

    invoke-static {p0, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    const/4 v0, 0x0

    .line 44
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۛۚۤ;->write([BII)V

    return-void

    .line 938
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Missing string"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ll/᩵ۚۤ;)Z
    .locals 1

    .line 994
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x0

    .line 1508
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1000
    throw p0
.end method

.method public static ۙ(ILjava/lang/String;Ljava/lang/String;I[BI)[B
    .locals 3

    .line 848
    :try_start_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 849
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    .line 850
    new-instance v0, Ll/ۛۚۤ;

    array-length v1, p1

    add-int/lit8 v1, v1, 0x8

    array-length v2, p2

    add-int/2addr v1, v2

    add-int/2addr v1, p5

    invoke-direct {v0, v1}, Ll/ۛۚۤ;-><init>(I)V

    .line 852
    invoke-virtual {v0, p0}, Ll/ۛۚۤ;->writeByte(I)V

    .line 853
    array-length p0, p1

    invoke-static {v0, p0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 44
    array-length p0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p0}, Ll/ۛۚۤ;->write([BII)V

    .line 855
    array-length p0, p2

    invoke-static {v0, p0}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 44
    array-length p0, p2

    invoke-virtual {v0, p2, v1, p0}, Ll/ۛۚۤ;->write([BII)V

    .line 857
    invoke-static {v0, p3}, Ll/ܿ۫ۚ;->ۙ(Ll/ۛۚۤ;I)V

    .line 858
    invoke-virtual {v0, p4, v1, p5}, Ll/ۛۚۤ;->write([BII)V

    .line 859
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object p0

    .line 860
    invoke-virtual {v0}, Ll/ۛۚۤ;->᩷()[B

    move-result-object p1

    invoke-virtual {v0}, Ll/ۛۚۤ;->size()I

    move-result p2

    invoke-virtual {p0, p1, v1, p2}, Ljava/security/MessageDigest;->update([BII)V

    .line 861
    invoke-virtual {p0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    .line 862
    aget-byte p1, p0, v1

    const/4 p2, 0x1

    aget-byte p0, p0, p2

    const/4 p3, 0x2

    new-array p3, p3, [B

    aput-byte p1, p3, v1

    aput-byte p0, p3, p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p3

    :catch_0
    move-exception p0

    .line 864
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ۚ(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;
    .locals 8

    const/4 v0, 0x6

    .line 603
    invoke-static {p0, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/᩵ۚۤ;I)Ljava/lang/String;

    move-result-object v0

    .line 604
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_4

    const/4 v3, 0x3

    if-gt v1, v3, :cond_4

    .line 608
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_3

    .line 610
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_0

    const-string v6, "dex"

    goto :goto_1

    :cond_0
    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    const-string v6, "axml"

    goto :goto_1

    :cond_1
    if-ne v6, v3, :cond_2

    const-string v6, "resource_table"

    :goto_1
    invoke-virtual {v4, v6}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1508
    :cond_2
    invoke-static {v2}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1445
    throw p0

    .line 612
    :cond_3
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetLocator"

    .line 613
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "scopes"

    .line 614
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 615
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "scopeIndex"

    .line 616
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "entryIndex"

    .line 617
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "classIndex"

    .line 618
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "memberIndex"

    .line 619
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "instructionIndex"

    .line 620
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "innerIndex"

    .line 621
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 622
    new-instance v1, Ll/ܰ۫ۚ;

    invoke-direct {v1, v0, p0}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1

    .line 1508
    :cond_4
    invoke-static {v2}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 606
    throw p0
.end method

.method public static ۤ(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;
    .locals 11

    .line 699
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "locator"

    .line 700
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "addressKind"

    .line 701
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "address"

    .line 702
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܽ(Ll/᩵ۚۤ;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "instructionMode"

    .line 703
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 704
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ᩻ܺ;->ۤ(Ljava/lang/String;)V

    const-string v2, "scanKind"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "resolvedInstructionMode"

    .line 705
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "targetVirtualAddress"

    .line 706
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܽ(Ll/᩵ۚۤ;)J

    move-result-wide v3

    invoke-virtual {v0, v1, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "arch"

    .line 707
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "bits"

    .line 708
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 710
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v1

    .line 709
    invoke-static {v1}, Ll/ۡ۟ۧ;->᩷(I)V

    const-string v3, "referenceKindMask"

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "maxScanBytes"

    .line 711
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 712
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܽ(Ll/᩵ۚۤ;)J

    move-result-wide v4

    .line 713
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܽ(Ll/᩵ۚۤ;)J

    move-result-wide v6

    const-wide v8, 0xffffffffL

    const/4 v1, 0x0

    cmp-long v10, v6, v8

    if-gtz v10, :cond_0

    :try_start_0
    const-string v8, ""

    .line 719
    invoke-virtual {v0, v2, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v8, -0x1

    invoke-virtual {v0, v3, v8}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 718
    invoke-static {v3, v2}, Ll/ۧ᩻ܺ;->ۙ(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "entrySize"

    .line 723
    invoke-virtual {v0, v1, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "entryCrc"

    .line 724
    invoke-virtual {v1, v2, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    .line 725
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "phaseIndex"

    .line 726
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "rangeIndex"

    .line 727
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "byteOffsetInRange"

    .line 728
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܽ(Ll/᩵ۚۤ;)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "relocationIndex"

    .line 729
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 730
    new-instance v1, Ll/ܰ۫ۚ;

    invoke-direct {v1, v0, p0}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1

    .line 1508
    :catch_0
    invoke-static {v1}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 721
    throw p0

    .line 1508
    :cond_0
    invoke-static {v1}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 715
    throw p0
.end method

.method public static ۤ(Ljava/lang/String;)Ll/᩶۫ۚ;
    .locals 3

    if-eqz p0, :cond_1

    const-string v0, "->"

    .line 787
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_0

    .line 788
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    if-ne v1, v0, :cond_0

    .line 791
    new-instance v0, Ll/᩶۫ۚ;

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v2, p0}, Ll/᩶۫ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 789
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid smali target"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 785
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing smali target"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;
    .locals 6

    .line 949
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v0

    .line 950
    invoke-virtual {p0}, Ll/᩵ۚۤ;->available()J

    move-result-wide v1

    int-to-long v3, v0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    .line 211
    new-array v1, v0, [B

    .line 212
    invoke-virtual {p0, v0, v1}, Ll/᩵ۚۤ;->ۙ(I[B)V

    .line 954
    new-instance p0, Ljava/lang/String;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, v1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p0

    :cond_0
    const/4 p0, 0x0

    .line 1508
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 951
    throw p0
.end method

.method public static ۫(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;
    .locals 4

    .line 321
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const-string v1, "resource_table"

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    const-string v1, "resource_table_variants"

    :goto_0
    const-string v2, "view"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "typeName"

    .line 322
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "variant"

    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 323
    new-instance v1, Ll/ܰ۫ۚ;

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "offset"

    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result p0

    invoke-virtual {v2, v3, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1

    :cond_1
    const/4 p0, 0x0

    .line 1508
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1177
    throw p0
.end method

.method public static ܳ(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;
    .locals 7

    .line 394
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v0

    .line 395
    invoke-static {p0, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/᩵ۚۤ;I)Ljava/lang/String;

    move-result-object v1

    .line 396
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ne v2, v5, :cond_0

    const-string v6, "text"

    goto :goto_0

    :cond_0
    if-ne v2, v4, :cond_5

    const-string v6, "hex"

    :goto_0
    if-ne v2, v4, :cond_2

    if-ne v0, v5, :cond_1

    goto :goto_1

    .line 1508
    :cond_1
    invoke-static {v3}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 399
    throw p0

    :cond_2
    :goto_1
    const-string v3, "target"

    const-string v5, "format"

    .line 0
    invoke-static {v3, v1, v5, v6}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 404
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    if-ne v2, v4, :cond_3

    const-string v0, "hexOffset"

    .line 406
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result p0

    invoke-virtual {v3, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    goto :goto_2

    :cond_3
    const/4 v2, 0x6

    if-ne v0, v2, :cond_4

    const-string v0, "variant"

    .line 408
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "maxValueChars"

    .line 409
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v4

    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "maxValueXmlChars"

    .line 410
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v4

    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "maxItemsPerValue"

    .line 411
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v4

    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "resolveDepth"

    .line 412
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v4

    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v0, "valueOffset"

    .line 413
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result p0

    invoke-virtual {v3, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    goto :goto_2

    :cond_4
    const-string v0, "maxChars"

    .line 415
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v0, "lineOffset"

    .line 416
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v2

    invoke-virtual {v3, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "lineCharOffset"

    .line 417
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result p0

    invoke-virtual {v0, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 419
    :goto_2
    new-instance p0, Ll/ܰ۫ۚ;

    invoke-direct {p0, v1, v3}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object p0

    .line 1508
    :cond_5
    invoke-static {v3}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 831
    throw p0
.end method

.method public static ܶ(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;
    .locals 4

    const/4 v0, 0x4

    .line 546
    invoke-static {p0, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/᩵ۚۤ;I)Ljava/lang/String;

    move-result-object v0

    .line 547
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetLocator"

    .line 548
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 549
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v1

    invoke-static {v1}, Ll/ܿ۫ۚ;->᩷(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "methodResolution"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 550
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "classIndex"

    .line 551
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "memberIndex"

    .line 552
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "instructionIndex"

    .line 553
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 554
    new-instance v1, Ll/ܰ۫ۚ;

    invoke-direct {v1, v0, p0}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1
.end method

.method public static ܺ(Ll/᩵ۚۤ;)I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x5

    const/4 v4, 0x0

    if-ge v0, v3, :cond_3

    .line 889
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v3

    const/4 v5, 0x4

    if-ne v0, v5, :cond_1

    and-int/lit16 v5, v3, 0xf8

    if-nez v5, :cond_0

    goto :goto_1

    .line 1508
    :cond_0
    invoke-static {v4}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 891
    throw p0

    :cond_1
    :goto_1
    and-int/lit8 v4, v3, 0x7f

    shl-int/2addr v4, v2

    or-int/2addr v1, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_2

    return v1

    :cond_2
    add-int/lit8 v2, v2, 0x7

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1508
    :cond_3
    invoke-static {v4}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 899
    throw p0
.end method

.method public static ܽ(Ll/᩵ۚۤ;)J
    .locals 7

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/16 v4, 0x9

    if-ge v2, v4, :cond_1

    .line 923
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v4

    and-int/lit8 v5, v4, 0x7f

    int-to-long v5, v5

    shl-long/2addr v5, v3

    or-long/2addr v0, v5

    and-int/lit16 v4, v4, 0x80

    if-nez v4, :cond_0

    return-wide v0

    :cond_0
    add-int/lit8 v3, v3, 0x7

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    .line 1508
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 930
    throw p0
.end method

.method public static ᩴ(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;
    .locals 4

    .line 433
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "target"

    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "style"

    .line 434
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "textHash"

    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "maxChars"

    .line 435
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 436
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "lineOffset"

    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "lineCharOffset"

    .line 437
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 438
    new-instance v1, Ll/ܰ۫ۚ;

    invoke-direct {v1, v0, p0}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1
.end method

.method public static ᩷(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string p0, "exact"

    return-object p0

    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    const-string p0, "slot"

    return-object p0

    :cond_1
    const/4 v0, 0x3

    if-ne p0, v0, :cond_2

    const-string p0, "dispatch"

    return-object p0

    :cond_2
    const/4 v0, 0x4

    if-ne p0, v0, :cond_3

    const-string p0, "not_applicable"

    return-object p0

    :cond_3
    const/4 p0, 0x0

    .line 1508
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1417
    throw p0
.end method

.method public static ᩷(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 292
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    .line 299
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;
    .locals 9

    .line 647
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "locator"

    .line 648
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 649
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v1, v3, :cond_1

    const/16 v4, 0x9

    if-gt v1, v4, :cond_1

    sub-int/2addr v1, v3

    .line 1467
    sget-object v3, Ll/ۤ۟ۧ;->ۙ:[Ljava/lang/String;

    aget-object v1, v3, v1

    const-string v3, "itemKind"

    .line 649
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "namePrefix"

    .line 650
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "demangle"

    .line 651
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ll/᩵ۚۤ;)Z

    move-result v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 652
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܽ(Ll/᩵ۚۤ;)J

    move-result-wide v3

    .line 653
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܽ(Ll/᩵ۚۤ;)J

    move-result-wide v5

    const-wide v7, 0xffffffffL

    cmp-long v1, v5, v7

    if-gtz v1, :cond_0

    .line 657
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v1

    const-string v2, "entrySize"

    .line 658
    invoke-virtual {v0, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "entryCrc"

    .line 659
    invoke-virtual {v2, v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "totalCount"

    .line 660
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 661
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "offset"

    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 662
    new-instance v1, Ll/ܰ۫ۚ;

    invoke-direct {v1, v0, p0}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1

    .line 1508
    :cond_0
    invoke-static {v2}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 655
    throw p0

    .line 1508
    :cond_1
    invoke-static {v2}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1465
    throw p0
.end method

.method public static ᩸(Ljava/lang/String;)I
    .locals 2

    const-string v0, "zip_entry"

    .line 1184
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-string v0, "axml"

    .line 1186
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const-string v0, "dex_class"

    .line 1188
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const-string v0, "dex_method"

    .line 1190
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const-string v0, "dex_field"

    .line 1192
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 p0, 0x5

    return p0

    :cond_4
    const-string v0, "resource"

    .line 1194
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p0, 0x6

    return p0

    .line 1197
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported target kind: "

    .line 0
    invoke-static {v1, p0}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 1197
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ᩸(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;
    .locals 3

    .line 355
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "locator"

    invoke-static {p0}, Ll/ܿ۫ۚ;->ۧ(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 356
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "memberOffset"

    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 357
    new-instance v1, Ll/ܰ۫ۚ;

    invoke-direct {v1, v0, p0}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1
.end method

.method public static ᩹(Ll/᩵ۚۤ;)Ll/ܰ۫ۚ;
    .locals 4

    .line 561
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 1508
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 563
    throw p0

    .line 565
    :cond_1
    :goto_0
    invoke-static {p0, v0}, Ll/ܿ۫ۚ;->ۙ(Ll/᩵ۚۤ;I)Ljava/lang/String;

    move-result-object v0

    .line 566
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetLocator"

    .line 567
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 568
    invoke-static {p0}, Ll/ܿ۫ۚ;->᩻(Ll/᩵ۚۤ;)I

    move-result v1

    invoke-static {v1}, Ll/ܿ۫ۚ;->᩷(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "methodResolution"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 569
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "classIndex"

    .line 570
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "memberIndex"

    .line 571
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "instructionIndex"

    .line 572
    invoke-static {p0}, Ll/ܿ۫ۚ;->ܺ(Ll/᩵ۚۤ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 573
    new-instance v1, Ll/ܰ۫ۚ;

    invoke-direct {v1, v0, p0}, Ll/ܰ۫ۚ;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1
.end method

.method public static ᩻(Ll/᩵ۚۤ;)I
    .locals 5

    .line 1007
    invoke-virtual {p0}, Ll/᩵ۚۤ;->available()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 1010
    invoke-virtual {p0}, Ll/᩵ۚۤ;->readByte()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    return p0

    :cond_0
    const/4 p0, 0x0

    .line 1508
    invoke-static {p0}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 1008
    throw p0
.end method

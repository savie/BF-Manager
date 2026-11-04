.class public final Ll/ۜᩴۚ;
.super Ljava/lang/Object;
.source "P6HY"


# direct methods
.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z
    .locals 0

    .line 769
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static bridge synthetic ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۙ(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۙ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const-string v0, "code"

    .line 756
    invoke-static {p1, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 700
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "errorCode"

    .line 756
    invoke-static {p1, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const-string v1, "INVALID_ARGUMENT"

    const/4 v2, 0x0

    if-eqz p0, :cond_1

    goto/16 :goto_1

    .line 701
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result p0

    const/4 v3, -0x1

    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p0, "ZIP_NOT_FOUND"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_1
    const-string p0, "APK_ENTRY_NOT_FOUND"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_2
    const-string p0, "FILE_NOT_FOUND"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_3
    const-string p0, "RESOURCE_NOT_FOUND"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_4
    const-string p0, "RESOURCE_TYPE_VARIANT_NOT_FOUND"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_5
    const-string p0, "RESOURCE_VARIANT_NOT_FOUND"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_6
    const-string p0, "ZIP_ENTRY_NOT_FOUND"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    const p0, 0x7f12060a

    goto :goto_1

    :pswitch_0
    const p0, 0x7f120696

    goto :goto_1

    :pswitch_1
    const p0, 0x7f1206ce

    goto :goto_1

    :pswitch_2
    const p0, 0x7f120635

    .line 708
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x50

    const-string v5, ""

    if-gt v3, v4, :cond_a

    move-object v3, v0

    goto :goto_2

    :cond_a
    move-object v3, v5

    :goto_2
    const/4 v4, 0x0

    .line 709
    :goto_3
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v4, v6, :cond_e

    .line 710
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x41

    if-lt v6, v7, :cond_b

    const/16 v7, 0x5a

    if-le v6, v7, :cond_d

    :cond_b
    const/16 v7, 0x30

    if-lt v6, v7, :cond_c

    const/16 v7, 0x39

    if-le v6, v7, :cond_d

    :cond_c
    const/16 v7, 0x5f

    if-eq v6, v7, :cond_d

    move-object v3, v5

    goto :goto_4

    :cond_d
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 713
    :cond_e
    :goto_4
    new-instance v4, Ll/ۖᩴۚ;

    const/16 v6, 0x1000

    invoke-direct {v4, v6}, Ll/ۖᩴۚ;-><init>(I)V

    .line 714
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    new-array v2, v2, [Ljava/lang/Object;

    .line 770
    invoke-static {p0, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 714
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_f

    goto :goto_5

    :cond_f
    const-string p0, " ("

    const-string v2, ")"

    .line 0
    invoke-static {p0, v3, v2}, Ll/ܰ۟ۙ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 714
    :goto_5
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v4, p0}, Ll/ۖᩴۚ;->᩷(Ljava/lang/String;)V

    .line 715
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_10

    invoke-virtual {v4, p1}, Ll/ۖᩴۚ;->᩷(Lbin/mt/json/JSONObject;)V

    :cond_10
    const-string p0, "mt_apk_resource_delete"

    .line 716
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    const-string v0, "diagnostics"

    if-eqz p0, :cond_12

    .line 717
    invoke-static {p1, v0}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "target"

    .line 718
    invoke-static {p0, v1}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "failedDeleteIndex"

    const-wide/16 v5, -0x1

    .line 719
    invoke-static {p0, v2, v5, v6}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v2

    const-wide/16 v5, 0x0

    cmp-long p0, v2, v5

    if-ltz p0, :cond_11

    const-wide/16 v5, 0xc8

    cmp-long p0, v2, v5

    if-gez p0, :cond_11

    long-to-int p0, v2

    const-string v2, "kind"

    .line 756
    invoke-static {v1, v2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 720
    invoke-virtual {v4, p0, v2}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;)V

    .line 721
    :cond_11
    invoke-static {v1}, Ll/ۜᩴۚ;->ۤ(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object p0

    .line 722
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_12

    const v1, 0x7f120683

    invoke-virtual {v4, v1, p0}, Ll/ۖᩴۚ;->᩷(ILjava/lang/String;)V

    .line 724
    :cond_12
    invoke-static {p1, v0}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {v4, p0, p2}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)V

    .line 725
    invoke-virtual {v4}, Ll/ۖᩴۚ;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x66065bdb -> :sswitch_7
        -0x4eec0615 -> :sswitch_6
        -0x436fce75 -> :sswitch_5
        -0x3d7e72f8 -> :sswitch_4
        -0x7e6c1b -> :sswitch_3
        0x14a25bd3 -> :sswitch_2
        0x681c46e6 -> :sswitch_1
        0x776f6718 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۙ(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    if-le p0, v0, :cond_0

    .line 165
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const p0, 0x7f120606

    .line 770
    invoke-static {p0, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, " \u00b7 "

    .line 165
    invoke-static {p0, v0, p1}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0x200

    invoke-static {p1, p0}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static ۙ(Lbin/mt/json/JSONArray;)Ljava/lang/String;
    .locals 5

    .line 795
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v0

    const-string v1, ""

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    const/16 v2, 0xc8

    if-le v0, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 796
    invoke-static {p0, v0}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "kind"

    .line 756
    invoke-static {v0, v2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    .line 797
    :goto_0
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 798
    invoke-static {p0, v3}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 756
    invoke-static {v4, v2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 798
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    return-object v1
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 20
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v2

    const-string v3, "mt_apk_resource_xref"

    const-string v4, "mt_apk_resource_read"

    const-string v5, "mt_apk_resource_list"

    const-string v6, "mt_apk_resource_edit"

    const-string v7, "mt_file_transfer_cancel"

    const-string v8, "mt_apk_patch_bytes"

    const-string v9, "mt_apk_dex_xref"

    const-string v10, "mt_apk_search"

    const-string v11, "mt_file_get_access_policy"

    const-string v12, "mt_file_create_directory"

    const-string v13, "mt_file_search"

    const/4 v14, 0x0

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v2, "mt_file_delete"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x42

    goto/16 :goto_1

    :sswitch_1
    const-string v2, "mt_file_transfer_get"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x41

    goto/16 :goto_1

    :sswitch_2
    const-string v2, "mt_apk_session_check"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x40

    goto/16 :goto_1

    :sswitch_3
    const-string v2, "mt_file_search_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0x3f

    goto/16 :goto_1

    :sswitch_4
    const-string v2, "mt_zip_update"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v2, 0x3e

    goto/16 :goto_1

    :sswitch_5
    const-string v2, "mt_apk_session_create"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v2, 0x3d

    goto/16 :goto_1

    :sswitch_6
    const-string v2, "mt_apk_delete_target"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v2, 0x3c

    goto/16 :goto_1

    :sswitch_7
    const-string v2, "mt_apk_resource_delete"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v2, 0x3b

    goto/16 :goto_1

    :sswitch_8
    const-string v2, "mt_apk_install"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v2, 0x3a

    goto/16 :goto_1

    :sswitch_9
    const-string v2, "mt_zip_extract"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v2, 0x39

    goto/16 :goto_1

    :sswitch_a
    const-string v2, "mt_file_append_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v2, 0x38

    goto/16 :goto_1

    :sswitch_b
    const-string v2, "mt_apk_native_analyze_control_flow"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v2, 0x37

    goto/16 :goto_1

    :sswitch_c
    const-string v2, "mt_zip_create"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v2, 0x36

    goto/16 :goto_1

    :sswitch_d
    const-string v2, "mt_file_read_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v2, 0x35

    goto/16 :goto_1

    :sswitch_e
    const-string v2, "mt_apk_read_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v2, 0x34

    goto/16 :goto_1

    :sswitch_f
    const-string v2, "mt_file_transfer_create_download"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v2, 0x33

    goto/16 :goto_1

    :sswitch_10
    const-string v2, "mt_file_transfer_create_upload"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v2, 0x32

    goto/16 :goto_1

    :sswitch_11
    const-string v2, "mt_apk_workspace_open"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v2, 0x31

    goto/16 :goto_1

    :sswitch_12
    const-string v2, "mt_apk_workspace_list"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v2, 0x30

    goto/16 :goto_1

    :sswitch_13
    const-string v2, "mt_apk_resource_add"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v2, 0x2f

    goto/16 :goto_1

    :sswitch_14
    const-string v2, "mt_file_truncate_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v2, 0x2e

    goto/16 :goto_1

    :sswitch_15
    const-string v2, "mt_apk_copy_entry"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v2, 0x2d

    goto/16 :goto_1

    :sswitch_16
    const-string v2, "mt_apk_continue"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v2, 0x2c

    goto/16 :goto_1

    :sswitch_17
    const-string v2, "mt_apk_native_inspect"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v2, 0x2b

    goto/16 :goto_1

    :sswitch_18
    const-string v2, "mt_apk_list_installed_apps"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v2, 0x2a

    goto/16 :goto_1

    :sswitch_19
    const-string v2, "mt_file_append_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v2, 0x29

    goto/16 :goto_1

    :sswitch_1a
    const-string v2, "mt_file_read_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v2, 0x28

    goto/16 :goto_1

    :sswitch_1b
    const-string v2, "mt_apk_list_available_apks"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v2, 0x27

    goto/16 :goto_1

    :sswitch_1c
    const-string v2, "mt_file_stat"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/16 v2, 0x26

    goto/16 :goto_1

    :sswitch_1d
    const-string v2, "mt_file_move"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/16 v2, 0x25

    goto/16 :goto_1

    :sswitch_1e
    const-string v2, "mt_file_list"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 v2, 0x24

    goto/16 :goto_1

    :sswitch_1f
    const-string v2, "mt_file_copy"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/16 v2, 0x23

    goto/16 :goto_1

    :sswitch_20
    const-string v2, "mt_zip_test"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    goto/16 :goto_0

    :cond_20
    const/16 v2, 0x22

    goto/16 :goto_1

    :sswitch_21
    const-string v2, "mt_zip_list"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    goto/16 :goto_0

    :cond_21
    const/16 v2, 0x21

    goto/16 :goto_1

    :sswitch_22
    const-string v2, "mt_apk_dex_read_class_outline"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_22

    goto/16 :goto_0

    :cond_22
    const/16 v2, 0x20

    goto/16 :goto_1

    :sswitch_23
    const-string v2, "mt_file_replace_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_23

    goto/16 :goto_0

    :cond_23
    const/16 v2, 0x1f

    goto/16 :goto_1

    :sswitch_24
    const-string v2, "mt_apk_dex_list_classes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_24

    goto/16 :goto_0

    :cond_24
    const/16 v2, 0x1e

    goto/16 :goto_1

    :sswitch_25
    const-string v2, "mt_file_write_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_25

    goto/16 :goto_0

    :cond_25
    const/16 v2, 0x1d

    goto/16 :goto_1

    :sswitch_26
    const-string v2, "mt_apk_workspace_delete"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_26

    goto/16 :goto_0

    :cond_26
    const/16 v2, 0x1c

    goto/16 :goto_1

    :sswitch_27
    const-string v2, "mt_zip_read_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    goto/16 :goto_0

    :cond_27
    const/16 v2, 0x1b

    goto/16 :goto_1

    :sswitch_28
    const-string v2, "mt_apk_read_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    goto/16 :goto_0

    :cond_28
    const/16 v2, 0x1a

    goto/16 :goto_1

    :sswitch_29
    const-string v2, "mt_zip_read_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_29

    goto/16 :goto_0

    :cond_29
    const/16 v2, 0x19

    goto/16 :goto_1

    :sswitch_2a
    const-string v2, "mt_file_edit_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2a

    goto/16 :goto_0

    :cond_2a
    const/16 v2, 0x18

    goto/16 :goto_1

    :sswitch_2b
    const-string v2, "mt_apk_native_patch_instructions"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2b

    goto/16 :goto_0

    :cond_2b
    const/16 v2, 0x17

    goto/16 :goto_1

    :sswitch_2c
    const-string v2, "mt_apk_native_map_address"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2c

    goto/16 :goto_0

    :cond_2c
    const/16 v2, 0x16

    goto/16 :goto_1

    :sswitch_2d
    const-string v2, "mt_apk_dex_read_pseudocode"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2d

    goto/16 :goto_0

    :cond_2d
    const/16 v2, 0x15

    goto/16 :goto_1

    :sswitch_2e
    const-string v2, "mt_apk_native_patch_string"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2e

    goto/16 :goto_0

    :cond_2e
    const/16 v2, 0x14

    goto/16 :goto_1

    :sswitch_2f
    const-string v2, "mt_apk_build"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2f

    goto/16 :goto_0

    :cond_2f
    const/16 v2, 0x13

    goto/16 :goto_1

    :sswitch_30
    const-string v2, "mt_apk_native_xref"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_30

    goto/16 :goto_0

    :cond_30
    const/16 v2, 0x12

    goto/16 :goto_1

    :sswitch_31
    const-string v2, "mt_apk_edit_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_31

    goto/16 :goto_0

    :cond_31
    const/16 v2, 0x11

    goto/16 :goto_1

    :sswitch_32
    const-string v2, "mt_file_patch_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    goto/16 :goto_0

    :cond_32
    const/16 v2, 0x10

    goto/16 :goto_1

    :sswitch_33
    const-string v2, "mt_apk_native_list_items"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_33

    goto/16 :goto_0

    :cond_33
    const/16 v2, 0xf

    goto/16 :goto_1

    :sswitch_34
    const-string v2, "mt_file_delete_directory"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_34

    goto/16 :goto_0

    :cond_34
    const/16 v2, 0xe

    goto/16 :goto_1

    :sswitch_35
    const-string v2, "mt_apk_read_signature"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_35

    goto/16 :goto_0

    :cond_35
    const/16 v2, 0xd

    goto/16 :goto_1

    :sswitch_36
    const-string v2, "mt_apk_list_entries"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_36

    goto/16 :goto_0

    :cond_36
    const/16 v2, 0xc

    goto/16 :goto_1

    :sswitch_37
    const-string v2, "mt_apk_native_disassemble"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_37

    goto/16 :goto_0

    :cond_37
    const/16 v2, 0xb

    goto/16 :goto_1

    :sswitch_38
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_38

    goto/16 :goto_0

    :cond_38
    const/16 v2, 0xa

    goto/16 :goto_1

    :sswitch_39
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_39

    goto/16 :goto_0

    :cond_39
    const/16 v2, 0x9

    goto/16 :goto_1

    :sswitch_3a
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3a

    goto :goto_0

    :cond_3a
    const/16 v2, 0x8

    goto :goto_1

    :sswitch_3b
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3b

    goto :goto_0

    :cond_3b
    const/4 v2, 0x7

    goto :goto_1

    :sswitch_3c
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3c

    goto :goto_0

    :cond_3c
    const/4 v2, 0x6

    goto :goto_1

    :sswitch_3d
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    goto :goto_0

    :cond_3d
    const/4 v2, 0x5

    goto :goto_1

    :sswitch_3e
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3e

    goto :goto_0

    :cond_3e
    const/4 v2, 0x4

    goto :goto_1

    :sswitch_3f
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3f

    goto :goto_0

    :cond_3f
    const/4 v2, 0x3

    goto :goto_1

    :sswitch_40
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_40

    goto :goto_0

    :cond_40
    const/4 v2, 0x2

    goto :goto_1

    :sswitch_41
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_41

    goto :goto_0

    :cond_41
    const/4 v2, 0x1

    goto :goto_1

    :sswitch_42
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_42

    goto :goto_0

    :cond_42
    const/4 v2, 0x0

    goto :goto_1

    :goto_0
    const/4 v2, -0x1

    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 519
    invoke-static/range {p1 .. p1}, Ll/ۙܳۚ;->᩷(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 520
    :pswitch_0
    invoke-static/range {p1 .. p1}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v15, "error"

    .line 521
    invoke-static {v2, v15}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v15

    .line 522
    invoke-virtual {v15}, Lbin/mt/json/JSONObject;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_43

    .line 695
    invoke-static {v14, v15, v1}, Ll/ۜᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_43
    const-string v14, "data"

    .line 523
    invoke-static {v2, v14}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 524
    new-instance v14, Ll/ۖᩴۚ;

    const/16 v15, 0x1000

    invoke-direct {v14, v15}, Ll/ۖᩴۚ;-><init>(I)V

    .line 525
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v15

    sparse-switch v15, :sswitch_data_1

    goto/16 :goto_2

    :sswitch_43
    const-string v3, "mt_file_delete"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_44

    goto/16 :goto_2

    :cond_44
    const/16 v3, 0x42

    goto/16 :goto_3

    :sswitch_44
    const-string v3, "mt_file_transfer_get"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_45

    goto/16 :goto_2

    :cond_45
    const/16 v3, 0x41

    goto/16 :goto_3

    :sswitch_45
    const-string v3, "mt_apk_session_check"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_46

    goto/16 :goto_2

    :cond_46
    const/16 v3, 0x40

    goto/16 :goto_3

    :sswitch_46
    const-string v3, "mt_file_search_text"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_47

    goto/16 :goto_2

    :cond_47
    const/16 v3, 0x3f

    goto/16 :goto_3

    :sswitch_47
    const-string v3, "mt_zip_update"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_48

    goto/16 :goto_2

    :cond_48
    const/16 v3, 0x3e

    goto/16 :goto_3

    :sswitch_48
    const-string v3, "mt_apk_session_create"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_49

    goto/16 :goto_2

    :cond_49
    const/16 v3, 0x3d

    goto/16 :goto_3

    :sswitch_49
    const-string v3, "mt_apk_delete_target"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4a

    goto/16 :goto_2

    :cond_4a
    const/16 v3, 0x3c

    goto/16 :goto_3

    :sswitch_4a
    const-string v3, "mt_apk_resource_delete"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4b

    goto/16 :goto_2

    :cond_4b
    const/16 v3, 0x3b

    goto/16 :goto_3

    :sswitch_4b
    const-string v3, "mt_apk_install"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4c

    goto/16 :goto_2

    :cond_4c
    const/16 v3, 0x3a

    goto/16 :goto_3

    :sswitch_4c
    const-string v3, "mt_zip_extract"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4d

    goto/16 :goto_2

    :cond_4d
    const/16 v3, 0x39

    goto/16 :goto_3

    :sswitch_4d
    const-string v3, "mt_file_append_bytes"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4e

    goto/16 :goto_2

    :cond_4e
    const/16 v3, 0x38

    goto/16 :goto_3

    :sswitch_4e
    const-string v3, "mt_apk_native_analyze_control_flow"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4f

    goto/16 :goto_2

    :cond_4f
    const/16 v3, 0x37

    goto/16 :goto_3

    :sswitch_4f
    const-string v3, "mt_zip_create"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_50

    goto/16 :goto_2

    :cond_50
    const/16 v3, 0x36

    goto/16 :goto_3

    :sswitch_50
    const-string v3, "mt_file_read_bytes"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_51

    goto/16 :goto_2

    :cond_51
    const/16 v3, 0x35

    goto/16 :goto_3

    :sswitch_51
    const-string v3, "mt_apk_read_bytes"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_52

    goto/16 :goto_2

    :cond_52
    const/16 v3, 0x34

    goto/16 :goto_3

    :sswitch_52
    const-string v3, "mt_file_transfer_create_download"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_53

    goto/16 :goto_2

    :cond_53
    const/16 v3, 0x33

    goto/16 :goto_3

    :sswitch_53
    const-string v3, "mt_file_transfer_create_upload"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_54

    goto/16 :goto_2

    :cond_54
    const/16 v3, 0x32

    goto/16 :goto_3

    :sswitch_54
    const-string v3, "mt_apk_workspace_open"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_55

    goto/16 :goto_2

    :cond_55
    const/16 v3, 0x31

    goto/16 :goto_3

    :sswitch_55
    const-string v3, "mt_apk_workspace_list"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_56

    goto/16 :goto_2

    :cond_56
    const/16 v3, 0x30

    goto/16 :goto_3

    :sswitch_56
    const-string v3, "mt_apk_resource_add"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_57

    goto/16 :goto_2

    :cond_57
    const/16 v3, 0x2f

    goto/16 :goto_3

    :sswitch_57
    const-string v3, "mt_file_truncate_bytes"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_58

    goto/16 :goto_2

    :cond_58
    const/16 v3, 0x2e

    goto/16 :goto_3

    :sswitch_58
    const-string v3, "mt_apk_copy_entry"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_59

    goto/16 :goto_2

    :cond_59
    const/16 v3, 0x2d

    goto/16 :goto_3

    :sswitch_59
    const-string v3, "mt_apk_continue"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5a

    goto/16 :goto_2

    :cond_5a
    const/16 v3, 0x2c

    goto/16 :goto_3

    :sswitch_5a
    const-string v3, "mt_apk_native_inspect"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5b

    goto/16 :goto_2

    :cond_5b
    const/16 v3, 0x2b

    goto/16 :goto_3

    :sswitch_5b
    const-string v3, "mt_apk_list_installed_apps"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5c

    goto/16 :goto_2

    :cond_5c
    const/16 v3, 0x2a

    goto/16 :goto_3

    :sswitch_5c
    const-string v3, "mt_file_append_text"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5d

    goto/16 :goto_2

    :cond_5d
    const/16 v3, 0x29

    goto/16 :goto_3

    :sswitch_5d
    const-string v3, "mt_file_read_text"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5e

    goto/16 :goto_2

    :cond_5e
    const/16 v3, 0x28

    goto/16 :goto_3

    :sswitch_5e
    const-string v3, "mt_apk_list_available_apks"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5f

    goto/16 :goto_2

    :cond_5f
    const/16 v3, 0x27

    goto/16 :goto_3

    :sswitch_5f
    const-string v3, "mt_file_stat"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_60

    goto/16 :goto_2

    :cond_60
    const/16 v3, 0x26

    goto/16 :goto_3

    :sswitch_60
    const-string v3, "mt_file_move"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_61

    goto/16 :goto_2

    :cond_61
    const/16 v3, 0x25

    goto/16 :goto_3

    :sswitch_61
    const-string v3, "mt_file_list"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_62

    goto/16 :goto_2

    :cond_62
    const/16 v3, 0x24

    goto/16 :goto_3

    :sswitch_62
    const-string v3, "mt_file_copy"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_63

    goto/16 :goto_2

    :cond_63
    const/16 v3, 0x23

    goto/16 :goto_3

    :sswitch_63
    const-string v3, "mt_zip_test"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_64

    goto/16 :goto_2

    :cond_64
    const/16 v3, 0x22

    goto/16 :goto_3

    :sswitch_64
    const-string v3, "mt_zip_list"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_65

    goto/16 :goto_2

    :cond_65
    const/16 v3, 0x21

    goto/16 :goto_3

    :sswitch_65
    const-string v3, "mt_apk_dex_read_class_outline"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_66

    goto/16 :goto_2

    :cond_66
    const/16 v3, 0x20

    goto/16 :goto_3

    :sswitch_66
    const-string v3, "mt_file_replace_text"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_67

    goto/16 :goto_2

    :cond_67
    const/16 v3, 0x1f

    goto/16 :goto_3

    :sswitch_67
    const-string v3, "mt_apk_dex_list_classes"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_68

    goto/16 :goto_2

    :cond_68
    const/16 v3, 0x1e

    goto/16 :goto_3

    :sswitch_68
    const-string v3, "mt_file_write_bytes"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_69

    goto/16 :goto_2

    :cond_69
    const/16 v3, 0x1d

    goto/16 :goto_3

    :sswitch_69
    const-string v3, "mt_apk_workspace_delete"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6a

    goto/16 :goto_2

    :cond_6a
    const/16 v3, 0x1c

    goto/16 :goto_3

    :sswitch_6a
    const-string v3, "mt_zip_read_bytes"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6b

    goto/16 :goto_2

    :cond_6b
    const/16 v3, 0x1b

    goto/16 :goto_3

    :sswitch_6b
    const-string v3, "mt_apk_read_text"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6c

    goto/16 :goto_2

    :cond_6c
    const/16 v3, 0x1a

    goto/16 :goto_3

    :sswitch_6c
    const-string v3, "mt_zip_read_text"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6d

    goto/16 :goto_2

    :cond_6d
    const/16 v3, 0x19

    goto/16 :goto_3

    :sswitch_6d
    const-string v3, "mt_file_edit_text"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6e

    goto/16 :goto_2

    :cond_6e
    const/16 v3, 0x18

    goto/16 :goto_3

    :sswitch_6e
    const-string v3, "mt_apk_native_patch_instructions"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6f

    goto/16 :goto_2

    :cond_6f
    const/16 v3, 0x17

    goto/16 :goto_3

    :sswitch_6f
    const-string v3, "mt_apk_native_map_address"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_70

    goto/16 :goto_2

    :cond_70
    const/16 v3, 0x16

    goto/16 :goto_3

    :sswitch_70
    const-string v3, "mt_apk_dex_read_pseudocode"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_71

    goto/16 :goto_2

    :cond_71
    const/16 v3, 0x15

    goto/16 :goto_3

    :sswitch_71
    const-string v3, "mt_apk_native_patch_string"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_72

    goto/16 :goto_2

    :cond_72
    const/16 v3, 0x14

    goto/16 :goto_3

    :sswitch_72
    const-string v3, "mt_apk_build"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_73

    goto/16 :goto_2

    :cond_73
    const/16 v3, 0x13

    goto/16 :goto_3

    :sswitch_73
    const-string v3, "mt_apk_native_xref"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_74

    goto/16 :goto_2

    :cond_74
    const/16 v3, 0x12

    goto/16 :goto_3

    :sswitch_74
    const-string v3, "mt_apk_edit_text"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_75

    goto/16 :goto_2

    :cond_75
    const/16 v3, 0x11

    goto/16 :goto_3

    :sswitch_75
    const-string v3, "mt_file_patch_bytes"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_76

    goto/16 :goto_2

    :cond_76
    const/16 v3, 0x10

    goto/16 :goto_3

    :sswitch_76
    const-string v3, "mt_apk_native_list_items"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_77

    goto/16 :goto_2

    :cond_77
    const/16 v3, 0xf

    goto/16 :goto_3

    :sswitch_77
    const-string v3, "mt_file_delete_directory"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_78

    goto/16 :goto_2

    :cond_78
    const/16 v3, 0xe

    goto/16 :goto_3

    :sswitch_78
    const-string v3, "mt_apk_read_signature"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_79

    goto/16 :goto_2

    :cond_79
    const/16 v3, 0xd

    goto/16 :goto_3

    :sswitch_79
    const-string v3, "mt_apk_list_entries"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7a

    goto/16 :goto_2

    :cond_7a
    const/16 v3, 0xc

    goto/16 :goto_3

    :sswitch_7a
    const-string v3, "mt_apk_native_disassemble"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7b

    goto/16 :goto_2

    :cond_7b
    const/16 v3, 0xb

    goto/16 :goto_3

    :sswitch_7b
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7c

    goto/16 :goto_2

    :cond_7c
    const/16 v3, 0xa

    goto/16 :goto_3

    :sswitch_7c
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7d

    goto/16 :goto_2

    :cond_7d
    const/16 v3, 0x9

    goto/16 :goto_3

    :sswitch_7d
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7e

    goto :goto_2

    :cond_7e
    const/16 v3, 0x8

    goto :goto_3

    :sswitch_7e
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7f

    goto :goto_2

    :cond_7f
    const/4 v3, 0x7

    goto :goto_3

    :sswitch_7f
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_80

    goto :goto_2

    :cond_80
    const/4 v3, 0x6

    goto :goto_3

    :sswitch_80
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_81

    goto :goto_2

    :cond_81
    const/4 v3, 0x5

    goto :goto_3

    :sswitch_81
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_82

    goto :goto_2

    :cond_82
    const/4 v3, 0x4

    goto :goto_3

    :sswitch_82
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_83

    goto :goto_2

    :cond_83
    const/4 v3, 0x3

    goto :goto_3

    :sswitch_83
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_84

    goto :goto_2

    :cond_84
    const/4 v3, 0x2

    goto :goto_3

    :sswitch_84
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_85

    goto :goto_2

    :cond_85
    const/4 v3, 0x1

    goto :goto_3

    :sswitch_85
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_86

    goto :goto_2

    :cond_86
    const/4 v3, 0x0

    goto :goto_3

    :goto_2
    const/4 v3, -0x1

    :goto_3
    const-string v4, "access"

    const-string v5, "axml"

    const-string v6, "results"

    const-string v7, "path"

    const-string v8, "deleted"

    const-string v9, "editSessionId"

    const-string v10, "type"

    const-string v11, "locator"

    const-string v12, "changed"

    move-object/from16 p1, v4

    move-object v15, v5

    const-wide/16 v4, 0x0

    packed-switch v3, :pswitch_data_1

    goto/16 :goto_16

    :pswitch_1
    const v0, 0x7f120629

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    .line 683
    invoke-virtual {v14, v0, v3}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto/16 :goto_16

    :pswitch_2
    const/4 v0, 0x0

    const-string v3, "buildCheckStatus"

    .line 756
    invoke-static {v2, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "passed"

    .line 652
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_87

    const v3, 0x7f12060c

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v14, v3, v0}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto/16 :goto_16

    :cond_87
    const v3, 0x7f12060b

    new-array v6, v0, [Ljava/lang/Object;

    .line 654
    invoke-virtual {v14, v3, v6}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    const-string v3, "pendingCompileCount"

    .line 655
    invoke-static {v2, v3, v4, v5}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Object;

    aput-object v3, v7, v0

    const v3, 0x7f1206a3

    invoke-virtual {v14, v3, v7}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    const-string v3, "failedCount"

    .line 656
    invoke-static {v2, v3, v4, v5}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v3, v4, v0

    const v0, 0x7f1206a7

    invoke-virtual {v14, v0, v4}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto/16 :goto_16

    :pswitch_3
    const/4 v0, 0x0

    const/4 v3, 0x1

    const-string v6, "matchedLines"

    .line 623
    invoke-static {v2, v6}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v6

    invoke-virtual {v6}, Lbin/mt/json/JSONArray;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v6, v3, v0

    const v0, 0x7f12068f

    invoke-virtual {v14, v0, v3}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    const-string v0, "blocks"

    .line 624
    invoke-static {v2, v0}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v3, 0x0

    .line 625
    :goto_4
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v6

    const/4 v7, 0x3

    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-ge v3, v6, :cond_89

    .line 626
    invoke-static {v0, v3}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "startLine"

    .line 628
    invoke-static {v6, v7, v4, v5}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v7

    const-wide/16 v9, 0x1

    add-long/2addr v7, v9

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v7, v8, v9

    const v7, 0x7f120616

    invoke-virtual {v14, v7, v8}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    const-string v7, "text"

    .line 629
    invoke-virtual {v6, v7}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v6

    if-eqz v6, :cond_88

    .line 630
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v7

    if-eqz v7, :cond_88

    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;)V

    :cond_88
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_89
    const-string v0, "stopReason"

    .line 756
    invoke-static {v2, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "eof"

    .line 633
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8a

    const v0, 0x7f1206c0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v14, v0, v3}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto/16 :goto_16

    :cond_8a
    const/4 v3, 0x0

    const-string v4, "resource_limit"

    .line 634
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_ad

    const-string v4, "decode_error"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_ad

    const v0, 0x7f120699

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v14, v0, v3}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto/16 :goto_16

    :pswitch_4
    const v0, 0x7f12067a

    .line 549
    invoke-virtual {v14, v0, v2, v9}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    .line 551
    :pswitch_5
    invoke-static {v2, v8}, Ll/ۜᩴۚ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8b

    const v0, 0x7f12069c

    goto :goto_5

    :cond_8b
    const v0, 0x7f1206cc

    :goto_5
    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v14, v0, v3}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto/16 :goto_16

    :pswitch_6
    const-string v3, "deletedResourceCount"

    const v6, 0x7f1206ba

    .line 566
    invoke-static {v14, v2, v3, v6}, Ll/ۖᩴۚ;->ۙ(Ll/ۖᩴۚ;Lbin/mt/json/JSONObject;Ljava/lang/String;I)V

    const-string v3, "deletes"

    .line 567
    invoke-static {v0, v3}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONArray;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "type_variant"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "deletedValueCount"

    const-string v6, "deletedTypeVariantCount"

    if-eqz v0, :cond_8c

    .line 569
    invoke-static {v2, v6, v4, v5}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v2, v3, v4, v5}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v3, v4, v0

    const v0, 0x7f1206b3

    .line 568
    invoke-virtual {v14, v0, v4}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto/16 :goto_16

    :cond_8c
    const v0, 0x7f1206b8

    .line 571
    invoke-static {v14, v2, v3, v0}, Ll/ۖᩴۚ;->ۙ(Ll/ۖᩴۚ;Lbin/mt/json/JSONObject;Ljava/lang/String;I)V

    const v0, 0x7f1206b7

    .line 572
    invoke-static {v14, v2, v6, v0}, Ll/ۖᩴۚ;->ۙ(Ll/ۖᩴۚ;Lbin/mt/json/JSONObject;Ljava/lang/String;I)V

    goto/16 :goto_16

    :pswitch_7
    const-string v0, "status"

    .line 756
    invoke-static {v2, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 528
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_2

    goto :goto_6

    :sswitch_86
    const-string v3, "installed"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8d

    goto :goto_6

    :cond_8d
    const/4 v15, 0x3

    goto :goto_7

    :sswitch_87
    const-string v3, "failed"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8e

    goto :goto_6

    :cond_8e
    const/4 v15, 0x2

    goto :goto_7

    :sswitch_88
    const-string v3, "started"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8f

    goto :goto_6

    :cond_8f
    const/4 v15, 0x1

    goto :goto_7

    :sswitch_89
    const-string v3, "user_action_required"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_90

    goto :goto_6

    :cond_90
    const/4 v15, 0x0

    goto :goto_7

    :goto_6
    const/4 v15, -0x1

    :goto_7
    packed-switch v15, :pswitch_data_2

    const v3, 0x7f1206d1

    goto :goto_8

    :pswitch_8
    const v3, 0x7f120633

    goto :goto_8

    :pswitch_9
    const v3, 0x7f120632

    goto :goto_8

    :pswitch_a
    const v3, 0x7f120634

    goto :goto_8

    :pswitch_b
    const v3, 0x7f120631

    :goto_8
    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v14, v3, v4}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    const-string v3, "failed"

    .line 536
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_91

    const-string v3, "message"

    .line 756
    invoke-static {v2, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 536
    invoke-virtual {v14, v3}, Ll/ۖᩴۚ;->᩷(Ljava/lang/String;)V

    :cond_91
    const-string v3, "started"

    .line 538
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_ad

    const v0, 0x7f120630

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v14, v0, v3}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto/16 :goto_16

    :pswitch_c
    const/4 v0, 0x0

    const-string v3, "completedFiles"

    .line 687
    invoke-static {v2, v3, v4, v5}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v0

    const v0, 0x7f120626

    invoke-virtual {v14, v0, v4}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    const-string v0, "createdDirectories"

    const v3, 0x7f120647

    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_d
    const-string v0, "observedGraphSummary"

    .line 647
    invoke-static {v2, v0}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "blockCount"

    invoke-static {v0, v3, v4, v5}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v6, "edgeCount"

    invoke-static {v0, v6, v4, v5}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object v0, v4, v3

    const v0, 0x7f12062c

    invoke-virtual {v14, v0, v4}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    const-string v0, "function"

    .line 648
    invoke-static {v2, v0}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "startVirtualAddress"

    const v4, 0x7f12064a

    invoke-virtual {v14, v4, v0, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    .line 688
    :pswitch_e
    invoke-static {v2, v12}, Ll/ۜᩴۚ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_92

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const v3, 0x7f12069c

    invoke-virtual {v14, v3, v0}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    :cond_92
    const v0, 0x7f120662

    invoke-virtual {v14, v0, v2, v7}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->᩸(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    :pswitch_f
    const-string v0, "workspaceId"

    const v3, 0x7f12068a

    .line 543
    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "appLabel"

    const v3, 0x7f12063c

    .line 544
    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "packageName"

    const v3, 0x7f120664

    .line 545
    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "installedApp"

    .line 546
    invoke-static {v2, v0}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "splitCount"

    invoke-static {v0, v3, v4, v5}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v6

    cmp-long v0, v6, v4

    if-lez v0, :cond_ad

    .line 547
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f120605

    invoke-virtual {v14, v0, v3}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto/16 :goto_16

    .line 564
    :pswitch_10
    invoke-virtual {v14, v0, v2}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    invoke-static {v2, v6}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v14, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONArray;)V

    goto/16 :goto_16

    :pswitch_11
    const-string v0, "appType"

    .line 756
    invoke-static {v2, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 612
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_93

    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->ܳ(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    :cond_93
    const-string v0, "textWindow"

    .line 613
    invoke-static {v2, v0}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lbin/mt/json/JSONObject;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_95

    const-string v0, "style"

    .line 756
    invoke-static {v2, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "readable"

    .line 615
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_94

    const-string v3, "instruction"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_94

    .line 756
    invoke-static {v2, v11}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 616
    invoke-static {v0}, Ll/ۜᩴۚ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v3, v15

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_94

    const/4 v0, 0x1

    goto :goto_9

    :cond_94
    const/4 v0, 0x0

    .line 615
    :goto_9
    invoke-virtual {v14, v2, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Z)V

    goto/16 :goto_16

    :cond_95
    const-string v0, "byteWindow"

    .line 618
    invoke-static {v2, v0}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lbin/mt/json/JSONObject;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_96

    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->ۤ(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    :cond_96
    const-string v0, "fields"

    .line 619
    invoke-virtual {v2, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_97

    const-string v0, "methods"

    invoke-virtual {v2, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_97

    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->۫(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    .line 620
    :cond_97
    sget-object v0, Ll/۠ᩴۚ;->ܿ:Ll/۠ᩴۚ;

    invoke-virtual {v14, v2, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ll/۠ᩴۚ;)V

    goto/16 :goto_16

    .line 756
    :pswitch_12
    invoke-static {v2, v10}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "arch"

    invoke-static {v2, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, " \u00b7 "

    .line 638
    invoke-static {v0, v4, v3}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ll/ۖᩴۚ;->᩷(Ljava/lang/String;)V

    const-string v0, "archBits"

    const v3, 0x7f120641

    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "counts"

    .line 639
    invoke-static {v2, v0}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "symbols"

    const v5, 0x7f120682

    invoke-virtual {v14, v5, v3, v4}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    invoke-static {v2, v0}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "sections"

    const v4, 0x7f120679

    invoke-virtual {v14, v4, v0, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    .line 608
    :pswitch_13
    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->ܳ(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    :pswitch_14
    const v0, 0x7f120686

    .line 678
    invoke-virtual {v14, v0, v2, v10}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->᩸(Lbin/mt/json/JSONObject;)V

    const v0, 0x7f120637

    move-object/from16 v3, p1

    invoke-virtual {v14, v0, v2, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    .line 680
    :pswitch_15
    invoke-static {v2, v12}, Ll/ۜᩴۚ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_98

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const v3, 0x7f12069c

    invoke-virtual {v14, v3, v0}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    :cond_98
    const-string v0, "destinationPath"

    const v3, 0x7f120646

    .line 681
    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "localPath"

    const v3, 0x7f12065b

    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->᩸(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    :pswitch_16
    const-string v0, "checkedEntries"

    .line 686
    invoke-static {v2, v0, v4, v5}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f12075b

    invoke-virtual {v14, v0, v3}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto/16 :goto_16

    :pswitch_17
    const-string v3, "simple"

    .line 607
    invoke-static {v0, v3}, Ll/ۜᩴۚ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_99

    sget-object v0, Ll/۠ᩴۚ;->ܿ:Ll/۠ᩴۚ;

    goto :goto_a

    :cond_99
    sget-object v0, Ll/۠ᩴۚ;->֡:Ll/۠ᩴۚ;

    :goto_a
    invoke-virtual {v14, v2, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ll/۠ᩴۚ;)V

    goto/16 :goto_16

    .line 636
    :pswitch_18
    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->۫(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    .line 550
    :pswitch_19
    invoke-static {v2, v8}, Ll/ۜᩴۚ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9a

    const v0, 0x7f12069c

    goto :goto_b

    :cond_9a
    const v0, 0x7f120758

    :goto_b
    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v14, v0, v3}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto/16 :goto_16

    .line 604
    :pswitch_1a
    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->ۤ(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    :pswitch_1b
    move-object v3, v15

    .line 756
    invoke-static {v0, v11}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 601
    invoke-static {v0}, Ll/ۜᩴۚ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {v14, v2, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Z)V

    goto/16 :goto_16

    :pswitch_1c
    const/4 v0, 0x1

    .line 602
    invoke-virtual {v14, v2, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Z)V

    goto/16 :goto_16

    .line 560
    :pswitch_1d
    invoke-static {v2, v12}, Ll/ۜᩴۚ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9b

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const v3, 0x7f12069c

    invoke-virtual {v14, v3, v0}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    :cond_9b
    const-string v0, "replacements"

    const v3, 0x7f120672

    .line 561
    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->᩸(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    :pswitch_1e
    const-string v0, "found"

    .line 642
    invoke-static {v2, v0}, Ll/ۜᩴۚ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9c

    const v0, 0x7f12074d

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v14, v0, v3}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto/16 :goto_16

    :cond_9c
    const-string v0, "mapping"

    .line 643
    invoke-static {v2, v0}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "fileOffset"

    const v4, 0x7f120650

    invoke-virtual {v14, v4, v0, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v3, "sectionName"

    const v4, 0x7f120678

    invoke-virtual {v14, v4, v0, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v3, "isLoaded"

    const v4, 0x7f12065a

    invoke-virtual {v14, v4, v0, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v3, "isExecutable"

    const v4, 0x7f12064b

    invoke-virtual {v14, v4, v0, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_1f
    const/4 v0, 0x0

    .line 603
    invoke-virtual {v14, v2, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Z)V

    goto/16 :goto_16

    :pswitch_20
    const-string v0, "outputPath"

    const v3, 0x7f120662

    .line 552
    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->᩸(Lbin/mt/json/JSONObject;)V

    const-string v0, "signingPerformed"

    const v3, 0x7f12067d

    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    .line 756
    :pswitch_21
    invoke-static {v2, v9}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 555
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    const v4, 0x7f1206c3

    if-eqz v3, :cond_9d

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v14, v4, v0}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto :goto_c

    .line 556
    :cond_9d
    invoke-virtual {v14, v4, v0}, Ll/ۖᩴۚ;->᩷(ILjava/lang/String;)V

    :goto_c
    const v0, 0x7f120683

    .line 557
    invoke-virtual {v14, v0, v2, v11}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_22
    const/4 v0, 0x0

    .line 577
    invoke-static {v2, v12}, Ll/ۜᩴۚ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9e

    new-array v0, v0, [Ljava/lang/Object;

    const v3, 0x7f12069c

    invoke-virtual {v14, v3, v0}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto :goto_d

    :cond_9e
    const-string v3, "bytesPatched"

    .line 578
    invoke-static {v2, v3, v4, v5}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v0

    const v0, 0x7f120608

    invoke-virtual {v14, v0, v4}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    :goto_d
    const-string v0, "beforeHex"

    const v3, 0x7f12064c

    .line 579
    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "afterHex"

    const v3, 0x7f120670

    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_23
    const v0, 0x7f120621

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    .line 685
    invoke-virtual {v14, v0, v3}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    const-string v0, "deletedFiles"

    const v3, 0x7f120651

    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "deletedDirectories"

    const v3, 0x7f120647

    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_24
    const-string v0, "signature"

    .line 660
    invoke-static {v2, v0}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "available"

    .line 662
    invoke-static {v0, v3}, Ll/ۜᩴۚ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_9f

    const v3, 0x7f1206c5

    goto :goto_e

    :cond_9f
    const-string v3, "signaturePresent"

    .line 663
    invoke-static {v0, v3}, Ll/ۜᩴۚ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a0

    const v3, 0x7f1206c4

    goto :goto_e

    :cond_a0
    const v3, 0x7f12074e

    :goto_e
    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 662
    invoke-virtual {v14, v3, v4}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    const-string v3, "schemes"

    .line 664
    invoke-static {v0, v3}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    const v4, 0x7f120676

    invoke-virtual {v14, v3, v4}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)V

    const-string v3, "certificates"

    .line 665
    invoke-static {v0, v3}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v3, 0x0

    .line 666
    :goto_f
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    const/4 v5, 0x3

    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-ge v3, v4, :cond_ad

    invoke-static {v0, v3}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "subject"

    const v6, 0x7f120681

    invoke-virtual {v14, v6, v4, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v5, "sha256"

    const v6, 0x7f12067b

    invoke-virtual {v14, v6, v4, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :pswitch_25
    const-string v0, "instructionCount"

    const v3, 0x7f120656

    .line 645
    invoke-virtual {v14, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "disassemblyText"

    invoke-virtual {v2, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_a1

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_a1

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;)V

    :cond_a1
    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->ۚ(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    .line 582
    :pswitch_26
    invoke-static {v2, v6}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const v3, 0x7f120636

    invoke-virtual {v14, v3, v4}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    const/4 v3, 0x0

    .line 583
    :goto_10
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    const/4 v5, 0x3

    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-ge v3, v4, :cond_a9

    .line 584
    invoke-static {v0, v3}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, ""

    .line 585
    invoke-virtual {v14, v5}, Ll/ۖᩴۚ;->ۤ(Ljava/lang/String;)V

    const-string v5, "name"

    .line 756
    invoke-static {v4, v5}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 587
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_a2

    .line 756
    invoke-static {v4, v11}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 587
    invoke-static {v5}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_11

    .line 756
    :cond_a2
    invoke-static {v4, v10}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/"

    .line 587
    invoke-static {v6, v7, v5}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 588
    :goto_11
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_a3

    const v6, 0x7f120674

    invoke-virtual {v14, v6, v5}, Ll/ۖᩴۚ;->᩷(ILjava/lang/String;)V

    :cond_a3
    const-string v5, "variant"

    const v6, 0x7f120689

    .line 589
    invoke-virtual {v14, v6, v4, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v5, "errorCode"

    .line 756
    invoke-static {v4, v5}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 590
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_a4

    const/4 v5, 0x0

    .line 695
    invoke-static {v5, v4, v1}, Ll/ۜᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 590
    invoke-virtual {v14, v4}, Ll/ۖᩴۚ;->᩷(Ljava/lang/String;)V

    goto :goto_13

    :cond_a4
    const-string v5, "valueXml"

    .line 592
    invoke-virtual {v4, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "value"

    invoke-virtual {v4, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v6

    if-eqz v5, :cond_a5

    .line 593
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v7

    if-eqz v7, :cond_a5

    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;)V

    goto :goto_12

    :cond_a5
    if-eqz v6, :cond_a6

    .line 594
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-eqz v5, :cond_a6

    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;)V

    goto :goto_12

    :cond_a6
    const-string v5, "items"

    .line 595
    invoke-static {v4, v5}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v5

    invoke-virtual {v14, v5}, Ll/ۖᩴۚ;->᩷(Lbin/mt/json/JSONArray;)V

    :goto_12
    const-string v5, "valueTruncated"

    .line 596
    invoke-static {v4, v5}, Ll/ۜᩴۚ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_a7

    const-string v5, "valueXmlTruncated"

    invoke-static {v4, v5}, Ll/ۜᩴۚ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_a7

    const-string v5, "itemsTruncated"

    invoke-static {v4, v5}, Ll/ۜᩴۚ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a8

    :cond_a7
    invoke-virtual {v14}, Ll/ۖᩴۚ;->ۙ()V

    :cond_a8
    :goto_13
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_10

    .line 599
    :cond_a9
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    invoke-virtual {v14, v0}, Ll/ۖᩴۚ;->ۙ(I)V

    goto/16 :goto_16

    .line 563
    :pswitch_27
    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->֫(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    .line 541
    :pswitch_28
    invoke-virtual {v14, v2, v1}, Ll/ۖᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    .line 605
    :pswitch_29
    sget-object v0, Ll/۠ᩴۚ;->᩶:Ll/۠ᩴۚ;

    invoke-virtual {v14, v2, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ll/۠ᩴۚ;)V

    goto/16 :goto_16

    .line 575
    :pswitch_2a
    invoke-virtual {v14, v2}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;)V

    goto :goto_16

    .line 609
    :pswitch_2b
    sget-object v0, Ll/۠ᩴۚ;->ܿ:Ll/۠ᩴۚ;

    invoke-virtual {v14, v2, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ll/۠ᩴۚ;)V

    goto :goto_16

    :pswitch_2c
    move-object/from16 v3, p1

    const-string v0, "homePath"

    const v4, 0x7f120654

    .line 669
    invoke-virtual {v14, v4, v2, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "rules"

    invoke-static {v2, v0}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v4, 0x0

    .line 670
    :goto_14
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v5

    const/4 v6, 0x3

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    if-ge v4, v5, :cond_ab

    .line 671
    invoke-static {v0, v4}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 756
    invoke-static {v5, v7}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 672
    invoke-static {v8}, Ll/ۜᩴۚ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, ": "

    invoke-static {v6, v9, v8}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "active"

    .line 674
    invoke-static {v5, v8}, Ll/ۜᩴۚ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_aa

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v6, v5, v8

    const v6, 0x7f12062d

    .line 770
    invoke-static {v6, v5}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 674
    :cond_aa
    invoke-virtual {v14, v6}, Ll/ۖᩴۚ;->᩷(Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_14

    .line 676
    :cond_ab
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    invoke-virtual {v14, v0}, Ll/ۖᩴۚ;->ۙ(I)V

    goto :goto_16

    .line 684
    :pswitch_2d
    invoke-static {v2, v12}, Ll/ۜᩴۚ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_ac

    const v0, 0x7f12069c

    goto :goto_15

    :cond_ac
    const v0, 0x7f120620

    :goto_15
    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v14, v0, v3}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    .line 690
    :cond_ad
    :goto_16
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_ae

    const-string v0, "warnings"

    invoke-static {v2, v0}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v14, v0}, Ll/ۖᩴۚ;->ۤ(Lbin/mt/json/JSONArray;)V

    .line 691
    :cond_ae
    invoke-virtual {v14}, Ll/ۖᩴۚ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x7e92354b -> :sswitch_42
        -0x7586fb27 -> :sswitch_41
        -0x708c653d -> :sswitch_40
        -0x6efc3562 -> :sswitch_3f
        -0x6eb24e87 -> :sswitch_3e
        -0x6ce74ccd -> :sswitch_3d
        -0x691d7bdd -> :sswitch_3c
        -0x62325de0 -> :sswitch_3b
        -0x622f1b4c -> :sswitch_3a
        -0x622c7254 -> :sswitch_39
        -0x622986cf -> :sswitch_38
        -0x56ef032d -> :sswitch_37
        -0x5048ed36 -> :sswitch_36
        -0x4bfaac96 -> :sswitch_35
        -0x46081f5c -> :sswitch_34
        -0x437e75f4 -> :sswitch_33
        -0x3fc9a0f7 -> :sswitch_32
        -0x3b2e48b9 -> :sswitch_31
        -0x3a8b17f8 -> :sswitch_30
        -0x3615fe0d -> :sswitch_2f
        -0x354cbe2b -> :sswitch_2e
        -0x1bdc226f -> :sswitch_2d
        -0x1b948b7c -> :sswitch_2c
        -0x1264db97 -> :sswitch_2b
        -0x11d77729 -> :sswitch_2a
        -0x10eb4200 -> :sswitch_29
        -0xe52dcc5 -> :sswitch_28
        -0xd719e08 -> :sswitch_27
        -0xd59fc10 -> :sswitch_26
        -0xc57b6a0 -> :sswitch_25
        -0x1549bf8 -> :sswitch_24
        0xeee9523 -> :sswitch_23
        0x12ea31d5 -> :sswitch_22
        0x14566e94 -> :sswitch_21
        0x145a0288 -> :sswitch_20
        0x1708e3c0 -> :sswitch_1f
        0x170ce4e9 -> :sswitch_1e
        0x170d701c -> :sswitch_1d
        0x17103a9f -> :sswitch_1c
        0x185f2a13 -> :sswitch_1b
        0x1b03f4cb -> :sswitch_1a
        0x1b8f0087 -> :sswitch_19
        0x1e1ac49d -> :sswitch_18
        0x20003c07 -> :sswitch_17
        0x2a318702 -> :sswitch_16
        0x2a9b1ec3 -> :sswitch_15
        0x2de3dedd -> :sswitch_14
        0x2e6169cb -> :sswitch_13
        0x3a56fc23 -> :sswitch_12
        0x3a5871cf -> :sswitch_11
        0x3c4740db -> :sswitch_10
        0x3f5cace2 -> :sswitch_f
        0x4302a41d -> :sswitch_e
        0x4486048d -> :sswitch_d
        0x4991b972 -> :sswitch_c
        0x4e5357d0 -> :sswitch_b
        0x555c7051 -> :sswitch_a
        0x5d89d2cb -> :sswitch_9
        0x5e5b93e0 -> :sswitch_8
        0x5f480c41 -> :sswitch_7
        0x60f2292a -> :sswitch_6
        0x61eb10e0 -> :sswitch_5
        0x682c513f -> :sswitch_4
        0x6bd752b9 -> :sswitch_3
        0x6e7ee8a4 -> :sswitch_2
        0x73b4424d -> :sswitch_1
        0x7984d336 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7e92354b -> :sswitch_85
        -0x7586fb27 -> :sswitch_84
        -0x708c653d -> :sswitch_83
        -0x6efc3562 -> :sswitch_82
        -0x6eb24e87 -> :sswitch_81
        -0x6ce74ccd -> :sswitch_80
        -0x691d7bdd -> :sswitch_7f
        -0x62325de0 -> :sswitch_7e
        -0x622f1b4c -> :sswitch_7d
        -0x622c7254 -> :sswitch_7c
        -0x622986cf -> :sswitch_7b
        -0x56ef032d -> :sswitch_7a
        -0x5048ed36 -> :sswitch_79
        -0x4bfaac96 -> :sswitch_78
        -0x46081f5c -> :sswitch_77
        -0x437e75f4 -> :sswitch_76
        -0x3fc9a0f7 -> :sswitch_75
        -0x3b2e48b9 -> :sswitch_74
        -0x3a8b17f8 -> :sswitch_73
        -0x3615fe0d -> :sswitch_72
        -0x354cbe2b -> :sswitch_71
        -0x1bdc226f -> :sswitch_70
        -0x1b948b7c -> :sswitch_6f
        -0x1264db97 -> :sswitch_6e
        -0x11d77729 -> :sswitch_6d
        -0x10eb4200 -> :sswitch_6c
        -0xe52dcc5 -> :sswitch_6b
        -0xd719e08 -> :sswitch_6a
        -0xd59fc10 -> :sswitch_69
        -0xc57b6a0 -> :sswitch_68
        -0x1549bf8 -> :sswitch_67
        0xeee9523 -> :sswitch_66
        0x12ea31d5 -> :sswitch_65
        0x14566e94 -> :sswitch_64
        0x145a0288 -> :sswitch_63
        0x1708e3c0 -> :sswitch_62
        0x170ce4e9 -> :sswitch_61
        0x170d701c -> :sswitch_60
        0x17103a9f -> :sswitch_5f
        0x185f2a13 -> :sswitch_5e
        0x1b03f4cb -> :sswitch_5d
        0x1b8f0087 -> :sswitch_5c
        0x1e1ac49d -> :sswitch_5b
        0x20003c07 -> :sswitch_5a
        0x2a318702 -> :sswitch_59
        0x2a9b1ec3 -> :sswitch_58
        0x2de3dedd -> :sswitch_57
        0x2e6169cb -> :sswitch_56
        0x3a56fc23 -> :sswitch_55
        0x3a5871cf -> :sswitch_54
        0x3c4740db -> :sswitch_53
        0x3f5cace2 -> :sswitch_52
        0x4302a41d -> :sswitch_51
        0x4486048d -> :sswitch_50
        0x4991b972 -> :sswitch_4f
        0x4e5357d0 -> :sswitch_4e
        0x555c7051 -> :sswitch_4d
        0x5d89d2cb -> :sswitch_4c
        0x5e5b93e0 -> :sswitch_4b
        0x5f480c41 -> :sswitch_4a
        0x60f2292a -> :sswitch_49
        0x61eb10e0 -> :sswitch_48
        0x682c513f -> :sswitch_47
        0x6bd752b9 -> :sswitch_46
        0x6e7ee8a4 -> :sswitch_45
        0x73b4424d -> :sswitch_44
        0x7984d336 -> :sswitch_43
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_2b
        :pswitch_26
        :pswitch_2b
        :pswitch_25
        :pswitch_2b
        :pswitch_24
        :pswitch_23
        :pswitch_2b
        :pswitch_22
        :pswitch_21
        :pswitch_2b
        :pswitch_20
        :pswitch_22
        :pswitch_1f
        :pswitch_1e
        :pswitch_22
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_1d
        :pswitch_2b
        :pswitch_1d
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_29
        :pswitch_15
        :pswitch_14
        :pswitch_2b
        :pswitch_1c
        :pswitch_1d
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_15
        :pswitch_1d
        :pswitch_10
        :pswitch_2b
        :pswitch_f
        :pswitch_28
        :pswitch_28
        :pswitch_1a
        :pswitch_1a
        :pswitch_e
        :pswitch_d
        :pswitch_1d
        :pswitch_c
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_e
        :pswitch_3
        :pswitch_2
        :pswitch_28
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x7c5838ec -> :sswitch_89
        -0x7114bf7f -> :sswitch_88
        -0x4c696bc3 -> :sswitch_87
        0x1bb377a -> :sswitch_86
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "data"

    .line 220
    invoke-static {p0, v0}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "mt_file_transfer_"

    .line 221
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x200

    if-eqz v0, :cond_1

    const-string v0, "path"

    .line 752
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 753
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x2f

    const/4 v3, 0x1

    .line 0
    invoke-static {v2, v3, v0}, Ll/ܿۘۙ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 223
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1, v0}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v0, "mt_apk_resource_read"

    .line 225
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, " \u00b7 "

    if-eqz v0, :cond_2

    const-string v0, "results"

    .line 226
    invoke-static {p0, v0}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v0, v3}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "type"

    .line 756
    invoke-static {v0, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "name"

    invoke-static {v0, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "/"

    .line 227
    invoke-static {v3, v5, v4}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 228
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    const-string p0, "variant"

    .line 756
    invoke-static {v0, p0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 228
    invoke-static {p0}, Ll/ۜᩴۚ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, v2, p0}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-string v0, "mt_apk_continue"

    .line 230
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    const-string p1, "appType"

    .line 756
    invoke-static {p0, p1}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 231
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    const-string p2, "query"

    .line 756
    invoke-static {p0, p2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 241
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 756
    invoke-static {p0, p1}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 241
    invoke-static {p0}, Ll/ۜᩴۚ;->᩸(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    return-object p2

    :cond_4
    const-string p1, "locator"

    .line 756
    invoke-static {p0, p1}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 232
    invoke-static {p1}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 233
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    const-string p2, "itemKind"

    .line 756
    invoke-static {p0, p2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 233
    invoke-static {p0}, Ll/ۜᩴۚ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, v2, p0}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    const-string p1, "prefix"

    .line 756
    invoke-static {p0, p1}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 234
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 756
    invoke-static {p0, p1}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    return-object p2
.end method

.method public static bridge synthetic ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۜᩴۚ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, " \u00b7 "

    .line 812
    invoke-static {p1}, Ll/ۜᩴۚ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0x200

    invoke-static {p1, p0}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۚ(Lbin/mt/json/JSONObject;Ljava/lang/String;)I
    .locals 3

    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "mt_zip_update"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "mt_apk_resource_delete"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "mt_zip_extract"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "mt_zip_create"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_4
    const-string v0, "mt_apk_resource_add"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_5
    const-string v0, "mt_file_edit_text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_6
    const-string v0, "mt_apk_edit_text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_7
    const-string v0, "mt_file_patch_bytes"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_8
    const-string v0, "mt_apk_resource_read"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_9
    const-string v0, "mt_apk_resource_edit"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_a
    const-string v0, "mt_apk_patch_bytes"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_0

    :cond_a
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    const-string p1, ""

    goto :goto_1

    :pswitch_0
    const-string p1, "operations"

    goto :goto_1

    :pswitch_1
    const-string p1, "deletes"

    goto :goto_1

    :pswitch_2
    const-string p1, "entries"

    goto :goto_1

    :pswitch_3
    const-string p1, "sources"

    goto :goto_1

    :pswitch_4
    const-string p1, "adds"

    goto :goto_1

    :pswitch_5
    const-string p1, "reads"

    goto :goto_1

    :pswitch_6
    const-string p1, "edits"

    goto :goto_1

    :pswitch_7
    const-string p1, "patches"

    .line 160
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    return v1

    :cond_b
    invoke-static {p0}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-static {p0, p1}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result p0

    return p0

    :sswitch_data_0
    .sparse-switch
        -0x6eb24e87 -> :sswitch_a
        -0x62325de0 -> :sswitch_9
        -0x622c7254 -> :sswitch_8
        -0x3fc9a0f7 -> :sswitch_7
        -0x3b2e48b9 -> :sswitch_6
        -0x11d77729 -> :sswitch_5
        0x2e6169cb -> :sswitch_4
        0x4991b972 -> :sswitch_3
        0x5d89d2cb -> :sswitch_2
        0x5f480c41 -> :sswitch_1
        0x682c513f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۤ(Lbin/mt/json/JSONObject;)Ljava/lang/String;
    .locals 3

    const-string v0, "kind"

    .line 756
    invoke-static {p0, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "type_variant"

    .line 817
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "packageId"

    .line 756
    invoke-static {p0, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "typeId"

    invoke-static {p0, v1}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "/"

    .line 818
    invoke-static {v0, v2, v1}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "locator"

    .line 756
    invoke-static {p0, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 819
    invoke-static {v0}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v1, "variant"

    .line 756
    invoke-static {p0, v1}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 820
    invoke-static {p0}, Ll/ۜᩴۚ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, " \u00b7 "

    invoke-static {v0, v1, p0}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۤ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 824
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "file_offset"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x22

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "default"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x21

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "replace_match"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x20

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "sections"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0x1f

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "zip_entries"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v2, 0x1e

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "virtual"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v2, 0x1d

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "resource_table"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v2, 0x1c

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "variant"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v2, 0x1b

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "literal"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v2, 0x1a

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "regex"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v2, 0x19

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "first"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v2, 0x18

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "exact"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v2, 0x17

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "insert_before_match"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v2, 0x16

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "none"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v2, 0x15

    goto/16 :goto_0

    :sswitch_e
    const-string v0, "file"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v2, 0x14

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "deny"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v2, 0x13

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "data"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v2, 0x12

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "code"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v2, 0x11

    goto/16 :goto_0

    :sswitch_12
    const-string v0, "both"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v2, 0x10

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "auto"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v2, 0xf

    goto/16 :goto_0

    :sswitch_14
    const-string v0, "all"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v2, 0xe

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "add"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v2, 0xd

    goto/16 :goto_0

    :sswitch_16
    const-string v0, "read_write"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v2, 0xc

    goto/16 :goto_0

    :sswitch_17
    const-string v0, "resource"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v2, 0xb

    goto/16 :goto_0

    :sswitch_18
    const-string v0, "contains"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_19
    const-string v0, "resource_table_variants"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_1a
    const-string v0, "type_variant"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_1b
    const-string v0, "dex_classes"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_0

    :cond_1b
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_1c
    const-string v0, "rename"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_0

    :cond_1c
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_1d
    const-string v0, "directory"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_0

    :cond_1d
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_1e
    const-string v0, "read_only"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_0

    :cond_1e
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_1f
    const-string v0, "insert_after_match"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_0

    :cond_1f
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_20
    const-string v0, "delete"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_0

    :cond_20
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_21
    const-string v0, "write_target"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_0

    :cond_21
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_22
    const-string v0, "symbols"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto :goto_0

    :cond_22
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    const/4 v0, 0x0

    goto/16 :goto_1

    :pswitch_0
    const v0, 0x7f12062a

    goto/16 :goto_1

    :pswitch_1
    const v0, 0x7f120618

    goto/16 :goto_1

    :pswitch_2
    const v0, 0x7f1206ac

    goto/16 :goto_1

    :pswitch_3
    const v0, 0x7f120679

    goto/16 :goto_1

    :pswitch_4
    const v0, 0x7f12075c

    goto/16 :goto_1

    :pswitch_5
    const v0, 0x7f12074f

    goto/16 :goto_1

    :pswitch_6
    const v0, 0x7f1206b4

    goto/16 :goto_1

    :pswitch_7
    const v0, 0x7f120689

    goto/16 :goto_1

    :pswitch_8
    const v0, 0x7f12068e

    goto/16 :goto_1

    :pswitch_9
    const v0, 0x7f1206a8

    goto/16 :goto_1

    :pswitch_a
    const v0, 0x7f1206ab

    goto/16 :goto_1

    :pswitch_b
    const v0, 0x7f120625

    goto/16 :goto_1

    :pswitch_c
    const v0, 0x7f12062f

    goto/16 :goto_1

    :pswitch_d
    const v0, 0x7f12069e

    goto :goto_1

    :pswitch_e
    const v0, 0x7f120628

    goto :goto_1

    :pswitch_f
    const v0, 0x7f1205c8

    goto :goto_1

    :pswitch_10
    const v0, 0x7f120617

    goto :goto_1

    :pswitch_11
    const v0, 0x7f12060f

    goto :goto_1

    :pswitch_12
    const v0, 0x7f120610

    goto :goto_1

    :pswitch_13
    const v0, 0x7f120604

    goto :goto_1

    :pswitch_14
    const v0, 0x7f1206aa

    goto :goto_1

    :pswitch_15
    const v0, 0x7f1205f8

    goto :goto_1

    :pswitch_16
    const v0, 0x7f1206a6

    goto :goto_1

    :pswitch_17
    const v0, 0x7f120674

    goto :goto_1

    :pswitch_18
    const v0, 0x7f120614

    goto :goto_1

    :pswitch_19
    const v0, 0x7f1206b5

    goto :goto_1

    :pswitch_1a
    const v0, 0x7f1206af

    goto :goto_1

    :pswitch_1b
    const v0, 0x7f12061c

    goto :goto_1

    :pswitch_1c
    const v0, 0x7f1206a9

    goto :goto_1

    :pswitch_1d
    const v0, 0x7f12061f

    goto :goto_1

    :pswitch_1e
    const v0, 0x7f1206a5

    goto :goto_1

    :pswitch_1f
    const v0, 0x7f12062e

    goto :goto_1

    :pswitch_20
    const v0, 0x7f12061a

    goto :goto_1

    :pswitch_21
    const v0, 0x7f120759

    goto :goto_1

    :pswitch_22
    const v0, 0x7f120682

    :goto_1
    if-nez v0, :cond_23

    return-object p0

    :cond_23
    new-array p0, v1, [Ljava/lang/Object;

    .line 770
    invoke-static {v0, p0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x67eac225 -> :sswitch_22
        -0x54adb20f -> :sswitch_21
        -0x4f997a55 -> :sswitch_20
        -0x4a71bee4 -> :sswitch_1f
        -0x425ff34b -> :sswitch_1e
        -0x395fe193 -> :sswitch_1d
        -0x37b4c8c2 -> :sswitch_1c
        -0x362ba402 -> :sswitch_1b
        -0x299a9380 -> :sswitch_1a
        -0x244055d0 -> :sswitch_19
        -0x21d289e1 -> :sswitch_18
        -0x14543bf2 -> :sswitch_17
        -0x92bf40a -> :sswitch_16
        0x178a1 -> :sswitch_15
        0x179a1 -> :sswitch_14
        0x2dddaf -> :sswitch_13
        0x2e3b81 -> :sswitch_12
        0x2eaded -> :sswitch_11
        0x2eefaa -> :sswitch_10
        0x2efe0c -> :sswitch_f
        0x2ff57c -> :sswitch_e
        0x33af38 -> :sswitch_d
        0x3d13ccb -> :sswitch_c
        0x5c74aff -> :sswitch_b
        0x5ced2b0 -> :sswitch_a
        0x675f047 -> :sswitch_9
        0xae020af -> :sswitch_8
        0xe1d1085 -> :sswitch_7
        0x120ca05d -> :sswitch_6
        0x1bc91f0b -> :sswitch_5
        0x32bf5172 -> :sswitch_4
        0x38805e2e -> :sswitch_3
        0x539b187a -> :sswitch_2
        0x5c13d641 -> :sswitch_1
        0x729b88b6 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static bridge synthetic ۤ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۜᩴۚ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z
    .locals 0

    .line 768
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۫(Ljava/lang/String;)I
    .locals 3

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "dex_names"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "native_symbols"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "native_strings"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "dex_strings"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_4
    const-string v0, "overview"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_5
    const-string v0, "resource_table_names"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_6
    const-string v0, "dex_string_members"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_7
    const-string v0, "smali"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_8
    const-string v0, "files"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_9
    const-string v0, "resource_table_file_paths"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_a
    const-string v0, "resource_table_values"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    return v1

    :pswitch_0
    const p0, 0x7f1206eb

    return p0

    :pswitch_1
    const p0, 0x7f1206ef

    return p0

    :pswitch_2
    const p0, 0x7f1206ee

    return p0

    :pswitch_3
    const p0, 0x7f1206ec

    return p0

    :pswitch_4
    const p0, 0x7f120710

    return p0

    :pswitch_5
    const p0, 0x7f1206f0

    return p0

    :pswitch_6
    const p0, 0x7f1206ea

    return p0

    :pswitch_7
    const p0, 0x7f1206f3

    return p0

    :pswitch_8
    const p0, 0x7f1206ed

    return p0

    :pswitch_9
    const p0, 0x7f1206f1

    return p0

    :pswitch_a
    const p0, 0x7f1206f2

    return p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4e5db8bc -> :sswitch_a
        0x1d4358d -> :sswitch_9
        0x5ceba77 -> :sswitch_8
        0x6879504 -> :sswitch_7
        0x1dec8813 -> :sswitch_6
        0x1e1060e6 -> :sswitch_5
        0x1f98ed79 -> :sswitch_4
        0x26c9c65a -> :sswitch_3
        0x307e925a -> :sswitch_2
        0x38bd2db3 -> :sswitch_1
        0x5ad61120 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 0

    .line 758
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lbin/mt/json/JSONArray;

    invoke-direct {p0}, Lbin/mt/json/JSONArray;-><init>()V

    return-object p0
.end method

.method public static ܳ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 28

    move-object/from16 v0, p1

    .line 20
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, "mt_apk_resource_edit"

    const-string v3, "mt_file_transfer_cancel"

    const-string v4, "mt_file_search"

    const-string v5, "mt_apk_patch_bytes"

    const-string v6, "mt_apk_dex_xref"

    const-string v7, "mt_apk_search"

    const-string v8, "mt_file_get_access_policy"

    const-string v9, "mt_file_create_directory"

    const-string v10, "mt_zip_update"

    const-string v11, "mt_zip_create"

    const-string v12, "mt_file_transfer_create_upload"

    const/16 v13, 0x28

    const-string v14, "mt_apk_resource_read"

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "mt_file_delete"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v1, 0x42

    goto/16 :goto_1

    :sswitch_1
    const-string v1, "mt_file_transfer_get"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v1, 0x41

    goto/16 :goto_1

    :sswitch_2
    const-string v1, "mt_apk_session_check"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v1, 0x40

    goto/16 :goto_1

    :sswitch_3
    const-string v1, "mt_file_search_text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v1, 0x3f

    goto/16 :goto_1

    :sswitch_4
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v1, 0x3e

    goto/16 :goto_1

    :sswitch_5
    const-string v1, "mt_apk_session_create"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v1, 0x3d

    goto/16 :goto_1

    :sswitch_6
    const-string v1, "mt_apk_delete_target"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v1, 0x3c

    goto/16 :goto_1

    :sswitch_7
    const-string v1, "mt_apk_resource_delete"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v1, 0x3b

    goto/16 :goto_1

    :sswitch_8
    const-string v1, "mt_apk_install"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v1, 0x3a

    goto/16 :goto_1

    :sswitch_9
    const-string v1, "mt_zip_extract"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v1, 0x39

    goto/16 :goto_1

    :sswitch_a
    const-string v1, "mt_file_append_bytes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v1, 0x38

    goto/16 :goto_1

    :sswitch_b
    const-string v1, "mt_apk_native_analyze_control_flow"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v1, 0x37

    goto/16 :goto_1

    :sswitch_c
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v1, 0x36

    goto/16 :goto_1

    :sswitch_d
    const-string v1, "mt_file_read_bytes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v1, 0x35

    goto/16 :goto_1

    :sswitch_e
    const-string v1, "mt_apk_read_bytes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v1, 0x34

    goto/16 :goto_1

    :sswitch_f
    const-string v1, "mt_file_transfer_create_download"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v1, 0x33

    goto/16 :goto_1

    :sswitch_10
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v1, 0x32

    goto/16 :goto_1

    :sswitch_11
    const-string v1, "mt_apk_workspace_open"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v1, 0x31

    goto/16 :goto_1

    :sswitch_12
    const-string v1, "mt_apk_workspace_list"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v1, 0x30

    goto/16 :goto_1

    :sswitch_13
    const-string v1, "mt_apk_resource_add"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v1, 0x2f

    goto/16 :goto_1

    :sswitch_14
    const-string v1, "mt_file_truncate_bytes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v1, 0x2e

    goto/16 :goto_1

    :sswitch_15
    const-string v1, "mt_apk_copy_entry"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v1, 0x2d

    goto/16 :goto_1

    :sswitch_16
    const-string v1, "mt_apk_continue"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v1, 0x2c

    goto/16 :goto_1

    :sswitch_17
    const-string v1, "mt_apk_native_inspect"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v1, 0x2b

    goto/16 :goto_1

    :sswitch_18
    const-string v1, "mt_apk_list_installed_apps"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v1, 0x2a

    goto/16 :goto_1

    :sswitch_19
    const-string v1, "mt_file_append_text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v1, 0x29

    goto/16 :goto_1

    :sswitch_1a
    const-string v1, "mt_file_read_text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v1, 0x28

    goto/16 :goto_1

    :sswitch_1b
    const-string v1, "mt_apk_list_available_apks"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v1, 0x27

    goto/16 :goto_1

    :sswitch_1c
    const-string v1, "mt_file_stat"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/16 v1, 0x26

    goto/16 :goto_1

    :sswitch_1d
    const-string v1, "mt_file_move"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/16 v1, 0x25

    goto/16 :goto_1

    :sswitch_1e
    const-string v1, "mt_file_list"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 v1, 0x24

    goto/16 :goto_1

    :sswitch_1f
    const-string v1, "mt_file_copy"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/16 v1, 0x23

    goto/16 :goto_1

    :sswitch_20
    const-string v1, "mt_zip_test"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    goto/16 :goto_0

    :cond_20
    const/16 v1, 0x22

    goto/16 :goto_1

    :sswitch_21
    const-string v1, "mt_zip_list"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    goto/16 :goto_0

    :cond_21
    const/16 v1, 0x21

    goto/16 :goto_1

    :sswitch_22
    const-string v1, "mt_apk_dex_read_class_outline"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    goto/16 :goto_0

    :cond_22
    const/16 v1, 0x20

    goto/16 :goto_1

    :sswitch_23
    const-string v1, "mt_file_replace_text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    goto/16 :goto_0

    :cond_23
    const/16 v1, 0x1f

    goto/16 :goto_1

    :sswitch_24
    const-string v1, "mt_apk_dex_list_classes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    goto/16 :goto_0

    :cond_24
    const/16 v1, 0x1e

    goto/16 :goto_1

    :sswitch_25
    const-string v1, "mt_file_write_bytes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    goto/16 :goto_0

    :cond_25
    const/16 v1, 0x1d

    goto/16 :goto_1

    :sswitch_26
    const-string v1, "mt_apk_workspace_delete"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    goto/16 :goto_0

    :cond_26
    const/16 v1, 0x1c

    goto/16 :goto_1

    :sswitch_27
    const-string v1, "mt_zip_read_bytes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    goto/16 :goto_0

    :cond_27
    const/16 v1, 0x1b

    goto/16 :goto_1

    :sswitch_28
    const-string v1, "mt_apk_read_text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    goto/16 :goto_0

    :cond_28
    const/16 v1, 0x1a

    goto/16 :goto_1

    :sswitch_29
    const-string v1, "mt_zip_read_text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    goto/16 :goto_0

    :cond_29
    const/16 v1, 0x19

    goto/16 :goto_1

    :sswitch_2a
    const-string v1, "mt_file_edit_text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    goto/16 :goto_0

    :cond_2a
    const/16 v1, 0x18

    goto/16 :goto_1

    :sswitch_2b
    const-string v1, "mt_apk_native_patch_instructions"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    goto/16 :goto_0

    :cond_2b
    const/16 v1, 0x17

    goto/16 :goto_1

    :sswitch_2c
    const-string v1, "mt_apk_native_map_address"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    goto/16 :goto_0

    :cond_2c
    const/16 v1, 0x16

    goto/16 :goto_1

    :sswitch_2d
    const-string v1, "mt_apk_dex_read_pseudocode"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    goto/16 :goto_0

    :cond_2d
    const/16 v1, 0x15

    goto/16 :goto_1

    :sswitch_2e
    const-string v1, "mt_apk_native_patch_string"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    goto/16 :goto_0

    :cond_2e
    const/16 v1, 0x14

    goto/16 :goto_1

    :sswitch_2f
    const-string v1, "mt_apk_build"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    goto/16 :goto_0

    :cond_2f
    const/16 v1, 0x13

    goto/16 :goto_1

    :sswitch_30
    const-string v1, "mt_apk_native_xref"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    goto/16 :goto_0

    :cond_30
    const/16 v1, 0x12

    goto/16 :goto_1

    :sswitch_31
    const-string v1, "mt_apk_edit_text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    goto/16 :goto_0

    :cond_31
    const/16 v1, 0x11

    goto/16 :goto_1

    :sswitch_32
    const-string v1, "mt_file_patch_bytes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    goto/16 :goto_0

    :cond_32
    const/16 v1, 0x10

    goto/16 :goto_1

    :sswitch_33
    const-string v1, "mt_apk_native_list_items"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    goto/16 :goto_0

    :cond_33
    const/16 v1, 0xf

    goto/16 :goto_1

    :sswitch_34
    const-string v1, "mt_file_delete_directory"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_34

    goto/16 :goto_0

    :cond_34
    const/16 v1, 0xe

    goto/16 :goto_1

    :sswitch_35
    const-string v1, "mt_apk_read_signature"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    goto/16 :goto_0

    :cond_35
    const/16 v1, 0xd

    goto/16 :goto_1

    :sswitch_36
    const-string v1, "mt_apk_list_entries"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_36

    goto/16 :goto_0

    :cond_36
    const/16 v1, 0xc

    goto/16 :goto_1

    :sswitch_37
    const-string v1, "mt_apk_native_disassemble"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_37

    goto/16 :goto_0

    :cond_37
    const/16 v1, 0xb

    goto/16 :goto_1

    :sswitch_38
    const-string v1, "mt_apk_resource_xref"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_38

    goto/16 :goto_0

    :cond_38
    const/16 v1, 0xa

    goto/16 :goto_1

    :sswitch_39
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    goto/16 :goto_0

    :cond_39
    const/16 v1, 0x9

    goto/16 :goto_1

    :sswitch_3a
    const-string v1, "mt_apk_resource_list"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3a

    goto :goto_0

    :cond_3a
    const/16 v1, 0x8

    goto :goto_1

    :sswitch_3b
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3b

    goto :goto_0

    :cond_3b
    const/4 v1, 0x7

    goto :goto_1

    :sswitch_3c
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3c

    goto :goto_0

    :cond_3c
    const/4 v1, 0x6

    goto :goto_1

    :sswitch_3d
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3d

    goto :goto_0

    :cond_3d
    const/4 v1, 0x5

    goto :goto_1

    :sswitch_3e
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3e

    goto :goto_0

    :cond_3e
    const/4 v1, 0x4

    goto :goto_1

    :sswitch_3f
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3f

    goto :goto_0

    :cond_3f
    const/4 v1, 0x3

    goto :goto_1

    :sswitch_40
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_40

    goto :goto_0

    :cond_40
    const/4 v1, 0x2

    goto :goto_1

    :sswitch_41
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_41

    goto :goto_0

    :cond_41
    const/4 v1, 0x1

    goto :goto_1

    :sswitch_42
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_42

    goto :goto_0

    :cond_42
    const/4 v1, 0x0

    goto :goto_1

    :goto_0
    const/4 v1, -0x1

    :goto_1
    packed-switch v1, :pswitch_data_0

    .line 293
    invoke-static/range {p0 .. p0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v1, "mt_apk_workspace_list"

    .line 295
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/16 v16, 0x0

    const-string v15, ""

    if-nez v1, :cond_a5

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_43

    goto/16 :goto_17

    .line 296
    :cond_43
    new-instance v1, Ll/ۖᩴۚ;

    const/16 v8, 0x800

    invoke-direct {v1, v8}, Ll/ۖᩴۚ;-><init>(I)V

    .line 297
    invoke-virtual/range {p0 .. p0}, Lbin/mt/json/JSONObject;->size()I

    move-result v8

    if-le v8, v13, :cond_44

    const/4 v8, 0x1

    goto :goto_2

    :cond_44
    const/4 v8, 0x0

    .line 298
    :goto_2
    invoke-static/range {p0 .. p0}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v13

    move/from16 v18, v8

    .line 299
    invoke-static {v13, v0}, Ll/ۜᩴۚ;->ۚ(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result v8

    move-object/from16 v19, v15

    const/4 v15, 0x1

    if-le v8, v15, :cond_46

    const/4 v15, 0x3

    if-le v8, v15, :cond_45

    const v15, 0x7f120607

    goto :goto_3

    :cond_45
    const v15, 0x7f120606

    .line 300
    :goto_3
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 p0, v13

    const/4 v13, 0x1

    new-array v13, v13, [Ljava/lang/Object;

    aput-object v8, v13, v16

    invoke-virtual {v1, v15, v13}, Ll/ۖᩴۚ;->ۙ(I[Ljava/lang/Object;)V

    goto :goto_4

    :cond_46
    move-object/from16 p0, v13

    .line 301
    :goto_4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_1

    goto/16 :goto_5

    :sswitch_43
    const-string v2, "mt_file_delete"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_47

    goto/16 :goto_5

    :cond_47
    const/16 v15, 0x40

    goto/16 :goto_6

    :sswitch_44
    const-string v2, "mt_file_transfer_get"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_48

    goto/16 :goto_5

    :cond_48
    const/16 v15, 0x3f

    goto/16 :goto_6

    :sswitch_45
    const-string v2, "mt_apk_session_check"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_49

    goto/16 :goto_5

    :cond_49
    const/16 v15, 0x3e

    goto/16 :goto_6

    :sswitch_46
    const-string v2, "mt_file_search_text"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4a

    goto/16 :goto_5

    :cond_4a
    const/16 v15, 0x3d

    goto/16 :goto_6

    :sswitch_47
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4b

    goto/16 :goto_5

    :cond_4b
    const/16 v15, 0x3c

    goto/16 :goto_6

    :sswitch_48
    const-string v2, "mt_apk_session_create"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4c

    goto/16 :goto_5

    :cond_4c
    const/16 v15, 0x3b

    goto/16 :goto_6

    :sswitch_49
    const-string v2, "mt_apk_delete_target"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4d

    goto/16 :goto_5

    :cond_4d
    const/16 v15, 0x3a

    goto/16 :goto_6

    :sswitch_4a
    const-string v2, "mt_apk_resource_delete"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4e

    goto/16 :goto_5

    :cond_4e
    const/16 v15, 0x39

    goto/16 :goto_6

    :sswitch_4b
    const-string v2, "mt_apk_install"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4f

    goto/16 :goto_5

    :cond_4f
    const/16 v15, 0x38

    goto/16 :goto_6

    :sswitch_4c
    const-string v2, "mt_zip_extract"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_50

    goto/16 :goto_5

    :cond_50
    const/16 v15, 0x37

    goto/16 :goto_6

    :sswitch_4d
    const-string v2, "mt_file_append_bytes"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_51

    goto/16 :goto_5

    :cond_51
    const/16 v15, 0x36

    goto/16 :goto_6

    :sswitch_4e
    const-string v2, "mt_apk_native_analyze_control_flow"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_52

    goto/16 :goto_5

    :cond_52
    const/16 v15, 0x35

    goto/16 :goto_6

    :sswitch_4f
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_53

    goto/16 :goto_5

    :cond_53
    const/16 v15, 0x34

    goto/16 :goto_6

    :sswitch_50
    const-string v2, "mt_file_read_bytes"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_54

    goto/16 :goto_5

    :cond_54
    const/16 v15, 0x33

    goto/16 :goto_6

    :sswitch_51
    const-string v2, "mt_apk_read_bytes"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_55

    goto/16 :goto_5

    :cond_55
    const/16 v15, 0x32

    goto/16 :goto_6

    :sswitch_52
    const-string v2, "mt_file_transfer_create_download"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_56

    goto/16 :goto_5

    :cond_56
    const/16 v15, 0x31

    goto/16 :goto_6

    :sswitch_53
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_57

    goto/16 :goto_5

    :cond_57
    const/16 v15, 0x30

    goto/16 :goto_6

    :sswitch_54
    const-string v2, "mt_apk_workspace_open"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_58

    goto/16 :goto_5

    :cond_58
    const/16 v15, 0x2f

    goto/16 :goto_6

    :sswitch_55
    const-string v2, "mt_apk_resource_add"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_59

    goto/16 :goto_5

    :cond_59
    const/16 v15, 0x2e

    goto/16 :goto_6

    :sswitch_56
    const-string v2, "mt_file_truncate_bytes"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5a

    goto/16 :goto_5

    :cond_5a
    const/16 v15, 0x2d

    goto/16 :goto_6

    :sswitch_57
    const-string v2, "mt_apk_copy_entry"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5b

    goto/16 :goto_5

    :cond_5b
    const/16 v15, 0x2c

    goto/16 :goto_6

    :sswitch_58
    const-string v2, "mt_apk_continue"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5c

    goto/16 :goto_5

    :cond_5c
    const/16 v15, 0x2b

    goto/16 :goto_6

    :sswitch_59
    const-string v2, "mt_apk_native_inspect"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5d

    goto/16 :goto_5

    :cond_5d
    const/16 v15, 0x2a

    goto/16 :goto_6

    :sswitch_5a
    const-string v2, "mt_apk_list_installed_apps"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5e

    goto/16 :goto_5

    :cond_5e
    const/16 v15, 0x29

    goto/16 :goto_6

    :sswitch_5b
    const-string v2, "mt_file_append_text"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5f

    goto/16 :goto_5

    :cond_5f
    const/16 v15, 0x28

    goto/16 :goto_6

    :sswitch_5c
    const-string v2, "mt_file_read_text"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_60

    goto/16 :goto_5

    :cond_60
    const/16 v15, 0x27

    goto/16 :goto_6

    :sswitch_5d
    const-string v2, "mt_apk_list_available_apks"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_61

    goto/16 :goto_5

    :cond_61
    const/16 v15, 0x26

    goto/16 :goto_6

    :sswitch_5e
    const-string v2, "mt_file_stat"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_62

    goto/16 :goto_5

    :cond_62
    const/16 v15, 0x25

    goto/16 :goto_6

    :sswitch_5f
    const-string v2, "mt_file_move"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_63

    goto/16 :goto_5

    :cond_63
    const/16 v15, 0x24

    goto/16 :goto_6

    :sswitch_60
    const-string v2, "mt_file_list"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_64

    goto/16 :goto_5

    :cond_64
    const/16 v15, 0x23

    goto/16 :goto_6

    :sswitch_61
    const-string v2, "mt_file_copy"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_65

    goto/16 :goto_5

    :cond_65
    const/16 v15, 0x22

    goto/16 :goto_6

    :sswitch_62
    const-string v2, "mt_zip_test"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_66

    goto/16 :goto_5

    :cond_66
    const/16 v15, 0x21

    goto/16 :goto_6

    :sswitch_63
    const-string v2, "mt_zip_list"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_67

    goto/16 :goto_5

    :cond_67
    const/16 v15, 0x20

    goto/16 :goto_6

    :sswitch_64
    const-string v2, "mt_apk_dex_read_class_outline"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_68

    goto/16 :goto_5

    :cond_68
    const/16 v15, 0x1f

    goto/16 :goto_6

    :sswitch_65
    const-string v2, "mt_file_replace_text"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_69

    goto/16 :goto_5

    :cond_69
    const/16 v15, 0x1e

    goto/16 :goto_6

    :sswitch_66
    const-string v2, "mt_apk_dex_list_classes"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6a

    goto/16 :goto_5

    :cond_6a
    const/16 v15, 0x1d

    goto/16 :goto_6

    :sswitch_67
    const-string v2, "mt_file_write_bytes"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6b

    goto/16 :goto_5

    :cond_6b
    const/16 v15, 0x1c

    goto/16 :goto_6

    :sswitch_68
    const-string v2, "mt_apk_workspace_delete"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6c

    goto/16 :goto_5

    :cond_6c
    const/16 v15, 0x1b

    goto/16 :goto_6

    :sswitch_69
    const-string v2, "mt_zip_read_bytes"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6d

    goto/16 :goto_5

    :cond_6d
    const/16 v15, 0x1a

    goto/16 :goto_6

    :sswitch_6a
    const-string v2, "mt_apk_read_text"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6e

    goto/16 :goto_5

    :cond_6e
    const/16 v15, 0x19

    goto/16 :goto_6

    :sswitch_6b
    const-string v2, "mt_zip_read_text"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6f

    goto/16 :goto_5

    :cond_6f
    const/16 v15, 0x18

    goto/16 :goto_6

    :sswitch_6c
    const-string v2, "mt_file_edit_text"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_70

    goto/16 :goto_5

    :cond_70
    const/16 v15, 0x17

    goto/16 :goto_6

    :sswitch_6d
    const-string v2, "mt_apk_native_patch_instructions"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_71

    goto/16 :goto_5

    :cond_71
    const/16 v15, 0x16

    goto/16 :goto_6

    :sswitch_6e
    const-string v2, "mt_apk_native_map_address"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_72

    goto/16 :goto_5

    :cond_72
    const/16 v15, 0x15

    goto/16 :goto_6

    :sswitch_6f
    const-string v2, "mt_apk_dex_read_pseudocode"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_73

    goto/16 :goto_5

    :cond_73
    const/16 v15, 0x14

    goto/16 :goto_6

    :sswitch_70
    const-string v2, "mt_apk_native_patch_string"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_74

    goto/16 :goto_5

    :cond_74
    const/16 v15, 0x13

    goto/16 :goto_6

    :sswitch_71
    const-string v2, "mt_apk_build"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_75

    goto/16 :goto_5

    :cond_75
    const/16 v15, 0x12

    goto/16 :goto_6

    :sswitch_72
    const-string v2, "mt_apk_native_xref"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_76

    goto/16 :goto_5

    :cond_76
    const/16 v15, 0x11

    goto/16 :goto_6

    :sswitch_73
    const-string v2, "mt_apk_edit_text"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_77

    goto/16 :goto_5

    :cond_77
    const/16 v15, 0x10

    goto/16 :goto_6

    :sswitch_74
    const-string v2, "mt_file_patch_bytes"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_78

    goto/16 :goto_5

    :cond_78
    const/16 v15, 0xf

    goto/16 :goto_6

    :sswitch_75
    const-string v2, "mt_apk_native_list_items"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_79

    goto/16 :goto_5

    :cond_79
    const/16 v15, 0xe

    goto/16 :goto_6

    :sswitch_76
    const-string v2, "mt_file_delete_directory"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7a

    goto/16 :goto_5

    :cond_7a
    const/16 v15, 0xd

    goto/16 :goto_6

    :sswitch_77
    const-string v2, "mt_apk_read_signature"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7b

    goto/16 :goto_5

    :cond_7b
    const/16 v15, 0xc

    goto/16 :goto_6

    :sswitch_78
    const-string v2, "mt_apk_list_entries"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7c

    goto/16 :goto_5

    :cond_7c
    const/16 v15, 0xb

    goto/16 :goto_6

    :sswitch_79
    const-string v2, "mt_apk_native_disassemble"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7d

    goto/16 :goto_5

    :cond_7d
    const/16 v15, 0xa

    goto/16 :goto_6

    :sswitch_7a
    const-string v2, "mt_apk_resource_xref"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7e

    goto/16 :goto_5

    :cond_7e
    const/16 v15, 0x9

    goto/16 :goto_6

    :sswitch_7b
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7f

    goto :goto_5

    :cond_7f
    const/16 v15, 0x8

    goto :goto_6

    :sswitch_7c
    const-string v2, "mt_apk_resource_list"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_80

    goto :goto_5

    :cond_80
    const/4 v15, 0x7

    goto :goto_6

    :sswitch_7d
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_81

    goto :goto_5

    :cond_81
    const/4 v15, 0x6

    goto :goto_6

    :sswitch_7e
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_82

    goto :goto_5

    :cond_82
    const/4 v15, 0x5

    goto :goto_6

    :sswitch_7f
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_83

    goto :goto_5

    :cond_83
    const/4 v15, 0x4

    goto :goto_6

    :sswitch_80
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_84

    goto :goto_5

    :cond_84
    const/4 v15, 0x3

    goto :goto_6

    :sswitch_81
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_85

    goto :goto_5

    :cond_85
    const/4 v15, 0x2

    goto :goto_6

    :sswitch_82
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_86

    goto :goto_5

    :cond_86
    const/4 v15, 0x1

    goto :goto_6

    :sswitch_83
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_87

    goto :goto_5

    :cond_87
    const/4 v15, 0x0

    goto :goto_6

    :goto_5
    const/4 v15, -0x1

    :goto_6
    const-string v2, "contentPatternType"

    const-string v3, "prefix"

    const-string v4, "query"

    const-string v5, "destinationPath"

    const-string v6, "sourcePath"

    const-string v7, "outputPath"

    const-string v8, "caseSensitive"

    const-wide/16 v16, 0x0

    const-string v9, "contentPattern"

    const-string v13, "kind"

    move-object/from16 v20, v14

    const-string v14, "variant"

    move-object/from16 v21, v2

    const-string v2, "workspaceId"

    move-object/from16 v22, v9

    const-string v9, "editSessionId"

    move-object/from16 v23, v3

    const-string v3, "recursive"

    move-object/from16 v24, v4

    const-string v4, "entryPath"

    move-object/from16 v25, v12

    const-string v12, "overwrite"

    move-object/from16 v26, v3

    const-string v3, "locator"

    move-object/from16 v27, v5

    const-string v5, "path"

    packed-switch v15, :pswitch_data_1

    goto/16 :goto_16

    :pswitch_1
    const v0, 0x7f12067a

    move-object/from16 v15, p0

    .line 424
    invoke-virtual {v1, v0, v15, v9}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "runBuildChecks"

    const v2, 0x7f120642

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_2
    move-object/from16 v15, p0

    const v0, 0x7f120667

    .line 1172
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    .line 460
    invoke-virtual {v1, v15}, Ll/ۖᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;)V

    const-string v0, "pattern"

    const v2, 0x7f120657

    .line 461
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "patternType"

    const v2, 0x7f120668

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120643

    .line 462
    invoke-virtual {v1, v0, v15, v8}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "contextBefore"

    const v2, 0x7f120645

    .line 463
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "contextAfter"

    const v2, 0x7f120644

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_3
    move-object/from16 v15, p0

    const v0, 0x7f12068a

    .line 399
    invoke-virtual {v1, v0, v15, v2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_4
    move-object/from16 v15, p0

    const v0, 0x7f12067a

    .line 400
    invoke-virtual {v1, v0, v15, v9}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120683

    invoke-virtual {v1, v0, v15, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_5
    move-object/from16 v15, p0

    const-string v0, "deletes"

    .line 329
    invoke-static {v15, v0}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v2, 0x0

    .line 330
    :goto_7
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    const/4 v4, 0x3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-ge v2, v3, :cond_8a

    .line 331
    invoke-static {v0, v2}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 332
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_88

    .line 756
    invoke-static {v3, v13}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 332
    invoke-virtual {v1, v2, v4}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;)V

    .line 756
    :cond_88
    invoke-static {v3, v13}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "type_variant"

    .line 333
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_89

    const-string v4, "packageId"

    const v5, 0x7f120665

    .line 334
    invoke-virtual {v1, v5, v3, v4}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v4, "typeId"

    const v5, 0x7f120687

    .line 335
    invoke-virtual {v1, v5, v3, v4}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    .line 756
    invoke-static {v3, v14}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 336
    invoke-static {v3}, Ll/ۜᩴۚ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f120689

    invoke-virtual {v1, v4, v3}, Ll/ۖᩴۚ;->᩷(ILjava/lang/String;)V

    goto :goto_8

    .line 338
    :cond_89
    invoke-static {v3}, Ll/ۜᩴۚ;->ۤ(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f120683

    invoke-virtual {v1, v4, v3}, Ll/ۖᩴۚ;->᩷(ILjava/lang/String;)V

    :goto_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 341
    :cond_8a
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۖᩴۚ;->ۙ(I)V

    goto/16 :goto_16

    :pswitch_6
    move-object/from16 v15, p0

    const v0, 0x7f120667

    .line 1172
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_7
    move-object/from16 v15, p0

    const v2, 0x7f120667

    invoke-virtual {v1, v2, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v2, 0x7f120662

    .line 481
    invoke-virtual {v1, v2, v15, v7}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v2, "level"

    const v3, 0x7f120658

    invoke-virtual {v1, v3, v15, v2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v2, 0x7f120663

    .line 482
    invoke-virtual {v1, v2, v15, v12}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    .line 483
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8b

    const-string v3, "operations"

    goto :goto_9

    :cond_8b
    if-eqz v2, :cond_8c

    const-string v3, "sources"

    goto :goto_9

    :cond_8c
    const-string v3, "entries"

    .line 484
    :goto_9
    invoke-static {v15, v3}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    if-nez v0, :cond_8e

    .line 485
    invoke-virtual {v3}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_8e

    const-string v5, " \u2192 "

    if-eqz v2, :cond_8d

    .line 486
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v8, 0x0

    new-array v9, v8, [Ljava/lang/Object;

    const v10, 0x7f12067e

    .line 770
    invoke-static {v10, v9}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 486
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v5, v8, [Ljava/lang/Object;

    const v8, 0x7f120649

    .line 770
    invoke-static {v8, v5}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 486
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_a

    :cond_8d
    const/4 v7, 0x0

    const v8, 0x7f120649

    .line 487
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    new-array v10, v7, [Ljava/lang/Object;

    .line 770
    invoke-static {v8, v10}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 487
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v5, v7, [Ljava/lang/Object;

    const v7, 0x7f120646

    .line 770
    invoke-static {v7, v5}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 487
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 486
    :goto_a
    invoke-virtual {v1, v5}, Ll/ۖᩴۚ;->ۤ(Ljava/lang/String;)V

    :cond_8e
    const/4 v5, 0x0

    .line 489
    :goto_b
    invoke-virtual {v3}, Lbin/mt/json/JSONArray;->size()I

    move-result v7

    const/4 v8, 0x3

    invoke-static {v8, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    if-ge v5, v7, :cond_94

    .line 490
    invoke-static {v3, v5}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v7

    if-nez v0, :cond_8f

    xor-int/lit8 v8, v2, 0x1

    .line 492
    invoke-virtual {v1, v7, v8}, Ll/ۖᩴۚ;->᩷(Lbin/mt/json/JSONObject;Z)V

    move-object/from16 v9, v26

    move-object/from16 v10, v27

    goto/16 :goto_d

    :cond_8f
    const-string v8, "type"

    .line 756
    invoke-static {v7, v8}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 495
    invoke-virtual {v1, v5, v9}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;)V

    const v9, 0x7f12067e

    .line 496
    invoke-virtual {v1, v9, v7, v6}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v9, 0x7f120649

    invoke-virtual {v1, v9, v7, v4}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v9, 0x7f120646

    move-object/from16 v10, v27

    .line 497
    invoke-virtual {v1, v9, v7, v10}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v11, "newEntryPath"

    invoke-virtual {v1, v9, v7, v11}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    .line 756
    invoke-static {v7, v8}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 499
    invoke-virtual {v7, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    const-string v11, "add"

    .line 500
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_90

    const v8, 0x7f120663

    invoke-virtual {v1, v8, v7, v12}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto :goto_c

    :cond_90
    if-eqz v9, :cond_92

    .line 501
    invoke-virtual {v9}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v11

    if-eqz v11, :cond_92

    invoke-virtual {v9}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v9

    const-string v11, "/"

    invoke-virtual {v9, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_92

    const-string v9, "delete"

    .line 502
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_91

    const v8, 0x7f12066c

    move-object/from16 v9, v26

    invoke-virtual {v1, v8, v7, v9}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto :goto_d

    :cond_91
    move-object/from16 v9, v26

    const-string v11, "rename"

    .line 503
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_93

    const-string v8, "mergeDirectories"

    const v11, 0x7f120692

    invoke-virtual {v1, v11, v7, v8}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto :goto_d

    :cond_92
    :goto_c
    move-object/from16 v9, v26

    :cond_93
    :goto_d
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    goto/16 :goto_b

    .line 506
    :cond_94
    invoke-virtual {v3}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۖᩴۚ;->ۙ(I)V

    goto/16 :goto_16

    :pswitch_8
    move-object/from16 v15, p0

    const v2, 0x7f120667

    .line 1172
    invoke-virtual {v1, v2, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    .line 305
    invoke-virtual {v1, v15}, Ll/ۖᩴۚ;->᩸(Lbin/mt/json/JSONObject;)V

    const v2, 0x7f120663

    .line 306
    invoke-virtual {v1, v2, v15, v12}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    move-object/from16 v2, v25

    .line 307
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a3

    const v0, 0x7f12067b

    const v2, 0x7f12069e

    const-string v3, "sha256"

    .line 308
    invoke-virtual {v1, v15, v3, v0, v2}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;II)V

    goto/16 :goto_16

    :pswitch_9
    move-object/from16 v15, p0

    const v0, 0x7f12063b

    .line 312
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "temporary"

    const v2, 0x7f120684

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_a
    move-object/from16 v15, p0

    const v0, 0x7f120649

    .line 474
    invoke-virtual {v1, v0, v15, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "localPath"

    const v2, 0x7f12065b

    .line 475
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120663

    invoke-virtual {v1, v0, v15, v12}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_b
    move-object/from16 v15, p0

    const v0, 0x7f12068a

    .line 396
    invoke-virtual {v1, v0, v15, v2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f12067a

    .line 397
    invoke-virtual {v1, v0, v15, v9}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_c
    move-object/from16 v15, p0

    const v0, 0x7f120657

    move-object/from16 v2, v24

    .line 315
    invoke-virtual {v1, v0, v15, v2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "appType"

    .line 756
    invoke-static {v15, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 316
    invoke-static {v0}, Ll/ۜᩴۚ;->᩸(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f12063d

    invoke-virtual {v1, v2, v0}, Ll/ۖᩴۚ;->᩷(ILjava/lang/String;)V

    goto/16 :goto_16

    :pswitch_d
    move-object/from16 v15, p0

    const v0, 0x7f12074c

    const v2, 0x7f120669

    move-object/from16 v3, v23

    .line 318
    invoke-virtual {v1, v15, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;II)V

    goto/16 :goto_16

    :pswitch_e
    move-object/from16 v15, p0

    move-object/from16 v9, v26

    .line 745
    invoke-virtual {v15, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_95

    .line 746
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_95

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_95

    const v0, 0x7f120619

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    .line 770
    invoke-static {v0, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f120667

    .line 428
    invoke-virtual {v1, v2, v0}, Ll/ۖᩴۚ;->᩷(ILjava/lang/String;)V

    goto :goto_e

    :cond_95
    const v0, 0x7f120667

    .line 1172
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    :goto_e
    const v0, 0x7f12066c

    .line 430
    invoke-virtual {v1, v0, v15, v9}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_f
    move-object/from16 v15, p0

    move-object/from16 v10, v27

    const v0, 0x7f12067e

    .line 426
    invoke-virtual {v1, v0, v15, v6}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120646

    invoke-virtual {v1, v0, v15, v10}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120663

    invoke-virtual {v1, v0, v15, v12}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_10
    move-object/from16 v15, p0

    move-object/from16 v9, v26

    const v0, 0x7f120667

    const v2, 0x7f12066c

    .line 1172
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120649

    .line 478
    invoke-virtual {v1, v0, v15, v4}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v15, v9}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_11
    move-object/from16 v15, p0

    const v0, 0x7f120667

    .line 1172
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    .line 466
    invoke-virtual {v1, v15}, Ll/ۖᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;)V

    const v0, 0x7f120657

    move-object/from16 v2, v22

    invoke-virtual {v1, v0, v15, v2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120668

    move-object/from16 v3, v21

    .line 467
    invoke-virtual {v1, v0, v15, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "contentCaseSensitive"

    const v2, 0x7f120643

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f12066f

    .line 468
    invoke-virtual {v1, v15, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;I)V

    const-string v0, "replaceMode"

    const v2, 0x7f12066e

    .line 469
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "replacementMode"

    const v2, 0x7f120671

    .line 470
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "expectedReplacements"

    const-wide/16 v2, -0x1

    .line 471
    invoke-static {v15, v0, v2, v3}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v2

    cmp-long v0, v2, v16

    if-ltz v0, :cond_a3

    const-string v0, "expectedReplacements"

    const v2, 0x7f12064d

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_12
    move-object/from16 v15, p0

    const v0, 0x7f120667

    .line 1172
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    .line 436
    invoke-virtual {v1, v15}, Ll/ۖᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;)V

    const-string v0, "hex"

    const v2, 0x7f120653

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f12063e

    .line 437
    invoke-virtual {v1, v15, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;I)V

    const-string v0, "size"

    const v2, 0x7f120652

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_13
    move-object/from16 v15, p0

    const v0, 0x7f12068a

    .line 401
    invoke-virtual {v1, v0, v15, v2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_14
    move-object/from16 v15, p0

    const v0, 0x7f120667

    .line 1172
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120683

    .line 359
    invoke-virtual {v1, v0, v15, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120649

    invoke-virtual {v1, v0, v15, v4}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "byteOffset"

    const v2, 0x7f120661

    .line 360
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "maxBytes"

    const v2, 0x7f12065e

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_15
    move-object/from16 v15, p0

    const v0, 0x7f120667

    const v2, 0x7f120649

    .line 1172
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    .line 356
    invoke-virtual {v1, v2, v15, v4}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Ll/ۖᩴۚ;->ۧ(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v1, v15}, Ll/ۖᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    :pswitch_16
    move-object/from16 v15, p0

    const v0, 0x7f120683

    .line 353
    invoke-virtual {v1, v0, v15, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "style"

    const v2, 0x7f120680

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Ll/ۖᩴۚ;->ۧ(Lbin/mt/json/JSONObject;)V

    goto/16 :goto_16

    :pswitch_17
    move-object/from16 v15, p0

    const v0, 0x7f12067a

    .line 425
    invoke-virtual {v1, v0, v15, v9}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120604

    const v2, 0x7f120662

    invoke-virtual {v1, v15, v7, v2, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;II)V

    const v0, 0x7f120663

    invoke-virtual {v1, v0, v15, v12}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "sign"

    const v2, 0x7f12067c

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_18
    move-object/from16 v15, p0

    const v0, 0x7f120667

    .line 1172
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120683

    .line 403
    invoke-virtual {v1, v0, v15, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Ll/ۖᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;)V

    const-string v0, "edits"

    .line 404
    invoke-static {v15, v0}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v2, 0x0

    .line 405
    :goto_f
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    const/4 v4, 0x3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-ge v2, v3, :cond_96

    .line 406
    invoke-static {v0, v2}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mode"

    .line 756
    invoke-static {v3, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 407
    invoke-virtual {v1, v2, v4}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;)V

    const-string v4, "matchText"

    const v5, 0x7f12065c

    .line 408
    invoke-virtual {v1, v5, v3, v4}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v4, 0x7f12066f

    .line 409
    invoke-virtual {v1, v3, v4}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    .line 411
    :cond_96
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۖᩴۚ;->ۙ(I)V

    goto/16 :goto_16

    :pswitch_19
    move-object/from16 v15, p0

    const v0, 0x7f12068a

    .line 313
    invoke-virtual {v1, v0, v15, v2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_1a
    move-object/from16 v15, p0

    move-object/from16 v3, v23

    const v0, 0x7f12074c

    const v2, 0x7f120669

    .line 319
    invoke-virtual {v1, v15, v3, v2, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;II)V

    goto/16 :goto_16

    :pswitch_1b
    move-object/from16 v15, p0

    const v0, 0x7f120683

    .line 386
    invoke-virtual {v1, v0, v15, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "itemKind"

    const v2, 0x7f120659

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "addressKind"

    const v2, 0x7f120639

    .line 387
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "address"

    const v2, 0x7f120638

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "instructionMode"

    const v2, 0x7f120655

    .line 388
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "scanKind"

    const v2, 0x7f120675

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "referenceKinds"

    .line 389
    invoke-static {v15, v0}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const v2, 0x7f12066d

    invoke-virtual {v1, v0, v2}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)V

    const-string v0, "expectedHex"

    const v2, 0x7f12064c

    .line 390
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "replacementAssembly"

    const v2, 0x7f120640

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "expectedText"

    const v2, 0x7f12064e

    .line 391
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "replacementText"

    const v2, 0x7f12066f

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "paddingMode"

    const v2, 0x7f120666

    .line 392
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "maxBytes"

    const v2, 0x7f12065e

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "maxInstructions"

    const v2, 0x7f12065f

    .line 393
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_1c
    move-object/from16 v15, p0

    const-string v0, "view"

    .line 756
    invoke-static {v15, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "resource_table"

    .line 322
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_97

    const-string v2, "resource_table_variants"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_97

    const-string v0, "view"

    const v2, 0x7f120683

    .line 323
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    :cond_97
    const-string v0, "typeName"

    .line 756
    invoke-static {v15, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f1205fa

    .line 325
    invoke-static {v2, v0}, Ll/ۜᩴۚ;->᩷(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f120686

    invoke-virtual {v1, v2, v0}, Ll/ۖᩴۚ;->᩷(ILjava/lang/String;)V

    .line 756
    invoke-static {v15, v14}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 326
    invoke-static {v0}, Ll/ۜᩴۚ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f1205fa

    invoke-static {v2, v0}, Ll/ۜᩴۚ;->᩷(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f120689

    invoke-virtual {v1, v2, v0}, Ll/ۖᩴۚ;->᩷(ILjava/lang/String;)V

    goto/16 :goto_16

    :pswitch_1d
    move-object/from16 v15, p0

    const-string v2, "_read"

    .line 367
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_98

    const-string v2, "reads"

    goto :goto_10

    :cond_98
    const-string v2, "_edit"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_99

    const-string v2, "edits"

    goto :goto_10

    :cond_99
    const-string v2, "adds"

    :goto_10
    invoke-static {v15, v2}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const/4 v4, 0x0

    .line 368
    :goto_11
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v5

    const/4 v6, 0x3

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    if-ge v4, v5, :cond_9c

    .line 369
    invoke-static {v2, v4}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v20

    .line 370
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9a

    move-object/from16 v7, v19

    invoke-virtual {v1, v7}, Ll/ۖᩴۚ;->ۤ(Ljava/lang/String;)V

    goto :goto_12

    :cond_9a
    move-object/from16 v7, v19

    .line 756
    invoke-static {v5, v13}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 371
    invoke-virtual {v1, v4, v8}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;)V

    :goto_12
    const v8, 0x7f120674

    .line 372
    invoke-virtual {v1, v8, v5, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v8, 0x7f120689

    invoke-virtual {v1, v8, v5, v14}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v8, "valueXml"

    const v9, 0x7f120688

    .line 373
    invoke-virtual {v1, v9, v5, v8}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v8, "values"

    .line 374
    invoke-static {v5, v8}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v5

    const/4 v8, 0x0

    .line 375
    :goto_13
    invoke-virtual {v5}, Lbin/mt/json/JSONArray;->size()I

    move-result v9

    const/4 v10, 0x3

    invoke-static {v10, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    if-ge v8, v9, :cond_9b

    .line 376
    invoke-static {v5, v8}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v9

    const/4 v10, 0x0

    new-array v10, v10, [Ljava/lang/Object;

    const v11, 0x7f120689

    .line 770
    invoke-static {v11, v10}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 756
    invoke-static {v9, v14}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 377
    invoke-static {v11}, Ll/ۜᩴۚ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, " \u00b7 "

    invoke-static {v10, v12, v11}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10}, Ll/ۖᩴۚ;->ۤ(Ljava/lang/String;)V

    const-string v10, "valueXml"

    const v11, 0x7f120688

    .line 378
    invoke-virtual {v1, v11, v9, v10}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_13

    .line 380
    :cond_9b
    invoke-virtual {v5}, Lbin/mt/json/JSONArray;->size()I

    move-result v5

    invoke-virtual {v1, v5}, Ll/ۖᩴۚ;->ۙ(I)V

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v20, v6

    move-object/from16 v19, v7

    goto/16 :goto_11

    .line 382
    :cond_9c
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۖᩴۚ;->ۙ(I)V

    goto/16 :goto_16

    :pswitch_1e
    move-object/from16 v15, p0

    const-string v0, "transferId"

    const v2, 0x7f120685

    .line 311
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_1f
    move-object/from16 v15, p0

    move-object/from16 v3, v21

    move-object/from16 v2, v22

    move-object/from16 v9, v26

    const v0, 0x7f120667

    .line 1172
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f12066c

    .line 440
    invoke-virtual {v1, v0, v15, v9}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "minSize"

    const-wide/16 v4, -0x1

    .line 1021
    invoke-static {v15, v0, v4, v5}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v6

    cmp-long v8, v6, v16

    if-ltz v8, :cond_9d

    const v6, 0x7f120695

    invoke-virtual {v1, v6, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    :cond_9d
    const-string v0, "maxSize"

    invoke-static {v15, v0, v4, v5}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long v6, v4, v16

    if-ltz v6, :cond_9e

    const v4, 0x7f120691

    invoke-virtual {v1, v4, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    :cond_9e
    const-string v0, "minModifiedAt"

    const v4, 0x7f120694

    .line 443
    invoke-virtual {v1, v4, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "maxModifiedAt"

    const v4, 0x7f120690

    .line 444
    invoke-virtual {v1, v4, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "namePattern"

    .line 756
    invoke-static {v15, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 445
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9f

    const v0, 0x7f12069a

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 770
    invoke-static {v0, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 446
    invoke-virtual {v1, v0}, Ll/ۖᩴۚ;->ۤ(Ljava/lang/String;)V

    const-string v0, "namePattern"

    const v4, 0x7f120657

    .line 447
    invoke-virtual {v1, v4, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "namePatternType"

    const v4, 0x7f120668

    .line 448
    invoke-virtual {v1, v4, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "nameMatchMode"

    const v4, 0x7f12065d

    .line 449
    invoke-virtual {v1, v4, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "nameCaseSensitive"

    const v4, 0x7f120643

    .line 450
    invoke-virtual {v1, v4, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    .line 756
    :cond_9f
    invoke-static {v15, v2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 452
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a3

    const v0, 0x7f120615

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 770
    invoke-static {v0, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 453
    invoke-virtual {v1, v0}, Ll/ۖᩴۚ;->ۤ(Ljava/lang/String;)V

    const v0, 0x7f120657

    .line 454
    invoke-virtual {v1, v0, v15, v2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120668

    .line 455
    invoke-virtual {v1, v0, v15, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "contentCaseSensitive"

    const v2, 0x7f120643

    .line 456
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto/16 :goto_16

    :pswitch_20
    move-object/from16 v15, p0

    move-object/from16 v7, v19

    const v0, 0x7f120667

    .line 1172
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120683

    .line 414
    invoke-virtual {v1, v0, v15, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "patches"

    .line 415
    invoke-static {v15, v0}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v2, 0x0

    .line 416
    :goto_14
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    const/4 v4, 0x3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-ge v2, v3, :cond_a0

    .line 417
    invoke-static {v0, v2}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 418
    invoke-virtual {v1, v2, v7}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;)V

    const-string v4, "byteOffset"

    const v5, 0x7f120661

    .line 419
    invoke-virtual {v1, v5, v3, v4}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v4, "expectedHex"

    const v5, 0x7f12064c

    invoke-virtual {v1, v5, v3, v4}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v4, "replacementHex"

    const v5, 0x7f120670

    .line 420
    invoke-virtual {v1, v5, v3, v4}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_14

    .line 422
    :cond_a0
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۖᩴۚ;->ۙ(I)V

    goto/16 :goto_16

    :pswitch_21
    move-object/from16 v15, p0

    const v0, 0x7f120683

    .line 363
    invoke-virtual {v1, v0, v15, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "methodResolution"

    const v2, 0x7f120673

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "scopes"

    .line 364
    invoke-static {v15, v0}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const v2, 0x7f120677

    invoke-virtual {v1, v0, v2}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)V

    goto :goto_16

    :pswitch_22
    move-object/from16 v15, p0

    move-object/from16 v2, v24

    const v0, 0x7f120677

    const-string v3, "target"

    .line 756
    invoke-static {v15, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "overview"

    .line 346
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a1

    const v3, 0x7f1206a0

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 770
    invoke-static {v3, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 346
    invoke-virtual {v1, v0, v3}, Ll/ۖᩴۚ;->᩷(ILjava/lang/String;)V

    goto :goto_15

    .line 347
    :cond_a1
    invoke-static {v3}, Ll/ۜᩴۚ;->۫(Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_a2

    const-string v3, "target"

    invoke-virtual {v1, v0, v15, v3}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    :cond_a2
    :goto_15
    const v0, 0x7f120657

    .line 348
    invoke-virtual {v1, v0, v15, v2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "queryType"

    const v2, 0x7f120668

    .line 349
    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "matchMode"

    const v2, 0x7f12065d

    invoke-virtual {v1, v2, v15, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f120643

    .line 350
    invoke-virtual {v1, v0, v15, v8}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto :goto_16

    :pswitch_23
    move-object/from16 v15, p0

    move-object/from16 v9, v26

    const v0, 0x7f120667

    .line 1172
    invoke-virtual {v1, v0, v15, v5}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const v0, 0x7f12066c

    .line 433
    invoke-virtual {v1, v0, v15, v9}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    :cond_a3
    :goto_16
    if-eqz v18, :cond_a4

    .line 509
    invoke-virtual {v1}, Ll/ۖᩴۚ;->ۙ()V

    .line 510
    :cond_a4
    invoke-virtual {v1}, Ll/ۖᩴۚ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_a5
    :goto_17
    move-object v7, v15

    return-object v7

    :sswitch_data_0
    .sparse-switch
        -0x7e92354b -> :sswitch_42
        -0x7586fb27 -> :sswitch_41
        -0x708c653d -> :sswitch_40
        -0x6efc3562 -> :sswitch_3f
        -0x6eb24e87 -> :sswitch_3e
        -0x6ce74ccd -> :sswitch_3d
        -0x691d7bdd -> :sswitch_3c
        -0x62325de0 -> :sswitch_3b
        -0x622f1b4c -> :sswitch_3a
        -0x622c7254 -> :sswitch_39
        -0x622986cf -> :sswitch_38
        -0x56ef032d -> :sswitch_37
        -0x5048ed36 -> :sswitch_36
        -0x4bfaac96 -> :sswitch_35
        -0x46081f5c -> :sswitch_34
        -0x437e75f4 -> :sswitch_33
        -0x3fc9a0f7 -> :sswitch_32
        -0x3b2e48b9 -> :sswitch_31
        -0x3a8b17f8 -> :sswitch_30
        -0x3615fe0d -> :sswitch_2f
        -0x354cbe2b -> :sswitch_2e
        -0x1bdc226f -> :sswitch_2d
        -0x1b948b7c -> :sswitch_2c
        -0x1264db97 -> :sswitch_2b
        -0x11d77729 -> :sswitch_2a
        -0x10eb4200 -> :sswitch_29
        -0xe52dcc5 -> :sswitch_28
        -0xd719e08 -> :sswitch_27
        -0xd59fc10 -> :sswitch_26
        -0xc57b6a0 -> :sswitch_25
        -0x1549bf8 -> :sswitch_24
        0xeee9523 -> :sswitch_23
        0x12ea31d5 -> :sswitch_22
        0x14566e94 -> :sswitch_21
        0x145a0288 -> :sswitch_20
        0x1708e3c0 -> :sswitch_1f
        0x170ce4e9 -> :sswitch_1e
        0x170d701c -> :sswitch_1d
        0x17103a9f -> :sswitch_1c
        0x185f2a13 -> :sswitch_1b
        0x1b03f4cb -> :sswitch_1a
        0x1b8f0087 -> :sswitch_19
        0x1e1ac49d -> :sswitch_18
        0x20003c07 -> :sswitch_17
        0x2a318702 -> :sswitch_16
        0x2a9b1ec3 -> :sswitch_15
        0x2de3dedd -> :sswitch_14
        0x2e6169cb -> :sswitch_13
        0x3a56fc23 -> :sswitch_12
        0x3a5871cf -> :sswitch_11
        0x3c4740db -> :sswitch_10
        0x3f5cace2 -> :sswitch_f
        0x4302a41d -> :sswitch_e
        0x4486048d -> :sswitch_d
        0x4991b972 -> :sswitch_c
        0x4e5357d0 -> :sswitch_b
        0x555c7051 -> :sswitch_a
        0x5d89d2cb -> :sswitch_9
        0x5e5b93e0 -> :sswitch_8
        0x5f480c41 -> :sswitch_7
        0x60f2292a -> :sswitch_6
        0x61eb10e0 -> :sswitch_5
        0x682c513f -> :sswitch_4
        0x6bd752b9 -> :sswitch_3
        0x6e7ee8a4 -> :sswitch_2
        0x73b4424d -> :sswitch_1
        0x7984d336 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7e92354b -> :sswitch_83
        -0x708c653d -> :sswitch_82
        -0x6efc3562 -> :sswitch_81
        -0x6eb24e87 -> :sswitch_80
        -0x6ce74ccd -> :sswitch_7f
        -0x691d7bdd -> :sswitch_7e
        -0x62325de0 -> :sswitch_7d
        -0x622f1b4c -> :sswitch_7c
        -0x622c7254 -> :sswitch_7b
        -0x622986cf -> :sswitch_7a
        -0x56ef032d -> :sswitch_79
        -0x5048ed36 -> :sswitch_78
        -0x4bfaac96 -> :sswitch_77
        -0x46081f5c -> :sswitch_76
        -0x437e75f4 -> :sswitch_75
        -0x3fc9a0f7 -> :sswitch_74
        -0x3b2e48b9 -> :sswitch_73
        -0x3a8b17f8 -> :sswitch_72
        -0x3615fe0d -> :sswitch_71
        -0x354cbe2b -> :sswitch_70
        -0x1bdc226f -> :sswitch_6f
        -0x1b948b7c -> :sswitch_6e
        -0x1264db97 -> :sswitch_6d
        -0x11d77729 -> :sswitch_6c
        -0x10eb4200 -> :sswitch_6b
        -0xe52dcc5 -> :sswitch_6a
        -0xd719e08 -> :sswitch_69
        -0xd59fc10 -> :sswitch_68
        -0xc57b6a0 -> :sswitch_67
        -0x1549bf8 -> :sswitch_66
        0xeee9523 -> :sswitch_65
        0x12ea31d5 -> :sswitch_64
        0x14566e94 -> :sswitch_63
        0x145a0288 -> :sswitch_62
        0x1708e3c0 -> :sswitch_61
        0x170ce4e9 -> :sswitch_60
        0x170d701c -> :sswitch_5f
        0x17103a9f -> :sswitch_5e
        0x185f2a13 -> :sswitch_5d
        0x1b03f4cb -> :sswitch_5c
        0x1b8f0087 -> :sswitch_5b
        0x1e1ac49d -> :sswitch_5a
        0x20003c07 -> :sswitch_59
        0x2a318702 -> :sswitch_58
        0x2a9b1ec3 -> :sswitch_57
        0x2de3dedd -> :sswitch_56
        0x2e6169cb -> :sswitch_55
        0x3a5871cf -> :sswitch_54
        0x3c4740db -> :sswitch_53
        0x3f5cace2 -> :sswitch_52
        0x4302a41d -> :sswitch_51
        0x4486048d -> :sswitch_50
        0x4991b972 -> :sswitch_4f
        0x4e5357d0 -> :sswitch_4e
        0x555c7051 -> :sswitch_4d
        0x5d89d2cb -> :sswitch_4c
        0x5e5b93e0 -> :sswitch_4b
        0x5f480c41 -> :sswitch_4a
        0x60f2292a -> :sswitch_49
        0x61eb10e0 -> :sswitch_48
        0x682c513f -> :sswitch_47
        0x6bd752b9 -> :sswitch_46
        0x6e7ee8a4 -> :sswitch_45
        0x73b4424d -> :sswitch_44
        0x7984d336 -> :sswitch_43
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1d
        :pswitch_21
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_23
        :pswitch_1b
        :pswitch_20
        :pswitch_18
        :pswitch_1b
        :pswitch_17
        :pswitch_1b
        :pswitch_16
        :pswitch_1b
        :pswitch_1b
        :pswitch_18
        :pswitch_15
        :pswitch_16
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_1a
        :pswitch_11
        :pswitch_21
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_23
        :pswitch_d
        :pswitch_15
        :pswitch_12
        :pswitch_c
        :pswitch_1b
        :pswitch_b
        :pswitch_a
        :pswitch_12
        :pswitch_1d
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_14
        :pswitch_14
        :pswitch_7
        :pswitch_1b
        :pswitch_12
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_1e
        :pswitch_23
    .end packed-switch
.end method

.method public static ܳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "-"

    .line 790
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Ll/ۜᩴۚ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܶ(Lbin/mt/json/JSONObject;Ljava/lang/String;)I
    .locals 2

    .line 46
    invoke-static {p0}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "mt_apk_delete_target"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_1
    const-string v0, "mt_apk_resource_delete"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_2
    const-string v0, "mt_apk_copy_entry"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_3
    const-string v0, "mt_apk_read_text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_4
    const-string v0, "mt_apk_edit_text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_5
    const-string v0, "mt_apk_resource_list"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_6
    const-string v0, "mt_apk_search"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    const-string p0, ""

    goto :goto_2

    :pswitch_0
    const-string v0, "deletes"

    .line 51
    invoke-static {p0, v0}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {p0}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONArray;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :pswitch_1
    const-string v0, "direction"

    goto :goto_1

    :pswitch_2
    const-string v0, "locator"

    .line 756
    invoke-static {p0, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 48
    invoke-static {p0}, Ll/ۜᩴۚ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :pswitch_3
    const-string v0, "view"

    goto :goto_1

    :pswitch_4
    const-string v0, "target"

    .line 756
    :goto_1
    invoke-static {p0, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 55
    :goto_2
    invoke-static {p1, p0}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x708c653d -> :sswitch_6
        -0x622f1b4c -> :sswitch_5
        -0x3b2e48b9 -> :sswitch_4
        -0xe52dcc5 -> :sswitch_3
        0x2a9b1ec3 -> :sswitch_2
        0x5f480c41 -> :sswitch_1
        0x60f2292a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public static ܺ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "mt_apk_install"

    .line 515
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "data"

    invoke-static {p0, p1}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "status"

    .line 756
    invoke-static {p0, p1}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "failed"

    .line 515
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 20
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const-string v3, "mt_apk_read_signature"

    const-string v4, "mt_apk_list_entries"

    const-string v5, "mt_apk_resource_list"

    const-string v6, "mt_apk_resource_edit"

    const-string v7, "mt_apk_search"

    const-string v8, "mt_file_get_access_policy"

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v2, "mt_file_delete"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x42

    goto/16 :goto_1

    :sswitch_1
    const-string v2, "mt_file_transfer_get"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x41

    goto/16 :goto_1

    :sswitch_2
    const-string v2, "mt_apk_session_check"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x40

    goto/16 :goto_1

    :sswitch_3
    const-string v2, "mt_file_search_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0x3f

    goto/16 :goto_1

    :sswitch_4
    const-string v2, "mt_zip_update"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v2, 0x3e

    goto/16 :goto_1

    :sswitch_5
    const-string v2, "mt_apk_session_create"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v2, 0x3d

    goto/16 :goto_1

    :sswitch_6
    const-string v2, "mt_apk_delete_target"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v2, 0x3c

    goto/16 :goto_1

    :sswitch_7
    const-string v2, "mt_apk_resource_delete"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v2, 0x3b

    goto/16 :goto_1

    :sswitch_8
    const-string v2, "mt_apk_install"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v2, 0x3a

    goto/16 :goto_1

    :sswitch_9
    const-string v2, "mt_zip_extract"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v2, 0x39

    goto/16 :goto_1

    :sswitch_a
    const-string v2, "mt_file_append_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v2, 0x38

    goto/16 :goto_1

    :sswitch_b
    const-string v2, "mt_apk_native_analyze_control_flow"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v2, 0x37

    goto/16 :goto_1

    :sswitch_c
    const-string v2, "mt_zip_create"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v2, 0x36

    goto/16 :goto_1

    :sswitch_d
    const-string v2, "mt_file_read_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v2, 0x35

    goto/16 :goto_1

    :sswitch_e
    const-string v2, "mt_apk_read_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v2, 0x34

    goto/16 :goto_1

    :sswitch_f
    const-string v2, "mt_file_transfer_create_download"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v2, 0x33

    goto/16 :goto_1

    :sswitch_10
    const-string v2, "mt_file_transfer_create_upload"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v2, 0x32

    goto/16 :goto_1

    :sswitch_11
    const-string v2, "mt_apk_workspace_open"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v2, 0x31

    goto/16 :goto_1

    :sswitch_12
    const-string v2, "mt_apk_workspace_list"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v2, 0x30

    goto/16 :goto_1

    :sswitch_13
    const-string v2, "mt_apk_resource_add"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v2, 0x2f

    goto/16 :goto_1

    :sswitch_14
    const-string v2, "mt_file_truncate_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v2, 0x2e

    goto/16 :goto_1

    :sswitch_15
    const-string v2, "mt_apk_copy_entry"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v2, 0x2d

    goto/16 :goto_1

    :sswitch_16
    const-string v2, "mt_apk_continue"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v2, 0x2c

    goto/16 :goto_1

    :sswitch_17
    const-string v2, "mt_apk_native_inspect"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v2, 0x2b

    goto/16 :goto_1

    :sswitch_18
    const-string v2, "mt_apk_list_installed_apps"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v2, 0x2a

    goto/16 :goto_1

    :sswitch_19
    const-string v2, "mt_file_append_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v2, 0x29

    goto/16 :goto_1

    :sswitch_1a
    const-string v2, "mt_file_read_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v2, 0x28

    goto/16 :goto_1

    :sswitch_1b
    const-string v2, "mt_apk_list_available_apks"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v2, 0x27

    goto/16 :goto_1

    :sswitch_1c
    const-string v2, "mt_file_stat"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/16 v2, 0x26

    goto/16 :goto_1

    :sswitch_1d
    const-string v2, "mt_file_move"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/16 v2, 0x25

    goto/16 :goto_1

    :sswitch_1e
    const-string v2, "mt_file_list"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 v2, 0x24

    goto/16 :goto_1

    :sswitch_1f
    const-string v2, "mt_file_copy"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/16 v2, 0x23

    goto/16 :goto_1

    :sswitch_20
    const-string v2, "mt_zip_test"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    goto/16 :goto_0

    :cond_20
    const/16 v2, 0x22

    goto/16 :goto_1

    :sswitch_21
    const-string v2, "mt_zip_list"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    goto/16 :goto_0

    :cond_21
    const/16 v2, 0x21

    goto/16 :goto_1

    :sswitch_22
    const-string v2, "mt_apk_dex_read_class_outline"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_22

    goto/16 :goto_0

    :cond_22
    const/16 v2, 0x20

    goto/16 :goto_1

    :sswitch_23
    const-string v2, "mt_file_replace_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_23

    goto/16 :goto_0

    :cond_23
    const/16 v2, 0x1f

    goto/16 :goto_1

    :sswitch_24
    const-string v2, "mt_apk_dex_list_classes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_24

    goto/16 :goto_0

    :cond_24
    const/16 v2, 0x1e

    goto/16 :goto_1

    :sswitch_25
    const-string v2, "mt_file_write_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_25

    goto/16 :goto_0

    :cond_25
    const/16 v2, 0x1d

    goto/16 :goto_1

    :sswitch_26
    const-string v2, "mt_apk_workspace_delete"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_26

    goto/16 :goto_0

    :cond_26
    const/16 v2, 0x1c

    goto/16 :goto_1

    :sswitch_27
    const-string v2, "mt_zip_read_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    goto/16 :goto_0

    :cond_27
    const/16 v2, 0x1b

    goto/16 :goto_1

    :sswitch_28
    const-string v2, "mt_apk_read_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    goto/16 :goto_0

    :cond_28
    const/16 v2, 0x1a

    goto/16 :goto_1

    :sswitch_29
    const-string v2, "mt_zip_read_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_29

    goto/16 :goto_0

    :cond_29
    const/16 v2, 0x19

    goto/16 :goto_1

    :sswitch_2a
    const-string v2, "mt_file_edit_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2a

    goto/16 :goto_0

    :cond_2a
    const/16 v2, 0x18

    goto/16 :goto_1

    :sswitch_2b
    const-string v2, "mt_apk_native_patch_instructions"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2b

    goto/16 :goto_0

    :cond_2b
    const/16 v2, 0x17

    goto/16 :goto_1

    :sswitch_2c
    const-string v2, "mt_apk_native_map_address"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2c

    goto/16 :goto_0

    :cond_2c
    const/16 v2, 0x16

    goto/16 :goto_1

    :sswitch_2d
    const-string v2, "mt_apk_dex_read_pseudocode"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2d

    goto/16 :goto_0

    :cond_2d
    const/16 v2, 0x15

    goto/16 :goto_1

    :sswitch_2e
    const-string v2, "mt_apk_native_patch_string"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2e

    goto/16 :goto_0

    :cond_2e
    const/16 v2, 0x14

    goto/16 :goto_1

    :sswitch_2f
    const-string v2, "mt_apk_build"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2f

    goto/16 :goto_0

    :cond_2f
    const/16 v2, 0x13

    goto/16 :goto_1

    :sswitch_30
    const-string v2, "mt_apk_native_xref"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_30

    goto/16 :goto_0

    :cond_30
    const/16 v2, 0x12

    goto/16 :goto_1

    :sswitch_31
    const-string v2, "mt_apk_edit_text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_31

    goto/16 :goto_0

    :cond_31
    const/16 v2, 0x11

    goto/16 :goto_1

    :sswitch_32
    const-string v2, "mt_file_patch_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    goto/16 :goto_0

    :cond_32
    const/16 v2, 0x10

    goto/16 :goto_1

    :sswitch_33
    const-string v2, "mt_apk_native_list_items"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_33

    goto/16 :goto_0

    :cond_33
    const/16 v2, 0xf

    goto/16 :goto_1

    :sswitch_34
    const-string v2, "mt_file_delete_directory"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_34

    goto/16 :goto_0

    :cond_34
    const/16 v2, 0xe

    goto/16 :goto_1

    :sswitch_35
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_35

    goto/16 :goto_0

    :cond_35
    const/16 v2, 0xd

    goto/16 :goto_1

    :sswitch_36
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_36

    goto/16 :goto_0

    :cond_36
    const/16 v2, 0xc

    goto/16 :goto_1

    :sswitch_37
    const-string v2, "mt_apk_native_disassemble"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_37

    goto/16 :goto_0

    :cond_37
    const/16 v2, 0xb

    goto/16 :goto_1

    :sswitch_38
    const-string v2, "mt_apk_resource_xref"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_38

    goto/16 :goto_0

    :cond_38
    const/16 v2, 0xa

    goto/16 :goto_1

    :sswitch_39
    const-string v2, "mt_apk_resource_read"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_39

    goto/16 :goto_0

    :cond_39
    const/16 v2, 0x9

    goto/16 :goto_1

    :sswitch_3a
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3a

    goto/16 :goto_0

    :cond_3a
    const/16 v2, 0x8

    goto :goto_1

    :sswitch_3b
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3b

    goto :goto_0

    :cond_3b
    const/4 v2, 0x7

    goto :goto_1

    :sswitch_3c
    const-string v2, "mt_file_transfer_cancel"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3c

    goto :goto_0

    :cond_3c
    const/4 v2, 0x6

    goto :goto_1

    :sswitch_3d
    const-string v2, "mt_file_search"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    goto :goto_0

    :cond_3d
    const/4 v2, 0x5

    goto :goto_1

    :sswitch_3e
    const-string v2, "mt_apk_patch_bytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3e

    goto :goto_0

    :cond_3e
    const/4 v2, 0x4

    goto :goto_1

    :sswitch_3f
    const-string v2, "mt_apk_dex_xref"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3f

    goto :goto_0

    :cond_3f
    const/4 v2, 0x3

    goto :goto_1

    :sswitch_40
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_40

    goto :goto_0

    :cond_40
    const/4 v2, 0x2

    goto :goto_1

    :sswitch_41
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_41

    goto :goto_0

    :cond_41
    const/4 v2, 0x1

    goto :goto_1

    :sswitch_42
    const-string v2, "mt_file_create_directory"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_42

    goto :goto_0

    :cond_42
    const/4 v2, 0x0

    goto :goto_1

    :goto_0
    const/4 v2, -0x1

    :goto_1
    const-string v9, "entryPath"

    const-string v10, "destinationPath"

    const-string v11, "query"

    const-string v12, "outputPath"

    const-string v13, "sourcePath"

    const-string v14, "path"

    const-string v15, "locator"

    const-string v16, ""

    const-string v0, " \u2192 "

    packed-switch v2, :pswitch_data_0

    move-object v6, v0

    move-object v8, v10

    move-object v4, v11

    move-object v7, v13

    move-object v3, v14

    .line 94
    filled-new-array {v15, v3, v7, v12, v4}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x5

    goto/16 :goto_1b

    .line 171
    :pswitch_0
    invoke-static/range {p0 .. p0}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 756
    invoke-static {v2, v15}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 173
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->isEmpty()Z

    move-result v18

    move-object/from16 v19, v9

    const-string v9, "adds"

    move-object/from16 v20, v10

    const-string v10, "edits"

    if-eqz v18, :cond_44

    move-object/from16 v18, v13

    const-string v13, "reads"

    .line 174
    filled-new-array {v13, v10, v9}, [Ljava/lang/String;

    move-result-object v13

    const/16 v21, 0x0

    move-object/from16 p0, v9

    move-object/from16 v21, v10

    const/4 v9, 0x0

    :goto_2
    const/4 v10, 0x3

    if-ge v9, v10, :cond_45

    aget-object v10, v13, v9

    .line 175
    invoke-static {v2, v10}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v10

    move-object/from16 v22, v13

    const/4 v13, 0x0

    invoke-static {v10, v13}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 756
    invoke-static {v10, v15}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 177
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_43

    goto :goto_3

    :cond_43
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v13, v22

    goto :goto_2

    :cond_44
    move-object/from16 p0, v9

    move-object/from16 v21, v10

    move-object/from16 v18, v13

    .line 756
    :cond_45
    :goto_3
    invoke-static {v2, v14}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 182
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_47

    const-string v6, "mt_apk_resource_add"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_46

    goto :goto_5

    :cond_46
    :goto_4
    move-object/from16 v23, v0

    move-object/from16 v21, v9

    move-object/from16 v22, v11

    move-object/from16 v24, v14

    goto/16 :goto_11

    :cond_47
    :goto_5
    const-string v6, "_edit"

    .line 183
    invoke-virtual {v1, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_48

    move-object/from16 v6, v21

    goto :goto_6

    :cond_48
    move-object/from16 v6, p0

    :goto_6
    invoke-static {v2, v6}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v6

    const/4 v10, 0x0

    invoke-static {v6, v10}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v13, "valueXml"

    .line 756
    invoke-static {v6, v13}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 185
    invoke-virtual {v15}, Ljava/lang/String;->isEmpty()Z

    move-result v21

    if-eqz v21, :cond_49

    const-string v15, "values"

    invoke-static {v6, v15}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v6

    invoke-static {v6, v10}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 756
    invoke-static {v6, v13}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    :cond_49
    const/16 v6, 0x3c

    .line 255
    invoke-virtual {v15, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    const/16 v10, 0x3e

    invoke-virtual {v15, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    if-ltz v6, :cond_46

    if-gt v10, v6, :cond_4a

    goto :goto_4

    :cond_4a
    add-int/lit8 v6, v6, 0x1

    move v13, v6

    :goto_7
    if-ge v13, v10, :cond_4b

    .line 258
    invoke-virtual {v15, v13}, Ljava/lang/String;->charAt(I)C

    move-result v21

    invoke-static/range {v21 .. v21}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v21

    if-nez v21, :cond_4b

    add-int/lit8 v13, v13, 0x1

    goto :goto_7

    .line 259
    :cond_4b
    invoke-virtual {v15, v6, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    move-object/from16 p0, v16

    :goto_8
    if-ge v13, v10, :cond_58

    :goto_9
    if-ge v13, v10, :cond_4c

    .line 262
    invoke-virtual {v15, v13}, Ljava/lang/String;->charAt(I)C

    move-result v21

    invoke-static/range {v21 .. v21}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v21

    if-eqz v21, :cond_4c

    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    :cond_4c
    move-object/from16 v21, v9

    move-object/from16 v22, v11

    move v9, v13

    :goto_a
    const/16 v11, 0x3d

    if-ge v9, v10, :cond_4d

    .line 264
    invoke-virtual {v15, v9}, Ljava/lang/String;->charAt(I)C

    move-result v23

    invoke-static/range {v23 .. v23}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v23

    if-nez v23, :cond_4d

    move-object/from16 v23, v0

    invoke-virtual {v15, v9}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, v11, :cond_4e

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, v23

    goto :goto_a

    :cond_4d
    move-object/from16 v23, v0

    .line 265
    :cond_4e
    invoke-virtual {v15, v13, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :goto_b
    if-ge v9, v10, :cond_4f

    .line 266
    invoke-virtual {v15, v9}, Ljava/lang/String;->charAt(I)C

    move-result v13

    invoke-static {v13}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v13

    if-eqz v13, :cond_4f

    add-int/lit8 v9, v9, 0x1

    goto :goto_b

    :cond_4f
    if-ge v9, v10, :cond_59

    add-int/lit8 v13, v9, 0x1

    .line 267
    invoke-virtual {v15, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-eq v9, v11, :cond_50

    goto/16 :goto_f

    :cond_50
    :goto_c
    if-ge v13, v10, :cond_51

    .line 268
    invoke-virtual {v15, v13}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v9

    if-eqz v9, :cond_51

    add-int/lit8 v13, v13, 0x1

    goto :goto_c

    :cond_51
    if-lt v13, v10, :cond_52

    goto :goto_f

    :cond_52
    add-int/lit8 v9, v13, 0x1

    .line 270
    invoke-virtual {v15, v13}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v13, 0x27

    if-eq v11, v13, :cond_53

    const/16 v13, 0x22

    if-eq v11, v13, :cond_53

    goto :goto_f

    :cond_53
    move v13, v9

    :goto_d
    move-object/from16 v24, v14

    if-ge v13, v10, :cond_54

    .line 273
    invoke-virtual {v15, v13}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-eq v14, v11, :cond_54

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v14, v24

    goto :goto_d

    :cond_54
    if-lt v13, v10, :cond_55

    goto :goto_10

    :cond_55
    add-int/lit8 v11, v13, 0x1

    .line 275
    invoke-virtual {v15, v9, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    const-string v13, "name"

    .line 276
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_56

    goto :goto_e

    :cond_56
    const-string v13, "type"

    .line 277
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_57

    move-object v6, v9

    :cond_57
    move-object/from16 v9, p0

    :goto_e
    move-object/from16 p0, v9

    move v13, v11

    move-object/from16 v9, v21

    move-object/from16 v11, v22

    move-object/from16 v0, v23

    move-object/from16 v14, v24

    goto/16 :goto_8

    :cond_58
    move-object/from16 v23, v0

    move-object/from16 v21, v9

    move-object/from16 v22, v11

    :cond_59
    :goto_f
    move-object/from16 v24, v14

    :goto_10
    const-string v0, "string-array"

    .line 279
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5a

    const-string v0, "integer-array"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5b

    :cond_5a
    const-string v6, "array"

    .line 280
    :cond_5b
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5c

    goto :goto_11

    :cond_5c
    const-string v0, "/"

    move-object/from16 v9, p0

    .line 0
    invoke-static {v6, v0, v9}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_12

    :goto_11
    move-object/from16 v0, v16

    .line 188
    :goto_12
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_1

    goto/16 :goto_13

    :sswitch_43
    const-string v3, "mt_apk_resource_delete"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5d

    goto/16 :goto_13

    :cond_5d
    const/16 v3, 0x14

    goto/16 :goto_14

    :sswitch_44
    const-string v3, "mt_apk_install"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5e

    goto/16 :goto_13

    :cond_5e
    const/16 v3, 0x13

    goto/16 :goto_14

    :sswitch_45
    const-string v3, "mt_zip_create"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5f

    goto/16 :goto_13

    :cond_5f
    const/16 v3, 0x12

    goto/16 :goto_14

    :sswitch_46
    const-string v3, "mt_file_transfer_create_download"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_60

    goto/16 :goto_13

    :cond_60
    const/16 v3, 0x11

    goto/16 :goto_14

    :sswitch_47
    const-string v3, "mt_file_transfer_create_upload"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_61

    goto/16 :goto_13

    :cond_61
    const/16 v3, 0x10

    goto/16 :goto_14

    :sswitch_48
    const-string v3, "mt_apk_workspace_list"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_62

    goto/16 :goto_13

    :cond_62
    const/16 v3, 0xf

    goto/16 :goto_14

    :sswitch_49
    const-string v3, "mt_apk_copy_entry"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_63

    goto/16 :goto_13

    :cond_63
    const/16 v3, 0xe

    goto/16 :goto_14

    :sswitch_4a
    const-string v3, "mt_apk_continue"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_64

    goto/16 :goto_13

    :cond_64
    const/16 v3, 0xd

    goto/16 :goto_14

    :sswitch_4b
    const-string v3, "mt_apk_list_installed_apps"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_65

    goto/16 :goto_13

    :cond_65
    const/16 v3, 0xc

    goto/16 :goto_14

    :sswitch_4c
    const-string v3, "mt_apk_list_available_apks"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_66

    goto/16 :goto_13

    :cond_66
    const/16 v3, 0xb

    goto/16 :goto_14

    :sswitch_4d
    const-string v3, "mt_file_move"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_67

    goto/16 :goto_13

    :cond_67
    const/16 v3, 0xa

    goto/16 :goto_14

    :sswitch_4e
    const-string v3, "mt_file_list"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_68

    goto/16 :goto_13

    :cond_68
    const/16 v3, 0x9

    goto/16 :goto_14

    :sswitch_4f
    const-string v3, "mt_file_copy"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_69

    goto :goto_13

    :cond_69
    const/16 v3, 0x8

    goto :goto_14

    :sswitch_50
    const-string v3, "mt_apk_dex_list_classes"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6a

    goto :goto_13

    :cond_6a
    const/4 v3, 0x7

    goto :goto_14

    :sswitch_51
    const-string v3, "mt_zip_read_bytes"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6b

    goto :goto_13

    :cond_6b
    const/4 v3, 0x6

    goto :goto_14

    :sswitch_52
    const-string v3, "mt_zip_read_text"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6c

    goto :goto_13

    :cond_6c
    const/4 v3, 0x5

    goto :goto_14

    :sswitch_53
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6d

    goto :goto_13

    :cond_6d
    const/4 v3, 0x4

    goto :goto_14

    :sswitch_54
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6e

    goto :goto_13

    :cond_6e
    const/4 v3, 0x3

    goto :goto_14

    :sswitch_55
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6f

    goto :goto_13

    :cond_6f
    const/4 v3, 0x2

    goto :goto_14

    :sswitch_56
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_70

    goto :goto_13

    :cond_70
    const/4 v3, 0x1

    goto :goto_14

    :sswitch_57
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_71

    goto :goto_13

    :cond_71
    const/4 v3, 0x0

    goto :goto_14

    :goto_13
    const/4 v3, -0x1

    :goto_14
    const-string v4, "variant"

    const-string v5, " \u00b7 "

    packed-switch v3, :pswitch_data_1

    move-object/from16 v6, v21

    .line 209
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_79

    invoke-static/range {v17 .. v17}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_19

    :pswitch_1
    const-string v3, "deletes"

    .line 205
    invoke-static {v2, v3}, Ll/ۜᩴۚ;->۫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v3, v6}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "kind"

    .line 756
    invoke-static {v3, v6}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "type_variant"

    .line 805
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_72

    invoke-static {v3}, Ll/ۜᩴۚ;->ۤ(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_17

    :cond_72
    const-string v6, "typeId"

    .line 756
    invoke-static {v3, v6}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 807
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_73

    :goto_15
    move-object/from16 v6, v16

    goto :goto_16

    :cond_73
    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v6, v7, v8

    const v6, 0x7f1206b6

    .line 770
    invoke-static {v6, v7}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    goto :goto_15

    .line 756
    :goto_16
    invoke-static {v3, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 807
    invoke-static {v6, v3}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_17

    .line 756
    :pswitch_2
    invoke-static {v2, v12}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_19

    :pswitch_3
    move-object/from16 v3, v24

    .line 752
    invoke-virtual {v2, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-eqz v3, :cond_74

    .line 753
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v4

    if-eqz v4, :cond_74

    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x2f

    const/4 v6, 0x1

    .line 0
    invoke-static {v4, v6, v3}, Ll/ܿۘۙ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v16

    :cond_74
    move-object/from16 v9, v16

    goto/16 :goto_19

    :pswitch_4
    const v3, 0x7f1206d2

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 770
    invoke-static {v3, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_19

    :pswitch_5
    const-string v3, "direction"

    .line 756
    invoke-static {v2, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "local_to_edit_session"

    .line 206
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "localPath"

    if-eqz v3, :cond_75

    .line 756
    invoke-static {v2, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 207
    invoke-static/range {v17 .. v17}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v6, v23

    invoke-static {v3, v6, v4}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_19

    :cond_75
    move-object/from16 v6, v23

    .line 208
    invoke-static/range {v17 .. v17}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 756
    invoke-static {v2, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 208
    invoke-static {v3, v6, v4}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_19

    :pswitch_6
    const v3, 0x7f1206a4

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 770
    invoke-static {v3, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_19

    :pswitch_7
    move-object/from16 v4, v22

    .line 756
    invoke-static {v2, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 241
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_76

    const-string v3, "appType"

    .line 756
    invoke-static {v2, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 241
    invoke-static {v3}, Ll/ۜᩴۚ;->᩸(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_76
    :goto_17
    move-object v9, v3

    goto/16 :goto_19

    :pswitch_8
    const v3, 0x7f1206cb

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 770
    invoke-static {v3, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_19

    :pswitch_9
    move-object/from16 v3, v24

    const/4 v4, 0x0

    .line 745
    invoke-virtual {v2, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-eqz v3, :cond_77

    .line 746
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v6

    if-eqz v6, :cond_77

    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_77

    const v3, 0x7f120619

    new-array v4, v4, [Ljava/lang/Object;

    .line 770
    invoke-static {v3, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_19

    :cond_77
    move-object/from16 v6, v21

    goto/16 :goto_18

    :pswitch_a
    move-object/from16 v7, v18

    move-object/from16 v6, v23

    .line 756
    invoke-static {v2, v7}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v8, v20

    invoke-static {v2, v8}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 197
    invoke-static {v3, v6, v4}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_19

    :pswitch_b
    const/16 v3, 0x2f

    const/4 v4, 0x1

    move-object/from16 v6, v21

    .line 0
    invoke-static {v3, v4, v6}, Ll/ܿۘۙ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v9, v19

    .line 756
    invoke-static {v2, v9}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 198
    invoke-static {v3, v5, v4}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_19

    :pswitch_c
    const v3, 0x7f1206cf

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 770
    invoke-static {v3, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_19

    :pswitch_d
    const/4 v3, 0x0

    const-string v4, "prefix"

    .line 756
    invoke-static {v2, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 201
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_78

    const v4, 0x7f12074c

    new-array v3, v3, [Ljava/lang/Object;

    .line 770
    invoke-static {v4, v3}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_19

    :pswitch_e
    const-string v3, "typeName"

    .line 756
    invoke-static {v2, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const v6, 0x7f1205fb

    .line 203
    invoke-static {v6, v3}, Ll/ۜᩴۚ;->᩷(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 756
    invoke-static {v2, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 204
    invoke-static {v4}, Ll/ۜᩴۚ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const v6, 0x7f1205fc

    invoke-static {v6, v4}, Ll/ۜᩴۚ;->᩷(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 203
    invoke-static {v3, v5, v4}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_19

    :pswitch_f
    move-object/from16 v4, v22

    .line 756
    :cond_78
    invoke-static {v2, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_19

    :pswitch_10
    const v3, 0x7f1206d0

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 770
    invoke-static {v3, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_19

    :cond_79
    :goto_18
    move-object v9, v6

    .line 211
    :goto_19
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7a

    goto :goto_1a

    :cond_7a
    move-object v0, v9

    :goto_1a
    const-string v3, "mt_apk_native_"

    .line 212
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7b

    const-string v1, "address"

    .line 756
    invoke-static {v2, v1}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 212
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7b

    const/16 v3, 0x2f

    const/4 v4, 0x1

    .line 0
    invoke-static {v3, v4, v0}, Ll/ܿۘۙ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 756
    invoke-static {v2, v1}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 213
    invoke-static {v0, v5, v1}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_7b
    const/16 v1, 0x200

    .line 215
    invoke-static {v1, v0}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :goto_1b
    if-ge v1, v2, :cond_7e

    .line 94
    aget-object v3, v0, v1

    move-object/from16 v4, p0

    move-object v5, v6

    .line 95
    invoke-static {v4, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 96
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_7d

    .line 97
    invoke-static {v4, v8}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7c

    goto :goto_1c

    :cond_7c
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x100

    invoke-static {v2, v3}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 0
    invoke-static {v1, v2, v5, v0}, Ll/ۨ᩹ۧ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_1c
    const/16 v0, 0x200

    .line 98
    invoke-static {v0, v3}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_7d
    add-int/lit8 v1, v1, 0x1

    move-object v6, v5

    goto :goto_1b

    :cond_7e
    move-object/from16 v4, p0

    const-string v21, "entries"

    const-string v22, "sources"

    const-string v17, "reads"

    const-string v18, "edits"

    const-string v19, "adds"

    const-string v20, "targets"

    .line 101
    filled-new-array/range {v17 .. v22}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x6

    :goto_1d
    if-ge v1, v2, :cond_81

    aget-object v3, v0, v1

    .line 102
    invoke-virtual {v4, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-eqz v3, :cond_80

    .line 103
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v5

    if-eqz v5, :cond_80

    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v5

    invoke-virtual {v5}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_80

    .line 104
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v3

    .line 105
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v5

    if-eqz v5, :cond_80

    .line 106
    filled-new-array {v15, v9, v7}, [Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    :goto_1e
    const/4 v8, 0x3

    if-ge v6, v8, :cond_80

    aget-object v8, v5, v6

    .line 107
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v10

    invoke-static {v10, v8}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 108
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_7f

    const/16 v0, 0x200

    invoke-static {v0, v8}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_7f
    add-int/lit8 v6, v6, 0x1

    goto :goto_1e

    :cond_80
    add-int/lit8 v1, v1, 0x1

    goto :goto_1d

    :cond_81
    return-object v16

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e92354b -> :sswitch_42
        -0x7586fb27 -> :sswitch_41
        -0x708c653d -> :sswitch_40
        -0x6efc3562 -> :sswitch_3f
        -0x6eb24e87 -> :sswitch_3e
        -0x6ce74ccd -> :sswitch_3d
        -0x691d7bdd -> :sswitch_3c
        -0x62325de0 -> :sswitch_3b
        -0x622f1b4c -> :sswitch_3a
        -0x622c7254 -> :sswitch_39
        -0x622986cf -> :sswitch_38
        -0x56ef032d -> :sswitch_37
        -0x5048ed36 -> :sswitch_36
        -0x4bfaac96 -> :sswitch_35
        -0x46081f5c -> :sswitch_34
        -0x437e75f4 -> :sswitch_33
        -0x3fc9a0f7 -> :sswitch_32
        -0x3b2e48b9 -> :sswitch_31
        -0x3a8b17f8 -> :sswitch_30
        -0x3615fe0d -> :sswitch_2f
        -0x354cbe2b -> :sswitch_2e
        -0x1bdc226f -> :sswitch_2d
        -0x1b948b7c -> :sswitch_2c
        -0x1264db97 -> :sswitch_2b
        -0x11d77729 -> :sswitch_2a
        -0x10eb4200 -> :sswitch_29
        -0xe52dcc5 -> :sswitch_28
        -0xd719e08 -> :sswitch_27
        -0xd59fc10 -> :sswitch_26
        -0xc57b6a0 -> :sswitch_25
        -0x1549bf8 -> :sswitch_24
        0xeee9523 -> :sswitch_23
        0x12ea31d5 -> :sswitch_22
        0x14566e94 -> :sswitch_21
        0x145a0288 -> :sswitch_20
        0x1708e3c0 -> :sswitch_1f
        0x170ce4e9 -> :sswitch_1e
        0x170d701c -> :sswitch_1d
        0x17103a9f -> :sswitch_1c
        0x185f2a13 -> :sswitch_1b
        0x1b03f4cb -> :sswitch_1a
        0x1b8f0087 -> :sswitch_19
        0x1e1ac49d -> :sswitch_18
        0x20003c07 -> :sswitch_17
        0x2a318702 -> :sswitch_16
        0x2a9b1ec3 -> :sswitch_15
        0x2de3dedd -> :sswitch_14
        0x2e6169cb -> :sswitch_13
        0x3a56fc23 -> :sswitch_12
        0x3a5871cf -> :sswitch_11
        0x3c4740db -> :sswitch_10
        0x3f5cace2 -> :sswitch_f
        0x4302a41d -> :sswitch_e
        0x4486048d -> :sswitch_d
        0x4991b972 -> :sswitch_c
        0x4e5357d0 -> :sswitch_b
        0x555c7051 -> :sswitch_a
        0x5d89d2cb -> :sswitch_9
        0x5e5b93e0 -> :sswitch_8
        0x5f480c41 -> :sswitch_7
        0x60f2292a -> :sswitch_6
        0x61eb10e0 -> :sswitch_5
        0x682c513f -> :sswitch_4
        0x6bd752b9 -> :sswitch_3
        0x6e7ee8a4 -> :sswitch_2
        0x73b4424d -> :sswitch_1
        0x7984d336 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7586fb27 -> :sswitch_57
        -0x708c653d -> :sswitch_56
        -0x622f1b4c -> :sswitch_55
        -0x5048ed36 -> :sswitch_54
        -0x4bfaac96 -> :sswitch_53
        -0x10eb4200 -> :sswitch_52
        -0xd719e08 -> :sswitch_51
        -0x1549bf8 -> :sswitch_50
        0x1708e3c0 -> :sswitch_4f
        0x170ce4e9 -> :sswitch_4e
        0x170d701c -> :sswitch_4d
        0x185f2a13 -> :sswitch_4c
        0x1e1ac49d -> :sswitch_4b
        0x2a318702 -> :sswitch_4a
        0x2a9b1ec3 -> :sswitch_49
        0x3a56fc23 -> :sswitch_48
        0x3c4740db -> :sswitch_47
        0x3f5cace2 -> :sswitch_46
        0x4991b972 -> :sswitch_45
        0x5e5b93e0 -> :sswitch_44
        0x5f480c41 -> :sswitch_43
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_d
        :pswitch_a
        :pswitch_9
        :pswitch_a
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

.method public static bridge synthetic ᩴ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ᩴ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x3a

    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_0

    .line 60
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method public static ᩷(ILbin/mt/json/JSONObject;Ljava/lang/String;)I
    .locals 1

    const-string v0, "mt_apk_continue"

    .line 125
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string p2, "data"

    .line 126
    invoke-static {p1, p2}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "appType"

    .line 756
    invoke-static {p1, p2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 128
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    const p0, 0x7f1206fe

    return p0

    :cond_1
    const-string p2, "textWindow"

    .line 129
    invoke-static {p1, p2}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lbin/mt/json/JSONObject;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    const-string p2, "style"

    .line 756
    invoke-static {p1, p2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "readable"

    .line 131
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "instruction"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    const-string p2, "locator"

    .line 756
    invoke-static {p1, p2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 133
    invoke-static {p1}, Ll/ۜᩴۚ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "mt_apk_read_text"

    invoke-static {p2, p1}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    goto :goto_2

    :cond_3
    :goto_0
    const p1, 0x7f1206f9

    goto :goto_2

    :cond_4
    const-string p2, "byteWindow"

    .line 134
    invoke-static {p1, p2}, Ll/ۜᩴۚ;->᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lbin/mt/json/JSONObject;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    const p1, 0x7f120708

    goto :goto_2

    :cond_5
    const-string p2, "fields"

    .line 136
    invoke-virtual {p1, p2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p2

    if-eqz p2, :cond_6

    const-string p2, "methods"

    invoke-virtual {p1, p2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p2

    if-eqz p2, :cond_6

    const p1, 0x7f1206f8

    goto :goto_2

    :cond_6
    const-string p2, "view"

    .line 756
    invoke-static {p1, p2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "resource_table"

    .line 140
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    const-string p2, "resource_table_variants"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    goto :goto_1

    :cond_7
    const/4 p1, 0x0

    goto :goto_2

    :cond_8
    :goto_1
    const-string p2, "mt_apk_resource_list"

    .line 141
    invoke-static {p2, p1}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    :goto_2
    if-eqz p1, :cond_9

    return p1

    :cond_9
    :goto_3
    return p0
.end method

.method public static ᩷(Ljava/lang/String;Ljava/lang/String;)I
    .locals 7

    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "mt_apk_delete_target"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 p0, 0x8

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "mt_apk_resource_delete"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x7

    goto :goto_1

    :sswitch_2
    const-string v0, "mt_apk_copy_entry"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p0, 0x6

    goto :goto_1

    :sswitch_3
    const-string v0, "mt_apk_dex_list_classes"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 p0, 0x5

    goto :goto_1

    :sswitch_4
    const-string v0, "mt_apk_read_text"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 p0, 0x4

    goto :goto_1

    :sswitch_5
    const-string v0, "mt_apk_edit_text"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 p0, 0x3

    goto :goto_1

    :sswitch_6
    const-string v0, "mt_apk_list_entries"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 p0, 0x2

    goto :goto_1

    :sswitch_7
    const-string v0, "mt_apk_resource_list"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 p0, 0x1

    goto :goto_1

    :sswitch_8
    const-string v0, "mt_apk_search"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 p0, 0x0

    goto :goto_1

    :goto_0
    const/4 p0, -0x1

    :goto_1
    const-string v0, "dex_class"

    const-string v4, "zip_entry"

    const-string v5, "axml"

    const-string v6, "dex_method"

    packed-switch p0, :pswitch_data_0

    return v3

    .line 107
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p0

    sparse-switch p0, :sswitch_data_1

    goto :goto_2

    :sswitch_9
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_2

    :sswitch_a
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_2

    :cond_9
    const/4 v2, 0x2

    goto :goto_3

    :sswitch_b
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_2

    :cond_a
    const/4 v2, 0x1

    goto :goto_3

    :sswitch_c
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_2

    :cond_b
    const/4 v2, 0x0

    goto :goto_3

    :goto_2
    const/4 v2, -0x1

    :cond_c
    :goto_3
    packed-switch v2, :pswitch_data_1

    return v3

    :pswitch_1
    const p0, 0x7f1206d6

    return p0

    :pswitch_2
    const p0, 0x7f1206d8

    return p0

    :pswitch_3
    const p0, 0x7f1206d5

    return p0

    :pswitch_4
    const p0, 0x7f1206d7

    return p0

    .line 102
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "type_variant"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    const-string p0, "variant"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    const p0, 0x7f12070c

    return p0

    :cond_d
    const p0, 0x7f1206da

    return p0

    :cond_e
    const p0, 0x7f1206d9

    return p0

    .line 114
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "workspace_to_local"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    const-string p0, "local_to_edit_session"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    return v3

    :cond_f
    const p0, 0x7f1206e0

    return p0

    :cond_10
    const p0, 0x7f1206df

    return p0

    :pswitch_7
    const p0, 0x7f1206e1

    return p0

    .line 82
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p0

    sparse-switch p0, :sswitch_data_2

    goto :goto_4

    :sswitch_d
    const-string p0, "dex_field"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    goto :goto_4

    :sswitch_e
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    goto :goto_4

    :cond_11
    const/4 v1, 0x3

    goto :goto_5

    :sswitch_f
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto :goto_4

    :cond_12
    const/4 v1, 0x2

    goto :goto_5

    :sswitch_10
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    goto :goto_4

    :cond_13
    const/4 v1, 0x1

    goto :goto_5

    :sswitch_11
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    goto :goto_4

    :cond_14
    const/4 v1, 0x0

    goto :goto_5

    :goto_4
    const/4 v1, -0x1

    :cond_15
    :goto_5
    packed-switch v1, :pswitch_data_2

    return v3

    :pswitch_9
    const p0, 0x7f1206e8

    return p0

    :pswitch_a
    const p0, 0x7f1206e7

    return p0

    :pswitch_b
    const p0, 0x7f1206e5

    return p0

    :pswitch_c
    const p0, 0x7f1206e6

    return p0

    :pswitch_d
    const p0, 0x7f1206e9

    return p0

    .line 90
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p0

    sparse-switch p0, :sswitch_data_3

    goto :goto_6

    :sswitch_12
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_19

    goto :goto_6

    :sswitch_13
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_16

    goto :goto_6

    :cond_16
    const/4 v2, 0x2

    goto :goto_7

    :sswitch_14
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_17

    goto :goto_6

    :cond_17
    const/4 v2, 0x1

    goto :goto_7

    :sswitch_15
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_18

    goto :goto_6

    :cond_18
    const/4 v2, 0x0

    goto :goto_7

    :goto_6
    const/4 v2, -0x1

    :cond_19
    :goto_7
    packed-switch v2, :pswitch_data_3

    return v3

    :pswitch_f
    const p0, 0x7f1206dd

    return p0

    :pswitch_10
    const p0, 0x7f1206db

    return p0

    :pswitch_11
    const p0, 0x7f1206dc

    return p0

    :pswitch_12
    const p0, 0x7f1206de

    return p0

    :pswitch_13
    const p0, 0x7f1206e2

    return p0

    :pswitch_14
    const-string p0, "resource_table_variants"

    .line 100
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1a

    const p0, 0x7f1206e3

    return p0

    :cond_1a
    const p0, 0x7f1206e4

    return p0

    .line 97
    :pswitch_15
    invoke-static {p1}, Ll/ۜᩴۚ;->۫(Ljava/lang/String;)I

    move-result p0

    return p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x708c653d -> :sswitch_8
        -0x622f1b4c -> :sswitch_7
        -0x5048ed36 -> :sswitch_6
        -0x3b2e48b9 -> :sswitch_5
        -0xe52dcc5 -> :sswitch_4
        -0x1549bf8 -> :sswitch_3
        0x2a9b1ec3 -> :sswitch_2
        0x5f480c41 -> :sswitch_1
        0x60f2292a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_e
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x18d2df7 -> :sswitch_c
        0x2de816 -> :sswitch_b
        0x1091a5d4 -> :sswitch_a
        0x5a3fe350 -> :sswitch_9
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x18d2df7 -> :sswitch_11
        0x2de816 -> :sswitch_10
        0x1091a5d4 -> :sswitch_f
        0x5a3fe350 -> :sswitch_e
        0x5a68dad2 -> :sswitch_d
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x18d2df7 -> :sswitch_15
        0x2de816 -> :sswitch_14
        0x1091a5d4 -> :sswitch_13
        0x5a3fe350 -> :sswitch_12
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch
.end method

.method public static ᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J
    .locals 0

    .line 761
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 762
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 764
    :try_start_0
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asLong()J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    :cond_0
    return-wide p2
.end method

.method public static ᩷(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;
    .locals 1

    .line 759
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lbin/mt/json/JSONObject;

    invoke-direct {p0}, Lbin/mt/json/JSONObject;-><init>()V

    return-object p0
.end method

.method public static ᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 5

    .line 774
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->size()I

    move-result v0

    const/16 v1, 0x28

    if-gt v0, v1, :cond_0

    return-object p0

    .line 775
    :cond_0
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    .line 777
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONObject$Member;

    add-int/lit8 v4, v2, 0x1

    if-ne v2, v1, :cond_1

    goto :goto_1

    .line 779
    :cond_1
    invoke-virtual {v3}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move v2, v4

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static ᩷(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "*"

    .line 785
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    .line 770
    invoke-static {p0, p1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 785
    :cond_0
    invoke-static {p1}, Ll/ۜᩴۚ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const v0, 0x7f12073d

    .line 0
    invoke-static {v0, p0, p1}, Ll/ۜᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/16 v0, 0x3a

    .line 729
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 731
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    add-int/2addr v0, v3

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v4, "zip_entry"

    .line 732
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    const-string v4, "axml"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    const-string v4, "resource"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_3

    :cond_1
    const-string v4, "dex_class"

    .line 733
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "dex_method"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "dex_field"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    return-object p0

    :cond_3
    :goto_1
    const-string p0, ";->"

    .line 734
    invoke-virtual {v0, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p0

    if-ltz p0, :cond_4

    .line 735
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p0, p0, 0x3

    .line 0
    invoke-static {p0, v0, v2}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    const-string p0, ";"

    .line 736
    invoke-virtual {v0, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_5

    .line 0
    invoke-static {v3, v1, v0}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_5
    :goto_2
    const-string p0, "L"

    .line 737
    invoke-virtual {v0, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_6
    const/16 p0, 0x2f

    const/16 v1, 0x2e

    .line 738
    invoke-virtual {v0, p0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    :goto_3
    return-object v0
.end method

.method public static ᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 755
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    .line 0
    :cond_1
    invoke-static {p0, p1, p2}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩸(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 245
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "user"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1
    const-string v0, "all"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "system"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    return-object p0

    :pswitch_0
    const p0, 0x7f120602

    new-array v0, v1, [Ljava/lang/Object;

    .line 770
    invoke-static {p0, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1
    const p0, 0x7f1205fe

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p0, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_2
    const p0, 0x7f120601

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p0, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x34e38dd1 -> :sswitch_2
        0x179a1 -> :sswitch_1
        0x36ebcb -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static bridge synthetic ᩸(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۜᩴۚ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ᩻(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 757
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lbin/mt/json/JSONObject;

    invoke-direct {p0}, Lbin/mt/json/JSONObject;-><init>()V

    return-object p0
.end method

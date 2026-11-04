.class public final Ll/ᩳ֨ۛ;
.super Ljava/lang/Object;
.source "XB5K"

# interfaces
.implements Ll/᩷۠ܶ;


# direct methods
.method public static ۙ()Ll/ۢܳۚ;
    .locals 4

    const-string v0, "fatal"

    .line 44
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "OUT_OF_MEMORY"

    const-string v3, "Not enough memory to complete this operation."

    .line 42
    invoke-static {v1, v2, v3, v0}, Ll/ۢܳۚ;->᩷(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    return-object v0
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 2

    .line 253
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "verify_workspace"

    invoke-static {p0, p3, v1, p4}, Ll/ۖܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {v0, p0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string p3, "fatal"

    .line 255
    invoke-static {p0, p1, p2, p3}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 3

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "prefix"

    const-string v0, ""

    .line 199
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "limit"

    const/16 v0, 0xc8

    .line 200
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "CLASS_NOT_FOUND"

    const-string v0, "Class not found"

    const-string v1, "mt_apk_dex_list_classes"

    const-string v2, "Verify dex classes in workspace"

    .line 194
    invoke-static {p0, p1, v0, v1, v2}, Ll/ᩳ֨ۛ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 6

    const-string v1, "Field not found"

    const-string v2, "Verify class outline for field signatures"

    const-string v0, "FIELD_NOT_FOUND"

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    .line 229
    invoke-static/range {v0 .. v5}, Ll/ᩳ֨ۛ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 6

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    .line 0
    invoke-static {v0, p3, v1, p4}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v0, "dex_class"

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v2, p5

    .line 243
    invoke-static/range {v0 .. v5}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-string p5, "locator"

    invoke-virtual {p3, p5, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string p4, "limit"

    const/16 p5, 0xc8

    .line 245
    invoke-virtual {p3, p4, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string p4, "mt_apk_dex_read_class_outline"

    .line 238
    invoke-static {p3, p0, p1, p4, p2}, Ll/ᩳ֨ۛ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Z)Ll/ۢܳۚ;
    .locals 6

    const-string v0, "path"

    const-string v1, "fatal"

    const-string v2, "Workspace is corrupt."

    const-string v3, "WORKSPACE_CORRUPT"

    if-eqz p0, :cond_0

    .line 60
    :try_start_0
    invoke-static {p0, v0}, Ll/֡ܰۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 61
    invoke-static {}, Ll/ᩴᩴۚ;->ۙ()Ll/᩸ᩴۚ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸ᩴۚ;->ۙ()Ll/ۡۘۚ;

    move-result-object v4

    .line 62
    invoke-virtual {v4, p0}, Ll/ۡۘۚ;->ۤ(Ljava/lang/String;)V

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    .line 63
    invoke-static {p0, v4}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩷ۨᩴ;->֨()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 64
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 65
    invoke-virtual {v4, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "temporary"

    .line 66
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 69
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    const-string v0, "mt_apk_workspace_open"

    const-string v4, "retry"

    const-string v5, "Recreate workspace from source APK"

    invoke-static {p0, v0, v4, v5}, Ll/ۖܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p1, p0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 67
    invoke-static {p0, v3, v2, v1}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0
    :try_end_0
    .catch Ll/ۢܳۚ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    .line 77
    invoke-static {p0, v3, v2, v1}, Ll/ۢܳۚ;->᩷(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۢ֨ۛ;Ll/ܽܿۛ;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, p1

    :goto_0
    if-eqz v2, :cond_8

    .line 27
    invoke-virtual {v2}, Ll/ܽܿۛ;->᩵()Ll/ܽܿۛ;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 28
    invoke-virtual {v3}, Ll/ܽܿۛ;->ۤ()I

    move-result v4

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 29
    :goto_1
    invoke-virtual {v2}, Ll/ܽܿۛ;->᩻()Ll/ܽܿۛ;

    move-result-object v5

    .line 31
    invoke-interface {p0, v2, v1}, Ll/ۢ֨ۛ;->᩷(Ll/ܽܿۛ;I)V

    if-eqz v3, :cond_3

    .line 32
    invoke-virtual {v2}, Ll/ܽܿۛ;->ۧ()Z

    move-result v6

    if-nez v6, :cond_3

    .line 33
    invoke-virtual {v3}, Ll/ܽܿۛ;->ۤ()I

    move-result v6

    if-ne v4, v6, :cond_1

    .line 34
    invoke-virtual {v2}, Ll/ܽܿۛ;->᩺()I

    move-result v2

    invoke-virtual {v3, v2}, Ll/ܽܿۛ;->ۙ(I)Ll/ܽܿۛ;

    move-result-object v2

    goto :goto_2

    :cond_1
    if-nez v5, :cond_2

    add-int/lit8 v1, v1, -0x1

    move-object v2, v3

    goto :goto_0

    :cond_2
    move-object v2, v5

    goto :goto_0

    .line 45
    :cond_3
    :goto_2
    invoke-virtual {v2}, Ll/ܽܿۛ;->ۤ()I

    move-result v3

    if-lez v3, :cond_4

    .line 46
    invoke-virtual {v2, v0}, Ll/ܽܿۛ;->ۙ(I)Ll/ܽܿۛ;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 51
    :cond_4
    :goto_3
    invoke-virtual {v2}, Ll/ܽܿۛ;->᩻()Ll/ܽܿۛ;

    move-result-object v3

    if-nez v3, :cond_6

    if-gtz v1, :cond_5

    goto :goto_4

    .line 52
    :cond_5
    invoke-interface {p0, v2, v1}, Ll/ۢ֨ۛ;->ۙ(Ll/ܽܿۛ;I)V

    .line 53
    invoke-virtual {v2}, Ll/ܽܿۛ;->᩵()Ll/ܽܿۛ;

    move-result-object v2

    add-int/lit8 v1, v1, -0x1

    goto :goto_3

    .line 56
    :cond_6
    :goto_4
    invoke-interface {p0, v2, v1}, Ll/ۢ֨ۛ;->ۙ(Ll/ܽܿۛ;I)V

    if-ne v2, p1, :cond_7

    goto :goto_5

    .line 59
    :cond_7
    invoke-virtual {v2}, Ll/ܽܿۛ;->᩻()Ll/ܽܿۛ;

    move-result-object v2

    goto :goto_0

    :cond_8
    :goto_5
    return-void
.end method

.method public static ۙ(I)Z
    .locals 3

    const/16 v0, 0x2000

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ge p0, v0, :cond_2

    const/16 v0, 0xa9

    if-eq p0, v0, :cond_1

    const/16 v0, 0xae

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    :goto_0
    return v1

    :cond_2
    const/16 v0, 0x203c

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2049

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2122

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2139

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2194

    if-lt p0, v0, :cond_3

    const/16 v0, 0x2199

    if-le p0, v0, :cond_27

    :cond_3
    const/16 v0, 0x21a9

    if-eq p0, v0, :cond_27

    const/16 v0, 0x21aa

    if-eq p0, v0, :cond_27

    const/16 v0, 0x231a

    if-eq p0, v0, :cond_27

    const/16 v0, 0x231b

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2328

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2388

    if-eq p0, v0, :cond_27

    const/16 v0, 0x23cf

    if-eq p0, v0, :cond_27

    const/16 v0, 0x23e9

    if-lt p0, v0, :cond_4

    const/16 v0, 0x23f3

    if-le p0, v0, :cond_27

    :cond_4
    const/16 v0, 0x23f8

    if-lt p0, v0, :cond_5

    const/16 v0, 0x23fa

    if-le p0, v0, :cond_27

    :cond_5
    const/16 v0, 0x24c2

    if-eq p0, v0, :cond_27

    const/16 v0, 0x25aa

    if-eq p0, v0, :cond_27

    const/16 v0, 0x25ab

    if-eq p0, v0, :cond_27

    const/16 v0, 0x25b6

    if-eq p0, v0, :cond_27

    const/16 v0, 0x25c0

    if-eq p0, v0, :cond_27

    const/16 v0, 0x25fb

    if-lt p0, v0, :cond_6

    const/16 v0, 0x25fe

    if-le p0, v0, :cond_27

    :cond_6
    const/16 v0, 0x2600

    if-lt p0, v0, :cond_7

    const/16 v0, 0x2605

    if-le p0, v0, :cond_27

    :cond_7
    const/16 v0, 0x2607

    if-lt p0, v0, :cond_8

    const/16 v0, 0x2612

    if-le p0, v0, :cond_27

    :cond_8
    const/16 v0, 0x2614

    if-lt p0, v0, :cond_9

    const/16 v0, 0x2685

    if-le p0, v0, :cond_27

    :cond_9
    const/16 v0, 0x2690

    if-lt p0, v0, :cond_a

    const/16 v0, 0x2705

    if-le p0, v0, :cond_27

    :cond_a
    const/16 v0, 0x2708

    if-lt p0, v0, :cond_b

    const/16 v0, 0x2712

    if-le p0, v0, :cond_27

    :cond_b
    const/16 v0, 0x2714

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2716

    if-eq p0, v0, :cond_27

    const/16 v0, 0x271d

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2721

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2728

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2733

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2734

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2744

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2747

    if-eq p0, v0, :cond_27

    const/16 v0, 0x274c

    if-eq p0, v0, :cond_27

    const/16 v0, 0x274e

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2753

    if-lt p0, v0, :cond_c

    const/16 v0, 0x2755

    if-le p0, v0, :cond_27

    :cond_c
    const/16 v0, 0x2757

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2763

    if-lt p0, v0, :cond_d

    const/16 v0, 0x2767

    if-le p0, v0, :cond_27

    :cond_d
    const/16 v0, 0x2795

    if-lt p0, v0, :cond_e

    const/16 v0, 0x2797

    if-le p0, v0, :cond_27

    :cond_e
    const/16 v0, 0x27a1

    if-eq p0, v0, :cond_27

    const/16 v0, 0x27b0

    if-eq p0, v0, :cond_27

    const/16 v0, 0x27bf

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2934

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2935

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2b05

    if-lt p0, v0, :cond_f

    const/16 v0, 0x2b07

    if-le p0, v0, :cond_27

    :cond_f
    const/16 v0, 0x2b1b

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2b1c

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2b50

    if-eq p0, v0, :cond_27

    const/16 v0, 0x2b55

    if-eq p0, v0, :cond_27

    const/16 v0, 0x3030

    if-eq p0, v0, :cond_27

    const/16 v0, 0x303d

    if-eq p0, v0, :cond_27

    const/16 v0, 0x3297

    if-eq p0, v0, :cond_27

    const/16 v0, 0x3299

    if-eq p0, v0, :cond_27

    const v0, 0x1f000

    if-lt p0, v0, :cond_10

    const v0, 0x1f0ff

    if-le p0, v0, :cond_27

    :cond_10
    const v0, 0x1f10d

    if-lt p0, v0, :cond_11

    const v0, 0x1f10f

    if-le p0, v0, :cond_27

    :cond_11
    const v0, 0x1f12f

    if-eq p0, v0, :cond_27

    const v0, 0x1f16c

    if-lt p0, v0, :cond_12

    const v0, 0x1f171

    if-le p0, v0, :cond_27

    :cond_12
    const v0, 0x1f17e

    if-eq p0, v0, :cond_27

    const v0, 0x1f17f

    if-eq p0, v0, :cond_27

    const v0, 0x1f18e

    if-eq p0, v0, :cond_27

    const v0, 0x1f191

    if-lt p0, v0, :cond_13

    const v0, 0x1f19a

    if-le p0, v0, :cond_27

    :cond_13
    const v0, 0x1f1ad

    if-lt p0, v0, :cond_14

    const v0, 0x1f1e5

    if-le p0, v0, :cond_27

    :cond_14
    const v0, 0x1f201

    if-lt p0, v0, :cond_15

    const v0, 0x1f20f

    if-le p0, v0, :cond_27

    :cond_15
    const v0, 0x1f21a

    if-eq p0, v0, :cond_27

    const v0, 0x1f22f

    if-eq p0, v0, :cond_27

    const v0, 0x1f232

    if-lt p0, v0, :cond_16

    const v0, 0x1f23a

    if-le p0, v0, :cond_27

    :cond_16
    const v0, 0x1f23c

    if-lt p0, v0, :cond_17

    const v0, 0x1f23f

    if-le p0, v0, :cond_27

    :cond_17
    const v0, 0x1f249

    if-lt p0, v0, :cond_18

    const v0, 0x1f3fa

    if-le p0, v0, :cond_27

    :cond_18
    const v0, 0x1f400

    if-lt p0, v0, :cond_19

    const v0, 0x1f53d

    if-le p0, v0, :cond_27

    :cond_19
    const v0, 0x1f546

    if-lt p0, v0, :cond_1a

    const v0, 0x1f64f

    if-le p0, v0, :cond_27

    :cond_1a
    const v0, 0x1f680

    if-lt p0, v0, :cond_1b

    const v0, 0x1f6ff

    if-le p0, v0, :cond_27

    :cond_1b
    const v0, 0x1f774

    if-lt p0, v0, :cond_1c

    const v0, 0x1f77f

    if-le p0, v0, :cond_27

    :cond_1c
    const v0, 0x1f7d5

    if-lt p0, v0, :cond_1d

    const v0, 0x1f7ff

    if-le p0, v0, :cond_27

    :cond_1d
    const v0, 0x1f80c

    if-lt p0, v0, :cond_1e

    const v0, 0x1f80f

    if-le p0, v0, :cond_27

    :cond_1e
    const v0, 0x1f848

    if-lt p0, v0, :cond_1f

    const v0, 0x1f84f

    if-le p0, v0, :cond_27

    :cond_1f
    const v0, 0x1f85a

    if-lt p0, v0, :cond_20

    const v0, 0x1f85f

    if-le p0, v0, :cond_27

    :cond_20
    const v0, 0x1f888

    if-lt p0, v0, :cond_21

    const v0, 0x1f88f

    if-le p0, v0, :cond_27

    :cond_21
    const v0, 0x1f8ae

    if-lt p0, v0, :cond_22

    const v0, 0x1f8ff

    if-le p0, v0, :cond_27

    :cond_22
    const v0, 0x1f90c

    if-lt p0, v0, :cond_23

    const v0, 0x1f93a

    if-le p0, v0, :cond_27

    :cond_23
    const v0, 0x1f93c

    if-lt p0, v0, :cond_24

    const v0, 0x1f945

    if-le p0, v0, :cond_27

    :cond_24
    const v0, 0x1f947

    if-lt p0, v0, :cond_25

    const v0, 0x1faff

    if-le p0, v0, :cond_27

    :cond_25
    const v0, 0x1fc00

    if-lt p0, v0, :cond_26

    const v0, 0x1fffd

    if-gt p0, v0, :cond_26

    goto :goto_1

    :cond_26
    return v2

    :cond_27
    :goto_1
    return v1
.end method

.method public static ۤ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 6

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v0, "zip_entry"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    .line 173
    invoke-static/range {v0 .. v5}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "locator"

    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "byteOffset"

    const/4 p2, 0x0

    .line 174
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "maxBytes"

    const/16 p2, 0x100

    .line 175
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 176
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    const-string p2, "retry"

    const-string v0, "Read this ZIP entry as hex bytes"

    const-string v1, "mt_apk_read_bytes"

    invoke-static {p0, v1, p2, v0}, Ll/ۖܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p1, p0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string p1, "Not a text entry. Use mt_apk_read_bytes to inspect raw bytes."

    const-string p2, "fatal"

    const-string v0, "NOT_TEXT_ENTRY"

    .line 178
    invoke-static {p0, v0, p1, p2}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 3

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "view"

    const-string v0, "resource_table"

    .line 124
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "typeName"

    const-string v0, "*"

    .line 125
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "variant"

    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "limit"

    const/16 v0, 0xc8

    .line 126
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "RESOURCE_NOT_FOUND"

    const-string v0, "Resource not found."

    const-string v1, "mt_apk_resource_list"

    const-string v2, "Verify resource table entries in workspace"

    .line 119
    invoke-static {p0, p1, v0, v1, v2}, Ll/ᩳ֨ۛ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 6

    const-string v1, "Method not found"

    const-string v2, "Verify class outline for method signatures"

    const-string v0, "METHOD_NOT_FOUND"

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    .line 214
    invoke-static/range {v0 .. v5}, Ll/ᩳ֨ۛ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩸(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 10

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v0, "axml"

    const/4 v2, 0x0

    const/4 v8, 0x0

    move-object v1, p2

    move-object v3, v8

    move-object v4, v6

    move-object v5, v7

    .line 141
    invoke-static/range {v0 .. v5}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "axml"

    move-object v1, p2

    .line 145
    invoke-static/range {v0 .. v5}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "locator"

    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "limit"

    const/16 p2, 0x1f4

    .line 146
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "maxChars"

    const p2, 0xc000

    .line 147
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "startLine"

    const/4 p2, 0x0

    .line 148
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "startColumn"

    .line 149
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 150
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    const-string p2, "retry"

    const-string v0, "Read this ZIP entry as decoded AXML"

    const-string v1, "mt_apk_read_text"

    invoke-static {p0, v1, p2, v0}, Ll/ۖܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p1, p0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 155
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "suggestedLocator"

    invoke-virtual {p1, p2, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "NOT_TEXT_ENTRY"

    const-string v0, "Not a text entry. This ZIP entry appears to be Android Binary XML (AXML). Use the suggested axml:<entry> locator."

    const-string v1, "fatal"

    .line 152
    invoke-static {p2, v0, v1, p0, p1}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ۙ(FLjava/lang/Float;Ljava/lang/Float;)Ljava/lang/Object;
    .locals 1

    .line 22
    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Integer;

    .line 39
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-float v0, p2

    .line 40
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    sub-int/2addr p3, p2

    int-to-float p2, p3

    mul-float p1, p1, p2

    add-float/2addr p1, v0

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

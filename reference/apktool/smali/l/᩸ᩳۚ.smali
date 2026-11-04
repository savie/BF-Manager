.class public final Ll/᩸ᩳۚ;
.super Ljava/lang/Object;
.source "56G1"


# instance fields
.field public final ۙ:Ll/ۚᩳۚ;


# direct methods
.method public constructor <init>(Ll/ۚᩳۚ;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Ll/᩸ᩳۚ;->ۙ:Ll/ۚᩳۚ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ᩳۚ;->ۙ:Ll/ۚᩳۚ;

    return-object p0
.end method

.method private ۙ(Ll/ܳᩳۚ;)Ll/ܿ᩻ܳ;
    .locals 17

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    const-string v10, "attachment; filename=\"download\"; filename*=UTF-8\'\'"

    .line 116
    iget-object v11, v0, Ll/ܳᩳۚ;->ᩴ:Ll/۫ᩳۚ;

    .line 117
    iget-object v1, v9, Ll/᩸ᩳۚ;->ۙ:Ll/ۚᩳۚ;

    iget-object v1, v1, Ll/ۚᩳۚ;->ᩳ:Ll/᩷ܿۚ;

    iget-object v2, v11, Ll/۫ᩳۚ;->᩻:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/᩷ܿۚ;->ۙ(Ljava/lang/String;)Ll/ᩳܿۚ;

    move-result-object v12

    const/4 v1, 0x0

    .line 121
    :try_start_0
    iget-object v2, v9, Ll/᩸ᩳۚ;->ۙ:Ll/ۚᩳۚ;

    invoke-virtual {v2, v0}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;)V

    .line 122
    iget-object v2, v9, Ll/᩸ᩳۚ;->ۙ:Ll/ۚᩳۚ;

    iget-object v3, v11, Ll/۫ᩳۚ;->᩻:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4, v4}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;ZZ)J

    move-result-wide v13

    .line 123
    iget-object v2, v0, Ll/ܳᩳۚ;->ۤ:Ll/ۗ᩻ܳ;

    invoke-virtual {v2}, Ll/ۗ᩻ܳ;->۫()Ll/ۨ᩻ܳ;

    move-result-object v2

    sget-object v3, Ll/ۨ᩻ܳ;->ᩳ:Ll/ۨ᩻ܳ;

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const/4 v8, 0x0

    :goto_0
    if-nez v8, :cond_1

    .line 124
    iget-object v2, v9, Ll/᩸ᩳۚ;->ۙ:Ll/ۚᩳۚ;

    move-object/from16 v16, v2

    monitor-enter v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iput-wide v13, v11, Ll/۫ᩳۚ;->ܶ:J

    monitor-exit v16

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0

    :cond_1
    :goto_1
    if-eqz v8, :cond_2

    :goto_2
    move-object v15, v1

    goto :goto_3

    .line 125
    :cond_2
    iget-object v2, v9, Ll/᩸ᩳۚ;->ۙ:Ll/ۚᩳۚ;

    iget-object v2, v2, Ll/ۚᩳۚ;->ᩳ:Ll/᩷ܿۚ;

    iget-object v3, v11, Ll/۫ᩳۚ;->᩻:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ll/᩷ܿۚ;->ۤ(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ۧ᩷()Ljava/io/InputStream;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    .line 126
    :goto_3
    :try_start_3
    new-instance v6, Ll/ۤᩳۚ;

    move-object v1, v6

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object v4, v15

    move-object v5, v12

    move-object v0, v6

    move-wide v6, v13

    invoke-direct/range {v1 .. v8}, Ll/ۤᩳۚ;-><init>(Ll/᩸ᩳۚ;Ll/ܳᩳۚ;Ljava/io/InputStream;Ll/ᩳܿۚ;JZ)V

    const-string v1, "Content-Length"

    .line 127
    invoke-static {v13, v14}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "Cache-Control"

    const-string v2, "no-store"

    .line 128
    invoke-virtual {v0, v1, v2}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "Accept-Ranges"

    const-string v2, "none"

    .line 129
    invoke-virtual {v0, v1, v2}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "X-Content-Type-Options"

    const-string v2, "nosniff"

    .line 130
    invoke-virtual {v0, v1, v2}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    iget-object v1, v11, Ll/۫ᩳۚ;->᩻:Ljava/lang/String;

    const/16 v2, 0x2f

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Content-Disposition"

    .line 132
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "UTF-8"

    .line 133
    invoke-static {v1, v4}, Ll/᩸۬᩹;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "+"

    const-string v5, "%20"

    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 132
    invoke-virtual {v0, v2, v1}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    invoke-virtual {v0}, Ll/ܿ᩻ܳ;->ۙ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-object v0

    :catchall_1
    move-exception v0

    move-object v1, v15

    goto :goto_4

    :catchall_2
    move-exception v0

    :goto_4
    if-eqz v1, :cond_3

    .line 139
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v1, v0

    .line 140
    invoke-virtual {v12}, Ll/ᩳܿۚ;->close()V

    throw v1

    :cond_3
    :goto_5
    invoke-virtual {v12}, Ll/ᩳܿۚ;->close()V

    .line 142
    throw v0
.end method

.method public static ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONObject;)Ll/ܿ᩻ܳ;
    .locals 1

    const-string v0, "application/json; charset=utf-8"

    .line 244
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object p0

    const-string p1, "Cache-Control"

    const-string v0, "no-store"

    .line 245
    invoke-virtual {p0, p1, v0}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    invoke-virtual {p0}, Ll/ܿ᩻ܳ;->ۙ()V

    return-object p0
.end method

.method public static ۙ(Ll/ۢܳۚ;)Ll/᩶᩻ܳ;
    .locals 3

    .line 232
    iget-object v0, p0, Ll/ۢܳۚ;->ܰ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "TRANSFER_LENGTH_REQUIRED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "TRANSFER_REVOKED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "TRANSFER_GONE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_3
    const-string v1, "TRANSFER_BUSY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_4
    const-string v1, "TRANSFER_METHOD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_5
    const-string v1, "TRANSFER_LIMIT"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_6
    const-string v1, "TRANSFER_NOT_FOUND"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_7
    const-string v1, "TRANSFER_UNAUTHORIZED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_8
    const-string v1, "FILE_ACCESS_DENIED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_9
    const-string v1, "FILE_ALREADY_EXISTS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 239
    iget-boolean p0, p0, Ll/ۢܳۚ;->ۢ:Z

    if-eqz p0, :cond_a

    sget-object p0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    return-object p0

    .line 238
    :pswitch_0
    sget-object p0, Ll/᩶᩻ܳ;->۬:Ll/᩶᩻ܳ;

    return-object p0

    .line 236
    :pswitch_1
    sget-object p0, Ll/᩶᩻ܳ;->ۙۙ:Ll/᩶᩻ܳ;

    return-object p0

    .line 235
    :pswitch_2
    sget-object p0, Ll/᩶᩻ܳ;->᩸ۙ:Ll/᩶᩻ܳ;

    return-object p0

    .line 233
    :pswitch_3
    sget-object p0, Ll/᩶᩻ܳ;->᩺ۙ:Ll/᩶᩻ܳ;

    return-object p0

    .line 234
    :pswitch_4
    sget-object p0, Ll/᩶᩻ܳ;->ۡ:Ll/᩶᩻ܳ;

    return-object p0

    .line 237
    :pswitch_5
    sget-object p0, Ll/᩶᩻ܳ;->ᩳ:Ll/᩶᩻ܳ;

    return-object p0

    .line 239
    :cond_a
    sget-object p0, Ll/᩶᩻ܳ;->ۜ:Ll/᩶᩻ܳ;

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3b9eac9a -> :sswitch_9
        -0x2e75ead -> :sswitch_8
        0x8a178c8 -> :sswitch_7
        0x18491782 -> :sswitch_6
        0x2aeb8247 -> :sswitch_5
        0x34046bb5 -> :sswitch_4
        0x436e95cd -> :sswitch_3
        0x4370c473 -> :sswitch_2
        0x5527822a -> :sswitch_1
        0x584b4884 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_2
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method private ᩷(Ll/ܳᩳۚ;)Ll/ܿ᩻ܳ;
    .locals 6

    .line 74
    iget-object v0, p0, Ll/᩸ᩳۚ;->ۙ:Ll/ۚᩳۚ;

    iget-object v1, p1, Ll/ܳᩳۚ;->ᩴ:Ll/۫ᩳۚ;

    .line 76
    :try_start_0
    iget-object v2, v0, Ll/ۚᩳۚ;->֨:Ll/֡ܿۚ;

    iget-object v3, v1, Ll/۫ᩳۚ;->᩻:Ljava/lang/String;

    iget-boolean v4, v1, Ll/۫ᩳۚ;->ۧ:Z

    new-instance v5, Ll/ۙᩳۚ;

    invoke-direct {v5, p0, v1, p1}, Ll/ۙᩳۚ;-><init>(Ll/᩸ᩳۚ;Ll/۫ᩳۚ;Ll/ܳᩳۚ;)V

    invoke-virtual {v2, v3, v4, v5}, Ll/֡ܿۚ;->ۙ(Ljava/lang/String;ZLl/᩺ܿۚ;)Ll/᩶ܿۚ;

    move-result-object v2

    .line 106
    iget-object v3, v2, Ll/᩶ܿۚ;->᩸:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Ll/᩶ܿۚ;->ܳ:Lbin/mt/json/JSONArray;

    invoke-virtual {v0, p1, v3, v2}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V

    .line 107
    invoke-virtual {v0, v1}, Ll/ۚᩳۚ;->ۙ(Ll/۫ᩳۚ;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 224
    sget-object v3, Ll/᩶᩻ܳ;->ۚۙ:Ll/᩶᩻ܳ;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v3, v2}, Ll/᩸ᩳۚ;->ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONObject;)Ll/ܿ᩻ܳ;

    move-result-object p1
    :try_end_0
    .catch Ll/ۢܳۚ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v2

    .line 109
    invoke-virtual {v0, p1, v2}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;Ll/ۢܳۚ;)V

    .line 110
    invoke-static {v2}, Ll/᩸ᩳۚ;->ۙ(Ll/ۢܳۚ;)Ll/᩶᩻ܳ;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "ok"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "data"

    sget-object v4, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 111
    invoke-virtual {v0, v1}, Ll/ۚᩳۚ;->ۙ(Ll/۫ᩳۚ;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "error"

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextActions"

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 110
    invoke-static {p1, v0}, Ll/᩸ᩳۚ;->ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONObject;)Ll/ܿ᩻ܳ;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ۙ(Ll/ۗ᩻ܳ;)Ll/ܿ᩻ܳ;
    .locals 1

    .line 34
    :try_start_0
    iget-object v0, p0, Ll/᩸ᩳۚ;->ۙ:Ll/ۚᩳۚ;

    invoke-virtual {v0, p1}, Ll/ۚᩳۚ;->ۙ(Ll/ۗ᩻ܳ;)Ll/۫ᩳۚ;
    :try_end_0
    .catch Ll/ۢܳۚ; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    .line 228
    invoke-static {p1}, Ll/᩸ᩳۚ;->ۙ(Ll/ۢܳۚ;)Ll/᩶᩻ܳ;

    move-result-object v0

    invoke-static {p1}, Ll/ۚᩳۚ;->ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {v0, p1}, Ll/᩸ᩳۚ;->ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONObject;)Ll/ܿ᩻ܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(Ll/ۗ᩻ܳ;)Ll/ܿ᩻ܳ;
    .locals 4

    .line 43
    iget-object v0, p0, Ll/᩸ᩳۚ;->ۙ:Ll/ۚᩳۚ;

    const/4 v1, 0x0

    .line 45
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ۚᩳۚ;->᩷(Ll/ۗ᩻ܳ;)Ll/ܳᩳۚ;

    move-result-object v1

    if-nez v1, :cond_0

    .line 48
    invoke-virtual {v0, p1}, Ll/ۚᩳۚ;->ۙ(Ll/ۗ᩻ܳ;)Ll/۫ᩳۚ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۚᩳۚ;->ۙ(Ll/۫ᩳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 224
    sget-object v2, Ll/᩶᩻ܳ;->ۚۙ:Ll/᩶᩻ܳ;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    invoke-static {p1, v3}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {v2, p1}, Ll/᩸ᩳۚ;->ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONObject;)Ll/ܿ᩻ܳ;

    move-result-object p1

    return-object p1

    .line 50
    :cond_0
    iget-object p1, v1, Ll/ܳᩳۚ;->ᩴ:Ll/۫ᩳۚ;

    iget-boolean p1, p1, Ll/۫ᩳۚ;->᩵:Z

    if-eqz p1, :cond_1

    .line 51
    invoke-direct {p0, v1}, Ll/᩸ᩳۚ;->᩷(Ll/ܳᩳۚ;)Ll/ܿ᩻ܳ;

    move-result-object p1

    .line 52
    invoke-virtual {v0, v1}, Ll/ۚᩳۚ;->᩷(Ll/ܳᩳۚ;)V

    return-object p1

    .line 55
    :cond_1
    invoke-direct {p0, v1}, Ll/᩸ᩳۚ;->ۙ(Ll/ܳᩳۚ;)Ll/ܿ᩻ܳ;

    move-result-object p1
    :try_end_0
    .catch Ll/ۢܳۚ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "TRANSFER_IO_ERROR"

    const-string v2, "File transfer could not complete; query its recorded result."

    .line 63
    invoke-static {p1, v2}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    if-eqz v1, :cond_2

    .line 66
    invoke-virtual {v0, v1, p1}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;Ll/ۢܳۚ;)V

    .line 67
    invoke-virtual {v0, v1}, Ll/ۚᩳۚ;->᩷(Ll/ܳᩳۚ;)V

    .line 228
    :cond_2
    :goto_0
    invoke-static {p1}, Ll/᩸ᩳۚ;->ۙ(Ll/ۢܳۚ;)Ll/᩶᩻ܳ;

    move-result-object v0

    invoke-static {p1}, Ll/ۚᩳۚ;->ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {v0, p1}, Ll/᩸ᩳۚ;->ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONObject;)Ll/ܿ᩻ܳ;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p1

    if-eqz v1, :cond_2

    .line 58
    invoke-virtual {v0, v1, p1}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;Ll/ۢܳۚ;)V

    .line 59
    invoke-virtual {v0, v1}, Ll/ۚᩳۚ;->᩷(Ll/ܳᩳۚ;)V

    goto :goto_0
.end method

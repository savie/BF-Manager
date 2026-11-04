.class public final Ll/ܳۧۤ;
.super Ljava/lang/Object;
.source "Q5UU"

# interfaces
.implements Ll/᩸ۧۤ;


# static fields
.field public static ܰ:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public static ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 24
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "ok"

    const/4 v2, 0x1

    .line 25
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "data"

    .line 26
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "error"

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 27
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "nextActions"

    .line 28
    invoke-static {p1}, Ll/ۨᩴۚ;->ۙ(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 17
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    iget-object v1, p0, Ll/ۢܳۚ;->۟:Lbin/mt/json/JSONArray;

    invoke-static {p0, v0, v1}, Ll/ܳۧۤ;->ۙ(Ll/ۢܳۚ;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۢܳۚ;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;
    .locals 6

    .line 35
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "code"

    iget-object v2, p0, Ll/ۢܳۚ;->ܰ:Ljava/lang/String;

    .line 36
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "message"

    .line 37
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "severity"

    iget-object v2, p0, Ll/ۢܳۚ;->᩶:Ljava/lang/String;

    .line 38
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "recoverable"

    iget-boolean v2, p0, Ll/ۢܳۚ;->ۢ:Z

    .line 39
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "retrySameArguments"

    iget-boolean v2, p0, Ll/ۢܳۚ;->֨:Z

    .line 40
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ۢܳۚ;->ܿ:Lbin/mt/json/JSONObject;

    const-string v2, "argument"

    .line 0
    invoke-static {v1, v2, v0, v2}, Ll/۟ܺ᩹;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "badValue"

    invoke-static {v1, v2, v0, v2}, Ll/۟ܺ᩹;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 42
    iget-object p0, p0, Ll/ۢܳۚ;->ᩳ:Lbin/mt/json/JSONValue;

    const-string v2, "null"

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v3

    if-eqz v3, :cond_1

    move-object p0, v2

    goto :goto_0

    .line 96
    :cond_1
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string p0, "string"

    goto :goto_0

    .line 98
    :cond_2
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v3

    if-eqz v3, :cond_3

    const-string p0, "number"

    goto :goto_0

    .line 100
    :cond_3
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v3

    if-eqz v3, :cond_4

    const-string p0, "boolean"

    goto :goto_0

    .line 102
    :cond_4
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v3

    if-eqz v3, :cond_5

    const-string p0, "array"

    goto :goto_0

    .line 104
    :cond_5
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result p0

    if-eqz p0, :cond_6

    const-string p0, "object"

    goto :goto_0

    :cond_6
    const-string p0, "unknown"

    :goto_0
    const-string v3, "badValueType"

    .line 43
    invoke-virtual {v0, v3, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "allowedValues"

    .line 44
    invoke-virtual {v1, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 58
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    if-nez v3, :cond_7

    goto :goto_2

    .line 62
    :cond_7
    invoke-virtual {v3}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbin/mt/json/JSONValue;

    .line 63
    invoke-static {v5}, Ll/ۨᩴۚ;->ۙ(Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_8

    move-object v5, v2

    .line 64
    :cond_8
    invoke-virtual {v4, v5}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_1

    .line 44
    :cond_9
    :goto_2
    invoke-virtual {p0, v0, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "example"

    .line 0
    invoke-static {v1, v0, p0, v0}, Ll/۟ܺ᩹;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    if-nez p1, :cond_a

    .line 46
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :cond_a
    const-string v0, "diagnostics"

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 47
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "ok"

    const/4 v1, 0x0

    .line 48
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "data"

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 49
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "error"

    .line 50
    invoke-virtual {p1, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "nextActions"

    .line 51
    invoke-static {p2}, Ll/ۨᩴۚ;->ۙ(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_0

    .line 12
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method public static declared-synchronized ۙ()Ljava/util/concurrent/Executor;
    .locals 3

    .line 2
    const-class v0, Ll/ܳۧۤ;

    .line 3
    monitor-enter v0

    .line 38
    :try_start_0
    sget-object v1, Ll/ܳۧۤ;->ܰ:Ljava/util/concurrent/ExecutorService;

    if-nez v1, :cond_0

    const-string v1, "ExoPlayer:BackgroundExecutor"

    .line 39
    sget-object v2, Ll/ۜۨۙ;->᩸:Ljava/lang/String;

    .line 915
    new-instance v2, Ll/ۖۨۙ;

    invoke-direct {v2, v1}, Ll/ۖۨۙ;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    .line 39
    sput-object v1, Ll/ܳۧۤ;->ܰ:Ljava/util/concurrent/ExecutorService;

    .line 41
    :cond_0
    sget-object v1, Ll/ܳۧۤ;->ܰ:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static ᩷(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 17
    invoke-static {p0}, Ll/ܳۧۤ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ۙ(Ll/ᩴܺۤ;)V
    .locals 3

    .line 15
    new-instance v0, Ll/ܰ֫ۤ;

    invoke-direct {v0}, Ll/ܰ֫ۤ;-><init>()V

    .line 16
    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    .line 17
    invoke-virtual {p1}, Ll/ᩴܺۤ;->᩷()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰ֫ۤ;

    invoke-virtual {v2}, Ll/ܰ֫ۤ;->ۧ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-virtual {v1, v2}, Ljava/util/zip/CRC32;->update([B)V

    .line 18
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܰ֫ۤ;->ۙ(J)V

    .line 19
    invoke-virtual {p1, v0}, Ll/ᩴܺۤ;->ۙ(Ll/ܰ֫ۤ;)V

    return-void
.end method

.class public final Ll/ۚᩳۚ;
.super Ljava/lang/Object;
.source "Y6IM"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ֡:Ljava/security/SecureRandom;

.field public final ֨:Ll/֡ܿۚ;

.field public ۟:Ljava/util/concurrent/ScheduledExecutorService;

.field public final ۢ:Ljava/util/LinkedHashMap;

.field public ܰ:I

.field public ܿ:Z

.field public final ᩳ:Ll/᩷ܿۚ;

.field public final ᩶:Ll/ܶۘۚ;


# direct methods
.method public constructor <init>(Ll/᩷ܿۚ;Ll/֡ܿۚ;Ll/ܶۘۚ;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Ll/ۚᩳۚ;->֡:Ljava/security/SecureRandom;

    .line 49
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۚᩳۚ;->ۢ:Ljava/util/LinkedHashMap;

    .line 57
    iput-object p1, p0, Ll/ۚᩳۚ;->ᩳ:Ll/᩷ܿۚ;

    .line 58
    iput-object p2, p0, Ll/ۚᩳۚ;->֨:Ll/֡ܿۚ;

    .line 59
    iput-object p3, p0, Ll/ۚᩳۚ;->᩶:Ll/ܶۘۚ;

    return-void
.end method

.method public static ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;
    .locals 4

    .line 365
    iget-object v0, p0, Ll/ۢܳۚ;->ܿ:Lbin/mt/json/JSONObject;

    .line 366
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "changed"

    .line 375
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-nez v3, :cond_0

    .line 376
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 367
    :cond_0
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "stateKnown"

    .line 375
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-nez v3, :cond_1

    .line 376
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 368
    :cond_1
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "warnings"

    .line 369
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    goto :goto_0

    .line 370
    :cond_2
    new-instance v3, Lbin/mt/json/JSONArray;

    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-direct {v3, v0}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    move-object v0, v3

    .line 369
    :goto_0
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 371
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p0, v0, v1}, Ll/ܳۧۤ;->ۙ(Ll/ۢܳۚ;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 2

    const-string v0, "warning"

    const/4 v1, 0x0

    .line 360
    invoke-static {v1, p0, p1, v0}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method

.method private ᩷()V
    .locals 9

    .line 308
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 309
    iget-object v2, p0, Ll/ۚᩳۚ;->ۢ:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 310
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 311
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫ᩳۚ;

    .line 312
    iget-object v4, v3, Ll/۫ᩳۚ;->ۙ:Ll/ܳᩳۚ;

    if-eqz v4, :cond_1

    goto :goto_0

    .line 313
    :cond_1
    iget-wide v4, v3, Ll/۫ᩳۚ;->ۗ:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_2

    sub-long v4, v0, v4

    const-wide/32 v6, 0x927c0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_2

    .line 314
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 315
    :cond_2
    iget-wide v4, v3, Ll/۫ᩳۚ;->ᩴ:J

    cmp-long v6, v0, v4

    if-ltz v6, :cond_0

    const-string v4, "ready"

    iget-object v5, v3, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    iget-boolean v4, v3, Ll/۫ᩳۚ;->᩵:Z

    if-nez v4, :cond_0

    const-string v4, "completed"

    iget-object v5, v3, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    .line 316
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "failed"

    iget-object v5, v3, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    :cond_3
    const-string v4, "expired"

    .line 303
    iput-object v4, v3, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    .line 304
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iput-wide v4, v3, Ll/۫ᩳۚ;->ۗ:J

    goto :goto_0

    :cond_4
    return-void
.end method

.method private declared-synchronized ᩸(Ljava/lang/String;)Ll/۫ᩳۚ;
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 287
    :try_start_0
    invoke-direct {p0}, Ll/ۚᩳۚ;->᩷()V

    .line 299
    iget-boolean v1, p0, Ll/ۚᩳۚ;->ܿ:Z

    if-nez v1, :cond_1

    .line 289
    invoke-static {}, Ll/᩸ܳۚ;->ۙ()Ll/᩸ܳۚ;

    move-result-object v1

    .line 290
    iget-object v2, p0, Ll/ۚᩳۚ;->ۢ:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫ᩳۚ;

    if-eqz p1, :cond_0

    .line 291
    iget-object v2, p1, Ll/۫ᩳۚ;->᩸:Ljava/lang/String;

    iget-object v3, v1, Ll/᩸ܳۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-wide v2, p1, Ll/۫ᩳۚ;->᩷:J

    iget-wide v4, v1, Ll/᩸ܳۚ;->ۙ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    iget-object v2, p0, Ll/ۚᩳۚ;->᩶:Ll/ܶۘۚ;

    iget-object v1, v1, Ll/᩸ܳۚ;->᩷:Ljava/lang/String;

    .line 293
    invoke-virtual {v2, v4, v5, v1}, Ll/ܶۘۚ;->ۙ(JLjava/lang/String;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 295
    monitor-exit v0

    return-object p1

    :cond_0
    :try_start_1
    const-string p1, "TRANSFER_NOT_FOUND"

    const-string v1, "No transfer ticket is available for this caller."

    .line 294
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_1
    const-string p1, "TRANSFER_STOPPED"

    const-string v1, "The transfer service has stopped."

    .line 299
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :catchall_0
    move-exception p1

    .line 294
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 343
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v0, p0

    .line 344
    monitor-enter v0

    const/4 v2, 0x1

    .line 345
    :try_start_0
    iput-boolean v2, p0, Ll/ۚᩳۚ;->ܿ:Z

    .line 346
    iget-object v2, p0, Ll/ۚᩳۚ;->۟:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 347
    :cond_0
    iget-object v2, p0, Ll/ۚᩳۚ;->ۢ:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫ᩳۚ;

    .line 348
    iget-object v4, v3, Ll/۫ᩳۚ;->ۙ:Ll/ܳᩳۚ;

    if-eqz v4, :cond_1

    const-string v4, "publishing"

    iget-object v5, v3, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 349
    iget-object v4, v3, Ll/۫ᩳۚ;->ۙ:Ll/ܳᩳۚ;

    const-string v5, "TRANSFER_CANCELLED"

    iput-object v5, v4, Ll/ܳᩳۚ;->ۙ:Ljava/lang/String;

    .line 350
    iget-object v4, v4, Ll/ܳᩳۚ;->᩸:Ljava/lang/Thread;

    invoke-virtual {v4}, Ljava/lang/Thread;->interrupt()V

    .line 351
    iget-object v3, v3, Ll/۫ᩳۚ;->ۙ:Ll/ܳᩳۚ;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 354
    :cond_2
    iget-object v2, p0, Ll/ۚᩳۚ;->ۢ:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 355
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 356
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳᩳۚ;

    iget-object v1, v1, Ll/ܳᩳۚ;->ۤ:Ll/ۗ᩻ܳ;

    invoke-virtual {v1}, Ll/ۗ᩻ܳ;->ۙ()V

    goto :goto_1

    :cond_3
    return-void

    :catchall_0
    move-exception v1

    .line 355
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۙ(Ljava/lang/String;ZZ)J
    .locals 6

    .line 251
    iget-object v0, p0, Ll/ۚᩳۚ;->ᩳ:Ll/᩷ܿۚ;

    invoke-virtual {v0}, Ll/᩷ܿۚ;->ۙ()Ll/ۡۘۚ;

    move-result-object v1

    if-eqz p2, :cond_0

    const-string v2, "path"

    .line 252
    invoke-static {p1, v1, v2}, Ll/᩷ܿۚ;->᩷(Ljava/lang/String;Ll/ۡۘۚ;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 253
    :cond_0
    invoke-virtual {v1, p1}, Ll/ۡۘۚ;->ۤ(Ljava/lang/String;)V

    .line 254
    :goto_0
    invoke-virtual {v0, p1}, Ll/᩷ܿۚ;->ۤ(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v2

    .line 255
    invoke-virtual {v0, v2}, Ll/᩷ܿۚ;->ۙ(Ll/᩷ۨᩴ;)V

    .line 256
    invoke-virtual {v0, p1}, Ll/᩷ܿۚ;->᩸(Ljava/lang/String;)Ll/֫ۨᩴ;

    move-result-object p1

    .line 257
    invoke-virtual {p1}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v3

    sget-object v4, Ll/۫ۨᩴ;->ᩳ:Ll/۫ۨᩴ;

    if-eq v3, v4, :cond_4

    if-eqz p2, :cond_1

    .line 258
    invoke-virtual {p1}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v3

    sget-object v5, Ll/۫ۨᩴ;->֡:Ll/۫ۨᩴ;

    if-eq v3, v5, :cond_4

    .line 259
    :cond_1
    invoke-virtual {p1}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object p2

    sget-object p3, Ll/۫ۨᩴ;->֡:Ll/۫ۨᩴ;

    if-eq p2, p3, :cond_3

    .line 261
    invoke-virtual {p1}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object p1

    sget-object p2, Ll/۫ۨᩴ;->᩶:Ll/۫ۨᩴ;

    if-ne p1, p2, :cond_2

    const-string p1, "FILE_IS_DIRECTORY"

    const-string p2, "Only regular files can be transferred."

    .line 262
    invoke-static {p1, p2}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_2
    const-string p1, "FILE_UNSUPPORTED_TYPE"

    const-string p2, "Links and special files cannot be transferred."

    .line 263
    invoke-static {p1, p2}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_3
    const-string p1, "FILE_NOT_FOUND"

    const-string p2, "The file does not exist."

    .line 260
    invoke-static {p1, p2}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_4
    if-eqz p2, :cond_b

    if-nez p3, :cond_6

    .line 267
    invoke-virtual {p1}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object p2

    sget-object p3, Ll/۫ۨᩴ;->֡:Ll/۫ۨᩴ;

    if-ne p2, p3, :cond_5

    goto :goto_1

    :cond_5
    const-string p1, "FILE_ALREADY_EXISTS"

    const-string p2, "The destination exists and overwrite is false."

    .line 268
    invoke-static {p1, p2}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    .line 269
    :cond_6
    :goto_1
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->getParent()Ljava/lang/String;

    move-result-object p2

    const-string p3, "FILE_PARENT_NOT_FOUND"

    if-eqz p2, :cond_a

    .line 271
    invoke-virtual {v1, p2}, Ll/ۡۘۚ;->᩸(Ljava/lang/String;)V

    .line 272
    invoke-virtual {v0, p2}, Ll/᩷ܿۚ;->᩸(Ljava/lang/String;)Ll/֫ۨᩴ;

    move-result-object p2

    invoke-virtual {p2}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object p2

    .line 273
    sget-object v0, Ll/۫ۨᩴ;->֡:Ll/۫ۨᩴ;

    if-eq p2, v0, :cond_9

    const-string p3, "The parent is not a directory."

    const-string v0, "FILE_NOT_DIRECTORY"

    if-eq p2, v4, :cond_8

    .line 277
    sget-object v1, Ll/۫ۨᩴ;->᩶:Ll/۫ۨᩴ;

    if-ne p2, v1, :cond_7

    goto :goto_2

    .line 278
    :cond_7
    invoke-static {v0, p3}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    .line 276
    :cond_8
    invoke-static {v0, p3}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_9
    const-string p1, "The destination parent does not exist."

    .line 274
    invoke-static {p3, p1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_a
    const-string p1, "The destination has no parent."

    .line 270
    invoke-static {p3, p1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    .line 280
    :cond_b
    :goto_2
    invoke-virtual {p1}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object p2

    sget-object p3, Ll/۫ۨᩴ;->֡:Ll/۫ۨᩴ;

    const-wide/16 v0, 0x0

    if-ne p2, p3, :cond_c

    move-wide p1, v0

    goto :goto_3

    :cond_c
    invoke-virtual {p1}, Ll/֫ۨᩴ;->ۤ()J

    move-result-wide p1

    :goto_3
    cmp-long p3, p1, v0

    if-ltz p3, :cond_d

    const-wide v0, 0x1fffffffffffffL

    cmp-long p3, p1, v0

    if-gtz p3, :cond_d

    return-wide p1

    :cond_d
    const-string p1, "FILE_SIZE_OUT_OF_RANGE"

    const-string p2, "The file size cannot be represented exactly."

    .line 282
    invoke-static {p1, p2}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1
.end method

.method public final ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 4

    move-object v0, p0

    .line 115
    monitor-enter v0

    .line 116
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۚᩳۚ;->᩸(Ljava/lang/String;)Ll/۫ᩳۚ;

    move-result-object p1

    .line 117
    iget-object v1, p1, Ll/۫ᩳۚ;->ۙ:Ll/ܳᩳۚ;

    const-string v2, "publishing"

    .line 118
    iget-object v3, p1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    if-eqz v1, :cond_0

    const-string v2, "completed"

    iget-object v3, p1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    if-nez v1, :cond_3

    .line 120
    iget-boolean v1, p1, Ll/۫ᩳۚ;->᩵:Z

    if-eqz v1, :cond_1

    const-string v1, "ready"

    iget-object v2, p1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const-string v1, "cancelled"

    .line 303
    iput-object v1, p1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    .line 304
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, p1, Ll/۫ᩳۚ;->ۗ:J

    .line 121
    :cond_2
    invoke-virtual {p0, p1}, Ll/ۚᩳۚ;->ۙ(Ll/۫ᩳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_3
    const-string v2, "TRANSFER_CANCELLED"

    .line 123
    iput-object v2, v1, Ll/ܳᩳۚ;->ۙ:Ljava/lang/String;

    const-string v2, "cancelling"

    .line 124
    iput-object v2, p1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    .line 126
    iget-object p1, v1, Ll/ܳᩳۚ;->᩸:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 127
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 128
    iget-object p1, v1, Ll/ܳᩳۚ;->ۤ:Ll/ۗ᩻ܳ;

    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->ۙ()V

    move-object v0, p0

    .line 129
    monitor-enter v0

    :try_start_1
    iget-object p1, v1, Ll/ܳᩳۚ;->ᩴ:Ll/۫ᩳۚ;

    invoke-virtual {p0, p1}, Ll/ۚᩳۚ;->ۙ(Ll/۫ᩳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 118
    :cond_4
    :goto_0
    :try_start_2
    invoke-virtual {p0, p1}, Ll/ۚᩳۚ;->ۙ(Ll/۫ᩳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_1
    move-exception p1

    .line 127
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final ۙ(Ljava/lang/String;ZZJLjava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v14, p2

    .line 65
    invoke-static {}, Ll/᩸ܳۚ;->ۙ()Ll/᩸ܳۚ;

    move-result-object v2

    const-string v3, "http://"

    .line 407
    iget-object v4, v2, Ll/᩸ܳۚ;->᩸:Ll/ۗ᩻ܳ;

    invoke-virtual {v4}, Ll/ۗ᩻ܳ;->ᩴ()Ljava/util/Map;

    move-result-object v4

    const-string v5, "host"

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 409
    :try_start_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    if-eqz v4, :cond_11

    .line 410
    invoke-virtual {v3}, Ljava/net/URI;->getRawUserInfo()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_11

    invoke-virtual {v3}, Ljava/net/URI;->getRawQuery()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_11

    .line 411
    invoke-virtual {v3}, Ljava/net/URI;->getRawFragment()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_11

    const-string v4, ""

    invoke-virtual {v3}, Ljava/net/URI;->getRawPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    .line 412
    invoke-virtual {v3}, Ljava/net/URI;->getPort()I

    move-result v4

    const/4 v5, 0x1

    if-lt v4, v5, :cond_11

    invoke-virtual {v3}, Ljava/net/URI;->getPort()I

    move-result v4

    const v6, 0xffff

    if-gt v4, v6, :cond_11

    invoke-virtual {v3}, Ljava/net/URI;->getPort()I

    move-result v4

    iget v6, v2, Ll/᩸ܳۚ;->ۤ:I

    if-ne v4, v6, :cond_11

    .line 413
    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v4

    const-string v6, "127.0.0.1"

    .line 74
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, "localhost"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    .line 77
    :cond_0
    invoke-static {}, Ll/۬ۧۤ;->ۙ()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    :cond_1
    :goto_0
    if-eqz v5, :cond_11

    .line 414
    invoke-virtual {v3}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;

    move-result-object v15
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    cmp-long v6, p4, v3

    if-ltz v6, :cond_10

    const-wide v3, 0x1fffffffffffffL

    cmp-long v6, p4, v3

    if-gtz v6, :cond_10

    .line 69
    invoke-virtual/range {p6 .. p6}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    const/16 v4, 0x40

    if-nez v3, :cond_6

    .line 398
    invoke-virtual/range {p6 .. p6}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v4, :cond_5

    const/4 v3, 0x0

    .line 399
    :goto_1
    invoke-virtual/range {p6 .. p6}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v3, v6, :cond_6

    move-object/from16 v10, p6

    .line 400
    invoke-virtual {v10, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x30

    if-lt v6, v7, :cond_2

    const/16 v7, 0x39

    if-le v6, v7, :cond_4

    :cond_2
    const/16 v7, 0x61

    if-lt v6, v7, :cond_3

    const/16 v7, 0x66

    if-le v6, v7, :cond_4

    :cond_3
    const/16 v7, 0x41

    if-lt v6, v7, :cond_5

    const/16 v7, 0x46

    if-gt v6, v7, :cond_5

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    const-string v0, "sha256 must be empty or 64 hexadecimal characters"

    .line 48
    invoke-static {v0, v5, v5, v5, v5}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object v0

    .line 70
    throw v0

    :cond_6
    move-object/from16 v10, p6

    .line 71
    iget-object v3, v1, Ll/ۚᩳۚ;->ᩳ:Ll/᩷ܿۚ;

    invoke-virtual {v3}, Ll/᩷ܿۚ;->ۙ()Ll/ۡۘۚ;

    move-result-object v3

    if-eqz v14, :cond_7

    .line 72
    iget-object v5, v1, Ll/ۚᩳۚ;->ᩳ:Ll/᩷ܿۚ;

    const-string v6, "path"

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v3, v6}, Ll/᩷ܿۚ;->᩷(Ljava/lang/String;Ll/ۡۘۚ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 73
    :cond_7
    iget-object v5, v1, Ll/ۚᩳۚ;->ᩳ:Ll/᩷ܿۚ;

    const-string v6, "path"

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v3, v6}, Ll/᩷ܿۚ;->ۙ(Ljava/lang/String;Ll/ۡۘۚ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v5, v0

    .line 74
    iget-object v0, v1, Ll/ۚᩳۚ;->ᩳ:Ll/᩷ܿۚ;

    if-eqz v14, :cond_8

    invoke-virtual {v0, v5}, Ll/᩷ܿۚ;->᩷(Ljava/lang/String;)Ll/ᩳܿۚ;

    move-result-object v0

    goto :goto_3

    :cond_8
    invoke-virtual {v0, v5}, Ll/᩷ܿۚ;->ۙ(Ljava/lang/String;)Ll/ᩳܿۚ;

    move-result-object v0

    :goto_3
    move-object v3, v0

    move/from16 v0, p3

    .line 75
    :try_start_1
    invoke-virtual {v1, v5, v14, v0}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;ZZ)J

    move-result-wide v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v14, :cond_9

    move-wide v8, v6

    goto :goto_4

    :cond_9
    move-wide/from16 v8, p4

    .line 77
    :goto_4
    invoke-virtual {v3}, Ll/ᩳܿۚ;->close()V

    move-object/from16 v16, p0

    .line 78
    monitor-enter v16

    .line 79
    :try_start_2
    invoke-direct/range {p0 .. p0}, Ll/ۚᩳۚ;->᩷()V

    .line 299
    iget-boolean v3, v1, Ll/ۚᩳۚ;->ܿ:Z

    if-nez v3, :cond_f

    .line 81
    iget-object v3, v1, Ll/ۚᩳۚ;->᩶:Ll/ܶۘۚ;

    iget-object v6, v2, Ll/᩸ܳۚ;->᩷:Ljava/lang/String;

    iget-wide v11, v2, Ll/᩸ܳۚ;->ۙ:J

    invoke-virtual {v3, v11, v12, v6}, Ll/ܶۘۚ;->ۙ(JLjava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 83
    iget-object v3, v1, Ll/ۚᩳۚ;->ۢ:Ljava/util/LinkedHashMap;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    if-ge v3, v4, :cond_d

    :goto_5
    const/16 v3, 0x10

    new-array v3, v3, [B

    .line 393
    iget-object v4, v1, Ll/ۚᩳۚ;->֡:Ljava/security/SecureRandom;

    invoke-virtual {v4, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/16 v4, 0xb

    .line 394
    invoke-static {v3, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v12

    .line 86
    iget-object v3, v1, Ll/ۚᩳۚ;->ۢ:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    const/16 v3, 0x20

    new-array v3, v3, [B

    .line 393
    iget-object v6, v1, Ll/ۚᩳۚ;->֡:Ljava/security/SecureRandom;

    invoke-virtual {v6, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 394
    invoke-static {v3, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v13

    .line 88
    new-instance v11, Ll/۫ᩳۚ;

    iget-object v7, v2, Ll/᩸ܳۚ;->᩷:Ljava/lang/String;

    iget-wide v3, v2, Ll/᩸ܳۚ;->ۙ:J

    .line 89
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v17

    move-object v2, v11

    move-wide/from16 v19, v3

    move-object v3, v12

    move-object v4, v13

    move/from16 v6, p2

    move-object/from16 v21, v7

    move/from16 v7, p3

    move-object/from16 v10, p6

    move-object v0, v11

    move-object/from16 v11, v21

    move-object/from16 v21, v0

    move-object v0, v12

    move-object/from16 v22, v13

    move-wide/from16 v12, v19

    move-object/from16 v23, v15

    move-wide/from16 v14, v17

    invoke-direct/range {v2 .. v15}, Ll/۫ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZJLjava/lang/String;Ljava/lang/String;JJ)V

    .line 90
    iget-object v2, v1, Ll/ۚᩳۚ;->ۢ:Ljava/util/LinkedHashMap;

    move-object/from16 v3, v21

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    iget-object v2, v1, Ll/ۚᩳۚ;->۟:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v2, :cond_a

    .line 92
    new-instance v2, Ll/ۛ᩷ᩴ;

    const/4 v4, 0x1

    invoke-direct {v2, v4}, Ll/ۛ᩷ᩴ;-><init>(I)V

    invoke-static {v2}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v5

    iput-object v5, v1, Ll/ۚᩳۚ;->۟:Ljava/util/concurrent/ScheduledExecutorService;

    .line 97
    new-instance v6, Ll/ᩴᩳۚ;

    invoke-direct {v6, v1}, Ll/ᩴᩳۚ;-><init>(Ll/ۚᩳۚ;)V

    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v7, 0x1

    const-wide/16 v9, 0x1

    invoke-interface/range {v5 .. v11}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 99
    :cond_a
    invoke-virtual {v1, v3}, Ll/ۚᩳۚ;->ۙ(Ll/۫ᩳۚ;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "url"

    .line 100
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v6, v23

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/mcp/files/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v0, "method"

    if-eqz p2, :cond_b

    const-string v3, "PUT"

    goto :goto_6

    :cond_b
    const-string v3, "GET"

    .line 101
    :goto_6
    invoke-virtual {v2, v0, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v0, "headers"

    .line 102
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Authorization"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Bearer "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v6, v22

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 103
    monitor-exit v16

    return-object v2

    :cond_c
    move/from16 v14, p2

    goto/16 :goto_5

    :cond_d
    const-string v0, "TRANSFER_LIMIT"

    const-string v2, "Too many transfer tickets; wait for retained results to expire."

    .line 84
    invoke-static {v0, v2}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0

    :cond_e
    const-string v0, "TRANSFER_REVOKED"

    const-string v2, "The creating credential is no longer valid."

    .line 82
    invoke-static {v0, v2}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0

    :cond_f
    const-string v0, "TRANSFER_STOPPED"

    const-string v2, "The transfer service has stopped."

    .line 299
    invoke-static {v0, v2}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0

    :catchall_0
    move-exception v0

    .line 104
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    move-object v2, v0

    .line 74
    :try_start_3
    invoke-virtual {v3}, Ll/ᩳܿۚ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_7

    :catchall_2
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v2

    :cond_10
    const-string v0, "Invalid file size"

    .line 48
    invoke-static {v0, v5, v5, v5, v5}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object v0

    .line 68
    throw v0

    .line 413
    :cond_11
    :try_start_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    const-string v0, "TRANSFER_INVALID_HOST"

    const-string v2, "A direct local HTTP Host with an explicit port is required."

    .line 416
    invoke-static {v0, v2}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0
.end method

.method public final declared-synchronized ۙ(Ll/۫ᩳۚ;)Lbin/mt/json/JSONObject;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 190
    :try_start_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "transferId"

    iget-object v3, p1, Ll/۫ᩳۚ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "direction"

    .line 191
    iget-boolean v3, p1, Ll/۫ᩳۚ;->᩵:Z

    if-eqz v3, :cond_0

    const-string v3, "upload"

    goto :goto_0

    :cond_0
    const-string v3, "download"

    :goto_0
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "path"

    iget-object v3, p1, Ll/۫ᩳۚ;->᩻:Ljava/lang/String;

    .line 192
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "state"

    iget-object v3, p1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "bytesTransferred"

    iget-wide v3, p1, Ll/۫ᩳۚ;->ۤ:J

    .line 193
    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "size"

    iget-wide v3, p1, Ll/۫ᩳۚ;->ܶ:J

    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "sha256"

    iget-object v3, p1, Ll/۫ᩳۚ;->ܽ:Ljava/lang/String;

    .line 194
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "expiresAt"

    iget-wide v3, p1, Ll/۫ᩳۚ;->ۚ:J

    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "warnings"

    new-instance v3, Lbin/mt/json/JSONArray;

    iget-object v4, p1, Ll/۫ᩳۚ;->ۨ:Lbin/mt/json/JSONArray;

    invoke-direct {v3, v4}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    .line 195
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "error"

    .line 196
    iget-object p1, p1, Ll/۫ᩳۚ;->ܳ:Lbin/mt/json/JSONObject;

    if-nez p1, :cond_1

    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_1
    new-instance v3, Lbin/mt/json/JSONObject;

    invoke-direct {v3, p1}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    move-object p1, v3

    :goto_1
    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۙ(Ll/ۗ᩻ܳ;)Ll/۫ᩳۚ;
    .locals 11

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 134
    :try_start_0
    invoke-direct {p0}, Ll/ۚᩳۚ;->᩷()V

    .line 299
    iget-boolean v1, p0, Ll/ۚᩳۚ;->ܿ:Z

    if-nez v1, :cond_15

    .line 136
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->ܺ()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 137
    iget-object v2, p0, Ll/ۚᩳۚ;->ۢ:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ᩳۚ;

    .line 138
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->ۤ()Ljava/util/List;

    move-result-object v2

    .line 139
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v3, v5, :cond_0

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    if-eqz v1, :cond_14

    .line 140
    iget-object v3, v1, Ll/۫ᩳۚ;->ܺ:Ljava/lang/String;

    if-eqz v2, :cond_5

    .line 380
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v6, 0x80

    if-le v5, v6, :cond_1

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    .line 381
    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v5, v6, :cond_3

    .line 382
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x20

    if-lt v6, v7, :cond_5

    const/16 v7, 0x7e

    if-le v6, v7, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 385
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v8, "Bearer "

    const/4 v9, 0x0

    const/4 v10, 0x7

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v5, v2

    .line 386
    invoke-virtual/range {v5 .. v10}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_2

    .line 387
    :cond_4
    sget-object v4, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const/4 v5, 0x7

    .line 388
    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 387
    invoke-static {v3, v2}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result v4

    :cond_5
    :goto_2
    if-eqz v4, :cond_14

    .line 142
    iget-object v2, p0, Ll/ۚᩳۚ;->᩶:Ll/ܶۘۚ;

    iget-object v3, v1, Ll/۫ᩳۚ;->᩸:Ljava/lang/String;

    iget-wide v4, v1, Ll/۫ᩳۚ;->᩷:J

    invoke-virtual {v2, v4, v5, v3}, Ll/ܶۘۚ;->ۙ(JLjava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_13

    const-string v2, "expired"

    .line 144
    iget-object v3, v1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    const-string v2, "cancelled"

    iget-object v3, v1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    .line 146
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->۫()Ll/ۨ᩻ܳ;

    move-result-object v2

    .line 147
    iget-boolean v3, v1, Ll/۫ᩳۚ;->᩵:Z

    if-eqz v3, :cond_6

    sget-object v3, Ll/ۨ᩻ܳ;->᩷ۙ:Ll/ۨ᩻ܳ;

    if-ne v2, v3, :cond_7

    goto :goto_3

    :cond_6
    sget-object v3, Ll/ۨ᩻ܳ;->۟:Ll/ۨ᩻ܳ;

    if-eq v2, v3, :cond_8

    sget-object v3, Ll/ۨ᩻ܳ;->ᩳ:Ll/ۨ᩻ܳ;

    if-ne v2, v3, :cond_7

    goto :goto_3

    :cond_7
    const-string p1, "TRANSFER_METHOD"

    const-string v1, "The HTTP method does not match this transfer."

    .line 149
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    .line 150
    :cond_8
    :goto_3
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->ᩴ()Ljava/util/Map;

    move-result-object v2

    const-string v3, "content-encoding"

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    .line 151
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->ᩴ()Ljava/util/Map;

    move-result-object v2

    const-string v3, "transfer-encoding"

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    .line 153
    iget-boolean v2, v1, Ll/۫ᩳۚ;->᩵:Z

    if-eqz v2, :cond_c

    .line 154
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->ᩴ()Ljava/util/Map;

    move-result-object p1

    const-string v2, "content-length"

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_b

    .line 157
    :try_start_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    iget-wide v4, v1, Ll/۫ᩳۚ;->ܶ:J
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long p1, v2, v4

    if-nez p1, :cond_a

    :try_start_2
    const-string p1, "failed"

    .line 161
    iget-object v2, v1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_4

    :cond_9
    const-string p1, "TRANSFER_GONE"

    const-string v1, "This upload failed; query its result before creating a new ticket."

    .line 162
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 157
    :cond_a
    :try_start_3
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1}, Ljava/lang/NumberFormatException;-><init>()V

    throw p1
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_0
    :try_start_4
    const-string p1, "TRANSFER_LENGTH_MISMATCH"

    const-string v1, "Content-Length does not match the upload ticket."

    .line 159
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_b
    const-string p1, "TRANSFER_LENGTH_REQUIRED"

    const-string v1, "Content-Length is required."

    .line 155
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_c
    const-string v2, "0"

    .line 163
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->ᩴ()Ljava/util/Map;

    move-result-object p1

    const-string v3, "content-length"

    const-string v4, "0"

    check-cast p1, Ljava/util/HashMap;

    invoke-static {p1, v3, v4}, Ll/ۧۚۗ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_10

    .line 166
    :goto_4
    iget-object p1, v1, Ll/۫ᩳۚ;->ۙ:Ll/ܳᩳۚ;

    if-nez p1, :cond_f

    .line 167
    iget p1, p0, Ll/ۚᩳۚ;->ܰ:I

    const/4 v2, 0x4

    if-lt p1, v2, :cond_e

    iget-boolean p1, v1, Ll/۫ᩳۚ;->᩵:Z

    if-eqz p1, :cond_d

    const-string p1, "completed"

    iget-object v2, v1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_5

    :cond_d
    const-string p1, "TRANSFER_LIMIT"

    const-string v1, "Too many active file transfers."

    .line 168
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 169
    :cond_e
    :goto_5
    monitor-exit v0

    return-object v1

    :cond_f
    :try_start_5
    const-string p1, "TRANSFER_BUSY"

    const-string v1, "This transfer is already active."

    .line 166
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_10
    const-string p1, "TRANSFER_LENGTH_MISMATCH"

    const-string v1, "Download requests must not contain a body."

    .line 164
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_11
    const-string p1, "TRANSFER_ENCODING"

    const-string v1, "Encoded request bodies are not supported."

    .line 152
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_12
    const-string p1, "TRANSFER_GONE"

    const-string v1, "The transfer ticket is no longer usable."

    .line 145
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_13
    const-string p1, "TRANSFER_REVOKED"

    const-string v1, "The creating credential is no longer valid."

    .line 143
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_14
    const-string p1, "TRANSFER_UNAUTHORIZED"

    const-string v1, "Invalid transfer credential."

    .line 141
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_15
    const-string p1, "TRANSFER_STOPPED"

    const-string v1, "The transfer service has stopped."

    .line 299
    invoke-static {p1, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :catchall_0
    move-exception p1

    .line 141
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final ۙ()V
    .locals 11

    .line 324
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v0, p0

    .line 325
    monitor-enter v0

    .line 326
    :try_start_0
    invoke-direct {p0}, Ll/ۚᩳۚ;->᩷()V

    .line 327
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 328
    iget-object v4, p0, Ll/ۚᩳۚ;->ۢ:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۫ᩳۚ;

    .line 329
    iget-object v6, v5, Ll/۫ᩳۚ;->ۙ:Ll/ܳᩳۚ;

    if-eqz v6, :cond_0

    .line 330
    iget-object v7, v6, Ll/ܳᩳۚ;->ۙ:Ljava/lang/String;

    if-nez v7, :cond_0

    const-string v7, "publishing"

    iget-object v5, v5, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    iget-wide v7, v6, Ll/ܳᩳۚ;->᩷:J

    sub-long v7, v2, v7

    const-wide/16 v9, 0x7530

    cmp-long v5, v7, v9

    if-ltz v5, :cond_0

    const-string v5, "TRANSFER_STALLED"

    .line 332
    iput-object v5, v6, Ll/ܳᩳۚ;->ۙ:Ljava/lang/String;

    .line 333
    iget-object v5, v6, Ll/ܳᩳۚ;->᩸:Ljava/lang/Thread;

    invoke-virtual {v5}, Ljava/lang/Thread;->interrupt()V

    .line 334
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 337
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 338
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳᩳۚ;

    iget-object v1, v1, Ll/ܳᩳۚ;->ۤ:Ll/ۗ᩻ܳ;

    invoke-virtual {v1}, Ll/ۗ᩻ܳ;->ۙ()V

    goto :goto_1

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    .line 337
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۙ(Ll/ܳᩳۚ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 206
    :try_start_0
    iget-object p1, p1, Ll/ܳᩳۚ;->ۙ:Ljava/lang/String;

    if-nez p1, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->isInterrupted()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 208
    monitor-exit v0

    return-void

    .line 207
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v1, "File transfer interrupted"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۙ(Ll/ܳᩳۚ;I)V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 200
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;)V

    .line 201
    iget-object v1, p1, Ll/ܳᩳۚ;->ᩴ:Ll/۫ᩳۚ;

    iget-wide v2, v1, Ll/۫ᩳۚ;->ۤ:J

    int-to-long v4, p2

    add-long/2addr v2, v4

    iput-wide v2, v1, Ll/۫ᩳۚ;->ۤ:J

    .line 202
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, p1, Ll/ܳᩳۚ;->᩷:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۙ(Ll/ܳᩳۚ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 216
    :try_start_0
    iget-object v1, p1, Ll/ܳᩳۚ;->ᩴ:Ll/۫ᩳۚ;

    .line 217
    iget-object v2, p1, Ll/ܳᩳۚ;->ۙ:Ljava/lang/String;

    if-eqz v2, :cond_0

    const-string p2, "File transfer was interrupted."

    .line 218
    invoke-static {v2, p2}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;Ll/ۢܳۚ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 219
    monitor-exit v0

    return-void

    .line 221
    :cond_0
    :try_start_1
    iput-object p2, v1, Ll/۫ᩳۚ;->ܽ:Ljava/lang/String;

    .line 222
    new-instance p1, Lbin/mt/json/JSONArray;

    invoke-direct {p1, p3}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    iput-object p1, v1, Ll/۫ᩳۚ;->ۨ:Lbin/mt/json/JSONArray;

    const-string p1, "completed"

    .line 303
    iput-object p1, v1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    .line 304
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, v1, Ll/۫ᩳۚ;->ۗ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 224
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۙ(Ll/ܳᩳۚ;Ll/ۢܳۚ;)V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 231
    :try_start_0
    iget-object v1, p1, Ll/ܳᩳۚ;->ᩴ:Ll/۫ᩳۚ;

    .line 232
    iget-object v2, p1, Ll/ܳᩳۚ;->ۙ:Ljava/lang/String;

    if-eqz v2, :cond_1

    const-string v3, "TRANSFER_STALLED"

    .line 233
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "File transfer stopped making progress."

    goto :goto_0

    :cond_0
    const-string v3, "File transfer was cancelled."

    :goto_0
    const-string v4, "warning"

    .line 234
    iget-object p2, p2, Ll/ۢܳۚ;->ܿ:Lbin/mt/json/JSONObject;

    const/4 v5, 0x0

    .line 232
    invoke-static {v2, v3, v4, v5, p2}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p2

    .line 235
    :cond_1
    invoke-static {p2}, Ll/ۚᩳۚ;->ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string v2, "error"

    invoke-virtual {p2, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    iput-object p2, v1, Ll/۫ᩳۚ;->ܳ:Lbin/mt/json/JSONObject;

    const-string p2, "TRANSFER_CANCELLED"

    .line 236
    iget-object p1, p1, Ll/ܳᩳۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "cancelled"

    goto :goto_1

    :cond_2
    const-string p1, "failed"

    .line 303
    :goto_1
    iput-object p1, v1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    .line 304
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, v1, Ll/۫ᩳۚ;->ۗ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ᩷(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 109
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۚᩳۚ;->᩸(Ljava/lang/String;)Ll/۫ᩳۚ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۚᩳۚ;->ۙ(Ll/۫ᩳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ᩷(Ll/ۗ᩻ܳ;)Ll/ܳᩳۚ;
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 173
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ۚᩳۚ;->ۙ(Ll/ۗ᩻ܳ;)Ll/۫ᩳۚ;

    move-result-object v1

    .line 174
    iget-boolean v2, v1, Ll/۫ᩳۚ;->᩵:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const-string v2, "completed"

    iget-object v4, v1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit v0

    return-object v3

    .line 175
    :cond_0
    :try_start_1
    new-instance v2, Ll/ܳᩳۚ;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    invoke-direct {v2, v1, p1, v4, v5}, Ll/ܳᩳۚ;-><init>(Ll/۫ᩳۚ;Ll/ۗ᩻ܳ;J)V

    .line 176
    iput-object v2, v1, Ll/۫ᩳۚ;->ۙ:Ll/ܳᩳۚ;

    .line 177
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->۫()Ll/ۨ᩻ܳ;

    move-result-object p1

    sget-object v4, Ll/ۨ᩻ܳ;->ᩳ:Ll/ۨ᩻ܳ;

    if-eq p1, v4, :cond_2

    .line 178
    iget-boolean p1, v1, Ll/۫ᩳۚ;->᩵:Z

    if-eqz p1, :cond_1

    const-string p1, "receiving"

    goto :goto_0

    :cond_1
    const-string p1, "sending"

    :goto_0
    iput-object p1, v1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    const-wide/16 v4, 0x0

    .line 179
    iput-wide v4, v1, Ll/۫ᩳۚ;->ۤ:J

    const-string p1, ""

    .line 180
    iput-object p1, v1, Ll/۫ᩳۚ;->ܽ:Ljava/lang/String;

    .line 181
    iput-object v3, v1, Ll/۫ᩳۚ;->ܳ:Lbin/mt/json/JSONObject;

    const-wide/16 v3, -0x1

    .line 182
    iput-wide v3, v1, Ll/۫ᩳۚ;->ۗ:J

    .line 183
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    iput-object p1, v1, Ll/۫ᩳۚ;->ۨ:Lbin/mt/json/JSONArray;

    .line 185
    :cond_2
    iget p1, p0, Ll/ۚᩳۚ;->ܰ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۚᩳۚ;->ܰ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ᩷(Ll/ܳᩳۚ;)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 240
    :try_start_0
    iget-object v1, p1, Ll/ܳᩳۚ;->ᩴ:Ll/۫ᩳۚ;

    .line 241
    iget-object v2, v1, Ll/۫ᩳۚ;->ۙ:Ll/ܳᩳۚ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v2, p1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    const-string v2, "cancelling"

    .line 243
    iget-object v3, v1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "cancelled"

    .line 303
    iput-object v2, v1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    .line 304
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, v1, Ll/۫ᩳۚ;->ۗ:J

    :cond_1
    const/4 v2, 0x0

    .line 244
    iput-object v2, v1, Ll/۫ᩳۚ;->ۙ:Ll/ܳᩳۚ;

    .line 245
    iget v1, p0, Ll/ۚᩳۚ;->ܰ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ۚᩳۚ;->ܰ:I

    .line 246
    iget-object v1, p1, Ll/ܳᩳۚ;->ۙ:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iget-object p1, p1, Ll/ܳᩳۚ;->᩸:Ljava/lang/Thread;

    if-ne v1, p1, :cond_2

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 247
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

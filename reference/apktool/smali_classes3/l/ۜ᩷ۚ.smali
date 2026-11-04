.class public final Ll/ۜ᩷ۚ;
.super Ljava/lang/Object;
.source "56BZ"


# instance fields
.field public final ֫:Ll/ۜ᩷ۚ;

.field public ۗ:I

.field public ۙ:Ljava/lang/String;

.field public final ۚ:Ll/ۤۤۚ;

.field public final ۛ:J

.field public final ۤ:I

.field public ۧ:Ljava/lang/String;

.field public ۨ:J

.field public final ۫:J

.field public ܳ:J

.field public ܶ:I

.field public ܺ:Ll/ۙۤۚ;

.field public ܽ:Ljava/lang/String;

.field public ᩴ:Z

.field public ᩵:J

.field public ᩷:Ljava/lang/String;

.field public ᩸:Z

.field public final ᩹:Ljava/lang/String;

.field public final ᩺:Ljava/lang/String;

.field public final ᩻:J


# direct methods
.method public constructor <init>(Ll/ۤۤۚ;JLjava/lang/String;Lbin/mt/json/JSONObject;J)V
    .locals 2

    .line 263
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 245
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۜ᩷ۚ;->ۛ:J

    const-string v0, ""

    .line 254
    iput-object v0, p0, Ll/ۜ᩷ۚ;->ۧ:Ljava/lang/String;

    .line 255
    sget-object v1, Ll/ۙۤۚ;->ܿ:Ll/ۙۤۚ;

    iput-object v1, p0, Ll/ۜ᩷ۚ;->ܺ:Ll/ۙۤۚ;

    .line 264
    iput-object p1, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    .line 265
    invoke-static {}, Ll/ۤۤۚ;->ᩴ()Ljava/lang/ThreadLocal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜ᩷ۚ;

    iput-object v1, p0, Ll/ۜ᩷ۚ;->֫:Ll/ۜ᩷ۚ;

    .line 266
    iput-wide p2, p0, Ll/ۜ᩷ۚ;->۫:J

    const/16 p2, 0x80

    .line 267
    invoke-static {p2, p4}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/ۜ᩷ۚ;->᩹:Ljava/lang/String;

    .line 268
    iput-wide p6, p0, Ll/ۜ᩷ۚ;->᩻:J

    .line 269
    invoke-static {p5, p4}, Ll/ۜᩴۚ;->ܶ(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ll/ۜ᩷ۚ;->ܶ:I

    const-string p2, "workspaceId"

    .line 270
    invoke-static {p5, p2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/ۜ᩷ۚ;->᩺:Ljava/lang/String;

    .line 271
    invoke-static {p5, p4}, Ll/ۜᩴۚ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Ll/ۜ᩷ۚ;->ܽ:Ljava/lang/String;

    .line 272
    invoke-static {p5, p4}, Ll/ۜᩴۚ;->ۚ(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Ll/ۜ᩷ۚ;->ۤ:I

    .line 273
    invoke-static {p1}, Ll/ۤۤۚ;->۫(Ll/ۤۤۚ;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 274
    :goto_0
    invoke-virtual {p0, p1, v0}, Ll/ۜ᩷ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    invoke-static {p5, p4}, Ll/ۜᩴۚ;->ܳ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩷ۚ;->᩷:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ۙ(Lbin/mt/json/JSONObject;)V
    .locals 3

    .line 299
    iget-object v0, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    monitor-enter v0

    .line 300
    :try_start_0
    iget-object v1, p0, Ll/ۜ᩷ۚ;->᩹:Ljava/lang/String;

    iget-object v2, p0, Ll/ۜ᩷ۚ;->ܽ:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۜ᩷ۚ;->ܽ:Ljava/lang/String;

    .line 301
    iget-object v1, p0, Ll/ۜ᩷ۚ;->᩹:Ljava/lang/String;

    iget v2, p0, Ll/ۜ᩷ۚ;->ܶ:I

    invoke-static {v2, p1, v1}, Ll/ۜᩴۚ;->᩷(ILbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۜ᩷ۚ;->ܶ:I

    .line 302
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 280
    iput-object p1, p0, Ll/ۜ᩷ۚ;->ۙ:Ljava/lang/String;

    const-string v0, "mt_apk_build"

    .line 281
    iget-object v1, p0, Ll/ۜ᩷ۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 282
    iget-boolean p2, p0, Ll/ۜ᩷ۚ;->᩸:Z

    if-nez p2, :cond_1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iput-object p1, p0, Ll/ۜ᩷ۚ;->ܽ:Ljava/lang/String;

    :cond_1
    return-void

    .line 284
    :cond_2
    iget-object p1, p0, Ll/ۜ᩷ۚ;->ܽ:Ljava/lang/String;

    .line 285
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "mt_apk_session_check"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1
    const-string v0, "mt_apk_session_create"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "mt_apk_workspace_delete"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/16 p1, 0x200

    .line 287
    invoke-static {p1, p2}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 284
    :goto_1
    iput-object p1, p0, Ll/ۜ᩷ۚ;->ܽ:Ljava/lang/String;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0xd59fc10 -> :sswitch_2
        0x61eb10e0 -> :sswitch_1
        0x6e7ee8a4 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۙ(Ljava/lang/String;Z)V
    .locals 7

    .line 316
    iget-object v0, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    monitor-enter v0

    .line 317
    :try_start_0
    iget-boolean v1, p0, Ll/ۜ᩷ۚ;->ᩴ:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 318
    :cond_0
    iget-object v1, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {v1}, Ll/ۤۤۚ;->ۤ(Ll/ۤۤۚ;)Ljava/util/function/LongSupplier;

    move-result-object v1

    check-cast v1, Ll/ۡ᩻ܳ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۜ᩷ۚ;->ܳ:J

    .line 319
    iget v3, p0, Ll/ۜ᩷ۚ;->ۗ:I

    if-lez v3, :cond_1

    iget-wide v3, p0, Ll/ۜ᩷ۚ;->᩵:J

    iget-wide v5, p0, Ll/ۜ᩷ۚ;->ۨ:J

    sub-long/2addr v1, v5

    const-wide/16 v5, 0x0

    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-long/2addr v3, v1

    iput-wide v3, p0, Ll/ۜ᩷ۚ;->᩵:J

    :cond_1
    const/4 v1, 0x0

    .line 320
    iput v1, p0, Ll/ۜ᩷ۚ;->ۗ:I

    const/16 v1, 0x1000

    .line 321
    invoke-static {v1, p1}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩷ۚ;->ۧ:Ljava/lang/String;

    if-eqz p2, :cond_2

    .line 322
    sget-object p1, Ll/ۙۤۚ;->֡:Ll/ۙۤۚ;

    goto :goto_0

    :cond_2
    sget-object p1, Ll/ۙۤۚ;->᩶:Ll/ۙۤۚ;

    :goto_0
    iput-object p1, p0, Ll/ۜ᩷ۚ;->ܺ:Ll/ۙۤۚ;

    const/4 p1, 0x1

    .line 323
    iput-boolean p1, p0, Ll/ۜ᩷ۚ;->ᩴ:Z

    .line 324
    iget-object p1, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {p1}, Ll/ۤۤۚ;->ۙ(Ll/ۤۤۚ;)Ljava/util/TreeMap;

    move-result-object p1

    iget-wide v1, p0, Ll/ۜ᩷ۚ;->۫:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    new-instance p1, Ll/۬᩷ۚ;

    invoke-direct {p1, p0}, Ll/۬᩷ۚ;-><init>(Ll/ۜ᩷ۚ;)V

    .line 326
    iget-object p2, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {p2}, Ll/ۤۤۚ;->᩸(Ll/ۤۤۚ;)Ljava/util/TreeMap;

    move-result-object p2

    iget-wide v1, p0, Ll/ۜ᩷ۚ;->۫:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p2, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    iget-object p2, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {p2}, Ll/ۤۤۚ;->ᩴ(Ll/ۤۤۚ;)I

    move-result v1

    invoke-static {p1}, Ll/۬᩷ۚ;->ۙ(Ll/۬᩷ۚ;)I

    move-result p1

    add-int/2addr v1, p1

    invoke-static {p2, v1}, Ll/ۤۤۚ;->ۙ(Ll/ۤۤۚ;I)V

    .line 328
    :goto_1
    iget-object p1, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {p1}, Ll/ۤۤۚ;->᩸(Ll/ۤۤۚ;)Ljava/util/TreeMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/TreeMap;->size()I

    move-result p1

    iget-object p2, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {p2}, Ll/ۤۤۚ;->ܳ(Ll/ۤۤۚ;)I

    move-result p2

    if-gt p1, p2, :cond_5

    iget-object p1, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {p1}, Ll/ۤۤۚ;->ᩴ(Ll/ۤۤۚ;)I

    move-result p1

    iget-object p2, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {p2}, Ll/ۤۤۚ;->᩷(Ll/ۤۤۚ;)I

    move-result p2

    if-le p1, p2, :cond_3

    goto :goto_2

    .line 331
    :cond_3
    iget-object p1, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {p1}, Ll/ۤۤۚ;->ۚ(Ll/ۤۤۚ;)V

    .line 332
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 333
    iget-object p1, p0, Ll/ۜ᩷ۚ;->֫:Ll/ۜ᩷ۚ;

    if-nez p1, :cond_4

    invoke-static {}, Ll/ۤۤۚ;->ᩴ()Ljava/lang/ThreadLocal;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    return-void

    .line 334
    :cond_4
    invoke-static {}, Ll/ۤۤۚ;->ᩴ()Ljava/lang/ThreadLocal;

    move-result-object p1

    iget-object p2, p0, Ll/ۜ᩷ۚ;->֫:Ll/ۜ᩷ۚ;

    invoke-virtual {p1, p2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void

    .line 329
    :cond_5
    :goto_2
    :try_start_1
    iget-object p1, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {p1}, Ll/ۤۤۚ;->ᩴ(Ll/ۤۤۚ;)I

    move-result p2

    iget-object v1, p0, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {v1}, Ll/ۤۤۚ;->᩸(Ll/ۤۤۚ;)Ljava/util/TreeMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/TreeMap;->pollFirstEntry()Ljava/util/Map$Entry;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩷ۚ;

    invoke-static {v1}, Ll/۬᩷ۚ;->ۙ(Ll/۬᩷ۚ;)I

    move-result v1

    sub-int/2addr p2, v1

    invoke-static {p1, p2}, Ll/ۤۤۚ;->ۙ(Ll/ۤۤۚ;I)V

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 332
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

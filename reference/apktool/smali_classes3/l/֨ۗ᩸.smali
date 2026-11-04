.class public final Ll/֨ۗ᩸;
.super Ljava/lang/Object;
.source "16SF"

# interfaces
.implements Ll/ۖ᩹᩸;


# instance fields
.field public ֡:Z

.field public ֫:Ljava/lang/Throwable;

.field public final ۗ:Ll/ᩳ۬᩸;

.field public final ۘ:I

.field public ۙ:Z

.field public ۚ:Ljava/util/concurrent/Executor;

.field public ۛ:Ll/᩺᩵᩸;

.field public ۟:Ll/᩹ܽ᩵;

.field public ۢ:I

.field public volatile ۤ:Z

.field public final ۧ:Ll/۟ܰ᩸;

.field public ۨ:Ll/᩹ܽ᩵;

.field public ۫:Ll/۠᩹᩸;

.field public ܰ:Z

.field public final ܳ:Ll/᩹ܽ᩵;

.field public final ܶ:Landroid/os/Handler;

.field public ܺ:Ll/᩹ܽ᩵;

.field public final ܽ:Ll/ܺۗ᩸;

.field public final ܿ:Ll/᩺ۜ᩸;

.field public ᩳ:Z

.field public ᩴ:Z

.field public ᩵:Ll/ܶ᩵᩸;

.field public final ᩶:Ll/ۜۗ᩸;

.field public ᩷:Z

.field public ᩸:Z

.field public final ᩹:Ll/ۢۗ᩸;

.field public ᩺:Ll/ܶۜ᩸;

.field public final ᩻:Ll/᩹۬᩸;


# direct methods
.method public constructor <init>(Ll/۟ܰ᩸;Ll/ۢۗ᩸;ILl/ۜۗ᩸;)V
    .locals 2

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/֨ۗ᩸;->ܶ:Landroid/os/Handler;

    .line 37
    new-instance v0, Ll/᩹ܽ᩵;

    invoke-direct {v0}, Ll/᩹ܽ᩵;-><init>()V

    iput-object v0, p0, Ll/֨ۗ᩸;->ܳ:Ll/᩹ܽ᩵;

    .line 39
    new-instance v1, Ll/ܺۗ᩸;

    invoke-direct {v1}, Ll/ܺۗ᩸;-><init>()V

    iput-object v1, p0, Ll/֨ۗ᩸;->ܽ:Ll/ܺۗ᩸;

    const/4 v1, 0x1

    .line 51
    iput-boolean v1, p0, Ll/֨ۗ᩸;->ۙ:Z

    .line 67
    iput-object p1, p0, Ll/֨ۗ᩸;->ۧ:Ll/۟ܰ᩸;

    iget-object v1, p1, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    iput-object v1, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    iget-object p1, p1, Ll/۟ܰ᩸;->ۜ:Ll/᩹۬᩸;

    iput-object p1, p0, Ll/֨ۗ᩸;->᩻:Ll/᩹۬᩸;

    .line 68
    iput-object p2, p0, Ll/֨ۗ᩸;->᩹:Ll/ۢۗ᩸;

    iput p3, p0, Ll/֨ۗ᩸;->ۘ:I

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    iput-object p1, p0, Ll/֨ۗ᩸;->ۗ:Ll/ᩳ۬᩸;

    .line 69
    iput-object p4, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    .line 74
    new-instance p1, Ll/ܰۗ᩸;

    invoke-direct {p1, p0}, Ll/ܰۗ᩸;-><init>(Ll/֨ۗ᩸;)V

    invoke-virtual {p4, p1}, Ll/ۜۗ᩸;->ۙ(Ljava/util/function/Supplier;)V

    .line 75
    new-instance p1, Ll/᩶ۗ᩸;

    invoke-direct {p1, p0}, Ll/᩶ۗ᩸;-><init>(Ll/֨ۗ᩸;)V

    invoke-virtual {v0, p1}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    return-void
.end method

.method public static ֫(Ll/֨ۗ᩸;)Ljava/lang/String;
    .locals 2

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/֨ۗ᩸;->ۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Ll/֨ۗ᩸;->۫:Ll/۠᩹᩸;

    if-nez p0, :cond_0

    const-string p0, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/۠᩹᩸;->ۙ()Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/֨ۗ᩸;)V
    .locals 7

    const/4 v1, 0x0

    .line 248
    iput-boolean v1, p0, Ll/֨ۗ᩸;->᩸:Z

    .line 249
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ܰ:Z

    if-nez v0, :cond_16

    iget-boolean v0, p0, Ll/֨ۗ᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    move-object v0, p0

    .line 250
    monitor-enter v0

    .line 251
    :try_start_0
    iget v2, p0, Ll/֨ۗ᩸;->ۢ:I

    const/4 v3, 0x2

    const-wide/16 v4, 0xa

    const/4 v6, 0x1

    if-eq v2, v3, :cond_2

    .line 252
    iget-boolean v1, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-eqz v1, :cond_1

    .line 253
    iget-object v1, p0, Ll/֨ۗ᩸;->ܽ:Ll/ܺۗ᩸;

    invoke-virtual {v1}, Ll/ܺۗ᩸;->cancel()V

    .line 254
    iput-boolean v6, p0, Ll/֨ۗ᩸;->᩸:Z

    .line 255
    iget-object v1, p0, Ll/֨ۗ᩸;->ܶ:Landroid/os/Handler;

    new-instance v2, Ll/ۨۗ᩸;

    invoke-direct {v2, p0}, Ll/ۨۗ᩸;-><init>(Ll/֨ۗ᩸;)V

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 257
    :cond_1
    monitor-exit v0

    return-void

    .line 259
    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 260
    invoke-direct {p0}, Ll/֨ۗ᩸;->۫()Z

    move-result v0

    if-nez v0, :cond_3

    iput-boolean v6, p0, Ll/֨ۗ᩸;->ۤ:Z

    .line 261
    :cond_3
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    if-eqz v0, :cond_5

    .line 262
    :cond_4
    iget-object v0, p0, Ll/֨ۗ᩸;->ܽ:Ll/ܺۗ᩸;

    invoke-virtual {v0}, Ll/ܺۗ᩸;->cancel()V

    .line 263
    iget-object v0, p0, Ll/֨ۗ᩸;->ܽ:Ll/ܺۗ᩸;

    invoke-virtual {v0}, Ll/ܺۗ᩸;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_5

    .line 264
    iput-boolean v6, p0, Ll/֨ۗ᩸;->᩸:Z

    .line 265
    iget-object v0, p0, Ll/֨ۗ᩸;->ܶ:Landroid/os/Handler;

    new-instance v1, Ll/ۨۗ᩸;

    invoke-direct {v1, p0}, Ll/ۨۗ᩸;-><init>(Ll/֨ۗ᩸;)V

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 269
    :cond_5
    iget-object v0, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    if-nez v0, :cond_6

    iget-object v0, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۜۙ()Ljava/lang/Throwable;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    .line 271
    :cond_6
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    if-nez v0, :cond_8

    iget-object v0, p0, Ll/֨ۗ᩸;->ۨ:Ll/᩹ܽ᩵;

    if-eqz v0, :cond_8

    .line 272
    invoke-virtual {v0}, Ll/᩹ܽ᩵;->isDone()Z

    move-result v0

    if-nez v0, :cond_7

    .line 273
    iget-object v0, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    const-string v1, "waiting_persistence"

    invoke-virtual {v0, v1}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    .line 274
    iput-boolean v6, p0, Ll/֨ۗ᩸;->᩸:Z

    .line 275
    iget-object v0, p0, Ll/֨ۗ᩸;->ܶ:Landroid/os/Handler;

    new-instance v1, Ll/ۨۗ᩸;

    invoke-direct {v1, p0}, Ll/ۨۗ᩸;-><init>(Ll/֨ۗ᩸;)V

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 278
    :cond_7
    :try_start_1
    iget-object v0, p0, Ll/֨ۗ᩸;->ۨ:Ll/᩹ܽ᩵;

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 279
    iput-object v0, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    .line 281
    :cond_8
    :goto_0
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-nez v0, :cond_9

    iget-object v0, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    if-eqz v0, :cond_a

    :cond_9
    iget-object v0, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܰ()V

    .line 282
    :cond_a
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-nez v0, :cond_b

    iget-object v0, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    if-nez v0, :cond_b

    iget-boolean v0, p0, Ll/֨ۗ᩸;->᩷:Z

    if-nez v0, :cond_b

    iget-boolean v0, p0, Ll/֨ۗ᩸;->ۙ:Z

    if-eqz v0, :cond_b

    iget-object v0, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    iget-object v2, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    iget-object v3, v2, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    iget-object v2, v2, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v2, v2, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v2, v2, Ll/۫ۗ᩸;->ۢ:Ll/᩵ۙᩴ;

    .line 283
    invoke-virtual {v0, v3, v2}, Ll/᩺ۜ᩸;->ۙ(Ll/ۗۤᩴ;Ll/᩵ۙᩴ;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v0, 0x1

    goto :goto_1

    :cond_b
    const/4 v0, 0x0

    .line 284
    :goto_1
    iget-object v2, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۖ᩷()Z

    move-result v2

    if-eqz v2, :cond_c

    if-nez v0, :cond_c

    .line 285
    iget-object v0, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    const-string v1, "waiting_layout"

    invoke-virtual {v0, v1}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    .line 286
    iput-boolean v6, p0, Ll/֨ۗ᩸;->᩸:Z

    .line 287
    iget-object v0, p0, Ll/֨ۗ᩸;->ܶ:Landroid/os/Handler;

    new-instance v1, Ll/ۨۗ᩸;

    invoke-direct {v1, p0}, Ll/ۨۗ᩸;-><init>(Ll/֨ۗ᩸;)V

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_4

    .line 290
    :cond_c
    iget-boolean v2, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-nez v2, :cond_10

    iget-object v2, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    if-eqz v2, :cond_d

    goto :goto_2

    .line 291
    :cond_d
    iget-boolean v1, p0, Ll/֨ۗ᩸;->᩷:Z

    if-eqz v1, :cond_e

    goto/16 :goto_4

    .line 292
    :cond_e
    iput-boolean v6, p0, Ll/֨ۗ᩸;->᩷:Z

    .line 293
    iget-object v1, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    const-string v2, "restoring_view_state"

    invoke-virtual {v1, v2}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    .line 295
    :try_start_2
    iget-object v1, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->᩸ۙ()V

    .line 296
    iget-object v1, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ᩴۙ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 299
    :try_start_3
    iget-object v1, p0, Ll/֨ۗ᩸;->ۧ:Ll/۟ܰ᩸;

    iget-object v2, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    iget v3, p0, Ll/֨ۗ᩸;->ۘ:I

    iget-object v4, p0, Ll/֨ۗ᩸;->᩺:Ll/ܶۜ᩸;

    invoke-virtual {v1, v2, v3, v4}, Ll/۟ܰ᩸;->ۙ(Ll/ܶ᩵᩸;ILl/ܶۜ᩸;)Ll/᩹ܽ᩵;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 301
    :try_start_4
    iget-object v2, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->᩷ۙ()V

    if-eqz v0, :cond_f

    .line 305
    iget-object v0, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    iget-object v2, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    iget-object v2, v2, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v0, v2}, Ll/᩺ۜ᩸;->ۤ(Ll/ᩳ۬᩸;)Ll/᩹ܽ᩵;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۗ᩸;->۟:Ll/᩹ܽ᩵;

    .line 306
    new-instance v2, Ll/֡ۗ᩸;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, Ll/֡ۗ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    .line 319
    :cond_f
    iget-object v0, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    const-string v2, "waiting_view_restoration"

    invoke-virtual {v0, v2}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    .line 320
    iput-object v1, p0, Ll/֨ۗ᩸;->ܺ:Ll/᩹ܽ᩵;

    .line 321
    new-instance v0, Ll/۟ۗ᩸;

    invoke-direct {v0, p0}, Ll/۟ۗ᩸;-><init>(Ll/֨ۗ᩸;)V

    invoke-virtual {v1, v0}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    .line 301
    iget-object v1, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->᩷ۙ()V

    .line 302
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    .line 340
    iget-object v1, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->᩷ۙ()V

    .line 341
    iput-object v0, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    invoke-direct {p0}, Ll/֨ۗ᩸;->ۚ()V

    goto :goto_4

    .line 346
    :cond_10
    :goto_2
    iget-object v0, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    iget-object v2, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    const-string v3, "releasing_failed_session"

    invoke-virtual {v2, v3}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    .line 347
    iput-boolean v6, p0, Ll/֨ۗ᩸;->ᩴ:Z

    .line 348
    iget-object v2, p0, Ll/֨ۗ᩸;->۟:Ll/᩹ܽ᩵;

    if-eqz v2, :cond_11

    invoke-virtual {v2, v1}, Ll/᩹ܽ᩵;->cancel(Z)Z

    .line 349
    :cond_11
    iget-object v2, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    if-nez v2, :cond_12

    new-instance v2, Ljava/util/concurrent/CancellationException;

    const-string v3, "Fragment session loading was canceled"

    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 351
    :cond_12
    :try_start_5
    iget-object v3, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    if-eqz v3, :cond_13

    iget-object v3, v3, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v0, v3}, Ll/᩺ۜ᩸;->ۙ(Ll/ᩳ۬᩸;)V

    .line 352
    :cond_13
    iget-boolean v3, p0, Ll/֨ۗ᩸;->֡:Z

    if-eqz v3, :cond_14

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v3

    iget-object v4, p0, Ll/֨ۗ᩸;->ۗ:Ll/ᩳ۬᩸;

    if-ne v3, v4, :cond_14

    invoke-virtual {v0, v4}, Ll/᩺ۜ᩸;->ۙ(Ll/ᩳ۬᩸;)V

    .line 353
    :cond_14
    invoke-virtual {v0, v1}, Ll/᩺ۜ᩸;->ۧ(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 363
    iget-object v0, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    if-nez v0, :cond_15

    const/4 v0, 0x0

    invoke-static {v0}, Ll/᩹ܽ᩵;->᩸(Ljava/lang/Object;)Ll/᩹ܽ᩵;

    move-result-object v0

    goto :goto_3

    :cond_15
    invoke-virtual {v0}, Ll/ܶ᩵᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object v0

    .line 364
    :goto_3
    new-instance v1, Ll/ۗۗ᩸;

    invoke-direct {v1, p0, v2}, Ll/ۗۗ᩸;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    goto :goto_4

    :catchall_3
    move-exception v3

    .line 355
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 357
    iput-boolean v6, p0, Ll/֨ۗ᩸;->ܰ:Z

    .line 358
    iget-object v3, p0, Ll/֨ۗ᩸;->ۧ:Ll/۟ܰ᩸;

    iget-object v4, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    invoke-virtual {v3, p0, v4, v1}, Ll/۟ܰ᩸;->ۙ(Ll/֨ۗ᩸;Ll/ܶ᩵᩸;Z)V

    .line 359
    iget-object v1, p0, Ll/֨ۗ᩸;->᩺:Ll/ܶۜ᩸;

    invoke-virtual {v0, v1}, Ll/᩺ۜ᩸;->ۙ(Ll/ܶۜ᩸;)V

    .line 360
    iget-object p0, p0, Ll/֨ۗ᩸;->ܳ:Ll/᩹ܽ᩵;

    invoke-virtual {p0, v2}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Throwable;)V

    goto :goto_4

    :catchall_4
    move-exception p0

    .line 259
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    throw p0

    :cond_16
    :goto_4
    return-void
.end method

.method public static synthetic ۙ(Ll/֨ۗ᩸;Ljava/lang/Throwable;)V
    .locals 1

    .line 307
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ܰ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/֨ۗ᩸;->ᩴ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-nez v0, :cond_3

    invoke-direct {p0}, Ll/֨ۗ᩸;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    goto :goto_0

    .line 310
    :cond_1
    iget-object p1, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    iget-object v0, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    iget-object v0, v0, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {p1, v0}, Ll/᩺ۜ᩸;->᩷(Ll/ۗۤᩴ;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    .line 311
    iput-boolean p1, p0, Ll/֨ۗ᩸;->ᩳ:Z

    .line 312
    iget-object p1, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    invoke-virtual {p1}, Ll/ۜۗ᩸;->ۤ()V

    .line 313
    iget-object p1, p0, Ll/֨ۗ᩸;->ۛ:Ll/᩺᩵᩸;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ll/᩺᩵᩸;->᩷()V

    .line 314
    :cond_2
    iget-object p1, p0, Ll/֨ۗ᩸;->ۧ:Ll/۟ܰ᩸;

    invoke-virtual {p1, p0}, Ll/۟ܰ᩸;->ۙ(Ll/֨ۗ᩸;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static synthetic ۙ(Ll/֨ۗ᩸;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 3

    .line 364
    iget-object v0, p0, Ll/֨ۗ᩸;->ܶ:Landroid/os/Handler;

    new-instance v1, Ll/᩵ۗ᩸;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Ll/᩵ۗ᩸;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ۙ(Ll/֨ۗ᩸;Ljava/lang/Throwable;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 132
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ܰ:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/֨ۗ᩸;->ᩴ:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 133
    invoke-virtual {p0, p2}, Ll/֨ۗ᩸;->ۙ(Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    move-object v0, p0

    .line 135
    monitor-enter v0

    const/4 p2, 0x2

    :try_start_0
    iput p2, p0, Ll/֨ۗ᩸;->ۢ:I

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    iput-object p1, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    .line 137
    invoke-direct {p0}, Ll/֨ۗ᩸;->ۚ()V

    return-void

    :catchall_0
    move-exception p0

    .line 135
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic ۙ(Ll/֨ۗ᩸;Ljava/lang/Throwable;Z)V
    .locals 1

    .line 211
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ܰ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/֨ۗ᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 212
    :cond_0
    iget-object v0, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    if-nez v0, :cond_1

    iput-object p1, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    :cond_1
    if-eqz p2, :cond_2

    .line 213
    iget-object p1, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-nez p1, :cond_2

    invoke-direct {p0}, Ll/֨ۗ᩸;->ܳ()V

    return-void

    .line 214
    :cond_2
    invoke-direct {p0}, Ll/֨ۗ᩸;->ۚ()V

    :cond_3
    :goto_0
    return-void
.end method

.method public static ۙ(Ll/֨ۗ᩸;Z)V
    .locals 3

    move-object v0, p0

    .line 183
    monitor-enter v0

    .line 184
    :try_start_0
    iget v1, p0, Ll/֨ۗ᩸;->ۢ:I

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 185
    iput v1, p0, Ll/֨ۗ᩸;->ۢ:I

    .line 186
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 188
    iget-object v0, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    if-eqz p1, :cond_1

    const-string v1, "opening_session"

    goto :goto_0

    :cond_1
    const-string v1, "preparing_layout"

    :goto_0
    invoke-virtual {v0, v1}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    .line 190
    :try_start_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_6

    .line 191
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-nez v0, :cond_5

    if-eqz p1, :cond_3

    .line 193
    iget-object v0, p0, Ll/֨ۗ᩸;->᩹:Ll/ۢۗ᩸;

    iget-object v1, p0, Ll/֨ۗ᩸;->ܽ:Ll/ܺۗ᩸;

    invoke-interface {v0, v1}, Ll/ۢۗ᩸;->ۙ(Ll/۟֡֫;)Ll/ܶ᩵᩸;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    .line 194
    iget-object v1, p0, Ll/֨ۗ᩸;->۫:Ll/۠᩹᩸;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Ll/ܶ᩵᩸;->ۙ(Ll/۠᩹᩸;)V

    .line 195
    :cond_2
    iget-object v0, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    iget-object v1, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    iget-object v1, v1, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v1}, Ll/ۙܿ᩸;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۜۗ᩸;->ۙ(I)V

    goto :goto_1

    .line 197
    :cond_3
    iget-object v0, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    iget-object v1, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    iget-object v1, v1, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v1}, Ll/ۙܿ᩸;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۜۗ᩸;->ۙ(I)V

    .line 198
    iget-object v0, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    iget-object v1, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    iget-object v1, v1, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    new-instance v2, Ll/ܶۗ᩸;

    invoke-direct {v2, p0}, Ll/ܶۗ᩸;-><init>(Ll/֨ۗ᩸;)V

    invoke-virtual {v0, v1, v2}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/CharSequence;Ll/۟֡֫;)Ljava/lang/CharSequence;

    .line 200
    :goto_1
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-nez v0, :cond_4

    const/4 v0, 0x0

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Fragment session loading was canceled"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 191
    :cond_5
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Fragment session loading was canceled"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 190
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Session preparation requires a background executor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 202
    iget-boolean v1, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-eqz v1, :cond_7

    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-nez v1, :cond_7

    .line 203
    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "Fragment session loading was canceled"

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 204
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_7
    :goto_2
    move-object v1, v0

    .line 207
    :goto_3
    iget-object v0, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    if-eqz p1, :cond_8

    const-string v2, "waiting_open_delivery"

    goto :goto_4

    :cond_8
    const-string v2, "waiting_layout_delivery"

    :goto_4
    invoke-virtual {v0, v2}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    move-object v0, p0

    .line 209
    monitor-enter v0

    const/4 v2, 0x2

    :try_start_2
    iput v2, p0, Ll/֨ۗ᩸;->ۢ:I

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 210
    iget-object v0, p0, Ll/֨ۗ᩸;->ܶ:Landroid/os/Handler;

    new-instance v2, Ll/᩹ۗ᩸;

    invoke-direct {v2, p0, v1, p1}, Ll/᩹ۗ᩸;-><init>(Ll/֨ۗ᩸;Ljava/lang/Throwable;Z)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_1
    move-exception p0

    .line 209
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p0

    :catchall_2
    move-exception p0

    .line 186
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p0
.end method

.method private ۙ(Z)V
    .locals 3

    .line 169
    iget-object v0, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    if-eqz p1, :cond_0

    const-string v1, "queued_open"

    goto :goto_0

    :cond_0
    const-string v1, "queued_layout"

    :goto_0
    invoke-virtual {v0, v1}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    move-object v0, p0

    .line 170
    monitor-enter v0

    .line 171
    :try_start_0
    iget-boolean v1, p0, Ll/֨ۗ᩸;->ۤ:Z

    const/4 v2, 0x2

    if-eqz v1, :cond_1

    iput v2, p0, Ll/֨ۗ᩸;->ۢ:I

    invoke-direct {p0}, Ll/֨ۗ᩸;->ۚ()V

    monitor-exit v0

    return-void

    :cond_1
    const/4 v1, 0x0

    .line 172
    iput v1, p0, Ll/֨ۗ᩸;->ۢ:I

    .line 173
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 174
    :try_start_1
    iget-object v0, p0, Ll/֨ۗ᩸;->ۚ:Ljava/util/concurrent/Executor;

    new-instance v1, Ll/ۛۗ᩸;

    invoke-direct {v1, p0, p1}, Ll/ۛۗ᩸;-><init>(Ll/֨ۗ᩸;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    move-object v0, p0

    .line 176
    monitor-enter v0

    :try_start_2
    iput v2, p0, Ll/֨ۗ᩸;->ۢ:I

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 177
    iput-object p1, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    .line 178
    invoke-direct {p0}, Ll/֨ۗ᩸;->ۚ()V

    return-void

    :catchall_0
    move-exception p1

    .line 176
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 173
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method private ۚ()V
    .locals 2

    .line 242
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ܰ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/֨ۗ᩸;->ᩴ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/֨ۗ᩸;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 243
    iput-boolean v0, p0, Ll/֨ۗ᩸;->᩸:Z

    .line 244
    new-instance v0, Ll/ۨۗ᩸;

    invoke-direct {v0, p0}, Ll/ۨۗ᩸;-><init>(Ll/֨ۗ᩸;)V

    iget-object v1, p0, Ll/֨ۗ᩸;->ܶ:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۚ(Ll/֨ۗ᩸;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/֨ۗ᩸;->۫()Z

    move-result p0

    return p0
.end method

.method public static synthetic ۤ(Ll/֨ۗ᩸;)Z
    .locals 0

    .line 198
    iget-boolean p0, p0, Ll/֨ۗ᩸;->ۤ:Z

    return p0
.end method

.method private ۫()Z
    .locals 3

    .line 238
    iget-object v0, p0, Ll/֨ۗ᩸;->ۧ:Ll/۟ܰ᩸;

    iget-boolean v1, v0, Ll/۟ܰ᩸;->۠ۙ:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    iget-object v2, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    if-ne v1, v2, :cond_0

    iget-object v0, v0, Ll/۟ܰ᩸;->ۜ:Ll/᩹۬᩸;

    iget-object v1, p0, Ll/֨ۗ᩸;->᩻:Ll/᩹۬᩸;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ۫(Ll/֨ۗ᩸;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֨ۗ᩸;->ᩳ:Z

    return p0
.end method

.method private ܳ()V
    .locals 5

    .line 153
    iget-object v0, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    const-string v1, "configuring_view"

    invoke-virtual {v0, v1}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    .line 154
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ܰ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/֨ۗ᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 155
    :cond_0
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-nez v0, :cond_2

    invoke-direct {p0}, Ll/֨ۗ᩸;->۫()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 157
    :cond_1
    :try_start_0
    iget-object v0, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    invoke-virtual {v0}, Ll/ܶ᩵᩸;->ᩴ()Ll/᩹ܽ᩵;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۗ᩸;->ۨ:Ll/᩹ܽ᩵;

    .line 158
    iget-object v0, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    iget-object v1, v0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v1, v1, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v0, v0, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v0}, Ll/ۗۤᩴ;->ܳ᩷()Ll/ܽۢ᩸;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/۫ۗ᩸;->ۙ(Ll/ܽۢ᩸;)V

    .line 159
    iget-object v0, p0, Ll/֨ۗ᩸;->᩻:Ll/᩹۬᩸;

    iget-object v1, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    iget-object v2, v1, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v2, v2, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v3, v2, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    iget-object v2, v2, Ll/۫ۗ᩸;->۟:Ll/ۗۙᩴ;

    iget-object v1, v1, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    iget-object v4, p0, Ll/֨ۗ᩸;->᩺:Ll/ܶۜ᩸;

    invoke-virtual {v0, v3, v2, v1, v4}, Ll/᩹۬᩸;->ۙ(Ll/ۨۤᩴ;Ll/ۗۙᩴ;Ll/ۗۤᩴ;Ll/ܶۜ᩸;)V

    const/4 v0, 0x0

    .line 160
    invoke-direct {p0, v0}, Ll/֨ۗ᩸;->ۙ(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object v0, p0

    .line 162
    monitor-enter v0

    const/4 v2, 0x2

    :try_start_1
    iput v2, p0, Ll/֨ۗ᩸;->ۢ:I

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 163
    iput-object v1, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    .line 164
    invoke-direct {p0}, Ll/֨ۗ᩸;->ۚ()V

    return-void

    :catchall_1
    move-exception v1

    .line 162
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1

    .line 155
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ll/֨ۗ᩸;->᩷()V

    :cond_3
    :goto_1
    return-void
.end method

.method public static bridge synthetic ܳ(Ll/֨ۗ᩸;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֨ۗ᩸;->ܰ:Z

    return p0
.end method

.method public static bridge synthetic ᩴ(Ll/֨ۗ᩸;)Ll/۟ܰ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۗ᩸;->ۧ:Ll/۟ܰ᩸;

    return-object p0
.end method

.method public static ᩷(Ll/֨ۗ᩸;)Ljava/lang/String;
    .locals 2

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/֨ۗ᩸;->ۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Ll/֨ۗ᩸;->۫:Ll/۠᩹᩸;

    if-nez p0, :cond_0

    const-string p0, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/۠᩹᩸;->ۙ()Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩷(Ll/֨ۗ᩸;Ljava/lang/Throwable;)V
    .locals 2

    .line 323
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ܰ:Z

    if-nez v0, :cond_7

    iget-boolean v0, p0, Ll/֨ۗ᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    .line 324
    iput-object p1, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    .line 325
    :cond_1
    invoke-direct {p0}, Ll/֨ۗ᩸;->۫()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    iget-object v1, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    iget-object v1, v1, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    if-eq p1, v1, :cond_3

    :cond_2
    iput-boolean v0, p0, Ll/֨ۗ᩸;->ۤ:Z

    .line 326
    :cond_3
    iget-boolean p1, p0, Ll/֨ۗ᩸;->ۤ:Z

    if-nez p1, :cond_6

    iget-object p1, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    if-eqz p1, :cond_4

    goto :goto_0

    .line 328
    :cond_4
    iget-object p1, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    const-string v1, "handing_off_owner"

    invoke-virtual {p1, v1}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    .line 329
    iget-object p1, p0, Ll/֨ۗ᩸;->ܽ:Ll/ܺۗ᩸;

    invoke-virtual {p1}, Ll/ܺۗ᩸;->᩸()V

    .line 330
    iput-boolean v0, p0, Ll/֨ۗ᩸;->ܰ:Z

    .line 331
    iget-object p1, p0, Ll/֨ۗ᩸;->۟:Ll/᩹ܽ᩵;

    if-eqz p1, :cond_5

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ll/᩹ܽ᩵;->cancel(Z)Z

    .line 332
    :cond_5
    iget-object p1, p0, Ll/֨ۗ᩸;->ۧ:Ll/۟ܰ᩸;

    iget-object v1, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    invoke-virtual {p1, p0, v1, v0}, Ll/۟ܰ᩸;->ۙ(Ll/֨ۗ᩸;Ll/ܶ᩵᩸;Z)V

    .line 333
    iget-object p1, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    iget-object v0, p0, Ll/֨ۗ᩸;->᩺:Ll/ܶۜ᩸;

    invoke-virtual {p1, v0}, Ll/᩺ۜ᩸;->ۙ(Ll/ܶۜ᩸;)V

    .line 335
    iget-object p1, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    invoke-virtual {p1}, Ll/ۜۗ᩸;->ۤ()V

    .line 336
    iget-object p1, p0, Ll/֨ۗ᩸;->ܳ:Ll/᩹ܽ᩵;

    iget-object p0, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    invoke-virtual {p1, p0}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Object;)V

    return-void

    .line 326
    :cond_6
    :goto_0
    invoke-direct {p0}, Ll/֨ۗ᩸;->ۚ()V

    :cond_7
    :goto_1
    return-void
.end method

.method public static synthetic ᩷(Ll/֨ۗ᩸;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 3

    .line 365
    iget-object v0, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 368
    :cond_0
    :try_start_0
    iget-boolean p1, p0, Ll/֨ۗ᩸;->֡:Z

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    iget-object v1, p0, Ll/֨ۗ᩸;->ۗ:Ll/ᩳ۬᩸;

    if-ne p1, v1, :cond_1

    invoke-virtual {v0, v1}, Ll/᩺ۜ᩸;->ۙ(Ll/ᩳ۬᩸;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 369
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 370
    iput-boolean p1, p0, Ll/֨ۗ᩸;->ܰ:Z

    .line 371
    iget-object p1, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/֨ۗ᩸;->۫:Ll/۠᩹᩸;

    if-eqz p1, :cond_2

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Throwable;)V

    .line 372
    :cond_2
    iget-object p1, p0, Ll/֨ۗ᩸;->ۧ:Ll/۟ܰ᩸;

    iget-object v1, p0, Ll/֨ۗ᩸;->᩵:Ll/ܶ᩵᩸;

    const/4 v2, 0x0

    invoke-virtual {p1, p0, v1, v2}, Ll/۟ܰ᩸;->ۙ(Ll/֨ۗ᩸;Ll/ܶ᩵᩸;Z)V

    .line 373
    iget-object p1, p0, Ll/֨ۗ᩸;->᩺:Ll/ܶۜ᩸;

    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ۙ(Ll/ܶۜ᩸;)V

    .line 374
    iget-object p0, p0, Ll/֨ۗ᩸;->ܳ:Ll/᩹ܽ᩵;

    invoke-virtual {p0, p2}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic ᩷(Ll/֨ۗ᩸;Ljava/lang/Throwable;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 131
    new-instance v0, Ll/ܿۗ᩸;

    invoke-direct {v0, p0, p1, p2}, Ll/ܿۗ᩸;-><init>(Ll/֨ۗ᩸;Ljava/lang/Throwable;Ljava/util/concurrent/Executor;)V

    .line 140
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    if-ne p1, p2, :cond_0

    invoke-virtual {v0}, Ll/ܿۗ᩸;->run()V

    return-void

    .line 141
    :cond_0
    iget-object p0, p0, Ll/֨ۗ᩸;->ܶ:Landroid/os/Handler;

    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static bridge synthetic ᩸(Ll/֨ۗ᩸;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֨ۗ᩸;->ۤ:Z

    return p0
.end method


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 3

    move-object v0, p0

    .line 112
    monitor-enter v0

    :try_start_0
    iget v1, p0, Ll/֨ۗ᩸;->ۢ:I

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "stage="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    invoke-virtual {v2}, Ll/ۜۗ᩸;->ۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\nloadTiming="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    invoke-virtual {v2}, Ll/ۜۗ᩸;->᩷()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\nworkerState="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\napplyingState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/֨ۗ᩸;->᩷:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\ncleaning="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/֨ۗ᩸;->ᩴ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\ncanceled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/֨ۗ᩸;->ۤ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\ndirectoryReady="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨ۗ᩸;->۫:Ll/۠᩹᩸;

    if-eqz v1, :cond_1

    .line 115
    invoke-virtual {v1}, Ll/۠᩹᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩹ܽ᩵;->isDone()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\npersistence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨ۗ᩸;->ۨ:Ll/᩹ܽ᩵;

    .line 116
    invoke-static {v1}, Ll/۠᩹᩸;->ۙ(Ll/᩹ܽ᩵;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nrestoration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨ۗ᩸;->ܺ:Ll/᩹ܽ᩵;

    invoke-static {v1}, Ll/۠᩹᩸;->ۙ(Ll/᩹ܽ᩵;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nfailure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨ۗ᩸;->֫:Ljava/lang/Throwable;

    .line 117
    invoke-static {v1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nfragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨ۗ᩸;->ۧ:Ll/۟ܰ᩸;

    .line 118
    invoke-static {v1}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nactivity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨ۗ᩸;->ۧ:Ll/۟ܰ᩸;

    .line 119
    invoke-virtual {v1}, Ll/ۧ۫ۙ;->getActivity()Ll/ۗ۫ۙ;

    move-result-object v1

    invoke-static {v1}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nviewDestroyed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/֨ۗ᩸;->֡:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\ncurrentView="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    invoke-direct {p0}, Ll/֨ۗ᩸;->۫()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    .line 121
    invoke-static {v1}, Ll/۠᩹᩸;->ۙ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    .line 122
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 112
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۙ(Ljava/lang/String;Ll/᩺۬᩹;)V
    .locals 3

    .line 86
    new-instance v0, Ll/᩺᩵᩸;

    new-instance v1, Ll/ᩳۗ᩸;

    invoke-direct {v1, p0}, Ll/ᩳۗ᩸;-><init>(Ll/֨ۗ᩸;)V

    new-instance v2, Ll/᩺ۗ᩸;

    invoke-direct {v2, p2, p1}, Ll/᩺ۗ᩸;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v1, v2}, Ll/᩺᩵᩸;-><init>(Ll/ᩳۗ᩸;Ll/᩺ۗ᩸;)V

    iput-object v0, p0, Ll/֨ۗ᩸;->ۛ:Ll/᩺᩵᩸;

    .line 103
    invoke-virtual {v0}, Ll/᩺᩵᩸;->ۙ()V

    return-void
.end method

.method public final ۙ(Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 146
    iput-object p1, p0, Ll/֨ۗ᩸;->ۚ:Ljava/util/concurrent/Executor;

    .line 147
    iget-object p1, p0, Ll/֨ۗ᩸;->᩹:Ll/ۢۗ᩸;

    if-nez p1, :cond_0

    invoke-direct {p0}, Ll/֨ۗ᩸;->ܳ()V

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 148
    invoke-direct {p0, p1}, Ll/֨ۗ᩸;->ۙ(Z)V

    return-void
.end method

.method public final ۙ(Ll/۠᩹᩸;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 127
    iget-object v0, p0, Ll/֨ۗ᩸;->᩶:Ll/ۜۗ᩸;

    const-string v1, "waiting_directory"

    invoke-virtual {v0, v1}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    .line 128
    iput-object p1, p0, Ll/֨ۗ᩸;->۫:Ll/۠᩹᩸;

    const-string v0, "session_load"

    .line 129
    invoke-virtual {p1, v0, p0}, Ll/۠᩹᩸;->ۙ(Ljava/lang/String;Ll/ۖ᩹᩸;)V

    .line 130
    invoke-virtual {p1}, Ll/۠᩹᩸;->ۤ()Ll/᩹ܽ᩵;

    move-result-object p1

    new-instance v0, Ll/ܽۗ᩸;

    invoke-direct {v0, p0, p2}, Ll/ܽۗ᩸;-><init>(Ll/֨ۗ᩸;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1, v0}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    return-void
.end method

.method public final ۤ()V
    .locals 1

    const/4 v0, 0x1

    .line 233
    iput-boolean v0, p0, Ll/֨ۗ᩸;->֡:Z

    .line 234
    invoke-virtual {p0}, Ll/֨ۗ᩸;->᩷()V

    return-void
.end method

.method public final ᩴ()Ll/᩹ܽ᩵;
    .locals 2

    .line 82
    new-instance v0, Ll/ۘۗ᩸;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Ll/֨ۗ᩸;->ܳ:Ll/᩹ܽ᩵;

    invoke-virtual {v1, v0}, Ll/᩹ܽ᩵;->᩷(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()V
    .locals 2

    .line 220
    iget-object v0, p0, Ll/֨ۗ᩸;->ۛ:Ll/᩺᩵᩸;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩺᩵᩸;->᩷()V

    .line 221
    :cond_0
    iget-boolean v0, p0, Ll/֨ۗ᩸;->ܰ:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, Ll/֨ۗ᩸;->ᩴ:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 222
    iput-boolean v0, p0, Ll/֨ۗ᩸;->ۤ:Z

    .line 223
    iget-object v0, p0, Ll/֨ۗ᩸;->ܽ:Ll/ܺۗ᩸;

    invoke-virtual {v0}, Ll/ܺۗ᩸;->cancel()V

    move-object v0, p0

    .line 224
    monitor-enter v0

    :try_start_0
    iget v1, p0, Ll/֨ۗ᩸;->ۢ:I

    if-nez v1, :cond_2

    const/4 v1, 0x2

    iput v1, p0, Ll/֨ۗ᩸;->ۢ:I

    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    iget-object v0, p0, Ll/֨ۗ᩸;->ܿ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܰ()V

    .line 226
    iget-object v0, p0, Ll/֨ۗ᩸;->ܺ:Ll/᩹ܽ᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->cancel(Z)Z

    .line 227
    :cond_3
    iget-object v0, p0, Ll/֨ۗ᩸;->۟:Ll/᩹ܽ᩵;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->cancel(Z)Z

    .line 228
    :cond_4
    invoke-direct {p0}, Ll/֨ۗ᩸;->ۚ()V

    return-void

    :catchall_0
    move-exception v1

    .line 224
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_5
    :goto_0
    return-void
.end method

.method public final ᩸()Z
    .locals 1

    .line 80
    iget-object v0, p0, Ll/֨ۗ᩸;->᩹:Ll/ۢۗ᩸;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

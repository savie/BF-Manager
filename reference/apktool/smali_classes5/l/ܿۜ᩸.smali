.class public final Ll/ܿۜ᩸;
.super Ll/ۖۙܺ;
.source "YAH9"


# instance fields
.field public final synthetic ֫:Ll/ܽ֡֫;

.field public final ۚ:Ll/ۧۤܺ;

.field public final synthetic ۧ:Ll/֨֫ᩴ;

.field public ۫:Ll/۠ܿ᩸;

.field public ܳ:Ll/ܳܿ᩸;

.field public final synthetic ܺ:Z

.field public final synthetic ᩻:Ll/᩺ۜ᩸;


# direct methods
.method public constructor <init>(Ll/᩺ۜ᩸;Ll/ܽ֡֫;Ll/֨֫ᩴ;Z)V
    .locals 0

    .line 357
    iput-object p1, p0, Ll/ܿۜ᩸;->᩻:Ll/᩺ۜ᩸;

    iput-object p2, p0, Ll/ܿۜ᩸;->֫:Ll/ܽ֡֫;

    iput-object p3, p0, Ll/ܿۜ᩸;->ۧ:Ll/֨֫ᩴ;

    iput-boolean p4, p0, Ll/ܿۜ᩸;->ܺ:Z

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    .line 359
    invoke-static {p1}, Ll/ۧۤܺ;->ۙ(Ll/᩺ۜ᩸;)Ll/ۧۤܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ܿۜ᩸;->ۚ:Ll/ۧۤܺ;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 384
    iget-object v0, p0, Ll/ܿۜ᩸;->ۚ:Ll/ۧۤܺ;

    invoke-virtual {v0}, Ll/ۧۤܺ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 385
    :cond_0
    iget-object v0, p0, Ll/ܿۜ᩸;->᩻:Ll/᩺ۜ᩸;

    iget-object v1, p0, Ll/ܿۜ᩸;->۫:Ll/۠ܿ᩸;

    invoke-static {v0, v1}, Ll/ᩳۜ᩸;->ۙ(Ll/᩺ۜ᩸;Ll/۠ܿ᩸;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 8

    .line 390
    iget-object v0, p0, Ll/ܿۜ᩸;->ۚ:Ll/ۧۤܺ;

    invoke-virtual {v0}, Ll/ۧۤܺ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 392
    :cond_0
    iget-object v0, p0, Ll/ܿۜ᩸;->ۧ:Ll/֨֫ᩴ;

    sget-object v1, Ll/֨֫ᩴ;->֫:Ll/֨֫ᩴ;

    if-ne v0, v1, :cond_1

    instance-of v0, p1, Ll/ۘ᩻ۨ;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ll/ۘ᩻ۨ;

    .line 393
    iget v1, v0, Ll/ۘ᩻ۨ;->֡:I

    iget v0, v0, Ll/ۘ᩻ۨ;->᩶:I

    invoke-static {v1, v0}, Ll/ܳۧۧ;->ۙ(II)Ll/ܳۧۧ;

    move-result-object v0

    iget-object v1, p0, Ll/ܿۜ᩸;->᩻:Ll/᩺ۜ᩸;

    invoke-virtual {v0, v1}, Ll/ܳۧۧ;->ۙ(Ll/᩺ۜ᩸;)V

    .line 395
    :cond_1
    iget-object v2, p0, Ll/ܿۜ᩸;->֫:Ll/ܽ֡֫;

    if-eqz v2, :cond_2

    .line 396
    new-instance v7, Ll/᩶ۜ᩸;

    iget-object v3, p0, Ll/ܿۜ᩸;->᩻:Ll/᩺ۜ᩸;

    invoke-direct {v7, p0, v3}, Ll/᩶ۜ᩸;-><init>(Ll/ܿۜ᩸;Ll/᩺ۜ᩸;)V

    iget-boolean v5, p0, Ll/ܿۜ᩸;->ܺ:Z

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v2 .. v7}, Ll/ᩳۜ᩸;->ۙ(Ll/ܽ֡֫;Ll/᩺ۜ᩸;Ljava/lang/Exception;ZZLjava/lang/Runnable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ᩴ()V
    .locals 5

    .line 372
    iget-object v0, p0, Ll/ܿۜ᩸;->᩻:Ll/᩺ۜ᩸;

    iget-object v1, p0, Ll/ܿۜ᩸;->ܳ:Ll/ܳܿ᩸;

    .line 373
    :try_start_0
    new-instance v2, Ll/ۤ᩻ᩴ;

    .line 374
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v3

    invoke-static {v3}, Ll/ۖۜ᩹;->toPath(Ljava/io/File;)Ll/᩺۬᩹;

    move-result-object v3

    const-string v4, "format-output"

    invoke-interface {v3, v4}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v3

    .line 375
    invoke-static {}, Ll/ᩳ᩵᩸;->ۙ()Ll/֡ۢ᩸;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ll/ۤ᩻ᩴ;-><init>(Ll/᩺۬᩹;Ll/֡ۢ᩸;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 376
    :try_start_1
    iget-object v3, p0, Ll/ܿۜ᩸;->ۧ:Ll/֨֫ᩴ;

    iget-boolean v4, p0, Ll/ܿۜ᩸;->ܺ:Z

    invoke-interface {v3, v0, v1, v4, v2}, Ll/֨֫ᩴ;->ۙ(Ll/᩺ۜ᩸;Ljava/lang/CharSequence;ZLl/ۤ᩻ᩴ;)V

    .line 377
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_1

    .line 378
    invoke-virtual {v2}, Ll/ۤ᩻ᩴ;->finish()Ll/۠ܿ᩸;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۜ᩸;->۫:Ll/۠ܿ᩸;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 379
    :try_start_2
    invoke-virtual {v2}, Ll/ۤ᩻ᩴ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ܳܿ᩸;->close()V

    :cond_0
    return-void

    .line 377
    :cond_1
    :try_start_3
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    .line 372
    :try_start_4
    invoke-virtual {v2}, Ll/ۤ᩻ᩴ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_5
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    if-eqz v1, :cond_2

    :try_start_6
    invoke-virtual {v1}, Ll/ܳܿ᩸;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw v0
.end method

.method public final ᩷()V
    .locals 2

    .line 364
    iget-object v0, p0, Ll/ܿۜ᩸;->᩻:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-interface {v0}, Ll/ۡ᩶᩸;->ۘ()Ll/ܳܿ᩸;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۜ᩸;->ܳ:Ll/ܳܿ᩸;

    .line 365
    iget-object v0, p0, Ll/ܿۜ᩸;->֫:Ll/ܽ֡֫;

    if-eqz v0, :cond_0

    const v1, 0x7f120966

    .line 366
    invoke-virtual {p0, v0, v1}, Ll/ۖۙܺ;->ۙ(Ll/ܽ֡֫;I)V

    :cond_0
    return-void
.end method

.method public final ᩸()V
    .locals 2

    .line 405
    :try_start_0
    iget-object v0, p0, Ll/ܿۜ᩸;->۫:Ll/۠ܿ᩸;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۠ܿ᩸;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 407
    :cond_0
    iget-object v0, p0, Ll/ܿۜ᩸;->ܳ:Ll/ܳܿ᩸;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ܳܿ᩸;->close()V

    .line 408
    :cond_1
    invoke-virtual {p0}, Ll/ۖۙܺ;->ۤ()V

    return-void

    :catchall_0
    move-exception v0

    .line 407
    iget-object v1, p0, Ll/ܿۜ᩸;->ܳ:Ll/ܳܿ᩸;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ll/ܳܿ᩸;->close()V

    .line 408
    :cond_2
    invoke-virtual {p0}, Ll/ۖۙܺ;->ۤ()V

    .line 409
    throw v0
.end method

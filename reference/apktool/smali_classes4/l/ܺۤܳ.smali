.class public final Ll/ܺۤܳ;
.super Ljava/lang/Object;
.source "F70U"


# instance fields
.field public final ֫:Ll/ܶۤܳ;

.field public ۙ:Z

.field public final ۚ:Ll/᩷ۨᩴ;

.field public ۤ:Z

.field public ۫:Ll/᩻ۤܳ;

.field public ܳ:Ljava/lang/Throwable;

.field public ᩴ:J

.field public ᩷:Ll/۬ᩴܳ;

.field public ᩸:Z


# direct methods
.method public constructor <init>(Ll/ܶۤܳ;Ll/᩷ۨᩴ;)V
    .locals 2

    .line 518
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 509
    sget-object v0, Ll/᩻ۤܳ;->۟:Ll/᩻ۤܳ;

    iput-object v0, p0, Ll/ܺۤܳ;->۫:Ll/᩻ۤܳ;

    const-wide/high16 v0, -0x8000000000000000L

    .line 514
    iput-wide v0, p0, Ll/ܺۤܳ;->ᩴ:J

    .line 519
    iput-object p1, p0, Ll/ܺۤܳ;->֫:Ll/ܶۤܳ;

    .line 520
    iput-object p2, p0, Ll/ܺۤܳ;->ۚ:Ll/᩷ۨᩴ;

    return-void
.end method

.method public static ۙ(Ll/ܺۤܳ;Z)V
    .locals 1

    const/4 v0, 0x1

    .line 701
    iput-boolean v0, p0, Ll/ܺۤܳ;->᩸:Z

    .line 702
    iget-boolean v0, p0, Ll/ܺۤܳ;->ۤ:Z

    or-int/2addr p1, v0

    iput-boolean p1, p0, Ll/ܺۤܳ;->ۤ:Z

    .line 709
    iget-object p1, p0, Ll/ܺۤܳ;->᩷:Ll/۬ᩴܳ;

    const/4 v0, 0x0

    .line 710
    iput-object v0, p0, Ll/ܺۤܳ;->᩷:Ll/۬ᩴܳ;

    if-nez p1, :cond_0

    goto :goto_0

    .line 715
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ll/۬ᩴܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    .line 727
    :cond_1
    iget-object p1, p0, Ll/ܺۤܳ;->ܳ:Ljava/lang/Throwable;

    if-nez p1, :cond_2

    .line 728
    iput-object v0, p0, Ll/ܺۤܳ;->ܳ:Ljava/lang/Throwable;

    goto :goto_1

    .line 730
    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 704
    :goto_1
    const-class p0, Ll/ܶۤܳ;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܺۤܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܺۤܳ;->ۤ:Z

    return p0
.end method

.method private ۫()V
    .locals 2

    .line 735
    iget-object v0, p0, Ll/ܺۤܳ;->۫:Ll/᩻ۤܳ;

    sget-object v1, Ll/᩻ۤܳ;->۟:Ll/᩻ۤܳ;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ܺۤܳ;->᩸:Z

    if-nez v0, :cond_0

    invoke-static {}, Ll/ܶۤܳ;->ۧ()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Ll/ܺۤܳ;->֫:Ll/ܶۤܳ;

    invoke-static {v1}, Ll/ܶۤܳ;->᩷(Ll/ܶۤܳ;)Ljava/lang/String;

    move-result-object v1

    .line 736
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_0

    return-void

    .line 737
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Hex checkpoint write was canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ᩷(Ll/ܺۤܳ;)V
    .locals 2

    .line 692
    iget-object v0, p0, Ll/ܺۤܳ;->۫:Ll/᩻ۤܳ;

    sget-object v1, Ll/᩻ۤܳ;->۟:Ll/᩻ۤܳ;

    if-ne v0, v1, :cond_3

    .line 693
    sget-object v0, Ll/᩻ۤܳ;->ᩳ:Ll/᩻ۤܳ;

    iput-object v0, p0, Ll/ܺۤܳ;->۫:Ll/᩻ۤܳ;

    .line 709
    iget-object v0, p0, Ll/ܺۤܳ;->᩷:Ll/۬ᩴܳ;

    const/4 v1, 0x0

    .line 710
    iput-object v1, p0, Ll/ܺۤܳ;->᩷:Ll/۬ᩴܳ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 715
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ll/۬ᩴܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    .line 727
    :cond_1
    iget-object v0, p0, Ll/ܺۤܳ;->ܳ:Ljava/lang/Throwable;

    if-nez v0, :cond_2

    .line 728
    iput-object v1, p0, Ll/ܺۤܳ;->ܳ:Ljava/lang/Throwable;

    goto :goto_1

    .line 730
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 695
    :goto_1
    const-class p0, Ll/ܶۤܳ;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    :cond_3
    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/io/IOException;
    .locals 4

    .line 680
    const-class v0, Ll/ܶۤܳ;

    monitor-enter v0

    .line 742
    :try_start_0
    new-instance v1, Ljava/io/IOException;

    iget-object v2, p0, Ll/ܺۤܳ;->۫:Ll/᩻ۤܳ;

    sget-object v3, Ll/᩻ۤܳ;->ܿ:Ll/᩻ۤܳ;

    if-ne v2, v3, :cond_0

    const-string v2, "Hex checkpoint write was discarded"

    goto :goto_0

    :cond_0
    const-string v2, "Hex checkpoint write failed"

    .line 744
    :goto_0
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 745
    iget-object v2, p0, Ll/ܺۤܳ;->ܳ:Ljava/lang/Throwable;

    if-eqz v2, :cond_1

    .line 746
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 681
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 682
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۙ(Ll/۟֡֫;)Ll/᩻ۤܳ;
    .locals 4

    .line 663
    const-class v0, Ll/ܶۤܳ;

    monitor-enter v0

    .line 664
    :goto_0
    :try_start_0
    iget-object v1, p0, Ll/ܺۤܳ;->۫:Ll/᩻ۤܳ;

    sget-object v2, Ll/᩻ۤܳ;->۟:Ll/᩻ۤܳ;

    if-ne v1, v2, :cond_0

    .line 665
    invoke-static {p1}, Ll/ܶۤܳ;->ۙ(Ll/۟֡֫;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 667
    :try_start_1
    const-class v1, Ll/ܶۤܳ;

    const-wide/16 v2, 0x64

    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 669
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 670
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Interrupted while waiting for hex checkpoint"

    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 673
    :cond_0
    invoke-static {p1}, Ll/ܶۤܳ;->ۙ(Ll/۟֡֫;)V

    .line 674
    iget-object p1, p0, Ll/ܺۤܳ;->۫:Ll/᩻ۤܳ;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 675
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ۙ(J)V
    .locals 1

    .line 551
    const-class v0, Ll/ܶۤܳ;

    monitor-enter v0

    .line 552
    :try_start_0
    invoke-direct {p0}, Ll/ܺۤܳ;->۫()V

    .line 553
    iput-wide p1, p0, Ll/ܺۤܳ;->ᩴ:J

    const/4 p1, 0x1

    .line 554
    iput-boolean p1, p0, Ll/ܺۤܳ;->ۙ:Z

    .line 555
    const-class p1, Ll/ܶۤܳ;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 556
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۙ(Ljava/lang/Throwable;)V
    .locals 5

    .line 616
    const-class v0, Ll/ܶۤܳ;

    monitor-enter v0

    .line 617
    :try_start_0
    invoke-static {}, Ll/ܶۤܳ;->ۧ()Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Ll/ܺۤܳ;->֫:Ll/ܶۤܳ;

    invoke-static {v2}, Ll/ܶۤܳ;->᩷(Ll/ܶۤܳ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 709
    :goto_0
    iget-object v2, p0, Ll/ܺۤܳ;->᩷:Ll/۬ᩴܳ;

    const/4 v3, 0x0

    .line 710
    iput-object v3, p0, Ll/ܺۤܳ;->᩷:Ll/۬ᩴܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    goto :goto_1

    .line 715
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ll/۬ᩴܳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    move-object v2, v3

    goto :goto_2

    :catch_0
    move-exception v2

    .line 754
    :goto_2
    :try_start_2
    iget-object v4, p0, Ll/ܺۤܳ;->ۚ:Ll/᩷ۨᩴ;

    invoke-static {v4}, Ll/ܶۤܳ;->ۙ(Ll/᩷ۨᩴ;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catch_1
    move-exception v3

    :goto_3
    if-nez v2, :cond_2

    move-object v2, v3

    goto :goto_4

    :cond_2
    if-eqz v3, :cond_3

    .line 623
    :try_start_3
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_3
    :goto_4
    if-eqz v1, :cond_6

    .line 627
    :try_start_4
    iget-boolean v1, p0, Ll/ܺۤܳ;->ۤ:Z

    if-eqz v1, :cond_4

    .line 628
    iget-object v1, p0, Ll/ܺۤܳ;->֫:Ll/ܶۤܳ;

    invoke-static {v1}, Ll/ܶۤܳ;->ۤ(Ll/ܶۤܳ;)V

    goto :goto_5

    .line 630
    :cond_4
    iget-object v1, p0, Ll/ܺۤܳ;->֫:Ll/ܶۤܳ;

    invoke-static {v1}, Ll/ܶۤܳ;->᩸(Ll/ܶۤܳ;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_5

    :catch_2
    move-exception v1

    if-nez v2, :cond_5

    move-object v2, v1

    goto :goto_5

    .line 636
    :cond_5
    :try_start_5
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 639
    :goto_5
    invoke-static {}, Ll/ܶۤܳ;->ۧ()Ljava/util/HashMap;

    move-result-object v1

    iget-object v3, p0, Ll/ܺۤܳ;->֫:Ll/ܶۤܳ;

    invoke-static {v3}, Ll/ܶۤܳ;->᩷(Ll/ܶۤܳ;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, p0}, Ll/ۧۚۗ;->remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 641
    :cond_6
    iget-object v1, p0, Ll/ܺۤܳ;->۫:Ll/᩻ۤܳ;

    sget-object v3, Ll/᩻ۤܳ;->۟:Ll/᩻ۤܳ;

    if-ne v1, v3, :cond_8

    .line 642
    iget-boolean v1, p0, Ll/ܺۤܳ;->᩸:Z

    if-eqz v1, :cond_7

    sget-object v1, Ll/᩻ۤܳ;->ܿ:Ll/᩻ۤܳ;

    goto :goto_6

    :cond_7
    sget-object v1, Ll/᩻ۤܳ;->֡:Ll/᩻ۤܳ;

    :goto_6
    iput-object v1, p0, Ll/ܺۤܳ;->۫:Ll/᩻ۤܳ;

    .line 643
    iput-object p1, p0, Ll/ܺۤܳ;->ܳ:Ljava/lang/Throwable;

    :cond_8
    if-eqz v2, :cond_a

    .line 646
    iget-object p1, p0, Ll/ܺۤܳ;->ܳ:Ljava/lang/Throwable;

    if-nez p1, :cond_9

    .line 647
    iput-object v2, p0, Ll/ܺۤܳ;->ܳ:Ljava/lang/Throwable;

    goto :goto_7

    .line 649
    :cond_9
    invoke-virtual {p1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 652
    :cond_a
    :goto_7
    const-class p1, Ll/ܶۤܳ;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 653
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final ۙ(Ll/۬ᩴܳ;)V
    .locals 3

    .line 537
    const-class v0, Ll/ܶۤܳ;

    monitor-enter v0

    .line 538
    :try_start_0
    invoke-direct {p0}, Ll/ܺۤܳ;->۫()V

    .line 539
    iget-object v1, p0, Ll/ܺۤܳ;->᩷:Ll/۬ᩴܳ;

    if-nez v1, :cond_0

    .line 542
    iput-object p1, p0, Ll/ܺۤܳ;->᩷:Ll/۬ᩴܳ;

    .line 543
    invoke-virtual {p1}, Ll/۬ᩴܳ;->ۙ()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ܺۤܳ;->ᩴ:J

    const/4 p1, 0x1

    .line 544
    iput-boolean p1, p0, Ll/ܺۤܳ;->ۙ:Z

    .line 545
    const-class p1, Ll/ܶۤܳ;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 546
    monitor-exit v0

    return-void

    .line 540
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Hex checkpoint view is already installed"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 546
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۙ(Z)V
    .locals 3

    .line 596
    const-class v0, Ll/ܶۤܳ;

    monitor-enter v0

    .line 597
    :try_start_0
    invoke-direct {p0}, Ll/ܺۤܳ;->۫()V

    .line 598
    iget-object v1, p0, Ll/ܺۤܳ;->ۚ:Ll/᩷ۨᩴ;

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܺۤܳ;->ۚ:Ll/᩷ۨᩴ;

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܰۙ()Z

    move-result v1

    if-nez v1, :cond_2

    .line 601
    iget-object v1, p0, Ll/ܺۤܳ;->ۚ:Ll/᩷ۨᩴ;

    iget-object v2, p0, Ll/ܺۤܳ;->֫:Ll/ܶۤܳ;

    invoke-static {v2}, Ll/ܶۤܳ;->ۙ(Ll/ܶۤܳ;)Ll/᩷ۨᩴ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩷ۨᩴ;->᩷(Ll/᩷ۨᩴ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 604
    invoke-static {}, Ll/ܶۤܳ;->ۧ()Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Ll/ܺۤܳ;->֫:Ll/ܶۤܳ;

    invoke-static {v2}, Ll/ܶۤܳ;->᩷(Ll/ܶۤܳ;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p0}, Ll/ۧۚۗ;->remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 605
    sget-object v1, Ll/᩻ۤܳ;->᩶:Ll/᩻ۤܳ;

    iput-object v1, p0, Ll/ܺۤܳ;->۫:Ll/᩻ۤܳ;

    .line 606
    const-class v1, Ll/ܶۤܳ;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 607
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 610
    iget-object p1, p0, Ll/ܺۤܳ;->֫:Ll/ܶۤܳ;

    invoke-static {p1}, Ll/ܶۤܳ;->ᩴ(Ll/ܶۤܳ;)V

    :cond_0
    return-void

    .line 602
    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Unable to commit pending hex checkpoint"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 599
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Hex pending state file is unavailable"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 607
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۤ()Z
    .locals 2

    .line 687
    iget-object v0, p0, Ll/ܺۤܳ;->۫:Ll/᩻ۤܳ;

    sget-object v1, Ll/᩻ۤܳ;->۟:Ll/᩻ۤܳ;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ܺۤܳ;->᩸:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Ll/۬ᩴܳ;
    .locals 3

    .line 571
    const-class v0, Ll/ܶۤܳ;

    monitor-enter v0

    .line 572
    :try_start_0
    invoke-direct {p0}, Ll/ܺۤܳ;->۫()V

    .line 573
    iget-object v1, p0, Ll/ܺۤܳ;->᩷:Ll/۬ᩴܳ;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 577
    iput-object v2, p0, Ll/ܺۤܳ;->᩷:Ll/۬ᩴܳ;

    .line 578
    monitor-exit v0

    return-object v1

    .line 575
    :cond_0
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Hex checkpoint view is unavailable"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 579
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩴ()V
    .locals 2

    .line 584
    const-class v0, Ll/ܶۤܳ;

    monitor-enter v0

    .line 585
    :try_start_0
    invoke-direct {p0}, Ll/ܺۤܳ;->۫()V

    .line 586
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩷()J
    .locals 3

    .line 561
    const-class v0, Ll/ܶۤܳ;

    monitor-enter v0

    .line 562
    :try_start_0
    iget-boolean v1, p0, Ll/ܺۤܳ;->ۙ:Z

    if-eqz v1, :cond_0

    .line 565
    iget-wide v1, p0, Ll/ܺۤܳ;->ᩴ:J

    monitor-exit v0

    return-wide v1

    .line 563
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Hex checkpoint generation is unavailable"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 566
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩸()Ljava/io/BufferedOutputStream;
    .locals 3

    .line 525
    const-class v0, Ll/ܶۤܳ;

    monitor-enter v0

    .line 526
    :try_start_0
    invoke-direct {p0}, Ll/ܺۤܳ;->۫()V

    .line 527
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 528
    iget-object v0, p0, Ll/ܺۤܳ;->ۚ:Ll/᩷ۨᩴ;

    invoke-static {v0}, Ll/ܶۤܳ;->᩷(Ll/᩷ۨᩴ;)V

    .line 529
    new-instance v0, Ljava/io/BufferedOutputStream;

    iget-object v1, p0, Ll/ܺۤܳ;->ۚ:Ll/᩷ۨᩴ;

    const/4 v2, 0x0

    .line 446
    invoke-virtual {v1, v2}, Ll/᩷ۨᩴ;->ۤ(Z)Ljava/io/OutputStream;

    move-result-object v1

    .line 529
    invoke-direct {v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-object v0

    :catchall_0
    move-exception v1

    .line 527
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

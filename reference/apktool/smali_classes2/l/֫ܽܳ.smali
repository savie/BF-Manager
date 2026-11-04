.class public final Ll/֫ܽܳ;
.super Ljava/lang/Object;
.source "F6G9"


# static fields
.field public static ۚ:Z = true

.field public static ۫:Ll/᩷ܽܳ;

.field public static ܳ:J

.field public static ᩴ:Ll/᩷ܽܳ;


# instance fields
.field public final ۙ:Ll/ܽ֡֫;

.field public final ۤ:Ll/ۜۙ᩻;

.field public final ᩷:Ll/۠ۖۧ;

.field public final ᩸:Ll/᩸ܽܳ;


# direct methods
.method public constructor <init>(Ll/ܽ֡֫;Ll/۠ۖۧ;Ll/ۜۙ᩻;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ll/᩸ܽܳ;

    .line 129
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object v0, p0, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    .line 54
    iput-object p1, p0, Ll/֫ܽܳ;->ۙ:Ll/ܽ֡֫;

    .line 55
    iput-object p2, p0, Ll/֫ܽܳ;->᩷:Ll/۠ۖۧ;

    .line 56
    iput-object p3, p0, Ll/֫ܽܳ;->ۤ:Ll/ۜۙ᩻;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/֫ܽܳ;)Ll/۠ۖۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ܽܳ;->᩷:Ll/۠ۖۧ;

    return-object p0
.end method

.method public static synthetic ۙ(Ll/᩷ܽܳ;)V
    .locals 1

    .line 368
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    invoke-static {p0, v0}, Ll/֫ܽܳ;->᩷(Ll/᩷ܽܳ;Ll/۬᩻ܳ;)V

    return-void
.end method

.method public static ۙ(Ll/᩷ܽܳ;Ll/ۙܽܳ;)V
    .locals 5

    .line 630
    invoke-static {p0}, Ll/֫ܽܳ;->ܳ(Ll/᩷ܽܳ;)V

    .line 631
    iget-object v0, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܽܳ;

    if-eqz v0, :cond_1

    .line 632
    iget-object v0, v0, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    iget-object v1, v0, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-eq v1, p0, :cond_0

    goto :goto_0

    .line 636
    :cond_0
    iget-wide v1, p0, Ll/᩷ܽܳ;->ۤ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩷ܽܳ;->ۤ:J

    .line 637
    iput-wide v1, v0, Ll/᩸ܽܳ;->᩷:J

    .line 638
    new-instance v0, Ll/ۖܺܳ;

    invoke-direct {v0, p0, p1, v1, v2}, Ll/ۖܺܳ;-><init>(Ll/᩷ܽܳ;Ll/ۙܽܳ;J)V

    const-wide/16 p0, 0xc8

    invoke-static {v0, p0, p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic ۙ(Ll/᩷ܽܳ;Ll/ۙܽܳ;J)V
    .locals 6

    .line 639
    iget-object v0, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܽܳ;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 641
    invoke-static {p0, v1}, Ll/֫ܽܳ;->ۤ(Ll/᩷ܽܳ;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    if-ne v2, p1, :cond_3

    iget-wide v2, p0, Ll/᩷ܽܳ;->ۤ:J

    cmp-long v4, v2, p2

    if-eqz v4, :cond_0

    goto :goto_0

    .line 646
    :cond_0
    iget-object v2, v0, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    .line 647
    iget-object v3, v2, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-ne v3, p0, :cond_3

    iget-wide v3, v2, Ll/᩸ܽܳ;->᩷:J

    cmp-long v5, v3, p2

    if-eqz v5, :cond_1

    goto :goto_0

    .line 652
    :cond_1
    :try_start_0
    new-instance v3, Ll/۬֨ᩴ;

    iget-object v0, v0, Ll/֫ܽܳ;->ۙ:Ll/ܽ֡֫;

    const v4, 0x7f12057b

    invoke-direct {v3, v0, v4}, Ll/۬֨ᩴ;-><init>(Ll/ܽ֡֫;I)V

    .line 653
    invoke-virtual {v3}, Ll/۬֨ᩴ;->ܳ()V

    .line 654
    invoke-static {p0, v1}, Ll/֫ܽܳ;->ۤ(Ll/᩷ܽܳ;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    if-ne v0, p1, :cond_2

    iget-wide v0, p0, Ll/᩷ܽܳ;->ۤ:J

    cmp-long p1, v0, p2

    if-nez p1, :cond_2

    iget-object p1, v2, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-ne p1, p0, :cond_2

    iget-wide p0, v2, Ll/᩸ܽܳ;->᩷:J

    cmp-long v0, p0, p2

    if-nez v0, :cond_2

    .line 659
    iput-object v3, v2, Ll/᩸ܽܳ;->ۙ:Ll/۬֨ᩴ;

    return-void

    .line 661
    :cond_2
    invoke-virtual {v3}, Ll/۬֨ᩴ;->ۙ()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    :goto_0
    return-void
.end method

.method public static synthetic ۙ(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V
    .locals 0

    .line 332
    invoke-static {p0, p1}, Ll/֫ܽܳ;->۫(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V

    return-void
.end method

.method public static ۙ(Ll/᩷ܽܳ;Ll/۠ۖۧ;Landroid/widget/Button;Landroid/widget/Button;Ll/֨ܶ;Landroid/view/View;)V
    .locals 2

    .line 335
    sget-object v0, Ll/ۙܽܳ;->᩶:Ll/ۙܽܳ;

    invoke-static {p0, p1, v0}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/۠ۖۧ;Ll/ۙܽܳ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 338
    :cond_0
    sget-object v0, Ll/ۙܽܳ;->֨:Ll/ۙܽܳ;

    iput-object v0, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    const/4 v1, 0x1

    .line 339
    iput-boolean v1, p0, Ll/᩷ܽܳ;->ۚ:Z

    const/4 v1, 0x0

    .line 340
    invoke-virtual {p1, v1}, Ll/۠ۖۧ;->ۙ(Z)V

    .line 341
    invoke-virtual {p2, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 342
    invoke-virtual {p3, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 343
    invoke-virtual {p4, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 344
    invoke-virtual {p5, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 345
    invoke-static {p0, v0}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۙܽܳ;)V

    .line 346
    sget-object p1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Ll/۬ܳܳ;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Ll/۬ܳܳ;-><init>(I)V

    .line 366
    :try_start_0
    new-instance p3, Ll/ܳܽܳ;

    invoke-direct {p3, p0, p2}, Ll/ܳܽܳ;-><init>(Ll/᩷ܽܳ;Ll/۬ܳܳ;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 368
    :catch_0
    new-instance p1, Ll/۟ܺܳ;

    invoke-direct {p1, p0}, Ll/۟ܺܳ;-><init>(Ll/᩷ܽܳ;)V

    invoke-static {p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V
    .locals 7

    .line 754
    sget-object v0, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    if-eq v0, p0, :cond_0

    goto :goto_0

    .line 757
    :cond_0
    sget-object v0, Ll/ۙܽܳ;->֡:Ll/ۙܽܳ;

    iput-object v0, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    iget-wide v0, p0, Ll/᩷ܽܳ;->᩷:J

    .line 758
    invoke-static {p0}, Ll/֫ܽܳ;->ᩴ(Ll/᩷ܽܳ;)V

    const/4 p0, 0x0

    .line 759
    sput-object p0, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    .line 762
    sget-wide v3, Ll/֫ܽܳ;->ܳ:J

    cmp-long v5, v0, v3

    if-nez v5, :cond_2

    .line 431
    sget-object v3, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    if-eq p2, v3, :cond_1

    sget-object v3, Ll/۬᩻ܳ;->֡:Ll/۬᩻ܳ;

    if-eq p2, v3, :cond_1

    sget-object v3, Ll/۬᩻ܳ;->᩶:Ll/۬᩻ܳ;

    if-eq p2, v3, :cond_1

    sget-object v3, Ll/۬᩻ܳ;->ۢ:Ll/۬᩻ܳ;

    if-ne p2, v3, :cond_2

    .line 765
    :cond_1
    sput-boolean v2, Ll/֫ܽܳ;->ۚ:Z

    .line 768
    :cond_2
    sget-object v3, Ll/֫ܽܳ;->۫:Ll/᩷ܽܳ;

    .line 769
    sput-object p0, Ll/֫ܽܳ;->۫:Ll/᩷ܽܳ;

    if-nez v3, :cond_3

    goto :goto_0

    .line 770
    :cond_3
    iget-wide v4, v3, Ll/᩷ܽܳ;->᩷:J

    .line 773
    sget-object v6, Ll/ۤܽܳ;->᩶:Ll/ۤܽܳ;

    if-ne p1, v6, :cond_4

    cmp-long p1, v4, v0

    if-nez p1, :cond_4

    goto :goto_0

    .line 777
    :cond_4
    sget-wide v0, Ll/֫ܽܳ;->ܳ:J

    cmp-long p1, v4, v0

    if-nez p1, :cond_8

    invoke-static {v3}, Ll/֫ܽܳ;->۫(Ll/᩷ܽܳ;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    .line 781
    :cond_5
    sput-object v3, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    .line 782
    invoke-static {v3}, Ll/֫ܽܳ;->᩸(Ll/᩷ܽܳ;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 783
    sput-object p0, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    return-void

    :cond_6
    if-eqz p2, :cond_7

    .line 788
    invoke-static {v3, v2}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Z)V

    return-void

    .line 791
    :cond_7
    invoke-static {v3, v2}, Ll/֫ܽܳ;->᩷(Ll/᩷ܽܳ;Z)V

    :cond_8
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩷ܽܳ;Ll/۬᩻ܳ;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ܽܳ;->᩷(Ll/᩷ܽܳ;Ll/۬᩻ܳ;)V

    return-void
.end method

.method public static ۙ(Ll/᩷ܽܳ;Z)V
    .locals 2

    const/4 v0, 0x0

    .line 505
    invoke-static {p0, v0}, Ll/֫ܽܳ;->ۤ(Ll/᩷ܽܳ;Z)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 506
    sget-object p1, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    .line 745
    :goto_0
    invoke-static {p0, p1, v1}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 509
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ll/ܽܺܳ;->᩶()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 510
    sget-object p1, Ll/ۤܽܳ;->᩶:Ll/ۤܽܳ;

    goto :goto_0

    .line 514
    :cond_1
    iget-object p1, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ܽܳ;

    if-nez p1, :cond_2

    .line 516
    sget-object p1, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    goto :goto_0

    .line 519
    :cond_2
    sget-object v0, Ll/ۙܽܳ;->۟:Ll/ۙܽܳ;

    iput-object v0, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    .line 520
    invoke-virtual {p1}, Ll/֫ܽܳ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 521
    sget-object p1, Ll/ۤܽܳ;->᩶:Ll/ۤܽܳ;

    goto :goto_1

    :cond_3
    sget-object p1, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    .line 745
    :goto_1
    invoke-static {p0, p1, v1}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    return-void
.end method

.method public static ۙ(Ll/᩷ܽܳ;Ll/۠ۖۧ;Ll/ۙܽܳ;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 731
    iget-object v1, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    if-ne v1, p2, :cond_1

    const/4 p2, 0x1

    .line 733
    invoke-static {p0, p2}, Ll/֫ܽܳ;->ۤ(Ll/᩷ܽܳ;Z)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 736
    :cond_0
    iget-object p0, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ܽܳ;

    if-eqz p0, :cond_1

    .line 737
    iget-object p0, p0, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    iget-object p0, p0, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    if-ne p0, p1, :cond_1

    return p2

    :cond_1
    :goto_0
    return v0
.end method

.method public static ۚ(Ll/᩷ܽܳ;)V
    .locals 2

    .line 262
    sget-object v0, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    if-eq v0, p0, :cond_0

    return-void

    .line 265
    :cond_0
    invoke-static {p0}, Ll/֫ܽܳ;->ܳ(Ll/᩷ܽܳ;)V

    const/4 v0, 0x0

    .line 266
    iput-boolean v0, p0, Ll/᩷ܽܳ;->ۚ:Z

    .line 267
    invoke-static {p0, v0}, Ll/֫ܽܳ;->ۤ(Ll/᩷ܽܳ;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 268
    sget-object v0, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    const/4 v1, 0x0

    .line 745
    invoke-static {p0, v0, v1}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    return-void

    .line 272
    :cond_1
    sget-object v0, Ll/ۙܽܳ;->ܿ:Ll/ۙܽܳ;

    iput-object v0, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    const/4 v0, 0x1

    .line 273
    invoke-static {p0, v0}, Ll/֫ܽܳ;->᩷(Ll/᩷ܽܳ;Z)V

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/᩷ܽܳ;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/֫ܽܳ;->ۚ(Ll/᩷ܽܳ;)V

    return-void
.end method

.method public static synthetic ۤ(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V
    .locals 1

    .line 350
    sget-object v0, Ll/ۙܽܳ;->᩶:Ll/ۙܽܳ;

    invoke-static {p0, p1, v0}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/۠ۖۧ;Ll/ۙܽܳ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 353
    :cond_0
    sget-object v0, Ll/ۙܽܳ;->۟:Ll/ۙܽܳ;

    iput-object v0, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    .line 354
    invoke-static {p0, p1}, Ll/֫ܽܳ;->ܳ(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V

    const/4 p1, 0x1

    .line 355
    invoke-static {p0, p1}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Z)V

    return-void
.end method

.method public static ۤ(Ll/᩷ܽܳ;Z)Z
    .locals 5

    .line 713
    sget-object v0, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    if-ne v0, p0, :cond_3

    iget-wide v0, p0, Ll/᩷ܽܳ;->᩷:J

    sget-wide v2, Ll/֫ܽܳ;->ܳ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    iget-boolean v0, p0, Ll/᩷ܽܳ;->ܳ:Z

    if-nez v0, :cond_3

    .line 716
    invoke-static {p0}, Ll/֫ܽܳ;->۫(Ll/᩷ܽܳ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 719
    :cond_0
    iget-object v0, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܽܳ;

    if-eqz v0, :cond_3

    .line 720
    iget-object v0, v0, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    iget-object v1, v0, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-eq v1, p0, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 723
    iget-object p0, v0, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    if-eqz p0, :cond_3

    .line 725
    invoke-virtual {p0}, Ll/۠ۖۧ;->۫()Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۫(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V
    .locals 3

    .line 563
    iget-object v0, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܽܳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 565
    iget-object v0, v0, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    .line 566
    iget-object v2, v0, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-ne v2, p0, :cond_0

    iget-object v2, v0, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    if-ne v2, p1, :cond_0

    .line 567
    iput-object v1, v0, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    .line 570
    :cond_0
    sget-object p1, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    if-ne p1, p0, :cond_2

    iget-object p1, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    sget-object v0, Ll/ۙܽܳ;->᩶:Ll/ۙܽܳ;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/ۙܽܳ;->ᩳ:Ll/ۙܽܳ;

    if-ne p1, v0, :cond_2

    :cond_1
    const/4 p1, 0x1

    .line 573
    iput-boolean p1, p0, Ll/᩷ܽܳ;->ܳ:Z

    .line 574
    sget-object p1, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    .line 745
    invoke-static {p0, p1, v1}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    :cond_2
    return-void
.end method

.method public static ۫(Ll/᩷ܽܳ;)Z
    .locals 4

    .line 704
    iget-object v0, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܽܳ;

    .line 705
    iget-object p0, p0, Ll/᩷ܽܳ;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۠ۖۧ;

    if-eqz v0, :cond_1

    .line 706
    iget-object v1, v0, Ll/֫ܽܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v1}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v2

    sget-object v3, Ll/ۖۧۙ;->ᩳ:Ll/ۖۧۙ;

    if-ne v2, v3, :cond_1

    .line 707
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    .line 708
    iget-object v0, v0, Ll/֫ܽܳ;->᩷:Ll/۠ۖۧ;

    if-ne v0, p0, :cond_1

    invoke-virtual {p0}, Ll/۠ۖۧ;->۫()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܳ(Ll/᩷ܽܳ;)V
    .locals 4

    .line 669
    iget-wide v0, p0, Ll/᩷ܽܳ;->ۤ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩷ܽܳ;->ۤ:J

    .line 670
    iget-object v2, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ܽܳ;

    if-nez v2, :cond_0

    goto :goto_0

    .line 674
    :cond_0
    iget-object v2, v2, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    .line 675
    iget-object v3, v2, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-eq v3, p0, :cond_1

    goto :goto_0

    .line 678
    :cond_1
    iput-wide v0, v2, Ll/᩸ܽܳ;->᩷:J

    .line 679
    iget-object p0, v2, Ll/᩸ܽܳ;->ۙ:Ll/۬֨ᩴ;

    const/4 v0, 0x0

    .line 680
    iput-object v0, v2, Ll/᩸ܽܳ;->ۙ:Ll/۬֨ᩴ;

    if-eqz p0, :cond_2

    .line 682
    invoke-virtual {p0}, Ll/۬֨ᩴ;->ۙ()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static ܳ(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 605
    :cond_0
    iget-object v0, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܽܳ;

    if-eqz v0, :cond_1

    .line 607
    iget-object v0, v0, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    .line 608
    iget-object v1, v0, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-ne v1, p0, :cond_1

    iget-object p0, v0, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    if-ne p0, p1, :cond_1

    const/4 p0, 0x0

    .line 609
    iput-object p0, v0, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    .line 612
    :cond_1
    invoke-virtual {p1}, Ll/۠ۖۧ;->۫()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 613
    invoke-virtual {p1}, Ll/۠ۖۧ;->dismiss()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static ᩴ()V
    .locals 4

    .line 544
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 545
    new-instance v0, Ll/ۡܺܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    .line 548
    :cond_0
    sget-wide v0, Ll/֫ܽܳ;->ܳ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    sput-wide v0, Ll/֫ܽܳ;->ܳ:J

    const/4 v0, 0x0

    .line 549
    sput-object v0, Ll/֫ܽܳ;->۫:Ll/᩷ܽܳ;

    .line 550
    sget-object v1, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    .line 554
    iput-boolean v2, v1, Ll/᩷ܽܳ;->ܳ:Z

    .line 555
    invoke-static {v1}, Ll/֫ܽܳ;->ᩴ(Ll/᩷ܽܳ;)V

    .line 556
    iget-boolean v2, v1, Ll/᩷ܽܳ;->ۚ:Z

    if-nez v2, :cond_2

    .line 557
    sget-object v2, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    .line 745
    invoke-static {v1, v2, v0}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static ᩴ(Ll/᩷ܽܳ;)V
    .locals 2

    .line 582
    iget-object v0, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܽܳ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 586
    :cond_0
    iget-object v0, v0, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    .line 587
    iget-object v1, v0, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-eq v1, p0, :cond_1

    goto :goto_0

    .line 590
    :cond_1
    sget-object v1, Ll/ۙܽܳ;->֡:Ll/ۙܽܳ;

    iput-object v1, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    .line 591
    invoke-static {p0}, Ll/֫ܽܳ;->ܳ(Ll/᩷ܽܳ;)V

    .line 592
    iget-object p0, v0, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    const/4 v1, 0x0

    .line 593
    iput-object v1, v0, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    .line 594
    iput-object v1, v0, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-eqz p0, :cond_2

    .line 595
    invoke-virtual {p0}, Ll/۠ۖۧ;->۫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 596
    invoke-virtual {p0}, Ll/۠ۖۧ;->dismiss()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic ᩴ(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V
    .locals 0

    .line 480
    invoke-static {p0, p1}, Ll/֫ܽܳ;->۫(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V

    return-void
.end method

.method public static synthetic ᩷(Ll/᩷ܽܳ;)V
    .locals 0

    .line 257
    invoke-static {p0}, Ll/֫ܽܳ;->ۚ(Ll/᩷ܽܳ;)V

    return-void
.end method

.method public static synthetic ᩷(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V
    .locals 1

    .line 482
    sget-object v0, Ll/ۙܽܳ;->ᩳ:Ll/ۙܽܳ;

    invoke-static {p0, p1, v0}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/۠ۖۧ;Ll/ۙܽܳ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 485
    :cond_0
    sget-object v0, Ll/ۙܽܳ;->۟:Ll/ۙܽܳ;

    iput-object v0, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    .line 486
    invoke-static {p0, p1}, Ll/֫ܽܳ;->ܳ(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V

    const/4 p1, 0x1

    .line 487
    invoke-static {p0, p1}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Z)V

    return-void
.end method

.method public static ᩷(Ll/᩷ܽܳ;Ll/۬᩻ܳ;)V
    .locals 8

    .line 378
    sget-object v0, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    if-eq v0, p0, :cond_0

    goto/16 :goto_4

    :cond_0
    if-nez p1, :cond_1

    .line 382
    sget-object p1, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    .line 384
    :cond_1
    sget-object v0, Ll/۬᩻ܳ;->۟:Ll/۬᩻ܳ;

    if-ne p1, v0, :cond_2

    .line 385
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ll/ܽܺܳ;->᩶()Z

    move-result v1

    if-nez v1, :cond_2

    .line 386
    sget-object p1, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    .line 618
    :cond_2
    iget-object v1, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ܽܳ;

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    .line 619
    iget-object v1, v1, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    iget-object v4, v1, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-eq v4, p0, :cond_3

    goto :goto_0

    .line 622
    :cond_3
    iget-object v1, v1, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    goto :goto_1

    :cond_4
    :goto_0
    move-object v1, v3

    .line 389
    :goto_1
    iget-wide v4, p0, Ll/᩷ܽܳ;->᩷:J

    sget-object v6, Ll/ۙܽܳ;->֨:Ll/ۙܽܳ;

    .line 388
    invoke-static {p0, v1, v6}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/۠ۖۧ;Ll/ۙܽܳ;)Z

    move-result v1

    .line 390
    invoke-static {p0}, Ll/֫ܽܳ;->ܳ(Ll/᩷ܽܳ;)V

    const/4 v6, 0x0

    .line 391
    iput-boolean v6, p0, Ll/᩷ܽܳ;->ۚ:Z

    if-nez v1, :cond_7

    .line 393
    invoke-static {p0}, Ll/֫ܽܳ;->ᩴ(Ll/᩷ܽܳ;)V

    if-ne p1, v0, :cond_5

    .line 394
    sget-wide v1, Ll/֫ܽܳ;->ܳ:J

    cmp-long v6, v4, v1

    if-nez v6, :cond_5

    .line 397
    sget-object p1, Ll/ۤܽܳ;->᩶:Ll/ۤܽܳ;

    .line 745
    invoke-static {p0, p1, v3}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    return-void

    .line 401
    :cond_5
    sget-object v1, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    if-ne p1, v0, :cond_6

    move-object p1, v3

    :cond_6
    invoke-static {p0, v1, p1}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    return-void

    .line 618
    :cond_7
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ܽܳ;

    if-eqz v1, :cond_9

    .line 619
    iget-object v1, v1, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    iget-object v7, v1, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-eq v7, p0, :cond_8

    goto :goto_2

    .line 622
    :cond_8
    iget-object v1, v1, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    goto :goto_3

    :cond_9
    :goto_2
    move-object v1, v3

    :goto_3
    if-ne p1, v0, :cond_b

    .line 408
    sget-object p1, Ll/ۙܽܳ;->֡:Ll/ۙܽܳ;

    iput-object p1, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    .line 410
    :try_start_0
    invoke-static {p0, v1}, Ll/֫ܽܳ;->ܳ(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 412
    sget-object p1, Ll/ۤܽܳ;->᩶:Ll/ۤܽܳ;

    .line 745
    invoke-static {p0, p1, v3}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    .line 415
    iget-boolean p1, p0, Ll/᩷ܽܳ;->ۙ:Z

    if-eqz p1, :cond_a

    sget-wide v0, Ll/֫ܽܳ;->ܳ:J

    cmp-long p1, v4, v0

    if-nez p1, :cond_a

    invoke-static {p0}, Ll/֫ܽܳ;->۫(Ll/᩷ܽܳ;)Z

    move-result p0

    if-eqz p0, :cond_a

    .line 416
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ܽܳ;

    if-eqz p0, :cond_a

    .line 417
    iget-object p0, p0, Ll/֫ܽܳ;->ۤ:Ll/ۜۙ᩻;

    invoke-virtual {p0}, Ll/ۜۙ᩻;->run()V

    :cond_a
    :goto_4
    return-void

    :catchall_0
    move-exception p1

    .line 412
    sget-object v0, Ll/ۤܽܳ;->᩶:Ll/ۤܽܳ;

    .line 745
    invoke-static {p0, v0, v3}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    .line 413
    throw p1

    .line 431
    :cond_b
    sget-object v0, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    if-eq p1, v0, :cond_c

    sget-object v0, Ll/۬᩻ܳ;->֡:Ll/۬᩻ܳ;

    if-eq p1, v0, :cond_c

    sget-object v0, Ll/۬᩻ܳ;->᩶:Ll/۬᩻ܳ;

    if-eq p1, v0, :cond_c

    sget-object v0, Ll/۬᩻ܳ;->ۢ:Ll/۬᩻ܳ;

    if-ne p1, v0, :cond_d

    .line 423
    :cond_c
    sput-boolean v6, Ll/֫ܽܳ;->ۚ:Z

    .line 425
    :cond_d
    sget-object p1, Ll/ۙܽܳ;->۟:Ll/ۙܽܳ;

    iput-object p1, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    .line 426
    invoke-static {p0, v1}, Ll/֫ܽܳ;->ܳ(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V

    .line 427
    invoke-static {p0, v6}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Z)V

    return-void
.end method

.method public static ᩷(Ll/᩷ܽܳ;Z)V
    .locals 14

    const/4 v0, 0x0

    .line 223
    invoke-static {p0, v0}, Ll/֫ܽܳ;->ۤ(Ll/᩷ܽܳ;Z)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 224
    sget-object p1, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    .line 745
    invoke-static {p0, p1, v2}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    return-void

    .line 227
    :cond_0
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ll/ܽܺܳ;->᩶()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 228
    sget-object p1, Ll/ۤܽܳ;->᩶:Ll/ۤܽܳ;

    .line 745
    invoke-static {p0, p1, v2}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    return-void

    .line 232
    :cond_1
    sget-boolean v1, Ll/֫ܽܳ;->ۚ:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-nez p1, :cond_2

    invoke-static {}, Ll/۟۠ۧ;->۫()Z

    move-result p1

    if-nez p1, :cond_2

    .line 233
    sget-object p1, Ll/ۙܽܳ;->ۢ:Ll/ۙܽܳ;

    iput-object p1, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    .line 234
    iput-boolean v3, p0, Ll/᩷ܽܳ;->ۚ:Z

    .line 235
    invoke-static {p0, p1}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۙܽܳ;)V

    .line 236
    sget-object p1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/۬ܳܳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/۬ܳܳ;-><init>(I)V

    .line 255
    :try_start_0
    new-instance v1, Ll/ۚܽܳ;

    invoke-direct {v1, p0, v0}, Ll/ۚܽܳ;-><init>(Ll/᩷ܽܳ;Ll/۬ܳܳ;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 257
    :catch_0
    new-instance p1, Ll/ܿܺܳ;

    invoke-direct {p1, p0}, Ll/ܿܺܳ;-><init>(Ll/᩷ܽܳ;)V

    invoke-static {p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    .line 240
    :cond_2
    sget-object p1, Ll/ۙܽܳ;->ܿ:Ll/ۙܽܳ;

    iput-object p1, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    iget-object p1, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    .line 241
    sget-boolean v1, Ll/֫ܽܳ;->ۚ:Z

    const v4, 0x7f120020

    if-eqz v1, :cond_9

    invoke-static {}, Ll/۟۠ۧ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_9

    const-string v1, "\n\n"

    .line 280
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ܽܳ;

    if-eqz p1, :cond_8

    .line 281
    iget-object v5, p1, Ll/֫ܽܳ;->ۙ:Ll/ܽ֡֫;

    invoke-static {p0, v0}, Ll/֫ܽܳ;->ۤ(Ll/᩷ܽܳ;Z)Z

    move-result v6

    if-nez v6, :cond_3

    goto/16 :goto_2

    .line 286
    :cond_3
    sget-object v6, Ll/ۙܽܳ;->᩶:Ll/ۙܽܳ;

    iput-object v6, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    const v6, 0x7f0d006e

    .line 293
    :try_start_1
    invoke-virtual {v5, v6}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f0a060e

    .line 294
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 295
    new-instance v8, Landroid/text/SpannableString;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const v10, 0x7f120022

    .line 296
    invoke-static {v10}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    invoke-static {v4}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v8, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 299
    invoke-static {v8, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v4

    :goto_0
    const/4 v9, -0x1

    if-eq v4, v9, :cond_4

    .line 301
    new-instance v9, Landroid/text/style/RelativeSizeSpan;

    const/high16 v10, 0x3f000000    # 0.5f

    invoke-direct {v9, v10}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    add-int/lit8 v10, v4, 0x2

    const/16 v11, 0x21

    invoke-virtual {v8, v9, v4, v10, v11}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 303
    invoke-static {v8, v1, v10}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v4

    goto :goto_0

    .line 305
    :cond_4
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f0a00ae

    .line 306
    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v4, 0x7f0a00af

    .line 307
    invoke-virtual {v6, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    const v7, 0x7f0a0013

    .line 308
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Ll/֨ܶ;

    const v7, 0x7f0a0015

    .line 309
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    .line 310
    sget-object v7, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    const-string v8, "iad"

    invoke-interface {v7, v8, v3}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    invoke-virtual {v12, v7}, Ll/֨ܶ;->setChecked(Z)V

    .line 312
    new-instance v7, Ll/۠ܺܳ;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v12, v7}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 314
    new-instance v7, Ll/ۨ֨᩻;

    const/4 v8, 0x2

    invoke-direct {v7, v12, v8}, Ll/ۨ֨᩻;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {v13, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 315
    invoke-static {v4}, Ll/ۖ᩷ۧ;->ۙ(Landroid/widget/TextView;)V

    .line 316
    invoke-virtual {v5}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v5

    invoke-virtual {v5, v6}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    invoke-virtual {v5}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 321
    invoke-virtual {v5}, Ll/۠ۖۧ;->۫()Z

    move-result v6

    if-nez v6, :cond_5

    .line 322
    invoke-static {p0, v3}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Z)V

    goto/16 :goto_5

    .line 325
    :cond_5
    iget-object p1, p1, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    .line 326
    iget-object v3, p1, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-ne v3, p0, :cond_7

    invoke-static {p0, v0}, Ll/֫ܽܳ;->ۤ(Ll/᩷ܽܳ;Z)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    .line 331
    :cond_6
    iput-object v5, p1, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    .line 332
    new-instance p1, Ll/ۜܺܳ;

    invoke-direct {p1, p0, v5}, Ll/ۜܺܳ;-><init>(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V

    invoke-virtual {v5, p1}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 334
    new-instance p1, Ll/۬ܺܳ;

    move-object v7, p1

    move-object v8, p0

    move-object v9, v5

    move-object v10, v1

    move-object v11, v4

    invoke-direct/range {v7 .. v13}, Ll/۬ܺܳ;-><init>(Ll/᩷ܽܳ;Ll/۠ۖۧ;Landroid/widget/Button;Landroid/widget/Button;Ll/֨ܶ;Landroid/view/View;)V

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 349
    new-instance p1, Ll/֡ܺܳ;

    invoke-direct {p1, p0, v5}, Ll/֡ܺܳ;-><init>(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V

    invoke-virtual {v4, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    .line 327
    :cond_7
    :goto_1
    invoke-virtual {v5}, Ll/۠ۖۧ;->dismiss()V

    .line 328
    sget-object p1, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    goto :goto_3

    .line 318
    :catch_1
    invoke-static {p0, v3}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Z)V

    goto/16 :goto_5

    .line 282
    :cond_8
    :goto_2
    sget-object p1, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    goto :goto_3

    .line 441
    :cond_9
    invoke-static {p0, v0}, Ll/֫ܽܳ;->ۤ(Ll/᩷ܽܳ;Z)Z

    move-result v1

    if-nez v1, :cond_a

    .line 442
    sget-object p1, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    .line 745
    :goto_3
    invoke-static {p0, p1, v2}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    goto/16 :goto_5

    :cond_a
    const-string v1, "forbid_tip_ar_manual"

    .line 446
    sget-object v5, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v5, v1, v3}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_b

    .line 447
    invoke-static {p0, v3}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Z)V

    goto/16 :goto_5

    .line 451
    :cond_b
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ܽܳ;

    if-nez p1, :cond_c

    .line 453
    sget-object p1, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    goto :goto_3

    .line 456
    :cond_c
    sget-object v1, Ll/ۙܽܳ;->ᩳ:Ll/ۙܽܳ;

    iput-object v1, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    .line 459
    :try_start_2
    iget-object v1, p1, Ll/֫ܽܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    const v5, 0x7f120c3f

    .line 460
    invoke-virtual {v1, v5}, Ll/ۖۖۧ;->᩷(I)V

    .line 461
    invoke-virtual {v1, v4}, Ll/ۖۖۧ;->ۙ(I)V

    const v4, 0x7f1208c9

    .line 462
    invoke-virtual {v1, v4, v2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v4, 0x7f120c41

    .line 463
    invoke-virtual {v1, v4, v2}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 464
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 469
    invoke-virtual {v1}, Ll/۠ۖۧ;->۫()Z

    move-result v4

    if-nez v4, :cond_d

    .line 470
    invoke-static {p0, v3}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Z)V

    goto :goto_5

    .line 473
    :cond_d
    iget-object p1, p1, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    .line 474
    iget-object v3, p1, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-ne v3, p0, :cond_f

    invoke-static {p0, v0}, Ll/֫ܽܳ;->ۤ(Ll/᩷ܽܳ;Z)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_4

    .line 479
    :cond_e
    iput-object v1, p1, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    .line 480
    new-instance p1, Ll/ᩳܺܳ;

    invoke-direct {p1, p0, v1}, Ll/ᩳܺܳ;-><init>(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V

    invoke-virtual {v1, p1}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 481
    invoke-virtual {v1}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ۢܺܳ;

    invoke-direct {v0, p0, v1}, Ll/ۢܺܳ;-><init>(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 489
    invoke-virtual {v1}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/֨ܺܳ;

    invoke-direct {v0, p0, v1}, Ll/֨ܺܳ;-><init>(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    .line 475
    :cond_f
    :goto_4
    invoke-virtual {v1}, Ll/۠ۖۧ;->dismiss()V

    .line 476
    sget-object p1, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    goto/16 :goto_3

    .line 466
    :catch_2
    invoke-static {p0, v3}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Z)V

    :goto_5
    return-void
.end method

.method public static bridge synthetic ᩸()J
    .locals 2

    .line 0
    sget-wide v0, Ll/֫ܽܳ;->ܳ:J

    return-wide v0
.end method

.method public static synthetic ᩸(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V
    .locals 3

    .line 490
    sget-object v0, Ll/ۙܽܳ;->ᩳ:Ll/ۙܽܳ;

    invoke-static {p0, p1, v0}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/۠ۖۧ;Ll/ۙܽܳ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 493
    :cond_0
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const/4 v1, 0x0

    const-string v2, "forbid_tip_ar_manual"

    .line 0
    invoke-static {v0, v2, v1}, Ll/ۛ۬ܳ;->ۙ(Ll/ۢ֫ܺ;Ljava/lang/String;Z)V

    .line 494
    sget-object v0, Ll/ۙܽܳ;->۟:Ll/ۙܽܳ;

    iput-object v0, p0, Ll/᩷ܽܳ;->ᩴ:Ll/ۙܽܳ;

    .line 495
    invoke-static {p0, p1}, Ll/֫ܽܳ;->ܳ(Ll/᩷ܽܳ;Ll/۠ۖۧ;)V

    const/4 p1, 0x1

    .line 496
    invoke-static {p0, p1}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Z)V

    return-void
.end method

.method public static ᩸(Ll/᩷ܽܳ;)Z
    .locals 4

    .line 687
    iget-object v0, p0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܽܳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 688
    invoke-static {p0}, Ll/֫ܽܳ;->۫(Ll/᩷ܽܳ;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 691
    :cond_0
    iget-object v0, v0, Ll/֫ܽܳ;->᩸:Ll/᩸ܽܳ;

    .line 692
    iget-object v2, v0, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    if-eqz v2, :cond_1

    if-eq v2, p0, :cond_1

    .line 693
    invoke-static {v2}, Ll/֫ܽܳ;->ᩴ(Ll/᩷ܽܳ;)V

    .line 695
    :cond_1
    iput-object p0, v0, Ll/᩸ܽܳ;->᩸:Ll/᩷ܽܳ;

    const/4 v2, 0x0

    .line 696
    iput-object v2, v0, Ll/᩸ܽܳ;->ۤ:Ll/۠ۖۧ;

    .line 697
    iput-object v2, v0, Ll/᩸ܽܳ;->ۙ:Ll/۬֨ᩴ;

    .line 698
    iget-wide v2, p0, Ll/᩷ܽܳ;->ۤ:J

    iput-wide v2, v0, Ll/᩸ܽܳ;->᩷:J

    .line 699
    iput-boolean v1, p0, Ll/᩷ܽܳ;->ܳ:Z

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    return v1
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 65
    sget-object v0, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 66
    sget-object v0, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    iput-boolean v1, v0, Ll/᩷ܽܳ;->ۙ:Z

    .line 67
    :cond_0
    sget-object v0, Ll/֫ܽܳ;->۫:Ll/᩷ܽܳ;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_1

    .line 68
    sget-object v0, Ll/֫ܽܳ;->۫:Ll/᩷ܽܳ;

    iput-boolean v1, v0, Ll/᩷ܽܳ;->ۙ:Z

    :cond_1
    return-void
.end method

.method public final ۙ(Z)V
    .locals 3

    .line 189
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 190
    :cond_0
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 198
    :cond_1
    new-instance v0, Ll/᩷ܽܳ;

    invoke-direct {v0, p0}, Ll/᩷ܽܳ;-><init>(Ll/֫ܽܳ;)V

    .line 199
    iput-boolean p1, v0, Ll/᩷ܽܳ;->ۙ:Z

    .line 200
    invoke-static {v0}, Ll/֫ܽܳ;->۫(Ll/᩷ܽܳ;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    .line 203
    :cond_2
    sget-object p1, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p1, :cond_4

    .line 204
    sput-object v0, Ll/֫ܽܳ;->۫:Ll/᩷ܽܳ;

    .line 205
    iget-boolean v0, p1, Ll/᩷ܽܳ;->ۚ:Z

    if-nez v0, :cond_3

    .line 206
    invoke-static {p1, v2}, Ll/֫ܽܳ;->ۤ(Ll/᩷ܽܳ;Z)Z

    move-result p1

    if-nez p1, :cond_3

    .line 207
    sget-object p1, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    sget-object v0, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    .line 745
    invoke-static {p1, v0, v1}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    :cond_3
    :goto_0
    return-void

    .line 211
    :cond_4
    sput-object v0, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    .line 212
    invoke-static {v0}, Ll/֫ܽܳ;->᩸(Ll/᩷ܽܳ;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 213
    sput-object v1, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    return-void

    .line 216
    :cond_5
    invoke-static {v0, v2}, Ll/֫ܽܳ;->᩷(Ll/᩷ܽܳ;Z)V

    return-void
.end method

.method public final ۤ()Z
    .locals 6

    const/4 v0, 0x0

    .line 527
    :try_start_0
    iget-object v1, p0, Ll/֫ܽܳ;->ۙ:Ll/ܽ֡֫;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.settings.ACCESSIBILITY_SETTINGS"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v1, 0x1

    .line 533
    :try_start_1
    sget-object v2, Ll/᩶᩷ۧ;->᩷:Ll/ܽܿ֫;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    :try_start_2
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    new-instance v4, Landroid/content/ComponentName;

    const-class v5, Lcom/google/android/accessibility/selecttospeak/SelectToSpeakService;

    invoke-direct {v4, v2, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v3, v4, v0}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object v3

    .line 75
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_0
    const v3, 0x7f1204ef

    .line 77
    :try_start_3
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    :goto_0
    new-array v3, v1, [Ljava/lang/Object;

    aput-object v2, v3, v0

    const v0, 0x7f120914

    .line 533
    invoke-static {v0, v3}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸۠ۧ;->᩷(Ljava/lang/CharSequence;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    return v1

    :catch_2
    return v0
.end method

.method public final ᩷()V
    .locals 3

    .line 798
    sget-object v0, Ll/֫ܽܳ;->۫:Ll/᩷ܽܳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 799
    iget-object v0, v0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 800
    sput-object v1, Ll/֫ܽܳ;->۫:Ll/᩷ܽܳ;

    .line 802
    :cond_0
    sget-object v0, Ll/֫ܽܳ;->ᩴ:Ll/᩷ܽܳ;

    if-eqz v0, :cond_2

    .line 803
    iget-object v2, v0, Ll/᩷ܽܳ;->۫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    .line 806
    iput-boolean v2, v0, Ll/᩷ܽܳ;->ܳ:Z

    .line 807
    invoke-static {v0}, Ll/֫ܽܳ;->ᩴ(Ll/᩷ܽܳ;)V

    .line 808
    iget-boolean v2, v0, Ll/᩷ܽܳ;->ۚ:Z

    if-nez v2, :cond_2

    .line 809
    sget-object v2, Ll/ۤܽܳ;->ܿ:Ll/ۤܽܳ;

    .line 745
    invoke-static {v0, v2, v1}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/ۤܽܳ;Ll/۬᩻ܳ;)V

    :cond_2
    :goto_0
    return-void
.end method

.class public Ll/ۨ᩷ܳ;
.super Landroid/view/View;
.source "D5GW"


# static fields
.field public static final synthetic ۢۙ:I


# instance fields
.field public ֡:Z

.field public ֡ۙ:Z

.field public final ֨:Ll/ۙ᩷ܳ;

.field public ֫ۙ:F

.field public ۖ:Z

.field public ۗۙ:Z

.field public ۘۙ:Ll/᩺ۙܳ;

.field public ۙۙ:I

.field public ۚۙ:I

.field public ۛۙ:J

.field public ۜ:Ll/᩺ۡ;

.field public ۟:I

.field public ۟ۙ:Z

.field public final ۠:Ll/ᩴᩳᩴ;

.field public final ۡ:Ll/ۚ᩷ܳ;

.field public ۢ:Ll/ۗۙܳ;

.field public ۤۙ:Ll/ܶ᩷ܳ;

.field public ۧۙ:F

.field public final ۨۙ:I

.field public ۫ۙ:J

.field public ۬:Ll/᩹᩷ܳ;

.field public ܰ:Ll/ܺ᩷ܳ;

.field public ܰۙ:F

.field public ܳۙ:J

.field public ܶۙ:I

.field public final ܺۙ:Ll/֫᩷ܳ;

.field public ܽۙ:[Ll/۫ۤܳ;

.field public ܿ:I

.field public ܿۙ:Z

.field public ᩳ:Z

.field public ᩳۙ:Z

.field public ᩴۙ:J

.field public final ᩵ۙ:I

.field public ᩶:Ll/ۗ᩷ܳ;

.field public ᩶ۙ:F

.field public final ᩷ۙ:Ll/ܳۤܳ;

.field public ᩸ۙ:Ll/۠ۤܳ;

.field public ᩹ۙ:Z

.field public ᩺ۙ:Z

.field public ᩻ۙ:Landroid/view/ViewTreeObserver;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 263
    invoke-direct {p0, p1, p2, v0}, Ll/ۨ᩷ܳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 267
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x1

    .line 47
    iput-boolean p2, p0, Ll/ۨ᩷ܳ;->֡:Z

    .line 48
    iput-boolean p2, p0, Ll/ۨ᩷ܳ;->ᩳ:Z

    .line 50
    iput-boolean p2, p0, Ll/ۨ᩷ܳ;->᩺ۙ:Z

    const/4 p3, -0x1

    .line 53
    iput p3, p0, Ll/ۨ᩷ܳ;->ܶۙ:I

    .line 55
    new-instance p3, Ll/֫᩷ܳ;

    invoke-direct {p3, p0}, Ll/֫᩷ܳ;-><init>(Ll/ۨ᩷ܳ;)V

    iput-object p3, p0, Ll/ۨ᩷ܳ;->ܺۙ:Ll/֫᩷ܳ;

    .line 229
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨ᩷ܳ;->ᩴۙ:J

    const-wide/16 v0, 0x0

    .line 234
    iput-wide v0, p0, Ll/ۨ᩷ܳ;->۫ۙ:J

    .line 246
    iput-wide v0, p0, Ll/ۨ᩷ܳ;->ܳۙ:J

    const/4 p3, 0x0

    .line 270
    invoke-virtual {p0, p3}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 271
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 272
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 274
    new-instance p2, Ll/᩹᩷ܳ;

    invoke-direct {p2, p0}, Ll/᩹᩷ܳ;-><init>(Ll/ۨ᩷ܳ;)V

    iput-object p2, p0, Ll/ۨ᩷ܳ;->۬:Ll/᩹᩷ܳ;

    .line 276
    new-instance p2, Ll/۠ۤܳ;

    invoke-direct {p2, p1}, Ll/۠ۤܳ;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ll/ۨ᩷ܳ;->᩸ۙ:Ll/۠ۤܳ;

    .line 277
    new-instance p2, Ll/ܽ᩷ܳ;

    invoke-direct {p2, p0}, Ll/ܽ᩷ܳ;-><init>(Ll/ۨ᩷ܳ;)V

    .line 278
    new-instance p3, Ll/᩺ۡ;

    invoke-direct {p3, p1, p2}, Ll/᩺ۡ;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p3, p0, Ll/ۨ᩷ܳ;->ۜ:Ll/᩺ۡ;

    .line 279
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 280
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledOverflingDistance()I

    move-result p2

    iput p2, p0, Ll/ۨ᩷ܳ;->᩵ۙ:I

    .line 281
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Ll/ۨ᩷ܳ;->ۨۙ:I

    .line 283
    new-instance p1, Ll/ۚ᩷ܳ;

    invoke-direct {p1, p0}, Ll/ۚ᩷ܳ;-><init>(Ll/ۨ᩷ܳ;)V

    iput-object p1, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    .line 289
    new-instance p2, Ll/ۙ᩷ܳ;

    invoke-direct {p2, p0, p1}, Ll/ۙ᩷ܳ;-><init>(Ll/ۨ᩷ܳ;Ll/ۚ᩷ܳ;)V

    iput-object p2, p0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    .line 290
    new-instance p1, Ll/ܳۤܳ;

    invoke-direct {p1, p0}, Ll/ܳۤܳ;-><init>(Ll/ۨ᩷ܳ;)V

    iput-object p1, p0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    .line 291
    new-instance p1, Ll/ᩴᩳᩴ;

    invoke-direct {p1, p0}, Ll/ᩴᩳᩴ;-><init>(Landroid/view/View;)V

    const/16 p2, 0xdac

    .line 292
    invoke-virtual {p1, p2}, Ll/ᩴᩳᩴ;->᩷(I)V

    new-instance p2, Ll/ۧ᩷ܳ;

    invoke-direct {p2, p0}, Ll/ۧ᩷ܳ;-><init>(Ljava/lang/Object;)V

    .line 293
    invoke-virtual {p1, p2}, Ll/ᩴᩳᩴ;->ۙ(Ll/᩸ᩳᩴ;)V

    iput-object p1, p0, Ll/ۨ᩷ܳ;->۠:Ll/ᩴᩳᩴ;

    return-void
.end method

.method private declared-synchronized ۘ()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 415
    :try_start_0
    iget-boolean v1, p0, Ll/ۨ᩷ܳ;->ۗۙ:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۨ᩷ܳ;->ܰ:Ll/ܺ᩷ܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static bridge synthetic ۙ(Ll/ۨ᩷ܳ;)Ll/۠ۤܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨ᩷ܳ;->᩸ۙ:Ll/۠ۤܳ;

    return-object p0
.end method

.method private ۙ(IZ)V
    .locals 13

    .line 737
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 738
    iget-object v1, p0, Ll/ۨ᩷ܳ;->۬:Ll/᩹᩷ܳ;

    if-eqz v1, :cond_1

    .line 739
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 740
    :cond_1
    iget-object v1, p0, Ll/ۨ᩷ܳ;->۠:Ll/ᩴᩳᩴ;

    invoke-virtual {v1}, Ll/ᩴᩳᩴ;->᩸()V

    .line 1230
    iget-object v2, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v3

    const v4, 0x7f1207bd

    if-eqz v3, :cond_2

    .line 743
    invoke-virtual {v1, v4}, Ll/ᩴᩳᩴ;->ۙ(I)V

    const v3, 0x1040001

    .line 744
    invoke-virtual {v1, v3}, Ll/ᩴᩳᩴ;->ۙ(I)V

    const v3, 0x7f120780

    .line 745
    invoke-virtual {v1, v3}, Ll/ᩴᩳᩴ;->ۙ(I)V

    .line 746
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->ۘ()Z

    move-result v3

    if-nez v3, :cond_3

    const v3, 0x7f120787

    .line 747
    invoke-virtual {v1, v3}, Ll/ᩴᩳᩴ;->ۙ(I)V

    const v3, 0x7f12079b

    .line 748
    invoke-virtual {v1, v3}, Ll/ᩴᩳᩴ;->ۙ(I)V

    goto :goto_0

    .line 751
    :cond_2
    invoke-virtual {v1, v4}, Ll/ᩴᩳᩴ;->ۙ(I)V

    .line 752
    :cond_3
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->ۘ()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {}, Ll/ۚ᩷ܳ;->᩶()Z

    move-result v3

    if-eqz v3, :cond_4

    const v3, 0x104000b

    .line 753
    invoke-virtual {v1, v3}, Ll/ᩴᩳᩴ;->ۙ(I)V

    .line 756
    :cond_4
    new-instance v3, Ll/ܶ᩸ܳ;

    .line 3
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x0

    .line 757
    iget-object v5, p0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    const/4 v6, -0x1

    if-ne p1, v6, :cond_9

    .line 759
    invoke-virtual {v5, v3}, Ll/ܳۤܳ;->ۙ(Ll/ܶ᩸ܳ;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 761
    iget p1, v3, Ll/ܶ᩸ܳ;->᩷:I

    iget v2, v3, Ll/ܶ᩸ܳ;->ۤ:I

    add-int/2addr p1, v2

    div-int/lit8 p1, p1, 0x2

    add-int/2addr p1, v0

    iput p1, v3, Ll/ܶ᩸ܳ;->ۤ:I

    const/4 p1, -0x2

    goto :goto_2

    .line 1222
    :cond_5
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    .line 1226
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->۫()I

    move-result v2

    .line 766
    invoke-virtual {v5, p1, v3, v4}, Ll/ܳۤܳ;->ۙ(ILl/ܶ᩸ܳ;Z)V

    .line 767
    iget-wide v7, v3, Ll/ܶ᩸ܳ;->᩸:J

    .line 513
    iget-wide v9, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    sub-long/2addr v7, v9

    const-wide/16 v11, 0x0

    cmp-long v4, v7, v11

    if-ltz v4, :cond_6

    .line 767
    iget-wide v7, v3, Ll/ܶ᩸ܳ;->ۙ:J

    sub-long/2addr v7, v9

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-long v9, v4

    cmp-long v4, v7, v9

    if-lez v4, :cond_9

    :cond_6
    if-eq p1, v2, :cond_8

    .line 770
    invoke-virtual {v5, v2, v3, v0}, Ll/ܳۤܳ;->ۙ(ILl/ܶ᩸ܳ;Z)V

    .line 771
    iget-wide v7, v3, Ll/ܶ᩸ܳ;->᩸:J

    .line 513
    iget-wide v9, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    sub-long/2addr v7, v9

    cmp-long p1, v7, v11

    if-ltz p1, :cond_8

    .line 771
    iget-wide v7, v3, Ll/ܶ᩸ܳ;->ۙ:J

    sub-long/2addr v7, v9

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-long v9, p1

    cmp-long p1, v7, v9

    if-lez p1, :cond_7

    goto :goto_1

    :cond_7
    const/4 p1, 0x0

    goto :goto_3

    :cond_8
    :goto_1
    const/4 p1, -0x1

    :cond_9
    :goto_2
    const/4 v2, 0x1

    move v2, p1

    const/4 p1, 0x1

    :goto_3
    if-eq v2, v6, :cond_10

    if-ltz v2, :cond_a

    .line 782
    invoke-virtual {v5, v2, v3, p2}, Ll/ܳۤܳ;->ۙ(ILl/ܶ᩸ܳ;Z)V

    .line 783
    :cond_a
    iget-object p2, p0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    if-nez p1, :cond_b

    .line 784
    iget-wide v4, v3, Ll/ܶ᩸ܳ;->ۙ:J

    .line 513
    iget-wide v6, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    sub-long/2addr v4, v6

    .line 784
    invoke-virtual {v1}, Ll/ᩴᩳᩴ;->᩷()I

    move-result v2

    int-to-long v6, v2

    add-long/2addr v4, v6

    iget-object v2, p2, Ll/ۙ᩷ܳ;->֨:Landroid/graphics/drawable/Drawable;

    .line 785
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    int-to-long v6, v2

    add-long/2addr v4, v6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-long v6, v2

    cmp-long v2, v4, v6

    if-lez v2, :cond_c

    goto :goto_4

    .line 787
    :cond_b
    iget-wide v4, v3, Ll/ܶ᩸ܳ;->᩸:J

    .line 513
    iget-wide v6, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    sub-long/2addr v4, v6

    .line 787
    invoke-virtual {v1}, Ll/ᩴᩳᩴ;->᩷()I

    move-result v0

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-gez v0, :cond_c

    const/4 v0, 0x0

    goto :goto_4

    :cond_c
    move v0, p1

    :goto_4
    if-eqz v0, :cond_e

    .line 790
    iget p1, v3, Ll/ܶ᩸ܳ;->ۤ:I

    iget-wide v2, v3, Ll/ܶ᩸ܳ;->᩸:J

    .line 513
    iget-wide v4, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    sub-long/2addr v2, v4

    long-to-int p2, v2

    int-to-long v4, p2

    cmp-long v0, v2, v4

    if-nez v0, :cond_d

    .line 790
    invoke-virtual {v1, p1, p2}, Ll/ᩴᩳᩴ;->ۙ(II)V

    return-void

    .line 0
    :cond_d
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 794
    :cond_e
    iget p1, v3, Ll/ܶ᩸ܳ;->ۤ:I

    iget-wide v2, v3, Ll/ܶ᩸ܳ;->ۙ:J

    .line 513
    iget-wide v4, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    sub-long/2addr v2, v4

    .line 797
    invoke-virtual {v1}, Ll/ᩴᩳᩴ;->᩷()I

    move-result v0

    int-to-long v4, v0

    add-long/2addr v2, v4

    iget-object p2, p2, Ll/ۙ᩷ܳ;->֨:Landroid/graphics/drawable/Drawable;

    .line 798
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p2

    int-to-long v4, p2

    add-long/2addr v2, v4

    long-to-int p2, v2

    int-to-long v4, p2

    cmp-long v0, v2, v4

    if-nez v0, :cond_f

    .line 794
    invoke-virtual {v1, p1, p2}, Ll/ᩴᩳᩴ;->ۙ(II)V

    return-void

    .line 0
    :cond_f
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 801
    :cond_10
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    .line 802
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    invoke-virtual {v1}, Ll/ᩴᩳᩴ;->᩷()I

    move-result v0

    add-int/2addr v0, p2

    div-int/lit8 v0, v0, 0x2

    .line 801
    invoke-virtual {v1, p1, v0}, Ll/ᩴᩳᩴ;->ۙ(II)V

    return-void
.end method

.method public static ۙ(Ll/ۨ᩷ܳ;Landroid/view/MenuItem;)V
    .locals 5

    .line 294
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 296
    :cond_0
    :try_start_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v1, 0x7f12079b

    const v2, 0x7f120787

    const v3, 0x7f120966

    if-eq p1, v2, :cond_1

    if-ne p1, v1, :cond_2

    .line 299
    :cond_1
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->ۘ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 300
    invoke-static {v3}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    :cond_2
    if-ne p1, v2, :cond_3

    const/4 p1, 0x0

    .line 304
    invoke-virtual {v0, p1}, Ll/ۚ᩷ܳ;->ۙ([B)V

    goto/16 :goto_0

    :cond_3
    if-ne p1, v1, :cond_4

    .line 306
    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۛ()V

    goto/16 :goto_0

    :cond_4
    const v1, 0x1040001

    if-ne p1, v1, :cond_7

    .line 23
    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->֫()Z

    move-result p1

    if-eqz p1, :cond_5

    const p1, 0x7f120457

    .line 25
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    goto/16 :goto_0

    .line 28
    :cond_5
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ۨ()Ll/ۗ᩷ܳ;

    move-result-object p1

    if-nez p1, :cond_6

    .line 30
    invoke-static {v3}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    goto/16 :goto_0

    .line 33
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 34
    new-instance v1, Ll/᩺ۤܳ;

    .line 114
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v2, Ll/ۛۤܳ;

    invoke-direct {v2, v1, p0, v0, p1}, Ll/ۛۤܳ;-><init>(Ll/᩺ۤܳ;Ll/ۨ᩷ܳ;Landroid/content/Context;Ll/ۗ᩷ܳ;)V

    .line 103
    invoke-virtual {v2}, Ll/ۖۙܺ;->۫()V

    goto :goto_0

    :cond_7
    const v0, 0x7f120780

    if-ne p1, v0, :cond_9

    .line 310
    sget p1, Ll/ۘۜᩴ;->ۙ:I

    .line 34
    invoke-static {p0}, Ll/᩹ۜᩴ;->᩷(Ll/ۨ᩷ܳ;)Ll/᩹ۜᩴ;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_0

    .line 38
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 39
    sget v1, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v1, Ll/ۖۖۧ;

    invoke-direct {v1, v0}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 39
    new-instance v0, Ll/ᩴۜᩴ;

    invoke-direct {v0, p0, p1}, Ll/ᩴۜᩴ;-><init>(Ll/ۨ᩷ܳ;Ll/᩹ۜᩴ;)V

    const p1, 0x7f030009

    .line 40
    invoke-virtual {v1, p1, v0}, Ll/ۖۖۧ;->ۙ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 42
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ll/۠ۖۧ;->ܳ()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 44
    invoke-virtual {p1}, Ll/۠ۖۧ;->ۚ()V

    goto :goto_0

    :cond_9
    const v0, 0x7f1207bd

    if-ne p1, v0, :cond_a

    .line 312
    invoke-static {p0}, Ll/ܳᩴܳ;->ۙ(Ll/ۨ᩷ܳ;)V

    goto :goto_0

    :cond_a
    const v0, 0x104000b

    if-ne p1, v0, :cond_c

    .line 23
    new-instance p1, Ll/ᩳۤܳ;

    .line 137
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ll/ۢۤܳ;

    invoke-direct {v0, p0}, Ll/ۢۤܳ;-><init>(Ll/ۨ᩷ܳ;)V

    .line 26
    new-instance v1, Ll/ܰۤܳ;

    invoke-direct {v1, p1}, Ll/ܰۤܳ;-><init>(Ll/ᩳۤܳ;)V

    new-instance v2, Ll/᩶ۤܳ;

    invoke-direct {v2, v0}, Ll/᩶ۤܳ;-><init>(Ll/ۢۤܳ;)V

    .line 25
    invoke-virtual {p0, v1, v2}, Ll/ۨ᩷ܳ;->ۙ(Ljava/lang/Runnable;Ljava/lang/Runnable;)Ll/ܺ᩷ܳ;

    move-result-object v1

    if-nez v1, :cond_b

    .line 28
    invoke-static {v3}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    goto :goto_0

    .line 32
    :cond_b
    new-instance v2, Ll/۟ۤܳ;

    invoke-direct {v2, v0, p0, p1, v1}, Ll/۟ۤܳ;-><init>(Ll/ۢۤܳ;Ll/ۨ᩷ܳ;Ll/ᩳۤܳ;Ll/ܺ᩷ܳ;)V

    .line 104
    invoke-virtual {v2}, Ll/ۖۙܺ;->۫()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 317
    invoke-virtual {p0, p1}, Ll/ۨ᩷ܳ;->ۙ(Ljava/io/IOException;)V

    .line 319
    :cond_c
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static ۙ(Ll/ۨ᩷ܳ;Ll/ۗ᩷ܳ;)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 425
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩷ܳ;->᩶:Ll/ۗ᩷ܳ;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    .line 426
    iput-object p1, p0, Ll/ۨ᩷ܳ;->᩶:Ll/ۗ᩷ܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 428
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۙ(Ll/ۨ᩷ܳ;Ll/ܺ᩷ܳ;)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 419
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩷ܳ;->ܰ:Ll/ܺ᩷ܳ;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    .line 420
    iput-object p1, p0, Ll/ۨ᩷ܳ;->ܰ:Ll/ܺ᩷ܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 422
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۙ(Ll/ۨ᩷ܳ;Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 724
    iget-object p0, p0, Ll/ۨ᩷ܳ;->۬:Ll/᩹᩷ܳ;

    const/4 p1, 0x2

    .line 1174
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeMessages(I)V

    const-wide/16 v0, 0xfa

    .line 1175
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    :cond_0
    const/4 p1, -0x1

    const/4 v0, 0x0

    .line 730
    invoke-direct {p0, p1, v0}, Ll/ۨ᩷ܳ;->ۙ(IZ)V

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/ۨ᩷ܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۨ᩷ܳ;->᩵ۙ:I

    return p0
.end method

.method private ۤ(Z)V
    .locals 1

    .line 887
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 888
    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    return-void
.end method

.method public static ۫(Ll/ۨ᩷ܳ;)V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 730
    invoke-direct {p0, v0, v1}, Ll/ۨ᩷ܳ;->ۙ(IZ)V

    return-void
.end method

.method private ܰ()V
    .locals 2

    .line 835
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨ᩷ܳ;->ᩴۙ:J

    iput-wide v0, p0, Ll/ۨ᩷ܳ;->۫ۙ:J

    .line 836
    iget-object v0, p0, Ll/ۨ᩷ܳ;->۬:Ll/᩹᩷ܳ;

    invoke-virtual {v0}, Ll/᩹᩷ܳ;->᩷()V

    return-void
.end method

.method public static ܳ(Ll/ۨ᩷ܳ;)Z
    .locals 3

    .line 1027
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۤۙ:Ll/ܶ᩷ܳ;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {v1}, Ll/ܳۤܳ;->ܺ()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Ll/ܶ᩷ܳ;->ۙ(J)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1028
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ᩴ(Ll/ۨ᩷ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->᩶()V

    return-void
.end method

.method private ᩶()V
    .locals 4

    .line 840
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨ᩷ܳ;->ܳۙ:J

    .line 1169
    iget-object v0, p0, Ll/ۨ᩷ܳ;->۬:Ll/᩹᩷ܳ;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const-wide/16 v2, 0x5dc

    .line 1170
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۨ᩷ܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۨ᩷ܳ;->ܳۙ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩸(Ll/ۨ᩷ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->ܰ()V

    return-void
.end method


# virtual methods
.method public final computeScroll()V
    .locals 2

    .line 810
    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->ۖ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 811
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ܳ;->᩸ۙ:Ll/۠ۤܳ;

    invoke-virtual {v0}, Ll/۠ۤܳ;->᩷()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 812
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->᩶()V

    .line 813
    invoke-virtual {v0}, Ll/۠ۤܳ;->ۤ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ۨ᩷ܳ;->ۙ(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 846
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ܳ()V

    .line 847
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 848
    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->۟ۙ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 849
    invoke-direct {p0, v0}, Ll/ۨ᩷ܳ;->ۤ(Z)V

    .line 850
    iput-boolean v0, p0, Ll/ۨ᩷ܳ;->֡ۙ:Z

    iput-boolean v0, p0, Ll/ۨ᩷ܳ;->۟ۙ:Z

    .line 852
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ܳ;->۬:Ll/᩹᩷ܳ;

    invoke-virtual {v0}, Ll/᩹᩷ܳ;->ۙ()V

    .line 853
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->᩸()Z

    .line 854
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ᩴ()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 683
    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->ᩳۙ:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    .line 686
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Ll/ۨ᩷ܳ;->ᩴۙ:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x3e8

    rem-long/2addr v3, v5

    const-wide/16 v5, 0x1f4

    cmp-long v0, v3, v5

    if-gez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 687
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Ll/ۨ᩷ܳ;->۫ۙ:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0xdac

    cmp-long v7, v3, v5

    if-gez v7, :cond_2

    :goto_1
    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 690
    :goto_2
    iget-object v4, p0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz v4, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v4

    if-nez v4, :cond_3

    const/4 v0, 0x1

    const/4 v3, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto :goto_3

    :cond_3
    move v6, v0

    move v7, v3

    .line 695
    :goto_3
    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->ܿۙ:Z

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v0, :cond_4

    goto :goto_4

    .line 698
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v8, p0, Ll/ۨ᩷ܳ;->ܳۙ:J

    sub-long/2addr v4, v8

    long-to-int v0, v4

    if-ltz v0, :cond_6

    const/16 v4, 0x5dc

    if-gt v0, v4, :cond_5

    :goto_4
    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_5

    :cond_5
    add-int/lit16 v0, v0, -0x5dc

    const/16 v4, 0x12c

    if-ge v0, v4, :cond_6

    int-to-float v0, v0

    const/high16 v4, 0x43960000    # 300.0f

    div-float/2addr v0, v4

    sub-float/2addr v3, v0

    move v8, v3

    goto :goto_5

    :cond_6
    const/4 v0, 0x0

    const/4 v8, 0x0

    .line 711
    :goto_5
    :try_start_0
    iget-object v4, p0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    iget-boolean v9, p0, Ll/ۨ᩷ܳ;->ܿۙ:Z

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, Ll/ܳۤܳ;->ۙ(Landroid/graphics/Canvas;ZZFZ)V

    .line 713
    iput-boolean v1, p0, Ll/ۨ᩷ܳ;->᩹ۙ:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 716
    iget-object v1, p0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v1, v1, Ll/ۙ᩷ܳ;->ۨ:I

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 717
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ܳ()V

    .line 1420
    iget-boolean p1, p0, Ll/ۨ᩷ܳ;->᩹ۙ:Z

    if-nez p1, :cond_7

    iget-object p1, p0, Ll/ۨ᩷ܳ;->ۤۙ:Ll/ܶ᩷ܳ;

    if-eqz p1, :cond_7

    .line 1421
    iput-boolean v2, p0, Ll/ۨ᩷ܳ;->᩹ۙ:Z

    .line 1422
    invoke-interface {p1, v0}, Ll/ܶ᩷ܳ;->ۙ(Ljava/io/IOException;)V

    :cond_7
    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 859
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    if-nez p1, :cond_0

    .line 862
    iget-object p1, p0, Ll/ۨ᩷ܳ;->۬:Ll/᩹᩷ܳ;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeMessages(I)V

    .line 863
    iget-object p1, p0, Ll/ۨ᩷ܳ;->۠:Ll/ᩴᩳᩴ;

    invoke-virtual {p1}, Ll/ᩴᩳᩴ;->ۙ()V

    .line 864
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ܳ()V

    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 8

    .line 541
    iget-object v0, p0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {v0}, Ll/ܳۤܳ;->ܽ()Z

    move-result v1

    .line 542
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    sub-int/2addr p4, p2

    .line 545
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p1

    sub-int/2addr p4, p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p1

    sub-int/2addr p4, p1

    .line 535
    iget p1, p0, Ll/ۨ᩷ܳ;->۟:I

    const/4 p2, 0x1

    if-lez p1, :cond_0

    goto :goto_0

    .line 536
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    if-ne p1, p2, :cond_1

    const/16 p1, 0x8

    goto :goto_0

    :cond_1
    const/16 p1, 0x10

    .line 547
    :goto_0
    iget p3, p0, Ll/ۨ᩷ܳ;->ۙۙ:I

    iget-object p5, p0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    if-ne p4, p3, :cond_2

    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result p3

    if-eq p1, p3, :cond_3

    :cond_2
    iget p3, p5, Ll/ۙ᩷ܳ;->᩻:I

    if-eqz p3, :cond_3

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_4

    .line 513
    iget-wide v4, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    .line 550
    invoke-virtual {v0}, Ll/ܳۤܳ;->ۧ()I

    move-result p3

    int-to-long v6, p3

    add-long/2addr v4, v6

    const/4 p3, 0x0

    .line 666
    invoke-virtual {v0, p3, v4, v5, v2}, Ll/ܳۤܳ;->ۙ(FJZ)I

    move-result v2

    .line 551
    :cond_4
    invoke-virtual {v3, p1}, Ll/ۚ᩷ܳ;->ۤ(I)V

    .line 552
    invoke-virtual {p5, p4}, Ll/ۙ᩷ܳ;->ۙ(I)V

    .line 553
    iput p4, p0, Ll/ۨ᩷ܳ;->ۙۙ:I

    .line 554
    iget-object p1, p0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz p1, :cond_5

    .line 513
    iget-wide p1, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    .line 555
    invoke-virtual {p0, p1, p2}, Ll/ۨ᩷ܳ;->᩷(J)V

    return-void

    :cond_5
    if-eqz v1, :cond_7

    .line 559
    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_2

    .line 561
    :cond_6
    invoke-virtual {v0}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide p1

    .line 513
    iget-wide p3, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    cmp-long p5, p3, p1

    if-lez p5, :cond_a

    .line 563
    invoke-virtual {p0, p1, p2}, Ll/ۨ᩷ܳ;->ۙ(J)V

    return-void

    :cond_7
    if-eqz p2, :cond_9

    .line 567
    invoke-virtual {v0, v2}, Ll/ܳۤܳ;->᩸(I)I

    move-result p1

    .line 568
    invoke-virtual {v0, p1}, Ll/ܳۤܳ;->ۤ(I)J

    move-result-wide p1

    invoke-virtual {v0}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide p3

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    .line 569
    iget-object p3, p0, Ll/ۨ᩷ܳ;->᩸ۙ:Ll/۠ۤܳ;

    invoke-virtual {p3}, Ll/۠ۤܳ;->᩸()Z

    move-result p4

    if-nez p4, :cond_8

    .line 570
    invoke-virtual {p3}, Ll/۠ۤܳ;->ۙ()V

    .line 513
    :cond_8
    iget-wide p4, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    sub-long/2addr p1, p4

    .line 571
    invoke-virtual {p3, p4, p5, p1, p2}, Ll/۠ۤܳ;->ۙ(JJ)V

    .line 572
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 575
    :cond_9
    invoke-virtual {v0}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide p1

    .line 513
    iget-wide p3, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    cmp-long p5, p3, p1

    if-lez p5, :cond_a

    .line 577
    invoke-virtual {p0, p1, p2}, Ll/ۨ᩷ܳ;->ۙ(J)V

    :cond_a
    :goto_2
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 526
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 527
    iget-object p1, p0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz p1, :cond_2

    .line 535
    iget p1, p0, Ll/ۨ᩷ܳ;->۟:I

    if-lez p1, :cond_0

    goto :goto_0

    .line 536
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    const/16 p1, 0x8

    goto :goto_0

    :cond_1
    const/16 p1, 0x10

    .line 529
    :goto_0
    iget-object p2, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p2, p1}, Ll/ۚ᩷ܳ;->ۤ(I)V

    .line 530
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int/2addr p1, p2

    iget-object p2, p0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    invoke-virtual {p2, p1}, Ll/ۙ᩷ܳ;->ۙ(I)V

    :cond_2
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .line 894
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x2

    .line 895
    iget-object v2, p0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    const/4 v3, 0x0

    iget-object v4, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    iget-object v5, p0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    const/4 v6, 0x1

    if-eqz v0, :cond_15

    const/4 v7, 0x3

    if-eq v0, v6, :cond_f

    if-eq v0, v1, :cond_0

    if-eq v0, v7, :cond_f

    const/4 v1, 0x5

    if-eq v0, v1, :cond_14

    const/4 v1, 0x6

    if-eq v0, v1, :cond_14

    goto/16 :goto_8

    .line 948
    :cond_0
    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->ᩳۙ:Z

    if-eqz v0, :cond_7

    .line 949
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 950
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 951
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 952
    iget v1, p0, Ll/ۨ᩷ܳ;->֫ۙ:F

    add-float/2addr v0, v1

    .line 513
    iget-wide v1, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    .line 954
    iget v3, p0, Ll/ۨ᩷ܳ;->ۧۙ:F

    add-float/2addr v3, p1

    float-to-int v3, v3

    int-to-long v7, v3

    add-long/2addr v1, v7

    .line 952
    invoke-virtual {v5, v0, v1, v2, v6}, Ll/ܳۤܳ;->ۙ(FJZ)I

    move-result v0

    .line 955
    invoke-virtual {v5}, Ll/ܳۤܳ;->ۗ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 956
    invoke-virtual {v4}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ۨ᩷ܳ;->ۚۙ:I

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v0

    .line 957
    :goto_0
    invoke-virtual {v5, v0}, Ll/ܳۤܳ;->ܳ(I)I

    move-result v0

    .line 959
    :cond_2
    invoke-virtual {v4}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 960
    iget v1, p0, Ll/ۨ᩷ܳ;->ܿ:I

    invoke-virtual {v4, v0, v1}, Ll/ۚ᩷ܳ;->᩷(II)V

    .line 961
    iput v0, p0, Ll/ۨ᩷ܳ;->ۚۙ:I

    goto :goto_1

    .line 963
    :cond_3
    invoke-virtual {v5}, Ll/ܳۤܳ;->ۨ()Z

    move-result v1

    invoke-virtual {v4, v0, v1}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 818
    :goto_1
    invoke-virtual {v5}, Ll/ܳۤܳ;->᩻()F

    move-result v0

    iget v1, p0, Ll/ۨ᩷ܳ;->ۧۙ:F

    sub-float/2addr v0, v1

    cmpg-float v1, p1, v0

    if-gez v1, :cond_5

    .line 513
    iget-wide v1, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    long-to-float v1, v1

    sub-float/2addr v1, v0

    add-float/2addr v1, p1

    float-to-long v0, v1

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gez p1, :cond_4

    move-wide v0, v2

    .line 825
    :cond_4
    invoke-virtual {p0, v0, v1}, Ll/ۨ᩷ܳ;->ۙ(J)V

    return v6

    .line 826
    :cond_5
    invoke-virtual {v5}, Ll/ܳۤܳ;->᩷()F

    move-result v0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_6

    .line 513
    iget-wide v1, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    long-to-float v1, v1

    sub-float/2addr v1, v0

    add-float/2addr v1, p1

    float-to-long v0, v1

    .line 828
    invoke-virtual {v5}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 829
    invoke-virtual {p0, v0, v1}, Ll/ۨ᩷ܳ;->ۙ(J)V

    return v6

    .line 831
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v6

    .line 968
    :cond_7
    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->۟ۙ:Z

    if-eqz v0, :cond_c

    .line 969
    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->֡ۙ:Z

    if-eqz v0, :cond_8

    goto/16 :goto_4

    .line 970
    :cond_8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Ll/ۨ᩷ܳ;->ܰۙ:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 971
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v4, p0, Ll/ۨ᩷ܳ;->᩶ۙ:F

    sub-float/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 972
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v4

    iget v7, p0, Ll/ۨ᩷ܳ;->ۨۙ:I

    int-to-float v7, v7

    cmpg-float v4, v4, v7

    if-gtz v4, :cond_9

    goto/16 :goto_4

    :cond_9
    cmpl-float v0, v0, v1

    if-lez v0, :cond_a

    .line 974
    iput-boolean v6, p0, Ll/ۨ᩷ܳ;->֡ۙ:Z

    .line 975
    invoke-direct {p0, v3}, Ll/ۨ᩷ܳ;->ۤ(Z)V

    return v6

    .line 978
    :cond_a
    iput-boolean v3, p0, Ll/ۨ᩷ܳ;->۟ۙ:Z

    .line 979
    iput-boolean v6, p0, Ll/ۨ᩷ܳ;->ܿۙ:Z

    .line 1407
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۤۙ:Ll/ܶ᩷ܳ;

    if-eqz v0, :cond_b

    .line 1408
    invoke-interface {v0, v6}, Ll/ܶ᩷ܳ;->ۙ(Z)V

    .line 981
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 983
    :cond_c
    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->ܿۙ:Z

    if-eqz v0, :cond_21

    .line 984
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget v0, p0, Ll/ۨ᩷ܳ;->ۧۙ:F

    add-float/2addr p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {v5}, Ll/ܳۤܳ;->ۧ()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, v2, Ll/ۙ᩷ܳ;->ۚ:F

    sub-float/2addr v0, v1

    div-float/2addr p1, v0

    float-to-double v0, p1

    const-wide/16 v2, 0x0

    cmpg-double p1, v0, v2

    if-gez p1, :cond_d

    :goto_2
    move-wide v0, v2

    goto :goto_3

    :cond_d
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double p1, v0, v2

    if-lez p1, :cond_e

    goto :goto_2

    .line 989
    :cond_e
    :goto_3
    invoke-virtual {v5}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide v2

    long-to-double v2, v2

    mul-double v2, v2, v0

    double-to-long v0, v2

    .line 990
    invoke-virtual {p0, v0, v1}, Ll/ۨ᩷ܳ;->ۙ(J)V

    return v6

    .line 996
    :cond_f
    iget-boolean v1, p0, Ll/ۨ᩷ܳ;->۟ۙ:Z

    if-eqz v1, :cond_10

    .line 997
    invoke-direct {p0, v3}, Ll/ۨ᩷ܳ;->ۤ(Z)V

    .line 998
    iput-boolean v3, p0, Ll/ۨ᩷ܳ;->֡ۙ:Z

    iput-boolean v3, p0, Ll/ۨ᩷ܳ;->۟ۙ:Z

    return v6

    .line 1001
    :cond_10
    iget-boolean v1, p0, Ll/ۨ᩷ܳ;->ᩳۙ:Z

    if-eqz v1, :cond_13

    if-eq v0, v7, :cond_11

    .line 1002
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 1003
    :cond_11
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->ܰ()V

    .line 1004
    iput-boolean v3, p0, Ll/ۨ᩷ܳ;->ᩳۙ:Z

    if-eq v0, v7, :cond_14

    .line 1230
    invoke-virtual {v4}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_14

    .line 1006
    iget p1, p0, Ll/ۨ᩷ܳ;->ۚۙ:I

    iget v0, p0, Ll/ۨ᩷ܳ;->ܿ:I

    if-le p1, v0, :cond_12

    const/4 v3, 0x1

    :cond_12
    invoke-direct {p0, p1, v3}, Ll/ۨ᩷ܳ;->ۙ(IZ)V

    return v6

    .line 1009
    :cond_13
    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->ܿۙ:Z

    if-eqz v0, :cond_21

    .line 1010
    invoke-direct {p0, v3}, Ll/ۨ᩷ܳ;->ۤ(Z)V

    .line 1011
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->᩶()V

    .line 1012
    iput-boolean v3, p0, Ll/ۨ᩷ܳ;->ܿۙ:Z

    .line 1013
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 1407
    iget-object p1, p0, Ll/ۨ᩷ܳ;->ۤۙ:Ll/ܶ᩷ܳ;

    if-eqz p1, :cond_14

    .line 1408
    invoke-interface {p1, v3}, Ll/ܶ᩷ܳ;->ۙ(Z)V

    :cond_14
    :goto_4
    return v6

    .line 897
    :cond_15
    iput-boolean v3, p0, Ll/ۨ᩷ܳ;->֡ۙ:Z

    iput-boolean v3, p0, Ll/ۨ᩷ܳ;->۟ۙ:Z

    .line 898
    iget-object v0, p0, Ll/ۨ᩷ܳ;->۠:Ll/ᩴᩳᩴ;

    invoke-virtual {v0}, Ll/ᩴᩳᩴ;->ۙ()V

    .line 899
    iget-object v0, p0, Ll/ۨ᩷ܳ;->᩸ۙ:Ll/۠ۤܳ;

    invoke-virtual {v0}, Ll/۠ۤܳ;->᩸()Z

    move-result v7

    if-nez v7, :cond_16

    .line 900
    invoke-virtual {v0}, Ll/۠ۤܳ;->ۙ()V

    .line 901
    :cond_16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 902
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    .line 904
    invoke-virtual {v5}, Ll/ܳۤܳ;->ۛ()Z

    move-result v8

    if-eqz v8, :cond_20

    iget-object v8, p0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz v8, :cond_17

    iget v8, p0, Ll/ۨ᩷ܳ;->ܶۙ:I

    if-ltz v8, :cond_20

    .line 905
    :cond_17
    invoke-virtual {v4}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v8

    const/high16 v9, 0x40000000    # 2.0f

    if-eqz v8, :cond_1d

    .line 906
    invoke-virtual {v5}, Ll/ܳۤܳ;->ۚ()Landroid/graphics/RectF;

    move-result-object v8

    .line 175
    iget v10, p0, Ll/ۨ᩷ܳ;->ܶۙ:I

    if-ltz v10, :cond_19

    if-ne v10, v6, :cond_18

    const/4 v10, 0x1

    goto :goto_5

    :cond_18
    const/4 v10, 0x0

    goto :goto_5

    :cond_19
    invoke-virtual {v8, v0, v7}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v10

    :goto_5
    const/high16 v11, 0x40800000    # 4.0f

    if-eqz v10, :cond_1a

    .line 908
    iget p1, v8, Landroid/graphics/RectF;->left:F

    iget v1, v8, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, p1

    const/high16 v3, 0x40400000    # 3.0f

    mul-float v1, v1, v3

    div-float/2addr v1, v11

    add-float/2addr v1, p1

    sub-float/2addr v1, v0

    iput v1, p0, Ll/ۨ᩷ܳ;->֫ۙ:F

    .line 909
    iget p1, v8, Landroid/graphics/RectF;->top:F

    sub-float/2addr p1, v7

    iget v0, v2, Ll/ۙ᩷ܳ;->᩻:I

    int-to-float v0, v0

    div-float/2addr v0, v9

    sub-float/2addr p1, v0

    iput p1, p0, Ll/ۨ᩷ܳ;->ۧۙ:F

    .line 910
    iput-boolean v6, p0, Ll/ۨ᩷ܳ;->ᩳۙ:Z

    .line 911
    invoke-virtual {v4}, Ll/ۚ᩷ܳ;->۫()I

    move-result p1

    iput p1, p0, Ll/ۨ᩷ܳ;->ܿ:I

    .line 912
    invoke-virtual {v4}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    iput p1, p0, Ll/ۨ᩷ܳ;->ۚۙ:I

    return v6

    .line 915
    :cond_1a
    invoke-virtual {v5}, Ll/ܳۤܳ;->֫()Landroid/graphics/RectF;

    move-result-object v8

    .line 175
    iget v10, p0, Ll/ۨ᩷ܳ;->ܶۙ:I

    if-ltz v10, :cond_1b

    if-ne v10, v1, :cond_1c

    const/4 v3, 0x1

    goto :goto_6

    :cond_1b
    invoke-virtual {v8, v0, v7}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v3

    :cond_1c
    :goto_6
    if-eqz v3, :cond_20

    .line 917
    iget p1, v8, Landroid/graphics/RectF;->left:F

    iget v1, v8, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, p1

    div-float/2addr v1, v11

    add-float/2addr v1, p1

    sub-float/2addr v1, v0

    iput v1, p0, Ll/ۨ᩷ܳ;->֫ۙ:F

    .line 918
    iget p1, v8, Landroid/graphics/RectF;->top:F

    sub-float/2addr p1, v7

    iget v0, v2, Ll/ۙ᩷ܳ;->᩻:I

    int-to-float v0, v0

    div-float/2addr v0, v9

    sub-float/2addr p1, v0

    iput p1, p0, Ll/ۨ᩷ܳ;->ۧۙ:F

    .line 919
    iput-boolean v6, p0, Ll/ۨ᩷ܳ;->ᩳۙ:Z

    .line 920
    invoke-virtual {v4}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    iput p1, p0, Ll/ۨ᩷ܳ;->ܿ:I

    .line 921
    invoke-virtual {v4}, Ll/ۚ᩷ܳ;->۫()I

    move-result p1

    iput p1, p0, Ll/ۨ᩷ܳ;->ۚۙ:I

    return v6

    .line 925
    :cond_1d
    invoke-virtual {v5}, Ll/ܳۤܳ;->۫()Landroid/graphics/RectF;

    move-result-object v1

    .line 175
    iget v4, p0, Ll/ۨ᩷ܳ;->ܶۙ:I

    if-ltz v4, :cond_1e

    if-nez v4, :cond_1f

    const/4 v3, 0x1

    goto :goto_7

    :cond_1e
    invoke-virtual {v1, v0, v7}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v3

    :cond_1f
    :goto_7
    if-eqz v3, :cond_20

    .line 927
    iget p1, v1, Landroid/graphics/RectF;->left:F

    iget v3, v1, Landroid/graphics/RectF;->right:F

    add-float/2addr p1, v3

    div-float/2addr p1, v9

    sub-float/2addr p1, v0

    iput p1, p0, Ll/ۨ᩷ܳ;->֫ۙ:F

    .line 928
    iget p1, v1, Landroid/graphics/RectF;->top:F

    sub-float/2addr p1, v7

    iget v0, v2, Ll/ۙ᩷ܳ;->᩻:I

    int-to-float v0, v0

    div-float/2addr v0, v9

    sub-float/2addr p1, v0

    iput p1, p0, Ll/ۨ᩷ܳ;->ۧۙ:F

    .line 929
    iput-boolean v6, p0, Ll/ۨ᩷ܳ;->ᩳۙ:Z

    return v6

    .line 934
    :cond_20
    invoke-virtual {v5}, Ll/ܳۤܳ;->᩹()Z

    move-result v1

    if-eqz v1, :cond_21

    .line 935
    invoke-virtual {v5}, Ll/ܳۤܳ;->᩸()Ll/᩸᩷ܺ;

    move-result-object v1

    .line 936
    invoke-virtual {v1, v0, v7}, Ll/᩸᩷ܺ;->ۙ(FF)Z

    move-result v2

    if-eqz v2, :cond_21

    .line 938
    iput-boolean v6, p0, Ll/ۨ᩷ܳ;->۟ۙ:Z

    .line 939
    iput v0, p0, Ll/ۨ᩷ܳ;->ܰۙ:F

    .line 940
    iput v7, p0, Ll/ۨ᩷ܳ;->᩶ۙ:F

    .line 941
    iget p1, v1, Ll/᩸᩷ܺ;->ᩴ:F

    sub-float/2addr p1, v7

    invoke-virtual {v5}, Ll/ܳۤܳ;->ۧ()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    iput p1, p0, Ll/ۨ᩷ܳ;->ۧۙ:F

    .line 942
    invoke-direct {p0, v6}, Ll/ۨ᩷ܳ;->ۤ(Z)V

    return v6

    .line 1022
    :cond_21
    :goto_8
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۜ:Ll/᩺ۡ;

    invoke-virtual {v0, p1}, Ll/᩺ۡ;->ۙ(Landroid/view/MotionEvent;)Z

    return v6
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 870
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    .line 872
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->ܰ()V

    return-void

    .line 874
    :cond_0
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ܳ()V

    .line 875
    iget-object p1, p0, Ll/ۨ᩷ܳ;->۬:Ll/᩹᩷ܳ;

    invoke-virtual {p1}, Ll/᩹᩷ܳ;->ۙ()V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 77
    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->֡:Z

    return v0
.end method

.method public final ۗ()V
    .locals 1

    .line 1460
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1462
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->᩹()V

    .line 1463
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 1464
    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    return-void
.end method

.method public final declared-synchronized ۙ(Ljava/lang/Runnable;Ljava/lang/Runnable;)Ll/ܺ᩷ܳ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 338
    :try_start_0
    iget-boolean v1, p0, Ll/ۨ᩷ܳ;->ۗۙ:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۨ᩷ܳ;->ܰ:Ll/ܺ᩷ܳ;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 341
    :cond_0
    new-instance v1, Ll/ܺ᩷ܳ;

    invoke-direct {v1, p0, p1, p2}, Ll/ܺ᩷ܳ;-><init>(Ll/ۨ᩷ܳ;Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    iput-object v1, p0, Ll/ۨ᩷ܳ;->ܰ:Ll/ܺ᩷ܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 342
    monitor-exit v0

    return-object v1

    .line 339
    :cond_1
    :goto_0
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(Ll/ᩳܳܳ;)Ll/ᩳܳܳ;
    .locals 5

    .line 451
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ܳ()V

    const/4 v0, 0x2

    .line 453
    iget-object v1, p0, Ll/ۨ᩷ܳ;->۬:Ll/᩹᩷ܳ;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x3

    .line 454
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 455
    iget-object v0, p0, Ll/ۨ᩷ܳ;->۠:Ll/ᩴᩳᩴ;

    invoke-virtual {v0}, Ll/ᩴᩳᩴ;->ۙ()V

    .line 456
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ᩴ()V

    .line 457
    iget-object v0, p0, Ll/ۨ᩷ܳ;->᩸ۙ:Ll/۠ۤܳ;

    invoke-virtual {v0}, Ll/۠ۤܳ;->᩸()Z

    move-result v2

    if-nez v2, :cond_0

    .line 458
    invoke-virtual {v0}, Ll/۠ۤܳ;->ۙ()V

    .line 460
    :cond_0
    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->ܿۙ:Z

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 461
    iget-boolean v3, p0, Ll/ۨ᩷ܳ;->۟ۙ:Z

    if-eqz v3, :cond_2

    :cond_1
    invoke-direct {p0, v2}, Ll/ۨ᩷ܳ;->ۤ(Z)V

    .line 462
    :cond_2
    iput-boolean v2, p0, Ll/ۨ᩷ܳ;->ܿۙ:Z

    .line 463
    iput-boolean v2, p0, Ll/ۨ᩷ܳ;->֡ۙ:Z

    iput-boolean v2, p0, Ll/ۨ᩷ܳ;->۟ۙ:Z

    .line 464
    iput-boolean v2, p0, Ll/ۨ᩷ܳ;->ᩳۙ:Z

    const-wide/16 v3, 0x0

    .line 465
    iput-wide v3, p0, Ll/ۨ᩷ܳ;->ܳۙ:J

    .line 466
    iput-boolean v2, v1, Ll/᩹᩷ܳ;->ۤ:Z

    .line 467
    iget-object v1, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1, p1}, Ll/ۚ᩷ܳ;->ۙ(Ll/ᩳܳܳ;)Ll/ᩳܳܳ;

    move-result-object p1

    .line 468
    iput-wide v3, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    .line 469
    iput-boolean v2, p0, Ll/ۨ᩷ܳ;->᩹ۙ:Z

    if-eqz v0, :cond_3

    .line 1407
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۤۙ:Ll/ܶ᩷ܳ;

    if-eqz v0, :cond_3

    .line 1408
    invoke-interface {v0, v2}, Ll/ܶ᩷ܳ;->ۙ(Z)V

    .line 474
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-object p1
.end method

.method public final ۙ(Ll/ܶܳܳ;)Ll/᩵᩷ܳ;
    .locals 18

    move-object/from16 v0, p0

    if-eqz p1, :cond_0

    .line 1480
    new-instance v9, Ll/᩵᩷ܳ;

    iget-wide v5, v0, Ll/ۨ᩷ܳ;->ۛۙ:J

    invoke-virtual/range {p1 .. p1}, Ll/ܶܳܳ;->ܳ()I

    move-result v2

    .line 1481
    invoke-virtual/range {p1 .. p1}, Ll/ܶܳܳ;->ۤ()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Ll/ܶܳܳ;->᩷()Z

    move-result v7

    .line 1482
    invoke-virtual/range {p1 .. p1}, Ll/ܶܳܳ;->ۙ()Z

    move-result v8

    const/4 v4, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Ll/᩵᩷ܳ;-><init>(IIIJZZ)V

    return-object v9

    .line 1484
    :cond_0
    new-instance v1, Ll/᩵᩷ܳ;

    iget-wide v14, v0, Ll/ۨ᩷ܳ;->ۛۙ:J

    iget-object v2, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v11

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->۫()I

    move-result v12

    .line 1485
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->᩻()Z

    move-result v16

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v17

    const/4 v13, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v17}, Ll/᩵᩷ܳ;-><init>(IIIJZZ)V

    return-object v1
.end method

.method public final ۙ()V
    .locals 4

    .line 1402
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۤۙ:Ll/ܶ᩷ܳ;

    if-eqz v0, :cond_0

    .line 1444
    iget-object v1, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->᩷()Z

    move-result v2

    .line 1448
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۙ()Z

    move-result v1

    .line 1403
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ۧ()Z

    move-result v3

    invoke-interface {v0, v2, v1, v3}, Ll/ܶ᩷ܳ;->ۙ(ZZZ)V

    :cond_0
    return-void
.end method

.method public final ۙ(II)V
    .locals 9

    .line 490
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0, p1, p2}, Ll/ۚ᩷ܳ;->᩷(II)V

    .line 491
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 492
    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->۫()I

    move-result p2

    .line 622
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 625
    :cond_0
    invoke-virtual {v0}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide v1

    .line 513
    iget-wide v3, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    .line 629
    invoke-virtual {v0, p1}, Ll/ܳۤܳ;->᩸(I)I

    move-result p1

    .line 631
    invoke-virtual {v0, p1}, Ll/ܳۤܳ;->ۤ(I)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-lez v7, :cond_1

    goto :goto_0

    .line 637
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܳۤܳ;->᩷(I)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-gez v7, :cond_2

    goto :goto_0

    :cond_2
    move-wide v5, v3

    :goto_0
    cmp-long v7, v5, v1

    if-lez v7, :cond_3

    move-wide v5, v1

    .line 642
    :cond_3
    invoke-virtual {v0, p2}, Ll/ܳۤܳ;->᩸(I)I

    move-result p2

    if-eq p1, p2, :cond_b

    .line 645
    invoke-virtual {v0, p2}, Ll/ܳۤܳ;->ۤ(I)J

    move-result-wide v7

    cmp-long p1, v3, v7

    if-lez p1, :cond_4

    goto :goto_1

    .line 651
    :cond_4
    invoke-virtual {v0, p2}, Ll/ܳۤܳ;->᩷(I)J

    move-result-wide v7

    cmp-long p1, v3, v7

    if-gez p1, :cond_5

    goto :goto_1

    :cond_5
    move-wide v7, v3

    :goto_1
    cmp-long p1, v7, v1

    if-lez p1, :cond_6

    goto :goto_2

    :cond_6
    move-wide v1, v7

    :goto_2
    cmp-long p1, v3, v5

    if-nez p1, :cond_7

    cmp-long p2, v3, v1

    if-eqz p2, :cond_7

    move-wide v5, v1

    goto :goto_3

    :cond_7
    if-eqz p1, :cond_8

    cmp-long p2, v3, v1

    if-nez p2, :cond_8

    goto :goto_3

    :cond_8
    if-eqz p1, :cond_a

    if-lez p1, :cond_9

    cmp-long p2, v3, v1

    if-lez p2, :cond_9

    .line 662
    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    goto :goto_3

    :cond_9
    if-gez p1, :cond_a

    cmp-long p1, v3, v1

    if-gez p1, :cond_a

    .line 664
    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    goto :goto_3

    :cond_a
    move-wide v5, v3

    :cond_b
    :goto_3
    cmp-long p1, v3, v5

    if-eqz p1, :cond_d

    .line 671
    iget-object p1, p0, Ll/ۨ᩷ܳ;->᩸ۙ:Ll/۠ۤܳ;

    invoke-virtual {p1}, Ll/۠ۤܳ;->᩸()Z

    move-result p2

    if-nez p2, :cond_c

    .line 672
    invoke-virtual {p1}, Ll/۠ۤܳ;->ۙ()V

    :cond_c
    sub-long/2addr v5, v3

    .line 673
    invoke-virtual {p1, v3, v4, v5, v6}, Ll/۠ۤܳ;->ۙ(JJ)V

    .line 674
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_d
    :goto_4
    return-void
.end method

.method public final ۙ(IIZ)V
    .locals 2

    .line 1391
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨ᩷ܳ;->ᩴۙ:J

    .line 1392
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۤۙ:Ll/ܶ᩷ܳ;

    if-eqz v0, :cond_0

    .line 1393
    iget-object v1, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v1

    invoke-interface {v0, p1, p2, v1, p3}, Ll/ܶ᩷ܳ;->ۙ(IIIZ)V

    :cond_0
    return-void
.end method

.method public final ۙ(J)V
    .locals 1

    .line 517
    iput-wide p1, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    .line 518
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 519
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۘۙ:Ll/᩺ۙܳ;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/᩺ۙܳ;->ۙ:Ll/ܿۙܳ;

    invoke-static {v0, p0, p1, p2}, Ll/ܿۙܳ;->ۙ(Ll/ܿۙܳ;Ll/ۨ᩷ܳ;J)V

    :cond_0
    return-void
.end method

.method public final ۙ(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 9

    .line 100
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    .line 101
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    if-eqz p3, :cond_13

    .line 102
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    .line 105
    :cond_1
    iget-object p1, p0, Ll/ۨ᩷ܳ;->ܽۙ:[Ll/۫ۤܳ;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p1, :cond_3

    if-nez p2, :cond_2

    if-eqz p3, :cond_3

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 106
    new-instance p1, Ll/۫ۤܳ;

    invoke-direct {p1, p0, v1}, Ll/۫ۤܳ;-><init>(Ll/ۨ᩷ܳ;I)V

    new-instance v3, Ll/۫ۤܳ;

    invoke-direct {v3, p0, v2}, Ll/۫ۤܳ;-><init>(Ll/ۨ᩷ܳ;I)V

    new-instance v4, Ll/۫ۤܳ;

    invoke-direct {v4, p0, v0}, Ll/۫ۤܳ;-><init>(Ll/ۨ᩷ܳ;I)V

    const/4 v5, 0x3

    new-array v5, v5, [Ll/۫ۤܳ;

    aput-object p1, v5, v1

    aput-object v3, v5, v2

    aput-object v4, v5, v0

    iput-object v5, p0, Ll/ۨ᩷ܳ;->ܽۙ:[Ll/۫ۤܳ;

    .line 109
    :cond_3
    iget-object p1, p0, Ll/ۨ᩷ܳ;->ܽۙ:[Ll/۫ۤܳ;

    if-eqz p1, :cond_13

    .line 110
    iget-object p1, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p1}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result p1

    .line 111
    iget-object v3, p0, Ll/ۨ᩷ܳ;->ܽۙ:[Ll/۫ۤܳ;

    aget-object v4, v3, v2

    .line 112
    aget-object v3, v3, v0

    if-eqz p1, :cond_9

    .line 114
    iget-boolean v5, p0, Ll/ۨ᩷ܳ;->ᩳۙ:Z

    if-eqz v5, :cond_9

    .line 115
    invoke-virtual {v4}, Ll/۫ۤܳ;->ᩴ()Z

    move-result v5

    if-eqz v5, :cond_4

    move-object v5, v4

    goto :goto_0

    :cond_4
    invoke-virtual {v3}, Ll/۫ۤܳ;->ᩴ()Z

    move-result v5

    if-eqz v5, :cond_5

    move-object v5, v3

    goto :goto_0

    :cond_5
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_9

    .line 118
    iget v6, p0, Ll/ۨ᩷ܳ;->ۚۙ:I

    iget v7, p0, Ll/ۨ᩷ܳ;->ܿ:I

    if-ne v6, v7, :cond_6

    invoke-virtual {v5}, Ll/۫ۤܳ;->᩸()I

    move-result v6

    goto :goto_1

    :cond_6
    if-ge v6, v7, :cond_7

    const/4 v6, 0x1

    goto :goto_1

    :cond_7
    const/4 v6, 0x2

    :goto_1
    if-ne v5, v4, :cond_8

    if-ne v6, v0, :cond_9

    goto :goto_2

    :cond_8
    if-ne v6, v2, :cond_9

    :goto_2
    const/4 v2, 0x1

    goto :goto_3

    :cond_9
    const/4 v2, 0x0

    .line 123
    :goto_3
    iget-object v5, p0, Ll/ۨ᩷ܳ;->ܽۙ:[Ll/۫ۤܳ;

    aget-object v5, v5, v1

    iget-object v6, p0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {v6}, Ll/ܳۤܳ;->۫()Landroid/graphics/RectF;

    move-result-object v7

    if-nez p1, :cond_a

    if-eqz p2, :cond_a

    const/4 v8, 0x1

    goto :goto_4

    :cond_a
    const/4 v8, 0x0

    :goto_4
    invoke-virtual {v5, v7, v8, v1}, Ll/۫ۤܳ;->ۙ(Landroid/graphics/RectF;ZI)V

    if-eqz v2, :cond_b

    .line 125
    invoke-virtual {v6}, Ll/ܳۤܳ;->֫()Landroid/graphics/RectF;

    move-result-object v5

    goto :goto_5

    :cond_b
    invoke-virtual {v6}, Ll/ܳۤܳ;->ۚ()Landroid/graphics/RectF;

    move-result-object v5

    :goto_5
    if-eqz p1, :cond_d

    if-eqz v2, :cond_c

    if-eqz p3, :cond_d

    goto :goto_6

    :cond_c
    if-eqz p2, :cond_d

    :goto_6
    const/4 v7, 0x1

    goto :goto_7

    :cond_d
    const/4 v7, 0x0

    :goto_7
    if-eqz v2, :cond_e

    const/4 v8, 0x2

    goto :goto_8

    :cond_e
    const/4 v8, 0x1

    :goto_8
    invoke-virtual {v4, v5, v7, v8}, Ll/۫ۤܳ;->ۙ(Landroid/graphics/RectF;ZI)V

    if-eqz v2, :cond_f

    .line 127
    invoke-virtual {v6}, Ll/ܳۤܳ;->ۚ()Landroid/graphics/RectF;

    move-result-object v4

    goto :goto_9

    :cond_f
    invoke-virtual {v6}, Ll/ܳۤܳ;->֫()Landroid/graphics/RectF;

    move-result-object v4

    :goto_9
    if-eqz p1, :cond_11

    if-eqz v2, :cond_10

    if-eqz p2, :cond_11

    goto :goto_a

    :cond_10
    if-eqz p3, :cond_11

    :goto_a
    const/4 v1, 0x1

    :cond_11
    if-eqz v2, :cond_12

    const/4 v0, 0x1

    :cond_12
    invoke-virtual {v3, v4, v1, v0}, Ll/۫ۤܳ;->ۙ(Landroid/graphics/RectF;ZI)V

    :cond_13
    return-void
.end method

.method public final ۙ(Ljava/io/IOException;)V
    .locals 1

    .line 1413
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۤۙ:Ll/ܶ᩷ܳ;

    if-eqz v0, :cond_0

    .line 1414
    invoke-interface {v0, p1}, Ll/ܶ᩷ܳ;->ۙ(Ljava/io/IOException;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ۗۙܳ;)V
    .locals 0

    .line 92
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->᩵()V

    .line 93
    iput-object p1, p0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    .line 94
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 95
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۙ(Ll/ܶ᩷ܳ;)V
    .locals 0

    .line 1387
    iput-object p1, p0, Ll/ۨ᩷ܳ;->ۤۙ:Ll/ܶ᩷ܳ;

    return-void
.end method

.method public final ۙ(Ll/᩵᩷ܳ;)V
    .locals 12

    const-string v0, "state"

    .line 1490
    invoke-static {p1, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-boolean v0, p1, Ll/᩵᩷ܳ;->ۤ:Z

    iget-boolean v1, p1, Ll/᩵᩷ܳ;->ۙ:Z

    .line 1491
    iget-object v2, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v3

    .line 1524
    iget v4, p1, Ll/᩵᩷ܳ;->᩸:I

    iget v5, p1, Ll/᩵᩷ܳ;->ᩴ:I

    if-ltz v3, :cond_5

    iget-wide v6, p1, Ll/᩵᩷ܳ;->᩷:J

    const-wide/16 v8, 0x0

    cmp-long p1, v6, v8

    if-ltz p1, :cond_5

    if-eqz v1, :cond_1

    if-eqz v3, :cond_0

    if-ltz v5, :cond_0

    if-lt v4, v5, :cond_0

    int-to-long v8, v4

    int-to-long v10, v3

    cmp-long p1, v8, v10

    if-gez p1, :cond_0

    goto :goto_0

    .line 1530
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid range selection"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-ltz v5, :cond_4

    if-ne v5, v4, :cond_4

    int-to-long v8, v5

    int-to-long v10, v3

    cmp-long p1, v8, v10

    if-gtz p1, :cond_4

    if-ne v5, v3, :cond_2

    if-eqz v0, :cond_4

    .line 1492
    :cond_2
    :goto_0
    iget-object p1, p0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {p1}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    iput-wide v6, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    if-eqz v1, :cond_3

    .line 180
    invoke-virtual {v2, v5, v4}, Ll/ۚ᩷ܳ;->᩷(II)V

    goto :goto_1

    .line 182
    :cond_3
    invoke-virtual {v2, v5, v0}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 1495
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 1535
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid cursor selection"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1525
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Negative UI state value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ll/᩺ۙܳ;)V
    .locals 0

    .line 181
    iput-object p1, p0, Ll/ۨ᩷ܳ;->ۘۙ:Ll/᩺ۙܳ;

    return-void
.end method

.method public final ۙ(Z)V
    .locals 1

    .line 71
    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->֡:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 72
    :cond_0
    iput-boolean p1, p0, Ll/ۨ᩷ܳ;->֡:Z

    .line 73
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 74
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۙ(I)Z
    .locals 8

    .line 592
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    if-nez v0, :cond_0

    goto :goto_2

    .line 595
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۤܳ;->᩸(I)I

    move-result p1

    .line 596
    invoke-virtual {v0, p1}, Ll/ܳۤܳ;->ۤ(I)J

    move-result-wide v1

    .line 598
    invoke-virtual {v0}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide v3

    .line 513
    iget-wide v5, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    cmp-long v7, v5, v1

    if-lez v7, :cond_1

    goto :goto_0

    .line 604
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܳۤܳ;->᩷(I)J

    move-result-wide v1

    cmp-long p1, v5, v1

    if-gez p1, :cond_2

    goto :goto_0

    :cond_2
    move-wide v1, v5

    :goto_0
    cmp-long p1, v1, v3

    if-lez p1, :cond_3

    goto :goto_1

    :cond_3
    move-wide v3, v1

    :goto_1
    cmp-long p1, v5, v3

    if-eqz p1, :cond_5

    .line 611
    iget-object p1, p0, Ll/ۨ᩷ܳ;->᩸ۙ:Ll/۠ۤܳ;

    invoke-virtual {p1}, Ll/۠ۤܳ;->᩸()Z

    move-result v0

    if-nez v0, :cond_4

    .line 612
    invoke-virtual {p1}, Ll/۠ۤܳ;->ۙ()V

    :cond_4
    sub-long/2addr v3, v5

    .line 613
    invoke-virtual {p1, v5, v6, v3, v4}, Ll/۠ۤܳ;->ۙ(JJ)V

    .line 614
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ۙ(Landroid/view/MotionEvent;I)Z
    .locals 0

    .line 169
    iput p2, p0, Ll/ۨ᩷ܳ;->ܶۙ:I

    const/4 p2, -0x1

    .line 170
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    iput p2, p0, Ll/ۨ᩷ܳ;->ܶۙ:I

    return p1

    :catchall_0
    move-exception p1

    iput p2, p0, Ll/ۨ᩷ܳ;->ܶۙ:I

    throw p1
.end method

.method public final ۙ(Ljava/lang/Runnable;)Z
    .locals 2

    move-object v0, p0

    .line 392
    monitor-enter v0

    .line 393
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩷ܳ;->ܰ:Ll/ܺ᩷ܳ;

    .line 394
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 398
    :cond_0
    invoke-virtual {v1, p1}, Ll/ܺ᩷ܳ;->ۙ(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    .line 394
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ([B)Z
    .locals 2

    .line 432
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->ۘ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 435
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0, p1}, Ll/ۚ᩷ܳ;->ۙ([B)V
    :try_end_0
    .catch Ll/ۨᩴܳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 443
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    .line 440
    invoke-virtual {p0, p1}, Ll/ۨ᩷ܳ;->ۙ(Ljava/io/IOException;)V

    return v1

    :catch_1
    const p1, 0x7f120311

    .line 437
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    :cond_1
    :goto_0
    return v1
.end method

.method public final ۚ()Z
    .locals 1

    .line 403
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Ll/ۗۙܳ;->ܶ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۛ()V
    .locals 1

    .line 1452
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1454
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->᩵()V

    .line 1455
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 1456
    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    return-void
.end method

.method public final ۤ(I)V
    .locals 2

    .line 496
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->ۘ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1230
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_1

    .line 496
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 499
    :cond_0
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ۚ᩷ܳ;->᩷(I)V
    :try_end_0
    .catch Ll/ۨᩴܳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 507
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->ܰ()V

    .line 508
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 509
    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    return-void

    :catch_0
    move-exception p1

    .line 504
    invoke-virtual {p0, p1}, Ll/ۨ᩷ܳ;->ۙ(Ljava/io/IOException;)V

    return-void

    :catch_1
    const p1, 0x7f120311

    .line 501
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۤ(J)V
    .locals 3

    .line 189
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->᩵()V

    .line 190
    iget-object v0, p0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {v0}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    .line 191
    iget-wide v0, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-void

    .line 192
    :cond_0
    iget-object v2, p0, Ll/ۨ᩷ܳ;->᩸ۙ:Ll/۠ۤܳ;

    sub-long/2addr p1, v0

    invoke-virtual {v2, v0, v1, p1, p2}, Ll/۠ۤܳ;->ۙ(JJ)V

    .line 193
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->᩶()V

    .line 194
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void
.end method

.method public final ۤ()Z
    .locals 5

    .line 156
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ۚ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 157
    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ۨ᩷ܳ;->ᩳۙ:Z

    if-nez v0, :cond_0

    .line 158
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۨ᩷ܳ;->۫ۙ:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xdac

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 1469
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳܳܳ;->᩹()Z

    move-result v0

    return v0
.end method

.method public final declared-synchronized ۨ()Ll/ۗ᩷ܳ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 352
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩷ܳ;->᩶:Ll/ۗ᩷ܳ;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 355
    :cond_0
    new-instance v1, Ll/ۗ᩷ܳ;

    invoke-direct {v1, p0}, Ll/ۗ᩷ܳ;-><init>(Ll/ۨ᩷ܳ;)V

    iput-object v1, p0, Ll/ۨ᩷ܳ;->᩶:Ll/ۗ᩷ܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 356
    monitor-exit v0

    return-object v1

    .line 353
    :cond_1
    :goto_0
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۫()J
    .locals 2

    .line 513
    iget-wide v0, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    return-wide v0
.end method

.method public final ܳ()V
    .locals 4

    .line 163
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ܽۙ:[Ll/۫ۤܳ;

    if-eqz v0, :cond_0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ll/۫ۤܳ;->ۤ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 149
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ܳ;->᩻ۙ:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_2

    .line 150
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۨ᩷ܳ;->᩻ۙ:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Ll/ۨ᩷ܳ;->ܺۙ:Ll/֫᩷ܳ;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_1
    const/4 v0, 0x0

    .line 151
    iput-object v0, p0, Ll/ۨ᩷ܳ;->᩻ۙ:Landroid/view/ViewTreeObserver;

    :cond_2
    return-void
.end method

.method public final ܶ()V
    .locals 1

    .line 1239
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ܺ()V

    const/4 v0, 0x0

    .line 1240
    iput-boolean v0, p0, Ll/ۨ᩷ܳ;->᩹ۙ:Z

    .line 1241
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final declared-synchronized ܺ()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 361
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩷ܳ;->᩶:Ll/ۗ᩷ܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܽ()Z
    .locals 1

    .line 185
    iget-object v0, p0, Ll/ۨ᩷ܳ;->᩸ۙ:Ll/۠ۤܳ;

    invoke-virtual {v0}, Ll/۠ۤܳ;->᩸()Z

    move-result v0

    return v0
.end method

.method public final ᩴ()V
    .locals 2

    move-object v0, p0

    .line 367
    monitor-enter v0

    .line 368
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩷ܳ;->᩶:Ll/ۗ᩷ܳ;

    .line 369
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 371
    invoke-virtual {v1}, Ll/ۗ᩷ܳ;->ۙ()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 369
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩵()V
    .locals 1

    .line 183
    iget-object v0, p0, Ll/ۨ᩷ܳ;->᩸ۙ:Ll/۠ۤܳ;

    invoke-virtual {v0}, Ll/۠ۤܳ;->ۙ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    .line 1397
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۤۙ:Ll/ܶ᩷ܳ;

    if-eqz v0, :cond_0

    .line 1398
    invoke-interface {v0}, Ll/ܶ᩷ܳ;->ܳ()V

    :cond_0
    return-void
.end method

.method public final ᩷(I)V
    .locals 2

    .line 582
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    const/4 v0, 0x1

    .line 156
    iget-object v1, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1, p1, v0}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 584
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->ܰ()V

    .line 585
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    return-void
.end method

.method public final ᩷(J)V
    .locals 2

    .line 198
    iget-object v0, p0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {v0}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    .line 207
    iput-wide p1, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    .line 208
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->᩶()V

    .line 209
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final declared-synchronized ᩷(Z)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 328
    :try_start_0
    iput-boolean p1, p0, Ll/ۨ᩷ܳ;->ۗۙ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 329
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

.method public final ᩸(I)V
    .locals 1

    if-ltz p1, :cond_1

    const/16 v0, 0x10

    if-gt p1, v0, :cond_1

    .line 63
    iget v0, p0, Ll/ۨ᩷ܳ;->۟:I

    if-ne v0, p1, :cond_0

    return-void

    .line 64
    :cond_0
    iput p1, p0, Ll/ۨ᩷ܳ;->۟:I

    .line 65
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 66
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid byte column count"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩸(J)V
    .locals 0

    .line 207
    iput-wide p1, p0, Ll/ۨ᩷ܳ;->ۛۙ:J

    .line 208
    invoke-direct {p0}, Ll/ۨ᩷ܳ;->᩶()V

    .line 209
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ᩸()Z
    .locals 2

    move-object v0, p0

    .line 378
    monitor-enter v0

    .line 379
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩷ܳ;->ܰ:Ll/ܺ᩷ܳ;

    .line 380
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 382
    invoke-virtual {v1}, Ll/ܺ᩷ܳ;->᩷()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    .line 380
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩹()V
    .locals 2

    .line 407
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 408
    iget-object v0, p0, Ll/ۨ᩷ܳ;->۬:Ll/᩹᩷ܳ;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 409
    iget-object v0, p0, Ll/ۨ᩷ܳ;->۠:Ll/ᩴᩳᩴ;

    invoke-virtual {v0}, Ll/ᩴᩳᩴ;->ۙ()V

    .line 410
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ܳ()V

    :cond_0
    return-void
.end method

.method public final ᩺()V
    .locals 5

    .line 134
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ܽۙ:[Ll/۫ۤܳ;

    if-nez v0, :cond_0

    goto :goto_1

    .line 136
    :cond_0
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    .line 137
    invoke-virtual {v4}, Ll/۫ۤܳ;->۫()V

    .line 138
    invoke-virtual {v4}, Ll/۫ۤܳ;->ܳ()Z

    move-result v4

    or-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 140
    :cond_1
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ܺۙ:Ll/֫᩷ܳ;

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 141
    iget-object v1, p0, Ll/ۨ᩷ܳ;->᩻ۙ:Landroid/view/ViewTreeObserver;

    if-nez v1, :cond_4

    .line 142
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iput-object v1, p0, Ll/ۨ᩷ܳ;->᩻ۙ:Landroid/view/ViewTreeObserver;

    .line 143
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void

    .line 149
    :cond_2
    iget-object v1, p0, Ll/ۨ᩷ܳ;->᩻ۙ:Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_4

    .line 150
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/ۨ᩷ܳ;->᩻ۙ:Landroid/view/ViewTreeObserver;

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_3
    const/4 v0, 0x0

    .line 151
    iput-object v0, p0, Ll/ۨ᩷ܳ;->᩻ۙ:Landroid/view/ViewTreeObserver;

    :cond_4
    :goto_1
    return-void
.end method

.method public final declared-synchronized ᩻()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 347
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩷ܳ;->ܰ:Ll/ܺ᩷ܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

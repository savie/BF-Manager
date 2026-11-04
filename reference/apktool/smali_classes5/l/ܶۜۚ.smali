.class public Ll/ܶۜۚ;
.super Ll/ܽ֡֫;
.source "X8B6"


# static fields
.field public static final ۖ᩷:[I

.field public static final synthetic ۡ᩷:I


# instance fields
.field public final ֡᩷:Ljava/util/ArrayList;

.field public ֨᩷:Ll/ۡ᩻֫;

.field public ֫᩷:Landroid/view/View;

.field public ۗ᩷:Z

.field public ۘ᩷:Ll/᩷᩻֫;

.field public ۚ᩷:Z

.field public ۛ᩷:Landroid/widget/TextView;

.field public ۟᩷:Ll/ܽۜۚ;

.field public ۢ᩷:Z

.field public ۧ᩷:Ll/᩹ۜۚ;

.field public ۨ᩷:Ll/۬ۚ֫;

.field public ۫᩷:I

.field public ܰ᩷:Landroid/view/View;

.field public ܳ᩷:I

.field public ܶ᩷:Landroid/view/MenuItem;

.field public ܺ᩷:Ll/᩶۠ۚ;

.field public ܽ᩷:F

.field public ܿ᩷:Ll/۬֨ᩴ;

.field public ᩳ᩷:Z

.field public ᩴ᩷:Landroid/animation/ValueAnimator;

.field public ᩵᩷:Ll/ۜۚ֫;

.field public ᩶᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ᩸᩷:I

.field public ᩹᩷:Z

.field public ᩺᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ᩻᩷:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, -0x1

    const v1, -0x777778

    const/high16 v2, -0x1000000

    .line 101
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ܶۜۚ;->ۖ᩷:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 87
    invoke-direct {p0}, Ll/ܽ֡֫;-><init>()V

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶۜۚ;->֡᩷:Ljava/util/ArrayList;

    .line 114
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ܶۜۚ;->᩺᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v0, 0xff

    .line 126
    iput v0, p0, Ll/ܶۜۚ;->᩸᩷:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶۜۚ;)Ll/᩷᩻֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    return-object p0
.end method

.method private ֫ۙ()Z
    .locals 2

    .line 205
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 206
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ۗ(Ll/ܶۜۚ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    invoke-direct {p0, v0}, Ll/ܶۜۚ;->᩷(Z)V

    return-void
.end method

.method private ۗۙ()V
    .locals 3

    .line 774
    iget-object v0, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    sget-object v1, Ll/ܶۜۚ;->ۖ᩷:[I

    iget v2, p0, Ll/ܶۜۚ;->۫᩷:I

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Ll/۬ۚ֫;->ۤ(I)V

    .line 775
    invoke-direct {p0}, Ll/ܶۜۚ;->ܶۙ()V

    .line 776
    invoke-direct {p0}, Ll/ܶۜۚ;->᩵ۙ()V

    return-void
.end method

.method public static ۙ(Landroid/app/Activity;Ll/᩷ۨᩴ;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 170
    invoke-static {p0, p1, p2, v0}, Ll/ܶۜۚ;->ۙ(Landroid/app/Activity;Ll/᩷ۨᩴ;Ljava/lang/String;Z)V

    return-void
.end method

.method public static ۙ(Landroid/app/Activity;Ll/᩷ۨᩴ;Ljava/lang/String;Z)V
    .locals 2

    .line 179
    invoke-static {p1, p3}, Ll/ܶۜۚ;->ۙ(Ll/᩷ۨᩴ;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/ܶۜۚ;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 181
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۘ᩷()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "gallery.editorPreview"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "gallery.vectorPreview"

    .line 182
    invoke-virtual {p1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object p1

    const-string p3, "gallery.previewTitle"

    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 180
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 179
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid editor preview snapshot"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۙ(Ll/ܶۜۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶۜۚ;->ۛۙ()V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܶۜۚ;F)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܶۜۚ;->ܽ᩷:F

    return-void
.end method

.method public static ۙ(Ll/ܶۜۚ;I)V
    .locals 2

    .line 861
    iget v0, p0, Ll/ܶۜۚ;->ܳ᩷:I

    if-ne p1, v0, :cond_2

    iget-boolean p1, p0, Ll/ܶۜۚ;->ۗ᩷:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 826
    :cond_0
    iget-boolean p1, p0, Ll/ܶۜۚ;->ۚ᩷:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 827
    iput-boolean p1, p0, Ll/ܶۜۚ;->ۚ᩷:Z

    .line 828
    iget p1, p0, Ll/ܶۜۚ;->᩸᩷:I

    const/4 v0, 0x0

    filled-new-array {p1, v0}, [I

    move-result-object p1

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Ll/ܶۜۚ;->ᩴ᩷:Landroid/animation/ValueAnimator;

    const-wide/16 v0, 0xb4

    .line 829
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 830
    iget-object p1, p0, Ll/ܶۜۚ;->ᩴ᩷:Landroid/animation/ValueAnimator;

    new-instance v0, Ll/ۙۜۚ;

    invoke-direct {v0, p0}, Ll/ۙۜۚ;-><init>(Ll/ܶۜۚ;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 834
    iget-object p0, p0, Ll/ܶۜۚ;->ᩴ᩷:Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic ۙ(Ll/ܶۜۚ;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 831
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Ll/ܶۜۚ;->᩸᩷:I

    .line 832
    invoke-direct {p0}, Ll/ܶۜۚ;->ܶۙ()V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܶۜۚ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 418
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Ll/ܶۜۚ;->ܳۙ()V

    :cond_0
    return-void
.end method

.method public static synthetic ۙ(Ll/ܶۜۚ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/ۨۜۚ;)V
    .locals 0

    .line 413
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 414
    :cond_0
    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iput-object p2, p1, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    .line 415
    invoke-direct {p0}, Ll/ܶۜۚ;->᩷ۙ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic ۙ(Ll/ܶۜۚ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/᩶۠ۚ;Ll/᩹ܺ֫;)V
    .locals 0

    .line 710
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/ܶۜۚ;->ܺ᩷:Ll/᩶۠ۚ;

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {p2, p3}, Ll/᩶۠ۚ;->ۙ(Ll/᩹ܺ֫;)V

    :cond_0
    return-void
.end method

.method public static synthetic ۙ(Ll/ܶۜۚ;Ll/ۘۜ;)V
    .locals 5

    const/16 v0, 0x87

    .line 308
    invoke-virtual {p1, v0}, Ll/ۘۜ;->᩷(I)Ll/۫ᩳ;

    move-result-object p1

    .line 310
    iget-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    iget v1, p1, Ll/۫ᩳ;->᩷:I

    iget v2, p1, Ll/۫ᩳ;->᩸:I

    iget v3, p1, Ll/۫ᩳ;->ۤ:I

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 311
    iget-object p0, p0, Ll/ܶۜۚ;->֫᩷:Landroid/view/View;

    iget v0, p1, Ll/۫ᩳ;->᩷:I

    iget p1, p1, Ll/۫ᩳ;->ۙ:I

    invoke-virtual {p0, v0, v4, v3, p1}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public static ۙ(Ll/ܶۜۚ;Ll/۬֨ᩴ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 686
    invoke-virtual {p1}, Ll/۬֨ᩴ;->ۙ()V

    .line 687
    iget-object p1, p0, Ll/ܶۜۚ;->᩶᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll/ܶۜۚ;->᩶᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Ll/ܶۜۚ;->ܿ᩷:Ll/۬֨ᩴ;

    .line 688
    :cond_0
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_1

    const p1, 0x7f1208d0

    .line 723
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    .line 689
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-direct {p0}, Ll/ܶۜۚ;->ۛۙ()V

    :cond_2
    return-void
.end method

.method public static ۙ(Ll/ܶۜۚ;Ll/۬֨ᩴ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/᩸᩻֫;Ljava/util/ArrayList;)V
    .locals 2

    .line 672
    invoke-virtual {p1}, Ll/۬֨ᩴ;->ۙ()V

    .line 673
    iget-object p1, p0, Ll/ܶۜۚ;->᩶᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll/ܶۜۚ;->᩶᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Ll/ܶۜۚ;->ܿ᩷:Ll/۬֨ᩴ;

    .line 675
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_3

    .line 676
    :cond_1
    new-instance p1, Ll/ܺ֡;

    invoke-direct {p1, p0}, Ll/ܺ֡;-><init>(Ll/ܽ֡֫;)V

    .line 677
    invoke-virtual {p1}, Ll/ܺ֡;->ۙ()V

    .line 650
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 p4, 0x0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ۧ֫;

    .line 651
    invoke-virtual {v1}, Ll/۫ۧ֫;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p4, 0x1

    goto :goto_0

    :cond_3
    if-eqz p4, :cond_4

    if-eqz v0, :cond_4

    const-string p2, "*/*"

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    const-string p2, "video/*"

    goto :goto_1

    :cond_5
    const-string p2, "image/*"

    .line 677
    :goto_1
    invoke-virtual {p1, p2}, Ll/ܺ֡;->᩷(Ljava/lang/String;)V

    .line 678
    invoke-virtual {p3}, Ll/᩸᩻֫;->ۙ()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/net/Uri;

    invoke-virtual {p1, p4}, Ll/ܺ֡;->ۙ(Landroid/net/Uri;)V

    goto :goto_2

    .line 679
    :cond_6
    invoke-virtual {p1}, Ll/ܺ֡;->᩷()V

    .line 680
    invoke-virtual {p3}, Ll/᩸᩻֫;->᩷()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 681
    :try_start_1
    invoke-virtual {p3}, Ll/᩸᩻֫;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 682
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-direct {p0}, Ll/ܶۜۚ;->ۛۙ()V

    return-void

    .line 681
    :cond_7
    :goto_3
    :try_start_2
    invoke-virtual {p3}, Ll/᩸᩻֫;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 682
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-direct {p0}, Ll/ܶۜۚ;->ۛۙ()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_5

    :catchall_1
    move-exception p1

    .line 674
    :try_start_3
    invoke-virtual {p3}, Ll/᩸᩻֫;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_0
    const p1, 0x7f1208d0

    .line 723
    :try_start_5
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 682
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-direct {p0}, Ll/ܶۜۚ;->ۛۙ()V

    :cond_8
    return-void

    :goto_5
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p2

    if-nez p2, :cond_9

    invoke-direct {p0}, Ll/ܶۜۚ;->ۛۙ()V

    :cond_9
    throw p1
.end method

.method public static synthetic ۙ(Ll/ܶۜۚ;Z)V
    .locals 2

    .line 351
    iget-boolean v0, p0, Ll/ܶۜۚ;->ۢ᩷:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v1, v0, Ll/ܽۜۚ;->ᩳ:Z

    if-eqz v1, :cond_3

    iget-object v0, v0, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    if-nez v0, :cond_0

    goto :goto_1

    .line 352
    :cond_0
    invoke-direct {p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    .line 354
    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object p1, p1, Ll/ܽۜۚ;->ۜ:Ljava/util/HashSet;

    invoke-interface {v0}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 356
    :cond_2
    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object p1, p1, Ll/ܽۜۚ;->ۜ:Ljava/util/HashSet;

    invoke-interface {v0}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 357
    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object p1, p1, Ll/ܽۜۚ;->۠:Ljava/util/ArrayList;

    invoke-interface {v0}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 359
    :goto_0
    invoke-direct {p0}, Ll/ܶۜۚ;->ۛۙ()V

    :cond_3
    :goto_1
    return-void
.end method

.method public static ۙ(Ll/᩷ۨᩴ;Z)Z
    .locals 1

    .line 193
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܿۙ()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_0

    const-string p1, ".xml"

    goto :goto_0

    :cond_0
    const-string p1, ".svg"

    .line 194
    :goto_0
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܶۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    .line 196
    :cond_1
    :try_start_0
    new-instance p1, Ljava/io/File;

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object p0

    .line 197
    new-instance p1, Ljava/io/File;

    sget-object v0, Ll/ۛۨᩴ;->ۧ:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_2
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۚ(Ll/ܶۜۚ;)Ll/۬ۚ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    return-object p0
.end method

.method private ۚۙ()Z
    .locals 3

    .line 210
    invoke-direct {p0}, Ll/ܶۜۚ;->֫ۙ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "gallery.editorPreview"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public static synthetic ۛ(Ll/ܶۜۚ;)Ll/ܶ᩹;
    .locals 0

    .line 87
    iget-object p0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    return-object p0
.end method

.method private ۛۙ()V
    .locals 15

    .line 491
    invoke-direct {p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 493
    :cond_0
    iget-object v1, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v1}, Ll/۬ۚ֫;->᩷()I

    move-result v1

    .line 494
    iget-object v2, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v2, v2, Ll/ܽۜۚ;->ۖ:Ljava/lang/String;

    if-nez v2, :cond_1

    invoke-interface {v0}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-virtual {p0, v2}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 495
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ll/ܶۜۚ;->֡᩷:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v3, v6, v7

    const/4 v3, 0x1

    aput-object v4, v6, v3

    const-string v4, "%d/%d"

    invoke-static {v2, v4, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 496
    iget-object v4, p0, Ll/ܶۜۚ;->ۛ᩷:Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 497
    iget-object v4, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 498
    iget-object v2, p0, Ll/ܶۜۚ;->֨᩷:Ll/ۡ᩻֫;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ll/ۡ᩻֫;->ۤ()Ll/ۡ֫֫;

    move-result-object v2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    invoke-virtual {v2, v1}, Ll/᩷᩻֫;->᩷(I)Ll/ۡ֫֫;

    move-result-object v2

    .line 499
    :goto_0
    iget-object v4, p0, Ll/ܶۜۚ;->ܺ᩷:Ll/᩶۠ۚ;

    if-eqz v4, :cond_3

    invoke-virtual {v4, v2}, Ll/᩶۠ۚ;->ۙ(Ll/ۡ֫֫;)V

    :cond_3
    const/4 v4, 0x0

    if-nez v2, :cond_6

    .line 500
    iget-object v2, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    iget-object v6, p0, Ll/ܶۜۚ;->֨᩷:Ll/ۡ᩻֫;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ll/ۡ᩻֫;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_4
    iget-object v6, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    invoke-virtual {v6, v1}, Ll/᩷᩻֫;->ۤ(I)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_1
    const v1, 0x7f1208d0

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_5
    move-object v1, v4

    :goto_2
    invoke-virtual {v2, v1}, Ll/ܶ᩹;->setSubtitle(Ljava/lang/CharSequence;)V

    goto/16 :goto_8

    :cond_6
    iget v1, v2, Ll/ۡ֫֫;->֫:I

    iget v6, v2, Ll/ۡ֫֫;->ۤ:I

    iget-object v8, v2, Ll/ۡ֫֫;->ۚ:Ll/ܳۧ֫;

    .line 502
    iget-wide v9, v2, Ll/ۡ֫֫;->ۙ:J

    const-wide/16 v11, 0x0

    cmp-long v13, v9, v11

    if-ltz v13, :cond_7

    goto :goto_3

    :cond_7
    iget-wide v9, v8, Ll/ܳۧ֫;->᩷:J

    :goto_3
    cmp-long v13, v9, v11

    if-gtz v13, :cond_8

    .line 503
    invoke-interface {v0}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v9

    .line 504
    :cond_8
    iget-wide v13, v8, Ll/ܳۧ֫;->ۤ:J

    cmp-long v8, v13, v11

    if-ltz v8, :cond_9

    invoke-static {v13, v14}, Ll/۠֫ܺ;->᩷(J)Ljava/lang/String;

    move-result-object v8

    goto :goto_4

    :cond_9
    move-object v8, v4

    .line 505
    :goto_4
    iget v2, v2, Ll/ۡ֫֫;->ᩴ:I

    const/4 v13, 0x5

    if-lt v2, v13, :cond_a

    move v14, v6

    goto :goto_5

    :cond_a
    move v14, v1

    :goto_5
    if-lt v2, v13, :cond_b

    goto :goto_6

    :cond_b
    move v1, v6

    .line 507
    :goto_6
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v2, "x"

    const-string v6, ")"

    const-string v13, "("

    .line 0
    invoke-static {v13, v14, v2, v6, v1}, Ll/֡᩷᩸;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    .line 508
    invoke-static {v0}, Ll/ۜ֨ۚ;->ۙ(Ll/ۖۗܳ;)Z

    move-result v2

    const-string v6, "  "

    if-eqz v2, :cond_c

    if-nez v8, :cond_e

    const-string v8, ""

    goto :goto_7

    :cond_c
    if-nez v8, :cond_d

    move-object v8, v1

    goto :goto_7

    .line 0
    :cond_d
    invoke-static {v8, v6, v1}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 510
    :cond_e
    :goto_7
    iget-object v1, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    cmp-long v2, v9, v11

    if-lez v2, :cond_f

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9, v10}, Ll/᩸֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :cond_f
    invoke-virtual {v1, v8}, Ll/ܶ᩹;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 512
    :goto_8
    iget-object v1, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    invoke-static {v1}, Ll/ۜ֡᩻;->ۤ(Ll/ܶ᩹;)Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 513
    invoke-static {v1}, Ll/ܿۙۙ;->ۙ(Landroid/widget/TextView;)I

    move-result v2

    if-nez v2, :cond_10

    .line 515
    invoke-virtual {v1}, Landroid/widget/TextView;->getTextSize()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 516
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setHorizontallyScrolling(Z)V

    .line 517
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 518
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    const/4 v6, -0x1

    .line 519
    iput v6, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 520
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 522
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v5

    .line 523
    iget v6, v5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iget v5, v5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v6, v5

    .line 524
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v5

    add-int/2addr v5, v6

    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result v6

    add-int/2addr v6, v5

    .line 523
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 525
    invoke-static {v1, v2}, Ll/ܿۙۙ;->ۙ(Landroid/widget/TextView;I)V

    .line 528
    :cond_10
    iput-boolean v3, p0, Ll/ܶۜۚ;->ۢ᩷:Z

    .line 529
    iget-object v1, p0, Ll/ܶۜۚ;->ۧ᩷:Ll/᩹ۜۚ;

    iget-object v2, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v2, v2, Ll/ܽۜۚ;->ᩳ:Z

    if-eqz v2, :cond_11

    const/4 v2, 0x0

    goto :goto_9

    :cond_11
    const/16 v2, 0x8

    :goto_9
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 530
    iget-object v1, p0, Ll/ܶۜۚ;->ۧ᩷:Ll/᩹ۜۚ;

    iget-object v2, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v2, v2, Ll/ܽۜۚ;->ۜ:Ljava/util/HashSet;

    invoke-interface {v0}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 531
    iget-object v0, p0, Ll/ܶۜۚ;->ۧ᩷:Ll/᩹ۜۚ;

    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v1, v1, Ll/ܽۜۚ;->ۜ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_a

    :cond_12
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v1, v1, Ll/ܽۜۚ;->ۜ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    :goto_a
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 532
    iput-boolean v7, p0, Ll/ܶۜۚ;->ۢ᩷:Z

    .line 533
    iget-object v0, p0, Ll/ܶۜۚ;->ܰ᩷:Landroid/view/View;

    invoke-direct {p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v1

    if-nez v1, :cond_13

    iget-object v1, p0, Ll/ܶۜۚ;->᩶᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-nez v1, :cond_13

    const/4 v7, 0x1

    :cond_13
    invoke-virtual {v0, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 534
    invoke-direct {p0}, Ll/ܶۜۚ;->᩹ۙ()V

    return-void
.end method

.method private ۤ(I)Ll/ۖۗܳ;
    .locals 1

    .line 484
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v0, v0, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    invoke-virtual {v0}, Ll/ۨۜۚ;->᩷()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖۗܳ;

    return-object p1
.end method

.method public static ۤ(Ll/ܶۜۚ;)V
    .locals 8

    .line 658
    iget-object v0, p0, Ll/ܶۜۚ;->֡᩷:Ljava/util/ArrayList;

    invoke-direct {p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/ܶۜۚ;->᩶᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-nez v1, :cond_4

    invoke-direct {p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 659
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 660
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 661
    iget-object v3, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v3, v3, Ll/ܽۜۚ;->ۜ:Ljava/util/HashSet;

    invoke-direct {p0, v2}, Ll/ܶۜۚ;->ۤ(I)Ll/ۖۗܳ;

    move-result-object v5

    invoke-interface {v5}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫ۧ֫;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 662
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v2}, Ll/۬ۚ֫;->᩷()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۧ֫;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 663
    :cond_3
    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v5, p0, Ll/ܶۜۚ;->᩶᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 664
    new-instance v6, Ll/۬֨ᩴ;

    const v0, 0x7f120956

    invoke-direct {v6, p0, v0}, Ll/۬֨ᩴ;-><init>(Ll/ܽ֡֫;I)V

    iput-object v6, p0, Ll/ܶۜۚ;->ܿ᩷:Ll/۬֨ᩴ;

    .line 665
    new-instance v0, Ll/ۜ۠ۚ;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v5}, Ll/ۜ۠ۚ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v6, v0}, Ll/۬֨ᩴ;->ۙ(Ljava/lang/Runnable;)V

    const/16 v0, 0xc8

    .line 666
    invoke-virtual {v6, v0}, Ll/۬֨ᩴ;->ۤ(I)V

    .line 667
    iget-object v0, p0, Ll/ܶۜۚ;->ܰ᩷:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 668
    sget-object v0, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/۫ۤۚ;

    const/4 v7, 0x1

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Ll/۫ۤۚ;-><init>(Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public static ۤ(Ll/ܶۜۚ;I)V
    .locals 6

    .line 630
    iget-object v0, p0, Ll/ܶۜۚ;->֡᩷:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    if-eqz v1, :cond_5

    iget-boolean v1, p0, Ll/ܶۜۚ;->ۗ᩷:Z

    if-nez v1, :cond_5

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_5

    if-ltz p1, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_2

    .line 631
    :cond_0
    invoke-direct {p0, p1}, Ll/ܶۜۚ;->ۤ(I)Ll/ۖۗܳ;

    move-result-object v1

    .line 632
    invoke-static {v1}, Ll/ۜ֨ۚ;->ۙ(Ll/ۖۗܳ;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_2

    .line 633
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, -0x1

    const/4 v4, 0x0

    .line 635
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_4

    .line 636
    invoke-direct {p0, v4}, Ll/ܶۜۚ;->ۤ(I)Ll/ۖۗܳ;

    move-result-object v5

    invoke-static {v5}, Ll/ۜ֨ۚ;->ۙ(Ll/ۖۗܳ;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    if-ne v4, p1, :cond_3

    .line 637
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 638
    :cond_3
    invoke-direct {p0, v4}, Ll/ܶۜۚ;->ۤ(I)Ll/ۖۗܳ;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 640
    :cond_4
    invoke-direct {p0}, Ll/ܶۜۚ;->ۤۙ()V

    .line 641
    new-instance p1, Ll/ۨۜۚ;

    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v0, v0, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    invoke-virtual {v0}, Ll/ۨۜۚ;->ۤ()Ll/۟ۘܳ;

    move-result-object v0

    invoke-direct {p1, v0, v2, v3}, Ll/ۨۜۚ;-><init>(Ll/۟ۘܳ;Ljava/util/List;I)V

    const-class v0, Ll/ܶۜۚ;

    const-string v2, "VideoPlayerArguments"

    invoke-static {v0, p1, v2}, Ll/᩹۟֫;->ۙ(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)V

    .line 642
    new-instance p1, Landroid/content/Intent;

    const-class v0, Ll/ۜ۫֫;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 643
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v0, v0, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    invoke-virtual {v0}, Ll/ۨۜۚ;->ۤ()Ll/۟ۘܳ;

    move-result-object v0

    invoke-static {p0, p1, v0, v1}, Ll/ۜ۫֫;->ۙ(Ll/ܽ֡֫;Landroid/content/Intent;Ll/۟ۘܳ;Ll/ۖۗܳ;)V

    .line 644
    invoke-virtual {p0, p1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public static bridge synthetic ۤ(Ll/ܶۜۚ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܶۜۚ;->ᩴ(Z)V

    return-void
.end method

.method private ۤ(Z)V
    .locals 10

    .line 369
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 371
    invoke-direct {p0}, Ll/ܶۜۚ;->֫ۙ()Z

    move-result v1

    .line 372
    invoke-direct {p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    .line 373
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v1, "file"

    .line 374
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 375
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    new-array v1, v6, [Ljava/lang/String;

    invoke-static {p1, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v4

    :cond_0
    if-eqz v4, :cond_3

    .line 376
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ܿۙ()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v4}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 377
    invoke-direct {p0}, Ll/ܶۜۚ;->ۚۙ()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Ll/ܶۜۚ;->᩻ۙ()Z

    move-result p1

    invoke-static {v4, p1}, Ll/ܶۜۚ;->ۙ(Ll/᩷ۨᩴ;Z)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 378
    :cond_1
    invoke-direct {p0}, Ll/ܶۜۚ;->ۚۙ()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iput-object v4, p1, Ll/ܽۜۚ;->ۡ:Ll/᩷ۨᩴ;

    .line 379
    :cond_2
    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    const-string v1, "gallery.previewTitle"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ll/ܽۜۚ;->ۖ:Ljava/lang/String;

    .line 380
    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    new-instance v0, Ll/ۨۜۚ;

    sget-object v1, Ll/ۧ᩻۫;->᩶:Ll/ۧ᩻۫;

    new-instance v2, Ll/ۚ᩻۫;

    invoke-direct {v2, v4}, Ll/ۚ᩻۫;-><init>(Ll/᩷ۨᩴ;)V

    new-array v5, v3, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v2, v5, v7

    .line 0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v3, v5, v6

    invoke-static {v3, v2, v3, v2}, Ll/᩺᩸ۚ;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v2

    .line 380
    invoke-direct {v0, v1, v2, v6}, Ll/ۨۜۚ;-><init>(Ll/۟ۘܳ;Ljava/util/List;I)V

    iput-object v0, p1, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    .line 381
    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ll/ܽۜۚ;->۟:Ljava/lang/String;

    .line 382
    invoke-direct {p0}, Ll/ܶۜۚ;->᩷ۙ()V

    return-void

    .line 377
    :cond_3
    :goto_0
    invoke-direct {p0}, Ll/ܶۜۚ;->ܳۙ()V

    return-void

    :cond_4
    if-eqz p1, :cond_5

    if-eqz v1, :cond_5

    .line 385
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_5

    const-string p1, "ImageViewerArguments"

    .line 386
    invoke-static {p1}, Ll/᩹۟֫;->᩷(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ll/ۨۜۚ;

    :cond_5
    if-eqz v4, :cond_a

    .line 388
    invoke-virtual {v4}, Ll/ۨۜۚ;->ۤ()Ll/۟ۘܳ;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {v4}, Ll/ۨۜۚ;->᩷()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {v4}, Ll/ۨۜۚ;->᩷()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    .line 389
    invoke-virtual {v4}, Ll/ۨۜۚ;->ۙ()I

    move-result p1

    if-ltz p1, :cond_9

    invoke-virtual {v4}, Ll/ۨۜۚ;->ۙ()I

    move-result p1

    invoke-virtual {v4}, Ll/ۨۜۚ;->᩷()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_6

    goto :goto_1

    .line 393
    :cond_6
    invoke-virtual {v4}, Ll/ۨۜۚ;->᩷()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۗܳ;

    if-nez v0, :cond_7

    .line 394
    invoke-direct {p0}, Ll/ܶۜۚ;->ܳۙ()V

    return-void

    .line 396
    :cond_8
    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    new-instance v0, Ll/ۨۜۚ;

    invoke-virtual {v4}, Ll/ۨۜۚ;->ۤ()Ll/۟ۘܳ;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ll/ۨۜۚ;->᩷()Ljava/util/List;

    move-result-object v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4}, Ll/ۨۜۚ;->ۙ()I

    move-result v5

    invoke-direct {v0, v1, v2, v5}, Ll/ۨۜۚ;-><init>(Ll/۟ۘܳ;Ljava/util/List;I)V

    iput-object v0, p1, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    .line 397
    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iput-boolean v3, p1, Ll/ܽۜۚ;->ᩳ:Z

    .line 398
    invoke-virtual {v4}, Ll/ۨۜۚ;->ۙ()I

    move-result v0

    invoke-direct {p0, v0}, Ll/ܶۜۚ;->ۤ(I)Ll/ۖۗܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ll/ܽۜۚ;->۟:Ljava/lang/String;

    .line 399
    invoke-direct {p0}, Ll/ܶۜۚ;->᩷ۙ()V

    return-void

    .line 390
    :cond_9
    :goto_1
    invoke-direct {p0}, Ll/ܶۜۚ;->ܳۙ()V

    return-void

    .line 402
    :cond_a
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v7

    .line 406
    iget-object v9, p0, Ll/ܶۜۚ;->᩺᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 407
    new-instance v8, Ljava/util/ArrayList;

    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object p1, p1, Ll/ܽۜۚ;->۠:Ljava/util/ArrayList;

    invoke-direct {v8, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 408
    sget-object p1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/۫ۜۚ;

    move-object v4, v0

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Ll/۫ۜۚ;-><init>(Ll/ܶۜۚ;ZLandroid/net/Uri;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private ۤۙ()V
    .locals 3

    .line 894
    iget-object v0, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܶۜۚ;->֨᩷:Ll/ۡ᩻֫;

    if-eqz v0, :cond_1

    :cond_0
    invoke-direct {p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    return-void

    .line 895
    :cond_2
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    invoke-direct {p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ܽۜۚ;->۟:Ljava/lang/String;

    .line 896
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v1, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v1}, Ll/۬ۚ֫;->ܳ()Landroid/os/Bundle;

    move-result-object v1

    iput-object v1, v0, Ll/ܽۜۚ;->۬:Landroid/os/Bundle;

    .line 897
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    .line 898
    iget-boolean v1, v0, Ll/ܽۜۚ;->ᩳ:Z

    if-eqz v1, :cond_3

    iget-object v1, v0, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    .line 897
    invoke-virtual {v1}, Ll/ۨۜۚ;->ۤ()Ll/۟ۘܳ;

    move-result-object v1

    sget-object v2, Ll/ۧ᩻۫;->᩶:Ll/ۧ᩻۫;

    if-ne v1, v2, :cond_3

    .line 898
    invoke-direct {p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v1

    instance-of v1, v1, Ll/ۚ᩻۫;

    if-eqz v1, :cond_3

    invoke-direct {p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۖۗܳ;->ۘ᩷()Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܿۙ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 899
    invoke-direct {p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۖۗܳ;->ۘ᩷()Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ۘ᩷()Landroid/net/Uri;

    move-result-object v1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, Ll/ܽۜۚ;->ۢ:Landroid/net/Uri;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܶۜۚ;)Ll/ܽۜۚ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    return-object p0
.end method

.method private ۧۙ()Z
    .locals 1

    .line 218
    invoke-direct {p0}, Ll/ܶۜۚ;->ۚۙ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Ll/ܶۜۚ;->᩻ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static bridge synthetic ۨ(Ll/ܶۜۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶۜۚ;->ۛۙ()V

    return-void
.end method

.method private ۨۙ()V
    .locals 3

    .line 546
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 547
    :cond_0
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v0, v0, Ll/ܽۜۚ;->ܿ:Z

    const/4 v1, 0x7

    if-nez v0, :cond_2

    iget v0, p0, Ll/ܶۜۚ;->ܽ᩷:F

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-gtz v0, :cond_2

    iget-boolean v0, p0, Ll/ܶۜۚ;->ۗ᩷:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 549
    :cond_1
    invoke-virtual {p0}, Ll/ܽ֡֫;->ᩳ()Ll/ᩳۜ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ᩳۜ;->ۙ(I)V

    return-void

    .line 548
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ll/ܽ֡֫;->ᩳ()Ll/ᩳۜ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ᩳۜ;->ۤ(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public static bridge synthetic ۫(Ll/ܶۜۚ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܶۜۚ;->ۗ᩷:Z

    return p0
.end method

.method private ۫ۙ()Ll/ۡ۫;
    .locals 5

    .line 787
    new-instance v0, Ll/ۡ۫;

    invoke-static {}, Ll/ۜܳۧ;->ۚۙ()I

    move-result v1

    invoke-direct {v0, p0, v1}, Ll/ۡ۫;-><init>(Landroid/content/Context;I)V

    .line 788
    new-instance v1, Landroid/content/res/Configuration;

    invoke-virtual {p0}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 789
    iget v2, v1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v2, v2, -0x31

    .line 790
    iget v3, p0, Ll/ܶۜۚ;->۫᩷:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    const/16 v3, 0x10

    goto :goto_0

    :cond_0
    const/16 v3, 0x20

    :goto_0
    or-int/2addr v2, v3

    iput v2, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 791
    invoke-virtual {v0, v1}, Ll/ۡ۫;->ۙ(Landroid/content/res/Configuration;)V

    return-object v0
.end method

.method public static bridge synthetic ܳ(Ll/ܶۜۚ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܶۜۚ;->᩹᩷:Z

    return p0
.end method

.method private ܳۙ()V
    .locals 1

    const v0, 0x7f1208d0

    .line 728
    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    .line 729
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static bridge synthetic ܶ(Ll/ܶۜۚ;)Ll/ۖۗܳ;
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object p0

    return-object p0
.end method

.method private ܶۙ()V
    .locals 4

    const v0, 0x7f0a0329

    .line 820
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    iget v1, p0, Ll/ܶۜۚ;->᩸᩷:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 821
    :cond_0
    sget-object v2, Ll/ܶۜۚ;->ۖ᩷:[I

    iget v3, p0, Ll/ܶۜۚ;->۫᩷:I

    aget v2, v2, v3

    const v3, 0xffffff

    and-int/2addr v2, v3

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    .line 820
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public static bridge synthetic ܺ(Ll/ܶۜۚ;)Ll/ۡ᩻֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۚ;->֨᩷:Ll/ۡ᩻֫;

    return-object p0
.end method

.method private ܺۙ()V
    .locals 5

    .line 425
    iget-object v0, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    .line 426
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 427
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    .line 428
    iget-object v3, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v3, v3, Ll/ܽۜۚ;->֡:Z

    if-eqz v3, :cond_0

    new-instance v3, Ll/֡ۚ֫;

    invoke-direct {v3, p0}, Ll/֡ۚ֫;-><init>(Ll/ܶۜۚ;)V

    goto :goto_0

    :cond_0
    new-instance v3, Ll/᩸ܺ֫;

    const/4 v4, 0x0

    .line 76
    invoke-direct {v3, p0, v4}, Ll/᩸ܺ֫;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 428
    :goto_0
    iput-object v3, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    const v4, 0x7f0a0236

    .line 429
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 430
    iget-object v3, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    iget-object v4, p0, Ll/ܶۜۚ;->᩵᩷:Ll/ۜۚ֫;

    invoke-virtual {v3, v4}, Ll/۬ۚ֫;->ۙ(Ll/ۜۚ֫;)V

    .line 431
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 432
    iget-object v3, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {v1, v3, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ܶۜۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶۜۚ;->᩸ۙ()V

    return-void
.end method

.method private ܽۙ()Ljava/util/ArrayList;
    .locals 6

    .line 882
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 883
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 884
    iget-object v2, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v2, v2, Ll/ܽۜۚ;->۠:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 885
    iget-object v4, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v4, v4, Ll/ܽۜۚ;->ۜ:Ljava/util/HashSet;

    invoke-virtual {v4, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 886
    :cond_1
    iget-object v2, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v2, v2, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    if-eqz v2, :cond_3

    .line 887
    invoke-virtual {v2}, Ll/ۨۜۚ;->᩷()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۗܳ;

    .line 888
    iget-object v4, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v4, v4, Ll/ܽۜۚ;->ۜ:Ljava/util/HashSet;

    invoke-interface {v3}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public static bridge synthetic ᩴ(Ll/ܶۜۚ;)F
    .locals 0

    .line 0
    iget p0, p0, Ll/ܶۜۚ;->ܽ᩷:F

    return p0
.end method

.method private ᩴ(Z)V
    .locals 9

    if-eqz p1, :cond_0

    .line 846
    iget-boolean v0, p0, Ll/ܶۜۚ;->ᩳ᩷:Z

    if-eqz v0, :cond_0

    goto :goto_2

    .line 847
    :cond_0
    iget v0, p0, Ll/ܶۜۚ;->ܳ᩷:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ܶۜۚ;->ܳ᩷:I

    .line 838
    iget-object v2, p0, Ll/ܶۜۚ;->ᩴ᩷:Landroid/animation/ValueAnimator;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    goto :goto_0

    .line 839
    :cond_1
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 840
    iput-object v3, p0, Ll/ܶۜۚ;->ᩴ᩷:Landroid/animation/ValueAnimator;

    :goto_0
    const/4 v2, 0x0

    .line 849
    iput-boolean v2, p0, Ll/ܶۜۚ;->ۚ᩷:Z

    const/16 v4, 0xff

    .line 850
    iput v4, p0, Ll/ܶۜۚ;->᩸᩷:I

    .line 851
    invoke-direct {p0}, Ll/ܶۜۚ;->ۗۙ()V

    .line 853
    const-class v4, Landroid/app/Activity;

    if-eqz p1, :cond_2

    :try_start_0
    const-string v5, "android.app.Activity$TranslucentConversionListener"

    .line 855
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 856
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    new-array v7, v1, [Ljava/lang/Class;

    aput-object v5, v7, v2

    new-instance v8, Ll/ۢ۠ۚ;

    invoke-direct {v8, p0, v0}, Ll/ۢ۠ۚ;-><init>(Ll/ܶۜۚ;I)V

    invoke-static {v6, v7, v8}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "convertToTranslucent"

    const/4 v7, 0x2

    new-array v8, v7, [Ljava/lang/Class;

    aput-object v5, v8, v2

    .line 867
    const-class v5, Landroid/app/ActivityOptions;

    aput-object v5, v8, v1

    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    new-array v5, v7, [Ljava/lang/Object;

    aput-object v0, v5, v2

    aput-object v3, v5, v1

    .line 868
    invoke-virtual {v4, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 869
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_3

    .line 870
    invoke-virtual {p0, v2}, Landroid/app/Activity;->setTranslucent(Z)Z

    goto :goto_1

    :cond_3
    const-string v0, "convertFromTranslucent"

    .line 872
    invoke-virtual {v4, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 874
    :goto_1
    iput-boolean p1, p0, Ll/ܶۜۚ;->ᩳ᩷:Z
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_2
    return-void
.end method

.method private ᩴۙ()Ll/ۖۗܳ;
    .locals 2

    .line 486
    iget-object v0, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v0}, Ll/۬ۚ֫;->᩷()I

    move-result v0

    .line 487
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v1, v1, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    if-eqz v1, :cond_1

    if-ltz v0, :cond_1

    invoke-virtual {v1}, Ll/ۨۜۚ;->᩷()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, v0}, Ll/ܶۜۚ;->ۤ(I)Ll/ۖۗܳ;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static bridge synthetic ᩵(Ll/ܶۜۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶۜۚ;->ۨۙ()V

    return-void
.end method

.method private ᩵ۙ()V
    .locals 9

    .line 796
    invoke-direct {p0}, Ll/ܶۜۚ;->۫ۙ()Ll/ۡ۫;

    move-result-object v0

    .line 797
    iget-object v1, p0, Ll/ܶۜۚ;->ۧ᩷:Ll/᩹ۜۚ;

    iget v2, p0, Ll/ܶۜۚ;->۫᩷:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ll/᩹ۜۚ;->ۙ(Z)V

    .line 508
    invoke-virtual {v0}, Ll/ۡ۫;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v0}, Ll/ۡ۫;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v2, 0x7f06005f

    invoke-static {v1, v2, v0}, Ll/ۡ۟;->᩷(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 799
    iget v1, p0, Ll/ܶۜۚ;->۫᩷:I

    if-ne v1, v4, :cond_1

    const v1, 0x10100a0

    .line 800
    filled-new-array {v1}, [I

    move-result-object v1

    .line 801
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v2

    const/4 v5, 0x3

    new-array v5, v5, [F

    .line 803
    invoke-static {v2, v5}, Ll/ᩴᩳ;->ۙ(I[F)V

    .line 805
    aget v6, v5, v4

    const v7, 0x3f4ccccd    # 0.8f

    mul-float v6, v6, v7

    aput v6, v5, v4

    const/4 v6, 0x2

    .line 806
    aget v7, v5, v6

    const v8, 0x3f59999a    # 0.85f

    mul-float v7, v7, v8

    aput v7, v5, v6

    .line 807
    invoke-static {v5}, Ll/ᩴᩳ;->ۙ([F)I

    move-result v5

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    invoke-static {v5, v2}, Ll/ᩴᩳ;->ۤ(II)I

    move-result v2

    .line 808
    new-instance v5, Landroid/content/res/ColorStateList;

    new-array v7, v3, [I

    new-array v6, v6, [[I

    aput-object v1, v6, v3

    aput-object v7, v6, v4

    .line 809
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    filled-new-array {v2, v0}, [I

    move-result-object v0

    invoke-direct {v5, v6, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    move-object v0, v5

    .line 811
    :cond_1
    iget-object v1, p0, Ll/ܶۜۚ;->ۧ᩷:Ll/᩹ۜۚ;

    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 813
    iget-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v1, p0, Ll/ܶۜۚ;->۫᩷:I

    if-ne v1, v4, :cond_2

    const v1, 0x7f13029c

    goto :goto_1

    :cond_2
    const v1, 0x7f13029d

    :goto_1
    invoke-virtual {v0, v1, v4}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 816
    iget-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x7f1302f7

    invoke-virtual {v0, v1, v4}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ܶۜۚ;I)Ll/ۖۗܳ;
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܶۜۚ;->ۤ(I)Ll/ۖۗܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Landroid/app/Activity;Ll/᩷ۨᩴ;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 175
    invoke-static {p0, p1, p2, v0}, Ll/ܶۜۚ;->ۙ(Landroid/app/Activity;Ll/᩷ۨᩴ;Ljava/lang/String;Z)V

    return-void
.end method

.method public static ᩷(Ll/ܶۜۚ;)V
    .locals 1

    const/4 v0, 0x0

    .line 733
    invoke-direct {p0, v0}, Ll/ܶۜۚ;->᩷(Z)V

    return-void
.end method

.method public static synthetic ᩷(Ll/ܶۜۚ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 1

    const/4 v0, 0x1

    .line 704
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 705
    iget-object v0, p0, Ll/ܶۜۚ;->᩻᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll/ܶۜۚ;->᩻᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Ll/ܶۜۚ;->ܺ᩷:Ll/᩶۠ۚ;

    :cond_0
    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ܶۜۚ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܶۜۚ;->᩸(Z)V

    return-void
.end method

.method private ᩷(Z)V
    .locals 5

    .line 736
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_9

    iget-boolean v0, p0, Ll/ܶۜۚ;->ۗ᩷:Z

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 737
    :cond_0
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    if-eqz v0, :cond_2

    iget-boolean v1, v0, Ll/ܽۜۚ;->ᩳ:Z

    if-eqz v1, :cond_2

    iget-object v0, v0, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    if-eqz v0, :cond_2

    .line 738
    invoke-direct {p0}, Ll/ܶۜۚ;->ܽۙ()Ljava/util/ArrayList;

    move-result-object v0

    .line 739
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    iget-object v2, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v2, v2, Ll/ܽۜۚ;->۟:Ljava/lang/String;

    const-string v3, "gallery.currentPath"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 740
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "paths"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    :cond_1
    const/4 v0, -0x1

    .line 741
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    :cond_2
    const/4 v0, 0x1

    .line 743
    iput-boolean v0, p0, Ll/ܶۜۚ;->ۗ᩷:Z

    .line 760
    invoke-direct {p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 761
    :cond_3
    invoke-direct {p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    .line 763
    :cond_4
    iget-object v3, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v3, v3, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    invoke-virtual {v3}, Ll/ۨۜۚ;->ۤ()Ll/۟ۘܳ;

    move-result-object v3

    instance-of v3, v3, Ll/ۧ᩻۫;

    if-eqz v3, :cond_5

    .line 764
    invoke-interface {v0}, Ll/ۖۗܳ;->ۘ᩷()Ll/᩷ۨᩴ;

    move-result-object v3

    instance-of v3, v3, Ll/᩸ܿᩴ;

    if-nez v3, :cond_6

    invoke-interface {v0}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ll/᩸ܿܳ;->᩷:Ll/᩸ܿܳ;

    const-string v3, "path"

    .line 0
    invoke-static {v0, v3}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    invoke-static {v0, v1}, Ll/᩸ܿܳ;->ۙ(Ljava/lang/String;Ll/۠᩶ܳ;)V

    goto :goto_0

    .line 765
    :cond_5
    iget-object v3, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v3, v3, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    invoke-virtual {v3}, Ll/ۨۜۚ;->ۤ()Ll/۟ۘܳ;

    move-result-object v3

    instance-of v4, v3, Ll/ᩳۛ۫;

    if-eqz v4, :cond_6

    check-cast v3, Ll/ᩳۛ۫;

    .line 766
    invoke-virtual {v3}, Ll/ᩳۛ۫;->ۚ()Ll/֡ۗ۫;

    move-result-object v3

    iget v3, v3, Ll/֡ۗ۫;->ܿ:I

    invoke-static {v3}, Ll/۟ۗ۫;->ۤ(I)Ll/֡ۗ۫;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 768
    invoke-interface {v0}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ll/۠᩶ܳ;

    invoke-direct {v4, v3, v2}, Ll/۠᩶ܳ;-><init>(Ll/֡ۗ۫;Z)V

    invoke-static {v0, v4}, Ll/᩸ܿܳ;->ۙ(Ljava/lang/String;Ll/۠᩶ܳ;)V

    .line 838
    :cond_6
    :goto_0
    iget-object v0, p0, Ll/ܶۜۚ;->ᩴ᩷:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_7

    goto :goto_1

    .line 839
    :cond_7
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 840
    iput-object v1, p0, Ll/ܶۜۚ;->ᩴ᩷:Landroid/animation/ValueAnimator;

    .line 746
    :goto_1
    invoke-direct {p0}, Ll/ܶۜۚ;->ۨۙ()V

    if-nez p1, :cond_8

    .line 749
    iget-object v0, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v0}, Ll/۬ۚ֫;->ۙ()V

    .line 750
    iget-boolean v0, p0, Ll/ܶۜۚ;->ᩳ᩷:Z

    if-eqz v0, :cond_8

    invoke-direct {p0, v2}, Ll/ܶۜۚ;->ᩴ(Z)V

    .line 752
    :cond_8
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    if-eqz p1, :cond_9

    .line 754
    invoke-virtual {p0, v2, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    :cond_9
    :goto_2
    return-void
.end method

.method private ᩷ۙ()V
    .locals 7

    .line 451
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v0, v0, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    .line 452
    invoke-virtual {v0}, Ll/ۨۜۚ;->ۙ()I

    move-result v1

    .line 453
    iget-object v2, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v2, v2, Ll/ܽۜۚ;->۟:Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    const/4 v1, 0x0

    .line 455
    :goto_0
    invoke-virtual {v0}, Ll/ۨۜۚ;->᩷()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 456
    iget-object v2, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v2, v2, Ll/ܽۜۚ;->۟:Ljava/lang/String;

    invoke-direct {p0, v1}, Ll/ܶۜۚ;->ۤ(I)Ll/ۖۗܳ;

    move-result-object v4

    invoke-interface {v4}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :cond_2
    :goto_1
    if-ltz v1, :cond_a

    .line 458
    invoke-virtual {v0}, Ll/ۨۜۚ;->᩷()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_3

    goto/16 :goto_4

    .line 460
    :cond_3
    :try_start_0
    invoke-virtual {v0}, Ll/ۨۜۚ;->᩷()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v5, p0, Ll/ܶۜۚ;->֡᩷:Ljava/util/ArrayList;

    if-eqz v4, :cond_4

    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖۗܳ;

    .line 461
    invoke-virtual {v0}, Ll/ۨۜۚ;->ۤ()Ll/۟ۘܳ;

    move-result-object v6

    invoke-static {p0, v6, v4}, Ll/۫ۧ֫;->ۙ(Ll/ܶۜۚ;Ll/۟ۘܳ;Ll/ۖۗܳ;)Ll/۫ۧ֫;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 462
    :cond_4
    invoke-direct {p0}, Ll/ܶۜۚ;->᩻ۙ()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 463
    invoke-direct {p0, v3}, Ll/ܶۜۚ;->ۤ(I)Ll/ۖۗܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۖۗܳ;->ۘ᩷()Ll/᩷ۨᩴ;

    move-result-object v0

    .line 464
    invoke-direct {p0}, Ll/ܶۜۚ;->ۚۙ()Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".arsc"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    goto :goto_3

    :cond_5
    const-string v1, "resources.arsc"

    .line 266
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->getParent()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_6

    const/4 v1, 0x0

    goto :goto_3

    .line 269
    :cond_6
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    .line 466
    :goto_3
    new-instance v2, Ll/ۡ᩻֫;

    iget-object v3, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    new-instance v4, Ll/ۚۜۚ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Ll/ۚۜۚ;-><init>(ILjava/lang/Object;)V

    invoke-direct {v2, v0, v1, v3, v4}, Ll/ۡ᩻֫;-><init>(Ll/᩷ۨᩴ;Ll/᩷ۨᩴ;Ll/۬ۚ֫;Ll/ۚۜۚ;)V

    iput-object v2, p0, Ll/ܶۜۚ;->֨᩷:Ll/ۡ᩻֫;

    .line 467
    invoke-virtual {v2}, Ll/ۡ᩻֫;->᩷()V

    .line 468
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v0, v0, Ll/ܽۜۚ;->۬:Landroid/os/Bundle;

    if-eqz v0, :cond_7

    iget-object v1, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v1, v0}, Ll/۬ۚ֫;->ۙ(Landroid/os/Bundle;)Z

    .line 469
    :cond_7
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v0, v0, Ll/ܽۜۚ;->ܿ:Z

    invoke-direct {p0, v0}, Ll/ܶۜۚ;->᩸(Z)V

    .line 470
    invoke-direct {p0}, Ll/ܶۜۚ;->ۛۙ()V

    return-void

    .line 473
    :cond_8
    new-instance v0, Ll/᩷᩻֫;

    invoke-direct {v0, p0, v5}, Ll/᩷᩻֫;-><init>(Ll/ܶۜۚ;Ljava/util/ArrayList;)V

    iput-object v0, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    .line 474
    invoke-virtual {p0}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v2

    sget-object v3, Ll/ۖۧۙ;->ᩳ:Ll/ۖۧۙ;

    invoke-virtual {v2, v3}, Ll/ۖۧۙ;->ۙ(Ll/ۖۧۙ;)Z

    move-result v2

    invoke-virtual {v0, v2}, Ll/᩷᩻֫;->ۙ(Z)V

    .line 475
    iget-object v0, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    new-instance v2, Ll/ۚۜۚ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, Ll/ۚۜۚ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/᩷᩻֫;->ۙ(Ll/ۚۜۚ;)V

    .line 476
    iget-object v0, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    iget-object v2, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v0, v2, v1}, Ll/᩷᩻֫;->ۙ(Ll/۬ۚ֫;I)V

    .line 477
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v0, v0, Ll/ܽۜۚ;->۬:Landroid/os/Bundle;

    if-eqz v0, :cond_9

    iget-object v2, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v2, v0}, Ll/۬ۚ֫;->ۙ(Landroid/os/Bundle;)Z

    .line 478
    :cond_9
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    invoke-direct {p0, v1}, Ll/ܶۜۚ;->ۤ(I)Ll/ۖۗܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ܽۜۚ;->۟:Ljava/lang/String;

    .line 479
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v0, v0, Ll/ܽۜۚ;->ܿ:Z

    invoke-direct {p0, v0}, Ll/ܶۜۚ;->᩸(Z)V

    .line 480
    invoke-direct {p0}, Ll/ܶۜۚ;->ۛۙ()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 481
    :catch_0
    invoke-direct {p0}, Ll/ܶۜۚ;->ܳۙ()V

    return-void

    .line 458
    :cond_a
    :goto_4
    invoke-direct {p0}, Ll/ܶۜۚ;->ܳۙ()V

    return-void
.end method

.method public static bridge synthetic ᩸(Ll/ܶۜۚ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۚ;->֫᩷:Landroid/view/View;

    return-object p0
.end method

.method private ᩸(Z)V
    .locals 3

    .line 538
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iput-boolean p1, v0, Ll/ܽۜۚ;->ܿ:Z

    .line 540
    iget-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    const/4 v1, 0x4

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 541
    iget-object v0, p0, Ll/ܶۜۚ;->֫᩷:Landroid/view/View;

    invoke-direct {p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v1, 0x8

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    const/4 v1, 0x0

    :cond_2
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 542
    invoke-direct {p0}, Ll/ܶۜۚ;->ۨۙ()V

    return-void
.end method

.method private ᩸ۙ()V
    .locals 2

    .line 715
    iget-object v0, p0, Ll/ܶۜۚ;->᩻᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 716
    :cond_0
    iget-object v0, p0, Ll/ܶۜۚ;->ܺ᩷:Ll/᩶۠ۚ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/᩶۠ۚ;->ۙ()V

    :cond_1
    const/4 v0, 0x0

    .line 717
    iput-object v0, p0, Ll/ܶۜۚ;->᩻᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 718
    iput-object v0, p0, Ll/ܶۜۚ;->ܺ᩷:Ll/᩶۠ۚ;

    return-void
.end method

.method public static ᩹(Ll/ܶۜۚ;)V
    .locals 1

    const/4 v0, 0x0

    .line 733
    invoke-direct {p0, v0}, Ll/ܶۜۚ;->᩷(Z)V

    return-void
.end method

.method private ᩹ۙ()V
    .locals 3

    .line 588
    invoke-direct {p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v0

    .line 589
    iget-object v1, p0, Ll/ܶۜۚ;->ܶ᩷:Landroid/view/MenuItem;

    if-eqz v1, :cond_1

    instance-of v2, v0, Ll/ۚ᩻۫;

    if-eqz v2, :cond_0

    .line 590
    check-cast v0, Ll/۫᩶ܳ;

    invoke-virtual {v0}, Ll/۫᩶ܳ;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, ".9.png"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    if-eqz v0, :cond_0

    iget-object v2, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    .line 591
    invoke-virtual {v2}, Ll/۬ۚ֫;->᩷()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/᩷᩻֫;->᩷(I)Ll/ۡ֫֫;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 589
    :goto_0
    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_1
    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ܶۜۚ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܶۜۚ;->ᩳ᩷:Z

    return p0
.end method

.method private ᩻ۙ()Z
    .locals 3

    .line 214
    invoke-direct {p0}, Ll/ܶۜۚ;->֫ۙ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "gallery.vectorPreview"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 927
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 928
    iget-object p1, p0, Ll/ܶۜۚ;->ۧ᩷:Ll/᩹ۜۚ;

    if-eqz p1, :cond_0

    .line 781
    invoke-static {}, Ll/ۜܳۧ;->ۚۙ()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۘᩴ;->setTheme(I)V

    .line 782
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const v0, 0x7f1302fe

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 930
    invoke-direct {p0}, Ll/ܶۜۚ;->᩵ۙ()V

    .line 931
    iget-object p1, p0, Ll/ܶۜۚ;->ܺ᩷:Ll/᩶۠ۚ;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Ll/ܶۜۚ;->۫ۙ()Ll/ۡ۫;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩶۠ۚ;->ۙ(Ll/ۡ۫;)V

    :cond_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 8

    const/4 v0, 0x0

    .line 222
    iput-boolean v0, p0, Ll/ܽ֡֫;->۟ۙ:Z

    .line 781
    invoke-static {}, Ll/ۜܳۧ;->ۚۙ()I

    move-result v1

    invoke-virtual {p0, v1}, Ll/ۘᩴ;->setTheme(I)V

    .line 782
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v2, 0x7f1302fe

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 224
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onCreate(Landroid/os/Bundle;)V

    .line 225
    new-instance v1, Ll/ܶܺۙ;

    invoke-direct {v1, p0}, Ll/ܶܺۙ;-><init>(Ll/ۗܺۙ;)V

    const-class v2, Ll/ܽۜۚ;

    invoke-virtual {v1, v2}, Ll/ܶܺۙ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object v1

    check-cast v1, Ll/ܽۜۚ;

    iput-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    const v1, 0x7f0d0032

    .line 226
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    const v1, 0x7f0a0236

    .line 227
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/۬ۚ֫;

    iput-object v1, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    .line 228
    invoke-direct {p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v1

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    .line 230
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iput-boolean v0, v1, Ll/ܽۜۚ;->֡:Z

    .line 231
    iput-boolean v4, v1, Ll/ܽۜۚ;->֨:Z

    goto :goto_1

    .line 232
    :cond_0
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v1, v1, Ll/ܽۜۚ;->֨:Z

    if-nez v1, :cond_2

    .line 233
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v2, "pvc"

    invoke-interface {v1, v2, v0}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 234
    iget-object v2, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "gallery.continuous"

    invoke-virtual {p1, v3, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    :goto_0
    iput-boolean v1, v2, Ll/ܽۜۚ;->֡:Z

    .line 235
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iput-boolean v4, v1, Ll/ܽۜۚ;->֨:Z

    .line 237
    :cond_2
    :goto_1
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v1, v1, Ll/ܽۜۚ;->֡:Z

    if-eqz v1, :cond_3

    invoke-direct {p0}, Ll/ܶۜۚ;->ܺۙ()V

    :cond_3
    const v1, 0x7f0a009a

    .line 238
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/ܶۜۚ;->֫᩷:Landroid/view/View;

    const v1, 0x7f0a068a

    .line 239
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ܶ᩹;

    iput-object v1, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    const v1, 0x7f0a00e2

    .line 240
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/᩹ۜۚ;

    iput-object v1, p0, Ll/ܶۜۚ;->ۧ᩷:Ll/᩹ۜۚ;

    const v1, 0x7f0a02b2

    .line 241
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/ܶۜۚ;->ۛ᩷:Landroid/widget/TextView;

    const v1, 0x7f0a0433

    .line 242
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/ܶۜۚ;->ܰ᩷:Landroid/view/View;

    .line 287
    iget-object v1, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->ۙ(Ll/ܶ᩹;)V

    .line 288
    invoke-virtual {p0}, Ll/ܽ֡֫;->ۖ()V

    .line 289
    iget-object v1, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    new-instance v2, Ll/᩷ۜۚ;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Ll/᩷ۜۚ;-><init>(Ll/ܽ֡֫;I)V

    invoke-virtual {v1, v2}, Ll/ܶ᩹;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 290
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    .line 291
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    const/4 v5, 0x3

    if-lt v2, v3, :cond_5

    .line 292
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    const/16 v6, 0x1e

    if-lt v2, v6, :cond_4

    const/4 v2, 0x3

    goto :goto_2

    :cond_4
    const/4 v2, 0x1

    .line 295
    :goto_2
    invoke-static {v3, v2}, Ll/ۚܽۤ;->ۙ(Landroid/view/WindowManager$LayoutParams;I)V

    .line 296
    invoke-virtual {v1, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_5
    const v2, 0x106000d

    .line 298
    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 299
    invoke-static {v1, v0}, Ll/ܿ۠;->ۙ(Landroid/view/Window;Z)V

    .line 300
    invoke-virtual {v1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 301
    invoke-virtual {v1, v0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 302
    invoke-virtual {p0}, Ll/ܽ֡֫;->ᩳ()Ll/ᩳۜ;

    move-result-object v1

    .line 303
    invoke-virtual {v1, v0}, Ll/ᩳۜ;->᩷(Z)V

    .line 304
    invoke-virtual {v1, v0}, Ll/ᩳۜ;->ۙ(Z)V

    const/4 v2, 0x2

    .line 305
    invoke-virtual {v1, v2}, Ll/ᩳۜ;->᩷(I)V

    const v1, 0x7f0a0329

    .line 306
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Ll/ۤۜۚ;

    invoke-direct {v2, p0}, Ll/ۤۜۚ;-><init>(Ll/ܶۜۚ;)V

    invoke-static {v1, v2}, Ll/᩸۠;->ۙ(Landroid/view/View;Ll/᩸ۖ;)V

    .line 314
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v2, "pvbi"

    invoke-interface {v1, v2, v0}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Ll/ܶۜۚ;->۫᩷:I

    if-ltz v1, :cond_6

    if-lt v1, v5, :cond_7

    .line 315
    :cond_6
    iput v0, p0, Ll/ܶۜۚ;->۫᩷:I

    .line 316
    :cond_7
    invoke-direct {p0}, Ll/ܶۜۚ;->ۗۙ()V

    .line 317
    new-instance v1, Ll/ܺۜۚ;

    invoke-direct {v1, p0}, Ll/ܺۜۚ;-><init>(Ll/ܶۜۚ;)V

    iput-object v1, p0, Ll/ܶۜۚ;->᩵᩷:Ll/ۜۚ֫;

    .line 347
    iget-object v2, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v2, v1}, Ll/۬ۚ֫;->ۙ(Ll/ۜۚ֫;)V

    .line 348
    iget-object v1, p0, Ll/ܶۜۚ;->ۧ᩷:Ll/᩹ۜۚ;

    invoke-virtual {v1, v0}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 349
    iget-object v1, p0, Ll/ܶۜۚ;->ۧ᩷:Ll/᩹ۜۚ;

    const v2, 0x7f1207bd

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 350
    iget-object v1, p0, Ll/ܶۜۚ;->ۧ᩷:Ll/᩹ۜۚ;

    new-instance v2, Ll/᩸ۜۚ;

    invoke-direct {v2, p0}, Ll/᩸ۜۚ;-><init>(Ll/ܶۜۚ;)V

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 361
    iget-object v1, p0, Ll/ܶۜۚ;->ܰ᩷:Landroid/view/View;

    const v2, 0x7f1207c3

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 362
    iget-object v1, p0, Ll/ܶۜۚ;->ܰ᩷:Landroid/view/View;

    new-instance v2, Ll/ᩴۜۚ;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Ll/ᩴۜۚ;-><init>(Ll/ܽ֡֫;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 363
    iget-object v1, p0, Ll/ܶۜۚ;->ܰ᩷:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 364
    iget-object v1, p0, Ll/ܶۜۚ;->ۧ᩷:Ll/᩹ۜۚ;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 365
    iget-object v1, p0, Ll/ܶۜۚ;->ۛ᩷:Landroid/widget/TextView;

    const v2, 0x7f12057b

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    if-eqz p1, :cond_8

    .line 245
    invoke-direct {p0, v0}, Ll/ܶۜۚ;->ᩴ(Z)V

    .line 246
    :cond_8
    invoke-virtual {p0}, Ll/ۚۤ;->getOnBackPressedDispatcher()Ll/ۜۤ;

    move-result-object v1

    new-instance v2, Ll/᩻ۜۚ;

    invoke-direct {v2, p0}, Ll/᩻ۜۚ;-><init>(Ll/ܶۜۚ;)V

    invoke-virtual {v1, p0, v2}, Ll/ۜۤ;->ۙ(Ll/ۤ᩻ۙ;Ll/ۛۤ;)V

    .line 249
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v2, v1, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    if-eqz v2, :cond_9

    .line 250
    invoke-direct {p0}, Ll/ܶۜۚ;->᩷ۙ()V

    return-void

    :cond_9
    if-eqz p1, :cond_d

    const-string v2, "gallery.internal"

    .line 253
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, v1, Ll/ܽۜۚ;->ᩳ:Z

    .line 254
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    const-string v2, "gallery.path"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ll/ܽۜۚ;->۟:Ljava/lang/String;

    .line 255
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    const-string v2, "gallery.viewport"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    iput-object v2, v1, Ll/ܽۜۚ;->۬:Landroid/os/Bundle;

    .line 256
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    const-string v2, "gallery.bars"

    invoke-virtual {p1, v2, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, v1, Ll/ܽۜۚ;->ܿ:Z

    .line 257
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v1, v1, Ll/ܽۜۚ;->ᩳ:Z

    if-eqz v1, :cond_d

    const-string v0, "gallery.localUri"

    .line 258
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_a

    .line 261
    invoke-direct {p0}, Ll/ܶۜۚ;->ܳۙ()V

    return-void

    .line 264
    :cond_a
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, v1, Ll/ܽۜۚ;->ۢ:Landroid/net/Uri;

    const-string v0, "gallery.selected"

    .line 265
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_c

    .line 267
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 268
    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v1, v1, Ll/ܽۜۚ;->ۜ:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v1, v1, Ll/ܽۜۚ;->۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 270
    :cond_c
    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v5, p1, Ll/ܽۜۚ;->ۢ:Landroid/net/Uri;

    .line 406
    iget-object v7, p0, Ll/ܶۜۚ;->᩺᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 407
    new-instance v6, Ljava/util/ArrayList;

    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object p1, p1, Ll/ܽۜۚ;->۠:Ljava/util/ArrayList;

    invoke-direct {v6, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 408
    sget-object p1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/۫ۜۚ;

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Ll/۫ۜۚ;-><init>(Ll/ܶۜۚ;ZLandroid/net/Uri;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_d
    if-nez p1, :cond_e

    const/4 v0, 0x1

    .line 274
    :cond_e
    invoke-direct {p0, v0}, Ll/ܶۜۚ;->ۤ(Z)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 4

    .line 554
    invoke-direct {p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const v0, 0x7f12014c

    .line 555
    invoke-interface {p1, v2, v0, v2, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v3, 0x7f0801c4

    .line 556
    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ll/ܶۜۚ;->ܶ᩷:Landroid/view/MenuItem;

    const v0, 0x7f1207cd

    .line 557
    invoke-interface {p1, v2, v0, v2, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v3, 0x7f0801e5

    .line 558
    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 559
    invoke-direct {p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x7f0a03f0

    const v3, 0x7f120768

    .line 560
    invoke-interface {p1, v2, v0, v2, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v0, 0x7f0801d4

    .line 561
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 563
    :cond_1
    invoke-direct {p0}, Ll/ܶۜۚ;->᩹ۙ()V

    const/4 p1, 0x1

    return p1
.end method

.method public final onDestroy()V
    .locals 2

    .line 1000
    invoke-direct {p0}, Ll/ܶۜۚ;->᩸ۙ()V

    .line 838
    iget-object v0, p0, Ll/ܶۜۚ;->ᩴ᩷:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_0

    goto :goto_0

    .line 839
    :cond_0
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    .line 840
    iput-object v0, p0, Ll/ܶۜۚ;->ᩴ᩷:Landroid/animation/ValueAnimator;

    .line 1002
    :goto_0
    iget-object v0, p0, Ll/ܶۜۚ;->᩺᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1003
    iget-object v0, p0, Ll/ܶۜۚ;->᩶᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1004
    :cond_1
    iget-object v0, p0, Ll/ܶۜۚ;->ܿ᩷:Ll/۬֨ᩴ;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/۬֨ᩴ;->ۙ()V

    .line 1005
    :cond_2
    iget-object v0, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ll/᩷᩻֫;->close()V

    .line 1006
    :cond_3
    iget-object v0, p0, Ll/ܶۜۚ;->֨᩷:Ll/ۡ᩻֫;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ll/ۡ᩻֫;->close()V

    .line 1007
    :cond_4
    invoke-super {p0}, Ll/ܽ֡֫;->onDestroy()V

    return-void
.end method

.method public final onEnterAnimationComplete()V
    .locals 3

    .line 280
    invoke-super {p0}, Landroid/app/Activity;->onEnterAnimationComplete()V

    const/4 v0, 0x1

    .line 281
    iput-boolean v0, p0, Ll/ܶۜۚ;->᩹᩷:Z

    .line 283
    iget v1, p0, Ll/ܶۜۚ;->ܽ᩷:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    iget-boolean v1, p0, Ll/ܶۜۚ;->ۗ᩷:Z

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0, v0}, Ll/ܶۜۚ;->ᩴ(Z)V

    :cond_0
    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    .line 944
    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    .line 945
    iget-object v0, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩷᩻֫;->ۤ()V

    :cond_0
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 5

    .line 966
    invoke-super {p0, p1}, Ll/ۚۤ;->onNewIntent(Landroid/content/Intent;)V

    .line 967
    invoke-direct {p0}, Ll/ܶۜۚ;->᩸ۙ()V

    .line 968
    invoke-direct {p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v0

    const/4 v1, 0x0

    .line 969
    iput-boolean v1, p0, Ll/ܶۜۚ;->ۗ᩷:Z

    .line 970
    iget-object v2, p0, Ll/ܶۜۚ;->᩺᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 971
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v2, p0, Ll/ܶۜۚ;->᩺᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 972
    iget-object v2, p0, Ll/ܶۜۚ;->᩶᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 973
    :cond_0
    iget-object v2, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/᩷᩻֫;->close()V

    .line 974
    :cond_1
    iget-object v2, p0, Ll/ܶۜۚ;->֨᩷:Ll/ۡ᩻֫;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ll/ۡ᩻֫;->close()V

    :cond_2
    const/4 v2, 0x0

    .line 975
    iput-object v2, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    .line 976
    iput-object v2, p0, Ll/ܶۜۚ;->֨᩷:Ll/ۡ᩻֫;

    .line 977
    iget-object v4, p0, Ll/ܶۜۚ;->֡᩷:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 978
    iget-object v4, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    invoke-virtual {v4}, Ll/ܽۜۚ;->᩸()V

    .line 979
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    if-nez v0, :cond_3

    .line 980
    invoke-direct {p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 981
    :cond_3
    iget-object p1, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    invoke-direct {p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v4, "pvc"

    invoke-interface {v0, v4, v1}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p1, Ll/ܽۜۚ;->֡:Z

    .line 982
    iget-object p1, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, p1, Ll/֡ۚ֫;

    .line 982
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v0, v0, Ll/ܽۜۚ;->֡:Z

    if-eq p1, v0, :cond_5

    .line 983
    invoke-direct {p0}, Ll/ܶۜۚ;->ܺۙ()V

    .line 984
    invoke-direct {p0}, Ll/ܶۜۚ;->ۗۙ()V

    :cond_5
    const p1, 0x7f12090c

    .line 987
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(I)V

    .line 988
    iget-object p1, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    invoke-virtual {p1, v2}, Ll/ܶ᩹;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 989
    iget-object p1, p0, Ll/ܶۜۚ;->ۛ᩷:Landroid/widget/TextView;

    const v0, 0x7f12057b

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 990
    iget-object p1, p0, Ll/ܶۜۚ;->ۧ᩷:Ll/᩹ۜۚ;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 991
    iget-object p1, p0, Ll/ܶۜۚ;->ܰ᩷:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 992
    invoke-direct {p0, v3}, Ll/ܶۜۚ;->᩸(Z)V

    .line 993
    invoke-direct {p0}, Ll/ܶۜۚ;->᩹ۙ()V

    .line 994
    invoke-virtual {p0}, Ll/ۘᩴ;->invalidateOptionsMenu()V

    .line 995
    invoke-direct {p0, v3}, Ll/ܶۜۚ;->ۤ(Z)V

    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 17

    move-object/from16 v0, p0

    .line 596
    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const/4 v2, 0x0

    const v3, 0x7f120092

    const v4, 0x7f12043b

    const v5, 0x7f12041d

    const/4 v6, 0x1

    const v7, 0x7f0a03f0

    if-ne v1, v7, :cond_2

    .line 569
    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 570
    :cond_0
    iget-object v1, v0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 572
    new-instance v7, Ll/ܿܽ;

    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->۫ۙ()Ll/ۡ۫;

    move-result-object v8

    const v9, 0x800003

    const v10, 0x7f040020

    invoke-direct {v7, v8, v1, v9, v10}, Ll/ܿܽ;-><init>(Landroid/content/Context;Landroid/view/View;II)V

    .line 574
    invoke-virtual {v7}, Ll/ܿܽ;->ۤ()Ll/ۢۚ;

    move-result-object v1

    .line 575
    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v8

    invoke-static {v8}, Ll/ۜ֨ۚ;->ۙ(Ll/ۖۗܳ;)Z

    move-result v8

    if-nez v8, :cond_1

    .line 576
    invoke-virtual {v1, v2, v3, v2, v3}, Ll/ۢۚ;->add(IIII)Landroid/view/MenuItem;

    .line 577
    :cond_1
    invoke-virtual {v1, v6}, Ll/ۢۚ;->setGroupDividerEnabled(Z)V

    .line 578
    invoke-virtual {v1, v6, v4, v6, v4}, Ll/ۢۚ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    .line 579
    invoke-interface {v2, v6}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, v0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v3, v3, Ll/ܽۜۚ;->֡:Z

    xor-int/2addr v3, v6

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const/4 v2, 0x2

    .line 580
    invoke-virtual {v1, v6, v5, v2, v5}, Ll/ۢۚ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    .line 581
    invoke-interface {v2, v6}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, v0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v3, v3, Ll/ܽۜۚ;->֡:Z

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 582
    invoke-virtual {v1, v6, v6, v6}, Ll/ۢۚ;->setGroupCheckable(IZZ)V

    .line 583
    new-instance v1, Ll/ܳۜۚ;

    invoke-direct {v1, v0}, Ll/ܳۜۚ;-><init>(Ll/ܶۜۚ;)V

    invoke-virtual {v7, v1}, Ll/ܿܽ;->ۙ(Ll/᩶ܽ;)V

    .line 584
    invoke-virtual {v7}, Ll/ܿܽ;->ᩴ()V

    return v6

    .line 600
    :cond_2
    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    if-ne v1, v3, :cond_4

    .line 696
    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v1

    .line 697
    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v2

    if-nez v2, :cond_c

    iget-object v2, v0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    if-eqz v2, :cond_c

    if-eqz v1, :cond_c

    invoke-static {v1}, Ll/ۜ֨ۚ;->ۙ(Ll/ۖۗܳ;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto/16 :goto_2

    .line 698
    :cond_3
    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->᩸ۙ()V

    .line 699
    iget-object v2, v0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v2}, Ll/۬ۚ֫;->᩷()I

    move-result v2

    .line 700
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v3, v0, Ll/ܶۜۚ;->᩻᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 702
    new-instance v4, Ll/᩶۠ۚ;

    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->۫ۙ()Ll/ۡ۫;

    move-result-object v8

    invoke-interface {v1}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v1}, Ll/ۖۗܳ;->getParent()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v11

    invoke-interface {v1}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v13

    iget-object v1, v0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    .line 703
    invoke-virtual {v1, v2}, Ll/᩷᩻֫;->᩷(I)Ll/ۡ֫֫;

    move-result-object v15

    new-instance v1, Ll/֫ۜۚ;

    const/4 v5, 0x0

    invoke-direct {v1, v0, v3, v5}, Ll/֫ۜۚ;-><init>(Ll/ܽ֡֫;Ljava/lang/Object;I)V

    move-object v7, v4

    move-object/from16 v16, v1

    invoke-direct/range {v7 .. v16}, Ll/᩶۠ۚ;-><init>(Ll/ۡ۫;Ljava/lang/String;Ljava/lang/String;JJLl/ۡ֫֫;Ll/֫ۜۚ;)V

    .line 707
    iput-object v4, v0, Ll/ܶۜۚ;->ܺ᩷:Ll/᩶۠ۚ;

    .line 708
    invoke-virtual {v4}, Ll/᩶۠ۚ;->᩷()V

    .line 709
    iget-object v1, v0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    new-instance v5, Ll/ۧۜۚ;

    invoke-direct {v5, v3}, Ll/ۧۜۚ;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    new-instance v7, Ll/֨۠ۚ;

    invoke-direct {v7, v0, v3, v4}, Ll/֨۠ۚ;-><init>(Ll/ܶۜۚ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/᩶۠ۚ;)V

    invoke-virtual {v1, v2, v5, v7}, Ll/᩷᩻֫;->ۙ(ILl/ۧۜۚ;Ll/֨۠ۚ;)V

    return v6

    .line 604
    :cond_4
    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    if-eq v1, v4, :cond_9

    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    if-ne v1, v5, :cond_5

    goto/16 :goto_1

    .line 609
    :cond_5
    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const v2, 0x7f1207cd

    if-ne v1, v2, :cond_6

    .line 610
    iget v1, v0, Ll/ܶۜۚ;->۫᩷:I

    add-int/2addr v1, v6

    rem-int/lit8 v1, v1, 0x3

    iput v1, v0, Ll/ܶۜۚ;->۫᩷:I

    .line 611
    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->ۗۙ()V

    .line 612
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v1

    const-string v2, "pvbi"

    iget v3, v0, Ll/ܶۜۚ;->۫᩷:I

    invoke-interface {v1, v3, v2}, Ll/ᩳ֫ܺ;->ۙ(ILjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳ֫ܺ;->apply()V

    return v6

    .line 615
    :cond_6
    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const v2, 0x7f12014c

    if-ne v1, v2, :cond_8

    .line 616
    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->ᩴۙ()Ll/ۖۗܳ;

    move-result-object v1

    .line 617
    instance-of v2, v1, Ll/ۚ᩻۫;

    if-eqz v2, :cond_c

    move-object v2, v1

    check-cast v2, Ll/۫᩶ܳ;

    invoke-virtual {v2}, Ll/۫᩶ܳ;->getName()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ".9.png"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 618
    check-cast v1, Ll/ۚ᩻۫;

    invoke-virtual {v1}, Ll/ۚ᩻۫;->ۘ᩷()Ll/᩷ۨᩴ;

    move-result-object v1

    .line 620
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ۗۙ()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v1

    goto :goto_0

    :cond_7
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ۘ᩷()Landroid/net/Uri;

    move-result-object v1

    .line 621
    :goto_0
    new-instance v2, Landroid/content/Intent;

    const-class v3, Ll/ܺۙۧ;

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "android.intent.action.VIEW"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    return v6

    .line 625
    :cond_8
    invoke-super/range {p0 .. p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v1

    return v1

    :cond_9
    :goto_1
    move-object/from16 v1, p1

    .line 605
    invoke-interface {v1, v6}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 606
    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    if-ne v1, v5, :cond_a

    const/4 v2, 0x1

    .line 436
    :cond_a
    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->ۧۙ()Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, v0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v1, v1, Ll/ܽۜۚ;->֡:Z

    if-eq v1, v2, :cond_c

    iget-object v1, v0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    if-eqz v1, :cond_c

    iget-boolean v1, v0, Ll/ܶۜۚ;->ۗ᩷:Z

    if-eqz v1, :cond_b

    goto :goto_2

    .line 437
    :cond_b
    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->ۤۙ()V

    .line 438
    iget-object v1, v0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v1}, Ll/۬ۚ֫;->᩷()I

    move-result v1

    .line 439
    iget-object v3, v0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iput-boolean v2, v3, Ll/ܽۜۚ;->֡:Z

    const/4 v4, 0x0

    .line 441
    iput-object v4, v3, Ll/ܽۜۚ;->۬:Landroid/os/Bundle;

    .line 442
    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->ܺۙ()V

    .line 443
    iget-object v3, v0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    iget-object v4, v0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v3, v4, v1}, Ll/᩷᩻֫;->᩷(Ll/۬ۚ֫;I)V

    .line 444
    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->ۗۙ()V

    .line 445
    invoke-direct/range {p0 .. p0}, Ll/ܶۜۚ;->ۛۙ()V

    .line 446
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v1

    const-string v3, "pvc"

    invoke-interface {v1, v3, v2}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳ֫ܺ;->apply()V

    .line 447
    invoke-virtual/range {p0 .. p0}, Ll/ۘᩴ;->invalidateOptionsMenu()V

    :cond_c
    :goto_2
    return v6
.end method

.method public final onPause()V
    .locals 2

    .line 950
    invoke-direct {p0}, Ll/ܶۜۚ;->᩸ۙ()V

    .line 951
    invoke-direct {p0}, Ll/ܶۜۚ;->ۤۙ()V

    .line 952
    iget-object v0, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/᩷᩻֫;->ۙ(Z)V

    .line 953
    :cond_0
    iget-object v0, p0, Ll/ܶۜۚ;->ۨ᩷:Ll/۬ۚ֫;

    invoke-virtual {v0}, Ll/۬ۚ֫;->ۙ()V

    .line 954
    invoke-super {p0}, Ll/ܽ֡֫;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 3

    .line 919
    invoke-super {p0}, Ll/ܽ֡֫;->onResume()V

    .line 781
    invoke-static {}, Ll/ۜܳۧ;->ۚۙ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۘᩴ;->setTheme(I)V

    .line 782
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x7f1302fe

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 921
    invoke-direct {p0}, Ll/ܶۜۚ;->᩵ۙ()V

    .line 922
    iget-object v0, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2}, Ll/᩷᩻֫;->ۙ(Z)V

    :cond_0
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 904
    invoke-direct {p0}, Ll/ܶۜۚ;->ۤۙ()V

    .line 905
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v0, v0, Ll/ܽۜۚ;->ᩳ:Z

    const-string v1, "gallery.internal"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 906
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v0, v0, Ll/ܽۜۚ;->۟:Ljava/lang/String;

    const-string v1, "gallery.path"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 907
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-object v0, v0, Ll/ܽۜۚ;->۬:Landroid/os/Bundle;

    const-string v1, "gallery.viewport"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 908
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v0, v0, Ll/ܽۜۚ;->ܿ:Z

    const-string v1, "gallery.bars"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 909
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v0, v0, Ll/ܽۜۚ;->֡:Z

    const-string v1, "gallery.continuous"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 910
    iget-object v0, p0, Ll/ܶۜۚ;->۟᩷:Ll/ܽۜۚ;

    iget-boolean v1, v0, Ll/ܽۜۚ;->ᩳ:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Ll/ܽۜۚ;->ۢ:Landroid/net/Uri;

    if-eqz v0, :cond_0

    const-string v1, "gallery.localUri"

    .line 911
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "gallery.selected"

    .line 912
    invoke-direct {p0}, Ll/ܶۜۚ;->ܽۙ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 914
    :cond_0
    invoke-super {p0, p1}, Ll/ۚۤ;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 959
    iget-object v0, p0, Ll/ܶۜۚ;->᩶᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 960
    :cond_0
    iget-object v0, p0, Ll/ܶۜۚ;->ܿ᩷:Ll/۬֨ᩴ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۬֨ᩴ;->ۙ()V

    .line 961
    :cond_1
    invoke-super {p0}, Ll/ܽ֡֫;->onStop()V

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 2

    .line 937
    invoke-super {p0, p1}, Ll/ۚۤ;->onTrimMemory(I)V

    .line 939
    iget-object v0, p0, Ll/ܶۜۚ;->ۘ᩷:Ll/᩷᩻֫;

    if-eqz v0, :cond_0

    const/16 v1, 0x14

    if-eq p1, v1, :cond_0

    invoke-virtual {v0}, Ll/᩷᩻֫;->ۤ()V

    :cond_0
    return-void
.end method

.method public final ۛ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ᩶()Ljava/lang/String;
    .locals 1

    const-string v0, "ImageViewerActivity"

    return-object v0
.end method

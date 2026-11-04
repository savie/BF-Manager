.class public final Ll/֡۠᩸;
.super Landroid/os/Handler;
.source "X68P"


# instance fields
.field public final ۙ:Ljava/lang/ref/WeakReference;

.field public ۤ:Z

.field public ᩷:Z

.field public ᩸:Z


# direct methods
.method public constructor <init>(Ll/᩺ۜ᩸;)V
    .locals 1

    .line 6567
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/4 v0, 0x0

    .line 6571
    iput-boolean v0, p0, Ll/֡۠᩸;->᩸:Z

    .line 6572
    iput-boolean v0, p0, Ll/֡۠᩸;->ۤ:Z

    .line 6568
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/֡۠᩸;->ۙ:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 6576
    iget-object v0, p0, Ll/֡۠᩸;->ۙ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ۜ᩸;

    if-eqz v0, :cond_9

    .line 6578
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x5dc

    const/16 v2, 0x12c

    const-wide/16 v3, 0x5dc

    const/4 v5, 0x0

    const/4 v6, 0x1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 6652
    :pswitch_0
    invoke-static {v0}, Ll/᩺ۜ᩸;->ۤ᩷(Ll/᩺ۜ᩸;)V

    return-void

    .line 6648
    :pswitch_1
    iget-object p1, v0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {p1}, Ll/۬ۡ᩸;->ܰ()V

    .line 6649
    invoke-static {v0}, Ll/᩺ۜ᩸;->ᩴ᩷(Ll/᩺ۜ᩸;)V

    return-void

    .line 6645
    :pswitch_2
    sget-object p1, Ll/᩺ۜ᩸;->ۧᩴ:Landroid/text/method/TextKeyListener;

    .line 6304
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 6305
    iget-object p1, v0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    iget-object p1, p1, Ll/ܰۤᩴ;->ܺۙ:Ll/ܰۡ᩸;

    if-eqz p1, :cond_9

    .line 6306
    invoke-interface {p1}, Ll/ܰۡ᩸;->ۙ()V

    return-void

    .line 6619
    :pswitch_3
    invoke-static {v0}, Ll/᩺ۜ᩸;->֨(Ll/᩺ۜ᩸;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6620
    invoke-static {v0}, Ll/᩺ۜ᩸;->ۡۙ(Ll/᩺ۜ᩸;)V

    .line 6621
    iput-boolean v6, p0, Ll/֡۠᩸;->ۤ:Z

    return-void

    .line 6624
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v7

    invoke-static {v0}, Ll/᩺ۜ᩸;->᩻ۙ(Ll/᩺ۜ᩸;)J

    move-result-wide v9

    sub-long/2addr v7, v9

    sub-long/2addr v7, v3

    long-to-int p1, v7

    const/4 v3, 0x5

    if-ltz p1, :cond_2

    if-ge p1, v2, :cond_1

    .line 6627
    iput-boolean v6, p0, Ll/֡۠᩸;->ۤ:Z

    .line 6628
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 6629
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 6630
    invoke-virtual {p0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    .line 6631
    :cond_1
    iget-boolean p1, p0, Ll/֡۠᩸;->ۤ:Z

    if-eqz p1, :cond_9

    .line 6632
    iput-boolean v5, p0, Ll/֡۠᩸;->ۤ:Z

    .line 6633
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_2
    neg-int p1, p1

    if-ge p1, v1, :cond_3

    .line 6637
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    int-to-long v0, p1

    .line 6638
    invoke-virtual {p0, v3, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 6640
    :cond_3
    iput-boolean v6, p0, Ll/֡۠᩸;->ۤ:Z

    return-void

    .line 6659
    :pswitch_4
    iget-boolean p1, p0, Ll/֡۠᩸;->᩷:Z

    if-eqz p1, :cond_4

    goto :goto_0

    .line 6661
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 6662
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x1f4

    add-long/2addr v0, v2

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    return-void

    .line 6589
    :pswitch_5
    invoke-static {v0}, Ll/᩺ۜ᩸;->ۡ(Ll/᩺ۜ᩸;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 6590
    invoke-static {v0}, Ll/᩺ۜ᩸;->ۖۙ(Ll/᩺ۜ᩸;)V

    .line 6591
    iput-boolean v6, p0, Ll/֡۠᩸;->᩸:Z

    return-void

    .line 6594
    :cond_5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v7

    invoke-static {v0}, Ll/᩺ۜ᩸;->ܺۙ(Ll/᩺ۜ᩸;)J

    move-result-wide v9

    sub-long/2addr v7, v9

    sub-long/2addr v7, v3

    long-to-int p1, v7

    const/4 v3, 0x3

    if-ltz p1, :cond_7

    if-ge p1, v2, :cond_6

    .line 6597
    iput-boolean v6, p0, Ll/֡۠᩸;->᩸:Z

    .line 6598
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 6599
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 6600
    invoke-virtual {p0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    .line 6601
    :cond_6
    iget-boolean p1, p0, Ll/֡۠᩸;->᩸:Z

    if-eqz p1, :cond_9

    .line 6602
    iput-boolean v5, p0, Ll/֡۠᩸;->᩸:Z

    .line 6603
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_7
    neg-int p1, p1

    if-ge p1, v1, :cond_8

    .line 6607
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    int-to-long v0, p1

    .line 6608
    invoke-virtual {p0, v3, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 6610
    :cond_8
    iput-boolean v6, p0, Ll/֡۠᩸;->᩸:Z

    return-void

    :pswitch_6
    const/4 p1, -0x1

    .line 2503
    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ۛ(I)V

    return-void

    .line 6580
    :pswitch_7
    invoke-static {v0}, Ll/᩺ۜ᩸;->ᩴۙ(Ll/᩺ۜ᩸;)Z

    move-result p1

    if-nez p1, :cond_9

    .line 6581
    invoke-static {v0}, Ll/᩺ۜ᩸;->۟(Ll/᩺ۜ᩸;)Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-static {v0, p1}, Ll/᩺ۜ᩸;->ܳ(Ll/᩺ۜ᩸;I)V

    :cond_9
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۙ()V
    .locals 1

    .line 6666
    iget-boolean v0, p0, Ll/֡۠᩸;->᩷:Z

    if-nez v0, :cond_0

    const/4 v0, 0x4

    .line 6667
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x1

    .line 6668
    iput-boolean v0, p0, Ll/֡۠᩸;->᩷:Z

    :cond_0
    return-void
.end method

.method public final ᩷()V
    .locals 4

    const/4 v0, 0x0

    .line 6673
    iput-boolean v0, p0, Ll/֡۠᩸;->᩷:Z

    .line 6674
    iget-object v0, p0, Ll/֡۠᩸;->ۙ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ۜ᩸;

    if-eqz v0, :cond_1

    .line 6659
    iget-boolean v1, p0, Ll/֡۠᩸;->᩷:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 6661
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 6662
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x1f4

    add-long/2addr v0, v2

    const/4 v2, 0x4

    invoke-virtual {p0, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    :cond_1
    :goto_0
    return-void
.end method

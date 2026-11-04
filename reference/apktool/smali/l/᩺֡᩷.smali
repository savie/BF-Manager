.class public final Ll/᩺֡᩷;
.super Ljava/lang/Object;
.source "K4ND"


# instance fields
.field public ۙ:I

.field public ۤ:Ll/ۡ֡᩷;

.field public ᩴ:Z

.field public ᩷:Z

.field public ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2574
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2575
    invoke-virtual {p0}, Ll/᩺֡᩷;->᩷()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 2597
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnchorInfo{mPosition="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩺֡᩷;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCoordinate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩺֡᩷;->ۙ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLayoutFromEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/᩺֡᩷;->᩷:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mValid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/᩺֡᩷;->ᩴ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()V
    .locals 1

    .line 2590
    iget-boolean v0, p0, Ll/᩺֡᩷;->᩷:Z

    if-eqz v0, :cond_0

    .line 2591
    iget-object v0, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {v0}, Ll/ۡ֡᩷;->᩷()I

    move-result v0

    goto :goto_0

    .line 2592
    :cond_0
    iget-object v0, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {v0}, Ll/ۡ֡᩷;->ܳ()I

    move-result v0

    :goto_0
    iput v0, p0, Ll/᩺֡᩷;->ۙ:I

    return-void
.end method

.method public final ۙ(ILandroid/view/View;)V
    .locals 1

    .line 2659
    iget-boolean v0, p0, Ll/᩺֡᩷;->᩷:Z

    if-eqz v0, :cond_0

    .line 2660
    iget-object v0, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {v0, p2}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result p2

    iget-object v0, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    .line 2661
    invoke-virtual {v0}, Ll/ۡ֡᩷;->ۚ()I

    move-result v0

    add-int/2addr v0, p2

    iput v0, p0, Ll/᩺֡᩷;->ۙ:I

    goto :goto_0

    .line 2663
    :cond_0
    iget-object v0, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {v0, p2}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result p2

    iput p2, p0, Ll/᩺֡᩷;->ۙ:I

    .line 2666
    :goto_0
    iput p1, p0, Ll/᩺֡᩷;->᩸:I

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, -0x1

    .line 2579
    iput v0, p0, Ll/᩺֡᩷;->᩸:I

    const/high16 v0, -0x80000000

    .line 2580
    iput v0, p0, Ll/᩺֡᩷;->ۙ:I

    const/4 v0, 0x0

    .line 2581
    iput-boolean v0, p0, Ll/᩺֡᩷;->᩷:Z

    .line 2582
    iput-boolean v0, p0, Ll/᩺֡᩷;->ᩴ:Z

    return-void
.end method

.method public final ᩷(ILandroid/view/View;)V
    .locals 4

    .line 2612
    iget-object v0, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {v0}, Ll/ۡ֡᩷;->ۚ()I

    move-result v0

    if-ltz v0, :cond_0

    .line 2614
    invoke-virtual {p0, p1, p2}, Ll/᩺֡᩷;->ۙ(ILandroid/view/View;)V

    return-void

    .line 2617
    :cond_0
    iput p1, p0, Ll/᩺֡᩷;->᩸:I

    .line 2618
    iget-boolean p1, p0, Ll/᩺֡᩷;->᩷:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 2619
    iget-object p1, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {p1}, Ll/ۡ֡᩷;->᩷()I

    move-result p1

    sub-int/2addr p1, v0

    .line 2620
    iget-object v0, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {v0, p2}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result v0

    sub-int/2addr p1, v0

    .line 2622
    iget-object v0, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {v0}, Ll/ۡ֡᩷;->᩷()I

    move-result v0

    sub-int/2addr v0, p1

    iput v0, p0, Ll/᩺֡᩷;->ۙ:I

    if-lez p1, :cond_2

    .line 2625
    iget-object v0, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {v0, p2}, Ll/ۡ֡᩷;->᩷(Landroid/view/View;)I

    move-result v0

    .line 2626
    iget v2, p0, Ll/᩺֡᩷;->ۙ:I

    sub-int/2addr v2, v0

    .line 2627
    iget-object v0, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {v0}, Ll/ۡ֡᩷;->ܳ()I

    move-result v0

    .line 2628
    iget-object v3, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {v3, p2}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result p2

    sub-int/2addr p2, v0

    .line 2630
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/2addr p2, v0

    sub-int/2addr v2, p2

    if-gez v2, :cond_2

    .line 2634
    iget p2, p0, Ll/᩺֡᩷;->ۙ:I

    neg-int v0, v2

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int/2addr p1, p2

    iput p1, p0, Ll/᩺֡᩷;->ۙ:I

    return-void

    .line 2638
    :cond_1
    iget-object p1, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {p1, p2}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result p1

    .line 2639
    iget-object v2, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {v2}, Ll/ۡ֡᩷;->ܳ()I

    move-result v2

    sub-int v2, p1, v2

    .line 2640
    iput p1, p0, Ll/᩺֡᩷;->ۙ:I

    if-lez v2, :cond_2

    .line 2642
    iget-object v3, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    .line 2643
    invoke-virtual {v3, p2}, Ll/ۡ֡᩷;->᩷(Landroid/view/View;)I

    move-result v3

    add-int/2addr v3, p1

    .line 2644
    iget-object p1, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {p1}, Ll/ۡ֡᩷;->᩷()I

    move-result p1

    sub-int/2addr p1, v0

    .line 2646
    iget-object v0, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    .line 2647
    invoke-virtual {v0, p2}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result p2

    sub-int/2addr p1, p2

    .line 2648
    iget-object p2, p0, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    invoke-virtual {p2}, Ll/ۡ֡᩷;->᩷()I

    move-result p2

    .line 2649
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    sub-int/2addr p2, p1

    sub-int/2addr p2, v3

    if-gez p2, :cond_2

    .line 2652
    iget p1, p0, Ll/᩺֡᩷;->ۙ:I

    neg-int p2, p2

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    sub-int/2addr p1, p2

    iput p1, p0, Ll/᩺֡᩷;->ۙ:I

    :cond_2
    return-void
.end method

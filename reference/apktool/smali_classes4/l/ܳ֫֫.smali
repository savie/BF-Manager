.class public final Ll/ܳ֫֫;
.super Ljava/lang/Object;
.source "B6MB"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public volatile ֡:Z

.field public final ۟:Ll/ۡۚ֫;

.field public final ۢ:Ll/᩵᩻֫;

.field public final ܰ:Ll/۟ۚ֫;

.field public final ܿ:Landroid/graphics/RectF;

.field public final ᩳ:Ll/ۡ֫֫;

.field public final ᩶:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Ll/ۡ֫֫;Landroid/graphics/Bitmap;Ll/ۡۚ֫;Ll/᩵᩻֫;)V
    .locals 0

    .line 660
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 661
    iput-object p1, p0, Ll/ܳ֫֫;->ᩳ:Ll/ۡ֫֫;

    .line 662
    iput-object p2, p0, Ll/ܳ֫֫;->᩶:Landroid/graphics/Bitmap;

    .line 663
    iput-object p3, p0, Ll/ܳ֫֫;->۟:Ll/ۡۚ֫;

    .line 664
    iput-object p4, p0, Ll/ܳ֫֫;->ۢ:Ll/᩵᩻֫;

    const/4 p2, 0x0

    .line 665
    iput-object p2, p0, Ll/ܳ֫֫;->ܰ:Ll/۟ۚ֫;

    .line 666
    new-instance p2, Landroid/graphics/RectF;

    iget p3, p1, Ll/ۡ֫֫;->֫:I

    int-to-float p3, p3

    iget p1, p1, Ll/ۡ֫֫;->ۤ:I

    int-to-float p1, p1

    const/4 p4, 0x0

    invoke-direct {p2, p4, p4, p3, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p2, p0, Ll/ܳ֫֫;->ܿ:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Ll/ۡ֫֫;Ll/۟ۚ֫;)V
    .locals 2

    .line 669
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 670
    iput-object p1, p0, Ll/ܳ֫֫;->ᩳ:Ll/ۡ֫֫;

    .line 671
    iput-object p2, p0, Ll/ܳ֫֫;->ܰ:Ll/۟ۚ֫;

    const/4 p2, 0x0

    .line 672
    iput-object p2, p0, Ll/ܳ֫֫;->᩶:Landroid/graphics/Bitmap;

    iput-object p2, p0, Ll/ܳ֫֫;->۟:Ll/ۡۚ֫;

    iput-object p2, p0, Ll/ܳ֫֫;->ۢ:Ll/᩵᩻֫;

    .line 673
    new-instance p2, Landroid/graphics/RectF;

    iget v0, p1, Ll/ۡ֫֫;->֫:I

    int-to-float v0, v0

    iget p1, p1, Ll/ۡ֫֫;->ۤ:I

    int-to-float p1, p1

    const/4 v1, 0x0

    invoke-direct {p2, v1, v1, v0, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p2, p0, Ll/ܳ֫֫;->ܿ:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 711
    invoke-virtual {p0, v0}, Ll/ܳ֫֫;->ۙ(Ll/ۡۚ֫;)V

    return-void
.end method

.method public final ۙ(Landroid/graphics/RectF;FLl/ۖۚ֫;JLl/ܽۧ֫;)Ll/۠֫֫;
    .locals 8

    .line 694
    iget-boolean v0, p0, Ll/ܳ֫֫;->֡:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܳ֫֫;->ۢ:Ll/᩵᩻֫;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩵᩻֫;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 695
    iget-object v1, p0, Ll/ܳ֫֫;->ۢ:Ll/᩵᩻֫;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Ll/᩵᩻֫;->ۙ(Landroid/graphics/RectF;FLl/ۖۚ֫;JLl/ܽۧ֫;)Ll/۠֫֫;

    move-result-object p1

    return-object p1

    .line 694
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "No SVG raster document"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 3

    .line 699
    iget-boolean v0, p0, Ll/ܳ֫֫;->֡:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 700
    :cond_0
    iget-object v0, p0, Ll/ܳ֫֫;->ܰ:Ll/۟ۚ֫;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ll/ܳ֫֫;->ܿ:Landroid/graphics/RectF;

    invoke-interface {v0, p1, v1, p2}, Ll/۟ۚ֫;->ۙ(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void

    .line 701
    :cond_1
    iget-object v0, p0, Ll/ܳ֫֫;->ۢ:Ll/᩵᩻֫;

    invoke-virtual {v0, p1}, Ll/᩵᩻֫;->ۙ(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    return-void

    .line 702
    :cond_2
    iget-object v0, p0, Ll/ܳ֫֫;->᩶:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ܳ֫֫;->ܿ:Landroid/graphics/RectF;

    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final ۙ(Ll/ۡۚ֫;)V
    .locals 1

    .line 716
    iget-boolean v0, p0, Ll/ܳ֫֫;->֡:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 717
    iput-boolean v0, p0, Ll/ܳ֫֫;->֡:Z

    .line 718
    iget-object v0, p0, Ll/ܳ֫֫;->ܰ:Ll/۟ۚ֫;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ll/۟ۚ֫;->ۙ(Ll/ۡۚ֫;)V

    return-void

    .line 719
    :cond_1
    iget-object v0, p0, Ll/ܳ֫֫;->᩶:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 720
    iget-object v0, p0, Ll/ܳ֫֫;->۟:Ll/ۡۚ֫;

    invoke-virtual {v0}, Ll/ۡۚ֫;->close()V

    .line 721
    iget-object v0, p0, Ll/ܳ֫֫;->ۢ:Ll/᩵᩻֫;

    invoke-virtual {v0, p1}, Ll/᩵᩻֫;->ۙ(Ll/ۡۚ֫;)V

    return-void
.end method

.method public final ۙ(ZLl/۠ۧ֫;)V
    .locals 1

    .line 706
    iget-boolean v0, p0, Ll/ܳ֫֫;->֡:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܳ֫֫;->ܰ:Ll/۟ۚ֫;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Ll/۟ۚ֫;->ۙ(ZLl/۠ۧ֫;)V

    :cond_0
    return-void
.end method

.method public final ۙ()Z
    .locals 1

    .line 685
    iget-boolean v0, p0, Ll/ܳ֫֫;->֡:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܳ֫֫;->ۢ:Ll/᩵᩻֫;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩵᩻֫;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۤ()I
    .locals 1

    .line 688
    iget-object v0, p0, Ll/ܳ֫֫;->ۢ:Ll/᩵᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-virtual {v0}, Ll/᩵᩻֫;->᩷()I

    move-result v0

    return v0
.end method

.method public final ܳ()J
    .locals 2

    .line 680
    iget-object v0, p0, Ll/ܳ֫֫;->ܰ:Ll/۟ۚ֫;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-interface {v0}, Ll/۟ۚ֫;->᩷()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩷()J
    .locals 4

    .line 682
    iget-object v0, p0, Ll/ܳ֫֫;->ܰ:Ll/۟ۚ֫;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/۟ۚ֫;->ۙ()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Ll/ܳ֫֫;->۟:Ll/ۡۚ֫;

    invoke-virtual {v0}, Ll/ۡۚ֫;->ۙ()J

    move-result-wide v0

    iget-object v2, p0, Ll/ܳ֫֫;->ۢ:Ll/᩵᩻֫;

    invoke-virtual {v2}, Ll/᩵᩻֫;->ۤ()J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0
.end method

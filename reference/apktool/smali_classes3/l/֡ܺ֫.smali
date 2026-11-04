.class public final Ll/֡ܺ֫;
.super Ljava/lang/Object;
.source "OIRX"

# interfaces
.implements Ll/ۙۧ֫;


# instance fields
.field public ۙ:Landroid/graphics/Bitmap;

.field public final ۤ:I

.field public final ᩷:Landroid/graphics/RectF;

.field public final ᩸:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 251
    iput-object p1, p0, Ll/֡ܺ֫;->ۙ:Landroid/graphics/Bitmap;

    .line 252
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Ll/֡ܺ֫;->᩸:I

    .line 253
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, Ll/֡ܺ֫;->ۤ:I

    .line 254
    new-instance v1, Landroid/graphics/RectF;

    int-to-float v0, v0

    int-to-float p1, p1

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, v0, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v1, p0, Ll/֡ܺ֫;->᩷:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 264
    iput-object v0, p0, Ll/֡ܺ֫;->ۙ:Landroid/graphics/Bitmap;

    return-void
.end method

.method public final getHeight()I
    .locals 1

    .line 258
    iget v0, p0, Ll/֡ܺ֫;->ۤ:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 257
    iget v0, p0, Ll/֡ܺ֫;->᩸:I

    return v0
.end method

.method public final ۙ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۙ(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 3

    .line 261
    iget-object v0, p0, Ll/֡ܺ֫;->ۙ:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֡ܺ֫;->ۙ:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/֡ܺ֫;->᩷:Landroid/graphics/RectF;

    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Landroid/graphics/RectF;FZ)V
    .locals 0

    return-void
.end method

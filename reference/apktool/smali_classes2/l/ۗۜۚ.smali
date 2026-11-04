.class public final Ll/ۗۜۚ;
.super Landroid/graphics/drawable/Drawable;
.source "B6JD"


# instance fields
.field public final ۙ:Landroid/graphics/Bitmap;

.field public final ۤ:Landroid/graphics/Rect;

.field public final ᩷:Landroid/graphics/Paint;

.field public final ᩸:Landroid/graphics/PorterDuffColorFilter;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;ILandroid/graphics/PorterDuffColorFilter;)V
    .locals 2

    .line 57
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 55
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ll/ۗۜۚ;->᩷:Landroid/graphics/Paint;

    .line 58
    iput-object p1, p0, Ll/ۗۜۚ;->ۙ:Landroid/graphics/Bitmap;

    .line 59
    iput-object p3, p0, Ll/ۗۜۚ;->᩸:Landroid/graphics/PorterDuffColorFilter;

    .line 60
    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 61
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    .line 62
    new-instance p3, Landroid/graphics/Rect;

    mul-int v0, p2, p1

    add-int/lit8 p2, p2, 0x1

    mul-int p2, p2, p1

    const/4 v1, 0x0

    invoke-direct {p3, v0, v1, p2, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object p3, p0, Ll/ۗۜۚ;->ۤ:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 67
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Ll/ۗۜۚ;->᩷:Landroid/graphics/Paint;

    iget-object v2, p0, Ll/ۗۜۚ;->ۙ:Landroid/graphics/Bitmap;

    iget-object v3, p0, Ll/ۗۜۚ;->ۤ:Landroid/graphics/Rect;

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 72
    iget-object v0, p0, Ll/ۗۜۚ;->᩷:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 73
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    if-nez p1, :cond_0

    .line 79
    iget-object p1, p0, Ll/ۗۜۚ;->᩸:Landroid/graphics/PorterDuffColorFilter;

    :cond_0
    iget-object v0, p0, Ll/ۗۜۚ;->᩷:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 80
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

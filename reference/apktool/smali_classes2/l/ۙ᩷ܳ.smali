.class public final Ll/ۙ᩷ܳ;
.super Ljava/lang/Object;
.source "C4PJ"


# static fields
.field public static ᩷ۙ:Landroid/graphics/Typeface;


# instance fields
.field public ֡:F

.field public final ֨:Landroid/graphics/drawable/Drawable;

.field public ֫:F

.field public final ۖ:Landroid/graphics/drawable/Drawable;

.field public ۗ:I

.field public ۘ:I

.field public ۙ:I

.field public final ۙۙ:Ll/ۨ᩷ܳ;

.field public ۚ:F

.field public ۛ:I

.field public ۜ:F

.field public ۟:I

.field public ۠:I

.field public final ۡ:Landroid/graphics/drawable/Drawable;

.field public ۢ:I

.field public ۤ:I

.field public ۧ:I

.field public ۨ:I

.field public ۫:I

.field public ۬:I

.field public ܰ:I

.field public ܳ:I

.field public ܶ:I

.field public ܺ:I

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:I

.field public ᩴ:F

.field public ᩵:I

.field public ᩶:Ll/ۢܺۤ;

.field public ᩷:F

.field public final ᩸:Ll/ۚ᩷ܳ;

.field public ᩹:Z

.field public ᩺:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ۨ᩷ܳ;Ll/ۚ᩷ܳ;)V
    .locals 4

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Ll/ۙ᩷ܳ;->ܽ:Z

    .line 37
    iput-object p2, p0, Ll/ۙ᩷ܳ;->᩸:Ll/ۚ᩷ܳ;

    .line 38
    iput-object p1, p0, Ll/ۙ᩷ܳ;->ۙۙ:Ll/ۨ᩷ܳ;

    .line 39
    new-instance p2, Ll/ۢܺۤ;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Ll/ۢܺۤ;-><init>(I)V

    iput-object p2, p0, Ll/ۙ᩷ܳ;->᩶:Ll/ۢܺۤ;

    .line 41
    sget-object v0, Ll/ۙ᩷ܳ;->᩷ۙ:Landroid/graphics/Typeface;

    if-nez v0, :cond_0

    .line 42
    invoke-static {}, Ll/᩶᩷ۧ;->ܽ()Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Ll/ۙ᩷ܳ;->᩷ۙ:Landroid/graphics/Typeface;

    .line 44
    :cond_0
    sget-object v0, Ll/ۙ᩷ܳ;->᩷ۙ:Landroid/graphics/Typeface;

    invoke-virtual {p2, v0}, Ll/ۢܺۤ;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 45
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    .line 48
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    iput p2, p0, Ll/ۙ᩷ܳ;->ᩴ:F

    const v0, -0x22888889

    .line 49
    iput v0, p0, Ll/ۙ᩷ܳ;->ܳ:I

    const v0, 0x39777777

    .line 50
    iput v0, p0, Ll/ۙ᩷ܳ;->ۧ:I

    const/high16 v0, 0x41000000    # 8.0f

    mul-float v0, v0, p2

    .line 51
    iput v0, p0, Ll/ۙ᩷ܳ;->֫:F

    const/high16 v0, 0x42400000    # 48.0f

    mul-float v0, v0, p2

    .line 52
    iput v0, p0, Ll/ۙ᩷ܳ;->ۚ:F

    const v0, 0x77666666

    .line 53
    iput v0, p0, Ll/ۙ᩷ܳ;->ܿ:I

    const/high16 v0, 0x40800000    # 4.0f

    mul-float p2, p2, v0

    .line 54
    iput p2, p0, Ll/ۙ᩷ܳ;->֡:F

    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0802d2

    .line 57
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Ll/ۙ᩷ܳ;->ۡ:Landroid/graphics/drawable/Drawable;

    const v0, 0x7f0802d4

    .line 58
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Ll/ۙ᩷ܳ;->ۖ:Landroid/graphics/drawable/Drawable;

    const v1, 0x7f0802d3

    .line 59
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/ۙ᩷ܳ;->֨:Landroid/graphics/drawable/Drawable;

    const/16 v1, 0xd2

    .line 60
    invoke-virtual {p2, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 61
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    const/16 v1, 0xe6

    .line 62
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 68
    sget v1, Ll/ۗۡ֫;->ۙ:I

    .line 69
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v1, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 70
    invoke-virtual {p2, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 71
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 72
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 73
    iput v1, p0, Ll/ۙ᩷ܳ;->۫:I

    const p1, -0x5f000001

    const p2, 0x60ffffff

    .line 74
    invoke-static {p1, p2}, Ll/ۗۡ֫;->ۙ(II)I

    move-result p1

    and-int/2addr p1, v1

    iput p1, p0, Ll/ۙ᩷ܳ;->۟:I

    .line 77
    invoke-static {}, Ll/ۗۡ֫;->ۤ()Z

    move-result p1

    const p2, -0x777778

    const v0, -0x4f4f50

    if-eqz p1, :cond_1

    const p1, -0x56483a

    .line 78
    iput p1, p0, Ll/ۙ᩷ܳ;->ۢ:I

    const p1, -0xf6000

    .line 79
    iput p1, p0, Ll/ۙ᩷ܳ;->ۙ:I

    const p1, -0xd4d4d5

    .line 80
    iput p1, p0, Ll/ۙ᩷ܳ;->ۨ:I

    .line 81
    iput p1, p0, Ll/ۙ᩷ܳ;->ۛ:I

    .line 82
    iput p2, p0, Ll/ۙ᩷ܳ;->ۘ:I

    .line 83
    iput v0, p0, Ll/ۙ᩷ܳ;->ܺ:I

    const p1, -0xc9c7c6

    .line 84
    iput p1, p0, Ll/ۙ᩷ܳ;->᩺:I

    const p1, -0x888889

    .line 85
    iput p1, p0, Ll/ۙ᩷ܳ;->ܰ:I

    const p1, -0x99999a

    .line 86
    iput p1, p0, Ll/ۙ᩷ܳ;->۬:I

    const p1, -0xb8babb

    .line 87
    iput p1, p0, Ll/ۙ᩷ܳ;->ۤ:I

    return-void

    :cond_1
    const/high16 p1, -0x1000000

    .line 89
    iput p1, p0, Ll/ۙ᩷ܳ;->ۢ:I

    const p1, -0x229a00

    .line 90
    iput p1, p0, Ll/ۙ᩷ܳ;->ۙ:I

    const/4 p1, -0x1

    .line 91
    iput p1, p0, Ll/ۙ᩷ܳ;->ۨ:I

    const p1, -0x130c01

    .line 92
    iput p1, p0, Ll/ۙ᩷ܳ;->ۛ:I

    .line 93
    iput v0, p0, Ll/ۙ᩷ܳ;->ۘ:I

    .line 94
    iput p2, p0, Ll/ۙ᩷ܳ;->ܺ:I

    const p1, -0xf0f10

    .line 95
    iput p1, p0, Ll/ۙ᩷ܳ;->᩺:I

    const p1, -0x5f5f60

    .line 96
    iput p1, p0, Ll/ۙ᩷ܳ;->ܰ:I

    .line 97
    iput v0, p0, Ll/ۙ᩷ܳ;->۬:I

    const/16 p1, -0x51d

    .line 98
    iput p1, p0, Ll/ۙ᩷ܳ;->ۤ:I

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    .line 119
    iget v0, p0, Ll/ۙ᩷ܳ;->᩵:I

    invoke-virtual {p0, v0}, Ll/ۙ᩷ܳ;->ۙ(I)V

    return-void
.end method

.method public final ۙ(I)V
    .locals 8

    if-gtz p1, :cond_0

    goto :goto_2

    .line 88
    :cond_0
    iget-object v0, p0, Ll/ۙ᩷ܳ;->ۙۙ:Ll/ۨ᩷ܳ;

    iget-object v1, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-nez v1, :cond_1

    iget-object v1, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ܳ()I

    move-result v1

    goto :goto_0

    :cond_1
    iget v1, v1, Ll/ۗۙܳ;->ۙ:I

    .line 105
    :goto_0
    iget-object v2, p0, Ll/ۙ᩷ܳ;->᩸:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v2

    .line 106
    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->֫()Z

    move-result v3

    .line 107
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    const/4 v4, 0x1

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 108
    :goto_1
    iget v5, p0, Ll/ۙ᩷ܳ;->᩵:I

    if-ne v5, p1, :cond_3

    iget v5, p0, Ll/ۙ᩷ܳ;->ۗ:I

    if-ne v5, v1, :cond_3

    iget v5, p0, Ll/ۙ᩷ܳ;->ܶ:I

    if-ne v5, v2, :cond_3

    iget-boolean v5, p0, Ll/ۙ᩷ܳ;->ܽ:Z

    if-ne v5, v3, :cond_3

    iget-boolean v5, p0, Ll/ۙ᩷ܳ;->᩹:Z

    if-ne v5, v0, :cond_3

    :goto_2
    return-void

    .line 110
    :cond_3
    iput p1, p0, Ll/ۙ᩷ܳ;->᩵:I

    .line 111
    iput v1, p0, Ll/ۙ᩷ܳ;->ۗ:I

    .line 112
    iput v2, p0, Ll/ۙ᩷ܳ;->ܶ:I

    .line 113
    iput-boolean v3, p0, Ll/ۙ᩷ܳ;->ܽ:Z

    .line 114
    iput-boolean v0, p0, Ll/ۙ᩷ܳ;->᩹:Z

    const/high16 v5, 0x3fc00000    # 1.5f

    if-eqz v0, :cond_4

    int-to-float v0, p1

    goto :goto_3

    :cond_4
    int-to-float v0, p1

    .line 124
    iget v6, p0, Ll/ۙ᩷ܳ;->֫:F

    mul-float v6, v6, v5

    sub-float/2addr v0, v6

    :goto_3
    add-int/2addr v1, v4

    const/4 v6, 0x3

    .line 126
    invoke-static {v2, v6, v1, v4}, Ll/ۨ᩹ۧ;->ۙ(IIII)I

    move-result v1

    int-to-float v1, v1

    if-eqz v3, :cond_5

    int-to-float v2, v2

    add-float/2addr v2, v5

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    :goto_4
    add-float/2addr v1, v2

    int-to-float p1, p1

    div-float/2addr p1, v1

    .line 135
    iget-object v2, p0, Ll/ۙ᩷ܳ;->᩶:Ll/ۢܺۤ;

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    const-string v3, "0"

    .line 136
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    iput v5, p0, Ll/ۙ᩷ܳ;->᩷:F

    mul-float v5, v5, v1

    const v6, 0x3f8147ae    # 1.01f

    cmpl-float v5, v5, v0

    if-lez v5, :cond_7

    :cond_6
    div-float/2addr p1, v6

    .line 141
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 142
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    iput v5, p0, Ll/ۙ᩷ܳ;->᩷:F

    mul-float v5, v5, v1

    cmpl-float v5, v5, v0

    if-gtz v5, :cond_6

    goto :goto_6

    :cond_7
    :goto_5
    mul-float v5, p1, v6

    .line 150
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 151
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v7

    iput v7, p0, Ll/ۙ᩷ܳ;->᩷:F

    mul-float v7, v7, v1

    cmpg-float v7, v7, v0

    if-ltz v7, :cond_8

    .line 153
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 154
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    iput p1, p0, Ll/ۙ᩷ܳ;->᩷:F

    .line 159
    :goto_6
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object p1

    .line 160
    iget v0, p1, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget p1, p1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v0, p1

    float-to-int v0, v0

    add-int/2addr v0, v4

    iput v0, p0, Ll/ۙ᩷ܳ;->᩻:I

    neg-float p1, p1

    .line 161
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Ll/ۙ᩷ܳ;->ᩳ:I

    .line 163
    iget p1, p0, Ll/ۙ᩷ܳ;->᩷:F

    const v0, 0x3e6147ae    # 0.22f

    mul-float v0, v0, p1

    iput v0, p0, Ll/ۙ᩷ܳ;->ۜ:F

    const v0, 0x3e8a3d71    # 0.27f

    mul-float p1, p1, v0

    .line 164
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Ll/ۙ᩷ܳ;->۠:I

    return-void

    :cond_8
    move p1, v5

    goto :goto_5
.end method

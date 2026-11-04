.class public final Ll/ܽ᩹ܳ;
.super Landroid/view/View;
.source "E6CW"


# instance fields
.field public final ܰ:Landroid/graphics/Paint;

.field public final synthetic ܿ:Ll/ܶ᩹ܳ;

.field public final ᩶:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Ll/ܶ᩹ܳ;Landroid/content/Context;)V
    .locals 0

    .line 104
    iput-object p1, p0, Ll/ܽ᩹ܳ;->ܿ:Ll/ܶ᩹ܳ;

    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 101
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Ll/ܽ᩹ܳ;->ܰ:Landroid/graphics/Paint;

    .line 102
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Ll/ܽ᩹ܳ;->᩶:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 108
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 109
    iget-object v0, p0, Ll/ܽ᩹ܳ;->ܿ:Ll/ܶ᩹ܳ;

    invoke-static {v0}, Ll/ܶ᩹ܳ;->ۤ(Ll/ܶ᩹ܳ;)I

    move-result v1

    const/16 v2, 0x10

    mul-int/lit8 v1, v1, 0x10

    add-int/lit8 v1, v1, 0xc

    invoke-static {v0, v1}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v11, v3, v4

    const/4 v3, 0x7

    .line 110
    invoke-static {v0, v3}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v3

    int-to-float v12, v3

    .line 111
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    iget-object v13, p0, Ll/ܽ᩹ܳ;->ܰ:Landroid/graphics/Paint;

    invoke-virtual {v13, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 112
    sget-object v3, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    invoke-virtual {v13, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    const v3, -0xbcb4ab

    .line 113
    invoke-virtual {v13, v3}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v3, 0x1

    .line 114
    invoke-static {v0, v3}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v13, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 v4, 0x0

    const/4 v10, 0x0

    .line 115
    :goto_0
    invoke-static {v0}, Ll/ܶ᩹ܳ;->ۤ(Ll/ܶ᩹ܳ;)I

    move-result v4

    if-ge v10, v4, :cond_1

    .line 116
    invoke-static {v0}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;)I

    move-result v4

    shl-int v5, v3, v10

    and-int/2addr v4, v5

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    mul-int/lit8 v4, v10, 0x10

    add-int/lit8 v4, v4, 0xc

    .line 117
    invoke-static {v0, v4}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v4

    int-to-float v7, v4

    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v8, v4

    const/4 v6, 0x0

    move-object v4, p1

    move v5, v7

    move-object v9, v13

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 120
    :cond_1
    invoke-static {v0}, Ll/ܶ᩹ܳ;->ܳ(Ll/ܶ᩹ܳ;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 121
    invoke-static {v0}, Ll/ܶ᩹ܳ;->۫(Ll/ܶ᩹ܳ;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 122
    invoke-static {v0, v2}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v2

    int-to-float v2, v2

    sub-float v2, v1, v2

    .line 123
    invoke-static {v0}, Ll/ܶ᩹ܳ;->ۚ(Ll/ܶ᩹ܳ;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v8, v11

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    move v8, v3

    :goto_2
    const/4 v6, 0x0

    move-object v4, p1

    move v5, v2

    move v7, v2

    move-object v9, v13

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sub-float v8, v1, v12

    move-object v5, p1

    move v6, v2

    move v7, v11

    move v9, v11

    move-object v10, v13

    .line 124
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    sub-float v7, v11, v12

    move-object v3, p1

    move v4, v1

    move v6, v1

    move-object v8, v13

    .line 127
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 130
    :cond_4
    :goto_3
    invoke-static {v0}, Ll/ܶ᩹ܳ;->᩷(Ll/ܶ᩹ܳ;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {v0}, Ll/ܶ᩹ܳ;->᩸(Ll/ܶ᩹ܳ;)Z

    move-result v2

    if-eqz v2, :cond_5

    add-float v5, v11, v12

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v7, v2

    move-object v3, p1

    move v4, v1

    move v6, v1

    move-object v8, v13

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 131
    :cond_5
    invoke-static {v0}, Ll/ܶ᩹ܳ;->ᩴ(Ll/ܶ᩹ܳ;)I

    move-result v2

    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 132
    invoke-static {v0}, Ll/ܶ᩹ܳ;->᩷(Ll/ܶ᩹ܳ;)Z

    move-result v2

    const/high16 v3, 0x3fc00000    # 1.5f

    if-nez v2, :cond_6

    .line 133
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v13, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float v0, v0, v3

    invoke-virtual {p1, v1, v11, v0, v13}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void

    .line 137
    :cond_6
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 138
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float v2, v2, v3

    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 139
    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 140
    sget-object v2, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 141
    iget-object v2, p0, Ll/ܽ᩹ܳ;->᩶:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 142
    invoke-static {v0}, Ll/ܶ᩹ܳ;->᩸(Ll/ܶ᩹ܳ;)Z

    move-result v3

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-eqz v3, :cond_7

    .line 143
    invoke-static {v0, v4}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v3

    int-to-float v3, v3

    sub-float v3, v1, v3

    invoke-static {v0, v5}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v6

    int-to-float v6, v6

    sub-float v6, v11, v6

    invoke-virtual {v2, v3, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 144
    invoke-static {v0, v5}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v11

    invoke-virtual {v2, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 145
    invoke-static {v0, v4}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v1, v3

    invoke-static {v0, v5}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v11, v0

    invoke-virtual {v2, v1, v11}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_4

    .line 147
    :cond_7
    invoke-static {v0, v5}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v3

    int-to-float v3, v3

    sub-float v3, v1, v3

    invoke-static {v0, v4}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v6

    int-to-float v6, v6

    sub-float v6, v11, v6

    invoke-virtual {v2, v3, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 148
    invoke-static {v0, v5}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v1

    invoke-virtual {v2, v3, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 149
    invoke-static {v0, v5}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v1, v3

    invoke-static {v0, v4}, Ll/ܶ᩹ܳ;->ۙ(Ll/ܶ᩹ܳ;I)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v11, v0

    invoke-virtual {v2, v1, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 151
    :goto_4
    invoke-virtual {p1, v2, v13}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

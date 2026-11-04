.class public final Ll/᩷ᩴۙ;
.super Ll/᩶᩸ۙ;
.source "TB2A"


# instance fields
.field public ۟:Landroid/text/TextPaint;


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 12
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    move-object v0, p0

    move-object v1, p2

    move/from16 v7, p5

    move-object/from16 v8, p9

    .line 102
    instance-of v2, v1, Landroid/text/Spanned;

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    .line 103
    check-cast v1, Landroid/text/Spanned;

    .line 104
    const-class v2, Landroid/text/style/CharacterStyle;

    move v4, p3

    move/from16 v5, p4

    invoke-interface {v1, p3, v5, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/text/style/CharacterStyle;

    .line 105
    array-length v2, v1

    if-eqz v2, :cond_3

    array-length v2, v1

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v5, :cond_0

    aget-object v2, v1, v4

    if-ne v2, v0, :cond_0

    goto :goto_1

    .line 115
    :cond_0
    iget-object v2, v0, Ll/᩷ᩴۙ;->۟:Landroid/text/TextPaint;

    if-nez v2, :cond_1

    .line 117
    new-instance v2, Landroid/text/TextPaint;

    invoke-direct {v2}, Landroid/text/TextPaint;-><init>()V

    .line 118
    iput-object v2, v0, Ll/᩷ᩴۙ;->۟:Landroid/text/TextPaint;

    :cond_1
    move-object v3, v2

    .line 120
    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 122
    :goto_0
    array-length v2, v1

    if-ge v4, v2, :cond_5

    .line 123
    aget-object v2, v1, v4

    instance-of v5, v2, Landroid/text/style/MetricAffectingSpan;

    if-nez v5, :cond_2

    .line 125
    invoke-virtual {v2, v3}, Landroid/text/style/CharacterStyle;->updateDrawState(Landroid/text/TextPaint;)V

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 106
    :cond_3
    :goto_1
    instance-of v1, v8, Landroid/text/TextPaint;

    if-eqz v1, :cond_5

    .line 108
    move-object v3, v8

    check-cast v3, Landroid/text/TextPaint;

    goto :goto_2

    .line 130
    :cond_4
    instance-of v1, v8, Landroid/text/TextPaint;

    if-eqz v1, :cond_5

    .line 132
    move-object v3, v8

    check-cast v3, Landroid/text/TextPaint;

    :cond_5
    :goto_2
    move-object v9, v3

    if-eqz v9, :cond_6

    .line 60
    iget v1, v9, Landroid/text/TextPaint;->bgColor:I

    if-eqz v1, :cond_6

    .line 61
    invoke-virtual {p0}, Ll/᩶᩸ۙ;->᩷()I

    move-result v1

    int-to-float v1, v1

    add-float v4, v7, v1

    move/from16 v1, p6

    int-to-float v3, v1

    move/from16 v1, p8

    int-to-float v5, v1

    .line 72
    invoke-virtual {v9}, Landroid/graphics/Paint;->getColor()I

    move-result v10

    .line 73
    invoke-virtual {v9}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object v11

    .line 75
    iget v1, v9, Landroid/text/TextPaint;->bgColor:I

    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 76
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object v1, p1

    move/from16 v2, p5

    move-object v6, v9

    .line 77
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 79
    invoke-virtual {v9, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 80
    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 63
    :cond_6
    invoke-static {}, Ll/֫᩸ۙ;->᩸()Ll/֫᩸ۙ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    invoke-virtual {p0}, Ll/᩶᩸ۙ;->ۙ()Ll/ۙᩴۙ;

    move-result-object v1

    move/from16 v2, p7

    int-to-float v2, v2

    move-object v3, p1

    if-eqz v9, :cond_7

    move-object v8, v9

    :cond_7
    invoke-virtual {v1, p1, v7, v2, v8}, Ll/ۙᩴۙ;->ۙ(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;)V

    return-void
.end method

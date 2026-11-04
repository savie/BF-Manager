.class public final Ll/ۡܽ֫;
.super Ljava/lang/Object;
.source "K6IY"


# direct methods
.method public static ۙ(IZ[I)I
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x0

    if-ge p0, v0, :cond_0

    return v1

    .line 61
    :cond_0
    div-int/lit8 v0, p0, 0x2

    rem-int/lit8 v2, p0, 0x2

    add-int/2addr v2, v0

    const/4 v0, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v1, v2, :cond_3

    const/16 v4, 0xff

    if-eq v0, v4, :cond_3

    if-eqz p1, :cond_1

    add-int/lit8 v4, p0, -0x1

    sub-int/2addr v4, v1

    goto :goto_1

    :cond_1
    move v4, v1

    .line 63
    :goto_1
    aget v4, p2, v4

    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    move-result v4

    if-le v4, v0, :cond_2

    move v3, v1

    move v0, v4

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return v3
.end method

.method public static ۙ(Landroid/graphics/Bitmap;)[B
    .locals 18

    .line 18
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    .line 19
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    .line 21
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-array v15, v0, [I

    .line 22
    div-int/lit8 v5, v9, 0x2

    const/4 v10, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object v1, v15

    move v3, v8

    move v6, v8

    move v7, v10

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 v14, 0x0

    .line 23
    invoke-static {v8, v14, v15}, Ll/ۡܽ֫;->ۙ(IZ[I)I

    move-result v13

    const/4 v11, 0x1

    .line 24
    invoke-static {v8, v11, v15}, Ll/ۡܽ֫;->ۙ(IZ[I)I

    move-result v12

    .line 25
    div-int/lit8 v4, v8, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    move v3, v10

    move v7, v9

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 26
    invoke-static {v9, v14, v15}, Ll/ۡܽ֫;->ۙ(IZ[I)I

    move-result v0

    .line 27
    invoke-static {v9, v11, v15}, Ll/ۡܽ֫;->ۙ(IZ[I)I

    move-result v1

    sub-int/2addr v8, v13

    sub-int/2addr v8, v12

    sub-int/2addr v9, v0

    sub-int/2addr v9, v1

    .line 31
    div-int/lit8 v2, v9, 0x2

    add-int/2addr v2, v0

    const/16 v17, 0x1

    const/4 v3, 0x0

    move-object/from16 v10, p0

    move-object v11, v15

    move v4, v12

    move v12, v3

    move v3, v13

    move v13, v8

    const/4 v5, 0x0

    move v14, v3

    move-object v6, v15

    move v15, v2

    move/from16 v16, v8

    invoke-virtual/range {v10 .. v17}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 v2, 0x0

    const/4 v7, 0x0

    :goto_0
    const/16 v15, 0xff

    if-ge v2, v8, :cond_0

    if-eq v7, v15, :cond_0

    .line 75
    aget v10, v6, v2

    invoke-static {v10}, Landroid/graphics/Color;->alpha(I)I

    move-result v10

    invoke-static {v7, v10}, Ljava/lang/Math;->max(II)I

    move-result v7

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 33
    :cond_0
    div-int/lit8 v2, v8, 0x2

    add-int v14, v2, v3

    const/16 v16, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x1

    move-object/from16 v10, p0

    move-object v11, v6

    const/16 v2, 0xff

    move v15, v0

    move/from16 v17, v9

    invoke-virtual/range {v10 .. v17}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    if-ge v10, v9, :cond_1

    if-eq v11, v2, :cond_1

    .line 75
    aget v12, v6, v10

    invoke-static {v12}, Landroid/graphics/Color;->alpha(I)I

    move-result v12

    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    move-result v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 34
    :cond_1
    invoke-static {v7, v11}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 37
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v7

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v7, :cond_2

    add-int v13, v3, v8

    add-int v9, v0, v8

    move-object/from16 v10, p0

    .line 39
    invoke-virtual {v10, v13, v9}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v9

    aput v9, v6, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 41
    :cond_2
    invoke-static {v7, v5, v6}, Ll/ۡܽ֫;->ۙ(IZ[I)I

    move-result v5

    int-to-float v5, v5

    const v6, 0x405a8241    # 3.4142f

    mul-float v5, v5, v6

    .line 44
    new-instance v6, Ll/ۛۚۤ;

    const/16 v7, 0x18

    invoke-direct {v6, v7}, Ll/ۛۚۤ;-><init>(I)V

    .line 45
    invoke-virtual {v6, v3}, Ll/ۛۚۤ;->writeInt(I)V

    .line 46
    invoke-virtual {v6, v0}, Ll/ۛۚۤ;->writeInt(I)V

    .line 47
    invoke-virtual {v6, v4}, Ll/ۛۚۤ;->writeInt(I)V

    .line 48
    invoke-virtual {v6, v1}, Ll/ۛۚۤ;->writeInt(I)V

    .line 49
    invoke-virtual {v6, v5}, Ll/ۛۚۤ;->ۙ(F)V

    .line 50
    invoke-virtual {v6, v2}, Ll/ۛۚۤ;->writeInt(I)V

    .line 51
    invoke-virtual {v6}, Ll/ۛۚۤ;->۫()[B

    move-result-object v0

    return-object v0
.end method

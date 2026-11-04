.class public final Ll/ܳܶ֫;
.super Ljava/lang/Object;
.source "19LE"


# instance fields
.field public ۙ:Landroid/graphics/Bitmap;

.field public ᩷:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܳܶ֫;->᩷:Ljava/util/ArrayList;

    .line 28
    invoke-direct {p0, p1}, Ll/ܳܶ֫;->ۙ([B)V

    const/4 v0, 0x0

    .line 29
    array-length v1, p1

    invoke-static {p1, v0, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    return-void

    .line 31
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Decode bitmap failed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۙ(I[I)Ljava/util/ArrayList;
    .locals 7

    .line 349
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 350
    array-length v1, p1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    .line 354
    aget v5, p1, v3

    const/high16 v6, -0x1000000

    if-ne v5, v6, :cond_0

    if-nez v4, :cond_1

    const/4 v2, 0x1

    move v2, v3

    const/4 v4, 0x1

    goto :goto_1

    .line 360
    :cond_0
    invoke-static {v5, p0}, Ll/ܳܶ֫;->ۙ(II)Z

    move-result v5

    if-eqz v5, :cond_2

    if-eqz v4, :cond_1

    .line 363
    new-instance v4, Ll/᩺ܽ֫;

    invoke-direct {v4, v2, v3}, Ll/᩺ܽ֫;-><init>(II)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0

    :cond_3
    if-eqz v4, :cond_4

    .line 370
    new-instance p0, Ll/᩺ܽ֫;

    invoke-direct {p0, v2, v1}, Ll/᩺ܽ֫;-><init>(II)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v0
.end method

.method private ۙ([B)V
    .locals 6

    .line 36
    new-instance v0, Ll/᩵ۚۤ;

    invoke-direct {v0, p1}, Ll/᩵ۚۤ;-><init>([B)V

    const p1, 0x474e5089

    .line 37
    invoke-static {v0, p1}, Ll/ܽۚۤ;->ۙ(Ll/ܶۚۤ;I)V

    const p1, 0xa1a0a0d

    .line 38
    invoke-static {v0, p1}, Ll/ܽۚۤ;->ۙ(Ll/ܶۚۤ;I)V

    const/4 p1, 0x0

    .line 40
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ll/᩵ۚۤ;->available()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    .line 41
    invoke-virtual {v0}, Ll/᩵ۚۤ;->ܶ()I

    move-result v1

    .line 42
    new-instance v2, Ll/ۤܶ֫;

    invoke-direct {v2}, Ll/ۤܶ֫;-><init>()V

    .line 43
    invoke-virtual {v0}, Ll/᩵ۚۤ;->readInt()I

    move-result v3

    iput v3, v2, Ll/ۤܶ֫;->ۤ:I

    .line 211
    new-array v3, v1, [B

    .line 212
    invoke-virtual {v0, v1, v3}, Ll/᩵ۚۤ;->ۙ(I[B)V

    .line 44
    iput-object v3, v2, Ll/ۤܶ֫;->᩷:[B

    .line 45
    invoke-virtual {v0}, Ll/᩵ۚۤ;->ܶ()I

    move-result v1

    iput v1, v2, Ll/ۤܶ֫;->ۙ:I

    .line 46
    iget-object v1, p0, Ll/ܳܶ֫;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    iget v1, v2, Ll/ۤܶ֫;->ۤ:I

    const v2, 0x54414449

    if-ne v1, v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    return-void

    .line 52
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Data chunk not found"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۙ(II)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    .line 345
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result p0

    if-nez p0, :cond_0

    return v1

    :cond_0
    return v0

    :cond_1
    if-ne p0, p1, :cond_2

    return v1

    :cond_2
    return v0
.end method


# virtual methods
.method public final ۙ(Ljava/io/BufferedOutputStream;)V
    .locals 16

    move-object/from16 v0, p0

    .line 79
    iget-object v1, v0, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 80
    iget-object v2, v0, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    add-int/lit8 v3, v1, 0x2

    add-int/lit8 v4, v2, 0x2

    .line 81
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 82
    new-instance v10, Landroid/graphics/Canvas;

    invoke-direct {v10, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 83
    new-instance v11, Landroid/graphics/Paint;

    invoke-direct {v11}, Landroid/graphics/Paint;-><init>()V

    const/4 v4, 0x0

    .line 84
    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 85
    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 86
    iget-object v4, v0, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v10, v4, v5, v5, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 87
    invoke-virtual {v10, v5, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 88
    invoke-virtual/range {p0 .. p0}, Ll/ܳܶ֫;->᩸()Ll/ܿܽ֫;

    move-result-object v12

    if-eqz v12, :cond_5

    .line 89
    iget-object v13, v12, Ll/ܿܽ֫;->᩸:Ljava/util/ArrayList;

    iget-object v14, v12, Ll/ܿܽ֫;->ۤ:Ljava/util/ArrayList;

    const/high16 v4, -0x1000000

    .line 90
    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 91
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺ܽ֫;

    .line 92
    iget v5, v4, Ll/᩺ܽ֫;->᩶:I

    int-to-float v5, v5

    iget v4, v4, Ll/᩺ܽ֫;->ܰ:I

    int-to-float v7, v4

    const/4 v8, 0x0

    const/high16 v6, -0x40800000    # -1.0f

    move-object v4, v10

    move-object v9, v11

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺ܽ֫;

    .line 95
    iget v5, v4, Ll/᩺ܽ֫;->᩶:I

    int-to-float v6, v5

    iget v4, v4, Ll/᩺ܽ֫;->ܰ:I

    int-to-float v8, v4

    const/high16 v5, -0x40800000    # -1.0f

    const/4 v7, 0x0

    move-object v4, v10

    move-object v9, v11

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 97
    :cond_1
    iget-object v12, v12, Ll/ܿܽ֫;->᩷:Landroid/graphics/Rect;

    .line 98
    invoke-static {v14, v13, v1, v2}, Ll/ܿܽ֫;->ۙ(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Landroid/graphics/Rect;

    move-result-object v13

    .line 101
    iget v4, v12, Landroid/graphics/Rect;->left:I

    iget v5, v13, Landroid/graphics/Rect;->left:I

    if-ne v4, v5, :cond_2

    iget v5, v12, Landroid/graphics/Rect;->right:I

    iget v6, v13, Landroid/graphics/Rect;->right:I

    if-eq v5, v6, :cond_3

    :cond_2
    int-to-float v5, v4

    int-to-float v6, v2

    .line 102
    iget v4, v12, Landroid/graphics/Rect;->right:I

    sub-int v4, v1, v4

    int-to-float v7, v4

    add-int/lit8 v4, v2, 0x1

    int-to-float v8, v4

    move-object v4, v10

    move-object v9, v11

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 104
    :cond_3
    iget v4, v12, Landroid/graphics/Rect;->top:I

    iget v5, v13, Landroid/graphics/Rect;->top:I

    if-ne v4, v5, :cond_4

    iget v5, v12, Landroid/graphics/Rect;->bottom:I

    iget v6, v13, Landroid/graphics/Rect;->bottom:I

    if-eq v5, v6, :cond_5

    :cond_4
    int-to-float v5, v1

    int-to-float v6, v4

    add-int/lit8 v4, v1, 0x1

    int-to-float v7, v4

    .line 105
    iget v4, v12, Landroid/graphics/Rect;->bottom:I

    sub-int v4, v2, v4

    int-to-float v8, v4

    move-object v4, v10

    move-object v9, v11

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 108
    :cond_5
    invoke-virtual/range {p0 .. p0}, Ll/ܳܶ֫;->ᩴ()Ll/᩷ܶ֫;

    move-result-object v12

    if-eqz v12, :cond_6

    const/high16 v4, -0x10000

    .line 110
    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v13, v2

    .line 111
    iget v4, v12, Ll/᩷ܶ֫;->᩷:I

    int-to-float v7, v4

    add-int/lit8 v4, v2, 0x1

    int-to-float v14, v4

    const/4 v5, 0x0

    move-object v4, v10

    move v6, v13

    move v8, v14

    move-object v9, v11

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 112
    iget v4, v12, Ll/᩷ܶ֫;->ۤ:I

    sub-int v4, v1, v4

    int-to-float v5, v4

    int-to-float v15, v1

    move-object v4, v10

    move v7, v15

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v1, v1, 0x1

    int-to-float v1, v1

    .line 113
    iget v4, v12, Ll/᩷ܶ֫;->᩸:I

    int-to-float v8, v4

    const/4 v6, 0x0

    move-object v4, v10

    move v5, v15

    move v7, v1

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 114
    iget v4, v12, Ll/᩷ܶ֫;->ۙ:I

    sub-int/2addr v2, v4

    int-to-float v6, v2

    move-object v4, v10

    move v8, v13

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 116
    :cond_6
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    move-object/from16 v4, p1

    invoke-virtual {v3, v1, v2, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    return-void
.end method

.method public final ۙ(Ll/ܿܽ֫;)V
    .locals 7

    .line 161
    iget-object v0, p0, Ll/ܳܶ֫;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const v3, 0x54414449

    const/4 v4, 0x0

    const v5, 0x6c4f706e

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤܶ֫;

    .line 162
    iget v2, v2, Ll/ۤܶ֫;->ۤ:I

    if-ne v2, v5, :cond_0

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 166
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 167
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤܶ֫;

    iget v2, v2, Ll/ۤܶ֫;->ۤ:I

    if-ne v2, v3, :cond_2

    .line 168
    new-instance v2, Ll/ۤܶ֫;

    invoke-direct {v2}, Ll/ۤܶ֫;-><init>()V

    .line 169
    iput v5, v2, Ll/ۤܶ֫;->ۤ:I

    .line 170
    iget-object v5, p0, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    invoke-static {v5}, Ll/ۡܽ֫;->ۙ(Landroid/graphics/Bitmap;)[B

    move-result-object v5

    iput-object v5, v2, Ll/ۤܶ֫;->᩷:[B

    .line 171
    invoke-virtual {v2}, Ll/ۤܶ֫;->ۙ()V

    .line 172
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 138
    :cond_3
    :goto_1
    iget-object v1, p0, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v1}, Ll/ܿܽ֫;->ۙ(Landroid/graphics/Bitmap;)V

    .line 139
    iget-object v1, p0, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v1}, Ll/ܿܽ֫;->᩷(Landroid/graphics/Bitmap;)V

    .line 140
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const v5, 0x6354706e

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤܶ֫;

    .line 141
    iget v6, v2, Ll/ۤܶ֫;->ۤ:I

    if-ne v6, v5, :cond_4

    .line 142
    invoke-virtual {p1}, Ll/ܿܽ֫;->ۙ()[B

    move-result-object p1

    iput-object p1, v2, Ll/ۤܶ֫;->᩷:[B

    .line 143
    invoke-virtual {v2}, Ll/ۤܶ֫;->ۙ()V

    return-void

    .line 147
    :cond_5
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v4, v1, :cond_7

    .line 148
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤܶ֫;

    iget v1, v1, Ll/ۤܶ֫;->ۤ:I

    if-ne v1, v3, :cond_6

    .line 149
    new-instance v1, Ll/ۤܶ֫;

    invoke-direct {v1}, Ll/ۤܶ֫;-><init>()V

    .line 150
    iput v5, v1, Ll/ۤܶ֫;->ۤ:I

    .line 151
    invoke-virtual {p1}, Ll/ܿܽ֫;->ۙ()[B

    move-result-object p1

    iput-object p1, v1, Ll/ۤܶ֫;->᩷:[B

    .line 152
    invoke-virtual {v1}, Ll/ۤܶ֫;->ۙ()V

    .line 153
    invoke-virtual {v0, v4, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_7
    return-void
.end method

.method public final ۙ(Ll/᩷ܶ֫;)V
    .locals 5

    .line 191
    iget-object v0, p0, Ll/ܳܶ֫;->᩷:Ljava/util/ArrayList;

    if-nez p1, :cond_0

    .line 192
    new-instance p1, Ll/۠ۨᩴ;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ll/۠ۨᩴ;-><init>(I)V

    invoke-static {v0, p1}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    return-void

    .line 195
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const v3, 0x624c706e

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤܶ֫;

    .line 196
    iget v4, v2, Ll/ۤܶ֫;->ۤ:I

    if-ne v4, v3, :cond_1

    .line 197
    invoke-virtual {p1}, Ll/᩷ܶ֫;->ۙ()[B

    move-result-object p1

    iput-object p1, v2, Ll/ۤܶ֫;->᩷:[B

    .line 198
    invoke-virtual {v2}, Ll/ۤܶ֫;->ۙ()V

    return-void

    :cond_2
    const/4 v1, 0x0

    .line 202
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 203
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤܶ֫;

    iget v2, v2, Ll/ۤܶ֫;->ۤ:I

    const v4, 0x54414449

    if-ne v2, v4, :cond_3

    .line 204
    new-instance v2, Ll/ۤܶ֫;

    invoke-direct {v2}, Ll/ۤܶ֫;-><init>()V

    .line 205
    iput v3, v2, Ll/ۤܶ֫;->ۤ:I

    .line 206
    invoke-virtual {p1}, Ll/᩷ܶ֫;->ۙ()[B

    move-result-object p1

    iput-object p1, v2, Ll/ۤܶ֫;->᩷:[B

    .line 207
    invoke-virtual {v2}, Ll/ۤܶ֫;->ۙ()V

    .line 208
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final ۙ()Z
    .locals 29

    move-object/from16 v1, p0

    .line 224
    iget-object v0, v1, Ll/ܳܶ֫;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤܶ֫;

    .line 225
    iget v3, v3, Ll/ۤܶ֫;->ۤ:I

    const v4, 0x6354706e

    if-ne v3, v4, :cond_0

    goto/16 :goto_5

    .line 229
    :cond_1
    iget-object v2, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 230
    iget-object v3, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    const/4 v5, 0x3

    if-lt v2, v5, :cond_13

    if-ge v3, v5, :cond_2

    goto/16 :goto_5

    .line 235
    :cond_2
    iget-object v5, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {v5, v4, v4}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v5

    .line 236
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    if-nez v6, :cond_3

    const/4 v6, 0x0

    const/4 v13, 0x0

    goto :goto_0

    :cond_3
    const/4 v6, -0x1

    const/4 v13, -0x1

    .line 237
    :goto_0
    invoke-static {v5, v13}, Ll/ܳܶ֫;->ۙ(II)Z

    move-result v5

    if-nez v5, :cond_4

    goto/16 :goto_5

    .line 240
    :cond_4
    iget-object v5, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    add-int/lit8 v14, v3, -0x1

    invoke-virtual {v5, v4, v14}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v5

    invoke-static {v5, v13}, Ll/ܳܶ֫;->ۙ(II)Z

    move-result v5

    if-nez v5, :cond_5

    goto/16 :goto_5

    .line 243
    :cond_5
    iget-object v5, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    add-int/lit8 v15, v2, -0x1

    invoke-virtual {v5, v15, v4}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v4

    invoke-static {v4, v13}, Ll/ܳܶ֫;->ۙ(II)Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_5

    .line 246
    :cond_6
    iget-object v4, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {v4, v15, v14}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v4

    invoke-static {v4, v13}, Ll/ܳܶ֫;->ۙ(II)Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_5

    :cond_7
    add-int/lit8 v4, v2, -0x2

    .line 249
    new-array v12, v4, [I

    add-int/lit8 v11, v3, -0x2

    .line 250
    new-array v10, v11, [I

    .line 251
    iget-object v5, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/4 v7, 0x0

    const/4 v9, 0x1

    move-object v6, v12

    move v8, v2

    move-object/from16 v24, v10

    move/from16 v10, v16

    move/from16 v25, v11

    move v11, v4

    move-object/from16 v26, v0

    move-object v0, v12

    move/from16 v12, v17

    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 252
    iget-object v5, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    const/16 v21, 0x1

    const/16 v22, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    move-object/from16 v16, v5

    move-object/from16 v17, v24

    move/from16 v23, v25

    invoke-virtual/range {v16 .. v23}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 253
    invoke-static {v13, v0}, Ll/ܳܶ֫;->ۙ(I[I)Ljava/util/ArrayList;

    move-result-object v12

    move-object/from16 v11, v24

    .line 254
    invoke-static {v13, v11}, Ll/ܳܶ֫;->ۙ(I[I)Ljava/util/ArrayList;

    move-result-object v10

    if-eqz v12, :cond_13

    if-nez v10, :cond_8

    goto/16 :goto_5

    .line 258
    :cond_8
    iget-object v5, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    const/4 v9, 0x1

    const/16 v16, 0x1

    const/4 v7, 0x0

    move-object v6, v0

    move v8, v2

    move-object/from16 v27, v10

    move v10, v14

    move-object v14, v11

    move v11, v4

    move-object/from16 v28, v12

    move/from16 v12, v16

    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 259
    iget-object v5, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    const/16 v20, 0x1

    const/16 v21, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x1

    move v6, v15

    move-object v15, v5

    move-object/from16 v16, v14

    move/from16 v19, v6

    move/from16 v22, v25

    invoke-virtual/range {v15 .. v22}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 260
    new-instance v5, Ll/᩷ܶ֫;

    invoke-direct {v5}, Ll/᩷ܶ֫;-><init>()V

    .line 262
    invoke-static {v0}, Ll/۬۫ۗ;->stream([I)Ll/ܽܺۗ;

    move-result-object v6

    new-instance v7, Ll/᩸ܶ֫;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-interface {v6, v7}, Ll/ܽܺۗ;->allMatch(Ljava/util/function/IntPredicate;)Z

    move-result v6

    if-eqz v6, :cond_9

    goto/16 :goto_5

    .line 265
    :cond_9
    invoke-static {v14}, Ll/۬۫ۗ;->stream([I)Ll/ܽܺۗ;

    move-result-object v6

    new-instance v7, Ll/ᩴܶ֫;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-interface {v6, v7}, Ll/ܽܺۗ;->allMatch(Ljava/util/function/IntPredicate;)Z

    move-result v6

    if-eqz v6, :cond_a

    goto/16 :goto_5

    :cond_a
    const/4 v6, 0x0

    :goto_1
    const/high16 v7, -0x10000

    const/4 v8, 0x1

    if-ge v6, v4, :cond_b

    .line 269
    aget v9, v0, v6

    if-ne v9, v7, :cond_b

    .line 270
    aput v13, v0, v6

    .line 271
    iget v7, v5, Ll/᩷ܶ֫;->᩷:I

    add-int/2addr v7, v8

    iput v7, v5, Ll/᩷ܶ֫;->᩷:I

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_b
    add-int/lit8 v2, v2, -0x3

    :goto_2
    if-ltz v2, :cond_c

    .line 277
    aget v6, v0, v2

    if-ne v6, v7, :cond_c

    .line 278
    aput v13, v0, v2

    .line 279
    iget v6, v5, Ll/᩷ܶ֫;->ۤ:I

    add-int/2addr v6, v8

    iput v6, v5, Ll/᩷ܶ֫;->ۤ:I

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_c
    const/4 v2, 0x0

    move/from16 v6, v25

    :goto_3
    if-ge v2, v6, :cond_d

    .line 285
    aget v9, v14, v2

    if-ne v9, v7, :cond_d

    .line 286
    aput v13, v14, v2

    .line 287
    iget v9, v5, Ll/᩷ܶ֫;->᩸:I

    add-int/2addr v9, v8

    iput v9, v5, Ll/᩷ܶ֫;->᩸:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_d
    add-int/lit8 v3, v3, -0x3

    :goto_4
    if-ltz v3, :cond_e

    .line 293
    aget v2, v14, v3

    if-ne v2, v7, :cond_e

    .line 294
    aput v13, v14, v3

    .line 295
    iget v2, v5, Ll/᩷ܶ֫;->ۙ:I

    add-int/2addr v2, v8

    iput v2, v5, Ll/᩷ܶ֫;->ۙ:I

    add-int/lit8 v3, v3, -0x1

    goto :goto_4

    .line 33
    :cond_e
    iget v2, v5, Ll/᩷ܶ֫;->᩷:I

    if-nez v2, :cond_f

    iget v2, v5, Ll/᩷ܶ֫;->᩸:I

    if-nez v2, :cond_f

    iget v2, v5, Ll/᩷ܶ֫;->ۤ:I

    if-nez v2, :cond_f

    iget v2, v5, Ll/᩷ܶ֫;->ۙ:I

    if-nez v2, :cond_f

    const/4 v5, 0x0

    .line 303
    :cond_f
    invoke-static {v13, v0}, Ll/ܳܶ֫;->ۙ(I[I)Ljava/util/ArrayList;

    move-result-object v0

    .line 304
    invoke-static {v13, v14}, Ll/ܳܶ֫;->ۙ(I[I)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v0, :cond_13

    if-eqz v2, :cond_13

    .line 305
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-gt v3, v8, :cond_13

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-le v3, v8, :cond_10

    goto/16 :goto_5

    .line 308
    :cond_10
    new-instance v3, Ll/ܿܽ֫;

    invoke-direct {v3}, Ll/ܿܽ֫;-><init>()V

    .line 309
    iget-object v7, v3, Ll/ܿܽ֫;->ۤ:Ljava/util/ArrayList;

    move-object/from16 v9, v28

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 310
    iget-object v7, v3, Ll/ܿܽ֫;->᩸:Ljava/util/ArrayList;

    move-object/from16 v9, v27

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 192
    iget-object v7, v3, Ll/ܿܽ֫;->᩷:Landroid/graphics/Rect;

    iget-object v9, v3, Ll/ܿܽ֫;->ۤ:Ljava/util/ArrayList;

    iget-object v10, v3, Ll/ܿܽ֫;->᩸:Ljava/util/ArrayList;

    invoke-static {v9, v10, v4, v6}, Ll/ܿܽ֫;->ۙ(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Landroid/graphics/Rect;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 313
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_11

    const/4 v7, 0x0

    .line 314
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܽ֫;

    .line 315
    iget-object v7, v3, Ll/ܿܽ֫;->᩷:Landroid/graphics/Rect;

    iget v9, v0, Ll/᩺ܽ֫;->᩶:I

    iput v9, v7, Landroid/graphics/Rect;->left:I

    .line 316
    iget v0, v0, Ll/᩺ܽ֫;->ܰ:I

    sub-int v0, v4, v0

    iput v0, v7, Landroid/graphics/Rect;->right:I

    .line 318
    :cond_11
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    const/4 v0, 0x0

    .line 319
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܽ֫;

    .line 320
    iget-object v2, v3, Ll/ܿܽ֫;->᩷:Landroid/graphics/Rect;

    iget v7, v0, Ll/᩺ܽ֫;->᩶:I

    iput v7, v2, Landroid/graphics/Rect;->top:I

    .line 321
    iget v0, v0, Ll/᩺ܽ֫;->ܰ:I

    sub-int v11, v6, v0

    iput v11, v2, Landroid/graphics/Rect;->bottom:I

    .line 323
    :cond_12
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v6, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 324
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 325
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    const/4 v6, 0x0

    .line 326
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 327
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 328
    iget-object v6, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    const/high16 v7, -0x40800000    # -1.0f

    invoke-virtual {v2, v6, v7, v7, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 329
    iput-object v0, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    .line 331
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 332
    iget-object v2, v1, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v6, 0x64

    invoke-virtual {v2, v4, v6, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 333
    invoke-virtual/range {v26 .. v26}, Ljava/util/ArrayList;->clear()V

    .line 334
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ܳܶ֫;->ۙ([B)V

    .line 335
    invoke-virtual {v1, v3}, Ll/ܳܶ֫;->ۙ(Ll/ܿܽ֫;)V

    .line 336
    invoke-virtual {v1, v5}, Ll/ܳܶ֫;->ۙ(Ll/᩷ܶ֫;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v8

    :catch_0
    move-exception v0

    .line 338
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :cond_13
    :goto_5
    const/4 v0, 0x0

    return v0
.end method

.method public final ۤ()Landroid/graphics/Bitmap;
    .locals 1

    .line 376
    iget-object v0, p0, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final ܳ()Z
    .locals 3

    .line 215
    iget-object v0, p0, Ll/ܳܶ֫;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤܶ֫;

    .line 216
    iget v1, v1, Ll/ۤܶ֫;->ۤ:I

    const v2, 0x6354706e

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩴ()Ll/᩷ܶ֫;
    .locals 4

    .line 180
    iget-object v0, p0, Ll/ܳܶ֫;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤܶ֫;

    .line 181
    iget v2, v1, Ll/ۤܶ֫;->ۤ:I

    const v3, 0x624c706e

    if-ne v2, v3, :cond_0

    .line 182
    new-instance v0, Ll/᩷ܶ֫;

    invoke-direct {v0}, Ll/᩷ܶ֫;-><init>()V

    .line 183
    iget-object v1, v1, Ll/ۤܶ֫;->᩷:[B

    .line 15
    new-instance v2, Ll/᩵ۚۤ;

    invoke-direct {v2, v1}, Ll/᩵ۚۤ;-><init>([B)V

    .line 16
    invoke-virtual {v2}, Ll/᩵ۚۤ;->readInt()I

    move-result v1

    iput v1, v0, Ll/᩷ܶ֫;->᩷:I

    .line 17
    invoke-virtual {v2}, Ll/᩵ۚۤ;->readInt()I

    move-result v1

    iput v1, v0, Ll/᩷ܶ֫;->᩸:I

    .line 18
    invoke-virtual {v2}, Ll/᩵ۚۤ;->readInt()I

    move-result v1

    iput v1, v0, Ll/᩷ܶ֫;->ۤ:I

    .line 19
    invoke-virtual {v2}, Ll/᩵ۚۤ;->readInt()I

    move-result v1

    iput v1, v0, Ll/᩷ܶ֫;->ۙ:I

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩷()[B
    .locals 4

    .line 58
    iget-object v0, p0, Ll/ܳܶ֫;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/16 v2, 0x8

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤܶ֫;

    .line 59
    iget-object v3, v3, Ll/ۤܶ֫;->᩷:[B

    array-length v3, v3

    add-int/lit8 v3, v3, 0xc

    add-int/2addr v2, v3

    goto :goto_0

    .line 61
    :cond_0
    new-instance v1, Ll/ۛۚۤ;

    invoke-direct {v1, v2}, Ll/ۛۚۤ;-><init>(I)V

    const v2, 0x474e5089

    .line 68
    invoke-virtual {v1, v2}, Ll/ۛۚۤ;->writeInt(I)V

    const v2, 0xa1a0a0d

    .line 69
    invoke-virtual {v1, v2}, Ll/ۛۚۤ;->writeInt(I)V

    .line 70
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤܶ֫;

    .line 71
    iget-object v3, v2, Ll/ۤܶ֫;->᩷:[B

    array-length v3, v3

    invoke-virtual {v1, v3}, Ll/ۛۚۤ;->᩷(I)V

    .line 72
    iget v3, v2, Ll/ۤܶ֫;->ۤ:I

    invoke-virtual {v1, v3}, Ll/ۛۚۤ;->writeInt(I)V

    .line 73
    iget-object v3, v2, Ll/ۤܶ֫;->᩷:[B

    invoke-virtual {v1, v3}, Ll/ۛۚۤ;->write([B)V

    .line 74
    iget v2, v2, Ll/ۤܶ֫;->ۙ:I

    invoke-virtual {v1, v2}, Ll/ۛۚۤ;->᩷(I)V

    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {v1}, Ll/ۛۚۤ;->᩷()[B

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()Ll/ܿܽ֫;
    .locals 11

    .line 121
    iget-object v0, p0, Ll/ܳܶ֫;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤܶ֫;

    .line 122
    iget v2, v1, Ll/ۤܶ֫;->ۤ:I

    const v3, 0x6354706e

    if-ne v2, v3, :cond_0

    .line 123
    new-instance v0, Ll/ܿܽ֫;

    invoke-direct {v0}, Ll/ܿܽ֫;-><init>()V

    .line 124
    iget-object v1, v1, Ll/ۤܶ֫;->᩷:[B

    .line 38
    new-instance v2, Ll/᩵ۚۤ;

    invoke-direct {v2, v1}, Ll/᩵ۚۤ;-><init>([B)V

    const/4 v1, 0x1

    .line 39
    invoke-virtual {v2, v1}, Ll/᩵ۚۤ;->skipBytes(I)V

    .line 40
    invoke-virtual {v2}, Ll/᩵ۚۤ;->readByte()B

    move-result v1

    .line 41
    invoke-virtual {v2}, Ll/᩵ۚۤ;->readByte()B

    move-result v3

    .line 42
    invoke-virtual {v2}, Ll/᩵ۚۤ;->readByte()B

    move-result v4

    .line 43
    invoke-virtual {v2}, Ll/᩵ۚۤ;->readInt()I

    move-result v5

    .line 44
    invoke-virtual {v2}, Ll/᩵ۚۤ;->readInt()I

    move-result v6

    .line 45
    iget-object v7, v0, Ll/ܿܽ֫;->᩷:Landroid/graphics/Rect;

    invoke-virtual {v2}, Ll/᩵ۚۤ;->ܶ()I

    move-result v8

    iput v8, v7, Landroid/graphics/Rect;->left:I

    .line 46
    invoke-virtual {v2}, Ll/᩵ۚۤ;->ܶ()I

    move-result v8

    iput v8, v7, Landroid/graphics/Rect;->right:I

    .line 47
    invoke-virtual {v2}, Ll/᩵ۚۤ;->ܶ()I

    move-result v8

    iput v8, v7, Landroid/graphics/Rect;->top:I

    .line 48
    invoke-virtual {v2}, Ll/᩵ۚۤ;->ܶ()I

    move-result v8

    iput v8, v7, Landroid/graphics/Rect;->bottom:I

    .line 49
    invoke-virtual {v2}, Ll/᩵ۚۤ;->readInt()I

    move-result v7

    int-to-long v8, v5

    .line 50
    invoke-virtual {v2, v8, v9}, Ll/᩵ۚۤ;->seek(J)V

    .line 51
    div-int/lit8 v1, v1, 0x2

    :goto_0
    if-lez v1, :cond_1

    .line 52
    iget-object v5, v0, Ll/ܿܽ֫;->ۤ:Ljava/util/ArrayList;

    new-instance v8, Ll/᩺ܽ֫;

    invoke-virtual {v2}, Ll/᩵ۚۤ;->ܶ()I

    move-result v9

    invoke-virtual {v2}, Ll/᩵ۚۤ;->ܶ()I

    move-result v10

    invoke-direct {v8, v9, v10}, Ll/᩺ܽ֫;-><init>(II)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    int-to-long v5, v6

    .line 54
    invoke-virtual {v2, v5, v6}, Ll/᩵ۚۤ;->seek(J)V

    .line 55
    div-int/lit8 v3, v3, 0x2

    :goto_1
    if-lez v3, :cond_2

    .line 56
    iget-object v1, v0, Ll/ܿܽ֫;->᩸:Ljava/util/ArrayList;

    new-instance v5, Ll/᩺ܽ֫;

    invoke-virtual {v2}, Ll/᩵ۚۤ;->ܶ()I

    move-result v6

    invoke-virtual {v2}, Ll/᩵ۚۤ;->ܶ()I

    move-result v8

    invoke-direct {v5, v6, v8}, Ll/᩺ܽ֫;-><init>(II)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_2
    int-to-long v5, v7

    .line 58
    invoke-virtual {v2, v5, v6}, Ll/᩵ۚۤ;->seek(J)V

    .line 59
    new-array v1, v4, [I

    iput-object v1, v0, Ll/ܿܽ֫;->ۙ:[I

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v4, :cond_3

    .line 61
    iget-object v3, v0, Ll/ܿܽ֫;->ۙ:[I

    invoke-virtual {v2}, Ll/᩵ۚۤ;->ܶ()I

    move-result v5

    aput v5, v3, v1

    add-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    goto :goto_2

    .line 125
    :cond_3
    iget-object v1, p0, Ll/ܳܶ֫;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ll/ܿܽ֫;->ۙ(Landroid/graphics/Bitmap;)V

    return-object v0

    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.class public final Ll/ۘۜܺ;
.super Ljava/lang/Object;
.source "TB7B"


# static fields
.field public static ܽ:Ljava/util/HashSet;


# instance fields
.field public ֫:Ljava/util/Stack;

.field public final ۙ:Ll/֫ۖܺ;

.field public ۚ:F

.field public final ۤ:Landroid/graphics/Matrix;

.field public ۧ:Ljava/util/Stack;

.field public ۫:Ll/֫ۜܺ;

.field public final ܳ:Z

.field public ܺ:Ljava/util/Stack;

.field public ᩴ:Landroid/graphics/Canvas;

.field public final ᩷:Landroid/graphics/Matrix;

.field public final ᩸:[F

.field public ᩻:Ll/᩵ۜܺ;


# direct methods
.method public constructor <init>(Landroid/graphics/Canvas;Z)V
    .locals 2

    .line 215
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/ۘۜܺ;->ۤ:Landroid/graphics/Matrix;

    .line 108
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/ۘۜܺ;->᩷:Landroid/graphics/Matrix;

    const/16 v0, 0x8

    new-array v0, v0, [F

    .line 109
    iput-object v0, p0, Ll/ۘۜܺ;->᩸:[F

    .line 110
    new-instance v0, Ll/֫ۖܺ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Ll/֫ۖܺ;-><init>(FFFF)V

    iput-object v0, p0, Ll/ۘۜܺ;->ۙ:Ll/֫ۖܺ;

    .line 216
    iput-object p1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    const/high16 p1, 0x42c00000    # 96.0f

    .line 217
    iput p1, p0, Ll/ۘۜܺ;->ۚ:F

    .line 218
    iput-boolean p2, p0, Ll/ۘۜܺ;->ܳ:Z

    return-void
.end method

.method private ֫()V
    .locals 1

    .line 413
    iget-object v0, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 415
    iget-object v0, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ۜܺ;

    iput-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    return-void
.end method

.method private ۙ(Ll/ۙۜܺ;)F
    .locals 1

    .line 1810
    new-instance v0, Ll/᩺ۜܺ;

    invoke-direct {v0, p0}, Ll/᩺ۜܺ;-><init>(Ll/ۘۜܺ;)V

    .line 1811
    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;Ll/ۛۜܺ;)V

    .line 1812
    iget p1, v0, Ll/᩺ۜܺ;->᩷:F

    return p1
.end method

.method public static ۙ(F)I
    .locals 1

    const/high16 v0, 0x43800000    # 256.0f

    mul-float p0, p0, v0

    float-to-int p0, p0

    if-gez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/16 v0, 0xff

    if-le p0, v0, :cond_1

    return v0

    :cond_1
    return p0
.end method

.method public static ۙ(FI)I
    .locals 2

    shr-int/lit8 v0, p1, 0x18

    const/16 v1, 0xff

    and-int/2addr v0, v1

    int-to-float v0, v0

    mul-float v0, v0, p0

    .line 2553
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p0

    if-gez p0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    if-le p0, v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, p0

    :goto_0
    shl-int/lit8 p0, v1, 0x18

    const v0, 0xffffff

    and-int/2addr p1, v0

    or-int/2addr p0, p1

    return p0
.end method

.method public static bridge synthetic ۙ(Ll/ۘۜܺ;)Landroid/graphics/Canvas;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    return-object p0
.end method

.method public static ۙ(Ll/֫ۖܺ;Ll/֫ۖܺ;Ll/۫ۖܺ;)Landroid/graphics/Matrix;
    .locals 9

    .line 2116
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    if-eqz p2, :cond_5

    .line 2118
    invoke-virtual {p2}, Ll/۫ۖܺ;->ۙ()Ll/ᩴۖܺ;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_5

    .line 2121
    :cond_0
    iget v1, p0, Ll/֫ۖܺ;->᩸:F

    iget v2, p1, Ll/֫ۖܺ;->᩸:F

    div-float/2addr v1, v2

    .line 2122
    iget v2, p0, Ll/֫ۖܺ;->ۙ:F

    iget v3, p1, Ll/֫ۖܺ;->ۙ:F

    div-float/2addr v2, v3

    .line 2123
    iget v3, p1, Ll/֫ۖܺ;->᩷:F

    neg-float v3, v3

    .line 2124
    iget v4, p1, Ll/֫ۖܺ;->ۤ:F

    neg-float v4, v4

    .line 2127
    sget-object v5, Ll/۫ۖܺ;->᩸:Ll/۫ۖܺ;

    invoke-virtual {p2, v5}, Ll/۫ۖܺ;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 2129
    iget p1, p0, Ll/֫ۖܺ;->᩷:F

    iget p0, p0, Ll/֫ۖܺ;->ۤ:F

    invoke-virtual {v0, p1, p0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 2130
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 2131
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    return-object v0

    .line 2137
    :cond_1
    invoke-virtual {p2}, Ll/۫ۖܺ;->᩷()Ll/ܳۖܺ;

    move-result-object v5

    sget-object v6, Ll/ܳۖܺ;->ܿ:Ll/ܳۖܺ;

    if-ne v5, v6, :cond_2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 2139
    :goto_0
    iget v2, p0, Ll/֫ۖܺ;->᩸:F

    div-float/2addr v2, v1

    .line 2140
    iget v5, p0, Ll/֫ۖܺ;->ۙ:F

    div-float/2addr v5, v1

    .line 2142
    sget-object v6, Ll/ۧۜܺ;->ۙ:[I

    invoke-virtual {p2}, Ll/۫ۖܺ;->ۙ()Ll/ᩴۖܺ;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v6, v7

    const/high16 v8, 0x40000000    # 2.0f

    packed-switch v7, :pswitch_data_0

    goto :goto_2

    .line 2152
    :pswitch_0
    iget v7, p1, Ll/֫ۖܺ;->᩸:F

    sub-float/2addr v7, v2

    goto :goto_1

    .line 2147
    :pswitch_1
    iget v7, p1, Ll/֫ۖܺ;->᩸:F

    sub-float/2addr v7, v2

    div-float/2addr v7, v8

    :goto_1
    sub-float/2addr v3, v7

    .line 2159
    :goto_2
    invoke-virtual {p2}, Ll/۫ۖܺ;->ۙ()Ll/ᩴۖܺ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v6, p2

    const/4 v2, 0x2

    if-eq p2, v2, :cond_4

    const/4 v2, 0x3

    if-eq p2, v2, :cond_3

    const/4 v2, 0x5

    if-eq p2, v2, :cond_4

    const/4 v2, 0x6

    if-eq p2, v2, :cond_3

    const/4 v2, 0x7

    if-eq p2, v2, :cond_4

    const/16 v2, 0x8

    if-eq p2, v2, :cond_3

    goto :goto_4

    .line 2169
    :cond_3
    iget p1, p1, Ll/֫ۖܺ;->ۙ:F

    sub-float/2addr p1, v5

    goto :goto_3

    .line 2164
    :cond_4
    iget p1, p1, Ll/֫ۖܺ;->ۙ:F

    sub-float/2addr p1, v5

    div-float/2addr p1, v8

    :goto_3
    sub-float/2addr v4, p1

    .line 2176
    :goto_4
    iget p1, p0, Ll/֫ۖܺ;->᩷:F

    iget p0, p0, Ll/֫ۖܺ;->ۤ:F

    invoke-virtual {v0, p1, p0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 2177
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 2178
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    :cond_5
    :goto_5
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ۙ(Ll/ۗۖܺ;)Landroid/graphics/Path;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 4351
    iget-object v2, v1, Ll/ۗۖܺ;->᩹:Ll/ܿۖܺ;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 4352
    :goto_0
    iget-object v3, v1, Ll/ۗۖܺ;->ۗ:Ll/ܿۖܺ;

    if-eqz v3, :cond_1

    invoke-virtual {v3, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v3

    move v11, v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    const/4 v11, 0x0

    .line 4353
    :goto_1
    iget-object v3, v1, Ll/ۗۖܺ;->᩵:Ll/ܿۖܺ;

    invoke-virtual {v3, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v3

    .line 4354
    iget-object v4, v1, Ll/ۗۖܺ;->ۨ:Ll/ܿۖܺ;

    invoke-virtual {v4, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v4

    sub-float v12, v2, v3

    sub-float v13, v11, v4

    add-float v14, v2, v3

    add-float v15, v11, v4

    .line 4361
    iget-object v5, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v5, :cond_2

    .line 4362
    new-instance v5, Ll/֫ۖܺ;

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v7, v3, v6

    mul-float v6, v6, v4

    invoke-direct {v5, v12, v13, v7, v6}, Ll/֫ۖܺ;-><init>(FFFF)V

    iput-object v5, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    :cond_2
    const v1, 0x3f0d6289

    mul-float v16, v3, v1

    mul-float v1, v1, v4

    .line 4368
    new-instance v3, Landroid/graphics/Path;

    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    .line 4369
    invoke-virtual {v3, v2, v13}, Landroid/graphics/Path;->moveTo(FF)V

    add-float v17, v2, v16

    sub-float v18, v11, v1

    move-object v4, v3

    move/from16 v5, v17

    move v6, v13

    move v7, v14

    move/from16 v8, v18

    move v9, v14

    move v10, v11

    .line 4370
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-float/2addr v1, v11

    move-object/from16 v19, v3

    move v4, v14

    move v5, v1

    move/from16 v6, v17

    move v7, v15

    move v8, v2

    move v9, v15

    .line 4371
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    sub-float v14, v2, v16

    move-object/from16 v4, v19

    move v5, v14

    move v6, v15

    move v7, v12

    move v8, v1

    move v9, v12

    .line 4372
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move v4, v12

    move/from16 v5, v18

    move v6, v14

    move v7, v13

    move v8, v2

    move v9, v13

    .line 4373
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 4374
    invoke-virtual/range {v19 .. v19}, Landroid/graphics/Path;->close()V

    return-object v19
.end method

.method private ۙ(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)Landroid/graphics/Path;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .line 3777
    iget-object p1, p1, Ll/ܿ۠ܺ;->ۙ:Ll/֫ۜܺ;

    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->᩶:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object p1

    if-nez p1, :cond_0

    .line 3779
    iget-object p1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object p1, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object p1, p1, Ll/᩹۠ܺ;->᩶:Ljava/lang/String;

    const/4 p1, 0x0

    return-object p1

    .line 3783
    :cond_0
    check-cast p1, Ll/ܺۖܺ;

    .line 3786
    iget-object v0, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    iget-object v1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3790
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ܰ۠ܺ;)Ll/᩵ۜܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    .line 3792
    iget-object v0, p1, Ll/ܺۖܺ;->᩹:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 3793
    :goto_1
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    if-nez v0, :cond_3

    .line 3796
    iget v0, p2, Ll/֫ۖܺ;->᩷:F

    iget v2, p2, Ll/֫ۖܺ;->ۤ:F

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 3797
    iget v0, p2, Ll/֫ۖܺ;->᩸:F

    iget p2, p2, Ll/֫ۖܺ;->ۙ:F

    invoke-virtual {v1, v0, p2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 3799
    :cond_3
    iget-object p2, p1, Ll/᩺ۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz p2, :cond_4

    .line 3801
    invoke-virtual {v1, p2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 3804
    :cond_4
    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    .line 3805
    iget-object v0, p1, Ll/ۨ۠ܺ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ۠ܺ;

    .line 3807
    instance-of v3, v2, Ll/ۘ۠ܺ;

    if-nez v3, :cond_6

    goto :goto_2

    .line 3809
    :cond_6
    check-cast v2, Ll/ۘ۠ܺ;

    invoke-direct {p0, v2}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;)Landroid/graphics/Path;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 3811
    sget-object v3, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    invoke-virtual {p2, v2, v3}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    goto :goto_2

    .line 3815
    :cond_7
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->᩶:Ljava/lang/String;

    if-eqz v0, :cond_9

    .line 3817
    iget-object v0, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v0, :cond_8

    .line 3818
    invoke-static {p2}, Ll/ۘۜܺ;->ۙ(Landroid/graphics/Path;)Ll/֫ۖܺ;

    move-result-object v0

    iput-object v0, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    .line 3819
    :cond_8
    iget-object v0, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)Landroid/graphics/Path;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 3821
    sget-object v0, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 3824
    :cond_9
    invoke-virtual {p2, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 3827
    iget-object p1, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۜܺ;

    iput-object p1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    return-object p2
.end method

.method public static ۙ(Ll/۬ۖܺ;)Landroid/graphics/Path;
    .locals 5

    .line 4381
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4383
    iget-object v1, p0, Ll/۬ۖܺ;->᩹:[F

    const/4 v2, 0x0

    aget v2, v1, v2

    const/4 v3, 0x1

    aget v1, v1, v3

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    const/4 v1, 0x2

    .line 4384
    :goto_0
    iget-object v2, p0, Ll/۬ۖܺ;->᩹:[F

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 4385
    aget v3, v2, v1

    add-int/lit8 v4, v1, 0x1

    aget v2, v2, v4

    invoke-virtual {v0, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 4387
    :cond_0
    instance-of v1, p0, Ll/ۙ۠ܺ;

    if-eqz v1, :cond_1

    .line 4388
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 4390
    :cond_1
    iget-object v1, p0, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v1, :cond_2

    .line 4391
    invoke-static {v0}, Ll/ۘۜܺ;->ۙ(Landroid/graphics/Path;)Ll/֫ۖܺ;

    move-result-object v1

    iput-object v1, p0, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    :cond_2
    return-object v0
.end method

.method private ۙ(Ll/᩷۠ܺ;)Landroid/graphics/Path;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 4263
    iget-object v2, v1, Ll/᩷۠ܺ;->ۗ:Ll/ܿۖܺ;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object v4, v1, Ll/᩷۠ܺ;->᩵:Ll/ܿۖܺ;

    if-nez v4, :cond_0

    const/4 v2, 0x0

    const/4 v4, 0x0

    goto :goto_1

    :cond_0
    if-nez v2, :cond_1

    .line 4267
    iget-object v2, v1, Ll/᩷۠ܺ;->᩵:Ll/ܿۖܺ;

    invoke-virtual {v2, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v2

    goto :goto_0

    .line 4268
    :cond_1
    iget-object v4, v1, Ll/᩷۠ܺ;->᩵:Ll/ܿۖܺ;

    if-nez v4, :cond_2

    .line 4269
    invoke-virtual {v2, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v2

    :goto_0
    move v4, v2

    goto :goto_1

    .line 4271
    :cond_2
    invoke-virtual {v2, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v2

    .line 4272
    iget-object v4, v1, Ll/᩷۠ܺ;->᩵:Ll/ܿۖܺ;

    invoke-virtual {v4, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v4

    .line 4274
    :goto_1
    iget-object v5, v1, Ll/᩷۠ܺ;->ۨ:Ll/ܿۖܺ;

    invoke-virtual {v5, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 4275
    iget-object v5, v1, Ll/᩷۠ܺ;->᩹:Ll/ܿۖܺ;

    invoke-virtual {v5, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v5

    div-float/2addr v5, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 4276
    iget-object v5, v1, Ll/᩷۠ܺ;->ۛ:Ll/ܿۖܺ;

    if-eqz v5, :cond_3

    invoke-virtual {v5, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v5

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    .line 4277
    :goto_2
    iget-object v6, v1, Ll/᩷۠ܺ;->᩺:Ll/ܿۖܺ;

    if-eqz v6, :cond_4

    invoke-virtual {v6, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v6

    move v13, v6

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    const/4 v13, 0x0

    .line 4278
    :goto_3
    iget-object v6, v1, Ll/᩷۠ܺ;->ۨ:Ll/ܿۖܺ;

    invoke-virtual {v6, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v6

    .line 4279
    iget-object v7, v1, Ll/᩷۠ܺ;->᩹:Ll/ܿۖܺ;

    invoke-virtual {v7, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v7

    .line 4281
    iget-object v8, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v8, :cond_5

    .line 4282
    new-instance v8, Ll/֫ۖܺ;

    invoke-direct {v8, v5, v13, v6, v7}, Ll/֫ۖܺ;-><init>(FFFF)V

    iput-object v8, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    :cond_5
    add-float v15, v6, v5

    add-float v1, v13, v7

    .line 4288
    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    cmpl-float v6, v2, v3

    if-eqz v6, :cond_7

    cmpl-float v3, v4, v3

    if-nez v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const v3, 0x3f0d6289

    mul-float v16, v2, v3

    mul-float v3, v3, v4

    add-float v12, v13, v4

    .line 4306
    invoke-virtual {v14, v5, v12}, Landroid/graphics/Path;->moveTo(FF)V

    sub-float v17, v12, v3

    add-float v11, v5, v2

    sub-float v21, v11, v16

    move-object v6, v14

    move v7, v5

    move/from16 v8, v17

    move/from16 v9, v21

    move v10, v13

    move/from16 p1, v11

    move/from16 v22, v12

    move v12, v13

    .line 4307
    invoke-virtual/range {v6 .. v12}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    sub-float v2, v15, v2

    .line 4308
    invoke-virtual {v14, v2, v13}, Landroid/graphics/Path;->lineTo(FF)V

    add-float v6, v2, v16

    move-object v7, v14

    move v8, v6

    move v9, v13

    move v10, v15

    move/from16 v11, v17

    move v12, v15

    move/from16 v13, v22

    .line 4309
    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    sub-float v12, v1, v4

    .line 4310
    invoke-virtual {v14, v15, v12}, Landroid/graphics/Path;->lineTo(FF)V

    add-float v10, v12, v3

    move-object v3, v14

    move/from16 v16, v10

    move/from16 v17, v6

    move/from16 v18, v1

    move/from16 v19, v2

    move/from16 v20, v1

    .line 4311
    invoke-virtual/range {v14 .. v20}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move/from16 v2, p1

    .line 4312
    invoke-virtual {v3, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    move-object v6, v3

    move/from16 v7, v21

    move v8, v1

    move v9, v5

    move v11, v5

    .line 4313
    invoke-virtual/range {v6 .. v12}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 4314
    invoke-virtual {v3, v5, v13}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_5

    :cond_7
    :goto_4
    move-object v3, v14

    .line 4292
    invoke-virtual {v3, v5, v13}, Landroid/graphics/Path;->moveTo(FF)V

    .line 4293
    invoke-virtual {v3, v15, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 4294
    invoke-virtual {v3, v15, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 4295
    invoke-virtual {v3, v5, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 4296
    invoke-virtual {v3, v5, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 4316
    :goto_5
    invoke-virtual {v3}, Landroid/graphics/Path;->close()V

    return-object v3
.end method

.method private ۙ(Ll/᩻ۖܺ;)Landroid/graphics/Path;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 4323
    iget-object v2, v1, Ll/᩻ۖܺ;->᩹:Ll/ܿۖܺ;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 4324
    :goto_0
    iget-object v3, v1, Ll/᩻ۖܺ;->ۗ:Ll/ܿۖܺ;

    if-eqz v3, :cond_1

    invoke-virtual {v3, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v3

    move v11, v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    const/4 v11, 0x0

    .line 4325
    :goto_1
    iget-object v3, v1, Ll/᩻ۖܺ;->᩵:Ll/ܿۖܺ;

    invoke-virtual {v3, v0}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;)F

    move-result v3

    sub-float v12, v2, v3

    sub-float v13, v11, v3

    add-float v14, v2, v3

    add-float v15, v11, v3

    .line 4332
    iget-object v4, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v4, :cond_2

    .line 4333
    new-instance v4, Ll/֫ۖܺ;

    const/high16 v5, 0x40000000    # 2.0f

    mul-float v5, v5, v3

    invoke-direct {v4, v12, v13, v5, v5}, Ll/֫ۖܺ;-><init>(FFFF)V

    iput-object v4, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    :cond_2
    const v1, 0x3f0d6289

    mul-float v1, v1, v3

    .line 4338
    new-instance v3, Landroid/graphics/Path;

    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    .line 4339
    invoke-virtual {v3, v2, v13}, Landroid/graphics/Path;->moveTo(FF)V

    add-float v16, v2, v1

    sub-float v17, v11, v1

    move-object v4, v3

    move/from16 v5, v16

    move v6, v13

    move v7, v14

    move/from16 v8, v17

    move v9, v14

    move v10, v11

    .line 4340
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-float v10, v11, v1

    move-object/from16 v18, v3

    move v4, v14

    move v5, v10

    move/from16 v6, v16

    move v7, v15

    move v8, v2

    move v9, v15

    .line 4341
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    sub-float v1, v2, v1

    move-object/from16 v4, v18

    move v5, v1

    move v6, v15

    move v7, v12

    move v8, v10

    move v9, v12

    move v10, v11

    .line 4342
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move v4, v12

    move/from16 v5, v17

    move v6, v1

    move v7, v13

    move v8, v2

    move v9, v13

    .line 4343
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 4344
    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Path;->close()V

    return-object v18
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/Integer;Ll/۫۠ܺ;)Landroid/graphics/Typeface;
    .locals 2

    .line 2522
    sget-object v0, Ll/۫۠ܺ;->᩶:Ll/۫۠ܺ;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 2523
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x1f4

    if-le p1, v0, :cond_2

    if-eqz p2, :cond_1

    const/4 p1, 0x3

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_3

    const/4 p1, 0x2

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    .line 2526
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p2

    sparse-switch p2, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string p2, "cursive"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    const/4 v1, 0x4

    goto :goto_3

    :sswitch_1
    const-string p2, "serif"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_2

    :cond_5
    const/4 v1, 0x3

    goto :goto_3

    :sswitch_2
    const-string p2, "fantasy"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_2

    :cond_6
    const/4 v1, 0x2

    goto :goto_3

    :sswitch_3
    const-string p2, "monospace"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_2

    :cond_7
    const/4 v1, 0x1

    goto :goto_3

    :sswitch_4
    const-string p2, "sans-serif"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    :goto_2
    const/4 v1, -0x1

    :cond_8
    :goto_3
    packed-switch v1, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    .line 2534
    :pswitch_0
    sget-object p0, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    invoke-static {p0, p1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    .line 2528
    :pswitch_1
    sget-object p0, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    invoke-static {p0, p1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    .line 2536
    :pswitch_2
    sget-object p0, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    invoke-static {p0, p1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    .line 2532
    :pswitch_3
    sget-object p0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-static {p0, p1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    .line 2530
    :pswitch_4
    sget-object p0, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    invoke-static {p0, p1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5b97f43d -> :sswitch_4
        -0x5559f3fd -> :sswitch_3
        -0x407a00da -> :sswitch_2
        0x684317d -> :sswitch_1
        0x432c41c5 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private ۙ(Ljava/lang/String;ZZ)Ljava/lang/String;
    .locals 3

    .line 1919
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v0, v0, Ll/᩵ۜܺ;->᩸:Z

    const-string v1, " "

    if-eqz v0, :cond_0

    const-string p2, "[\\n\\t]"

    .line 1920
    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "\\n"

    const-string v2, ""

    .line 1923
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\\t"

    .line 1924
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_1

    const-string p2, "^\\s+"

    .line 1927
    invoke-virtual {p1, p2, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    if-eqz p3, :cond_2

    const-string p2, "\\s+$"

    .line 1929
    invoke-virtual {p1, p2, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_2
    const-string p2, "\\s{2,}"

    .line 1930
    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static ۙ(Landroid/graphics/Path;)Ll/֫ۖܺ;
    .locals 4

    .line 1183
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    const/4 v1, 0x1

    .line 1184
    invoke-virtual {p0, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 1185
    new-instance p0, Ll/֫ۖܺ;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget v2, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    invoke-direct {p0, v1, v2, v3, v0}, Ll/֫ۖܺ;-><init>(FFFF)V

    return-object p0
.end method

.method private ۙ(Ll/ܿۖܺ;Ll/ܿۖܺ;Ll/ܿۖܺ;Ll/ܿۖܺ;)Ll/֫ۖܺ;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 648
    invoke-virtual {p1, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p2, :cond_1

    .line 649
    invoke-virtual {p2, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v0

    .line 651
    :cond_1
    invoke-virtual {p0}, Ll/ۘۜܺ;->ۤ()Ll/֫ۖܺ;

    move-result-object p2

    if-eqz p3, :cond_2

    .line 652
    invoke-virtual {p3, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result p3

    goto :goto_1

    :cond_2
    iget p3, p2, Ll/֫ۖܺ;->᩸:F

    :goto_1
    if-eqz p4, :cond_3

    .line 653
    invoke-virtual {p4, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result p2

    goto :goto_2

    :cond_3
    iget p2, p2, Ll/֫ۖܺ;->ۙ:F

    .line 655
    :goto_2
    new-instance p4, Ll/֫ۖܺ;

    invoke-direct {p4, p1, v0, p3, p2}, Ll/֫ۖܺ;-><init>(FFFF)V

    return-object p4
.end method

.method private ۙ(Ll/ܰ۠ܺ;)Ll/᩵ۜܺ;
    .locals 2

    .line 3311
    new-instance v0, Ll/᩵ۜܺ;

    invoke-direct {v0}, Ll/᩵ۜܺ;-><init>()V

    .line 3312
    invoke-static {}, Ll/᩹۠ܺ;->ۙ()Ll/᩹۠ܺ;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/᩹۠ܺ;)V

    .line 3313
    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->ۙ(Ll/ܿ۠ܺ;Ll/᩵ۜܺ;)V

    return-object v0
.end method

.method private ۙ(FFFF)V
    .locals 1

    add-float/2addr p3, p1

    add-float/2addr p4, p2

    .line 2575
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ܰ:Ll/ۧۖܺ;

    if-eqz v0, :cond_0

    .line 2576
    iget-object v0, v0, Ll/ۧۖܺ;->᩷:Ll/ܿۖܺ;

    invoke-virtual {v0, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v0

    add-float/2addr p1, v0

    .line 2577
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ܰ:Ll/ۧۖܺ;

    iget-object v0, v0, Ll/ۧۖܺ;->᩸:Ll/ܿۖܺ;

    invoke-virtual {v0, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v0

    add-float/2addr p2, v0

    .line 2578
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ܰ:Ll/ۧۖܺ;

    iget-object v0, v0, Ll/ۧۖܺ;->ۤ:Ll/ܿۖܺ;

    invoke-virtual {v0, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v0

    sub-float/2addr p3, v0

    .line 2579
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ܰ:Ll/ۧۖܺ;

    iget-object v0, v0, Ll/ۧۖܺ;->ۙ:Ll/ܿۖܺ;

    invoke-virtual {v0, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v0

    sub-float/2addr p4, v0

    .line 2582
    :cond_0
    iget-object v0, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    return-void
.end method

.method public static ۙ(FFFFFZZFFLl/۠ۖܺ;)V
    .locals 32

    move/from16 v0, p4

    move/from16 v1, p6

    move/from16 v2, p7

    move/from16 v3, p8

    cmpl-float v4, p0, v2

    if-nez v4, :cond_0

    cmpl-float v4, p1, v3

    if-nez v4, :cond_0

    goto/16 :goto_7

    :cond_0
    const/4 v4, 0x0

    cmpl-float v5, p2, v4

    if-eqz v5, :cond_d

    cmpl-float v4, p3, v4

    if-nez v4, :cond_1

    goto/16 :goto_8

    .line 2708
    :cond_1
    invoke-static/range {p2 .. p2}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 2709
    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(F)F

    move-result v5

    float-to-double v6, v0

    const-wide v8, 0x4076800000000000L    # 360.0

    rem-double/2addr v6, v8

    .line 2712
    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    .line 2713
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    .line 2714
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    sub-float v10, p0, v2

    float-to-double v10, v10

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    div-double/2addr v10, v12

    sub-float v14, p1, v3

    float-to-double v14, v14

    div-double/2addr v14, v12

    mul-double v16, v8, v10

    mul-double v18, v6, v14

    add-double v12, v18, v16

    neg-double v2, v6

    mul-double v2, v2, v10

    mul-double v14, v14, v8

    add-double/2addr v14, v2

    mul-float v2, v4, v4

    float-to-double v2, v2

    mul-float v10, v5, v5

    float-to-double v10, v10

    mul-double v16, v12, v12

    mul-double v18, v14, v14

    div-double v20, v16, v2

    div-double v22, v18, v10

    add-double v22, v22, v20

    const-wide v20, 0x3fefffeb074a771dL    # 0.99999

    cmpl-double v24, v22, v20

    if-lez v24, :cond_2

    .line 2739
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    const-wide v10, 0x3ff0000a7c5ac472L    # 1.00001

    mul-double v2, v2, v10

    float-to-double v10, v4

    mul-double v10, v10, v2

    double-to-float v4, v10

    float-to-double v10, v5

    mul-double v2, v2, v10

    double-to-float v5, v2

    mul-float v2, v4, v4

    float-to-double v2, v2

    mul-float v10, v5, v5

    float-to-double v10, v10

    :cond_2
    const-wide/high16 v20, -0x4010000000000000L    # -1.0

    const-wide/high16 v22, 0x3ff0000000000000L    # 1.0

    move/from16 v0, p5

    if-ne v0, v1, :cond_3

    move-wide/from16 v24, v20

    goto :goto_0

    :cond_3
    move-wide/from16 v24, v22

    :goto_0
    mul-double v26, v2, v10

    mul-double v2, v2, v18

    sub-double v26, v26, v2

    mul-double v10, v10, v16

    sub-double v26, v26, v10

    add-double/2addr v2, v10

    div-double v26, v26, v2

    const-wide/16 v2, 0x0

    cmpg-double v0, v26, v2

    if-gez v0, :cond_4

    move-wide/from16 v26, v2

    .line 2750
    :cond_4
    invoke-static/range {v26 .. v27}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    mul-double v10, v10, v24

    float-to-double v2, v4

    mul-double v18, v2, v14

    float-to-double v0, v5

    div-double v18, v18, v0

    mul-double v18, v18, v10

    mul-double v24, v0, v12

    move/from16 v26, v4

    move/from16 v27, v5

    div-double v4, v24, v2

    neg-double v4, v4

    mul-double v10, v10, v4

    move/from16 v4, p7

    add-float v5, p0, v4

    float-to-double v4, v5

    const-wide/high16 v24, 0x4000000000000000L    # 2.0

    div-double v4, v4, v24

    move-wide/from16 v28, v0

    move/from16 v0, p8

    add-float v1, p1, v0

    float-to-double v0, v1

    div-double v0, v0, v24

    mul-double v24, v8, v18

    mul-double v30, v6, v10

    sub-double v24, v24, v30

    add-double v4, v24, v4

    mul-double v6, v6, v18

    mul-double v8, v8, v10

    add-double/2addr v8, v6

    add-double/2addr v8, v0

    sub-double v0, v12, v18

    div-double/2addr v0, v2

    sub-double v6, v14, v10

    div-double v6, v6, v28

    neg-double v12, v12

    sub-double v12, v12, v18

    div-double/2addr v12, v2

    neg-double v2, v14

    sub-double/2addr v2, v10

    div-double v2, v2, v28

    mul-double v10, v0, v0

    mul-double v14, v6, v6

    add-double/2addr v14, v10

    .line 2774
    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    const-wide/16 v16, 0x0

    cmpg-double v18, v6, v16

    if-gez v18, :cond_5

    move-wide/from16 v18, v20

    goto :goto_1

    :cond_5
    move-wide/from16 v18, v22

    :goto_1
    div-double v10, v0, v10

    .line 2777
    invoke-static {v10, v11}, Ljava/lang/Math;->acos(D)D

    move-result-wide v10

    mul-double v10, v10, v18

    mul-double v18, v12, v12

    mul-double v24, v2, v2

    add-double v24, v24, v18

    mul-double v24, v24, v14

    .line 2780
    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v14

    mul-double v18, v0, v12

    mul-double v24, v6, v2

    add-double v24, v24, v18

    mul-double v0, v0, v2

    mul-double v6, v6, v12

    sub-double/2addr v0, v6

    const-wide/16 v2, 0x0

    cmpg-double v6, v0, v2

    if-gez v6, :cond_6

    move-wide/from16 v0, v20

    goto :goto_2

    :cond_6
    move-wide/from16 v0, v22

    :goto_2
    div-double v24, v24, v14

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    cmpg-double v6, v24, v20

    if-gez v6, :cond_7

    move-wide v6, v2

    goto :goto_3

    :cond_7
    cmpl-double v6, v24, v22

    if-lez v6, :cond_8

    const-wide/16 v6, 0x0

    goto :goto_3

    .line 2824
    :cond_8
    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->acos(D)D

    move-result-wide v6

    :goto_3
    mul-double v0, v0, v6

    const-wide v6, 0x401921fb54442d18L    # 6.283185307179586

    const-wide/16 v12, 0x0

    if-nez p6, :cond_9

    cmpl-double v14, v0, v12

    if-lez v14, :cond_9

    sub-double/2addr v0, v6

    goto :goto_4

    :cond_9
    if-eqz p6, :cond_a

    cmpg-double v14, v0, v12

    if-gez v14, :cond_a

    add-double/2addr v0, v6

    :cond_a
    :goto_4
    rem-double/2addr v0, v6

    rem-double/2addr v10, v6

    .line 2844
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    mul-double v6, v6, v12

    div-double/2addr v6, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    int-to-double v6, v2

    div-double/2addr v0, v6

    div-double v6, v0, v12

    .line 2849
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v12

    const-wide v14, 0x3ff5555555555555L    # 1.3333333333333333

    mul-double v12, v12, v14

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    add-double v6, v6, v22

    div-double/2addr v12, v6

    mul-int/lit8 v3, v2, 0x6

    .line 2851
    new-array v6, v3, [F

    const/4 v7, 0x0

    const/4 v14, 0x0

    :goto_5
    if-ge v7, v2, :cond_b

    move v15, v2

    move/from16 p0, v3

    int-to-double v2, v7

    mul-double v2, v2, v0

    add-double/2addr v2, v10

    .line 2858
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v16

    .line 2859
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v18

    add-int/lit8 v20, v14, 0x1

    mul-double v21, v12, v18

    move-wide/from16 p1, v10

    sub-double v10, v16, v21

    double-to-float v10, v10

    .line 2861
    aput v10, v6, v14

    add-int/lit8 v10, v14, 0x2

    mul-double v16, v16, v12

    move-wide/from16 v21, v8

    add-double v8, v16, v18

    double-to-float v8, v8

    .line 2862
    aput v8, v6, v20

    add-double/2addr v2, v0

    .line 2865
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    .line 2866
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    add-int/lit8 v11, v14, 0x3

    mul-double v16, v12, v2

    move-wide/from16 p5, v0

    add-double v0, v16, v8

    double-to-float v0, v0

    .line 2867
    aput v0, v6, v10

    add-int/lit8 v0, v14, 0x4

    mul-double v16, v12, v8

    move-wide/from16 v18, v12

    sub-double v12, v2, v16

    double-to-float v1, v12

    .line 2868
    aput v1, v6, v11

    add-int/lit8 v1, v14, 0x5

    double-to-float v8, v8

    .line 2870
    aput v8, v6, v0

    add-int/lit8 v14, v14, 0x6

    double-to-float v0, v2

    .line 2871
    aput v0, v6, v1

    add-int/lit8 v7, v7, 0x1

    move/from16 v3, p0

    move-wide/from16 v10, p1

    move-wide/from16 v0, p5

    move v2, v15

    move-wide/from16 v12, v18

    move-wide/from16 v8, v21

    goto :goto_5

    :cond_b
    move/from16 p0, v3

    move-wide/from16 v21, v8

    .line 2799
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    move/from16 v1, v26

    move/from16 v2, v27

    .line 2800
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    move/from16 v1, p4

    .line 2801
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    double-to-float v1, v4

    double-to-float v2, v8

    .line 2802
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 2803
    invoke-virtual {v0, v6}, Landroid/graphics/Matrix;->mapPoints([F)V

    add-int/lit8 v3, p0, -0x2

    move/from16 v0, p7

    .line 2809
    aput v0, v6, v3

    add-int/lit8 v3, p0, -0x1

    move/from16 v1, p8

    .line 2810
    aput v1, v6, v3

    const/4 v0, 0x0

    move/from16 v2, p0

    :goto_6
    if-ge v0, v2, :cond_c

    .line 2815
    aget v1, v6, v0

    add-int/lit8 v3, v0, 0x1

    aget v3, v6, v3

    add-int/lit8 v4, v0, 0x2

    aget v4, v6, v4

    add-int/lit8 v5, v0, 0x3

    aget v5, v6, v5

    add-int/lit8 v7, v0, 0x4

    aget v7, v6, v7

    add-int/lit8 v8, v0, 0x5

    aget v8, v6, v8

    move-object/from16 p0, p9

    move/from16 p1, v1

    move/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v7

    move/from16 p6, v8

    invoke-interface/range {p0 .. p6}, Ll/۠ۖܺ;->ۙ(FFFFFF)V

    add-int/lit8 v0, v0, 0x6

    goto :goto_6

    :cond_c
    :goto_7
    return-void

    :cond_d
    :goto_8
    move v0, v2

    move v1, v3

    move-object/from16 v2, p9

    .line 2703
    invoke-interface {v2, v0, v1}, Ll/۠ۖܺ;->᩷(FF)V

    return-void
.end method

.method private ۙ(Ll/֫ۖܺ;)V
    .locals 7

    .line 842
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ᩴۙ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 849
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 850
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 851
    iget-object v1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    const/4 v3, 0x0

    const/16 v4, 0x1f

    invoke-virtual {v1, v3, v0, v4}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 854
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 856
    new-instance v5, Landroid/graphics/ColorMatrix;

    const/16 v6, 0x14

    new-array v6, v6, [F

    fill-array-data v6, :array_0

    invoke-direct {v5, v6}, Landroid/graphics/ColorMatrix;-><init>([F)V

    .line 860
    new-instance v6, Landroid/graphics/ColorMatrixColorFilter;

    invoke-direct {v6, v5}, Landroid/graphics/ColorMatrixColorFilter;-><init>(Landroid/graphics/ColorMatrix;)V

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 861
    invoke-virtual {v1, v3, v0, v4}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 864
    iget-object v0, p0, Ll/ۘۜܺ;->۫:Ll/֫ۜܺ;

    iget-object v5, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v5, v5, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v5, v5, Ll/᩹۠ܺ;->ᩴۙ:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object v0

    .line 865
    check-cast v0, Ll/ᩳۖܺ;

    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ᩳۖܺ;Ll/֫ۖܺ;)V

    .line 868
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 871
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 872
    new-instance v6, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {v6, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 873
    invoke-virtual {v1, v3, v5, v4}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 876
    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ᩳۖܺ;Ll/֫ۖܺ;)V

    .line 879
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 882
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 885
    :cond_0
    invoke-direct {p0}, Ll/ۘۜܺ;->֫()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3e59ce07    # 0.2127f
        0x3f3710cb    # 0.7151f
        0x3d93dd98    # 0.0722f
        0x0
        0x0
    .end array-data
.end method

.method private ۙ(Ll/ۗ۠ܺ;Ll/֫ۖܺ;Ll/֫ۖܺ;Ll/۫ۖܺ;)V
    .locals 3

    .line 604
    iget v0, p2, Ll/֫ۖܺ;->᩸:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_7

    iget v0, p2, Ll/֫ۖܺ;->ۙ:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    if-nez p4, :cond_2

    .line 609
    iget-object p4, p1, Ll/۟۠ܺ;->ܶ:Ll/۫ۖܺ;

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    sget-object p4, Ll/۫ۖܺ;->ۤ:Ll/۫ۖܺ;

    .line 611
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 613
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    .line 616
    :cond_3
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iput-object p2, v0, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    .line 618
    iget-object p2, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object p2, p2, Ll/᩹۠ܺ;->۫ۙ:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_4

    .line 619
    iget-object p2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object p2, p2, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    iget v0, p2, Ll/֫ۖܺ;->᩷:F

    iget v1, p2, Ll/֫ۖܺ;->ۤ:F

    iget v2, p2, Ll/֫ۖܺ;->᩸:F

    iget p2, p2, Ll/֫ۖܺ;->ۙ:F

    invoke-direct {p0, v0, v1, v2, p2}, Ll/ۘۜܺ;->ۙ(FFFF)V

    .line 622
    :cond_4
    iget-object p2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object p2, p2, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, p2}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 624
    iget-object p2, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    if-eqz p3, :cond_5

    .line 625
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    invoke-static {v0, p3, p4}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;Ll/֫ۖܺ;Ll/۫ۖܺ;)Landroid/graphics/Matrix;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 626
    iget-object p2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object p3, p1, Ll/ۢ۠ܺ;->᩹:Ll/֫ۖܺ;

    iput-object p3, p2, Ll/᩵ۜܺ;->۫:Ll/֫ۖܺ;

    goto :goto_1

    .line 628
    :cond_5
    iget-object p3, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object p3, p3, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    iget p4, p3, Ll/֫ۖܺ;->᩷:F

    iget p3, p3, Ll/֫ۖܺ;->ۤ:F

    invoke-virtual {p2, p4, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 631
    :goto_1
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result p2

    .line 634
    invoke-direct {p0}, Ll/ۘۜܺ;->᩻()V

    const/4 p3, 0x1

    .line 636
    invoke-direct {p0, p1, p3}, Ll/ۘۜܺ;->ۙ(Ll/ۨ۠ܺ;Z)V

    if-eqz p2, :cond_6

    .line 831
    iget-object p2, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p2}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;)V

    .line 641
    :cond_6
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    :cond_7
    :goto_2
    return-void
.end method

.method private ۙ(Ll/ۘ۠ܺ;)V
    .locals 3

    .line 3355
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ۢ:Ll/֡۠ܺ;

    instance-of v1, v0, Ll/֨ۖܺ;

    if-eqz v1, :cond_0

    .line 3356
    iget-object v1, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    check-cast v0, Ll/֨ۖܺ;

    const/4 v2, 0x1

    invoke-direct {p0, v2, v1, v0}, Ll/ۘۜܺ;->ۙ(ZLl/֫ۖܺ;Ll/֨ۖܺ;)V

    .line 3358
    :cond_0
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ܽۙ:Ll/֡۠ܺ;

    instance-of v1, v0, Ll/֨ۖܺ;

    if-eqz v1, :cond_1

    .line 3359
    iget-object p1, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    check-cast v0, Ll/֨ۖܺ;

    const/4 v1, 0x0

    invoke-direct {p0, v1, p1, v0}, Ll/ۘۜܺ;->ۙ(ZLl/֫ۖܺ;Ll/֨ۖܺ;)V

    :cond_1
    return-void
.end method

.method private ۙ(Ll/ۘ۠ܺ;Landroid/graphics/Path;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 488
    iget-object v3, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v3, v3, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v3, v3, Ll/᩹۠ܺ;->ۢ:Ll/֡۠ܺ;

    instance-of v4, v3, Ll/֨ۖܺ;

    iget-object v5, v0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    if-eqz v4, :cond_1d

    .line 490
    iget-object v4, v0, Ll/ۘۜܺ;->۫:Ll/֫ۜܺ;

    check-cast v3, Ll/֨ۖܺ;

    iget-object v3, v3, Ll/֨ۖܺ;->᩶:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object v3

    .line 491
    instance-of v4, v3, Ll/ۜۖܺ;

    if-eqz v4, :cond_1d

    .line 492
    check-cast v3, Ll/ۜۖܺ;

    .line 4440
    iget-object v4, v3, Ll/ۜۖܺ;->᩺:Ljava/lang/Boolean;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 4444
    :goto_0
    iget-object v6, v3, Ll/ۜۖܺ;->᩵:Ljava/lang/String;

    if-eqz v6, :cond_1

    .line 4445
    invoke-static {v3, v6}, Ll/ۘۜܺ;->ۙ(Ll/ۜۖܺ;Ljava/lang/String;)V

    :cond_1
    const/4 v6, 0x0

    if-eqz v4, :cond_6

    .line 4449
    iget-object v4, v3, Ll/ۜۖܺ;->ܰ:Ll/ܿۖܺ;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v4

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    .line 4450
    :goto_1
    iget-object v7, v3, Ll/ۜۖܺ;->᩶:Ll/ܿۖܺ;

    if-eqz v7, :cond_3

    invoke-virtual {v7, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v7

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    .line 4451
    :goto_2
    iget-object v8, v3, Ll/ۜۖܺ;->ۘ:Ll/ܿۖܺ;

    if-eqz v8, :cond_4

    invoke-virtual {v8, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v8

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    .line 4452
    :goto_3
    iget-object v9, v3, Ll/ۜۖܺ;->ۗ:Ll/ܿۖܺ;

    if-eqz v9, :cond_5

    invoke-virtual {v9, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v9

    goto :goto_8

    :cond_5
    const/4 v9, 0x0

    goto :goto_8

    .line 4457
    :cond_6
    iget-object v4, v3, Ll/ۜۖܺ;->ܰ:Ll/ܿۖܺ;

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v4, :cond_7

    invoke-virtual {v4, v0, v7}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v4

    goto :goto_4

    :cond_7
    const/4 v4, 0x0

    .line 4458
    :goto_4
    iget-object v8, v3, Ll/ۜۖܺ;->᩶:Ll/ܿۖܺ;

    if-eqz v8, :cond_8

    invoke-virtual {v8, v0, v7}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v8

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    .line 4459
    :goto_5
    iget-object v9, v3, Ll/ۜۖܺ;->ۘ:Ll/ܿۖܺ;

    if-eqz v9, :cond_9

    invoke-virtual {v9, v0, v7}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v9

    goto :goto_6

    :cond_9
    const/4 v9, 0x0

    .line 4460
    :goto_6
    iget-object v10, v3, Ll/ۜۖܺ;->ۗ:Ll/ܿۖܺ;

    if-eqz v10, :cond_a

    invoke-virtual {v10, v0, v7}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v7

    goto :goto_7

    :cond_a
    const/4 v7, 0x0

    .line 4461
    :goto_7
    iget-object v10, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    iget v11, v10, Ll/֫ۖܺ;->᩷:F

    iget v12, v10, Ll/֫ۖܺ;->᩸:F

    mul-float v4, v4, v12

    add-float/2addr v4, v11

    .line 4462
    iget v11, v10, Ll/֫ۖܺ;->ۤ:F

    iget v10, v10, Ll/֫ۖܺ;->ۙ:F

    mul-float v8, v8, v10

    add-float/2addr v8, v11

    mul-float v9, v9, v12

    mul-float v7, v7, v10

    move/from16 v19, v9

    move v9, v7

    move v7, v8

    move/from16 v8, v19

    :goto_8
    cmpl-float v10, v8, v6

    if-eqz v10, :cond_1c

    cmpl-float v6, v9, v6

    if-nez v6, :cond_b

    goto/16 :goto_12

    .line 4470
    :cond_b
    iget-object v6, v3, Ll/۟۠ܺ;->ܶ:Ll/۫ۖܺ;

    if-eqz v6, :cond_c

    goto :goto_9

    :cond_c
    sget-object v6, Ll/۫ۖܺ;->ۤ:Ll/۫ۖܺ;

    .line 4473
    :goto_9
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->ۧ()V

    .line 4475
    invoke-virtual {v5, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 4478
    new-instance v2, Ll/᩵ۜܺ;

    invoke-direct {v2}, Ll/᩵ۜܺ;-><init>()V

    .line 4479
    invoke-static {}, Ll/᩹۠ܺ;->ۙ()Ll/᩹۠ܺ;

    move-result-object v10

    invoke-direct {v0, v2, v10}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/᩹۠ܺ;)V

    .line 4480
    iget-object v10, v2, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v11, v10, Ll/᩹۠ܺ;->۫ۙ:Ljava/lang/Boolean;

    .line 4483
    invoke-direct {v0, v3, v2}, Ll/ۘۜܺ;->ۙ(Ll/ܿ۠ܺ;Ll/᩵ۜܺ;)V

    iput-object v2, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    .line 4486
    iget-object v2, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    .line 4488
    iget-object v10, v3, Ll/ۜۖܺ;->ۛ:Landroid/graphics/Matrix;

    if-eqz v10, :cond_12

    .line 4490
    invoke-virtual {v5, v10}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 4494
    new-instance v10, Landroid/graphics/Matrix;

    invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V

    .line 4495
    iget-object v11, v3, Ll/ۜۖܺ;->ۛ:Landroid/graphics/Matrix;

    invoke-virtual {v11, v10}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    move-result v11

    if-eqz v11, :cond_12

    .line 4496
    iget-object v2, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    iget v11, v2, Ll/֫ۖܺ;->᩷:F

    iget v12, v2, Ll/֫ۖܺ;->ۤ:F

    .line 4497
    invoke-virtual {v2}, Ll/֫ۖܺ;->ۙ()F

    move-result v2

    iget-object v14, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    iget v13, v14, Ll/֫ۖܺ;->ۤ:F

    .line 4498
    invoke-virtual {v14}, Ll/֫ۖܺ;->ۙ()F

    move-result v14

    iget-object v15, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-virtual {v15}, Ll/֫ۖܺ;->᩷()F

    move-result v15

    move-object/from16 v17, v5

    iget-object v5, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    iget v1, v5, Ll/֫ۖܺ;->᩷:F

    .line 4499
    invoke-virtual {v5}, Ll/֫ۖܺ;->᩷()F

    move-result v5

    move-object/from16 v18, v6

    const/16 v6, 0x8

    new-array v6, v6, [F

    const/16 v16, 0x0

    aput v11, v6, v16

    const/4 v11, 0x1

    aput v12, v6, v11

    const/4 v11, 0x2

    aput v2, v6, v11

    const/4 v2, 0x3

    aput v13, v6, v2

    const/4 v2, 0x4

    aput v14, v6, v2

    const/4 v2, 0x5

    aput v15, v6, v2

    const/4 v2, 0x6

    aput v1, v6, v2

    const/4 v1, 0x7

    aput v5, v6, v1

    .line 4500
    invoke-virtual {v10, v6}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 4502
    new-instance v1, Landroid/graphics/RectF;

    const/4 v5, 0x0

    aget v5, v6, v5

    const/4 v10, 0x1

    aget v10, v6, v10

    invoke-direct {v1, v5, v10, v5, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    :goto_a
    if-gt v11, v2, :cond_11

    .line 4504
    aget v5, v6, v11

    iget v10, v1, Landroid/graphics/RectF;->left:F

    cmpg-float v10, v5, v10

    if-gez v10, :cond_d

    iput v5, v1, Landroid/graphics/RectF;->left:F

    .line 4505
    :cond_d
    iget v10, v1, Landroid/graphics/RectF;->right:F

    cmpl-float v10, v5, v10

    if-lez v10, :cond_e

    iput v5, v1, Landroid/graphics/RectF;->right:F

    :cond_e
    add-int/lit8 v5, v11, 0x1

    .line 4506
    aget v5, v6, v5

    iget v10, v1, Landroid/graphics/RectF;->top:F

    cmpg-float v10, v5, v10

    if-gez v10, :cond_f

    iput v5, v1, Landroid/graphics/RectF;->top:F

    .line 4507
    :cond_f
    iget v10, v1, Landroid/graphics/RectF;->bottom:F

    cmpl-float v10, v5, v10

    if-lez v10, :cond_10

    iput v5, v1, Landroid/graphics/RectF;->bottom:F

    :cond_10
    add-int/lit8 v11, v11, 0x2

    goto :goto_a

    .line 4509
    :cond_11
    new-instance v2, Ll/֫ۖܺ;

    iget v5, v1, Landroid/graphics/RectF;->left:F

    iget v6, v1, Landroid/graphics/RectF;->top:F

    iget v10, v1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v10, v5

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v1, v6

    invoke-direct {v2, v5, v6, v10, v1}, Ll/֫ۖܺ;-><init>(FFFF)V

    goto :goto_b

    :cond_12
    move-object/from16 v17, v5

    move-object/from16 v18, v6

    .line 4514
    :goto_b
    iget v1, v2, Ll/֫ۖܺ;->᩷:F

    sub-float/2addr v1, v4

    div-float/2addr v1, v8

    float-to-double v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    move-result-wide v5

    double-to-float v1, v5

    mul-float v1, v1, v8

    add-float/2addr v1, v4

    .line 4515
    iget v4, v2, Ll/֫ۖܺ;->ۤ:F

    sub-float/2addr v4, v7

    div-float/2addr v4, v9

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float v4, v4, v9

    add-float/2addr v4, v7

    .line 4518
    invoke-virtual {v2}, Ll/֫ۖܺ;->ۙ()F

    move-result v5

    .line 4519
    invoke-virtual {v2}, Ll/֫ۖܺ;->᩷()F

    move-result v2

    .line 4520
    new-instance v6, Ll/֫ۖܺ;

    const/4 v7, 0x0

    invoke-direct {v6, v7, v7, v8, v9}, Ll/֫ۖܺ;-><init>(FFFF)V

    .line 4522
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v7

    :goto_c
    cmpg-float v10, v4, v2

    if-gez v10, :cond_1a

    move v10, v1

    :goto_d
    cmpg-float v11, v10, v5

    if-gez v11, :cond_19

    .line 4528
    iput v10, v6, Ll/֫ۖܺ;->᩷:F

    .line 4529
    iput v4, v6, Ll/֫ۖܺ;->ۤ:F

    .line 4532
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->ۧ()V

    .line 4535
    iget-object v11, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v11, v11, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v11, v11, Ll/᩹۠ܺ;->۫ۙ:Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-nez v11, :cond_13

    .line 4536
    iget v11, v6, Ll/֫ۖܺ;->᩷:F

    iget v12, v6, Ll/֫ۖܺ;->ۤ:F

    iget v13, v6, Ll/֫ۖܺ;->᩸:F

    iget v14, v6, Ll/֫ۖܺ;->ۙ:F

    invoke-direct {v0, v11, v12, v13, v14}, Ll/ۘۜܺ;->ۙ(FFFF)V

    .line 4539
    :cond_13
    iget-object v11, v3, Ll/ۢ۠ܺ;->᩹:Ll/֫ۖܺ;

    if-eqz v11, :cond_15

    move-object/from16 v12, v18

    .line 4541
    invoke-static {v6, v11, v12}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;Ll/֫ۖܺ;Ll/۫ۖܺ;)Landroid/graphics/Matrix;

    move-result-object v11

    move-object/from16 v13, v17

    invoke-virtual {v13, v11}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    :cond_14
    move-object/from16 v11, p1

    goto :goto_10

    :cond_15
    move-object/from16 v13, v17

    move-object/from16 v12, v18

    .line 4545
    iget-object v11, v3, Ll/ۜۖܺ;->ۨ:Ljava/lang/Boolean;

    if-eqz v11, :cond_17

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_16

    goto :goto_e

    :cond_16
    const/4 v11, 0x0

    goto :goto_f

    :cond_17
    :goto_e
    const/4 v11, 0x1

    .line 4547
    :goto_f
    invoke-virtual {v13, v10, v4}, Landroid/graphics/Canvas;->translate(FF)V

    if-nez v11, :cond_14

    move-object/from16 v11, p1

    .line 4549
    iget-object v14, v11, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    iget v15, v14, Ll/֫ۖܺ;->᩸:F

    iget v14, v14, Ll/֫ۖܺ;->ۙ:F

    invoke-virtual {v13, v15, v14}, Landroid/graphics/Canvas;->scale(FF)V

    .line 4555
    :goto_10
    iget-object v14, v3, Ll/ۨ۠ܺ;->֫:Ljava/util/List;

    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_11
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_18

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ܿ۠ܺ;

    .line 4556
    invoke-direct {v0, v15}, Ll/ۘۜܺ;->ۙ(Ll/ܿ۠ܺ;)V

    goto :goto_11

    .line 4560
    :cond_18
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->֫()V

    add-float/2addr v10, v8

    move-object/from16 v18, v12

    move-object/from16 v17, v13

    goto :goto_d

    :cond_19
    move-object/from16 v11, p1

    move-object/from16 v13, v17

    move-object/from16 v12, v18

    add-float/2addr v4, v9

    goto/16 :goto_c

    :cond_1a
    if-eqz v7, :cond_1b

    .line 831
    iget-object v1, v3, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;)V

    .line 4568
    :cond_1b
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->֫()V

    :cond_1c
    :goto_12
    return-void

    :cond_1d
    move-object v13, v5

    .line 499
    iget-object v1, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v1, v1, Ll/᩵ۜܺ;->ۙ:Landroid/graphics/Paint;

    invoke-virtual {v13, v2, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method private ۙ(Ll/ۙۜܺ;Ljava/lang/StringBuilder;)V
    .locals 3

    .line 1896
    iget-object p1, p1, Ll/ۨ۠ܺ;->֫:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    .line 1899
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1901
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ۠ܺ;

    .line 1903
    instance-of v2, v1, Ll/ۙۜܺ;

    if-eqz v2, :cond_0

    .line 1904
    check-cast v1, Ll/ۙۜܺ;

    invoke-direct {p0, v1, p2}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;Ljava/lang/StringBuilder;)V

    goto :goto_1

    .line 1905
    :cond_0
    instance-of v2, v1, Ll/ᩴۜܺ;

    if-eqz v2, :cond_1

    .line 1906
    check-cast v1, Ll/ᩴۜܺ;

    iget-object v1, v1, Ll/ᩴۜܺ;->ۤ:Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-direct {p0, v1, v0, v2}, Ll/ۘۜܺ;->ۙ(Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    return-void
.end method

.method private ۙ(Ll/ۙۜܺ;Ll/ۛۜܺ;)V
    .locals 10

    .line 1595
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_b

    .line 1598
    :cond_0
    iget-object p1, p1, Ll/ۨ۠ܺ;->֫:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    .line 1601
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 1603
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ۠ܺ;

    .line 1605
    instance-of v2, v1, Ll/ᩴۜܺ;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 1606
    check-cast v1, Ll/ᩴۜܺ;

    iget-object v1, v1, Ll/ᩴۜܺ;->ۤ:Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-direct {p0, v1, v0, v2}, Ll/ۘۜܺ;->ۙ(Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ۛۜܺ;->ۙ(Ljava/lang/String;)V

    goto/16 :goto_a

    .line 1618
    :cond_1
    move-object v0, v1

    check-cast v0, Ll/ۙۜܺ;

    invoke-virtual {p2, v0}, Ll/ۛۜܺ;->ۙ(Ll/ۙۜܺ;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_a

    .line 1621
    :cond_2
    instance-of v0, v1, Ll/᩷ۜܺ;

    const/high16 v2, 0x40000000    # 2.0f

    const/4 v4, 0x0

    if-eqz v0, :cond_b

    .line 1624
    invoke-direct {p0}, Ll/ۘۜܺ;->ۧ()V

    .line 1626
    check-cast v1, Ll/᩷ۜܺ;

    .line 1727
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1729
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 1731
    :cond_3
    invoke-direct {p0}, Ll/ۘۜܺ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    .line 1734
    :cond_4
    iget-object v0, v1, Ll/ܿ۠ܺ;->ۙ:Ll/֫ۜܺ;

    iget-object v5, v1, Ll/᩷ۜܺ;->ܶ:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_1

    .line 1741
    :cond_5
    check-cast v0, Ll/ۡۖܺ;

    .line 1742
    new-instance v5, Ll/ܽۜܺ;

    iget-object v6, v0, Ll/ۡۖܺ;->᩹:Ll/ۖۖܺ;

    invoke-direct {v5, v6}, Ll/ܽۜܺ;-><init>(Ll/ۖۖܺ;)V

    .line 2625
    iget-object v5, v5, Ll/ܽۜܺ;->ۤ:Landroid/graphics/Path;

    .line 1744
    iget-object v0, v0, Ll/ۛۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_6

    .line 1745
    invoke-virtual {v5, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 1747
    :cond_6
    new-instance v0, Landroid/graphics/PathMeasure;

    invoke-direct {v0, v5, v3}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 1749
    iget-object v3, v1, Ll/᩷ۜܺ;->᩹:Ll/ܿۖܺ;

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v0

    invoke-virtual {v3, p0, v0}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v4

    .line 1752
    :cond_7
    invoke-direct {p0}, Ll/ۘۜܺ;->ܳ()Ll/᩻۠ܺ;

    move-result-object v0

    .line 1753
    sget-object v3, Ll/᩻۠ܺ;->֡:Ll/᩻۠ܺ;

    if-eq v0, v3, :cond_9

    .line 1754
    invoke-direct {p0, v1}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;)F

    move-result v3

    .line 1755
    sget-object v6, Ll/᩻۠ܺ;->ܿ:Ll/᩻۠ܺ;

    if-ne v0, v6, :cond_8

    div-float/2addr v3, v2

    :cond_8
    sub-float/2addr v4, v3

    .line 1762
    :cond_9
    invoke-virtual {v1}, Ll/᩷ۜܺ;->ۤ()Ll/᩸ۜܺ;

    move-result-object v0

    check-cast v0, Ll/ۘ۠ܺ;

    invoke-direct {p0, v0}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;)V

    .line 1764
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v0

    .line 1766
    new-instance v2, Ll/ܶۜܺ;

    invoke-direct {v2, p0, v5, v4}, Ll/ܶۜܺ;-><init>(Ll/ۘۜܺ;Landroid/graphics/Path;F)V

    invoke-direct {p0, v1, v2}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;Ll/ۛۜܺ;)V

    if-eqz v0, :cond_a

    .line 831
    iget-object v0, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, v0}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;)V

    .line 1629
    :cond_a
    :goto_1
    invoke-direct {p0}, Ll/ۘۜܺ;->֫()V

    goto/16 :goto_a

    .line 1631
    :cond_b
    instance-of v0, v1, Ll/۠۠ܺ;

    if-eqz v0, :cond_19

    .line 1636
    invoke-direct {p0}, Ll/ۘۜܺ;->ۧ()V

    .line 1638
    check-cast v1, Ll/۠۠ܺ;

    .line 1640
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1642
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_18

    .line 1646
    iget-object v0, v1, Ll/ۤۜܺ;->ۗ:Ljava/util/ArrayList;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_c

    const/4 v0, 0x1

    goto :goto_2

    :cond_c
    const/4 v0, 0x0

    .line 1647
    :goto_2
    instance-of v5, p2, Ll/᩹ۜܺ;

    if-eqz v5, :cond_14

    if-nez v0, :cond_d

    .line 1648
    move-object v6, p2

    check-cast v6, Ll/᩹ۜܺ;

    iget v6, v6, Ll/᩹ۜܺ;->᩷:F

    goto :goto_3

    :cond_d
    iget-object v6, v1, Ll/ۤۜܺ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܿۖܺ;

    invoke-virtual {v6, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v6

    .line 1649
    :goto_3
    iget-object v7, v1, Ll/ۤۜܺ;->᩵:Ljava/util/ArrayList;

    if-eqz v7, :cond_f

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-nez v7, :cond_e

    goto :goto_4

    :cond_e
    iget-object v7, v1, Ll/ۤۜܺ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܿۖܺ;

    invoke-virtual {v7, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v7

    goto :goto_5

    :cond_f
    :goto_4
    move-object v7, p2

    check-cast v7, Ll/᩹ۜܺ;

    iget v7, v7, Ll/᩹ۜܺ;->ۤ:F

    .line 1650
    :goto_5
    iget-object v8, v1, Ll/ۤۜܺ;->ܶ:Ljava/util/ArrayList;

    if-eqz v8, :cond_11

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-nez v8, :cond_10

    goto :goto_6

    :cond_10
    iget-object v8, v1, Ll/ۤۜܺ;->ܶ:Ljava/util/ArrayList;

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܿۖܺ;

    invoke-virtual {v8, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v8

    goto :goto_7

    :cond_11
    :goto_6
    const/4 v8, 0x0

    .line 1651
    :goto_7
    iget-object v9, v1, Ll/ۤۜܺ;->᩹:Ljava/util/ArrayList;

    if-eqz v9, :cond_13

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-nez v9, :cond_12

    goto :goto_8

    :cond_12
    iget-object v4, v1, Ll/ۤۜܺ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿۖܺ;

    invoke-virtual {v3, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v4

    :cond_13
    :goto_8
    move v3, v4

    move v4, v6

    goto :goto_9

    :cond_14
    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_9
    if-eqz v0, :cond_16

    .line 1656
    invoke-direct {p0}, Ll/ۘۜܺ;->ܳ()Ll/᩻۠ܺ;

    move-result-object v0

    .line 1657
    sget-object v6, Ll/᩻۠ܺ;->֡:Ll/᩻۠ܺ;

    if-eq v0, v6, :cond_16

    .line 1658
    invoke-direct {p0, v1}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;)F

    move-result v6

    .line 1659
    sget-object v9, Ll/᩻۠ܺ;->ܿ:Ll/᩻۠ܺ;

    if-ne v0, v9, :cond_15

    div-float/2addr v6, v2

    :cond_15
    sub-float/2addr v4, v6

    .line 1667
    :cond_16
    invoke-virtual {v1}, Ll/۠۠ܺ;->ۤ()Ll/᩸ۜܺ;

    move-result-object v0

    check-cast v0, Ll/ۘ۠ܺ;

    invoke-direct {p0, v0}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;)V

    if-eqz v5, :cond_17

    .line 1670
    move-object v0, p2

    check-cast v0, Ll/᩹ۜܺ;

    add-float/2addr v4, v8

    iput v4, v0, Ll/᩹ۜܺ;->᩷:F

    add-float/2addr v7, v3

    .line 1671
    iput v7, v0, Ll/᩹ۜܺ;->ۤ:F

    .line 1674
    :cond_17
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v0

    .line 1676
    invoke-direct {p0, v1, p2}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;Ll/ۛۜܺ;)V

    if-eqz v0, :cond_18

    .line 831
    iget-object v0, v1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, v0}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;)V

    .line 1683
    :cond_18
    invoke-direct {p0}, Ll/ۘۜܺ;->֫()V

    goto :goto_a

    .line 1685
    :cond_19
    instance-of v0, v1, Ll/ۖ۠ܺ;

    if-eqz v0, :cond_1b

    .line 1688
    invoke-direct {p0}, Ll/ۘۜܺ;->ۧ()V

    .line 1690
    move-object v0, v1

    check-cast v0, Ll/ۖ۠ܺ;

    .line 1692
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v2, v0}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1694
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_1a

    .line 1696
    invoke-virtual {v0}, Ll/ۖ۠ܺ;->ۤ()Ll/᩸ۜܺ;

    move-result-object v2

    check-cast v2, Ll/ۘ۠ܺ;

    invoke-direct {p0, v2}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;)V

    .line 1699
    iget-object v1, v1, Ll/ܿ۠ܺ;->ۙ:Ll/֫ۜܺ;

    iget-object v0, v0, Ll/ۖ۠ܺ;->ܶ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 1700
    instance-of v1, v0, Ll/ۙۜܺ;

    if-eqz v1, :cond_1a

    .line 1702
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1703
    check-cast v0, Ll/ۙۜܺ;

    invoke-direct {p0, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;Ljava/lang/StringBuilder;)V

    .line 1704
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1a

    .line 1705
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ۛۜܺ;->ۙ(Ljava/lang/String;)V

    .line 1715
    :cond_1a
    invoke-direct {p0}, Ll/ۘۜܺ;->֫()V

    :cond_1b
    :goto_a
    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_1c
    :goto_b
    return-void
.end method

.method private ۙ(Ll/ۛۖܺ;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 3064
    iget-object v2, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v2, v2, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v3, v2, Ll/᩹۠ܺ;->᩸ۙ:Ljava/lang/String;

    if-nez v3, :cond_0

    iget-object v4, v2, Ll/᩹۠ܺ;->ۤۙ:Ljava/lang/String;

    if-nez v4, :cond_0

    iget-object v2, v2, Ll/᩹۠ܺ;->᩷ۙ:Ljava/lang/String;

    if-nez v2, :cond_0

    goto/16 :goto_d

    :cond_0
    const/4 v2, 0x0

    if-eqz v3, :cond_2

    .line 3072
    iget-object v4, v1, Ll/ܿ۠ܺ;->ۙ:Ll/֫ۜܺ;

    invoke-virtual {v4, v3}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 3074
    check-cast v3, Ll/۟ۖܺ;

    goto :goto_0

    .line 3076
    :cond_1
    iget-object v3, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v3, v3, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v3, v3, Ll/᩹۠ܺ;->᩸ۙ:Ljava/lang/String;

    :cond_2
    move-object v3, v2

    .line 3079
    :goto_0
    iget-object v4, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v4, v4, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v4, v4, Ll/᩹۠ܺ;->ۤۙ:Ljava/lang/String;

    if-eqz v4, :cond_4

    .line 3080
    iget-object v5, v1, Ll/ܿ۠ܺ;->ۙ:Ll/֫ۜܺ;

    invoke-virtual {v5, v4}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 3082
    check-cast v4, Ll/۟ۖܺ;

    goto :goto_1

    .line 3084
    :cond_3
    iget-object v4, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v4, v4, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v4, v4, Ll/᩹۠ܺ;->ۤۙ:Ljava/lang/String;

    :cond_4
    move-object v4, v2

    .line 3087
    :goto_1
    iget-object v5, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v5, v5, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v5, v5, Ll/᩹۠ܺ;->᩷ۙ:Ljava/lang/String;

    if-eqz v5, :cond_6

    .line 3088
    iget-object v6, v1, Ll/ܿ۠ܺ;->ۙ:Ll/֫ۜܺ;

    invoke-virtual {v6, v5}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 3090
    check-cast v5, Ll/۟ۖܺ;

    goto :goto_2

    .line 3092
    :cond_5
    iget-object v5, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v5, v5, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v5, v5, Ll/᩹۠ܺ;->᩷ۙ:Ljava/lang/String;

    :cond_6
    move-object v5, v2

    .line 3096
    :goto_2
    instance-of v6, v1, Ll/ۡۖܺ;

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v6, :cond_7

    .line 3097
    new-instance v6, Ll/᩻ۜܺ;

    check-cast v1, Ll/ۡۖܺ;

    iget-object v1, v1, Ll/ۡۖܺ;->᩹:Ll/ۖۖܺ;

    invoke-direct {v6, v0, v1}, Ll/᩻ۜܺ;-><init>(Ll/ۘۜܺ;Ll/ۖۖܺ;)V

    invoke-virtual {v6}, Ll/᩻ۜܺ;->ۙ()Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_7

    .line 3098
    :cond_7
    instance-of v6, v1, Ll/֡ۖܺ;

    if-eqz v6, :cond_c

    .line 3099
    check-cast v1, Ll/֡ۖܺ;

    .line 1343
    iget-object v6, v1, Ll/֡ۖܺ;->᩹:Ll/ܿۖܺ;

    if-eqz v6, :cond_8

    invoke-virtual {v6, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v6

    goto :goto_3

    :cond_8
    const/4 v6, 0x0

    .line 1344
    :goto_3
    iget-object v9, v1, Ll/֡ۖܺ;->᩵:Ll/ܿۖܺ;

    if-eqz v9, :cond_9

    invoke-virtual {v9, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v9

    goto :goto_4

    :cond_9
    const/4 v9, 0x0

    .line 1345
    :goto_4
    iget-object v10, v1, Ll/֡ۖܺ;->ۗ:Ll/ܿۖܺ;

    if-eqz v10, :cond_a

    invoke-virtual {v10, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v10

    goto :goto_5

    :cond_a
    const/4 v10, 0x0

    .line 1346
    :goto_5
    iget-object v1, v1, Ll/֡ۖܺ;->ۨ:Ll/ܿۖܺ;

    if-eqz v1, :cond_b

    invoke-virtual {v1, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v1

    goto :goto_6

    :cond_b
    const/4 v1, 0x0

    .line 1348
    :goto_6
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1349
    new-instance v12, Ll/ܺۜܺ;

    sub-float v13, v10, v6

    sub-float v14, v1, v9

    invoke-direct {v12, v6, v9, v13, v14}, Ll/ܺۜܺ;-><init>(FFFF)V

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1350
    new-instance v6, Ll/ܺۜܺ;

    invoke-direct {v6, v10, v1, v13, v14}, Ll/ܺۜܺ;-><init>(FFFF)V

    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_9

    :cond_c
    const/4 v6, 0x1

    .line 3101
    check-cast v1, Ll/۬ۖܺ;

    .line 1402
    iget-object v10, v1, Ll/۬ۖܺ;->᩹:[F

    array-length v10, v10

    if-ge v10, v8, :cond_d

    move-object v1, v2

    :goto_7
    const/4 v6, 0x0

    goto/16 :goto_a

    .line 1407
    :cond_d
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1408
    new-instance v12, Ll/ܺۜܺ;

    iget-object v13, v1, Ll/۬ۖܺ;->᩹:[F

    aget v14, v13, v7

    aget v13, v13, v6

    invoke-direct {v12, v14, v13, v9, v9}, Ll/ܺۜܺ;-><init>(FFFF)V

    const/4 v9, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 1411
    :goto_8
    iget v15, v12, Ll/ܺۜܺ;->ᩴ:F

    const/16 v16, 0x0

    iget v8, v12, Ll/ܺۜܺ;->᩸:F

    if-ge v9, v10, :cond_e

    .line 1412
    iget-object v13, v1, Ll/۬ۖܺ;->᩹:[F

    aget v14, v13, v9

    add-int/lit8 v16, v9, 0x1

    .line 1413
    aget v13, v13, v16

    .line 1414
    invoke-virtual {v12, v14, v13}, Ll/ܺۜܺ;->ۙ(FF)V

    .line 1415
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1416
    new-instance v12, Ll/ܺۜܺ;

    sub-float v8, v14, v8

    sub-float v15, v13, v15

    invoke-direct {v12, v14, v13, v8, v15}, Ll/ܺۜܺ;-><init>(FFFF)V

    add-int/lit8 v9, v9, 0x2

    const/4 v8, 0x2

    move/from16 v17, v14

    move v14, v13

    move/from16 v13, v17

    goto :goto_8

    .line 1420
    :cond_e
    instance-of v9, v1, Ll/ۙ۠ܺ;

    if-eqz v9, :cond_f

    .line 1421
    iget-object v1, v1, Ll/۬ۖܺ;->᩹:[F

    aget v9, v1, v7

    cmpl-float v10, v13, v9

    if-eqz v10, :cond_10

    aget v1, v1, v6

    cmpl-float v6, v14, v1

    if-eqz v6, :cond_10

    .line 1424
    invoke-virtual {v12, v9, v1}, Ll/ܺۜܺ;->ۙ(FF)V

    .line 1425
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1428
    new-instance v6, Ll/ܺۜܺ;

    sub-float v8, v9, v8

    sub-float v10, v1, v15

    invoke-direct {v6, v9, v1, v8, v10}, Ll/ܺۜܺ;-><init>(FFFF)V

    .line 1429
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۜܺ;

    invoke-virtual {v6, v1}, Ll/ܺۜܺ;->ۙ(Ll/ܺۜܺ;)V

    .line 1430
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1431
    invoke-virtual {v11, v7, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    .line 1434
    :cond_f
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    :goto_9
    move-object v1, v11

    goto :goto_7

    :goto_a
    if-nez v1, :cond_11

    goto/16 :goto_d

    .line 3106
    :cond_11
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    if-nez v8, :cond_12

    goto/16 :goto_d

    .line 3111
    :cond_12
    iget-object v9, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v9, v9, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iput-object v2, v9, Ll/᩹۠ܺ;->᩷ۙ:Ljava/lang/String;

    iput-object v2, v9, Ll/᩹۠ܺ;->ۤۙ:Ljava/lang/String;

    iput-object v2, v9, Ll/᩹۠ܺ;->᩸ۙ:Ljava/lang/String;

    if-eqz v3, :cond_13

    .line 3114
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۜܺ;

    invoke-direct {v0, v3, v2}, Ll/ۘۜܺ;->ۙ(Ll/۟ۖܺ;Ll/ܺۜܺ;)V

    :cond_13
    if-eqz v4, :cond_18

    .line 3116
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-le v2, v3, :cond_18

    .line 3118
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۜܺ;

    const/4 v3, 0x1

    .line 3119
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺۜܺ;

    const/4 v7, 0x1

    move-object/from16 v17, v3

    move-object v3, v2

    move-object/from16 v2, v17

    :goto_b
    add-int/lit8 v9, v8, -0x1

    if-ge v7, v9, :cond_18

    add-int/lit8 v7, v7, 0x1

    .line 3123
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܺۜܺ;

    .line 3124
    iget-boolean v10, v2, Ll/ܺۜܺ;->ۤ:Z

    if-eqz v10, :cond_17

    .line 3144
    iget v10, v2, Ll/ܺۜܺ;->ۙ:F

    iget v11, v2, Ll/ܺۜܺ;->᩷:F

    iget v12, v2, Ll/ܺۜܺ;->᩸:F

    iget v13, v3, Ll/ܺۜܺ;->᩸:F

    sub-float v13, v12, v13

    iget v14, v2, Ll/ܺۜܺ;->ᩴ:F

    iget v3, v3, Ll/ܺۜܺ;->ᩴ:F

    sub-float v3, v14, v3

    mul-float v13, v13, v10

    mul-float v3, v3, v11

    add-float/2addr v3, v13

    cmpl-float v13, v3, v6

    if-nez v13, :cond_14

    .line 3147
    iget v3, v9, Ll/ܺۜܺ;->᩸:F

    sub-float/2addr v3, v12

    iget v12, v9, Ll/ܺۜܺ;->ᩴ:F

    sub-float/2addr v12, v14

    mul-float v3, v3, v10

    mul-float v12, v12, v11

    add-float/2addr v3, v12

    :cond_14
    cmpl-float v3, v3, v6

    if-lez v3, :cond_15

    goto :goto_c

    :cond_15
    if-nez v3, :cond_16

    cmpl-float v3, v10, v6

    if-gtz v3, :cond_17

    cmpl-float v3, v11, v6

    if-ltz v3, :cond_16

    goto :goto_c

    :cond_16
    neg-float v3, v10

    .line 3158
    iput v3, v2, Ll/ܺۜܺ;->ۙ:F

    neg-float v3, v11

    .line 3159
    iput v3, v2, Ll/ܺۜܺ;->᩷:F

    .line 3126
    :cond_17
    :goto_c
    invoke-direct {v0, v4, v2}, Ll/ۘۜܺ;->ۙ(Ll/۟ۖܺ;Ll/ܺۜܺ;)V

    move-object v3, v2

    move-object v2, v9

    goto :goto_b

    :cond_18
    if-eqz v5, :cond_19

    add-int/lit8 v8, v8, -0x1

    .line 3133
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۜܺ;

    invoke-direct {v0, v5, v1}, Ll/ۘۜܺ;->ۙ(Ll/۟ۖܺ;Ll/ܺۜܺ;)V

    :cond_19
    :goto_d
    return-void
.end method

.method public static ۙ(Ll/ۜۖܺ;Ljava/lang/String;)V
    .locals 1

    .line 4579
    iget-object v0, p0, Ll/ܿ۠ܺ;->ۙ:Ll/֫ۜܺ;

    invoke-virtual {v0, p1}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 4585
    :cond_0
    instance-of v0, p1, Ll/ۜۖܺ;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-ne p1, p0, :cond_2

    goto :goto_0

    .line 4594
    :cond_2
    check-cast p1, Ll/ۜۖܺ;

    .line 4596
    iget-object v0, p0, Ll/ۜۖܺ;->᩺:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    .line 4597
    iget-object v0, p1, Ll/ۜۖܺ;->᩺:Ljava/lang/Boolean;

    iput-object v0, p0, Ll/ۜۖܺ;->᩺:Ljava/lang/Boolean;

    .line 4598
    :cond_3
    iget-object v0, p0, Ll/ۜۖܺ;->ۨ:Ljava/lang/Boolean;

    if-nez v0, :cond_4

    .line 4599
    iget-object v0, p1, Ll/ۜۖܺ;->ۨ:Ljava/lang/Boolean;

    iput-object v0, p0, Ll/ۜۖܺ;->ۨ:Ljava/lang/Boolean;

    .line 4600
    :cond_4
    iget-object v0, p0, Ll/ۜۖܺ;->ۛ:Landroid/graphics/Matrix;

    if-nez v0, :cond_5

    .line 4601
    iget-object v0, p1, Ll/ۜۖܺ;->ۛ:Landroid/graphics/Matrix;

    iput-object v0, p0, Ll/ۜۖܺ;->ۛ:Landroid/graphics/Matrix;

    .line 4602
    :cond_5
    iget-object v0, p0, Ll/ۜۖܺ;->ܰ:Ll/ܿۖܺ;

    if-nez v0, :cond_6

    .line 4603
    iget-object v0, p1, Ll/ۜۖܺ;->ܰ:Ll/ܿۖܺ;

    iput-object v0, p0, Ll/ۜۖܺ;->ܰ:Ll/ܿۖܺ;

    .line 4604
    :cond_6
    iget-object v0, p0, Ll/ۜۖܺ;->᩶:Ll/ܿۖܺ;

    if-nez v0, :cond_7

    .line 4605
    iget-object v0, p1, Ll/ۜۖܺ;->᩶:Ll/ܿۖܺ;

    iput-object v0, p0, Ll/ۜۖܺ;->᩶:Ll/ܿۖܺ;

    .line 4606
    :cond_7
    iget-object v0, p0, Ll/ۜۖܺ;->ۘ:Ll/ܿۖܺ;

    if-nez v0, :cond_8

    .line 4607
    iget-object v0, p1, Ll/ۜۖܺ;->ۘ:Ll/ܿۖܺ;

    iput-object v0, p0, Ll/ۜۖܺ;->ۘ:Ll/ܿۖܺ;

    .line 4608
    :cond_8
    iget-object v0, p0, Ll/ۜۖܺ;->ۗ:Ll/ܿۖܺ;

    if-nez v0, :cond_9

    .line 4609
    iget-object v0, p1, Ll/ۜۖܺ;->ۗ:Ll/ܿۖܺ;

    iput-object v0, p0, Ll/ۜۖܺ;->ۗ:Ll/ܿۖܺ;

    .line 4611
    :cond_9
    iget-object v0, p0, Ll/ۨ۠ܺ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 4612
    iget-object v0, p1, Ll/ۨ۠ܺ;->֫:Ljava/util/List;

    iput-object v0, p0, Ll/ۨ۠ܺ;->֫:Ljava/util/List;

    .line 4613
    :cond_a
    iget-object v0, p0, Ll/ۢ۠ܺ;->᩹:Ll/֫ۖܺ;

    if-nez v0, :cond_b

    .line 4614
    iget-object v0, p1, Ll/ۢ۠ܺ;->᩹:Ll/֫ۖܺ;

    iput-object v0, p0, Ll/ۢ۠ܺ;->᩹:Ll/֫ۖܺ;

    .line 4615
    :cond_b
    iget-object v0, p0, Ll/۟۠ܺ;->ܶ:Ll/۫ۖܺ;

    if-nez v0, :cond_c

    .line 4616
    iget-object v0, p1, Ll/۟۠ܺ;->ܶ:Ll/۫ۖܺ;

    iput-object v0, p0, Ll/۟۠ܺ;->ܶ:Ll/۫ۖܺ;

    .line 4619
    :cond_c
    iget-object p1, p1, Ll/ۜۖܺ;->᩵:Ljava/lang/String;

    if-eqz p1, :cond_d

    .line 4620
    invoke-static {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۜۖܺ;Ljava/lang/String;)V

    :cond_d
    :goto_0
    return-void
.end method

.method private ۙ(Ll/۟ۖܺ;Ll/ܺۜܺ;)V
    .locals 12

    .line 3181
    invoke-direct {p0}, Ll/ۘۜܺ;->ۧ()V

    .line 3184
    iget-object v0, p1, Ll/۟ۖܺ;->ۛ:Ljava/lang/Float;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 3186
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3188
    iget v0, p2, Ll/ܺۜܺ;->ۙ:F

    cmpl-float v2, v0, v1

    if-nez v2, :cond_0

    iget v2, p2, Ll/ܺۜܺ;->᩷:F

    cmpl-float v2, v2, v1

    if-eqz v2, :cond_2

    .line 3189
    :cond_0
    iget v2, p2, Ll/ܺۜܺ;->᩷:F

    float-to-double v2, v2

    float-to-double v4, v0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v2

    double-to-float v0, v2

    goto :goto_0

    .line 3192
    :cond_1
    iget-object v0, p1, Ll/۟ۖܺ;->ۛ:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 3196
    :goto_0
    iget-boolean v2, p1, Ll/۟ۖܺ;->᩵:Z

    if-eqz v2, :cond_3

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_3
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v2, v2, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v2, v2, Ll/᩹۠ܺ;->᩺ۙ:Ll/ܿۖܺ;

    iget v3, p0, Ll/ۘۜܺ;->ۚ:F

    invoke-virtual {v2, v3}, Ll/ܿۖܺ;->ۙ(F)F

    move-result v2

    .line 3200
    :goto_1
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ܰ۠ܺ;)Ll/᩵ۜܺ;

    move-result-object v3

    iput-object v3, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    .line 3202
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 3203
    iget v4, p2, Ll/ܺۜܺ;->᩸:F

    iget p2, p2, Ll/ܺۜܺ;->ᩴ:F

    invoke-virtual {v3, v4, p2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 3204
    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 3205
    invoke-virtual {v3, v2, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 3207
    iget-object p2, p1, Ll/۟ۖܺ;->᩺:Ll/ܿۖܺ;

    if-eqz p2, :cond_4

    invoke-virtual {p2, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result p2

    goto :goto_2

    :cond_4
    const/4 p2, 0x0

    .line 3208
    :goto_2
    iget-object v0, p1, Ll/۟ۖܺ;->ۘ:Ll/ܿۖܺ;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v0

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    .line 3209
    :goto_3
    iget-object v2, p1, Ll/۟ۖܺ;->ۨ:Ll/ܿۖܺ;

    const/high16 v4, 0x40400000    # 3.0f

    if-eqz v2, :cond_6

    invoke-virtual {v2, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v2

    goto :goto_4

    :cond_6
    const/high16 v2, 0x40400000    # 3.0f

    .line 3210
    :goto_4
    iget-object v5, p1, Ll/۟ۖܺ;->ۗ:Ll/ܿۖܺ;

    if-eqz v5, :cond_7

    invoke-virtual {v5, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v4

    .line 3212
    :cond_7
    iget-object v5, p1, Ll/ۢ۠ܺ;->᩹:Ll/֫ۖܺ;

    iget-object v6, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    if-eqz v5, :cond_e

    .line 3219
    iget v7, v5, Ll/֫ۖܺ;->᩸:F

    div-float v7, v2, v7

    .line 3220
    iget v5, v5, Ll/֫ۖܺ;->ۙ:F

    div-float v5, v4, v5

    .line 3223
    iget-object v8, p1, Ll/۟۠ܺ;->ܶ:Ll/۫ۖܺ;

    if-eqz v8, :cond_8

    goto :goto_5

    :cond_8
    sget-object v8, Ll/۫ۖܺ;->ۤ:Ll/۫ۖܺ;

    .line 3224
    :goto_5
    sget-object v9, Ll/۫ۖܺ;->᩸:Ll/۫ۖܺ;

    invoke-virtual {v8, v9}, Ll/۫ۖܺ;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    .line 3226
    invoke-virtual {v8}, Ll/۫ۖܺ;->᩷()Ll/ܳۖܺ;

    move-result-object v9

    sget-object v10, Ll/ܳۖܺ;->ܿ:Ll/ܳۖܺ;

    if-ne v9, v10, :cond_9

    invoke-static {v7, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    goto :goto_6

    :cond_9
    invoke-static {v7, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    :goto_6
    move v7, v5

    move v5, v7

    :cond_a
    neg-float p2, p2

    mul-float p2, p2, v7

    neg-float v0, v0

    mul-float v0, v0, v5

    .line 3231
    invoke-virtual {v3, p2, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 3232
    invoke-virtual {v6, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 3236
    iget-object p2, p1, Ll/ۢ۠ܺ;->᩹:Ll/֫ۖܺ;

    iget v0, p2, Ll/֫ۖܺ;->᩸:F

    mul-float v0, v0, v7

    .line 3237
    iget p2, p2, Ll/֫ۖܺ;->ۙ:F

    mul-float p2, p2, v5

    .line 3240
    sget-object v9, Ll/ۧۜܺ;->ۙ:[I

    invoke-virtual {v8}, Ll/۫ۖܺ;->ۙ()Ll/ᩴۖܺ;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v9, v10

    const/high16 v11, 0x40000000    # 2.0f

    packed-switch v10, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_8

    :pswitch_0
    sub-float v0, v2, v0

    goto :goto_7

    :pswitch_1
    sub-float v0, v2, v0

    div-float/2addr v0, v11

    :goto_7
    sub-float v0, v1, v0

    .line 3257
    :goto_8
    invoke-virtual {v8}, Ll/۫ۖܺ;->ۙ()Ll/ᩴۖܺ;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v9, v8

    const/4 v9, 0x2

    if-eq v8, v9, :cond_c

    const/4 v9, 0x3

    if-eq v8, v9, :cond_b

    const/4 v9, 0x5

    if-eq v8, v9, :cond_c

    const/4 v9, 0x6

    if-eq v8, v9, :cond_b

    const/4 v9, 0x7

    if-eq v8, v9, :cond_c

    const/16 v9, 0x8

    if-eq v8, v9, :cond_b

    goto :goto_a

    :cond_b
    sub-float p2, v4, p2

    goto :goto_9

    :cond_c
    sub-float p2, v4, p2

    div-float/2addr p2, v11

    :goto_9
    sub-float/2addr v1, p2

    .line 3274
    :goto_a
    iget-object p2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object p2, p2, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object p2, p2, Ll/᩹۠ܺ;->۫ۙ:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_d

    .line 3275
    invoke-direct {p0, v0, v1, v2, v4}, Ll/ۘۜܺ;->ۙ(FFFF)V

    .line 3278
    :cond_d
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 3279
    invoke-virtual {v3, v7, v5}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 3280
    invoke-virtual {v6, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    goto :goto_b

    :cond_e
    neg-float p2, p2

    neg-float v0, v0

    .line 3286
    invoke-virtual {v3, p2, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 3287
    invoke-virtual {v6, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 3289
    iget-object p2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object p2, p2, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object p2, p2, Ll/᩹۠ܺ;->۫ۙ:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_f

    .line 3290
    invoke-direct {p0, v1, v1, v2, v4}, Ll/ۘۜܺ;->ۙ(FFFF)V

    .line 3294
    :cond_f
    :goto_b
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result p2

    const/4 v0, 0x0

    .line 3296
    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->ۙ(Ll/ۨ۠ܺ;Z)V

    if-eqz p2, :cond_10

    .line 831
    iget-object p1, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;)V

    .line 3301
    :cond_10
    invoke-direct {p0}, Ll/ۘۜܺ;->֫()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ۙ(Ll/ۨ۠ܺ;Z)V
    .locals 1

    if-eqz p2, :cond_0

    .line 384
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩺۠ܺ;)V

    .line 1697
    :cond_0
    iget-object p1, p1, Ll/ۨ۠ܺ;->֫:Ljava/util/List;

    .line 387
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ۠ܺ;

    .line 388
    invoke-direct {p0, v0}, Ll/ۘۜܺ;->ۙ(Ll/ܿ۠ܺ;)V

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    .line 434
    iget-object p1, p0, Ll/ۘۜܺ;->ۧ:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 435
    iget-object p1, p0, Ll/ۘۜܺ;->֫:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method private ۙ(Ll/ܿ۠ܺ;)V
    .locals 14

    .line 337
    instance-of v0, p1, Ll/ۢۖܺ;

    if-eqz v0, :cond_0

    return-void

    .line 341
    :cond_0
    invoke-direct {p0}, Ll/ۘۜܺ;->ۧ()V

    .line 473
    instance-of v0, p1, Ll/ܰ۠ܺ;

    if-nez v0, :cond_1

    goto :goto_0

    .line 476
    :cond_1
    move-object v0, p1

    check-cast v0, Ll/ܰ۠ܺ;

    .line 477
    iget-object v0, v0, Ll/ܰ۠ܺ;->ܳ:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    .line 478
    iget-object v1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, v1, Ll/᩵ۜܺ;->᩸:Z

    .line 345
    :cond_2
    :goto_0
    instance-of v0, p1, Ll/ۗ۠ܺ;

    if-eqz v0, :cond_3

    .line 346
    check-cast p1, Ll/ۗ۠ܺ;

    .line 584
    iget-object v0, p1, Ll/ۗ۠ܺ;->ۨ:Ll/ܿۖܺ;

    iget-object v1, p1, Ll/ۗ۠ܺ;->ۛ:Ll/ܿۖܺ;

    iget-object v2, p1, Ll/ۗ۠ܺ;->᩵:Ll/ܿۖܺ;

    iget-object v3, p1, Ll/ۗ۠ܺ;->ۗ:Ll/ܿۖܺ;

    invoke-direct {p0, v0, v1, v2, v3}, Ll/ۘۜܺ;->ۙ(Ll/ܿۖܺ;Ll/ܿۖܺ;Ll/ܿۖܺ;Ll/ܿۖܺ;)Ll/֫ۖܺ;

    move-result-object v0

    .line 586
    iget-object v1, p1, Ll/ۢ۠ܺ;->᩹:Ll/֫ۖܺ;

    iget-object v2, p1, Ll/۟۠ܺ;->ܶ:Ll/۫ۖܺ;

    invoke-direct {p0, p1, v0, v1, v2}, Ll/ۘۜܺ;->ۙ(Ll/ۗ۠ܺ;Ll/֫ۖܺ;Ll/֫ۖܺ;Ll/۫ۖܺ;)V

    goto/16 :goto_2b

    .line 347
    :cond_3
    instance-of v0, p1, Ll/۫ۜܺ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_16

    .line 348
    check-cast p1, Ll/۫ۜܺ;

    .line 1067
    iget-object v0, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    .line 1069
    iget-object v4, p1, Ll/۫ۜܺ;->᩵:Ll/ܿۖܺ;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ll/ܿۖܺ;->᩷()Z

    move-result v4

    if-nez v4, :cond_96

    :cond_4
    iget-object v4, p1, Ll/۫ۜܺ;->᩹:Ll/ܿۖܺ;

    if-eqz v4, :cond_5

    .line 1070
    invoke-virtual {v4}, Ll/ܿۖܺ;->᩷()Z

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_2b

    .line 1073
    :cond_5
    iget-object v4, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v4, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1075
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_2b

    .line 1079
    :cond_6
    iget-object v4, p1, Ll/ܿ۠ܺ;->ۙ:Ll/֫ۜܺ;

    iget-object v5, p1, Ll/۫ۜܺ;->ۗ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object v4

    if-nez v4, :cond_7

    goto/16 :goto_2b

    .line 1085
    :cond_7
    iget-object v5, p1, Ll/᩺ۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v5, :cond_8

    .line 1086
    invoke-virtual {v0, v5}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1090
    :cond_8
    iget-object v5, p1, Ll/۫ۜܺ;->ۨ:Ll/ܿۖܺ;

    if-eqz v5, :cond_9

    invoke-virtual {v5, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v5

    goto :goto_1

    :cond_9
    const/4 v5, 0x0

    .line 1091
    :goto_1
    iget-object v6, p1, Ll/۫ۜܺ;->ۛ:Ll/ܿۖܺ;

    if-eqz v6, :cond_a

    invoke-virtual {v6, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v6

    goto :goto_2

    :cond_a
    const/4 v6, 0x0

    .line 1092
    :goto_2
    invoke-virtual {v0, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3745
    iget-object v5, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v5}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 1096
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v5

    .line 1098
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩺۠ܺ;)V

    .line 1100
    instance-of v6, v4, Ll/ۗ۠ܺ;

    if-eqz v6, :cond_b

    .line 1102
    check-cast v4, Ll/ۗ۠ܺ;

    .line 1103
    iget-object v0, p1, Ll/۫ۜܺ;->᩵:Ll/ܿۖܺ;

    iget-object v2, p1, Ll/۫ۜܺ;->᩹:Ll/ܿۖܺ;

    invoke-direct {p0, v1, v1, v0, v2}, Ll/ۘۜܺ;->ۙ(Ll/ܿۖܺ;Ll/ܿۖܺ;Ll/ܿۖܺ;Ll/ܿۖܺ;)Ll/֫ۖܺ;

    move-result-object v0

    .line 1105
    invoke-direct {p0}, Ll/ۘۜܺ;->ۧ()V

    .line 593
    iget-object v1, v4, Ll/ۢ۠ܺ;->᩹:Ll/֫ۖܺ;

    iget-object v2, v4, Ll/۟۠ܺ;->ܶ:Ll/۫ۖܺ;

    invoke-direct {p0, v4, v0, v1, v2}, Ll/ۘۜܺ;->ۙ(Ll/ۗ۠ܺ;Ll/֫ۖܺ;Ll/֫ۖܺ;Ll/۫ۖܺ;)V

    .line 1107
    invoke-direct {p0}, Ll/ۘۜܺ;->֫()V

    goto/16 :goto_8

    .line 1109
    :cond_b
    instance-of v6, v4, Ll/ۡ۠ܺ;

    if-eqz v6, :cond_14

    .line 1111
    iget-object v6, p1, Ll/۫ۜܺ;->᩵:Ll/ܿۖܺ;

    const/high16 v7, 0x42c80000    # 100.0f

    if-eqz v6, :cond_c

    goto :goto_3

    :cond_c
    new-instance v6, Ll/ܿۖܺ;

    sget-object v8, Ll/ܳۜܺ;->֨:Ll/ܳۜܺ;

    invoke-direct {v6, v7, v8}, Ll/ܿۖܺ;-><init>(FLl/ܳۜܺ;)V

    .line 1112
    :goto_3
    iget-object v8, p1, Ll/۫ۜܺ;->᩹:Ll/ܿۖܺ;

    if-eqz v8, :cond_d

    goto :goto_4

    :cond_d
    new-instance v8, Ll/ܿۖܺ;

    sget-object v9, Ll/ܳۜܺ;->֨:Ll/ܳۜܺ;

    invoke-direct {v8, v7, v9}, Ll/ܿۖܺ;-><init>(FLl/ܳۜܺ;)V

    .line 1113
    :goto_4
    invoke-direct {p0, v1, v1, v6, v8}, Ll/ۘۜܺ;->ۙ(Ll/ܿۖܺ;Ll/ܿۖܺ;Ll/ܿۖܺ;Ll/ܿۖܺ;)Ll/֫ۖܺ;

    move-result-object v1

    .line 1115
    invoke-direct {p0}, Ll/ۘۜܺ;->ۧ()V

    .line 1116
    check-cast v4, Ll/ۡ۠ܺ;

    .line 1941
    iget v6, v1, Ll/֫ۖܺ;->᩸:F

    cmpl-float v6, v6, v3

    if-eqz v6, :cond_13

    iget v6, v1, Ll/֫ۖܺ;->ۙ:F

    cmpl-float v3, v6, v3

    if-nez v3, :cond_e

    goto :goto_7

    .line 1945
    :cond_e
    iget-object v3, v4, Ll/۟۠ܺ;->ܶ:Ll/۫ۖܺ;

    if-eqz v3, :cond_f

    goto :goto_5

    :cond_f
    sget-object v3, Ll/۫ۖܺ;->ۤ:Ll/۫ۖܺ;

    .line 1947
    :goto_5
    iget-object v6, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v6, v4}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1949
    iget-object v6, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iput-object v1, v6, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    .line 1951
    iget-object v1, v6, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, v1, Ll/᩹۠ܺ;->۫ۙ:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_10

    .line 1952
    iget-object v1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v1, v1, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    iget v6, v1, Ll/֫ۖܺ;->᩷:F

    iget v7, v1, Ll/֫ۖܺ;->ۤ:F

    iget v8, v1, Ll/֫ۖܺ;->᩸:F

    iget v1, v1, Ll/֫ۖܺ;->ۙ:F

    invoke-direct {p0, v6, v7, v8, v1}, Ll/ۘۜܺ;->ۙ(FFFF)V

    .line 1955
    :cond_10
    iget-object v1, v4, Ll/ۢ۠ܺ;->᩹:Ll/֫ۖܺ;

    if-eqz v1, :cond_11

    .line 1956
    iget-object v6, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v6, v6, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    invoke-static {v6, v1, v3}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;Ll/֫ۖܺ;Ll/۫ۖܺ;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1957
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v1, v4, Ll/ۢ۠ܺ;->᩹:Ll/֫ۖܺ;

    iput-object v1, v0, Ll/᩵ۜܺ;->۫:Ll/֫ۖܺ;

    goto :goto_6

    .line 1959
    :cond_11
    iget-object v1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v1, v1, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    iget v3, v1, Ll/֫ۖܺ;->᩷:F

    iget v1, v1, Ll/֫ۖܺ;->ۤ:F

    invoke-virtual {v0, v3, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1962
    :goto_6
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v0

    .line 1964
    invoke-direct {p0, v4, v2}, Ll/ۘۜܺ;->ۙ(Ll/ۨ۠ܺ;Z)V

    if-eqz v0, :cond_12

    .line 831
    iget-object v0, v4, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, v0}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;)V

    .line 1969
    :cond_12
    invoke-direct {p0, v4}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    .line 1117
    :cond_13
    :goto_7
    invoke-direct {p0}, Ll/ۘۜܺ;->֫()V

    goto :goto_8

    .line 1121
    :cond_14
    invoke-direct {p0, v4}, Ll/ۘۜܺ;->ۙ(Ll/ܿ۠ܺ;)V

    .line 434
    :goto_8
    iget-object v0, p0, Ll/ۘۜܺ;->ۧ:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 435
    iget-object v0, p0, Ll/ۘۜܺ;->֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    if-eqz v5, :cond_15

    .line 831
    iget-object v0, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, v0}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;)V

    .line 1129
    :cond_15
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    goto/16 :goto_2b

    .line 349
    :cond_16
    instance-of v0, p1, Ll/֨۠ܺ;

    if-eqz v0, :cond_23

    .line 350
    check-cast p1, Ll/֨۠ܺ;

    .line 906
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 908
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_2b

    .line 911
    :cond_17
    iget-object v0, p1, Ll/᩺ۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_18

    .line 912
    iget-object v1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 3745
    :cond_18
    iget-object v0, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 917
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v1

    .line 930
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    .line 1697
    iget-object v0, p1, Ll/ۨ۠ܺ;->֫:Ljava/util/List;

    .line 934
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_19
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ll/ܿ۠ܺ;

    .line 937
    instance-of v0, v4, Ll/᩵۠ܺ;

    if-nez v0, :cond_1a

    goto :goto_9

    .line 940
    :cond_1a
    move-object v5, v4

    check-cast v5, Ll/᩵۠ܺ;

    .line 943
    invoke-interface {v5}, Ll/᩵۠ܺ;->᩷()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1b

    goto :goto_9

    .line 947
    :cond_1b
    invoke-interface {v5}, Ll/᩵۠ܺ;->ۙ()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1c

    .line 948
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_19

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_9

    .line 952
    :cond_1c
    invoke-interface {v5}, Ll/᩵۠ܺ;->᩸()Ljava/util/Set;

    move-result-object v6

    if-eqz v6, :cond_1e

    .line 954
    sget-object v0, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    if-nez v0, :cond_1d

    .line 0
    const-class v0, Ll/ۘۜܺ;

    monitor-enter v0

    .line 990
    :try_start_0
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    sput-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "Structure"

    .line 1009
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1010
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "BasicStructure"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1012
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "ConditionalProcessing"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1013
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "Image"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1014
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "Style"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1015
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "ViewportAttribute"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1016
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "Shape"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1018
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "BasicText"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1019
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "PaintAttribute"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1020
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "BasicPaintAttribute"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1021
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "OpacityAttribute"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1023
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "BasicGraphicsAttribute"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1024
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "Marker"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1026
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "Gradient"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1027
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "Pattern"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1028
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "Clip"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1029
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "BasicClip"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1030
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "Mask"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1040
    sget-object v7, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    const-string v8, "View"

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1059
    monitor-exit v0

    goto :goto_a

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 956
    :cond_1d
    :goto_a
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    sget-object v0, Ll/ۘۜܺ;->ܽ:Ljava/util/HashSet;

    invoke-virtual {v0, v6}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto/16 :goto_9

    .line 961
    :cond_1e
    invoke-interface {v5}, Ll/᩵۠ܺ;->ᩴ()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1f

    .line 963
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    goto/16 :goto_9

    .line 971
    :cond_1f
    invoke-interface {v5}, Ll/᩵۠ܺ;->ܳ()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_20

    .line 973
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    goto/16 :goto_9

    .line 982
    :cond_20
    invoke-direct {p0, v4}, Ll/ۘۜܺ;->ۙ(Ll/ܿ۠ܺ;)V

    :cond_21
    if-eqz v1, :cond_22

    .line 831
    iget-object v0, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, v0}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;)V

    .line 924
    :cond_22
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    goto/16 :goto_2b

    .line 351
    :cond_23
    instance-of v0, p1, Ll/᩺ۖܺ;

    if-eqz v0, :cond_27

    .line 352
    check-cast p1, Ll/᩺ۖܺ;

    .line 666
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 668
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_24

    goto/16 :goto_2b

    .line 671
    :cond_24
    iget-object v0, p1, Ll/᩺ۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_25

    .line 672
    iget-object v1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 3745
    :cond_25
    iget-object v0, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 677
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v0

    .line 679
    invoke-direct {p0, p1, v2}, Ll/ۘۜܺ;->ۙ(Ll/ۨ۠ܺ;Z)V

    if-eqz v0, :cond_26

    .line 831
    iget-object v0, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, v0}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;)V

    .line 684
    :cond_26
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    goto/16 :goto_2b

    .line 353
    :cond_27
    instance-of v0, p1, Ll/ܰۖܺ;

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v0, :cond_3e

    .line 354
    check-cast p1, Ll/ܰۖܺ;

    .line 1978
    iget-object v0, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    .line 1980
    iget-object v6, p1, Ll/ܰۖܺ;->ۨ:Ll/ܿۖܺ;

    if-eqz v6, :cond_96

    invoke-virtual {v6}, Ll/ܿۖܺ;->᩷()Z

    move-result v6

    if-nez v6, :cond_96

    iget-object v6, p1, Ll/ܰۖܺ;->᩹:Ll/ܿۖܺ;

    if-eqz v6, :cond_96

    .line 1981
    invoke-virtual {v6}, Ll/ܿۖܺ;->᩷()Z

    move-result v6

    if-eqz v6, :cond_28

    goto/16 :goto_2b

    .line 1984
    :cond_28
    iget-object v6, p1, Ll/ܰۖܺ;->ۗ:Ljava/lang/String;

    if-nez v6, :cond_29

    goto/16 :goto_2b

    .line 1988
    :cond_29
    iget-object v6, p1, Ll/۟۠ܺ;->ܶ:Ll/۫ۖܺ;

    if-eqz v6, :cond_2a

    goto :goto_b

    :cond_2a
    sget-object v6, Ll/۫ۖܺ;->ۤ:Ll/۫ۖܺ;

    .line 1991
    :goto_b
    iget-object v7, p1, Ll/ܿ۠ܺ;->ۙ:Ll/֫ۜܺ;

    invoke-virtual {v7}, Ll/֫ۜܺ;->ᩴ()Ll/᩶ۖܺ;

    move-result-object v7

    if-nez v7, :cond_2b

    move-object v8, v1

    goto :goto_c

    .line 1992
    :cond_2b
    iget-object v8, p1, Ll/ܰۖܺ;->ۗ:Ljava/lang/String;

    invoke-interface {v7, v8}, Ll/᩶ۖܺ;->ۙ(Ljava/lang/String;)Ll/ۤ۠ܺ;

    move-result-object v8

    :goto_c
    if-nez v7, :cond_30

    .line 1993
    iget-object v9, p1, Ll/ܰۖܺ;->ۗ:Ljava/lang/String;

    const-string v10, "data:"

    .line 2066
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2c

    goto :goto_d

    .line 2068
    :cond_2c
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    const/16 v11, 0xe

    if-ge v10, v11, :cond_2d

    goto :goto_d

    :cond_2d
    const/16 v10, 0x2c

    .line 2071
    invoke-virtual {v9, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    const/16 v11, 0xc

    if-ge v10, v11, :cond_2e

    goto :goto_d

    :cond_2e
    const-string v11, ";base64"

    add-int/lit8 v12, v10, -0x7

    .line 2074
    invoke-virtual {v9, v12, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2f

    goto :goto_d

    :cond_2f
    add-int/2addr v10, v2

    .line 2077
    :try_start_2
    invoke-virtual {v9, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    .line 2078
    array-length v9, v2

    invoke-static {v2, v5, v9}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_e

    :cond_30
    if-nez v8, :cond_31

    :catch_0
    :goto_d
    move-object v2, v1

    goto :goto_e

    .line 1993
    :cond_31
    iget-object v2, v8, Ll/ۤ۠ܺ;->ۙ:Landroid/graphics/Bitmap;

    :goto_e
    if-nez v2, :cond_32

    if-nez v7, :cond_32

    goto/16 :goto_2b

    :cond_32
    if-nez v2, :cond_33

    goto/16 :goto_2b

    .line 2006
    :cond_33
    new-instance v5, Ll/֫ۖܺ;

    if-nez v8, :cond_34

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    goto :goto_f

    :cond_34
    iget v7, v8, Ll/ۤ۠ܺ;->ۤ:I

    :goto_f
    int-to-float v7, v7

    if-nez v8, :cond_35

    .line 2007
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    goto :goto_10

    :cond_35
    iget v9, v8, Ll/ۤ۠ܺ;->᩷:I

    :goto_10
    int-to-float v9, v9

    invoke-direct {v5, v3, v3, v7, v9}, Ll/֫ۖܺ;-><init>(FFFF)V

    .line 2009
    iget-object v7, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v7, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 2011
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v7

    if-nez v7, :cond_36

    goto/16 :goto_2b

    .line 2013
    :cond_36
    invoke-direct {p0}, Ll/ۘۜܺ;->ܺ()Z

    move-result v7

    if-nez v7, :cond_37

    goto/16 :goto_2b

    .line 2016
    :cond_37
    iget-object v7, p1, Ll/ܰۖܺ;->᩵:Landroid/graphics/Matrix;

    if-eqz v7, :cond_38

    .line 2017
    invoke-virtual {v0, v7}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 2020
    :cond_38
    iget-object v7, p1, Ll/ܰۖܺ;->ۛ:Ll/ܿۖܺ;

    if-eqz v7, :cond_39

    invoke-virtual {v7, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v7

    goto :goto_11

    :cond_39
    const/4 v7, 0x0

    .line 2021
    :goto_11
    iget-object v9, p1, Ll/ܰۖܺ;->᩺:Ll/ܿۖܺ;

    if-eqz v9, :cond_3a

    invoke-virtual {v9, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v9

    goto :goto_12

    :cond_3a
    const/4 v9, 0x0

    .line 2022
    :goto_12
    iget-object v10, p1, Ll/ܰۖܺ;->ۨ:Ll/ܿۖܺ;

    invoke-virtual {v10, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v10

    .line 2023
    iget-object v11, p1, Ll/ܰۖܺ;->᩹:Ll/ܿۖܺ;

    invoke-virtual {v11, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v11

    .line 2024
    iget-object v12, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    new-instance v13, Ll/֫ۖܺ;

    invoke-direct {v13, v7, v9, v10, v11}, Ll/֫ۖܺ;-><init>(FFFF)V

    iput-object v13, v12, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    .line 2026
    iget-object v7, v12, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v7, v7, Ll/᩹۠ܺ;->۫ۙ:Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-nez v7, :cond_3b

    .line 2027
    iget-object v7, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v7, v7, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    iget v9, v7, Ll/֫ۖܺ;->᩷:F

    iget v10, v7, Ll/֫ۖܺ;->ۤ:F

    iget v11, v7, Ll/֫ۖܺ;->᩸:F

    iget v7, v7, Ll/֫ۖܺ;->ۙ:F

    invoke-direct {p0, v9, v10, v11, v7}, Ll/ۘۜܺ;->ۙ(FFFF)V

    .line 2030
    :cond_3b
    iget-object v7, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v7, v7, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    iput-object v7, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    .line 2031
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    .line 3745
    iget-object v7, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v7}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 2035
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v7

    .line 2037
    invoke-direct {p0}, Ll/ۘۜܺ;->᩻()V

    .line 2039
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 2042
    iget-object v9, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v9, v9, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    invoke-static {v9, v5, v6}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;Ll/֫ۖܺ;Ll/۫ۖܺ;)Landroid/graphics/Matrix;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 2044
    new-instance v5, Landroid/graphics/Paint;

    iget-object v6, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v6, v6, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v6, v6, Ll/᩹۠ܺ;->ۙۙ:Ll/ۧ۠ܺ;

    sget-object v9, Ll/ۧ۠ܺ;->֡:Ll/ۧ۠ܺ;

    if-ne v6, v9, :cond_3c

    const/4 v4, 0x0

    :cond_3c
    invoke-direct {v5, v4}, Landroid/graphics/Paint;-><init>(I)V

    if-nez v8, :cond_3d

    .line 2046
    invoke-virtual {v0, v2, v3, v3, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_13

    .line 2048
    :cond_3d
    new-instance v4, Landroid/graphics/RectF;

    iget v6, v8, Ll/ۤ۠ܺ;->ۤ:I

    int-to-float v6, v6

    iget v8, v8, Ll/ۤ۠ܺ;->᩷:I

    int-to-float v8, v8

    invoke-direct {v4, v3, v3, v6, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v0, v2, v1, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 2050
    :goto_13
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    if-eqz v7, :cond_96

    goto/16 :goto_1e

    :cond_3e
    const/4 v0, 0x0

    .line 355
    instance-of v1, p1, Ll/ۡۖܺ;

    const/high16 v5, 0x40000000    # 2.0f

    if-eqz v1, :cond_58

    .line 356
    check-cast p1, Ll/ۡۖܺ;

    .line 1138
    iget-object v1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    .line 1140
    iget-object v4, p1, Ll/ۡۖܺ;->᩹:Ll/ۖۖܺ;

    if-nez v4, :cond_3f

    goto/16 :goto_2b

    .line 1143
    :cond_3f
    iget-object v4, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v4, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1145
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v4

    if-nez v4, :cond_40

    goto/16 :goto_2b

    .line 1147
    :cond_40
    invoke-direct {p0}, Ll/ۘۜܺ;->ܺ()Z

    move-result v4

    if-nez v4, :cond_41

    goto/16 :goto_2b

    .line 1149
    :cond_41
    iget-object v4, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v6, v4, Ll/᩵ۜܺ;->ۤ:Z

    if-nez v6, :cond_42

    iget-boolean v4, v4, Ll/᩵ۜܺ;->᩷:Z

    if-nez v4, :cond_42

    goto/16 :goto_2b

    .line 1152
    :cond_42
    iget-object v4, p1, Ll/ۛۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v4, :cond_43

    .line 1153
    invoke-virtual {v1, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1155
    :cond_43
    new-instance v4, Ll/ܽۜܺ;

    iget-object v6, p1, Ll/ۡۖܺ;->᩹:Ll/ۖۖܺ;

    invoke-direct {v4, v6}, Ll/ܽۜܺ;-><init>(Ll/ۖۖܺ;)V

    .line 2625
    iget-object v4, v4, Ll/ܽۜܺ;->ۤ:Landroid/graphics/Path;

    .line 1157
    iget-object v6, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v6, :cond_44

    .line 1158
    invoke-static {v4}, Ll/ۘۜܺ;->ۙ(Landroid/graphics/Path;)Ll/֫ۖܺ;

    move-result-object v6

    iput-object v6, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    .line 1160
    :cond_44
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    .line 1162
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;)V

    .line 3745
    iget-object v6, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v6}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 1165
    iget-object v6, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    .line 891
    iget-object v7, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v7, v7, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v7, v7, Ll/᩹۠ܺ;->ܳۙ:Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    const/high16 v8, 0x3f800000    # 1.0f

    cmpg-float v7, v7, v8

    if-ltz v7, :cond_46

    iget-object v7, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v7, v7, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v7, v7, Ll/᩹۠ܺ;->ᩴۙ:Ljava/lang/String;

    if-eqz v7, :cond_45

    goto :goto_14

    :cond_45
    const/4 v2, 0x0

    goto/16 :goto_1c

    .line 780
    :cond_46
    :goto_14
    iget-boolean v7, p0, Ll/ۘۜܺ;->ܳ:Z

    if-eqz v7, :cond_54

    invoke-virtual {v1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v7

    if-nez v7, :cond_54

    iget-object v7, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v7, v7, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v9, v7, Ll/᩹۠ܺ;->ᩴۙ:Ljava/lang/String;

    if-nez v9, :cond_54

    iget-object v9, v7, Ll/᩹۠ܺ;->᩸ۙ:Ljava/lang/String;

    if-nez v9, :cond_54

    iget-object v9, v7, Ll/᩹۠ܺ;->ۤۙ:Ljava/lang/String;

    if-nez v9, :cond_54

    iget-object v9, v7, Ll/᩹۠ܺ;->᩷ۙ:Ljava/lang/String;

    if-nez v9, :cond_54

    iget-object v9, v7, Ll/᩹۠ܺ;->ۢ:Ll/֡۠ܺ;

    instance-of v9, v9, Ll/֨ۖܺ;

    if-nez v9, :cond_54

    iget-object v9, v7, Ll/᩹۠ܺ;->ܽۙ:Ll/֡۠ܺ;

    instance-of v9, v9, Ll/֨ۖܺ;

    if-nez v9, :cond_54

    iget-object v7, v7, Ll/᩹۠ܺ;->᩶ۙ:Ll/ܶ۠ܺ;

    sget-object v9, Ll/ܶ۠ܺ;->᩶:Ll/ܶ۠ܺ;

    if-ne v7, v9, :cond_47

    goto/16 :goto_1b

    :cond_47
    const/16 v7, 0x9

    new-array v9, v7, [F

    .line 787
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v10

    invoke-virtual {v10, v9}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v10, 0x0

    :goto_15
    if-ge v10, v7, :cond_4a

    .line 788
    aget v11, v9, v10

    .line 789
    invoke-static {v11}, Ljava/lang/Float;->isNaN(F)Z

    move-result v12

    if-nez v12, :cond_49

    invoke-static {v11}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v11

    if-eqz v11, :cond_48

    goto :goto_16

    :cond_48
    add-int/lit8 v10, v10, 0x1

    goto :goto_15

    .line 790
    :cond_49
    :goto_16
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v2

    goto/16 :goto_1c

    .line 793
    :cond_4a
    aget v7, v9, v2

    cmpl-float v7, v7, v3

    if-nez v7, :cond_53

    const/4 v7, 0x3

    aget v7, v9, v7

    cmpl-float v7, v7, v3

    if-nez v7, :cond_53

    const/4 v7, 0x6

    aget v7, v9, v7

    cmpl-float v7, v7, v3

    if-nez v7, :cond_53

    const/4 v7, 0x7

    aget v7, v9, v7

    cmpl-float v7, v7, v3

    if-nez v7, :cond_53

    const/16 v7, 0x8

    aget v7, v9, v7

    cmpl-float v7, v7, v8

    if-eqz v7, :cond_4b

    goto/16 :goto_1a

    .line 796
    :cond_4b
    aget v0, v9, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v7, 0x4

    .line 797
    aget v7, v9, v7

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    cmpl-float v8, v0, v3

    if-eqz v8, :cond_52

    cmpl-float v8, v7, v3

    if-nez v8, :cond_4c

    goto/16 :goto_19

    .line 802
    :cond_4c
    iget-object v8, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v9, v8, Ll/᩵ۜܺ;->ۤ:Z

    if-eqz v9, :cond_4f

    .line 803
    iget-object v8, v8, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    invoke-virtual {v8}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v8

    cmpl-float v3, v8, v3

    if-gtz v3, :cond_4d

    .line 806
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v2

    goto/16 :goto_1c

    .line 807
    :cond_4d
    iget-object v3, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v3, v3, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeJoin()Landroid/graphics/Paint$Join;

    move-result-object v3

    sget-object v9, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    if-ne v3, v9, :cond_4e

    .line 808
    iget-object v3, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v3, v3, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeMiter()F

    move-result v3

    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    goto :goto_17

    :cond_4e
    const/high16 v3, 0x40000000    # 2.0f

    :goto_17
    const/high16 v9, 0x3f000000    # 0.5f

    mul-float v8, v8, v9

    mul-float v3, v3, v8

    .line 812
    :cond_4f
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    new-instance v8, Landroid/graphics/RectF;

    iget v9, v6, Ll/֫ۖܺ;->᩷:F

    iget v10, v6, Ll/֫ۖܺ;->ۤ:F

    invoke-virtual {v6}, Ll/֫ۖܺ;->ۙ()F

    move-result v11

    invoke-virtual {v6}, Ll/֫ۖܺ;->᩷()F

    move-result v6

    invoke-direct {v8, v9, v10, v11, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    neg-float v3, v3

    div-float v0, v5, v0

    sub-float v0, v3, v0

    div-float/2addr v5, v7

    sub-float/2addr v3, v5

    .line 813
    invoke-virtual {v8, v0, v3}, Landroid/graphics/RectF;->inset(FF)V

    .line 814
    iget v0, v8, Landroid/graphics/RectF;->left:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_51

    iget v0, v8, Landroid/graphics/RectF;->left:F

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_51

    iget v0, v8, Landroid/graphics/RectF;->top:F

    .line 815
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_51

    iget v0, v8, Landroid/graphics/RectF;->top:F

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_51

    iget v0, v8, Landroid/graphics/RectF;->right:F

    .line 816
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_51

    iget v0, v8, Landroid/graphics/RectF;->right:F

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_51

    iget v0, v8, Landroid/graphics/RectF;->bottom:F

    .line 817
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_51

    iget v0, v8, Landroid/graphics/RectF;->bottom:F

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-eqz v0, :cond_50

    goto :goto_18

    .line 821
    :cond_50
    invoke-virtual {v1, v8}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 822
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ܳۙ:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Ll/ۘۜܺ;->ۙ(F)I

    move-result v0

    const/16 v3, 0x1f

    invoke-virtual {v1, v8, v0, v3}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;II)I

    .line 824
    iget-object v0, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    iget-object v1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1c

    .line 818
    :cond_51
    :goto_18
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v2

    goto :goto_1c

    .line 799
    :cond_52
    :goto_19
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v2

    goto :goto_1c

    .line 795
    :cond_53
    :goto_1a
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v2

    goto :goto_1c

    .line 784
    :cond_54
    :goto_1b
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v2

    .line 1167
    :goto_1c
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v1, v0, Ll/᩵ۜܺ;->᩷:Z

    if-eqz v1, :cond_56

    .line 2561
    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ۡ:Ll/ܳ۠ܺ;

    if-eqz v0, :cond_55

    sget-object v1, Ll/ܳ۠ܺ;->᩶:Ll/ܳ۠ܺ;

    if-ne v0, v1, :cond_55

    .line 2562
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    goto :goto_1d

    .line 2564
    :cond_55
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 1168
    :goto_1d
    invoke-virtual {v4, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 1169
    invoke-direct {p0, p1, v4}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;Landroid/graphics/Path;)V

    .line 1171
    :cond_56
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v0, v0, Ll/᩵ۜܺ;->ۤ:Z

    if-eqz v0, :cond_57

    .line 1172
    invoke-direct {p0, v4}, Ll/ۘۜܺ;->᩷(Landroid/graphics/Path;)V

    .line 1174
    :cond_57
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۛۖܺ;)V

    if-eqz v2, :cond_96

    goto/16 :goto_1e

    .line 357
    :cond_58
    instance-of v0, p1, Ll/᩷۠ܺ;

    if-eqz v0, :cond_5f

    .line 358
    check-cast p1, Ll/᩷۠ܺ;

    .line 1196
    iget-object v0, p1, Ll/᩷۠ܺ;->ۨ:Ll/ܿۖܺ;

    if-eqz v0, :cond_96

    iget-object v1, p1, Ll/᩷۠ܺ;->᩹:Ll/ܿۖܺ;

    if-eqz v1, :cond_96

    invoke-virtual {v0}, Ll/ܿۖܺ;->᩷()Z

    move-result v0

    if-nez v0, :cond_96

    iget-object v0, p1, Ll/᩷۠ܺ;->᩹:Ll/ܿۖܺ;

    invoke-virtual {v0}, Ll/ܿۖܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_59

    goto/16 :goto_2b

    .line 1199
    :cond_59
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1201
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_5a

    goto/16 :goto_2b

    .line 1203
    :cond_5a
    invoke-direct {p0}, Ll/ۘۜܺ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_5b

    goto/16 :goto_2b

    .line 1206
    :cond_5b
    iget-object v0, p1, Ll/ۛۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_5c

    .line 1207
    iget-object v1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1209
    :cond_5c
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩷۠ܺ;)Landroid/graphics/Path;

    move-result-object v0

    .line 1210
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    .line 1212
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;)V

    .line 3745
    iget-object v1, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v1}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 1215
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v1

    .line 1217
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v2, v2, Ll/᩵ۜܺ;->᩷:Z

    if-eqz v2, :cond_5d

    .line 1218
    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;Landroid/graphics/Path;)V

    .line 1219
    :cond_5d
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v2, v2, Ll/᩵ۜܺ;->ۤ:Z

    if-eqz v2, :cond_5e

    .line 1220
    invoke-direct {p0, v0}, Ll/ۘۜܺ;->᩷(Landroid/graphics/Path;)V

    :cond_5e
    if-eqz v1, :cond_96

    goto :goto_1e

    .line 359
    :cond_5f
    instance-of v0, p1, Ll/᩻ۖܺ;

    if-eqz v0, :cond_66

    .line 360
    check-cast p1, Ll/᩻ۖܺ;

    .line 1235
    iget-object v0, p1, Ll/᩻ۖܺ;->᩵:Ll/ܿۖܺ;

    if-eqz v0, :cond_96

    invoke-virtual {v0}, Ll/ܿۖܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_60

    goto/16 :goto_2b

    .line 1238
    :cond_60
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1240
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_61

    goto/16 :goto_2b

    .line 1242
    :cond_61
    invoke-direct {p0}, Ll/ۘۜܺ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_62

    goto/16 :goto_2b

    .line 1245
    :cond_62
    iget-object v0, p1, Ll/ۛۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_63

    .line 1246
    iget-object v1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1248
    :cond_63
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩻ۖܺ;)Landroid/graphics/Path;

    move-result-object v0

    .line 1249
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    .line 1251
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;)V

    .line 3745
    iget-object v1, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v1}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 1254
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v1

    .line 1256
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v2, v2, Ll/᩵ۜܺ;->᩷:Z

    if-eqz v2, :cond_64

    .line 1257
    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;Landroid/graphics/Path;)V

    .line 1258
    :cond_64
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v2, v2, Ll/᩵ۜܺ;->ۤ:Z

    if-eqz v2, :cond_65

    .line 1259
    invoke-direct {p0, v0}, Ll/ۘۜܺ;->᩷(Landroid/graphics/Path;)V

    :cond_65
    if-eqz v1, :cond_96

    .line 831
    :goto_1e
    iget-object p1, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;)V

    goto/16 :goto_2b

    .line 361
    :cond_66
    instance-of v0, p1, Ll/ۗۖܺ;

    if-eqz v0, :cond_6d

    .line 362
    check-cast p1, Ll/ۗۖܺ;

    .line 1273
    iget-object v0, p1, Ll/ۗۖܺ;->᩵:Ll/ܿۖܺ;

    if-eqz v0, :cond_96

    iget-object v1, p1, Ll/ۗۖܺ;->ۨ:Ll/ܿۖܺ;

    if-eqz v1, :cond_96

    invoke-virtual {v0}, Ll/ܿۖܺ;->᩷()Z

    move-result v0

    if-nez v0, :cond_96

    iget-object v0, p1, Ll/ۗۖܺ;->ۨ:Ll/ܿۖܺ;

    invoke-virtual {v0}, Ll/ܿۖܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_67

    goto/16 :goto_2b

    .line 1276
    :cond_67
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1278
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_68

    goto/16 :goto_2b

    .line 1280
    :cond_68
    invoke-direct {p0}, Ll/ۘۜܺ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_69

    goto/16 :goto_2b

    .line 1283
    :cond_69
    iget-object v0, p1, Ll/ۛۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_6a

    .line 1284
    iget-object v1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1286
    :cond_6a
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۗۖܺ;)Landroid/graphics/Path;

    move-result-object v0

    .line 1287
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    .line 1289
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;)V

    .line 3745
    iget-object v1, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v1}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 1292
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v1

    .line 1294
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v2, v2, Ll/᩵ۜܺ;->᩷:Z

    if-eqz v2, :cond_6b

    .line 1295
    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;Landroid/graphics/Path;)V

    .line 1296
    :cond_6b
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v2, v2, Ll/᩵ۜܺ;->ۤ:Z

    if-eqz v2, :cond_6c

    .line 1297
    invoke-direct {p0, v0}, Ll/ۘۜܺ;->᩷(Landroid/graphics/Path;)V

    :cond_6c
    if-eqz v1, :cond_96

    goto :goto_1e

    .line 363
    :cond_6d
    instance-of v0, p1, Ll/֡ۖܺ;

    if-eqz v0, :cond_77

    .line 364
    check-cast p1, Ll/֡ۖܺ;

    .line 1311
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1313
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_6e

    goto/16 :goto_2b

    .line 1315
    :cond_6e
    invoke-direct {p0}, Ll/ۘۜܺ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_6f

    goto/16 :goto_2b

    .line 1317
    :cond_6f
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v0, v0, Ll/᩵ۜܺ;->ۤ:Z

    if-nez v0, :cond_70

    goto/16 :goto_2b

    .line 1320
    :cond_70
    iget-object v0, p1, Ll/ۛۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_71

    .line 1321
    iget-object v1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 4243
    :cond_71
    iget-object v0, p1, Ll/֡ۖܺ;->᩹:Ll/ܿۖܺ;

    if-nez v0, :cond_72

    const/4 v0, 0x0

    goto :goto_1f

    :cond_72
    invoke-virtual {v0, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v0

    .line 4244
    :goto_1f
    iget-object v1, p1, Ll/֡ۖܺ;->᩵:Ll/ܿۖܺ;

    if-nez v1, :cond_73

    const/4 v1, 0x0

    goto :goto_20

    :cond_73
    invoke-virtual {v1, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v1

    .line 4245
    :goto_20
    iget-object v2, p1, Ll/֡ۖܺ;->ۗ:Ll/ܿۖܺ;

    if-nez v2, :cond_74

    const/4 v2, 0x0

    goto :goto_21

    :cond_74
    invoke-virtual {v2, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v2

    .line 4246
    :goto_21
    iget-object v4, p1, Ll/֡ۖܺ;->ۨ:Ll/ܿۖܺ;

    if-nez v4, :cond_75

    goto :goto_22

    :cond_75
    invoke-virtual {v4, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v3

    .line 4248
    :goto_22
    iget-object v4, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v4, :cond_76

    .line 4249
    new-instance v4, Ll/֫ۖܺ;

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v6

    sub-float v7, v2, v0

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    sub-float v8, v3, v1

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    invoke-direct {v4, v5, v6, v7, v8}, Ll/֫ۖܺ;-><init>(FFFF)V

    iput-object v4, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    .line 4252
    :cond_76
    new-instance v4, Landroid/graphics/Path;

    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 4253
    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 4254
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1324
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    .line 1326
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;)V

    .line 3745
    iget-object v0, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 1329
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v0

    .line 1331
    invoke-direct {p0, v4}, Ll/ۘۜܺ;->᩷(Landroid/graphics/Path;)V

    .line 1333
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۛۖܺ;)V

    if-eqz v0, :cond_96

    goto/16 :goto_1e

    .line 365
    :cond_77
    instance-of v0, p1, Ll/ۙ۠ܺ;

    if-eqz v0, :cond_7f

    .line 366
    check-cast p1, Ll/ۙ۠ܺ;

    .line 1447
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1449
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_78

    goto/16 :goto_2b

    .line 1451
    :cond_78
    invoke-direct {p0}, Ll/ۘۜܺ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_79

    goto/16 :goto_2b

    .line 1453
    :cond_79
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v1, v0, Ll/᩵ۜܺ;->ۤ:Z

    if-nez v1, :cond_7a

    iget-boolean v0, v0, Ll/᩵ۜܺ;->᩷:Z

    if-nez v0, :cond_7a

    goto/16 :goto_2b

    .line 1456
    :cond_7a
    iget-object v0, p1, Ll/ۛۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_7b

    .line 1457
    iget-object v1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1459
    :cond_7b
    iget-object v0, p1, Ll/۬ۖܺ;->᩹:[F

    array-length v0, v0

    if-ge v0, v4, :cond_7c

    goto/16 :goto_2b

    .line 1463
    :cond_7c
    invoke-static {p1}, Ll/ۘۜܺ;->ۙ(Ll/۬ۖܺ;)Landroid/graphics/Path;

    move-result-object v0

    .line 1464
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    .line 1466
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;)V

    .line 3745
    iget-object v1, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v1}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 1469
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v1

    .line 1471
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v2, v2, Ll/᩵ۜܺ;->᩷:Z

    if-eqz v2, :cond_7d

    .line 1472
    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;Landroid/graphics/Path;)V

    .line 1473
    :cond_7d
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v2, v2, Ll/᩵ۜܺ;->ۤ:Z

    if-eqz v2, :cond_7e

    .line 1474
    invoke-direct {p0, v0}, Ll/ۘۜܺ;->᩷(Landroid/graphics/Path;)V

    .line 1476
    :cond_7e
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۛۖܺ;)V

    if-eqz v1, :cond_96

    goto/16 :goto_1e

    .line 367
    :cond_7f
    instance-of v0, p1, Ll/۬ۖܺ;

    if-eqz v0, :cond_88

    .line 368
    check-cast p1, Ll/۬ۖܺ;

    .line 1362
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1364
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_80

    goto/16 :goto_2b

    .line 1366
    :cond_80
    invoke-direct {p0}, Ll/ۘۜܺ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_81

    goto/16 :goto_2b

    .line 1368
    :cond_81
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v1, v0, Ll/᩵ۜܺ;->ۤ:Z

    if-nez v1, :cond_82

    iget-boolean v0, v0, Ll/᩵ۜܺ;->᩷:Z

    if-nez v0, :cond_82

    goto/16 :goto_2b

    .line 1371
    :cond_82
    iget-object v0, p1, Ll/ۛۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_83

    .line 1372
    iget-object v1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1374
    :cond_83
    iget-object v0, p1, Ll/۬ۖܺ;->᩹:[F

    array-length v0, v0

    if-ge v0, v4, :cond_84

    goto/16 :goto_2b

    .line 1378
    :cond_84
    invoke-static {p1}, Ll/ۘۜܺ;->ۙ(Ll/۬ۖܺ;)Landroid/graphics/Path;

    move-result-object v0

    .line 1379
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    .line 2561
    iget-object v1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v1, v1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, v1, Ll/᩹۠ܺ;->ۡ:Ll/ܳ۠ܺ;

    if-eqz v1, :cond_85

    sget-object v2, Ll/ܳ۠ܺ;->᩶:Ll/ܳ۠ܺ;

    if-ne v1, v2, :cond_85

    .line 2562
    sget-object v1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    goto :goto_23

    .line 2564
    :cond_85
    sget-object v1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 1381
    :goto_23
    invoke-virtual {v0, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 1383
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;)V

    .line 3745
    iget-object v1, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v1}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 1386
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v1

    .line 1388
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v2, v2, Ll/᩵ۜܺ;->᩷:Z

    if-eqz v2, :cond_86

    .line 1389
    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;Landroid/graphics/Path;)V

    .line 1390
    :cond_86
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-boolean v2, v2, Ll/᩵ۜܺ;->ۤ:Z

    if-eqz v2, :cond_87

    .line 1391
    invoke-direct {p0, v0}, Ll/ۘۜܺ;->᩷(Landroid/graphics/Path;)V

    .line 1393
    :cond_87
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۛۖܺ;)V

    if-eqz v1, :cond_96

    goto/16 :goto_1e

    .line 369
    :cond_88
    instance-of v0, p1, Ll/ۜ۠ܺ;

    if-eqz v0, :cond_96

    .line 370
    check-cast p1, Ll/ۜ۠ܺ;

    .line 1490
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 1492
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_89

    goto/16 :goto_2b

    .line 1495
    :cond_89
    iget-object v0, p1, Ll/ۜ۠ܺ;->ۨ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_8a

    .line 1496
    iget-object v1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1499
    :cond_8a
    iget-object v0, p1, Ll/ۤۜܺ;->ۗ:Ljava/util/ArrayList;

    if-eqz v0, :cond_8c

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_8b

    goto :goto_24

    :cond_8b
    iget-object v0, p1, Ll/ۤۜܺ;->ۗ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿۖܺ;

    invoke-virtual {v0, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v0

    goto :goto_25

    :cond_8c
    :goto_24
    const/4 v0, 0x0

    .line 1500
    :goto_25
    iget-object v1, p1, Ll/ۤۜܺ;->᩵:Ljava/util/ArrayList;

    if-eqz v1, :cond_8e

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_8d

    goto :goto_26

    :cond_8d
    iget-object v1, p1, Ll/ۤۜܺ;->᩵:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۖܺ;

    invoke-virtual {v1, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v1

    goto :goto_27

    :cond_8e
    :goto_26
    const/4 v1, 0x0

    .line 1501
    :goto_27
    iget-object v2, p1, Ll/ۤۜܺ;->ܶ:Ljava/util/ArrayList;

    if-eqz v2, :cond_90

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_8f

    goto :goto_28

    :cond_8f
    iget-object v2, p1, Ll/ۤۜܺ;->ܶ:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿۖܺ;

    invoke-virtual {v2, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v2

    goto :goto_29

    :cond_90
    :goto_28
    const/4 v2, 0x0

    .line 1502
    :goto_29
    iget-object v4, p1, Ll/ۤۜܺ;->᩹:Ljava/util/ArrayList;

    if-eqz v4, :cond_92

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_91

    goto :goto_2a

    :cond_91
    iget-object v3, p1, Ll/ۤۜܺ;->᩹:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿۖܺ;

    invoke-virtual {v3, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v3

    .line 1505
    :cond_92
    :goto_2a
    invoke-direct {p0}, Ll/ۘۜܺ;->ܳ()Ll/᩻۠ܺ;

    move-result-object v4

    .line 1506
    sget-object v6, Ll/᩻۠ܺ;->֡:Ll/᩻۠ܺ;

    if-eq v4, v6, :cond_94

    .line 1507
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;)F

    move-result v6

    .line 1508
    sget-object v7, Ll/᩻۠ܺ;->ܿ:Ll/᩻۠ܺ;

    if-ne v4, v7, :cond_93

    div-float/2addr v6, v5

    :cond_93
    sub-float/2addr v0, v6

    .line 1515
    :cond_94
    iget-object v4, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v4, :cond_95

    .line 1516
    new-instance v4, Ll/ۨۜܺ;

    invoke-direct {v4, p0, v0, v1}, Ll/ۨۜܺ;-><init>(Ll/ۘۜܺ;FF)V

    .line 1517
    invoke-direct {p0, p1, v4}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;Ll/ۛۜܺ;)V

    .line 1518
    new-instance v5, Ll/֫ۖܺ;

    iget-object v6, v4, Ll/ۨۜܺ;->ۙ:Landroid/graphics/RectF;

    iget v7, v6, Landroid/graphics/RectF;->left:F

    iget v8, v6, Landroid/graphics/RectF;->top:F

    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    move-result v6

    iget-object v4, v4, Ll/ۨۜܺ;->ۙ:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    invoke-direct {v5, v7, v8, v6, v4}, Ll/֫ۖܺ;-><init>(FFFF)V

    iput-object v5, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    .line 1520
    :cond_95
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۤ(Ll/ۘ۠ܺ;)V

    .line 1522
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;)V

    .line 3745
    iget-object v4, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v4}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V

    .line 1525
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v4

    .line 1527
    new-instance v5, Ll/᩹ۜܺ;

    add-float/2addr v0, v2

    add-float/2addr v1, v3

    invoke-direct {v5, p0, v0, v1}, Ll/᩹ۜܺ;-><init>(Ll/ۘۜܺ;FF)V

    invoke-direct {p0, p1, v5}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;Ll/ۛۜܺ;)V

    if-eqz v4, :cond_96

    goto/16 :goto_1e

    .line 374
    :cond_96
    :goto_2b
    invoke-direct {p0}, Ll/ۘۜܺ;->֫()V

    return-void
.end method

.method private ۙ(Ll/ܿ۠ܺ;Ll/᩵ۜܺ;)V
    .locals 3

    .line 3319
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3323
    :goto_0
    instance-of v1, p1, Ll/ܰ۠ܺ;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 3324
    move-object v2, p1

    check-cast v2, Ll/ܰ۠ܺ;

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 3326
    :cond_0
    iget-object p1, p1, Ll/ܿ۠ܺ;->᩷:Ll/᩺۠ܺ;

    if-nez p1, :cond_2

    .line 3332
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰ۠ܺ;

    .line 3333
    invoke-direct {p0, p2, v0}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    goto :goto_1

    .line 3336
    :cond_1
    iget-object p1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, p1, Ll/᩵ۜܺ;->۫:Ll/֫ۖܺ;

    iput-object v0, p2, Ll/᩵ۜܺ;->۫:Ll/֫ۖܺ;

    .line 3337
    iget-object p1, p1, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    iput-object p1, p2, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    return-void

    .line 3328
    :cond_2
    check-cast p1, Ll/ܿ۠ܺ;

    goto :goto_0
.end method

.method private ۙ(Ll/ᩳۖܺ;Ll/֫ۖܺ;)V
    .locals 4

    .line 4636
    iget-object v0, p1, Ll/ᩳۖܺ;->ۗ:Ljava/lang/Boolean;

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4641
    iget-object v0, p1, Ll/ᩳۖܺ;->᩵:Ll/ܿۖܺ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p2, Ll/֫ۖܺ;->᩸:F

    .line 4642
    :goto_0
    iget-object v2, p1, Ll/ᩳۖܺ;->ܶ:Ll/ܿۖܺ;

    if-eqz v2, :cond_1

    invoke-virtual {v2, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v2

    goto :goto_2

    :cond_1
    iget v2, p2, Ll/֫ۖܺ;->ۙ:F

    goto :goto_2

    .line 4651
    :cond_2
    iget-object v0, p1, Ll/ᩳۖܺ;->᩵:Ll/ܿۖܺ;

    const v2, 0x3f99999a    # 1.2f

    if-eqz v0, :cond_3

    invoke-virtual {v0, p0, v1}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v0

    goto :goto_1

    :cond_3
    const v0, 0x3f99999a    # 1.2f

    .line 4652
    :goto_1
    iget-object v3, p1, Ll/ᩳۖܺ;->ܶ:Ll/ܿۖܺ;

    if-eqz v3, :cond_4

    invoke-virtual {v3, p0, v1}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v2

    .line 4655
    :cond_4
    iget v3, p2, Ll/֫ۖܺ;->᩸:F

    mul-float v0, v0, v3

    .line 4656
    iget v3, p2, Ll/֫ۖܺ;->ۙ:F

    mul-float v2, v2, v3

    :goto_2
    const/4 v3, 0x0

    cmpl-float v0, v0, v3

    if-eqz v0, :cond_9

    cmpl-float v0, v2, v3

    if-nez v0, :cond_5

    goto :goto_4

    .line 4662
    :cond_5
    invoke-direct {p0}, Ll/ۘۜܺ;->ۧ()V

    .line 4664
    invoke-direct {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/ܰ۠ܺ;)Ll/᩵ۜܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    .line 4667
    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, v0, Ll/᩹۠ܺ;->ܳۙ:Ljava/lang/Float;

    .line 4670
    invoke-direct {p0}, Ll/ۘۜܺ;->ۚ()Z

    move-result v0

    .line 4673
    iget-object v1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 4675
    iget-object v2, p1, Ll/ᩳۖܺ;->᩹:Ljava/lang/Boolean;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    .line 4677
    :cond_6
    iget v2, p2, Ll/֫ۖܺ;->᩷:F

    iget v3, p2, Ll/֫ۖܺ;->ۤ:F

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 4678
    iget v2, p2, Ll/֫ۖܺ;->᩸:F

    iget v3, p2, Ll/֫ۖܺ;->ۙ:F

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->scale(FF)V

    :cond_7
    :goto_3
    const/4 v2, 0x0

    .line 4682
    invoke-direct {p0, p1, v2}, Ll/ۘۜܺ;->ۙ(Ll/ۨ۠ܺ;Z)V

    .line 4685
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    if-eqz v0, :cond_8

    .line 4688
    invoke-direct {p0, p2}, Ll/ۘۜܺ;->ۙ(Ll/֫ۖܺ;)V

    .line 4691
    :cond_8
    invoke-direct {p0}, Ll/ۘۜܺ;->֫()V

    :cond_9
    :goto_4
    return-void
.end method

.method public static ۙ(Ll/ᩳ۠ܺ;Ll/ᩳ۠ܺ;)V
    .locals 1

    .line 3678
    iget-object v0, p0, Ll/ᩳ۠ܺ;->ܽ:Ll/ܿۖܺ;

    if-nez v0, :cond_0

    .line 3679
    iget-object v0, p1, Ll/ᩳ۠ܺ;->ܽ:Ll/ܿۖܺ;

    iput-object v0, p0, Ll/ᩳ۠ܺ;->ܽ:Ll/ܿۖܺ;

    .line 3680
    :cond_0
    iget-object v0, p0, Ll/ᩳ۠ܺ;->ܶ:Ll/ܿۖܺ;

    if-nez v0, :cond_1

    .line 3681
    iget-object v0, p1, Ll/ᩳ۠ܺ;->ܶ:Ll/ܿۖܺ;

    iput-object v0, p0, Ll/ᩳ۠ܺ;->ܶ:Ll/ܿۖܺ;

    .line 3682
    :cond_1
    iget-object v0, p0, Ll/ᩳ۠ܺ;->᩵:Ll/ܿۖܺ;

    if-nez v0, :cond_2

    .line 3683
    iget-object v0, p1, Ll/ᩳ۠ܺ;->᩵:Ll/ܿۖܺ;

    iput-object v0, p0, Ll/ᩳ۠ܺ;->᩵:Ll/ܿۖܺ;

    .line 3684
    :cond_2
    iget-object v0, p0, Ll/ᩳ۠ܺ;->᩹:Ll/ܿۖܺ;

    if-nez v0, :cond_3

    .line 3685
    iget-object v0, p1, Ll/ᩳ۠ܺ;->᩹:Ll/ܿۖܺ;

    iput-object v0, p0, Ll/ᩳ۠ܺ;->᩹:Ll/ܿۖܺ;

    .line 3686
    :cond_3
    iget-object v0, p0, Ll/ᩳ۠ܺ;->ۗ:Ll/ܿۖܺ;

    if-nez v0, :cond_4

    .line 3687
    iget-object p1, p1, Ll/ᩳ۠ܺ;->ۗ:Ll/ܿۖܺ;

    iput-object p1, p0, Ll/ᩳ۠ܺ;->ۗ:Ll/ܿۖܺ;

    :cond_4
    return-void
.end method

.method public static ۙ(Ll/᩵ۖܺ;Ljava/lang/String;)V
    .locals 3

    .line 3622
    iget-object v0, p0, Ll/ܿ۠ܺ;->ۙ:Ll/֫ۜܺ;

    invoke-virtual {v0, p1}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object p1

    if-nez p1, :cond_0

    goto/16 :goto_1

    .line 3628
    :cond_0
    instance-of v0, p1, Ll/᩵ۖܺ;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    if-ne p1, p0, :cond_2

    goto :goto_1

    .line 3637
    :cond_2
    move-object v0, p1

    check-cast v0, Ll/᩵ۖܺ;

    .line 3639
    iget-object v1, p0, Ll/᩵ۖܺ;->ۧ:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    .line 3640
    iget-object v1, v0, Ll/᩵ۖܺ;->ۧ:Ljava/lang/Boolean;

    iput-object v1, p0, Ll/᩵ۖܺ;->ۧ:Ljava/lang/Boolean;

    .line 3641
    :cond_3
    iget-object v1, p0, Ll/᩵ۖܺ;->֫:Landroid/graphics/Matrix;

    if-nez v1, :cond_4

    .line 3642
    iget-object v1, v0, Ll/᩵ۖܺ;->֫:Landroid/graphics/Matrix;

    iput-object v1, p0, Ll/᩵ۖܺ;->֫:Landroid/graphics/Matrix;

    .line 3643
    :cond_4
    iget-object v1, p0, Ll/᩵ۖܺ;->ܺ:Ll/ۨۖܺ;

    if-nez v1, :cond_5

    .line 3644
    iget-object v1, v0, Ll/᩵ۖܺ;->ܺ:Ll/ۨۖܺ;

    iput-object v1, p0, Ll/᩵ۖܺ;->ܺ:Ll/ۨۖܺ;

    .line 3645
    :cond_5
    iget-object v1, p0, Ll/᩵ۖܺ;->ۚ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 3646
    iget-object v1, v0, Ll/᩵ۖܺ;->ۚ:Ljava/util/List;

    iput-object v1, p0, Ll/᩵ۖܺ;->ۚ:Ljava/util/List;

    .line 3650
    :cond_6
    :try_start_0
    instance-of v1, p0, Ll/᩶۠ܺ;

    if-eqz v1, :cond_a

    .line 3651
    move-object v1, p0

    check-cast v1, Ll/᩶۠ܺ;

    check-cast p1, Ll/᩶۠ܺ;

    .line 3665
    iget-object v2, v1, Ll/᩶۠ܺ;->ܽ:Ll/ܿۖܺ;

    if-nez v2, :cond_7

    .line 3666
    iget-object v2, p1, Ll/᩶۠ܺ;->ܽ:Ll/ܿۖܺ;

    iput-object v2, v1, Ll/᩶۠ܺ;->ܽ:Ll/ܿۖܺ;

    .line 3667
    :cond_7
    iget-object v2, v1, Ll/᩶۠ܺ;->᩹:Ll/ܿۖܺ;

    if-nez v2, :cond_8

    .line 3668
    iget-object v2, p1, Ll/᩶۠ܺ;->᩹:Ll/ܿۖܺ;

    iput-object v2, v1, Ll/᩶۠ܺ;->᩹:Ll/ܿۖܺ;

    .line 3669
    :cond_8
    iget-object v2, v1, Ll/᩶۠ܺ;->ܶ:Ll/ܿۖܺ;

    if-nez v2, :cond_9

    .line 3670
    iget-object v2, p1, Ll/᩶۠ܺ;->ܶ:Ll/ܿۖܺ;

    iput-object v2, v1, Ll/᩶۠ܺ;->ܶ:Ll/ܿۖܺ;

    .line 3671
    :cond_9
    iget-object v2, v1, Ll/᩶۠ܺ;->ۗ:Ll/ܿۖܺ;

    if-nez v2, :cond_b

    .line 3672
    iget-object p1, p1, Ll/᩶۠ܺ;->ۗ:Ll/ܿۖܺ;

    iput-object p1, v1, Ll/᩶۠ܺ;->ۗ:Ll/ܿۖܺ;

    goto :goto_0

    .line 3653
    :cond_a
    move-object v1, p0

    check-cast v1, Ll/ᩳ۠ܺ;

    check-cast p1, Ll/ᩳ۠ܺ;

    invoke-static {v1, p1}, Ll/ۘۜܺ;->ۙ(Ll/ᩳ۠ܺ;Ll/ᩳ۠ܺ;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 3658
    :cond_b
    :goto_0
    iget-object p1, v0, Ll/᩵ۖܺ;->᩻:Ljava/lang/String;

    if-eqz p1, :cond_c

    .line 3659
    invoke-static {p0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۖܺ;Ljava/lang/String;)V

    :cond_c
    :goto_1
    return-void
.end method

.method private ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V
    .locals 4

    .line 444
    iget-object v0, p2, Ll/ܿ۠ܺ;->᩷:Ll/᩺۠ܺ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 445
    :goto_0
    iget-object v1, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    const/high16 v2, 0x3f800000    # 1.0f

    .line 1351
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 1347
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v3, v1, Ll/᩹۠ܺ;->ᩳ:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    goto :goto_1

    .line 1348
    :cond_1
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    iput-object v3, v1, Ll/᩹۠ܺ;->۫ۙ:Ljava/lang/Boolean;

    const/4 v0, 0x0

    .line 1349
    iput-object v0, v1, Ll/᩹۠ܺ;->ܰ:Ll/ۧۖܺ;

    .line 1350
    iput-object v0, v1, Ll/᩹۠ܺ;->᩶:Ljava/lang/String;

    .line 1351
    iput-object v2, v1, Ll/᩹۠ܺ;->ܳۙ:Ljava/lang/Float;

    .line 1352
    sget-object v3, Ll/ܽۖܺ;->᩶:Ll/ܽۖܺ;

    iput-object v3, v1, Ll/᩹۠ܺ;->᩻ۙ:Ll/֡۠ܺ;

    .line 1353
    iput-object v2, v1, Ll/᩹۠ܺ;->ܺۙ:Ljava/lang/Float;

    .line 1354
    iput-object v0, v1, Ll/᩹۠ܺ;->ᩴۙ:Ljava/lang/String;

    .line 1355
    iput-object v0, v1, Ll/᩹۠ܺ;->ۚۙ:Ll/֡۠ܺ;

    .line 1356
    iput-object v2, v1, Ll/᩹۠ܺ;->֫ۙ:Ljava/lang/Float;

    .line 1357
    iput-object v0, v1, Ll/᩹۠ܺ;->ܿۙ:Ll/֡۠ܺ;

    .line 1358
    iput-object v2, v1, Ll/᩹۠ܺ;->֡ۙ:Ljava/lang/Float;

    .line 1359
    sget-object v0, Ll/ܶ۠ܺ;->ܿ:Ll/ܶ۠ܺ;

    iput-object v0, v1, Ll/᩹۠ܺ;->᩶ۙ:Ll/ܶ۠ܺ;

    .line 448
    iget-object v0, p2, Ll/ܰ۠ܺ;->ۤ:Ll/᩹۠ܺ;

    if-eqz v0, :cond_2

    .line 449
    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/᩹۠ܺ;)V

    .line 452
    :cond_2
    iget-object v0, p0, Ll/ۘۜܺ;->۫:Ll/֫ۜܺ;

    invoke-virtual {v0}, Ll/֫ۜܺ;->۫()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 454
    iget-object v0, p0, Ll/ۘۜܺ;->۫:Ll/֫ۜܺ;

    invoke-virtual {v0}, Ll/֫ۜܺ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۡܺ;

    .line 456
    iget-object v2, v1, Ll/ۖۡܺ;->ۙ:Ll/ۜۡܺ;

    invoke-static {v2, p2}, Ll/᩷ۖܺ;->ۙ(Ll/ۜۡܺ;Ll/ܰ۠ܺ;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 457
    iget-object v1, v1, Ll/ۖۡܺ;->ۤ:Ll/᩹۠ܺ;

    invoke-direct {p0, p1, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/᩹۠ܺ;)V

    goto :goto_2

    .line 463
    :cond_4
    iget-object p2, p2, Ll/ܰ۠ܺ;->۫:Ll/᩹۠ܺ;

    if-eqz p2, :cond_5

    .line 464
    invoke-direct {p0, p1, p2}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/᩹۠ܺ;)V

    :cond_5
    return-void
.end method

.method private ۙ(Ll/᩵ۜܺ;Ll/᩹۠ܺ;)V
    .locals 13

    const-wide/16 v0, 0x1000

    .line 2196
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2198
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->֡:Ll/ܽۖܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->֡:Ll/ܽۖܺ;

    :cond_0
    const-wide/16 v0, 0x800

    .line 2201
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2203
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->ܳۙ:Ljava/lang/Float;

    iput-object v1, v0, Ll/᩹۠ܺ;->ܳۙ:Ljava/lang/Float;

    :cond_1
    const-wide/16 v0, 0x1

    .line 2206
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    sget-object v1, Ll/ܽۖܺ;->ܿ:Ll/ܽۖܺ;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    .line 2208
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v4, p2, Ll/᩹۠ܺ;->ۢ:Ll/֡۠ܺ;

    iput-object v4, v0, Ll/᩹۠ܺ;->ۢ:Ll/֡۠ܺ;

    .line 2209
    iget-object v0, p2, Ll/᩹۠ܺ;->ۢ:Ll/֡۠ܺ;

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p1, Ll/᩵ۜܺ;->᩷:Z

    :cond_3
    const-wide/16 v4, 0x4

    .line 2212
    invoke-static {p2, v4, v5}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2214
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v4, p2, Ll/᩹۠ܺ;->֨:Ljava/lang/Float;

    iput-object v4, v0, Ll/᩹۠ܺ;->֨:Ljava/lang/Float;

    :cond_4
    const-wide/16 v4, 0x1805

    .line 2218
    invoke-static {p2, v4, v5}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2220
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ۢ:Ll/֡۠ܺ;

    invoke-static {p1, v3, v0}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;ZLl/֡۠ܺ;)V

    :cond_5
    const-wide/16 v4, 0x2

    .line 2223
    invoke-static {p2, v4, v5}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2225
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v4, p2, Ll/᩹۠ܺ;->ۡ:Ll/ܳ۠ܺ;

    iput-object v4, v0, Ll/᩹۠ܺ;->ۡ:Ll/ܳ۠ܺ;

    :cond_6
    const-wide/16 v4, 0x8

    .line 2229
    invoke-static {p2, v4, v5}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2231
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v4, p2, Ll/᩹۠ܺ;->ܽۙ:Ll/֡۠ܺ;

    iput-object v4, v0, Ll/᩹۠ܺ;->ܽۙ:Ll/֡۠ܺ;

    .line 2232
    iget-object v0, p2, Ll/᩹۠ܺ;->ܽۙ:Ll/֡۠ܺ;

    if-eqz v0, :cond_7

    if-eq v0, v1, :cond_7

    const/4 v0, 0x1

    goto :goto_1

    :cond_7
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p1, Ll/᩵ۜܺ;->ۤ:Z

    :cond_8
    const-wide/16 v0, 0x10

    .line 2235
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2237
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->ۛۙ:Ljava/lang/Float;

    iput-object v1, v0, Ll/᩹۠ܺ;->ۛۙ:Ljava/lang/Float;

    :cond_9
    const-wide/16 v0, 0x1818

    .line 2240
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2242
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ܽۙ:Ll/֡۠ܺ;

    invoke-static {p1, v2, v0}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;ZLl/֡۠ܺ;)V

    :cond_a
    const-wide v0, 0x800000000L

    .line 2245
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 2247
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->᩶ۙ:Ll/ܶ۠ܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->᩶ۙ:Ll/ܶ۠ܺ;

    :cond_b
    const-wide/16 v0, 0x20

    .line 2250
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 2252
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->᩺ۙ:Ll/ܿۖܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->᩺ۙ:Ll/ܿۖܺ;

    .line 2253
    iget-object v0, p1, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    invoke-virtual {v1, p0}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    :cond_c
    const-wide/16 v0, 0x40

    .line 2256
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    const/4 v1, 0x3

    const/4 v4, 0x2

    if-eqz v0, :cond_10

    .line 2258
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v5, p1, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    iget-object v6, p2, Ll/᩹۠ܺ;->ۗۙ:Ll/ۚ۠ܺ;

    iput-object v6, v0, Ll/᩹۠ܺ;->ۗۙ:Ll/ۚ۠ܺ;

    .line 2259
    sget-object v0, Ll/ۧۜܺ;->᩷:[I

    iget-object v6, p2, Ll/᩹۠ܺ;->ۗۙ:Ll/ۚ۠ܺ;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v0, v0, v6

    if-eq v0, v3, :cond_f

    if-eq v0, v4, :cond_e

    if-eq v0, v1, :cond_d

    goto :goto_2

    .line 2268
    :cond_d
    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    goto :goto_2

    .line 2265
    :cond_e
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    goto :goto_2

    .line 2262
    :cond_f
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    :cond_10
    :goto_2
    const-wide/16 v5, 0x80

    .line 2275
    invoke-static {p2, v5, v6}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 2277
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v5, p1, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    iget-object v6, p2, Ll/᩹۠ܺ;->᩵ۙ:Ll/֫۠ܺ;

    iput-object v6, v0, Ll/᩹۠ܺ;->᩵ۙ:Ll/֫۠ܺ;

    .line 2278
    sget-object v0, Ll/ۧۜܺ;->ۤ:[I

    iget-object v6, p2, Ll/᩹۠ܺ;->᩵ۙ:Ll/֫۠ܺ;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v0, v0, v6

    if-eq v0, v3, :cond_13

    if-eq v0, v4, :cond_12

    if-eq v0, v1, :cond_11

    goto :goto_3

    .line 2287
    :cond_11
    sget-object v0, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    goto :goto_3

    .line 2284
    :cond_12
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    goto :goto_3

    .line 2281
    :cond_13
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    :cond_14
    :goto_3
    const-wide/16 v0, 0x100

    .line 2294
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 2297
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->ۨۙ:Ljava/lang/Float;

    iput-object v1, v0, Ll/᩹۠ܺ;->ۨۙ:Ljava/lang/Float;

    .line 2298
    iget-object v0, p1, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    iget-object v1, p2, Ll/᩹۠ܺ;->ۨۙ:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    :cond_15
    const-wide/16 v0, 0x200

    .line 2301
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 2303
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->ܶۙ:[Ll/ܿۖܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->ܶۙ:[Ll/ܿۖܺ;

    :cond_16
    const-wide/16 v0, 0x400

    .line 2306
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 2308
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->᩹ۙ:Ll/ܿۖܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->᩹ۙ:Ll/ܿۖܺ;

    :cond_17
    const-wide/16 v0, 0x600

    .line 2311
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1d

    .line 2314
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v4, p1, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    iget-object v5, v0, Ll/᩹۠ܺ;->ܶۙ:[Ll/ܿۖܺ;

    if-nez v5, :cond_18

    .line 2316
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    goto :goto_6

    .line 2321
    :cond_18
    array-length v5, v5

    .line 2324
    rem-int/lit8 v6, v5, 0x2

    if-nez v6, :cond_19

    move v6, v5

    goto :goto_4

    :cond_19
    mul-int/lit8 v6, v5, 0x2

    .line 2325
    :goto_4
    new-array v7, v6, [F

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_5
    if-ge v9, v6, :cond_1a

    .line 2327
    iget-object v11, v0, Ll/᩹۠ܺ;->ܶۙ:[Ll/ܿۖܺ;

    rem-int v12, v9, v5

    aget-object v11, v11, v12

    invoke-virtual {v11, p0}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;)F

    move-result v11

    aput v11, v7, v9

    add-float/2addr v10, v11

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_1a
    cmpl-float v5, v10, v8

    if-nez v5, :cond_1b

    .line 2331
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    goto :goto_6

    .line 2333
    :cond_1b
    iget-object v0, v0, Ll/᩹۠ܺ;->᩹ۙ:Ll/ܿۖܺ;

    invoke-virtual {v0, p0}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;)F

    move-result v0

    cmpg-float v5, v0, v8

    if-gez v5, :cond_1c

    rem-float/2addr v0, v10

    add-float/2addr v0, v10

    .line 2339
    :cond_1c
    new-instance v5, Landroid/graphics/DashPathEffect;

    invoke-direct {v5, v7, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :cond_1d
    :goto_6
    const-wide/16 v4, 0x4000

    .line 2344
    invoke-static {p2, v4, v5}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 2346
    invoke-virtual {p0}, Ll/ۘۜܺ;->ۙ()F

    move-result v0

    .line 2347
    iget-object v4, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v5, p2, Ll/᩹۠ܺ;->۠:Ll/ܿۖܺ;

    iput-object v5, v4, Ll/᩹۠ܺ;->۠:Ll/ܿۖܺ;

    .line 2348
    iget-object v4, p1, Ll/᩵ۜܺ;->ۙ:Landroid/graphics/Paint;

    iget-object v5, p2, Ll/᩹۠ܺ;->۠:Ll/ܿۖܺ;

    invoke-virtual {v5, p0, v0}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 2349
    iget-object v4, p1, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    iget-object v5, p2, Ll/᩹۠ܺ;->۠:Ll/ܿۖܺ;

    invoke-virtual {v5, p0, v0}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_1e
    const-wide/16 v4, 0x2000

    .line 2352
    invoke-static {p2, v4, v5}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 2354
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v4, p2, Ll/᩹۠ܺ;->ۖ:Ljava/util/ArrayList;

    iput-object v4, v0, Ll/᩹۠ܺ;->ۖ:Ljava/util/ArrayList;

    :cond_1f
    const-wide/32 v4, 0x8000

    .line 2357
    invoke-static {p2, v4, v5}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 2360
    iget-object v0, p2, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v4, -0x1

    const/16 v5, 0x64

    if-ne v0, v4, :cond_20

    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le v0, v5, :cond_20

    .line 2361
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v3, v0, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    sub-int/2addr v3, v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    goto :goto_7

    .line 2362
    :cond_20
    iget-object v0, p2, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v3, :cond_21

    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v3, 0x384

    if-ge v0, v3, :cond_21

    .line 2363
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v3, v0, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v3, v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    goto :goto_7

    .line 2365
    :cond_21
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v3, p2, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    iput-object v3, v0, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    :cond_22
    :goto_7
    const-wide/32 v3, 0x10000

    .line 2368
    invoke-static {p2, v3, v4}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 2370
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v3, p2, Ll/᩹۠ܺ;->ۜ:Ll/۫۠ܺ;

    iput-object v3, v0, Ll/᩹۠ܺ;->ۜ:Ll/۫۠ܺ;

    :cond_23
    const-wide/32 v3, 0x1a000

    .line 2374
    invoke-static {p2, v3, v4}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_27

    .line 2378
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v3, v0, Ll/᩹۠ܺ;->ۖ:Ljava/util/ArrayList;

    if-eqz v3, :cond_25

    iget-object v4, p0, Ll/ۘۜܺ;->۫:Ll/֫ۜܺ;

    if-eqz v4, :cond_25

    .line 2381
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_24
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_25

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 2382
    iget-object v4, v0, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    iget-object v5, v0, Ll/᩹۠ܺ;->ۜ:Ll/۫۠ܺ;

    invoke-static {v1, v4, v5}, Ll/ۘۜܺ;->ۙ(Ljava/lang/String;Ljava/lang/Integer;Ll/۫۠ܺ;)Landroid/graphics/Typeface;

    move-result-object v1

    if-eqz v1, :cond_24

    :cond_25
    if-nez v1, :cond_26

    .line 2392
    iget-object v1, v0, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    iget-object v0, v0, Ll/᩹۠ܺ;->ۜ:Ll/۫۠ܺ;

    const-string v3, "serif"

    invoke-static {v3, v1, v0}, Ll/ۘۜܺ;->ۙ(Ljava/lang/String;Ljava/lang/Integer;Ll/۫۠ܺ;)Landroid/graphics/Typeface;

    move-result-object v1

    .line 2394
    :cond_26
    iget-object v0, p1, Ll/᩵ۜܺ;->ۙ:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 2395
    iget-object v0, p1, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_27
    const-wide/32 v0, 0x20000

    .line 2398
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 2400
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p1, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    iget-object v3, p1, Ll/᩵ۜܺ;->ۙ:Landroid/graphics/Paint;

    iget-object v4, p2, Ll/᩹۠ܺ;->ܰۙ:Ll/ܺ۠ܺ;

    iput-object v4, v0, Ll/᩹۠ܺ;->ܰۙ:Ll/ܺ۠ܺ;

    .line 2401
    iget-object v0, p2, Ll/᩹۠ܺ;->ܰۙ:Ll/ܺ۠ܺ;

    sget-object v4, Ll/ܺ۠ܺ;->ܿ:Ll/ܺ۠ܺ;

    if-ne v0, v4, :cond_28

    const/4 v0, 0x1

    goto :goto_8

    :cond_28
    const/4 v0, 0x0

    :goto_8
    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    .line 2402
    iget-object v0, p2, Ll/᩹۠ܺ;->ܰۙ:Ll/ܺ۠ܺ;

    sget-object v5, Ll/ܺ۠ܺ;->ᩳ:Ll/ܺ۠ܺ;

    if-ne v0, v5, :cond_29

    const/4 v0, 0x1

    goto :goto_9

    :cond_29
    const/4 v0, 0x0

    :goto_9
    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 2406
    iget-object v0, p2, Ll/᩹۠ܺ;->ܰۙ:Ll/ܺ۠ܺ;

    if-ne v0, v4, :cond_2a

    const/4 v0, 0x1

    goto :goto_a

    :cond_2a
    const/4 v0, 0x0

    :goto_a
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    .line 2407
    iget-object v0, p2, Ll/᩹۠ܺ;->ܰۙ:Ll/ܺ۠ܺ;

    if-ne v0, v5, :cond_2b

    const/4 v2, 0x1

    :cond_2b
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    :cond_2c
    const-wide v0, 0x1000000000L

    .line 2411
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 2413
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->۟:Ll/ܽ۠ܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->۟:Ll/ܽ۠ܺ;

    :cond_2d
    const-wide/32 v0, 0x40000

    .line 2416
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 2418
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->ۘۙ:Ll/᩻۠ܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->ۘۙ:Ll/᩻۠ܺ;

    :cond_2e
    const-wide/32 v0, 0x80000

    .line 2421
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 2423
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->۫ۙ:Ljava/lang/Boolean;

    iput-object v1, v0, Ll/᩹۠ܺ;->۫ۙ:Ljava/lang/Boolean;

    :cond_2f
    const-wide/32 v0, 0x200000

    .line 2426
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_30

    .line 2428
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->᩸ۙ:Ljava/lang/String;

    iput-object v1, v0, Ll/᩹۠ܺ;->᩸ۙ:Ljava/lang/String;

    :cond_30
    const-wide/32 v0, 0x400000

    .line 2431
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 2433
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->ۤۙ:Ljava/lang/String;

    iput-object v1, v0, Ll/᩹۠ܺ;->ۤۙ:Ljava/lang/String;

    :cond_31
    const-wide/32 v0, 0x800000

    .line 2436
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_32

    .line 2438
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->᩷ۙ:Ljava/lang/String;

    iput-object v1, v0, Ll/᩹۠ܺ;->᩷ۙ:Ljava/lang/String;

    :cond_32
    const-wide/32 v0, 0x1000000

    .line 2441
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_33

    .line 2443
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->ᩳ:Ljava/lang/Boolean;

    iput-object v1, v0, Ll/᩹۠ܺ;->ᩳ:Ljava/lang/Boolean;

    :cond_33
    const-wide/32 v0, 0x2000000

    .line 2446
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_34

    .line 2448
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->۟ۙ:Ljava/lang/Boolean;

    iput-object v1, v0, Ll/᩹۠ܺ;->۟ۙ:Ljava/lang/Boolean;

    :cond_34
    const-wide/32 v0, 0x100000

    .line 2451
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_35

    .line 2453
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->ܰ:Ll/ۧۖܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->ܰ:Ll/ۧۖܺ;

    :cond_35
    const-wide/32 v0, 0x10000000

    .line 2456
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_36

    .line 2458
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->᩶:Ljava/lang/String;

    iput-object v1, v0, Ll/᩹۠ܺ;->᩶:Ljava/lang/String;

    :cond_36
    const-wide/32 v0, 0x20000000

    .line 2461
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_37

    .line 2463
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->ܿ:Ll/ܳ۠ܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->ܿ:Ll/ܳ۠ܺ;

    :cond_37
    const-wide/32 v0, 0x40000000

    .line 2466
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_38

    .line 2468
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->ᩴۙ:Ljava/lang/String;

    iput-object v1, v0, Ll/᩹۠ܺ;->ᩴۙ:Ljava/lang/String;

    :cond_38
    const-wide/32 v0, 0x4000000

    .line 2471
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_39

    .line 2473
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->᩻ۙ:Ll/֡۠ܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->᩻ۙ:Ll/֡۠ܺ;

    :cond_39
    const-wide/32 v0, 0x8000000

    .line 2476
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_3a

    .line 2478
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->ܺۙ:Ljava/lang/Float;

    iput-object v1, v0, Ll/᩹۠ܺ;->ܺۙ:Ljava/lang/Float;

    :cond_3a
    const-wide v0, 0x200000000L

    .line 2481
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_3b

    .line 2483
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->ܿۙ:Ll/֡۠ܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->ܿۙ:Ll/֡۠ܺ;

    :cond_3b
    const-wide v0, 0x400000000L

    .line 2486
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_3c

    .line 2488
    iget-object v0, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, p2, Ll/᩹۠ܺ;->֡ۙ:Ljava/lang/Float;

    iput-object v1, v0, Ll/᩹۠ܺ;->֡ۙ:Ljava/lang/Float;

    :cond_3c
    const-wide v0, 0x2000000000L

    .line 2491
    invoke-static {p2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v0

    if-eqz v0, :cond_3d

    .line 2493
    iget-object p1, p1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object p2, p2, Ll/᩹۠ܺ;->ۙۙ:Ll/ۧ۠ܺ;

    iput-object p2, p1, Ll/᩹۠ܺ;->ۙۙ:Ll/ۧ۠ܺ;

    :cond_3d
    return-void
.end method

.method public static ۙ(Ll/᩵ۜܺ;ZLl/֡۠ܺ;)V
    .locals 2

    .line 2500
    iget-object v0, p0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    if-eqz p1, :cond_0

    iget-object v0, v0, Ll/᩹۠ܺ;->֨:Ljava/lang/Float;

    goto :goto_0

    :cond_0
    iget-object v0, v0, Ll/᩹۠ܺ;->ۛۙ:Ljava/lang/Float;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 2502
    instance-of v1, p2, Ll/ܽۖܺ;

    if-eqz v1, :cond_1

    .line 2503
    check-cast p2, Ll/ܽۖܺ;

    iget p2, p2, Ll/ܽۖܺ;->ܰ:I

    goto :goto_1

    .line 2504
    :cond_1
    instance-of p2, p2, Ll/ܶۖܺ;

    if-eqz p2, :cond_3

    .line 2505
    iget-object p2, p0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object p2, p2, Ll/᩹۠ܺ;->֡:Ll/ܽۖܺ;

    iget p2, p2, Ll/ܽۖܺ;->ܰ:I

    .line 2509
    :goto_1
    invoke-static {v0, p2}, Ll/ۘۜܺ;->ۙ(FI)I

    move-result p2

    if-eqz p1, :cond_2

    .line 2511
    iget-object p0, p0, Ll/᩵ۜܺ;->ۙ:Landroid/graphics/Paint;

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setColor(I)V

    return-void

    .line 2513
    :cond_2
    iget-object p0, p0, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setColor(I)V

    :cond_3
    return-void
.end method

.method private ۙ(Ll/᩺۠ܺ;)V
    .locals 2

    .line 425
    iget-object v0, p0, Ll/ۘۜܺ;->ۧ:Ljava/util/Stack;

    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    iget-object p1, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    iget-object v0, p0, Ll/ۘۜܺ;->᩷:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    .line 427
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 428
    iget-object v1, p0, Ll/ۘۜܺ;->֫:Ljava/util/Stack;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v1, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private ۙ(ZLl/֫ۖܺ;Ll/֨ۖܺ;)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 3369
    iget-object v4, v0, Ll/ۘۜܺ;->۫:Ll/֫ۜܺ;

    iget-object v5, v3, Ll/֨ۖܺ;->᩶:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_2

    .line 3373
    iget-object v2, v3, Ll/֨ۖܺ;->ܰ:Ll/֡۠ܺ;

    if-eqz v2, :cond_0

    .line 3374
    iget-object v3, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-static {v3, v1, v2}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;ZLl/֡۠ܺ;)V

    return-void

    :cond_0
    if-eqz v1, :cond_1

    .line 3377
    iget-object v1, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iput-boolean v5, v1, Ll/᩵ۜܺ;->᩷:Z

    return-void

    .line 3379
    :cond_1
    iget-object v1, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iput-boolean v5, v1, Ll/᩵ۜܺ;->ۤ:Z

    return-void

    .line 3383
    :cond_2
    instance-of v3, v4, Ll/᩶۠ܺ;

    sget-object v6, Ll/ܽۖܺ;->᩶:Ll/ܽۖܺ;

    const/high16 v7, -0x40800000    # -1.0f

    const/4 v8, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v10, 0x1

    if-eqz v3, :cond_1d

    .line 3384
    check-cast v4, Ll/᩶۠ܺ;

    .line 3395
    iget-object v3, v4, Ll/᩵ۖܺ;->᩻:Ljava/lang/String;

    if-eqz v3, :cond_3

    .line 3396
    invoke-static {v4, v3}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۖܺ;Ljava/lang/String;)V

    .line 3398
    :cond_3
    iget-object v3, v4, Ll/᩵ۖܺ;->ۧ:Ljava/lang/Boolean;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x1

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    .line 3399
    :goto_0
    iget-object v8, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    if-eqz v1, :cond_5

    iget-object v8, v8, Ll/᩵ۜܺ;->ۙ:Landroid/graphics/Paint;

    goto :goto_1

    :cond_5
    iget-object v8, v8, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    :goto_1
    if-eqz v3, :cond_a

    .line 3404
    invoke-virtual/range {p0 .. p0}, Ll/ۘۜܺ;->ۤ()Ll/֫ۖܺ;

    move-result-object v9

    .line 3405
    iget-object v11, v4, Ll/᩶۠ܺ;->ܽ:Ll/ܿۖܺ;

    if-eqz v11, :cond_6

    invoke-virtual {v11, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v11

    goto :goto_2

    :cond_6
    const/4 v11, 0x0

    .line 3406
    :goto_2
    iget-object v12, v4, Ll/᩶۠ܺ;->᩹:Ll/ܿۖܺ;

    if-eqz v12, :cond_7

    invoke-virtual {v12, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v12

    goto :goto_3

    :cond_7
    const/4 v12, 0x0

    .line 3407
    :goto_3
    iget-object v13, v4, Ll/᩶۠ܺ;->ܶ:Ll/ܿۖܺ;

    if-eqz v13, :cond_8

    invoke-virtual {v13, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v9

    goto :goto_4

    :cond_8
    iget v9, v9, Ll/֫ۖܺ;->᩸:F

    .line 3408
    :goto_4
    iget-object v13, v4, Ll/᩶۠ܺ;->ۗ:Ll/ܿۖܺ;

    if-eqz v13, :cond_9

    invoke-virtual {v13, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v13

    goto :goto_5

    :cond_9
    const/4 v13, 0x0

    :goto_5
    move/from16 v17, v9

    move v15, v11

    move/from16 v16, v12

    move/from16 v18, v13

    goto :goto_a

    .line 3412
    :cond_a
    iget-object v11, v4, Ll/᩶۠ܺ;->ܽ:Ll/ܿۖܺ;

    if-eqz v11, :cond_b

    invoke-virtual {v11, v0, v9}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v11

    goto :goto_6

    :cond_b
    const/4 v11, 0x0

    .line 3413
    :goto_6
    iget-object v12, v4, Ll/᩶۠ܺ;->᩹:Ll/ܿۖܺ;

    if-eqz v12, :cond_c

    invoke-virtual {v12, v0, v9}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v12

    goto :goto_7

    :cond_c
    const/4 v12, 0x0

    .line 3414
    :goto_7
    iget-object v13, v4, Ll/᩶۠ܺ;->ܶ:Ll/ܿۖܺ;

    if-eqz v13, :cond_d

    invoke-virtual {v13, v0, v9}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v13

    goto :goto_8

    :cond_d
    const/high16 v13, 0x3f800000    # 1.0f

    .line 3415
    :goto_8
    iget-object v14, v4, Ll/᩶۠ܺ;->ۗ:Ll/ܿۖܺ;

    if-eqz v14, :cond_e

    invoke-virtual {v14, v0, v9}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v9

    goto :goto_9

    :cond_e
    const/4 v9, 0x0

    :goto_9
    move/from16 v18, v9

    move v15, v11

    move/from16 v16, v12

    move/from16 v17, v13

    .line 3419
    :goto_a
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->ۧ()V

    .line 3422
    invoke-direct {v0, v4}, Ll/ۘۜܺ;->ۙ(Ll/ܰ۠ܺ;)Ll/᩵ۜܺ;

    move-result-object v9

    iput-object v9, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    .line 3425
    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    if-nez v3, :cond_f

    .line 3428
    iget v3, v2, Ll/֫ۖܺ;->᩷:F

    iget v11, v2, Ll/֫ۖܺ;->ۤ:F

    invoke-virtual {v9, v3, v11}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 3429
    iget v3, v2, Ll/֫ۖܺ;->᩸:F

    iget v2, v2, Ll/֫ۖܺ;->ۙ:F

    invoke-virtual {v9, v3, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 3431
    :cond_f
    iget-object v2, v4, Ll/᩵ۖܺ;->֫:Landroid/graphics/Matrix;

    if-eqz v2, :cond_10

    .line 3433
    invoke-virtual {v9, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 3437
    :cond_10
    iget-object v2, v4, Ll/᩵ۖܺ;->ۚ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_12

    .line 3440
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->֫()V

    if-eqz v1, :cond_11

    .line 3442
    iget-object v1, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iput-boolean v5, v1, Ll/᩵ۜܺ;->᩷:Z

    return-void

    .line 3444
    :cond_11
    iget-object v1, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iput-boolean v5, v1, Ll/᩵ۜܺ;->ۤ:Z

    return-void

    .line 3448
    :cond_12
    new-array v1, v2, [I

    .line 3449
    new-array v3, v2, [F

    .line 3452
    iget-object v11, v4, Ll/᩵ۖܺ;->ۚ:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_17

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ܿ۠ܺ;

    .line 3454
    check-cast v12, Ll/ᩴ۠ܺ;

    .line 3455
    iget-object v13, v12, Ll/ᩴ۠ܺ;->ۚ:Ljava/lang/Float;

    if-eqz v13, :cond_13

    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    move-result v13

    goto :goto_c

    :cond_13
    const/4 v13, 0x0

    :goto_c
    if-eqz v5, :cond_15

    cmpl-float v14, v13, v7

    if-ltz v14, :cond_14

    goto :goto_d

    .line 3462
    :cond_14
    aput v7, v3, v5

    goto :goto_e

    .line 3457
    :cond_15
    :goto_d
    aput v13, v3, v5

    move v7, v13

    .line 3465
    :goto_e
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->ۧ()V

    .line 3467
    iget-object v13, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {v0, v13, v12}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 3468
    iget-object v12, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v12, v12, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v13, v12, Ll/᩹۠ܺ;->᩻ۙ:Ll/֡۠ܺ;

    check-cast v13, Ll/ܽۖܺ;

    if-nez v13, :cond_16

    move-object v13, v6

    .line 3471
    :cond_16
    iget v13, v13, Ll/ܽۖܺ;->ܰ:I

    iget-object v12, v12, Ll/᩹۠ܺ;->ܺۙ:Ljava/lang/Float;

    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    move-result v12

    invoke-static {v12, v13}, Ll/ۘۜܺ;->ۙ(FI)I

    move-result v12

    aput v12, v1, v5

    add-int/lit8 v5, v5, 0x1

    .line 3474
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->֫()V

    goto :goto_b

    :cond_17
    cmpl-float v5, v15, v17

    if-nez v5, :cond_18

    cmpl-float v5, v16, v18

    if-eqz v5, :cond_19

    :cond_18
    if-ne v2, v10, :cond_1a

    .line 3479
    :cond_19
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->֫()V

    sub-int/2addr v2, v10

    .line 3480
    aget v1, v1, v2

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void

    .line 3485
    :cond_1a
    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 3486
    iget-object v4, v4, Ll/᩵ۖܺ;->ܺ:Ll/ۨۖܺ;

    if-eqz v4, :cond_1c

    .line 3488
    sget-object v5, Ll/ۨۖܺ;->ܿ:Ll/ۨۖܺ;

    if-ne v4, v5, :cond_1b

    .line 3489
    sget-object v2, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_f

    .line 3490
    :cond_1b
    sget-object v5, Ll/ۨۖܺ;->֡:Ll/ۨۖܺ;

    if-ne v4, v5, :cond_1c

    .line 3491
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    :cond_1c
    :goto_f
    move-object/from16 v21, v2

    .line 3494
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->֫()V

    .line 3497
    new-instance v2, Landroid/graphics/LinearGradient;

    move-object v14, v2

    move-object/from16 v19, v1

    move-object/from16 v20, v3

    invoke-direct/range {v14 .. v21}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 3498
    invoke-virtual {v2, v9}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 3499
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 3500
    iget-object v1, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v1, v1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, v1, Ll/᩹۠ܺ;->֨:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1}, Ll/ۘۜܺ;->ۙ(F)I

    move-result v1

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void

    .line 3385
    :cond_1d
    instance-of v3, v4, Ll/ᩳ۠ܺ;

    if-eqz v3, :cond_35

    .line 3386
    check-cast v4, Ll/ᩳ۠ܺ;

    .line 3506
    iget-object v3, v4, Ll/᩵ۖܺ;->᩻:Ljava/lang/String;

    if-eqz v3, :cond_1e

    .line 3507
    invoke-static {v4, v3}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۖܺ;Ljava/lang/String;)V

    .line 3509
    :cond_1e
    iget-object v3, v4, Ll/᩵ۖܺ;->ۧ:Ljava/lang/Boolean;

    if-eqz v3, :cond_1f

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1f

    const/4 v3, 0x1

    goto :goto_10

    :cond_1f
    const/4 v3, 0x0

    .line 3510
    :goto_10
    iget-object v11, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    if-eqz v1, :cond_20

    iget-object v11, v11, Ll/᩵ۜܺ;->ۙ:Landroid/graphics/Paint;

    goto :goto_11

    :cond_20
    iget-object v11, v11, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    :goto_11
    if-eqz v3, :cond_24

    .line 3515
    new-instance v9, Ll/ܿۖܺ;

    const/high16 v12, 0x42480000    # 50.0f

    sget-object v13, Ll/ܳۜܺ;->֨:Ll/ܳۜܺ;

    invoke-direct {v9, v12, v13}, Ll/ܿۖܺ;-><init>(FLl/ܳۜܺ;)V

    .line 3516
    iget-object v12, v4, Ll/ᩳ۠ܺ;->ܽ:Ll/ܿۖܺ;

    if-eqz v12, :cond_21

    invoke-virtual {v12, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v12

    goto :goto_12

    :cond_21
    invoke-virtual {v9, v0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v12

    .line 3517
    :goto_12
    iget-object v13, v4, Ll/ᩳ۠ܺ;->ܶ:Ll/ܿۖܺ;

    if-eqz v13, :cond_22

    invoke-virtual {v13, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v13

    goto :goto_13

    :cond_22
    invoke-virtual {v9, v0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v13

    .line 3518
    :goto_13
    iget-object v14, v4, Ll/ᩳ۠ܺ;->᩵:Ll/ܿۖܺ;

    if-eqz v14, :cond_23

    invoke-virtual {v14, v0}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;)F

    move-result v9

    goto :goto_16

    :cond_23
    invoke-virtual {v9, v0}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;)F

    move-result v9

    goto :goto_16

    .line 3522
    :cond_24
    iget-object v12, v4, Ll/ᩳ۠ܺ;->ܽ:Ll/ܿۖܺ;

    if-eqz v12, :cond_25

    invoke-virtual {v12, v0, v9}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v12

    goto :goto_14

    :cond_25
    const/high16 v12, 0x3f000000    # 0.5f

    .line 3523
    :goto_14
    iget-object v13, v4, Ll/ᩳ۠ܺ;->ܶ:Ll/ܿۖܺ;

    if-eqz v13, :cond_26

    invoke-virtual {v13, v0, v9}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v13

    goto :goto_15

    :cond_26
    const/high16 v13, 0x3f000000    # 0.5f

    .line 3524
    :goto_15
    iget-object v14, v4, Ll/ᩳ۠ܺ;->᩵:Ll/ܿۖܺ;

    if-eqz v14, :cond_27

    invoke-virtual {v14, v0, v9}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result v9

    goto :goto_16

    :cond_27
    const/high16 v9, 0x3f000000    # 0.5f

    :goto_16
    move/from16 v17, v9

    move v15, v12

    move/from16 v16, v13

    .line 3530
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->ۧ()V

    .line 3533
    invoke-direct {v0, v4}, Ll/ۘۜܺ;->ۙ(Ll/ܰ۠ܺ;)Ll/᩵ۜܺ;

    move-result-object v9

    iput-object v9, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    .line 3536
    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    if-nez v3, :cond_28

    .line 3539
    iget v3, v2, Ll/֫ۖܺ;->᩷:F

    iget v12, v2, Ll/֫ۖܺ;->ۤ:F

    invoke-virtual {v9, v3, v12}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 3540
    iget v3, v2, Ll/֫ۖܺ;->᩸:F

    iget v2, v2, Ll/֫ۖܺ;->ۙ:F

    invoke-virtual {v9, v3, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 3542
    :cond_28
    iget-object v2, v4, Ll/᩵ۖܺ;->֫:Landroid/graphics/Matrix;

    if-eqz v2, :cond_29

    .line 3544
    invoke-virtual {v9, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 3548
    :cond_29
    iget-object v2, v4, Ll/᩵ۖܺ;->ۚ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_2b

    .line 3551
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->֫()V

    if-eqz v1, :cond_2a

    .line 3553
    iget-object v1, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iput-boolean v5, v1, Ll/᩵ۜܺ;->᩷:Z

    return-void

    .line 3555
    :cond_2a
    iget-object v1, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iput-boolean v5, v1, Ll/᩵ۜܺ;->ۤ:Z

    return-void

    .line 3559
    :cond_2b
    new-array v1, v2, [I

    .line 3560
    new-array v3, v2, [F

    .line 3563
    iget-object v12, v4, Ll/᩵ۖܺ;->ۚ:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_17
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_30

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܿ۠ܺ;

    .line 3565
    check-cast v13, Ll/ᩴ۠ܺ;

    .line 3566
    iget-object v14, v13, Ll/ᩴ۠ܺ;->ۚ:Ljava/lang/Float;

    if-eqz v14, :cond_2c

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v14

    goto :goto_18

    :cond_2c
    const/4 v14, 0x0

    :goto_18
    if-eqz v5, :cond_2e

    cmpl-float v18, v14, v7

    if-ltz v18, :cond_2d

    goto :goto_19

    .line 3573
    :cond_2d
    aput v7, v3, v5

    goto :goto_1a

    .line 3568
    :cond_2e
    :goto_19
    aput v14, v3, v5

    move v7, v14

    .line 3576
    :goto_1a
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->ۧ()V

    .line 3578
    iget-object v14, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {v0, v14, v13}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 3579
    iget-object v13, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v13, v13, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v14, v13, Ll/᩹۠ܺ;->᩻ۙ:Ll/֡۠ܺ;

    check-cast v14, Ll/ܽۖܺ;

    if-nez v14, :cond_2f

    move-object v14, v6

    .line 3582
    :cond_2f
    iget v14, v14, Ll/ܽۖܺ;->ܰ:I

    iget-object v13, v13, Ll/᩹۠ܺ;->ܺۙ:Ljava/lang/Float;

    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    move-result v13

    invoke-static {v13, v14}, Ll/ۘۜܺ;->ۙ(FI)I

    move-result v13

    aput v13, v1, v5

    add-int/lit8 v5, v5, 0x1

    .line 3585
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->֫()V

    goto :goto_17

    :cond_30
    cmpl-float v5, v17, v8

    if-eqz v5, :cond_34

    if-ne v2, v10, :cond_31

    goto :goto_1c

    .line 3596
    :cond_31
    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 3597
    iget-object v4, v4, Ll/᩵ۖܺ;->ܺ:Ll/ۨۖܺ;

    if-eqz v4, :cond_33

    .line 3599
    sget-object v5, Ll/ۨۖܺ;->ܿ:Ll/ۨۖܺ;

    if-ne v4, v5, :cond_32

    .line 3600
    sget-object v2, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_1b

    .line 3601
    :cond_32
    sget-object v5, Ll/ۨۖܺ;->֡:Ll/ۨۖܺ;

    if-ne v4, v5, :cond_33

    .line 3602
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    :cond_33
    :goto_1b
    move-object/from16 v20, v2

    .line 3605
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->֫()V

    .line 3608
    new-instance v2, Landroid/graphics/RadialGradient;

    move-object v14, v2

    move-object/from16 v18, v1

    move-object/from16 v19, v3

    invoke-direct/range {v14 .. v20}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 3609
    invoke-virtual {v2, v9}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 3610
    invoke-virtual {v11, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 3611
    iget-object v1, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v1, v1, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, v1, Ll/᩹۠ܺ;->֨:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1}, Ll/ۘۜܺ;->ۙ(F)I

    move-result v1

    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void

    .line 3590
    :cond_34
    :goto_1c
    invoke-direct/range {p0 .. p0}, Ll/ۘۜܺ;->֫()V

    sub-int/2addr v2, v10

    .line 3591
    aget v1, v1, v2

    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void

    .line 3387
    :cond_35
    instance-of v2, v4, Ll/᩸۠ܺ;

    if-eqz v2, :cond_3d

    .line 3388
    check-cast v4, Ll/᩸۠ܺ;

    const-wide v2, 0x180000000L

    const-wide v6, 0x100000000L

    const-wide v8, 0x80000000L

    if-eqz v1, :cond_39

    .line 3696
    iget-object v10, v4, Ll/ܰ۠ܺ;->ۤ:Ll/᩹۠ܺ;

    invoke-static {v10, v8, v9}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v8

    if-eqz v8, :cond_37

    .line 3698
    iget-object v8, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v9, v8, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v10, v4, Ll/ܰ۠ܺ;->ۤ:Ll/᩹۠ܺ;

    iget-object v10, v10, Ll/᩹۠ܺ;->ۚۙ:Ll/֡۠ܺ;

    iput-object v10, v9, Ll/᩹۠ܺ;->ۢ:Ll/֡۠ܺ;

    if-eqz v10, :cond_36

    const/4 v5, 0x1

    .line 3699
    :cond_36
    iput-boolean v5, v8, Ll/᩵ۜܺ;->᩷:Z

    .line 3702
    :cond_37
    iget-object v5, v4, Ll/ܰ۠ܺ;->ۤ:Ll/᩹۠ܺ;

    invoke-static {v5, v6, v7}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v5

    if-eqz v5, :cond_38

    .line 3704
    iget-object v5, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v5, v5, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v6, v4, Ll/ܰ۠ܺ;->ۤ:Ll/᩹۠ܺ;

    iget-object v6, v6, Ll/᩹۠ܺ;->֫ۙ:Ljava/lang/Float;

    iput-object v6, v5, Ll/᩹۠ܺ;->֨:Ljava/lang/Float;

    .line 3708
    :cond_38
    iget-object v4, v4, Ll/ܰ۠ܺ;->ۤ:Ll/᩹۠ܺ;

    invoke-static {v4, v2, v3}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v2

    if-eqz v2, :cond_3d

    .line 3711
    iget-object v2, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v3, v2, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v3, v3, Ll/᩹۠ܺ;->ۢ:Ll/֡۠ܺ;

    invoke-static {v2, v1, v3}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;ZLl/֡۠ܺ;)V

    return-void

    .line 3716
    :cond_39
    iget-object v10, v4, Ll/ܰ۠ܺ;->ۤ:Ll/᩹۠ܺ;

    invoke-static {v10, v8, v9}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v8

    if-eqz v8, :cond_3b

    .line 3718
    iget-object v8, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v9, v8, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v10, v4, Ll/ܰ۠ܺ;->ۤ:Ll/᩹۠ܺ;

    iget-object v10, v10, Ll/᩹۠ܺ;->ۚۙ:Ll/֡۠ܺ;

    iput-object v10, v9, Ll/᩹۠ܺ;->ܽۙ:Ll/֡۠ܺ;

    if-eqz v10, :cond_3a

    const/4 v5, 0x1

    .line 3719
    :cond_3a
    iput-boolean v5, v8, Ll/᩵ۜܺ;->ۤ:Z

    .line 3722
    :cond_3b
    iget-object v5, v4, Ll/ܰ۠ܺ;->ۤ:Ll/᩹۠ܺ;

    invoke-static {v5, v6, v7}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v5

    if-eqz v5, :cond_3c

    .line 3724
    iget-object v5, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v5, v5, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v6, v4, Ll/ܰ۠ܺ;->ۤ:Ll/᩹۠ܺ;

    iget-object v6, v6, Ll/᩹۠ܺ;->֫ۙ:Ljava/lang/Float;

    iput-object v6, v5, Ll/᩹۠ܺ;->ۛۙ:Ljava/lang/Float;

    .line 3728
    :cond_3c
    iget-object v4, v4, Ll/ܰ۠ܺ;->ۤ:Ll/᩹۠ܺ;

    invoke-static {v4, v2, v3}, Ll/ۘۜܺ;->ۙ(Ll/᩹۠ܺ;J)Z

    move-result v2

    if-eqz v2, :cond_3d

    .line 3731
    iget-object v2, v0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v3, v2, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v3, v3, Ll/᩹۠ܺ;->ܽۙ:Ll/֡۠ܺ;

    invoke-static {v2, v1, v3}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;ZLl/֡۠ܺ;)V

    :cond_3d
    return-void
.end method

.method public static ۙ(Ll/᩹۠ܺ;J)Z
    .locals 2

    .line 2185
    iget-wide v0, p0, Ll/᩹۠ܺ;->ۧۙ:J

    and-long p0, p1, v0

    const-wide/16 v0, 0x0

    cmp-long p2, p0, v0

    if-eqz p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ۚ()Z
    .locals 4

    .line 891
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ܳۙ:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_1

    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ᩴۙ:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 748
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ܳۙ:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Ll/ۘۜܺ;->ۙ(F)I

    move-result v0

    const/16 v1, 0x1f

    iget-object v2, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v0, v1}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;II)I

    .line 751
    iget-object v0, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    iget-object v1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 752
    new-instance v0, Ll/᩵ۜܺ;

    iget-object v1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {v0, v1}, Ll/᩵ۜܺ;-><init>(Ll/᩵ۜܺ;)V

    iput-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    .line 754
    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ᩴۙ:Ljava/lang/String;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    .line 755
    iget-object v2, p0, Ll/ۘۜܺ;->۫:Ll/֫ۜܺ;

    invoke-virtual {v2, v0}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 757
    instance-of v0, v0, Ll/ᩳۖܺ;

    if-nez v0, :cond_3

    .line 759
    :cond_2
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v2, v0, Ll/᩹۠ܺ;->ᩴۙ:Ljava/lang/String;

    .line 760
    iput-object v3, v0, Ll/᩹۠ܺ;->ᩴۙ:Ljava/lang/String;

    :cond_3
    return v1
.end method

.method private ۤ(Ll/ۘ۠ܺ;)V
    .locals 8

    .line 700
    iget-object v0, p1, Ll/ܿ۠ܺ;->᩷:Ll/᩺۠ܺ;

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 702
    :cond_0
    iget-object v0, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 705
    :cond_1
    iget-object v0, p0, Ll/ۘۜܺ;->֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    if-nez v0, :cond_2

    goto/16 :goto_1

    .line 710
    :cond_2
    iget-object v1, p0, Ll/ۘۜܺ;->ۤ:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 711
    iget-object v0, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    iget-object v2, p0, Ll/ۘۜܺ;->᩷:Landroid/graphics/Matrix;

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    .line 712
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 714
    iget-object v0, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    iget v2, v0, Ll/֫ۖܺ;->᩷:F

    iget-object v3, p0, Ll/ۘۜܺ;->᩸:[F

    const/4 v4, 0x6

    aput v2, v3, v4

    const/4 v5, 0x0

    aput v2, v3, v5

    .line 715
    iget v2, v0, Ll/֫ۖܺ;->ۤ:F

    const/4 v6, 0x3

    aput v2, v3, v6

    const/4 v6, 0x1

    aput v2, v3, v6

    .line 716
    invoke-virtual {v0}, Ll/֫ۖܺ;->ۙ()F

    move-result v0

    const/4 v2, 0x4

    aput v0, v3, v2

    const/4 v2, 0x2

    aput v0, v3, v2

    .line 717
    iget-object p1, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-virtual {p1}, Ll/֫ۖܺ;->᩷()F

    move-result p1

    const/4 v0, 0x7

    aput p1, v3, v0

    const/4 v0, 0x5

    aput p1, v3, v0

    .line 718
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 719
    aget p1, v3, v5

    aget v0, v3, v6

    const/4 v1, 0x2

    move v1, v0

    move v2, v1

    const/4 v5, 0x2

    move v0, p1

    :goto_0
    if-gt v5, v4, :cond_7

    .line 721
    aget v6, v3, v5

    cmpg-float v7, v6, p1

    if-gez v7, :cond_3

    move p1, v6

    :cond_3
    cmpl-float v7, v6, v0

    if-lez v7, :cond_4

    move v0, v6

    :cond_4
    add-int/lit8 v6, v5, 0x1

    .line 723
    aget v6, v3, v6

    cmpg-float v7, v6, v1

    if-gez v7, :cond_5

    move v1, v6

    :cond_5
    cmpl-float v7, v6, v2

    if-lez v7, :cond_6

    move v2, v6

    :cond_6
    add-int/lit8 v5, v5, 0x2

    goto :goto_0

    .line 726
    :cond_7
    iget-object v3, p0, Ll/ۘۜܺ;->ۧ:Ljava/util/Stack;

    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘ۠ܺ;

    .line 727
    iget-object v4, v3, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v4, :cond_8

    .line 1091
    new-instance v4, Ll/֫ۖܺ;

    sub-float/2addr v0, p1

    sub-float/2addr v2, v1

    invoke-direct {v4, p1, v1, v0, v2}, Ll/֫ۖܺ;-><init>(FFFF)V

    .line 728
    iput-object v4, v3, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    return-void

    .line 730
    :cond_8
    iget-object v3, p0, Ll/ۘۜܺ;->ۙ:Ll/֫ۖܺ;

    iput p1, v3, Ll/֫ۖܺ;->᩷:F

    .line 731
    iput v1, v3, Ll/֫ۖܺ;->ۤ:F

    sub-float/2addr v0, p1

    .line 732
    iput v0, v3, Ll/֫ۖܺ;->᩸:F

    sub-float/2addr v2, v1

    .line 733
    iput v2, v3, Ll/֫ۖܺ;->ۙ:F

    .line 734
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1109
    iget p1, v3, Ll/֫ۖܺ;->᩷:F

    iget v0, v4, Ll/֫ۖܺ;->᩷:F

    cmpg-float v0, p1, v0

    if-gez v0, :cond_9

    iput p1, v4, Ll/֫ۖܺ;->᩷:F

    .line 1110
    :cond_9
    iget p1, v3, Ll/֫ۖܺ;->ۤ:F

    iget v0, v4, Ll/֫ۖܺ;->ۤ:F

    cmpg-float v0, p1, v0

    if-gez v0, :cond_a

    iput p1, v4, Ll/֫ۖܺ;->ۤ:F

    .line 1111
    :cond_a
    invoke-virtual {v3}, Ll/֫ۖܺ;->ۙ()F

    move-result p1

    invoke-virtual {v4}, Ll/֫ۖܺ;->ۙ()F

    move-result v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_b

    invoke-virtual {v3}, Ll/֫ۖܺ;->ۙ()F

    move-result p1

    iget v0, v4, Ll/֫ۖܺ;->᩷:F

    sub-float/2addr p1, v0

    iput p1, v4, Ll/֫ۖܺ;->᩸:F

    .line 1112
    :cond_b
    invoke-virtual {v3}, Ll/֫ۖܺ;->᩷()F

    move-result p1

    invoke-virtual {v4}, Ll/֫ۖܺ;->᩷()F

    move-result v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_c

    invoke-virtual {v3}, Ll/֫ۖܺ;->᩷()F

    move-result p1

    iget v0, v4, Ll/֫ۖܺ;->ۤ:F

    sub-float/2addr p1, v0

    iput p1, v4, Ll/֫ۖܺ;->ۙ:F

    :cond_c
    :goto_1
    return-void
.end method

.method public static bridge synthetic ۤ(Ll/ۘۜܺ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۘۜܺ;->ܺ()Z

    move-result p0

    return p0
.end method

.method private ۧ()V
    .locals 2

    .line 403
    iget-object v0, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 405
    iget-object v0, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    iget-object v1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    new-instance v0, Ll/᩵ۜܺ;

    iget-object v1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {v0, v1}, Ll/᩵ۜܺ;-><init>(Ll/᩵ۜܺ;)V

    iput-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    return-void
.end method

.method private ۫()Landroid/graphics/Path$FillType;
    .locals 2

    .line 4063
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ܿ:Ll/ܳ۠ܺ;

    if-eqz v0, :cond_0

    sget-object v1, Ll/ܳ۠ܺ;->᩶:Ll/ܳ۠ܺ;

    if-ne v0, v1, :cond_0

    .line 4064
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    return-object v0

    .line 4066
    :cond_0
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    return-object v0
.end method

.method private ܳ()Ll/᩻۠ܺ;
    .locals 3

    .line 1536
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, v0, Ll/᩹۠ܺ;->۟:Ll/ܽ۠ܺ;

    sget-object v2, Ll/ܽ۠ܺ;->᩶:Ll/ܽ۠ܺ;

    if-eq v1, v2, :cond_2

    iget-object v1, v0, Ll/᩹۠ܺ;->ۘۙ:Ll/᩻۠ܺ;

    sget-object v2, Ll/᩻۠ܺ;->ܿ:Ll/᩻۠ܺ;

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 1540
    :cond_0
    sget-object v0, Ll/᩻۠ܺ;->֡:Ll/᩻۠ܺ;

    if-ne v1, v0, :cond_1

    sget-object v0, Ll/᩻۠ܺ;->᩶:Ll/᩻۠ܺ;

    :cond_1
    return-object v0

    .line 1537
    :cond_2
    :goto_0
    iget-object v0, v0, Ll/᩹۠ܺ;->ۘۙ:Ll/᩻۠ܺ;

    return-object v0
.end method

.method private ܺ()Z
    .locals 1

    .line 2096
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->۟ۙ:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 2097
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private ᩴ()Z
    .locals 1

    .line 2088
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->ᩳ:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 2089
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private ᩷(Ll/ۘ۠ܺ;)Landroid/graphics/Path;
    .locals 10
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .line 3840
    iget-object v0, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    iget-object v1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3841
    new-instance v0, Ll/᩵ۜܺ;

    iget-object v1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-direct {v0, v1}, Ll/᩵ۜܺ;-><init>(Ll/᩵ۜܺ;)V

    iput-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    .line 3843
    invoke-direct {p0, v0, p1}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/ܰ۠ܺ;)V

    .line 3845
    invoke-direct {p0}, Ll/ۘۜܺ;->ᩴ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1f

    invoke-direct {p0}, Ll/ۘۜܺ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_a

    .line 3852
    :cond_0
    instance-of v0, p1, Ll/۫ۜܺ;

    if-eqz v0, :cond_5

    .line 3859
    move-object v0, p1

    check-cast v0, Ll/۫ۜܺ;

    .line 3860
    iget-object v2, p1, Ll/ܿ۠ܺ;->ۙ:Ll/֫ۜܺ;

    iget-object v3, v0, Ll/۫ۜܺ;->ۗ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ll/֫ۜܺ;->ۙ(Ljava/lang/String;)Ll/ܰ۠ܺ;

    move-result-object v2

    if-nez v2, :cond_1

    .line 3863
    iget-object p1, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۜܺ;

    iput-object p1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    return-object v1

    .line 3866
    :cond_1
    instance-of v3, v2, Ll/ۘ۠ܺ;

    if-nez v3, :cond_2

    .line 3867
    iget-object p1, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۜܺ;

    iput-object p1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    return-object v1

    .line 3871
    :cond_2
    check-cast v2, Ll/ۘ۠ܺ;

    invoke-direct {p0, v2}, Ll/ۘۜܺ;->᩷(Ll/ۘ۠ܺ;)Landroid/graphics/Path;

    move-result-object v2

    if-nez v2, :cond_3

    goto/16 :goto_9

    .line 3875
    :cond_3
    iget-object v1, v0, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v1, :cond_4

    .line 3876
    invoke-static {v2}, Ll/ۘۜܺ;->ۙ(Landroid/graphics/Path;)Ll/֫ۖܺ;

    move-result-object v1

    iput-object v1, v0, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    .line 3879
    :cond_4
    iget-object v0, v0, Ll/᩺ۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_1c

    .line 3880
    invoke-virtual {v2, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    goto/16 :goto_8

    .line 3882
    :cond_5
    instance-of v0, p1, Ll/ۛۖܺ;

    if-eqz v0, :cond_f

    .line 3884
    move-object v0, p1

    check-cast v0, Ll/ۛۖܺ;

    .line 3886
    instance-of v2, p1, Ll/ۡۖܺ;

    if-eqz v2, :cond_6

    .line 3888
    move-object v2, p1

    check-cast v2, Ll/ۡۖܺ;

    .line 3889
    new-instance v3, Ll/ܽۜܺ;

    iget-object v2, v2, Ll/ۡۖܺ;->᩹:Ll/ۖۖܺ;

    invoke-direct {v3, v2}, Ll/ܽۜܺ;-><init>(Ll/ۖۖܺ;)V

    .line 2625
    iget-object v2, v3, Ll/ܽۜܺ;->ۤ:Landroid/graphics/Path;

    .line 3890
    iget-object v3, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v3, :cond_b

    .line 3891
    invoke-static {v2}, Ll/ۘۜܺ;->ۙ(Landroid/graphics/Path;)Ll/֫ۖܺ;

    move-result-object v3

    iput-object v3, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    goto :goto_0

    .line 3893
    :cond_6
    instance-of v2, p1, Ll/᩷۠ܺ;

    if-eqz v2, :cond_7

    .line 3894
    move-object v2, p1

    check-cast v2, Ll/᩷۠ܺ;

    invoke-direct {p0, v2}, Ll/ۘۜܺ;->ۙ(Ll/᩷۠ܺ;)Landroid/graphics/Path;

    move-result-object v2

    goto :goto_0

    .line 3895
    :cond_7
    instance-of v2, p1, Ll/᩻ۖܺ;

    if-eqz v2, :cond_8

    .line 3896
    move-object v2, p1

    check-cast v2, Ll/᩻ۖܺ;

    invoke-direct {p0, v2}, Ll/ۘۜܺ;->ۙ(Ll/᩻ۖܺ;)Landroid/graphics/Path;

    move-result-object v2

    goto :goto_0

    .line 3897
    :cond_8
    instance-of v2, p1, Ll/ۗۖܺ;

    if-eqz v2, :cond_9

    .line 3898
    move-object v2, p1

    check-cast v2, Ll/ۗۖܺ;

    invoke-direct {p0, v2}, Ll/ۘۜܺ;->ۙ(Ll/ۗۖܺ;)Landroid/graphics/Path;

    move-result-object v2

    goto :goto_0

    .line 3899
    :cond_9
    instance-of v2, p1, Ll/۬ۖܺ;

    if-eqz v2, :cond_a

    .line 3900
    move-object v2, p1

    check-cast v2, Ll/۬ۖܺ;

    invoke-static {v2}, Ll/ۘۜܺ;->ۙ(Ll/۬ۖܺ;)Landroid/graphics/Path;

    move-result-object v2

    goto :goto_0

    :cond_a
    move-object v2, v1

    :cond_b
    :goto_0
    if-nez v2, :cond_c

    goto/16 :goto_9

    .line 3905
    :cond_c
    iget-object v1, v0, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v1, :cond_d

    .line 3906
    invoke-static {v2}, Ll/ۘۜܺ;->ۙ(Landroid/graphics/Path;)Ll/֫ۖܺ;

    move-result-object v1

    iput-object v1, v0, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    .line 3909
    :cond_d
    iget-object v0, v0, Ll/ۛۖܺ;->ܶ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_e

    .line 3910
    invoke-virtual {v2, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 3912
    :cond_e
    invoke-direct {p0}, Ll/ۘۜܺ;->۫()Landroid/graphics/Path$FillType;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    goto/16 :goto_8

    .line 3914
    :cond_f
    instance-of v0, p1, Ll/ۜ۠ܺ;

    if-eqz v0, :cond_1e

    .line 3916
    move-object v0, p1

    check-cast v0, Ll/ۜ۠ܺ;

    .line 4400
    iget-object v1, v0, Ll/ۤۜܺ;->ۗ:Ljava/util/ArrayList;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_10

    goto :goto_1

    :cond_10
    iget-object v1, v0, Ll/ۤۜܺ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۖܺ;

    invoke-virtual {v1, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v1

    goto :goto_2

    :cond_11
    :goto_1
    const/4 v1, 0x0

    .line 4401
    :goto_2
    iget-object v4, v0, Ll/ۤۜܺ;->᩵:Ljava/util/ArrayList;

    if-eqz v4, :cond_13

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_12

    goto :goto_3

    :cond_12
    iget-object v4, v0, Ll/ۤۜܺ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܿۖܺ;

    invoke-virtual {v4, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v4

    goto :goto_4

    :cond_13
    :goto_3
    const/4 v4, 0x0

    .line 4402
    :goto_4
    iget-object v5, v0, Ll/ۤۜܺ;->ܶ:Ljava/util/ArrayList;

    if-eqz v5, :cond_15

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-nez v5, :cond_14

    goto :goto_5

    :cond_14
    iget-object v5, v0, Ll/ۤۜܺ;->ܶ:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܿۖܺ;

    invoke-virtual {v5, p0}, Ll/ܿۖܺ;->᩷(Ll/ۘۜܺ;)F

    move-result v5

    goto :goto_6

    :cond_15
    :goto_5
    const/4 v5, 0x0

    .line 4403
    :goto_6
    iget-object v6, v0, Ll/ۤۜܺ;->᩹:Ljava/util/ArrayList;

    if-eqz v6, :cond_17

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-nez v6, :cond_16

    goto :goto_7

    :cond_16
    iget-object v3, v0, Ll/ۤۜܺ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿۖܺ;

    invoke-virtual {v2, p0}, Ll/ܿۖܺ;->ۤ(Ll/ۘۜܺ;)F

    move-result v3

    .line 4406
    :cond_17
    :goto_7
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v2, v2, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v2, v2, Ll/᩹۠ܺ;->ۘۙ:Ll/᩻۠ܺ;

    sget-object v6, Ll/᩻۠ܺ;->֡:Ll/᩻۠ܺ;

    if-eq v2, v6, :cond_19

    .line 4407
    invoke-direct {p0, v0}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;)F

    move-result v2

    .line 4408
    iget-object v6, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v6, v6, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v6, v6, Ll/᩹۠ܺ;->ۘۙ:Ll/᩻۠ܺ;

    sget-object v7, Ll/᩻۠ܺ;->ܿ:Ll/᩻۠ܺ;

    if-ne v6, v7, :cond_18

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v2, v6

    :cond_18
    sub-float/2addr v1, v2

    .line 4415
    :cond_19
    iget-object v2, v0, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    if-nez v2, :cond_1a

    .line 4416
    new-instance v2, Ll/ۨۜܺ;

    invoke-direct {v2, p0, v1, v4}, Ll/ۨۜܺ;-><init>(Ll/ۘۜܺ;FF)V

    .line 4417
    invoke-direct {p0, v0, v2}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;Ll/ۛۜܺ;)V

    .line 4418
    new-instance v6, Ll/֫ۖܺ;

    iget-object v7, v2, Ll/ۨۜܺ;->ۙ:Landroid/graphics/RectF;

    iget v8, v7, Landroid/graphics/RectF;->left:F

    iget v9, v7, Landroid/graphics/RectF;->top:F

    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    move-result v7

    iget-object v2, v2, Ll/ۨۜܺ;->ۙ:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    invoke-direct {v6, v8, v9, v7, v2}, Ll/֫ۖܺ;-><init>(FFFF)V

    iput-object v6, v0, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    .line 4421
    :cond_1a
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 4422
    new-instance v6, Ll/ۗۜܺ;

    add-float/2addr v1, v5

    add-float/2addr v4, v3

    invoke-direct {v6, p0, v1, v4, v2}, Ll/ۗۜܺ;-><init>(Ll/ۘۜܺ;FFLandroid/graphics/Path;)V

    invoke-direct {p0, v0, v6}, Ll/ۘۜܺ;->ۙ(Ll/ۙۜܺ;Ll/ۛۜܺ;)V

    .line 3922
    iget-object v0, v0, Ll/ۜ۠ܺ;->ۨ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_1b

    .line 3923
    invoke-virtual {v2, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 3925
    :cond_1b
    invoke-direct {p0}, Ll/ۘۜܺ;->۫()Landroid/graphics/Path$FillType;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 3933
    :cond_1c
    :goto_8
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->᩶:Ljava/lang/String;

    if-eqz v0, :cond_1d

    .line 3935
    iget-object v0, p1, Ll/ۘ۠ܺ;->ۚ:Ll/֫ۖܺ;

    invoke-direct {p0, p1, v0}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)Landroid/graphics/Path;

    move-result-object p1

    if-eqz p1, :cond_1d

    .line 3937
    sget-object v0, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    invoke-virtual {v2, p1, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 3941
    :cond_1d
    iget-object p1, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۜܺ;

    iput-object p1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    return-object v2

    :cond_1e
    :goto_9
    return-object v1

    .line 3846
    :cond_1f
    :goto_a
    iget-object p1, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۜܺ;

    iput-object p1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    return-object v1
.end method

.method public static bridge synthetic ᩷(Ll/ۘۜܺ;)Ll/᩵ۜܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    return-object p0
.end method

.method private ᩷(Landroid/graphics/Path;)V
    .locals 5

    .line 508
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v1, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, v1, Ll/᩹۠ܺ;->᩶ۙ:Ll/ܶ۠ܺ;

    sget-object v2, Ll/ܶ۠ܺ;->᩶:Ll/ܶ۠ܺ;

    iget-object v3, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    if-ne v1, v2, :cond_2

    .line 514
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    .line 516
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 517
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 519
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v3, p1}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 522
    iget-object p1, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object p1, p1, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    move-result-object p1

    .line 523
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    if-eqz p1, :cond_0

    .line 525
    invoke-virtual {p1, v2}, Landroid/graphics/Shader;->getLocalMatrix(Landroid/graphics/Matrix;)Z

    .line 526
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 527
    invoke-virtual {v4, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 528
    invoke-virtual {p1, v4}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 532
    :cond_0
    iget-object v4, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v4, v4, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    invoke-virtual {v3, v1, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 535
    invoke-virtual {v3, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    if-eqz p1, :cond_1

    .line 538
    invoke-virtual {p1, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    :cond_1
    return-void

    .line 542
    :cond_2
    iget-object v0, v0, Ll/᩵ۜܺ;->ᩴ:Landroid/graphics/Paint;

    invoke-virtual {v3, p1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method private ᩷(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)V
    .locals 1

    .line 3751
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v0, v0, Ll/᩹۠ܺ;->᩶:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    .line 3757
    :cond_0
    invoke-direct {p0, p1, p2}, Ll/ۘۜܺ;->ۙ(Ll/ۘ۠ܺ;Ll/֫ۖܺ;)Landroid/graphics/Path;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3759
    iget-object p2, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method private ᩻()V
    .locals 3

    .line 2592
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ܳ:Ll/᩹۠ܺ;

    iget-object v1, v0, Ll/᩹۠ܺ;->ܿۙ:Ll/֡۠ܺ;

    instance-of v2, v1, Ll/ܽۖܺ;

    if-eqz v2, :cond_0

    .line 2593
    check-cast v1, Ll/ܽۖܺ;

    iget v1, v1, Ll/ܽۖܺ;->ܰ:I

    goto :goto_0

    .line 2594
    :cond_0
    instance-of v1, v1, Ll/ܶۖܺ;

    if-eqz v1, :cond_2

    .line 2595
    iget-object v1, v0, Ll/᩹۠ܺ;->֡:Ll/ܽۖܺ;

    iget v1, v1, Ll/ܽۖܺ;->ܰ:I

    .line 2599
    :goto_0
    iget-object v0, v0, Ll/᩹۠ܺ;->֡ۙ:Ljava/lang/Float;

    if-eqz v0, :cond_1

    .line 2600
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0, v1}, Ll/ۘۜܺ;->ۙ(FI)I

    move-result v1

    .line 2602
    :cond_1
    iget-object v0, p0, Ll/ۘۜܺ;->ᩴ:Landroid/graphics/Canvas;

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final ۙ()F
    .locals 1

    .line 230
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ۙ:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    return v0
.end method

.method public final ۙ(Ll/֫ۜܺ;Ll/ۚۖܺ;)V
    .locals 5

    .line 262
    iput-object p1, p0, Ll/ۘۜܺ;->۫:Ll/֫ۜܺ;

    .line 264
    invoke-virtual {p1}, Ll/֫ۜܺ;->ܳ()Ll/ۗ۠ܺ;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 293
    :cond_0
    iget-object v0, p1, Ll/ۢ۠ܺ;->᩹:Ll/֫ۖܺ;

    .line 295
    iget-object v1, p1, Ll/۟۠ܺ;->ܶ:Ll/۫ۖܺ;

    .line 186
    new-instance v2, Ll/᩵ۜܺ;

    invoke-direct {v2}, Ll/᩵ۜܺ;-><init>()V

    iput-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    .line 187
    new-instance v2, Ljava/util/Stack;

    invoke-direct {v2}, Ljava/util/Stack;-><init>()V

    iput-object v2, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    .line 190
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-static {}, Ll/᩹۠ܺ;->ۙ()Ll/᩹۠ܺ;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Ll/ۘۜܺ;->ۙ(Ll/᩵ۜܺ;Ll/᩹۠ܺ;)V

    .line 192
    iget-object v2, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    const/4 v3, 0x0

    iput-object v3, v2, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    const/4 v3, 0x0

    .line 194
    iput-boolean v3, v2, Ll/᩵ۜܺ;->᩸:Z

    .line 197
    iget-object v3, p0, Ll/ۘۜܺ;->ܺ:Ljava/util/Stack;

    new-instance v4, Ll/᩵ۜܺ;

    invoke-direct {v4, v2}, Ll/᩵ۜܺ;-><init>(Ll/᩵ۜܺ;)V

    invoke-virtual {v3, v4}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    new-instance v2, Ljava/util/Stack;

    invoke-direct {v2}, Ljava/util/Stack;-><init>()V

    iput-object v2, p0, Ll/ۘۜܺ;->֫:Ljava/util/Stack;

    .line 202
    new-instance v2, Ljava/util/Stack;

    invoke-direct {v2}, Ljava/util/Stack;-><init>()V

    iput-object v2, p0, Ll/ۘۜܺ;->ۧ:Ljava/util/Stack;

    .line 477
    iget-object v2, p1, Ll/ܰ۠ܺ;->ܳ:Ljava/lang/Boolean;

    if-eqz v2, :cond_1

    .line 478
    iget-object v3, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v3, Ll/᩵ۜܺ;->᩸:Z

    .line 311
    :cond_1
    invoke-direct {p0}, Ll/ۘۜܺ;->ۧ()V

    .line 313
    new-instance v2, Ll/֫ۖܺ;

    iget-object p2, p2, Ll/ۚۖܺ;->ۙ:Ll/֫ۖܺ;

    invoke-direct {v2, p2}, Ll/֫ۖܺ;-><init>(Ll/֫ۖܺ;)V

    .line 315
    iget-object p2, p1, Ll/ۗ۠ܺ;->᩵:Ll/ܿۖܺ;

    if-eqz p2, :cond_2

    .line 316
    iget v3, v2, Ll/֫ۖܺ;->᩸:F

    invoke-virtual {p2, p0, v3}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result p2

    iput p2, v2, Ll/֫ۖܺ;->᩸:F

    .line 317
    :cond_2
    iget-object p2, p1, Ll/ۗ۠ܺ;->ۗ:Ll/ܿۖܺ;

    if-eqz p2, :cond_3

    .line 318
    iget v3, v2, Ll/֫ۖܺ;->ۙ:F

    invoke-virtual {p2, p0, v3}, Ll/ܿۖܺ;->ۙ(Ll/ۘۜܺ;F)F

    move-result p2

    iput p2, v2, Ll/֫ۖܺ;->ۙ:F

    .line 321
    :cond_3
    invoke-direct {p0, p1, v2, v0, v1}, Ll/ۘۜܺ;->ۙ(Ll/ۗ۠ܺ;Ll/֫ۖܺ;Ll/֫ۖܺ;Ll/۫ۖܺ;)V

    .line 324
    invoke-direct {p0}, Ll/ۘۜܺ;->֫()V

    return-void
.end method

.method public final ۤ()Ll/֫ۖܺ;
    .locals 2

    .line 247
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v1, v0, Ll/᩵ۜܺ;->۫:Ll/֫ۖܺ;

    if-eqz v1, :cond_0

    return-object v1

    .line 250
    :cond_0
    iget-object v0, v0, Ll/᩵ۜܺ;->ۚ:Ll/֫ۖܺ;

    return-object v0
.end method

.method public final ᩷()F
    .locals 2

    .line 237
    iget-object v0, p0, Ll/ۘۜܺ;->᩻:Ll/᩵ۜܺ;

    iget-object v0, v0, Ll/᩵ۜܺ;->ۙ:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public final ᩸()F
    .locals 1

    .line 224
    iget v0, p0, Ll/ۘۜܺ;->ۚ:F

    return v0
.end method

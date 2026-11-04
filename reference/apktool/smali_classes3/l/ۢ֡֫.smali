.class public Ll/ۢ֡֫;
.super Landroid/graphics/drawable/Drawable;
.source "FA3A"


# static fields
.field public static final synthetic ۚ:I


# instance fields
.field public final ۙ:Landroid/graphics/Canvas;

.field public final ۤ:Landroid/graphics/Paint;

.field public final ۫:F

.field public final ܳ:F

.field public final ᩴ:F

.field public final ᩷:Landroid/graphics/drawable/BitmapDrawable;

.field public ᩸:F


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;FF)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    const v10, 0x226ea501

    sget v11, Ll/֨ۚ;->֡᩸ۛ:I

    sget v12, Ll/ۗ֡;->ۜ᩻۫:I

    .line 40
    invoke-direct/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const-string v13, "\u073a\u1a76"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x337f

    const v15, -0x4e5c7d9

    xor-int/2addr v14, v15

    const v15, 0x123fbdb8

    :goto_0
    xor-int/2addr v13, v15

    const/4 v15, 0x0

    :goto_1
    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, 0x4cf3

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    mul-int v5, v3, v3

    sget v13, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v13, :cond_7

    goto/16 :goto_6

    .line 11
    :sswitch_0
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v13, Ll/᩺;->۫۬۫:I

    if-gtz v13, :cond_0

    goto/16 :goto_6

    :cond_0
    :goto_2
    move/from16 v13, p2

    move/from16 v14, p3

    goto/16 :goto_7

    .line 49
    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v13

    if-nez v13, :cond_4

    :goto_3
    move/from16 v13, p2

    move/from16 v14, p3

    goto/16 :goto_9

    .line 1
    :sswitch_2
    sget v13, Ll/֨ܿ;->᩹᩻۟:I

    if-gez v13, :cond_8

    goto :goto_3

    :sswitch_3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto :goto_3

    :sswitch_4
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 49
    :sswitch_5
    invoke-virtual {v15, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 50
    sget-object v13, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v15, v13}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 51
    new-instance v13, Landroid/graphics/PorterDuffXfermode;

    .line 22
    sget v14, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v14, :cond_1

    goto :goto_2

    .line 51
    :cond_1
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v13, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v15, v13}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void

    :sswitch_6
    double-to-float v13, v6

    .line 47
    iput v13, v0, Ll/ۢ֡֫;->ᩴ:F

    .line 48
    new-instance v15, Landroid/graphics/Paint;

    .line 44
    sget v13, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v13, :cond_2

    goto :goto_4

    :cond_2
    const/4 v13, 0x1

    sget v14, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v14, :cond_3

    goto/16 :goto_6

    .line 48
    :cond_3
    invoke-direct {v15, v13}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v15, v0, Ll/ۢ֡֫;->ۤ:Landroid/graphics/Paint;

    const/4 v9, 0x0

    .line 37
    sget v13, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v13, :cond_5

    :cond_4
    const-string v13, "\u05a8\u06e8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x7

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6cef

    const v16, 0x2231cb7e

    xor-int v14, v14, v16

    const v16, -0x3ae0cf5

    goto :goto_5

    :cond_5
    const-string v13, "\u05ab\u1a73"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7b67

    const v16, -0x35b4b4ab

    xor-int v14, v14, v16

    const v16, 0x32613930

    goto :goto_5

    :sswitch_7
    add-int v6, v5, v4

    int-to-double v6, v6

    .line 47
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    sget v13, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v13, :cond_6

    :goto_4
    const-string v13, "\u06eb\u0736"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x7b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4131

    const v15, 0x58935481

    xor-int/2addr v14, v15

    const v15, 0x5c98694b

    goto/16 :goto_0

    :cond_6
    const-string v13, "\u1a74\u0730"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7299

    const v16, 0xdadb3f3

    xor-int v14, v14, v16

    const v16, 0x5c8f7af3

    goto :goto_5

    :cond_7
    const-string v13, "\u06d7\u06da"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x97f

    const v16, -0x1a3c8a88

    xor-int v14, v14, v16

    const v16, -0x3aeed1cc

    :goto_5
    xor-int v13, v13, v16

    goto/16 :goto_1

    .line 45
    :sswitch_8
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 46
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    mul-int v3, v3, v3

    .line 38
    sget v13, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v13, :cond_9

    move/from16 v18, v4

    move v4, v3

    move/from16 v3, v18

    :cond_8
    :goto_6
    const-string v13, "\u06d7\u06eb"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x4f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x68cb

    const v15, -0x56c7cd16

    xor-int/2addr v14, v15

    const v15, 0x41e9ea21

    goto/16 :goto_0

    :cond_9
    const-string v13, "\u06da\u1a75"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x32ed

    const v16, -0x222edb97

    xor-int v14, v14, v16

    const v16, -0x7c33bb87

    xor-int v13, v13, v16

    move/from16 v18, v4

    move v4, v3

    move/from16 v3, v18

    goto/16 :goto_1

    .line 42
    :sswitch_9
    iput-object v2, v0, Ll/ۢ֡֫;->ۙ:Landroid/graphics/Canvas;

    move/from16 v13, p2

    .line 43
    iput v13, v0, Ll/ۢ֡֫;->ܳ:F

    move/from16 v14, p3

    .line 44
    iput v14, v0, Ll/ۢ֡֫;->۫:F

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v16

    if-eqz v16, :cond_a

    goto/16 :goto_9

    :cond_a
    const-string v16, "\u1a7a\u1a79"

    invoke-static/range {v16 .. v16}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v11

    xor-int v8, v16, v12

    mul-int/lit16 v8, v8, 0x405

    const v17, -0x5a42b294

    xor-int v8, v8, v17

    const v17, 0x3e77d010

    xor-int v16, v16, v17

    move v14, v8

    move/from16 v13, v16

    goto/16 :goto_1

    :sswitch_a
    move/from16 v13, p2

    move/from16 v14, p3

    .line 42
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 15
    sget v8, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v8, :cond_b

    :goto_7
    const-string v8, "\u06df\u1a75"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v12

    move-object/from16 v16, v2

    xor-int v2, v8, v11

    mul-int/lit16 v2, v2, -0x5f49

    const v17, -0x6dbdd2a8

    xor-int v2, v2, v17

    const v17, -0x7ca5c177

    goto :goto_8

    :cond_b
    const-string v8, "\u06e2\u1a79"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v11

    move-object/from16 v16, v2

    xor-int v2, v8, v12

    mul-int/lit16 v2, v2, -0x5233

    const v17, 0x1b142a1f

    xor-int v2, v2, v17

    const v17, -0x20bf0fac

    :goto_8
    xor-int v8, v8, v17

    move v14, v2

    move v13, v8

    move-object/from16 v2, v16

    goto/16 :goto_1

    :sswitch_b
    move/from16 v13, p2

    move/from16 v14, p3

    .line 41
    new-instance v8, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v8, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v8, v0, Ll/ۢ֡֫;->᩷:Landroid/graphics/drawable/BitmapDrawable;

    sget-boolean v8, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v8, :cond_c

    :goto_9
    const-string v8, "\u06e2\u1a73"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v11

    mul-int/lit8 v8, v8, 0x57

    xor-int v0, v8, v12

    mul-int/lit16 v0, v0, 0x1151

    const v16, -0x46fe7ec2

    xor-int v0, v0, v16

    const v16, -0x5d81bb1f

    xor-int v8, v8, v16

    move v14, v0

    move v13, v8

    goto :goto_a

    :cond_c
    const-string v0, "\u06e8\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v8, v0, v11

    mul-int/lit16 v8, v8, -0x1715

    const v16, -0x63cebb1e

    xor-int v8, v8, v16

    const v16, -0x27511a6c

    xor-int v0, v0, v16

    move v13, v0

    move v14, v8

    :goto_a
    move-object/from16 v0, p0

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7de59d1b -> :sswitch_5
        -0x70ba0f44 -> :sswitch_6
        -0x56a0f6fd -> :sswitch_8
        -0x4caf9d9b -> :sswitch_6
        -0x44db78e1 -> :sswitch_3
        -0x4166274d -> :sswitch_b
        -0x3da033e6 -> :sswitch_4
        -0x22422f4e -> :sswitch_5
        -0x2183ee01 -> :sswitch_2
        -0x18d80450 -> :sswitch_0
        -0x74b5393 -> :sswitch_9
        -0x21c9b92 -> :sswitch_b
        -0x13c3efa -> :sswitch_0
        0x253c798 -> :sswitch_7
        0x11cb2d4f -> :sswitch_3
        0x1cfdd885 -> :sswitch_4
        0x377236b3 -> :sswitch_a
        0x3c518df2 -> :sswitch_8
        0x41f50bbf -> :sswitch_2
        0x486b89af -> :sswitch_9
        0x487cde9d -> :sswitch_1
        0x523a62fb -> :sswitch_7
        0x6c86f255 -> :sswitch_1
        0x77c02b48 -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x496a057a

    sget v8, Ll/֨ܿ;->᩹᩻۟:I

    sget v9, Ll/֫֡;->֫ۙۖ:I

    const-string v10, "\u0733\u1a79"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x59

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5309

    const v12, 0x540e1c05

    xor-int/2addr v11, v12

    const v12, 0x56dc0930

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, 0x2e75

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    sget v10, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v10, :cond_9

    goto/16 :goto_2

    .line 9
    :sswitch_0
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget-boolean v10, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v10, :cond_0

    goto/16 :goto_3

    .line 56
    :sswitch_1
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v10

    if-nez v10, :cond_7

    goto/16 :goto_2

    .line 18
    :sswitch_2
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v10, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v10, :cond_a

    goto/16 :goto_2

    .line 31
    :sswitch_3
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    goto/16 :goto_2

    .line 46
    :sswitch_4
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    return-void

    .line 62
    :sswitch_5
    invoke-virtual {v4, v5, v6, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 63
    iget-object v0, p0, Ll/ۢ֡֫;->᩷:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    .line 62
    :sswitch_6
    iget v6, p0, Ll/ۢ֡֫;->۫:F

    sget v10, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v10, :cond_1

    :cond_0
    const-string v10, "\u06df\u1a76"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x2f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x297

    const v12, 0x2add8df6

    xor-int/2addr v11, v12

    const v12, 0x78ff24cf

    goto :goto_0

    :cond_1
    const-string v10, "\u1a79\u1a78"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x57

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2621

    const v12, -0x2fb7c9d3

    xor-int/2addr v11, v12

    const v12, -0x5806d6b2

    goto :goto_0

    :sswitch_7
    iget-object v4, p0, Ll/ۢ֡֫;->ۙ:Landroid/graphics/Canvas;

    iget v5, p0, Ll/ۢ֡֫;->ܳ:F

    .line 22
    sget v10, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v10, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v10, "\u0736\u1a78"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x7b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5b89

    const v12, 0x44d65c51

    xor-int/2addr v11, v12

    const v12, -0x7a7f9ccf

    goto/16 :goto_0

    :sswitch_8
    mul-float v2, v0, v1

    .line 62
    iget-object v3, p0, Ll/ۢ֡֫;->ۤ:Landroid/graphics/Paint;

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v10

    if-gtz v10, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v10, "\u1a75\u05a1"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x65

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6f8d

    const v12, 0x3d7a3df0

    xor-int/2addr v11, v12

    const v12, 0x5d75fc1d

    goto/16 :goto_0

    :sswitch_9
    iget v1, p0, Ll/ۢ֡֫;->᩸:F

    .line 55
    sget v10, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v10, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v10, "\u1a77\u073a"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x40e5

    const v12, 0x59a6f22b

    xor-int/2addr v11, v12

    const v12, 0x48d8f743

    goto/16 :goto_0

    .line 62
    :sswitch_a
    iget v0, p0, Ll/ۢ֡֫;->ᩴ:F

    .line 49
    sget v10, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v10, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v10, "\u1a78\u06da"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0xd

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0xef1

    const v12, 0x274ebca

    xor-int/2addr v11, v12

    const v12, 0x76f8c358

    goto/16 :goto_0

    .line 47
    :sswitch_b
    sget v10, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v10, :cond_6

    goto :goto_1

    :cond_6
    const-string v10, "\u06db\u06df"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x61

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3ffb

    const v12, 0x2df13e8a

    xor-int/2addr v11, v12

    const v12, -0x7a6f6889

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v10, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v10, :cond_8

    :cond_7
    :goto_1
    const-string v10, "\u0733\u06ec"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x64f7

    const v12, 0x40d7f187

    xor-int/2addr v11, v12

    const v12, -0x45ae1ab4

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u1a75\u0736"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x68d

    const v12, -0x46bcf863

    xor-int/2addr v11, v12

    const v12, -0x7492b1ae

    goto/16 :goto_0

    :goto_2
    const-string v10, "\u06e0\u05a1"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1a2b

    const v12, -0x6ef073ef

    xor-int/2addr v11, v12

    const v12, -0x37b228d6

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u1a75\u06d8"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3875

    const v12, -0x259133f3

    xor-int/2addr v11, v12

    const v12, -0x561418da

    goto/16 :goto_0

    :sswitch_d
    sget v10, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v10, :cond_b

    :cond_a
    :goto_3
    const-string v10, "\u073d\u0736"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x3b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x29bb

    const v12, 0x7ff13c2

    xor-int/2addr v11, v12

    const v12, 0x3b6c9ffc

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u06db\u06e4"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xad3

    const v12, -0x343ab246    # -2.586098E7f

    xor-int/2addr v11, v12

    const v12, 0xa6f1da

    goto/16 :goto_0

    .line 8
    :sswitch_e
    sget-boolean v10, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v10, :cond_c

    :goto_4
    const-string v10, "\u06e4\u073f"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x3f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1131

    const v12, -0x2b155db0

    xor-int/2addr v11, v12

    const v12, -0x1f748ed6

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u06eb\u06d6"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3143

    const v12, 0x7dbcc949

    xor-int/2addr v11, v12

    const v12, -0x1f714855

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ca9c88d -> :sswitch_5
        -0x7c1a100c -> :sswitch_8
        -0x62d56795 -> :sswitch_b
        -0x5fa32a68 -> :sswitch_c
        -0x58d0aa7a -> :sswitch_d
        -0x52df32b1 -> :sswitch_4
        -0x50c10003 -> :sswitch_7
        -0x482638b1 -> :sswitch_a
        -0x4370e66a -> :sswitch_0
        -0x3810e8d5 -> :sswitch_6
        -0x2d2fca65 -> :sswitch_3
        -0x1f76e3f7 -> :sswitch_c
        -0x1e6ff58c -> :sswitch_a
        -0x11bcec65 -> :sswitch_8
        -0x114f7a93 -> :sswitch_6
        -0x7137454 -> :sswitch_7
        0xdae7f0 -> :sswitch_9
        0x1e11a22 -> :sswitch_1
        0x361961d -> :sswitch_9
        0x1cc9dc2e -> :sswitch_2
        0x1fe3d44a -> :sswitch_0
        0x2df6aa48 -> :sswitch_b
        0x32915352 -> :sswitch_1
        0x38eaff18 -> :sswitch_5
        0x414abb4f -> :sswitch_e
        0x425f8ab7 -> :sswitch_e
        0x4616b59b -> :sswitch_d
        0x6ed5d290 -> :sswitch_4
        0x734c212d -> :sswitch_3
        0x738c2feb -> :sswitch_2
    .end sparse-switch
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 6

    const v0, -0x4e87535c

    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    sget v2, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v3, "\u073a\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x731

    const v5, 0x5f000b3a

    xor-int/2addr v4, v5

    const v5, -0x3e2f3cb4

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x5d57

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 11
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_4

    goto/16 :goto_1

    .line 5
    :sswitch_0
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v3, :cond_5

    goto/16 :goto_2

    .line 17
    :sswitch_1
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-lez v3, :cond_b

    goto/16 :goto_3

    :sswitch_2
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-lez v3, :cond_9

    goto/16 :goto_2

    .line 47
    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    return-void

    .line 57
    :sswitch_5
    iget-object v0, p0, Ll/ۢ֡֫;->᩷:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void

    .line 56
    :sswitch_6
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 26
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\u1a7a\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7fe3

    const v5, 0x6e686986

    xor-int/2addr v4, v5

    const v5, -0x2f45c863

    goto :goto_0

    :cond_0
    const-string v3, "\u06eb\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x16c3

    const v5, 0x4bb005c4    # 2.3071624E7f

    xor-int/2addr v4, v5

    const v5, 0x6a6aec6b

    goto :goto_0

    :sswitch_7
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06db\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3d91

    const v5, 0x710e1e36

    xor-int/2addr v4, v5

    const v5, 0x21718757

    goto/16 :goto_0

    .line 2
    :sswitch_8
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a78\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7a51

    const v5, 0x3fd257cf

    xor-int/2addr v4, v5

    const v5, -0x33848a8e    # -6.591841E7f

    goto/16 :goto_0

    .line 50
    :sswitch_9
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06d9\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x24b3

    const v5, -0x3f3cb9f9

    xor-int/2addr v4, v5

    const v5, 0x144fee24

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a7a\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2af

    const v5, 0x7e707fe1

    xor-int/2addr v4, v5

    const v5, -0x19ac1144    # -2.502058E23f

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u06d7\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x438b

    const v5, -0x168daea6

    xor-int/2addr v4, v5

    const v5, -0x67250a00    # -5.6600076E-24f

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a79\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7f23

    const v5, 0xd88b6b7

    xor-int/2addr v4, v5

    const v5, -0x103dcd17

    goto/16 :goto_0

    .line 39
    :sswitch_b
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u073f\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x76dd

    const v5, 0x258bda7

    xor-int/2addr v4, v5

    const v5, -0x5d9b205e

    goto/16 :goto_0

    .line 46
    :sswitch_c
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_8

    :goto_2
    const-string v3, "\u06db\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6f53

    const v5, -0xfadf755    # -2.6000932E29f

    xor-int/2addr v4, v5

    const v5, -0x1fdbd00

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06df\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7a2d

    const v5, -0x23857ae0

    xor-int/2addr v4, v5

    const v5, -0xcefacf8

    goto/16 :goto_0

    .line 10
    :sswitch_d
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06d8\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7c27

    const v5, -0x3ee713b8

    xor-int/2addr v4, v5

    const v5, -0x9d98f26

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06eb\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4a9d

    const v5, -0x6a50f2fe

    xor-int/2addr v4, v5

    const v5, -0x33694a68    # -7.90151E7f

    goto/16 :goto_0

    .line 56
    :sswitch_e
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u05ab\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3d3

    const v5, -0x325ed2c6

    xor-int/2addr v4, v5

    const v5, 0x5a651e16

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6d0f

    const v5, 0x5701dfe1

    xor-int/2addr v4, v5

    const v5, -0x4e8b133c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fcd91fd -> :sswitch_6
        -0x77140945 -> :sswitch_0
        -0x71aae6ac -> :sswitch_3
        -0x68de6c05 -> :sswitch_7
        -0x655072ae -> :sswitch_2
        -0x64ac0767 -> :sswitch_d
        -0x4c2abce1 -> :sswitch_0
        -0x4a8af41a -> :sswitch_b
        -0x4272c0a3 -> :sswitch_4
        -0x407bd005 -> :sswitch_a
        -0x39bbbd79 -> :sswitch_9
        -0x394f8cb1 -> :sswitch_d
        -0x1cb57acf -> :sswitch_c
        -0x1268519c -> :sswitch_3
        -0x116014e1 -> :sswitch_1
        0x94a9e3 -> :sswitch_e
        0x1019e31e -> :sswitch_c
        0x1c76665e -> :sswitch_2
        0x2fc7df3d -> :sswitch_5
        0x306d42dc -> :sswitch_b
        0x3b3db734 -> :sswitch_e
        0x3f4112f9 -> :sswitch_4
        0x4c1dfa62 -> :sswitch_8
        0x529e57f4 -> :sswitch_1
        0x5b53d800 -> :sswitch_7
        0x5b6c5b87 -> :sswitch_8
        0x6405dcd7 -> :sswitch_5
        0x717b4338 -> :sswitch_9
        0x7923932a -> :sswitch_6
        0x79954121 -> :sswitch_a
    .end sparse-switch
.end method

.method public final setAlpha(I)V
    .locals 0

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method

.method public setProgress(F)V
    .locals 0
    .annotation build Ll/ᩳ᩸;
    .end annotation

    .line 68
    iput p1, p0, Ll/ۢ֡֫;->᩸:F

    .line 69
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

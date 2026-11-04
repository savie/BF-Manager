.class public final Ll/ܺۢ᩻;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ֨ᩳܶ:[S


# instance fields
.field public ֡:Z

.field public ܰ:Landroid/animation/ObjectAnimator;

.field public ܿ:Ljava/util/Random;

.field public ᩶:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܺۢ᩻;->֨ᩳܶ:[S

    return-void

    :array_0
    .array-data 2
        0xfefs
        -0x63fbs
        -0x63ffs
        -0x63e4s
        -0x63f9s
        -0x63ees
        -0x63f9s
        -0x63e6s
        -0x63e4s
        -0x63e3s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x24a1c965

    sget v2, Ll/᩺;->۫۬۫:I

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    .line 677
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06da\u1a75"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4717

    const v6, -0x3197bd47

    xor-int/2addr v5, v6

    const v6, -0x19586b52

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x587b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 511
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_2

    goto/16 :goto_2

    .line 239
    :sswitch_0
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_8

    goto/16 :goto_4

    .line 394
    :sswitch_1
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-gez v4, :cond_b

    goto :goto_1

    .line 513
    :sswitch_2
    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-gez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v4, "\u1a75\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2a43

    const v6, -0x1cfbdeec

    xor-int/2addr v5, v6

    const v6, -0x1ddd6c38

    goto :goto_0

    .line 179
    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 679
    :sswitch_5
    iput-object v0, p0, Ll/ܺۢ᩻;->ܿ:Ljava/util/Random;

    return-void

    :sswitch_6
    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u1a73\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2c3f

    const v6, -0xa1eabc3

    xor-int/2addr v5, v6

    const v6, 0x17c4a8cd

    goto :goto_0

    :cond_2
    const-string v4, "\u06dc\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7787

    const v6, -0x79afb4c4

    xor-int/2addr v5, v6

    const v6, -0x83f0f98

    goto/16 :goto_0

    .line 83
    :sswitch_7
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u073a\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x49a7

    const v6, -0x2c4ba8e5

    xor-int/2addr v5, v6

    const v6, 0x3fdb78d4

    goto/16 :goto_0

    .line 101
    :sswitch_8
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u06e2\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x2d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x31f

    const v6, -0x61ec069f

    xor-int/2addr v5, v6

    const v6, 0x13469ad0

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u0736\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x76d3

    const v6, 0x31f8fb7c

    xor-int/2addr v5, v6

    const v6, -0x61fd444c

    goto/16 :goto_0

    .line 114
    :sswitch_a
    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v4, "\u0736\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4f79

    const v6, -0x664792a4

    xor-int/2addr v5, v6

    const v6, -0x1504fce

    goto/16 :goto_0

    .line 550
    :sswitch_b
    sget v4, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v4, :cond_7

    :goto_2
    const-string v4, "\u1a78\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1fb9

    const v6, 0x71ddcbc2

    xor-int/2addr v5, v6

    const v6, 0x4a53261c    # 3459463.0f

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06eb\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2331

    const v6, 0x1199e902

    xor-int/2addr v5, v6

    const v6, 0x24e59b58

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_9

    :cond_8
    const-string v4, "\u06e4\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x648b

    const v6, 0x11d6975c

    xor-int/2addr v5, v6

    const v6, -0xca609b2

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u05a1\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa75

    const v6, -0x3bf0151f

    xor-int/2addr v5, v6

    const v6, -0x51799854

    goto/16 :goto_0

    .line 671
    :sswitch_d
    sget v4, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v4, :cond_a

    :goto_3
    const-string v4, "\u06df\u1a77"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2e61

    const v6, 0x7f5006fa

    xor-int/2addr v5, v6

    const v6, -0x4b390ccc

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0736\u1a75"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x73cb

    const v6, 0x2fc956c1

    xor-int/2addr v5, v6

    const v6, -0x5f448f0b

    goto/16 :goto_0

    .line 679
    :sswitch_e
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 570
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06eb\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x162f

    const v6, 0x74b4302d

    xor-int/2addr v5, v6

    const v6, 0x767a5aa8

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073a\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3495

    const v6, -0x5040faae

    xor-int/2addr v5, v6

    const v6, 0x4c785d30    # 6.5107136E7f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x778591f6 -> :sswitch_6
        -0x76024217 -> :sswitch_b
        -0x71dab026 -> :sswitch_4
        -0x6fc1a5fb -> :sswitch_7
        -0x5f32229e -> :sswitch_6
        -0x5a73c18c -> :sswitch_0
        -0x52d8dc46 -> :sswitch_8
        -0x4fd4be70 -> :sswitch_1
        -0x4b07880a -> :sswitch_9
        -0x4a887315 -> :sswitch_7
        -0x47dcf358 -> :sswitch_9
        -0x3c5b3bc3 -> :sswitch_5
        -0x3b15d540 -> :sswitch_c
        -0x3774f550 -> :sswitch_a
        -0x327ec15a -> :sswitch_d
        -0x317b56e8 -> :sswitch_d
        -0x26bf6f26 -> :sswitch_5
        -0x23bbd61d -> :sswitch_e
        -0x201ac365 -> :sswitch_e
        0x1a417142 -> :sswitch_3
        0x3533261c -> :sswitch_4
        0x3804a964 -> :sswitch_2
        0x3fc63c22 -> :sswitch_3
        0x415a8cff -> :sswitch_b
        0x460775b6 -> :sswitch_a
        0x47f74a33 -> :sswitch_2
        0x4e68a6c4 -> :sswitch_0
        0x4f67aaa0 -> :sswitch_c
        0x71de7ed7 -> :sswitch_8
        0x7ff8d8f8 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const v30, 0x6379fbbe

    sget v31, Ll/ۘ֡;->᩹ܶ۬:I

    sget v32, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v33, "\u1a73\u06e8"

    invoke-static/range {v33 .. v33}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v33

    xor-int v33, v33, v32

    xor-int v2, v33, v31

    mul-int/lit16 v2, v2, 0x31e1

    const v35, -0x1ec607a3

    xor-int v2, v2, v35

    const v35, 0x39ced5e5

    xor-int v33, v33, v35

    move-object v9, v8

    move-object v15, v14

    move-object/from16 v4, v18

    move-object/from16 v7, v19

    move-object/from16 v21, v20

    move-object/from16 v37, v28

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    move-object/from16 v19, v3

    move-object v14, v13

    const/4 v3, 0x0

    const/4 v13, 0x0

    :goto_0
    xor-int v11, v30, v31

    mul-int/lit16 v11, v11, 0x4417

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v2, v11

    xor-int v30, v33, v2

    sparse-switch v30, :sswitch_data_0

    move v2, v12

    xor-int v11, v13, v5

    .line 694
    iput-boolean v11, v0, Ll/ܺۢ᩻;->֡:Z

    neg-int v11, v3

    .line 696
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRotation()F

    move-result v17

    int-to-float v11, v11

    .line 598
    sget-boolean v12, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v12, :cond_7

    move/from16 v29, v2

    move/from16 v33, v3

    move/from16 v18, v11

    goto :goto_1

    .line 19
    :sswitch_0
    sget-boolean v2, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    move v2, v12

    goto/16 :goto_5

    .line 694
    :sswitch_1
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    move/from16 v33, v3

    move/from16 v29, v12

    :goto_1
    move/from16 v11, v36

    move-object/from16 v12, v37

    goto/16 :goto_16

    :cond_2
    :goto_2
    const-string v2, "\u06d8\u06e4"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    xor-int v11, v2, v32

    mul-int/lit16 v11, v11, -0x2ad1

    const v29, -0x70ec6602

    xor-int v11, v11, v29

    const v29, -0x72edbd1b

    goto/16 :goto_a

    .line 408
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v2

    if-ltz v2, :cond_4

    :cond_3
    move/from16 v33, v3

    move/from16 v29, v12

    move-object/from16 v2, v16

    move/from16 v11, v36

    move-object/from16 v12, v37

    goto/16 :goto_17

    :cond_4
    const-string v2, "\u06d7\u06e8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v32

    xor-int v11, v2, v31

    mul-int/lit16 v11, v11, 0x705f

    const v29, -0x584a8419

    xor-int v11, v11, v29

    const v29, 0x3f7c8380

    goto/16 :goto_a

    :sswitch_3
    sget-boolean v2, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v2, :cond_1

    :goto_3
    move/from16 v29, v12

    :goto_4
    move/from16 v11, v36

    goto/16 :goto_d

    .line 499
    :sswitch_4
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_3

    .line 308
    :sswitch_5
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    goto :goto_3

    .line 669
    :sswitch_6
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    return-void

    .line 706
    :sswitch_7
    iget-object v1, v0, Ll/ܺۢ᩻;->ܰ:Landroid/animation/ObjectAnimator;

    invoke-static {v1}, Ll/֨ۨ;->ܺ᩵۠(Ljava/lang/Object;)V

    invoke-static {v1}, Ll/֡ۢ;->֫ܳۚ(Ljava/lang/Object;)V

    return-void

    :sswitch_8
    neg-int v2, v12

    move v3, v2

    goto/16 :goto_9

    .line 698
    :sswitch_9
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v7, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 699
    iput-boolean v6, v0, Ll/ܺۢ᩻;->᩶:Z

    move/from16 v29, v12

    goto/16 :goto_7

    :sswitch_a
    move v2, v12

    const-wide/16 v11, 0x1f4

    .line 697
    invoke-virtual {v4, v11, v12}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 696
    iput-object v7, v0, Ll/ܺۢ᩻;->ܰ:Landroid/animation/ObjectAnimator;

    .line 698
    invoke-static {v7}, Ll/ۗ᩶;->ܳۛۘ(Ljava/lang/Object;)V

    .line 509
    sget v11, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v11, :cond_5

    :goto_5
    const-string v11, "\u1a75\u06da"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v32

    xor-int v12, v11, v31

    mul-int/lit16 v12, v12, -0x69d3

    const v29, -0x21b9ca9a

    xor-int v12, v12, v29

    const v29, -0x467be1e5

    goto :goto_6

    :cond_5
    const-string v11, "\u1a75\u1a7b"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v31

    mul-int/lit8 v11, v11, 0x3

    xor-int v12, v11, v32

    mul-int/lit16 v12, v12, -0x78a1

    const v29, 0x5b13a430

    xor-int v12, v12, v29

    const v29, 0x4895a126

    goto :goto_6

    :sswitch_b
    move v2, v12

    .line 696
    new-array v4, v8, [F

    aput v17, v4, v6

    aput v18, v4, v5

    invoke-static {v1, v9, v4}, Ll/֫ۢ;->ۡۜᩳ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 244
    sget v11, Ll/ۖ;->ܿۚ֡:I

    if-ltz v11, :cond_6

    move/from16 v29, v2

    goto/16 :goto_8

    :cond_6
    const-string v11, "\u05ab\u06e0"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v32, v11

    mul-int/lit8 v11, v11, -0x23

    xor-int v12, v11, v31

    mul-int/lit16 v12, v12, 0xed1

    const v29, 0x690bbd4b

    xor-int v12, v12, v29

    const v29, 0x6243f9e7

    :goto_6
    xor-int v33, v11, v29

    move/from16 v39, v12

    move v12, v2

    move/from16 v2, v39

    goto/16 :goto_0

    :cond_7
    const-string v12, "\u06e0\u1a73"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v31

    move/from16 v29, v2

    xor-int v2, v12, v32

    mul-int/lit16 v2, v2, -0x6023

    const v18, 0x588724e9

    xor-int v2, v2, v18

    const v18, -0x15a8dad

    xor-int v33, v12, v18

    move/from16 v18, v11

    goto/16 :goto_f

    :sswitch_c
    move/from16 v29, v12

    .line 701
    iput-object v15, v0, Ll/ܺۢ᩻;->ܰ:Landroid/animation/ObjectAnimator;

    .line 703
    invoke-static {v15}, Ll/֨ۨ;->ܺ᩵۠(Ljava/lang/Object;)V

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v15, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 704
    iput-boolean v5, v0, Ll/ܺۢ᩻;->᩶:Z

    :goto_7
    const-string v2, "\u1a7a\u1a78"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v32, v2

    mul-int/lit8 v2, v2, -0x23

    xor-int v11, v2, v31

    mul-int/lit16 v11, v11, -0x4b75

    const v12, 0x6ca1770d

    xor-int/2addr v11, v12

    const v12, 0x5cf11d8c

    goto/16 :goto_b

    :sswitch_d
    move/from16 v29, v12

    .line 702
    invoke-static {v1, v9, v14}, Ll/ۘ۟;->ۚۜ۬(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    const-wide/16 v11, 0x320

    invoke-virtual {v2, v11, v12}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v15

    .line 637
    sget v2, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v2, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v2, "\u073a\u06e0"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v31, v2

    mul-int/lit8 v2, v2, 0x17

    xor-int v11, v2, v32

    mul-int/lit16 v11, v11, -0x3229

    const v12, 0x429ea2b9

    xor-int/2addr v11, v12

    const v12, 0x38c8091c

    goto/16 :goto_b

    :sswitch_e
    move/from16 v29, v12

    .line 702
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRotation()F

    move-result v2

    new-array v14, v8, [F

    aput v2, v14, v6

    aput v10, v14, v5

    .line 23
    sget v2, Ll/֫֡;->֫ۙۖ:I

    if-gtz v2, :cond_9

    :goto_8
    const-string v2, "\u073f\u06e0"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v31

    mul-int/lit8 v2, v2, 0x53

    xor-int v11, v2, v32

    mul-int/lit16 v11, v11, -0x4873

    const v12, 0x28fdf02

    xor-int/2addr v11, v12

    const v12, 0x1783025f

    goto/16 :goto_b

    :cond_9
    const-string v2, "\u06d6\u06dc"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v32

    mul-int/lit8 v2, v2, -0x9

    xor-int v11, v2, v31

    mul-int/lit16 v11, v11, -0x4413

    const v12, -0x4b92f541

    xor-int/2addr v11, v12

    const v12, -0x2461d35b

    goto/16 :goto_b

    .line 690
    :sswitch_f
    iget-object v2, v0, Ll/ܺۢ᩻;->ܿ:Ljava/util/Random;

    const/16 v11, 0x154

    invoke-virtual {v2, v11}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    add-int/lit16 v12, v2, 0x172

    .line 691
    iget-boolean v13, v0, Ll/ܺۢ᩻;->֡:Z

    if-eqz v13, :cond_a

    const-string v2, "\u0733\u1a77"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    xor-int v11, v2, v32

    mul-int/lit16 v11, v11, 0x3a9f

    const v29, -0x50f31576

    xor-int v11, v11, v29

    const v29, -0x1298b060

    goto :goto_a

    :cond_a
    move v3, v12

    :goto_9
    const-string v2, "\u06da\u1a78"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v32

    xor-int v11, v2, v31

    mul-int/lit16 v11, v11, 0x2d8d

    const v29, -0xa6335

    xor-int v11, v11, v29

    const v29, -0x42a00927

    :goto_a
    xor-int v33, v2, v29

    move v2, v11

    goto/16 :goto_0

    :sswitch_10
    move/from16 v29, v12

    const/4 v2, 0x1

    move/from16 v33, v3

    move/from16 v11, v36

    move-object/from16 v12, v37

    const/16 v28, 0x1

    goto/16 :goto_10

    :sswitch_11
    move/from16 v29, v12

    if-eqz v28, :cond_b

    move-object v2, v9

    move/from16 v11, v36

    move-object/from16 v12, v37

    move/from16 v9, v38

    goto :goto_c

    :cond_b
    const-string v2, "\u1a76\u06e8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v31, v2

    mul-int/lit8 v2, v2, -0x45

    xor-int v11, v2, v32

    mul-int/lit16 v11, v11, -0x595b

    const v12, -0x194fde93

    xor-int/2addr v11, v12

    const v12, -0x2afa2fcd

    goto :goto_b

    :sswitch_12
    move/from16 v29, v12

    .line 686
    iget-object v2, v0, Ll/ܺۢ᩻;->ܰ:Landroid/animation/ObjectAnimator;

    invoke-static {v2}, Ll/ۗ᩶;->ܳۛۘ(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/animation/Animator;->cancel()V

    .line 687
    iget-boolean v2, v0, Ll/ܺۢ᩻;->᩶:Z

    if-eqz v2, :cond_c

    const-string v2, "\u06e8\u06e7"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    xor-int v11, v2, v32

    mul-int/lit16 v11, v11, -0x4d95

    const v12, 0x3e926fca

    xor-int/2addr v11, v12

    const v12, 0x6387dec

    :goto_b
    xor-int v33, v2, v12

    move v2, v11

    goto/16 :goto_f

    :cond_c
    move/from16 v33, v3

    move-object/from16 v2, v16

    move/from16 v11, v36

    move-object/from16 v12, v37

    goto/16 :goto_12

    :sswitch_13
    move/from16 v29, v12

    const/16 v2, 0x8

    move/from16 v11, v36

    move-object/from16 v12, v37

    move/from16 v9, v38

    .line 689
    invoke-static {v12, v9, v2, v11}, Ll/֫۠;->۟ܿۖ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v10, 0x0

    cmpg-float v33, v20, v10

    if-nez v33, :cond_d

    :goto_c
    const-string v33, "\u073f\u073d"

    invoke-static/range {v33 .. v33}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v33

    xor-int v33, v33, v32

    move-object/from16 v34, v2

    xor-int v2, v33, v31

    mul-int/lit16 v2, v2, -0x478d

    const v35, -0x6858b6d

    xor-int v2, v2, v35

    const v35, 0x74244990

    xor-int v33, v33, v35

    move/from16 v38, v9

    move/from16 v36, v11

    move-object/from16 v37, v12

    move/from16 v12, v29

    move-object/from16 v9, v34

    goto/16 :goto_0

    :cond_d
    const-string v33, "\u06e1\u06e0"

    invoke-static/range {v33 .. v33}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v33

    xor-int v33, v33, v32

    xor-int v10, v33, v31

    mul-int/lit16 v10, v10, -0x4b7d

    const v35, -0x2554c523

    xor-int v10, v10, v35

    const v35, -0x1e095cfa

    xor-int v33, v33, v35

    move/from16 v38, v9

    move/from16 v36, v11

    move-object/from16 v37, v12

    move/from16 v12, v29

    move-object v9, v2

    move v2, v10

    const/4 v10, 0x0

    goto/16 :goto_0

    :sswitch_14
    move/from16 v29, v12

    move/from16 v11, v36

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRotation()F

    move-result v20

    const/4 v8, 0x2

    sget-object v37, Ll/ܺۢ᩻;->֨ᩳܶ:[S

    const/16 v38, 0x2

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v2

    if-eqz v2, :cond_e

    :goto_d
    const-string v2, "\u06db\u1a79"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    xor-int v12, v2, v32

    mul-int/lit16 v12, v12, -0x159b

    const v33, -0x4f9580c6

    xor-int v12, v12, v33

    const v33, -0x11f79c9a

    goto :goto_e

    :cond_e
    const-string v2, "\u073a\u06ec"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v31

    mul-int/lit8 v2, v2, -0x4b

    xor-int v12, v2, v32

    mul-int/lit16 v12, v12, 0x19a1

    const v33, -0x307894ed

    xor-int v12, v12, v33

    const v33, 0x5d3c2775

    :goto_e
    xor-int v33, v2, v33

    move/from16 v36, v11

    move v2, v12

    :goto_f
    move/from16 v12, v29

    goto/16 :goto_0

    :sswitch_15
    move/from16 v29, v12

    move/from16 v11, v36

    move-object/from16 v12, v37

    .line 685
    invoke-virtual/range {v19 .. v19}, Landroid/animation/Animator;->isRunning()Z

    move-result v2

    if-eqz v2, :cond_f

    const-string v2, "\u05ab\u06d7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v32

    mul-int/lit8 v2, v2, -0x4d

    move/from16 v33, v3

    xor-int v3, v2, v31

    mul-int/lit16 v3, v3, 0x5259

    const v34, 0x6aed8ef9

    xor-int v3, v3, v34

    const v34, 0x2921f7ba

    goto :goto_11

    :cond_f
    move/from16 v33, v3

    move-object/from16 v2, v16

    goto/16 :goto_12

    :sswitch_16
    move/from16 v33, v3

    move/from16 v29, v12

    move/from16 v11, v36

    move-object/from16 v12, v37

    const/4 v2, 0x0

    const/16 v28, 0x0

    :goto_10
    const-string v2, "\u05a8\u06e2"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    xor-int v3, v2, v32

    mul-int/lit16 v3, v3, 0x604f

    const v34, 0x57a415be

    xor-int v3, v3, v34

    const v34, 0x106fbdb4

    :goto_11
    xor-int v2, v2, v34

    move/from16 v36, v11

    move-object/from16 v37, v12

    move/from16 v12, v29

    move/from16 v39, v33

    move/from16 v33, v2

    move v2, v3

    goto/16 :goto_13

    :sswitch_17
    move/from16 v33, v3

    move/from16 v29, v12

    move-object/from16 v2, v16

    move/from16 v11, v36

    move-object/from16 v12, v37

    .line 6
    invoke-static {v1, v2}, Ll/ۗ᩺;->֫᩶֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 685
    iget-object v3, v0, Ll/ܺۢ᩻;->ܰ:Landroid/animation/ObjectAnimator;

    const/4 v6, 0x0

    if-eqz v3, :cond_10

    const-string v16, "\u06e2\u073a"

    invoke-static/range {v16 .. v16}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v32

    xor-int v5, v16, v31

    mul-int/lit16 v5, v5, -0x7ce1

    const v34, 0x51100419

    xor-int v5, v5, v34

    const v34, 0x6138c7ee

    xor-int v16, v16, v34

    move-object/from16 v19, v3

    move/from16 v36, v11

    move-object/from16 v37, v12

    move/from16 v12, v29

    move/from16 v3, v33

    move/from16 v33, v16

    move-object/from16 v16, v2

    move v2, v5

    const/4 v5, 0x1

    goto/16 :goto_0

    :cond_10
    move-object/from16 v19, v3

    const/4 v5, 0x1

    :goto_12
    const-string v3, "\u1a74\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v32

    mul-int/lit8 v3, v3, -0x37

    xor-int v0, v3, v31

    mul-int/lit16 v0, v0, -0x5da5

    const v16, -0x91ac62f

    xor-int v0, v0, v16

    const v16, 0x72e28217

    xor-int v3, v3, v16

    move-object/from16 v16, v2

    move/from16 v36, v11

    move-object/from16 v37, v12

    move/from16 v12, v29

    move v2, v0

    move-object/from16 v0, p0

    move/from16 v39, v33

    move/from16 v33, v3

    :goto_13
    move/from16 v3, v39

    goto/16 :goto_0

    :sswitch_18
    move/from16 v33, v3

    move/from16 v29, v12

    move/from16 v11, v36

    move-object/from16 v12, v37

    .line 0
    sget-object v0, Ll/ܺۢ᩻;->֨ᩳܶ:[S

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v11}, Ll/ۖܰ;->۬ۛܳ([SIII)Ljava/lang/String;

    move-result-object v16

    .line 480
    sget v0, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v0, :cond_11

    goto/16 :goto_16

    :cond_11
    const-string v0, "\u05ab\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    xor-int v2, v0, v32

    mul-int/lit16 v2, v2, 0x42d7

    const v3, -0x6692d33d

    xor-int/2addr v2, v3

    const v3, -0x2eca96e4

    :goto_14
    xor-int/2addr v0, v3

    goto/16 :goto_19

    :sswitch_19
    move/from16 v33, v3

    move/from16 v29, v12

    move-object/from16 v2, v16

    move-object/from16 v12, v37

    const/16 v0, 0x393a

    const/16 v36, 0x393a

    goto :goto_15

    :sswitch_1a
    move/from16 v33, v3

    move/from16 v29, v12

    move-object/from16 v2, v16

    move-object/from16 v12, v37

    const v0, 0x9c73

    const v36, 0x9c73

    :goto_15
    const-string v0, "\u06ec\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    xor-int v3, v0, v32

    mul-int/lit16 v3, v3, -0x7bc5

    const v11, 0x24c0c272

    xor-int/2addr v3, v11

    const v11, -0x6c88b7d4

    xor-int/2addr v0, v11

    move-object/from16 v16, v2

    move v2, v3

    goto/16 :goto_1a

    :sswitch_1b
    move/from16 v33, v3

    move/from16 v29, v12

    move-object/from16 v2, v16

    move/from16 v11, v36

    move-object/from16 v12, v37

    add-int v0, v23, v27

    mul-int v0, v0, v0

    sub-int v0, v0, v26

    if-gtz v0, :cond_12

    const-string v0, "\u1a7b\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    xor-int v3, v0, v32

    mul-int/lit16 v3, v3, -0x15ef

    const v16, -0x14c1f0cd

    xor-int v3, v3, v16

    const v16, -0x50d726e7

    goto/16 :goto_18

    :cond_12
    const-string v0, "\u06d8\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v32

    mul-int/lit8 v0, v0, 0xd

    xor-int v3, v0, v31

    mul-int/lit16 v3, v3, 0x13e5

    const v16, 0x2511bf7c

    xor-int v3, v3, v16

    const v16, 0x7608da0

    goto/16 :goto_18

    :sswitch_1c
    move/from16 v33, v3

    move/from16 v29, v12

    move-object/from16 v2, v16

    move/from16 v11, v36

    move-object/from16 v12, v37

    add-int v0, v24, v25

    add-int v26, v0, v0

    const/16 v27, 0x2acf

    sget v0, Ll/ۖ;->ܿۚ֡:I

    if-ltz v0, :cond_13

    move-object/from16 v16, v2

    :goto_16
    const-string v0, "\u06e0\u06e8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    xor-int v2, v0, v32

    mul-int/lit16 v2, v2, -0x5dcf

    const v3, -0x6ffe8fe3

    xor-int/2addr v2, v3

    const v3, -0x5ea00323    # -7.589E-19f

    goto/16 :goto_14

    :cond_13
    const-string v0, "\u06e8\u06d8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    mul-int/lit8 v0, v0, -0x5f

    xor-int v3, v0, v31

    mul-int/lit16 v3, v3, -0x3ee7

    const v16, 0x36e43c91

    xor-int v3, v3, v16

    const v16, 0x4f2152a0

    goto :goto_18

    :sswitch_1d
    move/from16 v33, v3

    move/from16 v29, v12

    move-object/from16 v2, v16

    move/from16 v11, v36

    move-object/from16 v12, v37

    aget-short v23, v21, v22

    mul-int v24, v23, v23

    const v25, 0x7289361

    .line 344
    sget v0, Ll/ۖ;->ܿۚ֡:I

    if-ltz v0, :cond_14

    goto :goto_17

    :cond_14
    const-string v0, "\u06d7\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    xor-int v3, v0, v32

    mul-int/lit16 v3, v3, 0x6bb7

    const v16, 0x2f878810

    xor-int v3, v3, v16

    const v16, 0x60e0ce1d

    goto :goto_18

    :sswitch_1e
    move/from16 v33, v3

    move/from16 v29, v12

    move-object/from16 v2, v16

    move/from16 v11, v36

    move-object/from16 v12, v37

    sget-object v21, Ll/ܺۢ᩻;->֨ᩳܶ:[S

    const/16 v22, 0x0

    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_15

    :goto_17
    const-string v0, "\u06d6\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v32

    mul-int/lit8 v0, v0, -0xd

    xor-int v3, v0, v31

    mul-int/lit16 v3, v3, 0x4985

    const v16, -0x31c0b61b

    xor-int v3, v3, v16

    const v16, -0xdbc399e

    goto :goto_18

    :cond_15
    const-string v0, "\u06e7\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v3, v0, v31

    mul-int/lit16 v3, v3, -0x6737

    const v16, -0x1a8ec685

    xor-int v3, v3, v16

    const v16, -0x624f71bd

    :goto_18
    xor-int v0, v0, v16

    move-object/from16 v16, v2

    move v2, v3

    :goto_19
    move/from16 v36, v11

    :goto_1a
    move-object/from16 v37, v12

    move/from16 v12, v29

    move/from16 v3, v33

    move/from16 v33, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bacb3d4 -> :sswitch_c
        -0x794c4415 -> :sswitch_1a
        -0x7738861d -> :sswitch_4
        -0x74db130e -> :sswitch_15
        -0x72d9ecc3 -> :sswitch_13
        -0x71ec153d -> :sswitch_2
        -0x67aaafeb -> :sswitch_0
        -0x639f194c -> :sswitch_a
        -0x63147aab -> :sswitch_5
        -0x61c7a636 -> :sswitch_f
        -0x5d731c1e -> :sswitch_7
        -0x5b753f21 -> :sswitch_2
        -0x57295a76 -> :sswitch_a
        -0x4f5a2902 -> :sswitch_14
        -0x4ee74846 -> :sswitch_e
        -0x4da38198 -> :sswitch_6
        -0x48f59329 -> :sswitch_1
        -0x45101fec -> :sswitch_18
        -0x435e78de -> :sswitch_12
        -0x3e323d22 -> :sswitch_16
        -0x3dd1d7d9 -> :sswitch_7
        -0x3b0010ce -> :sswitch_8
        -0x386f2b52 -> :sswitch_6
        -0x2e6f40f4 -> :sswitch_d
        -0x2d005f9c -> :sswitch_4
        -0x2c2ee74c -> :sswitch_1e
        -0x2a9f510b -> :sswitch_3
        -0x28c23b0a -> :sswitch_b
        -0x24804603 -> :sswitch_15
        -0x1b1cc2ec -> :sswitch_19
        -0x11c76ac3 -> :sswitch_5
        -0xc2e5e31 -> :sswitch_3
        -0xb5d9f56 -> :sswitch_16
        -0x8c1788e -> :sswitch_9
        -0x873cf5b -> :sswitch_12
        -0x77b4923 -> :sswitch_f
        -0x752794d -> :sswitch_17
        -0x863a92 -> :sswitch_1e
        0x11e1712 -> :sswitch_8
        0xbea889d -> :sswitch_11
        0x1cbe0522 -> :sswitch_19
        0x1e9c440b -> :sswitch_d
        0x1fcb38df -> :sswitch_e
        0x1ff0db37 -> :sswitch_1b
        0x23c45862 -> :sswitch_b
        0x23ebc86d -> :sswitch_17
        0x2658629e -> :sswitch_1d
        0x2fa0f825 -> :sswitch_10
        0x344756b2 -> :sswitch_9
        0x38a57c0e -> :sswitch_1a
        0x39f752b8 -> :sswitch_14
        0x497879a9 -> :sswitch_1c
        0x4cbac7c0 -> :sswitch_10
        0x50aa8d54 -> :sswitch_1b
        0x539bd29a -> :sswitch_1
        0x6590d7b9 -> :sswitch_c
        0x65c17762 -> :sswitch_13
        0x6b2cf90a -> :sswitch_0
        0x6bfae0c7 -> :sswitch_11
        0x6ca203e9 -> :sswitch_1c
        0x6f0c2232 -> :sswitch_18
        0x77aca517 -> :sswitch_1d
    .end sparse-switch
.end method

.class public final Ll/ۡᩳ᩺;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ۤ֡ۢ:[S


# instance fields
.field public ֡:Ljava/util/Random;

.field public ܺ:Landroid/animation/ObjectAnimator;

.field public ܽ:Z

.field public ᩶:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۡᩳ᩺;->ۤ֡ۢ:[S

    return-void

    :array_0
    .array-data 2
        0x3c1s
        -0x607es
        -0x607as
        -0x6065s
        -0x6080s
        -0x606bs
        -0x6080s
        -0x6063s
        -0x6065s
        -0x6066s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x1bcd8791

    sget v2, Ll/ۗ;->֨۬ۖ:I

    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    .line 667
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u05ab\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x221b

    const v6, 0x3029affa

    xor-int/2addr v5, v6

    const v6, -0xa1746fd

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x720b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_5

    goto/16 :goto_1

    .line 358
    :sswitch_0
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v4

    if-ltz v4, :cond_b

    goto/16 :goto_3

    .line 123
    :sswitch_1
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-nez v4, :cond_4

    goto/16 :goto_2

    .line 15
    :sswitch_2
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v4

    if-lez v4, :cond_8

    goto/16 :goto_2

    .line 530
    :sswitch_3
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    goto/16 :goto_2

    .line 24
    :sswitch_4
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 669
    :sswitch_5
    iput-object v0, p0, Ll/ۡᩳ᩺;->֡:Ljava/util/Random;

    return-void

    .line 576
    :sswitch_6
    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v4, :cond_0

    const-string v4, "\u073d\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6df5

    const v6, -0x3702698e

    xor-int/2addr v5, v6

    const v6, 0x35db56f3

    goto :goto_0

    :cond_0
    const-string v4, "\u1a77\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5725

    const v6, 0x7b92b736

    xor-int/2addr v5, v6

    const v6, 0x110efd3e

    goto :goto_0

    :sswitch_7
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u1a77\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x172d

    const v6, 0x629cdf64

    xor-int/2addr v5, v6

    const v6, 0x11423b1c

    goto :goto_0

    .line 467
    :sswitch_8
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06ec\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1d2f

    const v6, -0x7f9c458f

    xor-int/2addr v5, v6

    const v6, 0x45670ec7

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06dc\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5843

    const v6, -0x4e649c74

    xor-int/2addr v5, v6

    const v6, -0x5eea408c

    goto/16 :goto_0

    :cond_4
    :goto_1
    const-string v4, "\u06e2\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1df

    const v6, -0x34ca67d8    # -1.1900968E7f

    xor-int/2addr v5, v6

    const v6, -0x4d45291c

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u1a73\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x259f

    const v6, 0x370f5fff

    xor-int/2addr v5, v6

    const v6, -0x7fff7ccd

    goto/16 :goto_0

    .line 620
    :sswitch_a
    sget-boolean v4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u1a79\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1e4d

    const v6, 0x34c3a8b2

    xor-int/2addr v5, v6

    const v6, 0x46b137c5

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v4

    if-gtz v4, :cond_7

    :goto_2
    const-string v4, "\u06e7\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x77fd

    const v6, 0x57627ac5

    xor-int/2addr v5, v6

    const v6, 0x4fccf201

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a75\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4d13

    const v6, -0x6998a654

    xor-int/2addr v5, v6

    const v6, -0x72c1c755

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u06ec\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3141

    const v6, 0x188a678b

    xor-int/2addr v5, v6

    const v6, -0x111569d6

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a7b\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4283

    const v6, -0xb6e1166

    xor-int/2addr v5, v6

    const v6, -0x3828391d

    goto/16 :goto_0

    .line 650
    :sswitch_d
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u06d6\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x435f

    const v6, 0x5e23e77c

    xor-int/2addr v5, v6

    const v6, -0x20960892

    goto/16 :goto_0

    .line 669
    :sswitch_e
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 653
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u0730\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xfff

    const v6, 0x5d7fcc2b

    xor-int/2addr v5, v6

    const v6, 0x26faeba0

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a8\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3bcd

    const v6, -0x2c377b8b

    xor-int/2addr v5, v6

    const v6, 0xb776385

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78d45d8c -> :sswitch_0
        -0x668e320e -> :sswitch_3
        -0x5c4eed40 -> :sswitch_6
        -0x5423d017 -> :sswitch_5
        -0x4fb084c8 -> :sswitch_b
        -0x3b60f3fa -> :sswitch_d
        -0x2c2a22fa -> :sswitch_5
        -0x29711d5b -> :sswitch_8
        -0x25e10b91 -> :sswitch_6
        -0x1eccd783 -> :sswitch_7
        -0x86812c0 -> :sswitch_7
        -0x867c01f -> :sswitch_9
        -0x2c3ef1e -> :sswitch_4
        0x4a18f9 -> :sswitch_2
        0x2910507 -> :sswitch_1
        0x9a449b9 -> :sswitch_c
        0x16b7c380 -> :sswitch_8
        0x1fb3f002 -> :sswitch_0
        0x28bd182d -> :sswitch_3
        0x3fcd1122 -> :sswitch_a
        0x42175512 -> :sswitch_d
        0x4518b227 -> :sswitch_b
        0x47181d04 -> :sswitch_e
        0x516194ed -> :sswitch_1
        0x52ab049f -> :sswitch_4
        0x573b9e07 -> :sswitch_2
        0x74454b5a -> :sswitch_c
        0x75da97d4 -> :sswitch_a
        0x7be39dba -> :sswitch_e
        0x7da0827c -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 37

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

    const v28, -0x2701c078

    sget v29, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v30, Ll/ۗ;->֨۬ۖ:I

    const-string v31, "\u05a1\u1a7a"

    invoke-static/range {v31 .. v31}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v31

    xor-int v31, v31, v29

    xor-int v2, v31, v30

    mul-int/lit16 v2, v2, 0x14b

    const v33, -0x7ac41fb

    xor-int v2, v2, v33

    const v33, -0x3549472d    # -5987433.5f

    xor-int v31, v31, v33

    move-object/from16 v17, v3

    move-object v9, v8

    move-object v3, v15

    move-object/from16 v7, v19

    move-object/from16 v11, v20

    move-object/from16 v22, v21

    move-object/from16 v35, v26

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    :goto_0
    xor-int v12, v28, v30

    mul-int/lit16 v12, v12, -0x25c1

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v2, v12

    xor-int v28, v31, v2

    sparse-switch v28, :sswitch_data_0

    .line 62
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    sget v2, Ll/֨᩹;->᩻ᩳ֨:I

    if-lez v2, :cond_6

    :goto_1
    move-object/from16 v27, v3

    move v12, v4

    move/from16 v4, v34

    goto/16 :goto_10

    .line 30
    :sswitch_0
    sget v2, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v2, :cond_1

    :cond_0
    :goto_2
    move-object/from16 v27, v3

    move v12, v4

    move-object/from16 v2, v16

    move/from16 v4, v34

    goto/16 :goto_18

    :cond_1
    const-string v2, "\u1a7b\u1a79"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v29

    mul-int/lit8 v2, v2, 0x15

    xor-int v12, v2, v30

    mul-int/lit16 v12, v12, -0x1ea3

    const v27, 0x7697f42a

    xor-int v12, v12, v27

    const v27, 0x641123bc

    goto/16 :goto_8

    .line 125
    :sswitch_1
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v2

    if-ltz v2, :cond_2

    goto :goto_2

    :cond_2
    move v12, v4

    goto/16 :goto_9

    .line 44
    :sswitch_2
    sget v2, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v2, :cond_3

    goto/16 :goto_4

    :cond_3
    move v12, v4

    :goto_3
    move-object/from16 v2, v16

    move/from16 v4, v34

    goto/16 :goto_17

    :sswitch_3
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    sget v2, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v2, :cond_0

    goto :goto_1

    .line 374
    :sswitch_4
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    goto :goto_1

    :sswitch_5
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    return-void

    .line 696
    :sswitch_6
    iget-object v1, v0, Ll/ۡᩳ᩺;->ܺ:Landroid/animation/ObjectAnimator;

    invoke-static {v1}, Ll/֡᩶;->ܳۛ᩺(Ljava/lang/Object;)V

    invoke-static {v1}, Ll/ۖۧ;->ۤ᩷ܳ(Ljava/lang/Object;)V

    return-void

    :sswitch_7
    neg-int v2, v13

    move v4, v2

    goto/16 :goto_7

    .line 688
    :sswitch_8
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v11, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 689
    iput-boolean v6, v0, Ll/ۡᩳ᩺;->᩶:Z

    goto/16 :goto_5

    :sswitch_9
    const-wide/16 v11, 0x1f4

    .line 687
    invoke-static {v7, v11, v12}, Ll/ۗ;->۫֫ۨ(Ljava/lang/Object;J)Landroid/animation/ObjectAnimator;

    move-result-object v11

    .line 686
    iput-object v11, v0, Ll/ۡᩳ᩺;->ܺ:Landroid/animation/ObjectAnimator;

    .line 688
    invoke-static {v11}, Ll/֡᩶;->ܳۛ᩺(Ljava/lang/Object;)V

    .line 372
    sget v2, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v2, :cond_4

    goto :goto_2

    :cond_4
    const-string v2, "\u1a77\u0730"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v29

    xor-int v12, v2, v30

    mul-int/lit16 v12, v12, 0x927

    const v27, 0x7b37b533

    xor-int v12, v12, v27

    const v27, -0xef8180a

    goto/16 :goto_8

    .line 686
    :sswitch_a
    new-array v2, v8, [F

    aput v18, v2, v6

    aput v19, v2, v5

    invoke-static {v1, v9, v2}, Ll/ۧ;->۟ܿܽ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 541
    sget v2, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v2, :cond_5

    const-string v2, "\u06ec\u073f"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v29

    xor-int v12, v2, v30

    mul-int/lit16 v12, v12, -0x1091

    const v27, -0x263d5f57

    xor-int v12, v12, v27

    const v27, -0x25e1f917

    goto/16 :goto_8

    :cond_5
    const-string v2, "\u1a7a\u05ab"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v30

    xor-int v12, v2, v29

    mul-int/lit16 v12, v12, -0x7c71

    const v27, -0x419c4537

    xor-int v12, v12, v27

    const v27, -0x2fc8095c

    goto/16 :goto_8

    :sswitch_b
    xor-int v2, v14, v5

    .line 684
    iput-boolean v2, v0, Ll/ۡᩳ᩺;->ܽ:Z

    neg-int v2, v4

    .line 686
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRotation()F

    move-result v18

    int-to-float v2, v2

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v12

    if-eqz v12, :cond_7

    move/from16 v19, v2

    :cond_6
    :goto_4
    const-string v2, "\u0730\u073d"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v29

    mul-int/lit8 v2, v2, -0x27

    xor-int v12, v2, v30

    mul-int/lit16 v12, v12, 0x66b3

    const v27, 0x49e1d27a

    xor-int v12, v12, v27

    const v27, -0x7596e68b

    goto/16 :goto_8

    :cond_7
    const-string v12, "\u0733\u1a75"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v30

    move/from16 v19, v2

    xor-int v2, v12, v29

    mul-int/lit16 v2, v2, 0x4907

    const v27, 0x43fff602

    xor-int v2, v2, v27

    const v27, 0x19f99928

    xor-int v31, v12, v27

    goto/16 :goto_0

    .line 691
    :sswitch_c
    iput-object v3, v0, Ll/ۡᩳ᩺;->ܺ:Landroid/animation/ObjectAnimator;

    .line 693
    invoke-static {v3}, Ll/֡᩶;->ܳۛ᩺(Ljava/lang/Object;)V

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v3, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 694
    iput-boolean v5, v0, Ll/ۡᩳ᩺;->᩶:Z

    :goto_5
    const-string v2, "\u06e0\u06d8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v29

    xor-int v12, v2, v30

    mul-int/lit16 v12, v12, 0x4935

    const v27, 0x3e55bf89

    xor-int v12, v12, v27

    const v27, 0x82192fb

    goto/16 :goto_8

    .line 692
    :sswitch_d
    invoke-static {v1, v9, v15}, Ll/֨ۧ;->ۗܳۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    move v12, v4

    const-wide/16 v3, 0x320

    invoke-static {v2, v3, v4}, Ll/ۗ;->۫֫ۨ(Ljava/lang/Object;J)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 445
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v2

    if-gtz v2, :cond_8

    :goto_6
    goto/16 :goto_3

    :cond_8
    const-string v2, "\u06e7\u1a75"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v30

    xor-int v4, v2, v29

    mul-int/lit16 v4, v4, -0x4249

    const v27, -0x1927908e

    xor-int v4, v4, v27

    const v27, 0x21e5bc0c

    goto/16 :goto_a

    :sswitch_e
    move v12, v4

    .line 692
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRotation()F

    move-result v2

    new-array v15, v8, [F

    aput v2, v15, v6

    aput v10, v15, v5

    .line 683
    sget v2, Ll/ۗ;->֨۬ۖ:I

    if-ltz v2, :cond_9

    goto :goto_6

    :cond_9
    const-string v2, "\u06d7\u0736"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v29

    mul-int/lit8 v2, v2, 0x11

    xor-int v4, v2, v30

    mul-int/lit16 v4, v4, -0x8ab

    const v27, 0x2aa22d03

    xor-int v4, v4, v27

    const v27, -0x77d7b779

    goto/16 :goto_a

    :sswitch_f
    move v12, v4

    move/from16 v2, v26

    add-int/lit16 v13, v2, 0x172

    .line 681
    iget-boolean v14, v0, Ll/ۡᩳ᩺;->ܽ:Z

    if-eqz v14, :cond_a

    const-string v4, "\u06da\u0730"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v30

    move/from16 v26, v2

    xor-int v2, v4, v29

    mul-int/lit16 v2, v2, -0x78f9

    const v27, -0x76efd198

    xor-int v2, v2, v27

    const v27, 0x44c08d6d

    xor-int v31, v4, v27

    goto/16 :goto_b

    :cond_a
    move/from16 v26, v2

    move v4, v13

    :goto_7
    const-string v2, "\u06d9\u1a76"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v29, v2

    mul-int/lit8 v2, v2, 0x6d

    xor-int v12, v2, v30

    mul-int/lit16 v12, v12, -0x574f

    const v27, -0x103184c0

    xor-int v12, v12, v27

    const v27, 0x54a4471a

    :goto_8
    xor-int v31, v2, v27

    move v2, v12

    goto/16 :goto_0

    :sswitch_10
    move v12, v4

    .line 680
    iget-object v2, v0, Ll/ۡᩳ᩺;->֡:Ljava/util/Random;

    const/16 v4, 0x154

    invoke-virtual {v2, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v26

    .line 436
    sget-boolean v2, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v2, :cond_b

    :goto_9
    const-string v2, "\u06df\u1a79"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v30

    mul-int/lit8 v2, v2, -0x15

    xor-int v4, v2, v29

    mul-int/lit16 v4, v4, 0x6c1d

    const v27, -0x484ea739

    xor-int v4, v4, v27

    const v27, 0x79375409

    goto/16 :goto_a

    :cond_b
    const-string v2, "\u1a75\u073a"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v30

    mul-int/lit8 v2, v2, 0x25

    xor-int v4, v2, v29

    mul-int/lit16 v4, v4, -0x6455

    const v27, -0x67b5d215

    xor-int v4, v4, v27

    const v27, -0x455c7708

    goto :goto_a

    :sswitch_11
    move v12, v4

    const/4 v2, 0x1

    move-object/from16 v27, v3

    move/from16 v4, v34

    const/16 v21, 0x1

    goto/16 :goto_d

    :sswitch_12
    move v12, v4

    if-eqz v21, :cond_c

    move-object v2, v9

    move/from16 v27, v10

    move/from16 v4, v34

    move-object/from16 v9, v35

    move/from16 v10, v36

    goto :goto_c

    :cond_c
    const-string v2, "\u1a7a\u073d"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v29

    xor-int v4, v2, v30

    mul-int/lit16 v4, v4, 0x3a19

    const v27, 0x1b0e0fa0

    xor-int v4, v4, v27

    const v27, 0x7f147490

    goto :goto_a

    :sswitch_13
    move v12, v4

    .line 676
    iget-object v2, v0, Ll/ۡᩳ᩺;->ܺ:Landroid/animation/ObjectAnimator;

    invoke-static {v2}, Ll/֡᩶;->ܳۛ᩺(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/animation/Animator;->cancel()V

    .line 677
    iget-boolean v2, v0, Ll/ۡᩳ᩺;->᩶:Z

    if-eqz v2, :cond_d

    const-string v2, "\u06d7\u1a76"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v30, v2

    mul-int/lit8 v2, v2, 0x35

    xor-int v4, v2, v29

    mul-int/lit16 v4, v4, -0x230d

    const v27, -0x36e68838    # -628604.5f

    xor-int v4, v4, v27

    const v27, 0x77733e66

    :goto_a
    xor-int v31, v2, v27

    move v2, v4

    :goto_b
    move v4, v12

    goto/16 :goto_0

    :cond_d
    move-object/from16 v27, v3

    move-object/from16 v2, v16

    move/from16 v4, v34

    goto/16 :goto_f

    :sswitch_14
    move v12, v4

    const/16 v2, 0x8

    move/from16 v4, v34

    move-object/from16 v9, v35

    move/from16 v10, v36

    .line 679
    invoke-static {v9, v10, v2, v4}, Ll/֫;->ۗܿܶ([SIII)Ljava/lang/String;

    move-result-object v2

    const/16 v27, 0x0

    cmpg-float v31, v20, v27

    if-nez v31, :cond_e

    :goto_c
    const-string v31, "\u073a\u1a79"

    invoke-static/range {v31 .. v31}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v31

    xor-int v31, v31, v29

    move-object/from16 v32, v2

    xor-int v2, v31, v30

    mul-int/lit16 v2, v2, -0x7d5d

    const v33, -0x426ff9cd

    xor-int v2, v2, v33

    const v33, -0xc784891

    xor-int v31, v31, v33

    move/from16 v34, v4

    move-object/from16 v35, v9

    move/from16 v36, v10

    move v4, v12

    move/from16 v10, v27

    move-object/from16 v9, v32

    goto/16 :goto_0

    :cond_e
    const-string v31, "\u06df\u1a77"

    invoke-static/range {v31 .. v31}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v31

    xor-int v31, v31, v29

    move-object/from16 v32, v2

    xor-int v2, v31, v30

    mul-int/lit16 v2, v2, 0x4d4b

    const v33, 0x247dadc6

    xor-int v2, v2, v33

    const v33, 0x4b8c61c5    # 1.8400138E7f

    xor-int v31, v31, v33

    move/from16 v34, v4

    move-object/from16 v35, v9

    move/from16 v36, v10

    move v4, v12

    move-object/from16 v9, v32

    const/4 v10, 0x0

    goto/16 :goto_0

    :sswitch_15
    move v12, v4

    move/from16 v4, v34

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRotation()F

    move-result v20

    sget-object v35, Ll/ۡᩳ᩺;->ۤ֡ۢ:[S

    const/16 v36, 0x2

    .line 212
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v2

    if-eqz v2, :cond_f

    move-object/from16 v27, v3

    const/4 v8, 0x2

    goto/16 :goto_10

    :cond_f
    const-string v2, "\u1a7b\u1a74"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v30

    mul-int/lit8 v2, v2, 0x3f

    xor-int v8, v2, v29

    mul-int/lit16 v8, v8, 0x5c45

    const v31, -0xebe54d5    # -9.590006E29f

    xor-int v8, v8, v31

    const v31, -0x26bb61ac

    xor-int v31, v2, v31

    move/from16 v34, v4

    move v2, v8

    move v4, v12

    const/4 v8, 0x2

    goto/16 :goto_0

    :sswitch_16
    move v12, v4

    move/from16 v4, v34

    .line 675
    invoke-virtual/range {v17 .. v17}, Landroid/animation/Animator;->isRunning()Z

    move-result v2

    if-eqz v2, :cond_10

    const-string v2, "\u06ec\u1a75"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v30

    mul-int/lit8 v2, v2, -0x7d

    move-object/from16 v27, v3

    xor-int v3, v2, v29

    mul-int/lit16 v3, v3, -0x4ad7

    const v31, -0xaab1376

    xor-int v3, v3, v31

    const v31, 0x3eac5c3f

    goto :goto_e

    :cond_10
    move-object/from16 v27, v3

    move-object/from16 v2, v16

    goto :goto_f

    :sswitch_17
    move-object/from16 v27, v3

    move v12, v4

    move/from16 v4, v34

    const/4 v2, 0x0

    const/16 v21, 0x0

    :goto_d
    const-string v2, "\u1a7b\u0733"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v29

    xor-int v3, v2, v30

    mul-int/lit16 v3, v3, 0xe39

    const v31, 0x376b1d5a

    xor-int v3, v3, v31

    const v31, -0x5bb291b1

    :goto_e
    xor-int v31, v2, v31

    goto/16 :goto_14

    :sswitch_18
    move-object/from16 v27, v3

    move v12, v4

    move-object/from16 v2, v16

    move/from16 v4, v34

    .line 6
    invoke-static {v1, v2}, Ll/ۖᩴ;->֡۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 675
    iget-object v3, v0, Ll/ۡᩳ᩺;->ܺ:Landroid/animation/ObjectAnimator;

    const/4 v6, 0x0

    if-eqz v3, :cond_11

    const-string v16, "\u06dc\u06e0"

    invoke-static/range {v16 .. v16}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v29

    mul-int/lit8 v16, v16, -0x6f

    xor-int v5, v16, v30

    mul-int/lit16 v5, v5, -0x1455

    const v31, -0x623eb44f

    xor-int v5, v5, v31

    const v31, 0x6fee44aa

    xor-int v31, v16, v31

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move/from16 v34, v4

    move v2, v5

    move v4, v12

    move-object/from16 v3, v27

    const/4 v5, 0x1

    goto/16 :goto_0

    :cond_11
    move-object/from16 v17, v3

    const/4 v5, 0x1

    :goto_f
    const-string v3, "\u06da\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v30, v3

    mul-int/lit8 v3, v3, -0x6b

    xor-int v0, v3, v29

    mul-int/lit16 v0, v0, 0xf1f

    const v16, 0x3b70be7c

    xor-int v0, v0, v16

    const v16, -0x3fb8ab5e

    xor-int v31, v3, v16

    move-object/from16 v16, v2

    move/from16 v34, v4

    move v4, v12

    move-object/from16 v3, v27

    move v2, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v27, v3

    move v12, v4

    move/from16 v4, v34

    .line 0
    sget-object v0, Ll/ۡᩳ᩺;->ۤ֡ۢ:[S

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v4}, Ll/۟;->ܳܳ᩶([SIII)Ljava/lang/String;

    move-result-object v16

    .line 255
    sget-boolean v0, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v0, :cond_12

    :goto_10
    const-string v0, "\u06db\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    xor-int v2, v0, v29

    mul-int/lit16 v2, v2, 0x103d

    const v3, -0x6d169a2a

    xor-int/2addr v2, v3

    const v3, -0x4c96f5c7

    goto :goto_11

    :cond_12
    const-string v0, "\u06d9\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v30

    mul-int/lit8 v0, v0, -0x6b

    xor-int v2, v0, v29

    mul-int/lit16 v2, v2, -0x7c9

    const v3, 0x271b1b8e

    xor-int/2addr v2, v3

    const v3, -0x4a025486

    :goto_11
    xor-int v31, v0, v3

    move-object/from16 v0, p0

    goto/16 :goto_15

    :sswitch_1a
    move-object/from16 v27, v3

    move v12, v4

    move-object/from16 v2, v16

    const v0, 0xd601

    const v34, 0xd601

    goto :goto_12

    :sswitch_1b
    move-object/from16 v27, v3

    move v12, v4

    move-object/from16 v2, v16

    const v0, 0x9ff4

    const v34, 0x9ff4

    :goto_12
    const-string v0, "\u06e4\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v29

    xor-int v3, v0, v30

    mul-int/lit16 v3, v3, 0x4ad7

    const v4, 0x6f1151cf

    xor-int/2addr v3, v4

    const v4, -0x7bce0ec

    xor-int v31, v0, v4

    move-object/from16 v0, p0

    move-object/from16 v16, v2

    move v2, v3

    goto :goto_16

    :sswitch_1c
    move-object/from16 v27, v3

    move v12, v4

    move-object/from16 v2, v16

    move/from16 v4, v34

    mul-int v0, v24, v25

    mul-int v3, v24, v24

    const v16, 0x79dc640

    add-int v3, v3, v16

    sub-int/2addr v0, v3

    if-lez v0, :cond_13

    const-string v0, "\u06dc\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    xor-int v3, v0, v29

    mul-int/lit16 v3, v3, -0x4c5

    const v16, -0x15589f75

    xor-int v3, v3, v16

    const v16, 0x36093ff4

    goto :goto_13

    :cond_13
    const-string v0, "\u06d9\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v29, v0

    mul-int/lit8 v0, v0, 0x15

    xor-int v3, v0, v30

    mul-int/lit16 v3, v3, -0x372f

    const v16, -0x5e0243fb

    xor-int v3, v3, v16

    const v16, -0x7352eb34

    :goto_13
    xor-int v31, v0, v16

    move-object/from16 v0, p0

    move-object/from16 v16, v2

    :goto_14
    move v2, v3

    :goto_15
    move/from16 v34, v4

    :goto_16
    move v4, v12

    move-object/from16 v3, v27

    goto/16 :goto_0

    :sswitch_1d
    move-object/from16 v27, v3

    move v12, v4

    move-object/from16 v2, v16

    move/from16 v4, v34

    aget-short v24, v22, v23

    const/16 v25, 0x5850

    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_14

    move-object/from16 v3, v27

    :goto_17
    const-string v0, "\u0736\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v30, v0

    mul-int/lit8 v0, v0, 0x53

    xor-int v1, v0, v29

    mul-int/lit16 v1, v1, -0x7823

    const v16, 0x2d61705f

    xor-int v1, v1, v16

    const v16, -0x1177eff

    xor-int v31, v0, v16

    move-object/from16 v0, p0

    move-object/from16 v16, v2

    move/from16 v34, v4

    move v4, v12

    goto :goto_1a

    :cond_14
    const-string v0, "\u06d7\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v30, v0

    mul-int/lit8 v0, v0, -0x6f

    xor-int v1, v0, v29

    mul-int/lit16 v1, v1, -0x4381

    const v3, 0x121c4cd9

    xor-int/2addr v1, v3

    const v3, 0x2f25b7d0

    goto :goto_19

    :sswitch_1e
    move-object/from16 v27, v3

    move v12, v4

    move-object/from16 v2, v16

    move/from16 v4, v34

    sget-object v22, Ll/ۡᩳ᩺;->ۤ֡ۢ:[S

    const/16 v23, 0x0

    .line 404
    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_15

    :goto_18
    const-string v0, "\u06dc\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v29, v0

    mul-int/lit8 v0, v0, -0x1b

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, -0x5499

    const v3, -0xb8e64b

    xor-int/2addr v1, v3

    const v3, 0x5e191bf4    # 2.75817E18f

    goto :goto_19

    :cond_15
    const-string v0, "\u06da\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v29, v0

    mul-int/lit8 v0, v0, -0x61

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, -0x2c1

    const v3, 0x40bb644e

    xor-int/2addr v1, v3

    const v3, -0xe11634

    :goto_19
    xor-int v31, v0, v3

    move-object/from16 v0, p0

    move-object/from16 v16, v2

    move/from16 v34, v4

    move v4, v12

    move-object/from16 v3, v27

    :goto_1a
    move v2, v1

    move-object/from16 v1, p1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f7e0d6c -> :sswitch_c
        -0x7f4e2b00 -> :sswitch_18
        -0x7ecf9a73 -> :sswitch_15
        -0x7b0609fc -> :sswitch_1a
        -0x7a1c345c -> :sswitch_e
        -0x7114df9f -> :sswitch_4
        -0x6ceaa112 -> :sswitch_c
        -0x6a28cc72 -> :sswitch_11
        -0x6102e400 -> :sswitch_13
        -0x6074b01b -> :sswitch_5
        -0x60141446 -> :sswitch_1b
        -0x5d0399bd -> :sswitch_b
        -0x5c2659f1 -> :sswitch_8
        -0x54f68dfa -> :sswitch_a
        -0x4290939c -> :sswitch_d
        -0x3c686177 -> :sswitch_15
        -0x3c38eeb6 -> :sswitch_3
        -0x38142de6 -> :sswitch_17
        -0x34b6c1e7 -> :sswitch_3
        -0x2f5e76f1 -> :sswitch_14
        -0x2de6386c -> :sswitch_16
        -0x2b85144b -> :sswitch_8
        -0x29068536 -> :sswitch_10
        -0x22c20c76 -> :sswitch_19
        -0x1da95750 -> :sswitch_1e
        -0x1b61c31f -> :sswitch_14
        -0x17ad53b6 -> :sswitch_1
        -0x14b77cba -> :sswitch_b
        -0x1037b810 -> :sswitch_1e
        -0xe5fa2a1 -> :sswitch_7
        -0xaa7f3d2 -> :sswitch_d
        -0x9cfbb89 -> :sswitch_7
        -0x9b4be87 -> :sswitch_17
        -0x9f1320 -> :sswitch_0
        0x199c377 -> :sswitch_5
        0x7d3ec27 -> :sswitch_13
        0x91f1aa8 -> :sswitch_a
        0x132a05db -> :sswitch_12
        0x1edea0e2 -> :sswitch_0
        0x24c23bc3 -> :sswitch_16
        0x2b0c7edb -> :sswitch_2
        0x2ca4375b -> :sswitch_19
        0x2d5f7ed9 -> :sswitch_6
        0x34309956 -> :sswitch_6
        0x3461075f -> :sswitch_1d
        0x37ae8ff4 -> :sswitch_2
        0x3c5fcea5 -> :sswitch_1b
        0x454895e2 -> :sswitch_10
        0x456352c8 -> :sswitch_1c
        0x4ca35721 -> :sswitch_1a
        0x4ea0cdb0 -> :sswitch_1d
        0x4f2a1fee -> :sswitch_18
        0x55de50aa -> :sswitch_4
        0x5a697f49 -> :sswitch_e
        0x624a182f -> :sswitch_1c
        0x62c4de59 -> :sswitch_9
        0x63393f59 -> :sswitch_9
        0x6789cb2d -> :sswitch_f
        0x6ef2b967 -> :sswitch_12
        0x715c7dc3 -> :sswitch_f
        0x77b13424 -> :sswitch_1
        0x7cf148d7 -> :sswitch_11
    .end sparse-switch
.end method

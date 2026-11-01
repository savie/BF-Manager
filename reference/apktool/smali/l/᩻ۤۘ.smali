.class public final synthetic Ll/᩻ۤۘ;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ܰ۟ܿ:[S


# instance fields
.field public final synthetic ܺ:Lbin/mt/plus/Main;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x19

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩻ۤۘ;->ܰ۟ܿ:[S

    return-void

    :array_0
    .array-data 2
        0x491s
        0x58eds
        0x58ees
        0x58ees
        0x58bds
        0x58efs
        0x58bbs
        0x58ebs
        0x58e9s
        0x58bds
        0x58e8s
        0x58bes
        0x58eds
        0x58eds
        0x58b9s
        0x58bas
        0x58bcs
        0x58efs
        0x58eds
        0x58e8s
        0x58e8s
        0x58e8s
        0x58bes
        0x58ees
        0x58e8s
    .end array-data
.end method

.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۤۘ;->ܺ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 23

    const/4 v2, 0x0

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

    const v14, 0x26eaa3c5

    sget v15, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v16, Ll/ۗ;->֨۬ۖ:I

    const-string v17, "\u06db\u073d"

    invoke-static/range {v17 .. v17}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v17

    sub-int v17, v16, v17

    mul-int/lit8 v17, v17, -0x39

    xor-int v0, v17, v15

    mul-int/lit16 v0, v0, -0x22f9

    const v19, -0x4e9048ca

    xor-int v0, v0, v19

    const v19, -0x25cb79bf

    xor-int v17, v17, v19

    move-object v3, v2

    move-object/from16 v20, v4

    move-object v12, v11

    move/from16 v18, v17

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, 0x26eaa3c5

    :goto_0
    xor-int v5, v17, v15

    mul-int/lit16 v5, v5, -0x4821

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v17, v18, v0

    sparse-switch v17, :sswitch_data_0

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    return-void

    :sswitch_0
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    sget v0, Ll/ۗܺ;->ۨ᩺۠:I

    if-lez v0, :cond_0

    goto :goto_3

    :cond_0
    :goto_1
    move-object/from16 v5, p0

    move-object/from16 v18, v1

    goto/16 :goto_b

    .line 439
    :sswitch_1
    sget v0, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v0, :cond_1

    goto :goto_4

    :cond_1
    :goto_2
    move-object/from16 v5, p0

    move-object/from16 v18, v1

    goto/16 :goto_9

    .line 394
    :sswitch_2
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_3

    goto :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    :goto_3
    const-string v0, "\u06d6\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x3347

    const v18, -0x43b73706

    xor-int v5, v5, v18

    const v18, -0x6e2413ef

    goto/16 :goto_5

    .line 33
    :sswitch_4
    new-instance v0, Ll/֨ܳ᩺;

    invoke-direct {v0, v1}, Ll/֨ܳ᩺;-><init>(Ljava/lang/Object;)V

    invoke-static {v2, v0}, Lcom/umeng/commonsdk/UMConfigure;->getOaid(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V

    goto/16 :goto_6

    :sswitch_5
    return-void

    :sswitch_6
    const/4 v0, 0x0

    .line 40
    invoke-static {v2, v3, v0, v4, v0}, Lcom/umeng/commonsdk/UMConfigure;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 41
    sget-object v0, Lcom/umeng/analytics/MobclickAgent$PageMode;->LEGACY_MANUAL:Lcom/umeng/analytics/MobclickAgent$PageMode;

    invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->setPageCollectionMode(Lcom/umeng/analytics/MobclickAgent$PageMode;)V

    move-object/from16 v5, p0

    goto/16 :goto_7

    .line 37
    :sswitch_7
    invoke-static {v12, v13, v14, v11}, Ll/֡ۛ;->ܰۙۚ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    .line 489
    sget v0, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "\u05a8\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x2c87

    const v18, -0x4d213270

    xor-int v5, v5, v18

    const v18, -0x1fbd9c11

    goto :goto_5

    :sswitch_8
    const/16 v14, 0x18

    .line 67
    sget v0, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v0, :cond_4

    :cond_3
    :goto_4
    const-string v0, "\u06eb\u06df"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x701f

    const v18, 0x6a5af5c5

    xor-int v5, v5, v18

    const v18, -0x5674230

    goto :goto_5

    :cond_4
    const-string v0, "\u073f\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x4e91

    const v18, -0x568f01f2

    xor-int v5, v5, v18

    const v18, 0x7ee590ac

    goto :goto_5

    .line 37
    :sswitch_9
    sget-object v12, Ll/᩻ۤۘ;->ܰ۟ܿ:[S

    const/4 v13, 0x1

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v0, "\u06ec\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x361

    const v18, -0x3932a25f

    xor-int v5, v5, v18

    const v18, -0x302d62c8

    :goto_5
    xor-int v18, v0, v18

    move v0, v5

    goto/16 :goto_0

    .line 570
    :sswitch_a
    new-instance v1, Ll/֨۟ۘ;

    const/4 v0, 0x0

    .line 86
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v5

    if-gtz v5, :cond_6

    move-object/from16 v5, p0

    goto/16 :goto_a

    .line 570
    :cond_6
    invoke-direct {v1, v0}, Ll/֨۟ۘ;-><init>(I)V

    .line 30
    invoke-static {}, Ll/ܶۧ᩺;->ۙ()Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "\u06d6\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x6d17

    const v18, -0x62c72045

    xor-int v5, v5, v18

    const v18, -0x787d16e2

    goto :goto_5

    :cond_7
    :goto_6
    const-string v0, "\u06e2\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x6d

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x16ab

    const v18, 0x668e6f31    # 3.3631358E23f

    xor-int v5, v5, v18

    const v18, -0x79e3df7

    goto :goto_5

    .line 37
    :sswitch_b
    invoke-static {}, Ll/ܶۧ᩺;->ۙ()Z

    move-result v0

    move-object/from16 v5, p0

    iget-object v2, v5, Ll/᩻ۤۘ;->ܺ:Lbin/mt/plus/Main;

    if-nez v0, :cond_8

    const-string v0, "\u06da\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x65

    move-object/from16 v18, v1

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x49b5

    const v21, 0x723b4b04

    xor-int v1, v1, v21

    const v21, 0x28d4b2af

    goto/16 :goto_c

    :cond_8
    :goto_7
    move-object/from16 v18, v1

    const-string v0, "\u05a1\u073d"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x1f

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x2633

    const v21, -0x4f61d37b

    xor-int v1, v1, v21

    const v21, 0x35f8d34d

    goto/16 :goto_c

    :sswitch_c
    move-object/from16 v5, p0

    move-object/from16 v18, v1

    .line 2
    sget v0, Lbin/mt/plus/Main;->ۚۨ:I

    .line 569
    sget v0, Ll/۬ܳ᩺;->ۙ:I

    .line 390
    sget v0, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v0, :cond_9

    goto/16 :goto_a

    :cond_9
    const-string v0, "\u06da\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x67

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x3a67

    const v21, 0x3de5a8ff

    xor-int v1, v1, v21

    const v21, 0x21a76d71

    goto/16 :goto_c

    :sswitch_d
    move-object/from16 v5, p0

    move-object/from16 v18, v1

    const v0, 0xd3ee

    const v11, 0xd3ee

    goto :goto_8

    :sswitch_e
    move-object/from16 v5, p0

    move-object/from16 v18, v1

    const/16 v0, 0x58d8

    const/16 v11, 0x58d8

    :goto_8
    const-string v0, "\u06e0\u06d9"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x527

    const v21, 0x6f27d04

    xor-int v1, v1, v21

    const v21, 0x1e761c46

    goto/16 :goto_c

    :sswitch_f
    move-object/from16 v5, p0

    move-object/from16 v18, v1

    mul-int v0, v7, v10

    sub-int v0, v9, v0

    if-ltz v0, :cond_a

    const-string v0, "\u06e7\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x39

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x6951

    const v21, 0x35d78c44

    xor-int v1, v1, v21

    const v21, 0x2b3a3959

    goto/16 :goto_c

    :cond_a
    const-string v0, "\u06df\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x7d05

    const v21, 0xc22ecb

    xor-int v1, v1, v21

    const v21, 0x2e598985

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v5, p0

    move-object/from16 v18, v1

    const/16 v10, 0x2924

    sget v0, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v0, :cond_b

    goto/16 :goto_b

    :cond_b
    const-string v0, "\u05a8\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x13ab

    const v21, 0x5b868c4e

    xor-int v1, v1, v21

    const v21, 0x2ae72458

    goto/16 :goto_c

    :sswitch_11
    move-object/from16 v5, p0

    move-object/from16 v18, v1

    const v0, 0x1a72344

    add-int v9, v8, v0

    .line 193
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v0

    if-ltz v0, :cond_c

    :goto_9
    const-string v0, "\u06e1\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x1b

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x7e01

    const v21, -0x7a73c51c

    xor-int v1, v1, v21

    const v21, -0x1dbb5650

    goto/16 :goto_c

    :cond_c
    const-string v0, "\u06d6\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0xb

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x392f

    const v21, -0x367cf2e8    # -1073571.0f

    xor-int v1, v1, v21

    const v21, -0x6bd1d80

    goto/16 :goto_c

    :sswitch_12
    move-object/from16 v5, p0

    move-object/from16 v18, v1

    aget-short v7, v20, v6

    mul-int v8, v7, v7

    sget v0, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v0, :cond_d

    :goto_a
    const-string v0, "\u05a8\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x5b

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x463f

    const v18, 0x1f974258

    xor-int v1, v1, v18

    const v18, -0x455b9dec

    xor-int v18, v0, v18

    move v0, v1

    const/4 v1, 0x0

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u073a\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x35

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x1c45

    const v21, -0xfc889d

    xor-int v1, v1, v21

    const v21, 0x73e9db43

    goto :goto_c

    :sswitch_13
    move-object/from16 v5, p0

    move-object/from16 v18, v1

    const/4 v6, 0x0

    .line 539
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_b

    :cond_e
    const-string v0, "\u1a79\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x4b

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x3c0d

    const v21, -0x4025104b

    xor-int v1, v1, v21

    const v21, -0x51fb09af

    goto :goto_c

    :sswitch_14
    move-object/from16 v5, p0

    move-object/from16 v18, v1

    sget-object v20, Ll/᩻ۤۘ;->ܰ۟ܿ:[S

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v0

    if-eqz v0, :cond_f

    :goto_b
    const-string v0, "\u1a74\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x6797

    const v21, -0x347e2174    # -1.7022232E7f

    xor-int v1, v1, v21

    const v21, -0x2b3f881e

    goto :goto_c

    :cond_f
    const-string v0, "\u1a79\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x610b

    const v21, -0x4696c495

    xor-int v1, v1, v21

    const v21, 0x11a689db

    :goto_c
    xor-int v0, v0, v21

    move-object/from16 v22, v18

    move/from16 v18, v0

    move v0, v1

    move-object/from16 v1, v22

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d75c37d -> :sswitch_12
        -0x7a4f0477 -> :sswitch_1
        -0x79eb93c5 -> :sswitch_0
        -0x780b430b -> :sswitch_11
        -0x71c9c482 -> :sswitch_c
        -0x67e87f15 -> :sswitch_f
        -0x65fe5165 -> :sswitch_d
        -0x6356bf17 -> :sswitch_d
        -0x5caa5f2c -> :sswitch_13
        -0x5963c859 -> :sswitch_13
        -0x511b8181 -> :sswitch_9
        -0x408b2df8 -> :sswitch_c
        -0x33ea9a54 -> :sswitch_7
        -0x3083496c -> :sswitch_10
        -0x286c9205 -> :sswitch_7
        -0x284ffa1e -> :sswitch_5
        -0x2386e372 -> :sswitch_8
        -0x21331810 -> :sswitch_0
        -0x192e3339 -> :sswitch_b
        -0x1263cfb4 -> :sswitch_10
        -0x108fba5a -> :sswitch_14
        -0xd77b4b9 -> :sswitch_14
        0x588280c -> :sswitch_12
        0xd802843 -> :sswitch_e
        0x16f9246e -> :sswitch_b
        0x19061dd3 -> :sswitch_11
        0x1965bda6 -> :sswitch_2
        0x268012c9 -> :sswitch_4
        0x2aaf01a7 -> :sswitch_5
        0x37fc6ab3 -> :sswitch_6
        0x4140c35b -> :sswitch_6
        0x4806aa24 -> :sswitch_2
        0x48687208 -> :sswitch_3
        0x6123127d -> :sswitch_a
        0x61b3a1e3 -> :sswitch_a
        0x66332beb -> :sswitch_1
        0x68e5b98f -> :sswitch_9
        0x6a517af1 -> :sswitch_f
        0x74347b42 -> :sswitch_3
        0x7c6984a1 -> :sswitch_4
        0x7d225388 -> :sswitch_8
        0x7eb40c71 -> :sswitch_e
    .end sparse-switch
.end method

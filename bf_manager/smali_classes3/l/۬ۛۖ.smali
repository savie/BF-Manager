.class public final Ll/۬ۛۖ;
.super Ljava/lang/Object;
.source "25S1"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Landroid/text/SpanWatcher;


# static fields
.field private static final ۖۙ᩸:[S

.field public static final ܽ:Ljava/lang/Class;


# instance fields
.field public ֡:I

.field public ܺ:Ll/ۛܳۖ;

.field public ᩶:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    const/16 v0, 0x22

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۬ۛۖ;->ۖۙ᩸:[S

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x2181cfff

    sget v11, Ll/֫;->ܶܺ᩻:I

    sget v12, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v13, "\u06d9\u05a1"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x4d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x9c7

    const v15, -0x3116274e

    xor-int/2addr v14, v15

    const v15, 0x6f29a9e8

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x3de7

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 20
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v13, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v13, :cond_d

    goto/16 :goto_6

    .line 28
    :sswitch_0
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    goto/16 :goto_6

    .line 21
    :sswitch_1
    aget-short v3, v1, v2

    .line 20
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v13

    if-eqz v13, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v13, "\u05ab\u1a78"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0xaed

    const v15, 0x5da3df29

    xor-int/2addr v14, v15

    const v15, 0x35567bed

    goto :goto_0

    .line 7
    :sswitch_2
    sget v13, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v13, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v13, "\u05a1\u06d6"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1e7d

    const v15, 0x62ba6dcb

    xor-int/2addr v14, v15

    const v15, -0x56eb22c5

    goto :goto_0

    .line 24
    :sswitch_3
    sget v13, Ll/֫;->ܶܺ᩻:I

    if-gez v13, :cond_b

    goto/16 :goto_4

    .line 32
    :sswitch_4
    sput-object v0, Ll/۬ۛۖ;->ܽ:Ljava/lang/Class;

    return-void

    .line 1
    :sswitch_5
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_6
    mul-int v4, v3, v3

    .line 21
    sget v13, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v13, :cond_2

    goto :goto_1

    :cond_2
    const-string v13, "\u05a1\u0736"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x35

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6c2f

    const v15, 0x5025ca23

    xor-int/2addr v14, v15

    const v15, -0x7d44e473

    goto :goto_0

    :sswitch_7
    add-int v6, v5, v5

    const/16 v7, 0x697

    .line 15
    sget-boolean v13, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v13, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v13, "\u06d8\u06eb"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x5f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x45a7

    const v15, -0x3069aa00

    xor-int/2addr v14, v15

    const v15, 0x3c2ae6b6

    goto/16 :goto_0

    .line 0
    :sswitch_8
    :try_start_0
    sget-object v13, Ll/۬ۛۖ;->ۖۙ᩸:[S

    const/4 v14, 0x1

    const/16 v15, 0x21

    invoke-static {v13, v14, v15, v9}, Ll/۟;->ܳܳ᩶([SIII)Ljava/lang/String;

    move-result-object v13

    .line 29
    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    const-string v13, "\u05a8\u06df"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x31a9

    const v15, 0x30eb3672

    xor-int/2addr v14, v15

    const v15, 0x582125ce

    goto/16 :goto_0

    :sswitch_9
    const/16 v9, 0x6cfa

    goto :goto_2

    :sswitch_a
    const v5, 0x2b6d11

    add-int/2addr v5, v4

    .line 15
    sget-boolean v13, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v13, :cond_4

    :goto_1
    const-string v13, "\u1a73\u06d8"

    .line 21
    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x25

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x192d

    const v15, -0x41b13baf

    xor-int/2addr v14, v15

    const v15, -0x55bfde5c

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u06d8\u06e1"

    .line 15
    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x206b

    const v15, -0x2c393003

    xor-int/2addr v14, v15

    const v15, 0x4ac9805

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget v13, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v13, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v13, "\u073d\u1a7b"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x35bd

    const v15, 0x7629140c

    xor-int/2addr v14, v15

    const v15, -0x4d566fa9

    goto/16 :goto_0

    :sswitch_c
    const/16 v9, 0x522c

    :goto_2
    const-string v13, "\u05ab\u06eb"

    .line 29
    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1bf5

    const v15, -0x47c422ab

    xor-int/2addr v14, v15

    const v15, 0x1dd072ba

    goto/16 :goto_0

    .line 27
    :sswitch_d
    sget-object v1, Ll/۬ۛۖ;->ۖۙ᩸:[S

    const/4 v2, 0x0

    .line 19
    sget v13, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v13, :cond_6

    goto/16 :goto_7

    :cond_6
    const-string v13, "\u1a79\u073a"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x21

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x61bd

    const v15, 0x39da29b0

    xor-int/2addr v14, v15

    const v15, -0x329eb67d

    goto/16 :goto_0

    :sswitch_e
    mul-int v13, v8, v8

    sub-int/2addr v13, v6

    if-lez v13, :cond_7

    const-string v13, "\u06df\u06db"

    .line 29
    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x59

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x766b

    const v15, 0x5a3ec832

    xor-int/2addr v14, v15

    const v15, 0x33e73938

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u06e4\u1a78"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5657

    const v15, -0x4b7a71eb

    xor-int/2addr v14, v15

    const v15, 0x5c7958cd

    goto/16 :goto_0

    :sswitch_f
    const/4 v0, 0x0

    :goto_3
    const-string v13, "\u05ab\u0733"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0xd19

    const v15, -0x2cc2327d

    xor-int/2addr v14, v15

    const v15, -0x3715c261

    goto/16 :goto_0

    .line 24
    :sswitch_10
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v13

    if-eqz v13, :cond_9

    goto/16 :goto_6

    .line 25
    :sswitch_11
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v13

    if-ltz v13, :cond_8

    goto :goto_4

    :cond_8
    const-string v13, "\u06d8\u073f"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1a25

    const v15, -0x7581eb07

    xor-int/2addr v14, v15

    const v15, -0x778845aa

    goto/16 :goto_0

    :sswitch_12
    add-int v8, v3, v7

    .line 1
    sget v13, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v13, :cond_a

    :cond_9
    :goto_4
    const-string v13, "\u1a78\u1a7a"

    .line 25
    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x2831

    const v15, 0x5d20c1ae

    xor-int/2addr v14, v15

    const v15, -0x5254f5ba

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u06d8\u1a79"

    .line 1
    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0xc87

    const v15, -0x16384c9    # -1.0399967E38f

    xor-int/2addr v14, v15

    const v15, 0x7e5acae1

    goto/16 :goto_0

    .line 27
    :sswitch_13
    sget-boolean v13, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v13, :cond_c

    :cond_b
    :goto_5
    const-string v13, "\u06e1\u1a74"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x54c1

    const v15, 0x30fdf50c

    xor-int/2addr v14, v15

    const v15, -0x59877f42

    goto/16 :goto_0

    :cond_c
    const-string v13, "\u1a78\u1a7b"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x5a3f

    const v15, 0x107f3fe

    xor-int/2addr v14, v15

    const v15, 0x3c7512f6

    goto/16 :goto_0

    :goto_6
    const-string v13, "\u06d7\u06e8"

    .line 20
    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1b97

    const v15, 0x2f0ac301

    xor-int/2addr v14, v15

    const v15, -0x4ae7a3d

    goto/16 :goto_0

    :cond_d
    :goto_7
    const-string v13, "\u06da\u1a77"

    .line 19
    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x45

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6051

    const v15, -0x2e5e5ab5

    xor-int/2addr v14, v15

    const v15, -0x23b8e536

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77d25298 -> :sswitch_13
        -0x67980673 -> :sswitch_12
        -0x5fa21ec2 -> :sswitch_11
        -0x59b216e3 -> :sswitch_10
        -0x5334a041 -> :sswitch_f
        -0x51142f71 -> :sswitch_e
        -0x503a72c2 -> :sswitch_10
        -0x4b2ab71d -> :sswitch_d
        -0x4790d291 -> :sswitch_c
        -0x45f80012 -> :sswitch_b
        -0x45d314ee -> :sswitch_a
        -0x43c8e9b1 -> :sswitch_f
        -0x42c5ab9f -> :sswitch_a
        -0x41896abd -> :sswitch_9
        -0x329ecf2b -> :sswitch_8
        -0x306b3eb0 -> :sswitch_e
        -0x2be2483d -> :sswitch_7
        -0x268d3971 -> :sswitch_c
        -0x1a18baf1 -> :sswitch_6
        -0x133856c6 -> :sswitch_11
        -0xf46bb12 -> :sswitch_7
        -0xa52fae2 -> :sswitch_d
        -0x5b795bf -> :sswitch_5
        0xb22d11a -> :sswitch_6
        0x185b7fb8 -> :sswitch_4
        0x2123112a -> :sswitch_5
        0x228f7e5a -> :sswitch_3
        0x2b671fa1 -> :sswitch_12
        0x459d5228 -> :sswitch_2
        0x50f2a986 -> :sswitch_1
        0x54533f4a -> :sswitch_13
        0x56bfef3f -> :sswitch_1
        0x5df8f063 -> :sswitch_3
        0x62e26812 -> :sswitch_4
        0x62f5a250 -> :sswitch_0
        0x63fcc82d -> :sswitch_8
        0x6c61e487 -> :sswitch_2
        0x73755420 -> :sswitch_9
        0x79a59ca1 -> :sswitch_b
        0x7d19b18b -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 2
        0x7ces
        0x524ds
        0x5242s
        0x5248s
        0x525es
        0x5243s
        0x5245s
        0x5248s
        0x5202s
        0x5258s
        0x5249s
        0x5254s
        0x5258s
        0x5202s
        0x525fs
        0x5258s
        0x5255s
        0x5240s
        0x5249s
        0x5202s
        0x527fs
        0x525cs
        0x5249s
        0x5240s
        0x5240s
        0x526fs
        0x5244s
        0x5249s
        0x524fs
        0x5247s
        0x527fs
        0x525cs
        0x524ds
        0x5242s
    .end array-data
.end method

.method public constructor <init>(Ll/ۛܳۖ;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/۬ۛۖ;->ܺ:Ll/ۛܳۖ;

    return-void
.end method

.method private ۙ(IILjava/lang/Class;)V
    .locals 17

    move/from16 v0, p1

    move/from16 v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x2026448d

    sget v11, Ll/֨ܶ;->ۛۛۛ:I

    sget v12, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v13, "\u06e1\u1a78"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x1b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4969

    const v15, 0x4c5240b5    # 5.51165E7f

    xor-int/2addr v14, v15

    const v15, 0x3e10c8c5

    :goto_0
    xor-int/2addr v13, v15

    :goto_1
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0xa59

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 104
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    sget v13, Ll/֫۟;->᩸ᩴܿ:I

    if-gez v13, :cond_0

    :goto_2
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    goto/16 :goto_b

    .line 199
    :sswitch_0
    sget v13, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v13, :cond_1

    :cond_0
    :goto_3
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    goto/16 :goto_8

    :cond_1
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    goto/16 :goto_7

    :sswitch_1
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget-boolean v13, Ll/֨ۖ;->۫ۗۜ:Z

    if-eqz v13, :cond_2

    goto :goto_3

    :cond_2
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    goto/16 :goto_9

    .line 13
    :sswitch_2
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    goto :goto_2

    .line 123
    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    return-void

    .line 236
    :sswitch_4
    invoke-static {v4, v8}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_4

    .line 238
    :sswitch_5
    invoke-static {v7}, Ll/֡ۛ;->ۨۤ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    .line 239
    invoke-interface {v2, v13}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_6
    return-void

    :sswitch_7
    if-ne v9, v1, :cond_3

    goto :goto_4

    :cond_3
    const-string v13, "\u06df\u073f"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x2827

    const v15, 0x55a864f1

    xor-int/2addr v14, v15

    const v15, -0xe402a29

    goto :goto_0

    :sswitch_8
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v13, p3

    goto/16 :goto_6

    .line 238
    :sswitch_9
    invoke-static {v7}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const-string v13, "\u1a78\u05a1"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3eb3

    const v15, 0x4649c6ea

    xor-int/2addr v14, v15

    const v15, 0x3723e8d0

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u1a78\u0733"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x525b

    const v15, -0x756b5a41

    xor-int/2addr v14, v15

    const v15, -0x320a1737

    goto/16 :goto_0

    .line 232
    :sswitch_a
    aget-object v8, v3, v6

    .line 233
    invoke-interface {v2, v8}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v9

    .line 234
    invoke-interface {v2, v8}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v13

    if-eq v13, v0, :cond_5

    const-string v13, "\u1a79\u1a76"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x19

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x5d79

    const v15, -0x701fd2f5

    xor-int/2addr v14, v15

    const v15, -0x3de6ca0d

    goto/16 :goto_0

    :cond_5
    :goto_4
    const-string v13, "\u05a8\u06d9"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x5b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7bf7

    const v15, -0x63d2ef9e

    xor-int/2addr v14, v15

    const v15, 0x63c6585a

    goto/16 :goto_0

    .line 238
    :sswitch_b
    invoke-static {v4}, Ll/ۘ֡;->֫᩺ܶ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    const-string v13, "\u0733\u073a"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x3

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3c7b

    const v15, 0x747302d0

    xor-int/2addr v14, v15

    const v15, 0x67741558

    goto/16 :goto_0

    :sswitch_c
    if-ge v6, v5, :cond_6

    const-string v13, "\u1a78\u06db"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x6b99

    const v15, -0xb3ace6e

    xor-int/2addr v14, v15

    const v15, 0x351f980f

    goto/16 :goto_0

    :cond_6
    const-string v13, "\u06df\u1a7a"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x1d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0xa5d

    const v15, -0x6f978ceb

    xor-int/2addr v14, v15

    const v15, 0x445b1725

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v13, p3

    .line 230
    invoke-interface {v2, v0, v1, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    .line 231
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 232
    array-length v5, v3

    const/4 v6, 0x0

    :goto_6
    const-string v14, "\u1a79\u0736"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x28f1

    const v16, -0x67188752

    xor-int v15, v15, v16

    const v16, 0x83ce8f0

    xor-int v14, v14, v16

    move v13, v14

    move v14, v15

    goto/16 :goto_1

    :sswitch_e
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 229
    iget-object v2, v14, Ll/۬ۛۖ;->ܺ:Ll/ۛܳۖ;

    invoke-static {v2}, Ll/ۘۛ;->ܶܶۜ(Ljava/lang/Object;)Ll/ۗ֫ۖ;

    move-result-object v2

    .line 202
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v15

    if-eqz v15, :cond_7

    goto/16 :goto_a

    :cond_7
    const-string v15, "\u05a8\u05a1"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v12, v15

    mul-int/lit8 v15, v15, 0x77

    xor-int v0, v15, v11

    mul-int/lit16 v0, v0, 0x63e1

    const v16, 0xdc7ba0

    xor-int v0, v0, v16

    const v16, -0x1bc0c289

    xor-int v15, v15, v16

    move v14, v0

    move v13, v15

    goto/16 :goto_d

    :sswitch_f
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    sget v0, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v0, :cond_8

    goto/16 :goto_a

    :cond_8
    const-string v0, "\u1a74\u1a7a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x7779

    const v16, -0x7dcd97fb

    xor-int v15, v15, v16

    const v16, -0x18cbb02

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    sget-boolean v0, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v0, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u06d7\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x75ef

    const v16, -0x2246373f

    xor-int v15, v15, v16

    const v16, -0x42067cd2

    goto/16 :goto_c

    :sswitch_11
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 161
    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_a

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u06e4\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v11

    mul-int/lit8 v0, v0, 0x6f

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x18ab

    const v16, 0x741e14d0

    xor-int v15, v15, v16

    const v16, -0x400e96c4

    goto/16 :goto_c

    :sswitch_12
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 195
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v0

    if-gtz v0, :cond_b

    :goto_7
    const-string v0, "\u06e2\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    mul-int/lit8 v0, v0, -0x43

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x71ad

    const v16, 0x5e51466f

    xor-int v15, v15, v16

    const v16, -0x637f772

    goto/16 :goto_c

    :cond_b
    const-string v0, "\u073f\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0x1469

    const v16, 0x79e99bca

    xor-int v15, v15, v16

    const v16, -0x29f33db6

    goto/16 :goto_c

    :sswitch_13
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v0

    if-nez v0, :cond_c

    :goto_8
    const-string v0, "\u1a7b\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v11, v0

    mul-int/lit8 v0, v0, 0x61

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x2477

    const v16, 0x2054357

    xor-int v15, v15, v16

    const v16, 0x12e0cb6c

    goto/16 :goto_c

    :cond_c
    const-string v0, "\u06e4\u06da"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v11

    mul-int/lit8 v0, v0, -0x6b

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x6b53

    const v16, 0x12556420

    xor-int v15, v15, v16

    const v16, 0xabaf1ec

    goto/16 :goto_c

    :sswitch_14
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 148
    sget v0, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v0, :cond_d

    goto/16 :goto_b

    :cond_d
    const-string v0, "\u1a7b\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x5d

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x784f

    const v16, -0x4420d93d

    xor-int v15, v15, v16

    const v16, 0x302788db

    goto/16 :goto_c

    :sswitch_15
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 238
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v0

    if-eqz v0, :cond_e

    :goto_9
    const-string v0, "\u1a75\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x39

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x670b

    const v16, -0x896cb6b

    xor-int v15, v15, v16

    const v16, 0x2c8b62b0

    goto/16 :goto_c

    :cond_e
    const-string v0, "\u06e2\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    mul-int/lit8 v0, v0, -0x17

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x7e4d

    const v16, -0x56f0eda3

    xor-int v15, v15, v16

    const v16, 0x62aae0cf

    goto :goto_c

    :sswitch_16
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 1
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v0

    if-gtz v0, :cond_f

    :goto_a
    const-string v0, "\u0733\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x1d

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0x3cbb

    const v16, -0x6a80c951

    xor-int v15, v15, v16

    const v16, -0x200e134d

    goto :goto_c

    :cond_f
    const-string v0, "\u06d6\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x54af

    const v16, 0x768450a4

    xor-int v15, v15, v16

    const v16, 0x581a99da

    goto :goto_c

    :sswitch_17
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 219
    sget v0, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v0, :cond_10

    :goto_b
    const-string v0, "\u06eb\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x2d

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0x57a9

    const v16, 0x79ebf718

    xor-int v15, v15, v16

    const v16, 0x258cc50c

    goto :goto_c

    :cond_10
    const-string v0, "\u06dc\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x4e97

    const v16, -0x860f51c

    xor-int v15, v15, v16

    const v16, -0x765e5de4

    :goto_c
    xor-int v0, v0, v16

    move v13, v0

    move v14, v15

    :goto_d
    move/from16 v0, p1

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e064c5a -> :sswitch_4
        -0x74f85cc9 -> :sswitch_14
        -0x71c94fb7 -> :sswitch_e
        -0x6bad4b7a -> :sswitch_0
        -0x6ba05455 -> :sswitch_13
        -0x64e356cc -> :sswitch_a
        -0x648dfc10 -> :sswitch_2
        -0x623ae63b -> :sswitch_10
        -0x58a0ac2f -> :sswitch_16
        -0x54fd7287 -> :sswitch_12
        -0x45e54f6b -> :sswitch_17
        -0x3e88a0bd -> :sswitch_3
        -0x3a43e4fa -> :sswitch_d
        -0x37a7005a -> :sswitch_9
        -0x2e920fbd -> :sswitch_6
        -0x263de143 -> :sswitch_7
        -0x215f29ff -> :sswitch_a
        -0x1c7c59c0 -> :sswitch_c
        -0x1661dc43 -> :sswitch_17
        -0xb388a11 -> :sswitch_8
        -0x758b199 -> :sswitch_13
        -0x3bad0a7 -> :sswitch_b
        0x2449e13 -> :sswitch_4
        0x10fb38b7 -> :sswitch_10
        0x13f78143 -> :sswitch_15
        0x18aef9df -> :sswitch_12
        0x264aa61f -> :sswitch_6
        0x285ccdb6 -> :sswitch_15
        0x2b2a0a9f -> :sswitch_b
        0x3523dd6d -> :sswitch_7
        0x3a0271bb -> :sswitch_14
        0x3db04c32 -> :sswitch_11
        0x3e130df7 -> :sswitch_11
        0x476668c8 -> :sswitch_5
        0x47b191ba -> :sswitch_e
        0x5020d616 -> :sswitch_8
        0x50f8905e -> :sswitch_2
        0x55a54f10 -> :sswitch_3
        0x5645183f -> :sswitch_f
        0x5f37753d -> :sswitch_0
        0x60187461 -> :sswitch_c
        0x621d0cf1 -> :sswitch_16
        0x64545c1e -> :sswitch_f
        0x645f8eee -> :sswitch_1
        0x67e8a713 -> :sswitch_5
        0x6ac8e2d7 -> :sswitch_9
        0x7079489b -> :sswitch_d
        0x7bf53448 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x8e0c640

    sget v5, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v6, Ll/֡᩶;->ۗ֨ܺ:I

    const-string v7, "\u1a77\u06dc"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x29

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x61fd

    const v9, 0x7e4d81af

    xor-int/2addr v8, v9

    const v9, 0x3dbb1596

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, 0x3617

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 9843
    iget-boolean v7, v0, Ll/ۛܳۖ;->۬ܰ:Z

    if-nez v7, :cond_4

    const-string v7, "\u06db\u1a7b"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x46d5

    const v9, 0x163e08d3

    xor-int/2addr v8, v9

    const v9, -0x35c0e815

    goto :goto_0

    .line 5899
    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    sget v7, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v7, :cond_d

    goto/16 :goto_3

    :sswitch_1
    sget v7, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v7, :cond_7

    goto/16 :goto_3

    .line 9451
    :sswitch_2
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v7, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v7, :cond_f

    goto/16 :goto_3

    .line 7671
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    goto/16 :goto_3

    .line 7039
    :sswitch_4
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    return-void

    .line 147
    :sswitch_5
    invoke-virtual {v0}, Ll/ۛܳۖ;->᩺()V

    .line 148
    invoke-virtual {v0}, Ll/ۛܳۖ;->֡ۨ()V

    goto/16 :goto_2

    .line 146
    :sswitch_6
    invoke-virtual {v0, v2, v3}, Ll/ۛܳۖ;->ۙ(II)V

    sget v7, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v7, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v7, "\u0736\u06dc"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x66af

    const v9, 0x29ab7064

    xor-int/2addr v8, v9

    const v9, 0x3be5ee8d

    goto :goto_0

    .line 144
    :sswitch_7
    invoke-static {v0}, Ll/֨ۖ;->ۚܿ֫(Ljava/lang/Object;)I

    move-result v2

    .line 145
    invoke-static {v0}, Ll/֫ۚ;->֫ۛۙ(Ljava/lang/Object;)I

    move-result v3

    .line 1801
    sget v7, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v7, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v7, "\u073d\u1a74"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x55

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7f73

    const v9, 0x5cd32197

    xor-int/2addr v8, v9

    const v9, 0x5f3d193c

    goto/16 :goto_0

    .line 141
    :sswitch_8
    invoke-static {v0}, Ll/֫ۚ;->ۜۗ᩵(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_2

    :cond_2
    const-string v7, "\u06d6\u1a7b"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x3e87

    const v9, 0x55a8c262

    xor-int/2addr v8, v9

    const v9, 0x1a119ae5

    goto/16 :goto_0

    .line 139
    :sswitch_9
    invoke-static {v1}, Ll/֡۠;->ۗۛۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/text/TextWatcher;

    .line 140
    invoke-interface {v7, p1}, Landroid/text/TextWatcher;->afterTextChanged(Landroid/text/Editable;)V

    goto :goto_1

    :sswitch_a
    return-void

    .line 139
    :sswitch_b
    invoke-static {v1}, Ll/֫ۘ;->ۡۘᩴ(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-string v7, "\u06eb\u06e8"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x68d

    const v9, 0x3b3ffb3

    xor-int/2addr v8, v9

    const v9, 0x69a6b6a8

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u06ec\u06db"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x2b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3f3f

    const v9, -0x61a09a0b

    xor-int/2addr v8, v9

    const v9, -0x1f0bee79

    goto/16 :goto_0

    :sswitch_c
    iget-object v1, v0, Ll/ۛܳۖ;->ۙۨ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۘ֡;->֫᩺ܶ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    const-string v7, "\u1a77\u06d9"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x5437

    const v9, 0x317a7e94

    xor-int/2addr v8, v9

    const v9, 0x33f23ddd

    goto/16 :goto_0

    .line 136
    :sswitch_d
    iget-object v0, p0, Ll/۬ۛۖ;->ܺ:Ll/ۛܳۖ;

    invoke-static {v0}, Ll/ۘۛ;->ܶܶۜ(Ljava/lang/Object;)Ll/ۗ֫ۖ;

    move-result-object v7

    if-eq p1, v7, :cond_5

    :cond_4
    :goto_2
    const-string v7, "\u06db\u06d6"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5d01

    const v9, -0x310d57ea

    xor-int/2addr v8, v9

    const v9, 0x59c1c371

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u073f\u1a79"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x4b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x52dd

    const v9, 0x3ccc6a40

    xor-int/2addr v8, v9

    const v9, 0x5271dee0

    goto/16 :goto_0

    .line 3564
    :sswitch_e
    sget v7, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v7, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v7, "\u1a7a\u06e8"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x71a7

    const v9, -0x6e9398a8

    xor-int/2addr v8, v9

    const v9, 0x2e11876e

    goto/16 :goto_0

    .line 8163
    :sswitch_f
    sget v7, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v7, :cond_8

    :cond_7
    const-string v7, "\u06da\u06df"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x2b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x565

    const v9, 0x4e416e16    # 8.113043E8f

    xor-int/2addr v8, v9

    const v9, 0x68e83d4e

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u06e4\u06d9"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x29

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5239

    const v9, -0x10ffc0fa

    xor-int/2addr v8, v9

    const v9, -0x4f9b879f

    goto/16 :goto_0

    :sswitch_10
    sget v7, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v7, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v7, "\u06ec\u0736"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x55

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x37cd

    const v9, 0x2dd3c304

    xor-int/2addr v8, v9

    const v9, -0x4bff0554

    goto/16 :goto_0

    .line 2630
    :sswitch_11
    sget v7, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v7, :cond_a

    :goto_3
    const-string v7, "\u073d\u1a78"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x33fb

    const v9, 0x599052b6

    xor-int/2addr v8, v9

    const v9, 0x3bd61343

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u05a8\u06d7"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x71

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x20bd

    const v9, -0x38c83e82

    xor-int/2addr v8, v9

    const v9, 0x59cc5ecb

    goto/16 :goto_0

    .line 4850
    :sswitch_12
    sget v7, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v7, :cond_b

    goto/16 :goto_6

    :cond_b
    const-string v7, "\u1a76\u06d9"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2b7b

    const v9, -0x6324e4e1

    xor-int/2addr v8, v9

    const v9, 0x4a9ce015    # 5140490.5f

    goto/16 :goto_0

    .line 2721
    :sswitch_13
    sget v7, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v7, :cond_c

    :goto_4
    const-string v7, "\u06d6\u06df"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x51fd

    const v9, 0x7ffc7708

    xor-int/2addr v8, v9

    const v9, 0x101746bb

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06d6\u06d9"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x17

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1101

    const v9, 0x5bc79d40

    xor-int/2addr v8, v9

    const v9, -0x50bc801d

    goto/16 :goto_0

    .line 4651
    :sswitch_14
    sget-boolean v7, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v7, :cond_e

    :cond_d
    :goto_5
    const-string v7, "\u06dc\u06d7"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7631

    const v9, 0x7baf745e

    xor-int/2addr v8, v9

    const v9, 0x71c649c

    goto/16 :goto_0

    :cond_e
    const-string v7, "\u06d7\u06e1"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x7b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x109b

    const v9, -0x3482dd1

    xor-int/2addr v8, v9

    const v9, 0x45532ed3

    goto/16 :goto_0

    .line 1132
    :sswitch_15
    sget v7, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v7, :cond_10

    :cond_f
    :goto_6
    const-string v7, "\u073a\u05ab"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4167

    const v9, -0x7e7cefc0

    xor-int/2addr v8, v9

    const v9, -0x1e751513

    goto/16 :goto_0

    :cond_10
    const-string v7, "\u1a73\u1a74"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x13

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7817

    const v9, -0x7df53964

    xor-int/2addr v8, v9

    const v9, 0x1bef961e

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x799433db -> :sswitch_c
        -0x791cb16b -> :sswitch_e
        -0x652b03d1 -> :sswitch_4
        -0x605003ad -> :sswitch_a
        -0x4fce71e4 -> :sswitch_6
        -0x4eea763b -> :sswitch_0
        -0x44ec9ec9 -> :sswitch_7
        -0x390edc01 -> :sswitch_2
        -0x24015ea2 -> :sswitch_14
        -0x1776042a -> :sswitch_14
        -0x120bca1d -> :sswitch_0
        -0x10ebae17 -> :sswitch_15
        -0x73cf263 -> :sswitch_a
        0xa941628 -> :sswitch_15
        0x130acac9 -> :sswitch_13
        0x14736f23 -> :sswitch_1
        0x1d6674f5 -> :sswitch_1
        0x209ed65b -> :sswitch_b
        0x27a0cbf7 -> :sswitch_12
        0x288ad82f -> :sswitch_5
        0x2b4e834b -> :sswitch_6
        0x2b4ed3e5 -> :sswitch_2
        0x2f5be7b6 -> :sswitch_b
        0x32983076 -> :sswitch_10
        0x336c2620 -> :sswitch_8
        0x37093b89 -> :sswitch_d
        0x3b6a1896 -> :sswitch_10
        0x3d7d6c04 -> :sswitch_d
        0x3e9894e3 -> :sswitch_f
        0x40881aeb -> :sswitch_3
        0x41cd8559 -> :sswitch_3
        0x5222de28 -> :sswitch_9
        0x526b6ab8 -> :sswitch_c
        0x59f00bf2 -> :sswitch_11
        0x5adf4f7d -> :sswitch_11
        0x6375d123 -> :sswitch_e
        0x66baafcf -> :sswitch_7
        0x69e7da56 -> :sswitch_f
        0x6b3ded5c -> :sswitch_8
        0x6c7b3b59 -> :sswitch_13
        0x6da69d87 -> :sswitch_12
        0x75b4f110 -> :sswitch_5
        0x778f4f21 -> :sswitch_4
        0x7ac9bb31 -> :sswitch_9
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x1c4de08

    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    sget v5, Ll/֫ܳ;->᩶ۧۛ:I

    const-string v6, "\u06dc\u1a73"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x756f

    const v8, 0x7076f081

    xor-int/2addr v7, v8

    const v8, 0x121a3392

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x3fe1

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 8
    sget v6, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v6, :cond_c

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v6, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez v6, :cond_e

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    sget v6, Ll/۟;->ۨᩴۛ:I

    if-ltz v6, :cond_b

    goto :goto_1

    .line 31
    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_1

    .line 47
    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    :goto_1
    const-string v6, "\u05a8\u06e0"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x4f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x749

    const v8, 0x50f1529d

    xor-int/2addr v7, v8

    const v8, 0x5fa266ae

    goto :goto_0

    .line 49
    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    return-void

    :sswitch_5
    add-int v6, p2, p3

    .line 62
    invoke-direct {p0, p2, v6, v2}, Ll/۬ۛۖ;->ۙ(IILjava/lang/Class;)V

    goto :goto_2

    :sswitch_6
    add-int/2addr p3, p2

    .line 64
    const-class p1, Landroid/text/style/SuggestionSpan;

    invoke-direct {p0, p2, p3, p1}, Ll/۬ۛۖ;->ۙ(IILjava/lang/Class;)V

    return-void

    .line 55
    :sswitch_7
    invoke-static {v1}, Ll/֡۠;->ۗۛۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/text/TextWatcher;

    .line 56
    invoke-interface {v6, p1, p2, p3, p4}, Landroid/text/TextWatcher;->beforeTextChanged(Ljava/lang/CharSequence;III)V

    goto/16 :goto_3

    .line 57
    :sswitch_8
    invoke-virtual {v0}, Ll/ۛܳۖ;->ۜۙ()I

    move-result v2

    iput v2, p0, Ll/۬ۛۖ;->᩶:I

    .line 58
    invoke-static {v0}, Ll/ۖܽ;->֨ۤۢ(Ljava/lang/Object;)Ll/ۗ֫ۖ;

    move-result-object v2

    invoke-interface {v2}, Ll/֡ܺۖ;->ۤܰ()I

    move-result v2

    iput v2, p0, Ll/۬ۛۖ;->֡:I

    .line 61
    sget-object v2, Ll/۬ۛۖ;->ܽ:Ljava/lang/Class;

    if-eqz v2, :cond_0

    const-string v6, "\u1a73\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0xd

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7a0f

    const v8, 0x4bfa60a3    # 3.2817478E7f

    xor-int/2addr v7, v8

    const v8, -0x11b6277f

    goto/16 :goto_0

    :cond_0
    :goto_2
    const-string v6, "\u0733\u06d8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x9

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x51eb

    const v8, 0xd2397c8

    xor-int/2addr v7, v8

    const v8, 0x6afd60b

    goto/16 :goto_0

    .line 55
    :sswitch_9
    invoke-static {v1}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "\u1a73\u1a74"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x15

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x395f

    const v8, 0x6c843c6d

    xor-int/2addr v7, v8

    const v8, 0x69f5c4ad

    goto/16 :goto_0

    :cond_1
    const-string v6, "\u05ab\u1a7a"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x23

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3841

    const v8, -0x7d338f98

    xor-int/2addr v7, v8

    const v8, 0x2c85ced6

    goto/16 :goto_0

    :sswitch_a
    return-void

    :sswitch_b
    iget-object v1, v0, Ll/ۛܳۖ;->ۙۨ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۗܺ;->֡ۙۚ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    const-string v6, "\u06e8\u06dc"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0xf

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6a75

    const v8, -0x6934d742

    xor-int/2addr v7, v8

    const v8, -0x2cbab5b8

    goto/16 :goto_0

    .line 52
    :sswitch_c
    iget-object v0, p0, Ll/۬ۛۖ;->ܺ:Ll/ۛܳۖ;

    invoke-static {v0}, Ll/ۖܽ;->֨ۤۢ(Ljava/lang/Object;)Ll/ۗ֫ۖ;

    move-result-object v6

    if-eq p1, v6, :cond_2

    const-string v6, "\u06d6\u073d"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3a81

    const v8, 0x552cf3cc

    xor-int/2addr v7, v8

    const v8, 0x263d2af7

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u06e4\u06d6"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x47

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4139

    const v8, -0x72d88928

    xor-int/2addr v7, v8

    const v8, 0x584f1352

    goto/16 :goto_0

    .line 50
    :sswitch_d
    sget v6, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v6, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v6, "\u06db\u1a76"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x29b5

    const v8, -0x59ace957

    xor-int/2addr v7, v8

    const v8, 0x1f2047e9

    goto/16 :goto_0

    .line 42
    :sswitch_e
    sget v6, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v6, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v6, "\u0733\u1a79"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x1d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x47fd

    const v8, 0x6ca26e96

    xor-int/2addr v7, v8

    const v8, -0x69e39d56

    goto/16 :goto_0

    :sswitch_f
    sget v6, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v6, :cond_6

    :cond_5
    const-string v6, "\u06e0\u06d7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4b93

    const v8, -0x6c977edd

    xor-int/2addr v7, v8

    const v8, -0x2902e9df

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u06e1\u06d9"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x45

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x440f

    const v8, 0x1bb46cb4

    xor-int/2addr v7, v8

    const v8, -0x63ba995a

    goto/16 :goto_0

    .line 27
    :sswitch_10
    sget-boolean v6, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v6, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v6, "\u1a7a\u0733"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6c79

    const v8, -0x31b9168a

    xor-int/2addr v7, v8

    const v8, -0x5c7917f

    goto/16 :goto_0

    :sswitch_11
    sget v6, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v6, :cond_8

    goto :goto_4

    :cond_8
    const-string v6, "\u06eb\u1a75"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4881

    const v8, -0xf13f9e

    xor-int/2addr v7, v8

    const v8, 0x25ce146c

    goto/16 :goto_0

    .line 25
    :sswitch_12
    sget v6, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v6, :cond_9

    goto :goto_5

    :cond_9
    const-string v6, "\u06eb\u05ab"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x49cd

    const v8, -0x32ace4eb

    xor-int/2addr v7, v8

    const v8, -0x29e2ad2e

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v6

    if-gtz v6, :cond_a

    :goto_4
    const-string v6, "\u1a78\u06d6"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x697d

    const v8, 0x4554c4a2

    xor-int/2addr v7, v8

    const v8, -0x6bd0f2ad

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06e2\u073a"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x682f

    const v8, -0x2231696f

    xor-int/2addr v7, v8

    const v8, -0x568c0cc0

    goto/16 :goto_0

    :cond_b
    :goto_5
    const-string v6, "\u06dc\u06d8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3423

    const v8, -0x1d5974f2

    xor-int/2addr v7, v8

    const v8, -0x5c0f8dfa

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06d7\u06d9"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x2b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1463

    const v8, 0x75754ba0

    xor-int/2addr v7, v8

    const v8, -0x59c9a90e

    goto/16 :goto_0

    .line 6
    :sswitch_14
    sget-boolean v6, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v6, :cond_d

    goto :goto_6

    :cond_d
    const-string v6, "\u0733\u06db"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x2f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7655

    const v8, 0x5fbd4a1a

    xor-int/2addr v7, v8

    const v8, 0x369c6662

    goto/16 :goto_0

    .line 38
    :sswitch_15
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v6

    if-gtz v6, :cond_f

    :cond_e
    :goto_6
    const-string v6, "\u06e8\u1a75"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x31b9

    const v8, -0x5ba2a66a

    xor-int/2addr v7, v8

    const v8, 0x32bce7d9

    goto/16 :goto_0

    :cond_f
    const-string v6, "\u0733\u06e1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x605b

    const v8, 0x3e670109

    xor-int/2addr v7, v8

    const v8, -0x42e63c87

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f81fb0a -> :sswitch_11
        -0x7f61b82e -> :sswitch_3
        -0x71952784 -> :sswitch_13
        -0x6e585bc1 -> :sswitch_a
        -0x69d10d4e -> :sswitch_12
        -0x5f7e88ec -> :sswitch_d
        -0x5d98a058 -> :sswitch_11
        -0x5a2f2a76 -> :sswitch_10
        -0x3db556c8 -> :sswitch_2
        -0x3343d86d -> :sswitch_f
        -0x32f31d83 -> :sswitch_a
        -0x310008d5 -> :sswitch_10
        -0x272fdceb -> :sswitch_13
        -0x2683df89 -> :sswitch_6
        -0x16d051d9 -> :sswitch_14
        -0x14967e9f -> :sswitch_9
        -0x1485508d -> :sswitch_14
        -0xbee4541 -> :sswitch_c
        -0x8c20fd6 -> :sswitch_4
        -0x6d430d8 -> :sswitch_15
        0x4925c45 -> :sswitch_d
        0x90a459f -> :sswitch_b
        0x108c582f -> :sswitch_e
        0x110a46d5 -> :sswitch_f
        0x1579125c -> :sswitch_12
        0x1a6f0293 -> :sswitch_8
        0x1cebf4c9 -> :sswitch_8
        0x1f1dcbb9 -> :sswitch_5
        0x1faf399e -> :sswitch_5
        0x23a49cf7 -> :sswitch_3
        0x250ef851 -> :sswitch_7
        0x2905ff67 -> :sswitch_0
        0x2ab51cd2 -> :sswitch_e
        0x4228d2ec -> :sswitch_c
        0x426e74e3 -> :sswitch_6
        0x4697c24e -> :sswitch_9
        0x48c1bad7 -> :sswitch_2
        0x4a5b4af8 -> :sswitch_4
        0x4e5b6dcb -> :sswitch_15
        0x52688614 -> :sswitch_b
        0x562f1bc2 -> :sswitch_1
        0x64df9d50 -> :sswitch_1
        0x7c1120f2 -> :sswitch_7
        0x7f1d25a0 -> :sswitch_0
    .end sparse-switch
.end method

.method public final onSpanAdded(Landroid/text/Spannable;Ljava/lang/Object;II)V
    .locals 2

    const p1, -0x4a9d8060

    sget p2, Ll/ۧ;->֫۠ᩴ:I

    sget p3, Ll/֨᩹;->᩻ᩳ֨:I

    const-string p4, "\u1a79\u1a75"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x17

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x774f

    const v1, 0x2362cb23

    xor-int/2addr v0, v1

    const v1, -0x54027138

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p3

    mul-int/lit16 p1, p1, -0x3c69

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    .line 0
    sget p4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz p4, :cond_7

    goto/16 :goto_2

    .line 3
    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    sget-boolean p4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez p4, :cond_9

    goto :goto_1

    .line 1
    :sswitch_1
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result p4

    if-lez p4, :cond_b

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result p4

    if-gez p4, :cond_6

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    :goto_1
    const-string p4, "\u06d9\u06d9"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x57cf

    const v1, 0x524bf2c6

    xor-int/2addr v0, v1

    const v1, -0x60173f05

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    :sswitch_5
    return-void

    .line 4
    :sswitch_6
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result p4

    if-ltz p4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string p4, "\u06eb\u073a"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x619

    const v1, -0x41e4f9c3

    xor-int/2addr v0, v1

    const v1, -0x79fff712

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result p4

    if-ltz p4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string p4, "\u0733\u073f"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x4bd7

    const v1, -0x25423edb

    xor-int/2addr v0, v1

    const v1, -0x44002bd8

    goto :goto_0

    :sswitch_8
    sget-boolean p4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez p4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string p4, "\u06e7\u073a"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x5d

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x680d

    const v1, 0x6b61c983

    xor-int/2addr v0, v1

    const v1, 0x5627c1b7

    goto/16 :goto_0

    :sswitch_9
    sget p4, Ll/֨ۧ;->֫۠֡:I

    if-gtz p4, :cond_3

    goto :goto_2

    :cond_3
    const-string p4, "\u06d7\u073f"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x3f

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x4771

    const v1, 0x5de51e21

    xor-int/2addr v0, v1

    const v1, -0x5dea154d

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget p4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz p4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string p4, "\u073a\u1a75"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x6217

    const v1, 0x244de318

    xor-int/2addr v0, v1

    const v1, 0x64be2faa

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget p4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz p4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string p4, "\u06db\u05a1"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x5b6d

    const v1, 0x369a5c51

    xor-int/2addr v0, v1

    const v1, -0x748c1bf7

    goto/16 :goto_0

    :cond_6
    :goto_2
    const-string p4, "\u05a1\u1a78"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, -0x29

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x5153

    const v1, -0x59730436

    xor-int/2addr v0, v1

    const v1, -0x22fff648

    goto/16 :goto_0

    :cond_7
    const-string p4, "\u073d\u1a75"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, -0x6b

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x7a23

    const v1, -0x19b276fb

    xor-int/2addr v0, v1

    const v1, -0x1fcdc04d

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget p4, Ll/֨ۧ;->֫۠֡:I

    if-gtz p4, :cond_8

    :goto_3
    const-string p4, "\u06d9\u06d8"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x3b

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x265d

    const v1, 0x5dddecc5

    xor-int/2addr v0, v1

    const v1, -0x238c8618

    goto/16 :goto_0

    :cond_8
    const-string p4, "\u06d8\u06e1"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x41

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x1f61

    const v1, 0x49abc937

    xor-int/2addr v0, v1

    const v1, -0xaecfc45

    goto/16 :goto_0

    :sswitch_d
    sget p4, Ll/֨ۧ;->֫۠֡:I

    if-gtz p4, :cond_a

    :cond_9
    :goto_4
    const-string p4, "\u0733\u073a"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, -0x39

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x3259

    const v1, 0x4b173e3d    # 9911869.0f

    xor-int/2addr v0, v1

    const v1, -0x3c641219

    goto/16 :goto_0

    :cond_a
    const-string p4, "\u1a76\u1a74"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, 0x3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x1dff

    const v1, 0x5da03313

    xor-int/2addr v0, v1

    const v1, -0x3a9d4ed8

    goto/16 :goto_0

    :sswitch_e
    sget p4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz p4, :cond_c

    :cond_b
    const-string p4, "\u073d\u06eb"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x1c4f

    const v1, -0x4cac98dd

    xor-int/2addr v0, v1

    const v1, -0x1a1bd970

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u06eb\u06ec"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, -0x69

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x2fc7

    const v1, 0x59cb9fb1

    xor-int/2addr v0, v1

    const v1, 0x7630f0b9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f583e54 -> :sswitch_0
        -0x7dbcb817 -> :sswitch_e
        -0x7447598d -> :sswitch_a
        -0x6f15f847 -> :sswitch_6
        -0x64bcc72a -> :sswitch_e
        -0x5f99f42e -> :sswitch_a
        -0x541e5583 -> :sswitch_1
        -0x45c389e7 -> :sswitch_8
        -0x3f730773 -> :sswitch_7
        -0x3da5cb13 -> :sswitch_d
        -0x3b457c4e -> :sswitch_3
        -0x2e804ba1 -> :sswitch_d
        -0x292a4e6a -> :sswitch_6
        -0x2445d646 -> :sswitch_9
        -0xa7111a4 -> :sswitch_4
        0x1c9baee9 -> :sswitch_9
        0x1eb9783a -> :sswitch_b
        0x20ece7b0 -> :sswitch_4
        0x31036a0b -> :sswitch_3
        0x327d77fe -> :sswitch_0
        0x3307cfd1 -> :sswitch_7
        0x387bd548 -> :sswitch_8
        0x3904292a -> :sswitch_5
        0x44570495 -> :sswitch_c
        0x4b32fc89 -> :sswitch_1
        0x5ae03db5 -> :sswitch_2
        0x5b3b6086 -> :sswitch_5
        0x6e7d0250 -> :sswitch_c
        0x713b6d25 -> :sswitch_b
        0x7bde4e3e -> :sswitch_2
    .end sparse-switch
.end method

.method public final onSpanChanged(Landroid/text/Spannable;Ljava/lang/Object;IIII)V
    .locals 7

    const/4 p3, 0x0

    const/4 p4, 0x0

    const/4 p5, 0x0

    const/4 p6, 0x0

    const v0, 0x4ca8eff3    # 8.85718E7f

    sget v1, Ll/֨ۧ;->֫۠֡:I

    sget v2, Ll/۟;->ۨᩴۛ:I

    const-string v3, "\u1a77\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x40a3

    const v5, -0x7eb9a168

    xor-int/2addr v4, v5

    const v5, 0x298498b2

    :goto_0
    xor-int/2addr v3, v5

    :goto_1
    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3ec5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 164
    sget-object p3, Landroid/text/Selection;->SELECTION_END:Ljava/lang/Object;

    iget-object v3, p0, Ll/۬ۛۖ;->ܺ:Ll/ۛܳۖ;

    if-ne p2, p3, :cond_d

    const-string p3, "\u06db\u06dc"

    invoke-static {p3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p3

    xor-int/2addr p3, v1

    xor-int v4, p3, v2

    mul-int/lit8 v4, v4, -0x11

    const v5, 0x3c000504

    xor-int/2addr v4, v5

    const v5, -0x152f1b85

    xor-int/2addr p3, v5

    move-object v6, v3

    move v3, p3

    move-object p3, v6

    goto :goto_1

    .line 812
    :sswitch_0
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_0

    goto/16 :goto_f

    :cond_0
    const-string v3, "\u0733\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5b4f

    const v5, 0xb426b7c

    xor-int/2addr v4, v5

    const v5, -0x54ee152c

    goto :goto_0

    .line 49
    :sswitch_1
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v3, :cond_19

    goto/16 :goto_f

    :sswitch_2
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v3

    if-eqz v3, :cond_15

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v3

    if-gtz v3, :cond_1

    goto/16 :goto_f

    :cond_1
    const-string v3, "\u06e2\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5989

    const v5, 0x7fda1805

    xor-int/2addr v4, v5

    const v5, 0x21bc6648

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v3

    if-lez v3, :cond_1b

    goto/16 :goto_e

    .line 768
    :sswitch_5
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_2

    goto/16 :goto_c

    :cond_2
    const-string v3, "\u06ec\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x66e1

    const v5, 0x11fbad56

    xor-int/2addr v4, v5

    const v5, -0x1c374e6f

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-eqz v3, :cond_3

    goto/16 :goto_c

    :cond_3
    :goto_2
    const-string v3, "\u06da\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x42b7

    const v5, -0x7d954364

    xor-int/2addr v4, v5

    const v5, -0x569eed14

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v3, :cond_11

    goto/16 :goto_e

    .line 1070
    :sswitch_8
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    goto/16 :goto_e

    :sswitch_9
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    return-void

    .line 192
    :sswitch_a
    iget v3, p4, Ll/᩹ܳۖ;->ۙ:I

    if-nez v3, :cond_7

    goto :goto_3

    .line 193
    :sswitch_b
    invoke-static {p3}, Ll/ۘۧ;->ᩳᩳܺ(Ljava/lang/Object;)V

    goto/16 :goto_6

    .line 188
    :sswitch_c
    iput-boolean p5, p4, Ll/᩹ܳۖ;->ۚ:Z

    goto/16 :goto_4

    :sswitch_d
    if-eqz p4, :cond_4

    const-string v3, "\u1a79\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x11fd

    const v5, 0x134ae1d1

    xor-int/2addr v4, v5

    const v5, -0x4d766661

    goto/16 :goto_0

    :cond_4
    :goto_3
    const-string v3, "\u073d\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x13d9

    const v5, -0x35822a4d

    xor-int/2addr v4, v5

    const v5, 0x7b40e82d

    goto/16 :goto_0

    .line 187
    :sswitch_e
    invoke-static {p1, p2}, Landroid/text/method/MetaKeyKeyListener;->isSelectingMetaTracker(Ljava/lang/CharSequence;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "\u06ec\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3f35

    const v5, -0x4ac53be0

    xor-int/2addr v4, v5

    const v5, -0x2844ef47

    goto/16 :goto_0

    .line 191
    :sswitch_f
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v3

    if-ltz v3, :cond_7

    const-string v3, "\u05a8\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5d8f

    const v5, 0x54aae528

    xor-int/2addr v4, v5

    const v5, 0x45bc0720

    goto/16 :goto_0

    .line 169
    :sswitch_10
    invoke-static {p3}, Ll/ۘۛ;->ܶܶۜ(Ljava/lang/Object;)Ll/ۗ֫ۖ;

    move-result-object v3

    invoke-static {v3}, Ll/֡᩸;->ۛᩳۚ(Ljava/lang/Object;)I

    move-result v3

    if-ne p6, v3, :cond_9

    goto :goto_5

    .line 170
    :sswitch_11
    invoke-virtual {p3}, Ll/ۛܳۖ;->ۗۨ()V

    const/4 v3, 0x0

    .line 1330
    invoke-virtual {p3, v3}, Ll/ۛܳۖ;->ۙ(Z)V

    .line 172
    invoke-static {p3}, Ll/᩶;->ۘ᩶֡(Ljava/lang/Object;)V

    goto/16 :goto_7

    :sswitch_12
    if-eqz p4, :cond_5

    const-string v3, "\u06dc\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4cd3

    const v5, -0x2ff3b20d

    xor-int/2addr v4, v5

    const v5, 0x4c71c518    # 6.337853E7f

    goto/16 :goto_0

    :cond_5
    :goto_4
    const-string v3, "\u06e0\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4cbd

    const v5, 0x111c861d

    xor-int/2addr v4, v5

    const v5, 0x6fa98274

    goto/16 :goto_0

    :sswitch_13
    return-void

    .line 182
    :sswitch_14
    iput-boolean p5, p4, Ll/᩹ܳۖ;->ۖ:Z

    goto/16 :goto_8

    :sswitch_15
    if-eqz p6, :cond_6

    const-string v3, "\u05a1\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x19d3

    const v5, 0x5a3942e8

    xor-int/2addr v4, v5

    const v5, -0x1be6a55c

    goto/16 :goto_0

    :cond_6
    :goto_5
    const-string v3, "\u06ec\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x789f

    const v5, 0x4157026f

    xor-int/2addr v4, v5

    const v5, -0x64b33cd

    goto/16 :goto_0

    .line 174
    :sswitch_16
    invoke-virtual {p3}, Ll/ۛܳۖ;->ۖۖ()V

    goto/16 :goto_b

    .line 186
    :sswitch_17
    invoke-static {p1, p2}, Landroid/text/method/MetaKeyKeyListener;->isMetaTracker(Ljava/lang/CharSequence;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v3, "\u06eb\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1c75

    const v5, -0x60d0f855

    xor-int/2addr v4, v5

    const v5, 0x82ee76c

    goto/16 :goto_0

    :cond_7
    :goto_6
    const-string v3, "\u06ec\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3a7

    const v5, 0x1404d591

    xor-int/2addr v4, v5

    const v5, 0x1b67fd26

    goto/16 :goto_0

    .line 179
    :sswitch_18
    iget v3, p4, Ll/᩹ܳۖ;->ۙ:I

    if-nez v3, :cond_8

    goto/16 :goto_9

    :cond_8
    const-string v3, "\u1a78\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x179b

    const v5, 0x6b035edb

    xor-int/2addr v4, v5

    const v5, -0x59a77bee

    goto/16 :goto_0

    .line 180
    :sswitch_19
    invoke-static {p3}, Ll/᩶;->ۘ᩶֡(Ljava/lang/Object;)V

    goto :goto_8

    .line 165
    :sswitch_1a
    invoke-static {p3}, Ll/֨ۖ;->ۚܿ֫(Ljava/lang/Object;)I

    move-result p6

    .line 166
    invoke-static {p3}, Ll/ۖۧ;->ܳۘ֨(Ljava/lang/Object;)I

    move-result v3

    .line 167
    invoke-virtual {p3, p6, v3}, Ll/ۛܳۖ;->ۙ(II)V

    .line 168
    invoke-virtual {p3}, Ll/ۛܳۖ;->᩺()V

    if-ne p6, v3, :cond_9

    const-string v3, "\u06e1\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4fef

    const v5, -0x6fe72478

    xor-int/2addr v4, v5

    const v5, 0x54d02c0c

    goto/16 :goto_0

    :cond_9
    :goto_7
    const-string v3, "\u073f\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x10c1

    const v5, 0x41ab5f73

    xor-int/2addr v4, v5

    const v5, -0x17312a76

    goto/16 :goto_0

    .line 177
    :sswitch_1b
    instance-of v3, p2, Landroid/text/style/ParagraphStyle;

    if-eqz v3, :cond_a

    goto/16 :goto_a

    :cond_a
    :goto_8
    const-string v3, "\u06e7\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3ee9

    const v5, -0x21bc3d0a

    xor-int/2addr v4, v5

    const v5, 0x2f404131

    goto/16 :goto_0

    :sswitch_1c
    if-eqz p4, :cond_b

    const-string v3, "\u073f\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x637b

    const v5, 0xcecfa41

    xor-int/2addr v4, v5

    const v5, -0x651cfc89

    goto/16 :goto_0

    :cond_b
    :goto_9
    const-string v3, "\u06d8\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6d01

    const v5, 0x57274156

    xor-int/2addr v4, v5

    const v5, 0x2c35efb4

    goto/16 :goto_0

    .line 164
    :sswitch_1d
    invoke-static {p3}, Ll/ۖۧ;->۫ܿۖ(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    const-string v3, "\u06d9\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x188f

    const v5, 0x71106d03

    xor-int/2addr v4, v5

    const v5, -0x7f305106

    goto/16 :goto_0

    .line 176
    :sswitch_1e
    iget-object p4, p3, Ll/ۛܳۖ;->֫ܰ:Ll/᩹ܳۖ;

    .line 177
    instance-of p5, p2, Landroid/text/style/UpdateAppearance;

    const/4 v3, 0x1

    if-nez p5, :cond_c

    const-string p5, "\u073a\u06d6"

    invoke-static {p5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p5

    xor-int/2addr p5, v1

    xor-int v4, p5, v2

    mul-int/lit16 v4, v4, 0x33a7

    const v5, 0x9969b64

    xor-int/2addr v4, v5

    const v5, 0x536ee99b

    xor-int/2addr p5, v5

    move v3, p5

    const/4 p5, 0x1

    goto/16 :goto_1

    :cond_c
    const/4 p5, 0x1

    :goto_a
    const-string v3, "\u0733\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x36c7

    const v5, -0x66623e32

    xor-int/2addr v4, v5

    const v5, 0x5cb37616

    goto/16 :goto_0

    :cond_d
    move-object p3, v3

    :cond_e
    :goto_b
    const-string v3, "\u06dc\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x631b

    const v5, -0x473a5dd4

    xor-int/2addr v4, v5

    const v5, -0x488876da

    goto/16 :goto_0

    :sswitch_1f
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v3

    if-gtz v3, :cond_f

    const-string v3, "\u073a\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x825

    const v5, 0x2a7c2b84

    xor-int/2addr v4, v5

    const v5, 0x167d9dbc

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u1a74\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x66a9

    const v5, 0x67e490fb

    xor-int/2addr v4, v5

    const v5, -0x670287b5

    goto/16 :goto_0

    .line 232
    :sswitch_20
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_10

    goto/16 :goto_f

    :cond_10
    const-string v3, "\u1a74\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x383f

    const v5, -0x6502f068

    xor-int/2addr v4, v5

    const v5, 0x4b933e95    # 1.9299626E7f

    goto/16 :goto_0

    .line 1127
    :sswitch_21
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_12

    :cond_11
    :goto_c
    const-string v3, "\u05a1\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x25bf

    const v5, 0x36df5cb

    xor-int/2addr v4, v5

    const v5, 0x43a5503d

    goto/16 :goto_0

    :cond_12
    const-string v3, "\u06df\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x74f

    const v5, 0x27685a59

    xor-int/2addr v4, v5

    const v5, -0x750ced25

    goto/16 :goto_0

    :sswitch_22
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_13

    goto/16 :goto_f

    :cond_13
    const-string v3, "\u06d7\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x55bb

    const v5, -0x391470ac

    xor-int/2addr v4, v5

    const v5, 0x609a10c9

    goto/16 :goto_0

    .line 1031
    :sswitch_23
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v3

    if-nez v3, :cond_14

    goto :goto_d

    :cond_14
    const-string v3, "\u1a79\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x8e7

    const v5, -0x6986bb28

    xor-int/2addr v4, v5

    const v5, -0x78b2b594

    goto/16 :goto_0

    .line 608
    :sswitch_24
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_16

    :cond_15
    :goto_d
    const-string v3, "\u06d9\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1d6f

    const v5, 0x6f83dd01

    xor-int/2addr v4, v5

    const v5, 0x1c12fb4d

    goto/16 :goto_0

    :cond_16
    const-string v3, "\u06e4\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2107

    const v5, -0x34b25891    # -1.3477743E7f

    xor-int/2addr v4, v5

    const v5, -0x5f543e61

    goto/16 :goto_0

    .line 312
    :sswitch_25
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_17

    :goto_e
    const-string v3, "\u1a78\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4a83

    const v5, -0x1b6da824

    xor-int/2addr v4, v5

    const v5, -0x1c238e71

    goto/16 :goto_0

    :cond_17
    const-string v3, "\u0730\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x8bb

    const v5, 0x16f0d77f

    xor-int/2addr v4, v5

    const v5, -0x376c3359

    goto/16 :goto_0

    .line 1287
    :sswitch_26
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v3

    if-eqz v3, :cond_18

    goto :goto_f

    :cond_18
    const-string v3, "\u06d7\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x835

    const v5, 0x41ff9917

    xor-int/2addr v4, v5

    const v5, -0x75da2143

    goto/16 :goto_0

    .line 735
    :sswitch_27
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_1a

    :cond_19
    const-string v3, "\u06d6\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a3f

    const v5, 0x42882c0

    xor-int/2addr v4, v5

    const v5, -0xf76853d

    goto/16 :goto_0

    :cond_1a
    const-string v3, "\u1a79\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x64f

    const v5, -0x29a7e708

    xor-int/2addr v4, v5

    const v5, 0x63482900

    goto/16 :goto_0

    .line 555
    :sswitch_28
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_1c

    :cond_1b
    :goto_f
    const-string v3, "\u1a79\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6f2d

    const v5, 0x7fd27249

    xor-int/2addr v4, v5

    const v5, 0x6a5f54cb

    goto/16 :goto_0

    :cond_1c
    const-string v3, "\u06d6\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x175f

    const v5, 0x10aa1904

    xor-int/2addr v4, v5

    const v5, 0x3b61540

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e5a396b -> :sswitch_10
        -0x7e0bdac1 -> :sswitch_1f
        -0x7c49b5ae -> :sswitch_14
        -0x799c9cdd -> :sswitch_9
        -0x798bbb3d -> :sswitch_6
        -0x75cbffd0 -> :sswitch_1a
        -0x7093e98c -> :sswitch_1d
        -0x6f9d749a -> :sswitch_7
        -0x6ea1fdea -> :sswitch_1c
        -0x6ce6af0a -> :sswitch_d
        -0x6c7c22fd -> :sswitch_c
        -0x6aca7692 -> :sswitch_2
        -0x69283acc -> :sswitch_1c
        -0x63df41da -> :sswitch_1a
        -0x5d441299 -> :sswitch_8
        -0x5a32f4f5 -> :sswitch_f
        -0x56d0b859 -> :sswitch_26
        -0x52ff62fc -> :sswitch_15
        -0x52491d86 -> :sswitch_22
        -0x516d132e -> :sswitch_4
        -0x429fce7f -> :sswitch_13
        -0x3c181d81 -> :sswitch_14
        -0x324ceb40 -> :sswitch_18
        -0x2989bf22 -> :sswitch_3
        -0x26b909c6 -> :sswitch_0
        -0x25623937 -> :sswitch_28
        -0x24c3328d -> :sswitch_1e
        -0x23eb835d -> :sswitch_15
        -0x23e6d19f -> :sswitch_0
        -0x2289985f -> :sswitch_11
        -0x21de63a3 -> :sswitch_16
        -0x2050c69a -> :sswitch_1e
        -0x1e0f0a70 -> :sswitch_1d
        -0x1da161da -> :sswitch_1b
        -0x1d0b532a -> :sswitch_e
        -0x1d01aaad -> :sswitch_11
        -0x1bc6b82f -> :sswitch_25
        -0x19aeabc5 -> :sswitch_19
        -0x175fe686 -> :sswitch_a
        -0xf8620a1 -> :sswitch_23
        -0xe8d9178 -> :sswitch_c
        -0x9582bff -> :sswitch_b
        0x4f32aeb -> :sswitch_12
        0x526e34f -> :sswitch_21
        0xbdfb07f -> :sswitch_18
        0x154b10a4 -> :sswitch_17
        0x15a2a2cc -> :sswitch_5
        0x172e8258 -> :sswitch_26
        0x1efc267c -> :sswitch_b
        0x2105749b -> :sswitch_1f
        0x2619cc33 -> :sswitch_8
        0x28853c26 -> :sswitch_1
        0x3103794b -> :sswitch_27
        0x314f1856 -> :sswitch_e
        0x317ead00 -> :sswitch_25
        0x36d22629 -> :sswitch_1b
        0x39fb81c0 -> :sswitch_23
        0x3cc031f4 -> :sswitch_a
        0x3d1042f6 -> :sswitch_9
        0x3f32ca3b -> :sswitch_10
        0x40979c16 -> :sswitch_20
        0x40bf4650 -> :sswitch_2
        0x4400931f -> :sswitch_4
        0x4ad93248 -> :sswitch_6
        0x4afc982c -> :sswitch_17
        0x4d2a249e -> :sswitch_22
        0x51bd8a55 -> :sswitch_5
        0x570af91f -> :sswitch_d
        0x57144a8c -> :sswitch_19
        0x578ef602 -> :sswitch_20
        0x5ea54996 -> :sswitch_21
        0x617559ea -> :sswitch_1
        0x63059c91 -> :sswitch_7
        0x660ae6e2 -> :sswitch_27
        0x665c0e11 -> :sswitch_12
        0x695d4a65 -> :sswitch_f
        0x6c046bb4 -> :sswitch_28
        0x6c2fbfc9 -> :sswitch_13
        0x6c79368a -> :sswitch_24
        0x747077fa -> :sswitch_24
        0x76c56a26 -> :sswitch_16
        0x7e7bf96c -> :sswitch_3
    .end sparse-switch
.end method

.method public final onSpanRemoved(Landroid/text/Spannable;Ljava/lang/Object;II)V
    .locals 2

    const p1, 0x16096141

    sget p2, Ll/֫ܽ;->֡ᩴܶ:I

    sget p3, Ll/۟;->ۨᩴۛ:I

    const-string p4, "\u0733\u06e8"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x1353

    const v1, -0x116c07d4

    xor-int/2addr v0, v1

    const v1, 0x71e01e6e

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, -0x3593

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result p4

    if-nez p4, :cond_4

    goto/16 :goto_1

    .line 0
    :sswitch_0
    sget p4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-lez p4, :cond_6

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result p4

    if-lez p4, :cond_3

    goto/16 :goto_4

    :sswitch_2
    sget p4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz p4, :cond_a

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    goto/16 :goto_3

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    :sswitch_5
    return-void

    :sswitch_6
    sget p4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz p4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string p4, "\u06d7\u073f"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x7f8b

    const v1, 0x45b72435

    xor-int/2addr v0, v1

    const v1, -0x6af6f85e

    goto :goto_0

    :sswitch_7
    sget p4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz p4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string p4, "\u06e2\u06eb"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x14b

    const v1, 0x343bcee1

    xor-int/2addr v0, v1

    const v1, -0xa4dceda

    goto :goto_0

    .line 1
    :sswitch_8
    sget p4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz p4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string p4, "\u06dc\u073d"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x707

    const v1, 0x504ccd67

    xor-int/2addr v0, v1

    const v1, -0x6e582f9b

    goto/16 :goto_0

    :cond_3
    :goto_1
    const-string p4, "\u06e8\u06ec"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x7ba5

    const v1, -0x2cc952cb

    xor-int/2addr v0, v1

    const v1, 0xc8e15e2

    goto/16 :goto_0

    :cond_4
    const-string p4, "\u1a7b\u06d9"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x5

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x7175

    const v1, 0x5093879e

    xor-int/2addr v0, v1

    const v1, 0x236368a4

    goto/16 :goto_0

    :sswitch_9
    sget p4, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz p4, :cond_5

    goto :goto_2

    :cond_5
    const-string p4, "\u1a74\u1a76"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x7

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x3e6d

    const v1, -0x5cd9b9d

    xor-int/2addr v0, v1

    const v1, -0x432970e1

    goto/16 :goto_0

    :sswitch_a
    sget-boolean p4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz p4, :cond_7

    :cond_6
    :goto_2
    const-string p4, "\u06d9\u06e7"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x7459

    const v1, -0x424c1a88

    xor-int/2addr v0, v1

    const v1, -0x5a731eb2

    goto/16 :goto_0

    :cond_7
    const-string p4, "\u073d\u073d"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x246f

    const v1, -0x43389024

    xor-int/2addr v0, v1

    const v1, 0x248bb247

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result p4

    if-nez p4, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string p4, "\u06da\u1a7a"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x7

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x16db

    const v1, 0x570f491e

    xor-int/2addr v0, v1

    const v1, -0x33ad9d83    # -5.5151092E7f

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result p4

    if-eqz p4, :cond_9

    :goto_3
    const-string p4, "\u06d7\u1a7b"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, 0x5f

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x397

    const v1, -0x171df43

    xor-int/2addr v0, v1

    const v1, 0x247bb07e

    goto/16 :goto_0

    :cond_9
    const-string p4, "\u1a74\u06ec"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, -0x5f

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x459

    const v1, -0x4a89691e

    xor-int/2addr v0, v1

    const v1, -0x12355118

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget-boolean p4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz p4, :cond_b

    :cond_a
    :goto_4
    const-string p4, "\u05a1\u1a7a"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x28d5

    const v1, 0x7ce0b462

    xor-int/2addr v0, v1

    const v1, -0x23de1bd2

    goto/16 :goto_0

    :cond_b
    const-string p4, "\u05a1\u06eb"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x7d

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x5607

    const v1, 0x3cff5a7c    # 0.031171076f

    xor-int/2addr v0, v1

    const v1, 0x7ba9ce1f

    goto/16 :goto_0

    :sswitch_e
    sget-boolean p4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez p4, :cond_c

    :goto_5
    const-string p4, "\u06d6\u073d"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x23b3

    const v1, 0x5c1f1453

    xor-int/2addr v0, v1

    const v1, -0x4947af2f

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u1a77\u073a"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x53

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x2dc7

    const v1, -0x5a5b9fc3

    xor-int/2addr v0, v1

    const v1, -0xefc6681

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b321dea -> :sswitch_9
        -0x75d55c15 -> :sswitch_0
        -0x46ab364f -> :sswitch_3
        -0x4517964d -> :sswitch_e
        -0x447b52ac -> :sswitch_e
        -0x42647c62 -> :sswitch_4
        -0x370702cb -> :sswitch_b
        -0x347a77e5 -> :sswitch_d
        -0x2368f7de -> :sswitch_c
        -0x18cd4275 -> :sswitch_2
        -0x1110ff38 -> :sswitch_9
        0xda71a9e -> :sswitch_a
        0x268ff0a0 -> :sswitch_2
        0x2fa03a47 -> :sswitch_7
        0x379d59ba -> :sswitch_3
        0x379f6b66 -> :sswitch_6
        0x3bf82d43 -> :sswitch_1
        0x3e58c9dc -> :sswitch_5
        0x3e98a90b -> :sswitch_4
        0x3fd6b840 -> :sswitch_6
        0x449340d4 -> :sswitch_a
        0x44ef76fd -> :sswitch_8
        0x46201d45 -> :sswitch_8
        0x57001d54 -> :sswitch_c
        0x5bc35eab -> :sswitch_7
        0x61faea49 -> :sswitch_d
        0x6b89e07d -> :sswitch_b
        0x6fe86f4f -> :sswitch_1
        0x7cdcded9 -> :sswitch_0
        0x7eb5a987 -> :sswitch_5
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

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

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const v34, 0x776f41a5

    sget v35, Ll/֫;->ܶܺ᩻:I

    sget v36, Ll/֫ܳ;->᩶ۧۛ:I

    const-string v37, "\u06d9\u06eb"

    invoke-static/range {v37 .. v37}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v37

    add-int v37, v37, v35

    mul-int/lit8 v37, v37, -0x13

    xor-int v5, v37, v36

    mul-int/lit16 v5, v5, 0x1cd3

    const v39, 0x75014e8b

    xor-int v5, v5, v39

    const v39, 0x2e401ab1

    xor-int v37, v37, v39

    move-object v10, v9

    move-object/from16 v9, v16

    move-wide/from16 v22, v17

    move-object/from16 v30, v24

    move-wide/from16 v11, v25

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    move-object/from16 v17, v8

    move-object/from16 v25, v14

    move-object/from16 v24, v20

    const/4 v14, 0x0

    move-object v8, v7

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    :goto_0
    xor-int v3, v34, v36

    mul-int/lit16 v3, v3, 0x443f

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v5

    xor-int v34, v37, v3

    sparse-switch v34, :sswitch_data_0

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    sget v0, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v0, :cond_25

    goto/16 :goto_32

    .line 669
    :sswitch_0
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u05ab\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, -0x7001

    const v31, 0x791ceff

    xor-int v5, v5, v31

    const v31, -0xd5aea27

    goto/16 :goto_6

    .line 4002
    :sswitch_1
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v3

    if-gtz v3, :cond_2

    :cond_1
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_35

    :cond_2
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_34

    :sswitch_2
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v3

    if-nez v3, :cond_1

    :cond_3
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_37

    :sswitch_3
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-gez v3, :cond_5

    :cond_4
    :goto_1
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_32

    :cond_5
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_36

    .line 570
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v3, :cond_6

    :goto_2
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_38

    :cond_6
    :goto_3
    const-string v3, "\u073f\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, 0x1969

    const v31, 0x243c6919

    xor-int v5, v5, v31

    const v31, 0x76ef3483

    goto/16 :goto_6

    .line 3306
    :sswitch_5
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_3

    goto :goto_2

    .line 3995
    :sswitch_6
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_1

    :cond_7
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_33

    .line 3073
    :sswitch_7
    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v3, :cond_4

    goto/16 :goto_2

    .line 1470
    :sswitch_8
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    goto/16 :goto_2

    :sswitch_9
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    return-void

    :sswitch_a
    sub-int v1, v14, v2

    .line 9158
    invoke-static {v13, v1}, Ll/֡۠;->ܺ۬ܺ(II)I

    move-result v1

    sub-int v1, v14, v1

    move/from16 v31, v4

    move-object/from16 v5, v30

    goto/16 :goto_a

    :sswitch_b
    if-gez v1, :cond_8

    goto/16 :goto_5

    :cond_8
    move/from16 v28, v1

    move v5, v4

    move-object/from16 v26, v9

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v9, p3

    move/from16 v1, p4

    move/from16 v30, v28

    move/from16 v25, v5

    move-object/from16 v4, p1

    goto/16 :goto_1a

    .line 109
    :sswitch_c
    invoke-virtual {v7, v11, v12}, Ll/֨ۛۖ;->ۙ(J)V

    goto/16 :goto_7

    .line 130
    :sswitch_d
    invoke-virtual {v6, v15}, Ll/ۛܳۖ;->ۜ(I)V

    goto/16 :goto_4

    :sswitch_e
    if-ge v2, v14, :cond_a

    const-string v3, "\u06ec\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, -0x191

    const v31, 0x4b590c6

    xor-int v5, v5, v31

    const v31, -0x6356c079    # -1.1199903E-21f

    goto/16 :goto_6

    :sswitch_f
    if-ltz v4, :cond_b

    const-string v3, "\u06d9\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, 0x58a1

    const v31, 0x4b8a47

    xor-int v5, v5, v31

    const v31, -0x36e262a1

    goto/16 :goto_6

    :sswitch_10
    const/4 v3, -0x1

    .line 9162
    iput v3, v10, Ll/֫ۙۚ;->ۤܰ:I

    iput v3, v10, Ll/֫ۙۚ;->۟ܰ:I

    .line 9163
    invoke-virtual {v6}, Ll/ۛܳۖ;->ܶ()V

    .line 9164
    invoke-static {v6}, Ll/ۘۧ;->ᩳᩳܺ(Ljava/lang/Object;)V

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move/from16 v42, v18

    move-object/from16 v18, v7

    move/from16 v7, v42

    move-wide/from16 v43, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v43

    goto/16 :goto_29

    .line 107
    :sswitch_11
    invoke-virtual {v8}, Ll/۬ܶۚ;->ܰ()J

    move-result-wide v31

    const-wide/16 v37, -0x1

    cmp-long v3, v31, v37

    if-nez v3, :cond_c

    const-string v3, "\u1a75\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v35

    mul-int/lit8 v3, v3, -0x33

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, -0x4165

    const v31, 0x5d249b63

    xor-int v5, v5, v31

    const v31, -0x5210ae83

    goto/16 :goto_6

    .line 129
    :sswitch_12
    iget v3, v0, Ll/۬ۛۖ;->᩶:I

    if-eq v3, v15, :cond_9

    const-string v3, "\u06db\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, -0x33d5

    const v31, -0x32059eb0

    xor-int v5, v5, v31

    const v31, -0x46605ec6

    goto/16 :goto_6

    :cond_9
    :goto_4
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_30

    :sswitch_13
    if-lt v2, v4, :cond_a

    const-string v3, "\u05a1\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, 0x22e5

    const v31, 0x7d813c74

    xor-int v5, v5, v31

    const v31, -0x370fda90    # -491819.5f

    goto :goto_6

    :cond_a
    move/from16 v31, v4

    move-object/from16 v5, v30

    goto/16 :goto_9

    :sswitch_14
    if-eq v4, v1, :cond_b

    const-string v3, "\u073f\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v36, v3

    mul-int/lit8 v3, v3, 0x2f

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, -0x73e9

    const v31, 0x315c4ca1

    xor-int v5, v5, v31

    const v31, 0x1f5b3900

    goto :goto_6

    :cond_b
    :goto_5
    const-string v3, "\u06e4\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v36

    mul-int/lit8 v3, v3, -0x69

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, 0x4d63

    const v31, 0x15c0a649

    xor-int v5, v5, v31

    const v31, -0x1c56836a

    goto :goto_6

    .line 106
    :sswitch_15
    invoke-virtual {v8}, Ll/۬ܶۚ;->֨()Ll/᩷۬ۚ;

    move-result-object v3

    if-ne v9, v3, :cond_c

    const-string v3, "\u06da\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, -0x1b0d

    const v31, 0x763bf17c

    xor-int v5, v5, v31

    const v31, 0x3d2450eb

    :goto_6
    xor-int v37, v3, v31

    goto/16 :goto_0

    :cond_c
    :goto_7
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-wide/from16 v18, v22

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v22, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v23, v8

    move-object v11, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    goto/16 :goto_20

    .line 125
    :sswitch_16
    invoke-virtual {v6}, Ll/ۛܳۖ;->᩵ܰ()Z

    move-result v3

    move-object/from16 v5, v30

    invoke-interface {v5, v3}, Ll/۠ܳۖ;->ۙ(Z)V

    .line 126
    iget-object v3, v6, Ll/ۛܳۖ;->ۘۙ:Ll/۠ܳۖ;

    move/from16 v30, v1

    invoke-virtual {v6}, Ll/ۛܳۖ;->ۡ()Z

    move-result v1

    move/from16 v31, v4

    invoke-virtual {v6}, Ll/ۛܳۖ;->᩵()Z

    move-result v4

    invoke-interface {v3, v1, v4}, Ll/۠ܳۖ;->ۙ(ZZ)V

    move-object/from16 v4, p1

    move/from16 v1, p4

    move-object/from16 v32, v5

    move-object/from16 v33, v24

    move/from16 v5, v26

    move-object/from16 v26, v9

    move/from16 v9, p3

    move/from16 v42, v31

    move-object/from16 v31, v25

    move/from16 v25, v42

    goto/16 :goto_d

    :sswitch_17
    move/from16 v31, v4

    move-object/from16 v5, v30

    move/from16 v30, v1

    .line 128
    invoke-virtual {v6}, Ll/ۛܳۖ;->ۜۙ()I

    move-result v15

    if-nez v29, :cond_d

    const-string v1, "\u06e0\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v36

    xor-int v3, v1, v35

    mul-int/lit16 v3, v3, 0x4cd1

    const v4, 0x3c475c4c

    xor-int/2addr v3, v4

    const v4, 0x583952e3

    goto :goto_8

    :cond_d
    move-object/from16 v4, p1

    move/from16 v1, p4

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move/from16 v10, v18

    move/from16 v3, v21

    move-object/from16 v33, v24

    move/from16 v21, v26

    move/from16 v39, v40

    move-object/from16 v24, v5

    move-object/from16 v26, v9

    move-object/from16 v5, v17

    move/from16 v17, v19

    move/from16 v9, p3

    move/from16 v42, v31

    move-object/from16 v31, v25

    move/from16 v25, v42

    move-wide/from16 v43, v22

    move/from16 v22, v41

    move-wide/from16 v40, v43

    goto/16 :goto_30

    :sswitch_18
    move/from16 v31, v4

    move-object/from16 v5, v30

    move/from16 v30, v1

    if-lez v13, :cond_e

    const-string v1, "\u06e7\u1a73"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    mul-int/lit8 v1, v1, -0x79

    xor-int v3, v1, v36

    mul-int/lit16 v3, v3, -0x3f71

    const v4, 0x22320bcc

    xor-int/2addr v3, v4

    const v4, -0x6618b67f

    :goto_8
    xor-int v37, v1, v4

    move/from16 v1, v30

    move/from16 v4, v31

    goto/16 :goto_b

    :cond_e
    :goto_9
    move v1, v14

    :goto_a
    const-string v3, "\u0733\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v35

    mul-int/lit16 v4, v4, 0x5379

    const v30, -0x700593ca

    xor-int v4, v4, v30

    const v30, 0x379c1316

    xor-int v37, v3, v30

    move-object/from16 v30, v5

    move v5, v4

    move/from16 v4, v31

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v5, v30

    move/from16 v30, v1

    move/from16 v1, p4

    add-int v3, v26, v1

    move/from16 v27, v3

    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v25, v4

    move-object/from16 v24, v5

    move/from16 v5, v26

    move-object/from16 v4, p1

    move-object/from16 v26, v9

    move/from16 v9, p3

    goto/16 :goto_e

    :sswitch_1a
    move-object/from16 v5, v30

    move/from16 v30, v1

    move/from16 v1, p4

    add-int v3, v28, v1

    move/from16 v41, v3

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move/from16 v40, v27

    move/from16 v25, v4

    move-object/from16 v24, v5

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    goto/16 :goto_14

    :sswitch_1b
    move-object/from16 v3, v25

    move-object/from16 v5, v30

    move/from16 v30, v1

    move/from16 v1, p4

    .line 104
    invoke-virtual {v8, v3}, Ll/۬ܶۚ;->ۚ(Ll/֡ܺۖ;)V

    cmp-long v25, v11, v22

    if-ltz v25, :cond_f

    const-string v25, "\u1a7a\u1a77"

    invoke-static/range {v25 .. v25}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v25

    add-int v25, v25, v35

    mul-int/lit8 v25, v25, -0x4f

    move-object/from16 v31, v3

    xor-int v3, v25, v36

    mul-int/lit16 v3, v3, -0x5b7

    const v32, 0x24b4050b

    xor-int v3, v3, v32

    const v32, -0x10613859    # -9.827999E28f

    xor-int v37, v25, v32

    move/from16 v1, v30

    move-object/from16 v25, v31

    :goto_b
    move-object/from16 v30, v5

    goto/16 :goto_c

    :cond_f
    move-object/from16 v31, v3

    move/from16 v25, v4

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v10, v18

    move/from16 v3, v21

    move-object/from16 v33, v24

    move/from16 v21, v26

    move/from16 v39, v40

    move-object/from16 v4, p1

    move-object/from16 v24, v5

    move-object v11, v9

    move-object/from16 v5, v17

    move/from16 v17, v19

    move-wide/from16 v18, v22

    move/from16 v22, v41

    move/from16 v9, p3

    goto/16 :goto_1f

    :sswitch_1c
    move-object/from16 v3, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 119
    invoke-virtual {v3, v4, v2, v9, v1}, Ll/ܺۨۚ;->ܰ(Ljava/lang/CharSequence;III)V

    move-object/from16 v33, v3

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-wide/from16 v10, v22

    move/from16 v39, v40

    move/from16 v22, v41

    move/from16 v21, v5

    goto/16 :goto_1d

    :sswitch_1d
    move-object/from16 v3, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 122
    invoke-static/range {v20 .. v20}, Ll/֡ۛ;->ۨۤ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v32

    move-object/from16 v33, v3

    move-object/from16 v3, v32

    check-cast v3, Landroid/text/TextWatcher;

    .line 123
    invoke-interface {v3, v4, v2, v9, v1}, Landroid/text/TextWatcher;->onTextChanged(Ljava/lang/CharSequence;III)V

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v21, v5

    goto/16 :goto_16

    :sswitch_1e
    move/from16 v30, v1

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move/from16 v1, p4

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    .line 124
    iget-object v3, v6, Ll/ۛܳۖ;->ۘۙ:Ll/۠ܳۖ;

    if-eqz v3, :cond_10

    const-string v24, "\u06dc\u06d7"

    invoke-static/range {v24 .. v24}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v24

    xor-int v24, v24, v35

    move-object/from16 v32, v3

    xor-int v3, v24, v36

    mul-int/lit16 v3, v3, -0xced

    const v37, -0x68324239

    xor-int v3, v3, v37

    const v37, 0x7fc12621

    xor-int v37, v24, v37

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v30, v32

    move-object/from16 v24, v33

    move/from16 v26, v5

    :goto_c
    move v5, v3

    goto/16 :goto_0

    :cond_10
    move-object/from16 v32, v3

    :goto_d
    const-string v3, "\u1a77\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    move-wide/from16 v37, v11

    xor-int v11, v3, v35

    mul-int/lit16 v11, v11, 0x2a8f

    const v12, -0x6617ed2e

    xor-int/2addr v11, v12

    const v12, 0x1d8a270c

    xor-int/2addr v3, v12

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v30, v32

    move-object/from16 v24, v33

    move/from16 v26, v5

    move v5, v11

    goto/16 :goto_12

    :sswitch_1f
    move-object/from16 v4, p1

    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v30, v1

    move-object/from16 v26, v9

    move/from16 v9, p3

    move/from16 v1, p4

    sub-int v3, v21, v2

    .line 9152
    invoke-static {v9, v3}, Ll/֡ۛ;->᩶ۡۖ(II)I

    move-result v3

    sub-int v11, v9, v3

    sub-int v12, v21, v3

    sub-int v3, v18, v3

    move v14, v3

    move v13, v11

    move/from16 v3, v21

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v21, v5

    goto/16 :goto_13

    :sswitch_20
    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    if-ge v2, v5, :cond_11

    const-string v3, "\u1a7b\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v36, v3

    mul-int/lit8 v3, v3, 0x1f

    xor-int v11, v3, v35

    mul-int/lit16 v11, v11, -0x6195

    const v12, -0x152df815

    xor-int/2addr v11, v12

    const v12, 0x7aaf01e9

    goto :goto_f

    :cond_11
    move/from16 v27, v5

    :goto_e
    const-string v3, "\u1a79\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    mul-int/lit8 v3, v3, -0x71

    xor-int v11, v3, v35

    mul-int/lit16 v11, v11, 0x1a9f

    const v12, 0x24f898fb

    xor-int/2addr v11, v12

    const v12, 0x52340deb

    :goto_f
    xor-int/2addr v3, v12

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v26, v5

    move v5, v11

    goto/16 :goto_11

    :sswitch_21
    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v3, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 9176
    iput v3, v10, Ll/֫ۙۚ;->۟ܰ:I

    move/from16 v11, v41

    .line 9177
    iput v11, v10, Ll/֫ۙۚ;->ۤܰ:I

    .line 9178
    invoke-virtual {v6}, Ll/ۛܳۖ;->ܶ()V

    .line 9179
    invoke-static {v6}, Ll/᩶;->ۘ᩶֡(Ljava/lang/Object;)V

    move/from16 v39, v3

    move/from16 v12, v16

    move/from16 v3, v21

    move-wide/from16 v40, v22

    move/from16 v21, v5

    move-object/from16 v23, v8

    move/from16 v22, v11

    move-object/from16 v5, v17

    move/from16 v17, v19

    move/from16 v42, v18

    move-object/from16 v18, v7

    move/from16 v7, v42

    goto/16 :goto_29

    :sswitch_22
    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v3, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 101
    invoke-virtual {v6}, Ll/ۛܳۖ;->᩶ۨ()V

    move/from16 v39, v3

    move-object/from16 v32, v10

    move/from16 v3, v21

    move/from16 v21, v5

    goto/16 :goto_1b

    :sswitch_23
    move-wide/from16 v37, v11

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v3, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 117
    iget-object v12, v6, Ll/ۛܳۖ;->ܰۙ:Ll/ܺۨۚ;

    if-eqz v12, :cond_12

    const-string v32, "\u1a75\u073f"

    invoke-static/range {v32 .. v32}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v32

    add-int v32, v32, v35

    mul-int/lit8 v32, v32, -0x55

    move/from16 v39, v3

    xor-int v3, v32, v36

    mul-int/lit16 v3, v3, 0x317d

    const v33, -0x5b95bab8

    xor-int v3, v3, v33

    const v33, -0x289e1ba3

    xor-int v32, v32, v33

    move/from16 v41, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v26, v5

    move-object/from16 v30, v24

    move v5, v3

    move-object/from16 v24, v12

    move-wide/from16 v11, v37

    move/from16 v37, v32

    goto/16 :goto_0

    :cond_12
    move/from16 v39, v3

    move-object/from16 v32, v10

    move-object/from16 v33, v12

    move/from16 v3, v21

    move/from16 v21, v5

    goto/16 :goto_15

    :sswitch_24
    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 122
    invoke-static/range {v20 .. v20}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    const-string v3, "\u0730\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v12, v3, v35

    mul-int/lit16 v12, v12, -0xb1b

    const v32, 0xb62ca10

    xor-int v12, v12, v32

    const v32, 0x6e901996

    goto :goto_10

    :cond_13
    const-string v3, "\u05ab\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    mul-int/lit8 v3, v3, -0x19

    xor-int v12, v3, v35

    mul-int/lit16 v12, v12, -0x6641

    const v32, -0x4b26021d

    xor-int v12, v12, v32

    const v32, -0x207cca2

    :goto_10
    xor-int v3, v3, v32

    move/from16 v41, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v26, v5

    move v5, v12

    :goto_11
    move-object/from16 v30, v24

    move-object/from16 v24, v33

    :goto_12
    move-wide/from16 v11, v37

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_25
    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    if-ge v2, v3, :cond_14

    const-string v12, "\u06e0\u06e0"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v35

    move/from16 v21, v5

    xor-int v5, v12, v36

    mul-int/lit16 v5, v5, 0x1761

    const v32, 0x1d606e9e

    xor-int v5, v5, v32

    const v32, 0x2f4e0d0d

    xor-int v12, v12, v32

    move/from16 v41, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v26, v21

    move-object/from16 v30, v24

    goto/16 :goto_1c

    :cond_14
    move/from16 v21, v5

    move v12, v3

    move v13, v9

    move/from16 v14, v18

    :goto_13
    const-string v5, "\u0730\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int v5, v5, v35

    mul-int/lit8 v5, v5, 0x65

    move-object/from16 v32, v10

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, -0x6851

    const v25, -0x1c607e1b

    xor-int v10, v10, v25

    const v25, 0x68ae6f4a

    xor-int v5, v5, v25

    move/from16 v41, v11

    move v4, v12

    goto/16 :goto_18

    :sswitch_26
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    if-lez v1, :cond_15

    const-string v5, "\u06e1\u06e1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v35

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, -0x7b67

    const v12, 0x44a56e09

    xor-int/2addr v10, v12

    const v12, 0x365b5a9a

    goto/16 :goto_17

    :cond_15
    move/from16 v40, v21

    move/from16 v41, v28

    :goto_14
    const-string v5, "\u06e1\u06d8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v36, v5

    mul-int/lit8 v5, v5, -0x27

    xor-int v10, v5, v35

    mul-int/lit16 v10, v10, 0x3f0b

    const v11, 0x2e11c781

    xor-int/2addr v10, v11

    const v11, 0x5d8a00b5

    xor-int/2addr v5, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    goto/16 :goto_19

    :sswitch_27
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 9843
    iget-boolean v5, v6, Ll/ۛܳۖ;->۬ܰ:Z

    if-nez v5, :cond_16

    const-string v5, "\u06eb\u06d9"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v36

    mul-int/lit8 v5, v5, 0x41

    xor-int v10, v5, v35

    mul-int/lit16 v10, v10, -0x787b

    const v12, 0x71439915

    xor-int/2addr v10, v12

    const v12, 0x356b0f1a

    goto/16 :goto_17

    :cond_16
    :goto_15
    move-wide/from16 v42, v22

    move/from16 v22, v11

    move-wide/from16 v10, v42

    goto/16 :goto_1d

    :sswitch_28
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 122
    iget-object v5, v6, Ll/ۛܳۖ;->ۙۨ:Ljava/util/ArrayList;

    invoke-static {v5}, Ll/ۘ֡;->֫᩺ܶ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    move-object/from16 v20, v5

    :goto_16
    const-string v5, "\u06e1\u1a7b"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v35

    mul-int/lit8 v5, v5, 0x15

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, -0x5cc1

    const v12, -0x4bb197f

    xor-int/2addr v10, v12

    const v12, -0x4350ef1a

    goto :goto_17

    :sswitch_29
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    if-lez v9, :cond_17

    const-string v5, "\u073f\u06e7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v36, v5

    mul-int/lit8 v5, v5, -0x37

    xor-int v10, v5, v35

    mul-int/lit16 v10, v10, 0x73e9

    const v12, 0x8317243

    xor-int/2addr v10, v12

    const v12, 0x4c5d6692    # 5.8038856E7f

    :goto_17
    xor-int/2addr v5, v12

    move/from16 v41, v11

    move/from16 v4, v25

    :goto_18
    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    move/from16 v40, v39

    :goto_19
    move/from16 v37, v5

    move v5, v10

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v10, v32

    move-object/from16 v24, v33

    move/from16 v21, v3

    goto/16 :goto_0

    :cond_17
    move v5, v3

    move/from16 v28, v18

    :goto_1a
    const-string v10, "\u0730\u06e1"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v35

    xor-int v12, v10, v36

    mul-int/lit16 v12, v12, 0x4313

    const v21, 0x405f825c

    xor-int v12, v12, v21

    const v21, 0x741632ed    # 4.759994E31f

    xor-int v10, v10, v21

    move/from16 v21, v3

    move/from16 v41, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v26, v5

    move v5, v12

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v37, v10

    goto/16 :goto_21

    :sswitch_2a
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 98
    :try_start_0
    iget-object v5, v6, Ll/ۛܳۖ;->ۢܰ:Ll/۫ۧۖ;

    invoke-virtual {v5, v2, v9, v1}, Ll/۫ۧۖ;->ۙ(III)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1b
    const-string v5, "\u06db\u06e2"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v35

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, -0x181

    const v12, -0x5fbc347e

    xor-int/2addr v10, v12

    const v12, -0x2e9a1401

    goto/16 :goto_17

    :catch_0
    const-string v5, "\u1a73\u1a7b"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int v5, v5, v35

    mul-int/lit8 v5, v5, -0x1d

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, -0x5933

    const v12, -0x78861d0f

    xor-int/2addr v10, v12

    const v12, 0x71f669ba

    goto/16 :goto_17

    :sswitch_2b
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 112
    invoke-virtual {v6}, Ll/ۛܳۖ;->ۛ()V

    const/4 v5, 0x0

    .line 1330
    invoke-virtual {v6, v5}, Ll/ۛܳۖ;->ۙ(Z)V

    move v5, v11

    move-wide/from16 v10, v22

    .line 114
    iput-wide v10, v6, Ll/ۛܳۖ;->᩹ۨ:J

    .line 115
    invoke-virtual {v6}, Ll/ۛܳۖ;->ۗۨ()V

    if-nez v29, :cond_18

    const-string v12, "\u06ec\u1a77"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v36

    move/from16 v22, v5

    xor-int v5, v12, v35

    mul-int/lit16 v5, v5, -0x1391

    const v23, 0x3f4f88cb

    xor-int v5, v5, v23

    const v23, -0x6969f47a

    xor-int v12, v12, v23

    move/from16 v41, v22

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move-wide/from16 v22, v10

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v10, v32

    :goto_1c
    move-object/from16 v24, v33

    move/from16 v21, v3

    move-wide/from16 v42, v37

    move/from16 v37, v12

    goto :goto_1e

    :cond_18
    move/from16 v22, v5

    :goto_1d
    const-string v5, "\u1a7b\u06da"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v36

    xor-int v12, v5, v35

    mul-int/lit16 v12, v12, 0xa4b

    const v23, -0x30892dc3

    xor-int v12, v12, v23

    const v23, 0x19351721

    xor-int v5, v5, v23

    move/from16 v41, v22

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move-wide/from16 v22, v10

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v10, v32

    move-object/from16 v24, v33

    move/from16 v21, v3

    move-wide/from16 v42, v37

    move/from16 v37, v5

    move v5, v12

    :goto_1e
    move-wide/from16 v11, v42

    goto/16 :goto_0

    :sswitch_2c
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v12, v19

    move/from16 v3, v21

    move-wide/from16 v10, v22

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v22, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 82
    iput v12, v5, Ll/᩹ܳۖ;->ܰ:I

    move-object/from16 v23, v8

    move-wide/from16 v40, v10

    move/from16 v12, v16

    move/from16 v10, v18

    move-object/from16 v18, v7

    goto/16 :goto_2d

    :sswitch_2d
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v12, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move/from16 v22, v41

    move-wide/from16 v40, v42

    if-le v2, v10, :cond_19

    move-object/from16 v18, v7

    move-object/from16 v23, v8

    move v7, v10

    move/from16 v17, v12

    goto/16 :goto_22

    :cond_19
    const-string v11, "\u1a76\u073a"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    move/from16 v17, v12

    xor-int v12, v11, v36

    mul-int/lit16 v12, v12, -0x477d

    const v18, -0x5946a317

    xor-int v12, v12, v18

    const v18, -0x3aaafb64

    xor-int v11, v11, v18

    move/from16 v18, v10

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-object/from16 v17, v5

    move v5, v12

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move/from16 v21, v3

    goto/16 :goto_31

    :sswitch_2e
    move/from16 v9, p3

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v22, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v4, p1

    move/from16 v1, p4

    .line 93
    invoke-virtual {v8}, Ll/۬ܶۚ;->֨()Ll/᩷۬ۚ;

    move-result-object v11

    .line 95
    invoke-virtual {v8, v2, v9, v1, v4}, Ll/۬ܶۚ;->ۙ(IIILjava/lang/CharSequence;)V

    const-wide/16 v18, 0x0

    if-nez v29, :cond_1a

    const-string v12, "\u06e2\u06ec"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v35

    mul-int/lit8 v12, v12, -0x3d

    move-object/from16 v23, v8

    xor-int v8, v12, v36

    mul-int/lit16 v8, v8, -0xbe3

    const v26, 0x4cd92bfd    # 1.13860584E8f

    xor-int v8, v8, v26

    const v26, -0x22c0c36a

    xor-int v12, v12, v26

    move-object v9, v11

    move/from16 v26, v21

    move/from16 v41, v22

    move/from16 v4, v25

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v21, v3

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move/from16 v42, v17

    move-object/from16 v17, v5

    move v5, v8

    move-object/from16 v8, v23

    move-wide/from16 v22, v18

    move/from16 v18, v10

    move/from16 v19, v42

    move-object/from16 v10, v32

    move-wide/from16 v43, v37

    move/from16 v37, v12

    move-wide/from16 v11, v43

    goto/16 :goto_0

    :cond_1a
    :goto_1f
    move-object/from16 v23, v8

    :goto_20
    const-string v8, "\u06db\u1a79"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v36, v8

    mul-int/lit8 v8, v8, 0x1d

    xor-int v12, v8, v35

    mul-int/lit16 v12, v12, 0x3587

    const v26, -0x5d1fcc41

    xor-int v12, v12, v26

    const v26, 0x50e4a9de

    xor-int v8, v8, v26

    move-object v9, v11

    move/from16 v26, v21

    move/from16 v41, v22

    move/from16 v4, v25

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v21, v3

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move/from16 v42, v17

    move-object/from16 v17, v5

    move v5, v12

    move-wide/from16 v11, v37

    move/from16 v37, v8

    move-object/from16 v8, v23

    move-wide/from16 v22, v18

    move/from16 v18, v10

    move/from16 v19, v42

    :goto_21
    move-object/from16 v10, v32

    goto/16 :goto_0

    :sswitch_2f
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 81
    iput v2, v5, Ll/᩹ܳۖ;->ۨ:I

    move-object/from16 v18, v7

    move/from16 v12, v16

    goto/16 :goto_24

    :sswitch_30
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 82
    iget v8, v5, Ll/᩹ܳۖ;->ܰ:I

    add-int v11, v2, v9

    if-ge v8, v11, :cond_1b

    const-string v8, "\u1a75\u06e7"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v36, v8

    mul-int/lit8 v8, v8, 0x33

    xor-int v12, v8, v35

    mul-int/lit16 v12, v12, -0x3e8f

    const v17, 0x52d4f35c

    xor-int v12, v12, v17

    const v17, 0x38707c12

    xor-int v8, v8, v17

    move-object/from16 v17, v5

    move/from16 v18, v10

    move/from16 v19, v11

    move v5, v12

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-wide/from16 v11, v37

    move/from16 v37, v8

    move/from16 v26, v21

    move-object/from16 v8, v23

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move/from16 v21, v3

    goto/16 :goto_3c

    :cond_1b
    move-object/from16 v17, v5

    move-object/from16 v18, v7

    move/from16 v19, v11

    move/from16 v12, v16

    goto/16 :goto_2d

    :sswitch_31
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    if-ltz v10, :cond_1c

    const-string v8, "\u06e2\u1a73"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v35

    xor-int v11, v8, v36

    mul-int/lit16 v11, v11, 0x98b

    const v12, 0x26ce49ad

    xor-int/2addr v11, v12

    const v12, 0x38e3836b

    xor-int/2addr v8, v12

    move/from16 v18, v10

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-object/from16 v17, v5

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v30, v24

    goto/16 :goto_28

    :cond_1c
    move-object/from16 v18, v7

    move v7, v10

    :goto_22
    move/from16 v12, v16

    goto/16 :goto_25

    :sswitch_32
    move-object/from16 v32, v10

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    const-wide/16 v11, -0x1

    goto :goto_23

    :sswitch_33
    move-object/from16 v32, v10

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 92
    invoke-virtual {v7, v2, v9, v1}, Ll/֨ۛۖ;->ۙ(III)J

    move-result-wide v11

    :goto_23
    const-string v8, "\u06db\u073f"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int v8, v8, v36

    mul-int/lit8 v8, v8, -0x4f

    move-object/from16 v18, v7

    xor-int v7, v8, v35

    mul-int/lit16 v7, v7, 0x3f0f

    const v19, -0x125fda09

    xor-int v7, v7, v19

    const v19, -0x3a02bcd9

    xor-int v37, v8, v19

    move/from16 v19, v17

    move-object/from16 v8, v23

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v17, v5

    goto/16 :goto_2e

    :sswitch_34
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 78
    iput v2, v5, Ll/᩹ܳۖ;->ۨ:I

    add-int v7, v2, v9

    .line 79
    iput v7, v5, Ll/᩹ܳۖ;->ܰ:I

    move/from16 v12, v16

    goto/16 :goto_2c

    :sswitch_35
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    if-le v12, v2, :cond_1d

    const-string v7, "\u06e2\u06e0"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v35

    mul-int/lit8 v7, v7, -0x35

    xor-int v8, v7, v36

    mul-int/lit16 v8, v8, -0x10ef

    const v11, -0x11ceeebb    # -1.3699931E28f

    xor-int/2addr v8, v11

    const v11, 0x504a4ecd

    goto/16 :goto_2b

    :cond_1d
    :goto_24
    const-string v7, "\u1a7a\u0736"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int v7, v7, v36

    mul-int/lit8 v7, v7, -0x49

    xor-int v8, v7, v35

    mul-int/lit16 v8, v8, 0x2c0d

    const v11, 0x30ec7dd3

    xor-int/2addr v8, v11

    const v11, -0x1ccbd5cd

    goto/16 :goto_2b

    :sswitch_36
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    if-ltz v3, :cond_1e

    const-string v7, "\u06d7\u06dc"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v35, v7

    mul-int/lit8 v7, v7, -0x75

    xor-int v8, v7, v36

    mul-int/lit16 v8, v8, 0x6f0b

    const v11, -0x1a77b46a

    xor-int/2addr v8, v11

    const v11, -0x356e08d1    # -4782999.5f

    goto/16 :goto_2b

    :cond_1e
    move v7, v10

    :goto_25
    move-object/from16 v10, v32

    goto/16 :goto_29

    :sswitch_37
    move/from16 v25, v4

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move-object/from16 v4, p1

    move/from16 v30, v1

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 90
    iget v7, v0, Ll/۬ۛۖ;->֡:I

    invoke-virtual {v6, v2, v9, v1, v7}, Ll/ۛܳۖ;->ۙ(IIII)Z

    move-result v29

    .line 91
    iget-object v7, v6, Ll/ۛܳۖ;->᩵ۖ:Ll/۬ۙۚ;

    move-object v8, v4

    check-cast v8, Ll/֡ܺۖ;

    invoke-virtual {v7, v8, v2, v9, v1}, Ll/۬ۙۚ;->ۙ(Ll/֡ܺۖ;III)V

    if-eqz v29, :cond_1f

    const-string v7, "\u06da\u06df"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v35

    mul-int/lit8 v7, v7, 0x17

    xor-int v11, v7, v36

    mul-int/lit16 v11, v11, -0x1613

    const v16, 0x3776e46b

    xor-int v11, v11, v16

    const v16, -0x5ee03fb0

    goto :goto_26

    :cond_1f
    const-string v7, "\u0733\u06d6"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v36

    xor-int v11, v7, v35

    mul-int/lit16 v11, v11, 0x4c83

    const v16, 0x62513eb6

    xor-int v11, v11, v16

    const v16, -0x31375c3c

    :goto_26
    xor-int v7, v7, v16

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v17, v5

    move-object/from16 v25, v8

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v8, v23

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v21, v3

    move/from16 v37, v7

    move-object/from16 v7, v18

    goto/16 :goto_3b

    :sswitch_38
    return-void

    :sswitch_39
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    const/4 v7, 0x1

    .line 76
    iput-boolean v7, v5, Ll/᩹ܳۖ;->ۖ:Z

    .line 77
    iget v7, v5, Ll/᩹ܳۖ;->ۨ:I

    if-gez v7, :cond_20

    const-string v8, "\u0730\u1a77"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v35, v8

    mul-int/lit8 v8, v8, 0x5b

    xor-int v11, v8, v36

    mul-int/lit16 v11, v11, 0x25e9

    const v12, 0x77b56379

    xor-int/2addr v11, v12

    const v12, -0x6784e435

    goto :goto_27

    :cond_20
    const-string v8, "\u073a\u06e4"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int v8, v8, v36

    mul-int/lit8 v8, v8, -0x1b

    xor-int v11, v8, v35

    mul-int/lit16 v11, v11, -0x4eb7

    const v12, 0x609c898b

    xor-int/2addr v11, v12

    const v12, 0x737b520a

    :goto_27
    xor-int/2addr v8, v12

    move/from16 v16, v7

    move/from16 v19, v17

    move-object/from16 v7, v18

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v17, v5

    move/from16 v18, v10

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v10, v32

    :goto_28
    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v21, v3

    move/from16 v37, v8

    move-object/from16 v8, v23

    goto/16 :goto_3c

    :sswitch_3a
    move-object/from16 v18, v7

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v17, v19

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 88
    invoke-virtual {v6}, Ll/ۛܳۖ;->ᩴܰ()V

    .line 9145
    iget-object v10, v6, Ll/ۛܳۖ;->ܳۖ:Ll/֫ۙۚ;

    iget v3, v10, Ll/֫ۙۚ;->۟ܰ:I

    .line 9146
    iget v7, v10, Ll/֫ۙۚ;->ۤܰ:I

    if-eq v3, v7, :cond_21

    const-string v8, "\u06e2\u06e4"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v35

    xor-int v11, v8, v36

    mul-int/lit16 v11, v11, 0x42a3

    const v16, 0x48fbd29e

    xor-int v11, v11, v16

    const v16, -0x5cd86c7a

    goto :goto_2a

    :cond_21
    :goto_29
    const-string v8, "\u1a76\u06e8"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v36

    xor-int v11, v8, v35

    mul-int/lit16 v11, v11, -0x6c8f

    const v16, -0x65ba794d

    xor-int v11, v11, v16

    const v16, -0x14bc5d43

    :goto_2a
    xor-int v8, v8, v16

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v17, v5

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v21, v3

    move/from16 v37, v8

    move-object/from16 v8, v23

    move-object/from16 v42, v18

    move/from16 v18, v7

    move-object/from16 v7, v42

    move-wide/from16 v43, v40

    move/from16 v41, v22

    move/from16 v40, v39

    move-wide/from16 v22, v43

    goto/16 :goto_0

    :sswitch_3b
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 74
    iget-object v5, v6, Ll/ۛܳۖ;->֫ܰ:Ll/᩹ܳۖ;

    if-eqz v5, :cond_22

    const-string v7, "\u1a7b\u1a75"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v35, v7

    mul-int/lit8 v7, v7, -0x4f

    xor-int v8, v7, v36

    mul-int/lit16 v8, v8, -0x77e1

    const v11, -0x7bf845a

    xor-int/2addr v8, v11

    const v11, -0x79f6c657

    :goto_2b
    xor-int/2addr v7, v11

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    move-object/from16 v17, v5

    move/from16 v37, v7

    move v5, v8

    move-object/from16 v7, v18

    move/from16 v26, v21

    move-object/from16 v8, v23

    goto :goto_2f

    :cond_22
    move/from16 v19, v17

    :goto_2c
    move-object/from16 v17, v5

    :goto_2d
    const-string v5, "\u1a79\u06d9"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v35

    mul-int/lit8 v5, v5, -0x3b

    xor-int v7, v5, v36

    mul-int/lit16 v7, v7, -0x7949

    const v8, 0x6d3ab13c

    xor-int/2addr v7, v8

    const v8, -0x7ba33045

    xor-int/2addr v5, v8

    move/from16 v16, v12

    move-object/from16 v8, v23

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    move/from16 v37, v5

    :goto_2e
    move v5, v7

    move-object/from16 v7, v18

    move/from16 v26, v21

    :goto_2f
    move-object/from16 v30, v24

    move-object/from16 v24, v33

    goto/16 :goto_3a

    :sswitch_3c
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 70
    iget-object v6, v0, Ll/۬ۛۖ;->ܺ:Ll/ۛܳۖ;

    iget-object v7, v6, Ll/ۛܳۖ;->֫:Ll/֨ۛۖ;

    iget-object v8, v6, Ll/ۛܳۖ;->ۧۖ:Ll/۬ܶۚ;

    invoke-static {v6}, Ll/ۘۛ;->ܶܶۜ(Ljava/lang/Object;)Ll/ۗ֫ۖ;

    move-result-object v11

    if-eq v4, v11, :cond_23

    :goto_30
    const-string v11, "\u06e7\u06e1"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v36

    xor-int v0, v11, v35

    mul-int/lit16 v0, v0, -0x7385

    const v16, -0xb076424

    xor-int v0, v0, v16

    const v16, 0x275af556

    xor-int v11, v11, v16

    move/from16 v18, v10

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-object/from16 v17, v5

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move v5, v0

    move/from16 v21, v3

    move-object/from16 v0, p0

    :goto_31
    move-wide/from16 v42, v37

    move/from16 v37, v11

    move-wide/from16 v11, v42

    move-wide/from16 v44, v40

    move/from16 v41, v22

    move/from16 v40, v39

    move-wide/from16 v22, v44

    goto/16 :goto_0

    :cond_23
    const-string v0, "\u0736\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v11, v0, v35

    mul-int/lit16 v11, v11, -0x4e67

    const v16, -0x3f9a47b0

    xor-int v11, v11, v16

    const v16, -0x399e860c

    xor-int v0, v0, v16

    move/from16 v18, v10

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-object/from16 v17, v5

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v37, v0

    move/from16 v21, v3

    move-object/from16 v0, p0

    goto/16 :goto_3c

    :sswitch_3d
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 9572
    sget-boolean v0, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v0, :cond_24

    const-string v0, "\u06e2\u1a74"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, 0x709b

    const v8, 0x46deaae

    xor-int/2addr v7, v8

    const v8, 0x3185b8ca

    goto/16 :goto_39

    :cond_24
    const-string v0, "\u1a77\u06d7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x7811

    const v8, 0x636c2f46

    xor-int/2addr v7, v8

    const v8, -0x5c5f0589

    goto/16 :goto_39

    :goto_32
    const-string v0, "\u05ab\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, 0x27

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x73c5

    const v8, -0x7238c4f7

    xor-int/2addr v7, v8

    const v8, -0x70a6f0c

    goto/16 :goto_39

    :cond_25
    const-string v0, "\u1a74\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v36, v0

    mul-int/lit8 v0, v0, -0xf

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, 0x2bb1

    const v8, 0x716ddd1a

    xor-int/2addr v7, v8

    const v8, -0x5412243d

    goto/16 :goto_39

    :sswitch_3e
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    sget v0, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v0, :cond_26

    goto/16 :goto_37

    :cond_26
    const-string v0, "\u06e4\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x2bc9

    const v8, -0x164dc1

    xor-int/2addr v7, v8

    const v8, 0x3a497d71

    goto/16 :goto_39

    :sswitch_3f
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    sget v0, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v0, :cond_27

    :goto_33
    const-string v0, "\u073f\u06d7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v35

    mul-int/lit8 v0, v0, 0xf

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x198f

    const v8, 0x3e6b3d12

    xor-int/2addr v7, v8

    const v8, -0x40fa3388

    goto/16 :goto_39

    :cond_27
    const-string v0, "\u1a7b\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v36, v0

    mul-int/lit8 v0, v0, -0x41

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, 0x5559

    const v8, 0x5a687d4

    xor-int/2addr v7, v8

    const v8, -0x578ad29b

    goto/16 :goto_39

    :sswitch_40
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 3551
    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v0, :cond_28

    :goto_34
    const-string v0, "\u1a75\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x19bf

    const v8, 0x7348bbfe

    xor-int/2addr v7, v8

    const v8, -0x3720c4a4

    goto/16 :goto_39

    :cond_28
    const-string v0, "\u1a73\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v36

    mul-int/lit8 v0, v0, -0x7f

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, 0x5451

    const v8, -0x5105049e

    xor-int/2addr v7, v8

    const v8, -0x5c4dfa2    # -2.42904E35f

    goto/16 :goto_39

    :sswitch_41
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    sget-boolean v0, Ll/᩶;->ۚۤۘ:Z

    if-eqz v0, :cond_29

    :goto_35
    const-string v0, "\u05ab\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, -0x5bab

    const v8, 0x43408b1f

    xor-int/2addr v7, v8

    const v8, -0x26740925

    goto/16 :goto_39

    :cond_29
    const-string v0, "\u06d6\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v35

    mul-int/lit8 v0, v0, -0xb

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x41e9

    const v8, -0x41220735

    xor-int/2addr v7, v8

    const v8, -0x105797c1

    goto/16 :goto_39

    :sswitch_42
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_2a

    :goto_36
    const-string v0, "\u06d8\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    mul-int/lit8 v0, v0, -0x17

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, -0x2831

    const v8, 0xdc68523

    xor-int/2addr v7, v8

    const v8, -0x46734a64

    goto/16 :goto_39

    :cond_2a
    const-string v0, "\u1a7a\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x49c5

    const v8, 0x908d33b

    xor-int/2addr v7, v8

    const v8, 0x3820aec

    goto/16 :goto_39

    :sswitch_43
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 6851
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v0

    if-eqz v0, :cond_2b

    goto :goto_37

    :cond_2b
    const-string v0, "\u1a76\u06d9"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    mul-int/lit8 v0, v0, -0x2b

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, -0x6b8b

    const v8, 0x1acc40c6

    xor-int/2addr v7, v8

    const v8, 0x6afdc494

    goto/16 :goto_39

    :sswitch_44
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 4201
    sget v0, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v0, :cond_2c

    :goto_37
    const-string v0, "\u06e2\u06da"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, 0x499b

    const v8, 0x28165cdb

    xor-int/2addr v7, v8

    const v8, 0x123f235a

    goto/16 :goto_39

    :cond_2c
    const-string v0, "\u06da\u06e0"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v36, v0

    mul-int/lit8 v0, v0, 0x59

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, 0x36d7

    const v8, -0x3c3f047a

    xor-int/2addr v7, v8

    const v8, 0x54ac6f4

    goto :goto_39

    :sswitch_45
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 8092
    sget v0, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v0, :cond_2d

    :goto_38
    const-string v0, "\u1a7b\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x1fc9

    const v8, 0x3b7a1431

    xor-int/2addr v7, v8

    const v8, 0x780015f9

    goto :goto_39

    :cond_2d
    const-string v0, "\u06e8\u1a74"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x1fd

    const v8, -0x218e05de

    xor-int/2addr v7, v8

    const v8, -0x1acb4fa2

    :goto_39
    xor-int/2addr v0, v8

    move/from16 v16, v12

    move/from16 v19, v17

    move-object/from16 v8, v23

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    move/from16 v37, v0

    move-object/from16 v17, v5

    move v5, v7

    move-object/from16 v7, v18

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-object/from16 v0, p0

    :goto_3a
    move/from16 v21, v3

    :goto_3b
    move/from16 v18, v10

    move-object/from16 v10, v32

    :goto_3c
    move-wide/from16 v42, v40

    move/from16 v41, v22

    move/from16 v40, v39

    move-wide/from16 v22, v42

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d317747 -> :sswitch_23
        -0x7a5e13c3 -> :sswitch_1d
        -0x79a26e37 -> :sswitch_12
        -0x790aba23 -> :sswitch_3
        -0x78b5f2e5 -> :sswitch_f
        -0x77c0ddb7 -> :sswitch_c
        -0x74be0978 -> :sswitch_37
        -0x742c0f42 -> :sswitch_34
        -0x6fffad16 -> :sswitch_26
        -0x6fcdfb11 -> :sswitch_25
        -0x6f915bba -> :sswitch_20
        -0x6e26b51f -> :sswitch_e
        -0x6ccdc270 -> :sswitch_9
        -0x6c4c44e2 -> :sswitch_1f
        -0x6c426927 -> :sswitch_3d
        -0x6c41af0a -> :sswitch_19
        -0x6becfbc3 -> :sswitch_1c
        -0x6b3f6c92 -> :sswitch_13
        -0x6a148bb6 -> :sswitch_18
        -0x69fdf70a -> :sswitch_32
        -0x68eac7eb -> :sswitch_2f
        -0x64288714 -> :sswitch_16
        -0x62213f55 -> :sswitch_5
        -0x5f2bf9d8 -> :sswitch_1b
        -0x5c933cd8 -> :sswitch_26
        -0x57e4dc0e -> :sswitch_4
        -0x577afd89 -> :sswitch_13
        -0x575b5184 -> :sswitch_5
        -0x54c9ccd8 -> :sswitch_3f
        -0x5308fd58 -> :sswitch_0
        -0x5195a0fa -> :sswitch_2e
        -0x4e0a91db -> :sswitch_6
        -0x4cf762be -> :sswitch_12
        -0x4849f314 -> :sswitch_18
        -0x4538a5d6 -> :sswitch_11
        -0x41a68ecb -> :sswitch_1e
        -0x3cb3988b -> :sswitch_1
        -0x3976a2c5 -> :sswitch_43
        -0x38a4fe8c -> :sswitch_24
        -0x371aafb9 -> :sswitch_36
        -0x34a7ab45 -> :sswitch_1f
        -0x3394c5df -> :sswitch_38
        -0x2dc805e6 -> :sswitch_1a
        -0x2db2fcf4 -> :sswitch_20
        -0x2d8a16d1 -> :sswitch_3d
        -0x29e47631 -> :sswitch_42
        -0x292c49f4 -> :sswitch_3a
        -0x26cdf102 -> :sswitch_11
        -0x255ac793 -> :sswitch_42
        -0x254bbb4b -> :sswitch_0
        -0x230a16f4 -> :sswitch_2d
        -0x22a94d2f -> :sswitch_40
        -0x20e2b87b -> :sswitch_32
        -0x1ed6fd46 -> :sswitch_3e
        -0x1dada50d -> :sswitch_2c
        -0x1da55636 -> :sswitch_7
        -0x1c0955fe -> :sswitch_28
        -0x184c216b -> :sswitch_2f
        -0x174fdabc -> :sswitch_41
        -0x16f639e6 -> :sswitch_29
        -0x155e19cb -> :sswitch_3a
        -0x1378d5da -> :sswitch_14
        -0x12fa6111 -> :sswitch_3e
        -0x1181f55a -> :sswitch_17
        -0x108db3cf -> :sswitch_15
        -0xf646561 -> :sswitch_35
        -0xdf8c0cd -> :sswitch_28
        -0xb6f71f3 -> :sswitch_2b
        -0xa260ec7 -> :sswitch_1e
        -0x94785bf -> :sswitch_17
        -0x6f11331 -> :sswitch_6
        -0x1fa3a83 -> :sswitch_44
        0x25c7a2 -> :sswitch_19
        0x718a22 -> :sswitch_37
        0x122c564 -> :sswitch_44
        0x36d5348 -> :sswitch_9
        0x5fe7e95 -> :sswitch_41
        0x8891954 -> :sswitch_31
        0x979a21a -> :sswitch_24
        0x98f76da -> :sswitch_22
        0x9d231f1 -> :sswitch_2b
        0xd2162fc -> :sswitch_30
        0xeae5228 -> :sswitch_2e
        0xfeb2e8a -> :sswitch_3b
        0x108933d8 -> :sswitch_d
        0x13893645 -> :sswitch_23
        0x144f240a -> :sswitch_30
        0x14dce0f0 -> :sswitch_31
        0x166b40cc -> :sswitch_3c
        0x16b32687 -> :sswitch_1
        0x181b0035 -> :sswitch_39
        0x1aa1096c -> :sswitch_1c
        0x2140baae -> :sswitch_29
        0x222c55ef -> :sswitch_b
        0x2335e239 -> :sswitch_c
        0x23ed6652 -> :sswitch_2
        0x25f9566a -> :sswitch_33
        0x26ce4a22 -> :sswitch_21
        0x28565f6e -> :sswitch_b
        0x2ce6157f -> :sswitch_e
        0x2ce61b0b -> :sswitch_16
        0x2d508c37 -> :sswitch_3b
        0x318f19c8 -> :sswitch_2c
        0x31dd1494 -> :sswitch_33
        0x3283248c -> :sswitch_f
        0x34fbe29f -> :sswitch_25
        0x3573b52e -> :sswitch_1b
        0x3871c821 -> :sswitch_4
        0x3bc6cbdc -> :sswitch_1d
        0x3c03d479 -> :sswitch_45
        0x3ce00e1b -> :sswitch_27
        0x3d9dc599 -> :sswitch_3
        0x3f783bb0 -> :sswitch_a
        0x4292d746 -> :sswitch_38
        0x42c1c019 -> :sswitch_35
        0x4731ca72 -> :sswitch_36
        0x47a71c02 -> :sswitch_8
        0x47b54481 -> :sswitch_3c
        0x4901bcea -> :sswitch_14
        0x4afd8b14 -> :sswitch_2
        0x50303e8a -> :sswitch_2a
        0x52ae69f6 -> :sswitch_d
        0x5320587c -> :sswitch_39
        0x58e49120 -> :sswitch_22
        0x5efd7a8a -> :sswitch_3f
        0x60e11ccd -> :sswitch_45
        0x63b37ae1 -> :sswitch_40
        0x667623e3 -> :sswitch_10
        0x678c9a0f -> :sswitch_2d
        0x6bd50bed -> :sswitch_10
        0x6d0c9689 -> :sswitch_7
        0x6d23bb22 -> :sswitch_43
        0x73998ea4 -> :sswitch_15
        0x762d8893 -> :sswitch_21
        0x78bf675c -> :sswitch_a
        0x797c275f -> :sswitch_34
        0x7b5fa50c -> :sswitch_8
        0x7b93b262 -> :sswitch_2a
        0x7ce83b9f -> :sswitch_1a
        0x7da7e920 -> :sswitch_27
    .end sparse-switch
.end method

.method public final ۙ(Ll/ۗ֫ۖ;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x4ecf2756

    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    const-string v5, "\u073f\u06e8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6cb3

    const v7, -0x6da165e5

    xor-int/2addr v6, v7

    const v7, -0x5f6e6b56

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x340b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 39
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    sget v5, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v5, :cond_9

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v5, "\u1a74\u1a78"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x27e5

    const v7, -0x3893b54d

    xor-int/2addr v6, v7

    const v7, -0x646587e8

    goto :goto_0

    .line 30
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v5

    if-lez v5, :cond_c

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    goto/16 :goto_2

    .line 18
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    return-void

    .line 44
    :sswitch_4
    invoke-virtual {v1}, Ll/۫ۧۖ;->ܶ()V

    goto :goto_1

    .line 43
    :sswitch_5
    iget-object v1, v0, Ll/ۛܳۖ;->ۢܰ:Ll/۫ۧۖ;

    if-eqz v1, :cond_1

    const-string v5, "\u06d9\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4339

    const v7, 0x3a5c19e0

    xor-int/2addr v6, v7

    const v7, -0x5b9e033d

    goto :goto_0

    :sswitch_6
    return-void

    :sswitch_7
    iget-object v0, p0, Ll/۬ۛۖ;->ܺ:Ll/ۛܳۖ;

    invoke-static {v0}, Ll/ۖܽ;->֨ۤۢ(Ljava/lang/Object;)Ll/ۗ֫ۖ;

    move-result-object v5

    if-ne v5, p1, :cond_1

    const-string v5, "\u073f\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6773

    const v7, 0x74a3fa82

    xor-int/2addr v6, v7

    const v7, -0x9f9e028

    goto :goto_0

    :cond_1
    :goto_1
    const-string v5, "\u06e4\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4319

    const v7, -0x16902091

    xor-int/2addr v6, v7

    const v7, 0x3efa7282

    goto/16 :goto_0

    .line 36
    :sswitch_8
    sget-boolean v5, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u0730\u073f"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2201

    const v7, -0xe2828e5

    xor-int/2addr v6, v7

    const v7, 0x3a4f594

    goto/16 :goto_0

    .line 16
    :sswitch_9
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v5

    if-gtz v5, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v5, "\u06d7\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x51

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2e61

    const v7, 0x2e9e33e4

    xor-int/2addr v6, v7

    const v7, -0x44864012

    goto/16 :goto_0

    .line 14
    :sswitch_a
    sget v5, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v5, :cond_4

    goto :goto_2

    :cond_4
    const-string v5, "\u1a77\u06e0"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x19d9

    const v7, 0x6558f44e

    xor-int/2addr v6, v7

    const v7, -0x44ef04d2

    goto/16 :goto_0

    .line 2
    :sswitch_b
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v5

    if-nez v5, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v5, "\u06dc\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x61

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x51a3

    const v7, -0x49bf0db0

    xor-int/2addr v6, v7

    const v7, 0x1c135fa

    goto/16 :goto_0

    .line 9
    :sswitch_c
    sget v5, Ll/֫;->ܶܺ᩻:I

    if-ltz v5, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v5, "\u06d8\u05a1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3215

    const v7, -0x6f4d4c8d

    xor-int/2addr v6, v7

    const v7, -0x42e39c1f

    goto/16 :goto_0

    .line 43
    :sswitch_d
    sget v5, Ll/֫;->ܶܺ᩻:I

    if-ltz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u06e0\u06dc"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x464d

    const v7, -0x78032cd2

    xor-int/2addr v6, v7

    const v7, -0x519d5c8e

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v5

    if-eqz v5, :cond_8

    :goto_2
    const-string v5, "\u06dc\u06d6"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x432b

    const v7, 0x738eed0d

    xor-int/2addr v6, v7

    const v7, 0x6bcb8a02

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06da\u06ec"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x13f

    const v7, 0x9f7baf1

    xor-int/2addr v6, v7

    const v7, 0x969aa10

    goto/16 :goto_0

    .line 10
    :sswitch_f
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v5

    if-eqz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u06e7\u06df"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x819

    const v7, -0xfd4b526

    xor-int/2addr v6, v7

    const v7, 0x347436ee

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u0733\u0733"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3353

    const v7, -0x6ea5fe0d

    xor-int/2addr v6, v7

    const v7, 0x72354c5b

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v5

    if-ltz v5, :cond_b

    :goto_4
    const-string v5, "\u1a75\u05ab"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3f6b

    const v7, 0x27990109

    xor-int/2addr v6, v7

    const v7, 0x7621302c

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u05a8\u06e8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4c69

    const v7, -0x5ad0a32a

    xor-int/2addr v6, v7

    const v7, -0xbb5a7de

    goto/16 :goto_0

    .line 1
    :sswitch_11
    sget v5, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u0733\u06e0"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x47

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7813

    const v7, -0x73ccbea6

    xor-int/2addr v6, v7

    const v7, -0x234577f9

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u073f\u073d"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4165

    const v7, -0x424ebe9f

    xor-int/2addr v6, v7

    const v7, -0x62c9e971

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x704c95c7 -> :sswitch_d
        -0x68e28e1a -> :sswitch_b
        -0x67fa18c9 -> :sswitch_3
        -0x621d831d -> :sswitch_e
        -0x5e04cef4 -> :sswitch_8
        -0x5d783fee -> :sswitch_b
        -0x59863af6 -> :sswitch_8
        -0x48dba004 -> :sswitch_9
        -0x48db5a73 -> :sswitch_0
        -0x450357a5 -> :sswitch_11
        -0x363fda6e -> :sswitch_5
        -0x3584c1fd -> :sswitch_6
        -0x245cc312 -> :sswitch_2
        -0x1d9c73bc -> :sswitch_10
        -0x142e6ba8 -> :sswitch_f
        -0xe8f4c62 -> :sswitch_2
        0x2885a9 -> :sswitch_7
        0x155c717 -> :sswitch_6
        0x7c6d121 -> :sswitch_a
        0xa4a2eff -> :sswitch_4
        0xee4e998 -> :sswitch_a
        0x16248a82 -> :sswitch_c
        0x16f20b78 -> :sswitch_d
        0x172c7336 -> :sswitch_e
        0x19d12e7d -> :sswitch_5
        0x1c3f69a1 -> :sswitch_7
        0x39b311b1 -> :sswitch_11
        0x41b5ae56 -> :sswitch_c
        0x4bb6f13c -> :sswitch_4
        0x54c416bf -> :sswitch_9
        0x69b973c0 -> :sswitch_0
        0x69e1ccfc -> :sswitch_f
        0x6e2e5a35 -> :sswitch_1
        0x72e12789 -> :sswitch_10
        0x744ee044 -> :sswitch_1
        0x74502b42 -> :sswitch_3
    .end sparse-switch
.end method

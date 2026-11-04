.class public final Ll/ۘ۫ܳ;
.super Ljava/lang/Object;
.source "970R"

# interfaces
.implements Ll/ܺ۫ܳ;


# static fields
.field private static final ᩶ᩳ᩸:[S


# instance fields
.field public final ۙ:I

.field public final ۤ:Ll/᩵۫ܳ;

.field public final ᩷:I

.field public final ᩸:Ll/֡۫ܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۘ۫ܳ;->᩶ᩳ᩸:[S

    return-void

    :array_0
    .array-data 2
        0x16eds
        0x4720s
        0x4707s
        0x471fs
        0x4708s
        0x4705s
        0x4700s
        0x470ds
        0x4749s
        0x4719s
        0x4708s
        0x471ds
        0x471ds
        0x470cs
        0x471bs
        0x4707s
        0x4749s
        0x4719s
        0x4708s
        0x471ds
        0x470as
        0x4701s
        0x4749s
        0x4705s
        0x4708s
        0x4710s
        0x470cs
        0x471bs
        0x1f20s
        0x206bs
        0x2043s
        0x205es
        0x205as
        0x2057s
        0x200es
        0x2048s
        0x2047s
        0x2042s
        0x205as
        0x204bs
        0x205cs
        0x204bs
        0x204as
        0x200es
        0x205es
        0x204fs
        0x205as
        0x205as
        0x204bs
        0x205cs
        0x2040s
        0x200es
        0x205es
        0x204fs
        0x205as
        0x204ds
        0x2046s
        0x200es
        0x2042s
        0x204fs
        0x2057s
        0x204bs
        0x205cs
    .end array-data
.end method

.method public constructor <init>(Ll/᩵۫ܳ;Ll/֡۫ܳ;II)V
    .locals 8

    const v0, -0x881e519

    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    sget v2, Ll/֡ۖ;->۫ۙ᩶:I

    sget-object v3, Ll/ۘ۫ܳ;->᩶ᩳ᩸:[S

    const/4 v4, 0x0

    aget-short v3, v3, v4

    add-int/lit16 v4, v3, 0x3e3b

    mul-int v4, v4, v4

    mul-int v3, v3, v3

    const v5, 0xf20a199

    add-int/2addr v3, v5

    add-int/2addr v3, v3

    sub-int/2addr v4, v3

    if-gtz v4, :cond_0

    const/16 v3, 0x4769

    goto :goto_0

    :cond_0
    const v3, 0xe191

    .line 843
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06e1\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3509

    const v6, -0x6e7de530

    xor-int/2addr v5, v6

    const v6, -0x7a08aab

    :goto_1
    xor-int/2addr v4, v6

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x72f7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v5

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_0

    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-gez v4, :cond_4

    goto/16 :goto_3

    .line 707
    :sswitch_0
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v4, :cond_9

    goto/16 :goto_3

    .line 457
    :sswitch_1
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u0733\u06e1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    mul-int/lit8 v4, v4, -0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5919

    const v6, 0x1bb664c3

    xor-int/2addr v5, v6

    const v6, -0x5aae7657

    goto :goto_1

    .line 367
    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    goto/16 :goto_3

    .line 699
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 849
    :sswitch_4
    iput p3, p0, Ll/ۘ۫ܳ;->᩷:I

    .line 850
    iput p4, p0, Ll/ۘ۫ܳ;->ۙ:I

    return-void

    .line 847
    :sswitch_5
    iput-object p1, p0, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    .line 848
    iput-object p2, p0, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    .line 540
    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u06ec\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x27

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, 0x5aa1

    const v6, -0x231c0b4b

    xor-int/2addr v5, v6

    const v6, -0x1c758924

    goto :goto_1

    :sswitch_6
    if-ge p3, p4, :cond_e

    const-string v4, "\u06da\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v1

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x635f

    const v6, 0x6fb5d7db

    xor-int/2addr v5, v6

    const v6, -0x4455f40b

    goto/16 :goto_1

    .line 845
    :sswitch_7
    new-instance v4, Ljava/lang/IllegalArgumentException;

    sget-object v5, Ll/ۘ۫ܳ;->᩶ᩳ᩸:[S

    .line 121
    sget v6, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v6, :cond_3

    goto :goto_4

    :cond_3
    sget v6, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v6, :cond_5

    :cond_4
    const-string v4, "\u06e1\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6e71

    const v6, -0x11116c80

    xor-int/2addr v5, v6

    const v6, -0x4c6a3a7e

    goto/16 :goto_1

    .line 158
    :cond_5
    sget v6, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v6, :cond_6

    goto :goto_3

    .line 92
    :cond_6
    sget v6, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v6, :cond_7

    goto :goto_2

    :cond_7
    sget-boolean v6, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v6, :cond_8

    goto :goto_2

    .line 297
    :cond_8
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v6

    if-eqz v6, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u1a7a\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, -0x5a3f

    const v6, 0x6d509bf3

    xor-int/2addr v5, v6

    const v6, -0x2677d8c0

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v6

    if-gtz v6, :cond_b

    :goto_3
    const-string v4, "\u1a77\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, -0x2ced

    const v6, -0x4004d79d    # -1.96217f

    xor-int/2addr v5, v6

    const v6, 0x2df53d9a

    goto/16 :goto_1

    .line 586
    :cond_b
    sget-boolean v6, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v6, :cond_c

    goto :goto_4

    :cond_c
    const/4 v6, 0x1

    .line 192
    sget-boolean v7, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v7, :cond_d

    :goto_4
    const-string v4, "\u06da\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3547

    const v6, 0x6441e11

    xor-int/2addr v5, v6

    const v6, 0x5261123f

    goto/16 :goto_1

    :cond_d
    const/16 p1, 0x1b

    .line 845
    invoke-static {v5, v6, p1, v3}, Ll/۬;->ۜᩴ֡([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 844
    :sswitch_8
    invoke-virtual {p2}, Ll/֡۫ܳ;->ۤ()I

    move-result v4

    if-eqz v4, :cond_e

    const-string v4, "\u06da\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, -0x3773

    const v6, -0x33abf7f8    # -5.558275E7f

    xor-int/2addr v5, v6

    const v6, 0x7594a0f1

    goto/16 :goto_1

    :cond_e
    const-string v4, "\u1a79\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x72eb

    const v6, -0x6603cfe

    xor-int/2addr v5, v6

    const v6, 0x1b5233ff

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x65f24241 -> :sswitch_8
        -0x5437096b -> :sswitch_8
        -0x431d6cd7 -> :sswitch_4
        -0x2e38c15f -> :sswitch_2
        -0x2d1d636e -> :sswitch_0
        -0x131f03d4 -> :sswitch_1
        -0x12b16cf2 -> :sswitch_2
        0x60ecdb2 -> :sswitch_5
        0x87cc6ba -> :sswitch_5
        0xaaaf93c -> :sswitch_6
        0x1b520304 -> :sswitch_3
        0x1e29540b -> :sswitch_7
        0x29e8fb77 -> :sswitch_3
        0x3033ee23 -> :sswitch_0
        0x4a621c34 -> :sswitch_4
        0x4a62d22e -> :sswitch_1
        0x614e2711 -> :sswitch_7
        0x718a8672 -> :sswitch_6
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/ۘ۫ܳ;)Ll/᩵۫ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    return-object p0
.end method

.method public static synthetic ۙ(Ll/ۘ۫ܳ;II[BIII)V
    .locals 15

    move/from16 v0, p6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x9918828

    sget v5, Ll/֡ۢ;->۟֡᩻:I

    sget v6, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v7, "\u1a74\u1a73"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x75f1

    const v9, -0x1092dbea

    xor-int/2addr v8, v9

    const v9, -0x49e39d48

    :goto_0
    xor-int/2addr v7, v9

    :goto_1
    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, -0xd4d

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 171
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v9

    if-nez v9, :cond_8

    goto/16 :goto_6

    .line 301
    :sswitch_0
    sget v7, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v7, :cond_1

    :cond_0
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    goto/16 :goto_5

    :cond_1
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    goto/16 :goto_7

    :sswitch_1
    sget v7, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v7, :cond_0

    goto :goto_3

    .line 428
    :sswitch_2
    sget v7, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v7, :cond_2

    :goto_2
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    goto/16 :goto_6

    :cond_2
    :goto_3
    const-string v7, "\u06ec\u06da"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x3

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0xe75

    const v9, 0x6a4284ee

    xor-int/2addr v8, v9

    const v9, -0x33b9357f    # -5.2111876E7f

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    goto :goto_2

    .line 667
    :sswitch_4
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    return-void

    .line 882
    :sswitch_5
    invoke-static {v2}, Ll/᩵۫ܳ;->ۙ(Ll/᩵۫ܳ;)[B

    move-result-object v7

    sub-int v8, v1, v0

    add-int v9, p4, v1

    sub-int v9, v9, p5

    sub-int v10, v3, v1

    move-object/from16 v11, p3

    invoke-static {v7, v8, v11, v9, v10}, Ll/ۖܰ;->ܰ֨᩵(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v10, p0

    move/from16 v7, p2

    goto :goto_4

    :sswitch_6
    return-void

    :sswitch_7
    move/from16 v7, p2

    move-object/from16 v11, p3

    int-to-long v2, v7

    int-to-long v8, v0

    move-object v10, p0

    .line 879
    iget-object v12, v10, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    .line 880
    invoke-virtual {v12}, Ll/᩵۫ܳ;->᩷()I

    move-result v13

    int-to-long v13, v13

    add-long/2addr v8, v13

    .line 879
    invoke-static {v2, v3, v8, v9}, Ll/ۖۜ;->ᩳۢۧ(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    if-ge v1, v3, :cond_3

    const-string v2, "\u06e4\u06db"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v6

    xor-int v8, v2, v5

    mul-int/lit16 v8, v8, 0x605b

    const v9, 0xc091011

    xor-int/2addr v8, v9

    const v9, -0x2971fe59

    xor-int/2addr v2, v9

    move v7, v2

    move-object v2, v12

    goto/16 :goto_1

    :cond_3
    move-object v2, v12

    :goto_4
    const-string v8, "\u06e0\u1a79"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v5

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x9ed

    const v12, -0x2a8735d7

    xor-int/2addr v9, v12

    const v12, -0x5cc6b937

    xor-int/2addr v8, v12

    move v7, v8

    move v8, v9

    goto/16 :goto_1

    :sswitch_8
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 878
    invoke-static {v8, v0}, Ll/ۖ֡;->ܰۜ۬(II)I

    move-result v1

    .line 164
    sget v9, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v9, :cond_4

    const-string v9, "\u06dc\u073f"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0x7fb3

    const v13, -0x11512090

    xor-int/2addr v12, v13

    const v13, 0x1436d662

    goto/16 :goto_8

    :cond_4
    const-string v9, "\u06e2\u05a1"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0x6fd3

    const v13, 0x117a7881

    xor-int/2addr v12, v13

    const v13, 0x8ae0ce0

    goto/16 :goto_8

    :sswitch_9
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 12
    sget v9, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v9, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v9, "\u06e4\u073a"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v5

    mul-int/lit8 v9, v9, 0x79

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, 0x3213

    const v13, 0x349957f3

    xor-int/2addr v12, v13

    const v13, 0x2422f9ac

    goto/16 :goto_8

    :sswitch_a
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 112
    sget v9, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v9, :cond_6

    goto :goto_5

    :cond_6
    const-string v9, "\u1a79\u06d6"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, -0x2d77

    const v13, 0x7ba5a8e0

    xor-int/2addr v12, v13

    const v13, -0xa992723

    goto/16 :goto_8

    :sswitch_b
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 804
    sget v9, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v9, :cond_7

    :goto_5
    const-string v9, "\u06d6\u1a78"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, 0x12ef

    const v13, -0x566e4b35

    xor-int/2addr v12, v13

    const v13, -0x75d38b32

    goto/16 :goto_8

    :cond_7
    const-string v9, "\u073f\u06dc"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0xb55

    const v13, 0x7e27b04f

    xor-int/2addr v12, v13

    const v13, -0x257d8f12

    goto/16 :goto_8

    :cond_8
    const-string v9, "\u0733\u06d9"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, -0x2d9d

    const v13, -0x79bf716f

    xor-int/2addr v12, v13

    const v13, -0x5fe0e6f9

    goto/16 :goto_8

    :sswitch_c
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 554
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v9

    if-gtz v9, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v9, "\u06db\u06db"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    mul-int/lit8 v9, v9, -0xb

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, 0x32d1

    const v13, 0x495fcd83

    xor-int/2addr v12, v13

    const v13, 0x12cb2101

    goto/16 :goto_8

    :sswitch_d
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 495
    sget v9, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v9, :cond_a

    goto :goto_6

    :cond_a
    const-string v9, "\u1a79\u06ec"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, 0x3019

    const v13, -0x215411ef

    xor-int/2addr v12, v13

    const v13, 0x69d9ceff

    goto/16 :goto_8

    :sswitch_e
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 845
    sget v9, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v9, :cond_b

    :goto_6
    const-string v9, "\u073f\u1a75"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v6, v9

    mul-int/lit8 v9, v9, -0x75

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, 0x49b3

    const v13, 0x21fe7ada

    xor-int/2addr v12, v13

    const v13, 0x298fa866

    goto :goto_8

    :cond_b
    const-string v9, "\u06da\u06da"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    mul-int/lit8 v9, v9, 0x5b

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, 0x603

    const v13, 0x31c8f4bf

    xor-int/2addr v12, v13

    const v13, 0x79d1fcbe

    goto :goto_8

    :sswitch_f
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    sget v9, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v9, :cond_c

    goto :goto_7

    :cond_c
    const-string v9, "\u06da\u073f"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, 0x1dbf

    const v13, -0x424f432a

    xor-int/2addr v12, v13

    const v13, 0x50a94807

    goto :goto_8

    :sswitch_10
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 255
    sget v9, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v9, :cond_d

    :goto_7
    const-string v9, "\u1a74\u06e7"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, -0x4955

    const v13, -0x57ac89e7

    xor-int/2addr v12, v13

    const v13, -0x34f53278    # -9096584.0f

    goto :goto_8

    :cond_d
    const-string v9, "\u1a77\u0736"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v5, v9

    mul-int/lit8 v9, v9, -0x3

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, -0x6917

    const v13, -0x29846073

    xor-int/2addr v12, v13

    const v13, 0xcad1aa4

    :goto_8
    xor-int/2addr v9, v13

    move v7, v9

    move v8, v12

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7c5f2df8 -> :sswitch_10
        -0x75f28c3f -> :sswitch_c
        -0x7154f9fb -> :sswitch_8
        -0x6d045e38 -> :sswitch_3
        -0x6a5ffe32 -> :sswitch_b
        -0x6979a861 -> :sswitch_6
        -0x6786ba4c -> :sswitch_6
        -0x50bef137 -> :sswitch_f
        -0x4b202434 -> :sswitch_2
        -0x4a753efc -> :sswitch_b
        -0x48c2df12 -> :sswitch_7
        -0x430b42d2 -> :sswitch_10
        -0x3f25e291 -> :sswitch_9
        -0x3946549e -> :sswitch_e
        -0x388bfc27 -> :sswitch_1
        -0x1b8e290d -> :sswitch_a
        -0x17826350 -> :sswitch_5
        -0x8b1589c -> :sswitch_2
        -0x84046b3 -> :sswitch_0
        -0x77a0d3f -> :sswitch_4
        -0x149f64c -> :sswitch_1
        0x12ca4848 -> :sswitch_4
        0x207cd9cb -> :sswitch_d
        0x2ac54ce1 -> :sswitch_0
        0x365d977f -> :sswitch_7
        0x4c052951 -> :sswitch_8
        0x4d415865 -> :sswitch_3
        0x4decf169 -> :sswitch_5
        0x5264acd4 -> :sswitch_f
        0x5729b40c -> :sswitch_c
        0x6323a56b -> :sswitch_d
        0x6d831afa -> :sswitch_a
        0x6e5ad2c2 -> :sswitch_e
        0x78cfeded -> :sswitch_9
    .end sparse-switch
.end method

.method public static synthetic ۙ(Ll/ۘ۫ܳ;II[BI[JI)V
    .locals 21

    move/from16 v0, p6

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, -0x5607f0c6

    sget v12, Ll/ۖۙ;->ۤۧۤ:I

    sget v13, Ll/֫۠;->ۢᩴ᩺:I

    const-string v14, "\u06ec\u05a1"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x5

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x68d9

    const v16, 0x42a6e53

    xor-int v15, v15, v16

    const v16, -0x2ee16b09

    :goto_0
    xor-int v14, v14, v16

    :goto_1
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, -0x51eb

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move/from16 v1, p1

    move-object/from16 v14, p3

    move-object/from16 v15, p5

    .line 909
    invoke-static {v1, v0}, Ll/ۖ֡;->ܰۜ۬(II)I

    move-result v2

    move/from16 v3, p2

    int-to-long v4, v3

    int-to-long v6, v0

    move-object/from16 v0, p0

    .line 910
    iget-object v1, v0, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    .line 911
    invoke-virtual {v1}, Ll/᩵۫ܳ;->᩷()I

    move-result v16

    .line 756
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v17

    if-gtz v17, :cond_4

    move-wide/from16 v19, v6

    move-object v6, v1

    move v1, v2

    move-wide v2, v4

    move-wide/from16 v4, v19

    move/from16 v7, v16

    goto/16 :goto_7

    .line 543
    :sswitch_0
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    sget-boolean v14, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-nez v14, :cond_1

    :cond_0
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    goto/16 :goto_5

    :cond_1
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    :goto_2
    move/from16 v17, v1

    goto/16 :goto_8

    .line 607
    :sswitch_1
    sget v14, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v14, :cond_0

    :goto_3
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v14, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v14, :cond_2

    goto :goto_3

    :cond_2
    const-string v14, "\u1a78\u06dc"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x19

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x935

    const v16, -0x5a535e96

    xor-int v15, v15, v16

    const v16, 0xed79f63

    goto :goto_0

    .line 534
    :sswitch_3
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    goto :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    return-void

    :sswitch_5
    sub-int v0, v1, p4

    sub-int v1, v8, v1

    move-object/from16 v14, p3

    .line 912
    invoke-static {v9, v10, v14, v0, v1}, Ll/ۖ֡;->ܳ᩷ᩴ(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v8, v8, p4

    move-object/from16 v15, p5

    .line 914
    invoke-static {v0, v8, v15}, Ll/ۢ۫ܳ;->ۙ(II[J)V

    return-void

    :sswitch_6
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    int-to-long v8, v7

    add-long/2addr v8, v4

    .line 910
    invoke-static {v2, v3, v8, v9}, Ll/۬;->᩺ۘ᩸(JJ)J

    move-result-wide v8

    long-to-int v8, v8

    .line 912
    invoke-static {v6}, Ll/᩵۫ܳ;->ۙ(Ll/᩵۫ܳ;)[B

    move-result-object v9

    sub-int v10, v1, v0

    sget v16, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v16, :cond_3

    goto :goto_2

    :cond_3
    const-string v16, "\u1a77\u06e7"

    invoke-static/range {v16 .. v16}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v12

    move/from16 v17, v1

    xor-int v1, v16, v13

    mul-int/lit16 v1, v1, 0x2f41

    const v18, -0x2c69e4c1

    xor-int v1, v1, v18

    const v18, 0xcd4c9b0

    xor-int v16, v16, v18

    move v15, v1

    move/from16 v14, v16

    move/from16 v1, v17

    goto/16 :goto_1

    :cond_4
    const-string v17, "\u0736\u06d7"

    invoke-static/range {v17 .. v17}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v17

    add-int v17, v17, v13

    mul-int/lit8 v17, v17, 0x75

    xor-int v0, v17, v12

    mul-int/lit16 v0, v0, 0x3685

    const v18, 0x76ca94cb

    xor-int v0, v0, v18

    const v18, -0x4a1b2fec

    xor-int v17, v17, v18

    move v15, v0

    move/from16 v14, v17

    move/from16 v0, p6

    move-wide/from16 v19, v6

    move-object v6, v1

    move v1, v2

    move-wide v2, v4

    move-wide/from16 v4, v19

    move/from16 v7, v16

    goto/16 :goto_1

    :sswitch_7
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    .line 159
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v0, "\u06e8\u06df"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, 0x793f

    const v16, 0x4b6a7837    # 1.5366199E7f

    xor-int v1, v1, v16

    const v16, -0x9a58bb9

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v0

    if-ltz v0, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u06e4\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x7c2d

    const v16, 0x337f786c

    xor-int v1, v1, v16

    const v16, 0x503b4f30

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    .line 486
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v0

    if-eqz v0, :cond_7

    :goto_4
    const-string v0, "\u06df\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x19

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, 0xa85

    const v16, -0x172b455c

    xor-int v1, v1, v16

    const v16, 0x653f839c

    goto/16 :goto_9

    :cond_7
    const-string v0, "\u0733\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x13

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, -0x1cf

    const v16, 0x363217a

    xor-int v1, v1, v16

    const v16, -0x4cca832c

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u0730\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x13

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x7495

    const v16, -0x78e4fe25

    xor-int v1, v1, v16

    const v16, 0x3fece98d

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v0

    if-nez v0, :cond_9

    :goto_5
    const-string v0, "\u1a76\u06e8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x65

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, -0x7ecb

    const v16, 0x528b1297

    xor-int v1, v1, v16

    const v16, -0x1772acdf

    goto/16 :goto_9

    :cond_9
    const-string v0, "\u073d\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, -0x19f7

    const v16, 0x2aa3e183

    xor-int v1, v1, v16

    const v16, 0x4a72327d    # 3968159.2f

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v0

    if-nez v0, :cond_a

    :goto_6
    move/from16 v1, v17

    goto :goto_7

    :cond_a
    const-string v0, "\u06da\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x43

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x6075

    const v16, -0x4d8edc9f

    xor-int v1, v1, v16

    const v16, -0x53851e2b

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_6

    :goto_7
    const-string v0, "\u06d9\u06df"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x79

    move/from16 v16, v1

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x2f6b

    const v17, 0x4df66e4

    xor-int v1, v1, v17

    const v17, 0x5467d0cb

    xor-int v0, v0, v17

    move v14, v0

    move v15, v1

    move/from16 v1, v16

    goto :goto_a

    :cond_b
    const-string v0, "\u06d9\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x3237

    const v16, -0x20bffb77

    xor-int v1, v1, v16

    const v16, -0x481ac481

    goto :goto_9

    :sswitch_e
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    .line 654
    sget v0, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v0, :cond_c

    :goto_8
    const-string v0, "\u073f\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x66d9

    const v16, 0x4b435611    # 1.2801553E7f

    xor-int v1, v1, v16

    const v16, 0x32174320

    goto :goto_9

    :cond_c
    const-string v0, "\u06e8\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, -0x6a5

    const v16, 0x7cbe14c6

    xor-int v1, v1, v16

    const v16, -0xa1706b

    :goto_9
    xor-int v0, v0, v16

    move v14, v0

    move v15, v1

    move/from16 v1, v17

    :goto_a
    move/from16 v0, p6

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7c4b76ac -> :sswitch_8
        -0x7b5fcc96 -> :sswitch_5
        -0x7091f379 -> :sswitch_1
        -0x5ad52c5f -> :sswitch_3
        -0x5a3975e4 -> :sswitch_4
        -0x4a95c570 -> :sswitch_d
        -0x459f8642 -> :sswitch_1
        -0x3a994d46 -> :sswitch_7
        -0x2bd3b479 -> :sswitch_0
        -0x2b4beb8c -> :sswitch_a
        -0x27b3aa02 -> :sswitch_7
        -0x238ed50f -> :sswitch_6
        -0x3e1547d -> :sswitch_d
        0x46bcb7 -> :sswitch_a
        0x86b905a -> :sswitch_e
        0x8ec618a -> :sswitch_4
        0x9d4cb6c -> :sswitch_c
        0xe064b21 -> :sswitch_0
        0x1b511c77 -> :sswitch_b
        0x1f18bbd2 -> :sswitch_9
        0x2e2e7572 -> :sswitch_b
        0x2f8a0af7 -> :sswitch_3
        0x32d3d565 -> :sswitch_8
        0x3f9221eb -> :sswitch_c
        0x50868419 -> :sswitch_2
        0x5b1708aa -> :sswitch_9
        0x5fb967d7 -> :sswitch_6
        0x7863f254 -> :sswitch_2
        0x7a5c5a79 -> :sswitch_5
        0x7b4d004c -> :sswitch_e
    .end sparse-switch
.end method

.method public static synthetic ۙ(Ll/ۘ۫ܳ;II[JII)V
    .locals 17

    move/from16 v0, p5

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const v8, -0x3e6c22d0

    sget v9, Ll/᩶;->ᩴ᩶ۛ:I

    sget v10, Ll/֨ܿ;->᩹᩻۟:I

    const-string v11, "\u06e7\u1a76"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0xbf

    const v13, 0x7cd06fe

    xor-int/2addr v12, v13

    const v13, -0x7557d1f1

    xor-int/2addr v11, v13

    :goto_0
    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, -0xca3

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 749
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    return-void

    .line 376
    :sswitch_0
    sget v11, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v11, :cond_0

    :goto_1
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    goto/16 :goto_5

    :cond_0
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    goto/16 :goto_6

    .line 753
    :sswitch_1
    sget v11, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v11, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    goto/16 :goto_2

    .line 420
    :sswitch_2
    sget v11, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v11, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    goto :goto_1

    :sswitch_4
    long-to-int v0, v6

    sub-int v1, v1, p4

    sub-int v0, v0, p4

    move-object/from16 v11, p3

    .line 944
    invoke-static {v1, v0, v11}, Ll/ۢ۫ܳ;->ۙ(II[J)V

    return-void

    :sswitch_5
    move-object/from16 v12, p0

    move-object/from16 v11, p3

    .line 942
    iget-object v6, v12, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    .line 943
    invoke-virtual {v6}, Ll/᩵۫ܳ;->᩷()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v6, v4

    .line 942
    invoke-static {v2, v3, v6, v7}, Ll/ۖۜ;->ᩳۢۧ(JJ)J

    move-result-wide v6

    .line 742
    sget v13, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v13, :cond_3

    move/from16 v13, p1

    move/from16 v14, p2

    goto/16 :goto_5

    :cond_3
    const-string v13, "\u06d8\u05a1"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v9

    mul-int/lit8 v13, v13, -0x23

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x1135

    const v15, -0x5d2da057

    xor-int/2addr v14, v15

    const v15, 0x3188373c

    xor-int/2addr v13, v15

    move v11, v13

    move v12, v14

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v12, p0

    move/from16 v13, p1

    move-object/from16 v11, p3

    .line 941
    invoke-static {v13, v0}, Ll/ۖ֡;->ܰۜ۬(II)I

    move-result v1

    move/from16 v14, p2

    int-to-long v2, v14

    int-to-long v4, v0

    .line 731
    sget v15, Ll/۬;->᩸ۜ᩹:I

    if-eqz v15, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v15, "\u06db\u06da"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v10, v15

    mul-int/lit8 v15, v15, -0x6f

    xor-int v0, v15, v9

    mul-int/lit16 v0, v0, 0x75df

    const v16, -0x4f7dcd28

    xor-int v0, v0, v16

    const v16, -0x1ae74e03

    xor-int v15, v15, v16

    move v12, v0

    move v11, v15

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v0

    if-ltz v0, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u1a7b\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v10

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, -0x576b

    const v16, 0x6b47226d

    xor-int v15, v15, v16

    const v16, -0x157924c

    goto/16 :goto_7

    :sswitch_8
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 120
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v0

    if-eqz v0, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v0, "\u06e4\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, 0xec3

    const v16, -0x75334af2

    xor-int v15, v15, v16

    const v16, -0x3434f992    # -2.6610908E7f

    goto/16 :goto_7

    :sswitch_9
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    sget v0, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v0, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v0, "\u06db\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v10

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, 0x693d

    const v16, -0x19641e40

    xor-int v15, v15, v16

    const v16, 0x75e03f34

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    sget v0, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v0, :cond_8

    :goto_2
    const-string v0, "\u1a79\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v10

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, -0x54d9

    const v16, 0x6ea02bff

    xor-int v15, v15, v16

    const v16, 0x2feb41fc

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u0733\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    mul-int/lit8 v0, v0, 0x3f

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, -0x1747

    const v16, 0x38cff2f4

    xor-int v15, v15, v16

    const v16, -0x33d67f1c    # -4.443432E7f

    goto/16 :goto_7

    :sswitch_b
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    sget v0, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v0, :cond_9

    :goto_3
    const-string v0, "\u06d7\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v10

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, 0x1527

    const v16, -0x4d20f38b

    xor-int v15, v15, v16

    const v16, -0x54e08675

    goto/16 :goto_7

    :cond_9
    const-string v0, "\u1a74\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v10

    mul-int/lit8 v0, v0, -0x3f

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, 0x6a23

    const v16, 0x43bd30cc

    xor-int v15, v15, v16

    const v16, -0x5616850c

    goto/16 :goto_7

    :sswitch_c
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 565
    sget v0, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v0, :cond_a

    :goto_4
    const-string v0, "\u1a7a\u06d9"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v10, v0

    mul-int/lit8 v0, v0, 0xf

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, 0x68fd

    const v16, 0x6261ad3e

    xor-int v15, v15, v16

    const v16, 0x3a5c6fc6

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u06e7\u06e1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, -0x2d23

    const v16, -0x4e0891fc

    xor-int v15, v15, v16

    const v16, -0x573ccdee

    goto :goto_7

    :sswitch_d
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 603
    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v0, :cond_b

    :goto_5
    const-string v0, "\u06e0\u06d9"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v9

    mul-int/lit8 v0, v0, -0x4f

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, -0x6555

    const v16, 0x1cb65028

    xor-int v15, v15, v16

    const v16, 0x44e0e25f

    goto :goto_7

    :cond_b
    const-string v0, "\u05a1\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, 0x47ad

    const v16, -0x287c7227

    xor-int v15, v15, v16

    const v16, -0x6ad7ccba

    goto :goto_7

    :sswitch_e
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 162
    sget v0, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v0, :cond_c

    :goto_6
    const-string v0, "\u05a1\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v9

    mul-int/lit8 v0, v0, -0x31

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, 0x7373

    const v16, -0x2c785cd5

    xor-int v15, v15, v16

    const v16, -0x274206bd

    goto :goto_7

    :cond_c
    const-string v0, "\u1a73\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v10

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, 0x1f49

    const v16, -0x4f0a5783

    xor-int v15, v15, v16

    const v16, -0x25e9d142

    :goto_7
    xor-int v0, v0, v16

    move v11, v0

    move v12, v15

    :goto_8
    move/from16 v0, p5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7df0d9b3 -> :sswitch_b
        -0x7b0c248c -> :sswitch_6
        -0x77ae367a -> :sswitch_2
        -0x768f5a07 -> :sswitch_2
        -0x675a3d36 -> :sswitch_e
        -0x490b5082 -> :sswitch_5
        -0x401bccc9 -> :sswitch_c
        -0x2c87f14c -> :sswitch_8
        -0x24b551a3 -> :sswitch_b
        -0x1ef8ed69 -> :sswitch_7
        -0x19ce17c9 -> :sswitch_3
        -0x138c7861 -> :sswitch_7
        -0x76709de -> :sswitch_0
        0xd87488c -> :sswitch_3
        0x146af86a -> :sswitch_4
        0x161ade07 -> :sswitch_1
        0x1a1f0e6c -> :sswitch_4
        0x210e8621 -> :sswitch_5
        0x2bbe8fc1 -> :sswitch_0
        0x2c30011b -> :sswitch_e
        0x3751c12c -> :sswitch_c
        0x44160bb3 -> :sswitch_9
        0x54ba047e -> :sswitch_d
        0x54ddac61 -> :sswitch_1
        0x567c1075 -> :sswitch_a
        0x5833890f -> :sswitch_6
        0x5d97ee35 -> :sswitch_a
        0x7bde4a8b -> :sswitch_9
        0x7c8dbfa2 -> :sswitch_d
        0x7f818c45 -> :sswitch_8
    .end sparse-switch
.end method

.method private ۤ(II)J
    .locals 48

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const v33, -0x671c1005

    sget v34, Ll/ۗ᩺;->֡ۙۜ:I

    sget v35, Ll/ۖۗ;->᩻ܳܶ:I

    const-string v36, "\u06d7\u1a7b"

    invoke-static/range {v36 .. v36}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v36

    sub-int v36, v35, v36

    mul-int/lit8 v36, v36, 0x33

    xor-int v3, v36, v34

    mul-int/lit16 v3, v3, 0x351f

    const v38, 0x1afe9a29

    xor-int v3, v3, v38

    const v38, 0x518c147c

    xor-int v36, v36, v38

    move-wide/from16 v38, v12

    const/4 v0, 0x0

    const/16 v37, 0x0

    move-wide/from16 v42, v8

    const/4 v8, 0x0

    move-wide/from16 v44, v10

    const/4 v11, 0x0

    move-wide/from16 v9, v26

    move-wide/from16 v27, v44

    move-wide/from16 v25, v24

    move-wide/from16 v23, v22

    move-wide/from16 v21, v42

    move-wide/from16 v46, v6

    move-wide/from16 v6, v18

    move-wide/from16 v17, v46

    :goto_0
    xor-int v12, v33, v34

    mul-int/lit16 v12, v12, -0x7b65

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v3, v12

    xor-int v33, v36, v3

    sparse-switch v33, :sswitch_data_0

    const/16 v3, 0x20

    shl-long v31, v29, v3

    .line 499
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_2

    goto :goto_2

    .line 894
    :sswitch_0
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-nez v3, :cond_1

    :cond_0
    :goto_1
    move/from16 v19, v0

    move-wide/from16 v40, v6

    goto/16 :goto_6

    :cond_1
    :goto_2
    move/from16 v19, v0

    move-wide/from16 v40, v6

    goto/16 :goto_5

    .line 236
    :sswitch_1
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez v3, :cond_8

    goto :goto_1

    .line 180
    :sswitch_2
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-lez v3, :cond_0

    goto :goto_3

    .line 885
    :sswitch_3
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    :goto_3
    const-string v3, "\u06d9\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v34

    mul-int/lit8 v3, v3, -0x3

    xor-int v12, v3, v35

    mul-int/lit16 v12, v12, 0x1c09

    const v13, 0x5f328660

    xor-int/2addr v12, v13

    const v13, -0x680eb574

    goto/16 :goto_8

    .line 990
    :sswitch_4
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    const-wide/16 v0, 0x0

    return-wide v0

    :sswitch_5
    int-to-long v0, v11

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long v0, v0, v31

    return-wide v0

    :cond_2
    const-string v3, "\u06d6\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v35, v3

    mul-int/lit8 v3, v3, -0x47

    xor-int v12, v3, v34

    mul-int/lit16 v12, v12, 0x21bb

    const v13, 0x6951cfcf

    xor-int/2addr v12, v13

    const v13, 0x329c0067

    goto/16 :goto_8

    .line 1002
    :sswitch_6
    invoke-static {v6, v7, v9, v10}, Ll/۬;->᩺ۘ᩸(JJ)J

    move-result-wide v11

    long-to-int v11, v11

    int-to-long v12, v0

    .line 91
    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_3

    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v29, v12

    goto :goto_5

    :cond_3
    const-string v3, "\u06eb\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v35

    mul-int/lit8 v3, v3, -0x6b

    move/from16 v19, v0

    xor-int v0, v3, v34

    mul-int/lit16 v0, v0, -0x6f7f

    const v29, 0x4d8fa86e    # 3.012725E8f

    xor-int v0, v0, v29

    const v29, -0x4b12ae72

    xor-int v36, v3, v29

    move v3, v0

    move-wide/from16 v29, v12

    goto :goto_4

    :sswitch_7
    move/from16 v19, v0

    add-long v9, v23, v25

    .line 280
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v0

    if-ltz v0, :cond_4

    move-object/from16 v1, p0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    goto/16 :goto_e

    :cond_4
    const-string v0, "\u0733\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v34, v0

    mul-int/lit8 v0, v0, -0x79

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, 0x7127

    const v12, -0x2cd3c95f

    xor-int/2addr v3, v12

    const v12, 0x776c5f6a

    xor-int v36, v0, v12

    :goto_4
    move/from16 v0, v19

    goto/16 :goto_0

    :sswitch_8
    move/from16 v19, v0

    int-to-long v12, v8

    .line 1003
    invoke-virtual {v5}, Ll/᩵۫ܳ;->᩷()I

    move-result v0

    move-wide/from16 v40, v6

    int-to-long v6, v0

    .line 890
    sget-boolean v0, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v0, :cond_5

    move-wide/from16 v25, v6

    move-wide/from16 v23, v12

    :goto_5
    const-string v0, "\u05ab\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    mul-int/lit8 v0, v0, -0x75

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, 0x6cdd

    const v6, -0x4979761d

    xor-int/2addr v3, v6

    const v6, -0x5050ccfd

    goto/16 :goto_a

    :cond_5
    const-string v0, "\u06db\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, -0xcdb

    const v23, 0x54d6d3ac

    xor-int v3, v3, v23

    const v23, -0x76f7d712

    xor-int v36, v0, v23

    move-wide/from16 v25, v6

    move-wide/from16 v23, v12

    goto/16 :goto_11

    :sswitch_9
    move/from16 v19, v0

    move-wide/from16 v40, v6

    add-int v0, v16, v20

    .line 1003
    invoke-virtual {v4, v0}, Ll/۟۫ܳ;->ۤ(I)I

    move-result v8

    .line 125
    sget v0, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v0, :cond_6

    move/from16 v0, v19

    move-wide/from16 v6, v40

    goto :goto_7

    :cond_6
    const-string v0, "\u06d9\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, 0x46ff

    const v6, -0x51aa6808

    xor-int/2addr v3, v6

    const v6, 0x30c15e12

    goto/16 :goto_a

    :sswitch_a
    move/from16 v19, v0

    move-wide/from16 v40, v6

    const/16 v20, -0x1

    .line 136
    sget v0, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v0, :cond_7

    :goto_6
    const-string v0, "\u06d9\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, -0x3989

    const v6, 0x61fe9d7b

    xor-int/2addr v3, v6

    const v6, -0x1afe8f1c

    goto/16 :goto_a

    :cond_7
    const-string v0, "\u06d9\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, 0x5b

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, -0x7423

    const v6, 0x3ae21d7d

    xor-int/2addr v3, v6

    const v6, 0x14a8319e

    goto/16 :goto_a

    .line 1001
    :sswitch_b
    invoke-virtual {v4, v15}, Ll/۟۫ܳ;->ۤ(I)I

    move-result v0

    invoke-static {v1, v0}, Ll/ۖܰ;->ܰۛۖ(II)I

    move-result v0

    int-to-long v6, v2

    .line 315
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_9

    :cond_8
    :goto_7
    const-string v3, "\u06dc\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    mul-int/lit8 v3, v3, 0x35

    xor-int v12, v3, v34

    mul-int/lit16 v12, v12, -0x566b

    const v13, -0x29ae621b

    xor-int/2addr v12, v13

    const v13, 0x1e993d42

    goto :goto_8

    :cond_9
    const-string v3, "\u1a73\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v34, v3

    mul-int/lit8 v3, v3, -0x4b

    xor-int v12, v3, v35

    mul-int/lit16 v12, v12, 0x3fb1

    const v13, 0x694c6763

    xor-int/2addr v12, v13

    const v13, -0x3f73d3e1

    :goto_8
    xor-int v36, v3, v13

    move v3, v12

    goto/16 :goto_0

    :sswitch_c
    move/from16 v19, v0

    move-wide/from16 v40, v6

    .line 996
    invoke-static {v4, v14}, Ll/۟۫ܳ;->ۙ(Ll/۟۫ܳ;I)I

    move-result v15

    .line 997
    invoke-static {v4, v2}, Ll/۟۫ܳ;->ۙ(Ll/۟۫ܳ;I)I

    move-result v0

    if-lt v15, v0, :cond_a

    move-object/from16 v1, p0

    move/from16 v16, v0

    move-wide/from16 v12, v38

    goto/16 :goto_d

    :cond_a
    const-string v3, "\u073f\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v34, v3

    mul-int/lit8 v3, v3, 0x2f

    xor-int v6, v3, v35

    mul-int/lit16 v6, v6, -0x64d

    const v7, -0x19c68add

    xor-int/2addr v6, v7

    const v7, 0x1d8cdc2

    xor-int v36, v3, v7

    move/from16 v16, v0

    move v3, v6

    goto/16 :goto_11

    :sswitch_d
    move/from16 v19, v0

    move-wide/from16 v40, v6

    const/high16 v0, -0x80000000

    move-wide/from16 v12, v38

    const/high16 v14, -0x80000000

    goto :goto_9

    :sswitch_e
    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    long-to-int v0, v12

    move v14, v0

    :goto_9
    const-string v0, "\u06db\u06d8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, -0xb1

    const v6, 0x6525d0c

    xor-int/2addr v3, v6

    const v6, 0x68b9347f

    goto :goto_c

    :sswitch_f
    move/from16 v19, v0

    move-wide/from16 v40, v6

    const-wide/16 v6, 0x1

    add-long v38, v27, v6

    const-wide/32 v6, -0x80000000

    cmp-long v0, v38, v6

    if-gez v0, :cond_b

    const-string v0, "\u1a79\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v34

    mul-int/lit8 v0, v0, -0x3f

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, -0x20bb

    const v6, 0x41b4e26b

    xor-int/2addr v3, v6

    const v6, -0x72beea57

    goto :goto_a

    :cond_b
    const-string v0, "\u1a7a\u06eb"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, 0x5fff

    const v6, -0x608297f7

    xor-int/2addr v3, v6

    const v6, -0x6e929266

    :goto_a
    xor-int v36, v0, v6

    goto/16 :goto_11

    :sswitch_10
    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    sub-long v27, v17, v21

    .line 25
    sget v0, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v0, :cond_c

    :goto_b
    move-object/from16 v1, p0

    goto/16 :goto_e

    :cond_c
    const-string v0, "\u06eb\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, -0x7fd3

    const v6, -0x7e4cb66b

    xor-int/2addr v3, v6

    const v6, 0x18edc69b

    :goto_c
    xor-int v36, v0, v6

    goto/16 :goto_10

    :sswitch_11
    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    int-to-long v6, v1

    .line 994
    invoke-virtual {v5}, Ll/᩵۫ܳ;->᩷()I

    move-result v0

    int-to-long v0, v0

    .line 3
    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_d

    move-wide/from16 v21, v0

    move-wide/from16 v17, v6

    goto :goto_b

    :cond_d
    const-string v3, "\u05a8\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v35, v3

    mul-int/lit8 v3, v3, 0x35

    move-wide/from16 v17, v0

    xor-int v0, v3, v34

    mul-int/lit16 v0, v0, 0xb4d

    const v1, -0x3e57165

    xor-int/2addr v0, v1

    const v1, 0x14167bc8

    xor-int v36, v3, v1

    move/from16 v1, p1

    move v3, v0

    move-wide/from16 v38, v12

    move-wide/from16 v21, v17

    move/from16 v0, v19

    move-wide/from16 v17, v6

    goto/16 :goto_12

    :sswitch_12
    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    .line 990
    move-object/from16 v4, v37

    check-cast v4, Ll/۟۫ܳ;

    invoke-static {v4}, Ll/۟۫ܳ;->᩷(Ll/۟۫ܳ;)I

    move-result v0

    move-object/from16 v1, p0

    .line 991
    iget-object v5, v1, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    invoke-virtual {v5}, Ll/᩵۫ܳ;->᩷()I

    move-result v3

    if-eq v0, v3, :cond_e

    goto :goto_d

    :cond_e
    const-string v0, "\u06e8\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v34

    mul-int/lit8 v0, v0, 0x79

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, -0x74ff

    const v6, 0x2ee33df2

    xor-int/2addr v3, v6

    const v6, -0x3921722a

    goto/16 :goto_f

    :sswitch_13
    move-object/from16 v1, p0

    const-wide/16 v2, -0x1

    return-wide v2

    :sswitch_14
    move-object/from16 v1, p0

    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    .line 990
    iget-object v0, v1, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    instance-of v3, v0, Ll/۟۫ܳ;

    if-eqz v3, :cond_f

    const-string v3, "\u06d8\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v6, v3, v34

    mul-int/lit16 v6, v6, -0x3283

    const v7, -0x4d7473fd

    xor-int/2addr v6, v7

    const v7, -0xea2746f

    xor-int v36, v3, v7

    move/from16 v1, p1

    move-object/from16 v37, v0

    move v3, v6

    goto :goto_10

    :cond_f
    move-object/from16 v37, v0

    :goto_d
    const-string v0, "\u06e0\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, -0x44e1

    const v6, 0x79bdc214

    xor-int/2addr v3, v6

    const v6, 0x32597014

    goto :goto_f

    :sswitch_15
    move-object/from16 v1, p0

    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    .line 118
    sget v0, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v0, :cond_10

    :goto_e
    const-string v0, "\u05a8\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, 0x60a3

    const v6, -0x62dc3c25

    xor-int/2addr v3, v6

    const v6, -0x69e53559

    goto :goto_f

    :cond_10
    const-string v0, "\u1a7b\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, 0x5ea3

    const v6, -0x5272d71d

    xor-int/2addr v3, v6

    const v6, 0x18d5f97e

    :goto_f
    xor-int v36, v0, v6

    move/from16 v1, p1

    :goto_10
    move-wide/from16 v38, v12

    :goto_11
    move/from16 v0, v19

    :goto_12
    move-wide/from16 v6, v40

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d146b89 -> :sswitch_d
        -0x7a7c3b18 -> :sswitch_12
        -0x7549a530 -> :sswitch_15
        -0x7239f3fa -> :sswitch_14
        -0x72022a82 -> :sswitch_f
        -0x718c6453 -> :sswitch_8
        -0x6fe84a99 -> :sswitch_13
        -0x6a78b485 -> :sswitch_a
        -0x69a5dd42 -> :sswitch_6
        -0x64b9bf95 -> :sswitch_5
        -0x61870dd8 -> :sswitch_9
        -0x5be27df1 -> :sswitch_5
        -0x4c7b5859 -> :sswitch_11
        -0x343373a3 -> :sswitch_11
        -0x28c10f6d -> :sswitch_4
        -0x22af8e4d -> :sswitch_d
        -0x1d3b171f -> :sswitch_0
        -0x1a4f3dae -> :sswitch_e
        -0x129f87d4 -> :sswitch_b
        -0x8f5e9eb -> :sswitch_a
        -0x5f2bbdc -> :sswitch_c
        -0x3e9d433 -> :sswitch_6
        0x64985a6 -> :sswitch_9
        0xf280546 -> :sswitch_14
        0x19a41bb3 -> :sswitch_15
        0x1c183de8 -> :sswitch_7
        0x1c677b5b -> :sswitch_c
        0x2047ad67 -> :sswitch_0
        0x25f88a6f -> :sswitch_10
        0x26e40b31 -> :sswitch_1
        0x2af4522b -> :sswitch_12
        0x2c9fb058 -> :sswitch_2
        0x3c7f0a80 -> :sswitch_3
        0x3da1bf65 -> :sswitch_4
        0x441f1142 -> :sswitch_8
        0x46873f94 -> :sswitch_13
        0x5436d562 -> :sswitch_2
        0x54cd42f2 -> :sswitch_10
        0x587154d4 -> :sswitch_e
        0x5c33bc81 -> :sswitch_b
        0x61314a87 -> :sswitch_f
        0x6e8baa1f -> :sswitch_7
        0x7011657e -> :sswitch_3
        0x70d637cc -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()J
    .locals 2

    .line 966
    iget-object v0, p0, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    invoke-virtual {v0}, Ll/֡۫ܳ;->ۙ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۙ(II[J)V
    .locals 16

    move-object/from16 v6, p0

    move/from16 v5, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const v8, 0x5ea2b7d9

    sget v9, Ll/ۖ֨;->֨ۨۧ:I

    sget v10, Ll/֫֡;->֫ۙۖ:I

    const-string v11, "\u05a8\u06d7"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x607f

    const v13, -0x3ee8c447

    xor-int/2addr v12, v13

    const v13, 0x184ddd1f

    xor-int/2addr v11, v13

    const/4 v0, 0x0

    const v1, 0x5ea2b7d9

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    xor-int/2addr v1, v10

    mul-int/lit16 v1, v1, -0x58a1

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v12

    xor-int/2addr v1, v11

    sparse-switch v1, :sswitch_data_0

    .line 825
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    return-void

    :sswitch_0
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v11

    if-lez v11, :cond_1

    :cond_0
    move/from16 v12, p2

    move-object/from16 v11, p3

    goto/16 :goto_6

    :cond_1
    const-string v11, "\u06d7\u1a7b"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x356d

    const v13, -0x117e6746

    xor-int/2addr v12, v13

    const v13, -0x4b7f679b

    xor-int/2addr v11, v13

    goto :goto_0

    :sswitch_1
    sget v11, Ll/ۗ᩵;->ᩳܶۤ:I

    if-lez v11, :cond_0

    :goto_1
    move/from16 v12, p2

    move-object/from16 v11, p3

    goto/16 :goto_5

    .line 319
    :sswitch_2
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget v11, Ll/ۖۜ;->֨ۡۗ:I

    if-nez v11, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v12, p2

    move-object/from16 v11, p3

    goto/16 :goto_4

    .line 426
    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    goto :goto_1

    :sswitch_4
    sub-int/2addr v4, v5

    sub-int/2addr v0, v5

    move-object/from16 v11, p3

    .line 936
    invoke-static {v4, v0, v11}, Ll/ۢ۫ܳ;->ۙ(II[J)V

    return-void

    :sswitch_5
    move-object/from16 v11, p3

    const/16 v0, 0x20

    ushr-long v12, v2, v0

    long-to-int v4, v12

    long-to-int v0, v2

    .line 11
    sget v12, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v12, :cond_3

    move/from16 v12, p2

    goto/16 :goto_6

    :cond_3
    const-string v12, "\u06e2\u1a7b"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v9

    mul-int/lit16 v13, v13, 0x10ff

    const v14, -0x5e906ffe

    xor-int/2addr v13, v14

    const v14, -0x6dc8faec

    goto :goto_2

    :sswitch_6
    move-object/from16 v11, p3

    .line 939
    iget-object v12, v6, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    invoke-virtual {v12}, Ll/᩵۫ܳ;->᩷()I

    move-result v12

    new-instance v13, Ll/᩺۫ܳ;

    .line 110
    sget v14, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v14, :cond_4

    move/from16 v12, p2

    goto/16 :goto_3

    :cond_4
    move-object v0, v13

    move-object/from16 v1, p0

    move v2, v7

    move v3, v8

    move-object/from16 v4, p3

    move/from16 v5, p1

    .line 939
    invoke-direct/range {v0 .. v5}, Ll/᩺۫ܳ;-><init>(Ll/ۘ۫ܳ;II[JI)V

    iget-object v0, v6, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    invoke-virtual {v0, v7, v8, v12, v13}, Ll/֡۫ܳ;->ۙ(IIILl/᩻۫ܳ;)V

    :sswitch_7
    return-void

    :sswitch_8
    move-object/from16 v11, p3

    .line 932
    invoke-direct {v6, v7, v8}, Ll/ۘ۫ܳ;->ۤ(II)J

    move-result-wide v2

    const-wide/16 v12, -0x1

    cmp-long v14, v2, v12

    if-eqz v14, :cond_5

    const-string v12, "\u0733\u06e8"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v9

    mul-int/lit16 v13, v13, 0x7bb

    const v14, 0x666b0ab9

    xor-int/2addr v13, v14

    const v14, -0x3643616c    # -1545170.5f

    goto :goto_2

    :cond_5
    const-string v12, "\u073d\u0730"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v9

    mul-int/lit8 v12, v12, -0xd

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x6e8b

    const v14, 0x4c8a3329    # 7.245652E7f

    xor-int/2addr v13, v14

    const v14, -0x49386132

    :goto_2
    xor-int/2addr v12, v14

    move v11, v12

    move v12, v13

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v11, p3

    .line 927
    iget v7, v6, Ll/ۘ۫ܳ;->᩷:I

    invoke-static {v5, v7}, Ll/ۖܰ;->ܰۛۖ(II)I

    move-result v7

    .line 928
    iget v8, v6, Ll/ۘ۫ܳ;->ۙ:I

    move/from16 v12, p2

    invoke-static {v12, v8}, Ll/᩺;->ܿۘܿ(II)I

    move-result v8

    if-lt v7, v8, :cond_6

    const-string v13, "\u06d7\u1a73"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x2f43

    const v15, 0x4236e4ec

    xor-int/2addr v14, v15

    const v15, 0x79d8d73b

    goto/16 :goto_7

    :cond_6
    const-string v13, "\u073a\u06e8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x4b83

    const v15, 0x16acad22

    xor-int/2addr v14, v15

    const v15, 0x58c792c4

    goto/16 :goto_7

    :sswitch_a
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 626
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v13

    if-nez v13, :cond_7

    :goto_3
    const-string v13, "\u06e7\u05a8"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v10, v13

    mul-int/lit8 v13, v13, -0x49

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x3681

    const v15, -0x70bc00cc

    xor-int/2addr v14, v15

    const v15, -0x674fa1ad

    goto/16 :goto_7

    :cond_7
    const-string v13, "\u05ab\u06e1"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    mul-int/lit8 v13, v13, 0x51

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x7625

    const v15, 0x48504564

    xor-int/2addr v14, v15

    const v15, 0x5f9f7b3a

    goto/16 :goto_7

    :sswitch_b
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 589
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v13

    if-gtz v13, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v13, "\u06dc\u06db"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    mul-int/lit8 v13, v13, -0x3d

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x38b7

    const v15, -0x61c2e0aa

    xor-int/2addr v14, v15

    const v15, 0x22c4d032

    goto/16 :goto_7

    :sswitch_c
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 859
    sget v13, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v13, :cond_9

    :goto_4
    const-string v13, "\u05a1\u1a78"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v10

    mul-int/lit8 v13, v13, 0x1d

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0xdf3

    const v15, -0x337f53b9    # -6.746169E7f

    xor-int/2addr v14, v15

    const v15, -0x2dee8e9f

    goto/16 :goto_7

    :cond_9
    const-string v13, "\u073d\u073d"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    mul-int/lit8 v13, v13, 0xf

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x86f

    const v15, -0x2272d5c7

    xor-int/2addr v14, v15

    const v15, 0x34fd7fb1    # 4.721783E-7f

    goto/16 :goto_7

    :sswitch_d
    move/from16 v12, p2

    move-object/from16 v11, p3

    sget-boolean v13, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v13, :cond_a

    goto :goto_5

    :cond_a
    const-string v13, "\u073d\u06e1"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x589d

    const v15, 0x735e75c8

    xor-int/2addr v14, v15

    const v15, -0x4ed20373

    goto/16 :goto_7

    :sswitch_e
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 495
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v13

    if-ltz v13, :cond_b

    goto :goto_5

    :cond_b
    const-string v13, "\u1a74\u06d6"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v10

    mul-int/lit8 v13, v13, 0x15

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x25e9

    const v15, 0x7d4eadf4

    xor-int/2addr v14, v15

    const v15, 0x27ba7313

    goto/16 :goto_7

    :sswitch_f
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 796
    sget v13, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v13, :cond_c

    :goto_5
    const-string v13, "\u06e1\u06db"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v9

    mul-int/lit8 v13, v13, 0x4f

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x4f97

    const v15, -0x6a7bc7b2

    xor-int/2addr v14, v15

    const v15, 0x606d0ae6

    goto :goto_7

    :cond_c
    const-string v13, "\u0733\u06d7"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x2a93

    const v15, 0xdaa26e7

    xor-int/2addr v14, v15

    const v15, 0x4ce040b0

    goto :goto_7

    :sswitch_10
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 729
    sget v13, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v13, :cond_d

    goto :goto_6

    :cond_d
    const-string v13, "\u0736\u05a8"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x123b

    const v15, 0x56dbc3b7

    xor-int/2addr v14, v15

    const v15, -0x5a50782c

    goto :goto_7

    :sswitch_11
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 769
    sget v13, Ll/ۖ;->ܿۚ֡:I

    if-ltz v13, :cond_e

    :goto_6
    const-string v13, "\u06da\u05ab"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    mul-int/lit8 v13, v13, 0x7d

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x1ce1

    const v15, 0x49a06956    # 1314090.8f

    xor-int/2addr v14, v15

    const v15, 0x1ea3aa7a

    goto :goto_7

    :cond_e
    const-string v13, "\u06dc\u1a74"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x705b

    const v15, 0x3bfa8c6e

    xor-int/2addr v14, v15

    const v15, -0x6e1202e0

    :goto_7
    xor-int/2addr v13, v15

    move v11, v13

    move v12, v14

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f224753 -> :sswitch_5
        -0x7dc7066a -> :sswitch_3
        -0x778c65ae -> :sswitch_2
        -0x764a4c3a -> :sswitch_0
        -0x741175f2 -> :sswitch_0
        -0x6e5ddf58 -> :sswitch_d
        -0x652d5213 -> :sswitch_e
        -0x63da0249 -> :sswitch_4
        -0x5651cb36 -> :sswitch_6
        -0x5604b476 -> :sswitch_11
        -0x5015cde2 -> :sswitch_7
        -0x4ef52ba5 -> :sswitch_6
        -0x4bd5fdab -> :sswitch_f
        -0x49177128 -> :sswitch_a
        -0x47f962da -> :sswitch_b
        -0x31809f97 -> :sswitch_11
        -0x28df4940 -> :sswitch_a
        -0x27732dec -> :sswitch_10
        -0x25a1756b -> :sswitch_9
        -0x24a9d51f -> :sswitch_4
        -0x7b3241b -> :sswitch_c
        -0x8a7e05 -> :sswitch_3
        0x11a6b406 -> :sswitch_8
        0x1b538ea9 -> :sswitch_7
        0x1b61500a -> :sswitch_b
        0x1d19598b -> :sswitch_8
        0x1ef4033b -> :sswitch_10
        0x22f2eb35 -> :sswitch_d
        0x2f886f78 -> :sswitch_2
        0x39dfa3de -> :sswitch_c
        0x41497734 -> :sswitch_5
        0x4ab0d517 -> :sswitch_e
        0x62b27db8 -> :sswitch_1
        0x6849ebe0 -> :sswitch_9
        0x739d69bf -> :sswitch_f
        0x7e8e1661 -> :sswitch_1
    .end sparse-switch
.end method

.method public final ۙ(I[BII)V
    .locals 25

    move-object/from16 v7, p0

    move/from16 v6, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v8, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, -0x58fde3a9

    sget v18, Ll/ۖ֡;->ۚۛᩳ:I

    sget v19, Ll/֡ۢ;->۟֡᩻:I

    const-string v20, "\u06ec\u06db"

    invoke-static/range {v20 .. v20}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v20

    add-int v20, v20, v18

    mul-int/lit8 v20, v20, -0x61

    xor-int v0, v20, v19

    mul-int/lit16 v0, v0, 0x7365

    const v22, -0xe7cd262

    xor-int v0, v0, v22

    const v22, -0x572c8cc

    xor-int v20, v20, v22

    move-object v10, v5

    move-object v13, v12

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v21, 0x0

    move-wide v11, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    xor-int v3, v17, v19

    mul-int/lit16 v3, v3, 0x252f

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v0, v3

    xor-int v17, v20, v0

    sparse-switch v17, :sswitch_data_0

    add-int v0, p4, v8

    sub-int v6, v0, v6

    .line 862
    invoke-static {v2}, Ll/᩵۫ܳ;->ۙ(Ll/᩵۫ܳ;)[B

    move-result-object v0

    aget-byte v5, v0, v21

    move-object/from16 v0, p0

    iget-object v1, v0, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    move-object/from16 v2, p2

    move v3, v8

    move v4, v9

    invoke-virtual/range {v1 .. v6}, Ll/֡۫ܳ;->ۙ([BIIBI)V

    return-void

    .line 428
    :sswitch_0
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v3, p3

    move/from16 v20, v1

    goto/16 :goto_9

    .line 782
    :sswitch_1
    sget v0, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v0, :cond_1

    :goto_1
    move/from16 v3, p3

    goto/16 :goto_a

    :cond_1
    :goto_2
    const-string v0, "\u06dc\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x2d

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x1afb

    const v20, 0x5e78150c

    xor-int v3, v3, v20

    const v20, -0x26fce90f

    goto/16 :goto_4

    .line 751
    :sswitch_2
    sget v0, Ll/ۖۖ;->᩵ۜ֨:I

    if-gez v0, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v3, p3

    move/from16 v20, v1

    goto/16 :goto_8

    .line 353
    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    return-void

    .line 872
    :sswitch_5
    invoke-static {v2}, Ll/᩵۫ܳ;->ۙ(Ll/᩵۫ܳ;)[B

    move-result-object v0

    add-int v2, p4, v1

    sub-int/2addr v2, v6

    sub-int/2addr v5, v1

    move-object/from16 v3, p2

    invoke-static {v7, v0, v2, v3, v5}, Ll/ۢ۫ܳ;->ۙ(I[BI[BI)V

    return-void

    :sswitch_6
    move-object/from16 v3, p2

    add-int v0, v16, v15

    move v7, v0

    goto :goto_3

    :sswitch_7
    move-object/from16 v3, p2

    xor-int v0, v14, v15

    shr-int/lit8 v0, v0, 0x1f

    or-int/2addr v0, v4

    if-lez v0, :cond_3

    move/from16 v7, v16

    goto :goto_3

    :cond_3
    const-string v0, "\u06e4\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x29

    xor-int v3, v0, v19

    mul-int/lit16 v3, v3, -0x263b

    const v20, 0x46eb19bb

    xor-int v3, v3, v20

    const v20, -0x784f838

    goto :goto_4

    .line 870
    :sswitch_8
    invoke-static {v13}, Ll/۟۫ܳ;->ۙ(Ll/۟۫ܳ;)I

    move-result v0

    sub-int v14, v1, v0

    .line 871
    invoke-virtual {v2}, Ll/᩵۫ܳ;->᩷()I

    move-result v15

    .line 0
    rem-int v16, v14, v15

    if-nez v16, :cond_4

    move/from16 v7, v21

    :goto_3
    const-string v0, "\u06e4\u06eb"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x4b

    xor-int v3, v0, v19

    mul-int/lit16 v3, v3, -0x2087

    const v20, 0x748f2392

    xor-int v3, v3, v20

    const v20, 0x35c57607

    goto :goto_4

    :cond_4
    const-string v0, "\u05a1\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x6179

    const v20, 0x7f30ca79

    xor-int v3, v3, v20

    const v20, 0x6293142

    goto :goto_4

    :sswitch_9
    const/16 v0, 0x20

    ushr-long v0, v11, v0

    long-to-int v1, v0

    long-to-int v5, v11

    .line 870
    move-object v13, v10

    check-cast v13, Ll/۟۫ܳ;

    .line 286
    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v0, :cond_5

    goto/16 :goto_1

    :cond_5
    const-string v0, "\u05a8\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x39

    xor-int v3, v0, v19

    mul-int/lit16 v3, v3, -0x2f91

    const v20, -0x2a47b1ce

    xor-int v3, v3, v20

    const v20, 0x7210a440

    :goto_4
    xor-int v20, v0, v20

    move v0, v3

    goto/16 :goto_0

    .line 876
    :sswitch_a
    invoke-virtual {v2}, Ll/᩵۫ܳ;->᩷()I

    move-result v7

    new-instance v11, Ll/ۛ۫ܳ;

    move-object v0, v11

    move-object/from16 v1, p0

    move v2, v8

    move v3, v9

    move-object/from16 v4, p2

    move/from16 v5, p4

    move/from16 v6, p1

    invoke-direct/range {v0 .. v6}, Ll/ۛ۫ܳ;-><init>(Ll/ۘ۫ܳ;II[BII)V

    invoke-virtual {v10, v8, v9, v7, v11}, Ll/֡۫ܳ;->ۙ(IIILl/᩻۫ܳ;)V

    return-void

    :sswitch_b
    move-object/from16 v0, p0

    .line 866
    invoke-direct {v0, v8, v9}, Ll/ۘ۫ܳ;->ۤ(II)J

    move-result-wide v11

    const-wide/16 v22, -0x1

    .line 867
    iget-object v10, v0, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    cmp-long v3, v11, v22

    if-eqz v3, :cond_6

    const-string v3, "\u1a7b\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v19

    move/from16 v20, v1

    xor-int v1, v3, v18

    mul-int/lit16 v1, v1, 0x4b3b

    const v22, -0x334e8e1

    xor-int v1, v1, v22

    const v22, -0x3ffdc80a

    xor-int v3, v3, v22

    move v0, v1

    move/from16 v1, v20

    move/from16 v20, v3

    goto/16 :goto_0

    :cond_6
    move/from16 v20, v1

    const-string v1, "\u05a8\u06d9"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, 0x4119

    const v22, 0x22ffe3e9

    xor-int v3, v3, v22

    const v22, -0x31b597cf    # -8.489565E8f

    goto :goto_5

    :sswitch_c
    move-object/from16 v0, p0

    return-void

    :sswitch_d
    move-object/from16 v0, p0

    move/from16 v20, v1

    .line 861
    iget-object v2, v0, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    invoke-virtual {v2}, Ll/᩵۫ܳ;->᩷()I

    move-result v1

    const/16 v21, 0x0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_7

    const-string v1, "\u06d8\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x59

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x7951

    const v22, -0x59c0a99c

    xor-int v3, v3, v22

    const v22, 0x3401b721

    goto :goto_5

    :cond_7
    const-string v1, "\u1a75\u0730"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x1d

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, 0x679f

    const v22, -0x50c32c37

    xor-int v3, v3, v22

    const v22, 0x637a3543

    :goto_5
    xor-int v1, v1, v22

    move v0, v3

    goto :goto_6

    :sswitch_e
    move-object/from16 v0, p0

    move/from16 v20, v1

    .line 856
    iget v1, v0, Ll/ۘ۫ܳ;->᩷:I

    invoke-static {v6, v1}, Ll/ۖ֡;->ܰۜ۬(II)I

    move-result v8

    .line 857
    iget v1, v0, Ll/ۘ۫ܳ;->ۙ:I

    move/from16 v3, p3

    invoke-static {v3, v1}, Ll/᩺;->ܿۘܿ(II)I

    move-result v9

    if-lt v8, v9, :cond_8

    const-string v1, "\u05ab\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v22, v1, v18

    mul-int/lit8 v22, v22, -0x37

    const v23, -0x3db738d0

    xor-int v22, v22, v23

    const v23, 0x1903cd5e

    xor-int v1, v1, v23

    move/from16 v0, v22

    goto :goto_6

    :cond_8
    const-string v1, "\u06d7\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x15

    xor-int v0, v1, v19

    mul-int/lit16 v0, v0, 0xccb

    const v22, -0x6a76f96a

    xor-int v0, v0, v22

    const v22, 0xf19778f

    xor-int v1, v1, v22

    :goto_6
    move/from16 v24, v20

    move/from16 v20, v1

    goto/16 :goto_c

    :sswitch_f
    move/from16 v3, p3

    move/from16 v20, v1

    .line 766
    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v0, :cond_9

    goto :goto_7

    :cond_9
    const-string v0, "\u073f\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x65

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x64b7

    const v22, 0xa1ce104

    xor-int v1, v1, v22

    const v22, 0x4ae9e303    # 7664001.5f

    goto/16 :goto_b

    :sswitch_10
    move/from16 v3, p3

    move/from16 v20, v1

    .line 140
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v0

    if-eqz v0, :cond_a

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u0733\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x7d

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x6561

    const v22, -0x2fa634f5

    xor-int v1, v1, v22

    const v22, 0x1fa73200

    goto/16 :goto_b

    :sswitch_11
    move/from16 v3, p3

    move/from16 v20, v1

    .line 522
    sget-boolean v0, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v0, :cond_b

    :goto_7
    const-string v0, "\u073d\u06e0"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x7c53

    const v22, 0x473737da

    xor-int v1, v1, v22

    const v22, 0x1b0b755c

    goto/16 :goto_b

    :cond_b
    const-string v0, "\u0736\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x2b97

    const v22, 0x60369426

    xor-int v1, v1, v22

    const v22, -0xc36ddb9

    goto/16 :goto_b

    :sswitch_12
    move/from16 v3, p3

    move/from16 v20, v1

    sget v0, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v0, :cond_c

    goto :goto_8

    :cond_c
    const-string v0, "\u05ab\u073d"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, 0x17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x7833

    const v22, -0x1dd936f8

    xor-int v1, v1, v22

    const v22, -0x2ec59ccb

    goto/16 :goto_b

    :sswitch_13
    move/from16 v3, p3

    move/from16 v20, v1

    .line 247
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v0

    if-gtz v0, :cond_d

    goto/16 :goto_9

    :cond_d
    const-string v0, "\u1a76\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x7863

    const v22, 0x59f4090c

    xor-int v1, v1, v22

    const v22, 0x12b7b0dd

    goto/16 :goto_b

    :sswitch_14
    move/from16 v3, p3

    move/from16 v20, v1

    .line 455
    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v0, :cond_e

    goto :goto_9

    :cond_e
    const-string v0, "\u1a7a\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x4b

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x7fb1

    const v22, -0xccecd18

    xor-int v1, v1, v22

    const v22, -0x3ebad0dc

    goto/16 :goto_b

    :sswitch_15
    move/from16 v3, p3

    move/from16 v20, v1

    .line 408
    sget v0, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v0, :cond_f

    :goto_8
    const-string v0, "\u1a7a\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0xaa9

    const v22, 0x576a47a5

    xor-int v1, v1, v22

    const v22, -0x42994a3d

    goto/16 :goto_b

    :cond_f
    const-string v0, "\u06e1\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x23

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x12d

    const v22, -0x44043082

    xor-int v1, v1, v22

    const v22, -0x217071df

    goto/16 :goto_b

    :sswitch_16
    move/from16 v3, p3

    move/from16 v20, v1

    .line 579
    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_10

    :goto_9
    const-string v0, "\u06e2\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x59

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x3aa7

    const v22, -0x5356868c

    xor-int v1, v1, v22

    const v22, -0x1ea5a05a

    goto :goto_b

    :cond_10
    const-string v0, "\u06e4\u06e1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x41

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x4c7

    const v22, -0x3f5f6aab

    xor-int v1, v1, v22

    const v22, -0x1c209cb1

    goto :goto_b

    :sswitch_17
    move/from16 v3, p3

    move/from16 v20, v1

    .line 531
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v0

    if-gtz v0, :cond_11

    move/from16 v1, v20

    :goto_a
    const-string v0, "\u06df\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    move/from16 v20, v1

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x13bb

    const v22, 0x23df2ee

    xor-int v1, v1, v22

    const v22, 0x3202fda9

    goto :goto_b

    :cond_11
    const-string v0, "\u06e4\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x6d

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0xfab

    const v22, -0x4b2e6102

    xor-int v1, v1, v22

    const v22, 0x86128c2

    :goto_b
    xor-int v0, v0, v22

    move/from16 v24, v20

    move/from16 v20, v0

    move v0, v1

    :goto_c
    move/from16 v1, v24

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f083ee8 -> :sswitch_13
        -0x7eb59bc6 -> :sswitch_e
        -0x58ca9354 -> :sswitch_14
        -0x55363246 -> :sswitch_e
        -0x53e706a3 -> :sswitch_a
        -0x4f625d25 -> :sswitch_b
        -0x4658ac7f -> :sswitch_15
        -0x418a897b -> :sswitch_b
        -0x366d837a -> :sswitch_7
        -0x30e6b9ae -> :sswitch_1
        -0x2bc6b8f5 -> :sswitch_16
        -0x2b0a5cf5 -> :sswitch_16
        -0x2194a8e1 -> :sswitch_13
        -0x20c856fd -> :sswitch_3
        -0x1fb249af -> :sswitch_d
        -0x1dcf6cb1 -> :sswitch_f
        -0x19179ace -> :sswitch_5
        -0x1625c0bf -> :sswitch_3
        -0x15448144 -> :sswitch_d
        -0x1211f5a5 -> :sswitch_1
        -0xed9f9f6 -> :sswitch_12
        -0xaf6a1f5 -> :sswitch_c
        -0xa410d07 -> :sswitch_9
        -0x96f083c -> :sswitch_f
        -0x468aa35 -> :sswitch_5
        0x2d252a8 -> :sswitch_11
        0x51517ee -> :sswitch_11
        0x5dbc2c9 -> :sswitch_0
        0x7bddf5d -> :sswitch_4
        0x85d50ea -> :sswitch_10
        0x10f8b599 -> :sswitch_17
        0x28115991 -> :sswitch_15
        0x2b203be0 -> :sswitch_6
        0x2bf17f3e -> :sswitch_4
        0x2cbc8530 -> :sswitch_c
        0x2eb46cd0 -> :sswitch_0
        0x33967a33 -> :sswitch_7
        0x339fbc95 -> :sswitch_10
        0x38a37105 -> :sswitch_8
        0x44061980 -> :sswitch_17
        0x4735c65c -> :sswitch_6
        0x4929cb00 -> :sswitch_9
        0x506d4f57 -> :sswitch_14
        0x516f535f -> :sswitch_a
        0x52f76e28 -> :sswitch_2
        0x546ac8b2 -> :sswitch_2
        0x698dcd0b -> :sswitch_8
        0x70e6d944 -> :sswitch_12
    .end sparse-switch
.end method

.method public final ۙ(Ljava/io/DataOutputStream;III)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v22, 0x66e010f7

    sget v23, Ll/ۧ;->ۨۗܰ:I

    sget v24, Ll/֨ۢ;->۬ܿܺ:I

    const-string v25, "\u06db\u06e2"

    invoke-static/range {v25 .. v25}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v25

    sub-int v25, v23, v25

    mul-int/lit8 v25, v25, -0x45

    xor-int v3, v25, v24

    mul-int/lit16 v3, v3, -0x7b75

    const v27, -0x19f3f22a

    xor-int v3, v3, v27

    const v27, -0x31bd43c9

    xor-int v25, v25, v27

    move-wide/from16 v26, v8

    move-wide v13, v12

    move-object/from16 v6, v16

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v28, 0x0

    move-object/from16 v16, v5

    move-object v8, v7

    move-wide v11, v10

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_0
    xor-int v9, v22, v24

    mul-int/lit16 v9, v9, 0x5325

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v3, v9

    xor-int v22, v25, v3

    sparse-switch v22, :sswitch_data_0

    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v21, v19

    move/from16 v25, v28

    move/from16 v19, v0

    .line 1101
    sget v0, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v0, :cond_10

    goto/16 :goto_10

    .line 575
    :sswitch_0
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v3

    if-gtz v3, :cond_0

    goto :goto_3

    :cond_0
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v21, v19

    move/from16 v25, v28

    move/from16 v19, v0

    goto/16 :goto_11

    .line 521
    :sswitch_1
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v3, :cond_1

    :goto_1
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    :goto_2
    move/from16 v21, v19

    move/from16 v25, v28

    move/from16 v19, v0

    goto/16 :goto_10

    :cond_1
    :goto_3
    const-string v3, "\u0733\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v24

    xor-int v9, v3, v23

    mul-int/lit16 v9, v9, -0x3ab

    const v10, 0x6c46439

    xor-int/2addr v9, v10

    const v10, 0x3d4e1db9

    xor-int v25, v3, v10

    goto/16 :goto_8

    .line 1135
    :sswitch_2
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v21, v19

    move/from16 v25, v28

    move/from16 v19, v0

    goto/16 :goto_f

    :sswitch_3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    return-void

    :sswitch_5
    move/from16 v3, p4

    .line 1017
    invoke-static {v1, v3}, Ll/֨ܿ;->ܰ۫᩹(Ljava/lang/Object;I)V

    sub-int v0, v4, v2

    .line 1018
    invoke-static {v1, v0}, Ll/֨ܿ;->ܰ۫᩹(Ljava/lang/Object;I)V

    sub-int/2addr v5, v4

    .line 1019
    invoke-static {v1, v5}, Ll/ۗۖ;->ۜ۬֫(Ljava/lang/Object;I)V

    .line 1020
    invoke-virtual {v6, v1, v2}, Ll/֡۫ܳ;->ۙ(Ljava/io/DataOutputStream;I)V

    return-void

    .line 1015
    :sswitch_6
    new-instance v0, Ljava/io/IOException;

    sget-object v1, Ll/ۘ۫ܳ;->᩶ᩳ᩸:[S

    const/16 v2, 0x1d

    const/16 v3, 0x22

    invoke-static {v1, v2, v3, v7}, Ll/ۘ۟;->᩷᩶۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_7
    move/from16 v3, p4

    .line 1014
    invoke-virtual {v6}, Ll/֡۫ܳ;->ۤ()I

    move-result v9

    if-eqz v9, :cond_3

    const-string v9, "\u0730\u06d6"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v23, v9

    mul-int/lit8 v9, v9, -0x79

    xor-int v10, v9, v24

    mul-int/lit16 v10, v10, 0x7b69

    const v21, -0x11ccdd48

    xor-int v10, v10, v21

    const v21, 0x611cd2ba

    goto :goto_4

    :cond_3
    const-string v9, "\u06e1\u073a"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v24

    xor-int v10, v9, v23

    mul-int/lit16 v10, v10, 0x4193

    const v21, 0x5b790ebc

    xor-int v10, v10, v21

    const v21, 0x4cc16af0

    :goto_4
    xor-int v25, v9, v21

    goto/16 :goto_a

    :sswitch_8
    move/from16 v3, p4

    .line 1159
    invoke-static {}, Ll/ۧ۫ܳ;->᩸()Ll/ۧ۫ܳ;

    move-result-object v6

    goto :goto_5

    :sswitch_9
    move/from16 v3, p4

    .line 1161
    new-array v9, v0, [I

    const/4 v10, 0x0

    .line 1162
    filled-new-array {v10}, [I

    move-result-object v10

    .line 1163
    new-instance v1, Ll/᩶۫ܳ;

    .line 635
    sget v21, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v21, :cond_4

    move-object/from16 v9, p0

    move/from16 v10, p3

    goto/16 :goto_2

    .line 1163
    :cond_4
    invoke-direct {v1, v9, v10}, Ll/᩶۫ܳ;-><init>([I[I)V

    invoke-virtual {v8, v15, v5, v1}, Ll/֡۫ܳ;->ۙ(IILl/᩻۫ܳ;)V

    .line 1164
    invoke-static {v0, v9}, Ll/֡۫ܳ;->ۙ(I[I)Ll/֡۫ܳ;

    move-result-object v1

    move-object v6, v1

    goto :goto_5

    :sswitch_a
    move/from16 v3, p4

    if-nez v0, :cond_5

    const-string v1, "\u073d\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v9, v1, v24

    mul-int/lit16 v9, v9, -0xc17

    const v10, -0x594af9c1

    xor-int/2addr v9, v10

    const v10, 0x76df725e

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u06df\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v24, v1

    mul-int/lit8 v1, v1, 0x51

    xor-int v9, v1, v23

    mul-int/lit16 v9, v9, 0x490d

    const v10, 0x4c001266    # 3.357327E7f

    xor-int/2addr v9, v10

    const v10, -0x3249806a

    goto/16 :goto_7

    :sswitch_b
    move/from16 v3, p4

    .line 1154
    invoke-virtual {v8, v15, v5}, Ll/֡۫ܳ;->ۙ(II)I

    move-result v0

    .line 1155
    invoke-virtual {v8}, Ll/֡۫ܳ;->ۤ()I

    move-result v1

    if-ne v0, v1, :cond_6

    move-object v6, v8

    :goto_5
    const-string v1, "\u1a79\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v23, v1

    mul-int/lit8 v1, v1, 0x1f

    xor-int v9, v1, v24

    mul-int/lit16 v9, v9, 0x6ca1

    const v10, 0x66ffd55c

    xor-int/2addr v9, v10

    const v10, 0x32a7999c

    goto :goto_7

    :cond_6
    const-string v1, "\u073d\u06d8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v9, v1, v23

    mul-int/lit16 v9, v9, -0x1af9

    const v10, -0x7e08b3ba

    xor-int/2addr v9, v10

    const v10, 0x5fdfbe3

    goto :goto_7

    :sswitch_c
    move/from16 v3, p4

    const/high16 v1, -0x80000000

    const/high16 v15, -0x80000000

    goto :goto_6

    :sswitch_d
    move/from16 v3, p4

    long-to-int v1, v13

    move v15, v1

    :goto_6
    const-string v1, "\u073d\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v9, v1, v24

    mul-int/lit16 v9, v9, -0x89b

    const v10, -0x790ec30f

    xor-int/2addr v9, v10

    const v10, 0x4388b919

    goto :goto_7

    :sswitch_e
    move/from16 v3, p4

    add-long v13, v26, v11

    const-wide/32 v9, -0x80000000

    cmp-long v1, v13, v9

    if-gtz v1, :cond_7

    const-string v1, "\u1a78\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    mul-int/lit8 v1, v1, -0x2d

    xor-int v9, v1, v24

    mul-int/lit16 v9, v9, 0x390d

    const v10, -0x2980aae4

    xor-int/2addr v9, v10

    const v10, -0x14e7da38

    goto :goto_7

    :cond_7
    const-string v1, "\u06d6\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, -0x69

    xor-int v9, v1, v23

    mul-int/lit16 v9, v9, -0x9e1

    const v10, 0x7a0acb2d

    xor-int/2addr v9, v10

    const v10, -0x21b67bf2

    :goto_7
    xor-int v25, v1, v10

    move-object/from16 v1, p1

    :goto_8
    move v3, v9

    goto/16 :goto_0

    :sswitch_f
    move/from16 v3, p4

    int-to-long v9, v4

    move/from16 v1, v19

    int-to-long v11, v1

    sub-long v26, v9, v11

    const-wide/16 v11, 0x1

    .line 633
    sget v9, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v9, :cond_8

    move-object/from16 v9, p0

    move/from16 v10, p3

    goto :goto_9

    :cond_8
    const-string v9, "\u1a73\u06df"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v24

    xor-int v10, v9, v23

    mul-int/lit16 v10, v10, -0x1131

    const v19, -0x6622e8f8

    xor-int v10, v10, v19

    const v19, 0x2b4916d4

    xor-int v25, v9, v19

    move/from16 v19, v1

    move v3, v10

    goto/16 :goto_e

    :sswitch_10
    move/from16 v3, p4

    .line 1013
    invoke-virtual/range {v16 .. v16}, Ll/᩵۫ܳ;->᩷()I

    move-result v19

    move-object/from16 v9, p0

    .line 1012
    iget-object v8, v9, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    invoke-static {v8}, Ll/ܽ;->ۜ᩻֨(Ljava/lang/Object;)Ljava/lang/Class;

    sget v1, Ll/᩺;->۫۬۫:I

    if-gtz v1, :cond_9

    move/from16 v10, p3

    move/from16 v1, v19

    :goto_9
    move/from16 v19, v0

    goto/16 :goto_c

    :cond_9
    const-string v1, "\u0733\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v10, v1, v24

    mul-int/lit16 v10, v10, -0x5695

    const v21, 0x36bac8ae

    xor-int v10, v10, v21

    const v21, 0x41cc2390

    xor-int v25, v1, v21

    move-object/from16 v1, p1

    :goto_a
    move v3, v10

    goto/16 :goto_0

    :sswitch_11
    move-object/from16 v9, p0

    move/from16 v3, p4

    move/from16 v1, v19

    .line 1010
    iget v4, v9, Ll/ۘ۫ܳ;->᩷:I

    invoke-static {v2, v4}, Ll/ۖ֡;->ܰۜ۬(II)I

    move-result v4

    .line 1011
    iget v5, v9, Ll/ۘ۫ܳ;->ۙ:I

    move/from16 v10, p3

    invoke-static {v10, v5}, Ll/ۖۖ;->ۨ۟᩻(II)I

    move-result v5

    move/from16 v19, v0

    .line 1012
    iget-object v0, v9, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    sget v16, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v16, :cond_a

    move-object/from16 v16, v0

    move/from16 v21, v1

    move/from16 v25, v28

    goto/16 :goto_f

    :cond_a
    const-string v16, "\u1a79\u06e0"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v23

    move-object/from16 v21, v0

    xor-int v0, v16, v24

    mul-int/lit16 v0, v0, -0x4c73

    const v25, -0x78f36899

    xor-int v0, v0, v25

    const v25, -0x68047b03

    xor-int v25, v16, v25

    move v3, v0

    move/from16 v0, v19

    move-object/from16 v16, v21

    move/from16 v19, v1

    goto/16 :goto_e

    :sswitch_12
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v1, v19

    move/from16 v19, v0

    const/16 v0, 0x6609

    const/16 v7, 0x6609

    goto :goto_b

    :sswitch_13
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v1, v19

    move/from16 v19, v0

    const/16 v0, 0x202e

    const/16 v7, 0x202e

    :goto_b
    const-string v0, "\u1a7a\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    mul-int/lit8 v0, v0, -0xf

    move/from16 v21, v1

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x5a97

    const v25, -0x70f0844b

    xor-int v1, v1, v25

    const v25, 0x4f34b02d

    goto/16 :goto_d

    :sswitch_14
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v21, v19

    move/from16 v19, v0

    move/from16 v0, v28

    mul-int/lit16 v1, v0, 0xb0a

    sub-int v1, v20, v1

    if-ltz v1, :cond_b

    const-string v1, "\u06df\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    move/from16 v25, v0

    xor-int v0, v1, v23

    mul-int/lit16 v0, v0, 0x12d7

    const v28, -0x5c01c9c3

    xor-int v0, v0, v28

    const v28, 0x7c8c623

    xor-int v1, v1, v28

    move v3, v0

    move/from16 v0, v19

    move/from16 v19, v21

    move/from16 v28, v25

    move/from16 v25, v1

    goto :goto_e

    :cond_b
    move/from16 v25, v0

    const-string v0, "\u06e4\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, 0x28a3

    const v28, -0x6aef806f

    xor-int v1, v1, v28

    const v28, 0x54af4d49

    goto/16 :goto_12

    :sswitch_15
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v21, v19

    move/from16 v19, v0

    aget-short v28, v17, v18

    mul-int v0, v28, v28

    const v1, 0x1e7719

    add-int v20, v0, v1

    .line 944
    sget v0, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v0, :cond_c

    move/from16 v1, v21

    :goto_c
    const-string v0, "\u073a\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    move/from16 v21, v1

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0xdb5

    const v25, -0x4828a499

    xor-int v1, v1, v25

    const v25, -0x3b5a0388

    goto :goto_d

    :cond_c
    const-string v0, "\u1a7b\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v24, v0

    mul-int/lit8 v0, v0, 0x73

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x24fd

    const v25, -0x137f0163

    xor-int v1, v1, v25

    const v25, 0x5d6e8988

    :goto_d
    xor-int v25, v0, v25

    move v3, v1

    move/from16 v0, v19

    move/from16 v19, v21

    :goto_e
    move-object/from16 v1, p1

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v21, v19

    move/from16 v25, v28

    move/from16 v19, v0

    sget-object v17, Ll/ۘ۫ܳ;->᩶ᩳ᩸:[S

    const/16 v18, 0x1c

    .line 153
    sget v0, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v0, :cond_d

    :goto_f
    const-string v0, "\u06e4\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x11

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, -0x3c3b

    const v28, -0x7d1f562e

    xor-int v1, v1, v28

    const v28, -0x64568069

    goto/16 :goto_12

    :cond_d
    const-string v0, "\u05a8\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x7f

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, 0x142d

    const v28, -0x6d69c469

    xor-int v1, v1, v28

    const v28, -0x5f2c6ce0

    goto/16 :goto_12

    :sswitch_17
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v21, v19

    move/from16 v25, v28

    move/from16 v19, v0

    .line 372
    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_e

    goto :goto_10

    :cond_e
    const-string v0, "\u1a79\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x55ad

    const v28, 0x40284490

    xor-int v1, v1, v28

    const v28, 0x7f92531f

    goto/16 :goto_12

    :sswitch_18
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v21, v19

    move/from16 v25, v28

    move/from16 v19, v0

    .line 322
    sget-boolean v0, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v0, :cond_f

    goto :goto_10

    :cond_f
    const-string v0, "\u06e7\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x6d

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, 0x133d

    const v28, -0x71f3b69a

    xor-int v1, v1, v28

    const v28, 0x11c725e8

    goto :goto_12

    :goto_10
    const-string v0, "\u06eb\u06df"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x231d

    const v28, 0x4e7b5ad5

    xor-int v1, v1, v28

    const v28, -0x16c2a761

    goto :goto_12

    :cond_10
    const-string v0, "\u1a77\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    mul-int/lit8 v0, v0, 0x5f

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x10fd

    const v28, -0x579f5ccd

    xor-int v1, v1, v28

    const v28, -0x50ef0bd2

    goto :goto_12

    :sswitch_19
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v21, v19

    move/from16 v25, v28

    move/from16 v19, v0

    .line 151
    sget v0, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v0, :cond_11

    :goto_11
    const-string v0, "\u05ab\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v23, v0

    mul-int/lit8 v0, v0, 0x31

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, 0x756f

    const v28, 0x51040563

    xor-int v1, v1, v28

    const v28, 0x34f5f963

    goto :goto_12

    :cond_11
    const-string v0, "\u1a7b\u0733"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, -0x135

    const v28, 0xfab29f4

    xor-int v1, v1, v28

    const v28, 0x25f928b6

    :goto_12
    xor-int v0, v0, v28

    move v3, v1

    move/from16 v28, v25

    move-object/from16 v1, p1

    move/from16 v25, v0

    move/from16 v0, v19

    move/from16 v19, v21

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7eb3a3b4 -> :sswitch_15
        -0x7e68881d -> :sswitch_19
        -0x79ced998 -> :sswitch_e
        -0x71fbd411 -> :sswitch_15
        -0x715a120e -> :sswitch_17
        -0x713cc3ba -> :sswitch_1
        -0x68581f9f -> :sswitch_6
        -0x64953ecb -> :sswitch_17
        -0x6466ac04 -> :sswitch_c
        -0x635cca06 -> :sswitch_5
        -0x5d4bd814 -> :sswitch_9
        -0x5b08b52b -> :sswitch_16
        -0x595c39a8 -> :sswitch_9
        -0x58fe0ed8 -> :sswitch_19
        -0x49e21748 -> :sswitch_2
        -0x437a1978 -> :sswitch_7
        -0x427cb04c -> :sswitch_11
        -0x3dd79fc3 -> :sswitch_3
        -0x3abb3350 -> :sswitch_c
        -0x3a4cba67 -> :sswitch_18
        -0x39b271f8 -> :sswitch_12
        -0x2f14589b -> :sswitch_14
        -0x2e9592fe -> :sswitch_b
        -0x2cd1092b -> :sswitch_f
        -0x2a6fbcfe -> :sswitch_12
        -0x2351804e -> :sswitch_13
        -0x2312ee8a -> :sswitch_d
        -0x2164b5d0 -> :sswitch_a
        -0x1d3f6cfd -> :sswitch_18
        -0x1bc259cb -> :sswitch_8
        -0x19d752b8 -> :sswitch_2
        -0xfd38510 -> :sswitch_e
        -0xd616588 -> :sswitch_5
        -0x5a5c4cb -> :sswitch_7
        0x51a8c2e -> :sswitch_10
        0x57023be -> :sswitch_4
        0xf364f2c -> :sswitch_b
        0x10f7bd0f -> :sswitch_d
        0x1d455b53 -> :sswitch_0
        0x1fc34da6 -> :sswitch_0
        0x26bf5fc2 -> :sswitch_6
        0x29dd1830 -> :sswitch_1
        0x325bd323 -> :sswitch_4
        0x4a213c36 -> :sswitch_10
        0x4a82c5d3 -> :sswitch_14
        0x54370034 -> :sswitch_f
        0x57b752c7 -> :sswitch_a
        0x5abd731b -> :sswitch_3
        0x6a3a1324 -> :sswitch_11
        0x6c728231 -> :sswitch_8
        0x6f422cfc -> :sswitch_13
        0x75a14c83 -> :sswitch_16
    .end sparse-switch
.end method

.method public final ۙ([BII[J)V
    .locals 23

    move-object/from16 v7, p0

    move/from16 v5, p2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, -0x351348dc    # -7756690.0f

    sget v16, Ll/ۗ֡;->ۜ᩻۫:I

    sget v17, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v18, "\u1a7b\u06e8"

    invoke-static/range {v18 .. v18}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v17

    xor-int v0, v18, v16

    mul-int/lit16 v0, v0, -0x18f1

    const v20, -0x2e6a8647

    xor-int v0, v0, v20

    const v20, -0x377fd176

    xor-int v18, v18, v20

    move-object v11, v10

    move/from16 v19, v18

    const/4 v1, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, -0x351348dc    # -7756690.0f

    move-object v10, v4

    const/4 v4, 0x0

    :goto_0
    xor-int v7, v18, v16

    mul-int/lit16 v7, v7, -0x791

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v0, v7

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    move-object/from16 v7, p1

    move-object/from16 v0, p4

    add-int v15, v14, v13

    goto/16 :goto_3

    .line 485
    :sswitch_0
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v0, :cond_1

    :cond_0
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    goto/16 :goto_7

    :cond_1
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    goto/16 :goto_c

    .line 470
    :sswitch_1
    sget v0, Ll/ۧ;->ۨۗܰ:I

    if-gez v0, :cond_2

    :goto_1
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    goto/16 :goto_b

    :cond_2
    move-object/from16 v7, p1

    :goto_2
    move/from16 v19, v4

    move/from16 v4, p3

    goto/16 :goto_9

    :sswitch_2
    sget v0, Ll/᩺;->۫۬۫:I

    if-lez v0, :cond_0

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    return-void

    .line 902
    :sswitch_5
    invoke-static {v6}, Ll/᩵۫ܳ;->ۙ(Ll/᩵۫ܳ;)[B

    move-result-object v0

    sub-int v2, v1, v5

    sub-int v1, v4, v1

    move-object/from16 v7, p1

    invoke-static {v15, v0, v2, v7, v1}, Ll/ۢ۫ܳ;->ۙ(I[BI[BI)V

    sub-int/2addr v4, v5

    move-object/from16 v0, p4

    .line 904
    invoke-static {v2, v4, v0}, Ll/ۢ۫ܳ;->ۙ(II[J)V

    return-void

    :sswitch_6
    move-object/from16 v7, p1

    move-object/from16 v0, p4

    const/4 v15, 0x0

    goto :goto_3

    :sswitch_7
    move-object/from16 v7, p1

    move-object/from16 v0, p4

    xor-int v19, v12, v13

    shr-int/lit8 v19, v19, 0x1f

    or-int/lit8 v19, v19, 0x1

    if-lez v19, :cond_3

    move v15, v14

    :goto_3
    const-string v19, "\u073a\u06d6"

    invoke-static/range {v19 .. v19}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v16

    xor-int v0, v19, v17

    mul-int/lit16 v0, v0, 0x312d

    const v20, -0xcc4c952

    xor-int v0, v0, v20

    const v20, -0x54396a36

    xor-int v19, v19, v20

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u1a78\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    move/from16 v19, v4

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x5a5

    const v20, 0x693dee20

    xor-int v4, v4, v20

    const v20, 0x63092932

    goto :goto_4

    :sswitch_8
    move-object/from16 v7, p1

    move/from16 v19, v4

    .line 900
    invoke-static {v11}, Ll/۟۫ܳ;->ۙ(Ll/۟۫ܳ;)I

    move-result v0

    sub-int v12, v1, v0

    .line 901
    invoke-virtual {v6}, Ll/᩵۫ܳ;->᩷()I

    move-result v13

    .line 0
    rem-int v14, v12, v13

    if-nez v14, :cond_4

    const-string v0, "\u0733\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x7bc9

    const v20, 0x19e1d465

    xor-int v4, v4, v20

    const v20, 0x1a2847b6

    goto :goto_4

    :cond_4
    const-string v0, "\u1a75\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x44f5

    const v20, -0x72ff6f72

    xor-int v4, v4, v20

    const v20, -0x205cbba1

    :goto_4
    xor-int v0, v0, v20

    move/from16 v22, v19

    move/from16 v19, v0

    move v0, v4

    goto/16 :goto_5

    :sswitch_9
    move-object/from16 v7, p1

    const/16 v0, 0x20

    ushr-long v0, v2, v0

    long-to-int v1, v0

    long-to-int v4, v2

    .line 900
    move-object v11, v10

    check-cast v11, Ll/۟۫ܳ;

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v0, "\u073a\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x79

    move/from16 v19, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x19d9

    const v20, -0x7ce2b5a4

    xor-int v1, v1, v20

    const v20, -0x3927b650

    xor-int v0, v0, v20

    move/from16 v22, v19

    move/from16 v19, v0

    move v0, v1

    move/from16 v1, v22

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v7, p1

    .line 907
    invoke-virtual {v6}, Ll/᩵۫ܳ;->᩷()I

    move-result v11

    new-instance v12, Ll/ۨ۫ܳ;

    move-object v0, v12

    move-object/from16 v1, p0

    move v2, v8

    move v3, v9

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v6}, Ll/ۨ۫ܳ;-><init>(Ll/ۘ۫ܳ;II[BI[J)V

    invoke-virtual {v10, v8, v9, v11, v12}, Ll/֡۫ܳ;->ۙ(IIILl/᩻۫ܳ;)V

    :sswitch_b
    return-void

    :sswitch_c
    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v19, v4

    .line 896
    invoke-direct {v0, v8, v9}, Ll/ۘ۫ܳ;->ۤ(II)J

    move-result-wide v2

    const-wide/16 v20, -0x1

    .line 897
    iget-object v10, v0, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    iget-object v6, v0, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    cmp-long v4, v2, v20

    if-eqz v4, :cond_6

    const-string v4, "\u06eb\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v17

    move/from16 v20, v1

    xor-int v1, v4, v16

    mul-int/lit16 v1, v1, -0x6455

    const v21, -0x6768ee01

    xor-int v1, v1, v21

    const v21, -0x3e12481a

    xor-int v4, v4, v21

    move v0, v1

    move/from16 v1, v20

    move/from16 v22, v19

    move/from16 v19, v4

    :goto_5
    move/from16 v4, v22

    goto/16 :goto_0

    :cond_6
    move/from16 v20, v1

    const-string v1, "\u1a7b\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x115b

    const v21, 0x6bb9a501

    xor-int v4, v4, v21

    const v21, -0x6b86d0ce

    xor-int v1, v1, v21

    move v0, v4

    goto :goto_6

    :sswitch_d
    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    .line 891
    iget v1, v0, Ll/ۘ۫ܳ;->᩷:I

    invoke-static {v5, v1}, Ll/ۖ֡;->ܰۜ۬(II)I

    move-result v8

    .line 892
    iget v1, v0, Ll/ۘ۫ܳ;->ۙ:I

    move/from16 v4, p3

    invoke-static {v4, v1}, Ll/᩺;->ܿۘܿ(II)I

    move-result v9

    if-lt v8, v9, :cond_7

    const-string v1, "\u06ec\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v0, v1, v17

    mul-int/lit16 v0, v0, -0x6ec9

    const v21, 0x53e4728d

    xor-int v0, v0, v21

    const v21, 0x12e024dc

    xor-int v1, v1, v21

    :goto_6
    move/from16 v4, v19

    move/from16 v19, v1

    goto/16 :goto_e

    :cond_7
    const-string v0, "\u1a74\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x35

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x7eaf

    const v21, -0x6ad51ecb

    xor-int v1, v1, v21

    const v21, 0x7ce766c6

    goto/16 :goto_d

    :sswitch_e
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 670
    sget v0, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v0, :cond_8

    goto/16 :goto_a

    :cond_8
    const-string v0, "\u06d7\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x1efb

    const v21, -0x28745f02

    xor-int v1, v1, v21

    const v21, 0x7e167cc

    goto/16 :goto_d

    :sswitch_f
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_c

    :cond_9
    const-string v0, "\u073f\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x1d

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x77e9

    const v21, 0x8112d0

    xor-int v1, v1, v21

    const v21, 0x3c289af2

    goto/16 :goto_d

    :sswitch_10
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_a

    goto/16 :goto_a

    :cond_a
    const-string v0, "\u073d\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x6639

    const v21, -0x19833839

    xor-int v1, v1, v21

    const v21, 0x1f56da90

    goto/16 :goto_d

    :sswitch_11
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 103
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v0

    if-nez v0, :cond_b

    :goto_7
    const-string v0, "\u073d\u06e0"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x47d5

    const v21, -0x3095cd78

    xor-int v1, v1, v21

    const v21, 0xdc67c2d

    goto/16 :goto_d

    :cond_b
    const-string v0, "\u06db\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x1a29

    const v21, 0x36a83966

    xor-int v1, v1, v21

    const v21, -0x50d85ab0

    goto/16 :goto_d

    :sswitch_12
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 883
    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_c

    :goto_8
    move/from16 v1, v20

    goto :goto_9

    :cond_c
    const-string v0, "\u06e8\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x7b

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x24a7

    const v21, -0x5df52775

    xor-int v1, v1, v21

    const v21, -0x6bce95cd

    goto/16 :goto_d

    :sswitch_13
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 318
    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v0, :cond_d

    goto :goto_8

    :goto_9
    const-string v0, "\u073f\u06e1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x55

    move/from16 v20, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x7299

    const v21, 0x606b5b0d

    xor-int v1, v1, v21

    const v21, 0x5cf332bd

    goto/16 :goto_d

    :cond_d
    const-string v0, "\u06e2\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x2e51

    const v21, -0x26355dcb

    xor-int v1, v1, v21

    const v21, 0x7ef541e7

    goto/16 :goto_d

    :sswitch_14
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v0

    if-eqz v0, :cond_e

    :goto_a
    const-string v0, "\u1a75\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x37

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0xa11

    const v21, -0x34e8cbaf    # -9909329.0f

    xor-int v1, v1, v21

    const v21, 0x74e00c17

    goto/16 :goto_d

    :cond_e
    const-string v0, "\u06eb\u06d8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x2f

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x318f

    const v21, -0x6f4d2a60

    xor-int v1, v1, v21

    const v21, -0x4a32dc56

    goto/16 :goto_d

    :sswitch_15
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    sget v0, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v0, :cond_f

    :goto_b
    const-string v0, "\u06e0\u1a76"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x7b

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x6607

    const v21, 0x299f3c7d

    xor-int v1, v1, v21

    const v21, 0x593ebc44

    goto :goto_d

    :cond_f
    const-string v0, "\u1a79\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x3dc5

    const v21, 0x674d679d    # 9.6999646E23f

    xor-int v1, v1, v21

    const v21, 0x66ea397a

    goto :goto_d

    :sswitch_16
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v0

    if-eqz v0, :cond_10

    :goto_c
    const-string v0, "\u1a7b\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x4d

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x4e63

    const v21, -0x6d35daa0

    xor-int v1, v1, v21

    const v21, -0x61377ff2

    goto :goto_d

    :cond_10
    const-string v0, "\u05a1\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x400b

    const v21, -0x7f076923

    xor-int v1, v1, v21

    const v21, -0x7234340

    :goto_d
    xor-int v0, v0, v21

    move/from16 v4, v19

    move/from16 v19, v0

    move v0, v1

    :goto_e
    move/from16 v1, v20

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b3d9fec -> :sswitch_c
        -0x746b86f4 -> :sswitch_3
        -0x7170cf48 -> :sswitch_e
        -0x6ef1da66 -> :sswitch_11
        -0x6ed646b5 -> :sswitch_12
        -0x6cbc3c7f -> :sswitch_4
        -0x67b804b8 -> :sswitch_8
        -0x4ea97e5a -> :sswitch_d
        -0x412b3fbb -> :sswitch_16
        -0x2fa1c026 -> :sswitch_14
        -0x2d5d1a62 -> :sswitch_b
        -0x2b0a4268 -> :sswitch_d
        -0x2a5a4e5f -> :sswitch_5
        -0x26c9bb05 -> :sswitch_9
        -0x24f0f6d8 -> :sswitch_c
        -0x1f8b8195 -> :sswitch_12
        -0x1de5473c -> :sswitch_3
        -0xf75e15d -> :sswitch_f
        -0xcee7114 -> :sswitch_0
        -0xc89beb8 -> :sswitch_e
        -0xa0b7ded -> :sswitch_6
        -0x743f452 -> :sswitch_f
        -0x5dbc066 -> :sswitch_6
        -0x30fc135 -> :sswitch_a
        -0x2c32544 -> :sswitch_b
        0x741ec05 -> :sswitch_2
        0x17005792 -> :sswitch_15
        0x171ec10b -> :sswitch_4
        0x20f124a1 -> :sswitch_2
        0x214beb31 -> :sswitch_7
        0x22cd5d45 -> :sswitch_a
        0x24c81fc3 -> :sswitch_8
        0x2ae4baf5 -> :sswitch_14
        0x321921df -> :sswitch_10
        0x344cbb6d -> :sswitch_0
        0x3e01f800 -> :sswitch_13
        0x40fb5d41 -> :sswitch_10
        0x441a50bc -> :sswitch_5
        0x46e7f026 -> :sswitch_1
        0x5ab83606 -> :sswitch_15
        0x5d91640a -> :sswitch_11
        0x69174272 -> :sswitch_7
        0x6a8edffb -> :sswitch_1
        0x75be55a0 -> :sswitch_13
        0x775a5760 -> :sswitch_9
        0x7e34286e -> :sswitch_16
    .end sparse-switch
.end method

.method public final ۙ(II)Z
    .locals 19

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const v13, -0x7878075a

    sget v14, Ll/ۖۙ;->ۤۧۤ:I

    sget v15, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v16, "\u06df\u1a77"

    invoke-static/range {v16 .. v16}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    xor-int v1, v16, v15

    mul-int/lit16 v1, v1, 0x70f9

    const v18, -0x6a20467d

    xor-int v1, v1, v18

    const v18, 0x7cb3da72

    xor-int v16, v16, v18

    move-wide v11, v10

    move/from16 v17, v16

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v13, 0x0

    const v16, -0x7878075a

    const/16 v18, 0x0

    move-wide v9, v8

    move-wide v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v2, v16, v15

    mul-int/lit16 v2, v2, -0x766f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v1, v2

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    .line 953
    iget-object v1, v0, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    .line 954
    invoke-virtual {v1}, Ll/᩵۫ܳ;->᩷()I

    move-result v5

    iget-object v6, v0, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    .line 396
    sget v1, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v1, :cond_7

    goto/16 :goto_b

    .line 215
    :sswitch_0
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    sget v1, Ll/ۗܰ;->ܶۜ۬:I

    if-gez v1, :cond_0

    :goto_1
    move/from16 v17, v18

    goto/16 :goto_a

    :cond_0
    move/from16 v17, v18

    goto/16 :goto_7

    .line 689
    :sswitch_1
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v1

    if-lez v1, :cond_e

    goto/16 :goto_3

    .line 364
    :sswitch_2
    sget-boolean v1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v1, :cond_5

    goto :goto_1

    .line 1117
    :sswitch_3
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    goto :goto_1

    .line 781
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    const/4 v1, 0x0

    return v1

    :sswitch_5
    const/4 v1, 0x1

    return v1

    .line 1147
    :sswitch_6
    invoke-virtual {v6, v13, v4}, Ll/֡۫ܳ;->ۙ(II)I

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "\u073d\u06df"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x35

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x3e0f

    const v17, -0x5438e8a7

    xor-int v2, v2, v17

    const v17, -0x7afb171e

    goto/16 :goto_4

    :cond_1
    move/from16 v2, v18

    goto/16 :goto_5

    :sswitch_7
    const/high16 v1, -0x80000000

    const/high16 v13, -0x80000000

    goto :goto_2

    :sswitch_8
    long-to-int v1, v11

    move v13, v1

    :goto_2
    const-string v1, "\u1a74\u06e0"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, 0x4325

    const v17, -0x7d53af29

    xor-int v2, v2, v17

    const v17, 0x5fcaafa4

    goto/16 :goto_4

    :sswitch_9
    const-wide/32 v1, -0x80000000

    cmp-long v17, v11, v1

    if-gtz v17, :cond_2

    const-string v1, "\u1a7a\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, -0x1071

    const v17, 0x60762189

    xor-int v2, v2, v17

    const v17, 0x401be253

    goto/16 :goto_4

    :cond_2
    const-string v1, "\u06dc\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x69

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x37a7

    const v17, -0x7b818601

    xor-int v2, v2, v17

    const v17, -0xe43ba4c

    goto/16 :goto_4

    :sswitch_a
    sub-long v1, v7, v9

    const-wide/16 v11, 0x1

    add-long/2addr v11, v1

    sget-boolean v1, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v1, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string v1, "\u073a\u0733"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x4b

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x1fbd

    const v17, -0x38d20db3

    xor-int v2, v2, v17

    const v17, -0x613c9159

    goto :goto_4

    :sswitch_b
    int-to-long v7, v3

    int-to-long v9, v5

    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v1, :cond_4

    move/from16 v17, v18

    goto/16 :goto_9

    :cond_4
    const-string v1, "\u06e2\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x65

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, 0x68f1

    const v17, 0x1f38916c

    xor-int v2, v2, v17

    const v17, -0x4e2724d0

    goto :goto_4

    .line 954
    :sswitch_c
    invoke-static {v6}, Ll/ܽ;->ۜ᩻֨(Ljava/lang/Object;)Ljava/lang/Class;

    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_6

    :cond_5
    :goto_3
    const-string v1, "\u1a76\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x3d

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x6229

    const v17, 0x52d524ac

    xor-int v2, v2, v17

    const v17, 0x6ca794ab

    goto :goto_4

    :cond_6
    const-string v1, "\u073f\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x9

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x62fb

    const v17, -0x604fe860

    xor-int v2, v2, v17

    const v17, -0x4956ac86

    goto :goto_4

    :cond_7
    const-string v1, "\u0736\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, -0x7f07

    const v17, -0x16a7fe73

    xor-int v2, v2, v17

    const v17, -0x7286e952

    :goto_4
    xor-int v17, v1, v17

    goto :goto_6

    :sswitch_d
    const/4 v1, 0x0

    return v1

    :sswitch_e
    move/from16 v1, p1

    move/from16 v2, v18

    .line 951
    invoke-static {v1, v2}, Ll/ۖܰ;->ܰۛۖ(II)I

    move-result v3

    .line 952
    iget v4, v0, Ll/ۘ۫ܳ;->ۙ:I

    move/from16 v1, p2

    invoke-static {v1, v4}, Ll/ۖۖ;->ۨ۟᩻(II)I

    move-result v4

    if-ge v3, v4, :cond_8

    const-string v17, "\u06e7\u06dc"

    invoke-static/range {v17 .. v17}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v14

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, 0x689d

    const v18, 0x6054dfd1

    xor-int v1, v1, v18

    const v18, -0x1e335a4c

    xor-int v17, v17, v18

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_8
    :goto_5
    const-string v1, "\u06d6\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    move/from16 v17, v2

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0xbe1

    const v18, -0x21b41a53

    xor-int v2, v2, v18

    const v18, 0x50d46e21

    xor-int v1, v1, v18

    move/from16 v18, v17

    move/from16 v17, v1

    :goto_6
    move v1, v2

    goto/16 :goto_0

    .line 951
    :sswitch_f
    iget v1, v0, Ll/ۘ۫ܳ;->᩷:I

    sget-boolean v2, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v2, :cond_9

    move/from16 v18, v1

    goto/16 :goto_b

    :cond_9
    const-string v2, "\u073a\u06d9"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v14, v2

    mul-int/lit8 v2, v2, -0x39

    xor-int v0, v2, v15

    mul-int/lit16 v0, v0, 0x7cd3

    const v17, 0x2100a8c5

    xor-int v0, v0, v17

    const v17, -0x65b6f280

    xor-int v17, v2, v17

    move/from16 v18, v1

    move v1, v0

    goto/16 :goto_d

    :sswitch_10
    move/from16 v17, v18

    .line 282
    sget v0, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v0, :cond_a

    :goto_7
    const-string v0, "\u073a\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x432d

    const v2, -0x2a9c16a

    xor-int/2addr v1, v2

    const v2, 0x6d7b56df

    goto/16 :goto_c

    :cond_a
    const-string v0, "\u0733\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x7d

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x2ab

    const v2, 0x3b3c3102

    xor-int/2addr v1, v2

    const v2, -0x7e7b28c1

    goto/16 :goto_c

    :sswitch_11
    move/from16 v17, v18

    .line 699
    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v0, :cond_b

    :goto_8
    move/from16 v18, v17

    goto/16 :goto_b

    :cond_b
    const-string v0, "\u06dc\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x1b1f

    const v2, 0x1d32ff90

    xor-int/2addr v1, v2

    const v2, -0x3fbff5e5    # -3.0006168f

    goto/16 :goto_c

    :sswitch_12
    move/from16 v17, v18

    .line 827
    sget v0, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v0, :cond_c

    :goto_9
    const-string v0, "\u1a75\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x6b

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x21d1

    const v2, -0x728f758b

    xor-int/2addr v1, v2

    const v2, -0x391a73ff

    goto/16 :goto_c

    :cond_c
    const-string v0, "\u06d6\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x3099

    const v2, 0x7c72a8f9

    xor-int/2addr v1, v2

    const v2, 0x6b5fb00f

    goto :goto_c

    :sswitch_13
    move/from16 v17, v18

    .line 737
    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_d

    :goto_a
    const-string v0, "\u1a78\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x7775

    const v2, 0x21e8cf95

    xor-int/2addr v1, v2

    const v2, 0x741f5a13

    goto :goto_c

    :cond_d
    const-string v0, "\u1a7b\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x38b1

    const v2, -0xb25b52b

    xor-int/2addr v1, v2

    const v2, -0x4a91eed8

    goto :goto_c

    :sswitch_14
    move/from16 v17, v18

    .line 377
    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_f

    goto :goto_8

    :cond_e
    :goto_b
    const-string v0, "\u06d6\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x3597

    const v2, -0x6ac1ebf4

    xor-int/2addr v1, v2

    const v2, 0x26a694f8

    xor-int v17, v0, v2

    goto :goto_d

    :cond_f
    const-string v0, "\u1a7a\u1a76"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x7

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x567b

    const v2, 0x68354f6b

    xor-int/2addr v1, v2

    const v2, 0x7b60c491

    :goto_c
    xor-int/2addr v0, v2

    move/from16 v18, v17

    move/from16 v17, v0

    :goto_d
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75245517 -> :sswitch_a
        -0x6e316a0f -> :sswitch_12
        -0x6246560c -> :sswitch_f
        -0x5fd7739a -> :sswitch_d
        -0x4e76e7ad -> :sswitch_13
        -0x4a24f7b7 -> :sswitch_8
        -0x37909320 -> :sswitch_7
        -0x2891ca15 -> :sswitch_3
        -0x2841ab3e -> :sswitch_6
        -0x257653d5 -> :sswitch_9
        -0x1af392d2 -> :sswitch_1
        -0x18795bac -> :sswitch_1
        -0x160e072d -> :sswitch_7
        -0xc13e282 -> :sswitch_10
        -0xb3b0b80 -> :sswitch_14
        -0xa4dc8c8 -> :sswitch_b
        -0x3942a99 -> :sswitch_4
        0xebc894 -> :sswitch_b
        0x205c588 -> :sswitch_2
        0x2ea36b9 -> :sswitch_12
        0x50e314e -> :sswitch_c
        0x5e9da9d -> :sswitch_f
        0x714f98a -> :sswitch_6
        0x7c0426d -> :sswitch_e
        0x9c8c853 -> :sswitch_8
        0xd46c681 -> :sswitch_0
        0x10d5a2e1 -> :sswitch_5
        0x15b45eb4 -> :sswitch_11
        0x2218768e -> :sswitch_c
        0x27aad659 -> :sswitch_4
        0x31ccab08 -> :sswitch_9
        0x31fec592 -> :sswitch_0
        0x3fb01b4f -> :sswitch_13
        0x4837248f -> :sswitch_10
        0x4ddc56c0 -> :sswitch_e
        0x4ffce178 -> :sswitch_11
        0x50ce3ae1 -> :sswitch_3
        0x56601141 -> :sswitch_5
        0x645e94f2 -> :sswitch_2
        0x672666df -> :sswitch_a
        0x747708a6 -> :sswitch_d
        0x7b8db4ac -> :sswitch_14
    .end sparse-switch
.end method

.method public final ۙ(Ll/ܺ۫ܳ;)Z
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x3a677ba4

    sget v3, Ll/ۖ;->ܿۚ֡:I

    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    const-string v5, "\u05a1\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x313f

    const v7, -0x5eb38be3

    xor-int/2addr v6, v7

    const v7, -0xca3a35c

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x6df5

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    const/4 p1, 0x1

    return p1

    .line 780
    :sswitch_0
    sget v5, Ll/᩺;->۫۬۫:I

    if-lez v5, :cond_c

    goto/16 :goto_4

    .line 570
    :sswitch_1
    sget v5, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v5, :cond_a

    goto/16 :goto_1

    .line 287
    :sswitch_2
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_1

    .line 160
    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto/16 :goto_1

    .line 70
    :sswitch_4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    const/4 p1, 0x0

    return p1

    .line 984
    :sswitch_5
    iget-object v5, p0, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    iget-object v6, v0, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    .line 985
    invoke-virtual {v5, v6}, Ll/֡۫ܳ;->ۙ(Ll/֡۫ܳ;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "\u06e7\u0736"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5c45

    const v7, 0x26f61ff7

    xor-int/2addr v6, v7

    const v7, -0x75250720

    goto :goto_0

    .line 984
    :sswitch_6
    iget-object v5, v0, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    invoke-virtual {v5}, Ll/᩵۫ܳ;->᩷()I

    move-result v5

    if-ne v1, v5, :cond_1

    const-string v5, "\u1a75\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5e33

    const v7, 0x7d692260

    xor-int/2addr v6, v7

    const v7, -0x7da97b44

    goto :goto_0

    .line 981
    :sswitch_7
    iget-object v1, p0, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    .line 984
    invoke-virtual {v1}, Ll/᩵۫ܳ;->᩷()I

    move-result v1

    .line 262
    sget v5, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u1a78\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1f7b

    const v7, -0x4051b9bd

    xor-int/2addr v6, v7

    const v7, -0x20e1c7fa

    goto/16 :goto_0

    .line 981
    :sswitch_8
    iget v5, p0, Ll/ۘ۫ܳ;->ۙ:I

    iget v6, v0, Ll/ۘ۫ܳ;->ۙ:I

    if-ne v5, v6, :cond_1

    const-string v5, "\u1a79\u06d8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5a4b

    const v7, 0x6e7effe2

    xor-int/2addr v6, v7

    const v7, -0x74fadd6d

    goto/16 :goto_0

    :sswitch_9
    move-object v0, p1

    check-cast v0, Ll/ۘ۫ܳ;

    iget v5, p0, Ll/ۘ۫ܳ;->᩷:I

    iget v6, v0, Ll/ۘ۫ܳ;->᩷:I

    if-ne v5, v6, :cond_1

    const-string v5, "\u1a79\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x19

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x68a5

    const v7, 0x3476a7f8

    xor-int/2addr v6, v7

    const v7, 0x7f5daa20

    goto/16 :goto_0

    :sswitch_a
    const/4 p1, 0x0

    return p1

    .line 985
    :sswitch_b
    instance-of v5, p1, Ll/ۘ۫ܳ;

    if-eqz v5, :cond_1

    const-string v5, "\u0730\u06e7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x117f

    const v7, -0x4110bce1

    xor-int/2addr v6, v7

    const v7, 0x32e1691a

    goto/16 :goto_0

    :cond_1
    const-string v5, "\u06da\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x5

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x390f

    const v7, 0x43666c8e

    xor-int/2addr v6, v7

    const v7, -0x51a07d8

    goto/16 :goto_0

    .line 454
    :sswitch_c
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_2

    :goto_1
    const-string v5, "\u06e7\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x3

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7721

    const v7, 0x57098623

    xor-int/2addr v6, v7

    const v7, -0x2f3dcba4

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u073a\u06d6"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x5d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x57e7

    const v7, 0x2ee18eac

    xor-int/2addr v6, v7

    const v7, 0x7cd95aff

    goto/16 :goto_0

    .line 549
    :sswitch_d
    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u06e2\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6c53

    const v7, -0x61e59d36

    xor-int/2addr v6, v7

    const v7, -0x19483f8a

    goto/16 :goto_0

    .line 874
    :sswitch_e
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u1a73\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xf1

    const v7, 0x12cdab9b

    xor-int/2addr v6, v7

    const v7, -0x4d462121

    goto/16 :goto_0

    .line 832
    :sswitch_f
    sget-boolean v5, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    const-string v5, "\u06d8\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x67

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7dcf

    const v7, -0x3f3b7586

    xor-int/2addr v6, v7

    const v7, 0x230c2211

    goto/16 :goto_0

    .line 712
    :sswitch_10
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v5

    if-eqz v5, :cond_6

    :goto_2
    const-string v5, "\u06d9\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3473

    const v7, -0x1df49df5

    xor-int/2addr v6, v7

    const v7, 0x5b25710

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u073d\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5b73

    const v7, 0x57239edb

    xor-int/2addr v6, v7

    const v7, 0x3e564193

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_5

    :cond_7
    const-string v5, "\u1a78\u06d8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7903

    const v7, -0x7b548f8e

    xor-int/2addr v6, v7

    const v7, -0x69a7a093

    goto/16 :goto_0

    .line 181
    :sswitch_12
    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v5, :cond_9

    :cond_8
    :goto_3
    const-string v5, "\u1a7a\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x671

    const v7, 0x6d4ff429

    xor-int/2addr v6, v7

    const v7, -0x74b5c8c3

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06da\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7dc7

    const v7, 0x2e107040

    xor-int/2addr v6, v7

    const v7, -0x1de8aa65

    goto/16 :goto_0

    :sswitch_13
    sget v5, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v5, :cond_b

    :cond_a
    :goto_4
    const-string v5, "\u06db\u06d8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x373b

    const v7, 0x2851bb55

    xor-int/2addr v6, v7

    const v7, 0x6e27b124

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06dc\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2de7

    const v7, 0x627deafe

    xor-int/2addr v6, v7

    const v7, 0x62155692

    goto/16 :goto_0

    .line 260
    :sswitch_14
    sget v5, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u06db\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x6b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x31f5

    const v7, -0x912e45b

    xor-int/2addr v6, v7

    const v7, 0xe87a34f

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a7b\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4c7b

    const v7, -0x61a7b0b2

    xor-int/2addr v6, v7

    const v7, -0x6d8e1022

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a5ad85b -> :sswitch_0
        -0x76105db5 -> :sswitch_a
        -0x72757455 -> :sswitch_8
        -0x6cb21f41 -> :sswitch_14
        -0x63a68595 -> :sswitch_13
        -0x6390c41f -> :sswitch_1
        -0x4d09ed5c -> :sswitch_9
        -0x402cb8b0 -> :sswitch_8
        -0x27b945f6 -> :sswitch_13
        -0x219089c2 -> :sswitch_f
        -0x1dfdec86 -> :sswitch_12
        -0x1d2ca78d -> :sswitch_2
        -0x11cf0b90 -> :sswitch_2
        -0x771721a -> :sswitch_d
        -0x64d59c3 -> :sswitch_e
        -0x23d7ddb -> :sswitch_11
        0x24221b8 -> :sswitch_5
        0xac3bcf5 -> :sswitch_1
        0xb1187e5 -> :sswitch_7
        0xb5ee60f -> :sswitch_3
        0xb662e58 -> :sswitch_b
        0xe5c2a13 -> :sswitch_4
        0x1401ec96 -> :sswitch_12
        0x1505a41d -> :sswitch_b
        0x15f3d2f3 -> :sswitch_a
        0x1cdffac7 -> :sswitch_10
        0x25106e87 -> :sswitch_7
        0x2609e752 -> :sswitch_e
        0x2c6bc8a2 -> :sswitch_10
        0x30e2b3ee -> :sswitch_5
        0x30eb5847 -> :sswitch_6
        0x430fbf36 -> :sswitch_4
        0x4635ea25 -> :sswitch_f
        0x4e60056c -> :sswitch_6
        0x58ffde66 -> :sswitch_c
        0x5d5df3ad -> :sswitch_d
        0x620010da -> :sswitch_11
        0x6528cb5a -> :sswitch_3
        0x66a082f1 -> :sswitch_c
        0x687a77f3 -> :sswitch_9
        0x76b44f49 -> :sswitch_0
        0x7b60320a -> :sswitch_14
    .end sparse-switch
.end method

.method public final ᩴ()J
    .locals 9

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const v3, -0x466234ae

    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v6, "\u1a7a\u1a75"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2283

    const v8, -0x14516ead

    xor-int/2addr v7, v8

    const v8, 0x2f2e050

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x3d31

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    sget-boolean v6, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v6, :cond_2

    goto/16 :goto_3

    .line 506
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v6

    if-gtz v6, :cond_9

    goto/16 :goto_3

    .line 880
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v6, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v6, :cond_6

    goto/16 :goto_3

    .line 141
    :sswitch_2
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v6, Ll/֫۠;->ۢᩴ᩺:I

    if-lez v6, :cond_4

    goto/16 :goto_3

    .line 447
    :sswitch_3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    const-wide/16 v0, 0x0

    return-wide v0

    :sswitch_5
    const-wide/16 v3, 0x10

    add-long/2addr v1, v3

    return-wide v1

    .line 960
    :sswitch_6
    invoke-virtual {v0}, Ll/֡۫ܳ;->᩷()J

    move-result-wide v1

    sget v6, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v6, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v6, "\u06e1\u1a73"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x33

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x361

    const v8, 0x3c67beb2

    xor-int/2addr v7, v8

    const v8, 0x71a9049a

    goto :goto_0

    .line 166
    :sswitch_7
    sget v6, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v6, :cond_1

    goto :goto_1

    :cond_1
    const-string v6, "\u0730\u073d"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2887

    const v8, -0x4e76074e

    xor-int/2addr v7, v8

    const v8, 0x58a033b

    goto :goto_0

    :cond_2
    const-string v6, "\u06ec\u06e2"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5cd

    const v8, -0x79e788f5

    xor-int/2addr v7, v8

    const v8, -0x3fa862bf

    goto/16 :goto_0

    .line 630
    :sswitch_8
    sget-boolean v6, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v6, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v6, "\u1a74\u073d"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x58e7

    const v8, 0x1d089584

    xor-int/2addr v7, v8

    const v8, -0x4298bc4f

    goto/16 :goto_0

    .line 351
    :sswitch_9
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v6

    if-gtz v6, :cond_5

    :cond_4
    :goto_1
    const-string v6, "\u1a78\u06d9"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x33

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x28dd

    const v8, -0x405a691f

    xor-int/2addr v7, v8

    const v8, 0x78528e44

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u06d9\u06e7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x677

    const v8, -0x1edcbe3a

    xor-int/2addr v7, v8

    const v8, 0x1098f5bc

    goto/16 :goto_0

    .line 150
    :sswitch_a
    sget v6, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v6, :cond_7

    :cond_6
    const-string v6, "\u06d8\u0730"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1e13

    const v8, 0x3f8d00a6

    xor-int/2addr v7, v8

    const v8, -0x7ea49140

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u1a79\u1a76"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x5d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x447f

    const v8, -0xefa8dcf

    xor-int/2addr v7, v8

    const v8, 0x20a0a9b5

    goto/16 :goto_0

    .line 92
    :sswitch_b
    sget v6, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v6, :cond_8

    :goto_2
    const-string v6, "\u05a1\u05ab"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x33

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1d51

    const v8, -0x2ff240bc

    xor-int/2addr v7, v8

    const v8, -0x69d50cb

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u06dc\u1a74"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x7b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1c87

    const v8, -0x631c37fa

    xor-int/2addr v7, v8

    const v8, -0x16857d03

    goto/16 :goto_0

    .line 107
    :sswitch_c
    sget-boolean v6, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v6, :cond_a

    :cond_9
    const-string v6, "\u1a76\u06e0"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7aad

    const v8, -0x2f6f067d

    xor-int/2addr v7, v8

    const v8, -0x28c106ca

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u05ab\u1a74"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x3b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2509

    const v8, -0x523beafa

    xor-int/2addr v7, v8

    const v8, -0x6135b335

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v6

    if-gtz v6, :cond_b

    goto :goto_3

    :cond_b
    const-string v6, "\u05a8\u06e4"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x4b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4c1f

    const v8, 0x38f6f1c5

    xor-int/2addr v7, v8

    const v8, 0xce3b80e

    goto/16 :goto_0

    .line 960
    :sswitch_e
    iget-object v0, p0, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    .line 860
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v6

    if-eqz v6, :cond_c

    :goto_3
    const-string v6, "\u1a7a\u06dc"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x145b

    const v8, -0x405b3db2

    xor-int/2addr v7, v8

    const v8, -0x2cca941b

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06d6\u073d"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x49

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5277

    const v8, 0x4e437cc7    # 8.1993363E8f

    xor-int/2addr v7, v8

    const v8, -0x46e8e6a5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7dda69ef -> :sswitch_3
        -0x7d9a32be -> :sswitch_c
        -0x7bfebebb -> :sswitch_b
        -0x78306c6c -> :sswitch_e
        -0x40570b08 -> :sswitch_2
        -0x333bc087 -> :sswitch_6
        -0x304be197 -> :sswitch_7
        -0x2991aeab -> :sswitch_a
        -0x123aeed9 -> :sswitch_4
        -0x898d6f1 -> :sswitch_1
        -0x784a5fd -> :sswitch_1
        -0x68a4ebb -> :sswitch_2
        -0x410bed0 -> :sswitch_5
        -0x15bfea9 -> :sswitch_7
        -0xcd2b24 -> :sswitch_9
        0x8a68b67 -> :sswitch_9
        0x1239f79e -> :sswitch_3
        0x225781d0 -> :sswitch_d
        0x2acc7d29 -> :sswitch_6
        0x2edf972c -> :sswitch_a
        0x3825c418 -> :sswitch_4
        0x3c02ee0b -> :sswitch_e
        0x3db73851 -> :sswitch_d
        0x3fdeb68d -> :sswitch_8
        0x4065df17 -> :sswitch_5
        0x40dc4e1d -> :sswitch_b
        0x5833f112 -> :sswitch_8
        0x657e893e -> :sswitch_0
        0x66425d8a -> :sswitch_c
        0x73fb728b -> :sswitch_0
    .end sparse-switch
.end method

.method public final ᩷(II)J
    .locals 39

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const v31, -0x7eaf04f6

    sget v32, Ll/֨ۢ;->۬ܿܺ:I

    sget v33, Ll/֫֡;->֫ۙۖ:I

    const-string v34, "\u073d\u1a79"

    invoke-static/range {v34 .. v34}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v34

    xor-int v34, v34, v33

    xor-int v1, v34, v32

    mul-int/lit16 v1, v1, -0x7d01

    const v36, -0x42e29a5a

    xor-int v1, v1, v36

    const v36, 0xf041e99

    xor-int v34, v34, v36

    move-wide v13, v12

    move-wide/from16 v19, v18

    move-wide/from16 v30, v29

    move/from16 v35, v34

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const v34, -0x7eaf04f6

    move-wide v11, v10

    move-wide/from16 v17, v16

    move-wide/from16 v28, v27

    move-object/from16 v16, v3

    move-wide v9, v8

    move-wide/from16 v26, v25

    const/4 v3, 0x0

    move-wide/from16 v37, v6

    move-object v6, v5

    move-wide/from16 v7, v23

    const/4 v5, 0x0

    move-wide/from16 v24, v37

    move-wide/from16 v22, v21

    const/16 v21, 0x0

    :goto_0
    xor-int v0, v34, v32

    mul-int/lit16 v0, v0, 0x5cad

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v1

    xor-int v34, v35, v0

    sparse-switch v34, :sswitch_data_0

    .line 770
    sget-boolean v0, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v0, :cond_3

    :cond_0
    :goto_1
    move-object/from16 v0, p0

    move/from16 v36, v21

    move/from16 v21, v2

    move/from16 v2, p2

    goto/16 :goto_9

    :sswitch_0
    sget v0, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v0, :cond_1

    goto :goto_5

    :cond_1
    :goto_2
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    move/from16 v2, p1

    goto/16 :goto_e

    .line 51
    :sswitch_1
    sget v0, Ll/֫֡;->֫ۙۖ:I

    if-lez v0, :cond_2

    :goto_3
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    :goto_4
    move/from16 v2, p1

    goto/16 :goto_d

    :cond_2
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    move/from16 v2, p1

    goto/16 :goto_c

    :cond_3
    :goto_5
    const-string v0, "\u06eb\u05a1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x21bf

    const v35, -0x3b406f6b

    xor-int v1, v1, v35

    const v35, 0x1a65e5f0

    goto/16 :goto_7

    :sswitch_2
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_0

    goto :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    goto :goto_3

    .line 1170
    :sswitch_4
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    const-wide/16 v0, 0x0

    return-wide v0

    :sswitch_5
    int-to-long v0, v4

    mul-long v0, v0, v17

    add-long v0, v0, v19

    return-wide v0

    .line 1189
    :sswitch_6
    invoke-virtual {v6}, Ll/֡۫ܳ;->ۙ()J

    move-result-wide v0

    return-wide v0

    :sswitch_7
    return-wide v7

    :sswitch_8
    const-wide/16 v0, 0x40

    add-long v0, v30, v0

    .line 1197
    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0

    :sswitch_9
    mul-long v30, v28, v26

    sget v0, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    const-string v0, "\u073d\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x7909

    const v35, -0x6befc5dd

    xor-int v1, v1, v35

    const v35, 0x68c24907

    goto/16 :goto_7

    :sswitch_a
    sub-long v0, v22, v11

    const-wide/16 v26, 0x8

    .line 1196
    div-long v28, v0, v26

    sget v0, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v0, :cond_5

    goto :goto_3

    :cond_5
    const-string v0, "\u1a77\u1a74"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x17a7

    const v35, 0x76fcf574

    xor-int v1, v1, v35

    const v35, -0x3713ad0d

    goto/16 :goto_7

    :sswitch_b
    return-wide v19

    :sswitch_c
    int-to-long v0, v4

    mul-long v0, v0, v17

    add-long v0, v0, v19

    return-wide v0

    :sswitch_d
    if-gt v4, v2, :cond_6

    const-string v0, "\u0733\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x687f

    const v35, 0x765f8441

    xor-int v1, v1, v35

    const v35, 0x16fbe2bd

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u06e4\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v32, v0

    mul-int/lit8 v0, v0, 0x4d

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x36c7

    const v35, 0x7f282f98

    xor-int v1, v1, v35

    const v35, 0x6423fdb4

    goto/16 :goto_7

    :sswitch_e
    int-to-long v0, v4

    mul-long v22, v0, v17

    add-long v7, v22, v19

    if-gt v4, v2, :cond_7

    const-string v0, "\u073a\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v33, v0

    mul-int/lit8 v0, v0, 0x37

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x38c9

    const v35, -0x71ee098d

    xor-int v1, v1, v35

    const v35, -0x219f7c80

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u0733\u06e0"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x77e3

    const v35, 0x5ca83742

    xor-int v1, v1, v35

    const v35, 0x4947e0c1    # 818700.06f

    goto/16 :goto_7

    :sswitch_f
    const/4 v0, 0x3

    if-lt v4, v0, :cond_8

    const-string v0, "\u06e0\u06da"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x2227

    const v35, -0x3ce05660

    xor-int v1, v1, v35

    const v35, 0x45b93d4f

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u06db\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x237d

    const v35, 0x15150198

    xor-int v1, v1, v35

    const v35, 0x3d2c31f3

    goto/16 :goto_7

    .line 1185
    :sswitch_10
    instance-of v0, v6, Ll/֫۫ܳ;

    const/16 v2, 0x40

    if-eqz v0, :cond_9

    const-string v0, "\u1a7b\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x4563

    const v35, 0x5aebf57a

    xor-int v1, v1, v35

    const v35, 0x293fe579

    goto/16 :goto_7

    :cond_9
    const-string v0, "\u06d8\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x2353

    const v35, -0x2d524654

    xor-int v1, v1, v35

    const v35, -0x42a85bfa

    goto/16 :goto_7

    .line 1178
    :sswitch_11
    invoke-virtual {v6}, Ll/֡۫ܳ;->ۙ()J

    move-result-wide v0

    return-wide v0

    .line 1180
    :sswitch_12
    instance-of v0, v6, Ll/۟۫ܳ;

    const-wide/16 v17, 0x4

    const-wide/16 v19, 0x30

    if-eqz v0, :cond_a

    const-string v0, "\u06d6\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    mul-int/lit8 v0, v0, 0x33

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x3f59

    const v35, -0x770dd788

    xor-int v1, v1, v35

    const v35, -0x2d4581d8

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u0733\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v33

    mul-int/lit8 v0, v0, -0x5d

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x55bf

    const v35, -0x28991c10

    xor-int v1, v1, v35

    const v35, 0x2c6d7c3a

    goto/16 :goto_7

    :sswitch_13
    const-wide/16 v0, 0x0

    return-wide v0

    .line 1177
    :sswitch_14
    invoke-virtual {v6}, Ll/֡۫ܳ;->ۤ()I

    move-result v0

    if-ne v4, v0, :cond_b

    const-string v0, "\u0733\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x382d

    const v35, -0x3aa1f113

    xor-int v1, v1, v35

    const v35, -0x2e59e97c

    goto/16 :goto_7

    :cond_b
    const-string v0, "\u06e8\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x383

    const v35, -0x155f38b7

    xor-int v1, v1, v35

    const v35, -0x22683f98

    goto/16 :goto_7

    .line 1173
    :sswitch_15
    invoke-virtual {v6, v15, v3}, Ll/֡۫ܳ;->ۙ(II)I

    move-result v4

    if-nez v4, :cond_c

    const-string v0, "\u06ec\u06d9"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x2e67

    const v35, -0x60cbd1e4

    xor-int v1, v1, v35

    const v35, -0x45e38a86

    goto/16 :goto_7

    :cond_c
    const-string v0, "\u06d7\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v32, v0

    mul-int/lit8 v0, v0, 0x7d

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x518b

    const v35, -0x6ab2189c

    xor-int v1, v1, v35

    const v35, 0x708300fe

    goto/16 :goto_7

    :sswitch_16
    const/high16 v0, -0x80000000

    const/high16 v15, -0x80000000

    goto :goto_6

    :sswitch_17
    long-to-int v0, v13

    move v15, v0

    :goto_6
    const-string v0, "\u06e7\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x2beb

    const v35, 0x2980274d

    xor-int v1, v1, v35

    const v35, -0x5ad85f2e

    goto :goto_7

    :sswitch_18
    const-wide/16 v11, 0x1

    add-long v13, v9, v11

    const-wide/32 v0, -0x80000000

    cmp-long v35, v13, v0

    if-gtz v35, :cond_d

    const-string v0, "\u05ab\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x675

    const v35, 0x5ab62798

    xor-int v1, v1, v35

    const v35, 0x269d85b5

    goto :goto_7

    :cond_d
    const-string v0, "\u06d9\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v32

    mul-int/lit8 v0, v0, -0x35

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x65e7

    const v35, -0x18391d0

    xor-int v1, v1, v35

    const v35, -0x17944d4c

    goto :goto_7

    :sswitch_19
    int-to-long v0, v5

    sub-long v9, v24, v0

    .line 979
    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v0, :cond_e

    goto/16 :goto_1

    :cond_e
    const-string v0, "\u073a\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v32

    mul-int/lit8 v0, v0, -0x61

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x2e4f

    const v35, 0x671bae50

    xor-int v1, v1, v35

    const v35, 0x214933de

    :goto_7
    xor-int v35, v0, v35

    goto/16 :goto_0

    :sswitch_1a
    move-object/from16 v0, p0

    .line 974
    iget-object v6, v0, Ll/ۘ۫ܳ;->᩸:Ll/֡۫ܳ;

    invoke-static {v6}, Ll/ۗ᩺;->᩶᩶۠(Ljava/lang/Object;)Ljava/lang/Class;

    move/from16 v35, v3

    move/from16 v1, v21

    move/from16 v21, v2

    int-to-long v2, v1

    .line 466
    sget v24, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v24, :cond_f

    move/from16 v36, v1

    move-wide/from16 v24, v2

    goto/16 :goto_4

    :cond_f
    const-string v24, "\u073a\u06e2"

    invoke-static/range {v24 .. v24}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v24

    add-int v24, v24, v33

    mul-int/lit8 v24, v24, -0x3b

    move/from16 v36, v1

    xor-int v1, v24, v32

    mul-int/lit16 v1, v1, -0x5551

    const v25, -0x3aec06bf

    xor-int v1, v1, v25

    const v25, -0x2213e6d

    xor-int v24, v24, v25

    move-wide/from16 v37, v2

    move/from16 v2, v21

    move/from16 v3, v35

    move/from16 v21, v36

    move/from16 v35, v24

    move-wide/from16 v24, v37

    goto/16 :goto_0

    :sswitch_1b
    move-object/from16 v0, p0

    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    .line 975
    invoke-virtual/range {v16 .. v16}, Ll/᩵۫ܳ;->᩷()I

    move-result v5

    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v1, :cond_10

    move/from16 v2, p1

    move/from16 v1, v36

    goto/16 :goto_b

    :cond_10
    const-string v1, "\u06ec\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v33

    xor-int v2, v1, v32

    mul-int/lit16 v2, v2, -0x255

    const v3, -0x41d16e08

    xor-int/2addr v2, v3

    const v3, 0x772207b

    xor-int/2addr v1, v3

    move/from16 v3, v35

    move/from16 v35, v1

    :goto_8
    move v1, v2

    goto :goto_a

    :sswitch_1c
    move-object/from16 v0, p0

    move/from16 v36, v21

    move/from16 v21, v2

    .line 973
    iget v1, v0, Ll/ۘ۫ܳ;->ۙ:I

    move/from16 v2, p2

    invoke-static {v2, v1}, Ll/ۖۖ;->ۨ۟᩻(II)I

    move-result v3

    .line 974
    iget-object v1, v0, Ll/ۘ۫ܳ;->ۤ:Ll/᩵۫ܳ;

    .line 163
    sget-boolean v16, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v16, :cond_11

    move-object/from16 v16, v1

    :goto_9
    const-string v1, "\u1a75\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v33, v1

    mul-int/lit8 v1, v1, -0x2d

    xor-int v2, v1, v32

    mul-int/lit16 v2, v2, -0x727d

    const v35, 0xd37c84d

    xor-int v2, v2, v35

    const v35, 0x55faae2f

    xor-int v35, v1, v35

    goto :goto_8

    :cond_11
    const-string v2, "\u05ab\u06e0"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v32

    mul-int/lit8 v2, v2, 0x55

    move-object/from16 v16, v1

    xor-int v1, v2, v33

    mul-int/lit16 v1, v1, 0x34e9

    const v35, -0x215072cb

    xor-int v1, v1, v35

    const v35, -0x7740dfb2

    xor-int v35, v2, v35

    :goto_a
    move/from16 v2, v21

    move/from16 v21, v36

    goto/16 :goto_0

    :sswitch_1d
    move-object/from16 v0, p0

    move/from16 v21, v2

    move/from16 v35, v3

    .line 972
    iget v1, v0, Ll/ۘ۫ܳ;->᩷:I

    move/from16 v2, p1

    invoke-static {v2, v1}, Ll/ۖܰ;->ܰۛۖ(II)I

    move-result v1

    .line 939
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_12

    :goto_b
    const-string v3, "\u1a74\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v32

    xor-int v0, v3, v33

    mul-int/lit16 v0, v0, -0x6957

    const v36, -0x76ee7bfc

    xor-int v0, v0, v36

    const v36, -0x574cb39d

    xor-int v3, v3, v36

    move/from16 v2, v21

    move/from16 v21, v1

    move v1, v0

    move/from16 v37, v35

    move/from16 v35, v3

    move/from16 v3, v37

    goto/16 :goto_0

    :cond_12
    const-string v0, "\u0733\u06d6"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v32

    mul-int/lit8 v0, v0, 0x19

    xor-int v3, v0, v33

    mul-int/lit16 v3, v3, -0x63e9

    const v36, -0x30abf004

    xor-int v3, v3, v36

    const v36, 0x19c305de

    xor-int v0, v0, v36

    move/from16 v2, v21

    move/from16 v21, v1

    move v1, v3

    move/from16 v3, v35

    goto/16 :goto_10

    :sswitch_1e
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    move/from16 v2, p1

    .line 4
    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_13

    :goto_c
    const-string v0, "\u1a78\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x7775

    const v3, -0x19b2b4d0

    xor-int/2addr v1, v3

    const v3, 0x4745eeea

    goto/16 :goto_f

    :cond_13
    const-string v0, "\u073f\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v33

    mul-int/lit8 v0, v0, 0x29

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0xe33

    const v3, 0x104c2cae

    xor-int/2addr v1, v3

    const v3, 0xdbd31ea

    goto :goto_f

    :sswitch_1f
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    move/from16 v2, p1

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v0

    if-eqz v0, :cond_14

    :goto_d
    const-string v0, "\u06dc\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x4b41

    const v3, 0x914de54

    xor-int/2addr v1, v3

    const v3, -0x503f3906

    goto :goto_f

    :cond_14
    const-string v0, "\u06df\u073f"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v33, v0

    mul-int/lit8 v0, v0, 0x7f

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x3669

    const v3, 0x71e450e4

    xor-int/2addr v1, v3

    const v3, 0x7ea3bf0e

    goto :goto_f

    :sswitch_20
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    move/from16 v2, p1

    .line 473
    sget-boolean v0, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v0, :cond_15

    :goto_e
    const-string v0, "\u06e1\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x3015

    const v3, -0x285c399b

    xor-int/2addr v1, v3

    const v3, 0x110d6fc4

    goto :goto_f

    :cond_15
    const-string v0, "\u06d8\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x305

    const v3, 0x55dfa0d6

    xor-int/2addr v1, v3

    const v3, 0x7bb9f72c

    :goto_f
    xor-int/2addr v0, v3

    move/from16 v2, v21

    move/from16 v3, v35

    move/from16 v21, v36

    :goto_10
    move/from16 v35, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e7123fe -> :sswitch_9
        -0x7c1b38c1 -> :sswitch_15
        -0x7b9323bf -> :sswitch_11
        -0x7b3e2f1f -> :sswitch_1a
        -0x7152a3b6 -> :sswitch_e
        -0x6f3632fe -> :sswitch_18
        -0x6b092355 -> :sswitch_12
        -0x6a9f198d -> :sswitch_b
        -0x669f29cd -> :sswitch_0
        -0x6659b522 -> :sswitch_6
        -0x61204fa3 -> :sswitch_b
        -0x5f20b09c -> :sswitch_1f
        -0x51777f67 -> :sswitch_a
        -0x4c5b072b -> :sswitch_8
        -0x47e11e39 -> :sswitch_9
        -0x456ce971 -> :sswitch_1b
        -0x3efc90f2 -> :sswitch_2
        -0x3ad47128 -> :sswitch_1c
        -0x328e2991 -> :sswitch_1d
        -0x3262ada3 -> :sswitch_5
        -0x284f1e30 -> :sswitch_6
        -0x273518ba -> :sswitch_4
        -0x24c8e45e -> :sswitch_3
        -0x22b68ffb -> :sswitch_16
        -0x1d2e8ea6 -> :sswitch_1e
        -0x19b5761f -> :sswitch_c
        -0x195e22a2 -> :sswitch_4
        -0x14624009 -> :sswitch_19
        -0x13b943d2 -> :sswitch_15
        -0x11b616fe -> :sswitch_19
        -0xbc9412c -> :sswitch_e
        -0x58e6a42 -> :sswitch_1f
        -0x357ba84 -> :sswitch_18
        0x26c6e0 -> :sswitch_a
        0x588b476 -> :sswitch_1d
        0xac0a60b -> :sswitch_11
        0x1136e1e2 -> :sswitch_13
        0x11541e8b -> :sswitch_1
        0x1894c3f8 -> :sswitch_17
        0x19b2ad1a -> :sswitch_1e
        0x1daafb19 -> :sswitch_7
        0x1e56e4c9 -> :sswitch_2
        0x33befcd0 -> :sswitch_5
        0x35489a27 -> :sswitch_20
        0x46652469 -> :sswitch_20
        0x4e133d22 -> :sswitch_1a
        0x4e30911d -> :sswitch_12
        0x4f9ca44b -> :sswitch_3
        0x500e88e6 -> :sswitch_14
        0x5197a9cf -> :sswitch_1b
        0x586c4051 -> :sswitch_1
        0x5d228e8a -> :sswitch_f
        0x5fb647c3 -> :sswitch_c
        0x605d1e9c -> :sswitch_d
        0x617afeff -> :sswitch_13
        0x6238b662 -> :sswitch_10
        0x651ddc2d -> :sswitch_7
        0x67ccbd99 -> :sswitch_f
        0x6ffcf30d -> :sswitch_16
        0x73d6540c -> :sswitch_0
        0x74d7f72d -> :sswitch_1c
        0x7b44fc01 -> :sswitch_10
        0x7bc9506a -> :sswitch_17
        0x7c9f3846 -> :sswitch_14
        0x7f3a791f -> :sswitch_d
        0x7f6f32e4 -> :sswitch_8
    .end sparse-switch
.end method

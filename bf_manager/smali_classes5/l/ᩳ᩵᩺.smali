.class public final synthetic Ll/ᩳ᩵᩺;
.super Ljava/lang/Object;
.source "44LP"

# interfaces
.implements Ll/ۜ۟᩺;


# static fields
.field private static final ۜ۠֫:[S


# instance fields
.field public final synthetic ܺ:Lbin/mt/plus/Main;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩳ᩵᩺;->ۜ۠֫:[S

    return-void

    :array_0
    .array-data 2
        0x227fs
        -0x69ccs
        -0x69dds
        -0x69cbs
        -0x69cds
        -0x69d6s
        -0x69ces
        0x95s
        -0x151bs
        -0x91es
    .end array-data
.end method

.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ᩵᩺;->ܺ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/֨ᩴ᩺;)V
    .locals 28

    const/4 v1, 0x0

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

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x12c10ea

    sget v21, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v22, Ll/֨ۧ;->֫۠֡:I

    const-string v23, "\u06e4\u1a77"

    invoke-static/range {v23 .. v23}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v23

    sub-int v23, v21, v23

    mul-int/lit8 v23, v23, -0x13

    xor-int v0, v23, v22

    mul-int/lit16 v0, v0, 0x73ff

    const v25, -0x4ad26796

    xor-int v0, v0, v25

    const v25, -0x6427e891

    xor-int v23, v23, v25

    move-object/from16 v13, v19

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v27, v16

    move-object/from16 v16, v9

    move-object/from16 v9, v27

    :goto_0
    xor-int v11, v20, v22

    mul-int/lit16 v11, v11, 0x1f41

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v0, v11

    xor-int v20, v23, v0

    sparse-switch v20, :sswitch_data_0

    move-object/from16 v11, p1

    move-object/from16 v23, v1

    const/16 v17, 0x0

    .line 112
    sget v0, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v0, :cond_e

    goto/16 :goto_a

    .line 3
    :sswitch_0
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v0

    if-ltz v0, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v11, p1

    :goto_2
    move-object/from16 v23, v1

    goto/16 :goto_9

    :cond_1
    :goto_3
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    goto/16 :goto_b

    .line 88
    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "\u06d9\u073a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x5d

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, 0x1f93

    const v23, -0x767bb878

    xor-int v11, v11, v23

    const v23, -0x4da3e8cc

    goto/16 :goto_6

    .line 98
    :sswitch_2
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v0

    if-lez v0, :cond_0

    :goto_4
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    goto/16 :goto_a

    .line 45
    :sswitch_3
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    goto :goto_4

    :sswitch_4
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    return-void

    .line 281
    :sswitch_5
    invoke-static {}, Ll/᩸۟᩺;->ۚ()V

    .line 282
    new-instance v0, Ll/᩵᩵᩺;

    invoke-direct {v0, v1, v3}, Ll/᩵᩵᩺;-><init>(Ll/۫ܶۘ;Ll/۬ᩳ᩺;)V

    .line 283
    invoke-static {v2}, Ll/֫۟;->ܿ᩹᩷(I)Ll/ܺۡۜ;

    goto/16 :goto_5

    :sswitch_6
    mul-int v0, v5, v6

    .line 277
    invoke-static {v0}, Ll/֫᩺;->ۧۖ۟(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ll/֫۟;->᩶ۡۢ(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩷۠ۚ;

    move-result-object v0

    .line 278
    invoke-static {v0}, Ll/֨ܰ;->ܽܰ֡(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "\u06e8\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, 0x79db

    const v23, -0x1f86fb50

    xor-int v11, v11, v23

    const v23, -0x3c3fcde3    # -384.3915f

    goto/16 :goto_6

    .line 277
    :sswitch_7
    sget-object v4, Ll/ۨ᩵ۚ;->ۚ:Ll/᩷۠ۚ;

    invoke-static {}, Ll/ܽܺۘ;->ۙ()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v5, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    const/16 v6, 0x1c8

    .line 17
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_4

    :cond_3
    const-string v0, "\u06ec\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x1d

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x5657

    const v23, -0x7de38028

    xor-int v11, v11, v23

    const v23, -0x79b42ba2

    goto/16 :goto_6

    :sswitch_8
    return-void

    .line 275
    :sswitch_9
    new-instance v0, Ll/᩵᩵᩺;

    invoke-direct {v0, v1, v3}, Ll/᩵᩵᩺;-><init>(Ll/۫ܶۘ;Ll/۬ᩳ᩺;)V

    .line 276
    invoke-static {v2}, Ll/֨ܶ;->ۚۛۢ(I)Ll/ܺۡۜ;

    return-void

    .line 277
    :sswitch_a
    invoke-static {}, Ll/֫ᩳ;->᩹ᩳᩴ()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "\u05a8\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, -0x7f9d

    const v23, 0x6ec37f5

    xor-int v11, v11, v23

    const v23, -0x74bb1417

    goto/16 :goto_6

    :cond_4
    :goto_5
    const-string v0, "\u06dc\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x3d07

    const v23, 0x60de86b4

    xor-int v11, v11, v23

    const v23, -0x5adc20e0

    goto/16 :goto_6

    :sswitch_b
    const v0, 0x7d57ac89

    xor-int v2, v8, v0

    const/4 v3, 0x0

    if-eqz v24, :cond_5

    const-string v0, "\u06e4\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, 0x2b39

    const v23, -0x72c32f94

    xor-int v11, v11, v23

    const v23, 0x3785f95b

    goto :goto_6

    :cond_5
    const-string v0, "\u1a74\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x45

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, 0x1153

    const v23, 0x2304feda

    xor-int v11, v11, v23

    const v23, -0x4be7d4b7

    goto :goto_6

    .line 274
    :sswitch_c
    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    .line 188
    sget-boolean v0, Ll/᩶;->ۚۤۘ:Z

    if-eqz v0, :cond_6

    goto/16 :goto_1

    :cond_6
    const-string v0, "\u05a1\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, 0xb

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, -0x52af

    const v23, 0x53863cc4

    xor-int v11, v11, v23

    const v23, -0x3539914a    # -6502235.0f

    goto :goto_6

    :sswitch_d
    const/4 v0, 0x7

    const/4 v7, 0x3

    .line 274
    invoke-static {v13, v0, v7, v15}, Ll/֨᩹;->ۚܺܶ([SIII)Ljava/lang/String;

    move-result-object v7

    .line 180
    sget v0, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v0, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v0, "\u073d\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x14ed

    const v23, 0x311c1c04

    xor-int v11, v11, v23

    const v23, 0x74543f4c

    :goto_6
    xor-int v23, v0, v23

    move v0, v11

    goto/16 :goto_0

    .line 274
    :sswitch_e
    invoke-virtual/range {p1 .. p1}, Ll/֨ᩴ᩺;->ۖ()Z

    move-result v24

    move-object/from16 v0, p0

    iget-object v1, v0, Ll/ᩳ᩵᩺;->ܺ:Lbin/mt/plus/Main;

    sget-object v13, Ll/ᩳ᩵᩺;->ۜ۠֫:[S

    .line 254
    sget v11, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v11, :cond_8

    move-object/from16 v11, p1

    goto :goto_7

    :cond_8
    const-string v11, "\u0733\u06db"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v22

    mul-int/lit8 v11, v11, 0x77

    xor-int v0, v11, v21

    mul-int/lit16 v0, v0, -0x59f3

    const v23, 0x1af28347

    xor-int v0, v0, v23

    const v23, -0x7900572

    xor-int v23, v11, v23

    goto/16 :goto_0

    .line 0
    :sswitch_f
    invoke-static {v9, v10, v12, v15}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v11, p1

    .line 0
    invoke-static {v11, v0}, Ll/ۖᩴ;->֡۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v0, :cond_9

    goto/16 :goto_2

    :cond_9
    const-string v0, "\u05a8\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    move-object/from16 v23, v1

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x65c9

    const v26, -0x669d823b

    xor-int v1, v1, v26

    const v26, -0x6088f097

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    .line 0
    sget-object v9, Ll/ᩳ᩵᩺;->ۜ۠֫:[S

    const/4 v10, 0x1

    const/4 v12, 0x6

    .line 266
    sget-boolean v0, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v0, :cond_a

    move-object/from16 v1, v23

    :goto_7
    const-string v0, "\u05ab\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x1b

    move-object/from16 v23, v1

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x35e7

    const v26, -0x78bd8aa9

    xor-int v1, v1, v26

    const v26, 0x763e21fd

    goto/16 :goto_c

    :cond_a
    const-string v0, "\u073d\u1a7a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x296f

    const v26, 0x2574fd37

    xor-int v1, v1, v26

    const v26, 0x19e6bef1

    goto/16 :goto_c

    :sswitch_11
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    const v0, 0xd0f8

    const v15, 0xd0f8

    goto :goto_8

    :sswitch_12
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    const v0, 0x9646

    const v15, 0x9646

    :goto_8
    const-string v0, "\u06e4\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x4d53

    const v26, -0x68ff23a0

    xor-int v1, v1, v26

    const v26, -0x42963deb

    goto/16 :goto_c

    :sswitch_13
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    mul-int v0, v25, v14

    sub-int v0, v19, v0

    if-gez v0, :cond_b

    const-string v0, "\u073f\u05ab"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x49

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x8dd

    const v26, 0x2b437756

    xor-int v1, v1, v26

    const v26, -0x7f4ad32b

    goto/16 :goto_c

    :cond_b
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x2ac1

    const v26, -0x64915331

    xor-int v1, v1, v26

    const v26, -0x35d382c3

    goto/16 :goto_c

    :sswitch_14
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    const v0, 0x850f51

    add-int v19, v18, v0

    const/16 v14, 0x1712

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_b

    :cond_c
    const-string v0, "\u1a77\u06d7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x1a81

    const v26, -0x56fcb4d5

    xor-int v1, v1, v26

    const v26, -0x107ab718

    goto/16 :goto_c

    :sswitch_15
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    aget-short v25, v16, v17

    mul-int v18, v25, v25

    sget v0, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v0, :cond_d

    :goto_9
    const-string v0, "\u0730\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x11

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x2e3b

    const v26, -0x4f09425e

    xor-int v1, v1, v26

    const v26, -0x3baaa7e6

    goto/16 :goto_c

    :cond_d
    const-string v0, "\u06e1\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x15

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x1417

    const v26, -0x4513ad8a

    xor-int v1, v1, v26

    const v26, -0x5a199fc5

    goto :goto_c

    :goto_a
    const-string v0, "\u06ec\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x7

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x4611

    const v26, 0x1a2051eb

    xor-int v1, v1, v26

    const v26, 0x56e9f86a

    goto :goto_c

    :cond_e
    const-string v0, "\u0730\u06e4"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x77

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x4bf7

    const v26, 0x47738d64

    xor-int v1, v1, v26

    const v26, 0x6452b0f7

    goto :goto_c

    :sswitch_16
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    sget-object v16, Ll/ᩳ᩵᩺;->ۜ۠֫:[S

    .line 81
    sget v0, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v0, :cond_f

    :goto_b
    const-string v0, "\u1a74\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x4f

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x4327

    const v26, -0x34523e80    # -2.2774528E7f

    xor-int v1, v1, v26

    const v26, 0x391b1153

    goto :goto_c

    :cond_f
    const-string v0, "\u073f\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x31

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x53a5

    const v26, 0x1c39f8eb

    xor-int v1, v1, v26

    const v26, 0x5ac7a28c

    :goto_c
    xor-int v0, v0, v26

    move-object/from16 v27, v23

    move/from16 v23, v0

    move v0, v1

    move-object/from16 v1, v27

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7da3af21 -> :sswitch_11
        -0x7953c5f4 -> :sswitch_1
        -0x75c5a53a -> :sswitch_13
        -0x71f804b8 -> :sswitch_5
        -0x6c573c91 -> :sswitch_a
        -0x6a878385 -> :sswitch_0
        -0x6a30f186 -> :sswitch_12
        -0x6a2403cc -> :sswitch_b
        -0x6980e7e7 -> :sswitch_f
        -0x6644dbeb -> :sswitch_3
        -0x598339c5 -> :sswitch_5
        -0x536d1e69 -> :sswitch_16
        -0x51ba7e04 -> :sswitch_c
        -0x4d722aac -> :sswitch_d
        -0x4bf6738c -> :sswitch_0
        -0x3f687aba -> :sswitch_e
        -0x379e515e -> :sswitch_13
        -0x34621e9f -> :sswitch_7
        -0x2ff68c6e -> :sswitch_8
        -0x2ae239d8 -> :sswitch_6
        -0x290567a3 -> :sswitch_b
        -0x1d76dd8a -> :sswitch_10
        -0x1107f4b7 -> :sswitch_7
        -0xdca16b2 -> :sswitch_4
        -0xdabb013 -> :sswitch_a
        -0x6d12b8c -> :sswitch_e
        -0x53cc68d -> :sswitch_8
        -0x1a716ee -> :sswitch_d
        0xa286174 -> :sswitch_15
        0x10e37d12 -> :sswitch_3
        0x15438845 -> :sswitch_15
        0x2bb4e557 -> :sswitch_c
        0x33e3dda8 -> :sswitch_11
        0x4b8da858 -> :sswitch_9
        0x4e5f0742 -> :sswitch_2
        0x52390cee -> :sswitch_9
        0x57f3efa2 -> :sswitch_12
        0x5a3416f8 -> :sswitch_6
        0x5cec1614 -> :sswitch_1
        0x5ef819df -> :sswitch_10
        0x613cb7ee -> :sswitch_4
        0x66e83352 -> :sswitch_2
        0x789407ce -> :sswitch_14
        0x79b54c73 -> :sswitch_16
        0x7ad57e55 -> :sswitch_14
        0x7c5a6d42 -> :sswitch_f
    .end sparse-switch
.end method

.class public Ll/ۨܿ֫;
.super Ll/ܽ֡֫;
.source "N5YQ"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/content/ServiceConnection;


# static fields
.field private static final ᩶֨᩷:[S


# instance fields
.field public ۚ᩷:J

.field public ۫᩷:Z

.field public ܳ᩷:Ll/֫ܽ᩸;

.field public ᩴ᩷:Ll/ۗܿ֫;

.field public ᩸᩷:Ll/ۧܽ᩸;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x46

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۨܿ֫;->᩶֨᩷:[S

    return-void

    :array_0
    .array-data 2
        0x19acs
        -0x26eas
        -0x2cd2s
        0x25a0s
        0x281fs
        0x20bbs
        0x1702s
        -0x3f76s
        0x1524s
        -0x37dfs
        0x173fs
        0x229s
        -0xe0as
        0x529s
        0x3fcs
        0x111as
        -0x1a6cs
        -0x1b4es
        -0x1136s
        0x37bes
        0x133s
        0x1ff1s
        0x2273s
        0x8c5s
        -0x632s
        0x158es
        -0x540s
        0x139as
        -0x1fc9s
        0x22d1s
        -0x1620s
        0x807s
        0x217ds
        -0x1719s
        0x1cffs
        0x1666s
        0x608s
        0x36d2s
        0x27c4s
        0x26ecs
        -0xf71s
        0x258fs
        0x6d77s
        -0x5da6s
        -0x7706s
        -0x6cb2s
        0x7459s
        -0x60acs
        0x1b96s
        0x383as
        0x1f8fs
        -0x227cs
        0xc42s
        -0x4aa9s
        -0x4a9cs
        -0x4a9bs
        -0x4a8bs
        -0x4ab9s
        -0x4a9ds
        -0x4a8ds
        -0x4a9cs
        -0x4a91s
        -0x4aa9s
        -0x4a8bs
        -0x4a9es
        -0x4a81s
        -0x4aa0s
        -0x4a81s
        -0x4a9es
        -0x4a91s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ll/ܽ֡֫;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Ll/ۨܿ֫;->۫᩷:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 27

    move-object/from16 v0, p0

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

    const v18, 0x74e5d11

    sget v19, Ll/ۖ;->ܿۚ֡:I

    sget v20, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v21, "\u06d9\u06dc"

    invoke-static/range {v21 .. v21}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v20

    mul-int/lit8 v21, v21, 0x73

    xor-int v1, v21, v19

    mul-int/lit16 v1, v1, 0x2acd

    const v23, -0x4fbb8a3e

    xor-int v1, v1, v23

    const v23, 0x53576b13

    xor-int v21, v21, v23

    move-object/from16 v16, v5

    move-object v13, v12

    move-object v6, v15

    move/from16 v22, v21

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v21, 0x74e5d11

    const/16 v23, 0x0

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v9, v21, v19

    mul-int/lit16 v9, v9, -0x71e1

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v1, v9

    xor-int v21, v22, v1

    sparse-switch v21, :sswitch_data_0

    move v1, v10

    move-object/from16 v22, v13

    move/from16 v24, v14

    .line 88
    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    const v10, 0x7d6e150f

    xor-int/2addr v9, v10

    if-ne v2, v9, :cond_a

    const-string v9, "\u073d\u06d6"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v20, v9

    mul-int/lit8 v9, v9, -0x47

    xor-int v10, v9, v19

    mul-int/lit16 v10, v10, 0x2a13

    const v13, -0x4790b587

    xor-int/2addr v10, v13

    const v13, -0x673c9b7e

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v1

    if-lez v1, :cond_1

    :cond_0
    move v1, v10

    move-object v9, v13

    move v13, v14

    goto/16 :goto_a

    :cond_1
    move v1, v10

    move-object/from16 v22, v13

    move/from16 v24, v14

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v1, Ll/۬;->᩸ۜ᩹:I

    if-eqz v1, :cond_0

    :cond_2
    move v1, v10

    goto/16 :goto_5

    :sswitch_2
    sget v1, Ll/ۖ;->ܿۚ֡:I

    if-gez v1, :cond_2

    :goto_1
    move-object v9, v13

    move v13, v14

    goto/16 :goto_b

    .line 29
    :sswitch_3
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    return-void

    .line 99
    :sswitch_5
    invoke-static/range {p0 .. p0}, Ll/ۘܶ;->ܶ֡ۜ(Ljava/lang/Object;)V

    return-void

    :sswitch_6
    move v1, v10

    .line 101
    invoke-static {}, Ll/ۖᩳ;->ܶܰ۫()J

    move-result-wide v9

    iput-wide v9, v0, Ll/ۨܿ֫;->ۚ᩷:J

    move-object/from16 v22, v13

    move/from16 v24, v14

    goto :goto_2

    :sswitch_7
    move v1, v10

    .line 98
    invoke-static {}, Ll/ۖᩳ;->ܶܰ۫()J

    move-result-wide v9

    move-object/from16 v22, v13

    move/from16 v24, v14

    iget-wide v13, v0, Ll/ۨܿ֫;->ۚ᩷:J

    sub-long/2addr v9, v13

    const-wide/16 v13, 0x12c

    cmp-long v25, v9, v13

    if-gez v25, :cond_3

    const-string v9, "\u05a1\u06eb"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v20, v9

    mul-int/lit8 v9, v9, 0x35

    xor-int v10, v9, v19

    mul-int/lit16 v10, v10, -0x1b89

    const v13, 0x33df7546

    xor-int/2addr v10, v13

    const v13, 0x39556dce

    goto/16 :goto_4

    :cond_3
    const-string v9, "\u06d8\u1a79"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v19

    xor-int v10, v9, v20

    mul-int/lit16 v10, v10, -0x1cef

    const v13, 0xbf51310

    xor-int/2addr v10, v13

    const v13, -0x41ff97b9

    goto/16 :goto_4

    :sswitch_8
    return-void

    :sswitch_9
    const/4 v1, 0x1

    .line 94
    iput-boolean v1, v0, Ll/ۨܿ֫;->۫᩷:Z

    .line 95
    invoke-static/range {p0 .. p0}, Ll/֨ۚ;->۫ܽܿ(Ljava/lang/Object;)V

    return-void

    :sswitch_a
    move v1, v10

    move-object/from16 v22, v13

    move/from16 v24, v14

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    const v10, 0x7d0df79e

    xor-int/2addr v9, v10

    if-ne v2, v9, :cond_4

    const-string v9, "\u1a76\u06da"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v20

    mul-int/lit8 v9, v9, -0x71

    xor-int v10, v9, v19

    mul-int/lit16 v10, v10, -0x6aad

    const v13, -0x6cc30e41

    xor-int/2addr v10, v13

    const v13, -0x6bab5d20

    goto/16 :goto_4

    :cond_4
    :goto_2
    const-string v9, "\u06e8\u1a77"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v19

    xor-int v10, v9, v20

    mul-int/lit16 v10, v10, 0x87b

    const v13, -0x78fb13b4    # -1.0000018E-34f

    xor-int/2addr v10, v13

    const v13, -0x499b8ff

    goto/16 :goto_4

    :sswitch_b
    move v1, v10

    move-object/from16 v22, v13

    move/from16 v24, v14

    sget-object v5, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/4 v9, 0x7

    const/4 v10, 0x3

    invoke-static {v5, v9, v10, v12}, Ll/ۗ᩵;->᩶֡᩺([SIII)Ljava/lang/String;

    move-result-object v5

    .line 94
    sget v9, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v9, :cond_5

    move-object/from16 v9, v22

    move/from16 v13, v24

    goto/16 :goto_a

    :cond_5
    const-string v9, "\u06da\u0730"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v19

    mul-int/lit8 v9, v9, 0x59

    xor-int v10, v9, v20

    mul-int/lit16 v10, v10, 0x35e5

    const v13, -0x72b05f07

    xor-int/2addr v10, v13

    const v13, 0x45d98ec5

    goto/16 :goto_4

    :sswitch_c
    move v1, v10

    move-object/from16 v22, v13

    move/from16 v24, v14

    .line 90
    invoke-static/range {p0 .. p0}, Ll/֨ۚ;->۫ܽܿ(Ljava/lang/Object;)V

    .line 91
    new-instance v9, Landroid/content/Intent;

    const-class v10, Ll/᩺ܿ֫;

    .line 70
    sget v13, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v13, :cond_6

    move-object/from16 v13, v22

    move/from16 v14, v24

    goto/16 :goto_5

    .line 91
    :cond_6
    invoke-direct {v9, v0, v10}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 92
    invoke-static {v0, v9}, Ll/֫ۤ;->ܳ᩷֡(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_d
    move v1, v10

    move-object/from16 v22, v13

    move/from16 v24, v14

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    const v10, 0x7ea40da7

    xor-int/2addr v9, v10

    if-ne v2, v9, :cond_7

    const-string v9, "\u0736\u0730"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v20, v9

    mul-int/lit8 v9, v9, 0x1f

    xor-int v10, v9, v19

    mul-int/lit16 v10, v10, -0x690f

    const v13, -0x7682ef93

    xor-int/2addr v10, v13

    const v13, -0x4124c427

    goto/16 :goto_4

    :cond_7
    const-string v9, "\u06dc\u06db"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v19

    xor-int v10, v9, v20

    mul-int/lit16 v10, v10, 0x7a3d

    const v13, -0x3a5c8d8f

    xor-int/2addr v10, v13

    const v13, -0x9a45cd9

    goto/16 :goto_4

    :sswitch_e
    move v1, v10

    move-object/from16 v22, v13

    move/from16 v24, v14

    invoke-static {v6, v7, v8, v12}, Ll/֡ᩴ;->ۚ᩹ۡ([SIII)Ljava/lang/String;

    move-result-object v4

    .line 87
    sget v9, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v9, :cond_8

    :goto_3
    const-string v9, "\u1a7b\u06e8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v20

    xor-int v10, v9, v19

    mul-int/lit16 v10, v10, -0x7c77

    const v13, 0x5a37d4d3

    xor-int/2addr v10, v13

    const v13, -0x6280d8f3

    goto :goto_4

    :cond_8
    const-string v9, "\u06e2\u1a78"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v20, v9

    mul-int/lit8 v9, v9, -0x3b

    xor-int v10, v9, v19

    mul-int/lit16 v10, v10, 0x6c9

    const v13, -0x38248939

    xor-int/2addr v10, v13

    const v13, -0x63be7b9d

    goto :goto_4

    :sswitch_f
    move v1, v10

    move-object/from16 v22, v13

    move/from16 v24, v14

    .line 92
    sget-object v6, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/4 v7, 0x4

    const/4 v8, 0x3

    .line 23
    sget v9, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v9, :cond_9

    move v10, v1

    move-object/from16 v9, v22

    move/from16 v13, v24

    goto/16 :goto_b

    :cond_9
    const-string v9, "\u1a79\u06eb"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v19

    xor-int v10, v9, v20

    mul-int/lit16 v10, v10, 0x2387

    const v13, -0x5a161f4d

    xor-int/2addr v10, v13

    const v13, -0x6e7b9cff

    goto :goto_4

    .line 88
    :sswitch_10
    iget-object v1, v0, Ll/ۨܿ֫;->ܳ᩷:Ll/֫ܽ᩸;

    invoke-virtual {v1}, Ll/֫ܽ᩸;->ۙ()V

    return-void

    :cond_a
    const-string v9, "\u06e2\u05a1"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int v9, v9, v19

    mul-int/lit8 v9, v9, 0x27

    xor-int v10, v9, v20

    mul-int/lit16 v10, v10, -0x82d

    const v13, 0x7b904e98

    xor-int/2addr v10, v13

    const v13, -0x272db42a

    :goto_4
    xor-int/2addr v9, v13

    move-object/from16 v13, v22

    move/from16 v14, v24

    move/from16 v22, v9

    goto :goto_7

    :sswitch_11
    move v1, v10

    move-object v9, v13

    move v13, v14

    invoke-static {v9, v13, v15, v12}, Ll/֨ۚ;->֨֨۟([SIII)Ljava/lang/String;

    move-result-object v3

    sget v10, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v10, :cond_b

    move v14, v13

    move-object v13, v9

    goto :goto_5

    :cond_b
    const-string v10, "\u1a78\u1a76"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v19

    mul-int/lit8 v10, v10, 0x5d

    xor-int v14, v10, v20

    mul-int/lit16 v14, v14, -0x617f

    const v22, 0x7eb0865b

    xor-int v14, v14, v22

    const v22, -0x2f5c74b5

    goto/16 :goto_c

    :sswitch_12
    move v1, v10

    sget-object v13, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/4 v14, 0x1

    const/4 v15, 0x3

    .line 100
    sget v9, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v9, :cond_c

    :goto_5
    const-string v9, "\u073d\u05ab"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v19

    xor-int v10, v9, v20

    mul-int/lit16 v10, v10, 0x3fb3

    const v22, -0x9381122

    xor-int v10, v10, v22

    const v22, -0x655f1696

    goto :goto_6

    :cond_c
    const-string v9, "\u073d\u073d"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int v9, v9, v20

    mul-int/lit8 v9, v9, 0x29

    xor-int v10, v9, v19

    mul-int/lit16 v10, v10, -0x1831

    const v22, -0x7b47d20c

    xor-int v10, v10, v22

    const v22, 0x2e417ac1

    :goto_6
    xor-int v22, v9, v22

    :goto_7
    move/from16 v26, v10

    move v10, v1

    move/from16 v1, v26

    goto/16 :goto_0

    .line 86
    :sswitch_13
    invoke-static/range {p0 .. p0}, Ll/ۘܶ;->ܶ֡ۜ(Ljava/lang/Object;)V

    return-void

    :sswitch_14
    move v1, v10

    move-object v9, v13

    move v13, v14

    const v10, 0x102001b

    if-ne v2, v10, :cond_d

    const-string v10, "\u0736\u06dc"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v14, v10, v19

    mul-int/lit16 v14, v14, 0x691f

    const v22, -0x2a7da1bf

    xor-int v14, v14, v22

    const v22, -0x6ca53c3b

    goto/16 :goto_c

    :cond_d
    const-string v10, "\u1a76\u06df"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v14, v10, v19

    mul-int/lit16 v14, v14, -0x4397

    const v22, 0x5f562873

    xor-int v14, v14, v22

    const v22, 0x25fc0481

    goto/16 :goto_c

    :sswitch_15
    move v1, v10

    move-object v9, v13

    move v13, v14

    .line 84
    invoke-static/range {p1 .. p1}, Ll/֨ۚ;->ܶۧ᩵(Ljava/lang/Object;)I

    move-result v2

    const v10, 0x102001a

    if-ne v2, v10, :cond_e

    const-string v10, "\u0736\u1a77"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v19, v10

    mul-int/lit8 v10, v10, 0x7b

    xor-int v14, v10, v20

    mul-int/lit16 v14, v14, 0x126b

    const v22, 0x25943a72

    xor-int v14, v14, v22

    const v22, 0x60275688

    goto/16 :goto_c

    :cond_e
    const-string v10, "\u0733\u073d"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int v10, v10, v20

    mul-int/lit8 v10, v10, 0x3

    xor-int v14, v10, v19

    mul-int/lit16 v14, v14, 0x60bd

    const v22, 0x4916e9ad

    xor-int v14, v14, v22

    const v22, -0x335174ef    # -9.151092E7f

    goto/16 :goto_c

    :sswitch_16
    move v1, v10

    move-object v9, v13

    move v13, v14

    const v10, 0x90be

    const v12, 0x90be

    goto :goto_8

    :sswitch_17
    move v1, v10

    move-object v9, v13

    move v13, v14

    const/16 v10, 0x473d

    const/16 v12, 0x473d

    :goto_8
    const-string v10, "\u06eb\u1a79"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v19

    xor-int v14, v10, v20

    mul-int/lit16 v14, v14, 0x7a83

    const v22, 0x5727acf6

    xor-int v14, v14, v22

    const v22, 0x175442af

    goto/16 :goto_c

    :sswitch_18
    move v1, v10

    move-object v9, v13

    move v13, v14

    add-int/lit8 v10, v11, 0x1

    sub-int v10, v1, v10

    if-gez v10, :cond_f

    const-string v10, "\u06d9\u1a74"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v14, v10, v19

    mul-int/lit16 v14, v14, -0x2277

    const v22, 0x5aa6d0f6

    xor-int v14, v14, v22

    const v22, 0xba753fb

    goto/16 :goto_c

    :cond_f
    const-string v10, "\u06eb\u05ab"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v19

    xor-int v14, v10, v20

    mul-int/lit16 v14, v14, -0x5e27

    const v22, 0x43c1e5da

    xor-int v14, v14, v22

    const v22, 0xa843fd

    goto/16 :goto_c

    :sswitch_19
    move-object v9, v13

    move v13, v14

    mul-int v10, v23, v23

    mul-int/lit8 v11, v18, 0x2

    .line 48
    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v1, :cond_10

    goto/16 :goto_b

    :cond_10
    const-string v1, "\u06dc\u0733"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x55

    xor-int v14, v1, v20

    mul-int/lit16 v14, v14, 0x6265

    const v22, -0x33409bc0    # -1.0034432E8f

    xor-int v14, v14, v22

    const v22, 0x171cc482

    :goto_9
    xor-int v22, v1, v22

    goto/16 :goto_d

    :sswitch_1a
    move v1, v10

    move-object v9, v13

    move v13, v14

    aget-short v18, v16, v17

    add-int/lit8 v23, v18, 0x1

    .line 7
    sget v10, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v10, :cond_11

    const-string v10, "\u06e0\u073d"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int v10, v10, v19

    mul-int/lit8 v10, v10, 0x21

    xor-int v14, v10, v20

    mul-int/lit16 v14, v14, 0x5475

    const v22, -0x32bf7304

    xor-int v14, v14, v22

    const v22, 0x751818bf

    goto/16 :goto_c

    :cond_11
    const-string v10, "\u06ec\u1a7a"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v14, v10, v19

    mul-int/lit16 v14, v14, -0x5e33

    const v22, -0xaa94e36

    xor-int v14, v14, v22

    const v22, -0x73694811

    goto/16 :goto_c

    :sswitch_1b
    move v1, v10

    move-object v9, v13

    move v13, v14

    const/16 v17, 0x0

    .line 90
    sget v10, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v10, :cond_12

    :goto_a
    const-string v10, "\u073a\u06d8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int v10, v10, v19

    mul-int/lit8 v10, v10, -0x19

    xor-int v14, v10, v20

    mul-int/lit16 v14, v14, -0x4965

    const v22, -0x3d574d11

    xor-int v14, v14, v22

    const v22, -0x2e812b47

    goto :goto_c

    :cond_12
    const-string v10, "\u06e7\u1a73"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int v10, v10, v20

    mul-int/lit8 v10, v10, -0x21

    xor-int v14, v10, v19

    mul-int/lit16 v14, v14, 0x4f27

    const v22, -0x435139dd

    xor-int v14, v14, v22

    const v22, 0xc1e7450

    goto :goto_c

    :sswitch_1c
    move v1, v10

    move-object v9, v13

    move v13, v14

    sget-object v16, Ll/ۨܿ֫;->᩶֨᩷:[S

    .line 5
    sget v10, Ll/֫֡;->֫ۙۖ:I

    if-gtz v10, :cond_13

    move v10, v1

    :goto_b
    const-string v1, "\u05a1\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x27

    xor-int v14, v1, v19

    mul-int/lit16 v14, v14, -0x427d

    const v22, -0x48d6a53

    xor-int v14, v14, v22

    const v22, -0x334dd948    # -9.340256E7f

    goto/16 :goto_9

    :cond_13
    const-string v10, "\u1a77\u0733"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v19

    xor-int v14, v10, v20

    mul-int/lit16 v14, v14, -0x7abd

    const v22, -0x6bbb048b

    xor-int v14, v14, v22

    const v22, 0x1de61c22

    :goto_c
    xor-int v22, v10, v22

    move v10, v1

    :goto_d
    move v1, v14

    move v14, v13

    move-object v13, v9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f40fe2c -> :sswitch_17
        -0x7c465e1f -> :sswitch_5
        -0x692b27ca -> :sswitch_15
        -0x68bcd3b8 -> :sswitch_15
        -0x67ccf7bb -> :sswitch_b
        -0x631a842c -> :sswitch_c
        -0x620d4649 -> :sswitch_1b
        -0x5aac85e0 -> :sswitch_11
        -0x5872efa2 -> :sswitch_7
        -0x5563ec4d -> :sswitch_f
        -0x531a2e38 -> :sswitch_2
        -0x51e71a04 -> :sswitch_1c
        -0x5113433e -> :sswitch_9
        -0x4b6a0f34 -> :sswitch_19
        -0x41e9aef8 -> :sswitch_0
        -0x3593fe60 -> :sswitch_c
        -0x3231457e -> :sswitch_a
        -0x322c240b -> :sswitch_7
        -0x2b26d281 -> :sswitch_16
        -0x246910d8 -> :sswitch_8
        -0x1db27c52 -> :sswitch_d
        -0x1ad4b78a -> :sswitch_11
        -0x153866b0 -> :sswitch_13
        -0x9c02067 -> :sswitch_0
        -0x74ae044 -> :sswitch_1b
        -0x57e5069 -> :sswitch_12
        0xcd0a78d -> :sswitch_d
        0x1190c69a -> :sswitch_e
        0x17d4c4a1 -> :sswitch_18
        0x1ab7916d -> :sswitch_3
        0x1b8a19fc -> :sswitch_16
        0x24a3f0af -> :sswitch_13
        0x28bd3aed -> :sswitch_14
        0x2b43589b -> :sswitch_3
        0x2b4e0c7f -> :sswitch_1
        0x2d95b91d -> :sswitch_2
        0x36ecd687 -> :sswitch_1c
        0x3c8e1da5 -> :sswitch_1a
        0x3e1718ef -> :sswitch_6
        0x3f7a69c9 -> :sswitch_4
        0x42028cff -> :sswitch_1
        0x4447895d -> :sswitch_9
        0x49a40a53 -> :sswitch_12
        0x4c24b59c -> :sswitch_10
        0x500ded23 -> :sswitch_a
        0x52d0e8ea -> :sswitch_14
        0x53e8d6de -> :sswitch_19
        0x58c20ea8 -> :sswitch_17
        0x5a1d50e2 -> :sswitch_1a
        0x5b683bee -> :sswitch_f
        0x622e9355 -> :sswitch_e
        0x6274c4f8 -> :sswitch_6
        0x67bd1a6d -> :sswitch_10
        0x6f5909c8 -> :sswitch_18
        0x73bd340c -> :sswitch_4
        0x764ce651 -> :sswitch_b
        0x7b712987 -> :sswitch_8
        0x7c5b23d7 -> :sswitch_5
    .end sparse-switch
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 40

    move-object/from16 v0, p0

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const v29, 0x42c1bbc9

    sget v30, Ll/֨ۨ;->ۜܳ᩵:I

    sget v31, Ll/֫֨;->᩶ܺۡ:I

    const-string v32, "\u06e7\u1a75"

    invoke-static/range {v32 .. v32}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v32

    xor-int v32, v32, v30

    xor-int v1, v32, v31

    mul-int/lit16 v1, v1, -0x11ff

    const v33, -0x532d3993

    xor-int v1, v1, v33

    const v33, -0x3e805d24

    xor-int v32, v32, v33

    move-object/from16 v22, v3

    move-object/from16 v24, v5

    move-object v9, v8

    move-object v15, v14

    move-object/from16 v34, v18

    move-object/from16 v37, v21

    move-object/from16 v20, v23

    move-object/from16 v3, v25

    move-object/from16 v5, v27

    const/4 v2, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v25, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    move-object/from16 v23, v4

    move-object v8, v7

    move-object v14, v13

    const/4 v4, 0x0

    const/4 v13, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    :goto_0
    xor-int v11, v29, v31

    mul-int/lit16 v11, v11, 0x63bd

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v1, v11

    xor-int v29, v32, v1

    sparse-switch v29, :sswitch_data_0

    move-object/from16 v11, v24

    move-object/from16 v28, v34

    move/from16 v26, v36

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    sget-object v0, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/16 v1, 0xa

    aget-short v0, v0, v1

    mul-int/lit16 v1, v0, 0xdee

    goto/16 :goto_10

    :sswitch_0
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v1

    if-nez v1, :cond_3

    :cond_0
    move/from16 v1, v19

    move-object/from16 v11, v24

    move-object/from16 v24, v3

    move-object/from16 v3, v20

    move/from16 v20, v4

    goto/16 :goto_5

    .line 16
    :sswitch_1
    sget v1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v1, :cond_0

    goto/16 :goto_2

    .line 27
    :sswitch_2
    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v1, :cond_1

    goto/16 :goto_2

    :cond_1
    move-object v1, v3

    move-object/from16 v11, v24

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    goto/16 :goto_9

    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    goto/16 :goto_2

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    return-void

    .line 48
    :sswitch_5
    iget-object v1, v0, Ll/ۨܿ֫;->᩸᩷:Ll/ۧܽ᩸;

    invoke-static {v1}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    .line 50
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/᩵ܿ֫;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v2, 0x0

    .line 51
    invoke-virtual {v0, v1, v0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void

    .line 44
    :sswitch_6
    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    const v11, 0x7e7a0069

    xor-int/2addr v1, v11

    .line 46
    invoke-static {v0, v1}, Ll/ۖ᩵;->֫᩻֨(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۧܽ᩸;

    iput-object v1, v0, Ll/ۨܿ֫;->᩸᩷:Ll/ۧܽ᩸;

    .line 47
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    const-string v1, "\u06ec\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, 0x3c59

    const v26, 0x7648a89d

    xor-int v11, v11, v26

    const v26, -0x5a8f6f96

    goto/16 :goto_4

    .line 44
    :sswitch_7
    invoke-static {v0, v10}, Ll/ۖ᩵;->֫᩻֨(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۧ;->֫۠᩻(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/16 v11, 0x26

    const/4 v15, 0x3

    invoke-static {v1, v11, v15, v2}, Ll/ۗܰ;->ܳܰ᩻([SIII)Ljava/lang/String;

    move-result-object v15

    sget v1, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "\u073f\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, 0x17

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, 0x6f39

    const v26, -0x4f1a7c4d

    xor-int v11, v11, v26

    const v26, 0xe599294

    goto/16 :goto_4

    .line 43
    :sswitch_8
    invoke-static {v9, v0}, Ll/ۧ;->֫۠᩻(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/16 v10, 0x23

    const/4 v11, 0x3

    invoke-static {v1, v10, v11, v2}, Ll/ۗ᩸;->۫ᩳۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    const v10, 0x7ebbfd4c

    xor-int/2addr v10, v1

    const-string v1, "\u05a1\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, -0x75bb

    const v26, -0x579e1ae2

    xor-int v11, v11, v26

    const v26, -0x3716a30f

    goto/16 :goto_4

    :sswitch_9
    const/4 v1, 0x3

    .line 42
    invoke-static {v5, v6, v1, v2}, Ll/᩺;->۠᩸ۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    const v9, 0x7e542447

    xor-int/2addr v1, v9

    .line 43
    invoke-static {v0, v1}, Ll/֫֨;->ܿ᩷ܽ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v9

    .line 25
    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_4

    :cond_3
    :goto_1
    const-string v1, "\u073d\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, -0x3dd1

    const v26, -0x44cf44d

    xor-int v11, v11, v26

    const v26, -0x35f0056f

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u06e7\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, -0x5a9b

    const v26, -0x8532957

    xor-int v11, v11, v26

    const v26, -0x196627b8

    goto/16 :goto_4

    .line 41
    :sswitch_a
    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    const v5, 0x7e60c37c

    xor-int/2addr v1, v5

    .line 42
    invoke-static {v0, v1}, Ll/֫֨;->ܿ᩷ܽ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۧ;->֫۠᩻(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v5, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/16 v6, 0x20

    const-string v1, "\u06e8\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x3d

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, 0x7ef7

    const v26, 0x371f7acf

    xor-int v11, v11, v26

    const v26, -0x5e138c30

    goto/16 :goto_4

    :sswitch_b
    const v1, 0x102001b

    .line 41
    invoke-static {v0, v1}, Ll/ۖ᩵;->֫᩻֨(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۖۗ;->᩵ܰܶ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/16 v11, 0x1d

    const/4 v14, 0x3

    invoke-static {v1, v11, v14, v2}, Ll/֡ۖ;->ܰᩴۢ([SIII)Ljava/lang/String;

    move-result-object v14

    sget v1, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v1, :cond_5

    :goto_2
    const-string v1, "\u06e7\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x5f

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, -0x1145

    const v26, 0x1085f25

    xor-int v11, v11, v26

    const v26, 0x5e24b002

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u05ab\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v31

    mul-int/lit8 v1, v1, -0x61

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, -0x6e53

    const v26, 0x7f2359f4

    xor-int v11, v11, v26

    const v26, 0x6220717a

    goto/16 :goto_4

    :sswitch_c
    const v1, 0x102001a

    .line 40
    invoke-static {v0, v1}, Ll/֫֨;->ܿ᩷ܽ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۖۗ;->᩵ܰܶ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v1, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v1, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "\u06df\u06d6"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    mul-int/lit8 v1, v1, 0x1b

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, 0x26b1

    const v26, 0x156887d7

    xor-int v11, v11, v26

    const v26, 0x2577d0a0

    goto/16 :goto_4

    :sswitch_d
    const v1, 0x7ef43227

    xor-int/2addr v1, v13

    .line 38
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v11

    invoke-static {v8, v1, v11}, Ll/᩻۠᩷;->ۙ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩻۠᩷;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const-string v1, "\u073d\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, 0x343b

    const v26, 0x7adae6ac

    xor-int v11, v11, v26

    const v26, -0x14c27df7

    goto/16 :goto_4

    :sswitch_e
    invoke-virtual/range {p0 .. p0}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    sget-object v1, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/16 v11, 0x1a

    const/4 v13, 0x3

    invoke-static {v1, v11, v13, v2}, Ll/ۗ᩵;->᩶֡᩺([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    .line 47
    sget v1, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v1, :cond_7

    :goto_3
    move-object/from16 v1, v18

    move-object/from16 v11, v24

    move-object/from16 v28, v34

    move/from16 v26, v36

    move-object/from16 v24, v3

    move/from16 v3, v35

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u1a77\u06d8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, 0xd

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, -0x1b55

    const v26, 0x32355bac

    xor-int v11, v11, v26

    const v26, -0x3bbb3110

    goto/16 :goto_4

    :sswitch_f
    const/4 v1, 0x3

    .line 35
    invoke-static {v3, v4, v1, v2}, Ll/֨ܿ;->᩻ۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    const v7, 0x7eb13595

    xor-int/2addr v1, v7

    .line 37
    invoke-static {v0, v1}, Ll/֫֨;->ܿ᩷ܽ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/ImageView;

    const-string v1, "\u1a7a\u06db"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, 0x7bbf

    const v26, 0x63aeb4f1

    xor-int v11, v11, v26

    const v26, -0x6cff7695

    goto/16 :goto_4

    :sswitch_10
    xor-int v1, v25, v12

    .line 35
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    move-object/from16 v11, v24

    invoke-static {v11, v1, v3}, Ll/᩻۠᩷;->ۙ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩻۠᩷;

    move-result-object v1

    move-object/from16 v3, v23

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object v1, Ll/ۨܿ֫;->᩶֨᩷:[S

    sget v23, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v23, :cond_8

    move-object/from16 v23, v3

    move/from16 v4, v21

    move-object/from16 v3, v37

    move-object/from16 v21, v20

    const/16 v20, 0x17

    goto/16 :goto_9

    :cond_8
    const-string v23, "\u1a7a\u1a7b"

    invoke-static/range {v23 .. v23}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v23

    add-int v23, v23, v30

    mul-int/lit8 v23, v23, -0xd

    xor-int v4, v23, v31

    mul-int/lit16 v4, v4, -0x6df7

    const v26, -0x288e0c41

    xor-int v4, v4, v26

    const v26, -0x411cfed9

    xor-int v32, v23, v26

    move-object/from16 v23, v3

    move-object/from16 v24, v11

    move-object v3, v1

    move v1, v4

    const/16 v4, 0x17

    goto/16 :goto_0

    .line 34
    :sswitch_11
    move-object/from16 v23, v22

    check-cast v23, Landroid/widget/ImageView;

    .line 35
    invoke-virtual/range {p0 .. p0}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v24

    sget-object v1, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/16 v11, 0x14

    const/4 v12, 0x3

    invoke-static {v1, v11, v12, v2}, Ll/ۗ֫;->᩸ᩴ᩶([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v25

    const v12, 0x7ed8298e

    const-string v1, "\u05ab\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, 0x2dd7

    const v26, 0xc5ef276

    xor-int v11, v11, v26

    const v26, -0x74fa16a0

    :goto_4
    xor-int v32, v1, v26

    move v1, v11

    goto/16 :goto_0

    :sswitch_12
    move-object/from16 v11, v24

    const/4 v1, 0x3

    move-object/from16 v24, v3

    move-object/from16 v3, v20

    move/from16 v20, v4

    move/from16 v4, v21

    .line 33
    invoke-static {v3, v4, v1, v2}, Ll/ۖۙ;->ۘ᩹ܰ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    const v21, 0x7d68c4f9

    xor-int v1, v1, v21

    .line 34
    invoke-static {v0, v1}, Ll/֫֨;->ܿ᩷ܽ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v22

    .line 8
    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v1, :cond_9

    move/from16 v21, v4

    move/from16 v1, v19

    goto :goto_5

    :cond_9
    const-string v1, "\u05a8\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x51

    move-object/from16 v21, v3

    xor-int v3, v1, v31

    mul-int/lit16 v3, v3, -0x7545

    const v26, -0x7aa0a9d2

    xor-int v3, v3, v26

    const v26, -0x7ee46773

    xor-int v32, v1, v26

    move v1, v3

    goto/16 :goto_b

    :sswitch_13
    move/from16 v20, v4

    move/from16 v1, v19

    move-object/from16 v11, v24

    move-object/from16 v24, v3

    .line 33
    invoke-static {v0, v1}, Ll/֫֨;->ܿ᩷ܽ(Ljava/lang/Object;I)Landroid/view/View;

    sget-object v3, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/16 v21, 0x11

    .line 30
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_a

    :goto_5
    const-string v4, "\u06e1\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v30, v4

    mul-int/lit8 v4, v4, -0x5f

    xor-int v0, v4, v31

    mul-int/lit16 v0, v0, -0x7621

    const v19, -0x5728dc72

    xor-int v0, v0, v19

    const v19, 0x78403bbe

    xor-int v32, v4, v19

    move/from16 v19, v1

    move/from16 v4, v20

    move v1, v0

    move-object/from16 v20, v3

    move-object/from16 v3, v24

    move-object/from16 v0, p0

    goto :goto_6

    :cond_a
    const-string v0, "\u06e1\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v31

    mul-int/lit8 v0, v0, -0x3f

    xor-int v4, v0, v30

    mul-int/lit16 v4, v4, -0x17d9

    const v19, 0x39d35eaf

    xor-int v4, v4, v19

    const v19, 0x7bd0a00f

    xor-int v32, v0, v19

    move-object/from16 v0, p0

    move/from16 v19, v1

    move v1, v4

    move/from16 v4, v20

    move-object/from16 v20, v3

    move-object/from16 v3, v24

    :goto_6
    move-object/from16 v24, v11

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v11, v24

    move-object/from16 v24, v3

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    const/4 v0, 0x3

    move-object/from16 v3, v37

    move/from16 v1, v38

    .line 32
    invoke-static {v3, v1, v0, v2}, Ll/ۖ᩵;->ܿۖᩳ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    const v19, 0x7ed7c4a3

    xor-int v19, v0, v19

    const-string v0, "\u073d\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v31

    mul-int/lit8 v0, v0, 0x5d

    move/from16 v26, v1

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, 0x6c97

    const v27, 0x13d906ac

    xor-int v1, v1, v27

    const v27, 0x29c898e4

    xor-int v32, v0, v27

    move-object/from16 v0, p0

    move-object/from16 v37, v3

    move-object/from16 v3, v24

    move/from16 v38, v26

    goto/16 :goto_f

    :sswitch_15
    move-object/from16 v11, v24

    move-object/from16 v0, v34

    move/from16 v1, v36

    move-object/from16 v24, v3

    move/from16 v3, v35

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    invoke-static {v0, v3, v1, v2}, Ll/ۘܽ;->ۡۗܺ([SIII)Ljava/lang/String;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v26

    const v27, 0x7ecc49e2

    move-object/from16 v28, v0

    xor-int v0, v26, v27

    move/from16 v26, v1

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    sget-object v37, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/16 v38, 0xe

    sget v0, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v0, :cond_b

    :goto_7
    const-string v0, "\u0736\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    mul-int/lit8 v0, v0, 0x3

    move-object/from16 v18, v1

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, 0x765b

    const v27, -0x1cd9ff9a

    xor-int v1, v1, v27

    const v27, -0x2f24d626

    goto :goto_8

    :cond_b
    move-object/from16 v18, v1

    const-string v0, "\u06da\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v30, v0

    mul-int/lit8 v0, v0, 0x35

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, 0x26e3

    const v27, 0x45d19fd9

    xor-int v1, v1, v27

    const v27, -0x375a33c2

    :goto_8
    xor-int v32, v0, v27

    move-object/from16 v0, p0

    move/from16 v35, v3

    goto/16 :goto_e

    :sswitch_16
    move-object/from16 v11, v24

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    sget-object v34, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/16 v35, 0xb

    const/16 v36, 0x3

    .line 44
    sget v0, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v0, :cond_c

    move-object/from16 v1, v24

    :goto_9
    const-string v0, "\u1a78\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    mul-int/lit8 v0, v0, -0x17

    move-object/from16 v24, v1

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, -0x27bd

    const v26, 0x70cce422

    xor-int v1, v1, v26

    const v26, -0x145f692e

    goto :goto_a

    :cond_c
    const-string v0, "\u06da\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, 0x17f

    const v26, 0x647e33d9

    xor-int v1, v1, v26

    const v26, 0x6785656d

    :goto_a
    xor-int v32, v0, v26

    move-object/from16 v0, p0

    move-object/from16 v37, v3

    :goto_b
    move-object/from16 v3, v24

    goto/16 :goto_f

    :sswitch_17
    move-object/from16 v11, v24

    move-object/from16 v28, v34

    move/from16 v26, v36

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    .line 30
    invoke-super/range {p0 .. p1}, Ll/ܽ֡֫;->onCreate(Landroid/os/Bundle;)V

    .line 31
    invoke-static/range {p0 .. p0}, Ll/ۖ֡;->ۧ᩷ܶ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 32
    invoke-static/range {p0 .. p0}, Ll/ۖ֡;->ۧ᩷ܶ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v18

    const-string v0, "\u05a8\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, 0x9a1

    const v27, 0x65727595

    xor-int v1, v1, v27

    const v27, 0x2502554

    goto/16 :goto_d

    :sswitch_18
    move-object/from16 v11, v24

    move-object/from16 v28, v34

    move/from16 v26, v36

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    const v0, 0xe69a

    const v2, 0xe69a

    goto :goto_c

    :sswitch_19
    move-object/from16 v11, v24

    move-object/from16 v28, v34

    move/from16 v26, v36

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    const/16 v0, 0x7908

    const/16 v2, 0x7908

    :goto_c
    const-string v0, "\u05a1\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, 0x7b5b

    const v27, -0x565e3863

    xor-int v1, v1, v27

    const v27, -0x1bf5a417

    goto :goto_d

    :sswitch_1a
    move-object/from16 v11, v24

    move-object/from16 v28, v34

    move/from16 v26, v36

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    mul-int v0, v16, v16

    const v1, 0x308251

    add-int/2addr v0, v1

    sub-int v0, v17, v0

    if-gtz v0, :cond_d

    const-string v0, "\u1a76\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v30, v0

    mul-int/lit8 v0, v0, 0x69

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, -0x6c47

    const v27, -0x6ef38a06

    xor-int v1, v1, v27

    const v27, -0x4ba2ed5c

    :goto_d
    xor-int v32, v0, v27

    move-object/from16 v0, p0

    move-object/from16 v37, v3

    :goto_e
    move-object/from16 v3, v24

    move/from16 v36, v26

    move-object/from16 v34, v28

    :goto_f
    move-object/from16 v24, v11

    goto :goto_11

    :cond_d
    const-string v0, "\u05a1\u0736"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, 0x801

    const v27, 0x34920977

    xor-int v1, v1, v27

    const v27, 0x562cfff2

    goto :goto_d

    :goto_10
    const-string v16, "\u0736\u06e7"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v31

    mul-int/lit8 v16, v16, -0x2d

    move/from16 v17, v0

    xor-int v0, v16, v30

    mul-int/lit16 v0, v0, -0x2197

    const v27, -0x1517ae34

    xor-int v0, v0, v27

    const v27, 0x3b6c4761

    xor-int v32, v16, v27

    move-object/from16 v37, v3

    move/from16 v16, v17

    move-object/from16 v3, v24

    move/from16 v36, v26

    move-object/from16 v34, v28

    move/from16 v17, v1

    move-object/from16 v24, v11

    move v1, v0

    move-object/from16 v0, p0

    :goto_11
    move-object/from16 v39, v21

    move/from16 v21, v4

    move/from16 v4, v20

    move-object/from16 v20, v39

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ed1c64c -> :sswitch_17
        -0x75136985 -> :sswitch_f
        -0x74129cc1 -> :sswitch_2
        -0x6da96259 -> :sswitch_d
        -0x61628d52 -> :sswitch_17
        -0x5fb7f71e -> :sswitch_13
        -0x57890cc7 -> :sswitch_11
        -0x504b2817 -> :sswitch_12
        -0x4f670394 -> :sswitch_1
        -0x4dd64d66 -> :sswitch_16
        -0x4d81f69b -> :sswitch_7
        -0x48b7cd42 -> :sswitch_f
        -0x47bcd048 -> :sswitch_10
        -0x40e1c33f -> :sswitch_0
        -0x3db36433 -> :sswitch_5
        -0x3ce09cf2 -> :sswitch_1
        -0x377b07d4 -> :sswitch_b
        -0x3026a8c0 -> :sswitch_9
        -0x2bceaf21 -> :sswitch_19
        -0x2b74c899 -> :sswitch_6
        -0x2a86d16e -> :sswitch_16
        -0x2392b96c -> :sswitch_6
        -0x201853a7 -> :sswitch_5
        -0x1d31e8eb -> :sswitch_7
        -0x1c3bfeb2 -> :sswitch_15
        -0x19aaebbb -> :sswitch_18
        -0x18468c2b -> :sswitch_b
        -0x166bac87 -> :sswitch_e
        -0x1606c8ca -> :sswitch_18
        -0x11f9513b -> :sswitch_a
        -0xeb5c3f6 -> :sswitch_11
        -0xe6d41c4 -> :sswitch_10
        -0xdb55f2a -> :sswitch_8
        -0xd93b178 -> :sswitch_a
        -0x89bcd1a -> :sswitch_14
        -0x4f80ec9 -> :sswitch_2
        0xa9c2acc -> :sswitch_c
        0xeb40b44 -> :sswitch_0
        0xf93d078 -> :sswitch_e
        0x12e388fa -> :sswitch_12
        0x1700c053 -> :sswitch_3
        0x1d125fe3 -> :sswitch_15
        0x1e2016ad -> :sswitch_19
        0x237f63ec -> :sswitch_4
        0x26d33a12 -> :sswitch_13
        0x2b1cc5cf -> :sswitch_1a
        0x32170697 -> :sswitch_d
        0x404ace34 -> :sswitch_14
        0x481fe587 -> :sswitch_1a
        0x530c4da1 -> :sswitch_9
        0x54b4e638 -> :sswitch_3
        0x56e05b72 -> :sswitch_8
        0x5b4426dd -> :sswitch_c
        0x74e90326 -> :sswitch_4
    .end sparse-switch
.end method

.method public final onDestroy()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x3cfb3cc

    sget v2, Ll/ۖ֨;->֨ۨۧ:I

    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v4, "\u05a8\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x79a5

    const v6, 0x1ab57663

    xor-int/2addr v5, v6

    const v6, -0x19ed66a2

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x7fc5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    goto/16 :goto_3

    .line 27
    :sswitch_0
    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v4, :cond_2

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_3

    .line 50
    :sswitch_2
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v4, :cond_b

    goto/16 :goto_3

    .line 61
    :sswitch_3
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    return-void

    .line 77
    :sswitch_4
    invoke-static {v0}, Ll/ۘ۟;->᩹᩵֨(Ljava/lang/Object;)Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩵ܿ֫;->ۢ:Ljava/lang/String;

    return-void

    :sswitch_5
    iget-object v0, p0, Ll/ۨܿ֫;->᩸᩷:Ll/ۧܽ᩸;

    .line 45
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v4

    if-gtz v4, :cond_0

    const-string v4, "\u1a78\u06e2"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3df9

    const v6, -0x15c9f8b6

    xor-int/2addr v5, v6

    const v6, -0x5a58e56e

    goto :goto_0

    :cond_0
    const-string v4, "\u05a1\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7eff

    const v6, -0x5531d883

    xor-int/2addr v5, v6

    const v6, 0x50455f23

    goto :goto_0

    .line 76
    :sswitch_6
    invoke-virtual {p0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v4

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u06e7\u073d"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2fcd

    const v6, -0x3b9024f2

    xor-int/2addr v5, v6

    const v6, -0x25cbc5f0

    goto/16 :goto_0

    :sswitch_7
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_3

    :cond_2
    :goto_1
    const-string v4, "\u073d\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x71b5

    const v6, -0x28ff1819

    xor-int/2addr v5, v6

    const v6, 0x79ac7e4e

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u1a7b\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5475

    const v6, 0x38981b79

    xor-int/2addr v5, v6

    const v6, 0x6def1899

    goto/16 :goto_0

    .line 7
    :sswitch_8
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06e4\u06e1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x234d

    const v6, -0x63c5c57b

    xor-int/2addr v5, v6

    const v6, 0x3aea4321

    goto/16 :goto_0

    .line 38
    :sswitch_9
    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06e0\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6811

    const v6, 0x4d809c5c    # 2.6971635E8f

    xor-int/2addr v5, v6

    const v6, -0x4cdb5418

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06e1\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2f9b

    const v6, 0x177a108d

    xor-int/2addr v5, v6

    const v6, -0x2c480cae

    goto/16 :goto_0

    .line 42
    :sswitch_b
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v4, "\u06e8\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2ebb

    const v6, -0x189c8446

    xor-int/2addr v5, v6

    const v6, -0x56e57b74

    goto/16 :goto_0

    .line 18
    :sswitch_c
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u1a75\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x49f

    const v6, 0x10d97b78

    xor-int/2addr v5, v6

    const v6, -0x529590d4

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u073f\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4b21

    const v6, -0x365c5e7b

    xor-int/2addr v5, v6

    const v6, -0x2ccfda4d

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v4, :cond_a

    :goto_3
    const-string v4, "\u06e0\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3da1

    const v6, -0x7d539173

    xor-int/2addr v5, v6

    const v6, -0x45a1b1da

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0730\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3c31

    const v6, 0x356bfd91

    xor-int/2addr v5, v6

    const v6, -0x7592b980

    goto/16 :goto_0

    .line 75
    :sswitch_e
    invoke-super {p0}, Ll/ܽ֡֫;->onDestroy()V

    .line 62
    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06e4\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x723f

    const v6, -0x26a1796e

    xor-int/2addr v5, v6

    const v6, 0x3ecc2ec6

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7b\u0736"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5229

    const v6, -0x1ef4c097

    xor-int/2addr v5, v6

    const v6, -0x18ba4ce9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73cdc764 -> :sswitch_8
        -0x739e8253 -> :sswitch_d
        -0x70c4858a -> :sswitch_4
        -0x6bcf59dd -> :sswitch_7
        -0x462a0077 -> :sswitch_d
        -0x4421d784 -> :sswitch_6
        -0x3f083aab -> :sswitch_5
        -0x375d0ef6 -> :sswitch_a
        -0x34cf6af9 -> :sswitch_9
        -0x2adac7f8 -> :sswitch_c
        -0x24c8cbab -> :sswitch_a
        -0x24b1b4eb -> :sswitch_5
        -0x1e95c759 -> :sswitch_6
        -0x1b816701 -> :sswitch_4
        0x50f1ed -> :sswitch_0
        0x44c4e13 -> :sswitch_2
        0x502c969 -> :sswitch_b
        0xe3f4212 -> :sswitch_1
        0x1673f4c5 -> :sswitch_8
        0x21b6d39e -> :sswitch_2
        0x23de6e18 -> :sswitch_e
        0x2cffef02 -> :sswitch_3
        0x396cbc62 -> :sswitch_e
        0x3eacbef9 -> :sswitch_7
        0x5513330d -> :sswitch_c
        0x556b4036 -> :sswitch_9
        0x561adeb7 -> :sswitch_3
        0x57d25869 -> :sswitch_b
        0x6caa8c6b -> :sswitch_1
        0x7af0e5b9 -> :sswitch_0
    .end sparse-switch
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 6

    const/4 p1, 0x0

    const v0, -0x7b445819

    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    sget v2, Ll/֡۟;->᩶᩺ܰ:I

    const-string v3, "\u06df\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x13bb

    const v5, -0xc26be9d

    xor-int/2addr v4, v5

    const v5, 0x3365599e

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x238d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    const/4 v3, 0x4

    if-ne p2, v3, :cond_1

    const-string v3, "\u0736\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2b0b

    const v5, -0xf476a5f

    xor-int/2addr v4, v5

    const v5, 0x3f6476ea

    goto :goto_0

    .line 112
    :sswitch_0
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_d

    goto/16 :goto_4

    .line 5
    :sswitch_1
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_b

    goto/16 :goto_3

    .line 110
    :sswitch_2
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_9

    goto/16 :goto_2

    .line 59
    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    goto/16 :goto_2

    .line 48
    :sswitch_4
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 v3, 0x0

    .line 113
    invoke-virtual {p1, v3}, Ll/֫ܽ᩸;->onClick(Landroid/view/View;)V

    goto :goto_1

    .line 112
    :sswitch_6
    iget-object p1, p0, Ll/ۨܿ֫;->ܳ᩷:Ll/֫ܽ᩸;

    if-eqz p1, :cond_0

    const-string v3, "\u0730\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x65f

    const v5, -0x3b837ce2

    xor-int/2addr v4, v5

    const v5, 0x1cef7e93

    goto :goto_0

    :sswitch_7
    const/16 v3, 0x42

    if-ne p2, v3, :cond_0

    const-string v3, "\u06e7\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xf5

    const v5, 0x77d33d64

    xor-int/2addr v4, v5

    const v5, -0x590075d9

    goto :goto_0

    :sswitch_8
    const/4 p1, 0x0

    return p1

    .line 108
    :sswitch_9
    invoke-static {p0}, Ll/ۘܶ;->ܶ֡ۜ(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    .line 110
    :sswitch_a
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "\u1a74\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x87

    const v5, -0x55abc00d

    xor-int/2addr v4, v5

    const v5, 0x47271211

    goto/16 :goto_0

    :cond_0
    :goto_1
    const-string v3, "\u06dc\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6bb

    const v5, -0xba4562e

    xor-int/2addr v4, v5

    const v5, -0x438928fe

    goto/16 :goto_0

    :cond_1
    const-string v3, "\u06dc\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1b37

    const v5, 0x809d98c

    xor-int/2addr v4, v5

    const v5, 0xb9162a6    # 5.60004E-32f

    goto/16 :goto_0

    .line 98
    :sswitch_b
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "\u06db\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5867

    const v5, -0x3e1e464d

    xor-int/2addr v4, v5

    const v5, 0xc57a2e6

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06ec\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3863

    const v5, 0x2f8c163a

    xor-int/2addr v4, v5

    const v5, 0xd545700

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06da\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x13f9

    const v5, -0x53203b71

    xor-int/2addr v4, v5

    const v5, -0x4bd133b

    goto/16 :goto_0

    .line 75
    :sswitch_d
    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u073f\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x49b7

    const v5, -0x49f7f43c

    xor-int/2addr v4, v5

    const v5, 0x617d23ea

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u1a74\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2ef9

    const v5, -0x3dd09af

    xor-int/2addr v4, v5

    const v5, -0x7b1606c1

    goto/16 :goto_0

    :sswitch_f
    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u06df\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3ecf

    const v5, 0x322cf09a

    xor-int/2addr v4, v5

    const v5, 0x15babf5d

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u1a76\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x29cd

    const v5, -0x21e7830b

    xor-int/2addr v4, v5

    const v5, -0x15e262da

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_8

    :goto_2
    const-string v3, "\u06eb\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4ca9

    const v5, -0x7a187a3b

    xor-int/2addr v4, v5

    const v5, 0x329cdfac

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e0\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1d05

    const v5, 0x5d6f375b

    xor-int/2addr v4, v5

    const v5, 0x3c8f5c90

    goto/16 :goto_0

    .line 30
    :sswitch_12
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u073d\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x819

    const v5, -0x2c03b2f1

    xor-int/2addr v4, v5

    const v5, 0x6ddd0c2d

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a77\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x28a3

    const v5, 0x84e278b

    xor-int/2addr v4, v5

    const v5, -0x5658fced

    goto/16 :goto_0

    .line 14
    :sswitch_13
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u05a8\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x581

    const v5, -0x15e93528

    xor-int/2addr v4, v5

    const v5, -0x77e4c5e5

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a75\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6599

    const v5, 0x3a822eba

    xor-int/2addr v4, v5

    const v5, -0x114a1a5a

    goto/16 :goto_0

    .line 15
    :sswitch_14
    sget v3, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v3, :cond_e

    :cond_d
    const-string v3, "\u05ab\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x62e1

    const v5, 0xc1bc90a

    xor-int/2addr v4, v5

    const v5, -0x7e95ad91

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06dc\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3379

    const v5, 0x15100069

    xor-int/2addr v4, v5

    const v5, 0x6c41b428

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7db73882 -> :sswitch_d
        -0x7646311b -> :sswitch_6
        -0x6ede8788 -> :sswitch_3
        -0x6ccf6b68 -> :sswitch_8
        -0x53a42106 -> :sswitch_10
        -0x51d38305 -> :sswitch_1
        -0x442eac27 -> :sswitch_1
        -0x41f4fc3c -> :sswitch_e
        -0x3bf34ad6 -> :sswitch_0
        -0x3aa7c32e -> :sswitch_f
        -0x25d5cf91 -> :sswitch_12
        -0x22e5b5a9 -> :sswitch_c
        -0x1edcbb13 -> :sswitch_a
        -0x1557dc81 -> :sswitch_12
        -0x11df9219 -> :sswitch_11
        -0xbbcba8f -> :sswitch_13
        -0x71a79f8 -> :sswitch_4
        -0xa335c5 -> :sswitch_b
        0x8498405 -> :sswitch_0
        0xba5a332 -> :sswitch_5
        0x105db344 -> :sswitch_11
        0x1300aa93 -> :sswitch_b
        0x14004d17 -> :sswitch_9
        0x18f16685 -> :sswitch_5
        0x1c231a63 -> :sswitch_14
        0x26789b2c -> :sswitch_2
        0x26d30b74 -> :sswitch_8
        0x2ff46885 -> :sswitch_14
        0x30a419d8 -> :sswitch_e
        0x3441ac4b -> :sswitch_7
        0x39986bbe -> :sswitch_4
        0x3e58152a -> :sswitch_13
        0x4172a295 -> :sswitch_a
        0x429b730e -> :sswitch_3
        0x42b02d8f -> :sswitch_f
        0x433ad559 -> :sswitch_7
        0x4412d316 -> :sswitch_10
        0x59ee70ce -> :sswitch_9
        0x5ab9571c -> :sswitch_2
        0x5fd7263a -> :sswitch_d
        0x6d918b62 -> :sswitch_c
        0x7a7c89eb -> :sswitch_6
    .end sparse-switch
.end method

.method public final onPause()V
    .locals 24

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

    const v16, -0x588c5dd

    sget v17, Ll/ۗܰ;->ܶۜ۬:I

    sget v18, Ll/֨ۨ;->ۜܳ᩵:I

    const-string v19, "\u1a76\u06d9"

    invoke-static/range {v19 .. v19}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v17

    mul-int/lit8 v19, v19, -0x2f

    xor-int v0, v19, v18

    mul-int/lit16 v0, v0, 0x10e1

    const v21, -0x22cba939

    xor-int v0, v0, v21

    const v21, -0x330924e7    # -1.2942356E8f

    xor-int v19, v19, v21

    move-object v3, v2

    move-object/from16 v16, v4

    move-object v13, v12

    move-object v5, v15

    move/from16 v20, v19

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v19, -0x588c5dd

    const/16 v21, 0x0

    :goto_0
    xor-int v6, v19, v18

    mul-int/lit16 v6, v6, 0x638d

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v0, v6

    xor-int v19, v20, v0

    sparse-switch v19, :sswitch_data_0

    .line 42
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    return-void

    .line 24
    :sswitch_0
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v6, p0

    move/from16 v20, v1

    goto/16 :goto_9

    :cond_1
    move-object/from16 v6, p0

    :goto_2
    move/from16 v20, v1

    goto/16 :goto_7

    :sswitch_1
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move/from16 v20, v1

    goto/16 :goto_6

    .line 1
    :sswitch_2
    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v0, :cond_0

    goto :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    :goto_3
    const-string v0, "\u05ab\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0xf

    xor-int v6, v0, v17

    mul-int/lit16 v6, v6, -0x20d3

    const v20, 0x6688b35e

    xor-int v6, v6, v20

    const v20, -0x6a7e292d

    xor-int v20, v0, v20

    move v0, v6

    goto :goto_0

    :sswitch_4
    const v0, 0x7e89f042

    xor-int/2addr v0, v4

    move-object/from16 v6, p0

    .line 56
    invoke-virtual {v6, v1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 57
    invoke-super/range {p0 .. p0}, Ll/ܽ֡֫;->onPause()V

    return-void

    :sswitch_5
    move-object/from16 v6, p0

    .line 0
    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    .line 16
    sget v0, Ll/ۧ;->ۨۗܰ:I

    if-ltz v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "\u06dc\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x4f

    move/from16 v20, v1

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0xdc3

    const v22, -0x2d17b01c

    xor-int v1, v1, v22

    const v22, -0x5e58a428

    goto/16 :goto_a

    :sswitch_6
    move-object/from16 v6, p0

    move/from16 v20, v1

    const/16 v0, 0x2d

    const/4 v1, 0x3

    .line 0
    invoke-static {v5, v0, v1, v12}, Ll/֡۟;->ᩳۧܳ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 15
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v0, "\u06da\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x65

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x4397

    const v22, -0x779e8401

    xor-int v1, v1, v22

    const v22, 0x6a6748b0

    goto/16 :goto_a

    :sswitch_7
    move-object/from16 v6, p0

    const v0, 0x7d4f8232

    xor-int v1, v2, v0

    .line 0
    sget-object v5, Ll/ۨܿ֫;->᩶֨᩷:[S

    sget v0, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v0, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v0, "\u06e1\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    move/from16 v20, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x7ef

    const v22, -0x6f7e0695

    xor-int v1, v1, v22

    const v22, 0x1067d1b0

    goto/16 :goto_a

    :sswitch_8
    move-object/from16 v6, p0

    move/from16 v20, v1

    invoke-static {v13, v14, v15, v12}, Ll/ۖᩳ;->ܺ᩵᩻([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    .line 2
    sget v0, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v0, :cond_6

    :goto_4
    move/from16 v1, v20

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u1a78\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x319d

    const v22, 0x5841a07a

    xor-int v1, v1, v22

    const v22, 0x4b3644af    # 1.1945135E7f

    goto/16 :goto_a

    :sswitch_9
    move-object/from16 v6, p0

    move/from16 v20, v1

    .line 0
    sget-object v13, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/16 v14, 0x2a

    const/4 v15, 0x3

    .line 50
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u05a1\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x5

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x2f57

    const v22, 0x76cc32ea

    xor-int v1, v1, v22

    const v22, -0x7296a2c

    goto/16 :goto_a

    :sswitch_a
    move-object/from16 v6, p0

    move/from16 v20, v1

    const/16 v0, 0x2ed9

    const/16 v12, 0x2ed9

    goto :goto_5

    :sswitch_b
    move-object/from16 v6, p0

    move/from16 v20, v1

    const v0, 0xf71b

    const v12, 0xf71b

    :goto_5
    const-string v0, "\u06e1\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x2e5d

    const v22, 0x44946fc6

    xor-int v1, v1, v22

    const v22, 0x22bff3c4

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v6, p0

    move/from16 v20, v1

    add-int v0, v10, v11

    add-int/2addr v0, v0

    sub-int/2addr v0, v9

    if-ltz v0, :cond_8

    const-string v0, "\u05a8\u05a1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x37

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x3661

    const v22, -0x3acd5a1f

    xor-int v1, v1, v22

    const v22, 0x5fdcd3b6

    goto/16 :goto_a

    :cond_8
    const-string v0, "\u0730\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x1119

    const v22, 0x25a41711

    xor-int v1, v1, v22

    const v22, -0x1a2d4627

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v6, p0

    move/from16 v20, v1

    mul-int v9, v8, v8

    mul-int v10, v7, v7

    const v11, 0x7ae5e40

    .line 18
    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v0, :cond_9

    goto/16 :goto_4

    :cond_9
    const-string v0, "\u1a76\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x2b

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x334b

    const v22, -0x4c3d21f2

    xor-int v1, v1, v22

    const v22, 0xe98f039

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v6, p0

    move/from16 v20, v1

    add-int/lit16 v8, v7, 0x2c58

    sget v0, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v0, :cond_a

    :goto_6
    const-string v0, "\u05a8\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x25

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x33ef

    const v22, 0x77832cee

    xor-int v1, v1, v22

    const v22, 0x9a0616b

    goto/16 :goto_a

    :cond_a
    const-string v0, "\u073f\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0xa5

    const v22, -0x7676fe6c

    xor-int v1, v1, v22

    const v22, -0x2eaa5053

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v6, p0

    move/from16 v20, v1

    aget-short v7, v16, v21

    .line 46
    sget v0, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v0, :cond_b

    :goto_7
    const-string v0, "\u06e8\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x5b

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x307

    const v22, -0x30639df2

    xor-int v1, v1, v22

    const v22, -0x6aa04493

    goto/16 :goto_a

    :cond_b
    const-string v0, "\u0730\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x15

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x5b39

    const v22, -0x190989bd

    xor-int v1, v1, v22

    const v22, -0x1addb7ea

    goto/16 :goto_a

    :sswitch_10
    move-object/from16 v6, p0

    move/from16 v20, v1

    const/16 v21, 0x29

    .line 19
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v0

    if-ltz v0, :cond_c

    goto/16 :goto_4

    :goto_8
    const-string v0, "\u1a7a\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    move/from16 v20, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x47bb

    const v22, -0x45ca6e3d

    xor-int v1, v1, v22

    const v22, 0x3a46ef65

    goto :goto_a

    :cond_c
    const-string v0, "\u06db\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x56a7

    const v22, -0x34dac60e    # -1.0828274E7f

    xor-int v1, v1, v22

    const v22, 0x7e00ca7d

    goto :goto_a

    :sswitch_11
    move-object/from16 v6, p0

    move/from16 v20, v1

    sget-object v16, Ll/ۨܿ֫;->᩶֨᩷:[S

    .line 53
    sget v0, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v0, :cond_d

    :goto_9
    const-string v0, "\u0736\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x27

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x4107

    const v22, 0x5cf20ca5

    xor-int v1, v1, v22

    const v22, 0x1ff5b247

    goto :goto_a

    :cond_d
    const-string v0, "\u05a8\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x1a43

    const v22, 0x34b06ae8

    xor-int v1, v1, v22

    const v22, -0x791aed8a

    :goto_a
    xor-int v0, v0, v22

    move/from16 v23, v20

    move/from16 v20, v0

    move v0, v1

    move/from16 v1, v23

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x772fde80 -> :sswitch_2
        -0x75c301a2 -> :sswitch_0
        -0x69b667dc -> :sswitch_f
        -0x69583a74 -> :sswitch_11
        -0x5fe19ffa -> :sswitch_6
        -0x5877f625 -> :sswitch_7
        -0x4a193fa5 -> :sswitch_b
        -0x417d9072 -> :sswitch_a
        -0x3ab2a33e -> :sswitch_9
        -0x35096ce9 -> :sswitch_9
        -0x241b58d1 -> :sswitch_b
        -0xd37a1d7 -> :sswitch_1
        -0xd10ccce -> :sswitch_0
        -0x9edff75 -> :sswitch_f
        -0x4b8daa8 -> :sswitch_1
        -0x4b3de0d -> :sswitch_7
        0xe0e9d0 -> :sswitch_10
        0x3b292bf -> :sswitch_e
        0xa755d59 -> :sswitch_c
        0xea3ce43 -> :sswitch_4
        0x1af9a7fc -> :sswitch_11
        0x206511ec -> :sswitch_8
        0x2da850e1 -> :sswitch_c
        0x30f558f9 -> :sswitch_5
        0x3536ef8d -> :sswitch_2
        0x369cfae6 -> :sswitch_10
        0x391cf48e -> :sswitch_d
        0x439ca4d2 -> :sswitch_4
        0x55ab1e93 -> :sswitch_a
        0x60d49ed2 -> :sswitch_e
        0x612313c5 -> :sswitch_5
        0x6666bb5f -> :sswitch_d
        0x6a57c77d -> :sswitch_6
        0x71a2afe8 -> :sswitch_8
        0x772c1250 -> :sswitch_3
        0x7ced10cf -> :sswitch_3
    .end sparse-switch
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 13

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x460d19a0    # 9030.406f

    sget v7, Ll/֡ۢ;->۟֡᩻:I

    sget v8, Ll/ۖۗ;->᩻ܳܶ:I

    const-string v9, "\u06db\u0733"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0xf

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6d03

    const v11, 0xe797f06

    xor-int/2addr v10, v11

    const v11, -0x747668ee

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v8

    mul-int/lit16 v6, v6, 0x6465

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    const v4, 0x811a1a9

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v9

    if-eqz v9, :cond_7

    goto/16 :goto_4

    .line 19
    :sswitch_0
    sget v9, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v9, :cond_4

    goto/16 :goto_3

    .line 79
    :sswitch_1
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v9

    if-nez v9, :cond_b

    goto/16 :goto_3

    .line 37
    :sswitch_2
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget v9, Ll/֫֨;->᩶ܺۡ:I

    if-lez v9, :cond_8

    goto/16 :goto_5

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    goto/16 :goto_5

    .line 25
    :sswitch_4
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    return-void

    .line 123
    :sswitch_5
    new-instance v9, Ll/֫ܽ᩸;

    sget-object v10, Ll/ۨܿ֫;->᩶֨᩷:[S

    .line 39
    sget v11, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v11, :cond_0

    goto :goto_1

    :cond_0
    const/16 v11, 0x31

    const/4 v12, 0x3

    .line 123
    invoke-static {v10, v11, v12, v5}, Ll/ۗۖ;->᩵᩻ۘ([SIII)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    .line 50
    sget v11, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v11, :cond_1

    goto :goto_1

    :cond_1
    const v11, 0x7ee244a1

    xor-int/2addr v10, v11

    .line 123
    invoke-static {p0, v10}, Ll/֫֨;->ܿ᩷ܽ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v10

    .line 46
    sget v11, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v11, :cond_2

    :goto_1
    const-string v9, "\u06eb\u1a75"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x82d

    const v11, 0x7d7cf154

    xor-int/2addr v10, v11

    const v11, 0x67f143ae

    goto :goto_0

    .line 123
    :cond_2
    iget-object v11, p0, Ll/ۨܿ֫;->ᩴ᩷:Ll/ۗܿ֫;

    invoke-virtual {v11}, Ll/ۗܿ֫;->᩷()Ll/᩶ۤۤ;

    move-result-object v11

    sget v12, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v12, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-direct {v9, p0, v10, v11}, Ll/֫ܽ᩸;-><init>(Ll/ۨܿ֫;Landroid/view/View;Ll/᩶ۤۤ;)V

    iput-object v9, p0, Ll/ۨܿ֫;->ܳ᩷:Ll/֫ܽ᩸;

    .line 124
    sget-object p1, Ll/᩵ܿ֫;->ۢ:Ljava/lang/String;

    invoke-virtual {v9, p1}, Ll/֫ܽ᩸;->ۙ(Ljava/lang/String;)V

    return-void

    .line 121
    :sswitch_6
    move-object v9, p2

    check-cast v9, Ll/ۗܿ֫;

    iput-object v9, p0, Ll/ۨܿ֫;->ᩴ᩷:Ll/ۗܿ֫;

    .line 122
    invoke-virtual {v9}, Ll/ۗܿ֫;->ۤ()V

    .line 32
    sget v9, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v9, :cond_5

    :cond_4
    const-string v9, "\u05a1\u06d7"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x43

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3e4f

    const v11, 0x36626d8e

    xor-int/2addr v10, v11

    const v11, -0xcb8895f

    goto/16 :goto_0

    :cond_5
    const-string v9, "\u1a76\u06da"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x2145

    const v11, -0x4243308a

    xor-int/2addr v10, v11

    const v11, -0x70660e4c

    goto/16 :goto_0

    :sswitch_7
    const/16 v5, 0x4007

    goto :goto_2

    :sswitch_8
    const/16 v5, 0x4736

    :goto_2
    const-string v9, "\u06e7\u1a73"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x861

    const v11, -0x33ac89aa    # -5.543356E7f

    xor-int/2addr v10, v11

    const v11, 0x2073a25a

    goto/16 :goto_0

    :sswitch_9
    add-int v9, v3, v4

    add-int/2addr v9, v9

    sub-int/2addr v9, v2

    if-ltz v9, :cond_6

    const-string v9, "\u06e8\u06d7"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x91

    const v11, 0x7e683377

    xor-int/2addr v10, v11

    const v11, 0x15218e75

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u0730\u1a73"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x29

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1dd

    const v11, 0x7c793b46

    xor-int/2addr v10, v11

    const v11, 0x29302fd2

    goto/16 :goto_0

    :cond_7
    const-string v9, "\u1a78\u073a"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x9

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6eb1

    const v11, -0x4aaf2f12

    xor-int/2addr v10, v11

    const v11, -0x3c13b52a

    goto/16 :goto_0

    :sswitch_a
    add-int v2, v0, v1

    mul-int v2, v2, v2

    mul-int v3, v0, v0

    .line 64
    sget v9, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v9, :cond_9

    :cond_8
    :goto_3
    const-string v9, "\u06da\u0736"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x73

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0xee3

    const v11, -0x77c80cf2

    xor-int/2addr v10, v11

    const v11, -0x16d30878

    goto/16 :goto_0

    :cond_9
    const-string v9, "\u06e2\u06da"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0xee3

    const v11, -0x32e4d589

    xor-int/2addr v10, v11

    const v11, -0x3e54d197

    goto/16 :goto_0

    :sswitch_b
    const/16 v0, 0x30

    aget-short v0, p1, v0

    const/16 v1, 0x2d73

    sget v9, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v9, :cond_a

    goto :goto_4

    :cond_a
    const-string v9, "\u06e7\u06df"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0xefd

    const v11, -0x6942d268

    xor-int/2addr v10, v11

    const v11, -0xa16d8da

    goto/16 :goto_0

    :sswitch_c
    sget-object p1, Ll/ۨܿ֫;->᩶֨᩷:[S

    .line 12
    sget v9, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v9, :cond_c

    :cond_b
    :goto_4
    const-string v9, "\u05a1\u0730"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1887

    const v11, -0x5e5122e8

    xor-int/2addr v10, v11

    const v11, -0x4d4941df

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u06e7\u06e0"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x3a43

    const v11, 0x57f6df93

    xor-int/2addr v10, v11

    const v11, -0x165cc2d5

    goto/16 :goto_0

    .line 122
    :sswitch_d
    sget-boolean v9, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v9, :cond_d

    :goto_5
    const-string v9, "\u1a74\u073a"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x3d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3669

    const v11, -0x63e0e15c

    xor-int/2addr v10, v11

    const v11, 0x66d32694

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u1a74\u073f"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x41

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1bb1

    const v11, -0x7caa683c

    xor-int/2addr v10, v11

    const v11, 0x8a572c1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x747c5693 -> :sswitch_d
        -0x6e1bdd4f -> :sswitch_3
        -0x6973aee7 -> :sswitch_3
        -0x6565d9ee -> :sswitch_1
        -0x62828a75 -> :sswitch_b
        -0x56aed74b -> :sswitch_8
        -0x53b729bb -> :sswitch_c
        -0x52455915 -> :sswitch_d
        -0x4b9a3571 -> :sswitch_5
        -0x4a2ccc81 -> :sswitch_6
        -0x45dacba1 -> :sswitch_5
        -0x41fe1b69 -> :sswitch_4
        -0x3fa9facf -> :sswitch_a
        -0x3bb25428 -> :sswitch_1
        -0x3891b278 -> :sswitch_2
        -0x2c11c431 -> :sswitch_9
        -0x27e3e73b -> :sswitch_9
        -0x184b0199 -> :sswitch_7
        0xa93b0eb -> :sswitch_b
        0x209eac55 -> :sswitch_8
        0x35724e41 -> :sswitch_2
        0x4d57e546 -> :sswitch_7
        0x4ebe0d9f -> :sswitch_4
        0x524e4d8b -> :sswitch_0
        0x54adc64f -> :sswitch_6
        0x5a36410b -> :sswitch_0
        0x5c9f99e3 -> :sswitch_a
        0x7692cc6c -> :sswitch_c
    .end sparse-switch
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method

.method public final onStop()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x3de96988

    sget v2, Ll/ۧ;->ۨۗܰ:I

    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    const-string v4, "\u06d7\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3cd

    const v6, 0x2db84cee

    xor-int/2addr v5, v6

    const v6, 0x1b354816

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x2647

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 28
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget v4, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v4, :cond_e

    goto :goto_1

    .line 15
    :sswitch_1
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v4, :cond_c

    goto/16 :goto_4

    :sswitch_2
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_a

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    :goto_1
    const-string v4, "\u0736\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6f6b

    const v6, 0x381b6fd5

    xor-int/2addr v5, v6

    const v6, -0x38bd52a6

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    return-void

    .line 70
    :sswitch_5
    invoke-static {p0}, Ll/ۘܶ;->ܶ֡ۜ(Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_6
    return-void

    .line 67
    :sswitch_7
    invoke-virtual {v0}, Ll/ۗܿ֫;->᩸()V

    goto :goto_3

    .line 69
    :sswitch_8
    invoke-static {p0}, Ll/ۗ֫;->᩹ۚ֨(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "\u06df\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x10b5

    const v6, -0x5c3ae819

    xor-int/2addr v5, v6

    const v6, -0x6b85fe89

    goto :goto_0

    :cond_0
    :goto_2
    const-string v4, "\u06eb\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2299

    const v6, -0x45abf3f

    xor-int/2addr v5, v6

    const v6, 0x7b97941a

    goto :goto_0

    .line 64
    :sswitch_9
    new-instance v4, Landroid/content/Intent;

    const-class v5, Ll/᩵ܿ֫;

    sget v6, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v6, :cond_1

    const-string v4, "\u06e1\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6901

    const v6, 0x2d78f21d

    xor-int/2addr v5, v6

    const v6, -0x7feafce

    goto/16 :goto_0

    :cond_1
    invoke-direct {v4, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 65
    invoke-virtual {p0, v4}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    goto :goto_3

    .line 66
    :sswitch_a
    iget-object v0, p0, Ll/ۨܿ֫;->ᩴ᩷:Ll/ۗܿ֫;

    if-eqz v0, :cond_2

    const-string v4, "\u06d7\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6e29

    const v6, -0x1b84b385

    xor-int/2addr v5, v6

    const v6, -0x1f1bc278

    goto/16 :goto_0

    :cond_2
    :goto_3
    const-string v4, "\u1a73\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2b51

    const v6, -0x27db1853

    xor-int/2addr v5, v6

    const v6, -0xaaf7d6b

    goto/16 :goto_0

    .line 63
    :sswitch_b
    iget-boolean v4, p0, Ll/ۨܿ֫;->۫᩷:Z

    if-eqz v4, :cond_3

    const-string v4, "\u06e4\u06e1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x933

    const v6, -0x453e1b46

    xor-int/2addr v5, v6

    const v6, -0x4e03d56b

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u05a8\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1f11

    const v6, 0x28003880

    xor-int/2addr v5, v6

    const v6, -0xec9f5b5

    goto/16 :goto_0

    .line 19
    :sswitch_c
    sget v4, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "\u073a\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2c41

    const v6, 0x583f1e8f

    xor-int/2addr v5, v6

    const v6, 0x4857ccd0    # 220979.25f

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e7\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x55a5

    const v6, 0x5a794415

    xor-int/2addr v5, v6

    const v6, -0x61d034e5

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v4, :cond_6

    goto :goto_4

    :cond_6
    const-string v4, "\u05ab\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6985

    const v6, 0x1dd61e7

    xor-int/2addr v5, v6

    const v6, -0x496ed638

    goto/16 :goto_0

    .line 4
    :sswitch_e
    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v4, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v4, "\u06d7\u06d7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x719b

    const v6, 0x7c4db1b7

    xor-int/2addr v5, v6

    const v6, -0x784f8f70

    goto/16 :goto_0

    .line 30
    :sswitch_f
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_8

    goto :goto_5

    :cond_8
    const-string v4, "\u0730\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xe09

    const v6, -0x4c3be37c

    xor-int/2addr v5, v6

    const v6, 0xe6caf0a

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u06d6\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4d27

    const v6, 0x276a3c12

    xor-int/2addr v5, v6

    const v6, -0x1c3a4731

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u05ab\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x31

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x611f

    const v6, 0x3adb336

    xor-int/2addr v5, v6

    const v6, -0x2d2cff28

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e8\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6ee3

    const v6, 0x6b1bdf7c

    xor-int/2addr v5, v6

    const v6, 0x2f538cdd

    goto/16 :goto_0

    .line 63
    :sswitch_12
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u1a78\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6eb3

    const v6, -0x600971dc

    xor-int/2addr v5, v6

    const v6, -0x2ed20ee5

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u0730\u1a74"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x571f

    const v6, 0x7c792d3

    xor-int/2addr v5, v6

    const v6, -0x3d9713e0

    goto/16 :goto_0

    .line 62
    :sswitch_13
    invoke-super {p0}, Ll/ܽ֡֫;->onStop()V

    .line 11
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v4

    if-ltz v4, :cond_f

    :cond_e
    const-string v4, "\u073d\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4e2b

    const v6, 0x4e55ac8f    # 8.9621395E8f

    xor-int/2addr v5, v6

    const v6, -0x28aed045    # -2.3000293E14f

    goto/16 :goto_0

    :cond_f
    const-string v4, "\u1a75\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2c67

    const v6, -0x5dcf0d7a

    xor-int/2addr v5, v6

    const v6, -0x64e627a6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c6871aa -> :sswitch_b
        -0x784c9aba -> :sswitch_4
        -0x77138062 -> :sswitch_12
        -0x76286a3f -> :sswitch_13
        -0x6bb9c947 -> :sswitch_d
        -0x69058d13 -> :sswitch_10
        -0x51ab0e15 -> :sswitch_e
        -0x4d5c7e97 -> :sswitch_e
        -0x4bfedbe6 -> :sswitch_11
        -0x4821c8d2 -> :sswitch_9
        -0x3b58b65c -> :sswitch_1
        -0x3819ca75 -> :sswitch_4
        -0x35d7db64 -> :sswitch_0
        -0x3460d211 -> :sswitch_a
        -0x269230e7 -> :sswitch_f
        -0x1fe1bdae -> :sswitch_7
        -0x1d3fdff6 -> :sswitch_a
        -0x1bfe0cd5 -> :sswitch_5
        -0x195adb6c -> :sswitch_8
        -0x1244e03a -> :sswitch_9
        -0xff5ba24 -> :sswitch_8
        0xccd2492 -> :sswitch_c
        0x1ae9023b -> :sswitch_5
        0x1f62f1e6 -> :sswitch_0
        0x21ca95b7 -> :sswitch_6
        0x2429d7b2 -> :sswitch_f
        0x2b26f708 -> :sswitch_12
        0x3009de4c -> :sswitch_3
        0x35dad4c7 -> :sswitch_3
        0x38cb375f -> :sswitch_d
        0x3ca5cce7 -> :sswitch_10
        0x3d94a629 -> :sswitch_13
        0x43fc67d0 -> :sswitch_11
        0x48b084bb -> :sswitch_2
        0x55391747 -> :sswitch_c
        0x6a95c8b2 -> :sswitch_1
        0x6d3d7e03 -> :sswitch_2
        0x7206d5e0 -> :sswitch_7
        0x7a88a148 -> :sswitch_b
        0x7a9aa259 -> :sswitch_6
    .end sparse-switch
.end method

.method public final ۙ(Ll/ۖܿ֫;)V
    .locals 0

    return-void
.end method

.method public final ᩶()Ljava/lang/String;
    .locals 16

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

    const v10, -0x576d7af4

    sget v11, Ll/֡۟;->᩶᩺ܰ:I

    sget v12, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v13, "\u05a8\u05a8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0xf

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x5633

    const v15, -0x684b1e1c

    xor-int/2addr v14, v15

    const v15, 0x4b28ac81    # 1.1054209E7f

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, 0x7dc1

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    const/16 v0, 0x11

    invoke-static {v8, v9, v0, v7}, Ll/֨᩻;->ۧ᩹ܿ([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :sswitch_0
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    sget v13, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v13, :cond_9

    goto/16 :goto_3

    .line 2
    :sswitch_1
    sget v13, Ll/᩺;->۫۬۫:I

    if-gtz v13, :cond_c

    goto/16 :goto_2

    .line 1
    :sswitch_2
    sget-boolean v13, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v13, :cond_2

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    const/4 v0, 0x0

    return-object v0

    .line 0
    :sswitch_5
    sget-object v8, Ll/ۨܿ֫;->᩶֨᩷:[S

    const/16 v9, 0x35

    sget v13, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v13, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v13, "\u06e0\u06db"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x9

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3f81

    const v15, -0x1f4a1d99

    xor-int/2addr v14, v15

    const v15, 0x78c40e52

    goto :goto_0

    :sswitch_6
    const/16 v7, 0x3fbf

    goto :goto_1

    :sswitch_7
    const v7, 0xb516

    :goto_1
    const-string v13, "\u05a1\u1a75"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x3b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x5a69

    const v15, 0x357b63a6

    xor-int/2addr v14, v15

    const v15, -0x1bfaeaca

    goto :goto_0

    :sswitch_8
    add-int v13, v5, v6

    sub-int/2addr v13, v4

    if-gez v13, :cond_1

    const-string v13, "\u06e0\u06df"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x6787

    const v15, 0x2bfebcfc

    xor-int/2addr v14, v15

    const v15, 0x3bc584ab

    goto/16 :goto_0

    :cond_1
    const-string v13, "\u06eb\u05a8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7089

    const v15, 0x256f5ab3

    xor-int/2addr v14, v15

    const v15, -0x542e5635

    goto/16 :goto_0

    :sswitch_9
    const v6, 0x1f3f110    # 8.961001E-38f

    .line 3
    sget v13, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v13, :cond_3

    :cond_2
    :goto_2
    const-string v13, "\u1a74\u06e8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x75

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4b8f

    const v15, 0x7cbfda95

    xor-int/2addr v14, v15

    const v15, 0x69b0caee

    goto/16 :goto_0

    :cond_3
    const-string v13, "\u073f\u06e0"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x50b3

    const v15, 0x22112239

    xor-int/2addr v14, v15

    const v15, 0x545e180e

    goto/16 :goto_0

    :sswitch_a
    mul-int v4, v2, v3

    mul-int v5, v2, v2

    .line 2
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v13

    if-eqz v13, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v13, "\u073f\u1a77"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x38f1

    const v15, 0x3d4576df

    xor-int/2addr v14, v15

    const v15, 0x3509110b

    goto/16 :goto_0

    :sswitch_b
    aget-short v2, v0, v1

    const/16 v3, 0x2cb8

    sget v13, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v13, :cond_5

    const-string v13, "\u06d9\u0733"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x27

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x69ad

    const v15, 0x6fa36582

    xor-int/2addr v14, v15

    const v15, 0x6f173381

    goto/16 :goto_0

    :cond_5
    const-string v13, "\u06eb\u1a78"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x17

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3b9b

    const v15, 0x41915703

    xor-int/2addr v14, v15

    const v15, -0x36a699a2

    goto/16 :goto_0

    :sswitch_c
    const/16 v1, 0x34

    sget v13, Ll/᩺;->۫۬۫:I

    if-gtz v13, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v13, "\u073d\u1a76"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x759d

    const v15, -0x5848e3c7

    xor-int/2addr v14, v15

    const v15, -0x51f2f189

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v13, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v13, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v13, "\u0733\u1a73"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x7d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x2aa1

    const v15, -0x658fef0

    xor-int/2addr v14, v15

    const v15, 0x34a1d61a

    goto/16 :goto_0

    :sswitch_e
    sget v13, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v13, :cond_8

    goto :goto_3

    :cond_8
    const-string v13, "\u06e2\u06eb"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x470f

    const v15, 0x1714376f

    xor-int/2addr v14, v15

    const v15, 0x1b98e075

    goto/16 :goto_0

    :sswitch_f
    sget v13, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v13, :cond_a

    :cond_9
    const-string v13, "\u1a73\u06e0"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x4b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1201

    const v15, 0x194955b6

    xor-int/2addr v14, v15

    const v15, 0x6d6972b

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u06d6\u05a1"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x25

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x19e3

    const v15, -0xce71690

    xor-int/2addr v14, v15

    const v15, -0x6a8d0b46

    goto/16 :goto_0

    .line 3
    :sswitch_10
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v13

    if-gtz v13, :cond_b

    :goto_3
    const-string v13, "\u06eb\u06d8"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x6f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3f4b

    const v15, 0x36f54f72

    xor-int/2addr v14, v15

    const v15, 0x492cc92

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u1a74\u06db"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x57

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5853

    const v15, 0x305cae9c

    xor-int/2addr v14, v15

    const v15, -0x14df64f9

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ۨܿ֫;->᩶֨᩷:[S

    .line 0
    sget v13, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v13, :cond_d

    :cond_c
    :goto_4
    const-string v13, "\u05a1\u06db"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0xb

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3b85

    const v15, 0x237960a6

    xor-int/2addr v14, v15

    const v15, 0x4405757b

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u06dc\u06d8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x5bff

    const v15, 0x120ad6d5

    xor-int/2addr v14, v15

    const v15, 0x55d563bd

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ea84d7e -> :sswitch_1
        -0x7c351e3a -> :sswitch_a
        -0x75d0ce58 -> :sswitch_9
        -0x6f4f34eb -> :sswitch_11
        -0x5dbf5d09 -> :sswitch_a
        -0x53113688 -> :sswitch_6
        -0x4e045400 -> :sswitch_1
        -0x4c05cb0e -> :sswitch_2
        -0x3d01d113 -> :sswitch_10
        -0x33659cdb -> :sswitch_e
        -0x254e497a -> :sswitch_c
        -0x1b3bcaf1 -> :sswitch_f
        -0x14eb42dd -> :sswitch_8
        -0x12e30839 -> :sswitch_f
        -0x11ede7e8 -> :sswitch_4
        -0x113abdf -> :sswitch_5
        0xa1f58e8 -> :sswitch_6
        0x10ce7689 -> :sswitch_10
        0x1a4f720c -> :sswitch_9
        0x1db7aa55 -> :sswitch_0
        0x205fb219 -> :sswitch_c
        0x333ba413 -> :sswitch_2
        0x34dea423 -> :sswitch_d
        0x39266282 -> :sswitch_b
        0x3cfae3fa -> :sswitch_7
        0x3d30a4c5 -> :sswitch_b
        0x4abe4fbe -> :sswitch_11
        0x4c307799 -> :sswitch_e
        0x522e6f74 -> :sswitch_3
        0x58d3dc2b -> :sswitch_7
        0x5cf5afce -> :sswitch_0
        0x6005b86a -> :sswitch_d
        0x6f0232b4 -> :sswitch_5
        0x7b186790 -> :sswitch_8
        0x7beac21c -> :sswitch_4
        0x7cc17a76 -> :sswitch_3
    .end sparse-switch
.end method

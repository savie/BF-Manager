.class public final Ll/ۧۡ᩻;
.super Ljava/lang/Object;
.source "T6NI"


# static fields
.field private static final ۡᩳ֫:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x13

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۧۡ᩻;->ۡᩳ֫:[S

    return-void

    :array_0
    .array-data 2
        0x68s
        -0x197es
        -0xb7cs
        -0x1462s
        0x15bcs
        -0x1640s
        0x16dds
        0x2411s
        -0x12d5s
        0x243fs
        -0x1f7cs
        0x59fs
        0xbf1s
        -0xdds
        -0x98as
        0x1e93s
        0x1f0es
        -0xe5s
        0xa85s
    .end array-data
.end method

.method public static ۙ(Landroid/app/Activity;Ll/᩸ۡ᩻;Ljava/lang/Runnable;)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    const v19, -0x414b8132

    sget v20, Ll/֡ۖ;->۫ۙ᩶:I

    sget v21, Ll/֨ܿ;->᩹᩻۟:I

    const-string v22, "\u05a8\u073f"

    invoke-static/range {v22 .. v22}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v20

    xor-int v2, v22, v21

    mul-int/lit16 v2, v2, 0x77d5

    const v24, 0x1c0b691a

    xor-int v2, v2, v24

    const v24, -0x79c75544

    xor-int v22, v22, v24

    move-object/from16 v24, v3

    move-object v7, v5

    move-object/from16 v23, v8

    move-object v10, v9

    move-object/from16 v18, v13

    move-object v6, v15

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v5, v4

    move-object v15, v14

    move-object/from16 v14, v17

    const/16 v17, 0x0

    :goto_0
    xor-int v4, v19, v21

    mul-int/lit16 v4, v4, -0x634d

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v2, v4

    xor-int v19, v22, v2

    sparse-switch v19, :sswitch_data_0

    const/4 v0, 0x3

    .line 53
    invoke-static {v14, v1, v0, v13}, Ll/֨ᩳ;->ۘ᩸֨([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7eec6c27

    xor-int/2addr v0, v1

    const/4 v1, 0x0

    .line 54
    invoke-static {v3, v0, v1}, Ll/ۗ֡;->۟ۤۤ(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 55
    invoke-static {v3}, Ll/ۗۖ;->ܽ᩵ܰ(Ljava/lang/Object;)Ll/۠ۖۧ;

    return-void

    .line 42
    :sswitch_0
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    sget v2, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v2, :cond_0

    :goto_1
    move-object/from16 v4, p1

    move/from16 v22, v1

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    goto/16 :goto_f

    :cond_0
    :goto_2
    move-object/from16 v4, p1

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    goto/16 :goto_9

    .line 75
    :sswitch_1
    sget v2, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v2, :cond_4

    goto :goto_3

    :sswitch_2
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    :goto_3
    const-string v2, "\u06ec\u06e0"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v4, v2, v21

    mul-int/lit16 v4, v4, -0x1feb

    const v22, -0x655089c3

    xor-int v4, v4, v22

    const v22, -0x71e2be4b

    goto :goto_4

    .line 123
    :sswitch_3
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    goto :goto_1

    .line 107
    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    return-void

    .line 68
    :sswitch_5
    sget-object v2, Ll/ۧۡ᩻;->ۡᩳ֫:[S

    const/16 v4, 0x10

    const/4 v7, 0x3

    invoke-static {v2, v4, v7, v13}, Ll/ۖ;->᩺ۢ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    const v4, 0x7e96f4e1

    xor-int/2addr v2, v4

    invoke-static {v0, v2}, Ll/ۘ֡;->᩻᩺᩻(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v2

    move/from16 v22, v1

    move-object v7, v2

    move-object/from16 v2, p2

    goto/16 :goto_7

    .line 53
    :sswitch_6
    invoke-static {v3, v8, v9}, Ll/ۗܶ;->۫֫᩹(Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object v14, Ll/ۧۡ᩻;->ۡᩳ֫:[S

    const/16 v1, 0xd

    .line 79
    sget v2, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v2, :cond_2

    goto :goto_2

    :cond_2
    const-string v2, "\u1a77\u06e2"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v4, v2, v21

    mul-int/lit16 v4, v4, 0x49b1

    const v22, -0x186f625b

    xor-int v4, v4, v22

    const v22, -0xff1dd7

    goto :goto_4

    :sswitch_7
    const/4 v2, 0x3

    .line 52
    invoke-static {v6, v12, v2, v13}, Ll/ۖۖ;->ܺۙᩴ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    const v4, 0x7d49d11d

    xor-int v8, v2, v4

    .line 77
    sget v2, Ll/֫֡;->֫ۙۖ:I

    if-gtz v2, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string v2, "\u06d8\u1a77"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v4, v2, v21

    mul-int/lit16 v4, v4, -0x1287

    const v22, -0x3877bcdc

    xor-int v4, v4, v22

    const v22, 0x4b442046    # 1.2853318E7f

    :goto_4
    xor-int v22, v2, v22

    move v2, v4

    goto/16 :goto_0

    :sswitch_8
    const v2, 0x7e4fabcf

    xor-int/2addr v2, v11

    .line 52
    invoke-static {v0, v2, v5}, Ll/۬;->ܳۧۡ(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Ll/֡ۢ;->ۛܽ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ll/֫ۡ᩻;

    sget v2, Ll/֫֡;->֫ۙۖ:I

    if-gtz v2, :cond_5

    :cond_4
    const-string v2, "\u05a1\u1a7b"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v4, v2, v21

    mul-int/lit16 v4, v4, -0x2711

    const v9, -0x1606d964

    xor-int/2addr v4, v9

    const v9, -0x1bba7c00

    xor-int v22, v2, v9

    move v2, v4

    const/4 v9, 0x0

    goto/16 :goto_0

    :cond_5
    move-object/from16 v2, p2

    invoke-direct {v9, v2}, Ll/֫ۡ᩻;-><init>(Ljava/lang/Runnable;)V

    sget-object v6, Ll/ۧۡ᩻;->ۡᩳ֫:[S

    .line 41
    sget-boolean v4, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v4, :cond_6

    move-object/from16 v4, p1

    move/from16 v22, v1

    const/16 v12, 0xa

    goto/16 :goto_a

    :cond_6
    const-string v4, "\u06ec\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v21

    xor-int v12, v4, v20

    mul-int/lit16 v12, v12, 0x2b3

    const v25, 0x665599c6

    xor-int v12, v12, v25

    const v25, -0x6ca82bc1

    xor-int v4, v4, v25

    move/from16 v22, v4

    move v2, v12

    const/16 v12, 0xa

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v2, p2

    const/4 v4, 0x7

    const/4 v11, 0x3

    .line 68
    invoke-static {v15, v4, v11, v13}, Ll/ۗ᩶;->ܳܶۢ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    .line 78
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v4

    if-ltz v4, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string v4, "\u0736\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v21

    mul-int/lit8 v4, v4, 0x4d

    move/from16 v22, v1

    xor-int v1, v4, v20

    mul-int/lit16 v1, v1, 0x36ef

    const v25, 0x3687ccea

    xor-int v1, v1, v25

    const v25, -0x3166fba5

    xor-int v4, v4, v25

    move v2, v1

    move/from16 v1, v22

    move/from16 v22, v4

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v2, p2

    move/from16 v22, v1

    const/4 v1, 0x1

    new-array v5, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v7, v5, v1

    .line 68
    sget-object v15, Ll/ۧۡ᩻;->ۡᩳ֫:[S

    .line 48
    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v1, :cond_8

    :goto_5
    move-object/from16 v4, p1

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u1a73\u06df"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x3693

    const v25, -0x44ac6e62

    xor-int v4, v4, v25

    const v25, 0x2da5d04f

    goto :goto_6

    :sswitch_b
    move-object/from16 v2, p2

    move/from16 v22, v1

    .line 67
    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    const v4, 0x7eb2403c

    xor-int/2addr v1, v4

    invoke-static {v0, v1}, Ll/ۘ֡;->᩻᩺᩻(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    goto :goto_7

    :sswitch_c
    move-object/from16 v2, p2

    move/from16 v22, v1

    sget-object v1, Ll/ۧۡ᩻;->ۡᩳ֫:[S

    const/4 v4, 0x4

    const/4 v10, 0x3

    invoke-static {v1, v4, v10, v13}, Ll/֨᩻;->ۧ᩹ܿ([SIII)Ljava/lang/String;

    move-result-object v10

    .line 115
    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v1, :cond_9

    goto :goto_5

    :cond_9
    const-string v1, "\u06e7\u06d7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v20

    mul-int/lit16 v4, v4, 0x46e3

    const v25, 0x3184b74

    xor-int v4, v4, v25

    const v25, -0x61591d6b

    :goto_6
    xor-int v1, v1, v25

    move v2, v4

    goto/16 :goto_e

    :sswitch_d
    move-object/from16 v2, p2

    move/from16 v22, v1

    .line 68
    invoke-static/range {v24 .. v24}, Ll/ۖ᩵;->ۡ֫۠(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    const-string v1, "\u06d7\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v20

    mul-int/lit16 v4, v4, -0x913

    const v25, -0x27ec8a48

    xor-int v4, v4, v25

    const v25, -0x56fa8c5b

    goto :goto_6

    :cond_a
    move-object/from16 v7, v24

    :goto_7
    const-string v1, "\u1a7b\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x1c55

    const v25, 0x9412be3

    xor-int v4, v4, v25

    const v25, -0x5672a55b

    goto :goto_6

    :sswitch_e
    move-object/from16 v2, p2

    move/from16 v22, v1

    .line 192
    invoke-static/range {v23 .. v23}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    const v4, 0x7d443d42

    xor-int/2addr v1, v4

    .line 51
    invoke-static {v3, v1}, Ll/۬;->ۙۙ᩺(Ljava/lang/Object;I)V

    move-object/from16 v4, p1

    .line 67
    iget-object v1, v4, Ll/᩸ۡ᩻;->۫:Ljava/lang/String;

    move-object/from16 v24, v1

    iget-boolean v1, v4, Ll/᩸ۡ᩻;->ܳ:Z

    if-eqz v1, :cond_b

    const-string v1, "\u06d6\u06e2"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, 0x31c5

    const v25, -0x30797c6f

    xor-int v2, v2, v25

    const v25, -0x6b62ef6f

    goto/16 :goto_b

    :cond_b
    const-string v1, "\u06dc\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x53

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x1017

    const v25, -0x609b1f84

    xor-int v2, v2, v25

    const v25, 0x46aab2ca

    goto/16 :goto_b

    :sswitch_f
    move-object/from16 v4, p1

    move/from16 v22, v1

    const/4 v1, 0x1

    const/4 v2, 0x3

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    .line 192
    invoke-static {v3, v1, v2, v13}, Ll/ܽ;->᩷ܰۨ([SIII)Ljava/lang/String;

    move-result-object v23

    .line 35
    sget v1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v1, :cond_c

    :goto_8
    move/from16 v1, v22

    :goto_9
    const-string v2, "\u06da\u05a1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    move/from16 v18, v1

    xor-int v1, v2, v20

    mul-int/lit16 v1, v1, 0x3203

    const v22, -0x70268bd4

    xor-int v1, v1, v22

    const v22, -0x276b510

    xor-int v22, v2, v22

    move v2, v1

    move/from16 v1, v18

    move-object/from16 v18, v3

    move-object/from16 v3, v25

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u05a1\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x2aa5

    const v18, 0x15d234f6

    xor-int v2, v2, v18

    const v18, 0x7d8c38e3

    goto :goto_d

    :sswitch_10
    move-object/from16 v4, p1

    move/from16 v22, v1

    .line 50
    sget v1, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v3, Ll/ۖۖۧ;

    invoke-direct {v3, v0}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    sget-object v18, Ll/ۧۡ᩻;->ۡᩳ֫:[S

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v1, :cond_d

    :goto_a
    const-string v1, "\u05a1\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0xd71

    const v25, -0x54bfc43b

    xor-int v2, v2, v25

    const v25, 0x7b04eb1

    goto :goto_b

    :cond_d
    const-string v1, "\u06eb\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, 0x652b

    const v25, 0x5ab077ed

    xor-int v2, v2, v25

    const v25, -0x7fc97144

    :goto_b
    xor-int v1, v1, v25

    goto :goto_e

    :sswitch_11
    move-object/from16 v4, p1

    move/from16 v22, v1

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    const/16 v1, 0x1de8

    const/16 v13, 0x1de8

    goto :goto_c

    :sswitch_12
    move-object/from16 v4, p1

    move/from16 v22, v1

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    const/16 v1, 0x7c4a

    const/16 v13, 0x7c4a

    :goto_c
    const-string v1, "\u073d\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, -0x5155

    const v18, -0x45e5f82d

    xor-int v2, v2, v18

    const v18, 0x4ab686b

    :goto_d
    xor-int v1, v1, v18

    move-object/from16 v18, v3

    move-object/from16 v3, v25

    :goto_e
    move/from16 v26, v22

    move/from16 v22, v1

    move/from16 v1, v26

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v4, p1

    move/from16 v22, v1

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    move/from16 v1, v17

    mul-int/lit16 v2, v1, 0x60ea

    mul-int v17, v1, v1

    const v18, 0x92c1579

    add-int v17, v17, v18

    sub-int v2, v2, v17

    if-gtz v2, :cond_e

    const-string v2, "\u06e8\u06d8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v0, v2, v20

    mul-int/lit16 v0, v0, -0x31cf

    const v17, -0x232a2bf3

    xor-int v0, v0, v17

    const v17, -0x5085cc4

    xor-int v2, v2, v17

    move/from16 v17, v1

    move-object/from16 v18, v3

    move/from16 v1, v22

    move-object/from16 v3, v25

    move/from16 v22, v2

    move v2, v0

    goto :goto_12

    :cond_e
    const-string v0, "\u06ec\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, 0x1d93

    const v17, 0x3f5db60d

    xor-int v2, v2, v17

    const v17, -0x5b18217f

    xor-int v0, v0, v17

    move/from16 v17, v1

    goto :goto_11

    :sswitch_14
    move-object/from16 v4, p1

    move/from16 v22, v1

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    sget-object v0, Ll/ۧۡ᩻;->ۡᩳ֫:[S

    const/4 v1, 0x0

    aget-short v17, v0, v1

    .line 111
    sget v0, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v0, :cond_f

    :goto_f
    const-string v0, "\u073d\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x71

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x4d0d

    const v2, 0x7b97ccde

    xor-int/2addr v2, v1

    const v1, -0x7db03ef

    goto :goto_10

    :cond_f
    const-string v0, "\u06eb\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x5f

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x344f

    const v2, -0x79e0c087

    xor-int/2addr v2, v1

    const v1, 0x415b86e0

    :goto_10
    xor-int/2addr v0, v1

    :goto_11
    move-object/from16 v18, v3

    move/from16 v1, v22

    move-object/from16 v3, v25

    move/from16 v22, v0

    :goto_12
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7dd91e69 -> :sswitch_14
        -0x7bd77c11 -> :sswitch_f
        -0x75fc9e83 -> :sswitch_3
        -0x71159d20 -> :sswitch_4
        -0x710514af -> :sswitch_8
        -0x6f7cc81f -> :sswitch_c
        -0x6f1dae20 -> :sswitch_1
        -0x5ed7db56 -> :sswitch_0
        -0x5ce81f46 -> :sswitch_f
        -0x5bb44c4c -> :sswitch_11
        -0x526f6324 -> :sswitch_a
        -0x51064ed7 -> :sswitch_2
        -0x47acb0f9 -> :sswitch_c
        -0x45e3cf28 -> :sswitch_d
        -0x397631aa -> :sswitch_13
        -0x2d209143 -> :sswitch_8
        -0x24ebad07 -> :sswitch_e
        -0x1fa44eba -> :sswitch_2
        -0x1e06bc59 -> :sswitch_7
        -0x1b89867f -> :sswitch_10
        -0x1b669ff3 -> :sswitch_e
        -0x19442aef -> :sswitch_5
        -0x86b5910 -> :sswitch_9
        -0x59977fa -> :sswitch_d
        0xb56f0d -> :sswitch_10
        0x27ff0f3 -> :sswitch_11
        0xf9d779d -> :sswitch_5
        0x203c3295 -> :sswitch_a
        0x29b8173f -> :sswitch_9
        0x2c4c8d6c -> :sswitch_13
        0x35cfd6c4 -> :sswitch_7
        0x383ee13e -> :sswitch_b
        0x3c0b322f -> :sswitch_b
        0x3e959e3d -> :sswitch_12
        0x4f5a3365 -> :sswitch_6
        0x56c71e1d -> :sswitch_14
        0x585e7dd9 -> :sswitch_6
        0x5b114f8c -> :sswitch_1
        0x5c6fa0b7 -> :sswitch_12
        0x65b08eef -> :sswitch_3
        0x668b8b26 -> :sswitch_0
        0x770e9dd7 -> :sswitch_4
    .end sparse-switch
.end method

.method public static ۙ(Ll/۠ۖۧ;Ljava/lang/String;Ljava/util/function/IntConsumer;)V
    .locals 17

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, -0x18fb2791

    sget v10, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v11, Ll/ۖܰ;->۟֫ܽ:I

    const-string v12, "\u1a7a\u06df"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x5559

    const v14, 0x77617bae

    xor-int/2addr v13, v14

    const v14, -0x7a0f3c86

    xor-int/2addr v12, v14

    :goto_0
    xor-int/2addr v9, v10

    mul-int/lit16 v9, v9, -0x77d3

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    move-object/from16 v12, p2

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 67
    invoke-virtual {v0, v1, v13, v14}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 34
    sget v13, Ll/᩺;->۫۬۫:I

    if-gtz v13, :cond_3

    move-object/from16 v13, p1

    goto/16 :goto_5

    .line 56
    :sswitch_0
    sget-boolean v12, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v12, :cond_1

    :cond_0
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    goto/16 :goto_3

    :cond_1
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    goto/16 :goto_2

    .line 60
    :sswitch_1
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    sget v12, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v12, :cond_2

    :goto_1
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    goto/16 :goto_5

    :cond_2
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    goto/16 :goto_4

    .line 61
    :sswitch_2
    sget v12, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v12, :cond_0

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    goto :goto_1

    .line 20
    :sswitch_4
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    return-void

    .line 68
    :sswitch_5
    new-instance v1, Ll/ۚۡ᩻;

    move-object/from16 v12, p2

    invoke-direct {v1, v0, v12}, Ll/ۚۡ᩻;-><init>(Ll/᩹ᩴ;Ljava/util/function/IntConsumer;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void

    :cond_3
    const-string v13, "\u1a7b\u1a78"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x74df

    const v15, -0x1eeea81e

    xor-int/2addr v14, v15

    const v15, -0x3edaae56

    xor-int/2addr v13, v15

    move v12, v13

    move v13, v14

    goto :goto_0

    :sswitch_6
    move-object/from16 v12, p2

    .line 65
    sget v13, Ll/ۗۡ֫;->ۙ:I

    invoke-static {v1, v13}, Ll/ۗ֫;->ܽܶ᩺(Ljava/lang/Object;I)V

    move-object/from16 v13, p1

    .line 66
    invoke-static {v1, v13}, Ll/ۖۖ;->ܳ۫᩸(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v14, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v14, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v14, "\u0736\u06eb"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    mul-int/lit8 v14, v14, -0x13

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x19c9

    const v16, -0x6db6a9d5

    xor-int v15, v15, v16

    const v16, 0x42d5f6a8

    goto/16 :goto_6

    :sswitch_7
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 64
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 36
    sget v14, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v14, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v14, "\u1a7b\u073f"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v11, v14

    mul-int/lit8 v14, v14, -0x5

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x3be1

    const v16, 0x233fb508

    xor-int v15, v15, v16

    const v16, 0x7e8d2e82

    goto/16 :goto_6

    :sswitch_8
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 63
    invoke-static {v7}, Ll/ۖۙ;->᩸ۨ᩶(F)I

    move-result v8

    .line 62
    invoke-virtual {v1, v3, v5, v6, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    const/high16 v8, 0x41700000    # 15.0f

    sget v14, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v14, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v14, "\u06df\u073f"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    mul-int/lit8 v14, v14, -0x45

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x56b7

    const v16, -0x40545348

    xor-int v15, v15, v16

    const v16, 0x4d3bb14e    # 1.9680995E8f

    goto/16 :goto_6

    :sswitch_9
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 63
    invoke-static {v2}, Ll/ۗܶ;->ۚۢۨ(F)I

    move-result v6

    const/high16 v7, 0x40c00000    # 6.0f

    .line 15
    sget v14, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v14, :cond_7

    const-string v14, "\u1a7a\u0733"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, 0x5c47

    const v16, 0x24199839

    xor-int v15, v15, v16

    const v16, 0x2fd53c25

    goto/16 :goto_6

    :cond_7
    const-string v14, "\u1a7a\u1a7a"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v11, v14

    mul-int/lit8 v14, v14, 0x61

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, 0x105b

    const v16, -0x65263c80

    xor-int v15, v15, v16

    const v16, -0x23fd243d

    goto/16 :goto_6

    :sswitch_a
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 62
    invoke-static {v4}, Ll/ۖۙ;->᩸ۨ᩶(F)I

    move-result v5

    sget v14, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v14, :cond_8

    goto :goto_3

    :cond_8
    const-string v14, "\u06eb\u06d7"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x48a9

    const v16, -0x576272d0

    xor-int v15, v15, v16

    const v16, -0x577d780a

    goto/16 :goto_6

    :sswitch_b
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-static {v2}, Ll/ۗܶ;->ۚۢۨ(F)I

    move-result v3

    const/high16 v4, 0x40800000    # 4.0f

    sget v14, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v14, :cond_9

    :goto_2
    const-string v14, "\u06da\u05ab"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x566b

    const v16, 0x614e0356

    xor-int v15, v15, v16

    const v16, 0x1339c722

    goto/16 :goto_6

    :cond_9
    const-string v14, "\u1a79\u1a79"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v11

    mul-int/lit8 v14, v14, -0xb

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x4f8f

    const v16, -0x6fff927e

    xor-int v15, v15, v16

    const v16, 0x1d7df145

    goto/16 :goto_6

    :sswitch_c
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 61
    new-instance v1, Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Ll/۠ۖۧ;->ۙ()Landroid/content/Context;

    move-result-object v14

    invoke-direct {v1, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 7
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v14

    if-nez v14, :cond_a

    :goto_3
    const-string v14, "\u06dc\u1a74"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    mul-int/lit8 v14, v14, 0x7f

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0xfbf

    const v16, -0x2b4dd0b3

    xor-int v15, v15, v16

    const v16, -0x58a9af18

    goto/16 :goto_6

    :cond_a
    const-string v14, "\u06d6\u06da"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x533f

    const v16, -0x58bfe1b5

    xor-int v15, v15, v16

    const v16, -0x4baafc09

    goto :goto_6

    :sswitch_d
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 60
    invoke-virtual/range {p0 .. p0}, Ll/۠ۖۧ;->᩷()Ll/᩹ᩴ;

    move-result-object v0

    .line 61
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v14

    if-nez v14, :cond_b

    :goto_4
    const-string v14, "\u06ec\u06ec"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v11, v14

    mul-int/lit8 v14, v14, -0x7d

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x3d63

    const v16, -0x2a55171e

    xor-int v15, v15, v16

    const v16, 0x376f2262

    goto :goto_6

    :cond_b
    const-string v14, "\u1a79\u1a77"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v11, v14

    mul-int/lit8 v14, v14, -0x43

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x6e27

    const v16, 0x735b0814

    xor-int v15, v15, v16

    const v16, 0x22aff19d

    goto :goto_6

    :sswitch_e
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v14

    if-eqz v14, :cond_c

    :goto_5
    const-string v14, "\u06e0\u05ab"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v11, v14

    mul-int/lit8 v14, v14, -0x17

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, 0x3cb5

    const v16, 0x74a73892

    xor-int v15, v15, v16

    const v16, 0x73cadf32

    goto :goto_6

    :cond_c
    const-string v14, "\u1a74\u06e2"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x55d5

    const v16, 0x12597b36

    xor-int v15, v15, v16

    const v16, -0x6550e78f

    :goto_6
    xor-int v14, v14, v16

    move v12, v14

    move v13, v15

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f35d615 -> :sswitch_d
        -0x76b706b5 -> :sswitch_5
        -0x6f5a9373 -> :sswitch_8
        -0x6ad5dd2a -> :sswitch_2
        -0x5d0872ea -> :sswitch_4
        -0x5339e2c1 -> :sswitch_8
        -0x47353d5e -> :sswitch_1
        -0x442558ba -> :sswitch_7
        -0x3a180980 -> :sswitch_7
        -0x3262e09d -> :sswitch_e
        -0x2ee51d8e -> :sswitch_2
        -0x2ebef6ab -> :sswitch_d
        -0x203810de -> :sswitch_5
        -0x1c908e90 -> :sswitch_9
        -0x14977776 -> :sswitch_6
        -0x566a780 -> :sswitch_b
        -0x195aa37 -> :sswitch_a
        -0x470d07 -> :sswitch_b
        0xda2f4c6 -> :sswitch_3
        0xdd6096b -> :sswitch_4
        0x121d74f0 -> :sswitch_0
        0x27b965ad -> :sswitch_a
        0x2978ff3b -> :sswitch_c
        0x29988ffc -> :sswitch_6
        0x3de2d399 -> :sswitch_3
        0x4f1cac68 -> :sswitch_e
        0x58d436f9 -> :sswitch_1
        0x612c13a3 -> :sswitch_c
        0x65ac530a -> :sswitch_9
        0x67b8e060 -> :sswitch_0
    .end sparse-switch
.end method

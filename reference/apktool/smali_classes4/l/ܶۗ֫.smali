.class public final synthetic Ll/ܶۗ֫;
.super Ljava/lang/Object;
.source "82RX"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۨۧۖ:[S


# instance fields
.field public final synthetic ܰ:Ll/᩹ۗ֫;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܶۗ֫;->ۨۧۖ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x13dfs
        0x1bbbs
        -0x6e8s
        -0xf5es
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/᩹ۗ֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۗ֫;->ܰ:Ll/᩹ۗ֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

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

    const v13, -0x484bc003

    sget v14, Ll/֫ۢ;->ۚ᩻᩵:I

    sget v15, Ll/ۖᩳ;->᩹ۧܳ:I

    const-string v16, "\u1a7b\u06df"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    xor-int v0, v16, v15

    mul-int/lit16 v0, v0, 0x4067

    const v18, -0x6ef02ee4

    xor-int v0, v0, v18

    const v18, 0x423cef97

    xor-int v16, v16, v18

    const/16 v17, 0x0

    :goto_0
    xor-int/2addr v13, v15

    mul-int/lit16 v13, v13, 0x33fd

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v0, v13

    xor-int v13, v16, v0

    sparse-switch v13, :sswitch_data_0

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Ll/ܶۗ֫;->ܰ:Ll/᩹ۗ֫;

    .line 113
    iget-object v1, v1, Ll/᩹ۗ֫;->۫:Ll/ۛۗ֫;

    invoke-static {v1}, Ll/ۛۗ֫;->ܳ(Ll/ۛۗ֫;)Landroid/widget/TextView;

    move-result-object v16

    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v17

    if-nez v17, :cond_6

    move-object/from16 v17, v1

    goto/16 :goto_5

    :sswitch_0
    sget v0, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v0, :cond_8

    :goto_1
    move-object/from16 v16, v1

    goto/16 :goto_6

    :sswitch_1
    sget v0, Ll/ۘ֡;->᩹ܶ۬:I

    if-lez v0, :cond_1

    :cond_0
    move-object/from16 v16, v1

    goto/16 :goto_7

    :cond_1
    move-object/from16 v16, v1

    goto :goto_2

    :sswitch_2
    sget v0, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v0, :cond_0

    goto :goto_1

    .line 44
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    return-void

    .line 114
    :sswitch_5
    invoke-static/range {v17 .. v17}, Ll/ۛۗ֫;->ܳ(Ll/ۛۗ֫;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    return-void

    .line 113
    :sswitch_6
    invoke-static {v1, v2}, Ll/֨ۢ;->᩵֡᩹(Ljava/lang/Object;I)V

    .line 81
    sget v0, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v0, :cond_2

    move-object/from16 v16, v1

    goto/16 :goto_3

    :cond_2
    const-string v0, "\u05a8\u06df"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x53

    move-object/from16 v16, v1

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0xc23

    const v18, -0x70d5090

    xor-int v1, v1, v18

    const v18, 0x31a6fc8e    # 4.859948E-9f

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v16, v1

    .line 113
    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7d2793a5

    xor-int v2, v0, v1

    .line 69
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v0

    if-nez v0, :cond_3

    :goto_2
    const-string v0, "\u05a1\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x5d

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0xf99

    const v18, 0x4fadd0

    xor-int v1, v1, v18

    const v18, 0x7cd9e3ce

    goto/16 :goto_8

    :cond_3
    const-string v0, "\u06d7\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x29

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x674f

    const v18, -0x2a309d91

    xor-int v1, v1, v18

    const v18, -0x6d2d191c

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v16, v1

    const/4 v0, 0x1

    const/4 v1, 0x3

    .line 113
    invoke-static {v12, v0, v1, v11}, Ll/ۖۙ;->ۘ᩹ܰ([SIII)Ljava/lang/String;

    move-result-object v3

    sget v0, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v0, :cond_4

    goto :goto_3

    :cond_4
    const-string v0, "\u1a77\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x23

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x5e47

    const v18, -0x38d33128

    xor-int v1, v1, v18

    const v18, -0x495842c4    # -4.9990176E-6f

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v16, v1

    sget-object v12, Ll/ܶۗ֫;->ۨۧۖ:[S

    .line 77
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v0

    if-eqz v0, :cond_5

    :goto_3
    const-string v0, "\u073d\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0xf

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x787f

    const v18, 0x2f135e96

    xor-int v1, v1, v18

    const v18, 0x6db90e0d

    goto/16 :goto_8

    :cond_5
    const-string v0, "\u073a\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x31

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x3291

    const v18, 0x7550e31

    xor-int v1, v1, v18

    const v18, 0x934054

    goto/16 :goto_8

    :cond_6
    const-string v17, "\u1a79\u1a75"

    invoke-static/range {v17 .. v17}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v17

    add-int v17, v17, v14

    mul-int/lit8 v17, v17, -0x79

    xor-int v0, v17, v15

    mul-int/lit16 v0, v0, 0x7f65

    const v18, -0x62f2bb3f

    xor-int v0, v0, v18

    const v18, -0x123b4604

    xor-int v17, v17, v18

    move/from16 v19, v17

    move-object/from16 v17, v1

    move-object/from16 v1, v16

    move/from16 v16, v19

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v16, v1

    const/16 v0, 0x6443

    const/16 v11, 0x6443

    goto :goto_4

    :sswitch_b
    move-object/from16 v16, v1

    const v0, 0x8950

    const v11, 0x8950

    :goto_4
    const-string v0, "\u0733\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x27

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x2e9

    const v18, 0x1fa27a73

    xor-int v1, v1, v18

    const v18, 0x7e013d47

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v16, v1

    add-int v0, v9, v10

    sub-int/2addr v0, v8

    if-ltz v0, :cond_7

    const-string v0, "\u1a73\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x7f93

    const v18, -0x3dbce356

    xor-int v1, v1, v18

    const v18, 0x615b77fa

    goto/16 :goto_8

    :cond_7
    const-string v0, "\u06e7\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x45

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x364d

    const v18, -0x672b38ee

    xor-int v1, v1, v18

    const v18, 0x44ae3b0b

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v16, v1

    const v10, 0xd5eb501

    sget v0, Ll/ۧ;->ۨۗܰ:I

    if-ltz v0, :cond_9

    :goto_5
    move-object/from16 v1, v16

    :cond_8
    const-string v0, "\u05a1\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x6f

    move-object/from16 v16, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x39bf

    const v18, -0x67c02983

    xor-int v1, v1, v18

    const v18, -0x232f893a

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u073a\u073d"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x34a5

    const v18, 0x2dbcab2e

    xor-int v1, v1, v18

    const v18, 0x609a0e21

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v16, v1

    mul-int v8, v6, v7

    mul-int v9, v6, v6

    .line 45
    sget-boolean v0, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v0, :cond_a

    goto :goto_6

    :cond_a
    const-string v0, "\u0736\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0xf93

    const v18, -0x5b40353e

    xor-int v1, v1, v18

    const v18, 0x15de6f89

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v16, v1

    aget-short v6, v4, v5

    const/16 v7, 0x7502

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_7

    :cond_b
    const-string v0, "\u06da\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x2e0b

    const v18, -0x75d4b73

    xor-int v1, v1, v18

    const v18, 0x533f76c1

    goto :goto_8

    :sswitch_10
    move-object/from16 v16, v1

    const/4 v5, 0x0

    .line 98
    sget v0, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v0, :cond_c

    :goto_6
    const-string v0, "\u06d7\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x7b

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x3ffb

    const v18, 0x60165533

    xor-int v1, v1, v18

    const v18, 0x1734e870

    goto :goto_8

    :cond_c
    const-string v0, "\u0736\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x45

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x657d

    const v18, -0x59794bcc

    xor-int v1, v1, v18

    const v18, 0x54c227f2

    goto :goto_8

    :sswitch_11
    move-object/from16 v16, v1

    sget-object v4, Ll/ܶۗ֫;->ۨۧۖ:[S

    sget v0, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v0, :cond_d

    :goto_7
    const-string v0, "\u06df\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x75

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x43bf

    const v18, 0x3a0fd193

    xor-int v1, v1, v18

    const v18, -0x51a9834f

    goto :goto_8

    :cond_d
    const-string v0, "\u1a76\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x33c5

    const v18, 0x5688261

    xor-int v1, v1, v18

    const v18, 0x6d33ec25

    :goto_8
    xor-int v0, v0, v18

    move-object/from16 v19, v16

    move/from16 v16, v0

    move v0, v1

    move-object/from16 v1, v19

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cbb66c6 -> :sswitch_b
        -0x7b19a676 -> :sswitch_0
        -0x784dc362 -> :sswitch_5
        -0x78090b95 -> :sswitch_10
        -0x6d33a63e -> :sswitch_8
        -0x6afaed81 -> :sswitch_2
        -0x654ac2f0 -> :sswitch_f
        -0x6426974b -> :sswitch_6
        -0x6358b81e -> :sswitch_1
        -0x612376ff -> :sswitch_7
        -0x5c215597 -> :sswitch_9
        -0x45a20437 -> :sswitch_6
        -0x311518b4 -> :sswitch_3
        -0x2c789b11 -> :sswitch_8
        -0x157633b2 -> :sswitch_f
        -0xfe75ef8 -> :sswitch_4
        0x5bd7f37 -> :sswitch_b
        0x60c8aae -> :sswitch_5
        0x7db9223 -> :sswitch_d
        0x1c762dcc -> :sswitch_e
        0x1f467eaf -> :sswitch_7
        0x227962d0 -> :sswitch_10
        0x26dae7b4 -> :sswitch_11
        0x2b89a858 -> :sswitch_c
        0x2fd35cb2 -> :sswitch_c
        0x34e71a6d -> :sswitch_11
        0x3baf3a91 -> :sswitch_9
        0x3f96174f -> :sswitch_e
        0x43f2cc0c -> :sswitch_1
        0x4b79e9cb -> :sswitch_0
        0x4ca4508e -> :sswitch_3
        0x4ea336ec -> :sswitch_2
        0x5bb6aede -> :sswitch_4
        0x713bba0b -> :sswitch_d
        0x75575081 -> :sswitch_a
        0x7865b57d -> :sswitch_a
    .end sparse-switch
.end method

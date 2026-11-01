.class public Ll/ۧۡۘ;
.super Ll/ۙ᩶ۘ;
.source "A97T"


# static fields
.field private static final ۖ۬᩶:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۧۡۘ;->ۖ۬᩶:[S

    return-void

    :array_0
    .array-data 2
        0x1502s
        -0x289cs
        -0x2895s
        -0x289fs
        -0x2889s
        -0x2896s
        -0x2894s
        -0x289fs
        -0x28d5s
        -0x2894s
        -0x2895s
        -0x288fs
        -0x28a0s
        -0x2895s
        -0x288fs
        -0x28d5s
        -0x289cs
        -0x289as
        -0x288fs
        -0x2894s
        -0x2896s
        -0x2895s
        -0x28d5s
        -0x28ads
        -0x28b4s
        -0x28c0s
        -0x28aes
        -0x289ds
        -0x2889s
        -0x2896s
        -0x2898s
        -0x28c0s
        -0x2883s
        -0x288fs
        -0x28a0s
        -0x2889s
        -0x2895s
        -0x289cs
        -0x2897s
        -0x28bcs
        -0x288bs
        -0x288bs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ll/ۙ᩶ۘ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 23

    move-object/from16 v1, p0

    const/4 v2, 0x0

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

    const v16, 0x10629e2c

    sget v17, Ll/֡ۚ;->ۢܰ᩸:I

    sget v18, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v19, "\u1a7b\u073a"

    invoke-static/range {v19 .. v19}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v19

    add-int v19, v19, v18

    mul-int/lit8 v19, v19, -0x73

    xor-int v0, v19, v17

    mul-int/lit16 v0, v0, 0x755

    const v21, -0x54e18986

    xor-int v0, v0, v21

    const v21, -0x2ffb1e27

    xor-int v19, v19, v21

    move-object/from16 v22, v7

    const/4 v3, 0x0

    const/16 v20, 0x0

    :goto_0
    xor-int v7, v16, v17

    mul-int/lit16 v7, v7, -0x21d7

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v0, v7

    xor-int v16, v19, v0

    sparse-switch v16, :sswitch_data_0

    .line 27
    :try_start_0
    new-instance v3, Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v0, :cond_f

    goto/16 :goto_c

    .line 16
    :sswitch_1
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    sget-boolean v0, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v0, :cond_11

    goto/16 :goto_a

    :sswitch_2
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    sget v0, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v0, :cond_13

    goto/16 :goto_8

    .line 19
    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v0, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v0, :cond_0

    goto/16 :goto_9

    :cond_0
    const-string v0, "\u06df\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x6d

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, 0x559f

    const v19, -0x55db5b16

    xor-int v7, v7, v19

    const v19, 0x2fdf6765

    goto/16 :goto_2

    .line 3
    :sswitch_4
    sget v0, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v0, :cond_a

    goto :goto_1

    .line 4
    :sswitch_5
    sget v0, Ll/֡֡;->᩶ۤ۠:I

    if-lez v0, :cond_8

    goto :goto_1

    :sswitch_6
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_b

    :sswitch_7
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    sget v0, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez v0, :cond_c

    goto :goto_1

    :sswitch_8
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    :goto_1
    const-string v0, "\u073d\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x31

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, -0x5fd1

    const v19, 0x14773ce5

    xor-int v7, v7, v19

    const v19, -0x6c3bcd1d

    goto :goto_2

    .line 31
    :sswitch_9
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    return-void

    :sswitch_a
    and-int/lit8 v0, v6, -0x4

    .line 42
    :try_start_1
    invoke-virtual {v3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 43
    invoke-static {v1, v3}, Ll/֫ۚ;->֨ܺۖ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_6

    .line 45
    :sswitch_b
    throw v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :sswitch_c
    and-int/lit8 v0, v6, 0x1

    if-eqz v0, :cond_1

    const-string v0, "\u1a77\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, -0x68e7

    const v19, -0x6a7162de

    xor-int v7, v7, v19

    const v19, 0x7fc4707

    goto :goto_2

    :cond_1
    const-string v0, "\u06dc\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x7f

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, -0x6fd1

    const v19, -0xb7175ca

    xor-int v7, v7, v19

    const v19, -0x4391d10c

    goto :goto_2

    .line 38
    :sswitch_d
    :try_start_2
    invoke-virtual {v3}, Landroid/content/Intent;->getFlags()I

    move-result v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    const-string v0, "\u1a78\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x45

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, -0x22dd

    const v19, -0x11326158

    xor-int v7, v7, v19

    const v19, 0x5e71505f

    :goto_2
    xor-int v19, v0, v19

    goto :goto_3

    .line 35
    :sswitch_e
    :try_start_3
    invoke-static {v1, v3}, Ll/֫ۚ;->֨ܺۖ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_6

    :catch_0
    move-exception v0

    const-string v5, "\u0730\u0733"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v18

    mul-int/lit8 v5, v5, -0x41

    xor-int v7, v5, v17

    mul-int/lit16 v7, v7, -0x7cd5

    const v19, -0x44a5fd4e

    xor-int v7, v7, v19

    const v19, 0x33054347

    xor-int v19, v5, v19

    move-object v5, v0

    :goto_3
    move v0, v7

    goto/16 :goto_0

    .line 27
    :goto_4
    :try_start_4
    sget v0, Ll/۠ܶ᩹;->ۙ:I

    const-class v0, Ll/ۨۤۖ;

    invoke-direct {v3, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    const/high16 v0, 0x10000000

    .line 28
    :try_start_5
    invoke-static {v3, v0}, Ll/ۗ;->ۜܳ᩵(Ljava/lang/Object;I)Landroid/content/Intent;

    const/high16 v0, 0x4000000

    .line 29
    invoke-static {v3, v0}, Ll/ۗ;->ۜܳ᩵(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 30
    invoke-static {v3, v4}, Ll/᩸֫ᩳ;->ۙ(Landroid/content/Intent;Landroid/net/Uri;)V

    sget-object v0, Ll/ۧۡۘ;->ۖ۬᩶:[S

    const/4 v7, 0x1

    const/16 v1, 0x1a

    invoke-static {v0, v7, v1, v15}, Ll/᩶;->ۙ᩷֨([SIII)Ljava/lang/String;

    move-result-object v0

    .line 31
    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 32
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    sget-object v0, Ll/ۧۡۘ;->ۖ۬᩶:[S

    const/16 v1, 0x1b

    const/16 v7, 0xf

    invoke-static {v0, v1, v7, v15}, Ll/֨֫;->ܺᩴܳ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    .line 33
    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    const-string v0, "\u1a7a\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x16b7

    const v7, -0x7a527b40

    xor-int/2addr v1, v7

    const v7, -0x60ee102f

    goto/16 :goto_d

    :catch_1
    const/4 v3, 0x0

    goto :goto_6

    .line 23
    :sswitch_f
    :try_start_6
    invoke-virtual/range {v20 .. v20}, Ll/᩷۠ۚ;->ۨۙ()Landroid/net/Uri;

    move-result-object v0

    goto :goto_5

    .line 25
    :sswitch_10
    invoke-virtual/range {v20 .. v20}, Ll/᩷۠ۚ;->᩷ܰ()Landroid/net/Uri;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    :goto_5
    move-object v4, v0

    const-string v0, "\u1a7b\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x776b

    const v7, -0x2e1b229a

    xor-int/2addr v1, v7

    const v7, -0x4c451fff

    goto/16 :goto_d

    :sswitch_11
    if-eqz v2, :cond_2

    const-string v0, "\u06e4\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x19

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x77a1

    const v7, 0x1da897c3

    xor-int/2addr v1, v7

    const v7, 0x64c8a66c

    goto/16 :goto_d

    :cond_2
    const-string v0, "\u1a75\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x7d

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x73bf

    const v7, 0x5ae1cdbf

    xor-int/2addr v1, v7

    const v7, -0x18f91dcb

    goto/16 :goto_d

    .line 51
    :sswitch_12
    invoke-static/range {p0 .. p0}, Ll/֡ۛ;->ۨܶ۠(Ljava/lang/Object;)V

    return-void

    .line 20
    :sswitch_13
    :try_start_7
    invoke-static/range {p0 .. p0}, Ll/ۚ᩵ۚ;->ۙ(Ll/ۙ᩶ۘ;)Ll/᩷۠ۚ;

    move-result-object v20

    .line 22
    invoke-virtual/range {v20 .. v20}, Ll/᩷۠ۚ;->ܽۙ()Z

    move-result v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    const-string v0, "\u06d8\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x48b3

    const v7, 0x327e0464

    xor-int/2addr v1, v7

    const v7, 0x3b6c8b61

    goto/16 :goto_d

    :catch_2
    :goto_6
    const-string v0, "\u1a76\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x2321

    const v7, 0x2d29995c

    xor-int/2addr v1, v7

    const v7, 0x3f165110

    goto/16 :goto_d

    .line 18
    :sswitch_14
    invoke-super/range {p0 .. p1}, Ll/ۙ᩶ۘ;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "\u073f\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x193d

    const v7, -0x6771e020

    xor-int/2addr v1, v7

    const v7, 0x675516ff

    goto/16 :goto_d

    :sswitch_15
    const v0, 0xadff

    const v15, 0xadff

    goto :goto_7

    :sswitch_16
    const v0, 0xd705

    const v15, 0xd705

    :goto_7
    const-string v0, "\u1a76\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x67

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x4fb3

    const v7, -0x2208d33c

    xor-int/2addr v1, v7

    const v7, 0x722e0fb9

    goto/16 :goto_d

    :sswitch_17
    add-int v0, v13, v14

    add-int/2addr v0, v0

    sub-int/2addr v0, v12

    if-ltz v0, :cond_3

    const-string v0, "\u073a\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x29c3

    const v7, -0x3aa45dd8

    xor-int/2addr v1, v7

    const v7, 0x6501f1e0

    goto/16 :goto_d

    :cond_3
    const-string v0, "\u0730\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x15ad

    const v7, 0xeb0a3d6

    xor-int/2addr v1, v7

    const v7, 0x7fd91e57

    goto/16 :goto_d

    :sswitch_18
    const v14, 0x16b57781

    sget-boolean v0, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v0, :cond_5

    :cond_4
    :goto_8
    const-string v0, "\u073a\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x7ff1

    const v7, -0x32bfc034

    xor-int/2addr v1, v7

    const v7, 0xda93ac

    goto/16 :goto_d

    :cond_5
    const-string v0, "\u1a79\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0xd

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x1175

    const v7, -0x2029ba79

    xor-int/2addr v1, v7

    const v7, 0x66020ef0

    goto/16 :goto_d

    :sswitch_19
    mul-int v12, v11, v11

    mul-int v13, v9, v9

    .line 31
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v0

    if-eqz v0, :cond_6

    goto/16 :goto_a

    :cond_6
    const-string v0, "\u06e2\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x59

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x1749

    const v7, -0x184da138

    xor-int/2addr v1, v7

    const v7, 0x30085eb1

    goto/16 :goto_d

    :sswitch_1a
    add-int v11, v9, v10

    .line 44
    sget v0, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v0, :cond_7

    const-string v0, "\u0736\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x1417

    const v7, -0x4ab533f

    xor-int/2addr v1, v7

    const v7, 0x258bf30e

    goto/16 :goto_d

    :cond_7
    const-string v0, "\u1a79\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x2d

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x9d7

    const v7, 0x2a2944d6

    xor-int/2addr v1, v7

    const v7, 0x11eec4f4

    goto/16 :goto_d

    :sswitch_1b
    aget-short v9, v22, v8

    const/16 v10, 0x4c3f

    sget v0, Ll/֫;->ܶܺ᩻:I

    if-ltz v0, :cond_9

    :cond_8
    :goto_9
    const-string v0, "\u06d6\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0xf

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x5fc7

    const v7, 0x797987b5

    xor-int/2addr v1, v7

    const v7, 0xe422d91

    goto/16 :goto_d

    :cond_9
    const-string v0, "\u073d\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x1ccd

    const v7, -0x5ed5a8b

    xor-int/2addr v1, v7

    const v7, 0x1b207b4

    goto/16 :goto_d

    :sswitch_1c
    const/4 v8, 0x0

    sget v0, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v0, :cond_b

    :cond_a
    :goto_a
    const-string v0, "\u1a76\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x19

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x31cb

    const v7, -0x358251a8    # -4156310.0f

    xor-int/2addr v1, v7

    const v7, -0x443052e1

    goto/16 :goto_d

    :cond_b
    const-string v0, "\u06e0\u1a74"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x44cd

    const v7, -0x697ece64

    xor-int/2addr v1, v7

    const v7, -0x57cb6e8

    goto/16 :goto_d

    :sswitch_1d
    sget-object v22, Ll/ۧۡۘ;->ۖ۬᩶:[S

    .line 33
    sget-boolean v0, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v0, :cond_d

    :cond_c
    :goto_b
    const-string v0, "\u06e0\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x21

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x4353

    const v7, -0x556bd21a

    xor-int/2addr v1, v7

    const v7, -0x38482588

    goto/16 :goto_d

    :cond_d
    const-string v0, "\u06d9\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x71

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x8f1

    const v7, -0x6b28e35a

    xor-int/2addr v1, v7

    const v7, -0x4fe13bd0

    goto/16 :goto_d

    .line 30
    :sswitch_1e
    sget v0, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v0, :cond_e

    goto/16 :goto_c

    :cond_e
    const-string v0, "\u1a7a\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x5

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x1a41

    const v7, -0x260e676c

    xor-int/2addr v1, v7

    const v7, -0x478a3dd5

    goto/16 :goto_d

    .line 43
    :sswitch_1f
    sget v0, Ll/ۗ;->֨۬ۖ:I

    if-ltz v0, :cond_10

    :cond_f
    const-string v0, "\u1a76\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x596b

    const v7, -0x104f3bf6

    xor-int/2addr v1, v7

    const v7, -0x1f249a5c

    goto :goto_d

    :cond_10
    const-string v0, "\u06dc\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x35

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x1803

    const v7, 0xfba39c8

    xor-int/2addr v1, v7

    const v7, 0x58f3d855

    goto :goto_d

    .line 26
    :sswitch_20
    sget v0, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v0, :cond_12

    :cond_11
    const-string v0, "\u06e1\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x2323

    const v7, -0x7178fde4

    xor-int/2addr v1, v7

    const v7, -0x554d88c3

    goto :goto_d

    :cond_12
    const-string v0, "\u05a8\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x1297

    const v7, -0x217c5f62

    xor-int/2addr v1, v7

    const v7, -0xbf9d7d2

    goto :goto_d

    .line 8
    :sswitch_21
    sget v0, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v0, :cond_14

    :cond_13
    :goto_c
    const-string v0, "\u06df\u073a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x25

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x176f

    const v7, 0x7e1cfeb5

    xor-int/2addr v1, v7

    const v7, 0x686aad49

    goto :goto_d

    :cond_14
    const-string v0, "\u1a7b\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x29

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0xa5d

    const v7, 0x36ccfca4

    xor-int/2addr v1, v7

    const v7, -0x424fd393

    :goto_d
    xor-int v19, v0, v7

    move v0, v1

    move-object/from16 v1, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x799d3070 -> :sswitch_1d
        -0x77f0b15f -> :sswitch_c
        -0x7323ef83 -> :sswitch_9
        -0x73167a25 -> :sswitch_13
        -0x71428109 -> :sswitch_16
        -0x68c4449d -> :sswitch_6
        -0x674679df -> :sswitch_11
        -0x61a425e6 -> :sswitch_f
        -0x618c1b36 -> :sswitch_14
        -0x610818f8 -> :sswitch_14
        -0x5d98c982 -> :sswitch_1a
        -0x523e3d2a -> :sswitch_17
        -0x50032db9 -> :sswitch_1b
        -0x4ad8d939 -> :sswitch_1b
        -0x45e2b3f0 -> :sswitch_c
        -0x3b617d9f -> :sswitch_18
        -0x3a5a671e -> :sswitch_1e
        -0x395830ab -> :sswitch_1c
        -0x38a0b50d -> :sswitch_b
        -0x3718203b -> :sswitch_21
        -0x35931d7c -> :sswitch_21
        -0x34dce70e -> :sswitch_18
        -0x3404e83a -> :sswitch_17
        -0x31c89caf -> :sswitch_0
        -0x30e415f4 -> :sswitch_d
        -0x2ef26d7c -> :sswitch_5
        -0x2b56e003 -> :sswitch_12
        -0x27bbaeb2 -> :sswitch_1a
        -0x263c603d -> :sswitch_8
        -0x23f3d24b -> :sswitch_15
        -0x22cbb4c6 -> :sswitch_1d
        -0x1e2569c0 -> :sswitch_1c
        -0x18049d90 -> :sswitch_10
        -0x1499fc9a -> :sswitch_7
        -0x13bcf785 -> :sswitch_a
        -0x111f2cdd -> :sswitch_12
        -0x957c2c5 -> :sswitch_9
        -0x2f4ec0f -> :sswitch_19
        0x2e6eef -> :sswitch_1
        0x5200aa7 -> :sswitch_b
        0x1195f323 -> :sswitch_4
        0x161bd255 -> :sswitch_d
        0x1c531e84 -> :sswitch_e
        0x1eb3d2cc -> :sswitch_11
        0x1fbaeb7a -> :sswitch_1f
        0x20593bce -> :sswitch_a
        0x27b3513b -> :sswitch_1f
        0x323319ee -> :sswitch_20
        0x3a5fd3b1 -> :sswitch_3
        0x410eede2 -> :sswitch_2
        0x419ef764 -> :sswitch_5
        0x430761a3 -> :sswitch_7
        0x430d88dc -> :sswitch_1
        0x4352e7c0 -> :sswitch_15
        0x4909cd4f -> :sswitch_6
        0x4c1ff8c1 -> :sswitch_1e
        0x4c6c3e13 -> :sswitch_16
        0x614e2ae7 -> :sswitch_19
        0x6346499e -> :sswitch_13
        0x65b3b0e7 -> :sswitch_10
        0x66a8777c -> :sswitch_4
        0x67f86547 -> :sswitch_8
        0x70720b7c -> :sswitch_0
        0x74aea11b -> :sswitch_e
        0x79caba61 -> :sswitch_3
        0x7baa8b22 -> :sswitch_2
        0x7d7b799c -> :sswitch_f
        0x7f245615 -> :sswitch_20
    .end sparse-switch
.end method

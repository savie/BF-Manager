.class public final Ll/᩸۠᩺;
.super Ljava/lang/Object;
.source "T6NI"


# static fields
.field private static final ۠ۙ֫:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x13

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸۠᩺;->۠ۙ֫:[S

    return-void

    :array_0
    .array-data 2
        0x18f7s
        -0x2c33s
        -0x100fs
        0x25e3s
        -0x3a82s
        -0x3c84s
        0x29b5s
        -0x3195s
        -0x1653s
        -0x2f7es
        -0x3069s
        -0x3593s
        0x3dcas
        -0x2f5as
        0x2a1fs
        -0x1238s
        -0x3990s
        -0x3b2cs
        -0x30bcs
    .end array-data
.end method

.method public static ۙ(Landroid/app/Activity;Ll/ۘ۠᩺;Ljava/lang/Runnable;)V
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

    const v19, 0xeb77ff0

    sget v20, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v21, Ll/֫ᩳ;->۬֨᩸:I

    const-string v22, "\u06d6\u06e7"

    invoke-static/range {v22 .. v22}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v21

    xor-int v2, v22, v20

    mul-int/lit16 v2, v2, 0x77bb

    const v24, 0x2ca0be16

    xor-int v2, v2, v24

    const v24, -0x11c7f32d

    xor-int v22, v22, v24

    move-object/from16 v24, v3

    move-object/from16 v23, v7

    move-object v9, v8

    move-object/from16 v18, v14

    move-object v6, v15

    move-object/from16 v13, v16

    move-object/from16 v15, v17

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    move-object v7, v5

    move-object v5, v4

    :goto_0
    xor-int v4, v19, v20

    mul-int/lit16 v4, v4, -0x1a23

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v2, v4

    xor-int v19, v22, v2

    sparse-switch v19, :sswitch_data_0

    .line 83
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    sget-boolean v2, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v2, :cond_0

    :goto_1
    move-object/from16 v4, p2

    move/from16 v22, v1

    :goto_2
    move-object/from16 v25, v3

    move-object/from16 v3, v18

    goto/16 :goto_d

    :cond_0
    const-string v2, "\u06d8\u1a79"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v4, v2, v20

    mul-int/lit16 v4, v4, -0xe5d

    const v22, -0x1e700ee8

    xor-int v4, v4, v22

    const v22, -0x173e49af

    goto/16 :goto_4

    :sswitch_1
    sget-boolean v2, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    :goto_3
    move-object/from16 v4, p2

    goto/16 :goto_a

    :sswitch_2
    sget v2, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v2, :cond_2

    goto :goto_1

    :cond_2
    const-string v2, "\u1a73\u0736"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v21

    mul-int/lit8 v2, v2, 0x73

    xor-int v4, v2, v20

    mul-int/lit16 v4, v4, 0x130d

    const v22, -0x206b6505

    xor-int v4, v4, v22

    const v22, -0x3b29284a

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    return-void

    .line 68
    :sswitch_4
    sget-object v2, Ll/᩸۠᩺;->۠ۙ֫:[S

    const/16 v4, 0x10

    const/4 v7, 0x3

    invoke-static {v2, v4, v7, v14}, Ll/֫ۛ;->ۖۖۜ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    const v4, 0x7efebce7

    xor-int/2addr v2, v4

    invoke-static {v0, v2}, Ll/֫᩺;->᩺۠ܶ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, p2

    move/from16 v22, v1

    move-object v7, v2

    goto/16 :goto_7

    :sswitch_5
    const/4 v0, 0x3

    .line 53
    invoke-static {v15, v1, v0, v14}, Ll/ۧ;->۫֨۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7e8d3c6a

    xor-int/2addr v0, v1

    const/4 v1, 0x0

    .line 54
    invoke-static {v3, v0, v1}, Ll/ۧ;->᩷ۤ۫(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 55
    invoke-static {v3}, Ll/֫ۛ;->᩶ۖܿ(Ljava/lang/Object;)Ll/᩵ۡۜ;

    return-void

    :sswitch_6
    xor-int v1, v11, v12

    .line 53
    invoke-static {v3, v1, v8}, Ll/֫;->ܳܶۤ(Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object v15, Ll/᩸۠᩺;->۠ۙ֫:[S

    const/16 v1, 0xd

    .line 114
    sget v2, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v2, :cond_3

    goto :goto_3

    :cond_3
    const-string v2, "\u06e8\u06d8"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v4, v2, v20

    mul-int/lit16 v4, v4, 0x17c1

    const v22, 0x1006e85c

    xor-int v4, v4, v22

    const v22, -0x606faba5

    goto :goto_4

    :sswitch_7
    const/16 v2, 0xa

    const/4 v4, 0x3

    .line 52
    invoke-static {v13, v2, v4, v14}, Ll/ۘۛ;->᩷ۧ᩹([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    const v12, 0x7edefa45

    .line 72
    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v2, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v2, "\u05ab\u1a77"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    mul-int/lit8 v2, v2, -0x51

    xor-int v4, v2, v21

    mul-int/lit16 v4, v4, -0x56fd

    const v22, -0x675fadcb

    xor-int v4, v4, v22

    const v22, -0xa2b190c

    :goto_4
    xor-int v22, v2, v22

    move v2, v4

    goto/16 :goto_0

    :sswitch_8
    const v2, 0x7edb0e9a

    xor-int/2addr v2, v10

    .line 52
    invoke-static {v0, v2, v5}, Ll/֡᩸;->᩺֨ۚ(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Ll/֡᩸;->ܳۖۜ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll/ۖܳۘ;

    .line 140
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v2

    if-nez v2, :cond_5

    move-object/from16 v4, p2

    goto :goto_5

    :cond_5
    const/4 v2, 0x2

    move-object/from16 v4, p2

    .line 52
    invoke-direct {v8, v2, v4}, Ll/ۖܳۘ;-><init>(ILjava/lang/Object;)V

    sget-object v13, Ll/᩸۠᩺;->۠ۙ֫:[S

    .line 61
    sget v2, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v2, :cond_6

    :goto_5
    move/from16 v22, v1

    goto :goto_6

    :cond_6
    const-string v2, "\u06ec\u073f"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v21

    mul-int/lit8 v2, v2, 0x79

    move/from16 v22, v1

    xor-int v1, v2, v20

    mul-int/lit16 v1, v1, -0x6a7b

    const v25, -0x591ac269

    xor-int v1, v1, v25

    const v25, -0x13a521e2

    xor-int v2, v2, v25

    move/from16 v26, v2

    move v2, v1

    move/from16 v1, v22

    move/from16 v22, v26

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v4, p2

    move/from16 v22, v1

    const/4 v1, 0x7

    const/4 v2, 0x3

    .line 68
    invoke-static {v6, v1, v2, v14}, Ll/᩶;->ۙ᩷֨([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    .line 151
    sget-boolean v1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v1, :cond_7

    goto :goto_6

    :cond_7
    const-string v1, "\u073d\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, 0x35ef

    const v25, -0x28b6c3b

    xor-int v2, v2, v25

    const v25, -0x618699ff

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v4, p2

    move/from16 v22, v1

    const/4 v1, 0x1

    new-array v5, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v7, v5, v1

    .line 68
    sget-object v6, Ll/᩸۠᩺;->۠ۙ֫:[S

    .line 85
    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v1, :cond_8

    :goto_6
    const-string v1, "\u1a73\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x3c7

    const v8, 0x5bd365a0

    xor-int/2addr v2, v8

    const v8, -0x27d46992

    xor-int/2addr v1, v8

    const/4 v8, 0x0

    goto/16 :goto_9

    :cond_8
    const-string v1, "\u06df\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x5e5d

    const v25, -0x3368e899    # -7.9215416E7f

    xor-int v2, v2, v25

    const v25, -0x3a4a2a89

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v4, p2

    move/from16 v22, v1

    .line 67
    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x7ef34a34

    xor-int/2addr v1, v2

    invoke-static {v0, v1}, Ll/֫᩺;->᩺۠ܶ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    goto :goto_7

    :sswitch_c
    move-object/from16 v4, p2

    move/from16 v22, v1

    sget-object v1, Ll/᩸۠᩺;->۠ۙ֫:[S

    const/4 v2, 0x4

    const/4 v9, 0x3

    invoke-static {v1, v2, v9, v14}, Ll/ۖۧ;->᩶ܽܽ([SIII)Ljava/lang/String;

    move-result-object v9

    .line 21
    sget-boolean v1, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v1, :cond_9

    goto/16 :goto_2

    :cond_9
    const-string v1, "\u06eb\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x63

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, -0x123f

    const v25, 0x332bce0d    # 4.0001442E-8f

    xor-int v2, v2, v25

    const v25, 0x54bf0d82

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v4, p2

    move/from16 v22, v1

    .line 68
    invoke-static/range {v24 .. v24}, Ll/ۘۗ;->۬۫ܿ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    const-string v1, "\u06eb\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, 0x55

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, 0xa2f

    const v25, 0x4d79fb39    # 2.6212443E8f

    xor-int v2, v2, v25

    const v25, -0x753b55b3

    goto :goto_8

    :cond_a
    move-object/from16 v7, v24

    :goto_7
    const-string v1, "\u0736\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x6bb5

    const v25, 0x32385df

    xor-int v2, v2, v25

    const v25, 0x45918fc3

    goto :goto_8

    :sswitch_e
    move-object/from16 v4, p2

    move/from16 v22, v1

    .line 186
    invoke-static/range {v23 .. v23}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x7e89845f

    xor-int/2addr v1, v2

    .line 51
    invoke-static {v3, v1}, Ll/֡֡;->ۙۗۛ(Ljava/lang/Object;I)V

    move-object/from16 v2, p1

    .line 67
    iget-object v1, v2, Ll/ۘ۠᩺;->֨:Ljava/lang/String;

    move-object/from16 v24, v1

    iget-boolean v1, v2, Ll/ۘ۠᩺;->᩹:Z

    if-eqz v1, :cond_b

    const-string v1, "\u05a8\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x55

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0xa7b

    const v25, 0xf677a78

    xor-int v2, v2, v25

    const v25, -0x7f095cec

    goto :goto_8

    :cond_b
    const-string v1, "\u06eb\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, 0x76d1

    const v25, -0x6915e5d

    xor-int v2, v2, v25

    const v25, -0x20b6683c

    :goto_8
    xor-int v1, v1, v25

    goto :goto_9

    :sswitch_f
    move-object/from16 v4, p2

    move/from16 v22, v1

    const/4 v1, 0x1

    const/4 v2, 0x3

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    .line 186
    invoke-static {v3, v1, v2, v14}, Ll/֡֡;->ۨܶ᩷([SIII)Ljava/lang/String;

    move-result-object v23

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v1

    if-eqz v1, :cond_c

    goto/16 :goto_d

    :cond_c
    const-string v1, "\u05a8\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x37

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x710d

    const v18, 0x5cfea46b

    xor-int v2, v2, v18

    const v18, 0x1ced721d

    xor-int v1, v1, v18

    move-object/from16 v18, v3

    move-object/from16 v3, v25

    :goto_9
    move/from16 v26, v22

    move/from16 v22, v1

    move/from16 v1, v26

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v4, p2

    move/from16 v22, v1

    .line 50
    sget v1, Ll/᩵ۡۜ;->᩶:I

    .line 186
    new-instance v3, Ll/۠ۡۜ;

    invoke-direct {v3, v0}, Ll/۠ۡۜ;-><init>(Landroid/content/Context;)V

    sget-object v18, Ll/᩸۠᩺;->۠ۙ֫:[S

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v1

    if-gtz v1, :cond_d

    move/from16 v1, v22

    :goto_a
    const-string v2, "\u073a\u05a8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v0, v2, v21

    mul-int/lit16 v0, v0, -0x4f91

    const v22, -0x4ac46c38

    xor-int v0, v0, v22

    const v22, -0x3d870329

    xor-int v22, v2, v22

    move v2, v0

    goto/16 :goto_11

    :cond_d
    const-string v0, "\u1a77\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, -0x1b

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x129f

    const v2, -0x2309de4f

    xor-int/2addr v2, v1

    const v1, 0x258d807

    xor-int/2addr v0, v1

    move/from16 v1, v22

    goto/16 :goto_10

    :sswitch_11
    move-object/from16 v4, p2

    move/from16 v22, v1

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    const v0, 0xa282

    const v14, 0xa282

    goto :goto_b

    :sswitch_12
    move-object/from16 v4, p2

    move/from16 v22, v1

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    const v0, 0xb963

    const v14, 0xb963

    :goto_b
    const-string v0, "\u05a1\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x13

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x4a25

    const v2, 0x140afe24

    xor-int/2addr v2, v1

    const v1, 0x406d866d

    goto/16 :goto_e

    :sswitch_13
    move-object/from16 v4, p2

    move/from16 v22, v1

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    const v0, 0x110c0

    mul-int v0, v0, v17

    move/from16 v1, v17

    add-int/lit16 v2, v1, 0x4430

    mul-int v2, v2, v2

    sub-int/2addr v2, v0

    if-ltz v2, :cond_e

    const-string v0, "\u06ec\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x65

    xor-int v2, v0, v21

    mul-int/lit16 v2, v2, 0x202b

    const v17, -0x4f90dece

    xor-int v2, v2, v17

    const v17, -0x7d47e0bc

    :goto_c
    xor-int v0, v0, v17

    move/from16 v17, v1

    goto :goto_f

    :cond_e
    const-string v0, "\u06d6\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, -0x3eb3

    const v17, 0x3d0a185b

    xor-int v2, v2, v17

    const v17, -0x4f9836e4

    goto :goto_c

    :sswitch_14
    move-object/from16 v4, p2

    move/from16 v22, v1

    move-object/from16 v25, v3

    move-object/from16 v3, v18

    sget-object v0, Ll/᩸۠᩺;->۠ۙ֫:[S

    const/4 v1, 0x0

    aget-short v17, v0, v1

    sget v0, Ll/ۗ;->֨۬ۖ:I

    if-ltz v0, :cond_f

    :goto_d
    const-string v0, "\u06eb\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, -0x45

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0xc97

    const v2, 0x43aa98e7

    xor-int/2addr v2, v1

    const v1, -0x7906af8f

    goto :goto_e

    :cond_f
    const-string v0, "\u05a1\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x43

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x116f

    const v2, 0x2382ccca

    xor-int/2addr v2, v1

    const v1, 0x6a112de3

    :goto_e
    xor-int/2addr v0, v1

    :goto_f
    move-object/from16 v18, v3

    move/from16 v1, v22

    move-object/from16 v3, v25

    :goto_10
    move/from16 v22, v0

    :goto_11
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ec536cf -> :sswitch_1
        -0x75d2cec2 -> :sswitch_0
        -0x684f6b38 -> :sswitch_9
        -0x66685228 -> :sswitch_0
        -0x552edc3e -> :sswitch_3
        -0x475742b1 -> :sswitch_10
        -0x453b3a8c -> :sswitch_1
        -0x44f849b8 -> :sswitch_8
        -0x44bed500 -> :sswitch_c
        -0x43c2b47a -> :sswitch_14
        -0x435e8de2 -> :sswitch_4
        -0x326aead1 -> :sswitch_5
        -0x28fabc22 -> :sswitch_6
        -0x1d9d707b -> :sswitch_11
        -0x1bfaa631 -> :sswitch_7
        -0x198b64e2 -> :sswitch_9
        -0x18f9d15d -> :sswitch_2
        -0xff03cf5 -> :sswitch_b
        -0x9d219a3 -> :sswitch_5
        -0x7a42074 -> :sswitch_4
        -0x5c882ab -> :sswitch_d
        -0x2928ed2 -> :sswitch_e
        -0x1ca8ffd -> :sswitch_13
        0x8d629ba -> :sswitch_12
        0xe5f83a0 -> :sswitch_f
        0x10d639f6 -> :sswitch_a
        0x1741147b -> :sswitch_2
        0x1794f775 -> :sswitch_a
        0x184b6282 -> :sswitch_c
        0x1d489fbe -> :sswitch_13
        0x294a9201 -> :sswitch_7
        0x2b54544a -> :sswitch_b
        0x38e044e5 -> :sswitch_14
        0x470e27ac -> :sswitch_f
        0x49bc6f54 -> :sswitch_12
        0x502903f9 -> :sswitch_11
        0x554a36ee -> :sswitch_8
        0x63cfe0f7 -> :sswitch_3
        0x77f1d64c -> :sswitch_10
        0x77f63ad3 -> :sswitch_d
        0x7c0ee8ce -> :sswitch_e
        0x7c9c99e1 -> :sswitch_6
    .end sparse-switch
.end method

.method public static ۙ(Ll/᩵ۡۜ;Ljava/lang/String;Ljava/util/function/IntConsumer;)V
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

    const v9, 0x3f6b0f7f

    sget v10, Ll/֡ۚ;->ۢܰ᩸:I

    sget v11, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v12, "\u1a7a\u06eb"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0xb25

    const v14, 0x6be00aa2

    xor-int/2addr v13, v14

    const v14, 0x339993da

    xor-int/2addr v12, v14

    :goto_0
    xor-int/2addr v9, v11

    mul-int/lit16 v9, v9, -0x6dcb

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    move-object/from16 v12, p2

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 67
    invoke-virtual {v0, v1, v13, v14}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 46
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v13

    if-eqz v13, :cond_3

    move-object/from16 v13, p1

    goto/16 :goto_4

    :sswitch_0
    sget v12, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v12, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    goto/16 :goto_5

    :cond_1
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    goto/16 :goto_6

    .line 13
    :sswitch_1
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v12

    if-lez v12, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v12

    if-gtz v12, :cond_0

    :goto_2
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    goto/16 :goto_7

    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    goto :goto_2

    .line 21
    :sswitch_4
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    return-void

    .line 68
    :sswitch_5
    new-instance v1, Ll/ܶ۠᩺;

    move-object/from16 v12, p2

    invoke-direct {v1, v0, v12}, Ll/ܶ۠᩺;-><init>(Ll/᩸ۚ;Ljava/util/function/IntConsumer;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void

    :cond_3
    const-string v13, "\u06e8\u1a76"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x7917

    const v15, 0x1f21e166

    xor-int/2addr v14, v15

    const v15, -0x4c8555b6

    xor-int/2addr v13, v15

    move v12, v13

    move v13, v14

    goto :goto_0

    :sswitch_6
    move-object/from16 v12, p2

    .line 65
    sget v13, Ll/᩶᩵ۘ;->ۙ:I

    invoke-static {v1, v13}, Ll/ۖ᩸;->֨֨۫(Ljava/lang/Object;I)V

    move-object/from16 v13, p1

    .line 66
    invoke-static {v1, v13}, Ll/֫֡;->᩵ܿۛ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v14, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v14, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v14, "\u1a78\u1a7b"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x11dd

    const v16, -0x13b11938    # -1.0005142E27f

    xor-int v15, v15, v16

    const v16, 0x40d44b4a

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 64
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setTextSize(F)V

    sget v14, Ll/۟;->ۨᩴۛ:I

    if-ltz v14, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v14, "\u06e4\u1a77"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, 0x6e59

    const v16, 0x2d135b61

    xor-int v15, v15, v16

    const v16, 0xfd383b8

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 63
    invoke-static {v7}, Ll/֫;->ܰۛ۬(F)I

    move-result v8

    .line 62
    invoke-virtual {v1, v3, v5, v6, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    const/high16 v8, 0x41700000    # 15.0f

    sget-boolean v14, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v14, :cond_6

    goto :goto_3

    :cond_6
    const-string v14, "\u05a8\u05ab"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    mul-int/lit8 v14, v14, 0x5b

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x4603

    const v16, 0x66366035

    xor-int v15, v15, v16

    const v16, -0x18295c8e

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 63
    invoke-static {v2}, Ll/֫;->ܰۛ۬(F)I

    move-result v6

    const/high16 v7, 0x40c00000    # 6.0f

    sget v14, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v14, :cond_7

    goto :goto_3

    :cond_7
    const-string v14, "\u1a7b\u1a77"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v11

    mul-int/lit8 v14, v14, -0x65

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x2589

    const v16, -0x42df440b

    xor-int v15, v15, v16

    const v16, -0x179dbc76

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 62
    invoke-static {v4}, Ll/֡ܳ;->ۛۤ۠(F)I

    move-result v5

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v14

    if-nez v14, :cond_8

    :goto_3
    const-string v14, "\u1a7a\u1a79"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    mul-int/lit8 v14, v14, 0x43

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x5c59

    const v16, 0x76728bc2

    xor-int v15, v15, v16

    const v16, 0x30674f1c

    goto/16 :goto_8

    :cond_8
    const-string v14, "\u06d8\u073d"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v10

    mul-int/lit8 v14, v14, -0x6f

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x228d

    const v16, -0x5611db16

    xor-int v15, v15, v16

    const v16, -0x1453de17

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-static {v2}, Ll/֫;->ܰۛ۬(F)I

    move-result v3

    const/high16 v4, 0x40800000    # 4.0f

    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v14

    if-eqz v14, :cond_9

    :goto_4
    const-string v14, "\u06e2\u06e4"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x3fc1

    const v16, -0x49b021db

    xor-int v15, v15, v16

    const v16, -0x64607fda

    goto/16 :goto_8

    :cond_9
    const-string v14, "\u06d9\u1a76"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x6571

    const v16, 0x5c039da7

    xor-int v15, v15, v16

    const v16, -0x194357b3

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 61
    new-instance v1, Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Ll/᩵ۡۜ;->ۙ()Landroid/content/Context;

    move-result-object v14

    invoke-direct {v1, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 36
    sget v14, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v14, :cond_a

    :goto_5
    const-string v14, "\u06d6\u06d9"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x1be5

    const v16, -0x633d4e34

    xor-int v15, v15, v16

    const v16, -0x7674b564

    goto/16 :goto_8

    :cond_a
    const-string v14, "\u06db\u073d"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v10, v14

    mul-int/lit8 v14, v14, -0x53

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x7a19

    const v16, -0x36d5bd20    # -697390.0f

    xor-int v15, v15, v16

    const v16, 0x4473394a

    goto :goto_8

    :sswitch_d
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 60
    invoke-virtual/range {p0 .. p0}, Ll/᩵ۡۜ;->ܰ()Ll/᩸ۚ;

    move-result-object v0

    .line 62
    sget-boolean v14, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v14, :cond_b

    :goto_6
    const-string v14, "\u1a74\u0733"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x5cdf

    const v16, -0x1dc56d71

    xor-int v15, v15, v16

    const v16, 0x42705591

    goto :goto_8

    :cond_b
    const-string v14, "\u1a74\u06dc"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, 0x4983

    const v16, 0x52bca903

    xor-int v15, v15, v16

    const v16, -0x13580245

    goto :goto_8

    :sswitch_e
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    sget-boolean v14, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v14, :cond_c

    :goto_7
    const-string v14, "\u073a\u073a"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x7e9d

    const v16, -0x65c2fd08

    xor-int v15, v15, v16

    const v16, -0x2ebea682

    goto :goto_8

    :cond_c
    const-string v14, "\u1a73\u1a74"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x669b

    const v16, 0x59198656

    xor-int v15, v15, v16

    const v16, -0x49e7d4f7

    :goto_8
    xor-int v14, v14, v16

    move v12, v14

    move v13, v15

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x784033db -> :sswitch_b
        -0x768f33a0 -> :sswitch_9
        -0x6fb081c8 -> :sswitch_e
        -0x6e2c7dec -> :sswitch_6
        -0x6dc8dcce -> :sswitch_d
        -0x6d319d1d -> :sswitch_c
        -0x5a7e0449 -> :sswitch_b
        -0x3cf68580 -> :sswitch_8
        -0x3c1912d9 -> :sswitch_0
        -0x2eb297a8 -> :sswitch_0
        -0x277a9315 -> :sswitch_e
        -0x24f311fe -> :sswitch_7
        -0x238c60ef -> :sswitch_1
        -0x21188f2e -> :sswitch_6
        0x50a5e5a -> :sswitch_7
        0xa6863fd -> :sswitch_4
        0xe681dad -> :sswitch_1
        0x15ceb33b -> :sswitch_d
        0x1e44d0d1 -> :sswitch_9
        0x2a5e460c -> :sswitch_3
        0x2d7aab7b -> :sswitch_5
        0x36b83bc0 -> :sswitch_2
        0x384a8a37 -> :sswitch_2
        0x403013d3 -> :sswitch_8
        0x4f414f81 -> :sswitch_4
        0x548387cb -> :sswitch_3
        0x6ca71e2f -> :sswitch_5
        0x72a436ec -> :sswitch_c
        0x788a04d7 -> :sswitch_a
        0x78bcb74f -> :sswitch_a
    .end sparse-switch
.end method

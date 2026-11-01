.class public abstract Ll/۬ᩴ᩺;
.super Ljava/lang/Object;
.source "D20P"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۡ۫ܺ:[S


# instance fields
.field public ֡:Ll/ۖ᩷᩺;

.field public ܺ:Ll/ᩴۗ۠;

.field public ᩶:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2d

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۬ᩴ᩺;->ۡ۫ܺ:[S

    return-void

    :array_0
    .array-data 2
        0x1e82s
        0x1817s
        0x1862s
        0x1802s
        0x181bs
        0x1800s
        0x1804s
        0x1210s
        0x7ff3s
        0x7fa8s
        0x7fb9s
        0x7fafs
        0x7fa8s
        0x7fees
        0x7fbas
        0x7fbds
        0x7fafs
        0x7fa8s
        0x7f83s
        0x7fa9s
        0x7faes
        0x7fb0s
        0x7fafs
        0x7fa0s
        0x7fbas
        0x7fbds
        0x7fafs
        0x7fa8s
        0x7f83s
        0x7fa9s
        0x7faes
        0x7fb0s
        0x7fafs
        0x7f83s
        0x7fb9s
        0x7fa4s
        0x7facs
        0x7fb5s
        0x7faes
        0x7fb9s
        0x7fb8s
        0x7f8cs
        0x7f93s
        0x7f8fs
        0x7f88s
    .end array-data
.end method

.method public static ۙ(Ll/ᩴۗ۠;[B)Z
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

    const v16, -0x47cc3039

    sget v17, Ll/֨ۧ;->֫۠֡:I

    sget v18, Ll/ۘۧ;->ܳ᩷᩸:I

    const-string v19, "\u06e1\u1a79"

    invoke-static/range {v19 .. v19}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v19

    add-int v19, v19, v18

    mul-int/lit8 v19, v19, -0x1d

    xor-int v0, v19, v17

    mul-int/lit16 v0, v0, -0x4b37

    const v21, 0x1c4d4be0

    xor-int v0, v0, v21

    const v21, 0x5924d358

    xor-int v19, v19, v21

    move-object/from16 v16, v1

    move-object v11, v10

    move-object v14, v13

    move/from16 v20, v19

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const v19, -0x47cc3039

    const/16 v21, 0x0

    :goto_0
    xor-int v3, v19, v17

    mul-int/lit16 v3, v3, 0x2919

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v0, v3

    xor-int v19, v20, v0

    sparse-switch v19, :sswitch_data_0

    move-object/from16 v3, p0

    move-object/from16 v20, v1

    sget-object v16, Ll/۬ᩴ᩺;->ۡ۫ܺ:[S

    .line 201
    sget v0, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v0, :cond_f

    goto/16 :goto_b

    :sswitch_0
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    sget-boolean v0, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v0, :cond_0

    :goto_1
    move-object/from16 v3, p0

    goto/16 :goto_a

    :cond_0
    move-object/from16 v3, p0

    move-object/from16 v20, v1

    goto/16 :goto_b

    .line 25
    :sswitch_1
    sget v0, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v0, :cond_2

    :cond_1
    move-object/from16 v3, p0

    move-object/from16 v20, v1

    goto/16 :goto_8

    :cond_2
    :goto_2
    move-object/from16 v3, p0

    move-object/from16 v20, v1

    goto/16 :goto_7

    .line 226
    :sswitch_2
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget-boolean v0, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-eqz v0, :cond_1

    goto :goto_1

    .line 201
    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    goto :goto_1

    .line 248
    :sswitch_4
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    const/4 v0, 0x0

    return v0

    :sswitch_5
    const/4 v0, 0x1

    return v0

    :sswitch_6
    const/4 v0, 0x0

    return v0

    .line 259
    :sswitch_7
    invoke-virtual/range {p0 .. p0}, Ll/ᩴۗ۠;->ۙ()Ll/᩵ۗ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵ۗ۠;->ۨ()[B

    move-result-object v0

    move-object/from16 v3, p1

    invoke-static {v0, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_3

    :goto_3
    move-object/from16 v3, p0

    goto/16 :goto_5

    :cond_3
    const-string v0, "\u06eb\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x5657

    const v20, 0x1d42df59

    xor-int v3, v3, v20

    const v20, 0x6fa52b2b

    goto :goto_4

    .line 256
    :sswitch_8
    invoke-static {v14, v15, v2, v10}, Ll/ۧ;->۫֨۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    const-string v0, "\u1a74\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x1b

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x31f1

    const v20, -0x43072924

    xor-int v3, v3, v20

    const v20, 0x553eef5e

    goto :goto_4

    :sswitch_9
    sget-object v14, Ll/۬ᩴ᩺;->ۡ۫ܺ:[S

    const/4 v15, 0x5

    const/4 v2, 0x2

    .line 126
    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_5

    goto :goto_2

    :cond_5
    const-string v0, "\u06df\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x3433

    const v20, 0x520981ca

    xor-int v3, v3, v20

    const v20, -0x64319800

    :goto_4
    xor-int v20, v0, v20

    move v0, v3

    goto/16 :goto_0

    .line 254
    :sswitch_a
    invoke-static {v11, v12, v13, v10}, Ll/֫ۚ;->᩸ܺ᩷([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v3, p0

    .line 256
    invoke-virtual {v3, v0}, Ll/ᩴۗ۠;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 66
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v0

    if-gtz v0, :cond_6

    goto/16 :goto_a

    :cond_6
    const-string v0, "\u06db\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    move-object/from16 v20, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x2b3

    const v22, 0x1bfa5b80

    xor-int v1, v1, v22

    const v22, 0x106b5a12

    goto/16 :goto_c

    :sswitch_b
    move-object/from16 v3, p0

    .line 254
    sget-object v11, Ll/۬ᩴ᩺;->ۡ۫ܺ:[S

    const/4 v13, 0x4

    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v0

    if-eqz v0, :cond_7

    move-object/from16 v20, v1

    const/4 v12, 0x1

    goto/16 :goto_9

    :cond_7
    const-string v0, "\u06e1\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x15

    xor-int v12, v0, v17

    mul-int/lit16 v12, v12, 0x25db

    const v22, -0x2e82127a

    xor-int v12, v12, v22

    const v22, -0x4bde4fed

    xor-int v0, v0, v22

    move/from16 v20, v0

    move v0, v12

    const/4 v12, 0x1

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v3, p0

    invoke-virtual/range {p0 .. p0}, Ll/ᩴۗ۠;->۬()Z

    move-result v0

    if-nez v0, :cond_8

    :goto_5
    const-string v0, "\u06da\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x69

    move-object/from16 v20, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x647f

    const v22, -0xd410d21

    xor-int v1, v1, v22

    const v22, -0x6e14a462

    goto/16 :goto_c

    :cond_8
    move-object/from16 v20, v1

    const-string v0, "\u1a79\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x3c1

    const v22, 0x76c055fa

    xor-int v1, v1, v22

    const v22, 0x45d72a6

    goto/16 :goto_c

    :sswitch_d
    move-object/from16 v3, p0

    move-object/from16 v20, v1

    const/16 v0, 0x2bfb

    const/16 v10, 0x2bfb

    goto :goto_6

    :sswitch_e
    move-object/from16 v3, p0

    move-object/from16 v20, v1

    const/16 v0, 0x184f

    const/16 v10, 0x184f

    :goto_6
    const-string v0, "\u073a\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x33

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x5d7f

    const v22, -0x5f9b2430

    xor-int v1, v1, v22

    const v22, 0x65892440

    goto/16 :goto_c

    :sswitch_f
    move-object/from16 v3, p0

    move-object/from16 v20, v1

    add-int v0, v8, v9

    add-int/2addr v0, v0

    sub-int/2addr v0, v7

    if-gez v0, :cond_9

    const-string v0, "\u073d\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x53c9

    const v22, 0x1fe30f9f

    xor-int v1, v1, v22

    const v22, 0x214677db

    goto/16 :goto_c

    :cond_9
    const-string v0, "\u1a7a\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x9d3

    const v22, -0x768b54c4

    xor-int v1, v1, v22

    const v22, 0x6bf047ef

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v3, p0

    move-object/from16 v20, v1

    const v9, 0x6d49ca1

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v0

    if-nez v0, :cond_a

    :goto_7
    const-string v0, "\u06e7\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x3ead

    const v22, 0x44a553dd

    xor-int v1, v1, v22

    const v22, 0x5cd256e8

    goto/16 :goto_c

    :cond_a
    const-string v0, "\u05a8\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x71

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x4e17

    const v22, 0x21cd070b

    xor-int v1, v1, v22

    const v22, 0x2f2fd20b

    goto/16 :goto_c

    :sswitch_11
    move-object/from16 v3, p0

    move-object/from16 v20, v1

    mul-int v7, v6, v6

    mul-int v8, v4, v4

    .line 68
    sget v0, Ll/֫;->ܶܺ᩻:I

    if-ltz v0, :cond_b

    :goto_8
    const-string v0, "\u1a79\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x3231

    const v22, -0x7d738ec0

    xor-int v1, v1, v22

    const v22, 0x34e264b8

    goto/16 :goto_c

    :cond_b
    const-string v0, "\u1a78\u073d"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x2b97

    const v22, 0x7498bdd7

    xor-int v1, v1, v22

    const v22, -0x4c05be5a

    goto/16 :goto_c

    :sswitch_12
    move-object/from16 v3, p0

    move-object/from16 v20, v1

    add-int v6, v4, v5

    .line 19
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v0

    if-gtz v0, :cond_c

    :goto_9
    const-string v0, "\u1a73\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0xd

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x44b1

    const v22, 0x75dc0dbf

    xor-int v1, v1, v22

    const v22, -0x472f3cb6

    goto/16 :goto_c

    :cond_c
    const-string v0, "\u06d9\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x1f57

    const v22, 0x534fff98

    xor-int v1, v1, v22

    const v22, 0x6443bded

    goto/16 :goto_c

    :sswitch_13
    move-object/from16 v3, p0

    move-object/from16 v20, v1

    aget-short v4, v16, v21

    const/16 v5, 0x29d1    # 1.5001E-41f

    .line 235
    sget v0, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v0, :cond_d

    move-object/from16 v1, v20

    :goto_a
    const-string v0, "\u06dc\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x6d

    move-object/from16 v20, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x3b73

    const v22, -0x7b55c10

    xor-int v1, v1, v22

    const v22, 0xa9654bf

    goto/16 :goto_c

    :cond_d
    const-string v0, "\u06da\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x4ddd

    const v22, -0x7dae4732

    xor-int v1, v1, v22

    const v22, -0x5c5a4efc

    goto :goto_c

    :sswitch_14
    move-object/from16 v3, p0

    move-object/from16 v20, v1

    const/16 v21, 0x0

    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v0

    if-gtz v0, :cond_e

    goto :goto_b

    :cond_e
    const-string v0, "\u06df\u06df"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0xa59

    const v22, -0x2ff6b543

    xor-int v1, v1, v22

    const v22, -0xbc1d2af

    goto :goto_c

    :cond_f
    const-string v0, "\u1a74\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x2795

    const v22, -0x15a9dcdd

    xor-int v1, v1, v22

    const v22, -0x6ccf4476

    goto :goto_c

    :sswitch_15
    move-object/from16 v3, p0

    move-object/from16 v20, v1

    sget v0, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v0, :cond_10

    :goto_b
    const-string v0, "\u073a\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x1885

    const v22, -0x551b3ff9

    xor-int v1, v1, v22

    const v22, -0x4ad8133c

    goto :goto_c

    :cond_10
    const-string v0, "\u073f\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x65

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x2437

    const v22, 0x54d8150f

    xor-int v1, v1, v22

    const v22, -0x3308b0cc

    :goto_c
    xor-int v0, v0, v22

    move-object/from16 v23, v20

    move/from16 v20, v0

    move v0, v1

    move-object/from16 v1, v23

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7766d3d8 -> :sswitch_12
        -0x6e7d2021 -> :sswitch_13
        -0x6d9cd15d -> :sswitch_0
        -0x6088df5f -> :sswitch_2
        -0x59c32494 -> :sswitch_9
        -0x4e57df26 -> :sswitch_5
        -0x388e9a22 -> :sswitch_f
        -0x35c0e753 -> :sswitch_11
        -0x34d54f27 -> :sswitch_e
        -0x29baacf3 -> :sswitch_10
        -0x21c7a4e5 -> :sswitch_c
        -0x1cbb7fda -> :sswitch_1
        -0x16727cd6 -> :sswitch_8
        -0xa391fb3 -> :sswitch_12
        -0x97057ed -> :sswitch_14
        -0x61e9ae3 -> :sswitch_10
        -0x18d6549 -> :sswitch_8
        -0xaf707c -> :sswitch_6
        0x53455b9 -> :sswitch_4
        0xa19f2ad -> :sswitch_5
        0xab101c5 -> :sswitch_2
        0x104038d3 -> :sswitch_7
        0x1f684214 -> :sswitch_c
        0x26ea5912 -> :sswitch_f
        0x29ea27af -> :sswitch_14
        0x2a2fab13 -> :sswitch_a
        0x3134a8f6 -> :sswitch_7
        0x3220d956 -> :sswitch_11
        0x3d201e73 -> :sswitch_4
        0x3d90f64a -> :sswitch_e
        0x3f59dfd2 -> :sswitch_3
        0x400dedc1 -> :sswitch_0
        0x46080b48 -> :sswitch_9
        0x515d02cd -> :sswitch_3
        0x56c04226 -> :sswitch_15
        0x57dbfe65 -> :sswitch_1
        0x588e1824 -> :sswitch_b
        0x5de22f99 -> :sswitch_a
        0x61e214d4 -> :sswitch_b
        0x65e98e2f -> :sswitch_6
        0x6fbae6ec -> :sswitch_15
        0x756ff752 -> :sswitch_d
        0x77251a4c -> :sswitch_d
        0x7d122164 -> :sswitch_13
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    sget-object v0, Ll/۬ᩴ᩺;->ۡ۫ܺ:[S

    const/4 v1, 0x7

    aget-short v0, v0, v1

    mul-int v1, v0, v0

    const v2, 0xa5bd901

    add-int/2addr v1, v2

    mul-int/lit16 v0, v0, 0x66fe

    sub-int/2addr v0, v1

    if-lez v0, :cond_0

    const/16 v0, 0x751e

    const/16 v1, 0x751e

    goto :goto_0

    :cond_0
    const/16 v0, 0x7fdc

    const/16 v1, 0x7fdc

    :goto_0
    const/4 v2, 0x1

    const/16 v0, 0x400

    :try_start_0
    new-array v3, v0, [B

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v0, :cond_1

    and-int/lit16 v5, v4, 0xff

    int-to-byte v5, v5

    .line 226
    aput-byte v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 227
    :cond_1
    new-instance v0, Ll/ۜۗ۠;

    invoke-direct {v0}, Ll/ۜۗ۠;-><init>()V

    iget-object v4, p0, Ll/۬ᩴ᩺;->֡:Ll/ۖ᩷᩺;

    sget-object v5, Ll/۬ᩴ᩺;->ۡ۫ܺ:[S

    const/16 v6, 0x8

    const/4 v7, 0x6

    invoke-static {v5, v6, v7, v1}, Ll/֫ܶ;->۟ۢۚ([SIII)Ljava/lang/String;

    move-result-object v5

    .line 228
    invoke-virtual {v4, v5}, Ll/ۖ᩷᩺;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ۜۗ۠;->ܰ(Ljava/lang/String;)V

    sget-object v4, Ll/ۖᩴ᩺;->᩺:Ll/ۢۢ۠;

    .line 229
    invoke-static {v4, v3}, Ll/᩸ۗ۠;->ۙ(Ll/ۢۢ۠;[B)Ll/᩸ۗ۠;

    move-result-object v4

    sget-object v5, Ll/۬ᩴ᩺;->ۡ۫ܺ:[S

    const/16 v6, 0x29

    const/4 v7, 0x4

    invoke-static {v5, v6, v7, v1}, Ll/֫ۘ;->ۜۖܺ([SIII)Ljava/lang/String;

    move-result-object v5

    .line 232
    invoke-virtual {v0, v5, v4}, Ll/ۜۗ۠;->ۙ(Ljava/lang/String;Ll/᩸ۗ۠;)V

    .line 230
    invoke-virtual {v0}, Ll/ۜۗ۠;->ۙ()Ll/᩺ۗ۠;

    move-result-object v0

    .line 231
    invoke-static {}, Ll/֫;->ᩴ᩶۟()J

    .line 232
    invoke-static {}, Ll/ۖᩴ᩺;->۬()Ll/ۚۗ۠;

    move-result-object v4

    invoke-virtual {v4, v0}, Ll/ۚۗ۠;->ۙ(Ll/᩺ۗ۠;)Ll/ۨۢ۠;

    move-result-object v0

    invoke-interface {v0}, Ll/ۨۢ۠;->execute()Ll/ᩴۗ۠;

    move-result-object v0

    iput-object v0, p0, Ll/۬ᩴ᩺;->ܺ:Ll/ᩴۗ۠;

    .line 233
    invoke-static {v0, v3}, Ll/۬ᩴ᩺;->ۙ(Ll/ᩴۗ۠;[B)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 234
    invoke-static {}, Ll/֡ܳ;->᩵۠ۗ()J

    .line 236
    iget-object v0, p0, Ll/۬ᩴ᩺;->֡:Ll/ۖ᩷᩺;

    invoke-static {v0}, Ll/ܰۛᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    sget v0, Ll/᩺ᩴ᩺;->ۙ:I

    .line 237
    iput-boolean v2, p0, Ll/۬ᩴ᩺;->᩶:Z

    goto :goto_2

    .line 239
    :cond_2
    iget-object v0, p0, Ll/۬ᩴ᩺;->֡:Ll/ۖ᩷᩺;

    invoke-static {v0}, Ll/ܰۛᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    sget v0, Ll/᩺ᩴ᩺;->ۙ:I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 244
    iget-object v3, p0, Ll/۬ᩴ᩺;->֡:Ll/ۖ᩷᩺;

    invoke-static {v3}, Ll/ܰۛᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    sget v0, Ll/᩺ᩴ᩺;->ۙ:I

    goto :goto_2

    .line 242
    :catch_0
    iget-object v0, p0, Ll/۬ᩴ᩺;->֡:Ll/ۖ᩷᩺;

    invoke-static {v0}, Ll/ܰۛᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    sget v0, Ll/᩺ᩴ᩺;->ۙ:I

    .line 246
    :goto_2
    move-object v3, p0

    check-cast v3, Ll/ۘᩴ᩺;

    .line 99
    iget-object v0, v3, Ll/ۘᩴ᩺;->ۛ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 101
    iget-boolean v0, v3, Ll/۬ᩴ᩺;->᩶:Z

    if-nez v0, :cond_3

    .line 103
    iget-object v0, v3, Ll/ۘᩴ᩺;->۫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v0}, Ll/֫ܺ;->ܿᩳ᩶(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v3, Ll/۬ᩴ᩺;->ܺ:Ll/ᩴۗ۠;

    if-eqz v0, :cond_6

    .line 104
    invoke-static {v0}, Ll/ۖ᩷᩺;->ۙ(Ll/ᩴۗ۠;)V

    goto/16 :goto_4

    .line 108
    :cond_3
    iget-object v0, v3, Ll/ۘᩴ᩺;->۫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v4

    .line 109
    invoke-static {}, Ll/᩺ᩴ᩺;->ܰ()I

    move-result v0

    if-lt v4, v0, :cond_4

    goto/16 :goto_4

    :cond_4
    if-nez v4, :cond_5

    .line 112
    iget-object v0, v3, Ll/۬ᩴ᩺;->ܺ:Ll/ᩴۗ۠;

    invoke-static {v0}, Ll/ۖ᩷᩺;->ۙ(Ll/ᩴۗ۠;)V

    .line 113
    iget-object v0, v3, Ll/ۘᩴ᩺;->ܽ:Ll/ۜᩴ᩺;

    invoke-static {v0}, Ll/ۜᩴ᩺;->ۙ(Ll/ۜᩴ᩺;)Ljava/util/LinkedList;

    move-result-object v0

    monitor-enter v0

    .line 114
    :try_start_1
    iget-object v5, v3, Ll/ۘᩴ᩺;->ܽ:Ll/ۜᩴ᩺;

    invoke-static {v5}, Ll/ۜᩴ᩺;->ۙ(Ll/ۜᩴ᩺;)Ljava/util/LinkedList;

    move-result-object v5

    iget-object v6, v3, Ll/۬ᩴ᩺;->֡:Ll/ۖ᩷᩺;

    invoke-virtual {v5, v6}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 115
    monitor-exit v0

    goto :goto_3

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v1

    .line 118
    :cond_5
    :goto_3
    iget-object v0, v3, Ll/ۘᩴ᩺;->ܿ:[Ll/ۖ᩷᩺;

    iget-object v5, v3, Ll/۬ᩴ᩺;->֡:Ll/ۖ᩷᩺;

    aput-object v5, v0, v4

    .line 119
    invoke-static {}, Ll/᩺ᩴ᩺;->ܰ()I

    move-result v0

    sub-int/2addr v0, v2

    if-ne v4, v0, :cond_6

    .line 120
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 121
    iget-object v2, v3, Ll/ۘᩴ᩺;->ܿ:[Ll/ۖ᩷᩺;

    invoke-static {v0, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 122
    invoke-static {}, Ll/᩺ᩴ᩺;->ۙ()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    sget-object v4, Ll/۬ᩴ᩺;->ۡ۫ܺ:[S

    const/16 v5, 0xe

    const/16 v6, 0x9

    invoke-static {v4, v5, v6, v1}, Ll/ۘۛ;->᩷ۧ᩹([SIII)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/۬ᩴ᩺;->ۡ۫ܺ:[S

    const/16 v6, 0x17

    const/4 v7, 0x1

    invoke-static {v5, v6, v7, v1}, Ll/ۖۧ;->᩶ܽܽ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Ll/ۜܶ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    sget-object v4, Ll/۬ᩴ᩺;->ۡ۫ܺ:[S

    const/16 v5, 0x18

    const/16 v6, 0x11

    invoke-static {v4, v5, v6, v1}, Ll/ۖᩴ;->֨᩶᩵([SIII)Ljava/lang/String;

    move-result-object v1

    .line 123
    invoke-static {}, Ll/֡ܳ;->᩵۠ۗ()J

    move-result-wide v4

    const-wide/32 v6, 0x240c8400

    add-long/2addr v4, v6

    invoke-interface {v2, v1, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 124
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 125
    iget-object v1, v3, Ll/ۘᩴ᩺;->ܽ:Ll/ۜᩴ᩺;

    invoke-static {v1, v0}, Ll/ۜᩴ᩺;->ۙ(Ll/ۜᩴ᩺;Ljava/util/LinkedList;)V

    .line 126
    iget-object v0, v3, Ll/ۘᩴ᩺;->ܿ:[Ll/ۖ᩷᩺;

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    :cond_6
    :goto_4
    return-void
.end method

.class public abstract Ll/ۙ֨᩻;
.super Ljava/lang/Object;
.source "D20P"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۜۖ۟:[S


# instance fields
.field public ܰ:Ll/ۡܳۨ;

.field public ܿ:Ll/۬۬᩻;

.field public ᩶:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2d

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۙ֨᩻;->ۜۖ۟:[S

    return-void

    :array_0
    .array-data 2
        0x1065s
        -0x5d20s
        -0x5d6bs
        -0x5d0bs
        -0x5d14s
        -0x5d09s
        -0x5d0ds
        0x260s
        0x2fb2s
        0x2fe9s
        0x2ff8s
        0x2fees
        0x2fe9s
        0x2fafs
        0x2ffbs
        0x2ffcs
        0x2fees
        0x2fe9s
        0x2fc2s
        0x2fe8s
        0x2fefs
        0x2ff1s
        0x2fees
        0x2fe1s
        0x2ffbs
        0x2ffcs
        0x2fees
        0x2fe9s
        0x2fc2s
        0x2fe8s
        0x2fefs
        0x2ff1s
        0x2fees
        0x2fc2s
        0x2ff8s
        0x2fe5s
        0x2feds
        0x2ff4s
        0x2fefs
        0x2ff8s
        0x2ff9s
        0x2fcds
        0x2fd2s
        0x2fces
        0x2fc9s
    .end array-data
.end method

.method public static ۙ(Ll/ۡܳۨ;[B)Z
    .locals 23

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

    const v15, -0x7182f40

    sget v16, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v17, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v18, "\u06d8\u06dc"

    invoke-static/range {v18 .. v18}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v17

    mul-int/lit8 v18, v18, 0x13

    xor-int v0, v18, v16

    mul-int/lit16 v0, v0, 0x7555

    const v20, -0x6a62e517

    xor-int v0, v0, v20

    const v20, -0x35145744    # -7722078.0f

    xor-int v18, v18, v20

    move-object/from16 v20, v1

    move-object v10, v9

    move-object v13, v12

    move/from16 v19, v18

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, -0x7182f40

    :goto_0
    xor-int v2, v18, v16

    mul-int/lit16 v2, v2, -0x4b53

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v0, v2

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    move-object/from16 v2, p0

    move-object/from16 v19, v1

    const v0, 0xe0b8

    const v9, 0xe0b8

    goto/16 :goto_6

    :sswitch_0
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    sget v0, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v0, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v2, p0

    move-object/from16 v19, v1

    goto/16 :goto_7

    :cond_1
    move-object/from16 v2, p0

    move-object/from16 v19, v1

    goto/16 :goto_b

    .line 101
    :sswitch_1
    sget v0, Ll/֡ۖ;->۫ۙ᩶:I

    if-lez v0, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    goto/16 :goto_8

    .line 175
    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v0, :cond_0

    :goto_2
    move-object/from16 v2, p0

    move-object/from16 v19, v1

    goto/16 :goto_a

    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

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
    invoke-virtual/range {p0 .. p0}, Ll/ۡܳۨ;->ۙ()Ll/۠ܳۨ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ܳۨ;->᩷()[B

    move-result-object v0

    move-object/from16 v2, p1

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_3

    :goto_3
    move-object/from16 v2, p0

    goto/16 :goto_5

    :cond_3
    const-string v0, "\u1a76\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, -0x6bc1

    const v19, -0x64718247

    xor-int v2, v2, v19

    const v19, -0x2b8eebbe

    goto :goto_4

    .line 256
    :sswitch_8
    invoke-static {v13, v14, v15, v9}, Ll/֡ᩴ;->ۚ᩹ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ۖۙ;->ᩴ۫ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    const-string v0, "\u06eb\u06df"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x57

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, -0x340b

    const v19, -0x1b39c7b7

    xor-int v2, v2, v19

    const v19, 0xc751973

    goto :goto_4

    :sswitch_9
    sget-object v13, Ll/ۙ֨᩻;->ۜۖ۟:[S

    const/4 v14, 0x5

    const/4 v15, 0x2

    .line 49
    sget v0, Ll/ۖ;->ܿۚ֡:I

    if-ltz v0, :cond_5

    goto/16 :goto_1

    :cond_5
    const-string v0, "\u06e4\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, -0x6035

    const v19, -0x60e2cb81

    xor-int v2, v2, v19

    const v19, 0x589e79d6

    :goto_4
    xor-int v19, v0, v19

    move v0, v2

    goto/16 :goto_0

    .line 254
    :sswitch_a
    invoke-static {v10, v11, v12, v9}, Ll/۬;->ۜᩴ֡([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p0

    .line 256
    invoke-virtual {v2, v0}, Ll/ۡܳۨ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u05ab\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    move-object/from16 v19, v1

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x1bff

    const v21, 0x4f85c52

    xor-int v1, v1, v21

    const v21, -0xfe1bb

    goto/16 :goto_c

    :sswitch_b
    move-object/from16 v2, p0

    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v0, :cond_7

    move-object/from16 v19, v1

    const/4 v12, 0x4

    goto/16 :goto_a

    :cond_7
    const-string v0, "\u06d6\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v12, v0, v17

    mul-int/lit16 v12, v12, 0x1719

    const v21, -0x484bbc70

    xor-int v12, v12, v21

    const v21, 0x3322bdde

    xor-int v0, v0, v21

    move/from16 v19, v0

    move v0, v12

    const/4 v12, 0x4

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v2, p0

    .line 254
    sget-object v10, Ll/ۙ֨᩻;->ۜۖ۟:[S

    .line 212
    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_8

    move-object/from16 v19, v1

    const/4 v11, 0x1

    goto/16 :goto_b

    :cond_8
    const-string v0, "\u06da\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v11, v0, v16

    mul-int/lit16 v11, v11, 0xddf

    const v21, 0x7c9dd28c

    xor-int v11, v11, v21

    const v21, 0x732238d9

    xor-int v0, v0, v21

    move/from16 v19, v0

    move v0, v11

    const/4 v11, 0x1

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v2, p0

    .line 254
    invoke-virtual/range {p0 .. p0}, Ll/ۡܳۨ;->ۚ()Z

    move-result v0

    if-nez v0, :cond_9

    :goto_5
    const-string v0, "\u06d9\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    move-object/from16 v19, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x412f

    const v21, 0x188f372

    xor-int v1, v1, v21

    const v21, -0x3aedbfb4

    goto/16 :goto_c

    :cond_9
    move-object/from16 v19, v1

    const-string v0, "\u06d9\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x3d

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x2431

    const v21, 0x65033862

    xor-int v1, v1, v21

    const v21, -0x1431a3a1

    goto/16 :goto_c

    :sswitch_e
    move-object/from16 v2, p0

    move-object/from16 v19, v1

    const v0, 0xa2b8

    const v9, 0xa2b8

    :goto_6
    const-string v0, "\u06db\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x717

    const v21, -0x2715434

    xor-int v1, v1, v21

    const v21, 0x1fb0ece5

    goto/16 :goto_c

    :sswitch_f
    move-object/from16 v2, p0

    move-object/from16 v19, v1

    add-int v0, v7, v8

    sub-int v0, v6, v0

    if-gtz v0, :cond_a

    const-string v0, "\u073f\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x1871

    const v21, -0x38acb750

    xor-int v1, v1, v21

    const v21, 0x2dd2d41a

    goto/16 :goto_c

    :cond_a
    const-string v0, "\u1a73\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x5d

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x51d9

    const v21, -0x4e5fc2e6

    xor-int v1, v1, v21

    const v21, -0x31545824

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v2, p0

    move-object/from16 v19, v1

    const v8, 0xb5a4e11

    .line 217
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v0

    if-nez v0, :cond_b

    :goto_7
    const-string v0, "\u0730\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x79

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x679

    const v21, 0x6c76cc2c

    xor-int v1, v1, v21

    const v21, -0x23c7c088

    goto/16 :goto_c

    :cond_b
    const-string v0, "\u0730\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x5283

    const v21, -0x40ebc1b1

    xor-int v1, v1, v21

    const v21, 0x5d5ec691

    goto/16 :goto_c

    :sswitch_11
    move-object/from16 v2, p0

    move-object/from16 v19, v1

    mul-int v6, v4, v5

    mul-int v7, v4, v4

    .line 95
    sget v0, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v0, :cond_c

    move-object/from16 v1, v19

    :goto_8
    const-string v0, "\u073f\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    move-object/from16 v19, v1

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x4e85

    const v21, 0x28ca1e2d

    xor-int v1, v1, v21

    const v21, -0x6d6079ba

    goto/16 :goto_c

    :cond_c
    const-string v0, "\u1a77\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x6d03

    const v21, 0x47e36993

    xor-int v1, v1, v21

    const v21, -0x337f597e    # -6.744987E7f

    goto/16 :goto_c

    :sswitch_12
    move-object/from16 v2, p0

    move-object/from16 v19, v1

    aget-short v4, v20, v3

    const/16 v5, 0x6bd2

    sget v0, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v0, :cond_d

    goto :goto_9

    :cond_d
    const-string v0, "\u06d7\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x74eb

    const v21, 0x70d7594

    xor-int v1, v1, v21

    const v21, -0x6a7fd725

    goto/16 :goto_c

    :sswitch_13
    move-object/from16 v2, p0

    move-object/from16 v19, v1

    const/4 v3, 0x0

    sget-boolean v0, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v0, :cond_e

    :goto_9
    const-string v0, "\u06eb\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0xf

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x1c3b

    const v21, -0x1af7cf26

    xor-int v1, v1, v21

    const v21, -0x174c8fdd

    goto/16 :goto_c

    :cond_e
    const-string v0, "\u06eb\u06d9"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x7045

    const v21, 0x4c45fa96    # 5.189897E7f

    xor-int v1, v1, v21

    const v21, -0x3a99e98

    goto :goto_c

    :sswitch_14
    move-object/from16 v2, p0

    move-object/from16 v19, v1

    sget-object v20, Ll/ۙ֨᩻;->ۜۖ۟:[S

    .line 226
    sget v0, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v0, :cond_f

    :goto_a
    const-string v0, "\u06e1\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x57

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x48b3

    const v21, 0x182c245c

    xor-int v1, v1, v21

    const v21, -0x1bfed152

    goto :goto_c

    :cond_f
    const-string v0, "\u06db\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x1f7f

    const v21, 0x47f6dc0

    xor-int v1, v1, v21

    const v21, -0x39ab50

    goto :goto_c

    :sswitch_15
    move-object/from16 v2, p0

    move-object/from16 v19, v1

    .line 162
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v0

    if-gtz v0, :cond_10

    :goto_b
    const-string v0, "\u073a\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x29

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x7537

    const v21, -0x6d5e39b9

    xor-int v1, v1, v21

    const v21, -0xfb80fc

    goto :goto_c

    :cond_10
    const-string v0, "\u073d\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x75

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x32b9

    const v21, -0x29a1db82

    xor-int v1, v1, v21

    const v21, 0x11d0a549

    :goto_c
    xor-int v0, v0, v21

    move-object/from16 v22, v19

    move/from16 v19, v0

    move v0, v1

    move-object/from16 v1, v22

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f8fce74 -> :sswitch_b
        -0x7ecfb44f -> :sswitch_3
        -0x7a6a916e -> :sswitch_a
        -0x781abc68 -> :sswitch_14
        -0x73afb701 -> :sswitch_14
        -0x72915324 -> :sswitch_9
        -0x71373b71 -> :sswitch_12
        -0x690aac3a -> :sswitch_2
        -0x649aedd7 -> :sswitch_e
        -0x62bef299 -> :sswitch_c
        -0x5913a83e -> :sswitch_5
        -0x53bbcd80 -> :sswitch_d
        -0x4e1b40c2 -> :sswitch_9
        -0x476d2cd6 -> :sswitch_8
        -0x41e26f35 -> :sswitch_10
        -0x40125a47 -> :sswitch_4
        -0x39b60a2c -> :sswitch_15
        -0x369c923c -> :sswitch_c
        -0x2b5d8ea1 -> :sswitch_a
        -0x2878bdb2 -> :sswitch_11
        -0x1ffefa07 -> :sswitch_2
        -0x15f2b6f5 -> :sswitch_6
        -0x1416e248 -> :sswitch_f
        -0x11d66778 -> :sswitch_8
        -0x117ebf27 -> :sswitch_13
        -0x36e4440 -> :sswitch_4
        -0x608e78 -> :sswitch_7
        0x1bc9b38 -> :sswitch_b
        0x9dbbe6a -> :sswitch_1
        0x108f613d -> :sswitch_3
        0x14d7ee3b -> :sswitch_7
        0x1caf7677 -> :sswitch_f
        0x2337fb76 -> :sswitch_11
        0x2382349f -> :sswitch_e
        0x2f628e63 -> :sswitch_12
        0x355704b8 -> :sswitch_10
        0x49718767 -> :sswitch_13
        0x4b2d8d6b -> :sswitch_15
        0x5bc7d76d -> :sswitch_1
        0x5c1cdf97 -> :sswitch_0
        0x6467f5ec -> :sswitch_5
        0x67e8af1c -> :sswitch_0
        0x6d2e4e7c -> :sswitch_d
        0x73a593df -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    sget-object v0, Ll/ۙ֨᩻;->ۜۖ۟:[S

    const/4 v1, 0x7

    aget-short v0, v0, v1

    add-int/lit16 v1, v0, 0x42c1

    mul-int v1, v1, v1

    mul-int v0, v0, v0

    const v2, 0x11681581

    add-int/2addr v0, v2

    add-int/2addr v0, v0

    sub-int/2addr v0, v1

    if-gez v0, :cond_0

    const/16 v0, 0x5ec8

    const/16 v1, 0x5ec8

    goto :goto_0

    :cond_0
    const/16 v0, 0x2f9d

    const/16 v1, 0x2f9d

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
    new-instance v0, Ll/֡ܳۨ;

    invoke-direct {v0}, Ll/֡ܳۨ;-><init>()V

    iget-object v4, p0, Ll/ۙ֨᩻;->ܿ:Ll/۬۬᩻;

    sget-object v5, Ll/ۙ֨᩻;->ۜۖ۟:[S

    const/16 v6, 0x8

    const/4 v7, 0x6

    invoke-static {v5, v6, v7, v1}, Ll/ۗܶ;->ۧۢ᩶([SIII)Ljava/lang/String;

    move-result-object v5

    .line 228
    invoke-virtual {v4, v5}, Ll/۬۬᩻;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/֡ܳۨ;->᩷(Ljava/lang/String;)V

    sget-object v4, Ll/ۖۢ᩻;->᩻:Ll/ܶܳۨ;

    .line 229
    invoke-static {v4, v3}, Ll/ۢܳۨ;->ۙ(Ll/ܶܳۨ;[B)Ll/ۢܳۨ;

    move-result-object v4

    sget-object v5, Ll/ۙ֨᩻;->ۜۖ۟:[S

    const/16 v6, 0x29

    const/4 v7, 0x4

    invoke-static {v5, v6, v7, v1}, Ll/ۖۗ;->ܳܰ᩺([SIII)Ljava/lang/String;

    move-result-object v5

    .line 232
    invoke-virtual {v0, v5, v4}, Ll/֡ܳۨ;->ۙ(Ljava/lang/String;Ll/ۢܳۨ;)V

    .line 230
    invoke-virtual {v0}, Ll/֡ܳۨ;->ۙ()Ll/۟ܳۨ;

    move-result-object v0

    .line 231
    invoke-static {}, Ll/ۗܰ;->ܳܰۚ()J

    .line 232
    invoke-static {}, Ll/ۖۢ᩻;->ۚ()Ll/᩺ܳۨ;

    move-result-object v4

    invoke-virtual {v4, v0}, Ll/᩺ܳۨ;->ۙ(Ll/۟ܳۨ;)Ll/ۛᩴۨ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۛᩴۨ;->execute()Ll/ۡܳۨ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙ֨᩻;->ܰ:Ll/ۡܳۨ;

    .line 233
    invoke-static {v0, v3}, Ll/ۙ֨᩻;->ۙ(Ll/ۡܳۨ;[B)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 234
    invoke-static {}, Ll/ۖᩳ;->ܶܰ۫()J

    .line 236
    iget-object v0, p0, Ll/ۙ֨᩻;->ܿ:Ll/۬۬᩻;

    invoke-static {v0}, Ll/ܽۚۗ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    sget v0, Ll/᩸֨᩻;->ۙ:I

    .line 237
    iput-boolean v2, p0, Ll/ۙ֨᩻;->᩶:Z

    goto :goto_2

    .line 239
    :cond_2
    iget-object v0, p0, Ll/ۙ֨᩻;->ܿ:Ll/۬۬᩻;

    invoke-static {v0}, Ll/ܽۚۗ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    sget v0, Ll/᩸֨᩻;->ۙ:I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 244
    iget-object v3, p0, Ll/ۙ֨᩻;->ܿ:Ll/۬۬᩻;

    invoke-static {v3}, Ll/ܽۚۗ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    sget v0, Ll/᩸֨᩻;->ۙ:I

    goto :goto_2

    .line 242
    :catch_0
    iget-object v0, p0, Ll/ۙ֨᩻;->ܿ:Ll/۬۬᩻;

    invoke-static {v0}, Ll/ܽۚۗ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    sget v0, Ll/᩸֨᩻;->ۙ:I

    .line 246
    :goto_2
    move-object v3, p0

    check-cast v3, Ll/᩷֨᩻;

    .line 99
    iget-object v0, v3, Ll/᩷֨᩻;->ۢ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 101
    iget-boolean v0, v3, Ll/ۙ֨᩻;->᩶:Z

    if-nez v0, :cond_3

    .line 103
    iget-object v0, v3, Ll/᩷֨᩻;->۟:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v0}, Ll/֡ۢ;->֫ۡᩳ(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v3, Ll/ۙ֨᩻;->ܰ:Ll/ۡܳۨ;

    if-eqz v0, :cond_6

    .line 104
    invoke-static {v0}, Ll/۬۬᩻;->ۙ(Ll/ۡܳۨ;)J

    goto/16 :goto_4

    .line 108
    :cond_3
    iget-object v0, v3, Ll/᩷֨᩻;->۟:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v4

    .line 109
    invoke-static {}, Ll/᩸֨᩻;->᩷()I

    move-result v0

    if-lt v4, v0, :cond_4

    goto/16 :goto_4

    :cond_4
    if-nez v4, :cond_5

    .line 112
    iget-object v0, v3, Ll/ۙ֨᩻;->ܰ:Ll/ۡܳۨ;

    invoke-static {v0}, Ll/۬۬᩻;->ۙ(Ll/ۡܳۨ;)J

    .line 113
    iget-object v0, v3, Ll/᩷֨᩻;->֡:Ll/ۤ֨᩻;

    invoke-static {v0}, Ll/ۤ֨᩻;->ۙ(Ll/ۤ֨᩻;)Ljava/util/LinkedList;

    move-result-object v0

    monitor-enter v0

    .line 114
    :try_start_1
    iget-object v5, v3, Ll/᩷֨᩻;->֡:Ll/ۤ֨᩻;

    invoke-static {v5}, Ll/ۤ֨᩻;->ۙ(Ll/ۤ֨᩻;)Ljava/util/LinkedList;

    move-result-object v5

    iget-object v6, v3, Ll/ۙ֨᩻;->ܿ:Ll/۬۬᩻;

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
    iget-object v0, v3, Ll/᩷֨᩻;->ᩳ:[Ll/۬۬᩻;

    iget-object v5, v3, Ll/ۙ֨᩻;->ܿ:Ll/۬۬᩻;

    aput-object v5, v0, v4

    .line 119
    invoke-static {}, Ll/᩸֨᩻;->᩷()I

    move-result v0

    sub-int/2addr v0, v2

    if-ne v4, v0, :cond_6

    .line 120
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 121
    iget-object v2, v3, Ll/᩷֨᩻;->ᩳ:[Ll/۬۬᩻;

    invoke-static {v0, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 122
    invoke-static {}, Ll/᩸֨᩻;->ۙ()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    sget-object v4, Ll/ۙ֨᩻;->ۜۖ۟:[S

    const/16 v5, 0xe

    const/16 v6, 0x9

    invoke-static {v4, v5, v6, v1}, Ll/ۗܶ;->ۧۢ᩶([SIII)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/ۙ֨᩻;->ۜۖ۟:[S

    const/16 v6, 0x17

    const/4 v7, 0x1

    invoke-static {v5, v6, v7, v1}, Ll/֡᩵;->ܽۛܰ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Ll/᩺ۨۨ;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    sget-object v4, Ll/ۙ֨᩻;->ۜۖ۟:[S

    const/16 v5, 0x18

    const/16 v6, 0x11

    invoke-static {v4, v5, v6, v1}, Ll/֡۟;->ᩳۧܳ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 123
    invoke-static {}, Ll/ۗܰ;->ܳܰۚ()J

    move-result-wide v4

    const-wide/32 v6, 0x240c8400

    add-long/2addr v4, v6

    invoke-interface {v2, v1, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 124
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 125
    iget-object v1, v3, Ll/᩷֨᩻;->֡:Ll/ۤ֨᩻;

    invoke-static {v1, v0}, Ll/ۤ֨᩻;->ۙ(Ll/ۤ֨᩻;Ljava/util/LinkedList;)V

    .line 126
    iget-object v0, v3, Ll/᩷֨᩻;->ᩳ:[Ll/۬۬᩻;

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    :cond_6
    :goto_4
    return-void
.end method

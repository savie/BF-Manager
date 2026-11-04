.class public final Ll/ۗ֨᩻;
.super Ljava/lang/Object;
.source "T5M8"


# static fields
.field public static final ۙ:Ll/ܽ᩻ۙ;

.field public static ۤ:Ljava/lang/Runnable;

.field private static final ᩳ᩻֫:[S

.field public static final ᩷:Ljava/lang/String;

.field public static volatile ᩸:J


# direct methods
.method public static constructor <clinit>()V
    .locals 22

    const/16 v0, 0x51

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۗ֨᩻;->ᩳ᩻֫:[S

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

    const v14, -0x3eb3dbb6

    sget v15, Ll/ۘܽ;->᩹ۧۚ:I

    sget v16, Ll/֫۠;->ۢᩴ᩺:I

    const-string v17, "\u06e4\u1a77"

    invoke-static/range {v17 .. v17}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    xor-int v0, v17, v15

    mul-int/lit16 v0, v0, 0x29e3

    const v19, 0x10851c76

    xor-int v0, v0, v19

    const v19, -0x8181fa3

    xor-int v17, v17, v19

    const/16 v19, 0x0

    move-object v3, v2

    move-object v12, v11

    move/from16 v18, v17

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, -0x3eb3dbb6

    const/16 v20, 0x0

    move-object v2, v1

    :goto_0
    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, -0xbad

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v0, v1

    xor-int v17, v18, v0

    sparse-switch v17, :sswitch_data_0

    move-object/from16 v18, v20

    const/16 v0, 0x77ef

    goto/16 :goto_9

    .line 169
    :sswitch_0
    sget-object v0, Ll/ۗ֨᩻;->ᩳ᩻֫:[S

    const/16 v1, 0x1e

    const/16 v2, 0x12

    invoke-static {v0, v1, v2, v11}, Ll/֡᩻;->ܺܽ۠([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :sswitch_1
    const v0, 0x81f8

    move-object/from16 v18, v20

    goto/16 :goto_9

    .line 101
    :sswitch_2
    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-gez v0, :cond_7

    goto/16 :goto_3

    :sswitch_3
    add-int v0, v10, v10

    sub-int v0, v7, v0

    if-lez v0, :cond_0

    const-string v0, "\u05a1\u06e8"

    .line 40
    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x3f

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x4d0f

    const v18, 0x5a2871a2

    xor-int v1, v1, v18

    const v18, 0x331f2b2a

    goto/16 :goto_a

    :cond_0
    const-string v0, "\u1a79\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x4d

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x34c5

    const v18, 0x443aa4cb

    xor-int v1, v1, v18

    const v18, 0x7b3861e0

    goto/16 :goto_a

    :sswitch_4
    add-int v0, v5, v6

    mul-int v7, v0, v0

    .line 139
    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v0, "\u06e7\u0733"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x61

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x7cf

    const v18, 0x5425ed50

    xor-int v1, v1, v18

    const v18, 0x25e14e68

    goto/16 :goto_a

    .line 169
    :sswitch_5
    sget-object v0, Ll/ۗ֨᩻;->ᩳ᩻֫:[S

    const/16 v1, 0xc

    const/16 v2, 0x12

    invoke-static {v0, v1, v2, v11}, Ll/ۖۗ;->ܳܰ᩺([SIII)Ljava/lang/String;

    move-result-object v0

    :goto_1
    const-string v1, "\u06da\u1a74"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v2, v1, v16

    mul-int/lit16 v2, v2, -0xb7d

    const v18, 0x255b0a87

    xor-int v2, v2, v18

    const v18, 0x7bff5726

    move/from16 v21, v2

    move-object v2, v0

    :goto_2
    move v0, v1

    move/from16 v1, v21

    goto/16 :goto_a

    .line 139
    :sswitch_6
    aget-short v5, v3, v4

    sget v0, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v0, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v0, "\u073d\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x2b73

    const v18, -0x3a82b48e

    xor-int v1, v1, v18

    const v18, 0x38af07fb

    goto/16 :goto_a

    .line 28
    :sswitch_7
    sput-object v2, Ll/ۗ֨᩻;->᩷:Ljava/lang/String;

    return-void

    .line 101
    :sswitch_8
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    goto/16 :goto_3

    .line 18
    :sswitch_9
    sput-object v19, Ll/ۗ֨᩻;->ۙ:Ll/ܽ᩻ۙ;

    .line 56
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v0, "\u06e4\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x73

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x5c57

    const v18, -0x1eca23bf

    xor-int v1, v1, v18

    const v18, 0x614a331e

    goto/16 :goto_a

    .line 101
    :sswitch_a
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_b
    add-int v10, v8, v9

    .line 40
    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v0, :cond_5

    :cond_4
    move-object/from16 v1, v20

    goto/16 :goto_7

    :cond_5
    const-string v0, "\u073a\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x6d

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x63f9

    const v18, 0x58ecb092

    xor-int v1, v1, v18

    const v18, -0x7c49eb49

    goto/16 :goto_a

    :sswitch_c
    const/4 v13, 0x1

    const/16 v14, 0xb

    .line 169
    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u06d6\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x4d31

    const v18, 0x4a7a7aa6    # 4103849.5f

    xor-int v1, v1, v18

    const v18, 0x790c9b23

    goto/16 :goto_a

    .line 0
    :sswitch_d
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v0, :cond_4

    :goto_3
    const-string v0, "\u06eb\u06db"

    .line 101
    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x49

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x5e93

    const v18, -0x11a53989

    xor-int v1, v1, v18

    const v18, 0x28a4e9c4

    goto/16 :goto_a

    :sswitch_e
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    sget v0, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v0, :cond_8

    :cond_7
    :goto_4
    move-object/from16 v18, v20

    goto/16 :goto_8

    :sswitch_f
    const/16 v6, 0x27a9

    .line 139
    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_9

    :cond_8
    :goto_5
    const-string v0, "\u1a76\u06d6"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x55

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x7b4d

    const v18, 0x16015af9

    xor-int v1, v1, v18

    const v18, -0x52a05c19

    goto/16 :goto_a

    :cond_9
    const-string v0, "\u1a73\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x5d

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x2b23

    const v18, -0x13ca9c73

    xor-int v1, v1, v18

    const v18, -0x28dc2fbd

    goto/16 :goto_a

    :sswitch_10
    mul-int v8, v5, v5

    const v9, 0x624ed91

    .line 40
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_6

    :cond_a
    const-string v0, "\u05a8\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x47

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x2feb

    const v18, 0x5bfaf026

    xor-int v1, v1, v18

    const v18, 0x304a0ed5

    goto/16 :goto_a

    .line 139
    :sswitch_11
    sget-object v3, Ll/ۗ֨᩻;->ᩳ᩻֫:[S

    const/4 v4, 0x0

    sget-boolean v0, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v0, :cond_b

    :goto_6
    const-string v0, "\u06db\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x51

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x72b9

    const v18, 0x59e888f

    xor-int v1, v1, v18

    const v18, -0x565ba835

    goto/16 :goto_a

    :cond_b
    const-string v0, "\u06d9\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x31

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x2ba7

    const v18, -0x4b75c55c

    xor-int v1, v1, v18

    const v18, 0x35f03ca6

    goto/16 :goto_a

    .line 28
    :sswitch_12
    invoke-static {}, Ll/᩶᩷ۧ;->᩹()Ljava/lang/String;

    move-result-object v1

    sget-object v12, Ll/ۗ֨᩻;->ᩳ᩻֫:[S

    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_c

    :goto_7
    const-string v0, "\u0730\u073d"

    .line 40
    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x51

    move-object/from16 v18, v1

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x250b

    const v20, -0x4dd7e8ae

    xor-int v1, v1, v20

    const v20, 0x4a53d61e    # 3470727.5f

    move-object/from16 v20, v18

    const v18, 0x4a53d61e    # 3470727.5f

    goto/16 :goto_a

    :cond_c
    const-string v0, "\u06db\u06eb"

    .line 28
    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x21

    move-object/from16 v18, v1

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x79db

    const v20, 0x9777885

    xor-int v1, v1, v20

    const v20, 0x602ba5e9

    move-object/from16 v20, v18

    const v18, 0x602ba5e9

    goto/16 :goto_a

    :sswitch_13
    invoke-static {v12, v13, v14, v11}, Ll/ۘܶ;->ۙᩳۜ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v20

    .line 169
    invoke-static {v1, v0}, Ll/ۗܶ;->᩵֡ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "\u06da\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    move-object/from16 v18, v1

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x10fb

    const v20, -0x50c60d19

    xor-int v1, v1, v20

    const v20, 0x12574d6c

    move-object/from16 v20, v18

    const v18, 0x12574d6c

    goto/16 :goto_a

    :cond_d
    move-object/from16 v18, v1

    const-string v0, "\u1a7a\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x19a1

    const v20, 0x6ee11040

    xor-int v1, v1, v20

    const v20, 0x4c830703    # 6.869609E7f

    move-object/from16 v20, v18

    const v18, 0x4c830703    # 6.869609E7f

    goto :goto_a

    :sswitch_14
    move-object/from16 v18, v20

    .line 18
    new-instance v19, Ll/ܽ᩻ۙ;

    .line 40
    invoke-direct/range {v19 .. v19}, Ll/ܺ᩻ۙ;-><init>()V

    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_e

    :goto_8
    const-string v0, "\u1a7b\u06e1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x2b

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x3b63

    const v20, -0x1818880e

    xor-int v1, v1, v20

    const v20, 0x2af41b8a

    move-object/from16 v20, v18

    const v18, 0x2af41b8a

    goto :goto_a

    :cond_e
    const-string v0, "\u06e0\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x47

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x5e89

    const v20, -0x2e397772

    xor-int v1, v1, v20

    const v20, 0x7c678d8d

    move-object/from16 v20, v18

    const v18, 0x7c678d8d

    goto :goto_a

    :goto_9
    const-string v1, "\u06e0\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v11, v1, v15

    mul-int/lit16 v11, v11, 0x2373

    const v20, -0x19a48ef6

    xor-int v11, v11, v20

    const v20, 0x57866d2a

    move-object/from16 v20, v18

    const v18, 0x57866d2a

    move/from16 v21, v11

    move v11, v0

    goto/16 :goto_2

    :goto_a
    xor-int v18, v0, v18

    move v0, v1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x5edf97bf -> :sswitch_14
        -0x4edad2bd -> :sswitch_13
        -0x4e77fed4 -> :sswitch_12
        -0x422c8648 -> :sswitch_11
        -0x3ba928df -> :sswitch_10
        -0x35b45c35 -> :sswitch_f
        -0x301f6aa7 -> :sswitch_e
        -0x2cba8b7b -> :sswitch_d
        -0x26e3b134 -> :sswitch_c
        -0x24c82700 -> :sswitch_10
        -0x1dfa338f -> :sswitch_e
        -0x19d68448 -> :sswitch_b
        -0x186ce44c -> :sswitch_a
        -0x17ea6ce2 -> :sswitch_11
        -0x11d35383 -> :sswitch_9
        -0x11187fc9 -> :sswitch_d
        -0xc0254fb -> :sswitch_8
        -0x547eabb -> :sswitch_7
        -0x17f292 -> :sswitch_a
        0x1c20649 -> :sswitch_6
        0x6b45568 -> :sswitch_5
        0xad8a707 -> :sswitch_6
        0x1089db3f -> :sswitch_4
        0x1b057ddd -> :sswitch_3
        0x1c0c5f77 -> :sswitch_f
        0x1db2eb49 -> :sswitch_14
        0x211527a4 -> :sswitch_4
        0x2613203c -> :sswitch_8
        0x264b381a -> :sswitch_2
        0x27a333a5 -> :sswitch_1
        0x29ab8c5c -> :sswitch_0
        0x2cba73c8 -> :sswitch_3
        0x3455f398 -> :sswitch_12
        0x3fe43cd7 -> :sswitch_b
        0x55c08c3a -> :sswitch_9
        0x5863ff0c -> :sswitch_0
        0x5cbd93c8 -> :sswitch_c
        0x5dafca54 -> :sswitch_13
        0x5f5c06e9 -> :sswitch_7
        0x71a6441b -> :sswitch_1
        0x7beb8c40 -> :sswitch_2
        0x7e8fef16 -> :sswitch_5
    .end sparse-switch

    :array_0
    .array-data 2
        0x1857s
        0x778ds
        0x7786s
        0x7781s
        0x77c1s
        0x7782s
        0x779bs
        0x77c1s
        0x779fs
        0x7783s
        0x779as
        0x779cs
        0x7798s
        0x7797s
        0x778as
        0x778ds
        0x778cs
        0x77dcs
        0x7789s
        0x778ds
        0x778ds
        0x77d8s
        0x77d8s
        0x77dbs
        0x77des
        0x778cs
        0x77des
        0x77d9s
        0x778cs
        0x778as
        0x7798s
        0x7797s
        0x778as
        0x77das
        0x77das
        0x77des
        0x77dds
        0x77dcs
        0x77d6s
        0x77dds
        0x778cs
        0x77d9s
        0x778bs
        0x77d7s
        0x77dfs
        0x77dds
        0x77das
        0x77d6s
        0x16das
        -0x5844s
        -0x5855s
        -0x5858s
        -0x5845s
        -0x5860s
        -0x5856s
        -0x5855s
        -0x5856s
        -0x5842s
        -0x5851s
        -0x5859s
        -0x5856s
        0x1d83s
        0x768fs
        -0x4137s
        0x6d7es
        -0x5c35s
        -0x5ad0s
        -0x5268s
        -0x4c0cs
        0x638as
        -0x4f3as
        0x5f03s
        0x5db3s
        0x4a4bs
        0x5f2fs
        0x4e87s
        0x67ads
        0x77e2s
        0x63a1s
        0x5a34s
        0x42ecs
    .end array-data
.end method

.method public static final synthetic ۙ()J
    .locals 2

    .line 16
    sget-wide v0, Ll/ۗ֨᩻;->᩸:J

    return-wide v0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

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

    const v23, -0x7a8c3527

    sget v24, Ll/ۖۙ;->ۤۧۤ:I

    sget v25, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v26, "\u05a1\u06da"

    invoke-static/range {v26 .. v26}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v26

    add-int v26, v26, v24

    mul-int/lit8 v26, v26, 0x25

    xor-int v4, v26, v25

    mul-int/lit16 v4, v4, -0x27eb

    const v28, 0x2f7947e6

    xor-int v4, v4, v28

    const v28, 0x4744cc03

    xor-int v26, v26, v28

    move-object/from16 v28, v5

    move-object v9, v8

    move-object v13, v12

    move-object/from16 v17, v16

    move/from16 v27, v26

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v26, -0x7a8c3527

    :goto_0
    xor-int v6, v26, v25

    mul-int/lit16 v6, v6, 0x7f2f

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v4, v6

    xor-int v26, v27, v4

    sparse-switch v26, :sswitch_data_0

    move/from16 v27, v12

    if-eqz v11, :cond_a

    goto/16 :goto_a

    .line 17
    :sswitch_0
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_1

    :cond_0
    :goto_1
    move/from16 v27, v12

    move/from16 v0, v23

    goto/16 :goto_12

    :cond_1
    move/from16 v27, v12

    move/from16 v0, v23

    goto/16 :goto_11

    .line 167
    :sswitch_1
    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v27, v12

    move/from16 v0, v23

    goto/16 :goto_f

    .line 146
    :sswitch_2
    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u06d8\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v25

    xor-int v6, v4, v24

    mul-int/lit16 v6, v6, -0x268f

    const v27, 0x4188a135

    xor-int v6, v6, v27

    const v27, -0x39b6bfd8

    goto/16 :goto_6

    .line 39
    :sswitch_3
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_0

    goto :goto_4

    :sswitch_4
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u06e4\u1a75"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v25

    xor-int v6, v4, v24

    mul-int/lit16 v6, v6, -0x35d

    const v27, 0x110969f

    xor-int v6, v6, v27

    const v27, 0x2c83a3a1

    goto/16 :goto_6

    :sswitch_5
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v4

    if-lez v4, :cond_5

    goto :goto_4

    :cond_5
    move/from16 v27, v12

    move/from16 v0, v23

    goto/16 :goto_13

    :sswitch_6
    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    const-string v4, "\u1a78\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v24

    xor-int v6, v4, v25

    mul-int/lit16 v6, v6, -0x15d5

    const v27, -0x48fb4231

    xor-int v6, v6, v27

    const v27, -0x2138145f

    goto/16 :goto_6

    .line 123
    :sswitch_7
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v4

    if-nez v4, :cond_7

    :goto_3
    move/from16 v27, v12

    move/from16 v0, v23

    goto/16 :goto_10

    :cond_7
    :goto_4
    const-string v4, "\u06d6\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v25

    xor-int v6, v4, v24

    mul-int/lit16 v6, v6, -0x422d

    const v27, 0x66310743

    xor-int v6, v6, v27

    const v27, -0x36487b5b

    goto/16 :goto_6

    :sswitch_8
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    goto :goto_3

    :sswitch_9
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    return-void

    .line 178
    :sswitch_a
    :try_start_0
    sget-object v4, Ll/ۗ֨᩻;->ۙ:Ll/ܽ᩻ۙ;

    new-instance v6, Ll/᩻֨᩻;

    invoke-direct {v6, v1, v0, v2, v3}, Ll/᩻֨᩻;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    invoke-virtual {v4, v6}, Ll/ܽ᩻ۙ;->ۙ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :sswitch_b
    if-eqz v16, :cond_8

    const-string v4, "\u1a79\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v25

    xor-int v6, v4, v24

    mul-int/lit16 v6, v6, -0x7a75

    const v27, 0x2ee2b1f7

    xor-int v6, v6, v27

    const v27, 0x26703d20

    goto/16 :goto_6

    :sswitch_c
    if-eqz v15, :cond_9

    :goto_5
    move/from16 v27, v12

    goto/16 :goto_a

    .line 177
    :sswitch_d
    :try_start_1
    invoke-static {}, Ll/֡᩻;->ܿۙۚ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v4, "\u06e0\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v24

    mul-int/lit8 v4, v4, -0x69

    xor-int v6, v4, v25

    mul-int/lit16 v6, v6, -0x1181

    const v27, -0x79f3eecc

    xor-int v6, v6, v27

    const v27, -0x5330bee4

    goto/16 :goto_6

    .line 181
    :sswitch_e
    :try_start_2
    invoke-virtual {v13}, Ll/۬ۢ᩻;->᩸()Z

    move-result v15
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const-string v4, "\u073a\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v25

    xor-int v6, v4, v24

    mul-int/lit16 v6, v6, -0x7eb5

    const v27, -0x3ac0c3aa

    xor-int v6, v6, v27

    const v27, 0x2bd4494f

    goto/16 :goto_6

    :sswitch_f
    if-eqz v14, :cond_8

    const-string v4, "\u06e2\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v25

    xor-int v6, v4, v24

    mul-int/lit16 v6, v6, 0x140f

    const v27, 0x1ca280c6

    xor-int v6, v6, v27

    const v27, -0x282d0413

    goto/16 :goto_6

    :cond_8
    const-string v4, "\u05a1\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v24

    mul-int/lit8 v4, v4, -0x5d

    xor-int v6, v4, v25

    mul-int/lit16 v6, v6, -0x6b9d

    const v27, -0x94a1b82

    xor-int v6, v6, v27

    const v27, -0x187cdcfb

    goto :goto_6

    .line 176
    :sswitch_10
    :try_start_3
    invoke-static {}, Ll/ۧ۬᩻;->ۙ()Ll/۬ۢ᩻;

    move-result-object v13

    .line 177
    invoke-static {v13}, Ll/֫֨;->ܽ᩵۠(Ljava/lang/Object;)Z

    move-result v14
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    const-string v4, "\u06dc\u06e2"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v25

    mul-int/lit8 v4, v4, -0x39

    xor-int v6, v4, v24

    mul-int/lit16 v6, v6, 0x3e87

    const v27, -0x17955300

    xor-int v6, v6, v27

    const v27, 0x481ec18d

    goto :goto_6

    :sswitch_11
    if-eqz v12, :cond_9

    const-string v4, "\u06df\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v24

    mul-int/lit8 v4, v4, -0x65

    xor-int v6, v4, v25

    mul-int/lit16 v6, v6, -0x23af

    const v27, -0x48125912

    xor-int v6, v6, v27

    const v27, 0x22fc658

    goto :goto_6

    :catch_0
    :cond_9
    move/from16 v27, v12

    goto/16 :goto_7

    .line 174
    :sswitch_12
    :try_start_4
    sget-object v4, Ll/ۗ֨᩻;->ᩳ᩻֫:[S
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const/16 v6, 0x39

    move/from16 v27, v12

    const/4 v12, 0x4

    :try_start_5
    invoke-static {v4, v6, v12, v5}, Ll/ۘܶ;->ۙᩳۜ([SIII)Ljava/lang/String;

    move-result-object v4

    .line 175
    invoke-virtual {v9, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v12
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    const-string v4, "\u06dc\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v24, v4

    mul-int/lit8 v4, v4, 0x23

    xor-int v6, v4, v25

    mul-int/lit16 v6, v6, -0x561d

    const v27, 0x248d3b25

    xor-int v6, v6, v27

    const v27, -0x62d3f668

    :goto_6
    xor-int v27, v4, v27

    goto/16 :goto_9

    :cond_a
    const-string v4, "\u1a78\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v25

    mul-int/lit8 v4, v4, 0x71

    xor-int v6, v4, v24

    mul-int/lit16 v6, v6, 0x307b

    const v12, -0x7ce68fd4

    xor-int/2addr v6, v12

    const v12, 0x49894ecb

    goto/16 :goto_8

    :sswitch_13
    move/from16 v27, v12

    .line 174
    :try_start_6
    sget-object v4, Ll/ۗ֨᩻;->ᩳ᩻֫:[S

    const/16 v6, 0x31

    const/16 v12, 0x8

    invoke-static {v4, v6, v12, v5}, Ll/ۗ᩵;->᩶֡᩺([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v11
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    const-string v4, "\u06e2\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v25

    xor-int v6, v4, v24

    mul-int/lit16 v6, v6, -0x78ed

    const v12, -0x53af39b2

    xor-int/2addr v6, v12

    const v12, 0x6e00bed

    goto/16 :goto_8

    :sswitch_14
    move/from16 v27, v12

    if-eqz v10, :cond_c

    const-string v4, "\u06dc\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v24

    mul-int/lit8 v4, v4, 0x3

    xor-int v6, v4, v25

    mul-int/lit16 v6, v6, 0x38cd

    const v12, -0x68ebb450

    xor-int/2addr v6, v12

    const v12, -0x17fc627a

    goto/16 :goto_8

    :sswitch_15
    move/from16 v27, v12

    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_c

    :sswitch_16
    move/from16 v27, v12

    .line 173
    :try_start_7
    invoke-static {v8}, Ll/ۘ֡;->᩷ᩴܳ(I)Ll/ۖۢ᩻;

    move-result-object v4

    invoke-static {v4, v1}, Ll/֫ܺ;->᩵۫۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Ll/ᩳ֨᩻;->ۙ(Ll/ۖۢ᩻;)Lorg/json/JSONObject;

    move-result-object v9

    .line 174
    invoke-static {}, Ll/֡᩻;->ܿۙۚ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    const-string v4, "\u1a79\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v25

    xor-int v6, v4, v24

    mul-int/lit16 v6, v6, -0x41a5

    const v12, -0xc8dfad6

    xor-int/2addr v6, v12

    const v12, 0x55bba0d1

    goto :goto_8

    :catch_1
    :goto_7
    const-string v4, "\u06dc\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v24

    xor-int v6, v4, v25

    mul-int/lit16 v6, v6, 0x1cd

    const v12, 0x7bbcb863

    xor-int/2addr v6, v12

    const v12, -0x92e2f7f

    goto :goto_8

    :sswitch_17
    move/from16 v27, v12

    const/16 v8, 0x1113

    const-string v4, "\u06ec\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v25

    xor-int v6, v4, v24

    mul-int/lit16 v6, v6, -0x7557

    const v12, -0x472bad33

    xor-int/2addr v6, v12

    const v12, 0x59d850ea

    goto :goto_8

    :sswitch_18
    move/from16 v27, v12

    .line 171
    sget-wide v29, Ll/ۗ֨᩻;->᩸:J

    cmp-long v4, v2, v29

    if-eqz v4, :cond_b

    goto :goto_a

    :cond_b
    const-string v4, "\u1a77\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v24

    xor-int v6, v4, v25

    mul-int/lit16 v6, v6, -0x299

    const v12, 0xcb533a9

    xor-int/2addr v6, v12

    const v12, -0x25887118

    goto :goto_8

    :sswitch_19
    move/from16 v27, v12

    invoke-static {}, Ll/֡ᩴ;->֫᩺ۢ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    const-string v4, "\u1a73\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v24

    mul-int/lit8 v4, v4, -0x15

    xor-int v6, v4, v25

    mul-int/lit16 v6, v6, 0x23bb

    const v12, 0x623dce19

    xor-int/2addr v6, v12

    const v12, 0x4b256bad    # 1.0841005E7f

    :goto_8
    xor-int/2addr v4, v12

    move/from16 v12, v27

    move/from16 v27, v4

    :goto_9
    move v4, v6

    goto/16 :goto_0

    :sswitch_1a
    move/from16 v27, v12

    .line 169
    aget v4, v28, v7

    int-to-long v0, v4

    .line 170
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 171
    invoke-static {}, Ll/ۖ֡;->ܺۙᩴ()Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "\u1a74\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v25

    mul-int/lit8 v0, v0, 0x2f

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, 0x1d27

    const v4, -0x26a2c679

    xor-int/2addr v4, v1

    const v1, -0x14eab47f

    goto :goto_d

    :cond_c
    :goto_a
    move/from16 v0, v23

    goto :goto_b

    :sswitch_1b
    return-void

    :sswitch_1c
    move/from16 v27, v12

    move/from16 v0, v23

    if-ge v7, v0, :cond_d

    const-string v1, "\u06d9\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    mul-int/lit8 v1, v1, 0x4d

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x33b3

    const v6, 0x6488fbe7

    xor-int/2addr v4, v6

    const v6, 0x230c6eff

    goto/16 :goto_14

    :cond_d
    :goto_b
    const-string v1, "\u1a73\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0x121d

    const v6, -0x7e22bf22

    xor-int/2addr v4, v6

    const v6, -0x7ad1d66d

    goto/16 :goto_14

    :sswitch_1d
    move/from16 v27, v12

    const/16 v0, 0xa

    new-array v1, v0, [I

    .line 168
    fill-array-data v1, :array_0

    const/4 v4, 0x0

    move-object/from16 v28, v1

    const/4 v7, 0x0

    const/16 v23, 0xa

    :goto_c
    const-string v0, "\u1a79\u0736"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, -0x6665

    const v4, -0x429f0e32

    xor-int/2addr v4, v1

    const v1, -0x3a7edbaa

    :goto_d
    xor-int/2addr v0, v1

    move-object/from16 v1, p1

    move/from16 v12, v27

    move/from16 v27, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_1e
    move/from16 v27, v12

    move/from16 v0, v23

    const v1, 0x8912

    const v5, 0x8912

    goto :goto_e

    :sswitch_1f
    move/from16 v27, v12

    move/from16 v0, v23

    const v1, 0xa7ce

    const v5, 0xa7ce

    :goto_e
    const-string v1, "\u06d9\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v24, v1

    mul-int/lit8 v1, v1, 0x1f

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x660f

    const v6, -0x4614394d

    xor-int/2addr v4, v6

    const v6, -0x7a980917

    goto/16 :goto_14

    :sswitch_20
    move/from16 v27, v12

    move/from16 v0, v23

    add-int v1, v21, v22

    add-int/2addr v1, v1

    sub-int v1, v20, v1

    if-lez v1, :cond_e

    const-string v1, "\u06eb\u06d8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v25

    mul-int/lit8 v1, v1, -0x1f

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x847

    const v6, 0x1b5be350

    xor-int/2addr v4, v6

    const v6, -0x6cef528d

    goto/16 :goto_14

    :cond_e
    const-string v1, "\u0730\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, 0x29

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, -0x1c45

    const v6, -0x3347a4a6    # -9.665608E7f

    xor-int/2addr v4, v6

    const v6, -0x466c9e0f

    goto/16 :goto_14

    :sswitch_21
    move/from16 v27, v12

    move/from16 v0, v23

    const v22, 0x7c3359

    .line 172
    sget v1, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v1, :cond_f

    goto/16 :goto_13

    :cond_f
    const-string v1, "\u073f\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0xf5f

    const v6, 0xf48c4ef

    xor-int/2addr v4, v6

    const v6, 0x56fddc9f

    goto/16 :goto_14

    :sswitch_22
    move/from16 v27, v12

    move/from16 v0, v23

    add-int v1, v18, v19

    mul-int v20, v1, v1

    mul-int v21, v18, v18

    .line 122
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_10

    :cond_10
    const-string v1, "\u06df\u0733"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    mul-int/lit8 v1, v1, -0x75

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0x7031

    const v6, 0x3cac2512

    xor-int/2addr v4, v6

    const v6, -0x66997688

    goto/16 :goto_14

    :sswitch_23
    move/from16 v27, v12

    move/from16 v0, v23

    const/16 v1, 0x30

    aget-short v18, v17, v1

    const/16 v19, 0xb25

    .line 5
    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v1, :cond_11

    const-string v1, "\u073f\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0xa83

    const v6, 0x418be4dc

    xor-int/2addr v4, v6

    const v6, 0x7e1e95a4

    goto/16 :goto_14

    :cond_11
    const-string v1, "\u06d7\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, 0x15

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x24db

    const v6, -0x21d89525

    xor-int/2addr v4, v6

    const v6, 0x522431fa

    goto/16 :goto_14

    :sswitch_24
    move/from16 v27, v12

    move/from16 v0, v23

    sget-object v17, Ll/ۗ֨᩻;->ᩳ᩻֫:[S

    .line 142
    sget v1, Ll/֫֡;->֫ۙۖ:I

    if-gtz v1, :cond_12

    goto/16 :goto_11

    :cond_12
    const-string v1, "\u06d8\u0730"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v25, v1

    mul-int/lit8 v1, v1, -0x7

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x3519

    const v6, 0x73ee43ef

    xor-int/2addr v4, v6

    const v6, -0x37fd0134

    goto/16 :goto_14

    :sswitch_25
    move/from16 v27, v12

    move/from16 v0, v23

    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v1, :cond_13

    :goto_f
    const-string v1, "\u1a79\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x2329

    const v6, -0x4646cbe5

    xor-int/2addr v4, v6

    const v6, 0x8b0d069

    goto/16 :goto_14

    :cond_13
    const-string v1, "\u06e8\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x6ac3

    const v6, 0x424764ae    # 49.84832f

    xor-int/2addr v4, v6

    const v6, -0x1de09696

    goto/16 :goto_14

    :sswitch_26
    move/from16 v27, v12

    move/from16 v0, v23

    .line 148
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v1

    if-nez v1, :cond_14

    goto :goto_11

    :cond_14
    const-string v1, "\u06e1\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x28f7

    const v6, -0x2f93b2a6

    xor-int/2addr v4, v6

    const v6, 0x99b3e40

    goto/16 :goto_14

    :sswitch_27
    move/from16 v27, v12

    move/from16 v0, v23

    .line 64
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v1

    if-eqz v1, :cond_15

    :goto_10
    const-string v1, "\u1a73\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, -0x41

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, -0x5a4f

    const v6, -0x16e13044    # -1.1999455E25f

    xor-int/2addr v4, v6

    const v6, 0x120e1e7a

    goto/16 :goto_14

    :cond_15
    const-string v1, "\u1a7a\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v25, v1

    mul-int/lit8 v1, v1, -0x7d

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0x13cf

    const v6, -0x5aab02e5

    xor-int/2addr v4, v6

    const v6, 0x47c20a36

    goto/16 :goto_14

    :sswitch_28
    move/from16 v27, v12

    move/from16 v0, v23

    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v1, :cond_16

    :goto_11
    const-string v1, "\u1a76\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, -0x2dfd

    const v6, -0x5a367594

    xor-int/2addr v4, v6

    const v6, 0x1d33ee72

    goto/16 :goto_14

    :cond_16
    const-string v1, "\u0730\u06d8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x18b3

    const v6, -0x366138af

    xor-int/2addr v4, v6

    const v6, 0x22126f67

    goto :goto_14

    :sswitch_29
    move/from16 v27, v12

    move/from16 v0, v23

    .line 157
    sget v1, Ll/ۖ;->ܿۚ֡:I

    if-ltz v1, :cond_17

    :goto_12
    const-string v1, "\u1a77\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, -0x4b

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, -0x6b8b

    const v6, -0x1fb242ff    # -5.9300027E19f

    xor-int/2addr v4, v6

    const v6, -0x6477a1d9

    goto :goto_14

    :cond_17
    const-string v1, "\u06db\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x69e1

    const v6, 0x441f4b20

    xor-int/2addr v4, v6

    const v6, -0x167a076f

    goto :goto_14

    :sswitch_2a
    move/from16 v27, v12

    move/from16 v0, v23

    .line 45
    sget v1, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v1, :cond_18

    :goto_13
    const-string v1, "\u1a79\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v24, v1

    mul-int/lit8 v1, v1, 0x29

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x25cb

    const v6, 0x4587bfc0    # 4343.9688f

    xor-int/2addr v4, v6

    const v6, 0x60e3bef8

    goto :goto_14

    :cond_18
    const-string v1, "\u06d7\u06d8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v25, v1

    mul-int/lit8 v1, v1, -0x11

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x6701

    const v6, 0x6e787767

    xor-int/2addr v4, v6

    const v6, 0x714edc2c

    :goto_14
    xor-int/2addr v1, v6

    move/from16 v23, v0

    move/from16 v12, v27

    move-object/from16 v0, p0

    move/from16 v27, v1

    move-object/from16 v1, p1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7eaef95b -> :sswitch_27
        -0x7e13dc13 -> :sswitch_25
        -0x793d2538 -> :sswitch_18
        -0x7505cfcb -> :sswitch_16
        -0x74496cc1 -> :sswitch_e
        -0x7226b552 -> :sswitch_26
        -0x6f3bb0ee -> :sswitch_a
        -0x6ab8eb88 -> :sswitch_1
        -0x687a7c16 -> :sswitch_1f
        -0x67807768 -> :sswitch_4
        -0x65cb9167 -> :sswitch_5
        -0x629c6d7d -> :sswitch_c
        -0x5880a801 -> :sswitch_9
        -0x55b7e301 -> :sswitch_b
        -0x559ab4bb -> :sswitch_27
        -0x54ec9610 -> :sswitch_17
        -0x53525aec -> :sswitch_29
        -0x5267eff1 -> :sswitch_1b
        -0x51a29c9a -> :sswitch_11
        -0x4d302df3 -> :sswitch_a
        -0x4d0dfc05 -> :sswitch_13
        -0x45b53589 -> :sswitch_6
        -0x41fb295f -> :sswitch_2
        -0x41f26a83 -> :sswitch_1
        -0x3e0c6e15 -> :sswitch_25
        -0x39a9a2c7 -> :sswitch_14
        -0x3756b131 -> :sswitch_0
        -0x36fe527b -> :sswitch_23
        -0x2dfe262f -> :sswitch_d
        -0x2d217da8 -> :sswitch_28
        -0x29daf2d8 -> :sswitch_2
        -0x21750563 -> :sswitch_20
        -0x1cfdad6f -> :sswitch_f
        -0x1cf059d1 -> :sswitch_14
        -0x1c9beeeb -> :sswitch_6
        -0x1b6f6b39 -> :sswitch_21
        -0x16ce7b3f -> :sswitch_29
        -0x160ee7f2 -> :sswitch_21
        -0x13d0d5bf -> :sswitch_12
        -0x10904f53 -> :sswitch_16
        -0xc0434ab -> :sswitch_18
        -0xaec3bda -> :sswitch_1c
        -0x5063e31 -> :sswitch_15
        -0x1d21d34 -> :sswitch_2a
        0x30211da -> :sswitch_1d
        0xb7a5617 -> :sswitch_4
        0x11fbfd18 -> :sswitch_e
        0x1287fe85 -> :sswitch_1a
        0x1422fbc7 -> :sswitch_26
        0x14782130 -> :sswitch_0
        0x191c4084 -> :sswitch_f
        0x28d55770 -> :sswitch_1a
        0x2a4625a7 -> :sswitch_10
        0x2cdb11cc -> :sswitch_22
        0x2d75ddfd -> :sswitch_b
        0x339a2e7d -> :sswitch_1b
        0x342b5a61 -> :sswitch_23
        0x356d7ac6 -> :sswitch_11
        0x38963331 -> :sswitch_1e
        0x3d9c1d6d -> :sswitch_12
        0x417ff9e7 -> :sswitch_3
        0x4acbcbb0 -> :sswitch_9
        0x4b4f14f4 -> :sswitch_2a
        0x4ca466c5 -> :sswitch_1e
        0x4d625657 -> :sswitch_c
        0x4f5291dc -> :sswitch_24
        0x520301bd -> :sswitch_17
        0x54a888b9 -> :sswitch_24
        0x560fa1c7 -> :sswitch_7
        0x56b31148 -> :sswitch_7
        0x5b23a787 -> :sswitch_20
        0x61651a5f -> :sswitch_d
        0x61f2e27e -> :sswitch_28
        0x62c1abfc -> :sswitch_1f
        0x63c0ea05 -> :sswitch_22
        0x6403d860 -> :sswitch_19
        0x65a8f4ef -> :sswitch_1d
        0x672aeed1 -> :sswitch_19
        0x6f31b550 -> :sswitch_5
        0x7085eaff -> :sswitch_10
        0x70fe93a3 -> :sswitch_3
        0x7166d29c -> :sswitch_13
        0x733522a2 -> :sswitch_1c
        0x779440bc -> :sswitch_8
        0x7ea6fe13 -> :sswitch_15
        0x7f006007 -> :sswitch_8
    .end sparse-switch

    :array_0
    .array-data 4
        0x1f4
        0x1f4
        0x1f4
        0x1f4
        0x3e8
        0x3e8
        0x3e8
        0x3e8
        0x3e8
        0x3e8
    .end array-data
.end method

.method public static final ۙ(Ll/ܽ֡֫;IILjava/lang/String;Ll/ᩴ֨᩵;)V
    .locals 25

    move/from16 v0, p1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v13, 0x4ab47eab    # 5914453.5f

    sget v14, Ll/ۖۙ;->ۤۧۤ:I

    sget v15, Ll/ۖ;->ܿۚ֡:I

    const-string v16, "\u073f\u0733"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v15

    mul-int/lit8 v16, v16, -0x3f

    xor-int v1, v16, v14

    mul-int/lit16 v1, v1, -0x7b6d

    const v18, -0x27653034

    xor-int v1, v1, v18

    const v18, -0x7d212506

    xor-int v16, v16, v18

    move-object v9, v5

    move-object/from16 v18, v8

    move/from16 v17, v16

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, 0x4ab47eab    # 5914453.5f

    move-wide/from16 v23, v2

    move-object v2, v4

    move-object v3, v6

    const/4 v4, 0x0

    move-wide/from16 v5, v23

    :goto_0
    xor-int v8, v16, v14

    mul-int/lit16 v8, v8, 0x555

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v1, v8

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    aget-short v1, v18, v10

    mul-int/lit16 v11, v1, 0xc12

    mul-int v12, v1, v1

    .line 145
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_3

    .line 154
    :sswitch_0
    sget v1, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v1, :cond_3

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_f

    goto/16 :goto_4

    .line 113
    :sswitch_2
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v1

    if-lez v1, :cond_c

    goto/16 :goto_4

    .line 78
    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    return-void

    .line 114
    :sswitch_5
    invoke-interface/range {p4 .. p4}, Ll/ᩴ֨᩵;->ۙ()Ljava/lang/Object;

    .line 115
    invoke-interface {v9, v2}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    .line 116
    new-instance v0, Ll/᩹֨᩻;

    move-object v2, v0

    move-object/from16 v3, p0

    move/from16 v7, p2

    move-object/from16 v8, p3

    invoke-direct/range {v2 .. v9}, Ll/᩹֨᩻;-><init>(Ll/ܽ֡֫;Ljava/lang/String;JILjava/lang/String;Lcom/tencent/mm/opensdk/openapi/IWXAPI;)V

    .line 154
    invoke-static {v0}, Ll/ۖᩳ;->ۘۜ᩶(Ljava/lang/Object;)V

    return-void

    .line 110
    :sswitch_6
    invoke-interface {v9}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->getWXAppSupportAPI()I

    move-result v1

    const v8, 0x22000001

    if-ge v1, v8, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "\u06d6\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, -0x5b03

    const v17, -0x5d69c036

    xor-int v8, v8, v17

    const v17, -0x5ce761b8

    goto/16 :goto_5

    .line 154
    :sswitch_7
    sget-object v0, Ll/ۗ֨᩻;->ᩳ᩻֫:[S

    const/16 v1, 0x44

    const/16 v2, 0xd

    invoke-static {v0, v1, v2, v13}, Ll/֫ۤ;->ܽ۠ۙ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 111
    invoke-static {v0}, Ll/ۗ᩺;->֡᩹۫(Ljava/lang/Object;)Ll/᩸۠ۧ;

    return-void

    .line 109
    :sswitch_8
    invoke-static {}, Ll/ۗۖ;->᩺ۛۧ()Landroid/app/Application;

    move-result-object v1

    sget-object v2, Ll/ۗ֨᩻;->᩷:Ljava/lang/String;

    const/4 v8, 0x1

    invoke-static {v1, v2, v8}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v9

    .line 110
    invoke-interface {v9}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->isWXAppInstalled()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "\u1a7a\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v8, v1, v15

    mul-int/lit16 v8, v8, -0x193d

    const v17, 0x51ccb820

    xor-int v8, v8, v17

    const v17, 0x55487dc7

    goto/16 :goto_5

    :cond_1
    :goto_1
    const-string v1, "\u06dc\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, -0x5061

    const v17, -0x6570744b

    xor-int v8, v8, v17

    const v17, -0x1e00db1a

    goto/16 :goto_5

    .line 156
    :sswitch_9
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 52
    :sswitch_a
    invoke-interface/range {p4 .. p4}, Ll/ᩴ֨᩵;->ۙ()Ljava/lang/Object;

    .line 53
    new-instance v0, Ll/ܽ֨᩻;

    move-object v2, v0

    move-object/from16 v3, p0

    move/from16 v7, p2

    move-object/from16 v8, p3

    invoke-direct/range {v2 .. v8}, Ll/ܽ֨᩻;-><init>(Ll/ܽ֡֫;Ljava/lang/String;JILjava/lang/String;)V

    .line 106
    invoke-static {v0}, Ll/ۖᩳ;->ۘۜ᩶(Ljava/lang/Object;)V

    return-void

    :sswitch_b
    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    const v8, 0x7d566b4e

    xor-int/2addr v1, v8

    if-ne v0, v1, :cond_2

    const-string v1, "\u05ab\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x2f

    xor-int v8, v1, v15

    mul-int/lit16 v8, v8, -0x789

    const v17, -0x1347e89

    xor-int v8, v8, v17

    const v17, -0x6718583a

    goto/16 :goto_5

    :cond_2
    const-string v1, "\u073f\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v8, v1, v15

    mul-int/lit16 v8, v8, -0x512f

    const v17, 0x28369e97

    xor-int v8, v8, v17

    const v17, 0x1c0a85c2

    goto/16 :goto_5

    :sswitch_c
    sget-object v1, Ll/ۗ֨᩻;->ᩳ᩻֫:[S

    const/16 v7, 0x41

    const/4 v8, 0x3

    invoke-static {v1, v7, v8, v13}, Ll/ۗۖ;->᩵᩻ۘ([SIII)Ljava/lang/String;

    move-result-object v7

    .line 147
    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v1, :cond_4

    :cond_3
    const-string v1, "\u06d8\u0730"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v8, v1, v15

    mul-int/lit16 v8, v8, -0x747

    const v17, -0x43896825

    xor-int v8, v8, v17

    const v17, 0x53a56b3f

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u073d\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x37

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, -0x148d

    const v17, -0x3c1c8baa

    xor-int v8, v8, v17

    const v17, 0x4c91e1a7    # 7.6483896E7f

    goto/16 :goto_5

    .line 49
    :sswitch_d
    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    const v8, 0x7e3d80a4

    xor-int/2addr v1, v8

    if-ne v0, v1, :cond_5

    const-string v1, "\u06db\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x63

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, 0x44df

    const v17, -0x1ef93d7e

    xor-int v8, v8, v17

    const v17, 0x30ab1571

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u073a\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v8, v1, v15

    mul-int/lit16 v8, v8, -0xec5

    const v17, 0x41d43af5

    xor-int v8, v8, v17

    const v17, 0x3650af14

    goto/16 :goto_5

    :sswitch_e
    sget-object v1, Ll/ۗ֨᩻;->ᩳ᩻֫:[S

    const/16 v3, 0x3e

    const/4 v8, 0x3

    invoke-static {v1, v3, v8, v13}, Ll/֫֡;->ܺۜᩴ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 134
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v1

    if-ltz v1, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v1, "\u0733\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x3f

    xor-int v8, v1, v15

    mul-int/lit16 v8, v8, -0x485d

    const v17, 0x2ca5485d

    xor-int v8, v8, v17

    const v17, 0x5e4138cd

    goto/16 :goto_5

    .line 48
    :sswitch_f
    sget-wide v5, Ll/ۗ֨᩻;->᩸:J

    const/4 v1, 0x0

    .line 49
    sput-object v1, Ll/ۗ֨᩻;->ۤ:Ljava/lang/Runnable;

    .line 92
    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v1, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v1, "\u1a75\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x27

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, -0x3fdb

    const v17, 0x607ad794

    xor-int v8, v8, v17

    const v17, -0x568a69c7

    goto/16 :goto_5

    .line 47
    :sswitch_10
    invoke-static {}, Ll/֡ᩴ;->֫᩺ۢ()Ljava/lang/String;

    move-result-object v4

    .line 48
    sget-wide v19, Ll/ۗ֨᩻;->᩸:J

    const-wide/16 v21, 0x1

    add-long v19, v19, v21

    sput-wide v19, Ll/ۗ֨᩻;->᩸:J

    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v1, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v1, "\u1a78\u06e0"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x7f

    xor-int v8, v1, v15

    mul-int/lit16 v8, v8, 0x6b1b

    const v17, 0x70b4d72b

    xor-int v8, v8, v17

    const v17, -0x3f8e8cc2

    goto/16 :goto_5

    :sswitch_11
    const v1, 0xbd1c

    const v13, 0xbd1c

    goto :goto_2

    :sswitch_12
    const/16 v1, 0x3803

    const/16 v13, 0x3803

    :goto_2
    const-string v1, "\u0733\u06df"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x49

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, -0x6bbb

    const v17, 0x4462ee7

    xor-int v8, v8, v17

    const v17, -0x1babbe9f

    goto/16 :goto_5

    :sswitch_13
    const v1, 0x246c51

    add-int/2addr v1, v12

    sub-int v1, v11, v1

    if-gtz v1, :cond_9

    const-string v1, "\u06d8\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x47

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, -0x17eb

    const v17, 0x362fbc00

    xor-int v8, v8, v17

    const v17, 0x66edc501

    goto/16 :goto_5

    :cond_9
    const-string v1, "\u06e0\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0xf

    xor-int v8, v1, v15

    mul-int/lit16 v8, v8, 0x33e1

    const v17, -0x40b03808

    xor-int v8, v8, v17

    const v17, 0x4730e2f3

    goto/16 :goto_5

    :goto_3
    const-string v1, "\u06df\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x59

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, 0x5e9

    const v17, -0x2a1016bd

    xor-int v8, v8, v17

    const v17, -0x71d4558e

    goto/16 :goto_5

    :cond_a
    const-string v1, "\u06e4\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v8, v1, v15

    mul-int/lit16 v8, v8, -0x3fa1

    const v17, -0x5361028f

    xor-int v8, v8, v17

    const v17, 0x28d1cbe9

    goto/16 :goto_5

    :sswitch_14
    sget-object v18, Ll/ۗ֨᩻;->ᩳ᩻֫:[S

    const/16 v10, 0x3d

    .line 75
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v1

    if-ltz v1, :cond_b

    goto/16 :goto_4

    :cond_b
    const-string v1, "\u073f\u1a77"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, 0x6981

    const v17, 0x1188c6bd

    xor-int v8, v8, v17

    const v17, -0x567bd587

    goto/16 :goto_5

    :sswitch_15
    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v1, :cond_d

    :cond_c
    const-string v1, "\u06e2\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v8, v1, v15

    mul-int/lit16 v8, v8, -0x4877

    const v17, -0xebb86ae

    xor-int v8, v8, v17

    const v17, -0x5b4dafa0

    goto/16 :goto_5

    :cond_d
    const-string v1, "\u06d9\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, 0x331

    const v17, 0x35de99e9

    xor-int v8, v8, v17

    const v17, 0x6ff42451

    goto/16 :goto_5

    .line 153
    :sswitch_16
    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v1, :cond_e

    goto :goto_4

    :cond_e
    const-string v1, "\u073f\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v8, v1, v15

    mul-int/lit16 v8, v8, 0x4329

    const v17, -0x60082616

    xor-int v8, v8, v17

    const v17, -0x11b6709c

    goto :goto_5

    :sswitch_17
    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v1, :cond_10

    :cond_f
    const-string v1, "\u06e8\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, -0x526b

    const v17, -0x38a6ab6a

    xor-int v8, v8, v17

    const v17, -0x331bcf0

    goto :goto_5

    :cond_10
    const-string v1, "\u06da\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, -0x2ba7

    const v17, 0x521c6dd1

    xor-int v8, v8, v17

    const v17, -0x34116389    # -3.1275246E7f

    goto :goto_5

    .line 83
    :sswitch_18
    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v1, :cond_11

    :goto_4
    const-string v1, "\u06e1\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0xf

    xor-int v8, v1, v14

    mul-int/lit16 v8, v8, 0x6b71

    const v17, 0xd16298b

    xor-int v8, v8, v17

    const v17, 0x6c53b706

    goto :goto_5

    :cond_11
    const-string v1, "\u073f\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x5f

    xor-int v8, v1, v15

    mul-int/lit16 v8, v8, 0x643b

    const v17, 0x21d526b0

    xor-int v8, v8, v17

    const v17, 0x423db600

    :goto_5
    xor-int v17, v1, v17

    move v1, v8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7434059d -> :sswitch_12
        -0x6b8240a1 -> :sswitch_9
        -0x69065711 -> :sswitch_8
        -0x626d3a9a -> :sswitch_f
        -0x5f5929eb -> :sswitch_13
        -0x462a6dee -> :sswitch_a
        -0x4362472e -> :sswitch_c
        -0x41d87784 -> :sswitch_c
        -0x388e637c -> :sswitch_6
        -0x357e8d9e -> :sswitch_11
        -0x34fec539 -> :sswitch_d
        -0x309514fd -> :sswitch_e
        -0x2e24a388 -> :sswitch_8
        -0x2a6ed374 -> :sswitch_e
        -0x242d8e13 -> :sswitch_1
        -0x23380a62 -> :sswitch_18
        -0x22c37845 -> :sswitch_6
        -0x1fdba8ab -> :sswitch_12
        -0x19d88093 -> :sswitch_17
        -0x12f87e25 -> :sswitch_4
        -0x101c9e8d -> :sswitch_14
        -0xeafddc9 -> :sswitch_4
        -0x9146371 -> :sswitch_13
        -0x7182799 -> :sswitch_18
        -0x6a9c8c1 -> :sswitch_0
        0x539f867 -> :sswitch_a
        0x63d67b8 -> :sswitch_5
        0x230fee1e -> :sswitch_5
        0x2b954db3 -> :sswitch_3
        0x2cc54da8 -> :sswitch_3
        0x2e102cbc -> :sswitch_2
        0x378f58f7 -> :sswitch_b
        0x42c46dd1 -> :sswitch_17
        0x451b4b4f -> :sswitch_b
        0x4635a223 -> :sswitch_11
        0x4bf9ec9e -> :sswitch_16
        0x514ddda1 -> :sswitch_7
        0x52c52624 -> :sswitch_16
        0x5b470b9f -> :sswitch_15
        0x5e65d51c -> :sswitch_9
        0x61e86160 -> :sswitch_7
        0x622e3644 -> :sswitch_10
        0x663aa4b2 -> :sswitch_14
        0x663eb5f4 -> :sswitch_15
        0x66c87188 -> :sswitch_10
        0x6e3dcc75 -> :sswitch_1
        0x72790520 -> :sswitch_f
        0x78878a63 -> :sswitch_0
        0x7cd901f6 -> :sswitch_2
        0x7cef0873 -> :sswitch_d
    .end sparse-switch
.end method

.method public static final ۙ(Ll/᩻֨᩻;)Z
    .locals 10

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    const v4, -0x2f2c3ce8

    sget v5, Ll/֨ܿ;->᩹᩻۟:I

    sget v6, Ll/᩺;->۫۬۫:I

    const-string v7, "\u073f\u073f"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7323

    const v9, 0x1583cf1a

    xor-int/2addr v8, v9

    const v9, -0x7bef6d8b

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x1429

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 10
    sget-boolean v7, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v7, :cond_3

    goto/16 :goto_3

    .line 12
    :sswitch_0
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v7

    if-eqz v7, :cond_a

    goto/16 :goto_4

    .line 13
    :sswitch_1
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget v7, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v7, :cond_4

    goto/16 :goto_4

    .line 4
    :sswitch_2
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v7

    if-eqz v7, :cond_6

    goto/16 :goto_4

    .line 19
    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    const/4 p0, 0x1

    return p0

    .line 26
    :sswitch_6
    invoke-virtual {p0}, Ll/᩻֨᩻;->᩷()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ll/֡᩻;->ܿۙۚ()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    const-string v7, "\u073d\u06ec"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x3f5b

    const v9, -0x16ae5017

    xor-int/2addr v8, v9

    const v9, -0x286a0246

    goto :goto_0

    :sswitch_7
    cmp-long v7, v0, v2

    if-nez v7, :cond_d

    const-string v7, "\u06e0\u1a78"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x15

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1f93

    const v9, 0x705d0f78

    xor-int/2addr v8, v9

    const v9, 0x66e285d6

    goto :goto_0

    :sswitch_8
    sget v7, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v7, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v7, "\u073f\u06d8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0xd

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x24d9

    const v9, -0x30b7d11d

    xor-int/2addr v8, v9

    const v9, 0x6680bbe3

    goto/16 :goto_0

    .line 8
    :sswitch_9
    sget v7, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v7, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v7, "\u05ab\u06d7"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3d07

    const v9, -0x162218d0

    xor-int/2addr v8, v9

    const v9, 0x904a6b5

    goto/16 :goto_0

    .line 18
    :sswitch_a
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v7

    if-gtz v7, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v7, "\u05a8\u06e1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xfa5

    const v9, -0x5d07f7ff

    xor-int/2addr v8, v9

    const v9, 0x5f9131a8

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u06db\u05a8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x6b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x73b

    const v9, -0x4b919c03

    xor-int/2addr v8, v9

    const v9, 0x59a2b8e7

    goto/16 :goto_0

    .line 8
    :sswitch_b
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v7

    if-gtz v7, :cond_5

    :cond_4
    const-string v7, "\u1a75\u06d8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x6b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4595

    const v9, 0x3fcffedc

    xor-int/2addr v8, v9

    const v9, 0x67416e66

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u0733\u06d9"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0xf

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1f51

    const v9, -0x533a4bf3

    xor-int/2addr v8, v9

    const v9, -0x1cd1ed34

    goto/16 :goto_0

    .line 10
    :sswitch_c
    sget v7, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v7, :cond_7

    :cond_6
    :goto_1
    const-string v7, "\u0736\u1a76"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7377

    const v9, 0x10735851

    xor-int/2addr v8, v9

    const v9, 0x5964d4c4

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u06d7\u06e8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x71

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2323

    const v9, -0x1417106a

    xor-int/2addr v8, v9

    const v9, 0x353e13c2

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget v7, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v7, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v7, "\u0733\u06d8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x33

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6e59

    const v9, 0x27d16f56

    xor-int/2addr v8, v9

    const v9, 0x5e42f86f

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v7

    if-ltz v7, :cond_9

    :goto_2
    const-string v7, "\u073a\u1a7b"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x32b9

    const v9, 0x5bbae391

    xor-int/2addr v8, v9

    const v9, 0x392c332e

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u1a77\u1a74"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0xf

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x34f3

    const v9, -0x187eb2f3

    xor-int/2addr v8, v9

    const v9, 0x45d2c443

    goto/16 :goto_0

    .line 4
    :sswitch_f
    sget-boolean v7, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v7, :cond_b

    :cond_a
    :goto_3
    const-string v7, "\u073a\u06e4"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x5b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x6711

    const v9, 0x6c03f93

    xor-int/2addr v8, v9

    const v9, 0x51f33bfe

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u0733\u073d"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1fd9

    const v9, -0x6fb1d002

    xor-int/2addr v8, v9

    const v9, -0x73ec4837

    goto/16 :goto_0

    .line 26
    :sswitch_10
    invoke-virtual {p0}, Ll/᩻֨᩻;->ۙ()J

    move-result-wide v0

    sget-wide v2, Ll/ۗ֨᩻;->᩸:J

    sget v7, Ll/᩺;->۫۬۫:I

    if-gtz v7, :cond_c

    :goto_4
    const-string v7, "\u0736\u06e7"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x43dd

    const v9, 0x72a45d12

    xor-int/2addr v8, v9

    const v9, -0x53262dac

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u0733\u1a77"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4e2f

    const v9, 0x65548b8e

    xor-int/2addr v8, v9

    const v9, 0x27251125

    goto/16 :goto_0

    :sswitch_11
    const/4 p0, 0x0

    return p0

    :sswitch_12
    if-eqz p0, :cond_d

    const-string v7, "\u06e2\u06df"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x3bc5

    const v9, -0x2507b038

    xor-int/2addr v8, v9

    const v9, -0x36987855

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u06e2\u0733"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3fd1

    const v9, 0x1af5b507

    xor-int/2addr v8, v9

    const v9, -0x4d737ae3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e7d113a -> :sswitch_8
        -0x7e42c806 -> :sswitch_f
        -0x78ee42ff -> :sswitch_d
        -0x7790f5e6 -> :sswitch_11
        -0x6fab4738 -> :sswitch_d
        -0x604be92c -> :sswitch_0
        -0x490ffdcb -> :sswitch_e
        -0x412c0f82 -> :sswitch_1
        -0x410cd9fd -> :sswitch_12
        -0x2baa755e -> :sswitch_9
        -0x1aca7e72 -> :sswitch_c
        -0x1179b854 -> :sswitch_2
        -0x9a8a6b7 -> :sswitch_0
        -0x800cb4a -> :sswitch_7
        -0x7d77deb -> :sswitch_a
        -0x94181c -> :sswitch_a
        0xa41eb5e -> :sswitch_4
        0x133723f9 -> :sswitch_7
        0x1b946ae0 -> :sswitch_4
        0x2024d337 -> :sswitch_b
        0x33e743af -> :sswitch_8
        0x34ae4a4b -> :sswitch_b
        0x3b818330 -> :sswitch_2
        0x40249a28 -> :sswitch_3
        0x437085ed -> :sswitch_f
        0x4da4f8ec -> :sswitch_6
        0x4db9ae46 -> :sswitch_1
        0x4fc2775a -> :sswitch_e
        0x5184fdc7 -> :sswitch_6
        0x5cfc06ae -> :sswitch_c
        0x6382eb35 -> :sswitch_10
        0x63877d52 -> :sswitch_3
        0x6572d407 -> :sswitch_9
        0x67004af1 -> :sswitch_5
        0x6fff84ed -> :sswitch_10
        0x710dc58e -> :sswitch_5
        0x741e79d9 -> :sswitch_11
        0x7e8690de -> :sswitch_12
    .end sparse-switch
.end method

.method public static ᩷()Ljava/lang/String;
    .locals 1

    .line 27
    sget-object v0, Ll/ۗ֨᩻;->᩷:Ljava/lang/String;

    return-object v0
.end method

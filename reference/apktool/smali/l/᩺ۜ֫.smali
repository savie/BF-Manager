.class public final synthetic Ll/᩺ۜ֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/util/function/Consumer;


# static fields
.field private static final ܿۙ᩺:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩺ۜ֫;->ܿۙ᩺:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x955s
        0x7f50s
        0x7f51s
        0x7f5es
        0x7f65s
    .end array-data
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 21

    const/4 v1, 0x0

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

    const v13, -0x407b76c

    sget v14, Ll/᩶;->ᩴ᩶ۛ:I

    sget v15, Ll/ۖ᩹;->۫ܽۗ:I

    const-string v16, "\u1a7b\u06ec"

    invoke-static/range {v16 .. v16}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v16

    add-int v16, v16, v15

    mul-int/lit8 v16, v16, -0x35

    xor-int v0, v16, v14

    mul-int/lit16 v0, v0, -0x27c1

    const v18, 0x5854360e

    xor-int v0, v0, v18

    const v18, 0x3e17b43a

    xor-int v16, v16, v18

    const/16 v17, 0x0

    :goto_0
    const/16 v18, 0x0

    :goto_1
    xor-int/2addr v13, v14

    mul-int/lit16 v13, v13, 0x3bf7

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v0, v13

    xor-int v13, v16, v0

    sparse-switch v13, :sswitch_data_0

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    return-void

    .line 129
    :sswitch_0
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v0

    if-gtz v0, :cond_0

    goto/16 :goto_b

    :cond_0
    :goto_2
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    goto/16 :goto_9

    .line 121
    :sswitch_1
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v0, Ll/ۖᩳ;->᩹ۧܳ:I

    if-lez v0, :cond_d

    :cond_1
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    goto/16 :goto_a

    .line 424
    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_3
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    goto/16 :goto_4

    .line 160
    :sswitch_3
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    goto :goto_3

    .line 578
    :sswitch_4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v0

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    goto/16 :goto_7

    .line 581
    :sswitch_5
    invoke-static {v2, v4, v1}, Ll/ۗ֫;->ۢ֨֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳ֫ܺ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ;->ۤۡۖ(Ljava/lang/Object;)V

    .line 582
    invoke-static {v1}, Ll/ۖۢ᩻;->᩸(Ljava/lang/String;)V

    return-void

    .line 581
    :sswitch_6
    invoke-static/range {v18 .. v18}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_2

    goto :goto_2

    :cond_2
    const-string v0, "\u06df\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x3923

    const v19, -0x32fc847a

    xor-int v3, v3, v19

    const v19, 0x6b9ea1ba

    goto/16 :goto_6

    :sswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v3, Ll/᩺ۜ֫;->ܿۙ᩺:[S

    .line 3
    sget v18, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v18, :cond_3

    goto :goto_3

    :cond_3
    move-object/from16 v19, v1

    const/4 v1, 0x1

    move-object/from16 v20, v2

    const/4 v2, 0x4

    .line 581
    invoke-static {v3, v1, v2, v12}, Ll/ۗ֫;->᩸ᩴ᩶([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v2

    if-eqz v2, :cond_4

    const-string v0, "\u06d8\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x29ad

    const v2, -0x6844cfde

    xor-int/2addr v1, v2

    const v2, -0x502d4261

    goto :goto_5

    :cond_4
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    invoke-static {v0, v1}, Ll/֫۠;->ܺ᩹᩸(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    .line 154
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v1

    if-ltz v1, :cond_5

    :goto_4
    const-string v0, "\u06e1\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x5

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x173b

    const v2, 0x6df97fe

    xor-int/2addr v1, v2

    const v2, -0x2f7f1a10

    :goto_5
    xor-int/2addr v0, v2

    move/from16 v16, v0

    move v0, v1

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e4\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x2fc9

    const v3, 0xd422a10

    xor-int/2addr v2, v3

    const v3, -0x5093f501

    xor-int/2addr v1, v3

    move-object/from16 v18, v0

    move/from16 v16, v1

    move v0, v2

    goto/16 :goto_d

    .line 580
    :sswitch_8
    invoke-static/range {v17 .. v17}, Ll/ܳ֫ܺ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 581
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-static {v0}, Ll/ۖۙ;->ᩳܿܰ(Ljava/lang/Object;)Ll/ᩳ֫ܺ;

    move-result-object v2

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_b

    :cond_6
    const-string v0, "\u06e8\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, -0x682f

    const v19, -0x202d3d07

    xor-int v3, v3, v19

    const v19, 0x6ed39157

    :goto_6
    xor-int v0, v0, v19

    move/from16 v16, v0

    move v0, v3

    goto/16 :goto_1

    :sswitch_9
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    .line 2
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    .line 4
    sget v1, Lbin/mt/plus/Main;->ܳۤ:I

    if-nez v0, :cond_7

    const-string v0, "\u1a7a\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x5b

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x58e5

    const v2, 0x74bdf561

    xor-int/2addr v1, v2

    const v2, 0x13cfd929

    goto/16 :goto_c

    :cond_7
    move-object/from16 v17, v0

    :goto_7
    const-string v0, "\u1a74\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x1835

    const v2, -0x50452d4

    xor-int/2addr v1, v2

    const v2, 0x7a06e04f

    goto/16 :goto_c

    :sswitch_a
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    const/16 v0, 0x21e8

    const/16 v12, 0x21e8

    goto :goto_8

    :sswitch_b
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    const/16 v0, 0x7f3a

    const/16 v12, 0x7f3a

    :goto_8
    const-string v0, "\u1a7a\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x77

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x1c65

    const v2, 0x154afff2

    xor-int/2addr v1, v2

    const v2, 0x1cc8229c

    goto/16 :goto_c

    :sswitch_c
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    add-int v0, v10, v11

    add-int/2addr v0, v0

    sub-int v0, v9, v0

    if-gtz v0, :cond_8

    const-string v0, "\u05ab\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x6735

    const v2, 0x7bfc823f

    xor-int/2addr v1, v2

    const v2, -0x44f8cbf4

    goto/16 :goto_c

    :cond_8
    const-string v0, "\u05a8\u0733"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x571

    const v2, 0x7704990

    xor-int/2addr v1, v2

    const v2, 0xb694078

    goto/16 :goto_c

    :sswitch_d
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    mul-int v9, v8, v8

    mul-int v10, v7, v7

    const v11, 0x702a5c9

    .line 219
    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_9

    goto :goto_9

    :cond_9
    const-string v0, "\u06dc\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x4f

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x6cc3

    const v2, -0x2383437c

    xor-int/2addr v1, v2

    const v2, 0x651e95bd

    goto/16 :goto_c

    :sswitch_e
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    aget-short v7, v5, v6

    add-int/lit16 v8, v7, 0x2a5d

    .line 341
    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v0, :cond_a

    :goto_9
    const-string v0, "\u05a8\u06d6"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x28b9

    const v2, 0x42cd52aa

    xor-int/2addr v1, v2

    const v2, 0x50b4d630

    goto/16 :goto_c

    :cond_a
    const-string v0, "\u06d7\u06d8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x4331

    const v2, -0x3bc33bea

    xor-int/2addr v1, v2

    const v2, -0x595b897d

    goto/16 :goto_c

    :sswitch_f
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    const/4 v6, 0x0

    sget v0, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v0, :cond_b

    goto :goto_a

    :cond_b
    const-string v0, "\u0730\u1a76"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x4d

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x17c7

    const v2, 0x5c021fd4

    xor-int/2addr v1, v2

    const v2, 0x3a091ea6

    goto :goto_c

    :sswitch_10
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    sget-object v5, Ll/᩺ۜ֫;->ܿۙ᩺:[S

    .line 226
    sget v0, Ll/֫֡;->֫ۙۖ:I

    if-gtz v0, :cond_c

    :goto_a
    const-string v0, "\u1a73\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x4e1d

    const v2, 0xc833cb4

    xor-int/2addr v1, v2

    const v2, -0x3d2c6f5c

    goto :goto_c

    :cond_c
    const-string v0, "\u073a\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x11f1

    const v2, -0x341b7920    # -2.9953472E7f

    xor-int/2addr v1, v2

    const v2, 0x17417b37

    goto :goto_c

    :sswitch_11
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    .line 55
    sget v0, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v0, :cond_e

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    :cond_d
    :goto_b
    const-string v0, "\u1a79\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x1c67

    const v19, 0x27ccb086

    xor-int v3, v3, v19

    const v19, -0x7938206

    goto/16 :goto_6

    :cond_e
    const-string v0, "\u06e1\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x191f

    const v2, -0x5e1dcbdb

    xor-int/2addr v1, v2

    const v2, -0x72ff55eb

    :goto_c
    xor-int/2addr v0, v2

    move/from16 v16, v0

    move v0, v1

    :goto_d
    move-object/from16 v1, v19

    move-object/from16 v2, v20

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x78d06b13 -> :sswitch_e
        -0x73979b19 -> :sswitch_d
        -0x6e34b583 -> :sswitch_b
        -0x6989ccd0 -> :sswitch_a
        -0x3ea7a915 -> :sswitch_5
        -0x2d5c70d3 -> :sswitch_2
        -0x2a924e68 -> :sswitch_b
        -0x28b3ce6c -> :sswitch_f
        -0x183638f1 -> :sswitch_11
        -0x1069b081 -> :sswitch_3
        -0xc335be7 -> :sswitch_7
        -0x908271 -> :sswitch_9
        0x2282b7d -> :sswitch_4
        0x786a752 -> :sswitch_6
        0x7c804e7 -> :sswitch_e
        0xce7895b -> :sswitch_7
        0x101f8064 -> :sswitch_10
        0x1757a4f8 -> :sswitch_d
        0x180944d2 -> :sswitch_c
        0x29d96323 -> :sswitch_a
        0x2a00abe9 -> :sswitch_1
        0x32731349 -> :sswitch_6
        0x32cda18f -> :sswitch_0
        0x357e4dd8 -> :sswitch_4
        0x3961c938 -> :sswitch_8
        0x3a19a98d -> :sswitch_9
        0x3d8d556c -> :sswitch_f
        0x4152b393 -> :sswitch_5
        0x422ffbcd -> :sswitch_10
        0x49d71866 -> :sswitch_11
        0x4fa366a7 -> :sswitch_2
        0x50c91226 -> :sswitch_8
        0x5fcf6e7a -> :sswitch_3
        0x61597294 -> :sswitch_c
        0x7a78a89b -> :sswitch_1
        0x7dbbebe2 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

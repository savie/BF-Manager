.class public final Ll/ܺ֨ۘ;
.super Ljava/lang/Object;
.source "K3YT"

# interfaces
.implements Ll/ۤ֨ۘ;


# static fields
.field private static final ᩸ᩳ᩶:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܺ֨ۘ;->᩸ᩳ᩶:[S

    return-void

    :array_0
    .array-data 2
        0x35es
        0x4510s
        0x455es
        0x454cs
        0x454cs
        0x455as
        0x454bs
        0x454cs
        0x4510s
        0x4511s
        0x4552s
        0x454bs
        0x4553s
    .end array-data
.end method


# virtual methods
.method public final ۙ(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;)Ljava/io/InputStream;
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

    const v9, 0xf322d21

    sget v10, Ll/ۖ᩸;->ۨܽ۬:I

    sget v11, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v12, "\u05a1\u1a78"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, -0x6d

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x5dd1

    const v14, 0x8bb166d

    xor-int/2addr v13, v14

    const v14, 0x71ca694f

    :goto_0
    xor-int/2addr v12, v14

    move-object v14, v0

    :goto_1
    xor-int/2addr v9, v11

    mul-int/lit16 v9, v9, 0x72ab

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    move-object/from16 v12, p2

    sget-object v2, Ll/ܺ֨ۘ;->᩸ᩳ᩶:[S

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v13

    if-eqz v13, :cond_c

    goto/16 :goto_9

    :sswitch_0
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget v12, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v12, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_2
    move-object/from16 v12, p2

    goto/16 :goto_7

    :sswitch_1
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v12, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez v12, :cond_1

    goto/16 :goto_5

    :cond_1
    move-object/from16 v12, p2

    goto/16 :goto_9

    :sswitch_2
    sget v12, Ll/֫᩺;->᩺۟ۘ:I

    if-lez v12, :cond_4

    goto/16 :goto_5

    .line 95
    :sswitch_3
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    goto/16 :goto_5

    .line 213
    :sswitch_4
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    const/4 v0, 0x0

    return-object v0

    .line 353
    :sswitch_5
    invoke-static {v14}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Ll/֡֨ۘ;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    :sswitch_6
    invoke-static {v14, v1}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v12

    if-eqz v12, :cond_2

    move-object/from16 v12, p2

    goto/16 :goto_8

    :cond_2
    const-string v12, "\u06e7\u06d8"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, 0x77

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x559

    const v15, 0x601b9a8e

    xor-int/2addr v13, v15

    const v15, -0x4c4108e

    goto :goto_3

    :sswitch_7
    const/16 v1, 0x9

    const/4 v12, 0x4

    .line 353
    invoke-static {v8, v1, v12, v7}, Ll/֡᩶;->ۢۖ۟([SIII)Ljava/lang/String;

    move-result-object v1

    .line 319
    sget-boolean v12, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v12, :cond_3

    goto :goto_2

    :cond_3
    const-string v12, "\u06e2\u06da"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x4611

    const v15, -0x5a0b1a54

    xor-int/2addr v13, v15

    const v15, -0x76387a20

    :goto_3
    xor-int/2addr v12, v15

    goto/16 :goto_1

    .line 353
    :sswitch_8
    new-instance v14, Ljava/lang/StringBuilder;

    sget-object v12, Ll/ܺ֨ۘ;->᩸ᩳ᩶:[S

    const/4 v13, 0x1

    .line 254
    sget v15, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v15, :cond_5

    :cond_4
    :goto_4
    const-string v12, "\u1a7a\u1a78"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x4f

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x143b

    const v14, -0x4f90f650

    xor-int/2addr v13, v14

    const v14, -0x10e0b654

    goto/16 :goto_0

    :cond_5
    const/16 v15, 0x8

    .line 353
    invoke-static {v12, v13, v15, v7}, Ll/ۘۛ;->᩷ۧ᩹([SIII)Ljava/lang/String;

    move-result-object v12

    .line 197
    sget-boolean v13, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v13, :cond_6

    :goto_5
    const-string v12, "\u06e4\u1a75"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x4c53

    const v14, -0x2230d79a

    xor-int/2addr v13, v14

    const v14, -0x12bfddd9

    goto/16 :goto_0

    .line 353
    :cond_6
    invoke-direct {v14, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v12, p2

    invoke-static {v14, v12}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v8, Ll/ܺ֨ۘ;->᩸ᩳ᩶:[S

    .line 154
    sget v13, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v13, :cond_7

    goto/16 :goto_8

    :cond_7
    const-string v13, "\u06da\u06e2"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v15, v13, v10

    mul-int/lit16 v15, v15, 0x1415

    const v16, -0x18e49616

    xor-int v15, v15, v16

    const v16, 0x274f2a28

    goto/16 :goto_a

    :sswitch_9
    move-object/from16 v12, p2

    const v7, 0xb01a

    goto :goto_6

    :sswitch_a
    move-object/from16 v12, p2

    const/16 v7, 0x453f

    :goto_6
    const-string v13, "\u06e2\u06e2"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v15, v13, v10

    mul-int/lit16 v15, v15, -0x3fd9

    const v16, -0x55a1db77

    xor-int v15, v15, v16

    const v16, -0x38f2faf6

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v12, p2

    add-int v13, v3, v6

    mul-int v13, v13, v13

    sub-int v13, v5, v13

    if-gez v13, :cond_8

    const-string v13, "\u06dc\u06eb"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    mul-int/lit8 v13, v13, -0x7d

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, 0x4957

    const v16, -0x1e77cd03

    xor-int v15, v15, v16

    const v16, 0x2c55c4f6

    goto/16 :goto_a

    :cond_8
    const-string v13, "\u06e1\u1a74"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v15, v13, v10

    mul-int/lit16 v15, v15, 0x20ab

    const v16, -0x688241b1

    xor-int v15, v15, v16

    const v16, 0x44982e57

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v12, p2

    const/16 v6, 0x2f23

    sget-boolean v13, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v13, :cond_9

    :goto_7
    const-string v13, "\u06d8\u073f"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v15, v13, v10

    mul-int/lit16 v15, v15, 0x3cb3

    const v16, 0x76fe6215

    xor-int v15, v15, v16

    const v16, 0x23758895

    goto/16 :goto_a

    :cond_9
    const-string v13, "\u05a8\u06eb"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, -0x7411

    const v16, 0x25dbd2dc

    xor-int v15, v15, v16

    const v16, -0x58463a04

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v12, p2

    const v5, 0x8addec9

    add-int/2addr v5, v4

    add-int/2addr v5, v5

    sget-boolean v13, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v13, :cond_a

    goto :goto_8

    :cond_a
    const-string v13, "\u06e7\u06d9"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x5

    xor-int v15, v13, v10

    mul-int/lit16 v15, v15, 0x6531

    const v16, 0x7af791d6

    xor-int v15, v15, v16

    const v16, -0x1c56d670

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v12, p2

    const/4 v3, 0x0

    aget-short v3, v2, v3

    mul-int v4, v3, v3

    .line 342
    sget v13, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v13, :cond_b

    :goto_8
    const-string v13, "\u073d\u06df"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v10, v13

    mul-int/lit8 v13, v13, 0x43

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, -0x53ed

    const v16, -0x811ebdd

    xor-int v15, v15, v16

    const v16, 0x12458451

    goto :goto_a

    :cond_b
    const-string v13, "\u1a77\u06d9"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, 0x35fb

    const v16, -0x1c19a90    # -6.3270003E37f

    xor-int v15, v15, v16

    const v16, 0x2cf437a6

    goto :goto_a

    :cond_c
    const-string v13, "\u1a75\u06db"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x6d

    xor-int v15, v13, v10

    mul-int/lit16 v15, v15, -0x18e5

    const v16, 0x32593a4

    xor-int v15, v15, v16

    const v16, -0x6bb8dad1

    goto :goto_a

    :sswitch_f
    move-object/from16 v12, p2

    .line 154
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v13

    if-eqz v13, :cond_d

    :goto_9
    const-string v13, "\u1a76\u06df"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    mul-int/lit8 v13, v13, -0xd

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, -0x4fe1

    const v16, 0x29626ac7

    xor-int v15, v15, v16

    const v16, -0x6811ffc5

    goto :goto_a

    :cond_d
    const-string v13, "\u1a76\u1a79"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v10

    mul-int/lit8 v13, v13, 0x15

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, -0x6b8b

    const v16, -0x5e148fe9

    xor-int v15, v15, v16

    const v16, 0x769947b5

    :goto_a
    xor-int v13, v13, v16

    move v12, v13

    move v13, v15

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x77c7490d -> :sswitch_3
        -0x75e5d671 -> :sswitch_2
        -0x757f0dcd -> :sswitch_5
        -0x73adbc93 -> :sswitch_6
        -0x727418d3 -> :sswitch_f
        -0x6bd6cad5 -> :sswitch_a
        -0x69e0d816 -> :sswitch_a
        -0x67aee144 -> :sswitch_f
        -0x591bdc83 -> :sswitch_9
        -0x4e85a5ce -> :sswitch_1
        -0x4afda9ca -> :sswitch_2
        -0x48655dbc -> :sswitch_e
        -0x23171e64 -> :sswitch_9
        -0x1d1d4740 -> :sswitch_c
        -0x10f09413 -> :sswitch_0
        -0xf23a19f -> :sswitch_c
        -0xc3b58c3 -> :sswitch_1
        -0x801fa51 -> :sswitch_7
        -0x6e619ce -> :sswitch_d
        -0x35f1020 -> :sswitch_7
        0x17bc2d85 -> :sswitch_8
        0x1bd141b3 -> :sswitch_b
        0x1c403247 -> :sswitch_0
        0x263e6f1f -> :sswitch_5
        0x27057df7 -> :sswitch_4
        0x2daeea2e -> :sswitch_3
        0x3df126f9 -> :sswitch_4
        0x450a2c0f -> :sswitch_e
        0x5233f47b -> :sswitch_d
        0x5c29b30e -> :sswitch_6
        0x5ce25283 -> :sswitch_8
        0x72579969 -> :sswitch_b
    .end sparse-switch
.end method

.class public final Ll/ۚۗۨ;
.super Ljava/lang/Object;
.source "U7HQ"

# interfaces
.implements Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;


# static fields
.field private static final ᩶ۛܳ:[S


# instance fields
.field public ֨:I

.field public ۖ:I

.field public final ۘ:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

.field public ۙ:I

.field public ۚ:I

.field public ۜ:J

.field public ۨ:I

.field public ۬:I

.field public ܰ:I

.field public final ᩹:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۚۗۨ;->᩶ۛܳ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1c9ds
        0x289bs
    .end array-data
.end method

.method public constructor <init>(Ll/᩹ۗۨ;ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;)V
    .locals 6

    const/4 p1, 0x0

    const v0, 0x3bdc8e38

    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e4\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7393

    const v5, -0x3a3dcbc9

    xor-int/2addr v4, v5

    const v5, -0x132d86ee

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x17b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 142
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_7

    goto/16 :goto_4

    .line 70
    :sswitch_0
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_4

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_9

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_b

    goto/16 :goto_3

    .line 131
    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    goto/16 :goto_3

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 177
    :sswitch_5
    iput p2, p0, Ll/ۚۗۨ;->᩹:I

    .line 178
    iput-object p3, p0, Ll/ۚۗۨ;->ۘ:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    return-void

    .line 172
    :sswitch_6
    iput p1, p0, Ll/ۚۗۨ;->ۙ:I

    .line 88
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u1a7a\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1fbf

    const v5, 0x300e3c44

    xor-int/2addr v4, v5

    const v5, 0x17c15a0a

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v3

    if-gtz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06ec\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1b77

    const v5, 0x36fa591d

    xor-int/2addr v4, v5

    const v5, -0x468a96e3

    goto :goto_0

    .line 138
    :sswitch_8
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a7a\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7749

    const v5, 0x66058474

    xor-int/2addr v4, v5

    const v5, -0x46097b5c

    goto/16 :goto_0

    .line 8
    :sswitch_9
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v3

    if-gtz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u073d\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x514f

    const v5, -0x17145144

    xor-int/2addr v4, v5

    const v5, 0xd30efb2

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u0733\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5dbd

    const v5, 0x5574f1b4

    xor-int/2addr v4, v5

    const v5, 0xcf7ba51

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u05a8\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x691f

    const v5, -0x6b7a1b6e

    xor-int/2addr v4, v5

    const v5, 0x51a68cae

    goto/16 :goto_0

    .line 94
    :sswitch_b
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_6

    :goto_2
    const-string v3, "\u06d9\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7281

    const v5, -0x7aee8f2a

    xor-int/2addr v4, v5

    const v5, 0x31e81ae9

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06ec\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1ee1

    const v5, 0x7289ba4c

    xor-int/2addr v4, v5

    const v5, 0x67e7caa2

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e7\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1c9d

    const v5, -0x2f06c98b

    xor-int/2addr v4, v5

    const v5, -0x3dec02c2

    goto/16 :goto_0

    .line 109
    :sswitch_c
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_8

    :goto_3
    const-string v3, "\u06e4\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x58f3

    const v5, -0x81ac031

    xor-int/2addr v4, v5

    const v5, 0x14ae2ee2

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0730\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xf87

    const v5, -0x1dc86375

    xor-int/2addr v4, v5

    const v5, -0x1a2cff11

    goto/16 :goto_0

    .line 150
    :sswitch_d
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u1a74\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x64db

    const v5, 0x45a7c781

    xor-int/2addr v4, v5

    const v5, -0x76ed0755

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e0\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xc71

    const v5, -0x1efd2af6

    xor-int/2addr v4, v5

    const v5, -0xee86bff

    goto/16 :goto_0

    :sswitch_e
    const/4 p1, -0x1

    .line 170
    iput p1, p0, Ll/ۚۗۨ;->ۨ:I

    .line 151
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u0736\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2cd3

    const v5, -0x5c016754

    xor-int/2addr v4, v5

    const v5, 0xbc3a405

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d8\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x76f3

    const v5, -0x792353ad

    xor-int/2addr v4, v5

    const v5, 0x58ec6ed6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7eae0d93 -> :sswitch_c
        -0x7e1c4f0f -> :sswitch_9
        -0x7b69cdc9 -> :sswitch_2
        -0x7622ef9f -> :sswitch_5
        -0x75874f46 -> :sswitch_3
        -0x6c526cf3 -> :sswitch_8
        -0x6034003f -> :sswitch_a
        -0x51508fb0 -> :sswitch_d
        -0x4daa6422 -> :sswitch_b
        -0x42c1b5e9 -> :sswitch_5
        -0x28a02644 -> :sswitch_9
        -0x2062bb00 -> :sswitch_6
        -0x4c6a9db -> :sswitch_d
        0xa754796 -> :sswitch_4
        0x112a5f39 -> :sswitch_7
        0x1a206968 -> :sswitch_7
        0x1b088eb4 -> :sswitch_1
        0x1d996e69 -> :sswitch_6
        0x2fe9245e -> :sswitch_e
        0x302098a8 -> :sswitch_c
        0x3bad27a0 -> :sswitch_a
        0x41ae7bf9 -> :sswitch_0
        0x4200c5d8 -> :sswitch_4
        0x434d1092 -> :sswitch_3
        0x4a6203ae -> :sswitch_e
        0x5e3a36f9 -> :sswitch_2
        0x5e4bda12 -> :sswitch_0
        0x75b5a392 -> :sswitch_b
        0x7cb1e663 -> :sswitch_1
        0x7d76b210 -> :sswitch_8
    .end sparse-switch
.end method

.method private ۙ(CI)I
    .locals 19

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

    const v11, 0x1602453e

    sget v12, Ll/ۖۗ;->᩶۫ۗ:I

    sget v13, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v14, "\u06df\u06da"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x6875

    const v16, 0x4712fc2f

    xor-int v15, v15, v16

    const v16, -0x4f55ff10

    xor-int v14, v14, v16

    :goto_0
    const/4 v0, 0x0

    :goto_1
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x7c17

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move-object/from16 v14, p0

    move-object/from16 v17, v0

    const/4 v8, 0x1

    sget v0, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v0, :cond_8

    :goto_2
    move-object/from16 v0, v17

    goto/16 :goto_9

    :sswitch_0
    sget v14, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v14, :cond_1

    :cond_0
    :goto_3
    move-object/from16 v14, p0

    goto/16 :goto_8

    :cond_1
    move-object/from16 v14, p0

    goto/16 :goto_9

    :sswitch_1
    sget v14, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v14, :cond_2

    goto :goto_3

    :cond_2
    const-string v14, "\u06e7\u073a"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x7d

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x483b

    const v17, 0x542eb48e

    xor-int v15, v15, v17

    const v17, 0x36febf6a

    xor-int v14, v14, v17

    goto :goto_1

    .line 71
    :sswitch_2
    sget-boolean v14, Ll/᩶;->ۚۤۘ:Z

    if-nez v14, :cond_0

    :goto_4
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    goto/16 :goto_a

    .line 155
    :sswitch_3
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    goto :goto_4

    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    const/4 v0, 0x0

    return v0

    .line 189
    :sswitch_5
    invoke-interface {v3, v2}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 191
    :sswitch_6
    invoke-static {v2}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v0

    return v0

    .line 0
    :sswitch_7
    invoke-static {v1, v0, v1}, Ll/ܽ۠ᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v14, p0

    .line 188
    iget-object v3, v14, Ll/ۚۗۨ;->ۘ:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    if-eqz v3, :cond_3

    const-string v15, "\u0736\u06db"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    mul-int/lit8 v15, v15, 0x77

    move-object/from16 v17, v0

    xor-int v0, v15, v12

    mul-int/lit16 v0, v0, 0x304d

    const v18, 0x77f35d97

    xor-int v0, v0, v18

    const v18, 0x1c81543b

    goto/16 :goto_5

    :cond_3
    move-object/from16 v17, v0

    const-string v0, "\u073f\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x39

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x1907

    const v18, 0x777e2792

    xor-int v15, v15, v18

    const v18, -0x15750eb4

    goto/16 :goto_b

    :sswitch_8
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 204
    invoke-static {v10, v0, v1, v9}, Ll/֡۠;->֨ۛ֨([SIII)Ljava/lang/String;

    move-result-object v1

    .line 181
    sget-boolean v0, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v0, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v0, "\u073a\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x7f

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x1b5

    const v18, 0x647b38a0

    xor-int v15, v15, v18

    const v18, -0x44c224cf

    goto/16 :goto_b

    :sswitch_9
    move-object/from16 v14, p0

    move/from16 v0, p2

    .line 202
    new-array v15, v0, [C

    move/from16 v0, p1

    .line 203
    invoke-static {v15, v0}, Ljava/util/Arrays;->fill([CC)V

    .line 204
    new-instance v0, Ljava/lang/String;

    .line 137
    sget-boolean v17, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v17, :cond_5

    goto/16 :goto_8

    .line 204
    :cond_5
    invoke-direct {v0, v15}, Ljava/lang/String;-><init>([C)V

    sget-object v10, Ll/ۚۗۨ;->᩶ۛܳ:[S

    sget v15, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v15, :cond_6

    goto/16 :goto_9

    :cond_6
    const-string v15, "\u1a76\u073f"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    mul-int/lit8 v15, v15, -0x7

    move-object/from16 v17, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x7103

    const v18, 0x359c4e9d

    xor-int v0, v0, v18

    const v18, -0x56bdb0f

    :goto_5
    xor-int v15, v15, v18

    move v14, v15

    move v15, v0

    goto/16 :goto_c

    :sswitch_a
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    const v0, 0x89b2

    const v9, 0x89b2

    goto :goto_6

    :sswitch_b
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    const/16 v0, 0x2891

    const/16 v9, 0x2891

    :goto_6
    const-string v0, "\u073d\u0733"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, 0x4f

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x2a11

    const v18, 0x7120e45

    xor-int v15, v15, v18

    const v18, 0x1122e221

    goto/16 :goto_b

    :sswitch_c
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    add-int v0, v5, v8

    mul-int v0, v0, v0

    sub-int/2addr v0, v7

    if-ltz v0, :cond_7

    const-string v0, "\u06db\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x65a9

    const v18, -0x35e51647

    xor-int v15, v15, v18

    const v18, -0x307d1a2c

    goto/16 :goto_b

    :cond_7
    const-string v0, "\u06e1\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x3f11

    const v18, 0x7a4cf0d5

    xor-int v15, v15, v18

    const v18, -0xf94f832

    goto/16 :goto_b

    :cond_8
    const-string v0, "\u06e0\u06ec"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x49

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x5bdd

    const v18, -0x26745676

    xor-int v15, v15, v18

    const v18, 0x79979c0f

    goto/16 :goto_b

    :sswitch_d
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    mul-int v0, v5, v6

    add-int/lit8 v7, v0, 0x1

    .line 174
    sget-boolean v0, Ll/᩶;->ۚۤۘ:Z

    if-eqz v0, :cond_9

    goto/16 :goto_a

    :cond_9
    const-string v0, "\u05a1\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, 0x39

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x945

    const v18, -0x311fc8c4

    xor-int v15, v15, v18

    const v18, -0x407fc2cc

    goto/16 :goto_b

    :sswitch_e
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    const/4 v0, 0x0

    aget-short v5, v4, v0

    const/4 v6, 0x2

    sget v0, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v0, :cond_a

    :goto_7
    const-string v0, "\u06e2\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x59

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x67f3

    const v18, -0x44cf1586

    xor-int v15, v15, v18

    const v18, 0x36714022

    goto/16 :goto_b

    :cond_a
    const-string v0, "\u05a8\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x61

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x7d41

    const v18, 0x58626399

    xor-int v15, v15, v18

    const v18, 0x599bba89

    goto/16 :goto_b

    :sswitch_f
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    sget-object v4, Ll/ۚۗۨ;->᩶ۛܳ:[S

    .line 119
    sget-boolean v0, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v0, :cond_b

    :goto_8
    const-string v0, "\u06e8\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x72cf

    const v17, -0x1112372b

    xor-int v15, v15, v17

    const v17, -0x560f8843

    xor-int v0, v0, v17

    move v14, v0

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u1a73\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x47

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x57f3

    const v18, 0xe55406

    xor-int v15, v15, v18

    const v18, 0x2aedae44

    goto/16 :goto_b

    :sswitch_10
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    sget-boolean v0, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v0, :cond_c

    goto :goto_a

    :cond_c
    const-string v0, "\u06dc\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x3b

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x1ef

    const v18, 0x18821897

    xor-int v15, v15, v18

    const v18, -0x313f5c0f

    goto :goto_b

    :sswitch_11
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    .line 180
    sget-boolean v0, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v0, :cond_d

    goto/16 :goto_2

    :goto_9
    const-string v15, "\u1a75\u0736"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v12, v15

    mul-int/lit8 v15, v15, 0x7

    move-object/from16 v17, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x7ed9

    const v18, -0x66f79cd6

    xor-int v0, v0, v18

    const v18, 0x43395e1e

    goto/16 :goto_5

    :cond_d
    const-string v0, "\u0730\u1a7b"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x224b

    const v18, -0x477686d0

    xor-int v15, v15, v18

    const v18, -0x5c2fb191

    goto :goto_b

    :sswitch_12
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    sget v0, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v0, :cond_e

    :goto_a
    const-string v0, "\u06db\u06e0"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, 0x75

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x4aeb

    const v18, 0x542f098c

    xor-int v15, v15, v18

    const v18, -0x5d30490b

    goto :goto_b

    :cond_e
    const-string v0, "\u1a7b\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x425

    const v18, 0x5d7f526d

    xor-int v15, v15, v18

    const v18, 0x120847b8

    :goto_b
    xor-int v0, v0, v18

    move v14, v0

    :goto_c
    move-object/from16 v0, v17

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x73c00cdf -> :sswitch_d
        -0x5579306a -> :sswitch_2
        -0x51c5d82b -> :sswitch_5
        -0x4d624917 -> :sswitch_3
        -0x4b7850e7 -> :sswitch_3
        -0x41584bbd -> :sswitch_10
        -0x3c7f7395 -> :sswitch_1
        -0x3ba2a9c7 -> :sswitch_6
        -0x374c1571 -> :sswitch_5
        -0x36e80a96 -> :sswitch_b
        -0x2d97a673 -> :sswitch_11
        -0x202470c6 -> :sswitch_11
        -0x168ef31b -> :sswitch_0
        -0x12e32777 -> :sswitch_a
        -0x98292de -> :sswitch_c
        -0x60b47a8 -> :sswitch_e
        -0x3d1b61d -> :sswitch_9
        0x199c47c -> :sswitch_1
        0x3bf0aa9 -> :sswitch_8
        0xdb7f489 -> :sswitch_e
        0xfe16f7f -> :sswitch_b
        0x1f1fd3d6 -> :sswitch_7
        0x1f26a4fc -> :sswitch_c
        0x251a6ff9 -> :sswitch_2
        0x25473bc2 -> :sswitch_7
        0x2a0960f4 -> :sswitch_a
        0x2b129d38 -> :sswitch_0
        0x3cda33db -> :sswitch_6
        0x47c93747 -> :sswitch_8
        0x4e304467 -> :sswitch_4
        0x4f7c4bd6 -> :sswitch_9
        0x54b9a00c -> :sswitch_4
        0x55bbc304 -> :sswitch_12
        0x662582ef -> :sswitch_f
        0x6afbe53f -> :sswitch_d
        0x6b373d8f -> :sswitch_f
        0x70c98a44 -> :sswitch_12
        0x7a1c202c -> :sswitch_10
    .end sparse-switch
.end method


# virtual methods
.method public final reset()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x54e875e

    sget v3, Ll/֡֡;->᩶ۤ۠:I

    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v5, "\u06db\u073f"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2219

    const v7, -0x49325412

    xor-int/2addr v6, v7

    const v7, 0x79acf24f

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x24b7

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 212
    iput v0, p0, Ll/ۚۗۨ;->۬:I

    .line 213
    iput v0, p0, Ll/ۚۗۨ;->֨:I

    .line 60
    sget v5, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v5, :cond_2

    goto/16 :goto_1

    .line 49
    :sswitch_0
    sget-boolean v5, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz v5, :cond_b

    goto/16 :goto_2

    .line 26
    :sswitch_1
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    sget-boolean v5, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v5, :cond_8

    goto/16 :goto_2

    .line 113
    :sswitch_2
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget v5, Ll/֨᩹;->᩻ᩳ֨:I

    if-lez v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u1a7a\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x28cb

    const v7, -0x473f2773

    xor-int/2addr v6, v7

    const v7, -0x4bb5fa62

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    goto/16 :goto_2

    .line 146
    :sswitch_4
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    return-void

    .line 214
    :sswitch_5
    iput v1, p0, Ll/ۚۗۨ;->ۨ:I

    .line 215
    iput v1, p0, Ll/ۚۗۨ;->ۙ:I

    return-void

    :sswitch_6
    const/4 v1, -0x1

    .line 59
    sget-boolean v5, Ll/᩶;->ۚۤۘ:Z

    if-eqz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u073f\u06e2"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4e43

    const v7, 0x4ca02e99    # 8.398151E7f

    xor-int/2addr v6, v7

    const v7, 0x5c5bd1c

    goto :goto_0

    :cond_2
    const-string v5, "\u1a7b\u073d"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2695

    const v7, 0x12518046

    xor-int/2addr v6, v7

    const v7, 0x3e080357

    goto/16 :goto_0

    :sswitch_7
    const-wide/16 v5, 0x0

    .line 211
    iput-wide v5, p0, Ll/ۚۗۨ;->ۜ:J

    .line 49
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v5

    if-eqz v5, :cond_3

    :goto_1
    const-string v5, "\u06e1\u06d6"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4265

    const v7, 0x408b2c1b

    xor-int/2addr v6, v7

    const v7, 0x6dd06fec

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u073d\u06e4"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x74dd

    const v7, 0x5bbf5ad4

    xor-int/2addr v6, v7

    const v7, -0x108c25cf

    goto/16 :goto_0

    .line 210
    :sswitch_8
    iput v0, p0, Ll/ۚۗۨ;->ۚ:I

    .line 165
    sget v5, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u06ec\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6753

    const v7, -0x14c20838

    xor-int/2addr v6, v7

    const v7, -0x220d121f

    goto/16 :goto_0

    .line 188
    :sswitch_9
    sget-boolean v5, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v5, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v5, "\u073d\u06d7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2a09

    const v7, 0x4f457287

    xor-int/2addr v6, v7

    const v7, 0x6866f624

    goto/16 :goto_0

    .line 59
    :sswitch_a
    sget v5, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v5, :cond_6

    goto :goto_2

    :cond_6
    const-string v5, "\u073d\u1a74"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x35

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4673

    const v7, -0x675d839

    xor-int/2addr v6, v7

    const v7, -0x71722e71

    goto/16 :goto_0

    .line 84
    :sswitch_b
    sget v5, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v5, :cond_7

    goto :goto_2

    :cond_7
    const-string v5, "\u05a1\u06d9"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xb1b

    const v7, -0x5faa1e95

    xor-int/2addr v6, v7

    const v7, 0x50d5e215

    goto/16 :goto_0

    .line 92
    :sswitch_c
    sget v5, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v5, :cond_9

    :cond_8
    const-string v5, "\u05ab\u05ab"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xbf9

    const v7, 0xc3df188

    xor-int/2addr v6, v7

    const v7, 0x65f8bdd0

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06dc\u06e4"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3361

    const v7, 0x6419e34d

    xor-int/2addr v6, v7

    const v7, 0x4b3c5132    # 1.2341554E7f

    goto/16 :goto_0

    .line 30
    :sswitch_d
    sget-boolean v5, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v5, :cond_a

    :goto_2
    const-string v5, "\u05ab\u073a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x27fd

    const v7, -0x57394c4c

    xor-int/2addr v6, v7

    const v7, -0x67a68a25

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06e1\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x69

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2633

    const v7, -0xe891c5a

    xor-int/2addr v6, v7

    const v7, -0x732a5c8b

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x0

    .line 168
    sget v5, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v5, :cond_c

    :cond_b
    :goto_3
    const-string v5, "\u06e7\u1a77"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2cd7

    const v7, 0x7811a248

    xor-int/2addr v6, v7

    const v7, 0xe9b8102

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06e8\u06eb"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x50a7

    const v7, 0x2c168e0f

    xor-int/2addr v6, v7

    const v7, 0x6d0162a8

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ed6b19e -> :sswitch_0
        -0x7ccbd528 -> :sswitch_0
        -0x73cdc724 -> :sswitch_3
        -0x6e27568a -> :sswitch_7
        -0x5f463d45 -> :sswitch_1
        -0x4cb30937 -> :sswitch_4
        -0x4bd54df4 -> :sswitch_5
        -0x44212726 -> :sswitch_3
        -0x42282fbb -> :sswitch_a
        -0x420dedb0 -> :sswitch_4
        -0x20c0d7b4 -> :sswitch_c
        -0x14e75026 -> :sswitch_6
        -0x8a55b78 -> :sswitch_d
        -0x7a6297c -> :sswitch_c
        -0x54befd1 -> :sswitch_2
        0x56b3cc -> :sswitch_e
        0x7161359 -> :sswitch_b
        0xbd3fd63 -> :sswitch_2
        0x151e0a88 -> :sswitch_6
        0x3586b068 -> :sswitch_e
        0x41b7fec5 -> :sswitch_8
        0x42b1e891 -> :sswitch_1
        0x441e31be -> :sswitch_8
        0x47de4177 -> :sswitch_9
        0x49efc37c -> :sswitch_5
        0x5f2f3e3e -> :sswitch_b
        0x6515ca6b -> :sswitch_9
        0x7205f052 -> :sswitch_d
        0x7ad635e0 -> :sswitch_7
        0x7bc062b0 -> :sswitch_a
    .end sparse-switch
.end method

.method public final tryAdd(Ljava/lang/String;)Z
    .locals 48

    move-object/from16 v0, p0

    move-object/from16 v1, p1

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

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v30, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const v40, -0x3799082a

    sget v41, Ll/۟;->ۨᩴۛ:I

    sget v42, Ll/֨ܰ;->ۢ᩷۟:I

    const-string v43, "\u06ec\u1a7a"

    invoke-static/range {v43 .. v43}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v43

    xor-int v43, v43, v42

    xor-int v2, v43, v41

    mul-int/lit16 v2, v2, -0x6b47

    const v45, -0x2925622a

    xor-int v2, v2, v45

    const v45, 0x42fcd800    # 126.421875f

    xor-int v43, v43, v45

    move-object/from16 v21, v4

    move-wide/from16 v26, v25

    move-wide/from16 v33, v32

    move/from16 v44, v43

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

    const/16 v22, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const v43, -0x3799082a

    move-wide/from16 v24, v23

    move-wide/from16 v31, v30

    const/16 v23, 0x0

    move-wide/from16 v29, v28

    const/16 v28, 0x0

    :goto_0
    xor-int v1, v43, v41

    mul-int/lit16 v1, v1, 0x610f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v2

    xor-int v43, v44, v1

    sparse-switch v43, :sswitch_data_0

    move/from16 v44, v14

    add-long v1, v24, v26

    .line 271
    iput-wide v1, v0, Ll/ۚۗۨ;->ۜ:J

    .line 272
    iput v14, v0, Ll/ۚۗۨ;->۬:I

    .line 273
    iput v6, v0, Ll/ۚۗۨ;->֨:I

    return v11

    .line 251
    :sswitch_0
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_3

    :cond_0
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    goto/16 :goto_11

    .line 270
    :sswitch_1
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v1

    if-nez v1, :cond_1

    :goto_1
    move/from16 v45, v15

    goto/16 :goto_c

    :cond_1
    move/from16 v45, v15

    move/from16 v1, v19

    move-object/from16 v19, v21

    move/from16 v15, v36

    move/from16 v36, v3

    goto/16 :goto_1f

    .line 19
    :sswitch_2
    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    if-lez v1, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v45, v15

    goto/16 :goto_d

    .line 156
    :sswitch_3
    sget-boolean v1, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v1, :cond_4

    :cond_3
    move/from16 v44, v14

    move/from16 v45, v15

    goto/16 :goto_7

    :cond_4
    :goto_2
    const-string v1, "\u06d6\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x7861

    const v44, 0x1f4d83c8

    xor-int v2, v2, v44

    const v44, 0x3148dfba

    goto/16 :goto_5

    .line 99
    :sswitch_4
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    :goto_3
    const-string v1, "\u1a73\u06d8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v42, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x3f65

    const v44, -0x51d67361

    xor-int v2, v2, v44

    const v44, 0x2fa2b134

    goto/16 :goto_5

    :sswitch_5
    sget-boolean v1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-eqz v1, :cond_6

    goto :goto_1

    :cond_6
    const-string v1, "\u1a76\u1a73"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v42, v1

    mul-int/lit8 v1, v1, -0x51

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x2735

    const v44, 0x23f8f4df

    xor-int v2, v2, v44

    const v44, -0x1d95840f

    goto/16 :goto_5

    .line 2
    :sswitch_6
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v1, :cond_3

    goto :goto_1

    .line 173
    :sswitch_7
    sget v1, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v1, :cond_7

    goto/16 :goto_1

    :cond_7
    move-object/from16 v1, p1

    move v2, v6

    move v6, v15

    move v15, v3

    move/from16 v3, v23

    goto/16 :goto_12

    .line 24
    :sswitch_8
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    goto/16 :goto_1

    .line 95
    :sswitch_9
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    const/4 v1, 0x0

    return v1

    :sswitch_a
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, p1

    move/from16 v15, v36

    move/from16 v2, v37

    move/from16 v35, v38

    move/from16 v13, v39

    move/from16 v28, v40

    move/from16 v36, v3

    move/from16 v3, v23

    goto/16 :goto_15

    :sswitch_b
    add-int v1, v35, v11

    if-le v1, v15, :cond_8

    move/from16 v37, v1

    move/from16 v38, v37

    goto :goto_4

    :cond_8
    move/from16 v38, v1

    move/from16 v37, v15

    goto :goto_4

    :sswitch_c
    const/4 v1, 0x0

    move/from16 v37, v15

    const/16 v38, 0x0

    :goto_4
    const-string v1, "\u073a\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x15d7

    const v44, -0x61082ece

    xor-int v2, v2, v44

    const v44, 0x6493a193

    :goto_5
    xor-int v44, v1, v44

    goto/16 :goto_0

    .line 260
    :sswitch_d
    invoke-direct {v0, v9, v5}, Ll/ۚۗۨ;->ۙ(CI)I

    move-result v1

    iput v1, v0, Ll/ۚۗۨ;->ܰ:I

    .line 261
    iput v5, v0, Ll/ۚۗۨ;->ۙ:I

    move/from16 v44, v14

    move/from16 v45, v15

    goto/16 :goto_8

    :sswitch_e
    add-long v1, v33, v31

    move/from16 v44, v14

    move/from16 v45, v15

    int-to-long v14, v4

    cmp-long v46, v1, v14

    if-lez v46, :cond_9

    move-object/from16 v2, v21

    move/from16 v15, v36

    move/from16 v14, v44

    move/from16 v36, v3

    move/from16 v3, v19

    goto/16 :goto_1c

    :cond_9
    move-object/from16 v1, p1

    move/from16 v15, v36

    move/from16 v14, v44

    goto/16 :goto_10

    :sswitch_f
    move/from16 v44, v14

    move/from16 v45, v15

    .line 264
    iget v1, v0, Ll/ۚۗۨ;->ۚ:I

    int-to-long v1, v1

    mul-long v33, v1, v29

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v1

    if-gtz v1, :cond_a

    goto :goto_6

    :cond_a
    const-string v1, "\u06e4\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x615b

    const v14, 0x53c0ea0e

    xor-int/2addr v2, v14

    const v14, -0x25eacbc

    goto/16 :goto_b

    :sswitch_10
    move/from16 v44, v14

    move/from16 v45, v15

    iget-wide v1, v0, Ll/ۚۗۨ;->ۜ:J

    int-to-long v14, v8

    add-long v31, v1, v14

    .line 118
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v1

    if-eqz v1, :cond_b

    :goto_6
    move-object/from16 v1, p1

    move/from16 v15, v36

    move/from16 v14, v44

    move/from16 v36, v3

    move/from16 v3, v23

    goto/16 :goto_17

    :cond_b
    const-string v1, "\u06e7\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, -0x17

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x5aab

    const v14, -0x2292e30a

    xor-int/2addr v2, v14

    const v14, 0x3d2e587a

    goto/16 :goto_b

    :sswitch_11
    move/from16 v44, v14

    move/from16 v45, v15

    .line 263
    iget v1, v0, Ll/ۚۗۨ;->ۖ:I

    iget v2, v0, Ll/ۚۗۨ;->ܰ:I

    invoke-static {v1, v2}, Ll/֨֫;->ܺܰ۬(II)I

    move-result v1

    int-to-long v1, v1

    .line 221
    sget v14, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v14, :cond_c

    move-wide/from16 v29, v1

    :goto_7
    const-string v1, "\u06df\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x33

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x5075

    const v14, 0x39ce11cf

    xor-int/2addr v2, v14

    const v14, -0x50285d8d

    goto/16 :goto_b

    :cond_c
    const-string v14, "\u06e0\u06db"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int v14, v14, v41

    xor-int v15, v14, v42

    mul-int/lit16 v15, v15, -0x33cf

    const v29, -0x3883b32c

    xor-int v15, v15, v29

    const v29, -0x1c9d7069

    xor-int v14, v14, v29

    move-wide/from16 v29, v1

    move v2, v15

    move/from16 v15, v45

    move/from16 v47, v44

    move/from16 v44, v14

    move/from16 v14, v47

    goto/16 :goto_0

    :sswitch_12
    move/from16 v44, v14

    move/from16 v45, v15

    if-ne v7, v9, :cond_d

    const-string v1, "\u073f\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x35ad

    const v14, -0x3f6f1696

    xor-int/2addr v2, v14

    const v14, 0x76fb1786

    goto/16 :goto_b

    :cond_d
    const-string v1, "\u06db\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v41

    mul-int/lit8 v1, v1, -0xb

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, -0x6a49

    const v14, 0xd6a4be2

    xor-int/2addr v2, v14

    const v14, 0x7985ed60

    goto/16 :goto_b

    :sswitch_13
    move/from16 v44, v14

    move/from16 v45, v15

    .line 256
    invoke-direct {v0, v10, v3}, Ll/ۚۗۨ;->ۙ(CI)I

    move-result v1

    iput v1, v0, Ll/ۚۗۨ;->ۖ:I

    .line 257
    iput v3, v0, Ll/ۚۗۨ;->ۨ:I

    goto/16 :goto_a

    :sswitch_14
    move/from16 v44, v14

    move/from16 v45, v15

    .line 259
    iget v1, v0, Ll/ۚۗۨ;->ۙ:I

    if-eq v5, v1, :cond_e

    const-string v1, "\u06dc\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x2c5

    const v14, 0x4bb7d170    # 2.4093408E7f

    xor-int/2addr v2, v14

    const v14, -0x2605e7f

    goto/16 :goto_b

    :cond_e
    :goto_8
    const-string v1, "\u073f\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x1f27

    const v14, 0x682175f0

    xor-int/2addr v2, v14

    const v14, 0x2640601f

    goto :goto_b

    :sswitch_15
    move/from16 v44, v14

    move/from16 v45, v15

    add-int v1, v28, v11

    if-le v1, v13, :cond_f

    move/from16 v39, v1

    move/from16 v40, v39

    goto :goto_9

    :cond_f
    move/from16 v40, v1

    move/from16 v39, v13

    goto :goto_9

    :sswitch_16
    move/from16 v44, v14

    move/from16 v45, v15

    const/4 v1, 0x0

    move/from16 v39, v13

    const/16 v40, 0x0

    :goto_9
    const-string v1, "\u073a\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    mul-int/lit8 v1, v1, -0x77

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x5237

    const v14, 0x6bacd6a9

    xor-int/2addr v2, v14

    const v14, 0x5fe5bdc1    # 3.31092E19f

    goto :goto_b

    :sswitch_17
    move/from16 v44, v14

    move/from16 v45, v15

    .line 255
    iget v1, v0, Ll/ۚۗۨ;->ۨ:I

    if-eq v3, v1, :cond_10

    const-string v1, "\u06dc\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x7811

    const v14, 0x4433bcd6

    xor-int/2addr v2, v14

    const v14, -0x759e9cde    # -1.0852001E-32f

    goto :goto_b

    :cond_10
    :goto_a
    const-string v1, "\u06e2\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x15

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x2329

    const v14, 0x1a256888

    xor-int/2addr v2, v14

    const v14, 0x2d4b0fb3    # 1.15427E-11f

    :goto_b
    xor-int/2addr v1, v14

    move/from16 v14, v44

    move/from16 v15, v45

    move/from16 v44, v1

    goto/16 :goto_0

    :sswitch_18
    move/from16 v45, v15

    .line 271
    iget-wide v1, v0, Ll/ۚۗۨ;->ۜ:J

    move-wide/from16 v24, v1

    int-to-long v1, v8

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v15

    if-eqz v15, :cond_11

    move-wide/from16 v26, v1

    :goto_c
    const-string v1, "\u06db\u06eb"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v42

    mul-int/lit8 v1, v1, 0x53

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x4c67

    const v15, 0x5ace9ed0

    xor-int/2addr v2, v15

    const v15, 0x4c0e6ec

    goto :goto_e

    :cond_11
    const-string v15, "\u06d9\u06d7"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int v15, v15, v41

    mul-int/lit8 v15, v15, 0xb

    move-wide/from16 v26, v1

    xor-int v1, v15, v42

    mul-int/lit16 v1, v1, -0x5ee1

    const v2, -0x14e1ca63

    xor-int/2addr v2, v1

    const v1, 0x6a7cec60

    xor-int v44, v15, v1

    goto/16 :goto_22

    :sswitch_19
    move/from16 v45, v15

    .line 270
    iget v1, v0, Ll/ۚۗۨ;->ۚ:I

    add-int/2addr v1, v11

    iput v1, v0, Ll/ۚۗۨ;->ۚ:I

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v1

    if-gtz v1, :cond_12

    :goto_d
    const-string v1, "\u1a77\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    mul-int/lit8 v1, v1, -0x27

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x377f

    const v15, 0x26d2155

    xor-int/2addr v2, v15

    const v15, 0x4314465e

    goto :goto_e

    :cond_12
    const-string v1, "\u06dc\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x3227

    const v15, 0x59272b8a

    xor-int/2addr v2, v15

    const v15, 0xbbda3ca

    :goto_e
    xor-int v44, v1, v15

    goto/16 :goto_22

    :sswitch_1a
    move-object/from16 v1, p1

    move/from16 v45, v15

    .line 230
    invoke-static {v1, v12}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v7

    if-ne v7, v10, :cond_13

    const-string v2, "\u06e4\u1a78"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    xor-int v15, v2, v41

    mul-int/lit16 v15, v15, 0x5697

    const v44, -0x22e92086

    xor-int v15, v15, v44

    const v44, -0x282f4b04

    goto :goto_f

    :cond_13
    const-string v2, "\u06e7\u06e2"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    mul-int/lit8 v2, v2, 0x3b

    xor-int v15, v2, v42

    mul-int/lit16 v15, v15, -0x1f1b

    const v44, -0x788c1568

    xor-int v15, v15, v44

    const v44, 0x6bb20593

    :goto_f
    xor-int v44, v2, v44

    move v2, v15

    goto/16 :goto_22

    :sswitch_1b
    move-object/from16 v1, p1

    move/from16 v45, v15

    add-int v2, v6, v20

    move/from16 v15, v36

    .line 252
    invoke-static {v15, v2}, Ll/֨ۢ;->᩹᩸֫(II)I

    move-result v5

    .line 254
    iget v4, v0, Ll/ۚۗۨ;->᩹:I

    if-lez v4, :cond_14

    const-string v2, "\u1a73\u1a73"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    mul-int/lit8 v2, v2, 0x7f

    move/from16 v36, v3

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, -0x6de1

    const v44, -0x59fa3ff8

    xor-int v3, v3, v44

    const v44, 0x71ac0726

    goto/16 :goto_18

    :cond_14
    :goto_10
    move/from16 v36, v3

    const-string v2, "\u1a7b\u06d9"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, 0x16f9

    const v44, -0x21686230

    xor-int v3, v3, v44

    const v44, 0x37c72bc6

    goto/16 :goto_18

    :sswitch_1c
    move-object/from16 v1, p1

    move/from16 v45, v15

    const/16 v2, 0x8

    move/from16 v3, v23

    .line 251
    invoke-static {v2, v3}, Ll/֨֫;->ܺܰ۬(II)I

    move-result v15

    const/16 v20, 0x1

    .line 52
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v23

    if-ltz v23, :cond_15

    move v2, v6

    move/from16 v6, v45

    const/16 v36, 0x8

    goto/16 :goto_12

    :cond_15
    const-string v23, "\u1a76\u05a1"

    invoke-static/range {v23 .. v23}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v41

    xor-int v2, v23, v42

    mul-int/lit16 v2, v2, -0x2be1

    const v44, 0x303d0afe

    xor-int v2, v2, v44

    const v44, -0x513a9f25

    xor-int v44, v23, v44

    move/from16 v23, v3

    move v3, v15

    move/from16 v15, v45

    const/16 v36, 0x8

    goto/16 :goto_0

    :sswitch_1d
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    add-int/lit8 v23, v14, 0x1

    .line 39
    sget v2, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v2, :cond_16

    :goto_11
    const-string v2, "\u06e4\u06e4"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    mul-int/lit8 v2, v2, 0x5b

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, -0x481

    const v44, -0x484e6187

    xor-int v3, v3, v44

    const v44, -0x9389da4

    goto/16 :goto_18

    :cond_16
    const-string v2, "\u06ec\u0730"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, -0x5057

    const v44, 0x2b5f8893

    xor-int v3, v3, v44

    const v44, 0x7e3ca91c

    goto/16 :goto_18

    :sswitch_1e
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    move/from16 v3, v23

    .line 249
    iget v2, v0, Ll/ۚۗۨ;->۬:I

    invoke-static {v2, v13}, Ll/֨֫;->ܺܰ۬(II)I

    move-result v14

    .line 250
    iget v2, v0, Ll/ۚۗۨ;->֨:I

    move/from16 v6, v45

    invoke-static {v2, v6}, Ll/֨֫;->ܺܰ۬(II)I

    move-result v2

    sget-boolean v23, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v23, :cond_17

    move/from16 v47, v36

    move/from16 v36, v15

    move/from16 v15, v47

    :goto_12
    const-string v23, "\u073d\u06d8"

    invoke-static/range {v23 .. v23}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v41

    move/from16 v44, v2

    xor-int v2, v23, v42

    mul-int/lit16 v2, v2, -0x1c7d

    const v45, -0x3e44429a

    xor-int v2, v2, v45

    const v45, 0x59491c59

    xor-int v23, v23, v45

    move/from16 v47, v23

    move/from16 v23, v3

    move v3, v15

    goto :goto_13

    :cond_17
    const-string v23, "\u06dc\u0733"

    invoke-static/range {v23 .. v23}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v23

    sub-int v23, v42, v23

    mul-int/lit8 v23, v23, 0x1d

    move/from16 v44, v2

    xor-int v2, v23, v41

    mul-int/lit16 v2, v2, -0x7565

    const v45, -0x11551e36

    xor-int v2, v2, v45

    const v45, 0x29a63c43

    xor-int v23, v23, v45

    move/from16 v47, v23

    move/from16 v23, v3

    move/from16 v3, v36

    move/from16 v36, v15

    :goto_13
    move v15, v6

    move/from16 v6, v44

    goto/16 :goto_16

    :sswitch_1f
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    move/from16 v3, v23

    .line 229
    invoke-static/range {p1 .. p1}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v2

    const/16 v10, 0x3d

    const/4 v11, 0x1

    if-ge v12, v2, :cond_18

    const-string v2, "\u0736\u06d7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    mul-int/lit8 v2, v2, -0x19

    xor-int v9, v2, v42

    mul-int/lit16 v9, v9, 0x7f91

    const v44, 0x1f642042

    xor-int v9, v9, v44

    const v44, -0x14dacad9

    goto :goto_14

    :cond_18
    const-string v2, "\u1a73\u05a8"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    xor-int v9, v2, v42

    mul-int/lit16 v9, v9, 0x441b

    const v44, -0x16bec6b1

    xor-int v9, v9, v44

    const v44, 0x238cbe7a

    :goto_14
    xor-int v44, v2, v44

    move/from16 v23, v3

    move v2, v9

    move/from16 v3, v36

    const/16 v9, 0x2d

    goto/16 :goto_21

    :sswitch_20
    move-object/from16 v1, p1

    move/from16 v15, v36

    move/from16 v36, v3

    move/from16 v3, v23

    const/4 v2, 0x0

    const/4 v12, 0x0

    move/from16 v12, v16

    move/from16 v13, v17

    move/from16 v2, v18

    const/16 v28, 0x0

    const/16 v35, 0x0

    :goto_15
    const-string v23, "\u0736\u1a75"

    invoke-static/range {v23 .. v23}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v41

    move/from16 v44, v2

    xor-int v2, v23, v42

    mul-int/lit16 v2, v2, 0x7e89

    const v45, 0xe2723b0

    xor-int v2, v2, v45

    const v45, -0x3bb7c0c5

    xor-int v23, v23, v45

    move/from16 v47, v23

    move/from16 v23, v3

    move/from16 v3, v36

    move/from16 v36, v15

    move/from16 v15, v44

    :goto_16
    move/from16 v44, v47

    goto/16 :goto_0

    :sswitch_21
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    move/from16 v3, v23

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 190
    sget v2, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v2, :cond_19

    :goto_17
    const-string v2, "\u1a74\u06eb"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    move/from16 v23, v3

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, 0x4cb

    const v44, 0x2a17552c

    xor-int v3, v3, v44

    const v44, 0x472c0beb

    goto :goto_18

    :cond_19
    move/from16 v23, v3

    const-string v2, "\u0730\u06e2"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, 0xc23

    const v44, -0x241e978f

    xor-int v3, v3, v44

    const v44, -0x3d7bd73d

    :goto_18
    xor-int v44, v2, v44

    goto/16 :goto_1b

    :sswitch_22
    return v22

    :sswitch_23
    move-object/from16 v1, p1

    move/from16 v45, v15

    move-object/from16 v2, v21

    move/from16 v15, v36

    move/from16 v36, v3

    .line 189
    invoke-interface {v2, v1}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result v3

    goto :goto_19

    :sswitch_24
    move-object/from16 v1, p1

    move/from16 v45, v15

    move-object/from16 v2, v21

    move/from16 v15, v36

    move/from16 v36, v3

    .line 191
    invoke-static/range {p1 .. p1}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v3

    :goto_19
    move v8, v3

    const-string v3, "\u06ec\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v42

    mul-int/lit8 v3, v3, -0x35

    xor-int v1, v3, v41

    mul-int/lit16 v1, v1, 0x68d3

    const v21, 0x505741f

    xor-int v1, v1, v21

    const v21, -0x2bdd88c0

    xor-int v44, v3, v21

    move-object/from16 v21, v2

    move/from16 v3, v36

    move v2, v1

    goto/16 :goto_21

    :sswitch_25
    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    .line 188
    iget-object v1, v0, Ll/ۚۗۨ;->ۘ:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    if-eqz v1, :cond_1a

    const-string v2, "\u06d7\u06dc"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    mul-int/lit8 v2, v2, -0x2b

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, 0x79d5

    const v21, 0x3d89cd19

    xor-int v3, v3, v21

    const v21, 0x28ed2e7c

    goto :goto_1a

    :cond_1a
    const-string v2, "\u1a7b\u1a74"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v41

    mul-int/lit8 v2, v2, -0x59

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, 0x3953

    const v21, 0x34edc046

    xor-int v3, v3, v21

    const v21, 0x7892aafe

    :goto_1a
    xor-int v44, v2, v21

    move-object/from16 v21, v1

    :goto_1b
    move v2, v3

    goto :goto_1e

    :sswitch_26
    move/from16 v45, v15

    move-object/from16 v2, v21

    move/from16 v15, v36

    move/from16 v36, v3

    const/16 v1, 0x64

    const/16 v22, 0x0

    move/from16 v3, v19

    if-lt v3, v1, :cond_1b

    :goto_1c
    const-string v1, "\u1a7b\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    move-object/from16 v19, v2

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, -0x5e7f

    const v21, -0x3b0a45df

    xor-int v2, v2, v21

    const v21, 0x58e98dff

    goto :goto_1d

    :cond_1b
    move-object/from16 v19, v2

    const-string v1, "\u06df\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    mul-int/lit8 v1, v1, 0x6d

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x1e13

    const v21, -0x1039fbac

    xor-int v2, v2, v21

    const v21, 0x37e5fa13

    :goto_1d
    xor-int v44, v1, v21

    move-object/from16 v21, v19

    move/from16 v19, v3

    :goto_1e
    move/from16 v3, v36

    goto :goto_21

    :sswitch_27
    move/from16 v45, v15

    move-object/from16 v19, v21

    move/from16 v15, v36

    move/from16 v36, v3

    .line 220
    iget v1, v0, Ll/ۚۗۨ;->ۚ:I

    .line 177
    sget-boolean v2, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v2, :cond_1c

    :goto_1f
    const-string v2, "\u06db\u06d7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    mul-int/lit8 v2, v2, -0x6b

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, -0x764d

    const v21, 0x212bd99

    xor-int v3, v3, v21

    const v21, -0x227c559c

    goto :goto_20

    :cond_1c
    const-string v2, "\u1a73\u06ec"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v41

    mul-int/lit8 v2, v2, -0x2b

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, -0x1f11

    const v21, -0x6020e555

    xor-int v3, v3, v21

    const v21, 0x204fc21f

    :goto_20
    xor-int v44, v2, v21

    move v2, v3

    move-object/from16 v21, v19

    move/from16 v3, v36

    move/from16 v19, v1

    :goto_21
    move/from16 v36, v15

    :goto_22
    move/from16 v15, v45

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ecd1e77 -> :sswitch_19
        -0x7ded2d2a -> :sswitch_e
        -0x7dd3d81b -> :sswitch_d
        -0x7749f1ae -> :sswitch_1a
        -0x7528fcc0 -> :sswitch_1e
        -0x72b49bcd -> :sswitch_0
        -0x6df6623f -> :sswitch_1
        -0x6d711da3 -> :sswitch_22
        -0x6cd251b3 -> :sswitch_8
        -0x66bd67cc -> :sswitch_1f
        -0x63b6fcc3 -> :sswitch_17
        -0x628e28b7 -> :sswitch_20
        -0x5fd9eed7 -> :sswitch_27
        -0x5bca832a -> :sswitch_23
        -0x579ce6f1 -> :sswitch_15
        -0x5727d824 -> :sswitch_d
        -0x50b2d852 -> :sswitch_5
        -0x4b67d876 -> :sswitch_2
        -0x48fa5926 -> :sswitch_14
        -0x48c11e47 -> :sswitch_22
        -0x46ee1133 -> :sswitch_24
        -0x45842075 -> :sswitch_2
        -0x4577884f -> :sswitch_15
        -0x4507e406 -> :sswitch_25
        -0x4379d975 -> :sswitch_7
        -0x43605a88 -> :sswitch_b
        -0x42c86f6a -> :sswitch_20
        -0x3a38ae8e -> :sswitch_8
        -0x31663151 -> :sswitch_16
        -0x30cb9345 -> :sswitch_3
        -0x29a83035 -> :sswitch_6
        -0x28f0b7bb -> :sswitch_1a
        -0x275f1624 -> :sswitch_1b
        -0x269a99ba -> :sswitch_24
        -0x22661db7 -> :sswitch_c
        -0x17c0f79a -> :sswitch_11
        -0x16142d40 -> :sswitch_1e
        -0x15217de8 -> :sswitch_a
        -0x149c7309 -> :sswitch_b
        -0x143d86c0 -> :sswitch_1c
        -0x13c188e6 -> :sswitch_f
        -0xb439d4b -> :sswitch_4
        -0x8282a09 -> :sswitch_18
        -0x4d3ace2 -> :sswitch_4
        -0x36e6ae8 -> :sswitch_12
        -0x2009bf0 -> :sswitch_7
        0x18f293f -> :sswitch_1c
        0x4707560 -> :sswitch_21
        0xe2c93eb -> :sswitch_1f
        0x166cc083 -> :sswitch_9
        0x19135d54 -> :sswitch_10
        0x1b201b4d -> :sswitch_a
        0x20d50cb7 -> :sswitch_26
        0x233b5aec -> :sswitch_14
        0x23bcaf66 -> :sswitch_23
        0x2750e2ea -> :sswitch_0
        0x29060143 -> :sswitch_10
        0x29f5a8df -> :sswitch_17
        0x2c239dc1 -> :sswitch_f
        0x30d695a6 -> :sswitch_5
        0x3423ff71 -> :sswitch_c
        0x3a689693 -> :sswitch_13
        0x3a6cb0dd -> :sswitch_26
        0x3d4f74e9 -> :sswitch_27
        0x3e49b5d0 -> :sswitch_16
        0x4005ed8d -> :sswitch_13
        0x4579fb09 -> :sswitch_e
        0x48774d9f -> :sswitch_19
        0x4dde986b -> :sswitch_12
        0x59f3da8f -> :sswitch_11
        0x5b8dc027 -> :sswitch_21
        0x5e3686d8 -> :sswitch_3
        0x5e9e8793 -> :sswitch_1d
        0x612f4c3c -> :sswitch_1d
        0x63ae71d9 -> :sswitch_9
        0x64a20c1f -> :sswitch_1b
        0x688bbf83 -> :sswitch_25
        0x740e2461 -> :sswitch_18
        0x74ed37f6 -> :sswitch_1
        0x7b214847 -> :sswitch_6
    .end sparse-switch
.end method

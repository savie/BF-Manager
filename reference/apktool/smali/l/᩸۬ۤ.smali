.class public final Ll/᩸۬ۤ;
.super Ljava/lang/Object;
.source "U7HQ"

# interfaces
.implements Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;


# static fields
.field private static final ۨۘܺ:[S


# instance fields
.field public final ֫:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

.field public ۙ:I

.field public ۚ:I

.field public ۤ:I

.field public ۧ:J

.field public ۫:I

.field public final ܳ:I

.field public ᩴ:I

.field public ᩷:I

.field public ᩸:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸۬ۤ;->ۨۘܺ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1225s
        -0x2732s
    .end array-data
.end method

.method public constructor <init>(Ll/ᩴ۬ۤ;ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;)V
    .locals 6

    const/4 p1, 0x0

    const v0, 0x59aefaa4

    sget v1, Ll/ۗ᩺;->֡ۙۜ:I

    sget v2, Ll/֨ۢ;->۬ܿܺ:I

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06da\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x433

    const v5, -0x61271d6d

    xor-int/2addr v4, v5

    const v5, -0x6dcd1ccd

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x3af1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 96
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    goto/16 :goto_2

    .line 39
    :sswitch_0
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_8

    goto/16 :goto_5

    .line 112
    :sswitch_1
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-gez v3, :cond_b

    goto/16 :goto_1

    :sswitch_2
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v3, :cond_5

    goto/16 :goto_2

    .line 158
    :sswitch_3
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 177
    :sswitch_4
    iput p2, p0, Ll/᩸۬ۤ;->ܳ:I

    .line 178
    iput-object p3, p0, Ll/᩸۬ۤ;->֫:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    return-void

    .line 172
    :sswitch_5
    iput p1, p0, Ll/᩸۬ۤ;->ۙ:I

    .line 177
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u06e2\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x75df

    const v5, 0x65f597ff

    xor-int/2addr v4, v5

    const v5, 0x33f4963

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u1a7a\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xa43

    const v5, -0x2a9775e7

    xor-int/2addr v4, v5

    const v5, -0x307593a7

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u05ab\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5ec7

    const v5, 0x6fd9ed0b

    xor-int/2addr v4, v5

    const v5, -0x2a57b57c

    goto/16 :goto_0

    .line 20
    :sswitch_8
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u073f\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1029

    const v5, -0x3d7c7a49

    xor-int/2addr v4, v5

    const v5, -0x64dc012c

    goto/16 :goto_0

    .line 136
    :sswitch_9
    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u05a1\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x306b

    const v5, 0x7586d2b8

    xor-int/2addr v4, v5

    const v5, -0x40785aac

    goto/16 :goto_0

    .line 154
    :sswitch_a
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u0730\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7a3b

    const v5, 0x2d15bae3

    xor-int/2addr v4, v5

    const v5, -0xba703b7

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06eb\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x271d

    const v5, -0x43a6f55f

    xor-int/2addr v4, v5

    const v5, 0x7b074b97

    goto/16 :goto_0

    .line 137
    :sswitch_b
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_7

    :goto_2
    const-string v3, "\u06d8\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5a7f

    const v5, 0x6a18db81

    xor-int/2addr v4, v5

    const v5, -0x422effd9

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e8\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2e17

    const v5, -0x53d77acd

    xor-int/2addr v4, v5

    const v5, 0x38668e7

    goto/16 :goto_0

    .line 119
    :sswitch_c
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06e0\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x51fd

    const v5, 0x637e5c44

    xor-int/2addr v4, v5

    const v5, -0x34e54bb9    # -1.0138695E7f

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d7\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x77ef

    const v5, -0x718c4f4f

    xor-int/2addr v4, v5

    const v5, 0x52ad8978

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v3

    if-eqz v3, :cond_a

    :goto_4
    const-string v3, "\u05a8\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x66db

    const v5, 0x49c63807

    xor-int/2addr v4, v5

    const v5, -0x782d2695

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073a\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x16c3

    const v5, -0x6cc2baad

    xor-int/2addr v4, v5

    const v5, 0x250140aa

    goto/16 :goto_0

    :sswitch_e
    const/4 p1, -0x1

    .line 170
    iput p1, p0, Ll/᩸۬ۤ;->ۤ:I

    .line 88
    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u1a76\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x656f

    const v5, 0x58c6f6f6

    xor-int/2addr v4, v5

    const v5, 0x6197906d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06eb\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x53e3

    const v5, 0x2f69c4ab

    xor-int/2addr v4, v5

    const v5, -0x3edf487c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x700d3c66 -> :sswitch_2
        -0x6dc8839b -> :sswitch_5
        -0x69d0a412 -> :sswitch_4
        -0x66fee215 -> :sswitch_6
        -0x621b9660 -> :sswitch_1
        -0x5e753520 -> :sswitch_a
        -0x4dbea379 -> :sswitch_d
        -0x450d0090 -> :sswitch_2
        -0x3bd72d0d -> :sswitch_9
        -0x32ac1e1b -> :sswitch_0
        -0x2be1139e -> :sswitch_8
        -0x18087334 -> :sswitch_d
        -0x129dad11 -> :sswitch_0
        0x13f625e -> :sswitch_c
        0x722f6cf -> :sswitch_e
        0x134f11b1 -> :sswitch_5
        0x17cc23d9 -> :sswitch_b
        0x1c9e4758 -> :sswitch_e
        0x1d74f176 -> :sswitch_9
        0x28c11460 -> :sswitch_3
        0x2923f6f0 -> :sswitch_b
        0x2d3cbcaa -> :sswitch_a
        0x32a4e6c9 -> :sswitch_1
        0x392d1046 -> :sswitch_6
        0x3d3aaace -> :sswitch_3
        0x40454f4b -> :sswitch_7
        0x6a628f14 -> :sswitch_4
        0x6d0ebbaa -> :sswitch_c
        0x7281b9e1 -> :sswitch_8
        0x7a2a77ea -> :sswitch_7
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

    const v11, -0x787f5a29

    sget v12, Ll/֡ۢ;->۟֡᩻:I

    sget v13, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v14, "\u06e4\u06e0"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x3467

    const v16, -0x28adf183

    xor-int v15, v15, v16

    const v16, -0x56f9ecd0

    xor-int v14, v14, v16

    :goto_0
    const/4 v0, 0x0

    :goto_1
    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, -0x3ecf

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move-object/from16 v14, p0

    move-object/from16 v17, v0

    const v0, 0x8ef5

    const v9, 0x8ef5

    goto/16 :goto_7

    .line 94
    :sswitch_0
    sget v14, Ll/ۖۙ;->ۤۧۤ:I

    if-gez v14, :cond_1

    :cond_0
    move-object/from16 v14, p0

    goto/16 :goto_9

    :cond_1
    move-object/from16 v14, p0

    goto/16 :goto_5

    .line 143
    :sswitch_1
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    sget v14, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v14, :cond_0

    goto :goto_2

    .line 119
    :sswitch_2
    sget v14, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v14, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string v14, "\u05a8\u1a74"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x7b

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x2681

    const v17, -0x3bff3e4

    xor-int v15, v15, v17

    const v17, 0x252ab942

    goto :goto_4

    .line 129
    :sswitch_3
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    :goto_3
    const-string v14, "\u1a77\u1a7b"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x6a9d

    const v17, 0xaca83a0

    xor-int v15, v15, v17

    const v17, 0x525e27f8

    :goto_4
    xor-int v14, v14, v17

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    const/4 v0, 0x0

    return v0

    .line 189
    :sswitch_5
    invoke-interface {v3, v2}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 191
    :sswitch_6
    invoke-static {v2}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v0

    return v0

    .line 0
    :sswitch_7
    invoke-static {v1, v0, v1}, Ll/ܰ۟ۙ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v14, p0

    .line 188
    iget-object v3, v14, Ll/᩸۬ۤ;->֫:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    if-eqz v3, :cond_3

    const-string v15, "\u1a7a\u06d7"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v13

    mul-int/lit8 v15, v15, 0x5b

    move-object/from16 v17, v0

    xor-int v0, v15, v12

    mul-int/lit16 v0, v0, -0x72af

    const v18, -0x7ccd4dc8

    xor-int v0, v0, v18

    const v18, -0x28245f41

    goto/16 :goto_6

    :cond_3
    move-object/from16 v17, v0

    const-string v0, "\u1a79\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x11af

    const v18, -0x65c1a111

    xor-int v15, v15, v18

    const v18, 0x4c1fe835    # 4.1918676E7f

    goto/16 :goto_a

    :sswitch_8
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 204
    invoke-static {v10, v0, v1, v9}, Ll/֡᩵;->ܽۛܰ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 34
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v0

    if-gtz v0, :cond_4

    goto/16 :goto_9

    :cond_4
    const-string v0, "\u06db\u06d9"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x4b

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x4a65

    const v18, -0x689370a6

    xor-int v15, v15, v18

    const v18, -0x783de5a9

    goto/16 :goto_a

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

    .line 92
    sget-boolean v17, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v17, :cond_5

    goto/16 :goto_9

    .line 204
    :cond_5
    invoke-direct {v0, v15}, Ljava/lang/String;-><init>([C)V

    sget-object v10, Ll/᩸۬ۤ;->ۨۘܺ:[S

    sget-boolean v15, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v15, :cond_6

    :goto_5
    const-string v15, "\u1a77\u1a79"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v13

    mul-int/lit8 v15, v15, -0x5

    move-object/from16 v17, v0

    xor-int v0, v15, v12

    mul-int/lit16 v0, v0, -0x6ebd

    const v18, -0x3134cd0a

    xor-int v0, v0, v18

    const v18, 0x6ec147e

    goto :goto_6

    :cond_6
    const-string v15, "\u0733\u06d7"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    mul-int/lit8 v15, v15, -0x43

    move-object/from16 v17, v0

    xor-int v0, v15, v12

    mul-int/lit16 v0, v0, -0x9b7

    const v18, 0x1458e0f

    xor-int v0, v0, v18

    const v18, 0x2c9eae08

    :goto_6
    xor-int v15, v15, v18

    move v14, v15

    move v15, v0

    goto/16 :goto_b

    :sswitch_a
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    const v0, 0xd8c4

    const v9, 0xd8c4

    :goto_7
    const-string v0, "\u0730\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x37d

    const v18, -0x67450e89

    xor-int v15, v15, v18

    const v18, -0x28ac9bc0

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    add-int v0, v5, v8

    mul-int v0, v0, v0

    sub-int/2addr v0, v7

    if-gtz v0, :cond_7

    const-string v0, "\u073a\u0733"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x2a2d

    const v18, -0x69e07303

    xor-int v15, v15, v18

    const v18, 0x1fec9a72

    goto/16 :goto_a

    :cond_7
    const-string v0, "\u05a8\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x1ea5

    const v18, -0x439b2d44

    xor-int v15, v15, v18

    const v18, -0x6fdc2aa8

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    const/16 v8, 0x4bb2

    .line 67
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v0

    if-eqz v0, :cond_8

    goto/16 :goto_9

    :cond_8
    const-string v0, "\u1a73\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x27

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x1479

    const v18, 0x334e563

    xor-int v15, v15, v18

    const v18, 0x86eb6c1

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    const v0, 0x1661c7c4

    add-int/2addr v0, v6

    add-int v7, v0, v0

    sget-boolean v0, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v0, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u06d8\u06e1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x19b9

    const v18, -0x7c5ad25e

    xor-int v15, v15, v18

    const v18, -0x79bdfdba

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    const/4 v0, 0x0

    aget-short v5, v4, v0

    mul-int v6, v5, v5

    .line 132
    sget v0, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v0, :cond_a

    goto :goto_8

    :cond_a
    const-string v0, "\u06e8\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x6d8f

    const v18, -0x50878587

    xor-int v15, v15, v18

    const v18, -0x82d9428

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    sget-object v4, Ll/᩸۬ۤ;->ۨۘܺ:[S

    sget v0, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v0, :cond_b

    goto/16 :goto_9

    :cond_b
    const-string v0, "\u06e7\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, 0x5b

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0xc51

    const v18, 0x3f476150

    xor-int v15, v15, v18

    const v18, -0x3919ab44

    goto/16 :goto_a

    :sswitch_10
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    .line 24
    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_c

    goto :goto_8

    :cond_c
    const-string v0, "\u1a79\u0736"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x19

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x5d65

    const v18, 0x6017ca07

    xor-int v15, v15, v18

    const v18, -0x75168750

    goto :goto_a

    :sswitch_11
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    .line 68
    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_d

    :goto_8
    const-string v0, "\u1a76\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x6a31

    const v18, 0x3ecf6665

    xor-int v15, v15, v18

    const v18, 0x51ac14e8

    goto :goto_a

    :cond_d
    const-string v0, "\u06d7\u0733"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, -0x4b

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x1623

    const v18, -0x24f8a325

    xor-int v15, v15, v18

    const v18, -0x3446688

    goto :goto_a

    :sswitch_12
    move-object/from16 v14, p0

    move-object/from16 v17, v0

    sget v0, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v0, :cond_e

    :goto_9
    const-string v0, "\u06dc\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x1f3

    const v17, -0x7d7000a

    xor-int v15, v15, v17

    const v17, 0x18fe6aa1

    xor-int v0, v0, v17

    move v14, v0

    goto/16 :goto_0

    :cond_e
    const-string v0, "\u1a73\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x56f3

    const v18, 0x5d7b5a58

    xor-int v15, v15, v18

    const v18, 0x8185bd6

    :goto_a
    xor-int v0, v0, v18

    move v14, v0

    :goto_b
    move-object/from16 v0, v17

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x709d7b90 -> :sswitch_f
        -0x6323221b -> :sswitch_10
        -0x60cf7c6e -> :sswitch_11
        -0x5a66704d -> :sswitch_9
        -0x4cf1a322 -> :sswitch_0
        -0x4c02d880 -> :sswitch_c
        -0x4244f569 -> :sswitch_10
        -0x3e923b50 -> :sswitch_8
        -0x3a8900d0 -> :sswitch_4
        -0x397b33ff -> :sswitch_0
        -0x3645aaa0 -> :sswitch_e
        -0x335fd43c -> :sswitch_c
        -0x32b019e1 -> :sswitch_2
        -0x23e95d42 -> :sswitch_e
        -0x21d861c5 -> :sswitch_11
        -0x1d1380c8 -> :sswitch_9
        -0x16af9453 -> :sswitch_1
        -0x556b1f3 -> :sswitch_7
        0x7291ce1 -> :sswitch_b
        0x97524c5 -> :sswitch_3
        0xaf992c4 -> :sswitch_1
        0xf4b5f64 -> :sswitch_b
        0x112b543e -> :sswitch_d
        0x2a538384 -> :sswitch_a
        0x2d414fee -> :sswitch_2
        0x2d97b4c6 -> :sswitch_6
        0x38bdf178 -> :sswitch_7
        0x3e2d5960 -> :sswitch_12
        0x433f0b80 -> :sswitch_8
        0x497bfa51 -> :sswitch_f
        0x4ffb022b -> :sswitch_a
        0x57997388 -> :sswitch_5
        0x5a006bf2 -> :sswitch_3
        0x60f92634 -> :sswitch_d
        0x6a7f32cc -> :sswitch_5
        0x77fba0e4 -> :sswitch_12
        0x79a32d1e -> :sswitch_6
        0x7c32bb25 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final reset()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x1315836a

    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    const-string v5, "\u1a7b\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2e55

    const v7, -0x459c298f

    xor-int/2addr v6, v7

    const v7, -0x7f98adde

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x615d

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 68
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v5

    if-eqz v5, :cond_6

    goto/16 :goto_2

    .line 88
    :sswitch_0
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    sget v5, Ll/֫֨;->᩶ܺۡ:I

    if-lez v5, :cond_3

    goto/16 :goto_3

    .line 185
    :sswitch_1
    sget v5, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v5, :cond_9

    goto/16 :goto_4

    .line 38
    :sswitch_2
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget-boolean v5, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-nez v5, :cond_5

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    return-void

    .line 214
    :sswitch_5
    iput v1, p0, Ll/᩸۬ۤ;->ۤ:I

    .line 215
    iput v1, p0, Ll/᩸۬ۤ;->ۙ:I

    return-void

    :sswitch_6
    const/4 v1, -0x1

    .line 205
    sget v5, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u06eb\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x59

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1a3b

    const v7, 0x6e9e7184

    xor-int/2addr v6, v7

    const v7, -0x42fec27a

    goto :goto_0

    .line 212
    :sswitch_7
    iput v0, p0, Ll/᩸۬ۤ;->ۚ:I

    .line 213
    iput v0, p0, Ll/᩸۬ۤ;->۫:I

    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v5, :cond_1

    goto :goto_1

    :cond_1
    const-string v5, "\u06da\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x22e1

    const v7, 0x535544c6

    xor-int/2addr v6, v7

    const v7, -0x292b11e6

    goto :goto_0

    :sswitch_8
    const-wide/16 v5, 0x0

    .line 211
    iput-wide v5, p0, Ll/᩸۬ۤ;->ۧ:J

    .line 38
    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v5, :cond_2

    :goto_1
    const-string v5, "\u06da\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6029

    const v7, -0x55f2c216

    xor-int/2addr v6, v7

    const v7, 0x6e14b9a5

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u06e7\u06e1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x59

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3683

    const v7, 0x3f69c302

    xor-int/2addr v6, v7

    const v7, -0x783df4eb

    goto/16 :goto_0

    .line 210
    :sswitch_9
    iput v0, p0, Ll/᩸۬ۤ;->ᩴ:I

    .line 61
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    const-string v5, "\u06e7\u1a7a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x39

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x44b

    const v7, 0xf742f51

    xor-int/2addr v6, v7

    const v7, 0x4af77f99    # 8110028.5f

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06d8\u06ec"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5327

    const v7, 0x5df22820

    xor-int/2addr v6, v7

    const v7, 0x68b4a677

    goto/16 :goto_0

    :cond_5
    :goto_2
    const-string v5, "\u06d8\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7fe7

    const v7, 0x179152d9

    xor-int/2addr v6, v7

    const v7, -0x37ea0eb8

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06e0\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x43

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5bfb

    const v7, -0x642649ba

    xor-int/2addr v6, v7

    const v7, 0x31d39c75

    goto/16 :goto_0

    .line 149
    :sswitch_a
    sget v5, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u06e1\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2343

    const v7, -0x4d4c2f31

    xor-int/2addr v6, v7

    const v7, -0x7be4bbee

    goto/16 :goto_0

    .line 84
    :sswitch_b
    sget v5, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u073d\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x19

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4efb

    const v7, -0x4d413973

    xor-int/2addr v6, v7

    const v7, -0x48e2c95f

    goto/16 :goto_0

    .line 109
    :sswitch_c
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v5

    if-ltz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u06d7\u06e8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x33

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7bf5

    const v7, 0x17703c2e

    xor-int/2addr v6, v7

    const v7, 0x6b3304ae

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06db\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x51a7

    const v7, -0x72db59b

    xor-int/2addr v6, v7

    const v7, 0x499b9a21

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/ۧ;->ۨۗܰ:I

    if-ltz v5, :cond_b

    goto :goto_4

    :cond_b
    const-string v5, "\u1a73\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x29eb

    const v7, 0x49406cd0    # 788173.0f

    xor-int/2addr v6, v7

    const v7, -0x616e79de

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x0

    .line 168
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v5

    if-eqz v5, :cond_c

    :goto_4
    const-string v5, "\u06da\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x7f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2195

    const v7, -0x21f75c86

    xor-int/2addr v6, v7

    const v7, -0x4d72879a

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d8\u1a7b"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6abf

    const v7, -0x54a38f7a

    xor-int/2addr v6, v7

    const v7, 0x3e0aa28a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x71793033 -> :sswitch_6
        -0x6f87bb93 -> :sswitch_8
        -0x4982725d -> :sswitch_d
        -0x43958863 -> :sswitch_e
        -0x3e134aae -> :sswitch_b
        -0x393fb87c -> :sswitch_c
        -0x3442d95f -> :sswitch_3
        -0x338eee10 -> :sswitch_5
        -0x2b8083b4 -> :sswitch_2
        -0x1f4cbe5e -> :sswitch_1
        -0x199c5c97 -> :sswitch_0
        -0x146ae14c -> :sswitch_d
        -0xb5d2c83 -> :sswitch_9
        -0x954c43b -> :sswitch_7
        -0x7a0171c -> :sswitch_b
        0x813afb0 -> :sswitch_e
        0x1719dfa4 -> :sswitch_a
        0x1ae34f1c -> :sswitch_a
        0x24c500b6 -> :sswitch_6
        0x2cae78ce -> :sswitch_9
        0x30e687e5 -> :sswitch_8
        0x39bdcaa5 -> :sswitch_0
        0x3afdc228 -> :sswitch_1
        0x4062ebcd -> :sswitch_3
        0x40daea44 -> :sswitch_4
        0x44897d2f -> :sswitch_2
        0x5896e0c8 -> :sswitch_c
        0x59cb76c4 -> :sswitch_5
        0x632dbf79 -> :sswitch_4
        0x7f8456c5 -> :sswitch_7
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

    const v40, 0x51787581

    sget v41, Ll/֡ܳ;->֨ᩳۢ:I

    sget v42, Ll/ۗ᩺;->֡ۙۜ:I

    const-string v43, "\u06e8\u06e2"

    invoke-static/range {v43 .. v43}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v43

    xor-int v43, v43, v42

    xor-int v2, v43, v41

    mul-int/lit16 v2, v2, 0x6f27

    const v45, 0x60c1ee90

    xor-int v2, v2, v45

    const v45, -0x7e61e904

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

    const v43, 0x51787581

    move-wide/from16 v24, v23

    move-wide/from16 v31, v30

    const/16 v23, 0x0

    move-wide/from16 v29, v28

    const/16 v28, 0x0

    :goto_0
    xor-int v1, v43, v41

    mul-int/lit16 v1, v1, 0x6605

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v2

    xor-int v43, v44, v1

    sparse-switch v43, :sswitch_data_0

    move/from16 v45, v15

    move-object/from16 v19, v21

    move/from16 v15, v36

    move/from16 v36, v3

    .line 220
    iget v1, v0, Ll/᩸۬ۤ;->ᩴ:I

    sget v2, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v2, :cond_1c

    goto/16 :goto_1f

    .line 206
    :sswitch_0
    sget-boolean v1, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v1, :cond_0

    goto :goto_3

    :cond_0
    move-object/from16 v1, p1

    move v2, v6

    move v6, v15

    move/from16 v15, v36

    :goto_1
    move/from16 v36, v3

    goto/16 :goto_13

    .line 162
    :sswitch_1
    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    if-lez v1, :cond_1

    goto :goto_2

    :cond_1
    move-object/from16 v1, p1

    move/from16 v45, v15

    move v15, v3

    move/from16 v3, v23

    goto/16 :goto_17

    .line 88
    :sswitch_2
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v1, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v1, :cond_2

    goto :goto_5

    :cond_2
    :goto_2
    const-string v1, "\u073f\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, -0x17b

    const v44, 0x5b934e3

    xor-int v2, v2, v44

    const v44, -0x6fdec628

    goto/16 :goto_8

    :sswitch_3
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v1, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v1, :cond_4

    :cond_3
    move/from16 v45, v15

    goto/16 :goto_e

    :cond_4
    move/from16 v45, v15

    move/from16 v1, v19

    move-object/from16 v19, v21

    move/from16 v15, v36

    move/from16 v36, v3

    goto/16 :goto_1f

    :sswitch_4
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_6

    :cond_5
    :goto_3
    const-string v1, "\u0730\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    mul-int/lit8 v1, v1, -0x45

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x5e0b

    const v44, -0x321e2043

    xor-int v2, v2, v44

    const v44, 0x16e04a5b

    goto/16 :goto_8

    .line 182
    :sswitch_5
    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-gez v1, :cond_3

    :cond_6
    :goto_4
    move/from16 v45, v15

    goto/16 :goto_f

    .line 238
    :sswitch_6
    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_5
    const-string v1, "\u1a7a\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x68a3

    const v44, 0x49b108df

    xor-int v2, v2, v44

    const v44, 0xcfe164c

    goto :goto_8

    .line 93
    :sswitch_7
    sget v1, Ll/ۗܰ;->ܶۜ۬:I

    if-gez v1, :cond_6

    goto :goto_6

    :sswitch_8
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    :goto_6
    const-string v1, "\u06d6\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x11cf

    const v44, 0x6725f846

    xor-int v2, v2, v44

    const v44, 0x26f17002

    goto :goto_8

    :sswitch_9
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

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

    goto :goto_7

    :cond_8
    move/from16 v38, v1

    move/from16 v37, v15

    goto :goto_7

    :sswitch_c
    const/4 v1, 0x0

    move/from16 v37, v15

    const/16 v38, 0x0

    :goto_7
    const-string v1, "\u06e0\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x723b

    const v44, 0x63bd7c03

    xor-int v2, v2, v44

    const v44, -0x4a48d390

    :goto_8
    xor-int v44, v1, v44

    goto/16 :goto_0

    .line 260
    :sswitch_d
    invoke-direct {v0, v9, v5}, Ll/᩸۬ۤ;->ۙ(CI)I

    move-result v1

    iput v1, v0, Ll/᩸۬ۤ;->᩷:I

    .line 261
    iput v5, v0, Ll/᩸۬ۤ;->ۙ:I

    move/from16 v44, v14

    move/from16 v45, v15

    goto/16 :goto_a

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

    goto/16 :goto_12

    :sswitch_f
    move/from16 v44, v14

    move/from16 v45, v15

    .line 264
    iget v1, v0, Ll/᩸۬ۤ;->ᩴ:I

    int-to-long v1, v1

    mul-long v33, v1, v29

    .line 163
    sget v1, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v1, :cond_a

    goto :goto_9

    :cond_a
    const-string v1, "\u1a77\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x126f

    const v14, -0x4807f9

    xor-int/2addr v2, v14

    const v14, 0xd82e722

    goto/16 :goto_d

    :sswitch_10
    move/from16 v44, v14

    move/from16 v45, v15

    .line 264
    iget-wide v1, v0, Ll/᩸۬ۤ;->ۧ:J

    int-to-long v14, v8

    add-long v31, v1, v14

    .line 213
    sget v1, Ll/֫֡;->֫ۙۖ:I

    if-gtz v1, :cond_b

    :goto_9
    const-string v1, "\u0736\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v42, v1

    mul-int/lit8 v1, v1, 0x19

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x243f

    const v14, 0x16d784ae

    xor-int/2addr v2, v14

    const v14, -0x754448e9

    goto/16 :goto_d

    :cond_b
    const-string v1, "\u06e2\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x69cb

    const v14, 0x20d50dd

    xor-int/2addr v2, v14

    const v14, 0x7045fcab

    goto/16 :goto_d

    :sswitch_11
    move/from16 v44, v14

    move/from16 v45, v15

    .line 263
    iget v1, v0, Ll/᩸۬ۤ;->᩸:I

    iget v2, v0, Ll/᩸۬ۤ;->᩷:I

    invoke-static {v1, v2}, Ll/ۖܰ;->ܰۛۖ(II)I

    move-result v1

    int-to-long v1, v1

    .line 27
    sget v14, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v14, :cond_c

    move-wide/from16 v29, v1

    move v2, v6

    move/from16 v15, v36

    move/from16 v14, v44

    move/from16 v6, v45

    move-object/from16 v1, p1

    goto/16 :goto_1

    :cond_c
    const-string v14, "\u06d8\u05ab"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v42, v14

    mul-int/lit8 v14, v14, 0x5

    xor-int v15, v14, v41

    mul-int/lit16 v15, v15, 0x153

    const v29, 0x3545441d

    xor-int v15, v15, v29

    const v29, -0x354174e8    # -6243724.0f

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

    const-string v1, "\u1a76\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, -0x6d

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, -0x619

    const v14, -0xef8d1a

    xor-int/2addr v2, v14

    const v14, -0x69dd3d26

    goto/16 :goto_d

    :cond_d
    const-string v1, "\u1a74\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v42

    mul-int/lit8 v1, v1, -0x49

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x405b

    const v14, 0x7e6473f5

    xor-int/2addr v2, v14

    const v14, -0x2518dd31

    goto/16 :goto_d

    :sswitch_13
    move/from16 v44, v14

    move/from16 v45, v15

    .line 256
    invoke-direct {v0, v10, v3}, Ll/᩸۬ۤ;->ۙ(CI)I

    move-result v1

    iput v1, v0, Ll/᩸۬ۤ;->᩸:I

    .line 257
    iput v3, v0, Ll/᩸۬ۤ;->ۤ:I

    goto/16 :goto_c

    :sswitch_14
    move/from16 v44, v14

    move/from16 v45, v15

    .line 259
    iget v1, v0, Ll/᩸۬ۤ;->ۙ:I

    if-eq v5, v1, :cond_e

    const-string v1, "\u06e7\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x1d

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, -0xba7

    const v14, 0x7fbb55b6

    xor-int/2addr v2, v14

    const v14, -0x1748d6bc

    goto/16 :goto_d

    :cond_e
    :goto_a
    const-string v1, "\u06e2\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x3fbf

    const v14, -0x761ef9ac

    xor-int/2addr v2, v14

    const v14, -0x6223bc9b

    goto :goto_d

    :sswitch_15
    move/from16 v44, v14

    move/from16 v45, v15

    add-int v1, v28, v11

    if-le v1, v13, :cond_f

    move/from16 v39, v1

    move/from16 v40, v39

    goto :goto_b

    :cond_f
    move/from16 v40, v1

    move/from16 v39, v13

    goto :goto_b

    :sswitch_16
    move/from16 v44, v14

    move/from16 v45, v15

    const/4 v1, 0x0

    move/from16 v39, v13

    const/16 v40, 0x0

    :goto_b
    const-string v1, "\u1a78\u1a7b"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v42

    mul-int/lit8 v1, v1, 0x7

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x3823

    const v14, -0x3360e4fe    # -8.34171E7f

    xor-int/2addr v2, v14

    const v14, -0x7d373f4d

    goto :goto_d

    :sswitch_17
    move/from16 v44, v14

    move/from16 v45, v15

    .line 255
    iget v1, v0, Ll/᩸۬ۤ;->ۤ:I

    if-eq v3, v1, :cond_10

    const-string v1, "\u06e1\u1a7b"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v41

    mul-int/lit8 v1, v1, -0x43

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, -0x3697

    const v14, 0x6523511b

    xor-int/2addr v2, v14

    const v14, 0x47b8eb75

    goto :goto_d

    :cond_10
    :goto_c
    const-string v1, "\u073f\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x77ed

    const v14, -0x29b4ffaa

    xor-int/2addr v2, v14

    const v14, -0x2eb89c08

    :goto_d
    xor-int/2addr v1, v14

    move/from16 v14, v44

    move/from16 v15, v45

    move/from16 v44, v1

    goto/16 :goto_0

    :sswitch_18
    move/from16 v44, v14

    add-long v1, v24, v26

    .line 271
    iput-wide v1, v0, Ll/᩸۬ۤ;->ۧ:J

    .line 272
    iput v14, v0, Ll/᩸۬ۤ;->ۚ:I

    .line 273
    iput v6, v0, Ll/᩸۬ۤ;->۫:I

    return v11

    :sswitch_19
    move/from16 v45, v15

    .line 271
    iget-wide v1, v0, Ll/᩸۬ۤ;->ۧ:J

    move-wide/from16 v24, v1

    int-to-long v1, v8

    .line 64
    sget v15, Ll/֫֡;->֫ۙۖ:I

    if-gtz v15, :cond_11

    move-wide/from16 v26, v1

    :goto_e
    const-string v1, "\u06d9\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0xbc5

    const v15, 0x418fc31b

    xor-int/2addr v2, v15

    const v15, -0x26a3c207

    goto :goto_10

    :cond_11
    const-string v15, "\u06ec\u06eb"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    xor-int v15, v15, v42

    mul-int/lit8 v15, v15, 0x2b

    move-wide/from16 v26, v1

    xor-int v1, v15, v41

    mul-int/lit16 v1, v1, -0x1169

    const v2, 0x4998cccb

    xor-int/2addr v2, v1

    const v1, -0x13540d4d

    xor-int v44, v15, v1

    goto/16 :goto_22

    :sswitch_1a
    move/from16 v45, v15

    .line 270
    iget v1, v0, Ll/᩸۬ۤ;->ᩴ:I

    add-int/2addr v1, v11

    iput v1, v0, Ll/᩸۬ۤ;->ᩴ:I

    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v1, :cond_12

    :goto_f
    const-string v1, "\u073f\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x544d

    const v15, 0x40f434aa

    xor-int/2addr v2, v15

    const v15, 0x1d769db1

    goto :goto_10

    :cond_12
    const-string v1, "\u06e7\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, -0x6ad9

    const v15, -0x68aba5d1

    xor-int/2addr v2, v15

    const v15, 0x15ae1ce8

    :goto_10
    xor-int v44, v1, v15

    goto/16 :goto_22

    :sswitch_1b
    move-object/from16 v1, p1

    move/from16 v45, v15

    .line 230
    invoke-static {v1, v12}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v7

    if-ne v7, v10, :cond_13

    const-string v2, "\u1a7a\u1a7a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v42

    mul-int/lit8 v2, v2, -0x77

    xor-int v15, v2, v41

    mul-int/lit16 v15, v15, 0x4c17

    const v44, 0x2be378f5

    xor-int v15, v15, v44

    const v44, 0x20b74069

    goto :goto_11

    :cond_13
    const-string v2, "\u06e4\u0736"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    xor-int v15, v2, v42

    mul-int/lit16 v15, v15, -0x7f2b

    const v44, 0x564640f8

    xor-int v15, v15, v44

    const v44, -0x1cbd747e

    :goto_11
    xor-int v44, v2, v44

    move v2, v15

    goto/16 :goto_22

    :sswitch_1c
    move-object/from16 v1, p1

    move/from16 v45, v15

    add-int v2, v6, v20

    move/from16 v15, v36

    .line 252
    invoke-static {v15, v2}, Ll/ۖܰ;->ܰۛۖ(II)I

    move-result v5

    .line 254
    iget v4, v0, Ll/᩸۬ۤ;->ܳ:I

    if-lez v4, :cond_14

    const-string v2, "\u05ab\u1a74"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    move/from16 v36, v3

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, -0x31ad

    const v44, -0x62121ee8

    xor-int v3, v3, v44

    const v44, 0x47002553

    goto/16 :goto_18

    :cond_14
    :goto_12
    move/from16 v36, v3

    const-string v2, "\u06eb\u1a7b"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, 0x6b7

    const v44, -0x2be18da1

    xor-int v3, v3, v44

    const v44, 0x1e29a65f

    goto/16 :goto_18

    :sswitch_1d
    move-object/from16 v1, p1

    move/from16 v45, v15

    const/16 v2, 0x8

    move/from16 v3, v23

    .line 251
    invoke-static {v2, v3}, Ll/ۖܰ;->ܰۛۖ(II)I

    move-result v15

    const/16 v20, 0x1

    .line 114
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v23

    if-eqz v23, :cond_15

    const/16 v36, 0x8

    goto/16 :goto_17

    :cond_15
    const-string v23, "\u1a76\u06ec"

    invoke-static/range {v23 .. v23}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v41

    xor-int v2, v23, v42

    mul-int/lit16 v2, v2, 0x129b

    const v44, 0x4ab5abd6    # 5953003.0f

    xor-int v2, v2, v44

    const v44, -0x4fb623ab

    xor-int v44, v23, v44

    move/from16 v23, v3

    move v3, v15

    move/from16 v15, v45

    const/16 v36, 0x8

    goto/16 :goto_0

    :sswitch_1e
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    add-int/lit8 v23, v14, 0x1

    .line 249
    sget v2, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v2, :cond_16

    move v2, v6

    move/from16 v6, v45

    goto :goto_13

    :cond_16
    const-string v2, "\u06dc\u06e2"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, -0x52a1

    const v44, -0x5f8bf1f1

    xor-int v3, v3, v44

    const v44, -0x7001d23d

    goto/16 :goto_18

    :sswitch_1f
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    move/from16 v3, v23

    iget v2, v0, Ll/᩸۬ۤ;->ۚ:I

    invoke-static {v2, v13}, Ll/ۖ֡;->ܰۜ۬(II)I

    move-result v14

    .line 250
    iget v2, v0, Ll/᩸۬ۤ;->۫:I

    move/from16 v6, v45

    invoke-static {v2, v6}, Ll/ۖܰ;->ܰۛۖ(II)I

    move-result v2

    sget v23, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v23, :cond_17

    move/from16 v23, v3

    :goto_13
    const-string v3, "\u0733\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v41, v3

    mul-int/lit8 v3, v3, -0xb

    move/from16 v44, v2

    xor-int v2, v3, v42

    mul-int/lit16 v2, v2, 0x505d

    const v45, 0x5e76c4fd

    xor-int v2, v2, v45

    const v45, 0x4ebb66c4    # 1.5720371E9f

    xor-int v3, v3, v45

    move/from16 v47, v44

    move/from16 v44, v3

    move/from16 v3, v36

    move/from16 v36, v15

    move v15, v6

    move/from16 v6, v47

    goto/16 :goto_0

    :cond_17
    const-string v23, "\u1a78\u05a8"

    invoke-static/range {v23 .. v23}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v41

    move/from16 v44, v2

    xor-int v2, v23, v42

    mul-int/lit16 v2, v2, 0x6b63

    const v45, 0x746ccf2d

    xor-int v2, v2, v45

    const v45, -0x753c0751

    xor-int v23, v23, v45

    move/from16 v47, v23

    move/from16 v23, v3

    move/from16 v3, v36

    move/from16 v36, v15

    move v15, v6

    move/from16 v6, v44

    goto/16 :goto_16

    :sswitch_20
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    move/from16 v3, v23

    .line 229
    invoke-static/range {p1 .. p1}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v2

    const/16 v10, 0x3d

    const/4 v11, 0x1

    if-ge v12, v2, :cond_18

    const-string v2, "\u05a8\u073a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v42

    mul-int/lit8 v2, v2, -0x3d

    xor-int v9, v2, v41

    mul-int/lit16 v9, v9, 0x19e1

    const v44, -0x1b4def46

    xor-int v9, v9, v44

    const v44, 0x678c4321

    goto :goto_14

    :cond_18
    const-string v2, "\u05a8\u06d8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v42

    mul-int/lit8 v2, v2, 0x6f

    xor-int v9, v2, v41

    mul-int/lit16 v9, v9, -0x1d89

    const v44, -0x23bc8573

    xor-int v9, v9, v44

    const v44, -0x404173f

    :goto_14
    xor-int v44, v2, v44

    move/from16 v23, v3

    move v2, v9

    move/from16 v3, v36

    const/16 v9, 0x2d

    goto/16 :goto_21

    :sswitch_21
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
    const-string v23, "\u1a7b\u05a1"

    invoke-static/range {v23 .. v23}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v42

    mul-int/lit8 v23, v23, -0x19

    move/from16 v44, v2

    xor-int v2, v23, v41

    mul-int/lit16 v2, v2, -0x7739

    const v45, 0x96412f8

    xor-int v2, v2, v45

    const v45, 0x3983200d

    xor-int v23, v23, v45

    move/from16 v47, v23

    move/from16 v23, v3

    move/from16 v3, v36

    move/from16 v36, v15

    move/from16 v15, v44

    :goto_16
    move/from16 v44, v47

    goto/16 :goto_0

    :sswitch_22
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    move/from16 v3, v23

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 74
    sget v2, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v2, :cond_19

    move/from16 v47, v36

    move/from16 v36, v15

    move/from16 v15, v47

    :goto_17
    const-string v2, "\u1a7b\u073d"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    move/from16 v23, v3

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, 0xb25

    const v44, -0x7590bfc1

    xor-int v3, v3, v44

    const v44, -0x6e3745d

    xor-int v44, v2, v44

    move v2, v3

    move v3, v15

    goto/16 :goto_22

    :cond_19
    move/from16 v23, v3

    const-string v2, "\u06db\u073d"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, 0x4c0f

    const v44, 0x514e3821

    xor-int v3, v3, v44

    const v44, 0x744bf193

    :goto_18
    xor-int v44, v2, v44

    goto/16 :goto_1b

    :sswitch_23
    return v22

    :sswitch_24
    move-object/from16 v1, p1

    move/from16 v45, v15

    move-object/from16 v2, v21

    move/from16 v15, v36

    move/from16 v36, v3

    .line 189
    invoke-interface {v2, v1}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result v3

    goto :goto_19

    :sswitch_25
    move-object/from16 v1, p1

    move/from16 v45, v15

    move-object/from16 v2, v21

    move/from16 v15, v36

    move/from16 v36, v3

    .line 191
    invoke-static/range {p1 .. p1}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v3

    :goto_19
    move v8, v3

    const-string v3, "\u073f\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v41

    mul-int/lit8 v3, v3, -0x69

    xor-int v1, v3, v42

    mul-int/lit16 v1, v1, -0x60f

    const v21, -0x1a2fbe4d

    xor-int v1, v1, v21

    const v21, 0x1dd64853

    xor-int v44, v3, v21

    move-object/from16 v21, v2

    move/from16 v3, v36

    move v2, v1

    goto/16 :goto_21

    :sswitch_26
    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    .line 188
    iget-object v1, v0, Ll/᩸۬ۤ;->֫:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    if-eqz v1, :cond_1a

    const-string v2, "\u1a79\u06d7"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v42, v2

    mul-int/lit8 v2, v2, -0x55

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, -0x117d

    const v21, -0x71e24c32

    xor-int v3, v3, v21

    const v21, 0x6165bd18

    goto :goto_1a

    :cond_1a
    const-string v2, "\u073d\u06d9"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    mul-int/lit8 v2, v2, 0x49

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, -0x7247

    const v21, -0x1789daee

    xor-int v3, v3, v21

    const v21, 0x37c3412

    :goto_1a
    xor-int v44, v2, v21

    move-object/from16 v21, v1

    :goto_1b
    move v2, v3

    goto :goto_1e

    :sswitch_27
    move/from16 v45, v15

    move-object/from16 v2, v21

    move/from16 v15, v36

    move/from16 v36, v3

    const/16 v1, 0x64

    const/16 v22, 0x0

    move/from16 v3, v19

    if-lt v3, v1, :cond_1b

    :goto_1c
    const-string v1, "\u1a7b\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v42, v1

    mul-int/lit8 v1, v1, 0x27

    move-object/from16 v19, v2

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x1d75

    const v21, 0x55a24ca1

    xor-int v2, v2, v21

    const v21, 0x7569e53a

    goto :goto_1d

    :cond_1b
    move-object/from16 v19, v2

    const-string v1, "\u06e2\u073a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, -0xa05

    const v21, -0x5e4a15a9

    xor-int v2, v2, v21

    const v21, 0xcb284d

    :goto_1d
    xor-int v44, v1, v21

    move-object/from16 v21, v19

    move/from16 v19, v3

    :goto_1e
    move/from16 v3, v36

    goto :goto_21

    :goto_1f
    const-string v2, "\u1a73\u06d7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v41, v2

    mul-int/lit8 v2, v2, 0x47

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, 0x220b

    const v21, 0x5aa0a5ac

    xor-int v3, v3, v21

    const v21, -0x105a6674

    goto :goto_20

    :cond_1c
    const-string v2, "\u1a75\u05a8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, -0x6a7f

    const v21, 0x2bd4c440

    xor-int v3, v3, v21

    const v21, 0x157ed4bb

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
        -0x7f92dc2f -> :sswitch_27
        -0x7d791b68 -> :sswitch_1
        -0x7a1bc6a7 -> :sswitch_12
        -0x78af66be -> :sswitch_3
        -0x77994ab6 -> :sswitch_8
        -0x765999c2 -> :sswitch_6
        -0x755227b9 -> :sswitch_11
        -0x6fdf0d40 -> :sswitch_4
        -0x6ebbef69 -> :sswitch_12
        -0x6dacdec1 -> :sswitch_b
        -0x6ceeaed8 -> :sswitch_15
        -0x676e9887 -> :sswitch_e
        -0x655cb381 -> :sswitch_13
        -0x624e7a79 -> :sswitch_1e
        -0x5e3c02f1 -> :sswitch_1a
        -0x5c1d9ade -> :sswitch_1f
        -0x58c45f85 -> :sswitch_1c
        -0x5851fa5e -> :sswitch_c
        -0x53ff2271 -> :sswitch_19
        -0x53e561aa -> :sswitch_25
        -0x4f6f4ecd -> :sswitch_1
        -0x4df02a9f -> :sswitch_9
        -0x45a29d5b -> :sswitch_21
        -0x459c1c97 -> :sswitch_10
        -0x42e0ae07 -> :sswitch_22
        -0x3fae6c5d -> :sswitch_1b
        -0x3f874cd8 -> :sswitch_23
        -0x3bbbd37d -> :sswitch_5
        -0x39c93d57 -> :sswitch_14
        -0x2defde3d -> :sswitch_17
        -0x2d85d7d4 -> :sswitch_18
        -0x28e2a4c9 -> :sswitch_a
        -0x27bd5b1d -> :sswitch_27
        -0x1ce45f8f -> :sswitch_24
        -0x1ae75f0f -> :sswitch_18
        -0x188707f1 -> :sswitch_13
        -0x14cec623 -> :sswitch_b
        -0x10bb4cc9 -> :sswitch_14
        -0xf8f1a18 -> :sswitch_2
        -0xde0689f -> :sswitch_0
        -0xbccefb8 -> :sswitch_16
        -0x7a861a5 -> :sswitch_d
        0x3edffc0 -> :sswitch_c
        0x4090422 -> :sswitch_15
        0x43072ba -> :sswitch_0
        0x7685d59 -> :sswitch_8
        0x95811b7 -> :sswitch_1a
        0x9a595c3 -> :sswitch_17
        0xfdeb4c0 -> :sswitch_1c
        0x10ca4279 -> :sswitch_26
        0x17bab3cd -> :sswitch_26
        0x1aee38fc -> :sswitch_1d
        0x1b8c1e69 -> :sswitch_7
        0x1d5f7e00 -> :sswitch_1b
        0x1d8c5b2b -> :sswitch_20
        0x1df18373 -> :sswitch_e
        0x20a70d53 -> :sswitch_a
        0x23f14366 -> :sswitch_10
        0x3180d945 -> :sswitch_9
        0x3379fadb -> :sswitch_f
        0x34d6fffe -> :sswitch_5
        0x39fcddb6 -> :sswitch_11
        0x3ef8fceb -> :sswitch_4
        0x44e446b9 -> :sswitch_1e
        0x488e05d4 -> :sswitch_20
        0x4c4c1d80 -> :sswitch_6
        0x4f59353b -> :sswitch_d
        0x545de891 -> :sswitch_25
        0x596349c6 -> :sswitch_1f
        0x5b062772 -> :sswitch_19
        0x5f79466c -> :sswitch_24
        0x633a6d49 -> :sswitch_21
        0x67345460 -> :sswitch_f
        0x6c0f7938 -> :sswitch_2
        0x6ee0e18a -> :sswitch_1d
        0x7237c81f -> :sswitch_16
        0x77aec3e2 -> :sswitch_7
        0x7b285f8e -> :sswitch_3
        0x7df0ebe7 -> :sswitch_23
        0x7ffc9600 -> :sswitch_22
    .end sparse-switch
.end method

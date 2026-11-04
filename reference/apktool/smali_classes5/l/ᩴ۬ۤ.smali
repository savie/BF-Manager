.class public final Ll/ᩴ۬ۤ;
.super Ljava/lang/Object;
.source "U7HQ"


# static fields
.field private static final ᩻ܺۨ:[S


# instance fields
.field public ۙ:Ll/᩸۬ۤ;

.field public final ᩷:Lbin/mt/plugin/api/translation/TranslationEngine;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x39

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴ۬ۤ;->᩻ܺۨ:[S

    return-void

    :array_0
    .array-data 2
        0x1d6as
        -0x56des
        -0x56b4s
        -0x56b3s
        -0x56bcs
        -0x56bfs
        -0x56bbs
        -0x56bfs
        -0x56a4s
        -0x56b3s
        -0x56a6s
        -0x5699s
        -0x56a6s
        -0x56bfs
        -0x56b1s
        -0x56bfs
        -0x56bas
        -0x56b7s
        -0x56bcs
        -0x5700s
        -0x56ffs
        -0x56ees
        -0x56des
        -0x5684s
        -0x56a6s
        -0x56b7s
        -0x56bas
        -0x56a5s
        -0x56bcs
        -0x56b7s
        -0x56a4s
        -0x56b3s
        -0x56b4s
        -0x5700s
        -0x5684s
        -0x56a6s
        -0x56b7s
        -0x56bas
        -0x56a5s
        -0x56bcs
        -0x56b7s
        -0x56a4s
        -0x56bfs
        -0x56b9s
        -0x56bas
        -0x56f8s
        -0x56b2s
        -0x56b7s
        -0x56bfs
        -0x56bcs
        -0x56b3s
        -0x56b4s
        -0x56ees
        -0x56f8s
        -0x56fas
        -0x56fas
        -0x56fas
    .end array-data
.end method

.method public constructor <init>(Lbin/mt/plugin/api/translation/TranslationEngine;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x657a736f

    sget v2, Ll/ۖۗ;->᩻ܳܶ:I

    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u1a73\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x31e1

    const v6, 0x6fb09b7d

    xor-int/2addr v5, v6

    const v6, -0x4ba4de0c

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x7347

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 21
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-lez v4, :cond_9

    goto :goto_1

    :sswitch_0
    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-lez v4, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v4, "\u06eb\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1917

    const v6, -0x23f13e32

    xor-int/2addr v5, v6

    const v6, 0x4a234158    # 2674774.0f

    goto :goto_0

    .line 23
    :sswitch_2
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 29
    :sswitch_4
    new-instance v4, Ll/᩸۬ۤ;

    .line 13
    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v5, :cond_1

    goto/16 :goto_3

    .line 29
    :cond_1
    iget v5, v0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->maxTranslationTextLength:I

    .line 22
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v6

    if-gtz v6, :cond_2

    goto/16 :goto_3

    .line 29
    :cond_2
    iget-object p1, v0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->textLengthCalculator:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    invoke-direct {v4, p0, v5, p1}, Ll/᩸۬ۤ;-><init>(Ll/ᩴ۬ۤ;ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;)V

    iput-object v4, p0, Ll/ᩴ۬ۤ;->ۙ:Ll/᩸۬ۤ;

    return-void

    .line 0
    :sswitch_5
    sget v4, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06e1\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x42ff

    const v6, 0x18c8cd9

    xor-int/2addr v5, v6

    const v6, -0x1582bf85

    goto :goto_0

    .line 21
    :sswitch_6
    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u1a79\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5757

    const v6, -0x1f0a2fdf

    xor-int/2addr v5, v6

    const v6, -0x47723b48

    goto/16 :goto_0

    .line 23
    :sswitch_7
    sget-boolean v4, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06e8\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3bdb

    const v6, -0xcbe5d9e

    xor-int/2addr v5, v6

    const v6, 0x3d86727b

    goto/16 :goto_0

    .line 13
    :sswitch_8
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v4

    if-gtz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06dc\u0736"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1313

    const v6, -0x19476036

    xor-int/2addr v5, v6

    const v6, -0x22df08f0

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v4, :cond_7

    :goto_2
    const-string v4, "\u0730\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5d6f

    const v6, 0x57a5c513

    xor-int/2addr v5, v6

    const v6, 0x560e886b

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a78\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x42c5

    const v6, -0x5431eeb

    xor-int/2addr v5, v6

    const v6, 0x611b93d

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_8

    :goto_3
    const-string v4, "\u1a76\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x195b

    const v6, 0x36d15aba

    xor-int/2addr v5, v6

    const v6, 0x5673c956

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u05a1\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x778d

    const v6, 0x549ae6cf

    xor-int/2addr v5, v6

    const v6, -0x4c5b51e9

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_a

    :cond_9
    const-string v4, "\u1a74\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x87b

    const v6, 0x178a1bff

    xor-int/2addr v5, v6

    const v6, 0x982fb7d

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e1\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2a43

    const v6, -0x65743bdf

    xor-int/2addr v5, v6

    const v6, -0x7b702a7c

    goto/16 :goto_0

    .line 25
    :sswitch_c
    iput-object p1, p0, Ll/ᩴ۬ۤ;->᩷:Lbin/mt/plugin/api/translation/TranslationEngine;

    .line 27
    invoke-interface {p1}, Lbin/mt/plugin/api/translation/TranslationEngine;->getConfiguration()Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    move-result-object v0

    .line 25
    sget v4, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06e2\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x431

    const v6, -0xd1ba430

    xor-int/2addr v5, v6

    const v6, -0x585a0996

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e4\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x484f

    const v6, -0x11cec757

    xor-int/2addr v5, v6

    const v6, -0x517c2cab

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7964bffd -> :sswitch_1
        -0x6ee63b28 -> :sswitch_6
        -0x6c273df3 -> :sswitch_6
        -0x6b42a3be -> :sswitch_2
        -0x615cf11b -> :sswitch_4
        -0x5a699bc1 -> :sswitch_c
        -0x3f7970a8 -> :sswitch_c
        -0x33e9bc91 -> :sswitch_1
        -0x32c850ea -> :sswitch_a
        -0x2e7b6097 -> :sswitch_2
        -0x27326262 -> :sswitch_3
        -0x2677bc80 -> :sswitch_a
        -0x25a248c8 -> :sswitch_b
        -0x2394b005 -> :sswitch_9
        -0x66f8dad -> :sswitch_9
        0x9ce92ec -> :sswitch_8
        0xa614544 -> :sswitch_b
        0x1092f319 -> :sswitch_7
        0x1da4b790 -> :sswitch_0
        0x22d0f9b4 -> :sswitch_3
        0x278e29f2 -> :sswitch_5
        0x38c82db4 -> :sswitch_7
        0x54f08378 -> :sswitch_5
        0x69b66d54 -> :sswitch_4
        0x73649008 -> :sswitch_8
        0x7d5f55ec -> :sswitch_0
    .end sparse-switch
.end method

.method public static ۙ(Z[Ljava/lang/String;)Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p1

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

    const v15, -0x333e452a

    sget v16, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v17, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v18, "\u1a73\u06e0"

    invoke-static/range {v18 .. v18}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    xor-int v1, v18, v17

    mul-int/lit16 v1, v1, -0x68ef

    const v20, -0x75ffb370

    xor-int v1, v1, v20

    const v20, -0x17284d7b

    xor-int v18, v18, v20

    move-object v7, v6

    move/from16 v19, v18

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, -0x333e452a

    const/16 v20, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v3, v18, v17

    mul-int/lit16 v3, v3, 0x6317

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v18, v19, v1

    sparse-switch v18, :sswitch_data_0

    const/16 v1, 0x3d

    const/16 v12, 0x3d

    goto/16 :goto_9

    :sswitch_0
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v1, :cond_f

    goto/16 :goto_5

    .line 50
    :sswitch_1
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-nez v1, :cond_11

    goto/16 :goto_5

    .line 40
    :sswitch_2
    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v1, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v1, "\u06e2\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x5dd

    const v19, -0x41cd3221

    xor-int v3, v3, v19

    const v19, 0x203145c2

    goto/16 :goto_a

    .line 104
    :sswitch_3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v1, Ll/֡᩵;->ۤܳ۬:I

    if-gez v1, :cond_c

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    goto/16 :goto_5

    .line 5
    :sswitch_5
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_6
    add-int/lit8 v9, v9, 0x1

    move v10, v14

    move v13, v15

    goto/16 :goto_3

    :sswitch_7
    add-int/lit8 v1, v13, 0x1

    if-le v1, v10, :cond_1

    move v14, v1

    move v15, v14

    goto :goto_1

    :cond_1
    move v15, v1

    move v14, v10

    goto :goto_1

    :sswitch_8
    const/4 v1, 0x0

    move v14, v10

    const/4 v15, 0x0

    :goto_1
    const-string v1, "\u0736\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x6d

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x5b61

    const v19, -0x71234695

    xor-int v3, v3, v19

    const v19, 0x5d976b39

    goto/16 :goto_a

    :sswitch_9
    add-int/lit8 v1, v10, 0x1

    move v11, v1

    goto :goto_2

    :sswitch_a
    add-int/lit8 v4, v4, 0x1

    move v5, v11

    goto/16 :goto_4

    .line 131
    :sswitch_b
    invoke-static {v7, v9}, Ll/ۘܽ;->᩷۬ܽ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v12, :cond_2

    const-string v1, "\u06db\u0730"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0xf

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x1e77

    const v19, 0xc3fc7ef

    xor-int v3, v3, v19

    const v19, 0x7c05d0c

    goto/16 :goto_a

    :cond_2
    const-string v1, "\u1a7b\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x649b

    const v19, -0x5f68df8b

    xor-int v3, v3, v19

    const v19, 0x7794a809

    goto/16 :goto_a

    :sswitch_c
    if-lt v10, v5, :cond_3

    const-string v1, "\u1a77\u05ab"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x871

    const v19, -0x785ce8cb

    xor-int v3, v3, v19

    const v19, 0x6954234a

    goto/16 :goto_a

    :cond_3
    move v11, v5

    :goto_2
    const-string v1, "\u06e7\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x201b

    const v19, -0x3905e88a

    xor-int v3, v3, v19

    const v19, -0x62fc33af

    goto/16 :goto_a

    .line 130
    :sswitch_d
    invoke-static {v7}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v1

    if-ge v9, v1, :cond_4

    const-string v1, "\u0733\u0733"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x75

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x27db

    const v19, -0x397069eb

    xor-int v3, v3, v19

    const v19, 0x71497b85

    goto/16 :goto_a

    :cond_4
    const-string v1, "\u05a8\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x1f

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x3b69

    const v19, -0x2606eb2b

    xor-int v3, v3, v19

    const v19, 0x57fcdd63

    goto/16 :goto_a

    :sswitch_e
    const/4 v1, 0x0

    const/4 v3, 0x0

    move v9, v8

    const/4 v10, 0x0

    const/4 v13, 0x0

    :goto_3
    const-string v1, "\u0733\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x6377

    const v19, 0x4434ccab

    xor-int v3, v3, v19

    const v19, 0x5e27ce1e

    goto/16 :goto_a

    .line 127
    :sswitch_f
    aget-object v7, v0, v4

    const/4 v8, 0x0

    .line 58
    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v1, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v1, "\u0736\u06d7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x323

    const v19, 0x404ab937

    xor-int v3, v3, v19

    const v19, 0x7b06ef75

    goto/16 :goto_a

    .line 147
    :sswitch_10
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/lang/String;-><init>([C)V

    return-object v0

    .line 145
    :sswitch_11
    new-array v6, v5, [C

    .line 146
    invoke-static {v6, v12}, Ljava/util/Arrays;->fill([CC)V

    .line 8
    sget v1, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v1, :cond_6

    const-string v1, "\u06df\u06df"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x59

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x3721

    const v19, 0x5e3e4fda

    xor-int v3, v3, v19

    const v19, -0x2658a8c7

    goto/16 :goto_a

    :cond_6
    const-string v1, "\u05ab\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x27

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x23e1

    const v19, 0x7a1f18ec

    xor-int v3, v3, v19

    const v19, -0x2439aa3b    # -1.116527E17f

    goto/16 :goto_a

    :sswitch_12
    if-ge v4, v2, :cond_7

    const-string v1, "\u06e8\u06e0"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x1d

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x4a99

    const v19, 0x4dbf15b3    # 4.007338E8f

    xor-int v3, v3, v19

    const v19, 0x256f80b9

    goto/16 :goto_a

    :cond_7
    const-string v1, "\u06ec\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x2909

    const v19, -0x5291c396

    xor-int v3, v3, v19

    const v19, -0x146dbd91

    goto/16 :goto_a

    :sswitch_13
    const/4 v1, 0x0

    move/from16 v5, v20

    const/4 v4, 0x0

    :goto_4
    const-string v1, "\u0730\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x5fc7

    const v19, 0xbb11875

    xor-int v3, v3, v19

    const v19, -0x45f780a6

    goto/16 :goto_a

    .line 31
    :sswitch_14
    sget v1, Ll/۬;->᩸ۜ᩹:I

    if-eqz v1, :cond_8

    goto :goto_5

    :cond_8
    const-string v1, "\u06ec\u05ab"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x7b

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x14ef

    const v19, 0x3a455d59

    xor-int v3, v3, v19

    const v19, 0x9cda768

    goto/16 :goto_a

    .line 89
    :sswitch_15
    sget v1, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v1, :cond_9

    :goto_5
    const-string v1, "\u1a78\u0733"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x2e8b

    const v19, -0x641b7c50

    xor-int v3, v3, v19

    const v19, 0x4387fed4

    goto/16 :goto_a

    :cond_9
    const-string v1, "\u0733\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x59b9

    const v19, -0x47ca0f7c

    xor-int v3, v3, v19

    const v19, -0x14f7d1ee

    goto/16 :goto_a

    :sswitch_16
    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v1, :cond_a

    goto :goto_6

    :cond_a
    const-string v1, "\u06ec\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x369b

    const v19, -0x3506f18e    # -8161081.0f

    xor-int v3, v3, v19

    const v19, -0x2c4158cb

    goto/16 :goto_a

    .line 127
    :sswitch_17
    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v1, :cond_b

    goto :goto_6

    :cond_b
    const-string v1, "\u0736\u06df"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x6955

    const v19, 0x21356025

    xor-int v3, v3, v19

    const v19, 0x442f3c7f

    goto/16 :goto_a

    :sswitch_18
    sget v1, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v1, :cond_d

    :cond_c
    :goto_6
    const-string v1, "\u06eb\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x343b

    const v19, 0x1b610840

    xor-int v3, v3, v19

    const v19, -0x4bb72ae1

    goto/16 :goto_a

    :cond_d
    const-string v1, "\u0733\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x19eb

    const v19, -0x5df08706

    xor-int v3, v3, v19

    const v19, -0x425033be

    goto/16 :goto_a

    .line 49
    :sswitch_19
    sget-boolean v1, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v1, :cond_e

    goto :goto_7

    :cond_e
    const-string v1, "\u06dc\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x51

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x2265

    const v19, 0x33a3ed94

    xor-int v3, v3, v19

    const v19, -0x44bc0d8e

    goto/16 :goto_a

    .line 59
    :sswitch_1a
    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v1, :cond_10

    :cond_f
    :goto_7
    const-string v1, "\u1a79\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x2f

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x5ac5

    const v19, -0x1b663cf1

    xor-int v3, v3, v19

    const v19, -0x46cd03e7

    goto/16 :goto_a

    :cond_10
    const-string v1, "\u06e2\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x1f45

    const v19, -0x63ce37ef

    xor-int v3, v3, v19

    const v19, 0x6a085303

    goto/16 :goto_a

    .line 127
    :sswitch_1b
    array-length v2, v0

    const/16 v20, 0x8

    sget v1, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v1, :cond_12

    :cond_11
    :goto_8
    const-string v1, "\u06e8\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0xf91

    const v19, 0x4dd7dfa7    # 4.5271984E8f

    xor-int v3, v3, v19

    const v19, -0x2f860cbc

    goto :goto_a

    :cond_12
    const-string v1, "\u0730\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0xf

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x75e3

    const v19, 0x6393ed6d

    xor-int v3, v3, v19

    const v19, 0x7ef47e20

    goto :goto_a

    :sswitch_1c
    const/16 v1, 0x2d

    const/16 v12, 0x2d

    :goto_9
    const-string v1, "\u05a8\u06e0"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x1a13

    const v19, -0xb80fc44

    xor-int v3, v3, v19

    const v19, -0x7d074aba

    goto :goto_a

    :sswitch_1d
    if-eqz p0, :cond_13

    const-string v1, "\u1a75\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x76cb

    const v19, -0x4deeafe

    xor-int v3, v3, v19

    const v19, -0x444b86f8

    goto :goto_a

    :cond_13
    const-string v1, "\u1a78\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x51

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x6df5

    const v19, -0x5e999627

    xor-int v3, v3, v19

    const v19, 0x4d87acc1    # 2.8453072E8f

    :goto_a
    xor-int v19, v1, v19

    move v1, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7feb8743 -> :sswitch_19
        -0x765b3aeb -> :sswitch_9
        -0x730b9e9f -> :sswitch_1c
        -0x724cbd4f -> :sswitch_13
        -0x7065510f -> :sswitch_b
        -0x6f0e515a -> :sswitch_f
        -0x6ee50170 -> :sswitch_e
        -0x6b5867d3 -> :sswitch_10
        -0x69abecb9 -> :sswitch_12
        -0x69795b24 -> :sswitch_3
        -0x6274ef2b -> :sswitch_8
        -0x5b9509f9 -> :sswitch_c
        -0x5971d786 -> :sswitch_4
        -0x520310e1 -> :sswitch_19
        -0x4c901740 -> :sswitch_7
        -0x47b7efa9 -> :sswitch_7
        -0x3fd67b0f -> :sswitch_a
        -0x3fc47896 -> :sswitch_0
        -0x3dd8c85a -> :sswitch_1
        -0x3cd1a0e3 -> :sswitch_1a
        -0x34c1e56e -> :sswitch_18
        -0x2cbf0009 -> :sswitch_8
        -0x299fc60a -> :sswitch_16
        -0x201fdb89 -> :sswitch_9
        -0x176feaa3 -> :sswitch_d
        -0x16b9e389 -> :sswitch_d
        -0xe66b42a -> :sswitch_c
        -0xe082a2b -> :sswitch_10
        -0xd6718c1 -> :sswitch_16
        -0xacc07ba -> :sswitch_5
        0x18e6838 -> :sswitch_11
        0x427553c -> :sswitch_11
        0x4adca6b -> :sswitch_b
        0x8c36f91 -> :sswitch_1d
        0xcbfbb30 -> :sswitch_12
        0xcdf14cf -> :sswitch_6
        0xd287aa4 -> :sswitch_2
        0x267e36db -> :sswitch_6
        0x280569b7 -> :sswitch_1b
        0x2bb40116 -> :sswitch_a
        0x32120bf3 -> :sswitch_1
        0x35ce3a12 -> :sswitch_1a
        0x39a28c8d -> :sswitch_15
        0x3a245ef8 -> :sswitch_5
        0x3a65f452 -> :sswitch_2
        0x3d11c7c1 -> :sswitch_17
        0x3efd42ca -> :sswitch_15
        0x459d34c5 -> :sswitch_0
        0x51abc02c -> :sswitch_1c
        0x57b3df13 -> :sswitch_17
        0x5dbff535 -> :sswitch_14
        0x5e54fffb -> :sswitch_4
        0x5e63b561 -> :sswitch_1d
        0x60421684 -> :sswitch_14
        0x676da818 -> :sswitch_13
        0x684a8afa -> :sswitch_f
        0x68e4f4fa -> :sswitch_1b
        0x74ed4162 -> :sswitch_18
        0x7dbdc443 -> :sswitch_e
        0x7f97edf1 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()Ll/᩸۬ۤ;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ᩴ۬ۤ;->ۙ:Ll/᩸۬ۤ;

    return-object v0
.end method

.method public final ۙ([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 32

    move-object/from16 v0, p1

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, 0x5ba02a37

    sget v22, Ll/᩶;->ᩴ᩶ۛ:I

    sget v23, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v24, "\u05a1\u1a74"

    invoke-static/range {v24 .. v24}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v24

    xor-int v24, v24, v23

    xor-int v1, v24, v22

    mul-int/lit16 v1, v1, 0x6ab5

    const v26, 0x73cb197f

    xor-int v1, v1, v26

    const v26, -0x2568cc28

    xor-int v24, v24, v26

    move-object v5, v4

    move-object/from16 v18, v9

    move-object v11, v10

    move-object v13, v12

    move-object v14, v15

    move-object/from16 v10, v17

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v17, v2

    move-object v4, v3

    move-object v9, v8

    move-object/from16 v3, v16

    move-object/from16 v8, v20

    const/4 v2, 0x0

    move-object/from16 v20, v7

    move-object v7, v6

    :goto_0
    xor-int v6, v21, v22

    mul-int/lit16 v6, v6, -0x5e11

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v1, v6

    xor-int v21, v24, v1

    sparse-switch v21, :sswitch_data_0

    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v1, v27

    move/from16 v26, v2

    move-object/from16 v2, v17

    .line 75
    sget v0, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v0, :cond_16

    goto/16 :goto_1c

    .line 15
    :sswitch_0
    sget v1, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v1, :cond_1

    :cond_0
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v26, v2

    move-object/from16 v2, v17

    goto/16 :goto_1a

    :cond_1
    const-string v1, "\u06d8\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v23, v1

    mul-int/lit8 v1, v1, -0x4b

    xor-int v6, v1, v22

    mul-int/lit16 v6, v6, 0x987

    const v24, 0x12cecbe2

    xor-int v6, v6, v24

    const v24, -0x16d16a1e

    goto/16 :goto_6

    .line 57
    :sswitch_1
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-nez v1, :cond_3

    :cond_2
    :goto_1
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    :goto_2
    move-object/from16 v8, v18

    move/from16 v3, v26

    move/from16 v1, v27

    move/from16 v26, v2

    move-object/from16 v2, v17

    goto/16 :goto_1c

    :cond_3
    move-object/from16 v1, p0

    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v6, v20

    move/from16 v3, v26

    move-object/from16 v8, p2

    :goto_3
    move-object/from16 v20, v9

    move-object/from16 v9, p3

    goto/16 :goto_f

    .line 75
    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v1, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v1, :cond_4

    goto :goto_1

    :cond_4
    :goto_4
    const-string v1, "\u06d7\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, 0x23

    xor-int v6, v1, v23

    mul-int/lit16 v6, v6, 0x7ab1

    const v24, 0x5941787e

    xor-int v6, v6, v24

    const v24, 0x6345e751

    goto :goto_6

    .line 86
    :sswitch_4
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v1

    if-nez v1, :cond_2

    :goto_5
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    goto/16 :goto_7

    :sswitch_5
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto :goto_5

    :sswitch_6
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_7
    const/16 v1, 0x36

    const/4 v3, 0x3

    .line 89
    invoke-static {v8, v1, v3, v15}, Ll/֨ܿ;->᩻ۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    goto/16 :goto_b

    :sswitch_8
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x63

    invoke-static {v9, v2, v1}, Ll/֡ۖ;->ܳ᩶᩷(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v8, Ll/ᩴ۬ۤ;->᩻ܺۨ:[S

    .line 12
    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v1, :cond_5

    goto/16 :goto_1

    :cond_5
    const-string v1, "\u1a7b\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x37

    xor-int v6, v1, v23

    mul-int/lit16 v6, v6, 0x4b5d

    const v24, -0x4faf3ddc

    xor-int v6, v6, v24

    const v24, -0x1cf6a4b0

    :goto_6
    xor-int v24, v1, v24

    goto/16 :goto_18

    .line 91
    :sswitch_9
    new-instance v0, Ljava/io/IOException;

    sget-object v1, Ll/ᩴ۬ۤ;->᩻ܺۨ:[S

    const/16 v2, 0x22

    const/16 v4, 0x14

    invoke-static {v1, v2, v4, v15}, Ll/ۖ֡;->ۢ۫᩷([SIII)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v1, v3}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 91
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :sswitch_a
    invoke-static/range {v25 .. v25}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v1}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/String;)V

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v6, Ll/ᩴ۬ۤ;->᩻ܺۨ:[S

    .line 2
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v24

    if-gtz v24, :cond_6

    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    goto :goto_8

    :cond_6
    move-object/from16 v24, v3

    const/16 v3, 0x17

    move-object/from16 v28, v8

    const/16 v8, 0xb

    .line 85
    invoke-static {v6, v3, v8, v15}, Ll/ۖ᩹;->ᩳۨ֨([SIII)Ljava/lang/String;

    move-result-object v3

    sget-boolean v6, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v6, :cond_7

    :goto_7
    const-string v1, "\u06d6\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v23, v1

    mul-int/lit8 v1, v1, 0x47

    xor-int v3, v1, v22

    mul-int/lit16 v3, v3, 0x23cf

    const v6, 0x588a90cf

    xor-int/2addr v3, v6

    const v6, 0x7305b493

    xor-int/2addr v1, v6

    goto/16 :goto_10

    :cond_7
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v3, v11

    invoke-static {v1, v3}, Ll/ۘ֡;->ᩳ᩸ܺ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {v1, v14}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1, v9}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v1}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/String;)V

    move-object/from16 v1, v25

    move/from16 v3, v26

    goto/16 :goto_c

    :sswitch_b
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    .line 84
    invoke-static {v1, v14}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1, v7}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v3

    if-gtz v3, :cond_8

    :goto_8
    const-string v3, "\u06eb\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v22

    xor-int v6, v3, v23

    mul-int/lit16 v6, v6, -0x6545

    const v8, -0x22275e33

    xor-int/2addr v6, v8

    const v8, 0x6db0e9cd

    goto/16 :goto_a

    :cond_8
    const-string v3, "\u06df\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v22

    mul-int/lit8 v3, v3, -0x1f

    xor-int v6, v3, v23

    mul-int/lit16 v6, v6, 0x229d

    const v8, 0x5ae3b893

    xor-int/2addr v6, v8

    const v8, -0x2b1d2a53

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    .line 84
    sget-object v3, Ll/ᩴ۬ۤ;->᩻ܺۨ:[S

    const/16 v6, 0x14

    const/4 v8, 0x3

    invoke-static {v3, v6, v8, v15}, Ll/֡ܳ;->ܺܽۧ([SIII)Ljava/lang/String;

    move-result-object v14

    .line 8
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_9

    goto :goto_9

    :cond_9
    const-string v3, "\u06eb\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v23

    mul-int/lit8 v3, v3, -0x79

    xor-int v6, v3, v22

    mul-int/lit16 v6, v6, 0x465f

    const v8, 0x2e30500e

    xor-int/2addr v6, v8

    const v8, -0x4683051e

    goto :goto_a

    :sswitch_d
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    .line 84
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v3, Ll/ᩴ۬ۤ;->᩻ܺۨ:[S

    const/16 v6, 0xb

    const/16 v8, 0x9

    invoke-static {v3, v6, v8, v15}, Ll/ۗ֡;->ۘ᩺ۘ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v6

    if-nez v6, :cond_a

    goto/16 :goto_2

    .line 84
    :cond_a
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v3, v0

    invoke-static {v1, v3}, Ll/ۘ֡;->ᩳ᩸ܺ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    .line 22
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v3

    if-nez v3, :cond_b

    :goto_9
    move-object/from16 v8, p2

    move-object/from16 v25, v1

    move-object/from16 v6, v20

    move/from16 v3, v26

    move-object/from16 v1, p0

    goto/16 :goto_3

    :cond_b
    const-string v3, "\u06d6\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v22, v3

    mul-int/lit8 v3, v3, 0x53

    xor-int v6, v3, v23

    mul-int/lit16 v6, v6, 0x53a7

    const v8, 0x1fc75130

    xor-int/2addr v6, v8

    const v8, 0x128208d8

    :goto_a
    xor-int/2addr v3, v8

    move-object/from16 v25, v1

    move v1, v6

    move-object/from16 v8, v28

    move-object/from16 v30, v24

    move/from16 v24, v3

    goto/16 :goto_11

    :sswitch_e
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    .line 88
    invoke-static {v9}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v3

    const/16 v6, 0x64

    if-le v3, v6, :cond_c

    const-string v3, "\u06e0\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v22

    mul-int/lit8 v3, v3, -0x19

    xor-int v6, v3, v23

    mul-int/lit16 v6, v6, -0x5285

    const v8, -0x7af725be

    xor-int/2addr v6, v8

    const v8, -0x2e867677

    goto :goto_a

    :cond_c
    move-object v3, v9

    :goto_b
    const-string v6, "\u1a7a\u1a7b"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v23

    mul-int/lit8 v6, v6, 0x55

    xor-int v8, v6, v22

    mul-int/lit16 v8, v8, 0x640d

    const v24, 0x5d5fa47a

    xor-int v8, v8, v24

    const v24, 0x60b7ec2d

    xor-int v24, v6, v24

    move-object/from16 v25, v1

    move v1, v8

    goto/16 :goto_15

    :sswitch_f
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    .line 0
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    aget-object v3, v0, v12

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v12, v12, 0x1

    move/from16 v3, v26

    goto/16 :goto_d

    :sswitch_10
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    move/from16 v3, v26

    .line 78
    invoke-static {v3, v0}, Ll/ᩴ۬ۤ;->ۙ(Z[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    move-object/from16 v17, v6

    move-object/from16 v8, v18

    const/16 v19, 0x1

    move-object/from16 v18, v1

    goto/16 :goto_13

    :sswitch_11
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    move/from16 v3, v26

    .line 82
    invoke-interface/range {v20 .. v20}, Lbin/mt/plugin/api/translation/TranslationEngine;->getContext()Lbin/mt/plugin/api/PluginContext;

    move-result-object v13

    if-eqz v13, :cond_d

    const-string v6, "\u0730\u06ec"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v23

    mul-int/lit8 v6, v6, -0x65

    xor-int v8, v6, v22

    mul-int/lit16 v8, v8, -0x2723

    const v25, 0x39040785

    xor-int v8, v8, v25

    const v25, 0x7f61ba45    # 3.0004347E38f

    goto/16 :goto_e

    :cond_d
    :goto_c
    const-string v6, "\u1a77\u06d6"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v23

    mul-int/lit8 v6, v6, -0x1d

    xor-int v8, v6, v22

    mul-int/lit16 v8, v8, -0x504d

    const v25, -0x5c34cc28

    xor-int v8, v8, v25

    const v25, -0x179976ee

    goto/16 :goto_e

    :sswitch_12
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    move/from16 v3, v26

    .line 0
    array-length v6, v0

    if-ge v12, v6, :cond_e

    const-string v6, "\u0730\u06e2"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    xor-int v8, v6, v23

    mul-int/lit16 v8, v8, 0x38b3

    const v25, -0x3998ec53

    xor-int v8, v8, v25

    const v25, 0x2f942dcd

    goto :goto_e

    :cond_e
    move/from16 v26, v2

    move v2, v3

    move-object/from16 v8, v18

    move-object/from16 v18, v1

    goto/16 :goto_12

    :sswitch_13
    return-object v11

    :sswitch_14
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    move/from16 v3, v26

    if-nez v19, :cond_f

    const-string v6, "\u05a1\u06d8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v22, v6

    mul-int/lit8 v6, v6, 0x45

    xor-int v8, v6, v23

    mul-int/lit16 v8, v8, 0x4d43

    const v25, -0x1c4cafcd

    xor-int v8, v8, v25

    const v25, -0x6e7ea065

    goto :goto_e

    :cond_f
    const-string v6, "\u073f\u06e7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v23

    xor-int v8, v6, v22

    mul-int/lit16 v8, v8, 0x6603

    const v25, 0x2d188580

    xor-int v8, v8, v25

    const v25, -0x36545479

    goto :goto_e

    :sswitch_15
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    move/from16 v3, v26

    aget-object v6, v0, v2

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const/4 v6, 0x1

    const/4 v12, 0x1

    :goto_d
    const-string v6, "\u1a7b\u073d"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v23

    mul-int/lit8 v6, v6, -0x75

    xor-int v8, v6, v22

    mul-int/lit16 v8, v8, 0x2de5

    const v25, -0x6223cc3c

    xor-int v8, v8, v25

    const v25, 0x77f58b95

    :goto_e
    xor-int v6, v6, v25

    move-object/from16 v25, v1

    move/from16 v26, v3

    move v1, v8

    move-object/from16 v3, v24

    move-object/from16 v8, v28

    goto/16 :goto_19

    :sswitch_16
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    move/from16 v3, v26

    const/4 v6, -0x1

    move-object/from16 v8, v18

    .line 70
    invoke-virtual {v9, v8, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v11

    .line 72
    array-length v6, v11

    move-object/from16 v18, v1

    array-length v1, v0

    if-ne v6, v1, :cond_10

    const-string v1, "\u06e7\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v6, v1, v23

    mul-int/lit16 v6, v6, 0x784b

    const v25, 0x9835283

    xor-int v6, v6, v25

    const v25, -0x3dbc23e9

    goto/16 :goto_14

    :cond_10
    const-string v1, "\u06e0\u06d7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v6, v1, v22

    mul-int/lit16 v6, v6, -0x7d4d

    const v25, -0x4d6b8e97

    xor-int v6, v6, v25

    const v25, 0x683655f6

    goto/16 :goto_14

    :sswitch_17
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v18, v25

    move/from16 v3, v26

    .line 0
    invoke-static {v5}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v1, p0

    .line 68
    iget-object v6, v1, Ll/ᩴ۬ۤ;->᩷:Lbin/mt/plugin/api/translation/TranslationEngine;

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    invoke-interface {v6, v7, v8, v9}, Lbin/mt/plugin/api/translation/TranslationEngine;->translate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 70
    invoke-static {v4}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    .line 64
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v26

    if-eqz v26, :cond_11

    move-object/from16 v30, v25

    move-object/from16 v25, v18

    move-object/from16 v18, v30

    :goto_f
    const-string v26, "\u06ec\u1a79"

    invoke-static/range {v26 .. v26}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v26

    sub-int v26, v22, v26

    mul-int/lit8 v26, v26, 0x37

    xor-int v1, v26, v23

    mul-int/lit16 v1, v1, 0x15fb

    const v29, 0x4fb0ab34

    xor-int v1, v1, v29

    const v29, -0x732192f9

    xor-int v26, v26, v29

    move-object/from16 v9, v20

    move-object/from16 v8, v28

    move-object/from16 v20, v6

    move/from16 v30, v26

    move/from16 v26, v3

    move-object/from16 v3, v24

    move/from16 v24, v30

    goto/16 :goto_0

    :cond_11
    const-string v1, "\u06dc\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x17

    move/from16 v26, v2

    xor-int v2, v1, v23

    mul-int/lit16 v2, v2, 0x7a0f

    const v29, -0x6dec2eed

    xor-int v2, v2, v29

    const v29, -0x19ef1c6c

    xor-int v1, v1, v29

    move-object/from16 v9, v20

    move-object/from16 v8, v28

    move-object/from16 v20, v6

    move-object/from16 v30, v24

    move/from16 v24, v1

    move v1, v2

    move/from16 v2, v26

    move/from16 v26, v3

    move-object/from16 v3, v30

    move-object/from16 v31, v25

    move-object/from16 v25, v18

    move-object/from16 v18, v31

    goto/16 :goto_0

    :sswitch_18
    move/from16 v26, v2

    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    .line 0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    array-length v1, v0

    const/4 v2, 0x1

    if-lez v1, :cond_12

    const-string v1, "\u06d9\u1a74"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x7b

    xor-int v3, v1, v23

    mul-int/lit16 v3, v3, 0x4295

    const v6, 0x675cf998

    xor-int/2addr v3, v6

    const v6, -0x761364ea

    xor-int/2addr v1, v6

    move-object/from16 v25, v18

    move/from16 v2, v26

    const/16 v26, 0x1

    move-object/from16 v18, v8

    :goto_10
    move-object/from16 v8, v28

    move-object/from16 v30, v24

    move/from16 v24, v1

    move v1, v3

    :goto_11
    move-object/from16 v3, v30

    goto/16 :goto_0

    :cond_12
    :goto_12
    const-string v1, "\u0736\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v23

    mul-int/lit8 v1, v1, -0x77

    xor-int v3, v1, v22

    mul-int/lit16 v3, v3, -0x4f7f

    const v6, 0x68439fa

    xor-int/2addr v3, v6

    const v6, 0x826d4c6

    xor-int/2addr v1, v6

    move-object/from16 v25, v18

    move-object/from16 v18, v8

    move-object/from16 v8, v28

    move-object/from16 v30, v24

    move/from16 v24, v1

    move v1, v3

    move-object/from16 v3, v30

    move/from16 v31, v26

    move/from16 v26, v2

    move/from16 v2, v31

    goto/16 :goto_0

    :sswitch_19
    new-instance v0, Ljava/lang/NullPointerException;

    sget-object v1, Ll/ᩴ۬ۤ;->᩻ܺۨ:[S

    const/4 v2, 0x2

    const/16 v3, 0x9

    invoke-static {v1, v2, v3, v15}, Ll/֫ܺ;->᩸ܰۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_1a
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v26, v2

    .line 62
    sget-object v1, Ll/ᩴ۬ۤ;->᩻ܺۨ:[S

    const/4 v2, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v15}, Ll/ܽ;->᩷ܰۨ([SIII)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v17

    .line 0
    invoke-static {v1, v2, v1}, Ll/ܰ۟ۙ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_13

    const-string v1, "\u05a8\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v6, v1, v22

    mul-int/lit16 v6, v6, 0x47b9

    const v17, -0x59fd939e

    xor-int v6, v6, v17

    const v17, -0x43cf0337

    goto/16 :goto_17

    :cond_13
    const-string v1, "\u06df\u06df"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v6, v1, v23

    mul-int/lit16 v6, v6, -0x50f

    const v17, -0x2c4f2c99

    xor-int v6, v6, v17

    const v17, 0x3384cb51

    goto/16 :goto_17

    :sswitch_1b
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    const/4 v1, 0x0

    .line 62
    invoke-static {v1, v0}, Ll/ᩴ۬ۤ;->ۙ(Z[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    move-object/from16 v17, v2

    const/4 v2, 0x0

    const/16 v19, 0x0

    :goto_13
    const-string v1, "\u06e1\u1a7b"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v6, v1, v22

    mul-int/lit16 v6, v6, 0x1d59

    const v25, 0x170ee3ef

    xor-int v6, v6, v25

    const v25, -0x5fb31999

    :goto_14
    xor-int v1, v1, v25

    move/from16 v26, v3

    move-object/from16 v25, v18

    move-object/from16 v3, v24

    move/from16 v24, v1

    move v1, v6

    move-object/from16 v18, v8

    :goto_15
    move-object/from16 v8, v28

    goto/16 :goto_0

    :sswitch_1c
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v26, v2

    move-object/from16 v2, v17

    const/16 v1, 0x48c5

    const/16 v15, 0x48c5

    goto :goto_16

    :sswitch_1d
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v26, v2

    move-object/from16 v2, v17

    const v1, 0xa928

    const v15, 0xa928

    :goto_16
    const-string v1, "\u1a7b\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x27

    xor-int v6, v1, v23

    mul-int/lit16 v6, v6, -0x6fdd

    const v17, 0x70419a41

    xor-int v6, v6, v17

    const v17, 0x4a92ae5d    # 4806446.5f

    :goto_17
    xor-int v1, v1, v17

    move-object/from16 v17, v2

    move-object/from16 v25, v18

    move/from16 v2, v26

    move/from16 v26, v3

    move-object/from16 v18, v8

    move-object/from16 v3, v24

    move-object/from16 v8, v28

    move/from16 v24, v1

    :goto_18
    move v1, v6

    goto/16 :goto_0

    :sswitch_1e
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v26, v2

    move-object/from16 v2, v17

    move/from16 v1, v27

    mul-int/lit16 v6, v1, 0x2386

    mul-int v27, v1, v1

    const v17, 0x13b7a89

    add-int v27, v27, v17

    sub-int v27, v27, v6

    if-ltz v27, :cond_14

    const-string v6, "\u06da\u06d8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    xor-int v0, v6, v23

    mul-int/lit16 v0, v0, 0x260d

    const v17, 0x80bfbd8

    xor-int v0, v0, v17

    const v17, 0x54ba4cc3

    xor-int v6, v6, v17

    move/from16 v27, v1

    move-object/from16 v17, v2

    move-object/from16 v25, v18

    move/from16 v2, v26

    move v1, v0

    move/from16 v26, v3

    move-object/from16 v18, v8

    move-object/from16 v3, v24

    move-object/from16 v8, v28

    move-object/from16 v0, p1

    :goto_19
    move/from16 v24, v6

    goto/16 :goto_0

    :cond_14
    const-string v0, "\u06e1\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v6, v0, v22

    mul-int/lit16 v6, v6, 0x4b8f

    const v17, 0x1e5436ed

    xor-int v6, v6, v17

    const v17, -0x423367b2

    goto/16 :goto_1d

    :sswitch_1f
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v26, v2

    move-object/from16 v2, v17

    sget-object v0, Ll/ᩴ۬ۤ;->᩻ܺۨ:[S

    const/4 v1, 0x0

    aget-short v27, v0, v1

    .line 38
    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v0, :cond_15

    :goto_1a
    const-string v0, "\u06db\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x6d

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x3313

    const v6, -0x3918f051

    xor-int/2addr v1, v6

    const v6, -0x4d4f8329

    goto :goto_1b

    :cond_15
    const-string v0, "\u06d7\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x33

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x1a47

    const v6, 0x1217adcd

    xor-int/2addr v1, v6

    const v6, 0x6fdd5543

    :goto_1b
    xor-int/2addr v0, v6

    move-object/from16 v17, v2

    goto :goto_1e

    :goto_1c
    const-string v0, "\u1a74\u06e0"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v23, v0

    mul-int/lit8 v0, v0, 0x79

    xor-int v6, v0, v22

    mul-int/lit16 v6, v6, -0x52a9

    const v17, -0x2ae463e3

    xor-int v6, v6, v17

    const v17, 0x447966b3

    xor-int v0, v0, v17

    move/from16 v27, v1

    move-object/from16 v17, v2

    move v1, v6

    move-object/from16 v18, v8

    move/from16 v2, v26

    move-object/from16 v8, v28

    const/16 v25, 0x0

    move/from16 v26, v3

    move-object/from16 v3, v24

    goto :goto_1f

    :cond_16
    const-string v0, "\u1a73\u05a1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v6, v0, v22

    mul-int/lit16 v6, v6, -0x211b

    const v17, 0x751ac9a2

    xor-int v6, v6, v17

    const v17, -0x244924a5

    :goto_1d
    xor-int v0, v0, v17

    move/from16 v27, v1

    move-object/from16 v17, v2

    move v1, v6

    :goto_1e
    move-object/from16 v25, v18

    move/from16 v2, v26

    move/from16 v26, v3

    move-object/from16 v18, v8

    move-object/from16 v3, v24

    move-object/from16 v8, v28

    :goto_1f
    move/from16 v24, v0

    move-object/from16 v0, p1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f5531c1 -> :sswitch_2
        -0x7d3cf417 -> :sswitch_18
        -0x7cc0fc32 -> :sswitch_1c
        -0x7afca328 -> :sswitch_9
        -0x78582fef -> :sswitch_b
        -0x760cbf0a -> :sswitch_1b
        -0x72816622 -> :sswitch_c
        -0x6f702a71 -> :sswitch_4
        -0x666b7d03 -> :sswitch_5
        -0x65780c60 -> :sswitch_1f
        -0x635b3b3b -> :sswitch_6
        -0x6140b743 -> :sswitch_1a
        -0x5c1b6e4a -> :sswitch_15
        -0x55baf747 -> :sswitch_17
        -0x4eed0eab -> :sswitch_1a
        -0x4c055d47 -> :sswitch_d
        -0x4b5b3e5b -> :sswitch_17
        -0x455b6393 -> :sswitch_4
        -0x42ead831 -> :sswitch_3
        -0x34cb247e -> :sswitch_f
        -0x34a833a7 -> :sswitch_8
        -0x30def238 -> :sswitch_1b
        -0x2e4384d5 -> :sswitch_7
        -0x1ab95c4b -> :sswitch_1f
        -0x17703656 -> :sswitch_13
        -0xd63e11f -> :sswitch_c
        -0xa9956a4 -> :sswitch_10
        -0x8a7f291 -> :sswitch_11
        -0x4f59599 -> :sswitch_5
        0x368768a -> :sswitch_8
        0x55800fa -> :sswitch_f
        0x5fbcd10 -> :sswitch_a
        0x630b1d4 -> :sswitch_6
        0x89aa6b6 -> :sswitch_18
        0xe555ddf -> :sswitch_e
        0x123eeb07 -> :sswitch_16
        0x12bf71b8 -> :sswitch_12
        0x141557e0 -> :sswitch_0
        0x16855acd -> :sswitch_1e
        0x188074fd -> :sswitch_10
        0x1948d834 -> :sswitch_19
        0x19b0389e -> :sswitch_14
        0x19fac4dc -> :sswitch_15
        0x1bfe13bf -> :sswitch_1d
        0x1db0030a -> :sswitch_a
        0x367568ef -> :sswitch_e
        0x385bcf93 -> :sswitch_1
        0x3e695ee4 -> :sswitch_16
        0x40752512 -> :sswitch_9
        0x41dae3e8 -> :sswitch_1c
        0x4215e702 -> :sswitch_1e
        0x477cfced -> :sswitch_0
        0x4be34b43 -> :sswitch_12
        0x555ecdd5 -> :sswitch_b
        0x56c5cf61 -> :sswitch_14
        0x56cd2bb1 -> :sswitch_d
        0x58fd31a8 -> :sswitch_11
        0x594813e6 -> :sswitch_19
        0x67d28b74 -> :sswitch_1
        0x75e896c0 -> :sswitch_7
        0x764db943 -> :sswitch_3
        0x7e765f78 -> :sswitch_1d
        0x7f403e0b -> :sswitch_2
        0x7f59ef96 -> :sswitch_13
    .end sparse-switch
.end method

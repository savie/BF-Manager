.class public final Ll/᩹ۗۨ;
.super Ljava/lang/Object;
.source "U7HQ"


# static fields
.field private static final ᩴ֨۠:[S


# instance fields
.field public ۙ:Ll/ۚۗۨ;

.field public final ܰ:Lbin/mt/plugin/api/translation/TranslationEngine;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x39

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩹ۗۨ;->ᩴ֨۠:[S

    return-void

    :array_0
    .array-data 2
        0x2053s
        0x2b8as
        0x2be4s
        0x2be5s
        0x2becs
        0x2be9s
        0x2beds
        0x2be9s
        0x2bf4s
        0x2be5s
        0x2bf2s
        0x2bcfs
        0x2bf2s
        0x2be9s
        0x2be7s
        0x2be9s
        0x2bees
        0x2be1s
        0x2becs
        0x2ba8s
        0x2ba9s
        0x2bbas
        0x2b8as
        0x2bd4s
        0x2bf2s
        0x2be1s
        0x2bees
        0x2bf3s
        0x2becs
        0x2be1s
        0x2bf4s
        0x2be5s
        0x2be4s
        0x2ba8s
        0x2bd4s
        0x2bf2s
        0x2be1s
        0x2bees
        0x2bf3s
        0x2becs
        0x2be1s
        0x2bf4s
        0x2be9s
        0x2befs
        0x2bees
        0x2ba0s
        0x2be6s
        0x2be1s
        0x2be9s
        0x2becs
        0x2be5s
        0x2be4s
        0x2bbas
        0x2ba0s
        0x2baes
        0x2baes
        0x2baes
    .end array-data
.end method

.method public constructor <init>(Lbin/mt/plugin/api/translation/TranslationEngine;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x38bca788

    sget v2, Ll/֨ۢ;->ۢ۬ۧ:I

    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06e1\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2bb9

    const v6, 0x71daa342

    xor-int/2addr v5, v6

    const v6, 0x4b564841    # 1.4043201E7f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x4bf1

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 5
    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v4, :cond_6

    goto/16 :goto_4

    .line 11
    :sswitch_0
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-lez v4, :cond_7

    goto/16 :goto_3

    :sswitch_1
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v4, :cond_b

    goto/16 :goto_3

    .line 25
    :sswitch_2
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_9

    goto/16 :goto_2

    .line 21
    :sswitch_3
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 29
    :sswitch_5
    new-instance v4, Ll/ۚۗۨ;

    .line 3
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 29
    :cond_0
    iget v5, v0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->maxTranslationTextLength:I

    sget-boolean v6, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v6, :cond_1

    :goto_1
    const-string v4, "\u06e2\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x79e1

    const v6, 0x474d9882

    xor-int/2addr v5, v6

    const v6, 0xf284618

    goto :goto_0

    :cond_1
    iget-object p1, v0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->textLengthCalculator:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    invoke-direct {v4, p0, v5, p1}, Ll/ۚۗۨ;-><init>(Ll/᩹ۗۨ;ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;)V

    iput-object v4, p0, Ll/᩹ۗۨ;->ۙ:Ll/ۚۗۨ;

    return-void

    .line 25
    :sswitch_6
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u1a7a\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x596b

    const v6, 0x5c1be653

    xor-int/2addr v5, v6

    const v6, -0x52df083e

    goto :goto_0

    .line 20
    :sswitch_7
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06db\u06df"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5bbf

    const v6, 0x1bc85b69

    xor-int/2addr v5, v6

    const v6, -0x1a5310d

    goto/16 :goto_0

    .line 10
    :sswitch_8
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06e2\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x23ad

    const v6, -0x7c50455d

    xor-int/2addr v5, v6

    const v6, -0x248db9a7

    goto/16 :goto_0

    .line 26
    :sswitch_9
    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v4, :cond_5

    :goto_2
    const-string v4, "\u06d8\u06e0"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x286f

    const v6, -0x57f48740

    xor-int/2addr v5, v6

    const v6, -0x6b17f1a4

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06db\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1b8d

    const v6, -0x6c68daf3

    xor-int/2addr v5, v6

    const v6, -0x567dd4e3

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a75\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2c6b

    const v6, -0x434d4890

    xor-int/2addr v5, v6

    const v6, 0x25dd7325

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_8

    :cond_7
    const-string v4, "\u0733\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x633f

    const v6, 0x6f4950e4

    xor-int/2addr v5, v6

    const v6, -0x19c67ca8

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e1\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x345

    const v6, -0x3dcb1f9b

    xor-int/2addr v5, v6

    const v6, 0x720f51bb

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u06d9\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6c21

    const v6, -0x6eb84a3e

    xor-int/2addr v5, v6

    const v6, -0x2b4f1507

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0730\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2ec7

    const v6, 0x474e6939

    xor-int/2addr v5, v6

    const v6, 0x10bf1ca9

    goto/16 :goto_0

    .line 25
    :sswitch_c
    iput-object p1, p0, Ll/᩹ۗۨ;->ܰ:Lbin/mt/plugin/api/translation/TranslationEngine;

    .line 27
    invoke-interface {p1}, Lbin/mt/plugin/api/translation/TranslationEngine;->getConfiguration()Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    move-result-object v0

    .line 11
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a76\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x527f

    const v6, 0x77868f54

    xor-int/2addr v5, v6

    const v6, -0x1be7dfd9

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073a\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x4b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5813

    const v6, 0x71189495

    xor-int/2addr v5, v6

    const v6, -0x532aafb7

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79dfb803 -> :sswitch_1
        -0x70f5e227 -> :sswitch_b
        -0x6d75ff0d -> :sswitch_1
        -0x69b3b057 -> :sswitch_9
        -0x68f5ccae -> :sswitch_c
        -0x5c9bbf2b -> :sswitch_3
        -0x4d92e191 -> :sswitch_8
        -0x3a0abddf -> :sswitch_7
        -0x382e9904 -> :sswitch_4
        -0x2066911e -> :sswitch_0
        -0x20659f7b -> :sswitch_8
        -0x1dc59a15 -> :sswitch_6
        -0x1be930ec -> :sswitch_b
        -0xf793a60 -> :sswitch_2
        -0xa904315 -> :sswitch_9
        0x88647e -> :sswitch_0
        0xf77321d -> :sswitch_4
        0x118dc34f -> :sswitch_6
        0x1fff85ef -> :sswitch_a
        0x2309fe63 -> :sswitch_3
        0x27f98614 -> :sswitch_c
        0x633b5f2b -> :sswitch_2
        0x6630cea2 -> :sswitch_7
        0x686d5878 -> :sswitch_a
        0x7b5a35e5 -> :sswitch_5
        0x7d9238bf -> :sswitch_5
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

    const v15, -0x7f37868a

    sget v16, Ll/֫ܳ;->᩶ۧۛ:I

    sget v17, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v18, "\u1a79\u06eb"

    invoke-static/range {v18 .. v18}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v18

    add-int v18, v18, v17

    mul-int/lit8 v18, v18, -0xd

    xor-int v1, v18, v16

    mul-int/lit16 v1, v1, -0x1bdf

    const v20, 0x6ff05445

    xor-int v1, v1, v20

    const v20, 0x71319ed5

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

    const v18, -0x7f37868a

    const/16 v20, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v3, v18, v16

    mul-int/lit16 v3, v3, 0x4943

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v18, v19, v1

    sparse-switch v18, :sswitch_data_0

    .line 145
    new-array v6, v5, [C

    .line 146
    invoke-static {v6, v12}, Ljava/util/Arrays;->fill([CC)V

    .line 19
    sget-boolean v1, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v1, :cond_7

    goto/16 :goto_9

    :sswitch_0
    sget v1, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v1, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v1, "\u06e1\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x61

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0xb95

    const v19, 0x76eebf3c

    xor-int v3, v3, v19

    const v19, 0x533aca94

    goto/16 :goto_b

    :sswitch_1
    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v1, :cond_d

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v1, :cond_5

    goto/16 :goto_8

    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    sget v1, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v1, :cond_9

    goto/16 :goto_8

    :sswitch_4
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto/16 :goto_8

    :sswitch_5
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

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
    const-string v1, "\u06d6\u1a73"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x7b

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x24b9

    const v19, -0x1d611298

    xor-int v3, v3, v19

    const v19, -0x1fcd0e97

    goto/16 :goto_b

    :sswitch_9
    add-int/lit8 v1, v10, 0x1

    move v11, v1

    goto :goto_2

    :sswitch_a
    add-int/lit8 v4, v4, 0x1

    move v5, v11

    goto/16 :goto_5

    .line 131
    :sswitch_b
    invoke-static {v7, v9}, Ll/ۗ;->᩶᩺ܶ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v12, :cond_2

    const-string v1, "\u0730\u1a78"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x77

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x7e7d

    const v19, 0x44c43d6b

    xor-int v3, v3, v19

    const v19, 0x6da1517

    goto/16 :goto_b

    :cond_2
    const-string v1, "\u073a\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x11db

    const v19, -0x56900bc3

    xor-int v3, v3, v19

    const v19, 0x6296eb2e

    goto/16 :goto_b

    :sswitch_c
    if-lt v10, v5, :cond_3

    const-string v1, "\u073f\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x61

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x423b

    const v19, 0x559fbbe3

    xor-int v3, v3, v19

    const v19, -0x35105882    # -7852991.0f

    goto/16 :goto_b

    :cond_3
    move v11, v5

    :goto_2
    const-string v1, "\u06e4\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x3e3b

    const v19, -0x3749aaff

    xor-int v3, v3, v19

    const v19, 0x72aea4f1

    goto/16 :goto_b

    .line 130
    :sswitch_d
    invoke-static {v7}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v1

    if-ge v9, v1, :cond_4

    const-string v1, "\u1a76\u06eb"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x452d

    const v19, 0xf2081ae

    xor-int v3, v3, v19

    const v19, -0x3cc45c67

    goto/16 :goto_b

    :cond_4
    const-string v1, "\u1a74\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x2b

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x14f1

    const v19, 0x21c4613c

    xor-int v3, v3, v19

    const v19, -0x7f0e63c0

    goto/16 :goto_b

    :sswitch_e
    const/4 v1, 0x0

    const/4 v3, 0x0

    move v9, v8

    const/4 v10, 0x0

    const/4 v13, 0x0

    :goto_3
    const-string v1, "\u06db\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x10d

    const v19, 0x4a4d22f0    # 3360956.0f

    xor-int v3, v3, v19

    const v19, 0x218cb945

    goto/16 :goto_b

    .line 127
    :sswitch_f
    aget-object v7, v0, v4

    const/4 v8, 0x0

    .line 42
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v1

    if-gtz v1, :cond_6

    :cond_5
    :goto_4
    const-string v1, "\u1a73\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x15

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x28d

    const v19, 0x422dd1b9

    xor-int v3, v3, v19

    const v19, 0x33f1389f

    goto/16 :goto_b

    :cond_6
    const-string v1, "\u06e7\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x3f4d

    const v19, -0x5e2fff82

    xor-int v3, v3, v19

    const v19, -0x6c39091a

    goto/16 :goto_b

    .line 147
    :sswitch_10
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/lang/String;-><init>([C)V

    return-object v0

    :cond_7
    const-string v1, "\u05ab\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x33

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x347b

    const v19, 0x1bf0f2c4

    xor-int v3, v3, v19

    const v19, 0x3602977a

    goto/16 :goto_b

    :sswitch_11
    if-ge v4, v2, :cond_8

    const-string v1, "\u073f\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x11a7

    const v19, 0x40541d6d

    xor-int v3, v3, v19

    const v19, 0x25f01d66

    goto/16 :goto_b

    :cond_8
    const-string v1, "\u073f\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x4d

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x6bd

    const v19, -0x6cc88cc7

    xor-int v3, v3, v19

    const v19, -0x4ab279e6

    goto/16 :goto_b

    :sswitch_12
    const/4 v1, 0x0

    move/from16 v5, v20

    const/4 v4, 0x0

    :goto_5
    const-string v1, "\u0733\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x686b

    const v19, 0x5e369c62

    xor-int v3, v3, v19

    const v19, 0x49150f8d

    goto/16 :goto_b

    .line 31
    :sswitch_13
    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_a

    :cond_9
    :goto_6
    const-string v1, "\u06d6\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x5b

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x1de3

    const v19, 0x5b13f3c7

    xor-int v3, v3, v19

    const v19, 0x55b55969

    goto/16 :goto_b

    :cond_a
    const-string v1, "\u06d7\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x2a4b

    const v19, 0x78bb7c4f

    xor-int v3, v3, v19

    const v19, 0x210d7e07

    goto/16 :goto_b

    :sswitch_14
    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v1, :cond_b

    goto :goto_7

    :cond_b
    const-string v1, "\u05a8\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x6531

    const v19, 0x4a0161c4    # 2119793.0f

    xor-int v3, v3, v19

    const v19, 0x14aeeec8

    goto/16 :goto_b

    .line 70
    :sswitch_15
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_8

    :cond_c
    const-string v1, "\u06da\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x4b69

    const v19, 0x6f114c08

    xor-int v3, v3, v19

    const v19, -0xb2df0ff

    goto/16 :goto_b

    .line 120
    :sswitch_16
    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_e

    :cond_d
    :goto_7
    const-string v1, "\u073a\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x5591

    const v19, 0x2b11bb46

    xor-int v3, v3, v19

    const v19, -0x31bea081    # -8.110653E8f

    goto/16 :goto_b

    :cond_e
    const-string v1, "\u06d8\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x75

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x4487

    const v19, -0x46676ef9

    xor-int v3, v3, v19

    const v19, -0x11c37ecd

    goto/16 :goto_b

    .line 124
    :sswitch_17
    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v1, :cond_f

    goto :goto_9

    :cond_f
    const-string v1, "\u06da\u06d8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x783b

    const v19, 0x16fac415

    xor-int v3, v3, v19

    const v19, -0x42638ce8

    goto/16 :goto_b

    :sswitch_18
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v1

    if-eqz v1, :cond_10

    :goto_8
    const-string v1, "\u0733\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x7f

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x815

    const v19, 0x2b55c192

    xor-int v3, v3, v19

    const v19, 0x59b92389

    goto/16 :goto_b

    :cond_10
    const-string v1, "\u05ab\u05ab"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x7d

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x2175

    const v19, 0x1907913

    xor-int v3, v3, v19

    const v19, 0x59d42ba9

    goto/16 :goto_b

    :sswitch_19
    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v1, :cond_11

    goto :goto_9

    :cond_11
    const-string v1, "\u0733\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x69

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x18b5

    const v19, -0x68c8669c

    xor-int v3, v3, v19

    const v19, -0x40976a91

    goto/16 :goto_b

    .line 127
    :sswitch_1a
    array-length v2, v0

    const/16 v20, 0x8

    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v1

    if-nez v1, :cond_12

    :goto_9
    const-string v1, "\u06eb\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x36f5

    const v19, 0x35ec9069

    xor-int v3, v3, v19

    const v19, -0x5b49d9b2

    goto :goto_b

    :cond_12
    const-string v1, "\u073d\u06eb"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x21

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x280f

    const v19, -0x12f9e7cd

    xor-int v3, v3, v19

    const v19, 0x7501d4e

    goto :goto_b

    :sswitch_1b
    const/16 v1, 0x2d

    const/16 v12, 0x2d

    goto :goto_a

    :sswitch_1c
    const/16 v1, 0x3d

    const/16 v12, 0x3d

    :goto_a
    const-string v1, "\u06db\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x41a9

    const v19, 0x7ec2f1b8

    xor-int v3, v3, v19

    const v19, 0x3411adca

    goto :goto_b

    :sswitch_1d
    if-eqz p0, :cond_13

    const-string v1, "\u06d6\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x37

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x1d09

    const v19, -0x3e25a282

    xor-int v3, v3, v19

    const v19, 0x575382f0

    goto :goto_b

    :cond_13
    const-string v1, "\u06db\u1a78"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x79

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x46bd

    const v19, -0x475a7437

    xor-int v3, v3, v19

    const v19, -0x126a78ab

    :goto_b
    xor-int v19, v1, v19

    move v1, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78bb57dc -> :sswitch_3
        -0x76f06873 -> :sswitch_1
        -0x7612469f -> :sswitch_1b
        -0x72575b4a -> :sswitch_c
        -0x707b1068 -> :sswitch_15
        -0x6780ec8f -> :sswitch_4
        -0x6660b8b3 -> :sswitch_a
        -0x665bfd1f -> :sswitch_11
        -0x5a3e28b3 -> :sswitch_6
        -0x58e0d6df -> :sswitch_c
        -0x4ee569de -> :sswitch_1
        -0x4e20e6f5 -> :sswitch_1c
        -0x4dd80728 -> :sswitch_8
        -0x49848d2d -> :sswitch_13
        -0x43e89446 -> :sswitch_0
        -0x35c348a6 -> :sswitch_12
        -0x3542ba18 -> :sswitch_d
        -0x34b2ba9c -> :sswitch_5
        -0x313e1644 -> :sswitch_f
        -0x2ff47e85 -> :sswitch_1b
        -0x2c99dc2a -> :sswitch_11
        -0x29f8fda6 -> :sswitch_9
        -0x2850e611 -> :sswitch_9
        -0x27c82496 -> :sswitch_18
        -0x217f31dc -> :sswitch_6
        -0x1b5f7d43 -> :sswitch_1a
        -0x17095603 -> :sswitch_1d
        -0x116fb81d -> :sswitch_7
        -0xd45b19b -> :sswitch_17
        -0x65a40ae -> :sswitch_19
        -0x18ea4d4 -> :sswitch_2
        -0x60b40e -> :sswitch_13
        0x578a9e2 -> :sswitch_d
        0xb8e07aa -> :sswitch_5
        0x12304a36 -> :sswitch_18
        0x12e5ac33 -> :sswitch_a
        0x13896c63 -> :sswitch_b
        0x17fd15c6 -> :sswitch_1d
        0x1c38c386 -> :sswitch_b
        0x1ef04e1e -> :sswitch_2
        0x21eb799c -> :sswitch_f
        0x245626db -> :sswitch_10
        0x246320f1 -> :sswitch_14
        0x25a2bd81 -> :sswitch_3
        0x35d3c92f -> :sswitch_12
        0x3672aca5 -> :sswitch_1c
        0x4377f258 -> :sswitch_e
        0x4d79f6ef -> :sswitch_1a
        0x4dc59222 -> :sswitch_14
        0x529e10f4 -> :sswitch_7
        0x5665a571 -> :sswitch_19
        0x56adbb8b -> :sswitch_16
        0x5a550749 -> :sswitch_15
        0x5ab2ef1b -> :sswitch_10
        0x6d718952 -> :sswitch_16
        0x7164ff0e -> :sswitch_17
        0x74070fcf -> :sswitch_0
        0x766c906f -> :sswitch_e
        0x7b411b93 -> :sswitch_4
        0x7dce543c -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()Ll/ۚۗۨ;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/᩹ۗۨ;->ۙ:Ll/ۚۗۨ;

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

    const v21, -0x11f94460

    sget v22, Ll/ۗᩳ;->ۚۤ֡:I

    sget v23, Ll/֡֡;->᩶ۤ۠:I

    const-string v24, "\u06e7\u073d"

    invoke-static/range {v24 .. v24}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v24

    sub-int v24, v23, v24

    mul-int/lit8 v24, v24, 0x3

    xor-int v1, v24, v22

    mul-int/lit16 v1, v1, 0x3035

    const v26, 0x1991ae43

    xor-int v1, v1, v26

    const v26, -0x3f5b9a7f

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

    mul-int/lit16 v6, v6, 0x18b

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v1, v6

    xor-int v21, v24, v1

    sparse-switch v21, :sswitch_data_0

    const/16 v1, 0x36

    const/4 v3, 0x3

    .line 89
    invoke-static {v8, v1, v3, v15}, Ll/ۘۚ;->᩷᩺᩷([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    goto/16 :goto_a

    .line 49
    :sswitch_0
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v26, v2

    move-object/from16 v2, v17

    goto/16 :goto_18

    :sswitch_1
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v1

    if-nez v1, :cond_1

    :goto_1
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v1, v27

    move/from16 v26, v2

    move-object/from16 v2, v17

    goto/16 :goto_1a

    :cond_1
    const-string v1, "\u06e2\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v6, v1, v22

    mul-int/lit16 v6, v6, -0x30df

    const v24, -0x673b1b76

    xor-int v6, v6, v24

    const v24, -0x35bd9fcd

    goto/16 :goto_5

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget-boolean v1, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz v1, :cond_4

    :cond_2
    move-object/from16 v1, p0

    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v6, v20

    move/from16 v3, v26

    move-object/from16 v8, p2

    :goto_2
    move-object/from16 v20, v9

    move-object/from16 v9, p3

    goto/16 :goto_e

    .line 40
    :sswitch_3
    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_2

    goto :goto_3

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_3
    const-string v1, "\u1a75\u06e0"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v6, v1, v22

    mul-int/lit16 v6, v6, -0x41cd

    const v24, -0x57354176

    xor-int v6, v6, v24

    const v24, 0x73ede7e5

    goto :goto_5

    :sswitch_5
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto :goto_1

    .line 56
    :sswitch_6
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    const/4 v0, 0x0

    return-object v0

    .line 89
    :sswitch_7
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x63

    invoke-static {v9, v2, v1}, Ll/ۖܽ;->۠᩹ۖ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v8, Ll/᩹ۗۨ;->ᩴ֨۠:[S

    .line 32
    sget-boolean v1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v1, :cond_5

    :cond_4
    :goto_4
    const-string v1, "\u073f\u1a78"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x39

    xor-int v6, v1, v23

    mul-int/lit16 v6, v6, 0x661

    const v24, 0x1b590ca0

    xor-int v6, v6, v24

    const v24, -0x3a6a4e8d

    goto :goto_5

    :cond_5
    const-string v1, "\u06d8\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    mul-int/lit8 v1, v1, -0x17

    xor-int v6, v1, v22

    mul-int/lit16 v6, v6, -0x4517

    const v24, -0x686eb57a

    xor-int v6, v6, v24

    const v24, -0x61d5a2c1

    :goto_5
    xor-int v24, v1, v24

    goto/16 :goto_16

    .line 91
    :sswitch_8
    new-instance v0, Ljava/io/IOException;

    sget-object v1, Ll/᩹ۗۨ;->ᩴ֨۠:[S

    const/16 v2, 0x22

    const/16 v4, 0x14

    invoke-static {v1, v2, v4, v15}, Ll/ۗܳ;->ۡܿۘ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v1, v3}, Ll/֡ۜᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 91
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :sswitch_9
    invoke-static/range {v25 .. v25}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v1}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/String;)V

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v6, Ll/᩹ۗۨ;->ᩴ֨۠:[S

    sget-boolean v24, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v24, :cond_6

    goto/16 :goto_1

    :cond_6
    move-object/from16 v24, v3

    const/16 v3, 0x17

    move-object/from16 v28, v8

    const/16 v8, 0xb

    invoke-static {v6, v3, v8, v15}, Ll/ۖۧ;->᩶ܽܽ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 67
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v6

    if-gtz v6, :cond_7

    move-object/from16 v1, v25

    goto :goto_6

    .line 85
    :cond_7
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v3, v11

    invoke-static {v1, v3}, Ll/֨ۖ;->ܽܶ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {v1, v14}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1, v9}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v1}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/String;)V

    move-object/from16 v1, v25

    move/from16 v3, v26

    goto/16 :goto_b

    :sswitch_a
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    .line 84
    invoke-static {v1, v14}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1, v7}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 4
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_8

    :goto_6
    const-string v3, "\u06e4\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v23

    mul-int/lit8 v3, v3, -0x65

    xor-int v6, v3, v22

    mul-int/lit16 v6, v6, -0x75c3

    const v8, -0x3296ff

    xor-int/2addr v6, v8

    const v8, -0x371e2246

    goto/16 :goto_9

    :cond_8
    const-string v3, "\u06eb\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v22

    mul-int/lit8 v3, v3, -0x3d

    xor-int v6, v3, v23

    mul-int/lit16 v6, v6, -0x4ab3

    const v8, 0x56bf1be4

    xor-int/2addr v6, v8

    const v8, -0x52dcbaee

    goto :goto_9

    :sswitch_b
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    .line 84
    sget-object v3, Ll/᩹ۗۨ;->ᩴ֨۠:[S

    const/16 v6, 0x14

    const/4 v8, 0x3

    invoke-static {v3, v6, v8, v15}, Ll/֫ۚ;->᩸ܺ᩷([SIII)Ljava/lang/String;

    move-result-object v14

    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_9

    goto :goto_7

    :cond_9
    const-string v3, "\u0733\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v23, v3

    mul-int/lit8 v3, v3, -0x6f

    xor-int v6, v3, v22

    mul-int/lit16 v6, v6, -0x6303

    const v8, 0x57c40e0c

    xor-int/2addr v6, v8

    const v8, -0x272dfce7

    goto :goto_9

    :sswitch_c
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v3, Ll/᩹ۗۨ;->ᩴ֨۠:[S

    const/16 v6, 0xb

    const/16 v8, 0x9

    invoke-static {v3, v6, v8, v15}, Ll/֡᩸;->ۤ᩺ۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v6

    if-ltz v6, :cond_a

    :goto_7
    goto :goto_8

    :cond_a
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v3, v0

    invoke-static {v1, v3}, Ll/֨ۖ;->ܽܶ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    .line 35
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_b

    :goto_8
    move-object/from16 v1, p0

    move-object/from16 v8, p2

    move-object/from16 v6, v20

    move/from16 v3, v26

    goto/16 :goto_2

    :cond_b
    const-string v3, "\u06dc\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v23

    xor-int v6, v3, v22

    mul-int/lit16 v6, v6, 0x409d

    const v8, 0x7249bbef

    xor-int/2addr v6, v8

    const v8, 0x566d4c33

    :goto_9
    xor-int/2addr v3, v8

    move-object/from16 v25, v1

    move v1, v6

    move-object/from16 v8, v28

    move-object/from16 v30, v24

    move/from16 v24, v3

    goto/16 :goto_f

    :sswitch_d
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    .line 88
    invoke-static {v9}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v3

    const/16 v6, 0x64

    if-le v3, v6, :cond_c

    const-string v3, "\u06db\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v22

    xor-int v6, v3, v23

    mul-int/lit16 v6, v6, 0x2f01

    const v8, -0x28bff04b

    xor-int/2addr v6, v8

    const v8, 0x2a4abd76

    goto :goto_9

    :cond_c
    move-object v3, v9

    :goto_a
    const-string v6, "\u05ab\u073d"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v23

    xor-int v8, v6, v22

    mul-int/lit16 v8, v8, 0x4e65

    const v24, -0x69874890

    xor-int v8, v8, v24

    const v24, 0x23eb816b

    xor-int v24, v6, v24

    move-object/from16 v25, v1

    move v1, v8

    goto/16 :goto_13

    :sswitch_e
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    .line 0
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    aget-object v3, v0, v12

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v12, v12, 0x1

    move/from16 v3, v26

    goto/16 :goto_c

    :sswitch_f
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    move/from16 v3, v26

    .line 78
    invoke-static {v3, v0}, Ll/᩹ۗۨ;->ۙ(Z[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    move-object/from16 v17, v6

    move-object/from16 v8, v18

    const/16 v19, 0x1

    move-object/from16 v18, v1

    goto/16 :goto_11

    :sswitch_10
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    move/from16 v3, v26

    .line 82
    invoke-interface/range {v20 .. v20}, Lbin/mt/plugin/api/translation/TranslationEngine;->getContext()Lbin/mt/plugin/api/PluginContext;

    move-result-object v13

    if-eqz v13, :cond_d

    const-string v6, "\u1a79\u0736"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    xor-int v8, v6, v23

    mul-int/lit16 v8, v8, -0x4b3b

    const v25, -0x7939ceca

    xor-int v8, v8, v25

    const v25, -0x407d0fbb

    goto/16 :goto_d

    :cond_d
    :goto_b
    const-string v6, "\u06d7\u06db"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v22

    mul-int/lit8 v6, v6, -0x65

    xor-int v8, v6, v23

    mul-int/lit16 v8, v8, 0x741d

    const v25, -0x332534c2

    xor-int v8, v8, v25

    const v25, -0x59f17a69

    goto/16 :goto_d

    :sswitch_11
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    move/from16 v3, v26

    .line 0
    array-length v6, v0

    if-ge v12, v6, :cond_e

    const-string v6, "\u1a7b\u1a74"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v23

    xor-int v8, v6, v22

    mul-int/lit16 v8, v8, 0x2d0d

    const v25, 0xad9a0c8

    xor-int v8, v8, v25

    const v25, -0x1e269f6a

    goto :goto_d

    :cond_e
    move/from16 v26, v2

    move v2, v3

    move-object/from16 v8, v18

    move-object/from16 v18, v1

    goto/16 :goto_10

    :sswitch_12
    return-object v11

    :sswitch_13
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    move/from16 v3, v26

    if-nez v19, :cond_f

    const-string v6, "\u1a7b\u06e7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v23

    mul-int/lit8 v6, v6, -0x19

    xor-int v8, v6, v22

    mul-int/lit16 v8, v8, 0x7bf5

    const v25, -0x1fd0219e

    xor-int v8, v8, v25

    const v25, 0x47ff7d4f

    goto :goto_d

    :cond_f
    const-string v6, "\u06dc\u1a75"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    xor-int v8, v6, v23

    mul-int/lit16 v8, v8, -0x5d93

    const v25, -0x80d0575

    xor-int v8, v8, v25

    const v25, -0x18289c02

    goto :goto_d

    :sswitch_14
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v1, v25

    move/from16 v3, v26

    aget-object v6, v0, v2

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const/4 v6, 0x1

    const/4 v12, 0x1

    :goto_c
    const-string v6, "\u06db\u1a76"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    xor-int v8, v6, v23

    mul-int/lit16 v8, v8, 0x2ee1

    const v25, -0x2e937d53

    xor-int v8, v8, v25

    const v25, 0x483f189f

    :goto_d
    xor-int v6, v6, v25

    move-object/from16 v25, v1

    move/from16 v26, v3

    move v1, v8

    move-object/from16 v3, v24

    move-object/from16 v8, v28

    goto/16 :goto_17

    :sswitch_15
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

    const-string v1, "\u1a77\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v6, v1, v22

    mul-int/lit16 v6, v6, 0x320b

    const v25, -0x6398f1ea

    xor-int v6, v6, v25

    const v25, -0x7c5d4987

    goto/16 :goto_12

    :cond_10
    const-string v1, "\u1a73\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    mul-int/lit8 v1, v1, -0x71

    xor-int v6, v1, v22

    mul-int/lit16 v6, v6, 0x1de7

    const v25, 0x59fe3ea5

    xor-int v6, v6, v25

    const v25, -0x5b92e0dd

    goto/16 :goto_12

    :sswitch_16
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v18, v25

    move/from16 v3, v26

    .line 0
    invoke-static {v5}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v1, p0

    .line 68
    iget-object v6, v1, Ll/᩹ۗۨ;->ܰ:Lbin/mt/plugin/api/translation/TranslationEngine;

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    invoke-interface {v6, v7, v8, v9}, Lbin/mt/plugin/api/translation/TranslationEngine;->translate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 70
    invoke-static {v4}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v26

    if-eqz v26, :cond_11

    move-object/from16 v18, v25

    :goto_e
    const-string v25, "\u06d6\u06dc"

    invoke-static/range {v25 .. v25}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v25

    xor-int v25, v25, v22

    mul-int/lit8 v25, v25, -0x59

    xor-int v1, v25, v23

    mul-int/lit16 v1, v1, 0x2087

    const v26, -0x14e10597

    xor-int v1, v1, v26

    const v26, -0x4de19c1e

    xor-int v25, v25, v26

    move/from16 v26, v3

    move-object/from16 v9, v20

    move-object/from16 v3, v24

    move/from16 v24, v25

    move-object/from16 v8, v28

    const/16 v25, 0x0

    move-object/from16 v20, v6

    goto/16 :goto_0

    :cond_11
    const-string v1, "\u073a\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x5b

    move/from16 v26, v2

    xor-int v2, v1, v23

    mul-int/lit16 v2, v2, 0x6da5

    const v29, -0x180411e

    xor-int v2, v2, v29

    const v29, 0x51d01976

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

    :sswitch_17
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

    const-string v1, "\u0730\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x7f

    xor-int v3, v1, v23

    mul-int/lit16 v3, v3, -0x160f

    const v6, -0xbb8d8a7

    xor-int/2addr v3, v6

    const v6, 0x4172fa48

    xor-int/2addr v1, v6

    move-object/from16 v25, v18

    move/from16 v2, v26

    const/16 v26, 0x1

    move-object/from16 v18, v8

    move-object/from16 v8, v28

    move-object/from16 v30, v24

    move/from16 v24, v1

    move v1, v3

    :goto_f
    move-object/from16 v3, v30

    goto/16 :goto_0

    :cond_12
    :goto_10
    const-string v1, "\u06ec\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    mul-int/lit8 v1, v1, 0x2d

    xor-int v3, v1, v22

    mul-int/lit16 v3, v3, -0x6ed5

    const v6, -0x97aef51

    xor-int/2addr v3, v6

    const v6, -0x439cadbf

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

    :sswitch_18
    new-instance v0, Ljava/lang/NullPointerException;

    sget-object v1, Ll/᩹ۗۨ;->ᩴ֨۠:[S

    const/4 v2, 0x2

    const/16 v3, 0x9

    invoke-static {v1, v2, v3, v15}, Ll/֫֡;->֫֫֫([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_19
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v26, v2

    .line 62
    sget-object v1, Ll/᩹ۗۨ;->ᩴ֨۠:[S

    const/4 v2, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v15}, Ll/ۖۛ;->ܿۤ۟([SIII)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v17

    .line 0
    invoke-static {v1, v2, v1}, Ll/ܽ۠ᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_13

    const-string v1, "\u06df\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v6, v1, v22

    mul-int/lit16 v6, v6, -0x7f47

    const v17, 0x56c1199d

    xor-int v6, v6, v17

    const v17, -0x1864d0ac

    goto/16 :goto_15

    :cond_13
    const-string v1, "\u05a1\u1a7a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0xb

    xor-int v6, v1, v23

    mul-int/lit16 v6, v6, 0x185

    const v17, 0x6e60f79

    xor-int v6, v6, v17

    const v17, 0x741e133d

    goto/16 :goto_15

    :sswitch_1a
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    const/4 v1, 0x0

    .line 62
    invoke-static {v1, v0}, Ll/᩹ۗۨ;->ۙ(Z[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    move-object/from16 v17, v2

    const/4 v2, 0x0

    const/16 v19, 0x0

    :goto_11
    const-string v1, "\u06df\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v23

    mul-int/lit8 v1, v1, -0x4d

    xor-int v6, v1, v22

    mul-int/lit16 v6, v6, -0x1bf

    const v25, 0xc5894a8

    xor-int v6, v6, v25

    const v25, 0x79b9a2a0

    :goto_12
    xor-int v1, v1, v25

    move/from16 v26, v3

    move-object/from16 v25, v18

    move-object/from16 v3, v24

    move/from16 v24, v1

    move v1, v6

    move-object/from16 v18, v8

    :goto_13
    move-object/from16 v8, v28

    goto/16 :goto_0

    :sswitch_1b
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v26, v2

    move-object/from16 v2, v17

    const/16 v1, 0x1452

    const/16 v15, 0x1452

    goto :goto_14

    :sswitch_1c
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v26, v2

    move-object/from16 v2, v17

    const/16 v1, 0x2b80

    const/16 v15, 0x2b80

    :goto_14
    const-string v1, "\u073d\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x79

    xor-int v6, v1, v23

    mul-int/lit16 v6, v6, -0x69bf

    const v17, -0x415dd683

    xor-int v6, v6, v17

    const v17, 0x65152196

    :goto_15
    xor-int v1, v1, v17

    move-object/from16 v17, v2

    move-object/from16 v25, v18

    move/from16 v2, v26

    move/from16 v26, v3

    move-object/from16 v18, v8

    move-object/from16 v3, v24

    move-object/from16 v8, v28

    move/from16 v24, v1

    :goto_16
    move v1, v6

    goto/16 :goto_0

    :sswitch_1d
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v1, v27

    move/from16 v26, v2

    move-object/from16 v2, v17

    mul-int v27, v1, v1

    const v6, 0x132a909

    add-int v27, v27, v6

    mul-int/lit16 v6, v1, 0x2306

    sub-int v27, v27, v6

    if-gez v27, :cond_14

    const-string v6, "\u06e7\u05ab"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v22

    mul-int/lit8 v6, v6, -0x7d

    xor-int v0, v6, v23

    mul-int/lit16 v0, v0, -0x3ddd

    const v17, 0x12a0e46e

    xor-int v0, v0, v17

    const v17, 0x144578

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

    :goto_17
    move/from16 v24, v6

    goto/16 :goto_0

    :cond_14
    const-string v0, "\u0736\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v6, v0, v22

    mul-int/lit16 v6, v6, 0x4a7d

    const v17, -0x15b8fe52

    xor-int v6, v6, v17

    const v17, -0x4aae77d2

    goto/16 :goto_1b

    :sswitch_1e
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v26, v2

    move-object/from16 v2, v17

    sget-object v0, Ll/᩹ۗۨ;->ᩴ֨۠:[S

    const/4 v1, 0x0

    aget-short v27, v0, v1

    sget v0, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v0, :cond_15

    :goto_18
    const-string v0, "\u06e0\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x755d

    const v6, 0x25cf7358

    xor-int/2addr v1, v6

    const v6, 0x2b96c6c5

    goto :goto_19

    :cond_15
    const-string v0, "\u06e7\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0xec3

    const v6, 0x5c1dc70f

    xor-int/2addr v1, v6

    const v6, 0x733ee9c5

    :goto_19
    xor-int/2addr v0, v6

    move-object/from16 v17, v2

    goto :goto_1c

    :sswitch_1f
    move-object/from16 v24, v3

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v25

    move/from16 v3, v26

    move/from16 v1, v27

    move/from16 v26, v2

    move-object/from16 v2, v17

    sget v0, Ll/֨ۧ;->֫۠֡:I

    if-gtz v0, :cond_16

    :goto_1a
    const-string v0, "\u06d7\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x13

    xor-int v6, v0, v23

    mul-int/lit16 v6, v6, -0x67e9

    const v17, 0x4f7a83e2

    xor-int v6, v6, v17

    const v17, -0x4905a6d0

    goto :goto_1b

    :cond_16
    const-string v0, "\u06e0\u1a78"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v6, v0, v22

    mul-int/lit16 v6, v6, 0x2727

    const v17, -0x5d440e8a

    xor-int v6, v6, v17

    const v17, 0x2925bc61

    :goto_1b
    xor-int v0, v0, v17

    move/from16 v27, v1

    move-object/from16 v17, v2

    move v1, v6

    :goto_1c
    move-object/from16 v25, v18

    move/from16 v2, v26

    move/from16 v26, v3

    move-object/from16 v18, v8

    move-object/from16 v3, v24

    move-object/from16 v8, v28

    move/from16 v24, v0

    move-object/from16 v0, p1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b783d1e -> :sswitch_15
        -0x7a97e7d0 -> :sswitch_4
        -0x7997dcd1 -> :sswitch_2
        -0x68f87109 -> :sswitch_19
        -0x5e4e282e -> :sswitch_5
        -0x5c117ef3 -> :sswitch_4
        -0x59d9f02c -> :sswitch_1
        -0x544ea63f -> :sswitch_17
        -0x520f49d4 -> :sswitch_e
        -0x4bb55dcc -> :sswitch_7
        -0x4a69271d -> :sswitch_1
        -0x47624e50 -> :sswitch_1e
        -0x4721a378 -> :sswitch_1a
        -0x46f7ecae -> :sswitch_14
        -0x3c1747e0 -> :sswitch_7
        -0x3a0c1b16 -> :sswitch_13
        -0x37efabda -> :sswitch_f
        -0x34e0a709 -> :sswitch_1a
        -0x33cbdb23 -> :sswitch_1f
        -0x30749eb9 -> :sswitch_12
        -0x2dba02ac -> :sswitch_c
        -0x2a4f240f -> :sswitch_6
        -0x29c0f825 -> :sswitch_11
        -0x26f50c2f -> :sswitch_1b
        -0x23793883 -> :sswitch_14
        -0x20e8dcc3 -> :sswitch_16
        -0x1bee7a14 -> :sswitch_0
        -0x12c13b60 -> :sswitch_1d
        -0xeaff8fe -> :sswitch_a
        -0xcd869cd -> :sswitch_6
        -0xb4d1d13 -> :sswitch_9
        -0xa1cec5a -> :sswitch_2
        -0x7646ced -> :sswitch_1c
        -0x70814f5 -> :sswitch_b
        -0x6840b08 -> :sswitch_1c
        0x37bc7ac -> :sswitch_8
        0x9049ca1 -> :sswitch_1b
        0xc128365 -> :sswitch_9
        0xf44c626 -> :sswitch_d
        0x12c71435 -> :sswitch_13
        0x1407f29b -> :sswitch_3
        0x17781e10 -> :sswitch_3
        0x1a470eaa -> :sswitch_b
        0x1d7bee52 -> :sswitch_d
        0x213905bc -> :sswitch_a
        0x21813a27 -> :sswitch_c
        0x22ba2a41 -> :sswitch_1d
        0x24d95386 -> :sswitch_1f
        0x272f2053 -> :sswitch_16
        0x39f0fdb3 -> :sswitch_15
        0x3bb369cf -> :sswitch_0
        0x3fc4450d -> :sswitch_5
        0x40dbcaa5 -> :sswitch_e
        0x41e39ac3 -> :sswitch_18
        0x42a5b6da -> :sswitch_12
        0x4f86dc8a -> :sswitch_f
        0x5055c5b2 -> :sswitch_10
        0x5cc1dfb1 -> :sswitch_11
        0x6056ed06 -> :sswitch_17
        0x64cee9ab -> :sswitch_18
        0x650fca1a -> :sswitch_1e
        0x6f5e0c1a -> :sswitch_19
        0x6fc1ae7a -> :sswitch_8
        0x79d77d58 -> :sswitch_10
    .end sparse-switch
.end method

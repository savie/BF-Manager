.class public final synthetic Ll/ۛ᩺᩹;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ll/ۙ᩻;


# instance fields
.field public final synthetic ۙ:Ll/ۖܶ᩹;

.field public final synthetic ۨ:Ll/᩷۠ۚ;

.field public final synthetic ܰ:Ljava/io/BufferedInputStream;


# direct methods
.method public synthetic constructor <init>(Ll/ۖܶ᩹;Ljava/io/BufferedInputStream;Ll/᩷۠ۚ;)V
    .locals 6

    const v0, -0x6c5d81ac

    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    sget v2, Ll/֡᩶;->ۗ֨ܺ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073a\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1a9

    const v5, -0x31f4abd2

    xor-int/2addr v4, v5

    const v5, -0x46ff5603

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x46f9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Ll/ۛ᩺᩹;->ۙ:Ll/ۖܶ᩹;

    iput-object p2, p0, Ll/ۛ᩺᩹;->ܰ:Ljava/io/BufferedInputStream;

    .line 4
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v3

    if-eqz v3, :cond_c

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_9

    goto/16 :goto_2

    .line 1
    :sswitch_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v3, :cond_6

    goto/16 :goto_4

    .line 0
    :sswitch_2
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-gez v3, :cond_b

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    goto/16 :goto_1

    .line 3
    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ۛ᩺᩹;->ۨ:Ll/᩷۠ۚ;

    return-void

    :sswitch_6
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a76\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x216d

    const v5, -0x5820af50

    xor-int/2addr v4, v5

    const v5, 0x103dd02

    goto :goto_0

    .line 1
    :sswitch_7
    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06ec\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x47cd

    const v5, -0x14021cd1

    xor-int/2addr v4, v5

    const v5, -0x5442e54d

    goto :goto_0

    .line 0
    :sswitch_8
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06e8\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x33f9

    const v5, 0x5db747dd

    xor-int/2addr v4, v5

    const v5, -0x5ede76b

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u1a76\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x320f

    const v5, 0x715a63ea

    xor-int/2addr v4, v5

    const v5, -0x5d4734e9

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u05ab\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x292b

    const v5, -0x6be84e1b

    xor-int/2addr v4, v5

    const v5, 0x4d6d1cad    # 2.4862997E8f

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_5

    :goto_1
    const-string v3, "\u06dc\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1a4b

    const v5, 0x16788466

    xor-int/2addr v4, v5

    const v5, -0x27061d9e

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06da\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2e4b

    const v5, -0x4f1473fb

    xor-int/2addr v4, v5

    const v5, 0x6417b0e9

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u1a78\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x493d

    const v5, 0x6e1fb2fa

    xor-int/2addr v4, v5

    const v5, -0x2c52753c

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06dc\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4b2f

    const v5, 0x1f4866ef

    xor-int/2addr v4, v5

    const v5, -0x44b67e53

    goto/16 :goto_0

    .line 1
    :sswitch_d
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v3

    if-nez v3, :cond_8

    :goto_3
    const-string v3, "\u1a79\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xb2d

    const v5, 0x34476193

    xor-int/2addr v4, v5

    const v5, -0x706d436b

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06dc\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2bd

    const v5, 0x7ed1c511

    xor-int/2addr v4, v5

    const v5, -0x33176be0

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_a

    :cond_9
    const-string v3, "\u0733\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1f07

    const v5, 0x39cf2b55

    xor-int/2addr v4, v5

    const v5, -0x5714a400

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d6\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x270f

    const v5, -0x337dea03    # -6.820247E7f

    xor-int/2addr v4, v5

    const v5, 0x28f64969

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v3, "\u06e0\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x30a3

    const v5, -0x4f832e2a

    xor-int/2addr v4, v5

    const v5, -0x728199d1

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06eb\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x39dd

    const v5, 0x3a490c23

    xor-int/2addr v4, v5

    const v5, -0x2b4708c4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fd40850 -> :sswitch_d
        -0x7dbfd4d2 -> :sswitch_9
        -0x7c0a2b42 -> :sswitch_8
        -0x7439f5f6 -> :sswitch_1
        -0x6d197b8e -> :sswitch_0
        -0x61ee92f0 -> :sswitch_3
        -0x59c1922f -> :sswitch_b
        -0x57501ad8 -> :sswitch_6
        -0x4e3ad788 -> :sswitch_c
        -0x49353a15 -> :sswitch_6
        -0x3b415123 -> :sswitch_7
        -0x31264c76 -> :sswitch_2
        -0x2ea7b81f -> :sswitch_5
        -0x27a56dd1 -> :sswitch_e
        -0x1e99bf30 -> :sswitch_a
        -0x13a85b46 -> :sswitch_8
        -0x13497f08 -> :sswitch_1
        -0xd07016e -> :sswitch_2
        -0xa05cfc1 -> :sswitch_d
        -0x94b06fa -> :sswitch_b
        0xb40aac6 -> :sswitch_0
        0xd99ef08 -> :sswitch_4
        0x126f3433 -> :sswitch_5
        0x168ab4d4 -> :sswitch_7
        0x176942ea -> :sswitch_c
        0x2e3083b2 -> :sswitch_4
        0x501aa944 -> :sswitch_9
        0x54b06cce -> :sswitch_3
        0x67b603a3 -> :sswitch_a
        0x6c2527d0 -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 6

    const v0, 0x2c74c2d1

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    sget v2, Ll/֡᩶;->ۗ֨ܺ:I

    const-string v3, "\u1a76\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6b2b

    const v5, 0x5dee09ca

    xor-int/2addr v4, v5

    const v5, 0x5fa46755

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x4dc3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 548
    new-instance v3, Ll/᩻᩺᩹;

    .line 293
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    .line 461
    :sswitch_0
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-nez v3, :cond_9

    goto :goto_2

    .line 23
    :sswitch_1
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_7

    goto :goto_1

    .line 105
    :sswitch_2
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-lez v3, :cond_5

    goto :goto_1

    .line 421
    :sswitch_3
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    const/4 v0, 0x0

    return-object v0

    :goto_1
    const-string v3, "\u0730\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x778f

    const v5, -0x3af9baea

    xor-int/2addr v4, v5

    const v5, 0x435795de

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_3

    .line 1
    :cond_1
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_2

    goto :goto_5

    :cond_2
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v4, :cond_3

    goto :goto_4

    .line 461
    :cond_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v4

    if-gtz v4, :cond_4

    goto :goto_5

    .line 488
    :cond_4
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u1a74\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3b57

    const v5, 0x3d1eb561

    xor-int/2addr v4, v5

    const v5, -0x3ac3d5fe

    goto :goto_0

    .line 358
    :cond_6
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_8

    :cond_7
    :goto_3
    const-string v3, "\u06eb\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7643

    const v5, -0x3e0869e8

    xor-int/2addr v4, v5

    const v5, -0x4c35e5fe

    goto/16 :goto_0

    .line 392
    :cond_8
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v4

    if-gtz v4, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06ec\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7413

    const v5, -0x1d1b03b

    xor-int/2addr v4, v5

    const v5, -0x7b2a6634

    goto/16 :goto_0

    :cond_a
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_5

    .line 548
    :cond_b
    iget-object v4, p0, Ll/ۛ᩺᩹;->ۙ:Ll/ۖܶ᩹;

    .line 501
    sget v5, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v5, :cond_c

    :goto_5
    const-string v3, "\u06e1\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1013

    const v5, -0x4889dd42

    xor-int/2addr v4, v5

    const v5, 0x5ec75c2f

    goto/16 :goto_0

    .line 548
    :cond_c
    iget-object v0, p0, Ll/ۛ᩺᩹;->ܰ:Ljava/io/BufferedInputStream;

    iget-object v1, p0, Ll/ۛ᩺᩹;->ۨ:Ll/᩷۠ۚ;

    invoke-direct {v3, v4, v0, v1}, Ll/᩻᩺᩹;-><init>(Ll/ۖܶ᩹;Ljava/io/BufferedInputStream;Ll/᩷۠ۚ;)V

    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        -0x64287244 -> :sswitch_3
        -0x520137d6 -> :sswitch_2
        -0x4f5d6d1e -> :sswitch_4
        -0x4c869c6b -> :sswitch_0
        -0x40c08356 -> :sswitch_1
        -0x29af3fce -> :sswitch_3
        -0x284652e5 -> :sswitch_2
        -0x1cc98bea -> :sswitch_1
        0x2174ee7b -> :sswitch_0
        0x3ce4317d -> :sswitch_4
    .end sparse-switch
.end method

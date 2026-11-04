.class public final synthetic Ll/᩵ۜ᩻;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۜ᩻;->ܰ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x218e0b02

    sget v2, Ll/ۗ֡;->ۜ᩻۫:I

    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v4, "\u06e8\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x119

    const v6, 0x340e47d4

    xor-int/2addr v5, v6

    const v6, 0x7866a6fc

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x706b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 138
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto/16 :goto_3

    .line 97
    :sswitch_0
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_4

    :sswitch_1
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_b

    goto/16 :goto_1

    .line 17
    :sswitch_2
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_3

    .line 29
    :sswitch_3
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    return-void

    .line 4
    :sswitch_4
    check-cast p1, Ll/֫۬᩻;

    .line 140
    iput-object v0, p1, Ll/֫۬᩻;->ۙ:Ljava/util/Map;

    return-void

    .line 2
    :sswitch_5
    iget-object v0, p0, Ll/᩵ۜ᩻;->ܰ:Ljava/util/Map;

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v4

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u05a8\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x42b7

    const v6, 0x24d6358a

    xor-int/2addr v5, v6

    const v6, 0x4c064ef9    # 3.5208164E7f

    goto :goto_0

    .line 77
    :sswitch_6
    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v4, "\u06ec\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7021

    const v6, -0x1455f7b8

    xor-int/2addr v5, v6

    const v6, -0x6e4ed75c

    goto :goto_0

    .line 64
    :sswitch_7
    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06e7\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x59db

    const v6, 0xe1bffb5

    xor-int/2addr v5, v6

    const v6, 0xdfdf53c

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_4

    :cond_3
    const-string v4, "\u06e4\u073a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5879

    const v6, -0x5a24af34

    xor-int/2addr v5, v6

    const v6, -0x5e8e41e7

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06d6\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7af5

    const v6, 0x6d49737b

    xor-int/2addr v5, v6

    const v6, -0x52b7e885

    goto/16 :goto_0

    .line 18
    :sswitch_9
    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06e8\u0736"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1abd

    const v6, -0x21d1e04e

    xor-int/2addr v5, v6

    const v6, 0x33492f73

    goto/16 :goto_0

    .line 134
    :sswitch_a
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v4

    if-gtz v4, :cond_6

    goto :goto_1

    :cond_6
    const-string v4, "\u1a78\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7ed9

    const v6, -0x2e12dbd3

    xor-int/2addr v5, v6

    const v6, -0x63aacbed

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v4, :cond_8

    :cond_7
    :goto_1
    const-string v4, "\u1a74\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4bab

    const v6, -0x2d8b3814

    xor-int/2addr v5, v6

    const v6, 0x281776fc

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06eb\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4791

    const v6, -0x7397caa8

    xor-int/2addr v5, v6

    const v6, 0x35d9ae48

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v4, :cond_9

    :goto_2
    const-string v4, "\u06e1\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x188d

    const v6, -0x3bf4d74e

    xor-int/2addr v5, v6

    const v6, 0xc23d016

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u05a1\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x749d

    const v6, -0x641f2da1

    xor-int/2addr v5, v6

    const v6, -0x4ce656ba

    goto/16 :goto_0

    .line 112
    :sswitch_d
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v4, :cond_a

    :goto_3
    const-string v4, "\u06d9\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x11

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x206d

    const v6, 0x3050a914

    xor-int/2addr v5, v6

    const v6, 0x4e01d5a1    # 5.445653E8f

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06ec\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x143d

    const v6, -0xa89fbb

    xor-int/2addr v5, v6

    const v6, 0x4ff55f2a

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u073f\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x33e9

    const v6, -0x6c8ab8f8

    xor-int/2addr v5, v6

    const v6, -0x37d1a67d

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u0736\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2181

    const v6, -0x5e0cf611

    xor-int/2addr v5, v6

    const v6, 0x34ce1088

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x740ead1f -> :sswitch_c
        -0x68458a23 -> :sswitch_e
        -0x6268b0dc -> :sswitch_7
        -0x5b97a582 -> :sswitch_b
        -0x5533809a -> :sswitch_e
        -0x52a5f259 -> :sswitch_1
        -0x49ffda29 -> :sswitch_1
        -0x36b22895 -> :sswitch_6
        -0x25faaf7e -> :sswitch_a
        -0x24ed2a68 -> :sswitch_d
        -0x22926c29 -> :sswitch_3
        -0x1c00d061 -> :sswitch_0
        0x93ab1b9 -> :sswitch_4
        0x1a8c6f08 -> :sswitch_6
        0x1b1bf8a7 -> :sswitch_5
        0x27f29da0 -> :sswitch_2
        0x282fad8f -> :sswitch_d
        0x2edad25f -> :sswitch_4
        0x3c9900ae -> :sswitch_9
        0x4131748d -> :sswitch_8
        0x4294da8e -> :sswitch_7
        0x5396eb1b -> :sswitch_2
        0x5884c5b2 -> :sswitch_c
        0x5c71fa74 -> :sswitch_3
        0x5e821828 -> :sswitch_a
        0x6424456a -> :sswitch_5
        0x670838f0 -> :sswitch_0
        0x738a2cd6 -> :sswitch_9
        0x7645cac3 -> :sswitch_8
        0x7a9399ab -> :sswitch_b
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

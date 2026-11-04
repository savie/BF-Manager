.class public final synthetic Ll/ܰۜ᩻;
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

    iput-object p1, p0, Ll/ܰۜ᩻;->ܰ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x7071275d

    sget v2, Ll/᩺;->۫۬۫:I

    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    const-string v4, "\u06eb\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2e95

    const v6, -0x139d2b24

    xor-int/2addr v5, v6

    const v6, 0x4e6c52f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x5c5d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 4
    check-cast p1, Ll/֫۬᩻;

    .line 140
    iput-object v0, p1, Ll/֫۬᩻;->ۙ:Ljava/util/Map;

    return-void

    .line 118
    :sswitch_0
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_9

    goto :goto_1

    .line 1
    :sswitch_1
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v4

    if-eqz v4, :cond_b

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-lez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v4, "\u1a74\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7d0b

    const v6, -0x3fc83d1b

    xor-int/2addr v5, v6

    const v6, 0x537ef3fa

    goto :goto_0

    .line 31
    :sswitch_3
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    return-void

    .line 2
    :sswitch_5
    iget-object v0, p0, Ll/ܰۜ᩻;->ܰ:Ljava/util/Map;

    .line 116
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v4

    if-ltz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u06e0\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5c5

    const v6, -0x74a5fbae

    xor-int/2addr v5, v6

    const v6, 0x33f9f84c

    goto :goto_0

    .line 16
    :sswitch_6
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v4

    if-ltz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u1a73\u073a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1497

    const v6, -0x1ab135f6

    xor-int/2addr v5, v6

    const v6, 0x6b0fe073

    goto :goto_0

    .line 117
    :sswitch_7
    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u1a75\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4d7d

    const v6, 0x6a6599e6

    xor-int/2addr v5, v6

    const v6, 0x60c7543c

    goto/16 :goto_0

    .line 111
    :sswitch_8
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06e7\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3561

    const v6, 0x154b9c30

    xor-int/2addr v5, v6

    const v6, -0x3f3c45e2

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06df\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1533

    const v6, -0x4efd82dd

    xor-int/2addr v5, v6

    const v6, -0x995b27

    goto/16 :goto_0

    .line 37
    :sswitch_a
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v4

    if-gtz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u0736\u073a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7d2d

    const v6, 0x5d472d96

    xor-int/2addr v5, v6

    const v6, 0x4294acc4

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v4, :cond_7

    :goto_2
    const-string v4, "\u05a1\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x521d

    const v6, -0x2eb5c2c8

    xor-int/2addr v5, v6

    const v6, -0x4fa08963

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a78\u073a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4009

    const v6, -0x5c5ef96

    xor-int/2addr v5, v6

    const v6, -0x162cd235

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_8

    :goto_3
    const-string v4, "\u05ab\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x396b

    const v6, 0x755a1628

    xor-int/2addr v5, v6

    const v6, 0x1224b0a8

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d9\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x65

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5cd3

    const v6, -0x3ac9ff2a

    xor-int/2addr v5, v6

    const v6, 0x7823d52

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v4, :cond_a

    :cond_9
    const-string v4, "\u073a\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3ec7

    const v6, 0x76dc0c61

    xor-int/2addr v5, v6

    const v6, -0x782e2e6d    # -3.1570002E-34f

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a78\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3e61

    const v6, -0x1f50d816

    xor-int/2addr v5, v6

    const v6, -0x2a827e43

    goto/16 :goto_0

    .line 75
    :sswitch_e
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u05a1\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4cc9

    const v6, 0x2025a71f

    xor-int/2addr v5, v6

    const v6, 0x61dfe9a8

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a76\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7271

    const v6, 0x44212fa4

    xor-int/2addr v5, v6

    const v6, -0x26764b27

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fd45fcd -> :sswitch_0
        -0x7944f7cf -> :sswitch_3
        -0x71e91c98 -> :sswitch_4
        -0x6fddf504 -> :sswitch_6
        -0x6907c907 -> :sswitch_2
        -0x54c734c1 -> :sswitch_9
        -0x4f068e32 -> :sswitch_6
        -0x42cd985e -> :sswitch_1
        -0x3977d9e2 -> :sswitch_c
        -0x2ee9432f -> :sswitch_a
        -0x1c962393 -> :sswitch_d
        -0x17b699a1 -> :sswitch_b
        -0x154865ad -> :sswitch_0
        -0x6f05fe1 -> :sswitch_c
        -0x5d97540 -> :sswitch_a
        0x4b6991a -> :sswitch_d
        0x10ff6b6a -> :sswitch_e
        0x12177c83 -> :sswitch_4
        0x18744839 -> :sswitch_7
        0x1e104e03 -> :sswitch_2
        0x3019c4e2 -> :sswitch_8
        0x3b8449ba -> :sswitch_b
        0x3bcde2fb -> :sswitch_1
        0x3f40c5b6 -> :sswitch_8
        0x408b55d6 -> :sswitch_3
        0x4cfd2ff0 -> :sswitch_5
        0x51ef88c2 -> :sswitch_5
        0x5cfee91c -> :sswitch_7
        0x732819ae -> :sswitch_e
        0x78771996 -> :sswitch_9
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

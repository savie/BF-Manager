.class public final synthetic Ll/ܺۤ᩺;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܺ:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۤ᩺;->ܺ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x1d48b7c1

    sget v2, Ll/ۗܺ;->ۨ᩺۠:I

    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    const-string v4, "\u1a78\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3b79

    const v6, -0x302564bd

    xor-int/2addr v5, v6

    const v6, -0x6fd9fce0

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x43df

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v4

    if-ltz v4, :cond_9

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u1a7b\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2453

    const v6, 0x3c932397

    xor-int/2addr v5, v6

    const v6, 0x34d81bd2

    goto :goto_0

    .line 106
    :sswitch_1
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-lez v4, :cond_b

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_8

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    return-void

    .line 4
    :sswitch_5
    check-cast p1, Ll/ܶ۟᩺;

    .line 132
    iput-object v0, p1, Ll/ܶ۟᩺;->ۙ:Ljava/util/Map;

    return-void

    .line 2
    :sswitch_6
    iget-object v0, p0, Ll/ܺۤ᩺;->ܺ:Ljava/util/Map;

    .line 99
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v4, "\u06e0\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x111b

    const v6, -0x52b5900e

    xor-int/2addr v5, v6

    const v6, 0x45ae010d

    goto :goto_0

    .line 25
    :sswitch_7
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06db\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x45d5

    const v6, -0x1e3e54b

    xor-int/2addr v5, v6

    const v6, 0x74b69914

    goto/16 :goto_0

    .line 104
    :sswitch_8
    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u0730\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xad5

    const v6, -0x7c82fcb

    xor-int/2addr v5, v6

    const v6, 0x71017ab6

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v4

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u073d\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7cd5

    const v6, -0x7b844ce9

    xor-int/2addr v5, v6

    const v6, -0x5f2aebd1

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v4

    if-gtz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06dc\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xeef

    const v6, 0x58db7c10

    xor-int/2addr v5, v6

    const v6, -0x163429b5

    goto/16 :goto_0

    .line 12
    :sswitch_b
    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u1a77\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x66c1

    const v6, -0x372480c2

    xor-int/2addr v5, v6

    const v6, 0x16bdb0b

    goto/16 :goto_0

    .line 111
    :sswitch_c
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_7

    :goto_1
    const-string v4, "\u05a1\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5f71

    const v6, 0x62b335d2

    xor-int/2addr v5, v6

    const v6, 0x4288c994

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06ec\u06e0"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x387b

    const v6, -0x5b0b42b

    xor-int/2addr v5, v6

    const v6, 0x248b1c85

    goto/16 :goto_0

    :cond_8
    :goto_2
    const-string v4, "\u1a79\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3f17

    const v6, 0x4d785f39    # 2.6043688E8f

    xor-int/2addr v5, v6

    const v6, -0x24b7c6f6

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06d8\u06df"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1929

    const v6, -0x51d99a99

    xor-int/2addr v5, v6

    const v6, -0x733118f0

    goto/16 :goto_0

    .line 78
    :sswitch_d
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_a

    :goto_3
    const-string v4, "\u1a78\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2195

    const v6, 0x159bbb9    # 3.999129E-38f

    xor-int/2addr v5, v6

    const v6, -0x55510c01

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a76\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1c4f

    const v6, 0x56f83560

    xor-int/2addr v5, v6

    const v6, -0x104735f8

    goto/16 :goto_0

    .line 77
    :sswitch_e
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a77\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1559

    const v6, 0x4b9a74c5    # 2.0244874E7f

    xor-int/2addr v5, v6

    const v6, -0x2006d72f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e4\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3c2d

    const v6, 0x5d44f38e

    xor-int/2addr v5, v6

    const v6, 0x524f2589

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77c9ad14 -> :sswitch_7
        -0x6d8c5684 -> :sswitch_6
        -0x69edf33c -> :sswitch_a
        -0x5f723ff4 -> :sswitch_9
        -0x52bcdba3 -> :sswitch_e
        -0x3a1e76fa -> :sswitch_8
        -0x375edf4c -> :sswitch_6
        -0x2abb49dc -> :sswitch_3
        -0xfcbc370 -> :sswitch_3
        -0x54d2047 -> :sswitch_0
        0x916e815 -> :sswitch_1
        0xbceb16d -> :sswitch_0
        0x13250b5e -> :sswitch_a
        0x17e09a1c -> :sswitch_d
        0x1b091815 -> :sswitch_d
        0x1bad78d3 -> :sswitch_8
        0x1bb4d088 -> :sswitch_c
        0x20623330 -> :sswitch_e
        0x28f343b4 -> :sswitch_9
        0x29ee5f81 -> :sswitch_2
        0x3847535d -> :sswitch_7
        0x39bdab2c -> :sswitch_c
        0x3a8a3146 -> :sswitch_1
        0x4168f14d -> :sswitch_2
        0x4723a4a1 -> :sswitch_4
        0x592309ff -> :sswitch_5
        0x60f02436 -> :sswitch_5
        0x6dcd0c62 -> :sswitch_b
        0x6f0f9949 -> :sswitch_4
        0x76fa35ef -> :sswitch_b
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֨᩻ᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

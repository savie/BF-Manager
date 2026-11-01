.class public final synthetic Ll/֡᩸᩺;
.super Ljava/lang/Object;
.source "S3XU"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܺ:Ll/᩶᩸᩺;


# direct methods
.method public synthetic constructor <init>(Ll/᩶᩸᩺;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡᩸᩺;->ܺ:Ll/᩶᩸᩺;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩻ᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x28587911

    sget v2, Ll/֨᩹;->᩻ᩳ֨:I

    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    const-string v4, "\u06d7\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x28d3

    const v6, -0x44bc1480

    xor-int/2addr v5, v6

    const v6, 0x51aa2af9

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x463f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 549
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_a

    goto/16 :goto_2

    .line 509
    :sswitch_0
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v4, :cond_9

    goto/16 :goto_1

    :sswitch_1
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-lez v4, :cond_4

    goto/16 :goto_3

    .line 56
    :sswitch_2
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v4, :cond_7

    goto/16 :goto_3

    .line 256
    :sswitch_3
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    goto/16 :goto_3

    .line 347
    :sswitch_4
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    const/4 p1, 0x0

    return-object p1

    .line 638
    :sswitch_5
    invoke-virtual {v0, p1}, Ll/᩶᩸᩺;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ᩴ᩹;

    return-object p1

    .line 2
    :sswitch_6
    iget-object v0, p0, Ll/֡᩸᩺;->ܺ:Ll/᩶᩸᩺;

    .line 258
    sget-boolean v4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v4, :cond_0

    const-string v4, "\u0736\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4f19

    const v6, -0x443ada76

    xor-int/2addr v5, v6

    const v6, 0x799840ce

    goto :goto_0

    :cond_0
    const-string v4, "\u1a76\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x39c9

    const v6, 0x2edc24d0

    xor-int/2addr v5, v6

    const v6, -0x26c86579

    goto :goto_0

    .line 423
    :sswitch_7
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06e8\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2c7b

    const v6, -0x170a5d55

    xor-int/2addr v5, v6

    const v6, 0x5dae5b3e

    goto/16 :goto_0

    .line 505
    :sswitch_8
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u0730\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x158d

    const v6, -0x25a4d4dd

    xor-int/2addr v5, v6

    const v6, 0x737e3c44

    goto/16 :goto_0

    .line 619
    :sswitch_9
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u1a74\u06df"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x745d

    const v6, -0x32199da3

    xor-int/2addr v5, v6

    const v6, 0x5efe1cf4

    goto/16 :goto_0

    .line 79
    :sswitch_a
    sget v4, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v4, :cond_5

    :cond_4
    const-string v4, "\u05ab\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4419

    const v6, -0xa46ba8c

    xor-int/2addr v5, v6

    const v6, -0x2e22da28

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u05ab\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xf6f

    const v6, -0xa6cf1ec

    xor-int/2addr v5, v6

    const v6, 0x251e81cd

    goto/16 :goto_0

    .line 482
    :sswitch_b
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v4, "\u1a7a\u06d7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6c93

    const v6, 0x65b639c8

    xor-int/2addr v5, v6

    const v6, 0x6db46a36

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_8

    :cond_7
    :goto_1
    const-string v4, "\u1a78\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2213

    const v6, 0x6560082a

    xor-int/2addr v5, v6

    const v6, 0x13ff09a

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e4\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7d95

    const v6, -0x5e3440f7

    xor-int/2addr v5, v6

    const v6, 0x5c6bee05

    goto/16 :goto_0

    :cond_9
    :goto_2
    const-string v4, "\u073f\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x56b9

    const v6, 0x320ab492

    xor-int/2addr v5, v6

    const v6, 0x57cd0f10

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u073f\u06df"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x217f

    const v6, -0x72a6c324

    xor-int/2addr v5, v6

    const v6, -0x6d9eaa6b

    goto/16 :goto_0

    .line 214
    :sswitch_d
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_3

    :cond_b
    const-string v4, "\u06da\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x404f

    const v6, 0x456b0668

    xor-int/2addr v5, v6

    const v6, 0x7f757c4f

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v4

    if-eqz v4, :cond_c

    :goto_3
    const-string v4, "\u0736\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7b73

    const v6, -0x6cfba06b

    xor-int/2addr v5, v6

    const v6, -0x3990cb55

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06eb\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x163b

    const v6, -0x2cba9cea

    xor-int/2addr v5, v6

    const v6, -0x963b26f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ade3b49 -> :sswitch_3
        -0x74eae652 -> :sswitch_8
        -0x6f8de630 -> :sswitch_5
        -0x52787401 -> :sswitch_0
        -0x4be1cbb7 -> :sswitch_1
        -0x4a90fc86 -> :sswitch_8
        -0x4025a256 -> :sswitch_d
        -0x2dcfd71f -> :sswitch_2
        -0x2824c64c -> :sswitch_c
        -0x24d8807a -> :sswitch_c
        -0x1a73220c -> :sswitch_9
        -0x128518d0 -> :sswitch_4
        -0xcdb0eee -> :sswitch_e
        -0xc7ba6b3 -> :sswitch_2
        -0xc3ff92a -> :sswitch_6
        -0x5b60171 -> :sswitch_b
        0x10aabd57 -> :sswitch_a
        0x1273b7d8 -> :sswitch_e
        0x16acc8ba -> :sswitch_7
        0x3a380891 -> :sswitch_7
        0x4fe1d495 -> :sswitch_6
        0x5d0879e2 -> :sswitch_d
        0x6411be98 -> :sswitch_a
        0x64baed3d -> :sswitch_4
        0x657bf8a8 -> :sswitch_0
        0x6b5a8786 -> :sswitch_5
        0x6bb0f10d -> :sswitch_3
        0x6c58fab5 -> :sswitch_9
        0x777e078e -> :sswitch_b
        0x7cd8dd6c -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩻ᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

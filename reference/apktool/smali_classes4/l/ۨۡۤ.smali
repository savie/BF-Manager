.class public final Ll/ۨۡۤ;
.super Ljava/lang/Object;
.source "D17I"

# interfaces
.implements Ll/ۗܿᩴ;


# instance fields
.field public final synthetic ܰ:Ll/ۛۡۤ;


# direct methods
.method public constructor <init>(Ll/ۛۡۤ;)V
    .locals 0

    .line 281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۡۤ;->ܰ:Ll/ۛۡۤ;

    return-void
.end method


# virtual methods
.method public final synthetic ֫ۙ()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ۙ(JJJ)V
    .locals 4

    const p1, 0x37c5f571

    sget p2, Ll/֫֡;->֫ۙۖ:I

    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v1, "\u1a77\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x35

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x855

    const v3, 0x7c420f5

    xor-int/2addr v2, v3

    const v3, -0x70c7b031

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, -0x7217

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    .line 0
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    return-void

    .line 210
    :sswitch_0
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    sget-boolean v1, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-nez v1, :cond_5

    goto/16 :goto_3

    .line 81
    :sswitch_1
    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-lez v1, :cond_8

    goto/16 :goto_5

    .line 236
    :sswitch_2
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-lez v1, :cond_b

    goto :goto_1

    .line 29
    :sswitch_3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    goto :goto_1

    .line 284
    :sswitch_4
    iget-object p1, p0, Ll/ۨۡۤ;->ܰ:Ll/ۛۡۤ;

    iget-object p1, p1, Ll/ۛۡۤ;->ܳ:Ll/ۤ۠ᩴ;

    invoke-virtual {p1, p3, p4, p5, p6}, Ll/ۤ۠ᩴ;->ۙ(JJ)V

    return-void

    .line 61
    :sswitch_5
    sget v1, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "\u1a74\u06d8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, 0x77

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x79a7

    const v3, -0x6e6f980c

    xor-int/2addr v2, v3

    const v3, -0x778ec93c

    goto :goto_0

    .line 18
    :sswitch_6
    sget v1, Ll/ۧ;->ۨۗܰ:I

    if-ltz v1, :cond_1

    :goto_1
    const-string v1, "\u05ab\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x23

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x1a97

    const v3, -0x38434ada

    xor-int/2addr v2, v3

    const v3, -0x64271353

    goto :goto_0

    :cond_1
    const-string v1, "\u06e4\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x57

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x4653

    const v3, 0x4aa2e88d    # 5338182.5f

    xor-int/2addr v2, v3

    const v3, 0x1448674

    goto :goto_0

    :sswitch_7
    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v1, "\u1a78\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x6353

    const v3, -0x5bb29609

    xor-int/2addr v2, v3

    const v3, 0x2feca87

    goto/16 :goto_0

    .line 151
    :sswitch_8
    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v1, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "\u06d9\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, 0x3b

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0xae3

    const v3, -0x14390c43

    xor-int/2addr v2, v3

    const v3, 0x31cc89ad

    goto/16 :goto_0

    :sswitch_9
    sget v1, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v1, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u06dc\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x7f

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x547f

    const v3, -0x2c0771a3

    xor-int/2addr v2, v3

    const v3, -0x5d98aeb8

    goto/16 :goto_0

    .line 48
    :sswitch_a
    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v1, :cond_6

    :cond_5
    :goto_2
    const-string v1, "\u1a77\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, -0x1d

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x4395

    const v3, 0x6e136337

    xor-int/2addr v2, v3

    const v3, 0x676ffe6c

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u1a7a\u06df"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x2d95

    const v3, 0x62c4bc57

    xor-int/2addr v2, v3

    const v3, -0x26f470d2

    goto/16 :goto_0

    .line 105
    :sswitch_b
    sget v1, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v1, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v1, "\u1a76\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x29

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x2625

    const v3, 0x20b1bc75

    xor-int/2addr v2, v3

    const v3, 0x6ccc5625

    goto/16 :goto_0

    .line 167
    :sswitch_c
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v1

    if-ltz v1, :cond_9

    :cond_8
    :goto_3
    const-string v1, "\u073a\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x13f5

    const v3, -0x7ee69013

    xor-int/2addr v2, v3

    const v3, -0x7d0a626d

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u05ab\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x39

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x7ae1

    const v3, 0x1120125

    xor-int/2addr v2, v3

    const v3, 0x4cc32539    # 1.0231239E8f

    goto/16 :goto_0

    .line 258
    :sswitch_d
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v1

    if-nez v1, :cond_a

    :goto_4
    const-string v1, "\u1a75\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x75

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x1d17

    const v3, -0x2b381a4a

    xor-int/2addr v2, v3

    const v3, 0x2bf12040

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u06e4\u06e2"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x70a5

    const v3, -0x7428fafa

    xor-int/2addr v2, v3

    const v3, -0x6a5ecac3

    goto/16 :goto_0

    .line 204
    :sswitch_e
    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v1, :cond_c

    :cond_b
    :goto_5
    const-string v1, "\u0730\u0733"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, -0x1d

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x3b75

    const v3, 0x7217a446

    xor-int/2addr v2, v3

    const v3, 0x5434ddc2

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06e8\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x71cb

    const v3, -0x90bd787

    xor-int/2addr v2, v3

    const v3, 0x6bbe2f75

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78f62de1 -> :sswitch_a
        -0x7067f8b9 -> :sswitch_b
        -0x6d613d44 -> :sswitch_4
        -0x66cca3e7 -> :sswitch_4
        -0x57219a2a -> :sswitch_0
        -0x4fc7419e -> :sswitch_7
        -0x4b3f9b0d -> :sswitch_d
        -0x4a627abc -> :sswitch_d
        -0x28daf2a3 -> :sswitch_1
        -0x272de1d8 -> :sswitch_c
        -0x259f7fe2 -> :sswitch_2
        -0x233fd691 -> :sswitch_c
        -0x1bcc6b67 -> :sswitch_3
        -0x154fa743 -> :sswitch_5
        -0x1d2b852 -> :sswitch_e
        0x311f870 -> :sswitch_b
        0x67624b4 -> :sswitch_9
        0xd50dc4c -> :sswitch_5
        0xda0c6be -> :sswitch_0
        0x1ca81e68 -> :sswitch_7
        0x29a3c0b0 -> :sswitch_1
        0x351884c5 -> :sswitch_e
        0x39cb360d -> :sswitch_9
        0x3a7397e2 -> :sswitch_8
        0x445d31aa -> :sswitch_8
        0x476f4235 -> :sswitch_6
        0x4b9c31db -> :sswitch_6
        0x53e9e4b6 -> :sswitch_a
        0x5d8bea9a -> :sswitch_2
        0x6e11a993 -> :sswitch_3
    .end sparse-switch
.end method

.method public final ۫()Z
    .locals 1

    .line 289
    iget-object v0, p0, Ll/ۨۡۤ;->ܰ:Ll/ۛۡۤ;

    iget-object v0, v0, Ll/ۛۡۤ;->ܳ:Ll/ۤ۠ᩴ;

    invoke-static {v0}, Ll/֨᩻;->ܺܺۤ(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

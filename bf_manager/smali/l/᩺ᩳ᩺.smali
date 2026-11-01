.class public final synthetic Ll/᩺ᩳ᩺;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ll/ۚ᩷ۨ;


# instance fields
.field public final synthetic ܺ:I

.field public final synthetic ᩶:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 6

    const v0, 0x3ad01a64

    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06eb\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4b5b

    const v5, 0xab25529

    xor-int/2addr v4, v5

    const v5, 0x2f73c6e1

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x1505

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-boolean p2, p0, Ll/᩺ᩳ᩺;->᩶:Z

    return-void

    .line 3
    :sswitch_0
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_1

    .line 1
    :sswitch_1
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v3, :cond_9

    goto/16 :goto_1

    :sswitch_2
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v3, :cond_b

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 4
    :sswitch_5
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v3

    if-gtz v3, :cond_0

    const-string v3, "\u073a\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2a2f

    const v5, -0x7c13e32a

    xor-int/2addr v4, v5

    const v5, -0x37ec6fea

    goto :goto_0

    :cond_0
    const-string v3, "\u05a1\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x32bf

    const v5, -0x2333c9d4

    xor-int/2addr v4, v5

    const v5, -0x2f2c8311

    goto :goto_0

    .line 3
    :sswitch_6
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v3, "\u06e7\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4e7f

    const v5, 0x9b7bfe8

    xor-int/2addr v4, v5

    const v5, -0x56a6f114

    goto/16 :goto_0

    :sswitch_7
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v3, "\u06ec\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7ca7

    const v5, -0x7e3592d9

    xor-int/2addr v4, v5

    const v5, -0x4a4fa807

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u073f\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2d0d

    const v5, -0x27ef6246

    xor-int/2addr v4, v5

    const v5, -0x6fb26b8b

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_5

    :cond_4
    const-string v3, "\u0733\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3f3

    const v5, -0x18138db3

    xor-int/2addr v4, v5

    const v5, 0x78dd4e95

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e7\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4489

    const v5, -0x283a9259

    xor-int/2addr v4, v5

    const v5, -0x5cdd8eb2

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_6

    goto :goto_1

    :cond_6
    const-string v3, "\u073a\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x8eb

    const v5, -0x6152e32b

    xor-int/2addr v4, v5

    const v5, -0x45962257

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v3

    if-eqz v3, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string v3, "\u06d8\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6271

    const v5, 0x447f1d1c

    xor-int/2addr v4, v5

    const v5, -0x418e27da

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_8

    :goto_1
    const-string v3, "\u06df\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2411

    const v5, -0x37f15587

    xor-int/2addr v4, v5

    const v5, -0x14c302c9

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a74\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4ed7

    const v5, -0x59da45cc

    xor-int/2addr v4, v5

    const v5, 0x37ac07e0

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_a

    :cond_9
    const-string v3, "\u0736\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6b3f

    const v5, 0x2d9cf849

    xor-int/2addr v4, v5

    const v5, 0x52fe1078

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073f\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xa5f

    const v5, -0x2c784d30

    xor-int/2addr v4, v5

    const v5, 0x2cb7883b

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput p1, p0, Ll/᩺ᩳ᩺;->ܺ:I

    .line 1
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_2
    const-string v3, "\u073a\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5195

    const v5, -0x218399f2

    xor-int/2addr v4, v5

    const v5, 0x256b8120

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a75\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7975

    const v5, 0x7811af8

    xor-int/2addr v4, v5

    const v5, -0x2a586f9a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bde4e75 -> :sswitch_2
        -0x72acab13 -> :sswitch_c
        -0x618f02ae -> :sswitch_0
        -0x5a7ff900 -> :sswitch_5
        -0x55fa1da6 -> :sswitch_0
        -0x55927280 -> :sswitch_3
        -0x45b3f26f -> :sswitch_7
        -0x447ccc50 -> :sswitch_b
        -0x43460500 -> :sswitch_8
        -0x39d11a93 -> :sswitch_7
        -0x30fb7f6a -> :sswitch_6
        -0x2f33e312 -> :sswitch_d
        -0x2e853c7b -> :sswitch_d
        -0x2a5b263a -> :sswitch_9
        -0x2812085a -> :sswitch_1
        -0x1efe57cc -> :sswitch_b
        -0x1eb7593f -> :sswitch_8
        -0x1d90b0e0 -> :sswitch_5
        -0x17ed740e -> :sswitch_a
        -0x149d5dc1 -> :sswitch_6
        -0x13f5522d -> :sswitch_9
        0x6d48578 -> :sswitch_3
        0xafa08e0 -> :sswitch_a
        0x1bd8238f -> :sswitch_4
        0x2ebe229d -> :sswitch_1
        0x3ace6672 -> :sswitch_4
        0x3c6353cf -> :sswitch_e
        0x4d658f77 -> :sswitch_2
        0x5cdc6708 -> :sswitch_e
        0x7ad4e5eb -> :sswitch_c
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ(II)I
    .locals 5

    const p1, -0x5025e79

    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    const-string v2, "\u073f\u1a76"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x7365

    const v4, 0x298be59e

    xor-int/2addr v3, v4

    const v4, 0x2d18c727

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v1

    mul-int/lit16 p1, p1, 0x609d

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    .line 9
    sget-boolean v2, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v2, :cond_b

    goto/16 :goto_2

    .line 478
    :sswitch_0
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    sget v2, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v2, :cond_8

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    sget v2, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez v2, :cond_d

    goto/16 :goto_1

    .line 479
    :sswitch_2
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    const/4 p1, 0x0

    return p1

    :sswitch_4
    return p2

    .line 655
    :sswitch_5
    sget p1, Ll/᩶᩵ۘ;->ۜ:I

    const v0, 0x3f4ccccd    # 0.8f

    invoke-static {p1, p2, v0}, Ll/ۗ۫;->ۙ(IIF)I

    move-result p1

    return p1

    .line 7
    :sswitch_6
    iget p1, p0, Ll/᩺ᩳ᩺;->ܺ:I

    return p1

    .line 651
    :sswitch_7
    iget-boolean v2, p0, Ll/᩺ᩳ᩺;->᩶:Z

    if-eqz v2, :cond_0

    const-string v2, "\u05a1\u06d6"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x51

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x69cb

    const v4, -0x6acaa05

    xor-int/2addr v3, v4

    const v4, 0x450f0e0e

    goto :goto_0

    :cond_0
    const-string v2, "\u06dc\u073a"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x7d

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x58fd

    const v4, 0x66a177c1

    xor-int/2addr v3, v4

    const v4, -0x3e3f7cb2

    goto :goto_0

    :sswitch_8
    const v2, -0xb8b8b9

    if-ne p2, v2, :cond_1

    const-string v2, "\u06ec\u05ab"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x37

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4fbf

    const v4, -0x7a5cd3e8

    xor-int/2addr v3, v4

    const v4, 0x4f92c7c1

    goto/16 :goto_0

    :cond_1
    const-string v2, "\u06d8\u1a7b"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x57

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2e61

    const v4, 0x2652adaf

    xor-int/2addr v3, v4

    const v4, 0x1e4951cd

    goto/16 :goto_0

    .line 253
    :sswitch_9
    sget v2, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v2, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v2, "\u0733\u06d8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x7379

    const v4, 0x4789573b

    xor-int/2addr v3, v4

    const v4, -0x135df1d3

    goto/16 :goto_0

    .line 325
    :sswitch_a
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v2

    if-gtz v2, :cond_3

    goto :goto_1

    :cond_3
    const-string v2, "\u0736\u1a75"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x5b

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0xd6b

    const v4, 0x7017ccd7

    xor-int/2addr v3, v4

    const v4, -0x6656eeae

    goto/16 :goto_0

    :sswitch_b
    sget v2, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v2, :cond_4

    :goto_1
    const-string v2, "\u06e1\u06d6"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x33

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x55d5

    const v4, 0x275c993f

    xor-int/2addr v3, v4

    const v4, -0x4066a84f

    goto/16 :goto_0

    :cond_4
    const-string v2, "\u1a73\u06e0"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x21

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x571

    const v4, -0x601035

    xor-int/2addr v3, v4

    const v4, 0x41b4f9e7

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v2

    if-eqz v2, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v2, "\u06d6\u06ec"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x3f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x63d1

    const v4, 0x3e1cb275

    xor-int/2addr v3, v4

    const v4, 0x6b582b46

    goto/16 :goto_0

    .line 555
    :sswitch_d
    sget v2, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v2, :cond_6

    goto :goto_2

    :cond_6
    const-string v2, "\u1a78\u06e2"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x7f

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x3d39

    const v4, -0x725a381a

    xor-int/2addr v3, v4

    const v4, -0x4b7d9a02

    goto/16 :goto_0

    :sswitch_e
    sget v2, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v2, :cond_7

    goto :goto_3

    :cond_7
    const-string v2, "\u1a73\u05ab"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x6d43

    const v4, 0x5c4561d0

    xor-int/2addr v3, v4

    const v4, 0x4f75e7d0

    goto/16 :goto_0

    .line 269
    :sswitch_f
    sget v2, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v2, :cond_9

    :cond_8
    :goto_2
    const-string v2, "\u1a75\u1a76"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x448d

    const v4, -0x272cda91

    xor-int/2addr v3, v4

    const v4, -0x6373b4b5

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u05ab\u1a76"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x620d

    const v4, -0x509983be

    xor-int/2addr v3, v4

    const v4, 0x47358d27

    goto/16 :goto_0

    :sswitch_10
    sget v2, Ll/֫;->ܶܺ᩻:I

    if-ltz v2, :cond_a

    :goto_3
    const-string v2, "\u1a76\u1a73"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x3b

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x5521

    const v4, -0x1bd3bb92

    xor-int/2addr v3, v4

    const v4, -0x74b4784a

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u1a74\u1a76"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x43

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x2655

    const v4, 0x1ea04873

    xor-int/2addr v3, v4

    const v4, -0x10b91647

    goto/16 :goto_0

    .line 50
    :sswitch_11
    sget-boolean v2, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v2, :cond_c

    :cond_b
    const-string v2, "\u06e1\u1a75"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x45

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0xb0f

    const v4, -0x617f77cd

    xor-int/2addr v3, v4

    const v4, 0x1e70063

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e7\u06da"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x29

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x436d

    const v4, -0x4e10fcf7

    xor-int/2addr v3, v4

    const v4, 0xb1013aa

    goto/16 :goto_0

    .line 75
    :sswitch_12
    sget v2, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v2, :cond_e

    :cond_d
    :goto_4
    const-string v2, "\u1a76\u06d8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2f1

    const v4, 0x25e48b2f

    xor-int/2addr v3, v4

    const v4, -0x5c492ac2

    goto/16 :goto_0

    :cond_e
    const-string v2, "\u06e7\u1a76"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0xb

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x160d

    const v4, -0x70205a43

    xor-int/2addr v3, v4

    const v4, 0x1aacbd76

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b187706 -> :sswitch_7
        -0x70b10203 -> :sswitch_9
        -0x631bade7 -> :sswitch_8
        -0x60fda81b -> :sswitch_4
        -0x5c1dee60 -> :sswitch_b
        -0x539e684e -> :sswitch_8
        -0x4f25c128 -> :sswitch_2
        -0x4581ef68 -> :sswitch_a
        -0x3a2725f2 -> :sswitch_11
        -0x3400fb44 -> :sswitch_5
        -0x2569a99f -> :sswitch_6
        -0x23ece2c0 -> :sswitch_12
        -0x1cf4c849 -> :sswitch_10
        -0x1673f4e0 -> :sswitch_9
        -0x13364025 -> :sswitch_1
        -0x63aae25 -> :sswitch_d
        -0x5da5b6e -> :sswitch_3
        0x38ecccc -> :sswitch_e
        0x4393708 -> :sswitch_1
        0x5f98147 -> :sswitch_c
        0xf98c3f6 -> :sswitch_10
        0x17f3c2b2 -> :sswitch_f
        0x1e2447bf -> :sswitch_3
        0x309525d1 -> :sswitch_11
        0x3606f752 -> :sswitch_b
        0x3941599b -> :sswitch_a
        0x3a440c90 -> :sswitch_2
        0x3c6ab894 -> :sswitch_4
        0x3c84e03b -> :sswitch_0
        0x3e77ecf4 -> :sswitch_12
        0x43071700 -> :sswitch_5
        0x5090693f -> :sswitch_6
        0x545a97c8 -> :sswitch_e
        0x5c190e8c -> :sswitch_d
        0x616dbc13 -> :sswitch_7
        0x6f5d3e74 -> :sswitch_c
        0x73d9509e -> :sswitch_f
        0x7de958d1 -> :sswitch_0
    .end sparse-switch
.end method

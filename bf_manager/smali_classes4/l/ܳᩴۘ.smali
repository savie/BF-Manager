.class public final Ll/ܳᩴۘ;
.super Ljava/lang/Object;
.source "C2R7"


# instance fields
.field public final ֨:Ll/۠᩵ᩴ;

.field public final ۖ:Ll/۠᩵ᩴ;

.field public final ۙ:Ljava/util/HashMap;

.field public final ۚ:Ljava/lang/String;

.field public final ۨ:Ll/۠᩵ᩴ;

.field public final ܰ:Ljava/lang/String;

.field public final ᩹:Ll/۠᩵ᩴ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/۠᩵ᩴ;Ll/۠᩵ᩴ;Ll/۠᩵ᩴ;Ll/۠᩵ᩴ;Ljava/util/HashMap;)V
    .locals 6

    const v0, 0x52d0ba91

    sget v1, Ll/ۖܽ;->ܳ۠᩹:I

    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    .line 342
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06dc\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x10b7

    const v5, 0x7ccc1b83

    xor-int/2addr v4, v5

    const v5, -0x1f2d5e65

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x144b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_6

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-lez v3, :cond_7

    goto/16 :goto_4

    .line 237
    :sswitch_1
    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v3, :cond_9

    goto/16 :goto_1

    :sswitch_2
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_b

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    goto/16 :goto_1

    .line 193
    :sswitch_4
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 349
    :sswitch_5
    iput-object p5, p0, Ll/ܳᩴۘ;->֨:Ll/۠᩵ᩴ;

    .line 350
    iput-object p6, p0, Ll/ܳᩴۘ;->ۖ:Ll/۠᩵ᩴ;

    .line 351
    iput-object p7, p0, Ll/ܳᩴۘ;->ۙ:Ljava/util/HashMap;

    return-void

    .line 348
    :sswitch_6
    iput-object p4, p0, Ll/ܳᩴۘ;->ۨ:Ll/۠᩵ᩴ;

    .line 291
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v3

    if-gtz v3, :cond_0

    const-string v3, "\u06d7\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x77e1

    const v5, -0x118790d2

    xor-int/2addr v4, v5

    const v5, -0x6d4c4d2a

    goto :goto_0

    :cond_0
    const-string v3, "\u073f\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3bb7

    const v5, -0x3a12011b

    xor-int/2addr v4, v5

    const v5, -0x2673893f

    goto :goto_0

    .line 347
    :sswitch_7
    iput-object p3, p0, Ll/ܳᩴۘ;->᩹:Ll/۠᩵ᩴ;

    .line 162
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06e0\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2b85

    const v5, 0x4b2be11d    # 1.1264285E7f

    xor-int/2addr v4, v5

    const v5, 0x60460eb

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u073f\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3cd

    const v5, 0xda4370

    xor-int/2addr v4, v5

    const v5, -0x9fe9a2f

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v3, :cond_3

    :goto_1
    const-string v3, "\u073f\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x55f7

    const v5, 0x1c3970ab

    xor-int/2addr v4, v5

    const v5, 0x2d4b50d0

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e2\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x36f1

    const v5, -0x775c1a26

    xor-int/2addr v4, v5

    const v5, 0x35289adb

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u073a\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7df1

    const v5, 0x127415a

    xor-int/2addr v4, v5

    const v5, -0x7a763138

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u05a1\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2315

    const v5, -0x20f57bb2

    xor-int/2addr v4, v5

    const v5, -0x52321471

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a78\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x70bf

    const v5, -0x5a270e66

    xor-int/2addr v4, v5

    const v5, -0x56b884fa

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u1a75\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6b89

    const v5, 0xe60c400

    xor-int/2addr v4, v5

    const v5, 0x325d6e17

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e2\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5cb

    const v5, 0x54135407

    xor-int/2addr v4, v5

    const v5, 0x4c5f1dd1    # 5.8488644E7f

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u0733\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6b6b

    const v5, -0x75ea641c

    xor-int/2addr v4, v5

    const v5, -0x62e93784

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a76\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x11af

    const v5, -0xdce1732

    xor-int/2addr v4, v5

    const v5, 0x36e1c66b

    goto/16 :goto_0

    .line 345
    :sswitch_e
    iput-object p1, p0, Ll/ܳᩴۘ;->ۚ:Ljava/lang/String;

    .line 346
    iput-object p2, p0, Ll/ܳᩴۘ;->ܰ:Ljava/lang/String;

    .line 7
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u073d\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3c75

    const v5, 0x139d2ab9

    xor-int/2addr v4, v5

    const v5, -0x6c97a3f6

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05a1\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3903

    const v5, -0x24c4819f

    xor-int/2addr v4, v5

    const v5, -0x34e8b6a1    # -9914719.0f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ec5b28b -> :sswitch_1
        -0x7d72abd4 -> :sswitch_2
        -0x7552b63c -> :sswitch_0
        -0x7019b243 -> :sswitch_b
        -0x6e819c14 -> :sswitch_6
        -0x65edaeab -> :sswitch_9
        -0x5e67ecfa -> :sswitch_c
        -0x39e80813 -> :sswitch_5
        -0x38ec26fb -> :sswitch_d
        -0x347d0547 -> :sswitch_3
        -0x31685d03 -> :sswitch_5
        -0x304ac53e -> :sswitch_0
        -0x2b73046e -> :sswitch_d
        -0x217b1c8d -> :sswitch_7
        -0x1961a794 -> :sswitch_8
        -0xccca74f -> :sswitch_c
        -0xb6cb41 -> :sswitch_e
        0x7b78703 -> :sswitch_a
        0x18da410e -> :sswitch_4
        0x26d4b940 -> :sswitch_6
        0x2936198f -> :sswitch_a
        0x2d4ee01c -> :sswitch_b
        0x4431a1ee -> :sswitch_8
        0x5b16919c -> :sswitch_3
        0x617b6f07 -> :sswitch_7
        0x6a502eed -> :sswitch_9
        0x734c9b91 -> :sswitch_e
        0x77db20ec -> :sswitch_4
        0x78f8644d -> :sswitch_2
        0x7c8d6339 -> :sswitch_1
    .end sparse-switch
.end method

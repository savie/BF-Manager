.class public final synthetic Ll/۬ܰ֫;
.super Ljava/lang/Object;
.source "517G"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/᩷᩶֫;

.field public final synthetic ܿ:Ljava/util/concurrent/ExecutorService;

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/᩷᩶֫;Ll/ܽ֡֫;Ljava/util/concurrent/ExecutorService;)V
    .locals 6

    const v0, -0x11fb5273

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    sget v2, Ll/ۧ;->ۨۗܰ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a73\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7cb7

    const v5, -0x682ef37c

    xor-int/2addr v4, v5

    const v5, 0x4543f602

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x401d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_0
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_9

    goto :goto_1

    .line 1
    :sswitch_1
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_2

    goto :goto_1

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    :goto_1
    const-string v3, "\u06ec\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5cdd

    const v5, 0xdfd916d

    xor-int/2addr v4, v5

    const v5, -0xcf0f885

    goto :goto_0

    .line 0
    :sswitch_4
    iput-object p3, p0, Ll/۬ܰ֫;->ܿ:Ljava/util/concurrent/ExecutorService;

    return-void

    .line 3
    :sswitch_5
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06db\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x384f

    const v5, 0x5aa111b1

    xor-int/2addr v4, v5

    const v5, 0x76c7f06c

    goto :goto_0

    :sswitch_6
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u06d7\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1be1

    const v5, -0x2805ee95

    xor-int/2addr v4, v5

    const v5, -0x396e1c05

    goto :goto_0

    .line 0
    :sswitch_7
    sget-boolean v3, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v3, :cond_3

    :cond_2
    :goto_2
    const-string v3, "\u1a79\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x28a3

    const v5, -0x5d2633c9

    xor-int/2addr v4, v5

    const v5, 0x280fbce0

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u05a1\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x31d5

    const v5, -0x290c06f9

    xor-int/2addr v4, v5

    const v5, -0x5c589ba6

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    const-string v3, "\u06ec\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x20ab

    const v5, 0x54ce1988

    xor-int/2addr v4, v5

    const v5, 0x64d4f06b

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06d7\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x501f

    const v5, -0x4b0ec259

    xor-int/2addr v4, v5

    const v5, 0x6ec85b4d

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u1a78\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5fe5

    const v5, -0x5929d39

    xor-int/2addr v4, v5

    const v5, 0x7237dbdd

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v3, "\u06e0\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x21c7

    const v5, -0x51e1b9de

    xor-int/2addr v4, v5

    const v5, -0xf6c3021

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06eb\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4c9b

    const v5, 0x49bf7654    # 1568458.5f

    xor-int/2addr v4, v5

    const v5, 0x7668cf0a

    goto/16 :goto_0

    .line 3
    :sswitch_c
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v3

    if-gtz v3, :cond_a

    :cond_9
    const-string v3, "\u06e8\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x41d9

    const v5, 0x36dca3a7

    xor-int/2addr v4, v5

    const v5, -0x5ab10594

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073f\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3bd3

    const v5, 0x69d6d26a

    xor-int/2addr v4, v5

    const v5, -0x517f517

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_b

    goto :goto_3

    :cond_b
    const-string v3, "\u06dc\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x41f1

    const v5, 0x6ee964ae

    xor-int/2addr v4, v5

    const v5, 0x4d679855    # 2.4284501E8f

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/۬ܰ֫;->ܰ:Ll/᩷᩶֫;

    iput-object p2, p0, Ll/۬ܰ֫;->᩶:Ll/ܽ֡֫;

    .line 2
    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_c

    :goto_3
    const-string v3, "\u1a73\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x31e3

    const v5, -0x123ed0a4

    xor-int/2addr v4, v5

    const v5, -0x26b295b2

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06eb\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x186d

    const v5, -0x7e70544e

    xor-int/2addr v4, v5

    const v5, 0x6ac47b3a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7628e126 -> :sswitch_5
        -0x758acbb7 -> :sswitch_c
        -0x6df99331 -> :sswitch_e
        -0x5f75b524 -> :sswitch_8
        -0x516eff8e -> :sswitch_0
        -0x48f351b8 -> :sswitch_6
        -0x410abe38 -> :sswitch_7
        -0x3e1393b4 -> :sswitch_e
        -0x3db234dc -> :sswitch_8
        -0x39eeb2e2 -> :sswitch_a
        -0x36e4308a -> :sswitch_7
        -0x25435ca8 -> :sswitch_d
        -0x21fbc412 -> :sswitch_2
        -0x20f46de8 -> :sswitch_b
        -0x1b03da5f -> :sswitch_4
        -0x4bd913b -> :sswitch_3
        0x23267f51 -> :sswitch_1
        0x348d0e13 -> :sswitch_9
        0x37ac146a -> :sswitch_1
        0x47d9ed6b -> :sswitch_2
        0x4cb6bb3b -> :sswitch_b
        0x545db9dd -> :sswitch_d
        0x5cb2950a -> :sswitch_a
        0x5d856dd2 -> :sswitch_c
        0x60bca70f -> :sswitch_4
        0x6271208f -> :sswitch_9
        0x68497923 -> :sswitch_3
        0x69370f51 -> :sswitch_0
        0x76e8670c -> :sswitch_5
        0x7a42658d -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x4c71e771

    sget v3, Ll/᩺;->۫۬۫:I

    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v5, "\u1a77\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x35

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6b7

    const v7, 0x6c6b81d3

    xor-int/2addr v6, v7

    const v7, 0x50a4f9cd

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0xe33

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget v5, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v5, :cond_9

    goto/16 :goto_4

    :sswitch_0
    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v5, :cond_5

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget-boolean v5, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v5, :cond_b

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    goto :goto_1

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    return-void

    .line 0
    :sswitch_4
    iget-object v2, p0, Ll/۬ܰ֫;->ܰ:Ll/᩷᩶֫;

    invoke-static {v2, v0, v1}, Ll/᩷᩶֫;->ۙ(Ll/᩷᩶֫;Ll/ܽ֡֫;Ljava/util/concurrent/ExecutorService;)V

    return-void

    :sswitch_5
    iget-object v1, p0, Ll/۬ܰ֫;->ܿ:Ljava/util/concurrent/ExecutorService;

    sget v5, Ll/ۧ;->ۨۗܰ:I

    if-ltz v5, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v5, "\u0736\u06e7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3099

    const v7, -0x167fa42e

    xor-int/2addr v6, v7

    const v7, -0x6e22acaa

    goto :goto_0

    :sswitch_6
    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v5, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v5, "\u1a76\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5a01

    const v7, -0x2811ba0b

    xor-int/2addr v6, v7

    const v7, -0x5a4fac8a

    goto :goto_0

    .line 4
    :sswitch_7
    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v5, :cond_2

    :goto_1
    const-string v5, "\u05ab\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0xf

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4fa1

    const v7, 0x787d31a6

    xor-int/2addr v6, v7

    const v7, 0x20001c7c

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u0730\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2907

    const v7, -0x4ef6f27d

    xor-int/2addr v6, v7

    const v7, 0x22dd7db9

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v5, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u06e7\u1a76"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x37

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1d03

    const v7, 0x319b2ee

    xor-int/2addr v6, v7

    const v7, -0x5f4bd711

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v5

    if-eqz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u05a8\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7d1b

    const v7, 0x42bf5791

    xor-int/2addr v6, v7

    const v7, 0x55ad1665

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v5, :cond_6

    :cond_5
    :goto_2
    const-string v5, "\u073d\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x315b

    const v7, 0x40186cb7

    xor-int/2addr v6, v7

    const v7, 0x5565bb1f

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06ec\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1523

    const v7, 0x7dd84d80

    xor-int/2addr v6, v7

    const v7, -0x612f7da9

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u1a76\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x66b5

    const v7, -0x1a6dda7

    xor-int/2addr v6, v7

    const v7, 0x6c9575fa

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v5, :cond_8

    :goto_3
    const-string v5, "\u05ab\u06eb"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x3f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x732b

    const v7, 0x734aba4c

    xor-int/2addr v6, v7

    const v7, 0x49936056    # 1207306.8f

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06d9\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x47

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5449

    const v7, 0x358748f4

    xor-int/2addr v6, v7

    const v7, 0x9d372ba

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v5, :cond_a

    :cond_9
    const-string v5, "\u0730\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3a0d

    const v7, -0x7cc87844

    xor-int/2addr v6, v7

    const v7, 0x759cd86

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a7a\u1a73"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0xd

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5b0d

    const v7, -0x1f3d3ce7

    xor-int/2addr v6, v7

    const v7, -0x65a9a09a

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-object v0, p0, Ll/۬ܰ֫;->᩶:Ll/ܽ֡֫;

    .line 1
    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u06db\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x279d

    const v7, 0x43775259

    xor-int/2addr v6, v7

    const v7, -0x13090996

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a76\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x35

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xa13

    const v7, -0x1366df81

    xor-int/2addr v6, v7

    const v7, -0x799ca36f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ce9252d -> :sswitch_b
        -0x6fb46451 -> :sswitch_3
        -0x64bfa32d -> :sswitch_5
        -0x616faa6e -> :sswitch_1
        -0x5bccf355 -> :sswitch_9
        -0x5a679f94 -> :sswitch_3
        -0x566d7762 -> :sswitch_d
        -0x4ca3ea70 -> :sswitch_b
        -0x4827ee47 -> :sswitch_d
        -0x29eab4fa -> :sswitch_2
        -0x1f419b4b -> :sswitch_7
        -0xf4cead4 -> :sswitch_4
        -0xcb913bb -> :sswitch_4
        -0x5e8230 -> :sswitch_e
        0x7beb5fc -> :sswitch_7
        0x1c2edad3 -> :sswitch_6
        0x2c23862b -> :sswitch_a
        0x36bf6f7f -> :sswitch_9
        0x39aa6aeb -> :sswitch_0
        0x493f5c16 -> :sswitch_0
        0x56751de8 -> :sswitch_a
        0x5715d64f -> :sswitch_e
        0x57991a1d -> :sswitch_c
        0x612caceb -> :sswitch_5
        0x6b5e9ec9 -> :sswitch_8
        0x6f860fce -> :sswitch_1
        0x71c74ff3 -> :sswitch_c
        0x7e4d81fb -> :sswitch_2
        0x7e94d9b4 -> :sswitch_6
        0x7ecc47ba -> :sswitch_8
    .end sparse-switch
.end method

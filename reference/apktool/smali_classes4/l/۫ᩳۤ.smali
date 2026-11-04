.class public final synthetic Ll/۫ᩳۤ;
.super Ljava/lang/Object;
.source "JAGX"

# interfaces
.implements Ll/ᩳۙ۫;


# instance fields
.field public final synthetic ܰ:Ll/ܺᩳۤ;

.field public final synthetic ܿ:Lbin/mt/plus/Main;

.field public final synthetic ᩶:Ll/ܰ᩺᩻;


# direct methods
.method public synthetic constructor <init>(Ll/ܺᩳۤ;Ll/ܰ᩺᩻;Lbin/mt/plus/Main;)V
    .locals 6

    const v0, -0x2bc51d6b

    sget v1, Ll/ۗ᩺;->֡ۙۜ:I

    sget v2, Ll/ۖۗ;->᩻ܳܶ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a79\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4c1d

    const v5, -0x7421f398

    xor-int/2addr v4, v5

    const v5, 0x5261b269

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x1f75

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v3, :cond_5

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-lez v3, :cond_a

    goto/16 :goto_3

    .line 0
    :sswitch_2
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v3

    if-gez v3, :cond_8

    goto :goto_1

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/۫ᩳۤ;->ܿ:Lbin/mt/plus/Main;

    return-void

    :sswitch_6
    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v3, "\u06df\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5953

    const v5, -0x6544aae2

    xor-int/2addr v4, v5

    const v5, -0x4144a79e

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u0733\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1717

    const v5, -0x2699fd83

    xor-int/2addr v4, v5

    const v5, 0x3784cf68

    goto :goto_0

    :cond_2
    const-string v3, "\u1a76\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7cc7

    const v5, 0x6591ed48

    xor-int/2addr v4, v5

    const v5, 0x3d66f2da

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_3

    :goto_1
    const-string v3, "\u0730\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x76a5

    const v5, 0xf93f8af

    xor-int/2addr v4, v5

    const v5, 0x6ff1a5f8

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a78\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, -0x7d

    const v5, -0x57bf1b3

    xor-int/2addr v4, v5

    const v5, -0x226f534d

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u0733\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x20f1

    const v5, -0x11a38e28

    xor-int/2addr v4, v5

    const v5, -0x5dd22162

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u06e7\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4061

    const v5, 0x6a1f51c1

    xor-int/2addr v4, v5

    const v5, 0x476a3153

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06ec\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6c37

    const v5, -0x1a96b80

    xor-int/2addr v4, v5

    const v5, 0x5c26ae3

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u05a8\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x517d

    const v5, 0x40fbf6db

    xor-int/2addr v4, v5

    const v5, 0x51ac61ba

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06db\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6675

    const v5, 0x2c56c34

    xor-int/2addr v4, v5

    const v5, -0x191fe259

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u05a8\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5751

    const v5, 0x7c84dbeb

    xor-int/2addr v4, v5

    const v5, -0x1859664

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u05a1\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5c2d

    const v5, 0x6bbe7aae

    xor-int/2addr v4, v5

    const v5, 0x2b2e4f4d

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e2\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c31

    const v5, -0x44f52068

    xor-int/2addr v4, v5

    const v5, 0x516f4647

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/۫ᩳۤ;->ܰ:Ll/ܺᩳۤ;

    iput-object p2, p0, Ll/۫ᩳۤ;->᩶:Ll/ܰ᩺᩻;

    .line 3
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_c

    :goto_5
    const-string v3, "\u06d8\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, 0x33

    const v5, 0x3432269f

    xor-int/2addr v4, v5

    const v5, 0x33883d33

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d7\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4c7f

    const v5, 0x508661f3

    xor-int/2addr v4, v5

    const v5, 0x76b8bfc7

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f89970a -> :sswitch_6
        -0x6897a9ad -> :sswitch_1
        -0x607e01c5 -> :sswitch_7
        -0x527c4ce3 -> :sswitch_0
        -0x5249a94f -> :sswitch_8
        -0x4db3c69a -> :sswitch_3
        -0x41c1b6fd -> :sswitch_2
        -0x3f553c12 -> :sswitch_4
        -0x385b4408 -> :sswitch_2
        -0x2e1d1502 -> :sswitch_a
        -0x20d9990c -> :sswitch_6
        -0x1c576004 -> :sswitch_d
        -0x12435d8e -> :sswitch_e
        -0x1023cd4a -> :sswitch_c
        -0x31f1b32 -> :sswitch_0
        0x7f4d74a -> :sswitch_8
        0x9858bfb -> :sswitch_3
        0xbd2af34 -> :sswitch_4
        0x11ce3445 -> :sswitch_7
        0x15b33f25 -> :sswitch_e
        0x2b3d2097 -> :sswitch_5
        0x2be8ce02 -> :sswitch_9
        0x2cd40f7e -> :sswitch_b
        0x2dcbda52 -> :sswitch_a
        0x2fde054d -> :sswitch_d
        0x33b47806 -> :sswitch_1
        0x576e85af -> :sswitch_c
        0x6b6a11ad -> :sswitch_b
        0x711c23e6 -> :sswitch_9
        0x7b1522ba -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final synthetic ۙ()V
    .locals 0

    return-void
.end method

.method public final ۙ(Ll/ۡ᩷᩸;Z)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x2e11a647

    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    const-string v4, "\u06d9\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4005

    const v6, 0x3236498c

    xor-int/2addr v5, v6

    const v6, 0x4efe368c

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x6349

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 0
    iget-object v0, p0, Ll/۫ᩳۤ;->᩶:Ll/ܰ᩺᩻;

    .line 1
    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v4, :cond_1

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u05a1\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x29b7

    const v6, -0x4e0015f6

    xor-int/2addr v5, v6

    const v6, 0x239dd289

    goto :goto_0

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_b

    goto/16 :goto_3

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v4, :cond_5

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    goto/16 :goto_3

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v1, p0, Ll/۫ᩳۤ;->ܿ:Lbin/mt/plus/Main;

    iget-object v2, p0, Ll/۫ᩳۤ;->ܰ:Ll/ܺᩳۤ;

    invoke-static {v2, v0, v1, p1, p2}, Ll/ܺᩳۤ;->ۙ(Ll/ܺᩳۤ;Ll/ܰ᩺᩻;Lbin/mt/plus/Main;Ll/ۡ᩷᩸;Z)V

    return-void

    :cond_1
    const-string v4, "\u06e4\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2beb

    const v6, -0x1d9c3bef

    xor-int/2addr v5, v6

    const v6, -0x2cb48fd3

    goto :goto_0

    :sswitch_6
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06ec\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x10f1

    const v6, 0x71c78b39

    xor-int/2addr v5, v6

    const v6, -0x454a946a

    goto/16 :goto_0

    .line 3
    :sswitch_7
    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u1a7a\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2a33

    const v6, 0x1bae0a7e

    xor-int/2addr v5, v6

    const v6, 0x14b9d6e4

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    const-string v4, "\u06d6\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xf47

    const v6, -0x575d306b

    xor-int/2addr v5, v6

    const v6, 0x2c27543b

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v4, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u0736\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x221

    const v6, 0x36864245

    xor-int/2addr v5, v6

    const v6, -0x8d58b8a

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d9\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7719

    const v6, -0x3614fc8d

    xor-int/2addr v5, v6

    const v6, -0x318de217

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_7

    :goto_2
    const-string v4, "\u0736\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x25cd

    const v6, -0x412c0822    # -0.41400045f

    xor-int/2addr v5, v6

    const v6, -0x46dcb5d4

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u073f\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xa49

    const v6, -0x48fed247

    xor-int/2addr v5, v6

    const v6, -0x52287ec2    # -2.4500065E-11f

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u073a\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x451b

    const v6, -0x4358ce42

    xor-int/2addr v5, v6

    const v6, 0x67969fc2

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u073d\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5335

    const v6, 0x14ca1106

    xor-int/2addr v5, v6

    const v6, -0x6e71d52

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_a

    :goto_3
    const-string v4, "\u06ec\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3b7d

    const v6, 0x1e7fb7a1

    xor-int/2addr v5, v6

    const v6, -0xc95077c

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a78\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x6b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x655d

    const v6, 0x6af9bdd5

    xor-int/2addr v5, v6

    const v6, -0x42157803

    goto/16 :goto_0

    .line 1
    :sswitch_e
    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06e0\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2499

    const v6, 0x2fe8509c

    xor-int/2addr v5, v6

    const v6, -0x17fd3c60

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7a\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x17db

    const v6, -0x3e0fdabb

    xor-int/2addr v5, v6

    const v6, 0x4f46c75f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b256fb5 -> :sswitch_6
        -0x7976ff0a -> :sswitch_1
        -0x711edf79 -> :sswitch_0
        -0x68461b09 -> :sswitch_a
        -0x67331bd9 -> :sswitch_e
        -0x66880801 -> :sswitch_d
        -0x646b406d -> :sswitch_0
        -0x5ed7789c -> :sswitch_2
        -0x4c029186 -> :sswitch_1
        -0x43685a74 -> :sswitch_e
        -0x3fde54ea -> :sswitch_9
        -0x387781c9 -> :sswitch_6
        -0x37a3a0a9 -> :sswitch_7
        -0x2086ddd3 -> :sswitch_a
        -0x1b937d74 -> :sswitch_c
        0x211487a -> :sswitch_b
        0x579a049 -> :sswitch_5
        0x1844a756 -> :sswitch_3
        0x255802d2 -> :sswitch_4
        0x285ad3ba -> :sswitch_8
        0x2b18eeaa -> :sswitch_d
        0x3db76f26 -> :sswitch_9
        0x3e30276d -> :sswitch_2
        0x4c942c21 -> :sswitch_c
        0x4f881cdd -> :sswitch_4
        0x57abf8de -> :sswitch_7
        0x604f955c -> :sswitch_5
        0x674a9b21 -> :sswitch_3
        0x6a168068 -> :sswitch_b
        0x7fab2741 -> :sswitch_8
    .end sparse-switch
.end method

.method public final synthetic ۙ(Ljava/lang/Exception;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

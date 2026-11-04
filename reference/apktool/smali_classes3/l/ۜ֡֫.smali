.class public final synthetic Ll/ۜ֡֫;
.super Ljava/lang/Object;
.source "JAJI"

# interfaces
.implements Ljava/util/function/Function;


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x65e5c756

    sget v2, Ll/֨ۢ;->۬ܿܺ:I

    sget v3, Ll/ۖ;->ܿۚ֡:I

    const-string v4, "\u1a75\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4b11

    const v6, 0x458636b6

    xor-int/2addr v5, v6

    const v6, 0x32d899b3

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x5bfb

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v4

    if-eqz v4, :cond_a

    goto/16 :goto_3

    .line 2
    :sswitch_0
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v4, :cond_b

    goto/16 :goto_2

    .line 0
    :sswitch_1
    sget v4, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u05a8\u073d"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x107d

    const v6, 0x7638696b

    xor-int/2addr v5, v6

    const v6, -0x79a4ff31

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v4

    if-lez v4, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    const/4 p1, 0x0

    return-object p1

    :sswitch_5
    sget p1, Ll/ܺ۟֫;->ܶ᩷:I

    new-instance p1, Ll/֫۟֫;

    invoke-direct {p1, v0}, Ll/֫۟֫;-><init>(Ljava/lang/String;)V

    return-object p1

    :sswitch_6
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    .line 1
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v4

    if-ltz v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v4, "\u1a75\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5283

    const v6, 0x4f84910

    xor-int/2addr v5, v6

    const v6, 0x36d78c22

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v4, "\u06ec\u1a77"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1827

    const v6, -0x2974f82

    xor-int/2addr v5, v6

    const v6, -0x6ba2e77b

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06e2\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4565

    const v6, -0x4d7125e7

    xor-int/2addr v5, v6

    const v6, -0x62183001

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u05a8\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x213d

    const v6, 0x4f3c5d39

    xor-int/2addr v5, v6

    const v6, -0x7b1ded9f

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06d8\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x58f1

    const v6, -0x49bebbdc

    xor-int/2addr v5, v6

    const v6, -0x569a285

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u0733\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4169

    const v6, -0x67eea9b7

    xor-int/2addr v5, v6

    const v6, -0x490fcb00

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v4

    if-ltz v4, :cond_7

    :goto_1
    const-string v4, "\u06df\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6d6b

    const v6, 0x48d4abc2

    xor-int/2addr v5, v6

    const v6, -0x17e32426

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e4\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2db7

    const v6, 0x2cb786fa

    xor-int/2addr v5, v6

    const v6, 0xc6b0631

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v4

    if-ltz v4, :cond_8

    :goto_2
    const-string v4, "\u06dc\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xab7

    const v6, 0x14709bd5

    xor-int/2addr v5, v6

    const v6, 0x1d9a8283

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a74\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x13b

    const v6, 0x545c0d00

    xor-int/2addr v5, v6

    const v6, 0x2b3ae489

    goto/16 :goto_0

    :cond_9
    :goto_3
    const-string v4, "\u073d\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x77d3

    const v6, 0x50a1a38

    xor-int/2addr v5, v6

    const v6, -0x3b3aa65f

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0730\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1563

    const v6, -0x33599032    # -8.726078E7f

    xor-int/2addr v5, v6

    const v6, 0x4a329e73    # 2926492.8f

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a73\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x26b3

    const v6, -0x7bac1d56

    xor-int/2addr v5, v6

    const v6, -0xb763aa9

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e4\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1571

    const v6, 0x15525f37

    xor-int/2addr v5, v6

    const v6, 0x782a9c9d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7af0bfe5 -> :sswitch_5
        -0x7aaa896a -> :sswitch_b
        -0x7a37b0e1 -> :sswitch_e
        -0x6eabce2e -> :sswitch_d
        -0x5bc6233b -> :sswitch_0
        -0x4557aafb -> :sswitch_3
        -0x3903f1d9 -> :sswitch_4
        -0x2ffb3847 -> :sswitch_2
        -0x1a038e59 -> :sswitch_4
        -0xda24aeb -> :sswitch_b
        -0x98a505e -> :sswitch_e
        -0x9057019 -> :sswitch_c
        -0x4721009 -> :sswitch_9
        0x4f53a51 -> :sswitch_8
        0x7d55a14 -> :sswitch_d
        0xfb37685 -> :sswitch_1
        0x1229f8bc -> :sswitch_2
        0x144a7787 -> :sswitch_6
        0x20ac7610 -> :sswitch_8
        0x25e388a4 -> :sswitch_c
        0x342bb0ec -> :sswitch_a
        0x44d220ef -> :sswitch_3
        0x46814599 -> :sswitch_7
        0x628f055f -> :sswitch_6
        0x6a9d679b -> :sswitch_5
        0x6d9685eb -> :sswitch_a
        0x71657fd7 -> :sswitch_9
        0x77834ac7 -> :sswitch_1
        0x78229851 -> :sswitch_0
        0x7a11654b -> :sswitch_7
    .end sparse-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

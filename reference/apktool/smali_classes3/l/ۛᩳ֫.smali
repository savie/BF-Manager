.class public final synthetic Ll/ۛᩳ֫;
.super Ljava/lang/Object;
.source "C2R7"

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
    .locals 6

    const v0, -0x4b47b381

    sget v1, Ll/֫֡;->֫ۙۖ:I

    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    const-string v3, "\u06d6\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2861

    const v5, 0x61e35a19

    xor-int/2addr v4, v5

    const v5, 0x480d5679

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x3fc9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 0
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_3

    .line 2
    :sswitch_0
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_b

    goto :goto_1

    .line 4
    :sswitch_1
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_8

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    goto :goto_1

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_4
    new-instance v3, Ll/᩺ۢ֫;

    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_0

    goto :goto_2

    :cond_0
    check-cast p1, Ll/᩵ۢ֫;

    invoke-direct {v3, p1}, Ll/᩺ۢ֫;-><init>(Ll/᩵ۢ֫;)V

    return-object v3

    :sswitch_5
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_1

    :goto_1
    const-string v3, "\u06d8\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6517

    const v5, 0x56d4e2af

    xor-int/2addr v4, v5

    const v5, -0x783b9408

    goto :goto_0

    :cond_1
    const-string v3, "\u06d7\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4e99

    const v5, -0x1ac76031

    xor-int/2addr v4, v5

    const v5, -0x7df03300

    goto :goto_0

    .line 3
    :sswitch_6
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v3

    if-nez v3, :cond_2

    :goto_2
    const-string v3, "\u0730\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2fff

    const v5, -0x478e54c7

    xor-int/2addr v4, v5

    const v5, -0x68bfa4d4

    goto :goto_0

    :cond_2
    const-string v3, "\u0733\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x542f

    const v5, 0x184528be

    xor-int/2addr v4, v5

    const v5, 0x79c9e393

    goto/16 :goto_0

    :sswitch_7
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_4

    :cond_3
    const-string v3, "\u1a75\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xa6b

    const v5, -0x639cb295    # -7.520806E-22f

    xor-int/2addr v4, v5

    const v5, 0x2f567831

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06d6\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x29c7

    const v5, 0x5a050a57

    xor-int/2addr v4, v5

    const v5, 0x6f036a38

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06dc\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6485

    const v5, -0x1eeb0154

    xor-int/2addr v4, v5

    const v5, -0x1eecba6a

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u1a78\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x21d9

    const v5, 0x2e894395

    xor-int/2addr v4, v5

    const v5, -0x19d7b133

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u06e0\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x61ed

    const v5, -0x58cf29c0

    xor-int/2addr v4, v5

    const v5, 0x57f5ce46

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u1a7a\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3b5d

    const v5, 0x12e32579

    xor-int/2addr v4, v5

    const v5, 0x135265f1

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a74\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x542d

    const v5, -0x1a50412f

    xor-int/2addr v4, v5

    const v5, -0x635be144

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u06db\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xac1

    const v5, 0x9be4e

    xor-int/2addr v4, v5

    const v5, -0x3109713f

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e4\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3279

    const v5, -0x46279a40

    xor-int/2addr v4, v5

    const v5, -0x3603d2b9

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06dc\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6b11

    const v5, 0x600da293

    xor-int/2addr v4, v5

    const v5, 0x4f63e6ee    # 3.8235622E9f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78685fea -> :sswitch_b
        -0x76387f47 -> :sswitch_5
        -0x677fdeb1 -> :sswitch_4
        -0x58fd2e02 -> :sswitch_7
        -0x58d57ffc -> :sswitch_c
        -0x4aa36b11 -> :sswitch_6
        -0x40988822 -> :sswitch_4
        -0x40435150 -> :sswitch_9
        -0x315aba89 -> :sswitch_3
        -0x3133ba02 -> :sswitch_2
        -0x1bc11689 -> :sswitch_3
        -0x111f513c -> :sswitch_8
        -0x51e4f36 -> :sswitch_1
        0xe62c909 -> :sswitch_8
        0x10d5c7a0 -> :sswitch_1
        0x12b7b162 -> :sswitch_0
        0x17b4ccb3 -> :sswitch_0
        0x266270d1 -> :sswitch_6
        0x26e8d63a -> :sswitch_d
        0x45ab8454 -> :sswitch_7
        0x4832a918 -> :sswitch_d
        0x4d8f612b -> :sswitch_5
        0x4e6c22a3 -> :sswitch_a
        0x5a309e7b -> :sswitch_2
        0x62993cf6 -> :sswitch_a
        0x6d2f3097 -> :sswitch_b
        0x70fc04de -> :sswitch_9
        0x7640f7b1 -> :sswitch_c
    .end sparse-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

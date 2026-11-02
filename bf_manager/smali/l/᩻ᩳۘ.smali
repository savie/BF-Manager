.class public final synthetic Ll/᩻ᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/function/Function;


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩻ᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const v0, 0x6d22c39a

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v2, Ll/ۧ;->֫۠ᩴ:I

    const-string v3, "\u073d\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6aa5

    const v5, 0x6dfd1b0c

    xor-int/2addr v4, v5

    const v5, -0x7b69c83d

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x713b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    goto/16 :goto_2

    :sswitch_0
    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v3, :cond_b

    goto/16 :goto_3

    :sswitch_1
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_8

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v3, :cond_3

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_4
    new-instance v3, Ll/ۧᩴۘ;

    .line 3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v4

    if-gtz v4, :cond_0

    goto/16 :goto_4

    .line 0
    :cond_0
    check-cast p1, Ll/ܽᩴۘ;

    invoke-direct {v3, p1}, Ll/ۧᩴۘ;-><init>(Ll/ܽᩴۘ;)V

    return-object v3

    :sswitch_5
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06db\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x766b

    const v5, -0x3a0ea54

    xor-int/2addr v4, v5

    const v5, 0x16de28da

    goto :goto_0

    .line 4
    :sswitch_6
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u073d\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x346b

    const v5, 0x7cc42d0b

    xor-int/2addr v4, v5

    const v5, 0x1bd00b79

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_4

    :cond_3
    :goto_1
    const-string v3, "\u073d\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x9bb

    const v5, 0x6a6d6c9c

    xor-int/2addr v4, v5

    const v5, -0x6cea8bb4

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a7b\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xfa3

    const v5, -0x549c569c

    xor-int/2addr v4, v5

    const v5, -0x2e1710d9

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u1a73\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x39a7

    const v5, 0x3de00b8

    xor-int/2addr v4, v5

    const v5, -0x50966bb

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_6

    :goto_2
    const-string v3, "\u0733\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x673f

    const v5, 0x6069a04e

    xor-int/2addr v4, v5

    const v5, 0x6e60c5e4

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06d9\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x511b

    const v5, -0x5eadc22d

    xor-int/2addr v4, v5

    const v5, 0x6c8577e1

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u06eb\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4e49

    const v5, 0x798ea281

    xor-int/2addr v4, v5

    const v5, 0x4fa852bd

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v3

    if-gtz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06dc\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5883

    const v5, 0x44b47a7f

    xor-int/2addr v4, v5

    const v5, 0x7ffe7d2e

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e4\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x71fb

    const v5, -0x230be18c

    xor-int/2addr v4, v5

    const v5, -0x2f6c2d4

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_a

    :goto_4
    const-string v3, "\u05a1\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3a09

    const v5, 0x309a6e50

    xor-int/2addr v4, v5

    const v5, -0x255ab5da

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06df\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6059

    const v5, 0x4fd9d424    # 7.3091174E9f

    xor-int/2addr v4, v5

    const v5, 0x19604f8

    goto/16 :goto_0

    .line 4
    :sswitch_d
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06eb\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7a0b

    const v5, 0x1610dcee

    xor-int/2addr v4, v5

    const v5, 0x6ae989a2

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e4\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7019

    const v5, 0x16398daa

    xor-int/2addr v4, v5

    const v5, -0x7463f8e3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75bda81f -> :sswitch_0
        -0x71f4639c -> :sswitch_6
        -0x70bd97d9 -> :sswitch_5
        -0x69ec76cb -> :sswitch_4
        -0x660591aa -> :sswitch_7
        -0x65657c19 -> :sswitch_8
        -0x5d1625f2 -> :sswitch_a
        -0x5b2befa9 -> :sswitch_5
        -0x5852b0f5 -> :sswitch_c
        -0x55019dea -> :sswitch_0
        -0x431e1295 -> :sswitch_1
        -0x3a174bbc -> :sswitch_d
        -0x28107212 -> :sswitch_b
        -0x24890f00 -> :sswitch_d
        -0x23ce99fa -> :sswitch_7
        -0x1d9af615 -> :sswitch_b
        -0x7412258 -> :sswitch_9
        0x187d4269 -> :sswitch_8
        0x19d666f3 -> :sswitch_9
        0x1e444fea -> :sswitch_2
        0x1e44b488 -> :sswitch_6
        0x201eae29 -> :sswitch_2
        0x35096812 -> :sswitch_1
        0x3ae4a0fe -> :sswitch_3
        0x493ecef5 -> :sswitch_4
        0x51ac3de9 -> :sswitch_a
        0x6ea19294 -> :sswitch_c
        0x770feb8b -> :sswitch_3
    .end sparse-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩻ᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

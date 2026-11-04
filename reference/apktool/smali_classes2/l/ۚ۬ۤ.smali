.class public final Ll/ۚ۬ۤ;
.super Ljava/lang/Object;
.source "J7HQ"


# direct methods
.method public static ۙ(IILjava/lang/String;)I
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x6d494e68

    sget v4, Ll/ۘ֡;->᩹ܶ۬:I

    sget v5, Ll/ۖ;->ܿۚ֡:I

    const-string v6, "\u1a79\u05a1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6c49

    const v8, -0x4b9f6ff0

    xor-int/2addr v7, v8

    const v8, 0x1621d53d

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x1661

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 97
    sget v6, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v6, :cond_9

    goto/16 :goto_5

    .line 142
    :sswitch_0
    sget v6, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v6, :cond_f

    goto/16 :goto_4

    :sswitch_1
    sget v6, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v6, :cond_6

    goto/16 :goto_5

    .line 114
    :sswitch_2
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v6

    if-gtz v6, :cond_b

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    goto/16 :goto_4

    .line 208
    :sswitch_4
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    const/4 p0, 0x0

    return p0

    :sswitch_5
    add-int/lit8 v2, v2, 0x1

    return v2

    :sswitch_6
    return v0

    .line 236
    :sswitch_7
    sget-object v2, Ll/۫۬ۤ;->۟:Ll/۫۬ۤ;

    invoke-static {p2, p0, p1, v2}, Ll/ۚ۬ۤ;->ۙ(Ljava/lang/String;IILl/۫۬ۤ;)I

    move-result v2

    if-eq v2, v0, :cond_0

    const-string v6, "\u1a76\u073a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x11d

    const v8, 0x29af538d

    xor-int/2addr v7, v8

    const v8, -0x18cd556

    goto :goto_0

    :cond_0
    const-string v6, "\u0733\u1a7a"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6fad

    const v8, 0x679b3e14

    xor-int/2addr v7, v8

    const v8, 0x3bbd0e8c

    goto :goto_0

    .line 231
    :sswitch_8
    sget-object v6, Ll/۫۬ۤ;->ܿ:Ll/۫۬ۤ;

    invoke-static {p2, p0, p1, v6}, Ll/ۚ۬ۤ;->ۙ(Ljava/lang/String;IILl/۫۬ۤ;)I

    move-result v6

    if-eq v6, v0, :cond_1

    goto :goto_2

    :cond_1
    const-string v6, "\u06e7\u1a79"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x22c5

    const v8, -0xb4f1f82

    xor-int/2addr v7, v8

    const v8, -0x774f86a4

    goto/16 :goto_0

    .line 226
    :sswitch_9
    sget-object v6, Ll/۫۬ۤ;->֡:Ll/۫۬ۤ;

    invoke-static {p2, p0, p1, v6}, Ll/ۚ۬ۤ;->ۙ(Ljava/lang/String;IILl/۫۬ۤ;)I

    move-result v6

    if-eq v6, v0, :cond_2

    :goto_2
    move v1, v6

    goto :goto_3

    :cond_2
    const-string v6, "\u1a76\u06e1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x37

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7781

    const v8, -0x81462ba

    xor-int/2addr v7, v8

    const v8, 0x13d35f54

    goto/16 :goto_0

    :sswitch_a
    add-int/lit8 v1, v1, 0x1

    return v1

    .line 221
    :sswitch_b
    sget-object v0, Ll/۫۬ۤ;->᩶:Ll/۫۬ۤ;

    invoke-static {p2, p0, p1, v0}, Ll/ۚ۬ۤ;->ۙ(Ljava/lang/String;IILl/۫۬ۤ;)I

    move-result v0

    const/4 v6, -0x1

    if-eq v0, v6, :cond_3

    move v1, v0

    const/4 v0, -0x1

    :goto_3
    const-string v6, "\u06d6\u0733"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xe7

    const v8, -0x7eb074

    xor-int/2addr v7, v8

    const v8, -0x474293b

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e7\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x4f

    xor-int v7, v0, v5

    mul-int/lit16 v7, v7, -0x285d

    const v8, 0x75d34edc

    xor-int/2addr v7, v8

    const v8, -0x381962b6

    xor-int/2addr v0, v8

    move v6, v0

    const/4 v0, -0x1

    goto/16 :goto_1

    :sswitch_c
    sget v6, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v6, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v6, "\u1a73\u06da"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x715

    const v8, -0x16c970bc

    xor-int/2addr v7, v8

    const v8, -0x1293db39

    goto/16 :goto_0

    .line 37
    :sswitch_d
    sget-boolean v6, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v6, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v6, "\u1a7b\u1a77"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x50d

    const v8, 0x562ae356

    xor-int/2addr v7, v8

    const v8, 0x16efb73b

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v6

    if-nez v6, :cond_7

    :cond_6
    const-string v6, "\u05ab\u1a7b"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6b93

    const v8, -0x19dfe166

    xor-int/2addr v7, v8

    const v8, 0x1882f60a

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06e8\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x59

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x35b3

    const v8, -0x37555b86

    xor-int/2addr v7, v8

    const v8, 0x38dd9919

    goto/16 :goto_0

    :sswitch_f
    sget v6, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v6, :cond_8

    goto :goto_5

    :cond_8
    const-string v6, "\u1a74\u06d6"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x31f3

    const v8, -0x5b4ea71d

    xor-int/2addr v7, v8

    const v8, -0x603547e5

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06d7\u05a1"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x464d

    const v8, 0x315e27d6

    xor-int/2addr v7, v8

    const v8, -0x2df2b664

    goto/16 :goto_0

    :sswitch_10
    sget v6, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v6, :cond_a

    :goto_4
    const-string v6, "\u06e4\u1a77"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x55

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1095

    const v8, -0x4a1024ef

    xor-int/2addr v7, v8

    const v8, 0x44723188

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u1a78\u06e7"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xadd

    const v8, -0x2f8016b0

    xor-int/2addr v7, v8

    const v8, 0x2705edd6

    goto/16 :goto_0

    :sswitch_11
    sget v6, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v6, :cond_c

    :cond_b
    :goto_5
    const-string v6, "\u1a76\u0736"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x15

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0xbc7

    const v8, 0x353b1836

    xor-int/2addr v7, v8

    const v8, -0x5357f97d

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u073f\u06db"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x79

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3753

    const v8, 0x1f5ca659

    xor-int/2addr v7, v8

    const v8, 0x16963f2b

    goto/16 :goto_0

    .line 171
    :sswitch_12
    sget v6, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v6, :cond_d

    goto :goto_6

    :cond_d
    const-string v6, "\u0730\u06db"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x21

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2c43

    const v8, -0x66029c15    # -2.6199943E-23f

    xor-int/2addr v7, v8

    const v8, -0x2b921664

    goto/16 :goto_0

    .line 137
    :sswitch_13
    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v6, :cond_e

    :goto_6
    const-string v6, "\u06e4\u1a75"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x63

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6755

    const v8, 0x445e98b1

    xor-int/2addr v7, v8

    const v8, 0x3d9af2b8

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u1a74\u06e7"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x22d5

    const v8, 0x3ebcc91b

    xor-int/2addr v7, v8

    const v8, -0x120b850b

    goto/16 :goto_0

    .line 109
    :sswitch_14
    sget v6, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v6, :cond_10

    :cond_f
    const-string v6, "\u06db\u1a76"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x6b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1b7d

    const v8, 0x5bdea8b1

    xor-int/2addr v7, v8

    const v8, -0x65e2adcc

    goto/16 :goto_0

    :cond_10
    const-string v6, "\u06eb\u06df"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x51

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x477d

    const v8, -0x3c257150

    xor-int/2addr v7, v8

    const v8, -0x3aeba075

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c9a3f1a -> :sswitch_7
        -0x7b99d69a -> :sswitch_13
        -0x743de73f -> :sswitch_4
        -0x676a5dcd -> :sswitch_2
        -0x6390a9fb -> :sswitch_3
        -0x60a7aa58 -> :sswitch_12
        -0x592c7836 -> :sswitch_2
        -0x49ae2431 -> :sswitch_e
        -0x47cc921b -> :sswitch_b
        -0x39b0d6a9 -> :sswitch_10
        -0x39788e3b -> :sswitch_11
        -0x33929e02 -> :sswitch_c
        -0x2bdda4cd -> :sswitch_0
        -0x2817b7e8 -> :sswitch_5
        -0x19c39470 -> :sswitch_4
        -0x175ce1f9 -> :sswitch_f
        -0x13aa4377 -> :sswitch_13
        -0x7abcb63 -> :sswitch_1
        -0x46a3700 -> :sswitch_f
        0x733915 -> :sswitch_e
        0x6fe7fa8 -> :sswitch_0
        0x8a71727 -> :sswitch_7
        0x104c7a29 -> :sswitch_d
        0x11a12c53 -> :sswitch_9
        0x1c4eb491 -> :sswitch_8
        0x2d1992be -> :sswitch_3
        0x2f12da0c -> :sswitch_1
        0x3f74a151 -> :sswitch_c
        0x3fb247ba -> :sswitch_5
        0x3fbab643 -> :sswitch_14
        0x4058302d -> :sswitch_10
        0x4e0597fc -> :sswitch_6
        0x4f352406 -> :sswitch_d
        0x574513a8 -> :sswitch_11
        0x5a22061b -> :sswitch_8
        0x5c1ee0a6 -> :sswitch_6
        0x5ff85cbc -> :sswitch_14
        0x6d788009 -> :sswitch_b
        0x6de0de0f -> :sswitch_12
        0x79f605bf -> :sswitch_9
        0x7b9c93d1 -> :sswitch_a
        0x7bc0410f -> :sswitch_a
    .end sparse-switch
.end method

.method public static ۙ(ILjava/lang/String;)I
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0x2c541a75    # -1.476581E12f

    sget v6, Ll/֨ܿ;->᩹᩻۟:I

    sget v7, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v8, "\u06da\u06df"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7fb1

    const v10, -0x51631c1c

    xor-int/2addr v9, v10

    const v10, 0x7273d8d4

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, 0x35f5

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    add-int/lit8 v4, p0, 0x1

    goto :goto_1

    .line 69
    :sswitch_0
    sget v8, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v8, :cond_d

    goto/16 :goto_3

    .line 183
    :sswitch_1
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v8

    if-nez v8, :cond_b

    goto/16 :goto_5

    :sswitch_2
    sget v8, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v8, :cond_9

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    goto/16 :goto_5

    .line 195
    :sswitch_4
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    const/4 p0, 0x0

    return p0

    .line 214
    :sswitch_5
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v8, "\u073a\u06eb"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x43

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x793

    const v10, -0x4248dc8b

    xor-int/2addr v9, v10

    const v10, 0x629631f6

    goto :goto_0

    :sswitch_6
    return v4

    :sswitch_7
    return v0

    .line 213
    :sswitch_8
    invoke-static {p1, p0}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v3

    .line 214
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v8, "\u05a8\u06da"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x123

    const v10, 0x6d9ccb0d

    xor-int/2addr v9, v10

    const v10, -0x2b04e6ea

    goto :goto_0

    :cond_0
    move v4, p0

    :goto_1
    const-string v8, "\u1a79\u06d9"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x6f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x56c5

    const v10, 0x53936150

    xor-int/2addr v9, v10

    const v10, 0x11435ff5

    goto/16 :goto_0

    .line 212
    :sswitch_9
    invoke-static {p1, v1}, Ll/ۘܽ;->᩷۬ܽ(Ljava/lang/Object;I)C

    move-result v2

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v8

    if-gtz v8, :cond_1

    const-string v8, "\u1a7a\u06eb"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x15bb

    const v10, -0x48e5f4e4

    xor-int/2addr v9, v10

    const v10, 0x42c12841

    goto/16 :goto_0

    :cond_1
    const-string v8, "\u1a78\u1a73"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4aed

    const v10, -0x4be8a5d2

    xor-int/2addr v9, v10

    const v10, -0x3a2abe3b

    goto/16 :goto_0

    :sswitch_a
    add-int/lit8 v1, p0, -0x1

    .line 84
    sget v8, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v8, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v8, "\u0730\u06e8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x2b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6035

    const v10, -0x31924ef0    # -9.9695104E8f

    xor-int/2addr v9, v10

    const v10, 0x30372251

    goto/16 :goto_0

    :sswitch_b
    const/4 p0, 0x0

    return p0

    :sswitch_c
    if-lt p0, v0, :cond_3

    const-string v8, "\u073a\u1a79"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x56ab

    const v10, -0x552a8020

    xor-int/2addr v9, v10

    const v10, -0x1635c484

    goto/16 :goto_0

    :cond_3
    const-string v8, "\u1a74\u073a"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x539b

    const v10, 0x14fb40f

    xor-int/2addr v9, v10

    const v10, 0x225ae42d

    goto/16 :goto_0

    .line 205
    :sswitch_d
    invoke-static {p1}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v0

    if-gtz p0, :cond_4

    const-string v8, "\u06d6\u06d9"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0xd65

    const v10, 0x31124850

    xor-int/2addr v9, v10

    const v10, 0x5683ed1e

    goto/16 :goto_0

    :cond_4
    const-string v8, "\u05ab\u073a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4627

    const v10, -0xb79c59f

    xor-int/2addr v9, v10

    const v10, 0x2a515b

    goto/16 :goto_0

    :sswitch_e
    sget v8, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v8, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v8, "\u06ec\u06da"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x43ed

    const v10, 0x230fceb2

    xor-int/2addr v9, v10

    const v10, -0x1ace78e1

    goto/16 :goto_0

    .line 65
    :sswitch_f
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v8

    if-eqz v8, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v8, "\u06db\u0736"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x66d3

    const v10, 0xee54f42

    xor-int/2addr v9, v10

    const v10, -0x146a8c4a

    goto/16 :goto_0

    .line 134
    :sswitch_10
    sget v8, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v8, :cond_7

    goto :goto_2

    :cond_7
    const-string v8, "\u06d8\u06d6"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x39

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x1093

    const v10, -0x73ef2a17

    xor-int/2addr v9, v10

    const v10, 0x17969b8f

    goto/16 :goto_0

    .line 141
    :sswitch_11
    sget v8, Ll/֫֡;->֫ۙۖ:I

    if-gtz v8, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v8, "\u06dc\u06e7"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x1dd9

    const v10, 0x1e1dac6f

    xor-int/2addr v9, v10

    const v10, -0x4d6c0558

    goto/16 :goto_0

    .line 149
    :sswitch_12
    sget v8, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v8, :cond_a

    :cond_9
    :goto_2
    const-string v8, "\u06d8\u1a73"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x4f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x78f1

    const v10, -0x40f4a01b

    xor-int/2addr v9, v10

    const v10, -0x650260fd

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u06e7\u073f"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x7

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x1fa5

    const v10, 0x16f67f83

    xor-int/2addr v9, v10

    const v10, -0x111a419e

    goto/16 :goto_0

    :sswitch_13
    sget v8, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v8, :cond_c

    :cond_b
    :goto_3
    const-string v8, "\u0736\u1a76"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3525

    const v10, -0x12e28f14

    xor-int/2addr v9, v10

    const v10, 0x1fd8b1a8

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u1a7a\u1a7a"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x4d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x1153

    const v10, 0x6b661f98

    xor-int/2addr v9, v10

    const v10, -0x160fadfb

    goto/16 :goto_0

    :sswitch_14
    sget v8, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v8, :cond_e

    :cond_d
    :goto_4
    const-string v8, "\u1a7a\u1a78"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x11

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x1bf5

    const v10, 0x5ac75a01

    xor-int/2addr v9, v10

    const v10, -0x1e2b0d9a

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u06e0\u1a73"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5369

    const v10, 0x52e92359

    xor-int/2addr v9, v10

    const v10, 0x19a425

    goto/16 :goto_0

    :sswitch_15
    sget-boolean v8, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v8, :cond_f

    :goto_5
    const-string v8, "\u0730\u1a73"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x7d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x1d65

    const v10, -0x49713c44

    xor-int/2addr v9, v10

    const v10, 0x670b578d

    goto/16 :goto_0

    :cond_f
    const-string v8, "\u06d6\u1a7a"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x39

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x17df

    const v10, -0x20420798

    xor-int/2addr v9, v10

    const v10, -0x22c55874

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a33524e -> :sswitch_5
        -0x6b111dbe -> :sswitch_a
        -0x60cdb1b7 -> :sswitch_11
        -0x597e6b33 -> :sswitch_13
        -0x5690897f -> :sswitch_2
        -0x543cc7c5 -> :sswitch_7
        -0x52a57bb5 -> :sswitch_2
        -0x527cc1a4 -> :sswitch_1
        -0x49622563 -> :sswitch_c
        -0x45121ebe -> :sswitch_4
        -0x3fd9c103 -> :sswitch_1
        -0x3705bcc8 -> :sswitch_9
        -0x341cc240 -> :sswitch_9
        -0x2b142316 -> :sswitch_15
        -0x29c39762 -> :sswitch_d
        -0x294dbcb4 -> :sswitch_6
        -0x2174c6de -> :sswitch_12
        -0x1ba53375 -> :sswitch_0
        -0x1b83cfc8 -> :sswitch_10
        -0x18702117 -> :sswitch_15
        -0xfe4175a -> :sswitch_b
        -0x4f80daa -> :sswitch_6
        0x9890ec3 -> :sswitch_b
        0xde135e3 -> :sswitch_3
        0x10aa80bd -> :sswitch_13
        0x140bfe58 -> :sswitch_10
        0x1b11a929 -> :sswitch_f
        0x1db63b90 -> :sswitch_12
        0x2a7a7637 -> :sswitch_c
        0x2de20046 -> :sswitch_0
        0x341d381e -> :sswitch_8
        0x3e15834b -> :sswitch_4
        0x3fd642a9 -> :sswitch_a
        0x469404de -> :sswitch_f
        0x4c0cae7c -> :sswitch_11
        0x4d0d7776 -> :sswitch_e
        0x53866758 -> :sswitch_d
        0x5f7dfc2a -> :sswitch_7
        0x634ed045 -> :sswitch_8
        0x6417a93f -> :sswitch_e
        0x6ca589c1 -> :sswitch_3
        0x723b15e9 -> :sswitch_14
        0x7263705f -> :sswitch_5
        0x770aad5f -> :sswitch_14
    .end sparse-switch
.end method

.method public static ۙ(Ljava/lang/String;IILl/۫۬ۤ;)I
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x44e41490

    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    const-string v5, "\u1a7b\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5a41

    const v7, 0x2ee8ac91

    xor-int/2addr v6, v7

    const v7, 0x38251a46

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x71a3

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v5

    if-nez v5, :cond_a

    goto/16 :goto_3

    .line 200
    :sswitch_0
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-lez v5, :cond_0

    goto :goto_1

    :cond_0
    const-string v5, "\u073d\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xa67

    const v7, -0x1fa90907

    xor-int/2addr v6, v7

    const v7, 0x6294e621

    goto :goto_0

    .line 3
    :sswitch_1
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    :goto_1
    const-string v5, "\u1a78\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x22b5

    const v7, -0x7c7c7df2

    xor-int/2addr v6, v7

    const v7, 0x19e90899

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v5, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v5, :cond_9

    goto/16 :goto_4

    .line 130
    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    return v1

    .line 246
    :sswitch_6
    invoke-static {p0, v1}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v5

    .line 247
    invoke-virtual {p3, v5}, Ll/۫۬ۤ;->ۙ(C)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "\u06db\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x65b

    const v7, -0x377c955b

    xor-int/2addr v6, v7

    const v7, 0x795ab78d

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_2

    :sswitch_7
    const/4 p0, -0x1

    return p0

    :sswitch_8
    add-int/lit8 v1, v0, -0x1

    if-le v1, p1, :cond_3

    const-string v5, "\u06d6\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1ff3

    const v7, -0x605e2a96

    xor-int/2addr v6, v7

    const v7, -0xdc4d8e3

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u0733\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x671

    const v7, 0x6dfcc40d

    xor-int/2addr v6, v7

    const v7, -0x50291fe

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v5, :cond_4

    goto/16 :goto_5

    :cond_4
    move v0, p2

    :goto_2
    const-string v5, "\u073d\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x51

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4865

    const v7, -0x2e462481

    xor-int/2addr v6, v7

    const v7, -0x26f3267

    goto/16 :goto_0

    :sswitch_a
    sget v5, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v5, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v5, "\u06eb\u06eb"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x13bf

    const v7, -0x5d0d4864

    xor-int/2addr v6, v7

    const v7, -0x3e97295a

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v5, :cond_6

    goto :goto_3

    :cond_6
    const-string v5, "\u06dc\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x51d9

    const v7, 0x25cc36e5

    xor-int/2addr v6, v7

    const v7, -0x168e79bc

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v5, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v5, "\u06dc\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7d83

    const v7, -0x4de1ecb

    xor-int/2addr v6, v7

    const v7, -0x5639aae1

    goto/16 :goto_0

    .line 218
    :sswitch_d
    sget-boolean v5, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v5, :cond_8

    goto :goto_4

    :cond_8
    const-string v5, "\u0733\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x145b

    const v7, -0x576014ea

    xor-int/2addr v6, v7

    const v7, 0x48c99d6c    # 412907.38f

    goto/16 :goto_0

    :cond_9
    :goto_3
    const-string v5, "\u1a7a\u06e0"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x57

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2d4b

    const v7, 0x8b7b787

    xor-int/2addr v6, v7

    const v7, -0x5d4f000a

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06e1\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4d75

    const v7, -0x56766e5e

    xor-int/2addr v6, v7

    const v7, -0x2d6a61bd

    goto/16 :goto_0

    .line 242
    :sswitch_e
    sget-boolean v5, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v5, :cond_b

    goto :goto_4

    :cond_b
    const-string v5, "\u073f\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2a29

    const v7, -0x18f0946d

    xor-int/2addr v6, v7

    const v7, 0x3430d43e

    goto/16 :goto_0

    .line 110
    :sswitch_f
    sget v5, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v5, :cond_c

    :goto_4
    const-string v5, "\u06e7\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4027

    const v7, -0x1b101d3c

    xor-int/2addr v6, v7

    const v7, 0x4d58b447    # 2.2723083E8f

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06e4\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x507d

    const v7, -0x783d186f

    xor-int/2addr v6, v7

    const v7, -0x5a856b94

    goto/16 :goto_0

    .line 198
    :sswitch_10
    sget v5, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v5, :cond_d

    goto :goto_5

    :cond_d
    const-string v5, "\u06d9\u05a8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2703

    const v7, 0x66c7357f

    xor-int/2addr v6, v7

    const v7, 0x2eb6f443

    goto/16 :goto_0

    .line 159
    :sswitch_11
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_e

    :goto_5
    const-string v5, "\u06dc\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xaff

    const v7, -0x278324e9

    xor-int/2addr v6, v7

    const v7, -0x104c77f0

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u1a7a\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x713f

    const v7, 0x461bf6b3

    xor-int/2addr v6, v7

    const v7, -0x23e1bd56

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f912508 -> :sswitch_b
        -0x7305021b -> :sswitch_2
        -0x6d2553e2 -> :sswitch_10
        -0x58aa0db2 -> :sswitch_e
        -0x5596cc07 -> :sswitch_6
        -0x5368cf0c -> :sswitch_5
        -0x4762af06 -> :sswitch_f
        -0x44591ceb -> :sswitch_f
        -0x3a8ba9c5 -> :sswitch_8
        -0x3399ffd7 -> :sswitch_2
        -0x2f75e4c2 -> :sswitch_a
        -0x29721f99 -> :sswitch_7
        -0x22f6e884 -> :sswitch_a
        -0x22264a2d -> :sswitch_c
        -0x154ba7fe -> :sswitch_9
        -0x13b55cfc -> :sswitch_5
        -0xad453eb -> :sswitch_d
        -0x8a91b93 -> :sswitch_1
        -0x2d74d6a -> :sswitch_e
        0xc6baaa1 -> :sswitch_8
        0xe96312c -> :sswitch_4
        0x10af418c -> :sswitch_d
        0x150a93f9 -> :sswitch_4
        0x24d1902a -> :sswitch_6
        0x3cd64072 -> :sswitch_b
        0x4f071781 -> :sswitch_0
        0x5478c57f -> :sswitch_9
        0x5a6b7086 -> :sswitch_c
        0x5e87a1d6 -> :sswitch_3
        0x6074af98 -> :sswitch_11
        0x612264ea -> :sswitch_10
        0x6acda87c -> :sswitch_3
        0x6d9e882e -> :sswitch_11
        0x6fed4463 -> :sswitch_7
        0x782de5f9 -> :sswitch_1
        0x7aa3a9b4 -> :sswitch_0
    .end sparse-switch
.end method

.method public static ۙ(Ljava/lang/String;ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;)Ljava/util/List;
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, -0x2377f518

    sget v16, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v17, Ll/ۗ֡;->ۜ᩻۫:I

    const-string v18, "\u06d7\u05ab"

    invoke-static/range {v18 .. v18}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v18

    sub-int v18, v17, v18

    mul-int/lit8 v18, v18, 0xd

    xor-int v3, v18, v16

    mul-int/lit16 v3, v3, -0x17f1

    const v20, 0x25f063ed

    xor-int v3, v3, v20

    const v20, 0x429e937e

    xor-int v18, v18, v20

    move-object v5, v4

    move/from16 v19, v18

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, -0x2377f518

    const/16 v20, 0x0

    :goto_0
    xor-int v4, v18, v16

    mul-int/lit16 v4, v4, 0x8fb

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v3, v4

    xor-int v18, v19, v3

    sparse-switch v18, :sswitch_data_0

    move/from16 v19, v20

    .line 55
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_19

    goto/16 :goto_10

    :sswitch_0
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v3, :cond_0

    :goto_1
    move/from16 v19, v20

    goto/16 :goto_d

    :cond_0
    move/from16 v19, v20

    goto/16 :goto_e

    .line 58
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v3

    if-ltz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06d6\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v16

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x9cb

    const v19, 0x7711b5db

    xor-int v4, v4, v19

    const v19, 0x43e0fd0d

    goto/16 :goto_a

    .line 25
    :sswitch_2
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v3

    if-lez v3, :cond_2

    goto :goto_3

    :cond_2
    move/from16 v19, v20

    goto/16 :goto_10

    .line 51
    :sswitch_3
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v3, :cond_4

    :cond_3
    :goto_2
    move/from16 v19, v20

    goto/16 :goto_f

    :cond_4
    const-string v3, "\u06d6\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x7873

    const v19, 0x273eca79

    xor-int v4, v4, v19

    const v19, -0x361cc63f

    goto/16 :goto_a

    :sswitch_4
    sget-boolean v3, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    move/from16 v19, v20

    goto/16 :goto_11

    .line 59
    :sswitch_5
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    :goto_3
    const-string v3, "\u1a78\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x2f55

    const v19, 0x2b8c0320

    xor-int v4, v4, v19

    const v19, 0x1b4a9ca0

    goto/16 :goto_a

    :sswitch_6
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-lez v3, :cond_3

    goto/16 :goto_1

    .line 39
    :sswitch_7
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto/16 :goto_1

    .line 18
    :sswitch_8
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_9
    if-eq v15, v8, :cond_7

    move v11, v15

    goto/16 :goto_6

    :cond_7
    move v11, v10

    goto/16 :goto_6

    .line 61
    :sswitch_a
    invoke-static {v0, v7, v14}, Ll/֡ۖ;->ܳ᩶᩷(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move v7, v14

    goto/16 :goto_8

    :sswitch_b
    add-int v3, v12, v13

    if-le v3, v1, :cond_8

    const-string v3, "\u06d7\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x4597

    const v19, -0x643c3109

    xor-int v4, v4, v19

    const v19, 0x33eb050d

    goto/16 :goto_a

    :cond_8
    move v12, v3

    move v9, v10

    move v15, v9

    goto/16 :goto_7

    .line 52
    :sswitch_c
    invoke-static {v0, v7, v6}, Ll/֡ۖ;->ܳ᩶᩷(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Ll/֨᩻;->ܿ֨᩹(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v5

    .line 56
    :sswitch_d
    invoke-static {v7, v11, v0}, Ll/ۚ۬ۤ;->ۙ(IILjava/lang/String;)I

    move-result v3

    if-gt v3, v7, :cond_9

    move v14, v11

    goto :goto_4

    :cond_9
    move v14, v3

    :goto_4
    const-string v3, "\u06d6\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x54f1

    const v19, -0x24bbb2d9

    xor-int v4, v4, v19

    const v19, -0x68b2184b

    goto/16 :goto_a

    :sswitch_e
    sub-int v3, v10, v9

    goto :goto_5

    .line 76
    :sswitch_f
    invoke-static {v0, v9, v10}, Ll/ۗ᩵;->᩸ᩴۡ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v3

    .line 81
    invoke-interface {v2, v3}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result v3

    :goto_5
    move v13, v3

    const-string v3, "\u1a74\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x354d

    const v19, 0x43e19249

    xor-int v4, v4, v19

    const v19, -0x303e9da6

    goto/16 :goto_a

    :sswitch_10
    if-ne v11, v6, :cond_a

    const-string v3, "\u0736\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v16, v3

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x30fb

    const v19, -0x50ccbefe

    xor-int v4, v4, v19

    const v19, 0x1f031577

    goto/16 :goto_a

    :cond_a
    const-string v3, "\u06e0\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v17, v3

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x33d5

    const v19, -0x4144448c

    xor-int v4, v4, v19

    const v19, 0x19d5a719

    goto/16 :goto_a

    .line 87
    :sswitch_11
    invoke-virtual {v0, v9}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int v10, v3, v9

    if-nez v2, :cond_b

    const-string v3, "\u1a7b\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x2d8d

    const v19, 0x4fc41391    # 6.5792333E9f

    xor-int v4, v4, v19

    const v19, -0x5e81489f

    goto/16 :goto_a

    :cond_b
    const-string v3, "\u05a8\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v16, v3

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x34d

    const v19, -0x3c4cc9ff

    xor-int v4, v4, v19

    const v19, -0x3cd4d637

    goto/16 :goto_a

    :sswitch_12
    if-ge v9, v6, :cond_c

    const-string v3, "\u1a75\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x1b0b

    const v19, 0xfd59865

    xor-int v4, v4, v19

    const v19, -0x152244a9

    goto/16 :goto_a

    :cond_c
    move v11, v9

    :goto_6
    const-string v3, "\u06dc\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x4545

    const v19, -0x7eb97376

    xor-int v4, v4, v19

    const v19, -0x3fe04337

    goto/16 :goto_a

    :sswitch_13
    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v8, -0x1

    move v9, v7

    const/4 v8, -0x1

    const/4 v12, 0x0

    const/4 v15, -0x1

    :goto_7
    const-string v3, "\u06d9\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x1487

    const v19, 0x68086596

    xor-int v4, v4, v19

    const v19, -0x146458b8

    goto/16 :goto_a

    :sswitch_14
    return-object v5

    :sswitch_15
    if-ge v7, v6, :cond_d

    const-string v3, "\u1a77\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x212f

    const v19, -0x1dbd8269

    xor-int v4, v4, v19

    const v19, 0x48470909

    goto/16 :goto_a

    :cond_d
    const-string v3, "\u06d6\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x85

    const v19, -0x1d9e7275

    xor-int v4, v4, v19

    const v19, -0x2c31687

    goto/16 :goto_a

    .line 29
    :sswitch_16
    invoke-static/range {p0 .. p0}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v3

    const/4 v4, 0x0

    move v6, v3

    const/4 v7, 0x0

    :goto_8
    const-string v3, "\u06e0\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x69f5

    const v19, -0x5683f4fe

    xor-int v4, v4, v19

    const v19, 0x7cf29a99

    goto :goto_a

    .line 27
    :sswitch_17
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_e

    move/from16 v19, v20

    goto/16 :goto_c

    :cond_e
    const-string v3, "\u06e4\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v17, v3

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x3e7d

    const v19, -0x1c151234

    xor-int v4, v4, v19

    const v19, 0x4d089c15    # 1.4324565E8f

    goto :goto_a

    :sswitch_18
    move/from16 v3, v20

    if-gt v3, v1, :cond_f

    move/from16 v19, v3

    goto/16 :goto_b

    :cond_f
    const-string v4, "\u06d8\u0736"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v16

    mul-int/lit8 v4, v4, 0x2f

    move/from16 v19, v3

    xor-int v3, v4, v17

    mul-int/lit16 v3, v3, -0x278f

    const v20, -0x3fc3d4dc

    xor-int v3, v3, v20

    const v20, -0xcfaeccd

    xor-int v4, v4, v20

    move/from16 v20, v19

    move/from16 v19, v4

    goto/16 :goto_0

    .line 81
    :sswitch_19
    invoke-interface {v2, v0}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result v3

    goto :goto_9

    .line 83
    :sswitch_1a
    invoke-static/range {p0 .. p0}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v3

    :goto_9
    move/from16 v20, v3

    const-string v3, "\u1a73\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x290f

    const v19, -0x3d6cfff5    # -73.500084f

    xor-int v4, v4, v19

    const v19, 0x767aafb5

    :goto_a
    xor-int v19, v3, v19

    goto/16 :goto_13

    :sswitch_1b
    move/from16 v19, v20

    if-eqz v2, :cond_10

    const-string v3, "\u0733\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x5529

    const v20, 0x4135aef8

    xor-int v4, v4, v20

    const v20, 0x77a65e44

    goto/16 :goto_12

    :cond_10
    const-string v3, "\u06d7\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x82f

    const v20, -0xfc3cad3

    xor-int v4, v4, v20

    const v20, 0x50dca356

    goto/16 :goto_12

    .line 24
    :sswitch_1c
    invoke-static/range {p0 .. p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :sswitch_1d
    move/from16 v19, v20

    if-lez v1, :cond_11

    const-string v3, "\u05a1\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x7ae7

    const v20, 0x5b281bf9

    xor-int v4, v4, v20

    const v20, 0x598723de

    goto/16 :goto_12

    :cond_11
    :goto_b
    const-string v3, "\u05ab\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x6151

    const v20, -0xdf8af88

    xor-int v4, v4, v20

    const v20, -0x4c505f78

    goto/16 :goto_12

    :sswitch_1e
    move/from16 v19, v20

    .line 1
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_12

    goto/16 :goto_10

    :cond_12
    const-string v3, "\u06e0\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0xc21

    const v20, -0x691738fe

    xor-int v4, v4, v20

    const v20, 0x1fdd29af

    goto/16 :goto_12

    :sswitch_1f
    move/from16 v19, v20

    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_13

    goto :goto_c

    :cond_13
    const-string v3, "\u1a76\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x1f5f

    const v20, 0x4f58233f

    xor-int v4, v4, v20

    const v20, 0x5cbdeb30

    goto/16 :goto_12

    :sswitch_20
    move/from16 v19, v20

    .line 80
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_14

    :goto_c
    const-string v3, "\u073a\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v17, v3

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x6943

    const v20, -0x5002109b

    xor-int v4, v4, v20

    const v20, -0x49ae93d9

    goto/16 :goto_12

    :cond_14
    const-string v3, "\u073f\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x4537

    const v20, 0x715a8fad

    xor-int v4, v4, v20

    const v20, 0x3ebc4ce7

    goto/16 :goto_12

    :sswitch_21
    move/from16 v19, v20

    .line 44
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_15

    :goto_d
    const-string v3, "\u06e0\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x1b91

    const v20, -0x56ed11c7

    xor-int v4, v4, v20

    const v20, 0x245168df

    goto/16 :goto_12

    :cond_15
    const-string v3, "\u05ab\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x4329

    const v20, -0x6f489f45

    xor-int v4, v4, v20

    const v20, 0x6ca8910

    goto/16 :goto_12

    :sswitch_22
    move/from16 v19, v20

    .line 6
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_16

    :goto_e
    const-string v3, "\u06dc\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x5171

    const v20, -0x4ad95667

    xor-int v4, v4, v20

    const v20, -0x727d9ae5

    goto/16 :goto_12

    :cond_16
    const-string v3, "\u06db\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x16dd

    const v20, 0x59ecfa69

    xor-int v4, v4, v20

    const v20, 0x327b3198

    goto/16 :goto_12

    :sswitch_23
    move/from16 v19, v20

    .line 42
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_17

    :goto_f
    const-string v3, "\u1a78\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x7e95

    const v20, -0x1caec89b

    xor-int v4, v4, v20

    const v20, -0x70a3d40e

    goto/16 :goto_12

    :cond_17
    const-string v3, "\u06d8\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x39b

    const v20, 0x4e6edcb

    xor-int v4, v4, v20

    const v20, 0xdb4df78

    goto/16 :goto_12

    :sswitch_24
    move/from16 v19, v20

    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_18

    goto :goto_10

    :cond_18
    const-string v3, "\u0736\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x461b

    const v20, -0x64878649

    xor-int v4, v4, v20

    const v20, 0x4f52b6d9

    goto :goto_12

    :goto_10
    const-string v3, "\u1a78\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x2aed

    const v20, -0x78649a2e

    xor-int v4, v4, v20

    const v20, -0x2e241cfe

    goto :goto_12

    :cond_19
    const-string v3, "\u06e2\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x28b9

    const v20, 0x4a83dc17    # 4320779.5f

    xor-int v4, v4, v20

    const v20, -0x5ebb6bb7

    goto :goto_12

    :sswitch_25
    move/from16 v19, v20

    .line 59
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_1a

    :goto_11
    const-string v3, "\u06e2\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x5fe7

    const v20, 0x56bda8aa

    xor-int v4, v4, v20

    const v20, -0x25ef8b81

    goto :goto_12

    :cond_1a
    const-string v3, "\u06e2\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x4897

    const v20, 0x256edcbf

    xor-int v4, v4, v20

    const v20, -0x2376cb51

    :goto_12
    xor-int v3, v3, v20

    move/from16 v20, v19

    move/from16 v19, v3

    :goto_13
    move v3, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b974d8f -> :sswitch_1a
        -0x747294c8 -> :sswitch_24
        -0x739b9da0 -> :sswitch_14
        -0x6cd19acd -> :sswitch_15
        -0x68cd8e8b -> :sswitch_d
        -0x67e740ff -> :sswitch_1b
        -0x665a4930 -> :sswitch_18
        -0x61a7fcc3 -> :sswitch_17
        -0x6048f697 -> :sswitch_24
        -0x5ceed81f -> :sswitch_b
        -0x5867ee09 -> :sswitch_13
        -0x5641820e -> :sswitch_a
        -0x51451848 -> :sswitch_1
        -0x50ba7266 -> :sswitch_11
        -0x4d1b4176 -> :sswitch_16
        -0x4ca51849 -> :sswitch_3
        -0x44e7a498 -> :sswitch_1e
        -0x41323fb5 -> :sswitch_10
        -0x3e4b6119 -> :sswitch_0
        -0x3c308d27 -> :sswitch_14
        -0x37df4ede -> :sswitch_8
        -0x34630c0b -> :sswitch_21
        -0x23c803b9 -> :sswitch_9
        -0x225836aa -> :sswitch_21
        -0x1ed4d35e -> :sswitch_0
        -0x137954d9 -> :sswitch_1d
        -0x112dda2a -> :sswitch_23
        -0x8ef5d93 -> :sswitch_4
        -0x592bc9b -> :sswitch_c
        -0x4d54620 -> :sswitch_23
        -0x113d81a -> :sswitch_10
        -0x874392 -> :sswitch_18
        -0x431408 -> :sswitch_e
        0x4fea67 -> :sswitch_1f
        0x8769c3 -> :sswitch_d
        0x1012031 -> :sswitch_20
        0x25fe09f -> :sswitch_15
        0x502d663 -> :sswitch_11
        0x10440016 -> :sswitch_12
        0x1107a843 -> :sswitch_7
        0x110f802f -> :sswitch_25
        0x14797977 -> :sswitch_b
        0x16d2bf5e -> :sswitch_1
        0x181b07f0 -> :sswitch_2
        0x1aa2f374 -> :sswitch_8
        0x1bea0336 -> :sswitch_a
        0x1e0477a8 -> :sswitch_1c
        0x2319a452 -> :sswitch_20
        0x25c6cc6f -> :sswitch_1e
        0x2806cb32 -> :sswitch_c
        0x2fb37a25 -> :sswitch_5
        0x38d431eb -> :sswitch_f
        0x43cf9cfc -> :sswitch_2
        0x4487f36a -> :sswitch_6
        0x487a393b -> :sswitch_16
        0x4955f930 -> :sswitch_19
        0x4ea1af75 -> :sswitch_e
        0x4ef37430 -> :sswitch_1f
        0x4fd9aa46 -> :sswitch_19
        0x538db6d4 -> :sswitch_12
        0x5865487a -> :sswitch_6
        0x5b6bbe62 -> :sswitch_13
        0x5c7335ac -> :sswitch_1c
        0x608333e3 -> :sswitch_7
        0x6124d56c -> :sswitch_22
        0x61fe1a54 -> :sswitch_3
        0x669b60a5 -> :sswitch_1b
        0x69c3339b -> :sswitch_22
        0x6cbc5200 -> :sswitch_25
        0x6e2f38d2 -> :sswitch_1a
        0x73673147 -> :sswitch_1d
        0x77309b65 -> :sswitch_5
        0x783cc076 -> :sswitch_9
        0x7963ed5a -> :sswitch_4
        0x7cd387f2 -> :sswitch_f
        0x7dbc4251 -> :sswitch_17
    .end sparse-switch
.end method

.method public static ۙ(Ljava/lang/String;Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;)Ljava/util/List;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, -0x1f6369bd

    sget v17, Ll/ۗܰ;->ܶۜ۬:I

    sget v18, Ll/֡ۖ;->۫ۙ᩶:I

    const-string v19, "\u06e0\u1a7b"

    invoke-static/range {v19 .. v19}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v19

    sub-int v19, v17, v19

    mul-int/lit8 v19, v19, 0x59

    xor-int v2, v19, v18

    mul-int/lit16 v2, v2, 0x62a7

    const v21, 0x114224c9

    xor-int v2, v2, v21

    const v21, -0x1e773367

    xor-int v19, v19, v21

    move/from16 v20, v19

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v19, -0x1f6369bd

    const/16 v21, 0x0

    :goto_0
    xor-int v7, v19, v18

    mul-int/lit16 v7, v7, -0x6c6b

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v2, v7

    xor-int v19, v20, v2

    sparse-switch v19, :sswitch_data_0

    .line 129
    invoke-static {v0, v5, v6}, Ll/ۗ᩵;->᩸ᩴۡ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move v5, v6

    move/from16 v20, v21

    goto/16 :goto_e

    :sswitch_0
    sget v2, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v2, :cond_1

    :cond_0
    :goto_1
    move/from16 v20, v21

    goto/16 :goto_b

    :cond_1
    const-string v2, "\u0736\u1a74"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x3a07

    const v20, -0x7a9fb905

    xor-int v7, v7, v20

    const v20, 0x29a7d853

    goto/16 :goto_a

    .line 65
    :sswitch_1
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget-boolean v2, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v2, :cond_3

    :cond_2
    :goto_2
    move/from16 v20, v21

    goto/16 :goto_12

    :cond_3
    move/from16 v20, v21

    goto/16 :goto_11

    :sswitch_2
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    const-string v2, "\u06ec\u06e7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x3995

    const v20, -0x436e8eec

    xor-int v7, v7, v20

    const v20, -0x713bc462

    goto/16 :goto_a

    .line 106
    :sswitch_3
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget v2, Ll/ۖۗ;->᩻ܳܶ:I

    if-lez v2, :cond_5

    goto :goto_1

    :cond_5
    move/from16 v20, v21

    goto/16 :goto_f

    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_2

    .line 51
    :sswitch_5
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    if-gez v2, :cond_0

    :cond_6
    :goto_3
    move/from16 v20, v21

    goto/16 :goto_10

    .line 137
    :sswitch_6
    sget v2, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v2, :cond_2

    goto :goto_3

    .line 165
    :sswitch_7
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    sget v2, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v2, :cond_6

    :goto_4
    move/from16 v20, v21

    goto/16 :goto_13

    :sswitch_8
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    goto :goto_4

    :sswitch_9
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_a
    add-int/lit8 v2, v14, -0x1

    .line 167
    invoke-static {v2, v0}, Ll/ۚ۬ۤ;->᩷(ILjava/lang/String;)I

    move-result v2

    move v10, v2

    goto/16 :goto_9

    .line 87
    :sswitch_b
    invoke-virtual {v0, v5}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v2, v5

    goto :goto_5

    .line 177
    :sswitch_c
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    .line 178
    invoke-static {v0, v5, v14}, Ll/ۗ᩵;->᩸ᩴۡ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    move v9, v14

    goto/16 :goto_9

    :cond_7
    const-string v2, "\u06e0\u05a8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x31

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x9b3

    const v20, -0x11176d7e

    xor-int v7, v7, v20

    const v20, 0x1491046e

    goto/16 :goto_a

    .line 123
    :sswitch_d
    invoke-static {v15, v0}, Ll/ۚ۬ۤ;->ۙ(ILjava/lang/String;)I

    move-result v2

    if-gt v2, v5, :cond_8

    const-string v2, "\u1a74\u06eb"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x51c5

    const v20, -0x7a34380f

    xor-int v7, v7, v20

    const v20, -0x51c23930

    goto/16 :goto_a

    :cond_8
    :goto_5
    move v6, v2

    const-string v2, "\u06d6\u1a78"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x67

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0xce3

    const v20, -0x192d35c

    xor-int v7, v7, v20

    const v20, 0x15aaa138

    goto/16 :goto_a

    :sswitch_e
    add-int/lit8 v2, v9, 0x1

    .line 157
    invoke-static {v2, v0}, Ll/ۚ۬ۤ;->ۙ(ILjava/lang/String;)I

    move-result v2

    goto :goto_6

    :sswitch_f
    if-le v14, v10, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v2, "\u0736\u0733"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v18, v2

    mul-int/lit8 v2, v2, 0x63

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x6339

    const v20, -0x6d8dbddc

    xor-int v7, v7, v20

    const v20, -0x1098d4ec

    goto/16 :goto_a

    :sswitch_10
    ushr-int/lit8 v2, v13, 0x1

    .line 155
    invoke-static {v2, v0}, Ll/ۚ۬ۤ;->᩷(ILjava/lang/String;)I

    move-result v2

    if-gt v2, v9, :cond_a

    const-string v2, "\u1a73\u06d8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, -0xb

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x7b59

    const v20, 0x19f43d5b

    xor-int v7, v7, v20

    const v20, -0x796cd7f5

    goto/16 :goto_a

    :cond_a
    :goto_6
    move v14, v2

    const-string v2, "\u06df\u06e4"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x41

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x53f9

    const v20, -0x72327bed

    xor-int v7, v7, v20

    const v20, -0x5ee2a696

    goto/16 :goto_a

    :sswitch_11
    add-int v13, v11, v12

    .line 135
    sget v2, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v2, :cond_c

    :cond_b
    const-string v2, "\u0730\u06dc"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v18, v2

    mul-int/lit8 v2, v2, -0x37

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x356b

    const v20, -0x5c176afc

    xor-int v7, v7, v20

    const v20, 0x662642fc

    goto/16 :goto_a

    :cond_c
    const-string v2, "\u06e2\u06d9"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, 0x51

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x33c9

    const v20, -0x5e52553

    xor-int v7, v7, v20

    const v20, 0x1e6879dc

    goto/16 :goto_a

    :sswitch_12
    add-int v11, v9, v10

    const/4 v12, 0x1

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v2

    if-eqz v2, :cond_d

    goto/16 :goto_2

    :cond_d
    const-string v2, "\u06d9\u06da"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x630f

    const v20, -0x49871e88

    xor-int v7, v7, v20

    const v20, 0x1fff0a1c

    goto/16 :goto_a

    .line 113
    :sswitch_13
    invoke-static {v0, v5, v4}, Ll/֡ۖ;->ܳ᩶᩷(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move/from16 v20, v21

    goto/16 :goto_d

    .line 117
    :sswitch_14
    invoke-static {v5, v8, v0}, Ll/ۚ۬ۤ;->ۙ(IILjava/lang/String;)I

    move-result v2

    if-gt v2, v5, :cond_e

    move v15, v8

    goto :goto_7

    :cond_e
    move v15, v2

    :goto_7
    const-string v2, "\u05a1\u06e1"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, 0x4b

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x2a39

    const v20, 0x4abf981b    # 6278157.5f

    xor-int v7, v7, v20

    const v20, -0x58d87041

    goto/16 :goto_a

    :sswitch_15
    if-ge v9, v10, :cond_f

    const-string v2, "\u06d6\u06e4"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x79bb

    const v20, -0x46b19094

    xor-int v7, v7, v20

    const v20, -0x64f5f2c2

    goto/16 :goto_a

    :cond_f
    :goto_8
    move v8, v9

    move/from16 v20, v21

    goto/16 :goto_c

    :sswitch_16
    if-ne v8, v4, :cond_10

    const-string v2, "\u06e8\u0736"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x39

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x30e5

    const v20, -0x30b768b7

    xor-int v7, v7, v20

    const v20, -0x16cd00f1

    goto/16 :goto_a

    :cond_10
    const-string v2, "\u06db\u06e1"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x269d

    const v20, -0x160ffd2d

    xor-int v7, v7, v20

    const v20, -0x5beb78dc

    goto/16 :goto_a

    .line 152
    :sswitch_17
    invoke-static/range {p0 .. p0}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    move/from16 v9, v21

    :goto_9
    const-string v2, "\u1a77\u073a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x73

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x58c7

    const v20, -0x4f6a2945

    xor-int v7, v7, v20

    const v20, -0x9cd1a2

    goto :goto_a

    .line 177
    :sswitch_18
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    move/from16 v2, v21

    .line 178
    invoke-static {v0, v5, v2}, Ll/ۗ᩵;->᩸ᩴۡ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v7}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_11

    move v8, v2

    move/from16 v20, v8

    goto/16 :goto_c

    :cond_11
    const-string v7, "\u06d6\u0730"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v18

    mul-int/lit8 v7, v7, -0x51

    move/from16 v20, v2

    xor-int v2, v7, v17

    mul-int/lit16 v2, v2, -0x7095

    const v21, -0x1a041377

    xor-int v2, v2, v21

    const v21, 0x34095864

    xor-int v7, v7, v21

    move/from16 v21, v20

    move/from16 v20, v7

    goto/16 :goto_0

    :sswitch_19
    add-int v21, v16, v5

    .line 112
    sget v2, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v2, :cond_12

    const-string v2, "\u06d7\u0733"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x572d

    const v20, 0xa681e3

    xor-int v7, v7, v20

    const v20, 0x421d0a39

    goto :goto_a

    :cond_12
    const-string v2, "\u06ec\u1a76"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x2e97

    const v20, 0x10463abf

    xor-int v7, v7, v20

    const v20, -0x78c01905

    :goto_a
    xor-int v20, v2, v20

    goto/16 :goto_15

    :sswitch_1a
    move/from16 v20, v21

    .line 87
    invoke-virtual {v0, v5}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v16

    sget v2, Ll/۬;->᩸ۜ᩹:I

    if-eqz v2, :cond_13

    :goto_b
    const-string v2, "\u06e1\u06df"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0xebb

    const v21, 0x539af374

    xor-int v7, v7, v21

    const v21, -0x381c559b

    goto/16 :goto_14

    :cond_13
    const-string v2, "\u1a76\u05ab"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x47

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x5ee5

    const v21, 0x70c5cac5

    xor-int v7, v7, v21

    const v21, -0x2ea68f4c

    goto/16 :goto_14

    :sswitch_1b
    move/from16 v20, v21

    .line 177
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    .line 178
    invoke-static {v0, v5, v4}, Ll/ۗ᩵;->᩸ᩴۡ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_14

    move v8, v4

    :goto_c
    const-string v2, "\u06dc\u1a77"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0xf

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x5f3d

    const v21, 0x6687765d

    xor-int v7, v7, v21

    const v21, 0x7da9519

    goto/16 :goto_14

    :cond_14
    const-string v2, "\u05ab\u06d8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x1869

    const v21, -0x6ec7e92d

    xor-int v7, v7, v21

    const v21, -0x5981b021

    goto/16 :goto_14

    .line 134
    :sswitch_1c
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    return-object v3

    :sswitch_1d
    move/from16 v20, v21

    if-ge v5, v4, :cond_15

    const-string v2, "\u06e7\u05ab"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0xe6f

    const v21, 0x51e54bb1

    xor-int v7, v7, v21

    const v21, 0x5a5ed04a

    goto/16 :goto_14

    :cond_15
    :goto_d
    const-string v2, "\u06e2\u06e8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, 0x19

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x6b5f

    const v21, 0x3f558d1e

    xor-int v7, v7, v21

    const v21, -0x104abfa5

    goto/16 :goto_14

    .line 99
    :sswitch_1e
    invoke-static/range {p0 .. p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :sswitch_1f
    move/from16 v20, v21

    .line 104
    invoke-static/range {p0 .. p0}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v2

    const/4 v4, 0x0

    move v4, v2

    const/4 v5, 0x0

    :goto_e
    const-string v2, "\u05a1\u06db"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x7cad

    const v21, -0x1e33efd1

    xor-int v7, v7, v21

    const v21, 0x18058a43

    goto/16 :goto_14

    :sswitch_20
    move/from16 v20, v21

    .line 102
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    sget v2, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v2, :cond_16

    goto/16 :goto_13

    :cond_16
    const-string v2, "\u06dc\u073f"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x2c21

    const v21, -0x55a3436d

    xor-int v7, v7, v21

    const v21, 0x34581d6e

    goto/16 :goto_14

    .line 93
    :sswitch_21
    invoke-static/range {p0 .. p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :sswitch_22
    move/from16 v20, v21

    .line 97
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    .line 98
    invoke-interface {v1, v0}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_17

    const-string v2, "\u06e4\u1a77"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x4f7f

    const v21, -0x7c6416fa

    xor-int v7, v7, v21

    const v21, 0x499e5b8c    # 1297265.5f

    goto/16 :goto_14

    :cond_17
    const-string v2, "\u06e4\u06db"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x2c3f

    const v21, 0x71f2c1af

    xor-int v7, v7, v21

    const v21, -0x5354b509

    goto/16 :goto_14

    :sswitch_23
    move/from16 v20, v21

    .line 92
    invoke-static/range {p0 .. p0}, Ll/ۖ᩵;->ۡ֫۠(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    const-string v2, "\u05a8\u06e7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x7943

    const v21, 0x1fdafc99

    xor-int v7, v7, v21

    const v21, 0x1e189695

    goto/16 :goto_14

    :cond_18
    const-string v2, "\u05ab\u073a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x2173

    const v21, 0x258da46e

    xor-int v7, v7, v21

    const v21, 0x52bb9000

    goto/16 :goto_14

    :sswitch_24
    move/from16 v20, v21

    .line 32
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v2

    if-eqz v2, :cond_19

    :goto_f
    const-string v2, "\u1a78\u06d9"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x7b

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x68e3

    const v21, -0x7ed11888

    xor-int v7, v7, v21

    const v21, -0x4f656d78

    goto/16 :goto_14

    :cond_19
    const-string v2, "\u1a74\u06e0"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x63d7

    const v21, -0x53d3aec1

    xor-int v7, v7, v21

    const v21, -0x6694c61f

    goto/16 :goto_14

    :sswitch_25
    move/from16 v20, v21

    sget v2, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v2, :cond_1a

    :goto_10
    const-string v2, "\u06e2\u06e2"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x1317

    const v21, 0x112b8ae7

    xor-int v7, v7, v21

    const v21, 0x2bb5d0b0

    goto/16 :goto_14

    :cond_1a
    const-string v2, "\u06dc\u1a73"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x55

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x773b

    const v21, 0x6653384a

    xor-int v7, v7, v21

    const v21, -0x1f3c2d28

    goto/16 :goto_14

    :sswitch_26
    move/from16 v20, v21

    .line 156
    sget v2, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v2, :cond_1b

    :goto_11
    const-string v2, "\u1a74\u0730"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x63

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0xad5

    const v21, 0xd036e4a

    xor-int v7, v7, v21

    const v21, -0x3b4df681

    goto/16 :goto_14

    :cond_1b
    const-string v2, "\u0733\u1a74"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x2c17

    const v21, -0x722327ef

    xor-int v7, v7, v21

    const v21, -0x51c87071

    goto :goto_14

    :sswitch_27
    move/from16 v20, v21

    .line 26
    sget v2, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v2, :cond_1c

    :goto_12
    const-string v2, "\u05ab\u06e8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x2f

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x65cb

    const v21, -0xd05497d

    xor-int v7, v7, v21

    const v21, 0x29dcfff8

    goto :goto_14

    :cond_1c
    const-string v2, "\u1a75\u06df"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x3e89

    const v21, -0x1d60843b

    xor-int v7, v7, v21

    const v21, -0x522e079e

    goto :goto_14

    :sswitch_28
    move/from16 v20, v21

    .line 88
    sget v2, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v2, :cond_1d

    :goto_13
    const-string v2, "\u1a79\u06e1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x3f21

    const v21, 0x3d117990

    xor-int v7, v7, v21

    const v21, -0x538bd9c0

    goto :goto_14

    :cond_1d
    const-string v2, "\u06d6\u06dc"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x69

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x4175

    const v21, 0x2238063b

    xor-int v7, v7, v21

    const v21, 0x4cb6545

    :goto_14
    xor-int v2, v2, v21

    move/from16 v21, v20

    move/from16 v20, v2

    :goto_15
    move v2, v7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ddd8994 -> :sswitch_e
        -0x798362e2 -> :sswitch_17
        -0x7525e4a7 -> :sswitch_3
        -0x71b4fc18 -> :sswitch_d
        -0x629d9f64 -> :sswitch_a
        -0x6289014f -> :sswitch_23
        -0x5e28e8c7 -> :sswitch_1e
        -0x5d9ffb12 -> :sswitch_1a
        -0x5b85dd11 -> :sswitch_b
        -0x585a75b6 -> :sswitch_24
        -0x57961f8c -> :sswitch_9
        -0x55d6746e -> :sswitch_25
        -0x55bd51c3 -> :sswitch_d
        -0x55ab925d -> :sswitch_0
        -0x50c88339 -> :sswitch_2
        -0x4a3b57e9 -> :sswitch_27
        -0x49c13685 -> :sswitch_26
        -0x4708e130 -> :sswitch_4
        -0x450d65b7 -> :sswitch_22
        -0x3e1162f5 -> :sswitch_1
        -0x3c034faa -> :sswitch_8
        -0x31bb8616 -> :sswitch_28
        -0x2b8adcca -> :sswitch_9
        -0x2b55ae15 -> :sswitch_4
        -0x27dda6b0 -> :sswitch_27
        -0x24c9ab90 -> :sswitch_13
        -0x243cebf3 -> :sswitch_15
        -0x1ff741bb -> :sswitch_1f
        -0x1d05c62a -> :sswitch_22
        -0x1c12a6d4 -> :sswitch_1a
        -0x1bf0e26c -> :sswitch_a
        -0x17be9218 -> :sswitch_23
        -0x17accb09 -> :sswitch_7
        -0x12c76dcc -> :sswitch_1
        -0x12a5d043 -> :sswitch_6
        -0xd8e925c -> :sswitch_20
        -0xbdbfd5d -> :sswitch_19
        -0x5c41112 -> :sswitch_0
        0x387aaed -> :sswitch_13
        0x145f178c -> :sswitch_11
        0x1a06dd16 -> :sswitch_21
        0x1a2fbffa -> :sswitch_5
        0x1b451d3b -> :sswitch_15
        0x1be12c81 -> :sswitch_11
        0x1c1bc2a5 -> :sswitch_1d
        0x20c7844a -> :sswitch_28
        0x224410e4 -> :sswitch_16
        0x2684f738 -> :sswitch_3
        0x2faacadd -> :sswitch_6
        0x30463b31 -> :sswitch_1f
        0x3954fc1e -> :sswitch_12
        0x3b1c7b14 -> :sswitch_e
        0x3f64e4e3 -> :sswitch_24
        0x3fde6a79 -> :sswitch_1c
        0x40a8a93b -> :sswitch_1c
        0x44e22a26 -> :sswitch_20
        0x459b7fce -> :sswitch_26
        0x46774081 -> :sswitch_b
        0x4c5de0e4 -> :sswitch_14
        0x5259396b -> :sswitch_10
        0x52f4e775 -> :sswitch_f
        0x5397224a -> :sswitch_1d
        0x566b2898 -> :sswitch_18
        0x5705c43b -> :sswitch_14
        0x5d8e0e97 -> :sswitch_2
        0x60bdc397 -> :sswitch_f
        0x6145bee7 -> :sswitch_1b
        0x61677ac3 -> :sswitch_10
        0x646e82f4 -> :sswitch_16
        0x66fba363 -> :sswitch_17
        0x6854ef4e -> :sswitch_25
        0x6b0a0a20 -> :sswitch_21
        0x6bcd0470 -> :sswitch_c
        0x6d6e6448 -> :sswitch_1e
        0x6e5beba7 -> :sswitch_8
        0x6f76ab57 -> :sswitch_18
        0x70c02a33 -> :sswitch_19
        0x73436b56 -> :sswitch_12
        0x773f1277 -> :sswitch_7
        0x78c5cf89 -> :sswitch_c
        0x7b128110 -> :sswitch_1b
        0x7bae966c -> :sswitch_5
    .end sparse-switch
.end method

.method public static ᩷(ILjava/lang/String;)I
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x7aad55df

    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    sget v6, Ll/֨ܿ;->᩹᩻۟:I

    const-string v7, "\u06e4\u0736"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3519

    const v9, -0x692faf1e

    xor-int/2addr v8, v9

    const v9, 0x50e20dcf

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x21ef

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    add-int/lit8 v1, p0, -0x1

    .line 166
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v7

    if-nez v7, :cond_2

    goto/16 :goto_3

    .line 51
    :sswitch_0
    sget v7, Ll/᩶;->ᩴ᩶ۛ:I

    if-lez v7, :cond_7

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v7

    if-nez v7, :cond_b

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    sget v7, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v7, :cond_e

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto/16 :goto_1

    .line 95
    :sswitch_4
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    const/4 p0, 0x0

    return p0

    :sswitch_5
    return v1

    .line 195
    :sswitch_6
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "\u06d7\u06ec"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x4f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6131

    const v9, 0x2b03ebce

    xor-int/2addr v8, v9

    const v9, -0x10aecd9b

    goto :goto_0

    :sswitch_7
    return p0

    :sswitch_8
    return v0

    .line 194
    :sswitch_9
    invoke-static {p1, p0}, Ll/ۘܽ;->᩷۬ܽ(Ljava/lang/Object;I)C

    move-result v3

    .line 195
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "\u06dc\u1a79"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3bd5

    const v9, -0x7828b1ff

    xor-int/2addr v8, v9

    const v9, 0x22e99c5

    goto :goto_0

    :cond_0
    const-string v7, "\u06e2\u073f"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x42af

    const v9, -0x1d43ddb6

    xor-int/2addr v8, v9

    const v9, -0x5858d8f1

    goto/16 :goto_0

    .line 193
    :sswitch_a
    invoke-static {p1, v1}, Ll/ۘܽ;->᩷۬ܽ(Ljava/lang/Object;I)C

    move-result v2

    .line 46
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v7

    if-ltz v7, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v7, "\u1a79\u06df"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4303

    const v9, 0x20ffa829

    xor-int/2addr v8, v9

    const v9, 0x26c0acb1

    goto/16 :goto_0

    :cond_2
    const-string v7, "\u06e2\u06da"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x604b

    const v9, -0x56190d1a

    xor-int/2addr v8, v9

    const v9, 0x7e1bfe15

    goto/16 :goto_0

    :sswitch_b
    const/4 p0, 0x0

    return p0

    :sswitch_c
    if-lt p0, v0, :cond_3

    const-string v7, "\u1a75\u06d8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x5b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x779b

    const v9, 0x746fe78f

    xor-int/2addr v8, v9

    const v9, 0x697d2f35

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u1a76\u073a"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x4f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x20b9

    const v9, 0xd18e668

    xor-int/2addr v8, v9

    const v9, -0x1ef3d5cd

    goto/16 :goto_0

    .line 186
    :sswitch_d
    invoke-static {p1}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v0

    if-gtz p0, :cond_4

    const-string v7, "\u1a7a\u0733"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x1f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6139

    const v9, -0x149a460a

    xor-int/2addr v8, v9

    const v9, 0x11cb9b2f

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u073f\u1a74"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x377d

    const v9, -0x2f4464df

    xor-int/2addr v8, v9

    const v9, -0xf293b3a

    goto/16 :goto_0

    .line 48
    :sswitch_e
    sget v7, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v7, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v7, "\u05a8\u06ec"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x11

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x702b

    const v9, -0x49383951

    xor-int/2addr v8, v9

    const v9, 0x49ae2691

    goto/16 :goto_0

    :sswitch_f
    sget v7, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v7, :cond_6

    goto :goto_1

    :cond_6
    const-string v7, "\u06e8\u05ab"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x477d

    const v9, 0x6074e2a5

    xor-int/2addr v8, v9

    const v9, 0x4948fe95

    goto/16 :goto_0

    :sswitch_10
    sget v7, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v7, :cond_8

    :cond_7
    const-string v7, "\u06e8\u06e1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x3

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x293d

    const v9, 0x55c97522

    xor-int/2addr v8, v9

    const v9, 0x7612208a

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u1a7a\u05a1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2f0f

    const v9, 0xc479f7c

    xor-int/2addr v8, v9

    const v9, 0xae8f77b

    goto/16 :goto_0

    .line 36
    :sswitch_11
    sget-boolean v7, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v7, :cond_9

    goto :goto_1

    :cond_9
    const-string v7, "\u06db\u05ab"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x313

    const v9, 0x5d9552cf

    xor-int/2addr v8, v9

    const v9, 0x4a889782    # 4475841.0f

    goto/16 :goto_0

    .line 128
    :sswitch_12
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v7

    if-nez v7, :cond_a

    :goto_1
    const-string v7, "\u06ec\u1a78"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1381

    const v9, 0x738a33f8

    xor-int/2addr v8, v9

    const v9, 0x7654fec0

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u06e4\u06e2"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x75

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2023

    const v9, -0x57080a9f

    xor-int/2addr v8, v9

    const v9, -0x184e9873

    goto/16 :goto_0

    .line 38
    :sswitch_13
    sget v7, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v7, :cond_c

    :cond_b
    :goto_2
    const-string v7, "\u06da\u1a7a"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3c5f

    const v9, 0x4188af74

    xor-int/2addr v8, v9

    const v9, -0x22eec493

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06e8\u073a"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x19c5

    const v9, -0x14d5d876

    xor-int/2addr v8, v9

    const v9, 0x34191887

    goto/16 :goto_0

    .line 192
    :sswitch_14
    sget v7, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v7, :cond_d

    :goto_3
    const-string v7, "\u06eb\u06e8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x41c9

    const v9, 0x61590be5

    xor-int/2addr v8, v9

    const v9, -0x72398a62

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u073a\u06e1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x27

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3791

    const v9, -0x3a2f8ca1

    xor-int/2addr v8, v9

    const v9, 0x10c0f156

    goto/16 :goto_0

    .line 46
    :sswitch_15
    sget v7, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v7, :cond_f

    :cond_e
    :goto_4
    const-string v7, "\u06e0\u06e0"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x25

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2e6f

    const v9, -0x2c9325fe

    xor-int/2addr v8, v9

    const v9, 0xd375eee

    goto/16 :goto_0

    :cond_f
    const-string v7, "\u073f\u06e0"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x71

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2f31

    const v9, 0x740e7396

    xor-int/2addr v8, v9

    const v9, 0x1f0fa5b5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a596ee9 -> :sswitch_c
        -0x79de450b -> :sswitch_5
        -0x77d55b9e -> :sswitch_8
        -0x7404bf9c -> :sswitch_3
        -0x71adc9bc -> :sswitch_13
        -0x6fe9a2a9 -> :sswitch_9
        -0x6faac49e -> :sswitch_7
        -0x6d7ee552 -> :sswitch_12
        -0x60d9103d -> :sswitch_5
        -0x5f44980d -> :sswitch_0
        -0x5b49565d -> :sswitch_6
        -0x509b2401 -> :sswitch_11
        -0x4f294376 -> :sswitch_7
        -0x4e20114f -> :sswitch_13
        -0x476684a5 -> :sswitch_11
        -0x4193252f -> :sswitch_10
        -0x4112aec6 -> :sswitch_b
        -0x38e97bf0 -> :sswitch_b
        -0x38c00a73 -> :sswitch_d
        -0x3681937e -> :sswitch_2
        -0x359f6d6b -> :sswitch_2
        -0x3455fb33 -> :sswitch_15
        -0x277c02aa -> :sswitch_a
        -0x20f5e991 -> :sswitch_d
        -0x1f037d98 -> :sswitch_e
        -0x1ecfde29 -> :sswitch_3
        -0x1bf1fba0 -> :sswitch_14
        -0x1663d6e7 -> :sswitch_a
        -0x1421d93d -> :sswitch_4
        -0x13ef6d37 -> :sswitch_10
        -0x102f05d3 -> :sswitch_e
        -0x985f19a -> :sswitch_15
        -0x9546d8c -> :sswitch_6
        0x1d9a8a04 -> :sswitch_f
        0x2b5e77b8 -> :sswitch_0
        0x30444cb9 -> :sswitch_1
        0x31858643 -> :sswitch_1
        0x31b2d02f -> :sswitch_9
        0x3610c56f -> :sswitch_12
        0x47959412 -> :sswitch_14
        0x564ee0a8 -> :sswitch_c
        0x5e4c599d -> :sswitch_8
        0x612548d4 -> :sswitch_4
        0x6e5cd0bc -> :sswitch_f
    .end sparse-switch
.end method

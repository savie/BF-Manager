.class public final synthetic Ll/ᩴ֨᩻;
.super Ljava/lang/Object;
.source "V4FO"

# interfaces
.implements Ll/۫ܰ᩹;


# virtual methods
.method public final andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 241
    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x61379de7

    sget v2, Ll/֫ۢ;->ۚ᩻᩵:I

    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    const-string v4, "\u06e4\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1c3f

    const v6, 0x71d8e471

    xor-int/2addr v5, v6

    const v6, 0x57d65cc

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x288d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v4, :cond_5

    goto/16 :goto_3

    .line 15
    :sswitch_0
    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_6

    goto/16 :goto_2

    .line 10
    :sswitch_1
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_1

    .line 82
    :sswitch_2
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-nez v4, :cond_1

    goto/16 :goto_2

    .line 59
    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    const/4 p1, 0x0

    return-object p1

    :sswitch_5
    const/4 p1, 0x0

    return-object p1

    .line 139
    :sswitch_6
    invoke-virtual {p0, v0}, Ll/ᩴ֨᩻;->get(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۗ᩸;->ܽܰۗ(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :sswitch_7
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u1a7b\u073d"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6e77

    const v6, 0x1109183

    xor-int/2addr v5, v6

    const v6, -0x374dbb17

    goto :goto_0

    .line 108
    :sswitch_8
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v4

    if-gtz v4, :cond_2

    :cond_1
    :goto_1
    const-string v4, "\u06eb\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1a11

    const v6, 0x1f698e22

    xor-int/2addr v5, v6

    const v6, 0x26e02098

    goto :goto_0

    :cond_2
    const-string v4, "\u05a1\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x189b

    const v6, -0x37a3fa58

    xor-int/2addr v5, v6

    const v6, 0x40f8ccfd

    goto/16 :goto_0

    .line 119
    :sswitch_9
    sget v4, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v4, :cond_3

    goto :goto_3

    :cond_3
    const-string v4, "\u06ec\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6da7

    const v6, 0x2734049f

    xor-int/2addr v5, v6

    const v6, -0x5c19545b

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v4

    if-nez v4, :cond_4

    :goto_2
    const-string v4, "\u1a73\u073d"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x39

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x74ef

    const v6, 0x197162a8

    xor-int/2addr v5, v6

    const v6, 0x2dc64909

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06d6\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4931

    const v6, 0x5d2f42d5

    xor-int/2addr v5, v6

    const v6, 0x7f6a3e42

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u073a\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x59

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x141f

    const v6, -0x308fcc8b

    xor-int/2addr v5, v6

    const v6, -0xfa67496

    goto/16 :goto_0

    .line 17
    :sswitch_b
    sget v4, Ll/۬;->᩸ۜ᩹:I

    if-eqz v4, :cond_7

    :cond_6
    :goto_3
    const-string v4, "\u1a76\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7509

    const v6, -0x4d9b2d51

    xor-int/2addr v5, v6

    const v6, -0x73f90e07

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06eb\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3603

    const v6, 0x272a0c2b

    xor-int/2addr v5, v6

    const v6, 0x5a345908

    goto/16 :goto_0

    .line 5
    :sswitch_c
    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u06dc\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x29

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3ca7

    const v6, -0x36d995ad

    xor-int/2addr v5, v6

    const v6, 0x34a05171

    goto/16 :goto_0

    .line 64
    :sswitch_d
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u06df\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2fc9

    const v6, 0x430b202e

    xor-int/2addr v5, v6

    const v6, 0x54036814

    goto/16 :goto_0

    .line 1
    :sswitch_e
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v4

    if-eqz v4, :cond_b

    :cond_a
    const-string v4, "\u06db\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xf91

    const v6, 0x31980ab6    # 4.425E-9f

    xor-int/2addr v5, v6

    const v6, -0x4cde3c98

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a77\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7bf7

    const v6, -0x282433f0

    xor-int/2addr v5, v6

    const v6, -0x35d924bf

    goto/16 :goto_0

    .line 137
    :sswitch_f
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Ll/֡ᩴ;->ۛۤܿ(Ljava/lang/Object;)I

    move-result v0

    .line 72
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_c

    :goto_4
    const-string v4, "\u073f\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xf37

    const v6, 0x46ab2a5f

    xor-int/2addr v5, v6

    const v6, 0x560725f2

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a8\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2f81

    const v6, -0x66cb878a

    xor-int/2addr v5, v6

    const v6, -0x832d27

    goto/16 :goto_0

    :sswitch_10
    if-nez p1, :cond_d

    const-string v4, "\u0733\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4e85

    const v6, -0x1a4278ad

    xor-int/2addr v5, v6

    const v6, -0x3aad1993

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a74\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x59cb

    const v6, -0x42a53cbe

    xor-int/2addr v5, v6

    const v6, -0x229a98cc

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b29f85a -> :sswitch_4
        -0x6e1b3c54 -> :sswitch_0
        -0x6aff3b35 -> :sswitch_6
        -0x694d4d45 -> :sswitch_e
        -0x6753b438 -> :sswitch_e
        -0x61b0d34b -> :sswitch_d
        -0x5d651908 -> :sswitch_a
        -0x58eaf316 -> :sswitch_7
        -0x55fabfe2 -> :sswitch_9
        -0x55ec520d -> :sswitch_8
        -0x4e736be7 -> :sswitch_5
        -0x2e3aaa86 -> :sswitch_10
        -0x2910aba0 -> :sswitch_4
        -0x24b2ea23 -> :sswitch_b
        -0x1c721127 -> :sswitch_b
        -0x1baed352 -> :sswitch_d
        -0x1923fe7a -> :sswitch_10
        -0x5f16494 -> :sswitch_1
        -0x41f4eaf -> :sswitch_3
        0xbb44466 -> :sswitch_9
        0x1c4e845b -> :sswitch_f
        0x1cf8b124 -> :sswitch_a
        0x22cfcf67 -> :sswitch_2
        0x22d957c2 -> :sswitch_0
        0x23bbd8e4 -> :sswitch_f
        0x28f2c815 -> :sswitch_5
        0x30db7fc3 -> :sswitch_3
        0x3e444e62 -> :sswitch_8
        0x45dd7efb -> :sswitch_2
        0x4a0b39db -> :sswitch_c
        0x6841dc14 -> :sswitch_6
        0x692c6d34 -> :sswitch_c
        0x6c5376c1 -> :sswitch_1
        0x7dc71680 -> :sswitch_7
    .end sparse-switch
.end method

.method public final applyAsLong(I)J
    .locals 2

    .line 60
    invoke-virtual {p0, p1}, Ll/ᩴ֨᩻;->get(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 230
    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1
.end method

.method public final get(I)J
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x42b82c9c

    sget v11, Ll/֫۠;->ۢᩴ᩺:I

    sget v12, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v13, "\u06d8\u05ab"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x557f

    const v15, 0x420f45cc

    xor-int/2addr v14, v15

    const v15, -0x1ca8535a

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x1c45

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    const/16 v9, 0x3e8

    sget v13, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v13, :cond_0

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v13

    if-gtz v13, :cond_5

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget v13, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v13, :cond_8

    goto/16 :goto_2

    .line 127
    :sswitch_2
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v13

    if-gtz v13, :cond_a

    goto/16 :goto_3

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    goto/16 :goto_3

    .line 250
    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    const-wide/16 v0, 0x0

    return-wide v0

    .line 265
    :sswitch_5
    rem-int/2addr v8, v9

    int-to-long v0, v8

    add-long/2addr v6, v0

    return-wide v6

    :cond_0
    const-string v13, "\u073a\u1a78"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x6a23

    const v15, 0x3ab1b804

    xor-int/2addr v14, v15

    const v15, 0x5745cb1e

    goto :goto_0

    :sswitch_6
    div-int/lit8 v8, v1, 0x3

    .line 214
    sget v13, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v13, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v13, "\u06e1\u0730"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3a0f

    const v15, -0x4ce8a557

    xor-int/2addr v14, v15

    const v15, 0x1afc64d5

    goto :goto_0

    :sswitch_7
    mul-long v6, v2, v4

    .line 87
    sget v13, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v13, :cond_2

    const-string v13, "\u06da\u05a8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x70d5

    const v15, 0x23477284

    xor-int/2addr v14, v15

    const v15, 0x154bc174

    goto/16 :goto_0

    :cond_2
    const-string v13, "\u06e1\u06e2"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x67dd

    const v15, -0x46893d37

    xor-int/2addr v14, v15

    const v15, 0x55464d5a

    goto/16 :goto_0

    :sswitch_8
    int-to-long v2, v1

    const-wide/16 v4, 0x3e8

    .line 240
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v13

    if-eqz v13, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v13, "\u1a75\u1a7a"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x15

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6f23

    const v15, -0x74badc9d

    xor-int/2addr v14, v15

    const v15, -0x14a0dba7

    goto/16 :goto_0

    :sswitch_9
    xor-int v1, p1, v0

    .line 18
    sget v13, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v13, :cond_4

    goto :goto_1

    :cond_4
    const-string v13, "\u06e4\u06e8"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7733

    const v15, 0x6c78c02b

    xor-int/2addr v14, v15

    const v15, 0x3e8e6107

    goto/16 :goto_0

    :sswitch_a
    const v0, 0x7266748

    sget v13, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v13, :cond_6

    :cond_5
    :goto_1
    const-string v13, "\u1a79\u05ab"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1b9

    const v15, -0x71a61a00

    xor-int/2addr v14, v15

    const v15, -0x4ae9a20c

    goto/16 :goto_0

    :cond_6
    const-string v13, "\u06d6\u1a76"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x6b43

    const v15, -0x418e09d9

    xor-int/2addr v14, v15

    const v15, -0x227a8b6f

    goto/16 :goto_0

    .line 19
    :sswitch_b
    sget v13, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v13, :cond_7

    goto :goto_2

    :cond_7
    const-string v13, "\u06e4\u1a74"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6f9d

    const v15, -0x1fa445ce

    xor-int/2addr v14, v15

    const v15, -0x181d06b5

    goto/16 :goto_0

    .line 41
    :sswitch_c
    sget v13, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v13, :cond_9

    :cond_8
    const-string v13, "\u06e1\u1a74"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x19

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x5ab3

    const v15, -0x50b44ec2

    xor-int/2addr v14, v15

    const v15, -0x17f0078c

    goto/16 :goto_0

    :cond_9
    const-string v13, "\u073f\u06dc"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4c1d

    const v15, -0x3f6b3a8b

    xor-int/2addr v14, v15

    const v15, 0xcf7ad52

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v13

    if-eqz v13, :cond_b

    :cond_a
    :goto_2
    const-string v13, "\u1a79\u073f"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x15

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7c71

    const v15, 0x31467a07

    xor-int/2addr v14, v15

    const v15, 0x758ac21f

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u1a7a\u05ab"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x1b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x6c25

    const v15, 0x62d597aa

    xor-int/2addr v14, v15

    const v15, -0x2d59ae70

    goto/16 :goto_0

    .line 206
    :sswitch_e
    sget v13, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v13, :cond_c

    :goto_3
    const-string v13, "\u1a73\u05ab"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x67

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0xfcb

    const v15, -0x2bb33f6f

    xor-int/2addr v14, v15

    const v15, -0x184bbd2

    goto/16 :goto_0

    :cond_c
    const-string v13, "\u06e4\u0730"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x15

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4831

    const v15, 0x6e739685

    xor-int/2addr v14, v15

    const v15, -0x8d4eae8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7716372c -> :sswitch_9
        -0x69a224a2 -> :sswitch_7
        -0x6368bc41 -> :sswitch_b
        -0x58a5eb62 -> :sswitch_3
        -0x569ce37d -> :sswitch_e
        -0x52561e4f -> :sswitch_3
        -0x52299f53 -> :sswitch_a
        -0x3ad96715 -> :sswitch_6
        -0x39cb6780 -> :sswitch_0
        -0x39601e26 -> :sswitch_5
        -0x22198a10 -> :sswitch_4
        -0x2a7e604 -> :sswitch_7
        -0x1739ead -> :sswitch_c
        0x59344a4 -> :sswitch_8
        0x1148bf97 -> :sswitch_6
        0x1396f580 -> :sswitch_2
        0x1ab0ba06 -> :sswitch_c
        0x1d715896 -> :sswitch_5
        0x20da9594 -> :sswitch_d
        0x220de73d -> :sswitch_a
        0x25756e36 -> :sswitch_1
        0x28d11b37 -> :sswitch_2
        0x4de59361 -> :sswitch_9
        0x5f7f728c -> :sswitch_0
        0x65229f7a -> :sswitch_e
        0x664d7d47 -> :sswitch_4
        0x6ddafcb7 -> :sswitch_d
        0x70532b3b -> :sswitch_b
        0x74a9145a -> :sswitch_1
        0x74bad475 -> :sswitch_8
    .end sparse-switch
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x1347835b

    sget v2, Ll/֫֡;->֫ۙۖ:I

    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    const-string v4, "\u06e7\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x19bb

    const v6, -0x35f03b21

    xor-int/2addr v5, v6

    const v6, 0x148cf71

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0xff1

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 132
    sget v4, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v4, :cond_8

    goto/16 :goto_3

    .line 93
    :sswitch_0
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v4, Ll/֡ۖ;->۫ۙ᩶:I

    if-lez v4, :cond_3

    goto/16 :goto_5

    .line 132
    :sswitch_1
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-nez v4, :cond_b

    goto :goto_1

    .line 107
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-gez v4, :cond_9

    goto :goto_1

    .line 17
    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    :goto_1
    const-string v4, "\u05ab\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x24cb

    const v6, 0x3f31fc26

    xor-int/2addr v5, v6

    const v6, -0x449fb3e6

    goto :goto_0

    .line 137
    :sswitch_4
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    const/4 p1, 0x0

    return-object p1

    :sswitch_5
    const/4 p1, 0x0

    return-object p1

    .line 139
    :sswitch_6
    invoke-virtual {p0, v0}, Ll/ᩴ֨᩻;->get(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/֫֡;->ۗ᩶ۢ(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 67
    :sswitch_7
    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u06df\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x59

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7c2d

    const v6, -0x1625cdcc

    xor-int/2addr v5, v6

    const v6, -0x720100e0

    goto :goto_0

    .line 103
    :sswitch_8
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v4, "\u06e7\u0736"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4663

    const v6, -0x4cd015b5

    xor-int/2addr v5, v6

    const v6, -0x56f7bbad

    goto/16 :goto_0

    .line 124
    :sswitch_9
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u0736\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x70c9

    const v6, -0xe310752

    xor-int/2addr v5, v6

    const v6, -0x37dd19fa

    goto/16 :goto_0

    .line 78
    :sswitch_a
    sget v4, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v4, :cond_4

    :cond_3
    :goto_2
    const-string v4, "\u073f\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x23fd

    const v6, -0xafc85d4

    xor-int/2addr v5, v6

    const v6, 0x5e3e037e

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u0730\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x50a1

    const v6, 0x4b5360a2    # 1.3852834E7f

    xor-int/2addr v5, v6

    const v6, 0x2c0b1d95

    goto/16 :goto_0

    .line 37
    :sswitch_b
    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v4, "\u06e7\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3f9f

    const v6, 0x6a254a3b

    xor-int/2addr v5, v6

    const v6, 0x57921090

    goto/16 :goto_0

    .line 13
    :sswitch_c
    sget v4, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v4, :cond_6

    goto :goto_4

    :cond_6
    const-string v4, "\u06df\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5b03

    const v6, 0x377fb79e

    xor-int/2addr v5, v6

    const v6, -0x73ce28a1

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v4, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v4, "\u1a76\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2ec3

    const v6, 0x4337ea8b

    xor-int/2addr v5, v6

    const v6, 0x2cd3af6c

    goto/16 :goto_0

    :goto_3
    const-string v4, "\u06e1\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3d23

    const v6, 0x5df41af6

    xor-int/2addr v5, v6

    const v6, -0x4302b244

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d9\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x41f

    const v6, 0x175bbc7d    # 7.100062E-25f

    xor-int/2addr v5, v6

    const v6, -0x6664aa1e

    goto/16 :goto_0

    .line 20
    :sswitch_e
    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u1a74\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1117

    const v6, -0x7af961df

    xor-int/2addr v5, v6

    const v6, 0x420f13d1

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d6\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7761

    const v6, -0x59f45100

    xor-int/2addr v5, v6

    const v6, 0x573b0a76

    goto/16 :goto_0

    .line 137
    :sswitch_f
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Ll/֡᩻;->֡ܽ۟(Ljava/lang/Object;)I

    move-result v0

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v4

    if-gtz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u1a77\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1fd

    const v6, 0x3f140482

    xor-int/2addr v5, v6

    const v6, -0x52fe5f40

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073d\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x76d5

    const v6, 0x2e68ede6

    xor-int/2addr v5, v6

    const v6, -0x16bd5119

    goto/16 :goto_0

    :sswitch_10
    if-nez p1, :cond_d

    const-string v4, "\u073d\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1af

    const v6, 0x346dde2b

    xor-int/2addr v5, v6

    const v6, -0x279d29f4

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06df\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2ef7

    const v6, 0x57896c4d

    xor-int/2addr v5, v6

    const v6, -0x62242191

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fe60641 -> :sswitch_5
        -0x70b1883b -> :sswitch_c
        -0x6f05cb5c -> :sswitch_d
        -0x6efc0e91 -> :sswitch_5
        -0x6cf87246 -> :sswitch_4
        -0x6018151f -> :sswitch_9
        -0x5ac9e511 -> :sswitch_8
        -0x5a58367e -> :sswitch_7
        -0x51c5874b -> :sswitch_1
        -0x41a5fb14 -> :sswitch_8
        -0x37cc4bc6 -> :sswitch_3
        -0x36b0cb2d -> :sswitch_a
        -0x34e1c8ea -> :sswitch_6
        -0x2c31cc23 -> :sswitch_a
        -0x2b453d89 -> :sswitch_f
        -0x25d1bb5f -> :sswitch_10
        -0x1b5f01b4 -> :sswitch_6
        -0x1a3c369a -> :sswitch_2
        -0x170b6610 -> :sswitch_1
        -0xc1ffec9 -> :sswitch_d
        0xc3270c5 -> :sswitch_b
        0xd0f78af -> :sswitch_e
        0x1373dbfe -> :sswitch_0
        0x1419f05e -> :sswitch_3
        0x32241f36 -> :sswitch_e
        0x38951e87 -> :sswitch_b
        0x484c3c4a -> :sswitch_f
        0x4c76813c -> :sswitch_7
        0x6006ac7f -> :sswitch_4
        0x60afc41b -> :sswitch_9
        0x643e08eb -> :sswitch_0
        0x68ab6b33 -> :sswitch_c
        0x71e19d6a -> :sswitch_10
        0x7664cd68 -> :sswitch_2
    .end sparse-switch
.end method

.method public final synthetic size()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

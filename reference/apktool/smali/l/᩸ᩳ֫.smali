.class public final synthetic Ll/᩸ᩳ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x607ceb10

    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    const-string v5, "\u06e0\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x29ef

    const v7, -0x46116750

    xor-int/2addr v6, v7

    const v7, 0x7696856a

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0xe9b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v5

    if-nez v5, :cond_c

    goto/16 :goto_5

    .line 919
    :sswitch_0
    sget-boolean v5, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v5, :cond_a

    goto/16 :goto_1

    .line 2285
    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_3

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v5

    if-eqz v5, :cond_6

    goto/16 :goto_5

    .line 873
    :sswitch_3
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    const/4 p1, 0x0

    return p1

    .line 6
    :sswitch_5
    sget p1, Ll/۟ۢ֫;->ۡ᩷:I

    .line 2363
    iget-object p1, v0, Ll/᩵ۢ֫;->ܺ:Ljava/lang/String;

    iget-object p2, v1, Ll/᩵ۢ֫;->ܺ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/᩵ۢ֫;

    .line 4
    move-object v1, p2

    check-cast v1, Ll/᩵ۢ֫;

    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v5, "\u1a79\u06e1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x47

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5fd3

    const v7, 0x6da74afb

    xor-int/2addr v6, v7

    const v7, 0x4d3a53a3    # 1.9537771E8f

    goto :goto_0

    .line 1886
    :sswitch_7
    sget v5, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u06d9\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x30b9

    const v7, 0x41be8eab

    xor-int/2addr v6, v7

    const v7, -0x2188f13c

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v5

    if-eqz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u05a1\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4029

    const v7, 0x562ef1f3

    xor-int/2addr v6, v7

    const v7, 0x3222b8ab

    goto/16 :goto_0

    .line 79
    :sswitch_9
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v5

    if-gtz v5, :cond_4

    :cond_3
    :goto_1
    const-string v5, "\u0730\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xb97

    const v7, 0x8f28d8a

    xor-int/2addr v6, v7

    const v7, 0x70246cdf

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u1a76\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2c99

    const v7, 0x9d45a4c

    xor-int/2addr v6, v7

    const v7, -0x787de49a

    goto/16 :goto_0

    .line 1636
    :sswitch_a
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v5

    if-ltz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u1a77\u06ec"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x3

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x9ad

    const v7, 0x56dff49a

    xor-int/2addr v6, v7

    const v7, -0xaea8775

    goto/16 :goto_0

    .line 167
    :sswitch_b
    sget v5, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v5, :cond_7

    :cond_6
    :goto_2
    const-string v5, "\u06d9\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x15

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1e8d

    const v7, -0xbc7821b

    xor-int/2addr v6, v7

    const v7, 0x12d1c888

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u073a\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4fb7

    const v7, 0x272fb064

    xor-int/2addr v6, v7

    const v7, 0x7ac4cdab

    goto/16 :goto_0

    .line 1164
    :sswitch_c
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u1a7b\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x48d7

    const v7, -0x4d0645b

    xor-int/2addr v6, v7

    const v7, -0x7ed95681

    goto/16 :goto_0

    .line 887
    :sswitch_d
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v5

    if-eqz v5, :cond_9

    :goto_3
    const-string v5, "\u1a77\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x42ef

    const v7, 0x322c2941

    xor-int/2addr v6, v7

    const v7, -0x2fbf0a98

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06e7\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4ab7

    const v7, -0x1a48288f

    xor-int/2addr v6, v7

    const v7, -0x39535e3b

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v5, :cond_b

    :cond_a
    :goto_4
    const-string v5, "\u1a76\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5701

    const v7, 0x4b069ada    # 8821466.0f

    xor-int/2addr v6, v7

    const v7, 0x45e2ea7c

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u0730\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2b15

    const v7, -0x42be1b5f

    xor-int/2addr v6, v7

    const v7, 0x21c484cf

    goto/16 :goto_0

    :goto_5
    const-string v5, "\u0730\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3da7

    const v7, 0x34901df1

    xor-int/2addr v6, v7

    const v7, 0x9538852

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d9\u06eb"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4a9d

    const v7, -0x609cd94a

    xor-int/2addr v6, v7

    const v7, -0x5cc863ed

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6c48ea16 -> :sswitch_9
        -0x58cd3cb5 -> :sswitch_7
        -0x552b6842 -> :sswitch_7
        -0x4b2b4ccd -> :sswitch_d
        -0x40291180 -> :sswitch_e
        -0x3213b188 -> :sswitch_9
        -0x2f0e95f9 -> :sswitch_1
        -0x23351150 -> :sswitch_3
        -0x217c508d -> :sswitch_a
        -0x15b35336 -> :sswitch_5
        -0x132ce935 -> :sswitch_b
        -0x102b1a32 -> :sswitch_a
        -0x7acabe4 -> :sswitch_2
        0x95227a9 -> :sswitch_b
        0xff6e1cd -> :sswitch_8
        0x2987a1c0 -> :sswitch_d
        0x2b4086ab -> :sswitch_e
        0x300b72bf -> :sswitch_8
        0x3eee086d -> :sswitch_0
        0x3f484660 -> :sswitch_2
        0x418fd00e -> :sswitch_c
        0x45537533 -> :sswitch_0
        0x4983ccaf -> :sswitch_4
        0x4bc527d2 -> :sswitch_1
        0x4c490bd6 -> :sswitch_5
        0x52f94501 -> :sswitch_4
        0x53bcb3a1 -> :sswitch_c
        0x5600146f -> :sswitch_6
        0x5dc341a6 -> :sswitch_3
        0x5f8ac43a -> :sswitch_6
    .end sparse-switch
.end method

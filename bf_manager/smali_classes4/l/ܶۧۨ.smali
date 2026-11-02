.class public final synthetic Ll/ܶۧۨ;
.super Ljava/lang/Object;
.source "SAJE"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const v6, -0x6b161cc5

    sget v7, Ll/ۖۧ;->ܺۚۖ:I

    sget v8, Ll/ۖ᩸;->ۨܽ۬:I

    const-string v9, "\u0736\u06e8"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0xe29

    const v11, -0xfd4bc4f

    xor-int/2addr v10, v11

    const v11, -0x55022e63

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v8

    mul-int/lit16 v6, v6, 0x41e9

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    sget-boolean v9, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v9, :cond_6

    goto/16 :goto_1

    .line 3
    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v9

    if-nez v9, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v9, "\u0730\u05a1"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x61

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x1a57

    const v11, -0x42450f1b

    xor-int/2addr v10, v11

    const v11, -0x3651c6e2

    goto :goto_0

    .line 7
    :sswitch_1
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v9

    if-ltz v9, :cond_3

    goto/16 :goto_3

    .line 13
    :sswitch_2
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    sget-boolean v9, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v9, :cond_b

    goto/16 :goto_2

    .line 40
    :sswitch_3
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    goto/16 :goto_2

    .line 112
    :sswitch_4
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    const/4 p1, 0x0

    return p1

    .line 114
    :sswitch_5
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    neg-int p1, p1

    return p1

    .line 6
    :sswitch_6
    sget v2, Ll/ᩴۧۨ;->᩵ۙ:I

    .line 114
    invoke-static {v0}, Ll/ۖۗ;->ᩴ᩵ۡ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {v1}, Ll/ۖۗ;->ᩴ᩵ۡ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v9

    if-ltz v9, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v9, "\u06e8\u06e7"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x5575

    const v11, -0x51742f90

    xor-int/2addr v10, v11

    const v11, -0x7c9e3171

    goto :goto_0

    .line 2
    :sswitch_7
    move-object v0, p1

    check-cast v0, Ll/۫֫᩺;

    .line 4
    move-object v1, p2

    check-cast v1, Ll/۫֫᩺;

    .line 87
    sget v9, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v9, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v9, "\u06da\u1a77"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x19

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x409d

    const v11, -0x2771a3b0

    xor-int/2addr v10, v11

    const v11, -0x31ba3387

    goto/16 :goto_0

    .line 58
    :sswitch_8
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v9

    if-eqz v9, :cond_4

    :cond_3
    const-string v9, "\u1a73\u0730"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x73

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x3ef7

    const v11, -0x13433d92

    xor-int/2addr v10, v11

    const v11, 0x32cbc7c0

    goto/16 :goto_0

    :cond_4
    const-string v9, "\u06d9\u06e7"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x19

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x5b77

    const v11, -0x1e0ff0d9

    xor-int/2addr v10, v11

    const v11, -0x24148b34

    goto/16 :goto_0

    .line 77
    :sswitch_9
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v9

    if-gtz v9, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v9, "\u06df\u1a7a"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x779b

    const v11, -0x20c09b0b

    xor-int/2addr v10, v11

    const v11, 0x72edb848

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u06d8\u0733"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x76f

    const v11, 0x3eaa7426

    xor-int/2addr v10, v11

    const v11, -0x6e653d8b

    goto/16 :goto_0

    .line 79
    :sswitch_a
    sget-boolean v9, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v9, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v9, "\u06e8\u073f"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x7b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x4651

    const v11, -0x185014fc

    xor-int/2addr v10, v11

    const v11, 0x17fce784

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v9, Ll/᩶;->ۚۤۘ:Z

    if-eqz v9, :cond_8

    :goto_1
    const-string v9, "\u06d9\u1a78"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x6111

    const v11, 0x7790e00b

    xor-int/2addr v10, v11

    const v11, -0x7579a59b

    goto/16 :goto_0

    :cond_8
    const-string v9, "\u06dc\u06dc"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x33d9

    const v11, -0x542307ef

    xor-int/2addr v10, v11

    const v11, -0x7543654f

    goto/16 :goto_0

    :sswitch_c
    sget v9, Ll/֫;->ܶܺ᩻:I

    if-ltz v9, :cond_9

    goto :goto_3

    :cond_9
    const-string v9, "\u06df\u05a8"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x473b

    const v11, -0x5b3e7577

    xor-int/2addr v10, v11

    const v11, -0x2b2ab338

    goto/16 :goto_0

    .line 95
    :sswitch_d
    sget-boolean v9, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v9, :cond_a

    :goto_2
    const-string v9, "\u06e1\u05ab"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x6f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x63c3

    const v11, 0x61fb3fbe

    xor-int/2addr v10, v11

    const v11, -0x79cfd1f9

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u06da\u1a7b"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x479b

    const v11, 0x31bdfd5

    xor-int/2addr v10, v11

    const v11, -0x4c6c4d11

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v9

    if-eqz v9, :cond_c

    :cond_b
    :goto_3
    const-string v9, "\u1a79\u05ab"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x3fc1

    const v11, 0x154d635a

    xor-int/2addr v10, v11

    const v11, -0x2c592d6

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u06df\u1a78"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3983

    const v11, -0xa0876d8

    xor-int/2addr v10, v11

    const v11, -0x46596bb5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c923f33 -> :sswitch_9
        -0x60b7c781 -> :sswitch_8
        -0x5b1b6f71 -> :sswitch_b
        -0x59db651e -> :sswitch_3
        -0x58fc421b -> :sswitch_8
        -0x4876f900 -> :sswitch_2
        -0x3c5da520 -> :sswitch_c
        -0x39624ba7 -> :sswitch_1
        -0x2533ceff -> :sswitch_e
        -0x22b6d06d -> :sswitch_b
        -0x193e4ef2 -> :sswitch_a
        -0x16503c96 -> :sswitch_e
        -0xee303ca -> :sswitch_0
        -0xcafeb62 -> :sswitch_5
        -0x5484dcc -> :sswitch_0
        0x11673b8f -> :sswitch_d
        0x172be4d3 -> :sswitch_1
        0x23ae4bbb -> :sswitch_4
        0x28d7bdae -> :sswitch_3
        0x2a7ba96a -> :sswitch_6
        0x2f35d30c -> :sswitch_7
        0x4474f3f8 -> :sswitch_9
        0x481766e3 -> :sswitch_5
        0x549a6713 -> :sswitch_6
        0x55b26d31 -> :sswitch_2
        0x561f7b11 -> :sswitch_7
        0x5f52abe7 -> :sswitch_a
        0x6c4891e4 -> :sswitch_d
        0x6f664fbb -> :sswitch_4
        0x789692a8 -> :sswitch_c
    .end sparse-switch
.end method

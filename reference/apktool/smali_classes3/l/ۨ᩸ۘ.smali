.class public final synthetic Ll/ۨ᩸ۘ;
.super Ljava/lang/Object;
.source "K185"


# direct methods
.method public static ۙ(Ll/ۚ᩸ۘ;)Ll/ۚ᩸ۘ;
    .locals 6

    const v0, -0x2e918f5a

    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    sget v2, Ll/֫ܳ;->᩶ۧۛ:I

    const-string v3, "\u0733\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x32a1

    const v5, 0x664d0e8f

    xor-int/2addr v4, v5

    const v5, 0x4bde8433    # 2.916567E7f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x2be5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 11
    new-instance v3, Ll/ۖ᩸ۘ;

    .line 10
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_2

    goto/16 :goto_4

    .line 4
    :sswitch_0
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v3

    if-ltz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u0733\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5ed5

    const v5, -0x3823c53

    xor-int/2addr v4, v5

    const v5, -0x65b447b1

    goto :goto_0

    :sswitch_1
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string v3, "\u06dc\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7505

    const v5, -0x1037805d

    xor-int/2addr v4, v5

    const v5, -0x10504d39

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-nez v3, :cond_a

    goto :goto_2

    .line 1
    :sswitch_3
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    goto :goto_2

    .line 8
    :sswitch_4
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    const/4 p0, 0x0

    return-object p0

    .line 9
    :sswitch_5
    new-instance p0, Ll/ܳᩳۖ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    .line 4
    :cond_2
    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_3

    goto :goto_2

    .line 0
    :cond_3
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_4

    goto :goto_3

    .line 2
    :cond_4
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v4, :cond_5

    goto :goto_4

    .line 6
    :cond_5
    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_6

    goto :goto_4

    :cond_6
    sget-boolean v4, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_8

    goto :goto_3

    .line 1
    :cond_8
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_9

    :goto_2
    const-string v3, "\u1a74\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xb7

    const v5, -0x7e7fc3a

    xor-int/2addr v4, v5

    const v5, -0xf2bcd91

    goto/16 :goto_0

    :cond_9
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06e2\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x345d

    const v5, 0x7efaaa12

    xor-int/2addr v4, v5

    const v5, -0x31530948

    goto/16 :goto_0

    .line 5
    :cond_b
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_c

    :goto_4
    const-string v3, "\u06d9\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5fc5

    const v5, -0xf98cb3c

    xor-int/2addr v4, v5

    const v5, 0x15123349

    goto/16 :goto_0

    .line 11
    :cond_c
    invoke-direct {v3, p0}, Ll/ۖ᩸ۘ;-><init>(Ll/ۚ᩸ۘ;)V

    return-object v3

    :sswitch_6
    if-nez p0, :cond_d

    const-string v3, "\u073f\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x74e9

    const v5, 0x3ef111fd

    xor-int/2addr v4, v5

    const v5, 0x4daadc5b    # 3.58321E8f

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u0736\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7581

    const v5, 0x3470ea78

    xor-int/2addr v4, v5

    const v5, 0x8d673cd

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79f1dec2 -> :sswitch_4
        -0x69fdbc39 -> :sswitch_5
        -0x63146924 -> :sswitch_4
        -0x5964d77f -> :sswitch_5
        -0x4689deee -> :sswitch_0
        -0x43f63779 -> :sswitch_2
        -0x3dd60931 -> :sswitch_1
        -0x32a0da1d -> :sswitch_6
        -0x22e6b079 -> :sswitch_3
        -0x1138c6ed -> :sswitch_1
        0x3aef9394 -> :sswitch_3
        0x3af8cd78 -> :sswitch_6
        0x4556bf2a -> :sswitch_2
        0x4d705f47 -> :sswitch_0
    .end sparse-switch
.end method

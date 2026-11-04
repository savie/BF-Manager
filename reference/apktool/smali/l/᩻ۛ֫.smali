.class public final synthetic Ll/᩻ۛ֫;
.super Ljava/lang/Object;
.source "GA31"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0x61e2d613

    sget v6, Ll/ۗܰ;->ܶۜ۬:I

    sget v7, Ll/֨ۢ;->۬ܿܺ:I

    const-string v8, "\u06da\u073a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x4b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x3013

    const v10, -0x56ef0ef4

    xor-int/2addr v9, v10

    const v10, -0x38433c0e

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, 0x13d7

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 4
    sget v8, Ll/ۧ;->ۨۗܰ:I

    if-ltz v8, :cond_9

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    sget v8, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v8, :cond_c

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    sget v8, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v8, :cond_a

    goto/16 :goto_3

    .line 21
    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v8

    if-nez v8, :cond_8

    goto/16 :goto_2

    .line 64
    :sswitch_3
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    goto/16 :goto_2

    .line 29
    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    return-void

    .line 77
    :sswitch_5
    invoke-virtual {v4}, Ll/ܿۨ֫;->ۗ()I

    move-result v8

    invoke-virtual {v3}, Ll/ۤ᩺֫;->ۗ()I

    move-result v9

    if-lt v8, v9, :cond_f

    goto :goto_1

    .line 78
    :sswitch_6
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    const/4 v2, 0x1

    goto/16 :goto_5

    .line 83
    :sswitch_7
    sget-object v8, Ll/ܽۛ֫;->ۙ:Ljava/util/List;

    invoke-static {v8}, Ll/ܽۛ֫;->ۙ(Ljava/util/List;)V

    goto/16 :goto_6

    .line 76
    :sswitch_8
    invoke-static {v3}, Ll/֡ܳ;->֡֫ۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/᩹ۨ֫;->ۤ(Ljava/lang/String;)Ll/ܿۨ֫;

    move-result-object v4

    if-eqz v4, :cond_0

    const-string v8, "\u1a78\u0736"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x2d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x58b7

    const v10, -0x66b56202

    xor-int/2addr v9, v10

    const v10, -0x22862cbe

    goto :goto_0

    :cond_0
    :goto_1
    const-string v8, "\u06ec\u0733"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x33

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6909

    const v10, -0x6f2ac71c

    xor-int/2addr v9, v10

    const v10, -0x41d2894

    goto/16 :goto_0

    .line 51
    :sswitch_9
    sget v8, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v8, :cond_1

    const-string v8, "\u1a78\u05a8"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3435

    const v10, 0x6f0831d0

    xor-int/2addr v9, v10

    const v10, -0x3e64f7ea

    goto/16 :goto_0

    :cond_1
    const-string v8, "\u06e7\u06df"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x6b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7743

    const v10, -0x6ee5e456

    xor-int/2addr v9, v10

    const v10, -0x5fd4130b

    goto/16 :goto_0

    .line 37
    :sswitch_a
    sget v8, Ll/ۧ;->ۨۗܰ:I

    if-ltz v8, :cond_2

    goto :goto_2

    :cond_2
    const-string v8, "\u06dc\u06e2"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x67

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x30bd

    const v10, -0x68ee7cfe

    xor-int/2addr v9, v10

    const v10, -0x7ac69edd

    goto/16 :goto_0

    .line 38
    :sswitch_b
    sget v8, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v8, :cond_3

    :goto_2
    const-string v8, "\u1a79\u1a7b"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x25

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x1581

    const v10, -0x14526836

    xor-int/2addr v9, v10

    const v10, -0xaa65e6

    goto/16 :goto_0

    :cond_3
    const-string v8, "\u1a7b\u0736"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4ae1

    const v10, -0x6c5160da

    xor-int/2addr v9, v10

    const v10, -0x938c41c

    goto/16 :goto_0

    .line 5
    :sswitch_c
    sget-boolean v8, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v8, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v8, "\u06e1\u073a"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3651

    const v10, 0x76e24aaf

    xor-int/2addr v9, v10

    const v10, -0x1c882bbe

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v8

    if-ltz v8, :cond_5

    goto :goto_3

    :cond_5
    const-string v8, "\u06ec\u0730"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x57

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x62bb

    const v10, -0x3b4a2caa

    xor-int/2addr v9, v10

    const v10, -0x3abc20c3

    goto/16 :goto_0

    :sswitch_e
    sget v8, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v8, :cond_6

    goto :goto_3

    :cond_6
    const-string v8, "\u06e4\u073f"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2e2d

    const v10, 0x4714d0b

    xor-int/2addr v9, v10

    const v10, -0x1342f195

    goto/16 :goto_0

    .line 35
    :sswitch_f
    sget v8, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v8, :cond_7

    goto :goto_4

    :cond_7
    const-string v8, "\u1a74\u06e2"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4a95

    const v10, -0x7d25c6d6

    xor-int/2addr v9, v10

    const v10, -0x72cba191

    goto/16 :goto_0

    :cond_8
    :goto_3
    const-string v8, "\u06db\u073d"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6b27

    const v10, 0x44684f91

    xor-int/2addr v9, v10

    const v10, 0x7d6a0264

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u1a7b\u06d6"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x79

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x28cb

    const v10, 0x400b0c3e

    xor-int/2addr v9, v10

    const v10, 0x15fb68ad

    goto/16 :goto_0

    .line 1
    :sswitch_10
    sget v8, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v8, :cond_b

    :cond_a
    const-string v8, "\u1a76\u1a73"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x6853

    const v10, -0x4e879c36

    xor-int/2addr v9, v10

    const v10, -0x439e0e18

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u1a7a\u06d9"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5d41

    const v10, 0x2a3f69a

    xor-int/2addr v9, v10

    const v10, 0x20b32a3

    goto/16 :goto_0

    .line 75
    :sswitch_11
    invoke-static {v1}, Ll/֨ۚ;->ᩳ᩷ܺ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤ᩺֫;

    .line 59
    sget v8, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v8, :cond_d

    :cond_c
    :goto_4
    const-string v8, "\u0736\u06ec"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x2be5

    const v10, -0x50cade00

    xor-int/2addr v9, v10

    const v10, -0x57516f16

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u05a1\u05a8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x39

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x38d3

    const v10, 0x3541e67

    xor-int/2addr v9, v10

    const v10, -0x473ede8

    goto/16 :goto_0

    :sswitch_12
    if-eqz v2, :cond_10

    const-string v8, "\u06d6\u073f"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x7f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x1073

    const v10, -0xb5a2d8b

    xor-int/2addr v9, v10

    const v10, -0x6e39aa70

    goto/16 :goto_0

    :sswitch_13
    return-void

    .line 74
    :sswitch_14
    invoke-static {v1}, Ll/֫ۢ;->᩷ۤ᩷(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    const-string v8, "\u06df\u05a1"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x7f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2c7

    const v10, -0x33274fe4    # -1.1360688E8f

    xor-int/2addr v9, v10

    const v10, 0xeee4851

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u1a75\u05ab"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x51

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x3e89

    const v10, 0x3fda507a

    xor-int/2addr v9, v10

    const v10, -0x2cfb11b5

    goto/16 :goto_0

    :sswitch_15
    invoke-static {v0}, Ll/᩺;->ܰ֨ۗ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_f
    :goto_5
    const-string v8, "\u06db\u073a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x25

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x77c9

    const v10, -0x17417263

    xor-int/2addr v9, v10

    const v10, 0x7f3d2e20

    goto/16 :goto_0

    .line 70
    :sswitch_16
    sget-object v0, Ll/ܽۛ֫;->ۙ:Ljava/util/List;

    if-nez v0, :cond_11

    :cond_10
    :goto_6
    const-string v8, "\u0733\u0736"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x14b7

    const v10, -0x6aa98b5c

    xor-int/2addr v9, v10

    const v10, -0x47871015

    goto/16 :goto_0

    :cond_11
    const-string v8, "\u06e8\u1a77"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x1cd

    const v10, 0x29c54bee

    xor-int/2addr v9, v10

    const v10, -0x4350fa05

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6c00b8c0 -> :sswitch_2
        -0x6adc9b00 -> :sswitch_3
        -0x65dfc5ff -> :sswitch_15
        -0x6086c372 -> :sswitch_4
        -0x54ad3ac3 -> :sswitch_3
        -0x4beef9ad -> :sswitch_10
        -0x48fa34a1 -> :sswitch_8
        -0x469e3651 -> :sswitch_7
        -0x431f0fbd -> :sswitch_10
        -0x42c1eb25 -> :sswitch_6
        -0x3f39d09f -> :sswitch_7
        -0x3f381b6a -> :sswitch_6
        -0x351ad0d0 -> :sswitch_16
        -0x2c370f7f -> :sswitch_12
        -0x196378d7 -> :sswitch_9
        -0xf940d3d -> :sswitch_9
        -0xb8682ba -> :sswitch_0
        -0x58482b1 -> :sswitch_8
        -0x4dbc16f -> :sswitch_f
        -0x2dabfd -> :sswitch_14
        0xb3eb49d -> :sswitch_b
        0x12593743 -> :sswitch_14
        0x2665f28a -> :sswitch_f
        0x26ce2f1b -> :sswitch_11
        0x29d18e80 -> :sswitch_0
        0x2da25117 -> :sswitch_a
        0x37db8458 -> :sswitch_d
        0x40e7ca3a -> :sswitch_1
        0x45a890de -> :sswitch_16
        0x48b19762 -> :sswitch_d
        0x4a22ec11 -> :sswitch_13
        0x4a9a94c9 -> :sswitch_c
        0x4ac92028 -> :sswitch_4
        0x4cf7146c -> :sswitch_5
        0x4e503c84 -> :sswitch_a
        0x535d1377 -> :sswitch_12
        0x5442b485 -> :sswitch_c
        0x5a833f55 -> :sswitch_b
        0x5ac74c2d -> :sswitch_e
        0x5ff1be22 -> :sswitch_1
        0x631e5f60 -> :sswitch_13
        0x657ed827 -> :sswitch_e
        0x6704e9bd -> :sswitch_2
        0x67c9a39c -> :sswitch_15
        0x73e8ac8b -> :sswitch_11
        0x75ad87aa -> :sswitch_5
    .end sparse-switch
.end method

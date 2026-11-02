.class public final Ll/ܰ᩶ۘ;
.super Ljava/lang/Object;
.source "K7FD"


# direct methods
.method public static ۙ(Landroid/content/Context;IZ)Landroid/content/Context;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x319a1f82

    sget v3, Ll/֨ۧ;->֫۠֡:I

    sget v4, Ll/֫;->ܶܺ᩻:I

    const-string v5, "\u0736\u06e2"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2ef5

    const v7, 0x41303eee

    xor-int/2addr v6, v7

    const v7, 0x5a151eb0

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0xf89

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 39
    sget v5, Ll/᩶᩵ۘ;->ᩴۙ:I

    .line 144
    sget-object v5, Ll/ܽܺۘ;->᩹:Landroid/content/SharedPreferences;

    if-eqz v5, :cond_2

    const-string v5, "\u073d\u0733"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3b

    xor-int v6, v5, v4

    mul-int/lit8 v6, v6, -0x67

    const v7, -0x1ed253db

    xor-int/2addr v6, v7

    const v7, 0x59bb4dbb

    goto :goto_0

    .line 108
    :sswitch_0
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v5, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez v5, :cond_5

    goto/16 :goto_5

    .line 105
    :sswitch_1
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v5

    if-eqz v5, :cond_b

    goto/16 :goto_6

    :sswitch_2
    sget v5, Ll/֨᩺;->۬᩺ܰ:I

    if-gez v5, :cond_d

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    goto/16 :goto_4

    .line 82
    :sswitch_4
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    const/4 p0, 0x0

    return-object p0

    :sswitch_5
    return-object v0

    .line 45
    :sswitch_6
    new-instance v5, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    sget v7, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v7, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-direct {v5, v6}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 46
    invoke-static {v5, p1}, Ll/᩶᩵ۘ;->ۙ(Landroid/content/res/Configuration;I)V

    .line 47
    invoke-virtual {v0, v5}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v1

    goto :goto_1

    .line 144
    :sswitch_7
    sget-object v5, Ll/ܽܺۘ;->᩹:Landroid/content/SharedPreferences;

    .line 42
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    invoke-static {v5, p1}, Ll/᩶᩵ۘ;->ܰ(Landroid/content/res/Configuration;I)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "\u05a1\u1a78"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2859

    const v7, 0x2a7086c6

    xor-int/2addr v6, v7

    const v7, 0x2d542226

    goto/16 :goto_0

    :cond_1
    const-string v5, "\u06da\u0730"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x11

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2ac1

    const v7, 0x4d5377b4    # 2.2173984E8f

    xor-int/2addr v6, v7

    const v7, -0x4a2c4251

    goto/16 :goto_0

    :sswitch_8
    return-object v1

    .line 38
    :sswitch_9
    invoke-static {p0}, Ll/ۜۧ᩺;->ܰ(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    if-eqz p2, :cond_2

    const-string v5, "\u073f\u073d"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7333

    const v7, 0x15b965c7

    xor-int/2addr v6, v7

    const v7, 0x4707428f

    goto/16 :goto_0

    :cond_2
    move-object v1, v0

    :goto_1
    const-string v5, "\u1a75\u06e8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3169

    const v7, 0x2a13e284

    xor-int/2addr v6, v7

    const v7, 0x62848ef8

    goto/16 :goto_0

    .line 45
    :sswitch_a
    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v5, :cond_3

    goto :goto_3

    :cond_3
    const-string v5, "\u1a7b\u1a74"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7ff9

    const v7, 0x6f2c174d

    xor-int/2addr v6, v7

    const v7, 0x20e2f41c

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v5, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v5, :cond_4

    :goto_2
    const-string v5, "\u1a76\u06eb"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x53b9

    const v7, -0x79fa0b21

    xor-int/2addr v6, v7

    const v7, 0x350efdf0

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u073a\u06e7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x55

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x8bd

    const v7, 0x6d670126

    xor-int/2addr v6, v7

    const v7, 0x2fecfaec

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v5

    if-ltz v5, :cond_6

    :cond_5
    :goto_3
    const-string v5, "\u06ec\u06e2"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xf2b

    const v7, 0xb41eac3

    xor-int/2addr v6, v7

    const v7, -0x25771736

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06dc\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0xf

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2367

    const v7, 0x5b6210b

    xor-int/2addr v6, v7

    const v7, -0x5daf22ce

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v5, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v5, :cond_7

    goto :goto_4

    :cond_7
    const-string v5, "\u1a7a\u1a76"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x541f

    const v7, -0x7d715e0e

    xor-int/2addr v6, v7

    const v7, -0x3fe4db3c

    goto/16 :goto_0

    .line 30
    :sswitch_e
    sget v5, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v5, :cond_8

    goto :goto_4

    :cond_8
    const-string v5, "\u073f\u06d9"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x3d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x56db

    const v7, 0x2ac51e6e

    xor-int/2addr v6, v7

    const v7, -0x2e78834c

    goto/16 :goto_0

    .line 141
    :sswitch_f
    sget v5, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v5, :cond_9

    :goto_4
    const-string v5, "\u1a78\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x571

    const v7, 0x25235275

    xor-int/2addr v6, v7

    const v7, -0x2251d206

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06e1\u0730"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x27bd

    const v7, 0x21c3ffd1

    xor-int/2addr v6, v7

    const v7, -0x4bf9ce0e

    goto/16 :goto_0

    .line 10
    :sswitch_10
    sget v5, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v5, :cond_a

    goto :goto_5

    :cond_a
    const-string v5, "\u06df\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5f37

    const v7, 0x32e30b13

    xor-int/2addr v6, v7

    const v7, -0x1f46a890

    goto/16 :goto_0

    .line 71
    :sswitch_11
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v5

    if-eqz v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u06d8\u06db"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1c49

    const v7, 0x7e319874

    xor-int/2addr v6, v7

    const v7, 0x7d4f699f

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06e7\u0736"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x178d

    const v7, 0x168cbefe

    xor-int/2addr v6, v7

    const v7, 0x3e8731df

    goto/16 :goto_0

    .line 16
    :sswitch_12
    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v5, :cond_e

    :cond_d
    :goto_6
    const-string v5, "\u073f\u1a75"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x13

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x26dd

    const v7, 0x31f8a973

    xor-int/2addr v6, v7

    const v7, 0x41f12629

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u1a77\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x13c5

    const v7, -0x7d589fe1

    xor-int/2addr v6, v7

    const v7, -0x79f4da2d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7afa6e9b -> :sswitch_f
        -0x703fbc29 -> :sswitch_1
        -0x6b7df825 -> :sswitch_a
        -0x63e055ac -> :sswitch_3
        -0x5a5bbd6a -> :sswitch_c
        -0x55738c00 -> :sswitch_c
        -0x5056a5af -> :sswitch_8
        -0x454c6c48 -> :sswitch_7
        -0x40cbe32e -> :sswitch_1
        -0x399e739e -> :sswitch_8
        -0x3003c6e8 -> :sswitch_12
        -0x2ee4bc8d -> :sswitch_0
        -0x2e8396d2 -> :sswitch_5
        -0x2bb7bcff -> :sswitch_4
        -0x1ec958ea -> :sswitch_4
        -0xebde6dd -> :sswitch_9
        -0x9557295 -> :sswitch_10
        0x42cca3 -> :sswitch_2
        0x731e917 -> :sswitch_0
        0x8ccfebf -> :sswitch_b
        0x1170b5fc -> :sswitch_d
        0x14ced059 -> :sswitch_9
        0x1e5374b6 -> :sswitch_a
        0x2b29a657 -> :sswitch_7
        0x33076c1d -> :sswitch_3
        0x3c2d701f -> :sswitch_e
        0x3fa9d1b2 -> :sswitch_12
        0x405f4709 -> :sswitch_6
        0x42845610 -> :sswitch_11
        0x42b7608d -> :sswitch_f
        0x48e8c3bf -> :sswitch_5
        0x4a4b802c -> :sswitch_2
        0x5010682b -> :sswitch_e
        0x5444ad06 -> :sswitch_b
        0x5b3bc59e -> :sswitch_10
        0x621e9b20 -> :sswitch_11
        0x6f50024f -> :sswitch_6
        0x77ed8724 -> :sswitch_d
    .end sparse-switch
.end method

.method public static ۙ(Landroid/app/Activity;IZ)V
    .locals 6

    const v0, -0x5f10452f

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    sget v2, Ll/ۗ᩺;->ۢۜ᩶:I

    const-string v3, "\u06e7\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5a33

    const v5, 0x1c364f44

    xor-int/2addr v4, v5

    const v5, -0x2b9bfa03

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x19eb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 7
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_9

    goto/16 :goto_4

    .line 96
    :sswitch_0
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-nez v3, :cond_6

    goto :goto_1

    .line 115
    :sswitch_1
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-nez v3, :cond_8

    goto/16 :goto_5

    .line 91
    :sswitch_2
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v3

    if-lez v3, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_1
    const-string v3, "\u1a78\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xe57

    const v5, -0x563eec12    # -8.574379E-14f

    xor-int/2addr v4, v5

    const v5, 0x63284ab9

    goto :goto_0

    .line 46
    :sswitch_3
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    return-void

    .line 143
    :sswitch_5
    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    goto/16 :goto_2

    .line 140
    :sswitch_6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-static {v3, p1}, Ll/᩶᩵ۘ;->ܰ(Landroid/content/res/Configuration;I)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06d8\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6f0f

    const v5, -0x4ff883ba

    xor-int/2addr v4, v5

    const v5, 0x6881490f

    goto :goto_0

    .line 137
    :sswitch_7
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u0736\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xea1

    const v5, 0x49102268    # 590374.5f

    xor-int/2addr v4, v5

    const v5, -0x2d1f25f4

    goto/16 :goto_0

    .line 144
    :sswitch_8
    sget-object v3, Ll/ܽܺۘ;->᩹:Landroid/content/SharedPreferences;

    .line 137
    invoke-static {p0}, Ll/ۘ֡;->᩻۟۬(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "\u06d9\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4e89

    const v5, -0x420722e9

    xor-int/2addr v4, v5

    const v5, 0x1de72f8f

    goto/16 :goto_0

    .line 134
    :sswitch_9
    sget v3, Ll/᩶᩵ۘ;->ᩴۙ:I

    .line 144
    sget-object v3, Ll/ܽܺۘ;->᩹:Landroid/content/SharedPreferences;

    if-eqz v3, :cond_3

    const-string v3, "\u1a77\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x19cf

    const v5, -0x55e1ffdf

    xor-int/2addr v4, v5

    const v5, 0x5ce1147a

    goto/16 :goto_0

    :sswitch_a
    return-void

    :sswitch_b
    if-eqz p2, :cond_3

    const-string v3, "\u06db\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x14cf

    const v5, -0x10af8d68

    xor-int/2addr v4, v5

    const v5, 0x73519c7c

    goto/16 :goto_0

    :cond_3
    :goto_2
    const-string v3, "\u1a7b\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7753

    const v5, -0x8e08e89

    xor-int/2addr v4, v5

    const v5, 0x757a0045

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v3

    if-gtz v3, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v3, "\u06e7\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x77d3

    const v5, -0x2e05347e

    xor-int/2addr v4, v5

    const v5, 0x1b5bc005

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v3

    if-ltz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u06e7\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5e17

    const v5, 0x108a9972

    xor-int/2addr v4, v5

    const v5, -0x31880e90    # -1.0399488E9f

    goto/16 :goto_0

    .line 32
    :sswitch_e
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_7

    :cond_6
    :goto_3
    const-string v3, "\u06d6\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x37a5

    const v5, -0x9c1c50c

    xor-int/2addr v4, v5

    const v5, 0x473d3d39

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a7b\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x349b

    const v5, 0x16dab2c3

    xor-int/2addr v4, v5

    const v5, -0x30f472bb

    goto/16 :goto_0

    :cond_8
    :goto_4
    const-string v3, "\u06dc\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3639

    const v5, -0x75d47321

    xor-int/2addr v4, v5

    const v5, -0x4cefc7a0

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a78\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x151f

    const v5, 0x53ef147d

    xor-int/2addr v4, v5

    const v5, 0x12187b3a

    goto/16 :goto_0

    .line 133
    :sswitch_f
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u06df\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6abd

    const v5, -0x5e62ddc4

    xor-int/2addr v4, v5

    const v5, -0x2dba82c1

    goto/16 :goto_0

    :sswitch_10
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_b

    goto :goto_5

    :cond_b
    const-string v3, "\u06e0\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x124b

    const v5, 0x7ea87c09

    xor-int/2addr v4, v5

    const v5, 0x38e2907a

    goto/16 :goto_0

    .line 85
    :sswitch_11
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_c

    goto :goto_6

    :cond_c
    const-string v3, "\u05ab\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, -0x15

    const v5, 0x55811d6b

    xor-int/2addr v4, v5

    const v5, 0x107cbaa

    goto/16 :goto_0

    .line 81
    :sswitch_12
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_d

    :goto_5
    const-string v3, "\u0733\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x112f

    const v5, -0x57644da4

    xor-int/2addr v4, v5

    const v5, -0x310a0532

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e4\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x73a7

    const v5, 0x5894ec2f

    xor-int/2addr v4, v5

    const v5, 0x7362c4b4

    goto/16 :goto_0

    .line 44
    :sswitch_13
    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v3, :cond_e

    goto :goto_6

    :cond_e
    const-string v3, "\u06df\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4f51

    const v5, 0x2ba147cb

    xor-int/2addr v4, v5

    const v5, -0x2131416e

    goto/16 :goto_0

    .line 139
    :sswitch_14
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_f

    :goto_6
    const-string v3, "\u0730\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xca5

    const v5, 0x667737e3

    xor-int/2addr v4, v5

    const v5, -0x2bd8e994

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u1a7b\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4591

    const v5, 0x1df57a4e

    xor-int/2addr v4, v5

    const v5, 0x34472589

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f78b410 -> :sswitch_13
        -0x756e3d1d -> :sswitch_d
        -0x74383038 -> :sswitch_0
        -0x72ffff8a -> :sswitch_6
        -0x6b7616fa -> :sswitch_12
        -0x63850740 -> :sswitch_e
        -0x60f8f3b9 -> :sswitch_1
        -0x51a62c6d -> :sswitch_d
        -0x50c88d14 -> :sswitch_8
        -0x47a74cdb -> :sswitch_c
        -0x3c1f9ffa -> :sswitch_3
        -0x2db79b06 -> :sswitch_0
        -0x24e65da4 -> :sswitch_b
        -0x1df341b5 -> :sswitch_7
        -0x18ab17cd -> :sswitch_5
        0x302132c -> :sswitch_8
        0x83d8e28 -> :sswitch_2
        0xaca6619 -> :sswitch_a
        0x112b8b0f -> :sswitch_c
        0x172114d0 -> :sswitch_1
        0x21e2fda3 -> :sswitch_6
        0x222ebd55 -> :sswitch_4
        0x2515f678 -> :sswitch_5
        0x29d77fd7 -> :sswitch_a
        0x2cb17b0f -> :sswitch_9
        0x3d2a29b8 -> :sswitch_2
        0x4dfb09d8 -> :sswitch_e
        0x52ce8fa6 -> :sswitch_f
        0x54675116 -> :sswitch_f
        0x5a84ea63 -> :sswitch_4
        0x613e317d -> :sswitch_11
        0x62549cd6 -> :sswitch_7
        0x64e84137 -> :sswitch_b
        0x6649bd50 -> :sswitch_11
        0x6ba42583 -> :sswitch_13
        0x6da6643b -> :sswitch_9
        0x7158e4df -> :sswitch_14
        0x7202fc48 -> :sswitch_3
        0x722a684e -> :sswitch_10
        0x7ccf80c1 -> :sswitch_12
        0x7eb420ed -> :sswitch_10
        0x7f9176a4 -> :sswitch_14
    .end sparse-switch
.end method

.method public static ۙ(Landroid/content/Context;)V
    .locals 0

    .line 125
    invoke-static {p0}, Ll/ܰ᩶ۘ;->ܰ(Landroid/content/Context;)V

    .line 126
    invoke-static {}, Ll/۠᩻֨;->ۜ()V

    return-void
.end method

.method public static ۙ(Ll/֡᩺ۘ;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x1c1190c6

    sget v3, Ll/֫;->ܶܺ᩻:I

    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    const-string v5, "\u06ec\u1a79"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x2b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3aad

    const v7, 0x196baf77

    xor-int/2addr v6, v7

    const v7, 0x1ec60fef

    :goto_0
    xor-int/2addr v5, v7

    move-object v7, v0

    :goto_1
    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x1b63

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 85
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    sget-boolean v5, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v5, :cond_b

    goto/16 :goto_2

    .line 48
    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v5

    if-eqz v5, :cond_8

    goto/16 :goto_5

    .line 42
    :sswitch_1
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v5

    if-nez v5, :cond_1

    goto/16 :goto_5

    .line 58
    :sswitch_2
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    goto/16 :goto_2

    .line 51
    :sswitch_3
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    return-void

    .line 93
    :sswitch_4
    invoke-static {p0, v1}, Ll/ۜۧ᩺;->ۙ(Landroid/content/ContextWrapper;Ljava/lang/String;)V

    .line 79
    invoke-static {p0}, Ll/ۜۧ᩺;->ۙ(Landroid/content/ContextWrapper;)V

    return-void

    :sswitch_5
    const/4 v1, 0x0

    .line 2
    sget v5, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v5, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v5, "\u073a\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x21

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5a3b

    const v8, -0x503e1e04

    xor-int/2addr v6, v8

    const v8, -0x5b626896

    goto/16 :goto_6

    .line 75
    :sswitch_6
    invoke-static {v7}, Ll/᩶᩵ۘ;->ۙ(Ll/ᩴ᩺ۘ;)V

    .line 77
    invoke-static {p0}, Ll/ܰ᩶ۘ;->ܰ(Landroid/content/Context;)V

    .line 36
    sget v5, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v5, :cond_2

    :cond_1
    const-string v5, "\u073f\u073a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xb25

    const v8, -0x15b6432b

    xor-int/2addr v6, v8

    const v8, -0x23782683

    goto/16 :goto_6

    :cond_2
    const-string v5, "\u073a\u06da"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7e4f

    const v8, -0x20ae5784

    xor-int/2addr v6, v8

    const v8, 0x42790976

    goto/16 :goto_6

    .line 75
    :sswitch_7
    new-instance v7, Ll/ᩴ᩺ۘ;

    .line 51
    sget v5, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const/4 v5, 0x3

    .line 75
    invoke-direct {v7, v5}, Ll/ᩴ᩺ۘ;-><init>(I)V

    sget v5, Ll/֫;->ܶܺ᩻:I

    if-ltz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u06e0\u1a75"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7f29

    const v8, 0x18509736

    xor-int/2addr v6, v8

    const v8, -0x481b6d29

    goto/16 :goto_6

    .line 74
    :sswitch_8
    invoke-static {}, Ll/᩶᩵ۘ;->ۨ()V

    sget v5, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v5, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v5, "\u0730\u06e1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0xb

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5795

    const v8, -0x7dc15779

    xor-int/2addr v6, v8

    const v8, 0x2fe860cb

    goto/16 :goto_6

    .line 70
    :sswitch_9
    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_6

    goto :goto_3

    :cond_6
    const-string v5, "\u06d6\u06e8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x36a9

    const v8, -0x9d81945

    xor-int/2addr v6, v8

    const v8, -0x6f759728

    goto/16 :goto_6

    .line 13
    :sswitch_a
    sget-boolean v5, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v5, :cond_7

    :goto_2
    const-string v5, "\u06d7\u06e8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3757

    const v8, -0x37ceb8fb

    xor-int/2addr v6, v8

    const v8, 0x4b800b59    # 1.6783026E7f

    goto/16 :goto_6

    :cond_7
    const-string v5, "\u06da\u06e2"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1ff3

    const v8, 0x34975ac8

    xor-int/2addr v6, v8

    const v8, -0x1df3b7ee

    goto/16 :goto_6

    .line 41
    :sswitch_b
    sget v5, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v5, :cond_9

    :cond_8
    :goto_3
    const-string v5, "\u06db\u0733"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7f6b

    const v8, -0x10870079

    xor-int/2addr v6, v8

    const v8, 0x7cfe8583

    goto :goto_6

    :cond_9
    const-string v5, "\u06d9\u1a77"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x27

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6a2d

    const v8, 0x724af36b

    xor-int/2addr v6, v8

    const v8, -0x287c114

    goto :goto_6

    .line 75
    :sswitch_c
    sget-boolean v5, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v5, :cond_a

    :goto_4
    const-string v5, "\u06e2\u05ab"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x71

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6dc3

    const v7, -0x6ba747ad

    xor-int/2addr v6, v7

    const v7, -0x1e7638f9

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a73\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x237b

    const v8, -0x3b5a6c43

    xor-int/2addr v6, v8

    const v8, -0x7c39e85

    goto :goto_6

    .line 73
    :sswitch_d
    invoke-static {}, Ll/ۜۧ᩺;->ۖ()V

    .line 24
    sget v5, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u1a7a\u06d9"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5183

    const v8, 0xc715e4b

    xor-int/2addr v6, v8

    const v8, 0x5a1f484b

    goto :goto_6

    :cond_c
    const-string v5, "\u1a77\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4015

    const v8, -0x4d894bd4

    xor-int/2addr v6, v8

    const v8, 0x29ffdf89

    :goto_6
    xor-int/2addr v5, v8

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7e7d85b6 -> :sswitch_d
        -0x6ec40da1 -> :sswitch_c
        -0x6a3a953c -> :sswitch_a
        -0x67172473 -> :sswitch_1
        -0x5069abe2 -> :sswitch_3
        -0x41f5099e -> :sswitch_2
        -0x3970dd6b -> :sswitch_a
        -0x32159e86 -> :sswitch_c
        -0x24e337e7 -> :sswitch_b
        -0x24434412 -> :sswitch_7
        -0x23ed9f90 -> :sswitch_0
        -0x1ed2585e -> :sswitch_7
        -0xfc104d4 -> :sswitch_d
        -0xec7507b -> :sswitch_8
        -0xd20c85e -> :sswitch_3
        0x91de78 -> :sswitch_b
        0x3645dff -> :sswitch_6
        0x61a16ec -> :sswitch_9
        0x28e3a504 -> :sswitch_5
        0x333a9a42 -> :sswitch_1
        0x372db1e5 -> :sswitch_4
        0x41916a2c -> :sswitch_9
        0x4fda07c4 -> :sswitch_4
        0x53f2f8f4 -> :sswitch_6
        0x54057aaa -> :sswitch_2
        0x70523b96 -> :sswitch_0
        0x749c37bc -> :sswitch_8
        0x7a1b526c -> :sswitch_5
    .end sparse-switch
.end method

.method public static ۨ(Landroid/app/Activity;IZ)V
    .locals 6

    const v0, -0x7a686998

    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    sget v2, Ll/ۖ᩸;->ۨܽ۬:I

    const-string v3, "\u1a78\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7e71

    const v5, 0x2727bee6

    xor-int/2addr v4, v5

    const v5, 0x2c687ab7

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x448f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v3

    if-eqz v3, :cond_7

    goto/16 :goto_3

    :sswitch_0
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_b

    goto/16 :goto_2

    .line 40
    :sswitch_1
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_4

    goto/16 :goto_2

    .line 47
    :sswitch_2
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06d9\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a3b

    const v5, -0x1528e26

    xor-int/2addr v4, v5

    const v5, 0xed005f2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto/16 :goto_2

    .line 11
    :sswitch_4
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    return-void

    .line 99
    :sswitch_5
    invoke-static {p0}, Ll/ۜۧ᩺;->ۙ(Landroid/content/ContextWrapper;)V

    .line 100
    invoke-static {p0, p1, p2}, Ll/ܰ᩶ۘ;->ۙ(Landroid/app/Activity;IZ)V

    return-void

    .line 56
    :sswitch_6
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06ec\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5d89

    const v5, 0x25733d60

    xor-int/2addr v4, v5

    const v5, -0x69a4c413

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06ec\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1745

    const v5, -0x295f31d6

    xor-int/2addr v4, v5

    const v5, -0x6f04d4be

    goto/16 :goto_0

    .line 23
    :sswitch_8
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_3

    :goto_1
    const-string v3, "\u1a77\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7dcb

    const v5, 0x1be74755

    xor-int/2addr v4, v5

    const v5, 0x103b80da

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u073f\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4fcb

    const v5, 0x110aa2b8

    xor-int/2addr v4, v5

    const v5, 0x42f45bcf

    goto/16 :goto_0

    .line 96
    :sswitch_9
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_5

    :cond_4
    const-string v3, "\u073f\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xc8f

    const v5, -0x193dd61e

    xor-int/2addr v4, v5

    const v5, 0x3036a71a

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a79\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2ae3

    const v5, 0x5dd44aec

    xor-int/2addr v4, v5

    const v5, -0x1883415

    goto/16 :goto_0

    .line 31
    :sswitch_a
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u06eb\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xf93

    const v5, 0x4f248536

    xor-int/2addr v4, v5

    const v5, 0x6750dcea

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d7\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x77b3

    const v5, 0x42581024

    xor-int/2addr v4, v5

    const v5, -0x431ed782

    goto/16 :goto_0

    .line 90
    :sswitch_b
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_8

    :goto_2
    const-string v3, "\u06d8\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x684f

    const v5, 0x23f442aa

    xor-int/2addr v4, v5

    const v5, -0x4df56acb

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0733\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x638b

    const v5, -0x65db5204

    xor-int/2addr v4, v5

    const v5, 0x12804e9a

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u1a7b\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x22f3

    const v5, 0x1eff05a1

    xor-int/2addr v4, v5

    const v5, 0x2474a6db

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u06d9\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7099

    const v5, 0x47ba9fb4

    xor-int/2addr v4, v5

    const v5, -0x70703dfe

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u06d9\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6297

    const v5, -0x1109865e

    xor-int/2addr v4, v5

    const v5, 0x6d5e8f35

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06dc\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x969

    const v5, 0xc2f8f76

    xor-int/2addr v4, v5

    const v5, -0x1d0ba899

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6e9e6bca -> :sswitch_0
        -0x68eb5ecd -> :sswitch_a
        -0x66b23f4b -> :sswitch_9
        -0x62338f42 -> :sswitch_6
        -0x6025a0cb -> :sswitch_7
        -0x56b72a4a -> :sswitch_7
        -0x4d411496 -> :sswitch_9
        -0x44bc8cf7 -> :sswitch_e
        -0x42c0fc8a -> :sswitch_a
        -0x3c2f745c -> :sswitch_1
        -0x39c56d12 -> :sswitch_3
        -0x36b5b240 -> :sswitch_0
        -0x2de2c6f4 -> :sswitch_5
        -0x2475ca69 -> :sswitch_2
        -0x22e62e80 -> :sswitch_5
        -0x1eb277c6 -> :sswitch_4
        -0xe668980 -> :sswitch_b
        -0xd4541a6 -> :sswitch_1
        -0xabb3352 -> :sswitch_4
        0x20531af -> :sswitch_c
        0x411dcd6 -> :sswitch_e
        0x948cd11 -> :sswitch_d
        0x10168d63 -> :sswitch_b
        0x2776cf7e -> :sswitch_8
        0x2b9a6e23 -> :sswitch_8
        0x4bcad95b -> :sswitch_c
        0x543bc2ba -> :sswitch_3
        0x6f029d5e -> :sswitch_2
        0x70a293c7 -> :sswitch_d
        0x7b478354 -> :sswitch_6
    .end sparse-switch
.end method

.method public static ܰ(Landroid/app/Activity;IZ)V
    .locals 6

    const v0, -0x7b4b0ce8

    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    sget v2, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v3, "\u06e4\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x64e7

    const v5, -0x19531de6

    xor-int/2addr v4, v5

    const v5, -0x6994cc49    # -1.8999467E-25f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x5d73

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 20
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_8

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v3

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06eb\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7d7d

    const v5, -0x17472e56

    xor-int/2addr v4, v5

    const v5, -0x444b10df

    goto :goto_0

    .line 62
    :sswitch_1
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez v3, :cond_9

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_b

    goto/16 :goto_1

    .line 82
    :sswitch_3
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    return-void

    .line 117
    :sswitch_5
    invoke-static {p0}, Ll/ۜۧ᩺;->ۙ(Landroid/content/ContextWrapper;)V

    .line 118
    invoke-static {p0, p1, p2}, Ll/ܰ᩶ۘ;->ۙ(Landroid/app/Activity;IZ)V

    return-void

    :sswitch_6
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "\u0733\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4331

    const v5, 0x63b6bf04

    xor-int/2addr v4, v5

    const v5, -0x34768137    # -1.8021778E7f

    goto :goto_0

    :cond_1
    const-string v3, "\u1a78\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4039

    const v5, 0x266dfdf9

    xor-int/2addr v4, v5

    const v5, -0x2beb0c67

    goto/16 :goto_0

    .line 51
    :sswitch_7
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06da\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1215

    const v5, 0x7dab023a

    xor-int/2addr v4, v5

    const v5, -0x3250862

    goto/16 :goto_0

    .line 78
    :sswitch_8
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a7a\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x43a5

    const v5, 0x45bda805

    xor-int/2addr v4, v5

    const v5, -0x386740ea

    goto/16 :goto_0

    .line 117
    :sswitch_9
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06d9\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6c8f

    const v5, -0x43e0b534

    xor-int/2addr v4, v5

    const v5, -0x4797cd9f

    goto/16 :goto_0

    .line 95
    :sswitch_a
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    const-string v3, "\u1a74\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6ca7

    const v5, -0x450342f

    xor-int/2addr v4, v5

    const v5, 0x75071b9

    goto/16 :goto_0

    .line 19
    :sswitch_b
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u1a76\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4aab

    const v5, 0xab9ed3a

    xor-int/2addr v4, v5

    const v5, -0x6cc48eee

    goto/16 :goto_0

    .line 102
    :sswitch_c
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_7

    goto :goto_1

    :cond_7
    const-string v3, "\u1a77\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x147f

    const v5, 0xfb4aa18

    xor-int/2addr v4, v5

    const v5, 0x441b5876

    goto/16 :goto_0

    :goto_1
    const-string v3, "\u1a79\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x14d1

    const v5, 0x5cb53bc2

    xor-int/2addr v4, v5

    const v5, -0x527847a7

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06df\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x27ef

    const v5, 0x287a0fa4

    xor-int/2addr v4, v5

    const v5, 0x6a9509a6

    goto/16 :goto_0

    .line 90
    :sswitch_d
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_2
    const-string v3, "\u06e0\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3a3f

    const v5, 0x7de58321

    xor-int/2addr v4, v5

    const v5, -0x525b3ebb

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06ec\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3c1f

    const v5, -0x13e88a7c

    xor-int/2addr v4, v5

    const v5, -0x2d6c3cfe

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u1a78\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x170f

    const v5, -0x21953d17

    xor-int/2addr v4, v5

    const v5, -0x13a3516a

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06dc\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2caf

    const v5, -0x7f48fa9c

    xor-int/2addr v4, v5

    const v5, 0x77eac386

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x643bec03 -> :sswitch_3
        -0x5078147d -> :sswitch_d
        -0x45dbede3 -> :sswitch_c
        -0x43ede129 -> :sswitch_0
        -0x3b582278 -> :sswitch_3
        -0x300c90b4 -> :sswitch_8
        -0x2c2f6c02 -> :sswitch_6
        -0x2b988903 -> :sswitch_6
        -0x25c05727 -> :sswitch_2
        -0x25a48bc8 -> :sswitch_7
        -0xe9a3759 -> :sswitch_1
        -0x442712e -> :sswitch_0
        0xdc4fa3 -> :sswitch_5
        0xe739d8f -> :sswitch_a
        0x136c18be -> :sswitch_8
        0x172a04e5 -> :sswitch_7
        0x1b0ebe5d -> :sswitch_b
        0x1c911ae9 -> :sswitch_c
        0x26b12d83 -> :sswitch_a
        0x2cbfb195 -> :sswitch_9
        0x2df1268e -> :sswitch_e
        0x3383e53f -> :sswitch_b
        0x3a186afe -> :sswitch_d
        0x46da376b -> :sswitch_e
        0x478fa3d4 -> :sswitch_1
        0x6cfbae95 -> :sswitch_2
        0x6fff5c7e -> :sswitch_4
        0x755c5c31 -> :sswitch_9
        0x778fccd7 -> :sswitch_5
        0x7d350389 -> :sswitch_4
    .end sparse-switch
.end method

.method public static ܰ(Landroid/content/Context;)V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x11c503b4

    sget v8, Ll/֫ᩳ;->۬֨᩸:I

    sget v9, Ll/֡᩶;->ۗ֨ܺ:I

    const-string v10, "\u06ec\u1a73"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x7f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0xe3d

    const v12, -0x79ac796d

    xor-int/2addr v11, v12

    const v12, 0x7dfbc0a

    :goto_0
    xor-int/2addr v10, v12

    move-object v12, v3

    :goto_1
    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, -0x2ac3

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    sget v10, Ll/ۖۧ;->ܺۚۖ:I

    if-lez v10, :cond_b

    goto/16 :goto_8

    .line 47
    :sswitch_0
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    sget v10, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v10, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v10, "\u1a78\u06e4"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x53

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2ab1

    const v13, -0x45ff1ff8

    xor-int/2addr v11, v13

    const v13, 0x2de50934

    goto/16 :goto_a

    .line 98
    :sswitch_1
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v10

    if-gtz v10, :cond_7

    goto/16 :goto_9

    :sswitch_2
    sget v10, Ll/۟;->ۨᩴۛ:I

    if-gez v10, :cond_1

    goto/16 :goto_7

    :cond_1
    const-string v10, "\u06d9\u1a74"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5efd

    const v13, -0x56833831

    xor-int/2addr v11, v13

    const v13, 0x2122e316

    goto/16 :goto_a

    .line 25
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget v10, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v10, :cond_13

    goto/16 :goto_6

    .line 22
    :sswitch_4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    sget v10, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v10, :cond_d

    goto/16 :goto_7

    .line 16
    :sswitch_5
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget v10, Ll/֫۟;->᩸ᩴܿ:I

    if-gez v10, :cond_11

    goto :goto_2

    :sswitch_6
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    sget v10, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v10, :cond_f

    goto :goto_2

    .line 165
    :sswitch_7
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    :goto_2
    const-string v10, "\u06d8\u06ec"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x24ef

    const v13, -0x1e3c50bf

    xor-int/2addr v11, v13

    const v13, 0x2f116ab5

    goto/16 :goto_a

    .line 0
    :sswitch_8
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    return-void

    .line 171
    :sswitch_9
    :try_start_0
    new-instance v10, Landroid/content/res/Configuration;

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v11

    invoke-direct {v10, v11}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 172
    invoke-static {v10, v2}, Ll/᩶᩵ۘ;->ۙ(Landroid/content/res/Configuration;I)V

    .line 173
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    invoke-virtual {v4, v10, v11}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :sswitch_a
    if-eqz v6, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v10, "\u06e2\u06db"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x283d

    const v13, 0x7c21b98d

    xor-int/2addr v11, v13

    const v13, -0x53cb37b7

    goto/16 :goto_a

    .line 168
    :sswitch_b
    :try_start_1
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v10

    invoke-static {v10, v2}, Ll/᩶᩵ۘ;->ܰ(Landroid/content/res/Configuration;I)Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v10, "\u0733\u1a77"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x9

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1879

    const v13, -0x39e46b3e

    xor-int/2addr v11, v13

    const v13, 0x64ada7fd

    goto/16 :goto_a

    :sswitch_c
    if-eq v4, v5, :cond_9

    const-string v10, "\u073a\u06dc"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x1b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4b1d

    const v13, -0xdf9102a

    xor-int/2addr v11, v13

    const v13, 0x7ed0e5b8

    goto/16 :goto_a

    .line 156
    :sswitch_d
    :try_start_2
    invoke-static {}, Ll/ܽܺۘ;->۠()Landroid/content/res/Resources;

    move-result-object v4

    .line 157
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v10, "\u06e4\u06e8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x2f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x3a8b

    const v13, -0x40b6830e

    xor-int/2addr v11, v13

    const v13, -0x58bc7bfe

    goto/16 :goto_a

    .line 172
    :sswitch_e
    invoke-static {v12, v2}, Ll/᩶᩵ۘ;->ۙ(Landroid/content/res/Configuration;I)V

    .line 173
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    invoke-virtual {v0, v12, v10}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    goto :goto_3

    .line 171
    :sswitch_f
    new-instance v12, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v10

    .line 148
    sget-boolean v11, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v11, :cond_3

    goto/16 :goto_8

    .line 171
    :cond_3
    invoke-direct {v12, v10}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 41
    sget v10, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v10, :cond_4

    const-string v10, "\u1a73\u06d7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x29

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2b9d

    const v13, 0x4c96c3b1    # 7.9043976E7f

    xor-int/2addr v11, v13

    const v13, -0x78cb4d77

    goto/16 :goto_a

    :cond_4
    const-string v10, "\u06e2\u1a79"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3389

    const v13, 0x210624f0

    xor-int/2addr v11, v13

    const v13, 0x4cce6ec9    # 1.08230216E8f

    goto/16 :goto_a

    :sswitch_10
    const/16 v2, -0x64

    .line 168
    invoke-static {v1, v2}, Ll/᩶᩵ۘ;->ܰ(Landroid/content/res/Configuration;I)Z

    move-result v10

    if-eqz v10, :cond_5

    :goto_3
    const-string v10, "\u06e4\u05a8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1f7f

    const v13, 0xeb002f4

    xor-int/2addr v11, v13

    const v13, 0x9536ee2

    goto/16 :goto_a

    :cond_5
    const-string v10, "\u0736\u05a8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3e5b

    const v13, -0x5a98a804

    xor-int/2addr v11, v13

    const v13, -0x5663e590

    goto/16 :goto_a

    :sswitch_11
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    sget v10, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v10, :cond_6

    goto/16 :goto_7

    :cond_6
    const-string v10, "\u06e0\u06d7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x5133

    const v13, 0x284f20ff

    xor-int/2addr v11, v13

    const v13, 0x2bf07408

    goto/16 :goto_a

    .line 144
    :sswitch_12
    sget-object v0, Ll/ܽܺۘ;->᩹:Landroid/content/SharedPreferences;

    .line 154
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 131
    sget-boolean v10, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v10, :cond_8

    :cond_7
    :goto_4
    const-string v10, "\u06e2\u06df"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4e6f

    const v13, -0x690230ea

    xor-int/2addr v11, v13

    const v13, 0x186554a2

    goto/16 :goto_a

    :cond_8
    const-string v10, "\u0730\u05a8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x63

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2f79

    const v13, 0x2ab35450

    xor-int/2addr v11, v13

    const v13, -0x2bc2fc4

    goto/16 :goto_a

    :sswitch_13
    return-void

    .line 144
    :sswitch_14
    sget-object v10, Ll/ܽܺۘ;->᩹:Landroid/content/SharedPreferences;

    if-eqz v10, :cond_9

    const-string v10, "\u06e2\u1a74"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4f33

    const v13, -0x35f532

    xor-int/2addr v11, v13

    const v13, 0x47af57b1

    goto/16 :goto_a

    :catchall_0
    :cond_9
    :goto_5
    const-string v10, "\u1a75\u073a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x17

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5c2f

    const v13, -0x7be22441

    xor-int/2addr v11, v13

    const v13, 0x6b006657

    goto/16 :goto_a

    .line 115
    :sswitch_15
    sget v10, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v10, :cond_a

    goto :goto_6

    :cond_a
    const-string v10, "\u05ab\u05a1"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x31

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xc01

    const v13, -0x161036d5

    xor-int/2addr v11, v13

    const v13, 0xfb64a95

    goto/16 :goto_a

    :sswitch_16
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v10

    if-eqz v10, :cond_c

    :cond_b
    const-string v10, "\u06d7\u0733"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5571

    const v13, 0xb948f83

    xor-int/2addr v11, v13

    const v13, -0x722744f8

    goto/16 :goto_a

    :cond_c
    const-string v10, "\u1a75\u06e4"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x79

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7ad5

    const v13, 0x115d0dc5

    xor-int/2addr v11, v13

    const v13, -0x3c3c27ae    # -391.69f

    goto/16 :goto_a

    :sswitch_17
    sget v10, Ll/ۗ;->֨۬ۖ:I

    if-ltz v10, :cond_e

    :cond_d
    :goto_6
    const-string v10, "\u06d6\u06db"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4bd7

    const v13, 0x37960d28

    xor-int/2addr v11, v13

    const v13, 0x3219a5ae

    goto/16 :goto_a

    :cond_e
    const-string v10, "\u073d\u1a76"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x23

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5f29

    const v13, 0x19a9e31f

    xor-int/2addr v11, v13

    const v13, 0x1bf1169

    goto/16 :goto_a

    :sswitch_18
    sget v10, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v10, :cond_10

    :cond_f
    :goto_7
    const-string v10, "\u06eb\u06ec"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x31fb

    const v13, 0x4e438f59    # 8.202379E8f

    xor-int/2addr v11, v13

    const v13, -0x6baaa2cd

    goto :goto_a

    :cond_10
    const-string v10, "\u06da\u0733"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0xb17

    const v13, -0xd71adc7

    xor-int/2addr v11, v13

    const v13, 0x4a1ecf60    # 2601944.0f

    goto :goto_a

    .line 153
    :sswitch_19
    sget v10, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v10, :cond_12

    :cond_11
    :goto_8
    const-string v10, "\u073d\u1a79"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x41

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7af3

    const v12, -0x1d91dfa5

    xor-int/2addr v11, v12

    const v12, 0x47bc8ce3

    goto/16 :goto_0

    :cond_12
    const-string v10, "\u1a78\u06e0"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6c6d

    const v13, -0x7a2ffe09

    xor-int/2addr v11, v13

    const v13, -0x30f4794f

    goto :goto_a

    .line 151
    :sswitch_1a
    sget v10, Ll/᩶᩵ۘ;->ᩴۙ:I

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v10

    if-gtz v10, :cond_14

    :cond_13
    :goto_9
    const-string v10, "\u073f\u05ab"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7425

    const v13, -0xdf7f348

    xor-int/2addr v11, v13

    const v13, -0x38c8a888

    goto :goto_a

    :cond_14
    const-string v10, "\u06e7\u1a73"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x13

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1445

    const v13, 0x73757e70

    xor-int/2addr v11, v13

    const v13, -0x4f06f3cd

    :goto_a
    xor-int/2addr v10, v13

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78c98bac -> :sswitch_16
        -0x6d88e681 -> :sswitch_1a
        -0x6c8e54f8 -> :sswitch_8
        -0x64ba3777 -> :sswitch_0
        -0x61484f10 -> :sswitch_3
        -0x5cd06041 -> :sswitch_1a
        -0x5a807c04 -> :sswitch_13
        -0x566314fe -> :sswitch_c
        -0x4a32ebf4 -> :sswitch_1
        -0x4886806e -> :sswitch_d
        -0x487ebc80 -> :sswitch_2
        -0x481bc599 -> :sswitch_14
        -0x465882f9 -> :sswitch_15
        -0x455dfc50 -> :sswitch_11
        -0x40a43b4c -> :sswitch_9
        -0x3ed262e5 -> :sswitch_e
        -0x3cbf109c -> :sswitch_c
        -0x39afe22a -> :sswitch_7
        -0x2ec44d4f -> :sswitch_10
        -0x2ba79e10 -> :sswitch_4
        -0x2a36b2e0 -> :sswitch_13
        -0x239892e3 -> :sswitch_18
        -0x1bbd3740 -> :sswitch_1
        -0x17462ccc -> :sswitch_0
        -0x1057404c -> :sswitch_6
        -0x1043ba0c -> :sswitch_4
        -0x5ed8529 -> :sswitch_15
        -0x4669d3a -> :sswitch_f
        0x10233d4 -> :sswitch_7
        0x19a1312 -> :sswitch_9
        0xb0a585b -> :sswitch_2
        0xe7743e2 -> :sswitch_18
        0x15aa25e7 -> :sswitch_12
        0x1a095e3f -> :sswitch_12
        0x1a3c6562 -> :sswitch_d
        0x210e8985 -> :sswitch_17
        0x248c72be -> :sswitch_b
        0x2edf5837 -> :sswitch_3
        0x370230de -> :sswitch_16
        0x389f7f3b -> :sswitch_10
        0x4272b123 -> :sswitch_a
        0x4b4b49bc -> :sswitch_f
        0x57673cfb -> :sswitch_6
        0x5772863a -> :sswitch_14
        0x595e2b0b -> :sswitch_19
        0x5971c43d -> :sswitch_17
        0x5fa151da -> :sswitch_e
        0x601ce2ef -> :sswitch_5
        0x61a1d397 -> :sswitch_19
        0x66576d18 -> :sswitch_11
        0x7233bb3a -> :sswitch_b
        0x79690865 -> :sswitch_a
        0x7d142c25 -> :sswitch_8
        0x7d63d874 -> :sswitch_5
    .end sparse-switch
.end method

.class public Ll/ۗܺۘ;
.super Landroid/app/Activity;
.source "67G1"


# instance fields
.field public doingOnConfigurationChanged:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x509d9008

    sget v2, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    const-string v4, "\u05a8\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1a9f

    const v6, 0x7c5d35ed

    xor-int/2addr v5, v6

    const v6, 0x379d154d

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x262d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 71
    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v4, :cond_2

    goto/16 :goto_5

    .line 15
    :sswitch_0
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v4

    if-eqz v4, :cond_c

    goto/16 :goto_3

    .line 63
    :sswitch_1
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v4, :cond_a

    goto/16 :goto_3

    :sswitch_2
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v4, :cond_5

    goto/16 :goto_3

    .line 92
    :sswitch_3
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    return-void

    .line 65
    :sswitch_5
    invoke-static {p1, v0}, Ll/᩶᩵ۘ;->ۙ(Landroid/content/res/Configuration;I)V

    goto :goto_1

    .line 62
    :sswitch_6
    sget v4, Ll/᩶᩵ۘ;->ᩴۙ:I

    .line 144
    sget-object v4, Ll/ܽܺۘ;->᩹:Landroid/content/SharedPreferences;

    if-eqz v4, :cond_0

    const-string v4, "\u1a75\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x863

    const v6, 0x15a1a424

    xor-int/2addr v5, v6

    const v6, -0x79901a62    # -4.51196E-35f

    goto :goto_0

    .line 46
    :sswitch_7
    invoke-virtual {p0}, Ll/ۗܺۘ;->getUiConfigNightMode()I

    move-result v0

    invoke-virtual {p0}, Ll/ۗܺۘ;->shouldApplyUiConfigNightMode()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u1a76\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5563

    const v6, 0x4a8e95bf    # 4672223.5f

    xor-int/2addr v5, v6

    const v6, 0x796198f5

    goto :goto_0

    .line 48
    :sswitch_8
    invoke-super {p0, p1}, Landroid/app/Activity;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V

    return-void

    :sswitch_9
    if-eqz p1, :cond_0

    const-string v4, "\u05a1\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2279

    const v6, -0x54f284a4

    xor-int/2addr v5, v6

    const v6, -0x66f5a74

    goto/16 :goto_0

    :cond_0
    :goto_1
    const-string v4, "\u073a\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3b7f

    const v6, -0x57505398

    xor-int/2addr v5, v6

    const v6, 0x7f7ce37b

    goto/16 :goto_0

    .line 128
    :sswitch_a
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    const-string v4, "\u06dc\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7f23

    const v6, 0x629c1a9e

    xor-int/2addr v5, v6

    const v6, -0x26e17bc9

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u073a\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3c9f

    const v6, -0x7e40bcf7

    xor-int/2addr v5, v6

    const v6, -0x1c523bcc

    goto/16 :goto_0

    .line 65
    :sswitch_b
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u073d\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x20f9

    const v6, -0x12e6c3fd

    xor-int/2addr v5, v6

    const v6, -0x78278f90

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_4

    :goto_2
    const-string v4, "\u06d6\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7a9d

    const v6, -0x3d4f6b85    # -88.29f

    xor-int/2addr v5, v6

    const v6, -0x61171eab

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06da\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x10ed

    const v6, -0x3b4cadc7

    xor-int/2addr v5, v6

    const v6, -0x1d3a8ac3

    goto/16 :goto_0

    .line 72
    :sswitch_d
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v4

    if-gtz v4, :cond_6

    :cond_5
    const-string v4, "\u1a77\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3ce1

    const v6, -0x413f2f6d

    xor-int/2addr v5, v6

    const v6, 0x75cd9e34

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u0733\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x13d7

    const v6, 0x402dddb0

    xor-int/2addr v5, v6

    const v6, -0x288920c5

    goto/16 :goto_0

    .line 99
    :sswitch_e
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_7

    :goto_3
    const-string v4, "\u1a76\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1a7

    const v6, -0x6d3fb143

    xor-int/2addr v5, v6

    const v6, -0x548dcdd

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06db\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7431

    const v6, 0x3458fc06

    xor-int/2addr v5, v6

    const v6, -0x94bb0da

    goto/16 :goto_0

    .line 129
    :sswitch_f
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v4

    if-gtz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u073a\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7ca9

    const v6, 0x558d7484

    xor-int/2addr v5, v6

    const v6, -0x5c8249e

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v4

    if-gtz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u1a75\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x72c7

    const v6, -0x83d5e53

    xor-int/2addr v5, v6

    const v6, 0x4c43367d    # 5.1173876E7f

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v4, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u1a75\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x56c5

    const v6, -0x7cbb9b1c

    xor-int/2addr v5, v6

    const v6, -0x372a3922

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06d7\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x751

    const v6, -0x3fd3f562

    xor-int/2addr v5, v6

    const v6, -0x31220aec

    goto/16 :goto_0

    .line 65
    :sswitch_12
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v4

    if-eqz v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u06eb\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3ce7

    const v6, 0x6a5fdb2f

    xor-int/2addr v5, v6

    const v6, -0x7b8b9ebc

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a77\u06df"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x29d7

    const v6, 0x3bdc73c6

    xor-int/2addr v5, v6

    const v6, -0x4324ff4a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6ec2d875 -> :sswitch_10
        -0x6bf9fbec -> :sswitch_d
        -0x6b572e31 -> :sswitch_e
        -0x68c93e66 -> :sswitch_2
        -0x652d8240 -> :sswitch_f
        -0x628db168 -> :sswitch_e
        -0x4d7e558f -> :sswitch_5
        -0x43b2fdae -> :sswitch_a
        -0x3f50348d -> :sswitch_c
        -0x3b5f7b1a -> :sswitch_9
        -0x207d40b9 -> :sswitch_12
        -0x19ce418e -> :sswitch_8
        -0x138d5f74 -> :sswitch_1
        0xcf44e7 -> :sswitch_8
        0xbbd32b7 -> :sswitch_b
        0x107c1b77 -> :sswitch_5
        0x12c00aa2 -> :sswitch_1
        0x1439c83a -> :sswitch_c
        0x2682ea29 -> :sswitch_6
        0x2a2e996e -> :sswitch_3
        0x2db27e1d -> :sswitch_10
        0x30700619 -> :sswitch_0
        0x359c5067 -> :sswitch_f
        0x37c5dbef -> :sswitch_2
        0x38960689 -> :sswitch_11
        0x3f8085af -> :sswitch_11
        0x40defddc -> :sswitch_9
        0x45683471 -> :sswitch_d
        0x50f5ba1e -> :sswitch_3
        0x587230b7 -> :sswitch_7
        0x5d9078db -> :sswitch_7
        0x622626bd -> :sswitch_b
        0x66438499 -> :sswitch_12
        0x6bdb61f7 -> :sswitch_4
        0x6d463551 -> :sswitch_4
        0x6e526fba -> :sswitch_a
        0x7058f266 -> :sswitch_0
        0x72bca547 -> :sswitch_6
    .end sparse-switch
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0xedf7ee4

    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    const-string v4, "\u06da\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x19b9

    const v6, -0x6b6209df

    xor-int/2addr v5, v6

    const v6, -0x5058ea9d

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0xb7d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 36
    invoke-virtual {p0}, Ll/ۗܺۘ;->getUiConfigNightMode()I

    move-result v0

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "\u06d6\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x50d7

    const v6, -0xe63f5c2

    xor-int/2addr v5, v6

    const v6, 0x345dfe7d

    goto :goto_0

    :sswitch_0
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v4

    if-eqz v4, :cond_9

    goto/16 :goto_1

    .line 29
    :sswitch_1
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_b

    goto/16 :goto_1

    .line 19
    :sswitch_2
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u1a7b\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3765

    const v6, -0x81cfacf

    xor-int/2addr v5, v6

    const v6, -0x6314ce68

    goto :goto_0

    .line 26
    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    return-void

    .line 36
    :sswitch_5
    invoke-virtual {p0}, Ll/ۗܺۘ;->shouldApplyUiConfigNightMode()Z

    move-result v1

    invoke-static {p1, v0, v1}, Ll/ܰ᩶ۘ;->ۙ(Landroid/content/Context;IZ)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    return-void

    :cond_1
    const-string v4, "\u073d\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2bcd

    const v6, -0x538f5bbd

    xor-int/2addr v5, v6

    const v6, -0x6ed65a81

    goto :goto_0

    .line 16
    :sswitch_6
    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v4, "\u06e2\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5749

    const v6, -0xbf94ad9

    xor-int/2addr v5, v6

    const v6, -0x18d26a22

    goto/16 :goto_0

    .line 4
    :sswitch_7
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u05a8\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x27

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5b83

    const v6, 0x1480da8a

    xor-int/2addr v5, v6

    const v6, -0x73cea0a6

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u06ec\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x21bf

    const v6, 0x4d7e9260

    xor-int/2addr v5, v6

    const v6, -0x73be5317

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v4

    if-gtz v4, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v4, "\u06d6\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x231d

    const v6, -0x58255a58

    xor-int/2addr v5, v6

    const v6, -0x38e43a9

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u1a74\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6e9

    const v6, 0x566d618b    # 6.52508E13f

    xor-int/2addr v5, v6

    const v6, 0x4d9915b5    # 3.2104208E8f

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_7

    :goto_1
    const-string v4, "\u1a76\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x23db

    const v6, -0x7043cfa6

    xor-int/2addr v5, v6

    const v6, -0x57ee4586

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a7b\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x185f

    const v6, -0x65318ec3

    xor-int/2addr v5, v6

    const v6, 0x1d90b8e7

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v4, :cond_8

    goto :goto_2

    :cond_8
    const-string v4, "\u1a74\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5b39

    const v6, 0x1a998bff

    xor-int/2addr v5, v6

    const v6, 0x4c1ead94    # 4.1596496E7f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v4

    if-gtz v4, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u1a76\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x109b

    const v6, -0x5144ec44

    xor-int/2addr v5, v6

    const v6, 0x132680d

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d8\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x105b

    const v6, -0x1c402400

    xor-int/2addr v5, v6

    const v6, -0x494d8d80

    goto/16 :goto_0

    .line 25
    :sswitch_e
    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_3
    const-string v4, "\u1a77\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6375

    const v6, -0x6a17e0a4

    xor-int/2addr v5, v6

    const v6, -0xa256b54

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u0736\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x58ed

    const v6, -0x747d1b57

    xor-int/2addr v5, v6

    const v6, -0x7d26d260

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6f81839e -> :sswitch_c
        -0x5fccb966 -> :sswitch_1
        -0x5d7eaf54 -> :sswitch_9
        -0x50b0a4f6 -> :sswitch_b
        -0x4b069049 -> :sswitch_2
        -0x4876049b -> :sswitch_4
        -0x3b965486 -> :sswitch_6
        -0x37080a14 -> :sswitch_d
        -0x369d0568 -> :sswitch_a
        -0x34b60f82 -> :sswitch_7
        -0x2dec61ff -> :sswitch_a
        -0x26885038 -> :sswitch_d
        -0x1faca889 -> :sswitch_4
        -0x1c15d7f4 -> :sswitch_8
        -0x1963ec75 -> :sswitch_3
        -0x15bd2a29 -> :sswitch_2
        -0x1367c4c0 -> :sswitch_9
        -0xb5c4158 -> :sswitch_6
        0x2344199 -> :sswitch_1
        0x9492ac2 -> :sswitch_5
        0xbe3bf5b -> :sswitch_7
        0xea5ee08 -> :sswitch_e
        0xf5cd04e -> :sswitch_b
        0x13af7e69 -> :sswitch_3
        0x20b744a0 -> :sswitch_e
        0x2bc65e82 -> :sswitch_0
        0x2fe989e0 -> :sswitch_8
        0x302b578b -> :sswitch_5
        0x3e181434 -> :sswitch_0
        0x56c71dc0 -> :sswitch_c
    .end sparse-switch
.end method

.method public getUiConfigNightMode()I
    .locals 1

    const/16 v0, -0x64

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x74ac7f57

    sget v3, Ll/ۧ;->֫۠ᩴ:I

    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    const-string v5, "\u073f\u073a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1bbd

    const v7, -0x3d185fb5

    xor-int/2addr v6, v7

    const v7, 0x659f1d6c

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x42cb

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget-boolean v5, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v5, :cond_2

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v5, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez v5, :cond_a

    goto/16 :goto_3

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_5

    .line 51
    :sswitch_2
    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v5, :cond_c

    goto :goto_1

    .line 9
    :sswitch_3
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    :goto_1
    const-string v5, "\u073f\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x7f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x35b9

    const v7, 0x5581af12

    xor-int/2addr v6, v7

    const v7, 0x11693061

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    return-void

    .line 74
    :sswitch_5
    iput-boolean v0, p0, Ll/ۗܺۘ;->doingOnConfigurationChanged:Z

    return-void

    :sswitch_6
    iput-boolean v0, p0, Ll/ۗܺۘ;->doingOnConfigurationChanged:Z

    .line 75
    throw v1

    .line 109
    :sswitch_7
    :try_start_0
    invoke-static {}, Ll/᩶᩵ۘ;->ۙ()V

    .line 71
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 72
    invoke-virtual {p0}, Ll/ۗܺۘ;->getUiConfigNightMode()I

    move-result v5

    invoke-virtual {p0}, Ll/ۗܺۘ;->shouldApplyUiConfigNightMode()Z

    move-result v6

    invoke-static {p0, v5, v6}, Ll/ܰ᩶ۘ;->ܰ(Landroid/app/Activity;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "\u073a\u06d7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x666b

    const v7, 0x6d3ff25f

    xor-int/2addr v6, v7

    const v7, 0x60dab99b

    goto :goto_0

    :catchall_0
    move-exception v1

    const-string v5, "\u1a74\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit8 v6, v6, 0x71

    const v7, -0x4d6d95bb

    xor-int/2addr v6, v7

    const v7, -0x2e78932f

    goto/16 :goto_0

    :sswitch_8
    return-void

    :sswitch_9
    const/4 v0, 0x1

    .line 68
    iput-boolean v0, p0, Ll/ۗܺۘ;->doingOnConfigurationChanged:Z

    const/4 v0, 0x0

    const-string v5, "\u05a1\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3f2b

    const v7, -0x6a51efcf

    xor-int/2addr v6, v7

    const v7, 0x5b99a8b9

    goto/16 :goto_0

    .line 65
    :sswitch_a
    iget-boolean v5, p0, Ll/ۗܺۘ;->doingOnConfigurationChanged:Z

    if-eqz v5, :cond_0

    const-string v5, "\u073a\u0733"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x19

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7f7b

    const v7, 0x78d5000

    xor-int/2addr v6, v7

    const v7, -0x1e8269e4

    goto/16 :goto_0

    :cond_0
    const-string v5, "\u05ab\u06da"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x71

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x49a5

    const v7, -0xb132634

    xor-int/2addr v6, v7

    const v7, 0x5a49da41

    goto/16 :goto_0

    .line 18
    :sswitch_b
    sget v5, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v5, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v5, "\u06d6\u1a7b"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2689

    const v7, 0x4fc35e89

    xor-int/2addr v6, v7

    const v7, -0x19bc1863

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u05a8\u0736"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3a05

    const v7, 0x1190c303

    xor-int/2addr v6, v7

    const v7, -0x2fa0a1e7

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v5, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u1a77\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4d55

    const v7, -0x7aa03acf

    xor-int/2addr v6, v7

    const v7, -0x13920620

    goto/16 :goto_0

    .line 99
    :sswitch_d
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v5

    if-eqz v5, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v5, "\u1a7a\u0730"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7563

    const v7, 0x2d730a5b

    xor-int/2addr v6, v7

    const v7, 0x118d7d3a

    goto/16 :goto_0

    .line 47
    :sswitch_e
    sget v5, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v5, :cond_5

    goto :goto_2

    :cond_5
    const-string v5, "\u0736\u0736"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7e07

    const v7, -0x60284b8c

    xor-int/2addr v6, v7

    const v7, -0x35304c0c    # -6806010.0f

    goto/16 :goto_0

    .line 102
    :sswitch_f
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v5

    if-eqz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u06dc\u06df"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0xb

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1c15

    const v7, -0x35af4e07

    xor-int/2addr v6, v7

    const v7, 0x25461032

    goto/16 :goto_0

    .line 32
    :sswitch_10
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_7

    :goto_2
    const-string v5, "\u06e4\u06da"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x34db

    const v7, 0x57bff5bb

    xor-int/2addr v6, v7

    const v7, -0xe374053

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06df\u0730"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x57

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6bc1

    const v7, -0x465720f

    xor-int/2addr v6, v7

    const v7, -0x2b0f9b4d

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    :goto_3
    const-string v5, "\u1a79\u1a77"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xc97

    const v7, -0x586e64ec

    xor-int/2addr v6, v7

    const v7, 0xe342007

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u1a73\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x7

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x26bb

    const v7, -0x5cb15268

    xor-int/2addr v6, v7

    const v7, 0x38a88878

    goto/16 :goto_0

    .line 19
    :sswitch_12
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v5

    if-gtz v5, :cond_b

    :cond_a
    :goto_4
    const-string v5, "\u06dc\u06e7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x43

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xbed

    const v7, 0x6d297ce4

    xor-int/2addr v6, v7

    const v7, 0x1fadf3b6

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u073f\u1a78"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4d35

    const v7, 0x4f8b8a0b

    xor-int/2addr v6, v7

    const v7, -0x6e3d065a

    goto/16 :goto_0

    :sswitch_13
    sget-boolean v5, Ll/᩶;->ۚۤۘ:Z

    if-eqz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u06eb\u1a79"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x67

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1519

    const v7, -0x4132494e

    xor-int/2addr v6, v7

    const v7, 0x317eea13

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a78\u06da"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x19

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6459

    const v7, -0x78791971

    xor-int/2addr v6, v7

    const v7, -0x49cfb5f4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b81a5e3 -> :sswitch_1
        -0x6546a029 -> :sswitch_c
        -0x578072f5 -> :sswitch_5
        -0x569d5c01 -> :sswitch_12
        -0x51754559 -> :sswitch_c
        -0x4fdf7c04 -> :sswitch_a
        -0x4e8a2120 -> :sswitch_10
        -0x4aa17bc7 -> :sswitch_1
        -0x491dfbd1 -> :sswitch_a
        -0x385e7745 -> :sswitch_11
        -0x2cd5d787 -> :sswitch_d
        -0x2c6a6733 -> :sswitch_4
        -0x2ac4b2d7 -> :sswitch_f
        -0x26d05560 -> :sswitch_6
        -0x2564f924 -> :sswitch_13
        -0x20c71b49 -> :sswitch_4
        -0x194ebb00 -> :sswitch_8
        -0x19ee616 -> :sswitch_10
        -0x293a22 -> :sswitch_11
        0x11f225ed -> :sswitch_12
        0x12b9c2d7 -> :sswitch_7
        0x14201c6e -> :sswitch_3
        0x192541f3 -> :sswitch_3
        0x25a82b73 -> :sswitch_13
        0x461b3d1e -> :sswitch_8
        0x4ecc9fb0 -> :sswitch_0
        0x4fd1a446 -> :sswitch_5
        0x550f57c8 -> :sswitch_e
        0x5854e51d -> :sswitch_2
        0x5cb70296 -> :sswitch_0
        0x5cf5ac50 -> :sswitch_2
        0x65b674b2 -> :sswitch_d
        0x684288c6 -> :sswitch_9
        0x6c849047 -> :sswitch_e
        0x6e72699a -> :sswitch_b
        0x6e80de3c -> :sswitch_6
        0x6f5b14fc -> :sswitch_b
        0x708689f8 -> :sswitch_f
        0x72d10bc3 -> :sswitch_7
        0x78095aa2 -> :sswitch_9
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x61a73017

    sget v2, Ll/ۗ;->֨۬ۖ:I

    sget v3, Ll/ۧ;->֫۠ᩴ:I

    const-string v4, "\u1a7a\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x588d

    const v6, -0x7abaffa2

    xor-int/2addr v5, v6

    const v6, 0x36a78a5f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x3f97

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_9

    goto/16 :goto_4

    .line 48
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v4, :cond_b

    goto/16 :goto_3

    .line 28
    :sswitch_1
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v4

    if-gtz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v4, "\u06e8\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x284f

    const v6, -0x709fd93e

    xor-int/2addr v5, v6

    const v6, -0x40927485

    goto :goto_0

    .line 40
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    return-void

    .line 56
    :sswitch_5
    invoke-virtual {p0}, Ll/ۗܺۘ;->shouldApplyUiConfigNightMode()Z

    move-result v1

    invoke-static {p0, v0, v1}, Ll/ܰ᩶ۘ;->ۨ(Landroid/app/Activity;IZ)V

    .line 57
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    return-void

    .line 56
    :sswitch_6
    invoke-virtual {p0}, Ll/ۗܺۘ;->getUiConfigNightMode()I

    move-result v0

    .line 48
    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_1

    goto :goto_2

    :cond_1
    const-string v4, "\u06eb\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x293b

    const v6, 0x7384f07b

    xor-int/2addr v5, v6

    const v6, 0x358e6a12

    goto :goto_0

    .line 4
    :sswitch_7
    sget-boolean v4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v4, "\u06d9\u05ab"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x467f

    const v6, 0xbedb309

    xor-int/2addr v5, v6

    const v6, -0x7187dd94

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_3

    :goto_2
    const-string v4, "\u05ab\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4b91

    const v6, -0x5417c5cf

    xor-int/2addr v5, v6

    const v6, -0x283b9271

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u073d\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3eb

    const v6, 0x2d540083

    xor-int/2addr v5, v6

    const v6, -0x398b53c1

    goto/16 :goto_0

    .line 16
    :sswitch_9
    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "\u1a74\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x79

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x14c7

    const v6, 0x320789e0

    xor-int/2addr v5, v6

    const v6, 0x6d5b9530

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    const-string v4, "\u073f\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x463

    const v6, -0x20ab784

    xor-int/2addr v5, v6

    const v6, -0x3ea24fe2

    goto/16 :goto_0

    .line 32
    :sswitch_b
    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v4, :cond_6

    goto :goto_4

    :cond_6
    const-string v4, "\u06e8\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x514b

    const v6, -0x595f670e

    xor-int/2addr v5, v6

    const v6, -0x698ce840

    goto/16 :goto_0

    .line 16
    :sswitch_c
    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v4, :cond_7

    :goto_3
    const-string v4, "\u05ab\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x22d7

    const v6, -0x2b60a35a

    xor-int/2addr v5, v6

    const v6, 0x7eb412cb

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u05ab\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2e1f

    const v6, -0x25a2cd89

    xor-int/2addr v5, v6

    const v6, -0x2714d233

    goto/16 :goto_0

    :cond_8
    :goto_4
    const-string v4, "\u06eb\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3be3

    const v6, 0x18387525

    xor-int/2addr v5, v6

    const v6, -0x4fe0d7b4

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06df\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1d55

    const v6, 0x76240339

    xor-int/2addr v5, v6

    const v6, 0x1c4e8d12

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v4, :cond_a

    goto :goto_5

    :cond_a
    const-string v4, "\u1a77\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1437

    const v6, 0x35e199c2

    xor-int/2addr v5, v6

    const v6, -0x4bcd2cd3

    goto/16 :goto_0

    .line 48
    :sswitch_e
    sget-boolean v4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u0733\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7cef

    const v6, 0x5395acde

    xor-int/2addr v5, v6

    const v6, -0x1d58c1ad

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7a\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7367

    const v6, 0x43ab076

    xor-int/2addr v5, v6

    const v6, -0x75b145ac

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cfadcca -> :sswitch_1
        -0x765f4e9f -> :sswitch_4
        -0x6c8f0668 -> :sswitch_e
        -0x6156e358 -> :sswitch_c
        -0x5840ca83 -> :sswitch_1
        -0x57cff8bc -> :sswitch_8
        -0x51418f19 -> :sswitch_c
        -0x4422cc45 -> :sswitch_9
        -0x27b9b167 -> :sswitch_8
        -0x25dfb26a -> :sswitch_a
        -0x251a87b3 -> :sswitch_b
        -0x1db1266e -> :sswitch_a
        -0x1020ea8e -> :sswitch_5
        -0xf5786ca -> :sswitch_d
        -0xd64f5fd -> :sswitch_7
        -0xb2c0816 -> :sswitch_3
        0x8865bdc -> :sswitch_d
        0xd9d4504 -> :sswitch_3
        0xf1b0947 -> :sswitch_2
        0x1f36884e -> :sswitch_b
        0x2f301a87 -> :sswitch_4
        0x317c07f5 -> :sswitch_6
        0x4c1338a5 -> :sswitch_0
        0x4fb54e29 -> :sswitch_2
        0x5c17a789 -> :sswitch_e
        0x6534c9ec -> :sswitch_0
        0x6c72246d -> :sswitch_5
        0x73ad4512 -> :sswitch_9
        0x7484446a -> :sswitch_7
        0x76595a69 -> :sswitch_6
    .end sparse-switch
.end method

.method public shouldApplyUiConfigNightMode()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

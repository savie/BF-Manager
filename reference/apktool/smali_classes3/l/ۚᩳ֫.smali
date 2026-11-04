.class public final synthetic Ll/ۚᩳ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܰ:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚᩳ֫;->ܰ:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7

    const/4 v0, 0x0

    const v1, -0x4226b28e

    sget v2, Ll/ۖۗ;->᩻ܳܶ:I

    sget v3, Ll/֫֨;->᩶ܺۡ:I

    const-string v4, "\u05a8\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x55a5

    const v6, 0x6489586b

    xor-int/2addr v5, v6

    const v6, 0x236f2c17

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x77fb

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 1047
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v4, :cond_2

    goto :goto_1

    .line 2274
    :sswitch_0
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u1a7a\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5ceb

    const v6, 0x42f5d2d

    xor-int/2addr v5, v6

    const v6, -0x6721b380

    goto :goto_0

    .line 300
    :sswitch_1
    sget v4, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v4, :cond_a

    goto/16 :goto_4

    :sswitch_2
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-nez v4, :cond_6

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto/16 :goto_4

    .line 1585
    :sswitch_4
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    const/4 p1, 0x0

    return p1

    .line 4
    :sswitch_5
    check-cast p2, Ll/᩵ۢ֫;

    .line 6
    sget p1, Ll/۟ۢ֫;->ۡ᩷:I

    .line 2380
    iget-object p1, p0, Ll/ۚᩳ֫;->ܰ:Ljava/util/Comparator;

    invoke-interface {p1, p2, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/᩵ۢ֫;

    .line 1340
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u06df\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x50e7

    const v6, -0x6b4710ea

    xor-int/2addr v5, v6

    const v6, 0x721e8681

    goto :goto_0

    :goto_1
    const-string v4, "\u073f\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x90f

    const v6, 0x5551f1f3

    xor-int/2addr v5, v6

    const v6, 0x4c437e8a    # 5.1247656E7f

    goto :goto_0

    :cond_2
    const-string v4, "\u0733\u0736"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2503

    const v6, 0x18e34b21

    xor-int/2addr v5, v6

    const v6, 0x47517a41

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u06d6\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5827

    const v6, 0x31c6a5a5

    xor-int/2addr v5, v6

    const v6, -0x2dd76c5c

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u1a7a\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4d51

    const v6, 0x48519a61

    xor-int/2addr v5, v6

    const v6, 0x5d37c916

    goto/16 :goto_0

    .line 932
    :sswitch_9
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06da\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6127

    const v6, 0x48b0cc5e

    xor-int/2addr v5, v6

    const v6, -0x48272176

    goto/16 :goto_0

    .line 2352
    :sswitch_a
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v4

    if-eqz v4, :cond_7

    :cond_6
    :goto_2
    const-string v4, "\u06e1\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7553

    const v6, 0x7c675130

    xor-int/2addr v5, v6

    const v6, -0x509d9226

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a7a\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5677

    const v6, -0x5a6296c5

    xor-int/2addr v5, v6

    const v6, -0x2b972f63    # -3.9997295E12f

    goto/16 :goto_0

    .line 1721
    :sswitch_b
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u05ab\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x659b

    const v6, -0x7d44ac26

    xor-int/2addr v5, v6

    const v6, -0x5a3e1687

    goto/16 :goto_0

    .line 756
    :sswitch_c
    sget v4, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v4, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "\u1a75\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2433

    const v6, 0x484e23c2

    xor-int/2addr v5, v6

    const v6, -0x3f037761

    goto/16 :goto_0

    .line 1977
    :sswitch_d
    sget v4, Ll/۬;->᩸ۜ᩹:I

    if-eqz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u06da\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x511d

    const v6, -0x7771ca15

    xor-int/2addr v5, v6

    const v6, -0x425dd18

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06dc\u073a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa93

    const v6, 0x77a61502

    xor-int/2addr v5, v6

    const v6, -0x38030d58

    goto/16 :goto_0

    .line 2175
    :sswitch_e
    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u06da\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1307

    const v6, 0x2e8f7143

    xor-int/2addr v5, v6

    const v6, 0x77405f68

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7b\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x16f3

    const v6, -0x695becf

    xor-int/2addr v5, v6

    const v6, 0x299b59fc

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fbe9939 -> :sswitch_e
        -0x76b9f724 -> :sswitch_5
        -0x70fb9251 -> :sswitch_2
        -0x62af4d92 -> :sswitch_a
        -0x5103f550 -> :sswitch_9
        -0x4bded81f -> :sswitch_b
        -0x48727d0c -> :sswitch_b
        -0x44f70dbf -> :sswitch_8
        -0x381e6cbb -> :sswitch_c
        -0x20a941a2 -> :sswitch_a
        -0x1db51df4 -> :sswitch_1
        -0x1a22f5c9 -> :sswitch_7
        -0x17eeeeb5 -> :sswitch_6
        -0x16c1a220 -> :sswitch_2
        -0x919db68 -> :sswitch_4
        -0x45a4dbd -> :sswitch_c
        0x39e105b -> :sswitch_4
        0x6c0fd83 -> :sswitch_5
        0xfd1559c -> :sswitch_0
        0x16a04f23 -> :sswitch_3
        0x21dfabf2 -> :sswitch_8
        0x2d3195c6 -> :sswitch_1
        0x36d46421 -> :sswitch_0
        0x3dc67d91 -> :sswitch_6
        0x55ac888a -> :sswitch_d
        0x57b10e2a -> :sswitch_e
        0x5d4682e5 -> :sswitch_d
        0x5ef583df -> :sswitch_3
        0x6e443d7f -> :sswitch_9
        0x7e8eb598 -> :sswitch_7
    .end sparse-switch
.end method

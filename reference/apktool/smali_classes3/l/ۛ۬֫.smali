.class public final Ll/ۛ۬֫;
.super Ll/ۢ۟᩷;
.source "H6HS"


# instance fields
.field public final synthetic ۙ:Ll/ۢ۬֫;


# direct methods
.method public constructor <init>(Ll/ۢ۬֫;)V
    .locals 0

    .line 333
    iput-object p1, p0, Ll/ۛ۬֫;->ۙ:Ll/ۢ۬֫;

    invoke-direct {p0}, Ll/ۢ۟᩷;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScrollStateChanged(Ll/᩻ᩳ᩷;I)V
    .locals 7

    const/4 p1, 0x0

    const/4 v0, 0x0

    const v1, -0x3d8e3c21

    sget v2, Ll/ۖᩳ;->᩹ۧܳ:I

    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    const-string v4, "\u1a74\u1a77"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x13

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2b63

    const v6, -0x25e7cc50

    xor-int/2addr v5, v6

    const v6, 0x782ad904

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x2c13

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 335
    iget-object p1, p0, Ll/ۛ۬֫;->ۙ:Ll/ۢ۬֫;

    invoke-static {p1, v0}, Ll/ۢ۬֫;->ۙ(Ll/ۢ۬֫;Z)V

    sget v4, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v4, :cond_0

    goto/16 :goto_2

    .line 300
    :sswitch_0
    sget v4, Ll/ۖۜ;->֨ۡۗ:I

    if-nez v4, :cond_c

    goto/16 :goto_3

    .line 320
    :sswitch_1
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_a

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    sget v4, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    .line 44
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    goto/16 :goto_3

    .line 319
    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    return-void

    .line 336
    :sswitch_5
    invoke-static {}, Ll/ۘܶ;->ܽܿܽ()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Ll/ۢ۬֫;->ۙ(Ll/ۢ۬֫;J)V

    return-void

    :cond_0
    const-string v4, "\u06e0\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2ecf

    const v6, -0x46119074

    xor-int/2addr v5, v6

    const v6, -0x1e3bfaac

    goto :goto_0

    :sswitch_6
    const/4 v0, 0x1

    goto :goto_1

    :sswitch_7
    const/4 v0, 0x0

    :goto_1
    const-string v4, "\u06e4\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x78fd

    const v6, 0xa26d49

    xor-int/2addr v5, v6

    const v6, 0x21c2472d

    goto :goto_0

    :sswitch_8
    if-eqz p2, :cond_1

    const-string v4, "\u06eb\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x442f

    const v6, -0x4938ddf9

    xor-int/2addr v5, v6

    const v6, 0x6c941b1a

    goto :goto_0

    :cond_1
    const-string v4, "\u1a73\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2263

    const v6, 0x6e31b07e

    xor-int/2addr v5, v6

    const v6, 0x7db0d4fa

    goto/16 :goto_0

    .line 37
    :sswitch_9
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_3

    :cond_2
    const-string v4, "\u05a8\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3c43

    const v6, 0xb10f6af

    xor-int/2addr v5, v6

    const v6, -0x4ed865be

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u1a74\u06d7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1e0d

    const v6, 0x25b88ee4

    xor-int/2addr v5, v6

    const v6, -0x644b86cc

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06e1\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x59

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x19a1

    const v6, 0x2be2a534

    xor-int/2addr v5, v6

    const v6, 0xa089574

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06da\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x64a7

    const v6, 0x590336e7

    xor-int/2addr v5, v6

    const v6, -0x6350d9ff

    goto/16 :goto_0

    .line 91
    :sswitch_c
    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-ltz v4, :cond_6

    :goto_2
    const-string v4, "\u0736\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x59

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4df7

    const v6, 0x324abe0c

    xor-int/2addr v5, v6

    const v6, 0x5d7db49b

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d6\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3bf5

    const v6, 0x33b16dd7

    xor-int/2addr v5, v6

    const v6, 0x17ccc198

    goto/16 :goto_0

    .line 250
    :sswitch_d
    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u06d8\u06e2"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2965

    const v6, -0x5307ab2

    xor-int/2addr v5, v6

    const v6, 0x3247cbbf

    goto/16 :goto_0

    .line 300
    :sswitch_e
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u0736\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1c93

    const v6, -0x285d2362

    xor-int/2addr v5, v6

    const v6, -0x502e27f0

    goto/16 :goto_0

    .line 298
    :sswitch_f
    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v4, :cond_9

    :goto_3
    const-string v4, "\u05a1\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xc49

    const v6, -0x7f51f68c

    xor-int/2addr v5, v6

    const v6, -0x6848e276

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u05a1\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7075

    const v6, 0x1c335619

    xor-int/2addr v5, v6

    const v6, 0x62ceb031

    goto/16 :goto_0

    .line 310
    :sswitch_10
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u06e8\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3db7

    const v6, 0x4b9651a8    # 1.9702608E7f

    xor-int/2addr v5, v6

    const v6, -0x5a7fcb15

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06d7\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1caf

    const v6, 0x624df04a

    xor-int/2addr v5, v6

    const v6, 0x48be90d2

    goto/16 :goto_0

    .line 17
    :sswitch_11
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_d

    :cond_c
    const-string v4, "\u1a73\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x18e5

    const v6, 0x4bcf4771    # 2.7168482E7f

    xor-int/2addr v5, v6

    const v6, -0x783a0650

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06dc\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x565d

    const v6, -0x75e8e19e    # -7.2761E-33f

    xor-int/2addr v5, v6

    const v6, -0x2f595112

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x792a43aa -> :sswitch_e
        -0x7234bdfa -> :sswitch_b
        -0x68d36f18 -> :sswitch_9
        -0x64a4bc22 -> :sswitch_d
        -0x60100be0 -> :sswitch_10
        -0x56a55af8 -> :sswitch_5
        -0x569cbf8f -> :sswitch_d
        -0x55d60a9c -> :sswitch_5
        -0x53209035 -> :sswitch_1
        -0x4c14ebc5 -> :sswitch_2
        -0x4a5e1152 -> :sswitch_7
        -0x48293572 -> :sswitch_11
        -0x45150435 -> :sswitch_3
        -0x44245bb3 -> :sswitch_b
        -0x42c86018 -> :sswitch_f
        -0x38b69771 -> :sswitch_0
        -0x2fa597e3 -> :sswitch_8
        -0x2c1982f2 -> :sswitch_a
        -0x2701e2c4 -> :sswitch_4
        -0x2564a291 -> :sswitch_11
        -0x1247c1af -> :sswitch_6
        -0x10756fef -> :sswitch_1
        -0x191662f -> :sswitch_3
        0x35361fc -> :sswitch_f
        0x562e761 -> :sswitch_c
        0x7b373ce -> :sswitch_10
        0x143a685c -> :sswitch_8
        0x1b17e512 -> :sswitch_e
        0x2779ed8c -> :sswitch_6
        0x306e03e0 -> :sswitch_2
        0x32fa2f48 -> :sswitch_7
        0x36483094 -> :sswitch_a
        0x41d2d69f -> :sswitch_0
        0x58c841ff -> :sswitch_c
        0x5c8a2214 -> :sswitch_4
        0x6fc856a0 -> :sswitch_9
    .end sparse-switch
.end method

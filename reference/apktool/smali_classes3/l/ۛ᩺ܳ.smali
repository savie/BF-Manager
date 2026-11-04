.class public final synthetic Ll/ۛ᩺ܳ;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ll/ۚۘܳ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Class;

.field public final synthetic ܿ:Ll/ۖۗܳ;

.field public final synthetic ᩶:Ll/۠ۨܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۖۗܳ;Ll/۠ۨܳ;Ljava/lang/Class;)V
    .locals 6

    const v0, 0x631a2025

    sget v1, Ll/ۗ֨;->᩹ۜۡ:I

    sget v2, Ll/ۖ֡;->ۚۛᩳ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a76\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7e1

    const v5, 0x3304a27

    xor-int/2addr v4, v5

    const v5, 0x3596b2b0

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x63cd

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_9

    goto/16 :goto_2

    .line 1
    :sswitch_0
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_6

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_8

    goto/16 :goto_3

    .line 0
    :sswitch_2
    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_a

    goto/16 :goto_4

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    goto/16 :goto_4

    .line 0
    :sswitch_4
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    iput-object p1, p0, Ll/ۛ᩺ܳ;->ܿ:Ll/ۖۗܳ;

    return-void

    .line 3
    :sswitch_6
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_0

    const-string v3, "\u06e0\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x762b

    const v5, 0x13045178

    xor-int/2addr v4, v5

    const v5, 0x340a3514

    goto :goto_0

    :cond_0
    const-string v3, "\u073d\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2c77

    const v5, 0x3157f089

    xor-int/2addr v4, v5

    const v5, -0x2ce70c3d

    goto :goto_0

    .line 4
    :sswitch_7
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v3, "\u06d8\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xea5

    const v5, -0xfec835d

    xor-int/2addr v4, v5

    const v5, 0x67d76440

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u05a8\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x453

    const v5, -0x31205e86

    xor-int/2addr v4, v5

    const v5, -0x1d1fce5

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06d6\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x65cb

    const v5, 0x33b9ea9b

    xor-int/2addr v4, v5

    const v5, 0x6674038c

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u1a76\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4367

    const v5, 0x53990925

    xor-int/2addr v4, v5

    const v5, 0x528ba7f0    # 2.99909E11f

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u073f\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6091

    const v5, -0x353b1fee    # -6451209.0f

    xor-int/2addr v4, v5

    const v5, -0x53b03e7e

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u06db\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3ba1

    const v5, -0x1f0d28ee

    xor-int/2addr v4, v5

    const v5, 0x1f20d740

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a74\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4e51

    const v5, 0x5c83113b

    xor-int/2addr v4, v5

    const v5, -0x5ca42cea

    goto/16 :goto_0

    :cond_8
    :goto_2
    const-string v3, "\u1a76\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x40ad

    const v5, -0x7582406f

    xor-int/2addr v4, v5

    const v5, 0x5fcd8784

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d6\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x34e1

    const v5, 0x4a9e1e5c    # 5181230.0f

    xor-int/2addr v4, v5

    const v5, 0x4b5e249c    # 1.4558364E7f

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u1a73\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1b05

    const v5, -0x4af1e656

    xor-int/2addr v4, v5

    const v5, 0x165af81

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u0736\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x114d

    const v5, -0x170c96

    xor-int/2addr v4, v5

    const v5, -0x70120a2f

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p3, p0, Ll/ۛ᩺ܳ;->ܰ:Ljava/lang/Class;

    iput-object p2, p0, Ll/ۛ᩺ܳ;->᩶:Ll/۠ۨܳ;

    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u06df\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x64e3

    const v5, 0x44fb9905

    xor-int/2addr v4, v5

    const v5, -0x19f4e0ff

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a75\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6d3b

    const v5, 0x208e3f46

    xor-int/2addr v4, v5

    const v5, -0x5826534d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e962603 -> :sswitch_2
        -0x7234b764 -> :sswitch_6
        -0x5b572058 -> :sswitch_8
        -0x55c2f46a -> :sswitch_4
        -0x55842b33 -> :sswitch_e
        -0x4eb5cc5d -> :sswitch_5
        -0x4deae9d2 -> :sswitch_5
        -0x400ec1f2 -> :sswitch_0
        -0x2bdccd51 -> :sswitch_1
        -0x28dd800b -> :sswitch_a
        -0x21c203eb -> :sswitch_e
        -0x1fd3aedf -> :sswitch_9
        -0x1c0216d5 -> :sswitch_a
        -0x14859d33 -> :sswitch_3
        -0xac3303c -> :sswitch_1
        0x983a8b4 -> :sswitch_4
        0x14324208 -> :sswitch_7
        0x1b1552cc -> :sswitch_d
        0x343d43fe -> :sswitch_b
        0x358b7721 -> :sswitch_2
        0x3cd682d6 -> :sswitch_9
        0x40bed9cc -> :sswitch_3
        0x47cc53cd -> :sswitch_c
        0x49441e76 -> :sswitch_b
        0x49767d13 -> :sswitch_8
        0x4dc61594 -> :sswitch_d
        0x4e167fc4 -> :sswitch_7
        0x63364c1a -> :sswitch_6
        0x67c7cd5a -> :sswitch_c
        0x6ad9b965 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ(Ll/᩷ۨᩴ;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x54b43253

    sget v2, Ll/֨ۨ;->ۜܳ᩵:I

    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v4, "\u073d\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7213

    const v6, 0x66a8c49d

    xor-int/2addr v5, v6

    const v6, -0x73c757d3

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x4e61

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v4

    if-ltz v4, :cond_8

    goto/16 :goto_4

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-ltz v4, :cond_a

    goto/16 :goto_4

    .line 0
    :sswitch_1
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    sget v4, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u0730\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1b79

    const v6, -0x762337ea

    xor-int/2addr v5, v6

    const v6, 0x1a5d1ad5

    goto :goto_0

    .line 4
    :sswitch_2
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    goto/16 :goto_4

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    return-void

    :sswitch_4
    iget-object v1, p0, Ll/ۛ᩺ܳ;->ܿ:Ll/ۖۗܳ;

    iget-object v2, p0, Ll/ۛ᩺ܳ;->ܰ:Ljava/lang/Class;

    invoke-static {v2, v0, v1, p1}, Ll/֫ۘܳ;->ۙ(Ljava/lang/Class;Ll/۠ۨܳ;Ll/ۖۗܳ;Ll/᩷ۨᩴ;)V

    return-void

    :sswitch_5
    iget-object v0, p0, Ll/ۛ᩺ܳ;->᩶:Ll/۠ۨܳ;

    .line 1
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v4, "\u06e7\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7091

    const v6, 0x7216050c

    xor-int/2addr v5, v6

    const v6, 0x7f3fa919

    goto :goto_0

    .line 4
    :sswitch_6
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06df\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x59

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4ecb

    const v6, 0x16acb80a

    xor-int/2addr v5, v6

    const v6, 0x50de28c4

    goto/16 :goto_0

    .line 3
    :sswitch_7
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v4

    if-ltz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06e7\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x54b1

    const v6, 0x6ea1aada

    xor-int/2addr v5, v6

    const v6, 0x4b1ceae8    # 1.0283752E7f

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u073a\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2361

    const v6, -0x4f08712b

    xor-int/2addr v5, v6

    const v6, 0x177fd177

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_5

    goto :goto_1

    :cond_5
    const-string v4, "\u1a73\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x593d

    const v6, -0x48057df3

    xor-int/2addr v5, v6

    const v6, 0x19dae5c7

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u0730\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1b73

    const v6, 0x401f5cc4

    xor-int/2addr v5, v6

    const v6, 0x569beeda

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v4, :cond_7

    :goto_1
    const-string v4, "\u06e8\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x545f

    const v6, 0x7cbb7616

    xor-int/2addr v5, v6

    const v6, -0x5e7d23d9

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e2\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xc1d

    const v6, 0x7e80a597

    xor-int/2addr v5, v6

    const v6, -0x57b77612

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u06d6\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5319

    const v6, 0x3a00fd60

    xor-int/2addr v5, v6

    const v6, 0x3fc66d0a

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a7b\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2a41

    const v6, 0x3c287fd3

    xor-int/2addr v5, v6

    const v6, 0x73a9eb7b

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u073d\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x29b

    const v6, 0x2b85aa13

    xor-int/2addr v5, v6

    const v6, 0x22e79173

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06d7\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5971

    const v6, -0x5fa6066f

    xor-int/2addr v5, v6

    const v6, -0x7f97d00c

    goto/16 :goto_0

    .line 4
    :sswitch_e
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u06dc\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x56d3

    const v6, 0x5abd5441

    xor-int/2addr v5, v6

    const v6, 0x7d86e5a6

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073f\u06e2"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4f77

    const v6, 0x6d6df0af

    xor-int/2addr v5, v6

    const v6, -0x5961624f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c30a8b8 -> :sswitch_e
        -0x5d333d88 -> :sswitch_d
        -0x58f98af7 -> :sswitch_7
        -0x5366df2f -> :sswitch_e
        -0x50f83790 -> :sswitch_2
        -0x42952a09 -> :sswitch_c
        -0x3f07cdde -> :sswitch_1
        -0x3904e200 -> :sswitch_9
        -0x3200ab43 -> :sswitch_3
        -0x2828d2fa -> :sswitch_b
        -0x2483c05f -> :sswitch_6
        -0x10a084d3 -> :sswitch_4
        0xa909a9b -> :sswitch_5
        0x1008fd27 -> :sswitch_c
        0x10b2f9e4 -> :sswitch_b
        0x11fb72b7 -> :sswitch_0
        0x16e72430 -> :sswitch_d
        0x243283fd -> :sswitch_2
        0x26807fa0 -> :sswitch_6
        0x38285c37 -> :sswitch_a
        0x3910fda1 -> :sswitch_0
        0x39668b4b -> :sswitch_4
        0x448c750e -> :sswitch_7
        0x485894ae -> :sswitch_1
        0x59e1ee3c -> :sswitch_9
        0x635dc4c6 -> :sswitch_8
        0x6c241d91 -> :sswitch_a
        0x718c3393 -> :sswitch_3
        0x733ed858 -> :sswitch_8
        0x7384224a -> :sswitch_5
    .end sparse-switch
.end method

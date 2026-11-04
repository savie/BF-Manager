.class public final synthetic Ll/ܽۜ᩻;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ll/ۤۖ᩻;

.field public final synthetic ܰ:Ljava/lang/String;

.field public final synthetic ܿ:Landroid/app/Activity;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ll/ۤۖ᩻;)V
    .locals 6

    const v0, -0x1b6aac62

    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    sget v2, Ll/֡ۢ;->۟֡᩻:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e7\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x440f

    const v5, -0x1d9791c0

    xor-int/2addr v4, v5

    const v5, 0x466eeed2

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0xc05

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v3

    if-gtz v3, :cond_0

    goto/16 :goto_4

    .line 3
    :sswitch_0
    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-gez v3, :cond_1

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-gez v3, :cond_a

    goto/16 :goto_2

    :sswitch_2
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_8

    goto/16 :goto_1

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ܽۜ᩻;->ܿ:Landroid/app/Activity;

    iput-object p4, p0, Ll/ܽۜ᩻;->֡:Ll/ۤۖ᩻;

    return-void

    :cond_0
    const-string v3, "\u1a79\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6029

    const v5, -0x266b92e5

    xor-int/2addr v4, v5

    const v5, -0x29b11aae

    goto :goto_0

    .line 4
    :sswitch_6
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_2

    :cond_1
    const-string v3, "\u0733\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x64f

    const v5, 0x10469a90

    xor-int/2addr v4, v5

    const v5, 0x7e79e905

    goto :goto_0

    :cond_2
    const-string v3, "\u1a77\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x67b5

    const v5, -0x6daa4baa

    xor-int/2addr v4, v5

    const v5, -0x77a48845

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06e7\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6461

    const v5, -0x5f2dd38d

    xor-int/2addr v4, v5

    const v5, -0x6462a2d8

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v3, "\u06e4\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x109b

    const v5, -0x444306cc

    xor-int/2addr v4, v5

    const v5, -0x60709454

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06d8\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, -0x1f

    const v5, -0x24550193

    xor-int/2addr v4, v5

    const v5, 0x27f9e559

    goto/16 :goto_0

    .line 4
    :sswitch_a
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_1
    const-string v3, "\u06db\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3523

    const v5, -0x4a3eaf1b

    xor-int/2addr v4, v5

    const v5, -0x5c5dc7bb

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u05a1\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2cb1

    const v5, -0x3c91ead3

    xor-int/2addr v4, v5

    const v5, -0xc8ad329

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u1a7b\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x481f

    const v5, -0x3ee699a3

    xor-int/2addr v4, v5

    const v5, -0x60af323c

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v3

    if-gtz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u1a73\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4fd5

    const v5, 0x2c15c9ed

    xor-int/2addr v4, v5

    const v5, 0x189fcdc3

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06db\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2cff

    const v5, 0x1147b61c

    xor-int/2addr v4, v5

    const v5, 0x5664abad

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06dc\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3fad

    const v5, 0x17d21949

    xor-int/2addr v4, v5

    const v5, 0x7e00b63a

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u05a1\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5179

    const v5, -0x3f35e72d

    xor-int/2addr v4, v5

    const v5, 0x7bfd1a76

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/ܽۜ᩻;->ܰ:Ljava/lang/String;

    iput-object p2, p0, Ll/ܽۜ᩻;->᩶:Ljava/lang/String;

    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u06e2\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x79d3

    const v5, -0x552fe41a

    xor-int/2addr v4, v5

    const v5, -0x1c62f065

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e0\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x752f

    const v5, 0x470675a2

    xor-int/2addr v4, v5

    const v5, 0x21e3eb0c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6ea83423 -> :sswitch_e
        -0x63863c42 -> :sswitch_5
        -0x5bb2aca5 -> :sswitch_8
        -0x56c639e6 -> :sswitch_3
        -0x42e6628d -> :sswitch_1
        -0x3c0e6cb5 -> :sswitch_4
        -0x3ba27585 -> :sswitch_0
        -0x393598b2 -> :sswitch_9
        -0x30b1a8c1 -> :sswitch_c
        -0x2a981495 -> :sswitch_a
        -0x211d82d2 -> :sswitch_1
        -0x1cb990de -> :sswitch_9
        -0x5ec416a -> :sswitch_a
        0x774994e -> :sswitch_c
        0x7e5ecc0 -> :sswitch_5
        0xc5a7755 -> :sswitch_e
        0x1eef06c8 -> :sswitch_2
        0x24df9233 -> :sswitch_4
        0x2d2319fb -> :sswitch_8
        0x2d237d68 -> :sswitch_3
        0x562d20d9 -> :sswitch_d
        0x5f0b255f -> :sswitch_7
        0x63b8fdb8 -> :sswitch_2
        0x63dbbb99 -> :sswitch_b
        0x6572914d -> :sswitch_6
        0x6a70c6ee -> :sswitch_6
        0x6f913709 -> :sswitch_0
        0x7647adbb -> :sswitch_b
        0x78f56b9f -> :sswitch_d
        0x7e5f210f -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x2c50866b

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    const-string v5, "\u06d9\u06d6"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4cc1

    const v7, 0x362c8179

    xor-int/2addr v6, v7

    const v7, -0x32c0575f    # -2.0096872E8f

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x67c5

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_5

    goto/16 :goto_3

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget v5, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v5, :cond_1

    goto/16 :goto_2

    :sswitch_1
    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_a

    goto/16 :goto_2

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    goto/16 :goto_1

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v2, p0, Ll/ܽۜ᩻;->ܰ:Ljava/lang/String;

    iget-object v3, p0, Ll/ܽۜ᩻;->᩶:Ljava/lang/String;

    invoke-static {v2, v3, v0, v1}, Ll/ۧ۬᩻;->ۙ(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ll/ۤۖ᩻;)V

    return-void

    :sswitch_6
    iget-object v1, p0, Ll/ܽۜ᩻;->֡:Ll/ۤۖ᩻;

    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v5, "\u0730\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x370d

    const v7, 0xafb100

    xor-int/2addr v6, v7

    const v7, 0x101ec14c

    goto :goto_0

    .line 3
    :sswitch_7
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_2

    :cond_1
    const-string v5, "\u073a\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5d79

    const v7, -0x6888bbd8

    xor-int/2addr v6, v7

    const v7, 0x58e9ed5e

    goto :goto_0

    :cond_2
    const-string v5, "\u0730\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7371

    const v7, 0x1823b0ec

    xor-int/2addr v6, v7

    const v7, -0x3645aa6f

    goto/16 :goto_0

    :sswitch_8
    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v5, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v5, "\u06eb\u073f"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x79

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2513

    const v7, -0x5451c8ca

    xor-int/2addr v6, v7

    const v7, -0x45d37869

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-gtz v5, :cond_4

    :goto_1
    const-string v5, "\u1a74\u1a73"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xf3

    const v7, -0x58b7a80d

    xor-int/2addr v6, v7

    const v7, -0x72ed9727

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u0736\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2991

    const v7, 0x40efcc4d

    xor-int/2addr v6, v7

    const v7, 0x1a1d6312

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u1a74\u05a1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6e3b

    const v7, 0x7edd0dc0

    xor-int/2addr v6, v7

    const v7, 0x6333616b

    goto/16 :goto_0

    :sswitch_a
    sget v5, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v5, :cond_6

    goto :goto_3

    :cond_6
    const-string v5, "\u05a1\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x147b

    const v7, -0x2c5f5b8d

    xor-int/2addr v6, v7

    const v7, 0x5b2d51a3

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u0730\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3e09

    const v7, -0x51484d7f

    xor-int/2addr v6, v7

    const v7, -0xa66c8c5

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v5

    if-gtz v5, :cond_9

    :cond_8
    :goto_2
    const-string v5, "\u0733\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x69

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2405

    const v7, -0x75ffc2a1

    xor-int/2addr v6, v7

    const v7, 0x5275905d

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06db\u1a7a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x73b5

    const v7, -0x5a8d76ac

    xor-int/2addr v6, v7

    const v7, 0x6e9b6cb4

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_b

    :cond_a
    :goto_3
    const-string v5, "\u06d7\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x3f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xe97

    const v7, 0x6c8560be

    xor-int/2addr v6, v7

    const v7, 0x1e5af274

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06e4\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x18c7

    const v7, 0xca41b84

    xor-int/2addr v6, v7

    const v7, -0x933da34

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-object v0, p0, Ll/ܽۜ᩻;->ܿ:Landroid/app/Activity;

    sget v5, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v5, :cond_c

    :goto_4
    const-string v5, "\u06d8\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x15db

    const v7, 0x40a4f6b6

    xor-int/2addr v6, v7

    const v7, -0x1d8340c4

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u073a\u06d8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x1d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5ddb

    const v7, -0x2b71c468

    xor-int/2addr v6, v7

    const v7, -0x24ce9041

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77affd62 -> :sswitch_b
        -0x76a0a0ff -> :sswitch_e
        -0x6a1eeef1 -> :sswitch_a
        -0x5d86dbf4 -> :sswitch_0
        -0x518bc484 -> :sswitch_b
        -0x50aebf6e -> :sswitch_d
        -0x4d4c8fe0 -> :sswitch_4
        -0x4afdac61 -> :sswitch_9
        -0x48cad649 -> :sswitch_1
        -0x43f64d4e -> :sswitch_c
        -0x42fe34c8 -> :sswitch_2
        -0x33d07171 -> :sswitch_8
        -0x1f615c5c -> :sswitch_7
        -0x1aa76447 -> :sswitch_7
        -0x10ef8c5c -> :sswitch_3
        -0x339c50b -> :sswitch_9
        -0x3df8ac -> :sswitch_5
        0x31177af -> :sswitch_1
        0xf1b735b -> :sswitch_d
        0x1a45f0e0 -> :sswitch_a
        0x1f88bb62 -> :sswitch_6
        0x20f36b39 -> :sswitch_6
        0x20fef2e0 -> :sswitch_c
        0x22e35016 -> :sswitch_e
        0x344e6f75 -> :sswitch_0
        0x3fab2ae7 -> :sswitch_5
        0x572e7622 -> :sswitch_2
        0x5c9f78f3 -> :sswitch_4
        0x776e544a -> :sswitch_3
        0x7c76211b -> :sswitch_8
    .end sparse-switch
.end method

.class public final synthetic Ll/ۛᩳ᩻;
.super Ljava/lang/Object;
.source "S3XU"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, 0x364395c5

    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    sget v2, Ll/ۗ᩺;->֡ۙۜ:I

    .line 0
    iput p1, p0, Ll/ۛᩳ᩻;->ܰ:I

    iput-object p2, p0, Ll/ۛᩳ᩻;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u1a74\u1a7a"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x43e3

    const v3, 0x2e257ab

    xor-int/2addr p2, v3

    const v3, 0x318255c4

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x7e09

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result p1

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a73\u05a8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x142f

    const v3, 0x3b2762e8

    xor-int/2addr p2, v3

    const v3, 0x41fa3047

    goto :goto_0

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    sget p1, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u1a7a\u0736"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1ef3

    const v3, 0x2420c4d3

    xor-int/2addr p2, v3

    const v3, 0x2047e985

    goto :goto_0

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget-boolean p1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u1a74\u06e1"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x9df

    const v3, -0x1888ff0a

    xor-int/2addr p2, v3

    const v3, 0x4161fee5

    goto :goto_0

    .line 4
    :sswitch_2
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    :goto_2
    const-string p1, "\u06e1\u06e8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x35d3

    const v3, 0x6c3e69b4

    xor-int/2addr p2, v3

    const v3, -0x1d74a91d

    goto :goto_0

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget-boolean p1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz p1, :cond_3

    const-string p1, "\u06dc\u06dc"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x645

    const v3, -0x6342f3f

    xor-int/2addr p2, v3

    const v3, -0x2d13da2e

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06dc\u06d9"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x59

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x61a9

    const v3, 0x2c97de4c

    xor-int/2addr p2, v3

    const v3, -0x49ec89b0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x3fde6245 -> :sswitch_4
        -0x2b8df54f -> :sswitch_2
        -0x2b163895 -> :sswitch_0
        -0x26123202 -> :sswitch_0
        -0x11007483 -> :sswitch_5
        -0xc5bdba -> :sswitch_1
        0x3df51afb -> :sswitch_3
        0x535ee7a7 -> :sswitch_1
        0x6128c98c -> :sswitch_2
        0x65375a96 -> :sswitch_4
        0x65f8ecd6 -> :sswitch_5
        0x6beb8cfc -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x4f4cba60

    sget v3, Ll/֫֨;->᩶ܺۡ:I

    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v5, "\u1a77\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x37

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5b63

    const v7, 0x531cb44b

    xor-int/2addr v6, v7

    const v7, 0x2b3f6e64

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x620b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 638
    invoke-virtual {v0, p1}, Ll/ۨᩳ᩻;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙܿܳ;

    return-object p1

    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v5

    if-eqz v5, :cond_5

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget v5, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v5, :cond_8

    goto/16 :goto_5

    :sswitch_2
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_b

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    goto/16 :goto_2

    .line 268
    :sswitch_4
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    const/4 p1, 0x0

    return-object p1

    .line 11
    :sswitch_5
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 14
    invoke-static {v1, p1}, Lcom/google/android/material/color/utilities/DynamicColor;->$r8$lambda$HYD-TTRX49hWk5qNJTOhVJLMxRg(Lcom/google/android/material/color/utilities/TonalPalette;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    .line 7
    :sswitch_6
    iget-object v1, p0, Ll/ۛᩳ᩻;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v1, Lcom/google/android/material/color/utilities/TonalPalette;

    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u1a73\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7073

    const v7, 0x508f334b

    xor-int/2addr v6, v7

    const v7, 0x4d628273    # 2.375125E8f

    goto :goto_0

    .line 18
    :sswitch_7
    iget-object v0, p0, Ll/ۛᩳ᩻;->᩶:Ljava/lang/Object;

    .line 20
    check-cast v0, Ll/ۨᩳ᩻;

    .line 486
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v5

    if-ltz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u06e2\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x2b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x55c7

    const v7, 0x2e9eea44

    xor-int/2addr v6, v7

    const v7, 0x68b5063b

    goto/16 :goto_0

    .line 2
    :sswitch_8
    iget v5, p0, Ll/ۛᩳ᩻;->ܰ:I

    packed-switch v5, :pswitch_data_0

    const-string v5, "\u06dc\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x49

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4dc5

    const v7, 0x7f3143b7

    xor-int/2addr v6, v7

    const v7, 0x38870ee5

    goto/16 :goto_0

    :pswitch_0
    const-string v5, "\u1a7b\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x21

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4f19

    const v7, -0x65d13a9f

    xor-int/2addr v6, v7

    const v7, -0x710d08e6

    goto/16 :goto_0

    .line 556
    :sswitch_9
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    const-string v5, "\u06eb\u06e8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x574d

    const v7, -0x59066afe

    xor-int/2addr v6, v7

    const v7, -0x49220c51

    goto/16 :goto_0

    .line 94
    :sswitch_a
    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u06e4\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x59

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5643

    const v7, -0x578f2831

    xor-int/2addr v6, v7

    const v7, -0x5aa7e721

    goto/16 :goto_0

    .line 226
    :sswitch_b
    sget v5, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u1a7b\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xa11

    const v7, 0x6721002a

    xor-int/2addr v6, v7

    const v7, 0x2964047c

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v5, :cond_6

    :cond_5
    :goto_1
    const-string v5, "\u06da\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x11

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4ad9

    const v7, -0x1dabaf54

    xor-int/2addr v6, v7

    const v7, -0xc1c4ce6

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u1a77\u06ec"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7fe7

    const v7, -0x17f01ff6

    xor-int/2addr v6, v7

    const v7, 0x584561d6

    goto/16 :goto_0

    .line 251
    :sswitch_d
    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v5, :cond_7

    :goto_2
    const-string v5, "\u06eb\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6f55

    const v7, -0x6c569a31

    xor-int/2addr v6, v7

    const v7, -0x14ff22b7

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u1a75\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x59

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4543

    const v7, -0x324218be

    xor-int/2addr v6, v7

    const v7, 0x3b757825

    goto/16 :goto_0

    .line 626
    :sswitch_e
    sget v5, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v5, :cond_9

    :cond_8
    :goto_3
    const-string v5, "\u0733\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x67

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x18b1

    const v7, -0x1aa852f8

    xor-int/2addr v6, v7

    const v7, 0x68d4f62b

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06e1\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1d83

    const v7, -0x60e7ac38

    xor-int/2addr v6, v7

    const v7, -0x5abe2d77

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v5

    if-nez v5, :cond_a

    :goto_4
    const-string v5, "\u05ab\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4339

    const v7, 0x78ddbb27

    xor-int/2addr v6, v7

    const v7, 0x60a99431

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a79\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6145

    const v7, 0x715912e3

    xor-int/2addr v6, v7

    const v7, -0x56ba8106

    goto/16 :goto_0

    .line 66
    :sswitch_10
    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u06ec\u1a78"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xa39

    const v7, -0x62cef4

    xor-int/2addr v6, v7

    const v7, 0x610d7736

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a78\u06eb"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4341

    const v7, 0x1e66eeee

    xor-int/2addr v6, v7

    const v7, 0x30e293e2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79a96a48 -> :sswitch_f
        -0x720a74f9 -> :sswitch_0
        -0x6e681e52 -> :sswitch_4
        -0x6cbeb598 -> :sswitch_7
        -0x632a7787 -> :sswitch_3
        -0x602f89f2 -> :sswitch_a
        -0x5d005981 -> :sswitch_f
        -0x5aa990f9 -> :sswitch_4
        -0x59ec7efd -> :sswitch_1
        -0x52222305 -> :sswitch_9
        -0x3c4f62ef -> :sswitch_5
        -0x32f5057d -> :sswitch_6
        -0x284544ed -> :sswitch_3
        -0x1ebd5d5c -> :sswitch_b
        -0xb90e81a -> :sswitch_8
        -0xad32ff5 -> :sswitch_a
        -0x4297a63 -> :sswitch_5
        -0x3b04c73 -> :sswitch_7
        0x56144d -> :sswitch_b
        0x18451df -> :sswitch_8
        0x1b36570 -> :sswitch_e
        0x13f60017 -> :sswitch_d
        0x157cbeda -> :sswitch_c
        0x1a3ec367 -> :sswitch_0
        0x2358f31e -> :sswitch_9
        0x270dea01 -> :sswitch_6
        0x2e0033b2 -> :sswitch_1
        0x3a6bc805 -> :sswitch_2
        0x49112524 -> :sswitch_2
        0x592775a7 -> :sswitch_c
        0x686fb423 -> :sswitch_e
        0x6957e526 -> :sswitch_d
        0x6b92e07f -> :sswitch_10
        0x72c7b1cc -> :sswitch_10
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

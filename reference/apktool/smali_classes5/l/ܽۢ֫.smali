.class public final Ll/ܽۢ֫;
.super Ll/ۛܿ᩷;
.source "C2R7"


# instance fields
.field public final synthetic ۙ:Ljava/util/List;

.field public final synthetic ᩷:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 988
    iput-object p1, p0, Ll/ܽۢ֫;->᩷:Ljava/util/List;

    iput-object p2, p0, Ll/ܽۢ֫;->ۙ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ۙ()I
    .locals 1

    .line 996
    iget-object v0, p0, Ll/ܽۢ֫;->ۙ:Ljava/util/List;

    invoke-static {v0}, Ll/ۗܰ;->ۡ۬۫(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ۙ(II)Z
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, -0x70432d12

    sget v7, Ll/֫ۢ;->ۚ᩻᩵:I

    sget v8, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v9, "\u1a78\u06df"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x31

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6129

    const v11, -0x72c4478a

    xor-int/2addr v10, v11

    const v11, 0x36f94c60

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0x52dd

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 1862
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    sget v9, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v9, :cond_8

    goto/16 :goto_4

    .line 259
    :sswitch_1
    sget v9, Ll/֡ܳ;->֨ᩳۢ:I

    if-lez v9, :cond_a

    goto :goto_1

    .line 473
    :sswitch_2
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v9

    if-nez v9, :cond_c

    :goto_1
    const-string v9, "\u06dc\u06eb"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x75

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0xde5

    const v11, 0x552eac6a    # 1.2003471E13f

    xor-int/2addr v10, v11

    const v11, -0x4ad1f79f

    goto :goto_0

    .line 1808
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    const/4 p1, 0x0

    return p1

    :sswitch_4
    const/4 p1, 0x1

    return p1

    :sswitch_5
    const/4 p1, 0x0

    return p1

    .line 1007
    :sswitch_6
    iget-object v9, v5, Ll/᩵ۢ֫;->᩻:Landroid/content/pm/PackageInfo;

    .line 2347
    iget-wide v9, v9, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v11, v2, v9

    if-nez v11, :cond_0

    const-string v9, "\u05ab\u1a76"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x2d9

    const v11, 0x5ff739b

    xor-int/2addr v10, v11

    const v11, -0x4b3fcde3

    goto :goto_0

    :cond_0
    const-string v9, "\u1a76\u06e7"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x79

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x5b23

    const v11, 0x640959b2

    xor-int/2addr v10, v11

    const v11, 0x1b20507c

    goto :goto_0

    .line 1007
    :sswitch_7
    move-object v5, v4

    check-cast v5, Ll/᩵ۢ֫;

    .line 2285
    sget v9, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v9, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v9, "\u1a74\u06d8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x1d

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x3a9b

    const v11, -0x1cb9c7d

    xor-int/2addr v10, v11

    const v11, 0x73c0fefb

    goto/16 :goto_0

    .line 2347
    :sswitch_8
    iget-wide v2, v1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 1006
    iget-object v4, p0, Ll/ܽۢ֫;->ۙ:Ljava/util/List;

    .line 1007
    invoke-static {v4, p2}, Ll/֫֡;->᩻ۚ᩻(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    .line 538
    sget v9, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v9, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v9, "\u06db\u073a"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0xf5f

    const v11, 0x66ddb117

    xor-int/2addr v10, v11

    const v11, 0x3f9a9f7e

    goto/16 :goto_0

    .line 1006
    :sswitch_9
    move-object v1, v0

    check-cast v1, Ll/᩵ۢ֫;

    iget-object v1, v1, Ll/᩵ۢ֫;->᩻:Landroid/content/pm/PackageInfo;

    sget v9, Ll/۟ۢ֫;->ۡ᩷:I

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v9

    if-gtz v9, :cond_3

    goto :goto_2

    :cond_3
    const-string v9, "\u05ab\u1a78"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x53

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x7b85

    const v11, 0x43a9e84b

    xor-int/2addr v10, v11

    const v11, 0x4af98139    # 8175772.5f

    goto/16 :goto_0

    :sswitch_a
    iget-object v0, p0, Ll/ܽۢ֫;->᩷:Ljava/util/List;

    invoke-static {v0, p1}, Ll/ۗ᩸;->ܰ֫ۢ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 1551
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v9

    if-eqz v9, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v9, "\u1a79\u05a1"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x53

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x2437

    const v11, 0x11b05eb6

    xor-int/2addr v10, v11

    const v11, 0x3908ebfc

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v9, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v9, :cond_5

    goto :goto_3

    :cond_5
    const-string v9, "\u1a79\u06ec"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x49

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x237f

    const v11, 0x2fd575a1

    xor-int/2addr v10, v11

    const v11, 0x693fd2e5

    goto/16 :goto_0

    .line 339
    :sswitch_c
    sget v9, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v9, :cond_6

    :goto_2
    const-string v9, "\u05a1\u06dc"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x4f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x7279

    const v11, 0x497bd343

    xor-int/2addr v10, v11

    const v11, -0x5ed9338b

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u06e0\u06d6"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0xb9b

    const v11, -0x722fa26c

    xor-int/2addr v10, v11

    const v11, 0x3badd4fd

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v9, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v9, :cond_7

    goto :goto_4

    :cond_7
    const-string v9, "\u1a77\u1a77"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x27

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x4bf1

    const v11, 0x4f6aacc6

    xor-int/2addr v10, v11

    const v11, 0x28d6834b

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v9, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v9, :cond_9

    :cond_8
    :goto_3
    const-string v9, "\u0736\u05a8"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x47

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0xd7b

    const v11, 0x4352645c

    xor-int/2addr v10, v11

    const v11, 0x3c6315d9

    goto/16 :goto_0

    :cond_9
    const-string v9, "\u06dc\u06ec"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6835

    const v11, -0x56e8342c

    xor-int/2addr v10, v11

    const v11, 0x76613836

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    :goto_4
    const-string v9, "\u0733\u06e4"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x4b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x47f1

    const v11, 0x361186b4

    xor-int/2addr v10, v11

    const v11, -0x647933b9

    goto/16 :goto_0

    :cond_b
    const-string v9, "\u06dc\u06e2"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x137f

    const v11, 0x76c3f16e

    xor-int/2addr v10, v11

    const v11, -0x7d2af76b

    goto/16 :goto_0

    .line 1675
    :sswitch_10
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v9

    if-nez v9, :cond_d

    :cond_c
    :goto_5
    const-string v9, "\u06d7\u1a73"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x2f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x4c89

    const v11, 0x430939a1

    xor-int/2addr v10, v11

    const v11, 0x63b39f83

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u06d9\u1a73"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5019

    const v11, -0x1bd9e3de

    xor-int/2addr v10, v11

    const v11, -0x37877d23

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b225aff -> :sswitch_4
        -0x7afce1bf -> :sswitch_10
        -0x65e030b5 -> :sswitch_9
        -0x632603c7 -> :sswitch_1
        -0x5c4e40d2 -> :sswitch_4
        -0x4a07b65d -> :sswitch_a
        -0x466aa14c -> :sswitch_2
        -0x4010e26a -> :sswitch_5
        -0x30c5e663 -> :sswitch_e
        -0x20f6d481 -> :sswitch_f
        -0x1dcffbae -> :sswitch_6
        -0x19cf1f0c -> :sswitch_e
        -0x11618d92 -> :sswitch_d
        -0x3c29964 -> :sswitch_3
        0x308398b -> :sswitch_8
        0x90850b4 -> :sswitch_3
        0x1284d041 -> :sswitch_d
        0x21abc59d -> :sswitch_0
        0x26f96fd8 -> :sswitch_a
        0x28eb03d9 -> :sswitch_7
        0x2bb8858e -> :sswitch_7
        0x367c6c04 -> :sswitch_6
        0x384c1fc8 -> :sswitch_1
        0x44a1082c -> :sswitch_2
        0x45eba473 -> :sswitch_c
        0x4a10982f -> :sswitch_10
        0x537a5092 -> :sswitch_8
        0x55032dd4 -> :sswitch_5
        0x5ce9b4ec -> :sswitch_9
        0x5f483cec -> :sswitch_b
        0x6565cad8 -> :sswitch_0
        0x67f60da4 -> :sswitch_c
        0x73ecc3f5 -> :sswitch_b
        0x7d68681e -> :sswitch_f
    .end sparse-switch
.end method

.method public final ᩷()I
    .locals 1

    .line 991
    iget-object v0, p0, Ll/ܽۢ֫;->᩷:Ljava/util/List;

    invoke-static {v0}, Ll/ۖᩳ;->ۗ۠ۢ(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ᩷(II)Z
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0xe7f1689

    sget v5, Ll/֫֨;->᩶ܺۡ:I

    sget v6, Ll/ۘ֡;->᩹ܶ۬:I

    const-string v7, "\u06dc\u05a8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2f63

    const v9, 0x1dc99c09

    xor-int/2addr v8, v9

    const v9, 0x79a7bf77

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, -0x3865

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    const/4 p1, 0x0

    return p1

    .line 360
    :sswitch_0
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget v7, Ll/ۖ᩹;->۫ܽۗ:I

    if-gez v7, :cond_5

    goto/16 :goto_4

    .line 854
    :sswitch_1
    sget v7, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v7, :cond_a

    goto/16 :goto_3

    .line 70
    :sswitch_2
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v7

    if-gtz v7, :cond_7

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    goto/16 :goto_1

    .line 1001
    :sswitch_4
    check-cast v3, Ll/᩵ۢ֫;

    iget-object p1, v3, Ll/᩵ۢ֫;->ܺ:Ljava/lang/String;

    invoke-static {v2, p1}, Ll/ۗܶ;->᩵֡ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :sswitch_5
    iget-object v2, v1, Ll/᩵ۢ֫;->ܺ:Ljava/lang/String;

    iget-object v3, p0, Ll/ܽۢ֫;->ۙ:Ljava/util/List;

    invoke-static {v3, p2}, Ll/ۗ᩸;->ܰ֫ۢ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    .line 998
    sget v7, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v7, :cond_0

    goto :goto_1

    :cond_0
    const-string v7, "\u05ab\u06db"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7fbf

    const v9, -0x132f483c

    xor-int/2addr v8, v9

    const v9, -0x4f9c13f1

    goto :goto_0

    .line 1001
    :sswitch_6
    invoke-static {v0, p1}, Ll/ۗ᩸;->ܰ֫ۢ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵ۢ֫;

    sget v7, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v7, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v7, "\u06e8\u06e8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1217

    const v9, 0x1e40cac3

    xor-int/2addr v8, v9

    const v9, 0x2b7a452b

    goto :goto_0

    :sswitch_7
    iget-object v0, p0, Ll/ܽۢ֫;->᩷:Ljava/util/List;

    sget v7, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v7, :cond_2

    goto :goto_2

    :cond_2
    const-string v7, "\u1a73\u06d9"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x15b3

    const v9, 0x32b8a997

    xor-int/2addr v8, v9

    const v9, -0x29a11caa

    goto/16 :goto_0

    .line 365
    :sswitch_8
    sget v7, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v7, :cond_3

    goto :goto_3

    :cond_3
    const-string v7, "\u06e8\u0730"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x217f

    const v9, 0x5b0a9b13

    xor-int/2addr v8, v9

    const v9, -0x72cfa596

    goto/16 :goto_0

    :sswitch_9
    sget v7, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v7, :cond_4

    :goto_1
    const-string v7, "\u06e8\u06e2"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x69

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3a2b

    const v9, 0x570c4d79

    xor-int/2addr v8, v9

    const v9, 0x39412482

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u0736\u06d7"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3143

    const v9, 0x26caf3fa

    xor-int/2addr v8, v9

    const v9, 0xc3e19e

    goto/16 :goto_0

    .line 622
    :sswitch_a
    sget-boolean v7, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v7, :cond_6

    :cond_5
    :goto_2
    const-string v7, "\u1a77\u06e8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1a17

    const v9, -0x7e8a92d0

    xor-int/2addr v8, v9

    const v9, 0x3061df3b

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u06ec\u06d8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5137

    const v9, -0x43594ece

    xor-int/2addr v8, v9

    const v9, -0x1793e98b

    goto/16 :goto_0

    .line 487
    :sswitch_b
    sget v7, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v7, :cond_8

    :cond_7
    :goto_3
    const-string v7, "\u073a\u06eb"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x4f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x66df

    const v9, -0x70edcd7

    xor-int/2addr v8, v9

    const v9, -0x2c411195

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u06df\u073f"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4bc9

    const v9, -0x5f31bcf

    xor-int/2addr v8, v9

    const v9, 0x5e12534b

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v7, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v7, :cond_9

    goto :goto_4

    :cond_9
    const-string v7, "\u06da\u06d8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xfcd

    const v9, -0x54ff42d2

    xor-int/2addr v8, v9

    const v9, -0x192a99fa

    goto/16 :goto_0

    :sswitch_d
    sget v7, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v7, :cond_b

    :cond_a
    :goto_4
    const-string v7, "\u073f\u06d7"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6ac5

    const v9, -0x7174edee

    xor-int/2addr v8, v9

    const v9, -0x17e82cbc

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u06e7\u06e1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x55

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x32b9

    const v9, -0x13c89c90

    xor-int/2addr v8, v9

    const v9, -0x58dd5212

    goto/16 :goto_0

    .line 686
    :sswitch_e
    sget v7, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v7, :cond_c

    :goto_5
    const-string v7, "\u1a7b\u06d7"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7699

    const v9, -0x1fb064b3

    xor-int/2addr v8, v9

    const v9, -0x741c5280

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06e8\u06db"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x63

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5cfb

    const v9, 0x19341137

    xor-int/2addr v8, v9

    const v9, 0x55bda7c4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6d7f2a71 -> :sswitch_2
        -0x6d04d556 -> :sswitch_9
        -0x686ee766 -> :sswitch_c
        -0x5e412b61 -> :sswitch_8
        -0x5d8730f6 -> :sswitch_0
        -0x5b5721ec -> :sswitch_7
        -0x5613e043 -> :sswitch_4
        -0x5498582e -> :sswitch_2
        -0x5335c7dd -> :sswitch_6
        -0x401f4541 -> :sswitch_e
        -0x3ddb71fc -> :sswitch_d
        -0x350b44d4 -> :sswitch_4
        -0x30b21bf2 -> :sswitch_b
        -0x2889a5db -> :sswitch_c
        -0x230cb068 -> :sswitch_1
        0x2e2c11d -> :sswitch_5
        0x5f42262 -> :sswitch_3
        0xb12b601 -> :sswitch_d
        0xe67889f -> :sswitch_b
        0x19fabd5c -> :sswitch_1
        0x24856eb8 -> :sswitch_a
        0x24c1e756 -> :sswitch_0
        0x295b5ec9 -> :sswitch_8
        0x309f574a -> :sswitch_7
        0x49e7f04d -> :sswitch_3
        0x503f3c0d -> :sswitch_e
        0x662ffa69 -> :sswitch_9
        0x67125f24 -> :sswitch_a
        0x68d88cd3 -> :sswitch_5
        0x79e3fd93 -> :sswitch_6
    .end sparse-switch
.end method

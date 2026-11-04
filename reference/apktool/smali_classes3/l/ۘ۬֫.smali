.class public final Ll/ۘ۬֫;
.super Ll/ۛܿ᩷;
.source "H6HS"


# instance fields
.field public final synthetic ۙ:Ll/ۢ۬֫;

.field public final synthetic ᩷:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۢ۬֫;Ljava/util/ArrayList;)V
    .locals 0

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 616
    iput-object p1, p0, Ll/ۘ۬֫;->ۙ:Ll/ۢ۬֫;

    iput-object p2, p0, Ll/ۘ۬֫;->᩷:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ۙ()I
    .locals 1

    .line 618
    iget-object v0, p0, Ll/ۘ۬֫;->ۙ:Ll/ۢ۬֫;

    invoke-static {v0}, Ll/ۢ۬֫;->ۚ(Ll/ۢ۬֫;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Ll/ۖܰ;->ۨۡܳ(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ۙ(II)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ᩷()I
    .locals 1

    .line 617
    iget-object v0, p0, Ll/ۘ۬֫;->᩷:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۖܰ;->ۨۡܳ(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ᩷(II)Z
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x511b75b7

    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v6, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v7, "\u1a74\u06da"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6359

    const v9, -0x28fee1cd

    xor-int/2addr v8, v9

    const v9, -0x2c44fa86

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, -0x869

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 620
    iget v2, v1, Ll/ܰ۬֫;->᩸:I

    iget-object v3, p0, Ll/ۘ۬֫;->ۙ:Ll/ۢ۬֫;

    invoke-static {v3}, Ll/ۢ۬֫;->ۚ(Ll/ۢ۬֫;)Ljava/util/ArrayList;

    move-result-object v3

    .line 587
    sget v7, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v7, :cond_1

    goto/16 :goto_1

    .line 557
    :sswitch_0
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v7, Ll/֡᩵;->ۤܳ۬:I

    if-gez v7, :cond_c

    goto/16 :goto_3

    .line 585
    :sswitch_1
    sget-boolean v7, Ll/ܽ;->᩷۬ۗ:Z

    if-eqz v7, :cond_4

    goto/16 :goto_3

    .line 160
    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget v7, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v7, :cond_9

    goto/16 :goto_2

    .line 68
    :sswitch_3
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    goto/16 :goto_2

    .line 324
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 p1, 0x1

    return p1

    :sswitch_6
    const/4 p1, 0x0

    return p1

    .line 620
    :sswitch_7
    invoke-static {v3, p2}, Ll/ۗ᩸;->ۙ۫ۧ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܰ۬֫;

    iget v7, v7, Ll/ܰ۬֫;->᩸:I

    if-ne v2, v7, :cond_0

    const-string v7, "\u0736\u06e1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x17

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2c25

    const v9, 0x34f84745

    xor-int/2addr v8, v9

    const v9, -0x4ac1e916

    goto :goto_0

    :cond_0
    const-string v7, "\u06d9\u06eb"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x4d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1b53

    const v9, 0x44d59a5

    xor-int/2addr v8, v9

    const v9, -0x38428213

    goto :goto_0

    :cond_1
    const-string v7, "\u1a79\u0730"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x77

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1059

    const v9, -0x21d38b68

    xor-int/2addr v8, v9

    const v9, -0x56b7402f

    goto/16 :goto_0

    :sswitch_8
    invoke-static {v0, p1}, Ll/ۗ᩸;->ۙ۫ۧ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰ۬֫;

    .line 26
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v7

    if-nez v7, :cond_2

    :goto_1
    const-string v7, "\u06d9\u1a79"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x1f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2053

    const v9, 0x5c21d3fd

    xor-int/2addr v8, v9

    const v9, 0x6a67d050

    goto/16 :goto_0

    :cond_2
    const-string v7, "\u073d\u1a75"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2d73

    const v9, -0x5cf56797

    xor-int/2addr v8, v9

    const v9, -0x24cb82f8

    goto/16 :goto_0

    .line 620
    :sswitch_9
    iget-object v0, p0, Ll/ۘ۬֫;->᩷:Ljava/util/ArrayList;

    .line 273
    sget v7, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v7, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v7, "\u0736\u05a1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x15

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x422d

    const v9, 0x1ae0269d

    xor-int/2addr v8, v9

    const v9, -0x6d74c236

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v7

    if-gtz v7, :cond_5

    :cond_4
    const-string v7, "\u06dc\u0733"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x6b09

    const v9, -0x2a6f5294

    xor-int/2addr v8, v9

    const v9, 0xa72d8e7

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u1a7b\u1a7b"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x6f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5e7f

    const v9, 0x3c5c50f4

    xor-int/2addr v8, v9

    const v9, 0x3d6bce6f

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v7

    if-nez v7, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v7, "\u1a73\u06e0"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x6b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6099

    const v9, 0x1ef09c41

    xor-int/2addr v8, v9

    const v9, -0x57f56ed4

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v7, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v7, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v7, "\u0730\u06d7"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x43b

    const v9, -0x3a306d1d

    xor-int/2addr v8, v9

    const v9, 0x5776e9cf

    goto/16 :goto_0

    .line 134
    :sswitch_d
    sget v7, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v7, :cond_8

    :goto_2
    const-string v7, "\u073a\u1a73"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2ae7

    const v9, -0x255fefff

    xor-int/2addr v8, v9

    const v9, -0x60d9ea5d

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u1a74\u05a8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1a55

    const v9, 0xf4422ba

    xor-int/2addr v8, v9

    const v9, -0x508290e0

    goto/16 :goto_0

    .line 554
    :sswitch_e
    sget v7, Ll/᩺;->۫۬۫:I

    if-gtz v7, :cond_a

    :cond_9
    :goto_3
    const-string v7, "\u06e1\u073d"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0xd

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x269f

    const v9, 0x26604329

    xor-int/2addr v8, v9

    const v9, 0x28ba54ca

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u1a78\u073f"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x54c3

    const v9, 0x585e116

    xor-int/2addr v8, v9

    const v9, 0x443afe50

    goto/16 :goto_0

    .line 605
    :sswitch_f
    sget v7, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v7, :cond_b

    goto :goto_4

    :cond_b
    const-string v7, "\u0730\u06e1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x452b

    const v9, -0x965689a

    xor-int/2addr v8, v9

    const v9, 0x27f104b6

    goto/16 :goto_0

    .line 559
    :sswitch_10
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v7

    if-eqz v7, :cond_d

    :cond_c
    :goto_4
    const-string v7, "\u06e0\u06db"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x35

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1a5

    const v9, 0x36467e6c

    xor-int/2addr v8, v9

    const v9, -0x6c6fc9b3

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u1a7b\u1a76"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x33a9

    const v9, -0x8dbe304

    xor-int/2addr v8, v9

    const v9, 0x4c420ce

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a378bf8 -> :sswitch_7
        -0x74d5aa19 -> :sswitch_0
        -0x730fa7c6 -> :sswitch_3
        -0x6e7e0a20 -> :sswitch_8
        -0x65417a2d -> :sswitch_f
        -0x6435cc45 -> :sswitch_c
        -0x5edc9bae -> :sswitch_9
        -0x4d8fad44 -> :sswitch_f
        -0x4782ff35 -> :sswitch_1
        -0x1827c706 -> :sswitch_2
        -0x1004a0f4 -> :sswitch_10
        -0x681aa7c -> :sswitch_5
        -0x552f9d5 -> :sswitch_3
        -0x36f5aab -> :sswitch_6
        -0x2ff6684 -> :sswitch_5
        0xa561d20 -> :sswitch_0
        0xac992a0 -> :sswitch_a
        0x19c96bbd -> :sswitch_c
        0x1f9da751 -> :sswitch_7
        0x25e874c1 -> :sswitch_b
        0x281ad15d -> :sswitch_4
        0x2991d2f3 -> :sswitch_4
        0x32ed4bf2 -> :sswitch_6
        0x36a7bd3e -> :sswitch_d
        0x383ae184 -> :sswitch_8
        0x3c3f62df -> :sswitch_b
        0x556f99ae -> :sswitch_e
        0x650f02b5 -> :sswitch_10
        0x6b5b1212 -> :sswitch_1
        0x6eef203d -> :sswitch_d
        0x76b18a76 -> :sswitch_9
        0x7721ec0d -> :sswitch_e
        0x78ec7b99 -> :sswitch_2
        0x7dca8802 -> :sswitch_a
    .end sparse-switch
.end method

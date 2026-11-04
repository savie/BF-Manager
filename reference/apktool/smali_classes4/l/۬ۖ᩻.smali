.class public final synthetic Ll/۬ۖ᩻;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/ܳ۬᩻;


# instance fields
.field public final synthetic ֡:Ll/֨۠᩻;

.field public final synthetic ܰ:Ll/۬֨ᩴ;

.field public final synthetic ܿ:Landroid/widget/EditText;

.field public final synthetic ᩶:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Ll/۬֨ᩴ;Landroid/view/View;Landroid/widget/EditText;Ll/֨۠᩻;)V
    .locals 6

    const v0, -0x2b3e1bdf

    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    sget v2, Ll/ۘܶ;->ܶ᩵ۢ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e0\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1929

    const v5, 0x52159b8c

    xor-int/2addr v4, v5

    const v5, 0x30407de8

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x7cf3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p3, p0, Ll/۬ۖ᩻;->ܿ:Landroid/widget/EditText;

    iput-object p4, p0, Ll/۬ۖ᩻;->֡:Ll/֨۠᩻;

    return-void

    :sswitch_0
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-nez v3, :cond_b

    goto :goto_1

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_4

    :sswitch_2
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_9

    goto :goto_1

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    :goto_1
    const-string v3, "\u06e7\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x567b

    const v5, 0x64073dc2

    xor-int/2addr v4, v5

    const v5, 0x37503e04

    goto :goto_0

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v3

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06d9\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5465

    const v5, 0x78e78542

    xor-int/2addr v4, v5

    const v5, -0xbceeaf4

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u0730\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4d9b

    const v5, 0x24749bd2

    xor-int/2addr v4, v5

    const v5, -0x350bb2b6    # -8005285.0f

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v3

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06e0\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7e8f

    const v5, -0x744bff49

    xor-int/2addr v4, v5

    const v5, -0x69e5fc70

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u073a\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1747

    const v5, -0x3af2c9d9

    xor-int/2addr v4, v5

    const v5, 0x24b69805

    goto/16 :goto_0

    .line 3
    :sswitch_9
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u1a76\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x469b

    const v5, 0x3f47eb21

    xor-int/2addr v4, v5

    const v5, 0x15f8f1d8

    goto/16 :goto_0

    .line 1
    :sswitch_a
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v3

    if-ltz v3, :cond_5

    :goto_2
    const-string v3, "\u05a1\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5355

    const v5, 0x337e4ece

    xor-int/2addr v4, v5

    const v5, 0x5e657c7a

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06d8\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x58a1

    const v5, -0x765ea630

    xor-int/2addr v4, v5

    const v5, -0x7df5a746

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06e7\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5d21

    const v5, 0x638b192b

    xor-int/2addr v4, v5

    const v5, -0x4836165f

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_8

    :cond_7
    :goto_3
    const-string v3, "\u06d7\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6d05

    const v5, 0x3427a6e6

    xor-int/2addr v4, v5

    const v5, 0x6f6cfce

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u05ab\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5b91

    const v5, 0x52097c77

    xor-int/2addr v4, v5

    const v5, 0x5bae573c

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06df\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4783

    const v5, 0x5a013cb3

    xor-int/2addr v4, v5

    const v5, 0x19cd2d01

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u0730\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x14b9

    const v5, 0x58c5d8da

    xor-int/2addr v4, v5

    const v5, -0x7e0c6ea0

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/۬ۖ᩻;->ܰ:Ll/۬֨ᩴ;

    iput-object p2, p0, Ll/۬ۖ᩻;->᩶:Landroid/view/View;

    .line 3
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_c

    :cond_b
    const-string v3, "\u06e8\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2573

    const v5, 0x24bf7ec3

    xor-int/2addr v4, v5

    const v5, 0x1a163dda

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073a\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3711

    const v5, -0x4a6ef44b

    xor-int/2addr v4, v5

    const v5, -0x28fb096

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c14c5ba -> :sswitch_b
        -0x77a91729 -> :sswitch_a
        -0x73f84b3e -> :sswitch_3
        -0x6dfebc23 -> :sswitch_7
        -0x61e4e29b -> :sswitch_c
        -0x5d87b930 -> :sswitch_c
        -0x574830d3 -> :sswitch_e
        -0x4fa04c9d -> :sswitch_5
        -0x4babdfb6 -> :sswitch_6
        -0x4b727245 -> :sswitch_1
        -0x4ad66710 -> :sswitch_0
        -0x33844cd6 -> :sswitch_4
        -0x316263ea -> :sswitch_8
        -0x2bf13e31 -> :sswitch_3
        -0x282f4634 -> :sswitch_b
        -0x226fbf69 -> :sswitch_2
        -0x1fc10db6 -> :sswitch_7
        -0x172d7659 -> :sswitch_0
        -0x14d908a3 -> :sswitch_e
        -0x147c3cc0 -> :sswitch_6
        -0xcdabf5e -> :sswitch_a
        0x54192ca -> :sswitch_4
        0xe53ad14 -> :sswitch_8
        0x1192fe10 -> :sswitch_5
        0x2352aff3 -> :sswitch_1
        0x34bd8b30 -> :sswitch_9
        0x4bc797f2 -> :sswitch_d
        0x512de6d7 -> :sswitch_d
        0x547dbfbe -> :sswitch_9
        0x785a35a1 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ(Ll/۬ۢ᩻;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x4640ee53

    sget v3, Ll/᩺;->۫۬۫:I

    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    const-string v5, "\u1a74\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6a69

    const v7, 0x760a31f4

    xor-int/2addr v6, v7

    const v7, 0x5a49993a

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x4779

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v5

    if-gtz v5, :cond_4

    goto :goto_1

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v5, Ll/ۧ;->ۨۗܰ:I

    if-ltz v5, :cond_9

    goto :goto_1

    :sswitch_1
    sget v5, Ll/ۘ֡;->᩹ܶ۬:I

    if-lez v5, :cond_b

    goto :goto_1

    .line 4
    :sswitch_2
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    goto :goto_1

    .line 1
    :sswitch_3
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    return-void

    .line 0
    :sswitch_4
    iget-object v2, p0, Ll/۬ۖ᩻;->ܰ:Ll/۬֨ᩴ;

    iget-object v3, p0, Ll/۬ۖ᩻;->᩶:Landroid/view/View;

    invoke-static {v2, v3, v0, v1, p1}, Ll/֨۠᩻;->ۙ(Ll/۬֨ᩴ;Landroid/view/View;Landroid/widget/EditText;Ll/֨۠᩻;Ll/۬ۢ᩻;)V

    return-void

    :sswitch_5
    iget-object v1, p0, Ll/۬ۖ᩻;->֡:Ll/֨۠᩻;

    sget v5, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u1a73\u05a1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x58fd

    const v7, -0x8de537a

    xor-int/2addr v6, v7

    const v7, 0x563794d1

    goto :goto_0

    :sswitch_6
    iget-object v0, p0, Ll/۬ۖ᩻;->ܿ:Landroid/widget/EditText;

    .line 3
    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u1a7b\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x72ef

    const v7, 0x415029ba

    xor-int/2addr v6, v7

    const v7, 0xc291b1c

    goto :goto_0

    .line 2
    :sswitch_7
    sget v5, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v5, :cond_2

    :goto_1
    const-string v5, "\u1a79\u06db"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x49

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7807

    const v7, 0x1c7b2551

    xor-int/2addr v6, v7

    const v7, -0x6e30b62d

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u05a1\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1c2f

    const v7, 0x759bfa8e

    xor-int/2addr v6, v7

    const v7, 0x2c0238f4

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v5, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u073d\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4dc7

    const v7, -0x6c2514bc

    xor-int/2addr v6, v7

    const v7, 0x7fc4f49e

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v5, :cond_5

    :cond_4
    const-string v5, "\u05a1\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1f6b

    const v7, 0x1560eba7

    xor-int/2addr v6, v7

    const v7, 0x5076b65a

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u05ab\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xe79

    const v7, -0x53e6dfc4

    xor-int/2addr v6, v7

    const v7, 0x6e4f553e

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget-boolean v5, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v5, :cond_6

    :goto_2
    const-string v5, "\u06d8\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2e3d

    const v7, -0x40beda7a

    xor-int/2addr v6, v7

    const v7, -0x44606810

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06e4\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4f63

    const v7, -0x3cb8704c

    xor-int/2addr v6, v7

    const v7, 0x53efed5

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u073d\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x54d1

    const v7, 0x79c935ba

    xor-int/2addr v6, v7

    const v7, 0x2e149cb1

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v5, :cond_8

    goto :goto_4

    :cond_8
    const-string v5, "\u06db\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x57ed

    const v7, -0x2e9c70a6

    xor-int/2addr v6, v7

    const v7, 0x245459c8

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u1a79\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6833

    const v7, 0x5b34fa2c

    xor-int/2addr v6, v7

    const v7, -0xcd3d67f

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a78\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x77

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x67fd

    const v7, 0x670eda8a

    xor-int/2addr v6, v7

    const v7, -0x3409297a    # -3.2353548E7f

    goto/16 :goto_0

    .line 4
    :sswitch_e
    sget v5, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u073d\u06ec"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x31f1

    const v7, 0x2ee2871f

    xor-int/2addr v6, v7

    const v7, -0x7e2264f3

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06ec\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x189d

    const v7, 0x1418fb03

    xor-int/2addr v6, v7

    const v7, 0x213d6800

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c17cfdc -> :sswitch_3
        -0x6a221300 -> :sswitch_c
        -0x5b8ab339 -> :sswitch_6
        -0x599c45fa -> :sswitch_a
        -0x56b58ba5 -> :sswitch_d
        -0x41dc7068 -> :sswitch_0
        -0x37d43d44 -> :sswitch_8
        -0x225b9817 -> :sswitch_9
        -0x21bc932b -> :sswitch_4
        -0x1be9f5ce -> :sswitch_e
        -0x1b0eea1d -> :sswitch_2
        -0x19c7dda5 -> :sswitch_8
        0x1f73ef3 -> :sswitch_1
        0x63d18fc -> :sswitch_b
        0x13dd1270 -> :sswitch_9
        0x1eb7e4a7 -> :sswitch_b
        0x2c67e502 -> :sswitch_6
        0x2edd581f -> :sswitch_d
        0x30a9cb5c -> :sswitch_5
        0x33e88d18 -> :sswitch_0
        0x36c974ae -> :sswitch_5
        0x45275ddf -> :sswitch_7
        0x4f5139ae -> :sswitch_c
        0x5de0cda8 -> :sswitch_7
        0x5e08fc4d -> :sswitch_a
        0x60a9f31b -> :sswitch_e
        0x62b3eded -> :sswitch_1
        0x6a952d3e -> :sswitch_2
        0x744380e5 -> :sswitch_4
        0x7894059b -> :sswitch_3
    .end sparse-switch
.end method

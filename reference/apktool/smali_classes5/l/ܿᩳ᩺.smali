.class public final synthetic Ll/ܿᩳ᩺;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ll/ܶ᩶۠;


# instance fields
.field public final synthetic ܺ:Ll/᩻ᩳ᩺;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ᩳ᩺;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿᩳ᩺;->ܺ:Ll/᩻ᩳ᩺;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x243b5561

    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    const-string v4, "\u1a73\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7027

    const v6, -0x16e5da8c

    xor-int/2addr v5, v6

    const v6, -0x4464510

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x4ff1

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_c

    goto/16 :goto_5

    .line 2
    :sswitch_0
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_3

    goto/16 :goto_3

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v4, :cond_6

    goto/16 :goto_4

    .line 2
    :sswitch_2
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_a

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    :goto_1
    const-string v4, "\u1a77\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x36b

    const v6, -0x5e13a1a

    xor-int/2addr v5, v6

    const v6, 0x3284ebcf

    goto :goto_0

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    check-cast p1, Ll/֫ۡ᩺;

    invoke-static {v0, p1}, Ll/᩻ᩳ᩺;->ܰ(Ll/᩻ᩳ᩺;Ll/֫ۡ᩺;)Ll/۟۟۠;

    move-result-object p1

    return-object p1

    :sswitch_6
    iget-object v0, p0, Ll/ܿᩳ᩺;->ܺ:Ll/᩻ᩳ᩺;

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v4

    if-gtz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v4, "\u0730\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x32cd

    const v6, -0x45afcdaa

    xor-int/2addr v5, v6

    const v6, -0x4dbf36bf

    goto :goto_0

    .line 2
    :sswitch_7
    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u1a74\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4a17

    const v6, -0x222d84fd

    xor-int/2addr v5, v6

    const v6, -0x1e1b8f7c

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u06d6\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1ddf

    const v6, 0x2b44cea

    xor-int/2addr v5, v6

    const v6, -0x449d5f91

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v4

    if-ltz v4, :cond_4

    :cond_3
    :goto_2
    const-string v4, "\u1a79\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4a15

    const v6, -0x550a46de

    xor-int/2addr v5, v6

    const v6, 0x5dc54f73

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u0736\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xad

    const v6, 0x2576a0ec

    xor-int/2addr v5, v6

    const v6, 0x12dbc04e

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v4, "\u073d\u0730"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x41ad

    const v6, -0x66ecc2f

    xor-int/2addr v5, v6

    const v6, -0x12242182

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v4, :cond_7

    :cond_6
    :goto_3
    const-string v4, "\u06e8\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7e8f

    const v6, -0x2475e4fa

    xor-int/2addr v5, v6

    const v6, -0x542bdfce

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e4\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6ee9

    const v6, -0x26c0fc47

    xor-int/2addr v5, v6

    const v6, -0xf0ecafe

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v4, :cond_8

    goto :goto_5

    :cond_8
    const-string v4, "\u06d8\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x56ad

    const v6, -0x193fcd47

    xor-int/2addr v5, v6

    const v6, -0x50402602

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v4, "\u06e1\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x68c3

    const v6, -0x26c2d0e7

    xor-int/2addr v5, v6

    const v6, 0x30e176dc

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u06dc\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4ca7

    const v6, -0x933499

    xor-int/2addr v5, v6

    const v6, -0x1e6967b8

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u073a\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1645

    const v6, 0x66d214af

    xor-int/2addr v5, v6

    const v6, 0x740701ea

    goto/16 :goto_0

    :goto_5
    const-string v4, "\u1a7a\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4d37

    const v6, -0x4c93b769

    xor-int/2addr v5, v6

    const v6, 0x174f8545

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7b\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2387

    const v6, -0x3aa49eee

    xor-int/2addr v5, v6

    const v6, 0x518a6de

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6b657dc9 -> :sswitch_6
        -0x4f492415 -> :sswitch_8
        -0x4bafd642 -> :sswitch_9
        -0x3ddd7108 -> :sswitch_5
        -0x3bc120da -> :sswitch_3
        -0x2d8550f8 -> :sswitch_0
        -0x27f6f500 -> :sswitch_1
        -0x246d9574 -> :sswitch_2
        -0x23195d4c -> :sswitch_1
        -0x211c2078 -> :sswitch_3
        -0x20eb6b49 -> :sswitch_5
        -0x2065d652 -> :sswitch_d
        -0x20064734 -> :sswitch_b
        -0x1a925cc9 -> :sswitch_4
        -0x19b981e3 -> :sswitch_b
        -0xdbfbc29 -> :sswitch_9
        -0xbb31166 -> :sswitch_6
        0x1d317e7 -> :sswitch_e
        0xd404071 -> :sswitch_8
        0xe2d7ebf -> :sswitch_7
        0x19630868 -> :sswitch_c
        0x2f7ae35c -> :sswitch_c
        0x3abc3f15 -> :sswitch_7
        0x42c11f1f -> :sswitch_4
        0x482bfe9e -> :sswitch_e
        0x557e643c -> :sswitch_a
        0x5a776036 -> :sswitch_2
        0x670a704b -> :sswitch_0
        0x756846d9 -> :sswitch_a
        0x771305f2 -> :sswitch_d
    .end sparse-switch
.end method

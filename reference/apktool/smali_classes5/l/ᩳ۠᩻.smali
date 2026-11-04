.class public final synthetic Ll/ᩳ۠᩻;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ll/֨۠᩻;


# direct methods
.method public synthetic constructor <init>(Ll/֨۠᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ۠᩻;->ܰ:Ll/֨۠᩻;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x6b021a2c

    sget v2, Ll/֨᩻;->ۛ֫ܶ:I

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    const-string v4, "\u073a\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x4b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3703

    const v6, -0x3e12d0dd

    xor-int/2addr v5, v6

    const v6, 0x79c0932c

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x147b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 268
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_3

    .line 24
    :sswitch_0
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_9

    goto/16 :goto_3

    .line 680
    :sswitch_1
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_3

    .line 733
    :sswitch_2
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    goto/16 :goto_3

    .line 707
    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    :sswitch_4
    return-void

    .line 934
    :sswitch_5
    new-instance v4, Ll/᩶۠᩻;

    iget-object v5, p0, Ll/ᩳ۠᩻;->ܰ:Ll/֨۠᩻;

    .line 68
    sget v6, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v6, :cond_0

    goto/16 :goto_1

    .line 934
    :cond_0
    invoke-direct {v4, v5, v0}, Ll/᩶۠᩻;-><init>(Ll/֨۠᩻;Ll/᩸ۡ᩻;)V

    .line 965
    invoke-static {v4}, Ll/ۖᩳ;->ۘۜ᩶(Ljava/lang/Object;)V

    return-void

    .line 914
    :sswitch_6
    invoke-static {v0}, Ll/֨ۨ;->ܺ᩵۠(Ljava/lang/Object;)V

    sget v4, Ll/֨۠᩻;->ۧ᩷:I

    .line 933
    iget-boolean v4, v0, Ll/᩸ۡ᩻;->ۙ:Z

    if-eqz v4, :cond_1

    const-string v4, "\u1a75\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x16f5

    const v6, 0x452477d1

    xor-int/2addr v5, v6

    const v6, -0x2346122

    goto :goto_0

    :cond_1
    const-string v4, "\u05a8\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xbc1

    const v6, 0x7f6a65d5

    xor-int/2addr v5, v6

    const v6, 0x135cd778

    goto :goto_0

    .line 2
    :sswitch_7
    move-object v0, p1

    check-cast v0, Ll/᩸ۡ᩻;

    .line 39
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v4

    if-gtz v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u073d\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x236d

    const v6, 0x80b320a

    xor-int/2addr v5, v6

    const v6, -0xfebde44

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u06d9\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2bed

    const v6, -0x17b6d0c5

    xor-int/2addr v5, v6

    const v6, 0xfac9c1c

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_5

    :cond_4
    const-string v4, "\u1a73\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x17cf

    const v6, -0x59f5e23

    xor-int/2addr v5, v6

    const v6, 0x7578c2ef

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u1a78\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x393d

    const v6, -0x5c4236e1

    xor-int/2addr v5, v6

    const v6, 0x4452b5cd

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_6

    :goto_1
    const-string v4, "\u06d9\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3a9f

    const v6, 0x1e71f7c9

    xor-int/2addr v5, v6

    const v6, 0x68d3062

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u073d\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1ad9

    const v6, 0x2b4f15a1

    xor-int/2addr v5, v6

    const v6, 0x1b231b52

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u06d7\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2eed

    const v6, -0x4ef51198

    xor-int/2addr v5, v6

    const v6, -0x1d4b001a

    goto/16 :goto_0

    .line 96
    :sswitch_c
    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u06d8\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4637

    const v6, 0x49acb7b1

    xor-int/2addr v5, v6

    const v6, -0x740404ff

    goto/16 :goto_0

    .line 903
    :sswitch_d
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u06d7\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2581

    const v6, -0x246ea3ae

    xor-int/2addr v5, v6

    const v6, -0x381470d7

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e2\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2187

    const v6, -0x2363ca72

    xor-int/2addr v5, v6

    const v6, 0x5e2bd6e7

    goto/16 :goto_0

    .line 577
    :sswitch_e
    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v4, :cond_c

    :cond_b
    const-string v4, "\u06e8\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5eff

    const v6, -0x32add749

    xor-int/2addr v5, v6

    const v6, 0x5328bacc

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u0733\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xcb7

    const v6, 0x1006f466

    xor-int/2addr v5, v6

    const v6, -0x3cb0205

    goto/16 :goto_0

    .line 76
    :sswitch_f
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_d

    :goto_3
    const-string v4, "\u05a8\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x341d

    const v6, 0x37679483

    xor-int/2addr v5, v6

    const v6, 0x6be25dc8

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06da\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x16d7

    const v6, 0x45cd233d

    xor-int/2addr v5, v6

    const v6, 0x427463f8

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bc137a3 -> :sswitch_3
        -0x7860e554 -> :sswitch_5
        -0x783970af -> :sswitch_b
        -0x6988e1b6 -> :sswitch_9
        -0x63e04ebe -> :sswitch_d
        -0x62f5d7a2 -> :sswitch_e
        -0x5d127a56 -> :sswitch_b
        -0x4e08d686 -> :sswitch_c
        -0x4d644514 -> :sswitch_8
        -0x46717294 -> :sswitch_a
        -0x430bba66 -> :sswitch_0
        -0x3fc58a2c -> :sswitch_7
        -0x3d83dc28 -> :sswitch_6
        -0x3d6f40cc -> :sswitch_5
        -0x3c734238 -> :sswitch_f
        -0x3a675251 -> :sswitch_1
        -0x19a8fbcf -> :sswitch_2
        -0x15916171 -> :sswitch_e
        -0xb00204a -> :sswitch_9
        -0x4982366 -> :sswitch_c
        0x1126106c -> :sswitch_8
        0x11583831 -> :sswitch_4
        0x13e83858 -> :sswitch_d
        0x14f8db7a -> :sswitch_f
        0x1895f16a -> :sswitch_1
        0x18a4d303 -> :sswitch_2
        0x22b64043 -> :sswitch_4
        0x27278f60 -> :sswitch_3
        0x2f6a4b55 -> :sswitch_6
        0x3dcab53a -> :sswitch_a
        0x6439c3ba -> :sswitch_7
        0x6713eaba -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

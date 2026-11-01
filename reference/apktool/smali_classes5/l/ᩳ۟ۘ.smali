.class public final synthetic Ll/ᩳ۟ۘ;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/ۤ᩺ۙ;


# instance fields
.field public final synthetic ܺ:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ۟ۘ;->ܺ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x5255b1

    sget v2, Ll/֫֡;->ۡ᩹ۗ:I

    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v4, "\u1a75\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2b01

    const v6, -0x1662b21b

    xor-int/2addr v5, v6

    const v6, -0x4a2bb055

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x7a19

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_3

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_1

    .line 3
    :sswitch_1
    sget-boolean v4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v4, :cond_8

    goto/16 :goto_3

    .line 4
    :sswitch_2
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    return-void

    .line 0
    :sswitch_4
    check-cast p1, Ljava/lang/Long;

    invoke-static {v0, p1}, Lbin/mt/plus/Main;->ۙ(Lbin/mt/plus/Main;Ljava/lang/Long;)V

    return-void

    :sswitch_5
    iget-object v0, p0, Ll/ᩳ۟ۘ;->ܺ:Lbin/mt/plus/Main;

    .line 3
    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u06e0\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x166b

    const v6, -0x70d06786

    xor-int/2addr v5, v6

    const v6, -0x30f6382a

    goto :goto_0

    :sswitch_6
    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v4, :cond_2

    :cond_1
    :goto_1
    const-string v4, "\u06d9\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7149

    const v6, 0x1009d09b

    xor-int/2addr v5, v6

    const v6, -0x574630ea

    goto :goto_0

    :cond_2
    const-string v4, "\u073a\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3e1

    const v6, -0x5e094fc8

    xor-int/2addr v5, v6

    const v6, 0x6a5dda1f

    goto/16 :goto_0

    .line 1
    :sswitch_7
    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u1a7b\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x92d

    const v6, 0x7bc76819

    xor-int/2addr v5, v6

    const v6, 0x40dbc19d

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u06dc\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x101d

    const v6, -0x2a0357d7

    xor-int/2addr v5, v6

    const v6, 0x90c2895

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u073d\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x73c9

    const v6, 0x43dd5c61

    xor-int/2addr v5, v6

    const v6, 0x9068a86

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget-boolean v4, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v4, :cond_7

    :cond_6
    :goto_2
    const-string v4, "\u06d6\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x78a3

    const v6, 0x3dc82fa1

    xor-int/2addr v5, v6

    const v6, -0x61b4cd1e

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a73\u06d7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xf93

    const v6, -0x7f0a98e5

    xor-int/2addr v5, v6

    const v6, 0x763cce51

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v4

    if-gtz v4, :cond_9

    :cond_8
    const-string v4, "\u05ab\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3f23

    const v6, 0x6695a21d

    xor-int/2addr v5, v6

    const v6, 0x1d6acaec

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a7b\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xea1

    const v6, 0x4de5407c    # 4.8077606E8f

    xor-int/2addr v5, v6

    const v6, 0x6776ebe3

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget-boolean v4, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u1a77\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6191

    const v6, 0x756f7e25

    xor-int/2addr v5, v6

    const v6, -0x4643de4a

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_b

    :goto_3
    const-string v4, "\u0733\u06e2"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5205

    const v6, 0x6fc32fd7

    xor-int/2addr v5, v6

    const v6, 0x79689bae

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06d8\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6095

    const v6, 0x70eeb0f6

    xor-int/2addr v5, v6

    const v6, -0x7de375de

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v4, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v4, :cond_c

    :goto_4
    const-string v4, "\u05a8\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x772b

    const v6, 0x4f175b52

    xor-int/2addr v5, v6

    const v6, 0x32b34bce

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a74\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x32af

    const v6, -0x629f18b3

    xor-int/2addr v5, v6

    const v6, -0x381db1b4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6d474784 -> :sswitch_d
        -0x65fb0cc9 -> :sswitch_6
        -0x607bc297 -> :sswitch_d
        -0x59f017a1 -> :sswitch_c
        -0x56f69b31 -> :sswitch_c
        -0x4daa656a -> :sswitch_8
        -0x3cf83d76 -> :sswitch_6
        -0x3bf2dde3 -> :sswitch_e
        -0x29a58bbc -> :sswitch_5
        -0x28c84140 -> :sswitch_1
        -0x284905c8 -> :sswitch_2
        -0x2783de37 -> :sswitch_4
        -0x2601bd3b -> :sswitch_4
        -0x1f341291 -> :sswitch_0
        -0x1e25d874 -> :sswitch_b
        -0x164092c4 -> :sswitch_a
        0x11b26843 -> :sswitch_1
        0x19404713 -> :sswitch_e
        0x210d4002 -> :sswitch_3
        0x2344f640 -> :sswitch_3
        0x25f36fd5 -> :sswitch_0
        0x293d4de1 -> :sswitch_9
        0x367f498c -> :sswitch_2
        0x37d3f9b5 -> :sswitch_7
        0x3b99136b -> :sswitch_7
        0x4148159c -> :sswitch_5
        0x4c60e498 -> :sswitch_a
        0x51635061 -> :sswitch_8
        0x5d2ac168 -> :sswitch_9
        0x61941ce0 -> :sswitch_b
    .end sparse-switch
.end method

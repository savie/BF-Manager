.class public final synthetic Ll/ܳ᩺֫;
.super Ljava/lang/Object;
.source "K3YT"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, -0x6395898c

    sget v1, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v2, Ll/ۧ;->ۨۗܰ:I

    .line 0
    iput p1, p0, Ll/ܳ᩺֫;->ܰ:I

    iput-object p2, p0, Ll/ܳ᩺֫;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u05a8\u073f"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x56ed

    const v3, 0x4cc2f95f    # 1.02222584E8f

    xor-int/2addr p2, v3

    const v3, 0x75412cf4

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x18c3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    return-void

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget-boolean p1, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u0733\u0730"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x69

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5043

    const v3, 0x25ad13ab

    xor-int/2addr p2, v3

    const v3, 0x2a3a98ac

    goto :goto_0

    .line 3
    :sswitch_1
    sget p1, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "\u1a75\u05ab"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x3f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x32bd

    const v3, -0x47e64fe7

    xor-int/2addr p2, v3

    const v3, 0x64e185c9

    goto :goto_0

    .line 4
    :sswitch_2
    sget-boolean p1, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "\u1a76\u06e7"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1de1

    const v3, -0x245dde96

    xor-int/2addr p2, v3

    const v3, 0x554770f5

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    :goto_2
    const-string p1, "\u06d9\u073d"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x4b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x695f

    const v3, -0x7ab1210f

    xor-int/2addr p2, v3

    const v3, 0x23f3012e

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 1
    :sswitch_5
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result p1

    if-nez p1, :cond_3

    const-string p1, "\u06db\u06db"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x140b

    const v3, 0x28dad99b

    xor-int/2addr p2, v3

    const v3, 0x6c1e17bb

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a75\u06e8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7b05

    const v3, 0x52b2db8f

    xor-int/2addr p2, v3

    const v3, 0x7ae2c14e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77c7d569 -> :sswitch_1
        -0x7460dbb5 -> :sswitch_3
        -0x49ded4ea -> :sswitch_4
        -0x4294589d -> :sswitch_2
        -0x3c0958b6 -> :sswitch_5
        -0x2b8935c2 -> :sswitch_4
        -0x1c0c8913 -> :sswitch_3
        -0x1030071 -> :sswitch_0
        0x1535cecd -> :sswitch_2
        0x1fb16d4b -> :sswitch_5
        0x2443f6a6 -> :sswitch_1
        0x6d8fb5d5 -> :sswitch_0
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

    const v2, -0x3cffe41f

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v5, "\u06db\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6599

    const v7, 0x42273abd

    xor-int/2addr v6, v7

    const v7, 0x7c18a794

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x576f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 1
    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v5, :cond_b

    goto/16 :goto_3

    :sswitch_0
    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v5, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v5, "\u1a77\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2d11

    const v7, 0x78b76406

    xor-int/2addr v6, v7

    const v7, -0x3741d0ca

    goto :goto_0

    .line 3
    :sswitch_1
    sget-boolean v5, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v5, :cond_3

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget v5, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v5, :cond_8

    goto/16 :goto_3

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto/16 :goto_3

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    check-cast p1, Ll/ᩴۢۘ;

    invoke-virtual {v1, p1}, Ll/ܰܿ᩺;->᩸(Ll/ᩴۢۘ;)Ljava/util/Collection;

    move-result-object p1

    return-object p1

    :sswitch_6
    iget-object v1, p0, Ll/ܳ᩺֫;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/ܰܿ᩺;

    .line 4
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v5

    if-nez v5, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v5, "\u06e4\u06e8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x50d

    const v7, 0x5202377e

    xor-int/2addr v6, v7

    const v7, -0x4b37e2f5

    goto :goto_0

    .line 0
    :sswitch_7
    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ܺ᩺֫;->ۙ(Ll/ܺ᩺֫;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :sswitch_8
    iget-object v0, p0, Ll/ܳ᩺֫;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܺ᩺֫;

    sget v5, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u073a\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x15

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7b47

    const v7, 0x1dcd51a1

    xor-int/2addr v6, v7

    const v7, -0x348a5e67    # -1.6097689E7f

    goto/16 :goto_0

    :sswitch_9
    iget v5, p0, Ll/ܳ᩺֫;->ܰ:I

    packed-switch v5, :pswitch_data_0

    const-string v5, "\u06df\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5bfd

    const v7, 0x23403fc0

    xor-int/2addr v6, v7

    const v7, -0x2fcd617c

    goto/16 :goto_0

    :pswitch_0
    const-string v5, "\u06d9\u05a8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x6f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6be3

    const v7, -0x5d154e89

    xor-int/2addr v6, v7

    const v7, -0x24f1c41e

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-gtz v5, :cond_4

    :cond_3
    :goto_1
    const-string v5, "\u1a7b\u1a7b"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xc17

    const v7, -0x5542050d

    xor-int/2addr v6, v7

    const v7, 0x450320f0

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06d9\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x668d

    const v7, 0x403b98c5

    xor-int/2addr v6, v7

    const v7, -0x44d58dfb

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/ۧ;->ۨۗܰ:I

    if-ltz v5, :cond_5

    goto :goto_2

    :cond_5
    const-string v5, "\u1a7b\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4433

    const v7, -0x129f43b3

    xor-int/2addr v6, v7

    const v7, -0x2aaaa87c

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v5, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v5, :cond_6

    goto :goto_2

    :cond_6
    const-string v5, "\u05a8\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6bd

    const v7, 0x823ec6c

    xor-int/2addr v6, v7

    const v7, -0x7720e30d

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v5, :cond_7

    goto :goto_2

    :cond_7
    const-string v5, "\u1a7a\u05a1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6b4b

    const v7, 0x5be9f12f

    xor-int/2addr v6, v7

    const v7, 0x127c862d

    goto/16 :goto_0

    .line 4
    :sswitch_e
    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v5, :cond_9

    :cond_8
    :goto_2
    const-string v5, "\u1a79\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2535

    const v7, -0x7588af9f

    xor-int/2addr v6, v7

    const v7, 0x518d0193    # 7.57021E10f

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06df\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x73c1

    const v7, 0x175f03c3

    xor-int/2addr v6, v7

    const v7, 0x5811f2ec

    goto/16 :goto_0

    .line 3
    :sswitch_f
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_3

    :cond_a
    const-string v5, "\u06d9\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3a19

    const v7, 0x37d4a430

    xor-int/2addr v6, v7

    const v7, -0x75198ddc

    goto/16 :goto_0

    :goto_3
    const-string v5, "\u1a7b\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x75b

    const v7, -0x73eb9986

    xor-int/2addr v6, v7

    const v7, 0x2d18bd79

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06d8\u06e1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x477

    const v7, -0x172cc0c

    xor-int/2addr v6, v7

    const v7, -0x7ec0bc5

    goto/16 :goto_0

    .line 0
    :sswitch_10
    sget v5, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v5, :cond_c

    :goto_4
    const-string v5, "\u1a76\u0736"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5a8b

    const v7, 0x4b5bb492    # 1.439861E7f

    xor-int/2addr v6, v7

    const v7, -0x508176f2

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u05ab\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x59

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6a3d

    const v7, 0x4143d654

    xor-int/2addr v6, v7

    const v7, -0x547e3feb

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f41a20b -> :sswitch_1
        -0x71037a5d -> :sswitch_0
        -0x6076e9c9 -> :sswitch_9
        -0x51bae94b -> :sswitch_e
        -0x4df226a7 -> :sswitch_d
        -0x4b603606 -> :sswitch_d
        -0x44610e4c -> :sswitch_6
        -0x3bf8ebaf -> :sswitch_3
        -0x37adb0e3 -> :sswitch_10
        -0x3148ef66 -> :sswitch_5
        -0x234f6fd9 -> :sswitch_f
        -0x13fab32c -> :sswitch_a
        -0xb6e04c3 -> :sswitch_6
        -0x199ad8a -> :sswitch_e
        0xc703ee -> :sswitch_7
        0x2deca4d -> :sswitch_3
        0x9b84d36 -> :sswitch_4
        0x1413ae30 -> :sswitch_9
        0x22a1e2b8 -> :sswitch_1
        0x24a17965 -> :sswitch_4
        0x36dc035f -> :sswitch_c
        0x38777262 -> :sswitch_c
        0x39af6098 -> :sswitch_8
        0x3b66587b -> :sswitch_f
        0x3f4a9bcd -> :sswitch_a
        0x4561450a -> :sswitch_0
        0x4a8a663a -> :sswitch_b
        0x57a5d72f -> :sswitch_2
        0x58bbf678 -> :sswitch_10
        0x5ed4360b -> :sswitch_5
        0x61a3d085 -> :sswitch_2
        0x62c322ba -> :sswitch_b
        0x63c4a129 -> :sswitch_8
        0x6428919d -> :sswitch_7
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

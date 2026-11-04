.class public final synthetic Ll/ۧۢ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ll/᩻ۢ֫;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ۢ֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۢ֫;->ܰ:Ll/᩻ۢ֫;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 6

    const v0, 0x1c6c6503

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    sget v2, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v3, "\u0730\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3f15

    const v5, -0x6d76017e

    xor-int/2addr v4, v5

    const v5, 0xf8aadad

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x65f3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 0
    iget-object p1, p0, Ll/ۧۢ֫;->ܰ:Ll/᩻ۢ֫;

    invoke-static {p1}, Ll/ܽ;->ۜ᩻֨(Ljava/lang/Object;)Ljava/lang/Class;

    return-void

    :sswitch_0
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-nez v3, :cond_b

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-gez v3, :cond_8

    goto/16 :goto_3

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v3, :cond_5

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    goto :goto_1

    .line 0
    :sswitch_4
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    return-void

    :sswitch_5
    move-object v3, p1

    check-cast v3, Ljava/lang/Exception;

    .line 2
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_0

    goto :goto_2

    :cond_0
    const-string v3, "\u1a76\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xd77

    const v5, -0x7361459e

    xor-int/2addr v4, v5

    const v5, -0xf5f9721

    goto :goto_0

    .line 4
    :sswitch_6
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_1

    :goto_1
    const-string v3, "\u1a7b\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x825

    const v5, -0x553cc492

    xor-int/2addr v4, v5

    const v5, 0x26c4fad5

    goto :goto_0

    :cond_1
    const-string v3, "\u0730\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2e1b

    const v5, 0x5c9b0c3b

    xor-int/2addr v4, v5

    const v5, 0x2078cebe

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06eb\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x422f

    const v5, 0x4fb12115

    xor-int/2addr v4, v5

    const v5, -0x30e15481

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_3

    :goto_2
    const-string v3, "\u06dc\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4d31

    const v5, -0x2e28d082

    xor-int/2addr v4, v5

    const v5, -0x3c1ca05f

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a7a\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2f97

    const v5, -0x5636e928

    xor-int/2addr v4, v5

    const v5, -0x1ba26972

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u06dc\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6b6b

    const v5, -0x1dde8285

    xor-int/2addr v4, v5

    const v5, 0x1a1714c2

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_6

    :cond_5
    :goto_3
    const-string v3, "\u06da\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x76cb

    const v5, -0x2084e3db

    xor-int/2addr v4, v5

    const v5, 0x5f52232a

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a7a\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x22b9

    const v5, -0x202f11b5

    xor-int/2addr v4, v5

    const v5, 0x102bb2d2

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u073d\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7353

    const v5, -0x66ca00

    xor-int/2addr v4, v5

    const v5, -0x167aa60b

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v3

    if-eqz v3, :cond_9

    :cond_8
    :goto_4
    const-string v3, "\u1a78\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x29f1

    const v5, 0x1d72536b

    xor-int/2addr v4, v5

    const v5, -0x6f9171ed

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a73\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6373

    const v5, 0x4e64a012    # 9.589239E8f

    xor-int/2addr v4, v5

    const v5, 0x7352f816

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u1a76\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7979

    const v5, 0x7523df31

    xor-int/2addr v4, v5

    const v5, 0x3045bd6d

    goto/16 :goto_0

    .line 1
    :sswitch_e
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u1a7b\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5ddf

    const v5, -0x25efab68

    xor-int/2addr v4, v5

    const v5, 0x649da02a

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06eb\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xe0f

    const v5, -0x5c7fe28a

    xor-int/2addr v4, v5

    const v5, 0x466932a9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f89ab05 -> :sswitch_0
        -0x738972e3 -> :sswitch_5
        -0x717d9381 -> :sswitch_1
        -0x5fae5c70 -> :sswitch_9
        -0x56112c30 -> :sswitch_1
        -0x55742311 -> :sswitch_c
        -0x3d1bd725 -> :sswitch_8
        -0x3cd76330 -> :sswitch_b
        -0x35b56f9c -> :sswitch_b
        -0x30aaa1cf -> :sswitch_4
        -0x2575d1a2 -> :sswitch_7
        -0x1a6941af -> :sswitch_e
        -0x120880a2 -> :sswitch_c
        -0x10b5833b -> :sswitch_5
        -0xff4c768 -> :sswitch_8
        -0x8cd4587 -> :sswitch_4
        -0x7be478a -> :sswitch_3
        0x3994934 -> :sswitch_a
        0x105c7b1b -> :sswitch_3
        0x29ec612e -> :sswitch_d
        0x2d3a5d0d -> :sswitch_a
        0x2f9fa705 -> :sswitch_e
        0x34180c17 -> :sswitch_0
        0x4d93af44 -> :sswitch_2
        0x4f5fdff4 -> :sswitch_6
        0x4f6b458b -> :sswitch_d
        0x5427f370 -> :sswitch_7
        0x5703e973 -> :sswitch_2
        0x78bac42b -> :sswitch_6
        0x7f7da331 -> :sswitch_9
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

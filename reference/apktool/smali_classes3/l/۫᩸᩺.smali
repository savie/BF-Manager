.class public final Ll/۫᩸᩺;
.super Ljava/lang/Object;
.source "S3XU"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ܰ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 6

    const v0, -0x2471f616

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v2, Ll/ۘۚ;->ܺ᩶ܽ:I

    .line 1135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u05a8\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3837

    const v5, 0x1717c6e3

    xor-int/2addr v4, v5

    const v5, 0x2090d304

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3a57

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 612
    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_5

    goto/16 :goto_1

    .line 1110
    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_3

    .line 450
    :sswitch_1
    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v3, :cond_6

    goto/16 :goto_3

    .line 770
    :sswitch_2
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez v3, :cond_2

    goto/16 :goto_3

    .line 220
    :sswitch_3
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    goto/16 :goto_3

    .line 512
    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 1135
    :sswitch_5
    iput p2, p0, Ll/۫᩸᩺;->ܰ:I

    return-void

    :sswitch_6
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v3

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06df\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xe61

    const v5, 0x52be67b2

    xor-int/2addr v4, v5

    const v5, 0x66760d56

    goto :goto_0

    .line 486
    :sswitch_7
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u073a\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4933

    const v5, 0x532e4358

    xor-int/2addr v4, v5

    const v5, -0x546be861

    goto :goto_0

    :sswitch_8
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_3

    :cond_2
    const-string v3, "\u06df\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6d3f

    const v5, -0x735b2668

    xor-int/2addr v4, v5

    const v5, 0x49890c9d

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u0730\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x9ab

    const v5, -0x48f47cd5

    xor-int/2addr v4, v5

    const v5, -0x34f638e9    # -9029399.0f

    goto/16 :goto_0

    .line 794
    :sswitch_9
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v3

    if-gtz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u1a78\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4d5d

    const v5, -0x3afcc2ec

    xor-int/2addr v4, v5

    const v5, 0x627c668

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e0\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5bdf

    const v5, 0x43883284

    xor-int/2addr v4, v5

    const v5, 0x481e4173

    goto/16 :goto_0

    .line 673
    :sswitch_a
    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u06d6\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7f85

    const v5, -0x5e7a1cc1

    xor-int/2addr v4, v5

    const v5, -0x1179e18a

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a79\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2c8d

    const v5, -0x1eecd22f    # -1.696858E20f

    xor-int/2addr v4, v5

    const v5, 0x2f11db4c

    goto/16 :goto_0

    .line 886
    :sswitch_b
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v3

    if-ltz v3, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v3, "\u1a76\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x32e5

    const v5, -0x4cb73344

    xor-int/2addr v4, v5

    const v5, -0x62c5064

    goto/16 :goto_0

    .line 971
    :sswitch_c
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_9

    :goto_2
    const-string v3, "\u06e8\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4749

    const v5, -0x4763fa4d

    xor-int/2addr v4, v5

    const v5, 0x298e0a89

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a77\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4e01

    const v5, -0x3a1b1f36

    xor-int/2addr v4, v5

    const v5, -0x69fe5b33

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v3, :cond_a

    :goto_3
    const-string v3, "\u1a79\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x13a7

    const v5, 0x6c2ec4fa

    xor-int/2addr v4, v5

    const v5, 0x37c92fec

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073d\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3e5f

    const v5, 0x6d38dad7

    xor-int/2addr v4, v5

    const v5, -0x5b628873

    goto/16 :goto_0

    .line 1135
    :sswitch_e
    iput-object p1, p0, Ll/۫᩸᩺;->ۙ:Ljava/lang/String;

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06db\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x139

    const v5, 0xf9b30cd

    xor-int/2addr v4, v5

    const v5, -0x263c07bf

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06eb\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7e27

    const v5, 0x24fd43b7

    xor-int/2addr v4, v5

    const v5, -0x581b5a6a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x74810a54 -> :sswitch_7
        -0x6f3a52e9 -> :sswitch_0
        -0x5cdb0296 -> :sswitch_4
        -0x59cf575e -> :sswitch_a
        -0x5526f15a -> :sswitch_d
        -0x53fe9a1c -> :sswitch_7
        -0x50ed778b -> :sswitch_d
        -0x4e99075e -> :sswitch_2
        -0x4749614b -> :sswitch_1
        -0x3701b3db -> :sswitch_5
        -0x34e5106f -> :sswitch_8
        -0x33b1872b -> :sswitch_1
        -0x23b8da48 -> :sswitch_b
        -0xb8b2e07 -> :sswitch_6
        -0x50133e8 -> :sswitch_b
        -0x4824eb1 -> :sswitch_c
        0x3530dce -> :sswitch_e
        0x5ee52e4 -> :sswitch_e
        0x166c1da4 -> :sswitch_3
        0x17e3c863 -> :sswitch_3
        0x235acad0 -> :sswitch_8
        0x4308d5f4 -> :sswitch_5
        0x5550e9f3 -> :sswitch_9
        0x5d726606 -> :sswitch_9
        0x67c256d5 -> :sswitch_6
        0x682a287d -> :sswitch_4
        0x691a2c70 -> :sswitch_c
        0x6edb95db -> :sswitch_2
        0x7749b66d -> :sswitch_0
        0x775127ea -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 1

    .line 1135
    iget-object v0, p0, Ll/۫᩸᩺;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܰ()I
    .locals 1

    .line 1135
    iget v0, p0, Ll/۫᩸᩺;->ܰ:I

    return v0
.end method

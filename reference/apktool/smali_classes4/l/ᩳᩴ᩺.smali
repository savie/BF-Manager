.class public final Ll/ᩳᩴ᩺;
.super Ljava/lang/Object;
.source "V4FO"


# instance fields
.field public final ۙ:I

.field public final ܰ:I


# direct methods
.method public constructor <init>(II)V
    .locals 6

    const v0, 0x51853547

    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e8\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6341

    const v5, -0x5923c849

    xor-int/2addr v4, v5

    const v5, 0x5da892ad

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x2c1f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 254
    iput p2, p0, Ll/ᩳᩴ᩺;->ܰ:I

    return-void

    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v3

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_8

    goto/16 :goto_2

    .line 199
    :sswitch_2
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_b

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 52
    :sswitch_5
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_0

    const-string v3, "\u06ec\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xf23

    const v5, 0x1ebd14c2

    xor-int/2addr v4, v5

    const v5, -0x416d6eb1

    goto :goto_0

    :cond_0
    const-string v3, "\u0730\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x57d1

    const v5, -0x38685a74

    xor-int/2addr v4, v5

    const v5, 0x1c77feaf

    goto :goto_0

    .line 77
    :sswitch_6
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u1a74\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x61c9

    const v5, -0x403c1997

    xor-int/2addr v4, v5

    const v5, 0x41280275

    goto :goto_0

    .line 13
    :sswitch_7
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06d8\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6e59

    const v5, -0x27498223

    xor-int/2addr v4, v5

    const v5, -0x3231a407

    goto/16 :goto_0

    .line 2
    :sswitch_8
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v3

    if-gtz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06e8\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6b8f

    const v5, 0x4313c46c

    xor-int/2addr v4, v5

    const v5, -0x446b5329

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u06e0\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3a8b

    const v5, -0x28eb8030

    xor-int/2addr v4, v5

    const v5, 0x70388d67

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e7\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x43b

    const v5, -0x633fa9b2

    xor-int/2addr v4, v5

    const v5, 0x6815d223

    goto/16 :goto_0

    .line 177
    :sswitch_a
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u1a77\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x176d

    const v5, 0x8fe7551

    xor-int/2addr v4, v5

    const v5, -0x1549764b

    goto/16 :goto_0

    .line 250
    :sswitch_b
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_7

    :goto_2
    const-string v3, "\u05a8\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2c6b

    const v5, -0x3d90d1e8

    xor-int/2addr v4, v5

    const v5, -0x75fb2673

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e1\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2085

    const v5, 0x3c28c26b

    xor-int/2addr v4, v5

    const v5, -0x5453ae98

    goto/16 :goto_0

    .line 33
    :sswitch_c
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06df\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5b83

    const v5, -0x1fb311d1

    xor-int/2addr v4, v5

    const v5, 0x58562576

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a73\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x271

    const v5, -0x6ea6ea62

    xor-int/2addr v4, v5

    const v5, 0x3fe15610

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u06e8\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2d3b

    const v5, 0x50dc2087

    xor-int/2addr v4, v5

    const v5, 0x1f0d4b0e    # 2.9919995E-20f

    goto/16 :goto_0

    .line 253
    :sswitch_e
    iput p1, p0, Ll/ᩳᩴ᩺;->ۙ:I

    .line 207
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u0736\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6ff

    const v5, -0x4040bec9

    xor-int/2addr v4, v5

    const v5, -0x71f70836

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05ab\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1fc9

    const v5, 0x1c1f83b8

    xor-int/2addr v4, v5

    const v5, -0x49d68358

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77888497 -> :sswitch_c
        -0x6754ef34 -> :sswitch_3
        -0x592da268 -> :sswitch_b
        -0x39908ff2 -> :sswitch_d
        -0x37efa440 -> :sswitch_c
        -0x242b496c -> :sswitch_8
        -0x2415c882 -> :sswitch_a
        -0x224de1ee -> :sswitch_8
        -0x18bd719f -> :sswitch_1
        -0x18659063 -> :sswitch_5
        -0x5bd558d -> :sswitch_4
        0x686f5ea -> :sswitch_7
        0x6adc44d -> :sswitch_e
        0x836f5a5 -> :sswitch_6
        0x1219ffd2 -> :sswitch_2
        0x1972fd27 -> :sswitch_3
        0x1a284c73 -> :sswitch_7
        0x1f5df815 -> :sswitch_e
        0x20fc3451 -> :sswitch_9
        0x2810449f -> :sswitch_2
        0x2996cde0 -> :sswitch_4
        0x30225351 -> :sswitch_b
        0x31efac76 -> :sswitch_0
        0x37820077 -> :sswitch_d
        0x3d2b820a -> :sswitch_6
        0x48a9997e -> :sswitch_5
        0x5407ec38 -> :sswitch_a
        0x5bde8f49 -> :sswitch_9
        0x6c3a9cb3 -> :sswitch_0
        0x7fb9f76c -> :sswitch_1
    .end sparse-switch
.end method

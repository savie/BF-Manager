.class public final Ll/ܶ۟֫;
.super Ljava/lang/Object;
.source "V60Y"


# instance fields
.field public final ۙ:Ljava/lang/Class;

.field public final ᩷:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 6

    const v0, 0x63cb0b

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    sget v2, Ll/ۘ֡;->᩹ܶ۬:I

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d7\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2f2d

    const v5, -0x7703b27

    xor-int/2addr v4, v5

    const v5, 0x15a31b19

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x1b93

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 86
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_6

    goto/16 :goto_3

    .line 129
    :sswitch_0
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez v3, :cond_8

    goto/16 :goto_3

    .line 123
    :sswitch_1
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    .line 55
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-lez v3, :cond_b

    goto/16 :goto_3

    .line 14
    :sswitch_3
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    goto/16 :goto_3

    .line 22
    :sswitch_4
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 147
    :sswitch_5
    iput-object p2, p0, Ll/ܶ۟֫;->᩷:Ljava/lang/Object;

    return-void

    :sswitch_6
    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u06db\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4d23

    const v5, 0x7799f458

    xor-int/2addr v4, v5

    const v5, 0x3acc69bd

    goto :goto_0

    .line 57
    :sswitch_7
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_2

    :cond_1
    const-string v3, "\u06ec\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7b37

    const v5, 0xf0449ea

    xor-int/2addr v4, v5

    const v5, 0x1cf93010

    goto :goto_0

    :cond_2
    const-string v3, "\u06e4\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3e93

    const v5, -0x1b8ac22c

    xor-int/2addr v4, v5

    const v5, -0x4f566e85

    goto/16 :goto_0

    .line 61
    :sswitch_8
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_3

    :goto_1
    const-string v3, "\u073d\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x36af

    const v5, -0x296f4f7

    xor-int/2addr v4, v5

    const v5, -0x10687364

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u073a\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3e75

    const v5, 0x3194183a

    xor-int/2addr v4, v5

    const v5, 0x119466b2

    goto/16 :goto_0

    .line 75
    :sswitch_9
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u1a73\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x33a1

    const v5, 0x1e372a76

    xor-int/2addr v4, v5

    const v5, -0x22fa75f6

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v3

    if-ltz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u073d\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4f5

    const v5, 0x4c4fd7f9    # 5.4484964E7f

    xor-int/2addr v4, v5

    const v5, 0x10e5792e

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06df\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3c23

    const v5, -0x5212a2b

    xor-int/2addr v4, v5

    const v5, 0x68fad6a1

    goto/16 :goto_0

    .line 124
    :sswitch_b
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v3

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u073f\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6485

    const v5, 0x5df2f37d

    xor-int/2addr v4, v5

    const v5, 0x49df84c8    # 1831065.0f

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u0733\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5f15

    const v5, 0x42e1d7dd

    xor-int/2addr v4, v5

    const v5, -0xf9d843e

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d7\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x33ad

    const v5, 0x3684b810

    xor-int/2addr v4, v5

    const v5, 0xf8a73b

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_a

    :goto_3
    const-string v3, "\u06e7\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x660f

    const v5, -0xfe43e39

    xor-int/2addr v4, v5

    const v5, -0x184e4be0

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a74\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x18b

    const v5, -0x32c291bf

    xor-int/2addr v4, v5

    const v5, -0x40b4b7bc

    goto/16 :goto_0

    .line 146
    :sswitch_e
    iput-object p1, p0, Ll/ܶ۟֫;->ۙ:Ljava/lang/Class;

    .line 38
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_c

    :cond_b
    const-string v3, "\u1a74\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x421

    const v5, -0x30ce3d46

    xor-int/2addr v4, v5

    const v5, 0x301e88c1

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e4\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3a85

    const v5, -0x20534275

    xor-int/2addr v4, v5

    const v5, -0x43d61281

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76abd6e2 -> :sswitch_e
        -0x750807f5 -> :sswitch_c
        -0x70348c69 -> :sswitch_5
        -0x6ebf5ae1 -> :sswitch_e
        -0x6c03ebd5 -> :sswitch_1
        -0x6a4e90f3 -> :sswitch_d
        -0x67745980 -> :sswitch_a
        -0x66cec7a4 -> :sswitch_6
        -0x5524e473 -> :sswitch_0
        -0x4372ebcf -> :sswitch_4
        -0x3a228357 -> :sswitch_1
        -0x335a5050 -> :sswitch_6
        -0x2df169e0 -> :sswitch_4
        -0x2cbae283 -> :sswitch_2
        -0x2b3eabf9 -> :sswitch_c
        -0x2874d7ad -> :sswitch_7
        -0x27248d49 -> :sswitch_d
        -0x1d23b76c -> :sswitch_3
        -0x1c461526 -> :sswitch_b
        -0x1746b1fa -> :sswitch_8
        -0x16e821dd -> :sswitch_a
        -0xad700f7 -> :sswitch_5
        0x8d70b0a -> :sswitch_8
        0xaa8e16e -> :sswitch_2
        0x187867c9 -> :sswitch_9
        0x19859f71 -> :sswitch_3
        0x255a607c -> :sswitch_9
        0x2b093dfd -> :sswitch_0
        0x2d13ed20 -> :sswitch_b
        0x532070ff -> :sswitch_7
    .end sparse-switch
.end method

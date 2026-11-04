.class public final Ll/۫֨᩻;
.super Ljava/lang/Object;
.source "V4FO"


# instance fields
.field public final ۙ:I

.field public final ᩷:I


# direct methods
.method public constructor <init>(II)V
    .locals 6

    const v0, -0x13c671b1

    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a76\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, 0x7

    const v5, 0x1176c24b

    xor-int/2addr v4, v5

    const v5, -0xa990bd7

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x59d7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_5

    goto/16 :goto_2

    :sswitch_0
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_7

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_4

    .line 41
    :sswitch_2
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_2

    .line 78
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto/16 :goto_2

    .line 91
    :sswitch_4
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 254
    :sswitch_5
    iput p2, p0, Ll/۫֨᩻;->᩷:I

    return-void

    .line 140
    :sswitch_6
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u1a77\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4ed3

    const v5, 0x5fea196e

    xor-int/2addr v4, v5

    const v5, -0x70c8c365

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06d7\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x26d3

    const v5, 0x5391b84

    xor-int/2addr v4, v5

    const v5, -0xe5c5855

    goto :goto_0

    :sswitch_8
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u073d\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1615

    const v5, -0x7e7581f

    xor-int/2addr v4, v5

    const v5, -0x5a6ebd96

    goto/16 :goto_0

    .line 241
    :sswitch_9
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_3

    :goto_1
    const-string v3, "\u0736\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2dd9

    const v5, 0x11ed55fb

    xor-int/2addr v4, v5

    const v5, 0x373805a6

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e0\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5df5

    const v5, -0x32a3cb7c

    xor-int/2addr v4, v5

    const v5, -0x4e68ab78

    goto/16 :goto_0

    .line 93
    :sswitch_a
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u1a79\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7a1

    const v5, -0x52f94f46

    xor-int/2addr v4, v5

    const v5, 0x459758f7

    goto/16 :goto_0

    :goto_2
    const-string v3, "\u06e7\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x13e7

    const v5, 0x7963ca13

    xor-int/2addr v4, v5

    const v5, -0x67edbe62

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a79\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5a57

    const v5, 0x6cb97c8

    xor-int/2addr v4, v5

    const v5, -0x5de99462

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u05a1\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5219

    const v5, 0x55a35193

    xor-int/2addr v4, v5

    const v5, -0x41616c59

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_8

    :cond_7
    :goto_3
    const-string v3, "\u06d9\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3595

    const v5, 0x7d48aae0

    xor-int/2addr v4, v5

    const v5, -0x6bcaba61

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06da\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1105

    const v5, 0x64d9ce9a

    xor-int/2addr v4, v5

    const v5, 0x1c22e14f

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_a

    :cond_9
    const-string v3, "\u05a8\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5a5d

    const v5, 0x5177c098

    xor-int/2addr v4, v5

    const v5, -0x42efc340

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e7\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3b9

    const v5, 0x3edcb09b

    xor-int/2addr v4, v5

    const v5, 0x5ff90278

    goto/16 :goto_0

    .line 253
    :sswitch_e
    iput p1, p0, Ll/۫֨᩻;->ۙ:I

    .line 236
    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u1a76\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7785

    const v5, 0xb44acad

    xor-int/2addr v4, v5

    const v5, -0x123f06b9

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d9\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x517f

    const v5, 0x7c5e0b4f

    xor-int/2addr v4, v5

    const v5, 0xc7946df

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x70e68c19 -> :sswitch_4
        -0x6af32139 -> :sswitch_9
        -0x572e5425 -> :sswitch_1
        -0x54462d48 -> :sswitch_2
        -0x41b2d513 -> :sswitch_0
        -0x3f16e891 -> :sswitch_c
        -0x3da018ab -> :sswitch_7
        -0x32694f01 -> :sswitch_b
        -0x305788dd -> :sswitch_6
        -0x2d8d59d8 -> :sswitch_a
        -0x1bcfeb3a -> :sswitch_d
        -0x132f08af -> :sswitch_0
        -0x21a9006 -> :sswitch_3
        0x58a0b5c -> :sswitch_3
        0x133619c5 -> :sswitch_b
        0x17ba9ce0 -> :sswitch_8
        0x18356a43 -> :sswitch_5
        0x1ab9eca2 -> :sswitch_e
        0x26d56199 -> :sswitch_2
        0x367ae25d -> :sswitch_6
        0x3ed153d2 -> :sswitch_e
        0x4738d8d0 -> :sswitch_9
        0x4c2c3e33 -> :sswitch_4
        0x4d02ebe3 -> :sswitch_c
        0x4dc90714 -> :sswitch_a
        0x4dd81951 -> :sswitch_7
        0x5e4bab71 -> :sswitch_8
        0x60e82475 -> :sswitch_5
        0x6b8ceaba -> :sswitch_d
        0x7be9bfda -> :sswitch_1
    .end sparse-switch
.end method

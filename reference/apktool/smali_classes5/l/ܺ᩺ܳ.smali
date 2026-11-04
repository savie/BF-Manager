.class public final synthetic Ll/ܺ᩺ܳ;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ll/ۤۛܳ;
.implements Ll/ۚۘܳ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܺ᩺ܳ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x10814a51

    sget v2, Ll/֨ۚ;->֡᩸ۛ:I

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v4, "\u06d6\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3921

    const v6, 0x3ebd27b0

    xor-int/2addr v5, v6

    const v6, 0x126f572c

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x4c0b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_b

    goto/16 :goto_2

    :sswitch_1
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_1

    goto/16 :goto_2

    .line 176
    :sswitch_2
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto/16 :goto_2

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    return-void

    .line 4
    :sswitch_4
    check-cast v0, Ll/۠ۨܳ;

    .line 1325
    invoke-static {v0, p1}, Ll/ۖ֨ۤ;->ۙ(Ll/۠ۨܳ;Ll/᩷ۨᩴ;)V

    return-void

    .line 2
    :sswitch_5
    iget-object v0, p0, Ll/ܺ᩺ܳ;->ܰ:Ljava/lang/Object;

    .line 637
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u05a8\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x71ed

    const v6, -0x8bd700b

    xor-int/2addr v5, v6

    const v6, 0xbfd0b65

    goto :goto_0

    .line 304
    :sswitch_6
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_2

    :cond_1
    const-string v4, "\u0736\u06e2"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa2b

    const v6, -0x785fde17

    xor-int/2addr v5, v6

    const v6, -0x169fb2a9

    goto :goto_0

    :cond_2
    const-string v4, "\u073a\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5577

    const v6, -0x3414fbdf    # -3.0804034E7f

    xor-int/2addr v5, v6

    const v6, 0x56d9cf90

    goto :goto_0

    .line 1288
    :sswitch_7
    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u1a7b\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2563

    const v6, -0x370825d7

    xor-int/2addr v5, v6

    const v6, -0x73e63c09

    goto/16 :goto_0

    .line 218
    :sswitch_8
    sget v4, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v4, :cond_4

    :goto_1
    const-string v4, "\u1a78\u0736"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x27a1

    const v6, -0x14406928

    xor-int/2addr v5, v6

    const v6, -0x726c037e

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06d7\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xce1

    const v6, -0x2610a2f1

    xor-int/2addr v5, v6

    const v6, 0x4e3d13e7    # 7.9304954E8f

    goto/16 :goto_0

    .line 1322
    :sswitch_9
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u0736\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1449

    const v6, 0x8c4c071

    xor-int/2addr v5, v6

    const v6, 0x18d33985

    goto/16 :goto_0

    .line 778
    :sswitch_a
    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v4, :cond_6

    :goto_2
    const-string v4, "\u06e8\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1789

    const v6, 0x4ef4bb3b    # 2.0529555E9f

    xor-int/2addr v5, v6

    const v6, 0x679b2a32

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a78\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2e03

    const v6, 0x310ab9d8

    xor-int/2addr v5, v6

    const v6, -0x6c3fabb7

    goto/16 :goto_0

    .line 910
    :sswitch_b
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v4

    if-ltz v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u06d6\u073a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x50f

    const v6, -0x15d84fa7

    xor-int/2addr v5, v6

    const v6, 0x313474d3

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u06ec\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x36cd

    const v6, -0x2e87d6ed

    xor-int/2addr v5, v6

    const v6, -0x7f99d098

    goto/16 :goto_0

    .line 84
    :sswitch_d
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u1a74\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5c47

    const v6, -0x3466cc1c    # -2.0080584E7f

    xor-int/2addr v5, v6

    const v6, 0x2097bf0d

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e4\u1a74"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x34d3

    const v6, 0x7f4a574f

    xor-int/2addr v5, v6

    const v6, 0x7f2c02

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a79\u06e2"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4125

    const v6, 0x1879663e

    xor-int/2addr v5, v6

    const v6, -0x48f723b3

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d9\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x722b

    const v6, 0x66f26042

    xor-int/2addr v5, v6

    const v6, -0x6e927b9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fa027fe -> :sswitch_2
        -0x7a3a673c -> :sswitch_7
        -0x7280b6ba -> :sswitch_2
        -0x6e610547 -> :sswitch_9
        -0x677779c7 -> :sswitch_d
        -0x61d72e65 -> :sswitch_1
        -0x5efd1c8a -> :sswitch_c
        -0x5b62e7cc -> :sswitch_c
        -0x5b3a9e86 -> :sswitch_b
        -0x59160273 -> :sswitch_5
        -0x590eef7f -> :sswitch_6
        -0x4ece4235 -> :sswitch_1
        -0x489f2f19 -> :sswitch_9
        -0x4840ec3d -> :sswitch_0
        -0x456cea66 -> :sswitch_0
        -0x3a62983f -> :sswitch_8
        -0x30849d07 -> :sswitch_4
        -0x2a390d37 -> :sswitch_e
        -0x28708a31 -> :sswitch_b
        -0x224a438d -> :sswitch_d
        -0x1eef17c5 -> :sswitch_a
        -0xf4f9ee2 -> :sswitch_3
        0x357ab4f -> :sswitch_a
        0x21ddcddf -> :sswitch_e
        0x2380f45a -> :sswitch_3
        0x4ee91097 -> :sswitch_6
        0x5fffa2ac -> :sswitch_8
        0x6a9e77cb -> :sswitch_7
        0x727a9522 -> :sswitch_5
        0x7e509409 -> :sswitch_4
    .end sparse-switch
.end method

.method public ۙ(Ll/ۖۗܳ;)Z
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x244d4b4f

    sget v3, Ll/֫֡;->֫ۙۖ:I

    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    const-string v5, "\u06e7\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x73

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3f9d

    const v7, 0x6e822d3d

    xor-int/2addr v6, v7

    const v7, -0x2fd577e6

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x7d8d

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 2
    iget-object v0, p0, Ll/ܺ᩺ܳ;->ܰ:Ljava/lang/Object;

    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-gtz v5, :cond_1

    goto/16 :goto_2

    .line 35
    :sswitch_0
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v5, :cond_9

    goto/16 :goto_1

    .line 4
    :sswitch_1
    sget-boolean v5, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v5, :cond_4

    goto/16 :goto_3

    .line 8
    :sswitch_2
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    sget v5, Ll/ۖۖ;->᩵ۜ֨:I

    if-gez v5, :cond_6

    goto/16 :goto_3

    .line 36
    :sswitch_3
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    const/4 p1, 0x0

    return p1

    .line 83
    :sswitch_5
    invoke-static {p1}, Ll/ۖܰ;->ۛۖۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    return p1

    .line 4
    :sswitch_6
    move-object v1, v0

    check-cast v1, Ljava/util/regex/Matcher;

    .line 41
    sget v5, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u06dc\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4523

    const v7, 0x63a0288e

    xor-int/2addr v6, v7

    const v7, 0x19c22012

    goto :goto_0

    :cond_1
    const-string v5, "\u06ec\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5beb

    const v7, -0x5ccb58bb

    xor-int/2addr v6, v7

    const v7, -0x48182b0

    goto :goto_0

    .line 53
    :sswitch_7
    sget v5, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v5, :cond_2

    goto :goto_1

    :cond_2
    const-string v5, "\u1a7b\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3817

    const v7, -0x636c7dac

    xor-int/2addr v6, v7

    const v7, -0x3ed3de94

    goto/16 :goto_0

    .line 33
    :sswitch_8
    sget v5, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v5, :cond_3

    goto :goto_1

    :cond_3
    const-string v5, "\u1a76\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3875

    const v7, 0x289df0d0

    xor-int/2addr v6, v7

    const v7, -0xd456f28

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v5, :cond_5

    :cond_4
    :goto_1
    const-string v5, "\u06e8\u06ec"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x30a3

    const v7, 0x39bf63dc

    xor-int/2addr v6, v7

    const v7, -0x3b1c7892

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u1a7b\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x61ff

    const v7, 0x3fc45f6a

    xor-int/2addr v6, v7

    const v7, -0x33114811    # -1.2515724E8f

    goto/16 :goto_0

    :sswitch_a
    sget v5, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v5, :cond_7

    :cond_6
    const-string v5, "\u06e7\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6bc3

    const v7, 0x3edab8c1

    xor-int/2addr v6, v7

    const v7, -0x2780877d

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u1a79\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xc99

    const v7, 0x65dfb644

    xor-int/2addr v6, v7

    const v7, -0x1e39599c

    goto/16 :goto_0

    .line 28
    :sswitch_b
    sget v5, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v5, :cond_8

    :goto_2
    const-string v5, "\u1a77\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0xf

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x52cd

    const v7, -0x7822890

    xor-int/2addr v6, v7

    const v7, 0x16c755ec

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u1a7a\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x79eb

    const v7, -0x359cb3a3

    xor-int/2addr v6, v7

    const v7, -0x554987f3

    goto/16 :goto_0

    .line 27
    :sswitch_c
    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_a

    :cond_9
    const-string v5, "\u1a79\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2c57

    const v7, 0x2cb6b47b

    xor-int/2addr v6, v7

    const v7, -0x563e9032

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06d7\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x69

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x21af

    const v7, 0x5bbc1c7e

    xor-int/2addr v6, v7

    const v7, 0xbf2f553

    goto/16 :goto_0

    .line 67
    :sswitch_d
    sget v5, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v5, :cond_b

    goto :goto_3

    :cond_b
    const-string v5, "\u06e0\u1a7a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x691b

    const v7, 0x74eaa03d

    xor-int/2addr v6, v7

    const v7, -0x29e5c11f

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v5, :cond_c

    :goto_3
    const-string v5, "\u06e2\u06db"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xfa3

    const v7, 0x5a0363be

    xor-int/2addr v6, v7

    const v7, -0x4c44aea

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a77\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x31

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3215

    const v7, 0x4966f050    # 945925.0f

    xor-int/2addr v6, v7

    const v7, 0x62c9a52d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x716e4bf8 -> :sswitch_d
        -0x6ee1b723 -> :sswitch_3
        -0x6914f90e -> :sswitch_d
        -0x6696b18e -> :sswitch_4
        -0x5ca3b028 -> :sswitch_9
        -0x57a5a063 -> :sswitch_1
        -0x5140549e -> :sswitch_8
        -0x50a184ac -> :sswitch_5
        -0x4de09ff1 -> :sswitch_6
        -0x4427943a -> :sswitch_7
        -0x38ca361b -> :sswitch_9
        -0x364f2ada -> :sswitch_c
        -0x2657da44 -> :sswitch_e
        -0x1c30382a -> :sswitch_2
        -0x1c2b7c7c -> :sswitch_a
        -0x183f3157 -> :sswitch_8
        -0x12b3c7ab -> :sswitch_3
        -0x1393677 -> :sswitch_7
        0x2887b2c5 -> :sswitch_2
        0x2bf8120b -> :sswitch_0
        0x3370cd60 -> :sswitch_6
        0x39ccf790 -> :sswitch_e
        0x3ed48e2c -> :sswitch_c
        0x417ddb14 -> :sswitch_4
        0x58aaad1f -> :sswitch_b
        0x591538c1 -> :sswitch_b
        0x5b4bf90a -> :sswitch_0
        0x6872dabd -> :sswitch_a
        0x6a7164cf -> :sswitch_1
        0x7b90dccc -> :sswitch_5
    .end sparse-switch
.end method

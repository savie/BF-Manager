.class public final Ll/ۜۛ֫;
.super Ljava/lang/Object;
.source "42TB"


# instance fields
.field public final ۙ:Ll/᩷ۨᩴ;

.field public final ۤ:J

.field public final ᩷:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLl/᩷ۨᩴ;Ljava/lang/String;)V
    .locals 6

    const v0, 0x7432a25f

    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    sget v2, Ll/֨᩻;->ۛ֫ܶ:I

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e2\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x62a9

    const v5, 0x78f0f7cd

    xor-int/2addr v4, v5

    const v5, -0x365490c0    # -1404392.0f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x4a7b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_0
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-eqz v3, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_7

    goto/16 :goto_1

    .line 29
    :sswitch_2
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_5

    goto/16 :goto_3

    .line 16
    :sswitch_3
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    goto/16 :goto_3

    .line 70
    :sswitch_4
    iput-object p4, p0, Ll/ۜۛ֫;->᩷:Ljava/lang/String;

    return-void

    .line 11
    :sswitch_5
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u05a1\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x218b

    const v5, 0x44ce2a30

    xor-int/2addr v4, v5

    const v5, -0x7a7d2bd1

    goto :goto_0

    .line 56
    :sswitch_6
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u1a79\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3299

    const v5, -0x25926056

    xor-int/2addr v4, v5

    const v5, -0x502bdf1

    goto :goto_0

    .line 16
    :sswitch_7
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u1a7b\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2da5

    const v5, 0x4f83b9be

    xor-int/2addr v4, v5

    const v5, 0x5351b6c5

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u0736\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4af

    const v5, 0x6a6aa4a5

    xor-int/2addr v4, v5

    const v5, -0x440924ba

    goto/16 :goto_0

    .line 25
    :sswitch_9
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v3, "\u1a78\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5fcd

    const v5, -0x1ed855f

    xor-int/2addr v4, v5

    const v5, -0x33612c08

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u06ec\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4e09

    const v5, 0x5628f360

    xor-int/2addr v4, v5

    const v5, 0x65fe57d4

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06d7\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x71e9

    const v5, -0x633afc77

    xor-int/2addr v4, v5

    const v5, -0x2573fba8

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06e7\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5ee3

    const v5, 0x759222cf

    xor-int/2addr v4, v5

    const v5, -0xb839c69

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a78\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x39a9

    const v5, -0x5200261e

    xor-int/2addr v4, v5

    const v5, 0x2fb24eb5

    goto/16 :goto_0

    .line 31
    :sswitch_c
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v3

    if-ltz v3, :cond_9

    :goto_3
    const-string v3, "\u1a74\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x73b3

    const v5, 0x183f2fa7

    xor-int/2addr v4, v5

    const v5, -0x6c0e432c

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06db\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5ce5

    const v5, -0x5e770112

    xor-int/2addr v4, v5

    const v5, 0x32c6772d

    goto/16 :goto_0

    .line 36
    :sswitch_d
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_a

    :goto_4
    const-string v3, "\u05a8\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7007

    const v5, -0x693dadae

    xor-int/2addr v4, v5

    const v5, 0x20df52e1

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e8\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6075

    const v5, 0x4bddcb11    # 2.9070882E7f

    xor-int/2addr v4, v5

    const v5, -0x1068238a

    goto/16 :goto_0

    .line 68
    :sswitch_e
    iput-object p3, p0, Ll/ۜۛ֫;->ۙ:Ll/᩷ۨᩴ;

    .line 69
    iput-wide p1, p0, Ll/ۜۛ֫;->ۤ:J

    .line 11
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u1a79\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x51e7

    const v5, 0x6c38294c

    xor-int/2addr v4, v5

    const v5, 0x67c55f0a

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a7b\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x217b

    const v5, 0xf66982b

    xor-int/2addr v4, v5

    const v5, -0x4d5e6f38

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7dc1b25b -> :sswitch_4
        -0x7c8c0115 -> :sswitch_0
        -0x73d3965a -> :sswitch_6
        -0x51091e2c -> :sswitch_c
        -0x50b89dc6 -> :sswitch_8
        -0x4ad1da38 -> :sswitch_2
        -0x46260204 -> :sswitch_8
        -0x457fe57a -> :sswitch_3
        -0x44f2507a -> :sswitch_a
        -0x3c38f946 -> :sswitch_1
        -0x33fe3ca4 -> :sswitch_5
        -0x1bb4ac1c -> :sswitch_7
        -0x1603c404 -> :sswitch_e
        -0x15b85af3 -> :sswitch_9
        -0x10993307 -> :sswitch_a
        -0x719941e -> :sswitch_c
        -0x5ef4ef -> :sswitch_0
        0x1abbc9a1 -> :sswitch_6
        0x1fb02282 -> :sswitch_5
        0x21bec06f -> :sswitch_9
        0x25b7eb68 -> :sswitch_b
        0x2632eb58 -> :sswitch_b
        0x2b022f73 -> :sswitch_2
        0x469f30ff -> :sswitch_1
        0x55c260db -> :sswitch_d
        0x5afcf14a -> :sswitch_4
        0x5e24b9ad -> :sswitch_7
        0x6aab7375 -> :sswitch_e
        0x6ddc3ce8 -> :sswitch_d
        0x7101017c -> :sswitch_3
    .end sparse-switch
.end method

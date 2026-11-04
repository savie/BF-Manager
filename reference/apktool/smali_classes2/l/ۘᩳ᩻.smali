.class public final Ll/ۘᩳ᩻;
.super Ljava/lang/Object;
.source "S3XU"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩷:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 6

    const v0, -0x1ae0ea15

    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    sget v2, Ll/ۗܶ;->ᩴ֫۫:I

    .line 1138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a7b\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x14fb

    const v5, 0x15db44fa

    xor-int/2addr v4, v5

    const v5, -0x5b0f2d1e

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x1399

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Ll/ۘᩳ᩻;->ۙ:Ljava/lang/String;

    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_c

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v3, :cond_4

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v3

    if-lez v3, :cond_9

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_3

    .line 841
    :sswitch_3
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 1138
    :sswitch_5
    iput p2, p0, Ll/ۘᩳ᩻;->᩷:I

    return-void

    .line 132
    :sswitch_6
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06e7\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x24e5

    const v5, 0x8dd625b

    xor-int/2addr v4, v5

    const v5, -0x33e91382    # -3.956377E7f

    goto :goto_0

    .line 245
    :sswitch_7
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06e4\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6eb7

    const v5, -0x518872d8

    xor-int/2addr v4, v5

    const v5, 0x38d85006

    goto :goto_0

    .line 904
    :sswitch_8
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06db\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x269f

    const v5, -0x4b94c35a

    xor-int/2addr v4, v5

    const v5, 0x78d3668d

    goto/16 :goto_0

    .line 1108
    :sswitch_9
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u0736\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2a17

    const v5, 0x63bd7461

    xor-int/2addr v4, v5

    const v5, 0x6964b03a

    goto/16 :goto_0

    .line 365
    :sswitch_a
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u1a79\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1635

    const v5, 0x170ed1d7

    xor-int/2addr v4, v5

    const v5, 0x309aeff1

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06dc\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1937

    const v5, -0x16da5ce3

    xor-int/2addr v4, v5

    const v5, -0x16f1b908

    goto/16 :goto_0

    .line 1038
    :sswitch_b
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u05a8\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, -0x77

    const v5, 0x1f757cde

    xor-int/2addr v4, v5

    const v5, -0x2535bf85

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_7

    :goto_2
    const-string v3, "\u05a8\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xf8f

    const v5, 0x6efb2c77

    xor-int/2addr v4, v5

    const v5, -0x6a50dbfe

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a7b\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x501d

    const v5, -0x5cde2db1

    xor-int/2addr v4, v5

    const v5, -0x193bebf6

    goto/16 :goto_0

    .line 1054
    :sswitch_d
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_8

    :goto_3
    const-string v3, "\u1a76\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4af1

    const v5, 0x51e71ca8

    xor-int/2addr v4, v5

    const v5, -0x60f85b5a

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0736\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x25f1

    const v5, 0x24ae4bb4

    xor-int/2addr v4, v5

    const v5, 0x2aa6db4e

    goto/16 :goto_0

    .line 316
    :sswitch_e
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06da\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5fe1

    const v5, -0x458f5ee3

    xor-int/2addr v4, v5

    const v5, 0x3bf9dad5

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a7a\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x619

    const v5, -0x5da3ae1b

    xor-int/2addr v4, v5

    const v5, -0x5ebe0d13

    goto/16 :goto_0

    :cond_b
    :goto_5
    const-string v3, "\u1a77\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4cc1

    const v5, -0x373eb577

    xor-int/2addr v4, v5

    const v5, 0x16a090c9

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06eb\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2967

    const v5, -0x6914f7eb

    xor-int/2addr v4, v5

    const v5, 0x16271dc5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d9f00bc -> :sswitch_d
        -0x6e13b23f -> :sswitch_3
        -0x6bdae59c -> :sswitch_9
        -0x561bceae -> :sswitch_d
        -0x54d449af -> :sswitch_e
        -0x4cb1b2f1 -> :sswitch_0
        -0x36c39573 -> :sswitch_a
        -0x2bdae862 -> :sswitch_2
        -0x28fb50d8 -> :sswitch_6
        -0x22d6e2cf -> :sswitch_0
        -0x201f53ae -> :sswitch_5
        -0x1fd0c2be -> :sswitch_8
        -0x1f839057 -> :sswitch_4
        -0x13daa7d6 -> :sswitch_c
        -0xdcf3474 -> :sswitch_c
        -0x6043161 -> :sswitch_e
        -0x4c70ad4 -> :sswitch_1
        -0x498e21 -> :sswitch_6
        0x16927558 -> :sswitch_b
        0x1e3cb06f -> :sswitch_a
        0x236f3c23 -> :sswitch_1
        0x279c1175 -> :sswitch_b
        0x2cca97f1 -> :sswitch_8
        0x367b34f9 -> :sswitch_7
        0x3b2557c1 -> :sswitch_2
        0x463ae896 -> :sswitch_3
        0x465e9c8e -> :sswitch_9
        0x50d410d7 -> :sswitch_5
        0x6b25211b -> :sswitch_7
        0x6d4dc196 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 1

    .line 1138
    iget-object v0, p0, Ll/ۘᩳ᩻;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()I
    .locals 1

    .line 1138
    iget v0, p0, Ll/ۘᩳ᩻;->᩷:I

    return v0
.end method

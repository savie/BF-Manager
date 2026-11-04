.class public final Ll/ܳۜۤ;
.super Ljava/lang/Object;
.source "79RC"


# instance fields
.field public final ۙ:Ll/ܰܿ᩹;

.field public ۤ:Ljava/lang/String;

.field public final ᩷:I

.field public ᩸:Z


# direct methods
.method public constructor <init>(I)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x5f1b4ff9

    sget v2, Ll/֫֨;->᩶ܺۡ:I

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u1a77\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xfcf

    const v6, -0x921cb19

    xor-int/2addr v5, v6

    const v6, -0x654f9025

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x2f55

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 205
    :sswitch_0
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-eqz v4, :cond_b

    goto/16 :goto_2

    .line 162
    :sswitch_1
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_9

    goto/16 :goto_2

    .line 118
    :sswitch_2
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_6

    goto/16 :goto_1

    .line 58
    :sswitch_3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    goto/16 :goto_1

    :sswitch_4
    const/4 v0, 0x0

    .line 214
    iput-boolean v0, p0, Ll/ܳۜۤ;->᩸:Z

    .line 218
    iput p1, p0, Ll/ܳۜۤ;->᩷:I

    return-void

    .line 213
    :sswitch_5
    iput-object v0, p0, Ll/ܳۜۤ;->ۙ:Ll/ܰܿ᩹;

    .line 36
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_0

    const-string v4, "\u073d\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xd43

    const v6, 0x34d70e75

    xor-int/2addr v5, v6

    const v6, 0x3bed7bf5

    goto :goto_0

    :cond_0
    const-string v4, "\u06d8\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x9eb

    const v6, 0x362b0a3b

    xor-int/2addr v5, v6

    const v6, 0x189377a4

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v4

    if-gtz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u1a7a\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7beb

    const v6, 0x65d01c54

    xor-int/2addr v5, v6

    const v6, -0x761e3483

    goto/16 :goto_0

    .line 44
    :sswitch_7
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u1a79\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6c37

    const v6, -0x430c3070

    xor-int/2addr v5, v6

    const v6, 0x2c727482

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u073d\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7e2b

    const v6, 0x7f9e616d

    xor-int/2addr v5, v6

    const v6, -0x4727437a

    goto/16 :goto_0

    .line 71
    :sswitch_9
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_4

    :goto_1
    const-string v4, "\u06d8\u06e1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x231d

    const v6, -0x27499ab3

    xor-int/2addr v5, v6

    const v6, -0x4892694e

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u0736\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7d37

    const v6, -0x23cece7

    xor-int/2addr v5, v6

    const v6, -0x1a4984d3

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v4, :cond_5

    goto :goto_3

    :cond_5
    const-string v4, "\u05a1\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x47

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xfbd

    const v6, 0x67836fae

    xor-int/2addr v5, v6

    const v6, 0x7426458f

    goto/16 :goto_0

    .line 217
    :sswitch_b
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_7

    :cond_6
    :goto_2
    const-string v4, "\u06d6\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3015

    const v6, 0x432f62e6

    xor-int/2addr v5, v6

    const v6, -0x738c27a5

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a7a\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x14c5

    const v6, 0x5acb7fd9    # 2.8639995E16f

    xor-int/2addr v5, v6

    const v6, -0x163cd493

    goto/16 :goto_0

    .line 210
    :sswitch_c
    sget-boolean v4, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u06db\u073a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x51

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x73eb

    const v6, 0x3cfaa5e

    xor-int/2addr v5, v6

    const v6, -0x7a3c55ea

    goto/16 :goto_0

    .line 10
    :sswitch_d
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v4

    if-eqz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u0736\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x54dd

    const v6, 0x7982c07a

    xor-int/2addr v5, v6

    const v6, 0x7ede4868

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0736\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5b0d

    const v6, 0x329bc812

    xor-int/2addr v5, v6

    const v6, 0x7236b949

    goto/16 :goto_0

    .line 213
    :sswitch_e
    new-instance v0, Ll/ܰܿ᩹;

    invoke-direct {v0}, Ll/ܰܿ᩹;-><init>()V

    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06d7\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xda7

    const v6, 0xe5ff101

    xor-int/2addr v5, v6

    const v6, 0x1e7361d0

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06df\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x604f

    const v6, 0x5c211b83

    xor-int/2addr v5, v6

    const v6, -0x1cc7fa3c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6f07e2b5 -> :sswitch_c
        -0x6b2d644c -> :sswitch_d
        -0x643498cc -> :sswitch_5
        -0x4516b90f -> :sswitch_6
        -0x3a2686a1 -> :sswitch_8
        -0x3428ad05 -> :sswitch_6
        -0x2444167a -> :sswitch_c
        -0x1bd936e2 -> :sswitch_5
        -0xe506769 -> :sswitch_1
        -0xbe1f68c -> :sswitch_2
        0x4494fb5 -> :sswitch_2
        0x7e9d995 -> :sswitch_7
        0x85a3f79 -> :sswitch_a
        0xa6aa283 -> :sswitch_8
        0xce4fd83 -> :sswitch_d
        0x18de57eb -> :sswitch_7
        0x1b42e01d -> :sswitch_4
        0x24175acb -> :sswitch_9
        0x2f255523 -> :sswitch_a
        0x344e3d42 -> :sswitch_1
        0x36b20fee -> :sswitch_0
        0x4f905b04 -> :sswitch_b
        0x5aacad41 -> :sswitch_0
        0x5af0e7b2 -> :sswitch_b
        0x6204788c -> :sswitch_4
        0x63af20ec -> :sswitch_3
        0x73598f5e -> :sswitch_3
        0x7435c9f5 -> :sswitch_9
        0x756f7725 -> :sswitch_e
        0x7f2c5b81 -> :sswitch_e
    .end sparse-switch
.end method

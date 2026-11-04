.class public final Ll/ۚ۬᩻;
.super Ljava/lang/Object;
.source "E4FN"


# instance fields
.field public final ۙ:[B

.field public final ۤ:[B

.field public final ᩷:J


# direct methods
.method public constructor <init>([B[BJ)V
    .locals 6

    const v0, 0x65ff978b

    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    sget v2, Ll/ۗ֡;->ۜ᩻۫:I

    .line 285
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e8\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3a5d

    const v5, 0x20ecb1c9

    xor-int/2addr v4, v5

    const v5, 0x74337fa1

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x5083

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 127
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_1

    .line 144
    :sswitch_0
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_b

    goto/16 :goto_2

    .line 54
    :sswitch_1
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez v3, :cond_2

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_5

    goto/16 :goto_3

    .line 197
    :sswitch_3
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 288
    :sswitch_5
    iput-wide p3, p0, Ll/ۚ۬᩻;->᩷:J

    return-void

    .line 107
    :sswitch_6
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_0

    const-string v3, "\u06e7\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x701

    const v5, 0x29c791a2

    xor-int/2addr v4, v5

    const v5, -0x5f5bb2d5

    goto :goto_0

    :cond_0
    const-string v3, "\u06e4\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x789b

    const v5, 0x30f34ad

    xor-int/2addr v4, v5

    const v5, -0x17b354f8

    goto :goto_0

    .line 230
    :sswitch_7
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u1a7a\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x16ef

    const v5, 0x426ee461

    xor-int/2addr v4, v5

    const v5, 0x34993fc2

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v3, "\u06e8\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4453

    const v5, -0x589c179b

    xor-int/2addr v4, v5

    const v5, -0x44246ae9

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a79\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2139

    const v5, 0x2cc7b97b

    xor-int/2addr v4, v5

    const v5, -0x2f26edbd

    goto/16 :goto_0

    .line 136
    :sswitch_8
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u1a73\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7f17

    const v5, -0x36456764    # -1528595.5f

    xor-int/2addr v4, v5

    const v5, -0x4a5f5bbb

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u06d8\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x9db

    const v5, 0x737a0f9a

    xor-int/2addr v4, v5

    const v5, 0x4eea659f

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a78\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7d63

    const v5, -0x119f2c3b

    xor-int/2addr v4, v5

    const v5, -0x5686cfba

    goto/16 :goto_0

    .line 272
    :sswitch_a
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06e1\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2667

    const v5, 0x4a925d26    # 4796051.0f

    xor-int/2addr v4, v5

    const v5, -0x43649c7b

    goto/16 :goto_0

    .line 245
    :sswitch_b
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_8

    :goto_3
    const-string v3, "\u1a74\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xbff

    const v5, -0x7decc8a7

    xor-int/2addr v4, v5

    const v5, 0x290fe506

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0733\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x41f7

    const v5, 0x1ff46a61

    xor-int/2addr v4, v5

    const v5, 0x7f5711d1

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u06e7\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1ca7

    const v5, -0x7607503a

    xor-int/2addr v4, v5

    const v5, 0x395274bc

    goto/16 :goto_0

    .line 263
    :sswitch_d
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u06e7\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1ca5

    const v5, -0x5dc57e76

    xor-int/2addr v4, v5

    const v5, 0x562b042b

    goto/16 :goto_0

    .line 286
    :sswitch_e
    iput-object p1, p0, Ll/ۚ۬᩻;->ۙ:[B

    .line 287
    iput-object p2, p0, Ll/ۚ۬᩻;->ۤ:[B

    .line 189
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e1\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6d8f

    const v5, -0x5229e47d

    xor-int/2addr v4, v5

    const v5, -0x52555a34

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06da\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7efb

    const v5, 0x41a3efbd

    xor-int/2addr v4, v5

    const v5, -0x4942680a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a0609f7 -> :sswitch_4
        -0x76830d7f -> :sswitch_0
        -0x74ca0103 -> :sswitch_1
        -0x6f742b8b -> :sswitch_a
        -0x6ebe6916 -> :sswitch_7
        -0x6d0a853e -> :sswitch_7
        -0x6aadf970 -> :sswitch_2
        -0x64107f06 -> :sswitch_e
        -0x5ec962c1 -> :sswitch_3
        -0x5aeb4831 -> :sswitch_6
        -0x47dd8934 -> :sswitch_a
        -0x392fbf37 -> :sswitch_0
        -0x34518507 -> :sswitch_1
        -0x3234822f -> :sswitch_9
        -0x24b9d83b -> :sswitch_6
        -0x2035459d -> :sswitch_5
        -0xb6cd441 -> :sswitch_5
        0x77456ab -> :sswitch_8
        0x212052d8 -> :sswitch_e
        0x2d12224a -> :sswitch_4
        0x32f32b76 -> :sswitch_b
        0x3cc28f63 -> :sswitch_9
        0x42e3f667 -> :sswitch_d
        0x45c9bbe1 -> :sswitch_c
        0x46a65cec -> :sswitch_8
        0x4f825001 -> :sswitch_2
        0x5364c851 -> :sswitch_3
        0x59616f16 -> :sswitch_d
        0x75798c4b -> :sswitch_c
        0x7c7d2610 -> :sswitch_b
    .end sparse-switch
.end method

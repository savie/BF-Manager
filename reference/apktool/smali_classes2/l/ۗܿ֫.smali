.class public final Ll/ۗܿ֫;
.super Landroid/os/Binder;
.source "F5X0"


# instance fields
.field public ܳ:J

.field public final ᩴ:Ll/᩵ܿ֫;


# direct methods
.method public constructor <init>(Ll/᩵ܿ֫;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 56
    iput-object p1, p0, Ll/ۗܿ֫;->ᩴ:Ll/᩵ܿ֫;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 74
    invoke-static {}, Ll/ۖᩳ;->ܶܰ۫()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۗܿ֫;->ܳ:J

    return-void
.end method

.method public final ۤ()V
    .locals 1

    .line 70
    iget-object v0, p0, Ll/ۗܿ֫;->ᩴ:Ll/᩵ܿ֫;

    invoke-static {v0}, Ll/᩵ܿ֫;->᩷(Ll/᩵ܿ֫;)Ll/᩵ܿ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵ܿ᩻;->hide()V

    return-void
.end method

.method public final ᩷()Ll/᩶ۤۤ;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ۗܿ֫;->ᩴ:Ll/᩵ܿ֫;

    invoke-static {v0}, Ll/᩵ܿ֫;->ۙ(Ll/᩵ܿ֫;)Ll/᩶ۤۤ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()V
    .locals 12

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    const v4, -0x5a6308f8

    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    sget v6, Ll/ۖܰ;->۟֫ܽ:I

    const-string v7, "\u05ab\u06d6"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x1f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7f43

    const v9, -0x47194935

    xor-int/2addr v8, v9

    const v9, 0x57f37f5a

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0xd51

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 42
    sget v7, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v7, :cond_5

    goto/16 :goto_1

    .line 22
    :sswitch_0
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget v7, Ll/֨ۚ;->֡᩸ۛ:I

    if-gez v7, :cond_4

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v7, Ll/ۖ;->ܿۚ֡:I

    if-gez v7, :cond_8

    goto/16 :goto_5

    .line 42
    :sswitch_2
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v7, Ll/ۧ;->ۨۗܰ:I

    if-gez v7, :cond_b

    goto/16 :goto_5

    .line 12
    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    goto/16 :goto_5

    .line 21
    :sswitch_4
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    :sswitch_5
    return-void

    .line 66
    :sswitch_6
    iget-object v0, p0, Ll/ۗܿ֫;->ᩴ:Ll/᩵ܿ֫;

    invoke-static {v0}, Ll/᩵ܿ֫;->᩷(Ll/᩵ܿ֫;)Ll/᩵ܿ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵ܿ᩻;->show()V

    return-void

    :sswitch_7
    sub-long v7, v0, v2

    const-wide/16 v9, 0x12c

    cmp-long v11, v7, v9

    if-gez v11, :cond_0

    const-string v7, "\u05ab\u06d8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x71

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x73d9

    const v9, -0x47d1273b

    xor-int/2addr v8, v9

    const v9, -0x61875f09

    goto :goto_0

    :cond_0
    const-string v7, "\u05ab\u06db"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x69

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3793

    const v9, 0x1c63c3a1

    xor-int/2addr v8, v9

    const v9, -0x2829d54f

    goto :goto_0

    .line 64
    :sswitch_8
    iget-wide v2, p0, Ll/ۗܿ֫;->ܳ:J

    .line 6
    sget v7, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v7, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v7, "\u1a77\u1a7a"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x13

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2765

    const v9, -0x313925dc

    xor-int/2addr v8, v9

    const v9, 0x2c1e3700

    goto/16 :goto_0

    .line 27
    :sswitch_9
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v7

    if-eqz v7, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v7, "\u06e4\u06e7"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x77

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x3f9f

    const v9, -0x3dafb474

    xor-int/2addr v8, v9

    const v9, -0x3c0974d3

    goto/16 :goto_0

    .line 13
    :sswitch_a
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_1

    :cond_3
    const-string v7, "\u06e7\u06e4"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7b5f

    const v9, -0x4a59fe9c

    xor-int/2addr v8, v9

    const v9, -0x64c4ecdb

    goto/16 :goto_0

    :cond_4
    :goto_1
    const-string v7, "\u073a\u06e2"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x13e3

    const v9, -0x46d65dac

    xor-int/2addr v8, v9

    const v9, 0x5f288057

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u06dc\u06e7"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x21

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7dbb

    const v9, -0x7df42665

    xor-int/2addr v8, v9

    const v9, 0x41c97d19

    goto/16 :goto_0

    .line 52
    :sswitch_b
    sget-boolean v7, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v7, :cond_6

    goto :goto_3

    :cond_6
    const-string v7, "\u06e4\u06d7"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3971

    const v9, -0xbcc04bc

    xor-int/2addr v8, v9

    const v9, 0x529d6cad

    goto/16 :goto_0

    .line 13
    :sswitch_c
    sget v7, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v7, :cond_7

    :goto_2
    const-string v7, "\u06eb\u06da"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x45

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x17fb

    const v9, -0x532bf634

    xor-int/2addr v8, v9

    const v9, -0x5a4e0419

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u0730\u1a7b"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0xb

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x470d

    const v9, 0xa09ee81

    xor-int/2addr v8, v9

    const v9, -0x16ecbf0c

    goto/16 :goto_0

    .line 29
    :sswitch_d
    sget v7, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v7, :cond_9

    :cond_8
    :goto_3
    const-string v7, "\u1a7b\u1a73"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x66db

    const v9, 0x68b65bc5

    xor-int/2addr v8, v9

    const v9, 0x136eef2a

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u0736\u1a7a"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x27

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x491

    const v9, -0x46a69824

    xor-int/2addr v8, v9

    const v9, 0x1940d14d

    goto/16 :goto_0

    .line 35
    :sswitch_e
    sget v7, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v7, :cond_a

    goto :goto_5

    :cond_a
    const-string v7, "\u06da\u06d9"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x45

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7ad5

    const v9, 0x6c615c91

    xor-int/2addr v8, v9

    const v9, 0x5da72380

    goto/16 :goto_0

    .line 15
    :sswitch_f
    sget v7, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v7, :cond_c

    :cond_b
    :goto_4
    const-string v7, "\u1a7a\u1a74"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x623d

    const v9, -0x7b9dee00

    xor-int/2addr v8, v9

    const v9, -0x3c8bb1c4

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06e0\u0736"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2463

    const v9, -0x15ca0045

    xor-int/2addr v8, v9

    const v9, 0x209bb7c0

    goto/16 :goto_0

    .line 64
    :sswitch_10
    invoke-static {}, Ll/ۗܰ;->ܳܰۚ()J

    move-result-wide v0

    .line 11
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v7

    if-nez v7, :cond_d

    :goto_5
    const-string v7, "\u1a75\u06ec"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6eed

    const v9, -0x34d877f3    # -1.0979341E7f

    xor-int/2addr v8, v9

    const v9, 0x2bbc20a5

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u06e2\u06e8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x41

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x67f7

    const v9, -0x4bc279e0

    xor-int/2addr v8, v9

    const v9, 0x1bec5eb1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f8c9a31 -> :sswitch_f
        -0x74e61946 -> :sswitch_3
        -0x6f1dca6c -> :sswitch_e
        -0x6d88aa3d -> :sswitch_10
        -0x6439ba50 -> :sswitch_4
        -0x58043937 -> :sswitch_2
        -0x4c643acd -> :sswitch_7
        -0x4b407567 -> :sswitch_10
        -0x4a29b6ad -> :sswitch_6
        -0x41b6c299 -> :sswitch_e
        -0x3a6e2d4d -> :sswitch_f
        -0x375e98c4 -> :sswitch_a
        -0x36e2400d -> :sswitch_0
        -0x35a30dbb -> :sswitch_b
        -0x2bc059ca -> :sswitch_4
        -0x27f181cf -> :sswitch_d
        -0x19baa5ba -> :sswitch_5
        -0x11b67944 -> :sswitch_7
        -0x10aec743 -> :sswitch_1
        -0x438d259 -> :sswitch_c
        0x114b8e57 -> :sswitch_1
        0x17fcbe0e -> :sswitch_a
        0x2b4291fa -> :sswitch_9
        0x2c26b1ce -> :sswitch_3
        0x2f7e5fdd -> :sswitch_9
        0x30eb99cd -> :sswitch_c
        0x34d84700 -> :sswitch_8
        0x35400732 -> :sswitch_0
        0x4dac46f4 -> :sswitch_6
        0x53b9434f -> :sswitch_d
        0x5b0347ce -> :sswitch_2
        0x651bb283 -> :sswitch_8
        0x66c97656 -> :sswitch_5
        0x7c3f1329 -> :sswitch_b
    .end sparse-switch
.end method

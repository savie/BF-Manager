.class public final synthetic Ll/᩸ۢ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ۚۢ֫;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ll/ۚۢ֫;I)V
    .locals 6

    const v0, 0x76a65ba9

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    sget v2, Ll/ۗ֡;->ۜ᩻۫:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a7a\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x313d

    const v5, 0x5e1ed180

    xor-int/2addr v4, v5

    const v5, -0x1706119

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x1b23

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_2

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v3

    if-eqz v3, :cond_6

    goto/16 :goto_1

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_1

    :sswitch_2
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_8

    goto/16 :goto_1

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput p2, p0, Ll/᩸ۢ֫;->᩶:I

    return-void

    :sswitch_6
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v3

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u05a8\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3cf1

    const v5, -0x19b78b3a

    xor-int/2addr v4, v5

    const v5, 0x6ed3c751

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u1a77\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x68a9

    const v5, 0x4f2c7823

    xor-int/2addr v4, v5

    const v5, 0x7f8d5217

    goto :goto_0

    .line 1
    :sswitch_8
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u073f\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x17fd

    const v5, 0x5401267e

    xor-int/2addr v4, v5

    const v5, -0x7fefb779

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u1a75\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4e8d

    const v5, 0x142d01b1

    xor-int/2addr v4, v5

    const v5, 0x7e00a20f

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u1a75\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x73cb

    const v5, 0x5c4413d0

    xor-int/2addr v4, v5

    const v5, 0x4a0312c

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_5

    :goto_1
    const-string v3, "\u1a78\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6889

    const v5, 0x3b3ba3a1

    xor-int/2addr v4, v5

    const v5, -0x16fd52c6

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06dc\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6a5f

    const v5, -0xb1c1dc5

    xor-int/2addr v4, v5

    const v5, 0x77156a36

    goto/16 :goto_0

    :cond_6
    :goto_2
    const-string v3, "\u05ab\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4c0b

    const v5, 0x8aee8d1

    xor-int/2addr v4, v5

    const v5, -0x39422b2

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a77\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3c87

    const v5, -0x5f444c48

    xor-int/2addr v4, v5

    const v5, 0x5dd3569b

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06e4\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x120b

    const v5, 0x44c5e5de

    xor-int/2addr v4, v5

    const v5, 0x3b897114

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u05ab\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3f8b

    const v5, 0x6685065b

    xor-int/2addr v4, v5

    const v5, -0x4c55ad0b

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_b

    :cond_a
    const-string v3, "\u06ec\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2c2d

    const v5, 0x3e00ba54

    xor-int/2addr v4, v5

    const v5, 0x5a8aea9c

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u073d\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5cb5

    const v5, 0x5ac4369b

    xor-int/2addr v4, v5

    const v5, 0x5520f635

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩸ۢ֫;->ܰ:Ll/ۚۢ֫;

    .line 1
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u1a74\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x144b

    const v5, 0x21cc9966

    xor-int/2addr v4, v5

    const v5, -0x488615ab

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e0\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x214d

    const v5, -0x3a8cd5a9

    xor-int/2addr v4, v5

    const v5, 0x66367d57

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a237a5b -> :sswitch_0
        -0x74547767 -> :sswitch_7
        -0x740f20e7 -> :sswitch_3
        -0x6fadb502 -> :sswitch_6
        -0x6eea7c00 -> :sswitch_6
        -0x6b5340fa -> :sswitch_b
        -0x67366c2d -> :sswitch_a
        -0x63bf93fe -> :sswitch_9
        -0x4aa9c7c1 -> :sswitch_2
        -0x3b5077b1 -> :sswitch_9
        -0x2eb4b8e3 -> :sswitch_e
        -0x274960cc -> :sswitch_8
        -0x269fe1f8 -> :sswitch_4
        -0x2155d0ed -> :sswitch_5
        -0x1aa6b05f -> :sswitch_c
        -0x15135e2c -> :sswitch_d
        0x516d319 -> :sswitch_4
        0xf27eeea -> :sswitch_3
        0x10d26b87 -> :sswitch_1
        0x115086e7 -> :sswitch_e
        0x21c2f14d -> :sswitch_5
        0x2bdf94b3 -> :sswitch_7
        0x30ec19d8 -> :sswitch_2
        0x4c1235c1 -> :sswitch_1
        0x4e5dd6bd -> :sswitch_8
        0x51831467 -> :sswitch_b
        0x58a6f318 -> :sswitch_0
        0x63e6d310 -> :sswitch_c
        0x79d48551 -> :sswitch_a
        0x7e9f6a4e -> :sswitch_d
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const v5, -0x3ecc9e6

    sget v6, Ll/֡᩵;->ۤܳ۬:I

    sget v7, Ll/ۖܰ;->۟֫ܽ:I

    const-string v8, "\u06e0\u06d8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x4f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3aa9

    const v10, -0x7693e955

    xor-int/2addr v9, v10

    const v10, -0x35465696    # -6083765.0f

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, -0x15b7

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 562
    sget v8, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v8, :cond_1

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    sget v8, Ll/۬;->᩸ۜ᩹:I

    if-nez v8, :cond_c

    goto/16 :goto_2

    .line 1058
    :sswitch_1
    sget v8, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-gez v8, :cond_4

    goto/16 :goto_4

    .line 721
    :sswitch_2
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_1

    .line 738
    :sswitch_3
    sget-boolean v8, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v8, :cond_8

    goto :goto_1

    .line 951
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    :goto_1
    const-string v8, "\u06d8\u1a73"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0xac7

    const v10, 0x446e6bfa

    xor-int/2addr v9, v10

    const v10, -0x108e2e2

    goto :goto_0

    :sswitch_5
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    :sswitch_6
    return-void

    .line 558
    :sswitch_7
    :try_start_0
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    .line 559
    invoke-static {v2}, Ll/۟ۢ֫;->ۛ(Ll/۟ۢ֫;)Ll/ۨۢ֫;

    move-result-object v8

    .line 1305
    iget-object v8, v8, Ll/ۨۢ֫;->ۙ:Ll/ۗۢ֫;

    iget-object v8, v8, Ll/ۗۢ֫;->ᩴ:Ll/ۢۖ᩹;

    .line 559
    invoke-static {v2}, Ll/۟ۢ֫;->ۛ(Ll/۟ۢ֫;)Ll/ۨۢ֫;

    move-result-object v9

    iget-object v9, v9, Ll/ۨۢ֫;->᩸:Ll/᩻ᩳ᩷;

    invoke-static {v2}, Ll/۟ۢ֫;->ܺ(Ll/۟ۢ֫;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v10

    invoke-static {v2, v8, v9, v10, v0}, Ll/۟ۢ֫;->ۙ(Ll/۟ۢ֫;Ll/ۢۖ᩹;Ll/᩻ᩳ᩷;Ljava/util/concurrent/atomic/AtomicInteger;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v8, "\u0733\u06e2"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x6f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x23b1

    const v10, 0x339a2a8c

    xor-int/2addr v9, v10

    const v10, -0x6a5a9953

    goto :goto_0

    .line 558
    :sswitch_8
    iget-object v2, v1, Ll/ۚۢ֫;->᩻:Ll/۟ۢ֫;

    const-wide/16 v3, 0x64

    const-string v8, "\u1a79\u1a76"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x41

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x565d

    const v10, -0x53cc2e4

    xor-int/2addr v9, v10

    const v10, 0x2b9e85f8

    goto/16 :goto_0

    :sswitch_9
    iget-object v1, p0, Ll/᩸ۢ֫;->ܰ:Ll/ۚۢ֫;

    .line 1200
    sget v8, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v8, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v8, "\u05ab\u1a77"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x1937

    const v10, -0x7a6d8b72

    xor-int/2addr v9, v10

    const v10, -0x738a904e

    goto/16 :goto_0

    :cond_1
    const-string v8, "\u1a77\u05a1"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x47

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x18bf

    const v10, 0x4b3d6f8b    # 1.2414859E7f

    xor-int/2addr v9, v10

    const v10, 0x64304a11

    goto/16 :goto_0

    .line 441
    :sswitch_a
    sget v8, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v8, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v8, "\u06d8\u1a76"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x31d3

    const v10, -0x41b39d39

    xor-int/2addr v9, v10

    const v10, 0x4b7d811d    # 1.6613661E7f

    goto/16 :goto_0

    :sswitch_b
    sget v8, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v8, :cond_3

    goto :goto_3

    :cond_3
    const-string v8, "\u06d6\u06e1"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x2d53

    const v10, -0x73330687

    xor-int/2addr v9, v10

    const v10, -0x78e9d9d9

    goto/16 :goto_0

    .line 69
    :sswitch_c
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v8

    if-nez v8, :cond_5

    :cond_4
    :goto_2
    const-string v8, "\u06d7\u06df"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6ddd

    const v10, 0x1ff62e7

    xor-int/2addr v9, v10

    const v10, 0x95b953a

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u1a74\u06d9"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x73

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2075

    const v10, -0x7541b48a

    xor-int/2addr v9, v10

    const v10, 0x799b345c

    goto/16 :goto_0

    .line 1026
    :sswitch_d
    sget v8, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v8, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v8, "\u06d9\u06d6"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x32e5

    const v10, -0x671169ae

    xor-int/2addr v9, v10

    const v10, 0x2e69c403

    goto/16 :goto_0

    .line 1286
    :sswitch_e
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v8

    if-nez v8, :cond_7

    :goto_3
    const-string v8, "\u05a8\u073a"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x47

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0xd09

    const v10, -0x5528eab2

    xor-int/2addr v9, v10

    const v10, -0x75fc2fbc

    goto/16 :goto_0

    :cond_7
    const-string v8, "\u06e2\u1a75"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0xa81

    const v10, -0x6f6fee39

    xor-int/2addr v9, v10

    const v10, -0xa54bea9

    goto/16 :goto_0

    :sswitch_f
    sget v8, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v8, :cond_9

    :cond_8
    const-string v8, "\u06d7\u06e7"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x3

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5c39

    const v10, 0x48c7a85f

    xor-int/2addr v9, v10

    const v10, 0x1f03b2c7

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u1a7b\u1a7b"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x77

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x441b

    const v10, 0x171c4ebe

    xor-int/2addr v9, v10

    const v10, 0x1c9751bb

    goto/16 :goto_0

    .line 999
    :sswitch_10
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v8

    if-gtz v8, :cond_b

    :cond_a
    :goto_4
    const-string v8, "\u06e4\u1a73"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x162b

    const v10, 0x4526fb1d

    xor-int/2addr v9, v10

    const v10, -0x5810ac80

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u1a76\u05a8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x79

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5023

    const v10, 0x6c4deaf8

    xor-int/2addr v9, v10

    const v10, -0x2e2285da

    goto/16 :goto_0

    .line 2
    :sswitch_11
    iget v0, p0, Ll/᩸ۢ֫;->᩶:I

    .line 850
    sget v8, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v8, :cond_d

    :cond_c
    const-string v8, "\u0736\u06d9"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3a0b

    const v10, -0x524252a2

    xor-int/2addr v9, v10

    const v10, 0x5859a25d

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u1a7a\u1a7b"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x23

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2c0f

    const v10, 0x64c2c8b4

    xor-int/2addr v9, v10

    const v10, -0x6b3d969a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c7125e0 -> :sswitch_2
        -0x79271482 -> :sswitch_10
        -0x7817c9c5 -> :sswitch_3
        -0x6cb3f7ea -> :sswitch_11
        -0x6b131357 -> :sswitch_7
        -0x6adf19a2 -> :sswitch_8
        -0x61876b88 -> :sswitch_a
        -0x4345fa04 -> :sswitch_b
        -0x3be4bdde -> :sswitch_8
        -0x39b66b5d -> :sswitch_4
        -0x334c5bae -> :sswitch_7
        -0x32d48c2a -> :sswitch_9
        -0x19ee1b0b -> :sswitch_9
        -0x107ebbcd -> :sswitch_3
        -0xb6ce8e0 -> :sswitch_0
        -0x194117d -> :sswitch_6
        0xdc3691e -> :sswitch_a
        0xdd5bd7f -> :sswitch_e
        0xde82350 -> :sswitch_6
        0x1037a382 -> :sswitch_1
        0x15cc9704 -> :sswitch_f
        0x2619c3cf -> :sswitch_c
        0x26fee4c9 -> :sswitch_b
        0x4991d007 -> :sswitch_e
        0x49f53cff -> :sswitch_11
        0x531cf98c -> :sswitch_f
        0x602b8133 -> :sswitch_1
        0x64a35b52 -> :sswitch_d
        0x6607f8a2 -> :sswitch_c
        0x6e7dc355 -> :sswitch_10
        0x72692766 -> :sswitch_4
        0x74226677 -> :sswitch_5
        0x7721e206 -> :sswitch_0
        0x7c44c9e0 -> :sswitch_5
        0x7f410275 -> :sswitch_2
        0x7f7e3b76 -> :sswitch_d
    .end sparse-switch
.end method

.class public abstract Ll/֫᩺֫;
.super Ljava/lang/Object;
.source "K3YT"

# interfaces
.implements Ll/۫᩺֫;


# virtual methods
.method public final ۙ(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x57773565

    sget v3, Ll/֡ۢ;->۟֡᩻:I

    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    const-string v5, "\u06db\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x7d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7b8d

    const v7, 0x6206d8cb

    xor-int/2addr v6, v7

    const v7, -0x2bfc261c

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x13eb

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 368
    invoke-interface {p1, v1}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/Throwable;)V

    :goto_1
    const/4 p1, 0x0

    return-object p1

    :sswitch_0
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v5, Ll/ۖۙ;->ۤۧۤ:I

    if-gez v5, :cond_8

    goto/16 :goto_5

    .line 124
    :sswitch_1
    sget v5, Ll/ۧ;->ۨۗܰ:I

    if-gez v5, :cond_a

    goto/16 :goto_6

    .line 41
    :sswitch_2
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v5, :cond_3

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    goto/16 :goto_6

    .line 259
    :sswitch_4
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    goto :goto_1

    :sswitch_5
    return-object v0

    .line 366
    :sswitch_6
    :try_start_0
    invoke-virtual {p0, p2}, Ll/֫᩺֫;->ۙ(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, "\u1a76\u06d6"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x1d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x76b

    const v7, 0x266ff641

    xor-int/2addr v6, v7

    const v7, 0x2521bf1f

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v5, "\u06dc\u1a7b"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x3f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5fa7

    const v7, 0x69daf225

    xor-int/2addr v6, v7

    const v7, 0x6244050e

    goto :goto_0

    :sswitch_7
    sget v5, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v5, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v5, "\u06e2\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x9

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xadf

    const v7, -0x19fcd57f

    xor-int/2addr v6, v7

    const v7, 0x7f0b81da

    goto/16 :goto_0

    .line 275
    :sswitch_8
    sget v5, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u1a78\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x7

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3f21

    const v7, 0x6fbcce0d

    xor-int/2addr v6, v7

    const v7, 0x702091e5

    goto/16 :goto_0

    .line 117
    :sswitch_9
    sget-boolean v5, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    const-string v5, "\u0736\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5ab

    const v7, 0x3cdf4038

    xor-int/2addr v6, v7

    const v7, 0x425f7909

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_4

    :cond_3
    :goto_2
    const-string v5, "\u06e0\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x21cb

    const v7, 0x45b65741

    xor-int/2addr v6, v7

    const v7, 0x9247f8b

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u1a74\u1a78"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x2f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3e03

    const v7, -0x359f3a7e    # -3682656.5f

    xor-int/2addr v6, v7

    const v7, 0x503958cc

    goto/16 :goto_0

    .line 13
    :sswitch_b
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_5

    goto :goto_4

    :cond_5
    const-string v5, "\u06e0\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x6b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x195d

    const v7, 0x32f90f3f

    xor-int/2addr v6, v7

    const v7, 0x50daea7d

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v5, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v5, "\u06df\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3a75

    const v7, 0x5f6b0755

    xor-int/2addr v6, v7

    const v7, 0x47a4d4a7

    goto/16 :goto_0

    .line 17
    :sswitch_d
    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_7

    :goto_3
    const-string v5, "\u06ec\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1323

    const v7, -0x27321178

    xor-int/2addr v6, v7

    const v7, 0x68023cb9

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06d9\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2dbb

    const v7, 0x38735bba

    xor-int/2addr v6, v7

    const v7, -0x652d9c05

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v5, :cond_9

    :cond_8
    :goto_4
    const-string v5, "\u06dc\u06ec"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x30e9

    const v7, 0x6cafc0b1

    xor-int/2addr v6, v7

    const v7, -0x12b910eb

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u0730\u1a7a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0xf

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6cf5

    const v7, 0x3a69000

    xor-int/2addr v6, v7

    const v7, 0x31667f94

    goto/16 :goto_0

    .line 365
    :sswitch_f
    sget-boolean v5, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v5, :cond_b

    :cond_a
    :goto_5
    const-string v5, "\u06e7\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x6f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1abf

    const v7, 0x2e1f1bd9

    xor-int/2addr v6, v7

    const v7, 0x56a5d714

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u1a7a\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x32f9

    const v7, -0x5ad88f28

    xor-int/2addr v6, v7

    const v7, -0x4e399d0a

    goto/16 :goto_0

    .line 154
    :sswitch_10
    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v5, :cond_c

    :goto_6
    const-string v5, "\u0733\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6ff7

    const v7, -0x197a82d5

    xor-int/2addr v6, v7

    const v7, 0x243b050a

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a78\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x3

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x63af

    const v7, -0x5b1e78d2

    xor-int/2addr v6, v7

    const v7, 0x37d11f72

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fb4a28c -> :sswitch_0
        -0x7b855840 -> :sswitch_e
        -0x7879766c -> :sswitch_5
        -0x510af4d5 -> :sswitch_8
        -0x338da060 -> :sswitch_4
        -0x32b4a86d -> :sswitch_10
        -0x280994bc -> :sswitch_1
        -0x268493ab -> :sswitch_9
        -0x233275c4 -> :sswitch_2
        -0x1e7d5332 -> :sswitch_1
        -0xd6975ce -> :sswitch_8
        -0x87606ab -> :sswitch_7
        -0x1fdaf46 -> :sswitch_0
        0x7757b2f -> :sswitch_a
        0xa04d30e -> :sswitch_9
        0xb2375e8 -> :sswitch_e
        0x15a923df -> :sswitch_10
        0x17572d5f -> :sswitch_d
        0x1ec2cd0e -> :sswitch_2
        0x30b74af8 -> :sswitch_4
        0x334395cc -> :sswitch_5
        0x36e4417a -> :sswitch_c
        0x3a96eeb3 -> :sswitch_f
        0x3c9b5abf -> :sswitch_3
        0x46b75fcd -> :sswitch_a
        0x4a856ac4 -> :sswitch_3
        0x5584b283 -> :sswitch_6
        0x5819f78e -> :sswitch_7
        0x5ff29654 -> :sswitch_6
        0x70f175db -> :sswitch_f
        0x721bf65c -> :sswitch_b
        0x729b042a -> :sswitch_c
        0x755c68f0 -> :sswitch_d
        0x7ce78388 -> :sswitch_b
    .end sparse-switch
.end method

.method public abstract ۙ(Ljava/lang/String;)Ljava/io/InputStream;
.end method

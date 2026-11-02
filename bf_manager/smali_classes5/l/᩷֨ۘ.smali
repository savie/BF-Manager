.class public abstract Ll/᩷֨ۘ;
.super Ljava/lang/Object;
.source "K3YT"

# interfaces
.implements Ll/ۤ֨ۘ;


# virtual methods
.method public final ۙ(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x96e98ec

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v4, Ll/֡֡;->᩶ۤ۠:I

    const-string v5, "\u1a74\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0xd

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7b55

    const v7, 0x6d7157cb

    xor-int/2addr v6, v7

    const v7, 0x1a6ba36

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x7733

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 25
    sget v5, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v5, :cond_1

    goto/16 :goto_2

    .line 168
    :sswitch_0
    sget v5, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez v5, :cond_a

    goto/16 :goto_4

    .line 40
    :sswitch_1
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v5

    if-ltz v5, :cond_6

    goto/16 :goto_4

    .line 195
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget v5, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v5, :cond_3

    goto/16 :goto_4

    .line 254
    :sswitch_3
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    goto/16 :goto_4

    .line 339
    :sswitch_4
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    :goto_1
    const/4 p1, 0x0

    return-object p1

    .line 368
    :sswitch_5
    invoke-interface {p1, v1}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/Throwable;)V

    goto :goto_1

    :sswitch_6
    return-object v0

    .line 366
    :sswitch_7
    :try_start_0
    invoke-virtual {p0, p2}, Ll/᩷֨ۘ;->ۙ(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, "\u0736\u073a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x79

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5af3

    const v7, -0x3ab239c2

    xor-int/2addr v6, v7

    const v7, 0x701c9591

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v5, "\u05ab\u06e7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x31e5

    const v7, -0x49b9267c

    xor-int/2addr v6, v7

    const v7, 0x5eaaf6fa

    goto :goto_0

    .line 215
    :sswitch_8
    sget v5, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v5, :cond_0

    goto :goto_2

    :cond_0
    const-string v5, "\u06e7\u1a74"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5ff3

    const v7, 0x3266dcd0

    xor-int/2addr v6, v7

    const v7, 0x481dbf0e

    goto/16 :goto_0

    :cond_1
    const-string v5, "\u073d\u1a78"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x9

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4245

    const v7, 0x3dd08bf3

    xor-int/2addr v6, v7

    const v7, -0x361edcc5

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v5, :cond_2

    :goto_2
    const-string v5, "\u06eb\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0xd

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7431

    const v7, -0x8837fe2

    xor-int/2addr v6, v7

    const v7, 0x8706557

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u1a73\u06d7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x1f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3de9

    const v7, -0x4fd91fa4

    xor-int/2addr v6, v7

    const v7, -0xe532012

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v5

    if-eqz v5, :cond_4

    :cond_3
    const-string v5, "\u06e1\u06e7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x50b1

    const v7, 0x22d617d0

    xor-int/2addr v6, v7

    const v7, 0x127601a0

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06e0\u1a75"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x6d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x652f

    const v7, 0x59aafe4

    xor-int/2addr v6, v7

    const v7, -0x24cbd4dd

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v5, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v5, "\u06d8\u06db"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x513

    const v7, 0x19a5482

    xor-int/2addr v6, v7

    const v7, 0x757e5caf

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v5, :cond_7

    :cond_6
    const-string v5, "\u1a73\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x65

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x110b

    const v7, -0x44729e3c

    xor-int/2addr v6, v7

    const v7, -0x3d039858

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06d7\u06da"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xddd

    const v7, 0x183f33f8

    xor-int/2addr v6, v7

    const v7, -0x5ce1ffdf

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v5, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u06db\u06e2"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x61

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x70a9

    const v7, 0x5775353a

    xor-int/2addr v6, v7

    const v7, 0x15477beb

    goto/16 :goto_0

    .line 150
    :sswitch_e
    sget v5, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v5, :cond_9

    goto :goto_4

    :cond_9
    const-string v5, "\u1a76\u06e2"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x57

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2841

    const v7, -0x58b0e036

    xor-int/2addr v6, v7

    const v7, 0xac0a78b

    goto/16 :goto_0

    .line 224
    :sswitch_f
    sget v5, Ll/֨ۧ;->֫۠֡:I

    if-gtz v5, :cond_b

    :cond_a
    :goto_3
    const-string v5, "\u06e0\u06eb"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5497

    const v7, 0x7db95d56

    xor-int/2addr v6, v7

    const v7, 0x352fbdbf

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u073a\u06e2"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x75e1

    const v7, -0x508fee87

    xor-int/2addr v6, v7

    const v7, -0x40a0cfda

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v5, :cond_c

    :goto_4
    const-string v5, "\u06d6\u1a7b"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6a6f

    const v7, 0x1cfc6aef

    xor-int/2addr v6, v7

    const v7, -0x1c857074

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06dc\u05a8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x1b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1e97

    const v7, -0x14116eb0

    xor-int/2addr v6, v7

    const v7, 0x57ddaee1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x64691997 -> :sswitch_8
        -0x5e9fc183 -> :sswitch_7
        -0x5c44bb1d -> :sswitch_f
        -0x4bc14f7f -> :sswitch_d
        -0x4b86c4dc -> :sswitch_3
        -0x445edae5 -> :sswitch_e
        -0x445037ba -> :sswitch_1
        -0x3f237d15 -> :sswitch_b
        -0x39fba9cd -> :sswitch_4
        -0x36bbb011 -> :sswitch_c
        -0x368352f9 -> :sswitch_2
        -0x32c2e19e -> :sswitch_d
        -0x30543b39 -> :sswitch_10
        -0x200a8b8c -> :sswitch_10
        -0x1b6f9816 -> :sswitch_a
        -0x1758f542 -> :sswitch_5
        -0x10cbbcdf -> :sswitch_b
        -0xc8ab0d3 -> :sswitch_e
        0x730332 -> :sswitch_8
        0x4f628a7 -> :sswitch_c
        0x1051566e -> :sswitch_1
        0x1c834b10 -> :sswitch_6
        0x1d069dfa -> :sswitch_f
        0x222e0e0f -> :sswitch_0
        0x29bb6757 -> :sswitch_0
        0x2f30ddfd -> :sswitch_7
        0x37d8390b -> :sswitch_6
        0x4adfa4e1 -> :sswitch_9
        0x54d5c338 -> :sswitch_4
        0x56309cc6 -> :sswitch_a
        0x5e5c4465 -> :sswitch_3
        0x61276c91 -> :sswitch_5
        0x765b4f6d -> :sswitch_9
        0x7ec79a3a -> :sswitch_2
    .end sparse-switch
.end method

.method public abstract ۙ(Ljava/lang/String;)Ljava/io/InputStream;
.end method

.class public final synthetic Ll/ۤᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 7

    const/4 v0, 0x0

    const v1, -0x7e96e755

    sget v2, Ll/֫ܽ;->֡ᩴܶ:I

    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v4, "\u06d6\u073a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x301d

    const v6, -0x7113c519

    xor-int/2addr v5, v6

    const v6, -0x3f265f30

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x7651

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_5

    goto/16 :goto_4

    .line 1589
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v4, :cond_b

    goto/16 :goto_3

    :sswitch_1
    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez v4, :cond_6

    goto/16 :goto_3

    :sswitch_2
    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_8

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto/16 :goto_1

    .line 1358
    :sswitch_4
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    const-wide/16 v0, 0x0

    return-wide v0

    .line 4
    :sswitch_5
    sget p1, Ll/ۙ۠ۘ;->᩻ܰ:I

    .line 2277
    iget-wide v0, v0, Ll/ܽᩴۘ;->ۙ:J

    return-wide v0

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/ܽᩴۘ;

    .line 1902
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u1a74\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3ef1

    const v6, 0x2570455a

    xor-int/2addr v5, v6

    const v6, 0x6f1e037f

    goto :goto_0

    :cond_0
    const-string v4, "\u1a73\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2fe7

    const v6, -0x4d305a5a

    xor-int/2addr v5, v6

    const v6, 0x7511e4c5

    goto :goto_0

    :sswitch_7
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u1a73\u0730"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2885

    const v6, 0x7b29ab97

    xor-int/2addr v5, v6

    const v6, -0x685a379a

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u1a7a\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2f33

    const v6, -0x5267f707

    xor-int/2addr v5, v6

    const v6, -0x5385c00c

    goto/16 :goto_0

    .line 1348
    :sswitch_9
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06e1\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3f1

    const v6, -0x4fa244d

    xor-int/2addr v5, v6

    const v6, 0xbd53eb9

    goto/16 :goto_0

    .line 131
    :sswitch_a
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_4

    :goto_1
    const-string v4, "\u06d7\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v2

    mul-int/lit8 v5, v5, -0x17

    const v6, -0x793d6ea1

    xor-int/2addr v5, v6

    const v6, -0x4efa332b

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u05a1\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x307f

    const v6, -0x11975452

    xor-int/2addr v5, v6

    const v6, 0x62216529

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e8\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x591

    const v6, -0x27d292fe

    xor-int/2addr v5, v6

    const v6, -0x746a84ac

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_7

    :cond_6
    :goto_2
    const-string v4, "\u06df\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3ae5

    const v6, 0x28d30e7d

    xor-int/2addr v5, v6

    const v6, -0x105eb2e7

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u05a8\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4af3

    const v6, 0x17e17704

    xor-int/2addr v5, v6

    const v6, -0x14fdabc4

    goto/16 :goto_0

    .line 1327
    :sswitch_c
    sget-boolean v4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u06db\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2f31

    const v6, -0x72c1cfa4

    xor-int/2addr v5, v6

    const v6, 0x784a8b45

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u0736\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7d43

    const v6, -0x49d093a3

    xor-int/2addr v5, v6

    const v6, -0x16fc19e4

    goto/16 :goto_0

    .line 573
    :sswitch_d
    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u0730\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x2d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3351

    const v6, -0x1f799521

    xor-int/2addr v5, v6

    const v6, -0x1037481c

    goto/16 :goto_0

    .line 1459
    :sswitch_e
    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a76\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x66d1

    const v6, -0x198cebf8

    xor-int/2addr v5, v6

    const v6, -0x4bb93e67

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a1\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6e09

    const v6, -0x511c4bbc

    xor-int/2addr v5, v6

    const v6, 0x38c2eec3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cf9626e -> :sswitch_b
        -0x7b5ec769 -> :sswitch_0
        -0x6055902a -> :sswitch_3
        -0x5c10a1ee -> :sswitch_9
        -0x5a4bf809 -> :sswitch_4
        -0x48f2e7a1 -> :sswitch_7
        -0x385f7565 -> :sswitch_e
        -0x1f965b93 -> :sswitch_8
        -0x19f8d377 -> :sswitch_a
        -0x12a00fd6 -> :sswitch_0
        -0x11b5f582 -> :sswitch_d
        -0x3dede38 -> :sswitch_9
        0x33df91 -> :sswitch_d
        0x9a602c4 -> :sswitch_6
        0xc3f8c3e -> :sswitch_1
        0x10cf1f65 -> :sswitch_8
        0x1664ec3d -> :sswitch_1
        0x29caa855 -> :sswitch_c
        0x34817e33 -> :sswitch_5
        0x34fe4f32 -> :sswitch_4
        0x46b211b4 -> :sswitch_5
        0x4e8544ed -> :sswitch_3
        0x501957d8 -> :sswitch_6
        0x5626c7d4 -> :sswitch_7
        0x5987a57d -> :sswitch_2
        0x5e3a9eee -> :sswitch_c
        0x6029feb5 -> :sswitch_a
        0x71a1677a -> :sswitch_2
        0x75471ad8 -> :sswitch_e
        0x7a9a4da6 -> :sswitch_b
    .end sparse-switch
.end method

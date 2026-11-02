.class public final synthetic Ll/ۡᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x32434fa2

    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v5, "\u06e7\u06dc"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2d8f

    const v7, -0x698295de

    xor-int/2addr v6, v7

    const v7, 0x26b0b5a2

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x298f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 2262
    sget-boolean v5, Ll/᩶;->ۚۤۘ:Z

    if-eqz v5, :cond_4

    goto/16 :goto_3

    .line 1653
    :sswitch_0
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v5, :cond_9

    goto :goto_1

    .line 407
    :sswitch_1
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    sget v5, Ll/ۗ᩺;->ۢۜ᩶:I

    if-lez v5, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v5, "\u06df\u0730"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5ef9

    const v7, 0x2f3b6a3f

    xor-int/2addr v6, v7

    const v7, 0x7575b612

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v5

    if-nez v5, :cond_6

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    goto/16 :goto_4

    .line 1539
    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    const/4 p1, 0x0

    return p1

    .line 6
    :sswitch_5
    sget p1, Ll/ۙ۠ۘ;->᩻ܰ:I

    .line 2274
    iget-object p1, v0, Ll/ܽᩴۘ;->ܶ:Ljava/lang/String;

    iget-object p2, v1, Ll/ܽᩴۘ;->ܶ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/ܽᩴۘ;

    .line 4
    move-object v1, p2

    check-cast v1, Ll/ܽᩴۘ;

    .line 714
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v5

    if-nez v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u06d8\u06da"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x26fb

    const v7, -0x4a93cba8

    xor-int/2addr v6, v7

    const v7, -0x262b4ec9

    goto :goto_0

    .line 1695
    :sswitch_7
    sget v5, Ll/ۗ;->֨۬ۖ:I

    if-ltz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u05ab\u06db"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x40cd

    const v7, 0x463da292

    xor-int/2addr v6, v7

    const v7, -0x3b8d7813

    goto/16 :goto_0

    .line 1189
    :sswitch_8
    sget v5, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u06d6\u073d"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6bed

    const v7, -0x1f724f3d

    xor-int/2addr v6, v7

    const v7, -0x38007b81

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u073d\u073f"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x79c5

    const v7, 0x342b7112

    xor-int/2addr v6, v7

    const v7, -0x3fec7a6d

    goto/16 :goto_0

    .line 398
    :sswitch_9
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v5

    if-ltz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u1a73\u06e8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5629

    const v7, 0x636f8dbe

    xor-int/2addr v6, v7

    const v7, 0x10f4b594

    goto/16 :goto_0

    .line 1302
    :sswitch_a
    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_7

    :cond_6
    :goto_2
    const-string v5, "\u06e1\u1a77"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x4f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2e37

    const v7, -0x6b994656

    xor-int/2addr v6, v7

    const v7, -0x62eacff7

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06d8\u06ec"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x21

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x46c7

    const v7, -0x19412d8d

    xor-int/2addr v6, v7

    const v7, -0x1f10d41c

    goto/16 :goto_0

    .line 6
    :sswitch_b
    sget v5, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v5, :cond_8

    :goto_3
    const-string v5, "\u1a7a\u1a77"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2dd7

    const v7, 0x31bfbe92

    xor-int/2addr v6, v7

    const v7, -0x7f66f1db

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u1a75\u06e4"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5661

    const v7, -0x7629b8c3

    xor-int/2addr v6, v7

    const v7, 0x5593289b

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v5, :cond_a

    :cond_9
    const-string v5, "\u06d7\u06df"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6691

    const v7, 0x70e5350a

    xor-int/2addr v6, v7

    const v7, 0x6304f399

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06d9\u073a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3dc5

    const v7, 0x16ade7ad

    xor-int/2addr v6, v7

    const v7, 0x27b2c4cd

    goto/16 :goto_0

    .line 588
    :sswitch_d
    sget v5, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v5, :cond_b

    goto :goto_4

    :cond_b
    const-string v5, "\u073f\u06d9"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5091

    const v7, 0x61e1c1bf

    xor-int/2addr v6, v7

    const v7, -0x69a9842

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v5, :cond_c

    :goto_4
    const-string v5, "\u073a\u1a78"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4ecd

    const v7, 0x701f9f33

    xor-int/2addr v6, v7

    const v7, 0x63660988

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u0736\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1eb9

    const v7, -0x1ae595e1

    xor-int/2addr v6, v7

    const v7, -0x33d1c770    # -4.5670976E7f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c77b4bb -> :sswitch_9
        -0x77257965 -> :sswitch_4
        -0x6d99e686 -> :sswitch_c
        -0x64fc5e86 -> :sswitch_d
        -0x64cf087e -> :sswitch_3
        -0x639b68f6 -> :sswitch_5
        -0x4ee1b7cc -> :sswitch_e
        -0x48f27edd -> :sswitch_e
        -0x3dc1cd29 -> :sswitch_a
        -0x33f195df -> :sswitch_b
        -0x301ef016 -> :sswitch_8
        -0x2f2aff1e -> :sswitch_1
        -0x1ff611af -> :sswitch_7
        -0x1ededb4a -> :sswitch_2
        -0x1b2bac95 -> :sswitch_7
        -0x12abcd3e -> :sswitch_0
        -0xb55f7ce -> :sswitch_1
        0x80baca6 -> :sswitch_8
        0xb2b1058 -> :sswitch_4
        0x12d9f5a9 -> :sswitch_c
        0x1734605b -> :sswitch_0
        0x22fd8326 -> :sswitch_2
        0x2fce4410 -> :sswitch_6
        0x35409b98 -> :sswitch_9
        0x3c26c927 -> :sswitch_b
        0x4e7a4b76 -> :sswitch_5
        0x52130cde -> :sswitch_3
        0x5b80ffb9 -> :sswitch_d
        0x69e7bb95 -> :sswitch_a
        0x7a3cf4a4 -> :sswitch_6
    .end sparse-switch
.end method

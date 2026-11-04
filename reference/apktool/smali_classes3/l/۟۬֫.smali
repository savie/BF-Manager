.class public final Ll/۟۬֫;
.super Ljava/util/LinkedHashMap;
.source "H6HS"


# virtual methods
.method public final removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 5

    const p1, 0x14fafe55

    sget v0, Ll/֨ۚ;->֡᩸ۛ:I

    sget v1, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v2, "\u1a7b\u0733"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x58f3

    const v4, -0xd0f43f9

    xor-int/2addr v3, v4

    const v4, -0x59525160

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, 0x1e21

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    .line 46
    sget v2, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v2, :cond_6

    goto/16 :goto_5

    .line 18
    :sswitch_0
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_2

    :sswitch_1
    sget-boolean v2, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v2, :cond_3

    goto/16 :goto_3

    :sswitch_2
    sget v2, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v2, :cond_9

    goto :goto_1

    .line 30
    :sswitch_3
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    :goto_1
    const-string v2, "\u05a1\u06db"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x6f

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x5127

    const v4, -0x24048555

    xor-int/2addr v3, v4

    const v4, -0x7a8d9d0a

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 p1, 0x1

    return p1

    :sswitch_6
    const/4 p1, 0x0

    return p1

    .line 51
    :sswitch_7
    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    move-result v2

    const/16 v3, 0x20

    if-le v2, v3, :cond_0

    const-string v2, "\u06eb\u1a7a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, -0x11

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x51f1

    const v4, -0x762163f7

    xor-int/2addr v3, v4

    const v4, -0x7e1d8562

    goto :goto_0

    :cond_0
    const-string v2, "\u1a74\u06e7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x7d

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x427f

    const v4, 0x2129d98e

    xor-int/2addr v3, v4

    const v4, -0xb3b2446

    goto :goto_0

    .line 31
    :sswitch_8
    sget v2, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v2, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v2, "\u1a76\u06e1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x33

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x3c07

    const v4, -0x1a026f58

    xor-int/2addr v3, v4

    const v4, 0x263cd7d4

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v2, "\u1a7a\u073f"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x2ef

    const v4, -0x4e6a23c8

    xor-int/2addr v3, v4

    const v4, -0x27a02cf2

    goto/16 :goto_0

    :sswitch_a
    sget v2, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v2, :cond_4

    :cond_3
    :goto_2
    const-string v2, "\u06e2\u06d9"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x2b

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x223f

    const v4, -0xf5f9b46

    xor-int/2addr v3, v4

    const v4, 0x4a1331af    # 2411627.8f

    goto/16 :goto_0

    :cond_4
    const-string v2, "\u073a\u073f"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x5123

    const v4, -0x2ef0235c

    xor-int/2addr v3, v4

    const v4, -0x3b73071e

    goto/16 :goto_0

    .line 34
    :sswitch_b
    sget v2, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v2, :cond_5

    goto :goto_3

    :cond_5
    const-string v2, "\u06e7\u073f"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x75

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x249d

    const v4, -0xcb7f827

    xor-int/2addr v3, v4

    const v4, -0x50cba311

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u1a7b\u06eb"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x47

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x46d3

    const v4, 0x697c9da1

    xor-int/2addr v3, v4

    const v4, 0x572c07de

    goto/16 :goto_0

    .line 38
    :sswitch_c
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_7
    const-string v2, "\u06e0\u06df"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x4771

    const v4, -0x656b201e

    xor-int/2addr v3, v4

    const v4, -0x2e433559

    goto/16 :goto_0

    :sswitch_d
    sget v2, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    const-string v2, "\u06e1\u06e4"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x39c9

    const v4, -0x6f5a0756

    xor-int/2addr v3, v4

    const v4, 0x340c20dc

    goto/16 :goto_0

    :sswitch_e
    sget v2, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v2, :cond_a

    :cond_9
    :goto_3
    const-string v2, "\u1a78\u1a7a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0xde3

    const v4, -0x1d45c7f

    xor-int/2addr v3, v4

    const v4, -0x39cd5ce4

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u0733\u06e2"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0xb

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x119

    const v4, 0x7006d751

    xor-int/2addr v3, v4

    const v4, -0x56644ccf

    goto/16 :goto_0

    .line 21
    :sswitch_f
    sget v2, Ll/ۖ;->ܿۚ֡:I

    if-ltz v2, :cond_c

    :cond_b
    :goto_4
    const-string v2, "\u1a79\u06e0"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x6855

    const v4, -0xc3819db

    xor-int/2addr v3, v4

    const v4, 0x5556a557

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u1a76\u0736"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0xd75

    const v4, -0x2a2bc906

    xor-int/2addr v3, v4

    const v4, 0x3bcc7ea1

    goto/16 :goto_0

    .line 4
    :sswitch_10
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v2

    if-gtz v2, :cond_d

    :goto_5
    const-string v2, "\u073a\u06e4"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x53ad

    const v4, -0x350bd14c    # -8001370.0f

    xor-int/2addr v3, v4

    const v4, 0x250180c1

    goto/16 :goto_0

    :cond_d
    const-string v2, "\u05a1\u073a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x29ed

    const v4, 0x5e1d4956

    xor-int/2addr v3, v4

    const v4, 0x2057a384

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7af16121 -> :sswitch_e
        -0x78e49837 -> :sswitch_3
        -0x624e071c -> :sswitch_d
        -0x62300626 -> :sswitch_9
        -0x5cd8952d -> :sswitch_c
        -0x584e8eec -> :sswitch_8
        -0x5450b34f -> :sswitch_e
        -0x537d2589 -> :sswitch_a
        -0x4fd5b6ac -> :sswitch_7
        -0x4dd50ff9 -> :sswitch_0
        -0x48837fef -> :sswitch_f
        -0x42d4703d -> :sswitch_b
        -0x3d81f704 -> :sswitch_1
        -0x3d5cfe63 -> :sswitch_4
        -0x3a70516f -> :sswitch_6
        -0x23906eb2 -> :sswitch_1
        -0x23317ae8 -> :sswitch_f
        -0x1e893faf -> :sswitch_0
        -0x1c80a584 -> :sswitch_4
        -0x18b38307 -> :sswitch_2
        -0x17b2d82f -> :sswitch_5
        -0xa50d2a4 -> :sswitch_2
        -0x1318f15 -> :sswitch_5
        -0xbb89e6 -> :sswitch_d
        0x260d9383 -> :sswitch_10
        0x31e29e24 -> :sswitch_6
        0x36ce9b28 -> :sswitch_10
        0x3b26afb1 -> :sswitch_7
        0x483ce69b -> :sswitch_8
        0x4fa4ecae -> :sswitch_c
        0x511a7a32 -> :sswitch_3
        0x53a7898b -> :sswitch_9
        0x5caee81e -> :sswitch_b
        0x656653ca -> :sswitch_a
    .end sparse-switch
.end method

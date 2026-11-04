.class public final Ll/ۘ᩷ۧ;
.super Ljava/lang/Object;
.source "5IS2"


# static fields
.field private static final ܺ᩷ܳ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۘ᩷ۧ;->ܺ᩷ܳ:[S

    return-void

    :array_0
    .array-data 2
        0x1b6es
        -0xe51s
        -0xe51s
        -0xe56s
        -0xe41s
        0xe76s
        0x1554s
        0x1554s
        0x1551s
        0x1544s
        0x1554s
        0x1554s
        0x1551s
        0x1544s
    .end array-data
.end method

.method public static ۙ()I
    .locals 17

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, -0x1567cca2    # -9.199965E25f

    sget v12, Ll/֨ۢ;->۬ܿܺ:I

    sget v13, Ll/֫ۢ;->ۚ᩻᩵:I

    const-string v14, "\u073a\u06d8"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x5ef9

    const v16, -0x592d001c

    xor-int v15, v15, v16

    const v16, 0x1f8c3ef5

    :goto_0
    xor-int v14, v14, v16

    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, 0x2643

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 20
    sget-boolean v14, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v14, :cond_8

    goto/16 :goto_5

    .line 16
    :sswitch_0
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v14, Ll/᩶;->ᩴ᩶ۛ:I

    if-lez v14, :cond_b

    goto :goto_1

    :sswitch_1
    sget v14, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v14, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v14, "\u06e1\u1a7b"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x2b

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x69f1

    const v16, -0x1a0e68cc

    xor-int v15, v15, v16

    const v16, 0x496279cd

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    const/4 v0, 0x0

    return v0

    :sswitch_4
    and-int/lit8 v0, v2, 0x7

    return v0

    :sswitch_5
    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    sget v14, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v14, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v14, "\u06d9\u1a7b"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x2c41

    const v16, -0x7c522778

    xor-int v15, v15, v16

    const v16, 0x1e1b5d44

    goto :goto_0

    :sswitch_6
    const/4 v1, 0x4

    invoke-static {v9, v10, v1, v8}, Ll/ۘ۟;->᩷᩶۟([SIII)Ljava/lang/String;

    move-result-object v1

    .line 19
    sget v14, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v14, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v14, "\u06eb\u073a"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, -0x5f

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x6269

    const v16, 0x29cdff76

    xor-int v15, v15, v16

    const v16, -0x3fa6454b

    goto/16 :goto_0

    :sswitch_7
    const/4 v10, 0x1

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v14

    if-ltz v14, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v14, "\u06d6\u06da"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x19

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x6a9b

    const v16, 0x13c1b5b3

    xor-int v15, v15, v16

    const v16, -0x2865e8f0

    goto/16 :goto_0

    .line 16
    :sswitch_8
    sget-object v0, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    sget-object v9, Ll/ۘ᩷ۧ;->ܺ᩷ܳ:[S

    .line 20
    sget v14, Ll/ۖ;->ܿۚ֡:I

    if-ltz v14, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v14, "\u06da\u06e2"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x70df

    const v16, -0x60b989bb

    xor-int v15, v15, v16

    const v16, 0x3134555b

    goto/16 :goto_0

    :sswitch_9
    const/16 v8, 0x6bf5

    goto :goto_2

    :sswitch_a
    const v8, 0xf1dc

    :goto_2
    const-string v14, "\u05a1\u1a77"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0xf

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x51cd

    const v16, -0x7a8f6299

    xor-int v15, v15, v16

    const v16, 0x356b60f0

    goto/16 :goto_0

    :sswitch_b
    mul-int v14, v7, v7

    sub-int/2addr v14, v6

    if-ltz v14, :cond_5

    const-string v14, "\u06d8\u073d"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x1e01

    const v16, -0x4c78b082

    xor-int v15, v15, v16

    const v16, 0x3dd50e9

    goto/16 :goto_0

    :cond_5
    const-string v14, "\u06d7\u1a75"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x379f

    const v16, 0x86911ab

    xor-int v15, v15, v16

    const v16, -0x74e78dd4

    goto/16 :goto_0

    :sswitch_c
    add-int/lit16 v7, v5, 0x35cc

    .line 19
    sget v14, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v14, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v14, "\u06dc\u1a74"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x14c3

    const v16, 0x728ca029

    xor-int v15, v15, v16

    const v16, -0x3789d08f

    goto/16 :goto_0

    :sswitch_d
    const v6, 0xd730

    mul-int v6, v6, v5

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v14

    if-nez v14, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v14, "\u06e7\u06dc"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x5c2d

    const v16, -0x444a6dd0

    xor-int v15, v15, v16

    const v16, -0x5303282a

    goto/16 :goto_0

    :sswitch_e
    aget-short v5, v3, v4

    .line 18
    sget v14, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v14, :cond_9

    :cond_8
    :goto_3
    const-string v14, "\u06e0\u0736"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0x67

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x3251

    const v16, 0x4a8a1

    xor-int v15, v15, v16

    const v16, 0x3d66fb20

    goto/16 :goto_0

    :cond_9
    const-string v14, "\u06e7\u1a7a"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x55

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x18db

    const v16, 0x423a26a9

    xor-int v15, v15, v16

    const v16, 0x1b000859

    goto/16 :goto_0

    .line 17
    :sswitch_f
    sget v14, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v14, :cond_a

    :goto_4
    const-string v14, "\u06d6\u06ec"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0x23

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x1e69

    const v16, -0x574773b

    xor-int v15, v15, v16

    const v16, -0x6b961467

    goto/16 :goto_0

    :cond_a
    const-string v14, "\u1a75\u06ec"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x49

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x38df

    const v16, 0x61359fbb

    xor-int v15, v15, v16

    const v16, -0x1df4a7df

    goto/16 :goto_0

    :sswitch_10
    sget v14, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v14, :cond_c

    :cond_b
    :goto_5
    const-string v14, "\u1a77\u06d9"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0x1f

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x290d

    const v16, 0x2faaf6d6

    xor-int v15, v15, v16

    const v16, 0x7721278b

    goto/16 :goto_0

    :cond_c
    const-string v14, "\u1a74\u1a76"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x3ac9

    const v16, 0x7fe5c9e9

    xor-int v15, v15, v16

    const v16, 0x2ae8b8ed

    goto/16 :goto_0

    :sswitch_11
    sget-object v3, Ll/ۘ᩷ۧ;->ܺ᩷ܳ:[S

    const/4 v4, 0x0

    .line 20
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v14

    if-eqz v14, :cond_d

    :goto_6
    const-string v14, "\u1a74\u06eb"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x61

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x21d3

    const v16, -0x3fa7c870

    xor-int v15, v15, v16

    const v16, 0x43057278

    goto/16 :goto_0

    :cond_d
    const-string v14, "\u1a75\u06e4"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x1dab

    const v16, -0x2ba87720

    xor-int v15, v15, v16

    const v16, 0x3f50d82e

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7abd86eb -> :sswitch_4
        -0x735ea986 -> :sswitch_c
        -0x6dbf3940 -> :sswitch_9
        -0x6c9ae7be -> :sswitch_3
        -0x63016803 -> :sswitch_8
        -0x55463f89 -> :sswitch_0
        -0x4d626f32 -> :sswitch_2
        -0x4667cd2d -> :sswitch_b
        -0x448cf76c -> :sswitch_6
        -0x410d60d8 -> :sswitch_6
        -0x3e9c1f55 -> :sswitch_5
        -0x3c54f380 -> :sswitch_d
        -0x3a821a92 -> :sswitch_4
        -0x37e6c71c -> :sswitch_c
        -0x1bca4a37 -> :sswitch_10
        -0x15ad2705 -> :sswitch_7
        -0x118c3e51 -> :sswitch_1
        0x2156167 -> :sswitch_7
        0x4942283 -> :sswitch_a
        0x1279c7df -> :sswitch_d
        0x13109681 -> :sswitch_b
        0x23ed2af1 -> :sswitch_8
        0x244cfe4f -> :sswitch_e
        0x2b599047 -> :sswitch_0
        0x407c3c70 -> :sswitch_1
        0x4506f729 -> :sswitch_10
        0x4ceae061 -> :sswitch_11
        0x4e0ec588 -> :sswitch_f
        0x4f1dbb8d -> :sswitch_5
        0x507ecaba -> :sswitch_9
        0x546b2fd4 -> :sswitch_f
        0x5f51c6ca -> :sswitch_3
        0x6738b86b -> :sswitch_a
        0x6cdca6f7 -> :sswitch_2
        0x77ab4ab2 -> :sswitch_e
        0x7b69ebcc -> :sswitch_11
    .end sparse-switch
.end method

.method public static ۙ(I)V
    .locals 1

    const/4 v0, 0x7

    .line 31
    invoke-static {v0, p0}, Ll/ۘ᩷ۧ;->ۙ(II)V

    return-void
.end method

.method public static declared-synchronized ۙ(II)V
    .locals 6

    sget-object v0, Ll/ۘ᩷ۧ;->ܺ᩷ܳ:[S

    const/4 v1, 0x5

    aget-short v0, v0, v1

    mul-int v1, v0, v0

    const v2, 0x7c49a40

    add-int/2addr v1, v2

    add-int/2addr v1, v1

    add-int/lit16 v0, v0, 0x2c98

    mul-int v0, v0, v0

    sub-int/2addr v1, v0

    if-gez v1, :cond_0

    const/16 v0, 0x2883

    const/16 v1, 0x2883

    goto :goto_0

    :cond_0
    const/16 v0, 0x1527

    const/16 v1, 0x1527

    .line 2
    :goto_0
    const-class v0, Ll/ۘ᩷ۧ;

    .line 3
    monitor-enter v0

    .line 35
    :try_start_0
    sget-object v2, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    sget-object v3, Ll/ۘ᩷ۧ;->ܺ᩷ܳ:[S

    const/4 v4, 0x6

    const/4 v5, 0x4

    invoke-static {v3, v4, v5, v1}, Ll/֫֨;->ۡᩴۛ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    not-int v3, p0

    and-int/2addr v3, v2

    and-int/2addr p0, p1

    or-int/2addr p0, v3

    if-eq p0, v2, :cond_1

    .line 38
    sget-object p1, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    sget-object v2, Ll/ۘ᩷ۧ;->ܺ᩷ܳ:[S

    const/16 v3, 0xa

    const/4 v4, 0x4

    invoke-static {v2, v3, v4, v1}, Ll/֨ۢ;->ܰ֫֡([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, p0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 40
    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۙ(IZ)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x3f9ef259

    sget v3, Ll/᩺;->۫۬۫:I

    sget v4, Ll/ۘ֡;->᩹ܶ۬:I

    const-string v5, "\u073d\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x71

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6f13

    const v7, 0xbf9f54a

    xor-int/2addr v6, v7

    const v7, -0x421a31a3

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x47a1

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 0
    sget v5, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v5, :cond_3

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v5, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v5, "\u06eb\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x941

    const v7, -0x731ec3e6

    xor-int/2addr v6, v7

    const v7, 0x2d50ea0

    goto :goto_0

    :sswitch_1
    sget v5, Ll/ۘ۟;->ۜ᩺᩺:I

    if-nez v5, :cond_9

    goto/16 :goto_5

    :sswitch_2
    sget-boolean v5, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v5, :cond_c

    goto/16 :goto_4

    .line 16
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    goto/16 :goto_4

    .line 1
    :sswitch_4
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    return-void

    .line 26
    :sswitch_5
    invoke-static {v0, v1}, Ll/ۘ᩷ۧ;->ۙ(II)V

    return-void

    :sswitch_6
    const/4 v1, 0x0

    goto :goto_1

    :sswitch_7
    and-int/lit8 v0, p0, 0x7

    if-eqz p1, :cond_1

    move v1, p0

    :goto_1
    const-string v5, "\u0730\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x23

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xb6f

    const v7, 0x542e8ea0

    xor-int/2addr v6, v7

    const v7, 0x1f4a26f2

    goto :goto_0

    :cond_1
    const-string v5, "\u06e7\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5f9b

    const v7, 0x31b75f96

    xor-int/2addr v6, v7

    const v7, 0xc5eb10e

    goto :goto_0

    :sswitch_8
    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    const-string v5, "\u06db\u06e8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4077

    const v7, -0x64b122b7

    xor-int/2addr v6, v7

    const v7, -0x20f0a8dd

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06d6\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x71

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xb3

    const v7, -0x67895128

    xor-int/2addr v6, v7

    const v7, -0x5891a6ea

    goto/16 :goto_0

    .line 13
    :sswitch_9
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v5

    if-eqz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u06d8\u05a8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x16f7

    const v7, -0x9ba4954

    xor-int/2addr v6, v7

    const v7, -0x28fe9f47

    goto/16 :goto_0

    .line 4
    :sswitch_a
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v5

    if-gtz v5, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v5, "\u06e4\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x41

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2d91

    const v7, -0x53fb4a97

    xor-int/2addr v6, v7

    const v7, -0xbe938d7

    goto/16 :goto_0

    .line 19
    :sswitch_b
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v5

    if-nez v5, :cond_6

    :goto_2
    const-string v5, "\u05ab\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x395b

    const v7, 0x100494aa

    xor-int/2addr v6, v7

    const v7, 0x11991093

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06d6\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x783d

    const v7, 0x5bb06e64

    xor-int/2addr v6, v7

    const v7, -0x5f93b49

    goto/16 :goto_0

    .line 21
    :sswitch_c
    sget v5, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u1a78\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x67b

    const v7, 0xb168297

    xor-int/2addr v6, v7

    const v7, -0x120f007c

    goto/16 :goto_0

    .line 9
    :sswitch_d
    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v5, :cond_8

    goto :goto_4

    :cond_8
    const-string v5, "\u06e0\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1a0d

    const v7, -0x4439e746

    xor-int/2addr v6, v7

    const v7, -0xa3af650

    goto/16 :goto_0

    .line 5
    :sswitch_e
    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u06d9\u06e0"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x44eb

    const v7, 0x5be56a4f

    xor-int/2addr v6, v7

    const v7, -0x49d922ba

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a7a\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x3d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x49b3

    const v7, 0x532551fe

    xor-int/2addr v6, v7

    const v7, 0x4e22b151    # 6.823824E8f

    goto/16 :goto_0

    .line 2
    :sswitch_f
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v5

    if-ltz v5, :cond_b

    :goto_4
    const-string v5, "\u05ab\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x61ad

    const v7, 0x1ab59d34

    xor-int/2addr v6, v7

    const v7, -0x40a5ab1f

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u05a1\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2b3f

    const v7, 0x41dec705

    xor-int/2addr v6, v7

    const v7, 0x123108

    goto/16 :goto_0

    .line 4
    :sswitch_10
    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u06da\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3493

    const v7, 0x48e5b68f

    xor-int/2addr v6, v7

    const v7, -0x28641339

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a79\u06e0"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x37

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x51d

    const v7, 0x185a74fb

    xor-int/2addr v6, v7

    const v7, -0x6d2e4af2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6ed8ce7c -> :sswitch_7
        -0x56ba2edc -> :sswitch_e
        -0x564760e5 -> :sswitch_4
        -0x55feb5bb -> :sswitch_a
        -0x501623ff -> :sswitch_d
        -0x4a38dcab -> :sswitch_2
        -0x41a5ec35 -> :sswitch_0
        -0x3e3c15a7 -> :sswitch_a
        -0x3cedb266 -> :sswitch_8
        -0x3b9417b3 -> :sswitch_b
        -0x35590a35 -> :sswitch_f
        -0x30d94a4b -> :sswitch_c
        -0x2d3dd811 -> :sswitch_2
        -0x1fa43696 -> :sswitch_3
        -0x1ce18681 -> :sswitch_b
        -0x9682a88 -> :sswitch_7
        -0x1fc9145 -> :sswitch_3
        0x7da422f -> :sswitch_9
        0x126bf2a6 -> :sswitch_5
        0x16142612 -> :sswitch_1
        0x198e8366 -> :sswitch_c
        0x1b86820b -> :sswitch_4
        0x25c634e3 -> :sswitch_6
        0x2b1c15f2 -> :sswitch_6
        0x2b4da77b -> :sswitch_1
        0x2b7a892c -> :sswitch_0
        0x3f1bd076 -> :sswitch_9
        0x400ce29d -> :sswitch_10
        0x416b2eb7 -> :sswitch_f
        0x429b8369 -> :sswitch_10
        0x5901fbf9 -> :sswitch_8
        0x59551b09 -> :sswitch_d
        0x5b336ee7 -> :sswitch_e
        0x5c3d0084 -> :sswitch_5
    .end sparse-switch
.end method

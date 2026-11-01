.class public final synthetic Ll/ܶᩴۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:Ll/۠ᩴۘ;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ll/۠ᩴۘ;I)V
    .locals 6

    const v0, -0x4359bc7a

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    sget v2, Ll/֨ܶ;->ۛۛۛ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e7\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5061

    const v5, 0x2e0a5d17

    xor-int/2addr v4, v5

    const v5, 0x6d89b18c

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x5fed

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_a

    goto :goto_1

    .line 1
    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v3

    if-gez v3, :cond_6

    goto :goto_1

    .line 3
    :sswitch_2
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_2

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput p2, p0, Ll/ܶᩴۘ;->᩶:I

    return-void

    :sswitch_5
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_0

    const-string v3, "\u1a78\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7e8d

    const v5, -0x5f6d0e1c

    xor-int/2addr v4, v5

    const v5, 0x2dfbfcf7

    goto :goto_0

    :cond_0
    const-string v3, "\u06e7\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5c9

    const v5, 0x24bf990d

    xor-int/2addr v4, v5

    const v5, -0x1887b10

    goto :goto_0

    :sswitch_6
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06ec\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4db9

    const v5, 0x6b4616f6

    xor-int/2addr v4, v5

    const v5, 0x3aa0d258

    goto :goto_0

    .line 2
    :sswitch_7
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    :goto_1
    const-string v3, "\u1a76\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x70b3

    const v5, -0x66b5e10f

    xor-int/2addr v4, v5

    const v5, 0x5dc47fd7

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e4\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x68a7

    const v5, 0x7d7ec7e6

    xor-int/2addr v4, v5

    const v5, -0x325552b5

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u05a8\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x578b

    const v5, 0x41e536e0

    xor-int/2addr v4, v5

    const v5, -0x58186ee3

    goto/16 :goto_0

    .line 0
    :sswitch_9
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06eb\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5693

    const v5, 0x3aa2c9d    # 1.0001945E-36f

    xor-int/2addr v4, v5

    const v5, 0x6b1dddf0

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u05a8\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x765f

    const v5, -0x5f5d19fb

    xor-int/2addr v4, v5

    const v5, 0x42998c3e

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a78\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x686f

    const v5, 0x6c822ac6

    xor-int/2addr v4, v5

    const v5, -0x13de5bb8

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v3

    if-ltz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06d6\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6d45

    const v5, 0x64337385

    xor-int/2addr v4, v5

    const v5, 0x121025d6

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u06ec\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x561f

    const v5, 0x27585ed

    xor-int/2addr v4, v5

    const v5, 0x4ff0dcb4    # 8.0819917E9f

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u073a\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x51e7

    const v5, 0x5550475b

    xor-int/2addr v4, v5

    const v5, 0x14ddd348

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a74\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7129

    const v5, -0x355bb9f5    # -5382917.5f

    xor-int/2addr v4, v5

    const v5, -0x7ea17555

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܶᩴۘ;->ܺ:Ll/۠ᩴۘ;

    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_c

    :goto_4
    const-string v3, "\u073a\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x33df

    const v5, 0x1bf007ac

    xor-int/2addr v4, v5

    const v5, -0x3a5e0994

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d8\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6987

    const v5, -0x68434a6f

    xor-int/2addr v4, v5

    const v5, 0x4de5d812

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a73975d -> :sswitch_3
        -0x6a4fca18 -> :sswitch_b
        -0x694f64a3 -> :sswitch_9
        -0x6684dd07 -> :sswitch_5
        -0x639bae88 -> :sswitch_9
        -0x4a185548 -> :sswitch_3
        -0x45eb97dc -> :sswitch_1
        -0x441e9bfa -> :sswitch_e
        -0x33e72031 -> :sswitch_8
        -0x285e62e8 -> :sswitch_7
        -0x2330ca18 -> :sswitch_0
        -0x23182fa6 -> :sswitch_0
        -0x17adedcc -> :sswitch_d
        -0x10ff9ccf -> :sswitch_c
        0xdd93dc -> :sswitch_d
        0x5366dfe -> :sswitch_4
        0xdf5a1f9 -> :sswitch_a
        0x11b516ac -> :sswitch_5
        0x1b0b07e3 -> :sswitch_2
        0x1b7bcd38 -> :sswitch_4
        0x21b70bf8 -> :sswitch_e
        0x2e62915c -> :sswitch_6
        0x3fc81cc8 -> :sswitch_1
        0x48a76a50 -> :sswitch_7
        0x565453c6 -> :sswitch_2
        0x56906000 -> :sswitch_c
        0x56af7a1a -> :sswitch_a
        0x64e53431 -> :sswitch_b
        0x6bfa68a4 -> :sswitch_8
        0x7b64a470 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const v5, 0x2b1df507

    sget v6, Ll/۟;->ۨᩴۛ:I

    sget v7, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v8, "\u05ab\u1a7b"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x635f

    const v10, 0x5c1510fa

    xor-int/2addr v9, v10

    const v10, 0xe6028c8

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, 0x3a35

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 592
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v8

    if-nez v8, :cond_7

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget-boolean v8, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v8, :cond_a

    goto/16 :goto_6

    .line 563
    :sswitch_1
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v8

    if-eqz v8, :cond_c

    goto :goto_2

    .line 312
    :sswitch_2
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget v8, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v8, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v8, "\u073a\u06e1"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x3

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x210d

    const v10, 0x7427914a

    xor-int/2addr v9, v10

    const v10, -0x45af6d32

    goto :goto_0

    .line 664
    :sswitch_3
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    :goto_2
    const-string v8, "\u06e8\u1a73"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x51ef

    const v10, -0x46466192

    xor-int/2addr v9, v10

    const v10, -0xef90964

    goto :goto_0

    .line 665
    :sswitch_4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    :sswitch_5
    return-void

    .line 537
    :sswitch_6
    :try_start_0
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    .line 538
    invoke-static {v2}, Ll/ۙ۠ۘ;->ۤ(Ll/ۙ۠ۘ;)Ll/۫ᩴۘ;

    move-result-object v8

    .line 1224
    iget-object v8, v8, Ll/۫ᩴۘ;->ۙ:Ll/֡ᩴۘ;

    iget-object v8, v8, Ll/֡ᩴۘ;->ۚ:Ll/۠᩵ᩴ;

    .line 538
    invoke-static {v2}, Ll/ۙ۠ۘ;->ۤ(Ll/ۙ۠ۘ;)Ll/۫ᩴۘ;

    move-result-object v9

    iget-object v9, v9, Ll/۫ᩴۘ;->ۖ:Ll/ܿܿܰ;

    invoke-static {v2}, Ll/ۙ۠ۘ;->ܶ(Ll/ۙ۠ۘ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v10

    invoke-static {v2, v8, v9, v10, v0}, Ll/ۙ۠ۘ;->ۙ(Ll/ۙ۠ۘ;Ll/۠᩵ᩴ;Ll/ܿܿܰ;Ljava/util/concurrent/atomic/AtomicInteger;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v8, "\u06d6\u06d9"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x303

    const v10, -0x76518209

    xor-int/2addr v9, v10

    const v10, 0x20d9cf59

    goto/16 :goto_0

    .line 537
    :sswitch_7
    iget-object v2, v1, Ll/۠ᩴۘ;->ۜ:Ll/ۙ۠ۘ;

    const-wide/16 v3, 0x64

    const-string v8, "\u06ec\u06e1"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x46af

    const v10, 0x1fd13064

    xor-int/2addr v9, v10

    const v10, -0x7067007e

    goto/16 :goto_0

    :sswitch_8
    iget-object v1, p0, Ll/ܶᩴۘ;->ܺ:Ll/۠ᩴۘ;

    .line 258
    sget-boolean v8, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v8, :cond_1

    goto :goto_3

    :cond_1
    const-string v8, "\u06e1\u06df"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x35cb

    const v10, 0x15ab07b3

    xor-int/2addr v9, v10

    const v10, -0x1f89e748

    goto/16 :goto_0

    .line 306
    :sswitch_9
    sget-boolean v8, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v8, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v8, "\u1a7b\u1a76"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7319

    const v10, -0x421f0130

    xor-int/2addr v9, v10

    const v10, 0x68379840

    goto/16 :goto_0

    .line 1109
    :sswitch_a
    sget-boolean v8, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v8, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v8, "\u06eb\u06eb"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x19

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3517

    const v10, -0x7a40db33

    xor-int/2addr v9, v10

    const v10, -0x2db3e339

    goto/16 :goto_0

    .line 1201
    :sswitch_b
    sget-boolean v8, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v8, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v8, "\u1a74\u06e2"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x75

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x3733

    const v10, 0x66c3b6d7

    xor-int/2addr v9, v10

    const v10, -0x392c0c49

    goto/16 :goto_0

    .line 121
    :sswitch_c
    sget v8, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v8, :cond_5

    :goto_3
    const-string v8, "\u05a1\u073a"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x4f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x58ad

    const v10, -0x3f85b3ae

    xor-int/2addr v9, v10

    const v10, 0x4c0cbc8d    # 3.6893236E7f

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u06d8\u06e1"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x13

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7ad5

    const v10, -0x1b553ced    # -2.5200025E22f

    xor-int/2addr v9, v10

    const v10, -0x12f864d2

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v8

    if-ltz v8, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v8, "\u06db\u1a73"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x21

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2e3d

    const v10, -0x68801e96

    xor-int/2addr v9, v10

    const v10, -0x6bdd0392

    goto/16 :goto_0

    :sswitch_e
    sget v8, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v8, :cond_8

    :cond_7
    :goto_4
    const-string v8, "\u073a\u1a7b"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x27

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x27fd

    const v10, -0x29f32a40

    xor-int/2addr v9, v10

    const v10, -0xa792ccd

    goto/16 :goto_0

    :cond_8
    const-string v8, "\u05a1\u1a78"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x7495

    const v10, -0x1ac85dcb

    xor-int/2addr v9, v10

    const v10, -0x4dec08b7

    goto/16 :goto_0

    :sswitch_f
    sget v8, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v8, :cond_9

    goto :goto_5

    :cond_9
    const-string v8, "\u06eb\u06e1"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0xd

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x721b

    const v10, -0x52371729

    xor-int/2addr v9, v10

    const v10, -0x435ac9ca

    goto/16 :goto_0

    :sswitch_10
    sget v8, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v8, :cond_b

    :cond_a
    :goto_5
    const-string v8, "\u06e4\u06e4"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x5f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4253

    const v10, 0x1cd129a9

    xor-int/2addr v9, v10

    const v10, -0x1574e0dd

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u06d6\u06d7"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x41

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x7883

    const v10, -0x4df9a87a

    xor-int/2addr v9, v10

    const v10, -0x6348608e

    goto/16 :goto_0

    .line 2
    :sswitch_11
    iget v0, p0, Ll/ܶᩴۘ;->᩶:I

    .line 250
    sget v8, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v8, :cond_d

    :cond_c
    :goto_6
    const-string v8, "\u06e0\u06dc"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x2d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3bc5

    const v10, -0x4e2a69bd

    xor-int/2addr v9, v10

    const v10, 0x50b1e15e

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06d8\u06e7"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x4f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x1fe5

    const v10, -0x4047f052

    xor-int/2addr v9, v10

    const v10, 0x96bbc7d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c6c67a3 -> :sswitch_10
        -0x7ab1e392 -> :sswitch_e
        -0x7944e097 -> :sswitch_3
        -0x7780bec8 -> :sswitch_10
        -0x5f0c49b4 -> :sswitch_7
        -0x5daf7dcc -> :sswitch_8
        -0x56c8b935 -> :sswitch_5
        -0x552802b5 -> :sswitch_c
        -0x4e007f94 -> :sswitch_0
        -0x4cfef130 -> :sswitch_9
        -0x491e87c2 -> :sswitch_1
        -0x4795e084 -> :sswitch_a
        -0x38b289e5 -> :sswitch_0
        -0x37bc448a -> :sswitch_3
        -0x338b2da7 -> :sswitch_8
        -0x29be00d9 -> :sswitch_d
        -0x25322beb -> :sswitch_9
        -0x212ee9c9 -> :sswitch_11
        -0x20e9f0fd -> :sswitch_1
        -0x178ee804 -> :sswitch_b
        -0xf971eab -> :sswitch_5
        -0x6b5557 -> :sswitch_2
        0xdf8b1d -> :sswitch_11
        0x4795909 -> :sswitch_e
        0x93210b3 -> :sswitch_4
        0x1d10e930 -> :sswitch_b
        0x1dd25f99 -> :sswitch_6
        0x1e1288e7 -> :sswitch_f
        0x30c73069 -> :sswitch_7
        0x3b625338 -> :sswitch_4
        0x45fc77d8 -> :sswitch_6
        0x4993f29f -> :sswitch_a
        0x5c864722 -> :sswitch_2
        0x604002fc -> :sswitch_f
        0x62a2cb71 -> :sswitch_d
        0x72f69d79 -> :sswitch_c
    .end sparse-switch
.end method

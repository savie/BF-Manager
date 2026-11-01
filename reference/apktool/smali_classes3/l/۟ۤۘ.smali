.class public final synthetic Ll/۟ۤۘ;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:I

.field public final synthetic ᩶:Ll/۫ܶۘ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ܶۘ;I)V
    .locals 4

    const v0, -0x63d54faf

    sget v1, Ll/֫;->ܶܺ᩻:I

    sget v2, Ll/ۗܺ;->ۨ᩺۠:I

    .line 0
    iput p2, p0, Ll/۟ۤۘ;->ܺ:I

    iput-object p1, p0, Ll/۟ۤۘ;->᩶:Ll/۫ܶۘ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u06df\u06d8"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6f29

    const v3, 0x4ec85faf    # 1.680857E9f

    xor-int/2addr p2, v3

    const v3, -0x660c7d70

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x1efb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    sget p1, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u0736\u1a7a"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x9

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x30b

    const v3, -0x3c5fea7e

    xor-int/2addr p2, v3

    const v3, -0x2f34d839

    goto :goto_0

    :sswitch_0
    sget p1, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u06e8\u073f"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x59

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x564b

    const v3, -0xeb04655

    xor-int/2addr p2, v3

    const v3, 0x640e1f72

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    sget p1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u0733\u06eb"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2163

    const v3, 0x5074f363

    xor-int/2addr p2, v3

    const v3, 0x1d79911d

    goto :goto_0

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    :goto_1
    const-string p1, "\u05a1\u0736"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6ebf

    const v3, 0x662b5656

    xor-int/2addr p2, v3

    const v3, -0x68e6f822

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz p1, :cond_3

    const-string p1, "\u05a8\u05a1"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x31

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7621

    const v3, 0x51bcf3c

    xor-int/2addr p2, v3

    const v3, -0x5b89976b

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06eb\u1a73"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x13

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x2825

    const v3, -0x6d035971

    xor-int/2addr p2, v3

    const v3, -0x3a4f86d6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x68e27764 -> :sswitch_2
        -0x4350d6d2 -> :sswitch_1
        -0x2f4a6b26 -> :sswitch_5
        -0x2c6c3c2f -> :sswitch_5
        -0x2bfea57b -> :sswitch_0
        -0x1340bb04 -> :sswitch_0
        0x9456ffb -> :sswitch_3
        0x282f70f7 -> :sswitch_1
        0x4a7916f5 -> :sswitch_4
        0x4b78f957 -> :sswitch_4
        0x543fba96 -> :sswitch_2
        0x730f37dd -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x10dc974c

    sget v2, Ll/֨ܰ;->ۢ᩷۟:I

    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    const-string v4, "\u073d\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7553

    const v6, 0x3dd31feb

    xor-int/2addr v5, v6

    const v6, -0x150b088d

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x60a9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 0
    invoke-static {v0}, Lbin/mt/plus/Main;->᩸(Lbin/mt/plus/Main;)V

    return-void

    :sswitch_0
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_b

    goto/16 :goto_2

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_9

    goto/16 :goto_1

    :sswitch_2
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-gez v4, :cond_4

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/۟ۤۘ;->᩶:Ll/۫ܶۘ;

    check-cast v0, Ll/۬ܺۘ;

    invoke-static {v0}, Ll/۬ܺۘ;->ۙ(Ll/۬ܺۘ;)V

    return-void

    :sswitch_6
    iget-object v0, p0, Ll/۟ۤۘ;->᩶:Ll/۫ܶۘ;

    check-cast v0, Ll/ۙ۠ۘ;

    invoke-static {v0}, Ll/ۙ۠ۘ;->ۙ(Ll/ۙ۠ۘ;)V

    return-void

    .line 2
    :sswitch_7
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u0736\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x436d

    const v6, -0x15e9ad8e

    xor-int/2addr v5, v6

    const v6, -0x6901c043

    goto :goto_0

    .line 0
    :sswitch_8
    sget-boolean v4, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u1a73\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x429b

    const v6, -0x2e4e0a2f

    xor-int/2addr v5, v6

    const v6, 0x5b4e805e

    goto :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v4

    if-gtz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u06e7\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4207

    const v6, -0x2e1ada57

    xor-int/2addr v5, v6

    const v6, -0x70cac289

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget-boolean v4, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u073f\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6569

    const v6, -0x3f2d2aac

    xor-int/2addr v5, v6

    const v6, 0x38cc030d

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v4, :cond_5

    :cond_4
    :goto_1
    const-string v4, "\u073d\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x765f

    const v6, 0x12032af7

    xor-int/2addr v5, v6

    const v6, -0x1a62ed49

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u1a7a\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5c31

    const v6, 0x3ac3acf1

    xor-int/2addr v5, v6

    const v6, -0x1acc96c8

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_6

    :goto_2
    const-string v4, "\u0730\u06e2"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7f41

    const v6, -0x61068dd6

    xor-int/2addr v5, v6

    const v6, 0x10120564

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a73\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2549

    const v6, 0x2f7a964b

    xor-int/2addr v5, v6

    const v6, -0x3dc26863

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v4, "\u06dc\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4185

    const v6, 0x11c0ea37

    xor-int/2addr v5, v6

    const v6, -0x75ec6836

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v4, :cond_8

    :goto_3
    const-string v4, "\u06e7\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7f7b

    const v6, 0x6b8c4371

    xor-int/2addr v5, v6

    const v6, -0x755a0b1a

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u0733\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5b17

    const v6, -0xe66201e

    xor-int/2addr v5, v6

    const v6, 0x4f9c7c5b

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    const-string v4, "\u06e2\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x26e1

    const v6, -0x6f29773c

    xor-int/2addr v5, v6

    const v6, 0x771ff5bc

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a77\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x291b

    const v6, 0x4df8d16e    # 5.2180934E8f

    xor-int/2addr v5, v6

    const v6, 0x26f02999

    goto/16 :goto_0

    .line 0
    :sswitch_10
    iget-object v0, p0, Ll/۟ۤۘ;->᩶:Ll/۫ܶۘ;

    check-cast v0, Lbin/mt/plus/Main;

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a76\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x283f

    const v6, -0x75c98c6d

    xor-int/2addr v5, v6

    const v6, -0x193664c1

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a79\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xa2f

    const v6, -0x2bdab5ab

    xor-int/2addr v5, v6

    const v6, 0xac032ec

    goto/16 :goto_0

    :sswitch_11
    iget v4, p0, Ll/۟ۤۘ;->ܺ:I

    packed-switch v4, :pswitch_data_0

    const-string v4, "\u0730\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1f37

    const v6, -0x6e3749d4

    xor-int/2addr v5, v6

    const v6, -0x515062e

    goto/16 :goto_0

    :pswitch_0
    const-string v4, "\u06eb\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x61e3

    const v6, -0x1c65f4a2

    xor-int/2addr v5, v6

    const v6, 0x18905fe2

    goto/16 :goto_0

    :pswitch_1
    const-string v4, "\u06d9\u073a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7beb

    const v6, 0x6bd3a71c    # 5.11745E26f

    xor-int/2addr v5, v6

    const v6, 0x3e957f8d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7aa6a283 -> :sswitch_5
        -0x7498c3ce -> :sswitch_a
        -0x6fa8cfae -> :sswitch_6
        -0x6b722670 -> :sswitch_6
        -0x693d4fe5 -> :sswitch_1
        -0x5a158e0e -> :sswitch_c
        -0x53f88d8b -> :sswitch_1
        -0x4d63e781 -> :sswitch_3
        -0x46484353 -> :sswitch_10
        -0x43687852 -> :sswitch_11
        -0x42720ea6 -> :sswitch_b
        -0x3727e104 -> :sswitch_7
        -0x326eb389 -> :sswitch_11
        -0x312e8413 -> :sswitch_9
        -0x25f150ee -> :sswitch_5
        -0x238f0d2f -> :sswitch_c
        -0x1c51d58c -> :sswitch_b
        -0x13dfa7ad -> :sswitch_7
        -0x113ec907 -> :sswitch_3
        -0xb0f603c -> :sswitch_2
        -0xaee7573 -> :sswitch_a
        -0xae98a2d -> :sswitch_0
        -0x52917aa -> :sswitch_4
        0x1fa5c04 -> :sswitch_2
        0x2e63e7b -> :sswitch_d
        0x2de766d7 -> :sswitch_0
        0x302fc7d6 -> :sswitch_d
        0x30320b69 -> :sswitch_4
        0x4675ea34 -> :sswitch_8
        0x477fb96f -> :sswitch_9
        0x4ebfac93 -> :sswitch_10
        0x5ca08369 -> :sswitch_f
        0x5df7dde1 -> :sswitch_8
        0x7090ed7c -> :sswitch_e
        0x71ba4924 -> :sswitch_e
        0x7da1f0c2 -> :sswitch_f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

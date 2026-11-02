.class public final synthetic Ll/ۘܺۘ;
.super Ljava/lang/Object;
.source "B1VR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, 0x7a50f62f

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v2, Ll/ۘۧ;->ܳ᩷᩸:I

    .line 0
    iput p1, p0, Ll/ۘܺۘ;->ܺ:I

    iput-object p2, p0, Ll/ۘܺۘ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u06e2\u06e7"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2647

    const v3, 0x51b04d76

    xor-int/2addr p2, v3

    const v3, -0x1ff730f0

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0xd9b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    sget p1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz p1, :cond_1

    goto :goto_1

    :sswitch_0
    sget p1, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez p1, :cond_0

    goto :goto_2

    :cond_0
    const-string p1, "\u06ec\u06e7"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x82d

    const v3, -0x8c119c5

    xor-int/2addr p2, v3

    const v3, -0x6fd0560f

    goto :goto_0

    :cond_1
    const-string p1, "\u06d9\u06d6"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x45a1

    const v3, -0x5a360416

    xor-int/2addr p2, v3

    const v3, 0x24b4f198

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u073d\u1a75"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x63

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5521

    const v3, 0x45bcf138

    xor-int/2addr p2, v3

    const v3, -0x2a48be63

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    :goto_2
    const-string p1, "\u073f\u06e0"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x69

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7d0f

    const v3, -0x72dee3ec

    xor-int/2addr p2, v3

    const v3, 0x52da3a5e

    goto :goto_0

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 1
    :sswitch_5
    sget p1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz p1, :cond_3

    const-string p1, "\u06d7\u06e4"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x520f

    const v3, -0x7eca71b9

    xor-int/2addr p2, v3

    const v3, -0x46d1f2e8

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u073d\u073d"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x41

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x4a3f

    const v3, 0x7377a3ad

    xor-int/2addr p2, v3

    const v3, 0x731b71a4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a989dd8 -> :sswitch_4
        -0x4017d0b6 -> :sswitch_5
        -0x19311416 -> :sswitch_0
        -0x438e94 -> :sswitch_3
        0x9cf22ae -> :sswitch_3
        0x2894e181 -> :sswitch_2
        0x349be9d2 -> :sswitch_5
        0x3e50ffe6 -> :sswitch_2
        0x3f9eb43b -> :sswitch_0
        0x40eb8a51 -> :sswitch_1
        0x636454f8 -> :sswitch_4
        0x72d7a081 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x74d42966

    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    const-string v4, "\u1a7a\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2893

    const v6, -0x3131246

    xor-int/2addr v5, v6

    const v6, -0x249642d3

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x1491

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۘܺۘ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/֡ۡۘ;

    .line 12
    invoke-static {v0}, Ll/֡ۡۘ;->ۙ(Ll/֡ۡۘ;)V

    return-void

    :sswitch_0
    sget-boolean v4, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-eqz v4, :cond_5

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_b

    goto/16 :goto_3

    .line 15
    :sswitch_2
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-gez v4, :cond_7

    goto/16 :goto_3

    .line 12
    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    goto/16 :goto_3

    .line 69
    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    return-void

    :sswitch_5
    const/4 v1, 0x1

    .line 129
    invoke-static {v0, v1}, Ll/۬ܺۘ;->ۙ(Ll/۫ܶۘ;Z)V

    return-void

    .line 35
    :sswitch_6
    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u0736\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x311

    const v6, 0x6650d24f

    xor-int/2addr v5, v6

    const v6, 0x4609d13f

    goto :goto_0

    :sswitch_7
    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u1a78\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5907

    const v6, 0x47e20acf

    xor-int/2addr v5, v6

    const v6, -0x2f2ed1dd

    goto :goto_0

    .line 57
    :sswitch_8
    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06d7\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xe87

    const v6, 0x26974a53

    xor-int/2addr v5, v6

    const v6, 0x3925126c

    goto/16 :goto_0

    .line 85
    :sswitch_9
    sget-boolean v4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u1a7b\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x15c7

    const v6, 0x33e79635

    xor-int/2addr v5, v6

    const v6, 0x503853f3

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_4

    :goto_1
    const-string v4, "\u1a73\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x13b5

    const v6, 0x2bbe79ac

    xor-int/2addr v5, v6

    const v6, 0x6fb8394a    # 1.14029E29f

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u05a1\u06d7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1935

    const v6, 0x19c27801

    xor-int/2addr v5, v6

    const v6, 0x3ba60bbe

    goto/16 :goto_0

    .line 19
    :sswitch_b
    sget v4, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v4, :cond_6

    :cond_5
    const-string v4, "\u06e7\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7aa1

    const v6, 0x2ac9616e

    xor-int/2addr v5, v6

    const v6, 0x14e538c2

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a77\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3fa7

    const v6, 0xc406415

    xor-int/2addr v5, v6

    const v6, -0x24ef5929

    goto/16 :goto_0

    .line 106
    :sswitch_c
    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v4, :cond_8

    :cond_7
    :goto_2
    const-string v4, "\u1a76\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4d07

    const v6, 0x43948bba

    xor-int/2addr v5, v6

    const v6, 0x5e2c71c3

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u073f\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3e93

    const v6, 0x531afcc7

    xor-int/2addr v5, v6

    const v6, 0x20f15e68

    goto/16 :goto_0

    .line 71
    :sswitch_d
    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v4, :cond_9

    :goto_3
    const-string v4, "\u073a\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3a37

    const v6, 0x2267202c

    xor-int/2addr v5, v6

    const v6, -0x543fac50

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e7\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x220b

    const v6, 0x47bc675c

    xor-int/2addr v5, v6

    const v6, 0x4d2841a9    # 1.7642971E8f

    goto/16 :goto_0

    .line 36
    :sswitch_e
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u06ec\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x79

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4bcf

    const v6, -0x20b684ce

    xor-int/2addr v5, v6

    const v6, -0x6fd0cc0b

    goto/16 :goto_0

    .line 15
    :sswitch_f
    iget-object v0, p0, Ll/ۘܺۘ;->᩶:Ljava/lang/Object;

    .line 17
    check-cast v0, Lbin/mt/plus/Main;

    .line 84
    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06d6\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7901

    const v6, -0x4600a27b

    xor-int/2addr v5, v6

    const v6, 0x37677e42

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a8\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7a19

    const v6, -0x60af1d9d

    xor-int/2addr v5, v6

    const v6, 0x49c7a0be    # 1635351.8f

    goto/16 :goto_0

    .line 2
    :sswitch_10
    iget v4, p0, Ll/ۘܺۘ;->ܺ:I

    packed-switch v4, :pswitch_data_0

    const-string v4, "\u06d6\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x205b

    const v6, -0x7ddf8a9b

    xor-int/2addr v5, v6

    const v6, 0x24f5fa38

    goto/16 :goto_0

    :pswitch_0
    const-string v4, "\u06e2\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x479f

    const v6, 0x7683660c

    xor-int/2addr v5, v6

    const v6, -0x735ff8fc

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b95448c -> :sswitch_3
        -0x742a8fe6 -> :sswitch_d
        -0x5e68a71f -> :sswitch_1
        -0x5d09fad1 -> :sswitch_e
        -0x59ccdf1e -> :sswitch_c
        -0x50e19074 -> :sswitch_9
        -0x4c40ec60 -> :sswitch_5
        -0x4b97bbbf -> :sswitch_5
        -0x454463ad -> :sswitch_a
        -0x449a3c60 -> :sswitch_c
        -0x33915e85 -> :sswitch_0
        -0x2f6852bb -> :sswitch_9
        -0x2380d4d6 -> :sswitch_2
        -0xc113504 -> :sswitch_8
        -0x205635e -> :sswitch_3
        -0x2b0860 -> :sswitch_1
        0x18e3ea94 -> :sswitch_2
        0x254822bb -> :sswitch_f
        0x25e9f49c -> :sswitch_7
        0x2edf0aa0 -> :sswitch_b
        0x35efd368 -> :sswitch_f
        0x3a6f80f9 -> :sswitch_4
        0x3f20d942 -> :sswitch_e
        0x40f1a6c2 -> :sswitch_4
        0x455a081d -> :sswitch_d
        0x54116ef9 -> :sswitch_a
        0x5a0c528c -> :sswitch_b
        0x5cc2919b -> :sswitch_0
        0x675ea72a -> :sswitch_10
        0x6a555127 -> :sswitch_8
        0x6ec268d9 -> :sswitch_6
        0x7307c31f -> :sswitch_6
        0x7783613d -> :sswitch_7
        0x78bf50cc -> :sswitch_10
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

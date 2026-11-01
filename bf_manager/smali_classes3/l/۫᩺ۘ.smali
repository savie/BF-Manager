.class public final Ll/۫᩺ۘ;
.super Landroid/os/Binder;
.source "F5X0"


# instance fields
.field public final ۚ:Ll/ܿ᩺ۘ;

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/ܿ᩺ۘ;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 56
    iput-object p1, p0, Ll/۫᩺ۘ;->ۚ:Ll/ܿ᩺ۘ;

    return-void
.end method


# virtual methods
.method public final ۖ()V
    .locals 12

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    const v4, 0x506ccf94

    sget v5, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v6, Ll/֡ۚ;->ۢܰ᩸:I

    const-string v7, "\u0733\u05a1"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x414b

    const v9, 0xd3cc4da

    xor-int/2addr v8, v9

    const v9, 0x22786550

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, -0x60a3

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 66
    iget-object v0, p0, Ll/۫᩺ۘ;->ۚ:Ll/ܿ᩺ۘ;

    invoke-static {v0}, Ll/ܿ᩺ۘ;->ܰ(Ll/ܿ᩺ۘ;)Ll/᩶ۜ᩺;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ۜ᩺;->show()V

    return-void

    :sswitch_0
    sget-boolean v7, Ll/֨֫;->᩸ۜ᩵:Z

    if-nez v7, :cond_9

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v7

    if-gtz v7, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v7, "\u06e4\u073d"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x11

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7929

    const v9, -0x3087bc9

    xor-int/2addr v8, v9

    const v9, 0x14d62109

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget v7, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v7, :cond_1

    goto/16 :goto_5

    :cond_1
    :goto_2
    const-string v7, "\u1a74\u1a76"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x632b

    const v9, 0x6712193c

    xor-int/2addr v8, v9

    const v9, 0x289d1fd4

    goto :goto_0

    .line 20
    :sswitch_3
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    :sswitch_5
    return-void

    :sswitch_6
    sub-long v7, v0, v2

    const-wide/16 v9, 0x12c

    cmp-long v11, v7, v9

    if-gez v11, :cond_2

    const-string v7, "\u073a\u06e1"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x536d

    const v9, -0x7fe4592

    xor-int/2addr v8, v9

    const v9, 0x52a54953

    goto :goto_0

    :cond_2
    const-string v7, "\u06e7\u06d6"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0xd

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x293f

    const v9, 0x23df07d7

    xor-int/2addr v8, v9

    const v9, -0x168c1026

    goto/16 :goto_0

    .line 64
    :sswitch_7
    iget-wide v2, p0, Ll/۫᩺ۘ;->᩹:J

    sget v7, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v7, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v7, "\u06e0\u1a75"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x64e3

    const v9, 0x5a593844

    xor-int/2addr v8, v9

    const v9, -0x76dbacd0

    goto/16 :goto_0

    .line 23
    :sswitch_8
    sget v7, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v7, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v7, "\u06ec\u06d6"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x4f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6a2d

    const v9, 0x722d3677

    xor-int/2addr v8, v9

    const v9, -0x330038ab

    goto/16 :goto_0

    .line 35
    :sswitch_9
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v7

    if-gtz v7, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v7, "\u073a\u073d"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x27

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7fe1

    const v9, -0x7e57d93e

    xor-int/2addr v8, v9

    const v9, 0x10bb1973

    goto/16 :goto_0

    .line 61
    :sswitch_a
    sget v7, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v7, :cond_6

    goto :goto_3

    :cond_6
    const-string v7, "\u073d\u06d6"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x4d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7c5b

    const v9, -0x2a90882b

    xor-int/2addr v8, v9

    const v9, -0x5e373cdc

    goto/16 :goto_0

    .line 44
    :sswitch_b
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v7

    if-gtz v7, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v7, "\u1a73\u06da"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x27

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5a09

    const v9, -0x7b4cbe41

    xor-int/2addr v8, v9

    const v9, -0x60cb5ee7

    goto/16 :goto_0

    .line 53
    :sswitch_c
    sget v7, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v7, :cond_8

    goto :goto_4

    :cond_8
    const-string v7, "\u06e7\u05ab"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x71e7

    const v9, -0x1880b6fa

    xor-int/2addr v8, v9

    const v9, -0x3be199f7

    goto/16 :goto_0

    .line 44
    :sswitch_d
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v7

    if-gtz v7, :cond_a

    :cond_9
    :goto_3
    const-string v7, "\u1a77\u1a79"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x45

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6c23

    const v9, -0x159a7206

    xor-int/2addr v8, v9

    const v9, -0x64b9d219

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u06d8\u1a78"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x7f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x79c7

    const v9, -0x437834c9

    xor-int/2addr v8, v9

    const v9, -0x1f546aa0

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v7

    if-gtz v7, :cond_b

    goto :goto_5

    :cond_b
    const-string v7, "\u05ab\u06dc"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x5b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x59af

    const v9, -0x7a02f859

    xor-int/2addr v8, v9

    const v9, 0x26ca3507

    goto/16 :goto_0

    .line 20
    :sswitch_f
    sget v7, Ll/ۗ;->֨۬ۖ:I

    if-ltz v7, :cond_c

    :goto_4
    const-string v7, "\u06ec\u0730"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x4d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x47a1

    const v9, -0x6fc8ff98

    xor-int/2addr v8, v9

    const v9, -0x2df2fe75

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06d8\u06d7"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x75

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x4a7

    const v9, -0x305d60cb

    xor-int/2addr v8, v9

    const v9, 0x4d80b550    # 2.6992077E8f

    goto/16 :goto_0

    .line 64
    :sswitch_10
    invoke-static {}, Ll/֡ܳ;->᩵۠ۗ()J

    move-result-wide v0

    .line 47
    sget-boolean v7, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v7, :cond_d

    :goto_5
    const-string v7, "\u05ab\u1a7b"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x33

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4e35

    const v9, 0x698784db

    xor-int/2addr v8, v9

    const v9, 0x25f5cce6

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u06df\u1a76"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x22f3

    const v9, 0x4c4b5e1e    # 5.331161E7f

    xor-int/2addr v8, v9

    const v9, 0x15c5dc08

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ee1e19e -> :sswitch_8
        -0x7e9918c1 -> :sswitch_1
        -0x7e52a833 -> :sswitch_10
        -0x794676e6 -> :sswitch_c
        -0x74b478fb -> :sswitch_3
        -0x6ce001dc -> :sswitch_10
        -0x5ed5ab1b -> :sswitch_7
        -0x5ba911e6 -> :sswitch_d
        -0x556069d4 -> :sswitch_4
        -0x4b982062 -> :sswitch_6
        -0x4250409c -> :sswitch_2
        -0x41855e52 -> :sswitch_0
        -0x2a882cfe -> :sswitch_a
        -0x25592ff5 -> :sswitch_9
        -0x2328f051 -> :sswitch_e
        -0x193cd60a -> :sswitch_9
        -0x16e5c4f4 -> :sswitch_c
        -0xf53525f -> :sswitch_f
        -0xa0d4fed -> :sswitch_2
        0x1b8e200b -> :sswitch_d
        0x2af16af6 -> :sswitch_6
        0x30bb04a5 -> :sswitch_f
        0x365f39e0 -> :sswitch_3
        0x40711e3a -> :sswitch_1
        0x45e0f1d6 -> :sswitch_5
        0x52091438 -> :sswitch_4
        0x522997cc -> :sswitch_e
        0x5953a18c -> :sswitch_8
        0x6664869d -> :sswitch_b
        0x67cb6bfe -> :sswitch_b
        0x6ade9571 -> :sswitch_0
        0x77db986e -> :sswitch_5
        0x7dc98435 -> :sswitch_a
        0x7e04db8b -> :sswitch_7
    .end sparse-switch
.end method

.method public final ۙ()V
    .locals 2

    .line 74
    invoke-static {}, Ll/֫;->ᩴ᩶۟()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۫᩺ۘ;->᩹:J

    return-void
.end method

.method public final ۨ()V
    .locals 1

    .line 70
    iget-object v0, p0, Ll/۫᩺ۘ;->ۚ:Ll/ܿ᩺ۘ;

    invoke-static {v0}, Ll/ܿ᩺ۘ;->ܰ(Ll/ܿ᩺ۘ;)Ll/᩶ۜ᩺;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ۜ᩺;->hide()V

    return-void
.end method

.method public final ܰ()Ll/ۛۨۨ;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/۫᩺ۘ;->ۚ:Ll/ܿ᩺ۘ;

    invoke-static {v0}, Ll/ܿ᩺ۘ;->ۙ(Ll/ܿ᩺ۘ;)Ll/ۛۨۨ;

    move-result-object v0

    return-object v0
.end method

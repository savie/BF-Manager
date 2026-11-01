.class public final synthetic Ll/֫ܳۨ;
.super Ljava/lang/Object;
.source "71K9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ll/۠᩺ۡ;

.field public final synthetic ܺ:Ll/ۙ֫ۨ;

.field public final synthetic ܽ:Ll/᩺ۙۡ;

.field public final synthetic ᩶:Ll/۠᩻᩺;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ֫ۨ;Ll/۠᩻᩺;Ll/۠᩺ۡ;Ll/᩺ۙۡ;)V
    .locals 6

    const v0, 0x78bf99d1

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d6\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x349b

    const v5, 0x420b57e8

    xor-int/2addr v4, v5

    const v5, 0x7345de3e

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x70c7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1

    :sswitch_1
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_a

    goto :goto_1

    .line 1
    :sswitch_2
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v3, :cond_7

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p3, p0, Ll/֫ܳۨ;->֡:Ll/۠᩺ۡ;

    iput-object p4, p0, Ll/֫ܳۨ;->ܽ:Ll/᩺ۙۡ;

    return-void

    .line 3
    :sswitch_5
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06eb\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x23a9

    const v5, -0x395365f

    xor-int/2addr v4, v5

    const v5, 0x6e8b25a4

    goto :goto_0

    .line 1
    :sswitch_6
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v3

    if-ltz v3, :cond_1

    :goto_1
    const-string v3, "\u1a79\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x54a3

    const v5, -0x5b95a3e3

    xor-int/2addr v4, v5

    const v5, -0x69902c62

    goto :goto_0

    :cond_1
    const-string v3, "\u06d8\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1cdb

    const v5, 0x46bccb29

    xor-int/2addr v4, v5

    const v5, -0x3b2b5e17

    goto :goto_0

    .line 0
    :sswitch_7
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06d7\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4e07

    const v5, 0x74b5b746

    xor-int/2addr v4, v5

    const v5, 0x42e310b9

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u0736\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x8fd

    const v5, -0x5352138

    xor-int/2addr v4, v5

    const v5, -0x3aa59a6c

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    const-string v3, "\u1a76\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4ed5

    const v5, 0x640bb468

    xor-int/2addr v4, v5

    const v5, -0x187cd8db

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e2\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x19d3

    const v5, 0x52bfc5f0

    xor-int/2addr v4, v5

    const v5, -0x55d8e589

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u06d6\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xf2b

    const v5, 0x8818ee9

    xor-int/2addr v4, v5

    const v5, 0x2ef833b3

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_8

    :cond_7
    const-string v3, "\u06eb\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1e55

    const v5, 0x5fcd16bc

    xor-int/2addr v4, v5

    const v5, -0x50f3e062

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0736\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2259

    const v5, -0x421cc589

    xor-int/2addr v4, v5

    const v5, -0xec66d49

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u0730\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3f6b

    const v5, -0x5817f52c

    xor-int/2addr v4, v5

    const v5, 0x48bc981

    goto/16 :goto_0

    .line 4
    :sswitch_d
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    :goto_2
    const-string v3, "\u06d9\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1541

    const v5, 0xd029530

    xor-int/2addr v4, v5

    const v5, 0x56b77a74

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e0\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xb2d

    const v5, -0x2fceaa46

    xor-int/2addr v4, v5

    const v5, -0x81928cc

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/֫ܳۨ;->ܺ:Ll/ۙ֫ۨ;

    iput-object p2, p0, Ll/֫ܳۨ;->᩶:Ll/۠᩻᩺;

    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_c

    :goto_3
    const-string v3, "\u1a79\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x13a5

    const v5, -0xdf5f745

    xor-int/2addr v4, v5

    const v5, -0xc3fdde4

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d7\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x74db

    const v5, -0x16d46c32

    xor-int/2addr v4, v5

    const v5, -0x3d56d54c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x756240b8 -> :sswitch_8
        -0x60e5d8df -> :sswitch_d
        -0x58a10586 -> :sswitch_b
        -0x53b3d858 -> :sswitch_6
        -0x535e191e -> :sswitch_b
        -0x45a56ccc -> :sswitch_3
        -0x451621eb -> :sswitch_7
        -0x4498d910 -> :sswitch_5
        -0x448a1855 -> :sswitch_7
        -0x41b04f95 -> :sswitch_5
        -0x3cecfdfe -> :sswitch_1
        -0x2de8e02b -> :sswitch_c
        -0x1ec9d76a -> :sswitch_6
        -0xff312e1 -> :sswitch_e
        -0xe39ce9b -> :sswitch_a
        -0x9a9c853 -> :sswitch_8
        0xcee32d4 -> :sswitch_4
        0x1fcab7f8 -> :sswitch_4
        0x26dbbf49 -> :sswitch_9
        0x2904fcbc -> :sswitch_2
        0x2b3bc68c -> :sswitch_1
        0x2f9daef1 -> :sswitch_e
        0x37e2d7f2 -> :sswitch_0
        0x56949e7b -> :sswitch_c
        0x617c2556 -> :sswitch_d
        0x71b12784 -> :sswitch_0
        0x72efdb1b -> :sswitch_9
        0x799a5479 -> :sswitch_a
        0x7deb1aed -> :sswitch_3
        0x7e9147d7 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x689fae50

    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    sget v5, Ll/ۗ;->֨۬ۖ:I

    const-string v6, "\u06df\u0736"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x3d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xb67

    const v8, -0x183e37e7

    xor-int/2addr v7, v8

    const v8, -0x5dfb2f8

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x2ecd

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 198
    sget-boolean v6, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v6, :cond_5

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget-boolean v6, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-nez v6, :cond_b

    goto :goto_1

    .line 309
    :sswitch_1
    sget v6, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v6, :cond_8

    goto :goto_1

    :sswitch_2
    sget-boolean v6, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v6, :cond_3

    goto :goto_1

    .line 202
    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    :goto_1
    const-string v6, "\u1a76\u073f"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x44fb

    const v8, 0x3bf031b3

    xor-int/2addr v7, v8

    const v8, 0x6eaa68

    goto :goto_0

    .line 268
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    return-void

    .line 492
    :sswitch_5
    iget-object v6, p0, Ll/֫ܳۨ;->֡:Ll/۠᩺ۡ;

    iget-object v7, p0, Ll/֫ܳۨ;->ܽ:Ll/᩺ۙۡ;

    invoke-virtual {v6, v7}, Ll/۠᩺ۡ;->ۙ(Ll/᩺ۙۡ;)Ll/᩵ۘۡ;

    goto :goto_2

    .line 41
    :sswitch_6
    invoke-static {v2, v1}, Ll/ۗᩳ;->ۖܿᩳ(Ljava/lang/Object;I)Z

    .line 34
    sget v6, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v6, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v6, "\u06e2\u06e4"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xd

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5521

    const v8, 0xa2705cd

    xor-int/2addr v7, v8

    const v8, 0x45d94281

    goto :goto_0

    :sswitch_7
    const/4 v1, 0x1

    .line 41
    iget-object v2, p0, Ll/֫ܳۨ;->᩶:Ll/۠᩻᩺;

    .line 417
    sget v6, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v6, "\u06da\u06d9"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7da3

    const v8, -0x527be291

    xor-int/2addr v7, v8

    const v8, -0x23eee9ec

    goto/16 :goto_0

    :sswitch_8
    return-void

    .line 490
    :sswitch_9
    invoke-static {v0}, Ll/ۗܺ;->ۘܺۨ(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    const-string v6, "\u1a79\u1a73"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x27

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x745f

    const v8, 0x2a38671

    xor-int/2addr v7, v8

    const v8, -0x74b9e065

    goto/16 :goto_0

    :cond_2
    :goto_2
    const-string v6, "\u0730\u06e0"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5d73

    const v8, -0x24f69ad6

    xor-int/2addr v7, v8

    const v8, -0x2681e712

    goto/16 :goto_0

    .line 224
    :sswitch_a
    sget v6, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v6, :cond_4

    :cond_3
    const-string v6, "\u1a79\u1a79"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x59

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7ce1

    const v8, -0x7c86477d

    xor-int/2addr v7, v8

    const v8, -0x1716e7c4

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u0730\u1a7b"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x68ef

    const v8, -0xb2c2582

    xor-int/2addr v7, v8

    const v8, 0x443b14e5

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u06e2\u06e7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0xf9d

    const v8, -0x396bed9c

    xor-int/2addr v7, v8

    const v8, 0x649cd5c9

    goto/16 :goto_0

    .line 463
    :sswitch_b
    sget-boolean v6, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v6, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v6, "\u06d6\u06db"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x75

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x21c7

    const v8, 0x1dbc62c0

    xor-int/2addr v7, v8

    const v8, -0x1c74e6b5

    goto/16 :goto_0

    .line 132
    :sswitch_c
    sget v6, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v6, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v6, "\u06eb\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x39

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6e83

    const v8, 0x2159f4b6

    xor-int/2addr v7, v8

    const v8, -0x2836afd7

    goto/16 :goto_0

    :sswitch_d
    sget v6, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v6, :cond_9

    :cond_8
    :goto_3
    const-string v6, "\u1a73\u073d"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x31d7

    const v8, -0x35f5d9a5

    xor-int/2addr v7, v8

    const v8, -0x39ab5632

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u1a75\u073f"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x43

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1b9b

    const v8, -0x4523adb7

    xor-int/2addr v7, v8

    const v8, 0x77cfb20

    goto/16 :goto_0

    .line 152
    :sswitch_e
    sget-boolean v6, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v6, :cond_a

    goto :goto_4

    :cond_a
    const-string v6, "\u0730\u05a8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4bdf

    const v8, -0x636b9de7

    xor-int/2addr v7, v8

    const v8, 0x584ffe1b

    goto/16 :goto_0

    .line 404
    :sswitch_f
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v6

    if-gtz v6, :cond_c

    :cond_b
    :goto_4
    const-string v6, "\u0730\u1a7a"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4ef

    const v8, -0x4f013f71

    xor-int/2addr v7, v8

    const v8, 0x3a16aae2

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u1a74\u06e2"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7273

    const v8, -0x5b56a09a

    xor-int/2addr v7, v8

    const v8, -0x77c589a0

    goto/16 :goto_0

    .line 490
    :sswitch_10
    iget-object v0, p0, Ll/֫ܳۨ;->ܺ:Ll/ۙ֫ۨ;

    .line 387
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v6

    if-ltz v6, :cond_d

    :goto_5
    const-string v6, "\u06eb\u06ec"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x671d

    const v8, -0x4c108f75

    xor-int/2addr v7, v8

    const v8, 0x7f7e957e

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u1a7b\u06e1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2273

    const v8, -0x114bd02b

    xor-int/2addr v7, v8

    const v8, 0x3d100ab0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79b2d04f -> :sswitch_0
        -0x737e331a -> :sswitch_7
        -0x71d77df1 -> :sswitch_3
        -0x701cdc06 -> :sswitch_f
        -0x624ee129 -> :sswitch_7
        -0x53e562f5 -> :sswitch_5
        -0x53df343b -> :sswitch_6
        -0x4d627c93 -> :sswitch_4
        -0x41c352d9 -> :sswitch_10
        -0x417f61ae -> :sswitch_8
        -0x3271a56d -> :sswitch_0
        -0x2993e500 -> :sswitch_a
        -0x2495fe71 -> :sswitch_a
        -0x170dfea2 -> :sswitch_3
        -0x7f7b5a0 -> :sswitch_e
        -0x72d5b7 -> :sswitch_4
        0x28fdb4b -> :sswitch_2
        0x20189d91 -> :sswitch_1
        0x21c03a55 -> :sswitch_10
        0x23be5eda -> :sswitch_5
        0x26d82283 -> :sswitch_f
        0x287e1c8d -> :sswitch_d
        0x2d2e63be -> :sswitch_c
        0x2d70d8a0 -> :sswitch_b
        0x335245ce -> :sswitch_d
        0x340aeb40 -> :sswitch_9
        0x4a275546 -> :sswitch_1
        0x540b73c7 -> :sswitch_c
        0x56abaa1a -> :sswitch_e
        0x5bbc2079 -> :sswitch_9
        0x5dfc5863 -> :sswitch_6
        0x6b8eefd2 -> :sswitch_8
        0x6e012567 -> :sswitch_b
        0x74a78068 -> :sswitch_2
    .end sparse-switch
.end method

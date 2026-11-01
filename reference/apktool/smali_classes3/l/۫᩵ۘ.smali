.class public final synthetic Ll/۫᩵ۘ;
.super Ljava/lang/Object;
.source "G6K1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/lang/ref/WeakReference;

.field public final synthetic ܺ:Ll/ۛۧ᩺;

.field public final synthetic ᩶:Landroid/content/pm/PackageManager;


# direct methods
.method public synthetic constructor <init>(Ll/ۛۧ᩺;Landroid/content/pm/PackageManager;Ljava/lang/ref/WeakReference;)V
    .locals 6

    const v0, 0x3682c689

    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    sget v2, Ll/ۘ֡;->ܰ֡ܽ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a75\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3d67

    const v5, 0x6fc10537

    xor-int/2addr v4, v5

    const v5, 0x5d54dc9c

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x368b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_9

    goto/16 :goto_4

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06e7\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5183

    const v5, -0x25e0cc65

    xor-int/2addr v4, v5

    const v5, 0x7385f6ed

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_b

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_3

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    iput-object p3, p0, Ll/۫᩵ۘ;->֡:Ljava/lang/ref/WeakReference;

    return-void

    .line 2
    :sswitch_6
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06e4\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xddf

    const v5, 0x72c8befa

    xor-int/2addr v4, v5

    const v5, -0x2ad627b0

    goto :goto_0

    .line 0
    :sswitch_7
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u05a8\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7f37

    const v5, 0x6f79fcc1

    xor-int/2addr v4, v5

    const v5, -0x1edcdc6d

    goto/16 :goto_0

    .line 2
    :sswitch_8
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v3

    if-eqz v3, :cond_3

    :goto_1
    const-string v3, "\u06d6\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c7d

    const v5, 0x4ffb6412

    xor-int/2addr v4, v5

    const v5, 0x3726a392

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u05ab\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x463

    const v5, 0x7260a8b5

    xor-int/2addr v4, v5

    const v5, 0x49c0cd5

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u0730\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7ddd

    const v5, 0x1a165c3

    xor-int/2addr v4, v5

    const v5, -0x78f0d024

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u1a74\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x44d

    const v5, 0x16c70180

    xor-int/2addr v4, v5

    const v5, 0x5870ccf1

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u1a74\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3533

    const v5, -0x2c4ff5b8

    xor-int/2addr v4, v5

    const v5, 0x22eec601

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v3

    if-gtz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06dc\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6f7d

    const v5, -0x709a22e1

    xor-int/2addr v4, v5

    const v5, -0x3aa233d

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a74\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x66c9

    const v5, 0x7a442b77

    xor-int/2addr v4, v5

    const v5, 0x1788491f

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u0733\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3285

    const v5, -0x7949e913

    xor-int/2addr v4, v5

    const v5, 0x5368babc

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_a

    :goto_3
    const-string v3, "\u06d6\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3615

    const v5, 0x3306d985

    xor-int/2addr v4, v5

    const v5, 0x148f62ce

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073f\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4ca5

    const v5, 0x1c70069a

    xor-int/2addr v4, v5

    const v5, -0x220fdc43

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/۫᩵ۘ;->ܺ:Ll/ۛۧ᩺;

    iput-object p2, p0, Ll/۫᩵ۘ;->᩶:Landroid/content/pm/PackageManager;

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06dc\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xfd1

    const v5, 0x75594b47

    xor-int/2addr v4, v5

    const v5, 0x660f3bda

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a74\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x593b

    const v5, 0x3b31040

    xor-int/2addr v4, v5

    const v5, 0x158bce3a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7dd57d62 -> :sswitch_c
        -0x7969776e -> :sswitch_5
        -0x6eacb96e -> :sswitch_9
        -0x6c76efde -> :sswitch_2
        -0x61ae7b51 -> :sswitch_7
        -0x5eeded02 -> :sswitch_2
        -0x515e8781 -> :sswitch_5
        -0x40eee452 -> :sswitch_6
        -0x3d4148ea -> :sswitch_9
        -0x38351184 -> :sswitch_3
        -0x334f8a57 -> :sswitch_7
        -0x282a9837 -> :sswitch_b
        -0x202c10c5 -> :sswitch_b
        -0x16b797a2 -> :sswitch_1
        0x4f5a116 -> :sswitch_a
        0xdb7ef7a -> :sswitch_4
        0xe5e39dd -> :sswitch_d
        0x1d38296b -> :sswitch_0
        0x1e3f3108 -> :sswitch_8
        0x24f3dad4 -> :sswitch_c
        0x2acc6185 -> :sswitch_e
        0x38789f40 -> :sswitch_8
        0x3f08c731 -> :sswitch_6
        0x419cc388 -> :sswitch_e
        0x60097487 -> :sswitch_3
        0x621306b7 -> :sswitch_d
        0x625420e3 -> :sswitch_a
        0x63143d4e -> :sswitch_4
        0x6651d8af -> :sswitch_0
        0x7c487a1d -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x40002595

    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    const-string v5, "\u06db\u06d6"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1589

    const v7, 0x7316d38

    xor-int/2addr v6, v7

    const v7, -0x4429cb68

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x2765

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 4
    iget-object v1, p0, Ll/۫᩵ۘ;->᩶:Landroid/content/pm/PackageManager;

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v5, :cond_b

    goto :goto_1

    .line 30
    :sswitch_1
    sget v5, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v5, :cond_9

    goto :goto_2

    .line 17
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v5, Ll/۟;->ۨᩴۛ:I

    if-gez v5, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v5, "\u06e1\u06d9"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x471f

    const v7, -0x4ea0c95f

    xor-int/2addr v6, v7

    const v7, -0x2054579d

    goto :goto_0

    .line 16
    :sswitch_3
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    :goto_2
    const-string v5, "\u06df\u1a73"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x21

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2a7f

    const v7, -0x35e44c96    # -2551002.5f

    xor-int/2addr v6, v7

    const v7, 0x444a0fd5

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    return-void

    .line 63
    :sswitch_5
    new-instance v5, Ll/ܿ᩵ۘ;

    const/4 v6, 0x0

    .line 31
    sget-boolean v7, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v7, :cond_1

    goto :goto_4

    .line 63
    :cond_1
    iget-object v7, p0, Ll/۫᩵ۘ;->֡:Ljava/lang/ref/WeakReference;

    .line 32
    sget v8, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v8, :cond_2

    goto :goto_4

    .line 63
    :cond_2
    invoke-direct {v5, v6, v7}, Ll/ܿ᩵ۘ;-><init>(ILjava/lang/Object;)V

    invoke-static {v5}, Ll/֨֫;->ۡۢ֫(Ljava/lang/Object;)V

    return-void

    .line 58
    :sswitch_6
    :try_start_0
    invoke-static {v0, v1}, Ll/᩻᩵ۘ;->ۙ(Ll/ۛۧ᩺;Landroid/content/pm/PackageManager;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v5, "\u0730\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x43

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3d8b

    const v7, -0x22c440ca

    xor-int/2addr v6, v7

    const v7, 0x77f787ad

    goto/16 :goto_0

    :goto_3
    const-string v5, "\u073d\u073f"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x73f1

    const v7, 0x4a1fbe99    # 2617254.2f

    xor-int/2addr v6, v7

    const v7, -0x3482d37b    # -1.6592005E7f

    goto/16 :goto_0

    .line 27
    :sswitch_7
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_4
    const-string v5, "\u06db\u05a1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x57

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4c67

    const v7, 0x7b8d658e

    xor-int/2addr v6, v7

    const v7, 0x507f34d4

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06e2\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x1d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4957

    const v7, 0x597d39f0

    xor-int/2addr v6, v7

    const v7, -0x6b5cbff5

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v5, "\u06e2\u06e4"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1b61

    const v7, -0x4a261002

    xor-int/2addr v6, v7

    const v7, 0x3dad3e96

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_5

    :cond_5
    const-string v5, "\u06d8\u1a73"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x73e5

    const v7, -0x595932d2

    xor-int/2addr v6, v7

    const v7, -0x67b3a5cc

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v5

    if-ltz v5, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v5, "\u0730\u05ab"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x49

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2621

    const v7, -0x483d133c

    xor-int/2addr v6, v7

    const v7, 0x786ee3d

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v5

    if-gtz v5, :cond_7

    goto :goto_5

    :cond_7
    const-string v5, "\u1a74\u06d8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5b7b

    const v7, 0x558371ea

    xor-int/2addr v6, v7

    const v7, -0x7e2d92c7

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v5, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v5, :cond_8

    goto :goto_6

    :cond_8
    const-string v5, "\u0730\u06d8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x30e9

    const v7, -0x2907bccc

    xor-int/2addr v6, v7

    const v7, 0x55f9c089

    goto/16 :goto_0

    .line 10
    :sswitch_d
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v5

    if-gtz v5, :cond_a

    :cond_9
    :goto_5
    const-string v5, "\u06e7\u05ab"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4c91

    const v7, -0x22a85fb2

    xor-int/2addr v6, v7

    const v7, 0x26e2e195

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06db\u06e4"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x223b

    const v7, -0x35a78270    # -3546980.0f

    xor-int/2addr v6, v7

    const v7, 0x56a2f0f5

    goto/16 :goto_0

    .line 2
    :sswitch_e
    iget-object v0, p0, Ll/۫᩵ۘ;->ܺ:Ll/ۛۧ᩺;

    .line 19
    sget v5, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v5, :cond_c

    :cond_b
    :goto_6
    const-string v5, "\u06db\u06d7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x440f

    const v7, 0x4df620be

    xor-int/2addr v6, v7

    const v7, 0x764d86b1

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a78\u06e7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x165b

    const v7, 0x555057a9

    xor-int/2addr v6, v7

    const v7, -0x5c0773db

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fa6d3a5 -> :sswitch_b
        -0x7718d0dd -> :sswitch_e
        -0x607fe953 -> :sswitch_8
        -0x43b63a05 -> :sswitch_0
        -0x428fcfc4 -> :sswitch_1
        -0x3ab38648 -> :sswitch_0
        -0x165b478a -> :sswitch_6
        -0xcbdccb5 -> :sswitch_2
        -0x230d86c -> :sswitch_5
        0x4625d6d -> :sswitch_8
        0x932270e -> :sswitch_4
        0xf1a80b4 -> :sswitch_3
        0x183c5c13 -> :sswitch_a
        0x1cd04718 -> :sswitch_3
        0x27e9f75a -> :sswitch_2
        0x3275e687 -> :sswitch_4
        0x42bdcbfb -> :sswitch_1
        0x49c882e7 -> :sswitch_d
        0x4e0cc8fb -> :sswitch_9
        0x5160a312 -> :sswitch_a
        0x53dddb30 -> :sswitch_6
        0x611671b2 -> :sswitch_5
        0x61ed12ff -> :sswitch_c
        0x6b3834df -> :sswitch_7
        0x6ca76d57 -> :sswitch_c
        0x6e76e6b9 -> :sswitch_e
        0x6f72b38c -> :sswitch_7
        0x765bbe30 -> :sswitch_d
        0x784af2f4 -> :sswitch_b
        0x7a86e7db -> :sswitch_9
    .end sparse-switch
.end method

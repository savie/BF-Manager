.class public final synthetic Ll/ۨۡ֫;
.super Ljava/lang/Object;
.source "G6K1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ۢ֫ܺ;

.field public final synthetic ܿ:Ljava/lang/ref/WeakReference;

.field public final synthetic ᩶:Landroid/content/pm/PackageManager;


# direct methods
.method public synthetic constructor <init>(Ll/ۢ֫ܺ;Landroid/content/pm/PackageManager;Ljava/lang/ref/WeakReference;)V
    .locals 6

    const v0, -0xb514e25

    sget v1, Ll/ۖ;->ܿۚ֡:I

    sget v2, Ll/ۘܽ;->᩹ۧۚ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u05a1\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2b59

    const v5, 0x65164c86

    xor-int/2addr v4, v5

    const v5, -0x4d4d3e94

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x297

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Ll/ۨۡ֫;->ܰ:Ll/ۢ֫ܺ;

    iput-object p2, p0, Ll/ۨۡ֫;->᩶:Landroid/content/pm/PackageManager;

    .line 1
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v3, :cond_c

    goto/16 :goto_4

    .line 0
    :sswitch_0
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_b

    goto/16 :goto_2

    .line 4
    :sswitch_2
    sget-boolean v3, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v3, :cond_8

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ۨۡ֫;->ܿ:Ljava/lang/ref/WeakReference;

    return-void

    .line 3
    :sswitch_6
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a77\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x359

    const v5, -0x7e03226f

    xor-int/2addr v4, v5

    const v5, 0x15875ef5

    goto :goto_0

    .line 1
    :sswitch_7
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v3, "\u073f\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x76c9

    const v5, 0x38a4bbc4

    xor-int/2addr v4, v5

    const v5, 0x2c8af0df

    goto :goto_0

    .line 0
    :sswitch_8
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_3

    :cond_2
    const-string v3, "\u1a7b\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2f5f

    const v5, 0x54fee327

    xor-int/2addr v4, v5

    const v5, -0x314405dc

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06d6\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3c9

    const v5, -0x6bc43087

    xor-int/2addr v4, v5

    const v5, -0xbe6b7c5

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u05a1\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xb7b

    const v5, -0x1d654471

    xor-int/2addr v4, v5

    const v5, -0x4e15814f

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u1a74\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5d19

    const v5, 0x1c38bfbc

    xor-int/2addr v4, v5

    const v5, -0x2e5a0b2f

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u1a79\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4497

    const v5, 0xe29d92e

    xor-int/2addr v4, v5

    const v5, -0xd430d7b

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_7

    :goto_1
    const-string v3, "\u06d8\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x30fd

    const v5, 0x77a365c3

    xor-int/2addr v4, v5

    const v5, -0x2d0375c6

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u05a8\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x505b

    const v5, 0x1e1dc3b7

    xor-int/2addr v4, v5

    const v5, 0x572758f3    # 1.8400048E14f

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u06e8\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3eb9

    const v5, -0x59165b09

    xor-int/2addr v4, v5

    const v5, 0x47f4d776

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d8\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7c67

    const v5, -0x76d25be6

    xor-int/2addr v4, v5

    const v5, 0x1c7cffca

    goto/16 :goto_0

    .line 4
    :sswitch_e
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_a

    :goto_3
    const-string v3, "\u05ab\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6df7

    const v5, -0x54a34507

    xor-int/2addr v4, v5

    const v5, -0x67464045

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d9\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2893

    const v5, -0x54697de2

    xor-int/2addr v4, v5

    const v5, -0x588c95f2

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v3, "\u073d\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2939

    const v5, 0x107a553b

    xor-int/2addr v4, v5

    const v5, -0x117d5ac1

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e4\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4409

    const v5, -0x7d5e7622

    xor-int/2addr v4, v5

    const v5, -0x11e22008

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d163bd3 -> :sswitch_4
        -0x75cb3493 -> :sswitch_a
        -0x6a63e200 -> :sswitch_2
        -0x697f2d19 -> :sswitch_7
        -0x5ca6625f -> :sswitch_c
        -0x4caab19e -> :sswitch_3
        -0x387a4be6 -> :sswitch_3
        -0x35a98433 -> :sswitch_d
        -0x30d7447b -> :sswitch_8
        -0x2c6e4dd3 -> :sswitch_d
        -0x28cff0cb -> :sswitch_b
        -0x15e48108 -> :sswitch_1
        -0x137813b8 -> :sswitch_4
        -0xafa8ec9 -> :sswitch_9
        0x3058dd4 -> :sswitch_1
        0x127dbeb5 -> :sswitch_0
        0x1326ec61 -> :sswitch_2
        0x23c2807d -> :sswitch_b
        0x2480ff77 -> :sswitch_e
        0x2531689b -> :sswitch_5
        0x3127af01 -> :sswitch_5
        0x34d710bf -> :sswitch_0
        0x38df990c -> :sswitch_c
        0x4f58e72f -> :sswitch_8
        0x5040956f -> :sswitch_6
        0x5a7f7cd8 -> :sswitch_e
        0x5bf35a04 -> :sswitch_7
        0x5d009726 -> :sswitch_6
        0x699ac178 -> :sswitch_a
        0x723a43dc -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x736fdb79

    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v5, "\u06eb\u06e8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x278d

    const v7, -0x5c9da9ee

    xor-int/2addr v6, v7

    const v7, 0x7e0f8df9

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x59cf

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    sget v5, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v5, :cond_0

    goto/16 :goto_1

    .line 17
    :sswitch_0
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v5

    if-gtz v5, :cond_4

    goto/16 :goto_1

    :sswitch_1
    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-gez v5, :cond_a

    :cond_0
    const-string v5, "\u06e4\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7ee1

    const v7, -0x6be7256e

    xor-int/2addr v6, v7

    const v7, -0x5fe0f32f

    goto :goto_0

    .line 54
    :sswitch_2
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    return-void

    .line 63
    :sswitch_4
    new-instance v5, Ll/ۛۡ֫;

    const/4 v6, 0x0

    .line 59
    sget v7, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v7, :cond_1

    goto/16 :goto_2

    .line 63
    :cond_1
    iget-object v7, p0, Ll/ۨۡ֫;->ܿ:Ljava/lang/ref/WeakReference;

    .line 48
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v8

    if-nez v8, :cond_2

    goto/16 :goto_3

    .line 63
    :cond_2
    invoke-direct {v5, v6, v7}, Ll/ۛۡ֫;-><init>(ILjava/lang/Object;)V

    invoke-static {v5}, Ll/ۖ֡;->ۘܶܿ(Ljava/lang/Object;)V

    return-void

    .line 58
    :sswitch_5
    :try_start_0
    invoke-static {v0, v1}, Ll/ܰۡ֫;->ۙ(Ll/ۢ֫ܺ;Landroid/content/pm/PackageManager;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v5, "\u05a1\u1a73"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1dc5

    const v7, -0x40e5f590

    xor-int/2addr v6, v7

    const v7, -0x21a41edd

    goto :goto_0

    .line 4
    :sswitch_6
    iget-object v1, p0, Ll/ۨۡ֫;->᩶:Landroid/content/pm/PackageManager;

    const-string v5, "\u06da\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5d5b

    const v7, 0x5d482c2c

    xor-int/2addr v6, v7

    const v7, -0x4c38f4d7

    goto/16 :goto_0

    .line 28
    :sswitch_7
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-gtz v5, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string v5, "\u1a77\u0736"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x4d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6e7

    const v7, -0x570684a8

    xor-int/2addr v6, v7

    const v7, -0x3816073c

    goto/16 :goto_0

    .line 41
    :sswitch_8
    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_5

    :cond_4
    const-string v5, "\u1a73\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x3d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x22b9

    const v7, 0x6f457926

    xor-int/2addr v6, v7

    const v7, 0x24636a1f

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u05a8\u1a78"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x27a3

    const v7, 0x313b15c7

    xor-int/2addr v6, v7

    const v7, 0x6dedc029

    goto/16 :goto_0

    .line 59
    :sswitch_9
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v5

    if-gtz v5, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v5, "\u073d\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x130b

    const v7, -0x14d1fb8b

    xor-int/2addr v6, v7

    const v7, 0x48449a43

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v5, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v5, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v5, "\u1a79\u06ec"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x45a3

    const v7, -0x5edd5f7e

    xor-int/2addr v6, v7

    const v7, -0x30bee3e3

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v5, :cond_8

    goto :goto_1

    :cond_8
    const-string v5, "\u1a74\u06ec"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x50b3

    const v7, -0x7b809ef8

    xor-int/2addr v6, v7

    const v7, -0x2f68da15

    goto/16 :goto_0

    .line 59
    :sswitch_c
    sget v5, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v5, :cond_9

    :goto_1
    const-string v5, "\u0736\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5f3f

    const v7, -0x3da2acb2

    xor-int/2addr v6, v7

    const v7, -0x2cfe1b2a

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u1a79\u06e7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x21

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1045

    const v7, -0x4e926876

    xor-int/2addr v6, v7

    const v7, -0xa64bb5

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v5, :cond_b

    :cond_a
    :goto_2
    const-string v5, "\u05a1\u1a7a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x69a3

    const v7, 0x133031b9

    xor-int/2addr v6, v7

    const v7, 0x7c98ba14

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u1a78\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x73f7

    const v7, -0x2fd23abd

    xor-int/2addr v6, v7

    const v7, -0x5af1decd

    goto/16 :goto_0

    .line 2
    :sswitch_e
    iget-object v0, p0, Ll/ۨۡ֫;->ܰ:Ll/ۢ֫ܺ;

    .line 52
    sget v5, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v5, :cond_c

    :goto_3
    const-string v5, "\u06e8\u0736"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x13

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7c8b

    const v7, -0x6b7b66cf

    xor-int/2addr v6, v7

    const v7, -0x438f058

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u05a8\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x71b3

    const v7, -0x36dee285

    xor-int/2addr v6, v7

    const v7, -0x4089a8a9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e512edb -> :sswitch_c
        -0x76be9609 -> :sswitch_a
        -0x63b7488c -> :sswitch_3
        -0x549ded47 -> :sswitch_6
        -0x49e37bdb -> :sswitch_1
        -0x43f094f1 -> :sswitch_0
        -0x414f819a -> :sswitch_e
        -0x4141821f -> :sswitch_2
        -0x3afa5025 -> :sswitch_9
        -0x383a11ab -> :sswitch_b
        -0x2078de68 -> :sswitch_5
        -0x1d4231cd -> :sswitch_3
        -0x19bacc19 -> :sswitch_4
        -0x141e6765 -> :sswitch_9
        -0xfc0ab45 -> :sswitch_d
        -0x507693c -> :sswitch_4
        -0x11d8797 -> :sswitch_8
        0x247ca74 -> :sswitch_7
        0x70dc8af -> :sswitch_8
        0x12deedd6 -> :sswitch_b
        0x148dc8f8 -> :sswitch_5
        0x1e853507 -> :sswitch_6
        0x29f5b36e -> :sswitch_a
        0x2b9242db -> :sswitch_d
        0x43b1f60e -> :sswitch_e
        0x4616af90 -> :sswitch_c
        0x494eb6ec -> :sswitch_7
        0x5779ada3 -> :sswitch_0
        0x5b221053 -> :sswitch_2
        0x60551f39 -> :sswitch_1
    .end sparse-switch
.end method

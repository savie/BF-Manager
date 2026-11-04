.class public final Ll/֡ۢ֫;
.super Ljava/lang/Object;
.source "C2R7"


# instance fields
.field public final ۙ:Ll/᩶ۢ֫;

.field public final ۤ:I

.field public final ᩷:Ll/۠ۖۧ;

.field public final synthetic ᩸:Ll/۟ۢ֫;


# direct methods
.method public constructor <init>(Ll/۟ۢ֫;Ll/᩶ۢ֫;Ll/۠ۖۧ;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x1101e2b4

    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    sget v4, Ll/֨ۨ;->ۜܳ᩵:I

    .line 366
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v5, "\u06e2\u06d8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x45

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2061

    const v7, -0x1990c9ed

    xor-int/2addr v6, v7

    const v7, -0x51a6fb73

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x1247

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 348
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-gez v5, :cond_9

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_1

    :sswitch_1
    sget v5, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v5, "\u06d7\u1a7a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x7b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6783

    const v7, -0x3d3d2fb3

    xor-int/2addr v6, v7

    const v7, 0x33d16324

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    goto/16 :goto_2

    .line 190
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 362
    :sswitch_4
    iput v1, p0, Ll/֡ۢ֫;->ۤ:I

    .line 367
    iput-object p2, p0, Ll/֡ۢ֫;->ۙ:Ll/᩶ۢ֫;

    .line 368
    iput-object p3, p0, Ll/֡ۢ֫;->᩷:Ll/۠ۖۧ;

    return-void

    .line 362
    :sswitch_5
    invoke-static {v0}, Ll/֨᩻;->۬ۛܽ(Ljava/lang/Object;)I

    move-result v1

    .line 340
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v5

    if-eqz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u06e4\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x4b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x165b

    const v7, -0x2ed7df4a

    xor-int/2addr v6, v7

    const v7, -0x56a54fb9

    goto :goto_0

    .line 39
    :sswitch_6
    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u073f\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x412f

    const v7, -0x2348cb29

    xor-int/2addr v6, v7

    const v7, 0x1ba7eb40

    goto/16 :goto_0

    :sswitch_7
    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u073d\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x30df

    const v7, 0x74a82f0f

    xor-int/2addr v6, v7

    const v7, 0x59a37060

    goto/16 :goto_0

    :sswitch_8
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v5, "\u05ab\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x649d

    const v7, 0x6789341b

    xor-int/2addr v6, v7

    const v7, -0xd64b2c1

    goto/16 :goto_0

    .line 361
    :sswitch_9
    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_5

    :goto_2
    const-string v5, "\u06db\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x139

    const v7, 0x14200db1

    xor-int/2addr v6, v7

    const v7, 0x27bbf06a

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u1a73\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7b41

    const v7, 0x4fe6fbb8    # 7.7505126E9f

    xor-int/2addr v6, v7

    const v7, 0x729cb788

    goto/16 :goto_0

    .line 169
    :sswitch_a
    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v5, :cond_6

    goto :goto_4

    :cond_6
    const-string v5, "\u1a77\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x17d9

    const v7, -0x893b632

    xor-int/2addr v6, v7

    const v7, -0x67a8feaf

    goto/16 :goto_0

    .line 45
    :sswitch_b
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v5

    if-ltz v5, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v5, "\u073a\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6c1f

    const v7, -0x3dbc429c

    xor-int/2addr v6, v7

    const v7, 0x1f13b2fa

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v5

    if-nez v5, :cond_8

    :goto_3
    const-string v5, "\u06dc\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x3f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4e81

    const v7, -0x1647bd72

    xor-int/2addr v6, v7

    const v7, 0x75339df9

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06e1\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x75

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x56e3

    const v7, -0x3de7f56

    xor-int/2addr v6, v7

    const v7, 0x18a81c6c

    goto/16 :goto_0

    .line 347
    :sswitch_d
    sget v5, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v5, :cond_a

    :cond_9
    :goto_4
    const-string v5, "\u06eb\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7731

    const v7, 0x63907469

    xor-int/2addr v6, v7

    const v7, -0x46b6990c

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u05ab\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x42b1

    const v7, -0x7f953ba9

    xor-int/2addr v6, v7

    const v7, -0x270f35df

    goto/16 :goto_0

    .line 366
    :sswitch_e
    iput-object p1, p0, Ll/֡ۢ֫;->᩸:Ll/۟ۢ֫;

    .line 362
    invoke-static {p1}, Ll/۟ۢ֫;->ܺ(Ll/۟ۢ֫;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    .line 351
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v5

    if-nez v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u05a1\u06ec"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x4f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x150b

    const v7, -0x346b552c    # -1.948612E7f

    xor-int/2addr v6, v7

    const v7, -0xd926c82

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06e2\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6765

    const v7, 0x7684208a

    xor-int/2addr v6, v7

    const v7, -0x5e4affc

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ffa7ce7 -> :sswitch_7
        -0x683d8af1 -> :sswitch_3
        -0x5972a728 -> :sswitch_6
        -0x5591875e -> :sswitch_c
        -0x5421b1a5 -> :sswitch_5
        -0x4def946f -> :sswitch_4
        -0x48a3cc73 -> :sswitch_b
        -0x3df75eb0 -> :sswitch_4
        -0x34283cf6 -> :sswitch_0
        -0x1bddc112 -> :sswitch_7
        -0x16253794 -> :sswitch_6
        -0x1535c8e6 -> :sswitch_9
        -0xca06416 -> :sswitch_8
        -0xe68675 -> :sswitch_1
        0xf1de23c -> :sswitch_a
        0x1b64eae3 -> :sswitch_d
        0x1ec970d9 -> :sswitch_8
        0x22600366 -> :sswitch_2
        0x2f4d60de -> :sswitch_5
        0x31b8c92a -> :sswitch_3
        0x40b26684 -> :sswitch_b
        0x45deb66b -> :sswitch_2
        0x4a62e1d4 -> :sswitch_d
        0x4aa8e496 -> :sswitch_e
        0x4cab0a02 -> :sswitch_e
        0x58a8843a -> :sswitch_c
        0x5aa375cb -> :sswitch_9
        0x6d8d2cbb -> :sswitch_a
        0x733117a7 -> :sswitch_0
        0x78399223 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()Z
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x1e1787ff

    sget v8, Ll/ۘ֡;->᩹ܶ۬:I

    sget v9, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v10, "\u1a7b\u05ab"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1a35

    const v12, -0x4b37572a

    xor-int/2addr v11, v12

    const v12, 0x1ce2433b

    :goto_0
    xor-int/2addr v10, v12

    :goto_1
    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, 0x767

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 387
    invoke-static {v1}, Ll/۟ۢ֫;->᩵(Ll/۟ۢ֫;)Ll/ۨۢ֫;

    move-result-object v10

    iget-object v10, v10, Ll/ۨۢ֫;->ۙ:Ll/ۗۢ֫;

    invoke-virtual {v10, v0}, Ll/ۗۢ֫;->ۙ(Ll/᩶ۢ֫;)V

    goto :goto_3

    .line 289
    :sswitch_0
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget v10, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v10, :cond_4

    goto/16 :goto_6

    .line 123
    :sswitch_1
    sget-boolean v10, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v10, :cond_2

    goto/16 :goto_6

    .line 265
    :sswitch_2
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget-boolean v10, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v10, :cond_b

    goto/16 :goto_6

    .line 131
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    const/4 v0, 0x0

    return v0

    .line 389
    :sswitch_5
    invoke-static {v6}, Ll/ۧ;->ۧᩴܺ(Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_6
    return v3

    .line 388
    :sswitch_7
    iget-object v6, p0, Ll/֡ۢ֫;->᩷:Ll/۠ۖۧ;

    invoke-static {v6}, Ll/ۗ᩸;->۫᩸ܳ(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    const-string v10, "\u06e8\u06e8"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0xf

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x491d

    const v12, 0x4aabd1c7    # 5630179.5f

    xor-int/2addr v11, v12

    const v12, 0x6d1ffc1a

    goto :goto_0

    :cond_0
    :goto_2
    const-string v10, "\u06d7\u06db"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x29b1

    const v12, -0x6ec1d49c

    xor-int/2addr v11, v12

    const v12, 0x50d75726

    goto :goto_0

    :sswitch_8
    const/4 v0, 0x0

    return v0

    .line 385
    :sswitch_9
    invoke-static {v1}, Ll/۟ۢ֫;->ۛ(Ll/۟ۢ֫;)Ll/ۨۢ֫;

    move-result-object v10

    iget-object v10, v10, Ll/ۨۢ֫;->ۙ:Ll/ۗۢ֫;

    invoke-virtual {v10, v0}, Ll/ۗۢ֫;->ۙ(Ll/᩶ۢ֫;)V

    :goto_3
    const-string v10, "\u05a8\u1a73"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x13bf

    const v12, 0x16b7321c

    xor-int/2addr v11, v12

    const v12, -0x957919a

    goto/16 :goto_0

    .line 383
    :sswitch_a
    iget v10, v5, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v10, v10, 0x81

    if-nez v10, :cond_1

    const-string v10, "\u06d7\u1a7b"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0xd17

    const v12, -0x48fbba84

    xor-int/2addr v11, v12

    const v12, -0x3d257141

    goto/16 :goto_0

    :cond_1
    const-string v10, "\u1a7b\u06e7"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x156d

    const v12, -0x7f9fb4ca

    xor-int/2addr v11, v12

    const v12, 0x30c269e2

    goto/16 :goto_0

    :sswitch_b
    iget-object v5, v4, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 290
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v10

    if-eqz v10, :cond_3

    :cond_2
    const-string v10, "\u06df\u06e2"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x79

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2c1

    const v12, -0x6e28c4d8

    xor-int/2addr v11, v12

    const v12, -0x2a169490

    goto/16 :goto_0

    :cond_3
    const-string v10, "\u073d\u06dc"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3057

    const v12, 0x2431713e

    xor-int/2addr v11, v12

    const v12, 0x227f621e

    goto/16 :goto_0

    .line 383
    :sswitch_c
    iget-object v4, v0, Ll/᩶ۢ֫;->ܰ:Ll/᩵ۢ֫;

    iget-object v4, v4, Ll/᩵ۢ֫;->᩻:Landroid/content/pm/PackageInfo;

    .line 339
    sget-boolean v10, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v10, :cond_5

    :cond_4
    const-string v10, "\u06e2\u06e8"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x645f

    const v12, 0x5819cb59

    xor-int/2addr v11, v12

    const v12, 0x55935612

    goto/16 :goto_0

    :cond_5
    const-string v10, "\u06e8\u06e0"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x37

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x18df

    const v12, 0x17b30762

    xor-int/2addr v11, v12

    const v12, 0x6e0b3916

    goto/16 :goto_0

    :sswitch_d
    return v3

    .line 379
    :sswitch_e
    :try_start_0
    iget-object v10, v0, Ll/᩶ۢ֫;->ܰ:Ll/᩵ۢ֫;

    iget-object v10, v10, Ll/᩵ۢ֫;->ܺ:Ljava/lang/String;

    invoke-static {v10}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v10, "\u06e0\u1a75"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x7d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4ecf

    const v12, -0x3d99395b    # -57.69399f

    xor-int/2addr v11, v12

    const v12, 0x34cbe019

    goto/16 :goto_0

    :catch_0
    const-string v10, "\u06e1\u06d9"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1c2f

    const v12, 0x3169d2fa

    xor-int/2addr v11, v12

    const v12, 0x1ec04993

    goto/16 :goto_0

    .line 375
    :sswitch_f
    invoke-static {v2}, Ll/֡ۢ;->֫ۡᩳ(Ljava/lang/Object;)I

    move-result v3

    const/4 v10, 0x1

    iget v11, p0, Ll/֡ۢ֫;->ۤ:I

    if-eq v11, v3, :cond_6

    const-string v3, "\u06e2\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v8

    mul-int/lit8 v3, v3, -0x2f

    xor-int v11, v3, v9

    mul-int/lit16 v11, v11, -0x6a6b

    const v12, -0x110916d

    xor-int/2addr v11, v12

    const v12, -0x7e41a91d

    goto :goto_4

    :cond_6
    const-string v3, "\u06df\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v9

    mul-int/lit8 v3, v3, 0x2b

    xor-int v11, v3, v8

    mul-int/lit16 v11, v11, -0x2ce5

    const v12, -0x2dc7a380

    xor-int/2addr v11, v12

    const v12, 0x21d63355

    :goto_4
    xor-int/2addr v3, v12

    move v10, v3

    const/4 v3, 0x1

    goto/16 :goto_1

    :sswitch_10
    invoke-static {v1}, Ll/۟ۢ֫;->ܺ(Ll/۟ۢ֫;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    .line 16
    sget v10, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v10, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v10, "\u05a1\u0730"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x11

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5dd1

    const v12, 0x21938846

    xor-int/2addr v11, v12

    const v12, -0x4af8014

    goto/16 :goto_0

    .line 375
    :sswitch_11
    iget-object v1, p0, Ll/֡ۢ֫;->᩸:Ll/۟ۢ֫;

    .line 273
    sget v10, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v10, :cond_8

    goto :goto_5

    :cond_8
    const-string v10, "\u0733\u1a78"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x65

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6bad

    const v12, 0x24403ceb

    xor-int/2addr v11, v12

    const v12, -0x2e3373bf

    goto/16 :goto_0

    .line 341
    :sswitch_12
    sget v10, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v10, :cond_9

    goto :goto_5

    :cond_9
    const-string v10, "\u0733\u06d6"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5aab

    const v12, -0x65ee14d1

    xor-int/2addr v11, v12

    const v12, -0x7e9a64a8

    goto/16 :goto_0

    .line 96
    :sswitch_13
    sget-boolean v10, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v10, :cond_a

    goto/16 :goto_7

    :cond_a
    const-string v10, "\u06e0\u1a78"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1aed

    const v12, 0x683e5376

    xor-int/2addr v11, v12

    const v12, 0x7edda067

    goto/16 :goto_0

    .line 99
    :sswitch_14
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v10

    if-eqz v10, :cond_c

    :cond_b
    :goto_5
    const-string v10, "\u06d6\u06d7"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0xf

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3af1

    const v12, -0x659a80b4

    xor-int/2addr v11, v12

    const v12, -0x47228f0

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u1a79\u06e8"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x7d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x749d

    const v12, -0x33c7c9fb    # -4.8289812E7f

    xor-int/2addr v11, v12

    const v12, 0x5f9ccee6

    goto/16 :goto_0

    .line 9
    :sswitch_15
    sget v10, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v10, :cond_d

    goto :goto_6

    :cond_d
    const-string v10, "\u1a75\u06e1"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4c7

    const v12, 0x569a08a

    xor-int/2addr v11, v12

    const v12, 0x378667bf

    goto/16 :goto_0

    .line 136
    :sswitch_16
    sget v10, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v10, :cond_e

    :goto_6
    const-string v10, "\u1a75\u06dc"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x931

    const v12, -0x22761c2e

    xor-int/2addr v11, v12

    const v12, 0x3098731e

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u0736\u06df"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x67

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1253

    const v12, 0x14928aa

    xor-int/2addr v11, v12

    const v12, 0x35ba4844

    goto/16 :goto_0

    .line 375
    :sswitch_17
    iget-object v0, p0, Ll/֡ۢ֫;->ۙ:Ll/᩶ۢ֫;

    .line 166
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v10

    if-gtz v10, :cond_f

    :goto_7
    const-string v10, "\u1a7a\u06d7"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0xb

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4389

    const v12, -0x4a47c26a

    xor-int/2addr v11, v12

    const v12, -0x4858e70b

    goto/16 :goto_0

    :cond_f
    const-string v10, "\u06e2\u05a1"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x71

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7adf

    const v12, -0x3499858d    # -1.5104627E7f

    xor-int/2addr v11, v12

    const v12, -0x7b128ae2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ecc727e -> :sswitch_b
        -0x77c87248 -> :sswitch_8
        -0x6b9d9397 -> :sswitch_3
        -0x6b2a5859 -> :sswitch_e
        -0x61b27cdb -> :sswitch_15
        -0x5702db93 -> :sswitch_11
        -0x519ff47b -> :sswitch_11
        -0x4df33c44 -> :sswitch_d
        -0x4cc7f1f7 -> :sswitch_e
        -0x4996acf5 -> :sswitch_0
        -0x428dc446 -> :sswitch_15
        -0x387982d9 -> :sswitch_f
        -0x37a41933 -> :sswitch_7
        -0x360bb807 -> :sswitch_14
        -0x35825551 -> :sswitch_9
        -0x24369b50 -> :sswitch_10
        -0x229e869a -> :sswitch_d
        -0x1e8759d3 -> :sswitch_16
        -0x1e5dc306 -> :sswitch_8
        -0x1d09f754 -> :sswitch_3
        -0x17a21d42 -> :sswitch_b
        -0x14cd6c9b -> :sswitch_2
        -0x14bdc6f3 -> :sswitch_9
        -0x10708c17 -> :sswitch_c
        -0xd2ac9d2 -> :sswitch_a
        -0x86456fd -> :sswitch_5
        -0x7eb69fa -> :sswitch_10
        -0x512fe63 -> :sswitch_1
        0x532211f -> :sswitch_17
        0x1903112f -> :sswitch_4
        0x1c8cc441 -> :sswitch_a
        0x1e1d0585 -> :sswitch_14
        0x1e3831ab -> :sswitch_13
        0x1f599682 -> :sswitch_4
        0x20cc3ca7 -> :sswitch_16
        0x221238cb -> :sswitch_17
        0x22d3e27a -> :sswitch_5
        0x3758ccbd -> :sswitch_c
        0x402e0e9f -> :sswitch_12
        0x455e2d3f -> :sswitch_13
        0x53eb5704 -> :sswitch_f
        0x5b13200c -> :sswitch_7
        0x643e1f7e -> :sswitch_6
        0x6b60cb34 -> :sswitch_1
        0x6bdb692e -> :sswitch_2
        0x71f0f7a3 -> :sswitch_12
        0x794fd4f4 -> :sswitch_6
        0x7e087de4 -> :sswitch_0
    .end sparse-switch
.end method

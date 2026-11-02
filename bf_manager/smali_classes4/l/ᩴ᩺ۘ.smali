.class public final synthetic Ll/ᩴ᩺ۘ;
.super Ljava/lang/Object;
.source "154F"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴ᩺ۘ;->ܺ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x4a72dc52    # 3979028.5f

    sget v2, Ll/֨᩹;->᩻ᩳ֨:I

    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v4, "\u05a1\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6f61

    const v6, -0x32faf782

    xor-int/2addr v5, v6

    const v6, 0x2cb4583

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x3dd1

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 0
    sget-object v4, Ll/֡᩺ۘ;->֡:Landroid/content/SharedPreferences;

    goto/16 :goto_3

    .line 153
    :sswitch_0
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    sget-boolean v4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v4, :cond_7

    goto/16 :goto_7

    .line 201
    :sswitch_1
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v4

    if-gez v4, :cond_c

    goto/16 :goto_5

    .line 112
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v4, "\u06e7\u073a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x185f

    const v6, -0x3cc0171d

    xor-int/2addr v5, v6

    const v6, 0x48347683

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    goto/16 :goto_5

    .line 124
    :sswitch_4
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    return-void

    .line 278
    :sswitch_5
    :try_start_0
    invoke-static {}, Ll/᩸۟᩺;->᩹()Z

    goto :goto_1

    .line 279
    :sswitch_6
    invoke-static {}, Ll/᩸۟᩺;->۬()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :sswitch_7
    return-void

    :sswitch_8
    if-eqz v0, :cond_1

    const-string v4, "\u06ec\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x356b

    const v6, -0x6629481d

    xor-int/2addr v5, v6

    const v6, 0x6d8b2dc6

    goto :goto_0

    :cond_1
    :goto_1
    const-string v4, "\u1a76\u0730"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x27b

    const v6, -0x6b4bce48

    xor-int/2addr v5, v6

    const v6, -0x161c335b

    goto :goto_0

    .line 278
    :sswitch_9
    :try_start_1
    invoke-static {}, Ll/֫۠᩺;->۬()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v4, "\u06da\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x19eb

    const v6, -0x1c1a1da6

    xor-int/2addr v5, v6

    const v6, -0x5a89bec1

    goto/16 :goto_0

    :catchall_0
    :goto_2
    const-string v4, "\u1a75\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x77f9

    const v6, -0x57e5e981

    xor-int/2addr v5, v6

    const v6, -0x2b7c4fff

    goto/16 :goto_0

    .line 76
    :sswitch_a
    invoke-static {}, Ll/֡֡;->ۢܶܳ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Ll/ܰ᩶ۘ;->ۙ(Landroid/content/Context;)V

    return-void

    :sswitch_b
    const/4 v0, 0x0

    .line 48
    invoke-static {v0}, Ll/۠ܺۚ;->ܰ(Ljava/lang/String;)Ljava/util/List;

    return-void

    .line 0
    :sswitch_c
    invoke-static {}, Ll/ܺۡۜ;->ۨ()V

    return-void

    :goto_3
    const-string v4, "\u1a79\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1bbb

    const v6, -0x20e43d06

    xor-int/2addr v5, v6

    const v6, 0x2481b93c

    goto/16 :goto_0

    .line 2
    :sswitch_d
    iget v4, p0, Ll/ᩴ᩺ۘ;->ܺ:I

    packed-switch v4, :pswitch_data_0

    const-string v4, "\u0733\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5ea1

    const v6, 0x36270846

    xor-int/2addr v5, v6

    const v6, -0x711abff4

    goto/16 :goto_0

    :pswitch_0
    const-string v4, "\u06db\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7bf1

    const v6, -0x3c85c5c4

    xor-int/2addr v5, v6

    const v6, 0x5cc6e17f

    goto/16 :goto_0

    :pswitch_1
    const-string v4, "\u06d7\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2103

    const v6, -0x7ad41b1f

    xor-int/2addr v5, v6

    const v6, 0x5f82ced5

    goto/16 :goto_0

    :pswitch_2
    const-string v4, "\u06d8\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x32d7

    const v6, 0x74751f93

    xor-int/2addr v5, v6

    const v6, 0x66ee1dc9

    goto/16 :goto_0

    .line 70
    :sswitch_e
    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v4, "\u06e8\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x34e1

    const v6, 0x883d0c4

    xor-int/2addr v5, v6

    const v6, -0x3dbe746f

    goto/16 :goto_0

    .line 63
    :sswitch_f
    sget v4, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v4, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v4, "\u1a75\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1d27

    const v6, 0x8744697

    xor-int/2addr v5, v6

    const v6, 0x1b064782

    goto/16 :goto_0

    .line 234
    :sswitch_10
    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_4

    goto :goto_4

    :cond_4
    const-string v4, "\u06e7\u06dc"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x49e7

    const v6, -0x63e969b2

    xor-int/2addr v5, v6

    const v6, -0x7d6b018b

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v4

    if-ltz v4, :cond_5

    goto :goto_4

    :cond_5
    const-string v4, "\u073a\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6979

    const v6, 0x200062d6

    xor-int/2addr v5, v6

    const v6, 0x55ae2be7

    goto/16 :goto_0

    :sswitch_12
    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v4, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v4, "\u06db\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3a81

    const v6, -0x7141e14c

    xor-int/2addr v5, v6

    const v6, -0xd76f080

    goto/16 :goto_0

    .line 153
    :sswitch_13
    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v4, :cond_8

    :cond_7
    :goto_4
    const-string v4, "\u1a73\u06d7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6d47

    const v6, 0x5885212

    xor-int/2addr v5, v6

    const v6, -0x44de1a2f

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d7\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2cbb

    const v6, 0x6996b07b

    xor-int/2addr v5, v6

    const v6, 0x2e1e00d5

    goto/16 :goto_0

    .line 204
    :sswitch_14
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v4

    if-gtz v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v4, "\u0730\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3a9f

    const v6, 0x5922eb1b

    xor-int/2addr v5, v6

    const v6, -0x44893ab2

    goto/16 :goto_0

    :sswitch_15
    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_a

    :goto_5
    const-string v4, "\u06d8\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2985

    const v6, 0x3ac6ecc5

    xor-int/2addr v5, v6

    const v6, 0x23d1aaea

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u05a1\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5d6b

    const v6, -0x5acf1f64

    xor-int/2addr v5, v6

    const v6, -0x3e32efd0

    goto/16 :goto_0

    .line 126
    :sswitch_16
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v4

    if-gtz v4, :cond_b

    :goto_6
    const-string v4, "\u06e2\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6035

    const v6, 0x75ed5d39

    xor-int/2addr v5, v6

    const v6, -0x22cfd5b6

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06dc\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x30f5

    const v6, 0x2da9f3f2

    xor-int/2addr v5, v6

    const v6, 0x79676bac

    goto/16 :goto_0

    .line 72
    :sswitch_17
    sget-boolean v4, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v4, :cond_d

    :cond_c
    :goto_7
    const-string v4, "\u1a76\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xce9

    const v6, -0xe3ecea2

    xor-int/2addr v5, v6

    const v6, -0x1edb9495

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u05a8\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3e13

    const v6, 0x2aa591e

    xor-int/2addr v5, v6

    const v6, -0x4c9c6e35

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7827e466 -> :sswitch_5
        -0x71fa41bd -> :sswitch_3
        -0x718d8eb0 -> :sswitch_16
        -0x70df60c0 -> :sswitch_13
        -0x7009ee68 -> :sswitch_6
        -0x6fc81518 -> :sswitch_1
        -0x6db7c300 -> :sswitch_4
        -0x6d7698c2 -> :sswitch_b
        -0x631c6182 -> :sswitch_2
        -0x5f7eb321 -> :sswitch_13
        -0x5bddca3a -> :sswitch_5
        -0x5a187572 -> :sswitch_e
        -0x5a0f6edc -> :sswitch_a
        -0x567ee8a3 -> :sswitch_f
        -0x497e7c28 -> :sswitch_c
        -0x48858516 -> :sswitch_b
        -0x45d3da34 -> :sswitch_4
        -0x3df27ffc -> :sswitch_10
        -0x3a96ecce -> :sswitch_7
        -0x37c07844 -> :sswitch_0
        -0x35cd9ae1 -> :sswitch_2
        -0x35a5ffbb -> :sswitch_14
        -0x2b1ae9fb -> :sswitch_3
        -0x2344d377 -> :sswitch_12
        -0x16887a77 -> :sswitch_17
        -0x1654fd58 -> :sswitch_d
        -0x108e1c49 -> :sswitch_11
        -0x5f50e39 -> :sswitch_12
        -0x30c2e52 -> :sswitch_f
        0x25c82b2 -> :sswitch_6
        0xf97c3da -> :sswitch_9
        0x1929c3f9 -> :sswitch_a
        0x19359410 -> :sswitch_11
        0x1a18fb04 -> :sswitch_16
        0x29fd220c -> :sswitch_d
        0x2a71d0e3 -> :sswitch_14
        0x30103cdc -> :sswitch_e
        0x4e90c9df -> :sswitch_7
        0x5055ac1b -> :sswitch_15
        0x5272852f -> :sswitch_15
        0x52d7e903 -> :sswitch_10
        0x62039482 -> :sswitch_0
        0x62d791d9 -> :sswitch_c
        0x6981399e -> :sswitch_17
        0x6f1df64e -> :sswitch_1
        0x748b8161 -> :sswitch_8
        0x7b47fb64 -> :sswitch_8
        0x7b5102a9 -> :sswitch_9
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

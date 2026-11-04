.class public final synthetic Ll/ۖۢۤ;
.super Ljava/lang/Object;
.source "U8VA"

# interfaces
.implements Ll/ܽۧܺ;


# instance fields
.field public final synthetic ܰ:Ll/ۙ֨ۤ;

.field public final synthetic ܿ:F

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ll/ۙ֨ۤ;IF)V
    .locals 6

    const v0, -0x34fca4c7    # -8608569.0f

    sget v1, Ll/֡᩵;->ۤܳ۬:I

    sget v2, Ll/֡ۢ;->۟֡᩻:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0736\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c8f

    const v5, -0x57b08afe

    xor-int/2addr v4, v5

    const v5, -0x17042a79

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x4e0d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_0

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    sget-boolean v3, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v3, :cond_5

    goto/16 :goto_4

    .line 1
    :sswitch_1
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_4

    .line 4
    :sswitch_2
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-lez v3, :cond_9

    goto/16 :goto_3

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput p3, p0, Ll/ۖۢۤ;->ܿ:F

    return-void

    :cond_0
    const-string v3, "\u1a79\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x71e9

    const v5, -0x1c6ad5e3

    xor-int/2addr v4, v5

    const v5, -0x4b5877f3

    goto :goto_0

    .line 3
    :sswitch_6
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06dc\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x317

    const v5, -0x2b55f141

    xor-int/2addr v4, v5

    const v5, -0x2a749f9f

    goto :goto_0

    .line 0
    :sswitch_7
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_2

    :goto_1
    const-string v3, "\u06d9\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x12eb

    const v5, 0x50480cb

    xor-int/2addr v4, v5

    const v5, -0x281a5005

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u1a75\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7fb9

    const v5, -0x5b144427

    xor-int/2addr v4, v5

    const v5, 0x68efccee    # 9.059407E24f

    goto/16 :goto_0

    .line 4
    :sswitch_8
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06da\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2309

    const v5, 0x26f75084

    xor-int/2addr v4, v5

    const v5, 0x5e7c6432

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06e0\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5285

    const v5, -0x7113def4

    xor-int/2addr v4, v5

    const v5, -0x75034dbc

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v3

    if-eqz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u05ab\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6fbd

    const v5, -0x6cd429f0

    xor-int/2addr v4, v5

    const v5, -0x7f5db4a8

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u0730\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5add

    const v5, -0x6678c435

    xor-int/2addr v4, v5

    const v5, 0x4398c57c

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u1a79\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5261

    const v5, 0x75abb854

    xor-int/2addr v4, v5

    const v5, -0x3ef8472a

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_8

    :goto_3
    const-string v3, "\u06d9\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xe49

    const v5, -0x77f33737

    xor-int/2addr v4, v5

    const v5, 0x3d3e327a

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06db\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7651

    const v5, -0x662efe0f

    xor-int/2addr v4, v5

    const v5, -0x59be99f6

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06d7\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4c3f

    const v5, 0x3777276c

    xor-int/2addr v4, v5

    const v5, 0x114f6640

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a7a\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3ee3

    const v5, -0x2d2fa1b

    xor-int/2addr v4, v5

    const v5, 0x223f3111

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۖۢۤ;->ܰ:Ll/ۙ֨ۤ;

    iput p2, p0, Ll/ۖۢۤ;->᩶:I

    .line 4
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_c

    :cond_b
    const-string v3, "\u0736\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4c0b

    const v5, -0x3026d9f9

    xor-int/2addr v4, v5

    const v5, -0x504d8005

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a76\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x696b

    const v5, -0x67e684fc

    xor-int/2addr v4, v5

    const v5, -0x75d0ff9e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x65f298bb -> :sswitch_2
        -0x4f96add9 -> :sswitch_0
        -0x4abde151 -> :sswitch_6
        -0x47b79677 -> :sswitch_b
        -0x408ddc7d -> :sswitch_a
        -0x375199c6 -> :sswitch_5
        -0x36b24ac6 -> :sswitch_9
        -0x30b858be -> :sswitch_0
        -0x22bb2eb6 -> :sswitch_e
        -0x1e9e5d87 -> :sswitch_e
        -0x1dd48d0c -> :sswitch_7
        -0x17dec2ba -> :sswitch_5
        -0x17b764ce -> :sswitch_4
        -0x1288102f -> :sswitch_c
        -0xd866a04 -> :sswitch_d
        0x375a91e -> :sswitch_8
        0x3c27ab8 -> :sswitch_b
        0xa771480 -> :sswitch_1
        0x14cd246b -> :sswitch_1
        0x1a2c474a -> :sswitch_9
        0x302dfec5 -> :sswitch_c
        0x3fef563f -> :sswitch_8
        0x46e2488d -> :sswitch_a
        0x49ab91e0 -> :sswitch_3
        0x576afe14 -> :sswitch_6
        0x58a60969 -> :sswitch_3
        0x6bc341b8 -> :sswitch_7
        0x71ad1cfe -> :sswitch_2
        0x7c770484 -> :sswitch_4
        0x7d8d97dc -> :sswitch_d
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ(I)V
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x79760a33

    sget v8, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v9, Ll/֡ۖ;->۫ۙ᩶:I

    const-string v10, "\u06ec\u06dc"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x77

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6fdd

    const v12, -0xd67afee

    xor-int/2addr v11, v12

    const v12, -0x7978ce4a

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, 0x741d

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    sget v10, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v10, :cond_b

    goto/16 :goto_4

    .line 26
    :sswitch_0
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    sget v10, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v10, :cond_5

    goto/16 :goto_3

    .line 39
    :sswitch_1
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v10

    if-eqz v10, :cond_a

    goto/16 :goto_1

    .line 32
    :sswitch_2
    sget v10, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v10, :cond_7

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    goto/16 :goto_1

    .line 43
    :sswitch_4
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    return-void

    :sswitch_5
    add-int/2addr v6, v5

    .line 44
    iget-object v0, p0, Ll/ۖۢۤ;->ܰ:Ll/ۙ֨ۤ;

    invoke-interface {v0, p1, v6}, Ll/۟᩷᩸;->ۙ(II)V

    return-void

    :sswitch_6
    iget v6, p0, Ll/ۖۢۤ;->᩶:I

    sget v10, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v10, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v10, "\u06d6\u06eb"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1741

    const v12, -0xfe4f596

    xor-int/2addr v11, v12

    const v12, -0xbc48d71

    goto :goto_0

    :sswitch_7
    float-to-int v5, v4

    .line 4
    sget v10, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v10, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v10, "\u0730\u05a8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x550f

    const v12, -0x19b4dc0c

    xor-int/2addr v11, v12

    const v12, -0x3a9a0755

    goto :goto_0

    .line 44
    :sswitch_8
    iget v4, p0, Ll/ۖۢۤ;->ܿ:F

    mul-float v4, v4, v3

    .line 13
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v10

    if-eqz v10, :cond_2

    goto :goto_2

    :cond_2
    const-string v10, "\u1a7b\u1a75"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4777

    const v12, -0x6604044c

    xor-int/2addr v11, v12

    const v12, -0x3d7c18df

    goto/16 :goto_0

    :sswitch_9
    int-to-float v3, v2

    .line 25
    sget v10, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v10, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v10, "\u073a\u06e7"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x30f9

    const v12, -0x47bb514d

    xor-int/2addr v11, v12

    const v12, -0x64552ea0

    goto/16 :goto_0

    :sswitch_a
    mul-float v2, v0, v1

    float-to-int v2, v2

    sget v10, Ll/۬;->᩸ۜ᩹:I

    if-eqz v10, :cond_4

    :goto_1
    const-string v10, "\u06df\u05ab"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x10c7

    const v12, 0x34f1642

    xor-int/2addr v11, v12

    const v12, -0x230c33bf

    goto/16 :goto_0

    :cond_4
    const-string v10, "\u1a73\u05ab"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x5f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6e53

    const v12, -0x1996970d

    xor-int/2addr v11, v12

    const v12, -0x2f7133b8

    goto/16 :goto_0

    :sswitch_b
    const v1, 0x3e99999a    # 0.3f

    .line 18
    sget-boolean v10, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v10, :cond_6

    :cond_5
    :goto_2
    const-string v10, "\u06d7\u073f"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x2f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6433

    const v12, -0x4b687ffc

    xor-int/2addr v11, v12

    const v12, -0x2698da50

    goto/16 :goto_0

    :cond_6
    const-string v10, "\u1a74\u06db"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2f7d

    const v12, -0x945449b

    xor-int/2addr v11, v12

    const v12, 0x7d550fa8

    goto/16 :goto_0

    :sswitch_c
    int-to-float v0, p1

    .line 36
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v10

    if-eqz v10, :cond_8

    :cond_7
    :goto_3
    const-string v10, "\u1a79\u06d9"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x27

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x13d

    const v12, 0x477ba74a

    xor-int/2addr v11, v12

    const v12, 0x4541b94a

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u06ec\u073f"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x15

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x41c7

    const v12, -0x20b03925

    xor-int/2addr v11, v12

    const v12, 0x6a4833ba

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v10

    if-nez v10, :cond_9

    goto :goto_4

    :cond_9
    const-string v10, "\u06dc\u05a8"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6521

    const v12, 0x696e93e6

    xor-int/2addr v11, v12

    const v12, 0x5dde09a2    # 1.9999372E18f

    goto/16 :goto_0

    :cond_a
    :goto_4
    const-string v10, "\u1a74\u06ec"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x24dd

    const v12, 0x734f3493

    xor-int/2addr v11, v12

    const v12, -0xf0d88c

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u06db\u06db"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x3d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x67f1

    const v12, 0x5ba49382

    xor-int/2addr v11, v12

    const v12, 0x4b3c7981    # 1.2351873E7f

    goto/16 :goto_0

    .line 4
    :sswitch_e
    sget v10, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v10, :cond_c

    :goto_5
    const-string v10, "\u06d8\u1a78"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xce1

    const v12, -0x6fb8d475

    xor-int/2addr v11, v12

    const v12, 0x6034a41

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u06db\u1a74"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x69

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x43b7

    const v12, -0x2841846f

    xor-int/2addr v11, v12

    const v12, 0x69de7e33

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f535c1d -> :sswitch_4
        -0x74e59e95 -> :sswitch_9
        -0x72bfb53c -> :sswitch_c
        -0x70a25419 -> :sswitch_5
        -0x6c89b720 -> :sswitch_1
        -0x6ae6e6f5 -> :sswitch_b
        -0x65666701 -> :sswitch_6
        -0x604b35cf -> :sswitch_8
        -0x41c9d014 -> :sswitch_e
        -0x3e841e91 -> :sswitch_6
        -0x353716c6 -> :sswitch_5
        -0x30eab01b -> :sswitch_7
        -0x2c1cfe96 -> :sswitch_3
        -0x27ba940c -> :sswitch_3
        -0x271214af -> :sswitch_4
        -0x24039085 -> :sswitch_a
        -0x1d64f649 -> :sswitch_2
        -0x4ed1fd0 -> :sswitch_2
        -0x38c16e5 -> :sswitch_7
        -0x89f081 -> :sswitch_d
        0x21d595d -> :sswitch_0
        0x9ca72d5 -> :sswitch_8
        0x404ebc95 -> :sswitch_b
        0x43a5742f -> :sswitch_a
        0x4b16a041 -> :sswitch_d
        0x56c30514 -> :sswitch_9
        0x57e79bd8 -> :sswitch_1
        0x59c02e52 -> :sswitch_c
        0x6c8632e2 -> :sswitch_e
        0x78293c2a -> :sswitch_0
    .end sparse-switch
.end method

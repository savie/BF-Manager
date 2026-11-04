.class public final synthetic Ll/ܺ۬֫;
.super Ljava/lang/Object;
.source "H6HS"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic ۙ:Ll/ۢ۬֫;

.field public final synthetic ۤ:I

.field public final synthetic ܳ:Z

.field public final synthetic ᩴ:I

.field public final synthetic ᩷:I

.field public final synthetic ᩸:Z


# direct methods
.method public synthetic constructor <init>(Ll/ۢ۬֫;IIZIZ)V
    .locals 6

    const v0, -0x3f123e12

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    sget v2, Ll/֫֨;->᩶ܺۡ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a79\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4fb7

    const v5, 0x304473ae

    xor-int/2addr v4, v5

    const v5, -0x3ebba9a5

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x4955

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput p3, p0, Ll/ܺ۬֫;->ۤ:I

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_1

    goto/16 :goto_1

    :sswitch_0
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_7

    goto/16 :goto_3

    .line 1
    :sswitch_1
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v3

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u1a79\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4e9f

    const v5, 0x98375ae

    xor-int/2addr v4, v5

    const v5, -0xd35f2d4

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_b

    goto/16 :goto_3

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-boolean p4, p0, Ll/ܺ۬֫;->᩸:Z

    iput p5, p0, Ll/ܺ۬֫;->ᩴ:I

    iput-boolean p6, p0, Ll/ܺ۬֫;->ܳ:Z

    return-void

    :cond_1
    const-string v3, "\u1a7a\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x50cd

    const v5, 0x187595b4

    xor-int/2addr v4, v5

    const v5, -0x1a54c1e9

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u0733\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, 0x47

    const v5, -0x29a33ded

    xor-int/2addr v4, v5

    const v5, -0x5d436efa

    goto/16 :goto_0

    .line 1
    :sswitch_7
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u073a\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x39a1

    const v5, -0x37495a56

    xor-int/2addr v4, v5

    const v5, -0x5a966faa

    goto/16 :goto_0

    .line 0
    :sswitch_8
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u1a7b\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x79c9

    const v5, 0x1f2cc99f

    xor-int/2addr v4, v5

    const v5, -0x16c0d08e

    goto/16 :goto_0

    .line 1
    :sswitch_9
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v3

    if-ltz v3, :cond_5

    :goto_1
    const-string v3, "\u06df\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3101

    const v5, 0x7db80041

    xor-int/2addr v4, v5

    const v5, 0x53c4c91f

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06d8\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3439

    const v5, 0x1b203057

    xor-int/2addr v4, v5

    const v5, -0x10b06876

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u05a1\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xfb7

    const v5, 0x388e6baf

    xor-int/2addr v4, v5

    const v5, -0x5d930072

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v3, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06eb\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3fb7

    const v5, 0x769e3d33

    xor-int/2addr v4, v5

    const v5, 0x23abe1f9

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a7a\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4193

    const v5, -0x3fce7bdd

    xor-int/2addr v4, v5

    const v5, -0x489dfb03

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_9

    :goto_3
    const-string v3, "\u06d9\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x796f

    const v5, 0x7b8aa422

    xor-int/2addr v4, v5

    const v5, -0x4167e93c

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06da\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x77f9

    const v5, -0x27ebebd

    xor-int/2addr v4, v5

    const v5, -0x25197a28

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u06d8\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x107f

    const v5, 0x70de6f50

    xor-int/2addr v4, v5

    const v5, -0x2c7c76bf

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܺ۬֫;->ۙ:Ll/ۢ۬֫;

    iput p2, p0, Ll/ܺ۬֫;->᩷:I

    .line 3
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06db\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7b31

    const v5, 0x310faf3

    xor-int/2addr v4, v5

    const v5, 0x67503b45

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a73\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x37c5

    const v5, 0x7041b7e6

    xor-int/2addr v4, v5

    const v5, -0x2b806d61

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e81e135 -> :sswitch_8
        -0x76e2bee7 -> :sswitch_3
        -0x6f2974c2 -> :sswitch_6
        -0x65ad704c -> :sswitch_e
        -0x5114b60c -> :sswitch_d
        -0x476266de -> :sswitch_c
        -0x46f08d1e -> :sswitch_7
        -0x33958b6d -> :sswitch_2
        -0x2fe8048b -> :sswitch_5
        -0x27042931 -> :sswitch_9
        -0x1aa6d5e2 -> :sswitch_9
        -0x19c3537f -> :sswitch_c
        -0x15fc0812 -> :sswitch_b
        -0x10a66a36 -> :sswitch_b
        -0x101f32da -> :sswitch_d
        -0xcb9ae5b -> :sswitch_7
        -0x3ff5482 -> :sswitch_8
        -0x292a69f -> :sswitch_1
        0xa2ed836 -> :sswitch_4
        0x14331206 -> :sswitch_2
        0x1614c256 -> :sswitch_1
        0x1d72142f -> :sswitch_a
        0x296fa59c -> :sswitch_5
        0x2a5480a5 -> :sswitch_0
        0x2ddde1ed -> :sswitch_0
        0x3b6cc367 -> :sswitch_4
        0x4d27e4b4 -> :sswitch_3
        0x4f3f57d1 -> :sswitch_6
        0x79d551de -> :sswitch_e
        0x7fc77855 -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 19

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x102a7e14

    sget v8, Ll/ۗ֡;->ۜ᩻۫:I

    sget v9, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v10, "\u06d6\u1a7a"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2cbd

    const v12, -0x22f7f4ec

    xor-int/2addr v11, v12

    const v12, -0x2542b07c

    xor-int/2addr v10, v12

    move-object/from16 v18, v2

    move-object v12, v3

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    :goto_0
    xor-int v1, v7, v9

    mul-int/lit16 v1, v1, -0x14db

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v11

    xor-int v7, v10, v1

    sparse-switch v7, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v1

    if-eqz v1, :cond_8

    goto/16 :goto_4

    .line 3
    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_3

    .line 2
    :sswitch_1
    sget v1, Ll/ۖ;->ܿۚ֡:I

    if-gez v1, :cond_b

    goto/16 :goto_3

    .line 3
    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    return-void

    .line 0
    :sswitch_4
    iget v1, v0, Ll/ܺ۬֫;->ᩴ:I

    move/from16 v16, v1

    invoke-static/range {v12 .. v18}, Ll/ۢ۬֫;->ۙ(Ll/ۢ۬֫;IIZIZLjava/lang/String;)V

    return-void

    :sswitch_5
    iget-boolean v15, v0, Ll/ܺ۬֫;->᩸:Z

    sget v1, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v1, "\u1a79\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v8

    xor-int v2, v1, v9

    mul-int/lit16 v2, v2, 0x3cf5

    const v3, -0x68c61eb9

    xor-int v11, v2, v3

    const v2, -0x39aad944

    goto/16 :goto_5

    :sswitch_6
    iget v13, v0, Ll/ܺ۬֫;->᩷:I

    iget v14, v0, Ll/ܺ۬֫;->ۤ:I

    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v1, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v1, "\u06dc\u06e2"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v9

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, -0x4583

    const v3, -0x7a33b047

    xor-int v11, v2, v3

    const v2, -0x1cc4cd85

    goto/16 :goto_5

    :sswitch_7
    move-object/from16 v18, p1

    check-cast v18, Ljava/lang/String;

    iget-object v12, v0, Ll/ܺ۬֫;->ۙ:Ll/ۢ۬֫;

    .line 2
    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v1, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v1, "\u05a8\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v8, v1

    mul-int/lit8 v1, v1, -0x57

    xor-int v2, v1, v9

    mul-int/lit16 v2, v2, 0x3893

    const v3, 0x7e3ee28b

    xor-int v11, v2, v3

    const v2, -0x9eed7f4

    goto/16 :goto_5

    .line 0
    :sswitch_8
    iget-boolean v1, v0, Ll/ܺ۬֫;->ܳ:Z

    .line 2
    sget v2, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v2, :cond_3

    move/from16 v17, v1

    goto/16 :goto_3

    :cond_3
    const-string v2, "\u06db\u06dc"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v9, v2

    mul-int/lit8 v2, v2, -0x35

    xor-int v3, v2, v8

    mul-int/lit16 v3, v3, -0x412d

    const v4, -0x23a1c45a

    xor-int v11, v3, v4

    const v3, -0x6060b68d

    xor-int v10, v2, v3

    move/from16 v17, v1

    goto/16 :goto_0

    :sswitch_9
    sget v1, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v1, :cond_4

    goto :goto_2

    :cond_4
    const-string v1, "\u06da\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v9

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, -0x5077

    const v3, -0x26577f4d

    xor-int v11, v2, v3

    const v2, -0x6f8ec82f

    goto/16 :goto_5

    :sswitch_a
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v1

    if-nez v1, :cond_6

    :cond_5
    :goto_1
    const-string v1, "\u1a78\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v9

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, 0x704d

    const v3, 0x7b6627e5

    xor-int v11, v2, v3

    const v2, -0x4de8d2ea

    goto/16 :goto_5

    :cond_6
    const-string v1, "\u06e8\u0730"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v8

    mul-int/lit8 v1, v1, 0x4f

    xor-int v2, v1, v9

    mul-int/lit16 v2, v2, -0x16a3

    const v3, 0x5e9cfc44

    xor-int v11, v2, v3

    const v2, -0x6ce5b8e9

    goto/16 :goto_5

    :sswitch_b
    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v1, :cond_7

    :goto_2
    const-string v1, "\u073a\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v9

    mul-int/lit8 v1, v1, -0x4b

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, 0x380b

    const v3, 0xe2ce97f

    xor-int v11, v2, v3

    const v2, -0x177fd849

    goto/16 :goto_5

    :cond_7
    const-string v1, "\u073d\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v9

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, -0x3941

    const v3, 0x6d6f7c2c

    xor-int v11, v2, v3

    const v2, 0x697703cb

    goto/16 :goto_5

    :sswitch_c
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    :goto_3
    const-string v1, "\u06e1\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v8

    xor-int v2, v1, v9

    mul-int/lit16 v2, v2, -0x7d11

    const v3, 0x203d11f5

    xor-int v11, v2, v3

    const v2, -0x52717161

    goto/16 :goto_5

    :cond_9
    const-string v1, "\u1a7b\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v8

    xor-int v2, v1, v9

    mul-int/lit16 v2, v2, -0xc7d

    const v3, 0x7fa596ed

    xor-int v11, v2, v3

    const v2, 0x468a633a

    goto :goto_5

    .line 4
    :sswitch_d
    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v1, :cond_a

    :goto_4
    const-string v1, "\u1a73\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v9, v1

    mul-int/lit8 v1, v1, 0x3

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, -0x4b41

    const v3, 0x7b5ff8f6

    xor-int v11, v2, v3

    const v2, 0x21ed7b26

    goto :goto_5

    :cond_a
    const-string v1, "\u1a78\u06d6"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v8, v1

    mul-int/lit8 v1, v1, -0x2b

    xor-int v2, v1, v9

    mul-int/lit16 v2, v2, 0x68f9

    const v3, 0x2d2ef80a

    xor-int v11, v2, v3

    const v2, 0x7980ebe0

    goto :goto_5

    .line 1
    :sswitch_e
    sget v1, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v1, :cond_c

    :cond_b
    const-string v1, "\u0736\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v8, v1

    mul-int/lit8 v1, v1, -0x63

    xor-int v2, v1, v9

    mul-int/lit16 v2, v2, 0xc87

    const v3, -0x1bed1379

    xor-int v11, v2, v3

    const v2, -0x49c02942

    goto :goto_5

    :cond_c
    const-string v1, "\u073f\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v9

    mul-int/lit8 v1, v1, -0x67

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, -0x63b3

    const v3, 0x75000a4b

    xor-int v11, v2, v3

    const v2, -0x409eea63

    :goto_5
    xor-int v10, v1, v2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7583196b -> :sswitch_6
        -0x718dd9c1 -> :sswitch_7
        -0x69d71f57 -> :sswitch_9
        -0x6179b296 -> :sswitch_0
        -0x56aa834c -> :sswitch_b
        -0x5330059e -> :sswitch_d
        -0x49f68b41 -> :sswitch_a
        -0x43f871d0 -> :sswitch_9
        -0x40637be1 -> :sswitch_3
        -0x30efef24 -> :sswitch_c
        -0x30864e48 -> :sswitch_d
        -0x27326c94 -> :sswitch_4
        -0x10a156c4 -> :sswitch_5
        -0x8076ebc -> :sswitch_3
        0x661a53d -> :sswitch_c
        0x1491ad4c -> :sswitch_6
        0x16c4d1ed -> :sswitch_2
        0x2566c779 -> :sswitch_7
        0x298a3e9d -> :sswitch_4
        0x3524b078 -> :sswitch_8
        0x3561824a -> :sswitch_e
        0x386d4fb3 -> :sswitch_e
        0x3c4579c2 -> :sswitch_5
        0x42527114 -> :sswitch_2
        0x4f0f7de9 -> :sswitch_8
        0x5a76fd5d -> :sswitch_1
        0x5a850d31 -> :sswitch_a
        0x6d6a8659 -> :sswitch_1
        0x6d73a8d1 -> :sswitch_0
        0x789060ca -> :sswitch_b
    .end sparse-switch
.end method

.class public final synthetic Ll/ᩴ۠᩺;
.super Ljava/lang/Object;
.source "51RP"

# interfaces
.implements Ll/ۙ᩶۠;


# static fields
.field private static final ᩷ۘ᩻:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴ۠᩺;->᩷ۘ᩻:[S

    return-void

    :array_0
    .array-data 2
        0x1301s
        -0x2697s
        -0x2695s
        -0x269cs
        -0x2695s
        -0x2688s
        -0x268ds
        -0x2683s
        -0x268es
        -0x2691s
        -0x26c1s
        -0x26c1s
        -0x26c5s
        -0x26c8s
        -0x26c7s
        -0x26cds
        -0x26c8s
        -0x2697s
        -0x26c4s
        -0x2692s
        -0x26ces
        -0x26c6s
        -0x26c8s
        -0x26c1s
        -0x26cds
        -0x2683s
        -0x268es
        -0x2691s
        -0x2698s
        -0x2697s
        -0x26c7s
        -0x2694s
        -0x2698s
        -0x2698s
        -0x26c3s
        -0x26c3s
        -0x26c2s
        -0x26c5s
        -0x2697s
        -0x26c5s
        -0x26c4s
        -0x2697s
        -0x2691s
    .end array-data
.end method


# virtual methods
.method public final ۙ()Ljava/lang/Object;
    .locals 23

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, 0x4d7e8f5

    sget v18, Ll/ۖ᩸;->ۨܽ۬:I

    sget v19, Ll/֡᩶;->ۗ֨ܺ:I

    const-string v20, "\u06e7\u06e8"

    invoke-static/range {v20 .. v20}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v19

    mul-int/lit8 v20, v20, -0x3b

    xor-int v0, v20, v18

    mul-int/lit16 v0, v0, 0x1243

    const v22, 0x376e0073

    xor-int v0, v0, v22

    const v22, -0x8bec1c3

    xor-int v20, v20, v22

    move-object/from16 v16, v2

    move-object v11, v10

    move-object v14, v13

    move-object v3, v15

    move/from16 v21, v20

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const v20, 0x4d7e8f5

    const/16 v22, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v6, v20, v18

    mul-int/lit16 v6, v6, -0xfd5

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v0, v6

    xor-int v20, v21, v0

    sparse-switch v20, :sswitch_data_0

    .line 754
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    goto :goto_1

    .line 421
    :sswitch_0
    sget-boolean v0, Ll/᩶;->ۚۤۘ:Z

    if-nez v0, :cond_d

    goto/16 :goto_4

    .line 75
    :sswitch_1
    sget v0, Ll/֫֡;->ۡ᩹ۗ:I

    if-lez v0, :cond_8

    goto :goto_1

    .line 739
    :sswitch_2
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v0

    if-eqz v0, :cond_b

    :goto_1
    const-string v0, "\u0733\u06d7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x9

    xor-int v6, v0, v19

    mul-int/lit16 v6, v6, 0x2819

    const v21, 0x6190051f

    xor-int v6, v6, v21

    const v21, -0x553f254

    goto/16 :goto_8

    .line 964
    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    const/4 v0, 0x0

    return-object v0

    .line 42
    :sswitch_4
    invoke-static {}, Ll/֨᩸;->ۗ֫ܿ()Landroid/app/Application;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v2, v1}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    .line 43
    invoke-interface {v0, v2}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    return-object v0

    :sswitch_5
    const/16 v0, 0x12

    .line 1182
    invoke-static {v3, v4, v0, v10}, Ll/ۗ᩺;->ۧۤ۟([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :sswitch_6
    sget-object v3, Ll/ᩴ۠᩺;->᩷ۘ᩻:[S

    const/16 v4, 0x19

    .line 346
    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v0, "\u0736\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x57

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, 0x7eab

    const v21, 0x5360e7d1

    xor-int v6, v6, v21

    const v21, -0x17b50b62

    goto/16 :goto_8

    :sswitch_7
    const/16 v0, 0x12

    .line 1182
    invoke-static {v14, v15, v0, v10}, Ll/֨۟;->ᩴۚۤ([SIII)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v2, v0

    const-string v0, "\u073f\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x29

    xor-int v6, v0, v19

    mul-int/lit16 v6, v6, -0x17a1

    const v21, -0x132f9293

    xor-int v6, v6, v21

    const v21, 0x64a36e97

    goto/16 :goto_8

    :sswitch_8
    sget-object v14, Ll/ᩴ۠᩺;->᩷ۘ᩻:[S

    const/4 v15, 0x7

    .line 981
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v0

    if-gtz v0, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v0, "\u1a76\u1a7b"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, -0x1ef5

    const v21, 0x3b4674e2

    xor-int v6, v6, v21

    const v21, -0x17cd260e

    goto/16 :goto_8

    .line 41
    :sswitch_9
    invoke-static {v11, v12, v13, v10}, Ll/֨ۖ;->ۨۜۧ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    .line 1182
    invoke-static {v1, v0, v6}, Ll/۫ܽ۠;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "\u1a7a\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x49

    xor-int v6, v0, v19

    mul-int/lit16 v6, v6, -0x7c97

    const v21, 0x1213b178

    xor-int v6, v6, v21

    const v21, 0xb00804a

    goto/16 :goto_8

    :cond_2
    const-string v0, "\u1a78\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x35

    xor-int v6, v0, v19

    mul-int/lit16 v6, v6, 0x362d

    const v21, 0x14f31389

    xor-int v6, v6, v21

    const v21, -0x1d43c41f

    goto/16 :goto_8

    :sswitch_a
    const/4 v13, 0x6

    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string v0, "\u06e1\u06da"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x2f

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, -0x55f1

    const v21, 0x3b0d2638

    xor-int v6, v6, v21

    const v21, -0x41f7e908

    goto/16 :goto_8

    :sswitch_b
    const/4 v12, 0x1

    sget v0, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v0, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v0, "\u1a74\u06d7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x17

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, 0x3a9b

    const v21, 0x4da16b5e    # 3.3852102E8f

    xor-int v6, v6, v21

    const v21, -0x57bb7560

    goto/16 :goto_8

    .line 41
    :sswitch_c
    invoke-static {}, Ll/ܽܺۘ;->ᩴ()Ljava/lang/String;

    move-result-object v1

    sget-object v11, Ll/ᩴ۠᩺;->᩷ۘ᩻:[S

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u05ab\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v6, v0, v19

    mul-int/lit16 v6, v6, 0x2a57

    const v21, -0xba298de

    xor-int v6, v6, v21

    const v21, 0x3f693f99

    goto/16 :goto_8

    :sswitch_d
    const/16 v0, 0x40cd

    const/16 v10, 0x40cd

    goto :goto_3

    :sswitch_e
    const v0, 0xd90a

    const v10, 0xd90a

    :goto_3
    const-string v0, "\u0736\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v6, v0, v19

    mul-int/lit16 v6, v6, -0x259d

    const v21, 0x3334ed20

    xor-int v6, v6, v21

    const v21, 0xe1165c1

    goto/16 :goto_8

    :sswitch_f
    mul-int v0, v9, v9

    sub-int/2addr v0, v7

    if-ltz v0, :cond_6

    const-string v0, "\u06e0\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, -0x6c2d

    const v21, 0x126abbf6

    xor-int v6, v6, v21

    const v21, -0x7f346c27

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u06df\u1a75"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x75

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, 0xdaf

    const v21, 0x46e55582

    xor-int v6, v6, v21

    const v21, -0x1e563792

    goto/16 :goto_8

    :sswitch_10
    add-int v9, v5, v8

    .line 686
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v0

    if-gtz v0, :cond_7

    goto :goto_5

    :cond_7
    const-string v0, "\u06db\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x65

    xor-int v6, v0, v19

    mul-int/lit16 v6, v6, -0x1575

    const v21, 0x7ef1f0a9

    xor-int v6, v6, v21

    const v21, -0x4cd6f117

    goto/16 :goto_8

    :sswitch_11
    mul-int v7, v5, v22

    const/16 v8, 0x3ef5

    sget-boolean v0, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v0, :cond_9

    :cond_8
    :goto_4
    const-string v0, "\u06e1\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v6, v0, v19

    mul-int/lit16 v6, v6, -0x4621

    const v21, 0x5099dff3

    xor-int v6, v6, v21

    const v21, 0x265c985b

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u06db\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x47

    xor-int v6, v0, v19

    mul-int/lit16 v6, v6, -0x2f77

    const v21, 0x161db4d0

    xor-int v6, v6, v21

    const v21, 0x745459b2

    goto/16 :goto_8

    :sswitch_12
    aget-short v5, v16, v17

    const v22, 0xfbd4

    .line 754
    sget-boolean v0, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v0, :cond_a

    :goto_5
    const-string v0, "\u05ab\u06d7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v6, v0, v19

    mul-int/lit16 v6, v6, 0x44dd

    const v21, -0x2079c803

    xor-int v6, v6, v21

    const v21, -0x2dcf7b6b

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u1a7a\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, -0x45bb

    const v21, -0x715b1b3d

    xor-int v6, v6, v21

    const v21, -0x1d78127f

    goto :goto_8

    :sswitch_13
    const/16 v17, 0x0

    sget v0, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v0, :cond_c

    :cond_b
    :goto_6
    const-string v0, "\u1a73\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, -0xf

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, 0x3ac7

    const v21, -0x779420c9

    xor-int v6, v6, v21

    const v21, 0x4f2e91dc

    goto :goto_8

    :cond_c
    const-string v0, "\u073a\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, -0x24cf

    const v21, 0x464803ff    # 12800.999f

    xor-int v6, v6, v21

    const v21, 0x4dda78dc

    goto :goto_8

    :sswitch_14
    sget-object v16, Ll/ᩴ۠᩺;->᩷ۘ᩻:[S

    .line 390
    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_e

    :cond_d
    :goto_7
    const-string v0, "\u06d8\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, -0x32b1

    const v21, 0x7aede68b

    xor-int v6, v6, v21

    const v21, 0x11311fcd

    goto :goto_8

    :cond_e
    const-string v0, "\u06da\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v6, v0, v19

    mul-int/lit16 v6, v6, -0x1da9

    const v21, -0x2f2b6330

    xor-int v6, v6, v21

    const v21, -0x7dcc41bf

    :goto_8
    xor-int v21, v0, v21

    move v0, v6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ff27ece -> :sswitch_3
        -0x745a3d98 -> :sswitch_11
        -0x72fb5170 -> :sswitch_5
        -0x6c5b671a -> :sswitch_e
        -0x6ad36eec -> :sswitch_f
        -0x6420627e -> :sswitch_4
        -0x5faa0052 -> :sswitch_10
        -0x56311ce7 -> :sswitch_b
        -0x4546af2d -> :sswitch_13
        -0x3ecbf744 -> :sswitch_8
        -0x3421b406 -> :sswitch_14
        -0x33fbc6f7 -> :sswitch_5
        -0x31ed22e5 -> :sswitch_e
        -0x2f6b4a6b -> :sswitch_9
        -0x2b4e467b -> :sswitch_f
        -0x24008ae9 -> :sswitch_c
        -0x1685fd97 -> :sswitch_a
        -0x15789c26 -> :sswitch_b
        -0xe14f8de -> :sswitch_11
        -0xc4d62c8 -> :sswitch_2
        -0xb42f80e -> :sswitch_a
        -0x4a1b80d -> :sswitch_7
        -0x530cc -> :sswitch_d
        0x25e140a -> :sswitch_1
        0x7ded8cf -> :sswitch_0
        0xb2fdeeb -> :sswitch_6
        0x1a8de3be -> :sswitch_1
        0x1f68b354 -> :sswitch_0
        0x2111d4f5 -> :sswitch_12
        0x215bebc7 -> :sswitch_10
        0x27835ead -> :sswitch_4
        0x46cf79fe -> :sswitch_6
        0x4bfc89b2 -> :sswitch_2
        0x52fae402 -> :sswitch_d
        0x548487a9 -> :sswitch_8
        0x57dd8f32 -> :sswitch_13
        0x5eb54efa -> :sswitch_12
        0x696102c1 -> :sswitch_c
        0x720890e7 -> :sswitch_3
        0x72290d44 -> :sswitch_14
        0x7b6ccf2c -> :sswitch_7
        0x7d74ec58 -> :sswitch_9
    .end sparse-switch
.end method

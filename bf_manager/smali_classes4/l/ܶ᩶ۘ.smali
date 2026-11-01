.class public Ll/ܶ᩶ۘ;
.super Ll/ۗܺۘ;
.source "71RQ"

# interfaces
.implements Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;


# static fields
.field private static final ֫ۙܳ:[S

.field public static ᩶:Ljava/lang/ref/WeakReference;


# instance fields
.field public ܺ:Lcom/tencent/mm/opensdk/openapi/IWXAPI;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܶ᩶ۘ;->֫ۙܳ:[S

    return-void

    :array_0
    .array-data 2
        0x1c31s
        -0x2118s
        -0x2116s
        -0x211bs
        -0x2116s
        -0x2107s
        -0x210es
        -0x2104s
        -0x210ds
        -0x2112s
        -0x2142s
        -0x2142s
        -0x2146s
        -0x2147s
        -0x2148s
        -0x214es
        -0x2147s
        -0x2118s
        -0x2143s
        -0x2111s
        -0x214ds
        -0x2145s
        -0x2147s
        -0x2142s
        -0x214es
        -0x2104s
        -0x210ds
        -0x2112s
        -0x2117s
        -0x2118s
        -0x2148s
        -0x2113s
        -0x2117s
        -0x2117s
        -0x2144s
        -0x2144s
        -0x2141s
        -0x2146s
        -0x2118s
        -0x2146s
        -0x2143s
        -0x2118s
        -0x2112s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ll/ۗܺۘ;-><init>()V

    return-void
.end method

.method public static ۙ(Ll/᩺᩶ۘ;)V
    .locals 1

    .line 53
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Ll/ܶ᩶ۘ;->᩶:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 19

    move-object/from16 v0, p0

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

    const v13, -0x5bbac46e

    sget v14, Ll/ۘ֡;->ܰ֡ܽ:I

    sget v15, Ll/֨᩺;->۬᩺ܰ:I

    const-string v16, "\u1a76\u06db"

    invoke-static/range {v16 .. v16}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v15

    xor-int v1, v16, v14

    mul-int/lit16 v1, v1, 0x40fd

    const v18, 0x44e36e9b

    xor-int v1, v1, v18

    const v18, 0x1e28c7e

    xor-int v16, v16, v18

    move-object/from16 v18, v3

    move-object v12, v11

    move/from16 v17, v16

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const v16, -0x5bbac46e

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v16, v14

    mul-int/lit16 v4, v4, 0x3caf

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    .line 25
    invoke-super/range {p0 .. p1}, Ll/ۗܺۘ;->onCreate(Landroid/os/Bundle;)V

    .line 26
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 15
    sget v1, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v1, :cond_3

    goto/16 :goto_4

    :sswitch_0
    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-gez v1, :cond_c

    goto/16 :goto_5

    .line 9
    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v1

    if-ltz v1, :cond_a

    goto :goto_1

    .line 25
    :sswitch_2
    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v1, :cond_6

    goto :goto_1

    .line 11
    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    :goto_1
    const-string v1, "\u06e1\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x7fcf

    const v17, 0x3d86ef1e

    xor-int v4, v4, v17

    const v17, -0x695d8f9e

    goto/16 :goto_8

    .line 25
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    return-void

    .line 26
    :sswitch_5
    invoke-static {v0, v3}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v1

    iput-object v1, v0, Ll/ܶ᩶ۘ;->ܺ:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 27
    invoke-static/range {p0 .. p0}, Ll/۟;->ۤۨܺ(Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z

    return-void

    .line 26
    :sswitch_6
    sget-object v1, Ll/ܶ᩶ۘ;->֫ۙܳ:[S

    const/16 v3, 0x19

    const/16 v4, 0x12

    invoke-static {v1, v3, v4, v11}, Ll/֨᩺;->ۧۖܿ([SIII)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :sswitch_7
    sget-object v1, Ll/ܶ᩶ۘ;->֫ۙܳ:[S

    const/4 v3, 0x7

    const/16 v4, 0x12

    invoke-static {v1, v3, v4, v11}, Ll/֫ܽ;->ᩴ᩸ۗ([SIII)Ljava/lang/String;

    move-result-object v1

    :goto_2
    move-object v3, v1

    const-string v1, "\u073a\u06eb"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x604d

    const v17, 0xddf8059

    xor-int v4, v4, v17

    const v17, -0x43817348

    goto/16 :goto_8

    :sswitch_8
    const/4 v1, 0x6

    invoke-static {v12, v13, v1, v11}, Ll/֡᩶;->ۢۖ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫᩺;->֨ᩴۖ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "\u1a74\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x1221

    const v17, -0x2d46d1f2

    xor-int v4, v4, v17

    const v17, 0x55f871f0

    goto/16 :goto_8

    :cond_0
    const-string v1, "\u06db\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x1e0d

    const v17, 0xe68ac57

    xor-int v4, v4, v17

    const v17, -0x6c34574

    goto/16 :goto_8

    :sswitch_9
    const/4 v13, 0x1

    .line 12
    sget-boolean v1, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v1, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v1, "\u1a78\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x3f

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x12d7

    const v17, -0x3112a52a

    xor-int v4, v4, v17

    const v17, -0x262cb5c2

    goto/16 :goto_8

    .line 26
    :sswitch_a
    sget-object v12, Ll/ܶ᩶ۘ;->֫ۙܳ:[S

    .line 15
    sget v1, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v1, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v1, "\u06e1\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x4231

    const v17, -0x25e83757

    xor-int v4, v4, v17

    const v17, -0x28b2fa8e

    goto/16 :goto_8

    :cond_3
    const-string v1, "\u06dc\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x5b

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x5cb5

    const v17, -0x18692353

    xor-int v4, v4, v17

    const v17, 0x7c085ab9

    goto/16 :goto_8

    :sswitch_b
    const/16 v1, 0x46fc

    const/16 v11, 0x46fc

    goto :goto_3

    :sswitch_c
    const v1, 0xde8b

    const v11, 0xde8b

    :goto_3
    const-string v1, "\u1a75\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x17

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x5079

    const v17, 0x436b8d18

    xor-int v4, v4, v17

    const v17, 0x48600b95

    goto/16 :goto_8

    :sswitch_d
    add-int v1, v6, v10

    mul-int v1, v1, v1

    sub-int v1, v9, v1

    if-ltz v1, :cond_4

    const-string v1, "\u06e8\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x45

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x5a4d

    const v17, -0x2cbe77d5

    xor-int v4, v4, v17

    const v17, -0x2de491f8

    goto/16 :goto_8

    :cond_4
    const-string v1, "\u06e0\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x9

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x31d7

    const v17, -0x76810c5c

    xor-int v4, v4, v17

    const v17, -0x7f3345a1

    goto/16 :goto_8

    :sswitch_e
    const/16 v10, 0x593    # 2.0E-42f

    sget v1, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v1, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u1a7a\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x59

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x6aa9

    const v17, -0x644eb99e

    xor-int v4, v4, v17

    const v17, 0x5aa5a7db

    goto/16 :goto_8

    :sswitch_f
    add-int v1, v7, v8

    add-int v9, v1, v1

    sget v1, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v1, :cond_7

    :cond_6
    :goto_4
    const-string v1, "\u06e0\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x10c1

    const v17, -0x5931ec9c

    xor-int v4, v4, v17

    const v17, 0x4c6eed4e    # 6.263327E7f

    goto/16 :goto_8

    :cond_7
    const-string v1, "\u06dc\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x6e5

    const v17, -0x69d757e

    xor-int v4, v4, v17

    const v17, -0x27b722c2

    goto/16 :goto_8

    :sswitch_10
    const v8, 0x1f1269

    .line 16
    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v1, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u05a8\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x7e01

    const v17, 0x4cab7f67    # 8.991417E7f

    xor-int v4, v4, v17

    const v17, 0x66ece54

    goto/16 :goto_8

    :sswitch_11
    aget-short v6, v18, v5

    mul-int v7, v6, v6

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v1

    if-gtz v1, :cond_9

    goto :goto_6

    :cond_9
    const-string v1, "\u1a74\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x586d

    const v17, 0x7ef0abb3

    xor-int v4, v4, v17

    const v17, -0x1c61a05e

    goto/16 :goto_8

    :sswitch_12
    const/4 v5, 0x0

    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_b

    :cond_a
    :goto_5
    const-string v1, "\u073a\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x7415

    const v17, -0x1f07247

    xor-int v4, v4, v17

    const v17, -0x54f83bab    # -4.82341E-13f

    goto :goto_8

    :cond_b
    const-string v1, "\u1a79\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x54bd

    const v17, 0x32dc58b9

    xor-int v4, v4, v17

    const v17, -0x1d468439

    goto :goto_8

    :sswitch_13
    sget-object v18, Ll/ܶ᩶ۘ;->֫ۙܳ:[S

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v1

    if-ltz v1, :cond_d

    :cond_c
    :goto_6
    const-string v1, "\u05a8\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x2b7f

    const v17, 0x77e7f8ae

    xor-int v4, v4, v17

    const v17, -0x2745e768

    goto :goto_8

    :cond_d
    const-string v1, "\u1a79\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x3

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x7ce9

    const v17, -0x3eae558f

    xor-int v4, v4, v17

    const v17, 0x7a6030fd

    goto :goto_8

    .line 6
    :sswitch_14
    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v1, :cond_e

    :goto_7
    const-string v1, "\u1a75\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x191d

    const v17, 0x3dff949

    xor-int v4, v4, v17

    const v17, 0x12edc66e

    goto :goto_8

    :cond_e
    const-string v1, "\u1a78\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x6da1

    const v17, 0x20ccac5d

    xor-int v4, v4, v17

    const v17, -0x2a32e317

    :goto_8
    xor-int v17, v1, v17

    move v1, v4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7aa0d157 -> :sswitch_a
        -0x77dc355e -> :sswitch_0
        -0x737a949a -> :sswitch_14
        -0x6aecc4d3 -> :sswitch_e
        -0x635cc574 -> :sswitch_f
        -0x543f6300 -> :sswitch_b
        -0x4ded955b -> :sswitch_7
        -0x49eb4891 -> :sswitch_2
        -0x4646a8b7 -> :sswitch_c
        -0x35f95877 -> :sswitch_0
        -0x35350930 -> :sswitch_3
        -0x30c9f764 -> :sswitch_6
        -0x2bbe41df -> :sswitch_14
        -0x295c8b1e -> :sswitch_3
        -0x8cd5124 -> :sswitch_11
        0x254235d -> :sswitch_b
        0x2edd074 -> :sswitch_9
        0x57657d0 -> :sswitch_12
        0xde80fc8 -> :sswitch_e
        0x14f97dd8 -> :sswitch_10
        0x16e53a7f -> :sswitch_4
        0x1c92d844 -> :sswitch_6
        0x213bce0a -> :sswitch_a
        0x26edc7a3 -> :sswitch_8
        0x2be6314c -> :sswitch_1
        0x363d185a -> :sswitch_10
        0x40dd449b -> :sswitch_d
        0x4277ee32 -> :sswitch_1
        0x4302a500 -> :sswitch_4
        0x4ae18f34 -> :sswitch_8
        0x4f0365d0 -> :sswitch_13
        0x53f80666 -> :sswitch_9
        0x5acb78f4 -> :sswitch_c
        0x5db403b5 -> :sswitch_f
        0x612faa92 -> :sswitch_5
        0x614625f3 -> :sswitch_12
        0x63f1231d -> :sswitch_7
        0x69de6333 -> :sswitch_5
        0x6a711750 -> :sswitch_13
        0x74f8d365 -> :sswitch_d
        0x7877768f -> :sswitch_11
        0x7ea72bc2 -> :sswitch_2
    .end sparse-switch
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 6

    const v0, -0x951a445

    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    sget v2, Ll/֫;->ܶܺ᩻:I

    const-string v3, "\u06e7\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x37fb

    const v5, 0x3775b86c

    xor-int/2addr v4, v5

    const v5, 0x77eb5afb

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3953

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    .line 16
    :sswitch_0
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_b

    goto/16 :goto_2

    .line 6
    :sswitch_1
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-lez v3, :cond_6

    goto/16 :goto_2

    .line 33
    :sswitch_2
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez v3, :cond_9

    goto/16 :goto_2

    .line 17
    :sswitch_3
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    goto/16 :goto_2

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    return-void

    .line 33
    :sswitch_5
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 34
    iget-object v0, p0, Ll/ܶ᩶ۘ;->ܺ:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v0, p1, p0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z

    return-void

    .line 32
    :sswitch_6
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 15
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v3

    if-gtz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u0730\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4d1f

    const v5, 0x7fce83a2

    xor-int/2addr v4, v5

    const v5, 0x484d7882

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    const-string v3, "\u0733\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x672b

    const v5, -0x4f9fe9aa

    xor-int/2addr v4, v5

    const v5, 0x3fd9a80

    goto :goto_0

    :cond_1
    const-string v3, "\u073d\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4f39

    const v5, 0x55bf7f34

    xor-int/2addr v4, v5

    const v5, 0x7f6c847b

    goto/16 :goto_0

    .line 10
    :sswitch_8
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06ec\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x43bd

    const v5, -0x2b52d015

    xor-int/2addr v4, v5

    const v5, -0x3f59e2ab

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06d6\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3279

    const v5, -0x53f34588    # -1.9998708E-12f

    xor-int/2addr v4, v5

    const v5, 0x1d36d423

    goto/16 :goto_0

    .line 22
    :sswitch_9
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u06ec\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x70fd

    const v5, -0x76d3e2cb

    xor-int/2addr v4, v5

    const v5, -0x745b29c9

    goto/16 :goto_0

    .line 5
    :sswitch_a
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u05a1\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5597

    const v5, -0x7f6c6032

    xor-int/2addr v4, v5

    const v5, -0x5cfb2594

    goto/16 :goto_0

    .line 20
    :sswitch_b
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_7

    :cond_6
    const-string v3, "\u1a77\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c47

    const v5, -0x2c061414

    xor-int/2addr v4, v5

    const v5, 0x52710c6d

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u073a\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x57fb

    const v5, -0x3408e80e    # -3.2387044E7f

    xor-int/2addr v4, v5

    const v5, 0x4c73caae    # 6.3908536E7f

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_8

    :goto_2
    const-string v3, "\u1a7b\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c99

    const v5, 0x142b5034

    xor-int/2addr v4, v5

    const v5, -0x619f4a2d

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u05a8\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3077

    const v5, -0x5d9c259

    xor-int/2addr v4, v5

    const v5, 0x27c13d12

    goto/16 :goto_0

    .line 30
    :sswitch_d
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06e2\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1321

    const v5, 0x25d1d6d4

    xor-int/2addr v4, v5

    const v5, 0x1fed2af4

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05a8\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x48db

    const v5, 0xe2a8e5f

    xor-int/2addr v4, v5

    const v5, -0x2dc2e4b9

    goto/16 :goto_0

    .line 16
    :sswitch_e
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06d6\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x788d

    const v5, -0x58981711

    xor-int/2addr v4, v5

    const v5, 0x1eae6c8e

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05a8\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4481

    const v5, 0x2110f937

    xor-int/2addr v4, v5

    const v5, 0x1483d619

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x572c955b -> :sswitch_8
        -0x53a4e765 -> :sswitch_5
        -0x3869c3ea -> :sswitch_3
        -0x233cbb95 -> :sswitch_c
        -0x1eee80e7 -> :sswitch_7
        -0x135b882a -> :sswitch_b
        -0x10e5e3d4 -> :sswitch_b
        -0xd963b24 -> :sswitch_0
        -0x6f64457 -> :sswitch_6
        -0x573eff4 -> :sswitch_9
        -0x17fc4c8 -> :sswitch_0
        0x702c9d -> :sswitch_e
        0x8f7e537 -> :sswitch_6
        0xd41b973 -> :sswitch_1
        0xe48d316 -> :sswitch_3
        0x1021ea21 -> :sswitch_9
        0x10f3993c -> :sswitch_4
        0x14f07b3a -> :sswitch_a
        0x1c8a2801 -> :sswitch_e
        0x23940d96 -> :sswitch_4
        0x24b04597 -> :sswitch_7
        0x362b573a -> :sswitch_c
        0x3be8abe0 -> :sswitch_a
        0x4630a298 -> :sswitch_d
        0x59290403 -> :sswitch_2
        0x5ff7dd17 -> :sswitch_5
        0x631899df -> :sswitch_d
        0x69353045 -> :sswitch_1
        0x6a66926c -> :sswitch_8
        0x6f600a12 -> :sswitch_2
    .end sparse-switch
.end method

.method public final onReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)V
    .locals 0

    return-void
.end method

.method public final onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x2dbe1ac6

    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    const-string v5, "\u073a\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4f43

    const v7, 0x555c32a2

    xor-int/2addr v6, v7

    const v7, 0x5ede223c

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x7817

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 27
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v5

    if-eqz v5, :cond_d

    goto/16 :goto_4

    .line 17
    :sswitch_0
    sget v5, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v5, :cond_9

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget-boolean v5, Ll/֨۟;->ܿ᩻۫:Z

    if-nez v5, :cond_b

    goto/16 :goto_4

    .line 29
    :sswitch_2
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    return-void

    .line 46
    :sswitch_4
    invoke-interface {v1, p1}, Ll/᩺᩶ۘ;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    goto :goto_1

    :sswitch_5
    const/4 v5, 0x0

    .line 47
    sput-object v5, Ll/ܶ᩶ۘ;->᩶:Ljava/lang/ref/WeakReference;

    goto :goto_2

    .line 44
    :sswitch_6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺᩶ۘ;

    if-eqz v1, :cond_0

    const-string v5, "\u06db\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x61

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x781f

    const v7, 0x3202b71d

    xor-int/2addr v6, v7

    const v7, 0x23787676

    goto :goto_0

    :cond_0
    :goto_1
    const-string v5, "\u0730\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x41

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x74c3

    const v7, 0x1e393283

    xor-int/2addr v6, v7

    const v7, -0x16bebfd8

    goto :goto_0

    .line 49
    :sswitch_7
    invoke-static {p0}, Ll/֡۠;->۫᩵ۙ(Ljava/lang/Object;)V

    return-void

    .line 43
    :sswitch_8
    sget-object v0, Ll/ܶ᩶ۘ;->᩶:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    const-string v5, "\u06d6\u06da"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x13a1

    const v7, 0x6271e14

    xor-int/2addr v6, v7

    const v7, -0x35883fca    # -4059149.5f

    goto/16 :goto_0

    :cond_1
    :goto_2
    const-string v5, "\u06e8\u073f"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x33

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5eb1

    const v7, -0xc1ef59e

    xor-int/2addr v6, v7

    const v7, 0x1e6e6c3d

    goto/16 :goto_0

    .line 10
    :sswitch_9
    sget v5, Ll/ۗ;->֨۬ۖ:I

    if-ltz v5, :cond_2

    goto :goto_3

    :cond_2
    const-string v5, "\u1a73\u06e8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x59a5

    const v7, 0x7b88dbf3

    xor-int/2addr v6, v7

    const v7, 0x240a41c0

    goto/16 :goto_0

    .line 32
    :sswitch_a
    sget v5, Ll/֫;->ܶܺ᩻:I

    if-ltz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u06e8\u05a8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x71fd

    const v7, -0x13071787

    xor-int/2addr v6, v7

    const v7, 0x711bc1e1

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget-boolean v5, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v5, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v5, "\u1a79\u06da"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6af9

    const v7, -0x5d6aaf4d

    xor-int/2addr v6, v7

    const v7, -0x10368099

    goto/16 :goto_0

    .line 19
    :sswitch_c
    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v5, "\u06d8\u06e8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x39fd

    const v7, 0x297d5833

    xor-int/2addr v6, v7

    const v7, -0x7cb7c962

    goto/16 :goto_0

    .line 30
    :sswitch_d
    sget v5, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v5, :cond_6

    :goto_3
    const-string v5, "\u073d\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x45

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4fd5

    const v7, 0x7a2f7952

    xor-int/2addr v6, v7

    const v7, -0x6e00f8ac

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06ec\u06d8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6085

    const v7, -0x48e90852

    xor-int/2addr v6, v7

    const v7, -0x75cd08d1

    goto/16 :goto_0

    .line 12
    :sswitch_e
    sget v5, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v5, :cond_7

    :goto_4
    const-string v5, "\u1a78\u06d7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2151

    const v7, 0x522924d0

    xor-int/2addr v6, v7

    const v7, 0x5acc12f0

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u1a75\u073d"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3fc3

    const v7, -0x79401502

    xor-int/2addr v6, v7

    const v7, -0x7b81c43c    # -2.9885E-36f

    goto/16 :goto_0

    .line 28
    :sswitch_f
    sget-boolean v5, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v5, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v5, "\u073f\u0736"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x45

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2569

    const v7, 0x202d46ad

    xor-int/2addr v6, v7

    const v7, -0x15894751

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v5, :cond_a

    :cond_9
    :goto_5
    const-string v5, "\u06e1\u073a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x59

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x661d

    const v7, -0x6d31e028

    xor-int/2addr v6, v7

    const v7, -0x13a15a43

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06d7\u06d7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xbcb

    const v7, -0xc007c60

    xor-int/2addr v6, v7

    const v7, -0x7358f7a

    goto/16 :goto_0

    .line 42
    :sswitch_11
    sget v5, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v5, :cond_c

    :cond_b
    :goto_6
    const-string v5, "\u05a8\u073a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1be7

    const v7, -0x3c3b5c81

    xor-int/2addr v6, v7

    const v7, 0x2801c151

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d7\u05ab"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x71

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4af

    const v7, 0x76ccd824

    xor-int/2addr v6, v7

    const v7, 0x2f34eec2

    goto/16 :goto_0

    .line 26
    :sswitch_12
    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v5, :cond_e

    :cond_d
    :goto_7
    const-string v5, "\u1a73\u1a76"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6085

    const v7, -0x6f9e159c

    xor-int/2addr v6, v7

    const v7, 0x64c3940a

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u06da\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x6f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x11a1

    const v7, -0xb274865

    xor-int/2addr v6, v7

    const v7, 0x6240374d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b03e948 -> :sswitch_5
        -0x782352ba -> :sswitch_8
        -0x71cd97db -> :sswitch_f
        -0x67c4eb65 -> :sswitch_5
        -0x64284551 -> :sswitch_12
        -0x5f1563c7 -> :sswitch_d
        -0x5d61583f -> :sswitch_6
        -0x5741ba11 -> :sswitch_a
        -0x536ff261 -> :sswitch_6
        -0x49f7d4b6 -> :sswitch_c
        -0x42cfdf6e -> :sswitch_8
        -0x38eaf3c6 -> :sswitch_2
        -0x30b20ebd -> :sswitch_4
        -0x24d22fd3 -> :sswitch_b
        -0x23e7c2f1 -> :sswitch_d
        -0x1bb98347 -> :sswitch_11
        -0x1b27b27b -> :sswitch_10
        -0x14c243a4 -> :sswitch_7
        -0x137f3833 -> :sswitch_0
        -0x2f4ee38 -> :sswitch_12
        0xa52a57e -> :sswitch_b
        0x1668717a -> :sswitch_1
        0x19fa8d51 -> :sswitch_1
        0x230af429 -> :sswitch_e
        0x297e2782 -> :sswitch_9
        0x29e7fc10 -> :sswitch_c
        0x360d7c5c -> :sswitch_11
        0x390559eb -> :sswitch_e
        0x4676ffd9 -> :sswitch_0
        0x47e2008b -> :sswitch_9
        0x4c1f92b5 -> :sswitch_a
        0x5073ae74 -> :sswitch_4
        0x5b1f7c35 -> :sswitch_f
        0x6a8a8d03 -> :sswitch_3
        0x7518c301 -> :sswitch_2
        0x75b8a184 -> :sswitch_3
        0x7a6ebce1 -> :sswitch_7
        0x7e38ea35 -> :sswitch_10
    .end sparse-switch
.end method

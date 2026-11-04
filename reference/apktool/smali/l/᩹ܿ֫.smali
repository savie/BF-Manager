.class public final Ll/᩹ܿ֫;
.super Landroid/content/BroadcastReceiver;
.source "F5X0"


# static fields
.field private static final ᩹ᩳܰ:[S


# instance fields
.field public final synthetic ۙ:Ll/᩵ܿ֫;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x21

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩹ܿ֫;->᩹ᩳܰ:[S

    return-void

    :array_0
    .array-data 2
        0x8b9s
        -0x4c45s
        -0x4c47s
        -0x4c52s
        -0x4c4ds
        -0x4c4bs
        -0x4c4cs
        -0x4c5bs
        -0x4c49s
        -0x4c52s
        -0x4c5bs
        -0x4c47s
        -0x4c4as
        -0x4c4bs
        -0x4c57s
        -0x4c41s
        -0x4c5bs
        -0x4c58s
        -0x4c41s
        -0x4c57s
        -0x4c4bs
        -0x4c51s
        -0x4c58s
        -0x4c47s
        -0x4c41s
        -0x4c5bs
        -0x4c55s
        -0x4c51s
        -0x4c41s
        -0x4c58s
        -0x4c4ds
        -0x4c41s
        -0x4c58s
    .end array-data
.end method

.method public constructor <init>(Ll/᩵ܿ֫;)V
    .locals 0

    .line 120
    iput-object p1, p0, Ll/᩹ܿ֫;->ۙ:Ll/᩵ܿ֫;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 17

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x55e7b9ee

    sget v11, Ll/ۖᩳ;->᩹ۧܳ:I

    sget v12, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v13, "\u1a76\u1a74"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x4b87

    const v15, 0x57c04a6a

    xor-int/2addr v14, v15

    const v15, 0x513fc120

    xor-int/2addr v13, v15

    :goto_0
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0xff

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    move-object/from16 v13, p0

    .line 125
    iget-object v14, v13, Ll/᩹ܿ֫;->ۙ:Ll/᩵ܿ֫;

    invoke-virtual {v14}, Landroid/app/Service;->stopSelf()V

    goto :goto_2

    .line 5
    :sswitch_0
    sget v13, Ll/ۖ᩹;->۫ܽۗ:I

    if-gez v13, :cond_1

    :cond_0
    move-object/from16 v13, p0

    goto/16 :goto_8

    :cond_1
    move-object/from16 v13, p0

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v13

    if-eqz v13, :cond_2

    :goto_1
    move-object/from16 v13, p0

    goto/16 :goto_7

    :cond_2
    move-object/from16 v13, p0

    goto/16 :goto_6

    .line 77
    :sswitch_2
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v13, Ll/֡ۖ;->۫ۙ᩶:I

    if-lez v13, :cond_0

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    goto :goto_1

    .line 33
    :sswitch_4
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    return-void

    :sswitch_5
    move-object/from16 v13, p0

    return-void

    :sswitch_6
    move-object/from16 v13, p0

    .line 0
    invoke-static {v7, v8, v9, v6}, Ll/ۘ֡;->۫ܺۡ([SIII)Ljava/lang/String;

    move-result-object v14

    .line 124
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Ll/ۖۙ;->ᩴ۫ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_3

    const-string v14, "\u06d8\u1a7b"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x2d85

    const v16, -0xb50d7bf

    xor-int v15, v15, v16

    const v16, 0x3f214cb9

    goto/16 :goto_9

    :cond_3
    :goto_2
    const-string v14, "\u06e2\u06e1"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x27

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x607

    const v16, -0x296d7e73

    xor-int v15, v15, v16

    const v16, -0x7bce4703

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v13, p0

    .line 0
    sget-object v7, Ll/᩹ܿ֫;->᩹ᩳܰ:[S

    const/4 v8, 0x1

    const/16 v9, 0x20

    .line 119
    sget-boolean v14, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v14, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v14, "\u05a8\u05ab"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x2f33

    const v16, -0x4fc13dc5

    xor-int v15, v15, v16

    const v16, -0x378514f4

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v13, p0

    const v6, 0x8c03

    goto :goto_3

    :sswitch_9
    move-object/from16 v13, p0

    const v6, 0xb3fa

    :goto_3
    const-string v14, "\u06d9\u1a7b"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    mul-int/lit8 v14, v14, -0x4b

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x11b9

    const v16, 0x44553c2a

    xor-int v15, v15, v16

    const v16, 0x2dd95f16

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v13, p0

    add-int v14, v4, v5

    add-int/2addr v14, v14

    sub-int/2addr v14, v3

    if-gez v14, :cond_5

    const-string v14, "\u1a7a\u1a75"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x55

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x6b73

    const v16, -0x5fbd6b3f

    xor-int v15, v15, v16

    const v16, -0x2e1c5eaa

    goto/16 :goto_9

    :cond_5
    const-string v14, "\u1a7a\u1a74"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0xf

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x1aff

    const v16, 0x7a8d0ad6

    xor-int v15, v15, v16

    const v16, 0x147c85c0

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v13, p0

    const v5, 0x393100

    .line 99
    sget v14, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v14, :cond_6

    :goto_4
    const-string v14, "\u1a75\u1a75"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x64d3

    const v16, 0x5b3f3630

    xor-int v15, v15, v16

    const v16, 0x5a132fca

    goto/16 :goto_9

    :cond_6
    const-string v14, "\u073d\u1a7a"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x35bd

    const v16, 0x327d9fc8

    xor-int v15, v15, v16

    const v16, -0x612c4e8d

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v13, p0

    add-int v3, v1, v2

    mul-int v3, v3, v3

    mul-int v4, v1, v1

    sget-boolean v14, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v14, :cond_7

    goto :goto_5

    :cond_7
    const-string v14, "\u05a1\u1a79"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x47

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x7355

    const v16, 0x2244b0c5

    xor-int v15, v15, v16

    const v16, -0x22c82afb

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v13, p0

    const/4 v1, 0x0

    aget-short v1, v0, v1

    const/16 v2, 0x790

    sget-boolean v14, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v14, :cond_8

    :goto_5
    const-string v14, "\u073d\u06e4"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x31c3

    const v16, 0x6f6ccac1

    xor-int v15, v15, v16

    const v16, 0x5ca71a15

    goto/16 :goto_9

    :cond_8
    const-string v14, "\u0733\u1a7b"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    mul-int/lit8 v14, v14, 0x31

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x621

    const v16, 0x2cd094a1

    xor-int v15, v15, v16

    const v16, -0x3a54b290

    goto/16 :goto_9

    :sswitch_e
    move-object/from16 v13, p0

    sget-object v0, Ll/᩹ܿ֫;->᩹ᩳܰ:[S

    sget v14, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v14, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v14, "\u1a73\u06eb"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x549

    const v16, -0x2ad0e5e1

    xor-int v15, v15, v16

    const v16, -0x423990dc

    goto/16 :goto_9

    :sswitch_f
    move-object/from16 v13, p0

    .line 95
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v14

    if-eqz v14, :cond_a

    goto :goto_7

    :cond_a
    const-string v14, "\u06d6\u1a7b"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x5f

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x3959

    const v16, 0x35f2a468

    xor-int v15, v15, v16

    const v16, -0x35b9ed09

    goto/16 :goto_9

    :sswitch_10
    move-object/from16 v13, p0

    .line 115
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v14

    if-eqz v14, :cond_b

    goto/16 :goto_8

    :cond_b
    const-string v14, "\u06d7\u073a"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x3997

    const v16, -0x341410a2

    xor-int v15, v15, v16

    const v16, 0x4c04d52a    # 3.482129E7f

    goto/16 :goto_9

    :sswitch_11
    move-object/from16 v13, p0

    .line 107
    sget v14, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v14, :cond_c

    :goto_6
    const-string v14, "\u1a79\u06e8"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x47

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x5c0b

    const v16, 0x5360a63f

    xor-int v15, v15, v16

    const v16, 0x78870da

    goto/16 :goto_9

    :cond_c
    const-string v14, "\u06e1\u0736"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x6d

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x3e7d

    const v16, 0x2d642ae0

    xor-int v15, v15, v16

    const v16, -0x3d1feffd

    goto :goto_9

    :sswitch_12
    move-object/from16 v13, p0

    sget v14, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v14, :cond_d

    :goto_7
    const-string v14, "\u05ab\u06e8"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    mul-int/lit8 v14, v14, 0x25

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x5d9f

    const v16, 0x575b8c88

    xor-int v15, v15, v16

    const v16, 0x744ad3d3

    goto :goto_9

    :cond_d
    const-string v14, "\u1a75\u0733"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x18ff

    const v16, -0x3f703eff

    xor-int v15, v15, v16

    const v16, -0x6e1ba023

    goto :goto_9

    :sswitch_13
    move-object/from16 v13, p0

    .line 93
    sget v14, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v14, :cond_e

    :goto_8
    const-string v14, "\u1a74\u1a7a"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    mul-int/lit8 v14, v14, -0x7b

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x43dd

    const v16, 0x76a12342

    xor-int v15, v15, v16

    const v16, -0x37b8c589

    goto :goto_9

    :cond_e
    const-string v14, "\u05ab\u06e2"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x207d

    const v16, -0x7b4f7807

    xor-int v15, v15, v16

    const v16, -0xcd4e952

    :goto_9
    xor-int v14, v14, v16

    move v13, v14

    move v14, v15

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78cc1421 -> :sswitch_6
        -0x4c546348 -> :sswitch_b
        -0x42d856f4 -> :sswitch_11
        -0x3ff17069 -> :sswitch_4
        -0x34739482 -> :sswitch_0
        -0x30e7c276 -> :sswitch_9
        -0x303099cf -> :sswitch_b
        -0x2e650182 -> :sswitch_a
        -0x2bf6bc15 -> :sswitch_a
        -0x2963f05a -> :sswitch_1
        -0x21512ead -> :sswitch_11
        -0x20005c3d -> :sswitch_8
        -0x1e43d0ad -> :sswitch_8
        -0x17a4f154 -> :sswitch_7
        -0x17531078 -> :sswitch_c
        -0xd731fd4 -> :sswitch_d
        0x1c7a9f2 -> :sswitch_4
        0x251cc29 -> :sswitch_6
        0x34dbbb9 -> :sswitch_f
        0x41d8249 -> :sswitch_2
        0x10287c16 -> :sswitch_13
        0x1559d4ba -> :sswitch_1
        0x158ba5f9 -> :sswitch_2
        0x1a60e4d3 -> :sswitch_12
        0x1e0304ce -> :sswitch_0
        0x1e69db19 -> :sswitch_10
        0x1e753a4e -> :sswitch_13
        0x2c984e1e -> :sswitch_e
        0x2e28d059 -> :sswitch_e
        0x2ebe07d9 -> :sswitch_3
        0x336c4385 -> :sswitch_c
        0x3dde31a1 -> :sswitch_3
        0x4171da8f -> :sswitch_d
        0x4369a418 -> :sswitch_5
        0x5103fc1c -> :sswitch_7
        0x60714818 -> :sswitch_10
        0x63656b4e -> :sswitch_f
        0x64003615 -> :sswitch_12
        0x6628f8c6 -> :sswitch_9
        0x7c560fe6 -> :sswitch_5
    .end sparse-switch
.end method

.class public final synthetic Ll/᩺ܺۘ;
.super Ljava/lang/Object;
.source "B1VR"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ܺܰۨ:[S


# instance fields
.field public final synthetic ܺ:I

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩺ܺۘ;->ܺܰۨ:[S

    return-void

    :array_0
    .array-data 2
        0x2463s
        -0x10c7s
        -0x10dbs
        -0x10c4s
        -0x10d2s
        -0x10e0s
        -0x10d9s
        -0x1100s
        -0x10d3s
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 4

    const v0, -0x55d2bcf0

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    sget v2, Ll/ۗ۬;->ۤᩴ᩻:I

    .line 0
    iput p2, p0, Ll/᩺ܺۘ;->ܺ:I

    iput-object p1, p0, Ll/᩺ܺۘ;->᩶:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u06dc\u1a75"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x5047

    const v3, 0x4dcb91a6    # 4.26915E8f

    xor-int/2addr p2, v3

    const v3, -0x29e84a1e

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x4e9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    sget p1, Ll/ۗ;->֨۬ۖ:I

    if-ltz p1, :cond_1

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    sget p1, Ll/֡ܳ;->֡۠ۧ:I

    if-lez p1, :cond_0

    goto :goto_2

    :cond_0
    const-string p1, "\u05ab\u06e4"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x79

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2c9d

    const v3, -0x4f3675f8

    xor-int/2addr p2, v3

    const v3, -0x70e0e444

    goto :goto_0

    :cond_1
    const-string p1, "\u05a1\u06e7"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x2b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x1379

    const v3, 0x1643cadf

    xor-int/2addr p2, v3

    const v3, 0x1288e54c

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06e7\u06d6"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x6f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x36dd

    const v3, -0x20ed79ad

    xor-int/2addr p2, v3

    const v3, -0x3c48ba9a

    goto :goto_0

    .line 3
    :sswitch_2
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    :goto_2
    const-string p1, "\u06da\u06d6"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x1763

    const v3, 0x5c8c2ae6

    xor-int/2addr p2, v3

    const v3, -0x70043042

    goto :goto_0

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/۟;->ۨᩴۛ:I

    if-ltz p1, :cond_3

    const-string p1, "\u06dc\u06d9"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x55

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0xf61

    const v3, -0x2e695192

    xor-int/2addr p2, v3

    const v3, -0x453c41ab

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06e4\u06d8"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x37

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x29ff

    const v3, 0x79a8ddf0

    xor-int/2addr p2, v3

    const v3, 0x6fb2b28a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x791a6d00 -> :sswitch_0
        -0x734d3f33 -> :sswitch_4
        -0x29c1a3e2 -> :sswitch_3
        -0x19f9e657 -> :sswitch_1
        -0x2820934 -> :sswitch_0
        0xf48371a -> :sswitch_4
        0x1fa11551 -> :sswitch_1
        0x2ef90135 -> :sswitch_3
        0x53f00ae3 -> :sswitch_2
        0x5af81a66 -> :sswitch_2
        0x726b9db0 -> :sswitch_5
        0x77154f4c -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 19

    move-object/from16 v1, p0

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, -0x307c6f10

    sget v12, Ll/֡۠;->ۛ᩻ۧ:I

    sget v13, Ll/ۗ;->֨۬ۖ:I

    const-string v14, "\u073d\u1a7b"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x62c3

    const v16, 0x50bc797e

    xor-int v15, v15, v16

    const v16, -0x230c300

    xor-int v14, v14, v16

    move-object/from16 v18, v2

    move-object v2, v0

    move-object/from16 v0, v18

    :goto_0
    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, -0x71cf

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move-object/from16 v16, v0

    move/from16 v17, v11

    const/4 v4, 0x0

    .line 483
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_d

    .line 34
    :sswitch_0
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v14

    if-eqz v14, :cond_0

    goto/16 :goto_2

    :cond_0
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_b

    .line 38
    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v14

    if-gez v14, :cond_1

    goto :goto_2

    :cond_1
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_9

    :sswitch_2
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    sget v14, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v14, :cond_3

    :cond_2
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_c

    :cond_3
    const-string v14, "\u06e0\u1a75"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x6ed

    const v16, -0x2fce54eb

    xor-int v15, v15, v16

    const v16, -0x50d09c65

    goto :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v14

    if-gtz v14, :cond_2

    :goto_1
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_8

    :sswitch_4
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget v14, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v14, :cond_4

    goto :goto_1

    :cond_4
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_a

    :sswitch_5
    sget v14, Ll/ۗ᩺;->ۢۜ᩶:I

    if-lez v14, :cond_5

    goto :goto_3

    :cond_5
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_d

    .line 255
    :sswitch_6
    sget v14, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v14, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    const-string v14, "\u06e4\u06db"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, -0x73

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x5c11

    const v16, -0x4803263e

    xor-int v15, v15, v16

    const v16, 0x709143a3

    goto :goto_4

    .line 230
    :sswitch_7
    sget v14, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v14, :cond_7

    goto :goto_1

    :cond_7
    :goto_3
    const-string v14, "\u0733\u1a76"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x7b

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x307f

    const v16, 0x31fee944

    xor-int v15, v15, v16

    const v16, -0x65c10af4

    :goto_4
    xor-int v14, v14, v16

    goto/16 :goto_0

    .line 149
    :sswitch_8
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    goto :goto_1

    .line 5
    :sswitch_9
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    :sswitch_a
    return-void

    .line 516
    :sswitch_b
    invoke-static {v0}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ll/֫ۛ;->ۖۛۖ(Ljava/lang/Object;)Ll/ܺۡۜ;

    move-object/from16 v16, v0

    move/from16 v17, v11

    goto :goto_5

    .line 510
    :sswitch_c
    :try_start_0
    new-instance v14, Landroid/content/Intent;

    invoke-static {}, Ll/֡֡;->ۢܶܳ()Landroid/app/Application;

    move-result-object v15

    move-object/from16 v16, v0

    const-class v0, Ll/ᩳۚۘ;

    sget v17, Ll/ᩳۚۘ;->֨ܰ:I

    invoke-direct {v14, v15, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x10000000

    .line 511
    invoke-static {v14, v0}, Ll/֫ᩳ;->۫᩶ۜ(Ljava/lang/Object;I)Landroid/content/Intent;

    sget-object v0, Ll/᩺ܺۘ;->ܺܰۨ:[S
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v15, 0x1

    move/from16 v17, v11

    const/16 v11, 0x8

    :try_start_1
    invoke-static {v0, v15, v11, v10}, Ll/ۗ᩺;->ۧۤ۟([SIII)Ljava/lang/String;

    move-result-object v0

    .line 512
    invoke-static {v14, v0, v2}, Ll/֫۟;->۟ۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    .line 513
    invoke-static {}, Ll/֡֡;->ۢܶܳ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0, v14}, Ll/֫ۚ;->֨ܺۖ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_5
    const-string v0, "\u05ab\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x7b

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x57df

    const v14, 0x757e2aae

    xor-int v15, v11, v14

    const v11, 0xfea4510

    goto/16 :goto_e

    :catch_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    move/from16 v17, v11

    :goto_6
    const-string v11, "\u06d6\u05a8"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v12

    mul-int/lit8 v11, v11, -0x35

    xor-int v14, v11, v13

    mul-int/lit16 v14, v14, 0x8bf

    const v15, 0x15224b31

    xor-int/2addr v15, v14

    const v14, 0x442d74f3

    xor-int/2addr v14, v11

    goto/16 :goto_f

    .line 141
    :sswitch_d
    invoke-static {v2}, Ll/ܽܺۘ;->ۙ(Ljava/lang/CharSequence;)V

    return-void

    :sswitch_e
    move-object/from16 v16, v0

    move/from16 v17, v11

    .line 2
    iget v0, v1, Ll/᩺ܺۘ;->ܺ:I

    .line 4
    iget-object v2, v1, Ll/᩺ܺۘ;->᩶:Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    const-string v0, "\u1a79\u1a7a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x117f

    const v14, -0x7da937

    xor-int v15, v11, v14

    const v11, 0x4d65d93d    # 2.4101371E8f

    goto/16 :goto_e

    :pswitch_0
    const-string v0, "\u05a1\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x79

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, -0x38fd

    const v14, 0x6fc544b0

    xor-int v15, v11, v14

    const v11, -0x2a2bbfed

    goto/16 :goto_e

    :sswitch_f
    move-object/from16 v16, v0

    move/from16 v17, v11

    const v0, 0x8cc8

    const v10, 0x8cc8

    goto :goto_7

    :sswitch_10
    move-object/from16 v16, v0

    move/from16 v17, v11

    const v0, 0xef49

    const v10, 0xef49

    :goto_7
    const-string v0, "\u1a74\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, -0x3069

    const v14, -0x554dd8d4

    xor-int v15, v11, v14

    const v11, -0x68c59976

    goto/16 :goto_e

    :sswitch_11
    move-object/from16 v16, v0

    move/from16 v17, v11

    add-int v0, v8, v9

    sub-int v0, v7, v0

    if-gtz v0, :cond_8

    const-string v0, "\u1a79\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x56f

    const v14, -0x408ec700    # -0.942276f

    xor-int v15, v11, v14

    const v11, 0x32f58f61

    goto/16 :goto_e

    :cond_8
    const-string v0, "\u06eb\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x53

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, -0x44b9

    const v14, 0x139d5e98

    xor-int v15, v11, v14

    const v11, -0x477c69ed

    goto/16 :goto_e

    :sswitch_12
    move-object/from16 v16, v0

    move/from16 v17, v11

    const v9, 0x1d9100

    .line 265
    sget v0, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v0, :cond_9

    :goto_8
    const-string v0, "\u1a79\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, -0x7971

    const v14, -0x36482656

    xor-int v15, v11, v14

    const v11, -0x4aef02d1

    goto/16 :goto_e

    :cond_9
    const-string v0, "\u073f\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, -0xb15

    const v14, 0x63591a04

    xor-int v15, v11, v14

    const v11, 0x7da03032

    goto/16 :goto_e

    :sswitch_13
    move-object/from16 v16, v0

    move/from16 v17, v11

    mul-int v7, v5, v6

    mul-int v8, v5, v5

    .line 278
    sget v0, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v0, :cond_a

    goto/16 :goto_d

    :cond_a
    const-string v0, "\u06eb\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, -0x6565

    const v14, 0x4e792487    # 1.04498016E9f

    xor-int v15, v11, v14

    const v11, -0x5715032f

    goto/16 :goto_e

    :sswitch_14
    move-object/from16 v16, v0

    move/from16 v17, v11

    aget-short v5, v3, v4

    const/16 v6, 0xae0

    sget v0, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v0, :cond_b

    const-string v0, "\u1a76\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x2f

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, -0x3063

    const v14, 0x66ebece7

    xor-int v15, v11, v14

    const v11, 0x7722abf0

    goto/16 :goto_e

    :cond_b
    const-string v0, "\u06dc\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, -0x57b9

    const v14, 0x702131c6

    xor-int v15, v11, v14

    const v11, -0x5eba8f31

    goto/16 :goto_e

    :cond_c
    const-string v0, "\u06e0\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, -0x79f3

    const v14, 0x655165f9

    xor-int v15, v11, v14

    const v11, -0x7ceab84a

    goto/16 :goto_e

    :sswitch_15
    move-object/from16 v16, v0

    move/from16 v17, v11

    sget v0, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v0, :cond_d

    :goto_9
    const-string v0, "\u05ab\u1a75"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x7bed

    const v14, 0x39751eef

    xor-int v15, v11, v14

    const v11, -0x217656c4

    goto/16 :goto_e

    :cond_d
    const-string v0, "\u05a1\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x7317

    const v14, 0x61ab6cc3

    xor-int v15, v11, v14

    const v11, -0x2b523c85

    goto/16 :goto_e

    :sswitch_16
    move-object/from16 v16, v0

    move/from16 v17, v11

    sget-boolean v0, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v0, :cond_e

    :goto_a
    const-string v0, "\u06df\u06d7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x4b

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, 0x550d

    const v14, -0x41aa12cd

    xor-int v15, v11, v14

    const v11, -0x4a2850d2

    goto/16 :goto_e

    :cond_e
    const-string v0, "\u1a73\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, -0x59

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, 0x3387

    const v14, -0x2592651c

    xor-int v15, v11, v14

    const v11, 0x635b7b1a

    goto/16 :goto_e

    :sswitch_17
    move-object/from16 v16, v0

    move/from16 v17, v11

    sget-boolean v0, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v0, :cond_f

    goto/16 :goto_d

    :cond_f
    const-string v0, "\u06db\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, 0x23

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, -0x7c5

    const v14, -0x492d732c

    xor-int v15, v11, v14

    const v11, -0x3b82ca77

    goto/16 :goto_e

    :sswitch_18
    move-object/from16 v16, v0

    move/from16 v17, v11

    .line 40
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v0

    if-nez v0, :cond_10

    :goto_b
    const-string v0, "\u06e8\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x3b

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, 0x6415

    const v14, 0x50744b6f

    xor-int v15, v11, v14

    const v11, 0x360c71cc

    goto/16 :goto_e

    :cond_10
    const-string v0, "\u06eb\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x59e1

    const v14, 0x66710563

    xor-int v15, v11, v14

    const v11, -0x57a374bf

    goto :goto_e

    :sswitch_19
    move-object/from16 v16, v0

    move/from16 v17, v11

    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_11

    :goto_c
    const-string v0, "\u1a79\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, -0x39cd

    const v14, 0x72238d18

    xor-int v15, v11, v14

    const v11, 0x15bc8cb8

    goto :goto_e

    :cond_11
    const-string v0, "\u1a73\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x19

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, -0x1a73

    const v14, 0x6569ef1c

    xor-int v15, v11, v14

    const v11, -0x61bb8824

    goto :goto_e

    :sswitch_1a
    move-object/from16 v16, v0

    move/from16 v17, v11

    sget-object v3, Ll/᩺ܺۘ;->ܺܰۨ:[S

    .line 84
    sget v0, Ll/֫;->ܶܺ᩻:I

    if-ltz v0, :cond_12

    :goto_d
    const-string v0, "\u1a76\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x7d

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x5e99

    const v14, -0x3f2d7df4

    xor-int v15, v11, v14

    const v11, 0x5d2df0b0

    goto :goto_e

    :cond_12
    const-string v0, "\u1a7a\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, -0x71

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, 0x649

    const v14, 0x650ad

    xor-int v15, v11, v14

    const v11, 0x5d0dda3a

    :goto_e
    xor-int v14, v0, v11

    move-object/from16 v0, v16

    :goto_f
    move/from16 v11, v17

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ff95991 -> :sswitch_10
        -0x75b1d494 -> :sswitch_e
        -0x737fc67e -> :sswitch_13
        -0x70dd5acd -> :sswitch_1
        -0x6faa1018 -> :sswitch_10
        -0x6dafbc28 -> :sswitch_2
        -0x6b83c2f9 -> :sswitch_9
        -0x63ee2f99 -> :sswitch_8
        -0x619d60d8 -> :sswitch_14
        -0x5f02385d -> :sswitch_0
        -0x5e1bc248 -> :sswitch_15
        -0x5dfdcb80 -> :sswitch_b
        -0x5d16f7cf -> :sswitch_19
        -0x5cee208d -> :sswitch_1a
        -0x58b02ed6 -> :sswitch_4
        -0x579b4eac -> :sswitch_9
        -0x4da77097 -> :sswitch_3
        -0x4c823e6d -> :sswitch_7
        -0x45cdd929 -> :sswitch_8
        -0x3e316262 -> :sswitch_11
        -0x3ca5bdcd -> :sswitch_16
        -0x3754abc5 -> :sswitch_14
        -0x356060a6 -> :sswitch_f
        -0x2d4b5526 -> :sswitch_3
        -0x2a7eb71d -> :sswitch_19
        -0x231d5d91 -> :sswitch_c
        -0x1e53d73e -> :sswitch_0
        -0x187f9a68 -> :sswitch_18
        -0x17cbd0db -> :sswitch_5
        -0xa3b7e33 -> :sswitch_5
        -0x9ad98bc -> :sswitch_a
        -0x5e96410 -> :sswitch_b
        -0x356b733 -> :sswitch_1
        -0x697b70 -> :sswitch_c
        0x3a32e5 -> :sswitch_17
        0x890cc7 -> :sswitch_6
        0x4fd5b61 -> :sswitch_f
        0x102cf1c6 -> :sswitch_e
        0x113835c3 -> :sswitch_18
        0x13b58d5a -> :sswitch_13
        0x1a1a3316 -> :sswitch_12
        0x1aac45ed -> :sswitch_17
        0x2cb734fd -> :sswitch_4
        0x379a0d87 -> :sswitch_a
        0x3d97cbd5 -> :sswitch_7
        0x461a3ad7 -> :sswitch_d
        0x49c85f8e -> :sswitch_d
        0x4f3fd552 -> :sswitch_1a
        0x5600de5b -> :sswitch_6
        0x58f26d95 -> :sswitch_16
        0x60d7d428 -> :sswitch_11
        0x6c79719a -> :sswitch_2
        0x7c13291e -> :sswitch_15
        0x7fd23371 -> :sswitch_12
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

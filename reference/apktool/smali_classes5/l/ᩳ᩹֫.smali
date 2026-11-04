.class public final Ll/ᩳ᩹֫;
.super Ll/ۧᩳ᩷;
.source "X2T2"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ֡᩷ܽ:[S


# instance fields
.field public ܰ:Landroid/widget/ProgressBar;

.field public final synthetic ܿ:Ll/ۢ᩹֫;

.field public ᩶:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩳ᩹֫;->֡᩷ܽ:[S

    return-void

    :array_0
    .array-data 2
        0x19cds
        0x1780s
        0x200bs
        -0xc6fs
        0x37b0s
        0x3bb2s
        -0x922s
        0x961s
        0x7050s
        -0x77eds
        -0x4424s
    .end array-data
.end method

.method public constructor <init>(Ll/ۢ᩹֫;Landroid/view/View;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v13, -0x302ec15

    sget v14, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v15, Ll/֫֨;->᩶ܺۡ:I

    sget-object v16, Ll/ᩳ᩹֫;->֡᩷ܽ:[S

    const/16 v17, 0x0

    aget-short v16, v16, v17

    mul-int/lit8 v17, v16, 0x2

    add-int/lit8 v17, v17, 0x1

    add-int/lit8 v16, v16, 0x1

    mul-int v16, v16, v16

    sub-int v17, v17, v16

    if-lez v17, :cond_0

    const/16 v16, 0x5cad

    move-object/from16 v3, p1

    const/16 v2, 0x5cad

    goto :goto_0

    :cond_0
    const/16 v16, 0x6fd8

    move-object/from16 v3, p1

    const/16 v2, 0x6fd8

    .line 472
    :goto_0
    iput-object v3, v0, Ll/ᩳ᩹֫;->ܿ:Ll/ۢ᩹֫;

    .line 473
    invoke-direct {v0, v1}, Ll/ۧᩳ᩷;-><init>(Landroid/view/View;)V

    const-string v3, "\u06d6\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v14

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v15

    mul-int/lit16 v4, v4, -0x6061

    const v19, 0x27be09

    xor-int v4, v4, v19

    const v19, -0x59c1d4bd

    xor-int v3, v3, v19

    move v5, v4

    move-object/from16 v19, v7

    move-object v11, v10

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const v17, -0x302ec15

    const/16 v18, 0x0

    move v4, v3

    const/4 v3, 0x0

    :goto_1
    xor-int v8, v17, v15

    mul-int/lit16 v8, v8, 0x2e23

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v5, v8

    xor-int v17, v4, v5

    sparse-switch v17, :sswitch_data_0

    .line 475
    invoke-static {v11, v12, v13, v2}, Ll/֨ܿ;->᩻ۢ۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    .line 96
    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v4, :cond_4

    goto/16 :goto_4

    .line 27
    :sswitch_0
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-gez v4, :cond_c

    :cond_1
    move-object/from16 v4, v19

    goto/16 :goto_5

    .line 160
    :sswitch_1
    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_1

    :cond_2
    :goto_2
    move-object/from16 v4, v19

    goto/16 :goto_6

    :sswitch_2
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-nez v4, :cond_2

    goto :goto_3

    .line 165
    :sswitch_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    goto :goto_3

    .line 301
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 476
    :sswitch_5
    move-object/from16 v1, v18

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Ll/ᩳ᩹֫;->᩶:Landroid/widget/TextView;

    return-void

    :sswitch_6
    const v4, 0x7e5cb676

    xor-int/2addr v4, v7

    invoke-static {v1, v4}, Ll/ۗܰ;->۟᩻֨(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v18

    .line 67
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_3

    :goto_3
    const-string v4, "\u1a79\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v15

    xor-int v5, v4, v14

    mul-int/lit16 v5, v5, -0x5647

    const v8, -0x5b606f11

    xor-int/2addr v5, v8

    const v8, 0x495afbca    # 896956.6f

    goto/16 :goto_9

    :cond_3
    const-string v4, "\u06eb\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v14

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v15

    mul-int/lit16 v5, v5, 0x5347

    const v8, -0x6f86c268

    xor-int/2addr v5, v8

    const v8, -0x7decb21b

    goto/16 :goto_9

    :cond_4
    const-string v4, "\u06d8\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v15, v4

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v14

    mul-int/lit16 v5, v5, -0xcf5

    const v8, 0x3521c3da

    xor-int/2addr v5, v8

    const v8, -0x24b78eda

    goto/16 :goto_9

    .line 475
    :sswitch_7
    sget-object v11, Ll/ᩳ᩹֫;->֡᩷ܽ:[S

    const/4 v12, 0x4

    const/4 v13, 0x3

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v4

    if-gtz v4, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v4, "\u06e8\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v15

    mul-int/lit8 v4, v4, 0x2d

    xor-int v5, v4, v14

    mul-int/lit16 v5, v5, -0x212f

    const v8, 0x71b3cb54

    xor-int/2addr v5, v8

    const v8, -0x314f7b81

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v4, v16

    check-cast v4, Landroid/widget/ProgressBar;

    iput-object v4, v0, Ll/ᩳ᩹֫;->ܰ:Landroid/widget/ProgressBar;

    .line 453
    sget v4, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v4, :cond_6

    :goto_4
    const-string v4, "\u06d9\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v14

    xor-int v5, v4, v15

    mul-int/lit16 v5, v5, -0x11bf

    const v8, -0x11ca6bc3

    xor-int/2addr v5, v8

    const v8, -0x630d7f40

    goto/16 :goto_9

    :cond_6
    const-string v4, "\u0730\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v14

    xor-int v5, v4, v15

    mul-int/lit16 v5, v5, 0x125d

    const v8, -0x35f1faa5

    xor-int/2addr v5, v8

    const v8, -0x62b61ce0

    goto/16 :goto_9

    .line 475
    :sswitch_9
    invoke-static {v1, v3}, Ll/ۖᩳ;->֨۬᩺(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v16

    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_7

    goto/16 :goto_8

    :cond_7
    const-string v4, "\u06d8\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v14

    xor-int v5, v4, v15

    mul-int/lit16 v5, v5, -0x49e5

    const v8, -0x611d77c7

    xor-int/2addr v5, v8

    const v8, -0x472102ff

    goto/16 :goto_9

    :sswitch_a
    const v3, 0x7ec40d8a

    xor-int/2addr v3, v6

    .line 37
    sget v4, Ll/۬;->᩸ۜ᩹:I

    if-eqz v4, :cond_8

    goto/16 :goto_2

    :cond_8
    const-string v4, "\u1a77\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v15

    xor-int v5, v4, v14

    mul-int/lit16 v5, v5, 0x1747

    const v8, 0x34100c78

    xor-int/2addr v5, v8

    const v8, 0x96f3789

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v4, v19

    .line 474
    invoke-static {v4, v9, v10, v2}, Ll/ۗ֡;->ۘ᩺ۘ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v5

    if-eqz v5, :cond_9

    :goto_5
    const-string v5, "\u06e2\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v15

    xor-int v8, v5, v14

    mul-int/lit16 v8, v8, 0x525d

    const v19, -0x42d0fecb

    xor-int v8, v8, v19

    const v19, 0x7bfcca93

    goto :goto_7

    :cond_9
    const-string v5, "\u06d6\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v15

    mul-int/lit8 v5, v5, 0x5d

    xor-int v8, v5, v14

    mul-int/lit16 v8, v8, 0x41f5

    const v19, -0x64bf249e

    xor-int v8, v8, v19

    const v19, -0x47013a8c

    goto :goto_7

    :sswitch_c
    move-object/from16 v4, v19

    const/4 v10, 0x3

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v5

    if-nez v5, :cond_a

    :goto_6
    const-string v5, "\u0736\u06e0"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v14

    mul-int/lit8 v5, v5, 0x21

    xor-int v8, v5, v15

    mul-int/lit16 v8, v8, -0x7315

    const v19, -0x13cdb9c6

    xor-int v8, v8, v19

    const v19, -0x4cc2833f

    goto :goto_7

    :cond_a
    const-string v5, "\u06e4\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v14

    mul-int/lit8 v5, v5, 0x77

    xor-int v8, v5, v15

    mul-int/lit16 v8, v8, -0x4b87

    const v19, 0x6ae0f62f

    xor-int v8, v8, v19

    const v19, -0xbe2b7d9

    goto :goto_7

    :sswitch_d
    move-object/from16 v4, v19

    const/4 v9, 0x1

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v5

    if-eqz v5, :cond_b

    move-object/from16 v19, v4

    goto :goto_8

    :cond_b
    const-string v5, "\u06e4\u06ec"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v14, v5

    mul-int/lit8 v5, v5, -0x3d

    xor-int v8, v5, v15

    mul-int/lit16 v8, v8, -0x5bbd

    const v19, -0x2c3d137b

    xor-int v8, v8, v19

    const v19, 0x1b0c3e87

    :goto_7
    xor-int v5, v5, v19

    move-object/from16 v19, v4

    move v4, v5

    move v5, v8

    goto/16 :goto_1

    :sswitch_e
    invoke-static {v1, v0}, Ll/ۖۗ;->᩵ܰܶ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v19, Ll/ᩳ᩹֫;->֡᩷ܽ:[S

    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_d

    :cond_c
    :goto_8
    const-string v4, "\u05a8\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v14, v4

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v15

    mul-int/lit16 v5, v5, 0x64f5

    const v8, -0x93b0b71

    xor-int/2addr v5, v8

    const v8, 0x6f524309

    goto :goto_9

    :cond_d
    const-string v4, "\u05ab\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v15

    xor-int v5, v4, v14

    mul-int/lit16 v5, v5, 0x5171

    const v8, 0x6ed89b18

    xor-int/2addr v5, v8

    const v8, 0x3e419786

    :goto_9
    xor-int/2addr v4, v8

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f86134a -> :sswitch_a
        -0x79d2988f -> :sswitch_8
        -0x708ad2e4 -> :sswitch_7
        -0x6b0d1fb3 -> :sswitch_1
        -0x609d0a48 -> :sswitch_5
        -0x5dfee529 -> :sswitch_0
        -0x5c45a4f8 -> :sswitch_7
        -0x51b8f863 -> :sswitch_4
        -0x51aa0b75 -> :sswitch_3
        -0x4b385436 -> :sswitch_2
        -0x48e72fef -> :sswitch_6
        -0x4898b002 -> :sswitch_b
        -0x4760d48a -> :sswitch_6
        -0xeb03922 -> :sswitch_d
        -0xb848ee4 -> :sswitch_1
        -0x6e93ede -> :sswitch_3
        0x5dcd37 -> :sswitch_9
        0xe5524e -> :sswitch_0
        0x16bf714 -> :sswitch_2
        0x1613c01a -> :sswitch_e
        0x1b31c60f -> :sswitch_c
        0x1c8dc9cb -> :sswitch_b
        0x300e52c4 -> :sswitch_a
        0x31804cfb -> :sswitch_c
        0x321d40d9 -> :sswitch_8
        0x33ce21fb -> :sswitch_4
        0x44d6c0b8 -> :sswitch_d
        0x73fbed78 -> :sswitch_9
        0x7583e79f -> :sswitch_5
        0x7d5e6345 -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 21

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

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, -0xf5654d

    sget v17, Ll/ۖ֨;->֨ۨۧ:I

    sget v18, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v19, "\u06d7\u1a76"

    invoke-static/range {v19 .. v19}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v17

    xor-int v1, v19, v18

    mul-int/lit16 v1, v1, -0x569d

    const v20, -0x6c68691f

    xor-int v1, v1, v20

    const v20, 0x80bffdc

    xor-int v19, v19, v20

    move-object v3, v2

    move-object/from16 p1, v5

    move-object v14, v13

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v20, 0x0

    :goto_0
    xor-int v7, v16, v18

    mul-int/lit16 v7, v7, 0x2489

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v1, v7

    xor-int v16, v19, v1

    sparse-switch v16, :sswitch_data_0

    aget-short v8, p1, v20

    const/4 v9, 0x2

    .line 5
    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v1, :cond_a

    goto/16 :goto_8

    :sswitch_0
    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v1, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v1, p1

    goto/16 :goto_6

    :cond_1
    const-string v1, "\u06ec\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x19

    xor-int v7, v1, v18

    mul-int/lit16 v7, v7, 0x1e8f

    const v19, -0x956cbe7

    xor-int v7, v7, v19

    const v19, 0x13a295f9

    goto/16 :goto_5

    .line 214
    :sswitch_1
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v1

    if-gtz v1, :cond_0

    goto/16 :goto_8

    .line 25
    :sswitch_2
    sget-boolean v1, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v1, :cond_d

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    goto :goto_2

    .line 96
    :sswitch_4
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    return-void

    :sswitch_5
    xor-int v1, v4, v5

    .line 483
    invoke-static {v3, v1}, Ll/֫ܺ;->۠֫ۖ(Ljava/lang/Object;I)V

    .line 484
    invoke-static {v2}, Ll/ۢ᩹֫;->ܰ(Ll/ۢ᩹֫;)V

    goto/16 :goto_3

    .line 483
    :sswitch_6
    invoke-static {v14, v15, v6, v13}, Ll/ܽ;->᩷ܰۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    const v5, 0x7d26ea43

    .line 335
    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v1, :cond_2

    :goto_2
    const-string v1, "\u1a73\u0730"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x69

    xor-int v7, v1, v18

    mul-int/lit16 v7, v7, 0x4a07

    const v19, 0x42d9e838

    xor-int v7, v7, v19

    const v19, 0x2a933c82

    goto/16 :goto_5

    :cond_2
    const-string v1, "\u06d6\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v7, v1, v17

    mul-int/lit16 v7, v7, 0x1ae7

    const v19, 0x3e657775

    xor-int v7, v7, v19

    const v19, -0x7ac851f9

    goto/16 :goto_5

    .line 483
    :sswitch_7
    sget-object v14, Ll/ᩳ᩹֫;->֡᩷ܽ:[S

    const/16 v15, 0x8

    const/4 v6, 0x3

    .line 24
    sget-boolean v1, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v1, :cond_3

    goto/16 :goto_8

    :cond_3
    const-string v1, "\u06e4\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x7f

    xor-int v7, v1, v18

    mul-int/lit16 v7, v7, 0x1c07

    const v19, 0x3d5ee539

    xor-int v7, v7, v19

    const v19, -0x68718e30

    goto/16 :goto_5

    .line 483
    :sswitch_8
    iget-object v3, v0, Ll/ᩳ᩹֫;->᩶:Landroid/widget/TextView;

    sget v1, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v1, :cond_4

    goto/16 :goto_1

    :cond_4
    const-string v1, "\u06eb\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v7, v1, v17

    mul-int/lit16 v7, v7, -0x7787

    const v19, 0x22108250

    xor-int v7, v7, v19

    const v19, 0x58888030

    goto/16 :goto_5

    .line 482
    :sswitch_9
    iget-object v1, v0, Ll/ᩳ᩹֫;->ܰ:Landroid/widget/ProgressBar;

    const/4 v7, 0x0

    invoke-static {v1, v7}, Ll/ۖۜ;->᩸᩷᩶(Ljava/lang/Object;I)V

    sget v1, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v1, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v1, "\u06e1\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v7, v1, v18

    mul-int/lit16 v7, v7, -0xcef

    const v19, -0x4323edf1

    xor-int v7, v7, v19

    const v19, -0x44e331aa

    goto/16 :goto_5

    .line 481
    :sswitch_a
    invoke-static {v2}, Ll/ۢ᩹֫;->ܽ(Ll/ۢ᩹֫;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "\u1a76\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x3

    xor-int v7, v1, v18

    mul-int/lit16 v7, v7, -0x1647

    const v19, -0x5274ea58

    xor-int v7, v7, v19

    const v19, -0x4d3f5679

    goto/16 :goto_5

    :sswitch_b
    return-void

    :sswitch_c
    iget-object v2, v0, Ll/ᩳ᩹֫;->ܿ:Ll/ۢ᩹֫;

    invoke-static {v2}, Ll/ۢ᩹֫;->᩹(Ll/ۢ᩹֫;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "\u06d9\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x4f

    xor-int v7, v1, v17

    mul-int/lit16 v7, v7, -0x25af

    const v19, 0x6c86e423

    xor-int v7, v7, v19

    const v19, -0x6ac3e4c2

    goto/16 :goto_5

    :cond_6
    :goto_3
    const-string v1, "\u0733\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0xb

    xor-int v7, v1, v18

    mul-int/lit16 v7, v7, 0x1553

    const v19, 0x66533467

    xor-int v7, v7, v19

    const v19, 0x4cfc2c59    # 1.322114E8f

    goto/16 :goto_5

    :sswitch_d
    const/16 v1, 0x34b7

    const/16 v13, 0x34b7

    goto :goto_4

    :sswitch_e
    const v1, 0xe2a5

    const v13, 0xe2a5

    :goto_4
    const-string v1, "\u06e2\u073a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v7, v1, v17

    mul-int/lit16 v7, v7, -0x4c79

    const v19, 0xf407c90

    xor-int v7, v7, v19

    const v19, 0x5ad24298

    goto/16 :goto_5

    :sswitch_f
    add-int v1, v8, v12

    mul-int v1, v1, v1

    sub-int/2addr v1, v11

    if-gez v1, :cond_7

    const-string v1, "\u05a8\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v7, v1, v18

    mul-int/lit16 v7, v7, -0x63ab

    const v19, -0x186275ef

    xor-int v7, v7, v19

    const v19, -0x674f8e17

    goto/16 :goto_5

    :cond_7
    const-string v1, "\u05ab\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0xf

    xor-int v7, v1, v17

    mul-int/lit16 v7, v7, 0x547

    const v19, 0x789f257d

    xor-int v7, v7, v19

    const v19, 0x3eaf6802

    goto/16 :goto_5

    :sswitch_10
    add-int/lit8 v11, v10, 0x1

    const/4 v12, 0x1

    .line 352
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v1

    if-nez v1, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u1a7b\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x2b

    xor-int v7, v1, v18

    mul-int/lit16 v7, v7, 0x6db1

    const v19, -0x3077b1e1

    xor-int v7, v7, v19

    const v19, 0x50eb520

    goto :goto_5

    :sswitch_11
    mul-int v10, v8, v9

    .line 442
    sget v1, Ll/ۧ;->ۨۗܰ:I

    if-ltz v1, :cond_9

    const-string v1, "\u06da\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v7, v1, v17

    mul-int/lit16 v7, v7, -0x14d7

    const v19, 0x13dfe56b

    xor-int v7, v7, v19

    const v19, -0x56a5752d

    goto :goto_5

    :cond_9
    const-string v1, "\u06e7\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x17

    xor-int v7, v1, v17

    mul-int/lit16 v7, v7, 0x66ab

    const v19, 0x1345124e

    xor-int v7, v7, v19

    const v19, -0x3e687c38

    goto :goto_5

    :cond_a
    const-string v1, "\u0730\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v7, v1, v17

    mul-int/lit16 v7, v7, 0x6c1f

    const v19, -0x5192f3c3

    xor-int v7, v7, v19

    const v19, -0x62acf422

    goto :goto_5

    :sswitch_12
    const/16 v20, 0x7

    .line 467
    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v1, :cond_b

    goto :goto_8

    :cond_b
    const-string v1, "\u073d\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v7, v1, v18

    mul-int/lit16 v7, v7, -0xcb

    const v19, -0x3011d10

    xor-int v7, v7, v19

    const v19, -0x7342f6cd

    :goto_5
    xor-int v19, v1, v19

    goto :goto_7

    :sswitch_13
    sget-object v1, Ll/ᩳ᩹֫;->֡᩷ܽ:[S

    .line 79
    sget v7, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v7, :cond_c

    :goto_6
    const-string v7, "\u06ec\u1a7b"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int v7, v7, v18

    mul-int/lit8 v7, v7, 0x71

    xor-int v0, v7, v17

    mul-int/lit16 v0, v0, -0x4443

    const v19, 0x9480cbd

    xor-int v0, v0, v19

    const v19, 0x29930ecf

    xor-int v19, v7, v19

    move-object/from16 p1, v1

    move v1, v0

    goto :goto_a

    :cond_c
    const-string v0, "\u06e4\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x39

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, 0x6471

    const v19, 0x78379184

    xor-int v7, v7, v19

    const v19, 0x37cb65d5

    xor-int v19, v0, v19

    move-object/from16 v0, p0

    move-object/from16 p1, v1

    :goto_7
    move v1, v7

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v0

    if-nez v0, :cond_e

    :cond_d
    :goto_8
    const-string v0, "\u06d9\u05a1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x31

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x6697

    const v7, -0x2c6b4855

    xor-int/2addr v1, v7

    const v7, -0x32026943

    goto :goto_9

    :cond_e
    const-string v0, "\u073f\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x7c0d

    const v7, 0x6e6ab02c

    xor-int/2addr v1, v7

    const v7, -0x10fe9f77

    :goto_9
    xor-int v19, v0, v7

    :goto_a
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78cc6726 -> :sswitch_b
        -0x7206117c -> :sswitch_0
        -0x62645ce1 -> :sswitch_b
        -0x5e6b008a -> :sswitch_5
        -0x464c73dc -> :sswitch_11
        -0x460fae84 -> :sswitch_11
        -0x458ef204 -> :sswitch_6
        -0x44ef58e5 -> :sswitch_1
        -0x31832130 -> :sswitch_3
        -0x2fb823e7 -> :sswitch_7
        -0x2b3b343b -> :sswitch_6
        -0x2408dcfe -> :sswitch_a
        -0x21c6e506 -> :sswitch_14
        -0x21b67c2c -> :sswitch_a
        -0x1b6d1810 -> :sswitch_13
        -0x6a7cf95 -> :sswitch_1
        -0x46d6423 -> :sswitch_10
        0x7764e -> :sswitch_f
        0x522b12b -> :sswitch_2
        0xc5fabe6 -> :sswitch_4
        0x126f485a -> :sswitch_f
        0x1b233178 -> :sswitch_e
        0x1f606519 -> :sswitch_12
        0x252000a2 -> :sswitch_14
        0x304cd90d -> :sswitch_9
        0x32df62b0 -> :sswitch_e
        0x393390cc -> :sswitch_13
        0x3ba1e21b -> :sswitch_5
        0x4c2d49ad -> :sswitch_d
        0x4d43a458 -> :sswitch_12
        0x4e82cc8c -> :sswitch_d
        0x51220c42 -> :sswitch_9
        0x5f17de49 -> :sswitch_c
        0x646b32d7 -> :sswitch_3
        0x680992fc -> :sswitch_8
        0x6d2e2ab6 -> :sswitch_8
        0x74a3b8ec -> :sswitch_10
        0x7508a8d1 -> :sswitch_0
        0x7c2bcfcd -> :sswitch_7
        0x7c3c86c9 -> :sswitch_4
        0x7e712115 -> :sswitch_c
        0x7fefc31f -> :sswitch_2
    .end sparse-switch
.end method

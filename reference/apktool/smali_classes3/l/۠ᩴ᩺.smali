.class public final Ll/۠ᩴ᩺;
.super Ljava/lang/Object;
.source "V4FO"


# static fields
.field public static ۖ:I

.field public static final ۙ:Ljava/util/Random;

.field public static final ۚ:Ll/ۚ᩷᩺;

.field public static final ۨ:Ll/ۚ᩷᩺;

.field public static final ܰ:[C

.field public static ᩹:Ll/ܿ۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x1bc2d185    # 3.2230007E-22f

    sget v8, Ll/֨᩺;->۬᩺ܰ:I

    sget v9, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v10, "\u06eb\u06e1"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x57

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5841

    const v12, 0xb4b4a54

    xor-int/2addr v11, v12

    const v12, -0x2773d73d

    :goto_0
    xor-int/2addr v10, v12

    move-object v12, v3

    :goto_1
    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, 0x7591

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    const/16 v10, 0x1008

    .line 269
    invoke-static {v2, v10, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v10, 0x1005

    .line 270
    invoke-static {v2, v10, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 189
    sget v10, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v10, :cond_8

    goto/16 :goto_3

    .line 122
    :sswitch_0
    sget v10, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v10, :cond_4

    goto :goto_2

    .line 227
    :sswitch_1
    sget-boolean v10, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v10, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_2
    const-string v10, "\u0736\u0733"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x35

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x69f7

    const v13, 0x5b977b8c

    xor-int/2addr v11, v13

    const v13, -0x49055487

    goto/16 :goto_5

    .line 116
    :sswitch_2
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget v10, Ll/֫ۚ;->ܽ۠᩹:I

    if-gez v10, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v10, "\u1a74\u06df"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x47

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2c7d

    const v13, -0x59ede761

    xor-int/2addr v11, v13

    const v13, 0x68963908

    goto/16 :goto_5

    .line 171
    :sswitch_3
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    goto/16 :goto_4

    .line 146
    :sswitch_4
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_5
    const/16 v0, 0x1031

    .line 287
    invoke-static {v2, v0, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v0, 0x1014

    .line 288
    invoke-static {v2, v0, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v0, 0x1027

    .line 289
    invoke-static {v2, v0, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v0, 0x1065

    .line 290
    invoke-static {v2, v0, v12}, Ll/ۖ᩸;->ۛۢ֫(Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    .line 285
    :sswitch_6
    invoke-static {v2, v6, v12}, Ll/ۖ᩸;->ۛۢ֫(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v10, 0x1030

    .line 286
    invoke-static {v2, v10, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 106
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v10

    if-nez v10, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v10, "\u1a76\u0736"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x45

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x21b9

    const v13, 0x4f84feaf

    xor-int/2addr v11, v13

    const v13, 0x38aa5b40

    goto/16 :goto_5

    :sswitch_7
    const/16 v6, 0x1001

    .line 283
    invoke-static {v2, v6, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v6, 0x1028

    .line 284
    invoke-static {v2, v6, v12}, Ll/ۖ᩸;->ۛۢ֫(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v6, 0x1029

    const-string v10, "\u06eb\u1a73"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x45

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3741

    const v13, -0xc38b762

    xor-int/2addr v11, v13

    const v13, -0x63fa3cf9

    goto/16 :goto_5

    .line 281
    :sswitch_8
    invoke-static {v2, v5, v12}, Ll/ۖ᩸;->ۛۢ֫(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v10, 0x1106

    .line 282
    invoke-static {v2, v10, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 175
    sget-boolean v10, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v10, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v10, "\u073f\u06db"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x31

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7eef

    const v13, -0x2dd1dde8

    xor-int/2addr v11, v13

    const v13, -0x122b6cd3

    goto/16 :goto_5

    :sswitch_9
    const/16 v5, 0x1102

    .line 279
    invoke-static {v2, v5, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v5, 0x1101

    .line 280
    invoke-static {v2, v5, v12}, Ll/ۖ᩸;->ۛۢ֫(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v5, 0x1105

    const-string v10, "\u0736\u1a77"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x4b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3e9d

    const v13, 0x29b4e4fa

    xor-int/2addr v11, v13

    const v13, -0x7fa69502

    goto/16 :goto_5

    :sswitch_a
    const/16 v10, 0x1100

    .line 277
    invoke-static {v2, v10, v12}, Ll/ۖ᩸;->ۛۢ֫(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v10, 0x1103

    .line 278
    invoke-static {v2, v10, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 73
    sget v10, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v10, :cond_5

    :cond_4
    const-string v10, "\u1a73\u06d7"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x6d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7e51

    const v13, -0x4ff5aaed

    xor-int/2addr v11, v13

    const v13, 0x7bece49e

    goto/16 :goto_5

    :cond_5
    const-string v10, "\u06e7\u06dc"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1e5f

    const v13, -0x57b446dc

    xor-int/2addr v11, v13

    const v13, -0x1fa3ac14

    goto/16 :goto_5

    .line 274
    :sswitch_b
    invoke-static {v2, v4, v12}, Ll/ۖ᩸;->ۛۢ֫(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v10, 0x1037

    .line 275
    invoke-static {v2, v10, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v10, 0x1003

    .line 276
    invoke-static {v2, v10, v12}, Ll/ۖ᩸;->ۛۢ֫(Ljava/lang/Object;ILjava/lang/Object;)V

    sget v10, Ll/۟;->ۨᩴۛ:I

    if-ltz v10, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v10, "\u06e1\u06d8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x41

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0xc23

    const v13, -0x2733ae39

    xor-int/2addr v11, v13

    const v13, 0x74f2ec1e

    goto/16 :goto_5

    :sswitch_c
    const/16 v4, 0x1039

    .line 271
    invoke-static {v2, v4, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v4, 0x1041

    .line 272
    invoke-static {v2, v4, v12}, Ll/ۖ᩸;->ۛۢ֫(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v4, 0x1040

    .line 273
    invoke-static {v2, v4, v12}, Ll/ۖ᩸;->ۛۢ֫(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v4, 0x1042

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v10

    if-eqz v10, :cond_7

    goto :goto_3

    :cond_7
    const-string v10, "\u06e4\u073d"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x59

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4bab

    const v13, -0x5af27452

    xor-int/2addr v11, v13

    const v13, -0x35622038    # -5173220.0f

    goto/16 :goto_5

    :cond_8
    const-string v10, "\u06e8\u1a76"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x11f

    const v13, -0x45f3bfe8

    xor-int/2addr v11, v13

    const v13, 0x5dbf7a89

    goto/16 :goto_5

    .line 24
    :sswitch_d
    sput-object v1, Ll/۠ᩴ᩺;->ۨ:Ll/ۚ᩷᩺;

    .line 25
    new-instance v2, Ll/ۚ᩷᩺;

    .line 3
    invoke-direct {v2}, Ljava/lang/ThreadLocal;-><init>()V

    .line 25
    sput-object v2, Ll/۠ᩴ᩺;->ۚ:Ll/ۚ᩷᩺;

    .line 260
    new-instance v2, Ll/ܿ۠;

    invoke-direct {v2}, Ll/ܿ۠;-><init>()V

    sput-object v2, Ll/۠ᩴ᩺;->᩹:Ll/ܿ۠;

    .line 263
    new-instance v12, Ll/ܶᩴ᩺;

    .line 167
    sget-boolean v10, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v10, :cond_9

    goto :goto_3

    .line 263
    :cond_9
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    const/16 v10, 0x1017

    .line 267
    invoke-static {v2, v10, v12}, Ll/֨ܰ;->ܰ᩺ܺ(Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v10, 0x1004

    .line 268
    invoke-static {v2, v10, v12}, Ll/ۖ᩸;->ۛۢ֫(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 250
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v10

    if-eqz v10, :cond_a

    :goto_3
    const-string v10, "\u06d7\u06e0"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x1b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x473b

    const v12, 0x157bd694

    xor-int/2addr v11, v12

    const v12, -0xa1edbbf

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u06e1\u06ec"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2ea3

    const v13, -0x204a71af

    xor-int/2addr v11, v13

    const v13, -0x78248b40

    goto :goto_5

    .line 23
    :sswitch_e
    fill-array-data v0, :array_0

    sput-object v0, Ll/۠ᩴ᩺;->ܰ:[C

    .line 24
    new-instance v1, Ll/ۚ᩷᩺;

    .line 3
    invoke-direct {v1}, Ljava/lang/ThreadLocal;-><init>()V

    sget v10, Ll/֫;->ܶܺ᩻:I

    if-ltz v10, :cond_b

    goto :goto_4

    :cond_b
    const-string v10, "\u1a77\u06e2"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3629

    const v13, 0xeea1690

    xor-int/2addr v11, v13

    const v13, 0xd1b0a4c

    goto :goto_5

    .line 22
    :sswitch_f
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Ll/۠ᩴ᩺;->ۙ:Ljava/util/Random;

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 45
    sget v10, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v10, :cond_c

    :goto_4
    const-string v10, "\u0733\u073f"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x29c5

    const v13, 0x653b8007

    xor-int/2addr v11, v13

    const v13, -0x4e4039f5

    goto :goto_5

    :cond_c
    const-string v10, "\u0733\u06da"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x6b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7419

    const v13, -0xe5341fc

    xor-int/2addr v11, v13

    const v13, 0x4c77aa6c    # 6.492408E7f

    :goto_5
    xor-int/2addr v10, v13

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7d0d640f -> :sswitch_b
        -0x7be2604e -> :sswitch_9
        -0x77e07c83 -> :sswitch_c
        -0x771c48cc -> :sswitch_3
        -0x63f1e9c0 -> :sswitch_c
        -0x5d54296a -> :sswitch_6
        -0x53a919de -> :sswitch_5
        -0x4f55c355 -> :sswitch_8
        -0x4e746c78 -> :sswitch_5
        -0x489a27d6 -> :sswitch_2
        -0x2ce55e1a -> :sswitch_f
        -0x22563a38 -> :sswitch_d
        -0x16b8a1f6 -> :sswitch_d
        -0x16756ff7 -> :sswitch_8
        -0xfe45c5f -> :sswitch_6
        0x5f47b7d -> :sswitch_e
        0x8b105bf -> :sswitch_0
        0x175f2147 -> :sswitch_0
        0x1c30566e -> :sswitch_7
        0x2d8d4579 -> :sswitch_3
        0x30ed7bf6 -> :sswitch_9
        0x40a3383b -> :sswitch_a
        0x41225873 -> :sswitch_f
        0x586a85ac -> :sswitch_4
        0x5b568fd7 -> :sswitch_e
        0x610ed4a8 -> :sswitch_4
        0x6ae93a0c -> :sswitch_1
        0x719232ed -> :sswitch_b
        0x72971504 -> :sswitch_1
        0x7354f0b4 -> :sswitch_2
        0x76a0c341 -> :sswitch_7
        0x77f64d36 -> :sswitch_a
    .end sparse-switch

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public static ۙ()Ljava/lang/String;
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x2681d721

    sget v8, Ll/ۖۗ;->᩶۫ۗ:I

    sget v9, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v10, "\u1a73\u06d8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x6f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x67e7

    const v12, -0x6c9f3a3

    xor-int/2addr v11, v12

    const v12, -0x62aed848

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, -0x564d

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v10

    if-eqz v10, :cond_9

    goto/16 :goto_4

    .line 6
    :sswitch_0
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v10

    if-nez v10, :cond_c

    goto/16 :goto_4

    :sswitch_1
    sget v10, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v10, :cond_8

    goto :goto_1

    .line 8
    :sswitch_2
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget v10, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v10, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v10, "\u05a8\u1a77"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x55

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2ce9

    const v12, -0x1640b8ce

    xor-int/2addr v11, v12

    const v12, 0x7305da0e

    goto :goto_0

    .line 10
    :sswitch_3
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    :goto_2
    const-string v10, "\u06db\u073f"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x11

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x205

    const v12, 0x3b3b7913

    xor-int/2addr v11, v12

    const v12, -0x5b95ab2b

    goto :goto_0

    .line 44
    :sswitch_4
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    const/4 v0, 0x0

    return-object v0

    .line 48
    :sswitch_5
    aput-char v6, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_3

    :sswitch_6
    invoke-static {v5, v4}, Ljava/lang/Character;->forDigit(II)C

    move-result v6

    .line 46
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v10

    if-eqz v10, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v10, "\u06e0\u1a77"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x51

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6af3

    const v12, 0x9464446

    xor-int/2addr v11, v12

    const v12, -0xc85632a

    goto/16 :goto_0

    .line 48
    :sswitch_7
    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    .line 21
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v10

    if-gtz v10, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v10, "\u073a\u06e8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4589

    const v12, -0x63816dab

    xor-int/2addr v11, v12

    const v12, 0x2b566958

    goto/16 :goto_0

    .line 48
    :sswitch_8
    sget-object v3, Ll/۠ᩴ᩺;->ۙ:Ljava/util/Random;

    const/16 v4, 0x24

    .line 42
    sget v10, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v10, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v10, "\u06d8\u073f"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7349

    const v12, -0x316c5199

    xor-int/2addr v11, v12

    const v12, 0x7921f8a1

    goto/16 :goto_0

    .line 50
    :sswitch_9
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0

    :sswitch_a
    if-ge v2, v0, :cond_4

    const-string v10, "\u06e1\u1a77"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x284b

    const v12, -0x321cc906

    xor-int/2addr v11, v12

    const v12, -0x7957c3cd

    goto/16 :goto_0

    :cond_4
    const-string v10, "\u1a79\u1a74"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x77

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x79cb

    const v12, 0x3fc58193

    xor-int/2addr v11, v12

    const v12, -0x661ad62f

    goto/16 :goto_0

    :sswitch_b
    const/4 v2, 0x0

    :goto_3
    const-string v10, "\u0733\u1a7a"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x1b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x23f3

    const v12, -0x14435271

    xor-int/2addr v11, v12

    const v12, 0xf3e1366

    goto/16 :goto_0

    :sswitch_c
    sget v10, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v10, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v10, "\u0730\u073f"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5095

    const v12, -0xe7c5fa5

    xor-int/2addr v11, v12

    const v12, -0x46d9fe5a

    goto/16 :goto_0

    .line 28
    :sswitch_d
    sget v10, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v10, :cond_6

    goto :goto_5

    :cond_6
    const-string v10, "\u0733\u1a75"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xf1

    const v12, 0x798c71e2

    xor-int/2addr v11, v12

    const v12, -0x56e5e6ed

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v10

    if-eqz v10, :cond_7

    goto :goto_5

    :cond_7
    const-string v10, "\u073f\u0736"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x3c2b

    const v12, 0x4ff8063

    xor-int/2addr v11, v12

    const v12, 0x6a3ab967

    goto/16 :goto_0

    :cond_8
    :goto_4
    const-string v10, "\u06d6\u06da"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x4f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1f2d

    const v12, -0x33862339    # -6.5499932E7f

    xor-int/2addr v11, v12

    const v12, -0x240df60e

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u1a79\u06d6"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6d15

    const v12, 0x9d035ff

    xor-int/2addr v11, v12

    const v12, 0x5ec1ba5

    goto/16 :goto_0

    .line 11
    :sswitch_f
    sget v10, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v10, :cond_a

    :goto_5
    const-string v10, "\u06dc\u1a7a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x79

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x539d

    const v12, -0x31ef54df

    xor-int/2addr v11, v12

    const v12, 0x233ab48e

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u1a74\u1a76"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x7d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x28b1

    const v12, 0x396237c6

    xor-int/2addr v11, v12

    const v12, 0x58cf8d14

    goto/16 :goto_0

    .line 46
    :sswitch_10
    sget-boolean v10, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v10, :cond_b

    goto :goto_6

    :cond_b
    const-string v10, "\u06e7\u06e4"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5a3b

    const v12, -0x57549d4f

    xor-int/2addr v11, v12

    const v12, -0x7f513e8d

    goto/16 :goto_0

    :sswitch_11
    const/16 v0, 0x8

    new-array v1, v0, [C

    .line 43
    sget v10, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v10, :cond_d

    :cond_c
    :goto_6
    const-string v10, "\u06e8\u1a77"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x35

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x56cb

    const v12, 0x300c3c7e

    xor-int/2addr v11, v12

    const v12, -0x390e6f85

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u06e8\u06e2"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x5f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6ed

    const v12, 0x27e10752

    xor-int/2addr v11, v12

    const v12, 0x1ba8d964

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d2bf958 -> :sswitch_b
        -0x72cb3169 -> :sswitch_0
        -0x6c27a172 -> :sswitch_6
        -0x6aeeab42 -> :sswitch_c
        -0x5f57790e -> :sswitch_8
        -0x5d30d367 -> :sswitch_10
        -0x5d2e8cec -> :sswitch_0
        -0x55a6f021 -> :sswitch_d
        -0x5291116e -> :sswitch_11
        -0x4aa981f7 -> :sswitch_6
        -0x46bd8d57 -> :sswitch_7
        -0x3a738e49 -> :sswitch_e
        -0x2cf5f0a2 -> :sswitch_5
        -0x243197af -> :sswitch_9
        -0x15a74813 -> :sswitch_9
        -0x12511325 -> :sswitch_1
        -0xed812cc -> :sswitch_11
        -0xc8fa65f -> :sswitch_f
        0x517673e -> :sswitch_3
        0xd942d3a -> :sswitch_2
        0x12df5f1f -> :sswitch_7
        0x1eaeec11 -> :sswitch_f
        0x25977900 -> :sswitch_4
        0x2c692a79 -> :sswitch_e
        0x318f8130 -> :sswitch_1
        0x371a110e -> :sswitch_c
        0x46cb82ea -> :sswitch_8
        0x4e0be26f -> :sswitch_d
        0x4ef8567b -> :sswitch_3
        0x5af23f58 -> :sswitch_a
        0x5d076bca -> :sswitch_a
        0x64421c4d -> :sswitch_4
        0x68ebb4d3 -> :sswitch_5
        0x7945b6c6 -> :sswitch_b
        0x7ab5efc9 -> :sswitch_2
        0x7f59532f -> :sswitch_10
    .end sparse-switch
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 27

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

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, 0x235ae14b

    sget v22, Ll/֡֡;->᩶ۤ۠:I

    sget v23, Ll/֫ܳ;->᩶ۧۛ:I

    const-string v24, "\u0736\u1a79"

    invoke-static/range {v24 .. v24}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v24

    xor-int v24, v24, v22

    xor-int v0, v24, v23

    mul-int/lit16 v0, v0, -0x6d7f

    const v26, 0x1efdf04b

    xor-int v0, v0, v26

    const v26, 0x32cd37fc

    xor-int v24, v24, v26

    move-object v3, v2

    move-object v6, v5

    move-object v9, v8

    move-object/from16 v18, v17

    move/from16 v25, v24

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v24, 0x235ae14b

    const/16 v26, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v4, v24, v23

    mul-int/lit16 v4, v4, -0x4ea3

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v24, v25, v0

    sparse-switch v24, :sswitch_data_0

    .line 27
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v0

    if-eqz v0, :cond_a

    goto/16 :goto_5

    .line 28
    :sswitch_0
    sget v0, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v0, :cond_6

    goto/16 :goto_1

    :sswitch_1
    sget v0, Ll/֡ۛ;->۬᩸ܶ:I

    if-nez v0, :cond_3

    goto/16 :goto_4

    .line 17
    :sswitch_2
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    const/4 v0, 0x0

    return-object v0

    .line 39
    :sswitch_4
    aget-char v0, v18, v21

    aput-char v0, v9, v15

    add-int/lit8 v12, v12, 0x1

    move/from16 v14, v20

    goto/16 :goto_3

    :sswitch_5
    and-int/lit8 v21, v13, 0xf

    .line 8
    sget v0, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "\u05a8\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x6f

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, -0x2b49

    const v25, -0x10645cd9

    xor-int v4, v4, v25

    const v25, 0x49c138c0    # 1582872.0f

    goto/16 :goto_8

    .line 38
    :sswitch_6
    aput-char v19, v9, v14

    add-int/lit8 v20, v14, 0x2

    sget v0, Ll/֨ۧ;->֫۠֡:I

    if-gtz v0, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v0, "\u1a76\u06df"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x67

    xor-int v4, v0, v23

    mul-int/lit16 v4, v4, -0x43bd

    const v25, 0x6f15e9f3

    xor-int v4, v4, v25

    const v25, 0x49ba2276    # 1524814.8f

    goto/16 :goto_8

    :sswitch_7
    aget-char v19, v18, v17

    .line 3
    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_2

    goto/16 :goto_7

    :cond_2
    const-string v0, "\u1a78\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, -0x4049

    const v25, 0x53f5d78b

    xor-int v4, v4, v25

    const v25, 0x6be7e3f0

    goto/16 :goto_8

    :sswitch_8
    and-int/lit8 v17, v16, 0xf

    .line 38
    sget-object v18, Ll/۠ᩴ᩺;->ܰ:[C

    .line 37
    sget v0, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v0, :cond_4

    :cond_3
    :goto_1
    const-string v0, "\u06eb\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x7f

    xor-int v4, v0, v23

    mul-int/lit16 v4, v4, 0x1f9d

    const v25, -0x5f9caada

    xor-int v4, v4, v25

    const v25, -0x2ef3b36e

    goto/16 :goto_8

    :cond_4
    const-string v0, "\u1a7a\u06e4"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x7

    xor-int v4, v0, v23

    mul-int/lit16 v4, v4, -0xe7

    const v25, 0x1cfd1202

    xor-int v4, v4, v25

    const v25, 0x4059f97

    goto/16 :goto_8

    :sswitch_9
    ushr-int/lit8 v16, v13, 0x4

    .line 39
    sget v0, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v0, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u06db\u1a75"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x3f

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, -0x1355

    const v25, 0x72a1bf77

    xor-int v4, v4, v25

    const v25, -0x348ce36c    # -1.5932564E7f

    goto/16 :goto_8

    .line 37
    :sswitch_a
    aget-byte v13, v6, v12

    add-int/lit8 v15, v14, 0x1

    .line 0
    sget-boolean v0, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v0, :cond_7

    :cond_6
    :goto_2
    const-string v0, "\u06d7\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, 0x4c4d

    const v25, -0x3bc9108e

    xor-int v4, v4, v25

    const v25, 0x661bda1e

    goto/16 :goto_8

    :cond_7
    const-string v0, "\u0733\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v4, v0, v23

    mul-int/lit16 v4, v4, -0x5a41

    const v25, -0x46e0d8de    # -1.5178E-4f

    xor-int v4, v4, v25

    const v25, -0x1cc8e45c

    goto/16 :goto_8

    .line 41
    :sswitch_b
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v9}, Ljava/lang/String;-><init>([C)V

    return-object v0

    :sswitch_c
    if-ge v12, v10, :cond_8

    const-string v0, "\u06e7\u0733"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, 0x61ef

    const v25, 0x6bc0f62d

    xor-int v4, v4, v25

    const v25, 0x33e9af80

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u1a75\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x6b

    xor-int v4, v0, v23

    mul-int/lit16 v4, v4, 0x542f

    const v25, 0x76495da2

    xor-int v4, v4, v25

    const v25, 0x4f3cd4e4

    goto/16 :goto_8

    .line 32
    :sswitch_d
    aput-byte v11, v3, v5

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, p0

    goto/16 :goto_6

    :sswitch_e
    aget-byte v0, v3, v5

    not-int v0, v0

    int-to-byte v11, v0

    .line 31
    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v0, :cond_9

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u05ab\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, -0x278b

    const v25, -0x6b2802d9

    xor-int v4, v4, v25

    const v25, -0x356ad74d    # -4887641.5f

    goto/16 :goto_8

    :sswitch_f
    shl-int v0, v7, v8

    .line 35
    new-array v0, v0, [C

    .line 37
    array-length v4, v6

    const/4 v9, 0x0

    move-object v9, v0

    move v10, v4

    move/from16 v12, v26

    const/4 v14, 0x0

    :goto_3
    const-string v0, "\u06d7\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x6d

    xor-int v4, v0, v23

    mul-int/lit16 v4, v4, 0x2bad

    const v25, -0x2eb8226d

    xor-int v4, v4, v25

    const v25, -0x3410c784    # -3.1355128E7f

    goto/16 :goto_8

    :sswitch_10
    const/4 v8, 0x1

    .line 35
    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v0, :cond_b

    :cond_a
    :goto_4
    const-string v0, "\u06e2\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v4, v0, v23

    mul-int/lit16 v4, v4, -0x4a6d

    const v25, 0x26e543c8

    xor-int v4, v4, v25

    const v25, -0x72799b9f

    goto/16 :goto_8

    :cond_b
    const-string v0, "\u0733\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, -0x5755

    const v25, 0x7102e47f

    xor-int v4, v4, v25

    const v25, 0x4987b345

    goto/16 :goto_8

    .line 33
    :sswitch_11
    invoke-virtual {v1, v3}, Ljava/security/MessageDigest;->update([B)V

    .line 34
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v6

    .line 35
    array-length v7, v6

    .line 29
    sget v0, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v0, :cond_c

    :goto_5
    const-string v0, "\u1a73\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x45

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, 0x2001

    const v25, -0x3689d809

    xor-int v4, v4, v25

    const v25, -0x75e91cca

    goto/16 :goto_8

    :cond_c
    const-string v0, "\u06da\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v23, v0

    mul-int/lit8 v0, v0, 0x47

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, 0x4f8f

    const v25, -0x5829e3ff

    xor-int v4, v4, v25

    const v25, 0x44895db4

    goto/16 :goto_8

    .line 31
    :sswitch_12
    array-length v0, v3

    if-ge v5, v0, :cond_d

    const-string v0, "\u073d\u06df"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x43

    xor-int v4, v0, v23

    mul-int/lit16 v4, v4, -0x1359

    const v25, -0x4970e03c

    xor-int v4, v4, v25

    const v25, -0x3383e077    # -6.609258E7f

    goto :goto_8

    :cond_d
    const-string v0, "\u073d\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v4, v0, v23

    mul-int/lit16 v4, v4, 0x5213

    const v25, -0x62a59e44

    xor-int v4, v4, v25

    const v25, -0x5c71d56c

    goto :goto_8

    :sswitch_13
    move-object/from16 v0, p0

    .line 30
    invoke-static {v0, v2}, Ll/֨۟;->ۤۚۡ(Ljava/lang/Object;Ljava/lang/Object;)[B

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v26, 0x0

    :goto_6
    const-string v4, "\u1a73\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v22

    xor-int v0, v4, v23

    mul-int/lit16 v0, v0, -0x7027

    const v25, 0x41a32b34

    xor-int v0, v0, v25

    const v25, 0x458e050d

    xor-int v25, v4, v25

    goto/16 :goto_0

    .line 29
    :sswitch_14
    invoke-static {}, Ll/᩹ۧ᩺;->ۙ()Ljava/security/MessageDigest;

    move-result-object v1

    .line 30
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_e

    :goto_7
    const-string v0, "\u06e7\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, 0x444f

    const v25, 0x577afdb4

    xor-int v4, v4, v25

    const v25, -0x50d3da46

    goto :goto_8

    :cond_e
    const-string v0, "\u1a78\u06da"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, -0x3c4b

    const v25, 0x63645053

    xor-int v4, v4, v25

    const v25, -0x3da05df2

    :goto_8
    xor-int v25, v0, v25

    move v0, v4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f2a358c -> :sswitch_6
        -0x72d5eca8 -> :sswitch_1
        -0x6b560fb6 -> :sswitch_10
        -0x67eb0d43 -> :sswitch_b
        -0x5ff6a72d -> :sswitch_b
        -0x5d49b97c -> :sswitch_f
        -0x5a6973fc -> :sswitch_8
        -0x59d69338 -> :sswitch_c
        -0x577502bd -> :sswitch_d
        -0x50e29bb8 -> :sswitch_9
        -0x4f75cf98 -> :sswitch_7
        -0x3e53edab -> :sswitch_2
        -0x38ec0ecf -> :sswitch_0
        -0x369d7042 -> :sswitch_c
        -0x2f246154 -> :sswitch_e
        -0x27279eff -> :sswitch_a
        -0x1e6ed7b3 -> :sswitch_f
        -0x1245deae -> :sswitch_a
        -0x105babb4 -> :sswitch_11
        -0x40715eb -> :sswitch_9
        -0x29efabc -> :sswitch_12
        -0x10410a2 -> :sswitch_6
        0x834128e -> :sswitch_13
        0x9a7d28e -> :sswitch_12
        0xa88249a -> :sswitch_14
        0xabed246 -> :sswitch_2
        0x104fb382 -> :sswitch_4
        0x1126f068 -> :sswitch_7
        0x116c34f1 -> :sswitch_3
        0x1285a2cc -> :sswitch_5
        0x1634c18b -> :sswitch_1
        0x21a48df1 -> :sswitch_d
        0x231ed326 -> :sswitch_e
        0x296d8ac1 -> :sswitch_13
        0x2a3dbb8d -> :sswitch_8
        0x390edd22 -> :sswitch_3
        0x42e6ac5f -> :sswitch_11
        0x441deaf3 -> :sswitch_0
        0x492e283a -> :sswitch_5
        0x4ca84830 -> :sswitch_4
        0x7ed6d3d5 -> :sswitch_10
        0x7ee7541c -> :sswitch_14
    .end sparse-switch
.end method

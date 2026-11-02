.class public Ll/ۜۜ᩺;
.super Landroid/widget/ListView;
.source "J5HS"


# static fields
.field private static final ۘܿᩴ:[S


# instance fields
.field public ֡:J

.field public ֨ۙ:Landroid/widget/AbsListView$OnScrollListener;

.field public ֫:I

.field public ۖۙ:Z

.field public ۗ:J

.field public ۘۙ:J

.field public ۙۙ:Ll/᩹ܺ᩺;

.field public ۚۙ:Z

.field public ۛ:I

.field public ۜۙ:Z

.field public ۢ:Z

.field public ۧ:I

.field public final ۨۙ:Ll/۬ۜ᩺;

.field public ۫:F

.field public ۬ۙ:Z

.field public ܰۙ:Z

.field public ܳ:F

.field public ܶۙ:I

.field public ܺ:Landroid/view/View$OnTouchListener;

.field public ܽ:F

.field public ܿ:Ll/ܿܰۙ;

.field public ᩳۙ:Ljava/util/ArrayList;

.field public ᩴۙ:Z

.field public final ᩶:Landroid/database/DataSetObserver;

.field public ᩸ۙ:F

.field public ᩹ۙ:Landroid/widget/AdapterView$OnItemLongClickListener;

.field public ᩺ۙ:I

.field public ᩻:F


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    const/16 v0, 0x2e

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۜۜ᩺;->ۘܿᩴ:[S

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x67616e1e

    sget v8, Ll/֫۟;->᩸ᩴܿ:I

    sget v9, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v10, "\u06e4\u1a78"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x13

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7553

    const v12, 0x58f14436

    xor-int/2addr v11, v12

    const v12, -0x51c3a6

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, -0x20b

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 20
    sget v10, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v10, :cond_10

    goto/16 :goto_8

    .line 9
    :sswitch_0
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v10

    if-nez v10, :cond_f

    goto/16 :goto_4

    :sswitch_1
    const/4 v0, 0x1

    const-string v10, "\u05a1\u073d"

    .line 45
    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0xf

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1e23

    const v12, 0x7d3b709

    xor-int/2addr v11, v12

    const v12, -0x684acfd2

    goto :goto_0

    .line 5
    :sswitch_2
    sget-boolean v10, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v10, :cond_7

    goto/16 :goto_6

    .line 11
    :sswitch_3
    sget v10, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v10, :cond_0

    goto :goto_1

    :cond_0
    const-string v10, "\u1a7a\u1a74"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x25

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x53f3

    const v12, -0x269b85af

    xor-int/2addr v11, v12

    const v12, 0x44c0c892

    goto :goto_0

    .line 30
    :sswitch_4
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget v10, Ll/ۖۧ;->ܺۚۖ:I

    if-lez v10, :cond_a

    goto/16 :goto_4

    .line 45
    :sswitch_5
    :try_start_0
    sget-object v10, Ll/ۜۜ᩺;->ۘܿᩴ:[S

    const/16 v11, 0x1f

    const/16 v12, 0xf

    invoke-static {v10, v11, v12, v6}, Ll/֫ۚ;->᩸ܺ᩷([SIII)Ljava/lang/String;

    move-result-object v10

    .line 49
    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    sput-boolean v0, Ll/᩸ۢ᩺;->ۙ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v10, "\u1a78\u0736"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x59

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7287

    const v12, -0x53b3e4ed

    xor-int/2addr v11, v12

    const v12, 0x3fdde345

    goto :goto_0

    .line 26
    :sswitch_6
    sget v10, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v10, :cond_1

    goto/16 :goto_8

    :cond_1
    :goto_1
    const-string v10, "\u05ab\u1a75"

    .line 11
    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x41

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2ba7

    const v12, 0x7084c22a

    xor-int/2addr v11, v12

    const v12, 0x1cd197eb

    goto/16 :goto_0

    :sswitch_7
    const v6, 0xa761

    goto/16 :goto_5

    :sswitch_8
    return-void

    .line 45
    :sswitch_9
    aget-short v3, v1, v2

    sget v10, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v10, :cond_2

    goto :goto_2

    :cond_2
    const-string v10, "\u0730\u1a75"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x54b9

    const v12, 0x26e9ea70

    xor-int/2addr v11, v12

    const v12, -0x646515bf

    goto/16 :goto_0

    .line 11
    :sswitch_a
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v10

    if-eqz v10, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string v10, "\u06e1\u1a75"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x357d

    const v12, 0x70180f6a

    xor-int/2addr v11, v12

    const v12, 0x71bb5395

    goto/16 :goto_0

    :sswitch_b
    const v4, 0x1038c

    mul-int v4, v4, v3

    .line 45
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v10

    if-eqz v10, :cond_4

    :goto_2
    const-string v10, "\u1a76\u06e0"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x7b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5317

    const v12, 0x312041dd

    xor-int/2addr v11, v12

    const v12, 0x209d7606

    goto/16 :goto_0

    :cond_4
    const-string v10, "\u06e8\u0733"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4727

    const v12, -0x1d9bc8a1

    xor-int/2addr v11, v12

    const v12, -0xa881e19

    goto/16 :goto_0

    :sswitch_c
    sget v10, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v10, :cond_5

    goto :goto_3

    :cond_5
    const-string v10, "\u1a78\u06df"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x56fb

    const v12, -0x6aad67b8

    xor-int/2addr v11, v12

    const v12, -0x6893a97

    goto/16 :goto_0

    .line 19
    :sswitch_d
    sget-boolean v10, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v10, :cond_d

    goto :goto_4

    .line 0
    :sswitch_e
    sget v10, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v10, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v10, "\u1a76\u06da"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0xda7

    const v12, -0x73bf8e20

    xor-int/2addr v11, v12

    const v12, 0x517b51a8

    goto/16 :goto_0

    .line 33
    :sswitch_f
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_10
    add-int/lit16 v5, v3, 0x40e3

    .line 45
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v10

    if-eqz v10, :cond_8

    :cond_7
    :goto_3
    const-string v10, "\u0736\u073f"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x21

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x14f7

    const v12, -0x37efe94d

    xor-int/2addr v11, v12

    const v12, 0x654e7dfe

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u06e0\u1a79"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x55

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5357

    const v12, 0x7cc25fa7

    xor-int/2addr v11, v12

    const v12, 0x337824e0

    goto/16 :goto_0

    .line 30
    :sswitch_11
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    :goto_4
    const-string v10, "\u0733\u06e7"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x43

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5aef

    const v12, -0x3b8f980e

    xor-int/2addr v11, v12

    const v12, -0x4bfb9f65

    goto/16 :goto_0

    :sswitch_12
    const/16 v6, 0x2c90

    :goto_5
    const-string v10, "\u1a77\u06e1"

    .line 45
    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x11e1

    const v12, 0x318ca3c2

    xor-int/2addr v11, v12

    const v12, -0x3c2001e8

    goto/16 :goto_0

    .line 0
    :sswitch_13
    :try_start_1
    sget-object v10, Ll/ۜۜ᩺;->ۘܿᩴ:[S

    const/4 v11, 0x1

    const/16 v12, 0x1e

    invoke-static {v10, v11, v12, v6}, Ll/ۘ֡;->۫ۡ۫([SIII)Ljava/lang/String;

    move-result-object v10

    .line 44
    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 45
    sput-boolean v0, Ll/᩸ۢ᩺;->ۙ:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const-string v10, "\u1a76\u1a73"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x3d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4457

    const v12, -0x2287b8a8

    xor-int/2addr v11, v12

    const v12, 0x115c5e86

    goto/16 :goto_0

    .line 9
    :sswitch_14
    sget v10, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v10, :cond_9

    goto :goto_6

    :cond_9
    const-string v10, "\u06e4\u073f"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x26b1

    const v12, 0x439fcdcc

    xor-int/2addr v11, v12

    const v12, -0x1eedb41d

    goto/16 :goto_0

    .line 11
    :sswitch_15
    sget-object v1, Ll/ۜۜ᩺;->ۘܿᩴ:[S

    const/4 v2, 0x0

    .line 44
    sget v10, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v10, :cond_b

    :cond_a
    :goto_6
    const-string v10, "\u1a77\u073d"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3599

    const v12, -0x610b7e48

    xor-int/2addr v11, v12

    const v12, -0x4b58df5a

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u1a7a\u06ec"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7999

    const v12, -0x2b0d7297

    xor-int/2addr v11, v12

    const v12, -0x18aeab0e

    goto/16 :goto_0

    :sswitch_16
    mul-int v10, v5, v5

    sub-int v10, v4, v10

    if-gtz v10, :cond_c

    const-string v10, "\u0736\u06e2"

    .line 45
    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1abf

    const v12, -0x5eca21eb

    xor-int/2addr v11, v12

    const v12, 0x6d467adc

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u1a7b\u1a77"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x7

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x105

    const v12, 0x191de528

    xor-int/2addr v11, v12

    const v12, -0x69d490be

    goto/16 :goto_0

    .line 40
    :sswitch_17
    sget v10, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v10, :cond_e

    :cond_d
    :goto_7
    const-string v10, "\u06db\u0730"

    .line 11
    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x53

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6771

    const v12, 0xcc9bad4

    xor-int/2addr v11, v12

    const v12, -0x600d96c9

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u073f\u073f"

    .line 40
    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x23bd

    const v12, -0x43130c0e

    xor-int/2addr v11, v12

    const v12, -0x5d2f893a

    goto/16 :goto_0

    :cond_f
    :goto_8
    const-string v10, "\u06d6\u06e8"

    .line 45
    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1de1

    const v12, -0x327bd68c

    xor-int/2addr v11, v12

    const v12, 0xa8be4e

    goto/16 :goto_0

    :cond_10
    const-string v10, "\u0733\u05a8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x1b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3df

    const v12, -0x625efaf

    xor-int/2addr v11, v12

    const v12, 0x3dc83fcd

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c6d6fc8 -> :sswitch_17
        -0x78f9261e -> :sswitch_16
        -0x78a38a39 -> :sswitch_15
        -0x69c83efa -> :sswitch_14
        -0x67d51f98 -> :sswitch_14
        -0x5a497198 -> :sswitch_13
        -0x58057adf -> :sswitch_12
        -0x562ce799 -> :sswitch_11
        -0x52b97ee3 -> :sswitch_12
        -0x4489a92f -> :sswitch_10
        -0x3b1ec372 -> :sswitch_f
        -0x3afccffd -> :sswitch_e
        -0x31ef5734 -> :sswitch_d
        -0x2fb6d22d -> :sswitch_15
        -0x2db686fb -> :sswitch_13
        -0x26bd06a9 -> :sswitch_c
        -0x24e26780 -> :sswitch_b
        -0x21e9d490 -> :sswitch_a
        -0x1bfd0297 -> :sswitch_9
        -0x1a4b1cb7 -> :sswitch_8
        -0x17ffc035 -> :sswitch_10
        -0x10f4a2fc -> :sswitch_f
        -0x9ba8352 -> :sswitch_7
        -0x95b92de -> :sswitch_6
        -0x8487a6e -> :sswitch_5
        -0x5c38fd1 -> :sswitch_7
        -0x4fa3567 -> :sswitch_4
        -0x2ba2036 -> :sswitch_8
        0x103d9df -> :sswitch_5
        0x579c213 -> :sswitch_17
        0x5bc5130 -> :sswitch_3
        0xce0ff9b -> :sswitch_b
        0x11d5bfa3 -> :sswitch_c
        0x122f3f23 -> :sswitch_2
        0x18e82a0f -> :sswitch_d
        0x1c47c266 -> :sswitch_6
        0x1ddf67fb -> :sswitch_4
        0x26a784c4 -> :sswitch_9
        0x35aa7db9 -> :sswitch_e
        0x3602487d -> :sswitch_1
        0x5424b516 -> :sswitch_16
        0x54a629cd -> :sswitch_1
        0x5c0c040d -> :sswitch_11
        0x5d403b58 -> :sswitch_0
        0x5ef1c1ac -> :sswitch_2
        0x6cccbf46 -> :sswitch_3
        0x702883df -> :sswitch_a
        0x76687ba7 -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 2
        0x15as
        -0x58fes
        -0x58f2s
        -0x58f4s
        -0x58b1s
        -0x58fes
        -0x5900s
        -0x58f4s
        -0x58fcs
        -0x58f3s
        -0x58b1s
        -0x58eds
        -0x58ecs
        -0x58f1s
        -0x58ebs
        -0x58f8s
        -0x58f4s
        -0x58fcs
        -0x58b1s
        -0x58d1s
        -0x5900s
        -0x58ebs
        -0x58f8s
        -0x58e9s
        -0x58fcs
        -0x58dcs
        -0x58f1s
        -0x58fas
        -0x58f8s
        -0x58f1s
        -0x58fcs
        -0x58f4s
        -0x58ebs
        -0x58e7s
        -0x58b1s
        -0x58d1s
        -0x5900s
        -0x58ebs
        -0x58f8s
        -0x58e9s
        -0x58fcs
        -0x58das
        -0x58ecs
        -0x5900s
        -0x58eds
        -0x58fbs
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const v0, 0x489d0bc0    # 321630.0f

    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    sget v2, Ll/֫᩺;->᩺۟ۘ:I

    const/4 v3, 0x0

    .line 87
    invoke-direct {p0, p1, p2, v3}, Ll/ۜۜ᩺;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, "\u1a75\u0730"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x27

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x73b9

    const v3, -0x483e1fcb

    xor-int/2addr p2, v3

    const v3, -0x7ba9cadb

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x717b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 62
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    sget p1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez p1, :cond_2

    goto :goto_1

    .line 82
    :sswitch_0
    sget p1, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a76\u0733"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x2b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x219b

    const v3, 0x6feee4b3

    xor-int/2addr p2, v3

    const v3, 0x5f52c0fc

    goto :goto_0

    .line 72
    :sswitch_1
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u1a75\u06ec"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x3ad7

    const v3, 0x67176bc8

    xor-int/2addr p2, v3

    const v3, 0x50f2ce93

    goto :goto_0

    :cond_2
    const-string p1, "\u1a79\u06df"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x62c5

    const v3, 0x546ded0

    xor-int/2addr p2, v3

    const v3, 0x3a10a5ee

    goto :goto_0

    .line 50
    :sswitch_2
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    :goto_1
    const-string p1, "\u06df\u06db"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x3c15

    const v3, -0x3e0a4d8b

    xor-int/2addr p2, v3

    const v3, 0x26014efe

    goto :goto_0

    .line 49
    :sswitch_3
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 15
    :sswitch_5
    sget p1, Ll/ۧ;->֫۠ᩴ:I

    if-ltz p1, :cond_3

    const-string p1, "\u1a77\u1a76"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x3711

    const v3, -0x174cff55

    xor-int/2addr p2, v3

    const v3, 0x14c8a3aa

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06e4\u06e7"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6493

    const v3, 0x733828c4

    xor-int/2addr p2, v3

    const v3, -0x617cc8b9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ae39e49 -> :sswitch_3
        -0x7469670f -> :sswitch_1
        -0xf23cbf6 -> :sswitch_0
        0x1a4cc9b4 -> :sswitch_2
        0x1b9182c6 -> :sswitch_5
        0x4286bc53 -> :sswitch_5
        0x49f5122e -> :sswitch_1
        0x4b6d0112 -> :sswitch_4
        0x4d881863 -> :sswitch_2
        0x519a1329 -> :sswitch_3
        0x6af58fb1 -> :sswitch_0
        0x7a2dd42c -> :sswitch_4
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 12

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x25a9873

    sget v9, Ll/ۘۧ;->ܳ᩷᩸:I

    sget v10, Ll/ۗ;->֨۬ۖ:I

    .line 112
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p2, "\u1a78\u06d9"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v9, p2

    mul-int/lit8 p2, p2, 0x21

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x24cf

    const v11, 0x55c763ff

    xor-int/2addr p3, v11

    const v11, -0x6b07fa11

    :goto_0
    xor-int/2addr p2, v11

    xor-int/2addr v8, v10

    mul-int/lit16 v8, v8, -0x14c5

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr p3, v8

    xor-int v8, p2, p3

    sparse-switch v8, :sswitch_data_0

    const-wide/16 v0, 0x0

    .line 69
    iput-wide v0, p0, Ll/ۜۜ᩺;->ۘۙ:J

    .line 73
    new-instance p2, Ll/᩹ܺ᩺;

    const/4 p3, 0x3

    sget v11, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v11, :cond_d

    goto/16 :goto_7

    .line 77
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget p2, Ll/֫۟;->᩸ᩴܿ:I

    if-gez p2, :cond_c

    goto/16 :goto_8

    :sswitch_1
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    sget p2, Ll/֫۟;->᩸ᩴܿ:I

    if-gez p2, :cond_e

    goto/16 :goto_2

    .line 130
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget p2, Ll/֡ۛ;->۬᩸ܶ:I

    if-nez p2, :cond_3

    goto :goto_1

    .line 119
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    :goto_1
    const-string p2, "\u06e7\u1a75"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x7657

    const v11, -0x69aa749b

    xor-int/2addr p3, v11

    const v11, 0x95b3d58    # 2.639001E-33f

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 149
    :sswitch_5
    new-instance p2, Ll/ۘۜ᩺;

    invoke-direct {p2, p0}, Ll/ۘۜ᩺;-><init>(Ll/ۜۜ᩺;)V

    invoke-virtual {p0, p2}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_3

    .line 155
    :sswitch_6
    iput v7, p0, Ll/ۜۜ᩺;->᩻:F

    .line 158
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Ll/ۜۜ᩺;->᩺ۙ:I

    return-void

    :sswitch_7
    mul-float p2, v5, v6

    .line 154
    iput p2, p0, Ll/ۜۜ᩺;->ܳ:F

    const/high16 p2, 0x42400000    # 48.0f

    mul-float v7, v5, p2

    sget p2, Ll/ۧ;->֫۠ᩴ:I

    if-ltz p2, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string p2, "\u06d6\u06e8"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    mul-int/lit8 p2, p2, -0x21

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x3a2d

    const v11, 0x2d438c23

    xor-int/2addr p3, v11

    const v11, -0x6775a88a

    goto/16 :goto_0

    :sswitch_8
    const p2, 0x39777777

    .line 153
    iput p2, p0, Ll/ۜۜ᩺;->֫:I

    const/high16 v6, 0x41000000    # 8.0f

    .line 128
    sget-boolean p2, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez p2, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string p2, "\u1a7b\u05a1"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    mul-int/lit8 p2, p2, -0x65

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x14e9

    const v11, 0x5d40d16f

    xor-int/2addr p3, v11

    const v11, 0x3c1dc6a1

    goto/16 :goto_0

    :sswitch_9
    const p2, -0x22888889

    .line 152
    iput p2, p0, Ll/ۜۜ᩺;->ۧ:I

    .line 95
    sget p2, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz p2, :cond_2

    goto/16 :goto_8

    :cond_2
    const-string p2, "\u06dc\u1a79"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x32fd

    const v11, -0x26613c47

    xor-int/2addr p3, v11

    const v11, 0x1532c561

    goto/16 :goto_0

    .line 150
    :sswitch_a
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    .line 151
    iget v5, p2, Landroid/util/DisplayMetrics;->density:F

    .line 113
    sget p2, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz p2, :cond_4

    :cond_3
    :goto_2
    const-string p2, "\u0736\u073f"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v9, p2

    mul-int/lit8 p2, p2, -0x71

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0xc07

    const v11, -0x4e7860e6

    xor-int/2addr p3, v11

    const v11, 0x2b5b7579

    goto/16 :goto_0

    :cond_4
    const-string p2, "\u1a73\u073f"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v9

    mul-int/lit8 p2, p2, -0x73

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x19a7

    const v11, -0x37432cb9

    xor-int/2addr p3, v11

    const v11, -0x11f4da46

    goto/16 :goto_0

    .line 208
    :sswitch_b
    iput-boolean v4, p0, Ll/ۜۜ᩺;->ۖۙ:Z

    goto :goto_4

    .line 147
    :sswitch_c
    invoke-super {p0, v2}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V

    .line 148
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-nez p2, :cond_5

    const-string p2, "\u0736\u06e7"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x7649

    const v11, 0xef223dc

    xor-int/2addr p3, v11

    const v11, 0x5576cb0a

    goto/16 :goto_0

    :cond_5
    :goto_3
    const-string p2, "\u05a1\u06d9"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    mul-int/lit8 p2, p2, 0x1b

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x11ff

    const v11, 0x308c162e

    xor-int/2addr p3, v11

    const v11, 0x1def5a53

    goto/16 :goto_0

    .line 116
    :sswitch_d
    invoke-virtual {p0, v2}, Landroid/widget/ListView;->setDefaultFocusHighlightEnabled(Z)V

    goto :goto_5

    .line 118
    :sswitch_e
    new-instance p2, Ll/᩹ۜ᩺;

    invoke-direct {p2, p0}, Ll/᩹ۜ᩺;-><init>(Ll/ۜۜ᩺;)V

    invoke-super {p0, p2}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 144
    invoke-super {p0}, Landroid/widget/ListView;->isFastScrollEnabled()Z

    move-result p2

    if-eqz p2, :cond_6

    const-string p2, "\u06e0\u1a75"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    mul-int/lit8 p2, p2, -0x29

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x725d

    const v11, 0x5f7699a4

    xor-int/2addr p3, v11

    const v11, -0x4abfac77

    goto/16 :goto_0

    :cond_6
    :goto_4
    const-string p2, "\u1a73\u0733"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x5997

    const v11, 0x634136cc

    xor-int/2addr p3, v11

    const v11, -0x6c42df22

    goto/16 :goto_0

    .line 235
    :sswitch_f
    iput v4, p0, Ll/ۜۜ᩺;->ܶۙ:I

    .line 113
    invoke-virtual {p0, v2}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 114
    invoke-virtual {p0, v2}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 115
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    if-lt p2, p3, :cond_7

    const-string p2, "\u05a8\u06e2"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v10, p2

    mul-int/lit8 p2, p2, 0x53

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x2dad

    const v11, -0x40354bad

    xor-int/2addr p3, v11

    const v11, -0x4295ce9e

    goto/16 :goto_0

    :cond_7
    :goto_5
    const-string p2, "\u06ec\u0730"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    mul-int/lit8 p2, p2, -0x37

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x81

    const v11, -0x7edae6a6

    xor-int/2addr p3, v11

    const v11, 0x69b74a7d

    goto/16 :goto_0

    .line 211
    :sswitch_10
    iput-object v3, p0, Ll/ۜۜ᩺;->᩶:Landroid/database/DataSetObserver;

    const/4 v4, 0x1

    sget p2, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz p2, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string p2, "\u06e1\u06ec"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v10, p2

    mul-int/lit8 p2, p2, 0x39

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x5f1b

    const v11, 0x28e44356

    xor-int/2addr p3, v11

    const v11, 0x51cc9531

    goto/16 :goto_0

    .line 161
    :sswitch_11
    iput-wide v0, p0, Ll/ۜۜ᩺;->֡:J

    .line 211
    new-instance v3, Ll/֨ۜ᩺;

    invoke-direct {v3, p0}, Ll/֨ۜ᩺;-><init>(Ll/ۜۜ᩺;)V

    .line 4
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result p2

    if-ltz p2, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string p2, "\u1a7b\u1a77"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v10

    mul-int/lit8 p2, p2, -0x13

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x1bbb

    const v11, -0xcd5e864

    xor-int/2addr p3, v11

    const v11, 0x39572159

    goto/16 :goto_0

    :sswitch_12
    const/4 v2, 0x0

    .line 79
    iput-boolean v2, p0, Ll/ۜۜ᩺;->ۢ:Z

    sget p2, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz p2, :cond_a

    :goto_6
    const-string p2, "\u06e0\u1a77"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x6263

    const v11, -0x767a43da

    xor-int/2addr p3, v11

    const v11, -0x2043a959

    goto/16 :goto_0

    :cond_a
    const-string p2, "\u0733\u0730"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v9, p2

    mul-int/lit8 p2, p2, -0x5f

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x12cd

    const v11, 0x35a16a3f

    xor-int/2addr p3, v11

    const v11, 0x488cca68    # 288339.25f

    goto/16 :goto_0

    .line 76
    :sswitch_13
    new-instance p2, Ll/۬ۜ᩺;

    invoke-direct {p2, p0}, Ll/۬ۜ᩺;-><init>(Ll/ۜۜ᩺;)V

    iput-object p2, p0, Ll/ۜۜ᩺;->ۨۙ:Ll/۬ۜ᩺;

    .line 157
    sget p2, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz p2, :cond_b

    goto :goto_8

    :cond_b
    const-string p2, "\u05a8\u06d9"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x168f

    const v11, 0x9c5eebc

    xor-int/2addr p3, v11

    const v11, -0x7423e9f5

    goto/16 :goto_0

    :cond_c
    :goto_7
    const-string p2, "\u06d8\u05a1"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v10, p2

    mul-int/lit8 p2, p2, -0x35

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x61e9

    const v11, 0x4aa9b5b2    # 5561049.0f

    xor-int/2addr p3, v11

    const v11, -0x4193d482

    goto/16 :goto_0

    .line 20
    :cond_d
    invoke-direct {p2, p3}, Ll/᩹ܺ᩺;-><init>(I)V

    .line 73
    iput-object p2, p0, Ll/ۜۜ᩺;->ۙۙ:Ll/᩹ܺ᩺;

    .line 214
    sget p2, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz p2, :cond_f

    :cond_e
    :goto_8
    const-string p2, "\u06e8\u06e7"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x30bb

    const v11, -0x4dfbced7

    xor-int/2addr p3, v11

    const v11, 0x15839ba1

    goto/16 :goto_0

    :cond_f
    const-string p2, "\u1a76\u06e7"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x4c2f

    const v11, 0x446b42c6

    xor-int/2addr p3, v11

    const v11, 0x48fe7ba8    # 521181.25f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a87d7d9 -> :sswitch_3
        -0x79707158 -> :sswitch_f
        -0x7620cccc -> :sswitch_0
        -0x7147656f -> :sswitch_10
        -0x691f667f -> :sswitch_4
        -0x64d3a35d -> :sswitch_12
        -0x588caa2e -> :sswitch_2
        -0x583dc710 -> :sswitch_8
        -0x566186c0 -> :sswitch_1
        -0x46167091 -> :sswitch_11
        -0x410f200c -> :sswitch_d
        -0x3e21b136 -> :sswitch_9
        -0x3c1e18d6 -> :sswitch_5
        -0x3a226e06 -> :sswitch_c
        -0x2a2611fd -> :sswitch_b
        -0x20c562af -> :sswitch_6
        -0x1dd8da8a -> :sswitch_b
        -0x1879c009 -> :sswitch_5
        -0x12f6051f -> :sswitch_11
        -0x125f2eff -> :sswitch_a
        -0xad17874 -> :sswitch_3
        -0x8c596f7 -> :sswitch_10
        0x198f4e7 -> :sswitch_a
        0x80b9cda -> :sswitch_7
        0xef334f1 -> :sswitch_d
        0x191f6fbd -> :sswitch_e
        0x1a135371 -> :sswitch_f
        0x1e9eca9d -> :sswitch_13
        0x253eb2e9 -> :sswitch_9
        0x27059e11 -> :sswitch_0
        0x32bb4cf6 -> :sswitch_8
        0x392cb2b6 -> :sswitch_12
        0x42228d52 -> :sswitch_13
        0x4356a8de -> :sswitch_c
        0x45b8c31c -> :sswitch_6
        0x4a1514df -> :sswitch_1
        0x5a0cf2af -> :sswitch_7
        0x5f384732 -> :sswitch_4
        0x7649abab -> :sswitch_e
        0x7ee1c9e8 -> :sswitch_2
    .end sparse-switch
.end method

.method private ۖ(Landroid/view/MotionEvent;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x785ea074

    sget v2, Ll/֫֡;->ۡ᩹ۗ:I

    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v4, "\u1a77\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7d01

    const v6, -0x65162523

    xor-int/2addr v5, v6

    const v6, 0x5e974414

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0xf75

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 219
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v4

    if-gtz v4, :cond_6

    goto/16 :goto_2

    .line 370
    :sswitch_0
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v4, :cond_9

    goto/16 :goto_5

    .line 173
    :sswitch_1
    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v4, :cond_d

    goto/16 :goto_3

    :sswitch_2
    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v4, :cond_b

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    goto/16 :goto_3

    .line 76
    :sswitch_4
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    :sswitch_5
    return-void

    :sswitch_6
    const/4 v4, 0x3

    if-ne v0, v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u06dc\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3f67

    const v6, 0x22e1bc11

    xor-int/2addr v5, v6

    const v6, -0x698cc83b

    goto :goto_0

    :sswitch_7
    const/4 v4, 0x1

    if-eq v0, v4, :cond_1

    const-string v4, "\u05a1\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1527

    const v6, 0x3e7fc86f

    xor-int/2addr v5, v6

    const v6, 0x7278ead1

    goto :goto_0

    :sswitch_8
    const/4 p1, 0x0

    .line 394
    iput-boolean p1, p0, Ll/ۜۜ᩺;->ۚۙ:Z

    return-void

    .line 392
    :sswitch_9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v4, "\u06ec\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7dcd

    const v6, 0x25ea22ba

    xor-int/2addr v5, v6

    const v6, 0x5ab493dd

    goto/16 :goto_0

    :cond_1
    :goto_1
    const-string v4, "\u05a1\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4ebb

    const v6, 0x55a2d788

    xor-int/2addr v5, v6

    const v6, 0x39692dca

    goto/16 :goto_0

    .line 390
    :sswitch_a
    sget v4, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u06df\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6443

    const v6, -0x6dcb549d

    xor-int/2addr v5, v6

    const v6, -0x49c60a0f

    goto/16 :goto_0

    .line 283
    :sswitch_b
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u1a78\u06e4"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1ecf

    const v6, 0x7d5c142c

    xor-int/2addr v5, v6

    const v6, -0x2a4ea28b

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "\u1a74\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x782d

    const v6, 0x363b50f5

    xor-int/2addr v5, v6

    const v6, 0x3bd5f6b6

    goto/16 :goto_0

    .line 329
    :sswitch_d
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v4, "\u06e4\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6737

    const v6, 0x7bba269c

    xor-int/2addr v5, v6

    const v6, 0x78ab6134

    goto/16 :goto_0

    :goto_2
    const-string v4, "\u06d9\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6bad

    const v6, -0x4bd415f1

    xor-int/2addr v5, v6

    const v6, 0x7e460dc6

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a7a\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x51b3

    const v6, -0x6fd1eac7

    xor-int/2addr v5, v6

    const v6, 0xc159d22

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v4, :cond_7

    :goto_3
    const-string v4, "\u06e7\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7a8f

    const v6, 0x2ecaaaa6

    xor-int/2addr v5, v6

    const v6, -0x1929305e

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u05a8\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x433

    const v6, 0x41d8af1c

    xor-int/2addr v5, v6

    const v6, 0x1d293773

    goto/16 :goto_0

    :sswitch_f
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u0733\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3425

    const v6, -0x44e38d2f

    xor-int/2addr v5, v6

    const v6, 0x31119462

    goto/16 :goto_0

    .line 345
    :sswitch_10
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u073a\u05ab"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x664d

    const v6, 0x598b631

    xor-int/2addr v5, v6

    const v6, -0x64d6b7c8

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e1\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6ea5

    const v6, -0x38ae4f07

    xor-int/2addr v5, v6

    const v6, -0x5cb20ccf

    goto/16 :goto_0

    .line 221
    :sswitch_11
    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u05ab\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x355d

    const v6, -0x510b96a4

    xor-int/2addr v5, v6

    const v6, -0x4ff5a50d

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e2\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x215f

    const v6, 0x3c2f2753

    xor-int/2addr v5, v6

    const v6, -0x7d603d10

    goto/16 :goto_0

    :sswitch_12
    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_e

    :cond_d
    const-string v4, "\u06db\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x168f

    const v6, -0x715fbf88

    xor-int/2addr v5, v6

    const v6, 0xa227472

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u073a\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xfc5

    const v6, -0x7fba626b

    xor-int/2addr v5, v6

    const v6, -0x14133d16

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77fe7b66 -> :sswitch_6
        -0x7228a446 -> :sswitch_a
        -0x71f36ade -> :sswitch_11
        -0x6e7fb60d -> :sswitch_c
        -0x6624997d -> :sswitch_5
        -0x556d5fef -> :sswitch_2
        -0x528210e8 -> :sswitch_3
        -0x4cb36353 -> :sswitch_6
        -0x4c76e7f4 -> :sswitch_11
        -0x41c5e011 -> :sswitch_f
        -0x414cd12f -> :sswitch_4
        -0x3cb36fd6 -> :sswitch_1
        -0x2da39fa3 -> :sswitch_9
        -0x1daa1412 -> :sswitch_e
        -0x136e68b8 -> :sswitch_7
        -0xbaee5ef -> :sswitch_7
        -0x527e60a -> :sswitch_b
        -0x19f8276 -> :sswitch_0
        0x530555b -> :sswitch_4
        0x1161a5ed -> :sswitch_d
        0x1184139c -> :sswitch_3
        0x175599ed -> :sswitch_2
        0x1db0eb79 -> :sswitch_f
        0x2623ebe3 -> :sswitch_0
        0x27e60d4e -> :sswitch_a
        0x2cd24650 -> :sswitch_d
        0x43e37d62 -> :sswitch_12
        0x4d67a26a -> :sswitch_12
        0x4f69527a -> :sswitch_5
        0x5ad9bbfe -> :sswitch_8
        0x5ae7991e -> :sswitch_10
        0x63b38590 -> :sswitch_b
        0x643231d7 -> :sswitch_8
        0x65dcbed0 -> :sswitch_c
        0x66210ccb -> :sswitch_9
        0x69744fcc -> :sswitch_e
        0x704a8bc0 -> :sswitch_10
        0x733779d4 -> :sswitch_1
    .end sparse-switch
.end method

.method public static ۖ(Ll/ۜۜ᩺;)Z
    .locals 11

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const v5, 0x537f5c9

    sget v6, Ll/֡ܳ;->֡۠ۧ:I

    sget v7, Ll/۟;->ۨᩴۛ:I

    const-string v8, "\u06db\u1a75"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2c7d

    const v10, -0x5d774e9f

    xor-int/2addr v9, v10

    const v10, 0x694c072

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, 0x2a1f

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    const/4 v2, 0x1

    .line 141
    sget v8, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v8, :cond_2

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    sget v8, Ll/֨ۧ;->֫۠֡:I

    if-gtz v8, :cond_c

    goto/16 :goto_4

    .line 36
    :sswitch_1
    sget-boolean v8, Ll/֨ۖ;->۫ۗۜ:Z

    if-eqz v8, :cond_9

    goto/16 :goto_2

    .line 25
    :sswitch_2
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v8, Ll/֫ᩳ;->۬֨᩸:I

    if-lez v8, :cond_6

    goto/16 :goto_4

    .line 40
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    const/4 p0, 0x0

    return p0

    .line 169
    :sswitch_5
    iput-wide v3, p0, Ll/ۜۜ᩺;->֡:J

    return v2

    :sswitch_6
    const/4 p0, 0x0

    return p0

    :sswitch_7
    return v2

    .line 168
    :sswitch_8
    invoke-static {}, Ll/֨᩺;->۬ܽ᩻()J

    move-result-wide v8

    cmp-long v10, v8, v0

    if-lez v10, :cond_0

    const-string v8, "\u06dc\u06da"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4039

    const v10, 0x55cf52ce

    xor-int/2addr v9, v10

    const v10, -0x6cb65df

    goto :goto_0

    :cond_0
    const-string v8, "\u1a76\u06e8"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x77

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x291d

    const v10, -0x31900ed

    xor-int/2addr v9, v10

    const v10, -0x6ba66460

    goto :goto_0

    :sswitch_9
    const-wide/16 v3, 0x0

    cmp-long v8, v0, v3

    if-nez v8, :cond_1

    const-string v8, "\u05a8\u073f"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6cdb

    const v10, 0x33cc77c

    xor-int/2addr v9, v10

    const v10, 0x2ac19928

    goto/16 :goto_0

    :cond_1
    const-string v8, "\u06d9\u05a8"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x77

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2043

    const v10, -0x42f7fcc8

    xor-int/2addr v9, v10

    const v10, 0x5a46735c

    goto/16 :goto_0

    :cond_2
    const-string v8, "\u1a7a\u1a7a"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x641f

    const v10, -0x179adfac

    xor-int/2addr v9, v10

    const v10, 0xce9de30

    goto/16 :goto_0

    .line 75
    :sswitch_a
    sget v8, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v8, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v8, "\u073a\u06d7"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x614f

    const v10, 0x2d2e5c6

    xor-int/2addr v9, v10

    const v10, 0x62b0e0ba

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v8, Ll/᩶;->ۚۤۘ:Z

    if-eqz v8, :cond_4

    :goto_1
    const-string v8, "\u1a75\u06e0"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x45

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5eaf

    const v10, -0x3c391588

    xor-int/2addr v9, v10

    const v10, -0x3e60ea7a

    goto/16 :goto_0

    :cond_4
    const-string v8, "\u1a74\u06e1"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x380d

    const v10, 0x11259c39

    xor-int/2addr v9, v10

    const v10, 0x6e858b6e

    goto/16 :goto_0

    :sswitch_c
    sget v8, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v8, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v8, "\u06eb\u0733"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x47

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x3f19

    const v10, 0x7a8bcd59

    xor-int/2addr v9, v10

    const v10, -0x1b082425

    goto/16 :goto_0

    .line 145
    :sswitch_d
    sget v8, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v8, :cond_7

    :cond_6
    :goto_2
    const-string v8, "\u1a73\u06df"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x11

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x621b

    const v10, 0x488e4cd7

    xor-int/2addr v9, v10

    const v10, -0x711426c0

    goto/16 :goto_0

    :cond_7
    const-string v8, "\u073a\u06dc"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x2b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x13c5

    const v10, -0x5dfb7728

    xor-int/2addr v9, v10

    const v10, 0x7bceac0f

    goto/16 :goto_0

    :sswitch_e
    sget v8, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v8, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v8, "\u06db\u073a"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x6055

    const v10, 0x6210c451

    xor-int/2addr v9, v10

    const v10, -0x797febd

    goto/16 :goto_0

    :sswitch_f
    sget v8, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v8, :cond_a

    :cond_9
    const-string v8, "\u06e4\u06e7"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7923

    const v10, -0x731c263e

    xor-int/2addr v9, v10

    const v10, -0x2b89ba2d

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u06e8\u05a8"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x6acd

    const v10, -0x35b71364

    xor-int/2addr v9, v10

    const v10, -0x1e57dc71

    goto/16 :goto_0

    .line 48
    :sswitch_10
    sget-boolean v8, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v8, :cond_b

    goto :goto_4

    :cond_b
    const-string v8, "\u06db\u06db"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3a31

    const v10, 0x5069c875

    xor-int/2addr v9, v10

    const v10, -0x634cbb5d

    goto/16 :goto_0

    :sswitch_11
    sget v8, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v8, :cond_d

    :cond_c
    :goto_3
    const-string v8, "\u073f\u05a1"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0xb

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5a51

    const v10, -0x4519fcf2

    xor-int/2addr v9, v10

    const v10, -0x3c7051f1

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06eb\u06df"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2711

    const v10, -0x3420024

    xor-int/2addr v9, v10

    const v10, -0x1a269ca8

    goto/16 :goto_0

    .line 164
    :sswitch_12
    iget-wide v0, p0, Ll/ۜۜ᩺;->֡:J

    .line 90
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v8

    if-eqz v8, :cond_e

    :goto_4
    const-string v8, "\u0733\u06da"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x340f

    const v10, -0x647d3bf4

    xor-int/2addr v9, v10

    const v10, 0x457143af

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u0733\u06eb"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x39

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x375f

    const v10, -0xd45faef

    xor-int/2addr v9, v10

    const v10, -0xd54d0d7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b30452c -> :sswitch_c
        -0x75112de5 -> :sswitch_10
        -0x73ebd189 -> :sswitch_2
        -0x636d54dc -> :sswitch_e
        -0x5ff59225 -> :sswitch_d
        -0x5f4f3830 -> :sswitch_11
        -0x5b3aaea9 -> :sswitch_11
        -0x5b1d1b54 -> :sswitch_a
        -0x4e7839e4 -> :sswitch_8
        -0x4db31e36 -> :sswitch_0
        -0x41b4ee08 -> :sswitch_6
        -0x3b2ed71c -> :sswitch_f
        -0x37759387 -> :sswitch_f
        -0x330f8459 -> :sswitch_12
        -0x21aa6f38 -> :sswitch_3
        -0x1562484c -> :sswitch_2
        -0x127a68e8 -> :sswitch_c
        -0x4796336 -> :sswitch_a
        0x1ca48ad -> :sswitch_3
        0x93d7bc1 -> :sswitch_b
        0x13af6049 -> :sswitch_d
        0x197dd81f -> :sswitch_7
        0x1d13128f -> :sswitch_4
        0x2bccad60 -> :sswitch_e
        0x2fbdeb23 -> :sswitch_10
        0x33501470 -> :sswitch_5
        0x395520ec -> :sswitch_12
        0x3fc05ca6 -> :sswitch_1
        0x41bc9e62 -> :sswitch_4
        0x54882657 -> :sswitch_9
        0x5a8d1dbb -> :sswitch_9
        0x67bc5672 -> :sswitch_b
        0x6f7945d1 -> :sswitch_8
        0x71ca6a20 -> :sswitch_1
        0x72a39898 -> :sswitch_7
        0x775f0df8 -> :sswitch_5
        0x7a9b9469 -> :sswitch_0
        0x7fc4fabd -> :sswitch_6
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/ۜۜ᩺;)Ll/۬ۜ᩺;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۜ᩺;->ۨۙ:Ll/۬ۜ᩺;

    return-object p0
.end method

.method private ۙ(Landroid/view/MotionEvent;)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x18b96371

    sget v7, Ll/ۖܽ;->ܳ۠᩹:I

    sget v8, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v9, "\u05a1\u1a76"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x77b3

    const v11, 0x60e62a29

    xor-int/2addr v10, v11

    const v11, -0x41cf0181

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0x5c3d

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 420
    iput-boolean v1, p0, Ll/ۜۜ᩺;->۬ۙ:Z

    .line 375
    sget v9, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v9, :cond_6

    goto/16 :goto_5

    .line 201
    :sswitch_0
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    sget-boolean v9, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v9, :cond_7

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v9

    if-eqz v9, :cond_d

    goto/16 :goto_2

    :sswitch_2
    sget v9, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v9, :cond_b

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    goto/16 :goto_2

    .line 308
    :sswitch_4
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    return-void

    .line 429
    :sswitch_5
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v9

    invoke-interface {v9, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_1

    :sswitch_6
    return-void

    .line 423
    :sswitch_7
    iget v9, p0, Ll/ۜۜ᩺;->ۛ:I

    invoke-virtual {v3, v2, v9}, Ll/ܿܰۙ;->ۙ(II)V

    goto/16 :goto_3

    .line 427
    :sswitch_8
    invoke-static {p0}, Ll/᩶;->ۘ᩶֡(Ljava/lang/Object;)V

    .line 428
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v9

    if-eqz v9, :cond_0

    const-string v9, "\u0736\u073d"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x6f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x57ad

    const v11, 0x2d0fda44

    xor-int/2addr v10, v11

    const v11, 0x36482edb

    goto :goto_0

    :cond_0
    :goto_1
    const-string v9, "\u1a74\u06da"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x186d

    const v11, 0x222ed4db

    xor-int/2addr v10, v11

    const v11, 0x2bc5052b    # 1.3999126E-12f

    goto :goto_0

    .line 426
    :sswitch_9
    invoke-static {}, Ll/ۗܳ;->ۤܽۤ()J

    move-result-wide v9

    iput-wide v9, p0, Ll/ۜۜ᩺;->ۘۙ:J

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v9

    if-gtz v9, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v9, "\u06d9\u073f"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x667

    const v11, 0x1c51e0b6

    xor-int/2addr v10, v11

    const v11, 0x5ffbab2a

    goto/16 :goto_0

    :sswitch_a
    sub-float v9, v4, v5

    .line 425
    iput v9, p0, Ll/ۜۜ᩺;->᩸ۙ:F

    .line 61
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v9

    if-ltz v9, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v9, "\u1a76\u06e8"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0xae7

    const v11, 0x308cc733

    xor-int/2addr v10, v11

    const v11, -0x119ddfa3

    goto/16 :goto_0

    .line 425
    :sswitch_b
    iget v5, p0, Ll/ۜۜ᩺;->۫:F

    .line 388
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v9

    if-eqz v9, :cond_3

    :goto_2
    const-string v9, "\u073a\u06eb"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x6f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x2cd3

    const v11, 0x56f2b5ae

    xor-int/2addr v10, v11

    const v11, 0x47f7e714

    goto/16 :goto_0

    :cond_3
    const-string v9, "\u073d\u1a77"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6a1f

    const v11, -0x6ba09967

    xor-int/2addr v10, v11

    const v11, -0x2489ddb9

    goto/16 :goto_0

    .line 425
    :sswitch_c
    iget-object v4, p0, Ll/ۜۜ᩺;->ۙۙ:Ll/᩹ܺ᩺;

    iget v4, v4, Ll/᩹ܺ᩺;->ۚ:F

    .line 330
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v9

    if-eqz v9, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v9, "\u06eb\u1a77"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x516f

    const v11, -0x2a50d67b

    xor-int/2addr v10, v11

    const v11, -0xdd2e13

    goto/16 :goto_0

    :sswitch_d
    const/4 v2, 0x1

    .line 421
    iput-boolean v2, p0, Ll/ۜۜ᩺;->ᩴۙ:Z

    .line 422
    iget-object v3, p0, Ll/ۜۜ᩺;->ܿ:Ll/ܿܰۙ;

    if-eqz v3, :cond_5

    const-string v9, "\u06d8\u1a78"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x4d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6297

    const v11, 0xff14aeb

    xor-int/2addr v10, v11

    const v11, 0x7e1cc5bc

    goto/16 :goto_0

    :cond_5
    :goto_3
    const-string v9, "\u0733\u06eb"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x69

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x6739

    const v11, 0x22b84991

    xor-int/2addr v10, v11

    const v11, -0x12067252

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u1a76\u06e0"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3583

    const v11, 0x391a08b7

    xor-int/2addr v10, v11

    const v11, -0x528ac31

    goto/16 :goto_0

    .line 419
    :sswitch_e
    invoke-direct {p0, p1}, Ll/ۜۜ᩺;->ܰ(Landroid/view/MotionEvent;)V

    const/4 v1, 0x0

    .line 19
    sget v9, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v9, :cond_8

    :cond_7
    :goto_4
    const-string v9, "\u1a7a\u073a"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6155

    const v11, -0x35def441

    xor-int/2addr v10, v11

    const v11, 0x76cc6fad

    goto/16 :goto_0

    :cond_8
    const-string v9, "\u06e0\u06e2"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x53

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x20d9

    const v11, -0x515d2568

    xor-int/2addr v10, v11

    const v11, -0x4418eff6

    goto/16 :goto_0

    .line 418
    :sswitch_f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    iput v9, p0, Ll/ۜۜ᩺;->۫:F

    sget-boolean v9, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v9, :cond_9

    goto :goto_5

    :cond_9
    const-string v9, "\u06da\u0733"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x7993

    const v11, 0x779c1aa2

    xor-int/2addr v10, v11

    const v11, 0x6e9503c7

    goto/16 :goto_0

    .line 417
    :sswitch_10
    iput v0, p0, Ll/ۜۜ᩺;->ܽ:F

    .line 392
    sget-boolean v9, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v9, :cond_a

    :goto_5
    const-string v9, "\u073f\u0730"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x47

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x4e1b

    const v11, 0x1dcf1415

    xor-int/2addr v10, v11

    const v11, 0x7510c9db

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u05a8\u1a79"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x6b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x5d1

    const v11, 0x2d0b3d01

    xor-int/2addr v10, v11

    const v11, -0x6447e81d

    goto/16 :goto_0

    .line 417
    :sswitch_11
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v9

    if-nez v9, :cond_c

    :cond_b
    const-string v9, "\u0733\u1a76"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x22f3

    const v11, 0x546d4674

    xor-int/2addr v10, v11

    const v11, -0x187bfc9a

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u06dc\u06ec"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x4127

    const v11, 0x4b3147f6    # 1.1618294E7f

    xor-int/2addr v10, v11

    const v11, -0x561a5fd5

    goto/16 :goto_0

    .line 292
    :sswitch_12
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v9

    if-eqz v9, :cond_e

    :cond_d
    :goto_6
    const-string v9, "\u1a76\u06ec"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x587d

    const v11, 0x68a65644

    xor-int/2addr v10, v11

    const v11, 0x1bc291ae

    goto/16 :goto_0

    :cond_e
    const-string v9, "\u06e4\u06da"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x25

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x7bad

    const v11, -0xccfa29d

    xor-int/2addr v10, v11

    const v11, 0x18106249

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a2d9c4e -> :sswitch_10
        -0x5cb8ca13 -> :sswitch_12
        -0x5a4338ba -> :sswitch_11
        -0x4eb0072a -> :sswitch_0
        -0x4981fe7f -> :sswitch_10
        -0x47b5304d -> :sswitch_6
        -0x3de79714 -> :sswitch_9
        -0x3b125d59 -> :sswitch_a
        -0x28773930 -> :sswitch_d
        -0x1daadd9a -> :sswitch_b
        -0x1ac8bdc3 -> :sswitch_8
        -0x185c947e -> :sswitch_d
        -0x150c2542 -> :sswitch_c
        -0xce9e7f8 -> :sswitch_9
        -0xc70e4ef -> :sswitch_4
        -0x50c065e -> :sswitch_3
        0x1cf66c9 -> :sswitch_1
        0x6b6a9ff -> :sswitch_2
        0xf81b87b -> :sswitch_5
        0x19ab1767 -> :sswitch_a
        0x1ada0c0c -> :sswitch_c
        0x1aea2d99 -> :sswitch_f
        0x2bdabf5c -> :sswitch_b
        0x2e4bb04c -> :sswitch_12
        0x2e8cd7f4 -> :sswitch_11
        0x345d45f7 -> :sswitch_6
        0x36fc582d -> :sswitch_5
        0x3c47367a -> :sswitch_2
        0x40600a96 -> :sswitch_8
        0x42960485 -> :sswitch_4
        0x42a416c5 -> :sswitch_7
        0x51e053fe -> :sswitch_f
        0x5d670599 -> :sswitch_7
        0x69542997 -> :sswitch_1
        0x73e2db39 -> :sswitch_e
        0x75e68e11 -> :sswitch_0
        0x7d5124ef -> :sswitch_e
        0x7ec16d30 -> :sswitch_3
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/ۜۜ᩺;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۜۜ᩺;->ۗ:J

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۜۜ᩺;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ۜۜ᩺;->ۢ:Z

    return-void
.end method

.method public static synthetic ۙ(Ll/ۜۜ᩺;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x52a6c505

    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    const-string v5, "\u05ab\u06e2"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x1f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3591

    const v7, -0x27ea1014

    xor-int/2addr v6, v7

    const v7, -0x147fc294

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x1309

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 753
    iget-object v0, p0, Ll/ۜۜ᩺;->ܺ:Landroid/view/View$OnTouchListener;

    if-eqz v0, :cond_2

    const-string v5, "\u1a73\u073f"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xbe9

    const v7, -0x2190624e

    xor-int/2addr v6, v7

    const v7, 0x5ab552f4

    goto :goto_0

    .line 103
    :sswitch_0
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v5

    if-gtz v5, :cond_b

    goto/16 :goto_4

    .line 506
    :sswitch_1
    sget v5, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v5, :cond_8

    goto/16 :goto_4

    .line 436
    :sswitch_2
    sget v5, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v5, :cond_d

    goto :goto_1

    .line 135
    :sswitch_3
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    :goto_1
    const-string v5, "\u05ab\u06da"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x39cd

    const v7, 0x683417bc

    xor-int/2addr v6, v7

    const v7, -0x3f4cc338

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    const/4 p0, 0x1

    return p0

    .line 757
    :sswitch_6
    invoke-static {v1}, Ll/֡۠;->ۗۛۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View$OnTouchListener;

    .line 758
    invoke-interface {v5, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "\u1a74\u06ec"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x37

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4f63

    const v7, 0x28c5eb66

    xor-int/2addr v6, v7

    const v7, -0x361fe840    # -1835768.0f

    goto :goto_0

    :sswitch_7
    const/4 p0, 0x0

    return p0

    .line 757
    :sswitch_8
    invoke-static {v1}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "\u06e0\u06dc"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x31

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4a85

    const v7, 0x674f0193

    xor-int/2addr v6, v7

    const v7, 0x265cce89

    goto/16 :goto_0

    :cond_0
    const-string v5, "\u06e8\u073a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x17

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1d1b

    const v7, 0x464fb008

    xor-int/2addr v6, v7

    const v7, -0x110cc0e5

    goto/16 :goto_0

    .line 755
    :sswitch_9
    invoke-interface {v0, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_2

    .line 757
    :sswitch_a
    iget-object v1, p0, Ll/ۜۜ᩺;->ᩳۙ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۗܺ;->֡ۙۚ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    const-string v5, "\u06e0\u06d6"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6f8d

    const v7, -0x39cb00c9

    xor-int/2addr v6, v7

    const v7, 0xf10f404

    goto/16 :goto_0

    :cond_2
    :goto_2
    const-string v5, "\u06d6\u06ec"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4f0f

    const v7, 0x366f0dc3

    xor-int/2addr v6, v7

    const v7, -0x1432d683

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֫;->ܶܺ᩻:I

    if-ltz v5, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v5, "\u073a\u06d8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2ad9

    const v7, -0x3b457324

    xor-int/2addr v6, v7

    const v7, 0x64dc8e51

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v5, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v5, "\u073a\u06ec"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x49

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4dbd

    const v7, 0x6082053c

    xor-int/2addr v6, v7

    const v7, -0x506f29d

    goto/16 :goto_0

    .line 84
    :sswitch_d
    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v5, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v5, "\u06ec\u073d"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x5d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x10b5

    const v7, 0x33b8051c

    xor-int/2addr v6, v7

    const v7, 0x4b2088ed    # 1.0520813E7f

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v5

    if-gtz v5, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v5, "\u1a7a\u05a8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1c3f

    const v7, -0x30c50957

    xor-int/2addr v6, v7

    const v7, -0x7cec60fe

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u06eb\u06d7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6535

    const v7, -0x4a94ddda

    xor-int/2addr v6, v7

    const v7, -0xbd3858d

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v5, :cond_9

    :cond_8
    const-string v5, "\u1a7a\u06ec"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1c39

    const v7, 0x4bd5ca48    # 2.8021904E7f

    xor-int/2addr v6, v7

    const v7, 0x5f42df0c

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u1a74\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x38bd

    const v7, 0xa4cc1a9

    xor-int/2addr v6, v7

    const v7, 0x7e894075

    goto/16 :goto_0

    .line 80
    :sswitch_11
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v5

    if-eqz v5, :cond_a

    goto/16 :goto_5

    :cond_a
    const-string v5, "\u1a78\u0733"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xd3f

    const v7, 0x8f5673b

    xor-int/2addr v6, v7

    const v7, -0x3a3fb4ac

    goto/16 :goto_0

    .line 103
    :sswitch_12
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v5

    if-gtz v5, :cond_c

    :cond_b
    :goto_3
    const-string v5, "\u06d6\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x2f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x394d

    const v7, -0x7c5bf1b8

    xor-int/2addr v6, v7

    const v7, -0x58462999

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a76\u073f"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3787

    const v7, -0x3b5962f3

    xor-int/2addr v6, v7

    const v7, -0x4173f32f

    goto/16 :goto_0

    :sswitch_13
    sget-boolean v5, Ll/᩶;->ۚۤۘ:Z

    if-eqz v5, :cond_e

    :cond_d
    :goto_4
    const-string v5, "\u06e1\u06e4"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3f5d

    const v7, 0x3603c3a8

    xor-int/2addr v6, v7

    const v7, -0x37bc1b82

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u06e4\u1a74"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x203b

    const v7, 0x4bb7d9de    # 2.4097724E7f

    xor-int/2addr v6, v7

    const v7, -0x37d0dd1a

    goto/16 :goto_0

    .line 488
    :sswitch_14
    sget v5, Ll/۟;->ۨᩴۛ:I

    if-ltz v5, :cond_f

    :goto_5
    const-string v5, "\u1a7a\u0730"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3e4b

    const v7, -0x61cb87b5

    xor-int/2addr v6, v7

    const v7, 0x56086eec

    goto/16 :goto_0

    :cond_f
    const-string v5, "\u073d\u0736"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x765b

    const v7, -0x3923747b

    xor-int/2addr v6, v7

    const v7, 0x1b596d75

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c4953a4 -> :sswitch_6
        -0x79e3ec7c -> :sswitch_d
        -0x7791161c -> :sswitch_14
        -0x66890d38 -> :sswitch_0
        -0x60ac49a8 -> :sswitch_4
        -0x5e5be6c9 -> :sswitch_12
        -0x543364e0 -> :sswitch_e
        -0x52f1d514 -> :sswitch_b
        -0x526f57e5 -> :sswitch_2
        -0x38417be4 -> :sswitch_c
        -0x230f668d -> :sswitch_d
        -0x1e90f4b9 -> :sswitch_11
        -0x1bb8c73f -> :sswitch_f
        -0x6ae2c0e -> :sswitch_7
        -0x5bcf3af -> :sswitch_6
        0x329333d -> :sswitch_12
        0x456347b -> :sswitch_2
        0x55655c7 -> :sswitch_9
        0xb39b511 -> :sswitch_5
        0xf3f11dc -> :sswitch_1
        0x1be868c1 -> :sswitch_a
        0x1fc5713d -> :sswitch_4
        0x2b18cf03 -> :sswitch_14
        0x2f8a7393 -> :sswitch_8
        0x3299f806 -> :sswitch_e
        0x36527457 -> :sswitch_11
        0x3df3f284 -> :sswitch_1
        0x43325407 -> :sswitch_0
        0x44b9b6f3 -> :sswitch_13
        0x47ff150b -> :sswitch_3
        0x50de73d5 -> :sswitch_9
        0x528e7a0e -> :sswitch_3
        0x53a9bb48 -> :sswitch_b
        0x58a96450 -> :sswitch_8
        0x5c25e357 -> :sswitch_f
        0x5f0e32bc -> :sswitch_10
        0x61871e3f -> :sswitch_13
        0x70567bf4 -> :sswitch_7
        0x7100b1f8 -> :sswitch_a
        0x77600bd7 -> :sswitch_c
        0x77787cb3 -> :sswitch_5
        0x77f468b0 -> :sswitch_10
    .end sparse-switch
.end method

.method public static ۙ(Ll/ۜۜ᩺;Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 16

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x58ebeb1a

    sget v6, Ll/֨ۢ;->ۢ۬ۧ:I

    sget v7, Ll/֫֡;->ۡ᩹ۗ:I

    const-string v8, "\u05a8\u1a74"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x21

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4f0f

    const v10, -0x4e591e23

    xor-int/2addr v9, v10

    const v10, -0x7bca871a

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, -0x5e7d

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 589
    iget-object v1, v0, Ll/ۜۜ᩺;->᩹ۙ:Landroid/widget/AdapterView$OnItemLongClickListener;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    const-string v8, "\u073d\u06ec"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x13

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x50cd

    const v10, -0xe4f3cc0

    xor-int/2addr v9, v10

    const v10, 0x4588c54b

    goto :goto_0

    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget-boolean v8, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v8, :cond_4

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    sget v8, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v8, :cond_b

    goto/16 :goto_7

    :sswitch_2
    sget-boolean v8, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v8, :cond_8

    goto/16 :goto_7

    .line 359
    :sswitch_3
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    goto/16 :goto_7

    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    const/4 v0, 0x0

    return v0

    .line 384
    :sswitch_5
    iput-boolean v3, v0, Ll/ۜۜ᩺;->ۚۙ:Z

    .line 385
    iput-boolean v2, v0, Ll/ۜۜ᩺;->۬ۙ:Z

    goto :goto_1

    :sswitch_6
    return v4

    :sswitch_7
    const/4 v4, 0x1

    goto :goto_2

    :sswitch_8
    if-eqz v4, :cond_0

    const-string v8, "\u1a73\u073f"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x7

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5a2f

    const v10, -0x4ef2b9f1

    xor-int/2addr v9, v10

    const v10, 0x446ccab0

    goto :goto_0

    :cond_0
    :goto_1
    const-string v8, "\u06d7\u06da"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x21

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3f0d

    const v10, 0x96d23b3

    xor-int/2addr v9, v10

    const v10, -0x1225b97a

    goto/16 :goto_0

    :sswitch_9
    move-object v10, v1

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move/from16 v13, p3

    move-wide/from16 v14, p4

    .line 590
    invoke-interface/range {v10 .. v15}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    move-result v8

    if-eqz v8, :cond_1

    const-string v8, "\u073f\u1a74"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x57

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x30db

    const v10, 0x4dd2de8f    # 4.4222512E8f

    xor-int/2addr v9, v10

    const v10, 0x2a1ad895

    goto/16 :goto_0

    :sswitch_a
    const/4 v4, 0x0

    :goto_2
    const-string v8, "\u0733\u06db"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x35

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2db1

    const v10, -0x6fd2242e

    xor-int/2addr v9, v10

    const v10, 0x7fd11376

    goto/16 :goto_0

    :cond_1
    const-string v8, "\u06d9\u05ab"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x734b

    const v10, -0x711bac99

    xor-int/2addr v9, v10

    const v10, -0x4772dcdc

    goto/16 :goto_0

    .line 348
    :sswitch_b
    sget v8, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v8, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v8, "\u1a74\u06e8"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x9ed

    const v10, -0x7ca321a3

    xor-int/2addr v9, v10

    const v10, -0x307337f2

    goto/16 :goto_0

    .line 553
    :sswitch_c
    sget v8, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v8, :cond_3

    goto :goto_3

    :cond_3
    const-string v8, "\u073a\u1a74"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x6b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x6e89

    const v10, 0x7cc6bcf5

    xor-int/2addr v9, v10

    const v10, 0x4953e7cd

    goto/16 :goto_0

    .line 355
    :sswitch_d
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v8

    if-gtz v8, :cond_5

    :cond_4
    :goto_3
    const-string v8, "\u1a79\u06e4"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0xa07

    const v10, -0x33afae2e    # -5.4609736E7f

    xor-int/2addr v9, v10

    const v10, 0x73c1a4bc

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u1a78\u06d9"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5c57

    const v10, 0x23d5916c

    xor-int/2addr v9, v10

    const v10, -0x6be22d61

    goto/16 :goto_0

    .line 544
    :sswitch_e
    sget v8, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v8, :cond_6

    goto :goto_4

    :cond_6
    const-string v8, "\u073f\u06e0"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x71

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x89f

    const v10, 0x3c3be199

    xor-int/2addr v9, v10

    const v10, 0x13e6842d

    goto/16 :goto_0

    .line 475
    :sswitch_f
    sget-boolean v8, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v8, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v8, "\u1a7a\u06da"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x73

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3615

    const v10, -0x6b5a224d

    xor-int/2addr v9, v10

    const v10, -0x2d4e2a99

    goto/16 :goto_0

    :sswitch_10
    sget v8, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v8, :cond_9

    :cond_8
    :goto_4
    const-string v8, "\u1a78\u06e0"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x71

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x4507

    const v10, -0x14da1f04

    xor-int/2addr v9, v10

    const v10, -0x7f1db844

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u06ec\u06db"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x17

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x1391

    const v10, 0x590fcca8

    xor-int/2addr v9, v10

    const v10, 0x2db77859

    goto/16 :goto_0

    .line 59
    :sswitch_11
    sget v8, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v8, :cond_a

    :goto_5
    const-string v8, "\u06ec\u1a74"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x496b

    const v10, 0x4f09a7f

    xor-int/2addr v9, v10

    const v10, 0x6b4051c9    # 2.3249998E26f

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u06d9\u073f"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x3d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x44b9

    const v10, 0x221a5175

    xor-int/2addr v9, v10

    const v10, 0x214b52b

    goto/16 :goto_0

    :sswitch_12
    sget v8, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v8, :cond_c

    :cond_b
    :goto_6
    const-string v8, "\u073d\u06d8"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6c21

    const v10, -0x22bef361

    xor-int/2addr v9, v10

    const v10, 0x43d6b3e

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u1a75\u05ab"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x6b0f

    const v10, 0x5d470ac6

    xor-int/2addr v9, v10

    const v10, -0x317edd45

    goto/16 :goto_0

    .line 487
    :sswitch_13
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v8

    if-eqz v8, :cond_d

    goto :goto_7

    :cond_d
    const-string v8, "\u1a76\u06d9"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x6f41

    const v10, -0x148185f6

    xor-int/2addr v9, v10

    const v10, 0x59a5fb09

    goto/16 :goto_0

    .line 233
    :sswitch_14
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v8

    if-ltz v8, :cond_e

    :goto_7
    const-string v8, "\u06db\u1a79"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4457

    const v10, 0x7d17ad49

    xor-int/2addr v9, v10

    const v10, -0x34233363    # -2.8940602E7f

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u1a77\u06d6"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x3f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5f63

    const v10, 0x5419b61c

    xor-int/2addr v9, v10

    const v10, -0x7f147947

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c5f4449 -> :sswitch_3
        -0x75a6bf74 -> :sswitch_12
        -0x62eda585 -> :sswitch_14
        -0x56d63980 -> :sswitch_6
        -0x44269f82 -> :sswitch_b
        -0x4319be85 -> :sswitch_4
        -0x40b07acc -> :sswitch_a
        -0x35f80531 -> :sswitch_9
        -0x356ca6e9 -> :sswitch_1
        -0x33842ba3 -> :sswitch_c
        -0x32c76911 -> :sswitch_8
        -0x2f2bd964 -> :sswitch_2
        -0x2b738736 -> :sswitch_2
        -0x29f8c8b5 -> :sswitch_8
        -0x25874a11 -> :sswitch_3
        -0x2382aa35 -> :sswitch_13
        -0x236fb5f3 -> :sswitch_f
        -0x1a6fc9d1 -> :sswitch_b
        -0x186ff5fc -> :sswitch_13
        -0xf709a7b -> :sswitch_5
        -0xdcf0141 -> :sswitch_d
        -0xc0e54a6 -> :sswitch_c
        -0x2407a00 -> :sswitch_5
        0x1c3fd89 -> :sswitch_12
        0x5303d82 -> :sswitch_11
        0xab60c5f -> :sswitch_e
        0x12474bee -> :sswitch_10
        0x16374d04 -> :sswitch_14
        0x1b6dd6ac -> :sswitch_4
        0x1e33efa2 -> :sswitch_11
        0x2098fd7e -> :sswitch_9
        0x2ba7a294 -> :sswitch_1
        0x33259d62 -> :sswitch_0
        0x39c9447f -> :sswitch_7
        0x3e99a049 -> :sswitch_d
        0x4d438790 -> :sswitch_f
        0x5e5ef3a1 -> :sswitch_10
        0x683c0e19 -> :sswitch_a
        0x6ccce57a -> :sswitch_e
        0x770c903c -> :sswitch_6
        0x77623383 -> :sswitch_7
        0x7ce2ed29 -> :sswitch_0
    .end sparse-switch
.end method

.method private ۚ()Z
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x87e2ed

    sget v8, Ll/֡ܳ;->֡۠ۧ:I

    sget v9, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v10, "\u06e7\u1a73"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x51

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x66d5

    const v12, -0x92eedec

    xor-int/2addr v11, v12

    const v12, -0x77284076

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, 0x4a37

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    sub-int v10, v2, v3

    if-lez v10, :cond_12

    const-string v10, "\u1a7a\u06e7"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x5ae7

    const v12, -0x3e3e7417

    xor-int/2addr v11, v12

    const v12, -0x7dfeba1f

    goto :goto_0

    .line 251
    :sswitch_0
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v10

    if-lez v10, :cond_10

    goto/16 :goto_5

    .line 137
    :sswitch_1
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v10

    if-gez v10, :cond_b

    goto/16 :goto_8

    .line 61
    :sswitch_2
    sget-boolean v10, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v10, :cond_6

    goto/16 :goto_6

    .line 197
    :sswitch_3
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget v10, Ll/֡ۛ;->۬᩸ܶ:I

    if-nez v10, :cond_d

    goto :goto_1

    .line 282
    :sswitch_4
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    sget v10, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v10, :cond_9

    goto :goto_2

    :sswitch_5
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget v10, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v10, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v10, "\u1a73\u06d7"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x25

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x751b

    const v12, -0x53d294ad

    xor-int/2addr v11, v12

    const v12, -0x1c7c2ed6

    goto :goto_0

    .line 108
    :sswitch_6
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    :goto_2
    const-string v10, "\u06d7\u06e4"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5de9

    const v12, -0x22ba888

    xor-int/2addr v11, v12

    const v12, -0x911d322

    goto/16 :goto_0

    .line 151
    :sswitch_7
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    const/4 v0, 0x0

    return v0

    .line 363
    :sswitch_8
    iget-boolean v10, p0, Ll/ۜۜ᩺;->۬ۙ:Z

    if-eqz v10, :cond_12

    goto/16 :goto_3

    :sswitch_9
    iget-boolean v10, p0, Ll/ۜۜ᩺;->ᩴۙ:Z

    if-nez v10, :cond_3

    const-string v10, "\u1a7b\u05ab"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3add

    const v12, 0x79358295

    xor-int/2addr v11, v12

    const v12, 0x269058ec

    goto/16 :goto_0

    :sswitch_a
    const/4 v0, 0x1

    return v0

    :sswitch_b
    div-float v10, v4, v6

    const/high16 v11, 0x40600000    # 3.5f

    cmpl-float v10, v10, v11

    if-lez v10, :cond_12

    goto/16 :goto_4

    :sswitch_c
    int-to-float v6, v5

    sget v10, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v10, :cond_1

    goto/16 :goto_9

    :cond_1
    const-string v10, "\u06dc\u1a75"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x61

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x513

    const v12, 0x32305249

    xor-int/2addr v11, v12

    const v12, -0x71c1f0cd

    goto/16 :goto_0

    :sswitch_d
    int-to-float v4, v2

    .line 353
    invoke-virtual {p0}, Ll/ۜۜ᩺;->ۙ()I

    move-result v5

    sget v10, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v10, :cond_2

    goto/16 :goto_9

    :cond_2
    const-string v10, "\u06d7\u05a8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x67

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x34c5

    const v12, 0xee52747

    xor-int/2addr v11, v12

    const v12, 0x7784e4f6

    goto/16 :goto_0

    .line 363
    :sswitch_e
    iget-boolean v10, p0, Ll/ۜۜ᩺;->ܰۙ:Z

    if-nez v10, :cond_3

    const-string v10, "\u06e7\u0733"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x15

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4bf3

    const v12, -0x65139482

    xor-int/2addr v11, v12

    const v12, -0x2d8aade5

    goto/16 :goto_0

    :cond_3
    :goto_3
    const-string v10, "\u06e2\u073d"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x15

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6c9

    const v12, -0x35ca898a

    xor-int/2addr v11, v12

    const v12, -0xf5127d6

    goto/16 :goto_0

    .line 351
    :sswitch_f
    iget-boolean v10, p0, Ll/ۜۜ᩺;->ᩴۙ:Z

    if-nez v10, :cond_4

    const-string v10, "\u0733\u06ec"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x2b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x42ed

    const v12, -0x626c54ac

    xor-int/2addr v11, v12

    const v12, -0x480b4a1b

    goto/16 :goto_0

    :cond_4
    :goto_4
    const-string v10, "\u0733\u1a74"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x9

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x79f3

    const v12, -0x4e0f1833

    xor-int/2addr v11, v12

    const v12, 0x40a3ab29

    goto/16 :goto_0

    .line 349
    :sswitch_10
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getCount()I

    move-result v2

    .line 350
    invoke-static {p0}, Ll/֫ܶ;->ᩴ۬֫(Ljava/lang/Object;)I

    move-result v3

    if-lez v3, :cond_12

    const-string v10, "\u1a77\u06e7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4ec3

    const v12, -0x19f08f0d

    xor-int/2addr v11, v12

    const v12, 0x6448a6e8

    goto/16 :goto_0

    .line 370
    :sswitch_11
    iget v10, v0, Ll/᩹ܺ᩺;->ۙ:F

    iget v11, v0, Ll/᩹ܺ᩺;->ۚ:F

    cmpl-float v10, v10, v11

    if-lez v10, :cond_12

    const-string v10, "\u1a73\u06e1"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4b61

    const v12, -0x11994c86

    xor-int/2addr v11, v12

    const v12, -0x40139575

    goto/16 :goto_0

    :sswitch_12
    iget v10, v0, Ll/᩹ܺ᩺;->ܰ:F

    cmpl-float v10, v1, v10

    if-lez v10, :cond_12

    const-string v10, "\u06eb\u1a7a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7a5b

    const v12, -0x365ff912

    xor-int/2addr v11, v12

    const v12, -0xe52276a

    goto/16 :goto_0

    .line 297
    :sswitch_13
    sget v10, Ll/֫;->ܶܺ᩻:I

    if-ltz v10, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v10, "\u0730\u06d7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x63

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x775d

    const v12, -0x1b433233

    xor-int/2addr v11, v12

    const v12, -0x32e5384d

    goto/16 :goto_0

    .line 181
    :sswitch_14
    sget v10, Ll/۟;->ۨᩴۛ:I

    if-ltz v10, :cond_7

    :cond_6
    :goto_5
    const-string v10, "\u06e1\u0736"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1f79

    const v12, 0x50aded38

    xor-int/2addr v11, v12

    const v12, 0x4cffcadd    # 1.34108904E8f

    goto/16 :goto_0

    :cond_7
    const-string v10, "\u06e1\u1a7b"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x26b1

    const v12, 0x158a3552

    xor-int/2addr v11, v12

    const v12, 0xad7f233

    goto/16 :goto_0

    .line 134
    :sswitch_15
    sget v10, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v10, :cond_8

    goto/16 :goto_9

    :cond_8
    const-string v10, "\u06e1\u06d8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x7d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7da9

    const v12, 0x51e3877b

    xor-int/2addr v11, v12

    const v12, -0x49528985

    goto/16 :goto_0

    :sswitch_16
    sget-boolean v10, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v10, :cond_a

    :cond_9
    :goto_6
    const-string v10, "\u073a\u073a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x7b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1ce3

    const v12, -0x6229c362

    xor-int/2addr v11, v12

    const v12, 0x5530143b    # 1.2100058E13f

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u1a76\u06dc"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x1d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3257

    const v12, -0x1cef3625

    xor-int/2addr v11, v12

    const v12, 0x32fcced6

    goto/16 :goto_0

    :sswitch_17
    sget v10, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v10, :cond_c

    :cond_b
    :goto_7
    const-string v10, "\u0736\u1a78"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x3d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6e8d

    const v12, -0x4d90eea5

    xor-int/2addr v11, v12

    const v12, 0x8a549c6

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u1a7b\u05a1"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x9

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1311

    const v12, 0x2687ff68

    xor-int/2addr v11, v12

    const v12, 0x754e3ad4

    goto/16 :goto_0

    .line 222
    :sswitch_18
    sget v10, Ll/ۗ;->֨۬ۖ:I

    if-ltz v10, :cond_e

    :cond_d
    :goto_8
    const-string v10, "\u1a74\u1a79"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x28e7

    const v12, -0x1802b85d

    xor-int/2addr v11, v12

    const v12, -0x4e157291

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u06dc\u06d6"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x41

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x16a1

    const v12, -0x29ba3852

    xor-int/2addr v11, v12

    const v12, 0x4afb79de    # 8240367.0f

    goto/16 :goto_0

    .line 332
    :sswitch_19
    sget v10, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v10, :cond_f

    :goto_9
    const-string v10, "\u06e4\u06e0"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5f4d

    const v12, 0x958dc3b

    xor-int/2addr v11, v12

    const v12, -0x48551d0

    goto/16 :goto_0

    :cond_f
    const-string v10, "\u06e4\u073a"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x6d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x415b

    const v12, 0x7c208d23

    xor-int/2addr v11, v12

    const v12, -0x7423147a

    goto/16 :goto_0

    .line 370
    :sswitch_1a
    iget-object v0, p0, Ll/ۜۜ᩺;->ۙۙ:Ll/᩹ܺ᩺;

    iget v1, v0, Ll/᩹ܺ᩺;->ۖ:F

    sget v10, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v10, :cond_11

    :cond_10
    const-string v10, "\u06e2\u06da"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5e7d

    const v12, -0x2987faf5

    xor-int/2addr v11, v12

    const v12, -0x3f15d42

    goto/16 :goto_0

    :cond_11
    const-string v10, "\u05a1\u0733"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x363b

    const v12, -0x3c0a973c

    xor-int/2addr v11, v12

    const v12, -0x1c3fa362

    goto/16 :goto_0

    :sswitch_1b
    const/4 v0, 0x0

    return v0

    .line 360
    :sswitch_1c
    iget-boolean v10, p0, Ll/ۜۜ᩺;->ۖۙ:Z

    if-eqz v10, :cond_12

    const-string v10, "\u06eb\u06e1"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x225b

    const v12, 0xaf3d824

    xor-int/2addr v11, v12

    const v12, -0x5aa974c9

    goto/16 :goto_0

    :cond_12
    const-string v10, "\u06e2\u1a7b"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x172f

    const v12, 0x2d2a71ba

    xor-int/2addr v11, v12

    const v12, 0x4c17b674    # 3.9770576E7f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77919c82 -> :sswitch_13
        -0x74a46b05 -> :sswitch_12
        -0x7326f73e -> :sswitch_2
        -0x6e957f55 -> :sswitch_14
        -0x6e155b7d -> :sswitch_16
        -0x66180c42 -> :sswitch_8
        -0x65c06737 -> :sswitch_f
        -0x60f88cb6 -> :sswitch_1
        -0x5bd7699d -> :sswitch_e
        -0x5b93365f -> :sswitch_1
        -0x548e62a7 -> :sswitch_17
        -0x5173beec -> :sswitch_7
        -0x51587a31 -> :sswitch_2
        -0x4f43f1ba -> :sswitch_a
        -0x476c6c3d -> :sswitch_8
        -0x3dbbf4a3 -> :sswitch_d
        -0x36a73046 -> :sswitch_15
        -0x31cef111 -> :sswitch_7
        -0x31c5b9c6 -> :sswitch_d
        -0x2f016d5c -> :sswitch_0
        -0x2de857ee -> :sswitch_1b
        -0x2d0018e9 -> :sswitch_3
        -0x2b7a24d9 -> :sswitch_15
        -0x29e45529 -> :sswitch_b
        -0x262d96fb -> :sswitch_19
        -0x2450ab5e -> :sswitch_9
        -0x195589b6 -> :sswitch_5
        -0x1872189e -> :sswitch_10
        -0x16748b33 -> :sswitch_4
        -0x138c1c97 -> :sswitch_14
        -0xccd3d83 -> :sswitch_b
        -0x76a8f97 -> :sswitch_1c
        -0x2cb1eba -> :sswitch_1a
        0x10e522da -> :sswitch_9
        0x11ab0273 -> :sswitch_16
        0x1a72b6a8 -> :sswitch_c
        0x1c028ff3 -> :sswitch_f
        0x222120d2 -> :sswitch_18
        0x24a4e945 -> :sswitch_4
        0x253827dd -> :sswitch_6
        0x28e2fd0b -> :sswitch_12
        0x2a751ffb -> :sswitch_18
        0x36064d65 -> :sswitch_11
        0x370fe72a -> :sswitch_3
        0x40c4e740 -> :sswitch_5
        0x4993cfb9 -> :sswitch_1b
        0x4c46b165 -> :sswitch_a
        0x4c49e572 -> :sswitch_10
        0x52b5aaae -> :sswitch_13
        0x5f18e016 -> :sswitch_6
        0x6087f297 -> :sswitch_17
        0x657a83f3 -> :sswitch_0
        0x6a798758 -> :sswitch_1a
        0x6ea6bbf2 -> :sswitch_c
        0x6fadd9c6 -> :sswitch_11
        0x734b2821 -> :sswitch_e
        0x7dc01893 -> :sswitch_19
        0x7e385ea1 -> :sswitch_1c
    .end sparse-switch
.end method

.method public static bridge synthetic ۚ(Ll/ۜۜ᩺;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۜۜ᩺;->᩹()Z

    move-result p0

    return p0
.end method

.method public static ۨ(Ll/ۜۜ᩺;)V
    .locals 10

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    const v4, -0x170f7491

    sget v5, Ll/ۘۗ;->ۖۧ۬:I

    sget v6, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v7, "\u06d9\u06e2"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x23

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2aff

    const v9, 0xefa8a5a

    xor-int/2addr v8, v9

    const v9, -0x3fc84f7e

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, 0x6375

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    add-long/2addr v0, v2

    .line 179
    iput-wide v0, p0, Ll/ۜۜ᩺;->֡:J

    return-void

    :sswitch_0
    sget v7, Ll/֨᩺;->۬᩺ܰ:I

    if-gez v7, :cond_9

    goto/16 :goto_1

    :sswitch_1
    sget-boolean v7, Ll/֫ܶ;->ۧ᩵۫:Z

    if-eqz v7, :cond_5

    goto/16 :goto_2

    .line 138
    :sswitch_2
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v7

    if-eqz v7, :cond_7

    goto/16 :goto_4

    .line 12
    :sswitch_3
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    return-void

    :sswitch_5
    const-wide/16 v2, 0x1f4

    .line 96
    sget v7, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v7, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v7, "\u06da\u1a78"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x71

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xaa9

    const v9, 0x3c87f4ee

    xor-int/2addr v8, v9

    const v9, 0x22e430ec

    goto :goto_0

    .line 62
    :sswitch_6
    sget v7, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v7, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v7, "\u06d7\u0736"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7895

    const v9, 0x3f8dfcf5

    xor-int/2addr v8, v9

    const v9, -0x5f24c947

    goto :goto_0

    :sswitch_7
    sget-boolean v7, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v7, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v7, "\u06e4\u05a1"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x35

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x419f

    const v9, -0x5e42f893

    xor-int/2addr v8, v9

    const v9, 0x4c62e474    # 5.947848E7f

    goto/16 :goto_0

    .line 118
    :sswitch_8
    sget-boolean v7, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v7, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v7, "\u06d8\u0730"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x41

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1bb3

    const v9, 0x52ebcdf

    xor-int/2addr v8, v9

    const v9, 0x1acb2fcf

    goto/16 :goto_0

    .line 137
    :sswitch_9
    sget v7, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v7, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v7, "\u1a76\u06dc"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x67

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x38e7

    const v9, 0x71e345d4

    xor-int/2addr v8, v9

    const v9, 0x7b552563

    goto/16 :goto_0

    .line 109
    :sswitch_a
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v7

    if-eqz v7, :cond_6

    :cond_5
    :goto_1
    const-string v7, "\u1a7a\u06db"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3203

    const v9, -0x6e447f5e

    xor-int/2addr v8, v9

    const v9, 0x72519730

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u06e8\u1a74"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6629

    const v9, 0x56433e45

    xor-int/2addr v8, v9

    const v9, -0x1ca67f8d

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v7, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v7, :cond_8

    :cond_7
    :goto_2
    const-string v7, "\u06df\u05a1"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1e67

    const v9, 0xb63cc38

    xor-int/2addr v8, v9

    const v9, -0x4fd96b22

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u0730\u073d"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1cf5

    const v9, 0x3ab85065

    xor-int/2addr v8, v9

    const v9, -0x2c684353

    goto/16 :goto_0

    .line 122
    :sswitch_c
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v7

    if-gtz v7, :cond_a

    :cond_9
    :goto_3
    const-string v7, "\u06ec\u073d"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x676f

    const v9, -0x1fe5abca

    xor-int/2addr v8, v9

    const v9, -0x17ab485c

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u1a74\u1a77"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x745f

    const v9, -0x7b58640d

    xor-int/2addr v8, v9

    const v9, -0x448ae341

    goto/16 :goto_0

    :sswitch_d
    sget v7, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v7, :cond_b

    :goto_4
    const-string v7, "\u06e1\u06ec"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4411

    const v9, -0x2885f6db

    xor-int/2addr v8, v9

    const v9, -0x164ed2fb

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u073d\u073f"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x43

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5e2d

    const v9, 0x598a4d89

    xor-int/2addr v8, v9

    const v9, -0x312e260b

    goto/16 :goto_0

    .line 179
    :sswitch_e
    invoke-static {}, Ll/֨᩺;->۬ܽ᩻()J

    move-result-wide v0

    sget-boolean v7, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v7, :cond_c

    :goto_5
    const-string v7, "\u06d7\u073f"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x39

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x662b

    const v9, -0x7d217c5d

    xor-int/2addr v8, v9

    const v9, -0x1fad6cad

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u1a77\u1a77"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x17

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x697d

    const v9, 0x37fcaa7b

    xor-int/2addr v8, v9

    const v9, 0x3edc20ad

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cda9dd9 -> :sswitch_7
        -0x7c87ccd8 -> :sswitch_c
        -0x7c872510 -> :sswitch_e
        -0x76922f0f -> :sswitch_4
        -0x6f785c2b -> :sswitch_3
        -0x6d1096e5 -> :sswitch_0
        -0x59db317d -> :sswitch_1
        -0x3ec584ba -> :sswitch_6
        -0x2b58a20c -> :sswitch_6
        -0x25a73f22 -> :sswitch_0
        -0x13ada2d2 -> :sswitch_2
        -0x4be3d1a -> :sswitch_7
        0x3a41d08 -> :sswitch_8
        0xc598399 -> :sswitch_e
        0xf1582a4 -> :sswitch_d
        0x14bf4a53 -> :sswitch_b
        0x26930bdf -> :sswitch_a
        0x2cd8737f -> :sswitch_b
        0x2e26bfc3 -> :sswitch_3
        0x3775ccc5 -> :sswitch_5
        0x392a9115 -> :sswitch_9
        0x3f28704f -> :sswitch_5
        0x4d97ab1f -> :sswitch_a
        0x68e8319b -> :sswitch_2
        0x69ca4d67 -> :sswitch_c
        0x7272a201 -> :sswitch_d
        0x73090b5c -> :sswitch_8
        0x7d598140 -> :sswitch_9
        0x7e1fd06d -> :sswitch_4
        0x7ffa4b36 -> :sswitch_1
    .end sparse-switch
.end method

.method private ۨ(Landroid/view/MotionEvent;)Z
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x1b32f4c7

    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    const-string v5, "\u06db\u05ab"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x51f5

    const v7, -0x4a3d191d

    xor-int/2addr v6, v7

    const v7, -0x236c87c7

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x278f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    const/4 p1, 0x1

    return p1

    .line 270
    :sswitch_0
    sget v5, Ll/ۘۗ;->ۖۧ۬:I

    if-gez v5, :cond_9

    goto/16 :goto_5

    .line 39
    :sswitch_1
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    sget-boolean v5, Ll/ۖۛ;->ۡܶ۬:Z

    if-eqz v5, :cond_d

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v5

    if-lez v5, :cond_b

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    goto/16 :goto_3

    .line 9
    :sswitch_4
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    const/4 p1, 0x0

    return p1

    .line 444
    :sswitch_5
    invoke-static {v1}, Ll/֡ۛ;->ۨۤ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View$OnTouchListener;

    .line 445
    invoke-interface {v5, p0, p1}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "\u1a74\u05a8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7267

    const v7, 0x66f043cc

    xor-int/2addr v6, v7

    const v7, 0x74f8a971

    goto :goto_0

    .line 444
    :sswitch_6
    invoke-static {v1}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "\u06ec\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7deb

    const v7, -0x6c0e6e5d

    xor-int/2addr v6, v7

    const v7, -0x63ca8072

    goto :goto_0

    .line 442
    :sswitch_7
    invoke-interface {v0, p0, p1}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_1

    .line 444
    :sswitch_8
    iget-object v1, p0, Ll/ۜۜ᩺;->ᩳۙ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۘ֡;->֫᩺ܶ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    const-string v5, "\u06dc\u0730"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3e59

    const v7, -0x311bbe59

    xor-int/2addr v6, v7

    const v7, -0x4b6e30c5

    goto/16 :goto_0

    .line 440
    :sswitch_9
    iget-object v0, p0, Ll/ۜۜ᩺;->ܺ:Landroid/view/View$OnTouchListener;

    if-eqz v0, :cond_1

    const-string v5, "\u073a\u06e4"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x3

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7da7

    const v7, -0xf8b47a

    xor-int/2addr v6, v7

    const v7, -0x79870c2f

    goto/16 :goto_0

    :cond_1
    :goto_1
    const-string v5, "\u06e8\u05a1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6ddb

    const v7, 0x792cc927

    xor-int/2addr v6, v7

    const v7, 0x37b91283

    goto/16 :goto_0

    .line 437
    :sswitch_a
    iget-object v5, p0, Ll/ۜۜ᩺;->ᩳۙ:Ljava/util/ArrayList;

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    const-string v5, "\u06d8\u06d9"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xc23

    const v7, 0x6ad8755f

    xor-int/2addr v6, v7

    const v7, 0x160ee22

    goto/16 :goto_0

    :sswitch_b
    const/4 p1, 0x0

    return p1

    :sswitch_c
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "\u1a74\u06d8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x59b9

    const v7, 0x5510ec32

    xor-int/2addr v6, v7

    const v7, 0xc01b055

    goto/16 :goto_0

    :cond_3
    :goto_2
    const-string v5, "\u1a75\u06d6"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1437

    const v7, 0x4b884a0d    # 1.7863706E7f

    xor-int/2addr v6, v7

    const v7, -0x6f45a7b

    goto/16 :goto_0

    .line 279
    :sswitch_d
    sget-boolean v5, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v5, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v5, "\u1a73\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x28dd

    const v7, 0x60db65b6

    xor-int/2addr v6, v7

    const/high16 v7, -0x74230000

    goto/16 :goto_0

    .line 200
    :sswitch_e
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v5

    if-gtz v5, :cond_5

    :goto_3
    const-string v5, "\u073a\u1a7a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x446f

    const v7, 0x52652a25

    xor-int/2addr v6, v7

    const v7, 0x58b8b954

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06da\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1bf1

    const v7, -0x4670d40b

    xor-int/2addr v6, v7

    const v7, 0x50c9c114

    goto/16 :goto_0

    .line 163
    :sswitch_f
    sget v5, Ll/֫;->ܶܺ᩻:I

    if-ltz v5, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v5, "\u05a1\u1a78"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2079

    const v7, -0x30ae95cb

    xor-int/2addr v6, v7

    const v7, -0x131e9368

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/ۗ;->֨۬ۖ:I

    if-ltz v5, :cond_7

    goto :goto_5

    :cond_7
    const-string v5, "\u06d7\u073a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0xb

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7879

    const v7, 0x28d375b1

    xor-int/2addr v6, v7

    const v7, 0x15325664

    goto/16 :goto_0

    .line 367
    :sswitch_11
    sget v5, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v5, :cond_8

    goto :goto_4

    :cond_8
    const-string v5, "\u06eb\u06ec"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x15

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4cbb

    const v7, 0x146fce74

    xor-int/2addr v6, v7

    const v7, 0xdbb976c

    goto/16 :goto_0

    .line 323
    :sswitch_12
    sget v5, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_4
    const-string v5, "\u1a77\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5ddb

    const v7, -0x548ae410

    xor-int/2addr v6, v7

    const v7, -0x3f07d528

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06ec\u073f"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4299

    const v7, -0x58038b5e

    xor-int/2addr v6, v7

    const v7, 0x691a5718

    goto/16 :goto_0

    .line 393
    :sswitch_13
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v5

    if-eqz v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u06d8\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5725

    const v7, 0x33ea6630

    xor-int/2addr v6, v7

    const v7, -0x22a46834

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06eb\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x315d

    const v7, 0x26d8dcb5

    xor-int/2addr v6, v7

    const v7, 0x185a8d7b

    goto/16 :goto_0

    :sswitch_14
    sget v5, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v5, :cond_e

    :cond_d
    const-string v5, "\u06eb\u05ab"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x84d

    const v7, 0x5187194a

    xor-int/2addr v6, v7

    const v7, -0x4cfa8422

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u06d8\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x518d

    const v7, 0x1c4c2970

    xor-int/2addr v6, v7

    const v7, -0x2e2b8663

    goto/16 :goto_0

    .line 145
    :sswitch_15
    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_f

    goto :goto_6

    :cond_f
    const-string v5, "\u05a8\u1a7b"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x57

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7a81

    const v7, 0xe98006

    xor-int/2addr v6, v7

    const v7, -0x1de1bbfb

    goto/16 :goto_0

    :sswitch_16
    sget v5, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v5, :cond_10

    :goto_6
    const-string v5, "\u06e1\u1a77"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5229

    const v7, -0x7e51eb

    xor-int/2addr v6, v7

    const v7, 0x2d3ba674

    goto/16 :goto_0

    :cond_10
    const-string v5, "\u073f\u06e8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x187f

    const v7, 0xd1a5d95

    xor-int/2addr v6, v7

    const v7, 0x48dc866c    # 451635.38f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c4352fd -> :sswitch_16
        -0x76c3f05e -> :sswitch_a
        -0x6bbabc51 -> :sswitch_c
        -0x6165d5b5 -> :sswitch_a
        -0x5ff4602c -> :sswitch_14
        -0x5d4a1c90 -> :sswitch_9
        -0x5af7fc93 -> :sswitch_c
        -0x57b732be -> :sswitch_13
        -0x5648b86a -> :sswitch_1
        -0x5361223c -> :sswitch_2
        -0x4e85fa3b -> :sswitch_f
        -0x44707987 -> :sswitch_12
        -0x3d3fc90b -> :sswitch_3
        -0x3cf727cd -> :sswitch_16
        -0x3530a368 -> :sswitch_11
        -0x31b012c7 -> :sswitch_13
        -0x2ed58b29 -> :sswitch_8
        -0x23fad35b -> :sswitch_4
        -0x237e2cf4 -> :sswitch_7
        -0x196c1b42 -> :sswitch_b
        -0x16c753f5 -> :sswitch_d
        -0x1572f3b9 -> :sswitch_5
        -0xfd937e5 -> :sswitch_e
        -0xe827c6c -> :sswitch_12
        -0x4926a79 -> :sswitch_4
        0x8982ea4 -> :sswitch_0
        0xcc783ad -> :sswitch_d
        0x10c61897 -> :sswitch_3
        0x15fc3685 -> :sswitch_2
        0x166b30ea -> :sswitch_f
        0x172b22ac -> :sswitch_14
        0x1744c2bc -> :sswitch_6
        0x1994659c -> :sswitch_e
        0x19cddc3b -> :sswitch_15
        0x2748b5c1 -> :sswitch_7
        0x2822b300 -> :sswitch_8
        0x296409eb -> :sswitch_b
        0x32a033f8 -> :sswitch_0
        0x532e790b -> :sswitch_10
        0x56ff3bec -> :sswitch_11
        0x5bc15ae7 -> :sswitch_9
        0x5e181a50 -> :sswitch_6
        0x632eb268 -> :sswitch_1
        0x65eab55f -> :sswitch_10
        0x6a950248 -> :sswitch_5
        0x74143e12 -> :sswitch_15
    .end sparse-switch
.end method

.method public static bridge synthetic ܰ(Ll/ۜۜ᩺;)Landroid/widget/AbsListView$OnScrollListener;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۜ᩺;->֨ۙ:Landroid/widget/AbsListView$OnScrollListener;

    return-object p0
.end method

.method private ܰ(Landroid/view/MotionEvent;)V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, -0x1c34012

    sget v9, Ll/ۖۧ;->ܺۚۖ:I

    sget v10, Ll/ۘۗ;->ۖۧ۬:I

    const-string v11, "\u0733\u06e1"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x5f

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x465

    const v13, 0x70203e5

    xor-int/2addr v12, v13

    const v13, -0x53487034

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, -0x7f39

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 403
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 404
    invoke-static {p0}, Ll/ۘۚ;->ܿܰܶ(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v11

    if-gtz v11, :cond_8

    goto/16 :goto_4

    .line 298
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v11

    if-nez v11, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v11, "\u06d7\u06e7"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x9d7

    const v13, -0x2dfc3003

    xor-int/2addr v12, v13

    const v13, 0x5a3d647f

    goto :goto_0

    .line 333
    :sswitch_2
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    sget v11, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v11, :cond_c

    goto/16 :goto_3

    .line 397
    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto/16 :goto_3

    .line 250
    :sswitch_4
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    return-void

    :sswitch_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_2

    .line 405
    :sswitch_6
    invoke-static {p0, v2}, Ll/ۘ֡;->ۤ֨ۙ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11, v0}, Landroid/view/View;->setPressed(Z)V

    .line 254
    sget v11, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v11, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v11, "\u06eb\u06e8"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x25

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x2c41

    const v13, 0xdebf6d4

    xor-int/2addr v12, v13

    const v13, -0x4c691f6c

    goto :goto_0

    .line 409
    :sswitch_7
    invoke-super {p0, v3}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 410
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    return-void

    :sswitch_8
    or-int v11, v6, v7

    .line 408
    invoke-virtual {v3, v11}, Landroid/view/MotionEvent;->setAction(I)V

    .line 283
    sget v11, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v11, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v11, "\u1a74\u1a73"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x36b9

    const v13, -0x5bd048e

    xor-int/2addr v12, v13

    const v13, 0x2c08c86c

    goto/16 :goto_0

    :sswitch_9
    shl-int v6, v4, v5

    const/4 v7, 0x3

    .line 120
    sget v11, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v11, :cond_3

    goto :goto_1

    :cond_3
    const-string v11, "\u06e4\u073d"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x6ced

    const v13, 0x1a5c79a9

    xor-int/2addr v12, v13

    const v13, 0x78871bbe

    goto/16 :goto_0

    :sswitch_a
    const/16 v5, 0x8

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v11

    if-nez v11, :cond_4

    goto :goto_1

    :cond_4
    const-string v11, "\u0736\u1a73"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x6467

    const v13, 0x6b5f8943

    xor-int/2addr v12, v13

    const v13, -0x611c6063

    goto/16 :goto_0

    .line 407
    :sswitch_b
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v3

    .line 408
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v4

    .line 360
    sget-boolean v11, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v11, :cond_5

    :goto_1
    const-string v11, "\u1a7b\u1a77"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x342f

    const v13, 0x2742ae29

    xor-int/2addr v12, v13

    const v13, -0x24629eab

    goto/16 :goto_0

    :cond_5
    const-string v11, "\u05a8\u05ab"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x7

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x142b

    const v13, 0x616b3d2e

    xor-int/2addr v12, v13

    const v13, 0xaf2881d

    goto/16 :goto_0

    :sswitch_c
    if-ge v2, v1, :cond_6

    const-string v11, "\u06e8\u0733"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0xb

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x75b3

    const v13, -0x2a2ae822

    xor-int/2addr v12, v13

    const v13, -0x638086a4

    goto/16 :goto_0

    :cond_6
    const-string v11, "\u06e7\u06db"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x2d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x47e1

    const v13, 0x6722a908

    xor-int/2addr v12, v13

    const v13, 0x224b55c7

    goto/16 :goto_0

    :goto_2
    const-string v11, "\u06df\u1a7a"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x26c3

    const v13, -0x413ccca3

    xor-int/2addr v12, v13

    const v13, 0x6fbcb356    # 1.1679997E29f

    goto/16 :goto_0

    :sswitch_d
    const/4 v0, 0x0

    sget v11, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v11, :cond_7

    goto :goto_3

    :cond_7
    const-string v11, "\u06e0\u0730"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x4d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x265d

    const v13, -0x6d3535d5

    xor-int/2addr v12, v13

    const v13, -0x75a98f9e

    goto/16 :goto_0

    .line 402
    :sswitch_e
    invoke-virtual {p0}, Landroid/view/View;->cancelLongPress()V

    .line 383
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v11

    if-eqz v11, :cond_9

    :cond_8
    const-string v11, "\u1a75\u06eb"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x21f9

    const v13, 0x404e40

    xor-int/2addr v12, v13

    const v13, 0x60d00c18

    goto/16 :goto_0

    :cond_9
    const-string v11, "\u1a76\u06d7"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x68b9

    const v13, 0x7e3ebc87

    xor-int/2addr v12, v13

    const v13, -0x23cb4967

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v11

    if-nez v11, :cond_a

    :goto_3
    const-string v11, "\u06d9\u1a77"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x6655

    const v13, -0x66a1bc42

    xor-int/2addr v12, v13

    const v13, -0x232976e5

    goto/16 :goto_0

    :cond_a
    const-string v11, "\u06d6\u0733"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x61

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x48b5

    const v13, 0x3214d7d8

    xor-int/2addr v12, v13

    const v13, -0x56ded1c3

    goto/16 :goto_0

    .line 1
    :sswitch_10
    sget v11, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v11, :cond_b

    goto :goto_4

    :cond_b
    const-string v11, "\u06d7\u1a73"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x11a9

    const v13, -0x7a819331

    xor-int/2addr v12, v13

    const v13, 0x77eb3a07

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v11

    if-eqz v11, :cond_d

    :cond_c
    :goto_4
    const-string v11, "\u06d9\u1a74"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x5d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x172b

    const v13, -0x4cf7b3c3

    xor-int/2addr v12, v13

    const v13, 0x2cff866d

    goto/16 :goto_0

    :cond_d
    const-string v11, "\u06e4\u1a74"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x15

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x7a63

    const v13, 0x18de9ec0

    xor-int/2addr v12, v13

    const v13, 0x687e0634

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b07719f -> :sswitch_6
        -0x65c3ccab -> :sswitch_b
        -0x5450d719 -> :sswitch_0
        -0x445a58b0 -> :sswitch_7
        -0x400d5017 -> :sswitch_4
        -0x3a87d87d -> :sswitch_3
        -0x326c6034 -> :sswitch_2
        -0xcfe3fb7 -> :sswitch_a
        -0x882e9b3 -> :sswitch_1
        -0x7ed8292 -> :sswitch_c
        -0x25fdbc -> :sswitch_8
        0x1316ea8 -> :sswitch_d
        0x647a5a3 -> :sswitch_f
        0x7dad295 -> :sswitch_f
        0x8b6c189 -> :sswitch_8
        0x94d4723 -> :sswitch_9
        0x112647f6 -> :sswitch_3
        0x19226dfb -> :sswitch_10
        0x1abbc73d -> :sswitch_11
        0x1fbd98e0 -> :sswitch_7
        0x2bc4372e -> :sswitch_e
        0x2f3485dd -> :sswitch_a
        0x2fd5b066 -> :sswitch_e
        0x36d18ae3 -> :sswitch_11
        0x381a410f -> :sswitch_0
        0x38d65e2a -> :sswitch_2
        0x39c483b0 -> :sswitch_9
        0x4b7846e6 -> :sswitch_4
        0x4b99acfb -> :sswitch_d
        0x4d51e106 -> :sswitch_10
        0x4e5bb72f -> :sswitch_6
        0x52027012 -> :sswitch_b
        0x6054f131 -> :sswitch_c
        0x6b8b06f3 -> :sswitch_5
        0x6e4eab10 -> :sswitch_1
        0x7a9f1e9f -> :sswitch_5
    .end sparse-switch
.end method

.method private ᩹()Z
    .locals 12

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const v6, -0x6b2370c1

    sget v7, Ll/֨᩹;->᩻ᩳ֨:I

    sget v8, Ll/֫᩺;->᩺۟ۘ:I

    const-string v9, "\u06d9\u0733"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x3f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x7333

    const v11, 0x25806184

    xor-int/2addr v10, v11

    const v11, -0x7f18d159

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, -0x43c9

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 78
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    goto/16 :goto_2

    .line 6
    :sswitch_0
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    sget v9, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v9, :cond_8

    goto/16 :goto_5

    .line 21
    :sswitch_1
    sget-boolean v9, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-nez v9, :cond_b

    goto :goto_1

    .line 62
    :sswitch_2
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget v9, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v9, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v9, "\u073f\u1a78"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x33

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x1055

    const v11, 0x10e2cbe2

    xor-int/2addr v10, v11

    const v11, 0x27605f1a

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    const/4 v0, 0x0

    return v0

    :sswitch_4
    const/4 v0, 0x1

    return v0

    :sswitch_5
    const-wide/16 v9, 0x1f4

    cmp-long v11, v4, v9

    if-gez v11, :cond_d

    const-string v9, "\u06ec\u06d9"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x25

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x2037

    const v11, 0x74e85bc6

    xor-int/2addr v10, v11

    const v11, -0xe78d8ed

    goto :goto_0

    :sswitch_6
    sub-long v4, v0, v2

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v9

    if-eqz v9, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v9, "\u06e0\u06eb"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x65

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x2fe3

    const v11, -0x301da342

    xor-int/2addr v10, v11

    const v11, 0x741f3e58

    goto :goto_0

    :sswitch_7
    sget v9, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v9, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v9, "\u06ec\u06d7"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3ab7

    const v11, -0x4d15a60d

    xor-int/2addr v10, v11

    const v11, 0x172f7418

    goto/16 :goto_0

    .line 53
    :sswitch_8
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v9

    if-gtz v9, :cond_3

    goto :goto_2

    :cond_3
    const-string v9, "\u06d9\u06ec"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x6f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x2ea7

    const v11, 0x3c10908a

    xor-int/2addr v10, v11

    const v11, -0x3793fef9

    goto/16 :goto_0

    .line 1
    :sswitch_9
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v9

    if-gtz v9, :cond_4

    goto :goto_2

    :cond_4
    const-string v9, "\u06df\u06e1"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x7375

    const v11, -0x464f2f5c

    xor-int/2addr v10, v11

    const v11, -0x5e874152

    goto/16 :goto_0

    .line 59
    :sswitch_a
    sget v9, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v9, :cond_5

    goto :goto_3

    :cond_5
    const-string v9, "\u1a76\u1a79"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x1d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x2de1

    const v11, 0x73d6d992

    xor-int/2addr v10, v11

    const v11, -0x25e48f57

    goto/16 :goto_0

    .line 27
    :sswitch_b
    sget-boolean v9, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v9, :cond_6

    :goto_2
    const-string v9, "\u1a7a\u1a7a"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0xceb

    const v11, 0x1a6abe6

    xor-int/2addr v10, v11

    const v11, -0x2a7f51f3

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u1a78\u06ec"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x6267

    const v11, 0x1b505c21

    xor-int/2addr v10, v11

    const v11, -0x3b5dbc6

    goto/16 :goto_0

    .line 10
    :sswitch_c
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v9

    if-gtz v9, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v9, "\u1a75\u06dc"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x3487

    const v11, -0x4728693d

    xor-int/2addr v10, v11

    const v11, 0x4c94e112    # 7.805557E7f

    goto/16 :goto_0

    .line 70
    :sswitch_d
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v9

    if-eqz v9, :cond_9

    :cond_8
    :goto_3
    const-string v9, "\u1a76\u06d8"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0xf

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x21b5

    const v11, -0x701a7ce1

    xor-int/2addr v10, v11

    const v11, 0x674889ea

    goto/16 :goto_0

    :cond_9
    const-string v9, "\u073d\u06e4"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6285

    const v11, -0x660fbcae

    xor-int/2addr v10, v11

    const v11, 0x4f078891

    goto/16 :goto_0

    .line 18
    :sswitch_e
    sget-boolean v9, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v9, :cond_a

    :goto_4
    const-string v9, "\u06e0\u06d9"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x43

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x4b5d

    const v11, 0x383c74bb

    xor-int/2addr v10, v11

    const v11, 0x5231904e

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u073f\u06e1"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x57

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x1797

    const v11, -0x8a429b1

    xor-int/2addr v10, v11

    const v11, 0x9fa51cd

    goto/16 :goto_0

    .line 92
    :sswitch_f
    invoke-static {}, Ll/ۗܳ;->ۤܽۤ()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۜۜ᩺;->ۗ:J

    .line 36
    sget v9, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v9, :cond_c

    :cond_b
    :goto_5
    const-string v9, "\u06db\u073a"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x9

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x33a1

    const v11, 0x3dcf321f

    xor-int/2addr v10, v11

    const v11, -0x38908d6b

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u06dc\u0733"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x7d6d

    const v11, 0x6f5926ee

    xor-int/2addr v10, v11

    const v11, -0x35b5b1f9

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x0

    return v0

    .line 91
    :sswitch_11
    iget-boolean v9, p0, Ll/ۜۜ᩺;->ۢ:Z

    if-eqz v9, :cond_d

    const-string v9, "\u1a76\u0736"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x4b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1d3

    const v11, 0x53f8a0e9

    xor-int/2addr v10, v11

    const v11, 0x2d590aa2

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u06e8\u06ec"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x41

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x56f

    const v11, -0xafd0ab

    xor-int/2addr v10, v11

    const v11, 0x69c2e8b5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x713bd8f2 -> :sswitch_4
        -0x65bf5c93 -> :sswitch_7
        -0x56e56bfd -> :sswitch_9
        -0x538e4ebe -> :sswitch_d
        -0x530cf296 -> :sswitch_11
        -0x5121523e -> :sswitch_b
        -0x4e210344 -> :sswitch_0
        -0x470ced53 -> :sswitch_4
        -0x44d85eb9 -> :sswitch_2
        -0x43883578 -> :sswitch_f
        -0x3ff74331 -> :sswitch_d
        -0x3d6ac7fa -> :sswitch_1
        -0x3777ce7c -> :sswitch_10
        -0x362bfa1a -> :sswitch_9
        -0x33316b7c -> :sswitch_c
        -0x2a85bec1 -> :sswitch_8
        -0x291c1cb9 -> :sswitch_8
        -0x28a3d54d -> :sswitch_a
        -0x25521aa2 -> :sswitch_7
        -0x1fcf9eba -> :sswitch_6
        -0x1ed9d6c5 -> :sswitch_1
        -0x1ea05fd3 -> :sswitch_e
        -0x1710495b -> :sswitch_10
        -0x10632ee4 -> :sswitch_11
        -0xcebab21 -> :sswitch_2
        -0x1692b50 -> :sswitch_3
        0x1f980618 -> :sswitch_0
        0x33d5142f -> :sswitch_5
        0x389ce9dd -> :sswitch_c
        0x3c3a9c8e -> :sswitch_6
        0x44ad8cf6 -> :sswitch_5
        0x4ce297c3 -> :sswitch_f
        0x58c03920 -> :sswitch_a
        0x611ffc44 -> :sswitch_3
        0x6782efe8 -> :sswitch_b
        0x7f7cf5ce -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x323c9c9b    # -4.0975888E8f

    sget v8, Ll/֫۟;->᩸ᩴܿ:I

    sget v9, Ll/ۖۗ;->᩶۫ۗ:I

    const-string v10, "\u06d6\u06e4"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1b21

    const v12, -0xda8bd18

    xor-int/2addr v11, v12

    const v12, -0x663c35c1

    :goto_0
    xor-int/2addr v10, v12

    :goto_1
    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, -0x2945

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 270
    sget v10, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v10, :cond_15

    goto/16 :goto_9

    .line 179
    :sswitch_0
    sget-boolean v10, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v10, :cond_1a

    goto/16 :goto_8

    .line 225
    :sswitch_1
    sget-boolean v10, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v10, :cond_14

    goto/16 :goto_7

    .line 445
    :sswitch_2
    sget-boolean v10, Ll/᩶;->ۚۤۘ:Z

    if-nez v10, :cond_11

    goto/16 :goto_8

    .line 208
    :sswitch_3
    sget v10, Ll/۟;->ۨᩴۛ:I

    if-gez v10, :cond_0

    goto/16 :goto_b

    :cond_0
    const-string v10, "\u05ab\u06e1"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x5d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7f61

    const v12, -0x28fdf5ce

    xor-int/2addr v11, v12

    const v12, 0x23cb5794

    goto :goto_0

    :sswitch_4
    sget v10, Ll/ۗܺ;->ۨ᩺۠:I

    if-lez v10, :cond_1

    goto/16 :goto_b

    :cond_1
    const-string v10, "\u06e2\u06d6"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x79f1

    const v12, -0x3f607cb5

    xor-int/2addr v11, v12

    const v12, 0x514d3bd7

    goto :goto_0

    :sswitch_5
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v10, Ll/ۗ;->֨۬ۖ:I

    if-ltz v10, :cond_2

    goto :goto_2

    :cond_2
    const-string v10, "\u1a75\u06e7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x33fd

    const v12, 0x76daf9c3

    xor-int/2addr v11, v12

    const v12, 0x242a44b6

    goto :goto_0

    :sswitch_6
    sget-boolean v10, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v10, :cond_3

    goto/16 :goto_8

    :cond_3
    :goto_2
    const-string v10, "\u06d7\u05a8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x29

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7bdf

    const v12, 0x76153d57

    xor-int/2addr v11, v12

    const v12, 0x2a5b6b2b

    goto/16 :goto_0

    .line 195
    :sswitch_7
    sget-boolean v10, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-nez v10, :cond_18

    goto/16 :goto_8

    .line 439
    :sswitch_8
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    goto/16 :goto_8

    .line 391
    :sswitch_9
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    const/4 p1, 0x0

    return p1

    :sswitch_a
    return v6

    :sswitch_b
    return v2

    .line 465
    :sswitch_c
    iput-boolean v2, p0, Ll/ۜۜ᩺;->ۜۙ:Z

    .line 466
    invoke-direct {p0, p1}, Ll/ۜۜ᩺;->ۙ(Landroid/view/MotionEvent;)V

    return v2

    :sswitch_d
    if-ne v0, v3, :cond_5

    goto :goto_3

    .line 472
    :sswitch_e
    iput-boolean v1, p0, Ll/ۜۜ᩺;->ۜۙ:Z

    return v2

    :sswitch_f
    if-ne v0, v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v10, "\u1a74\u073f"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6d97

    const v12, 0x18c905a

    xor-int/2addr v11, v12

    const v12, 0x48143328    # 151756.62f

    goto/16 :goto_0

    .line 478
    :sswitch_10
    iput-boolean v1, p0, Ll/ۜۜ᩺;->ۜۙ:Z

    return v6

    :sswitch_11
    if-ne v0, v3, :cond_5

    goto/16 :goto_5

    .line 483
    :sswitch_12
    invoke-direct {p0, p1}, Ll/ۜۜ᩺;->ۖ(Landroid/view/MotionEvent;)V

    return v2

    .line 462
    :sswitch_13
    invoke-direct {p0, p1}, Ll/ۜۜ᩺;->ۨ(Landroid/view/MotionEvent;)Z

    move-result v10

    if-eqz v10, :cond_6

    :cond_5
    const-string v10, "\u1a76\u073f"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x52c7

    const v12, 0x3590815f

    xor-int/2addr v11, v12

    const v12, 0x4205fbd1

    goto/16 :goto_0

    :cond_6
    const-string v10, "\u0730\u1a75"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x5399

    const v12, -0x660132f5

    xor-int/2addr v11, v12

    const v12, 0x61e93b61

    goto/16 :goto_0

    :sswitch_14
    if-eq v0, v2, :cond_7

    const-string v10, "\u1a79\u06ec"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x71

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x319d

    const v12, 0x2547b9b5

    xor-int/2addr v11, v12

    const v12, 0x6496709e

    goto/16 :goto_0

    :cond_7
    :goto_3
    const-string v10, "\u0730\u06d9"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x155b

    const v12, -0x4a9c0ab1

    xor-int/2addr v11, v12

    const v12, -0x4b361042

    goto/16 :goto_0

    .line 476
    :sswitch_15
    invoke-virtual {p0, p1}, Ll/ۜۜ᩺;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v6

    if-eq v0, v2, :cond_8

    const-string v10, "\u06e4\u06e4"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x9

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x67db

    const v12, 0x951fab8

    xor-int/2addr v11, v12

    const v12, 0x6358f2d1

    goto/16 :goto_0

    :cond_8
    :goto_4
    const-string v10, "\u06d7\u1a77"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7651

    const v12, -0x53ca2860

    xor-int/2addr v11, v12

    const v12, 0x3d97a036

    goto/16 :goto_0

    :sswitch_16
    if-eq v0, v2, :cond_9

    const-string v10, "\u1a7b\u05a8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x7f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x602b

    const v12, 0x47a21b30    # 82998.375f

    xor-int/2addr v11, v12

    const v12, 0x241fe849

    goto/16 :goto_0

    :cond_9
    :goto_5
    const-string v10, "\u1a7a\u1a76"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0xb

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x40c9

    const v12, -0x282947f

    xor-int/2addr v11, v12

    const v12, 0x2a70606e

    goto/16 :goto_0

    .line 377
    :sswitch_17
    iget-object v10, p0, Ll/ۜۜ᩺;->ۙۙ:Ll/᩹ܺ᩺;

    invoke-virtual {v10, v4, v5}, Ll/᩹ܺ᩺;->ܰ(FF)Z

    move-result v10

    if-eqz v10, :cond_c

    const-string v10, "\u1a75\u06da"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x646f

    const v12, 0x5b92f84e

    xor-int/2addr v11, v12

    const v12, 0x42a0d039

    goto/16 :goto_0

    :sswitch_18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 49
    sget v10, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v10, :cond_a

    goto/16 :goto_7

    :cond_a
    const-string v10, "\u1a75\u0730"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x49

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3bf9

    const v12, 0x110de4f8

    xor-int/2addr v11, v12

    const v12, -0x164a853b

    goto/16 :goto_0

    .line 487
    :sswitch_19
    invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 470
    :sswitch_1a
    invoke-direct {p0, p1}, Ll/ۜۜ᩺;->ۨ(Landroid/view/MotionEvent;)Z

    move-result v10

    if-eqz v10, :cond_b

    const-string v10, "\u0730\u06e4"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x1b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x44f

    const v12, -0x27534e86

    xor-int/2addr v11, v12

    const v12, -0x68b29a74

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u06e7\u05a1"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x75

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6005

    const v12, -0x37b65b24

    xor-int/2addr v11, v12

    const v12, -0x860d784

    goto/16 :goto_0

    .line 481
    :sswitch_1b
    iget-boolean v10, p0, Ll/ۜۜ᩺;->ۚۙ:Z

    if-eqz v10, :cond_c

    const-string v10, "\u06da\u06da"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xb65

    const v12, 0x1d456f3

    xor-int/2addr v11, v12

    const v12, 0x2d68852e

    goto/16 :goto_0

    .line 459
    :sswitch_1c
    invoke-direct {p0, p1}, Ll/ۜۜ᩺;->ۖ(Landroid/view/MotionEvent;)V

    .line 460
    iput-boolean v1, p0, Ll/ۜۜ᩺;->ۜۙ:Z

    .line 377
    invoke-direct {p0}, Ll/ۜۜ᩺;->ۚ()Z

    move-result v10

    if-eqz v10, :cond_c

    const-string v10, "\u06eb\u1a74"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x46f5

    const v12, 0x78fc8e65

    xor-int/2addr v11, v12

    const v12, 0x25ece7ad

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u06da\u1a77"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7297

    const v12, -0x19b04b44

    xor-int/2addr v11, v12

    const v12, -0x107f009d

    goto/16 :goto_0

    .line 469
    :sswitch_1d
    iget-boolean v3, p0, Ll/ۜۜ᩺;->ۜۙ:Z

    const/4 v10, 0x3

    if-eqz v3, :cond_d

    const-string v3, "\u0733\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v9, v3

    mul-int/lit8 v3, v3, 0x21

    xor-int v11, v3, v8

    mul-int/lit16 v11, v11, -0x2473

    const v12, 0x3e65d2d8

    xor-int/2addr v11, v12

    const v12, -0x1f69456e

    goto :goto_6

    :cond_d
    const-string v3, "\u06d8\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v9

    xor-int v11, v3, v8

    mul-int/lit16 v11, v11, 0x56db

    const v12, -0x205c50c7

    xor-int/2addr v11, v12

    const v12, -0x5654e1e9

    :goto_6
    xor-int/2addr v3, v12

    move v10, v3

    const/4 v3, 0x3

    goto/16 :goto_1

    :sswitch_1e
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_e

    const-string v10, "\u05ab\u06d9"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x7d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3577

    const v12, 0x722d14c

    xor-int/2addr v11, v12

    const v12, -0x4a56d1f1

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u06e8\u0730"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x3b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4deb

    const v12, -0x28c9bdf

    xor-int/2addr v11, v12

    const v12, 0x1449be18

    goto/16 :goto_0

    .line 457
    :sswitch_1f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 440
    sget v10, Ll/۟;->ۨᩴۛ:I

    if-ltz v10, :cond_f

    goto/16 :goto_a

    :cond_f
    const-string v10, "\u06d8\u05a8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2c65

    const v12, -0x4c0ca4df

    xor-int/2addr v11, v12

    const v12, 0x54c33198

    goto/16 :goto_0

    .line 121
    :sswitch_20
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v10

    if-nez v10, :cond_10

    goto/16 :goto_c

    :cond_10
    const-string v10, "\u06ec\u06d8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x77a3

    const v12, -0x6092302f

    xor-int/2addr v11, v12

    const v12, 0x5ee3716b

    goto/16 :goto_0

    .line 389
    :sswitch_21
    sget-boolean v10, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v10, :cond_12

    :cond_11
    :goto_7
    const-string v10, "\u05a8\u0730"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1281

    const v12, 0x7b60960a

    xor-int/2addr v11, v12

    const v12, 0x37df4233

    goto/16 :goto_0

    :cond_12
    const-string v10, "\u05a8\u073a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x63d

    const v12, 0x3372f62c

    xor-int/2addr v11, v12

    const v12, -0x7dfb20fd

    goto/16 :goto_0

    .line 283
    :sswitch_22
    sget v10, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v10, :cond_13

    :goto_8
    const-string v10, "\u06da\u05ab"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2365

    const v12, 0x48d93608    # 444848.25f

    xor-int/2addr v11, v12

    const v12, -0x43df0792

    goto/16 :goto_0

    :cond_13
    const-string v10, "\u06e2\u1a75"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6a19

    const v12, 0x7918a800

    xor-int/2addr v11, v12

    const v12, -0x415e3fe2

    goto/16 :goto_0

    :cond_14
    :goto_9
    const-string v10, "\u1a7b\u06e0"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x33

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7d65

    const v12, -0x27db3f3

    xor-int/2addr v11, v12

    const v12, -0x7bda0b25

    goto/16 :goto_0

    :cond_15
    const-string v10, "\u05a8\u06e0"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0xf1f

    const v12, -0x5f3002eb

    xor-int/2addr v11, v12

    const v12, -0x2f62311c

    goto/16 :goto_0

    .line 266
    :sswitch_23
    sget v10, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v10, :cond_16

    :goto_a
    const-string v10, "\u05a1\u06e2"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5a7b

    const v12, 0x18bbb834

    xor-int/2addr v11, v12

    const v12, -0x34bff434    # -1.2585932E7f

    goto/16 :goto_0

    :cond_16
    const-string v10, "\u06d9\u0736"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7327

    const v12, -0x4e0a544e

    xor-int/2addr v11, v12

    const v12, -0x473e606

    goto/16 :goto_0

    .line 285
    :sswitch_24
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v10

    if-gtz v10, :cond_17

    goto :goto_b

    :cond_17
    const-string v10, "\u073d\u06d7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x71

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1ad9

    const v12, 0x1356c74e

    xor-int/2addr v11, v12

    const v12, 0x595c388a

    goto/16 :goto_0

    .line 223
    :sswitch_25
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v10

    if-nez v10, :cond_19

    :cond_18
    :goto_b
    const-string v10, "\u06d8\u06e0"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x45

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1e49

    const v12, -0x1050cec3

    xor-int/2addr v11, v12

    const v12, 0x629a2f92

    goto/16 :goto_0

    :cond_19
    const-string v10, "\u06e8\u1a7b"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1b81

    const v12, -0x4597cd2

    xor-int/2addr v11, v12

    const v12, -0x59b6e62

    goto/16 :goto_0

    :sswitch_26
    sget v10, Ll/֨ۧ;->֫۠֡:I

    if-gtz v10, :cond_1b

    :cond_1a
    :goto_c
    const-string v10, "\u1a74\u073d"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x4b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5429

    const v12, 0x4f59a718

    xor-int/2addr v11, v12

    const v12, 0x6754abab

    goto/16 :goto_0

    :cond_1b
    const-string v10, "\u06e8\u073f"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x564d

    const v12, 0x1ed2e71e

    xor-int/2addr v11, v12

    const v12, 0x1a42b392

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d3f45ad -> :sswitch_13
        -0x778ba6f4 -> :sswitch_a
        -0x7774ddb5 -> :sswitch_23
        -0x72c77da6 -> :sswitch_25
        -0x674fb57e -> :sswitch_16
        -0x5e756cb5 -> :sswitch_c
        -0x55f800c9 -> :sswitch_2
        -0x4dd32611 -> :sswitch_23
        -0x4a45b9d3 -> :sswitch_9
        -0x47b19daf -> :sswitch_8
        -0x43dedb8c -> :sswitch_26
        -0x42c70527 -> :sswitch_1b
        -0x3c46fb29 -> :sswitch_1e
        -0x39c8f484 -> :sswitch_5
        -0x397a4300 -> :sswitch_1c
        -0x3666bf68 -> :sswitch_1f
        -0x35aa67b0 -> :sswitch_8
        -0x358fa0aa -> :sswitch_1e
        -0x33797bae -> :sswitch_6
        -0x32a910cb -> :sswitch_15
        -0x301263c8 -> :sswitch_f
        -0x2ba21869 -> :sswitch_b
        -0x2ab104aa -> :sswitch_3
        -0x2a83d339 -> :sswitch_b
        -0x2629cc8c -> :sswitch_20
        -0x25fbde1b -> :sswitch_a
        -0x249ded06 -> :sswitch_17
        -0x1bb5d135 -> :sswitch_6
        -0x1b6eb392 -> :sswitch_22
        -0x1a70b9d5 -> :sswitch_18
        -0x17e5881b -> :sswitch_1f
        -0x12f4f0ff -> :sswitch_16
        -0x8435a2c -> :sswitch_3
        -0x20be027 -> :sswitch_10
        -0x7ebea5 -> :sswitch_11
        0x55eaa37 -> :sswitch_21
        0x714e16d -> :sswitch_c
        0x74dda4b -> :sswitch_5
        0x79585d8 -> :sswitch_13
        0x14bff6aa -> :sswitch_1
        0x1d740253 -> :sswitch_0
        0x23b3e688 -> :sswitch_e
        0x24211dd5 -> :sswitch_4
        0x24c7a95d -> :sswitch_18
        0x27439aab -> :sswitch_15
        0x276b0959 -> :sswitch_17
        0x2af0497f -> :sswitch_25
        0x2b5acee0 -> :sswitch_9
        0x2c3bebb9 -> :sswitch_1a
        0x384f5016 -> :sswitch_19
        0x395f9243 -> :sswitch_1
        0x3a073062 -> :sswitch_24
        0x3cb88f40 -> :sswitch_12
        0x4080e06b -> :sswitch_2
        0x426738fe -> :sswitch_20
        0x42f782f6 -> :sswitch_1c
        0x435f7a35 -> :sswitch_1d
        0x47e79443 -> :sswitch_22
        0x48f4c694 -> :sswitch_11
        0x4f48dcaf -> :sswitch_24
        0x520a3d28 -> :sswitch_d
        0x59a0419e -> :sswitch_26
        0x5c3a5232 -> :sswitch_0
        0x5ccb928d -> :sswitch_7
        0x636e589a -> :sswitch_e
        0x68c9ef75 -> :sswitch_7
        0x69c89474 -> :sswitch_1b
        0x6a55048e -> :sswitch_1d
        0x6ab8ce09 -> :sswitch_10
        0x6c4c0989 -> :sswitch_4
        0x6e50785f -> :sswitch_12
        0x6e93df45 -> :sswitch_14
        0x75364145 -> :sswitch_1a
        0x762db280 -> :sswitch_d
        0x7794d8de -> :sswitch_f
        0x78fafd21 -> :sswitch_19
        0x7ec27ea2 -> :sswitch_21
        0x7f753e05 -> :sswitch_14
    .end sparse-switch
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 44

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v33, 0x1dfe0a72

    sget v34, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v35, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v36, "\u05ab\u06e4"

    invoke-static/range {v36 .. v36}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v36

    xor-int v36, v36, v34

    mul-int/lit8 v36, v36, 0x11

    xor-int v1, v36, v35

    mul-int/lit16 v1, v1, 0x41ad

    const v38, -0x6e1bf938

    xor-int v1, v1, v38

    const v38, 0x7feeb411

    xor-int v36, v36, v38

    move-object v3, v2

    move-object v15, v10

    move/from16 v37, v36

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v16, 0x1dfe0a72

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    :goto_0
    xor-int v11, v16, v35

    mul-int/lit16 v11, v11, -0x4d6f

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v1, v11

    xor-int v1, v37, v1

    sparse-switch v1, :sswitch_data_0

    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v12, v33

    move/from16 v11, v38

    .line 289
    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    .line 290
    invoke-static/range {p0 .. p0}, Ll/֨֫;->ܿ۬᩹(Ljava/lang/Object;)I

    move-result v14

    .line 291
    invoke-static/range {p0 .. p0}, Ll/ۖܽ;->۫᩺۠(Ljava/lang/Object;)I

    move-result v13

    .line 292
    iget-boolean v1, v0, Ll/ۜۜ᩺;->ᩴۙ:Z

    if-nez v1, :cond_15

    const-string v1, "\u073d\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v35, v1

    mul-int/lit8 v1, v1, -0x69

    xor-int v9, v1, v34

    mul-int/lit16 v9, v9, -0x1617

    const v16, 0x390bda19

    xor-int v9, v9, v16

    const v16, 0x63946be5

    goto/16 :goto_14

    :sswitch_0
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    sget-boolean v11, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v11, :cond_1

    move/from16 v37, v1

    :cond_0
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    goto/16 :goto_d

    :cond_1
    const-string v11, "\u05ab\u06ec"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    move/from16 v37, v1

    xor-int v1, v11, v34

    mul-int/lit16 v1, v1, -0x17a3

    const v16, 0x70ac23c9

    xor-int v1, v1, v16

    const v16, 0x529a192d

    xor-int v11, v11, v16

    move/from16 v16, v37

    move/from16 v37, v11

    goto :goto_0

    :sswitch_1
    move/from16 v37, v1

    .line 228
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v1

    if-gtz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    goto/16 :goto_5

    :sswitch_2
    move/from16 v37, v1

    .line 83
    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v1, :cond_0

    goto :goto_1

    :sswitch_3
    move/from16 v37, v1

    .line 251
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    if-lez v1, :cond_3

    goto/16 :goto_2

    :cond_3
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    goto/16 :goto_c

    :sswitch_4
    move/from16 v37, v1

    sget-boolean v1, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v1, :cond_5

    :cond_4
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    goto/16 :goto_11

    :cond_5
    :goto_1
    const-string v1, "\u0733\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v11, v1, v35

    mul-int/lit16 v11, v11, -0x2cad

    const v16, 0x686b284a

    xor-int v11, v11, v16

    const v16, -0x35294823    # -7035886.5f

    goto :goto_4

    :sswitch_5
    move/from16 v37, v1

    .line 283
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    if-lez v1, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "\u05ab\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v35

    mul-int/lit8 v1, v1, -0x25

    xor-int v11, v1, v34

    mul-int/lit16 v11, v11, 0x7553

    const v16, -0x342e4d2f    # -2.7485602E7f

    xor-int v11, v11, v16

    const v16, -0x53307ddc

    goto :goto_4

    :sswitch_6
    move/from16 v37, v1

    .line 309
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v1, :cond_4

    goto :goto_3

    :sswitch_7
    move/from16 v37, v1

    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    const-string v1, "\u1a73\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v11, v1, v35

    mul-int/lit16 v11, v11, -0x3b3d

    const v16, 0x34592d56

    xor-int v11, v11, v16

    const v16, -0x5b7c4936

    goto :goto_4

    :sswitch_8
    move/from16 v37, v1

    .line 313
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    :goto_3
    const-string v1, "\u06e7\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v35, v1

    mul-int/lit8 v1, v1, -0x27

    xor-int v11, v1, v34

    mul-int/lit16 v11, v11, -0x5871

    const v16, -0x36f0c6e1

    xor-int v11, v11, v16

    const v16, 0x2a694830

    :goto_4
    xor-int v1, v1, v16

    move/from16 v16, v37

    move/from16 v37, v1

    move v1, v11

    goto/16 :goto_0

    .line 267
    :sswitch_9
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    return-void

    :sswitch_a
    move/from16 v37, v1

    float-to-int v1, v9

    sub-float v11, v4, v21

    int-to-float v1, v1

    move/from16 v39, v9

    add-float v9, v1, v31

    .line 311
    invoke-virtual {v3, v11, v1, v4, v9}, Ll/᩹ܺ᩺;->ۙ(FFFF)V

    move-object/from16 v40, v3

    move/from16 v3, v38

    move-object/from16 v11, p1

    move v3, v12

    move/from16 v12, v24

    move/from16 v41, v13

    move v13, v1

    move v1, v14

    move v14, v4

    move-object/from16 v42, v15

    move v15, v9

    move-object/from16 v16, v42

    .line 312
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move/from16 v9, v41

    move-object/from16 v15, v42

    goto/16 :goto_18

    :sswitch_b
    move/from16 v37, v1

    move-object/from16 v40, v3

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    move-object/from16 v42, v15

    .line 309
    invoke-static {v8, v10}, Ll/֡۠;->ܺ۬ܺ(II)I

    move-result v9

    int-to-float v9, v9

    mul-float v9, v9, v32

    .line 294
    sget v11, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v11, :cond_8

    move/from16 v39, v9

    move/from16 v9, v41

    move-object/from16 v15, v42

    goto/16 :goto_c

    :cond_8
    const-string v11, "\u073d\u1a75"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v34

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, -0x6bab

    const v13, -0xcacb945

    xor-int/2addr v12, v13

    const v13, -0x2c0334d9

    xor-int/2addr v11, v13

    move v14, v1

    move v1, v12

    move/from16 v16, v37

    move/from16 v13, v41

    goto/16 :goto_a

    :sswitch_c
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    move-object/from16 v42, v15

    sub-float v9, v25, v31

    int-to-float v10, v8

    div-float v32, v9, v10

    .line 309
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v10

    .line 93
    sget-boolean v9, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v9, :cond_9

    move/from16 v11, v38

    move/from16 v9, v41

    move-object/from16 v15, v42

    goto/16 :goto_d

    :cond_9
    const-string v9, "\u06d8\u1a74"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v35, v9

    mul-int/lit8 v9, v9, 0x47

    xor-int v11, v9, v34

    mul-int/lit16 v11, v11, -0x1ecf

    const v12, -0xbb523fd

    xor-int/2addr v11, v12

    const v12, -0x241a23df

    xor-int/2addr v9, v12

    move v14, v1

    move v12, v3

    move v1, v11

    move/from16 v16, v37

    move-object/from16 v3, v40

    move/from16 v13, v41

    move-object/from16 v15, v42

    goto/16 :goto_8

    :sswitch_d
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    move-object/from16 v42, v15

    float-to-int v9, v2

    shl-int/lit8 v9, v9, 0x18

    or-int v9, v27, v9

    .line 307
    invoke-virtual {v15, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 308
    iget v9, v0, Ll/ۜۜ᩺;->᩻:F

    .line 311
    sget v11, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v11, :cond_a

    move/from16 v31, v9

    move/from16 v9, v41

    goto/16 :goto_e

    :cond_a
    const-string v11, "\u073a\u1a73"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v34

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, -0x138f

    const v13, -0x72ebafae

    xor-int/2addr v12, v13

    const v13, 0x63b7a2bd

    xor-int/2addr v11, v13

    move v14, v1

    move/from16 v31, v9

    move v1, v12

    move/from16 v16, v37

    move/from16 v9, v39

    move/from16 v13, v41

    goto/16 :goto_10

    :sswitch_e
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    and-int v2, v28, v29

    int-to-float v2, v2

    mul-float v2, v2, v6

    .line 277
    sget v9, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v9, :cond_b

    :goto_5
    const-string v9, "\u0730\u1a74"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int v9, v9, v34

    mul-int/lit8 v9, v9, 0x49

    xor-int v11, v9, v35

    mul-int/lit16 v11, v11, 0x2e93

    const v12, -0x6e8fba38

    xor-int/2addr v11, v12

    const v12, -0x267e8236

    goto/16 :goto_7

    :cond_b
    const-string v9, "\u06eb\u06dc"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v35, v9

    mul-int/lit8 v9, v9, -0x47

    xor-int v11, v9, v34

    mul-int/lit16 v11, v11, -0x1e0f

    const v12, -0x1f46aa43

    xor-int/2addr v11, v12

    const v12, 0x64858a8b

    goto/16 :goto_7

    :sswitch_f
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    and-int v27, v26, v18

    ushr-int/lit8 v28, v26, 0x18

    const/16 v29, 0xff

    .line 174
    sget v9, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v9, :cond_c

    move/from16 v11, v38

    move/from16 v9, v41

    goto/16 :goto_d

    :cond_c
    const-string v9, "\u0733\u06ec"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v34, v9

    mul-int/lit8 v9, v9, -0x1d

    xor-int v11, v9, v35

    mul-int/lit16 v11, v11, 0x200f

    const v12, -0x7f44f6a2

    xor-int/2addr v11, v12

    const v12, -0x39cae79d

    goto :goto_7

    :sswitch_10
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    .line 303
    sget v9, Ll/᩶᩵ۘ;->ۙ:I

    goto :goto_6

    :sswitch_11
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    iget v9, v0, Ll/ۜۜ᩺;->ۧ:I

    :goto_6
    move/from16 v26, v9

    const-string v9, "\u06e0\u06e1"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v34

    xor-int v11, v9, v35

    mul-int/lit16 v11, v11, -0x4b01

    const v12, -0x448c66c0

    xor-int/2addr v11, v12

    const v12, -0x5694b4f7

    :goto_7
    xor-int/2addr v9, v12

    move v14, v1

    move v12, v3

    move v1, v11

    move/from16 v16, v37

    move-object/from16 v3, v40

    move/from16 v13, v41

    :goto_8
    move/from16 v37, v9

    goto/16 :goto_24

    :sswitch_12
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    int-to-float v6, v3

    const/high16 v9, 0x43960000    # 300.0f

    div-float/2addr v6, v9

    sub-float v6, v5, v6

    move/from16 v16, v1

    move v14, v2

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move/from16 v9, v41

    goto/16 :goto_1e

    :sswitch_13
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    int-to-float v9, v7

    move/from16 v14, v36

    int-to-float v11, v14

    div-float/2addr v9, v11

    const/high16 v11, 0x40600000    # 3.5f

    cmpl-float v9, v9, v11

    if-lez v9, :cond_d

    move/from16 v36, v14

    move/from16 v12, v33

    move/from16 v11, v38

    move/from16 v13, v41

    move v14, v1

    goto/16 :goto_13

    :cond_d
    move/from16 v16, v1

    move/from16 v36, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move/from16 v9, v41

    move v14, v2

    goto/16 :goto_1c

    :sswitch_14
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    move/from16 v14, v36

    int-to-float v4, v1

    sub-float v24, v4, v22

    move/from16 v9, v41

    int-to-float v13, v9

    const/16 v16, 0x0

    move-object/from16 v11, p1

    move/from16 v12, v24

    move/from16 v25, v13

    move/from16 v13, v16

    move v14, v4

    move-object/from16 v42, v15

    move/from16 v15, v25

    move-object/from16 v16, v42

    .line 301
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 303
    iget-boolean v11, v0, Ll/ۜۜ᩺;->ᩴۙ:Z

    if-eqz v11, :cond_e

    const-string v11, "\u06eb\u06e7"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    xor-int v12, v11, v34

    mul-int/lit16 v12, v12, -0x76f3

    const v13, -0x53438eba

    xor-int/2addr v12, v13

    const v13, -0x67850893

    goto :goto_9

    :cond_e
    const-string v11, "\u06db\u06e1"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v34

    mul-int/lit8 v11, v11, -0x41

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, 0x11dd

    const v13, 0x30bfb186

    xor-int/2addr v12, v13

    const v13, 0x7d05a23d

    :goto_9
    xor-int/2addr v11, v13

    move v14, v1

    move v13, v9

    move v1, v12

    move/from16 v16, v37

    move/from16 v9, v39

    :goto_a
    move-object/from16 v15, v42

    goto/16 :goto_10

    :sswitch_15
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move-object/from16 v42, v15

    .line 299
    iget v11, v0, Ll/ۜۜ᩺;->ܳ:F

    mul-float v22, v11, v6

    .line 127
    sget v12, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v12, :cond_f

    move/from16 v21, v11

    move/from16 v11, v38

    move-object/from16 v15, v42

    goto/16 :goto_11

    :cond_f
    const-string v12, "\u06d6\u1a75"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v34

    mul-int/lit8 v12, v12, 0x9

    xor-int v13, v12, v35

    mul-int/lit16 v13, v13, -0x2a73

    const v14, 0xb28b8ca

    xor-int/2addr v13, v14

    const v14, 0x6b653aef

    xor-int/2addr v12, v14

    move v14, v1

    move/from16 v21, v11

    move v1, v13

    move/from16 v16, v37

    move-object/from16 v15, v42

    :goto_b
    move v13, v9

    move/from16 v37, v12

    goto/16 :goto_19

    :sswitch_16
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move-object/from16 v42, v15

    shl-int/lit8 v11, v20, 0x18

    or-int v11, v11, v19

    .line 298
    invoke-virtual {v15, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 320
    sget v11, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v11, :cond_10

    :goto_c
    const-string v11, "\u073a\u1a74"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v34

    mul-int/lit8 v11, v11, -0x21

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, -0x6f21

    const v13, 0x2268ee8d

    xor-int/2addr v12, v13

    const v13, 0xb59c7e9

    goto/16 :goto_f

    :cond_10
    const-string v11, "\u1a79\u1a7b"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v34

    mul-int/lit8 v11, v11, -0x39

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, 0x37ff

    const v13, 0x2aeee0a0

    xor-int/2addr v12, v13

    const v13, -0x630e0325

    goto/16 :goto_f

    :sswitch_17
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    and-int/lit16 v12, v11, 0xff

    int-to-float v12, v12

    mul-float v12, v12, v6

    float-to-int v12, v12

    .line 241
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v13

    if-gtz v13, :cond_11

    move/from16 v20, v12

    :goto_d
    const-string v12, "\u06d8\u06e1"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v35, v12

    mul-int/lit8 v12, v12, -0x45

    xor-int v13, v12, v34

    mul-int/lit16 v13, v13, -0x6df5

    const v14, -0x6d02fd0e

    xor-int/2addr v13, v14

    const v14, -0x13fdce11

    goto/16 :goto_12

    :cond_11
    const-string v13, "\u05a8\u0733"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v35

    mul-int/lit8 v13, v13, 0x2f

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, -0x41c1

    const v16, -0x61aabf5

    xor-int v14, v14, v16

    const v16, 0x3824a57e

    xor-int v13, v13, v16

    move/from16 v38, v11

    move/from16 v20, v12

    goto/16 :goto_17

    :sswitch_18
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    and-int v19, v17, v18

    ushr-int/lit8 v38, v17, 0x18

    .line 73
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v11

    if-ltz v11, :cond_12

    :goto_e
    const-string v11, "\u05a1\u06df"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v34

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, -0x3db9

    const v13, -0x67f8d9ed

    xor-int/2addr v12, v13

    const v13, 0x1ab1d1bc

    goto :goto_f

    :cond_12
    const-string v11, "\u06d6\u1a73"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    xor-int v12, v11, v34

    mul-int/lit16 v12, v12, -0x3ab9

    const v13, 0x6114739

    xor-int/2addr v12, v13

    const v13, -0x79a117fc

    :goto_f
    xor-int/2addr v11, v13

    move v14, v1

    move v13, v9

    move v1, v12

    move/from16 v16, v37

    move/from16 v9, v39

    :goto_10
    move v12, v3

    move/from16 v37, v11

    goto/16 :goto_1a

    :sswitch_19
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    const/4 v12, 0x1

    .line 293
    iput-boolean v12, v0, Ll/ۜۜ᩺;->ܰۙ:Z

    .line 294
    iget v12, v0, Ll/ۜۜ᩺;->֫:I

    const v18, 0xffffff

    .line 288
    sget v13, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v13, :cond_13

    move/from16 v17, v12

    :goto_11
    const-string v12, "\u073a\u06d6"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v35

    xor-int v13, v12, v34

    mul-int/lit16 v13, v13, 0x569b

    const v14, -0x1e55d78a

    xor-int/2addr v13, v14

    const v14, -0x621314a5

    :goto_12
    xor-int/2addr v12, v14

    move v14, v1

    move/from16 v38, v11

    move v1, v13

    move/from16 v16, v37

    goto/16 :goto_b

    :cond_13
    const-string v13, "\u06e1\u1a78"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v34

    xor-int v14, v13, v35

    mul-int/lit16 v14, v14, 0x71b

    const v16, 0x2e2ea6cc

    xor-int v14, v14, v16

    const v16, 0x47a8428c

    xor-int v13, v13, v16

    move/from16 v38, v11

    move/from16 v17, v12

    goto/16 :goto_17

    :sswitch_1a
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    .line 326
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    move/from16 v12, v33

    goto/16 :goto_15

    :sswitch_1b
    return-void

    :sswitch_1c
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    move/from16 v12, v33

    add-int/lit16 v3, v12, -0x5dc

    const/16 v13, 0x12c

    if-ge v3, v13, :cond_14

    const-string v13, "\u1a79\u1a73"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v35

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, -0x52ad

    const v16, 0x1a15bba3

    xor-int v14, v14, v16

    const v16, 0x79cb8318

    goto/16 :goto_16

    :cond_14
    move/from16 v16, v1

    move v14, v2

    move/from16 v33, v12

    move/from16 v13, v30

    goto/16 :goto_1b

    :cond_15
    :goto_13
    const-string v1, "\u06dc\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v34

    mul-int/lit8 v1, v1, -0x53

    xor-int v9, v1, v35

    mul-int/lit16 v9, v9, 0x13db

    const v16, 0x6a63151b

    xor-int v9, v9, v16

    const v16, 0x6ffd8d92

    :goto_14
    xor-int v1, v1, v16

    move/from16 v38, v11

    move/from16 v33, v12

    move/from16 v16, v37

    move/from16 v37, v1

    move v12, v3

    move v1, v9

    move/from16 v9, v39

    goto/16 :goto_1a

    :sswitch_1d
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v12, v33

    move/from16 v11, v38

    .line 325
    iget-boolean v13, v0, Ll/ۜۜ᩺;->ܰۙ:Z

    if-eqz v13, :cond_16

    const-string v13, "\u1a74\u1a78"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v35

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, 0x5a59

    const v16, 0x60e5320d

    xor-int v14, v14, v16

    const v16, -0x5b9d1d11

    goto/16 :goto_16

    :cond_16
    :goto_15
    const-string v13, "\u06e0\u1a77"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v35

    mul-int/lit8 v13, v13, 0x35

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, 0x7f0f

    const v16, 0x78be12af

    xor-int v14, v14, v16

    const v16, 0x2bd9c47f

    goto/16 :goto_16

    :sswitch_1e
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v12, v33

    move/from16 v11, v38

    const/16 v13, 0x5dc

    if-gt v12, v13, :cond_17

    move/from16 v16, v1

    move v14, v2

    move/from16 v13, v30

    goto/16 :goto_1d

    :cond_17
    const-string v13, "\u05a1\u05a8"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v34

    xor-int v14, v13, v35

    mul-int/lit16 v14, v14, 0x1491

    const v16, 0x775fa85c

    xor-int v14, v14, v16

    const v16, 0x4916b8

    goto :goto_16

    :sswitch_1f
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v12, v33

    move/from16 v11, v38

    const/4 v6, 0x0

    move/from16 v16, v1

    move v14, v2

    move/from16 v13, v30

    goto/16 :goto_1e

    :sswitch_20
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v12, v33

    move/from16 v11, v38

    if-lez v8, :cond_18

    const-string v13, "\u06d8\u073d"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v35, v13

    mul-int/lit8 v13, v13, -0x31

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, -0x7b59

    const v16, -0x700c343d

    xor-int v14, v14, v16

    const v16, -0x1634645c

    :goto_16
    xor-int v13, v13, v16

    move/from16 v38, v11

    move/from16 v33, v12

    :goto_17
    move/from16 v16, v37

    move v12, v3

    move/from16 v37, v13

    move-object/from16 v3, v40

    move v13, v9

    move/from16 v9, v39

    move/from16 v43, v14

    move v14, v1

    move/from16 v1, v43

    goto/16 :goto_0

    :cond_18
    move/from16 v16, v1

    move v14, v2

    move/from16 v13, v30

    goto/16 :goto_1c

    :sswitch_21
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    .line 341
    iput-boolean v13, v0, Ll/ۜۜ᩺;->ܰۙ:Z

    .line 342
    invoke-virtual/range {v40 .. v40}, Ll/᩹ܺ᩺;->ۙ()V

    :goto_18
    const-string v14, "\u073a\u06df"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int v14, v14, v34

    move/from16 v16, v1

    xor-int v1, v14, v35

    mul-int/lit16 v1, v1, 0x75d5

    const v30, -0x20c2f0ac

    xor-int v1, v1, v30

    const v30, 0x134903b3

    xor-int v14, v14, v30

    move/from16 v38, v11

    move/from16 v33, v12

    move/from16 v30, v13

    move v12, v3

    move v13, v9

    move/from16 v9, v39

    move-object/from16 v3, v40

    move/from16 v43, v37

    move/from16 v37, v14

    goto/16 :goto_21

    :sswitch_22
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move/from16 v16, v14

    move/from16 v13, v30

    move/from16 v11, v38

    .line 269
    invoke-static {}, Ll/֨᩺;->۬ܽ᩻()J

    move-result-wide v41

    move v14, v2

    iget-wide v1, v0, Ll/ۜۜ᩺;->ۘۙ:J

    sub-long v1, v41, v1

    long-to-int v2, v1

    if-ltz v2, :cond_19

    const-string v1, "\u06db\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v12, v1, v35

    mul-int/lit16 v12, v12, 0x5e61

    const v30, 0x3d05b872

    xor-int v12, v12, v30

    const v30, -0x698c2b15

    xor-int v1, v1, v30

    move/from16 v33, v2

    move/from16 v38, v11

    move/from16 v30, v13

    move v2, v14

    move/from16 v14, v16

    move/from16 v16, v37

    move/from16 v37, v1

    move v13, v9

    move v1, v12

    :goto_19
    move/from16 v9, v39

    move v12, v3

    :goto_1a
    move-object/from16 v3, v40

    goto/16 :goto_0

    :cond_19
    move/from16 v33, v2

    :goto_1b
    move v12, v3

    const-string v1, "\u1a75\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v2, v1, v34

    mul-int/lit16 v2, v2, -0x236b

    const v3, -0x36171da4

    xor-int/2addr v2, v3

    const v3, -0x6dfd7d13

    xor-int/2addr v1, v3

    move/from16 v38, v11

    move/from16 v30, v13

    move-object/from16 v3, v40

    move v13, v9

    move/from16 v9, v39

    goto/16 :goto_20

    :sswitch_23
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move/from16 v16, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move v14, v2

    .line 284
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getCount()I

    move-result v7

    .line 285
    invoke-static/range {p0 .. p0}, Ll/ۘۚ;->ܿܰܶ(Ljava/lang/Object;)I

    move-result v1

    sub-int v8, v7, v1

    .line 287
    invoke-virtual/range {p0 .. p0}, Ll/ۜۜ᩺;->ۙ()I

    move-result v36

    if-lez v1, :cond_1a

    const-string v1, "\u073f\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    mul-int/lit8 v1, v1, 0x7

    xor-int v2, v1, v34

    mul-int/lit16 v2, v2, -0x7841

    const v30, -0x6dede864

    xor-int v2, v2, v30

    const v30, 0x686720c2

    goto/16 :goto_1f

    :cond_1a
    :goto_1c
    const-string v1, "\u06e4\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v2, v1, v35

    mul-int/lit16 v2, v2, 0xaaf

    const v30, 0x1f321cc3

    xor-int v2, v2, v30

    const v30, -0x7b1fcb74

    goto/16 :goto_1f

    :sswitch_24
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move/from16 v16, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move v14, v2

    .line 266
    invoke-direct/range {p0 .. p0}, Ll/ۜۜ᩺;->᩹()Z

    move-result v1

    if-eqz v1, :cond_1b

    goto/16 :goto_1d

    :cond_1b
    const-string v1, "\u06d7\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v2, v1, v34

    mul-int/lit16 v2, v2, -0x3ac9

    const v30, -0x7b9d84a5

    xor-int v2, v2, v30

    const v30, -0x570ea0e5

    goto/16 :goto_1f

    :sswitch_25
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move/from16 v16, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move v14, v2

    cmpg-float v1, v6, v23

    if-gtz v1, :cond_1c

    move/from16 v30, v13

    move-object/from16 v2, v40

    goto/16 :goto_22

    :cond_1c
    const-string v1, "\u1a7b\u06eb"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    mul-int/lit8 v1, v1, -0x33

    xor-int v2, v1, v35

    mul-int/lit16 v2, v2, -0x60b3

    const v30, -0x1b950c1b

    xor-int v2, v2, v30

    const v30, -0x4653e34d

    goto :goto_1f

    :sswitch_26
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move/from16 v16, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move v14, v2

    iget-boolean v1, v0, Ll/ۜۜ᩺;->ᩴۙ:Z

    const/16 v23, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    if-nez v1, :cond_1d

    const-string v1, "\u06e2\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v2, v1, v34

    mul-int/lit16 v2, v2, -0x3f01

    const v30, -0x3d239131

    xor-int v2, v2, v30

    const v30, 0x2b77e82b

    goto :goto_1f

    :cond_1d
    :goto_1d
    move v6, v5

    :goto_1e
    const-string v1, "\u05a8\u1a7b"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v2, v1, v35

    mul-int/lit16 v2, v2, 0x5b59

    const v30, 0x730baeb1

    xor-int v2, v2, v30

    const v30, -0x2e0ee875

    :goto_1f
    xor-int v1, v1, v30

    move/from16 v38, v11

    move/from16 v33, v12

    move/from16 v30, v13

    move v12, v3

    move v13, v9

    move/from16 v9, v39

    move-object/from16 v3, v40

    :goto_20
    move/from16 v43, v37

    move/from16 v37, v1

    move v1, v2

    move v2, v14

    :goto_21
    move/from16 v14, v16

    move/from16 v16, v43

    goto/16 :goto_0

    :sswitch_27
    move-object/from16 v40, v3

    move/from16 v13, v30

    .line 341
    iput-boolean v13, v0, Ll/ۜۜ᩺;->ܰۙ:Z

    .line 342
    invoke-virtual/range {v40 .. v40}, Ll/᩹ܺ᩺;->ۙ()V

    return-void

    :sswitch_28
    move/from16 v37, v1

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move/from16 v16, v14

    move/from16 v12, v33

    move/from16 v11, v38

    move v14, v2

    .line 260
    invoke-super/range {p0 .. p1}, Landroid/widget/ListView;->draw(Landroid/graphics/Canvas;)V

    .line 261
    iget-boolean v1, v0, Ll/ۜۜ᩺;->ۖۙ:Z

    const/16 v30, 0x0

    iget-object v2, v0, Ll/ۜۜ᩺;->ۙۙ:Ll/᩹ܺ᩺;

    if-nez v1, :cond_1e

    :goto_22
    const-string v1, "\u06eb\u1a78"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v13, v1, v35

    mul-int/lit16 v13, v13, 0x58c9

    const v33, -0x30c4d5f8

    xor-int v13, v13, v33

    const v33, -0x1f319172    # -1.1899986E20f

    :goto_23
    xor-int v1, v1, v33

    move/from16 v38, v11

    move/from16 v33, v12

    move v12, v3

    move-object v3, v2

    move v2, v14

    move/from16 v14, v16

    move/from16 v16, v37

    move/from16 v37, v1

    move v1, v13

    move v13, v9

    :goto_24
    move/from16 v9, v39

    goto/16 :goto_0

    :cond_1e
    const-string v1, "\u06e0\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v13, v1, v34

    mul-int/lit16 v13, v13, 0x6f41

    const v33, 0x466ffeab

    xor-int v13, v13, v33

    const v33, -0x654160e2

    goto :goto_23

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f64f120 -> :sswitch_7
        -0x7e014424 -> :sswitch_8
        -0x7af2d6aa -> :sswitch_10
        -0x7836bf85 -> :sswitch_26
        -0x76e50f7c -> :sswitch_13
        -0x73ea5f2e -> :sswitch_f
        -0x71f47d0a -> :sswitch_22
        -0x70f48df3 -> :sswitch_25
        -0x70a818b6 -> :sswitch_19
        -0x70894520 -> :sswitch_1f
        -0x65198122 -> :sswitch_0
        -0x64d6fac2 -> :sswitch_17
        -0x5e6120d8 -> :sswitch_21
        -0x59dfe381 -> :sswitch_20
        -0x56969947 -> :sswitch_9
        -0x51d4d840 -> :sswitch_24
        -0x4f411a93 -> :sswitch_d
        -0x4cf2c796 -> :sswitch_1e
        -0x4a7978bd -> :sswitch_22
        -0x47cec42d -> :sswitch_19
        -0x46e950f4 -> :sswitch_1a
        -0x441b791d -> :sswitch_12
        -0x42e626c6 -> :sswitch_20
        -0x3f17c71e -> :sswitch_15
        -0x3a4f5647 -> :sswitch_27
        -0x3395a4e3 -> :sswitch_4
        -0x2c05f61e -> :sswitch_e
        -0x285ec52a -> :sswitch_f
        -0x278da9d9 -> :sswitch_17
        -0x1e1eed67 -> :sswitch_8
        -0x1cdad0bb -> :sswitch_3
        -0x13608354 -> :sswitch_d
        -0x105799f5 -> :sswitch_5
        -0xfa5e794 -> :sswitch_b
        -0xe6ea7d2 -> :sswitch_28
        -0xc90e530 -> :sswitch_1a
        -0xc217599 -> :sswitch_3
        -0xbbb1920 -> :sswitch_1d
        -0xb70167e -> :sswitch_25
        -0x97df9db -> :sswitch_a
        -0x91a83de -> :sswitch_5
        0x2882162 -> :sswitch_28
        0x31b2a9b -> :sswitch_6
        0x6f8a540 -> :sswitch_e
        0x7b9befd -> :sswitch_11
        0xf7178a6 -> :sswitch_21
        0x117d9f48 -> :sswitch_6
        0x129943ae -> :sswitch_13
        0x1578117d -> :sswitch_10
        0x20726550 -> :sswitch_11
        0x21c344c5 -> :sswitch_4
        0x2489b047 -> :sswitch_2
        0x25379545 -> :sswitch_1c
        0x26ebab35 -> :sswitch_23
        0x2905e223 -> :sswitch_1c
        0x31ba86b1 -> :sswitch_23
        0x320dc9cf -> :sswitch_1b
        0x33f1cbc8 -> :sswitch_c
        0x36000498 -> :sswitch_24
        0x3637d28c -> :sswitch_1d
        0x3a109f42 -> :sswitch_14
        0x3be1ec13 -> :sswitch_15
        0x3fcf5338 -> :sswitch_0
        0x46c96f1e -> :sswitch_c
        0x47c857af -> :sswitch_26
        0x48002b0e -> :sswitch_1
        0x49c415fb -> :sswitch_9
        0x4a47d956 -> :sswitch_1b
        0x4fedaceb -> :sswitch_1
        0x50dec32a -> :sswitch_16
        0x51ad2161 -> :sswitch_27
        0x52b09288 -> :sswitch_b
        0x5a49c8ca -> :sswitch_14
        0x5bafd02d -> :sswitch_7
        0x5fb2e2d3 -> :sswitch_16
        0x62d69ae1 -> :sswitch_18
        0x62ff5c23 -> :sswitch_18
        0x64bfcf65 -> :sswitch_12
        0x68c47c44 -> :sswitch_2
        0x6fd2da3e -> :sswitch_1e
        0x753ea49f -> :sswitch_1f
        0x7dffab17 -> :sswitch_a
    .end sparse-switch
.end method

.method public final isFastScrollEnabled()Z
    .locals 1

    .line 203
    iget-boolean v0, p0, Ll/ۜۜ᩺;->ۖۙ:Z

    return v0
.end method

.method public final layoutChildren()V
    .locals 6

    const v0, 0x5f0918c6

    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    const-string v3, "\u06da\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, -0x35

    const v5, -0x17440743

    xor-int/2addr v4, v5

    const v5, -0x3e262e

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0xe35

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 198
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_2

    goto/16 :goto_2

    .line 359
    :sswitch_0
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_7

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v3, :cond_b

    goto :goto_1

    .line 622
    :sswitch_2
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    :goto_1
    const-string v3, "\u06e4\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6195

    const v5, 0x65c32332

    xor-int/2addr v4, v5

    const v5, -0x363b53b9

    goto :goto_0

    .line 722
    :sswitch_3
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    :sswitch_4
    return-void

    .line 734
    :sswitch_5
    :try_start_0
    invoke-super {p0}, Landroid/widget/ListView;->layoutChildren()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    const-string v3, "\u073f\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x39bb

    const v5, -0x4fe40c45

    xor-int/2addr v4, v5

    const v5, 0x29108e1b

    goto :goto_0

    .line 692
    :sswitch_6
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06d7\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x54eb

    const v5, 0x1b74c9ba

    xor-int/2addr v4, v5

    const v5, -0x7308a02f

    goto :goto_0

    .line 416
    :sswitch_7
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06e4\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x59eb

    const v5, -0x1d1c9b1e

    xor-int/2addr v4, v5

    const v5, -0x25bf4428

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_3

    :cond_2
    const-string v3, "\u1a77\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4ffd

    const v5, 0x6d3351bf

    xor-int/2addr v4, v5

    const v5, 0x3249f43e

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06da\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4ab9

    const v5, 0x77f838a4

    xor-int/2addr v4, v5

    const v5, -0x5ddc5af7

    goto/16 :goto_0

    .line 445
    :sswitch_9
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06db\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x27e7

    const v5, -0x657d0cac

    xor-int/2addr v4, v5

    const v5, 0x4a54859a    # 3481958.5f

    goto/16 :goto_0

    .line 11
    :sswitch_a
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-ltz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u05a8\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xcfb

    const v5, 0x63f48863

    xor-int/2addr v4, v5

    const v5, -0x6a8c81e6

    goto/16 :goto_0

    .line 82
    :sswitch_b
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06e7\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5b55

    const v5, 0x204193d0

    xor-int/2addr v4, v5

    const v5, 0x6387f2ae

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u073a\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4a2f

    const v5, 0x538ad75c

    xor-int/2addr v4, v5

    const v5, 0x36467109

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06eb\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2ecb

    const v5, -0xef6ee15

    xor-int/2addr v4, v5

    const v5, -0x3b2aa6d

    goto/16 :goto_0

    .line 18
    :sswitch_d
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u05a8\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4d3f

    const v5, 0x493ceba5

    xor-int/2addr v4, v5

    const v5, 0x78d565a3

    goto/16 :goto_0

    .line 300
    :sswitch_e
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v3

    if-gtz v3, :cond_a

    :goto_3
    const-string v3, "\u1a7a\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7df1

    const v5, 0x42316a78

    xor-int/2addr v4, v5

    const v5, 0x66c84990

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a73\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4da1

    const v5, -0x5d2b09fb

    xor-int/2addr v4, v5

    const v5, -0x2f81f4d5

    goto/16 :goto_0

    .line 196
    :sswitch_f
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06d6\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7c43

    const v5, 0x46b9820a

    xor-int/2addr v4, v5

    const v5, -0x7bd635e0

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e2\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6e11

    const v5, 0x248928c5

    xor-int/2addr v4, v5

    const v5, 0x6f370103

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b137094 -> :sswitch_8
        -0x78a2a296 -> :sswitch_0
        -0x6c933496 -> :sswitch_5
        -0x6aa8f8e6 -> :sswitch_4
        -0x5f15016f -> :sswitch_a
        -0x4e2a967f -> :sswitch_d
        -0x462ad0ec -> :sswitch_2
        -0x45c0737e -> :sswitch_9
        -0x3d21944a -> :sswitch_d
        -0x34643ac8 -> :sswitch_7
        -0x30cf79a8 -> :sswitch_2
        -0x29a0f5f1 -> :sswitch_3
        -0x29960a98 -> :sswitch_5
        -0x20261d11 -> :sswitch_7
        -0x1fa5875b -> :sswitch_f
        -0x1d0be20b -> :sswitch_e
        -0x1c2920c0 -> :sswitch_b
        -0x110be0a3 -> :sswitch_a
        0x3129224 -> :sswitch_8
        0x71bcd94 -> :sswitch_6
        0xc18fdc3 -> :sswitch_6
        0xcc9f4d4 -> :sswitch_f
        0x1c6fb493 -> :sswitch_0
        0x24718a37 -> :sswitch_9
        0x29ddedd4 -> :sswitch_1
        0x31931d30 -> :sswitch_c
        0x38de17b4 -> :sswitch_3
        0x4964ceeb -> :sswitch_b
        0x5d6075fc -> :sswitch_c
        0x6056a5c1 -> :sswitch_4
        0x698abc26 -> :sswitch_1
        0x72774ebc -> :sswitch_e
    .end sparse-switch
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 23

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

    const v16, 0x7871aeda

    sget v17, Ll/֡֡;->᩶ۤ۠:I

    sget v18, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v19, "\u06ec\u06e2"

    invoke-static/range {v19 .. v19}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v18

    xor-int v1, v19, v17

    mul-int/lit16 v1, v1, -0x2f91

    const v21, 0x60c3a45a

    xor-int v1, v1, v21

    const v21, -0x3d17e085

    xor-int v19, v19, v21

    move-object v4, v3

    move-object v15, v14

    move/from16 v20, v19

    const/4 v2, 0x0

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

    const/16 v16, 0x0

    const v19, 0x7871aeda

    const/16 v21, 0x0

    :goto_0
    xor-int v3, v19, v17

    mul-int/lit16 v3, v3, 0x2f27

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v19, v20, v1

    sparse-switch v19, :sswitch_data_0

    .line 664
    iget v1, v0, Ll/ۜۜ᩺;->۫:F

    sub-float v11, v10, v1

    mul-float v12, v9, v9

    .line 504
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v1

    if-gtz v1, :cond_9

    goto/16 :goto_4

    .line 66
    :sswitch_0
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v1

    if-nez v1, :cond_0

    :goto_1
    move/from16 v20, v5

    move/from16 v3, v21

    goto/16 :goto_b

    :cond_0
    const-string v1, "\u1a75\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x2733

    const v20, 0x47a25a53

    xor-int v3, v3, v20

    const v20, 0x6279ba16

    goto/16 :goto_7

    .line 207
    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v1, :cond_d

    goto :goto_2

    .line 393
    :sswitch_2
    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "\u06e1\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x728b

    const v20, 0x67d5b006

    xor-int v3, v3, v20

    const v20, -0x376891a8    # -310130.75f

    goto/16 :goto_7

    .line 497
    :sswitch_3
    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez v1, :cond_3

    :cond_2
    move/from16 v20, v5

    move/from16 v3, v21

    goto/16 :goto_e

    :cond_3
    :goto_2
    const-string v1, "\u1a78\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x7efb

    const v20, 0x11f478be

    xor-int v3, v3, v20

    const v20, 0x72d0ecc

    goto/16 :goto_7

    :sswitch_4
    sget-boolean v1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-nez v1, :cond_2

    goto/16 :goto_5

    .line 190
    :sswitch_5
    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    if-lez v1, :cond_b

    goto :goto_1

    .line 12
    :sswitch_6
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    goto :goto_1

    .line 662
    :sswitch_7
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    const/4 v1, 0x0

    return v1

    .line 671
    :sswitch_8
    iget v1, v0, Ll/ۜۜ᩺;->ۛ:I

    invoke-virtual {v15, v2, v1}, Ll/ܿܰۙ;->ۙ(II)V

    goto :goto_3

    .line 674
    :sswitch_9
    invoke-static/range {p0 .. p0}, Ll/ۘۧ;->ᩳᩳܺ(Ljava/lang/Object;)V

    .line 675
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    return v2

    .line 673
    :sswitch_a
    iput v5, v0, Ll/ۜۜ᩺;->᩸ۙ:F

    .line 370
    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u0730\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x4753

    const v20, 0x3481d819

    xor-int v3, v3, v20

    const v20, 0x22075b6f

    goto/16 :goto_7

    .line 673
    :sswitch_b
    iget v1, v4, Ll/᩹ܺ᩺;->ۚ:F

    iget v3, v0, Ll/ۜۜ᩺;->۫:F

    sub-float v5, v1, v3

    .line 626
    sget v1, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v1, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u06d8\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x2f

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x76c9

    const v20, -0x3179f5eb

    xor-int v3, v3, v20

    const v20, -0x7e982001

    goto/16 :goto_7

    .line 667
    :sswitch_c
    iput-boolean v6, v0, Ll/ۜۜ᩺;->۬ۙ:Z

    .line 668
    iput-boolean v2, v0, Ll/ۜۜ᩺;->ᩴۙ:Z

    .line 669
    invoke-direct/range {p0 .. p1}, Ll/ۜۜ᩺;->ܰ(Landroid/view/MotionEvent;)V

    .line 670
    iget-object v15, v0, Ll/ۜۜ᩺;->ܿ:Ll/ܿܰۙ;

    if-eqz v15, :cond_6

    const-string v1, "\u05a1\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x19

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x7da9

    const v20, 0x76de7029

    xor-int v3, v3, v20

    const v20, 0x2b4db861

    goto/16 :goto_7

    :cond_6
    :goto_3
    const-string v1, "\u1a77\u1a7b"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x79e3

    const v20, 0x762818ad

    xor-int v3, v3, v20

    const v20, 0x795c0e3e

    goto/16 :goto_7

    :sswitch_d
    mul-int v1, v14, v14

    int-to-float v1, v1

    cmpl-float v1, v13, v1

    if-lez v1, :cond_7

    const-string v1, "\u0733\u1a78"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x71db

    const v20, 0x50deee9e

    xor-int v3, v3, v20

    const v20, -0x541eb8d0

    goto/16 :goto_7

    :cond_7
    move/from16 v20, v5

    move/from16 v3, v21

    goto/16 :goto_a

    :sswitch_e
    mul-float v1, v11, v11

    add-float v13, v1, v12

    .line 665
    iget v14, v0, Ll/ۜۜ᩺;->᩺ۙ:I

    .line 559
    sget v1, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v1, :cond_8

    goto :goto_4

    :cond_8
    const-string v1, "\u06e1\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x51

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x4a2d

    const v20, -0x2512268e

    xor-int v3, v3, v20

    const v20, -0xec05e5d

    goto/16 :goto_7

    :goto_4
    const-string v1, "\u1a79\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x13e9

    const v20, -0x254c3e9

    xor-int v3, v3, v20

    const v20, 0x62aa692d

    goto/16 :goto_7

    :cond_9
    const-string v1, "\u06ec\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x3ea3

    const v20, 0x89c8a9

    xor-int v3, v3, v20

    const v20, -0x3e4b7ba6

    goto/16 :goto_7

    .line 664
    :sswitch_f
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    .line 115
    sget v1, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v1, :cond_a

    goto :goto_6

    :cond_a
    const-string v1, "\u06e7\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x1f

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x37f3

    const v20, -0x4f48e959

    xor-int v3, v3, v20

    const v20, -0x9f9fe79

    goto :goto_7

    :sswitch_10
    sub-float v9, v7, v8

    .line 590
    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v1, :cond_c

    :cond_b
    :goto_5
    const-string v1, "\u0736\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x4b99

    const v20, 0x54bc115e

    xor-int v3, v3, v20

    const v20, 0x374fa786

    goto :goto_7

    :cond_c
    const-string v1, "\u1a74\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x4977

    const v20, -0x21fc05ed

    xor-int v3, v3, v20

    const v20, -0x1e2d04ca

    goto :goto_7

    .line 663
    :sswitch_11
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    iget v8, v0, Ll/ۜۜ᩺;->ܽ:F

    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_e

    :cond_d
    :goto_6
    const-string v1, "\u1a75\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x20eb

    const v20, 0x57e9ea37

    xor-int v3, v3, v20

    const v20, -0x47af24f3

    goto :goto_7

    :cond_e
    const-string v1, "\u06e4\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0xf0b

    const v20, -0x471d3353

    xor-int v3, v3, v20

    const v20, 0x52fd8588

    :goto_7
    xor-int v20, v1, v20

    goto/16 :goto_d

    :sswitch_12
    const/4 v1, 0x3

    move/from16 v3, v21

    if-eq v3, v1, :cond_f

    goto :goto_8

    :cond_f
    move/from16 v20, v5

    goto/16 :goto_9

    :sswitch_13
    move/from16 v3, v21

    .line 662
    iget-boolean v1, v0, Ll/ۜۜ᩺;->۬ۙ:Z

    if-eqz v1, :cond_10

    const-string v1, "\u06e8\u1a73"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x5

    move/from16 v20, v5

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x1213

    const v21, -0x63f12ffe

    xor-int v5, v5, v21

    const v21, 0x8c08e4a

    goto/16 :goto_f

    :cond_10
    :goto_8
    move/from16 v20, v5

    goto/16 :goto_a

    .line 653
    :sswitch_14
    invoke-direct/range {p0 .. p1}, Ll/ۜۜ᩺;->ۙ(Landroid/view/MotionEvent;)V

    .line 654
    iput-boolean v2, v0, Ll/ۜۜ᩺;->ۜۙ:Z

    return v2

    :sswitch_15
    move/from16 v20, v5

    move/from16 v3, v21

    .line 658
    iput-boolean v2, v0, Ll/ۜۜ᩺;->۬ۙ:Z

    goto/16 :goto_a

    :sswitch_16
    move/from16 v20, v5

    move/from16 v3, v21

    const/4 v1, 0x2

    if-eq v3, v1, :cond_11

    const-string v1, "\u06e8\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x1f

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x43fd

    const v21, 0xe8d7fdf

    xor-int v5, v5, v21

    const v21, -0x6e17c04

    goto/16 :goto_f

    :cond_11
    const-string v1, "\u06db\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x5a9b

    const v21, 0x1b611470

    xor-int v5, v5, v21

    const v21, -0x7130a6a0

    goto/16 :goto_f

    :sswitch_17
    move/from16 v20, v5

    move/from16 v3, v21

    .line 682
    iput-boolean v6, v0, Ll/ۜۜ᩺;->۬ۙ:Z

    goto/16 :goto_a

    :sswitch_18
    move/from16 v20, v5

    move/from16 v3, v21

    .line 652
    iget v1, v0, Ll/ۜۜ᩺;->ܽ:F

    iget v5, v0, Ll/ۜۜ᩺;->۫:F

    invoke-virtual {v4, v1, v5}, Ll/᩹ܺ᩺;->ܰ(FF)Z

    move-result v1

    if-eqz v1, :cond_12

    const-string v1, "\u0733\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x5d

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x4c11

    const v21, 0x242a2855

    xor-int v5, v5, v21

    const v21, 0x55fdc0da

    goto/16 :goto_f

    :cond_12
    const-string v1, "\u1a77\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x4f

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x3705

    const v21, -0x59e5607f

    xor-int v5, v5, v21

    const v21, 0x4093b481

    goto/16 :goto_f

    .line 686
    :sswitch_19
    invoke-super/range {p0 .. p1}, Landroid/widget/ListView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    return v1

    :sswitch_1a
    move/from16 v20, v5

    move/from16 v3, v21

    const/4 v6, 0x0

    if-eq v3, v2, :cond_13

    const-string v1, "\u1a7b\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v18

    mul-int/lit8 v5, v5, 0x3f

    const v21, 0x1c33d1ad

    xor-int v5, v5, v21

    const v21, 0x6d7ce03a

    goto/16 :goto_f

    :cond_13
    :goto_9
    const-string v1, "\u06e4\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, -0x442b

    const v21, 0x6468c3e1

    xor-int v5, v5, v21

    const v21, -0x5ed74b42

    goto/16 :goto_f

    :sswitch_1b
    move/from16 v20, v5

    move/from16 v1, v16

    move/from16 v3, v21

    .line 650
    iput v1, v0, Ll/ۜۜ᩺;->۫:F

    .line 651
    iget v5, v0, Ll/ۜۜ᩺;->ܽ:F

    invoke-virtual {v4, v5, v1}, Ll/᩹ܺ᩺;->ۙ(FF)Z

    move-result v5

    if-eqz v5, :cond_14

    const-string v5, "\u1a79\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v18

    move/from16 v16, v1

    xor-int v1, v5, v17

    mul-int/lit16 v1, v1, -0x3bff

    const v21, -0x5ba7a90

    xor-int v1, v1, v21

    const v21, 0x2694bd8b

    xor-int v5, v5, v21

    move/from16 v21, v3

    move/from16 v22, v20

    move/from16 v20, v5

    goto/16 :goto_10

    :cond_14
    move/from16 v16, v1

    :goto_a
    const-string v1, "\u1a74\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x2b

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x55cd

    const v21, 0x10535633

    xor-int v5, v5, v21

    const v21, 0x169b5241

    goto/16 :goto_f

    :sswitch_1c
    move/from16 v20, v5

    move/from16 v3, v21

    .line 650
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v16

    .line 320
    sget v1, Ll/֫;->ܶܺ᩻:I

    if-ltz v1, :cond_15

    :goto_b
    const-string v1, "\u06d9\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x6067

    const v21, 0x641b4cab

    xor-int v5, v5, v21

    const v21, -0x7ba125b

    goto/16 :goto_f

    :cond_15
    const-string v1, "\u06dc\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x19

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x47a5

    const v21, 0x783afdc

    xor-int v5, v5, v21

    const v21, -0x3ce77e3

    goto/16 :goto_f

    :sswitch_1d
    move/from16 v20, v5

    move/from16 v3, v21

    .line 649
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Ll/ۜۜ᩺;->ܽ:F

    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v1, :cond_16

    goto/16 :goto_e

    :cond_16
    const-string v1, "\u06db\u06d8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x5aef

    const v21, 0x9679c55

    xor-int v5, v5, v21

    const v21, -0x9a817fb

    goto/16 :goto_f

    .line 644
    :sswitch_1e
    invoke-super/range {p0 .. p1}, Landroid/widget/ListView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    return v1

    :sswitch_1f
    move/from16 v20, v5

    .line 647
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v21

    iget-object v4, v0, Ll/ۜۜ᩺;->ۙۙ:Ll/᩹ܺ᩺;

    if-eqz v21, :cond_17

    const-string v1, "\u1a74\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x2d

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x11f3

    const v5, -0x194bd0d7

    xor-int/2addr v3, v5

    const v5, -0x71ed3d8b

    goto :goto_c

    :cond_17
    const-string v1, "\u05a8\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x11

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x4e67

    const v5, -0x6ec31fe6

    xor-int/2addr v3, v5

    const v5, -0xf5be0c1

    :goto_c
    xor-int/2addr v1, v5

    move/from16 v5, v20

    move/from16 v20, v1

    :goto_d
    move v1, v3

    goto/16 :goto_0

    :sswitch_20
    return v2

    :sswitch_21
    move/from16 v20, v5

    move/from16 v3, v21

    .line 643
    invoke-direct/range {p0 .. p0}, Ll/ۜۜ᩺;->ۚ()Z

    move-result v1

    if-nez v1, :cond_18

    const-string v1, "\u06e7\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x1d

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x6ee7

    const v21, -0x25aaaa66

    xor-int v5, v5, v21

    const v21, -0x1f94b463

    goto/16 :goto_f

    :cond_18
    const-string v1, "\u06e1\u1a77"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x1e6d

    const v21, 0x506f3f00

    xor-int v5, v5, v21

    const v21, -0x27bdb361

    goto :goto_f

    :sswitch_22
    move/from16 v20, v5

    move/from16 v3, v21

    .line 638
    iget-boolean v1, v0, Ll/ۜۜ᩺;->ᩴۙ:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_19

    const-string v1, "\u06e0\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, -0x74f1

    const v21, 0x4d4700b6

    xor-int v5, v5, v21

    const v21, 0x8a61ec0

    goto :goto_f

    :cond_19
    const-string v1, "\u06d8\u1a78"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x63

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x1a49

    const v21, -0x7c26f204

    xor-int v5, v5, v21

    const v21, -0x1002bac5

    goto :goto_f

    :sswitch_23
    move/from16 v20, v5

    move/from16 v3, v21

    .line 49
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v1

    if-gtz v1, :cond_1a

    :goto_e
    const-string v1, "\u06d6\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x16ad

    const v21, -0x7f4c4594

    xor-int v5, v5, v21

    const v21, 0x433c2632

    goto :goto_f

    :cond_1a
    const-string v1, "\u05a8\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x5b

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x6415

    const v21, 0x2805e0fd

    xor-int v5, v5, v21

    const v21, 0x2b4642f2

    :goto_f
    xor-int v1, v1, v21

    move/from16 v21, v3

    move/from16 v22, v20

    move/from16 v20, v1

    move v1, v5

    :goto_10
    move/from16 v5, v22

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b42d439 -> :sswitch_3
        -0x7a99d081 -> :sswitch_a
        -0x78d724c4 -> :sswitch_a
        -0x783523d6 -> :sswitch_6
        -0x74ed6755 -> :sswitch_15
        -0x73ee0074 -> :sswitch_1b
        -0x73bf9617 -> :sswitch_19
        -0x72611350 -> :sswitch_e
        -0x6f71ebab -> :sswitch_21
        -0x659c131e -> :sswitch_20
        -0x62d2282b -> :sswitch_2
        -0x5df992f9 -> :sswitch_1b
        -0x4a3baea3 -> :sswitch_7
        -0x430b80c0 -> :sswitch_1d
        -0x42bcac82 -> :sswitch_13
        -0x3fa2180b -> :sswitch_12
        -0x3d1ad188 -> :sswitch_13
        -0x3b500aa5 -> :sswitch_f
        -0x39b946b7 -> :sswitch_22
        -0x36493c29 -> :sswitch_1
        -0x2e506464 -> :sswitch_21
        -0x2e14f54b -> :sswitch_16
        -0x2cd6fb7e -> :sswitch_1c
        -0x28d45eb8 -> :sswitch_3
        -0x22c4fea2 -> :sswitch_7
        -0x221b996a -> :sswitch_9
        -0x1d38f864 -> :sswitch_c
        -0x18690a29 -> :sswitch_23
        -0x1834d88a -> :sswitch_c
        -0x15dd0012 -> :sswitch_1f
        -0x15b30535 -> :sswitch_11
        -0x14bd01b6 -> :sswitch_f
        -0x12fd0ed6 -> :sswitch_17
        -0xd2ee077 -> :sswitch_e
        -0x2c36b0d -> :sswitch_1f
        0x3e9b1d3 -> :sswitch_18
        0x13069c9b -> :sswitch_1a
        0x147ffe41 -> :sswitch_22
        0x17b31c16 -> :sswitch_1a
        0x1b93f518 -> :sswitch_18
        0x1ed7c0e8 -> :sswitch_10
        0x20932047 -> :sswitch_10
        0x21554354 -> :sswitch_16
        0x22afa773 -> :sswitch_1c
        0x2550d395 -> :sswitch_0
        0x27c248a4 -> :sswitch_b
        0x2a7af616 -> :sswitch_d
        0x2c1706e2 -> :sswitch_d
        0x2d9ba751 -> :sswitch_1e
        0x2e506d6a -> :sswitch_1
        0x2f9f9370 -> :sswitch_15
        0x352fe66d -> :sswitch_14
        0x3b5c88ad -> :sswitch_12
        0x3bab9554 -> :sswitch_14
        0x3e41434a -> :sswitch_4
        0x40a2800d -> :sswitch_1e
        0x4328aac7 -> :sswitch_8
        0x448c5b73 -> :sswitch_20
        0x47d7657c -> :sswitch_0
        0x4b04aced -> :sswitch_4
        0x4c469521 -> :sswitch_11
        0x52aa7ecc -> :sswitch_23
        0x5c217700 -> :sswitch_b
        0x5d3e62b0 -> :sswitch_19
        0x6642cacc -> :sswitch_5
        0x691e262d -> :sswitch_17
        0x692d2dc7 -> :sswitch_5
        0x6cc960cb -> :sswitch_2
        0x6e2d2738 -> :sswitch_9
        0x72353f93 -> :sswitch_1d
        0x7b65c465 -> :sswitch_6
        0x7dd77568 -> :sswitch_8
    .end sparse-switch
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    const v0, -0x324d1c5b    # -3.7515792E8f

    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    sget v2, Ll/֫᩺;->᩺۟ۘ:I

    const-string v3, "\u06dc\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1d45

    const v5, -0x34d4cf30    # -1.1219152E7f

    xor-int/2addr v4, v5

    const v5, 0xa13254f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x5b49

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 40
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v3

    if-gez v3, :cond_a

    goto/16 :goto_5

    .line 27
    :sswitch_1
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v3, "\u06dc\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6379

    const v5, 0x731f9b8a

    xor-int/2addr v4, v5

    const v5, 0x282d9f79

    goto :goto_0

    .line 168
    :sswitch_2
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-lez v3, :cond_c

    goto/16 :goto_2

    .line 139
    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    return-void

    :sswitch_5
    const/4 v3, 0x1

    .line 254
    iput v3, p0, Ll/ۜۜ᩺;->ܶۙ:I

    goto :goto_1

    :sswitch_6
    return-void

    .line 252
    :sswitch_7
    invoke-super/range {p0 .. p5}, Landroid/widget/ListView;->onLayout(ZIIII)V

    if-eqz p1, :cond_1

    const-string v3, "\u1a7a\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2aa1

    const v5, 0x73c22cb6

    xor-int/2addr v4, v5

    const v5, 0x26be8679

    goto :goto_0

    :cond_1
    :goto_1
    const-string v3, "\u06d8\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3adb

    const v5, 0x4e30d88f    # 7.417456E8f

    xor-int/2addr v4, v5

    const v5, -0x749c938c

    goto :goto_0

    :sswitch_8
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a78\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3297

    const v5, 0x565bb9fd

    xor-int/2addr v4, v5

    const v5, 0x27ec6494

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e4\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3ccd

    const v5, -0x48e18d5b

    xor-int/2addr v4, v5

    const v5, -0x6adf3b80

    goto/16 :goto_0

    .line 21
    :sswitch_9
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06da\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x66c7

    const v5, 0x1f7e9a48

    xor-int/2addr v4, v5

    const v5, 0x396e7841

    goto/16 :goto_0

    .line 211
    :sswitch_a
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06d7\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2af7

    const v5, -0x6f5e6a47

    xor-int/2addr v4, v5

    const v5, 0x3cd81bea

    goto/16 :goto_0

    .line 130
    :sswitch_b
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v3

    if-eqz v3, :cond_6

    :goto_2
    const-string v3, "\u1a7a\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2e0d

    const v5, 0x490c8186    # 575512.4f

    xor-int/2addr v4, v5

    const v5, 0x2f221d4

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e8\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x195

    const v5, 0x68f4ae28

    xor-int/2addr v4, v5

    const v5, 0x7e11128

    goto/16 :goto_0

    .line 88
    :sswitch_c
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v3, "\u06d9\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3c6d

    const v5, -0x37b3a9ce

    xor-int/2addr v4, v5

    const v5, -0x19d9cfe5    # -1.9620006E23f

    goto/16 :goto_0

    .line 192
    :sswitch_d
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_8

    :goto_3
    const-string v3, "\u06e8\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2361

    const v5, 0x7a19ce3c

    xor-int/2addr v4, v5

    const v5, 0x5c7ebaef

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a79\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7f05

    const v5, 0x298f8ab1

    xor-int/2addr v4, v5

    const v5, -0x2a4a8218

    goto/16 :goto_0

    .line 186
    :sswitch_e
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u073d\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6c01

    const v5, -0x1dcd9b96

    xor-int/2addr v4, v5

    const v5, 0xae12140

    goto/16 :goto_0

    :sswitch_f
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u1a76\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1bab

    const v5, 0x1ce1300a

    xor-int/2addr v4, v5

    const v5, 0x8c62c5b

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06d9\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7bc1

    const v5, 0x308fc32

    xor-int/2addr v4, v5

    const v5, 0x12b0fa7

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_d

    :cond_c
    :goto_5
    const-string v3, "\u06da\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1e59

    const v5, 0x7028dbd6

    xor-int/2addr v4, v5

    const v5, -0x7d83a8a1

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e1\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4069

    const v5, -0x5ed6e122

    xor-int/2addr v4, v5

    const v5, 0x68c5132c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77a8e46e -> :sswitch_8
        -0x77a59e0a -> :sswitch_d
        -0x723b798a -> :sswitch_c
        -0x6b1ef519 -> :sswitch_6
        -0x5dd23f9f -> :sswitch_c
        -0x5d6f78df -> :sswitch_d
        -0x5a826838 -> :sswitch_3
        -0x52396c30 -> :sswitch_1
        -0x41a2f8ed -> :sswitch_f
        -0x3f6752d1 -> :sswitch_a
        -0x3b6c5c34 -> :sswitch_8
        -0x32f84398 -> :sswitch_f
        -0x2edf0a48 -> :sswitch_10
        -0x2b1e14a3 -> :sswitch_4
        -0x278f08dc -> :sswitch_9
        -0x2059db86 -> :sswitch_b
        -0xa18f533 -> :sswitch_3
        -0x8906a1f -> :sswitch_1
        -0x4ae17ae -> :sswitch_b
        -0x429522c -> :sswitch_6
        0x54a1946 -> :sswitch_0
        0x1c5cd744 -> :sswitch_e
        0x1f5bada6 -> :sswitch_7
        0x1f86194a -> :sswitch_4
        0x21e34cf8 -> :sswitch_5
        0x2368de29 -> :sswitch_0
        0x32992f9e -> :sswitch_e
        0x3bcabeb8 -> :sswitch_5
        0x5074d9ec -> :sswitch_7
        0x599d0f7c -> :sswitch_2
        0x695faf73 -> :sswitch_9
        0x707a4bdb -> :sswitch_a
        0x79ff23a3 -> :sswitch_2
        0x7d887908 -> :sswitch_10
    .end sparse-switch
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 34

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const v28, 0x29cab6a5

    sget v29, Ll/ۖۗ;->᩶۫ۗ:I

    sget v30, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v31, "\u06eb\u06eb"

    invoke-static/range {v31 .. v31}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v31

    xor-int v31, v31, v29

    xor-int v1, v31, v30

    mul-int/lit16 v1, v1, 0x199d

    const v33, -0x1f5364b8

    xor-int v1, v1, v33

    const v33, 0x7bbf4e8c

    xor-int v31, v31, v33

    move-object/from16 v27, v4

    move-object v7, v6

    move-object v12, v11

    move-object/from16 v2, v24

    move/from16 v32, v31

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const v31, 0x29cab6a5

    const/16 v33, 0x0

    move-object v11, v10

    move-object v10, v9

    const/4 v9, 0x0

    :goto_0
    xor-int v4, v31, v30

    mul-int/lit16 v4, v4, 0x4bf

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v31, v32, v1

    sparse-switch v31, :sswitch_data_0

    move-object v4, v2

    move/from16 v32, v33

    .line 494
    invoke-direct/range {p0 .. p1}, Ll/ۜۜ᩺;->ۖ(Landroid/view/MotionEvent;)V

    .line 495
    iput-boolean v3, v0, Ll/ۜۜ᩺;->ۢ:Z

    .line 496
    iput-boolean v3, v0, Ll/ۜۜ᩺;->۬ۙ:Z

    .line 498
    iget-boolean v1, v0, Ll/ۜۜ᩺;->ᩴۙ:Z

    if-eqz v1, :cond_22

    const-string v1, "\u1a76\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x7b8f

    const v33, -0x34ad9b6f    # -1.3788305E7f

    xor-int v2, v2, v33

    const v33, -0x2769a7dd

    goto/16 :goto_16

    .line 316
    :sswitch_0
    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    if-lez v1, :cond_0

    goto/16 :goto_7

    :cond_0
    const-string v1, "\u05ab\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0xa11

    const v32, -0x64d695b3    # -1.40137E-22f

    xor-int v4, v4, v32

    const v32, 0x6de29f94

    goto/16 :goto_b

    .line 543
    :sswitch_1
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v1

    if-gtz v1, :cond_b

    goto/16 :goto_2

    .line 469
    :sswitch_2
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    sget v1, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v1, :cond_12

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget-boolean v1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-nez v1, :cond_2

    :cond_1
    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_1a

    :cond_2
    :goto_1
    move-object v4, v2

    goto/16 :goto_d

    .line 471
    :sswitch_4
    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-lez v1, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "\u06d6\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x75ab

    const v32, 0x73561452

    xor-int v4, v4, v32

    const v32, 0x7ffc87ac

    goto/16 :goto_b

    .line 270
    :sswitch_5
    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v1, :cond_4

    goto :goto_2

    :cond_4
    const-string v1, "\u1a75\u06e0"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, -0x5f

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x2355

    const v32, -0x132fff6f

    xor-int v4, v4, v32

    const v32, 0x19265e21

    goto/16 :goto_b

    .line 477
    :sswitch_6
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget v1, Ll/ۗᩳ;->ۚۤ֡:I

    if-gez v1, :cond_1

    goto :goto_2

    .line 317
    :sswitch_7
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_10

    goto :goto_2

    :sswitch_8
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    :goto_2
    const-string v1, "\u1a76\u06d8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x2073

    const v32, -0x1b9e28ad

    xor-int v4, v4, v32

    const v32, -0x64306ea4

    goto/16 :goto_b

    .line 438
    :sswitch_9
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    const/4 v1, 0x0

    return v1

    .line 551
    :sswitch_a
    invoke-virtual {v0, v9}, Ll/ۜۜ᩺;->setSelection(I)V

    goto :goto_3

    :sswitch_b
    return v8

    .line 550
    :sswitch_c
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v1

    if-eq v9, v1, :cond_5

    const-string v1, "\u06d7\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x47fd

    const v32, 0x5e48aff

    xor-int v4, v4, v32

    const v32, 0x44806256

    goto/16 :goto_b

    :cond_5
    :goto_3
    const-string v1, "\u06eb\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x5bcd

    const v32, 0x20788906

    xor-int v4, v4, v32

    const v32, -0x74486506

    goto/16 :goto_b

    .line 547
    :sswitch_d
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getCount()I

    move-result v1

    sub-int/2addr v1, v8

    goto :goto_4

    :sswitch_e
    int-to-float v1, v5

    mul-float v1, v1, v26

    float-to-int v1, v1

    :goto_4
    move v9, v1

    const-string v1, "\u06db\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, 0x75

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x3459

    const v32, 0x6ec6898d

    xor-int v4, v4, v32

    const v32, 0x2347b2b

    goto/16 :goto_b

    .line 549
    :sswitch_f
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getCount()I

    move-result v1

    invoke-static/range {p0 .. p0}, Ll/֫ܶ;->ᩴ۬֫(Ljava/lang/Object;)I

    move-result v4

    sub-int v5, v1, v4

    .line 358
    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v1, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v1, "\u0736\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x2479

    const v32, 0x6f148720

    xor-int v4, v4, v32

    const v32, -0x440de737

    goto/16 :goto_b

    .line 532
    :sswitch_10
    iget v1, v0, Ll/ۜۜ᩺;->ۛ:I

    invoke-virtual {v2, v8, v1}, Ll/ܿܰۙ;->ۙ(II)V

    goto/16 :goto_5

    .line 535
    :sswitch_11
    invoke-static/range {p0 .. p0}, Ll/ۘۧ;->ᩳᩳܺ(Ljava/lang/Object;)V

    .line 536
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v8}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto/16 :goto_a

    .line 534
    :sswitch_12
    iget v1, v7, Ll/᩹ܺ᩺;->ۚ:F

    iget v4, v0, Ll/ۜۜ᩺;->۫:F

    sub-float/2addr v1, v4

    iput v1, v0, Ll/ۜۜ᩺;->᩸ۙ:F

    .line 564
    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v1, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u06d9\u06eb"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x64d7

    const v32, 0x6fec7dca

    xor-int v4, v4, v32

    const v32, 0x186938b2

    goto/16 :goto_b

    :sswitch_13
    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v26, 0x3f800000    # 1.0f

    goto/16 :goto_6

    :sswitch_14
    cmpl-float v1, v26, v18

    if-nez v1, :cond_8

    const-string v1, "\u06dc\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x47

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x4d7f

    const v32, 0x44609a8a

    xor-int v4, v4, v32

    const v32, 0x1f5418e3

    goto/16 :goto_b

    :cond_8
    const-string v1, "\u06e2\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    mul-int/lit8 v1, v1, -0xf

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x5191

    const v32, 0x10a6ac8c

    xor-int v4, v4, v32

    const v32, -0x785e9ca8

    goto/16 :goto_b

    .line 528
    :sswitch_15
    iput-boolean v3, v0, Ll/ۜۜ᩺;->۬ۙ:Z

    .line 529
    iput-boolean v8, v0, Ll/ۜۜ᩺;->ᩴۙ:Z

    .line 530
    invoke-direct/range {p0 .. p1}, Ll/ۜۜ᩺;->ܰ(Landroid/view/MotionEvent;)V

    .line 531
    iget-object v2, v0, Ll/ۜۜ᩺;->ܿ:Ll/ܿܰۙ;

    if-eqz v2, :cond_9

    const-string v1, "\u0736\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v29

    mul-int/lit8 v1, v1, -0x3b

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x131f

    const v32, 0x6460ad9e

    xor-int v4, v4, v32

    const v32, 0x10c3f4d5

    goto/16 :goto_b

    :cond_9
    :goto_5
    const-string v1, "\u06d8\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x7bd3

    const v32, 0x761e34c5

    xor-int v4, v4, v32

    const v32, 0x5b97379a

    goto/16 :goto_b

    :sswitch_16
    const/4 v1, 0x0

    const/16 v26, 0x0

    goto :goto_6

    :sswitch_17
    cmpl-float v1, v17, v18

    if-lez v1, :cond_a

    const-string v1, "\u06d9\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, -0x47

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x6af3

    const v32, -0x56d2a2f1

    xor-int v4, v4, v32

    const v32, 0x3c344040

    goto/16 :goto_b

    :cond_a
    move/from16 v26, v17

    :goto_6
    const-string v1, "\u06df\u1a78"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x57db

    const v32, -0x205c8b69

    xor-int v4, v4, v32

    const v32, 0x1a1d0aa9

    goto/16 :goto_b

    :sswitch_18
    mul-int v1, v24, v24

    int-to-float v1, v1

    cmpl-float v1, v23, v1

    if-lez v1, :cond_14

    const-string v1, "\u06e2\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x32cd

    const v32, -0x6672281f

    xor-int v4, v4, v32

    const v32, -0x3050bf51

    goto/16 :goto_b

    :sswitch_19
    mul-float v1, v21, v21

    add-float v23, v1, v22

    .line 527
    iget v1, v0, Ll/ۜۜ᩺;->᩺ۙ:I

    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_c

    move/from16 v24, v1

    :cond_b
    :goto_7
    const-string v1, "\u073a\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v29

    mul-int/lit8 v1, v1, 0x7

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x4723

    const v32, 0x3c75ba89

    xor-int v4, v4, v32

    const v32, -0x667b439d

    goto/16 :goto_b

    :cond_c
    const-string v4, "\u06da\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v29, v4

    mul-int/lit8 v4, v4, 0x2d

    move/from16 v24, v1

    xor-int v1, v4, v30

    mul-int/lit16 v1, v1, 0x605f

    const v32, -0x46a35b39

    xor-int v1, v1, v32

    const v32, -0x5625e2da

    goto/16 :goto_9

    .line 526
    :sswitch_1a
    iget v1, v0, Ll/ۜۜ᩺;->۫:F

    sub-float v21, v20, v1

    mul-float v22, v19, v19

    .line 20
    sget-boolean v1, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v1, :cond_d

    const-string v1, "\u06e4\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x5fa9

    const v32, -0x4526671a

    xor-int v4, v4, v32

    const v32, -0xce65ec9

    goto/16 :goto_b

    :cond_d
    const-string v1, "\u05ab\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, -0x47

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x57c3

    const v32, -0x345cf9ab    # -2.1367978E7f

    xor-int v4, v4, v32

    const v32, -0x3e326b38

    goto/16 :goto_b

    .line 525
    :sswitch_1b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget v4, v0, Ll/ۜۜ᩺;->ܽ:F

    sub-float v19, v1, v4

    .line 526
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v20

    .line 280
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v1

    if-nez v1, :cond_e

    goto/16 :goto_1

    :cond_e
    const-string v1, "\u1a78\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, -0x55

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x58b5

    const v32, -0x33c56f7a    # -4.8906776E7f

    xor-int v4, v4, v32

    const v32, 0x72afc88e

    goto/16 :goto_b

    :sswitch_1c
    sub-float v1, v15, v16

    div-float v17, v13, v1

    const/4 v1, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    cmpg-float v1, v17, v1

    if-gez v1, :cond_f

    const-string v1, "\u06da\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, -0x31

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x75f3

    const v32, 0x31fb1d8d

    xor-int v4, v4, v32

    const v32, 0x296a679

    goto/16 :goto_b

    :cond_f
    const-string v1, "\u073d\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x3b

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x463

    const v32, 0x91ed2ce

    xor-int v4, v4, v32

    const v32, 0x7688e3da

    goto/16 :goto_b

    :sswitch_1d
    int-to-float v15, v14

    .line 540
    iget v1, v0, Ll/ۜۜ᩺;->᩻:F

    .line 308
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_11

    move/from16 v16, v1

    :cond_10
    :goto_8
    const-string v1, "\u06d9\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x3f1f

    const v32, 0x4341ab0f

    xor-int v4, v4, v32

    const v32, 0x53a8fc61

    goto/16 :goto_b

    :cond_11
    const-string v4, "\u06dc\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v30

    mul-int/lit8 v4, v4, 0x17

    move/from16 v16, v1

    xor-int v1, v4, v29

    mul-int/lit16 v1, v1, -0x60f7

    const v32, -0x3155a413

    xor-int v1, v1, v32

    const v32, -0x19ace75a

    :goto_9
    xor-int v32, v4, v32

    goto/16 :goto_0

    .line 540
    :sswitch_1e
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v4, v0, Ll/ۜۜ᩺;->᩸ۙ:F

    add-float v13, v1, v4

    invoke-static/range {p0 .. p0}, Ll/ۖܽ;->۫᩺۠(Ljava/lang/Object;)I

    move-result v14

    .line 526
    sget-boolean v1, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v1, :cond_13

    :cond_12
    const-string v1, "\u06e1\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x5fcf

    const v32, -0x6b593af9

    xor-int v4, v4, v32

    const v32, 0x6d3e6a60

    goto :goto_b

    :cond_13
    const-string v1, "\u06d7\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, -0xb

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x5f8b

    const v32, -0x52ff59c6

    xor-int v4, v4, v32

    const v32, -0x5b87931b

    goto :goto_b

    .line 568
    :sswitch_1f
    invoke-interface {v12, v0, v3}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    move-object v4, v2

    goto/16 :goto_c

    .line 569
    :sswitch_20
    invoke-static/range {p0 .. p0}, Ll/ۘۧ;->ᩳᩳܺ(Ljava/lang/Object;)V

    return v8

    .line 524
    :sswitch_21
    iget-boolean v1, v0, Ll/ۜۜ᩺;->ᩴۙ:Z

    if-nez v1, :cond_14

    const-string v1, "\u06e7\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x2563

    const v32, -0x5ba6642d

    xor-int v4, v4, v32

    const v32, 0x54252205

    goto :goto_b

    :cond_14
    :goto_a
    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_f

    .line 539
    :sswitch_22
    iget-boolean v1, v0, Ll/ۜۜ᩺;->ᩴۙ:Z

    if-eqz v1, :cond_15

    const-string v1, "\u06df\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, 0x49

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x901

    const v32, -0x7c12ab9a

    xor-int v4, v4, v32

    const v32, 0x694a4a08

    :goto_b
    xor-int v32, v1, v32

    move v1, v4

    goto/16 :goto_0

    :cond_15
    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_13

    .line 562
    :sswitch_23
    iget v1, v0, Ll/ۜۜ᩺;->ۛ:I

    invoke-virtual {v10, v3, v1}, Ll/ܿܰۙ;->ۙ(II)V

    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_10

    :sswitch_24
    move-object v4, v2

    const-wide/16 v1, 0x5dc

    .line 566
    invoke-virtual {v11, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 567
    iget-object v12, v0, Ll/ۜۜ᩺;->֨ۙ:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz v12, :cond_16

    const-string v1, "\u073f\u1a73"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x61

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x7df9

    const v32, -0x3d1e64e9

    xor-int v2, v2, v32

    const v32, 0x7cf2bd1a

    goto :goto_e

    :cond_16
    :goto_c
    const-string v1, "\u06e8\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x721d

    const v32, 0x3671002c

    xor-int v2, v2, v32

    const v32, -0x766dd4bb

    goto :goto_e

    :sswitch_25
    move-object v4, v2

    .line 564
    invoke-static {}, Ll/ۗܳ;->ۤܽۤ()J

    move-result-wide v1

    iput-wide v1, v0, Ll/ۜۜ᩺;->ۘۙ:J

    .line 565
    iget-object v11, v0, Ll/ۜۜ᩺;->ۨۙ:Ll/۬ۜ᩺;

    invoke-static {v11, v3}, Ll/ۗ᩺;->᩸᩵֨(Ljava/lang/Object;I)V

    .line 255
    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v1, :cond_17

    :goto_d
    const-string v1, "\u073f\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v29

    mul-int/lit8 v1, v1, 0x1f

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, -0x6999

    const v32, 0x74ed88c6

    xor-int v2, v2, v32

    const v32, -0x460cbbd8

    goto :goto_e

    :cond_17
    const-string v1, "\u1a74\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x437f

    const v32, 0x2b70a006

    xor-int v2, v2, v32

    const v32, -0x290d2be5    # -1.334964E14f

    :goto_e
    xor-int v32, v1, v32

    goto/16 :goto_17

    :sswitch_26
    move-object v4, v2

    move/from16 v1, v33

    move/from16 v32, v1

    if-eq v6, v1, :cond_1c

    goto/16 :goto_13

    :sswitch_27
    move-object v4, v2

    move/from16 v1, v33

    .line 524
    iget-boolean v2, v0, Ll/ۜۜ᩺;->۬ۙ:Z

    if-eqz v2, :cond_18

    const-string v2, "\u1a7b\u06ec"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v30

    move/from16 v32, v1

    xor-int v1, v2, v29

    mul-int/lit16 v1, v1, -0x4da5

    const v33, -0x62605c7c

    xor-int v1, v1, v33

    const v33, 0x1b1b8a65

    goto/16 :goto_12

    :cond_18
    move/from16 v32, v1

    :goto_f
    const-string v1, "\u06df\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v29

    mul-int/lit8 v1, v1, -0x2f

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x333b

    const v33, 0x6591901a

    xor-int v2, v2, v33

    const v33, 0x3168e5ed

    goto/16 :goto_16

    :sswitch_28
    move-object v4, v2

    move/from16 v32, v33

    .line 560
    iput-boolean v3, v0, Ll/ۜۜ᩺;->ᩴۙ:Z

    .line 561
    iget-object v10, v0, Ll/ۜۜ᩺;->ܿ:Ll/ܿܰۙ;

    if-eqz v10, :cond_19

    const-string v1, "\u06dc\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x2df1

    const v33, -0x18bfa54

    xor-int v2, v2, v33

    const v33, -0x67b37d02

    goto/16 :goto_16

    :cond_19
    :goto_10
    const-string v1, "\u073a\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x346b

    const v33, -0xcbbebbd

    xor-int v2, v2, v33

    const v33, -0x3268b1ac

    goto/16 :goto_16

    .line 516
    :sswitch_29
    invoke-direct/range {p0 .. p1}, Ll/ۜۜ᩺;->ۙ(Landroid/view/MotionEvent;)V

    return v8

    :sswitch_2a
    move-object v4, v2

    move/from16 v32, v33

    .line 520
    iput-boolean v8, v0, Ll/ۜۜ᩺;->۬ۙ:Z

    goto/16 :goto_13

    :sswitch_2b
    move-object v4, v2

    move/from16 v32, v33

    const/4 v1, 0x2

    if-eq v6, v1, :cond_1a

    const-string v1, "\u06e0\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, 0x2f

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x15b1

    const v33, 0x77b7fc53

    xor-int v2, v2, v33

    const v33, 0x24a55e46

    goto/16 :goto_16

    :cond_1a
    const-string v1, "\u06e0\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v29

    mul-int/lit8 v1, v1, -0x6d

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, -0x5543

    const v33, 0x77897401

    xor-int v2, v2, v33

    const v33, 0x2c976f5

    goto/16 :goto_16

    :sswitch_2c
    move-object v4, v2

    move/from16 v32, v33

    .line 557
    invoke-direct/range {p0 .. p1}, Ll/ۜۜ᩺;->ۖ(Landroid/view/MotionEvent;)V

    .line 558
    iput-boolean v3, v0, Ll/ۜۜ᩺;->۬ۙ:Z

    .line 559
    iget-boolean v1, v0, Ll/ۜۜ᩺;->ᩴۙ:Z

    if-eqz v1, :cond_21

    const-string v1, "\u06eb\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x6529

    const v33, -0x61dbc2fe

    xor-int v2, v2, v33

    const v33, -0x124753fd

    goto/16 :goto_16

    :sswitch_2d
    move-object v4, v2

    move/from16 v32, v33

    .line 515
    iget v1, v0, Ll/ۜۜ᩺;->ܽ:F

    iget v2, v0, Ll/ۜۜ᩺;->۫:F

    invoke-virtual {v7, v1, v2}, Ll/᩹ܺ᩺;->ܰ(FF)Z

    move-result v1

    if-eqz v1, :cond_1b

    const-string v1, "\u06e1\u06d8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, -0x4847

    const v33, -0x63400cc4

    xor-int v2, v2, v33

    const v33, 0x3daf7d09

    goto/16 :goto_16

    :cond_1b
    const-string v1, "\u073a\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x7ce1

    const v33, 0x17ee2d1

    xor-int v2, v2, v33

    const v33, 0x1b5eb384

    goto/16 :goto_16

    :sswitch_2e
    move-object v4, v2

    move/from16 v32, v33

    if-eq v6, v8, :cond_1c

    const-string v1, "\u06e1\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, -0x5b

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, -0x7cad

    const v33, 0x25cbdedb

    xor-int v2, v2, v33

    const v33, -0x3dce76e3

    goto/16 :goto_16

    :cond_1c
    const-string v1, "\u073a\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, 0x7b

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x4989

    const v33, -0x50baee9e

    xor-int v2, v2, v33

    const v33, -0x212b2c8b

    goto/16 :goto_16

    :sswitch_2f
    move-object v4, v2

    move/from16 v1, v28

    move/from16 v32, v33

    .line 513
    iput v1, v0, Ll/ۜۜ᩺;->۫:F

    .line 514
    iget v2, v0, Ll/ۜۜ᩺;->ܽ:F

    invoke-virtual {v7, v2, v1}, Ll/᩹ܺ᩺;->ۙ(FF)Z

    move-result v2

    if-eqz v2, :cond_1d

    const-string v2, "\u1a7a\u06e1"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v30

    move/from16 v28, v1

    xor-int v1, v2, v29

    mul-int/lit16 v1, v1, -0x61d7

    const v33, -0x228dc5f0

    xor-int v1, v1, v33

    const v33, -0x244bb615

    goto/16 :goto_12

    :cond_1d
    move/from16 v28, v1

    goto/16 :goto_13

    :sswitch_30
    move-object v4, v2

    move/from16 v32, v33

    .line 512
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Ll/ۜۜ᩺;->ܽ:F

    .line 513
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v28

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v1, :cond_1e

    goto/16 :goto_1a

    :cond_1e
    const-string v1, "\u073a\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x6f

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x5fe9

    const v33, 0x41dcbdbe

    xor-int v2, v2, v33

    const v33, -0x2f616f73

    goto/16 :goto_16

    :sswitch_31
    move-object v4, v2

    move/from16 v32, v33

    .line 501
    iget v1, v0, Ll/ۜۜ᩺;->ۛ:I

    move-object/from16 v2, v27

    invoke-virtual {v2, v3, v1}, Ll/ܿܰۙ;->ۙ(II)V

    move/from16 v2, v25

    goto/16 :goto_19

    :sswitch_32
    move-object v4, v2

    move-object/from16 v2, v27

    move/from16 v32, v33

    .line 510
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v6

    iget-object v7, v0, Ll/ۜۜ᩺;->ۙۙ:Ll/᩹ܺ᩺;

    if-eqz v6, :cond_1f

    const-string v1, "\u06d9\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v8, v1, v30

    mul-int/lit16 v8, v8, 0x7a83

    const v33, 0x5248d007

    xor-int v8, v8, v33

    const v33, 0x7c5ced6

    goto :goto_11

    :cond_1f
    const-string v1, "\u06e2\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, 0x77

    xor-int v8, v1, v29

    mul-int/lit16 v8, v8, 0xabf

    const v33, -0x6add1545

    xor-int v8, v8, v33

    const v33, -0x7ef3145

    :goto_11
    xor-int v1, v1, v33

    move-object/from16 v27, v2

    move-object v2, v4

    move/from16 v33, v32

    move/from16 v32, v1

    move v1, v8

    const/4 v8, 0x1

    goto/16 :goto_0

    .line 575
    :sswitch_33
    invoke-super/range {p0 .. p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    return v1

    :sswitch_34
    move-object v4, v2

    move/from16 v32, v33

    .line 499
    iput-boolean v3, v0, Ll/ۜۜ᩺;->ᩴۙ:Z

    .line 500
    iget-object v1, v0, Ll/ۜۜ᩺;->ܿ:Ll/ܿܰۙ;

    if-eqz v1, :cond_20

    const-string v2, "\u073a\u06d9"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v29, v2

    mul-int/lit8 v2, v2, 0x5

    move-object/from16 v27, v1

    xor-int v1, v2, v30

    mul-int/lit16 v1, v1, 0x45fb

    const v33, -0x340c6736    # -3.1928724E7f

    xor-int v1, v1, v33

    const v33, 0x1ac7f84c

    :goto_12
    xor-int v2, v2, v33

    move/from16 v33, v32

    move/from16 v32, v2

    goto/16 :goto_18

    :cond_20
    move-object/from16 v27, v1

    goto :goto_14

    :sswitch_35
    move-object v4, v2

    move-object/from16 v2, v27

    move/from16 v32, v33

    .line 506
    invoke-direct/range {p0 .. p1}, Ll/ۜۜ᩺;->ۖ(Landroid/view/MotionEvent;)V

    const-wide/16 v1, 0x0

    .line 507
    iput-wide v1, v0, Ll/ۜۜ᩺;->֡:J

    goto :goto_15

    :sswitch_36
    move-object v4, v2

    move/from16 v32, v33

    .line 509
    invoke-direct/range {p0 .. p0}, Ll/ۜۜ᩺;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_21

    const-string v1, "\u1a75\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x59

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x1b41

    const v33, 0x31517ad4

    xor-int v2, v2, v33

    const v33, 0x28e6a913

    goto :goto_16

    :cond_21
    :goto_13
    const-string v1, "\u06e7\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0xba7

    const v33, -0x4f7ea3be

    xor-int v2, v2, v33

    const v33, -0x3899f7c0    # -58888.25f

    goto :goto_16

    :cond_22
    :goto_14
    move/from16 v2, v25

    move/from16 v33, v32

    goto :goto_19

    :sswitch_37
    move-object v4, v2

    move/from16 v32, v33

    .line 505
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    if-nez v1, :cond_23

    const-string v1, "\u06da\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, -0x45

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0xdef

    const v33, 0x2b429317

    xor-int v2, v2, v33

    const v33, -0x2072d6c5

    goto :goto_16

    :cond_23
    :goto_15
    const-string v1, "\u1a78\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x4f83

    const v33, -0x77ecbedb

    xor-int v2, v2, v33

    const v33, -0x1e8fbda2    # -2.7700005E20f

    :goto_16
    xor-int v1, v1, v33

    move/from16 v33, v32

    move/from16 v32, v1

    :goto_17
    move v1, v2

    goto :goto_18

    :sswitch_38
    move-object v4, v2

    const/4 v3, 0x0

    const/4 v1, 0x3

    move/from16 v2, v25

    if-ne v2, v1, :cond_24

    const-string v25, "\u06d7\u0736"

    invoke-static/range {v25 .. v25}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v25

    xor-int v25, v25, v29

    xor-int v1, v25, v30

    mul-int/lit16 v1, v1, 0x584d

    const v33, 0x6a68edab

    xor-int v1, v1, v33

    const v33, -0x1fb00944

    xor-int v25, v25, v33

    move/from16 v32, v25

    const/16 v33, 0x3

    move/from16 v25, v2

    :goto_18
    move-object v2, v4

    goto/16 :goto_0

    :cond_24
    const/16 v33, 0x3

    :goto_19
    const-string v1, "\u06e7\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x29

    xor-int v0, v1, v29

    mul-int/lit16 v0, v0, 0x183b

    const v25, 0x584dc877

    xor-int v0, v0, v25

    const v25, 0x1aaea49b

    xor-int v32, v1, v25

    move v1, v0

    move/from16 v25, v2

    move-object v2, v4

    goto :goto_1c

    :sswitch_39
    move-object v4, v2

    move/from16 v32, v33

    .line 493
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v25

    .line 226
    sget v0, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v0, :cond_25

    :goto_1a
    const-string v0, "\u1a74\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v30

    mul-int/lit8 v0, v0, -0x3b

    xor-int v1, v0, v29

    mul-int/lit16 v1, v1, -0x2af

    const v2, -0x7ad53054

    xor-int/2addr v1, v2

    const v2, 0x882dd8

    goto :goto_1b

    :cond_25
    const-string v0, "\u073f\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v29

    mul-int/lit8 v0, v0, -0x59

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, -0x7121

    const v2, -0x59ebea9f

    xor-int/2addr v1, v2

    const v2, -0x36106181

    :goto_1b
    xor-int/2addr v0, v2

    move-object v2, v4

    move/from16 v33, v32

    move/from16 v32, v0

    :goto_1c
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fbe81f0 -> :sswitch_2c
        -0x7f47a15a -> :sswitch_3
        -0x7cb1bb78 -> :sswitch_e
        -0x7b9eb609 -> :sswitch_1e
        -0x7ac49179 -> :sswitch_23
        -0x7a8e113b -> :sswitch_6
        -0x79df21d6 -> :sswitch_29
        -0x794456e7 -> :sswitch_9
        -0x70a750ed -> :sswitch_30
        -0x707fd8d9 -> :sswitch_f
        -0x6c3489d1 -> :sswitch_8
        -0x6b13403a -> :sswitch_1
        -0x6792a367 -> :sswitch_37
        -0x655786a5 -> :sswitch_1b
        -0x640b43f6 -> :sswitch_12
        -0x630c87d9 -> :sswitch_22
        -0x5f34b2d9 -> :sswitch_38
        -0x52eb28cd -> :sswitch_33
        -0x51aae67a -> :sswitch_2a
        -0x4ed4930d -> :sswitch_34
        -0x4eccf432 -> :sswitch_2c
        -0x4d4d24e8 -> :sswitch_18
        -0x4aa66b82 -> :sswitch_1e
        -0x47de9642 -> :sswitch_10
        -0x44233d7d -> :sswitch_39
        -0x43d4094d -> :sswitch_17
        -0x41724b63 -> :sswitch_23
        -0x3f9b8255 -> :sswitch_35
        -0x3da770fb -> :sswitch_f
        -0x3a1d9f99 -> :sswitch_34
        -0x393f8ed5 -> :sswitch_2d
        -0x3859bb67 -> :sswitch_2e
        -0x34791265 -> :sswitch_24
        -0x34673cac -> :sswitch_10
        -0x336acaf4 -> :sswitch_d
        -0x3312bcfd -> :sswitch_39
        -0x2fe5d60e -> :sswitch_24
        -0x2b31079d -> :sswitch_38
        -0x24d48565 -> :sswitch_11
        -0x24d41364 -> :sswitch_31
        -0x24c6c9ac -> :sswitch_2
        -0x17f1c279 -> :sswitch_13
        -0x17ae3a45 -> :sswitch_7
        -0x111d6c8c -> :sswitch_21
        -0x10b5ad9c -> :sswitch_c
        -0xf308d3f -> :sswitch_28
        -0xa29ff41 -> :sswitch_4
        -0xa291b75 -> :sswitch_14
        -0x7aee7a6 -> :sswitch_12
        -0x57e7090 -> :sswitch_1d
        -0x56f82f4 -> :sswitch_35
        -0x40e9166 -> :sswitch_2f
        -0x3fb85aa -> :sswitch_36
        -0x2330f8f -> :sswitch_29
        0x3b76fd7 -> :sswitch_8
        0x51ee0e7 -> :sswitch_11
        0x62957d5 -> :sswitch_2a
        0x66fb2d3 -> :sswitch_21
        0x7058400 -> :sswitch_33
        0x76ae6b7 -> :sswitch_14
        0x8a95797 -> :sswitch_16
        0x9ace73b -> :sswitch_31
        0xdf4f9da -> :sswitch_25
        0x11654f96 -> :sswitch_32
        0x1347e0e2 -> :sswitch_22
        0x15eef388 -> :sswitch_28
        0x15fbec06 -> :sswitch_d
        0x15fd58d3 -> :sswitch_19
        0x16620b2b -> :sswitch_2f
        0x1791d0fc -> :sswitch_27
        0x17997dff -> :sswitch_32
        0x182bbb1b -> :sswitch_2b
        0x1ad1c74e -> :sswitch_0
        0x1b942cc2 -> :sswitch_1f
        0x1ee53313 -> :sswitch_5
        0x1fbc846e -> :sswitch_1d
        0x242db4c7 -> :sswitch_1a
        0x276a19e9 -> :sswitch_4
        0x289683c6 -> :sswitch_36
        0x2e7ee8f5 -> :sswitch_16
        0x31c76d2b -> :sswitch_6
        0x31cce3f1 -> :sswitch_c
        0x337a2c2d -> :sswitch_0
        0x345b88f5 -> :sswitch_7
        0x34c0db57 -> :sswitch_b
        0x384804e6 -> :sswitch_26
        0x386d05da -> :sswitch_19
        0x43952650 -> :sswitch_1c
        0x4952fc4b -> :sswitch_1b
        0x49f1a72e -> :sswitch_20
        0x49fcc482 -> :sswitch_30
        0x4bd43b7c -> :sswitch_b
        0x4c1467f3 -> :sswitch_26
        0x4c872b5e -> :sswitch_20
        0x52ba4c55 -> :sswitch_1a
        0x5685d181 -> :sswitch_1f
        0x59f78f4c -> :sswitch_a
        0x5c730394 -> :sswitch_9
        0x5c7686cd -> :sswitch_2
        0x5d63a3cd -> :sswitch_37
        0x5f31d9c9 -> :sswitch_2b
        0x61d1b712 -> :sswitch_a
        0x628b5e00 -> :sswitch_5
        0x62d61cfa -> :sswitch_25
        0x63a0bdd3 -> :sswitch_17
        0x69828acb -> :sswitch_27
        0x69f8a43c -> :sswitch_2d
        0x6eb88edc -> :sswitch_1c
        0x7049b51e -> :sswitch_3
        0x70952a6e -> :sswitch_1
        0x7177e0d6 -> :sswitch_15
        0x7684b3cd -> :sswitch_15
        0x7894db30 -> :sswitch_18
        0x7b91af6f -> :sswitch_e
        0x7c0193f0 -> :sswitch_13
        0x7f31abe6 -> :sswitch_2e
    .end sparse-switch
.end method

.method public final bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .line 39
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Ll/ۜۜ᩺;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public final setAdapter(Landroid/widget/ListAdapter;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x19ad92c0

    sget v3, Ll/֫;->ܶܺ᩻:I

    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    const-string v5, "\u1a79\u1a77"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x3d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x34e3

    const v7, -0xa4fab35

    xor-int/2addr v6, v7

    const v7, -0x1ce340e6

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x7f0b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 82
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    return-void

    :sswitch_0
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    sget v5, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v5, :cond_4

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    sget v5, Ll/ۘۧ;->ܳ᩷᩸:I

    if-lez v5, :cond_8

    goto/16 :goto_5

    .line 144
    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget v5, Ll/֫;->ܶܺ᩻:I

    if-gez v5, :cond_d

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    goto/16 :goto_4

    .line 231
    :sswitch_4
    invoke-interface {p1, v1}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    goto :goto_1

    :sswitch_5
    return-void

    .line 227
    :sswitch_6
    invoke-interface {v0, v1}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    goto :goto_2

    .line 229
    :sswitch_7
    invoke-super {p0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    if-eqz p1, :cond_0

    const-string v5, "\u0733\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x570d

    const v7, 0x4fbcf062

    xor-int/2addr v6, v7

    const v7, 0x5b1fab6c

    goto :goto_0

    :cond_0
    :goto_1
    const-string v5, "\u06ec\u06e1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x45

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x118f

    const v7, 0x268bcf04

    xor-int/2addr v6, v7

    const v7, 0x76c6529f

    goto :goto_0

    .line 225
    :sswitch_8
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    .line 226
    iget-object v1, p0, Ll/ۜۜ᩺;->᩶:Landroid/database/DataSetObserver;

    if-eqz v0, :cond_1

    const-string v5, "\u06db\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7497

    const v7, -0x680711c4

    xor-int/2addr v6, v7

    const v7, -0x10f34c93

    goto/16 :goto_0

    :cond_1
    :goto_2
    const-string v5, "\u06d8\u1a79"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x1f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3607

    const v7, -0x491b2d9c

    xor-int/2addr v6, v7

    const v7, -0x1c659a05

    goto/16 :goto_0

    .line 215
    :sswitch_9
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_2

    const-string v5, "\u1a79\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x127b

    const v7, -0x2d569287

    xor-int/2addr v6, v7

    const v7, -0x5f8ee8ab

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u06df\u1a77"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1f11

    const v7, -0x1a192262

    xor-int/2addr v6, v7

    const v7, 0x4bb4c713    # 2.3694886E7f

    goto/16 :goto_0

    .line 141
    :sswitch_a
    sget v5, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u06dc\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x43

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7a43

    const v7, 0x3baec83e

    xor-int/2addr v6, v7

    const v7, 0xb665129

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v5, :cond_5

    :cond_4
    const-string v5, "\u1a75\u06db"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x19

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x638f

    const v7, 0x31fc8b6

    xor-int/2addr v6, v7

    const v7, 0x5e057e3

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06d6\u05a8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x61

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xa39

    const v7, 0x1f90612

    xor-int/2addr v6, v7

    const v7, 0x7ae12118

    goto/16 :goto_0

    .line 97
    :sswitch_c
    sget v5, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u1a78\u073d"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x4d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x61b1

    const v7, -0x301ee389

    xor-int/2addr v6, v7

    const v7, 0x43d8951b

    goto/16 :goto_0

    .line 193
    :sswitch_d
    sget v5, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u06e1\u1a77"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x53f1

    const v7, -0xa043e04

    xor-int/2addr v6, v7

    const v7, 0x3bb5d2a8

    goto/16 :goto_0

    .line 181
    :sswitch_e
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    :goto_3
    const-string v5, "\u05a8\u06e7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x708d

    const v7, 0x4efde2b3

    xor-int/2addr v6, v7

    const v7, -0xe75c6b6

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u0730\u06d6"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4293

    const v7, -0x2ba66d0e

    xor-int/2addr v6, v7

    const v7, 0x4769290

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_5

    :cond_a
    const-string v5, "\u1a7a\u1a78"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6f63

    const v7, 0x6622d2d1

    xor-int/2addr v6, v7

    const v7, -0xa581b72

    goto/16 :goto_0

    .line 4
    :sswitch_10
    sget v5, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v5, :cond_b

    goto :goto_5

    :cond_b
    const-string v5, "\u05a8\u1a76"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x2b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x24a7

    const v7, 0x28667b24

    xor-int/2addr v6, v7

    const v7, 0x6bed06e9

    goto/16 :goto_0

    .line 147
    :sswitch_11
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v5

    if-eqz v5, :cond_c

    :goto_4
    const-string v5, "\u1a77\u06e7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1c15

    const v7, 0x2987cdbe

    xor-int/2addr v6, v7

    const v7, -0x76479e98

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06e4\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xe9

    const v7, 0x20d5dbcf

    xor-int/2addr v6, v7

    const v7, 0x1f386815

    goto/16 :goto_0

    :sswitch_12
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_e

    :cond_d
    :goto_5
    const-string v5, "\u1a74\u06e7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7aaf

    const v7, -0x1b0441b2

    xor-int/2addr v6, v7

    const v7, 0x77713a20

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u06e0\u073a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x2d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5981

    const v7, 0x587ac66a

    xor-int/2addr v6, v7

    const v7, -0x7c381953

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77345a35 -> :sswitch_0
        -0x742886fc -> :sswitch_8
        -0x6eb37d4c -> :sswitch_f
        -0x64242583 -> :sswitch_11
        -0x601b7b58 -> :sswitch_c
        -0x5df2bef7 -> :sswitch_4
        -0x545a0d56 -> :sswitch_b
        -0x53b0ef03 -> :sswitch_5
        -0x40f635f1 -> :sswitch_4
        -0x3bead9a7 -> :sswitch_d
        -0x39eaa747 -> :sswitch_3
        -0x35fc3257 -> :sswitch_12
        -0x32a0db97 -> :sswitch_7
        -0x2df63b6e -> :sswitch_6
        -0x2b6da4a5 -> :sswitch_e
        -0x1e6146d5 -> :sswitch_c
        -0x10f82405 -> :sswitch_2
        -0xfd0c400 -> :sswitch_10
        -0xfcf2fd5 -> :sswitch_8
        -0x3676c25 -> :sswitch_3
        0x164f6bf3 -> :sswitch_12
        0x16d718bc -> :sswitch_a
        0x16e1f03c -> :sswitch_6
        0x1d416c95 -> :sswitch_5
        0x23660474 -> :sswitch_1
        0x244b8911 -> :sswitch_f
        0x2ba2d56a -> :sswitch_10
        0x31e9de1a -> :sswitch_2
        0x35c7fadf -> :sswitch_e
        0x36429d46 -> :sswitch_d
        0x43ffc8d3 -> :sswitch_1
        0x4464a964 -> :sswitch_0
        0x447847b2 -> :sswitch_9
        0x453fc405 -> :sswitch_9
        0x5071a3f5 -> :sswitch_7
        0x590357d6 -> :sswitch_11
        0x5dcda263 -> :sswitch_a
        0x61277fc5 -> :sswitch_b
    .end sparse-switch
.end method

.method public final setFastScrollEnabled(Z)V
    .locals 0

    .line 208
    iput-boolean p1, p0, Ll/ۜۜ᩺;->ۖۙ:Z

    return-void
.end method

.method public final setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V
    .locals 6

    const v0, 0x5fed61e5

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    sget v2, Ll/ۗ;->֨۬ۖ:I

    const-string v3, "\u06e4\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3135

    const v5, -0x37dc774

    xor-int/2addr v4, v5

    const v5, -0x693546

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x39f5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_a

    goto/16 :goto_3

    .line 319
    :sswitch_0
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v3

    if-eqz v3, :cond_c

    goto/16 :goto_4

    :sswitch_1
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_6

    goto :goto_1

    .line 252
    :sswitch_2
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v3, "\u0736\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3f19

    const v5, 0x5add6559

    xor-int/2addr v4, v5

    const v5, 0x7d161a25    # 1.2469997E37f

    goto :goto_0

    .line 285
    :sswitch_3
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    return-void

    :sswitch_5
    const/4 p1, 0x0

    .line 585
    invoke-super {p0, p1}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void

    .line 588
    :sswitch_6
    new-instance p1, Ll/ۖۜ᩺;

    invoke-direct {p1, p0}, Ll/ۖۜ᩺;-><init>(Ll/ۜۜ᩺;)V

    invoke-super {p0, p1}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void

    .line 583
    :sswitch_7
    iput-object p1, p0, Ll/ۜۜ᩺;->᩹ۙ:Landroid/widget/AdapterView$OnItemLongClickListener;

    if-nez p1, :cond_1

    const-string v3, "\u1a7b\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3f8f

    const v5, -0x765ab826

    xor-int/2addr v4, v5

    const v5, 0x3294a5ee

    goto :goto_0

    :cond_1
    const-string v3, "\u1a7b\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5fb3

    const v5, 0x522a1348

    xor-int/2addr v4, v5

    const v5, 0x722cf669

    goto/16 :goto_0

    .line 307
    :sswitch_8
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u073d\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xb81

    const v5, 0x14aa9e3c

    xor-int/2addr v4, v5

    const v5, 0x265b6cbe

    goto/16 :goto_0

    .line 132
    :sswitch_9
    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a77\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x600f

    const v5, -0x10ed9864

    xor-int/2addr v4, v5

    const v5, 0xe54a826

    goto/16 :goto_0

    .line 266
    :sswitch_a
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v3

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u0730\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5c4b

    const v5, 0x5011e867    # 9.791708E9f

    xor-int/2addr v4, v5

    const v5, -0x3c4ddee9

    goto/16 :goto_0

    .line 24
    :sswitch_b
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06e0\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7291

    const v5, -0x780cb2f

    xor-int/2addr v4, v5

    const v5, -0x1fcc92b8

    goto/16 :goto_0

    .line 437
    :sswitch_c
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v3

    if-gtz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u073f\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3e83

    const v5, 0x226afe79

    xor-int/2addr v4, v5

    const v5, 0x74e77574

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e4\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4fcb

    const v5, -0x5ab0c5c1

    xor-int/2addr v4, v5

    const v5, 0x7fd6bae7

    goto/16 :goto_0

    .line 346
    :sswitch_d
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v3, "\u06dc\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1591

    const v5, -0x797b41d2

    xor-int/2addr v4, v5

    const v5, 0x464f9e3c

    goto/16 :goto_0

    .line 20
    :sswitch_e
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u06e4\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x205

    const v5, -0x40ce2f1a

    xor-int/2addr v4, v5

    const v5, -0x4de5b36c

    goto/16 :goto_0

    :goto_3
    const-string v3, "\u05ab\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5741

    const v5, -0x6b81c65b

    xor-int/2addr v4, v5

    const v5, -0x2a79e690

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a73\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3f71

    const v5, 0x3bda41b0

    xor-int/2addr v4, v5

    const v5, 0x53dcc886

    goto/16 :goto_0

    .line 188
    :sswitch_f
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-ltz v3, :cond_b

    :goto_4
    const-string v3, "\u06e8\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xb15

    const v5, 0x3ae82956

    xor-int/2addr v4, v5

    const v5, -0x3fc9fc69

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e8\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x35ed

    const v5, 0x4b3c51ea    # 1.2341738E7f

    xor-int/2addr v4, v5

    const v5, 0xc79b542

    goto/16 :goto_0

    .line 150
    :sswitch_10
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_d

    :cond_c
    :goto_5
    const-string v3, "\u1a7a\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x699d

    const v5, -0x6c17c273

    xor-int/2addr v4, v5

    const v5, 0x63008083

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e0\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x58e3

    const v5, 0x74f5e0ee

    xor-int/2addr v4, v5

    const v5, -0x7be191b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f987323 -> :sswitch_5
        -0x7e2e8b90 -> :sswitch_7
        -0x75fc5a95 -> :sswitch_5
        -0x71706739 -> :sswitch_f
        -0x6ea4c7b8 -> :sswitch_b
        -0x61ed88b3 -> :sswitch_8
        -0x55ca0e09 -> :sswitch_0
        -0x53d07847 -> :sswitch_1
        -0x468cb8db -> :sswitch_a
        -0x43587e12 -> :sswitch_8
        -0x36f73e58 -> :sswitch_3
        -0x36a2ebe9 -> :sswitch_d
        -0x30eb44f7 -> :sswitch_6
        -0x2b9fa97e -> :sswitch_e
        -0x2a264f3a -> :sswitch_e
        -0x261393cb -> :sswitch_3
        -0x205b4b1b -> :sswitch_10
        -0x1d827bb5 -> :sswitch_2
        -0xb40a90b -> :sswitch_c
        -0xaee9d25 -> :sswitch_9
        -0x6df1a8a -> :sswitch_b
        -0x677f199 -> :sswitch_0
        0xea8298 -> :sswitch_d
        0xa048174 -> :sswitch_4
        0xd9c9048 -> :sswitch_6
        0x1f538ca5 -> :sswitch_2
        0x41d53490 -> :sswitch_1
        0x43405229 -> :sswitch_c
        0x4423ccb1 -> :sswitch_a
        0x4816afbb -> :sswitch_9
        0x4d6604fa -> :sswitch_10
        0x516c0377 -> :sswitch_7
        0x6becff89 -> :sswitch_f
        0x72c6cc1b -> :sswitch_4
    .end sparse-switch
.end method

.method public final setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 0

    .line 632
    iput-object p1, p0, Ll/ۜۜ᩺;->֨ۙ:Landroid/widget/AbsListView$OnScrollListener;

    return-void
.end method

.method public final setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 0

    .line 745
    iput-object p1, p0, Ll/ۜۜ᩺;->ܺ:Landroid/view/View$OnTouchListener;

    return-void
.end method

.method public final setSelection(I)V
    .locals 6

    const v0, -0x7af2228e

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v2, Ll/֨ܶ;->ۛۛۛ:I

    const-string v3, "\u1a77\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7b89

    const v5, 0x6b4be79f

    xor-int/2addr v4, v5

    const v5, -0x48eb8ff9

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x65cf

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 25
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    sget v3, Ll/۟;->ۨᩴۛ:I

    if-gez v3, :cond_0

    goto/16 :goto_2

    .line 14
    :sswitch_0
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_9

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u05a8\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x172d

    const v5, 0x7c7c1ab5

    xor-int/2addr v4, v5

    const v5, -0x67c63496

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v3

    if-lez v3, :cond_7

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    goto :goto_1

    .line 32
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    return-void

    :sswitch_4
    const/4 p1, 0x0

    .line 108
    iput-boolean p1, p0, Ll/ۜۜ᩺;->ۢ:Z

    return-void

    .line 107
    :sswitch_5
    invoke-super {p0, p1}, Landroid/widget/ListView;->setSelection(I)V

    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u0736\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x798f

    const v5, -0x1758d985

    xor-int/2addr v4, v5

    const v5, -0x6e8052f7

    goto :goto_0

    .line 37
    :sswitch_6
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a79\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5531

    const v5, -0x2f019f51

    xor-int/2addr v4, v5

    const v5, 0x1abe7b5c

    goto/16 :goto_0

    .line 4
    :sswitch_7
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06e1\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7da3

    const v5, -0x217a1f98

    xor-int/2addr v4, v5

    const v5, 0x689106c9

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v3

    if-ltz v3, :cond_4

    :goto_1
    const-string v3, "\u0736\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x843

    const v5, -0x8a72f6a

    xor-int/2addr v4, v5

    const v5, -0x37fed3c3

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e4\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x28db

    const v5, -0x4825c9e6

    xor-int/2addr v4, v5

    const v5, -0xf0080a2

    goto/16 :goto_0

    .line 77
    :sswitch_9
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u1a77\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5679

    const v5, -0x40948877

    xor-int/2addr v4, v5

    const v5, 0x74f7b53e

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06d8\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x495f

    const v5, -0x48776d47

    xor-int/2addr v4, v5

    const v5, -0x20a4261c

    goto/16 :goto_0

    .line 79
    :sswitch_b
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u05a8\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7e8b

    const v5, -0x532584e9

    xor-int/2addr v4, v5

    const v5, 0x1f098a30

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06ec\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x56ad

    const v5, -0xa11f8f

    xor-int/2addr v4, v5

    const v5, 0x1cb0512b

    goto/16 :goto_0

    .line 88
    :sswitch_c
    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u073f\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x152b

    const v5, 0x1bf759c5

    xor-int/2addr v4, v5

    const v5, 0x2cdf2b3c

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e8\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1fcd

    const v5, -0x23b93123

    xor-int/2addr v4, v5

    const v5, -0x71079264

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u1a7b\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, -0x35

    const v5, 0x58cd4554

    xor-int/2addr v4, v5

    const v5, 0x19486698

    goto/16 :goto_0

    .line 38
    :sswitch_e
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u06d8\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xca7

    const v5, 0x2e68f3f

    xor-int/2addr v4, v5

    const v5, -0x40f4c8d2

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0736\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4c1d

    const v5, 0x1e978adb

    xor-int/2addr v4, v5

    const v5, -0x7b7f6fe6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x72ce0e96 -> :sswitch_c
        -0x68dfc8f6 -> :sswitch_5
        -0x686d80a6 -> :sswitch_1
        -0x50e2473f -> :sswitch_9
        -0x45312385 -> :sswitch_6
        -0x41f4d641 -> :sswitch_2
        -0x38ae0e57 -> :sswitch_e
        -0x2a096437 -> :sswitch_8
        -0x2974d9f3 -> :sswitch_7
        -0x27bbb873 -> :sswitch_1
        -0x269b7d3e -> :sswitch_6
        -0x15519e67 -> :sswitch_7
        -0xbf56278 -> :sswitch_3
        -0xb3933b7 -> :sswitch_d
        -0xb323a5d -> :sswitch_4
        -0xa392ac2 -> :sswitch_0
        -0xd7d973 -> :sswitch_b
        0x3bffee5 -> :sswitch_0
        0x10fd4846 -> :sswitch_d
        0x29515d3d -> :sswitch_a
        0x2d5e945f -> :sswitch_3
        0x307d5ec8 -> :sswitch_4
        0x3093ada9 -> :sswitch_e
        0x3531ce56 -> :sswitch_9
        0x36742c82 -> :sswitch_2
        0x3e1bda81 -> :sswitch_a
        0x5180e130 -> :sswitch_b
        0x63adc62a -> :sswitch_8
        0x6afbfae2 -> :sswitch_5
        0x6b17329f -> :sswitch_c
    .end sparse-switch
.end method

.method public final showContextMenuForChild(Landroid/view/View;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x4da7892d

    sget v2, Ll/ۗ;->֨۬ۖ:I

    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    const-string v4, "\u06d8\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x660f

    const v6, -0x24ec5b2

    xor-int/2addr v5, v6

    const v6, -0x7e09816b

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x66ed

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    const/4 v4, 0x1

    .line 384
    iput-boolean v4, p0, Ll/ۜۜ᩺;->ۚۙ:Z

    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_0

    goto/16 :goto_2

    .line 329
    :sswitch_0
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v4, :cond_c

    goto/16 :goto_3

    .line 338
    :sswitch_1
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-nez v4, :cond_4

    goto/16 :goto_3

    .line 445
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v4

    if-lez v4, :cond_8

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto/16 :goto_4

    .line 276
    :sswitch_4
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 v4, 0x0

    .line 385
    iput-boolean v4, p0, Ll/ۜۜ᩺;->۬ۙ:Z

    goto :goto_1

    :cond_0
    const-string v4, "\u06e8\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2da9

    const v6, -0x291840e7

    xor-int/2addr v5, v6

    const v6, -0x1a7ab457

    goto :goto_0

    :sswitch_6
    return v0

    .line 603
    :sswitch_7
    invoke-super {p0, p1}, Landroid/widget/ListView;->showContextMenuForChild(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v4, "\u05a1\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6bb

    const v6, 0x7f86f168

    xor-int/2addr v5, v6

    const v6, -0x697ce7a5

    goto :goto_0

    :cond_1
    :goto_1
    const-string v4, "\u073f\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x646b

    const v6, 0xedabc70

    xor-int/2addr v5, v6

    const v6, 0x2fbee682

    goto/16 :goto_0

    .line 506
    :sswitch_8
    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v4, :cond_2

    :goto_2
    const-string v4, "\u1a76\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x52ab

    const v6, -0x2db41bff

    xor-int/2addr v5, v6

    const v6, 0xb106a3d

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06db\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1b2b

    const v6, -0x5a3a596

    xor-int/2addr v5, v6

    const v6, -0x786e7117

    goto/16 :goto_0

    .line 475
    :sswitch_9
    sget-boolean v4, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u1a75\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5027

    const v6, -0x1979d7aa

    xor-int/2addr v5, v6

    const v6, 0x5bb23839

    goto/16 :goto_0

    .line 366
    :sswitch_a
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v4

    if-gtz v4, :cond_5

    :cond_4
    const-string v4, "\u1a75\u073a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x44f1

    const v6, 0x52ea222b

    xor-int/2addr v5, v6

    const v6, -0x34f155b4    # -9349708.0f

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u1a76\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3ec5

    const v6, 0x19ce3ade

    xor-int/2addr v5, v6

    const v6, 0x27736202

    goto/16 :goto_0

    .line 467
    :sswitch_b
    sget-boolean v4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u1a78\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x238f

    const v6, -0x359ab870    # -3756516.0f

    xor-int/2addr v5, v6

    const v6, -0x3e846488

    goto/16 :goto_0

    .line 186
    :sswitch_c
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v4

    if-gtz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u05a1\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x77f9

    const v6, -0x2b779fe7

    xor-int/2addr v5, v6

    const v6, 0x340bdb60

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u073f\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5785

    const v6, 0x261f1365

    xor-int/2addr v5, v6

    const v6, 0x644751af

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u073d\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2327

    const v6, -0x7de3787d    # -1.149996E-37f

    xor-int/2addr v5, v6

    const v6, -0x5ddd8566    # -2.2019999E-18f

    goto/16 :goto_0

    .line 479
    :sswitch_e
    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_a

    goto :goto_5

    :cond_a
    const-string v4, "\u05a1\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6241

    const v6, 0x45f76ffc

    xor-int/2addr v5, v6

    const v6, -0x615ce73f

    goto/16 :goto_0

    .line 5
    :sswitch_f
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_b

    :goto_4
    const-string v4, "\u05a8\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4339

    const v6, 0x76bc9e61

    xor-int/2addr v5, v6

    const v6, -0x95fdbaa

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a7b\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1585

    const v6, 0x6bad7ee8

    xor-int/2addr v5, v6

    const v6, 0x2f0f901b

    goto/16 :goto_0

    .line 32
    :sswitch_10
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u05a1\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2ab5

    const v6, -0x35a91534    # -3521203.0f

    xor-int/2addr v5, v6

    const v6, -0xe17395e

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a7a\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3b95

    const v6, 0x645a9d1a

    xor-int/2addr v5, v6

    const v6, -0x3de9c772

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78e4edbf -> :sswitch_4
        -0x767fed48 -> :sswitch_b
        -0x61676324 -> :sswitch_a
        -0x5f146f19 -> :sswitch_e
        -0x5d70921c -> :sswitch_a
        -0x587289e0 -> :sswitch_0
        -0x55b9f880 -> :sswitch_9
        -0x540fc89f -> :sswitch_f
        -0x492d7810 -> :sswitch_f
        -0x459a78c8 -> :sswitch_5
        -0x3b7cfb08 -> :sswitch_8
        -0x3749fd30 -> :sswitch_b
        -0x2bbd2018 -> :sswitch_4
        -0x2146e117 -> :sswitch_0
        -0x1e771d1e -> :sswitch_2
        -0x1baf8206 -> :sswitch_5
        -0x1ab7a6de -> :sswitch_d
        -0x23d5f7f -> :sswitch_c
        0x4858176 -> :sswitch_9
        0x1164e061 -> :sswitch_10
        0x17251303 -> :sswitch_c
        0x20806cfb -> :sswitch_1
        0x265e1ab8 -> :sswitch_7
        0x2c53bf26 -> :sswitch_d
        0x35a55cbb -> :sswitch_8
        0x3ba78a67 -> :sswitch_3
        0x3c59caae -> :sswitch_3
        0x4318619c -> :sswitch_1
        0x443922cb -> :sswitch_2
        0x44bfbc6c -> :sswitch_6
        0x54942ed7 -> :sswitch_10
        0x555c085c -> :sswitch_7
        0x70ec97cd -> :sswitch_e
        0x74b0670b -> :sswitch_6
    .end sparse-switch
.end method

.method public final showContextMenuForChild(Landroid/view/View;FF)Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0xbb218ae

    sget v2, Ll/֫֡;->ۡ᩹ۗ:I

    sget v3, Ll/ۧ;->֫۠ᩴ:I

    const-string v4, "\u1a79\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3f2b

    const v6, 0x5e165f27

    xor-int/2addr v5, v6

    const v6, -0x6e1d4fdc

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x4c79

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 434
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    const/4 p1, 0x0

    return p1

    .line 517
    :sswitch_0
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez v4, :cond_8

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-nez v4, :cond_3

    goto/16 :goto_5

    .line 518
    :sswitch_2
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v4, :cond_c

    goto :goto_1

    .line 393
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    :goto_1
    const-string v4, "\u06e7\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5d19

    const v6, 0x4d8854ea    # 2.859083E8f

    xor-int/2addr v5, v6

    const v6, -0x33d5218b    # -4.4792276E7f

    goto :goto_0

    :sswitch_4
    const/4 v4, 0x1

    .line 384
    iput-boolean v4, p0, Ll/ۜۜ᩺;->ۚۙ:Z

    const/4 v4, 0x0

    .line 385
    iput-boolean v4, p0, Ll/ۜۜ᩺;->۬ۙ:Z

    goto :goto_2

    :sswitch_5
    return v0

    .line 615
    :sswitch_6
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ListView;->showContextMenuForChild(Landroid/view/View;FF)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v4, "\u05a8\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7b3

    const v6, 0x1237e88f

    xor-int/2addr v5, v6

    const v6, 0x3ac1958e

    goto :goto_0

    :cond_0
    :goto_2
    const-string v4, "\u05a8\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x51f7

    const v6, -0xd9f4035

    xor-int/2addr v5, v6

    const v6, 0x2c32137

    goto :goto_0

    .line 227
    :sswitch_7
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u05ab\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x70c5

    const v6, 0x2333ecc7

    xor-int/2addr v5, v6

    const v6, -0x62934851

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u1a76\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6a2f

    const v6, -0xe6cd615

    xor-int/2addr v5, v6

    const v6, -0x420d8e7

    goto/16 :goto_0

    .line 381
    :sswitch_9
    sget v4, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v4, :cond_4

    :cond_3
    :goto_3
    const-string v4, "\u1a7b\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x56a7

    const v6, -0x52d5d584

    xor-int/2addr v5, v6

    const v6, -0x58e88955

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e0\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x639

    const v6, -0x4e4733d5

    xor-int/2addr v5, v6

    const v6, -0x516946d0

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v4, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v4, "\u05a8\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1545

    const v6, 0x2d6d1130

    xor-int/2addr v5, v6

    const v6, 0x7e21301e

    goto/16 :goto_0

    .line 550
    :sswitch_b
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v4

    if-ltz v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u0736\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x480b

    const v6, -0x3bfef1c3

    xor-int/2addr v5, v6

    const v6, 0x2319112

    goto/16 :goto_0

    .line 140
    :sswitch_c
    sget-boolean v4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u073f\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5915

    const v6, -0x4dcb70d4

    xor-int/2addr v5, v6

    const v6, -0x1dd81e0d

    goto/16 :goto_0

    .line 237
    :sswitch_d
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_9

    :cond_8
    const-string v4, "\u1a78\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x23f9

    const v6, 0x49590deb

    xor-int/2addr v5, v6

    const v6, -0x1304d2ff

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a78\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4e3f

    const v6, 0x51ff4ae8

    xor-int/2addr v5, v6

    const v6, 0x6bd2a1b4

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_a

    goto :goto_5

    :cond_a
    const-string v4, "\u1a7b\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x70d5

    const v6, -0x2d08e593

    xor-int/2addr v5, v6

    const v6, 0x53761442

    goto/16 :goto_0

    .line 120
    :sswitch_f
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_b

    :goto_4
    const-string v4, "\u1a74\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2097

    const v6, 0x1680f371

    xor-int/2addr v5, v6

    const v6, 0x28713cc4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06d8\u05ab"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x66b9

    const v6, -0xe4952eb

    xor-int/2addr v5, v6

    const v6, 0x793e3568

    goto/16 :goto_0

    .line 500
    :sswitch_10
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u06d9\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x13

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x14c5

    const v6, 0x723210d4

    xor-int/2addr v5, v6

    const v6, -0x9e959da

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a77\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6c97

    const v6, -0x6a1aecc7

    xor-int/2addr v5, v6

    const v6, -0x7743a5ee

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7356bd91 -> :sswitch_6
        -0x6e5f1804 -> :sswitch_2
        -0x6b7b4102 -> :sswitch_8
        -0x60e34a32 -> :sswitch_f
        -0x5bce74df -> :sswitch_7
        -0x514799aa -> :sswitch_0
        -0x5000d579 -> :sswitch_6
        -0x4c0b7ad1 -> :sswitch_9
        -0x49c4aa0c -> :sswitch_10
        -0x4270f76d -> :sswitch_5
        -0x4238eb6e -> :sswitch_5
        -0x2e67e16a -> :sswitch_b
        -0x2b2a9943 -> :sswitch_c
        -0x258c56ec -> :sswitch_a
        -0x24a45a48 -> :sswitch_3
        -0x3cabc1a -> :sswitch_4
        0xb0a9b68 -> :sswitch_d
        0xb10125c -> :sswitch_d
        0x11929906 -> :sswitch_8
        0x1a42e263 -> :sswitch_3
        0x1cdf43d7 -> :sswitch_1
        0x20a59819 -> :sswitch_1
        0x215bd118 -> :sswitch_e
        0x2ee577c0 -> :sswitch_10
        0x3428518e -> :sswitch_e
        0x37bb9d46 -> :sswitch_f
        0x3bc6ee46 -> :sswitch_7
        0x5a544a71 -> :sswitch_a
        0x5d23faef -> :sswitch_b
        0x62a41cd4 -> :sswitch_4
        0x636ea87f -> :sswitch_c
        0x6adef385 -> :sswitch_2
        0x7b7584fa -> :sswitch_0
        0x7c0b4ca1 -> :sswitch_9
    .end sparse-switch
.end method

.method public final ۖ()V
    .locals 1

    const/4 v0, 0x0

    .line 198
    iput v0, p0, Ll/ۜۜ᩺;->֫:I

    return-void
.end method

.method public final ۙ()I
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x7cbe499c

    sget v5, Ll/֡᩶;->ۗ֨ܺ:I

    sget v6, Ll/֫ܳ;->᩶ۧۛ:I

    const-string v7, "\u06e0\u06e7"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3bfb

    const v9, 0x2312d024

    xor-int/2addr v8, v9

    const v9, -0x7e628e2d

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, 0x2163

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 73
    sget v7, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v7, :cond_4

    goto/16 :goto_5

    .line 161
    :sswitch_0
    sget v7, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v7, :cond_d

    goto/16 :goto_6

    .line 50
    :sswitch_1
    sget v7, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez v7, :cond_b

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget v7, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v7, :cond_5

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    goto/16 :goto_5

    .line 61
    :sswitch_4
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    const/4 v0, 0x0

    return v0

    .line 242
    :sswitch_5
    invoke-static {p0}, Ll/ۖܽ;->۫᩺۠(Ljava/lang/Object;)I

    move-result v2

    div-int/2addr v2, v3

    invoke-static {v0, v2}, Ll/֨ۢ;->᩹᩸֫(II)I

    move-result v2

    goto :goto_2

    .line 246
    :sswitch_6
    iput v2, p0, Ll/ۜۜ᩺;->ܶۙ:I

    goto :goto_1

    .line 247
    :sswitch_7
    iget v0, p0, Ll/ۜۜ᩺;->ܶۙ:I

    return v0

    :sswitch_8
    const/4 v3, 0x0

    .line 240
    invoke-static {p0, v3}, Ll/ۗܺ;->ᩳۗۚ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Ll/ۘۛ;->ۚܽۙ(Ljava/lang/Object;)I

    move-result v3

    if-le v3, v1, :cond_1

    const-string v7, "\u1a76\u1a74"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7b3b

    const v9, -0xa6b40a8

    xor-int/2addr v8, v9

    const v9, -0x19fc3cb6

    goto :goto_0

    .line 245
    :sswitch_9
    iget v7, p0, Ll/ۜۜ᩺;->ܶۙ:I

    if-le v2, v7, :cond_0

    const-string v7, "\u06df\u0730"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x17

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5895

    const v9, -0x71dd79e4

    xor-int/2addr v8, v9

    const v9, 0x7b4d846c

    goto :goto_0

    :cond_0
    :goto_1
    const-string v7, "\u06d8\u073a"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x51

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x44bf

    const v9, -0x326e027c    # -3.0616384E8f

    xor-int/2addr v8, v9

    const v9, -0x86f1894

    goto/16 :goto_0

    :sswitch_a
    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    const-string v7, "\u06d9\u06df"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x47

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x26fd

    const v9, 0x7f33c843

    xor-int/2addr v8, v9

    const v9, -0x8fe430b

    goto/16 :goto_0

    :cond_1
    move v2, v0

    :goto_2
    const-string v7, "\u1a7b\u1a7b"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3c73

    const v9, 0x33be55c9

    xor-int/2addr v8, v9

    const v9, -0x45b26f7e

    goto/16 :goto_0

    .line 23
    :sswitch_b
    sget v7, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v7, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v7, "\u06e4\u06df"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x15

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x76d9

    const v9, -0x32426043

    xor-int/2addr v8, v9

    const v9, 0x204b4d1c

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v7, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v7, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v7, "\u05ab\u06dc"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x2b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x20e1

    const v9, 0x4666df4d

    xor-int/2addr v8, v9

    const v9, 0x7f1f028e

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u0736\u1a7a"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x11

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x482d

    const v9, -0x4f8e5dd7

    xor-int/2addr v8, v9

    const v9, 0x2ef70aa

    goto/16 :goto_0

    .line 105
    :sswitch_d
    sget-boolean v7, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v7, :cond_6

    :cond_5
    :goto_3
    const-string v7, "\u06df\u1a75"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0xf

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x51b

    const v9, -0x7f5f8ab5

    xor-int/2addr v8, v9

    const v9, 0x3d324021

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u06df\u073a"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2031

    const v9, -0x604f7bf2

    xor-int/2addr v8, v9

    const v9, 0x4810022e

    goto/16 :goto_0

    .line 13
    :sswitch_e
    sget v7, Ll/֨ۧ;->֫۠֡:I

    if-gtz v7, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v7, "\u06db\u06e8"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x21

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2d13

    const v9, -0x40467809

    xor-int/2addr v8, v9

    const v9, 0x2ad91654

    goto/16 :goto_0

    .line 99
    :sswitch_f
    sget v7, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v7, :cond_8

    :goto_4
    const-string v7, "\u073d\u0733"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0xb

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6fdb

    const v9, -0x468c0f93

    xor-int/2addr v8, v9

    const v9, -0x3427b9bc    # -2.8347528E7f

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u1a74\u1a7a"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x5d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1fff

    const v9, -0x1b69bf68

    xor-int/2addr v8, v9

    const v9, 0x34e51f6a

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v7

    if-eqz v7, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v7, "\u06eb\u06e4"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2e7f

    const v9, -0x12944d6

    xor-int/2addr v8, v9

    const v9, -0x7bee2496

    goto/16 :goto_0

    .line 203
    :sswitch_11
    sget v7, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v7, :cond_a

    :goto_5
    const-string v7, "\u06d9\u06e7"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x7

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1197

    const v9, 0x1addb2e3

    xor-int/2addr v8, v9

    const v9, -0x6639c9ff

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u06e7\u06df"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x44cd

    const v9, -0x919c9b2

    xor-int/2addr v8, v9

    const v9, -0x218ed407

    goto/16 :goto_0

    .line 127
    :sswitch_12
    sget v7, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v7, :cond_c

    :cond_b
    :goto_6
    const-string v7, "\u1a78\u1a79"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x9

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x6cf1

    const v9, -0x1f386b72

    xor-int/2addr v8, v9

    const v9, 0x634016b8

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06d7\u073f"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xec5

    const v9, -0x7a9349fd

    xor-int/2addr v8, v9

    const v9, -0xa8ec965

    goto/16 :goto_0

    .line 238
    :sswitch_13
    invoke-static {p0}, Ll/֫ܶ;->ᩴ۬֫(Ljava/lang/Object;)I

    move-result v0

    .line 228
    sget-boolean v7, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v7, :cond_e

    :cond_d
    :goto_7
    const-string v7, "\u06d8\u06e2"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x63e1

    const v9, -0x59281609

    xor-int/2addr v8, v9

    const v9, 0x38de5919

    goto/16 :goto_0

    :cond_e
    const-string v7, "\u06e0\u05ab"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x50d3

    const v9, -0x289018ab

    xor-int/2addr v8, v9

    const v9, 0x464e3d18

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ddd3d77 -> :sswitch_8
        -0x7b220209 -> :sswitch_b
        -0x6d0d82f0 -> :sswitch_13
        -0x63213b6d -> :sswitch_c
        -0x49518ec3 -> :sswitch_c
        -0x478a84c9 -> :sswitch_a
        -0x4651c3d1 -> :sswitch_d
        -0x3a4582a7 -> :sswitch_6
        -0x37ef2374 -> :sswitch_5
        -0x32e1d81b -> :sswitch_10
        -0x29621f5d -> :sswitch_3
        -0x27cd8aea -> :sswitch_10
        -0x2437428c -> :sswitch_e
        -0x23470323 -> :sswitch_1
        -0x2169e8e8 -> :sswitch_11
        -0x1eb6fb4d -> :sswitch_3
        -0xe242997 -> :sswitch_4
        -0x91589e4 -> :sswitch_a
        0x1ff5ec2 -> :sswitch_b
        0x6f2313d -> :sswitch_6
        0xd319e59 -> :sswitch_5
        0x11d2859f -> :sswitch_4
        0x12abde72 -> :sswitch_2
        0x1c199d8d -> :sswitch_9
        0x1e40fe7e -> :sswitch_11
        0x27dbfcb4 -> :sswitch_2
        0x2bb152d7 -> :sswitch_1
        0x2f365d47 -> :sswitch_0
        0x4e14c884 -> :sswitch_f
        0x517fcc4f -> :sswitch_9
        0x52b8ac5f -> :sswitch_e
        0x55213717 -> :sswitch_12
        0x6020ef38 -> :sswitch_12
        0x62a3bb2d -> :sswitch_7
        0x6adecee9 -> :sswitch_0
        0x6cc1eeef -> :sswitch_8
        0x6f20159e -> :sswitch_f
        0x7b526d92 -> :sswitch_7
        0x7b987812 -> :sswitch_13
        0x7bee5614 -> :sswitch_d
    .end sparse-switch
.end method

.method public final ۙ(Landroid/view/View$OnTouchListener;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x54c6c728

    sget v2, Ll/֨ۧ;->֫۠֡:I

    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    const-string v4, "\u06d8\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1aa1

    const v6, 0x67ed6c39

    xor-int/2addr v5, v6

    const v6, -0x3a1567db

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x73b3

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 751
    iput-object v0, p0, Ll/ۜۜ᩺;->ᩳۙ:Ljava/util/ArrayList;

    .line 600
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u0736\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1e3f

    const v6, -0x64b8d858

    xor-int/2addr v5, v6

    const v6, 0x546b2583

    goto :goto_0

    .line 471
    :sswitch_0
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_2

    :sswitch_1
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_4

    goto/16 :goto_3

    .line 743
    :sswitch_2
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v4

    if-eqz v4, :cond_c

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    return-void

    .line 752
    :sswitch_5
    new-instance v4, Ll/ۚۜ᩺;

    invoke-direct {v4, p0}, Ll/ۚۜ᩺;-><init>(Ll/ۜۜ᩺;)V

    invoke-super {p0, v4}, Landroid/widget/ListView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_1

    :cond_0
    const-string v4, "\u06eb\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x68b

    const v6, -0x7f4cc6a3

    xor-int/2addr v5, v6

    const v6, -0x53166a68

    goto :goto_0

    .line 751
    :sswitch_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u06e0\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x65

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x821

    const v6, -0x2ac5146

    xor-int/2addr v5, v6

    const v6, -0x4e153745

    goto/16 :goto_0

    .line 765
    :sswitch_7
    iget-object v0, p0, Ll/ۜۜ᩺;->ᩳۙ:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    .line 750
    :sswitch_8
    iget-object v4, p0, Ll/ۜۜ᩺;->ᩳۙ:Ljava/util/ArrayList;

    if-nez v4, :cond_2

    const-string v4, "\u1a79\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5b19

    const v6, -0x7ccfd97

    xor-int/2addr v5, v6

    const v6, 0x52239f6b

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v4, "\u1a73\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6499

    const v6, -0x2aa31671

    xor-int/2addr v5, v6

    const v6, 0x35a321da

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06e4\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x199b

    const v6, -0x5f95671d

    xor-int/2addr v5, v6

    const v6, 0x29a83a5c

    goto/16 :goto_0

    .line 102
    :sswitch_a
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v4

    if-eqz v4, :cond_5

    :cond_4
    :goto_2
    const-string v4, "\u06da\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7c33

    const v6, -0x223296fc

    xor-int/2addr v5, v6

    const v6, 0x2802a654

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06d8\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x185d

    const v6, 0x2896a6f1

    xor-int/2addr v5, v6

    const v6, 0x1254423a

    goto/16 :goto_0

    .line 368
    :sswitch_b
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06df\u0730"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3b51

    const v6, 0x35df603e

    xor-int/2addr v5, v6

    const v6, 0x2f84fa3e

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v4

    if-eqz v4, :cond_7

    :goto_3
    const-string v4, "\u06dc\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6a35

    const v6, 0xb3f0d9e

    xor-int/2addr v5, v6

    const v6, -0x5266b4c

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u073a\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x25fd

    const v6, -0x53a3ca3e

    xor-int/2addr v5, v6

    const v6, -0x463d1d92

    goto/16 :goto_0

    .line 255
    :sswitch_d
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v4

    if-gtz v4, :cond_8

    goto :goto_5

    :cond_8
    const-string v4, "\u05a8\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x34f7

    const v6, 0x4918b95c    # 625557.75f

    xor-int/2addr v5, v6

    const v6, 0x4562e357

    goto/16 :goto_0

    .line 226
    :sswitch_e
    sget v4, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u1a78\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x11fd

    const v6, -0x48ab82b2

    xor-int/2addr v5, v6

    const v6, 0x3b2e9a39

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e0\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xd19

    const v6, -0x592559c4

    xor-int/2addr v5, v6

    const v6, -0x59c703e2

    goto/16 :goto_0

    .line 628
    :sswitch_f
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_5

    :cond_b
    const-string v4, "\u06d9\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xeb9

    const v6, -0x35a25bb4    # -3631379.0f

    xor-int/2addr v5, v6

    const v6, -0x6cedb17f

    goto/16 :goto_0

    .line 423
    :sswitch_10
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u06d6\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3855

    const v6, 0x3ecb70e7

    xor-int/2addr v5, v6

    const v6, 0xe51c2d3

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a75\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4b25

    const v6, -0x357dc738    # -4267108.0f

    xor-int/2addr v5, v6

    const v6, 0x766c627d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5fa995bc -> :sswitch_10
        -0x5f87f642 -> :sswitch_b
        -0x4cbc3f59 -> :sswitch_a
        -0x41374f10 -> :sswitch_3
        -0x3887f9e2 -> :sswitch_4
        -0x32d6d0a9 -> :sswitch_9
        -0x2affdb76 -> :sswitch_8
        -0x1c147490 -> :sswitch_0
        -0x1bd82e7e -> :sswitch_8
        -0xcbefdb6 -> :sswitch_d
        -0x9514395 -> :sswitch_e
        -0x4e315ad -> :sswitch_f
        -0x1a56f3f -> :sswitch_d
        0x81809a5 -> :sswitch_1
        0x8feb7ba -> :sswitch_7
        0xa4213cc -> :sswitch_6
        0xc614ebf -> :sswitch_2
        0x12b423b1 -> :sswitch_4
        0x151873d6 -> :sswitch_5
        0x1b4e832b -> :sswitch_5
        0x1e7d40fc -> :sswitch_e
        0x20de7c03 -> :sswitch_c
        0x26e2b204 -> :sswitch_6
        0x2e0dee3f -> :sswitch_f
        0x31d7f6ee -> :sswitch_0
        0x43965487 -> :sswitch_10
        0x47a95854 -> :sswitch_c
        0x4a362ccd -> :sswitch_9
        0x4a380f61 -> :sswitch_a
        0x501c3270 -> :sswitch_7
        0x5633af22 -> :sswitch_3
        0x634f1676 -> :sswitch_1
        0x642a63bf -> :sswitch_b
        0x70ff3de7 -> :sswitch_2
    .end sparse-switch
.end method

.method public final ۙ(Ll/ܿܰۙ;)V
    .locals 6

    const v0, 0x2e0ff7d1

    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    sget v2, Ll/֨ܶ;->ۛۛۛ:I

    const-string v3, "\u06d8\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3f09

    const v5, 0x52649d2a

    xor-int/2addr v4, v5

    const v5, 0x7055089c

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0xfb1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    const p1, 0x800005

    .line 627
    iput p1, p0, Ll/ۜۜ᩺;->ۛ:I

    return-void

    .line 376
    :sswitch_0
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-nez v3, :cond_b

    goto/16 :goto_3

    .line 271
    :sswitch_1
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v3

    if-lez v3, :cond_6

    goto/16 :goto_4

    .line 38
    :sswitch_2
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_8

    goto/16 :goto_4

    .line 215
    :sswitch_3
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    goto/16 :goto_4

    .line 46
    :sswitch_4
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    return-void

    .line 626
    :sswitch_5
    iput-object p1, p0, Ll/ۜۜ᩺;->ܿ:Ll/ܿܰۙ;

    .line 56
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06e1\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xc5

    const v5, 0x44aec519

    xor-int/2addr v4, v5

    const v5, 0x61a2f84e

    goto :goto_0

    .line 541
    :sswitch_6
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v3

    if-ltz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06eb\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x52a5

    const v5, 0x1f4edc8a

    xor-int/2addr v4, v5

    const v5, -0x590c4a8a

    goto :goto_0

    .line 246
    :sswitch_7
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u1a7b\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x65a3

    const v5, -0x48c90e41

    xor-int/2addr v4, v5

    const v5, -0x2c5eb65a

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v3

    if-ltz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u0733\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x461b

    const v5, -0x545673d5

    xor-int/2addr v4, v5

    const v5, 0x749b9659

    goto/16 :goto_0

    .line 484
    :sswitch_9
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v3

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06d8\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x51bf

    const v5, 0x79533c12

    xor-int/2addr v4, v5

    const v5, -0x2630ee87

    goto/16 :goto_0

    .line 339
    :sswitch_a
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_5

    :goto_1
    const-string v3, "\u073d\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x11d9

    const v5, -0x5afe98f1

    xor-int/2addr v4, v5

    const v5, -0x30b5d731

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06d7\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x584f

    const v5, -0x31903b7c

    xor-int/2addr v4, v5

    const v5, 0x2d3229af

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v3

    if-gtz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u1a74\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x309b

    const v5, -0x42321f01

    xor-int/2addr v4, v5

    const v5, -0x75fc3e15

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a79\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x59e5

    const v5, 0x1bd13d55

    xor-int/2addr v4, v5

    const v5, -0x37d14121

    goto/16 :goto_0

    .line 353
    :sswitch_c
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u0736\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x79ed

    const v5, -0x4e1b0801

    xor-int/2addr v4, v5

    const v5, -0x18ba7018

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a74\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x27bd

    const v5, -0x1595f84c

    xor-int/2addr v4, v5

    const v5, -0x3b0e93c6

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_a

    :goto_4
    const-string v3, "\u06dc\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x237

    const v5, -0xfa8ed4a

    xor-int/2addr v4, v5

    const v5, 0x7e21e989

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d9\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x231f

    const v5, 0x564b6512

    xor-int/2addr v4, v5

    const v5, 0x11623561

    goto/16 :goto_0

    .line 85
    :sswitch_e
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    const-string v3, "\u05a1\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x28fd

    const v5, 0xa306949

    xor-int/2addr v4, v5

    const v5, 0x197cfaaf

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a7b\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6cd

    const v5, -0x60bab73c

    xor-int/2addr v4, v5

    const v5, -0x31b5262e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77be74c6 -> :sswitch_c
        -0x74cf8d8e -> :sswitch_b
        -0x6f7520db -> :sswitch_2
        -0x67c6db52 -> :sswitch_3
        -0x678e605e -> :sswitch_8
        -0x5f7c63c5 -> :sswitch_6
        -0x4794c084 -> :sswitch_a
        -0x44f57553 -> :sswitch_4
        -0x41f0a7a3 -> :sswitch_d
        -0x3b73fb7c -> :sswitch_c
        -0x34c6cf05 -> :sswitch_0
        -0x25e49123 -> :sswitch_9
        -0x21785f29 -> :sswitch_7
        -0x214b6500 -> :sswitch_6
        -0x1f2b89d4 -> :sswitch_e
        0x1369a4 -> :sswitch_e
        0x137fb2 -> :sswitch_5
        0xc2120ac -> :sswitch_8
        0xe52c36f -> :sswitch_9
        0xf97566d -> :sswitch_b
        0x32ab835f -> :sswitch_3
        0x49d71b2f -> :sswitch_5
        0x559bd5c8 -> :sswitch_1
        0x5fee11da -> :sswitch_2
        0x64cce007 -> :sswitch_1
        0x6908ce80 -> :sswitch_a
        0x6c0c9e44 -> :sswitch_7
        0x6ed91ee5 -> :sswitch_4
        0x707ce322 -> :sswitch_d
        0x7f00fcc9 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ۨ()Z
    .locals 6

    const v0, 0x1f39e3e8

    sget v1, Ll/ۖۗ;->᩶۫ۗ:I

    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    const-string v3, "\u06da\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x297

    const v5, 0x7db9df33

    xor-int/2addr v4, v5

    const v5, -0x6926357

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x72fd

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    goto/16 :goto_5

    .line 68
    :sswitch_0
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-eqz v3, :cond_9

    goto :goto_1

    .line 33
    :sswitch_1
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v3

    if-gtz v3, :cond_0

    goto/16 :goto_6

    :cond_0
    :goto_1
    const-string v3, "\u1a77\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x12db

    const v5, -0x5f276ff3

    xor-int/2addr v4, v5

    const v5, 0x63eaffdb

    goto :goto_0

    .line 54
    :sswitch_2
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_d

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    const/4 v0, 0x0

    return v0

    :sswitch_4
    const/4 v0, 0x0

    return v0

    .line 98
    :sswitch_5
    iget-boolean v3, p0, Ll/ۜۜ᩺;->ᩴۙ:Z

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u05a1\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2e2f

    const v5, -0x513c9673

    xor-int/2addr v4, v5

    const v5, 0x2f959901

    goto :goto_0

    :sswitch_6
    const/4 v0, 0x1

    return v0

    :sswitch_7
    invoke-direct {p0}, Ll/ۜۜ᩺;->᩹()Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "\u05ab\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xc0d

    const v5, 0x2a3d96cf

    xor-int/2addr v4, v5

    const v5, -0xe260e11

    goto/16 :goto_0

    :cond_2
    :goto_2
    const-string v3, "\u1a76\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5b7d

    const v5, -0x5b2963ca

    xor-int/2addr v4, v5

    const v5, -0x69c49791

    goto/16 :goto_0

    .line 85
    :sswitch_8
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    const-string v3, "\u06e8\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x591

    const v5, -0x4b282725

    xor-int/2addr v4, v5

    const v5, 0x53dc5cf7

    goto/16 :goto_0

    .line 89
    :sswitch_9
    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v3, :cond_4

    :goto_3
    const-string v3, "\u06dc\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5b7b

    const v5, 0x7820c6d1

    xor-int/2addr v4, v5

    const v5, -0x155d133a

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e7\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x97f

    const v5, -0x34821f58    # -1.663812E7f

    xor-int/2addr v4, v5

    const v5, -0x669c9936

    goto/16 :goto_0

    .line 58
    :sswitch_a
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v3, "\u06da\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x695f

    const v5, -0x620381e8

    xor-int/2addr v4, v5

    const v5, -0x73c2520

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    const-string v3, "\u06e7\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x58e1

    const v5, -0x53d3b473

    xor-int/2addr v4, v5

    const v5, 0x5b221b98

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v3, "\u06d6\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x77d

    const v5, 0x7de20d84

    xor-int/2addr v4, v5

    const v5, -0x78d529d9

    goto/16 :goto_0

    .line 80
    :sswitch_d
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v3, "\u06e7\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xf13

    const v5, -0x4a3e2a3

    xor-int/2addr v4, v5

    const v5, -0x708594be

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06df\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x641

    const v5, -0x1a5f1d1f

    xor-int/2addr v4, v5

    const v5, 0x37121583

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06da\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x194f

    const v5, -0x3a58f4ea

    xor-int/2addr v4, v5

    const v5, -0x34e2a172    # -1.0313358E7f

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_5

    :cond_b
    const-string v3, "\u05a8\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x43ad

    const v5, 0x37843513

    xor-int/2addr v4, v5

    const v5, -0x2797174d

    goto/16 :goto_0

    .line 35
    :sswitch_10
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_c

    :goto_5
    const-string v3, "\u06d8\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7d71

    const v5, -0x1374e444

    xor-int/2addr v4, v5

    const v5, -0x5ad9726a

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073f\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6eb

    const v5, 0x63e61f4a

    xor-int/2addr v4, v5

    const v5, 0x32bf804b

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v3

    if-gtz v3, :cond_e

    :cond_d
    :goto_6
    const-string v3, "\u073d\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3c89

    const v5, 0x6e5d42b3

    xor-int/2addr v4, v5

    const v5, -0x6a2ddf0a

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u1a7b\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x442f

    const v5, -0x249f6b53

    xor-int/2addr v4, v5

    const v5, -0x1c589d59

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7911f793 -> :sswitch_e
        -0x74bba64e -> :sswitch_0
        -0x72b5a206 -> :sswitch_c
        -0x712b9c3a -> :sswitch_a
        -0x6a75411b -> :sswitch_2
        -0x66193529 -> :sswitch_5
        -0x5c751f97 -> :sswitch_2
        -0x5046cd25 -> :sswitch_3
        -0x45fe494d -> :sswitch_1
        -0x4139e5ad -> :sswitch_e
        -0x3de26427 -> :sswitch_d
        -0x327b7afd -> :sswitch_7
        -0x18336019 -> :sswitch_9
        -0x1604c25e -> :sswitch_4
        -0x140cd659 -> :sswitch_1
        0x142ca4d -> :sswitch_6
        0xe1951f1 -> :sswitch_8
        0x20a9f90d -> :sswitch_8
        0x267d63a3 -> :sswitch_4
        0x2ac152b6 -> :sswitch_0
        0x367eb8d6 -> :sswitch_f
        0x38a05013 -> :sswitch_9
        0x46ce821c -> :sswitch_6
        0x499bbaab -> :sswitch_7
        0x4c00ab39 -> :sswitch_11
        0x58c2ae8e -> :sswitch_c
        0x5c676950 -> :sswitch_d
        0x5fd532f7 -> :sswitch_b
        0x65450606 -> :sswitch_3
        0x6c4c1d40 -> :sswitch_f
        0x6f4bc830 -> :sswitch_b
        0x7083649d -> :sswitch_5
        0x74dec160 -> :sswitch_10
        0x762686e5 -> :sswitch_10
        0x7a7127d3 -> :sswitch_11
        0x7cbe7f61 -> :sswitch_a
    .end sparse-switch
.end method

.method public final ܰ()Z
    .locals 1

    .line 102
    iget-boolean v0, p0, Ll/ۜۜ᩺;->ᩴۙ:Z

    return v0
.end method

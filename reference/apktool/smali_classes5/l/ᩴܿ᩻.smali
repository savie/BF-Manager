.class public Ll/ᩴܿ᩻;
.super Landroid/widget/ListView;
.source "J5HS"


# static fields
.field private static final ᩴ᩻ۗ:[S


# instance fields
.field public ֡:F

.field public ֨:I

.field public ֫ۙ:J

.field public ۖ:F

.field public ۙۙ:Ll/᩸᩷ܺ;

.field public ۚۙ:Z

.field public ۜ:Z

.field public ۟:F

.field public ۠:I

.field public ۡ:F

.field public ۢ:I

.field public final ۤۙ:Ll/ۤܿ᩻;

.field public ۧۙ:Z

.field public ۫ۙ:Landroid/widget/AbsListView$OnScrollListener;

.field public ۬:J

.field public ܰ:Landroid/view/View$OnTouchListener;

.field public ܳۙ:Landroid/widget/AdapterView$OnItemLongClickListener;

.field public ܶۙ:Ljava/util/ArrayList;

.field public ܺۙ:I

.field public ܽۙ:F

.field public ܿ:J

.field public ᩳ:Ll/۟᩷ۙ;

.field public ᩴۙ:Z

.field public final ᩶:Landroid/database/DataSetObserver;

.field public ᩷ۙ:Z

.field public ᩸ۙ:Z

.field public ᩹ۙ:Z

.field public ᩻ۙ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    const/16 v0, 0x2e

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴܿ᩻;->ᩴ᩻ۗ:[S

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, -0x355c06a3    # -5373102.5f

    sget v9, Ll/֨ܿ;->᩹᩻۟:I

    sget v10, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v11, "\u05a1\u1a75"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x6829

    const v13, -0x3eb132dc

    xor-int/2addr v12, v13

    const v13, -0x4d814973

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, -0x3f1

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget-boolean v11, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v11, :cond_10

    goto/16 :goto_5

    .line 16
    :sswitch_0
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget v11, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v11, :cond_e

    goto/16 :goto_5

    .line 0
    :sswitch_1
    :try_start_0
    sget-object v11, Ll/ᩴܿ᩻;->ᩴ᩻ۗ:[S

    const/4 v12, 0x1

    const/16 v13, 0x1e

    invoke-static {v11, v12, v13, v7}, Ll/᩶;->ᩳܿܰ([SIII)Ljava/lang/String;

    move-result-object v11

    .line 44
    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 45
    sput-boolean v0, Ll/ܽܽܺ;->ۙ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v11, "\u06e8\u06e8"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x19

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x2c11

    const v13, 0x1c9bcc1d

    xor-int/2addr v12, v13

    const v13, 0x3a115b42

    goto :goto_0

    .line 19
    :sswitch_2
    sget-object v1, Ll/ᩴܿ᩻;->ᩴ᩻ۗ:[S

    const/4 v2, 0x0

    .line 46
    sget v11, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v11, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v11, "\u06df\u06e7"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x67

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x36cb

    const v13, 0x713e22bb

    xor-int/2addr v12, v13

    const v13, 0x1646fa26

    goto :goto_0

    :sswitch_3
    mul-int v11, v3, v6

    sub-int/2addr v11, v5

    if-gtz v11, :cond_1

    const-string v11, "\u06d6\u0730"

    .line 45
    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x381b

    const v13, -0x229439fd

    xor-int/2addr v12, v13

    const v13, -0x6f507b6d

    goto :goto_0

    :cond_1
    const-string v11, "\u06e8\u05a1"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x6a51

    const v13, 0x5c3352a6

    xor-int/2addr v12, v13

    const v13, -0x34edfce4    # -9569052.0f

    goto/16 :goto_0

    .line 28
    :sswitch_4
    sget-boolean v11, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v11, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v11, "\u06e8\u073a"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x11

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x3f83

    const v13, -0x5ba837b5

    xor-int/2addr v12, v13

    const v13, 0x557a797

    goto/16 :goto_0

    :sswitch_5
    const/16 v7, 0x5c4f

    goto/16 :goto_1

    .line 16
    :sswitch_6
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    goto/16 :goto_5

    :sswitch_7
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v11

    if-nez v11, :cond_6

    goto/16 :goto_6

    .line 36
    :sswitch_8
    sget v11, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v11, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v11, "\u06d7\u073f"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x2d7

    const v13, 0x217ac8c9

    xor-int/2addr v12, v13

    const v13, 0x4635cabc

    goto/16 :goto_0

    :sswitch_9
    const/4 v0, 0x1

    const-string v11, "\u073d\u073a"

    .line 45
    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x2451

    const v13, 0xe4ac13d

    xor-int/2addr v12, v13

    const v13, -0x6e513815

    goto/16 :goto_0

    .line 19
    :sswitch_a
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v11

    if-gtz v11, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v11, "\u1a79\u06ec"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x5d

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x5673

    const v13, -0x10c3b588

    xor-int/2addr v12, v13

    const v13, -0x6b9b4adb

    goto/16 :goto_0

    .line 0
    :sswitch_b
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v11

    if-nez v11, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v11, "\u06df\u1a73"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x6c3d

    const v13, 0x37c6395d

    xor-int/2addr v12, v13

    const v13, 0xea608fd

    goto/16 :goto_0

    :sswitch_c
    mul-int v5, v4, v4

    const/16 v6, 0x4c8c

    .line 45
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v11

    if-nez v11, :cond_7

    :cond_6
    const-string v11, "\u06e1\u1a77"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x61d3

    const v13, -0x6c774ef8

    xor-int/2addr v12, v13

    const v13, -0xfc4255b

    goto/16 :goto_0

    :cond_7
    const-string v11, "\u06e1\u0736"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x77

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x1475

    const v13, 0x3c004912

    xor-int/2addr v12, v13

    const v13, -0x51885a0e

    goto/16 :goto_0

    :sswitch_d
    const v7, 0xa56d

    :goto_1
    const-string v11, "\u0730\u06da"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x5ac5

    const v13, 0xd0ea207

    xor-int/2addr v12, v13

    const v13, -0x3849baf

    goto/16 :goto_0

    .line 28
    :sswitch_e
    sget v11, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v11, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v11, "\u06d8\u06da"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x31b

    const v13, -0xcb6d986

    xor-int/2addr v12, v13

    const v13, -0x70caf222

    goto/16 :goto_0

    .line 45
    :sswitch_f
    :try_start_1
    sget-object v11, Ll/ᩴܿ᩻;->ᩴ᩻ۗ:[S

    const/16 v12, 0x1f

    const/16 v13, 0xf

    invoke-static {v11, v12, v13, v7}, Ll/ۗ֨;->ᩴᩴܽ([SIII)Ljava/lang/String;

    move-result-object v11

    .line 49
    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    sput-boolean v0, Ll/ܽܽܺ;->ۙ:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const-string v11, "\u1a78\u073d"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x3a9d

    const v13, 0x3cb257cd

    xor-int/2addr v12, v13

    const v13, 0x4f458929    # 3.3141005E9f

    goto/16 :goto_0

    .line 45
    :sswitch_10
    aget-short v3, v1, v2

    .line 40
    sget v11, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v11, :cond_9

    goto/16 :goto_2

    :cond_9
    const-string v11, "\u1a79\u1a7b"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x6be1

    const v13, -0x7d07693

    xor-int/2addr v12, v13

    const v13, 0x51fa4930

    goto/16 :goto_0

    :sswitch_11
    return-void

    :sswitch_12
    add-int/lit16 v4, v3, 0x1323

    .line 45
    sget v11, Ll/֫֡;->֫ۙۖ:I

    if-gtz v11, :cond_a

    const-string v11, "\u06d6\u06e1"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x38ab

    const v13, -0x15c234a1

    xor-int/2addr v12, v13

    const v13, 0x51692734

    goto/16 :goto_0

    :cond_a
    const-string v11, "\u06e7\u06d8"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x3987

    const v13, -0x6d6c2ae

    xor-int/2addr v12, v13

    const v13, -0x45d257a8

    goto/16 :goto_0

    .line 23
    :sswitch_13
    sget v11, Ll/ۖ;->ܿۚ֡:I

    if-ltz v11, :cond_b

    goto :goto_4

    :cond_b
    const-string v11, "\u06e2\u1a78"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x2ea9

    const v13, -0x12c22f5c

    xor-int/2addr v12, v13

    const v13, 0x5ee50037

    goto/16 :goto_0

    .line 16
    :sswitch_14
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v11

    if-gtz v11, :cond_c

    goto/16 :goto_6

    .line 13
    :sswitch_15
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 23
    :sswitch_16
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v11

    if-eqz v11, :cond_d

    :cond_c
    :goto_2
    const-string v11, "\u1a77\u05a8"

    .line 28
    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x484b

    const v13, 0x62796602

    xor-int/2addr v12, v13

    const v13, -0xb5d6980

    goto/16 :goto_0

    :cond_d
    const-string v11, "\u1a74\u1a77"

    .line 23
    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x69

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x6237

    const v13, 0x29a9087b

    xor-int/2addr v12, v13

    const v13, 0x6b6e47ad

    goto/16 :goto_0

    .line 0
    :sswitch_17
    sget v11, Ll/֨ܿ;->᩹᩻۟:I

    if-gez v11, :cond_f

    :cond_e
    :goto_3
    const-string v11, "\u06e0\u06ec"

    .line 19
    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x2f5

    const v13, 0x7a07d288

    xor-int/2addr v12, v13

    const v13, 0x59bb13f6

    goto/16 :goto_0

    :cond_f
    :goto_4
    const-string v11, "\u1a76\u1a77"

    .line 46
    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x5

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x291

    const v13, -0x144250f2

    xor-int/2addr v12, v13

    const v13, -0x18a5f606

    goto/16 :goto_0

    :goto_5
    const-string v11, "\u06da\u06e0"

    .line 36
    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x5109

    const v13, -0x31b8bccc

    xor-int/2addr v12, v13

    const v13, 0x55221bbc    # 1.114E13f

    goto/16 :goto_0

    :cond_10
    :goto_6
    const-string v11, "\u06e2\u06d6"

    .line 28
    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, -0x55

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x29f

    const v13, -0x62890a9c

    xor-int/2addr v12, v13

    const v13, 0x2f3d8973

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x613911e7 -> :sswitch_17
        -0x584fcba5 -> :sswitch_16
        -0x56f164a2 -> :sswitch_15
        -0x51227051 -> :sswitch_14
        -0x483595d3 -> :sswitch_13
        -0x45dfaa48 -> :sswitch_12
        -0x3e66f07e -> :sswitch_12
        -0x2fa80d85 -> :sswitch_11
        -0x2446405d -> :sswitch_10
        -0x23d7419f -> :sswitch_f
        -0x20d94484 -> :sswitch_11
        -0x1f523171 -> :sswitch_10
        -0x1e7b8662 -> :sswitch_e
        -0x1b958966 -> :sswitch_d
        -0x1b8ff123 -> :sswitch_c
        -0x18640f45 -> :sswitch_b
        -0x16be183f -> :sswitch_a
        -0x11ee9e97 -> :sswitch_9
        -0xe99a085 -> :sswitch_8
        -0xc45e07f -> :sswitch_15
        -0x80edd7c -> :sswitch_b
        -0x782cf66 -> :sswitch_8
        -0xdcef7f -> :sswitch_7
        0x3b0d432 -> :sswitch_6
        0xe5cff1a -> :sswitch_7
        0x116f8a03 -> :sswitch_a
        0x154f832e -> :sswitch_e
        0x1d41a961 -> :sswitch_5
        0x1f55df4c -> :sswitch_16
        0x1f9261cc -> :sswitch_4
        0x20fe0682 -> :sswitch_3
        0x221e77e9 -> :sswitch_2
        0x2a4d7d19 -> :sswitch_c
        0x363780f2 -> :sswitch_d
        0x36aa6d6f -> :sswitch_14
        0x3736ff0d -> :sswitch_1
        0x39cb572a -> :sswitch_0
        0x3f587907 -> :sswitch_6
        0x523973ea -> :sswitch_0
        0x53d15866 -> :sswitch_13
        0x5b72d135 -> :sswitch_5
        0x6c1b886b -> :sswitch_9
        0x6f03eade -> :sswitch_4
        0x72000066 -> :sswitch_1
        0x787419a7 -> :sswitch_17
        0x7aa9d03a -> :sswitch_2
        0x7edad7f0 -> :sswitch_3
        0x7f123341 -> :sswitch_f
    .end sparse-switch

    :array_0
    .array-data 2
        0x25e2s
        -0x5af2s
        -0x5afes
        -0x5b00s
        -0x5abds
        -0x5af2s
        -0x5af4s
        -0x5b00s
        -0x5af8s
        -0x5affs
        -0x5abds
        -0x5ae1s
        -0x5ae8s
        -0x5afds
        -0x5ae7s
        -0x5afcs
        -0x5b00s
        -0x5af8s
        -0x5abds
        -0x5adds
        -0x5af4s
        -0x5ae7s
        -0x5afcs
        -0x5ae5s
        -0x5af8s
        -0x5ad8s
        -0x5afds
        -0x5af6s
        -0x5afcs
        -0x5afds
        -0x5af8s
        -0x5b00s
        -0x5ae7s
        -0x5aebs
        -0x5abds
        -0x5adds
        -0x5af4s
        -0x5ae7s
        -0x5afcs
        -0x5ae5s
        -0x5af8s
        -0x5ad6s
        -0x5ae8s
        -0x5af4s
        -0x5ae1s
        -0x5af7s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const v0, 0x3f94eb97

    sget v1, Ll/ۖ᩹;->۫ܽۗ:I

    sget v2, Ll/֡᩻;->᩷ۧ᩺:I

    const/4 v3, 0x0

    .line 87
    invoke-direct {p0, p1, p2, v3}, Ll/ᩴܿ᩻;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, "\u05ab\u1a79"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x51

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x1bf1

    const v3, -0x32b9135c

    xor-int/2addr p2, v3

    const v3, -0xdc7aa52

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x5abf

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 85
    sget p1, Ll/ۖۜ;->֨ۡۗ:I

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u073f\u073f"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x5

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x6547

    const v3, 0x47050b6f

    xor-int/2addr p2, v3

    const v3, -0x4d8bcd84

    goto :goto_0

    .line 59
    :sswitch_0
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "\u1a7a\u06e1"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x257d

    const v3, 0x24b43e41

    xor-int/2addr p2, v3

    const v3, -0x45a6807e

    goto :goto_0

    .line 18
    :sswitch_1
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget p1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz p1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string p1, "\u06e1\u1a73"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1099

    const v3, -0x3408891b    # -3.2435658E7f

    xor-int/2addr p2, v3

    const v3, 0x38c9c8e1

    goto :goto_0

    .line 13
    :sswitch_2
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    :goto_3
    const-string p1, "\u1a79\u06e7"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x79db

    const v3, -0x2d1f292d

    xor-int/2addr p2, v3

    const v3, -0x7e700b2a

    goto :goto_0

    .line 29
    :sswitch_3
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 75
    :sswitch_5
    sget p1, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz p1, :cond_3

    const-string p1, "\u06df\u1a74"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2a83

    const v3, -0x504d44c

    xor-int/2addr p2, v3

    const v3, -0xb9b99a0

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a76\u1a78"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x74a7

    const v3, -0xe47af9a

    xor-int/2addr p2, v3

    const v3, 0x4caef653    # 9.1730584E7f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x5c1198ed -> :sswitch_0
        -0x5a291d70 -> :sswitch_2
        -0x52603057 -> :sswitch_5
        -0x4b20c054 -> :sswitch_4
        -0x4866b7d2 -> :sswitch_3
        -0x373bc374 -> :sswitch_1
        -0x2e4d82ae -> :sswitch_4
        -0xced480f -> :sswitch_3
        0x7235c6a -> :sswitch_0
        0x3c4771d4 -> :sswitch_1
        0x49f1d6e7 -> :sswitch_5
        0x5759976d -> :sswitch_2
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

    const v8, -0x6863aab8

    sget v9, Ll/ۗۖ;->ۙ᩶֨:I

    sget v10, Ll/ۧ;->ۨۗܰ:I

    .line 112
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p2, "\u1a7b\u06e1"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    mul-int/lit8 p2, p2, 0x1d

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x1ff1

    const v11, 0x475e53eb

    xor-int/2addr p3, v11

    const v11, -0x43e0fb9b

    :goto_0
    xor-int/2addr p2, v11

    xor-int/2addr v8, v10

    mul-int/lit16 v8, v8, 0x376d

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr p3, v8

    xor-int v8, p2, p3

    sparse-switch v8, :sswitch_data_0

    const/4 v2, 0x0

    .line 79
    iput-boolean v2, p0, Ll/ᩴܿ᩻;->ۜ:Z

    .line 206
    sget p2, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz p2, :cond_b

    goto/16 :goto_6

    :sswitch_0
    sget p2, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz p2, :cond_e

    goto/16 :goto_2

    .line 233
    :sswitch_1
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result p2

    if-lez p2, :cond_4

    goto :goto_1

    .line 89
    :sswitch_2
    sget p2, Ll/֫֨;->᩶ܺۡ:I

    if-gtz p2, :cond_0

    goto/16 :goto_7

    :cond_0
    :goto_1
    const-string p2, "\u06d6\u06e0"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x7351

    const v11, -0xb9fae54

    xor-int/2addr p3, v11

    const v11, -0x1e415be7

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    goto/16 :goto_7

    :sswitch_4
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 149
    :sswitch_5
    new-instance p2, Ll/᩸ܿ᩻;

    invoke-direct {p2, p0}, Ll/᩸ܿ᩻;-><init>(Ll/ᩴܿ᩻;)V

    invoke-virtual {p0, p2}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_3

    .line 155
    :sswitch_6
    iput v7, p0, Ll/ᩴܿ᩻;->ۡ:F

    .line 158
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Ll/ᩴܿ᩻;->᩻ۙ:I

    return-void

    :sswitch_7
    mul-float p2, v5, v6

    .line 154
    iput p2, p0, Ll/ᩴܿ᩻;->ۖ:F

    const/high16 p2, 0x42400000    # 48.0f

    mul-float v7, v5, p2

    sget p2, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz p2, :cond_1

    goto :goto_2

    :cond_1
    const-string p2, "\u0736\u06ec"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    mul-int/lit8 p2, p2, 0x45

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x5473

    const v11, 0x2203a53

    xor-int/2addr p3, v11

    const v11, 0x5f49f3df

    goto/16 :goto_0

    :sswitch_8
    const p2, 0x39777777

    .line 153
    iput p2, p0, Ll/ᩴܿ᩻;->۠:I

    const/high16 v6, 0x41000000    # 8.0f

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result p2

    if-eqz p2, :cond_2

    goto/16 :goto_8

    :cond_2
    const-string p2, "\u06d8\u1a7b"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x71c3

    const v11, 0x5b95d746

    xor-int/2addr p3, v11

    const v11, -0x58c7fd91

    goto/16 :goto_0

    :sswitch_9
    const p2, -0x22888889

    .line 152
    iput p2, p0, Ll/ᩴܿ᩻;->֨:I

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result p2

    if-gtz p2, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string p2, "\u1a7b\u06eb"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x2af5

    const v11, -0x3c5c4a32

    xor-int/2addr p3, v11

    const v11, 0x56cbca05

    goto/16 :goto_0

    .line 150
    :sswitch_a
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    .line 151
    iget v5, p2, Landroid/util/DisplayMetrics;->density:F

    sget p2, Ll/֫֡;->֫ۙۖ:I

    if-gtz p2, :cond_5

    :cond_4
    :goto_2
    const-string p2, "\u06e0\u1a77"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v9, p2

    mul-int/lit8 p2, p2, -0x55

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x12d3

    const v11, 0x651c5779

    xor-int/2addr p3, v11

    const v11, 0x621ec36

    goto/16 :goto_0

    :cond_5
    const-string p2, "\u1a76\u06e2"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v10, p2

    mul-int/lit8 p2, p2, -0x35

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x7075

    const v11, -0x270c5403

    xor-int/2addr p3, v11

    const v11, -0x3049ce11

    goto/16 :goto_0

    .line 208
    :sswitch_b
    iput-boolean v4, p0, Ll/ᩴܿ᩻;->᩸ۙ:Z

    goto :goto_4

    .line 147
    :sswitch_c
    invoke-super {p0, v2}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V

    .line 148
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-nez p2, :cond_6

    const-string p2, "\u06d6\u1a7a"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x2f9

    const v11, -0x7810c19a

    xor-int/2addr p3, v11

    const v11, 0x2691662b

    goto/16 :goto_0

    :cond_6
    :goto_3
    const-string p2, "\u06ec\u06e7"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x7c87

    const v11, 0x6bd017a5

    xor-int/2addr p3, v11

    const v11, 0x37c89a40

    goto/16 :goto_0

    .line 116
    :sswitch_d
    invoke-virtual {p0, v2}, Landroid/widget/ListView;->setDefaultFocusHighlightEnabled(Z)V

    goto :goto_5

    .line 118
    :sswitch_e
    new-instance p2, Ll/ۙܿ᩻;

    invoke-direct {p2, p0}, Ll/ۙܿ᩻;-><init>(Ll/ᩴܿ᩻;)V

    invoke-super {p0, p2}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 144
    invoke-super {p0}, Landroid/widget/ListView;->isFastScrollEnabled()Z

    move-result p2

    if-eqz p2, :cond_7

    const-string p2, "\u05a8\u1a7a"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x5913

    const v11, -0x798c70ae

    xor-int/2addr p3, v11

    const v11, 0x56e697f3

    goto/16 :goto_0

    :cond_7
    :goto_4
    const-string p2, "\u0730\u06e8"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    mul-int/lit8 p2, p2, -0x51

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x7f15

    const v11, 0x5357d464

    xor-int/2addr p3, v11

    const v11, -0xe1f26af

    goto/16 :goto_0

    .line 235
    :sswitch_f
    iput v4, p0, Ll/ᩴܿ᩻;->ܺۙ:I

    .line 113
    invoke-virtual {p0, v2}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 114
    invoke-virtual {p0, v2}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 115
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    if-lt p2, p3, :cond_8

    const-string p2, "\u06d9\u06ec"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x17ed

    const v11, 0x791888cd

    xor-int/2addr p3, v11

    const v11, -0x4ed5e9d1

    goto/16 :goto_0

    :cond_8
    :goto_5
    const-string p2, "\u0736\u1a79"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v9

    mul-int/lit8 p2, p2, -0x4f

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x6d7f

    const v11, -0x5e4e8960

    xor-int/2addr p3, v11

    const v11, 0x2c905211

    goto/16 :goto_0

    .line 211
    :sswitch_10
    iput-object v3, p0, Ll/ᩴܿ᩻;->᩶:Landroid/database/DataSetObserver;

    const/4 v4, 0x1

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result p2

    if-nez p2, :cond_9

    goto :goto_6

    :cond_9
    const-string p2, "\u06e8\u06e1"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x4e4d

    const v11, -0x15f9d7e3

    xor-int/2addr p3, v11

    const v11, -0x70e04465

    goto/16 :goto_0

    .line 161
    :sswitch_11
    iput-wide v0, p0, Ll/ᩴܿ᩻;->ܿ:J

    .line 211
    new-instance v3, Ll/᩷ܿ᩻;

    invoke-direct {v3, p0}, Ll/᩷ܿ᩻;-><init>(Ll/ᩴܿ᩻;)V

    sget p2, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz p2, :cond_a

    goto :goto_6

    :cond_a
    const-string p2, "\u06e1\u06d9"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x5e97

    const v11, -0x45b83250

    xor-int/2addr p3, v11

    const v11, 0x3817d3ab

    goto/16 :goto_0

    :cond_b
    const-string p2, "\u1a77\u1a73"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0xd13

    const v11, 0x66c0c97c

    xor-int/2addr p3, v11

    const v11, -0x2bfcd4c4

    goto/16 :goto_0

    .line 76
    :sswitch_12
    new-instance p2, Ll/ۤܿ᩻;

    invoke-direct {p2, p0}, Ll/ۤܿ᩻;-><init>(Ll/ᩴܿ᩻;)V

    iput-object p2, p0, Ll/ᩴܿ᩻;->ۤۙ:Ll/ۤܿ᩻;

    .line 172
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result p2

    if-eqz p2, :cond_c

    :goto_6
    const-string p2, "\u06da\u06dc"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v9

    mul-int/lit8 p2, p2, -0x13

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x2db1

    const v11, 0x65de51e3

    xor-int/2addr p3, v11

    const v11, -0x6cf7d781

    goto/16 :goto_0

    :cond_c
    const-string p2, "\u06eb\u073f"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x3cdb

    const v11, -0x562bc393

    xor-int/2addr p3, v11

    const v11, 0xd22364d

    goto/16 :goto_0

    :sswitch_13
    const-wide/16 v0, 0x0

    .line 69
    iput-wide v0, p0, Ll/ᩴܿ᩻;->֫ۙ:J

    .line 73
    new-instance p2, Ll/᩸᩷ܺ;

    const/4 p3, 0x3

    .line 45
    sget v11, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v11, :cond_d

    :goto_7
    const-string p2, "\u1a75\u073f"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x52a5

    const v11, 0x4b58fb29    # 1.4220073E7f

    xor-int/2addr p3, v11

    const v11, 0x602a16fe

    goto/16 :goto_0

    .line 20
    :cond_d
    invoke-direct {p2, p3}, Ll/᩸᩷ܺ;-><init>(I)V

    .line 73
    iput-object p2, p0, Ll/ᩴܿ᩻;->ۙۙ:Ll/᩸᩷ܺ;

    .line 229
    sget-boolean p2, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez p2, :cond_f

    :cond_e
    :goto_8
    const-string p2, "\u06e7\u06e8"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v10

    mul-int/lit8 p2, p2, -0xd

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x4f73

    const v11, 0x22327a99

    xor-int/2addr p3, v11

    const v11, 0x680846c8

    goto/16 :goto_0

    :cond_f
    const-string p2, "\u06da\u1a7a"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    mul-int/lit8 p2, p2, -0x49

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x67ad

    const v11, -0x7072fd8a

    xor-int/2addr p3, v11

    const v11, -0x3ba8a6ce

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c8a40ab -> :sswitch_5
        -0x79781dd9 -> :sswitch_b
        -0x7189a9e6 -> :sswitch_13
        -0x6f4ac658 -> :sswitch_6
        -0x6e97c091 -> :sswitch_6
        -0x6d782458 -> :sswitch_e
        -0x6a920bc6 -> :sswitch_f
        -0x5c827bc7 -> :sswitch_c
        -0x551c4d6d -> :sswitch_2
        -0x4ed35175 -> :sswitch_8
        -0x4c7595b7 -> :sswitch_2
        -0x4bd9e4cd -> :sswitch_7
        -0x4625a78a -> :sswitch_12
        -0x42a21fdb -> :sswitch_13
        -0x428a314d -> :sswitch_3
        -0x3bfb928b -> :sswitch_b
        -0x26e66162 -> :sswitch_12
        -0x1d8f9479 -> :sswitch_1
        -0x1d30f5a9 -> :sswitch_0
        -0xd34e140 -> :sswitch_4
        -0x1b3bcd -> :sswitch_c
        0x90c23c2 -> :sswitch_11
        0xe9a0b53 -> :sswitch_8
        0xfd67a81 -> :sswitch_4
        0x1020c15f -> :sswitch_10
        0x17a2b908 -> :sswitch_0
        0x1dfd5436 -> :sswitch_f
        0x22b7f665 -> :sswitch_e
        0x23c8fe48 -> :sswitch_d
        0x28966b07 -> :sswitch_a
        0x2c63c7c8 -> :sswitch_d
        0x35dadf98 -> :sswitch_7
        0x435e60fc -> :sswitch_9
        0x46e256b4 -> :sswitch_11
        0x5860ae57 -> :sswitch_9
        0x6045f535 -> :sswitch_10
        0x6197e755 -> :sswitch_1
        0x6f9abdbd -> :sswitch_a
        0x735c4d87 -> :sswitch_3
        0x7ec372c9 -> :sswitch_5
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/ᩴܿ᩻;)Ll/ۤܿ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܿ᩻;->ۤۙ:Ll/ۤܿ᩻;

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

    const v6, -0x65fa81be

    sget v7, Ll/ۖ֡;->ۚۛᩳ:I

    sget v8, Ll/ۗ᩺;->֡ۙۜ:I

    const-string v9, "\u06ec\u1a76"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x39

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x2005

    const v11, 0x5de5ebeb

    xor-int/2addr v10, v11

    const v11, -0x31ec2a22

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v8

    mul-int/lit16 v6, v6, 0x7ce7

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    sget v9, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v9, :cond_e

    goto/16 :goto_6

    .line 358
    :sswitch_0
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    sget v9, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v9, :cond_3

    goto/16 :goto_5

    .line 237
    :sswitch_1
    sget-boolean v9, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v9, :cond_8

    goto :goto_1

    .line 389
    :sswitch_2
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    sget v9, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v9, :cond_c

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    :goto_1
    const-string v9, "\u06e1\u06dc"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x2911

    const v11, 0x5f4dbc62

    xor-int/2addr v10, v11

    const v11, 0x24f175bc

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    return-void

    .line 429
    :sswitch_5
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v9

    invoke-interface {v9, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_2

    :sswitch_6
    return-void

    .line 423
    :sswitch_7
    iget v9, p0, Ll/ᩴܿ᩻;->ۢ:I

    invoke-virtual {v3, v2, v9}, Ll/۟᩷ۙ;->ۙ(II)V

    goto/16 :goto_3

    .line 427
    :sswitch_8
    invoke-static {p0}, Ll/֡᩻;->᩻ᩳ۟(Ljava/lang/Object;)V

    .line 428
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v9

    if-eqz v9, :cond_0

    const-string v9, "\u06eb\u073d"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0xf

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x7a81

    const v11, 0x66c45650

    xor-int/2addr v10, v11

    const v11, -0x71061689

    goto :goto_0

    :cond_0
    :goto_2
    const-string v9, "\u06e1\u06d7"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x4d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x4611

    const v11, 0x6f42ba0b

    xor-int/2addr v10, v11

    const v11, -0x7f4819c

    goto/16 :goto_0

    .line 426
    :sswitch_9
    invoke-static {}, Ll/֨ۚ;->ۢ۫᩹()J

    move-result-wide v9

    iput-wide v9, p0, Ll/ᩴܿ᩻;->֫ۙ:J

    .line 361
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v9

    if-gtz v9, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v9, "\u06dc\u1a7b"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3b13

    const v11, 0x5df17e18

    xor-int/2addr v10, v11

    const v11, -0x4c79c8f8

    goto/16 :goto_0

    :sswitch_a
    sub-float v9, v4, v5

    .line 425
    iput v9, p0, Ll/ᩴܿ᩻;->ܽۙ:F

    .line 17
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v9

    if-eqz v9, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v9, "\u1a77\u06d6"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x6b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3193

    const v11, -0x10f7761d

    xor-int/2addr v10, v11

    const v11, -0x101bda7d

    goto/16 :goto_0

    .line 425
    :sswitch_b
    iget v5, p0, Ll/ᩴܿ᩻;->۟:F

    .line 3
    sget v9, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v9, :cond_4

    :cond_3
    const-string v9, "\u06e7\u1a74"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x44c1

    const v11, 0x375ce331

    xor-int/2addr v10, v11

    const v11, 0x3e705620

    goto/16 :goto_0

    :cond_4
    const-string v9, "\u06eb\u0736"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x35b9

    const v11, -0x5b177731

    xor-int/2addr v10, v11

    const v11, -0x42a0e14

    goto/16 :goto_0

    .line 425
    :sswitch_c
    iget-object v4, p0, Ll/ᩴܿ᩻;->ۙۙ:Ll/᩸᩷ܺ;

    iget v4, v4, Ll/᩸᩷ܺ;->ᩴ:F

    .line 388
    sget-boolean v9, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v9, :cond_5

    goto :goto_4

    :cond_5
    const-string v9, "\u06eb\u06e8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x50bf

    const v11, 0x2b55a6a2

    xor-int/2addr v10, v11

    const v11, 0x434c6855

    goto/16 :goto_0

    :sswitch_d
    const/4 v2, 0x1

    .line 421
    iput-boolean v2, p0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    .line 422
    iget-object v3, p0, Ll/ᩴܿ᩻;->ᩳ:Ll/۟᩷ۙ;

    if-eqz v3, :cond_6

    const-string v9, "\u05a8\u1a7a"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1f83

    const v11, 0x27b048cd

    xor-int/2addr v10, v11

    const v11, -0xc132f89

    goto/16 :goto_0

    :cond_6
    :goto_3
    const-string v9, "\u06ec\u1a7a"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x69

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x1877

    const v11, 0x30837546

    xor-int/2addr v10, v11

    const v11, 0x5fa46126

    goto/16 :goto_0

    .line 420
    :sswitch_e
    iput-boolean v1, p0, Ll/ᩴܿ᩻;->ۚۙ:Z

    .line 193
    sget v9, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v9, :cond_7

    goto :goto_4

    :cond_7
    const-string v9, "\u05a1\u0730"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x614d

    const v11, -0x32399030

    xor-int/2addr v10, v11

    const v11, -0x91b7e06

    goto/16 :goto_0

    .line 419
    :sswitch_f
    invoke-direct {p0, p1}, Ll/ᩴܿ᩻;->᩷(Landroid/view/MotionEvent;)V

    const/4 v1, 0x0

    sget v9, Ll/᩺;->۫۬۫:I

    if-gtz v9, :cond_9

    :cond_8
    :goto_4
    const-string v9, "\u1a73\u06df"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x5155

    const v11, -0x6be2994f

    xor-int/2addr v10, v11

    const v11, 0x14b9a802

    goto/16 :goto_0

    :cond_9
    const-string v9, "\u0730\u06e4"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x75

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1ac3

    const v11, 0xf448130

    xor-int/2addr v10, v11

    const v11, -0x713b3462

    goto/16 :goto_0

    .line 418
    :sswitch_10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    iput v9, p0, Ll/ᩴܿ᩻;->۟:F

    .line 241
    sget v9, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v9, :cond_a

    goto :goto_6

    :cond_a
    const-string v9, "\u06e0\u073f"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x1b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x19cd

    const v11, -0x5f105884

    xor-int/2addr v10, v11

    const v11, -0x3334c9bc    # -1.065416E8f

    goto/16 :goto_0

    .line 417
    :sswitch_11
    iput v0, p0, Ll/ᩴܿ᩻;->֡:F

    .line 366
    sget v9, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v9, :cond_b

    goto :goto_5

    :cond_b
    const-string v9, "\u1a73\u06dc"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x63

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0xf27

    const v11, -0xab06138

    xor-int/2addr v10, v11

    const v11, 0x64b28260

    goto/16 :goto_0

    .line 417
    :sswitch_12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 426
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v9

    if-nez v9, :cond_d

    :cond_c
    :goto_5
    const-string v9, "\u1a76\u06ec"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x17

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x39f1

    const v11, -0x3a6fa34b

    xor-int/2addr v10, v11

    const v11, 0x52c9da78

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u1a74\u06e0"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x7b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x110b

    const v11, -0x14d7580b

    xor-int/2addr v10, v11

    const v11, 0x299bc16c

    goto/16 :goto_0

    :goto_6
    const-string v9, "\u06ec\u1a75"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0xe23

    const v11, -0x15ed922f

    xor-int/2addr v10, v11

    const v11, -0xf8e0e1a

    goto/16 :goto_0

    :cond_e
    const-string v9, "\u06eb\u0733"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7303

    const v11, 0xe62a1b7

    xor-int/2addr v10, v11

    const v11, 0x162c0c0c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7465b93a -> :sswitch_f
        -0x6e41c108 -> :sswitch_7
        -0x6ba12f8e -> :sswitch_1
        -0x6678f4e6 -> :sswitch_a
        -0x659b7262 -> :sswitch_5
        -0x63b676d2 -> :sswitch_10
        -0x5f7bf0d5 -> :sswitch_9
        -0x59b8e08f -> :sswitch_c
        -0x549f970c -> :sswitch_1
        -0x4e1e98e2 -> :sswitch_4
        -0x381a9199 -> :sswitch_9
        -0x209412f2 -> :sswitch_b
        -0x197d49b9 -> :sswitch_10
        -0x195150ec -> :sswitch_11
        -0x151acae9 -> :sswitch_8
        0x1fa0292 -> :sswitch_6
        0xe5f176a -> :sswitch_2
        0x1758486d -> :sswitch_4
        0x1bea021e -> :sswitch_0
        0x211e9255 -> :sswitch_b
        0x23c83ad7 -> :sswitch_f
        0x269616ae -> :sswitch_8
        0x26a76852 -> :sswitch_12
        0x2dc08563 -> :sswitch_6
        0x2ddcb8b3 -> :sswitch_d
        0x3699781f -> :sswitch_e
        0x3eb37397 -> :sswitch_7
        0x4c255d76 -> :sswitch_5
        0x4fb138d4 -> :sswitch_3
        0x5ec3abc2 -> :sswitch_a
        0x61e7c9a3 -> :sswitch_e
        0x63f4faec -> :sswitch_d
        0x6561ce56 -> :sswitch_0
        0x747ef6f9 -> :sswitch_12
        0x76c49cd5 -> :sswitch_11
        0x76e8b593 -> :sswitch_2
        0x78211207 -> :sswitch_3
        0x7c0e4329 -> :sswitch_c
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/ᩴܿ᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ᩴܿ᩻;->۬:J

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ᩴܿ᩻;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ᩴܿ᩻;->ۜ:Z

    return-void
.end method

.method public static synthetic ۙ(Ll/ᩴܿ᩻;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x40aea45f

    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    sget v4, Ll/ۘ֡;->᩹ܶ۬:I

    const-string v5, "\u06db\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x47e9

    const v7, -0x55a9726d

    xor-int/2addr v6, v7

    const v7, -0x429c62d0

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x3b7b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 89
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v5

    if-nez v5, :cond_7

    goto/16 :goto_2

    .line 210
    :sswitch_0
    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-lez v5, :cond_b

    goto/16 :goto_3

    .line 560
    :sswitch_1
    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v5, :cond_e

    goto/16 :goto_2

    .line 200
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v5

    if-gtz v5, :cond_8

    goto/16 :goto_2

    .line 159
    :sswitch_3
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    goto/16 :goto_2

    .line 564
    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    const/4 p0, 0x1

    return p0

    .line 757
    :sswitch_6
    invoke-static {v1}, Ll/֨ۚ;->ᩳ᩷ܺ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View$OnTouchListener;

    .line 758
    invoke-interface {v5, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "\u1a7b\u073f"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4c95

    const v7, -0x5e3e02d6

    xor-int/2addr v6, v7

    const v7, -0x1f390b84

    goto :goto_0

    :sswitch_7
    const/4 p0, 0x0

    return p0

    .line 757
    :sswitch_8
    invoke-static {v1}, Ll/ۘ۟;->ᩳۘ᩸(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "\u073a\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5fd7

    const v7, 0x3ffb19e2

    xor-int/2addr v6, v7

    const v7, 0x55882734

    goto :goto_0

    :cond_0
    const-string v5, "\u06da\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5a15

    const v7, 0x691babc4

    xor-int/2addr v6, v7

    const v7, -0x135fd597

    goto/16 :goto_0

    .line 755
    :sswitch_9
    invoke-interface {v0, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_1

    .line 757
    :sswitch_a
    iget-object v1, p0, Ll/ᩴܿ᩻;->ܶۙ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/֨ᩳ;->ۛۙۙ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    const-string v5, "\u1a7b\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x43e1

    const v7, -0x65aca470

    xor-int/2addr v6, v7

    const v7, -0x7f968882

    goto/16 :goto_0

    .line 753
    :sswitch_b
    iget-object v0, p0, Ll/ᩴܿ᩻;->ܰ:Landroid/view/View$OnTouchListener;

    if-eqz v0, :cond_2

    const-string v5, "\u1a79\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x181d

    const v7, 0x2a9e41cb

    xor-int/2addr v6, v7

    const v7, -0x3df872de

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v5, "\u0730\u06dc"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x5d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xb9b

    const v7, -0x135ab45c

    xor-int/2addr v6, v7

    const v7, 0x70af86bc

    goto/16 :goto_0

    .line 745
    :sswitch_c
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "\u05ab\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3c0b

    const v7, 0x6ab7b95a

    xor-int/2addr v6, v7

    const v7, -0x5afb9d

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u05a8\u05a8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x5d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x25d7

    const v7, 0x3333dd36

    xor-int/2addr v6, v7

    const v7, 0x2ede2499

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    const-string v5, "\u06db\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5727

    const v7, 0x1cf677c3

    xor-int/2addr v6, v7

    const v7, 0x3d0d7ef2

    goto/16 :goto_0

    .line 648
    :sswitch_e
    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u06ec\u05a8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x7

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x34b7

    const v7, -0x361de7cc    # -1852166.5f

    xor-int/2addr v6, v7

    const v7, 0xeb11c18

    goto/16 :goto_0

    .line 306
    :sswitch_f
    sget v5, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v5, :cond_6

    goto :goto_2

    :cond_6
    const-string v5, "\u1a79\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x83

    const v7, -0x3e31c73c

    xor-int/2addr v6, v7

    const v7, 0x6e4f8ab8

    goto/16 :goto_0

    :goto_2
    const-string v5, "\u05ab\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x160d

    const v7, 0x7444e26

    xor-int/2addr v6, v7

    const v7, -0x2f4b318a

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u1a75\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x29a3

    const v7, 0x66f5e640

    xor-int/2addr v6, v7

    const v7, 0x257e44bc

    goto/16 :goto_0

    .line 105
    :sswitch_10
    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_9

    :cond_8
    :goto_3
    const-string v5, "\u06e7\u06d7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x3

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x17c1

    const v7, 0x29328527

    xor-int/2addr v6, v7

    const v7, 0x409cc311

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06e1\u06d7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xeb1

    const v7, 0x1ecb97f3

    xor-int/2addr v6, v7

    const v7, -0x10a1f946

    goto/16 :goto_0

    .line 171
    :sswitch_11
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_4

    :cond_a
    const-string v5, "\u06dc\u1a79"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x15f

    const v7, 0x7fcd8c29

    xor-int/2addr v6, v7

    const v7, -0x6d207689

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v5

    if-gtz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u073d\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xa51

    const v7, -0x24ea2c8c

    xor-int/2addr v6, v7

    const v7, 0x5b6d122f

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a74\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x455f

    const v7, 0x1a432860

    xor-int/2addr v6, v7

    const v7, -0xba651a8

    goto/16 :goto_0

    .line 326
    :sswitch_13
    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v5, :cond_d

    goto :goto_5

    :cond_d
    const-string v5, "\u1a7b\u06e1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x33

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4773

    const v7, -0x17bd7a8b

    xor-int/2addr v6, v7

    const v7, -0x701a1325

    goto/16 :goto_0

    .line 672
    :sswitch_14
    sget v5, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v5, :cond_f

    :cond_e
    :goto_5
    const-string v5, "\u06e7\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1949

    const v7, -0x7d46b122

    xor-int/2addr v6, v7

    const v7, -0x49362677

    goto/16 :goto_0

    :cond_f
    const-string v5, "\u06e1\u073f"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7adf

    const v7, -0x316f5118

    xor-int/2addr v6, v7

    const v7, -0x23ff989d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x793344a5 -> :sswitch_2
        -0x72c43656 -> :sswitch_0
        -0x704fb83a -> :sswitch_7
        -0x6e02c6b4 -> :sswitch_d
        -0x6cab7f9e -> :sswitch_a
        -0x5dd5ffb5 -> :sswitch_4
        -0x506c29c1 -> :sswitch_f
        -0x500b5fe5 -> :sswitch_9
        -0x4f653196 -> :sswitch_9
        -0x46b847ce -> :sswitch_6
        -0x46766acf -> :sswitch_11
        -0x429d2812 -> :sswitch_10
        -0x3fd8027f -> :sswitch_b
        -0x3ca4a0d6 -> :sswitch_12
        -0x3c5ab621 -> :sswitch_3
        -0x3ac7627d -> :sswitch_7
        -0x36a26e92 -> :sswitch_5
        -0x36001c80 -> :sswitch_6
        -0x3002f4a0 -> :sswitch_14
        -0x27a56598 -> :sswitch_2
        -0x26ec74db -> :sswitch_14
        -0x1df022d3 -> :sswitch_1
        -0x1aaaa112 -> :sswitch_11
        -0x185d6004 -> :sswitch_13
        -0x15dd29db -> :sswitch_e
        -0xd0bbf71 -> :sswitch_8
        0x3636af8 -> :sswitch_8
        0xce52688 -> :sswitch_f
        0x1495c8c4 -> :sswitch_c
        0x1651bd93 -> :sswitch_5
        0x1b1364cb -> :sswitch_a
        0x26223c3e -> :sswitch_c
        0x29f38dc5 -> :sswitch_1
        0x2ce79c0b -> :sswitch_d
        0x47d49c95 -> :sswitch_e
        0x530d33a1 -> :sswitch_3
        0x5b08cde2 -> :sswitch_12
        0x60b39e1b -> :sswitch_13
        0x6ac12c1c -> :sswitch_4
        0x6c47a5fb -> :sswitch_0
        0x719e0017 -> :sswitch_10
        0x7271cf02 -> :sswitch_b
    .end sparse-switch
.end method

.method public static ۙ(Ll/ᩴܿ᩻;Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 16

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0x7503774d

    sget v6, Ll/ۖ֨;->֨ۨۧ:I

    sget v7, Ll/ۖ;->ܿۚ֡:I

    const-string v8, "\u1a75\u06dc"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x53

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5657

    const v10, -0x11d440a1

    xor-int/2addr v9, v10

    const v10, 0x233b1916

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, 0x574b

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 68
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    sget v8, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v8, :cond_9

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    sget v8, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v8, :cond_3

    goto/16 :goto_5

    .line 303
    :sswitch_1
    sget v8, Ll/֡ۢ;->۟֡᩻:I

    if-lez v8, :cond_d

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    goto/16 :goto_5

    .line 367
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    const/4 v0, 0x0

    return v0

    .line 384
    :sswitch_4
    iput-boolean v3, v0, Ll/ᩴܿ᩻;->ᩴۙ:Z

    .line 385
    iput-boolean v2, v0, Ll/ᩴܿ᩻;->ۚۙ:Z

    goto :goto_1

    :sswitch_5
    return v4

    :sswitch_6
    const/4 v4, 0x1

    goto :goto_2

    :sswitch_7
    if-eqz v4, :cond_0

    const-string v8, "\u0733\u1a79"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x6f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x1ac7

    const v10, 0x30005819

    xor-int/2addr v9, v10

    const v10, -0x28c5f36e

    goto :goto_0

    :cond_0
    :goto_1
    const-string v8, "\u1a79\u06d9"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7697

    const v10, 0x6f60dc12

    xor-int/2addr v9, v10

    const v10, -0x3e34d768

    goto :goto_0

    :sswitch_8
    move-object v10, v1

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move/from16 v13, p3

    move-wide/from16 v14, p4

    .line 590
    invoke-interface/range {v10 .. v15}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    move-result v8

    if-eqz v8, :cond_1

    const-string v8, "\u06e2\u0730"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x73

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0xd17

    const v10, -0x33cea831    # -4.6489404E7f

    xor-int/2addr v9, v10

    const v10, -0x6e299f38

    goto/16 :goto_0

    :sswitch_9
    const/4 v4, 0x0

    :goto_2
    const-string v8, "\u06da\u0733"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x57

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x3c1

    const v10, -0x75f8600c

    xor-int/2addr v9, v10

    const v10, -0x2a36713a

    goto/16 :goto_0

    .line 589
    :sswitch_a
    iget-object v1, v0, Ll/ᩴܿ᩻;->ܳۙ:Landroid/widget/AdapterView$OnItemLongClickListener;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    const-string v8, "\u06e7\u073f"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x19

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x466f

    const v10, 0x5f75c90

    xor-int/2addr v9, v10

    const v10, 0x6843164c

    goto/16 :goto_0

    :cond_1
    const-string v8, "\u05a8\u073d"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x49

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x285d

    const v10, 0x761d923a

    xor-int/2addr v9, v10

    const v10, -0x54f84a46

    goto/16 :goto_0

    .line 240
    :sswitch_b
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v8

    if-ltz v8, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v8, "\u1a7a\u073d"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6905

    const v10, 0x4e22e45e    # 6.832188E8f

    xor-int/2addr v9, v10

    const v10, -0x580791a3

    goto/16 :goto_0

    .line 288
    :sswitch_c
    sget v8, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v8, :cond_4

    :cond_3
    :goto_3
    const-string v8, "\u06d7\u05a1"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x7b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x7039

    const v10, -0x1d0bc4e3

    xor-int/2addr v9, v10

    const v10, 0x22174d8b

    goto/16 :goto_0

    :cond_4
    const-string v8, "\u06eb\u06d6"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x5b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x79db

    const v10, 0x35741eb8

    xor-int/2addr v9, v10

    const v10, -0x291443c0

    goto/16 :goto_0

    :sswitch_d
    sget v8, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v8, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v8, "\u05a8\u06df"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0xe2b

    const v10, -0x3d7ea28f

    xor-int/2addr v9, v10

    const v10, 0x447a3e1a    # 1000.97034f

    goto/16 :goto_0

    .line 4
    :sswitch_e
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v8

    if-nez v8, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v8, "\u06da\u1a74"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x57

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2721

    const v10, -0x41d14618

    xor-int/2addr v9, v10

    const v10, -0x20932bc

    goto/16 :goto_0

    .line 106
    :sswitch_f
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_4

    :cond_7
    const-string v8, "\u1a7b\u1a75"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5f15

    const v10, -0x65f89aa4    # -2.7999223E-23f

    xor-int/2addr v9, v10

    const v10, -0x1b4b3e2e

    goto/16 :goto_0

    .line 427
    :sswitch_10
    sget v8, Ll/ۧ;->ۨۗܰ:I

    if-ltz v8, :cond_8

    :goto_4
    const-string v8, "\u1a78\u1a76"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3d7d

    const v10, -0x426a7146

    xor-int/2addr v9, v10

    const v10, 0x5b0e8cee

    goto/16 :goto_0

    :cond_8
    const-string v8, "\u06db\u06ec"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x6b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0xc7d

    const v10, 0x33db0e29

    xor-int/2addr v9, v10

    const v10, 0x6c72725d

    goto/16 :goto_0

    .line 128
    :sswitch_11
    sget v8, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v8, :cond_a

    :cond_9
    const-string v8, "\u06d7\u05ab"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x15

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6a9

    const v10, 0x39813336

    xor-int/2addr v9, v10

    const v10, 0x6692ab

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u1a73\u06df"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x7341

    const v10, -0x15c34e23

    xor-int/2addr v9, v10

    const v10, 0xf8105aa

    goto/16 :goto_0

    .line 12
    :sswitch_12
    sget v8, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v8, :cond_b

    goto :goto_6

    :cond_b
    const-string v8, "\u1a79\u1a77"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x655

    const v10, -0x62a3eb95

    xor-int/2addr v9, v10

    const v10, -0x1323de66

    goto/16 :goto_0

    :sswitch_13
    sget v8, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v8, :cond_c

    :goto_5
    const-string v8, "\u06d7\u1a79"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x73

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x2a3f

    const v10, -0x2b6a80ab

    xor-int/2addr v9, v10

    const v10, 0x6892f3f3

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u05ab\u06e8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7961

    const v10, 0x5dea092d

    xor-int/2addr v9, v10

    const v10, -0x1c965e4

    goto/16 :goto_0

    .line 168
    :sswitch_14
    sget v8, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v8, :cond_e

    :cond_d
    :goto_6
    const-string v8, "\u05a8\u06e0"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x6dbb

    const v10, -0x7c6bfdf9

    xor-int/2addr v9, v10

    const v10, -0x6e618294

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u05a8\u1a7b"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x79

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x74a7

    const v10, -0x540de9fd

    xor-int/2addr v9, v10

    const v10, -0x7c4f2742

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x793f20e8 -> :sswitch_c
        -0x776e45fb -> :sswitch_7
        -0x706a5e91 -> :sswitch_10
        -0x6d907fde -> :sswitch_0
        -0x5eaf5436 -> :sswitch_b
        -0x535808a1 -> :sswitch_3
        -0x52169384 -> :sswitch_14
        -0x4db5e914 -> :sswitch_13
        -0x45e74e4b -> :sswitch_8
        -0x3e6b6c7a -> :sswitch_14
        -0x3dc2499d -> :sswitch_1
        -0x3b92e9dc -> :sswitch_c
        -0x36a5ca11 -> :sswitch_d
        -0x2f2973ae -> :sswitch_2
        -0x23b53e54 -> :sswitch_11
        -0x2201c71d -> :sswitch_5
        -0x1e85f2fc -> :sswitch_7
        -0x1b29711d -> :sswitch_6
        -0x839ce46 -> :sswitch_13
        -0x69b736c -> :sswitch_0
        -0x260d473 -> :sswitch_9
        0x1189555d -> :sswitch_2
        0x14b08d15 -> :sswitch_f
        0x17debe12 -> :sswitch_6
        0x17fa1841 -> :sswitch_5
        0x251cba2e -> :sswitch_10
        0x280427d8 -> :sswitch_12
        0x2d9d21c6 -> :sswitch_9
        0x3aed65dd -> :sswitch_11
        0x425b4792 -> :sswitch_4
        0x44105b58 -> :sswitch_12
        0x4a201b38 -> :sswitch_a
        0x50419b19 -> :sswitch_d
        0x5074ce92 -> :sswitch_3
        0x56293174 -> :sswitch_1
        0x582bf47f -> :sswitch_f
        0x5d93c873 -> :sswitch_4
        0x64a01081 -> :sswitch_e
        0x6acfd6f3 -> :sswitch_b
        0x71c95907 -> :sswitch_a
        0x7d4112f3 -> :sswitch_e
        0x7d445f9b -> :sswitch_8
    .end sparse-switch
.end method

.method public static ۤ(Ll/ᩴܿ᩻;)V
    .locals 10

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    const v4, 0x8f69a81

    sget v5, Ll/ۧ;->ۨۗܰ:I

    sget v6, Ll/֨ܿ;->᩹᩻۟:I

    const-string v7, "\u06da\u1a76"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x31ed

    const v9, -0x2d8cef3d

    xor-int/2addr v8, v9

    const v9, -0x51d99484

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, -0x5bdf

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 166
    sget v7, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v7, :cond_6

    goto/16 :goto_1

    :sswitch_0
    sget v7, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v7, :cond_9

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v7

    if-lez v7, :cond_2

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v7

    if-gez v7, :cond_b

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    goto/16 :goto_1

    .line 175
    :sswitch_4
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    return-void

    :sswitch_5
    add-long/2addr v0, v2

    .line 179
    iput-wide v0, p0, Ll/ᩴܿ᩻;->ܿ:J

    return-void

    :sswitch_6
    const-wide/16 v2, 0x1f4

    sget v7, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v7, :cond_0

    const-string v7, "\u06d8\u1a7b"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x69

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1be7

    const v9, -0x313dd738

    xor-int/2addr v8, v9

    const v9, -0x33eabfc2    # -3.912524E7f

    goto :goto_0

    :cond_0
    const-string v7, "\u1a79\u06e0"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3845

    const v9, -0x508a2593

    xor-int/2addr v8, v9

    const v9, 0x3a0058a5

    goto :goto_0

    .line 22
    :sswitch_7
    sget v7, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v7, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v7, "\u06e1\u073a"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7795

    const v9, 0x4eb345e1

    xor-int/2addr v8, v9

    const v9, 0x7ecd8ca1

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    const-string v7, "\u0736\u1a7a"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x49

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1773

    const v9, -0x7b9a39e2

    xor-int/2addr v8, v9

    const v9, -0x1efa8bfe

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u1a7b\u06e4"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3c17

    const v9, -0x30e534b5

    xor-int/2addr v8, v9

    const v9, -0x7cd3f9cb

    goto/16 :goto_0

    .line 170
    :sswitch_9
    sget v7, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v7, :cond_4

    goto :goto_1

    :cond_4
    const-string v7, "\u06e1\u0730"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5ee9

    const v9, 0x70a52bcc

    xor-int/2addr v8, v9

    const v9, 0x69c8fdd5

    goto/16 :goto_0

    .line 24
    :sswitch_a
    sget v7, Ll/֫֡;->֫ۙۖ:I

    if-gtz v7, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v7, "\u06e0\u06e8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x25

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2185

    const v9, -0x67ad9088

    xor-int/2addr v8, v9

    const v9, 0x7d6ec8cb

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u06ec\u06da"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x5

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x4a1

    const v9, -0x46dbbd95

    xor-int/2addr v8, v9

    const v9, -0x3bc54846

    goto/16 :goto_0

    .line 97
    :sswitch_b
    sget v7, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v7, :cond_7

    :goto_1
    const-string v7, "\u06e2\u0733"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5c7f

    const v9, 0x3762bdc2

    xor-int/2addr v8, v9

    const v9, 0xb620144

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u073a\u05a8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7143

    const v9, -0x558eaa6f

    xor-int/2addr v8, v9

    const v9, 0x77108426

    goto/16 :goto_0

    .line 81
    :sswitch_c
    sget v7, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v7, :cond_8

    goto :goto_3

    :cond_8
    const-string v7, "\u06d6\u1a78"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x60d3

    const v9, 0x215a478

    xor-int/2addr v8, v9

    const v9, -0x3397846c    # -6.094395E7f

    goto/16 :goto_0

    .line 29
    :sswitch_d
    sget v7, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v7, :cond_a

    :cond_9
    :goto_2
    const-string v7, "\u1a75\u1a75"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x2d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2f53

    const v9, 0x750b3bfc

    xor-int/2addr v8, v9

    const v9, -0x5d803ddd

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u06d8\u0736"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7bb7

    const v9, -0x14bee199

    xor-int/2addr v8, v9

    const v9, -0x11ad0c51

    goto/16 :goto_0

    .line 179
    :sswitch_e
    invoke-static {}, Ll/ۘܶ;->ܽܿܽ()J

    move-result-wide v0

    sget v7, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v7, :cond_c

    :cond_b
    :goto_3
    const-string v7, "\u1a73\u1a74"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x35

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1103

    const v9, -0x12522635

    xor-int/2addr v8, v9

    const v9, -0x17b4cd58

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06e8\u06eb"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x7d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6a0b

    const v9, 0x1c9d6c18

    xor-int/2addr v8, v9

    const v9, -0x3372d6bd    # -7.400911E7f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f1a26af -> :sswitch_3
        -0x7ac5f8c9 -> :sswitch_a
        -0x69573f20 -> :sswitch_3
        -0x66ff3590 -> :sswitch_0
        -0x66dff28e -> :sswitch_9
        -0x571eaf8a -> :sswitch_5
        -0x540e16fb -> :sswitch_c
        -0x5205fd52 -> :sswitch_4
        -0x47bff081 -> :sswitch_9
        -0x3e8f29b4 -> :sswitch_6
        -0x2f7eb663 -> :sswitch_2
        -0x27aa705d -> :sswitch_6
        -0x4d5ed12 -> :sswitch_8
        -0x33c23ce -> :sswitch_2
        0x1329bc0 -> :sswitch_e
        0x865f5db -> :sswitch_a
        0x14d89ea2 -> :sswitch_1
        0x1c2707af -> :sswitch_1
        0x1f76f35f -> :sswitch_d
        0x25b7e287 -> :sswitch_7
        0x2b625362 -> :sswitch_8
        0x346895a3 -> :sswitch_5
        0x3930d932 -> :sswitch_0
        0x3cc4b6f4 -> :sswitch_e
        0x50de9b9a -> :sswitch_7
        0x68bac92e -> :sswitch_4
        0x69892b82 -> :sswitch_b
        0x6af04a8d -> :sswitch_b
        0x6b4be22b -> :sswitch_d
        0x7cb01ba5 -> :sswitch_c
    .end sparse-switch
.end method

.method private ۤ(Landroid/view/MotionEvent;)Z
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x749a84de

    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    const-string v5, "\u1a77\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x56b1

    const v7, -0x1d2ec556

    xor-int/2addr v6, v7

    const v7, 0x45e4c882

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x3505

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    const/4 p1, 0x1

    return p1

    .line 135
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v5

    if-gtz v5, :cond_6

    goto/16 :goto_5

    .line 90
    :sswitch_1
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_4

    .line 33
    :sswitch_2
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-lez v5, :cond_d

    goto/16 :goto_5

    .line 105
    :sswitch_3
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    goto/16 :goto_5

    .line 281
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    const/4 p1, 0x0

    return p1

    .line 444
    :sswitch_5
    invoke-static {v1}, Ll/֨ۚ;->ᩳ᩷ܺ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View$OnTouchListener;

    .line 445
    invoke-interface {v5, p0, p1}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "\u06d6\u0736"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x49c9

    const v7, 0x5aa0e9fb

    xor-int/2addr v6, v7

    const v7, 0x30a1c58a

    goto :goto_0

    .line 444
    :sswitch_6
    invoke-static {v1}, Ll/ۘ۟;->ᩳۘ᩸(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "\u06e7\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x31

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2f6b

    const v7, -0x19b250d6

    xor-int/2addr v6, v7

    const v7, 0x6f8cc6cf

    goto :goto_0

    .line 442
    :sswitch_7
    invoke-interface {v0, p0, p1}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_1

    .line 444
    :sswitch_8
    iget-object v1, p0, Ll/ᩴܿ᩻;->ܶۙ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۘܽ;->ۘ֨᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    const-string v5, "\u073d\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x60cb

    const v7, 0x522747cb

    xor-int/2addr v6, v7

    const v7, -0x1303c4bc

    goto/16 :goto_0

    .line 440
    :sswitch_9
    iget-object v0, p0, Ll/ᩴܿ᩻;->ܰ:Landroid/view/View$OnTouchListener;

    if-eqz v0, :cond_1

    const-string v5, "\u073d\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x16c1

    const v7, -0x308accb7

    xor-int/2addr v6, v7

    const v7, 0x6c28ff54

    goto/16 :goto_0

    :cond_1
    :goto_1
    const-string v5, "\u1a77\u06d8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1155

    const v7, 0x71fed122

    xor-int/2addr v6, v7

    const v7, -0x319b2d54    # -9.5975296E8f

    goto/16 :goto_0

    .line 437
    :sswitch_a
    iget-object v5, p0, Ll/ᩴܿ᩻;->ܶۙ:Ljava/util/ArrayList;

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    const-string v5, "\u05ab\u06e7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x118d

    const v7, 0x140afe6a

    xor-int/2addr v6, v7

    const v7, -0x31a94253

    goto/16 :goto_0

    :sswitch_b
    const/4 p1, 0x0

    return p1

    :sswitch_c
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "\u1a73\u05a8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x67

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7713

    const v7, 0xd27a62b

    xor-int/2addr v6, v7

    const v7, -0x64fb7606

    goto/16 :goto_0

    :cond_3
    :goto_2
    const-string v5, "\u1a79\u06d8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1851

    const v7, 0x56aaca67

    xor-int/2addr v6, v7

    const v7, -0x1e56363b

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v5, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v5, "\u05a1\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x35bf

    const v7, 0x5274a45a

    xor-int/2addr v6, v7

    const v7, 0x6cc58ac9

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u1a7a\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x26c3

    const v7, -0x47b92ab7

    xor-int/2addr v6, v7

    const v7, 0x314316a7

    goto/16 :goto_0

    .line 222
    :sswitch_f
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v5

    if-gtz v5, :cond_7

    :cond_6
    const-string v5, "\u06df\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x17b5

    const v7, -0x5b806631

    xor-int/2addr v6, v7

    const v7, -0xd352900

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06d8\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x3d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5bd1

    const v7, -0x1a4f2a40

    xor-int/2addr v6, v7

    const v7, 0x3ca97664

    goto/16 :goto_0

    .line 427
    :sswitch_10
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    :goto_3
    const-string v5, "\u1a73\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x55

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1f5d

    const v7, -0x2d0730e2

    xor-int/2addr v6, v7

    const v7, -0x30084bdc

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u0736\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5421

    const v7, 0x7f461cf4

    xor-int/2addr v6, v7

    const v7, -0xedb91de

    goto/16 :goto_0

    .line 305
    :sswitch_11
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v5

    if-gtz v5, :cond_a

    goto :goto_4

    :cond_a
    const-string v5, "\u06e7\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1973

    const v7, -0x175f5349

    xor-int/2addr v6, v7

    const v7, 0xc7d236a

    goto/16 :goto_0

    :sswitch_12
    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v5, :cond_b

    goto/16 :goto_6

    :cond_b
    const-string v5, "\u06e2\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5c17

    const v7, -0x49e0aa46

    xor-int/2addr v6, v7

    const v7, -0x7e7a6144

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v5

    if-eqz v5, :cond_c

    goto/16 :goto_6

    :cond_c
    const-string v5, "\u1a73\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x46e9

    const v7, -0x6891f673

    xor-int/2addr v6, v7

    const v7, -0x734e3eac

    goto/16 :goto_0

    .line 203
    :sswitch_14
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_e

    :cond_d
    :goto_4
    const-string v5, "\u06d8\u1a79"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1cd3

    const v7, -0x1314c334

    xor-int/2addr v6, v7

    const v7, -0x4e365643

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u1a75\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x28fd

    const v7, 0x744aa6d0

    xor-int/2addr v6, v7

    const v7, -0x25db90ae

    goto/16 :goto_0

    .line 34
    :sswitch_15
    sget v5, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v5, :cond_f

    :goto_5
    const-string v5, "\u06dc\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x46ad

    const v7, -0x2908bf88

    xor-int/2addr v6, v7

    const v7, -0x270eb5e8

    goto/16 :goto_0

    :cond_f
    const-string v5, "\u1a78\u05a8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x45

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x553d

    const v7, 0x4295f67d

    xor-int/2addr v6, v7

    const v7, -0x2b451361

    goto/16 :goto_0

    .line 175
    :sswitch_16
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v5

    if-nez v5, :cond_10

    :goto_6
    const-string v5, "\u06e4\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5b89

    const v7, -0x1e9c3432

    xor-int/2addr v6, v7

    const v7, 0x17ebd137

    goto/16 :goto_0

    :cond_10
    const-string v5, "\u1a77\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xaf3

    const v7, -0x2ed37300

    xor-int/2addr v6, v7

    const v7, 0x5162a8c5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c230ab2 -> :sswitch_c
        -0x7b737c2a -> :sswitch_c
        -0x778b38e1 -> :sswitch_b
        -0x715104db -> :sswitch_6
        -0x65f4da67 -> :sswitch_e
        -0x55b9a7a0 -> :sswitch_14
        -0x53fbd394 -> :sswitch_9
        -0x4d402521 -> :sswitch_7
        -0x478a8ce3 -> :sswitch_13
        -0x46d7d0e0 -> :sswitch_15
        -0x3e7fe6c7 -> :sswitch_e
        -0x3509c14d -> :sswitch_10
        -0x32a15c2c -> :sswitch_d
        -0x2c649fbf -> :sswitch_3
        -0x20792c62 -> :sswitch_b
        -0x166d83f3 -> :sswitch_11
        -0x15f8325d -> :sswitch_3
        -0xb5e88a8 -> :sswitch_a
        -0xa3377ee -> :sswitch_16
        -0x9bec598 -> :sswitch_2
        -0x5d4eb6 -> :sswitch_0
        0x67d703d -> :sswitch_4
        0x8b48c12 -> :sswitch_16
        0xe1f2d23 -> :sswitch_6
        0x10be133f -> :sswitch_a
        0x1175daf6 -> :sswitch_f
        0x13c4dbd6 -> :sswitch_14
        0x19cbe28f -> :sswitch_5
        0x1a83b07d -> :sswitch_1
        0x204209ce -> :sswitch_d
        0x262e554b -> :sswitch_8
        0x2b0933ab -> :sswitch_8
        0x40231244 -> :sswitch_5
        0x430f6ec0 -> :sswitch_7
        0x5904e0d2 -> :sswitch_1
        0x60bb4476 -> :sswitch_13
        0x60eb96dc -> :sswitch_12
        0x63a31c88 -> :sswitch_15
        0x64fb4735 -> :sswitch_12
        0x66f50abd -> :sswitch_9
        0x69ae02f7 -> :sswitch_2
        0x69ccfe2e -> :sswitch_11
        0x6e2fdf96 -> :sswitch_10
        0x715d75ad -> :sswitch_4
        0x7bdff564 -> :sswitch_0
        0x7c12474c -> :sswitch_f
    .end sparse-switch
.end method

.method private ܳ()Z
    .locals 12

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const v6, 0x29d94e18

    sget v7, Ll/֫۠;->ۢᩴ᩺:I

    sget v8, Ll/ۖᩳ;->᩹ۧܳ:I

    const-string v9, "\u1a75\u1a79"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x77

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x2581

    const v11, -0x2285e6e

    xor-int/2addr v10, v11

    const v11, 0x4f329bf

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v8

    mul-int/lit16 v6, v6, 0x6f5

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 34
    sget v9, Ll/ۗܰ;->ܶۜ۬:I

    if-gez v9, :cond_9

    goto/16 :goto_5

    .line 24
    :sswitch_0
    sget v9, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v9, :cond_7

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v9

    if-gez v9, :cond_5

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    goto/16 :goto_5

    .line 21
    :sswitch_3
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    const/4 v0, 0x0

    return v0

    :sswitch_4
    const/4 v0, 0x1

    return v0

    :sswitch_5
    const-wide/16 v9, 0x1f4

    cmp-long v11, v4, v9

    if-gez v11, :cond_d

    const-string v9, "\u06e2\u0733"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x13d7

    const v11, -0x395f1f52

    xor-int/2addr v10, v11

    const v11, 0x2a514973

    goto :goto_0

    :sswitch_6
    sub-long v4, v0, v2

    sget v9, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v9, :cond_0

    goto :goto_1

    :cond_0
    const-string v9, "\u073d\u06eb"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x207b

    const v11, -0x73f55d8d

    xor-int/2addr v10, v11

    const v11, 0x553d92af

    goto :goto_0

    .line 28
    :sswitch_7
    sget-boolean v9, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v9, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v9, "\u073a\u073d"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5e7

    const v11, 0x68b22b56

    xor-int/2addr v10, v11

    const v11, 0xd0a57eb

    goto :goto_0

    :sswitch_8
    sget v9, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v9, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v9, "\u073a\u06d9"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x23

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x6305

    const v11, -0x59017fc1

    xor-int/2addr v10, v11

    const v11, 0x56879435

    goto/16 :goto_0

    .line 18
    :sswitch_9
    sget v9, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v9, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v9, "\u1a77\u1a77"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x7b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x481d

    const v11, 0x763f3b39

    xor-int/2addr v10, v11

    const v11, 0x6913940f

    goto/16 :goto_0

    .line 75
    :sswitch_a
    sget v9, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v9, :cond_4

    :goto_1
    const-string v9, "\u073f\u06d8"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6179

    const v11, -0x59b623f9

    xor-int/2addr v10, v11

    const v11, 0x78f8d977

    goto/16 :goto_0

    :cond_4
    const-string v9, "\u06e8\u073f"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x43

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x39c7

    const v11, -0x5ffca706

    xor-int/2addr v10, v11

    const v11, 0x35cc3611

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v9, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v9, :cond_6

    :cond_5
    :goto_2
    const-string v9, "\u0730\u073d"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x20df

    const v11, -0x24f86ec3

    xor-int/2addr v10, v11

    const v11, -0x6b838399

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u0736\u06dc"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x65

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5c9f

    const v11, -0x7d40131d

    xor-int/2addr v10, v11

    const v11, 0x258cb3a2

    goto/16 :goto_0

    .line 5
    :sswitch_c
    sget-boolean v9, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v9, :cond_8

    :cond_7
    :goto_3
    const-string v9, "\u06e0\u073f"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x5

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x13b3

    const v11, 0x463108d9

    xor-int/2addr v10, v11

    const v11, -0x7a287d19

    goto/16 :goto_0

    :cond_8
    const-string v9, "\u0736\u1a78"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x69

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x6759

    const v11, 0x63b0fa7f

    xor-int/2addr v10, v11

    const v11, 0x1a9e88be

    goto/16 :goto_0

    :sswitch_d
    sget v9, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v9, :cond_a

    :cond_9
    :goto_4
    const-string v9, "\u06d9\u06e8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x2ffb

    const v11, 0x5246a309

    xor-int/2addr v10, v11

    const v11, -0x95a673f    # -1.67935E33f

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u1a75\u06eb"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x75

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x56e5

    const v11, -0x6d85ac04

    xor-int/2addr v10, v11

    const v11, 0x7e448f6b

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v9, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v9, :cond_b

    goto :goto_5

    :cond_b
    const-string v9, "\u06ec\u1a75"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5a33

    const v11, 0x7a46e512

    xor-int/2addr v10, v11

    const v11, -0x65930985

    goto/16 :goto_0

    .line 92
    :sswitch_f
    invoke-static {}, Ll/֨ۚ;->ۢ۫᩹()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ᩴܿ᩻;->۬:J

    sget-boolean v9, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v9, :cond_c

    :goto_5
    const-string v9, "\u06dc\u06d6"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6be7

    const v11, -0x3e58d50d

    xor-int/2addr v10, v11

    const v11, 0x40295556

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u1a78\u0733"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x285b

    const v11, -0x56cf2faf

    xor-int/2addr v10, v11

    const v11, -0x225a476f

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x0

    return v0

    .line 91
    :sswitch_11
    iget-boolean v9, p0, Ll/ᩴܿ᩻;->ۜ:Z

    if-eqz v9, :cond_d

    const-string v9, "\u1a73\u06e7"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5f93

    const v11, 0x41193627

    xor-int/2addr v10, v11

    const v11, -0x397ebc61

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u06e8\u06eb"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x6c0d

    const v11, 0x770d5c47

    xor-int/2addr v10, v11

    const v11, 0x260eb352

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78209aa3 -> :sswitch_11
        -0x77af44cd -> :sswitch_9
        -0x76343365 -> :sswitch_f
        -0x6f69b5f4 -> :sswitch_2
        -0x6ad51ee9 -> :sswitch_c
        -0x686d1524 -> :sswitch_e
        -0x61b47040 -> :sswitch_b
        -0x5e3d9f38 -> :sswitch_9
        -0x4cd8bf0d -> :sswitch_6
        -0x4819e9b6 -> :sswitch_1
        -0x45cc320b -> :sswitch_4
        -0x44c8fa3e -> :sswitch_0
        -0x436ed5e8 -> :sswitch_0
        -0x406643e8 -> :sswitch_7
        -0x3991f703 -> :sswitch_11
        -0x2ada4d5e -> :sswitch_d
        -0x24cad046 -> :sswitch_2
        -0x18e3f101 -> :sswitch_10
        0x4ddf6f3 -> :sswitch_3
        0x8bf6fb6 -> :sswitch_f
        0x91119bc -> :sswitch_e
        0x92ff154 -> :sswitch_1
        0xf603bfc -> :sswitch_3
        0x1f091c17 -> :sswitch_5
        0x2664cb6c -> :sswitch_5
        0x3c23fa37 -> :sswitch_c
        0x42430578 -> :sswitch_6
        0x494e2e13 -> :sswitch_d
        0x6065fc14 -> :sswitch_4
        0x622350f7 -> :sswitch_b
        0x6380cbb7 -> :sswitch_a
        0x6c3a07a7 -> :sswitch_10
        0x6de312ec -> :sswitch_a
        0x703ccb54 -> :sswitch_8
        0x73a806ae -> :sswitch_7
        0x7fc0e15f -> :sswitch_8
    .end sparse-switch
.end method

.method private ᩴ()Z
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x76b10c18

    sget v8, Ll/֫֡;->֫ۙۖ:I

    sget v9, Ll/ۗ᩺;->֡ۙۜ:I

    const-string v10, "\u1a76\u1a73"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3e8f

    const v12, 0x74382c61

    xor-int/2addr v11, v12

    const v12, -0x5dd1a881

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, 0x1493

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 363
    iget-boolean v10, p0, Ll/ᩴܿ᩻;->᩷ۙ:Z

    if-nez v10, :cond_4

    const-string v10, "\u1a7b\u06d7"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x77

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7cf3

    const v12, -0x44e88375

    xor-int/2addr v11, v12

    const v12, -0x66d75be

    goto :goto_0

    .line 60
    :sswitch_0
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v10

    if-eqz v10, :cond_7

    goto :goto_1

    .line 212
    :sswitch_1
    sget v10, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v10, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v10, "\u06dc\u06dc"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x14f3

    const v12, -0x544c6348

    xor-int/2addr v11, v12

    const v12, 0x1eb376a5

    goto :goto_0

    .line 103
    :sswitch_2
    sget v10, Ll/ۖ;->ܿۚ֡:I

    if-ltz v10, :cond_10

    goto/16 :goto_6

    .line 171
    :sswitch_3
    sget v10, Ll/᩺;->۫۬۫:I

    if-lez v10, :cond_d

    goto/16 :goto_7

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v10

    if-gez v10, :cond_a

    goto :goto_1

    .line 364
    :sswitch_5
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget v10, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v10, :cond_1

    goto/16 :goto_7

    :cond_1
    :goto_1
    const-string v10, "\u06d8\u06d7"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x3

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x5b7

    const v12, 0x4c6cd74a    # 6.208644E7f

    xor-int/2addr v11, v12

    const v12, 0xe8ca1e1

    goto :goto_0

    .line 114
    :sswitch_6
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    goto/16 :goto_7

    :sswitch_7
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    const/4 v0, 0x0

    return v0

    .line 363
    :sswitch_8
    iget-boolean v10, p0, Ll/ᩴܿ᩻;->ۚۙ:Z

    if-eqz v10, :cond_12

    goto :goto_2

    :sswitch_9
    iget-boolean v10, p0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    if-nez v10, :cond_4

    const-string v10, "\u06d8\u06eb"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x5f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5f71

    const v12, -0x2ce386fd

    xor-int/2addr v11, v12

    const v12, 0x611723b7

    goto/16 :goto_0

    :sswitch_a
    const/4 v0, 0x1

    return v0

    :sswitch_b
    div-float v10, v4, v6

    const/high16 v11, 0x40600000    # 3.5f

    cmpl-float v10, v10, v11

    if-lez v10, :cond_12

    goto :goto_3

    :sswitch_c
    int-to-float v6, v5

    sget v10, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v10, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v10, "\u06e4\u1a79"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x3f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x633d

    const v12, -0x5c226938

    xor-int/2addr v11, v12

    const v12, -0x464cb029

    goto/16 :goto_0

    :sswitch_d
    int-to-float v4, v2

    .line 353
    invoke-virtual {p0}, Ll/ᩴܿ᩻;->ۙ()I

    move-result v5

    sget-boolean v10, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v10, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v10, "\u0730\u06e1"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6f0d

    const v12, 0x484f9584

    xor-int/2addr v11, v12

    const v12, 0x71f5f7db

    goto/16 :goto_0

    :cond_4
    :goto_2
    const-string v10, "\u05a1\u1a74"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x661f

    const v12, 0x44d0983b

    xor-int/2addr v11, v12

    const v12, -0x537604ef

    goto/16 :goto_0

    .line 351
    :sswitch_e
    iget-boolean v10, p0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    if-nez v10, :cond_5

    const-string v10, "\u06d9\u06da"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x59

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x49a7

    const v12, 0x3daed8a0

    xor-int/2addr v11, v12

    const v12, -0x68f5d79a

    goto/16 :goto_0

    :cond_5
    :goto_3
    const-string v10, "\u06eb\u1a75"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x35

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x58e5

    const v12, 0x21cae8c2

    xor-int/2addr v11, v12

    const v12, -0x5a2c3cb3

    goto/16 :goto_0

    :sswitch_f
    sub-int v10, v2, v3

    if-lez v10, :cond_12

    const-string v10, "\u1a77\u073d"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x439d

    const v12, 0xb3ef981

    xor-int/2addr v11, v12

    const v12, -0x1b980c73

    goto/16 :goto_0

    .line 349
    :sswitch_10
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getCount()I

    move-result v2

    .line 350
    invoke-static {p0}, Ll/ۘܽ;->ۢ᩶۫(Ljava/lang/Object;)I

    move-result v3

    if-lez v3, :cond_12

    const-string v10, "\u06e0\u06da"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x5f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x33ed

    const v12, 0xc63aa25

    xor-int/2addr v11, v12

    const v12, -0x784db4f6

    goto/16 :goto_0

    .line 370
    :sswitch_11
    iget v10, v0, Ll/᩸᩷ܺ;->ۙ:F

    iget v11, v0, Ll/᩸᩷ܺ;->ᩴ:F

    cmpl-float v10, v10, v11

    if-lez v10, :cond_12

    const-string v10, "\u1a7a\u06e7"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x49

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x15d5

    const v12, 0x198e335d

    xor-int/2addr v11, v12

    const v12, -0x70f757d8

    goto/16 :goto_0

    :sswitch_12
    iget v10, v0, Ll/᩸᩷ܺ;->᩷:F

    cmpl-float v10, v1, v10

    if-lez v10, :cond_12

    const-string v10, "\u1a78\u06e7"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x69

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0xb07

    const v12, -0x7fba344d

    xor-int/2addr v11, v12

    const v12, 0x27412dcb

    goto/16 :goto_0

    .line 4
    :sswitch_13
    sget v10, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v10, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v10, "\u06dc\u0730"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2705

    const v12, -0x63c56356

    xor-int/2addr v11, v12

    const v12, 0x6b525f97

    goto/16 :goto_0

    .line 112
    :sswitch_14
    sget v10, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v10, :cond_8

    :cond_7
    const-string v10, "\u06e7\u1a76"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x13f

    const v12, -0x371a5f45

    xor-int/2addr v11, v12

    const v12, 0x570289f9

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u1a73\u05ab"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4e79

    const v12, -0x116c9907

    xor-int/2addr v11, v12

    const v12, -0x1259e276

    goto/16 :goto_0

    :sswitch_15
    sget v10, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v10, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v10, "\u073f\u06e7"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x41

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6afd

    const v12, 0x36c4f1df

    xor-int/2addr v11, v12

    const v12, -0x18d178fd

    goto/16 :goto_0

    .line 286
    :sswitch_16
    sget v10, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v10, :cond_b

    :cond_a
    :goto_4
    const-string v10, "\u1a75\u06e4"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x811

    const v12, -0x24b09984

    xor-int/2addr v11, v12

    const v12, -0x674f22b9

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u06d8\u073d"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3857

    const v12, 0x12f7d68e

    xor-int/2addr v11, v12

    const v12, -0x784197c8

    goto/16 :goto_0

    .line 344
    :sswitch_17
    sget v10, Ll/᩺;->۫۬۫:I

    if-gtz v10, :cond_c

    :goto_5
    const-string v10, "\u1a74\u1a78"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0xd

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3ee3

    const v12, 0x3ca88025

    xor-int/2addr v11, v12

    const v12, -0x165aff3f

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u1a7b\u05a1"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xa2b

    const v12, 0x3f151138

    xor-int/2addr v11, v12

    const v12, -0x7e04e077

    goto/16 :goto_0

    .line 149
    :sswitch_18
    sget v10, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v10, :cond_e

    :cond_d
    :goto_6
    const-string v10, "\u05a1\u06d9"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x3f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4c0d

    const v12, -0x5ec266bf

    xor-int/2addr v11, v12

    const v12, 0x33f2862c

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u06d7\u06d9"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x4f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x725

    const v12, -0x792356e4

    xor-int/2addr v11, v12

    const v12, 0x30af6275

    goto/16 :goto_0

    .line 191
    :sswitch_19
    sget v10, Ll/᩺;->۫۬۫:I

    if-gtz v10, :cond_f

    :goto_7
    const-string v10, "\u06e8\u06da"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x13

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x70e9

    const v12, 0x75faf0b

    xor-int/2addr v11, v12

    const v12, -0x1c7796a2

    goto/16 :goto_0

    :cond_f
    const-string v10, "\u1a79\u1a76"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x2b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x67b3

    const v12, -0x7e2be7d

    xor-int/2addr v11, v12

    const v12, 0x741ee082

    goto/16 :goto_0

    .line 370
    :sswitch_1a
    iget-object v0, p0, Ll/ᩴܿ᩻;->ۙۙ:Ll/᩸᩷ܺ;

    iget v1, v0, Ll/᩸᩷ܺ;->᩸:F

    .line 277
    sget v10, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v10, :cond_11

    :cond_10
    :goto_8
    const-string v10, "\u1a7a\u06e4"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7333

    const v12, -0x29f8fa95

    xor-int/2addr v11, v12

    const v12, -0x5801f035

    goto/16 :goto_0

    :cond_11
    const-string v10, "\u06e4\u1a73"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x69

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x31db

    const v12, -0x36429245

    xor-int/2addr v11, v12

    const v12, -0x24846643

    goto/16 :goto_0

    :sswitch_1b
    const/4 v0, 0x0

    return v0

    .line 360
    :sswitch_1c
    iget-boolean v10, p0, Ll/ᩴܿ᩻;->᩸ۙ:Z

    if-eqz v10, :cond_12

    const-string v10, "\u06e0\u073d"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x11

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2213

    const v12, -0xf418eaa

    xor-int/2addr v11, v12

    const v12, -0x1b1c7b37

    goto/16 :goto_0

    :cond_12
    const-string v10, "\u073f\u06e1"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0xef1

    const v12, -0x6d8f84be

    xor-int/2addr v11, v12

    const v12, -0x1c7bf116

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76a2c1c5 -> :sswitch_19
        -0x745c9c64 -> :sswitch_2
        -0x73a182be -> :sswitch_1c
        -0x6fbc0656 -> :sswitch_e
        -0x62fb470d -> :sswitch_4
        -0x5710bbfe -> :sswitch_0
        -0x551ad6bc -> :sswitch_1b
        -0x4b8f200d -> :sswitch_b
        -0x442e24b0 -> :sswitch_d
        -0x3dfe2e72 -> :sswitch_19
        -0x31ef29a3 -> :sswitch_8
        -0x31208c8f -> :sswitch_15
        -0x2e2dd99c -> :sswitch_5
        -0x1b6f9a4e -> :sswitch_9
        -0x1b4d104e -> :sswitch_f
        -0x199934ea -> :sswitch_c
        -0x197b8aa6 -> :sswitch_14
        -0x11630bb3 -> :sswitch_3
        -0xc8943fa -> :sswitch_d
        -0x8c8595f -> :sswitch_11
        -0x2f2c5eb -> :sswitch_1a
        -0x3019ab -> :sswitch_3
        0x4310093 -> :sswitch_1a
        0x4a219cb -> :sswitch_2
        0x6911d5f -> :sswitch_1b
        0xd54916f -> :sswitch_15
        0xdf5bd1a -> :sswitch_7
        0xfd64644 -> :sswitch_10
        0x14e8ebb6 -> :sswitch_16
        0x1754858b -> :sswitch_b
        0x1bbfc980 -> :sswitch_12
        0x1e63b9ba -> :sswitch_1
        0x1f96c082 -> :sswitch_17
        0x21aec81b -> :sswitch_4
        0x2233446f -> :sswitch_12
        0x30855c4e -> :sswitch_11
        0x373dd77b -> :sswitch_1c
        0x3894d246 -> :sswitch_c
        0x3999fd5b -> :sswitch_a
        0x3ccb541f -> :sswitch_6
        0x3e51c182 -> :sswitch_14
        0x3fdf1f22 -> :sswitch_5
        0x42b91a78 -> :sswitch_f
        0x43e166c4 -> :sswitch_8
        0x4e47a339 -> :sswitch_6
        0x512c128c -> :sswitch_9
        0x56ca87bf -> :sswitch_16
        0x5e72cf35 -> :sswitch_18
        0x637b31d9 -> :sswitch_10
        0x648aa087 -> :sswitch_1
        0x68e77777 -> :sswitch_13
        0x6bb65c5f -> :sswitch_17
        0x6e474bec -> :sswitch_7
        0x71740692 -> :sswitch_e
        0x78b5eaab -> :sswitch_13
        0x7b9acf3a -> :sswitch_a
        0x7ba07cd8 -> :sswitch_0
        0x7e7fe270 -> :sswitch_18
    .end sparse-switch
.end method

.method public static bridge synthetic ᩴ(Ll/ᩴܿ᩻;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩴܿ᩻;->ܳ()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/ᩴܿ᩻;)Landroid/widget/AbsListView$OnScrollListener;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܿ᩻;->۫ۙ:Landroid/widget/AbsListView$OnScrollListener;

    return-object p0
.end method

.method private ᩷(Landroid/view/MotionEvent;)V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x7b0f1c10

    sget v9, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v10, Ll/ۘ֡;->᩹ܶ۬:I

    const-string v11, "\u073a\u06e2"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x694f

    const v13, 0x252b8219

    xor-int/2addr v12, v13

    const v13, 0x2809fff9

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v10

    mul-int/lit16 v8, v8, 0x62f3

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 409
    invoke-super {p0, v3}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 410
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    return-void

    :sswitch_0
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v11, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v11, :cond_9

    goto/16 :goto_3

    .line 225
    :sswitch_1
    sget v11, Ll/ۗ֡;->ۜ᩻۫:I

    if-gez v11, :cond_7

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_1

    .line 346
    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    goto :goto_1

    .line 165
    :sswitch_4
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    return-void

    :sswitch_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_2

    .line 405
    :sswitch_6
    invoke-static {p0, v2}, Ll/ۘܽ;->ܳۢ᩻(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11, v0}, Landroid/view/View;->setPressed(Z)V

    sget v11, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v11, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v11, "\u06ec\u06eb"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x5d7

    const v13, 0x6f9a9132

    xor-int/2addr v12, v13

    const v13, -0x49dc278c

    goto :goto_0

    :sswitch_7
    or-int v11, v6, v7

    .line 408
    invoke-virtual {v3, v11}, Landroid/view/MotionEvent;->setAction(I)V

    sget-boolean v11, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v11, :cond_1

    :goto_1
    const-string v11, "\u06e8\u05ab"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x301d

    const v13, -0x6ef06d5d

    xor-int/2addr v12, v13

    const v13, 0x32649727

    goto :goto_0

    :cond_1
    const-string v11, "\u06d8\u1a78"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x39

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x5bb

    const v13, -0xb3fb14b

    xor-int/2addr v12, v13

    const v13, 0x7fdd7913

    goto/16 :goto_0

    :sswitch_8
    shl-int v6, v4, v5

    const/4 v7, 0x3

    sget v11, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v11, :cond_2

    const-string v11, "\u0733\u06eb"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x13

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x7e5f

    const v13, -0x4ea94ae4

    xor-int/2addr v12, v13

    const v13, -0x4a501963

    goto/16 :goto_0

    :cond_2
    const-string v11, "\u06e4\u05a8"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x7b

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x5d09

    const v13, 0x2d3ca2f

    xor-int/2addr v12, v13

    const v13, -0x49d706bc

    goto/16 :goto_0

    :sswitch_9
    const/16 v5, 0x8

    .line 254
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v11

    if-eqz v11, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v11, "\u06ec\u0733"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0xf

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x3c1

    const v13, 0x6be38872

    xor-int/2addr v12, v13

    const v13, 0x677ed6ec

    goto/16 :goto_0

    .line 407
    :sswitch_a
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v3

    .line 408
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v4

    .line 193
    sget v11, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v11, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v11, "\u05a1\u073d"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x2a53

    const v13, -0x4dbafaf5

    xor-int/2addr v12, v13

    const v13, 0xfc0f722

    goto/16 :goto_0

    :sswitch_b
    if-ge v2, v1, :cond_5

    const-string v11, "\u1a76\u06df"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x18e3

    const v13, 0x7d46c5fa

    xor-int/2addr v12, v13

    const v13, -0x227dbf50

    goto/16 :goto_0

    :cond_5
    const-string v11, "\u06e2\u1a76"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x3d

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x3719

    const v13, 0x34e37cd6

    xor-int/2addr v12, v13

    const v13, 0x21b227f6

    goto/16 :goto_0

    .line 403
    :sswitch_c
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 404
    invoke-static {p0}, Ll/ۘܽ;->ۢ᩶۫(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    :goto_2
    const-string v11, "\u06e7\u073f"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x3f

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x6e9b

    const v13, 0x45070471

    xor-int/2addr v12, v13

    const v13, 0xe97b6ec

    goto/16 :goto_0

    :sswitch_d
    const/4 v0, 0x0

    .line 135
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_3

    :cond_6
    const-string v11, "\u0730\u06e8"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x1227

    const v13, 0x4205085c

    xor-int/2addr v12, v13

    const v13, -0x363b458e

    goto/16 :goto_0

    .line 402
    :sswitch_e
    invoke-virtual {p0}, Landroid/view/View;->cancelLongPress()V

    .line 201
    sget v11, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v11, :cond_8

    :cond_7
    :goto_3
    const-string v11, "\u06e4\u06dc"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x75

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x1c2b

    const v13, 0x54ecc725

    xor-int/2addr v12, v13

    const v13, 0x64f2f87d

    goto/16 :goto_0

    :cond_8
    const-string v11, "\u1a78\u1a7a"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x41

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x1b17

    const v13, 0x21b7fc49

    xor-int/2addr v12, v13

    const v13, 0x634897e2

    goto/16 :goto_0

    .line 215
    :sswitch_f
    sget-boolean v11, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v11, :cond_a

    :cond_9
    :goto_4
    const-string v11, "\u05a1\u1a75"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, 0x41

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x60a5

    const v13, 0x23d1a07a

    xor-int/2addr v12, v13

    const v13, 0x3a084982

    goto/16 :goto_0

    :cond_a
    const-string v11, "\u06e1\u06d9"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x2f

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x2039

    const v13, -0x7e55c2b6

    xor-int/2addr v12, v13

    const v13, -0x284525f7

    goto/16 :goto_0

    :sswitch_10
    sget v11, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v11, :cond_b

    goto :goto_5

    :cond_b
    const-string v11, "\u06e1\u05ab"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x27

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x7835

    const v13, 0x7ab4d861

    xor-int/2addr v12, v13

    const v13, -0x5888a921

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v11

    if-nez v11, :cond_d

    :cond_c
    :goto_5
    const-string v11, "\u06d8\u1a7b"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x214d

    const v13, -0x63a98aa0

    xor-int/2addr v12, v13

    const v13, 0x991da0

    goto/16 :goto_0

    :cond_d
    const-string v11, "\u1a73\u06e1"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x39

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x4931

    const v13, 0x3e6fa68a

    xor-int/2addr v12, v13

    const v13, 0x6a1e2807

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a672577 -> :sswitch_b
        -0x772fbb95 -> :sswitch_5
        -0x76dc09f8 -> :sswitch_7
        -0x665be1c4 -> :sswitch_d
        -0x664614d9 -> :sswitch_2
        -0x6383824c -> :sswitch_c
        -0x602fbd31 -> :sswitch_e
        -0x587823f5 -> :sswitch_0
        -0x4a8c16c0 -> :sswitch_1
        -0x3ef83fd5 -> :sswitch_9
        -0x3223d3fe -> :sswitch_b
        -0x306be4db -> :sswitch_f
        -0x29a7bd30 -> :sswitch_a
        -0x29876a31 -> :sswitch_10
        -0x25979f93 -> :sswitch_7
        -0x2116b738 -> :sswitch_5
        -0xbe6dd51 -> :sswitch_6
        -0x8c8e156 -> :sswitch_c
        -0x8911cf3 -> :sswitch_8
        0xae5d280 -> :sswitch_f
        0xdf486c8 -> :sswitch_6
        0x166b215d -> :sswitch_d
        0x16fa5871 -> :sswitch_11
        0x19ba8b75 -> :sswitch_0
        0x1bfc15d2 -> :sswitch_4
        0x1f55333e -> :sswitch_8
        0x2bd6776d -> :sswitch_10
        0x313303fe -> :sswitch_9
        0x372e4bd0 -> :sswitch_a
        0x3a5ef440 -> :sswitch_2
        0x3e6ab263 -> :sswitch_3
        0x49e1af36 -> :sswitch_11
        0x51129090 -> :sswitch_4
        0x54721bb2 -> :sswitch_3
        0x57746450 -> :sswitch_1
        0x749a135b -> :sswitch_e
    .end sparse-switch
.end method

.method private ᩸(Landroid/view/MotionEvent;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x7d19341

    sget v2, Ll/ۗ֨;->᩹ۜۡ:I

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v4, "\u06d9\u0736"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2295

    const v6, -0x7917fb6f

    xor-int/2addr v5, v6

    const v6, -0x1095da84

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x4b39

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 22
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v4

    if-ltz v4, :cond_2

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-gez v4, :cond_4

    goto/16 :goto_4

    .line 345
    :sswitch_1
    sget v4, Ll/ۖᩳ;->᩹ۧܳ:I

    if-lez v4, :cond_d

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v4

    if-gtz v4, :cond_a

    goto/16 :goto_4

    .line 182
    :sswitch_3
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    goto/16 :goto_4

    .line 12
    :sswitch_4
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    :sswitch_5
    return-void

    :sswitch_6
    const/4 v4, 0x3

    if-ne v0, v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u05a8\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1ff1

    const v6, 0x1c9879f9

    xor-int/2addr v5, v6

    const v6, 0x1e0c43b2

    goto :goto_0

    :sswitch_7
    const/4 v4, 0x1

    if-eq v0, v4, :cond_1

    const-string v4, "\u05a8\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6f19

    const v6, 0x76e3e72a

    xor-int/2addr v5, v6

    const v6, 0x5caa9a3e

    goto :goto_0

    :sswitch_8
    const/4 p1, 0x0

    .line 394
    iput-boolean p1, p0, Ll/ᩴܿ᩻;->ᩴۙ:Z

    return-void

    .line 392
    :sswitch_9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v4, "\u073f\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5009

    const v6, -0x513d618f

    xor-int/2addr v5, v6

    const v6, -0x6febd6f2

    goto/16 :goto_0

    :cond_1
    :goto_1
    const-string v4, "\u1a77\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4ffd

    const v6, -0x434336b0

    xor-int/2addr v5, v6

    const v6, -0x509613b7

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06d6\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5257

    const v6, -0x4942a666

    xor-int/2addr v5, v6

    const v6, -0x1304eee1

    goto/16 :goto_0

    .line 96
    :sswitch_a
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u05ab\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x15af

    const v6, 0x2fdeaf23

    xor-int/2addr v5, v6

    const v6, 0x27c80192

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    const-string v4, "\u05ab\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x791b

    const v6, -0x1f3f4ed6

    xor-int/2addr v5, v6

    const v6, -0x26dec05a

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06eb\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1e43

    const v6, -0x6c5f0fb7

    xor-int/2addr v5, v6

    const v6, -0x11596c57

    goto/16 :goto_0

    .line 115
    :sswitch_c
    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_6

    :goto_2
    const-string v4, "\u06ec\u1a74"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1e5f

    const v6, 0x62a5f423

    xor-int/2addr v5, v6

    const v6, 0x3328ee73

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a76\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x14a9

    const v6, 0x796d3d85

    xor-int/2addr v5, v6

    const v6, 0x6a2f25c5    # 5.2935095E25f

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v4, "\u1a75\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2dab

    const v6, -0x345482f0    # -2.2477344E7f

    xor-int/2addr v5, v6

    const v6, 0x505e930d

    goto/16 :goto_0

    .line 100
    :sswitch_e
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v4, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v4, "\u06ec\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7021

    const v6, -0x3cc421bd

    xor-int/2addr v5, v6

    const v6, 0xa523848

    goto/16 :goto_0

    .line 51
    :sswitch_f
    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_9

    goto/16 :goto_5

    :cond_9
    const-string v4, "\u06d9\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7635

    const v6, -0x1620602b

    xor-int/2addr v5, v6

    const v6, 0x14555fb0

    goto/16 :goto_0

    .line 207
    :sswitch_10
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u1a78\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x13b

    const v6, 0x450dde98

    xor-int/2addr v5, v6

    const v6, -0x1f60c533

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06db\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2107

    const v6, -0x58956037

    xor-int/2addr v5, v6

    const v6, 0x2acefc0a

    goto/16 :goto_0

    :sswitch_11
    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u06eb\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa9b

    const v6, -0x37ec50b9

    xor-int/2addr v5, v6

    const v6, -0x2fbd6269

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a79\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2b69

    const v6, 0x53b8b3e

    xor-int/2addr v5, v6

    const v6, -0x316390de

    goto/16 :goto_0

    .line 187
    :sswitch_12
    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v4, :cond_e

    :cond_d
    :goto_5
    const-string v4, "\u06db\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6b97

    const v6, -0x5db0a26a

    xor-int/2addr v5, v6

    const v6, -0x3894980d

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u0736\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x14bd

    const v6, 0x71ea9214

    xor-int/2addr v5, v6

    const v6, 0x7bbeb3c0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6d25d47d -> :sswitch_b
        -0x6b67bfae -> :sswitch_7
        -0x6899af26 -> :sswitch_3
        -0x606c88ed -> :sswitch_f
        -0x592b5d2c -> :sswitch_12
        -0x526acd17 -> :sswitch_2
        -0x4f82d88f -> :sswitch_6
        -0x49492477 -> :sswitch_6
        -0x45bea071 -> :sswitch_c
        -0x35fa23b4 -> :sswitch_a
        -0x35924c9a -> :sswitch_a
        -0x33234d91 -> :sswitch_f
        -0x2fd7f6d0 -> :sswitch_9
        -0x2f5d6233 -> :sswitch_b
        -0x2f1283df -> :sswitch_10
        -0x284689ef -> :sswitch_3
        -0x26cb1701 -> :sswitch_0
        -0x15925d98 -> :sswitch_e
        -0xb1e2d96 -> :sswitch_4
        -0x27dc9c3 -> :sswitch_1
        0x6e73f0e -> :sswitch_9
        0xfb27821 -> :sswitch_12
        0x1f53900b -> :sswitch_5
        0x2ef15a36 -> :sswitch_d
        0x31ddaa6f -> :sswitch_e
        0x3a51c51c -> :sswitch_7
        0x49d8e242 -> :sswitch_c
        0x4c72c9ba -> :sswitch_11
        0x5f1df6d7 -> :sswitch_11
        0x5f2cac61 -> :sswitch_8
        0x67ac9661 -> :sswitch_5
        0x6844e990 -> :sswitch_4
        0x6a7aceb3 -> :sswitch_d
        0x6dbc1cb8 -> :sswitch_10
        0x6fe10cac -> :sswitch_1
        0x711583b2 -> :sswitch_8
        0x748b2ee5 -> :sswitch_0
        0x75e33ca6 -> :sswitch_2
    .end sparse-switch
.end method

.method public static ᩸(Ll/ᩴܿ᩻;)Z
    .locals 11

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const v5, 0x34c4beb8

    sget v6, Ll/֡᩵;->ۤܳ۬:I

    sget v7, Ll/֫ۢ;->ۚ᩻᩵:I

    const-string v8, "\u06e8\u1a7a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x40df

    const v10, -0x4dd01cff

    xor-int/2addr v9, v10

    const v10, -0x3abfe92b

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, 0x4a7d

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    const/4 p0, 0x0

    return p0

    :sswitch_0
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget-boolean v8, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v8, :cond_a

    goto/16 :goto_1

    .line 11
    :sswitch_1
    sget v8, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v8, :cond_c

    goto/16 :goto_2

    .line 32
    :sswitch_2
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget v8, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v8, :cond_8

    goto/16 :goto_1

    .line 19
    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    goto/16 :goto_1

    .line 169
    :sswitch_4
    iput-wide v3, p0, Ll/ᩴܿ᩻;->ܿ:J

    return v2

    :sswitch_5
    const/4 p0, 0x0

    return p0

    :sswitch_6
    return v2

    .line 168
    :sswitch_7
    invoke-static {}, Ll/ۘܶ;->ܽܿܽ()J

    move-result-wide v8

    cmp-long v10, v8, v0

    if-lez v10, :cond_0

    const-string v8, "\u06d6\u1a7a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x53

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7c7f

    const v10, 0x4fe10154    # 7.5499213E9f

    xor-int/2addr v9, v10

    const v10, -0x4b656ef6

    goto :goto_0

    :cond_0
    const-string v8, "\u06eb\u06d8"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x23

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x1129

    const v10, -0x37fc6197

    xor-int/2addr v9, v10

    const v10, 0x223b2995

    goto :goto_0

    :sswitch_8
    const-wide/16 v3, 0x0

    cmp-long v8, v0, v3

    if-nez v8, :cond_1

    const-string v8, "\u073f\u06e2"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x31

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x72e7

    const v10, 0x2a065839

    xor-int/2addr v9, v10

    const v10, 0x6b1b81bb

    goto/16 :goto_0

    :cond_1
    const-string v8, "\u06eb\u0730"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x35

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x6697

    const v10, 0x77ee8460

    xor-int/2addr v9, v10

    const v10, -0x3db99a79

    goto/16 :goto_0

    :sswitch_9
    const/4 v2, 0x1

    .line 152
    sget v8, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v8, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v8, "\u1a79\u073a"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x47

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5b43

    const v10, 0x321bc35

    xor-int/2addr v9, v10

    const v10, 0xc212e13

    goto/16 :goto_0

    .line 157
    :sswitch_a
    sget v8, Ll/ۖ;->ܿۚ֡:I

    if-ltz v8, :cond_3

    goto :goto_1

    :cond_3
    const-string v8, "\u06d8\u06d8"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0xf

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x287d

    const v10, 0x5c9ed85

    xor-int/2addr v9, v10

    const v10, 0x4adf8c2f    # 7325207.5f

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v8

    if-eqz v8, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v8, "\u05a8\u06d8"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x45

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2795

    const v10, -0x33d56aaf    # -4.471738E7f

    xor-int/2addr v9, v10

    const v10, -0x57946e26

    goto/16 :goto_0

    .line 88
    :sswitch_c
    sget v8, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v8, :cond_5

    goto :goto_1

    :cond_5
    const-string v8, "\u06ec\u0736"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x4d9f

    const v10, 0x6a6e5426

    xor-int/2addr v9, v10

    const v10, 0x600a006b

    goto/16 :goto_0

    .line 93
    :sswitch_d
    sget v8, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v8, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v8, "\u05a8\u1a73"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x44cf

    const v10, 0x3eb68e1

    xor-int/2addr v9, v10

    const v10, -0x26c9d675

    goto/16 :goto_0

    .line 166
    :sswitch_e
    sget v8, Ll/֫֡;->֫ۙۖ:I

    if-gtz v8, :cond_7

    :goto_1
    const-string v8, "\u06d9\u073d"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x7d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x1a1b

    const v10, -0x6d07a6f3

    xor-int/2addr v9, v10

    const v10, 0x24df210b

    goto/16 :goto_0

    :cond_7
    const-string v8, "\u06e0\u1a73"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6f55

    const v10, 0x4b3d1ea4    # 1.2394148E7f

    xor-int/2addr v9, v10

    const v10, -0x18eac918

    goto/16 :goto_0

    .line 138
    :sswitch_f
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    :goto_2
    const-string v8, "\u0733\u05a1"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x69

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x780f

    const v10, 0x65c3e9f3

    xor-int/2addr v9, v10

    const v10, 0x279306bc

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u1a77\u06e7"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x402f

    const v10, -0x4fe3780c

    xor-int/2addr v9, v10

    const v10, -0x3325f35

    goto/16 :goto_0

    .line 165
    :sswitch_10
    sget v8, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v8, :cond_b

    :cond_a
    :goto_3
    const-string v8, "\u073f\u06d7"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x71

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5707

    const v10, 0x4117ef0d

    xor-int/2addr v9, v10

    const v10, 0x222646ee

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u05a1\u06d8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x63

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x42e5

    const v10, -0x387837c9

    xor-int/2addr v9, v10

    const v10, -0x2692685d

    goto/16 :goto_0

    :sswitch_11
    sget v8, Ll/֫֡;->֫ۙۖ:I

    if-gtz v8, :cond_d

    :cond_c
    const-string v8, "\u06e8\u1a77"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x699f

    const v10, 0x3c519f73

    xor-int/2addr v9, v10

    const v10, -0x5df0745e

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06d6\u06e7"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x12df

    const v10, 0x453e6794

    xor-int/2addr v9, v10

    const v10, 0x7b417688

    goto/16 :goto_0

    .line 164
    :sswitch_12
    iget-wide v0, p0, Ll/ᩴܿ᩻;->ܿ:J

    .line 87
    sget v8, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v8, :cond_e

    :goto_4
    const-string v8, "\u06d8\u06ec"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x4e9f

    const v10, 0x44be2928

    xor-int/2addr v9, v10

    const v10, 0x6d8f109b

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u06e4\u06df"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x49

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x6ab3

    const v10, 0x1d842739

    xor-int/2addr v9, v10

    const v10, -0x2319fb57

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6c078f2d -> :sswitch_12
        -0x68a97803 -> :sswitch_9
        -0x518ea072 -> :sswitch_a
        -0x4edbe5f3 -> :sswitch_7
        -0x4d5f25f2 -> :sswitch_5
        -0x4d37c88c -> :sswitch_8
        -0x48527f58 -> :sswitch_4
        -0x463777fd -> :sswitch_3
        -0x4552a694 -> :sswitch_1
        -0x422c2c59 -> :sswitch_c
        -0x3cf42170 -> :sswitch_a
        -0x3915b736 -> :sswitch_2
        -0x2314d151 -> :sswitch_d
        -0x21dc362f -> :sswitch_7
        -0x1fff2c67 -> :sswitch_9
        -0x18a5a183 -> :sswitch_0
        -0x15d786cc -> :sswitch_0
        -0xe6bc655 -> :sswitch_10
        -0x812e847 -> :sswitch_8
        0x4efee46 -> :sswitch_b
        0x7ea7d20 -> :sswitch_6
        0xd14d073 -> :sswitch_3
        0xdfd3852 -> :sswitch_f
        0x1421471f -> :sswitch_b
        0x16f30167 -> :sswitch_5
        0x197757d5 -> :sswitch_11
        0x1c412e5a -> :sswitch_11
        0x22517e53 -> :sswitch_f
        0x37262838 -> :sswitch_c
        0x3931241f -> :sswitch_2
        0x4e6b1239 -> :sswitch_4
        0x4f9573b5 -> :sswitch_12
        0x51a82883 -> :sswitch_10
        0x5d3faa05 -> :sswitch_6
        0x64cc9636 -> :sswitch_e
        0x65c74534 -> :sswitch_1
        0x6dc04c89 -> :sswitch_d
        0x761b0e69 -> :sswitch_e
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

    const v7, -0x2a5a2135

    sget v8, Ll/֡ۖ;->۫ۙ᩶:I

    sget v9, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v10, "\u0730\u0733"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit8 v11, v11, -0xd

    const v12, 0x7ddfa472

    xor-int/2addr v11, v12

    const v12, 0x775603f8

    :goto_0
    xor-int/2addr v10, v12

    :goto_1
    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, 0x576f

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 337
    sget-boolean v10, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v10, :cond_1b

    goto/16 :goto_a

    .line 431
    :sswitch_0
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    sget v10, Ll/֡۟;->᩶᩺ܰ:I

    if-lez v10, :cond_14

    goto/16 :goto_3

    .line 112
    :sswitch_1
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget-boolean v10, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v10, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v10, "\u0736\u06e2"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x7d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x515b

    const v12, 0x40ce68a6

    xor-int/2addr v11, v12

    const v12, -0x2c47cc70

    goto :goto_0

    :sswitch_2
    sget v10, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v10, :cond_1

    goto :goto_2

    :cond_1
    const-string v10, "\u05a8\u1a7b"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x7f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1ff1

    const v12, -0x1fb794e6

    xor-int/2addr v11, v12

    const v12, -0x9fedde6

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    sget-boolean v10, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v10, :cond_2

    goto/16 :goto_7

    :cond_2
    const-string v10, "\u1a78\u06eb"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x43

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4e9d

    const v12, -0x69e35a4c

    xor-int/2addr v11, v12

    const v12, -0x7f7d6bd0

    goto :goto_0

    .line 328
    :sswitch_4
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v10

    if-eqz v10, :cond_1a

    goto/16 :goto_7

    :sswitch_5
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v10, Ll/֫֨;->᩶ܺۡ:I

    if-lez v10, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string v10, "\u06e1\u1a77"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x3b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6d39

    const v12, -0x4817bb1f

    xor-int/2addr v11, v12

    const v12, -0x1365e1e

    goto/16 :goto_0

    .line 271
    :sswitch_6
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v10

    if-eqz v10, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    const-string v10, "\u073d\u06e8"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6a55

    const v12, -0x2648d652

    xor-int/2addr v11, v12

    const v12, -0x3b5c8598

    goto/16 :goto_0

    .line 416
    :sswitch_7
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v10

    if-ltz v10, :cond_5

    goto/16 :goto_7

    :cond_5
    :goto_3
    const-string v10, "\u073d\u06d7"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1161

    const v12, 0x2cb8a21

    xor-int/2addr v11, v12

    const v12, 0x2d9d7149

    goto/16 :goto_0

    .line 453
    :sswitch_8
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto/16 :goto_7

    .line 197
    :sswitch_9
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    const/4 p1, 0x0

    return p1

    :sswitch_a
    return v6

    :sswitch_b
    return v2

    .line 465
    :sswitch_c
    iput-boolean v2, p0, Ll/ᩴܿ᩻;->ۧۙ:Z

    .line 466
    invoke-direct {p0, p1}, Ll/ᩴܿ᩻;->ۙ(Landroid/view/MotionEvent;)V

    return v2

    :sswitch_d
    if-ne v0, v3, :cond_7

    goto :goto_4

    .line 472
    :sswitch_e
    iput-boolean v1, p0, Ll/ᩴܿ᩻;->ۧۙ:Z

    return v2

    :sswitch_f
    if-ne v0, v3, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v10, "\u073a\u06e8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x75

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3169

    const v12, -0x4bf83eed

    xor-int/2addr v11, v12

    const v12, -0x3358a7e1    # -8.773657E7f

    goto/16 :goto_0

    .line 478
    :sswitch_10
    iput-boolean v1, p0, Ll/ᩴܿ᩻;->ۧۙ:Z

    return v6

    :sswitch_11
    if-ne v0, v3, :cond_7

    goto/16 :goto_6

    .line 483
    :sswitch_12
    invoke-direct {p0, p1}, Ll/ᩴܿ᩻;->᩸(Landroid/view/MotionEvent;)V

    return v2

    .line 462
    :sswitch_13
    invoke-direct {p0, p1}, Ll/ᩴܿ᩻;->ۤ(Landroid/view/MotionEvent;)Z

    move-result v10

    if-eqz v10, :cond_8

    :cond_7
    const-string v10, "\u06e0\u06e2"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4573

    const v12, 0x4e0ef754    # 5.996434E8f

    xor-int/2addr v11, v12

    const v12, 0x890204

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u06da\u073d"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x71

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x33db

    const v12, -0x15945d0c

    xor-int/2addr v11, v12

    const v12, 0x559c53fd

    goto/16 :goto_0

    :sswitch_14
    if-eq v0, v2, :cond_9

    const-string v10, "\u1a7b\u1a77"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x19

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x146f

    const v12, -0x76fd0d92

    xor-int/2addr v11, v12

    const v12, -0x40b2ac5f

    goto/16 :goto_0

    :cond_9
    :goto_4
    const-string v10, "\u06da\u05a8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x1b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x74cd

    const v12, 0x4348af5c

    xor-int/2addr v11, v12

    const v12, 0x427b0852

    goto/16 :goto_0

    .line 476
    :sswitch_15
    invoke-virtual {p0, p1}, Ll/ᩴܿ᩻;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v6

    if-eq v0, v2, :cond_a

    const-string v10, "\u0733\u06db"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x77

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2b1b

    const v12, 0x6fdc15a8

    xor-int/2addr v11, v12

    const v12, 0x3a118526

    goto/16 :goto_0

    :cond_a
    :goto_5
    const-string v10, "\u073f\u073d"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x53

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x566d

    const v12, -0x412b8c0d

    xor-int/2addr v11, v12

    const v12, -0x36175b79

    goto/16 :goto_0

    :sswitch_16
    if-eq v0, v2, :cond_b

    const-string v10, "\u1a79\u073d"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x55a9

    const v12, 0x22ae251

    xor-int/2addr v11, v12

    const v12, -0x288352eb

    goto/16 :goto_0

    :cond_b
    :goto_6
    const-string v10, "\u06eb\u06eb"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1b47

    const v12, -0x41616381

    xor-int/2addr v11, v12

    const v12, -0x145a7ba3

    goto/16 :goto_0

    .line 377
    :sswitch_17
    iget-object v10, p0, Ll/ᩴܿ᩻;->ۙۙ:Ll/᩸᩷ܺ;

    invoke-virtual {v10, v4, v5}, Ll/᩸᩷ܺ;->᩷(FF)Z

    move-result v10

    if-eqz v10, :cond_e

    const-string v10, "\u073a\u06db"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x13

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x379f

    const v12, -0x5aea1c5d    # -1.3000816E-16f

    xor-int/2addr v11, v12

    const v12, -0x19960c74

    goto/16 :goto_0

    :sswitch_18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 428
    sget v10, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v10, :cond_c

    :goto_7
    const-string v10, "\u1a74\u06d8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x3f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x651b

    const v12, 0x3942ea5a

    xor-int/2addr v11, v12

    const v12, 0x76e5657c

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u1a73\u05a8"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2f65

    const v12, -0x40e69b21

    xor-int/2addr v11, v12

    const v12, -0x4aaab194

    goto/16 :goto_0

    .line 487
    :sswitch_19
    invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 470
    :sswitch_1a
    invoke-direct {p0, p1}, Ll/ᩴܿ᩻;->ۤ(Landroid/view/MotionEvent;)Z

    move-result v10

    if-eqz v10, :cond_d

    const-string v10, "\u06df\u06d6"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6d2b

    const v12, -0x993051e

    xor-int/2addr v11, v12

    const v12, -0x5b1d7134

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u05ab\u073d"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x3d57

    const v12, 0x310928f5

    xor-int/2addr v11, v12

    const v12, -0x33712fb9    # -7.487545E7f

    goto/16 :goto_0

    .line 481
    :sswitch_1b
    iget-boolean v10, p0, Ll/ᩴܿ᩻;->ᩴۙ:Z

    if-eqz v10, :cond_e

    const-string v10, "\u05ab\u06d7"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x45

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1095

    const v12, -0xec114de

    xor-int/2addr v11, v12

    const v12, 0x3774bfe0

    goto/16 :goto_0

    .line 459
    :sswitch_1c
    invoke-direct {p0, p1}, Ll/ᩴܿ᩻;->᩸(Landroid/view/MotionEvent;)V

    .line 460
    iput-boolean v1, p0, Ll/ᩴܿ᩻;->ۧۙ:Z

    .line 377
    invoke-direct {p0}, Ll/ᩴܿ᩻;->ᩴ()Z

    move-result v10

    if-eqz v10, :cond_e

    const-string v10, "\u06dc\u06d6"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x27c1

    const v12, 0x2d6ea1f2

    xor-int/2addr v11, v12

    const v12, 0x74f7ca06

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u0733\u06e7"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5a87

    const v12, -0x74d31bda

    xor-int/2addr v11, v12

    const v12, -0xaad2594

    goto/16 :goto_0

    .line 469
    :sswitch_1d
    iget-boolean v3, p0, Ll/ᩴܿ᩻;->ۧۙ:Z

    const/4 v10, 0x3

    if-eqz v3, :cond_f

    const-string v3, "\u1a76\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v8

    mul-int/lit8 v3, v3, 0x3b

    xor-int v11, v3, v9

    mul-int/lit16 v11, v11, 0x24fd

    const v12, -0x7217d170

    xor-int/2addr v11, v12

    const v12, -0x7f442e38

    goto :goto_8

    :cond_f
    const-string v3, "\u06da\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v8

    mul-int/lit8 v3, v3, -0x19

    xor-int v11, v3, v9

    mul-int/lit16 v11, v11, -0x5a09

    const v12, -0x37e6f3dc

    xor-int/2addr v11, v12

    const v12, 0x39b9a533

    :goto_8
    xor-int/2addr v3, v12

    move v10, v3

    const/4 v3, 0x3

    goto/16 :goto_1

    :sswitch_1e
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_10

    const-string v10, "\u06eb\u06d6"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6c21

    const v12, 0x29bd07d8

    xor-int/2addr v11, v12

    const v12, 0x971b850

    goto/16 :goto_0

    :cond_10
    const-string v10, "\u06e4\u1a79"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3889

    const v12, 0xded28c0

    xor-int/2addr v11, v12

    const v12, 0x4b99020

    goto/16 :goto_0

    .line 457
    :sswitch_1f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v10

    if-gtz v10, :cond_11

    goto/16 :goto_9

    :cond_11
    const-string v10, "\u1a78\u1a75"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x69

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x568f

    const v12, -0x2b45cd4f

    xor-int/2addr v11, v12

    const v12, -0x24386b18

    goto/16 :goto_0

    .line 49
    :sswitch_20
    sget v10, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v10, :cond_12

    goto :goto_9

    :cond_12
    const-string v10, "\u06db\u0730"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x4f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x66cd

    const v12, 0x5de9949e

    xor-int/2addr v11, v12

    const v12, -0x43a8a5c9

    goto/16 :goto_0

    .line 312
    :sswitch_21
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v10

    if-eqz v10, :cond_13

    goto :goto_9

    :cond_13
    const-string v10, "\u06d7\u073d"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x66b9

    const v12, 0x540c13af

    xor-int/2addr v11, v12

    const v12, -0x4e1c9933

    goto/16 :goto_0

    .line 176
    :sswitch_22
    sget v10, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v10, :cond_15

    :cond_14
    const-string v10, "\u1a76\u06e7"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x799d

    const v12, 0x795d2649

    xor-int/2addr v11, v12

    const v12, -0x6c9cd3d3

    goto/16 :goto_0

    :cond_15
    const-string v10, "\u1a77\u06e2"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x75

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1d4b

    const v12, 0x29612923    # 4.9995717E-14f

    xor-int/2addr v11, v12

    const v12, -0x5865eec

    goto/16 :goto_0

    :sswitch_23
    sget-boolean v10, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v10, :cond_16

    :goto_9
    const-string v10, "\u0730\u06dc"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x64c5

    const v12, 0x12339559

    xor-int/2addr v11, v12

    const v12, 0x436f396e

    goto/16 :goto_0

    :cond_16
    const-string v10, "\u073a\u05a8"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5cd1

    const v12, -0x949e448

    xor-int/2addr v11, v12

    const v12, -0x668d5d9a

    goto/16 :goto_0

    .line 90
    :sswitch_24
    sget v10, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v10, :cond_17

    goto :goto_a

    :cond_17
    const-string v10, "\u1a75\u06ec"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x6f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x69f1

    const v12, 0x6112dfe3

    xor-int/2addr v11, v12

    const v12, 0x4f570232

    goto/16 :goto_0

    .line 257
    :sswitch_25
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v10

    if-nez v10, :cond_18

    goto :goto_a

    :cond_18
    const-string v10, "\u06d9\u05ab"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x37

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4875

    const v12, -0x4e8f2f1

    xor-int/2addr v11, v12

    const v12, -0x2c64f2bb

    goto/16 :goto_0

    .line 162
    :sswitch_26
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v10

    if-nez v10, :cond_19

    goto :goto_a

    :cond_19
    const-string v10, "\u1a75\u073a"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6133

    const v12, 0x72bc8d71

    xor-int/2addr v11, v12

    const v12, -0x216c9d21

    goto/16 :goto_0

    :cond_1a
    :goto_a
    const-string v10, "\u06df\u06e2"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x19

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x5001

    const v12, -0x3204b196    # -5.2702752E8f

    xor-int/2addr v11, v12

    const v12, 0x564c96fd

    goto/16 :goto_0

    :cond_1b
    const-string v10, "\u06dc\u05a8"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x33

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x57db

    const v12, -0x534ea9e8

    xor-int/2addr v11, v12

    const v12, -0x3a7bc586

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cd939e7 -> :sswitch_d
        -0x7bf4cab3 -> :sswitch_13
        -0x786d5eee -> :sswitch_c
        -0x767bed88 -> :sswitch_16
        -0x75b16bdc -> :sswitch_9
        -0x74e94b5c -> :sswitch_18
        -0x6c6d09e7 -> :sswitch_1d
        -0x6be91141 -> :sswitch_1e
        -0x68811560 -> :sswitch_1
        -0x685db7d6 -> :sswitch_b
        -0x61a50cc9 -> :sswitch_1c
        -0x5f56414c -> :sswitch_1b
        -0x5f035759 -> :sswitch_14
        -0x53093303 -> :sswitch_23
        -0x52d3a235 -> :sswitch_d
        -0x4c57d346 -> :sswitch_9
        -0x4b46ece6 -> :sswitch_2
        -0x4a02bfc9 -> :sswitch_20
        -0x4549ffa1 -> :sswitch_8
        -0x42376fec -> :sswitch_b
        -0x3f429f61 -> :sswitch_7
        -0x3f37b6bb -> :sswitch_1e
        -0x3dd69800 -> :sswitch_10
        -0x3ad783d7 -> :sswitch_23
        -0x39e82504 -> :sswitch_3
        -0x376f64f7 -> :sswitch_15
        -0x36f3e252 -> :sswitch_16
        -0x33e7f3b1 -> :sswitch_21
        -0x2d56cb0c -> :sswitch_e
        -0x27b35d3e -> :sswitch_20
        -0x249725b2 -> :sswitch_15
        -0x22872da4 -> :sswitch_a
        -0x21bd0ee3 -> :sswitch_13
        -0x1a484756 -> :sswitch_1
        -0x1a0ba802 -> :sswitch_1f
        -0x14103b88 -> :sswitch_7
        -0x10445b7f -> :sswitch_12
        -0xe42af02 -> :sswitch_26
        -0x756ab93 -> :sswitch_1b
        -0x6f5e8d1 -> :sswitch_1f
        -0x2c3b24e -> :sswitch_24
        -0x47cad5 -> :sswitch_5
        0x23d2215 -> :sswitch_3
        0x816f7c9 -> :sswitch_c
        0xd9218a4 -> :sswitch_6
        0xe59d1e4 -> :sswitch_22
        0x11c248ad -> :sswitch_4
        0x1223e3e8 -> :sswitch_8
        0x14f702d4 -> :sswitch_1c
        0x15d5832a -> :sswitch_e
        0x17dc33e2 -> :sswitch_26
        0x1ad67cb1 -> :sswitch_21
        0x1c6fe350 -> :sswitch_2
        0x1fca8cf4 -> :sswitch_1d
        0x227de1d5 -> :sswitch_17
        0x25822f49 -> :sswitch_a
        0x2c8648d6 -> :sswitch_25
        0x2f14346e -> :sswitch_12
        0x2f3c9ac2 -> :sswitch_f
        0x30f34dda -> :sswitch_4
        0x31e2c187 -> :sswitch_24
        0x3502aa0d -> :sswitch_10
        0x3f7d7b56 -> :sswitch_14
        0x405400dd -> :sswitch_11
        0x4771217e -> :sswitch_0
        0x49bbcf96 -> :sswitch_25
        0x6254b916 -> :sswitch_19
        0x6279aa54 -> :sswitch_19
        0x64af1323 -> :sswitch_6
        0x6687500b -> :sswitch_0
        0x6a9f5822 -> :sswitch_5
        0x6ac75d3e -> :sswitch_22
        0x6fe63c0d -> :sswitch_17
        0x70ca5082 -> :sswitch_f
        0x70e9ecc0 -> :sswitch_18
        0x7267143c -> :sswitch_1a
        0x72b706d4 -> :sswitch_1a
        0x75ef4218 -> :sswitch_11
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

    const v33, 0x7e9d1719

    sget v34, Ll/ۖܰ;->۟֫ܽ:I

    sget v35, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v36, "\u1a79\u1a78"

    invoke-static/range {v36 .. v36}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v36

    add-int v36, v36, v34

    mul-int/lit8 v36, v36, 0x37

    xor-int v1, v36, v35

    mul-int/lit16 v1, v1, 0x743

    const v38, -0x6de9859b

    xor-int v1, v1, v38

    const v38, -0x485ce832

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

    const v16, 0x7e9d1719

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

    mul-int/lit16 v11, v11, -0x61bd

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v1, v11

    xor-int v1, v37, v1

    sparse-switch v1, :sswitch_data_0

    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    and-int v27, v26, v18

    ushr-int/lit8 v28, v26, 0x18

    const/16 v29, 0xff

    .line 257
    sget v9, Ll/۬;->᩸ۜ᩹:I

    if-eqz v9, :cond_c

    goto/16 :goto_5

    :sswitch_0
    sget v11, Ll/֫֡;->֫ۙۖ:I

    if-lez v11, :cond_0

    move/from16 v37, v1

    goto/16 :goto_2

    :cond_0
    const-string v11, "\u06ec\u073f"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    move/from16 v37, v1

    xor-int v1, v11, v34

    mul-int/lit16 v1, v1, 0x6ee1

    const v16, 0x8d8173e

    xor-int v1, v1, v16

    const v16, -0x27f1bc1

    xor-int v11, v11, v16

    move/from16 v16, v37

    move/from16 v37, v11

    goto :goto_0

    :sswitch_1
    move/from16 v37, v1

    .line 297
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v1

    if-gtz v1, :cond_2

    :cond_1
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    goto/16 :goto_d

    :cond_2
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    goto/16 :goto_5

    :sswitch_2
    move/from16 v37, v1

    .line 104
    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-nez v1, :cond_4

    :cond_3
    :goto_1
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    goto/16 :goto_e

    :cond_4
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    goto/16 :goto_10

    :sswitch_3
    move/from16 v37, v1

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v1, "\u06e8\u1a77"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v11, v1, v35

    mul-int/lit16 v11, v11, -0x4c5b

    const v16, -0x7e1976dd

    xor-int v11, v11, v16

    const v16, 0x5fe54f90

    goto :goto_3

    :sswitch_4
    move/from16 v37, v1

    .line 214
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v1

    if-ltz v1, :cond_1

    :cond_6
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move-object/from16 v42, v15

    goto/16 :goto_b

    :sswitch_5
    move/from16 v37, v1

    .line 15
    sget v1, Ll/ۖۖ;->᩵ۜ֨:I

    if-gez v1, :cond_7

    goto :goto_1

    :cond_7
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    goto/16 :goto_13

    :sswitch_6
    move/from16 v37, v1

    .line 100
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget v1, Ll/ۖۗ;->᩻ܳܶ:I

    if-lez v1, :cond_6

    goto :goto_1

    :sswitch_7
    move/from16 v37, v1

    .line 287
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :sswitch_8
    move/from16 v37, v1

    .line 45
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    :goto_2
    const-string v1, "\u1a77\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v11, v1, v34

    mul-int/lit16 v11, v11, 0x436d

    const v16, 0x38867a66

    xor-int v11, v11, v16

    const v16, -0x3bd86920

    :goto_3
    xor-int v1, v1, v16

    move/from16 v16, v37

    move/from16 v37, v1

    move v1, v11

    goto/16 :goto_0

    .line 74
    :sswitch_9
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    return-void

    :sswitch_a
    move/from16 v37, v1

    float-to-int v1, v9

    sub-float v11, v4, v21

    int-to-float v1, v1

    move/from16 v39, v9

    add-float v9, v1, v31

    .line 311
    invoke-virtual {v3, v11, v1, v4, v9}, Ll/᩸᩷ܺ;->ۙ(FFFF)V

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

    goto/16 :goto_19

    :sswitch_b
    move/from16 v37, v1

    move-object/from16 v40, v3

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    move-object/from16 v42, v15

    .line 309
    invoke-static {v8, v10}, Ll/ۖۖ;->ۨ۟᩻(II)I

    move-result v9

    int-to-float v9, v9

    mul-float v9, v9, v32

    .line 13
    sget-boolean v11, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v11, :cond_8

    move/from16 v39, v9

    move/from16 v11, v38

    move/from16 v9, v41

    move-object/from16 v15, v42

    goto/16 :goto_13

    :cond_8
    const-string v11, "\u05ab\u06e7"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v34, v11

    mul-int/lit8 v11, v11, -0x5d

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, -0x13d1

    const v13, -0x6e762622

    xor-int/2addr v12, v13

    const v13, -0x258b1049

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

    .line 167
    sget v9, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v9, :cond_9

    move/from16 v11, v38

    move/from16 v9, v41

    move-object/from16 v15, v42

    goto/16 :goto_e

    :cond_9
    const-string v9, "\u073f\u05a8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v35

    xor-int v11, v9, v34

    mul-int/lit16 v11, v11, -0x3eed

    const v12, 0x73c50f7e

    xor-int/2addr v11, v12

    const v12, -0x1f0fbb2a

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
    iget v9, v0, Ll/ᩴܿ᩻;->ۡ:F

    .line 209
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v11

    if-nez v11, :cond_a

    move/from16 v31, v9

    goto :goto_4

    :cond_a
    const-string v11, "\u05a1\u06ec"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v34

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, -0x4ed5

    const v13, -0x3adb91ab

    xor-int/2addr v12, v13

    const v13, 0x359de09

    xor-int/2addr v11, v13

    move v14, v1

    move/from16 v31, v9

    move v1, v12

    move/from16 v16, v37

    move/from16 v9, v39

    move/from16 v13, v41

    goto/16 :goto_12

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

    .line 301
    sget v9, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v9, :cond_b

    :goto_4
    const-string v9, "\u1a78\u1a75"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v35

    xor-int v11, v9, v34

    mul-int/lit16 v11, v11, -0x6e29

    const v12, -0x31374159

    xor-int/2addr v11, v12

    const v12, -0x609baeed

    goto/16 :goto_7

    :cond_b
    const-string v9, "\u06e1\u05a8"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v35

    xor-int v11, v9, v34

    mul-int/lit16 v11, v11, -0x28f5

    const v12, -0x709c5b18

    xor-int/2addr v11, v12

    const v12, 0x7479627f

    goto :goto_7

    :goto_5
    const-string v9, "\u06d8\u073f"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v34

    xor-int v11, v9, v35

    mul-int/lit16 v11, v11, 0x7ea7

    const v12, 0x1b4edaba

    xor-int/2addr v11, v12

    const v12, 0x11e76ee3

    goto :goto_7

    :cond_c
    const-string v9, "\u05a8\u1a76"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int v9, v9, v34

    mul-int/lit8 v9, v9, -0x37

    xor-int v11, v9, v35

    mul-int/lit16 v11, v11, 0x1589

    const v12, 0x35b5bdd7

    xor-int/2addr v11, v12

    const v12, -0x3ac342a5

    goto :goto_7

    :sswitch_f
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    .line 303
    sget v9, Ll/ۗۡ֫;->ۙ:I

    goto :goto_6

    :sswitch_10
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    iget v9, v0, Ll/ᩴܿ᩻;->֨:I

    :goto_6
    move/from16 v26, v9

    const-string v9, "\u06d9\u06e2"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v35

    xor-int v11, v9, v34

    mul-int/lit16 v11, v11, -0x3ea7

    const v12, 0x15a41bc1

    xor-int/2addr v11, v12

    const v12, 0x7e0dc600

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

    goto/16 :goto_25

    :sswitch_11
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

    goto/16 :goto_1f

    :sswitch_12
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

    goto/16 :goto_14

    :cond_d
    move/from16 v16, v1

    move/from16 v36, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move/from16 v9, v41

    move v14, v2

    goto/16 :goto_1d

    :sswitch_13
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
    iget-boolean v11, v0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    if-eqz v11, :cond_e

    const-string v11, "\u0736\u05a8"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v34, v11

    mul-int/lit8 v11, v11, -0x5

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, -0x2337

    const v13, 0x1558ef33

    xor-int/2addr v12, v13

    const v13, 0x8c9b4d8

    goto :goto_9

    :cond_e
    const-string v11, "\u05a8\u06da"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    xor-int v12, v11, v34

    mul-int/lit16 v12, v12, 0x40db

    const v13, 0x2d1f9900

    xor-int/2addr v12, v13

    const v13, 0x3549baa6

    :goto_9
    xor-int/2addr v11, v13

    move v14, v1

    move v13, v9

    move v1, v12

    move/from16 v16, v37

    move/from16 v9, v39

    :goto_a
    move-object/from16 v15, v42

    goto/16 :goto_12

    :sswitch_14
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move-object/from16 v42, v15

    .line 299
    iget v11, v0, Ll/ᩴܿ᩻;->ۖ:F

    mul-float v22, v11, v6

    .line 122
    sget v12, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v12, :cond_f

    move/from16 v21, v11

    :goto_b
    const-string v11, "\u05ab\u05a1"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v34

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, -0x7911

    const v13, 0x2f3c1081

    xor-int/2addr v12, v13

    const v13, -0x14771c9b

    goto :goto_9

    :cond_f
    const-string v12, "\u06db\u0733"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v34

    xor-int v13, v12, v35

    mul-int/lit16 v13, v13, 0x3041

    const v14, 0x1df26f52

    xor-int/2addr v13, v14

    const v14, 0x3dabdf97

    xor-int/2addr v12, v14

    move v14, v1

    move/from16 v21, v11

    move v1, v13

    move/from16 v16, v37

    move-object/from16 v15, v42

    :goto_c
    move v13, v9

    move/from16 v37, v12

    goto/16 :goto_1a

    :sswitch_15
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

    sget v11, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v11, :cond_10

    :goto_d
    const-string v11, "\u06db\u06eb"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    mul-int/lit8 v11, v11, 0x3

    xor-int v12, v11, v34

    mul-int/lit16 v12, v12, -0x68ff

    const v13, 0xf0c80fa

    xor-int/2addr v12, v13

    const v13, 0xf6d7ce8

    goto/16 :goto_11

    :cond_10
    const-string v11, "\u05a1\u1a77"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v34

    mul-int/lit8 v11, v11, 0x41

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, 0x2783

    const v13, -0x5402f6a5

    xor-int/2addr v12, v13

    const v13, 0x6dbbb0cb

    goto/16 :goto_11

    :sswitch_16
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

    sget v13, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v13, :cond_11

    move/from16 v20, v12

    :goto_e
    const-string v12, "\u1a79\u05a8"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v35, v12

    mul-int/lit8 v12, v12, 0x3f

    xor-int v13, v12, v34

    mul-int/lit16 v13, v13, -0x3b4b

    const v14, 0x18d3a680

    xor-int/2addr v13, v14

    const v14, -0x30c1b012

    :goto_f
    xor-int/2addr v12, v14

    move v14, v1

    move/from16 v38, v11

    move v1, v13

    move/from16 v16, v37

    goto :goto_c

    :cond_11
    const-string v13, "\u06e8\u1a76"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v35

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, -0x8ed

    const v16, 0x67ee74e9

    xor-int v14, v14, v16

    const v16, -0x17a53bea

    xor-int v13, v13, v16

    move/from16 v38, v11

    move/from16 v20, v12

    goto/16 :goto_18

    :sswitch_17
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    and-int v19, v17, v18

    ushr-int/lit8 v38, v17, 0x18

    .line 0
    sget v11, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v11, :cond_12

    :goto_10
    const-string v11, "\u06df\u1a73"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    xor-int v12, v11, v34

    mul-int/lit16 v12, v12, -0x58cf

    const v13, -0x475baafb

    xor-int/2addr v12, v13

    const v13, -0x24536c2a

    goto :goto_11

    :cond_12
    const-string v11, "\u0736\u1a7a"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    xor-int v12, v11, v34

    mul-int/lit16 v12, v12, 0x7e57

    const v13, -0x71114352

    xor-int/2addr v12, v13

    const v13, -0x28381977

    :goto_11
    xor-int/2addr v11, v13

    move v14, v1

    move v13, v9

    move v1, v12

    move/from16 v16, v37

    move/from16 v9, v39

    :goto_12
    move v12, v3

    move/from16 v37, v11

    goto/16 :goto_1b

    :sswitch_18
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    const/4 v12, 0x1

    .line 293
    iput-boolean v12, v0, Ll/ᩴܿ᩻;->᩷ۙ:Z

    .line 294
    iget v12, v0, Ll/ᩴܿ᩻;->۠:I

    const v18, 0xffffff

    sget v13, Ll/֫֡;->֫ۙۖ:I

    if-gtz v13, :cond_13

    move/from16 v17, v12

    :goto_13
    const-string v12, "\u06dc\u06e4"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    add-int v12, v12, v34

    mul-int/lit8 v12, v12, -0x31

    xor-int v13, v12, v35

    mul-int/lit16 v13, v13, 0x57e1

    const v14, 0x13830ff

    xor-int/2addr v13, v14

    const v14, -0x2cd907e

    goto/16 :goto_f

    :cond_13
    const-string v13, "\u06e0\u0730"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v34, v13

    mul-int/lit8 v13, v13, 0x63

    xor-int v14, v13, v35

    mul-int/lit16 v14, v14, 0x4b5d

    const v16, -0x54705c87

    xor-int v14, v14, v16

    const v16, 0x35fa7658

    xor-int v13, v13, v16

    move/from16 v38, v11

    move/from16 v17, v12

    goto/16 :goto_18

    :sswitch_19
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

    goto/16 :goto_16

    :sswitch_1a
    return-void

    :sswitch_1b
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

    const-string v13, "\u06d6\u05a1"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v34

    mul-int/lit8 v13, v13, 0x4b

    xor-int v14, v13, v35

    mul-int/lit16 v14, v14, -0x5469

    const v16, -0x31434cc9

    xor-int v14, v14, v16

    const v16, 0x67fac71d

    goto/16 :goto_17

    :cond_14
    move/from16 v16, v1

    move v14, v2

    move/from16 v33, v12

    move/from16 v13, v30

    goto/16 :goto_1c

    :sswitch_1c
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
    invoke-static/range {p0 .. p0}, Ll/֡᩻;->ۙ᩷᩵(Ljava/lang/Object;)I

    move-result v14

    .line 291
    invoke-static/range {p0 .. p0}, Ll/֫֨;->ܶ᩶ܰ(Ljava/lang/Object;)I

    move-result v13

    .line 292
    iget-boolean v1, v0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    if-nez v1, :cond_15

    const-string v1, "\u06d8\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v35, v1

    mul-int/lit8 v1, v1, -0x65

    xor-int v9, v1, v34

    mul-int/lit16 v9, v9, 0x1335

    const v16, -0x234dbaac

    xor-int v9, v9, v16

    const v16, -0x24fee2eb

    goto :goto_15

    :cond_15
    :goto_14
    const-string v1, "\u05a1\u06d9"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v35

    mul-int/lit8 v1, v1, -0x5f

    xor-int v9, v1, v34

    mul-int/lit16 v9, v9, -0x49c1

    const v16, -0x1d40cfcc

    xor-int v9, v9, v16

    const v16, -0x2713b4e1

    :goto_15
    xor-int v1, v1, v16

    move/from16 v38, v11

    move/from16 v33, v12

    move/from16 v16, v37

    move/from16 v37, v1

    move v12, v3

    move v1, v9

    move/from16 v9, v39

    goto/16 :goto_1b

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
    iget-boolean v13, v0, Ll/ᩴܿ᩻;->᩷ۙ:Z

    if-eqz v13, :cond_16

    const-string v13, "\u06e1\u05a1"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v34

    xor-int v14, v13, v35

    mul-int/lit16 v14, v14, -0x7115

    const v16, -0x5705f589

    xor-int v14, v14, v16

    const v16, 0x5217efe9

    goto/16 :goto_17

    :cond_16
    :goto_16
    const-string v13, "\u0730\u1a75"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v34

    xor-int v14, v13, v35

    mul-int/lit16 v14, v14, -0x1c17

    const v16, -0xbbe46bc

    xor-int v14, v14, v16

    const v16, -0x28e6a9bb

    goto/16 :goto_17

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

    goto/16 :goto_1e

    :cond_17
    const-string v13, "\u073a\u1a79"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int v13, v13, v35

    mul-int/lit8 v13, v13, 0x43

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, -0x14db

    const v16, -0x4d24598b

    xor-int v14, v14, v16

    const v16, 0x1caf8c52

    goto :goto_17

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

    goto/16 :goto_1f

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

    const-string v13, "\u05a8\u0736"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int v13, v13, v35

    mul-int/lit8 v13, v13, 0x59

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, 0x732f

    const v16, -0x74a984f

    xor-int v14, v14, v16

    const v16, -0x59123775

    :goto_17
    xor-int v13, v13, v16

    move/from16 v38, v11

    move/from16 v33, v12

    :goto_18
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

    goto/16 :goto_1d

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
    iput-boolean v13, v0, Ll/ᩴܿ᩻;->᩷ۙ:Z

    .line 342
    invoke-virtual/range {v40 .. v40}, Ll/᩸᩷ܺ;->ۙ()V

    :goto_19
    const-string v14, "\u06d8\u1a7a"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int v14, v14, v34

    move/from16 v16, v1

    xor-int v1, v14, v35

    mul-int/lit16 v1, v1, -0x7603

    const v30, -0x6379c0d3

    xor-int v1, v1, v30

    const v30, 0x19a629f3

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

    goto/16 :goto_22

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
    invoke-static {}, Ll/֨ۚ;->ۢ۫᩹()J

    move-result-wide v41

    move v14, v2

    iget-wide v1, v0, Ll/ᩴܿ᩻;->֫ۙ:J

    sub-long v1, v41, v1

    long-to-int v2, v1

    if-ltz v2, :cond_19

    const-string v1, "\u06da\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v12, v1, v34

    mul-int/lit16 v12, v12, -0x73f3

    const v30, 0x72edd090

    xor-int v12, v12, v30

    const v30, -0x389b99ca

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

    :goto_1a
    move/from16 v9, v39

    move v12, v3

    :goto_1b
    move-object/from16 v3, v40

    goto/16 :goto_0

    :cond_19
    move/from16 v33, v2

    :goto_1c
    move v12, v3

    const-string v1, "\u06d8\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v2, v1, v35

    mul-int/lit16 v2, v2, -0x43ef

    const v3, -0x324c0dad

    xor-int/2addr v2, v3

    const v3, 0x3e965d93

    xor-int/2addr v1, v3

    move/from16 v38, v11

    move/from16 v30, v13

    move-object/from16 v3, v40

    move v13, v9

    move/from16 v9, v39

    goto/16 :goto_21

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
    invoke-static/range {p0 .. p0}, Ll/ۘܽ;->ۢ᩶۫(Ljava/lang/Object;)I

    move-result v1

    sub-int v8, v7, v1

    .line 287
    invoke-virtual/range {p0 .. p0}, Ll/ᩴܿ᩻;->ۙ()I

    move-result v36

    if-lez v1, :cond_1a

    const-string v1, "\u1a77\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    mul-int/lit8 v1, v1, 0x7d

    xor-int v2, v1, v34

    mul-int/lit16 v2, v2, 0x6123

    const v30, -0x25ab0063

    xor-int v2, v2, v30

    const v30, -0x21ce25a8

    goto/16 :goto_20

    :cond_1a
    :goto_1d
    const-string v1, "\u1a76\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v2, v1, v35

    mul-int/lit16 v2, v2, 0x60f1

    const v30, 0x57fd3d9a

    xor-int v2, v2, v30

    const v30, -0x1ccd4489

    goto/16 :goto_20

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
    invoke-direct/range {p0 .. p0}, Ll/ᩴܿ᩻;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_1b

    goto/16 :goto_1e

    :cond_1b
    const-string v1, "\u1a78\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v2, v1, v34

    mul-int/lit16 v2, v2, -0x31bb

    const v30, -0x4c309fa1

    xor-int v2, v2, v30

    const v30, 0x7ebbdcb2

    goto/16 :goto_20

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

    goto/16 :goto_23

    :cond_1c
    const-string v1, "\u06db\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    mul-int/lit8 v1, v1, 0x39

    xor-int v2, v1, v35

    mul-int/lit16 v2, v2, 0x7437

    const v30, 0x3b34073

    xor-int v2, v2, v30

    const v30, 0x7c8c18fe

    goto :goto_20

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

    iget-boolean v1, v0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    const/16 v23, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    if-nez v1, :cond_1d

    const-string v1, "\u05a8\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v2, v1, v34

    mul-int/lit16 v2, v2, 0x2ac5

    const v30, -0x268bfe43

    xor-int v2, v2, v30

    const v30, -0x72a3cfbd

    goto :goto_20

    :cond_1d
    :goto_1e
    move v6, v5

    :goto_1f
    const-string v1, "\u06ec\u073a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v34, v1

    mul-int/lit8 v1, v1, -0x69

    xor-int v2, v1, v35

    mul-int/lit16 v2, v2, 0x493

    const v30, -0x3eac831b

    xor-int v2, v2, v30

    const v30, -0x68b99a24

    :goto_20
    xor-int v1, v1, v30

    move/from16 v38, v11

    move/from16 v33, v12

    move/from16 v30, v13

    move v12, v3

    move v13, v9

    move/from16 v9, v39

    move-object/from16 v3, v40

    :goto_21
    move/from16 v43, v37

    move/from16 v37, v1

    move v1, v2

    move v2, v14

    :goto_22
    move/from16 v14, v16

    move/from16 v16, v43

    goto/16 :goto_0

    :sswitch_27
    move-object/from16 v40, v3

    move/from16 v13, v30

    .line 341
    iput-boolean v13, v0, Ll/ᩴܿ᩻;->᩷ۙ:Z

    .line 342
    invoke-virtual/range {v40 .. v40}, Ll/᩸᩷ܺ;->ۙ()V

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
    iget-boolean v1, v0, Ll/ᩴܿ᩻;->᩸ۙ:Z

    const/16 v30, 0x0

    iget-object v2, v0, Ll/ᩴܿ᩻;->ۙۙ:Ll/᩸᩷ܺ;

    if-nez v1, :cond_1e

    :goto_23
    const-string v1, "\u073a\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v13, v1, v35

    mul-int/lit16 v13, v13, 0x4887

    const v33, -0x2b9edf9c

    xor-int v13, v13, v33

    const v33, 0xa1b8414

    :goto_24
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

    :goto_25
    move/from16 v9, v39

    goto/16 :goto_0

    :cond_1e
    const-string v1, "\u1a78\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v13, v1, v34

    mul-int/lit16 v13, v13, 0x5c3b

    const v33, -0x3a630349

    xor-int v13, v13, v33

    const v33, 0x751c189a

    goto :goto_24

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fb319c3 -> :sswitch_1c
        -0x77e9a70a -> :sswitch_0
        -0x73e594a5 -> :sswitch_16
        -0x6ba0e691 -> :sswitch_18
        -0x6b780361 -> :sswitch_1b
        -0x65d23c5e -> :sswitch_24
        -0x62efb86a -> :sswitch_f
        -0x60ff9d7b -> :sswitch_21
        -0x6088b744 -> :sswitch_1a
        -0x5c194e71 -> :sswitch_7
        -0x54a0edf6 -> :sswitch_21
        -0x53289d4c -> :sswitch_20
        -0x4ac399ff -> :sswitch_e
        -0x481d0357 -> :sswitch_12
        -0x461ab1d2 -> :sswitch_1d
        -0x44f890c8 -> :sswitch_1f
        -0x3f49a46b -> :sswitch_16
        -0x3f40f1a3 -> :sswitch_1
        -0x3e55b8ff -> :sswitch_a
        -0x3322c446 -> :sswitch_3
        -0x314bc149 -> :sswitch_2
        -0x2fea0594 -> :sswitch_1e
        -0x2caa154b -> :sswitch_9
        -0x2b2c9927 -> :sswitch_28
        -0x29bfa75f -> :sswitch_22
        -0x287318a6 -> :sswitch_1c
        -0x2766e592 -> :sswitch_b
        -0x25be3527 -> :sswitch_20
        -0x22647742 -> :sswitch_25
        -0x20560f82 -> :sswitch_6
        -0x1c37a53c -> :sswitch_11
        -0x18512177 -> :sswitch_d
        -0x150e810c -> :sswitch_1
        -0x1391d5b2 -> :sswitch_c
        -0x1270231b -> :sswitch_6
        -0x95e548b -> :sswitch_26
        -0x87e1a79 -> :sswitch_b
        -0xd48c80 -> :sswitch_15
        -0xed352 -> :sswitch_19
        0x65b9f53 -> :sswitch_23
        0xb2b6a99 -> :sswitch_8
        0xe41b101 -> :sswitch_14
        0xf182f8e -> :sswitch_24
        0x102fcde6 -> :sswitch_9
        0x132d73ee -> :sswitch_0
        0x178b58a3 -> :sswitch_4
        0x1a79d2b5 -> :sswitch_19
        0x1ba44300 -> :sswitch_12
        0x22384b8c -> :sswitch_10
        0x2647986f -> :sswitch_3
        0x272adec3 -> :sswitch_28
        0x2a1a00de -> :sswitch_10
        0x2d17d284 -> :sswitch_e
        0x328d3852 -> :sswitch_1e
        0x37741c9c -> :sswitch_17
        0x3e48a6d7 -> :sswitch_1b
        0x4221e99e -> :sswitch_8
        0x427599d6 -> :sswitch_27
        0x4939a9d0 -> :sswitch_5
        0x4b378cde -> :sswitch_c
        0x51c820ed -> :sswitch_1d
        0x5551d723 -> :sswitch_f
        0x59895238 -> :sswitch_2
        0x5c0c1715 -> :sswitch_23
        0x5cd8a309 -> :sswitch_17
        0x5fb6fd00 -> :sswitch_11
        0x60073855 -> :sswitch_25
        0x626e117c -> :sswitch_26
        0x6308ff80 -> :sswitch_d
        0x66240edd -> :sswitch_13
        0x69b727ae -> :sswitch_5
        0x69c9a0da -> :sswitch_22
        0x6ae2ec6f -> :sswitch_18
        0x6d028144 -> :sswitch_27
        0x6d447e77 -> :sswitch_15
        0x6d6ca131 -> :sswitch_1a
        0x714a89e0 -> :sswitch_7
        0x727c6d37 -> :sswitch_4
        0x758cc8d7 -> :sswitch_a
        0x75c5e393 -> :sswitch_13
        0x76f854b1 -> :sswitch_1f
        0x7eb3832c -> :sswitch_14
    .end sparse-switch
.end method

.method public final isFastScrollEnabled()Z
    .locals 1

    .line 203
    iget-boolean v0, p0, Ll/ᩴܿ᩻;->᩸ۙ:Z

    return v0
.end method

.method public final layoutChildren()V
    .locals 6

    const v0, 0xc5a9bcc

    sget v1, Ll/ۖۖ;->᩵ۜ֨:I

    sget v2, Ll/ۗ֡;->ۜ᩻۫:I

    const-string v3, "\u073d\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6bbf

    const v5, 0x3c3e0f10

    xor-int/2addr v4, v5

    const v5, 0xc112c5

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x3fa1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 190
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_6

    goto/16 :goto_1

    .line 438
    :sswitch_2
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-gez v3, :cond_9

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    :sswitch_4
    return-void

    .line 734
    :sswitch_5
    :try_start_0
    invoke-super {p0}, Landroid/widget/ListView;->layoutChildren()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    const-string v3, "\u1a73\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5035

    const v5, -0x25f41508

    xor-int/2addr v4, v5

    const v5, 0x4bd765af    # 2.8232542E7f

    goto :goto_0

    :sswitch_6
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06e1\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2733

    const v5, -0x425f6e65

    xor-int/2addr v4, v5

    const v5, -0x28915e2f

    goto :goto_0

    .line 714
    :sswitch_7
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u073a\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2e35

    const v5, 0x6a1da940

    xor-int/2addr v4, v5

    const v5, 0x4ec73372

    goto :goto_0

    .line 442
    :sswitch_8
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u0733\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x669f

    const v5, -0x5c4712c9

    xor-int/2addr v4, v5

    const v5, 0x42c0e2a4

    goto/16 :goto_0

    .line 41
    :sswitch_9
    sget-boolean v3, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v3, :cond_3

    :goto_1
    const-string v3, "\u073a\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2c2b

    const v5, -0x98464fa

    xor-int/2addr v4, v5

    const v5, -0x79122a1e

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a75\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5e77

    const v5, -0x23cfe8a3

    xor-int/2addr v4, v5

    const v5, -0x5cac8fc8

    goto/16 :goto_0

    .line 229
    :sswitch_a
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u0736\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x792d

    const v5, 0x5b4fc70a

    xor-int/2addr v4, v5

    const v5, 0xa6770fb

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06d8\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6619

    const v5, -0x5eae6efd

    xor-int/2addr v4, v5

    const v5, 0x36691fb5

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06e1\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7703

    const v5, 0x65e553ff

    xor-int/2addr v4, v5

    const v5, -0x5600c971

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u0733\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x55a7

    const v5, -0x1e323510

    xor-int/2addr v4, v5

    const v5, -0x69f37129

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_8

    :goto_3
    const-string v3, "\u06d8\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x837

    const v5, -0x12c36165

    xor-int/2addr v4, v5

    const v5, -0x76583b6f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e7\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x12b9

    const v5, -0x6235dcd9

    xor-int/2addr v4, v5

    const v5, -0x1a8de357

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u1a7b\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x616f

    const v5, 0x51421900

    xor-int/2addr v4, v5

    const v5, 0x2ec8181a

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a74\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x8e5

    const v5, 0x10e38d0d

    xor-int/2addr v4, v5

    const v5, 0x2986c549

    goto/16 :goto_0

    .line 221
    :sswitch_f
    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_c

    :cond_b
    const-string v3, "\u1a79\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x51f7

    const v5, -0x22e6d26d

    xor-int/2addr v4, v5

    const v5, -0xe1f0852

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a7a\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3cf9

    const v5, 0x62d17dc4

    xor-int/2addr v4, v5

    const v5, -0x74b72998

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bbfc7c7 -> :sswitch_8
        -0x79240062 -> :sswitch_d
        -0x73e8a856 -> :sswitch_e
        -0x732c7912 -> :sswitch_c
        -0x69417880 -> :sswitch_4
        -0x5ee409fa -> :sswitch_6
        -0x59f6077a -> :sswitch_a
        -0x5763be8c -> :sswitch_a
        -0x3a0a0cfc -> :sswitch_2
        -0x3975b666 -> :sswitch_5
        -0x38b78be9 -> :sswitch_1
        -0x30f35f6c -> :sswitch_1
        -0x2d8ff084 -> :sswitch_0
        -0x2d5ff2c6 -> :sswitch_7
        -0x178a211c -> :sswitch_9
        -0x129e9bf0 -> :sswitch_d
        -0x259525f -> :sswitch_b
        0xafcdf1 -> :sswitch_4
        0x17893b9 -> :sswitch_7
        0x39fed33 -> :sswitch_9
        0xda5557f -> :sswitch_f
        0x1b2be3f8 -> :sswitch_e
        0x2f915666 -> :sswitch_2
        0x317753f3 -> :sswitch_b
        0x470e745e -> :sswitch_5
        0x5e52aa7b -> :sswitch_f
        0x60345c52 -> :sswitch_8
        0x667b3ee8 -> :sswitch_0
        0x693110b9 -> :sswitch_3
        0x6a1ec38a -> :sswitch_6
        0x78a3c1a6 -> :sswitch_3
        0x7b28d607 -> :sswitch_c
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

    const v16, 0x5212f0bb

    sget v17, Ll/ۗ֨;->᩹ۜۡ:I

    sget v18, Ll/֫ۢ;->ۚ᩻᩵:I

    const-string v19, "\u06d7\u06e4"

    invoke-static/range {v19 .. v19}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v19

    sub-int v19, v17, v19

    mul-int/lit8 v19, v19, -0x47

    xor-int v1, v19, v18

    mul-int/lit16 v1, v1, -0x4acf

    const v21, 0x5ba572b8

    xor-int v1, v1, v21

    const v21, -0x37f1343b

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

    const v19, 0x5212f0bb

    const/16 v21, 0x0

    :goto_0
    xor-int v3, v19, v18

    mul-int/lit16 v3, v3, 0x2ce1

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v19, v20, v1

    sparse-switch v19, :sswitch_data_0

    sget-boolean v1, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v1, :cond_0

    goto :goto_4

    .line 180
    :sswitch_0
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    sget v1, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v1, :cond_9

    goto/16 :goto_5

    .line 489
    :sswitch_1
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v1

    if-ltz v1, :cond_1

    :cond_0
    :goto_1
    move/from16 v20, v5

    move/from16 v3, v21

    goto/16 :goto_11

    :cond_1
    :goto_2
    move/from16 v20, v5

    move/from16 v3, v21

    goto/16 :goto_e

    :sswitch_2
    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v1, :cond_2

    goto :goto_3

    :cond_2
    move/from16 v20, v5

    move/from16 v3, v21

    goto/16 :goto_d

    :sswitch_3
    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_3
    const-string v1, "\u06e4\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x19ef

    const v20, -0x744c30cc

    xor-int v3, v3, v20

    const v20, 0x187619ca

    goto/16 :goto_9

    .line 71
    :sswitch_4
    sget v1, Ll/ۧ;->ۨۗܰ:I

    if-gez v1, :cond_5

    goto :goto_1

    :sswitch_5
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    :goto_4
    const-string v1, "\u06d9\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0xf

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x4dbf

    const v20, 0x2e4498bb

    xor-int v3, v3, v20

    const v20, 0x7f99a55a

    goto/16 :goto_9

    .line 318
    :sswitch_6
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    const/4 v1, 0x0

    return v1

    .line 671
    :sswitch_7
    iget v1, v0, Ll/ᩴܿ᩻;->ۢ:I

    invoke-virtual {v15, v2, v1}, Ll/۟᩷ۙ;->ۙ(II)V

    goto/16 :goto_6

    .line 674
    :sswitch_8
    invoke-static/range {p0 .. p0}, Ll/֡ᩴ;->֨ܶܳ(Ljava/lang/Object;)V

    .line 675
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    return v2

    .line 673
    :sswitch_9
    iput v5, v0, Ll/ᩴܿ᩻;->ܽۙ:F

    sget v1, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v1, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v1, "\u1a73\u1a77"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x6937

    const v20, -0x2845183a

    xor-int v3, v3, v20

    const v20, -0x7ee7e0e8

    goto/16 :goto_9

    :sswitch_a
    iget v1, v4, Ll/᩸᩷ܺ;->ᩴ:F

    iget v3, v0, Ll/ᩴܿ᩻;->۟:F

    sub-float v5, v1, v3

    .line 89
    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v1, :cond_6

    :cond_5
    :goto_5
    const-string v1, "\u1a74\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x70f

    const v20, -0x56a2bb7

    xor-int v3, v3, v20

    const v20, -0x6be01d31

    goto/16 :goto_9

    :cond_6
    const-string v1, "\u06d9\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x11

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x6f3b

    const v20, -0x3ff82e00

    xor-int v3, v3, v20

    const v20, 0x2363c8ca

    goto/16 :goto_9

    .line 667
    :sswitch_b
    iput-boolean v6, v0, Ll/ᩴܿ᩻;->ۚۙ:Z

    .line 668
    iput-boolean v2, v0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    .line 669
    invoke-direct/range {p0 .. p1}, Ll/ᩴܿ᩻;->᩷(Landroid/view/MotionEvent;)V

    .line 670
    iget-object v15, v0, Ll/ᩴܿ᩻;->ᩳ:Ll/۟᩷ۙ;

    if-eqz v15, :cond_7

    const-string v1, "\u073d\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x6b

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x7f91

    const v20, -0x68304837

    xor-int v3, v3, v20

    const v20, -0x2d1968c1

    goto/16 :goto_9

    :cond_7
    :goto_6
    const-string v1, "\u1a73\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x35

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x1a1d

    const v20, -0x475bbec3

    xor-int v3, v3, v20

    const v20, 0x554c3fc    # 1.0004189E-35f

    goto/16 :goto_9

    :sswitch_c
    mul-int v1, v14, v14

    int-to-float v1, v1

    cmpl-float v1, v13, v1

    if-lez v1, :cond_8

    const-string v1, "\u1a76\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x5

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x2631

    const v20, -0x758d291f

    xor-int v3, v3, v20

    const v20, 0x356936a6

    goto/16 :goto_9

    :cond_8
    move/from16 v20, v5

    move/from16 v3, v21

    goto/16 :goto_c

    :sswitch_d
    mul-float v1, v11, v11

    add-float v13, v1, v12

    .line 665
    iget v14, v0, Ll/ᩴܿ᩻;->᩻ۙ:I

    .line 579
    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v1, :cond_a

    :cond_9
    :goto_7
    const-string v1, "\u06da\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x3b6f

    const v20, 0x29e6e617

    xor-int v3, v3, v20

    const v20, 0x22d80cfb

    goto/16 :goto_9

    :cond_a
    const-string v1, "\u0730\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x4d

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x4a8d

    const v20, 0x58d4e188

    xor-int v3, v3, v20

    const v20, -0x5e4a7e9f

    goto/16 :goto_9

    .line 664
    :sswitch_e
    iget v1, v0, Ll/ᩴܿ᩻;->۟:F

    sub-float v11, v10, v1

    mul-float v12, v9, v9

    .line 651
    sget v1, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v1, :cond_b

    goto :goto_8

    :cond_b
    const-string v1, "\u06da\u06d8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x25

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x6b89

    const v20, 0x32cbddef

    xor-int v3, v3, v20

    const v20, -0x3c3f498f

    goto/16 :goto_9

    .line 664
    :sswitch_f
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    .line 541
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v1

    if-ltz v1, :cond_c

    goto :goto_8

    :cond_c
    const-string v1, "\u06d8\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x6463

    const v20, -0x1b806b93

    xor-int v3, v3, v20

    const v20, -0x2494b62d

    goto :goto_9

    :sswitch_10
    sub-float v9, v7, v8

    .line 109
    sget-boolean v1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v1, :cond_d

    goto/16 :goto_2

    :cond_d
    const-string v1, "\u06e8\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x3

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x7dc7

    const v20, -0x1c009a5e

    xor-int v3, v3, v20

    const v20, -0x7192f7d7

    goto :goto_9

    .line 663
    :sswitch_11
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    iget v8, v0, Ll/ᩴܿ᩻;->֡:F

    sget v1, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v1, :cond_e

    :goto_8
    const-string v1, "\u073d\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x5

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x6329

    const v20, -0x54733540    # -1.0003873E-12f

    xor-int v3, v3, v20

    const v20, 0x876e251

    goto :goto_9

    :cond_e
    const-string v1, "\u06eb\u073a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x1f

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x3307

    const v20, -0x56647ff2

    xor-int v3, v3, v20

    const v20, -0x6821d406

    :goto_9
    xor-int v20, v1, v20

    goto/16 :goto_10

    :sswitch_12
    const/4 v1, 0x3

    move/from16 v3, v21

    if-eq v3, v1, :cond_f

    goto :goto_a

    :cond_f
    move/from16 v20, v5

    goto/16 :goto_b

    :sswitch_13
    move/from16 v3, v21

    .line 662
    iget-boolean v1, v0, Ll/ᩴܿ᩻;->ۚۙ:Z

    if-eqz v1, :cond_10

    const-string v1, "\u06db\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x63

    move/from16 v20, v5

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x1653

    const v21, 0x495a0a46    # 893092.4f

    xor-int v5, v5, v21

    const v21, -0x7932843d

    goto/16 :goto_12

    :cond_10
    :goto_a
    move/from16 v20, v5

    goto/16 :goto_c

    .line 653
    :sswitch_14
    invoke-direct/range {p0 .. p1}, Ll/ᩴܿ᩻;->ۙ(Landroid/view/MotionEvent;)V

    .line 654
    iput-boolean v2, v0, Ll/ᩴܿ᩻;->ۧۙ:Z

    return v2

    :sswitch_15
    move/from16 v20, v5

    move/from16 v3, v21

    .line 658
    iput-boolean v2, v0, Ll/ᩴܿ᩻;->ۚۙ:Z

    goto/16 :goto_c

    :sswitch_16
    move/from16 v20, v5

    move/from16 v3, v21

    const/4 v1, 0x2

    if-eq v3, v1, :cond_11

    const-string v1, "\u1a77\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x19d1

    const v21, 0x44d2f21c

    xor-int v5, v5, v21

    const v21, -0x4df49a41    # -8.113999E-9f

    goto/16 :goto_12

    :cond_11
    const-string v1, "\u073a\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, -0x6a9f

    const v21, 0x1f1161a0

    xor-int v5, v5, v21

    const v21, 0x7608182b

    goto/16 :goto_12

    :sswitch_17
    move/from16 v20, v5

    move/from16 v3, v21

    .line 682
    iput-boolean v6, v0, Ll/ᩴܿ᩻;->ۚۙ:Z

    goto/16 :goto_c

    :sswitch_18
    move/from16 v20, v5

    move/from16 v3, v21

    .line 652
    iget v1, v0, Ll/ᩴܿ᩻;->֡:F

    iget v5, v0, Ll/ᩴܿ᩻;->۟:F

    invoke-virtual {v4, v1, v5}, Ll/᩸᩷ܺ;->᩷(FF)Z

    move-result v1

    if-eqz v1, :cond_12

    const-string v1, "\u1a73\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x3

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x37d3

    const v21, -0x5ae85b02

    xor-int v5, v5, v21

    const v21, -0x68a1f0ea

    goto/16 :goto_12

    :cond_12
    const-string v1, "\u1a76\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x2f

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x57e3

    const v21, -0x13b6d0f6

    xor-int v5, v5, v21

    const v21, -0x6d953117

    goto/16 :goto_12

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

    const-string v1, "\u1a75\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x17

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, -0x47ed

    const v21, 0x3c565fb2

    xor-int v5, v5, v21

    const v21, 0x46ad63ea

    goto/16 :goto_12

    :cond_13
    :goto_b
    const-string v1, "\u06e1\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x6ca9

    const v21, -0x7b1863b3

    xor-int v5, v5, v21

    const v21, 0x72a86e67

    goto/16 :goto_12

    :sswitch_1b
    move/from16 v20, v5

    move/from16 v1, v16

    move/from16 v3, v21

    .line 650
    iput v1, v0, Ll/ᩴܿ᩻;->۟:F

    .line 651
    iget v5, v0, Ll/ᩴܿ᩻;->֡:F

    invoke-virtual {v4, v5, v1}, Ll/᩸᩷ܺ;->ۙ(FF)Z

    move-result v5

    if-eqz v5, :cond_14

    const-string v5, "\u06e7\u06dc"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v17

    move/from16 v16, v1

    xor-int v1, v5, v18

    mul-int/lit16 v1, v1, -0x67b

    const v21, 0xff1b9e0

    xor-int v1, v1, v21

    const v21, -0x41774fad

    xor-int v5, v5, v21

    move/from16 v21, v3

    move/from16 v22, v20

    move/from16 v20, v5

    goto/16 :goto_13

    :cond_14
    move/from16 v16, v1

    :goto_c
    const-string v1, "\u06d7\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x69

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x1381

    const v21, 0x2a7d011c

    xor-int v5, v5, v21

    const v21, -0x50d29b3f

    goto/16 :goto_12

    :sswitch_1c
    move/from16 v20, v5

    move/from16 v3, v21

    .line 650
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v16

    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v1, :cond_15

    :goto_d
    const-string v1, "\u06dc\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x221f

    const v21, -0x1dee4603

    xor-int v5, v5, v21

    const v21, -0x3bab7f1f

    goto/16 :goto_12

    :cond_15
    const-string v1, "\u1a75\u06d8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x6bb7

    const v21, 0x3742568d

    xor-int v5, v5, v21

    const v21, 0x1400d16b

    goto/16 :goto_12

    :sswitch_1d
    move/from16 v20, v5

    move/from16 v3, v21

    .line 649
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Ll/ᩴܿ᩻;->֡:F

    .line 622
    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v1, :cond_16

    :goto_e
    const-string v1, "\u1a79\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x7d

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, -0x5a5b

    const v21, 0x3f7afeea

    xor-int v5, v5, v21

    const v21, -0x2c4b44b6

    goto/16 :goto_12

    :cond_16
    const-string v1, "\u06d9\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x31

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, -0x77cd

    const v21, -0x5c3f5094

    xor-int v5, v5, v21

    const v21, -0x281344d4

    goto/16 :goto_12

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

    iget-object v4, v0, Ll/ᩴܿ᩻;->ۙۙ:Ll/᩸᩷ܺ;

    if-eqz v21, :cond_17

    const-string v1, "\u073a\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x9

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x6cb9

    const v5, 0x133d12eb

    xor-int/2addr v3, v5

    const v5, 0x1750c00f

    goto :goto_f

    :cond_17
    const-string v1, "\u06eb\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x69

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x678f

    const v5, -0x634733dd

    xor-int/2addr v3, v5

    const v5, -0x1923ce8a

    :goto_f
    xor-int/2addr v1, v5

    move/from16 v5, v20

    move/from16 v20, v1

    :goto_10
    move v1, v3

    goto/16 :goto_0

    :sswitch_20
    return v2

    :sswitch_21
    move/from16 v20, v5

    move/from16 v3, v21

    .line 643
    invoke-direct/range {p0 .. p0}, Ll/ᩴܿ᩻;->ᩴ()Z

    move-result v1

    if-nez v1, :cond_18

    const-string v1, "\u0736\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x3b

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x4935

    const v21, -0x5b7205f

    xor-int v5, v5, v21

    const v21, -0x55b03fef

    goto/16 :goto_12

    :cond_18
    const-string v1, "\u06e1\u06db"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x71

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x5363

    const v21, -0x13905166

    xor-int v5, v5, v21

    const v21, 0xf8670f2

    goto :goto_12

    :sswitch_22
    move/from16 v20, v5

    move/from16 v3, v21

    .line 638
    iget-boolean v1, v0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_19

    const-string v1, "\u06e4\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x3d

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0xd93

    const v21, 0x3952724b

    xor-int v5, v5, v21

    const v21, 0x5530a7df

    goto :goto_12

    :cond_19
    const-string v1, "\u06dc\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x1b21

    const v21, 0x66babb59

    xor-int v5, v5, v21

    const v21, 0x355ed356

    goto :goto_12

    :sswitch_23
    move/from16 v20, v5

    move/from16 v3, v21

    .line 530
    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v1, :cond_1a

    :goto_11
    const-string v1, "\u073d\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x4b

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x4685

    const v21, 0x76164df8

    xor-int v5, v5, v21

    const v21, -0x34d547be    # -1.118829E7f

    goto :goto_12

    :cond_1a
    const-string v1, "\u06da\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x23

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x251d

    const v21, -0x23026ad9

    xor-int v5, v5, v21

    const v21, 0x35f813b0

    :goto_12
    xor-int v1, v1, v21

    move/from16 v21, v3

    move/from16 v22, v20

    move/from16 v20, v1

    move v1, v5

    :goto_13
    move/from16 v5, v22

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b6d779c -> :sswitch_1d
        -0x7abf35a5 -> :sswitch_6
        -0x76ecf54d -> :sswitch_1
        -0x7603c5b4 -> :sswitch_13
        -0x7333e7c5 -> :sswitch_2
        -0x72e95bf6 -> :sswitch_20
        -0x72930220 -> :sswitch_10
        -0x6fd842ba -> :sswitch_9
        -0x6bfcef27 -> :sswitch_5
        -0x67ee39f3 -> :sswitch_0
        -0x647bf87b -> :sswitch_15
        -0x63ebf6b1 -> :sswitch_13
        -0x62501d22 -> :sswitch_c
        -0x5f4e96b6 -> :sswitch_3
        -0x5e3895f4 -> :sswitch_1e
        -0x5bb27b8f -> :sswitch_1d
        -0x56e0d0e9 -> :sswitch_4
        -0x5389954e -> :sswitch_11
        -0x50157d29 -> :sswitch_12
        -0x4e49e840 -> :sswitch_16
        -0x40715eaf -> :sswitch_e
        -0x373bdfc8 -> :sswitch_1
        -0x351e2767 -> :sswitch_22
        -0x32ffb0e1 -> :sswitch_b
        -0x2dac55e9 -> :sswitch_1a
        -0x291292e4 -> :sswitch_12
        -0x25c52626 -> :sswitch_23
        -0x20bd00a7 -> :sswitch_21
        -0x1f7436f2 -> :sswitch_a
        -0x1b3dde3b -> :sswitch_1f
        -0x18b116b0 -> :sswitch_1c
        -0x15c00db2 -> :sswitch_17
        -0x15616614 -> :sswitch_f
        -0xffc60ce -> :sswitch_0
        -0xe1a3604 -> :sswitch_11
        -0xd95e1a4 -> :sswitch_4
        -0xcebab5b -> :sswitch_19
        -0x7738ce6 -> :sswitch_23
        -0x5b21bbb -> :sswitch_16
        0x13416bf -> :sswitch_7
        0x13ff139 -> :sswitch_22
        0x7341bd1 -> :sswitch_d
        0x9169f6f -> :sswitch_1e
        0xd82d0e8 -> :sswitch_21
        0x10f98fdd -> :sswitch_1c
        0x13ffda45 -> :sswitch_1a
        0x14c6adec -> :sswitch_15
        0x15d2c093 -> :sswitch_d
        0x164d81ef -> :sswitch_17
        0x248c3506 -> :sswitch_3
        0x2cd9fe6c -> :sswitch_18
        0x30398c9e -> :sswitch_f
        0x317b9b1b -> :sswitch_19
        0x343b3eae -> :sswitch_c
        0x39323841 -> :sswitch_8
        0x3e7b9d92 -> :sswitch_e
        0x431021ad -> :sswitch_b
        0x43788aca -> :sswitch_7
        0x4618760f -> :sswitch_14
        0x54949b02 -> :sswitch_18
        0x5818ff6e -> :sswitch_9
        0x598d22a2 -> :sswitch_1b
        0x59ee6938 -> :sswitch_1f
        0x5d955e9a -> :sswitch_5
        0x5ff9587e -> :sswitch_20
        0x5ffdf52c -> :sswitch_10
        0x691cbb45 -> :sswitch_6
        0x6b07a6f8 -> :sswitch_8
        0x70e6d98f -> :sswitch_1b
        0x7cb76b68 -> :sswitch_14
        0x7df311c8 -> :sswitch_2
        0x7dfabb2f -> :sswitch_a
    .end sparse-switch
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    const v0, 0x223c5b31

    sget v1, Ll/ۖ᩹;->۫ܽۗ:I

    sget v2, Ll/֡ۢ;->۟֡᩻:I

    const-string v3, "\u05ab\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x8f1

    const v5, -0x7fdb878f

    xor-int/2addr v4, v5

    const v5, -0x10efa0b2

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x6635

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-nez v3, :cond_4

    goto/16 :goto_5

    .line 165
    :sswitch_0
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v3

    if-lez v3, :cond_a

    goto/16 :goto_5

    .line 97
    :sswitch_1
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v3

    if-eqz v3, :cond_c

    goto/16 :goto_2

    .line 106
    :sswitch_2
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    return-void

    :sswitch_4
    const/4 v3, 0x1

    .line 254
    iput v3, p0, Ll/ᩴܿ᩻;->ܺۙ:I

    goto :goto_1

    :sswitch_5
    return-void

    .line 252
    :sswitch_6
    invoke-super/range {p0 .. p5}, Landroid/widget/ListView;->onLayout(ZIIII)V

    if-eqz p1, :cond_0

    const-string v3, "\u06d8\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x55b

    const v5, 0x6cfc6ac

    xor-int/2addr v4, v5

    const v5, 0x9be4986

    goto :goto_0

    :cond_0
    :goto_1
    const-string v3, "\u06d6\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x37b

    const v5, -0x20402d8a

    xor-int/2addr v4, v5

    const v5, 0xa8b6aac

    goto :goto_0

    .line 84
    :sswitch_7
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u0733\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x309d

    const v5, 0x6d97bb76

    xor-int/2addr v4, v5

    const v5, -0x432b1434

    goto/16 :goto_0

    .line 124
    :sswitch_8
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a77\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x615b

    const v5, 0x7aec8403

    xor-int/2addr v4, v5

    const v5, 0x550395cb

    goto/16 :goto_0

    .line 43
    :sswitch_9
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06df\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4635

    const v5, -0x3e6d910f

    xor-int/2addr v4, v5

    const v5, -0x3fb3be0b

    goto/16 :goto_0

    .line 226
    :sswitch_a
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_5

    :cond_4
    const-string v3, "\u06db\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3e59

    const v5, 0x1b751c08

    xor-int/2addr v4, v5

    const v5, -0x117f64d6

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u05ab\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7e79

    const v5, 0x3419c76c

    xor-int/2addr v4, v5

    const v5, 0x4f1c39ae

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u06da\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x68c1

    const v5, -0x73889ed1

    xor-int/2addr v4, v5

    const v5, -0x22b2df

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06dc\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5935

    const v5, -0x3a728f93

    xor-int/2addr v4, v5

    const v5, 0x363108e4

    goto/16 :goto_0

    .line 152
    :sswitch_d
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_8

    :goto_2
    const-string v3, "\u1a74\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7f5

    const v5, 0x36e7b232

    xor-int/2addr v4, v5

    const v5, 0x6c59a560

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u05a8\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xfb5

    const v5, -0x4a6385d8

    xor-int/2addr v4, v5

    const v5, 0x54807414

    goto/16 :goto_0

    .line 154
    :sswitch_e
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v3

    if-nez v3, :cond_9

    :goto_3
    const-string v3, "\u1a73\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x31f1

    const v5, 0x224b1022

    xor-int/2addr v4, v5

    const v5, -0x33451dc1    # -9.798092E7f

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a79\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x24c1

    const v5, 0x333f88b7

    xor-int/2addr v4, v5

    const v5, -0x35bb23fc    # -3225345.0f

    goto/16 :goto_0

    .line 143
    :sswitch_f
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u06e2\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5ab3

    const v5, 0x7c5d77b8

    xor-int/2addr v4, v5

    const v5, 0x4f031b38

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a7a\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x55f5

    const v5, 0x326668fc

    xor-int/2addr v4, v5

    const v5, -0x17a960a0

    goto/16 :goto_0

    .line 84
    :sswitch_10
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_d

    :cond_c
    :goto_5
    const-string v3, "\u1a77\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7b07

    const v5, 0x63e0f506

    xor-int/2addr v4, v5

    const v5, -0x17428e4c

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06d9\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7d6b

    const v5, 0x62b3e55f

    xor-int/2addr v4, v5

    const v5, -0x1465f63b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d751710 -> :sswitch_6
        -0x71f42b40 -> :sswitch_c
        -0x66e68594 -> :sswitch_10
        -0x5610d3c9 -> :sswitch_1
        -0x54d1e9a4 -> :sswitch_b
        -0x50a7b551 -> :sswitch_7
        -0x43ac5a03 -> :sswitch_5
        -0x3dcbec50 -> :sswitch_d
        -0x3bc5c763 -> :sswitch_5
        -0x359d9754 -> :sswitch_a
        -0x2f413517 -> :sswitch_4
        -0x2550e8ec -> :sswitch_10
        -0x24c041a2 -> :sswitch_1
        -0x21dad3ec -> :sswitch_f
        -0x883680f -> :sswitch_9
        -0x6f9d82d -> :sswitch_0
        -0x7e64c -> :sswitch_d
        0x4291c3d -> :sswitch_2
        0xa1db0ff -> :sswitch_c
        0x169914ca -> :sswitch_e
        0x2d659e9f -> :sswitch_e
        0x2f311cce -> :sswitch_0
        0x3a7dc34d -> :sswitch_a
        0x3c016c45 -> :sswitch_4
        0x460b4e6c -> :sswitch_b
        0x462b1d81 -> :sswitch_6
        0x49f386c1 -> :sswitch_3
        0x4bcf4731 -> :sswitch_f
        0x59e5615b -> :sswitch_3
        0x5d535fd7 -> :sswitch_8
        0x60bf504e -> :sswitch_7
        0x75a18f33 -> :sswitch_2
        0x7a0e6e37 -> :sswitch_8
        0x7aa37193 -> :sswitch_9
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

    const v28, 0x5cad1352

    sget v29, Ll/֡۟;->᩶᩺ܰ:I

    sget v30, Ll/ۖ᩹;->۫ܽۗ:I

    const-string v31, "\u073f\u06ec"

    invoke-static/range {v31 .. v31}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v31

    xor-int v31, v31, v30

    mul-int/lit8 v31, v31, -0x1b

    xor-int v1, v31, v29

    mul-int/lit16 v1, v1, 0x724b

    const v33, -0x41812763

    xor-int v1, v1, v33

    const v33, 0x9611a6

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

    const v31, 0x5cad1352

    const/16 v33, 0x0

    move-object v11, v10

    move-object v10, v9

    const/4 v9, 0x0

    :goto_0
    xor-int v4, v31, v29

    mul-int/lit16 v4, v4, 0x59e5

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v31, v32, v1

    sparse-switch v31, :sswitch_data_0

    .line 525
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget v4, v0, Ll/ᩴܿ᩻;->֡:F

    sub-float v19, v1, v4

    .line 526
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v20

    .line 29
    sget v1, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v1, :cond_e

    goto/16 :goto_9

    :sswitch_0
    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    if-gez v1, :cond_10

    goto/16 :goto_4

    .line 423
    :sswitch_1
    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v1, :cond_0

    goto :goto_3

    :cond_0
    const-string v1, "\u05ab\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x1d

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x5d1

    const v32, -0x7bd4f41b

    xor-int v4, v4, v32

    const v32, -0x1f21b62c

    goto/16 :goto_d

    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_4

    :sswitch_3
    sget v1, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v1, :cond_2

    :cond_1
    :goto_1
    move-object v4, v2

    goto/16 :goto_f

    :cond_2
    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_13

    .line 8
    :sswitch_4
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    sget v1, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "\u0733\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v29

    mul-int/lit8 v1, v1, -0x55

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x4b89

    const v32, 0x24315337

    xor-int v4, v4, v32

    const v32, -0x782249db

    goto/16 :goto_d

    .line 219
    :sswitch_5
    sget v1, Ll/֡᩵;->ۤܳ۬:I

    if-gez v1, :cond_4

    :goto_2
    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_1d

    :cond_4
    :goto_3
    const-string v1, "\u06e1\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, -0x4b

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x1c49

    const v32, -0x72d8062d

    xor-int v4, v4, v32

    const v32, 0x198d0991

    goto/16 :goto_d

    .line 573
    :sswitch_6
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_4

    :sswitch_7
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget v1, Ll/֫֨;->᩶ܺۡ:I

    if-lez v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_4
    const-string v1, "\u05a8\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x729f

    const v32, 0x5ca35e2f

    xor-int v4, v4, v32

    const v32, -0x3925cb6e

    goto/16 :goto_d

    .line 89
    :sswitch_8
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    goto :goto_2

    .line 158
    :sswitch_9
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    const/4 v1, 0x0

    return v1

    .line 551
    :sswitch_a
    invoke-virtual {v0, v9}, Ll/ᩴܿ᩻;->setSelection(I)V

    goto :goto_5

    :sswitch_b
    return v8

    .line 550
    :sswitch_c
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v1

    if-eq v9, v1, :cond_6

    const-string v1, "\u1a79\u0733"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v29

    mul-int/lit8 v1, v1, 0x4f

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x635

    const v32, 0x367153c1

    xor-int v4, v4, v32

    const v32, -0x4e5d1a33

    goto/16 :goto_d

    :cond_6
    :goto_5
    const-string v1, "\u06e0\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x6e4f

    const v32, 0x31822dc0

    xor-int v4, v4, v32

    const v32, -0x39709864

    goto/16 :goto_d

    .line 547
    :sswitch_d
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getCount()I

    move-result v1

    sub-int/2addr v1, v8

    goto :goto_6

    :sswitch_e
    int-to-float v1, v5

    mul-float v1, v1, v26

    float-to-int v1, v1

    :goto_6
    move v9, v1

    const-string v1, "\u05a8\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x18b

    const v32, 0x665e70e5

    xor-int v4, v4, v32

    const v32, 0x5e4ce16b

    goto/16 :goto_d

    .line 549
    :sswitch_f
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getCount()I

    move-result v1

    invoke-static/range {p0 .. p0}, Ll/ۘܽ;->ۢ᩶۫(Ljava/lang/Object;)I

    move-result v4

    sub-int v5, v1, v4

    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v1, :cond_7

    goto/16 :goto_b

    :cond_7
    const-string v1, "\u1a7b\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, -0x71

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x424d

    const v32, 0x5a22ebab

    xor-int v4, v4, v32

    const v32, -0x5f5f70fe

    goto/16 :goto_d

    .line 532
    :sswitch_10
    iget v1, v0, Ll/ᩴܿ᩻;->ۢ:I

    invoke-virtual {v2, v8, v1}, Ll/۟᩷ۙ;->ۙ(II)V

    goto/16 :goto_7

    .line 535
    :sswitch_11
    invoke-static/range {p0 .. p0}, Ll/֡ᩴ;->֨ܶܳ(Ljava/lang/Object;)V

    .line 536
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v8}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto/16 :goto_c

    .line 534
    :sswitch_12
    iget v1, v7, Ll/᩸᩷ܺ;->ᩴ:F

    iget v4, v0, Ll/ᩴܿ᩻;->۟:F

    sub-float/2addr v1, v4

    iput v1, v0, Ll/ᩴܿ᩻;->ܽۙ:F

    .line 506
    sget v1, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v1, :cond_8

    goto/16 :goto_b

    :cond_8
    const-string v1, "\u073a\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, 0x6b

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x4645

    const v32, 0x3481d815

    xor-int v4, v4, v32

    const v32, 0x1b6b4b98

    goto/16 :goto_d

    :sswitch_13
    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v26, 0x3f800000    # 1.0f

    goto/16 :goto_8

    :sswitch_14
    cmpl-float v1, v26, v18

    if-nez v1, :cond_9

    const-string v1, "\u1a76\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x4b1b

    const v32, -0x4113a27f

    xor-int v4, v4, v32

    const v32, -0x7c9ed64c

    goto/16 :goto_d

    :cond_9
    const-string v1, "\u1a78\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v29

    mul-int/lit8 v1, v1, 0x3b

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x15c9

    const v32, 0x460b4fdb

    xor-int v4, v4, v32

    const v32, -0x11c2e192

    goto/16 :goto_d

    .line 528
    :sswitch_15
    iput-boolean v3, v0, Ll/ᩴܿ᩻;->ۚۙ:Z

    .line 529
    iput-boolean v8, v0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    .line 530
    invoke-direct/range {p0 .. p1}, Ll/ᩴܿ᩻;->᩷(Landroid/view/MotionEvent;)V

    .line 531
    iget-object v2, v0, Ll/ᩴܿ᩻;->ᩳ:Ll/۟᩷ۙ;

    if-eqz v2, :cond_a

    const-string v1, "\u05a8\u06df"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x6801

    const v32, 0x62ba0a7

    xor-int v4, v4, v32

    const v32, -0x5ce6712c

    goto/16 :goto_d

    :cond_a
    :goto_7
    const-string v1, "\u1a73\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, 0x31

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x4ef

    const v32, 0x2e37d27b

    xor-int v4, v4, v32

    const v32, -0x5632926

    goto/16 :goto_d

    :sswitch_16
    const/4 v1, 0x0

    const/16 v26, 0x0

    goto :goto_8

    :sswitch_17
    cmpl-float v1, v17, v18

    if-lez v1, :cond_b

    const-string v1, "\u1a74\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x55

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x7ae1

    const v32, 0x7a819a43

    xor-int v4, v4, v32

    const v32, 0x7d0cccac

    goto/16 :goto_d

    :cond_b
    move/from16 v26, v17

    :goto_8
    const-string v1, "\u1a75\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0xa57

    const v32, -0x38ba0c85

    xor-int v4, v4, v32

    const v32, 0x18229769

    goto/16 :goto_d

    :sswitch_18
    mul-int v1, v24, v24

    int-to-float v1, v1

    cmpl-float v1, v23, v1

    if-lez v1, :cond_14

    const-string v1, "\u1a7b\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x15

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x7b3

    const v32, -0x3564c225    # -5086957.5f

    xor-int v4, v4, v32

    const v32, -0x2cf22117

    goto/16 :goto_d

    :sswitch_19
    mul-float v1, v21, v21

    add-float v23, v1, v22

    .line 527
    iget v1, v0, Ll/ᩴܿ᩻;->᩻ۙ:I

    .line 5
    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v4, :cond_c

    move/from16 v24, v1

    goto/16 :goto_9

    :cond_c
    const-string v4, "\u06eb\u073d"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v29

    mul-int/lit8 v4, v4, 0x6b

    move/from16 v24, v1

    xor-int v1, v4, v30

    mul-int/lit16 v1, v1, -0x25a9

    const v32, 0x15c1eebd

    xor-int v1, v1, v32

    const v32, -0x2039abad

    goto/16 :goto_a

    .line 526
    :sswitch_1a
    iget v1, v0, Ll/ᩴܿ᩻;->۟:F

    sub-float v21, v20, v1

    mul-float v22, v19, v19

    sget v1, Ll/ۖ;->ܿۚ֡:I

    if-ltz v1, :cond_d

    const-string v1, "\u0733\u1a74"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x77ff

    const v32, 0x2c8f0693

    xor-int v4, v4, v32

    const v32, 0x6ab54531

    goto/16 :goto_d

    :cond_d
    const-string v1, "\u073a\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x39

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x7ffd

    const v32, -0x76a59fb2

    xor-int v4, v4, v32

    const v32, 0x2413d5a5

    goto/16 :goto_d

    :cond_e
    const-string v1, "\u06ec\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x4fd3

    const v32, 0x61d69fea

    xor-int v4, v4, v32

    const v32, -0x22e1a76d

    goto/16 :goto_d

    :sswitch_1b
    sub-float v1, v15, v16

    div-float v17, v13, v1

    const/4 v1, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    cmpg-float v1, v17, v1

    if-gez v1, :cond_f

    const-string v1, "\u06e8\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x43dd

    const v32, 0x33ffd22f

    xor-int v4, v4, v32

    const v32, 0x5a69dd59

    goto/16 :goto_d

    :cond_f
    const-string v1, "\u06da\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0xc49

    const v32, -0x200f7902

    xor-int v4, v4, v32

    const v32, -0x29dd30b7

    goto/16 :goto_d

    :sswitch_1c
    int-to-float v15, v14

    .line 540
    iget v1, v0, Ll/ᩴܿ᩻;->ۡ:F

    .line 422
    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_11

    move/from16 v16, v1

    :cond_10
    :goto_9
    const-string v1, "\u06df\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, -0x5

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x8bb

    const v32, 0x6f50c3eb

    xor-int v4, v4, v32

    const v32, 0x56995fc5

    goto/16 :goto_d

    :cond_11
    const-string v4, "\u06db\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v29

    mul-int/lit8 v4, v4, -0x29

    move/from16 v16, v1

    xor-int v1, v4, v30

    mul-int/lit16 v1, v1, 0x4375

    const v32, 0x2da3afcb

    xor-int v1, v1, v32

    const v32, 0x24c83da0

    :goto_a
    xor-int v32, v4, v32

    goto/16 :goto_0

    .line 540
    :sswitch_1d
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v4, v0, Ll/ᩴܿ᩻;->ܽۙ:F

    add-float v13, v1, v4

    invoke-static/range {p0 .. p0}, Ll/ۖ᩵;->ܰۙܶ(Ljava/lang/Object;)I

    move-result v14

    .line 24
    sget v1, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v1, :cond_13

    :cond_12
    :goto_b
    const-string v1, "\u1a74\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, -0x23

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x5055

    const v32, -0x4d4c87cf    # -2.0893E-8f

    xor-int v4, v4, v32

    const v32, -0x48e8c86

    goto :goto_d

    :cond_13
    const-string v1, "\u06d6\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, -0x11

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x7b4d

    const v32, 0x3ea3527d

    xor-int v4, v4, v32

    const v32, -0x1de7de05

    goto :goto_d

    .line 568
    :sswitch_1e
    invoke-interface {v12, v0, v3}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    move-object v4, v2

    goto/16 :goto_e

    .line 569
    :sswitch_1f
    invoke-static/range {p0 .. p0}, Ll/֡᩻;->᩻ᩳ۟(Ljava/lang/Object;)V

    return v8

    .line 524
    :sswitch_20
    iget-boolean v1, v0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    if-nez v1, :cond_14

    const-string v1, "\u06d7\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, 0x7f

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x44e9

    const v32, -0x4c838cb2

    xor-int v4, v4, v32

    const v32, 0xeafedc0

    goto :goto_d

    :cond_14
    :goto_c
    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_11

    .line 539
    :sswitch_21
    iget-boolean v1, v0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    if-eqz v1, :cond_15

    const-string v1, "\u06d8\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x3e99

    const v32, -0x49ed8f75

    xor-int v4, v4, v32

    const v32, 0x32cbaca1

    :goto_d
    xor-int v32, v1, v32

    move v1, v4

    goto/16 :goto_0

    :cond_15
    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_16

    .line 562
    :sswitch_22
    iget v1, v0, Ll/ᩴܿ᩻;->ۢ:I

    invoke-virtual {v10, v3, v1}, Ll/۟᩷ۙ;->ۙ(II)V

    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_12

    :sswitch_23
    move-object v4, v2

    const-wide/16 v1, 0x5dc

    .line 566
    invoke-virtual {v11, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 567
    iget-object v12, v0, Ll/ᩴܿ᩻;->۫ۙ:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz v12, :cond_16

    const-string v1, "\u1a75\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x5757

    const v32, 0x7cea4914

    xor-int v2, v2, v32

    const v32, -0x58d0217b

    goto :goto_10

    :cond_16
    :goto_e
    const-string v1, "\u06ec\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x9

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x115f

    const v32, -0x6086c30c

    xor-int v2, v2, v32

    const v32, -0x31a5319e

    goto :goto_10

    :sswitch_24
    move-object v4, v2

    .line 564
    invoke-static {}, Ll/֨ۚ;->ۢ۫᩹()J

    move-result-wide v1

    iput-wide v1, v0, Ll/ᩴܿ᩻;->֫ۙ:J

    .line 565
    iget-object v11, v0, Ll/ᩴܿ᩻;->ۤۙ:Ll/ۤܿ᩻;

    invoke-static {v11, v3}, Ll/ۖ֨;->ۚܶܶ(Ljava/lang/Object;I)V

    sget v1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v1, :cond_17

    :goto_f
    const-string v1, "\u1a75\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x73

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x1445

    const v32, 0x4511dadd

    xor-int v2, v2, v32

    const v32, 0x3e7bca14

    goto :goto_10

    :cond_17
    const-string v1, "\u0730\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x2073

    const v32, 0x2cf5d87f

    xor-int v2, v2, v32

    const v32, 0xacda098

    :goto_10
    xor-int v32, v1, v32

    goto/16 :goto_1a

    :sswitch_25
    move-object v4, v2

    move/from16 v1, v33

    move/from16 v32, v1

    if-eq v6, v1, :cond_1c

    goto/16 :goto_16

    :sswitch_26
    move-object v4, v2

    move/from16 v1, v33

    .line 524
    iget-boolean v2, v0, Ll/ᩴܿ᩻;->ۚۙ:Z

    if-eqz v2, :cond_18

    const-string v2, "\u073d\u06e8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v29

    mul-int/lit8 v2, v2, 0x2d

    move/from16 v32, v1

    xor-int v1, v2, v30

    mul-int/lit16 v1, v1, -0x6b87

    const v33, -0x19a3507e

    xor-int v1, v1, v33

    const v33, -0x24568a5e

    goto/16 :goto_15

    :cond_18
    move/from16 v32, v1

    :goto_11
    const-string v1, "\u1a76\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x66af

    const v33, -0x7dc5642b

    xor-int v2, v2, v33

    const v33, -0x7ff257a

    goto/16 :goto_19

    :sswitch_27
    move-object v4, v2

    move/from16 v32, v33

    .line 560
    iput-boolean v3, v0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    .line 561
    iget-object v10, v0, Ll/ᩴܿ᩻;->ᩳ:Ll/۟᩷ۙ;

    if-eqz v10, :cond_19

    const-string v1, "\u073d\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, -0x53b5

    const v33, -0x5217d189

    xor-int v2, v2, v33

    const v33, -0x6566a265

    goto/16 :goto_19

    :cond_19
    :goto_12
    const-string v1, "\u06d6\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, 0x2b

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x5feb

    const v33, 0x45a7f2c1

    xor-int v2, v2, v33

    const v33, -0x6966e74f

    goto/16 :goto_19

    .line 516
    :sswitch_28
    invoke-direct/range {p0 .. p1}, Ll/ᩴܿ᩻;->ۙ(Landroid/view/MotionEvent;)V

    return v8

    :sswitch_29
    move-object v4, v2

    move/from16 v32, v33

    .line 520
    iput-boolean v8, v0, Ll/ᩴܿ᩻;->ۚۙ:Z

    goto/16 :goto_16

    :sswitch_2a
    move-object v4, v2

    move/from16 v32, v33

    const/4 v1, 0x2

    if-eq v6, v1, :cond_1a

    const-string v1, "\u06ec\u073a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, -0x4b

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x4869

    const v33, -0x1d4fdfd2

    xor-int v2, v2, v33

    const v33, 0x559b8695

    goto/16 :goto_19

    :cond_1a
    const-string v1, "\u1a75\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x33

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x2b47

    const v33, 0x41905fd3

    xor-int v2, v2, v33

    const v33, 0x7ee0ee99

    goto/16 :goto_19

    :sswitch_2b
    move-object v4, v2

    move/from16 v32, v33

    .line 557
    invoke-direct/range {p0 .. p1}, Ll/ᩴܿ᩻;->᩸(Landroid/view/MotionEvent;)V

    .line 558
    iput-boolean v3, v0, Ll/ᩴܿ᩻;->ۚۙ:Z

    .line 559
    iget-boolean v1, v0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    if-eqz v1, :cond_21

    const-string v1, "\u06e8\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x7f

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x70eb

    const v33, -0x2097b4f6

    xor-int v2, v2, v33

    const v33, -0x4485b992

    goto/16 :goto_19

    :sswitch_2c
    move-object v4, v2

    move/from16 v32, v33

    .line 515
    iget v1, v0, Ll/ᩴܿ᩻;->֡:F

    iget v2, v0, Ll/ᩴܿ᩻;->۟:F

    invoke-virtual {v7, v1, v2}, Ll/᩸᩷ܺ;->᩷(FF)Z

    move-result v1

    if-eqz v1, :cond_1b

    const-string v1, "\u06df\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x29ab

    const v33, -0x7174ec4c

    xor-int v2, v2, v33

    const v33, -0x28404f75

    goto/16 :goto_19

    :cond_1b
    const-string v1, "\u1a76\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0xd

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0xab9

    const v33, -0x2f9d9d6c

    xor-int v2, v2, v33

    const v33, -0x567eb8be

    goto/16 :goto_19

    :sswitch_2d
    move-object v4, v2

    move/from16 v32, v33

    if-eq v6, v8, :cond_1c

    const-string v1, "\u06e0\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, 0x4b

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, -0x45b3

    const v33, -0x5a9d2727

    xor-int v2, v2, v33

    const v33, -0x2d8eb9f7

    goto/16 :goto_19

    :cond_1c
    const-string v1, "\u1a79\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0xd

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x47e9

    const v33, 0x7a4258ce

    xor-int v2, v2, v33

    const v33, 0x53c19154

    goto/16 :goto_19

    :sswitch_2e
    move-object v4, v2

    move/from16 v1, v28

    move/from16 v32, v33

    .line 513
    iput v1, v0, Ll/ᩴܿ᩻;->۟:F

    .line 514
    iget v2, v0, Ll/ᩴܿ᩻;->֡:F

    invoke-virtual {v7, v2, v1}, Ll/᩸᩷ܺ;->ۙ(FF)Z

    move-result v2

    if-eqz v2, :cond_1d

    const-string v2, "\u1a73\u1a75"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v29

    mul-int/lit8 v2, v2, 0x4f

    move/from16 v28, v1

    xor-int v1, v2, v30

    mul-int/lit16 v1, v1, -0x2035

    const v33, 0x68e6ff68

    xor-int v1, v1, v33

    const v33, -0x5ccdba57

    goto/16 :goto_15

    :cond_1d
    move/from16 v28, v1

    goto/16 :goto_16

    :sswitch_2f
    move-object v4, v2

    move/from16 v32, v33

    .line 512
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Ll/ᩴܿ᩻;->֡:F

    .line 513
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v28

    .line 31
    sget v1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v1, :cond_1e

    :goto_13
    const-string v1, "\u1a7a\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, 0x5b

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x2c0d

    const v33, -0x77b6fcb7

    xor-int v2, v2, v33

    const v33, -0x5eed2887

    goto/16 :goto_19

    :cond_1e
    const-string v1, "\u06e0\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, 0x59

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, -0x3001

    const v33, -0x56adf318

    xor-int v2, v2, v33

    const v33, -0x782b1af4

    goto/16 :goto_19

    :sswitch_30
    move-object v4, v2

    move/from16 v32, v33

    .line 501
    iget v1, v0, Ll/ᩴܿ᩻;->ۢ:I

    move-object/from16 v2, v27

    invoke-virtual {v2, v3, v1}, Ll/۟᩷ۙ;->ۙ(II)V

    move/from16 v2, v25

    goto/16 :goto_1c

    :sswitch_31
    move-object v4, v2

    move-object/from16 v2, v27

    move/from16 v32, v33

    .line 510
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v6

    iget-object v7, v0, Ll/ᩴܿ᩻;->ۙۙ:Ll/᩸᩷ܺ;

    if-eqz v6, :cond_1f

    const-string v1, "\u06e0\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, -0x3b

    xor-int v8, v1, v29

    mul-int/lit16 v8, v8, -0x5ded

    const v33, 0x3a6efc09

    xor-int v8, v8, v33

    const v33, 0x1b34683e

    goto :goto_14

    :cond_1f
    const-string v1, "\u06e1\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v8, v1, v30

    mul-int/lit16 v8, v8, 0x44dd

    const v33, -0x1f6d656d

    xor-int v8, v8, v33

    const v33, 0x2dc62f6e

    :goto_14
    xor-int v1, v1, v33

    move-object/from16 v27, v2

    move-object v2, v4

    move/from16 v33, v32

    move/from16 v32, v1

    move v1, v8

    const/4 v8, 0x1

    goto/16 :goto_0

    .line 575
    :sswitch_32
    invoke-super/range {p0 .. p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    return v1

    :sswitch_33
    move-object v4, v2

    move/from16 v32, v33

    .line 499
    iput-boolean v3, v0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    .line 500
    iget-object v1, v0, Ll/ᩴܿ᩻;->ᩳ:Ll/۟᩷ۙ;

    if-eqz v1, :cond_20

    const-string v2, "\u1a7b\u05ab"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v30, v2

    mul-int/lit8 v2, v2, 0x1d

    move-object/from16 v27, v1

    xor-int v1, v2, v29

    mul-int/lit16 v1, v1, -0x623

    const v33, -0x231d2946

    xor-int v1, v1, v33

    const v33, 0xd221ab0

    :goto_15
    xor-int v2, v2, v33

    move/from16 v33, v32

    move/from16 v32, v2

    goto/16 :goto_1b

    :cond_20
    move-object/from16 v27, v1

    goto :goto_17

    :sswitch_34
    move-object v4, v2

    move-object/from16 v2, v27

    move/from16 v32, v33

    .line 506
    invoke-direct/range {p0 .. p1}, Ll/ᩴܿ᩻;->᩸(Landroid/view/MotionEvent;)V

    const-wide/16 v1, 0x0

    .line 507
    iput-wide v1, v0, Ll/ᩴܿ᩻;->ܿ:J

    goto/16 :goto_18

    :sswitch_35
    move-object v4, v2

    move/from16 v32, v33

    .line 509
    invoke-direct/range {p0 .. p0}, Ll/ᩴܿ᩻;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_21

    const-string v1, "\u06dc\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x7ad9

    const v33, 0x5dbd6107

    xor-int v2, v2, v33

    const v33, 0x2ab7c06d

    goto/16 :goto_19

    :cond_21
    :goto_16
    const-string v1, "\u1a7a\u1a77"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x696d

    const v33, 0x7f3376b

    xor-int v2, v2, v33

    const v33, 0x587ca3b3

    goto :goto_19

    :sswitch_36
    move-object v4, v2

    move/from16 v32, v33

    .line 494
    invoke-direct/range {p0 .. p1}, Ll/ᩴܿ᩻;->᩸(Landroid/view/MotionEvent;)V

    .line 495
    iput-boolean v3, v0, Ll/ᩴܿ᩻;->ۜ:Z

    .line 496
    iput-boolean v3, v0, Ll/ᩴܿ᩻;->ۚۙ:Z

    .line 498
    iget-boolean v1, v0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    if-eqz v1, :cond_22

    const-string v1, "\u1a73\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x2b

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x7135

    const v33, -0x325bf026

    xor-int v2, v2, v33

    const v33, -0x38dc60e5

    goto :goto_19

    :cond_22
    :goto_17
    move/from16 v2, v25

    move/from16 v33, v32

    goto :goto_1c

    :sswitch_37
    move-object v4, v2

    move/from16 v32, v33

    .line 505
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    if-nez v1, :cond_23

    const-string v1, "\u06e2\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v29

    mul-int/lit8 v1, v1, 0x2d

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, -0x146f

    const v33, 0x6d5c1768

    xor-int v2, v2, v33

    const v33, 0x1144b64c

    goto :goto_19

    :cond_23
    :goto_18
    const-string v1, "\u05a8\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x1f

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x62b3

    const v33, -0x1adf8cc6

    xor-int v2, v2, v33

    const v33, 0x47b0805f

    :goto_19
    xor-int v1, v1, v33

    move/from16 v33, v32

    move/from16 v32, v1

    :goto_1a
    move v1, v2

    goto :goto_1b

    :sswitch_38
    move-object v4, v2

    const/4 v3, 0x0

    const/4 v1, 0x3

    move/from16 v2, v25

    if-ne v2, v1, :cond_24

    const-string v25, "\u1a75\u0730"

    invoke-static/range {v25 .. v25}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v25

    xor-int v25, v25, v29

    xor-int v1, v25, v30

    mul-int/lit16 v1, v1, 0x2589

    const v33, 0x6b60e675

    xor-int v1, v1, v33

    const v33, 0x59c0656c

    xor-int v25, v25, v33

    move/from16 v32, v25

    const/16 v33, 0x3

    move/from16 v25, v2

    :goto_1b
    move-object v2, v4

    goto/16 :goto_0

    :cond_24
    const/16 v33, 0x3

    :goto_1c
    const-string v1, "\u1a78\u06d8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v0, v1, v29

    mul-int/lit16 v0, v0, -0x6709

    const v25, -0x9176e4d

    xor-int v0, v0, v25

    const v25, 0x1af5127

    xor-int v32, v1, v25

    move v1, v0

    move/from16 v25, v2

    move-object v2, v4

    goto :goto_1f

    :sswitch_39
    move-object v4, v2

    move/from16 v32, v33

    .line 493
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v25

    .line 95
    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_25

    :goto_1d
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    mul-int/lit8 v0, v0, 0x59

    xor-int v1, v0, v29

    mul-int/lit16 v1, v1, -0x2f2b

    const v2, 0x22f58777

    xor-int/2addr v1, v2

    const v2, -0x1fd42bfe

    goto :goto_1e

    :cond_25
    const-string v0, "\u06e2\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v29, v0

    mul-int/lit8 v0, v0, -0x35

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, -0x47f1

    const v2, 0x737e2f86

    xor-int/2addr v1, v2

    const v2, 0x510a50a3

    :goto_1e
    xor-int/2addr v0, v2

    move-object v2, v4

    move/from16 v33, v32

    move/from16 v32, v0

    :goto_1f
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x734657c6 -> :sswitch_9
        -0x72868392 -> :sswitch_39
        -0x70501377 -> :sswitch_31
        -0x6bc7f000 -> :sswitch_20
        -0x6ac50ce7 -> :sswitch_c
        -0x682d63e3 -> :sswitch_23
        -0x65fb8902 -> :sswitch_8
        -0x64d54e26 -> :sswitch_3
        -0x634c507c -> :sswitch_37
        -0x6128be9e -> :sswitch_36
        -0x5cb4c7f9 -> :sswitch_a
        -0x599e4cda -> :sswitch_38
        -0x5510f968 -> :sswitch_19
        -0x5500dba5 -> :sswitch_27
        -0x53db7573 -> :sswitch_d
        -0x5347bb73 -> :sswitch_29
        -0x4eb7d9ca -> :sswitch_f
        -0x4cdc6b4a -> :sswitch_7
        -0x4a20c0a8 -> :sswitch_22
        -0x48b58be3 -> :sswitch_18
        -0x47ca62f8 -> :sswitch_25
        -0x4703cea2 -> :sswitch_1
        -0x40490f12 -> :sswitch_1a
        -0x3fc9998e -> :sswitch_12
        -0x3ee62189 -> :sswitch_30
        -0x3cac1288 -> :sswitch_c
        -0x3bbcd19f -> :sswitch_0
        -0x3a9fd6b3 -> :sswitch_32
        -0x356154b9 -> :sswitch_5
        -0x3319c439 -> :sswitch_26
        -0x32bf03d1 -> :sswitch_22
        -0x31480c57 -> :sswitch_15
        -0x306d2f8d -> :sswitch_15
        -0x2d2f341e -> :sswitch_2d
        -0x2c87d947 -> :sswitch_1c
        -0x2c4e4254 -> :sswitch_2
        -0x2bf54c25 -> :sswitch_2e
        -0x2b605b9f -> :sswitch_14
        -0x26e3b91e -> :sswitch_11
        -0x25d512fd -> :sswitch_2a
        -0x208b4ceb -> :sswitch_32
        -0x1caa3f27 -> :sswitch_1
        -0x17abc94b -> :sswitch_30
        -0x1746a10f -> :sswitch_2e
        -0x1663e533 -> :sswitch_8
        -0x16008ab4 -> :sswitch_23
        -0x157a7bfd -> :sswitch_b
        -0x136ce38b -> :sswitch_2b
        -0x1242af6f -> :sswitch_1d
        -0xe87e51a -> :sswitch_12
        -0x706381d -> :sswitch_28
        0x21c3e6c -> :sswitch_10
        0x2806b67 -> :sswitch_2f
        0x5f183e2 -> :sswitch_31
        0x6c79b3e -> :sswitch_e
        0x83ea0d5 -> :sswitch_f
        0x8da5c34 -> :sswitch_33
        0x9f56f6e -> :sswitch_28
        0xb1f58de -> :sswitch_2a
        0x11c5e118 -> :sswitch_35
        0x1b46c3ed -> :sswitch_26
        0x1b521937 -> :sswitch_6
        0x1d186a08 -> :sswitch_18
        0x1d8defd9 -> :sswitch_1d
        0x21c8235c -> :sswitch_1b
        0x22c0efa1 -> :sswitch_16
        0x266a8c1a -> :sswitch_a
        0x27aa5b83 -> :sswitch_19
        0x2817cfd0 -> :sswitch_21
        0x2ba45e5b -> :sswitch_20
        0x31278153 -> :sswitch_37
        0x316860a9 -> :sswitch_29
        0x35bf753a -> :sswitch_2c
        0x37673472 -> :sswitch_14
        0x3a3355e5 -> :sswitch_1e
        0x3e06fd20 -> :sswitch_10
        0x3fe70bfd -> :sswitch_6
        0x400140d0 -> :sswitch_1a
        0x417f8b19 -> :sswitch_35
        0x45f3248f -> :sswitch_0
        0x461cc2b1 -> :sswitch_24
        0x4622a3ec -> :sswitch_e
        0x487f0e24 -> :sswitch_1f
        0x49173921 -> :sswitch_27
        0x497ec8dc -> :sswitch_1b
        0x4b3dd129 -> :sswitch_17
        0x4c42ced4 -> :sswitch_11
        0x51921f2e -> :sswitch_13
        0x56f97e65 -> :sswitch_2b
        0x57461d93 -> :sswitch_7
        0x5769e967 -> :sswitch_34
        0x597ccd52 -> :sswitch_d
        0x5b88e159 -> :sswitch_5
        0x5b907e57 -> :sswitch_b
        0x5c3d78cb -> :sswitch_33
        0x5c427f29 -> :sswitch_1f
        0x5e30c390 -> :sswitch_13
        0x5ecbc507 -> :sswitch_34
        0x5fac4296 -> :sswitch_2f
        0x648acaa0 -> :sswitch_2
        0x64a6e292 -> :sswitch_2d
        0x651c5187 -> :sswitch_21
        0x662fd6af -> :sswitch_24
        0x66b0bc22 -> :sswitch_2c
        0x66e7e61e -> :sswitch_17
        0x679e7840 -> :sswitch_38
        0x6d217060 -> :sswitch_39
        0x6f22cf0f -> :sswitch_4
        0x72bb30f2 -> :sswitch_3
        0x72ea448c -> :sswitch_1c
        0x73f20d50 -> :sswitch_25
        0x752f99b9 -> :sswitch_16
        0x7685c628 -> :sswitch_36
        0x7837c20e -> :sswitch_4
        0x7ec7fbe1 -> :sswitch_9
        0x7fe5d5d8 -> :sswitch_1e
    .end sparse-switch
.end method

.method public final bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .line 39
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Ll/ᩴܿ᩻;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public final setAdapter(Landroid/widget/ListAdapter;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x528260dd

    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v5, "\u1a73\u1a7a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4fdb

    const v7, 0x67ac3f57

    xor-int/2addr v6, v7

    const v7, -0x2189c6fb

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x1b4b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v5

    if-lez v5, :cond_c

    goto/16 :goto_6

    .line 120
    :sswitch_0
    sget v5, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v5, :cond_7

    goto/16 :goto_6

    .line 177
    :sswitch_1
    sget v5, Ll/ۧ;->ۨۗܰ:I

    if-gez v5, :cond_a

    goto/16 :goto_6

    .line 228
    :sswitch_2
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    return-void

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

    const-string v5, "\u05a8\u06d8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3b67

    const v7, -0x775a17f9

    xor-int/2addr v6, v7

    const v7, -0x5a94965e

    goto :goto_0

    :cond_0
    :goto_1
    const-string v5, "\u06e7\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x6d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x27d7

    const v7, 0x15969117

    xor-int/2addr v6, v7

    const v7, 0x46b0e852

    goto :goto_0

    .line 225
    :sswitch_8
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    .line 226
    iget-object v1, p0, Ll/ᩴܿ᩻;->᩶:Landroid/database/DataSetObserver;

    if-eqz v0, :cond_1

    const-string v5, "\u1a76\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x11

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x27eb

    const v7, -0x7fdaad19

    xor-int/2addr v6, v7

    const v7, 0x27ccb07e

    goto :goto_0

    :cond_1
    :goto_2
    const-string v5, "\u06df\u06d6"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4aeb

    const v7, 0x4ebe31b3

    xor-int/2addr v6, v7

    const v7, 0x2c7b5fc0

    goto/16 :goto_0

    .line 46
    :sswitch_9
    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u1a78\u1a76"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x444b

    const v7, 0x1c2866e1

    xor-int/2addr v6, v7

    const v7, 0x7c9955db

    goto/16 :goto_0

    .line 193
    :sswitch_a
    sget-boolean v5, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v5, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v5, "\u06da\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x35

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x371d

    const v7, 0x2ae625fd

    xor-int/2addr v6, v7

    const v7, 0x60b081e8

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v5, :cond_4

    goto :goto_3

    :cond_4
    const-string v5, "\u06ec\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x57

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x58df

    const v7, -0x5ba41868

    xor-int/2addr v6, v7

    const v7, -0x43f5e1

    goto/16 :goto_0

    .line 80
    :sswitch_c
    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v5, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v5, "\u1a7a\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x1d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x70df

    const v7, 0x389896ca

    xor-int/2addr v6, v7

    const v7, -0x4053bbf3

    goto/16 :goto_0

    .line 66
    :sswitch_d
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v5

    if-ltz v5, :cond_6

    goto :goto_4

    :cond_6
    const-string v5, "\u06e4\u1a76"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5a43

    const v7, -0x377d9f45

    xor-int/2addr v6, v7

    const v7, -0x56e1b95d

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v5

    if-eqz v5, :cond_8

    :cond_7
    :goto_3
    const-string v5, "\u0736\u1a76"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x21cf

    const v7, 0x7fc7ead0

    xor-int/2addr v6, v7

    const v7, 0x4750b241

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u0730\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1d99

    const v7, -0x66ffd85d

    xor-int/2addr v6, v7

    const v7, -0x31a4724d

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v5, :cond_9

    :goto_4
    const-string v5, "\u0730\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2be5

    const v7, 0x4fbdf979

    xor-int/2addr v6, v7

    const v7, 0x301a67bd

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u1a78\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1ce1

    const v7, -0x2f3ba22b

    xor-int/2addr v6, v7

    const v7, 0x7228dff1

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_b

    :cond_a
    const-string v5, "\u073f\u06db"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2dcd

    const v7, 0x3c8351f7

    xor-int/2addr v6, v7

    const v7, -0x77a95b4

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06e8\u06e1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x37f3

    const v7, -0x44d6f834    # -0.0025792f

    xor-int/2addr v6, v7

    const v7, 0x75f54e6a

    goto/16 :goto_0

    :sswitch_11
    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u1a76\u1a79"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4177

    const v7, -0x172b3a57

    xor-int/2addr v6, v7

    const v7, -0x47818e1c

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a76\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x5

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5b91

    const v7, -0x976a3c

    xor-int/2addr v6, v7

    const v7, 0x48fe7cd6

    goto/16 :goto_0

    :sswitch_12
    sget v5, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v5, :cond_e

    :goto_6
    const-string v5, "\u1a75\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3ead

    const v7, 0x7753a5

    xor-int/2addr v6, v7

    const v7, -0x4786e163

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u1a73\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3ca7

    const v7, 0x5f8cf231

    xor-int/2addr v6, v7

    const v7, 0x3ce47bbb

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79769b09 -> :sswitch_3
        -0x797181b9 -> :sswitch_0
        -0x74f68734 -> :sswitch_5
        -0x724e63e7 -> :sswitch_10
        -0x71d46939 -> :sswitch_0
        -0x68de6836 -> :sswitch_9
        -0x63fd25eb -> :sswitch_7
        -0x5ef01f53 -> :sswitch_1
        -0x5939d44e -> :sswitch_c
        -0x4a06abdb -> :sswitch_b
        -0x46d8cc72 -> :sswitch_12
        -0x3dad4440 -> :sswitch_e
        -0x3aac1787 -> :sswitch_a
        -0x331cbad9 -> :sswitch_8
        -0x2c989397 -> :sswitch_4
        -0xf80fd16 -> :sswitch_3
        -0x8d6e9bd -> :sswitch_1
        -0x6f7cdee -> :sswitch_a
        0x4b97d62 -> :sswitch_11
        0x86dc530 -> :sswitch_d
        0x9932180 -> :sswitch_6
        0x126dd2e0 -> :sswitch_f
        0x14dc848a -> :sswitch_8
        0x15128190 -> :sswitch_4
        0x19658b3f -> :sswitch_2
        0x24820f81 -> :sswitch_7
        0x2d91b1d6 -> :sswitch_11
        0x3e71e515 -> :sswitch_c
        0x48fcd332 -> :sswitch_2
        0x4b06d3f3 -> :sswitch_f
        0x4ef74657 -> :sswitch_9
        0x54084e24 -> :sswitch_e
        0x54f2073e -> :sswitch_10
        0x6119dccb -> :sswitch_6
        0x61631ddc -> :sswitch_b
        0x62f8a0df -> :sswitch_5
        0x6e0c2960 -> :sswitch_12
        0x7e2235bb -> :sswitch_d
    .end sparse-switch
.end method

.method public final setFastScrollEnabled(Z)V
    .locals 0

    .line 208
    iput-boolean p1, p0, Ll/ᩴܿ᩻;->᩸ۙ:Z

    return-void
.end method

.method public final setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V
    .locals 6

    const v0, -0x22c55eff

    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    sget v2, Ll/ۖۙ;->ۤۧۤ:I

    const-string v3, "\u05a8\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xb4f

    const v5, -0x7da9ccb0

    xor-int/2addr v4, v5

    const v5, -0x15aba786

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x167d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 220
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-gez v3, :cond_a

    goto :goto_2

    .line 560
    :sswitch_1
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_1

    .line 291
    :sswitch_2
    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v3, "\u073d\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4439

    const v5, 0x7cdca95e

    xor-int/2addr v4, v5

    const v5, -0x1c0245d7

    goto :goto_0

    .line 467
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    :goto_2
    const-string v3, "\u1a75\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x718b

    const v5, 0x8662c20

    xor-int/2addr v4, v5

    const v5, -0x62905374

    goto :goto_0

    .line 153
    :sswitch_4
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    return-void

    :sswitch_5
    const/4 p1, 0x0

    .line 585
    invoke-super {p0, p1}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void

    .line 588
    :sswitch_6
    new-instance p1, Ll/ۜ᩶᩻;

    invoke-direct {p1, p0}, Ll/ۜ᩶᩻;-><init>(Ll/ᩴܿ᩻;)V

    invoke-super {p0, p1}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void

    .line 583
    :sswitch_7
    iput-object p1, p0, Ll/ᩴܿ᩻;->ܳۙ:Landroid/widget/AdapterView$OnItemLongClickListener;

    if-nez p1, :cond_1

    const-string v3, "\u1a75\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4d13

    const v5, -0x14b0e438

    xor-int/2addr v4, v5

    const v5, -0x238d54b7

    goto/16 :goto_0

    :cond_1
    const-string v3, "\u06df\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5b2d

    const v5, -0x426882df

    xor-int/2addr v4, v5

    const v5, -0x7a833f1f

    goto/16 :goto_0

    .line 318
    :sswitch_8
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_2

    goto :goto_3

    :cond_2
    const-string v3, "\u05ab\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x61e9

    const v5, 0x440af4df

    xor-int/2addr v4, v5

    const v5, -0x6814a941

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e2\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x53e5

    const v5, 0x6e1c3c61

    xor-int/2addr v4, v5

    const v5, -0xe6aae6d

    goto/16 :goto_0

    .line 388
    :sswitch_9
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u1a7b\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3f2d

    const v5, -0x32ab0e5f

    xor-int/2addr v4, v5

    const v5, 0x68b2c35f

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v3, "\u1a77\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7e8d

    const v5, -0x3170f44f    # -1.199954E9f

    xor-int/2addr v4, v5

    const v5, 0x11a9bf88

    goto/16 :goto_0

    .line 414
    :sswitch_b
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_6

    :goto_3
    const-string v3, "\u06d7\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x46d3

    const v5, 0x49c6eb6f

    xor-int/2addr v4, v5

    const v5, 0x496e6cd2    # 976589.1f

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a77\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x747d

    const v5, -0x1805a87

    xor-int/2addr v4, v5

    const v5, 0x43da659f

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u1a7b\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6987

    const v5, -0x467f1ca9

    xor-int/2addr v4, v5

    const v5, 0x17e8d0b1

    goto/16 :goto_0

    .line 358
    :sswitch_d
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_8

    goto :goto_5

    :cond_8
    const-string v3, "\u06d9\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xfff

    const v5, -0x69157732

    xor-int/2addr v4, v5

    const v5, 0x55b2248a

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u06e4\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x411b

    const v5, 0xd045291

    xor-int/2addr v4, v5

    const v5, -0x4e538604

    goto/16 :goto_0

    .line 113
    :sswitch_f
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u06e8\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x9b1

    const v5, 0x11e69014

    xor-int/2addr v4, v5

    const v5, -0x7723633b

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e1\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4d99

    const v5, 0x693fc5bd

    xor-int/2addr v4, v5

    const v5, -0x249d3c5f

    goto/16 :goto_0

    .line 457
    :sswitch_10
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_d

    :cond_c
    :goto_5
    const-string v3, "\u06dc\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6711

    const v5, -0x2b99596b

    xor-int/2addr v4, v5

    const v5, -0x679e808f

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u1a7b\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x530f

    const v5, 0x2c50e5f6

    xor-int/2addr v4, v5

    const v5, -0x7c52d760

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ac54fd2 -> :sswitch_10
        -0x681fca8a -> :sswitch_a
        -0x67a7fb5b -> :sswitch_f
        -0x57d722b3 -> :sswitch_9
        -0x4199a31c -> :sswitch_8
        -0x3ceb36b1 -> :sswitch_3
        -0x384ee511 -> :sswitch_0
        -0x34516076 -> :sswitch_a
        -0x2ff0bc49 -> :sswitch_2
        -0x27eaf014 -> :sswitch_c
        -0xd675c25 -> :sswitch_5
        -0xb791324 -> :sswitch_b
        0xabaddd -> :sswitch_1
        0x100519a -> :sswitch_0
        0xd14e69d -> :sswitch_3
        0x1068a17d -> :sswitch_d
        0x14027d9c -> :sswitch_4
        0x151b23a5 -> :sswitch_4
        0x1592c4ae -> :sswitch_e
        0x22daf47a -> :sswitch_f
        0x32ca832e -> :sswitch_2
        0x39db6403 -> :sswitch_d
        0x3df03d6e -> :sswitch_6
        0x45dcfe8d -> :sswitch_b
        0x46225236 -> :sswitch_c
        0x50f8d0c9 -> :sswitch_6
        0x54dbe955 -> :sswitch_1
        0x583b05d4 -> :sswitch_8
        0x60ca1c30 -> :sswitch_e
        0x62235022 -> :sswitch_10
        0x6fc32608 -> :sswitch_9
        0x708bd284 -> :sswitch_7
        0x71e6d185 -> :sswitch_5
        0x79f54ffa -> :sswitch_7
    .end sparse-switch
.end method

.method public final setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 0

    .line 632
    iput-object p1, p0, Ll/ᩴܿ᩻;->۫ۙ:Landroid/widget/AbsListView$OnScrollListener;

    return-void
.end method

.method public final setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 0

    .line 745
    iput-object p1, p0, Ll/ᩴܿ᩻;->ܰ:Landroid/view/View$OnTouchListener;

    return-void
.end method

.method public final setSelection(I)V
    .locals 6

    const v0, 0x1bd9fa33

    sget v1, Ll/֫֨;->᩶ܺۡ:I

    sget v2, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v3, "\u06da\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x67b

    const v5, -0x279edbb5

    xor-int/2addr v4, v5

    const v5, 0x1cab8f27

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x2573

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 0
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_b

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_9

    goto/16 :goto_2

    .line 24
    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-lez v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u1a78\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5e99

    const v5, -0x383a270

    xor-int/2addr v4, v5

    const v5, 0x4f581479

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    return-void

    :sswitch_5
    const/4 p1, 0x0

    .line 108
    iput-boolean p1, p0, Ll/ᩴܿ᩻;->ۜ:Z

    return-void

    .line 107
    :sswitch_6
    invoke-super {p0, p1}, Landroid/widget/ListView;->setSelection(I)V

    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06e0\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7309

    const v5, -0x252c9011

    xor-int/2addr v4, v5

    const v5, 0x21bb92ab

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_3

    :cond_2
    :goto_1
    const-string v3, "\u0736\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x117f

    const v5, -0x727367d3

    xor-int/2addr v4, v5

    const v5, 0x42bd6926

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u05a8\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x22d7

    const v5, 0x23a0ac

    xor-int/2addr v4, v5

    const v5, -0x38342c44

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u05a8\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1e55

    const v5, -0x1b31002d

    xor-int/2addr v4, v5

    const v5, 0x43446c3c

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u073a\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x58c7

    const v5, 0x1cc60c0d

    xor-int/2addr v4, v5

    const v5, -0x62fec374

    goto/16 :goto_0

    .line 82
    :sswitch_a
    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u073d\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x59c3

    const v5, 0x5d149aee

    xor-int/2addr v4, v5

    const v5, 0x4662136a

    goto/16 :goto_0

    .line 36
    :sswitch_b
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u05a1\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7d59

    const v5, 0x7f77cef5

    xor-int/2addr v4, v5

    const v5, -0x74347d19

    goto/16 :goto_0

    .line 20
    :sswitch_c
    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_8

    :goto_2
    const-string v3, "\u1a7a\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4df

    const v5, 0x1ee7df19

    xor-int/2addr v4, v5

    const v5, 0x13c8acd3

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d6\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x199f

    const v5, -0x75011c7

    xor-int/2addr v4, v5

    const v5, -0x31b23319    # -8.6318944E8f

    goto/16 :goto_0

    .line 26
    :sswitch_d
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u1a75\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x43e7

    const v5, -0x5a0b6442

    xor-int/2addr v4, v5

    const v5, 0x145b0f94

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d9\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1ecb

    const v5, -0x7d7c4a93

    xor-int/2addr v4, v5

    const v5, -0x6e7a3d1c

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e0\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2145

    const v5, -0x15cfe2b3

    xor-int/2addr v4, v5

    const v5, -0x4380b084

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u1a78\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5085

    const v5, 0x52016def

    xor-int/2addr v4, v5

    const v5, -0x230ddb3e

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06ec\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4b9b

    const v5, 0x27c24451

    xor-int/2addr v4, v5

    const v5, -0x7f4c0fa4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x71f1a29f -> :sswitch_a
        -0x71d8fdcc -> :sswitch_e
        -0x69751e27 -> :sswitch_c
        -0x6126d47a -> :sswitch_5
        -0x599901e5 -> :sswitch_0
        -0x508b32a5 -> :sswitch_0
        -0x4d1ce74d -> :sswitch_b
        -0x39178d32 -> :sswitch_d
        -0x2999e6f3 -> :sswitch_d
        -0x17a2f9c3 -> :sswitch_8
        -0x14ed0789 -> :sswitch_c
        -0x130c3778 -> :sswitch_7
        -0x7e43a94 -> :sswitch_9
        0x613676b -> :sswitch_3
        0x76aacb7 -> :sswitch_9
        0x1b3a2d95 -> :sswitch_2
        0x1eeb5896 -> :sswitch_1
        0x22882603 -> :sswitch_6
        0x23b9ef9f -> :sswitch_1
        0x2451e2f1 -> :sswitch_b
        0x26a33e99 -> :sswitch_4
        0x282caf86 -> :sswitch_2
        0x292411f7 -> :sswitch_8
        0x2a0a7ba8 -> :sswitch_7
        0x2dd7920b -> :sswitch_6
        0x3c321244 -> :sswitch_3
        0x4123f80e -> :sswitch_4
        0x5b2caf42 -> :sswitch_5
        0x61d7c034 -> :sswitch_a
        0x7ffed69f -> :sswitch_e
    .end sparse-switch
.end method

.method public final showContextMenuForChild(Landroid/view/View;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x4b54050b    # 1.3894923E7f

    sget v2, Ll/ۖ;->ܿۚ֡:I

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    const-string v4, "\u0730\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x794d

    const v6, -0x2cb33cd6

    xor-int/2addr v5, v6

    const v6, -0x57dc968a

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x4373

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v4

    if-eqz v4, :cond_d

    goto/16 :goto_4

    :sswitch_0
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_a

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v4

    if-gez v4, :cond_c

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u1a74\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1d1

    const v6, 0x2325293a

    xor-int/2addr v5, v6

    const v6, -0x724f8e33

    goto :goto_0

    .line 523
    :sswitch_3
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    goto/16 :goto_2

    .line 198
    :sswitch_4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 v4, 0x0

    .line 385
    iput-boolean v4, p0, Ll/ᩴܿ᩻;->ۚۙ:Z

    goto :goto_1

    :sswitch_6
    const/4 v4, 0x1

    .line 384
    iput-boolean v4, p0, Ll/ᩴܿ᩻;->ᩴۙ:Z

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v4

    if-ltz v4, :cond_1

    const-string v4, "\u1a7a\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x22c1

    const v6, 0x3a5856c0

    xor-int/2addr v5, v6

    const v6, -0x7ff5479e

    goto :goto_0

    :cond_1
    const-string v4, "\u0730\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x11d5

    const v6, 0x5ff02f92

    xor-int/2addr v5, v6

    const v6, 0x585d10b6

    goto/16 :goto_0

    :sswitch_7
    return v0

    .line 603
    :sswitch_8
    invoke-super {p0, p1}, Landroid/widget/ListView;->showContextMenuForChild(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v4, "\u1a74\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7a31

    const v6, 0x2be864e7

    xor-int/2addr v5, v6

    const v6, -0x10a1128a

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v4, "\u073a\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6f13

    const v6, -0x4b01ddc7

    xor-int/2addr v5, v6

    const v6, 0x772c0870

    goto/16 :goto_0

    .line 390
    :sswitch_9
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u1a76\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x36cd

    const v6, 0x32dd2097

    xor-int/2addr v5, v6

    const v6, -0x41016c79

    goto/16 :goto_0

    .line 231
    :sswitch_a
    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u073f\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7123

    const v6, -0x50c04bbf

    xor-int/2addr v5, v6

    const v6, -0x240bd7ef

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v4

    if-ltz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06d7\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x537d

    const v6, 0x4a565238    # 3511438.0f

    xor-int/2addr v5, v6

    const v6, 0x8e04b7f

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v4

    if-gtz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06e1\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x60a7

    const v6, -0x2dbe6205

    xor-int/2addr v5, v6

    const v6, 0x6b3c8baf

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u06e7\u0736"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3081

    const v6, -0x117cbe20

    xor-int/2addr v5, v6

    const v6, -0x448a0c20

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_8

    :goto_2
    const-string v4, "\u06d6\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x257d

    const v6, 0x1b66a434

    xor-int/2addr v5, v6

    const v6, 0x7427bbdf

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d8\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2771

    const v6, -0x7370e217

    xor-int/2addr v5, v6

    const v6, -0x1bedfd6b

    goto/16 :goto_0

    .line 248
    :sswitch_f
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u06e4\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x34f3

    const v6, 0x36241ec6

    xor-int/2addr v5, v6

    const v6, 0xce9148

    goto/16 :goto_0

    :sswitch_10
    sget v4, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u06e1\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x59

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4de7

    const v6, -0x2e526ab9

    xor-int/2addr v5, v6

    const v6, -0x199018fe

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u05a1\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x49f3

    const v6, -0x5dc7fdf1

    xor-int/2addr v5, v6

    const v6, -0x1318d180

    goto/16 :goto_0

    :cond_c
    :goto_4
    const-string v4, "\u06e8\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2897

    const v6, 0x4686a133

    xor-int/2addr v5, v6

    const v6, -0x7761efa6

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u0733\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5bd3

    const v6, 0x220dc8cb

    xor-int/2addr v5, v6

    const v6, -0x3cb95d44

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f10bb19 -> :sswitch_5
        -0x7864b258 -> :sswitch_5
        -0x7394eaa7 -> :sswitch_8
        -0x6ee6a101 -> :sswitch_1
        -0x6e03b0b8 -> :sswitch_d
        -0x6ab2e0df -> :sswitch_c
        -0x56fac465 -> :sswitch_6
        -0x4b256391 -> :sswitch_e
        -0x493061d2 -> :sswitch_2
        -0x3acae792 -> :sswitch_f
        -0x22802c1b -> :sswitch_3
        -0x2251815a -> :sswitch_2
        -0x1c646829 -> :sswitch_0
        -0x18c34dcf -> :sswitch_a
        -0x10ed916b -> :sswitch_e
        -0xbfad459 -> :sswitch_7
        -0x4e4f3c7 -> :sswitch_10
        0x823182a -> :sswitch_9
        0xda4a143 -> :sswitch_3
        0x102320a8 -> :sswitch_b
        0x119e35d9 -> :sswitch_7
        0x14a70b6e -> :sswitch_8
        0x16485ef1 -> :sswitch_0
        0x1b3bd7da -> :sswitch_f
        0x25a792a2 -> :sswitch_a
        0x2f5ff7f9 -> :sswitch_c
        0x4351c51d -> :sswitch_10
        0x52e9a439 -> :sswitch_1
        0x5be34d0f -> :sswitch_9
        0x5d9a4ed8 -> :sswitch_d
        0x6052f236 -> :sswitch_4
        0x63524a76 -> :sswitch_b
        0x6f3b02c2 -> :sswitch_6
        0x72d5a7e5 -> :sswitch_4
    .end sparse-switch
.end method

.method public final showContextMenuForChild(Landroid/view/View;FF)Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0xd9c2434

    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v4, "\u05a1\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4e31

    const v6, -0x78585ad5

    xor-int/2addr v5, v6

    const v6, 0x76c515f9

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x5483

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_c

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v4, :cond_9

    goto/16 :goto_3

    :sswitch_1
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_6

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    goto/16 :goto_5

    .line 428
    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    const/4 p1, 0x0

    return p1

    :sswitch_4
    const/4 v4, 0x1

    .line 384
    iput-boolean v4, p0, Ll/ᩴܿ᩻;->ᩴۙ:Z

    const/4 v4, 0x0

    .line 385
    iput-boolean v4, p0, Ll/ᩴܿ᩻;->ۚۙ:Z

    goto :goto_1

    :sswitch_5
    return v0

    .line 615
    :sswitch_6
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ListView;->showContextMenuForChild(Landroid/view/View;FF)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v4, "\u06d6\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xcc1

    const v6, 0x2c54b105

    xor-int/2addr v5, v6

    const v6, 0x20afe0c4

    goto :goto_0

    :cond_0
    :goto_1
    const-string v4, "\u1a74\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4eab

    const v6, 0x26a77f71

    xor-int/2addr v5, v6

    const v6, 0x1b9ebd9d

    goto :goto_0

    .line 311
    :sswitch_7
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    const-string v4, "\u073f\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2bc7

    const v6, -0x3647c5ae

    xor-int/2addr v5, v6

    const v6, 0x73e79b98

    goto/16 :goto_0

    .line 87
    :sswitch_8
    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u06d9\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3d05

    const v6, -0x300444af

    xor-int/2addr v5, v6

    const v6, 0x47d6b66b

    goto/16 :goto_0

    .line 493
    :sswitch_9
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u1a77\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3133

    const v6, 0x57364452

    xor-int/2addr v5, v6

    const v6, 0x2fc573e2

    goto/16 :goto_0

    .line 594
    :sswitch_a
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v4, "\u073a\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5791

    const v6, -0x6694db51

    xor-int/2addr v5, v6

    const v6, -0x59b319da

    goto/16 :goto_0

    .line 131
    :sswitch_b
    sget v4, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v4, :cond_5

    :goto_2
    const-string v4, "\u1a7b\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7a47

    const v6, 0x5d5ed53

    xor-int/2addr v5, v6

    const v6, 0x185ea1bd

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06dc\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3035

    const v6, -0x621fcb5e

    xor-int/2addr v5, v6

    const v6, 0x4741371a

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_7

    :cond_6
    :goto_3
    const-string v4, "\u1a76\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1f47

    const v6, -0x49deb608

    xor-int/2addr v5, v6

    const v6, 0x78a13906

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a77\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x36b3

    const v6, -0x3129e55c

    xor-int/2addr v5, v6

    const v6, 0x3782ff53

    goto/16 :goto_0

    .line 266
    :sswitch_d
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u073d\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2e07

    const v6, 0x120d5321

    xor-int/2addr v5, v6

    const v6, 0x5129d95f

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u1a75\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x314f

    const v6, 0x35c60de8

    xor-int/2addr v5, v6

    const v6, 0x6788668f

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a7b\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x52d1

    const v6, -0x3462887f    # -2.063949E7f

    xor-int/2addr v5, v6

    const v6, 0x2721a078

    goto/16 :goto_0

    .line 547
    :sswitch_f
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v4

    if-ltz v4, :cond_b

    :goto_5
    const-string v4, "\u06e4\u0736"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x39

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1a95

    const v6, -0x3b1eaca2

    xor-int/2addr v5, v6

    const v6, -0x76fb920d

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a79\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x76ab

    const v6, 0x5c56a1b0

    xor-int/2addr v5, v6

    const v6, 0x130fda61

    goto/16 :goto_0

    :sswitch_10
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_d

    :cond_c
    :goto_6
    const-string v4, "\u06df\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x71dd

    const v6, -0x5f7ba423

    xor-int/2addr v5, v6

    const v6, -0x67ebbe2a

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e7\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6f8d

    const v6, -0x16edaeac

    xor-int/2addr v5, v6

    const v6, 0x55c1057a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d4c30af -> :sswitch_d
        -0x75409ad8 -> :sswitch_f
        -0x5b66c626 -> :sswitch_6
        -0x50f7afc8 -> :sswitch_a
        -0x50602e46 -> :sswitch_7
        -0x4fa28d7f -> :sswitch_b
        -0x469f7c09 -> :sswitch_c
        -0x45dc06aa -> :sswitch_e
        -0x3ec0b5e8 -> :sswitch_f
        -0x3b1c9c23 -> :sswitch_5
        -0x38dc8123 -> :sswitch_0
        -0x37194dfd -> :sswitch_4
        -0x34643f0e -> :sswitch_5
        -0x313dbbc1 -> :sswitch_3
        -0x3078b282 -> :sswitch_8
        -0x23807cf7 -> :sswitch_c
        -0x1700abd3 -> :sswitch_b
        -0xfa3ece3 -> :sswitch_d
        -0x4baa248 -> :sswitch_e
        0xa4fe74d -> :sswitch_7
        0xb284cb4 -> :sswitch_6
        0x21fc0265 -> :sswitch_a
        0x2560600e -> :sswitch_4
        0x36fcaea4 -> :sswitch_10
        0x41c56948 -> :sswitch_8
        0x43f7f818 -> :sswitch_2
        0x4764d7a5 -> :sswitch_1
        0x476a0a34 -> :sswitch_1
        0x4e05a0fd -> :sswitch_9
        0x53ba00f0 -> :sswitch_3
        0x5ff5b2b8 -> :sswitch_10
        0x6023ede8 -> :sswitch_2
        0x6839488e -> :sswitch_9
        0x7a1d6b98 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ۙ()I
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x60582cfb

    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    sget v6, Ll/᩺;->۫۬۫:I

    const-string v7, "\u06e8\u1a77"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x13

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4db1

    const v9, 0x101b7d9e

    xor-int/2addr v8, v9

    const v9, -0x620e0a86

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, -0x1945

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 130
    sget v7, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v7, :cond_4

    goto/16 :goto_3

    :sswitch_0
    sget v7, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v7, :cond_b

    goto/16 :goto_3

    .line 110
    :sswitch_1
    sget v7, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v7, :cond_6

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v7

    if-eqz v7, :cond_3

    goto/16 :goto_5

    .line 89
    :sswitch_3
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    goto/16 :goto_5

    .line 165
    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    const/4 v0, 0x0

    return v0

    .line 242
    :sswitch_5
    invoke-static {p0}, Ll/ۖ᩵;->ܰۙܶ(Ljava/lang/Object;)I

    move-result v2

    div-int/2addr v2, v3

    invoke-static {v0, v2}, Ll/ۖܰ;->ܰۛۖ(II)I

    move-result v2

    goto :goto_2

    .line 246
    :sswitch_6
    iput v2, p0, Ll/ᩴܿ᩻;->ܺۙ:I

    goto :goto_1

    .line 247
    :sswitch_7
    iget v0, p0, Ll/ᩴܿ᩻;->ܺۙ:I

    return v0

    :sswitch_8
    const/4 v3, 0x0

    .line 240
    invoke-static {p0, v3}, Ll/ۘܽ;->ܳۢ᩻(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Ll/֫֨;->ܶ᩶ܰ(Ljava/lang/Object;)I

    move-result v3

    if-le v3, v1, :cond_1

    const-string v7, "\u06db\u1a76"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0xd

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2d3b

    const v9, 0x1b8f20c7

    xor-int/2addr v8, v9

    const v9, 0x5958be62

    goto :goto_0

    .line 245
    :sswitch_9
    iget v7, p0, Ll/ᩴܿ᩻;->ܺۙ:I

    if-le v2, v7, :cond_0

    const-string v7, "\u05ab\u06e7"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5a79

    const v9, 0x25d211a9

    xor-int/2addr v8, v9

    const v9, 0x33bfb441

    goto :goto_0

    :cond_0
    :goto_1
    const-string v7, "\u0733\u1a7b"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x137f

    const v9, 0x5be8db4

    xor-int/2addr v8, v9

    const v9, 0x2670c0ca

    goto/16 :goto_0

    :sswitch_a
    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    const-string v7, "\u05ab\u06e2"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1741

    const v9, 0x3a33237e

    xor-int/2addr v8, v9

    const v9, 0xe807346

    goto/16 :goto_0

    :cond_1
    move v2, v0

    :goto_2
    const-string v7, "\u1a76\u05a1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x31

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1405

    const v9, -0x68897136

    xor-int/2addr v8, v9

    const v9, 0x61c7a678

    goto/16 :goto_0

    .line 106
    :sswitch_b
    sget v7, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v7, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v7, "\u1a79\u06ec"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6f61

    const v9, -0x64666ef9

    xor-int/2addr v8, v9

    const v9, 0x5ed72d58

    goto/16 :goto_0

    :cond_3
    :goto_3
    const-string v7, "\u073d\u0730"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x1f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x473

    const v9, -0x11433fd

    xor-int/2addr v8, v9

    const v9, 0x47432bd9

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u1a77\u1a79"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1601

    const v9, -0x317acbf1

    xor-int/2addr v8, v9

    const v9, -0x12eb9812

    goto/16 :goto_0

    .line 15
    :sswitch_c
    sget v7, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v7, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v7, "\u06ec\u1a78"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x47

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7249

    const v9, 0x3b5e0dda

    xor-int/2addr v8, v9

    const v9, -0x7c207474

    goto/16 :goto_0

    :sswitch_d
    sget v7, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v7, :cond_7

    :cond_6
    const-string v7, "\u06eb\u06df"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x2f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5991

    const v9, 0x458aa72f

    xor-int/2addr v8, v9

    const v9, 0x1ccadacf

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u0736\u0730"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x43

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x69f

    const v9, 0x336e23b8

    xor-int/2addr v8, v9

    const v9, 0x56e7e59f

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v7, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v7, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v7, "\u06e8\u06ec"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1b95

    const v9, -0x5b38e3cc

    xor-int/2addr v8, v9

    const v9, 0x61bf2712

    goto/16 :goto_0

    .line 206
    :sswitch_f
    sget v7, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v7, :cond_9

    goto :goto_5

    :cond_9
    const-string v7, "\u1a7b\u05a1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x294f

    const v9, -0x5643a3b

    xor-int/2addr v8, v9

    const v9, 0x5661faf7    # 6.2117E13f

    goto/16 :goto_0

    .line 244
    :sswitch_10
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_4

    :cond_a
    const-string v7, "\u06e1\u0733"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5d8d

    const v9, -0x71ba8e9d

    xor-int/2addr v8, v9

    const v9, 0xbf81abb

    goto/16 :goto_0

    :sswitch_11
    sget v7, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v7, :cond_c

    :cond_b
    :goto_4
    const-string v7, "\u06df\u0730"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x6c81

    const v9, -0x3d7b8475

    xor-int/2addr v8, v9

    const v9, 0x69e4f403

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06d9\u06dc"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x47

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2417

    const v9, -0x789d2d29

    xor-int/2addr v8, v9

    const v9, 0x2bff602e

    goto/16 :goto_0

    .line 245
    :sswitch_12
    sget v7, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v7, :cond_d

    :goto_5
    const-string v7, "\u06d8\u0736"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x75

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x301

    const v9, 0x23aeae6d

    xor-int/2addr v8, v9

    const v9, 0x3fd7a846

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u06e7\u05a1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x3e3d

    const v9, -0xb3251d9

    xor-int/2addr v8, v9

    const v9, 0x42343222

    goto/16 :goto_0

    .line 238
    :sswitch_13
    invoke-static {p0}, Ll/֨ᩳ;->ۗۘۙ(Ljava/lang/Object;)I

    move-result v0

    sget v7, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v7, :cond_e

    :goto_6
    const-string v7, "\u073f\u06eb"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x4b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x68b1

    const v9, -0x37ec7171

    xor-int/2addr v8, v9

    const v9, 0x66c81294

    goto/16 :goto_0

    :cond_e
    const-string v7, "\u05a1\u06d9"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3aaf

    const v9, -0x4af6c8bb

    xor-int/2addr v8, v9

    const v9, 0x54a7701d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ee58a1d -> :sswitch_10
        -0x77d18a62 -> :sswitch_6
        -0x6fc101f8 -> :sswitch_d
        -0x6bb5a7da -> :sswitch_0
        -0x5f692f31 -> :sswitch_13
        -0x5eff28b3 -> :sswitch_0
        -0x588805a9 -> :sswitch_a
        -0x5582aae2 -> :sswitch_11
        -0x49625593 -> :sswitch_a
        -0x456c679e -> :sswitch_13
        -0x432ee3a9 -> :sswitch_10
        -0x41d48329 -> :sswitch_e
        -0x3f5fa767 -> :sswitch_5
        -0x3b239a28 -> :sswitch_7
        -0x3ae18ea2 -> :sswitch_8
        -0x2cd1dfc7 -> :sswitch_2
        -0x280b8566 -> :sswitch_b
        -0x24094185 -> :sswitch_6
        -0x1c4e8591 -> :sswitch_f
        -0x1a9d5140 -> :sswitch_9
        -0x177c97b9 -> :sswitch_9
        -0x15c0d196 -> :sswitch_4
        0x1641e2f6 -> :sswitch_3
        0x1c936af4 -> :sswitch_7
        0x20322446 -> :sswitch_2
        0x24e37c41 -> :sswitch_4
        0x34639647 -> :sswitch_8
        0x35ff43bb -> :sswitch_11
        0x41a2fc8e -> :sswitch_12
        0x4e56c1aa -> :sswitch_f
        0x53077ba4 -> :sswitch_1
        0x5b5ca980 -> :sswitch_d
        0x5bd85a43 -> :sswitch_5
        0x609ad08d -> :sswitch_c
        0x6217e6a3 -> :sswitch_c
        0x64cb1fae -> :sswitch_1
        0x6792e694 -> :sswitch_3
        0x6e4496d3 -> :sswitch_12
        0x7113a038 -> :sswitch_e
        0x7fe0e347 -> :sswitch_b
    .end sparse-switch
.end method

.method public final ۙ(Landroid/view/View$OnTouchListener;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x4b2c56be

    sget v2, Ll/ۖ;->ܿۚ֡:I

    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    const-string v4, "\u06db\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x44fd

    const v6, 0x43e89be7

    xor-int/2addr v5, v6

    const v6, 0x376d997f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x607

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 570
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_1

    .line 200
    :sswitch_0
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-gez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v4, "\u073a\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5591

    const v6, 0x73427c4c

    xor-int/2addr v5, v6

    const v6, -0x7e30f7eb

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v4

    if-eqz v4, :cond_7

    goto/16 :goto_5

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    goto/16 :goto_5

    .line 466
    :sswitch_3
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    return-void

    .line 752
    :sswitch_4
    new-instance v4, Ll/۬᩶᩻;

    invoke-direct {v4, p0}, Ll/۬᩶᩻;-><init>(Ll/ᩴܿ᩻;)V

    invoke-super {p0, v4}, Landroid/widget/ListView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_2

    .line 751
    :sswitch_5
    iput-object v0, p0, Ll/ᩴܿ᩻;->ܶۙ:Ljava/util/ArrayList;

    .line 680
    sget v4, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v4, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v4, "\u0736\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7841

    const v6, 0x6636138

    xor-int/2addr v5, v6

    const v6, 0x5d461922

    goto :goto_0

    .line 751
    :sswitch_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 149
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v4

    if-ltz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06e8\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x757d

    const v6, -0x1fb9fa8a

    xor-int/2addr v5, v6

    const v6, 0x67cd2554

    goto/16 :goto_0

    .line 765
    :sswitch_7
    iget-object v0, p0, Ll/ᩴܿ᩻;->ܶۙ:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    .line 750
    :sswitch_8
    iget-object v4, p0, Ll/ᩴܿ᩻;->ܶۙ:Ljava/util/ArrayList;

    if-nez v4, :cond_3

    const-string v4, "\u06da\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x22e3

    const v6, 0x66fd5f3b

    xor-int/2addr v5, v6

    const v6, 0x3c30d3e7

    goto/16 :goto_0

    :cond_3
    :goto_2
    const-string v4, "\u1a7b\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5d3b

    const v6, -0x1ae97138

    xor-int/2addr v5, v6

    const v6, 0x4bd5f77b    # 2.8045046E7f

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u1a79\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4c1b

    const v6, -0x5e81e87

    xor-int/2addr v5, v6

    const v6, -0x6fb68cc6

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_5
    const-string v4, "\u06df\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3f19

    const v6, 0x4bbe3034    # 2.492836E7f

    xor-int/2addr v5, v6

    const v6, -0x24b68c7a

    goto/16 :goto_0

    .line 452
    :sswitch_b
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v4, "\u06d6\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7aa3

    const v6, 0x62a4eb0

    xor-int/2addr v5, v6

    const v6, -0x2dc70bfa

    goto/16 :goto_0

    .line 426
    :sswitch_c
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_8

    :cond_7
    :goto_3
    const-string v4, "\u0733\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x14e5

    const v6, 0x120bc5f4

    xor-int/2addr v5, v6

    const v6, 0x4afa877e    # 8209343.0f

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e4\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1f8d

    const v6, 0xa8bf41

    xor-int/2addr v5, v6

    const v6, -0x2bcf78d0

    goto/16 :goto_0

    .line 396
    :sswitch_d
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v4, "\u06ec\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4a6b

    const v6, 0x4de177c4    # 4.7284032E8f

    xor-int/2addr v5, v6

    const v6, 0x6709961e

    goto/16 :goto_0

    .line 521
    :sswitch_e
    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u1a75\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xe43

    const v6, 0x3f2d6ed2

    xor-int/2addr v5, v6

    const v6, 0x18632b1c

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a75\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1dc9

    const v6, 0x6d86dbf

    xor-int/2addr v5, v6

    const v6, 0x59b2b4e0

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_c

    :goto_5
    const-string v4, "\u06e0\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x529f

    const v6, 0x3be68bc6

    xor-int/2addr v5, v6

    const v6, 0x469c10fe

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a74\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6f27

    const v6, -0x6743fc80

    xor-int/2addr v5, v6

    const v6, -0x377ba3ba

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v4

    if-eqz v4, :cond_d

    :goto_6
    const-string v4, "\u1a79\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x9

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7e21

    const v6, 0x64cce40b

    xor-int/2addr v5, v6

    const v6, -0x189f7e93

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06ec\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x17bd

    const v6, -0x351f8196    # -7356213.0f

    xor-int/2addr v5, v6

    const v6, 0x261d2b33

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75268ee3 -> :sswitch_4
        -0x69c8e35a -> :sswitch_8
        -0x678871e7 -> :sswitch_0
        -0x5b953ab7 -> :sswitch_9
        -0x5adf58e3 -> :sswitch_3
        -0x59f4f2ea -> :sswitch_6
        -0x4a13f2c3 -> :sswitch_e
        -0x48852337 -> :sswitch_10
        -0x343ed9d1 -> :sswitch_7
        -0x32951bef -> :sswitch_2
        -0x2d384d4c -> :sswitch_b
        -0x2a51fd45 -> :sswitch_4
        -0x286f03df -> :sswitch_5
        -0x21ee0970 -> :sswitch_1
        -0x18e12a9f -> :sswitch_c
        -0x124600ce -> :sswitch_7
        -0xbe0ff0f -> :sswitch_c
        -0xd6af78 -> :sswitch_d
        0x1b1f13f9 -> :sswitch_2
        0x247dd08d -> :sswitch_3
        0x27573180 -> :sswitch_1
        0x2827d1e0 -> :sswitch_d
        0x2ad72635 -> :sswitch_6
        0x36d2e35e -> :sswitch_8
        0x398417f7 -> :sswitch_f
        0x48908ccd -> :sswitch_e
        0x4a67c849 -> :sswitch_10
        0x4e7bfbe0 -> :sswitch_5
        0x522fb0dd -> :sswitch_a
        0x5660574d -> :sswitch_a
        0x622c1231 -> :sswitch_0
        0x6f8af5c4 -> :sswitch_f
        0x727b9411 -> :sswitch_9
        0x72a88376 -> :sswitch_b
    .end sparse-switch
.end method

.method public final ۙ(Ll/۟᩷ۙ;)V
    .locals 6

    const v0, -0x22c60b8a

    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    sget v2, Ll/ۖ֨;->֨ۨۧ:I

    const-string v3, "\u05ab\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x739

    const v5, 0x127cb281

    xor-int/2addr v4, v5

    const v5, 0x57a24844

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x783

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 205
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_a

    goto/16 :goto_4

    .line 404
    :sswitch_0
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_b

    goto :goto_1

    .line 278
    :sswitch_1
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-gez v3, :cond_7

    goto :goto_1

    .line 238
    :sswitch_2
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-lez v3, :cond_9

    goto :goto_1

    .line 323
    :sswitch_3
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    :goto_1
    const-string v3, "\u06e8\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3949

    const v5, 0x757cc552

    xor-int/2addr v4, v5

    const v5, 0xe4716a9

    goto :goto_0

    .line 422
    :sswitch_4
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    return-void

    :sswitch_5
    const p1, 0x800005

    .line 627
    iput p1, p0, Ll/ᩴܿ᩻;->ۢ:I

    return-void

    .line 626
    :sswitch_6
    iput-object p1, p0, Ll/ᩴܿ᩻;->ᩳ:Ll/۟᩷ۙ;

    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u1a7a\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5c3b

    const v5, -0x56090844

    xor-int/2addr v4, v5

    const v5, -0x504edc04

    goto :goto_0

    :sswitch_7
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06e4\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3d7d

    const v5, 0x4ebd7596    # 1.5893E9f

    xor-int/2addr v4, v5

    const v5, -0x3b5c3650

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u06d9\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a81

    const v5, -0x750e0a8e

    xor-int/2addr v4, v5

    const v5, -0x31e05a02

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u0736\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6dc5

    const v5, 0x7d179b85

    xor-int/2addr v4, v5

    const v5, -0x633a2521

    goto/16 :goto_0

    .line 67
    :sswitch_a
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u1a78\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7aed

    const v5, 0x425ff338

    xor-int/2addr v4, v5

    const v5, -0x7fab7b0f

    goto/16 :goto_0

    .line 428
    :sswitch_b
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v3

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06e8\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1265

    const v5, -0x13cbf4b6

    xor-int/2addr v4, v5

    const v5, -0x1fb10d07

    goto/16 :goto_0

    .line 245
    :sswitch_c
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_6

    :goto_2
    const-string v3, "\u06e8\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1495

    const v5, -0x422c2d7b

    xor-int/2addr v4, v5

    const v5, -0x5db99e08

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u073f\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2e63

    const v5, 0x72ee2573

    xor-int/2addr v4, v5

    const v5, 0x7a0ea1ab

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    :goto_3
    const-string v3, "\u06d7\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6343

    const v5, -0x5510d6dd

    xor-int/2addr v4, v5

    const v5, -0x7823134f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0733\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2463

    const v5, 0x71bda0ae

    xor-int/2addr v4, v5

    const v5, 0x23163728

    goto/16 :goto_0

    :cond_9
    :goto_4
    const-string v3, "\u06db\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xafb

    const v5, 0x69b02231

    xor-int/2addr v4, v5

    const v5, 0x451f4b65

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a78\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5c49

    const v5, 0x4f3695a7

    xor-int/2addr v4, v5

    const v5, 0x52b45b13

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u05a8\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7ce5

    const v5, -0x151655a0

    xor-int/2addr v4, v5

    const v5, -0x6eca3c0c

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a78\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x435f

    const v5, 0x5f12aba

    xor-int/2addr v4, v5

    const v5, -0x1398c60c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7813d48b -> :sswitch_0
        -0x733b2b7e -> :sswitch_e
        -0x61863855 -> :sswitch_3
        -0x5f15c1e8 -> :sswitch_1
        -0x5e97eef6 -> :sswitch_b
        -0x5ae46d6d -> :sswitch_1
        -0x597c175d -> :sswitch_6
        -0x571acd69 -> :sswitch_3
        -0x545eb66e -> :sswitch_5
        -0x4df28b6f -> :sswitch_b
        -0xadb258b -> :sswitch_c
        0xa253155 -> :sswitch_7
        0x15792838 -> :sswitch_7
        0x16d9f221 -> :sswitch_a
        0x20b99f11 -> :sswitch_4
        0x20cdf1c4 -> :sswitch_d
        0x24e45093 -> :sswitch_2
        0x26bc829a -> :sswitch_e
        0x367c2558 -> :sswitch_a
        0x3e5e006a -> :sswitch_9
        0x47952793 -> :sswitch_4
        0x4af7373c -> :sswitch_8
        0x5118afa6 -> :sswitch_6
        0x5b319ce5 -> :sswitch_9
        0x5cba611a -> :sswitch_2
        0x623732ce -> :sswitch_8
        0x635adf92 -> :sswitch_d
        0x6902e66c -> :sswitch_0
        0x694c8fda -> :sswitch_c
        0x7980130b -> :sswitch_5
    .end sparse-switch
.end method

.method public final ۤ()Z
    .locals 6

    const v0, -0x2f3df08e

    sget v1, Ll/ۗ֨;->᩹ۜۡ:I

    sget v2, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v3, "\u06eb\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6017

    const v5, 0x50890231

    xor-int/2addr v4, v5

    const v5, 0x44e04603

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3b35

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 98
    iget-boolean v3, p0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_1

    .line 93
    :sswitch_0
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u1a74\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7967

    const v5, 0x142f5361

    xor-int/2addr v4, v5

    const v5, 0x65877225

    goto :goto_0

    .line 23
    :sswitch_1
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u1a79\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x27d7

    const v5, -0x17252711

    xor-int/2addr v4, v5

    const v5, 0x638654c7

    goto :goto_0

    .line 30
    :sswitch_2
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v3

    if-eqz v3, :cond_c

    goto/16 :goto_4

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    const/4 v0, 0x0

    return v0

    :sswitch_5
    const/4 v0, 0x0

    return v0

    :cond_2
    const-string v3, "\u06e2\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x219

    const v5, 0x2fa23af0

    xor-int/2addr v4, v5

    const v5, 0x68354d1e

    goto :goto_0

    :sswitch_6
    const/4 v0, 0x1

    return v0

    .line 98
    :sswitch_7
    invoke-direct {p0}, Ll/ᩴܿ᩻;->ܳ()Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "\u06e2\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x11f9

    const v5, -0x1c29a2e8

    xor-int/2addr v4, v5

    const v5, -0x67495a45

    goto/16 :goto_0

    :cond_3
    :goto_1
    const-string v3, "\u06db\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4e11

    const v5, -0x142ac447

    xor-int/2addr v4, v5

    const v5, 0x40ed7440

    goto/16 :goto_0

    .line 89
    :sswitch_8
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06dc\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2d25

    const v5, -0x40659a1e

    xor-int/2addr v4, v5

    const v5, 0x6c0f5651

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06d6\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x56fd

    const v5, 0x772f3b5b

    xor-int/2addr v4, v5

    const v5, 0x11d80049

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u06d8\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2f4f

    const v5, -0x1adadaa6

    xor-int/2addr v4, v5

    const v5, 0x5ce683c7

    goto/16 :goto_0

    .line 51
    :sswitch_b
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_7

    :goto_2
    const-string v3, "\u073d\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4fcf

    const v5, -0x575931d7

    xor-int/2addr v4, v5

    const v5, 0x22290cd

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e2\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5e95

    const v5, 0xf1831d0

    xor-int/2addr v4, v5

    const v5, 0x5354dfa8

    goto/16 :goto_0

    .line 60
    :sswitch_c
    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v3, "\u06d6\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5c41

    const v5, 0x1f8ed13b

    xor-int/2addr v4, v5

    const v5, -0x763fedac

    goto/16 :goto_0

    .line 66
    :sswitch_d
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_9

    goto/16 :goto_4

    :cond_9
    const-string v3, "\u05a8\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4269

    const v5, 0x1be32dd2

    xor-int/2addr v4, v5

    const v5, 0x2eff3e4f

    goto/16 :goto_0

    .line 65
    :sswitch_e
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u1a7a\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7069

    const v5, 0x3eea0156

    xor-int/2addr v4, v5

    const v5, -0x5e698c48

    goto/16 :goto_0

    .line 93
    :sswitch_f
    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_b

    goto :goto_3

    :cond_b
    const-string v3, "\u06d8\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1999

    const v5, 0x2fac78f8

    xor-int/2addr v4, v5

    const v5, -0x46eb005

    goto/16 :goto_0

    :sswitch_10
    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_d

    :cond_c
    :goto_3
    const-string v3, "\u06e4\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7899

    const v5, 0x446862ff

    xor-int/2addr v4, v5

    const v5, -0x7873781f

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e0\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xbd

    const v5, -0x34ff621e    # -8429026.0f

    xor-int/2addr v4, v5

    const v5, 0x505003b

    goto/16 :goto_0

    .line 23
    :sswitch_11
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_e

    :goto_4
    const-string v3, "\u1a77\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4e29

    const v5, -0x518bca25

    xor-int/2addr v4, v5

    const v5, -0x1cc43e3e

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06e8\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x71b7

    const v5, -0x1eca3d9e

    xor-int/2addr v4, v5

    const v5, 0x61d601df

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e5d32a4 -> :sswitch_3
        -0x7dd6aab2 -> :sswitch_5
        -0x79ec85aa -> :sswitch_7
        -0x7694fcd5 -> :sswitch_4
        -0x76666762 -> :sswitch_2
        -0x72ec43d5 -> :sswitch_b
        -0x706740b1 -> :sswitch_1
        -0x5b6b6630 -> :sswitch_d
        -0x55ddd2d0 -> :sswitch_10
        -0x5382c9b0 -> :sswitch_6
        -0x52d3096f -> :sswitch_c
        -0x52a18610 -> :sswitch_1
        -0x4d58fb2f -> :sswitch_10
        -0x46b70b96 -> :sswitch_a
        -0x4023d9e0 -> :sswitch_c
        -0x29cfd16f -> :sswitch_f
        -0x25522b2f -> :sswitch_8
        -0x23348a48 -> :sswitch_9
        -0x1954f131 -> :sswitch_e
        -0x131f2c1e -> :sswitch_e
        -0xd026e87 -> :sswitch_d
        -0xcbbdb15 -> :sswitch_11
        -0x4ce0ada -> :sswitch_8
        0x26d1e69 -> :sswitch_9
        0xed1c861 -> :sswitch_6
        0x14b2f84e -> :sswitch_0
        0x15533046 -> :sswitch_0
        0x16499d34 -> :sswitch_3
        0x18f8a358 -> :sswitch_a
        0x1aa32a37 -> :sswitch_b
        0x1ad20e31 -> :sswitch_7
        0x25a12a0f -> :sswitch_f
        0x31b16518 -> :sswitch_2
        0x37e7b1b6 -> :sswitch_5
        0x3d52b1aa -> :sswitch_11
        0x5e9e6d03 -> :sswitch_4
    .end sparse-switch
.end method

.method public final ᩷()Z
    .locals 1

    .line 102
    iget-boolean v0, p0, Ll/ᩴܿ᩻;->᩹ۙ:Z

    return v0
.end method

.method public final ᩸()V
    .locals 1

    const/4 v0, 0x0

    .line 198
    iput v0, p0, Ll/ᩴܿ᩻;->۠:I

    return-void
.end method

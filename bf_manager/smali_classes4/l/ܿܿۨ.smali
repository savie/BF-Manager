.class public final synthetic Ll/ܿܿۨ;
.super Ljava/lang/Object;
.source "819S"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Landroid/widget/TextView;

.field public final synthetic ۫:Landroid/widget/TextView;

.field public final synthetic ܺ:Ll/۟ۛۨ;

.field public final synthetic ܽ:Landroid/widget/TextView;

.field public final synthetic ܿ:Landroid/widget/TextView;

.field public final synthetic ᩶:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Ll/۟ۛۨ;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 6

    const v0, 0x40f197e3

    sget v1, Ll/ۘ֡;->ܰ֡ܽ:I

    sget v2, Ll/֨ۧ;->֫۠֡:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d7\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4c9

    const v5, -0x2cf32a1c

    xor-int/2addr v4, v5

    const v5, 0x3c23bf30

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x5149

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_2

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v3

    if-gtz v3, :cond_2

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_1

    :sswitch_2
    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    if-gez v3, :cond_9

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p4, p0, Ll/ܿܿۨ;->ܽ:Landroid/widget/TextView;

    iput-object p5, p0, Ll/ܿܿۨ;->۫:Landroid/widget/TextView;

    iput-object p6, p0, Ll/ܿܿۨ;->ܿ:Landroid/widget/TextView;

    return-void

    :sswitch_6
    iput-object p3, p0, Ll/ܿܿۨ;->֡:Landroid/widget/TextView;

    .line 1
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06d8\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x211f

    const v5, -0x5b71a17b

    xor-int/2addr v4, v5

    const v5, -0x1ad0e3d

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u1a77\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xb3

    const v5, 0x49c24162

    xor-int/2addr v4, v5

    const v5, -0x491af807

    goto :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v3, :cond_3

    :cond_2
    const-string v3, "\u06dc\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x76af

    const v5, 0x4bfca413    # 3.311415E7f

    xor-int/2addr v4, v5

    const v5, -0x110852f4    # -3.8326E28f

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06d7\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3631

    const v5, -0x49e5b453

    xor-int/2addr v4, v5

    const v5, 0x51d38760

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_4

    :goto_1
    const-string v3, "\u06eb\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4365

    const v5, 0xf5a7be3

    xor-int/2addr v4, v5

    const v5, -0x3aa9a716

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u073f\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x425d

    const v5, -0x767497ee    # -3.35609E-33f

    xor-int/2addr v4, v5

    const v5, 0x5ac1f983

    goto/16 :goto_0

    :goto_2
    const-string v3, "\u06e8\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2bad

    const v5, -0x8c64b3d

    xor-int/2addr v4, v5

    const v5, -0x33d7379e    # -4.4245384E7f

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e2\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1891

    const v5, 0x3869e620

    xor-int/2addr v4, v5

    const v5, 0x2b4305df

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u073f\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6189

    const v5, -0x5df4c65c

    xor-int/2addr v4, v5

    const v5, 0x6bbf08d6

    goto/16 :goto_0

    .line 0
    :sswitch_b
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u05ab\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2185

    const v5, 0x21e3b6c7

    xor-int/2addr v4, v5

    const v5, 0x7feb1e45

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u06e8\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x353d

    const v5, 0x7b1d7f47

    xor-int/2addr v4, v5

    const v5, 0x7096f0b1

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06e7\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2165

    const v5, 0x7e2e5857

    xor-int/2addr v4, v5

    const v5, 0x30d656e8

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06db\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x287

    const v5, 0x4256fef9

    xor-int/2addr v4, v5

    const v5, 0x211a016f

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/ܿܿۨ;->ܺ:Ll/۟ۛۨ;

    iput-object p2, p0, Ll/ܿܿۨ;->᩶:Landroid/widget/TextView;

    .line 4
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u0733\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x50c9

    const v5, -0x1117ddcc

    xor-int/2addr v4, v5

    const v5, -0x419cada3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a74\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3db7

    const v5, -0x3f257c7e

    xor-int/2addr v4, v5

    const v5, 0x11ec7356

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73502444 -> :sswitch_9
        -0x58815e58 -> :sswitch_a
        -0x56fe9f07 -> :sswitch_c
        -0x56905778 -> :sswitch_5
        -0x566bc3a5 -> :sswitch_0
        -0x5428bc68 -> :sswitch_6
        -0x3ff3bf3c -> :sswitch_8
        -0x242062da -> :sswitch_2
        -0x1ad91566 -> :sswitch_a
        0x98cf011 -> :sswitch_b
        0xabba9f0 -> :sswitch_6
        0x14f9880d -> :sswitch_4
        0x152a021f -> :sswitch_b
        0x182e64c6 -> :sswitch_0
        0x226054eb -> :sswitch_e
        0x346f74ed -> :sswitch_7
        0x3973eb7a -> :sswitch_2
        0x39eb84bf -> :sswitch_1
        0x4a9ef4c8 -> :sswitch_c
        0x56a625a4 -> :sswitch_3
        0x599f4c81 -> :sswitch_e
        0x5aecd833 -> :sswitch_8
        0x5d93bde3 -> :sswitch_4
        0x6232e03e -> :sswitch_7
        0x649f68c8 -> :sswitch_5
        0x6fc829e5 -> :sswitch_3
        0x726bcaac -> :sswitch_9
        0x743a34db -> :sswitch_1
        0x745314bc -> :sswitch_d
        0x791f9b01 -> :sswitch_d
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x107b8fb

    sget v7, Ll/ۖۧ;->ܺۚۖ:I

    sget v8, Ll/֨ۧ;->֫۠֡:I

    const-string v9, "\u1a73\u06e2"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x1041

    const v11, -0x1a64d13c

    xor-int/2addr v10, v11

    const v11, 0x4a7adb66    # 4110041.5f

    xor-int/2addr v9, v11

    move-object v15, v1

    move-object/from16 v16, v2

    move-object v11, v3

    move-object v12, v4

    move-object v13, v5

    :goto_0
    xor-int v1, v6, v7

    mul-int/lit16 v1, v1, 0x3c01

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v10

    xor-int v6, v9, v1

    sparse-switch v6, :sswitch_data_0

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    goto/16 :goto_1

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    if-lez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "\u1a79\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v8

    mul-int/lit8 v1, v1, -0x49

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, 0x373d

    const v3, -0x1a9d802f

    xor-int v10, v2, v3

    const v2, 0x19a5adf3

    goto/16 :goto_5

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget v1, Ll/֨ۧ;->֫۠֡:I

    if-gtz v1, :cond_5

    goto/16 :goto_4

    :sswitch_2
    sget v1, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v1, :cond_b

    goto :goto_1

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    return-void

    .line 0
    :sswitch_4
    iget-object v14, v0, Ll/ܿܿۨ;->ܽ:Landroid/widget/TextView;

    invoke-static/range {v11 .. v16}, Ll/۟ۛۨ;->ۙ(Ll/۟ۛۨ;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    return-void

    :sswitch_5
    iget-object v12, v0, Ll/ܿܿۨ;->᩶:Landroid/widget/TextView;

    iget-object v13, v0, Ll/ܿܿۨ;->֡:Landroid/widget/TextView;

    .line 1
    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v1, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v1, "\u073d\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v8, v1

    mul-int/lit8 v1, v1, 0x1b

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, 0x5e33

    const v3, -0xbf0f136

    xor-int v10, v2, v3

    const v2, 0x1f16f2b7

    goto/16 :goto_5

    .line 0
    :sswitch_6
    iget-object v11, v0, Ll/ܿܿۨ;->ܺ:Ll/۟ۛۨ;

    .line 4
    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v1, "\u1a77\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v7

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, -0x2821

    const v3, 0x545a082a

    xor-int v10, v2, v3

    const v2, -0x6a74f130

    goto/16 :goto_5

    .line 0
    :sswitch_7
    iget-object v1, v0, Ll/ܿܿۨ;->ܿ:Landroid/widget/TextView;

    .line 4
    sget v2, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v2, :cond_3

    move-object/from16 v16, v1

    :goto_1
    const-string v1, "\u06d7\u1a77"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v8

    mul-int/lit8 v1, v1, -0x75

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, -0x11b7

    const v3, 0xc436d67

    xor-int v10, v2, v3

    const v2, -0xd8ec80b

    goto/16 :goto_5

    :cond_3
    const-string v2, "\u06df\u0736"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v8

    mul-int/lit8 v2, v2, -0x53

    xor-int v3, v2, v7

    mul-int/lit16 v3, v3, 0x90d

    const v4, -0x74052cdc

    xor-int v10, v3, v4

    const v3, -0x5a17b14f

    xor-int v9, v2, v3

    move-object/from16 v16, v1

    goto/16 :goto_0

    .line 2
    :sswitch_8
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u1a73\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v7

    mul-int/lit8 v1, v1, -0x5d

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, -0x56cb

    const v3, -0x148069c3

    xor-int v10, v2, v3

    const v2, 0x4e2c60a2    # 7.230035E8f

    goto/16 :goto_5

    :sswitch_9
    sget-boolean v1, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v1, :cond_6

    :cond_5
    :goto_2
    const-string v1, "\u1a73\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v7

    mul-int/lit8 v1, v1, 0x39

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, -0x79e3

    const v3, -0x16e3aa64

    xor-int v10, v2, v3

    const v2, 0x5552b0c4

    goto/16 :goto_5

    :cond_6
    const-string v1, "\u06eb\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v8

    mul-int/lit8 v1, v1, 0x3f

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, 0x1791

    const v3, 0x27e9a5ae

    xor-int v10, v2, v3

    const v2, -0x5e50422e

    goto/16 :goto_5

    .line 1
    :sswitch_a
    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "\u0736\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v7

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, -0x7f69

    const v3, -0x25b430

    xor-int v10, v2, v3

    const v2, 0x6d08c604

    goto/16 :goto_5

    :sswitch_b
    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_8

    goto :goto_3

    :cond_8
    const-string v1, "\u05a8\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v8

    mul-int/lit8 v1, v1, 0x15

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, 0x2e85

    const v3, -0xd362a95

    xor-int v10, v2, v3

    const v2, -0x1096b9d8

    goto/16 :goto_5

    .line 3
    :sswitch_c
    sget v1, Ll/֨ۧ;->֫۠֡:I

    if-gtz v1, :cond_9

    goto :goto_3

    :cond_9
    const-string v1, "\u06e2\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v7

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, -0x137f

    const v3, 0x7a061ef3

    xor-int v10, v2, v3

    const v2, 0x497fed40    # 1048276.0f

    goto :goto_5

    :sswitch_d
    sget-boolean v1, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v1, :cond_a

    :goto_3
    const-string v1, "\u1a7a\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v8

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, -0xc25

    const v3, 0x698f24db

    xor-int v10, v2, v3

    const v2, 0x3b93f45e

    goto :goto_5

    :cond_a
    const-string v1, "\u06dc\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v8

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, 0x2c25

    const v3, -0x60940af1

    xor-int v10, v2, v3

    const v2, 0x42d938dd

    goto :goto_5

    .line 0
    :sswitch_e
    iget-object v15, v0, Ll/ܿܿۨ;->۫:Landroid/widget/TextView;

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v1, :cond_c

    :cond_b
    :goto_4
    const-string v1, "\u0730\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v7

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, -0xee7

    const v3, -0x33a2d2f1    # -5.7979964E7f

    xor-int v10, v2, v3

    const v2, 0x5e6d3a2e

    goto :goto_5

    :cond_c
    const-string v1, "\u1a76\u1a77"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v7

    xor-int v2, v1, v8

    mul-int/lit16 v2, v2, 0x5955

    const v3, 0x5d46c084

    xor-int v10, v2, v3

    const v2, -0x17e99ef    # -8.600019E37f

    :goto_5
    xor-int v9, v1, v2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x793db423 -> :sswitch_b
        -0x714cd1c2 -> :sswitch_d
        -0x5a54e500 -> :sswitch_4
        -0x59a09ad0 -> :sswitch_6
        -0x57d05970 -> :sswitch_8
        -0x510fee77 -> :sswitch_2
        -0x48ee6cd2 -> :sswitch_a
        -0x47337c49 -> :sswitch_6
        -0x3d6701a4 -> :sswitch_c
        -0x3301785b -> :sswitch_7
        -0x1ad98a9a -> :sswitch_1
        -0x1a46b924 -> :sswitch_5
        -0xbd08508 -> :sswitch_1
        0xe2ecff9 -> :sswitch_0
        0x1b78f9e2 -> :sswitch_2
        0x1d392684 -> :sswitch_9
        0x2765feab -> :sswitch_c
        0x2fc5c8c7 -> :sswitch_e
        0x33487636 -> :sswitch_9
        0x394e3720 -> :sswitch_b
        0x48524971 -> :sswitch_4
        0x488d6ca8 -> :sswitch_5
        0x593a4152 -> :sswitch_8
        0x5e2ce133 -> :sswitch_0
        0x6fc940f2 -> :sswitch_e
        0x72d1607b -> :sswitch_7
        0x72e527cf -> :sswitch_3
        0x77b681cd -> :sswitch_a
        0x7be00d2f -> :sswitch_d
        0x7dded0dc -> :sswitch_3
    .end sparse-switch
.end method

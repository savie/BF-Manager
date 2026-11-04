.class public final synthetic Ll/᩸ۖ᩻;
.super Ljava/lang/Object;
.source "44LP"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# static fields
.field private static final ܿۧ۟:[S


# instance fields
.field public final synthetic ܰ:Ll/ܺۖ᩻;

.field public final synthetic ᩶:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x15

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸ۖ᩻;->ܿۧ۟:[S

    return-void

    :array_0
    .array-data 2
        0x203bs
        0x7b85s
        -0x477ds
        -0x5203s
        -0x1db7s
        -0x1dbas
        -0x1dbfs
        -0x1db5s
        -0x1d87s
        -0x1dbas
        -0x1db6s
        -0x1da8s
        -0x1d93s
        -0x1daas
        -0x1d9as
        -0x1db5s
        -0x1df9s
        -0x1dffs
        -0x1dffs
        -0x1dffs
        -0x1dfas
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/ܺۖ᩻;Landroid/view/View;)V
    .locals 6

    const v0, -0x664bec4c

    sget v1, Ll/֨ۚ;->֡᩸ۛ:I

    sget v2, Ll/ۖ֡;->ۚۛᩳ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073d\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5ce1

    const v5, -0x20395a20

    xor-int/2addr v4, v5

    const v5, 0x42e2c111

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x40fd

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_5

    goto :goto_1

    .line 2
    :sswitch_0
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v3, :cond_b

    goto :goto_1

    .line 0
    :sswitch_1
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v3, "\u06d9\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, -0x6d

    const v5, -0x2e9bc689

    xor-int/2addr v4, v5

    const v5, 0x7beffcd9

    goto :goto_0

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    goto/16 :goto_3

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p2, p0, Ll/᩸ۖ᩻;->᩶:Landroid/view/View;

    return-void

    .line 2
    :sswitch_5
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06d8\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3499

    const v5, -0x1773686e

    xor-int/2addr v4, v5

    const v5, -0x53af4f36

    goto :goto_0

    :sswitch_6
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06e0\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1881

    const v5, -0x621bf697

    xor-int/2addr v4, v5

    const v5, -0x7ad9b714

    goto :goto_0

    .line 1
    :sswitch_7
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u1a77\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1a8b

    const v5, 0x5a88ce2c

    xor-int/2addr v4, v5

    const v5, -0xffd16df

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u1a73\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x28c1

    const v5, -0x524e86c9

    xor-int/2addr v4, v5

    const v5, 0x39dc3c0a

    goto/16 :goto_0

    .line 2
    :sswitch_9
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v3

    if-gtz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u073d\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3b4f

    const v5, -0x5bdc82d7

    xor-int/2addr v4, v5

    const v5, -0x1f89b774

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e0\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3a31

    const v5, 0x54984eec

    xor-int/2addr v4, v5

    const v5, -0x427034ab

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06d8\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x27e1

    const v5, 0x7609516d

    xor-int/2addr v4, v5

    const v5, -0x560589fc

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u1a7b\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3245

    const v5, 0x4c0bf893    # 3.6692556E7f

    xor-int/2addr v4, v5

    const v5, 0x330353ba

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_9

    :goto_3
    const-string v3, "\u1a73\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x787

    const v5, 0x27bbcdf8

    xor-int/2addr v4, v5

    const v5, -0xf449e4e

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a73\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x14eb

    const v5, -0x66efda45

    xor-int/2addr v4, v5

    const v5, -0x63aeba78

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_a

    :goto_4
    const-string v3, "\u0730\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7ebd

    const v5, -0x26eae35f

    xor-int/2addr v4, v5

    const v5, -0x20b2d07e

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05a1\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6da9

    const v5, 0x496d87cf

    xor-int/2addr v4, v5

    const v5, -0x19aff915

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩸ۖ᩻;->ܰ:Ll/ܺۖ᩻;

    .line 1
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_c

    :cond_b
    const-string v3, "\u073f\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1435

    const v5, 0x298165ab

    xor-int/2addr v4, v5

    const v5, 0x7770e084

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a75\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4333

    const v5, 0x1ab288a1

    xor-int/2addr v4, v5

    const v5, -0x721bcb9b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7de9f746 -> :sswitch_b
        -0x7bfd16bd -> :sswitch_c
        -0x7b116500 -> :sswitch_5
        -0x6c7a9ecc -> :sswitch_9
        -0x51836454 -> :sswitch_1
        -0x510b6f1e -> :sswitch_7
        -0x4e1ab7d7 -> :sswitch_5
        -0x4c6bb328 -> :sswitch_2
        -0x4aa05c0f -> :sswitch_0
        -0x415aee37 -> :sswitch_8
        -0x3ff8250b -> :sswitch_a
        -0x3e781a21 -> :sswitch_3
        -0x34ca602d -> :sswitch_1
        -0x347272a2 -> :sswitch_7
        -0x24d0ff49 -> :sswitch_8
        -0x88102b0 -> :sswitch_c
        0x60f7a1d -> :sswitch_d
        0xe620bba -> :sswitch_a
        0xed85eb0 -> :sswitch_e
        0xfabcd23 -> :sswitch_6
        0x19bd0000 -> :sswitch_2
        0x1acc9923 -> :sswitch_d
        0x3131d9ab -> :sswitch_b
        0x3a37e0f8 -> :sswitch_3
        0x3b7bfdea -> :sswitch_4
        0x49bc7cf8 -> :sswitch_0
        0x54368c80 -> :sswitch_6
        0x585587a1 -> :sswitch_9
        0x733a9d33 -> :sswitch_4
        0x7876ebbd -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p2

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

    const v16, -0x7c850ca2

    sget v17, Ll/ۖۙ;->ۤۧۤ:I

    sget v18, Ll/֫ۢ;->ۚ᩻᩵:I

    const-string v19, "\u06df\u073a"

    invoke-static/range {v19 .. v19}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v18

    xor-int v2, v19, v17

    mul-int/lit16 v2, v2, -0x48cd

    const v20, 0xc84c9ff

    xor-int v2, v2, v20

    const v20, 0x573250ed

    xor-int v19, v19, v20

    move-object v5, v4

    move-object v11, v10

    move-object v14, v13

    move/from16 v20, v19

    const/16 p1, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v19, -0x7c850ca2

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v8, v19, v17

    mul-int/lit16 v8, v8, 0x520f

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v2, v8

    xor-int v19, v20, v2

    sparse-switch v19, :sswitch_data_0

    const v2, 0xe22f

    const v10, 0xe22f

    goto/16 :goto_4

    .line 13
    :sswitch_0
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v2

    if-lez v2, :cond_1

    :cond_0
    move/from16 v2, v16

    goto/16 :goto_a

    :cond_1
    :goto_1
    move/from16 v2, v16

    goto/16 :goto_9

    .line 39
    :sswitch_1
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget v2, Ll/֨ۢ;->۬ܿܺ:I

    if-gez v2, :cond_0

    :goto_2
    move/from16 v8, p1

    goto/16 :goto_6

    .line 22
    :sswitch_2
    sget-boolean v2, Ll/ܽ;->᩷۬ۗ:Z

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v2, v16

    goto/16 :goto_8

    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    goto :goto_2

    .line 8
    :sswitch_4
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    const/4 v1, 0x0

    return v1

    :sswitch_5
    const/4 v1, 0x0

    return v1

    .line 45
    :sswitch_6
    invoke-static {v14, v15, v7, v10}, Ll/֨ܿ;->᩻ۢ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Ll/֡۟;->ۧۧ۬(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v0, Ll/᩸ۖ᩻;->ܰ:Ll/ܺۖ᩻;

    invoke-virtual {v2, v5}, Ll/ܺۖ᩻;->onClick(Landroid/view/View;)V

    goto/16 :goto_3

    :sswitch_7
    invoke-static {v4, v3}, Ll/ۗܰ;->۟᩻֨(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v5

    sget-object v14, Ll/᩸ۖ᩻;->ܿۧ۟:[S

    const/4 v15, 0x4

    const/16 v7, 0x11

    sget v2, Ll/᩺;->۫۬۫:I

    if-gtz v2, :cond_3

    goto :goto_1

    :cond_3
    const-string v2, "\u0736\u06df"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x4b

    xor-int v8, v2, v18

    mul-int/lit16 v8, v8, -0x6e23

    const v20, 0x28318ffb

    xor-int v8, v8, v20

    const v20, 0x5105b490

    goto/16 :goto_5

    :sswitch_8
    const v2, 0x7d46217e

    xor-int v3, v6, v2

    iget-object v4, v0, Ll/᩸ۖ᩻;->᩶:Landroid/view/View;

    .line 41
    sget v2, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v2, :cond_4

    const-string v2, "\u05ab\u06ec"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x3795

    const v20, 0x3c14e101

    xor-int v8, v8, v20

    const v20, -0x274ea693

    goto/16 :goto_5

    :cond_4
    const-string v2, "\u06e7\u06e7"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v18

    mul-int/lit16 v8, v8, 0x2a2d

    const v20, 0x57c5e1ea

    xor-int v8, v8, v20

    const v20, -0x1a4ba5f4

    goto/16 :goto_5

    .line 44
    :sswitch_9
    invoke-static {v11, v12, v13, v10}, Ll/֫۠;->۟ܿۖ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sget v2, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v2, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v2, "\u05a8\u1a74"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x21

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, 0x77bb

    const v20, 0x4c1ecd70    # 4.162912E7f

    xor-int v8, v8, v20

    const v20, -0x417ff80e

    goto/16 :goto_5

    :sswitch_a
    sget-object v11, Ll/᩸ۖ᩻;->ܿۧ۟:[S

    const/4 v12, 0x1

    const/4 v13, 0x3

    .line 9
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v2

    if-eqz v2, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v2, "\u05a8\u06d7"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, 0x307

    const v20, -0x522d4e5b

    xor-int v8, v8, v20

    const v20, 0x1a0b6e77

    goto/16 :goto_5

    :sswitch_b
    const/4 v1, 0x1

    return v1

    :sswitch_c
    const/16 v2, 0xa0

    if-eq v1, v2, :cond_8

    const-string v2, "\u05ab\u06d9"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x6f

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x5af9

    const v20, -0x5898274e

    xor-int v8, v8, v20

    const v20, -0x232e691a

    goto/16 :goto_5

    .line 44
    :sswitch_d
    invoke-virtual/range {p3 .. p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_7

    const-string v2, "\u06e1\u1a73"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v18

    mul-int/lit16 v8, v8, -0x21dd

    const v20, -0x7f235121

    xor-int v8, v8, v20

    const v20, -0x27b74c4a

    goto/16 :goto_5

    :cond_7
    :goto_3
    const-string v2, "\u1a75\u06e1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v18

    mul-int/lit16 v8, v8, 0x10f3

    const v20, 0x4faede7f

    xor-int v8, v8, v20

    const v20, 0x4bb44d30    # 2.363248E7f

    goto :goto_5

    :sswitch_e
    const/16 v2, 0x42

    if-eq v1, v2, :cond_8

    const-string v2, "\u06d9\u06df"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x3d

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, 0x63f5

    const v20, -0x607f8857

    xor-int v8, v8, v20

    const v20, -0x47274085

    goto :goto_5

    :cond_8
    const-string v2, "\u06df\u1a7b"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v18

    mul-int/lit16 v8, v8, 0x3afd

    const v20, -0x3e327ba9

    xor-int v8, v8, v20

    const v20, -0x510b7413

    goto :goto_5

    :sswitch_f
    const/16 v2, 0x5622

    const/16 v10, 0x5622

    :goto_4
    const-string v2, "\u073d\u073f"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x15

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x24c9

    const v20, 0x5b6dba13

    xor-int v8, v8, v20

    const v20, 0x490789cf

    goto :goto_5

    :sswitch_10
    const v2, 0x32b5c1

    add-int/2addr v2, v9

    sub-int v2, p1, v2

    if-gtz v2, :cond_9

    const-string v2, "\u06e2\u06ec"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v18

    mul-int/lit16 v8, v8, 0x25eb

    const v20, -0x635d5dcd

    xor-int v8, v8, v20

    const v20, 0x15db21d7

    :goto_5
    xor-int v20, v2, v20

    goto/16 :goto_c

    :cond_9
    const-string v2, "\u1a76\u06e8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x1c15

    const v20, -0x70bfaf9b

    xor-int v8, v8, v20

    const v20, -0x16d0e65a

    goto :goto_5

    :sswitch_11
    move/from16 v2, v16

    mul-int/lit16 v8, v2, 0xe3e

    mul-int v9, v2, v2

    .line 30
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v16

    if-eqz v16, :cond_a

    move/from16 v16, v2

    goto :goto_6

    :cond_a
    const-string v16, "\u06d7\u073f"

    invoke-static/range {v16 .. v16}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v16

    sub-int v16, v18, v16

    mul-int/lit8 v16, v16, 0x5d

    xor-int v0, v16, v17

    mul-int/lit16 v0, v0, 0x100f

    const v20, -0x58f196b3

    xor-int v0, v0, v20

    const v20, -0x1409de0c

    xor-int v20, v16, v20

    move/from16 v16, v2

    move/from16 p1, v8

    move v2, v0

    goto :goto_7

    :sswitch_12
    sget-object v0, Ll/᩸ۖ᩻;->ܿۧ۟:[S

    const/4 v2, 0x0

    aget-short v16, v0, v2

    .line 15
    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_b

    goto/16 :goto_2

    :goto_6
    const-string v0, "\u06db\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x3d

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, 0x548d

    const v20, -0xdbd66fc

    xor-int v2, v2, v20

    const v20, -0x1b5e1b23

    xor-int v20, v0, v20

    move-object/from16 v0, p0

    move/from16 p1, v8

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u06d8\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x77

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, 0x184b

    const v8, 0x4e9d9945

    xor-int/2addr v2, v8

    const v8, -0x837d7fb

    xor-int v20, v0, v8

    :goto_7
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_13
    move/from16 v2, v16

    .line 43
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v0

    if-eqz v0, :cond_c

    :goto_8
    const-string v0, "\u0730\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x71

    xor-int v8, v0, v17

    mul-int/lit16 v8, v8, 0x557b

    const v16, -0x7e70aca8

    xor-int v8, v8, v16

    const v16, -0x411081e9

    goto/16 :goto_b

    :cond_c
    const-string v0, "\u1a7b\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x2f

    xor-int v8, v0, v18

    mul-int/lit16 v8, v8, -0x512b

    const v16, -0x115706a2

    xor-int v8, v8, v16

    const v16, -0x5aafdd1f

    goto/16 :goto_b

    :sswitch_14
    move/from16 v2, v16

    .line 22
    sget v0, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v0, :cond_d

    :goto_9
    const-string v0, "\u0730\u0733"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x47

    xor-int v8, v0, v17

    mul-int/lit16 v8, v8, 0x7d47

    const v16, 0x36433339

    xor-int v8, v8, v16

    const v16, 0x588864a9

    goto :goto_b

    :cond_d
    const-string v0, "\u06db\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x65

    xor-int v8, v0, v17

    mul-int/lit16 v8, v8, 0x6093

    const v16, -0x17a5d480

    xor-int v8, v8, v16

    const v16, -0x290e4459

    goto :goto_b

    :sswitch_15
    move/from16 v2, v16

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_a

    :cond_e
    const-string v0, "\u1a7a\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v8, v0, v18

    mul-int/lit16 v8, v8, 0x7069

    const v16, -0xb0ca614

    xor-int v8, v8, v16

    const v16, 0xf61e51f

    goto :goto_b

    :sswitch_16
    move/from16 v2, v16

    .line 32
    sget v0, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v0, :cond_f

    :goto_a
    const-string v0, "\u06e2\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x41

    xor-int v8, v0, v18

    mul-int/lit16 v8, v8, -0x3563

    const v16, -0x5f0062a1

    xor-int v8, v8, v16

    const v16, -0x6bc2c8b4

    goto :goto_b

    :cond_f
    const-string v0, "\u0733\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v8, v0, v17

    mul-int/lit16 v8, v8, -0x3719

    const v16, 0x46080d67

    xor-int v8, v8, v16

    const v16, -0x623bc582

    :goto_b
    xor-int v20, v0, v16

    move-object/from16 v0, p0

    move/from16 v16, v2

    :goto_c
    move v2, v8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78eae0f7 -> :sswitch_14
        -0x7236ee8d -> :sswitch_f
        -0x63613e5d -> :sswitch_5
        -0x5c3cfac4 -> :sswitch_14
        -0x5b72a9dd -> :sswitch_f
        -0x55a37f5f -> :sswitch_6
        -0x54ac09bb -> :sswitch_7
        -0x4def357a -> :sswitch_c
        -0x4a760488 -> :sswitch_2
        -0x43ab23d5 -> :sswitch_0
        -0x439a2b06 -> :sswitch_4
        -0x40dac787 -> :sswitch_8
        -0x3d43282b -> :sswitch_3
        -0x3c3f484a -> :sswitch_b
        -0x377e39bb -> :sswitch_3
        -0x3203bee4 -> :sswitch_2
        -0x207e091c -> :sswitch_6
        -0x6de12a9 -> :sswitch_15
        -0x58cda6b -> :sswitch_11
        -0x20f062c -> :sswitch_9
        0x1b2b281 -> :sswitch_d
        0xfdde066 -> :sswitch_e
        0x12b3dd3d -> :sswitch_10
        0x18e75779 -> :sswitch_13
        0x1ab24af0 -> :sswitch_e
        0x20e1442c -> :sswitch_a
        0x2683a51b -> :sswitch_d
        0x26965eda -> :sswitch_b
        0x2a71fbc5 -> :sswitch_13
        0x3209f4b2 -> :sswitch_8
        0x33d7bf31 -> :sswitch_16
        0x3df72525 -> :sswitch_15
        0x3ff395f6 -> :sswitch_1
        0x4d021037 -> :sswitch_10
        0x4ebbc3ec -> :sswitch_16
        0x503f9d8e -> :sswitch_a
        0x543b95db -> :sswitch_12
        0x5c26016d -> :sswitch_1
        0x600993b8 -> :sswitch_5
        0x60c07321 -> :sswitch_4
        0x62561c6e -> :sswitch_0
        0x69d107cc -> :sswitch_c
        0x6dc34766 -> :sswitch_7
        0x7396ad64 -> :sswitch_12
        0x782712e9 -> :sswitch_11
        0x7eeeebbf -> :sswitch_9
    .end sparse-switch
.end method

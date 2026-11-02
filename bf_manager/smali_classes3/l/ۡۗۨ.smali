.class public final Ll/ۡۗۨ;
.super Ll/᩵ۨ;
.source "Q62Z"


# static fields
.field private static final ᩴۚ֫:[S


# instance fields
.field public final synthetic ۖ:Ll/ۛۗۨ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۡۗۨ;->ᩴۚ֫:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1125s
        -0x4deas
        -0x47abs
        -0x4c5cs
    .end array-data
.end method

.method public constructor <init>(Ll/ۛۗۨ;)V
    .locals 5

    const v0, 0x4a987fcf    # 4997095.5f

    sget v1, Ll/ۖۗ;->᩶۫ۗ:I

    sget v2, Ll/ۗ;->֨۬ۖ:I

    .line 510
    iput-object p1, p0, Ll/ۡۗۨ;->ۖ:Ll/ۛۗۨ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/᩵ۨ;-><init>(Z)V

    const-string p1, "\u1a7a\u06d7"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x69

    xor-int v3, p1, v1

    mul-int/lit16 v3, v3, -0x2e09

    const v4, 0x5a96aa08

    xor-int/2addr v3, v4

    const v4, -0xebe8a2f

    :goto_0
    xor-int/2addr p1, v4

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x445b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v3

    xor-int/2addr v0, p1

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget p1, Ll/ۗ᩺;->ۢۜ᩶:I

    if-lez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a77\u06e1"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int v3, p1, v1

    mul-int/lit16 v3, v3, -0x2e7b

    const v4, -0x716b065b

    xor-int/2addr v3, v4

    const v4, -0x38f42001

    goto :goto_0

    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget p1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u06dc\u1a78"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int v3, p1, v1

    mul-int/lit16 v3, v3, 0x819

    const v4, 0x7175a5e1

    xor-int/2addr v3, v4

    const v4, 0x62637b6d

    goto :goto_0

    .line 338
    :sswitch_1
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget p1, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06db\u073d"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x13

    xor-int v3, p1, v2

    mul-int/lit16 v3, v3, 0x22b7

    const v4, 0x20b33acf

    xor-int/2addr v3, v4

    const v4, 0x1ce06458

    goto :goto_0

    .line 60
    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    :goto_2
    const-string p1, "\u06dc\u1a77"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int v3, p1, v1

    mul-int/lit16 v3, v3, -0x37d1

    const v4, 0x4d4507e6    # 2.0660182E8f

    xor-int/2addr v3, v4

    const v4, -0x3499a9ac    # -1.509538E7f

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 410
    :sswitch_5
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result p1

    if-gtz p1, :cond_3

    const-string p1, "\u073f\u06da"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x43

    xor-int v3, p1, v2

    mul-int/lit16 v3, v3, -0x1cbf

    const v4, 0x4fa8f4b9

    xor-int/2addr v3, v4

    const v4, -0x3e9566be

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06db\u073a"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int v3, p1, v2

    mul-int/lit16 v3, v3, -0x62f7

    const v4, -0x360b690

    xor-int/2addr v3, v4

    const v4, 0x5647dc85

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x792b3cb3 -> :sswitch_2
        -0x72a0037a -> :sswitch_5
        -0x706ad253 -> :sswitch_3
        -0x69dba9ab -> :sswitch_4
        -0x660027e7 -> :sswitch_4
        -0x5baedf8f -> :sswitch_2
        -0x2f6c7903 -> :sswitch_1
        0x58ba751 -> :sswitch_0
        0x6b055dd6 -> :sswitch_5
        0x6c35fffb -> :sswitch_1
        0x75f8f639 -> :sswitch_0
        0x7996abc3 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final ܰ()V
    .locals 21

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

    const v15, -0x83ecf4e

    sget v16, Ll/ۖۧ;->ܺۚۖ:I

    sget v17, Ll/ۘ֡;->ܰ֡ܽ:I

    const-string v18, "\u073d\u0730"

    invoke-static/range {v18 .. v18}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v17

    mul-int/lit8 v18, v18, -0x73

    xor-int v0, v18, v16

    mul-int/lit16 v0, v0, -0x28b

    const v20, -0x2a5104f3

    xor-int v0, v0, v20

    const v20, 0x7c9664b9

    xor-int v18, v18, v20

    move-object v2, v1

    move-object/from16 v20, v4

    move-object v13, v12

    move/from16 v19, v18

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, -0x83ecf4e

    :goto_0
    xor-int v5, v18, v16

    mul-int/lit16 v5, v5, 0x5f67

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    aget-short v7, v20, v6

    .line 24
    sget-boolean v0, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v0, :cond_d

    goto/16 :goto_4

    .line 205
    :sswitch_0
    sget v0, Ll/֫;->ܶܺ᩻:I

    if-gez v0, :cond_4

    goto :goto_1

    .line 266
    :sswitch_1
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v0

    if-gez v0, :cond_b

    goto/16 :goto_5

    .line 509
    :sswitch_2
    sget-boolean v0, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    return-void

    .line 520
    :sswitch_5
    invoke-virtual {v1}, Ll/ۛۗۨ;->۬ۙ()V

    .line 521
    invoke-static {v1}, Ll/ۛۗۨ;->᩵(Ll/ۛۗۨ;)V

    .line 522
    invoke-static {v1}, Ll/ۛۗۨ;->۬(Ll/ۛۗۨ;)Ll/ܿۗۨ;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    .line 519
    :sswitch_6
    invoke-static {v1, v2}, Ll/ۛۗۨ;->ۙ(Ll/ۛۗۨ;Ljava/lang/String;)V

    .line 226
    sget v0, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v0, :cond_1

    :cond_0
    :goto_1
    const-string v0, "\u06e1\u06da"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x164f

    const v19, -0x4ad5be26

    xor-int v5, v5, v19

    const v19, 0x6feb52b3

    goto/16 :goto_6

    :cond_1
    const-string v0, "\u0730\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x3b

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x2e0b

    const v19, 0x2681adf4

    xor-int v5, v5, v19

    const v19, -0x25dcd0ee

    goto/16 :goto_6

    :sswitch_7
    xor-int v0, v3, v4

    .line 518
    invoke-static {v1, v0}, Ll/ۖۛ;->᩵ۖ۠(Ljava/lang/Object;I)Landroid/view/View;

    const/4 v2, 0x0

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v0

    if-gtz v0, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v0, "\u1a77\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x7

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x2d31

    const v19, -0x16b1653a

    xor-int v5, v5, v19

    const v19, 0x38a9e05

    goto/16 :goto_6

    .line 517
    :sswitch_8
    invoke-static {v13, v14, v15, v12}, Ll/᩶;->ۙ᩷֨([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    const v4, 0x7edd6a01

    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v0, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v0, "\u06d6\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x3

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x49eb

    const v19, -0x527d695e

    xor-int v5, v5, v19

    const v19, 0x17ee88e8

    goto/16 :goto_6

    :sswitch_9
    const/4 v14, 0x1

    const/4 v15, 0x3

    .line 262
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const-string v0, "\u05ab\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x69

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x5f57

    const v19, -0x75540fba

    xor-int v5, v5, v19

    const v19, -0x3e86ac49

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u06e7\u06da"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x3c67

    const v19, 0x7ba74d4d

    xor-int v5, v5, v19

    const v19, 0x544f1503

    goto/16 :goto_6

    :sswitch_a
    const/4 v0, 0x0

    .line 517
    invoke-static {v1, v0}, Ll/ۛۗۨ;->ۖ(Ll/ۛۗۨ;Z)V

    sget-object v13, Ll/ۡۗۨ;->ᩴۚ֫:[S

    .line 215
    sget v0, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v0, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v0, "\u1a7b\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x4a8d

    const v19, -0x3db94728

    xor-int v5, v5, v19

    const v19, -0x1753d9

    goto/16 :goto_6

    .line 524
    :sswitch_b
    invoke-static {v1}, Ll/ۛۗۨ;->ۡ(Ll/ۛۗۨ;)V

    return-void

    .line 514
    :sswitch_c
    invoke-static {v1}, Ll/ۛۗۨ;->ۤ(Ll/ۛۗۨ;)V

    .line 515
    invoke-static {v1}, Ll/ۛۗۨ;->۬(Ll/ۛۗۨ;)Ll/ܿۗۨ;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    .line 516
    :sswitch_d
    invoke-static {v1}, Ll/ۛۗۨ;->᩸(Ll/ۛۗۨ;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "\u06df\u1a7a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x5

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x703

    const v19, -0x5c3b3e56

    xor-int v5, v5, v19

    const v19, -0x2791395b

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u06ec\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x15e7

    const v19, 0x70b72e9e

    xor-int v5, v5, v19

    const v19, 0x762707e

    goto/16 :goto_6

    :sswitch_e
    move-object/from16 v0, p0

    .line 513
    iget-object v1, v0, Ll/ۡۗۨ;->ۖ:Ll/ۛۗۨ;

    invoke-static {v1}, Ll/ۛۗۨ;->ᩴ(Ll/ۛۗۨ;)Z

    move-result v5

    if-eqz v5, :cond_8

    const-string v5, "\u06e0\u06d9"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int v5, v5, v16

    mul-int/lit8 v5, v5, 0x29

    xor-int v0, v5, v17

    mul-int/lit16 v0, v0, -0x5a49

    const v19, -0x797626c4

    xor-int v0, v0, v19

    const v19, -0x5840e03d

    xor-int v19, v5, v19

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u05a1\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x346d

    const v19, -0x4408e64b

    xor-int v5, v5, v19

    const v19, 0x3ca63ec4

    goto/16 :goto_6

    :sswitch_f
    const/16 v0, 0x5ad0

    const/16 v12, 0x5ad0

    goto :goto_2

    :sswitch_10
    const v0, 0xc55e

    const v12, 0xc55e

    :goto_2
    const-string v0, "\u06db\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x69

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x6541

    const v19, 0x59e9d67

    xor-int v5, v5, v19

    const v19, 0x19e3cc5

    goto/16 :goto_6

    :sswitch_11
    add-int v0, v7, v11

    mul-int v0, v0, v0

    sub-int/2addr v0, v10

    if-gtz v0, :cond_9

    const-string v0, "\u05a8\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x7e0d

    const v19, -0x40bf978e

    xor-int v5, v5, v19

    const v19, 0x65c5e8b5

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u073f\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x572f

    const v19, 0x7ee53459

    xor-int v5, v5, v19

    const v19, -0x585d1847

    goto/16 :goto_6

    :sswitch_12
    add-int v0, v8, v9

    add-int v10, v0, v0

    const/16 v11, 0x4bb7

    .line 389
    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_a

    goto/16 :goto_5

    :cond_a
    const-string v0, "\u06e8\u06df"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x2d

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0xc3

    const v19, 0x1852d5d

    xor-int v5, v5, v19

    const v19, 0x747a3f12

    goto/16 :goto_6

    :sswitch_13
    mul-int v8, v7, v7

    const v9, 0x1664bcd1

    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_c

    :cond_b
    :goto_3
    const-string v0, "\u06da\u1a74"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x3

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x2cf3

    const v19, -0x2bfbb8de

    xor-int v5, v5, v19

    const v19, 0x3b7ca96c

    goto/16 :goto_6

    :cond_c
    const-string v0, "\u06e7\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x2b

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x1869

    const v19, 0x4bc40601    # 2.5693186E7f

    xor-int v5, v5, v19

    const v19, 0x47e14887

    goto/16 :goto_6

    :goto_4
    const-string v0, "\u1a76\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x1f

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x1931

    const v19, 0x188169ff

    xor-int v5, v5, v19

    const v19, 0x4d06c511    # 1.4131637E8f

    goto :goto_6

    :cond_d
    const-string v0, "\u0736\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0xf4f

    const v19, 0x42ab51e5

    xor-int v5, v5, v19

    const v19, 0x693c39b3

    goto :goto_6

    :sswitch_14
    const/4 v6, 0x0

    .line 488
    sget v0, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v0, :cond_e

    goto :goto_5

    :cond_e
    const-string v0, "\u06eb\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x19

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x6a35

    const v19, -0x100dd233

    xor-int v5, v5, v19

    const v19, -0x3f94658

    goto :goto_6

    :sswitch_15
    sget-object v20, Ll/ۡۗۨ;->ᩴۚ֫:[S

    .line 24
    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_f

    :goto_5
    const-string v0, "\u06eb\u06e2"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x23

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x18f1

    const v19, 0x5951dce3

    xor-int v5, v5, v19

    const v19, -0x67026cd9

    goto :goto_6

    :cond_f
    const-string v0, "\u06eb\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x9db

    const v19, 0x5fda7344    # 3.1482E19f

    xor-int v5, v5, v19

    const v19, -0x1fad2080

    :goto_6
    xor-int v19, v0, v19

    move v0, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fc5ee32 -> :sswitch_e
        -0x791dbfb9 -> :sswitch_3
        -0x744d5a29 -> :sswitch_4
        -0x730e87db -> :sswitch_d
        -0x716e98f4 -> :sswitch_6
        -0x70251a57 -> :sswitch_9
        -0x6f9cfbc1 -> :sswitch_14
        -0x6bece158 -> :sswitch_2
        -0x68ae0ceb -> :sswitch_12
        -0x62501016 -> :sswitch_b
        -0x607a3a34 -> :sswitch_12
        -0x59943749 -> :sswitch_d
        -0x56c6c1d1 -> :sswitch_1
        -0x5690abfd -> :sswitch_f
        -0x540db421 -> :sswitch_2
        -0x4b6a0d74 -> :sswitch_e
        -0x3d85210c -> :sswitch_11
        -0x33469689 -> :sswitch_11
        -0x31d059b8 -> :sswitch_4
        -0x317d747d -> :sswitch_8
        -0x2f9dbe62 -> :sswitch_b
        -0x286cf949 -> :sswitch_f
        -0x28398f99 -> :sswitch_14
        -0x1f2406aa -> :sswitch_13
        -0xc0e6280 -> :sswitch_13
        -0xad93307 -> :sswitch_3
        -0xf7e35a -> :sswitch_10
        0x908ee79 -> :sswitch_15
        0xa7eda8c -> :sswitch_8
        0x12d531a8 -> :sswitch_6
        0x1768e956 -> :sswitch_a
        0x20ce32f4 -> :sswitch_c
        0x24af5aa1 -> :sswitch_0
        0x25cd801c -> :sswitch_a
        0x2e38a80d -> :sswitch_10
        0x387442bd -> :sswitch_7
        0x40fd9bbf -> :sswitch_1
        0x45e096b6 -> :sswitch_7
        0x5042493c -> :sswitch_c
        0x53d7902d -> :sswitch_0
        0x56309272 -> :sswitch_15
        0x6a7b37c8 -> :sswitch_9
        0x6fa0c8fc -> :sswitch_5
        0x773a7683 -> :sswitch_5
    .end sparse-switch
.end method

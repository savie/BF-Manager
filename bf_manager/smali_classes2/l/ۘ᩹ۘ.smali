.class public final synthetic Ll/ۘ᩹ۘ;
.super Ljava/lang/Object;
.source "O3YD"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ۫:Ll/ۖۜۘ;

.field public final synthetic ܺ:Ll/᩺᩹ۘ;

.field public final synthetic ܽ:Ll/ۙ۬ۘ;

.field public final synthetic ᩶:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ll/᩺᩹ۘ;Ljava/util/ArrayList;Ljava/lang/String;Ll/ۙ۬ۘ;Ll/ۖۜۘ;)V
    .locals 6

    const v0, -0x740cf0de

    sget v1, Ll/֫;->ܶܺ᩻:I

    sget v2, Ll/ۖۧ;->ܺۚۖ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06ec\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x39f3

    const v5, 0x5e21a525

    xor-int/2addr v4, v5

    const v5, -0x681cafba

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x66ad

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p4, p0, Ll/ۘ᩹ۘ;->ܽ:Ll/ۙ۬ۘ;

    iput-object p5, p0, Ll/ۘ᩹ۘ;->۫:Ll/ۖۜۘ;

    return-void

    :sswitch_0
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_9

    goto :goto_1

    .line 3
    :sswitch_1
    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    if-lez v3, :cond_5

    goto/16 :goto_3

    :sswitch_2
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v3, "\u06dc\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7c83

    const v5, -0x24fbe5fc

    xor-int/2addr v4, v5

    const v5, 0x4049bde7

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ۘ᩹ۘ;->֡:Ljava/lang/String;

    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u1a78\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x490b

    const v5, 0x48c81152

    xor-int/2addr v4, v5

    const v5, 0x1ffb2586

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a7a\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x52f3

    const v5, 0x27122e65

    xor-int/2addr v4, v5

    const v5, -0x2879d117

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06e0\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5411

    const v5, -0x3af3890a

    xor-int/2addr v4, v5

    const v5, -0x787c1de0

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v3

    if-gtz v3, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v3, "\u06eb\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3ba1

    const v5, 0x51d3bba8

    xor-int/2addr v4, v5

    const v5, 0x5e2947f2

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v3

    if-ltz v3, :cond_6

    :cond_5
    const-string v3, "\u1a76\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x17bb

    const v5, 0xabd0d5

    xor-int/2addr v4, v5

    const v5, -0x1326f4d0

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e0\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x67ad

    const v5, -0x56ab11ef

    xor-int/2addr v4, v5

    const v5, -0x4ec44e99

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u1a75\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5435

    const v5, -0x6b5973de

    xor-int/2addr v4, v5

    const v5, -0x7907c602

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v3, "\u0736\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5c3

    const v5, 0x127623e7

    xor-int/2addr v4, v5

    const v5, 0x5752fba3

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_2
    const-string v3, "\u073a\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x790f

    const v5, -0x327b3955

    xor-int/2addr v4, v5

    const v5, 0xeae232a

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073a\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5541

    const v5, -0x6e395c44

    xor-int/2addr v4, v5

    const v5, 0x469ed474

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_b

    :goto_3
    const-string v3, "\u05a1\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3197

    const v5, -0x3b3dbb77

    xor-int/2addr v4, v5

    const v5, 0x2e9d4196

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e1\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3d37

    const v5, -0x68a2e263

    xor-int/2addr v4, v5

    const v5, -0x4502ebc5

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۘ᩹ۘ;->ܺ:Ll/᩺᩹ۘ;

    iput-object p2, p0, Ll/ۘ᩹ۘ;->᩶:Ljava/util/List;

    .line 2
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v3

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u073f\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4c59

    const v5, -0x1e58c2e1

    xor-int/2addr v4, v5

    const v5, 0x2e8264a3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e1\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x64e9

    const v5, -0x29b221f1

    xor-int/2addr v4, v5

    const v5, 0x5f099710

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e19bd3f -> :sswitch_4
        -0x67715a23 -> :sswitch_3
        -0x6314c904 -> :sswitch_2
        -0x625bd654 -> :sswitch_8
        -0x5d40c8f4 -> :sswitch_d
        -0x539b80c2 -> :sswitch_a
        -0x3ef59472 -> :sswitch_8
        -0x3690b85d -> :sswitch_7
        -0x2f3cf15f -> :sswitch_0
        -0x2641b427 -> :sswitch_e
        -0x1547bcd3 -> :sswitch_1
        -0xafda8c2 -> :sswitch_b
        0x6013b9d -> :sswitch_3
        0x65e42c8 -> :sswitch_c
        0x1b315a04 -> :sswitch_6
        0x1f255137 -> :sswitch_2
        0x339390c1 -> :sswitch_5
        0x3926d240 -> :sswitch_6
        0x4da93fbe -> :sswitch_a
        0x4dc7e695 -> :sswitch_c
        0x4e59c8fe -> :sswitch_9
        0x5694a331 -> :sswitch_e
        0x5eacf221 -> :sswitch_4
        0x62ed875b -> :sswitch_9
        0x672a40ea -> :sswitch_7
        0x6a75b945 -> :sswitch_d
        0x6acfad21 -> :sswitch_1
        0x72dff62a -> :sswitch_0
        0x768b7156 -> :sswitch_5
        0x7a665d63 -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 15

    move-object v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x4a9e2dce    # 5183207.0f

    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    const-string v6, "\u1a7b\u06d9"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4eeb

    const v8, -0x4f294d0f

    xor-int/2addr v7, v8

    const v8, 0x161d0c82

    xor-int/2addr v6, v8

    move-object v11, v1

    move-object v12, v2

    :goto_0
    xor-int v1, v3, v5

    mul-int/lit16 v1, v1, 0x2d7f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v7

    xor-int v3, v6, v1

    sparse-switch v3, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    return-void

    .line 0
    :sswitch_0
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v1

    if-gtz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v1, "\u06d6\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v4

    xor-int v2, v1, v5

    mul-int/lit16 v2, v2, -0x134f

    const v6, -0x4cec742b

    xor-int v7, v2, v6

    const v2, 0x33b8ee5b

    goto/16 :goto_5

    .line 3
    :sswitch_1
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v1

    if-lez v1, :cond_b

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v1, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    goto/16 :goto_2

    .line 0
    :sswitch_4
    iget-object v8, v0, Ll/ۘ᩹ۘ;->ܺ:Ll/᩺᩹ۘ;

    iget-object v9, v0, Ll/ۘ᩹ۘ;->᩶:Ljava/util/List;

    iget-object v10, v0, Ll/ۘ᩹ۘ;->֡:Ljava/lang/String;

    move-object/from16 v13, p1

    move/from16 v14, p2

    invoke-static/range {v8 .. v14}, Ll/᩺᩹ۘ;->ۙ(Ll/᩺᩹ۘ;Ljava/util/List;Ljava/lang/String;Ll/ۙ۬ۘ;Ll/ۖۜۘ;Landroid/content/DialogInterface;I)V

    return-void

    :sswitch_5
    iget-object v11, v0, Ll/ۘ᩹ۘ;->ܽ:Ll/ۙ۬ۘ;

    iget-object v12, v0, Ll/ۘ᩹ۘ;->۫:Ll/ۖۜۘ;

    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "\u06d8\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v5

    mul-int/lit8 v1, v1, -0x75

    xor-int v2, v1, v4

    mul-int/lit16 v2, v2, 0x1d63

    const v6, -0x43ffde2e

    xor-int v7, v2, v6

    const v2, 0x273edd8c

    goto/16 :goto_5

    .line 3
    :sswitch_6
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v1, "\u1a74\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v4

    mul-int/lit8 v1, v1, 0x4d

    xor-int v2, v1, v5

    mul-int/lit16 v2, v2, 0x449b

    const v6, 0x35e06c95

    xor-int v7, v2, v6

    const v2, 0x44dcc668

    goto/16 :goto_5

    .line 0
    :sswitch_7
    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "\u06e4\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v5

    mul-int/lit8 v1, v1, -0x61

    xor-int v2, v1, v4

    mul-int/lit16 v2, v2, -0x2567

    const v6, 0x7d53bded

    xor-int v7, v2, v6

    const v2, -0x67777dfc

    goto/16 :goto_5

    :sswitch_8
    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v1, :cond_4

    :goto_1
    const-string v1, "\u06e4\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v4

    xor-int v2, v1, v5

    mul-int/lit16 v2, v2, -0x3501

    const v6, 0x1f91bfc3

    xor-int v7, v2, v6

    const v2, -0x161e32b4

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u06df\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v4

    xor-int v2, v1, v5

    mul-int/lit16 v2, v2, 0x7b0b

    const v6, -0x3b1c5595

    xor-int v7, v2, v6

    const v2, -0xe440f55

    goto/16 :goto_5

    .line 1
    :sswitch_9
    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v1, "\u06eb\u1a7a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v5

    mul-int/lit8 v1, v1, -0x27

    xor-int v2, v1, v4

    mul-int/lit16 v2, v2, -0x45db

    const v6, 0x39165df5

    xor-int v7, v2, v6

    const v2, -0x47e1b980

    goto/16 :goto_5

    .line 3
    :sswitch_a
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v1

    if-gtz v1, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "\u1a76\u1a75"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v4

    xor-int v2, v1, v5

    mul-int/lit16 v2, v2, 0x581b

    const v6, 0x3f3746c

    xor-int v7, v2, v6

    const v2, 0x4382e2a9

    goto/16 :goto_5

    .line 2
    :sswitch_b
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_2

    :cond_7
    const-string v1, "\u1a7a\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v4, v1

    mul-int/lit8 v1, v1, -0x75

    xor-int v2, v1, v5

    mul-int/lit16 v2, v2, 0x2d61

    const v6, 0x82276f8

    xor-int v7, v2, v6

    const v2, 0x7245587d

    goto/16 :goto_5

    :sswitch_c
    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v1, :cond_8

    :goto_2
    const-string v1, "\u1a78\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v5

    xor-int v2, v1, v4

    mul-int/lit16 v2, v2, 0x45fd

    const v6, -0x31e84dcc

    xor-int v7, v2, v6

    const v2, -0x7e8da6b8

    goto :goto_5

    :cond_8
    const-string v1, "\u073d\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v5

    xor-int v2, v1, v4

    mul-int/lit16 v2, v2, -0xa43

    const v6, -0x5f9b6a84

    xor-int v7, v2, v6

    const v2, -0x6d51f0bc

    goto :goto_5

    .line 1
    :sswitch_d
    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v1, :cond_a

    :cond_9
    :goto_3
    const-string v1, "\u06e1\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v4, v1

    mul-int/lit8 v1, v1, 0x5

    xor-int v2, v1, v5

    mul-int/lit16 v2, v2, -0xde5

    const v6, -0x1b730187

    xor-int v7, v2, v6

    const v2, -0x546acc9f

    goto :goto_5

    :cond_a
    const-string v1, "\u06d8\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v5

    xor-int v2, v1, v4

    mul-int/lit16 v2, v2, 0x5bd7

    const v6, 0x602d80e3    # 5.000897E19f

    xor-int v7, v2, v6

    const v2, -0xa68d9e8

    goto :goto_5

    .line 4
    :sswitch_e
    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v1, :cond_c

    :cond_b
    :goto_4
    const-string v1, "\u05a8\u1a7b"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v5

    xor-int v2, v1, v4

    mul-int/lit16 v2, v2, -0x4339

    const v6, 0x39eb406f

    xor-int v7, v2, v6

    const v2, -0x55da38a3

    goto :goto_5

    :cond_c
    const-string v1, "\u06e4\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v4, v1

    mul-int/lit8 v1, v1, 0x3d

    xor-int v2, v1, v5

    mul-int/lit16 v2, v2, -0x1a13

    const v6, 0x6646fdb4

    xor-int v7, v2, v6

    const v2, -0x4099704b

    :goto_5
    xor-int v6, v1, v2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x789c8cdc -> :sswitch_2
        -0x6b4696e0 -> :sswitch_0
        -0x5c18ca91 -> :sswitch_8
        -0x3f780e82 -> :sswitch_6
        -0x399f43c5 -> :sswitch_5
        -0x2e58c789 -> :sswitch_c
        -0x2d77898e -> :sswitch_8
        -0x2ce4d78c -> :sswitch_4
        -0x11dfa92f -> :sswitch_7
        -0xa9a0856 -> :sswitch_e
        -0x9859447 -> :sswitch_0
        -0x7927263 -> :sswitch_1
        -0x2cefe83 -> :sswitch_a
        0x863aa2a -> :sswitch_b
        0x9854d06 -> :sswitch_e
        0x18f24a3e -> :sswitch_4
        0x1d8d7a52 -> :sswitch_b
        0x2c234ea4 -> :sswitch_1
        0x2cec38ae -> :sswitch_5
        0x2f34bad2 -> :sswitch_9
        0x30e84cdd -> :sswitch_2
        0x31e386f6 -> :sswitch_a
        0x359025d5 -> :sswitch_3
        0x38b15052 -> :sswitch_d
        0x50987c79 -> :sswitch_7
        0x5c1ad62c -> :sswitch_9
        0x5d6089f1 -> :sswitch_3
        0x6f5abf49 -> :sswitch_c
        0x73ce4bd3 -> :sswitch_6
        0x7df5ae42 -> :sswitch_d
    .end sparse-switch
.end method

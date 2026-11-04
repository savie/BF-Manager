.class public final synthetic Ll/᩹ۡۤ;
.super Ljava/lang/Object;
.source "D17I"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/᩹ۖ᩸;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۡۤ;->ܰ:Ll/᩹ۖ᩸;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x89db40a

    sget v8, Ll/֨ܿ;->᩹᩻۟:I

    sget v9, Ll/֡ۖ;->۫ۙ᩶:I

    const-string v10, "\u06e1\u05a8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4605

    const v12, 0x2ebd6a65

    xor-int/2addr v11, v12

    const v12, -0x248e3aba

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, 0x6eef

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 483
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    goto/16 :goto_2

    .line 29
    :sswitch_0
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    sget-boolean v10, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v10, :cond_4

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget v10, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v10, :cond_c

    goto :goto_1

    .line 255
    :sswitch_2
    sget v10, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v10, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v10, "\u06e4\u06e0"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x69

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3bbf

    const v12, -0xa431342

    xor-int/2addr v11, v12

    const v12, 0x23a9ed55

    goto :goto_0

    .line 565
    :sswitch_3
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    return-void

    :sswitch_4
    add-int/2addr v6, v4

    .line 578
    invoke-static {v3, v6}, Ll/֨ۚ;->ۡ֨۫(Ljava/lang/Object;I)V

    return-void

    :sswitch_5
    invoke-static {v2}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v6

    .line 285
    sget v10, Ll/֫֡;->֫ۙۖ:I

    if-gtz v10, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v10, "\u0736\u0733"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x19f7

    const v12, -0x51d5c0b9

    xor-int/2addr v11, v12

    const v12, -0x1acf4a26

    goto :goto_0

    .line 577
    :sswitch_6
    invoke-static {v3}, Ll/֡ۖ;->ۜۤۘ(Ljava/lang/Object;)Ll/ᩳ۬᩸;

    move-result-object v10

    invoke-interface {v10, v4, v5, v2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    sget v10, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v10, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v10, "\u073f\u06d9"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x723d

    const v12, 0x5090ce62

    xor-int/2addr v11, v12

    const v12, -0x713544e8

    goto/16 :goto_0

    .line 570
    :sswitch_7
    invoke-static {v3}, Ll/ۗ֫;->۫ᩴ᩸(Ljava/lang/Object;)I

    move-result v4

    .line 571
    invoke-static {v3}, Ll/֫ܺ;->ܶۛۢ(Ljava/lang/Object;)I

    move-result v5

    if-le v4, v5, :cond_3

    move v13, v5

    move v5, v4

    move v4, v13

    :cond_3
    const-string v10, "\u0730\u06e7"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x3

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6823

    const v12, 0x4d61d817    # 2.368147E8f

    xor-int/2addr v11, v12

    const v12, 0x3f621a54

    goto/16 :goto_0

    .line 569
    :sswitch_8
    invoke-static {v1}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 570
    iget-object v3, p0, Ll/᩹ۡۤ;->ܰ:Ll/᩹ۖ᩸;

    .line 339
    sget v10, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v10, :cond_5

    :cond_4
    const-string v10, "\u0736\u06ec"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x37

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7b45

    const v12, -0x5042bf5c

    xor-int/2addr v11, v12

    const v12, 0x188de219

    goto/16 :goto_0

    :cond_5
    const-string v10, "\u1a7a\u1a7b"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x29

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1797

    const v12, 0x528d9a60

    xor-int/2addr v11, v12

    const v12, 0x73157517

    goto/16 :goto_0

    .line 569
    :sswitch_9
    invoke-static {v0}, Ll/֨ۨ;->ۧ᩸᩸(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 171
    sget v10, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v10, :cond_6

    const-string v10, "\u1a75\u1a76"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x4f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6f89

    const v12, 0x3f3d871b

    xor-int/2addr v11, v12

    const v12, -0x1fcf4e6f

    goto/16 :goto_0

    :cond_6
    const-string v10, "\u06d9\u05ab"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x6f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4ed3

    const v12, 0x2d5d25a4

    xor-int/2addr v11, v12

    const v12, 0x536c972f

    goto/16 :goto_0

    .line 569
    :sswitch_a
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    sget v10, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v10, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v10, "\u1a7a\u06e2"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4159

    const v12, 0x7b68cdd5

    xor-int/2addr v11, v12

    const v12, 0x77c99501

    goto/16 :goto_0

    .line 252
    :sswitch_b
    sget v10, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v10, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v10, "\u1a79\u06d8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x7b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5e4f

    const v12, -0x17bc7e8a

    xor-int/2addr v11, v12

    const v12, -0x47bd1b5

    goto/16 :goto_0

    .line 274
    :sswitch_c
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v10

    if-nez v10, :cond_9

    goto :goto_3

    :cond_9
    const-string v10, "\u06dc\u06dc"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x6b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5ef3

    const v12, 0x75e1bdc4

    xor-int/2addr v11, v12

    const v12, 0x4f8862b4

    goto/16 :goto_0

    :sswitch_d
    sget v10, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v10, :cond_a

    goto :goto_2

    :cond_a
    const-string v10, "\u1a77\u0730"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7f3b

    const v12, -0x2ff9ec3e

    xor-int/2addr v11, v12

    const v12, 0x67cdf98d

    goto/16 :goto_0

    .line 125
    :sswitch_e
    sget v10, Ll/᩺;->۫۬۫:I

    if-gtz v10, :cond_b

    :goto_2
    const-string v10, "\u06df\u06db"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2b6d

    const v12, 0x1fe852d8

    xor-int/2addr v11, v12

    const v12, 0x6aaa2f0

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u05a1\u06e2"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x50e1

    const v12, 0x78a1b1d6

    xor-int/2addr v11, v12

    const v12, -0x5b8f4475

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v10, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v10, :cond_d

    :cond_c
    :goto_3
    const-string v10, "\u06d8\u1a73"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x69

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3173

    const v12, -0x64b21470

    xor-int/2addr v11, v12

    const v12, -0x7f4e4481

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u06e7\u073f"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x2f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xee3

    const v12, -0x389f2cbd

    xor-int/2addr v11, v12

    const v12, 0x57ad54e9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6d127405 -> :sswitch_c
        -0x648439c9 -> :sswitch_b
        -0x5fcd59a9 -> :sswitch_3
        -0x3ea9e291 -> :sswitch_c
        -0x3916fa8e -> :sswitch_5
        -0x3520ef23 -> :sswitch_0
        -0x333db00d -> :sswitch_6
        -0x2ead8e2e -> :sswitch_9
        -0x278c2ed9 -> :sswitch_7
        -0x218ad785 -> :sswitch_1
        -0x211e93a3 -> :sswitch_7
        -0x20901de3 -> :sswitch_f
        -0x1ed15125 -> :sswitch_4
        -0x1e87cbf8 -> :sswitch_6
        -0x1e7e4570 -> :sswitch_9
        -0x2d27d06 -> :sswitch_a
        0x2e8d191 -> :sswitch_d
        0x8ee6658 -> :sswitch_b
        0x1a56ef18 -> :sswitch_f
        0x28528319 -> :sswitch_5
        0x2dd49df4 -> :sswitch_1
        0x31a654d0 -> :sswitch_2
        0x49cc15d6 -> :sswitch_4
        0x57403c7c -> :sswitch_2
        0x595adedc -> :sswitch_0
        0x60956df0 -> :sswitch_3
        0x6219b75d -> :sswitch_d
        0x6582d501 -> :sswitch_8
        0x69d5532d -> :sswitch_e
        0x758f2333 -> :sswitch_e
        0x7d571b26 -> :sswitch_a
        0x7d6c63aa -> :sswitch_8
    .end sparse-switch
.end method

.class public final synthetic Ll/᩵᩻ۨ;
.super Ljava/lang/Object;
.source "D17I"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܺ:Ll/ۧۧۖ;


# direct methods
.method public synthetic constructor <init>(Ll/ۧۧۖ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵᩻ۨ;->ܺ:Ll/ۧۧۖ;

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

    const v7, 0x657f24

    sget v8, Ll/֡֡;->᩶ۤ۠:I

    sget v9, Ll/ۧ;->֫۠ᩴ:I

    const-string v10, "\u06e1\u06e0"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4edf

    const v12, -0x7d421de

    xor-int/2addr v11, v12

    const v12, 0x373461b4

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, 0xc67

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 472
    sget v10, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v10, :cond_d

    goto/16 :goto_4

    .line 455
    :sswitch_0
    sget-boolean v10, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v10, :cond_6

    goto :goto_1

    .line 182
    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    sget v10, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v10, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v10, "\u1a7a\u1a77"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3cad

    const v12, 0x440c1a2c

    xor-int/2addr v11, v12

    const v12, 0x48e84513

    goto :goto_0

    .line 1
    :sswitch_2
    sget v10, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v10, :cond_c

    goto/16 :goto_2

    .line 361
    :sswitch_3
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    goto/16 :goto_2

    .line 109
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    return-void

    :sswitch_5
    add-int/2addr v6, v4

    .line 578
    invoke-virtual {v3, v6}, Ll/ۧۧۖ;->ᩴ(I)V

    return-void

    :sswitch_6
    invoke-static {v2}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v6

    .line 473
    sget v10, Ll/֫;->ܶܺ᩻:I

    if-ltz v10, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v10, "\u06d7\u05ab"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x72c5

    const v12, 0x57a641b8

    xor-int/2addr v11, v12

    const v12, -0x31ab2ed4    # -8.926195E8f

    goto :goto_0

    .line 577
    :sswitch_7
    invoke-static {v3}, Ll/ۘۛ;->ܶܶۜ(Ljava/lang/Object;)Ll/ۗ֫ۖ;

    move-result-object v10

    invoke-interface {v10, v4, v5, v2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 289
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v10

    if-gtz v10, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v10, "\u1a75\u1a7a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x21

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2119

    const v12, -0x2967d97e

    xor-int/2addr v11, v12

    const v12, -0x2cb1e12a

    goto/16 :goto_0

    .line 570
    :sswitch_8
    invoke-static {v3}, Ll/֫᩺;->᩶᩵ܳ(Ljava/lang/Object;)I

    move-result v4

    .line 571
    invoke-static {v3}, Ll/֫ۚ;->֫ۛۙ(Ljava/lang/Object;)I

    move-result v5

    if-le v4, v5, :cond_3

    move v13, v5

    move v5, v4

    move v4, v13

    :cond_3
    const-string v10, "\u1a7b\u0736"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x7f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6957

    const v12, 0x7690dc19

    xor-int/2addr v11, v12

    const v12, -0xff3b3ec

    goto/16 :goto_0

    .line 569
    :sswitch_9
    invoke-static {v1}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 570
    iget-object v3, p0, Ll/᩵᩻ۨ;->ܺ:Ll/ۧۧۖ;

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v10

    if-eqz v10, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v10, "\u06e7\u06d6"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x45

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xa0d

    const v12, -0x48502635

    xor-int/2addr v11, v12

    const v12, -0x4b607996

    goto/16 :goto_0

    .line 569
    :sswitch_a
    invoke-static {v0}, Ll/֫ۛ;->ܿ᩷ۧ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    sget v10, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v10, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v10, "\u06e8\u06e0"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x3acf

    const v12, -0x4d850043

    xor-int/2addr v11, v12

    const v12, 0x47483465

    goto/16 :goto_0

    :sswitch_b
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    .line 207
    sget v10, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v10, :cond_7

    :cond_6
    const-string v10, "\u1a75\u06dc"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4b11

    const v12, -0x4182d621

    xor-int/2addr v11, v12

    const v12, -0x65d3498c

    goto/16 :goto_0

    :cond_7
    const-string v10, "\u06d8\u06db"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x18e7

    const v12, -0x288aa411

    xor-int/2addr v11, v12

    const v12, 0x9492f94

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_3

    :cond_8
    const-string v10, "\u06d9\u1a77"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1f2d

    const v12, -0x605af231

    xor-int/2addr v11, v12

    const v12, -0x55b9505b

    goto/16 :goto_0

    .line 22
    :sswitch_d
    sget-boolean v10, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v10, :cond_9

    :goto_2
    const-string v10, "\u06e1\u06eb"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3877

    const v12, 0x445f3f33

    xor-int/2addr v11, v12

    const v12, -0x354324d5    # -6188437.5f

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u0730\u06eb"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x13

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x70d9

    const v12, -0x7afa5f2

    xor-int/2addr v11, v12

    const v12, -0x35db78ad

    goto/16 :goto_0

    .line 527
    :sswitch_e
    sget-boolean v10, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v10, :cond_a

    goto :goto_3

    :cond_a
    const-string v10, "\u06e2\u06d7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x33a9

    const v12, -0x105d84cb

    xor-int/2addr v11, v12

    const v12, 0x55eda8dc

    goto/16 :goto_0

    :sswitch_f
    sget v10, Ll/ۗ;->֨۬ۖ:I

    if-ltz v10, :cond_b

    :goto_3
    const-string v10, "\u06e1\u05a8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x11

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2201

    const v12, -0x77e5ae37

    xor-int/2addr v11, v12

    const v12, 0x73d22b6f

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u1a78\u06e2"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x70d7

    const v12, 0x79e75f76

    xor-int/2addr v11, v12

    const v12, 0x4e5ff137    # 9.3928186E8f

    goto/16 :goto_0

    :cond_c
    :goto_4
    const-string v10, "\u06ec\u0736"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x2b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x18eb

    const v12, 0x76e96a5d

    xor-int/2addr v11, v12

    const v12, -0x86947b1

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u073f\u06dc"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x6b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x5f63

    const v12, 0x5e111814

    xor-int/2addr v11, v12

    const v12, -0x1e474ae4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e65e461 -> :sswitch_4
        -0x7969611e -> :sswitch_4
        -0x5b4f1def -> :sswitch_3
        -0x54ba3e50 -> :sswitch_2
        -0x431cc1f8 -> :sswitch_a
        -0x3ab16516 -> :sswitch_7
        -0x34669e9a -> :sswitch_8
        -0x33878f4a -> :sswitch_c
        -0x2ebcd2fc -> :sswitch_d
        -0x29faeb70 -> :sswitch_1
        -0x1e39847f -> :sswitch_f
        -0x1dd8e1bc -> :sswitch_3
        -0x18cf1132 -> :sswitch_1
        -0x189692dd -> :sswitch_c
        -0x17124d3f -> :sswitch_b
        -0x43f4145 -> :sswitch_0
        0x27653be -> :sswitch_e
        0x4c193cd -> :sswitch_2
        0xb62717e -> :sswitch_9
        0x1542bd70 -> :sswitch_b
        0x165cebff -> :sswitch_6
        0x19c7ed0a -> :sswitch_d
        0x236bed53 -> :sswitch_0
        0x2bc0d89f -> :sswitch_5
        0x36cef4e4 -> :sswitch_f
        0x37f3f534 -> :sswitch_8
        0x45636d74 -> :sswitch_a
        0x6f0c8306 -> :sswitch_e
        0x7150f4f3 -> :sswitch_5
        0x735fb3c6 -> :sswitch_6
        0x7691d350 -> :sswitch_7
        0x7e2c20b3 -> :sswitch_9
    .end sparse-switch
.end method

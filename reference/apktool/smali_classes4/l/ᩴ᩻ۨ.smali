.class public final synthetic Ll/ᩴ᩻ۨ;
.super Ljava/lang/Object;
.source "D17I"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ܺ:Ll/֡᩻ۨ;

.field public final synthetic ܽ:Landroid/widget/CheckBox;

.field public final synthetic ᩶:Ll/᩵ۡۜ;


# direct methods
.method public synthetic constructor <init>(Ll/֡᩻ۨ;Ll/᩵ۡۜ;Ljava/lang/String;Landroid/widget/CheckBox;)V
    .locals 6

    const v0, 0x3305fbb1

    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    sget v2, Ll/֫ܳ;->᩶ۧۛ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a78\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x36bf

    const v5, -0x38bdb486

    xor-int/2addr v4, v5

    const v5, 0x62a3179a

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x4999

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    goto/16 :goto_5

    .line 2
    :sswitch_0
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v3

    if-gtz v3, :cond_8

    goto/16 :goto_1

    .line 1
    :sswitch_1
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v3

    if-nez v3, :cond_a

    goto/16 :goto_5

    :sswitch_2
    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-lez v3, :cond_4

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p3, p0, Ll/ᩴ᩻ۨ;->֡:Ljava/lang/String;

    iput-object p4, p0, Ll/ᩴ᩻ۨ;->ܽ:Landroid/widget/CheckBox;

    return-void

    :sswitch_5
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u0733\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3d09

    const v5, -0x6329f896

    xor-int/2addr v4, v5

    const v5, -0x7c1dd6c8

    goto :goto_0

    .line 4
    :sswitch_6
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v3

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06e0\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5e89

    const v5, 0x67e3c22

    xor-int/2addr v4, v5

    const v5, -0x20200405

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v3

    if-ltz v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u06eb\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3813

    const v5, -0xc070ead

    xor-int/2addr v4, v5

    const v5, 0x1d6413eb

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v3

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06e1\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x173b

    const v5, 0x137c8085

    xor-int/2addr v4, v5

    const v5, 0x3df1278b

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u06e8\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5255

    const v5, 0x49d86847

    xor-int/2addr v4, v5

    const v5, 0x52e14998

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a77\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4f63

    const v5, 0x928c7e7

    xor-int/2addr v4, v5

    const v5, -0x75bc8643

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_6

    :goto_2
    const-string v3, "\u06d6\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x47d5

    const v5, -0x4cec4e92

    xor-int/2addr v4, v5

    const v5, 0x7ed45bb5

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e4\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6aa7

    const v5, -0x498fb826

    xor-int/2addr v4, v5

    const v5, -0xa571f29

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v3, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v3, "\u06e2\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x59c1

    const v5, -0x2f25cef3

    xor-int/2addr v4, v5

    const v5, -0x377d4f41

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v3

    if-ltz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06d7\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7019

    const v5, -0x702d48f

    xor-int/2addr v4, v5

    const v5, 0x56898018

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06df\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7a1

    const v5, 0x53d6f8a3

    xor-int/2addr v4, v5

    const v5, -0x57213c5

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u06d7\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x40b

    const v5, -0x2ac3b49c

    xor-int/2addr v4, v5

    const v5, -0x2f6415c4

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a77\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x364d

    const v5, 0x7b7960c9

    xor-int/2addr v4, v5

    const v5, -0x42403518

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ᩴ᩻ۨ;->ܺ:Ll/֡᩻ۨ;

    iput-object p2, p0, Ll/ᩴ᩻ۨ;->᩶:Ll/᩵ۡۜ;

    .line 1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v3

    if-eqz v3, :cond_c

    :goto_5
    const-string v3, "\u1a78\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x164b

    const v5, -0xa8b0316

    xor-int/2addr v4, v5

    const v5, 0x66fc290f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073f\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5111

    const v5, 0x4a196cd2    # 2513716.5f

    xor-int/2addr v4, v5

    const v5, -0x1083d079

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x766ec0bd -> :sswitch_e
        -0x7607b72e -> :sswitch_7
        -0x6ea14f9c -> :sswitch_e
        -0x6b4252a4 -> :sswitch_b
        -0x6a920d3a -> :sswitch_6
        -0x66d06dd8 -> :sswitch_8
        -0x6408ef99 -> :sswitch_8
        -0x61c20744 -> :sswitch_0
        -0x4247b6a1 -> :sswitch_1
        -0x3c0b1ff0 -> :sswitch_2
        -0x327bd650 -> :sswitch_9
        -0x293f246b -> :sswitch_7
        -0x291cafe5 -> :sswitch_1
        -0x24bc3a84 -> :sswitch_5
        -0x241243c2 -> :sswitch_a
        -0x141bcb79 -> :sswitch_4
        -0x4634442 -> :sswitch_4
        -0x3ece6ff -> :sswitch_d
        -0x1f698f8 -> :sswitch_d
        0x303bee7 -> :sswitch_a
        0x35c6c6b -> :sswitch_3
        0x30f3deb9 -> :sswitch_5
        0x317c782c -> :sswitch_3
        0x32b9b7ff -> :sswitch_2
        0x420a13a1 -> :sswitch_c
        0x4b2f0315 -> :sswitch_6
        0x561bd967 -> :sswitch_b
        0x568d97a7 -> :sswitch_c
        0x6dbb51b7 -> :sswitch_0
        0x7a97593f -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    const/4 p1, 0x0

    const/4 v0, 0x0

    const v1, 0x79a0befd

    sget v2, Ll/֫ܽ;->֡ᩴܶ:I

    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    const-string v4, "\u06e1\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7271

    const v6, -0x3c02419a

    xor-int/2addr v5, v6

    const v6, 0x30f2376c

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x7b65

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-gez v4, :cond_6

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v4

    if-eqz v4, :cond_9

    goto/16 :goto_5

    .line 1
    :sswitch_1
    sget-boolean v4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-eqz v4, :cond_b

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    return-void

    .line 0
    :sswitch_4
    iget-object v1, p0, Ll/ᩴ᩻ۨ;->ܺ:Ll/֡᩻ۨ;

    iget-object v2, p0, Ll/ᩴ᩻ۨ;->᩶:Ll/᩵ۡۜ;

    invoke-static {v1, v2, p1, v0}, Ll/֡᩻ۨ;->ۙ(Ll/֡᩻ۨ;Ll/᩵ۡۜ;Ljava/lang/String;Landroid/widget/CheckBox;)V

    return-void

    :sswitch_5
    iget-object v0, p0, Ll/ᩴ᩻ۨ;->ܽ:Landroid/widget/CheckBox;

    .line 1
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u1a76\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x34e3

    const v6, 0x43ac0ce2

    xor-int/2addr v5, v6

    const v6, -0x65f1e3a2

    goto :goto_0

    .line 0
    :sswitch_6
    iget-object p1, p0, Ll/ᩴ᩻ۨ;->֡:Ljava/lang/String;

    .line 1
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u1a76\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xb3

    const v6, 0x41f2f663

    xor-int/2addr v5, v6

    const v6, -0x9f080f7

    goto :goto_0

    .line 2
    :sswitch_7
    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_2

    :goto_1
    const-string v4, "\u1a76\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5123

    const v6, 0x6b655f0

    xor-int/2addr v5, v6

    const v6, -0x6eb86414

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u073a\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x35b

    const v6, -0x3131bb93

    xor-int/2addr v5, v6

    const v6, 0x1a9dbe55

    goto/16 :goto_0

    .line 1
    :sswitch_8
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06d8\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x4b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1033

    const v6, -0x3b03b3c9

    xor-int/2addr v5, v6

    const v6, -0x4ec4424f

    goto/16 :goto_0

    .line 3
    :sswitch_9
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v4

    if-ltz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u05a8\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4545

    const v6, 0x48e3394b

    xor-int/2addr v5, v6

    const v6, 0x268d6973

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v4, "\u05ab\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ccd

    const v6, 0x1d3b8772

    xor-int/2addr v5, v6

    const v6, 0x1b2f4fc8

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v4

    if-nez v4, :cond_7

    :cond_6
    :goto_2
    const-string v4, "\u05ab\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x61b9

    const v6, 0x38266ef3

    xor-int/2addr v5, v6

    const v6, 0x5f50a15a

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a77\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2c6f

    const v6, 0x29b794bc

    xor-int/2addr v5, v6

    const v6, 0x103431c9

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v4, :cond_8

    :goto_3
    const-string v4, "\u06d6\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6ba5

    const v6, -0x5e9d40ed

    xor-int/2addr v5, v6

    const v6, 0x20bf43f5

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a77\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5ed7

    const v6, -0x6239859e

    xor-int/2addr v5, v6

    const v6, 0x1f3a2c8c

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u06d7\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x22bd

    const v6, -0xdfb7d98

    xor-int/2addr v5, v6

    const v6, 0x791442bf

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u05a1\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1131

    const v6, -0x57ce0909

    xor-int/2addr v5, v6

    const v6, -0x133ca87c

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u06da\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x59

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3b59

    const v6, -0x46e8de2e

    xor-int/2addr v5, v6

    const v6, 0x72490966

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a74\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x404b

    const v6, -0xb5494fe

    xor-int/2addr v5, v6

    const v6, -0xe4f9bfc

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x764e3f78 -> :sswitch_e
        -0x730fc1c5 -> :sswitch_b
        -0x64751cc3 -> :sswitch_8
        -0x58f6ed5f -> :sswitch_d
        -0x4b5affb1 -> :sswitch_b
        -0x465cbcdf -> :sswitch_6
        -0x34f2d3f8 -> :sswitch_1
        -0x3265ec14 -> :sswitch_d
        -0x30ab3302 -> :sswitch_5
        -0x27bef528 -> :sswitch_7
        -0x25c0a235 -> :sswitch_0
        -0x2358685b -> :sswitch_4
        -0x20a5de97 -> :sswitch_e
        -0x20024753 -> :sswitch_a
        -0x1cf3f5f0 -> :sswitch_9
        -0x141c8c1e -> :sswitch_3
        -0xf6c0f77 -> :sswitch_9
        -0xaae8c18 -> :sswitch_0
        -0x474801a -> :sswitch_a
        0x1db03156 -> :sswitch_5
        0x32d78d02 -> :sswitch_8
        0x35f03018 -> :sswitch_2
        0x3a93acaf -> :sswitch_6
        0x41343f8d -> :sswitch_7
        0x4d80ea1c -> :sswitch_2
        0x6430a87a -> :sswitch_c
        0x67a7cc03 -> :sswitch_1
        0x6d3cac45 -> :sswitch_4
        0x7993e850 -> :sswitch_c
        0x7af8a03c -> :sswitch_3
    .end sparse-switch
.end method

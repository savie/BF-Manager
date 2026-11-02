.class public final synthetic Ll/᩺ۡ᩺;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/ۜ۟᩺;


# instance fields
.field public final synthetic ֡:Landroid/widget/EditText;

.field public final synthetic ܺ:Ll/ܿܿۚ;

.field public final synthetic ܽ:Ll/᩻ۡ᩺;

.field public final synthetic ᩶:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Ll/ܿܿۚ;Landroid/view/View;Landroid/widget/EditText;Ll/᩻ۡ᩺;)V
    .locals 6

    const v0, -0x37430961

    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    sget v2, Ll/֡۠;->ۛ᩻ۧ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06eb\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x191

    const v5, 0x5977e910

    xor-int/2addr v4, v5

    const v5, -0x3ba4c57b

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x34ff

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 3
    :sswitch_0
    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u1a75\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xd21

    const v5, 0xeadb85c

    xor-int/2addr v4, v5

    const v5, -0xf537e5b

    goto :goto_0

    .line 2
    :sswitch_1
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_9

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    goto/16 :goto_2

    .line 0
    :sswitch_4
    iput-object p3, p0, Ll/᩺ۡ᩺;->֡:Landroid/widget/EditText;

    iput-object p4, p0, Ll/᩺ۡ᩺;->ܽ:Ll/᩻ۡ᩺;

    return-void

    .line 3
    :sswitch_5
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u1a7a\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5311

    const v5, 0x3a90517e

    xor-int/2addr v4, v5

    const v5, 0x3a7a4edb

    goto :goto_0

    .line 1
    :sswitch_6
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u073d\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xdd3

    const v5, -0x403e74d4

    xor-int/2addr v4, v5

    const v5, -0x5d1327ee

    goto/16 :goto_0

    :sswitch_7
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06db\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, 0x6f

    const v5, -0x35cc9dfb

    xor-int/2addr v4, v5

    const v5, -0x393e9a1c

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u073f\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x748f

    const v5, 0x21928610

    xor-int/2addr v4, v5

    const v5, -0x609f2598

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u073f\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3f57

    const v5, 0x66694420

    xor-int/2addr v4, v5

    const v5, -0x5b6df090

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u05ab\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x350b

    const v5, 0x556d7381

    xor-int/2addr v4, v5

    const v5, -0x6787b04e

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v3

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u1a79\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2519

    const v5, -0x3c4d3c1

    xor-int/2addr v4, v5

    const v5, -0x62675c46

    goto/16 :goto_0

    .line 2
    :sswitch_b
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v3

    if-gtz v3, :cond_8

    :goto_2
    const-string v3, "\u06e1\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x27bd

    const v5, 0x515234d4

    xor-int/2addr v4, v5

    const v5, 0xfb183c4

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e4\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x719f

    const v5, 0x594d5d8d

    xor-int/2addr v4, v5

    const v5, -0x59f37b16

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v3, :cond_a

    :cond_9
    const-string v3, "\u06e7\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x11dd

    const v5, 0x574c7501    # 2.248029E14f

    xor-int/2addr v4, v5

    const v5, -0x2fb050df

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a75\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xedd

    const v5, -0x5b933318

    xor-int/2addr v4, v5

    const v5, 0x56e17e4a

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_b

    goto :goto_3

    :cond_b
    const-string v3, "\u1a78\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4653

    const v5, -0x7b275364

    xor-int/2addr v4, v5

    const v5, -0x6f1f7d3e

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩺ۡ᩺;->ܺ:Ll/ܿܿۚ;

    iput-object p2, p0, Ll/᩺ۡ᩺;->᩶:Landroid/view/View;

    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_c

    :goto_3
    const-string v3, "\u05a8\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x63fb

    const v5, -0xffa44e

    xor-int/2addr v4, v5

    const v5, -0x50b85817

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a79\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x70ed

    const v5, 0x2f5dfa15

    xor-int/2addr v4, v5

    const v5, -0x699610d4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ed4c98c -> :sswitch_c
        -0x7cf325c2 -> :sswitch_b
        -0x7af005d9 -> :sswitch_8
        -0x7a3aac4f -> :sswitch_b
        -0x75ca052e -> :sswitch_9
        -0x5ea625a0 -> :sswitch_4
        -0x53ba708f -> :sswitch_a
        -0x4ece93cd -> :sswitch_d
        -0x487466fd -> :sswitch_e
        -0x461a146c -> :sswitch_3
        -0x43d19520 -> :sswitch_0
        -0x3f00d428 -> :sswitch_6
        -0x26d336f1 -> :sswitch_e
        -0x21fb3c58 -> :sswitch_6
        -0x11a89b40 -> :sswitch_7
        -0xe9d9520 -> :sswitch_5
        -0xa2d07bd -> :sswitch_2
        -0x90e8f4a -> :sswitch_3
        0x5a198d8 -> :sswitch_2
        0x17a7df64 -> :sswitch_9
        0x186379b1 -> :sswitch_7
        0x2f0cb696 -> :sswitch_a
        0x3c680642 -> :sswitch_5
        0x3cec1d7a -> :sswitch_4
        0x417edbd5 -> :sswitch_c
        0x4dfea487 -> :sswitch_1
        0x55b52eaf -> :sswitch_1
        0x70d280b9 -> :sswitch_8
        0x7deae8d3 -> :sswitch_d
        0x7ed92174 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ(Ll/֨ᩴ᩺;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x1cf1db6b

    sget v3, Ll/֨ۧ;->֫۠֡:I

    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    const-string v5, "\u06e1\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0xf

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7cfd

    const v7, 0xd46ddec

    xor-int/2addr v6, v7

    const v7, -0x820e498

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x27fd

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget-boolean v5, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v5, :cond_c

    goto/16 :goto_4

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v5

    if-eqz v5, :cond_9

    goto/16 :goto_3

    .line 4
    :sswitch_1
    sget v5, Ll/֨᩺;->۬᩺ܰ:I

    if-gez v5, :cond_4

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v5, :cond_7

    goto/16 :goto_3

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v2, p0, Ll/᩺ۡ᩺;->ܺ:Ll/ܿܿۚ;

    iget-object v3, p0, Ll/᩺ۡ᩺;->᩶:Landroid/view/View;

    invoke-static {v2, v3, v0, v1, p1}, Ll/᩻ۡ᩺;->ܰ(Ll/ܿܿۚ;Landroid/view/View;Landroid/widget/EditText;Ll/᩻ۡ᩺;Ll/֨ᩴ᩺;)V

    return-void

    :sswitch_6
    iget-object v1, p0, Ll/᩺ۡ᩺;->ܽ:Ll/᩻ۡ᩺;

    .line 4
    sget v5, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v5, "\u073d\u073d"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7881

    const v7, 0x592488dd

    xor-int/2addr v6, v7

    const v7, -0xc3cdacc

    goto :goto_0

    .line 0
    :sswitch_7
    iget-object v0, p0, Ll/᩺ۡ᩺;->֡:Landroid/widget/EditText;

    .line 4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v5

    if-nez v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u0736\u06e1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xed

    const v7, -0x1c5b06c2

    xor-int/2addr v6, v7

    const v7, 0x38f4a4cc

    goto :goto_0

    .line 1
    :sswitch_8
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v5

    if-eqz v5, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v5, "\u06e8\u06e7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3d35

    const v7, 0x35210c63    # 5.99952E-7f

    xor-int/2addr v6, v7

    const v7, 0x1b7c8d50

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v5, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v5, :cond_3

    goto :goto_1

    :cond_3
    const-string v5, "\u06d9\u1a75"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3597

    const v7, 0x12b40f2f

    xor-int/2addr v6, v7

    const v7, 0x35c35476

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v5

    if-ltz v5, :cond_5

    :cond_4
    :goto_1
    const-string v5, "\u1a78\u06d9"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x785f

    const v7, 0x9aeae97

    xor-int/2addr v6, v7

    const v7, 0x6dc22906

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06e8\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x9

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x38d5

    const v7, 0x335b6d91

    xor-int/2addr v6, v7

    const v7, 0x525aa5b9

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u1a79\u0733"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2e41

    const v7, 0x51ebb166

    xor-int/2addr v6, v7

    const v7, 0x40e83421

    goto/16 :goto_0

    .line 3
    :sswitch_c
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v5

    if-ltz v5, :cond_8

    :cond_7
    :goto_2
    const-string v5, "\u0730\u073f"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x107b

    const v7, -0x3274797a

    xor-int/2addr v6, v7

    const v7, -0x3e20fa78

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06e4\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x54a3

    const v7, 0x4cdeaa37    # 1.16740536E8f

    xor-int/2addr v6, v7

    const v7, -0x7f91626b

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v5, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v5, :cond_a

    :cond_9
    const-string v5, "\u06eb\u06dc"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2a63

    const v7, 0x16a582af

    xor-int/2addr v6, v7

    const v7, -0x4593c1f5

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06d7\u06eb"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x597f

    const v7, -0x6384be11

    xor-int/2addr v6, v7

    const v7, 0x502167d9

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v5, :cond_b

    :goto_3
    const-string v5, "\u1a7a\u06e0"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x7d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1d45

    const v7, 0x1c4db786

    xor-int/2addr v6, v7

    const v7, -0x5836e7fd

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u05a8\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2dab

    const v7, 0x6f6eece3

    xor-int/2addr v6, v7

    const v7, -0x18fe5b36

    goto/16 :goto_0

    :goto_4
    const-string v5, "\u06d7\u06d6"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x45

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x8a3

    const v7, 0x2e4d025c

    xor-int/2addr v6, v7

    const v7, -0xcd32eb7

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06dc\u05a1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x61

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1dc1

    const v7, 0x4875742c

    xor-int/2addr v6, v7

    const v7, 0x54e65ee0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x794f17cf -> :sswitch_4
        -0x714a4b7a -> :sswitch_a
        -0x5b9c3517 -> :sswitch_3
        -0x543f2362 -> :sswitch_5
        -0x3e06f39b -> :sswitch_9
        -0x32089aaf -> :sswitch_1
        -0x319f92e5 -> :sswitch_b
        -0x2dacafca -> :sswitch_0
        -0x208e2289 -> :sswitch_b
        -0x206b4be9 -> :sswitch_9
        -0x1d74cd5a -> :sswitch_d
        -0x106fc017 -> :sswitch_a
        -0x2b3c128 -> :sswitch_c
        0x6a620b0 -> :sswitch_e
        0x87d3b09 -> :sswitch_2
        0x1ed8a71a -> :sswitch_2
        0x268b7d7b -> :sswitch_d
        0x27ba3b26 -> :sswitch_c
        0x3da27a84 -> :sswitch_4
        0x449ea981 -> :sswitch_3
        0x4f6fc4ac -> :sswitch_6
        0x507f93a4 -> :sswitch_8
        0x5950aa1a -> :sswitch_1
        0x62959c64 -> :sswitch_6
        0x67210676 -> :sswitch_0
        0x68fda08a -> :sswitch_8
        0x6ce7d7a4 -> :sswitch_7
        0x71707b25 -> :sswitch_7
        0x7a3360de -> :sswitch_e
        0x7ab0639c -> :sswitch_5
    .end sparse-switch
.end method

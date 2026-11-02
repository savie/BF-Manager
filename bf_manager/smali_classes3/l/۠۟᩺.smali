.class public final Ll/۠۟᩺;
.super Ljava/lang/Object;
.source "KA2Z"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ܺ:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/۠۟᩺;->ܺ:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    const/4 p1, 0x0

    const v0, 0x1adfa6cd

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    sget v2, Ll/ۖۗ;->᩶۫ۗ:I

    const-string v3, "\u073d\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5ad5

    const v5, 0x29b98a72

    xor-int/2addr v4, v5

    const v5, 0x3ae7ffae    # 0.00177001f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x5fe1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 50
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v3

    if-gtz v3, :cond_d

    goto/16 :goto_6

    .line 40
    :sswitch_0
    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v3, :cond_b

    goto/16 :goto_4

    .line 36
    :sswitch_1
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v3, :cond_8

    goto/16 :goto_3

    .line 61
    :sswitch_2
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-nez v3, :cond_4

    goto :goto_2

    .line 88
    :sswitch_3
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    return-void

    :sswitch_5
    const/4 v3, 0x0

    .line 99
    invoke-virtual {p1, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    goto :goto_1

    :sswitch_6
    return-void

    .line 98
    :sswitch_7
    iget-object p1, p0, Ll/۠۟᩺;->ܺ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->isErrorEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\u06e4\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x307b

    const v5, -0x19a4b680

    xor-int/2addr v4, v5

    const v5, -0x407f3e24

    goto :goto_0

    :cond_0
    :goto_1
    const-string v3, "\u06ec\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6ad9

    const v5, -0x826724a

    xor-int/2addr v4, v5

    const v5, -0x66f90b4

    goto :goto_0

    :sswitch_8
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v3, "\u06e7\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x73ab

    const v5, -0x3802c5d6

    xor-int/2addr v4, v5

    const v5, -0x6e9d9cbb

    goto/16 :goto_0

    .line 71
    :sswitch_9
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_2

    :goto_2
    const-string v3, "\u06e1\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5d1

    const v5, -0x1b834317

    xor-int/2addr v4, v5

    const v5, 0x436de642

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u1a75\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xc67

    const v5, -0x6e44bed2

    xor-int/2addr v4, v5

    const v5, -0x27e7f6c6

    goto/16 :goto_0

    .line 69
    :sswitch_a
    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_3

    goto :goto_3

    :cond_3
    const-string v3, "\u05ab\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x37f

    const v5, -0x5ec13322

    xor-int/2addr v4, v5

    const v5, -0x41c01f55

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v3

    if-gtz v3, :cond_5

    :cond_4
    :goto_3
    const-string v3, "\u073a\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5aeb

    const v5, -0x7f482658

    xor-int/2addr v4, v5

    const v5, 0x25f611f0

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a74\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1f7b

    const v5, 0x2e221c63

    xor-int/2addr v4, v5

    const v5, -0x756c9fae

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v3, "\u0736\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x32af

    const v5, 0x5a8df217

    xor-int/2addr v4, v5

    const v5, 0x68016577

    goto/16 :goto_0

    .line 33
    :sswitch_d
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v3, "\u06d8\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x302b

    const v5, 0x5ea1fd9d

    xor-int/2addr v4, v5

    const v5, -0x4e1ee665

    goto/16 :goto_0

    .line 17
    :sswitch_e
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_4
    const-string v3, "\u06d7\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x100d

    const v5, 0xe6b35d9

    xor-int/2addr v4, v5

    const v5, -0x6877bbca

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a74\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7633

    const v5, -0x18e18e61

    xor-int/2addr v4, v5

    const v5, 0x26eda350

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v3

    if-gtz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u06e7\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6241

    const v5, -0x5ff7ba73

    xor-int/2addr v4, v5

    const v5, -0x532d3c69

    goto/16 :goto_0

    .line 34
    :sswitch_10
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u1a79\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x261b

    const v5, -0x528a2c43

    xor-int/2addr v4, v5

    const v5, 0x4bba5852    # 2.4424612E7f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e4\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7541

    const v5, 0x18e20677

    xor-int/2addr v4, v5

    const v5, -0x59bb3b22

    goto/16 :goto_0

    :goto_6
    const-string v3, "\u06ec\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5d37

    const v5, 0x381d26f6

    xor-int/2addr v4, v5

    const v5, 0x2d3fa63d

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06db\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3a5d

    const v5, 0x57215736

    xor-int/2addr v4, v5

    const v5, -0x1850c53f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cf194f6 -> :sswitch_4
        -0x69eb82c0 -> :sswitch_d
        -0x67e37625 -> :sswitch_10
        -0x648e0f3c -> :sswitch_0
        -0x5faf337f -> :sswitch_1
        -0x5d5fa3a5 -> :sswitch_3
        -0x5d4033ce -> :sswitch_f
        -0x5889566e -> :sswitch_9
        -0x579d2d83 -> :sswitch_b
        -0x3fccbfb2 -> :sswitch_5
        -0x3500e1c4 -> :sswitch_4
        -0x32f2e794 -> :sswitch_10
        -0x31ad60e7 -> :sswitch_c
        -0x19724345 -> :sswitch_d
        -0x17c40852 -> :sswitch_2
        -0x1384706b -> :sswitch_6
        -0x107b550a -> :sswitch_6
        -0xf9c29b5 -> :sswitch_c
        -0xb8f10c0 -> :sswitch_1
        -0x9043d8b -> :sswitch_e
        0x3973ed6 -> :sswitch_a
        0x18be3b09 -> :sswitch_7
        0x1f5dc269 -> :sswitch_b
        0x2d9a34fc -> :sswitch_2
        0x30603c7c -> :sswitch_9
        0x33092dbc -> :sswitch_7
        0x36b815cb -> :sswitch_e
        0x39207645 -> :sswitch_8
        0x5a45ab54 -> :sswitch_3
        0x5ad128e2 -> :sswitch_0
        0x662749cf -> :sswitch_f
        0x66d450be -> :sswitch_8
        0x6d38c7a2 -> :sswitch_a
        0x76ebd041 -> :sswitch_5
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const p1, 0x4efcf741

    sget p2, Ll/ۗܺ;->ۨ᩺۠:I

    sget p3, Ll/֡֡;->᩶ۤ۠:I

    const-string p4, "\u0733\u06e1"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, 0x67

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x6ea5

    const v1, 0x102a25ba

    xor-int/2addr v0, v1

    const v1, 0x49b30b25

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p3

    mul-int/lit16 p1, p1, 0x6697

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    .line 2
    sget-boolean p4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez p4, :cond_1

    goto/16 :goto_3

    .line 4
    :sswitch_0
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    sget-boolean p4, Ll/֨֫;->᩸ۜ᩵:Z

    if-nez p4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string p4, "\u1a7b\u06d7"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x1213

    const v1, 0x2e14897b

    xor-int/2addr v0, v1

    const v1, 0x256a6839

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result p4

    if-nez p4, :cond_4

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget p4, Ll/֫᩺;->᩺۟ۘ:I

    if-lez p4, :cond_8

    goto/16 :goto_2

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    goto/16 :goto_2

    .line 0
    :sswitch_4
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    :sswitch_5
    return-void

    :cond_1
    const-string p4, "\u1a77\u1a7b"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x6d

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0xdc1

    const v1, 0x6cdb5e14

    xor-int/2addr v0, v1

    const v1, 0x72d76

    goto :goto_0

    .line 3
    :sswitch_6
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result p4

    if-ltz p4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string p4, "\u06eb\u05ab"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x3969

    const v1, 0x37a02784

    xor-int/2addr v0, v1

    const v1, 0x69747773

    goto :goto_0

    :sswitch_7
    sget p4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz p4, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string p4, "\u1a76\u05a1"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x73f1

    const v1, -0x5a1a5ef2

    xor-int/2addr v0, v1

    const v1, -0x40504401

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result p4

    if-gtz p4, :cond_5

    :cond_4
    const-string p4, "\u0736\u06dc"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, 0x55

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x2117

    const v1, 0x5acbb214

    xor-int/2addr v0, v1

    const v1, 0x5852a5c

    goto/16 :goto_0

    :cond_5
    const-string p4, "\u0730\u1a7a"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x3d

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x31d7

    const v1, -0x5ab7c03d

    xor-int/2addr v0, v1

    const v1, -0x1a02a6da

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget p4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz p4, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string p4, "\u1a74\u073f"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x35a3

    const v1, -0x4c7b3dca

    xor-int/2addr v0, v1

    const v1, -0x30e3a83c

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result p4

    if-ltz p4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string p4, "\u0730\u05a8"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0xdf3

    const v1, -0xfea1173

    xor-int/2addr v0, v1

    const v1, -0x1a18eeee

    goto/16 :goto_0

    :sswitch_b
    sget-boolean p4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz p4, :cond_9

    :cond_8
    :goto_1
    const-string p4, "\u0736\u06d8"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x853

    const v1, 0x5ca897d6

    xor-int/2addr v0, v1

    const v1, 0x341b52c4

    goto/16 :goto_0

    :cond_9
    const-string p4, "\u06d9\u06df"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x6111

    const v1, -0x20c42410

    xor-int/2addr v0, v1

    const v1, 0x5d9f6006

    goto/16 :goto_0

    .line 0
    :sswitch_c
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result p4

    if-ltz p4, :cond_a

    goto :goto_2

    :cond_a
    const-string p4, "\u05a8\u0730"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x27

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x279b

    const v1, 0x15431c2b

    xor-int/2addr v0, v1

    const v1, 0x65660f91

    goto/16 :goto_0

    .line 3
    :sswitch_d
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result p4

    if-gtz p4, :cond_b

    :goto_2
    const-string p4, "\u06eb\u06ec"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, 0x15

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x224d

    const v1, 0x7abf952c

    xor-int/2addr v0, v1

    const v1, -0x296926b0

    goto/16 :goto_0

    :cond_b
    const-string p4, "\u06d9\u06eb"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x41

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x2a9d

    const v1, 0x5cf4a655

    xor-int/2addr v0, v1

    const v1, 0x78cbc703

    goto/16 :goto_0

    .line 2
    :sswitch_e
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result p4

    if-eqz p4, :cond_c

    :goto_3
    const-string p4, "\u0733\u05ab"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x13

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x2d63

    const v1, -0x55d11214

    xor-int/2addr v0, v1

    const v1, 0x77ba8812

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u1a78\u05a8"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x2bb

    const v1, -0x723b753e

    xor-int/2addr v0, v1

    const v1, -0x8677932

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cca0a94 -> :sswitch_8
        -0x535ec707 -> :sswitch_9
        -0x41228e93 -> :sswitch_d
        -0x3e506225 -> :sswitch_2
        -0x3a9190c4 -> :sswitch_e
        -0x348933dd -> :sswitch_5
        -0x2e713014 -> :sswitch_c
        -0x1ba40c91 -> :sswitch_d
        -0x16baad03 -> :sswitch_5
        -0x16055006 -> :sswitch_4
        -0x915b079 -> :sswitch_6
        -0x8505614 -> :sswitch_9
        -0x78f9883 -> :sswitch_0
        -0x63ba537 -> :sswitch_3
        -0xf4c924 -> :sswitch_b
        0xce23ae -> :sswitch_7
        0x14d976b3 -> :sswitch_a
        0x32932da6 -> :sswitch_e
        0x3c60b761 -> :sswitch_7
        0x48b5c135 -> :sswitch_8
        0x4a984809 -> :sswitch_a
        0x51b0ebad -> :sswitch_2
        0x5b0d270d -> :sswitch_4
        0x66fafeb5 -> :sswitch_0
        0x67a33e9d -> :sswitch_b
        0x6943ca66 -> :sswitch_1
        0x7233e34d -> :sswitch_c
        0x7a76e739 -> :sswitch_1
        0x7d5d7935 -> :sswitch_3
        0x7f2d2162 -> :sswitch_6
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const p1, -0x6ce364d4

    sget p2, Ll/ۧ;->֫۠ᩴ:I

    sget p3, Ll/֫۟;->᩸ᩴܿ:I

    const-string p4, "\u06df\u06da"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x2d

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x5af5

    const v1, -0x2661ce71

    xor-int/2addr v0, v1

    const v1, 0x6d1919b0

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, -0x514f

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    .line 3
    sget p4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz p4, :cond_9

    goto/16 :goto_3

    .line 2
    :sswitch_0
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result p4

    if-lez p4, :cond_8

    goto/16 :goto_2

    .line 1
    :sswitch_1
    sget p4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz p4, :cond_a

    goto :goto_1

    .line 3
    :sswitch_2
    sget p4, Ll/֫ᩳ;->۬֨᩸:I

    if-lez p4, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string p4, "\u05a8\u06d6"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x3875

    const v1, 0x41c6ecbd

    xor-int/2addr v0, v1

    const v1, 0x4fd4b67

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    :sswitch_5
    return-void

    :sswitch_6
    sget-boolean p4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez p4, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string p4, "\u1a74\u06d6"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x65

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x540b

    const v1, -0x91b05fd

    xor-int/2addr v0, v1

    const v1, -0x214bd17e

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result p4

    if-eqz p4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string p4, "\u06d9\u05ab"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x45

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x4097

    const v1, -0x305ed5f9

    xor-int/2addr v0, v1

    const v1, 0x6209749c

    goto :goto_0

    .line 1
    :sswitch_8
    sget p4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz p4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string p4, "\u06e7\u06d8"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x53c9

    const v1, -0x309d5d9f

    xor-int/2addr v0, v1

    const v1, 0x1d9c12ba

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget-boolean p4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz p4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string p4, "\u1a7b\u06ec"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x2bf3

    const v1, 0x513e15a7

    xor-int/2addr v0, v1

    const v1, 0x105c8a90

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget p4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz p4, :cond_5

    goto :goto_3

    :cond_5
    const-string p4, "\u06e4\u05ab"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x75

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x4a4f

    const v1, 0x46c6b23c

    xor-int/2addr v0, v1

    const v1, -0x671bd21f

    goto/16 :goto_0

    .line 1
    :sswitch_b
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result p4

    if-ltz p4, :cond_6

    goto :goto_3

    :cond_6
    const-string p4, "\u06e7\u1a77"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x2b

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x3ccf

    const v1, 0x89a6225

    xor-int/2addr v0, v1

    const v1, 0x7f854b17

    goto/16 :goto_0

    :sswitch_c
    sget p4, Ll/֨ۧ;->֫۠֡:I

    if-gtz p4, :cond_7

    :goto_2
    const-string p4, "\u05a1\u1a79"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x2f

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x7c0b

    const v1, 0x5ad06322

    xor-int/2addr v0, v1

    const v1, 0x2bb48815

    goto/16 :goto_0

    :cond_7
    const-string p4, "\u06df\u1a73"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x3e81

    const v1, 0x61b35d4f

    xor-int/2addr v0, v1

    const v1, -0x769b1427

    goto/16 :goto_0

    :cond_8
    :goto_3
    const-string p4, "\u1a76\u06eb"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x4261

    const v1, 0x261ffb0

    xor-int/2addr v0, v1

    const v1, 0x6746d685

    goto/16 :goto_0

    :cond_9
    const-string p4, "\u1a7a\u0736"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x71

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x669b

    const v1, 0xfd8b00f

    xor-int/2addr v0, v1

    const v1, 0x153088dd

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget p4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz p4, :cond_b

    :cond_a
    :goto_4
    const-string p4, "\u1a73\u073f"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x5d

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x1d89

    const v1, 0x54bfd581

    xor-int/2addr v0, v1

    const v1, -0x4de905

    goto/16 :goto_0

    :cond_b
    const-string p4, "\u06df\u1a7b"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, 0x39

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x66ed

    const v1, -0x1fe6c445

    xor-int/2addr v0, v1

    const v1, 0x527d5b10

    goto/16 :goto_0

    :sswitch_e
    sget p4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz p4, :cond_c

    :goto_5
    const-string p4, "\u1a75\u06da"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x3ba7

    const v1, 0x6e0fdaa7

    xor-int/2addr v0, v1

    const v1, 0x7fe85370

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u06e2\u1a77"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x1ff7

    const v1, 0x3b30c8dc

    xor-int/2addr v0, v1

    const v1, -0x7d834cac

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e0c1af7 -> :sswitch_b
        -0x7519dd0c -> :sswitch_7
        -0x6a7b83e0 -> :sswitch_a
        -0x5dc53768 -> :sswitch_7
        -0x5dc0cf43 -> :sswitch_2
        -0x5dc057a7 -> :sswitch_9
        -0x50a4b2d6 -> :sswitch_8
        -0x4695b84c -> :sswitch_1
        -0x4406fede -> :sswitch_3
        -0x3f106be2 -> :sswitch_0
        -0x36076592 -> :sswitch_c
        -0x33a1e3c3 -> :sswitch_3
        -0x2de17957 -> :sswitch_c
        -0x27beee25 -> :sswitch_1
        -0x1d84c18c -> :sswitch_4
        -0x1491e5f0 -> :sswitch_6
        -0xe0f4f60 -> :sswitch_e
        0x8999dba -> :sswitch_2
        0xdd48c78 -> :sswitch_9
        0x13d78470 -> :sswitch_0
        0x1b27d902 -> :sswitch_4
        0x1c401d2d -> :sswitch_a
        0x329d50bc -> :sswitch_e
        0x3660f8c6 -> :sswitch_b
        0x3d78a0ea -> :sswitch_d
        0x4e06ed03 -> :sswitch_6
        0x74958c6c -> :sswitch_8
        0x75254fe1 -> :sswitch_d
        0x7670fed6 -> :sswitch_5
        0x7f5a8571 -> :sswitch_5
    .end sparse-switch
.end method

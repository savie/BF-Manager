.class public final synthetic Ll/۟᩵᩺;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ll/᩵ۡۜ;

.field public final synthetic ܺ:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ܽ:Ll/᩻ۡ᩺;

.field public final synthetic ᩶:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Ll/᩵ۡۜ;Ll/᩻ۡ᩺;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 6

    const v0, -0x23cec83

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v2, Ll/֫ᩳ;->۬֨᩸:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a77\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2837

    const v5, -0x5fadbf45

    xor-int/2addr v4, v5

    const v5, 0x7aed7c65

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x36dd

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_a

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v3

    if-gtz v3, :cond_9

    goto/16 :goto_5

    :sswitch_1
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-lez v3, :cond_b

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_4

    goto :goto_1

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    :goto_1
    const-string v3, "\u05ab\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3523

    const v5, -0x20e52def

    xor-int/2addr v4, v5

    const v5, -0x5fc8599e

    goto :goto_0

    .line 0
    :sswitch_4
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    iput-object p2, p0, Ll/۟᩵᩺;->֡:Ll/᩵ۡۜ;

    iput-object p3, p0, Ll/۟᩵᩺;->ܽ:Ll/᩻ۡ᩺;

    return-void

    :sswitch_6
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u05a1\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6b0d

    const v5, 0x20964554

    xor-int/2addr v4, v5

    const v5, 0x4a032d98    # 2149222.0f

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u06e4\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6ce9

    const v5, -0xf8783e7

    xor-int/2addr v4, v5

    const v5, -0x6732c78d

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06e0\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c8b

    const v5, 0x47f9b7d1

    xor-int/2addr v4, v5

    const v5, 0x79738eb5

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u05a1\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1d5b

    const v5, -0x35a0a82b

    xor-int/2addr v4, v5

    const v5, 0x621f4a06

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_5

    :cond_4
    :goto_2
    const-string v3, "\u06df\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2ebf

    const v5, 0x32a98eb3

    xor-int/2addr v4, v5

    const v5, -0x374e3ebd

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e0\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x16b3

    const v5, 0x6575a9c8

    xor-int/2addr v4, v5

    const v5, -0x849e288

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_6

    goto :goto_4

    :cond_6
    const-string v3, "\u1a78\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2f17

    const v5, 0x38ca0fd0

    xor-int/2addr v4, v5

    const v5, -0x575fd3e1

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06e1\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x630b

    const v5, 0x36b9bcfa

    xor-int/2addr v4, v5

    const v5, 0xc7853df

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_8

    :goto_3
    const-string v3, "\u1a74\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2ee5

    const v5, -0x737a9831

    xor-int/2addr v4, v5

    const v5, -0x85b4dd7

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06da\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6ad3

    const v5, -0x394d8a0f

    xor-int/2addr v4, v5

    const v5, 0x5a7eb7f2

    goto/16 :goto_0

    :cond_9
    :goto_4
    const-string v3, "\u06e4\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x38b5

    const v5, 0xa6cdded

    xor-int/2addr v4, v5

    const v5, 0x371200f7

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05a8\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x44df

    const v5, 0x4a11b3db    # 2387190.8f

    xor-int/2addr v4, v5

    const v5, -0x3c466cef

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p4, p0, Ll/۟᩵᩺;->ܺ:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p1, p0, Ll/۟᩵᩺;->᩶:Landroid/widget/EditText;

    .line 2
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u1a7a\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1bd9

    const v5, 0x794d5864

    xor-int/2addr v4, v5

    const v5, 0x7253d1d9

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d9\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x26f3

    const v5, -0x7f4c47de

    xor-int/2addr v4, v5

    const v5, 0x43c0fdb

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x74e1d1b5 -> :sswitch_4
        -0x6c38814d -> :sswitch_7
        -0x6c170de1 -> :sswitch_1
        -0x5a5deaa3 -> :sswitch_0
        -0x57a90564 -> :sswitch_9
        -0x49872b20 -> :sswitch_c
        -0x46a94d58 -> :sswitch_e
        -0x43af1eb2 -> :sswitch_2
        -0x41122e6e -> :sswitch_5
        -0x30b8b596 -> :sswitch_b
        -0x2af150d1 -> :sswitch_3
        -0x11d83fd2 -> :sswitch_d
        -0x559750d -> :sswitch_a
        -0x28d377 -> :sswitch_4
        0x9eecddb -> :sswitch_0
        0x134af6f1 -> :sswitch_e
        0x15e3a4e1 -> :sswitch_5
        0x177898df -> :sswitch_3
        0x1adc9b4d -> :sswitch_8
        0x1b7d48ae -> :sswitch_1
        0x205577c0 -> :sswitch_2
        0x240383cd -> :sswitch_6
        0x2c233b06 -> :sswitch_d
        0x347e50b3 -> :sswitch_c
        0x3dffbee3 -> :sswitch_8
        0x4d365f86 -> :sswitch_7
        0x54460df6 -> :sswitch_a
        0x5d247db4 -> :sswitch_9
        0x5e7d127c -> :sswitch_b
        0x672490ef -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    const/4 p1, 0x0

    const/4 v0, 0x0

    const v1, -0x4bfa0a94

    sget v2, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    const-string v4, "\u073a\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3751

    const v6, 0xdcc1497

    xor-int/2addr v5, v6

    const v6, -0x49c2fb87

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x2515

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 0
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v4

    if-gtz v4, :cond_6

    goto/16 :goto_2

    :sswitch_0
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v4, :cond_8

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v4

    if-gez v4, :cond_5

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-nez v4, :cond_b

    goto :goto_1

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    :goto_1
    const-string v4, "\u06d9\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3da3

    const v6, -0x30f4cfea

    xor-int/2addr v5, v6

    const v6, -0x657f543f

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v1, p0, Ll/۟᩵᩺;->᩶:Landroid/widget/EditText;

    iget-object v2, p0, Ll/۟᩵᩺;->ܺ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v1, p1, v0, v2}, Ll/᩻ۡ᩺;->ܰ(Landroid/widget/EditText;Ll/᩵ۡۜ;Ll/᩻ۡ᩺;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-void

    :sswitch_6
    iget-object v0, p0, Ll/۟᩵᩺;->ܽ:Ll/᩻ۡ᩺;

    .line 2
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u06db\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x27ad

    const v6, 0x77391498

    xor-int/2addr v5, v6

    const v6, 0x2ec481a0

    goto :goto_0

    .line 0
    :sswitch_7
    iget-object p1, p0, Ll/۟᩵᩺;->֡:Ll/᩵ۡۜ;

    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v4, "\u05a1\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x76cd

    const v6, -0x596f4ac2

    xor-int/2addr v5, v6

    const v6, -0x73625048

    goto/16 :goto_0

    .line 1
    :sswitch_8
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u073f\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xd03

    const v6, -0x4ddc23ec

    xor-int/2addr v5, v6

    const v6, 0x38c7d3c6

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u06e8\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x58e1

    const v6, -0x143581bf

    xor-int/2addr v5, v6

    const v6, 0x2fdb1aac

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v4, :cond_4

    goto :goto_3

    :cond_4
    const-string v4, "\u06eb\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4fc9

    const v6, 0xc606ee

    xor-int/2addr v5, v6

    const v6, -0x3908f33

    goto/16 :goto_0

    :cond_5
    :goto_2
    const-string v4, "\u1a75\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x15ab

    const v6, 0x3c57ac68

    xor-int/2addr v5, v6

    const v6, 0x7cb120fa

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e1\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7e7d

    const v6, 0x21782f56

    xor-int/2addr v5, v6

    const v6, -0x58b4cf9d

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u06ec\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xdf7

    const v6, 0x335da9f

    xor-int/2addr v5, v6

    const v6, -0x5bdf379a

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v4

    if-eqz v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u1a75\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x59c5

    const v6, 0x79d336bc

    xor-int/2addr v5, v6

    const v6, -0x393a0792

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u073a\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2965

    const v6, -0x1018bf91

    xor-int/2addr v5, v6

    const v6, -0x2aeb47b0

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_a

    :goto_4
    const-string v4, "\u1a79\u06df"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2e95

    const v6, 0x7be01f88

    xor-int/2addr v5, v6

    const v6, -0x3421b9e

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06eb\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x13e3

    const v6, 0x34631af8

    xor-int/2addr v5, v6

    const v6, -0x24ee64eb

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u06e2\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1f7f

    const v6, 0x595333c1

    xor-int/2addr v5, v6

    const v6, -0x1a4224db

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a78\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4365

    const v6, 0x3760d5f7

    xor-int/2addr v5, v6

    const v6, 0x3c9deedc

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d482851 -> :sswitch_3
        -0x7c8c0e66 -> :sswitch_c
        -0x732726e7 -> :sswitch_e
        -0x713031df -> :sswitch_6
        -0x7039b054 -> :sswitch_5
        -0x66e41ba1 -> :sswitch_7
        -0x65a7f7c6 -> :sswitch_a
        -0x63e089bb -> :sswitch_8
        -0x616e84c3 -> :sswitch_7
        -0x615bfe17 -> :sswitch_1
        -0x5bf2e546 -> :sswitch_9
        -0x5b23973d -> :sswitch_0
        -0x53cd08a1 -> :sswitch_d
        -0x42204fb8 -> :sswitch_3
        -0x407647bb -> :sswitch_1
        -0x30fb91ec -> :sswitch_9
        -0x2e460d9d -> :sswitch_b
        -0x2cb9857b -> :sswitch_0
        -0x2c364118 -> :sswitch_b
        -0x2b0052dd -> :sswitch_6
        0x2eee23a -> :sswitch_c
        0x649f9a8 -> :sswitch_a
        0xee3080a -> :sswitch_8
        0x173ff729 -> :sswitch_e
        0x2c13bb9e -> :sswitch_2
        0x3d50668a -> :sswitch_4
        0x3fa7cbc5 -> :sswitch_5
        0x586b07a0 -> :sswitch_4
        0x69770fe4 -> :sswitch_d
        0x7444e7c9 -> :sswitch_2
    .end sparse-switch
.end method

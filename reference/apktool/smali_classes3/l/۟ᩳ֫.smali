.class public final synthetic Ll/۟ᩳ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ᩳᩳ֫;

.field public final synthetic ᩶:Ll/᩷ۨᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳᩳ֫;Ll/᩷ۨᩴ;)V
    .locals 6

    const v0, -0x47107a63

    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    sget v2, Ll/֨ۢ;->۬ܿܺ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a77\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4bad

    const v5, -0x4410eabf

    xor-int/2addr v4, v5

    const v5, -0x68b17b43

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x7d4d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_5

    goto/16 :goto_2

    :sswitch_0
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_8

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_a

    goto :goto_1

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v3

    if-ltz v3, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_1
    const-string v3, "\u06e4\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3a9b

    const v5, -0x4e4013f0

    xor-int/2addr v4, v5

    const v5, -0x60b08f95

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/۟ᩳ֫;->᩶:Ll/᩷ۨᩴ;

    return-void

    :sswitch_6
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u073f\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4faf

    const v5, 0x5a813d7e

    xor-int/2addr v4, v5

    const v5, 0x18358781

    goto :goto_0

    .line 2
    :sswitch_7
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u1a7a\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c37

    const v5, 0x51f0ed8d

    xor-int/2addr v4, v5

    const v5, 0x13a6110c

    goto :goto_0

    :sswitch_8
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u073d\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6911

    const v5, 0x4dfc6d0e    # 5.2937568E8f

    xor-int/2addr v4, v5

    const v5, 0x158a4aa5

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v3, "\u06e4\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6023

    const v5, -0x5e2ec9fc

    xor-int/2addr v4, v5

    const v5, 0x2d67c1a7

    goto/16 :goto_0

    :goto_2
    const-string v3, "\u0730\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1e37

    const v5, -0x5c779268

    xor-int/2addr v4, v5

    const v5, 0x4a03078f    # 2146787.8f

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06da\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x153d

    const v5, 0x71df8bf7

    xor-int/2addr v4, v5

    const v5, 0x517a3b5b

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u0730\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x9e9

    const v5, -0x570fe566

    xor-int/2addr v4, v5

    const v5, 0x3aaddcb3

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v3, "\u1a78\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x36a1

    const v5, -0x6e72bc01

    xor-int/2addr v4, v5

    const v5, 0x6da1180b

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06ec\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6be7

    const v5, -0x70ba2c65

    xor-int/2addr v4, v5

    const v5, -0x6678325a

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a7b\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4e29

    const v5, 0x6b38e942

    xor-int/2addr v4, v5

    const v5, 0x5a1f39c3

    goto/16 :goto_0

    .line 1
    :sswitch_d
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u06d8\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6ec5

    const v5, -0x511f0400

    xor-int/2addr v4, v5

    const v5, 0x279941a7

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e4\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1c7b

    const v5, -0x69568ab1

    xor-int/2addr v4, v5

    const v5, 0x1bedc376

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/۟ᩳ֫;->ܰ:Ll/ᩳᩳ֫;

    .line 1
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_c

    :goto_5
    const-string v3, "\u05a1\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x117

    const v5, -0x6d77161d

    xor-int/2addr v4, v5

    const v5, -0x1a78276c

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a78\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6e5f

    const v5, 0x490e8fd6    # 583933.4f

    xor-int/2addr v4, v5

    const v5, -0x5654ebd3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f7ae24d -> :sswitch_e
        -0x782ab55d -> :sswitch_4
        -0x6f8473bc -> :sswitch_c
        -0x61bc54c7 -> :sswitch_b
        -0x5d79c368 -> :sswitch_7
        -0x598b10aa -> :sswitch_1
        -0x53a04eb6 -> :sswitch_6
        -0x5289e26d -> :sswitch_c
        -0x51ec5e21 -> :sswitch_9
        -0x493b8a76 -> :sswitch_a
        -0x4882a02a -> :sswitch_8
        -0x471b598b -> :sswitch_b
        -0x40184b3a -> :sswitch_1
        -0x3f2b6002 -> :sswitch_2
        -0x3405f6bd -> :sswitch_d
        -0x3220d3b7 -> :sswitch_4
        -0x311304f1 -> :sswitch_7
        -0xcf01ecd -> :sswitch_3
        -0xa560367 -> :sswitch_5
        -0x2d94a2f -> :sswitch_a
        0xf3e3d3 -> :sswitch_d
        0x221eadcf -> :sswitch_e
        0x2851c560 -> :sswitch_0
        0x561b5ac7 -> :sswitch_8
        0x6c085dcb -> :sswitch_2
        0x787d3779 -> :sswitch_0
        0x7a674754 -> :sswitch_5
        0x7dfcdc63 -> :sswitch_9
        0x7fb03bea -> :sswitch_6
        0x7fdea5da -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    const/4 p1, 0x0

    const p2, -0x225a90b8

    sget v0, Ll/ۖ֡;->ۚۛᩳ:I

    sget v1, Ll/֫֡;->֫ۙۖ:I

    const-string v2, "\u0730\u06eb"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x47

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x192d

    const v4, -0x5d9e9d46

    xor-int/2addr v3, v4

    const v4, -0x42fa46c9

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p2, v0

    mul-int/lit16 p2, p2, 0x7d4f

    shr-int/lit8 p2, p2, 0x1f

    and-int/2addr p2, v3

    xor-int/2addr p2, v2

    sparse-switch p2, :sswitch_data_0

    .line 2026
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_5

    :sswitch_0
    sget v2, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v2, :cond_a

    goto :goto_1

    .line 775
    :sswitch_1
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_1

    .line 2108
    :sswitch_2
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v2

    if-gtz v2, :cond_2

    goto/16 :goto_2

    .line 1466
    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    return-void

    .line 2218
    :sswitch_5
    iget-object p2, p0, Ll/۟ᩳ֫;->᩶:Ll/᩷ۨᩴ;

    invoke-static {p2}, Ll/ۗ᩶;->ۨܽ᩷(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    sget v0, Ll/۟ۢ֫;->ۡ᩷:I

    .line 2387
    invoke-static {p1, p2}, Lbin/mt/plus/Main;->᩷(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    .line 2218
    :sswitch_6
    iget-object p1, p0, Ll/۟ᩳ֫;->ܰ:Ll/ᩳᩳ֫;

    iget-object p1, p1, Ll/ᩳᩳ֫;->۫:Ll/۟ۢ֫;

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v2, "\u1a73\u06ec"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x68d

    const v4, 0x3572e0f9

    xor-int/2addr v3, v4

    const v4, -0x45d20a75

    goto :goto_0

    :sswitch_7
    sget v2, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v2, :cond_1

    goto :goto_2

    :cond_1
    const-string v2, "\u1a78\u06eb"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x3c0d

    const v4, -0x559c62f8

    xor-int/2addr v3, v4

    const v4, 0x32856ded

    goto :goto_0

    .line 1824
    :sswitch_8
    sget v2, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v2, :cond_3

    :cond_2
    :goto_1
    const-string v2, "\u1a73\u073d"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4c0f

    const v4, 0x4ee318ed

    xor-int/2addr v3, v4

    const v4, 0x6afd3d94

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06db\u06df"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x7e85

    const v4, 0x7d774641

    xor-int/2addr v3, v4

    const v4, -0x52210174

    goto/16 :goto_0

    .line 1637
    :sswitch_9
    sget-boolean v2, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v2, :cond_4

    :goto_2
    const-string v2, "\u0733\u073d"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x17

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x537d

    const v4, -0x3aef838f

    xor-int/2addr v3, v4

    const v4, -0x2f822fe

    goto/16 :goto_0

    :cond_4
    const-string v2, "\u1a78\u06d9"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x3d

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x6e6b

    const v4, -0x6ebc7056

    xor-int/2addr v3, v4

    const v4, 0x6393ea04

    goto/16 :goto_0

    .line 2257
    :sswitch_a
    sget-boolean v2, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    const-string v2, "\u0733\u1a73"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x7d

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x5441

    const v4, 0x33578e01

    xor-int/2addr v3, v4

    const v4, -0x475aa597

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06d9\u06e4"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x63

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x3aa3

    const v4, 0x5ec9fde1

    xor-int/2addr v3, v4

    const v4, -0x49bbcc99

    goto/16 :goto_0

    .line 1995
    :sswitch_b
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    const-string v2, "\u06da\u0733"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x3b

    xor-int v3, v2, v0

    mul-int/lit8 v3, v3, -0x5

    const v4, -0x4f154185

    xor-int/2addr v3, v4

    const v4, -0x5bc999cb

    goto/16 :goto_0

    :sswitch_c
    sget v2, Ll/֫֡;->֫ۙۖ:I

    if-gtz v2, :cond_9

    :cond_8
    :goto_3
    const-string v2, "\u05a8\u06e4"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x5369

    const v4, -0x36d78715

    xor-int/2addr v3, v4

    const v4, -0x29e575e6

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e1\u05a1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x47f9

    const v4, -0x4e16425c

    xor-int/2addr v3, v4

    const v4, 0x58da5fa6

    goto/16 :goto_0

    .line 1907
    :sswitch_d
    sget v2, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v2, :cond_b

    :cond_a
    :goto_4
    const-string v2, "\u05ab\u06e2"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x1523

    const v4, 0xfb5ebd2

    xor-int/2addr v3, v4

    const v4, 0x4b42a40b    # 1.2755979E7f

    goto/16 :goto_0

    :cond_b
    const-string v2, "\u06d9\u0736"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2dd

    const v4, 0x110b38db

    xor-int/2addr v3, v4

    const v4, -0x5d022cb2

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v2

    if-nez v2, :cond_c

    :goto_5
    const-string v2, "\u0730\u06df"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x39

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x62eb

    const v4, 0x73faa043

    xor-int/2addr v3, v4

    const v4, -0xd2f8a2b

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06d8\u05ab"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x4d

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x3967

    const v4, -0x1bbc87ab

    xor-int/2addr v3, v4

    const v4, -0x4ca6c6c5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x793f15c8 -> :sswitch_e
        -0x4bb7e485 -> :sswitch_2
        -0x45cdbe20 -> :sswitch_9
        -0x3f9888ee -> :sswitch_8
        -0x3f50d092 -> :sswitch_c
        -0x30f82f6e -> :sswitch_7
        -0x2936bf2e -> :sswitch_a
        -0x2862ab92 -> :sswitch_0
        -0x1b401a3c -> :sswitch_7
        -0x18a645da -> :sswitch_e
        -0xf5dd110 -> :sswitch_8
        -0xcb0f082 -> :sswitch_5
        0x223d2b0 -> :sswitch_1
        0xd780133 -> :sswitch_4
        0x102a2910 -> :sswitch_1
        0x16bd1237 -> :sswitch_0
        0x1a90dd7b -> :sswitch_a
        0x239fc692 -> :sswitch_3
        0x26082c05 -> :sswitch_2
        0x284b08d7 -> :sswitch_4
        0x2921ea0f -> :sswitch_5
        0x3a88a21b -> :sswitch_b
        0x3f25d8fa -> :sswitch_9
        0x4e74f948 -> :sswitch_b
        0x50d471c3 -> :sswitch_6
        0x5e0e9776 -> :sswitch_d
        0x5fbc48d1 -> :sswitch_6
        0x6016f9e9 -> :sswitch_c
        0x643b332a -> :sswitch_3
        0x7cf35a53 -> :sswitch_d
    .end sparse-switch
.end method

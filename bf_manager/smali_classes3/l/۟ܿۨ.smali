.class public final synthetic Ll/۟ܿۨ;
.super Ljava/lang/Object;
.source "H508"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ۜܽۜ:[S


# instance fields
.field public final synthetic ܺ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۟ܿۨ;->ۜܽۜ:[S

    return-void

    :array_0
    .array-data 2
        0x71ds
        0x4cd1s
        0x4cc5s
        0x4cd8s
        0x4cdas
        0x4cf3s
        0x4cdes
        0x4cd6s
        0x4cdbs
        0x4cd8s
        0x4cd0s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, -0x1816f4e8

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v2, Ll/֨᩹;->᩻ᩳ֨:I

    .line 0
    iput p1, p0, Ll/۟ܿۨ;->ܺ:I

    iput-object p2, p0, Ll/۟ܿۨ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u06e1\u06db"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x37

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x58e3

    const v3, 0x44e53127

    xor-int/2addr p2, v3

    const v3, -0x5951c2ce

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x49a5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    sget p1, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u05a8\u1a78"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x70c1

    const v3, 0xd27249c

    xor-int/2addr p2, v3

    const v3, 0x5737fdab

    goto :goto_0

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u05a1\u06df"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x27bf

    const v3, -0x418b9d05

    xor-int/2addr p2, v3

    const v3, -0x64ea0f7e

    goto :goto_0

    :cond_2
    :goto_1
    const-string p1, "\u1a7a\u06dc"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x4ccb

    const v3, -0x51ca9f34

    xor-int/2addr p2, v3

    const v3, -0x2508d86d

    goto :goto_0

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    :goto_2
    const-string p1, "\u06d7\u06e7"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x339f

    const v3, 0x72b6c8f1

    xor-int/2addr p2, v3

    const v3, -0x6c3092bc

    goto :goto_0

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "\u06e0\u06e2"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x21

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0xd1d

    const v3, -0x376f8b42

    xor-int/2addr p2, v3

    const v3, -0x6a00b0bf

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u073d\u06db"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x74d

    const v3, 0x46c4b167

    xor-int/2addr p2, v3

    const v3, 0x19805bfb

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x29ef49f8 -> :sswitch_2
        -0x1cc0a800 -> :sswitch_1
        -0x18e4826d -> :sswitch_5
        -0xe1ed634 -> :sswitch_2
        0x1bd1b1ca -> :sswitch_5
        0x21c85852 -> :sswitch_0
        0x32958938 -> :sswitch_4
        0x32cda203 -> :sswitch_3
        0x34535288 -> :sswitch_3
        0x54a34f14 -> :sswitch_0
        0x5bca11bb -> :sswitch_4
        0x7c220186 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 20

    move-object/from16 v0, p0

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

    const v14, -0x3bde94d4

    sget v15, Ll/ۗᩳ;->ۚۤ֡:I

    sget v16, Ll/ۘۗ;->ۖۧ۬:I

    const-string v17, "\u05ab\u0730"

    invoke-static/range {v17 .. v17}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, 0x2475

    const v18, 0x58fa35d9

    xor-int v1, v1, v18

    const v18, 0x798a67a6

    xor-int v17, v17, v18

    move-object/from16 v19, v4

    move-object v14, v13

    move/from16 v18, v17

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v17, -0x3bde94d4

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v5, v17, v15

    mul-int/lit16 v5, v5, -0x2811

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    const/4 v1, 0x1

    .line 113
    invoke-virtual {v2, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 114
    invoke-static {v3, v2}, Ll/ۗܳ;->᩺ܿۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 2
    :sswitch_0
    sget-boolean v1, Ll/֨֫;->᩸ۜ᩵:Z

    if-nez v1, :cond_4

    goto/16 :goto_4

    .line 58
    :sswitch_1
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v1

    if-eqz v1, :cond_c

    goto/16 :goto_4

    .line 8
    :sswitch_2
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_1

    goto/16 :goto_4

    .line 30
    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    goto/16 :goto_4

    .line 91
    :sswitch_4
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    return-void

    .line 7
    :sswitch_5
    iget-object v1, v0, Ll/۟ܿۨ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v1, Ll/ۧۧۨ;

    .line 12
    invoke-static {v1}, Ll/ۧۧۨ;->ۨ(Ll/ۧۧۨ;)V

    return-void

    :sswitch_6
    const/4 v1, 0x1

    const/16 v4, 0xa

    .line 112
    invoke-static {v14, v1, v4, v13}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v4

    .line 44
    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v1, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v1, "\u1a75\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x4d

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x6d57

    const v18, -0x580a2380

    xor-int v5, v5, v18

    const v18, -0xe4a7b5b

    goto/16 :goto_6

    .line 15
    :sswitch_7
    iget-object v1, v0, Ll/۟ܿۨ;->᩶:Ljava/lang/Object;

    .line 17
    move-object v3, v1

    check-cast v3, Lbin/mt/plus/Main;

    .line 112
    new-instance v2, Landroid/content/Intent;

    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_2

    :cond_1
    const-string v1, "\u0736\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0xb

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, -0x165b

    const v5, -0x79b17b92

    xor-int/2addr v2, v5

    const v5, 0x47d8ac84

    :goto_1
    xor-int v18, v1, v5

    move v1, v2

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_2
    const-class v1, Ll/᩶ܽۨ;

    sget-boolean v5, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v5, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v14, Ll/۟ܿۨ;->ۜܽۜ:[S

    .line 50
    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v1, :cond_5

    :cond_4
    const-string v1, "\u073a\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x3f

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x63f1

    const v18, -0x9e19003

    xor-int v5, v5, v18

    const v18, -0x75d3f74d

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u06d8\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x5529

    const v18, 0x2fb065a9

    xor-int v5, v5, v18

    const v18, -0x510ca852

    goto/16 :goto_6

    .line 2
    :sswitch_8
    iget v1, v0, Ll/۟ܿۨ;->ܺ:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "\u073a\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x5743

    const v18, 0x397560e7

    xor-int v5, v5, v18

    const v18, 0x5c9a272b

    goto/16 :goto_6

    :pswitch_0
    const-string v1, "\u06df\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x686b

    const v18, -0x6a9c17bd

    xor-int v5, v5, v18

    const v18, 0x5cbb34a6

    goto/16 :goto_6

    :sswitch_9
    const v1, 0xcc11

    const v13, 0xcc11

    goto :goto_2

    :sswitch_a
    const/16 v1, 0x4cb7

    const/16 v13, 0x4cb7

    :goto_2
    const-string v1, "\u06e1\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x5b

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x5959

    const v18, 0x2ab43f50

    xor-int v5, v5, v18

    const v18, -0x1dc0c716

    goto/16 :goto_6

    :sswitch_b
    add-int v1, v11, v12

    add-int/2addr v1, v1

    sub-int v1, v10, v1

    if-gtz v1, :cond_6

    const-string v1, "\u06eb\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x6729

    const v18, 0x35b39b14

    xor-int v5, v5, v18

    const v18, -0x71006586

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u1a79\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x85

    const v18, 0x5ac9041f

    xor-int v5, v5, v18

    const v18, -0x6979945d

    goto/16 :goto_6

    :sswitch_c
    mul-int v10, v9, v9

    mul-int v11, v7, v7

    const v12, 0xee8ec4

    .line 61
    sget v1, Ll/۟;->ۨᩴۛ:I

    if-ltz v1, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "\u06e7\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x521

    const v18, -0x1efbd312

    xor-int v5, v5, v18

    const v18, 0x14e9e26f    # 2.36163E-26f

    goto/16 :goto_6

    :sswitch_d
    add-int v9, v7, v8

    .line 64
    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v1, :cond_8

    goto :goto_3

    :cond_8
    const-string v1, "\u06da\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x2035

    const v18, 0x4efdb646    # 2.1282906E9f

    xor-int v5, v5, v18

    const v18, 0x6097f710

    goto/16 :goto_6

    :sswitch_e
    aget-short v7, v19, v6

    const/16 v8, 0xf72

    .line 72
    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v1, :cond_9

    :goto_3
    const-string v1, "\u06e1\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v2, v1, v16

    mul-int/lit16 v2, v2, -0x63e9

    const v5, 0x23dcc152

    xor-int/2addr v2, v5

    const v5, 0x2024f025

    goto/16 :goto_1

    :cond_9
    const-string v1, "\u06e1\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x2d

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0xbbf

    const v18, -0x55ccb023

    xor-int v5, v5, v18

    const v18, 0x2e825d60

    goto/16 :goto_6

    :sswitch_f
    const/4 v6, 0x0

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v1, :cond_a

    goto :goto_4

    :cond_a
    const-string v1, "\u073d\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x55bb

    const v18, -0x2d8d97b7

    xor-int v5, v5, v18

    const v18, -0x6a80de41

    goto :goto_6

    :sswitch_10
    sget-object v19, Ll/۟ܿۨ;->ۜܽۜ:[S

    .line 1
    sget v1, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v1, :cond_b

    :goto_4
    const-string v1, "\u1a76\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x47

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x22f7

    const v18, 0x2ff759a5

    xor-int v5, v5, v18

    const v18, -0x450660e0

    goto :goto_6

    :cond_b
    const-string v1, "\u1a74\u06eb"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x4d

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x5e6b

    const v18, -0x274cf6d5

    xor-int v5, v5, v18

    const v18, 0x37e2937a

    goto :goto_6

    .line 104
    :sswitch_11
    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v1, :cond_d

    :cond_c
    :goto_5
    const-string v1, "\u06ec\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x9

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x2cf

    const v18, 0x783106d0

    xor-int v5, v5, v18

    const v18, -0x248a23e1

    goto :goto_6

    :cond_d
    const-string v1, "\u1a7a\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0xb

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x5c3b

    const v18, -0x38528c38

    xor-int v5, v5, v18

    const v18, -0x7a7222bf

    :goto_6
    xor-int v18, v1, v18

    move v1, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cb8e01d -> :sswitch_b
        -0x78bf2ae8 -> :sswitch_d
        -0x72ea45ff -> :sswitch_c
        -0x69f513a6 -> :sswitch_4
        -0x63d6fd1b -> :sswitch_3
        -0x61cb0c32 -> :sswitch_7
        -0x5c635e3c -> :sswitch_10
        -0x55756ac8 -> :sswitch_2
        -0x4306dea0 -> :sswitch_6
        -0x41db11d2 -> :sswitch_0
        -0x34ea31f9 -> :sswitch_7
        -0x34cb1f72 -> :sswitch_5
        -0x16c535af -> :sswitch_8
        -0x11db1000 -> :sswitch_11
        -0x1da00f3 -> :sswitch_10
        -0x1682213 -> :sswitch_c
        0x50cdbe -> :sswitch_f
        0x12b70a8 -> :sswitch_9
        0xb7f373e -> :sswitch_e
        0xc1fa334 -> :sswitch_2
        0x10ffb68e -> :sswitch_a
        0x1b467af1 -> :sswitch_1
        0x21c4234c -> :sswitch_1
        0x27d80d42 -> :sswitch_d
        0x33cb7bc1 -> :sswitch_e
        0x37d0f48e -> :sswitch_8
        0x38105d60 -> :sswitch_b
        0x395daf3d -> :sswitch_6
        0x3c56d00f -> :sswitch_3
        0x45cee8b4 -> :sswitch_11
        0x4ebb7ea7 -> :sswitch_5
        0x4ed7012b -> :sswitch_a
        0x4f394822 -> :sswitch_f
        0x5017a004 -> :sswitch_0
        0x5cb89b33 -> :sswitch_9
        0x6df7acfe -> :sswitch_4
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

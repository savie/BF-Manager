.class public final synthetic Ll/۟ᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ֡ۖܽ:[S


# instance fields
.field public final synthetic ܺ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۟ᩳۘ;->֡ۖܽ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1a61s
        -0x5161s
        -0x5167s
        -0x3aa9s
        -0x34dfs
        0x292as
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, -0xb6682d9

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v2, Ll/֫;->ܶܺ᩻:I

    .line 0
    iput p1, p0, Ll/۟ᩳۘ;->ܺ:I

    iput-object p2, p0, Ll/۟ᩳۘ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u06df\u06e4"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x51

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0xb21

    const v3, 0x63bcd28f

    xor-int/2addr p2, v3

    const v3, 0x4f5444df

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x631d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    .line 3
    :sswitch_0
    sget p1, Ll/֫ۚ;->ܽ۠᩹:I

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u05a1\u06df"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x43a7

    const v3, 0xf3ef509

    xor-int/2addr p2, v3

    const v3, 0x6731f2c3

    goto :goto_0

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget p1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u05a1\u06e4"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x4b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x104f

    const v3, -0x7a69f3a6

    xor-int/2addr p2, v3

    const v3, -0x5aece479

    goto :goto_0

    :cond_2
    :goto_1
    const-string p1, "\u0730\u06d8"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x617f

    const v3, -0x2c41b7a4

    xor-int/2addr p2, v3

    const v3, 0x60c9ca03

    goto :goto_0

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    :goto_2
    const-string p1, "\u06da\u06d7"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7ebd

    const v3, -0x388dcf67    # -62000.598f

    xor-int/2addr p2, v3

    const v3, 0x2770cbcb

    goto :goto_0

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 0
    :sswitch_5
    sget-boolean p1, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez p1, :cond_3

    const-string p1, "\u06df\u1a74"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x367

    const v3, -0x762dfd38

    xor-int/2addr p2, v3

    const v3, -0x7e70de1

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06e4\u1a73"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x69

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x605d

    const v3, -0x51f3d354

    xor-int/2addr p2, v3

    const v3, -0x34d98860    # -1.09096E7f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cd83dd5 -> :sswitch_1
        -0x798dfabf -> :sswitch_3
        -0x3e34c5e4 -> :sswitch_2
        -0x3a9d56d5 -> :sswitch_4
        -0x260af525 -> :sswitch_1
        -0x17ce1597 -> :sswitch_2
        0x278a5641 -> :sswitch_0
        0x4145c97b -> :sswitch_5
        0x43fcd96c -> :sswitch_3
        0x47fc16df -> :sswitch_4
        0x591a08dd -> :sswitch_0
        0x5ab9cba6 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 26

    move-object/from16 v0, p0

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, -0x573a603c

    sget v22, Ll/ۖܽ;->ܳ۠᩹:I

    sget v23, Ll/ۧ;->֫۠ᩴ:I

    const-string v24, "\u06e8\u06d9"

    invoke-static/range {v24 .. v24}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v24

    xor-int v24, v24, v23

    mul-int/lit8 v24, v24, 0x57

    xor-int v1, v24, v22

    mul-int/lit16 v1, v1, -0x3697

    const v25, -0x423dbae5

    xor-int v1, v1, v25

    const v25, 0x45564e13

    xor-int v24, v24, v25

    move-object v3, v2

    move-object v10, v9

    move-object/from16 p1, v13

    move-object/from16 v14, v20

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v9, v8

    move-object v13, v12

    const/4 v12, 0x0

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v0, v21, v22

    mul-int/lit16 v0, v0, 0x6ff9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v1

    xor-int v21, v24, v0

    sparse-switch v21, :sswitch_data_0

    mul-int v17, v20, v16

    move/from16 v0, v20

    add-int/lit16 v1, v0, 0x1c8d

    sget v18, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v18, :cond_b

    move/from16 v20, v0

    move/from16 v18, v1

    goto :goto_1

    .line 227
    :sswitch_0
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    sget v0, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v0, "\u06dc\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x2f35

    const v24, -0x7ea10391

    xor-int v1, v1, v24

    const v24, 0x4a039668    # 2155930.0f

    goto/16 :goto_8

    :sswitch_1
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_4

    :goto_1
    move-object/from16 v0, p1

    goto/16 :goto_9

    :sswitch_2
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v0, Ll/֫;->ܶܺ᩻:I

    if-ltz v0, :cond_d

    goto :goto_1

    .line 1346
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    goto :goto_1

    .line 2196
    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    return-void

    .line 329
    :sswitch_5
    invoke-interface {v10, v11, v12, v9}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 330
    invoke-static {v9}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v11

    invoke-static {v10, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    goto :goto_3

    :sswitch_6
    return-void

    .line 321
    :sswitch_7
    invoke-virtual {v8}, Ll/ܿ۫ۚ;->᩹()Ll/ۗ֫ۖ;

    move-result-object v10

    .line 322
    invoke-static {v10}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v0

    .line 323
    invoke-static {v10}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    if-le v0, v1, :cond_1

    move v12, v0

    move v11, v1

    goto :goto_2

    :cond_1
    move v11, v0

    move v12, v1

    :goto_2
    const-string v0, "\u06dc\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x7563

    const v24, -0x1ed5e3d0

    xor-int v1, v1, v24

    const v24, 0x23849708

    goto/16 :goto_8

    .line 330
    :sswitch_8
    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7eb32fe3

    xor-int/2addr v0, v1

    .line 332
    invoke-static {v0}, Ll/֨ܶ;->ۚۛۢ(I)Ll/ܺۡۜ;

    :goto_3
    const-string v0, "\u06db\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x7223

    const v24, -0x22419997

    xor-int v1, v1, v24

    const v24, -0x4d9491ef

    goto/16 :goto_8

    .line 330
    :sswitch_9
    sget-object v0, Ll/۟ᩳۘ;->֡ۖܽ:[S

    const/4 v1, 0x3

    const/4 v13, 0x3

    invoke-static {v0, v1, v13, v15}, Ll/֨ۧ;->᩻᩵᩵([SIII)Ljava/lang/String;

    move-result-object v13

    .line 1316
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "\u05a1\u0733"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v23, v0

    mul-int/lit8 v0, v0, -0x1d

    xor-int v1, v0, v22

    mul-int/lit8 v1, v1, 0xf

    const v24, -0x28f3bc2b

    xor-int v1, v1, v24

    const v24, 0x108e6a4a

    goto/16 :goto_8

    .line 9
    :sswitch_a
    move-object v8, v2

    check-cast v8, Ll/ܿ۫ۚ;

    .line 319
    invoke-static {}, Ll/ܽܺۘ;->᩹()Ljava/lang/String;

    move-result-object v9

    .line 320
    invoke-static {v9}, Ll/֡ۚ;->۠ܳ۬(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "\u05a8\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x33

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x22f9

    const v24, -0xfd519d9

    xor-int v1, v1, v24

    const v24, -0x6e3c595e

    goto/16 :goto_8

    :cond_3
    const-string v0, "\u1a76\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x2b

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x1ccf

    const v24, 0x8864f14

    xor-int v1, v1, v24

    const v24, 0x6c6f0243

    goto/16 :goto_8

    .line 0
    :sswitch_b
    check-cast v2, Ll/᩵᩹ۚ;

    sget v0, Ll/᩵᩹ۚ;->ۤܰ:I

    .line 107
    invoke-virtual {v2}, Ll/֨ۨ;->getOnBackPressedDispatcher()Ll/ܳۨ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳۨ;->ۙ()V

    return-void

    :sswitch_c
    add-int/lit8 v4, v4, 0x1

    .line 2252
    invoke-virtual {v3, v4}, Landroid/widget/EditText;->setSelection(I)V

    return-void

    .line 2251
    :sswitch_d
    invoke-interface {v6, v4, v5, v7}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 1329
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    :goto_4
    const-string v0, "\u06e0\u06d7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x5

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x43b3

    const v24, -0x518c4746

    xor-int v1, v1, v24

    const v24, -0x30da1145

    goto/16 :goto_8

    :cond_5
    const-string v0, "\u0733\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x65b7

    const v24, -0x322a1847

    xor-int v1, v1, v24

    const v24, -0x3c43120d

    goto/16 :goto_8

    :sswitch_e
    const/4 v0, 0x1

    const/4 v1, 0x2

    .line 2251
    invoke-static {v14, v0, v1, v15}, Ll/֨ۢ;->ۨۡ۠([SIII)Ljava/lang/String;

    move-result-object v7

    .line 1964
    sget v0, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v0, :cond_6

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u06d8\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x141b

    const v24, 0x6d8c6d5a

    xor-int v1, v1, v24

    const v24, 0x504c848f

    goto/16 :goto_8

    .line 2250
    :sswitch_f
    invoke-static {v3}, Ll/ۗ;->۟ۖܶ(Ljava/lang/Object;)Z

    .line 2251
    invoke-static {v3}, Ll/ۗܺ;->֫ᩴ۬(Ljava/lang/Object;)Landroid/text/Editable;

    move-result-object v6

    sget-object v14, Ll/۟ᩳۘ;->֡ۖܽ:[S

    sget v0, Ll/۟;->ۨᩴۛ:I

    if-ltz v0, :cond_7

    goto :goto_5

    :cond_7
    const-string v0, "\u05a8\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x614b

    const v24, 0x7314d194

    xor-int v1, v1, v24

    const v24, -0x4d95d4f1

    goto/16 :goto_8

    .line 2249
    :sswitch_10
    invoke-virtual {v3}, Landroid/widget/TextView;->getSelectionEnd()I

    move-result v5

    .line 1212
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v0

    if-gtz v0, :cond_8

    :goto_5
    const-string v0, "\u06eb\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x7651

    const v24, 0x74a6f4dd

    xor-int v1, v1, v24

    const v24, -0x66db193f

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u1a78\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0xd

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x6e49

    const v24, 0x28db3d5c

    xor-int v1, v1, v24

    const v24, -0x775c3ce1

    goto/16 :goto_8

    .line 0
    :sswitch_11
    move-object v3, v2

    check-cast v3, Landroid/widget/EditText;

    sget v0, Ll/ۙ۠ۘ;->᩻ܰ:I

    .line 2248
    invoke-virtual {v3}, Landroid/widget/TextView;->getSelectionStart()I

    move-result v4

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v0

    if-eqz v0, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v0, "\u073f\u06df"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x19

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x5d8b

    const v24, -0x23c9d92f

    xor-int v1, v1, v24

    const v24, 0x752b24c

    goto/16 :goto_8

    :sswitch_12
    move-object/from16 v0, p0

    .line 2
    iget v1, v0, Ll/۟ᩳۘ;->ܺ:I

    .line 4
    iget-object v2, v0, Ll/۟ᩳۘ;->᩶:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    const-string v0, "\u1a75\u06df"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v23, v0

    mul-int/lit8 v0, v0, 0x5d

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x5781

    const v24, 0x7c4a6878

    xor-int v1, v1, v24

    const v24, -0x131f5a9

    goto/16 :goto_8

    :pswitch_0
    const-string v1, "\u1a76\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v0, v1, v22

    mul-int/lit16 v0, v0, -0x7383

    const v24, -0x759206f7

    xor-int v0, v0, v24

    const v24, 0x760503d1

    goto/16 :goto_a

    :pswitch_1
    const-string v0, "\u06d7\u0733"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x1a25

    const v24, -0x23a3411b

    xor-int v1, v1, v24

    const v24, 0x15bf1c5e

    goto/16 :goto_8

    :sswitch_13
    const v0, 0xc52d

    const v15, 0xc52d

    goto :goto_6

    :sswitch_14
    const v0, 0xaee4

    const v15, 0xaee4

    :goto_6
    const-string v0, "\u06d6\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x29

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x4da3

    const v24, 0x5144508a

    xor-int v1, v1, v24

    const v24, 0x2e440de2

    goto/16 :goto_8

    :sswitch_15
    mul-int v0, v18, v18

    sub-int v0, v0, v17

    if-gez v0, :cond_a

    const-string v0, "\u06da\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x2b

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x41f3

    const v24, -0x211f7ed1

    xor-int v1, v1, v24

    const v24, 0xb4d5fd3

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u1a73\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x2aa5

    const v24, -0x28168316

    xor-int v1, v1, v24

    const v24, -0x68e13593

    goto :goto_8

    :cond_b
    const-string v18, "\u1a73\u06e8"

    invoke-static/range {v18 .. v18}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v23

    move/from16 v20, v0

    xor-int v0, v18, v22

    mul-int/lit16 v0, v0, -0x22cb

    const v24, -0x1ccbdbbe

    xor-int v0, v0, v24

    const v24, 0x3c269df

    xor-int v24, v18, v24

    move/from16 v18, v1

    goto/16 :goto_b

    :sswitch_16
    aget-short v20, p1, v19

    const/16 v16, 0x7234

    .line 1537
    sget v0, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v0, :cond_c

    goto :goto_7

    :cond_c
    const-string v0, "\u0736\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x2b

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x52e5

    const v24, 0x67681ff9

    xor-int v1, v1, v24

    const v24, -0x769b709d

    goto :goto_8

    :sswitch_17
    const/16 v19, 0x0

    sget-boolean v0, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v0, :cond_e

    :cond_d
    :goto_7
    const-string v0, "\u1a75\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x4b5b

    const v24, -0x7fdeb4da

    xor-int v1, v1, v24

    const v24, -0x32a346ee

    goto :goto_8

    :cond_e
    const-string v0, "\u05a1\u06ec"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x694f

    const v24, 0xdce4706

    xor-int v1, v1, v24

    const v24, -0x69394583

    :goto_8
    xor-int v24, v0, v24

    goto/16 :goto_0

    :sswitch_18
    sget-object v0, Ll/۟ᩳۘ;->֡ۖܽ:[S

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v1

    if-gtz v1, :cond_f

    :goto_9
    const-string v1, "\u073f\u1a77"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    move-object/from16 p1, v0

    xor-int v0, v1, v23

    mul-int/lit16 v0, v0, -0x5b3d

    const v24, -0xf68a563

    xor-int v0, v0, v24

    const v24, -0x5ec4d917

    goto :goto_a

    :cond_f
    const-string v1, "\u0733\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x3f

    move-object/from16 p1, v0

    xor-int v0, v1, v23

    mul-int/lit16 v0, v0, 0x69cd

    const v24, 0x1a25aa03

    xor-int v0, v0, v24

    const v24, 0x74b08dad

    :goto_a
    xor-int v24, v1, v24

    :goto_b
    move v1, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7940be66 -> :sswitch_0
        -0x72a28f89 -> :sswitch_15
        -0x7126c69a -> :sswitch_5
        -0x637f4f80 -> :sswitch_5
        -0x62fa0ee7 -> :sswitch_6
        -0x6292b596 -> :sswitch_a
        -0x520f30b1 -> :sswitch_6
        -0x512fc7bc -> :sswitch_2
        -0x50cea5bb -> :sswitch_18
        -0x4ccff0b8 -> :sswitch_17
        -0x4649693b -> :sswitch_12
        -0x45dcf6ee -> :sswitch_18
        -0x446eb769 -> :sswitch_13
        -0x433a509f -> :sswitch_15
        -0x415f5835 -> :sswitch_4
        -0x3deb1d83 -> :sswitch_14
        -0x36fd4e86 -> :sswitch_b
        -0x23d88e40 -> :sswitch_c
        -0x23c4c011 -> :sswitch_9
        -0x22359e2c -> :sswitch_7
        -0x1219f115 -> :sswitch_f
        -0xb1feb06 -> :sswitch_3
        -0xaf84e71 -> :sswitch_1
        -0x660186 -> :sswitch_2
        0x458dec6 -> :sswitch_7
        0x52bb41e -> :sswitch_f
        0x6d0d361 -> :sswitch_16
        0x89cb3df -> :sswitch_1
        0xa24bd58 -> :sswitch_11
        0xd6e6158 -> :sswitch_e
        0x1c3cfcec -> :sswitch_9
        0x2186cc23 -> :sswitch_e
        0x22c372be -> :sswitch_b
        0x28197867 -> :sswitch_14
        0x29c2f37d -> :sswitch_16
        0x4641cfcd -> :sswitch_4
        0x4759ac1e -> :sswitch_d
        0x4b95b097 -> :sswitch_0
        0x4c0d9741 -> :sswitch_8
        0x4f026e82 -> :sswitch_11
        0x4fd71014 -> :sswitch_d
        0x552abc95 -> :sswitch_a
        0x5cd2c838 -> :sswitch_12
        0x5cfdff61 -> :sswitch_c
        0x5f3e0c41 -> :sswitch_10
        0x693851b3 -> :sswitch_10
        0x725b0bda -> :sswitch_3
        0x731430fd -> :sswitch_17
        0x756e3f4b -> :sswitch_8
        0x7befe525 -> :sswitch_13
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

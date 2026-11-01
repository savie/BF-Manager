.class public final synthetic Ll/ۘᩳ᩺;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۜ᩻ۖ:[S


# instance fields
.field public final synthetic ܺ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۘᩳ᩺;->ۜ᩻ۖ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1135s
        -0x3179s
        -0x23c2s
        -0x3f68s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, 0x2db7960b

    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    sget v2, Ll/ۗᩳ;->ۚۤ֡:I

    .line 0
    iput p1, p0, Ll/ۘᩳ᩺;->ܺ:I

    iput-object p2, p0, Ll/ۘᩳ᩺;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u0733\u06e0"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x79

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1c61

    const v3, 0x67698006

    xor-int/2addr p2, v3

    const v3, -0x144828eb

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x4a07

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result p1

    if-ltz p1, :cond_3

    const-string p1, "\u05a8\u1a73"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6c17

    const v3, -0x431fed8a

    xor-int/2addr p2, v3

    const v3, 0x3a2c1888

    goto :goto_0

    :sswitch_0
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    sget p1, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u073f\u0730"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0xb

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x5569

    const v3, 0x7036846b

    xor-int/2addr p2, v3

    const v3, 0x77ee263a

    goto :goto_0

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    sget p1, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "\u1a76\u05a8"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x27

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x7f5f

    const v3, -0x67a4f9a6

    xor-int/2addr p2, v3

    const v3, 0x7ab2a321

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget p1, Ll/֡ۛ;->۬᩸ܶ:I

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "\u06d7\u06e1"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0xfeb

    const v3, -0x62fe41bd

    xor-int/2addr p2, v3

    const v3, 0x2e67400c

    goto :goto_0

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    :goto_2
    const-string p1, "\u073d\u1a74"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x33

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x5ff3

    const v3, -0x39e98c2f

    xor-int/2addr p2, v3

    const v3, 0x449767ff

    goto/16 :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    return-void

    :cond_3
    const-string p1, "\u06e0\u06e7"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x7401

    const v3, -0x7933f326

    xor-int/2addr p2, v3

    const v3, 0x6d6f88e4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x5bd3df04 -> :sswitch_0
        -0x4b85cde4 -> :sswitch_3
        -0x3419a560 -> :sswitch_0
        -0x1d6258a6 -> :sswitch_4
        -0xc905aa4 -> :sswitch_5
        0x21ff2dcb -> :sswitch_2
        0x22916ad9 -> :sswitch_4
        0x40778ad0 -> :sswitch_5
        0x5a357471 -> :sswitch_1
        0x5e569c08 -> :sswitch_3
        0x677a4cf6 -> :sswitch_1
        0x681004d6 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 21

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

    const v15, -0x3f9e24be

    sget v16, Ll/֡᩶;->ۗ֨ܺ:I

    sget v17, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v18, "\u1a7a\u06d9"

    invoke-static/range {v18 .. v18}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v18

    sub-int v18, v16, v18

    mul-int/lit8 v18, v18, 0x23

    xor-int v1, v18, v17

    mul-int/lit16 v1, v1, 0x3237

    const v20, 0x53f4555e

    xor-int v1, v1, v20

    const v20, 0xaae65ed

    xor-int v18, v18, v20

    move-object/from16 v20, v4

    move-object v13, v12

    move/from16 v19, v18

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, -0x3f9e24be

    :goto_0
    xor-int v5, v18, v17

    mul-int/lit16 v5, v5, 0x5805

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v18, v19, v1

    sparse-switch v18, :sswitch_data_0

    .line 17
    invoke-static {v13, v14, v15, v12}, Ll/ۘۧ;->ܿܶ֫([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    const v4, 0x7d2e6056

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v1, :cond_0

    goto/16 :goto_4

    :sswitch_0
    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v1, :cond_c

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v1, :cond_7

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v1

    if-gtz v1, :cond_1

    goto/16 :goto_5

    .line 150
    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    goto/16 :goto_5

    .line 240
    :sswitch_4
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    return-void

    .line 7
    :sswitch_5
    iget-object v1, v0, Ll/ۘᩳ᩺;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v1, Ll/۫۠᩺;

    .line 12
    invoke-static {v1}, Ll/۫۠᩺;->ۨ(Ll/۫۠᩺;)V

    return-void

    :sswitch_6
    xor-int v1, v3, v4

    .line 335
    invoke-virtual {v2, v1}, Landroid/view/Window;->setWindowAnimations(I)V

    return-void

    :cond_0
    const-string v1, "\u05ab\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x477

    const v19, -0x7e10f32

    xor-int v5, v5, v19

    const v19, 0x20a1f085

    goto/16 :goto_7

    :sswitch_7
    const/4 v14, 0x1

    const/4 v15, 0x3

    .line 177
    sget-boolean v1, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v1, :cond_2

    :cond_1
    :goto_1
    const-string v1, "\u0730\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x37db

    const v19, -0x40c1e840

    xor-int v5, v5, v19

    const v19, -0x6c95ed53

    goto/16 :goto_7

    :cond_2
    const-string v1, "\u1a79\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x7f

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x1a41

    const v19, 0x5f80f4ef

    xor-int v5, v5, v19

    const v19, 0x30cc0939

    goto/16 :goto_7

    .line 17
    :sswitch_8
    sget-object v13, Ll/ۘᩳ᩺;->ۜ᩻ۖ:[S

    .line 85
    sget-boolean v1, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u06ec\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x39

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x1d2b

    const v19, -0x40a5dd49

    xor-int v5, v5, v19

    const v19, -0x79231147

    goto/16 :goto_7

    .line 15
    :sswitch_9
    iget-object v1, v0, Ll/ۘᩳ᩺;->᩶:Ljava/lang/Object;

    .line 17
    move-object v2, v1

    check-cast v2, Landroid/view/Window;

    .line 232
    sget v1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u06d8\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x7d

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x611f

    const v19, 0xb873823

    xor-int v5, v5, v19

    const v19, -0x41e95444

    goto/16 :goto_7

    .line 2
    :sswitch_a
    iget v1, v0, Ll/ۘᩳ᩺;->ܺ:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "\u06da\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x39

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x59e9

    const v19, -0x524d0ae7

    xor-int v5, v5, v19

    const v19, 0x665ae5ff

    goto/16 :goto_7

    :pswitch_0
    const-string v1, "\u06dc\u05ab"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x7e3d

    const v19, -0x4d67e97b

    xor-int v5, v5, v19

    const v19, 0x1a1c8e7d

    goto/16 :goto_7

    :sswitch_b
    const v1, 0x8ab8

    const v12, 0x8ab8

    goto :goto_2

    :sswitch_c
    const/16 v1, 0x5ab9

    const/16 v12, 0x5ab9

    :goto_2
    const-string v1, "\u05ab\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x2f

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x5091

    const v19, -0x1376dcc2

    xor-int v5, v5, v19

    const v19, 0x56cd7be9

    goto/16 :goto_7

    :sswitch_d
    add-int/lit8 v1, v11, 0x1

    sub-int/2addr v1, v9

    if-gtz v1, :cond_5

    const-string v1, "\u06d7\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0xe65

    const v19, -0x320f1207

    xor-int v5, v5, v19

    const v19, 0x72719d7d

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u06da\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x53

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x5f61

    const v19, 0xd359263

    xor-int v5, v5, v19

    const v19, -0x1d95e266

    goto/16 :goto_7

    :sswitch_e
    mul-int v11, v7, v10

    .line 165
    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v1, :cond_6

    goto :goto_4

    :cond_6
    const-string v1, "\u1a7a\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x56bb

    const v19, 0x19bd6ddb

    xor-int v5, v5, v19

    const v19, 0x40031b9c

    goto/16 :goto_7

    :sswitch_f
    mul-int v9, v8, v8

    const/4 v10, 0x2

    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v1, :cond_8

    :cond_7
    :goto_3
    const-string v1, "\u1a7a\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x7ecf

    const v19, 0x686f90c8

    xor-int v5, v5, v19

    const v19, 0x38b522c

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u073d\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x3cf3

    const v19, -0x388cd555

    xor-int v5, v5, v19

    const v19, -0x2ef17eff

    goto/16 :goto_7

    :sswitch_10
    add-int/lit8 v8, v7, 0x1

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v1, :cond_9

    :goto_4
    const-string v1, "\u06d6\u06eb"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x1d

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x2d87

    const v19, 0x41b47eda

    xor-int v5, v5, v19

    const v19, -0x4001b39a

    goto/16 :goto_7

    :cond_9
    const-string v1, "\u06db\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x6469

    const v19, -0x418d5887

    xor-int v5, v5, v19

    const v19, 0x37da49e0

    goto/16 :goto_7

    :sswitch_11
    aget-short v7, v20, v6

    .line 273
    sget v1, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v1, :cond_a

    :goto_5
    const-string v1, "\u06d6\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x4ef3

    const v19, 0x420fdf3e

    xor-int v5, v5, v19

    const v19, 0x1620a119

    goto :goto_7

    :cond_a
    const-string v1, "\u06eb\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x3b

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x2315

    const v19, -0x6a71b88c

    xor-int v5, v5, v19

    const v19, -0x7f640534

    goto :goto_7

    :sswitch_12
    const/4 v6, 0x0

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_6

    :cond_b
    const-string v1, "\u1a77\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x3b

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x5285

    const v19, -0x40647463

    xor-int v5, v5, v19

    const v19, 0x3f3942c4

    goto :goto_7

    :sswitch_13
    sget-object v20, Ll/ۘᩳ᩺;->ۜ᩻ۖ:[S

    .line 310
    sget v1, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v1, :cond_d

    :cond_c
    :goto_6
    const-string v1, "\u1a75\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x5281

    const v19, -0x6ee281a1

    xor-int v5, v5, v19

    const v19, 0x6c4252ab

    goto :goto_7

    :cond_d
    const-string v1, "\u05a8\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x1877

    const v19, -0x34c90e00    # -1.1989504E7f

    xor-int v5, v5, v19

    const v19, -0xcc0952d

    :goto_7
    xor-int v19, v1, v19

    move v1, v5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7738de12 -> :sswitch_11
        -0x56259ccd -> :sswitch_f
        -0x5289fe1e -> :sswitch_13
        -0x485687a9 -> :sswitch_10
        -0x453f30a9 -> :sswitch_11
        -0x415e4851 -> :sswitch_6
        -0x328e1a04 -> :sswitch_c
        -0x17980d39 -> :sswitch_2
        -0x138e49de -> :sswitch_c
        -0xe1275f0 -> :sswitch_d
        -0xdbe678b -> :sswitch_1
        -0x43757ac -> :sswitch_e
        0x54fab11 -> :sswitch_4
        0x5f60d17 -> :sswitch_10
        0x97384f6 -> :sswitch_9
        0xd6a1a56 -> :sswitch_3
        0xf91df33 -> :sswitch_a
        0x10e7beed -> :sswitch_2
        0x18bdc49a -> :sswitch_4
        0x22f7053e -> :sswitch_b
        0x28c9b4db -> :sswitch_f
        0x2a970983 -> :sswitch_7
        0x3266bd9b -> :sswitch_0
        0x35c0c454 -> :sswitch_5
        0x3b8010c3 -> :sswitch_6
        0x4446dc6c -> :sswitch_13
        0x485e0ade -> :sswitch_5
        0x4b88748d -> :sswitch_3
        0x4f0e971e -> :sswitch_e
        0x516c7a49 -> :sswitch_b
        0x536f8467 -> :sswitch_d
        0x54c0626f -> :sswitch_a
        0x61e4f263 -> :sswitch_7
        0x67fd813d -> :sswitch_8
        0x6ab9e117 -> :sswitch_9
        0x6cfb169f -> :sswitch_12
        0x6d3f2d28 -> :sswitch_12
        0x73c2c3cd -> :sswitch_0
        0x7b6b35bb -> :sswitch_8
        0x7f7662cc -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

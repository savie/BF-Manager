.class public Ll/᩷ܰۘ;
.super Ll/۫ܶۘ;
.source "J2RL"


# static fields
.field public static final synthetic ۚܰ:I

.field private static final ᩴۗ۟:[S


# instance fields
.field public ۖܰ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x39

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩷ܰۘ;->ᩴۗ۟:[S

    return-void

    :array_0
    .array-data 2
        0x12b2s
        -0x485es
        0x4cf1s
        0x5ccfs
        0x57b0s
        0x482es
        0x5132s
        -0x5775s
        0x48efs
        0x4a45s
        -0x7d03s
        0x54f3s
        -0x6b4es
        -0x33efs
        -0x33f0s
        -0x33fds
        -0x33f0s
        -0x33e7s
        -0x33e6s
        -0x33fbs
        -0x33f0s
        -0x33f9s
        -0x33dbs
        -0x33e7s
        -0x3400s
        -0x33ees
        -0x33e4s
        -0x33e5s
        -0x33c4s
        -0x33efs
        -0x33fas
        0x1dd5s
        -0x3c8fs
        -0x3cb0s
        -0x3cbds
        -0x3cb0s
        -0x3ca7s
        -0x3ca6s
        -0x3cbbs
        -0x3cb0s
        -0x3cb9s
        -0x3c9as
        -0x3cb0s
        -0x3ca7s
        -0x3cb0s
        -0x3caas
        -0x3cbfs
        -0x3ca6s
        -0x3cb9s
        -0x3c8cs
        -0x3caas
        -0x3cbfs
        -0x3ca4s
        -0x3cbds
        -0x3ca4s
        -0x3cbfs
        -0x3cb4s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ll/۫ܶۘ;-><init>()V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩷ܰۘ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ܰۘ;->ۖܰ:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 27

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

    const v20, -0x6fe52729

    sget v21, Ll/֨ܶ;->ۛۛۛ:I

    sget v22, Ll/ۖ᩸;->ۨܽ۬:I

    const-string v23, "\u06e8\u1a78"

    invoke-static/range {v23 .. v23}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v23

    add-int v23, v23, v21

    mul-int/lit8 v23, v23, 0x2f

    xor-int v1, v23, v22

    mul-int/lit16 v1, v1, 0x6b4f

    const v25, 0x16471c7c

    xor-int v1, v1, v25

    const v25, -0x1016c3fa

    xor-int v23, v23, v25

    move-object v5, v4

    move-object/from16 v20, v13

    move-object/from16 v11, v16

    move-object/from16 v10, v18

    move/from16 v24, v23

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v23, -0x6fe52729

    const/16 v25, 0x0

    move-object v4, v3

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v15, v23, v22

    mul-int/lit16 v15, v15, 0x3e7b

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v23, v24, v1

    sparse-switch v23, :sswitch_data_0

    .line 47
    invoke-static/range {p0 .. p0}, Ll/۟;->ۤۨܺ(Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object v1

    sget-object v5, Ll/᩷ܰۘ;->ᩴۗ۟:[S

    const/16 v15, 0xd

    move-object/from16 v24, v4

    const/16 v4, 0x12

    invoke-static {v5, v15, v4, v13}, Ll/ۧ;->۫֨۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/util/ArrayList;

    .line 32
    sget v1, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v1, :cond_3

    goto/16 :goto_2

    .line 25
    :sswitch_0
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    if-lez v1, :cond_1

    :cond_0
    move-object/from16 v24, v4

    move/from16 v0, v16

    move/from16 v15, v19

    move-object/from16 v19, v20

    move/from16 v4, v25

    move-object/from16 v16, v2

    goto/16 :goto_c

    :cond_1
    move-object/from16 v24, v4

    goto/16 :goto_7

    .line 7
    :sswitch_1
    sget v1, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v1, :cond_2

    goto/16 :goto_4

    :cond_2
    move-object/from16 v24, v4

    move/from16 v15, v19

    move-object/from16 v1, v20

    move/from16 v4, v25

    goto/16 :goto_6

    .line 31
    :sswitch_2
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v1, :cond_0

    goto/16 :goto_4

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    return-void

    .line 49
    :sswitch_5
    invoke-static {v5}, Ll/ܿۚۘ;->ܰ(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Ll/᩷ܰۘ;->ۖܰ:Ljava/util/List;

    .line 50
    new-instance v1, Ll/ۡܰۘ;

    invoke-direct {v1, v0}, Ll/ۡܰۘ;-><init>(Ll/᩷ܰۘ;)V

    invoke-static {v4, v1}, Ll/֨ۖ;->ۜۜۛ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 52
    sput-boolean v1, Ll/ۨܰۘ;->᩺ܰ:Z

    return-void

    :cond_3
    const-string v1, "\u06d7\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x3219

    const v15, -0x15af44d5

    xor-int/2addr v4, v15

    const v15, -0x6b32f389

    goto/16 :goto_5

    :sswitch_6
    const/4 v1, 0x3

    .line 42
    invoke-static {v10, v14, v1, v13}, Ll/֫ܳ;->᩵ۘ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    const v4, 0x7e33990f

    xor-int/2addr v1, v4

    .line 44
    invoke-static {v0, v1}, Ll/ۖۛ;->᩵ۖ۠(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ll/᩸ۜ᩺;

    .line 41
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v1

    if-gtz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u1a74\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x1c39

    const v24, -0x250d1c7

    xor-int v15, v15, v24

    const v24, 0x43d8eb06

    :goto_1
    xor-int v24, v1, v24

    move v1, v15

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v24, v4

    .line 42
    invoke-static {v2, v3}, Ll/ۗᩳ;->֫ۡᩳ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v10, Ll/᩷ܰۘ;->ᩴۗ۟:[S

    const/16 v14, 0xa

    .line 17
    sget-boolean v1, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v1, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v1, "\u06e4\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x5961

    const v15, -0x5ccbd8eb

    xor-int/2addr v4, v15

    const v15, -0x60687b03

    goto/16 :goto_5

    :sswitch_8
    move-object/from16 v24, v4

    .line 41
    invoke-static/range {p0 .. p0}, Ll/֫ܽ;->֨᩻֡(Ljava/lang/Object;)V

    .line 42
    iget-object v2, v0, Ll/۫ܶۘ;->᩻ۙ:Ll/ۜᩴ;

    new-instance v3, Ll/ܳ᩸᩹;

    const/4 v1, 0x3

    invoke-direct {v3, v1, v0}, Ll/ܳ᩸᩹;-><init>(ILjava/lang/Object;)V

    const-string v1, "\u06db\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x5207

    const v15, -0x138a6370

    xor-int/2addr v4, v15

    const v15, 0x4069b40a

    goto/16 :goto_5

    :sswitch_9
    move-object/from16 v24, v4

    const v1, 0x7e81b46e

    xor-int/2addr v1, v9

    .line 38
    invoke-static {v0, v1}, Ll/֡ۚ;->۬֡ۜ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۜᩴ;

    iput-object v1, v0, Ll/۫ܶۘ;->᩻ۙ:Ll/ۜᩴ;

    .line 39
    invoke-static {v0, v1}, Ll/֡۠;->ۧ֫ۘ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    sget-boolean v1, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    const-string v1, "\u073d\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x35c3

    const v15, -0x3e6f2036

    xor-int/2addr v4, v15

    const v15, 0x3b0b67e0

    goto/16 :goto_5

    :sswitch_a
    move-object/from16 v24, v4

    const/4 v1, 0x3

    .line 37
    invoke-static {v11, v12, v1, v13}, Ll/֡ܳ;->ܶۘۙ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    .line 19
    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v1, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "\u073f\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x5

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x557d

    const v15, -0x5e171221

    xor-int/2addr v4, v15

    const v15, -0x1b9f0c67

    goto/16 :goto_5

    :sswitch_b
    move-object/from16 v24, v4

    const v1, 0x7d4b6512

    xor-int/2addr v1, v8

    .line 37
    invoke-static {v0, v1}, Ll/ۖۛ;->᩵ۖ۠(Ljava/lang/Object;I)Landroid/view/View;

    sget-object v11, Ll/᩷ܰۘ;->ᩴۗ۟:[S

    const/4 v12, 0x7

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v1, :cond_8

    :goto_2
    const-string v1, "\u1a7b\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, -0x3d

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x7c93

    const v15, 0x7c06cb37

    xor-int/2addr v4, v15

    const v15, 0xb1723e9

    goto :goto_5

    :cond_8
    const-string v1, "\u05ab\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x3917

    const v15, 0x14af553b

    xor-int/2addr v4, v15

    const v15, 0x1739c497

    goto :goto_5

    :sswitch_c
    move-object/from16 v24, v4

    xor-int v1, v6, v7

    .line 36
    invoke-static {v0, v1}, Ll/֡ۚ;->۬֡ۜ(Ljava/lang/Object;I)Landroid/view/View;

    sget-object v1, Ll/᩷ܰۘ;->ᩴۗ۟:[S

    const/4 v4, 0x4

    const/4 v8, 0x3

    invoke-static {v1, v4, v8, v13}, Ll/֫᩺;->ܰܶ֨([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v1

    if-nez v1, :cond_9

    :goto_3
    move-object/from16 v4, v24

    :goto_4
    const-string v1, "\u06d6\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x947

    const v24, 0x1398f5d6

    xor-int v15, v15, v24

    const v24, 0x57e63bb3

    goto/16 :goto_1

    :cond_9
    const-string v1, "\u073a\u06d8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x3ba3

    const v15, 0x6650d207

    xor-int/2addr v4, v15

    const v15, 0x3edde48

    :goto_5
    xor-int/2addr v1, v15

    move-object/from16 v26, v24

    move/from16 v24, v1

    move v1, v4

    move-object/from16 v4, v26

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v24, v4

    move/from16 v15, v19

    move-object/from16 v1, v20

    move/from16 v4, v25

    .line 35
    invoke-static {v1, v4, v15, v13}, Ll/֨ܶ;->ۢ֡᩷([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    .line 18
    sget v19, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v19, :cond_a

    const v7, 0x7eec0280

    :goto_6
    const-string v19, "\u05ab\u073f"

    invoke-static/range {v19 .. v19}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v22

    xor-int v0, v19, v21

    mul-int/lit16 v0, v0, -0x2e71

    const v20, 0x12d0200

    xor-int v0, v0, v20

    const v20, -0x5b092d0d

    xor-int v19, v19, v20

    move-object/from16 v20, v1

    move/from16 v25, v4

    move-object/from16 v4, v24

    move v1, v0

    move/from16 v24, v19

    move-object/from16 v0, p0

    move/from16 v19, v15

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06eb\u1a78"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v7, v0, v22

    mul-int/lit16 v7, v7, 0x7521

    const v20, 0x77a66ade

    xor-int v7, v7, v20

    const v20, 0x5e505427

    xor-int v0, v0, v20

    move-object/from16 v20, v1

    move/from16 v25, v4

    move v1, v7

    move/from16 v19, v15

    move-object/from16 v4, v24

    const v7, 0x7eec0280

    goto :goto_9

    :sswitch_e
    move-object/from16 v24, v4

    .line 34
    invoke-super/range {p0 .. p1}, Ll/۫ܶۘ;->onCreate(Landroid/os/Bundle;)V

    .line 35
    invoke-virtual/range {p0 .. p0}, Ll/۫ܶۘ;->᩵()V

    sget-object v20, Ll/᩷ܰۘ;->ᩴۗ۟:[S

    const/16 v25, 0x1

    const/16 v19, 0x3

    .line 44
    sget v0, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v0, :cond_b

    :goto_7
    const-string v0, "\u073f\u06da"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x18f7

    const v4, 0x33f65741

    xor-int/2addr v1, v4

    const v4, -0x3cf4e775

    goto :goto_8

    :cond_b
    const-string v0, "\u06df\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x49

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x2f57

    const v4, -0x719fc903

    xor-int/2addr v1, v4

    const v4, -0x56b6645d

    :goto_8
    xor-int/2addr v0, v4

    move-object/from16 v4, v24

    :goto_9
    move/from16 v24, v0

    goto/16 :goto_e

    :sswitch_f
    move-object/from16 v24, v4

    move/from16 v15, v19

    move-object/from16 v1, v20

    move/from16 v4, v25

    const v0, 0xeb3d

    const v13, 0xeb3d

    goto :goto_a

    :sswitch_10
    move-object/from16 v24, v4

    move/from16 v15, v19

    move-object/from16 v1, v20

    move/from16 v4, v25

    const v0, 0xcc75

    const v13, 0xcc75

    :goto_a
    const-string v0, "\u05a1\u06d7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x5f

    move-object/from16 v19, v1

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x1755

    const v20, 0x470b1810    # 35608.062f

    xor-int v1, v1, v20

    const v20, 0x26b0ae00

    xor-int v0, v0, v20

    move/from16 v25, v4

    move-object/from16 v20, v19

    move-object/from16 v4, v24

    move/from16 v24, v0

    move/from16 v19, v15

    goto/16 :goto_e

    :sswitch_11
    move-object/from16 v24, v4

    move/from16 v15, v19

    move-object/from16 v19, v20

    move/from16 v4, v25

    add-int v0, v17, v18

    add-int/2addr v0, v0

    move/from16 v1, v16

    move-object/from16 v16, v2

    add-int/lit16 v2, v1, 0x34ef

    mul-int v2, v2, v2

    sub-int/2addr v0, v2

    if-ltz v0, :cond_c

    const-string v0, "\u1a78\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x79

    xor-int v2, v0, v22

    mul-int/lit16 v2, v2, -0x71ad

    const v20, -0x7fca1257

    xor-int v2, v2, v20

    const v20, -0x2bd32a90

    :goto_b
    xor-int v0, v0, v20

    move/from16 v25, v4

    move-object/from16 v20, v19

    move-object/from16 v4, v24

    move/from16 v24, v0

    move/from16 v19, v15

    move-object/from16 v0, p0

    move-object/from16 v26, v16

    move/from16 v16, v1

    move v1, v2

    move-object/from16 v2, v26

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u06d7\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x5

    xor-int v2, v0, v21

    mul-int/lit16 v2, v2, -0x1c83

    const v20, 0x41a0d946

    xor-int v2, v2, v20

    const v20, 0x1ddb8798

    goto :goto_b

    :sswitch_12
    move-object/from16 v16, v2

    move-object/from16 v24, v4

    move/from16 v15, v19

    move-object/from16 v19, v20

    move/from16 v4, v25

    sget-object v0, Ll/᩷ܰۘ;->ᩴۗ۟:[S

    const/4 v1, 0x0

    aget-short v0, v0, v1

    mul-int v17, v0, v0

    const v18, 0xaf1f721

    .line 32
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v1

    if-nez v1, :cond_d

    :goto_c
    const-string v1, "\u073a\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x25

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x7ee3

    const v20, 0x4beb18b2    # 3.0814564E7f

    xor-int v2, v2, v20

    const v20, -0x2a0097f

    goto :goto_d

    :cond_d
    const-string v1, "\u1a73\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, -0xf

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, -0x6eef

    const v20, -0x658673f9

    xor-int v2, v2, v20

    const v20, 0x37166453

    :goto_d
    xor-int v1, v1, v20

    move/from16 v25, v4

    move-object/from16 v20, v19

    move-object/from16 v4, v24

    move/from16 v24, v1

    move v1, v2

    move/from16 v19, v15

    move-object/from16 v2, v16

    move/from16 v16, v0

    :goto_e
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7df7f454 -> :sswitch_4
        -0x70b0e6c7 -> :sswitch_e
        -0x6b1a241b -> :sswitch_11
        -0x56922627 -> :sswitch_d
        -0x4ce07ddb -> :sswitch_5
        -0x4cb2ba3f -> :sswitch_1
        -0x48da9ef4 -> :sswitch_7
        -0x4102d5dc -> :sswitch_0
        -0x3ac39e6b -> :sswitch_10
        -0x388b62da -> :sswitch_3
        -0x3215f911 -> :sswitch_8
        -0x30755b3f -> :sswitch_f
        -0x2ac22fef -> :sswitch_9
        -0x29fc2dc0 -> :sswitch_b
        -0x2970b52c -> :sswitch_9
        -0x2273a74b -> :sswitch_10
        -0x19164ffe -> :sswitch_12
        -0x13c7d6f4 -> :sswitch_b
        -0x111a94ce -> :sswitch_8
        -0xea94646 -> :sswitch_a
        -0x8f09db1 -> :sswitch_f
        -0x8d174b4 -> :sswitch_2
        0x970a872 -> :sswitch_e
        0x2644d504 -> :sswitch_1
        0x2e161efb -> :sswitch_c
        0x302fe0c4 -> :sswitch_7
        0x3251476f -> :sswitch_c
        0x34f8a850 -> :sswitch_0
        0x4026d07a -> :sswitch_11
        0x41233c4b -> :sswitch_5
        0x4a79b25e -> :sswitch_6
        0x4b0e6fe5 -> :sswitch_6
        0x4f090eb8 -> :sswitch_4
        0x566ac967 -> :sswitch_d
        0x5d48e0a7 -> :sswitch_3
        0x677fc829 -> :sswitch_a
        0x71188ed1 -> :sswitch_2
        0x72c16569 -> :sswitch_12
    .end sparse-switch
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x3fd6ff9

    sget v11, Ll/֫ܽ;->֡ᩴܶ:I

    sget v12, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v13, "\u1a77\u06e4"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x29

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x677f

    const v15, 0x5acf0ee0

    xor-int/2addr v14, v15

    const v15, -0x70aab78

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x2f61

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    const/16 v0, 0x19

    invoke-static {v8, v9, v0, v7}, Ll/֨֫;->ܺᩴܳ([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget-boolean v13, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v13, :cond_0

    goto/16 :goto_4

    .line 1
    :sswitch_1
    sget v13, Ll/ۘۧ;->ܳ᩷᩸:I

    if-lez v13, :cond_9

    goto/16 :goto_5

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    sget v13, Ll/ۖܽ;->ܳ۠᩹:I

    if-lez v13, :cond_c

    goto/16 :goto_2

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    goto/16 :goto_2

    .line 2
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    const/4 v0, 0x0

    return-object v0

    .line 0
    :sswitch_5
    sget-object v8, Ll/᩷ܰۘ;->ᩴۗ۟:[S

    const/16 v9, 0x20

    .line 1
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v13

    if-gtz v13, :cond_1

    :cond_0
    const-string v13, "\u1a77\u06ec"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x59

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x566d

    const v15, -0x2346edcc

    xor-int/2addr v14, v15

    const v15, -0x7d61c409

    goto :goto_0

    :cond_1
    const-string v13, "\u06e2\u0733"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x1b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x420d

    const v15, 0x1ba841d

    xor-int/2addr v14, v15

    const v15, -0x1b2d17d9

    goto :goto_0

    :sswitch_6
    const/16 v7, 0x2156

    goto :goto_1

    :sswitch_7
    const v7, 0xc335

    :goto_1
    const-string v13, "\u06df\u06db"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x17

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x28f3

    const v15, 0x46ddc16c

    xor-int/2addr v14, v15

    const v15, 0x3f3642a2

    goto/16 :goto_0

    :sswitch_8
    add-int v13, v2, v6

    mul-int v13, v13, v13

    sub-int v13, v5, v13

    if-ltz v13, :cond_2

    const-string v13, "\u06e7\u06da"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit8 v14, v14, -0x13

    const v15, 0x2be96f44

    xor-int/2addr v14, v15

    const v15, -0x52c319f5

    goto/16 :goto_0

    :cond_2
    const-string v13, "\u05a1\u06d9"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x7b37

    const v15, -0x5a1417bb

    xor-int/2addr v14, v15

    const v15, -0x2e4324c

    goto/16 :goto_0

    :sswitch_9
    const/16 v6, 0x21a4

    sget-boolean v13, Ll/᩶;->ۚۤۘ:Z

    if-eqz v13, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v13, "\u06e4\u0733"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x45

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5a43

    const v15, -0x3036353a

    xor-int/2addr v14, v15

    const v15, 0x17f3bd33

    goto/16 :goto_0

    :sswitch_a
    add-int v5, v3, v4

    add-int/2addr v5, v5

    .line 4
    sget-boolean v13, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v13, :cond_4

    goto :goto_2

    :cond_4
    const-string v13, "\u06e1\u0730"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3c5d

    const v15, 0x66827f56

    xor-int/2addr v14, v15

    const v15, 0x1c69b09e

    goto/16 :goto_0

    :sswitch_b
    mul-int v3, v2, v2

    const v4, 0x46bb110

    .line 2
    sget v13, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v13, :cond_5

    goto :goto_3

    :cond_5
    const-string v13, "\u06d9\u0730"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xfbd

    const v15, -0x7f16690a

    xor-int/2addr v14, v15

    const v15, -0x581baad9

    goto/16 :goto_0

    :sswitch_c
    aget-short v2, v0, v1

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v13

    if-eqz v13, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v13, "\u06e4\u06e1"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x2d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x8d7

    const v15, 0x508b5f73

    xor-int/2addr v14, v15

    const v15, 0x7c5dcdb0

    goto/16 :goto_0

    :sswitch_d
    const/16 v1, 0x1f

    .line 0
    sget v13, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v13, :cond_7

    :goto_2
    const-string v13, "\u1a76\u0733"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x3f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x55f3

    const v15, 0x65c0bdb

    xor-int/2addr v14, v15

    const v15, 0x31c41ea5

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u06e1\u1a77"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x58b3

    const v15, 0x68c15963    # 7.304525E24f

    xor-int/2addr v14, v15

    const v15, 0x3ad7e436

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget v13, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v13, :cond_8

    :goto_3
    const-string v13, "\u06dc\u06d7"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5863

    const v15, -0x15326eb7

    xor-int/2addr v14, v15

    const v15, -0x5bfbcb02

    goto/16 :goto_0

    :cond_8
    const-string v13, "\u1a77\u05a1"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x5409

    const v15, 0x6c815c57    # 1.2511E27f

    xor-int/2addr v14, v15

    const v15, -0x6ac8387a

    goto/16 :goto_0

    .line 4
    :sswitch_f
    sget v13, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v13, :cond_a

    :cond_9
    :goto_4
    const-string v13, "\u06da\u0736"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x23

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3bd3

    const v15, -0xbd01e3f

    xor-int/2addr v14, v15

    const v15, 0x491853c6    # 623932.4f

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u06df\u06da"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x47

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x74ff

    const v15, -0x2ee6ac54

    xor-int/2addr v14, v15

    const v15, 0x606acf15

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v13, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v13, :cond_b

    goto :goto_5

    :cond_b
    const-string v13, "\u1a73\u06e7"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x65

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x122d

    const v15, -0x569a7fb3

    xor-int/2addr v14, v15

    const v15, -0x6803610d

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/᩷ܰۘ;->ᩴۗ۟:[S

    .line 2
    sget v13, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v13, :cond_d

    :cond_c
    :goto_5
    const-string v13, "\u073d\u073a"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x59

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x4b9d

    const v15, -0xa0b8e59

    xor-int/2addr v14, v15

    const v15, -0x27259822

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u0736\u05a1"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3745

    const v15, -0x624c87ae

    xor-int/2addr v14, v15

    const v15, -0x423ea47c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f6a9243 -> :sswitch_0
        -0x7999f0af -> :sswitch_5
        -0x77bdf2fe -> :sswitch_7
        -0x7760cf60 -> :sswitch_1
        -0x6dcfe7da -> :sswitch_1
        -0x619c605b -> :sswitch_8
        -0x5e794daf -> :sswitch_f
        -0x55b00363 -> :sswitch_6
        -0x47b7029c -> :sswitch_10
        -0x3fe350f5 -> :sswitch_a
        -0x3bc297c3 -> :sswitch_c
        -0x3956d798 -> :sswitch_11
        -0x2e948113 -> :sswitch_c
        -0x2e14687f -> :sswitch_3
        -0x2d9d69ed -> :sswitch_d
        -0x2c1b23ca -> :sswitch_b
        -0x290d42cc -> :sswitch_4
        -0x1abaf22c -> :sswitch_e
        -0x19848ffb -> :sswitch_9
        -0x14ab3d17 -> :sswitch_b
        -0x659bb54 -> :sswitch_e
        0x4255cd2 -> :sswitch_7
        0x16a70d81 -> :sswitch_6
        0x19329a81 -> :sswitch_f
        0x21de7eb2 -> :sswitch_11
        0x35e89733 -> :sswitch_4
        0x39175b2b -> :sswitch_9
        0x42cfb38c -> :sswitch_3
        0x4c58fb3d -> :sswitch_a
        0x4fb89ae8 -> :sswitch_0
        0x567dcbc2 -> :sswitch_10
        0x5b99e07f -> :sswitch_8
        0x61750170 -> :sswitch_5
        0x6a3ed541 -> :sswitch_2
        0x73be5455 -> :sswitch_2
        0x7e8888e1 -> :sswitch_d
    .end sparse-switch
.end method

.class public Ll/ۛ᩺ۘ;
.super Ll/۫ܶۘ;
.source "N5YQ"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/content/ServiceConnection;


# static fields
.field private static final ᩴ᩸ۡ:[S


# instance fields
.field public ֨ܰ:Z

.field public ۖܰ:Ll/ܶ᩸ۖ;

.field public ۚܰ:Ll/۫᩺ۘ;

.field public ۬ܰ:J

.field public ᩹ܰ:Ll/᩺᩸ۖ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x46

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    return-void

    :array_0
    .array-data 2
        0x2eds
        0x7335s
        0x5de5s
        0x7f7bs
        -0x5d40s
        0x7745s
        -0x45e1s
        0x48a4s
        -0x40c7s
        -0x4be0s
        0x8fcs
        -0xf19s
        0xbs
        0xdc6s
        0x1022s
        0x869s
        0x169ds
        -0x12f2s
        -0x1825s
        -0x1990s
        0x117as
        -0x1593s
        0x27bs
        -0x10d8s
        -0x184s
        -0x207fs
        -0x14dcs
        -0x195es
        -0x20b1s
        -0x14efs
        -0x1c4es
        -0x1723s
        -0xfc3s
        -0xe5cs
        0x320s
        -0xaa0s
        -0x22b3s
        -0x6b7s
        -0x1c42s
        -0x1855s
        0x34bs
        0x160as
        0x3e3bs
        -0x19a2s
        -0x71cs
        -0x73fs
        0x338ds
        0x1eabs
        0x81fs
        0x7b91s
        -0x7ebes
        -0x735es
        0x1c93s
        -0x6efcs
        -0x6ec9s
        -0x6ecas
        -0x6edas
        -0x6eecs
        -0x6ed0s
        -0x6ee0s
        -0x6ec9s
        -0x6ec4s
        -0x6efcs
        -0x6edas
        -0x6ecfs
        -0x6ed4s
        -0x6ecds
        -0x6ed4s
        -0x6ecfs
        -0x6ec4s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ll/۫ܶۘ;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Ll/ۛ᩺ۘ;->֨ܰ:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 28

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

    const v19, -0x32142159

    sget v20, Ll/֫۟;->᩸ᩴܿ:I

    sget v21, Ll/ۗ;->֨۬ۖ:I

    const-string v22, "\u05a8\u06d7"

    invoke-static/range {v22 .. v22}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v20

    mul-int/lit8 v22, v22, -0x4d

    xor-int v1, v22, v21

    mul-int/lit16 v1, v1, -0x49e7

    const v24, -0x4bfa3b73    # -1.2458095E-7f

    xor-int v1, v1, v24

    const v24, -0x36e9e5d9

    xor-int v22, v22, v24

    move-object v14, v13

    move-object/from16 v7, v16

    move/from16 v23, v22

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v22, -0x32142159

    const/16 v24, 0x0

    move-object/from16 v16, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v10, v22, v21

    mul-int/lit16 v10, v10, 0x60ed

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v1, v10

    xor-int v22, v23, v1

    sparse-switch v22, :sswitch_data_0

    move v1, v11

    .line 98
    invoke-static {}, Ll/֫;->ᩴ᩶۟()J

    move-result-wide v10

    move-object/from16 v23, v14

    move/from16 v25, v15

    iget-wide v14, v0, Ll/ۛ᩺ۘ;->۬ܰ:J

    sub-long/2addr v10, v14

    const-wide/16 v14, 0x12c

    cmp-long v26, v10, v14

    if-gez v26, :cond_3

    const-string v10, "\u06dc\u05ab"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v21

    mul-int/lit8 v10, v10, -0x77

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, 0x78c5

    const v14, 0x5d30fc5d

    xor-int/2addr v11, v14

    const v14, 0xe206a22

    goto/16 :goto_5

    :sswitch_0
    sget v1, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v1, :cond_1

    :cond_0
    move v1, v11

    move-object v10, v14

    move v14, v15

    goto/16 :goto_6

    :cond_1
    move v1, v11

    goto/16 :goto_7

    :sswitch_1
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v1, :cond_2

    :goto_1
    move-object v10, v14

    move v14, v15

    goto/16 :goto_e

    :cond_2
    move v1, v11

    move-object/from16 v23, v14

    move/from16 v25, v15

    goto/16 :goto_3

    .line 95
    :sswitch_2
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v1, :cond_0

    goto :goto_1

    .line 68
    :sswitch_3
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    goto :goto_1

    .line 4
    :sswitch_4
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    return-void

    .line 99
    :sswitch_5
    invoke-static/range {p0 .. p0}, Ll/֡۠;->۫᩵ۙ(Ljava/lang/Object;)V

    return-void

    :sswitch_6
    move v1, v11

    .line 101
    invoke-static {}, Ll/֫;->ᩴ᩶۟()J

    move-result-wide v10

    iput-wide v10, v0, Ll/ۛ᩺ۘ;->۬ܰ:J

    move-object/from16 v23, v14

    move/from16 v25, v15

    goto :goto_2

    :cond_3
    const-string v10, "\u05a1\u06db"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    mul-int/lit8 v10, v10, -0x5d

    xor-int v11, v10, v21

    mul-int/lit16 v11, v11, 0x5b13

    const v14, 0x5da97653

    xor-int/2addr v11, v14

    const v14, 0x220fae0e

    goto/16 :goto_5

    :sswitch_7
    return-void

    :sswitch_8
    const/4 v1, 0x1

    .line 94
    iput-boolean v1, v0, Ll/ۛ᩺ۘ;->֨ܰ:Z

    .line 95
    invoke-static/range {p0 .. p0}, Ll/֡۠;->۫᩵ۙ(Ljava/lang/Object;)V

    return-void

    :sswitch_9
    move v1, v11

    move-object/from16 v23, v14

    move/from16 v25, v15

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    const v11, 0x7e94f657

    xor-int/2addr v10, v11

    if-ne v2, v10, :cond_4

    const-string v10, "\u05a8\u06d9"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v21, v10

    mul-int/lit8 v10, v10, -0x37

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, 0x26c3

    const v14, -0x4f86dd7b

    xor-int/2addr v11, v14

    const v14, 0x5581c8a

    goto/16 :goto_5

    :cond_4
    :goto_2
    const-string v10, "\u1a79\u06d6"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v11, v10, v21

    mul-int/lit16 v11, v11, 0x322f

    const v14, -0x4c6e1f95

    xor-int/2addr v11, v14

    const v14, -0xd368563

    goto/16 :goto_5

    :sswitch_a
    move v1, v11

    move-object/from16 v23, v14

    move/from16 v25, v15

    sget-object v5, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/4 v10, 0x7

    const/4 v11, 0x3

    invoke-static {v5, v10, v11, v13}, Ll/֨ۢ;->ۨۡ۠([SIII)Ljava/lang/String;

    move-result-object v5

    .line 14
    sget-boolean v10, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v10, :cond_5

    :goto_3
    const-string v10, "\u0736\u1a74"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v21

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, -0x5c35

    const v14, 0x75cf6354

    xor-int/2addr v11, v14

    const v14, 0x55e693da

    goto/16 :goto_5

    :cond_5
    const-string v10, "\u073f\u06d7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v21

    mul-int/lit8 v10, v10, -0x75

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, 0x58b5

    const v14, -0x2172fc37

    xor-int/2addr v11, v14

    const v14, -0x56974d74

    goto/16 :goto_5

    :sswitch_b
    move v1, v11

    move-object/from16 v23, v14

    move/from16 v25, v15

    .line 90
    invoke-static/range {p0 .. p0}, Ll/֡ۛ;->ۨܶ۠(Ljava/lang/Object;)V

    .line 91
    new-instance v10, Landroid/content/Intent;

    const-class v11, Ll/ۧ᩺ۘ;

    .line 38
    sget-boolean v14, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v14, :cond_6

    goto :goto_4

    .line 91
    :cond_6
    invoke-direct {v10, v0, v11}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 92
    invoke-static {v0, v10}, Ll/ۗܳ;->᩺ܿۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_c
    move v1, v11

    move-object/from16 v23, v14

    move/from16 v25, v15

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    const v11, 0x7efd6b90

    xor-int/2addr v10, v11

    if-ne v2, v10, :cond_7

    const-string v10, "\u05ab\u0733"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int v10, v10, v20

    mul-int/lit8 v10, v10, -0x7b

    xor-int v11, v10, v21

    mul-int/lit16 v11, v11, -0x3ff9

    const v14, -0x26130ee

    xor-int/2addr v11, v14

    const v14, -0x1108bef8

    goto/16 :goto_5

    :cond_7
    const-string v10, "\u05a1\u0730"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v21

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, 0x4a81

    const v14, 0x19eb8532

    xor-int/2addr v11, v14

    const v14, -0x2a12820c

    goto/16 :goto_5

    :sswitch_d
    move v1, v11

    move-object/from16 v23, v14

    move/from16 v25, v15

    invoke-static {v7, v8, v9, v13}, Ll/ۧ;->۫֨۠([SIII)Ljava/lang/String;

    move-result-object v4

    sget v10, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v10, :cond_8

    :goto_4
    move-object/from16 v14, v23

    move/from16 v15, v25

    goto/16 :goto_7

    :cond_8
    const-string v10, "\u06e2\u1a73"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v11, v10, v21

    mul-int/lit16 v11, v11, 0xa79

    const v14, 0x19877815

    xor-int/2addr v11, v14

    const v14, 0x67634df9

    goto :goto_5

    :sswitch_e
    move v1, v11

    move-object/from16 v23, v14

    move/from16 v25, v15

    sget-object v7, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/4 v8, 0x4

    const/4 v9, 0x3

    sget v10, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v10, :cond_9

    move-object/from16 v10, v23

    move/from16 v14, v25

    goto :goto_6

    :cond_9
    const-string v10, "\u06e8\u06eb"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v21

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, 0x19e9

    const v14, -0x717bdb45

    xor-int/2addr v11, v14

    const v14, 0x7e84f787

    goto :goto_5

    .line 88
    :sswitch_f
    iget-object v1, v0, Ll/ۛ᩺ۘ;->᩹ܰ:Ll/᩺᩸ۖ;

    invoke-virtual {v1}, Ll/᩺᩸ۖ;->ۙ()V

    return-void

    :sswitch_10
    move v1, v11

    move-object/from16 v23, v14

    move/from16 v25, v15

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    const v11, 0x7e4c4c27

    xor-int/2addr v10, v11

    if-ne v2, v10, :cond_a

    const-string v10, "\u05a1\u06d6"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int v10, v10, v20

    mul-int/lit8 v10, v10, 0x1f

    xor-int v11, v10, v21

    mul-int/lit16 v11, v11, 0x2a07

    const v14, -0x760819e

    xor-int/2addr v11, v14

    const v14, 0x324babee

    goto :goto_5

    :cond_a
    const-string v10, "\u06ec\u06d6"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int v10, v10, v20

    mul-int/lit8 v10, v10, 0x7d

    xor-int v11, v10, v21

    mul-int/lit16 v11, v11, -0x3e25

    const v14, -0x3550d6cd    # -5739673.5f

    xor-int/2addr v11, v14

    const v14, -0x76af390a

    :goto_5
    xor-int/2addr v10, v14

    move-object/from16 v14, v23

    move/from16 v15, v25

    move/from16 v23, v10

    goto/16 :goto_10

    :sswitch_11
    move v1, v11

    move-object v10, v14

    move v14, v15

    invoke-static {v10, v14, v6, v13}, Ll/֡۠;->֨ۛ֨([SIII)Ljava/lang/String;

    move-result-object v3

    .line 45
    sget v11, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v11, :cond_b

    :goto_6
    const-string v11, "\u0730\u073d"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v21

    xor-int v15, v11, v20

    mul-int/lit16 v15, v15, -0x3673

    const v23, 0x5d6c2153

    xor-int v15, v15, v23

    const v23, -0x5816e678

    goto/16 :goto_a

    :cond_b
    const-string v11, "\u06df\u06da"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v21

    mul-int/lit8 v11, v11, 0x7

    xor-int v15, v11, v20

    mul-int/lit16 v15, v15, 0x4b69

    const v23, -0x6082f0c0

    xor-int v15, v15, v23

    const v23, -0x76a02d91

    goto/16 :goto_a

    :sswitch_12
    move v1, v11

    .line 88
    sget-object v14, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/4 v15, 0x1

    const/4 v6, 0x3

    .line 28
    sget-boolean v10, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v10, :cond_c

    :goto_7
    const-string v10, "\u05ab\u06e8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v20, v10

    mul-int/lit8 v10, v10, -0x1d

    xor-int v11, v10, v21

    mul-int/lit16 v11, v11, 0x2ee1

    const v23, -0x3afc930e

    xor-int v11, v11, v23

    const v23, 0x2b6fac48

    goto :goto_8

    :cond_c
    const-string v10, "\u06d7\u06e8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int v10, v10, v20

    mul-int/lit8 v10, v10, -0x53

    xor-int v11, v10, v21

    mul-int/lit16 v11, v11, 0x410d

    const v23, -0x22998022

    xor-int v11, v11, v23

    const v23, -0x71398c1

    :goto_8
    xor-int v23, v10, v23

    goto/16 :goto_10

    .line 86
    :sswitch_13
    invoke-static/range {p0 .. p0}, Ll/֡ۛ;->ۨܶ۠(Ljava/lang/Object;)V

    return-void

    :sswitch_14
    move v1, v11

    move-object v10, v14

    move v14, v15

    const v11, 0x102001b

    if-ne v2, v11, :cond_d

    const-string v11, "\u06d9\u06e7"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v21

    mul-int/lit8 v11, v11, 0x27

    xor-int v15, v11, v20

    mul-int/lit16 v15, v15, -0x1acf

    const v23, -0x637cf3f6

    xor-int v15, v15, v23

    const v23, 0x24d7eb56

    goto/16 :goto_a

    :cond_d
    const-string v11, "\u0730\u1a78"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v21

    xor-int v15, v11, v20

    mul-int/lit16 v15, v15, -0x903

    const v23, 0x6243d839

    xor-int v15, v15, v23

    const v23, 0x411372e6

    goto/16 :goto_a

    :sswitch_15
    move v1, v11

    move-object v10, v14

    move v14, v15

    .line 84
    invoke-static/range {p1 .. p1}, Ll/֫ᩳ;->ۛ۬ܽ(Ljava/lang/Object;)I

    move-result v2

    const v11, 0x102001a

    if-ne v2, v11, :cond_e

    const-string v11, "\u06e4\u073f"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v20

    mul-int/lit8 v11, v11, 0x4f

    xor-int v15, v11, v21

    mul-int/lit16 v15, v15, -0xcab

    const v23, -0x58fef27b

    xor-int v15, v15, v23

    const v23, -0x38a02c89

    goto :goto_a

    :cond_e
    const-string v11, "\u06e7\u06d8"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v21

    xor-int v15, v11, v20

    mul-int/lit16 v15, v15, -0x6e45

    const v23, 0x48118830    # 149024.75f

    xor-int v15, v15, v23

    const v23, -0x48ce84ee

    goto :goto_a

    :sswitch_16
    move v1, v11

    move-object v10, v14

    move v14, v15

    const v11, 0xd364

    const v13, 0xd364

    goto :goto_9

    :sswitch_17
    move v1, v11

    move-object v10, v14

    move v14, v15

    const/16 v11, 0x21e7

    const/16 v13, 0x21e7

    :goto_9
    const-string v11, "\u073d\u05a1"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v20

    xor-int v15, v11, v21

    mul-int/lit16 v15, v15, -0x4bff

    const v23, 0x172ef8a2

    xor-int v15, v15, v23

    const v23, -0x6f009c15

    goto :goto_a

    :sswitch_18
    move v1, v11

    move-object v10, v14

    move v14, v15

    add-int v11, v1, v12

    add-int/2addr v11, v11

    sub-int v11, v24, v11

    if-gtz v11, :cond_f

    const-string v11, "\u06d6\u06dc"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v20

    mul-int/lit8 v11, v11, -0x65

    xor-int v15, v11, v21

    mul-int/lit16 v15, v15, 0xbe1

    const v23, 0x35c6366

    xor-int v15, v15, v23

    const v23, -0x1a8c354c

    :goto_a
    xor-int v23, v11, v23

    move v11, v1

    goto :goto_b

    :cond_f
    const-string v11, "\u06d8\u05ab"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v21

    xor-int v15, v11, v20

    mul-int/lit16 v15, v15, 0x4d9

    const v23, -0x4d1fe5de

    xor-int v15, v15, v23

    const v23, 0x6920f0c7

    goto :goto_a

    :sswitch_19
    move-object v10, v14

    move v14, v15

    mul-int v24, v19, v19

    mul-int v11, v18, v18

    const v12, 0x3b7d1a4

    .line 10
    sget v1, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v1, :cond_10

    goto/16 :goto_e

    :cond_10
    const-string v1, "\u06e2\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x2293

    const v23, -0x6c8b9afd

    xor-int v15, v15, v23

    const v23, -0x18314144

    xor-int v23, v1, v23

    :goto_b
    move v1, v15

    :goto_c
    move v15, v14

    move-object v14, v10

    goto/16 :goto_0

    :sswitch_1a
    move v1, v11

    move-object v10, v14

    move v14, v15

    aget-short v11, v16, v17

    add-int/lit16 v15, v11, 0x1eda

    sget v18, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v18, :cond_11

    move/from16 v18, v11

    move/from16 v19, v15

    goto :goto_d

    :cond_11
    const-string v18, "\u1a79\u073f"

    invoke-static/range {v18 .. v18}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v21

    mul-int/lit8 v18, v18, -0x39

    xor-int v0, v18, v20

    mul-int/lit16 v0, v0, -0x4375

    const v19, 0xb76eb0b

    xor-int v0, v0, v19

    const v19, 0x6427b43a

    xor-int v23, v18, v19

    move/from16 v18, v11

    move/from16 v19, v15

    move v11, v1

    move v15, v14

    move v1, v0

    move-object v14, v10

    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_1b
    move v1, v11

    move-object v10, v14

    move v14, v15

    const/16 v17, 0x0

    sget-boolean v0, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v0, :cond_12

    :goto_d
    const-string v0, "\u06e0\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, 0x3d6d

    const v15, 0x5463b01b

    xor-int/2addr v11, v15

    const v15, 0x721008f

    goto :goto_f

    :cond_12
    const-string v0, "\u06d7\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, 0x1653

    const v15, -0x34b41b79    # -1.3362311E7f

    xor-int/2addr v11, v15

    const v15, -0x6536cb46

    goto :goto_f

    :sswitch_1c
    move v1, v11

    move-object v10, v14

    move v14, v15

    sget-object v16, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    .line 100
    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_13

    move v11, v1

    :goto_e
    const-string v0, "\u1a78\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0xf

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x5b1b

    const v15, -0x15b2fbd9

    xor-int/2addr v1, v15

    const v15, 0x7c8997c9

    xor-int v23, v0, v15

    move-object/from16 v0, p0

    goto/16 :goto_c

    :cond_13
    const-string v0, "\u1a75\u073d"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x53

    xor-int v11, v0, v20

    mul-int/lit16 v11, v11, 0x4f95

    const v15, 0x72dd8d26

    xor-int/2addr v11, v15

    const v15, -0x1df87520

    :goto_f
    xor-int v23, v0, v15

    move-object/from16 v0, p0

    move v15, v14

    move-object v14, v10

    :goto_10
    move/from16 v27, v11

    move v11, v1

    move/from16 v1, v27

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6fbe151b -> :sswitch_1b
        -0x6fa4cfe5 -> :sswitch_0
        -0x6c756f86 -> :sswitch_16
        -0x661f6015 -> :sswitch_6
        -0x659d21a7 -> :sswitch_a
        -0x6148da10 -> :sswitch_9
        -0x5da1b710 -> :sswitch_8
        -0x4db9327a -> :sswitch_1c
        -0x4b629a42 -> :sswitch_17
        -0x46db5cc9 -> :sswitch_1c
        -0x36f3bf10 -> :sswitch_5
        -0x34fa8737 -> :sswitch_14
        -0x349231f0 -> :sswitch_c
        -0x338bc7f8 -> :sswitch_d
        -0x3028f8dd -> :sswitch_1a
        -0x2690d0d5 -> :sswitch_8
        -0x2644bba9 -> :sswitch_17
        -0x257d329f -> :sswitch_6
        -0x242fc468 -> :sswitch_16
        -0x23cd3887 -> :sswitch_5
        -0x191a3304 -> :sswitch_1b
        -0x18e98758 -> :sswitch_2
        -0x15299add -> :sswitch_d
        -0xfe6b149 -> :sswitch_c
        -0xc1c66de -> :sswitch_12
        -0x51bd905 -> :sswitch_18
        -0x3b7b272 -> :sswitch_1
        0x5c1b54f -> :sswitch_14
        0x7856970 -> :sswitch_15
        0xd4a3413 -> :sswitch_2
        0xdb336a7 -> :sswitch_1a
        0x1519ed09 -> :sswitch_3
        0x1a322b6f -> :sswitch_11
        0x1afbf626 -> :sswitch_7
        0x1f24f99d -> :sswitch_11
        0x21c8bc38 -> :sswitch_0
        0x24bff7f4 -> :sswitch_12
        0x36c8d5c5 -> :sswitch_15
        0x37abab00 -> :sswitch_b
        0x37acb946 -> :sswitch_9
        0x3c31f800 -> :sswitch_10
        0x3efe25f3 -> :sswitch_e
        0x43fc735c -> :sswitch_19
        0x49951adc -> :sswitch_3
        0x4c88193e -> :sswitch_13
        0x5a2fc412 -> :sswitch_4
        0x5f5e2464 -> :sswitch_19
        0x63131669 -> :sswitch_4
        0x65b0ad7f -> :sswitch_7
        0x65b33762 -> :sswitch_b
        0x66795cf8 -> :sswitch_f
        0x671ddad7 -> :sswitch_a
        0x69cf0176 -> :sswitch_1
        0x6dc956be -> :sswitch_10
        0x70b48e1a -> :sswitch_18
        0x72fd1993 -> :sswitch_f
        0x79eb378b -> :sswitch_13
        0x7e216093 -> :sswitch_e
    .end sparse-switch
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 40

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const v29, -0x36464cca

    sget v30, Ll/֫֡;->ۡ᩹ۗ:I

    sget v31, Ll/֡ܳ;->֡۠ۧ:I

    const-string v32, "\u073a\u06e0"

    invoke-static/range {v32 .. v32}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v32

    xor-int v32, v32, v30

    xor-int v1, v32, v31

    mul-int/lit16 v1, v1, -0x177b

    const v33, 0x6c6ee3a9

    xor-int v1, v1, v33

    const v33, 0x5290e54e

    xor-int v32, v32, v33

    move-object/from16 v22, v3

    move-object/from16 v24, v5

    move-object v9, v8

    move-object v15, v14

    move-object/from16 v34, v18

    move-object/from16 v37, v21

    move-object/from16 v20, v23

    move-object/from16 v3, v25

    move-object/from16 v5, v27

    const/4 v2, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v25, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    move-object/from16 v23, v4

    move-object v8, v7

    move-object v14, v13

    const/4 v4, 0x0

    const/4 v13, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    :goto_0
    xor-int v11, v29, v31

    mul-int/lit16 v11, v11, 0x6899

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v1, v11

    xor-int v29, v32, v1

    sparse-switch v29, :sswitch_data_0

    move-object/from16 v11, v24

    move-object/from16 v28, v34

    move/from16 v26, v36

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    sget-object v0, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/16 v1, 0xa

    aget-short v0, v0, v1

    add-int/lit16 v1, v0, 0x462f

    mul-int v17, v1, v1

    goto/16 :goto_f

    .line 17
    :sswitch_0
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v1

    if-lez v1, :cond_2

    goto :goto_3

    .line 26
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_3

    :cond_0
    :goto_1
    move-object/from16 v11, v24

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    goto/16 :goto_9

    .line 1
    :sswitch_2
    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-lez v1, :cond_1

    :goto_2
    move-object v1, v3

    move-object/from16 v3, v20

    move-object/from16 v11, v24

    move/from16 v20, v4

    move/from16 v4, v21

    goto/16 :goto_5

    :cond_1
    :goto_3
    const-string v1, "\u06e7\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x43

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, -0x5b97

    const v26, 0xd901284

    xor-int v11, v11, v26

    const v26, 0x7e71260f

    goto/16 :goto_4

    .line 25
    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    goto :goto_2

    .line 47
    :sswitch_4
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    return-void

    .line 48
    :sswitch_5
    iget-object v1, v0, Ll/ۛ᩺ۘ;->ۖܰ:Ll/ܶ᩸ۖ;

    invoke-static {v1}, Ll/ܽܺۘ;->ܰ(Landroid/view/View;)V

    .line 50
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/ܿ᩺ۘ;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v2, 0x0

    .line 51
    invoke-virtual {v0, v1, v0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void

    .line 44
    :sswitch_6
    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    const v11, 0x7e7f6286

    xor-int/2addr v1, v11

    .line 46
    invoke-static {v0, v1}, Ll/ۖۛ;->᩵ۖ۠(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ܶ᩸ۖ;

    iput-object v1, v0, Ll/ۛ᩺ۘ;->ۖܰ:Ll/ܶ᩸ۖ;

    .line 47
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    const-string v1, "\u1a7a\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    mul-int/lit8 v1, v1, 0x65

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, -0x95d

    const v26, -0x6938107c

    xor-int v11, v11, v26

    const v26, 0x95da8a8

    goto/16 :goto_4

    .line 44
    :sswitch_7
    invoke-static {v0, v10}, Ll/֡ۚ;->۬֡ۜ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Ll/֫ܽ;->᩸᩷ܽ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/16 v11, 0x26

    const/4 v15, 0x3

    invoke-static {v1, v11, v15, v2}, Ll/ۖ᩸;->ۧۛۘ([SIII)Ljava/lang/String;

    move-result-object v15

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v1, :cond_3

    :cond_2
    const-string v1, "\u06d7\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v31

    mul-int/lit8 v1, v1, 0x67

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, 0x1275

    const v26, -0x1ffbc3b5

    xor-int v11, v11, v26

    const v26, -0x2540adb9

    goto/16 :goto_4

    :cond_3
    const-string v1, "\u073f\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x2f

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, -0x5cd

    const v26, -0x150107

    xor-int v11, v11, v26

    const v26, -0x761a593e

    goto/16 :goto_4

    .line 43
    :sswitch_8
    invoke-static {v9, v0}, Ll/֫ܽ;->᩸᩷ܽ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/16 v10, 0x23

    const/4 v11, 0x3

    invoke-static {v1, v10, v11, v2}, Ll/֫ܽ;->ᩴ᩸ۗ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    const v10, 0x7ec3d3f2

    xor-int/2addr v10, v1

    const-string v1, "\u06e4\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, -0x76a1

    const v26, 0x64a95fa3

    xor-int v11, v11, v26

    const v26, -0x64082a87    # -4.1000676E-22f

    goto/16 :goto_4

    :sswitch_9
    const/4 v1, 0x3

    .line 42
    invoke-static {v5, v6, v1, v2}, Ll/֫ۛ;->ۖۖۜ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    const v9, 0x7eca3937

    xor-int/2addr v1, v9

    .line 43
    invoke-static {v0, v1}, Ll/֡ۚ;->۬֡ۜ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v9

    .line 38
    sget-boolean v1, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v1, :cond_4

    goto/16 :goto_1

    :cond_4
    const-string v1, "\u0736\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, -0x402d

    const v26, 0x42826a17

    xor-int v11, v11, v26

    const v26, 0x1ed44764

    goto/16 :goto_4

    .line 41
    :sswitch_a
    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    const v5, 0x7e9f1c98

    xor-int/2addr v1, v5

    .line 42
    invoke-static {v0, v1}, Ll/ۖۛ;->᩵ۖ۠(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Ll/۟;->᩻֫ۖ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v5, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/16 v6, 0x20

    const-string v1, "\u1a75\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, -0x27bd

    const v26, -0x2cb7dd82

    xor-int v11, v11, v26

    const v26, 0x1c522f

    goto/16 :goto_4

    :sswitch_b
    const v1, 0x102001b

    .line 41
    invoke-static {v0, v1}, Ll/ۖۛ;->᩵ۖ۠(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Ll/۟;->᩻֫ۖ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/16 v11, 0x1d

    const/4 v14, 0x3

    invoke-static {v1, v11, v14, v2}, Ll/֡᩸;->ۤ᩺ۢ([SIII)Ljava/lang/String;

    move-result-object v14

    sget v1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v1, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v1, "\u073a\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, 0x2357

    const v26, 0x3445e6ed

    xor-int v11, v11, v26

    const v26, -0x29fb453a

    goto/16 :goto_4

    :sswitch_c
    const v1, 0x102001a

    .line 40
    invoke-static {v0, v1}, Ll/ۖۛ;->᩵ۖ۠(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Ll/֫ܽ;->᩸᩷ܽ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1
    sget v1, Ll/֫;->ܶܺ᩻:I

    if-ltz v1, :cond_6

    goto/16 :goto_1

    :cond_6
    const-string v1, "\u06d6\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, -0x773d

    const v26, -0xfd28859

    xor-int v11, v11, v26

    const v26, -0x4851f19e

    goto/16 :goto_4

    :sswitch_d
    const v1, 0x7e9ce58f

    xor-int/2addr v1, v13

    .line 38
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v11

    invoke-static {v8, v1, v11}, Ll/᩶֫ܰ;->ۙ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩶֫ܰ;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const-string v1, "\u05a8\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, 0x6ee7

    const v26, -0x22d25dd9

    xor-int v11, v11, v26

    const v26, 0x363a184

    goto/16 :goto_4

    :sswitch_e
    invoke-virtual/range {p0 .. p0}, Ll/ۤۚ;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    sget-object v1, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/16 v11, 0x1a

    const/4 v13, 0x3

    invoke-static {v1, v11, v13, v2}, Ll/֫ۘ;->ۜۖܺ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    .line 20
    sget v1, Ll/۟;->ۨᩴۛ:I

    if-ltz v1, :cond_7

    move-object/from16 v1, v18

    move-object/from16 v11, v24

    move-object/from16 v28, v34

    move/from16 v26, v36

    move-object/from16 v24, v3

    move/from16 v3, v35

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u1a7a\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, -0x5f57

    const v26, -0x806b3c5

    xor-int v11, v11, v26

    const v26, 0x32f4a175

    goto/16 :goto_4

    :sswitch_f
    const/4 v1, 0x3

    .line 35
    invoke-static {v3, v4, v1, v2}, Ll/ۖۛ;->ܿۤ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    const v7, 0x7ead14c2

    xor-int/2addr v1, v7

    .line 37
    invoke-static {v0, v1}, Ll/ۖۛ;->᩵ۖ۠(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/ImageView;

    const-string v1, "\u06e4\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v31, v1

    mul-int/lit8 v1, v1, -0x15

    xor-int v11, v1, v30

    mul-int/lit16 v11, v11, -0x3271

    const v26, 0x53a38506

    xor-int v11, v11, v26

    const v26, -0x2f4d12a8

    goto :goto_4

    :sswitch_10
    xor-int v1, v25, v12

    .line 35
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    move-object/from16 v11, v24

    invoke-static {v11, v1, v3}, Ll/᩶֫ܰ;->ۙ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩶֫ܰ;

    move-result-object v1

    move-object/from16 v3, v23

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object v1, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    .line 12
    sget-boolean v23, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v23, :cond_8

    move-object/from16 v23, v3

    move-object/from16 v3, v20

    move/from16 v4, v21

    const/16 v20, 0x17

    goto/16 :goto_5

    :cond_8
    const-string v23, "\u06e8\u06e7"

    invoke-static/range {v23 .. v23}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v31

    xor-int v4, v23, v30

    mul-int/lit16 v4, v4, 0x613

    const v26, -0x121db7aa

    xor-int v4, v4, v26

    const v26, 0x23a5ddc

    xor-int v32, v23, v26

    move-object/from16 v23, v3

    move-object/from16 v24, v11

    move-object v3, v1

    move v1, v4

    const/16 v4, 0x17

    goto/16 :goto_0

    .line 34
    :sswitch_11
    move-object/from16 v23, v22

    check-cast v23, Landroid/widget/ImageView;

    .line 35
    invoke-virtual/range {p0 .. p0}, Ll/ۤۚ;->getResources()Landroid/content/res/Resources;

    move-result-object v24

    sget-object v1, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/16 v11, 0x14

    const/4 v12, 0x3

    invoke-static {v1, v11, v12, v2}, Ll/ۗ۬;->᩶ۖۚ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v25

    const v12, 0x7d3ca8b9

    const-string v1, "\u06d9\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, -0x3753

    const v26, 0x427c7712

    xor-int v11, v11, v26

    const v26, -0x7d37a5a9

    :goto_4
    xor-int v32, v1, v26

    move v1, v11

    goto/16 :goto_0

    :sswitch_12
    move-object/from16 v11, v24

    const/4 v1, 0x3

    move-object/from16 v24, v3

    move-object/from16 v3, v20

    move/from16 v20, v4

    move/from16 v4, v21

    .line 33
    invoke-static {v3, v4, v1, v2}, Ll/֨᩺;->ۧۖܿ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    const v21, 0x7ea6037b

    xor-int v1, v1, v21

    .line 34
    invoke-static {v0, v1}, Ll/֡ۚ;->۬֡ۜ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v22

    .line 1
    sget-boolean v1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v1, :cond_9

    move-object/from16 v1, v24

    :goto_5
    const-string v21, "\u1a79\u06e0"

    invoke-static/range {v21 .. v21}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v31

    move-object/from16 v24, v1

    xor-int v1, v21, v30

    mul-int/lit16 v1, v1, -0x3fbb

    const v26, 0x2a6c9ba0

    xor-int v1, v1, v26

    const v26, 0x6e0d03d9

    xor-int v32, v21, v26

    move/from16 v21, v4

    move/from16 v4, v20

    move-object/from16 v20, v3

    move-object/from16 v3, v24

    goto :goto_6

    :cond_9
    const-string v1, "\u06d7\u1a79"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v31, v1

    mul-int/lit8 v1, v1, 0x7d

    move-object/from16 v21, v3

    xor-int v3, v1, v30

    mul-int/lit16 v3, v3, -0x12d5

    const v26, 0x43d15ff

    xor-int v3, v3, v26

    const v26, 0x1c975751

    xor-int v32, v1, v26

    move v1, v3

    goto/16 :goto_b

    :sswitch_13
    move/from16 v20, v4

    move/from16 v1, v19

    move-object/from16 v11, v24

    move-object/from16 v24, v3

    .line 33
    invoke-static {v0, v1}, Ll/ۖۛ;->᩵ۖ۠(Ljava/lang/Object;I)Landroid/view/View;

    sget-object v3, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/16 v21, 0x11

    .line 27
    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_a

    move/from16 v19, v1

    move-object/from16 v21, v3

    move-object/from16 v3, v37

    const/16 v4, 0x11

    goto/16 :goto_9

    :cond_a
    const-string v4, "\u073d\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v30, v4

    mul-int/lit8 v4, v4, -0x9

    xor-int v0, v4, v31

    mul-int/lit16 v0, v0, -0x46b1

    const v19, 0x7a3d34ed

    xor-int v0, v0, v19

    const v19, -0x6b1e7b63

    xor-int v32, v4, v19

    move/from16 v19, v1

    move/from16 v4, v20

    move v1, v0

    move-object/from16 v20, v3

    move-object/from16 v3, v24

    move-object/from16 v0, p0

    :goto_6
    move-object/from16 v24, v11

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v11, v24

    move-object/from16 v24, v3

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    const/4 v0, 0x3

    move-object/from16 v3, v37

    move/from16 v1, v38

    .line 32
    invoke-static {v3, v1, v0, v2}, Ll/֨᩸;->۫ۜܽ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    const v19, 0x7d3650ae

    xor-int v19, v0, v19

    const-string v0, "\u1a74\u06da"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    move/from16 v26, v1

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, -0x232b

    const v27, -0xeadf90c    # -1.0400041E30f

    xor-int v1, v1, v27

    const v27, -0x776c3a21

    xor-int v32, v0, v27

    move-object/from16 v0, p0

    move-object/from16 v37, v3

    move-object/from16 v3, v24

    move/from16 v38, v26

    goto/16 :goto_10

    :sswitch_15
    move-object/from16 v11, v24

    move-object/from16 v0, v34

    move/from16 v1, v36

    move-object/from16 v24, v3

    move/from16 v3, v35

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    invoke-static {v0, v3, v1, v2}, Ll/֨ܶ;->ۢ֡᩷([SIII)Ljava/lang/String;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v26

    const v27, 0x7ed22b11

    move-object/from16 v28, v0

    xor-int v0, v26, v27

    move/from16 v26, v1

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    sget-object v37, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/16 v38, 0xe

    .line 1
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v0

    if-eqz v0, :cond_b

    :goto_7
    const-string v0, "\u06eb\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    mul-int/lit8 v0, v0, 0x6d

    move-object/from16 v18, v1

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, -0x4a87

    const v27, 0x45f839e0

    xor-int v1, v1, v27

    const v27, 0x6adeec57

    goto :goto_8

    :cond_b
    move-object/from16 v18, v1

    const-string v0, "\u06eb\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, 0x40eb

    const v27, -0x6b805dfa

    xor-int v1, v1, v27

    const v27, -0x387e78f5

    :goto_8
    xor-int v32, v0, v27

    move-object/from16 v0, p0

    move/from16 v35, v3

    goto/16 :goto_e

    :sswitch_16
    move-object/from16 v11, v24

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    .line 32
    sget-object v34, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/16 v35, 0xb

    const/16 v36, 0x3

    .line 11
    sget v0, Ll/֨ۧ;->֫۠֡:I

    if-gtz v0, :cond_c

    :goto_9
    const-string v0, "\u05ab\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    mul-int/lit8 v0, v0, 0x3b

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, 0x2bcd

    const v26, 0x4da0610a    # 3.3633926E8f

    xor-int v1, v1, v26

    const v26, 0x2c6238d9

    goto :goto_a

    :cond_c
    const-string v0, "\u0733\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v31

    mul-int/lit8 v0, v0, 0x9

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, 0x26dd

    const v26, 0x34e7cf1f

    xor-int v1, v1, v26

    const v26, -0x5e965d11

    :goto_a
    xor-int v32, v0, v26

    move-object/from16 v0, p0

    move-object/from16 v37, v3

    :goto_b
    move-object/from16 v3, v24

    goto/16 :goto_10

    :sswitch_17
    move-object/from16 v11, v24

    move-object/from16 v28, v34

    move/from16 v26, v36

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    .line 30
    invoke-super/range {p0 .. p1}, Ll/۫ܶۘ;->onCreate(Landroid/os/Bundle;)V

    .line 31
    invoke-static/range {p0 .. p0}, Ll/ۖۗ;->ᩳ۬ۤ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 32
    invoke-static/range {p0 .. p0}, Ll/ۖۗ;->ᩳ۬ۤ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v18

    const-string v0, "\u05a1\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, 0xcbd

    const v27, 0xcb49d2f

    xor-int v1, v1, v27

    const v27, -0xdb11079

    goto/16 :goto_d

    :sswitch_18
    move-object/from16 v11, v24

    move-object/from16 v28, v34

    move/from16 v26, v36

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    const/16 v0, 0xfae

    const/16 v2, 0xfae

    goto :goto_c

    :sswitch_19
    move-object/from16 v11, v24

    move-object/from16 v28, v34

    move/from16 v26, v36

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    const v0, 0x83a5

    const v2, 0x83a5

    :goto_c
    const-string v0, "\u05a1\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    mul-int/lit8 v0, v0, 0x7

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, 0x3d57

    const v27, 0xdc8632f

    xor-int v1, v1, v27

    const v27, -0x6e4b7324

    goto :goto_d

    :sswitch_1a
    move-object/from16 v11, v24

    move-object/from16 v28, v34

    move/from16 v26, v36

    move-object/from16 v24, v3

    move-object/from16 v3, v37

    move-object/from16 v39, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v39

    mul-int v0, v16, v16

    const v1, 0x133dbca1

    add-int/2addr v0, v1

    add-int/2addr v0, v0

    sub-int v0, v17, v0

    if-gtz v0, :cond_d

    const-string v0, "\u073d\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, -0x7737

    const v27, -0x5d9df33

    xor-int v1, v1, v27

    const v27, 0x168ce792

    :goto_d
    xor-int v32, v0, v27

    move-object/from16 v0, p0

    move-object/from16 v37, v3

    :goto_e
    move-object/from16 v3, v24

    move/from16 v36, v26

    move-object/from16 v34, v28

    goto :goto_10

    :cond_d
    const-string v0, "\u06ec\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    mul-int/lit8 v0, v0, 0x35

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, -0x5dc7

    const v27, 0x18655237

    xor-int v1, v1, v27

    const v27, 0x2333019a

    goto :goto_d

    :goto_f
    const-string v1, "\u1a78\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    move/from16 v16, v0

    xor-int v0, v1, v30

    mul-int/lit16 v0, v0, 0x25e3

    const v27, 0x2ed563af

    xor-int v0, v0, v27

    const v27, -0x50ae32d2

    xor-int v32, v1, v27

    move v1, v0

    move-object/from16 v37, v3

    move-object/from16 v3, v24

    move/from16 v36, v26

    move-object/from16 v34, v28

    move-object/from16 v0, p0

    :goto_10
    move-object/from16 v24, v11

    move-object/from16 v39, v21

    move/from16 v21, v4

    move/from16 v4, v20

    move-object/from16 v20, v39

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7750a5d2 -> :sswitch_b
        -0x719914ed -> :sswitch_a
        -0x6abb500c -> :sswitch_6
        -0x64d7cc8d -> :sswitch_f
        -0x601b981d -> :sswitch_14
        -0x5cc8256d -> :sswitch_3
        -0x5ca38bf8 -> :sswitch_c
        -0x55d4e524 -> :sswitch_16
        -0x50e1c5cc -> :sswitch_2
        -0x4cdace37 -> :sswitch_6
        -0x497ea7c5 -> :sswitch_1
        -0x455e0b1c -> :sswitch_17
        -0x4516db9d -> :sswitch_15
        -0x43850c1c -> :sswitch_a
        -0x3c6a41d3 -> :sswitch_7
        -0x36fd1eea -> :sswitch_4
        -0x36b444e7 -> :sswitch_12
        -0x364170c1 -> :sswitch_0
        -0x31b3c5cc -> :sswitch_9
        -0x2f0db7e2 -> :sswitch_13
        -0x28dec531 -> :sswitch_5
        -0x28d56120 -> :sswitch_14
        -0x25524325 -> :sswitch_10
        -0x223d80af -> :sswitch_d
        -0x1d11d49a -> :sswitch_18
        -0x10339d9b -> :sswitch_b
        -0xc3afcba -> :sswitch_10
        -0x8cfbe93 -> :sswitch_1a
        -0x5199d81 -> :sswitch_16
        -0x48dcded -> :sswitch_17
        0x1553d359 -> :sswitch_11
        0x209b9487 -> :sswitch_5
        0x27930e1c -> :sswitch_8
        0x366c8f79 -> :sswitch_4
        0x39157aef -> :sswitch_15
        0x3b29afc0 -> :sswitch_11
        0x3e0c13a4 -> :sswitch_3
        0x3e709527 -> :sswitch_7
        0x3eaaeac8 -> :sswitch_19
        0x46b19c07 -> :sswitch_8
        0x4ab0b54d -> :sswitch_1
        0x4ee93d0f -> :sswitch_19
        0x587a5489 -> :sswitch_9
        0x5a583604 -> :sswitch_f
        0x5b0655e9 -> :sswitch_c
        0x5c658288 -> :sswitch_0
        0x683a3b62 -> :sswitch_1a
        0x6a92a77b -> :sswitch_d
        0x6f4bfd7b -> :sswitch_e
        0x6f532574 -> :sswitch_18
        0x709972c5 -> :sswitch_12
        0x73052dee -> :sswitch_2
        0x7ab8b760 -> :sswitch_13
        0x7fc492fd -> :sswitch_e
    .end sparse-switch
.end method

.method public final onDestroy()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x5d473e66

    sget v2, Ll/ۖ᩸;->ۨܽ۬:I

    sget v3, Ll/ۧ;->֫۠ᩴ:I

    const-string v4, "\u06e7\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4ceb

    const v6, 0x78eb665b

    xor-int/2addr v5, v6

    const v6, -0x8b2e9b6

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x465b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 42
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v4

    if-gtz v4, :cond_8

    goto/16 :goto_1

    .line 4
    :sswitch_0
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-gez v4, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v4

    if-gez v4, :cond_7

    goto/16 :goto_2

    :sswitch_2
    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u073a\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7491

    const v6, 0x75f7c5e5

    xor-int/2addr v5, v6

    const v6, -0x556aeac7

    goto :goto_0

    .line 6
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    return-void

    .line 77
    :sswitch_5
    invoke-static {v0}, Ll/ۗܺ;->֫ᩴ۬(Ljava/lang/Object;)Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܿ᩺ۘ;->ۛ:Ljava/lang/String;

    return-void

    :sswitch_6
    iget-object v0, p0, Ll/ۛ᩺ۘ;->ۖܰ:Ll/ܶ᩸ۖ;

    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u0730\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x59c3

    const v6, 0x3bb70512

    xor-int/2addr v5, v6

    const v6, -0x6c99d55

    goto :goto_0

    .line 76
    :sswitch_7
    invoke-virtual {p0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 35
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u1a77\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1c4b

    const v6, -0x28ee4df1

    xor-int/2addr v5, v6

    const v6, -0x711ed6d7

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u1a7b\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x27b1

    const v6, -0x12609d

    xor-int/2addr v5, v6

    const v6, -0x11432ec8

    goto/16 :goto_0

    .line 45
    :sswitch_9
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u06e4\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x32e7

    const v6, -0x1890408e

    xor-int/2addr v5, v6

    const v6, -0x19f465a8

    goto/16 :goto_0

    .line 56
    :sswitch_a
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v4

    if-ltz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u0730\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x135d

    const v6, -0x270a66ba

    xor-int/2addr v5, v6

    const v6, -0x52cdf05e

    goto/16 :goto_0

    .line 74
    :sswitch_b
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06eb\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x71c7

    const v6, 0x35dd6a0f

    xor-int/2addr v5, v6

    const v6, -0x5860d182

    goto/16 :goto_0

    :cond_7
    :goto_1
    const-string v4, "\u06eb\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6361

    const v6, 0x17cd87b1

    xor-int/2addr v5, v6

    const v6, 0x6e132dd8

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06df\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3d2b

    const v6, 0x5f0569d

    xor-int/2addr v5, v6

    const v6, 0x51de4f7e

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v4

    if-gtz v4, :cond_9

    :goto_2
    const-string v4, "\u06e4\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2363

    const v6, 0x649d558d

    xor-int/2addr v5, v6

    const v6, 0x229ea7ee

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a7b\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3ed9

    const v6, 0x52a59cc1

    xor-int/2addr v5, v6

    const v6, 0x76601527

    goto/16 :goto_0

    .line 30
    :sswitch_d
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_a

    :goto_3
    const-string v4, "\u0733\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x354f

    const v6, -0xf068c8c

    xor-int/2addr v5, v6

    const v6, -0x4d0cbe64

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a73\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7e45

    const v6, 0x415e0e8d

    xor-int/2addr v5, v6

    const v6, 0x475c68b5

    goto/16 :goto_0

    .line 75
    :sswitch_e
    invoke-super {p0}, Ll/۫ܶۘ;->onDestroy()V

    .line 13
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v4

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06e8\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2a29

    const v6, -0x1690860e

    xor-int/2addr v5, v6

    const v6, -0x61563943

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06ec\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x8a1

    const v6, -0x576c70e7

    xor-int/2addr v5, v6

    const v6, 0x62c8f1cb

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e106059 -> :sswitch_8
        -0x762f0612 -> :sswitch_c
        -0x74422a07 -> :sswitch_d
        -0x6be4ded2 -> :sswitch_9
        -0x6b344526 -> :sswitch_9
        -0x5e4a4ca1 -> :sswitch_4
        -0x54e6c211 -> :sswitch_e
        -0x52a73bfd -> :sswitch_4
        -0x48d93992 -> :sswitch_d
        -0x263924e1 -> :sswitch_2
        -0x1be8c7eb -> :sswitch_7
        -0x12d44464 -> :sswitch_c
        -0x11259710 -> :sswitch_b
        0x3744ba5 -> :sswitch_b
        0x657a503 -> :sswitch_7
        0xc2fe325 -> :sswitch_e
        0xdf75922 -> :sswitch_0
        0x1205dc19 -> :sswitch_3
        0x33e5ac58 -> :sswitch_8
        0x46327b70 -> :sswitch_5
        0x474c27a7 -> :sswitch_2
        0x58189254 -> :sswitch_1
        0x5b0cf8b4 -> :sswitch_6
        0x5f4a15a9 -> :sswitch_6
        0x5fbe7c4e -> :sswitch_0
        0x60d63b5f -> :sswitch_3
        0x62f3d985 -> :sswitch_5
        0x676b206c -> :sswitch_1
        0x72713440 -> :sswitch_a
        0x741730a2 -> :sswitch_a
    .end sparse-switch
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 6

    const/4 p1, 0x0

    const v0, -0x2ea05d44

    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    sget v2, Ll/ۗ᩺;->ۢۜ᩶:I

    const-string v3, "\u0736\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x41f7

    const v5, -0xf090638

    xor-int/2addr v4, v5

    const v5, 0xbbd6479

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x6ea1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 75
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_c

    goto/16 :goto_4

    .line 6
    :sswitch_0
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-lez v3, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v3, :cond_d

    goto/16 :goto_2

    :sswitch_2
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_3

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 v3, 0x0

    .line 113
    invoke-virtual {p1, v3}, Ll/᩺᩸ۖ;->onClick(Landroid/view/View;)V

    goto :goto_1

    .line 112
    :sswitch_6
    iget-object p1, p0, Ll/ۛ᩺ۘ;->᩹ܰ:Ll/᩺᩸ۖ;

    if-eqz p1, :cond_0

    const-string v3, "\u06d6\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x75b7

    const v5, -0x2563c58d

    xor-int/2addr v4, v5

    const v5, -0x6cd891bc

    goto :goto_0

    :sswitch_7
    const/16 v3, 0x42

    if-ne p2, v3, :cond_0

    const-string v3, "\u06e7\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3ab

    const v5, 0x72492839

    xor-int/2addr v4, v5

    const v5, 0x6a4cdda0

    goto :goto_0

    :sswitch_8
    const/4 p1, 0x0

    return p1

    .line 108
    :sswitch_9
    invoke-static {p0}, Ll/֡۠;->۫᩵ۙ(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    .line 110
    :sswitch_a
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "\u1a76\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xf99

    const v5, 0x7f75ab4b

    xor-int/2addr v4, v5

    const v5, 0x532ad4d1

    goto/16 :goto_0

    :cond_0
    :goto_1
    const-string v3, "\u06dc\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4fe7

    const v5, -0x5b7dba8

    xor-int/2addr v4, v5

    const v5, -0x172bfa3b

    goto/16 :goto_0

    :sswitch_b
    const/4 v3, 0x4

    if-ne p2, v3, :cond_1

    const-string v3, "\u06df\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1ecb

    const v5, 0x3c29c231

    xor-int/2addr v4, v5

    const v5, 0x78627098

    goto/16 :goto_0

    :cond_1
    const-string v3, "\u06e0\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2ac3

    const v5, -0x669e23ef

    xor-int/2addr v4, v5

    const v5, -0x195e1638

    goto/16 :goto_0

    .line 61
    :sswitch_c
    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a76\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x167d

    const v5, 0x2aed77b6

    xor-int/2addr v4, v5

    const v5, 0x7da35686

    goto/16 :goto_0

    .line 35
    :sswitch_d
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_4

    :cond_3
    const-string v3, "\u06da\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5a45

    const v5, 0x35839bb8

    xor-int/2addr v4, v5

    const v5, 0x659312c1

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a73\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2133

    const v5, -0x6e04ab3

    xor-int/2addr v4, v5

    const v5, -0x35e5bc01

    goto/16 :goto_0

    .line 54
    :sswitch_e
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u1a74\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7e4f

    const v5, 0x55f50f0b

    xor-int/2addr v4, v5

    const v5, 0x4abe0ab0    # 6227288.0f

    goto/16 :goto_0

    .line 86
    :sswitch_f
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06df\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6131

    const v5, -0x6ff2f67e

    xor-int/2addr v4, v5

    const v5, 0xb6db74e

    goto/16 :goto_0

    .line 33
    :sswitch_10
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_7

    :goto_2
    const-string v3, "\u06e1\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5b17

    const v5, -0x6f8d007b

    xor-int/2addr v4, v5

    const v5, 0x2ca11553

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u073f\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4f9d

    const v5, 0x154b1fc6

    xor-int/2addr v4, v5

    const v5, -0x4324ebd3    # -0.026743019f

    goto/16 :goto_0

    .line 106
    :sswitch_11
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v3

    if-gtz v3, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v3, "\u06d9\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x114d

    const v5, 0x6cb361d3

    xor-int/2addr v4, v5

    const v5, 0x35cb2fe7

    goto/16 :goto_0

    .line 45
    :sswitch_12
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_9

    :goto_3
    const-string v3, "\u06db\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6567

    const v5, -0x3ee87b2c

    xor-int/2addr v4, v5

    const v5, -0x6695beb8    # -1.21107E-23f

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a7b\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1eaf

    const v5, 0x61a99da6

    xor-int/2addr v4, v5

    const v5, 0x75814346

    goto/16 :goto_0

    .line 56
    :sswitch_13
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u05a8\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x29a5

    const v5, 0x4b5486

    xor-int/2addr v4, v5

    const v5, -0x386618dc

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v3, "\u1a77\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x50cb

    const v5, -0x157ebec4

    xor-int/2addr v4, v5

    const v5, 0x45c404e

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a78\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5ead

    const v5, 0x3f2aafec

    xor-int/2addr v4, v5

    const v5, -0x468d34d1

    goto/16 :goto_0

    .line 66
    :sswitch_14
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v3

    if-gtz v3, :cond_e

    :cond_d
    :goto_5
    const-string v3, "\u1a78\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2065

    const v5, -0x26c3ba8c

    xor-int/2addr v4, v5

    const v5, 0x437928be

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06e0\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3df3

    const v5, -0x156e4506

    xor-int/2addr v4, v5

    const v5, 0x6c39d931

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7224ef50 -> :sswitch_2
        -0x67e10383 -> :sswitch_c
        -0x676d9bd6 -> :sswitch_8
        -0x5ba924fa -> :sswitch_14
        -0x4bd84de2 -> :sswitch_6
        -0x48206b3b -> :sswitch_12
        -0x45a03cf8 -> :sswitch_c
        -0x3d247fe4 -> :sswitch_a
        -0x35ba7a89 -> :sswitch_10
        -0x34c193fe -> :sswitch_8
        -0x322e6a2d -> :sswitch_e
        -0x2495108f -> :sswitch_2
        -0x2452d858 -> :sswitch_5
        -0x22ea0251 -> :sswitch_f
        -0x22a0a5f1 -> :sswitch_1
        -0x1c9ec5d5 -> :sswitch_5
        -0x1a3173b0 -> :sswitch_f
        -0x196e33a8 -> :sswitch_13
        -0x15752d1e -> :sswitch_9
        0x116a0309 -> :sswitch_12
        0x2470c9a2 -> :sswitch_6
        0x251e3561 -> :sswitch_0
        0x28c40006 -> :sswitch_13
        0x2a623006 -> :sswitch_11
        0x3a73f58c -> :sswitch_3
        0x3ade2d22 -> :sswitch_a
        0x3d81f6ab -> :sswitch_7
        0x3fb42ca7 -> :sswitch_10
        0x4bdba061 -> :sswitch_11
        0x4c83c160 -> :sswitch_7
        0x53dce5ea -> :sswitch_d
        0x5b44a458 -> :sswitch_3
        0x5b9bbc30 -> :sswitch_9
        0x5bbf4714 -> :sswitch_1
        0x5c17b1a9 -> :sswitch_4
        0x5ce740d0 -> :sswitch_4
        0x615e4b9f -> :sswitch_b
        0x6750bf13 -> :sswitch_d
        0x69fbd98d -> :sswitch_14
        0x7a2dcaaf -> :sswitch_0
        0x7b2bd141 -> :sswitch_e
        0x7c4d32a1 -> :sswitch_b
    .end sparse-switch
.end method

.method public final onPause()V
    .locals 24

    const/4 v1, 0x0

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

    const v16, -0x73943161

    sget v17, Ll/֡֡;->᩶ۤ۠:I

    sget v18, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v19, "\u06db\u05ab"

    invoke-static/range {v19 .. v19}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v18

    mul-int/lit8 v19, v19, -0x5

    xor-int v0, v19, v17

    mul-int/lit16 v0, v0, 0x6b75

    const v21, 0x7fcf497c

    xor-int v0, v0, v21

    const v21, -0x3610c238    # -1959865.0f

    xor-int v19, v19, v21

    move-object v3, v2

    move-object/from16 v16, v4

    move-object v13, v12

    move-object v5, v15

    move/from16 v20, v19

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v19, -0x73943161

    const/16 v21, 0x0

    :goto_0
    xor-int v6, v19, v17

    mul-int/lit16 v6, v6, -0x10c3

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v0, v6

    xor-int v19, v20, v0

    sparse-switch v19, :sswitch_data_0

    move-object/from16 v6, p0

    move/from16 v20, v1

    sget-object v16, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    .line 54
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v0

    if-eqz v0, :cond_d

    goto/16 :goto_7

    .line 40
    :sswitch_0
    sget-boolean v0, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v0, :cond_0

    :goto_1
    move-object/from16 v6, p0

    move/from16 v20, v1

    goto/16 :goto_5

    :cond_0
    move-object/from16 v6, p0

    move/from16 v20, v1

    goto/16 :goto_7

    .line 52
    :sswitch_1
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v0, :cond_2

    :cond_1
    move-object/from16 v6, p0

    move/from16 v20, v1

    goto/16 :goto_4

    :cond_2
    move-object/from16 v6, p0

    move/from16 v20, v1

    goto/16 :goto_2

    :sswitch_2
    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-nez v0, :cond_1

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto :goto_1

    .line 12
    :sswitch_4
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    return-void

    :sswitch_5
    const v0, 0x7d2e8633

    xor-int/2addr v0, v4

    move-object/from16 v6, p0

    .line 56
    invoke-virtual {v6, v1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 57
    invoke-super/range {p0 .. p0}, Ll/۫ܶۘ;->onPause()V

    return-void

    :sswitch_6
    move-object/from16 v6, p0

    .line 0
    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    .line 34
    sget v0, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v0, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v0, "\u1a79\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    move/from16 v20, v1

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x4d8f

    const v22, -0x2b00d568

    xor-int v1, v1, v22

    const v22, -0x5a1c8666

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v6, p0

    move/from16 v20, v1

    const/16 v0, 0x2d

    const/4 v1, 0x3

    .line 0
    invoke-static {v5, v0, v1, v12}, Ll/ۗܳ;->ۡܿۘ([SIII)Ljava/lang/String;

    move-result-object v3

    sget v0, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v0, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v0, "\u06e0\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0xf

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x767d

    const v22, -0x41b77ce6

    xor-int v1, v1, v22

    const v22, 0x104ce04

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v6, p0

    const v0, 0x7e518b13

    xor-int v1, v2, v0

    sget-object v5, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    .line 46
    sget v0, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v0, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u05ab\u06e2"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    move/from16 v20, v1

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x6c29

    const v22, -0x3669a4c5

    xor-int v1, v1, v22

    const v22, 0x7ad3f413

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v6, p0

    move/from16 v20, v1

    .line 0
    invoke-static {v13, v14, v15, v12}, Ll/֨֫;->ܺᩴܳ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    .line 4
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v0

    if-gtz v0, :cond_6

    :goto_2
    const-string v0, "\u06e4\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0xb

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x75b9

    const v22, 0x6170a177

    xor-int v1, v1, v22

    const v22, -0x6ea8d758

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u05ab\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x7cc3

    const v22, 0x4755420d

    xor-int v1, v1, v22

    const v22, -0x7dc1c186

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v6, p0

    move/from16 v20, v1

    .line 0
    sget-object v13, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/16 v14, 0x2a

    const/4 v15, 0x3

    .line 32
    sget v0, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v0, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v0, "\u06df\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x7c5b

    const v22, 0x9a65c2b

    xor-int v1, v1, v22

    const v22, -0x2b06698f

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v6, p0

    move/from16 v20, v1

    const/16 v0, 0x78

    const/16 v12, 0x78

    goto :goto_3

    :sswitch_c
    move-object/from16 v6, p0

    move/from16 v20, v1

    const/16 v0, 0x6acc

    const/16 v12, 0x6acc

    :goto_3
    const-string v0, "\u073a\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x4c4d

    const v22, 0x7bc146a6

    xor-int v1, v1, v22

    const v22, 0x5b29b916

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v6, p0

    move/from16 v20, v1

    add-int v0, v7, v11

    mul-int v0, v0, v0

    sub-int/2addr v0, v10

    if-lez v0, :cond_8

    const-string v0, "\u073d\u0733"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x19

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x588d

    const v22, 0xe29b987

    xor-int v1, v1, v22

    const v22, -0x63e39b78

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u06d6\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x2f3f

    const v22, -0x288e2b81

    xor-int v1, v1, v22

    const v22, 0x5515cc88

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v6, p0

    move/from16 v20, v1

    add-int v0, v8, v9

    add-int v10, v0, v0

    const/16 v11, 0x274b

    .line 53
    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v0, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v0, "\u1a7b\u0733"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x7b89

    const v22, -0x44314bf1

    xor-int v1, v1, v22

    const v22, -0x3f1c457

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v6, p0

    move/from16 v20, v1

    mul-int v8, v7, v7

    const v9, 0x607eff9

    .line 2
    sget v0, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v0, :cond_a

    :goto_4
    const-string v0, "\u06d7\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x77

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x1821

    const v22, 0xe310673

    xor-int v1, v1, v22

    const v22, 0x199ca1f6

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u1a7a\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x23

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x2369

    const v22, 0x1b0117fc

    xor-int v1, v1, v22

    const v22, 0x1228632d

    goto/16 :goto_8

    :sswitch_10
    move-object/from16 v6, p0

    move/from16 v20, v1

    aget-short v7, v16, v21

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v0

    if-eqz v0, :cond_b

    :goto_5
    const-string v0, "\u0736\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x71e9

    const v22, 0x404452bb

    xor-int v1, v1, v22

    const v22, -0x2f44462c

    goto/16 :goto_8

    :cond_b
    const-string v0, "\u1a79\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x49

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x7705

    const v22, -0x22c9253

    xor-int v1, v1, v22

    const v22, 0x601b838e

    goto :goto_8

    :sswitch_11
    move-object/from16 v6, p0

    move/from16 v20, v1

    const/16 v21, 0x29

    .line 28
    sget-boolean v0, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v0, :cond_c

    move/from16 v1, v20

    :goto_6
    const-string v0, "\u1a77\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    move/from16 v20, v1

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x28f9

    const v22, 0x2665ea6c

    xor-int v1, v1, v22

    const v22, 0x60ebb4eb

    goto :goto_8

    :cond_c
    const-string v0, "\u1a7a\u073d"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x1617

    const v22, 0x4f0476af    # 2.2223706E9f

    xor-int v1, v1, v22

    const v22, 0x3013dad3

    goto :goto_8

    :goto_7
    const-string v0, "\u073d\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x65

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x6d3

    const v22, -0x17d847e7

    xor-int v1, v1, v22

    const v22, 0x67667317

    goto :goto_8

    :cond_d
    const-string v0, "\u1a79\u06da"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x63

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x61eb

    const v22, -0x32d87e8d

    xor-int v1, v1, v22

    const v22, -0x31943a00

    :goto_8
    xor-int v0, v0, v22

    move/from16 v23, v20

    move/from16 v20, v0

    move v0, v1

    move/from16 v1, v23

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7efb6449 -> :sswitch_3
        -0x7ca9963d -> :sswitch_b
        -0x6df24a3e -> :sswitch_8
        -0x6dcb8f34 -> :sswitch_b
        -0x5f00ada3 -> :sswitch_d
        -0x57d26a48 -> :sswitch_11
        -0x56146ca9 -> :sswitch_7
        -0x4f802844 -> :sswitch_11
        -0x439431d8 -> :sswitch_f
        -0x3671b10b -> :sswitch_9
        -0x3233a33e -> :sswitch_4
        -0x31ebeeec -> :sswitch_8
        -0x21e3b40a -> :sswitch_e
        -0x1e85fb2a -> :sswitch_d
        -0x1635509a -> :sswitch_5
        -0x14b1e698 -> :sswitch_c
        0x63fcde9 -> :sswitch_f
        0x1703da8e -> :sswitch_a
        0x193f8e4b -> :sswitch_c
        0x1b6ee846 -> :sswitch_0
        0x1fc4f5a4 -> :sswitch_2
        0x20492e7a -> :sswitch_4
        0x2803cebd -> :sswitch_9
        0x2aba0390 -> :sswitch_2
        0x2cc21697 -> :sswitch_0
        0x36f9db67 -> :sswitch_7
        0x38d48e70 -> :sswitch_1
        0x38f28a95 -> :sswitch_5
        0x3e047022 -> :sswitch_3
        0x42ee99bd -> :sswitch_10
        0x47177e65 -> :sswitch_6
        0x51ab32f9 -> :sswitch_6
        0x5d237c9b -> :sswitch_a
        0x6806c6a5 -> :sswitch_1
        0x7b498212 -> :sswitch_e
        0x7c3a7f33 -> :sswitch_10
    .end sparse-switch
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 10

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x347d969c

    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    const-string v6, "\u06e4\u0733"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xd65

    const v8, 0x39a00f8e

    xor-int/2addr v7, v8

    const v8, 0x1a004128

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x5165

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    goto/16 :goto_4

    .line 13
    :sswitch_0
    sget-boolean v6, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v6, :cond_a

    goto/16 :goto_2

    :sswitch_1
    sget-boolean v6, Ll/֨۟;->ܿ᩻۫:Z

    if-nez v6, :cond_8

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    sget v6, Ll/۟;->ۨᩴۛ:I

    if-ltz v6, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v6, "\u1a7a\u05ab"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5caf

    const v8, -0x337b3891    # -6.9614456E7f

    xor-int/2addr v7, v8

    const v8, 0x726f3584

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    return-void

    .line 123
    :sswitch_4
    new-instance v6, Ll/᩺᩸ۖ;

    sget-object v7, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    .line 70
    sget v8, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v8, :cond_1

    goto/16 :goto_4

    :cond_1
    const/16 v8, 0x31

    const/4 v9, 0x3

    .line 123
    invoke-static {v7, v8, v9, v2}, Ll/ۧ;->۫֨۠([SIII)Ljava/lang/String;

    move-result-object v7

    .line 44
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v8

    if-eqz v8, :cond_2

    goto/16 :goto_2

    .line 123
    :cond_2
    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sget-boolean v8, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v8, :cond_3

    goto/16 :goto_3

    :cond_3
    const v8, 0x7d128adb

    xor-int/2addr v7, v8

    invoke-static {p0, v7}, Ll/֡ۚ;->۬֡ۜ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v7

    .line 36
    sget v8, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v8, :cond_4

    goto/16 :goto_4

    .line 123
    :cond_4
    iget-object v8, p0, Ll/ۛ᩺ۘ;->ۚܰ:Ll/۫᩺ۘ;

    invoke-virtual {v8}, Ll/۫᩺ۘ;->ܰ()Ll/ۛۨۨ;

    move-result-object v8

    .line 51
    sget v9, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v9, :cond_5

    goto/16 :goto_3

    .line 123
    :cond_5
    invoke-direct {v6, p0, v7, v8}, Ll/᩺᩸ۖ;-><init>(Ll/ۛ᩺ۘ;Landroid/view/View;Ll/ۛۨۨ;)V

    iput-object v6, p0, Ll/ۛ᩺ۘ;->᩹ܰ:Ll/᩺᩸ۖ;

    .line 124
    sget-object p1, Ll/ܿ᩺ۘ;->ۛ:Ljava/lang/String;

    invoke-virtual {v6, p1}, Ll/᩺᩸ۖ;->ۙ(Ljava/lang/String;)V

    return-void

    .line 121
    :sswitch_5
    move-object v6, p2

    check-cast v6, Ll/۫᩺ۘ;

    iput-object v6, p0, Ll/ۛ᩺ۘ;->ۚܰ:Ll/۫᩺ۘ;

    .line 122
    invoke-virtual {v6}, Ll/۫᩺ۘ;->ۨ()V

    .line 63
    sget v6, Ll/۟;->ۨᩴۛ:I

    if-ltz v6, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v6, "\u1a7b\u06df"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x43

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1a79

    const v8, 0x6a6e4f48

    xor-int/2addr v7, v8

    const v8, 0x1f05a2cd

    goto/16 :goto_0

    :sswitch_6
    const/16 v2, 0x57eb

    goto :goto_1

    :sswitch_7
    const v2, 0xf0b1

    :goto_1
    const-string v6, "\u06df\u06df"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4197

    const v8, -0x497cb111

    xor-int/2addr v7, v8

    const v8, -0x58868c3e

    goto/16 :goto_0

    :sswitch_8
    const v6, 0xcf84

    mul-int v6, v6, v0

    sub-int/2addr v6, v1

    if-lez v6, :cond_7

    const-string v6, "\u0736\u1a74"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x3d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x374d

    const v8, 0xeca0268

    xor-int/2addr v7, v8

    const v8, 0x44729e17

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u1a76\u06e4"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x71b3

    const v8, 0x3d16bd83

    xor-int/2addr v7, v8

    const v8, -0x472d4119

    goto/16 :goto_0

    :sswitch_9
    add-int/lit16 v1, v0, 0x33e1

    mul-int v1, v1, v1

    .line 28
    sget-boolean v6, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v6, :cond_9

    :cond_8
    :goto_2
    const-string v6, "\u0733\u1a79"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x13

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7b8f

    const v8, 0x3140746f

    xor-int/2addr v7, v8

    const v8, 0x2d52ecd9

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u073f\u06eb"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5e1f

    const v8, -0x4b4ab15e

    xor-int/2addr v7, v8

    const v8, -0x73acccc5

    goto/16 :goto_0

    :sswitch_a
    const/16 v0, 0x30

    aget-short v0, p1, v0

    .line 101
    sget v6, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v6, :cond_b

    :cond_a
    const-string v6, "\u06eb\u05a8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x75

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x159f

    const v8, 0x275a4338

    xor-int/2addr v7, v8

    const v8, 0x58ea8a8c

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06e1\u06db"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5e4f

    const v8, -0x246b23d0

    xor-int/2addr v7, v8

    const v8, -0x7eecd46d

    goto/16 :goto_0

    :sswitch_b
    sget-object p1, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    .line 65
    sget-boolean v6, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v6, :cond_c

    :goto_3
    const-string v6, "\u0730\u073f"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x53

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1df7

    const v8, -0x131d4173

    xor-int/2addr v7, v8

    const v8, 0x5905a45d

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06e1\u06e2"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2689

    const v8, -0x5edd4190

    xor-int/2addr v7, v8

    const v8, 0x316bf137

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v6, :cond_d

    :goto_4
    const-string v6, "\u06eb\u073f"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x69

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3d4b

    const v8, 0x2e64ca9a

    xor-int/2addr v7, v8

    const v8, 0x75329894

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u073a\u06d6"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x239b

    const v8, 0x207eec18

    xor-int/2addr v7, v8

    const v8, 0x47f74ac1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fd063b3 -> :sswitch_5
        -0x7bed4ce4 -> :sswitch_4
        -0x7aab0eba -> :sswitch_a
        -0x7a988edc -> :sswitch_6
        -0x7800b42e -> :sswitch_2
        -0x6b33e8dd -> :sswitch_b
        -0x69d0ba8b -> :sswitch_9
        -0x65bf6548 -> :sswitch_0
        -0x52ef8a47 -> :sswitch_1
        -0x4602d9b7 -> :sswitch_7
        -0x41719be3 -> :sswitch_6
        -0x36f61623 -> :sswitch_3
        -0x28c0eded -> :sswitch_5
        -0x21430432 -> :sswitch_a
        -0x14ffbbf8 -> :sswitch_8
        -0x12aaca62 -> :sswitch_2
        -0xeaab248 -> :sswitch_9
        0x98a44a6 -> :sswitch_c
        0x24405361 -> :sswitch_4
        0x2a0137d8 -> :sswitch_3
        0x37b1162c -> :sswitch_b
        0x3a52997b -> :sswitch_1
        0x57065311 -> :sswitch_7
        0x6384026f -> :sswitch_8
        0x68d308b9 -> :sswitch_0
        0x6a4627d6 -> :sswitch_c
    .end sparse-switch
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method

.method public final onStop()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x1efcae57

    sget v2, Ll/֫ܳ;->᩶ۧۛ:I

    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    const-string v4, "\u073d\u05ab"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7931

    const v6, -0x41e83a69

    xor-int/2addr v5, v6

    const v6, 0x2d42dc14

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x39ff

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 64
    new-instance v4, Landroid/content/Intent;

    const-class v5, Ll/ܿ᩺ۘ;

    .line 63
    sget-boolean v6, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v6, :cond_1

    goto/16 :goto_5

    .line 9
    :sswitch_0
    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v4, :cond_b

    goto/16 :goto_4

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget-boolean v4, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v4, :cond_7

    goto/16 :goto_6

    :sswitch_2
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-lez v4, :cond_e

    goto/16 :goto_4

    .line 12
    :sswitch_3
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    goto/16 :goto_4

    .line 6
    :sswitch_4
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    return-void

    .line 70
    :sswitch_5
    invoke-static {p0}, Ll/֡۠;->۫᩵ۙ(Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_6
    return-void

    .line 67
    :sswitch_7
    invoke-virtual {v0}, Ll/۫᩺ۘ;->ۖ()V

    goto :goto_2

    .line 69
    :sswitch_8
    invoke-static {p0}, Ll/ۗܺ;->ܰۡ֨(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "\u06d7\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6057

    const v6, 0x45187b3a

    xor-int/2addr v5, v6

    const v6, -0x718a1c6

    goto :goto_0

    :cond_0
    :goto_1
    const-string v4, "\u0733\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5beb

    const v6, 0x585d6a5e

    xor-int/2addr v5, v6

    const v6, -0x325e5cba

    goto :goto_0

    .line 64
    :cond_1
    invoke-direct {v4, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 65
    invoke-virtual {p0, v4}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    goto :goto_2

    .line 66
    :sswitch_9
    iget-object v0, p0, Ll/ۛ᩺ۘ;->ۚܰ:Ll/۫᩺ۘ;

    if-eqz v0, :cond_2

    const-string v4, "\u1a79\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x28dd

    const v6, -0x7084b700

    xor-int/2addr v5, v6

    const v6, 0x797d494b

    goto/16 :goto_0

    :cond_2
    :goto_2
    const-string v4, "\u06d9\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x73f7

    const v6, 0x2bc98e0b

    xor-int/2addr v5, v6

    const v6, 0x7f2709de

    goto/16 :goto_0

    .line 63
    :sswitch_a
    iget-boolean v4, p0, Ll/ۛ᩺ۘ;->֨ܰ:Z

    if-eqz v4, :cond_3

    const-string v4, "\u06da\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x28eb

    const v6, -0x44f64d31

    xor-int/2addr v5, v6

    const v6, 0xd3a95fd

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u1a7b\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5191

    const v6, -0x163d032b

    xor-int/2addr v5, v6

    const v6, 0x47c5b382

    goto/16 :goto_0

    .line 10
    :sswitch_b
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_4

    goto :goto_3

    :cond_4
    const-string v4, "\u073f\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x54d1

    const v6, -0x2993d1df

    xor-int/2addr v5, v6

    const v6, 0x1abfad0d

    goto/16 :goto_0

    .line 13
    :sswitch_c
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v4

    if-gtz v4, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v4, "\u073d\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4947

    const v6, 0x5e45659

    xor-int/2addr v5, v6

    const v6, -0x28d4bde4

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u06e7\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2c7

    const v6, 0x4603f7b7

    xor-int/2addr v5, v6

    const v6, 0x1c4e163e

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_8

    :cond_7
    :goto_3
    const-string v4, "\u1a74\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x20c3

    const v6, 0x30450b8c

    xor-int/2addr v5, v6

    const v6, -0x154cb307

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u073d\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6c5b

    const v6, -0x6eb8bf8e

    xor-int/2addr v5, v6

    const v6, -0x43c8dbdc

    goto/16 :goto_0

    .line 32
    :sswitch_f
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_9

    :goto_4
    const-string v4, "\u06d6\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x45db

    const v6, 0x4b127eb8    # 9600696.0f

    xor-int/2addr v5, v6

    const v6, 0x4afaa2f5    # 8212858.5f

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e7\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xbf1

    const v6, 0x1922a8b6

    xor-int/2addr v5, v6

    const v6, 0x62536998

    goto/16 :goto_0

    .line 26
    :sswitch_10
    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_a

    goto/16 :goto_6

    :cond_a
    const-string v4, "\u1a78\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x55

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xb27

    const v6, -0x2f77c97a

    xor-int/2addr v5, v6

    const v6, 0x3d5898b

    goto/16 :goto_0

    .line 6
    :sswitch_11
    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v4, :cond_c

    :cond_b
    const-string v4, "\u073f\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x72c9

    const v6, 0x69ff7db8

    xor-int/2addr v5, v6

    const v6, -0x1151f69d

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073a\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x917

    const v6, -0x33fb9337    # -3.4714404E7f

    xor-int/2addr v5, v6

    const v6, 0x1a5a58e5

    goto/16 :goto_0

    .line 9
    :sswitch_12
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_d

    :goto_5
    const-string v4, "\u06e8\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5335

    const v6, 0x4481c307

    xor-int/2addr v5, v6

    const v6, -0x49aab6f

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e7\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3fab

    const v6, -0x6516d246

    xor-int/2addr v5, v6

    const v6, -0x42155d2e

    goto/16 :goto_0

    .line 62
    :sswitch_13
    invoke-super {p0}, Ll/۫ܶۘ;->onStop()V

    .line 46
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v4

    if-gtz v4, :cond_f

    :cond_e
    :goto_6
    const-string v4, "\u1a75\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3e31

    const v6, -0x3115bc08

    xor-int/2addr v5, v6

    const v6, -0x7a0822d8

    goto/16 :goto_0

    :cond_f
    const-string v4, "\u1a79\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5c77

    const v6, 0x39e4e39e

    xor-int/2addr v5, v6

    const v6, -0x3a68fded

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x799ed5c2 -> :sswitch_d
        -0x769d58fd -> :sswitch_e
        -0x7395bcfd -> :sswitch_1
        -0x66491a9d -> :sswitch_13
        -0x65cbaea8 -> :sswitch_f
        -0x5b4737cd -> :sswitch_b
        -0x48ff8795 -> :sswitch_2
        -0x398cd649 -> :sswitch_13
        -0x33aef884 -> :sswitch_c
        -0x32248712 -> :sswitch_11
        -0x240a7df5 -> :sswitch_12
        -0xee7661c -> :sswitch_4
        -0xa3a6a9d -> :sswitch_3
        0x181646b -> :sswitch_2
        0x1dc1780 -> :sswitch_0
        0x495d3bc -> :sswitch_c
        0x59ffc8c -> :sswitch_1
        0x12c86a4e -> :sswitch_7
        0x13d69775 -> :sswitch_5
        0x13ecf871 -> :sswitch_11
        0x14467833 -> :sswitch_8
        0x18e951bf -> :sswitch_d
        0x21718e32 -> :sswitch_9
        0x217e610a -> :sswitch_6
        0x218c2cd9 -> :sswitch_9
        0x2690568b -> :sswitch_6
        0x2ea52a36 -> :sswitch_12
        0x3ce11cf7 -> :sswitch_f
        0x40c99d9d -> :sswitch_3
        0x47a1054a -> :sswitch_10
        0x4b2b15d0 -> :sswitch_10
        0x4b6b9c70 -> :sswitch_4
        0x5213fc06 -> :sswitch_5
        0x6419b290 -> :sswitch_e
        0x678c4f71 -> :sswitch_a
        0x69c78193 -> :sswitch_0
        0x6a8e4c63 -> :sswitch_a
        0x75fa3baf -> :sswitch_8
        0x774a9bce -> :sswitch_b
        0x7b8db412 -> :sswitch_7
    .end sparse-switch
.end method

.method public final ۙ(Ll/ۘܶۘ;)V
    .locals 0

    return-void
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

    const v10, 0x4f34358c

    sget v11, Ll/֫ܽ;->֡ᩴܶ:I

    sget v12, Ll/ۘۗ;->ۖۧ۬:I

    const-string v13, "\u073d\u0736"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0xb

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x1e21

    const v15, -0x58e80213

    xor-int/2addr v14, v15

    const v15, -0x56a9dc5f

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x1043

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    const/16 v7, 0x5f23

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    sget v13, Ll/ۗ;->֨۬ۖ:I

    if-ltz v13, :cond_3

    goto/16 :goto_5

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget v13, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v13, :cond_a

    goto/16 :goto_2

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v13, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v13, :cond_7

    goto/16 :goto_5

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    goto/16 :goto_5

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v0, 0x11

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/֫ܶ;->۟ۢۚ([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    sget-object v8, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    const/16 v9, 0x35

    .line 3
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v13

    if-ltz v13, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v13, "\u05a8\u1a74"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x35

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x55d5

    const v15, -0x699535b1

    xor-int/2addr v14, v15

    const v15, 0x3c49423e

    goto :goto_0

    :sswitch_7
    const v7, 0x9145

    :goto_1
    const-string v13, "\u0730\u1a7a"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x13

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1ec9

    const v15, -0x120f9f35

    xor-int/2addr v14, v15

    const v15, 0x3f1731c2

    goto :goto_0

    :sswitch_8
    mul-int v13, v6, v6

    sub-int/2addr v13, v4

    if-gez v13, :cond_1

    const-string v13, "\u1a7a\u06d8"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x69

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2d2d

    const v15, -0x21c6cd8

    xor-int/2addr v14, v15

    const v15, 0x412cff2

    goto/16 :goto_0

    :cond_1
    const-string v13, "\u06d6\u1a7a"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x9

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3b9b

    const v15, 0x4ce6650

    xor-int/2addr v14, v15

    const v15, 0x1b969e37

    goto/16 :goto_0

    :sswitch_9
    add-int v6, v2, v5

    sget v13, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v13, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v13, "\u1a79\u06da"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x47ef

    const v15, -0x5399b41e

    xor-int/2addr v14, v15

    const v15, 0x72013886

    goto/16 :goto_0

    :sswitch_a
    mul-int v4, v2, v3

    const/16 v5, 0x3a3d

    .line 1
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v13

    if-gtz v13, :cond_4

    :cond_3
    const-string v13, "\u06e4\u05a1"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x77

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x1701

    const v15, 0x5f56c44

    xor-int/2addr v14, v15

    const v15, 0x3ad8827a

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u06eb\u06d6"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x9

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x47d7

    const v15, 0x62f832ba

    xor-int/2addr v14, v15

    const v15, 0x36b055a2

    goto/16 :goto_0

    :sswitch_b
    aget-short v2, v0, v1

    const v3, 0xe8f4

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v13

    if-ltz v13, :cond_5

    goto :goto_3

    :cond_5
    const-string v13, "\u05a8\u1a73"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4b89

    const v15, -0x64d15774

    xor-int/2addr v14, v15

    const v15, 0x49b313c2    # 1467000.2f

    goto/16 :goto_0

    :sswitch_c
    const/16 v1, 0x34

    sget v13, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v13, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v13, "\u05a1\u06e0"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0xd

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3867

    const v15, -0x2e18df9d

    xor-int/2addr v14, v15

    const v15, 0x5216e55d

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v13, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v13, :cond_8

    :cond_7
    :goto_2
    const-string v13, "\u06eb\u06df"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x35d5

    const v15, -0x3356eb93    # -8.8646504E7f

    xor-int/2addr v14, v15

    const v15, 0x34b96913

    goto/16 :goto_0

    :cond_8
    const-string v13, "\u06e4\u073a"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x164f

    const v15, -0x41599a8d

    xor-int/2addr v14, v15

    const v15, -0x1731a037

    goto/16 :goto_0

    :sswitch_e
    sget v13, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v13, :cond_9

    :goto_3
    const-string v13, "\u1a76\u1a76"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x3

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7755

    const v15, 0x5acdc350

    xor-int/2addr v14, v15

    const v15, 0x4a4d7f84    # 3366881.0f

    goto/16 :goto_0

    :cond_9
    const-string v13, "\u073d\u06d6"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x1f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x371

    const v15, 0x16bc1115

    xor-int/2addr v14, v15

    const v15, -0x1c46e819    # -6.82874E21f

    goto/16 :goto_0

    .line 3
    :sswitch_f
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v13

    if-eqz v13, :cond_b

    :cond_a
    :goto_4
    const-string v13, "\u1a73\u073d"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x11

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x5d93

    const v15, 0x23b174ff

    xor-int/2addr v14, v15

    const v15, -0x2d580bc1

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u06e0\u1a73"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x4847

    const v15, -0x2855e72b

    xor-int/2addr v14, v15

    const v15, -0x58b7fc44    # -2.77576E-15f

    goto/16 :goto_0

    .line 0
    :sswitch_10
    sget v13, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v13, :cond_c

    goto :goto_5

    :cond_c
    const-string v13, "\u1a76\u1a73"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x41ef

    const v15, 0x696e36b7

    xor-int/2addr v14, v15

    const v15, -0x3959ccaf

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ۛ᩺ۘ;->ᩴ᩸ۡ:[S

    .line 2
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v13

    if-gtz v13, :cond_d

    :goto_5
    const-string v13, "\u06e7\u05a8"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3831

    const v15, -0x7c00bba0

    xor-int/2addr v14, v15

    const v15, 0x62ba7a10

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u0733\u073a"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1671

    const v15, 0x686c18d9

    xor-int/2addr v14, v15

    const v15, 0x1d74b372

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x76f92b24 -> :sswitch_4
        -0x72bacef3 -> :sswitch_0
        -0x72b01bd6 -> :sswitch_6
        -0x686cafcd -> :sswitch_d
        -0x66418996 -> :sswitch_8
        -0x5e76f6e5 -> :sswitch_b
        -0x5113d1d6 -> :sswitch_1
        -0x4d5e007d -> :sswitch_1
        -0x41fd075b -> :sswitch_6
        -0x3f014c6a -> :sswitch_2
        -0x3ec93f68 -> :sswitch_10
        -0x3da8ad13 -> :sswitch_9
        -0x3bf2ad1d -> :sswitch_4
        -0x254fd96f -> :sswitch_11
        -0x21e204b6 -> :sswitch_a
        -0x21429de3 -> :sswitch_2
        -0x20fa3ed6 -> :sswitch_3
        -0x13d24825 -> :sswitch_f
        -0x937df88 -> :sswitch_10
        0x24e71c5 -> :sswitch_3
        0x260dc82 -> :sswitch_7
        0x20bb53a7 -> :sswitch_c
        0x30e6cd6c -> :sswitch_e
        0x3954c6b8 -> :sswitch_5
        0x48262ce9 -> :sswitch_0
        0x4ab3ecd2 -> :sswitch_e
        0x4eb3d668 -> :sswitch_7
        0x510b5caf -> :sswitch_f
        0x557cd82b -> :sswitch_b
        0x5b7fe825 -> :sswitch_5
        0x60670f17 -> :sswitch_8
        0x60f43ab5 -> :sswitch_a
        0x778b231f -> :sswitch_11
        0x7b8a4c81 -> :sswitch_d
        0x7f11bcf4 -> :sswitch_9
        0x7f60a25c -> :sswitch_c
    .end sparse-switch
.end method

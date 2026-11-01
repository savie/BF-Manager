.class public final Ll/ܽᩴۘ;
.super Ljava/lang/Object;
.source "C2R7"


# static fields
.field private static final ۘ֨ۧ:[S


# instance fields
.field public final ֨:Ll/᩵֨;

.field public ۖ:Z

.field public final ۘ:Ljava/lang/String;

.field public final ۙ:J

.field public ۚ:Z

.field public final ۜ:I

.field public ۨ:Ljava/lang/String;

.field public ۬:Z

.field public ܰ:Ll/۫ᩴۘ;

.field public final ܶ:Ljava/lang/String;

.field public final ᩸:I

.field public final ᩹:Ll/᩵֨;

.field public final ᩺:Landroid/content/pm/PackageInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܽᩴۘ;->ۘ֨ۧ:[S

    return-void

    :array_0
    .array-data 2
        0x126cs
        -0x11abs
        -0x11abs
        -0x11abs
        -0x11abs
        -0x11abs
        -0x11abs
        -0x11das
        -0x11dbs
        -0x11c7s
        -0x11c4s
        -0x11dfs
        -0x11a2s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/pm/PackageInfo;)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const v21, 0x1dc72d6d

    sget v22, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v23, Ll/ۧ;->֫۠ᩴ:I

    sget-object v24, Ll/ܽᩴۘ;->ۘ֨ۧ:[S

    const/16 v25, 0x0

    aget-short v2, v24, v25

    mul-int v24, v2, v2

    const v25, 0x15ca390

    add-int v24, v24, v25

    add-int v24, v24, v24

    add-int/lit16 v2, v2, 0x12ac

    mul-int v2, v2, v2

    sub-int v24, v24, v2

    if-ltz v24, :cond_0

    const v2, 0xee75

    goto :goto_0

    :cond_0
    const v2, 0xfe1f

    .line 1145
    :goto_0
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-string v24, "\u1a73\u0736"

    invoke-static/range {v24 .. v24}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v24

    add-int v24, v24, v23

    mul-int/lit8 v24, v24, 0x5d

    xor-int v3, v24, v22

    mul-int/lit16 v3, v3, 0x6775

    const v4, -0x66b16f32

    xor-int/2addr v3, v4

    const v4, -0x690fcf11

    xor-int v4, v24, v4

    move-wide/from16 v26, v7

    move-object v13, v10

    move-object v6, v15

    move-wide/from16 v24, v18

    move-object/from16 v10, v20

    const/4 v9, 0x0

    move v7, v4

    move-object v8, v5

    move-object v5, v14

    move-wide/from16 v19, v16

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    move v4, v3

    move-wide v14, v11

    const/4 v3, 0x0

    const/4 v12, 0x0

    :goto_1
    xor-int v11, v21, v22

    mul-int/lit16 v11, v11, -0x77af

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v4, v11

    xor-int v21, v7, v4

    sparse-switch v21, :sswitch_data_0

    move-object v4, v6

    .line 1166
    iget-wide v6, v0, Ll/ܽᩴۘ;->ۙ:J

    invoke-static {v6, v7}, Ll/֫ۧ᩺;->ۙ(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Ll/ܽᩴۘ;->ۘ:Ljava/lang/String;

    goto/16 :goto_6

    :sswitch_0
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    sget-boolean v4, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v4, :cond_1

    :goto_2
    move-object v4, v6

    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move/from16 v17, v2

    move/from16 v16, v3

    goto/16 :goto_f

    :cond_1
    :goto_3
    move-object v4, v6

    move-wide/from16 v6, v17

    move/from16 v17, v2

    move-object/from16 v2, v16

    move/from16 v16, v3

    goto/16 :goto_d

    .line 988
    :sswitch_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v4

    if-gtz v4, :cond_2

    goto :goto_2

    :cond_2
    :goto_4
    move-object v4, v6

    goto/16 :goto_7

    :sswitch_2
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_3

    goto :goto_2

    :cond_3
    move-object v4, v6

    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move/from16 v17, v2

    goto/16 :goto_b

    .line 187
    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto :goto_2

    .line 936
    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 1169
    :sswitch_5
    new-instance v1, Ll/᩵֨;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v2, v9}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-direct {v1, v2}, Ll/᩵֨;-><init>(Landroid/graphics/drawable/Drawable;)V

    iput-object v1, v0, Ll/ܽᩴۘ;->֨:Ll/᩵֨;

    return-void

    .line 1168
    :sswitch_6
    new-instance v4, Ll/᩵֨;

    new-instance v7, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v7, v9}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-direct {v4, v7}, Ll/᩵֨;-><init>(Landroid/graphics/drawable/Drawable;)V

    iput-object v4, v0, Ll/ܽᩴۘ;->᩹:Ll/᩵֨;

    .line 680
    sget-boolean v4, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    const-string v4, "\u06d6\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v22, v4

    mul-int/lit8 v4, v4, -0x7b

    xor-int v7, v4, v23

    mul-int/lit16 v7, v7, -0x26e3

    const v11, 0x48fdaa8f

    xor-int/2addr v7, v11

    const v11, -0x4ec33c64

    goto/16 :goto_5

    :sswitch_7
    add-long v19, v19, v24

    add-int/lit8 v3, v3, 0x1

    move-object v4, v6

    goto/16 :goto_8

    .line 1159
    :sswitch_8
    aget-object v4, v8, v3

    .line 1160
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v24

    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_5

    move-object v4, v6

    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move/from16 v17, v2

    move/from16 v16, v3

    goto/16 :goto_c

    :cond_5
    const-string v4, "\u073d\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v22

    mul-int/lit8 v4, v4, -0x2d

    xor-int v7, v4, v23

    mul-int/lit16 v7, v7, 0x7d1b

    const v11, -0x61392fa7

    xor-int/2addr v7, v11

    const v11, 0x1ae2f332

    goto/16 :goto_5

    .line 1164
    :sswitch_9
    invoke-static {v14, v15}, Ll/֫ۧ᩺;->ۙ(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Ll/ܽᩴۘ;->ۘ:Ljava/lang/String;

    move-object v4, v6

    goto/16 :goto_6

    :sswitch_a
    const/4 v4, 0x4

    const/16 v7, 0x9

    invoke-static {v10, v4, v7, v2}, Ll/ۖۛ;->ܿۤ۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-boolean v4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06db\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v22

    mul-int/lit8 v4, v4, 0x41

    xor-int v7, v4, v23

    mul-int/lit16 v7, v7, -0x5749

    const v11, -0x44a0e033

    xor-int/2addr v7, v11

    const v11, -0x202c124c

    goto :goto_5

    :sswitch_b
    iget-wide v10, v0, Ll/ܽᩴۘ;->ۙ:J

    invoke-static {v10, v11}, Ll/֫ۧ᩺;->ۙ(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v10, Ll/ܽᩴۘ;->ۘ֨ۧ:[S

    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string v4, "\u05ab\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v23

    mul-int/lit8 v4, v4, -0x5d

    xor-int v7, v4, v22

    mul-int/lit16 v7, v7, 0xe9f

    const v11, 0x78a544d3

    xor-int/2addr v7, v11

    const v11, 0x37e7581d

    goto :goto_5

    :sswitch_c
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-static {v6, v4}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v6, v13}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v4, "\u05a1\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v22

    xor-int v7, v4, v23

    mul-int/lit16 v7, v7, -0x3b95

    const v11, 0x573c68c4

    xor-int/2addr v7, v11

    const v11, -0x7824da7a

    :goto_5
    xor-int/2addr v4, v11

    move/from16 v28, v7

    move v7, v4

    move/from16 v4, v28

    goto/16 :goto_1

    :goto_6
    const-string v6, "\u1a73\u073a"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v23

    xor-int v7, v6, v22

    mul-int/lit16 v7, v7, 0x7549

    const v11, 0x68b6ff20

    xor-int/2addr v7, v11

    const v11, 0x306d59c5

    goto/16 :goto_9

    :sswitch_d
    move-object v4, v6

    .line 1166
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-static {v5, v6}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5, v13}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    sget v6, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v6, :cond_9

    :goto_7
    const-string v6, "\u05a1\u1a7a"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v23

    mul-int/lit8 v6, v6, 0x3f

    xor-int v7, v6, v22

    mul-int/lit16 v7, v7, -0x2993

    const v11, -0x13d81887

    xor-int/2addr v7, v11

    const v11, -0x1fcda65c

    goto/16 :goto_9

    :cond_9
    const-string v6, "\u1a79\u06dc"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v23

    xor-int v7, v6, v22

    mul-int/lit16 v7, v7, -0x6ef

    const v11, -0x2a91464b

    xor-int/2addr v7, v11

    const v11, -0xc4ddb05

    goto/16 :goto_9

    :sswitch_e
    move-object v4, v6

    if-ge v3, v12, :cond_a

    const-string v6, "\u06db\u05ab"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v23

    mul-int/lit8 v6, v6, 0x13

    xor-int v7, v6, v22

    mul-int/lit16 v7, v7, 0x400f

    const v11, -0x5f24d0bc

    xor-int/2addr v7, v11

    const v11, -0x1291410c

    goto :goto_9

    :cond_a
    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move-wide/from16 v14, v19

    goto/16 :goto_a

    :sswitch_f
    move-object v4, v6

    .line 1160
    sget-object v6, Ll/ܽᩴۘ;->ۘ֨ۧ:[S

    const/4 v7, 0x1

    const/4 v11, 0x3

    invoke-static {v6, v7, v11, v2}, Ll/ۘۛ;->᩷ۧ᩹([SIII)Ljava/lang/String;

    move-result-object v13

    cmp-long v6, v14, v26

    if-eqz v6, :cond_b

    const-string v6, "\u05a1\u06df"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    xor-int v7, v6, v23

    mul-int/lit16 v7, v7, -0x4a4d

    const v11, -0x535e213a

    xor-int/2addr v7, v11

    const v11, 0x16b9706f

    goto :goto_9

    :cond_b
    const-string v6, "\u06e2\u06db"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    xor-int v7, v6, v23

    mul-int/lit16 v7, v7, -0xd5

    const v11, -0x30863c73    # -4.1903424E9f

    xor-int/2addr v7, v11

    const v11, -0x3a4b6b5f

    goto :goto_9

    :sswitch_10
    move-object v4, v6

    .line 1159
    array-length v3, v8

    const/4 v6, 0x0

    move v12, v3

    move-wide/from16 v19, v26

    const/4 v3, 0x0

    :goto_8
    const-string v6, "\u05a8\u1a77"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v23

    xor-int v7, v6, v22

    mul-int/lit16 v7, v7, -0x3f5d

    const v11, -0x2ab8a47f

    xor-int/2addr v7, v11

    const v11, -0x6c405801

    :goto_9
    xor-int/2addr v6, v11

    move/from16 v28, v6

    move-object v6, v4

    move v4, v7

    move/from16 v7, v28

    goto/16 :goto_1

    :sswitch_11
    move-object v4, v6

    move-wide/from16 v6, v17

    .line 1155
    iput-wide v6, v0, Ll/ܽᩴۘ;->ۙ:J

    move-object/from16 v11, v16

    .line 1157
    iget-object v8, v11, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    const-wide/16 v26, 0x0

    if-eqz v8, :cond_c

    const-string v16, "\u06e2\u06dc"

    invoke-static/range {v16 .. v16}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v22

    xor-int v9, v16, v23

    mul-int/lit16 v9, v9, -0x5289

    const v18, -0x188f464c

    xor-int v9, v9, v18

    const v18, -0x7f20e64

    xor-int v16, v16, v18

    move-wide/from16 v17, v6

    move/from16 v7, v16

    move-object v6, v4

    move v4, v9

    move-object/from16 v16, v11

    const/4 v9, 0x0

    goto/16 :goto_1

    :cond_c
    move-wide/from16 v14, v26

    const/4 v9, 0x0

    :goto_a
    const-string v16, "\u06da\u06e4"

    invoke-static/range {v16 .. v16}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v16

    sub-int v16, v23, v16

    mul-int/lit8 v16, v16, 0x77

    move/from16 v17, v2

    xor-int v2, v16, v22

    mul-int/lit16 v2, v2, -0x3379

    const v18, -0x113af45e

    xor-int v2, v2, v18

    const v18, -0x2520ba48

    xor-int v16, v16, v18

    move-object/from16 v28, v4

    move v4, v2

    move/from16 v2, v17

    move-wide/from16 v17, v6

    move/from16 v7, v16

    move-object/from16 v6, v28

    goto/16 :goto_11

    :sswitch_12
    move/from16 v17, v2

    move-object v4, v6

    move-object/from16 v11, v16

    .line 1154
    iget-object v2, v11, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 1155
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v6

    .line 392
    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v2, :cond_d

    :goto_b
    const-string v2, "\u06eb\u06dc"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v22

    mul-int/lit8 v2, v2, 0x75

    move/from16 v16, v3

    xor-int v3, v2, v23

    mul-int/lit16 v3, v3, -0x5cf1

    const v18, 0x439d5322

    xor-int v3, v3, v18

    const v18, 0x53cb3bc3

    goto/16 :goto_10

    :cond_d
    move/from16 v16, v3

    const-string v2, "\u06d9\u0736"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v23

    mul-int/lit8 v2, v2, -0x45

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, -0x56dd

    const v18, -0x71a67027

    xor-int v3, v3, v18

    const v18, -0x2adf6c45

    goto/16 :goto_10

    :sswitch_13
    move-object v4, v6

    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move/from16 v17, v2

    move/from16 v16, v3

    .line 1151
    iget v2, v11, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    iput v2, v0, Ll/ܽᩴۘ;->᩸:I

    .line 1152
    invoke-static {v11}, Ll/ᩴ᩷᩺;->ۙ(Landroid/content/pm/ApplicationInfo;)I

    move-result v2

    iput v2, v0, Ll/ܽᩴۘ;->ۜ:I

    .line 1025
    sget v2, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v2, :cond_e

    :goto_c
    const-string v2, "\u05a8\u1a74"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v23

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, 0x470f

    const v18, -0x22154a3a

    xor-int v3, v3, v18

    const v18, 0x7d4d496f

    goto/16 :goto_10

    :cond_e
    const-string v2, "\u06dc\u06db"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    mul-int/lit8 v2, v2, 0x39

    xor-int v3, v2, v23

    mul-int/lit16 v3, v3, 0x25a3

    const v18, -0x19884368

    xor-int v3, v3, v18

    const v18, 0x38bd1a2e

    goto/16 :goto_10

    :sswitch_14
    move/from16 v16, v3

    move-object v4, v6

    move-wide/from16 v6, v17

    move/from16 v17, v2

    .line 1149
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {v2}, Ll/֨᩺;->ۧ۫۫(Ljava/lang/Object;)Ljava/lang/Object;

    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_f

    :goto_d
    const-string v3, "\u06da\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v22

    xor-int v11, v3, v23

    mul-int/lit16 v11, v11, 0x1d0d

    const v18, -0x5b314a67

    xor-int v11, v11, v18

    const v18, 0x1d4535b8

    goto :goto_e

    :cond_f
    const-string v3, "\u06e2\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v22

    mul-int/lit8 v3, v3, -0x5f

    xor-int v11, v3, v23

    mul-int/lit16 v11, v11, 0x750f

    const v18, 0x50d57548

    xor-int v11, v11, v18

    const v18, 0x4432456c

    :goto_e
    xor-int v3, v3, v18

    move/from16 v28, v16

    move-object/from16 v16, v2

    move/from16 v2, v17

    move-wide/from16 v17, v6

    move v7, v3

    move-object v6, v4

    move v4, v11

    move/from16 v3, v28

    goto/16 :goto_1

    :sswitch_15
    move-object v4, v6

    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move/from16 v17, v2

    move/from16 v16, v3

    .line 1146
    iput-object v1, v0, Ll/ܽᩴۘ;->᩺:Landroid/content/pm/PackageInfo;

    .line 1147
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v2, v0, Ll/ܽᩴۘ;->ܶ:Ljava/lang/String;

    .line 1087
    sget v2, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v2, :cond_10

    :goto_f
    const-string v2, "\u0730\u06d7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v23, v2

    mul-int/lit8 v2, v2, -0x1d

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, -0x1809

    const v18, 0xbbcc1d3

    xor-int v3, v3, v18

    const v18, 0x466f15e8

    goto :goto_10

    :cond_10
    const-string v2, "\u073f\u06eb"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v23

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, -0x6869

    const v18, 0xfa0c21b

    xor-int v3, v3, v18

    const v18, 0x6cbdabd2

    :goto_10
    xor-int v2, v2, v18

    move-wide/from16 v28, v6

    move v7, v2

    move-object v6, v4

    move/from16 v2, v17

    move v4, v3

    move-wide/from16 v17, v28

    move/from16 v3, v16

    :goto_11
    move-object/from16 v16, v11

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7d9c4c93 -> :sswitch_f
        -0x782c32fc -> :sswitch_7
        -0x70956177 -> :sswitch_6
        -0x57648b2d -> :sswitch_7
        -0x52fe7ded -> :sswitch_a
        -0x50e5492b -> :sswitch_d
        -0x48442f7a -> :sswitch_c
        -0x43b80454 -> :sswitch_1
        -0x3fffac8b -> :sswitch_8
        -0x3db68338 -> :sswitch_0
        -0x3a6dd695 -> :sswitch_3
        -0x38d77a74 -> :sswitch_5
        -0x3534a3dc -> :sswitch_3
        -0x2f9e99a9 -> :sswitch_11
        -0x2f02bea2 -> :sswitch_9
        -0x2c464fcb -> :sswitch_14
        -0x21367ec6 -> :sswitch_6
        -0x1ee2ef5a -> :sswitch_12
        -0x1da635c8 -> :sswitch_2
        -0x1a552ce2 -> :sswitch_14
        -0x12d12e9f -> :sswitch_13
        -0xcf3e187 -> :sswitch_15
        0x103423ef -> :sswitch_f
        0x1367ba5a -> :sswitch_4
        0x15546c3a -> :sswitch_5
        0x18ab771b -> :sswitch_8
        0x1ae67e24 -> :sswitch_4
        0x2281bd46 -> :sswitch_1
        0x26d98564 -> :sswitch_b
        0x2cbb925b -> :sswitch_e
        0x35d2adb7 -> :sswitch_12
        0x3a4296a6 -> :sswitch_c
        0x3bb9c3a2 -> :sswitch_15
        0x3e656ea5 -> :sswitch_9
        0x4d953f0e -> :sswitch_2
        0x4f16fa4f -> :sswitch_10
        0x564c5dc3 -> :sswitch_11
        0x590f3811 -> :sswitch_10
        0x63dde727 -> :sswitch_a
        0x64b65d2f -> :sswitch_d
        0x6ae399fe -> :sswitch_0
        0x6c1d65c3 -> :sswitch_e
        0x7bda70da -> :sswitch_13
        0x7f1d7ce3 -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    const v1, 0x3e2ac7cb

    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v4, "\u0736\u06e0"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x610b

    const v6, -0x4bded85d

    xor-int/2addr v5, v6

    const v6, -0x17d64324

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x7685

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v4, :cond_b

    goto/16 :goto_3

    .line 250
    :sswitch_1
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    sget v4, Ll/֫;->ܶܺ᩻:I

    if-gez v4, :cond_8

    goto :goto_1

    .line 903
    :sswitch_2
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v4, "\u06e0\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x31dd

    const v6, -0x532082b9

    xor-int/2addr v5, v6

    const v6, -0x31925a7c

    goto :goto_0

    .line 899
    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    :goto_2
    const-string v4, "\u06eb\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x42dd

    const v6, -0x34a1b5a6

    xor-int/2addr v5, v6

    const v6, -0x7d8a583a

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    const/4 v0, 0x0

    return-object v0

    .line 1174
    :sswitch_5
    iput-object v0, p0, Ll/ܽᩴۘ;->ۨ:Ljava/lang/String;

    goto/16 :goto_6

    .line 363
    :sswitch_6
    sget-boolean v4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u1a76\u073a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xf17

    const v6, -0x200fb885

    xor-int/2addr v5, v6

    const v6, 0x37167b62

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v4, "\u06d8\u06dc"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4867

    const v6, 0x5f2d5f93

    xor-int/2addr v5, v6

    const v6, -0x7ab34f55

    goto/16 :goto_0

    .line 1073
    :sswitch_8
    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v4, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v4, "\u073a\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x31

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1153

    const v6, -0x27b2497a

    xor-int/2addr v5, v6

    const v6, 0x55e4c542

    goto/16 :goto_0

    .line 173
    :sswitch_9
    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "\u06e0\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2421

    const v6, 0x5dc7865e

    xor-int/2addr v5, v6

    const v6, -0x6fafbe20

    goto/16 :goto_0

    .line 9
    :sswitch_a
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v4

    if-ltz v4, :cond_5

    goto :goto_3

    :cond_5
    const-string v4, "\u06dc\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x2b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7a69

    const v6, 0x77ba6cba

    xor-int/2addr v5, v6

    const v6, -0x4827bd86

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u05a1\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1b13

    const v6, -0xee7295

    xor-int/2addr v5, v6

    const v6, 0x231681fa

    goto/16 :goto_0

    .line 293
    :sswitch_b
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u073d\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x62cb

    const v6, -0x5dc3f4cc

    xor-int/2addr v5, v6

    const v6, -0x5718c7b9

    goto/16 :goto_0

    .line 540
    :sswitch_c
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u06d6\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1817

    const v6, -0x2aed3457

    xor-int/2addr v5, v6

    const v6, -0x6829dc0d

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06dc\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x909

    const v6, -0x1fe58e74

    xor-int/2addr v5, v6

    const v6, -0x77049a01

    goto/16 :goto_0

    .line 1067
    :sswitch_d
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v4

    if-eqz v4, :cond_a

    :goto_4
    const-string v4, "\u1a74\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xc4b

    const v6, -0x21c43abf

    xor-int/2addr v5, v6

    const v6, 0x78cc7de3

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u073a\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7963

    const v6, 0x477a3964

    xor-int/2addr v5, v6

    const v6, -0x3d5bbd34

    goto/16 :goto_0

    .line 1174
    :sswitch_e
    iget-object v0, p0, Ll/ܽᩴۘ;->᩺:Landroid/content/pm/PackageInfo;

    invoke-static {v0}, Ll/ܽ᩷᩺;->ۙ(Landroid/content/pm/PackageInfo;)Ljava/lang/String;

    move-result-object v0

    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u06da\u05ab"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2731

    const v6, -0x22b903eb

    xor-int/2addr v5, v6

    const v6, 0x3b8dc3db

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073d\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2d1d

    const v6, 0x23422e0e

    xor-int/2addr v5, v6

    const v6, 0x2539d422

    goto/16 :goto_0

    .line 1176
    :sswitch_f
    iget-object v0, p0, Ll/ܽᩴۘ;->ۨ:Ljava/lang/String;

    return-object v0

    .line 1173
    :sswitch_10
    iget-object v4, p0, Ll/ܽᩴۘ;->ۨ:Ljava/lang/String;

    if-nez v4, :cond_d

    const-string v4, "\u1a7a\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6e35

    const v6, -0x6b78b0de

    xor-int/2addr v5, v6

    const v6, 0x459a51b

    goto/16 :goto_0

    :cond_d
    :goto_6
    const-string v4, "\u06e2\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x207f

    const v6, 0x757d82d5

    xor-int/2addr v5, v6

    const v6, 0x6bde51a9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6b3f694b -> :sswitch_5
        -0x5870c389 -> :sswitch_e
        -0x545bc4d5 -> :sswitch_6
        -0x52d6749a -> :sswitch_5
        -0x5155f2ea -> :sswitch_3
        -0x48fd4b13 -> :sswitch_4
        -0x44c620bf -> :sswitch_d
        -0x3e8eada0 -> :sswitch_a
        -0x3bb4e708 -> :sswitch_3
        -0x331a94e9 -> :sswitch_9
        -0x2685b81b -> :sswitch_c
        -0xe29b12a -> :sswitch_7
        -0xb4889af -> :sswitch_f
        -0x9d6b4cb -> :sswitch_1
        -0x9c8c6dd -> :sswitch_f
        -0x8e7ead3 -> :sswitch_8
        0x1608f3f -> :sswitch_d
        0x9d6088e -> :sswitch_2
        0x11e18ea1 -> :sswitch_7
        0x1b4c9a10 -> :sswitch_6
        0x2299d104 -> :sswitch_e
        0x2b2e5cb2 -> :sswitch_b
        0x3b12fa73 -> :sswitch_9
        0x3b9938a1 -> :sswitch_1
        0x3cb9c38a -> :sswitch_4
        0x4132cc05 -> :sswitch_2
        0x61716ee4 -> :sswitch_c
        0x61a98d69 -> :sswitch_8
        0x674d801e -> :sswitch_a
        0x6f21d108 -> :sswitch_10
        0x721f41cf -> :sswitch_10
        0x789456b5 -> :sswitch_0
        0x79ca8118 -> :sswitch_0
        0x7ba0bfbc -> :sswitch_b
    .end sparse-switch
.end method

.method public final ۙ(Z)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x2a0db2a1

    sget v7, Ll/۟;->ۨᩴۛ:I

    sget v8, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v9, "\u06eb\u06da"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x5f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x1f13

    const v11, 0x6b54332b

    xor-int/2addr v10, v11

    const v11, -0x1d6e6b94

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, -0x5c03

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 723
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v9

    if-gtz v9, :cond_a

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    sget v9, Ll/ۗᩳ;->ۚۤ֡:I

    if-gez v9, :cond_d

    goto :goto_1

    .line 732
    :sswitch_1
    sget-boolean v9, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v9, :cond_b

    goto :goto_1

    .line 526
    :sswitch_2
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    sget-boolean v9, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v9, :cond_1

    goto/16 :goto_4

    .line 166
    :sswitch_3
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    return-void

    :sswitch_5
    add-int/2addr v4, v5

    .line 1183
    iput v4, v3, Ll/۫ᩴۘ;->ܰ:I

    return-void

    :sswitch_6
    const/4 v5, 0x1

    .line 996
    sget v9, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v9, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v9, "\u1a75\u06eb"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x2b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x24a7

    const v11, 0x2b890be8

    xor-int/2addr v10, v11

    const v11, 0x13f735f2

    goto :goto_0

    .line 1183
    :sswitch_7
    iget-object v3, p0, Ll/ܽᩴۘ;->ܰ:Ll/۫ᩴۘ;

    iget v4, v3, Ll/۫ᩴۘ;->ܰ:I

    .line 835
    sget v9, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v9, :cond_2

    :cond_1
    :goto_1
    const-string v9, "\u1a76\u06d7"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x71

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x2bdd

    const v11, -0x732a8dd9

    xor-int/2addr v10, v11

    const v11, 0x3919d615

    goto :goto_0

    :cond_2
    const-string v9, "\u06da\u073a"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x17

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x7eb9

    const v11, -0x4ff3033e

    xor-int/2addr v10, v11

    const v11, 0x77cfb219

    goto/16 :goto_0

    :sswitch_8
    add-int v9, v1, v2

    .line 1185
    iput v9, v0, Ll/۫ᩴۘ;->ܰ:I

    goto/16 :goto_2

    :sswitch_9
    const/4 v2, -0x1

    sget-boolean v9, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v9, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v9, "\u06d8\u06d6"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x2fb5

    const v11, 0x1ca5f69b

    xor-int/2addr v10, v11

    const v11, -0x2d096287

    goto/16 :goto_0

    :sswitch_a
    iget-object v0, p0, Ll/ܽᩴۘ;->ܰ:Ll/۫ᩴۘ;

    iget v1, v0, Ll/۫ᩴۘ;->ܰ:I

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v9

    if-eqz v9, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v9, "\u1a76\u05ab"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x55

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0xac3

    const v11, -0x3e733360    # -17.599915f

    xor-int/2addr v10, v11

    const v11, -0x37b52662

    goto/16 :goto_0

    .line 1181
    :sswitch_b
    iput-boolean p1, p0, Ll/ܽᩴۘ;->ۚ:Z

    if-eqz p1, :cond_5

    const-string v9, "\u06e0\u06d8"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x34a5

    const v11, -0x74b1cce0

    xor-int/2addr v10, v11

    const v11, -0x5f97b8c9

    goto/16 :goto_0

    :cond_5
    const-string v9, "\u06d8\u1a73"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x69

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x183f

    const v11, 0x76a3feef

    xor-int/2addr v10, v11

    const v11, -0x42faddb7    # -0.0325034f

    goto/16 :goto_0

    :sswitch_c
    return-void

    .line 1180
    :sswitch_d
    iget-boolean v9, p0, Ll/ܽᩴۘ;->ۚ:Z

    if-eq v9, p1, :cond_6

    const-string v9, "\u05ab\u1a74"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x49c7

    const v11, -0x569afde7

    xor-int/2addr v10, v11

    const v11, -0xd01593d

    goto/16 :goto_0

    :cond_6
    :goto_2
    const-string v9, "\u073a\u06d7"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x5103

    const v11, 0xa48278f

    xor-int/2addr v10, v11

    const v11, 0x293af9e6

    goto/16 :goto_0

    :sswitch_e
    sget v9, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v9, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v9, "\u05a1\u073d"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x63

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x4c87

    const v11, 0x178a67ee

    xor-int/2addr v10, v11

    const v11, 0x5aff2db8

    goto/16 :goto_0

    .line 1067
    :sswitch_f
    sget v9, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v9, :cond_8

    goto :goto_3

    :cond_8
    const-string v9, "\u1a76\u073f"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x49

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1341

    const v11, 0x442f35ec

    xor-int/2addr v10, v11

    const v11, 0x75007cdd

    goto/16 :goto_0

    .line 418
    :sswitch_10
    sget v9, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v9, :cond_9

    :goto_3
    const-string v9, "\u06d6\u1a76"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x67

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x4521

    const v11, 0x439ddeaf

    xor-int/2addr v10, v11

    const v11, 0x4b7e3101    # 1.6658689E7f

    goto/16 :goto_0

    :cond_9
    const-string v9, "\u05a1\u073a"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x725d

    const v11, 0x340007b5

    xor-int/2addr v10, v11

    const v11, -0xd27ab10

    goto/16 :goto_0

    :goto_4
    const-string v9, "\u05ab\u1a7b"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x6b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0xbd3

    const v11, 0xeac5cc7

    xor-int/2addr v10, v11

    const v11, 0x1599ce2f

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u1a78\u1a7a"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x1d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x4e29

    const v11, -0x57a98c42

    xor-int/2addr v10, v11

    const v11, 0x373f2af4

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v9, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v9, :cond_c

    :cond_b
    :goto_5
    const-string v9, "\u06e0\u06dc"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x33

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6e09

    const v11, 0x26ea8cfa

    xor-int/2addr v10, v11

    const v11, -0x3c9e950d

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u1a7b\u073d"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x2d2b

    const v11, 0x6e43e953

    xor-int/2addr v10, v11

    const v11, 0x300fea75

    goto/16 :goto_0

    .line 588
    :sswitch_12
    sget v9, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v9, :cond_e

    :cond_d
    const-string v9, "\u06d9\u06e1"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x79

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x7b0f

    const v11, -0x6baf9bc8

    xor-int/2addr v10, v11

    const v11, 0x29eaafcb

    goto/16 :goto_0

    :cond_e
    const-string v9, "\u06da\u1a73"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6605

    const v11, -0x47bb1f3

    xor-int/2addr v10, v11

    const v11, -0x3113230a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fc6892c -> :sswitch_1
        -0x7931e70b -> :sswitch_3
        -0x66bb4dcb -> :sswitch_5
        -0x5f314e7e -> :sswitch_c
        -0x58c77cc2 -> :sswitch_6
        -0x5272ac74 -> :sswitch_1
        -0x4e10d567 -> :sswitch_8
        -0x421e9427 -> :sswitch_a
        -0x40e56091 -> :sswitch_d
        -0x3f4fd375 -> :sswitch_e
        -0x3cd6b0ae -> :sswitch_12
        -0x3b42ce38 -> :sswitch_f
        -0x30e604f2 -> :sswitch_11
        -0x2fe5c4c8 -> :sswitch_7
        -0x2eac4e63 -> :sswitch_10
        -0x25f96dca -> :sswitch_0
        -0x1ca1b5ec -> :sswitch_c
        -0x12289939 -> :sswitch_4
        -0xaa5f8ef -> :sswitch_0
        -0x7c0b27d -> :sswitch_b
        0xf532c2d -> :sswitch_9
        0x13bad496 -> :sswitch_2
        0x14be8c85 -> :sswitch_5
        0x16e08224 -> :sswitch_6
        0x32ddd39f -> :sswitch_3
        0x36ce0b49 -> :sswitch_d
        0x38bcb466 -> :sswitch_f
        0x3ab860e9 -> :sswitch_10
        0x403a425e -> :sswitch_12
        0x40f4a6f0 -> :sswitch_9
        0x4172106f -> :sswitch_a
        0x469ac0d4 -> :sswitch_2
        0x48bd81b0 -> :sswitch_e
        0x4cf6b638 -> :sswitch_8
        0x50ecc390 -> :sswitch_11
        0x6a0cc9e0 -> :sswitch_7
        0x6cfe9d55 -> :sswitch_b
        0x7dfd2944 -> :sswitch_4
    .end sparse-switch
.end method

.class public final Ll/᩵ۢ֫;
.super Ljava/lang/Object;
.source "C2R7"


# static fields
.field private static final ۧܺ᩹:[S


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۙ:J

.field public ۚ:Z

.field public ۤ:Ljava/lang/String;

.field public final ۧ:I

.field public final ۫:Ll/ۛ۫;

.field public final ܳ:Ll/ۛ۫;

.field public final ܺ:Ljava/lang/String;

.field public final ܽ:I

.field public ᩴ:Z

.field public ᩷:Ll/ۨۢ֫;

.field public ᩸:Z

.field public final ᩻:Landroid/content/pm/PackageInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵ۢ֫;->ۧܺ᩹:[S

    return-void

    :array_0
    .array-data 2
        0x162cs
        0x4f23s
        0x4f23s
        0x4f23s
        0x4f23s
        0x4f23s
        0x4f23s
        0x4f50s
        0x4f53s
        0x4f4fs
        0x4f4as
        0x4f57s
        0x4f28s
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

    const v21, -0x504e641a

    sget v22, Ll/ۗ֡;->ۜ᩻۫:I

    sget v23, Ll/᩺;->۫۬۫:I

    sget-object v24, Ll/᩵ۢ֫;->ۧܺ᩹:[S

    const/16 v25, 0x0

    aget-short v24, v24, v25

    mul-int v25, v24, v24

    const v26, 0x15995110

    add-int v25, v25, v26

    const v26, 0x94b8

    mul-int v24, v24, v26

    sub-int v24, v24, v25

    if-lez v24, :cond_0

    const/16 v24, 0xdea

    const/16 v2, 0xdea

    goto :goto_0

    :cond_0
    const/16 v24, 0x4f03

    const/16 v2, 0x4f03

    .line 1226
    :goto_0
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-string v24, "\u06da\u06db"

    invoke-static/range {v24 .. v24}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v24

    xor-int v24, v24, v23

    mul-int/lit8 v24, v24, -0x53

    xor-int v3, v24, v22

    mul-int/lit16 v3, v3, -0x3a31

    const v4, 0x1a783add

    xor-int/2addr v3, v4

    const v4, -0x5b0a05e8

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

    mul-int/lit16 v11, v11, 0x368d

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v4, v11

    xor-int v21, v7, v4

    sparse-switch v21, :sswitch_data_0

    move-object v4, v6

    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move/from16 v17, v2

    move/from16 v16, v3

    .line 1232
    iget v2, v11, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    iput v2, v0, Ll/᩵ۢ֫;->ܽ:I

    .line 1233
    invoke-static {v11}, Ll/᩻ۙܺ;->ۙ(Landroid/content/pm/ApplicationInfo;)I

    move-result v2

    iput v2, v0, Ll/᩵ۢ֫;->ۧ:I

    .line 754
    sget v2, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v2, :cond_e

    move-object v2, v11

    goto/16 :goto_c

    .line 1194
    :sswitch_0
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_7

    :cond_1
    move-object v4, v6

    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move/from16 v17, v2

    goto/16 :goto_b

    .line 566
    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-lez v4, :cond_2

    :goto_2
    move-object v4, v6

    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move/from16 v17, v2

    move/from16 v16, v3

    goto/16 :goto_e

    :cond_2
    :goto_3
    move-object v4, v6

    goto/16 :goto_7

    .line 623
    :sswitch_2
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_1

    goto :goto_2

    .line 462
    :sswitch_3
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    goto :goto_2

    .line 449
    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 1250
    :sswitch_5
    new-instance v1, Ll/ۛ۫;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v2, v9}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-direct {v1, v2}, Ll/ۛ۫;-><init>(Landroid/graphics/drawable/Drawable;)V

    iput-object v1, v0, Ll/᩵ۢ֫;->۫:Ll/ۛ۫;

    return-void

    .line 1249
    :sswitch_6
    new-instance v4, Ll/ۛ۫;

    new-instance v7, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v7, v9}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-direct {v4, v7}, Ll/ۛ۫;-><init>(Landroid/graphics/drawable/Drawable;)V

    iput-object v4, v0, Ll/᩵ۢ֫;->ܳ:Ll/ۛ۫;

    .line 46
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u073a\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v22

    xor-int v7, v4, v23

    mul-int/lit16 v7, v7, 0x55bd

    const v11, -0x585ba2ec

    xor-int/2addr v7, v11

    const v11, 0x5dd7835

    goto/16 :goto_5

    :sswitch_7
    add-long v19, v19, v24

    add-int/lit8 v3, v3, 0x1

    move-object v4, v6

    goto/16 :goto_8

    .line 1240
    :sswitch_8
    aget-object v4, v8, v3

    .line 1241
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v24

    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_4

    goto :goto_3

    :cond_4
    const-string v4, "\u06df\u1a74"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v23, v4

    mul-int/lit8 v4, v4, 0x47

    xor-int v7, v4, v22

    mul-int/lit16 v7, v7, 0x79db

    const v11, 0x5e56109e

    xor-int/2addr v7, v11

    const v11, -0x4853db8e

    goto/16 :goto_5

    .line 1245
    :sswitch_9
    invoke-static {v14, v15}, Ll/۠֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Ll/᩵ۢ֫;->֫:Ljava/lang/String;

    move-object v4, v6

    goto/16 :goto_6

    :sswitch_a
    const/4 v4, 0x4

    const/16 v7, 0x9

    invoke-static {v10, v4, v7, v2}, Ll/֨᩻;->ۧ᩹ܿ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 790
    sget v4, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v4, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v4, "\u1a7b\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v22

    mul-int/lit8 v4, v4, 0x4b

    xor-int v7, v4, v23

    mul-int/lit16 v7, v7, -0x809

    const v11, 0x52d0900b

    xor-int/2addr v7, v11

    const v11, 0x5f61e9cf

    goto :goto_5

    .line 1245
    :sswitch_b
    iget-wide v10, v0, Ll/᩵ۢ֫;->ۙ:J

    invoke-static {v10, v11}, Ll/۠֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v10, Ll/᩵ۢ֫;->ۧܺ᩹:[S

    .line 208
    sget v4, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v4, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v4, "\u06dc\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v22

    xor-int v7, v4, v23

    mul-int/lit16 v7, v7, 0xdb3

    const v11, -0x744963a2

    xor-int/2addr v7, v11

    const v11, 0x3b2d5083

    goto :goto_5

    .line 1245
    :sswitch_c
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-static {v6, v4}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v6, v13}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 558
    sget v4, Ll/۬;->᩸ۜ᩹:I

    if-eqz v4, :cond_8

    :cond_7
    :goto_4
    const-string v4, "\u06eb\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v22

    mul-int/lit8 v4, v4, -0x5f

    xor-int v7, v4, v23

    mul-int/lit16 v7, v7, 0x1a9b

    const v11, -0x7670b61c

    xor-int/2addr v7, v11

    const v11, 0x3bfdbd73

    goto :goto_5

    :cond_8
    const-string v4, "\u1a7b\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v23

    mul-int/lit8 v4, v4, 0xf

    xor-int v7, v4, v22

    mul-int/lit16 v7, v7, 0x75a3

    const v11, 0x6983c60a

    xor-int/2addr v7, v11

    const v11, -0x26cdf63f

    :goto_5
    xor-int/2addr v4, v11

    move/from16 v28, v7

    move v7, v4

    move/from16 v4, v28

    goto/16 :goto_1

    :sswitch_d
    move-object v4, v6

    .line 1247
    iget-wide v6, v0, Ll/᩵ۢ֫;->ۙ:J

    invoke-static {v6, v7}, Ll/۠֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Ll/᩵ۢ֫;->֫:Ljava/lang/String;

    :goto_6
    const-string v6, "\u06e4\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v22

    mul-int/lit8 v6, v6, 0x5

    xor-int v7, v6, v23

    mul-int/lit16 v7, v7, 0x1573

    const v11, 0x54f9312f

    xor-int/2addr v7, v11

    const v11, 0x338ea939

    goto/16 :goto_9

    :sswitch_e
    move-object v4, v6

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-static {v5, v6}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5, v13}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1249
    sget v6, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v6, :cond_9

    :goto_7
    const-string v6, "\u06e7\u06e2"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v22, v6

    mul-int/lit8 v6, v6, -0x37

    xor-int v7, v6, v23

    mul-int/lit16 v7, v7, -0x34d5

    const v11, 0x72481db8

    xor-int/2addr v7, v11

    const v11, 0xdb5ea48

    goto/16 :goto_9

    :cond_9
    const-string v6, "\u06eb\u1a73"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v23

    mul-int/lit8 v6, v6, -0x11

    xor-int v7, v6, v22

    mul-int/lit16 v7, v7, 0x473f

    const v11, -0x39ead34c

    xor-int/2addr v7, v11

    const v11, 0xacd6d3

    goto/16 :goto_9

    :sswitch_f
    move-object v4, v6

    if-ge v3, v12, :cond_a

    const-string v6, "\u05a8\u06da"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v23, v6

    mul-int/lit8 v6, v6, -0x67

    xor-int v7, v6, v22

    mul-int/lit16 v7, v7, -0x12bf

    const v11, -0x45f010bc

    xor-int/2addr v7, v11

    const v11, 0x265bc47b

    goto :goto_9

    :cond_a
    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move-wide/from16 v14, v19

    goto/16 :goto_a

    :sswitch_10
    move-object v4, v6

    .line 1241
    sget-object v6, Ll/᩵ۢ֫;->ۧܺ᩹:[S

    const/4 v7, 0x1

    const/4 v11, 0x3

    invoke-static {v6, v7, v11, v2}, Ll/֡ۖ;->ܰᩴۢ([SIII)Ljava/lang/String;

    move-result-object v13

    cmp-long v6, v14, v26

    if-eqz v6, :cond_b

    const-string v6, "\u1a76\u0730"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    xor-int v7, v6, v23

    mul-int/lit16 v7, v7, 0x4681

    const v11, 0x6d618b98

    xor-int/2addr v7, v11

    const v11, 0x61a6704

    goto :goto_9

    :cond_b
    const-string v6, "\u1a78\u06d9"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    xor-int v7, v6, v23

    mul-int/lit16 v7, v7, 0x3a8b

    const v11, -0x5360c682

    xor-int/2addr v7, v11

    const v11, 0xb6e021c

    goto :goto_9

    :sswitch_11
    move-object v4, v6

    .line 1240
    array-length v3, v8

    const/4 v6, 0x0

    move v12, v3

    move-wide/from16 v19, v26

    const/4 v3, 0x0

    :goto_8
    const-string v6, "\u06da\u06e7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v23, v6

    mul-int/lit8 v6, v6, -0x39

    xor-int v7, v6, v22

    mul-int/lit16 v7, v7, 0x6483

    const v11, -0xaa75b1c

    xor-int/2addr v7, v11

    const v11, -0x4bf2765f

    :goto_9
    xor-int/2addr v6, v11

    move/from16 v28, v6

    move-object v6, v4

    move v4, v7

    move/from16 v7, v28

    goto/16 :goto_1

    :sswitch_12
    move-object v4, v6

    move-wide/from16 v6, v17

    .line 1236
    iput-wide v6, v0, Ll/᩵ۢ֫;->ۙ:J

    move-object/from16 v11, v16

    .line 1238
    iget-object v8, v11, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    const-wide/16 v26, 0x0

    if-eqz v8, :cond_c

    const-string v16, "\u06df\u0730"

    invoke-static/range {v16 .. v16}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v22

    mul-int/lit8 v16, v16, -0x39

    xor-int v9, v16, v23

    mul-int/lit16 v9, v9, -0x2a97

    const v18, -0x6c9cc007

    xor-int v9, v9, v18

    const v18, 0x71a7b71c

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
    const-string v16, "\u06da\u1a73"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v23

    move/from16 v17, v2

    xor-int v2, v16, v22

    mul-int/lit16 v2, v2, -0x32a3

    const v18, -0x14705b

    xor-int v2, v2, v18

    const v18, 0x58ea6002

    xor-int v16, v16, v18

    move-object/from16 v28, v4

    move v4, v2

    move/from16 v2, v17

    move-wide/from16 v17, v6

    move/from16 v7, v16

    move-object/from16 v6, v28

    goto/16 :goto_10

    :sswitch_13
    move/from16 v17, v2

    move-object v4, v6

    move-object/from16 v11, v16

    .line 1235
    iget-object v2, v11, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 1236
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v6

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v2

    if-nez v2, :cond_d

    :goto_b
    const-string v2, "\u1a74\u1a75"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v23

    mul-int/lit8 v2, v2, -0x19

    move/from16 v16, v3

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, 0x7e05

    const v18, -0xd3d39d8

    xor-int v3, v3, v18

    const v18, -0x431ad0f3

    goto/16 :goto_f

    :cond_d
    move/from16 v16, v3

    const-string v2, "\u05a1\u1a73"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v23

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, 0x393d

    const v18, -0xd2be0d5

    xor-int v3, v3, v18

    const v18, 0x4c8322b7    # 6.8752824E7f

    goto/16 :goto_f

    :cond_e
    const-string v2, "\u06e7\u1a75"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    mul-int/lit8 v2, v2, -0x67

    xor-int v3, v2, v23

    mul-int/lit16 v3, v3, 0x562d

    const v18, 0x2e7ab60d

    xor-int v3, v3, v18

    const v18, -0x36734009

    goto/16 :goto_f

    :sswitch_14
    move/from16 v16, v3

    move-object v4, v6

    move-wide/from16 v6, v17

    move/from16 v17, v2

    .line 1230
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {v2}, Ll/ۗۖ;->ۡۖ۬(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_f

    :goto_c
    const-string v3, "\u06e4\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v23, v3

    mul-int/lit8 v3, v3, -0x6b

    xor-int v11, v3, v22

    mul-int/lit16 v11, v11, -0x2865

    const v18, 0x71de0e54

    xor-int v11, v11, v18

    const v18, -0x2d23ce6f

    goto :goto_d

    :cond_f
    const-string v3, "\u1a73\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v23

    xor-int v11, v3, v22

    mul-int/lit16 v11, v11, 0x76bf

    const v18, 0x5680e265

    xor-int v11, v11, v18

    const v18, 0x408cd2f0

    :goto_d
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

    .line 1227
    iput-object v1, v0, Ll/᩵ۢ֫;->᩻:Landroid/content/pm/PackageInfo;

    .line 1228
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v2, v0, Ll/᩵ۢ֫;->ܺ:Ljava/lang/String;

    .line 647
    sget v2, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v2, :cond_10

    :goto_e
    const-string v2, "\u0730\u05ab"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v23

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, 0x5445

    const v18, 0x2e96e9d1

    xor-int v3, v3, v18

    const v18, 0xb3257e0

    goto :goto_f

    :cond_10
    const-string v2, "\u05a1\u06dc"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    xor-int v3, v2, v23

    mul-int/lit16 v3, v3, 0x6cc3

    const v18, -0x2a23ba72

    xor-int v3, v3, v18

    const v18, 0x373ea9b0

    :goto_f
    xor-int v2, v2, v18

    move-wide/from16 v28, v6

    move v7, v2

    move-object v6, v4

    move/from16 v2, v17

    move v4, v3

    move-wide/from16 v17, v28

    move/from16 v3, v16

    :goto_10
    move-object/from16 v16, v11

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c60fb34 -> :sswitch_3
        -0x7b1fbe12 -> :sswitch_12
        -0x7415d3cf -> :sswitch_b
        -0x6d769fbb -> :sswitch_f
        -0x6321ac61 -> :sswitch_6
        -0x554e7dcd -> :sswitch_b
        -0x4e7bf349 -> :sswitch_0
        -0x48558c2d -> :sswitch_13
        -0x45c0e90d -> :sswitch_3
        -0x436b9fc3 -> :sswitch_d
        -0x3aa3db39 -> :sswitch_5
        -0x38fff053 -> :sswitch_1
        -0x38d59a54 -> :sswitch_2
        -0x2b0e5753 -> :sswitch_a
        -0x2778d1ac -> :sswitch_7
        -0x271dc0bf -> :sswitch_14
        -0x1c9a1eab -> :sswitch_7
        -0x1c4de46c -> :sswitch_13
        -0x1b4ee529 -> :sswitch_e
        -0x19935e9f -> :sswitch_11
        -0x163a802c -> :sswitch_c
        -0x15fe5ee1 -> :sswitch_5
        -0x1575e8f6 -> :sswitch_9
        0x28bc715 -> :sswitch_8
        0x87a5d5b -> :sswitch_a
        0x15c34b61 -> :sswitch_15
        0x167ba571 -> :sswitch_d
        0x193dc1f5 -> :sswitch_9
        0x2b401027 -> :sswitch_0
        0x31d1e00d -> :sswitch_4
        0x34b29220 -> :sswitch_6
        0x34c9aafb -> :sswitch_11
        0x38e1ded6 -> :sswitch_e
        0x498d4aff -> :sswitch_4
        0x4ccf5853 -> :sswitch_15
        0x569748d9 -> :sswitch_10
        0x579ebe1e -> :sswitch_f
        0x591cf0d1 -> :sswitch_1
        0x5be4abba -> :sswitch_14
        0x6209dd4d -> :sswitch_10
        0x688968bf -> :sswitch_8
        0x6b53e60a -> :sswitch_c
        0x7660b9d3 -> :sswitch_12
        0x7a5623cf -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    const v1, 0x108d1dc4

    sget v2, Ll/ۖۙ;->ۤۧۤ:I

    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v4, "\u05a8\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x76f

    const v6, -0x27131633

    xor-int/2addr v5, v6

    const v6, 0x4840583f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x6977

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 589
    sget v4, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget v4, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v4, :cond_5

    goto/16 :goto_1

    .line 413
    :sswitch_1
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_4

    :sswitch_2
    sget v4, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v4, :cond_b

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    goto/16 :goto_3

    .line 1145
    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    const/4 v0, 0x0

    return-object v0

    .line 1255
    :sswitch_5
    iput-object v0, p0, Ll/᩵ۢ֫;->ۤ:Ljava/lang/String;

    goto/16 :goto_5

    .line 1102
    :sswitch_6
    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v4, :cond_0

    const-string v4, "\u06ec\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x558d

    const v6, -0x1c041358

    xor-int/2addr v5, v6

    const v6, -0x28a7611c

    goto :goto_0

    :cond_0
    const-string v4, "\u06df\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xdc5

    const v6, -0xbe99ade

    xor-int/2addr v5, v6

    const v6, 0x2bbeb967

    goto :goto_0

    :cond_1
    const-string v4, "\u073f\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5b1b

    const v6, 0x2a4cca9

    xor-int/2addr v5, v6

    const v6, -0x68411eef

    goto :goto_0

    .line 747
    :sswitch_7
    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u05a8\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4a7b

    const v6, -0x65284a2d

    xor-int/2addr v5, v6

    const v6, 0x5e8e7724

    goto/16 :goto_0

    .line 316
    :sswitch_8
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_4

    :cond_3
    :goto_1
    const-string v4, "\u05a1\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2593

    const v6, 0x6e8d941

    xor-int/2addr v5, v6

    const v6, -0x3c535837

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e1\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x266d

    const v6, -0x6ec88ddb

    xor-int/2addr v5, v6

    const v6, 0x3b5ace6e

    goto/16 :goto_0

    .line 699
    :sswitch_9
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_6

    :cond_5
    :goto_2
    const-string v4, "\u1a7b\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x15c3

    const v6, 0x528b934

    xor-int/2addr v5, v6

    const v6, 0x1a139c30

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d9\u06e1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x77a1

    const v6, 0x6b961df9

    xor-int/2addr v5, v6

    const v6, 0x2312a43c

    goto/16 :goto_0

    .line 617
    :sswitch_a
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u1a7b\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6a3f

    const v6, 0x5e436eb6

    xor-int/2addr v5, v6

    const v6, 0x74995e79

    goto/16 :goto_0

    .line 1143
    :sswitch_b
    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u06eb\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x425d

    const v6, 0x5889ea05

    xor-int/2addr v5, v6

    const v6, 0x147deac

    goto/16 :goto_0

    .line 212
    :sswitch_c
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "\u06e7\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x57b9

    const v6, 0x7de31ea5

    xor-int/2addr v5, v6

    const v6, 0x62e0345d

    goto/16 :goto_0

    .line 1042
    :sswitch_d
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_a

    :goto_3
    const-string v4, "\u06d7\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7f2b

    const v6, -0x61f59985

    xor-int/2addr v5, v6

    const v6, -0x50852e58

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06dc\u073d"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x123b

    const v6, -0x8d65042

    xor-int/2addr v5, v6

    const v6, -0x6fe16fcb

    goto/16 :goto_0

    .line 1255
    :sswitch_e
    iget-object v0, p0, Ll/᩵ۢ֫;->᩻:Landroid/content/pm/PackageInfo;

    invoke-static {v0}, Ll/ܰۙܺ;->ۙ(Landroid/content/pm/PackageInfo;)Ljava/lang/String;

    move-result-object v0

    .line 360
    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a73\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3285

    const v6, -0x39a4cac3

    xor-int/2addr v5, v6

    const v6, 0x29b33555

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7b\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x13e7

    const v6, 0x76d1604a

    xor-int/2addr v5, v6

    const v6, -0x3be94201

    goto/16 :goto_0

    .line 1257
    :sswitch_f
    iget-object v0, p0, Ll/᩵ۢ֫;->ۤ:Ljava/lang/String;

    return-object v0

    .line 1254
    :sswitch_10
    iget-object v4, p0, Ll/᩵ۢ֫;->ۤ:Ljava/lang/String;

    if-nez v4, :cond_d

    const-string v4, "\u05a1\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1f6d

    const v6, -0xe6cc61f

    xor-int/2addr v5, v6

    const v6, -0x78c52701

    goto/16 :goto_0

    :cond_d
    :goto_5
    const-string v4, "\u06e1\u1a74"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x28d7

    const v6, -0x37317d60    # -422933.0f

    xor-int/2addr v5, v6

    const v6, 0xab91faf

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a3a6de8 -> :sswitch_10
        -0x74327f08 -> :sswitch_a
        -0x6888b083 -> :sswitch_d
        -0x67cac746 -> :sswitch_f
        -0x60d6c184 -> :sswitch_2
        -0x60338afa -> :sswitch_3
        -0x5fb03d1b -> :sswitch_4
        -0x5c365b24 -> :sswitch_5
        -0x556c3d93 -> :sswitch_f
        -0x533119ff -> :sswitch_7
        -0x46e2f4aa -> :sswitch_1
        -0x3fc8d07c -> :sswitch_10
        -0x3dc73a73 -> :sswitch_a
        -0x3ba1480d -> :sswitch_8
        -0x2eb91a6c -> :sswitch_7
        -0x2bdd9576 -> :sswitch_0
        -0x2021c08a -> :sswitch_3
        -0x1f707b0d -> :sswitch_4
        -0x1185b2c9 -> :sswitch_9
        -0x5a51797 -> :sswitch_2
        -0x3125a9d -> :sswitch_9
        0x4f28db -> :sswitch_c
        0x505f18a -> :sswitch_e
        0xe8d03e0 -> :sswitch_8
        0xf4dd18f -> :sswitch_e
        0x1f8d8666 -> :sswitch_c
        0x2e89b588 -> :sswitch_1
        0x340e5dea -> :sswitch_6
        0x3d44b41f -> :sswitch_0
        0x4688d55d -> :sswitch_d
        0x602fb485 -> :sswitch_5
        0x78ea7455 -> :sswitch_b
        0x794351fe -> :sswitch_b
        0x7da2f141 -> :sswitch_6
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

    const v6, -0x11d7bee7

    sget v7, Ll/ۗ֡;->ۜ᩻۫:I

    sget v8, Ll/ۖᩳ;->᩹ۧܳ:I

    const-string v9, "\u0736\u06e8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x51

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x7d83

    const v11, -0x320b21dd

    xor-int/2addr v10, v11

    const v11, -0x7a487ad0

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v8

    mul-int/lit16 v6, v6, -0x3ee5

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    return-void

    .line 1141
    :sswitch_0
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget v9, Ll/ۧ;->ۨۗܰ:I

    if-gez v9, :cond_7

    goto :goto_1

    :sswitch_1
    sget v9, Ll/֫֡;->֫ۙۖ:I

    if-lez v9, :cond_9

    goto :goto_1

    .line 1057
    :sswitch_2
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget v9, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v9, :cond_b

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    goto :goto_1

    .line 730
    :sswitch_4
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    return-void

    :sswitch_5
    add-int/2addr v4, v5

    .line 1264
    iput v4, v3, Ll/ۨۢ֫;->᩷:I

    return-void

    :sswitch_6
    const/4 v5, 0x1

    sget v9, Ll/֫֡;->֫ۙۖ:I

    if-gtz v9, :cond_0

    :goto_1
    const-string v9, "\u06d8\u06eb"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x367

    const v11, -0x79abe006

    xor-int/2addr v10, v11

    const v11, 0x26a783ea

    goto :goto_0

    :cond_0
    const-string v9, "\u1a7b\u06ec"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x73

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x4d75

    const v11, 0x5dad4226

    xor-int/2addr v10, v11

    const v11, 0x1e13e3d

    goto :goto_0

    :sswitch_7
    iget-object v3, p0, Ll/᩵ۢ֫;->᩷:Ll/ۨۢ֫;

    iget v4, v3, Ll/ۨۢ֫;->᩷:I

    .line 1158
    sget v9, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v9, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v9, "\u06dc\u06e2"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6975

    const v11, 0x673d3c7a

    xor-int/2addr v10, v11

    const v11, 0x487df1fe

    goto :goto_0

    :sswitch_8
    add-int v9, v1, v2

    .line 1266
    iput v9, v0, Ll/ۨۢ֫;->᩷:I

    goto/16 :goto_2

    :sswitch_9
    const/4 v2, -0x1

    sget v9, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v9, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v9, "\u06e2\u06e8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x19

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3883

    const v11, 0x5b89eeec

    xor-int/2addr v10, v11

    const v11, -0x4fd72768

    goto/16 :goto_0

    :sswitch_a
    iget-object v0, p0, Ll/᩵ۢ֫;->᩷:Ll/ۨۢ֫;

    iget v1, v0, Ll/ۨۢ֫;->᩷:I

    .line 1214
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v9

    if-nez v9, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v9, "\u06ec\u06e8"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x5f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x1ceb

    const v11, 0x2ee98f2c

    xor-int/2addr v10, v11

    const v11, 0x3ff9a48f

    goto/16 :goto_0

    .line 1262
    :sswitch_b
    iput-boolean p1, p0, Ll/᩵ۢ֫;->ᩴ:Z

    if-eqz p1, :cond_4

    const-string v9, "\u1a74\u1a73"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x4d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x3ea3

    const v11, -0x7dc4058f

    xor-int/2addr v10, v11

    const v11, -0x14cc3d2f

    goto/16 :goto_0

    :cond_4
    const-string v9, "\u0736\u06e4"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x53

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x72d9

    const v11, 0x65899853

    xor-int/2addr v10, v11

    const v11, -0x5e463cc8

    goto/16 :goto_0

    .line 1261
    :sswitch_c
    iget-boolean v9, p0, Ll/᩵ۢ֫;->ᩴ:Z

    if-eq v9, p1, :cond_5

    const-string v9, "\u073f\u05a1"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x23

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x1da5

    const v11, -0xe4cb2fa

    xor-int/2addr v10, v11

    const v11, -0x514306c0

    goto/16 :goto_0

    :cond_5
    :goto_2
    const-string v9, "\u06e8\u0733"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0xb

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3997

    const v11, 0x146edec7

    xor-int/2addr v10, v11

    const v11, -0x6a000ff7

    goto/16 :goto_0

    .line 401
    :sswitch_d
    sget v9, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v9, :cond_6

    goto :goto_3

    :cond_6
    const-string v9, "\u05a1\u073a"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x33

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6457

    const v11, 0x1a003feb

    xor-int/2addr v10, v11

    const v11, -0x69ed0f75

    goto/16 :goto_0

    .line 493
    :sswitch_e
    sget v9, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v9, :cond_8

    :cond_7
    :goto_3
    const-string v9, "\u1a74\u06ec"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0xd

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x7b4f

    const v11, 0x487e5cff

    xor-int/2addr v10, v11

    const v11, -0x15201480

    goto/16 :goto_0

    :cond_8
    const-string v9, "\u06e7\u06e4"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x21

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0xced

    const v11, 0x10a05d73

    xor-int/2addr v10, v11

    const v11, 0x2449e6d9

    goto/16 :goto_0

    .line 255
    :sswitch_f
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v9

    if-gtz v9, :cond_a

    :cond_9
    const-string v9, "\u06d8\u06dc"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x61

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1d13

    const v11, -0x2a8f6df9

    xor-int/2addr v10, v11

    const v11, -0x17ee3b79

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u06e7\u1a74"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x189

    const v11, 0x5e6772d8

    xor-int/2addr v10, v11

    const v11, -0x21be5212

    goto/16 :goto_0

    .line 880
    :sswitch_10
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v9

    if-ltz v9, :cond_c

    :cond_b
    :goto_4
    const-string v9, "\u06eb\u06e8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1f61

    const v11, 0x5d4c43c4

    xor-int/2addr v10, v11

    const v11, -0x73062b99

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u06db\u1a75"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x51

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x2049

    const v11, 0x3c75715d

    xor-int/2addr v10, v11

    const v11, 0x6e86af54

    goto/16 :goto_0

    :sswitch_11
    sget v9, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v9, :cond_d

    goto :goto_5

    :cond_d
    const-string v9, "\u05a8\u0736"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0xb

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x2001

    const v11, 0x390b9fb0

    xor-int/2addr v10, v11

    const v11, 0x6b0828f7

    goto/16 :goto_0

    .line 1034
    :sswitch_12
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v9

    if-eqz v9, :cond_e

    :goto_5
    const-string v9, "\u06d7\u1a77"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x7579

    const v11, 0x7c4c1fdb

    xor-int/2addr v10, v11

    const v11, -0xbf7b690

    goto/16 :goto_0

    :cond_e
    const-string v9, "\u06e7\u05ab"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x42e7

    const v11, -0x41f18d42

    xor-int/2addr v10, v11

    const v11, 0x5f8767b3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79ba95b6 -> :sswitch_b
        -0x7522fb1c -> :sswitch_f
        -0x6ef717ad -> :sswitch_e
        -0x68cdc46d -> :sswitch_12
        -0x61e9db88 -> :sswitch_12
        -0x5fd2fe0c -> :sswitch_2
        -0x5ea4178a -> :sswitch_c
        -0x5b12918b -> :sswitch_1
        -0x585ef62e -> :sswitch_6
        -0x4f44462a -> :sswitch_c
        -0x4bbf6d14 -> :sswitch_4
        -0x4a3623c6 -> :sswitch_e
        -0x42a12327 -> :sswitch_f
        -0x2d3da46d -> :sswitch_3
        -0x2572407d -> :sswitch_10
        -0x2343d918 -> :sswitch_8
        0xaabfd69 -> :sswitch_2
        0x10ce09c7 -> :sswitch_11
        0x13c82e58 -> :sswitch_1
        0x15bb2afb -> :sswitch_a
        0x1bd4845a -> :sswitch_0
        0x1c3f6c74 -> :sswitch_d
        0x28452fac -> :sswitch_b
        0x331ed18c -> :sswitch_7
        0x35f3fbd7 -> :sswitch_11
        0x43ee838d -> :sswitch_9
        0x45fd7ae4 -> :sswitch_8
        0x46b72b46 -> :sswitch_7
        0x5168ebab -> :sswitch_0
        0x53f1e3a3 -> :sswitch_9
        0x5b8a0182 -> :sswitch_d
        0x5dff167b -> :sswitch_5
        0x60a68297 -> :sswitch_10
        0x618e4a90 -> :sswitch_5
        0x61a53584 -> :sswitch_6
        0x63252a90 -> :sswitch_3
        0x651386f0 -> :sswitch_a
        0x69eeed29 -> :sswitch_4
    .end sparse-switch
.end method

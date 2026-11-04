.class public final Ll/᩵᩺֫;
.super Ljava/lang/Object;
.source "R3YJ"

# interfaces
.implements Lbin/mt/plugin/api/PluginContext;


# static fields
.field private static final ۜ᩷ۜ:[S


# instance fields
.field public ֫:Ll/ۗ᩺֫;

.field public final ۗ:Ljava/lang/String;

.field public final ۙ:Ll/ۡۗ;

.field public final ۚ:Ljava/lang/String;

.field public ۤ:Ll/ܺ᩺֫;

.field public final ۧ:Ll/ۘۨ֫;

.field public final ۫:Ljava/lang/String;

.field public final ܳ:Ll/ۘۨ֫;

.field public volatile ܶ:Landroid/content/SharedPreferences;

.field public final ܺ:Ll/ۤܿۛ;

.field public final ܽ:I

.field public final ᩴ:Ll/ۡۗ;

.field public ᩷:Landroid/content/ClipboardManager;

.field public final ᩸:Ll/᩷ۨᩴ;

.field public final ᩹:I

.field public ᩻:Ll/۫᩺֫;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x76

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    return-void

    :array_0
    .array-data 2
        0x1b48s
        -0x704es
        -0x7043s
        -0x7048s
        -0x705fs
        -0x704ds
        -0x7042s
        -0x7050s
        -0x705ds
        -0x704bs
        0x1673s
        0x3c40s
        0x3c5cs
        0x3c45s
        0x3c57s
        0x3c59s
        0x3c5es
        0x3c79s
        0x3c54s
        0x3c40s
        0x3c5cs
        0x3c45s
        0x3c57s
        0x3c59s
        0x3c5es
        0x3c60s
        0x3c42s
        0x3c55s
        0x3c56s
        0x3c55s
        0x3c42s
        0x3c55s
        0x3c5es
        0x3c53s
        0x3c55s
        0x2125s
        0x1057s
        0x104bs
        0x104bs
        0x104fs
        0x1005s
        0x1010s
        0x1010s
        0x1057s
        0x104bs
        0x104bs
        0x104fs
        0x104cs
        0x1005s
        0x1010s
        0x1010s
        0xab6s
        0xc3bs
        0x264cs
        0x3681s
        0x369ds
        0x3681s
        0x3685s
        0x369ds
        0x3682s
        0x3682s
        0x1468s
        -0x1173s
        -0x1156s
        -0x1154s
        -0x1149s
        -0x1150s
        -0x1147s
        0x13fas
        -0x13bbs
        -0x139es
        -0x139cs
        -0x1381s
        -0x1388s
        -0x138fs
        -0x13cas
        -0x1388s
        -0x1387s
        -0x139es
        -0x13cas
        -0x1390s
        -0x1387s
        -0x139ds
        -0x1388s
        -0x138es
        -0x13d4s
        -0x13cas
        0xbe9s
        0xf39s
        0xf34s
        0xf3bs
        0xf32s
        0xf26s
        0xf21s
        0xf27s
        0xf3cs
        0xf3bs
        0xf32s
        0xf26s
        0xd89s
        0x2db2s
        -0x22b2s
        -0x2d30s
        -0x3166s
        -0x2292s
        -0x3000s
        0xc8as
        -0x7e78s
        -0x59f8s
        0x4a87s
        0x3c9s
        0x445cs
        0x444es
        0x444es
        0x4458s
        0x4449s
        0x444es
        0x4412s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ll/᩷ۨᩴ;Ll/ۤܿۛ;Ll/ۘۨ֫;Ll/ۘۨ֫;)V
    .locals 18

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x392f68db

    sget v4, Ll/֡ܳ;->֨ᩳۢ:I

    sget v5, Ll/ۖ;->ܿۚ֡:I

    .line 61
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-string v6, "\u06d8\u06ec"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x35d3

    const v8, 0x6bd583de

    xor-int/2addr v7, v8

    const v8, -0x1fa14549

    xor-int/2addr v6, v8

    :goto_0
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x4955

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 34
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 22
    :sswitch_0
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v6, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v6, :cond_1

    :cond_0
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    goto/16 :goto_6

    :cond_1
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    :goto_1
    move-object/from16 v16, v2

    goto/16 :goto_a

    :sswitch_1
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v6

    if-gtz v6, :cond_2

    :goto_2
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    :goto_3
    move-object/from16 v16, v2

    goto/16 :goto_8

    :cond_2
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    :goto_4
    move-object/from16 v16, v2

    goto/16 :goto_9

    .line 65
    :sswitch_2
    sget v6, Ll/֫֡;->֫ۙۖ:I

    if-gtz v6, :cond_0

    goto :goto_2

    .line 11
    :sswitch_3
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    goto :goto_2

    :sswitch_4
    move-object/from16 v6, p7

    .line 68
    iput-object v6, v0, Ll/᩵᩺֫;->ܺ:Ll/ۤܿۛ;

    move-object/from16 v7, p8

    .line 69
    iput-object v7, v0, Ll/᩵᩺֫;->ۧ:Ll/ۘۨ֫;

    move-object/from16 v8, p9

    .line 70
    iput-object v8, v0, Ll/᩵᩺֫;->ܳ:Ll/ۘۨ֫;

    return-void

    :sswitch_5
    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 67
    iput-object v9, v0, Ll/᩵᩺֫;->᩸:Ll/᩷ۨᩴ;

    .line 6
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v10

    if-eqz v10, :cond_3

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    goto :goto_3

    :cond_3
    const-string v10, "\u06e1\u073f"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v5

    mul-int/lit8 v10, v10, 0xb

    xor-int v11, v10, v4

    mul-int/lit16 v11, v11, 0x71f7

    const v12, 0x6b03ea90

    xor-int/2addr v11, v12

    const v12, 0x6fdb5105

    xor-int/2addr v10, v12

    move v6, v10

    move v7, v11

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 66
    iput-object v10, v0, Ll/᩵᩺֫;->ۗ:Ljava/lang/String;

    .line 6
    sget v11, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v11, :cond_4

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    goto/16 :goto_6

    :cond_4
    const-string v11, "\u1a74\u06e1"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v4, v11

    mul-int/lit8 v11, v11, -0x33

    xor-int v12, v11, v5

    mul-int/lit16 v12, v12, -0x5b63

    const v13, -0x4d272419

    xor-int/2addr v12, v13

    const v13, -0xe3cb0b8

    xor-int/2addr v11, v13

    move v6, v11

    move v7, v12

    goto/16 :goto_0

    :sswitch_7
    move/from16 v11, p3

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 64
    iput v11, v0, Ll/᩵᩺֫;->ܽ:I

    move/from16 v12, p4

    .line 65
    iput v12, v0, Ll/᩵᩺֫;->᩹:I

    sget v13, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v13, :cond_5

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    goto/16 :goto_4

    :cond_5
    const-string v13, "\u1a73\u1a7a"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v5

    mul-int/lit8 v13, v13, 0x5d

    xor-int v14, v13, v4

    mul-int/lit16 v14, v14, -0x379b

    const v15, 0x42e0135

    xor-int/2addr v14, v15

    const v15, 0x5ac8142d

    xor-int/2addr v13, v15

    move v6, v13

    move v7, v14

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 63
    iput-object v13, v0, Ll/᩵᩺֫;->ۚ:Ljava/lang/String;

    .line 14
    sget v14, Ll/ۧ;->ۨۗܰ:I

    if-ltz v14, :cond_6

    const-string v14, "\u06e4\u1a78"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v5

    mul-int/lit8 v14, v14, -0x59

    xor-int v15, v14, v4

    mul-int/lit16 v15, v15, -0xe79

    const v16, -0x18975085

    xor-int v15, v15, v16

    const v16, 0x42878a16

    goto :goto_5

    :cond_6
    const-string v14, "\u1a78\u06e0"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v4

    xor-int v15, v14, v5

    mul-int/lit16 v15, v15, 0x4ba3

    const v16, 0x77d3d03d

    xor-int v15, v15, v16

    const v16, -0x36787916

    :goto_5
    xor-int v14, v14, v16

    move v6, v14

    move v7, v15

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 49
    iput-object v2, v0, Ll/᩵᩺֫;->ᩴ:Ll/ۡۗ;

    move-object/from16 v14, p1

    .line 62
    iput-object v14, v0, Ll/᩵᩺֫;->۫:Ljava/lang/String;

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v15

    if-gtz v15, :cond_7

    goto/16 :goto_1

    :cond_7
    const-string v15, "\u1a7b\u073a"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v4, v15

    mul-int/lit8 v15, v15, -0x45

    move-object/from16 v16, v2

    xor-int v2, v15, v5

    mul-int/lit16 v2, v2, -0x263d

    const v17, -0x78b4306f

    xor-int v2, v2, v17

    const v17, -0x4cdf3fa3

    goto :goto_7

    :sswitch_a
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 49
    new-instance v2, Ll/ۡۗ;

    invoke-direct {v2}, Ll/ۡۗ;-><init>()V

    .line 13
    sget v15, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v15, :cond_8

    :goto_6
    const-string v15, "\u06ec\u1a74"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v4, v15

    mul-int/lit8 v15, v15, 0x63

    move-object/from16 v16, v2

    xor-int v2, v15, v5

    mul-int/lit16 v2, v2, -0x72ab

    const v17, 0x5d097884

    xor-int v2, v2, v17

    const v17, 0x2dc4b2f

    goto :goto_7

    :cond_8
    const-string v15, "\u06e4\u06d7"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v5

    move-object/from16 v16, v2

    xor-int v2, v15, v4

    mul-int/lit16 v2, v2, 0x3827

    const v17, -0x5c1e6083

    xor-int v2, v2, v17

    const v17, -0x48c3d35d

    :goto_7
    xor-int v15, v15, v17

    move v7, v2

    move v6, v15

    goto/16 :goto_c

    :sswitch_b
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v16, v2

    .line 48
    iput-object v1, v0, Ll/᩵᩺֫;->ۙ:Ll/ۡۗ;

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_8

    :cond_9
    const-string v2, "\u06ec\u06df"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v4

    mul-int/lit8 v2, v2, 0xb

    xor-int v15, v2, v5

    mul-int/lit16 v15, v15, 0x1d6b

    const v17, 0x504878f2

    xor-int v15, v15, v17

    const v17, 0x3bae0441

    goto/16 :goto_b

    :sswitch_c
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v16, v2

    .line 32
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v2

    if-gtz v2, :cond_a

    :goto_8
    const-string v2, "\u06db\u06ec"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v5

    mul-int/lit8 v2, v2, 0x39

    xor-int v15, v2, v4

    mul-int/lit16 v15, v15, -0x363f

    const v17, -0x24b240d

    xor-int v15, v15, v17

    const v17, 0x2f39d588

    goto/16 :goto_b

    :cond_a
    const-string v2, "\u06dc\u06ec"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v5

    xor-int v15, v2, v4

    mul-int/lit16 v15, v15, 0x4b81

    const v17, 0x683512b9

    xor-int v15, v15, v17

    const v17, -0x719d3066

    goto/16 :goto_b

    :sswitch_d
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v16, v2

    .line 64
    sget v2, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v2, :cond_b

    :goto_9
    const-string v2, "\u1a76\u1a77"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v5

    mul-int/lit8 v2, v2, -0xd

    xor-int v15, v2, v4

    mul-int/lit16 v15, v15, -0x6b0f

    const v17, 0x7b619af7

    xor-int v15, v15, v17

    const v17, -0x2851e1ba

    goto :goto_b

    :cond_b
    const-string v2, "\u06dc\u06e7"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v5

    mul-int/lit8 v2, v2, 0x25

    xor-int v15, v2, v4

    mul-int/lit16 v15, v15, -0x2e61

    const v17, 0x727627f8

    xor-int v15, v15, v17

    const v17, -0x483d5edb

    goto :goto_b

    :sswitch_e
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v16, v2

    .line 48
    new-instance v1, Ll/ۡۗ;

    invoke-direct {v1}, Ll/ۡۗ;-><init>()V

    .line 43
    sget-boolean v2, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v2, :cond_c

    :goto_a
    const-string v2, "\u1a78\u073a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v4

    mul-int/lit8 v2, v2, 0x19

    xor-int v15, v2, v5

    mul-int/lit16 v15, v15, -0x5fa1

    const v17, 0x2c32fb34

    xor-int v15, v15, v17

    const v17, -0x2f8bd545

    goto :goto_b

    :cond_c
    const-string v2, "\u05ab\u06d7"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v4

    mul-int/lit8 v2, v2, 0x1f

    xor-int v15, v2, v5

    mul-int/lit16 v15, v15, -0x62ad

    const v17, -0x2e73d6aa

    xor-int v15, v15, v17

    const v17, -0x2ec2f95a

    :goto_b
    xor-int v2, v2, v17

    move v6, v2

    move v7, v15

    :goto_c
    move-object/from16 v2, v16

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b84167c -> :sswitch_e
        -0x6e983f43 -> :sswitch_c
        -0x69e17354 -> :sswitch_7
        -0x65eb120f -> :sswitch_1
        -0x5b2f23d9 -> :sswitch_5
        -0x56f01808 -> :sswitch_2
        -0x56ae22a5 -> :sswitch_4
        -0x434232ef -> :sswitch_8
        -0x2cf00f63 -> :sswitch_6
        -0x290916e8 -> :sswitch_1
        -0x210a0566 -> :sswitch_7
        -0x14dacbe6 -> :sswitch_a
        -0x10db75e8 -> :sswitch_4
        -0xfb2018a -> :sswitch_3
        -0xb9425dd -> :sswitch_d
        -0xa8d4fb6 -> :sswitch_9
        -0x8d0d945 -> :sswitch_e
        -0x386be5d -> :sswitch_0
        0x7f1464a -> :sswitch_d
        0xe758a03 -> :sswitch_b
        0x12ad031f -> :sswitch_3
        0x1c77cabe -> :sswitch_8
        0x344b3341 -> :sswitch_c
        0x35f11dfd -> :sswitch_0
        0x372b6ed9 -> :sswitch_9
        0x38a3884e -> :sswitch_5
        0x3a4995b8 -> :sswitch_a
        0x4b6396bb -> :sswitch_b
        0x5f7b0f49 -> :sswitch_2
        0x7d6020e0 -> :sswitch_6
    .end sparse-switch
.end method

.method private ۙ()Landroid/content/ClipboardManager;
    .locals 20

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

    const v13, 0x40539883

    sget v14, Ll/ۘܽ;->᩹ۧۚ:I

    sget v15, Ll/ۗܶ;->ᩴ֫۫:I

    const-string v16, "\u0730\u1a76"

    invoke-static/range {v16 .. v16}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v16

    add-int v16, v16, v14

    mul-int/lit8 v16, v16, 0x73

    xor-int v1, v16, v15

    mul-int/lit16 v1, v1, -0x7c79

    const v18, -0x65527991

    xor-int v1, v1, v18

    const v18, -0x6b480cf1

    xor-int v16, v16, v18

    const/16 v17, 0x0

    :goto_0
    xor-int/2addr v13, v15

    mul-int/lit16 v13, v13, 0x7f43

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v1, v13

    xor-int v13, v16, v1

    sparse-switch v13, :sswitch_data_0

    move/from16 v16, v9

    sget v0, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v0, :cond_d

    goto/16 :goto_9

    .line 307
    :sswitch_0
    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v1, :cond_1

    :cond_0
    :goto_1
    move/from16 v16, v9

    goto/16 :goto_4

    :cond_1
    move/from16 v16, v9

    goto/16 :goto_9

    .line 163
    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v1, :cond_0

    :cond_2
    move/from16 v16, v9

    goto/16 :goto_a

    .line 290
    :sswitch_2
    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v1, :cond_2

    :goto_2
    move/from16 v16, v9

    goto :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    goto :goto_2

    .line 301
    :sswitch_4
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    const/4 v1, 0x0

    return-object v1

    .line 384
    :sswitch_5
    invoke-static/range {v17 .. v17}, Ll/᩶᩷ۧ;->᩷(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    iput-object v1, v0, Ll/᩵᩺֫;->᩷:Landroid/content/ClipboardManager;

    move/from16 v16, v9

    goto/16 :goto_5

    .line 383
    :sswitch_6
    invoke-static {v10, v11, v12, v9}, Ll/֨᩻;->ۧ᩹ܿ([SIII)Ljava/lang/String;

    move-result-object v17

    .line 5
    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "\u06df\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x3f

    move/from16 v16, v9

    xor-int v9, v1, v14

    mul-int/lit16 v9, v9, -0x5f63

    const v18, 0x2b320280

    xor-int v9, v9, v18

    const v18, -0xf8f3d29

    goto/16 :goto_6

    :sswitch_7
    move/from16 v16, v9

    const/16 v12, 0x9

    sget v1, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v1, :cond_4

    :goto_3
    const-string v1, "\u06e1\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v9, v1, v15

    mul-int/lit16 v9, v9, -0x66f3

    const v18, 0x1c1e0e6a

    xor-int v9, v9, v18

    const v18, 0x1003f3a4

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u073a\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v9, v1, v14

    mul-int/lit16 v9, v9, -0x10ab

    const v18, -0x6c318984

    xor-int v9, v9, v18

    const v18, -0x5c227561

    goto :goto_6

    :sswitch_8
    move/from16 v16, v9

    .line 383
    sget-object v10, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    const/4 v11, 0x1

    .line 301
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v1

    if-nez v1, :cond_5

    :goto_4
    const-string v1, "\u1a7b\u0730"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x37

    xor-int v9, v1, v15

    mul-int/lit16 v9, v9, 0x4741

    const v18, 0x68da2709

    xor-int v9, v9, v18

    const v18, -0x8d07b9a

    goto :goto_6

    :cond_5
    const-string v1, "\u1a77\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x43

    xor-int v9, v1, v15

    mul-int/lit16 v9, v9, -0x7539

    const v18, 0x8dc448c

    xor-int v9, v9, v18

    const v18, -0x2393aa93

    goto :goto_6

    .line 386
    :sswitch_9
    iget-object v1, v0, Ll/᩵᩺֫;->᩷:Landroid/content/ClipboardManager;

    return-object v1

    :sswitch_a
    move/from16 v16, v9

    .line 383
    iget-object v1, v0, Ll/᩵᩺֫;->᩷:Landroid/content/ClipboardManager;

    if-nez v1, :cond_6

    const-string v1, "\u0730\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x61

    xor-int v9, v1, v14

    mul-int/lit16 v9, v9, -0x561

    const v18, 0x7d33652f

    xor-int v9, v9, v18

    const v18, -0xad9594

    goto :goto_6

    :cond_6
    :goto_5
    const-string v1, "\u06d9\u0733"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v9, v1, v15

    mul-int/lit16 v9, v9, 0x64b7

    const v18, -0x38c960ab

    xor-int v9, v9, v18

    const v18, 0x3aa2754d

    :goto_6
    xor-int v1, v1, v18

    move/from16 v19, v16

    move/from16 v16, v1

    move v1, v9

    move/from16 v9, v19

    goto/16 :goto_0

    :sswitch_b
    const/16 v1, 0x578f

    const/16 v9, 0x578f

    goto :goto_7

    :sswitch_c
    const v1, 0x8fd1

    const v9, 0x8fd1

    :goto_7
    const-string v1, "\u06d9\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0xf

    xor-int v0, v1, v14

    mul-int/lit16 v0, v0, 0x2d1f

    const v16, 0x4d9809d0    # 3.188475E8f

    xor-int v0, v0, v16

    const v16, 0x52b9bc8b

    xor-int v16, v1, v16

    move v1, v0

    goto/16 :goto_c

    :sswitch_d
    move/from16 v16, v9

    mul-int v0, v8, v8

    sub-int/2addr v0, v6

    if-gez v0, :cond_7

    const-string v0, "\u06e2\u06d9"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x71

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x7ebb

    const v9, 0x2150eb3a

    xor-int/2addr v1, v9

    const v9, -0xd101693

    goto/16 :goto_b

    :cond_7
    const-string v0, "\u06d8\u073f"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x5f

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x427

    const v9, 0x7ee71b01

    xor-int/2addr v1, v9

    const v9, 0x14dad873

    goto/16 :goto_b

    :sswitch_e
    move/from16 v16, v9

    add-int v8, v4, v7

    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v0, :cond_8

    goto :goto_8

    :cond_8
    const-string v0, "\u05ab\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x43e3

    const v9, 0x5c9df00a

    xor-int/2addr v1, v9

    const v9, 0x70e1554b

    goto/16 :goto_b

    :sswitch_f
    move/from16 v16, v9

    mul-int v6, v4, v5

    const/16 v7, 0xd46

    .line 371
    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v0, :cond_9

    goto/16 :goto_9

    :cond_9
    const-string v0, "\u1a78\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x30bf

    const v9, 0x7aa2f9df

    xor-int/2addr v1, v9

    const v9, 0x1b745f9a

    goto/16 :goto_b

    :sswitch_10
    move/from16 v16, v9

    aget-short v4, v2, v3

    const/16 v5, 0x3518

    .line 211
    sget v0, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v0, :cond_a

    goto :goto_8

    :cond_a
    const-string v0, "\u0733\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x121b

    const v9, -0x567d1d0b

    xor-int/2addr v1, v9

    const v9, -0x24f650ee

    goto/16 :goto_b

    :sswitch_11
    move/from16 v16, v9

    const/4 v3, 0x0

    .line 41
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v0

    if-eqz v0, :cond_b

    :goto_8
    const-string v0, "\u1a77\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x2a1f

    const v9, -0x69437107

    xor-int/2addr v1, v9

    const v9, -0x741f191b

    goto/16 :goto_b

    :cond_b
    const-string v0, "\u073a\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x2d69

    const v9, -0x6ff1bb51

    xor-int/2addr v1, v9

    const v9, 0x22369859

    goto/16 :goto_b

    :sswitch_12
    move/from16 v16, v9

    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_c

    goto :goto_9

    :cond_c
    const-string v0, "\u06db\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x1269

    const v9, 0x5f8b2a58

    xor-int/2addr v1, v9

    const v9, 0x3984103b

    goto :goto_b

    :goto_9
    const-string v0, "\u06d6\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x6b

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x50e7

    const v9, -0x2fde4274

    xor-int/2addr v1, v9

    const v9, 0x5ed624dc

    goto :goto_b

    :cond_d
    const-string v0, "\u06d9\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0xce7

    const v9, 0xb9d57d7

    xor-int/2addr v1, v9

    const v9, -0x62a210ec

    goto :goto_b

    :sswitch_13
    move/from16 v16, v9

    sget-object v2, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    sget v0, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v0, :cond_e

    :goto_a
    const-string v0, "\u1a7b\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x67

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x67f

    const v9, 0x6b491a61

    xor-int/2addr v1, v9

    const v9, 0x63a3e74c

    goto :goto_b

    :cond_e
    const-string v0, "\u06d8\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x58e3

    const v9, -0x5727c5d3

    xor-int/2addr v1, v9

    const v9, 0x73d697da

    :goto_b
    xor-int/2addr v0, v9

    move/from16 v9, v16

    move/from16 v16, v0

    :goto_c
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7171c15e -> :sswitch_6
        -0x7154629a -> :sswitch_12
        -0x6f9593cd -> :sswitch_8
        -0x68b92a4b -> :sswitch_10
        -0x6547c197 -> :sswitch_3
        -0x5ed10a28 -> :sswitch_3
        -0x5dc6ae16 -> :sswitch_8
        -0x50bf9d5b -> :sswitch_0
        -0x4fd40eeb -> :sswitch_6
        -0x454fb63c -> :sswitch_7
        -0x452bfb67 -> :sswitch_13
        -0x37002a3e -> :sswitch_f
        -0x33741caa -> :sswitch_5
        -0x22728b8e -> :sswitch_a
        -0x210ed491 -> :sswitch_b
        -0x1eb6dc12 -> :sswitch_13
        -0x19967007 -> :sswitch_5
        -0x17c9929a -> :sswitch_2
        -0xd3b17e4 -> :sswitch_b
        -0x6b90594 -> :sswitch_1
        -0x55de723 -> :sswitch_9
        -0x85d57e -> :sswitch_11
        0x15706135 -> :sswitch_0
        0x1d277503 -> :sswitch_11
        0x1ddf007b -> :sswitch_4
        0x1e011122 -> :sswitch_9
        0x2953a166 -> :sswitch_2
        0x2b6d6eb2 -> :sswitch_e
        0x31c0feed -> :sswitch_10
        0x34a0909a -> :sswitch_4
        0x3fd4daa6 -> :sswitch_e
        0x43717d0e -> :sswitch_f
        0x4bdfdc16 -> :sswitch_7
        0x4d1f1758 -> :sswitch_d
        0x5887ec03 -> :sswitch_1
        0x631703a9 -> :sswitch_d
        0x713be140 -> :sswitch_12
        0x738761c1 -> :sswitch_c
        0x79389040 -> :sswitch_a
        0x7fc8db7d -> :sswitch_c
    .end sparse-switch
.end method

.method public static varargs ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x779ff01e

    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    sget v5, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v6, "\u05a8\u06e1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3475

    const v8, -0x723d77a5    # -1.19889995E-30f

    xor-int/2addr v7, v8

    const v8, 0x4d990559    # 3.2090806E8f

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x13f9

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 261
    invoke-static {v2, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :sswitch_0
    sget-boolean v6, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v6, :cond_9

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget v6, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v6, :cond_6

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v6, :cond_c

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    :goto_1
    const-string v6, "\u06d9\u1a73"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x75

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x42af

    const v8, 0x32eb4694

    xor-int/2addr v7, v8

    const v8, 0x6a930e3b

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    const/4 p0, 0x0

    return-object p0

    .line 259
    :sswitch_5
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    goto :goto_2

    .line 257
    :sswitch_6
    invoke-static {v1}, Ll/ܽۢ;->ۙ(Landroid/content/res/Configuration;)Ll/ۨۢ;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Ll/ۨۢ;->ۙ(I)Ljava/util/Locale;

    move-result-object v6

    if-nez v6, :cond_0

    const-string v6, "\u06df\u1a73"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x62e1

    const v8, 0x34a577cc

    xor-int/2addr v7, v8

    const v8, 0x5135437c

    goto :goto_0

    :cond_0
    move-object v2, v6

    :goto_2
    const-string v6, "\u06db\u06ec"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x65

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x45af

    const v8, 0xd9d570b

    xor-int/2addr v7, v8

    const v8, -0x5689ae52

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 91
    sget v6, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v6, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v6, "\u1a7a\u06e1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x47

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1e77

    const v8, -0x4d1555a8

    xor-int/2addr v7, v8

    const v8, 0x16fc61cd

    goto/16 :goto_0

    .line 257
    :sswitch_8
    invoke-static {}, Ll/᩶᩷ۧ;->ۗ()Landroid/content/res/Resources;

    move-result-object v0

    .line 30
    sget v6, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v6, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v6, "\u073f\u06eb"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x41

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x271f

    const v8, -0x6296c940

    xor-int/2addr v7, v8

    const v8, -0x4fb66aa

    goto/16 :goto_0

    .line 9
    :sswitch_9
    sget v6, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v6, :cond_3

    goto :goto_3

    :cond_3
    const-string v6, "\u073f\u0736"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4b6f

    const v8, 0x370557bc

    xor-int/2addr v7, v8

    const v8, -0x54ddb2f0

    goto/16 :goto_0

    .line 19
    :sswitch_a
    sget v6, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v6, :cond_4

    goto :goto_3

    :cond_4
    const-string v6, "\u1a78\u05a1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3171

    const v8, 0x24a831f9

    xor-int/2addr v7, v8

    const v8, -0x3d21fbb3    # -111.0084f

    goto/16 :goto_0

    .line 33
    :sswitch_b
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_4

    :cond_5
    const-string v6, "\u06ec\u05ab"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x3

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x72ed

    const v8, 0x52be2d79

    xor-int/2addr v7, v8

    const v8, 0x4bba080c    # 2.4383512E7f

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v6, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v6, :cond_7

    :cond_6
    :goto_3
    const-string v6, "\u05a1\u1a74"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2121

    const v8, -0x7a6f58b1

    xor-int/2addr v7, v8

    const v8, -0x3da9c9b9

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06df\u1a76"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x39

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7d87

    const v8, -0x69df57d

    xor-int/2addr v7, v8

    const v8, 0x3ad7b461

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v6, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v6, :cond_8

    goto :goto_4

    :cond_8
    const-string v6, "\u1a74\u1a74"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x75

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1673

    const v8, -0x26ce2718

    xor-int/2addr v7, v8

    const v8, -0x6e6516e7

    goto/16 :goto_0

    .line 29
    :sswitch_e
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v6

    if-ltz v6, :cond_a

    :cond_9
    :goto_4
    const-string v6, "\u06e1\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6beb

    const v8, -0x501ee8b0

    xor-int/2addr v7, v8

    const v8, -0x64061701

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06db\u1a76"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xabd

    const v8, -0x769cda9d

    xor-int/2addr v7, v8

    const v8, -0x4b6e99f2

    goto/16 :goto_0

    .line 222
    :sswitch_f
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v6

    if-gtz v6, :cond_b

    :goto_5
    const-string v6, "\u1a73\u06e4"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x78c9

    const v8, -0x7e3f42c4

    xor-int/2addr v7, v8

    const v8, -0x7a67565d

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u1a7a\u1a7a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x5f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7789

    const v8, -0x26c5d999

    xor-int/2addr v7, v8

    const v8, -0x665f1a88

    goto/16 :goto_0

    .line 96
    :sswitch_10
    sget v6, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v6, :cond_d

    :cond_c
    :goto_6
    const-string v6, "\u06da\u06e0"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x30a3

    const v8, 0x136f0edf

    xor-int/2addr v7, v8

    const v8, -0x7ce8b119

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u05a8\u0730"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3671

    const v8, 0x5b84df4b

    xor-int/2addr v7, v8

    const v8, -0x7867d4f9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79450634 -> :sswitch_2
        -0x756ec5ba -> :sswitch_7
        -0x6e1a9833 -> :sswitch_c
        -0x6bbb7893 -> :sswitch_4
        -0x63ef8226 -> :sswitch_1
        -0x5ffb2617 -> :sswitch_2
        -0x5f70e6c7 -> :sswitch_9
        -0x587abb1c -> :sswitch_10
        -0x2f10f184 -> :sswitch_4
        -0x2e7be2cc -> :sswitch_e
        -0x2aeda60a -> :sswitch_b
        -0x2257332b -> :sswitch_7
        -0x1eba4d04 -> :sswitch_3
        -0x1cf3ff4f -> :sswitch_d
        -0x1a35452e -> :sswitch_f
        0xa1c8cbb -> :sswitch_a
        0xa7e5a58 -> :sswitch_f
        0x12fd48df -> :sswitch_10
        0x213d39ab -> :sswitch_b
        0x2831cd5d -> :sswitch_6
        0x33678b55 -> :sswitch_5
        0x391b326a -> :sswitch_5
        0x413e5d43 -> :sswitch_8
        0x46259444 -> :sswitch_e
        0x4fc051ae -> :sswitch_c
        0x5283689b -> :sswitch_6
        0x5c9c0904 -> :sswitch_d
        0x62db5260 -> :sswitch_a
        0x64a75982 -> :sswitch_0
        0x660a75e0 -> :sswitch_3
        0x6f8474d0 -> :sswitch_9
        0x6f8764f6 -> :sswitch_0
        0x71e5c59c -> :sswitch_1
        0x7231f3ed -> :sswitch_8
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/᩵᩺֫;)Ll/ۗ᩺֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵᩺֫;->֫:Ll/ۗ᩺֫;

    return-object p0
.end method

.method public static ۙ(Ll/᩵᩺֫;Ljava/lang/Class;)V
    .locals 20

    move-object/from16 v1, p0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, 0x4de45ebb    # 4.789267E8f

    sget v13, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v14, Ll/ۘ֡;->᩹ܶ۬:I

    const-string v15, "\u1a7a\u1a79"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x3889

    const v17, 0x5050eafc

    xor-int v0, v0, v17

    const v17, -0x406123ba

    xor-int v15, v15, v17

    move-object v5, v4

    move/from16 v16, v15

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v15, 0x4de45ebb    # 4.789267E8f

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, 0x54c9

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v18, v5

    move/from16 v16, v15

    const/high16 v0, 0x10000000

    .line 333
    :try_start_0
    invoke-static {v2, v0}, Ll/֡ۖ;->ۙۖ۟(Ljava/lang/Object;I)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v0, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v0, :cond_0

    move-object/from16 v18, v5

    move/from16 v16, v15

    goto/16 :goto_b

    :cond_0
    const-string v0, "\u1a79\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x39

    move/from16 v16, v15

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x68f9

    const v18, 0x79eed595

    xor-int v15, v15, v18

    const v18, -0x647dac26

    goto/16 :goto_a

    :sswitch_1
    move/from16 v16, v15

    .line 248
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-lez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    move-object/from16 v18, v5

    goto/16 :goto_c

    :sswitch_2
    move/from16 v16, v15

    .line 178
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget v0, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v0, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v18, v5

    goto/16 :goto_e

    :sswitch_3
    move/from16 v16, v15

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v0, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    move-object/from16 v18, v5

    goto/16 :goto_b

    :sswitch_4
    move/from16 v16, v15

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    const-string v0, "\u05ab\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x5f

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x1625

    const v18, -0x5d5a656b

    xor-int v15, v15, v18

    const v18, 0x22f74c5c

    goto/16 :goto_a

    :sswitch_5
    move/from16 v16, v15

    .line 35
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    sget v0, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v0, :cond_5

    goto :goto_2

    :cond_5
    const-string v0, "\u1a76\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x1bad

    const v18, -0x7c25993e

    xor-int v15, v15, v18

    const v18, -0x44b41f0b

    goto/16 :goto_a

    :sswitch_6
    move/from16 v16, v15

    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-gez v0, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    const-string v0, "\u073f\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x35

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x5dcf

    const v18, 0x5055ed7e

    xor-int v15, v15, v18

    const v18, -0x72f0e52e

    goto/16 :goto_a

    :sswitch_7
    move/from16 v16, v15

    .line 217
    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-lez v0, :cond_11

    goto :goto_3

    :sswitch_8
    move/from16 v16, v15

    .line 55
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    :goto_3
    const-string v0, "\u06db\u0733"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x8f1

    const v18, 0x2cea5aa2

    xor-int v15, v15, v18

    const v18, -0x3943bb4b

    goto/16 :goto_a

    .line 39
    :sswitch_9
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    :sswitch_a
    return-void

    :sswitch_b
    move/from16 v16, v15

    .line 329
    :try_start_1
    sget-object v0, Ll/᩵᩺֫;->ۜ᩷ۜ:[S
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v15, 0x13

    move-object/from16 v18, v5

    const/16 v5, 0x10

    :try_start_2
    invoke-static {v0, v15, v5, v12}, Ll/ۗ֡;->ۘ᩺ۘ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 331
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v0, v5}, Ll/ۗܶ;->᩸ۗۗ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object/from16 v18, v5

    goto/16 :goto_6

    .line 334
    :goto_4
    invoke-static {v3, v2}, Ll/ۖ᩵;->᩶ᩳۚ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const-string v0, "\u06e0\u1a74"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x2d

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x2d99

    const v15, 0x5c55a1d

    xor-int/2addr v5, v15

    const v15, -0x28167226

    goto/16 :goto_f

    :sswitch_c
    move-object/from16 v18, v5

    move/from16 v16, v15

    if-eqz p1, :cond_7

    const-string v0, "\u06e2\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x44c1

    const v15, 0x10de46ce

    xor-int/2addr v5, v15

    const v15, 0x120ffc33

    goto/16 :goto_f

    :cond_7
    :goto_5
    const-string v0, "\u06d7\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, 0x24e7

    const v15, 0x3e9e266f

    xor-int/2addr v5, v15

    const v15, 0x7e23da17

    goto/16 :goto_f

    .line 336
    :sswitch_d
    invoke-virtual {v1, v4}, Ll/᩵᩺֫;->log(Ljava/lang/Throwable;)V

    .line 337
    invoke-static {v4}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܽ;->ۤ᩷᩸(Ljava/lang/Object;)Ll/᩸۠ۧ;

    return-void

    :sswitch_e
    move-object/from16 v18, v5

    move/from16 v16, v15

    .line 327
    :try_start_3
    invoke-static {}, Ll/ۗۖ;->᩺ۛۧ()Landroid/app/Application;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 328
    :try_start_4
    new-instance v2, Landroid/content/Intent;

    sget-object v0, Ll/ۨ᩺֫;->ۚ:Ljava/lang/Class;

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    sget-object v0, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    const/16 v5, 0xb

    const/16 v15, 0x8

    invoke-static {v0, v5, v15, v12}, Ll/ۖ֡;->ۢ۫᩷([SIII)Ljava/lang/String;

    move-result-object v0

    .line 87
    iget-object v5, v1, Ll/᩵᩺֫;->۫:Ljava/lang/String;

    .line 329
    invoke-static {v2, v0, v5}, Ll/ۗܶ;->᩸ۗۗ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const-string v0, "\u06e2\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x23

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x682d

    const v15, 0x4a3092f8    # 2892990.0f

    xor-int/2addr v5, v15

    const v15, -0x41b6db9b

    goto/16 :goto_f

    :catchall_1
    move-exception v0

    move-object v4, v0

    const/4 v2, 0x0

    goto :goto_7

    :catchall_2
    move-exception v0

    :goto_6
    move-object v4, v0

    :goto_7
    const-string v0, "\u0733\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x2b31

    const v15, 0x43a174cf

    xor-int/2addr v5, v15

    const v15, -0x1283e9f

    goto/16 :goto_f

    :sswitch_f
    move-object/from16 v18, v5

    move/from16 v16, v15

    const/16 v0, 0x5623

    const/16 v12, 0x5623

    goto :goto_8

    :sswitch_10
    move-object/from16 v18, v5

    move/from16 v16, v15

    const/16 v0, 0x3c30

    const/16 v12, 0x3c30

    :goto_8
    const-string v0, "\u1a73\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x17a3

    const v15, 0x30272957

    xor-int/2addr v5, v15

    const v15, 0x65667248

    goto/16 :goto_f

    :sswitch_11
    move-object/from16 v18, v5

    move/from16 v16, v15

    mul-int v0, v11, v11

    sub-int/2addr v0, v9

    if-ltz v0, :cond_8

    const-string v0, "\u1a7b\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x73

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x1237

    const v15, -0x3b37c265

    xor-int/2addr v5, v15

    const v15, -0x4d1011a9

    goto/16 :goto_f

    :cond_8
    const-string v0, "\u06e7\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x39

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x5b69

    const v15, -0x28cf31db

    xor-int/2addr v5, v15

    const v15, 0x63076f53

    goto/16 :goto_f

    :sswitch_12
    move-object/from16 v18, v5

    move/from16 v16, v15

    add-int v11, v7, v10

    sget-boolean v0, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v0, :cond_9

    goto/16 :goto_c

    :cond_9
    const-string v0, "\u06e1\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x27b1

    const v15, -0x711b6acf    # -5.6350006E-30f

    xor-int/2addr v5, v15

    const v15, 0x50c91fc5

    goto/16 :goto_f

    :sswitch_13
    move-object/from16 v18, v5

    move/from16 v16, v15

    mul-int v9, v7, v8

    const/16 v10, 0x3751

    .line 46
    sget-boolean v0, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v0, :cond_a

    goto/16 :goto_b

    :cond_a
    const-string v0, "\u1a77\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x1f

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x619d

    const v15, -0x5558fa6e

    xor-int/2addr v5, v15

    const v15, 0x7758f01c    # 4.400024E33f

    goto/16 :goto_f

    :sswitch_14
    move-object/from16 v18, v5

    move/from16 v16, v15

    aget-short v7, v18, v6

    const v8, 0xdd44

    .line 119
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v0

    if-ltz v0, :cond_b

    const-string v0, "\u06ec\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, 0x60f9

    const v15, 0x5fb74d90

    xor-int/2addr v5, v15

    const v15, 0x26ab86d6

    goto/16 :goto_f

    :cond_b
    const-string v0, "\u1a76\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x6f

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, 0x6b01

    const v15, -0x48be13b7

    xor-int/2addr v5, v15

    const v15, 0x2d6383c8

    goto/16 :goto_f

    :sswitch_15
    move-object/from16 v18, v5

    move/from16 v16, v15

    const/16 v6, 0xa

    .line 217
    sget-boolean v0, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v0, :cond_c

    :goto_9
    move-object/from16 v5, v18

    goto/16 :goto_d

    :cond_c
    const-string v0, "\u06d8\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x5b83

    const v15, 0x2da2854

    xor-int/2addr v5, v15

    const v15, -0x324dba63

    goto/16 :goto_f

    :sswitch_16
    move/from16 v16, v15

    sget-object v5, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    .line 136
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v0

    if-gtz v0, :cond_d

    goto/16 :goto_d

    :cond_d
    const-string v0, "\u1a7b\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x51

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x15e3

    const v18, 0x5086be0a

    xor-int v15, v15, v18

    const v18, -0x5d95a08f

    :goto_a
    xor-int v0, v0, v18

    move/from16 v19, v16

    move/from16 v16, v0

    move v0, v15

    move/from16 v15, v19

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v18, v5

    move/from16 v16, v15

    .line 177
    sget v0, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v0, :cond_e

    :goto_b
    const-string v0, "\u06d9\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x1d

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x477f

    const v15, -0x73ec68d7

    xor-int/2addr v5, v15

    const v15, 0x6fc6fe3f

    goto/16 :goto_f

    :cond_e
    const-string v0, "\u06d9\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x4015

    const v15, -0x7877d8a6

    xor-int/2addr v5, v15

    const v15, -0x1441f8cb

    goto/16 :goto_f

    :sswitch_18
    move-object/from16 v18, v5

    move/from16 v16, v15

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_c

    :cond_f
    const-string v0, "\u06e1\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x3f

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x61d9

    const v15, 0x28db4057

    xor-int/2addr v5, v15

    const v15, -0x20f1ab2a

    goto/16 :goto_f

    :sswitch_19
    move-object/from16 v18, v5

    move/from16 v16, v15

    sget v0, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v0, :cond_10

    :goto_c
    const-string v0, "\u05ab\u05a1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x4f

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, 0x3961

    const v15, -0x55e0591d

    xor-int/2addr v5, v15

    const v15, -0x36474d01

    goto/16 :goto_f

    :cond_10
    const-string v0, "\u0730\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x2835

    const v15, -0x7a0d970b

    xor-int/2addr v5, v15

    const v15, -0x4c99f540

    goto :goto_f

    :sswitch_1a
    move-object/from16 v18, v5

    move/from16 v16, v15

    .line 234
    sget-boolean v0, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v0, :cond_12

    goto/16 :goto_9

    :cond_11
    :goto_d
    const-string v0, "\u073f\u06da"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x7b87

    const v18, -0x5183238d

    xor-int v15, v15, v18

    const v18, 0x75975a25

    goto/16 :goto_a

    :cond_12
    const-string v0, "\u06d9\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x43

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x20a3

    const v15, 0x392bb0c

    xor-int/2addr v5, v15

    const v15, 0x6161968b

    goto :goto_f

    :sswitch_1b
    move-object/from16 v18, v5

    move/from16 v16, v15

    .line 117
    sget v0, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v0, :cond_13

    :goto_e
    const-string v0, "\u06e0\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x35

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x3ad

    const v15, 0xae2c1f1

    xor-int/2addr v5, v15

    const v15, 0x6865fefa

    goto :goto_f

    :cond_13
    const-string v0, "\u05ab\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x43

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x14e7

    const v15, -0x3a8305d6

    xor-int/2addr v5, v15

    const v15, 0x2018ecb6

    :goto_f
    xor-int/2addr v0, v15

    move/from16 v15, v16

    move/from16 v16, v0

    move v0, v5

    move-object/from16 v5, v18

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a446511 -> :sswitch_6
        -0x6c193560 -> :sswitch_12
        -0x6b9f9a46 -> :sswitch_11
        -0x6a054e49 -> :sswitch_b
        -0x69fa35b1 -> :sswitch_1b
        -0x6501554d -> :sswitch_18
        -0x605f607e -> :sswitch_1b
        -0x5da15628 -> :sswitch_4
        -0x5d02692c -> :sswitch_17
        -0x5cb33bff -> :sswitch_15
        -0x529d2a95 -> :sswitch_14
        -0x4eb36d0b -> :sswitch_4
        -0x4dc95fc5 -> :sswitch_5
        -0x4b9b9882 -> :sswitch_15
        -0x41c8983f -> :sswitch_9
        -0x3dd97ae0 -> :sswitch_16
        -0x348b6b6f -> :sswitch_6
        -0x2ee5d41f -> :sswitch_13
        -0x28b081d0 -> :sswitch_d
        -0x2716db61 -> :sswitch_13
        -0x21fadfc7 -> :sswitch_f
        -0x20dc6a69 -> :sswitch_17
        -0x1c7320e1 -> :sswitch_2
        -0x12fc479e -> :sswitch_1a
        -0xcbe159f -> :sswitch_14
        -0xbb3e8a0 -> :sswitch_d
        -0x7b02193 -> :sswitch_9
        0x199eb1b -> :sswitch_c
        0x8c290d3 -> :sswitch_10
        0xf330298 -> :sswitch_0
        0x11968954 -> :sswitch_7
        0x17b7b304 -> :sswitch_12
        0x23e636cb -> :sswitch_a
        0x25075857 -> :sswitch_c
        0x29d93c5b -> :sswitch_e
        0x2cfc528b -> :sswitch_b
        0x3002e85e -> :sswitch_8
        0x3b1641fa -> :sswitch_f
        0x3b3bd4e7 -> :sswitch_3
        0x4b43598a -> :sswitch_10
        0x5473ad57 -> :sswitch_18
        0x595a1781 -> :sswitch_1
        0x59c10a9d -> :sswitch_1a
        0x5b9609f9 -> :sswitch_e
        0x5c0fe468 -> :sswitch_8
        0x60118427 -> :sswitch_19
        0x6016c7d9 -> :sswitch_3
        0x614046b6 -> :sswitch_0
        0x633d71d0 -> :sswitch_7
        0x66e5151d -> :sswitch_16
        0x670c3eed -> :sswitch_1
        0x675d5953 -> :sswitch_5
        0x67ce685c -> :sswitch_a
        0x71f3257c -> :sswitch_2
        0x79519c14 -> :sswitch_11
        0x7c3b8c7b -> :sswitch_19
    .end sparse-switch
.end method

.method public static ᩷(Ljava/lang/String;)Ljava/lang/String;
    .locals 21

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

    const v15, 0x4aae0ba7    # 5703123.5f

    sget v16, Ll/ۗ֡;->ۜ᩻۫:I

    sget v17, Ll/ۗ᩺;->֡ۙۜ:I

    const-string v18, "\u06eb\u06d9"

    invoke-static/range {v18 .. v18}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v17

    xor-int v0, v18, v16

    mul-int/lit16 v0, v0, -0x4779

    const v20, -0x44dee215

    xor-int v0, v0, v20

    const v20, 0x638a7647

    xor-int v18, v18, v20

    move-object/from16 v20, v3

    move-object v11, v10

    move-object v13, v12

    move/from16 v19, v18

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, 0x4aae0ba7    # 5703123.5f

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v4, v18, v16

    mul-int/lit16 v4, v4, 0x2aeb

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    const/4 v0, 0x7

    .line 374
    invoke-static {v11, v12, v0, v10}, Ll/ۗ᩵;->᩶֡᩺([SIII)Ljava/lang/String;

    move-result-object v2

    .line 375
    invoke-static {v1, v2}, Ll/֡ܳ;->ܰܳ᩷(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "\u05a1\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x5227

    const v19, -0x5ed3ca4f

    xor-int v4, v4, v19

    const v19, -0x1b23cde

    goto/16 :goto_7

    :sswitch_0
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v0

    if-gtz v0, :cond_5

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v0, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v0, "\u06d8\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x13

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x6e55

    const v19, -0x4236e51d

    xor-int v4, v4, v19

    const v19, -0x33f8b320

    goto/16 :goto_7

    :sswitch_2
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    sget v0, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v0, :cond_b

    goto/16 :goto_6

    .line 170
    :sswitch_3
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    goto/16 :goto_6

    .line 272
    :sswitch_4
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    move-object/from16 v0, p0

    .line 376
    invoke-static {v2, v0}, Ll/֨ᩳ;->ܶ᩷ᩴ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :sswitch_6
    move-object/from16 v0, p0

    .line 375
    invoke-static {v13, v14, v15, v10}, Ll/֨ۖ;->ۜ᩸ۖ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Ll/֡ܳ;->ܰܳ᩷(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "\u06e1\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v17

    mul-int/lit8 v4, v4, -0x35

    xor-int v0, v4, v16

    mul-int/lit16 v0, v0, 0x5e0d

    const v19, 0x774a2048

    xor-int v0, v0, v19

    const v19, -0x299df2a2

    xor-int v19, v4, v19

    goto/16 :goto_0

    :sswitch_7
    const/16 v15, 0x8

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v0

    if-ltz v0, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v0, "\u06d8\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x69

    xor-int v4, v0, v17

    mul-int/lit8 v4, v4, 0x23

    const v19, 0x7e7dc3c3

    xor-int v4, v4, v19

    const v19, 0x425eeeea

    goto/16 :goto_7

    :sswitch_8
    sget-object v13, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    const/16 v14, 0x2b

    .line 114
    sget-boolean v0, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v0, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v0, "\u06d6\u06df"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x13c5

    const v19, 0x2237f41d

    xor-int v4, v4, v19

    const v19, -0x2d4e18da

    goto/16 :goto_7

    :sswitch_9
    return-object v3

    :cond_3
    move-object/from16 v3, p0

    :goto_1
    const-string v0, "\u1a79\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x49

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x5dd3

    const v19, 0x2e26fa1c

    xor-int v4, v4, v19

    const v19, 0x6eb0103f

    goto/16 :goto_7

    :sswitch_a
    const/16 v12, 0x24

    sget v0, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v0, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v0, "\u1a7a\u06d6"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x606d

    const v19, 0x3f9edfa1

    xor-int v4, v4, v19

    const v19, 0x5b8845f2

    goto/16 :goto_7

    .line 374
    :sswitch_b
    invoke-static/range {p0 .. p0}, Ll/ۗ᩸;->ۤۢ᩷(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v11, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    .line 365
    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v0, :cond_6

    :cond_5
    :goto_2
    const-string v0, "\u06df\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x2bab

    const v19, -0x64ace56f

    xor-int v4, v4, v19

    const v19, -0x2d98ffe1

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u0736\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x29f3

    const v19, 0x545971a1

    xor-int v4, v4, v19

    const v19, 0x7b91e7df

    goto/16 :goto_7

    :sswitch_c
    const/16 v0, 0x47d3

    const/16 v10, 0x47d3

    goto :goto_3

    :sswitch_d
    const/16 v0, 0x103f

    const/16 v10, 0x103f

    :goto_3
    const-string v0, "\u073f\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x6cf

    const v19, 0x5894fb24

    xor-int v4, v4, v19

    const v19, 0x438f5de7

    goto/16 :goto_7

    :sswitch_e
    add-int v0, v6, v9

    mul-int v0, v0, v0

    sub-int/2addr v0, v8

    if-gez v0, :cond_7

    const-string v0, "\u0736\u06eb"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x2d

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x5f8d

    const v19, -0x5b76afa7

    xor-int v4, v4, v19

    const v19, -0x3498d42

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u1a76\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x50ab

    const v19, -0x5f84cef1

    xor-int v4, v4, v19

    const v19, -0x473549fe

    goto/16 :goto_7

    :sswitch_f
    const/4 v9, 0x1

    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v0, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u1a79\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x57

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x7f2b

    const v19, -0x5d03d2ab

    xor-int v4, v4, v19

    const v19, -0x6d53f86d

    goto/16 :goto_7

    :sswitch_10
    add-int/lit8 v8, v7, 0x1

    .line 344
    sget v0, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v0, :cond_9

    goto :goto_5

    :cond_9
    const-string v0, "\u05ab\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x47

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x52a5

    const v19, -0x1b178b29

    xor-int v4, v4, v19

    const v19, 0x669326ae

    goto/16 :goto_7

    :sswitch_11
    mul-int/lit8 v7, v6, 0x2

    .line 322
    sget v0, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v0, :cond_a

    goto :goto_5

    :cond_a
    const-string v0, "\u1a7b\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x67

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x283f

    const v19, 0x56fd0bd3

    xor-int v4, v4, v19

    const v19, 0x4b914bff    # 1.904435E7f

    goto/16 :goto_7

    :sswitch_12
    aget-short v6, v20, v5

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v0

    if-eqz v0, :cond_c

    :cond_b
    :goto_4
    const-string v0, "\u06e1\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x4df7

    const v19, -0x2c1541e9

    xor-int v4, v4, v19

    const v19, 0x523ab3b7

    goto/16 :goto_7

    :cond_c
    const-string v0, "\u1a74\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x67

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x19d3

    const v19, -0x4b6c469e

    xor-int v4, v4, v19

    const v19, 0x56c23d04

    goto :goto_7

    :sswitch_13
    const/16 v5, 0x23

    sget v0, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v0, :cond_d

    :goto_5
    const-string v0, "\u06d6\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x41

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x1833

    const v19, 0x6a267b6c

    xor-int v4, v4, v19

    const v19, -0x4180437f

    goto :goto_7

    :cond_d
    const-string v0, "\u073a\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x7c67

    const v19, -0x646a07d1

    xor-int v4, v4, v19

    const v19, 0x81a48b3

    goto :goto_7

    :sswitch_14
    sget-object v20, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    .line 219
    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_e

    :goto_6
    const-string v0, "\u1a79\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x71e7

    const v19, 0x55764db0

    xor-int v4, v4, v19

    const v19, 0xf9fe068

    goto :goto_7

    :cond_e
    const-string v0, "\u073d\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x5e97

    const v19, -0x55d7e7a4

    xor-int v4, v4, v19

    const v19, 0x472b00ff

    :goto_7
    xor-int v19, v0, v19

    move v0, v4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7af00332 -> :sswitch_c
        -0x761cda31 -> :sswitch_d
        -0x7431172b -> :sswitch_3
        -0x6bb2c190 -> :sswitch_a
        -0x6573eac9 -> :sswitch_4
        -0x62f5838d -> :sswitch_12
        -0x627e5cb9 -> :sswitch_b
        -0x57082671 -> :sswitch_13
        -0x47e93d66 -> :sswitch_7
        -0x4219b3f8 -> :sswitch_3
        -0x3e8c4f2e -> :sswitch_6
        -0x2bdb32e1 -> :sswitch_11
        -0x296097be -> :sswitch_b
        -0x201c6e16 -> :sswitch_2
        -0x13f90200 -> :sswitch_9
        -0xa31d104 -> :sswitch_5
        -0x9659a50 -> :sswitch_14
        -0x1070806 -> :sswitch_f
        0x87dfcf -> :sswitch_a
        0x1613bbd -> :sswitch_2
        0x336fedc -> :sswitch_5
        0x19a82150 -> :sswitch_14
        0x1cb79a00 -> :sswitch_f
        0x1cf998f9 -> :sswitch_8
        0x1d7c57cc -> :sswitch_e
        0x22ae2202 -> :sswitch_6
        0x2330197e -> :sswitch_10
        0x2a934a33 -> :sswitch_c
        0x2dd9438a -> :sswitch_d
        0x35310331 -> :sswitch_e
        0x385bc17b -> :sswitch_0
        0x399696d3 -> :sswitch_9
        0x3d6d1e45 -> :sswitch_7
        0x40974494 -> :sswitch_4
        0x45eb47fa -> :sswitch_12
        0x47771571 -> :sswitch_1
        0x4f76aed9 -> :sswitch_10
        0x535bfa07 -> :sswitch_11
        0x5dc2145c -> :sswitch_13
        0x676ac2e2 -> :sswitch_0
        0x6b5db8f0 -> :sswitch_8
        0x704070f4 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final cancelToast()V
    .locals 6

    const v0, 0x3a24d5ab

    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    sget v2, Ll/ۖܰ;->۟֫ܽ:I

    const-string v3, "\u1a77\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x654f

    const v5, -0x60d13ac

    xor-int/2addr v4, v5

    const v5, 0x13bb846c

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x5ac5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_3

    goto/16 :goto_2

    .line 69
    :sswitch_0
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-lez v3, :cond_5

    goto/16 :goto_1

    .line 329
    :sswitch_1
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_7

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_9

    goto/16 :goto_2

    .line 483
    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    goto/16 :goto_2

    .line 311
    :sswitch_4
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    return-void

    .line 94
    :sswitch_5
    new-instance v3, Ll/۟᩶᩻;

    .line 136
    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v0, 0x1

    .line 94
    invoke-direct {v3, v0}, Ll/۟᩶᩻;-><init>(I)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :sswitch_6
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v3

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06db\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6493

    const v5, 0x33b1368

    xor-int/2addr v4, v5

    const v5, -0x6e6f2fdb

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u073d\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3875

    const v5, -0x6911261f

    xor-int/2addr v4, v5

    const v5, -0x45ef43fb

    goto :goto_0

    :cond_3
    const-string v3, "\u06e4\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x629f

    const v5, 0x4a02b25

    xor-int/2addr v4, v5

    const v5, 0x8e6d25f

    goto/16 :goto_0

    .line 182
    :sswitch_8
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v3, "\u06e8\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x77e3

    const v5, 0x2f63106b

    xor-int/2addr v4, v5

    const v5, 0x5002cbe

    goto/16 :goto_0

    .line 266
    :sswitch_9
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    const-string v3, "\u05a8\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x706d

    const v5, -0x41e79903

    xor-int/2addr v4, v5

    const v5, -0x4ca9cf1d

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06ec\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2111

    const v5, -0x78760209

    xor-int/2addr v4, v5

    const v5, 0x3d68d95

    goto/16 :goto_0

    .line 147
    :sswitch_a
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_8

    :cond_7
    const-string v3, "\u073a\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5dbf

    const v5, 0x742e920b

    xor-int/2addr v4, v5

    const v5, 0x414e499c

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06db\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1333

    const v5, 0x3ba3b95c

    xor-int/2addr v4, v5

    const v5, -0x69b7a0e7

    goto/16 :goto_0

    .line 206
    :sswitch_b
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v3

    if-gtz v3, :cond_a

    :cond_9
    :goto_1
    const-string v3, "\u073f\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3715

    const v5, 0x67a1b1ac

    xor-int/2addr v4, v5

    const v5, -0x11a8a4c8

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d7\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2d9f

    const v5, 0x14063b4

    xor-int/2addr v4, v5

    const v5, 0x77eb37c6

    goto/16 :goto_0

    .line 144
    :sswitch_c
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_b

    :goto_2
    const-string v3, "\u0733\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6353

    const v5, 0x6e9ac3fd

    xor-int/2addr v4, v5

    const v5, 0x3c31b2f6

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a75\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4437

    const v5, 0x19a4c61d

    xor-int/2addr v4, v5

    const v5, -0x1fac14e4

    goto/16 :goto_0

    .line 484
    :sswitch_d
    sget-object v3, Ll/ۚۛ֫;->ܳ:Ll/ܺ᩺֫;

    .line 284
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_c

    :goto_3
    const-string v3, "\u1a75\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x238f

    const v5, 0x5c02c85e

    xor-int/2addr v4, v5

    const v5, 0xfe57664

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d9\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6bdf

    const v5, -0x60588353

    xor-int/2addr v4, v5

    const v5, 0x52fe9c22

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ba3ff4e -> :sswitch_1
        -0x74dc7fa9 -> :sswitch_c
        -0x74731197 -> :sswitch_9
        -0x7106fb16 -> :sswitch_d
        -0x4cd4c0a2 -> :sswitch_5
        -0x4a7b927e -> :sswitch_2
        -0x34662e58 -> :sswitch_6
        -0x136dd94f -> :sswitch_b
        -0xd81437d -> :sswitch_6
        -0xcc6fcd6 -> :sswitch_a
        -0xc8107b2 -> :sswitch_8
        -0xc5516d2 -> :sswitch_b
        -0xb981323 -> :sswitch_9
        -0xa4cf26f -> :sswitch_4
        -0x7b7346c -> :sswitch_a
        -0x6d918c6 -> :sswitch_3
        -0x4c7e173 -> :sswitch_1
        0x13d1a04b -> :sswitch_7
        0x14a717fe -> :sswitch_8
        0x14cf0e00 -> :sswitch_3
        0x18970a7f -> :sswitch_0
        0x189fc836 -> :sswitch_7
        0x1a909524 -> :sswitch_c
        0x3a62f0f3 -> :sswitch_2
        0x3fd1ea73 -> :sswitch_5
        0x4ed70568 -> :sswitch_0
        0x6d144485 -> :sswitch_d
        0x745fb349 -> :sswitch_4
    .end sparse-switch
.end method

.method public final getAssetLocalString(Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 290
    invoke-virtual {p0, p1}, Ll/᩵᩺֫;->ۙ(Ljava/lang/String;)Ll/ܺ᩺֫;

    move-result-object p1

    return-object p1
.end method

.method public final getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x771af813

    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    sget v4, Ll/᩺;->۫۬۫:I

    const-string v5, "\u1a77\u1a76"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6d6d

    const v7, 0x5587b0b5

    xor-int/2addr v6, v7

    const v7, -0x2ec94bdb

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x462d

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v5, :cond_7

    goto/16 :goto_2

    :sswitch_0
    sget v5, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v5, :cond_2

    goto/16 :goto_2

    .line 92
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v5

    if-gez v5, :cond_6

    goto/16 :goto_4

    .line 37
    :sswitch_2
    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    if-lez v5, :cond_b

    goto/16 :goto_3

    .line 57
    :sswitch_3
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    const/4 p1, 0x0

    return-object p1

    .line 155
    :sswitch_5
    iget-object v0, p0, Ll/᩵᩺֫;->֫:Ll/ۗ᩺֫;

    invoke-interface {v0, p1}, Ll/ۗ᩺֫;->getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 77
    :sswitch_6
    new-instance v5, Ll/᩹᩺֫;

    invoke-direct {v5, p0}, Ll/᩹᩺֫;-><init>(Ll/᩵᩺֫;)V

    iput-object v5, p0, Ll/᩵᩺֫;->᩻:Ll/۫᩺֫;

    goto :goto_1

    .line 76
    :sswitch_7
    iput-object v1, p0, Ll/᩵᩺֫;->֫:Ll/ۗ᩺֫;

    .line 79
    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v5, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v5, "\u06da\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x356f

    const v7, -0x61436d14

    xor-int/2addr v6, v7

    const v7, -0x67fb79f2

    goto :goto_0

    .line 76
    :sswitch_8
    invoke-static {v0}, Ll/ܿۨ֫;->ۙ(Ll/ܿۨ֫;)Ll/۟᩵ᩴ;

    move-result-object v1

    sget v5, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u06ec\u06d8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5643

    const v7, -0x2f239671

    xor-int/2addr v6, v7

    const v7, -0x9efefa2

    goto :goto_0

    :sswitch_9
    iget-object v0, p0, Ll/᩵᩺֫;->ۧ:Ll/ۘۨ֫;

    iget-object v0, v0, Ll/ۘۨ֫;->ۙ:Ll/ܿۨ֫;

    .line 123
    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_3

    :cond_2
    const-string v5, "\u1a7a\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x78bb

    const v7, 0x1b6259b0

    xor-int/2addr v6, v7

    const v7, -0x6b569284

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06d7\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x180f

    const v7, 0x64225062

    xor-int/2addr v6, v7

    const v7, 0xbd88b25

    goto/16 :goto_0

    .line 74
    :sswitch_a
    iget-object v5, p0, Ll/᩵᩺֫;->֫:Ll/ۗ᩺֫;

    if-eqz v5, :cond_4

    :goto_1
    const-string v5, "\u06db\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6419

    const v7, 0x3cbb3aa5

    xor-int/2addr v6, v7

    const v7, -0x30b556bc    # -3.4000906E9f

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06db\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x51

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x73f5

    const v7, -0x435316cf

    xor-int/2addr v6, v7

    const v7, 0x306eab1

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u1a7b\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1d9b

    const v7, 0x16ff3484

    xor-int/2addr v6, v7

    const v7, 0x14f84c8d

    goto/16 :goto_0

    :cond_6
    :goto_2
    const-string v5, "\u0733\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4cd5

    const v7, -0x7d92b84e

    xor-int/2addr v6, v7

    const v7, 0x449f94bb

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u1a73\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3473

    const v7, -0x5db37680

    xor-int/2addr v6, v7

    const v7, 0x396ca862

    goto/16 :goto_0

    .line 106
    :sswitch_c
    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u05a8\u06ec"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6515

    const v7, -0x7693079f

    xor-int/2addr v6, v7

    const v7, -0x60bc4bcf

    goto/16 :goto_0

    .line 29
    :sswitch_d
    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_9

    :goto_3
    const-string v5, "\u06e7\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x6d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x49fb

    const v7, -0x1fbc3d6a

    xor-int/2addr v6, v7

    const v7, 0x2777ffb1

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06e7\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x7f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x34cd

    const v7, 0x5f0e426d

    xor-int/2addr v6, v7

    const v7, -0x7628b596

    goto/16 :goto_0

    .line 94
    :sswitch_e
    sget v5, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v5, :cond_a

    goto :goto_5

    :cond_a
    const-string v5, "\u1a7a\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x1b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x535f

    const v7, -0x7cb7cc87

    xor-int/2addr v6, v7

    const v7, -0x60e3b5f4

    goto/16 :goto_0

    .line 109
    :sswitch_f
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v5

    if-ltz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u1a75\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x43

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1a53

    const v7, -0x5ff93f40

    xor-int/2addr v6, v7

    const v7, 0xc5e6ac2

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06ec\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x23

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xd7b

    const v7, -0x60040b5a

    xor-int/2addr v6, v7

    const v7, -0x2bcfba29

    goto/16 :goto_0

    .line 111
    :sswitch_10
    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_d

    :goto_5
    const-string v5, "\u06e7\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x272b

    const v7, 0x451098fd

    xor-int/2addr v6, v7

    const v7, -0xee60719

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a78\u06e7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x71f

    const v7, 0x7cb98ced

    xor-int/2addr v6, v7

    const v7, 0x55855feb

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f802510 -> :sswitch_3
        -0x79dc1eb1 -> :sswitch_9
        -0x7354c261 -> :sswitch_8
        -0x6c6bbfbd -> :sswitch_a
        -0x67f9a40a -> :sswitch_9
        -0x64e50ac9 -> :sswitch_3
        -0x59a09d77 -> :sswitch_c
        -0x44d2b234 -> :sswitch_0
        -0x43db5b3c -> :sswitch_7
        -0x41eea4d3 -> :sswitch_4
        -0x40f902be -> :sswitch_4
        -0x383737ce -> :sswitch_1
        -0x2dcfca01 -> :sswitch_6
        -0x2c7cc746 -> :sswitch_6
        -0x26575990 -> :sswitch_0
        -0x2161b44a -> :sswitch_1
        -0x1e9dd11c -> :sswitch_b
        -0x191e5140 -> :sswitch_f
        -0x14295694 -> :sswitch_10
        -0x7bb91f1 -> :sswitch_5
        -0x5748055 -> :sswitch_c
        -0x2e5f579 -> :sswitch_e
        0x38cc130 -> :sswitch_b
        0xdb20157 -> :sswitch_2
        0x16c4fe5e -> :sswitch_5
        0x26d330a1 -> :sswitch_e
        0x28b783a3 -> :sswitch_d
        0x2e1824de -> :sswitch_a
        0x313b0250 -> :sswitch_8
        0x39780230 -> :sswitch_f
        0x3e7a118a -> :sswitch_10
        0x55489eaf -> :sswitch_d
        0x7ce74d6f -> :sswitch_7
        0x7e7c3e8f -> :sswitch_2
    .end sparse-switch
.end method

.method public final getClipboardText()Ljava/lang/CharSequence;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x6125a50b

    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    const-string v6, "\u06e7\u06dc"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x17c7

    const v8, -0x5f56371b

    xor-int/2addr v7, v8

    const v8, -0x116488b7

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x36af

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 41
    sget v6, Ll/ۧ;->ۨۗܰ:I

    if-ltz v6, :cond_a

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v6

    if-eqz v6, :cond_5

    goto/16 :goto_6

    .line 228
    :sswitch_1
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v6

    if-eqz v6, :cond_c

    goto/16 :goto_2

    .line 391
    :sswitch_2
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    goto/16 :goto_2

    .line 255
    :sswitch_3
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_4
    :try_start_0
    const-string v2, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :sswitch_5
    return-object v2

    :sswitch_6
    if-nez v0, :cond_0

    const-string v6, "\u05ab\u06d6"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6df1

    const v8, -0x73cd3fb6

    xor-int/2addr v7, v8

    const v8, 0x369f5c97

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_1
    const-string v6, "\u06e0\u06db"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1e2b

    const v8, 0x3c7ec6e6

    xor-int/2addr v7, v8

    const v8, 0x23f14543

    goto :goto_0

    .line 407
    :sswitch_7
    invoke-static {v1}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 404
    :sswitch_8
    :try_start_1
    invoke-direct {p0}, Ll/᩵᩺֫;->ۙ()Landroid/content/ClipboardManager;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "\u05a8\u06d9"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x675b

    const v8, 0x20cee6c3

    xor-int/2addr v7, v8

    const v8, -0x3a651b47

    goto :goto_0

    :catchall_0
    move-exception v1

    const-string v6, "\u06d9\u1a7b"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6ee3

    const v8, -0x21a8e8d

    xor-int/2addr v7, v8

    const v8, 0x6a001fae

    goto/16 :goto_0

    .line 146
    :sswitch_9
    sget v6, Ll/ۖ;->ܿۚ֡:I

    if-ltz v6, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v6, "\u06dc\u0730"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x727d

    const v8, -0x7dac1046

    xor-int/2addr v7, v8

    const v8, -0x2cdda828

    goto/16 :goto_0

    :sswitch_a
    sget v6, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v6, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v6, "\u06d9\u06d7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x7b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x53e9

    const v8, 0x2df3c703

    xor-int/2addr v7, v8

    const v8, 0x51476dcc

    goto/16 :goto_0

    .line 368
    :sswitch_b
    sget v6, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v6, :cond_3

    goto :goto_2

    :cond_3
    const-string v6, "\u1a74\u05a8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x9

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x50a1

    const v8, -0x5545ac11

    xor-int/2addr v7, v8

    const v8, -0x79f9f102

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v6, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v6, :cond_4

    :goto_2
    const-string v6, "\u1a75\u06eb"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7c93

    const v8, 0x6bc5f76

    xor-int/2addr v7, v8

    const v8, 0x50f3fcfd

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u06db\u06db"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3975

    const v8, -0x5528a7f7

    xor-int/2addr v7, v8

    const v8, 0x708583a0

    goto/16 :goto_0

    .line 28
    :sswitch_d
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v6

    if-eqz v6, :cond_6

    :cond_5
    :goto_3
    const-string v6, "\u06ec\u073a"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x28d1

    const v8, 0x39dfc5bf

    xor-int/2addr v7, v8

    const v8, -0x2107e5a7

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u06db\u06eb"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4e63

    const v8, -0x15e4f23d

    xor-int/2addr v7, v8

    const v8, 0x4dd6422b    # 4.4933258E8f

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v6

    if-gtz v6, :cond_7

    goto :goto_5

    :cond_7
    const-string v6, "\u06dc\u06e8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x752d

    const v8, -0x4a7fd26d    # -9.550007E-7f

    xor-int/2addr v7, v8

    const v8, 0x2ee03ff1

    goto/16 :goto_0

    .line 220
    :sswitch_f
    sget-boolean v6, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v6, :cond_8

    :goto_4
    const-string v6, "\u06ec\u06e1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x41

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x429b

    const v8, -0x532faa5f

    xor-int/2addr v7, v8

    const v8, 0x2e9c714f

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u1a7a\u06e0"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x31

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x574f

    const v8, 0xce726aa

    xor-int/2addr v7, v8

    const v8, -0x7c45703e

    goto/16 :goto_0

    :sswitch_10
    sget v6, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v6, :cond_9

    goto :goto_6

    :cond_9
    const-string v6, "\u06eb\u073d"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6aed

    const v8, -0x348467d7    # -1.6488489E7f

    xor-int/2addr v7, v8

    const v8, -0x127808e6

    goto/16 :goto_0

    :sswitch_11
    sget v6, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v6, :cond_b

    :cond_a
    :goto_5
    const-string v6, "\u05a8\u1a79"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x51

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x12bb

    const v8, -0x70a1691d

    xor-int/2addr v7, v8

    const v8, -0x641aedf4

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u1a7b\u06d6"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x45

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6a5

    const v8, -0x9e73c70

    xor-int/2addr v7, v8

    const v8, -0x6070363f

    goto/16 :goto_0

    .line 120
    :sswitch_12
    sget v6, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v6, :cond_d

    :cond_c
    :goto_6
    const-string v6, "\u073d\u06eb"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4f15

    const v8, -0x7bff9f44

    xor-int/2addr v7, v8

    const v8, -0x51b04e20

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06d6\u06d9"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x55

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5b6f

    const v8, 0x19660f01

    xor-int/2addr v7, v8

    const v8, -0x9d3c50b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x743c3e21 -> :sswitch_d
        -0x66a6412f -> :sswitch_f
        -0x5ec870bf -> :sswitch_9
        -0x55d9ac12 -> :sswitch_1
        -0x4a057f14 -> :sswitch_10
        -0x3956a725 -> :sswitch_d
        -0x37c48605 -> :sswitch_b
        -0x37566f3d -> :sswitch_4
        -0x3447dde2 -> :sswitch_5
        -0xa06a73e -> :sswitch_e
        -0x8118e4e -> :sswitch_c
        -0x399a312 -> :sswitch_10
        0x2bead2 -> :sswitch_11
        0x45bccb9 -> :sswitch_b
        0x5a02cb0 -> :sswitch_1
        0x6d2173a -> :sswitch_12
        0xd71ca2f -> :sswitch_7
        0x143d140c -> :sswitch_5
        0x1b8e6655 -> :sswitch_0
        0x1e4c07d6 -> :sswitch_0
        0x1ede6515 -> :sswitch_7
        0x242e5392 -> :sswitch_3
        0x2dd3ee2e -> :sswitch_6
        0x388fb9e5 -> :sswitch_12
        0x39080d22 -> :sswitch_c
        0x3b6b30aa -> :sswitch_8
        0x3bb2939b -> :sswitch_11
        0x42417e65 -> :sswitch_4
        0x4606ea08 -> :sswitch_2
        0x469470c1 -> :sswitch_e
        0x49908eef -> :sswitch_f
        0x53675ca0 -> :sswitch_a
        0x5835b78b -> :sswitch_6
        0x5e5ac1c8 -> :sswitch_a
        0x66abb2b1 -> :sswitch_8
        0x73874f51 -> :sswitch_2
        0x77cf6375 -> :sswitch_9
        0x7ff14b71 -> :sswitch_3
    .end sparse-switch
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    .line 144
    invoke-static {}, Ll/ۚۛ֫;->᩷()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getFileLocalString(Ljava/io/File;Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, -0x2dc1d3b5

    sget v12, Ll/֫֡;->֫ۙۖ:I

    sget v13, Ll/ۖۙ;->ۤۧۤ:I

    const-string v14, "\u06df\u1a78"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0x77

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x67cf

    const v16, 0x1b5e465c

    xor-int v15, v15, v16

    const v16, 0x7b12e87f

    xor-int v14, v14, v16

    :goto_0
    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, 0xc83

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 143
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    const/4 v1, 0x0

    return-object v1

    .line 84
    :sswitch_0
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget v14, Ll/֨ۢ;->۬ܿܺ:I

    if-gez v14, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v17, v6

    move/from16 v16, v11

    move-object/from16 v11, p1

    goto/16 :goto_9

    :cond_1
    move/from16 v16, v11

    goto :goto_4

    .line 203
    :sswitch_1
    sget v14, Ll/ۗܰ;->ܶۜ۬:I

    if-gez v14, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v17, v6

    move/from16 v16, v11

    goto :goto_5

    .line 25
    :sswitch_2
    sget v14, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v14, :cond_0

    :goto_2
    move-object/from16 v17, v6

    move/from16 v18, v8

    move/from16 v16, v11

    :goto_3
    move-object/from16 v11, p1

    goto/16 :goto_e

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    goto :goto_2

    .line 302
    :sswitch_4
    new-instance v14, Ll/ܺ᩺֫;

    .line 47
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v16

    if-eqz v16, :cond_3

    goto :goto_1

    :cond_3
    move/from16 v16, v11

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v11

    invoke-static {v15, v11}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v11

    if-ltz v11, :cond_4

    :goto_4
    const-string v11, "\u05a1\u06e8"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v12, v11

    mul-int/lit8 v11, v11, -0x79

    xor-int v14, v11, v13

    mul-int/lit16 v14, v14, -0x3699

    const v15, -0x5d9b1f35

    xor-int/2addr v15, v14

    const v14, -0x233d8526

    xor-int/2addr v14, v11

    move/from16 v11, v16

    goto :goto_0

    :cond_4
    sget-object v11, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    move-object/from16 v17, v6

    const/4 v6, 0x1

    .line 209
    sget v19, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v19, :cond_5

    :goto_5
    const-string v6, "\u06e4\u06d8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v13

    xor-int v11, v6, v12

    mul-int/lit16 v11, v11, 0x5e8b

    const v14, 0x5549836c

    xor-int v15, v11, v14

    const v11, 0x442dd242

    xor-int v14, v6, v11

    goto/16 :goto_b

    :cond_5
    move/from16 v18, v8

    const/16 v8, 0x34

    .line 47
    invoke-static {v11, v8, v6, v10}, Ll/ۖۙ;->ۘ᩹ܰ([SIII)Ljava/lang/String;

    move-result-object v6

    .line 43
    sget v8, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v8, :cond_6

    move-object/from16 v11, p1

    move-object/from16 v6, v17

    goto/16 :goto_c

    .line 47
    :cond_6
    invoke-static {v15, v6}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v15, v1}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v15}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 84
    sget v8, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v8, :cond_7

    goto :goto_3

    .line 47
    :cond_7
    new-instance v8, Ll/ۚ᩺֫;

    move-object/from16 v11, p1

    invoke-direct {v8, v11}, Ll/ۚ᩺֫;-><init>(Ljava/io/File;)V

    .line 269
    sget v15, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v15, :cond_8

    move/from16 v8, v18

    goto/16 :goto_9

    .line 47
    :cond_8
    invoke-direct {v14, v0, v1, v6, v8}, Ll/ܺ᩺֫;-><init>(Ll/᩵᩺֫;Ljava/lang/String;Ljava/lang/String;Ll/۫᩺֫;)V

    .line 303
    new-instance v5, Ljava/lang/ref/SoftReference;

    invoke-direct {v5, v14}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 304
    invoke-virtual {v2, v1, v5}, Ll/ۡۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v5, v14

    goto :goto_6

    :sswitch_5
    return-object v5

    :sswitch_6
    move-object/from16 v17, v6

    move/from16 v18, v8

    move/from16 v16, v11

    move-object/from16 v11, p1

    if-nez v4, :cond_9

    const-string v6, "\u06e0\u0736"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v13

    mul-int/lit8 v6, v6, -0x15

    xor-int v8, v6, v12

    mul-int/lit16 v8, v8, -0x150b

    const v14, -0x5a7380d1

    xor-int v15, v8, v14

    const v8, 0x347ed8c0

    goto/16 :goto_f

    :cond_9
    move-object v5, v4

    :goto_6
    const-string v6, "\u06e1\u06ec"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v12

    mul-int/lit8 v6, v6, 0x21

    xor-int v8, v6, v13

    mul-int/lit16 v8, v8, -0x6d57

    const v14, -0x61623009

    xor-int v15, v8, v14

    const v8, -0x79b1d4b1

    goto/16 :goto_f

    :sswitch_7
    move-object/from16 v17, v6

    move/from16 v18, v8

    move/from16 v16, v11

    move-object/from16 v11, p1

    .line 299
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺ᩺֫;

    goto :goto_7

    :sswitch_8
    move-object/from16 v17, v6

    move/from16 v18, v8

    move/from16 v16, v11

    move-object/from16 v11, p1

    const/4 v4, 0x0

    :goto_7
    const-string v6, "\u06eb\u1a74"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v12

    xor-int v8, v6, v13

    mul-int/lit16 v8, v8, 0x3d79

    const v14, 0x5a5273c9

    xor-int v15, v8, v14

    const v8, 0xee2e4ad

    goto/16 :goto_f

    :sswitch_9
    move-object/from16 v17, v6

    move/from16 v18, v8

    move/from16 v16, v11

    move-object/from16 v11, p1

    .line 296
    iget-object v2, v0, Ll/᩵᩺֫;->ᩴ:Ll/ۡۗ;

    invoke-virtual {v2, v1}, Ll/ۡۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/Reference;

    if-eqz v3, :cond_a

    const-string v6, "\u06e1\u06e4"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v13

    mul-int/lit8 v6, v6, -0x71

    xor-int v8, v6, v12

    mul-int/lit16 v8, v8, -0x6385

    const v14, 0x199d015

    xor-int v15, v8, v14

    const v8, 0x7c1e443c

    goto/16 :goto_f

    :cond_a
    const-string v6, "\u06dc\u06e0"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v13, v6

    mul-int/lit8 v6, v6, 0x6d

    xor-int v8, v6, v12

    mul-int/lit16 v8, v8, 0x18b7

    const v14, -0x676f36e0

    xor-int v15, v8, v14

    const v8, -0x6d4c6355

    goto/16 :goto_f

    :sswitch_a
    move-object/from16 v17, v6

    move/from16 v18, v8

    move/from16 v16, v11

    move-object/from16 v11, p1

    const v6, 0xac6d

    const v10, 0xac6d

    goto :goto_8

    :sswitch_b
    move-object/from16 v17, v6

    move/from16 v18, v8

    move/from16 v16, v11

    move-object/from16 v11, p1

    const/16 v6, 0xc14

    const/16 v10, 0xc14

    :goto_8
    const-string v6, "\u06db\u1a77"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v12, v6

    mul-int/lit8 v6, v6, -0x11

    xor-int v8, v6, v13

    mul-int/lit16 v8, v8, 0x21e7

    const v14, -0x4607bb34

    xor-int v15, v8, v14

    const v8, -0x61efed32

    goto/16 :goto_f

    :sswitch_c
    move-object/from16 v17, v6

    move/from16 v18, v8

    move/from16 v16, v11

    move-object/from16 v11, p1

    add-int v6, v7, v9

    mul-int v6, v6, v6

    sub-int v6, v6, v18

    if-gez v6, :cond_b

    const-string v6, "\u06d9\u1a78"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v12

    xor-int v8, v6, v13

    mul-int/lit16 v8, v8, -0x871

    const v14, -0x631e3f8e

    xor-int v15, v8, v14

    const v8, 0x170b66b8

    goto/16 :goto_f

    :cond_b
    const-string v6, "\u06e8\u06eb"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v13

    xor-int v8, v6, v12

    mul-int/lit16 v8, v8, 0x1f67

    const v14, 0x26761e06

    xor-int v15, v8, v14

    const v8, 0x57a8c09c

    goto/16 :goto_f

    :sswitch_d
    move-object/from16 v17, v6

    move/from16 v16, v11

    move-object/from16 v11, p1

    mul-int/lit16 v8, v7, 0x5328

    const/16 v9, 0x14ca

    .line 220
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v6

    if-eqz v6, :cond_c

    :goto_9
    const-string v6, "\u06d7\u1a76"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v12

    xor-int v14, v6, v13

    mul-int/lit16 v14, v14, 0x1eb5

    const v15, -0x29599799

    xor-int/2addr v15, v14

    const v14, 0x51154702

    goto :goto_a

    :cond_c
    const-string v6, "\u06dc\u06e8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v12

    mul-int/lit8 v6, v6, 0xb

    xor-int v14, v6, v13

    mul-int/lit16 v14, v14, -0x9dd

    const v15, -0xbc5e9f0

    xor-int/2addr v15, v14

    const v14, -0x1879089c

    :goto_a
    xor-int/2addr v14, v6

    :goto_b
    move/from16 v11, v16

    move-object/from16 v6, v17

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v17, v6

    move/from16 v18, v8

    move/from16 v16, v11

    move-object/from16 v11, p1

    const/16 v6, 0x33

    aget-short v7, v17, v6

    .line 259
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v6

    if-nez v6, :cond_d

    goto :goto_e

    :cond_d
    const-string v6, "\u06ec\u0736"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v13

    xor-int v8, v6, v12

    mul-int/lit16 v8, v8, 0x4501

    const v14, 0xc86fa5

    xor-int v15, v8, v14

    const v8, -0x2030120c

    goto :goto_f

    :sswitch_f
    move/from16 v18, v8

    move/from16 v16, v11

    move-object/from16 v11, p1

    sget-object v6, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    .line 222
    sget v8, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v8, :cond_e

    :goto_c
    const-string v8, "\u06d6\u06da"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v13

    xor-int v14, v8, v12

    mul-int/lit16 v14, v14, 0x7f93

    const v15, -0x3eb71270

    xor-int/2addr v15, v14

    const v14, 0x3eb309b0

    goto :goto_d

    :cond_e
    const-string v8, "\u06d9\u1a74"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v12

    mul-int/lit8 v8, v8, -0x43

    xor-int v14, v8, v13

    mul-int/lit16 v14, v14, -0x58ed

    const v15, 0x6f85a1a

    xor-int/2addr v15, v14

    const v14, -0x1fc68e40

    :goto_d
    xor-int/2addr v14, v8

    move/from16 v11, v16

    goto :goto_10

    :sswitch_10
    move-object/from16 v17, v6

    move/from16 v18, v8

    move/from16 v16, v11

    move-object/from16 v11, p1

    .line 232
    sget v6, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v6, :cond_f

    :goto_e
    const-string v6, "\u06ec\u1a74"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v13

    xor-int v8, v6, v12

    mul-int/lit16 v8, v8, 0x5347

    const v14, 0x56dfaea9

    xor-int v15, v8, v14

    const v8, -0x61bbdae4

    goto :goto_f

    :cond_f
    const-string v6, "\u06e4\u06da"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v13

    mul-int/lit8 v6, v6, -0x51

    xor-int v8, v6, v12

    mul-int/lit16 v8, v8, -0x3b01

    const v14, -0x273e8a0f

    xor-int v15, v8, v14

    const v8, -0x74533e13

    :goto_f
    xor-int v14, v6, v8

    move/from16 v11, v16

    move-object/from16 v6, v17

    :goto_10
    move/from16 v8, v18

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77d393db -> :sswitch_8
        -0x72bcfc90 -> :sswitch_b
        -0x721c6dc7 -> :sswitch_1
        -0x6a2b27c1 -> :sswitch_7
        -0x5a313e2a -> :sswitch_2
        -0x5979b90a -> :sswitch_6
        -0x493bed02 -> :sswitch_0
        -0x42f09983 -> :sswitch_d
        -0x417df6e2 -> :sswitch_9
        -0x4123dd61 -> :sswitch_7
        -0x3f45b874 -> :sswitch_c
        -0x3ebd9733 -> :sswitch_1
        -0x33a53044 -> :sswitch_2
        -0x3013da52 -> :sswitch_a
        -0x3000a935 -> :sswitch_8
        -0x202023eb -> :sswitch_b
        -0x11f22e5d -> :sswitch_4
        -0xc07f388 -> :sswitch_5
        -0x5bbabcc -> :sswitch_4
        -0x47efca5 -> :sswitch_3
        0xff7ece4 -> :sswitch_9
        0x14294d98 -> :sswitch_10
        0x18746951 -> :sswitch_3
        0x2b15484b -> :sswitch_e
        0x2b761d42 -> :sswitch_e
        0x3062fdfa -> :sswitch_c
        0x3a6af3c0 -> :sswitch_f
        0x41796828 -> :sswitch_0
        0x4783d468 -> :sswitch_6
        0x57b8f1b4 -> :sswitch_d
        0x59e342a9 -> :sswitch_f
        0x5e6a482b -> :sswitch_a
        0x5eb9df4a -> :sswitch_5
        0x6d7bf7e1 -> :sswitch_10
    .end sparse-switch
.end method

.method public final getFilesDir()Ljava/io/File;
    .locals 7

    const/4 v0, 0x0

    const v1, 0x7f2ab7ea

    sget v2, Ll/ۗ֡;->ۜ᩻۫:I

    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    const-string v4, "\u06dc\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x9d5

    const v6, -0x6e9315e5

    xor-int/2addr v5, v6

    const v6, 0x25a07c2b

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x6e8b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 319
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->֡()Z

    goto :goto_2

    :sswitch_0
    sget v4, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v4, :cond_b

    goto/16 :goto_4

    .line 152
    :sswitch_1
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_8

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-gez v4, :cond_3

    goto :goto_1

    .line 188
    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    :goto_1
    const-string v4, "\u06d8\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2d03

    const v6, -0xb28b465

    xor-int/2addr v5, v6

    const v6, -0xecb4e7

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    const/4 v0, 0x0

    return-object v0

    .line 320
    :sswitch_5
    new-instance v1, Ljava/io/File;

    invoke-static {v0}, Ll/֨ۨ;->֨֡ܳ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v1

    .line 318
    :sswitch_6
    invoke-static {v0}, Ll/֫ۢ;->ۖܿ֡(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "\u06d9\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4091

    const v6, -0x23db08fa

    xor-int/2addr v5, v6

    const v6, 0x634cfdd8

    goto :goto_0

    :cond_0
    :goto_2
    const-string v4, "\u06d8\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x233b

    const v6, -0x13864562

    xor-int/2addr v5, v6

    const v6, -0x392ee6ad

    goto :goto_0

    .line 36
    :sswitch_7
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v4, "\u1a7a\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5819

    const v6, 0x733d8eda

    xor-int/2addr v5, v6

    const v6, 0x66f639e6

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v4, "\u05a1\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x31eb

    const v6, 0x685b3c03

    xor-int/2addr v5, v6

    const v6, -0x60f79efc

    goto/16 :goto_0

    .line 244
    :sswitch_9
    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v4, :cond_4

    :cond_3
    :goto_3
    const-string v4, "\u06db\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7f19

    const v6, -0x5697e678

    xor-int/2addr v5, v6

    const v6, -0x5b999889

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06dc\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x453

    const v6, -0x34203298    # -2.9334224E7f

    xor-int/2addr v5, v6

    const v6, -0x2f3a09a9

    goto/16 :goto_0

    .line 101
    :sswitch_a
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v4, "\u05a1\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x451b

    const v6, -0x218c6487

    xor-int/2addr v5, v6

    const v6, 0x56eee5c9

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_6

    goto :goto_4

    :cond_6
    const-string v4, "\u073a\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x21e5

    const v6, -0x475bf0c6

    xor-int/2addr v5, v6

    const v6, 0x41c8c09b

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_7

    goto :goto_5

    :cond_7
    const-string v4, "\u073a\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x52a5

    const v6, 0x47257863

    xor-int/2addr v5, v6

    const v6, -0x749dd136

    goto/16 :goto_0

    .line 227
    :sswitch_d
    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v4, :cond_9

    :cond_8
    :goto_4
    const-string v4, "\u06da\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4e5d

    const v6, 0x4aa4750b    # 5388933.5f

    xor-int/2addr v5, v6

    const v6, 0x240d7f0c

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u05ab\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6e33

    const v6, -0x61bfa193

    xor-int/2addr v5, v6

    const v6, -0x3a247078

    goto/16 :goto_0

    .line 160
    :sswitch_e
    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v4, :cond_a

    goto :goto_5

    :cond_a
    const-string v4, "\u073a\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4931

    const v6, 0xe3c55a7

    xor-int/2addr v5, v6

    const v6, 0x2c078db5

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u06d7\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xc7d

    const v6, 0x4e0a5250    # 5.8016256E8f

    xor-int/2addr v5, v6

    const v6, 0x67fec111

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d9\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x209d

    const v6, 0x4c201fa2    # 4.197543E7f

    xor-int/2addr v5, v6

    const v6, -0x6c260a5a

    goto/16 :goto_0

    .line 318
    :sswitch_10
    iget-object v0, p0, Ll/᩵᩺֫;->᩸:Ll/᩷ۨᩴ;

    .line 56
    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_d

    :goto_6
    const-string v4, "\u1a7a\u1a75"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x293b

    const v6, 0x6e26485c

    xor-int/2addr v5, v6

    const v6, 0x14fa08f6

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06d8\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3fe7

    const v6, 0x3cea18db

    xor-int/2addr v5, v6

    const v6, 0x793a35d2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e8a9d30 -> :sswitch_6
        -0x7db31737 -> :sswitch_d
        -0x777d81bd -> :sswitch_1
        -0x76f0b1d6 -> :sswitch_4
        -0x522b6570 -> :sswitch_d
        -0x4b4573ac -> :sswitch_7
        -0x3f92565d -> :sswitch_6
        -0x3e993b71 -> :sswitch_1
        -0x35834f65 -> :sswitch_10
        -0x2c7466b0 -> :sswitch_f
        -0x2aa767c0 -> :sswitch_b
        -0x292d731a -> :sswitch_a
        -0x172aae86 -> :sswitch_e
        -0xf89702b -> :sswitch_9
        -0xc65be71 -> :sswitch_a
        -0xc14c09e -> :sswitch_9
        -0x4da9b99 -> :sswitch_0
        0x146c067 -> :sswitch_10
        0xd86045f -> :sswitch_c
        0xe782bd4 -> :sswitch_3
        0x162ea284 -> :sswitch_4
        0x25715680 -> :sswitch_8
        0x35aa2329 -> :sswitch_0
        0x35c8ee54 -> :sswitch_2
        0x3c6f92da -> :sswitch_f
        0x3f190e82 -> :sswitch_8
        0x47edc76b -> :sswitch_5
        0x4bbaaa22 -> :sswitch_3
        0x58ded891 -> :sswitch_e
        0x60491d4a -> :sswitch_5
        0x6343e66a -> :sswitch_c
        0x6473dacd -> :sswitch_2
        0x64beebbc -> :sswitch_b
        0x70d4f7cd -> :sswitch_7
    .end sparse-switch
.end method

.method public final getHostPackageName()Ljava/lang/String;
    .locals 1

    .line 112
    invoke-static {}, Ll/᩶᩷ۧ;->᩹()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getHostVersionCode()I
    .locals 1

    const v0, 0x18e699d

    return v0
.end method

.method public final getHostVersionName()Ljava/lang/String;
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

    const v10, -0x20ece37e

    sget v11, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v12, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v13, "\u06d8\u06d9"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x7b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x2e1b

    const v15, 0xde10595

    xor-int/2addr v14, v15

    const v15, -0x5a0f542d

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, -0xe79

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    sget v13, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v13, :cond_b

    goto/16 :goto_3

    .line 3
    :sswitch_0
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v13

    if-nez v13, :cond_c

    goto/16 :goto_3

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v13

    if-nez v13, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v13, "\u06e2\u1a7a"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7a7f

    const v15, 0x362e5246

    xor-int/2addr v14, v15

    const v15, -0x2c31af31

    goto :goto_0

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v13

    if-nez v13, :cond_8

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/4 v0, 0x7

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/֨ᩳ;->ۘ᩸֨([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    sget-object v8, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    const/16 v9, 0x36

    .line 1
    sget v13, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v13, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v13, "\u06e8\u05a1"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x13

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1a23

    const v15, -0x4d56abd

    xor-int/2addr v14, v15

    const v15, -0x61e2b1d0

    goto :goto_0

    :sswitch_7
    const v7, 0xa0f0

    goto :goto_1

    :sswitch_8
    const/16 v7, 0x36b3

    :goto_1
    const-string v13, "\u06ec\u1a7a"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x7f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x14ad

    const v15, 0x62e89dbd

    xor-int/2addr v14, v15

    const v15, 0x6ea31b70

    goto/16 :goto_0

    :sswitch_9
    add-int v13, v5, v6

    sub-int/2addr v13, v4

    if-ltz v13, :cond_2

    const-string v13, "\u06df\u1a76"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2d9

    const v15, -0x71736b6a

    xor-int/2addr v14, v15

    const v15, -0x591ff019

    goto/16 :goto_0

    :cond_2
    const-string v13, "\u06ec\u06d7"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x726f

    const v15, 0x620842c

    xor-int/2addr v14, v15

    const v15, 0x63f63fb3

    goto/16 :goto_0

    :sswitch_a
    const v6, 0x3fc40e1

    .line 2
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v13

    if-eqz v13, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v13, "\u06eb\u073f"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0xf

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x328f

    const v15, -0x2bb4c42

    xor-int/2addr v14, v15

    const v15, -0xf755264

    goto/16 :goto_0

    :sswitch_b
    mul-int v4, v2, v3

    mul-int v5, v2, v2

    sget v13, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v13, :cond_4

    goto :goto_2

    :cond_4
    const-string v13, "\u06e7\u073a"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x37

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7f9b

    const v15, -0x6b1216ae

    xor-int/2addr v14, v15

    const v15, -0x36aa462a

    goto/16 :goto_0

    :sswitch_c
    aget-short v2, v0, v1

    const/16 v3, 0x3fe2

    .line 4
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v13

    if-nez v13, :cond_5

    goto :goto_2

    :cond_5
    const-string v13, "\u1a78\u06d6"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x5

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3cff

    const v15, 0x65ebba70

    xor-int/2addr v14, v15

    const v15, -0x780a854d

    goto/16 :goto_0

    :sswitch_d
    const/16 v1, 0x35

    .line 0
    sget v13, Ll/ۖ;->ܿۚ֡:I

    if-ltz v13, :cond_6

    goto :goto_2

    :cond_6
    const-string v13, "\u1a78\u073f"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1ef9

    const v15, -0x37dcba16

    xor-int/2addr v14, v15

    const v15, 0x50dafba5

    goto/16 :goto_0

    :sswitch_e
    sget v13, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v13, :cond_7

    :goto_2
    const-string v13, "\u06e8\u06db"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x482b

    const v15, -0x7e61c0ca

    xor-int/2addr v14, v15

    const v15, -0xe048dad

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u073f\u06dc"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5fb5

    const v15, -0x67b0fbe5

    xor-int/2addr v14, v15

    const v15, 0x1812c983

    goto/16 :goto_0

    .line 4
    :sswitch_f
    sget-boolean v13, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v13, :cond_9

    :cond_8
    const-string v13, "\u1a76\u1a77"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x59

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5edd

    const v15, -0x26e0838d

    xor-int/2addr v14, v15

    const v15, 0x6abb33d6

    goto/16 :goto_0

    :cond_9
    const-string v13, "\u06e1\u06e0"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x3f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2b3b

    const v15, 0x5b197f20

    xor-int/2addr v14, v15

    const v15, -0x76bdd492

    goto/16 :goto_0

    .line 1
    :sswitch_10
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v13

    if-gtz v13, :cond_a

    goto :goto_4

    :cond_a
    const-string v13, "\u06e4\u06db"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x37

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x2a37

    const v15, -0x742e0d6d

    xor-int/2addr v14, v15

    const v15, 0x2a8b1b40

    goto/16 :goto_0

    :goto_3
    const-string v13, "\u05a1\u1a7a"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x11d9

    const v15, -0x5631136e

    xor-int/2addr v14, v15

    const v15, 0x1d699c52

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u06e2\u06ec"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x5487

    const v15, -0x6959ae53

    xor-int/2addr v14, v15

    const v15, 0x2449d1d7

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    sget v13, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v13, :cond_d

    :cond_c
    :goto_4
    const-string v13, "\u1a76\u06e4"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x2a27

    const v15, -0x3a84763c

    xor-int/2addr v14, v15

    const v15, -0x2b768d14

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u1a73\u0736"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x6d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x744f

    const v15, 0x4605ed99

    xor-int/2addr v14, v15

    const v15, -0x3e02de27

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7431a2d1 -> :sswitch_3
        -0x71fd2ac7 -> :sswitch_d
        -0x62cddf74 -> :sswitch_10
        -0x5eaf3842 -> :sswitch_2
        -0x59ebce95 -> :sswitch_1
        -0x56f28254 -> :sswitch_3
        -0x53674ab1 -> :sswitch_f
        -0x4f032c03 -> :sswitch_a
        -0x4e090d82 -> :sswitch_6
        -0x48826683 -> :sswitch_11
        -0x4518d6a0 -> :sswitch_b
        -0x429f075d -> :sswitch_b
        -0x42745168 -> :sswitch_e
        -0x3897881b -> :sswitch_a
        -0x30f71040 -> :sswitch_0
        -0x2ea6a141 -> :sswitch_c
        -0x2b8167c7 -> :sswitch_8
        -0x2a002669 -> :sswitch_2
        -0x23fdaed6 -> :sswitch_e
        -0x1fce0d76 -> :sswitch_5
        -0x1706e18a -> :sswitch_f
        -0x16a5dda5 -> :sswitch_9
        -0x43e5861 -> :sswitch_7
        -0x1c5705f -> :sswitch_8
        0xf84ffb4 -> :sswitch_0
        0x11689a71 -> :sswitch_7
        0x2247b8cb -> :sswitch_c
        0x239a15cb -> :sswitch_4
        0x26e16f9e -> :sswitch_d
        0x2dac1060 -> :sswitch_1
        0x2f4659ae -> :sswitch_11
        0x40b97a88 -> :sswitch_9
        0x55861fe2 -> :sswitch_6
        0x56d77534 -> :sswitch_10
        0x639ea709 -> :sswitch_4
        0x7a8340fb -> :sswitch_5
    .end sparse-switch
.end method

.method public final getLanguage()Ljava/lang/String;
    .locals 1

    .line 139
    invoke-static {}, Ll/ۚۛ֫;->ۤ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageCountry()Ljava/lang/String;
    .locals 1

    .line 149
    invoke-static {}, Ll/ۚۛ֫;->᩸()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageNameLocalString()Lbin/mt/plugin/api/LocalString;
    .locals 1

    .line 312
    invoke-static {}, Ll/ۚۛ֫;->ᩴ()Lbin/mt/plugin/api/LocalString;

    move-result-object v0

    return-object v0
.end method

.method public final getLocalString()Lbin/mt/plugin/api/LocalString;
    .locals 18
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

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

    const/4 v10, 0x0

    const v11, -0x4fc819b2

    sget v12, Ll/֨ۨ;->ۜܳ᩵:I

    sget v13, Ll/ۖᩳ;->᩹ۧܳ:I

    const-string v14, "\u1a7a\u06eb"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x31

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x462d

    const v16, 0x6827a7a5

    xor-int v15, v15, v16

    const v16, 0x3c2428f4

    :goto_0
    xor-int v14, v14, v16

    :goto_1
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, -0x6bfb

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    sget v14, Ll/᩶;->ᩴ᩶ۛ:I

    if-lez v14, :cond_1

    :cond_0
    move-object/from16 v14, p0

    move/from16 v17, v2

    move/from16 v16, v4

    goto/16 :goto_7

    :cond_1
    move-object/from16 v14, p0

    goto/16 :goto_4

    .line 273
    :sswitch_0
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v14

    if-nez v14, :cond_0

    :cond_2
    move-object/from16 v14, p0

    move/from16 v17, v2

    move/from16 v16, v4

    goto/16 :goto_a

    :sswitch_1
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget v14, Ll/۬;->᩸ۜ᩹:I

    if-eqz v14, :cond_2

    goto :goto_2

    :sswitch_2
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    :goto_2
    const-string v14, "\u06dc\u1a75"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x35

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x40e7

    const v16, 0x327aecb7

    xor-int v15, v15, v16

    const v16, 0x659bbaf0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    const/4 v0, 0x0

    return-object v0

    .line 0
    :sswitch_4
    invoke-static {v8, v9, v10, v7}, Ll/ۘܶ;->ۙᩳۜ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v14, p0

    .line 283
    invoke-virtual {v14, v0}, Ll/᩵᩺֫;->ۙ(Ljava/lang/String;)Ll/ܺ᩺֫;

    move-result-object v0

    return-object v0

    :sswitch_5
    move-object/from16 v14, p0

    .line 203
    sget v15, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v15, :cond_3

    move/from16 v17, v2

    move/from16 v16, v4

    const/4 v10, 0x6

    goto/16 :goto_a

    :cond_3
    const-string v15, "\u1a7b\u1a73"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    xor-int v10, v15, v13

    mul-int/lit16 v10, v10, -0x66d7

    const v17, -0x6d004917

    xor-int v10, v10, v17

    const v17, 0x52a93bf

    xor-int v15, v15, v17

    move v14, v15

    move v15, v10

    const/4 v10, 0x6

    goto/16 :goto_1

    :sswitch_6
    move-object/from16 v14, p0

    .line 0
    sget-object v8, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    sget v15, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v15, :cond_4

    const/16 v9, 0x3e

    goto/16 :goto_4

    :cond_4
    const-string v15, "\u1a79\u06e0"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    xor-int v9, v15, v12

    mul-int/lit16 v9, v9, -0x37b3

    const v17, 0x28447f6f

    xor-int v9, v9, v17

    const v17, 0x3b175ae1

    xor-int v15, v15, v17

    move v14, v15

    move v15, v9

    const/16 v9, 0x3e

    goto/16 :goto_1

    :sswitch_7
    move-object/from16 v14, p0

    const v7, 0xb48b

    goto :goto_3

    :sswitch_8
    move-object/from16 v14, p0

    const v7, 0xeede

    :goto_3
    const-string v15, "\u06eb\u1a7a"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move/from16 v16, v7

    xor-int v7, v15, v13

    mul-int/lit16 v7, v7, -0x2bcf

    const v17, 0x3bce3265

    xor-int v7, v7, v17

    const v17, -0x99fa510

    xor-int v15, v15, v17

    move v14, v15

    move v15, v7

    move/from16 v7, v16

    goto/16 :goto_1

    :sswitch_9
    move-object/from16 v14, p0

    mul-int v15, v6, v6

    sub-int/2addr v15, v4

    if-ltz v15, :cond_5

    const-string v15, "\u1a74\u06db"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move/from16 v16, v4

    xor-int v4, v15, v13

    mul-int/lit16 v4, v4, 0x795f

    const v17, 0x21a0429f

    xor-int v4, v4, v17

    const v17, -0x36a421e4    # -900577.75f

    xor-int v15, v15, v17

    move v14, v15

    move v15, v4

    goto/16 :goto_6

    :cond_5
    move/from16 v16, v4

    const-string v4, "\u06db\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v13, v4

    mul-int/lit8 v4, v4, -0x17

    xor-int v15, v4, v12

    mul-int/lit16 v15, v15, -0x4089

    const v17, -0x1da64b67

    xor-int v15, v15, v17

    const v17, -0x25547a2b

    goto/16 :goto_5

    :sswitch_a
    move-object/from16 v14, p0

    move/from16 v16, v4

    add-int v6, v2, v5

    .line 261
    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_6

    move/from16 v17, v2

    goto/16 :goto_7

    :cond_6
    const-string v4, "\u0736\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v12

    xor-int v15, v4, v13

    mul-int/lit16 v15, v15, -0x6081

    const v17, -0x4fc33492

    xor-int v15, v15, v17

    const v17, -0x3bfd486b

    goto :goto_5

    :sswitch_b
    move-object/from16 v14, p0

    mul-int v4, v2, v3

    const/16 v5, 0x2a2a

    sget v15, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v15, :cond_7

    :goto_4
    const-string v15, "\u06e2\u1a7b"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v12, v15

    mul-int/lit8 v15, v15, -0x15

    move/from16 v17, v2

    xor-int v2, v15, v13

    mul-int/lit16 v2, v2, -0x4895

    const v16, 0x52b8d55c

    xor-int v2, v2, v16

    const v16, -0x65fac628

    xor-int v15, v15, v16

    move v14, v15

    move v15, v2

    goto/16 :goto_c

    :cond_7
    move/from16 v17, v2

    const-string v2, "\u073d\u06ec"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v13

    mul-int/lit8 v2, v2, -0x3f

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, -0x4087

    const v16, 0xf2e2b0a

    xor-int v15, v15, v16

    const v16, -0xe72bd9b

    xor-int v2, v2, v16

    move v14, v2

    goto/16 :goto_c

    :sswitch_c
    move-object/from16 v14, p0

    move/from16 v16, v4

    aget-short v2, v0, v1

    const v3, 0xa8a8

    .line 39
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v4

    if-gtz v4, :cond_8

    goto/16 :goto_9

    :cond_8
    const-string v4, "\u073a\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v13

    mul-int/lit8 v4, v4, 0x2f

    xor-int v15, v4, v12

    mul-int/lit16 v15, v15, 0x2373

    const v17, 0x4b1c5b45    # 1.0246981E7f

    xor-int v15, v15, v17

    const v17, 0x5ebe7e8b

    :goto_5
    xor-int v4, v4, v17

    move v14, v4

    :goto_6
    move/from16 v4, v16

    goto/16 :goto_1

    :sswitch_d
    move-object/from16 v14, p0

    move/from16 v17, v2

    move/from16 v16, v4

    const/16 v1, 0x3d

    .line 183
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v2

    if-ltz v2, :cond_9

    goto :goto_7

    :cond_9
    const-string v2, "\u073a\u06e7"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v4, v2, v13

    mul-int/lit16 v4, v4, 0x426f

    const v15, -0x5eeb5b23

    xor-int/2addr v15, v4

    const v4, -0x59d63183

    goto/16 :goto_b

    :sswitch_e
    move-object/from16 v14, p0

    move/from16 v17, v2

    move/from16 v16, v4

    .line 48
    sget v2, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v2, :cond_a

    :goto_7
    const-string v2, "\u073d\u073d"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v4, v2, v13

    mul-int/lit16 v4, v4, 0x6f5b

    const v15, -0x2c5638c3

    xor-int/2addr v15, v4

    const v4, -0x52da087b

    goto/16 :goto_b

    :cond_a
    const-string v2, "\u1a7b\u1a74"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v12, v2

    mul-int/lit8 v2, v2, 0x3d

    xor-int v4, v2, v13

    mul-int/lit16 v4, v4, 0x5a8f

    const v15, 0xca9e0e5

    xor-int/2addr v15, v4

    const v4, 0x4eefca2b

    goto/16 :goto_b

    :sswitch_f
    move-object/from16 v14, p0

    move/from16 v17, v2

    move/from16 v16, v4

    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v2, :cond_b

    :goto_8
    move/from16 v2, v17

    goto :goto_9

    :cond_b
    const-string v2, "\u1a7a\u1a74"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v13

    mul-int/lit8 v2, v2, -0x57

    xor-int v4, v2, v12

    mul-int/lit16 v4, v4, 0x1977

    const v15, -0x279fa6c3

    xor-int/2addr v15, v4

    const v4, -0x5ce0d6b2

    goto :goto_b

    :sswitch_10
    move-object/from16 v14, p0

    move/from16 v17, v2

    move/from16 v16, v4

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v2

    if-ltz v2, :cond_c

    goto :goto_8

    :goto_9
    const-string v4, "\u05a8\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v13

    xor-int v15, v4, v12

    mul-int/lit16 v15, v15, -0x5801

    const v17, -0x1b841a26

    xor-int v15, v15, v17

    const v17, 0x9d385db

    goto/16 :goto_5

    :cond_c
    const-string v2, "\u0733\u073a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    mul-int/lit8 v2, v2, -0x5

    xor-int v4, v2, v13

    mul-int/lit16 v4, v4, 0x28ff

    const v15, 0x7044d096

    xor-int/2addr v15, v4

    const v4, 0x6febcb97

    goto :goto_b

    :sswitch_11
    move-object/from16 v14, p0

    move/from16 v17, v2

    move/from16 v16, v4

    sget-object v0, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    .line 269
    sget v2, Ll/ۧ;->ۨۗܰ:I

    if-ltz v2, :cond_d

    :goto_a
    const-string v2, "\u1a79\u06d9"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v4, v2, v12

    mul-int/lit16 v4, v4, -0x7af1

    const v15, -0x3d810bde

    xor-int/2addr v15, v4

    const v4, 0x1876b2f0

    goto :goto_b

    :cond_d
    const-string v2, "\u0730\u1a7a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x6b

    xor-int v4, v2, v12

    mul-int/lit16 v4, v4, 0x3b39

    const v15, -0x272aabbd

    xor-int/2addr v15, v4

    const v4, -0x26d472cb

    :goto_b
    xor-int/2addr v2, v4

    move v14, v2

    move/from16 v4, v16

    :goto_c
    move/from16 v2, v17

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72d1e8c6 -> :sswitch_a
        -0x6dbf5ee4 -> :sswitch_b
        -0x6bb9a05d -> :sswitch_3
        -0x68c49dc5 -> :sswitch_11
        -0x644cf9b4 -> :sswitch_2
        -0x59a06229 -> :sswitch_9
        -0x50339f2c -> :sswitch_e
        -0x4aaf7d1b -> :sswitch_4
        -0x4184d1e2 -> :sswitch_c
        -0x2ff3556f -> :sswitch_b
        -0x1d8b5270 -> :sswitch_f
        -0x11ae832b -> :sswitch_6
        -0xbd3023b -> :sswitch_a
        -0x5777695 -> :sswitch_10
        -0x4b6a049 -> :sswitch_11
        0x196c4a2 -> :sswitch_7
        0xb9e7c36 -> :sswitch_0
        0xfb4716d -> :sswitch_3
        0x16507692 -> :sswitch_c
        0x1c1bcf7b -> :sswitch_0
        0x1c2c8f54 -> :sswitch_10
        0x1d5c4e27 -> :sswitch_1
        0x311aba48 -> :sswitch_5
        0x317b4eb0 -> :sswitch_d
        0x3726e62f -> :sswitch_f
        0x38f2f641 -> :sswitch_e
        0x3adfe4b5 -> :sswitch_7
        0x3fbee016 -> :sswitch_4
        0x42ceb46e -> :sswitch_d
        0x458c539c -> :sswitch_1
        0x4619f41d -> :sswitch_6
        0x573c3ca0 -> :sswitch_2
        0x6a9d57cd -> :sswitch_8
        0x745dd4b6 -> :sswitch_5
        0x747b1397 -> :sswitch_9
        0x7921baf9 -> :sswitch_8
    .end sparse-switch
.end method

.method public final getPluginId()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/᩵᩺֫;->۫:Ljava/lang/String;

    return-object v0
.end method

.method public final getPluginName()Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x1e330c0b

    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v5, "\u0730\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x4d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2129

    const v7, 0x1cfd3209

    xor-int/2addr v6, v7

    const v7, -0x606279a2

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x3001

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 172
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v5

    if-eqz v5, :cond_b

    goto/16 :goto_4

    .line 7
    :sswitch_0
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v5, Ll/ۖ;->ܿۚ֡:I

    if-gez v5, :cond_7

    goto :goto_1

    :sswitch_1
    sget v5, Ll/ۖ;->ܿۚ֡:I

    if-ltz v5, :cond_c

    goto/16 :goto_2

    .line 81
    :sswitch_2
    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v5, "\u06e1\u06d6"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7595

    const v7, 0x60e1f181

    xor-int/2addr v6, v7

    const v7, -0x41621537

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    return-object v1

    .line 183
    :sswitch_6
    invoke-static {p0, v0}, Ll/ۖ;->ۤ᩸۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v5, "\u06e7\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x61

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7c7b

    const v7, -0x218da2f4

    xor-int/2addr v6, v7

    const v7, 0x206b4168

    goto :goto_0

    :sswitch_7
    const/4 v5, 0x1

    .line 0
    invoke-static {v5, v0}, Ll/֨ۨ;->ۖ᩵֡(ILjava/lang/Object;)C

    move-result v5

    const/16 v6, 0x7d

    if-ne v5, v6, :cond_1

    const-string v5, "\u1a79\u1a7a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0xb

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x19ab

    const v7, -0x25b8e1a3

    xor-int/2addr v6, v7

    const v7, 0x7d7d9299

    goto/16 :goto_0

    :sswitch_8
    const/4 v5, 0x0

    .line 182
    invoke-static {v0, v5}, Ll/ۘܽ;->᩷۬ܽ(Ljava/lang/Object;I)C

    move-result v5

    const/16 v6, 0x7b

    if-ne v5, v6, :cond_1

    const-string v5, "\u1a73\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x43

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6dd9

    const v7, -0x45a6bffd

    xor-int/2addr v6, v7

    const v7, 0x2407ebfe

    goto/16 :goto_0

    :sswitch_9
    return-object v0

    :sswitch_a
    invoke-static {v0}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v5

    const/4 v6, 0x3

    if-lt v5, v6, :cond_1

    const-string v5, "\u1a78\u06dc"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1f11

    const v7, 0x58c74719

    xor-int/2addr v6, v7

    const v7, -0x1318b0ec

    goto/16 :goto_0

    :cond_1
    const-string v5, "\u05a8\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6d05

    const v7, 0x17fb4d57

    xor-int/2addr v6, v7

    const v7, 0x6ccea3b2

    goto/16 :goto_0

    .line 115
    :sswitch_b
    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v5, :cond_2

    const-string v5, "\u073f\u06e8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4849

    const v7, 0x7231a023

    xor-int/2addr v6, v7

    const v7, -0x43589114

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u06db\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x2b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x18c1

    const v7, -0xb62ace4

    xor-int/2addr v6, v7

    const v7, -0x29f37519

    goto/16 :goto_0

    .line 72
    :sswitch_c
    sget v5, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v5, :cond_3

    :goto_2
    const-string v5, "\u0733\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0xf

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7b2f

    const v7, -0x6c263529

    xor-int/2addr v6, v7

    const v7, -0x6ed39ded

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06e8\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x3b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1459

    const v7, -0x2474688d

    xor-int/2addr v6, v7

    const v7, 0x16c66dd4

    goto/16 :goto_0

    .line 22
    :sswitch_d
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    const-string v5, "\u06d7\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x17ab

    const v7, -0x3c243afa

    xor-int/2addr v6, v7

    const v7, 0x4c004740    # 3.362739E7f

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v5, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v5, "\u1a7a\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xdf3

    const v7, 0x584c4770

    xor-int/2addr v6, v7

    const v7, -0x27c3feb9

    goto/16 :goto_0

    .line 145
    :sswitch_f
    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u06d6\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6d13

    const v7, 0x55d697ba

    xor-int/2addr v6, v7

    const v7, -0xf32a738

    goto/16 :goto_0

    .line 123
    :sswitch_10
    sget v5, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v5, :cond_8

    :cond_7
    :goto_3
    const-string v5, "\u073f\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4f01

    const v7, -0xcfab9f5

    xor-int/2addr v6, v7

    const v7, 0x7048a6d1

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06eb\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5b3f

    const v7, -0x1509d236

    xor-int/2addr v6, v7

    const v7, 0x5a08ab0

    goto/16 :goto_0

    .line 174
    :sswitch_11
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v5

    if-gtz v5, :cond_9

    goto :goto_4

    :cond_9
    const-string v5, "\u06d8\u06dc"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1135

    const v7, -0x76c31a04

    xor-int/2addr v6, v7

    const v7, 0xd5d36c0

    goto/16 :goto_0

    .line 35
    :sswitch_12
    sget v5, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v5, :cond_a

    goto :goto_4

    :cond_a
    const-string v5, "\u06e7\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x3d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6279

    const v7, 0x1c2bdeb6

    xor-int/2addr v6, v7

    const v7, 0x3286d927

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u073f\u06dc"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4d9b

    const v7, 0x1db258be

    xor-int/2addr v6, v7

    const v7, -0x4eb27fed

    goto/16 :goto_0

    .line 182
    :sswitch_13
    iget-object v0, p0, Ll/᩵᩺֫;->ۚ:Ljava/lang/String;

    sget v5, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_4
    const-string v5, "\u05a8\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7d8b

    const v7, 0x2766725d

    xor-int/2addr v6, v7

    const v7, 0x452884de

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u05a8\u06e7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x2d

    xor-int v6, v5, v4

    mul-int/lit8 v6, v6, -0x77

    const v7, -0x4ad61c57

    xor-int/2addr v6, v7

    const v7, -0x5d76a06d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f918844 -> :sswitch_3
        -0x731147da -> :sswitch_c
        -0x7041d9f2 -> :sswitch_12
        -0x6b1393b5 -> :sswitch_b
        -0x6a99785c -> :sswitch_f
        -0x68d39a5d -> :sswitch_6
        -0x65a95d25 -> :sswitch_2
        -0x5c66d481 -> :sswitch_a
        -0x3ef151a0 -> :sswitch_9
        -0x36cd05d4 -> :sswitch_6
        -0x33d6721b -> :sswitch_1
        -0x31c13d71 -> :sswitch_e
        -0x2ddc8205 -> :sswitch_10
        -0x252138c3 -> :sswitch_f
        -0x23a4a72f -> :sswitch_13
        -0x238711bd -> :sswitch_8
        -0x1c0ccd2c -> :sswitch_5
        -0x19586a7d -> :sswitch_0
        -0x19338422 -> :sswitch_d
        -0x16868673 -> :sswitch_7
        0x1970dce0 -> :sswitch_c
        0x1deceac0 -> :sswitch_d
        0x211f373e -> :sswitch_4
        0x2aa2a29b -> :sswitch_a
        0x32c46f71 -> :sswitch_11
        0x339ae44f -> :sswitch_8
        0x3e73a451 -> :sswitch_2
        0x42a0db98 -> :sswitch_b
        0x4ebb1cad -> :sswitch_1
        0x51048bdd -> :sswitch_e
        0x523d2b1c -> :sswitch_9
        0x54fcb7d0 -> :sswitch_10
        0x5934e953 -> :sswitch_13
        0x5940ac18 -> :sswitch_7
        0x5b321798 -> :sswitch_11
        0x5ea4082f -> :sswitch_3
        0x63d9195a -> :sswitch_0
        0x643b81da -> :sswitch_12
        0x70dccaf0 -> :sswitch_5
        0x7e3029a7 -> :sswitch_4
    .end sparse-switch
.end method

.method public final getPluginSdkVersion()I
    .locals 1

    .line 97
    iget v0, p0, Ll/᩵᩺֫;->ܽ:I

    return v0
.end method

.method public final getPluginVersionCode()I
    .locals 1

    .line 102
    iget v0, p0, Ll/᩵᩺֫;->᩹:I

    return v0
.end method

.method public final getPluginVersionName()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Ll/᩵᩺֫;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreferences()Landroid/content/SharedPreferences;
    .locals 2

    .line 127
    iget-object v0, p0, Ll/᩵᩺֫;->ܶ:Landroid/content/SharedPreferences;

    if-nez v0, :cond_1

    move-object v0, p0

    .line 128
    monitor-enter v0

    .line 129
    :try_start_0
    iget-object v1, p0, Ll/᩵᩺֫;->ܶ:Landroid/content/SharedPreferences;

    if-nez v1, :cond_0

    .line 130
    iget-object v1, p0, Ll/᩵᩺֫;->ܺ:Ll/ۤܿۛ;

    iget-object v1, v1, Ll/ۤܿۛ;->ܰ:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 168
    invoke-static {v1}, Ll/᩹ۨ֫;->ᩴ(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 130
    iput-object v1, p0, Ll/᩵᩺֫;->ܶ:Landroid/content/SharedPreferences;

    .line 132
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 134
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩵᩺֫;->ܶ:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public final getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 17

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, -0x1df44746

    sget v10, Ll/ۖۖ;->᩵ۜ֨:I

    sget v11, Ll/֡۟;->᩶᩺ܰ:I

    const-string v12, "\u06e2\u073f"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x1fc1

    const v14, 0x6976bf5e

    xor-int/2addr v13, v14

    const v14, 0x33621bfa    # 5.264517E-8f

    :goto_0
    xor-int/2addr v12, v14

    :goto_1
    xor-int/2addr v9, v11

    mul-int/lit16 v9, v9, -0x14db

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    return-object v0

    .line 17
    :sswitch_0
    sget v12, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v12, :cond_1

    :cond_0
    move-object/from16 v13, p1

    goto/16 :goto_8

    :cond_1
    :goto_2
    move-object/from16 v13, p1

    goto/16 :goto_6

    .line 224
    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget v12, Ll/ۘ۟;->ۜ᩺᩺:I

    if-nez v12, :cond_2

    goto :goto_3

    :cond_2
    move-object/from16 v13, p1

    goto/16 :goto_7

    .line 206
    :sswitch_2
    sget v12, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-gez v12, :cond_0

    goto :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    goto :goto_3

    :sswitch_4
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    const/4 v0, 0x0

    return-object v0

    .line 230
    :sswitch_5
    new-instance v12, Ljava/lang/IllegalArgumentException;

    sget-object v13, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    .line 52
    sget v14, Ll/֫֡;->֫ۙۖ:I

    if-gtz v14, :cond_3

    goto :goto_3

    :cond_3
    const/16 v14, 0x45

    .line 116
    sget v15, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v15, :cond_4

    :goto_3
    const-string v12, "\u0736\u06eb"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, -0xb

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x2a3

    const v14, 0x55c011f6

    xor-int/2addr v13, v14

    const v14, -0x171c7671

    goto :goto_0

    :cond_4
    const/16 v15, 0x12

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v16

    if-nez v16, :cond_5

    goto :goto_2

    .line 230
    :cond_5
    invoke-static {v13, v14, v15, v8}, Ll/ۖ;->᩺ۢ۠([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v13, p1

    invoke-static {v0, v13}, Ll/ۘܽ;->ۤ᩹ۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v12, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v12

    :sswitch_6
    move-object/from16 v13, p1

    .line 228
    invoke-static/range {p0 .. p1}, Ll/ۖ;->ۤ᩸۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v12, "\u06e4\u06eb"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x114f

    const v15, 0x3c88eecf

    xor-int/2addr v14, v15

    const v15, -0x7f1e84ec

    goto/16 :goto_9

    :cond_6
    const-string v12, "\u1a73\u05ab"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, -0x3b

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x5573

    const v15, -0x723e4db6

    xor-int/2addr v14, v15

    const v15, 0xddde97b

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v13, p1

    const v8, 0xae3e

    goto :goto_4

    :sswitch_8
    move-object/from16 v13, p1

    const v8, 0xec16

    :goto_4
    const-string v12, "\u06d7\u06db"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x3b3

    const v15, -0x4dd13847

    xor-int/2addr v14, v15

    const v15, -0x18f95a22

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v13, p1

    mul-int v12, v7, v7

    sub-int v12, v5, v12

    if-lez v12, :cond_7

    const-string v12, "\u1a74\u1a78"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x48b5

    const v15, 0x69d327a3

    xor-int/2addr v14, v15

    const v15, 0x12c289ab

    goto/16 :goto_9

    :cond_7
    const-string v12, "\u06eb\u1a79"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x1823

    const v15, 0x281fdabb

    xor-int/2addr v14, v15

    const v15, -0x3737f9b5

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v13, p1

    add-int v7, v3, v6

    sget v12, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v12, :cond_8

    goto :goto_5

    :cond_8
    const-string v12, "\u06da\u1a74"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x4adf

    const v15, -0x741d7fe6

    xor-int/2addr v14, v15

    const v15, -0x140c4b85

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v13, p1

    mul-int v5, v3, v4

    const/16 v6, 0x4469

    .line 179
    sget v12, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v12, :cond_9

    goto :goto_5

    :cond_9
    const-string v12, "\u06ec\u06e7"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, 0x13

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x4db5

    const v15, 0x1842bf29

    xor-int/2addr v14, v15

    const v15, 0x503787c4

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v13, p1

    aget-short v3, v1, v2

    const v4, 0x111a4

    .line 128
    sget v12, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v12, :cond_a

    :goto_5
    const-string v12, "\u073a\u1a78"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x6ceb

    const v15, -0x66cb8a6b

    xor-int/2addr v14, v15

    const v15, -0x3e3d2ccd

    goto/16 :goto_9

    :cond_a
    const-string v12, "\u06db\u1a75"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x33f1

    const v15, -0x699af48f

    xor-int/2addr v14, v15

    const v15, 0x2427ec2e

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v13, p1

    const/16 v2, 0x44

    .line 5
    sget v12, Ll/᩺;->۫۬۫:I

    if-gtz v12, :cond_b

    goto :goto_7

    :cond_b
    const-string v12, "\u06dc\u073a"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, -0x3

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x5cd9

    const v15, 0x2ed60330

    xor-int/2addr v14, v15

    const v15, -0xac3c709

    goto/16 :goto_9

    :sswitch_e
    move-object/from16 v13, p1

    sget-object v1, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    .line 168
    sget v12, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v12, :cond_c

    :goto_6
    const-string v12, "\u0733\u073a"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x7e3d

    const v15, 0x1b08c760

    xor-int/2addr v14, v15

    const v15, 0x5dbb6369

    goto/16 :goto_9

    :cond_c
    const-string v12, "\u0733\u073f"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x2aa7

    const v15, 0x6117b697

    xor-int/2addr v14, v15

    const v15, 0x52f3558f

    goto :goto_9

    :sswitch_f
    move-object/from16 v13, p1

    .line 49
    sget v12, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v12, :cond_d

    :goto_7
    const-string v12, "\u06db\u0733"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, 0x41

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x59c1

    const v15, 0x1c5f128c

    xor-int/2addr v14, v15

    const v15, -0x38e2ef1d

    goto :goto_9

    :cond_d
    const-string v12, "\u06df\u06e8"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, -0x3

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x7677

    const v15, 0x247109ea

    xor-int/2addr v14, v15

    const v15, 0x71933e17

    goto :goto_9

    :sswitch_10
    move-object/from16 v13, p1

    .line 60
    sget v12, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v12, :cond_e

    :goto_8
    const-string v12, "\u1a77\u06e1"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, -0xd

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x5aed

    const v15, 0x1b52a477

    xor-int/2addr v14, v15

    const v15, -0x440b427

    goto :goto_9

    :cond_e
    const-string v12, "\u1a73\u0736"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x21af

    const v15, -0x1d9ad29a

    xor-int/2addr v14, v15

    const v15, -0x79fc7b84

    :goto_9
    xor-int/2addr v12, v15

    move v13, v14

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x672a4dac -> :sswitch_7
        -0x5cfd3109 -> :sswitch_10
        -0x56b9d8c0 -> :sswitch_f
        -0x4b01f8ad -> :sswitch_5
        -0x441e4e1f -> :sswitch_c
        -0x3b4a3d42 -> :sswitch_9
        -0x35f61e50 -> :sswitch_2
        -0x3428b233 -> :sswitch_8
        -0x3163224e -> :sswitch_f
        -0x2581f904 -> :sswitch_0
        -0x1c58e190 -> :sswitch_c
        -0x18d83db5 -> :sswitch_a
        -0x117b4eae -> :sswitch_0
        -0x3a6dd9f -> :sswitch_b
        0x6ebe8ac -> :sswitch_5
        0xb619acb -> :sswitch_b
        0x12db1839 -> :sswitch_1
        0x13ffc051 -> :sswitch_9
        0x1d61ee7e -> :sswitch_d
        0x201fb23c -> :sswitch_6
        0x230af458 -> :sswitch_4
        0x296b8bb2 -> :sswitch_a
        0x3d875f30 -> :sswitch_7
        0x3f71491c -> :sswitch_e
        0x58a8ff35 -> :sswitch_8
        0x622b02f6 -> :sswitch_3
        0x6c9ab052 -> :sswitch_3
        0x6f37b33b -> :sswitch_2
        0x72de1aba -> :sswitch_e
        0x72fd1d11 -> :sswitch_1
        0x72ffc406 -> :sswitch_4
        0x7541393b -> :sswitch_10
        0x776676aa -> :sswitch_6
        0x7db52bfc -> :sswitch_d
    .end sparse-switch
.end method

.method public final varargs getString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    const v0, -0x1eaaaabb

    sget v1, Ll/֡᩻;->᩷ۧ᩺:I

    sget v2, Ll/ۧ;->ۨۗܰ:I

    const-string v3, "\u06e7\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x14f3

    const v5, 0x5db87c7c

    xor-int/2addr v4, v5

    const v5, -0x24525182

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x1527

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    goto :goto_1

    .line 16
    :sswitch_0
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_8

    goto :goto_1

    .line 139
    :sswitch_2
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-gez v3, :cond_6

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    const/4 p1, 0x0

    return-object p1

    .line 238
    :sswitch_4
    invoke-virtual {p0, p1}, Ll/᩵᩺֫;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Ll/᩵᩺֫;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 152
    :sswitch_5
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06e2\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x53b7

    const v5, 0x17100cbc

    xor-int/2addr v4, v5

    const v5, 0x1d1a21fc

    goto :goto_0

    .line 151
    :sswitch_6
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u0730\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x71b5

    const v5, 0x6d33833b

    xor-int/2addr v4, v5

    const v5, 0x9587efa

    goto :goto_0

    .line 182
    :sswitch_7
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v3

    if-nez v3, :cond_2

    :goto_1
    const-string v3, "\u1a7a\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2027

    const v5, -0x11ab331

    xor-int/2addr v4, v5

    const v5, 0x39dc405f

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06eb\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x25ed

    const v5, 0x77a09e8

    xor-int/2addr v4, v5

    const v5, -0x4a18cd14

    goto/16 :goto_0

    .line 196
    :sswitch_8
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u1a7a\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7555

    const v5, 0x40d6045b

    xor-int/2addr v4, v5

    const v5, 0x60138bfd

    goto/16 :goto_0

    .line 120
    :sswitch_9
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u06e0\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x685b

    const v5, -0x6dde4bcf

    xor-int/2addr v4, v5

    const v5, 0x48f77d78    # 506859.75f

    goto/16 :goto_0

    .line 57
    :sswitch_a
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_5

    :goto_2
    const-string v3, "\u1a7b\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5dd1

    const v5, 0x325391cc

    xor-int/2addr v4, v5

    const v5, -0x3527c61a    # -7085299.0f

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06d7\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x807

    const v5, -0x2c5d2560

    xor-int/2addr v4, v5

    const v5, 0x2248a0f9

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_7

    :cond_6
    :goto_3
    const-string v3, "\u06d7\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2147

    const v5, 0x5e8ddf8a

    xor-int/2addr v4, v5

    const v5, 0x5c2827b7

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a78\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x42c9

    const v5, -0x5aff66c9

    xor-int/2addr v4, v5

    const v5, 0x3addd7ce

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_4
    const-string v3, "\u1a76\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x122f

    const v5, -0x3c6155be

    xor-int/2addr v4, v5

    const v5, -0x38d3a675

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u073d\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7147

    const v5, 0x3f41d18e

    xor-int/2addr v4, v5

    const v5, -0xc00c4a

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u1a78\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2305

    const v5, 0x831d33a

    xor-int/2addr v4, v5

    const v5, 0x215134d8

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06e0\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x24af

    const v5, 0x1c80c11e

    xor-int/2addr v4, v5

    const v5, 0x686ebbd7

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a7a\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x339

    const v5, 0x24016b61

    xor-int/2addr v4, v5

    const v5, -0x410c8ed

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7070b193 -> :sswitch_0
        -0x6f466f5b -> :sswitch_2
        -0x69ac14b3 -> :sswitch_8
        -0x650c88f0 -> :sswitch_9
        -0x594334b4 -> :sswitch_4
        -0x55d868ed -> :sswitch_5
        -0x533098ca -> :sswitch_6
        -0x41357b65 -> :sswitch_9
        -0x40192ba3 -> :sswitch_d
        -0x328ce618 -> :sswitch_5
        -0x2f12e073 -> :sswitch_e
        -0x1f6a06d0 -> :sswitch_1
        -0x185894bf -> :sswitch_3
        -0x184ba6bf -> :sswitch_b
        -0xa227376 -> :sswitch_e
        -0x6ea1396 -> :sswitch_0
        -0x573ac81 -> :sswitch_1
        -0x169ed0d -> :sswitch_2
        0xdab311b -> :sswitch_a
        0x128ec8fe -> :sswitch_7
        0x1824876f -> :sswitch_3
        0x1bc1b856 -> :sswitch_c
        0x250bd154 -> :sswitch_c
        0x2d906e08 -> :sswitch_8
        0x2dfd9731 -> :sswitch_d
        0x4840940b -> :sswitch_a
        0x58732357 -> :sswitch_6
        0x650f3cb8 -> :sswitch_7
        0x6ddd27d9 -> :sswitch_b
        0x6f8485c4 -> :sswitch_4
    .end sparse-switch
.end method

.method public final varargs getStringArray([Ljava/lang/String;)[Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x41b15921

    sget v3, Ll/֫֨;->᩶ܺۡ:I

    sget v4, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v5, "\u06e2\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5e51

    const v7, -0x18d42f04

    xor-int/2addr v6, v7

    const v7, 0x35fea7dc

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x6471

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 153
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    goto/16 :goto_5

    .line 222
    :sswitch_0
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v5, :cond_a

    goto/16 :goto_5

    .line 143
    :sswitch_1
    sget v5, Ll/֨ۢ;->۬ܿܺ:I

    if-gez v5, :cond_6

    goto/16 :goto_2

    .line 80
    :sswitch_2
    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v5, :cond_3

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    const/4 p1, 0x0

    return-object p1

    :sswitch_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 251
    :sswitch_5
    aput-object v1, p1, v0

    .line 241
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v5, "\u06dc\u06e8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x69

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6253

    const v7, 0x33837b26

    xor-int/2addr v6, v7

    const v7, 0x1cd4b408

    goto :goto_0

    .line 251
    :sswitch_6
    aget-object v1, p1, v0

    invoke-virtual {p0, v1}, Ll/᩵᩺֫;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 183
    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u06e0\u06eb"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7819

    const v7, -0x3bea7195

    xor-int/2addr v6, v7

    const v7, -0xe5c4c41

    goto :goto_0

    :sswitch_7
    return-object p1

    .line 250
    :sswitch_8
    array-length v5, p1

    if-ge v0, v5, :cond_2

    const-string v5, "\u1a7b\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x21

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4a0b

    const v7, 0x1b258490

    xor-int/2addr v6, v7

    const v7, -0x13a1426

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u06e1\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xf53

    const v7, 0xdb004a4

    xor-int/2addr v6, v7

    const v7, -0x5e2d523b

    goto/16 :goto_0

    :sswitch_9
    const/4 v0, 0x0

    :goto_1
    const-string v5, "\u05a8\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5a9f

    const v7, 0x385c0fa

    xor-int/2addr v6, v7

    const v7, -0x2c0a4366

    goto/16 :goto_0

    .line 69
    :sswitch_a
    sget v5, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v5, :cond_4

    :cond_3
    :goto_2
    const-string v5, "\u073f\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5601

    const v7, -0x32e43d0a    # -1.6332784E8f

    xor-int/2addr v6, v7

    const v7, -0x47ef61fc

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06d6\u06eb"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x263f

    const v7, -0x2534a8b6

    xor-int/2addr v6, v7

    const v7, 0x35119c7e

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u06e1\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x63

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x52df

    const v7, -0x6806c88b

    xor-int/2addr v6, v7

    const v7, 0xa204c90

    goto/16 :goto_0

    .line 149
    :sswitch_c
    sget-boolean v5, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v5, :cond_7

    :cond_6
    :goto_3
    const-string v5, "\u1a78\u06db"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x58b1

    const v7, 0x57ae0aae

    xor-int/2addr v6, v7

    const v7, 0x6a6bba76

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06db\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7b37

    const v7, 0x7e6e59b

    xor-int/2addr v6, v7

    const v7, 0x5bcba4fd

    goto/16 :goto_0

    .line 136
    :sswitch_d
    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v5, :cond_8

    goto :goto_4

    :cond_8
    const-string v5, "\u06da\u1a77"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x71af

    const v7, 0x4aab68b3    # 5616729.5f

    xor-int/2addr v6, v7

    const v7, 0x7996380a    # 9.749764E34f

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_9

    :goto_4
    const-string v5, "\u05a8\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x29

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5d5b

    const v7, -0xcd1d315

    xor-int/2addr v6, v7

    const v7, 0x2243e52

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u073f\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1ab

    const v7, -0x5a31b6d2

    xor-int/2addr v6, v7

    const v7, 0x6ca4fdc5

    goto/16 :goto_0

    .line 244
    :sswitch_f
    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_b

    :cond_a
    const-string v5, "\u1a7a\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x59

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6e27

    const v7, -0x4bc0e7c1

    xor-int/2addr v6, v7

    const v7, 0x383cc8c4

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06d6\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x1b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3533

    const v7, -0x3d17db0b

    xor-int/2addr v6, v7

    const v7, -0x2e0ec384

    goto/16 :goto_0

    .line 61
    :sswitch_10
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v5

    if-nez v5, :cond_c

    goto :goto_5

    :cond_c
    const-string v5, "\u1a74\u1a7a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3c43

    const v7, 0x3e7b4a63

    xor-int/2addr v6, v7

    const v7, 0x29bff465

    goto/16 :goto_0

    .line 122
    :sswitch_11
    sget v5, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v5, :cond_d

    :goto_5
    const-string v5, "\u06e0\u0736"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2e5d

    const v7, 0x632fb82d

    xor-int/2addr v6, v7

    const v7, -0x6b90a787

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u05a1\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x52e7

    const v7, 0x3a0f416    # 9.459994E-37f

    xor-int/2addr v6, v7

    const v7, -0x34371136    # -2.633666E7f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a6f3ff7 -> :sswitch_7
        -0x7078a99c -> :sswitch_7
        -0x6338b7a8 -> :sswitch_a
        -0x5df81345 -> :sswitch_2
        -0x5a6d12ca -> :sswitch_1
        -0x5917b918 -> :sswitch_c
        -0x57e14bcf -> :sswitch_5
        -0x557606f6 -> :sswitch_d
        -0x4cab1ec7 -> :sswitch_9
        -0x4c25758d -> :sswitch_d
        -0x4ae9eed6 -> :sswitch_2
        -0x49a4569d -> :sswitch_4
        -0x35bbc2ce -> :sswitch_1
        -0x33ef62e9 -> :sswitch_6
        -0x33660aad -> :sswitch_8
        -0x3109767d -> :sswitch_3
        -0x3011f9e3 -> :sswitch_6
        -0x2aa18b0e -> :sswitch_e
        -0x1590296c -> :sswitch_9
        -0x157f27c9 -> :sswitch_11
        -0x11079a64 -> :sswitch_3
        0xc8b9a9d -> :sswitch_8
        0x14b6b606 -> :sswitch_10
        0x215c9e22 -> :sswitch_b
        0x26bb1718 -> :sswitch_0
        0x2ae449a6 -> :sswitch_f
        0x2eddff8b -> :sswitch_5
        0x3308d259 -> :sswitch_b
        0x36fc2852 -> :sswitch_0
        0x3feadd68 -> :sswitch_e
        0x401d1b31 -> :sswitch_f
        0x45419e04 -> :sswitch_a
        0x4aa46113 -> :sswitch_11
        0x66458704 -> :sswitch_c
        0x72c387bd -> :sswitch_4
        0x7bb8b277 -> :sswitch_10
    .end sparse-switch
.end method

.method public final varargs getStringList([Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 244
    invoke-virtual {p0, p1}, Ll/᩵᩺֫;->getStringArray([Ljava/lang/String;)[Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getStringNullable(Ljava/lang/String;)Ljava/lang/String;
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

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

    const v24, -0x1aa18541

    sget v25, Ll/ۖ֨;->֨ۨۧ:I

    sget v26, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v27, "\u06e7\u1a73"

    invoke-static/range {v27 .. v27}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v27

    xor-int v27, v27, v25

    mul-int/lit8 v27, v27, -0x1f

    xor-int v2, v27, v26

    mul-int/lit16 v2, v2, -0x70fb

    const v29, -0x6afa3d72

    xor-int v2, v2, v29

    const v29, -0x34dacf91    # -1.0825839E7f

    xor-int v27, v27, v29

    move-object v5, v4

    move-object/from16 v29, v9

    move-object/from16 v15, v21

    move/from16 v28, v27

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const v27, -0x1aa18541

    move-object v9, v8

    move-object/from16 v21, v13

    move-object v8, v7

    move-object v13, v12

    move-object v7, v6

    move-object v12, v11

    const/4 v6, 0x0

    move-object v11, v10

    :goto_0
    xor-int v10, v27, v26

    mul-int/lit16 v10, v10, 0x1449

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v2, v10

    xor-int v27, v28, v2

    sparse-switch v27, :sswitch_data_0

    move/from16 v30, v3

    move/from16 v10, v24

    .line 204
    invoke-static/range {p1 .. p1}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v0

    const/4 v2, 0x3

    const/16 v23, 0x0

    const/4 v4, 0x1

    if-lt v0, v2, :cond_13

    const-string v0, "\u06e2\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v2, v0, v25

    mul-int/lit16 v2, v2, 0x9f1

    const v3, 0x6762460a

    xor-int/2addr v2, v3

    const v3, -0xe730e3a    # -1.395846E30f

    goto/16 :goto_f

    .line 210
    :sswitch_0
    sget v2, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v2, :cond_0

    :goto_1
    move/from16 v2, v23

    move/from16 v10, v24

    goto/16 :goto_a

    :cond_0
    const-string v2, "\u06d9\u0730"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v26, v2

    mul-int/lit8 v2, v2, -0x75

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, 0x547f

    const v28, -0x513a48b7

    xor-int v10, v10, v28

    const v28, -0x451d9cf7

    goto/16 :goto_9

    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget-boolean v2, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v2, :cond_2

    :cond_1
    :goto_2
    move/from16 v30, v3

    move/from16 v2, v23

    move/from16 v10, v24

    goto/16 :goto_11

    :cond_2
    const-string v2, "\u0733\u06d9"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v25

    mul-int/lit8 v2, v2, -0x29

    xor-int v10, v2, v26

    mul-int/lit16 v10, v10, 0x5c19

    const v28, -0x36ad3e0e

    xor-int v10, v10, v28

    const v28, -0x74312d8d

    goto/16 :goto_9

    :sswitch_2
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v2

    if-gtz v2, :cond_3

    goto :goto_2

    :cond_3
    move/from16 v30, v3

    move/from16 v2, v23

    move/from16 v10, v24

    goto/16 :goto_12

    .line 296
    :sswitch_3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget-boolean v2, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v2, :cond_4

    goto/16 :goto_7

    :cond_4
    move/from16 v30, v3

    move-object/from16 v28, v8

    goto/16 :goto_5

    .line 29
    :sswitch_4
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    sget v2, Ll/ۘ۟;->ۜ᩺᩺:I

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    const-string v2, "\u1a74\u06e4"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v25

    mul-int/lit8 v2, v2, -0x7d

    xor-int v10, v2, v26

    mul-int/lit16 v10, v10, 0x7da7

    const v28, -0x5c874db9

    xor-int v10, v10, v28

    const v28, -0x73cad612

    goto/16 :goto_9

    :sswitch_5
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget v2, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v2, :cond_b

    goto/16 :goto_1

    .line 294
    :sswitch_6
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v2, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v2, :cond_1

    goto/16 :goto_1

    .line 259
    :sswitch_7
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto/16 :goto_1

    .line 140
    :sswitch_8
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    const/4 v1, 0x0

    return-object v1

    .line 46
    :sswitch_9
    new-instance v2, Ll/ܺ᩺֫;

    sget-object v10, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    move-object/from16 v28, v8

    .line 9
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v30

    if-gtz v30, :cond_6

    move/from16 v30, v3

    goto/16 :goto_5

    :cond_6
    const/4 v8, 0x7

    sget v31, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v31, :cond_7

    move/from16 v30, v3

    move/from16 v2, v23

    move/from16 v10, v24

    move-object/from16 v8, v28

    goto/16 :goto_12

    :cond_7
    move/from16 v30, v3

    const/16 v3, 0x5c

    .line 46
    invoke-static {v10, v3, v8, v14}, Ll/֨ᩳ;->ۘ᩸֨([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ll/ܺ᩺֫;-><init>(Ljava/lang/String;)V

    sput-object v2, Ll/ۚۛ֫;->᩷:Ll/ܺ᩺֫;

    goto :goto_3

    .line 48
    :sswitch_a
    sget-object v1, Ll/ۚۛ֫;->᩷:Ll/ܺ᩺֫;

    .line 212
    invoke-virtual {v1, v5, v7}, Ll/ܺ᩺֫;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :sswitch_b
    move/from16 v30, v3

    move-object/from16 v28, v8

    .line 45
    sget-object v2, Ll/ۚۛ֫;->᩷:Ll/ܺ᩺֫;

    if-nez v2, :cond_8

    const-string v2, "\u06d7\u06d7"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v25

    xor-int v3, v2, v26

    mul-int/lit16 v3, v3, -0x2d23

    const v8, -0xbba4393

    xor-int/2addr v3, v8

    const v8, 0x3b3c53d3

    goto/16 :goto_6

    :cond_8
    :goto_3
    const-string v2, "\u0730\u05a8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v26

    mul-int/lit8 v2, v2, 0x41

    xor-int v3, v2, v25

    mul-int/lit16 v3, v3, 0x43a3

    const v8, 0x41fb5e5c

    xor-int/2addr v3, v8

    const v8, 0x5184f28

    goto/16 :goto_6

    :sswitch_c
    return-object v13

    :sswitch_d
    move/from16 v30, v3

    move-object/from16 v28, v8

    .line 210
    invoke-virtual {v12, v5, v7}, Ll/ܺ᩺֫;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_9

    const-string v2, "\u0733\u06e2"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v26

    xor-int v3, v2, v25

    mul-int/lit16 v3, v3, -0xc3

    const v8, 0x38c808b9

    xor-int/2addr v3, v8

    const v8, 0x21331706

    goto/16 :goto_6

    :cond_9
    const-string v2, "\u06d9\u06d6"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v25

    xor-int v3, v2, v26

    mul-int/lit16 v3, v3, 0x5533

    const v8, -0x48b3f8da

    xor-int/2addr v3, v8

    const v8, -0x70e5ce8d

    goto :goto_6

    .line 312
    :sswitch_e
    invoke-static {}, Ll/ۚۛ֫;->ᩴ()Lbin/mt/plugin/api/LocalString;

    move-result-object v1

    .line 219
    check-cast v1, Ll/ܺ᩺֫;

    invoke-virtual {v1, v9, v7}, Ll/ܺ᩺֫;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :sswitch_f
    move/from16 v30, v3

    move-object/from16 v28, v8

    .line 0
    invoke-static {v4, v4, v1}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v5, v2

    move/from16 v10, v24

    goto/16 :goto_e

    :sswitch_10
    move/from16 v30, v3

    move-object/from16 v28, v8

    .line 196
    invoke-virtual {v0, v11}, Ll/᩵᩺֫;->ۙ(Ljava/lang/String;)Ll/ܺ᩺֫;

    move-result-object v2

    .line 197
    iput-object v2, v0, Ll/᩵᩺֫;->ۤ:Ll/ܺ᩺֫;

    :goto_4
    move-object v12, v2

    goto/16 :goto_8

    :sswitch_11
    move/from16 v30, v3

    move-object/from16 v28, v8

    .line 196
    iget-object v2, v0, Ll/᩵᩺֫;->ܳ:Ll/ۘۨ֫;

    iget-object v2, v2, Ll/ۘۨ֫;->ۙ:Ll/ܿۨ֫;

    invoke-virtual {v2}, Ll/ܿۨ֫;->ۤ()Ljava/lang/String;

    move-result-object v11

    sget-boolean v2, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v2, :cond_a

    :goto_5
    const-string v2, "\u06e1\u06e8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v26

    mul-int/lit8 v2, v2, 0x59

    xor-int v3, v2, v25

    mul-int/lit16 v3, v3, -0x6679

    const v8, -0x66c3a322

    xor-int/2addr v3, v8

    const v8, 0xd4c72cd    # 6.300054E-31f

    goto :goto_6

    :cond_a
    const-string v2, "\u1a77\u05a8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v26

    mul-int/lit8 v2, v2, 0xd

    xor-int v3, v2, v25

    mul-int/lit16 v3, v3, -0x7715

    const v8, 0x3892987e

    xor-int/2addr v3, v8

    const v8, 0x27818734

    :goto_6
    xor-int/2addr v2, v8

    move-object/from16 v8, v28

    move/from16 v28, v2

    move v2, v3

    goto/16 :goto_16

    :sswitch_12
    move-object/from16 v28, v8

    .line 217
    invoke-static {v15, v3, v6, v14}, Ll/ۘܶ;->ۙᩳۜ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 218
    invoke-static {v8, v2}, Ll/ۗܶ;->᩵֡ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    const-string v2, "\u073f\u06eb"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v25, v2

    mul-int/lit8 v2, v2, -0x1b

    xor-int v10, v2, v26

    mul-int/lit16 v10, v10, 0xa93

    const v28, -0x53fbb4f9    # -1.8799977E-12f

    xor-int v10, v10, v28

    const v28, 0x7c057e02

    goto/16 :goto_9

    .line 217
    :sswitch_13
    sget-object v15, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    const/16 v3, 0x58

    const/4 v6, 0x4

    .line 26
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v2

    if-eqz v2, :cond_c

    :cond_b
    :goto_7
    const-string v2, "\u05a1\u073d"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v26

    mul-int/lit8 v2, v2, -0x35

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, 0x3167

    const v28, 0x3a7279bf

    xor-int v10, v10, v28

    const v28, 0x145d2099

    goto/16 :goto_9

    :cond_c
    const-string v2, "\u05a8\u0730"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v26

    mul-int/lit8 v2, v2, 0x69

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, -0x3f2f

    const v28, 0x7dc30b4c

    xor-int v10, v10, v28

    const v28, -0x1a803602

    goto/16 :goto_9

    :sswitch_14
    return-object v29

    .line 0
    :sswitch_15
    invoke-static {v4, v1}, Ll/ۗ᩶;->ۛ᩹ᩳ(ILjava/lang/Object;)C

    move-result v2

    const/16 v10, 0x7d

    if-ne v2, v10, :cond_d

    const-string v2, "\u06e2\u0736"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v25

    xor-int v10, v2, v26

    mul-int/lit16 v10, v10, 0xf7

    const v28, 0x5e018153

    xor-int v10, v10, v28

    const v28, -0x4cdaf6f4

    goto :goto_9

    :cond_d
    move/from16 v30, v3

    move/from16 v3, v23

    move/from16 v10, v24

    goto/16 :goto_d

    .line 192
    :sswitch_16
    iget-object v2, v0, Ll/᩵᩺֫;->ۤ:Ll/ܺ᩺֫;

    if-eqz v2, :cond_e

    goto/16 :goto_4

    :goto_8
    const-string v2, "\u06df\u06db"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v26

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, 0x52e7

    const v28, 0x7c4337a6

    xor-int v10, v10, v28

    const v28, -0x4a441fed

    goto :goto_9

    :cond_e
    const-string v2, "\u06d8\u06dc"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v25

    xor-int v10, v2, v26

    mul-int/lit16 v10, v10, 0x2f33

    const v28, 0x13b3b53f

    xor-int v10, v10, v28

    const v28, -0x745c8eb2

    goto :goto_9

    .line 217
    :sswitch_17
    invoke-virtual {v0, v8}, Ll/᩵᩺֫;->ۙ(Ljava/lang/String;)Ll/ܺ᩺֫;

    move-result-object v2

    invoke-virtual {v2, v9, v7}, Ll/ܺ᩺֫;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    if-nez v29, :cond_f

    const-string v2, "\u1a78\u05a1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v26

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, 0x4f1f

    const v28, 0x6dfdac1d

    xor-int v10, v10, v28

    const v28, -0x175fc577

    goto :goto_9

    :cond_f
    const-string v2, "\u06e1\u073a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v25

    mul-int/lit8 v2, v2, -0x43

    xor-int v10, v2, v26

    mul-int/lit16 v10, v10, 0x48c3

    const v28, -0x430c4483

    xor-int v10, v10, v28

    const v28, -0x3a8b857e

    :goto_9
    xor-int v28, v2, v28

    move v2, v10

    goto/16 :goto_0

    :sswitch_18
    move/from16 v2, v23

    move/from16 v10, v24

    .line 215
    invoke-static {v5, v2, v10}, Ll/֡ۖ;->ܳ᩶᩷(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v8

    add-int v9, v10, v4

    .line 216
    invoke-static {v5, v9}, Ll/֡᩵;->᩹۠᩷(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v23

    if-eqz v23, :cond_10

    :goto_a
    const-string v23, "\u06e0\u06e0"

    invoke-static/range {v23 .. v23}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v23

    sub-int v23, v25, v23

    mul-int/lit8 v23, v23, -0x79

    xor-int v0, v23, v26

    mul-int/lit16 v0, v0, -0xe23

    const v24, -0x142aff84

    xor-int v0, v0, v24

    const v24, -0x4a21aab8

    xor-int v28, v23, v24

    move/from16 v23, v2

    move/from16 v24, v10

    move v2, v0

    goto/16 :goto_c

    :cond_10
    const-string v0, "\u1a7b\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v26, v0

    mul-int/lit8 v0, v0, -0xd

    move/from16 v30, v3

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, 0x2df

    const v23, -0x6193c03

    xor-int v3, v3, v23

    const v23, 0x5e2a5b9d

    goto/16 :goto_14

    :sswitch_19
    move/from16 v30, v3

    move/from16 v2, v23

    move/from16 v10, v24

    .line 204
    invoke-static {v1, v2}, Ll/ۘܽ;->᩷۬ܽ(Ljava/lang/Object;I)C

    move-result v0

    const/16 v3, 0x7b

    if-ne v0, v3, :cond_11

    const-string v0, "\u05a8\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    mul-int/lit8 v0, v0, 0x23

    xor-int v3, v0, v26

    mul-int/lit16 v3, v3, -0x73f9

    const v23, 0x33adeb1

    xor-int v3, v3, v23

    const v23, -0x3504c9ef    # -8231688.5f

    goto/16 :goto_14

    :cond_11
    move v3, v2

    goto :goto_d

    :sswitch_1a
    move/from16 v30, v3

    move/from16 v2, v23

    const/16 v0, 0x3a

    .line 207
    invoke-static {v5, v0}, Ll/ۖۗ;->᩺ۘ᩵(Ljava/lang/Object;I)I

    move-result v0

    const/4 v3, -0x1

    const/4 v7, 0x0

    if-ne v0, v3, :cond_12

    const-string v3, "\u0736\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v26

    mul-int/lit8 v3, v3, 0x3

    xor-int v10, v3, v25

    mul-int/lit16 v10, v10, -0x48a5

    const v23, 0x7df7defc

    xor-int v10, v10, v23

    const v23, -0x3389c238    # -6.455069E7f

    goto :goto_b

    :cond_12
    const-string v3, "\u1a74\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v25

    xor-int v10, v3, v26

    mul-int/lit16 v10, v10, 0x4b49

    const v23, 0x542213b3    # 2.7844608E12f

    xor-int v10, v10, v23

    const v23, 0x6228ed34

    :goto_b
    xor-int v28, v3, v23

    move/from16 v24, v0

    move/from16 v23, v2

    move v2, v10

    move/from16 v3, v30

    :goto_c
    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_13
    const/4 v3, 0x0

    :goto_d
    move-object v5, v1

    move/from16 v23, v3

    :goto_e
    const-string v0, "\u06da\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    mul-int/lit8 v0, v0, 0x4f

    xor-int v2, v0, v26

    mul-int/lit16 v2, v2, -0x3aa5

    const v3, -0xcfd3fd

    xor-int/2addr v2, v3

    const v3, -0x77ec4b03

    :goto_f
    xor-int v28, v0, v3

    move-object/from16 v0, p0

    goto/16 :goto_15

    :sswitch_1b
    move/from16 v30, v3

    move/from16 v2, v23

    move/from16 v10, v24

    const/16 v0, 0x3319

    const/16 v14, 0x3319

    goto :goto_10

    :sswitch_1c
    move/from16 v30, v3

    move/from16 v2, v23

    move/from16 v10, v24

    const/16 v0, 0xf55

    const/16 v14, 0xf55

    :goto_10
    const-string v0, "\u073d\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    mul-int/lit8 v0, v0, 0x33

    xor-int v3, v0, v26

    mul-int/lit16 v3, v3, -0x4f13

    const v23, 0x4db9d365    # 3.8970486E8f

    xor-int v3, v3, v23

    const v23, -0x221dbaa4

    goto/16 :goto_14

    :sswitch_1d
    move/from16 v30, v3

    move/from16 v2, v23

    move/from16 v10, v24

    add-int v0, v16, v20

    mul-int v0, v0, v0

    sub-int v0, v19, v0

    if-gez v0, :cond_14

    const-string v0, "\u0733\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, 0x366b

    const v23, 0x397262e1

    xor-int v3, v3, v23

    const v23, 0x24dcd939

    goto/16 :goto_14

    :cond_14
    const-string v0, "\u0730\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    mul-int/lit8 v0, v0, 0x7f

    xor-int v3, v0, v26

    mul-int/lit16 v3, v3, -0x4a29

    const v23, -0x20ef3a1a

    xor-int v3, v3, v23

    const v23, 0x17573ac3

    goto/16 :goto_14

    :sswitch_1e
    move/from16 v30, v3

    move/from16 v2, v23

    move/from16 v10, v24

    add-int v0, v17, v18

    add-int v19, v0, v0

    const/16 v20, 0x22e8

    .line 86
    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_15

    :goto_11
    const-string v0, "\u06eb\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v26

    mul-int/lit8 v0, v0, 0xf

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, 0xdc1

    const v23, 0x6eafc940

    xor-int v3, v3, v23

    const v23, -0x67dce768

    goto/16 :goto_14

    :cond_15
    const-string v0, "\u1a7b\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, -0x7ed3

    const v23, -0x2394869b

    xor-int v3, v3, v23

    const v23, 0x7fca131d

    goto/16 :goto_14

    :sswitch_1f
    move/from16 v30, v3

    move/from16 v2, v23

    move/from16 v10, v24

    aget-short v16, v21, v22

    mul-int v17, v16, v16

    const v18, 0x4c27240

    sget v0, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v0, :cond_16

    goto/16 :goto_13

    :cond_16
    const-string v0, "\u05ab\u06da"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v26

    mul-int/lit8 v0, v0, -0x33

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, 0x2601

    const v23, 0xc9e884

    xor-int v3, v3, v23

    const v23, 0x32664618

    goto/16 :goto_14

    :sswitch_20
    move/from16 v30, v3

    move/from16 v2, v23

    move/from16 v10, v24

    const/16 v22, 0x57

    .line 155
    sget v0, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v0, :cond_17

    goto :goto_13

    :cond_17
    const-string v0, "\u06e2\u073f"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    xor-int v3, v0, v26

    mul-int/lit16 v3, v3, 0xdb3

    const v23, 0x27614324

    xor-int v3, v3, v23

    const v23, 0x41caa42f

    goto :goto_14

    :sswitch_21
    move/from16 v30, v3

    move/from16 v2, v23

    move/from16 v10, v24

    sget-object v21, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_18

    :goto_12
    const-string v0, "\u06e0\u06d9"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    xor-int v3, v0, v26

    mul-int/lit16 v3, v3, -0x5bc3

    const v23, 0x7289a76a

    xor-int v3, v3, v23

    const v23, 0x32b47970

    goto :goto_14

    :cond_18
    const-string v0, "\u05a1\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v25

    mul-int/lit8 v0, v0, -0x25

    xor-int v3, v0, v26

    mul-int/lit16 v3, v3, 0x254d

    const v23, 0x66588e5d

    xor-int v3, v3, v23

    const v23, 0x204d4bd5

    goto :goto_14

    :sswitch_22
    move/from16 v30, v3

    move/from16 v2, v23

    move/from16 v10, v24

    sget-boolean v0, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v0, :cond_19

    :goto_13
    const-string v0, "\u1a74\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, 0x1875

    const v23, 0x3cfdd32f

    xor-int v3, v3, v23

    const v23, 0x25063d8f

    goto :goto_14

    :cond_19
    const-string v0, "\u1a73\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, 0x71

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, -0x7879

    const v23, -0x31281550

    xor-int v3, v3, v23

    const v23, 0x40af8b17

    :goto_14
    xor-int v28, v0, v23

    move-object/from16 v0, p0

    move/from16 v23, v2

    move v2, v3

    :goto_15
    move/from16 v24, v10

    :goto_16
    move/from16 v3, v30

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ea259f3 -> :sswitch_13
        -0x7deb2cb6 -> :sswitch_15
        -0x78f553e8 -> :sswitch_21
        -0x783e4593 -> :sswitch_22
        -0x74f4f16c -> :sswitch_20
        -0x6e423625 -> :sswitch_1a
        -0x68078c15 -> :sswitch_1f
        -0x622b4c37 -> :sswitch_6
        -0x5e4fa18b -> :sswitch_1c
        -0x582d61f6 -> :sswitch_d
        -0x56e5c63b -> :sswitch_1e
        -0x527bc0e0 -> :sswitch_a
        -0x50b77fc5 -> :sswitch_12
        -0x4eac0767 -> :sswitch_b
        -0x4be65715 -> :sswitch_18
        -0x4b43c93d -> :sswitch_1b
        -0x4a9af119 -> :sswitch_0
        -0x41627266 -> :sswitch_1
        -0x40de2911 -> :sswitch_a
        -0x3ce569a5 -> :sswitch_10
        -0x3c648907 -> :sswitch_2
        -0x3b095b06 -> :sswitch_22
        -0x3419fc9e -> :sswitch_9
        -0x2e5d778d -> :sswitch_1f
        -0x2d2effda -> :sswitch_12
        -0x25b73d51 -> :sswitch_16
        -0x1d1d2bd7 -> :sswitch_f
        -0x1b795630 -> :sswitch_3
        -0x18bfb2f2 -> :sswitch_b
        -0x1436784b -> :sswitch_5
        -0x12f17d96 -> :sswitch_9
        -0x12716f78 -> :sswitch_7
        -0x1056aa2f -> :sswitch_1d
        -0xbac821b -> :sswitch_1
        -0xa9f2ff3 -> :sswitch_17
        -0x832093f -> :sswitch_7
        -0x814f645 -> :sswitch_14
        -0x482b77f -> :sswitch_21
        0x1788807 -> :sswitch_e
        0x7b3ede6 -> :sswitch_4
        0x9f06f6a -> :sswitch_1a
        0xedfffcb -> :sswitch_1e
        0xfa42a7d -> :sswitch_6
        0x14d44763 -> :sswitch_e
        0x1b5a4185 -> :sswitch_19
        0x25db325f -> :sswitch_d
        0x2ae76df4 -> :sswitch_20
        0x307fd2e7 -> :sswitch_17
        0x350f9485 -> :sswitch_1d
        0x358d7076 -> :sswitch_15
        0x35d92e88 -> :sswitch_14
        0x3a1985ba -> :sswitch_2
        0x3ce3ae52 -> :sswitch_4
        0x3eb25cdf -> :sswitch_18
        0x49fb9bad -> :sswitch_0
        0x4daea19f -> :sswitch_5
        0x54112f33 -> :sswitch_1c
        0x5928e137 -> :sswitch_c
        0x5d91a113 -> :sswitch_11
        0x61ec24ce -> :sswitch_19
        0x6517dec1 -> :sswitch_f
        0x6ab02f2d -> :sswitch_c
        0x6d11a603 -> :sswitch_1b
        0x6dbf8eca -> :sswitch_3
        0x72881ab9 -> :sswitch_10
        0x765c12fb -> :sswitch_11
        0x77099c78 -> :sswitch_8
        0x771ecba7 -> :sswitch_8
        0x78c30930 -> :sswitch_13
        0x7d54f214 -> :sswitch_16
    .end sparse-switch
.end method

.method public final hasClipboardText()Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x3a9ce210

    sget v2, Ll/֡ۢ;->۟֡᩻:I

    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    const-string v4, "\u06df\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xd0b

    const v6, 0x299e2287

    xor-int/2addr v5, v6

    const v6, 0x4484a3aa

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x1d11

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 350
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-gez v4, :cond_a

    goto/16 :goto_2

    .line 251
    :sswitch_0
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-gez v4, :cond_5

    goto/16 :goto_3

    .line 90
    :sswitch_1
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v4

    if-lez v4, :cond_8

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    goto/16 :goto_2

    .line 17
    :sswitch_3
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    const/4 v0, 0x0

    :sswitch_4
    return v0

    :sswitch_5
    const/4 v0, 0x0

    return v0

    .line 393
    :sswitch_6
    :try_start_0
    invoke-direct {p0}, Ll/᩵᩺֫;->ۙ()Landroid/content/ClipboardManager;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "\u05a1\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x50f1

    const v6, -0x5ba03074

    xor-int/2addr v5, v6

    const v6, -0x73070ad7    # -3.8358E-31f

    goto :goto_0

    :catchall_0
    const-string v4, "\u06e2\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2d39

    const v6, 0x30b2a25f

    xor-int/2addr v5, v6

    const v6, -0x2f6bc155

    goto :goto_0

    .line 47
    :sswitch_7
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v4

    if-gtz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v4, "\u06d8\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x97d

    const v6, -0x19e27eee

    xor-int/2addr v5, v6

    const v6, -0x7be4626a

    goto/16 :goto_0

    .line 20
    :sswitch_8
    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u06e0\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7fe1

    const v6, 0x59ab9d6a

    xor-int/2addr v5, v6

    const v6, 0x4b3915ef    # 1.2129775E7f

    goto/16 :goto_0

    .line 21
    :sswitch_9
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u073d\u1a74"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4a83

    const v6, -0x2ba5524f

    xor-int/2addr v5, v6

    const v6, 0x500a8859

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v4, "\u06db\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x61b3

    const v6, -0x467ab04e

    xor-int/2addr v5, v6

    const v6, -0x78119f56

    goto/16 :goto_0

    .line 310
    :sswitch_b
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06e1\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x37c7

    const v6, 0x1723ff27

    xor-int/2addr v5, v6

    const v6, 0xcd7660c

    goto/16 :goto_0

    .line 219
    :sswitch_c
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u06d9\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x52f5

    const v6, 0x56a17224

    xor-int/2addr v5, v6

    const v6, 0x7289d800

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d9\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x203b

    const v6, 0x2e286ece

    xor-int/2addr v5, v6

    const v6, -0xf9b7230

    goto/16 :goto_0

    .line 256
    :sswitch_d
    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_7

    :goto_2
    const-string v4, "\u1a78\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3afb

    const v6, -0x48a6354f

    xor-int/2addr v5, v6

    const v6, 0xe1b6a34

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e0\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x119

    const v6, 0x420be9c3

    xor-int/2addr v5, v6

    const v6, 0x12308a02

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u1a78\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x36b5

    const v6, -0xcb559ba

    xor-int/2addr v5, v6

    const v6, 0x4de526d2    # 4.8056582E8f

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a75\u06d7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3245

    const v6, -0x5f3e1862

    xor-int/2addr v5, v6

    const v6, -0x3a870454

    goto/16 :goto_0

    .line 102
    :sswitch_f
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v4

    if-gtz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u06d8\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6c5d

    const v6, 0x155f57af

    xor-int/2addr v5, v6

    const v6, 0x5d13f23d

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u05a1\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x13e3

    const v6, -0x3f9f1bb0

    xor-int/2addr v5, v6

    const v6, -0x76079bc0

    goto/16 :goto_0

    .line 26
    :sswitch_10
    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v4, :cond_c

    :goto_5
    const-string v4, "\u06da\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x18df

    const v6, 0x3409402e

    xor-int/2addr v5, v6

    const v6, 0x4e6513c

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a76\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7927

    const v6, 0x180f5de5

    xor-int/2addr v5, v6

    const v6, 0x65273349

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cc9071c -> :sswitch_6
        -0x74d3dc0a -> :sswitch_4
        -0x730baebb -> :sswitch_f
        -0x6aa862b1 -> :sswitch_10
        -0x62d0611f -> :sswitch_c
        -0x4a901e5e -> :sswitch_6
        -0x468794f3 -> :sswitch_2
        -0x43b8d018 -> :sswitch_e
        -0x40d21cd9 -> :sswitch_b
        -0x3a7ff1fe -> :sswitch_2
        -0x3a6ad2ec -> :sswitch_7
        -0x29b6a004 -> :sswitch_4
        -0x21c147e0 -> :sswitch_e
        -0x1ad4d04d -> :sswitch_5
        -0x18defade -> :sswitch_3
        -0x14e3bf49 -> :sswitch_9
        -0x114ad03c -> :sswitch_a
        -0xf465c49 -> :sswitch_8
        -0x718525f -> :sswitch_d
        0x4707c3b -> :sswitch_7
        0x163331bb -> :sswitch_a
        0x1f43c75e -> :sswitch_8
        0x278fa8cc -> :sswitch_c
        0x31594113 -> :sswitch_0
        0x393a801c -> :sswitch_0
        0x415190e7 -> :sswitch_3
        0x46204ef1 -> :sswitch_b
        0x464fc0de -> :sswitch_1
        0x4736fde1 -> :sswitch_1
        0x5d756452 -> :sswitch_9
        0x6e785564 -> :sswitch_5
        0x713b86bf -> :sswitch_10
        0x76a12b66 -> :sswitch_d
        0x773e1fb3 -> :sswitch_f
    .end sparse-switch
.end method

.method public final log(Ljava/lang/String;)V
    .locals 2

    .line 489
    iget-object v1, p0, Ll/᩵᩺֫;->۫:Ljava/lang/String;

    sget-object v0, Ll/ۚۛ֫;->ܳ:Ll/ܺ᩺֫;

    .line 0
    const-class v0, Ll/ۚۛ֫;

    monitor-enter v0

    .line 175
    :try_start_0
    invoke-static {v1, p1}, Ll/ۚۛ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final log(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    const v0, -0x12cb47c

    sget v1, Ll/ۧ;->ۨۗܰ:I

    sget v2, Ll/ۗ֡;->ۜ᩻۫:I

    const-string v3, "\u0733\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7b65

    const v5, 0x636e2add

    xor-int/2addr v4, v5

    const v5, 0x15c369a6

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x255f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 213
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_7

    goto/16 :goto_4

    .line 411
    :sswitch_0
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_b

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v3

    if-eqz v3, :cond_8

    goto/16 :goto_3

    .line 49
    :sswitch_2
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v3, "\u0736\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7faf

    const v5, 0x7e5d7e30

    xor-int/2addr v4, v5

    const v5, 0x4aef8ba8    # 7849428.0f

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    goto/16 :goto_3

    .line 173
    :sswitch_4
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    return-void

    .line 494
    :sswitch_5
    iget-object v0, p0, Ll/᩵᩺֫;->۫:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Ll/ۚۛ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 374
    :sswitch_6
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u1a76\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2441

    const v5, -0x9586a00

    xor-int/2addr v4, v5

    const v5, -0x611ef71b

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u06df\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3b1

    const v5, 0xfcfe27c

    xor-int/2addr v4, v5

    const v5, -0x175f2ea3

    goto/16 :goto_0

    .line 205
    :sswitch_8
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_3

    :goto_2
    const-string v3, "\u0730\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x588d

    const v5, 0x60cbc0ba

    xor-int/2addr v4, v5

    const v5, 0x6bed8260

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a73\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x621

    const v5, 0xaa12bfe

    xor-int/2addr v4, v5

    const v5, -0x249c56a1

    goto/16 :goto_0

    .line 72
    :sswitch_9
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u1a79\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6b21

    const v5, -0x31cc7465

    xor-int/2addr v4, v5

    const v5, 0x25698446

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_5

    :goto_3
    const-string v3, "\u1a74\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3d35

    const v5, 0x10e7216b

    xor-int/2addr v4, v5

    const v5, -0x4bfb2427

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e2\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x15f1

    const v5, -0x3e6435d8

    xor-int/2addr v4, v5

    const v5, -0x60a56036

    goto/16 :goto_0

    .line 206
    :sswitch_b
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v3

    if-gtz v3, :cond_6

    goto :goto_4

    :cond_6
    const-string v3, "\u0730\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1267

    const v5, -0x79947fa9

    xor-int/2addr v4, v5

    const v5, -0x41047205    # -0.4913176f

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06ec\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4a35

    const v5, -0x3eaa8a1c

    xor-int/2addr v4, v5

    const v5, -0xbdba14d

    goto/16 :goto_0

    .line 53
    :sswitch_c
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_4
    const-string v3, "\u073d\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x445d

    const v5, -0x7d5baad3

    xor-int/2addr v4, v5

    const v5, 0x513bcc95

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u0730\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x41f7

    const v5, -0x40b19f9f

    xor-int/2addr v4, v5

    const v5, -0x1009e758

    goto/16 :goto_0

    .line 294
    :sswitch_d
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u073f\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x48b

    const v5, -0x281344ae

    xor-int/2addr v4, v5

    const v5, -0x395034cf

    goto/16 :goto_0

    .line 117
    :sswitch_e
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u073a\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1bff

    const v5, -0x2f858c4c

    xor-int/2addr v4, v5

    const v5, -0x5e5a235c

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0736\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4697

    const v5, 0x4d9c5c82

    xor-int/2addr v4, v5

    const v5, 0x327979c8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7be61aca -> :sswitch_a
        -0x78de4315 -> :sswitch_e
        -0x5f644c9f -> :sswitch_d
        -0x5d828d4b -> :sswitch_c
        -0x5accb190 -> :sswitch_3
        -0x44caa6ec -> :sswitch_4
        -0x398070a0 -> :sswitch_8
        -0x395196d6 -> :sswitch_0
        -0x36135155 -> :sswitch_b
        -0x29fcc1f5 -> :sswitch_7
        -0x1efb6a2a -> :sswitch_c
        -0x1a54dfea -> :sswitch_2
        -0x9a05acd -> :sswitch_5
        -0x7b28134 -> :sswitch_1
        -0x6f0a8c9 -> :sswitch_0
        0x12a52d8 -> :sswitch_d
        0x137cdf4 -> :sswitch_3
        0x77c285e -> :sswitch_6
        0x91eaf20 -> :sswitch_2
        0x26e5a608 -> :sswitch_4
        0x2c195b07 -> :sswitch_a
        0x33a117b5 -> :sswitch_8
        0x40088d0e -> :sswitch_9
        0x4982d46d -> :sswitch_7
        0x4e37f015 -> :sswitch_e
        0x5c7b2105 -> :sswitch_6
        0x615be3b5 -> :sswitch_5
        0x674ca489 -> :sswitch_b
        0x7086605a -> :sswitch_9
        0x74e0f3bc -> :sswitch_1
    .end sparse-switch
.end method

.method public final log(Ljava/lang/Throwable;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x758f14d5

    sget v2, Ll/ۘ֡;->᩹ܶ۬:I

    sget v3, Ll/֡᩵;->ۤܳ۬:I

    const-string v4, "\u1a76\u06e2"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7f6b

    const v6, 0x7ca62799

    xor-int/2addr v5, v6

    const v6, 0x3ce7c6f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x2c39

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    const/4 v1, 0x0

    .line 163
    invoke-static {v0, v1, p1}, Ll/ۚۛ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :sswitch_0
    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u06e1\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x375

    const v6, -0x3c10be82

    xor-int/2addr v5, v6

    const v6, 0x65fb79c5

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v4

    if-gtz v4, :cond_6

    goto/16 :goto_2

    .line 2
    :sswitch_2
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v4, :cond_a

    goto/16 :goto_2

    .line 312
    :sswitch_3
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    goto/16 :goto_2

    .line 167
    :sswitch_4
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    return-void

    .line 499
    :sswitch_5
    iget-object v0, p0, Ll/᩵᩺֫;->۫:Ljava/lang/String;

    .line 370
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u1a73\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1735

    const v6, -0x3fd93ce4

    xor-int/2addr v5, v6

    const v6, 0x64551932

    goto :goto_0

    :sswitch_6
    sget v4, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06da\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5883

    const v6, 0x65c56667

    xor-int/2addr v5, v6

    const v6, 0x4e5e1e20    # 9.3162906E8f

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06e4\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xfab

    const v6, 0x2dc28c00

    xor-int/2addr v5, v6

    const v6, -0x40849eae

    goto/16 :goto_0

    .line 316
    :sswitch_8
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_4

    goto :goto_1

    :cond_4
    const-string v4, "\u06d7\u0736"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ec3

    const v6, 0x7a3aeedb

    xor-int/2addr v5, v6

    const v6, 0x22f7a0e3

    goto/16 :goto_0

    .line 48
    :sswitch_9
    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u1a7b\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6c2b

    const v6, 0x15c6f524

    xor-int/2addr v5, v6

    const v6, 0x1cb53a99

    goto/16 :goto_0

    .line 345
    :sswitch_a
    sget v4, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v4, :cond_7

    :cond_6
    :goto_1
    const-string v4, "\u06dc\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4d29

    const v6, -0x13cef191

    xor-int/2addr v5, v6

    const v6, -0x2381110c

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e8\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7e81

    const v6, -0x40b438e4

    xor-int/2addr v5, v6

    const v6, -0x2847255a

    goto/16 :goto_0

    .line 276
    :sswitch_b
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_2

    :cond_8
    const-string v4, "\u1a74\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x525f

    const v6, 0x1a7dc37f

    xor-int/2addr v5, v6

    const v6, -0x5150d45d

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_9

    :goto_2
    const-string v4, "\u06d8\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7b25

    const v6, -0x6203ed1

    xor-int/2addr v5, v6

    const v6, -0x35939d9e

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a76\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6479

    const v6, -0xd9ddc18

    xor-int/2addr v5, v6

    const v6, 0xdebd0d3

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v4

    if-gtz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u06e7\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2897

    const v6, 0x12e40bf6

    xor-int/2addr v5, v6

    const v6, -0x2b20a57d

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a73\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7f67

    const v6, 0x12aea5d9

    xor-int/2addr v5, v6

    const v6, -0x7d3b1c3b

    goto/16 :goto_0

    .line 96
    :sswitch_e
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v4

    if-eqz v4, :cond_c

    :goto_4
    const-string v4, "\u1a76\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x190d

    const v6, -0x71d63094

    xor-int/2addr v5, v6

    const v6, 0x62e93dc1

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7a\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5361

    const v6, 0x3313921e

    xor-int/2addr v5, v6

    const v6, -0x2144844a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fe66ab4 -> :sswitch_6
        -0x7f6f726f -> :sswitch_1
        -0x78c281ec -> :sswitch_b
        -0x699c6b46 -> :sswitch_8
        -0x561263d1 -> :sswitch_0
        -0x41ab656d -> :sswitch_4
        -0x3ae650db -> :sswitch_1
        -0x33eae4fa -> :sswitch_a
        -0x2df31ed0 -> :sswitch_a
        -0x1c0b1fcd -> :sswitch_4
        -0x10179abd -> :sswitch_3
        -0xa199272 -> :sswitch_2
        -0x1df8d00 -> :sswitch_9
        0xb6f22ea -> :sswitch_7
        0xcf70a48 -> :sswitch_9
        0xde72e75 -> :sswitch_e
        0xea1bf8a -> :sswitch_c
        0x100ac7c9 -> :sswitch_5
        0x13c2c44d -> :sswitch_5
        0x35ae28d8 -> :sswitch_6
        0x3d253d19 -> :sswitch_8
        0x3d2dbfed -> :sswitch_d
        0x443a6e04 -> :sswitch_d
        0x4e3b8971 -> :sswitch_0
        0x4ec8e029 -> :sswitch_2
        0x4f5d9200 -> :sswitch_7
        0x5e0a1395 -> :sswitch_3
        0x726d53e4 -> :sswitch_e
        0x7970d4ef -> :sswitch_c
        0x7c720915 -> :sswitch_b
    .end sparse-switch
.end method

.method public final openBrowser(Ljava/lang/String;)V
    .locals 6

    const v0, 0x7b415fb5

    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    sget v2, Ll/֨ܿ;->᩹᩻۟:I

    const-string v3, "\u1a7b\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5f27

    const v5, 0xfbc1f9b

    xor-int/2addr v4, v5

    const v5, 0x32a9c58d

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x32d5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 62
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_0

    goto/16 :goto_1

    .line 337
    :sswitch_0
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_1

    .line 143
    :sswitch_1
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_2

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u073a\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x394f

    const v5, 0x2b5b08e8

    xor-int/2addr v4, v5

    const v5, -0x3b349a7f

    goto :goto_0

    .line 175
    :sswitch_2
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    goto/16 :goto_1

    .line 139
    :sswitch_3
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    return-void

    .line 344
    :sswitch_4
    new-instance v3, Ll/۠֡֫;

    .line 275
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_1

    const-string v3, "\u06dc\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xb1d

    const v5, 0x16370cb4

    xor-int/2addr v4, v5

    const v5, -0x784e8666

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    .line 344
    invoke-direct {v3, v0, p0, p1}, Ll/۠֡֫;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 265
    :sswitch_5
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_3

    :cond_2
    const-string v3, "\u0730\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2c41

    const v5, -0x30efe1bf

    xor-int/2addr v4, v5

    const v5, 0x30dea143

    goto :goto_0

    :cond_3
    const-string v3, "\u05a8\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7a5b

    const v5, 0x7019e489

    xor-int/2addr v4, v5

    const v5, 0x5e1bf997

    goto/16 :goto_0

    :sswitch_6
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v3, "\u06d7\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7db

    const v5, -0x4b77fbe3

    xor-int/2addr v4, v5

    const v5, 0x2a0412cd

    goto/16 :goto_0

    .line 56
    :sswitch_7
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    const-string v3, "\u1a77\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x477f

    const v5, -0x607185c5

    xor-int/2addr v4, v5

    const v5, -0xcc6c565

    goto/16 :goto_0

    .line 253
    :sswitch_8
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v3, "\u06da\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7e61

    const v5, 0x141e0f43

    xor-int/2addr v4, v5

    const v5, 0x4587dfa0

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v3

    if-ltz v3, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string v3, "\u1a73\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7363

    const v5, -0x577bb53f

    xor-int/2addr v4, v5

    const v5, 0x6d7291ca

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_8

    goto :goto_1

    :cond_8
    const-string v3, "\u06e0\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5449

    const v5, -0x6d986a62

    xor-int/2addr v4, v5

    const v5, -0x54de82c

    goto/16 :goto_0

    .line 319
    :sswitch_b
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_9

    :goto_1
    const-string v3, "\u1a73\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x989

    const v5, 0x6372bddd

    xor-int/2addr v4, v5

    const v5, 0x4d675975    # 2.4258747E8f

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06db\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1d53

    const v5, 0x24abf183

    xor-int/2addr v4, v5

    const v5, 0x689b1f46

    goto/16 :goto_0

    .line 247
    :sswitch_c
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_a

    goto :goto_2

    :cond_a
    const-string v3, "\u06df\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3757

    const v5, 0x2e81a2d4

    xor-int/2addr v4, v5

    const v5, -0x8fc004

    goto/16 :goto_0

    .line 178
    :sswitch_d
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_2
    const-string v3, "\u1a75\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x351d

    const v5, -0x15f05fe2

    xor-int/2addr v4, v5

    const v5, -0x533655eb

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073f\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2fdb

    const v5, 0x1cc1cd44

    xor-int/2addr v4, v5

    const v5, -0x136ae4e9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7aa867cd -> :sswitch_2
        -0x771543af -> :sswitch_9
        -0x7644f025 -> :sswitch_6
        -0x700f1735 -> :sswitch_a
        -0x58dde6bc -> :sswitch_b
        -0x55945925 -> :sswitch_9
        -0x54977140 -> :sswitch_6
        -0x44ff822b -> :sswitch_b
        -0x31fce4a6 -> :sswitch_a
        -0x25a9b527 -> :sswitch_1
        -0x201ca703 -> :sswitch_0
        -0x1df340ed -> :sswitch_3
        -0x1ce0246f -> :sswitch_7
        -0x1206ba11 -> :sswitch_5
        -0x77c10c2 -> :sswitch_4
        0x153698ee -> :sswitch_3
        0x307846be -> :sswitch_5
        0x31d5aefc -> :sswitch_4
        0x35235180 -> :sswitch_8
        0x41db7f55 -> :sswitch_d
        0x46ddb54d -> :sswitch_d
        0x4a0d2225 -> :sswitch_c
        0x5c3da965 -> :sswitch_0
        0x62534081 -> :sswitch_2
        0x67a5fde9 -> :sswitch_1
        0x67af999d -> :sswitch_c
        0x7cb6be7b -> :sswitch_7
        0x7d6d09b2 -> :sswitch_8
    .end sparse-switch
.end method

.method public final openBuiltinBrowser(Ljava/lang/String;Z)V
    .locals 6

    const v0, -0x13ef9c8

    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    sget v2, Ll/ۗۖ;->ۙ᩶֨:I

    const-string v3, "\u073f\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x107d

    const v5, 0x1f53280b

    xor-int/2addr v4, v5

    const v5, 0x5f96fd84    # 2.1759995E19f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x7ee9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 305
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_6

    goto/16 :goto_2

    .line 230
    :sswitch_0
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u073a\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x47bf

    const v5, -0x4954b710

    xor-int/2addr v4, v5

    const v5, -0x11a708f6

    goto :goto_0

    .line 135
    :sswitch_1
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    :goto_1
    const-string v3, "\u06e0\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x63e3

    const v5, -0x530e55c0

    xor-int/2addr v4, v5

    const v5, 0x5790605a

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v3

    if-lez v3, :cond_7

    goto/16 :goto_3

    .line 293
    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    goto/16 :goto_3

    .line 167
    :sswitch_4
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    return-void

    .line 359
    :sswitch_5
    new-instance v0, Ll/ܶ᩺֫;

    invoke-direct {v0, p0, p1, p2}, Ll/ܶ᩺֫;-><init>(Ll/᩵᩺֫;Ljava/lang/String;Z)V

    invoke-static {v0}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :sswitch_6
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06d7\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1a81

    const v5, -0x70d34c85

    xor-int/2addr v4, v5

    const v5, -0x4cab8859

    goto/16 :goto_0

    .line 61
    :sswitch_7
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u0730\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xabb

    const v5, -0x643d3c23

    xor-int/2addr v4, v5

    const v5, 0x3aae7951

    goto/16 :goto_0

    .line 304
    :sswitch_8
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u1a78\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2cfd

    const v5, 0xd16b71c

    xor-int/2addr v4, v5

    const v5, 0x10ef7e5

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u073a\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xbe9

    const v5, -0xad85e63

    xor-int/2addr v4, v5

    const v5, 0x69114ec0

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06d9\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5961

    const v5, -0x29c7f092

    xor-int/2addr v4, v5

    const v5, 0x366388cf

    goto/16 :goto_0

    .line 340
    :sswitch_a
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u1a7b\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2779

    const v5, -0x6e425fdf

    xor-int/2addr v4, v5

    const v5, -0x172b3db8

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a79\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x742b

    const v5, 0x36ffd91

    xor-int/2addr v4, v5

    const v5, 0x2536088b

    goto/16 :goto_0

    .line 172
    :sswitch_b
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u06dc\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7de5

    const v5, 0x23ef0659

    xor-int/2addr v4, v5

    const v5, -0x5806e99b

    goto/16 :goto_0

    .line 161
    :sswitch_c
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u06d8\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x745

    const v5, -0x25ae7e04

    xor-int/2addr v4, v5

    const v5, -0x3e42db09

    goto/16 :goto_0

    .line 272
    :sswitch_d
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_b

    :goto_3
    const-string v3, "\u06df\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4b9f

    const v5, 0x3798db06

    xor-int/2addr v4, v5

    const v5, 0x2e5d383d

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a7a\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x46b

    const v5, -0x4d6f59a8

    xor-int/2addr v4, v5

    const v5, 0x6eac9319

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u1a75\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7a0f

    const v5, 0x6b10231b

    xor-int/2addr v4, v5

    const v5, -0x4c845cd5

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d7\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xb9d

    const v5, 0x2523b7f8

    xor-int/2addr v4, v5

    const v5, 0x7933f82f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7edb4b6c -> :sswitch_9
        -0x75951d4c -> :sswitch_3
        -0x6f62a281 -> :sswitch_a
        -0x66031c27 -> :sswitch_5
        -0x622bc80f -> :sswitch_7
        -0x58164ce3 -> :sswitch_a
        -0x47535b08 -> :sswitch_0
        -0x4491d7a3 -> :sswitch_4
        -0x3b17b80b -> :sswitch_c
        -0x1ee8f63d -> :sswitch_6
        -0x14f9a9e3 -> :sswitch_5
        -0xe78101d -> :sswitch_c
        -0xc9f23c -> :sswitch_d
        0x7c4e075 -> :sswitch_e
        0xdbe551c -> :sswitch_e
        0xfc24124 -> :sswitch_2
        0x1558917a -> :sswitch_6
        0x15e0473a -> :sswitch_0
        0x2161d842 -> :sswitch_d
        0x31434e38 -> :sswitch_8
        0x32f739f5 -> :sswitch_2
        0x34707aa7 -> :sswitch_7
        0x3533bf96 -> :sswitch_3
        0x3c241399 -> :sswitch_1
        0x4395709e -> :sswitch_b
        0x5a24e09e -> :sswitch_8
        0x5be2a1f7 -> :sswitch_b
        0x684f1fc2 -> :sswitch_1
        0x73157beb -> :sswitch_4
        0x7e7f9547 -> :sswitch_9
    .end sparse-switch
.end method

.method public final openLogViewer()V
    .locals 6

    const v0, -0x3fb127e9

    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    sget v2, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v3, "\u06eb\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xff

    const v5, -0x696a2cde

    xor-int/2addr v4, v5

    const v5, 0x17304fc9

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x4013

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 433
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v3

    if-lez v3, :cond_9

    goto :goto_1

    :sswitch_0
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_4

    goto :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    const-string v3, "\u1a76\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3679

    const v5, -0x14c811f7

    xor-int/2addr v4, v5

    const v5, -0x63ab1c

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    goto :goto_2

    .line 100
    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    return-void

    .line 508
    :sswitch_4
    new-instance v3, Ll/֫۠֫;

    .line 111
    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v4, :cond_1

    goto :goto_3

    .line 243
    :cond_1
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_2

    goto :goto_3

    :cond_2
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v4

    if-ltz v4, :cond_3

    goto :goto_4

    .line 400
    :cond_3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v4

    if-gtz v4, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u073d\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7531

    const v5, 0x6b96f725

    xor-int/2addr v4, v5

    const v5, 0x6a89145e

    goto :goto_0

    :cond_5
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v4

    if-gtz v4, :cond_6

    goto :goto_3

    .line 71
    :cond_6
    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v4, :cond_7

    :goto_2
    const-string v3, "\u1a74\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x53df

    const v5, -0x1ff66f49

    xor-int/2addr v4, v5

    const v5, -0x15a9a75

    goto/16 :goto_0

    :cond_7
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_8

    goto :goto_3

    :cond_8
    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06e4\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6d05

    const v5, 0x5d23b36

    xor-int/2addr v4, v5

    const v5, 0x35a242e5

    goto/16 :goto_0

    .line 192
    :cond_a
    sget-boolean v4, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v4, :cond_b

    goto :goto_4

    :cond_b
    const/4 v4, 0x3

    sget v5, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v5, :cond_c

    :goto_4
    const-string v3, "\u0736\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5921

    const v5, 0x6ac1dda6

    xor-int/2addr v4, v5

    const v5, -0x3b646a41

    goto/16 :goto_0

    .line 508
    :cond_c
    iget-object v0, p0, Ll/᩵᩺֫;->۫:Ljava/lang/String;

    invoke-direct {v3, v4, v0}, Ll/֫۠֫;-><init>(ILjava/lang/Object;)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5361ffd6 -> :sswitch_4
        -0x46321457 -> :sswitch_2
        -0x3390964b -> :sswitch_2
        -0x25d9ac9 -> :sswitch_1
        0x19fc30cf -> :sswitch_3
        0x1d0554b9 -> :sswitch_0
        0x365e475d -> :sswitch_3
        0x404c9679 -> :sswitch_4
        0x71a70298 -> :sswitch_1
        0x7746a25f -> :sswitch_0
    .end sparse-switch
.end method

.method public final openPreference(Ljava/lang/Class;)V
    .locals 6

    const v0, -0x5926bd25

    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    sget v2, Ll/֡ۢ;->۟֡᩻:I

    const-string v3, "\u0736\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7701

    const v5, 0x4946fd18    # 815057.5f

    xor-int/2addr v4, v5

    const v5, -0x25364ba7

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x5ef3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 114
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_1

    .line 9
    :sswitch_0
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-nez v3, :cond_a

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-nez v3, :cond_6

    goto/16 :goto_4

    .line 23
    :sswitch_2
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_1

    goto/16 :goto_4

    .line 111
    :sswitch_3
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    return-void

    .line 325
    :sswitch_5
    new-instance v3, Ll/᩻᩷ܳ;

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v0, 0x1

    invoke-direct {v3, v0, p0, p1}, Ll/᩻᩷ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :sswitch_6
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_2

    :cond_1
    const-string v3, "\u06e7\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6abb

    const v5, -0x3649d60a

    xor-int/2addr v4, v5

    const v5, -0x582d471c

    goto :goto_0

    :cond_2
    const-string v3, "\u06d7\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4cd7

    const v5, -0x239e9f29

    xor-int/2addr v4, v5

    const v5, -0x7f8e006c

    goto :goto_0

    .line 72
    :sswitch_7
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u05a8\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4fe7

    const v5, 0x7f31a295

    xor-int/2addr v4, v5

    const v5, -0x37bced16

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u1a79\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x32b7

    const v5, -0x154a914b

    xor-int/2addr v4, v5

    const v5, 0x79e0fde9

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u0736\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5229

    const v5, 0xc4c3c33

    xor-int/2addr v4, v5

    const v5, 0x5ca2899f

    goto/16 :goto_0

    .line 14
    :sswitch_9
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u073f\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x15fd

    const v5, 0x68b56442

    xor-int/2addr v4, v5

    const v5, 0x5f597aba

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u073d\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3889

    const v5, -0x69603ea8

    xor-int/2addr v4, v5

    const v5, 0x112f088d

    goto/16 :goto_0

    .line 2
    :sswitch_a
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v3

    if-eqz v3, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v3, "\u1a77\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1119

    const v5, -0x57887a2

    xor-int/2addr v4, v5

    const v5, 0x44c2d1e4

    goto/16 :goto_0

    .line 55
    :sswitch_b
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_9

    :goto_2
    const-string v3, "\u06e7\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xe2d

    const v5, -0x176c8dcc

    xor-int/2addr v4, v5

    const v5, -0x5b0bbd24

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e4\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xd6f

    const v5, -0x798bc4fc

    xor-int/2addr v4, v5

    const v5, 0x44e3546d

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u05a1\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4a77

    const v5, 0x794ce21

    xor-int/2addr v4, v5

    const v5, -0x7a70b9c

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e4\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4ca9

    const v5, 0xf230e90

    xor-int/2addr v4, v5

    const v5, -0x622fdc27

    goto/16 :goto_0

    .line 162
    :sswitch_d
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u0733\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x554f

    const v5, -0x2d5d6209

    xor-int/2addr v4, v5

    const v5, -0x8112e83

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d6\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x400f

    const v5, 0x34e2b292

    xor-int/2addr v4, v5

    const v5, 0x6ec66b8c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c33d645 -> :sswitch_8
        -0x6a0eb070 -> :sswitch_4
        -0x5b8cd1e8 -> :sswitch_2
        -0x4f5f8aa2 -> :sswitch_d
        -0x4f2c442d -> :sswitch_a
        -0x4c81b304 -> :sswitch_8
        -0x48bcbf3d -> :sswitch_0
        -0x2eb057c9 -> :sswitch_1
        -0x2469d6aa -> :sswitch_6
        -0xe9abf82 -> :sswitch_d
        -0xe0550ea -> :sswitch_0
        0x4a2d7c4 -> :sswitch_c
        0x6e16d2e -> :sswitch_7
        0xd6089aa -> :sswitch_b
        0x1a2277e0 -> :sswitch_9
        0x1ba27616 -> :sswitch_3
        0x30d41975 -> :sswitch_c
        0x3190296d -> :sswitch_9
        0x557974cc -> :sswitch_4
        0x572a9e73 -> :sswitch_2
        0x59bade91 -> :sswitch_3
        0x6aa28b99 -> :sswitch_1
        0x6f74c33a -> :sswitch_5
        0x6fad32be -> :sswitch_5
        0x71187f1e -> :sswitch_7
        0x715c7670 -> :sswitch_a
        0x720cdc08 -> :sswitch_b
        0x77d13f24 -> :sswitch_6
    .end sparse-switch
.end method

.method public final setClipboardText(Ljava/lang/CharSequence;)Z
    .locals 19

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

    const v12, 0x42beb1f0

    sget v13, Ll/֡᩻;->᩷ۧ᩺:I

    sget v14, Ll/᩶;->ᩴ᩶ۛ:I

    const-string v15, "\u1a78\u0736"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v13, v15

    mul-int/lit8 v15, v15, 0x29

    xor-int v0, v15, v14

    mul-int/lit16 v0, v0, 0x2a85

    const v17, 0x74a5c809

    xor-int v0, v0, v17

    const v17, 0x41041e54

    xor-int v15, v15, v17

    const/16 v16, 0x0

    :goto_0
    xor-int/2addr v12, v14

    mul-int/lit16 v12, v12, -0x3905

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v0, v12

    xor-int v12, v15, v0

    sparse-switch v12, :sswitch_data_0

    const v0, 0x7d0dec11

    xor-int v16, v1, v0

    sget v0, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v0, :cond_4

    goto :goto_4

    .line 23
    :sswitch_0
    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-lez v0, :cond_1

    :cond_0
    :goto_1
    move/from16 v17, v1

    goto/16 :goto_a

    :cond_1
    :goto_2
    move/from16 v17, v1

    goto/16 :goto_8

    :sswitch_1
    sget v0, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v0, :cond_0

    :cond_2
    move/from16 v17, v1

    goto/16 :goto_9

    :sswitch_2
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget v0, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v0, :cond_5

    :cond_3
    move/from16 v17, v1

    goto/16 :goto_7

    .line 38
    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-nez v0, :cond_3

    goto :goto_4

    .line 11
    :sswitch_4
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_4

    .line 266
    :sswitch_5
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    goto :goto_4

    :sswitch_6
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    :goto_3
    const/4 v0, 0x0

    return v0

    :sswitch_7
    const/4 v0, 0x1

    return v0

    .line 419
    :sswitch_8
    invoke-static/range {v16 .. v16}, Ll/ۖ᩹;->ܳܽ֫(I)Ll/᩸۠ۧ;

    goto :goto_3

    :goto_4
    const-string v0, "\u1a78\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x5c73

    const v17, -0x3dec9d4f

    xor-int v15, v15, v17

    const v17, 0x4af9cfe5    # 8185842.5f

    goto/16 :goto_5

    :cond_4
    const-string v0, "\u0733\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x638f

    const v17, -0x5a585215

    xor-int v15, v15, v17

    const v17, -0x64e88fe2

    goto :goto_5

    .line 415
    :sswitch_9
    invoke-static {v9, v10, v11, v8}, Ll/֡ۢ;->֡֨ۛ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    .line 9
    sget v0, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v0, :cond_6

    :cond_5
    const-string v0, "\u1a75\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x40c1

    const v17, 0x1fd0f4b

    xor-int v15, v15, v17

    const v17, -0x692f7c82

    goto :goto_5

    :cond_6
    const-string v0, "\u06da\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x2997

    const v17, 0x981319d

    xor-int v15, v15, v17

    const v17, 0x40cab4b6

    goto :goto_5

    :sswitch_a
    const/4 v11, 0x3

    sget v0, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v0, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string v0, "\u1a7a\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x11

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x5803

    const v17, -0x9e71488

    xor-int v15, v15, v17

    const v17, -0x6c13db90

    goto :goto_5

    .line 415
    :sswitch_b
    sget-object v9, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    const/16 v10, 0x64

    sget v0, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v0, :cond_8

    goto/16 :goto_1

    :cond_8
    const-string v0, "\u05ab\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x1ac5

    const v17, -0x701fb98b

    xor-int v15, v15, v17

    const v17, 0x7caa8a98

    :goto_5
    xor-int v0, v0, v17

    move/from16 v18, v15

    move v15, v0

    move/from16 v0, v18

    goto/16 :goto_0

    .line 414
    :sswitch_c
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/᩵᩺֫;->ۙ()Landroid/content/ClipboardManager;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v15, 0x0

    move/from16 v17, v1

    move-object/from16 v1, p1

    :try_start_1
    invoke-static {v15, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v15

    invoke-virtual {v0, v15}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    sget-object v0, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    const/16 v15, 0x67

    const/4 v1, 0x3

    invoke-static {v0, v15, v1, v8}, Ll/֨ܿ;->᩻ۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7ea1ad01

    xor-int/2addr v0, v1

    .line 415
    invoke-static {v0}, Ll/ۗ֫;->ۛ֡۫(I)Ll/᩸۠ۧ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v0, "\u1a76\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x281f

    const v15, -0x1d8b244f

    xor-int/2addr v1, v15

    const v15, -0x5ccc4a86

    goto/16 :goto_b

    :catchall_0
    move/from16 v17, v1

    :catchall_1
    const-string v0, "\u06e8\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x19

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x3415

    const v15, -0x3534e2de    # -6655633.0f

    xor-int/2addr v1, v15

    const v15, 0x28601bad

    goto/16 :goto_b

    :sswitch_d
    move/from16 v17, v1

    const v0, 0xa5aa

    const v8, 0xa5aa

    goto :goto_6

    :sswitch_e
    move/from16 v17, v1

    const v0, 0xa177

    const v8, 0xa177

    :goto_6
    const-string v0, "\u06e4\u06df"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x7b

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x3dd1

    const v15, 0x18018768

    xor-int/2addr v1, v15

    const v15, 0xe713538

    goto/16 :goto_b

    :sswitch_f
    move/from16 v17, v1

    mul-int v0, v4, v7

    sub-int/2addr v0, v6

    if-gtz v0, :cond_9

    const-string v0, "\u073d\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x2f

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x72c1

    const v15, -0x4c099c73

    xor-int/2addr v1, v15

    const v15, 0x332aa462

    goto/16 :goto_b

    :cond_9
    const-string v0, "\u1a75\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x7f0b

    const v15, 0x5faf230b

    xor-int/2addr v1, v15

    const v15, -0x6dc4e724

    goto/16 :goto_b

    :sswitch_10
    move/from16 v17, v1

    const v7, 0xd9b4

    .line 11
    sget v0, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v0, :cond_a

    :goto_7
    const-string v0, "\u06e7\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x3f

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x48bd

    const v15, 0x1bf1f9fa

    xor-int/2addr v1, v15

    const v15, -0x7e788c83

    goto/16 :goto_b

    :cond_a
    const-string v0, "\u1a77\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x45

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x7b9d

    const v15, 0x4889f031

    xor-int/2addr v1, v15

    const v15, 0x6fefa27c

    goto/16 :goto_b

    :sswitch_11
    move/from16 v17, v1

    add-int v0, v4, v5

    mul-int v6, v0, v0

    .line 415
    sget v0, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v0, :cond_b

    goto/16 :goto_9

    :cond_b
    const-string v0, "\u06d7\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0xd

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x2653

    const v15, 0x5481f5a0

    xor-int/2addr v1, v15

    const v15, -0x566359d4

    goto/16 :goto_b

    :sswitch_12
    move/from16 v17, v1

    aget-short v4, v2, v3

    const/16 v5, 0x366d

    sget-boolean v0, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v0, :cond_c

    const-string v0, "\u06db\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x1d

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x2837

    const v15, -0x7c5c70b6

    xor-int/2addr v1, v15

    const v15, 0x6afea8dd

    goto/16 :goto_b

    :cond_c
    const-string v0, "\u0730\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0xac7

    const v15, -0x4c444211

    xor-int/2addr v1, v15

    const v15, -0x180fa802

    goto/16 :goto_b

    :sswitch_13
    move/from16 v17, v1

    const/16 v3, 0x63

    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v0

    if-eqz v0, :cond_d

    :goto_8
    const-string v0, "\u06e0\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x34d5

    const v15, -0x385256c5

    xor-int/2addr v1, v15

    const v15, -0x428ef358

    goto/16 :goto_b

    :cond_d
    const-string v0, "\u073d\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x17a1

    const v15, -0x4f10788b

    xor-int/2addr v1, v15

    const v15, 0x2ad76384

    goto :goto_b

    :sswitch_14
    move/from16 v17, v1

    sget-object v2, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    .line 129
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v0

    if-nez v0, :cond_e

    :goto_9
    const-string v0, "\u06ec\u0733"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x77

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x57b3

    const v15, 0x5721b6fc

    xor-int/2addr v1, v15

    const v15, -0x50751c30

    goto :goto_b

    :cond_e
    const-string v0, "\u1a73\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x5

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x3333

    const v15, 0x3834a8e

    xor-int/2addr v1, v15

    const v15, -0x427fe4d7

    goto :goto_b

    :sswitch_15
    move/from16 v17, v1

    .line 394
    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_f

    :goto_a
    const-string v0, "\u1a77\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x49

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x3ab

    const v15, 0x2e357d04

    xor-int/2addr v1, v15

    const v15, -0x211a1ad2

    goto :goto_b

    :cond_f
    const-string v0, "\u06db\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x53

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x419

    const v15, 0x64dea576

    xor-int/2addr v1, v15

    const v15, 0x4705e799

    :goto_b
    xor-int/2addr v15, v0

    move v0, v1

    move/from16 v1, v17

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b8be456 -> :sswitch_10
        -0x7603b933 -> :sswitch_7
        -0x70a19b4f -> :sswitch_2
        -0x6e1c1ebf -> :sswitch_14
        -0x6db46d40 -> :sswitch_a
        -0x6b8db977 -> :sswitch_13
        -0x665a6faa -> :sswitch_0
        -0x5e330f52 -> :sswitch_11
        -0x57695c24 -> :sswitch_3
        -0x561d27ce -> :sswitch_13
        -0x50b9c9eb -> :sswitch_5
        -0x4e24becd -> :sswitch_8
        -0x4c4acdb1 -> :sswitch_0
        -0x495614c0 -> :sswitch_15
        -0x43e0faa8 -> :sswitch_3
        -0x32c384f6 -> :sswitch_11
        -0x301057f3 -> :sswitch_1
        -0x24765972 -> :sswitch_4
        -0x2061817b -> :sswitch_c
        -0x1dd9a5aa -> :sswitch_d
        -0x1d6bebe5 -> :sswitch_d
        -0x19055a38 -> :sswitch_12
        -0xfa1e46b -> :sswitch_9
        -0x91cc39c -> :sswitch_4
        -0x6753252 -> :sswitch_b
        -0x1fe7a56 -> :sswitch_e
        0xc70db9 -> :sswitch_6
        0x41415de -> :sswitch_7
        0x1737e322 -> :sswitch_5
        0x185d9781 -> :sswitch_f
        0x1bd8dff7 -> :sswitch_15
        0x1fcb3f22 -> :sswitch_c
        0x2586af34 -> :sswitch_f
        0x2f4d0b7e -> :sswitch_b
        0x32c87796 -> :sswitch_1
        0x3833568c -> :sswitch_e
        0x38648c2c -> :sswitch_6
        0x3c19f064 -> :sswitch_8
        0x41a520dc -> :sswitch_14
        0x5666f480 -> :sswitch_a
        0x5849fc67 -> :sswitch_12
        0x6ac58ff3 -> :sswitch_10
        0x783ce90d -> :sswitch_9
        0x7fe23beb -> :sswitch_2
    .end sparse-switch
.end method

.method public final setClipboardText(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 25

    move-object/from16 v0, p2

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

    const v19, -0x21720179

    sget v20, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v21, Ll/֡᩵;->ۤܳ۬:I

    const-string v22, "\u0736\u1a7a"

    invoke-static/range {v22 .. v22}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v22

    add-int v22, v22, v21

    mul-int/lit8 v22, v22, -0x2f

    xor-int v1, v22, v20

    mul-int/lit16 v1, v1, 0x5a5

    const v24, -0x42540197

    xor-int v1, v1, v24

    const v24, 0x1a9baf87

    xor-int v22, v22, v24

    move-object v6, v5

    move-object/from16 v13, v16

    move/from16 v23, v22

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v22, -0x21720179

    const/16 v24, 0x0

    move-object/from16 v16, v10

    move-object v10, v9

    move-object v9, v8

    const/4 v8, 0x0

    :goto_0
    xor-int v15, v22, v20

    mul-int/lit16 v15, v15, -0x29c1

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v22, v23, v1

    sparse-switch v22, :sswitch_data_0

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-gez v1, :cond_3

    goto :goto_3

    .line 87
    :sswitch_0
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_2

    .line 361
    :sswitch_1
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v1, :cond_0

    :goto_1
    move-object/from16 v0, p1

    goto/16 :goto_c

    :cond_0
    move-object/from16 v0, p1

    goto/16 :goto_8

    :sswitch_2
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    const-string v1, "\u06e7\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x31cf

    const v23, 0x2fb69756

    xor-int v15, v15, v23

    const v23, 0x28b62a2b

    goto/16 :goto_6

    .line 139
    :sswitch_3
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v0, p1

    goto/16 :goto_a

    :cond_3
    :goto_2
    const-string v1, "\u1a79\u06d8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x617f

    const v23, 0x703b6f81

    xor-int v15, v15, v23

    const v23, -0x2efb63d2

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v1, Ll/ۗܰ;->ܶۜ۬:I

    if-gez v1, :cond_4

    goto :goto_1

    :cond_4
    :goto_3
    const-string v1, "\u06e0\u06e0"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x582f

    const v23, -0x162bc36b

    xor-int v15, v15, v23

    const v23, 0x11dcb0e9

    goto/16 :goto_6

    .line 142
    :sswitch_5
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget-boolean v1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v1, :cond_8

    goto :goto_1

    .line 372
    :sswitch_6
    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v1, :cond_5

    goto :goto_1

    :cond_5
    move-object/from16 v0, p1

    goto/16 :goto_9

    :sswitch_7
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    goto :goto_1

    :sswitch_8
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    const/4 v0, 0x0

    return v0

    :sswitch_9
    if-eqz v9, :cond_6

    move-object v6, v9

    goto/16 :goto_4

    :sswitch_a
    move-object/from16 v1, p0

    .line 183
    :try_start_0
    invoke-static {v1, v0}, Ll/ۖ;->ۤ᩸۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v15, "\u073a\u06eb"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    xor-int v15, v15, v20

    xor-int v1, v15, v21

    mul-int/lit16 v1, v1, -0x54a9

    const v23, -0x10001f2a

    xor-int v1, v1, v23

    const v23, -0x2d7cd5f1

    xor-int v23, v15, v23

    goto/16 :goto_0

    :sswitch_b
    const/16 v1, 0x7d

    if-ne v8, v1, :cond_6

    const-string v1, "\u06e8\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x1c53

    const v23, -0x9ebac18

    xor-int v15, v15, v23

    const v23, -0x33df62b2    # -4.210412E7f

    goto/16 :goto_6

    .line 182
    :sswitch_c
    :try_start_1
    invoke-static/range {p2 .. p2}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ll/ۘܽ;->᩷۬ܽ(Ljava/lang/Object;I)C

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v1, "\u06e0\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x7061

    const v23, -0x5edc3b1f

    xor-int v15, v15, v23

    const v23, 0x5f17704f

    goto/16 :goto_6

    :sswitch_d
    const/16 v1, 0x7b

    if-ne v7, v1, :cond_6

    const-string v1, "\u06eb\u06e7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x2d07

    const v23, 0x1f36cdc4

    xor-int v15, v15, v23

    const v23, 0x921595d

    goto/16 :goto_6

    :sswitch_e
    :try_start_2
    invoke-static {v0, v2}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v1, "\u1a73\u1a74"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x5749

    const v23, 0x57287b42

    xor-int v15, v15, v23

    const v23, 0x75475263

    goto/16 :goto_6

    .line 430
    :sswitch_f
    :try_start_3
    invoke-static {v6}, Ll/ۗ᩺;->֡᩹۫(Ljava/lang/Object;)Ll/᩸۠ۧ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_5

    :sswitch_10
    const/4 v1, 0x3

    if-lt v5, v1, :cond_6

    const-string v1, "\u1a73\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x13

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x3345

    const v23, -0xd9cbaa6

    xor-int v15, v15, v23

    const v23, -0x72e3d2fa

    goto/16 :goto_6

    :cond_6
    move-object v6, v0

    :goto_4
    const-string v1, "\u073a\u1a77"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x54ad

    const v23, -0x21e2983a

    xor-int v15, v15, v23

    const v23, 0x3067972d

    goto/16 :goto_6

    .line 182
    :sswitch_11
    :try_start_4
    invoke-static/range {p2 .. p2}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v1, "\u1a76\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x7d2d

    const v23, -0x4b545b47

    xor-int v15, v15, v23

    const v23, -0x32963206

    goto/16 :goto_6

    :sswitch_12
    if-nez v4, :cond_7

    const-string v1, "\u06dc\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x41

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x7aab

    const v23, 0x3df77973

    xor-int v15, v15, v23

    const v23, -0x36df67f9

    goto/16 :goto_6

    .line 428
    :sswitch_13
    :try_start_5
    invoke-static/range {p2 .. p2}, Ll/ۖ᩵;->ۡ֫۠(Ljava/lang/Object;)Z

    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v1, "\u06dc\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0xb

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x1879

    const v23, -0x763d4526

    xor-int v15, v15, v23

    const v23, 0x2c09e58b

    goto/16 :goto_6

    :sswitch_14
    return v3

    :sswitch_15
    const/4 v3, 0x1

    if-eqz v0, :cond_7

    const-string v1, "\u05a8\u1a7b"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x65

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x397b

    const v23, 0x4068a5e1

    xor-int v15, v15, v23

    const v23, -0x12647318

    goto/16 :goto_6

    :cond_7
    :goto_5
    const-string v1, "\u06e0\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x450d

    const v23, 0x411f37b7

    xor-int v15, v15, v23

    const v23, 0x20c7526e

    goto :goto_6

    .line 430
    :sswitch_16
    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7e46b382

    xor-int/2addr v0, v1

    .line 435
    invoke-static {v0}, Ll/ۖ᩹;->ܳܽ֫(I)Ll/᩸۠ۧ;

    return v2

    .line 430
    :sswitch_17
    invoke-static {v13, v14, v12, v11}, Ll/ۗ֫;->᩸ᩴ᩶([SIII)Ljava/lang/String;

    move-result-object v10

    .line 254
    sget v1, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v1, :cond_9

    :cond_8
    const-string v1, "\u1a79\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, 0x25

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x3fb9

    const v23, 0x1e637a67

    xor-int v15, v15, v23

    const v23, 0x1b9abb40

    goto :goto_6

    :cond_9
    const-string v1, "\u1a7b\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x7419

    const v23, -0x2a44649c

    xor-int v15, v15, v23

    const v23, 0x34b0c51e

    goto :goto_6

    .line 430
    :sswitch_18
    sget-object v13, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    const/16 v14, 0x6b

    const/4 v12, 0x3

    .line 14
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v1

    if-nez v1, :cond_b

    :cond_a
    const-string v1, "\u1a79\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x79d7

    const v23, 0x1395fd6e

    xor-int v15, v15, v23

    const v23, -0x2ee34521

    goto :goto_6

    :cond_b
    const-string v1, "\u1a79\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x361

    const v23, 0x2649ec01

    xor-int v15, v15, v23

    const v23, 0x251888f1

    :goto_6
    xor-int v23, v1, v23

    goto/16 :goto_e

    .line 427
    :sswitch_19
    :try_start_6
    invoke-direct/range {p0 .. p0}, Ll/᩵᩺֫;->ۙ()Landroid/content/ClipboardManager;

    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/4 v15, 0x0

    move-object/from16 v0, p1

    :try_start_7
    invoke-static {v15, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v15

    invoke-virtual {v1, v15}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    const-string v1, "\u073a\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x2ac7

    const v23, 0x3847a256

    xor-int v15, v15, v23

    const v23, -0x79e2ff75

    goto/16 :goto_d

    :catchall_0
    move-object/from16 v0, p1

    :catchall_1
    const-string v1, "\u06d7\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0xd

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x5b83

    const v23, -0x4a9f4052

    xor-int v15, v15, v23

    const v23, -0x2a0ef7a1

    goto/16 :goto_d

    :sswitch_1a
    move-object/from16 v0, p1

    const/4 v2, 0x0

    const-string v1, "\u05ab\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x3c95

    const v23, 0x2955753c

    xor-int v15, v15, v23

    const v23, -0x766b6aae

    goto/16 :goto_d

    :sswitch_1b
    move-object/from16 v0, p1

    const/16 v1, 0x17e8

    const/16 v11, 0x17e8

    goto :goto_7

    :sswitch_1c
    move-object/from16 v0, p1

    const v1, 0xd767

    const v11, 0xd767

    :goto_7
    const-string v1, "\u06e1\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x2491

    const v23, 0xd3f5ab8

    xor-int v15, v15, v23

    const v23, 0x2318e0d6

    goto/16 :goto_d

    :sswitch_1d
    move-object/from16 v0, p1

    add-int v1, v19, v24

    mul-int v1, v1, v1

    sub-int v1, v18, v1

    if-lez v1, :cond_c

    const-string v1, "\u073d\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x3d3d

    const v23, 0x6279f8d9

    xor-int v15, v15, v23

    const v23, 0x30971000

    goto/16 :goto_d

    :cond_c
    const-string v1, "\u1a76\u06e7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x6af5

    const v23, -0x44e3ecc2

    xor-int v15, v15, v23

    const v23, 0x7d66d79d

    goto/16 :goto_d

    :sswitch_1e
    move-object/from16 v0, p1

    const/16 v24, 0x1

    .line 230
    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v1, :cond_d

    :goto_8
    const-string v1, "\u0736\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x8d5

    const v23, 0x119a0ded

    xor-int v15, v15, v23

    const v23, -0x62720560

    goto/16 :goto_d

    :cond_d
    const-string v1, "\u06ec\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x49

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x2c33

    const v23, -0x2c33e90f

    xor-int v15, v15, v23

    const v23, -0x4442a0f5

    goto/16 :goto_d

    :sswitch_1f
    move-object/from16 v0, p1

    mul-int v1, v19, v17

    add-int/lit8 v18, v1, 0x1

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v1

    if-gtz v1, :cond_e

    goto/16 :goto_c

    :cond_e
    const-string v1, "\u0733\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x3d11

    const v23, -0x271dbd95

    xor-int v15, v15, v23

    const v23, -0x39c6513d

    goto/16 :goto_d

    :sswitch_20
    move-object/from16 v0, p1

    const/16 v1, 0x6a

    aget-short v19, v16, v1

    const/16 v17, 0x2

    .line 6
    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v1, :cond_f

    goto/16 :goto_b

    :cond_f
    const-string v1, "\u05ab\u06d9"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, -0x51

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x3fab

    const v23, 0x1ef1be49

    xor-int v15, v15, v23

    const v23, -0x32e2438f

    goto/16 :goto_d

    :sswitch_21
    move-object/from16 v0, p1

    sget-object v16, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    .line 208
    sget v1, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v1, :cond_10

    :goto_9
    const-string v1, "\u06e7\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x51

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x5feb

    const v23, -0x67814df8

    xor-int v15, v15, v23

    const v23, -0x52437870

    goto/16 :goto_d

    :cond_10
    const-string v1, "\u06d8\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, 0x23

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x30eb

    const v23, -0xc817a37

    xor-int v15, v15, v23

    const v23, 0x15856d7d

    goto/16 :goto_d

    :sswitch_22
    move-object/from16 v0, p1

    .line 104
    sget v1, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v1, :cond_11

    :goto_a
    const-string v1, "\u06d8\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x5235

    const v23, -0x34f8c963    # -8861341.0f

    xor-int v15, v15, v23

    const v23, -0x4f17f22

    goto/16 :goto_d

    :cond_11
    const-string v1, "\u1a77\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, 0x25

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x7a6b

    const v23, -0x3c42c8dd

    xor-int v15, v15, v23

    const v23, -0x256c0529

    goto/16 :goto_d

    :sswitch_23
    move-object/from16 v0, p1

    .line 389
    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v1, :cond_12

    :goto_b
    const-string v1, "\u06e0\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x1d9

    const v23, -0x3b007099

    xor-int v15, v15, v23

    const v23, -0x744c18f8

    goto :goto_d

    :cond_12
    const-string v1, "\u06df\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0xff

    const v23, -0x45dc844e

    xor-int v15, v15, v23

    const v23, 0x6c20ed3c

    goto :goto_d

    :sswitch_24
    move-object/from16 v0, p1

    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v1

    if-eqz v1, :cond_13

    goto :goto_c

    :cond_13
    const-string v1, "\u1a73\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x44cb

    const v23, 0x42ca1d7d

    xor-int v15, v15, v23

    const v23, -0xd6ea204

    goto :goto_d

    :sswitch_25
    move-object/from16 v0, p1

    .line 65
    sget v1, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v1, :cond_14

    :goto_c
    const-string v1, "\u06e2\u06e7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x31

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x4be5

    const v23, 0x4726d7ce

    xor-int v15, v15, v23

    const v23, -0x5c1cd991

    goto :goto_d

    :cond_14
    const-string v1, "\u0730\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x59b5

    const v23, -0x4f450679

    xor-int v15, v15, v23

    const v23, -0x1b4a60ea

    :goto_d
    xor-int v23, v1, v23

    move-object/from16 v0, p2

    :goto_e
    move v1, v15

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7dfb4892 -> :sswitch_16
        -0x7c0bee0d -> :sswitch_c
        -0x7ac64a59 -> :sswitch_22
        -0x79df3596 -> :sswitch_1b
        -0x770feda0 -> :sswitch_13
        -0x72e01ccb -> :sswitch_10
        -0x6c5371c7 -> :sswitch_17
        -0x6aa3adb8 -> :sswitch_8
        -0x6a9ba855 -> :sswitch_2
        -0x6a50fe70 -> :sswitch_1a
        -0x698f4b45 -> :sswitch_14
        -0x67ffc1af -> :sswitch_25
        -0x64f606e5 -> :sswitch_5
        -0x60566cfd -> :sswitch_1d
        -0x5d9cb058 -> :sswitch_3
        -0x5a78449d -> :sswitch_25
        -0x547df556 -> :sswitch_0
        -0x526e1d2b -> :sswitch_11
        -0x504225ec -> :sswitch_12
        -0x4d6846e2 -> :sswitch_21
        -0x454d075e -> :sswitch_f
        -0x4319d96c -> :sswitch_21
        -0x40d4862f -> :sswitch_e
        -0x3f789d4a -> :sswitch_e
        -0x3c0cded5 -> :sswitch_d
        -0x394fc082 -> :sswitch_4
        -0x38f99e3a -> :sswitch_11
        -0x38dc0866 -> :sswitch_1e
        -0x343d1d85 -> :sswitch_1b
        -0x31303a6a -> :sswitch_8
        -0x26dbf7f0 -> :sswitch_18
        -0x204712d3 -> :sswitch_1f
        -0x1e61fe9d -> :sswitch_19
        -0x1a94806b -> :sswitch_a
        -0x190a5ced -> :sswitch_22
        -0x1670a49d -> :sswitch_d
        -0x165f6e92 -> :sswitch_b
        -0x1095fa5e -> :sswitch_20
        -0x98a5826 -> :sswitch_20
        -0x84f86a2 -> :sswitch_1c
        0x166a83b -> :sswitch_0
        0x341ca8d -> :sswitch_19
        0x4dcabb5 -> :sswitch_6
        0x9dfe17c -> :sswitch_23
        0xcc8739e -> :sswitch_15
        0x15c9afb8 -> :sswitch_16
        0x1aa51442 -> :sswitch_7
        0x1e4991bd -> :sswitch_1f
        0x205c1a8c -> :sswitch_18
        0x24c1add0 -> :sswitch_12
        0x25cf796c -> :sswitch_15
        0x2b084451 -> :sswitch_13
        0x2b3a2140 -> :sswitch_2
        0x2babe388 -> :sswitch_3
        0x2c91220a -> :sswitch_1d
        0x3d5a4db3 -> :sswitch_24
        0x43163982 -> :sswitch_b
        0x46f5f82c -> :sswitch_a
        0x4d66d8f7 -> :sswitch_14
        0x4fa8eb3e -> :sswitch_17
        0x52025b78 -> :sswitch_24
        0x5bd232a3 -> :sswitch_4
        0x5f4d0783 -> :sswitch_1
        0x631c8645 -> :sswitch_5
        0x6434f1d7 -> :sswitch_9
        0x67a8bc65 -> :sswitch_1
        0x699b2d86 -> :sswitch_c
        0x6abf8f47 -> :sswitch_9
        0x6b42cd24 -> :sswitch_1a
        0x708e75e5 -> :sswitch_1e
        0x739ed2c2 -> :sswitch_6
        0x753fcd4a -> :sswitch_f
        0x7847f322 -> :sswitch_23
        0x7bddcbf5 -> :sswitch_10
        0x7c0d1892 -> :sswitch_1c
        0x7d92fb60 -> :sswitch_7
    .end sparse-switch
.end method

.method public final showToast(Ljava/lang/CharSequence;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x467d1424

    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    const-string v5, "\u1a75\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7fed

    const v7, -0x5c2fd078

    xor-int/2addr v6, v7

    const v7, 0x58bd345b

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0xf4b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 246
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v5

    if-eqz v5, :cond_b

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v5, :cond_c

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v5, "\u05ab\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x2d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x19ef

    const v7, -0x24f9834e

    xor-int/2addr v6, v7

    const v7, -0x71009d40

    goto :goto_0

    .line 363
    :sswitch_2
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget v5, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v5, :cond_1

    goto/16 :goto_5

    .line 362
    :sswitch_3
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    goto/16 :goto_5

    .line 341
    :sswitch_4
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    return-void

    .line 172
    :sswitch_5
    invoke-static {p0, v1}, Ll/֨ۖ;->᩸ۙۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    goto/16 :goto_3

    :sswitch_6
    const/4 v5, 0x1

    .line 0
    invoke-static {v5, v1}, Ll/ۗ᩶;->ۛ᩹ᩳ(ILjava/lang/Object;)C

    move-result v5

    const/16 v6, 0x7d

    if-ne v5, v6, :cond_4

    const-string v5, "\u06e7\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x19

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2885

    const v7, 0x3ff7259

    xor-int/2addr v6, v7

    const v7, -0x5c80dee5

    goto :goto_0

    :sswitch_7
    const/4 v5, 0x0

    .line 171
    invoke-static {v1, v5}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v5

    const/16 v6, 0x7b

    if-ne v5, v6, :cond_4

    const-string v5, "\u06db\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4d61

    const v7, 0x674f888c

    xor-int/2addr v6, v7

    const v7, -0x30644c7c

    goto/16 :goto_0

    :sswitch_8
    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v5

    const/4 v6, 0x3

    if-lt v5, v6, :cond_4

    const-string v5, "\u05ab\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x37

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1413

    const v7, -0x4644e5a9

    xor-int/2addr v6, v7

    const v7, -0x65889941

    goto/16 :goto_0

    .line 443
    :sswitch_9
    sget-object v5, Ll/ۚۛ֫;->ܳ:Ll/ܺ᩺֫;

    .line 86
    new-instance v5, Ll/ۙ۠᩸;

    .line 331
    sget v6, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v6, :cond_2

    :cond_1
    :goto_2
    const-string v5, "\u1a73\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x18f7

    const v7, -0x391a7918

    xor-int/2addr v6, v7

    const v7, 0x3660a4e

    goto/16 :goto_0

    :cond_2
    const/4 v6, 0x4

    .line 3
    sget v7, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v7, :cond_3

    goto/16 :goto_4

    .line 86
    :cond_3
    invoke-direct {v5, v6, v0}, Ll/ۙ۠᩸;-><init>(ILjava/lang/Object;)V

    invoke-static {v5}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 171
    :sswitch_a
    instance-of v5, p1, Ljava/lang/String;

    if-eqz v5, :cond_4

    const-string v5, "\u1a75\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7357

    const v7, 0x53306ac4

    xor-int/2addr v6, v7

    const v7, -0x22bdb447

    goto/16 :goto_0

    :cond_4
    move-object v0, p1

    :goto_3
    const-string v5, "\u1a78\u1a73"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x45

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x64b9

    const v7, 0x6f8b7f1d

    xor-int/2addr v6, v7

    const v7, -0x7ef73793

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v5, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v5, "\u06db\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1897

    const v7, -0x480ede82

    xor-int/2addr v6, v7

    const v7, 0x50e99d96

    goto/16 :goto_0

    .line 317
    :sswitch_c
    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_6

    goto :goto_4

    :cond_6
    const-string v5, "\u073d\u06eb"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x25

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1f3

    const v7, 0x51d97023

    xor-int/2addr v6, v7

    const v7, 0x15b655b3

    goto/16 :goto_0

    .line 380
    :sswitch_d
    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v5, :cond_7

    :goto_4
    const-string v5, "\u06dc\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x47

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x37f1

    const v7, -0x23834fb2

    xor-int/2addr v6, v7

    const v7, -0x2d713cdf

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u1a7b\u06e8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4fcb

    const v7, -0x43294fb3

    xor-int/2addr v6, v7

    const v7, 0x16ce084e

    goto/16 :goto_0

    .line 126
    :sswitch_e
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v5, "\u1a74\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5cbf

    const v7, -0x566cfbb5

    xor-int/2addr v6, v7

    const v7, -0x1302633c

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v5, :cond_9

    goto :goto_5

    :cond_9
    const-string v5, "\u1a79\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x61

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6a31

    const v7, 0x10e8d7f0

    xor-int/2addr v6, v7

    const v7, -0x1527b5f5

    goto/16 :goto_0

    .line 33
    :sswitch_10
    sget v5, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v5, :cond_a

    goto :goto_6

    :cond_a
    const-string v5, "\u05a1\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6a71

    const v7, -0x6bc41a83

    xor-int/2addr v6, v7

    const v7, -0x70013932

    goto/16 :goto_0

    :goto_5
    const-string v5, "\u0730\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x29d1

    const v7, -0x7d28b8e1

    xor-int/2addr v6, v7

    const v7, -0x2889c835

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u1a77\u06dc"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0xf

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x718b

    const v7, -0x1cdc4ac5

    xor-int/2addr v6, v7

    const v7, -0x7e985d9a

    goto/16 :goto_0

    :sswitch_11
    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_6
    const-string v5, "\u06e4\u05a8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x74f5

    const v7, 0x5e748d01

    xor-int/2addr v6, v7

    const v7, -0x7bb5e02

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u073a\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x23f5

    const v7, 0x30e5bbbd

    xor-int/2addr v6, v7

    const v7, -0x1636bbd8

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7dfcc696 -> :sswitch_4
        -0x7af97a87 -> :sswitch_5
        -0x706829ea -> :sswitch_a
        -0x6deca36f -> :sswitch_3
        -0x6953d114 -> :sswitch_8
        -0x62dd1280 -> :sswitch_2
        -0x5e1e412e -> :sswitch_8
        -0x58ec0673 -> :sswitch_d
        -0x3a65ac96 -> :sswitch_9
        -0x382c5612 -> :sswitch_2
        -0x364c5c44 -> :sswitch_c
        -0x2fec62ac -> :sswitch_e
        -0x25f9e31e -> :sswitch_10
        -0x2278495e -> :sswitch_0
        -0x13216835 -> :sswitch_b
        -0x2c1af18 -> :sswitch_0
        -0x1228934 -> :sswitch_d
        0xc6aa5f9 -> :sswitch_10
        0x10e5f803 -> :sswitch_6
        0x1343e799 -> :sswitch_c
        0x13532495 -> :sswitch_11
        0x179b295c -> :sswitch_6
        0x181c37f7 -> :sswitch_7
        0x273aea85 -> :sswitch_1
        0x35845c58 -> :sswitch_7
        0x36936b45 -> :sswitch_5
        0x3844dc04 -> :sswitch_e
        0x42cfa0c1 -> :sswitch_9
        0x43b64e41 -> :sswitch_f
        0x48881aae -> :sswitch_3
        0x4b924cce -> :sswitch_a
        0x5080e390 -> :sswitch_f
        0x58e0d12e -> :sswitch_4
        0x76c21afe -> :sswitch_11
        0x7e6a251f -> :sswitch_1
        0x7f7a7873 -> :sswitch_b
    .end sparse-switch
.end method

.method public final varargs showToast(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

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

    const v16, 0x3b97489b

    sget v17, Ll/ۖ;->ܿۚ֡:I

    sget v18, Ll/ۗۖ;->ۙ᩶֨:I

    const-string v19, "\u05a8\u06db"

    invoke-static/range {v19 .. v19}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v18

    xor-int v3, v19, v17

    mul-int/lit16 v3, v3, 0x5fdd

    const v21, 0x45782c03

    xor-int v3, v3, v21

    const v21, 0x5a849bbd

    xor-int v19, v19, v21

    const/16 v20, 0x0

    :goto_0
    xor-int v1, v16, v17

    mul-int/lit16 v1, v1, 0x3e35

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v3

    xor-int v16, v19, v1

    sparse-switch v16, :sswitch_data_0

    move-object/from16 v1, p1

    .line 238
    sget v0, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v0, :cond_13

    goto/16 :goto_c

    .line 22
    :sswitch_0
    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v1, :cond_6

    goto :goto_1

    .line 41
    :sswitch_1
    sget v1, Ll/֫֡;->֫ۙۖ:I

    if-gtz v1, :cond_0

    goto :goto_4

    :cond_0
    move-object/from16 v1, p1

    goto/16 :goto_c

    .line 318
    :sswitch_2
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_3

    :cond_1
    :goto_1
    const-string v1, "\u1a77\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x37

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x29b9

    const v19, 0x119dd4a0

    xor-int v3, v3, v19

    const v19, -0x7a9a2527

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v1, :cond_8

    :goto_2
    move-object/from16 v1, p1

    goto/16 :goto_b

    :sswitch_4
    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-nez v1, :cond_2

    goto :goto_4

    :cond_2
    :goto_3
    const-string v1, "\u05ab\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x7ff7

    const v19, 0x17b5aafa

    xor-int v3, v3, v19

    const v19, -0x684244b6

    goto/16 :goto_6

    :sswitch_5
    sget v1, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v1, :cond_4

    :cond_3
    move-object/from16 v1, p1

    goto/16 :goto_d

    :cond_4
    :goto_4
    const-string v1, "\u1a76\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x4aa1

    const v19, -0x70edc5b0

    xor-int v3, v3, v19

    const v19, 0x4fa71014

    goto/16 :goto_6

    .line 435
    :sswitch_6
    sget v1, Ll/᩺;->۫۬۫:I

    if-gtz v1, :cond_3

    goto :goto_2

    .line 51
    :sswitch_7
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    goto :goto_2

    .line 263
    :sswitch_8
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    return-void

    .line 453
    :sswitch_9
    aput-object v15, v2, v10

    goto/16 :goto_5

    .line 451
    :sswitch_a
    invoke-static {v0, v14}, Ll/֨ۖ;->᩸ۙۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_5

    const-string v1, "\u06df\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x7db5

    const v19, -0xf19d157

    xor-int v3, v3, v19

    const v19, -0x310b7211

    goto/16 :goto_6

    .line 0
    :sswitch_b
    invoke-static {v7, v14}, Ll/ۗ᩶;->ۛ᩹ᩳ(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v4, :cond_5

    const-string v1, "\u06d6\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x43a1

    const v19, -0x7e86f51d

    xor-int v3, v3, v19

    const v19, 0x79db943f

    goto/16 :goto_6

    .line 450
    :sswitch_c
    invoke-static {v14, v8}, Ll/ۘܽ;->᩷۬ܽ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v5, :cond_5

    const-string v1, "\u06e7\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x3

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x10eb

    const v19, 0x3d28badb

    xor-int v3, v3, v19

    const v19, -0x16ef03e9

    goto/16 :goto_6

    .line 172
    :sswitch_d
    invoke-static {v0, v9}, Ll/ۖ;->ۤ᩸۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    move-object v13, v1

    move-object/from16 v1, p1

    goto/16 :goto_9

    .line 450
    :sswitch_e
    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v6, :cond_5

    const-string v1, "\u1a7b\u06e0"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x75

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x1991

    const v19, -0x7621f397

    xor-int v3, v3, v19

    const v19, 0x669857c5

    goto/16 :goto_6

    :sswitch_f
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p1

    goto/16 :goto_7

    .line 0
    :sswitch_10
    invoke-static {v7, v9}, Ll/ۗ᩶;->ۛ᩹ᩳ(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v4, :cond_a

    const-string v1, "\u06e7\u0733"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x7f

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x357b

    const v19, -0x462f918f

    xor-int v3, v3, v19

    const v19, 0x1fa3c842

    goto/16 :goto_6

    .line 450
    :sswitch_11
    aget-object v12, v2, v10

    instance-of v1, v12, Ljava/lang/String;

    if-eqz v1, :cond_5

    const-string v1, "\u1a75\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x69

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x2253

    const v19, 0x3d31c5a

    xor-int v3, v3, v19

    const v19, -0x5308102

    goto/16 :goto_6

    :cond_5
    :goto_5
    const-string v1, "\u1a76\u073a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x5a45

    const v19, -0x3514788b    # -7717818.5f

    xor-int v3, v3, v19

    const v19, 0x2bdf9129

    goto/16 :goto_6

    .line 86
    :sswitch_12
    new-instance v1, Ll/ۙ۠᩸;

    .line 139
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_7

    :cond_6
    const-string v1, "\u06e1\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x1a91

    const v19, 0x41f03705

    xor-int v3, v3, v19

    const v19, 0x1bfb1886

    goto/16 :goto_6

    :cond_7
    const/4 v2, 0x4

    .line 86
    invoke-direct {v1, v2, v11}, Ll/ۙ۠᩸;-><init>(ILjava/lang/Object;)V

    invoke-static {v1}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 457
    :sswitch_13
    invoke-static {v13}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ll/᩵᩺֫;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 458
    sget-object v1, Ll/ۚۛ֫;->ܳ:Ll/ܺ᩺֫;

    .line 216
    sget v1, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v1, :cond_9

    :cond_8
    const-string v1, "\u1a78\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x4ecf

    const v19, -0x4426aeef

    xor-int v3, v3, v19

    const v19, 0x5230d8c2

    goto :goto_6

    :cond_9
    const-string v1, "\u1a7a\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x69

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x2efb

    const v19, 0x700d32fd

    xor-int v3, v3, v19

    const v19, 0x506366b4

    goto :goto_6

    .line 171
    :sswitch_14
    invoke-static {v9, v8}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v5, :cond_a

    const-string v1, "\u06e4\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x75

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x4f5

    const v19, 0x4c560fa2    # 5.6114824E7f

    xor-int v3, v3, v19

    const v19, -0x4118c1a6

    goto :goto_6

    :cond_a
    move-object/from16 v1, p1

    goto/16 :goto_8

    .line 449
    :sswitch_15
    array-length v1, v2

    if-ge v10, v1, :cond_b

    const-string v1, "\u05ab\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x7247

    const v19, 0x2bcb5879

    xor-int v3, v3, v19

    const v19, -0x77f6a19e

    goto :goto_6

    :cond_b
    const-string v1, "\u1a79\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x13e5

    const v19, -0x26fe0fc9

    xor-int v3, v3, v19

    const v19, -0x7a045012

    :goto_6
    xor-int v19, v1, v19

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v1, p1

    .line 171
    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    invoke-static {v9}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v3

    if-lt v3, v6, :cond_c

    const-string v3, "\u06e1\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v18

    mul-int/lit8 v3, v3, 0x21

    xor-int v0, v3, v17

    mul-int/lit16 v0, v0, -0x642f

    const v19, 0x2997e69f

    xor-int v0, v0, v19

    const v19, -0x2e749fc5

    xor-int v19, v3, v19

    move v3, v0

    goto/16 :goto_f

    :sswitch_17
    move-object/from16 v1, p1

    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_7
    const-string v0, "\u06d6\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x11

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x4fa7

    const v19, -0x6c00e7b7

    xor-int v3, v3, v19

    const v19, -0x327aea4a

    goto/16 :goto_e

    :sswitch_18
    move-object/from16 v1, p1

    const/16 v5, 0x7b

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v20, :cond_c

    const-string v0, "\u06e2\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x3b

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x591f

    const v19, -0x542fa53d

    xor-int v3, v3, v19

    const v19, 0x1589ccc8

    goto/16 :goto_e

    :cond_c
    :goto_8
    move-object v13, v1

    :goto_9
    const-string v0, "\u06d8\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x4959

    const v19, -0x4d006935

    xor-int v3, v3, v19

    const v19, -0x9471c23

    goto/16 :goto_e

    :sswitch_19
    move-object/from16 v1, p1

    instance-of v0, v1, Ljava/lang/String;

    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_d

    move/from16 v20, v0

    const/16 v4, 0x7d

    goto :goto_a

    :cond_d
    const-string v3, "\u06eb\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v18

    mul-int/lit16 v4, v4, 0x7035

    const v20, 0x23625536

    xor-int v4, v4, v20

    const v20, -0x5391e8a2

    xor-int v3, v3, v20

    move/from16 v20, v0

    move/from16 v19, v3

    move v3, v4

    const/16 v4, 0x7d

    goto/16 :goto_f

    :sswitch_1a
    move-object/from16 v1, p1

    .line 247
    sget v0, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v0, :cond_e

    goto :goto_a

    :cond_e
    const-string v0, "\u05a8\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x209b

    const v19, 0x41a6e271

    xor-int v3, v3, v19

    const v19, 0x6bf8fd88

    goto/16 :goto_e

    :sswitch_1b
    move-object/from16 v1, p1

    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_f

    :goto_a
    const-string v0, "\u1a73\u06da"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0xeb7

    const v19, -0x45209511

    xor-int v3, v3, v19

    const v19, -0x139e061c

    goto/16 :goto_e

    :cond_f
    const-string v0, "\u05a1\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x66e9

    const v19, 0x5eebec75    # 8.5000457E18f

    xor-int v3, v3, v19

    const v19, 0x7ec19ea6

    goto/16 :goto_e

    :sswitch_1c
    move-object/from16 v1, p1

    sget v0, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v0, :cond_10

    goto :goto_b

    :cond_10
    const-string v0, "\u1a7b\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x5c01

    const v19, -0x537b0c79

    xor-int v3, v3, v19

    const v19, 0x2d171de9    # 8.589998E-12f

    goto/16 :goto_e

    :sswitch_1d
    move-object/from16 v1, p1

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_b

    :cond_11
    const-string v0, "\u06da\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x3547

    const v19, 0x262e71eb

    xor-int v3, v3, v19

    const v19, 0x54940ce8

    goto/16 :goto_e

    :sswitch_1e
    move-object/from16 v1, p1

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v0

    if-nez v0, :cond_12

    :goto_b
    const-string v0, "\u0730\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x7bc5

    const v19, 0x21da5570

    xor-int v3, v3, v19

    const v19, 0xf710181

    goto/16 :goto_e

    :cond_12
    const-string v0, "\u073d\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x7d

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x4ba7

    const v19, -0x7cce93ee

    xor-int v3, v3, v19

    const v19, 0x660050e5

    goto :goto_e

    :goto_c
    const-string v0, "\u06e2\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x1d

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x195f

    const v19, 0x1b45e1f6

    xor-int v3, v3, v19

    const v19, -0x2520d928

    goto :goto_e

    :cond_13
    const-string v0, "\u1a7a\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x3a77

    const v19, 0x8d4a65f

    xor-int v3, v3, v19

    const v19, 0x41d7d896

    goto :goto_e

    :sswitch_1f
    move-object/from16 v1, p1

    .line 388
    sget v0, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v0, :cond_14

    :goto_d
    const-string v0, "\u1a7a\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x19

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x829

    const v19, -0x5f286507

    xor-int v3, v3, v19

    const v19, -0x4295895e

    goto :goto_e

    :cond_14
    const-string v0, "\u06d7\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x59

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x2809

    const v19, -0x43675f3e

    xor-int v3, v3, v19

    const v19, 0x4608c520    # 8753.281f

    :goto_e
    xor-int v19, v0, v19

    :goto_f
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x70999933 -> :sswitch_8
        -0x6fd5d412 -> :sswitch_16
        -0x6959534f -> :sswitch_9
        -0x69553479 -> :sswitch_b
        -0x5a209d43 -> :sswitch_0
        -0x5a159382 -> :sswitch_d
        -0x5434cb5c -> :sswitch_f
        -0x52fc47d4 -> :sswitch_1b
        -0x52cdb130 -> :sswitch_12
        -0x5115083a -> :sswitch_17
        -0x4ede49cd -> :sswitch_8
        -0x4ca5aebf -> :sswitch_14
        -0x3fcb5d78 -> :sswitch_7
        -0x3e521bb4 -> :sswitch_10
        -0x3d850c26 -> :sswitch_e
        -0x3b21fd19 -> :sswitch_2
        -0x30e0b81c -> :sswitch_d
        -0x301008a5 -> :sswitch_5
        -0x2fa49135 -> :sswitch_11
        -0x2eafcf66 -> :sswitch_1a
        -0x2ddbf7d0 -> :sswitch_4
        -0x2856f2eb -> :sswitch_4
        -0x26c8658f -> :sswitch_1d
        -0x252bb4b9 -> :sswitch_1f
        -0x230538ea -> :sswitch_1b
        -0x1899434d -> :sswitch_17
        0x10a583f -> :sswitch_3
        0x2d6d708 -> :sswitch_1f
        0x5ef0a03 -> :sswitch_13
        0x7796712 -> :sswitch_11
        0x863b16a -> :sswitch_c
        0xcc62c69 -> :sswitch_1c
        0xe3e0929 -> :sswitch_15
        0x1024d1ff -> :sswitch_3
        0x128a37e3 -> :sswitch_1d
        0x1522231f -> :sswitch_c
        0x17f6a42c -> :sswitch_6
        0x19861e10 -> :sswitch_1e
        0x1ba735ad -> :sswitch_a
        0x216f5edc -> :sswitch_19
        0x2189b472 -> :sswitch_a
        0x246cb30b -> :sswitch_2
        0x2693d177 -> :sswitch_1a
        0x2b49d353 -> :sswitch_6
        0x2c7954f8 -> :sswitch_18
        0x308be1fd -> :sswitch_7
        0x33aab132 -> :sswitch_19
        0x34babfb9 -> :sswitch_10
        0x4121a23a -> :sswitch_1c
        0x43a93e2b -> :sswitch_1
        0x4876526e -> :sswitch_18
        0x4c0b635e -> :sswitch_15
        0x5a316a3d -> :sswitch_14
        0x5d4e21e9 -> :sswitch_e
        0x68d62d59 -> :sswitch_12
        0x69323f79 -> :sswitch_5
        0x6941c826 -> :sswitch_f
        0x69912836 -> :sswitch_1e
        0x6998ca32 -> :sswitch_1
        0x6c755d2a -> :sswitch_0
        0x6ce6b183 -> :sswitch_13
        0x6e02be65 -> :sswitch_9
        0x777ab88d -> :sswitch_16
        0x7bf82d92 -> :sswitch_b
    .end sparse-switch
.end method

.method public final showToastL(Ljava/lang/CharSequence;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x43c5be40

    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v6, "\u1a7b\u1a78"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6b8d

    const v8, 0x2351150e

    xor-int/2addr v7, v8

    const v8, -0x61dcc6e4

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x3513

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 334
    sget v6, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v6, :cond_9

    goto/16 :goto_4

    :sswitch_0
    sget v6, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v6, :cond_a

    goto/16 :goto_2

    .line 461
    :sswitch_1
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget v6, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v6, :cond_8

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget v6, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v6, :cond_0

    goto/16 :goto_6

    .line 307
    :sswitch_3
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    goto/16 :goto_6

    .line 141
    :sswitch_4
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    return-void

    .line 172
    :sswitch_5
    invoke-static {p0, v2}, Ll/֨ۖ;->᩸ۙۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    goto/16 :goto_3

    :sswitch_6
    const/4 v6, 0x1

    .line 0
    invoke-static {v6, v2}, Ll/ۗ᩶;->ۛ᩹ᩳ(ILjava/lang/Object;)C

    move-result v6

    const/16 v7, 0x7d

    if-ne v6, v7, :cond_3

    const-string v6, "\u073d\u06e2"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x32cd

    const v8, -0x7176c66f

    xor-int/2addr v7, v8

    const v8, 0x7c3e8fec

    goto :goto_0

    .line 171
    :sswitch_7
    invoke-static {v2, v0}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v6

    const/16 v7, 0x7b

    if-ne v6, v7, :cond_3

    const-string v6, "\u1a7b\u0736"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x69

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xdf9

    const v8, -0x2898486c

    xor-int/2addr v7, v8

    const v8, -0x4392b22d

    goto :goto_0

    :sswitch_8
    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v6

    const/4 v7, 0x3

    if-lt v6, v7, :cond_3

    const-string v6, "\u1a76\u06e4"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x41

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x11f3

    const v8, -0x704b362d

    xor-int/2addr v7, v8

    const v8, 0xa7335d7

    goto/16 :goto_0

    .line 464
    :sswitch_9
    sget-object v6, Ll/ۚۛ֫;->ܳ:Ll/ܺ᩺֫;

    .line 90
    new-instance v6, Ll/۫ۛ֫;

    sget v7, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v7, :cond_1

    :cond_0
    :goto_2
    const-string v6, "\u05a1\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x53

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x85

    const v8, -0x1052e3c3

    xor-int/2addr v7, v8

    const v8, 0x6f3205a5

    goto/16 :goto_0

    :cond_1
    invoke-direct {v6, v0, v1}, Ll/۫ۛ֫;-><init>(ILjava/lang/Object;)V

    invoke-static {v6}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 171
    :sswitch_a
    instance-of v0, p1, Ljava/lang/String;

    const/4 v6, 0x0

    if-eqz v0, :cond_2

    const-string v0, "\u06d9\u06d9"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v5

    mul-int/lit8 v0, v0, 0x7f

    xor-int v7, v0, v4

    mul-int/lit16 v7, v7, 0x77bd

    const v8, 0x23494f1c

    xor-int/2addr v7, v8

    const v8, 0x57c84301

    xor-int/2addr v0, v8

    move v6, v0

    const/4 v0, 0x0

    goto/16 :goto_1

    :cond_2
    const/4 v0, 0x0

    :cond_3
    move-object v1, p1

    :goto_3
    const-string v6, "\u073f\u06d8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x25

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4bd

    const v8, -0x297037d3

    xor-int/2addr v7, v8

    const v8, 0xffe2f75

    goto/16 :goto_0

    .line 323
    :sswitch_b
    sget v6, Ll/֫֡;->֫ۙۖ:I

    if-gtz v6, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v6, "\u06e2\u1a7a"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x7f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4053

    const v8, -0x4491a892

    xor-int/2addr v7, v8

    const v8, 0xdac5565

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v6

    if-gtz v6, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v6, "\u1a76\u05ab"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6849

    const v8, -0x41bdadaf

    xor-int/2addr v7, v8

    const v8, -0x61ce9182

    goto/16 :goto_0

    .line 384
    :sswitch_d
    sget v6, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v6, :cond_6

    goto :goto_5

    :cond_6
    const-string v6, "\u06d6\u06df"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x69

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6045

    const v8, -0x131b6995

    xor-int/2addr v7, v8

    const v8, -0x7421bcf2

    goto/16 :goto_0

    .line 235
    :sswitch_e
    sget v6, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v6, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v6, "\u06db\u06dc"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4421

    const v8, -0x6c8a29b5

    xor-int/2addr v7, v8

    const v8, -0x5f8c2ae6

    goto/16 :goto_0

    :cond_8
    :goto_4
    const-string v6, "\u1a78\u1a77"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x69

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x40fb

    const v8, -0x622bf298

    xor-int/2addr v7, v8

    const v8, 0x703a3db7

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06e8\u06e7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7d5

    const v8, -0x11353070

    xor-int/2addr v7, v8

    const v8, -0x6cfa3284

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v6, :cond_b

    :cond_a
    :goto_5
    const-string v6, "\u06d6\u06d9"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x6d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x328f

    const v8, -0x239cc1a9

    xor-int/2addr v7, v8

    const v8, -0x12f9f6b

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06ec\u1a78"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x3

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4433

    const v8, -0x50505cd0

    xor-int/2addr v7, v8

    const v8, -0x402ac108

    goto/16 :goto_0

    :sswitch_10
    sget v6, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v6, :cond_c

    :goto_6
    const-string v6, "\u06dc\u073a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x5f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1869

    const v8, -0x676274d1

    xor-int/2addr v7, v8

    const v8, -0x45e270a5

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u05ab\u0730"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x27f7

    const v8, -0x2ddcbf84

    xor-int/2addr v7, v8

    const v8, -0x296977ad

    goto/16 :goto_0

    :sswitch_11
    sget v6, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v6, :cond_d

    goto :goto_7

    :cond_d
    const-string v6, "\u06d6\u06e0"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x23

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x49d7

    const v8, 0x6719deb6

    xor-int/2addr v7, v8

    const v8, 0x7b9d9194

    goto/16 :goto_0

    .line 319
    :sswitch_12
    sget v6, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v6, :cond_e

    :goto_7
    const-string v6, "\u06e7\u06da"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7e35

    const v8, 0x25ed0b86

    xor-int/2addr v7, v8

    const v8, 0x4de05a0c    # 4.704997E8f

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06df\u0733"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x67

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x632d

    const v8, -0x56c80cdf

    xor-int/2addr v7, v8

    const v8, 0x1a82f364

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c7d7678 -> :sswitch_11
        -0x762ea550 -> :sswitch_b
        -0x75bddc96 -> :sswitch_2
        -0x5f1ce263 -> :sswitch_e
        -0x570df9e6 -> :sswitch_a
        -0x53b9236f -> :sswitch_6
        -0x4b3be615 -> :sswitch_f
        -0x4a71898e -> :sswitch_a
        -0x3dded6da -> :sswitch_d
        -0x3b6cfdef -> :sswitch_4
        -0x226c833b -> :sswitch_2
        -0x18d58305 -> :sswitch_9
        -0xd0ca28a -> :sswitch_8
        -0xc045798 -> :sswitch_8
        -0xac53a31 -> :sswitch_10
        -0x39f8f2a -> :sswitch_b
        -0x222cf64 -> :sswitch_7
        -0x4cf72 -> :sswitch_f
        0x27f23dc -> :sswitch_6
        0x5c6fe49 -> :sswitch_7
        0x885dba6 -> :sswitch_5
        0x1e6c4ff4 -> :sswitch_5
        0x2107f897 -> :sswitch_0
        0x25b22caa -> :sswitch_e
        0x28974b68 -> :sswitch_12
        0x29b388d8 -> :sswitch_d
        0x2fb2a182 -> :sswitch_0
        0x329dde37 -> :sswitch_1
        0x392c4240 -> :sswitch_4
        0x3a0bea41 -> :sswitch_9
        0x51f90bc7 -> :sswitch_10
        0x52913955 -> :sswitch_3
        0x5b8f958a -> :sswitch_c
        0x657f4589 -> :sswitch_3
        0x66869e31 -> :sswitch_11
        0x7b101a6e -> :sswitch_c
        0x7c4cab0d -> :sswitch_12
        0x7ebbccef -> :sswitch_1
    .end sparse-switch
.end method

.method public final varargs showToastL(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

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

    const v16, -0x6de2f94e

    sget v17, Ll/ۘ֡;->᩹ܶ۬:I

    sget v18, Ll/֨ܿ;->᩹᩻۟:I

    const-string v19, "\u05a8\u073d"

    invoke-static/range {v19 .. v19}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v18

    mul-int/lit8 v19, v19, 0x1d

    xor-int v3, v19, v17

    mul-int/lit16 v3, v3, -0x3301

    const v21, -0x6a001f2f

    xor-int v3, v3, v21

    const v21, -0x48b506c1

    xor-int v19, v19, v21

    const/16 v20, 0x0

    :goto_0
    xor-int v1, v16, v17

    mul-int/lit16 v1, v1, -0x67b9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v3

    xor-int v16, v19, v1

    sparse-switch v16, :sswitch_data_0

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget-boolean v1, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v1, :cond_2

    :cond_0
    :goto_1
    move-object/from16 v1, p1

    goto/16 :goto_e

    .line 412
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v1, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v1, :cond_1

    goto :goto_2

    :cond_1
    const-string v1, "\u1a78\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x2267

    const v19, 0x5c8f5f5a

    xor-int v3, v3, v19

    const v19, -0x3c9e3e55

    goto/16 :goto_5

    :cond_2
    move-object/from16 v1, p1

    goto/16 :goto_c

    .line 440
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    if-lez v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "\u073a\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x1cf

    const v19, 0x6197b457

    xor-int v3, v3, v19

    const v19, -0x85c7f90

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v1

    if-lez v1, :cond_4

    goto :goto_2

    :cond_4
    move-object/from16 v1, p1

    goto/16 :goto_a

    .line 393
    :sswitch_3
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget-boolean v1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    :goto_2
    const-string v1, "\u05a1\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x279b

    const v19, 0x2214766a

    xor-int v3, v3, v19

    const v19, -0x65279e74

    goto/16 :goto_5

    .line 264
    :sswitch_4
    sget v1, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v1, :cond_6

    :goto_3
    move-object/from16 v1, p1

    goto/16 :goto_d

    :cond_6
    move-object/from16 v1, p1

    goto/16 :goto_b

    :sswitch_5
    sget v1, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v1, :cond_0

    goto :goto_3

    :sswitch_6
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    goto :goto_3

    .line 214
    :sswitch_7
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    return-void

    .line 474
    :sswitch_8
    aput-object v15, v2, v10

    goto/16 :goto_4

    .line 472
    :sswitch_9
    invoke-static {v0, v14}, Ll/ۖ;->ۤ᩸۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_7

    const-string v1, "\u1a7a\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x35

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x5e1f

    const v19, -0x5fa0d0b9

    xor-int v3, v3, v19

    const v19, -0x3d0135f1

    goto/16 :goto_5

    .line 0
    :sswitch_a
    invoke-static {v7, v14}, Ll/֨ۨ;->ۖ᩵֡(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v4, :cond_7

    const-string v1, "\u06e1\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x2a1b

    const v19, 0x1383e78

    xor-int v3, v3, v19

    const v19, -0x51b4751c

    goto/16 :goto_5

    .line 471
    :sswitch_b
    invoke-static {v14, v8}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v5, :cond_7

    const-string v1, "\u05ab\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x33c1

    const v19, -0x634e6825

    xor-int v3, v3, v19

    const v19, 0x65fa2a12

    goto/16 :goto_5

    .line 172
    :sswitch_c
    invoke-static {v0, v9}, Ll/֨ۖ;->᩸ۙۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    move-object v13, v1

    move-object/from16 v1, p1

    goto/16 :goto_8

    .line 471
    :sswitch_d
    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v6, :cond_7

    const-string v1, "\u06dc\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x7b

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x3d2d

    const v19, -0x68e985a3

    xor-int v3, v3, v19

    const v19, 0x7eb72688

    goto/16 :goto_5

    :sswitch_e
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p1

    goto/16 :goto_6

    .line 0
    :sswitch_f
    invoke-static {v7, v9}, Ll/ۗ᩶;->ۛ᩹ᩳ(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v4, :cond_9

    const-string v1, "\u05a8\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x777f

    const v19, 0x61e5552f

    xor-int v3, v3, v19

    const v19, -0x36f72709

    goto/16 :goto_5

    .line 471
    :sswitch_10
    aget-object v12, v2, v10

    instance-of v1, v12, Ljava/lang/String;

    if-eqz v1, :cond_7

    const-string v1, "\u06e2\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x556b

    const v19, 0x5304075d

    xor-int v3, v3, v19

    const v19, 0x46fcb38c

    goto/16 :goto_5

    :cond_7
    :goto_4
    const-string v1, "\u1a75\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x50a1

    const v19, 0x6ad81b6f

    xor-int v3, v3, v19

    const v19, -0x2fd45edd

    goto/16 :goto_5

    .line 90
    :sswitch_11
    new-instance v1, Ll/۫ۛ֫;

    invoke-direct {v1, v8, v11}, Ll/۫ۛ֫;-><init>(ILjava/lang/Object;)V

    invoke-static {v1}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 478
    :sswitch_12
    invoke-static {v13}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ll/᩵᩺֫;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 479
    sget-object v1, Ll/ۚۛ֫;->ܳ:Ll/ܺ᩺֫;

    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v1, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v1, "\u06dc\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x4f8f

    const v19, -0x38e5493c

    xor-int v3, v3, v19

    const v19, 0x7b7498c0

    goto :goto_5

    .line 171
    :sswitch_13
    invoke-static {v9, v8}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v5, :cond_9

    const-string v1, "\u1a77\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x27

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x4e29

    const v19, 0x1b314b3e

    xor-int v3, v3, v19

    const v19, -0x274bc42d

    goto :goto_5

    :cond_9
    move-object/from16 v1, p1

    goto/16 :goto_7

    .line 470
    :sswitch_14
    array-length v1, v2

    if-ge v10, v1, :cond_a

    const-string v1, "\u073a\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x13

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x4a5

    const v19, -0x54834613

    xor-int v3, v3, v19

    const v19, 0x59f45aa7

    goto :goto_5

    :cond_a
    const-string v1, "\u06e1\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x66f1

    const v19, -0x7878af85

    xor-int v3, v3, v19

    const v19, -0x3bc996bc

    :goto_5
    xor-int v19, v1, v19

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v1, p1

    .line 171
    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    invoke-static {v9}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v3

    if-lt v3, v6, :cond_b

    const-string v3, "\u0733\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v18

    mul-int/lit8 v3, v3, 0x9

    xor-int v0, v3, v17

    mul-int/lit16 v0, v0, -0x1955

    const v19, -0x222c9acd

    xor-int v0, v0, v19

    const v19, 0x7afb5ae8

    xor-int v19, v3, v19

    move v3, v0

    goto/16 :goto_10

    :sswitch_16
    move-object/from16 v1, p1

    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_6
    const-string v0, "\u06ec\u1a74"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x13

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x6991

    const v19, 0x7d091aaf

    xor-int v3, v3, v19

    const v19, 0x56a37711

    goto/16 :goto_f

    :sswitch_17
    move-object/from16 v1, p1

    const/16 v5, 0x7b

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v20, :cond_b

    const-string v0, "\u1a78\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x1b

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x7645

    const v19, 0x544fdd19

    xor-int v3, v3, v19

    const v19, -0x2c716c29

    goto/16 :goto_f

    :cond_b
    :goto_7
    move-object v13, v1

    :goto_8
    const-string v0, "\u0736\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x1aa9

    const v19, -0x2c2cf661

    xor-int v3, v3, v19

    const v19, -0x3e8cbd0c

    goto/16 :goto_f

    :sswitch_18
    move-object/from16 v1, p1

    instance-of v0, v1, Ljava/lang/String;

    .line 77
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_c

    const-string v3, "\u06e7\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v18

    mul-int/lit16 v4, v4, -0x6f33

    const v20, -0x70066ae9

    xor-int v4, v4, v20

    const v20, 0x15e416e8

    goto :goto_9

    :cond_c
    const-string v3, "\u0733\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v18

    mul-int/lit16 v4, v4, 0x5901

    const v20, -0x2a3c0e95

    xor-int v4, v4, v20

    const v20, -0x4b021423

    :goto_9
    xor-int v3, v3, v20

    move/from16 v20, v0

    move/from16 v19, v3

    move v3, v4

    const/16 v4, 0x7d

    goto/16 :goto_10

    :sswitch_19
    move-object/from16 v1, p1

    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_d

    goto/16 :goto_e

    :cond_d
    const-string v0, "\u1a78\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x41

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x686f

    const v19, -0x53811305

    xor-int v3, v3, v19

    const v19, 0x3525d46c

    goto/16 :goto_f

    :sswitch_1a
    move-object/from16 v1, p1

    .line 472
    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v0, :cond_e

    goto/16 :goto_b

    :cond_e
    const-string v0, "\u073a\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x55

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x4fe3

    const v19, 0x9556cf8

    xor-int v3, v3, v19

    const v19, 0x57919ed4

    goto/16 :goto_f

    :sswitch_1b
    move-object/from16 v1, p1

    .line 346
    sget v0, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v0, :cond_f

    goto/16 :goto_c

    :cond_f
    const-string v0, "\u1a78\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x49

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x6c21

    const v19, 0x5a2b5cf3

    xor-int v3, v3, v19

    const v19, -0x2f0ba5cb

    goto/16 :goto_f

    :sswitch_1c
    move-object/from16 v1, p1

    sget v0, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v0, :cond_10

    :goto_a
    const-string v0, "\u1a7a\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x17

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x3293

    const v19, -0x67ef8e0b

    xor-int v3, v3, v19

    const v19, -0x59124b40

    goto/16 :goto_f

    :cond_10
    const-string v0, "\u06e8\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x73

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x4e49

    const v19, -0x165f3bfc

    xor-int v3, v3, v19

    const v19, -0x6728d735

    goto/16 :goto_f

    :sswitch_1d
    move-object/from16 v1, p1

    sget-boolean v0, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v0, :cond_11

    :goto_b
    const-string v0, "\u06e2\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x6493

    const v19, -0x4517c163

    xor-int v3, v3, v19

    const v19, -0x1346310d

    goto/16 :goto_f

    :cond_11
    const-string v0, "\u1a77\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x1d

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x4af3

    const v19, -0x8441dcc

    xor-int v3, v3, v19

    const v19, -0x7efac5ff

    goto/16 :goto_f

    :sswitch_1e
    move-object/from16 v1, p1

    .line 100
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v0

    if-ltz v0, :cond_12

    :goto_c
    const-string v0, "\u1a77\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x701

    const v19, -0x61a74309

    xor-int v3, v3, v19

    const v19, -0x797e7a61

    goto/16 :goto_f

    :cond_12
    const-string v0, "\u1a77\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x61

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x161

    const v19, -0x38c424cf

    xor-int v3, v3, v19

    const v19, -0x24aaff81

    goto :goto_f

    :sswitch_1f
    move-object/from16 v1, p1

    .line 236
    sget v0, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v0, :cond_13

    :goto_d
    const-string v0, "\u1a73\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0xa65

    const v19, 0x523dc1f9

    xor-int v3, v3, v19

    const v19, 0x55c0b6f5

    goto :goto_f

    :cond_13
    const-string v0, "\u05ab\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x71

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x5af3

    const v19, -0x158a0abb

    xor-int v3, v3, v19

    const v19, -0x67b03985

    goto :goto_f

    :sswitch_20
    move-object/from16 v1, p1

    sget v0, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v0, :cond_14

    :goto_e
    const-string v0, "\u1a77\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x25

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x4155

    const v19, 0x4df522f8    # 5.140887E8f

    xor-int v3, v3, v19

    const v19, -0x4d101005

    goto :goto_f

    :cond_14
    const-string v0, "\u06da\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x4123

    const v19, 0x3fbd2840

    xor-int v3, v3, v19

    const v19, 0x44518408

    :goto_f
    xor-int v19, v0, v19

    :goto_10
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x782cf055 -> :sswitch_9
        -0x755e123e -> :sswitch_8
        -0x71abc709 -> :sswitch_e
        -0x6b313ec3 -> :sswitch_f
        -0x629ab4b7 -> :sswitch_17
        -0x5f9f52b1 -> :sswitch_b
        -0x5eaa331b -> :sswitch_1c
        -0x5e63547a -> :sswitch_13
        -0x5982a393 -> :sswitch_6
        -0x516fde04 -> :sswitch_18
        -0x50e518f6 -> :sswitch_1
        -0x5030b28d -> :sswitch_d
        -0x4fd8334c -> :sswitch_1b
        -0x4fa044ce -> :sswitch_10
        -0x4f579e36 -> :sswitch_5
        -0x4cbf0fbd -> :sswitch_4
        -0x44e500a8 -> :sswitch_20
        -0x41fbdf15 -> :sswitch_8
        -0x40f70b89 -> :sswitch_14
        -0x404e894d -> :sswitch_7
        -0x3ddfba47 -> :sswitch_10
        -0x3b28a456 -> :sswitch_1e
        -0x3ac21203 -> :sswitch_16
        -0x2213620c -> :sswitch_11
        -0x21c4dcc1 -> :sswitch_2
        -0x1f9b4f9d -> :sswitch_d
        -0x1f6fcac8 -> :sswitch_c
        -0x1e4c3564 -> :sswitch_2
        -0x1e45064b -> :sswitch_6
        -0x1d367e83 -> :sswitch_1f
        -0x18a6402c -> :sswitch_1d
        -0x17dc8308 -> :sswitch_0
        -0x125113f2 -> :sswitch_12
        -0xc23d333 -> :sswitch_17
        -0x6fb1a2b -> :sswitch_1d
        -0x64f3e3a -> :sswitch_e
        -0x5aa2463 -> :sswitch_1a
        0x69fe948 -> :sswitch_19
        0x833fbb2 -> :sswitch_a
        0x90d3f61 -> :sswitch_1b
        0xb713c21 -> :sswitch_1a
        0x1891d7d2 -> :sswitch_11
        0x1abfb687 -> :sswitch_1c
        0x25e34c7d -> :sswitch_13
        0x2edeffb5 -> :sswitch_14
        0x307994d5 -> :sswitch_4
        0x3c7c9304 -> :sswitch_0
        0x41f845f0 -> :sswitch_15
        0x46f8f45c -> :sswitch_f
        0x4a21cdca -> :sswitch_5
        0x4a5b530e -> :sswitch_19
        0x4b0da5b1 -> :sswitch_1e
        0x4c62c5b5 -> :sswitch_a
        0x519c0c6d -> :sswitch_3
        0x56922daa -> :sswitch_12
        0x5aa9dcc0 -> :sswitch_18
        0x5ac2c557 -> :sswitch_9
        0x67889bef -> :sswitch_1
        0x67d0af99 -> :sswitch_3
        0x67eb7bfe -> :sswitch_16
        0x680906c9 -> :sswitch_20
        0x75a8660f -> :sswitch_b
        0x76204ca3 -> :sswitch_c
        0x77760282 -> :sswitch_15
        0x790d0914 -> :sswitch_1f
        0x7c5bd517 -> :sswitch_7
    .end sparse-switch
.end method

.method public final ۙ(Ljava/lang/String;)Ll/ܺ᩺֫;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

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

    const v14, -0x5cc8d9f3

    sget v15, Ll/ۖᩳ;->᩹ۧܳ:I

    sget v16, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v17, "\u06e0\u06eb"

    invoke-static/range {v17 .. v17}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v2, v17, v16

    mul-int/lit16 v2, v2, 0x23e9

    const v19, -0x33175597

    xor-int v2, v2, v19

    const v19, 0x4dd6d634    # 4.5054528E8f

    xor-int v17, v17, v19

    move-object/from16 v19, v7

    move/from16 v18, v17

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, -0x5cc8d9f3

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v8, v17, v16

    mul-int/lit16 v8, v8, -0x3e1d

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v2, v8

    xor-int v17, v18, v2

    sparse-switch v17, :sswitch_data_0

    move/from16 v18, v9

    aget-short v10, v19, v18

    add-int/lit8 v11, v10, 0x1

    .line 188
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v2

    if-gtz v2, :cond_e

    goto/16 :goto_a

    .line 156
    :sswitch_0
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move/from16 v20, v10

    goto/16 :goto_d

    :cond_1
    move/from16 v18, v9

    :goto_1
    move/from16 v20, v10

    goto/16 :goto_5

    .line 253
    :sswitch_1
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    sget-boolean v2, Ll/ܽ;->᩷۬ۗ:Z

    if-eqz v2, :cond_0

    :goto_2
    move/from16 v18, v9

    move/from16 v20, v10

    goto/16 :goto_9

    .line 101
    :sswitch_2
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget v2, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v2, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v18, v9

    move/from16 v20, v10

    goto/16 :goto_6

    .line 29
    :sswitch_3
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    goto :goto_2

    .line 125
    :sswitch_4
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    const/4 v1, 0x0

    return-object v1

    .line 272
    :sswitch_5
    new-instance v2, Ll/ܺ᩺֫;

    sget-object v8, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    move/from16 v18, v9

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v20

    if-eqz v20, :cond_3

    goto :goto_1

    :cond_3
    const/4 v9, 0x7

    .line 12
    sget-boolean v21, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v21, :cond_4

    goto/16 :goto_a

    :cond_4
    move/from16 v20, v10

    const/16 v10, 0x6f

    .line 272
    invoke-static {v8, v10, v9, v14}, Ll/ۘܽ;->ۡۗܺ([SIII)Ljava/lang/String;

    move-result-object v8

    .line 0
    invoke-static {v8, v1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 203
    sget v9, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v9, :cond_5

    goto/16 :goto_9

    .line 272
    :cond_5
    iget-object v9, v0, Ll/᩵᩺֫;->᩻:Ll/۫᩺֫;

    invoke-direct {v2, v0, v1, v8, v9}, Ll/ܺ᩺֫;-><init>(Ll/᩵᩺֫;Ljava/lang/String;Ljava/lang/String;Ll/۫᩺֫;)V

    .line 273
    new-instance v8, Ljava/lang/ref/SoftReference;

    .line 27
    sget v9, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v9, :cond_6

    move/from16 v10, v20

    goto/16 :goto_a

    .line 273
    :cond_6
    invoke-direct {v8, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 274
    invoke-virtual {v4, v1, v8}, Ll/ۡۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v7, v2

    goto :goto_3

    :sswitch_6
    return-object v7

    :sswitch_7
    move/from16 v18, v9

    move/from16 v20, v10

    if-nez v6, :cond_7

    const-string v2, "\u06e0\u05a8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v15

    mul-int/lit8 v2, v2, -0x1b

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, 0x1579

    const v9, -0x7668f289

    xor-int/2addr v8, v9

    const v9, -0x2e648f70

    goto/16 :goto_e

    :cond_7
    move-object v7, v6

    :goto_3
    const-string v2, "\u06e2\u1a77"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v8, v2, v15

    mul-int/lit16 v8, v8, 0x2609

    const v9, -0x3e3fe490

    xor-int/2addr v8, v9

    const v9, -0x168a04b0

    goto/16 :goto_e

    :sswitch_8
    move/from16 v18, v9

    move/from16 v20, v10

    .line 269
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺ᩺֫;

    goto :goto_4

    :sswitch_9
    move/from16 v18, v9

    move/from16 v20, v10

    const/4 v2, 0x0

    :goto_4
    move-object v6, v2

    const-string v2, "\u05a1\u06d9"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v16, v2

    mul-int/lit8 v2, v2, -0x3

    xor-int v8, v2, v15

    mul-int/lit16 v8, v8, 0x16fb

    const v9, -0xee013f7

    xor-int/2addr v8, v9

    const v9, -0x3169a7e1

    goto/16 :goto_e

    :sswitch_a
    move/from16 v18, v9

    move/from16 v20, v10

    .line 266
    iget-object v4, v0, Ll/᩵᩺֫;->ۙ:Ll/ۡۗ;

    invoke-virtual {v4, v1}, Ll/ۡۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/ref/Reference;

    if-eqz v5, :cond_8

    const-string v2, "\u06df\u05ab"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v15

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x2cfd

    const v9, -0x41e3d6e3

    xor-int/2addr v8, v9

    const v9, 0x2c5d52f8

    goto/16 :goto_e

    :cond_8
    const-string v2, "\u1a74\u06ec"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    mul-int/lit8 v2, v2, -0x7b

    xor-int v8, v2, v15

    mul-int/lit16 v8, v8, -0x1401

    const v9, 0x436c8960

    xor-int/2addr v8, v9

    const v9, -0x7efa4110

    goto/16 :goto_e

    :sswitch_b
    move/from16 v18, v9

    move/from16 v20, v10

    .line 77
    new-instance v2, Ll/᩹᩺֫;

    invoke-direct {v2, v0}, Ll/᩹᩺֫;-><init>(Ll/᩵᩺֫;)V

    iput-object v2, v0, Ll/᩵᩺֫;->᩻:Ll/۫᩺֫;

    goto/16 :goto_7

    :sswitch_c
    move/from16 v18, v9

    move/from16 v20, v10

    .line 76
    iput-object v3, v0, Ll/᩵᩺֫;->֫:Ll/ۗ᩺֫;

    .line 26
    sget v2, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v2, :cond_9

    :goto_5
    const-string v2, "\u06df\u06e7"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v15, v2

    mul-int/lit8 v2, v2, 0x41

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, 0x72d5

    const v9, 0x52ac2318

    xor-int/2addr v8, v9

    const v9, -0x23d0220

    goto/16 :goto_e

    :cond_9
    const-string v2, "\u06eb\u06df"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    mul-int/lit8 v2, v2, 0x1b

    xor-int v8, v2, v15

    mul-int/lit16 v8, v8, 0x2337

    const v9, -0x48392079

    xor-int/2addr v8, v9

    const v9, -0x175b0589

    goto/16 :goto_e

    :sswitch_d
    move/from16 v18, v9

    move/from16 v20, v10

    .line 76
    iget-object v2, v0, Ll/᩵᩺֫;->ۧ:Ll/ۘۨ֫;

    iget-object v2, v2, Ll/ۘۨ֫;->ۙ:Ll/ܿۨ֫;

    invoke-static {v2}, Ll/ܿۨ֫;->ۙ(Ll/ܿۨ֫;)Ll/۟᩵ᩴ;

    move-result-object v3

    .line 105
    sget v2, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v2, :cond_a

    :goto_6
    const-string v2, "\u06d6\u073d"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v16, v2

    mul-int/lit8 v2, v2, 0x7d

    xor-int v8, v2, v15

    mul-int/lit16 v8, v8, -0x270d

    const v9, 0x2b0732a9

    xor-int/2addr v8, v9

    const v9, 0x30ee819b

    goto/16 :goto_e

    :cond_a
    const-string v2, "\u1a76\u06d7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v15, v2

    mul-int/lit8 v2, v2, -0x13

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, 0xb17

    const v9, 0x4696e463

    xor-int/2addr v8, v9

    const v9, 0x69ba597f

    goto/16 :goto_e

    :sswitch_e
    move/from16 v18, v9

    move/from16 v20, v10

    .line 74
    iget-object v2, v0, Ll/᩵᩺֫;->֫:Ll/ۗ᩺֫;

    if-eqz v2, :cond_b

    :goto_7
    const-string v2, "\u06e8\u1a76"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v15

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, 0x1ad1

    const v9, -0x34897118    # -1.615844E7f

    xor-int/2addr v8, v9

    const v9, 0x7c30f204

    goto/16 :goto_e

    :cond_b
    const-string v2, "\u1a7b\u0730"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v15, v2

    mul-int/lit8 v2, v2, 0x7

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x4881

    const v9, 0x407b80bb

    xor-int/2addr v8, v9

    const v9, 0x6d227a19

    goto/16 :goto_e

    :sswitch_f
    move/from16 v18, v9

    move/from16 v20, v10

    const/16 v2, 0x3dd2

    const/16 v14, 0x3dd2

    goto :goto_8

    :sswitch_10
    move/from16 v18, v9

    move/from16 v20, v10

    const/16 v2, 0x443d

    const/16 v14, 0x443d

    :goto_8
    const-string v2, "\u06e1\u06e0"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v16, v2

    mul-int/lit8 v2, v2, -0x77

    xor-int v8, v2, v15

    mul-int/lit16 v8, v8, 0x2927

    const v9, 0x1beacea7

    xor-int/2addr v8, v9

    const v9, 0x3cfe3689

    goto/16 :goto_e

    :sswitch_11
    move/from16 v18, v9

    move/from16 v20, v10

    add-int/lit8 v2, v13, 0x1

    sub-int v2, v12, v2

    if-ltz v2, :cond_c

    const-string v2, "\u06dc\u06e7"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v15

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, 0x4985

    const v9, 0x27ea2526

    xor-int/2addr v8, v9

    const v9, -0x6b6f60d1

    goto/16 :goto_e

    :cond_c
    const-string v2, "\u06ec\u05a1"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    mul-int/lit8 v2, v2, 0x63

    xor-int v8, v2, v15

    mul-int/lit16 v8, v8, 0x202f

    const v9, -0x71291a1c

    xor-int/2addr v8, v9

    const v9, 0x641a80f7

    goto/16 :goto_e

    :sswitch_12
    move/from16 v18, v9

    move/from16 v20, v10

    mul-int v12, v11, v11

    mul-int/lit8 v13, v20, 0x2

    .line 197
    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v2, :cond_d

    :goto_9
    const-string v2, "\u1a75\u05a8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v15

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, 0x60e3

    const v9, -0x58566823

    xor-int/2addr v8, v9

    const v9, -0xf9ea761

    goto/16 :goto_e

    :cond_d
    const-string v2, "\u1a76\u073d"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v15

    mul-int/lit8 v2, v2, -0x39

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x148f

    const v9, -0x60375754

    xor-int/2addr v8, v9

    const v9, 0x5b7c2693

    goto/16 :goto_e

    :goto_a
    const-string v2, "\u1a76\u05ab"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v8, v2, v15

    mul-int/lit16 v8, v8, -0x6fcd

    const v9, 0xf12b82d

    xor-int/2addr v8, v9

    const v9, -0x4e0869b3

    goto :goto_b

    :cond_e
    const-string v2, "\u1a76\u06d9"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v16, v2

    mul-int/lit8 v2, v2, 0x5b

    xor-int v8, v2, v15

    mul-int/lit16 v8, v8, -0x4587

    const v9, -0x55d02715

    xor-int/2addr v8, v9

    const v9, -0x57e81bd8

    :goto_b
    xor-int/2addr v2, v9

    move/from16 v9, v18

    goto :goto_f

    :sswitch_13
    move/from16 v20, v10

    const/16 v9, 0x6e

    .line 54
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_d

    :cond_f
    const-string v2, "\u06d9\u06d8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v8, v2, v15

    mul-int/lit16 v8, v8, 0x6b91

    const v10, -0x42cfcfc7

    xor-int/2addr v8, v10

    const v10, 0x7ddb47df

    :goto_c
    xor-int v18, v2, v10

    move v2, v8

    move/from16 v10, v20

    goto/16 :goto_0

    :sswitch_14
    move/from16 v18, v9

    move/from16 v20, v10

    sget-object v19, Ll/᩵᩺֫;->ۜ᩷ۜ:[S

    sget v2, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v2, :cond_10

    move/from16 v9, v18

    :goto_d
    const-string v2, "\u0730\u1a7b"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v16

    mul-int/lit8 v2, v2, -0x43

    xor-int v8, v2, v15

    mul-int/lit16 v8, v8, -0x3591

    const v10, -0x11e5c3e3

    xor-int/2addr v8, v10

    const v10, 0x1f05f73f

    goto :goto_c

    :cond_10
    const-string v2, "\u06eb\u06d8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v15

    mul-int/lit8 v2, v2, -0x59

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x4b1

    const v9, -0x73d6a261

    xor-int/2addr v8, v9

    const v9, 0x585a8dd4

    :goto_e
    xor-int/2addr v2, v9

    move/from16 v9, v18

    move/from16 v10, v20

    :goto_f
    move/from16 v18, v2

    move v2, v8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e5327c0 -> :sswitch_e
        -0x762245e8 -> :sswitch_6
        -0x734a97b2 -> :sswitch_3
        -0x7241fc09 -> :sswitch_7
        -0x70f81128 -> :sswitch_0
        -0x66eeae00 -> :sswitch_2
        -0x63bb8278 -> :sswitch_4
        -0x547de250 -> :sswitch_9
        -0x4307a206 -> :sswitch_c
        -0x40d42b64 -> :sswitch_4
        -0x2efe770b -> :sswitch_10
        -0x2879aa1b -> :sswitch_6
        -0x27578e39 -> :sswitch_5
        -0x267808d8 -> :sswitch_e
        -0x25337c44 -> :sswitch_2
        -0x24260e8c -> :sswitch_10
        -0x234251f8 -> :sswitch_1
        -0x21df1db6 -> :sswitch_0
        -0xd2370ea -> :sswitch_7
        -0x8ba2c79 -> :sswitch_12
        0x29fbfef -> :sswitch_14
        0xca26532 -> :sswitch_11
        0x11bc2078 -> :sswitch_b
        0x11da7638 -> :sswitch_1
        0x28ceafaf -> :sswitch_11
        0x3379b75a -> :sswitch_a
        0x3748573f -> :sswitch_13
        0x3877b6b5 -> :sswitch_14
        0x3c2f5728 -> :sswitch_f
        0x43712308 -> :sswitch_9
        0x4544fb2c -> :sswitch_a
        0x461b8acd -> :sswitch_8
        0x47cf2e04 -> :sswitch_d
        0x4a3bff6b -> :sswitch_12
        0x4b15830b -> :sswitch_b
        0x6178aabc -> :sswitch_d
        0x63143d84 -> :sswitch_8
        0x67f44245 -> :sswitch_13
        0x6eee520d -> :sswitch_f
        0x72da38e8 -> :sswitch_5
        0x747ebc7c -> :sswitch_c
        0x7bbeca58 -> :sswitch_3
    .end sparse-switch
.end method

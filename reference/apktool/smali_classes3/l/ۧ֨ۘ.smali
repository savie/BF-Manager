.class public final Ll/ۧ֨ۘ;
.super Ljava/lang/Object;
.source "R3YJ"

# interfaces
.implements Lbin/mt/plugin/api/PluginContext;


# static fields
.field private static final ᩹ۢۜ:[S


# instance fields
.field public final ֨:Ljava/lang/String;

.field public final ۖ:Ll/᩷۠ۚ;

.field public ۘ:Ll/ۛ֨ۘ;

.field public final ۙ:Ll/۫۠;

.field public final ۚ:Ll/۫۠;

.field public final ۜ:Ll/ܳۡۘ;

.field public final ۠:Ljava/lang/String;

.field public ۨ:Ll/֡֨ۘ;

.field public final ۬:Ljava/lang/String;

.field public ܰ:Landroid/content/ClipboardManager;

.field public final ܶ:Ll/ۢۚۘ;

.field public volatile ᩳ:Landroid/content/SharedPreferences;

.field public final ᩴ:I

.field public final ᩸:I

.field public final ᩹:Ll/ܳۡۘ;

.field public ᩺:Ll/ۤ֨ۘ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x76

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    return-void

    :array_0
    .array-data 2
        0x1e0bs
        -0x706as
        -0x7067s
        -0x7064s
        -0x707bs
        -0x7069s
        -0x7066s
        -0x706cs
        -0x7079s
        -0x706fs
        0x964s
        -0x3b1bs
        -0x3b07s
        -0x3b20s
        -0x3b0es
        -0x3b04s
        -0x3b05s
        -0x3b24s
        -0x3b0fs
        -0x3b1bs
        -0x3b07s
        -0x3b20s
        -0x3b0es
        -0x3b04s
        -0x3b05s
        -0x3b3bs
        -0x3b19s
        -0x3b10s
        -0x3b0ds
        -0x3b10s
        -0x3b19s
        -0x3b10s
        -0x3b05s
        -0x3b0as
        -0x3b10s
        0x251s
        -0x59d2s
        -0x59ces
        -0x59ces
        -0x59cas
        -0x5984s
        -0x5997s
        -0x5997s
        -0x59d2s
        -0x59ces
        -0x59ces
        -0x59cas
        -0x59cbs
        -0x5984s
        -0x5997s
        -0x5997s
        0x946s
        0x77e7s
        0x1e5bs
        0x6f17s
        0x6f0bs
        0x6f17s
        0x6f13s
        0x6f0bs
        0x6f14s
        0x6f15s
        0x22d5s
        -0x35a7s
        -0x3582s
        -0x3588s
        -0x359ds
        -0x359cs
        -0x3593s
        0xc70s
        0x1bc7s
        0x1be0s
        0x1be6s
        0x1bfds
        0x1bfas
        0x1bf3s
        0x1bb4s
        0x1bfas
        0x1bfbs
        0x1be0s
        0x1bb4s
        0x1bf2s
        0x1bfbs
        0x1be1s
        0x1bfas
        0x1bf0s
        0x1baes
        0x1bb4s
        0x1720s
        0x1a02s
        0x1a0fs
        0x1a00s
        0x1a09s
        0x1a1ds
        0x1a1as
        0x1a1cs
        0x1a07s
        0x1a00s
        0x1a09s
        0x1a1ds
        0x1b26s
        -0x20das
        -0x265fs
        -0x245es
        -0x446s
        0x1153s
        -0x2bbas
        0xddcs
        0xees
        -0x11des
        -0x1368s
        0x70bs
        0x1977s
        0x1965s
        0x1965s
        0x1973s
        0x1962s
        0x1965s
        0x1939s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ll/᩷۠ۚ;Ll/ۢۚۘ;Ll/ܳۡۘ;Ll/ܳۡۘ;)V
    .locals 18

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x7d2901d5

    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    sget v5, Ll/ۗܺ;->ۨ᩺۠:I

    .line 61
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-string v6, "\u06e8\u06d6"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x21

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x54fb

    const v8, 0x2851c2d3

    xor-int/2addr v7, v8

    const v8, 0x7db0f877

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x48b

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

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
    new-instance v1, Ll/۫۠;

    invoke-direct {v1}, Ll/۫۠;-><init>()V

    .line 40
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_b

    :sswitch_0
    sget v6, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez v6, :cond_1

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

    :goto_2
    move-object/from16 v16, v2

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

    goto/16 :goto_a

    :sswitch_1
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v6

    if-nez v6, :cond_0

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

    move-object/from16 v16, v2

    goto/16 :goto_b

    :sswitch_2
    sget v6, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v6, :cond_2

    goto :goto_3

    .line 16
    :sswitch_3
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    :goto_3
    const-string v6, "\u06e8\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x33d5

    const v8, 0x15d5eab3

    xor-int/2addr v7, v8

    const v8, 0xc960e82

    goto/16 :goto_0

    :sswitch_4
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :sswitch_5
    move-object/from16 v6, p7

    .line 68
    iput-object v6, v0, Ll/ۧ֨ۘ;->ܶ:Ll/ۢۚۘ;

    move-object/from16 v7, p8

    .line 69
    iput-object v7, v0, Ll/ۧ֨ۘ;->ۜ:Ll/ܳۡۘ;

    move-object/from16 v8, p9

    .line 70
    iput-object v8, v0, Ll/ۧ֨ۘ;->᩹:Ll/ܳۡۘ;

    return-void

    :sswitch_6
    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 67
    iput-object v9, v0, Ll/ۧ֨ۘ;->ۖ:Ll/᩷۠ۚ;

    .line 63
    sget v10, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v10, :cond_3

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    goto/16 :goto_2

    :cond_3
    const-string v10, "\u06d6\u06e7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v4

    xor-int v11, v10, v5

    mul-int/lit16 v11, v11, 0x6431

    const v12, 0x158e73c6

    xor-int/2addr v11, v12

    const v12, 0x564f1fa3

    xor-int/2addr v10, v12

    move v6, v10

    move v7, v11

    goto/16 :goto_1

    :sswitch_7
    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 66
    iput-object v10, v0, Ll/ۧ֨ۘ;->۠:Ljava/lang/String;

    sget v11, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v11, :cond_4

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    goto/16 :goto_4

    :cond_4
    const-string v11, "\u073a\u073d"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v5

    mul-int/lit8 v11, v11, -0x5

    xor-int v12, v11, v4

    mul-int/lit16 v12, v12, -0x5e9f

    const v13, 0x70f87294

    xor-int/2addr v12, v13

    const v13, -0x1c91d3aa

    xor-int/2addr v11, v13

    move v6, v11

    move v7, v12

    goto/16 :goto_1

    :sswitch_8
    move/from16 v11, p3

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 64
    iput v11, v0, Ll/ۧ֨ۘ;->᩸:I

    move/from16 v12, p4

    .line 65
    iput v12, v0, Ll/ۧ֨ۘ;->ᩴ:I

    sget v13, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v13, :cond_5

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    goto :goto_4

    :cond_5
    const-string v13, "\u06da\u06e8"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v5

    mul-int/lit8 v13, v13, -0x73

    xor-int v14, v13, v4

    mul-int/lit16 v14, v14, -0x6d69

    const v15, 0x69ef5854

    xor-int/2addr v14, v15

    const v15, 0x23b2dd2f

    xor-int/2addr v13, v15

    move v6, v13

    move v7, v14

    goto/16 :goto_1

    :sswitch_9
    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 63
    iput-object v13, v0, Ll/ۧ֨ۘ;->۬:Ljava/lang/String;

    .line 6
    sget v14, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v14, :cond_6

    move-object/from16 v14, p1

    :goto_4
    move-object/from16 v16, v2

    goto/16 :goto_7

    :cond_6
    const-string v14, "\u0733\u06d6"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v4

    xor-int v15, v14, v5

    mul-int/lit16 v15, v15, -0x4693

    const v16, -0x5467198d

    xor-int v15, v15, v16

    const v16, -0x5386cf14

    xor-int v14, v14, v16

    move v6, v14

    move v7, v15

    goto/16 :goto_1

    :sswitch_a
    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 49
    iput-object v2, v0, Ll/ۧ֨ۘ;->ۚ:Ll/۫۠;

    move-object/from16 v14, p1

    .line 62
    iput-object v14, v0, Ll/ۧ֨ۘ;->֨:Ljava/lang/String;

    .line 18
    sget-boolean v15, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v15, :cond_7

    goto/16 :goto_a

    :cond_7
    const-string v15, "\u1a78\u06d9"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v5

    move-object/from16 v16, v2

    xor-int v2, v15, v4

    mul-int/lit16 v2, v2, -0xe75

    const v17, 0x751d797f

    xor-int v2, v2, v17

    const v17, 0x2cd9b84e

    goto :goto_5

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

    .line 49
    new-instance v2, Ll/۫۠;

    invoke-direct {v2}, Ll/۫۠;-><init>()V

    .line 56
    sget v15, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v15, :cond_8

    goto/16 :goto_a

    :cond_8
    const-string v15, "\u1a74\u06d6"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v4

    mul-int/lit8 v15, v15, -0x53

    move-object/from16 v16, v2

    xor-int v2, v15, v5

    mul-int/lit16 v2, v2, 0x2fad

    const v17, 0x23f56e30

    xor-int v2, v2, v17

    const v17, 0x722188c0

    :goto_5
    xor-int v15, v15, v17

    move v7, v2

    move v6, v15

    goto/16 :goto_9

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

    .line 48
    iput-object v1, v0, Ll/ۧ֨ۘ;->ۙ:Ll/۫۠;

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v2

    if-gtz v2, :cond_9

    :goto_6
    const-string v2, "\u05a1\u05a8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v5

    mul-int/lit8 v2, v2, -0x69

    xor-int v15, v2, v4

    mul-int/lit16 v15, v15, -0x472b

    const v17, -0x28dc5330

    xor-int v15, v15, v17

    const v17, 0x6f4dc144

    goto :goto_8

    :cond_9
    const-string v2, "\u0736\u06e8"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v4

    mul-int/lit8 v2, v2, -0x75

    xor-int v15, v2, v5

    mul-int/lit16 v15, v15, -0x602d

    const v17, 0x57dce734

    xor-int v15, v15, v17

    const v17, 0x15cee0cc

    goto :goto_8

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

    .line 50
    sget v2, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v2, :cond_a

    :goto_7
    const-string v2, "\u06d8\u05ab"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v5

    xor-int v15, v2, v4

    mul-int/lit16 v15, v15, 0x1e4b

    const v17, 0x68eff9e1

    xor-int v15, v15, v17

    const v17, 0x7f4cdf5c

    goto :goto_8

    :cond_a
    const-string v2, "\u06e0\u06d7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v5

    xor-int v15, v2, v4

    mul-int/lit16 v15, v15, 0x671d

    const v17, -0x61deff3c

    xor-int v15, v15, v17

    const v17, -0x77b51a

    :goto_8
    xor-int v2, v2, v17

    move v6, v2

    move v7, v15

    :goto_9
    move-object/from16 v2, v16

    goto/16 :goto_1

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

    .line 60
    sget v2, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v2, :cond_b

    move-object/from16 v2, v16

    :goto_a
    const-string v15, "\u06da\u06d6"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v4, v15

    mul-int/lit8 v15, v15, -0x1d

    xor-int v0, v15, v5

    mul-int/lit16 v0, v0, 0x702b

    const v16, -0x2afe4101

    xor-int v0, v0, v16

    const v16, 0x6f8dc4c4

    xor-int v15, v15, v16

    move v7, v0

    move v6, v15

    goto :goto_d

    :cond_b
    const-string v0, "\u06eb\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v4

    xor-int v2, v0, v5

    mul-int/lit16 v2, v2, -0x41c5

    const v15, 0x409207ca

    xor-int/2addr v2, v15

    const v15, -0x72097049

    goto :goto_c

    :goto_b
    const-string v0, "\u06d7\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v4

    xor-int v2, v0, v5

    mul-int/lit16 v2, v2, 0x663b

    const v15, -0x17fcf567

    xor-int/2addr v2, v15

    const v15, -0x32a373bd

    goto :goto_c

    :cond_c
    const-string v0, "\u1a7b\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v5, v0

    mul-int/lit8 v0, v0, -0x47

    xor-int v2, v0, v4

    mul-int/lit16 v2, v2, -0x679b

    const v15, 0x770afbf5

    xor-int/2addr v2, v15

    const v15, 0x1208e160

    :goto_c
    xor-int/2addr v0, v15

    move v6, v0

    move v7, v2

    move-object/from16 v2, v16

    :goto_d
    move-object/from16 v0, p0

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79189a2f -> :sswitch_c
        -0x72f6d93a -> :sswitch_5
        -0x7049e621 -> :sswitch_b
        -0x6c982d5b -> :sswitch_1
        -0x6ac12ae6 -> :sswitch_3
        -0x62aa2b98 -> :sswitch_2
        -0x4931a37e -> :sswitch_c
        -0x43b58c75 -> :sswitch_e
        -0x3feb7efe -> :sswitch_e
        -0x2a6b1adc -> :sswitch_d
        -0x205e7c1a -> :sswitch_4
        -0xbe49e38 -> :sswitch_8
        -0x56bd650 -> :sswitch_7
        -0x474e6f3 -> :sswitch_3
        0xe04c3d0 -> :sswitch_0
        0xe2d7255 -> :sswitch_5
        0x1003c39f -> :sswitch_2
        0x13f47464 -> :sswitch_9
        0x15629fee -> :sswitch_d
        0x19c618c5 -> :sswitch_6
        0x2a7e81e1 -> :sswitch_a
        0x360acb1c -> :sswitch_0
        0x377dffc2 -> :sswitch_7
        0x400d759b -> :sswitch_a
        0x45d018d1 -> :sswitch_4
        0x520a3b6b -> :sswitch_b
        0x6224bdfc -> :sswitch_1
        0x659c4ebc -> :sswitch_9
        0x72f75b84 -> :sswitch_6
        0x7a9c7f50 -> :sswitch_8
    .end sparse-switch
.end method

.method private ۙ()Landroid/content/ClipboardManager;
    .locals 19

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

    const v12, 0x5b817b5a

    sget v13, Ll/֫;->ܶܺ᩻:I

    sget v14, Ll/ۗ᩺;->ۢۜ᩶:I

    const-string v15, "\u05a1\u06e7"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v1, v15, v13

    mul-int/lit16 v1, v1, 0x3b45

    const v17, -0x685847c7

    xor-int v1, v1, v17

    const v17, -0x502141b5

    xor-int v15, v15, v17

    const/16 v16, 0x0

    :goto_0
    xor-int/2addr v12, v13

    mul-int/lit16 v12, v12, -0x15b5

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v1, v12

    xor-int v12, v15, v1

    sparse-switch v12, :sswitch_data_0

    mul-int v1, v4, v7

    sub-int v1, v6, v1

    if-gez v1, :cond_5

    const-string v1, "\u1a73\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x1bcb

    const v17, 0x372d9d99

    xor-int v15, v15, v17

    const v17, -0x2044155f

    goto/16 :goto_7

    .line 353
    :sswitch_0
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v1, "\u1a74\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v13, v1

    mul-int/lit8 v1, v1, -0x31

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x2d67

    const v17, -0x3fd7a482

    xor-int v15, v15, v17

    const v17, 0x2007cb6b

    goto/16 :goto_7

    .line 101
    :sswitch_1
    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v1, :cond_b

    goto/16 :goto_6

    .line 177
    :sswitch_2
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    sget-boolean v1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-nez v1, :cond_7

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    const/4 v1, 0x0

    return-object v1

    .line 384
    :sswitch_5
    invoke-static/range {v16 .. v16}, Ll/ܽܺۘ;->ܰ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    iput-object v1, v0, Ll/ۧ֨ۘ;->ܰ:Landroid/content/ClipboardManager;

    goto/16 :goto_1

    .line 383
    :sswitch_6
    invoke-static {v9, v10, v11, v8}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v16

    .line 237
    sget-boolean v1, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v1, "\u06e8\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x6b

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x4019

    const v17, 0x630e4181

    xor-int v15, v15, v17

    const v17, 0x60e2ef74

    goto/16 :goto_7

    :sswitch_7
    const/16 v11, 0x9

    .line 356
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v1

    if-gtz v1, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v1, "\u1a79\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x25

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x20c9

    const v17, -0x542a6ce2

    xor-int v15, v15, v17

    const v17, 0x595203d1

    goto/16 :goto_7

    .line 383
    :sswitch_8
    sget-object v9, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    const/4 v10, 0x1

    .line 195
    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v1, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v1, "\u1a78\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x374b

    const v17, -0x57d1627f

    xor-int v15, v15, v17

    const v17, 0x706c7d1

    goto/16 :goto_7

    .line 386
    :sswitch_9
    iget-object v1, v0, Ll/ۧ֨ۘ;->ܰ:Landroid/content/ClipboardManager;

    return-object v1

    .line 383
    :sswitch_a
    iget-object v1, v0, Ll/ۧ֨ۘ;->ܰ:Landroid/content/ClipboardManager;

    if-nez v1, :cond_4

    const-string v1, "\u073a\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x6f

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x6121

    const v17, 0x2103c4e8

    xor-int v15, v15, v17

    const v17, 0x48915357

    goto/16 :goto_7

    :cond_4
    :goto_1
    const-string v1, "\u1a74\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x2461

    const v17, -0x1abdb8f6

    xor-int v15, v15, v17

    const v17, -0x7e4c987d

    goto/16 :goto_7

    :sswitch_b
    const/16 v1, 0x2272

    const/16 v8, 0x2272

    goto :goto_2

    :sswitch_c
    const v1, 0x8ff5

    const v8, 0x8ff5

    :goto_2
    const-string v1, "\u06d6\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x63

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x4599

    const v17, -0x7aeda688

    xor-int v15, v15, v17

    const v17, -0x1acf01c5

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u06dc\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x4f

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x4a29

    const v17, -0x5fad0f6c

    xor-int v15, v15, v17

    const v17, 0x7c3aaed4

    goto/16 :goto_7

    :sswitch_d
    const/16 v7, 0x158e

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v1, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v1, "\u06d6\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x35

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x5a11

    const v17, 0x11876105

    xor-int v15, v15, v17

    const v17, 0x4210b74a

    goto/16 :goto_7

    :sswitch_e
    const v1, 0x7426b1

    add-int v6, v5, v1

    .line 24
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    :goto_3
    const-string v1, "\u06d7\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x49

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x7cbf

    const v17, -0x485bc749

    xor-int v15, v15, v17

    const v17, -0x548d7a7c

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u1a73\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x63

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x7429

    const v17, 0x481f3227

    xor-int v15, v15, v17

    const v17, -0x6fe7a26e

    goto/16 :goto_7

    :sswitch_f
    aget-short v4, v2, v3

    mul-int v5, v4, v4

    sget v1, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v1, :cond_9

    goto :goto_5

    :cond_9
    const-string v1, "\u06eb\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x63

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x40d9

    const v17, 0x59c49203

    xor-int v15, v15, v17

    const v17, -0x4c8464eb

    goto/16 :goto_7

    :sswitch_10
    const/4 v3, 0x0

    .line 273
    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v1, :cond_a

    goto :goto_4

    :cond_a
    const-string v1, "\u06df\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit8 v15, v15, -0x25

    const v17, -0x1a6385ed

    xor-int v15, v15, v17

    const v17, -0x75c38848

    goto/16 :goto_7

    .line 118
    :sswitch_11
    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v1, :cond_c

    :cond_b
    :goto_4
    const-string v1, "\u0730\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x7845

    const v17, -0x64897572

    xor-int v15, v15, v17

    const v17, 0x12c1f172

    goto/16 :goto_7

    :cond_c
    const-string v1, "\u1a7a\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x654d

    const v17, -0xc8b912c

    xor-int v15, v15, v17

    const v17, -0x2c68d0ab

    goto :goto_7

    :sswitch_12
    sget-boolean v1, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v1, :cond_d

    :goto_5
    const-string v1, "\u073d\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x5b

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x1367

    const v17, -0x58efc804

    xor-int v15, v15, v17

    const v17, -0x3da8de4c

    goto :goto_7

    :cond_d
    const-string v1, "\u06d9\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x16c9

    const v17, 0x7086f362

    xor-int v15, v15, v17

    const v17, 0x2439e09a

    goto :goto_7

    :sswitch_13
    sget-object v2, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    .line 111
    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v1, :cond_e

    :goto_6
    const-string v1, "\u06d8\u06eb"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x69

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x5749

    const v17, -0x2f73ba28

    xor-int v15, v15, v17

    const v17, 0x3e0d4a69

    goto :goto_7

    :cond_e
    const-string v1, "\u06e8\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x3d

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x7b95

    const v17, -0x5f3edfae

    xor-int v15, v15, v17

    const v17, -0x26ff4b50

    :goto_7
    xor-int v1, v1, v17

    move/from16 v18, v15

    move v15, v1

    move/from16 v1, v18

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d7de3c7 -> :sswitch_6
        -0x73f74ffb -> :sswitch_5
        -0x5eec5547 -> :sswitch_3
        -0x5df0d603 -> :sswitch_7
        -0x4c6407e8 -> :sswitch_4
        -0x3fd07470 -> :sswitch_11
        -0x3e992756 -> :sswitch_9
        -0x3c54b357 -> :sswitch_8
        -0x3265be92 -> :sswitch_0
        -0x2d22429e -> :sswitch_4
        -0x2a235b2e -> :sswitch_f
        -0x28af4ac8 -> :sswitch_0
        -0x26bb59dc -> :sswitch_8
        -0x1eddef97 -> :sswitch_c
        -0x1e94ebbb -> :sswitch_a
        -0x1cecf365 -> :sswitch_7
        -0x1ada530b -> :sswitch_f
        -0xfc1c8ce -> :sswitch_13
        -0xec4ddbb -> :sswitch_a
        -0xe521533 -> :sswitch_b
        -0x79a1315 -> :sswitch_5
        0x1900966 -> :sswitch_12
        0xd3b26e8 -> :sswitch_2
        0xf4f558f -> :sswitch_11
        0x1665c6d4 -> :sswitch_12
        0x30928315 -> :sswitch_6
        0x37829084 -> :sswitch_10
        0x39dca7c0 -> :sswitch_13
        0x3bae2171 -> :sswitch_b
        0x46262c50 -> :sswitch_3
        0x4d2128df -> :sswitch_2
        0x4eff5f0f -> :sswitch_c
        0x5b8a74b4 -> :sswitch_d
        0x5ed1eb5a -> :sswitch_10
        0x5fe5e0cc -> :sswitch_e
        0x64767cb2 -> :sswitch_d
        0x65a6d8d2 -> :sswitch_9
        0x78496607 -> :sswitch_1
        0x7d9a1ed8 -> :sswitch_e
        0x7eac813c -> :sswitch_1
    .end sparse-switch
.end method

.method public static varargs ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x28752918

    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    sget v5, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v6, "\u05ab\u06e0"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x75f1

    const v8, -0x16ebc38a

    xor-int/2addr v7, v8

    const v8, -0x47197d01

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x4caf

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 184
    sget v6, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v6, :cond_4

    goto/16 :goto_3

    .line 102
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget v6, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v6, :cond_c

    goto :goto_1

    :sswitch_1
    sget v6, Ll/֫۟;->᩸ᩴܿ:I

    if-gez v6, :cond_5

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v6

    if-nez v6, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v6, "\u0736\u05a8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x6d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x23a5

    const v8, 0x2718358f

    xor-int/2addr v7, v8

    const v8, 0x23a4c0b6

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    goto/16 :goto_4

    .line 33
    :sswitch_4
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    const/4 p0, 0x0

    return-object p0

    .line 259
    :sswitch_5
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    goto :goto_2

    .line 261
    :sswitch_6
    invoke-static {v2, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 257
    :sswitch_7
    invoke-static {v1}, Ll/ۘۛ;->ۙ(Landroid/content/res/Configuration;)Ll/ᩳۛ;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Ll/ᩳۛ;->ۙ(I)Ljava/util/Locale;

    move-result-object v6

    if-nez v6, :cond_1

    const-string v6, "\u1a73\u073d"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x85

    const v8, -0x5a76e3f4

    xor-int/2addr v7, v8

    const v8, 0x65e45103

    goto :goto_0

    :cond_1
    move-object v2, v6

    :goto_2
    const-string v6, "\u06e2\u06e2"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x615d

    const v8, 0x38dd88ad

    xor-int/2addr v7, v8

    const v8, -0xbd22c2c

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 29
    sget v6, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v6, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v6, "\u06d7\u0736"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x79

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4543

    const v8, -0x30a3ad31

    xor-int/2addr v7, v8

    const v8, -0x77dd8e15

    goto/16 :goto_0

    .line 257
    :sswitch_9
    invoke-static {}, Ll/ܽܺۘ;->۠()Landroid/content/res/Resources;

    move-result-object v0

    .line 51
    sget v6, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v6, :cond_3

    goto :goto_3

    :cond_3
    const-string v6, "\u0736\u06e2"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xba9

    const v8, 0x1f3cf4fc

    xor-int/2addr v7, v8

    const v8, 0x582f510c

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u06e2\u05a1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x49c3

    const v8, -0x2883b54c

    xor-int/2addr v7, v8

    const v8, -0x48c69be9

    goto/16 :goto_0

    :sswitch_a
    sget v6, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v6, :cond_6

    :cond_5
    const-string v6, "\u1a7b\u1a7a"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x795f

    const v8, -0x44375da5

    xor-int/2addr v7, v8

    const v8, -0x4297507b

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u06df\u06e1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3359

    const v8, 0xb7c8988

    xor-int/2addr v7, v8

    const v8, 0x695e20df

    goto/16 :goto_0

    .line 12
    :sswitch_b
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v6

    if-eqz v6, :cond_7

    :goto_3
    const-string v6, "\u05ab\u06eb"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x13

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1263

    const v8, -0x39578e3a

    xor-int/2addr v7, v8

    const v8, 0x632484da

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u073d\u1a73"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x55

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4b1b

    const v8, -0x2d068fbf

    xor-int/2addr v7, v8

    const v8, 0x69e465

    goto/16 :goto_0

    .line 179
    :sswitch_c
    sget-boolean v6, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v6, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v6, "\u1a7b\u0733"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4145

    const v8, 0x15cba3f9

    xor-int/2addr v7, v8

    const v8, 0xa2d6018

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v6, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v6, :cond_9

    goto :goto_4

    :cond_9
    const-string v6, "\u06dc\u06e0"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7115

    const v8, -0x74d073ef

    xor-int/2addr v7, v8

    const v8, 0xcfb8771

    goto/16 :goto_0

    .line 167
    :sswitch_e
    sget-boolean v6, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v6, :cond_a

    goto :goto_5

    :cond_a
    const-string v6, "\u06d6\u1a77"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xa69

    const v8, 0x69a59a9

    xor-int/2addr v7, v8

    const v8, 0x30d68e10

    goto/16 :goto_0

    :sswitch_f
    sget v6, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v6, :cond_b

    :goto_4
    const-string v6, "\u1a73\u06e1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x230b

    const v8, 0x710c488

    xor-int/2addr v7, v8

    const v8, 0x383688d5

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u1a77\u05a8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4b8f

    const v8, -0x59b09100

    xor-int/2addr v7, v8

    const v8, -0x53c6be8

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    :goto_5
    const-string v6, "\u1a77\u06dc"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x3

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1bd5

    const v8, 0x6678a0fe

    xor-int/2addr v7, v8

    const v8, 0x4cd99670

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06e2\u073d"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7319

    const v8, 0x428480b0

    xor-int/2addr v7, v8

    const v8, 0x69dbf5e6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d98a3f0 -> :sswitch_f
        -0x71a4e0bc -> :sswitch_5
        -0x712f9d8d -> :sswitch_2
        -0x70197b9a -> :sswitch_1
        -0x6ab9767e -> :sswitch_f
        -0x59d76df0 -> :sswitch_6
        -0x573acc73 -> :sswitch_e
        -0x55c20707 -> :sswitch_5
        -0x515b5f53 -> :sswitch_4
        -0x4c6c3df3 -> :sswitch_8
        -0x4c1da378 -> :sswitch_7
        -0x3bc930da -> :sswitch_6
        -0x3ba2aa5d -> :sswitch_a
        -0x3a2c657a -> :sswitch_3
        -0x335f120d -> :sswitch_9
        -0x300f5a38 -> :sswitch_3
        -0x2c76388a -> :sswitch_4
        -0x22657a3e -> :sswitch_8
        -0x1e6dd693 -> :sswitch_b
        -0x18b8d668 -> :sswitch_c
        -0x14bc011e -> :sswitch_1
        -0x109182a2 -> :sswitch_2
        0x36d5994 -> :sswitch_d
        0x3aef2eb -> :sswitch_a
        0x1c260ced -> :sswitch_0
        0x33cd8712 -> :sswitch_0
        0x35fee3cd -> :sswitch_10
        0x535a4107 -> :sswitch_10
        0x5c85cb85 -> :sswitch_9
        0x62d3fdf5 -> :sswitch_d
        0x68730e86 -> :sswitch_c
        0x68f8dfed -> :sswitch_7
        0x74cae09f -> :sswitch_b
        0x75a0dc05 -> :sswitch_e
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/ۧ֨ۘ;)Ll/ۛ֨ۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧ֨ۘ;->ۘ:Ll/ۛ֨ۘ;

    return-object p0
.end method

.method public static ۙ(Ll/ۧ֨ۘ;Ljava/lang/Class;)V
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

    const v12, 0x4036eec5

    sget v13, Ll/֫֡;->ۡ᩹ۗ:I

    sget v14, Ll/֡᩶;->ۗ֨ܺ:I

    const-string v15, "\u06e4\u06eb"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    mul-int/lit8 v15, v15, 0x3

    xor-int v0, v15, v14

    mul-int/lit16 v0, v0, 0x97

    const v17, -0x47b1f7f6

    xor-int v0, v0, v17

    const v17, 0x1421619b

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

    const v15, 0x4036eec5

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, -0x541

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    .line 336
    invoke-virtual {v1, v4}, Ll/ۧ֨ۘ;->log(Ljava/lang/Throwable;)V

    .line 337
    invoke-static {v4}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫ۛ;->ۖۛۖ(Ljava/lang/Object;)Ll/ܺۡۜ;

    return-void

    .line 15
    :sswitch_0
    sget v0, Ll/֡ۛ;->۬᩸ܶ:I

    move-object/from16 v18, v5

    move/from16 v16, v15

    if-nez v0, :cond_e

    goto/16 :goto_c

    .line 122
    :sswitch_1
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    sget v0, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v0, :cond_0

    move/from16 v16, v15

    goto :goto_2

    :cond_0
    const-string v0, "\u073a\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    move/from16 v16, v15

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x6bd1

    const v18, -0x1c8738ef

    xor-int v15, v15, v18

    const v18, -0x5048acd7

    goto/16 :goto_9

    :sswitch_2
    move/from16 v16, v15

    .line 322
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v0

    if-gez v0, :cond_1

    goto :goto_2

    :cond_1
    move-object/from16 v18, v5

    goto/16 :goto_e

    :sswitch_3
    move/from16 v16, v15

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget-boolean v0, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-eqz v0, :cond_c

    :cond_2
    move-object/from16 v18, v5

    goto/16 :goto_b

    :sswitch_4
    move/from16 v16, v15

    .line 259
    sget-boolean v0, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v0, :cond_2

    :cond_3
    :goto_1
    move-object/from16 v18, v5

    goto/16 :goto_d

    :sswitch_5
    move/from16 v16, v15

    .line 107
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    sget v0, Ll/۟;->ۨᩴۛ:I

    if-ltz v0, :cond_5

    :cond_4
    move-object/from16 v18, v5

    goto/16 :goto_8

    :cond_5
    :goto_2
    const-string v0, "\u0730\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x4f

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x1601

    const v18, -0x7aeeaf2f

    xor-int v15, v15, v18

    const v18, 0x3fce75b0

    goto/16 :goto_9

    :sswitch_6
    move/from16 v16, v15

    .line 14
    sget v0, Ll/֫ۚ;->ܽ۠᩹:I

    if-gez v0, :cond_4

    goto :goto_1

    :sswitch_7
    move/from16 v16, v15

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    sget-boolean v0, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v0, :cond_3

    :goto_3
    move-object/from16 v18, v5

    goto/16 :goto_c

    :sswitch_8
    move/from16 v16, v15

    .line 21
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    goto :goto_3

    :sswitch_9
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    :sswitch_a
    return-void

    :sswitch_b
    move/from16 v16, v15

    .line 329
    :try_start_0
    sget-object v0, Ll/ۧ֨ۘ;->᩹ۢۜ:[S
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v15, 0x13

    move-object/from16 v18, v5

    const/16 v5, 0x10

    :try_start_1
    invoke-static {v0, v15, v5, v12}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v0

    .line 331
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v0, v5}, Ll/֫۟;->۟ۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object/from16 v18, v5

    goto/16 :goto_5

    :sswitch_c
    move-object/from16 v18, v5

    move/from16 v16, v15

    const/high16 v0, 0x10000000

    .line 333
    invoke-static {v2, v0}, Ll/֫ᩳ;->۫᩶ۜ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 334
    invoke-static {v3, v2}, Ll/ۖۧ;->ܳۨۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const-string v0, "\u06e1\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x6cdb

    const v15, 0x7edfe138

    xor-int/2addr v5, v15

    const v15, -0x4795aed4

    goto/16 :goto_f

    :sswitch_d
    move-object/from16 v18, v5

    move/from16 v16, v15

    if-eqz p1, :cond_6

    const-string v0, "\u06ec\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x33

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x5c31

    const v15, -0x7fec53d4

    xor-int/2addr v5, v15

    const v15, -0x2d6b900f

    goto/16 :goto_f

    :cond_6
    :goto_4
    const-string v0, "\u1a76\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x2d

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x7635

    const v15, 0x616c1091

    xor-int/2addr v5, v15

    const v15, -0x3f0c0033

    goto/16 :goto_f

    :sswitch_e
    move-object/from16 v18, v5

    move/from16 v16, v15

    .line 327
    :try_start_2
    invoke-static {}, Ll/֨᩸;->ۗ֫ܿ()Landroid/app/Application;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 328
    :try_start_3
    new-instance v2, Landroid/content/Intent;

    sget-object v0, Ll/᩻֨ۘ;->۬:Ljava/lang/Class;

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    sget-object v0, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    const/16 v5, 0xb

    const/16 v15, 0x8

    invoke-static {v0, v5, v15, v12}, Ll/֡ܳ;->ܶۘۙ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 87
    iget-object v5, v1, Ll/ۧ֨ۘ;->֨:Ljava/lang/String;

    .line 329
    invoke-static {v2, v0, v5}, Ll/֨ܶ;->᩸᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    const-string v0, "\u073d\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x29

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x6b21

    const v15, -0xb1ae520

    xor-int/2addr v5, v15

    const v15, 0x5e97aa02

    goto/16 :goto_f

    :catchall_1
    move-exception v0

    move-object v4, v0

    const/4 v2, 0x0

    goto :goto_6

    :catchall_2
    move-exception v0

    :goto_5
    move-object v4, v0

    :goto_6
    const-string v0, "\u0736\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x7f

    xor-int v5, v0, v14

    mul-int/lit8 v5, v5, 0x67

    const v15, -0x735c674d

    xor-int/2addr v5, v15

    const v15, -0x6e679bc9

    goto/16 :goto_f

    :sswitch_f
    move-object/from16 v18, v5

    move/from16 v16, v15

    const v0, 0xa0bd

    const v12, 0xa0bd

    goto :goto_7

    :sswitch_10
    move-object/from16 v18, v5

    move/from16 v16, v15

    const v0, 0xc495

    const v12, 0xc495

    :goto_7
    const-string v0, "\u1a73\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x7d

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, 0xc59

    const v15, 0x50aaf11a

    xor-int/2addr v5, v15

    const v15, 0x5a42b62

    goto/16 :goto_f

    :sswitch_11
    move-object/from16 v18, v5

    move/from16 v16, v15

    add-int v0, v10, v11

    sub-int/2addr v0, v9

    if-ltz v0, :cond_7

    const-string v0, "\u073d\u073a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x1cf5

    const v15, 0x5e4f308

    xor-int/2addr v5, v15

    const v15, 0x3368a36f

    goto/16 :goto_f

    :cond_7
    const-string v0, "\u06e8\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x5

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x5333

    const v15, -0x3a8eb5eb

    xor-int/2addr v5, v15

    const v15, 0x75699658

    goto/16 :goto_f

    :sswitch_12
    move-object/from16 v18, v5

    move/from16 v16, v15

    const v11, 0x142e040

    .line 218
    sget v0, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v0, :cond_8

    goto/16 :goto_e

    :cond_8
    const-string v0, "\u0733\u06d7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x47

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x23a9

    const v15, 0x56cbb5c8

    xor-int/2addr v5, v15

    const v15, 0x277e5796

    goto/16 :goto_f

    :sswitch_13
    move-object/from16 v18, v5

    move/from16 v16, v15

    mul-int v9, v7, v8

    mul-int v10, v7, v7

    .line 261
    sget-boolean v0, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v0, :cond_9

    goto/16 :goto_a

    :cond_9
    const-string v0, "\u06dc\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x57

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x48d5

    const v15, 0x56461f5e

    xor-int/2addr v5, v15

    const v15, -0x44220085

    goto/16 :goto_f

    :sswitch_14
    move-object/from16 v18, v5

    move/from16 v16, v15

    aget-short v7, v18, v6

    const/16 v8, 0x23f0

    sget-boolean v0, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v0, :cond_a

    const-string v0, "\u06e8\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x66f9

    const v15, 0x36b2cb92

    xor-int/2addr v5, v15

    const v15, -0x69bb0450

    goto/16 :goto_f

    :cond_a
    const-string v0, "\u1a77\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x1f89

    const v15, -0x41551f22

    xor-int/2addr v5, v15

    const v15, 0x5b777469

    goto/16 :goto_f

    :sswitch_15
    move-object/from16 v18, v5

    move/from16 v16, v15

    const/16 v6, 0xa

    .line 37
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v0

    if-nez v0, :cond_b

    :goto_8
    const-string v0, "\u1a79\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x47

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, 0x1ebb

    const v15, -0x1e88216

    xor-int/2addr v5, v15

    const v15, -0x8ec6810

    goto/16 :goto_f

    :cond_b
    const-string v0, "\u1a74\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x3ffb

    const v15, 0x1d9a44d

    xor-int/2addr v5, v15

    const v15, 0x364becb9

    goto/16 :goto_f

    :sswitch_16
    move/from16 v16, v15

    sget-object v5, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    .line 220
    sget v0, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v0, :cond_d

    :cond_c
    const-string v0, "\u1a78\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x3b

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x1887

    const v18, -0x3c674c8a

    xor-int v15, v15, v18

    const v18, -0x7925ab13

    goto :goto_9

    :cond_d
    const-string v0, "\u06ec\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x4c09

    const v18, -0x56de747e

    xor-int v15, v15, v18

    const v18, -0x782010f

    :goto_9
    xor-int v0, v0, v18

    move/from16 v19, v16

    move/from16 v16, v0

    move v0, v15

    move/from16 v15, v19

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v18, v5

    move/from16 v16, v15

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v0

    if-eqz v0, :cond_f

    :cond_e
    :goto_a
    const-string v0, "\u06e7\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x59d3

    const v15, 0x138e1aed

    xor-int/2addr v5, v15

    const v15, -0x77d1e936

    goto/16 :goto_f

    :cond_f
    const-string v0, "\u06e2\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x65

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x588b

    const v15, -0x24134a9e

    xor-int/2addr v5, v15

    const v15, -0x1aa199ec

    goto/16 :goto_f

    :sswitch_18
    move-object/from16 v18, v5

    move/from16 v16, v15

    .line 122
    sget v0, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v0, :cond_10

    :goto_b
    const-string v0, "\u1a73\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, 0x7aaf

    const v15, -0x7d554d18

    xor-int/2addr v5, v15

    const v15, 0x1057a5ed

    goto/16 :goto_f

    :cond_10
    const-string v0, "\u06db\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x59fb

    const v15, -0x3afe0d24

    xor-int/2addr v5, v15

    const v15, -0x4d25f557

    goto/16 :goto_f

    :sswitch_19
    move-object/from16 v18, v5

    move/from16 v16, v15

    sget v0, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v0, :cond_11

    :goto_c
    const-string v0, "\u06dc\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x61

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, 0x7447

    const v15, 0x225dad4b

    xor-int/2addr v5, v15

    const v15, -0x7d03ded3

    goto/16 :goto_f

    :cond_11
    const-string v0, "\u06e8\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x454d

    const v15, -0x3163fc3b

    xor-int/2addr v5, v15

    const v15, 0x63828442

    goto :goto_f

    :sswitch_1a
    move-object/from16 v18, v5

    move/from16 v16, v15

    .line 273
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v0

    if-ltz v0, :cond_12

    :goto_d
    const-string v0, "\u05a1\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x47

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x4713

    const v15, -0x514ff1f

    xor-int/2addr v5, v15

    const v15, 0x6b84bcac

    goto :goto_f

    :cond_12
    const-string v0, "\u1a73\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x7963

    const v15, -0xdd11a8f

    xor-int/2addr v5, v15

    const v15, -0x6dfe68e8

    goto :goto_f

    :sswitch_1b
    move-object/from16 v18, v5

    move/from16 v16, v15

    .line 216
    sget v0, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v0, :cond_13

    :goto_e
    const-string v0, "\u06e7\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0xb

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x6df1

    const v15, -0x3450341b    # -2.3041994E7f

    xor-int/2addr v5, v15

    const v15, 0x40730c05

    goto :goto_f

    :cond_13
    const-string v0, "\u073f\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x7011

    const v15, -0x2b19a726

    xor-int/2addr v5, v15

    const v15, -0x7d9ca80c

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
        -0x7e92f648 -> :sswitch_19
        -0x793951fc -> :sswitch_6
        -0x73ec5df8 -> :sswitch_3
        -0x6bf1d27d -> :sswitch_7
        -0x6b9cb4f6 -> :sswitch_1a
        -0x6aa603ba -> :sswitch_17
        -0x64bee512 -> :sswitch_1
        -0x5fe7cda7 -> :sswitch_15
        -0x5e4acb6a -> :sswitch_17
        -0x550d49e9 -> :sswitch_15
        -0x54faa235 -> :sswitch_a
        -0x5110576d -> :sswitch_4
        -0x4e922076 -> :sswitch_f
        -0x4ae9693f -> :sswitch_16
        -0x43279acd -> :sswitch_2
        -0x31dee516 -> :sswitch_0
        -0x29b9472b -> :sswitch_2
        -0x25f96ec0 -> :sswitch_1a
        -0x21616eae -> :sswitch_12
        -0x20badfde -> :sswitch_12
        -0x20b2bb4b -> :sswitch_9
        -0x1d64b2b5 -> :sswitch_8
        -0x1bd292ae -> :sswitch_11
        -0x1053becf -> :sswitch_8
        -0xbc3182a -> :sswitch_0
        -0x5133b67 -> :sswitch_7
        -0x20ef09 -> :sswitch_b
        0x33b4e03 -> :sswitch_5
        0xc84242b -> :sswitch_e
        0x13ae3eb8 -> :sswitch_1
        0x145a50f6 -> :sswitch_f
        0x19364c37 -> :sswitch_4
        0x1d10c2f7 -> :sswitch_1b
        0x1e7a661e -> :sswitch_19
        0x28cfdda3 -> :sswitch_9
        0x28d0679a -> :sswitch_d
        0x28e8f2e5 -> :sswitch_1b
        0x2ed2662a -> :sswitch_3
        0x3be7651b -> :sswitch_18
        0x45e88b57 -> :sswitch_c
        0x481bea4d -> :sswitch_13
        0x4ed3a9e0 -> :sswitch_b
        0x4f981e00 -> :sswitch_16
        0x54a59627 -> :sswitch_a
        0x551bc6d2 -> :sswitch_c
        0x5bbb2952 -> :sswitch_13
        0x5bf4a419 -> :sswitch_18
        0x5cd24b39 -> :sswitch_11
        0x6b0d7951 -> :sswitch_10
        0x6e2dea26 -> :sswitch_14
        0x6e6e21ac -> :sswitch_14
        0x76c7a4d4 -> :sswitch_d
        0x78d9ace7 -> :sswitch_10
        0x794aaa45 -> :sswitch_6
        0x79a1151f -> :sswitch_e
        0x7a4bcc48 -> :sswitch_5
    .end sparse-switch
.end method

.method public static ܰ(Ljava/lang/String;)Ljava/lang/String;
    .locals 22

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

    const v16, -0x4db13e1c

    sget v17, Ll/֡۠;->ۛ᩻ۧ:I

    sget v18, Ll/֫۟;->᩸ᩴܿ:I

    const-string v19, "\u06d6\u06e4"

    invoke-static/range {v19 .. v19}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v19

    sub-int v19, v17, v19

    mul-int/lit8 v19, v19, -0x27

    xor-int v0, v19, v18

    mul-int/lit16 v0, v0, 0x20b7

    const v21, 0xb5856bf

    xor-int v0, v0, v21

    const v21, 0x149e2981

    xor-int v19, v19, v21

    move-object/from16 v16, v3

    move-object v12, v11

    move-object v14, v13

    move/from16 v20, v19

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const v19, -0x4db13e1c

    const/16 v21, 0x0

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v5, v19, v18

    mul-int/lit16 v5, v5, 0x71bf

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v19, v20, v0

    sparse-switch v19, :sswitch_data_0

    const v0, 0xa646

    const v11, 0xa646

    goto/16 :goto_2

    :sswitch_0
    sget v0, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v0, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v0, "\u1a76\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x5f

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x4f4f

    const v20, -0x78d9a666

    xor-int v5, v5, v20

    const v20, -0x46603ec8

    goto/16 :goto_7

    .line 47
    :sswitch_1
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    sget v0, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v0, :cond_c

    goto/16 :goto_4

    .line 287
    :sswitch_2
    sget v0, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v0, :cond_a

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    move-object/from16 v0, p0

    .line 376
    invoke-static {v2, v0}, Ll/ۗܺ;->ۖۗܺ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_1

    :sswitch_6
    move-object/from16 v0, p0

    .line 375
    invoke-static {v14, v15, v4, v11}, Ll/ۖۧ;->᩶ܽܽ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Ll/֨᩹;->ۧ᩸᩹(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    const-string v5, "\u1a7b\u06d9"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v18, v5

    mul-int/lit8 v5, v5, -0x63

    xor-int v0, v5, v17

    mul-int/lit16 v0, v0, -0x2079

    const v20, -0x781dec1

    xor-int v0, v0, v20

    const v20, 0x5139a48e

    xor-int v20, v5, v20

    goto :goto_0

    :sswitch_7
    const/16 v4, 0x8

    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v0, "\u06d7\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x3c3b

    const v20, 0x6d1efc20

    xor-int v5, v5, v20

    const v20, 0x3909cd59

    goto/16 :goto_7

    :sswitch_8
    sget-object v14, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    const/16 v15, 0x2b

    .line 101
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v0, "\u1a77\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x59

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x26cd

    const v20, 0x5dcc96bc

    xor-int v5, v5, v20

    const v20, 0x5b8b52bb

    goto/16 :goto_7

    :sswitch_9
    return-object v3

    :sswitch_a
    const/4 v0, 0x7

    .line 374
    invoke-static {v12, v13, v0, v11}, Ll/ۘۛ;->᩷ۧ᩹([SIII)Ljava/lang/String;

    move-result-object v2

    .line 375
    invoke-static {v1, v2}, Ll/ۗ᩺;->ۛ֡ܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "\u1a76\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x5

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x3835

    const v20, 0x11d5d169

    xor-int v5, v5, v20

    const v20, 0x59459c91

    goto/16 :goto_7

    :cond_3
    move-object/from16 v3, p0

    :goto_1
    const-string v0, "\u06e0\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x4f

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x111

    const v20, -0x46ef9554

    xor-int v5, v5, v20

    const v20, -0x3a12ec4d

    goto/16 :goto_7

    :sswitch_b
    const/16 v13, 0x24

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v0

    if-ltz v0, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v0, "\u06eb\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x7

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x1535

    const v20, 0x13cc5c2e

    xor-int v5, v5, v20

    const v20, 0x3bc94ed1

    goto/16 :goto_7

    .line 374
    :sswitch_c
    invoke-static/range {p0 .. p0}, Ll/ۗ۬;->᩻᩹᩶(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v12, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    .line 285
    sget v0, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v0, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v0, "\u0733\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x15

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x164d

    const v20, 0x725e2732

    xor-int v5, v5, v20

    const v20, -0x5ce654d4

    goto/16 :goto_7

    :sswitch_d
    const/16 v0, 0xd2c

    const/16 v11, 0xd2c

    :goto_2
    const-string v0, "\u06da\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x1bcd

    const v20, -0x22ea6595

    xor-int v5, v5, v20

    const v20, 0x5b558ade

    goto/16 :goto_7

    :sswitch_e
    add-int v0, v9, v10

    sub-int v0, v8, v0

    if-lez v0, :cond_6

    const-string v0, "\u073d\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x381b

    const v20, -0x24fbef31

    xor-int v5, v5, v20

    const v20, -0x6ce93286

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u1a75\u1a75"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, -0x3341

    const v20, 0x429d2dc2

    xor-int v5, v5, v20

    const v20, 0x67eec031

    goto/16 :goto_7

    :sswitch_f
    const v10, 0x1f1d90

    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v0, "\u06e7\u06e0"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, -0x77d1

    const v20, -0x46317927

    xor-int v5, v5, v20

    const v20, 0x67fc41ac

    goto/16 :goto_7

    :sswitch_10
    mul-int v8, v6, v7

    mul-int v9, v6, v6

    .line 27
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v0

    if-gtz v0, :cond_8

    goto :goto_3

    :cond_8
    const-string v0, "\u06e4\u06da"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x7b

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x5701

    const v20, 0x224b50d4

    xor-int v5, v5, v20

    const v20, 0x45c5337d

    goto/16 :goto_7

    :sswitch_11
    aget-short v6, v16, v21

    const/16 v7, 0xb28

    .line 266
    sget v0, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v0, :cond_9

    :goto_3
    const-string v0, "\u073d\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, -0x46fd

    const v20, -0x1f8df0ee

    xor-int v5, v5, v20

    const v20, 0x3fef0138

    goto/16 :goto_7

    :cond_9
    const-string v0, "\u06d7\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x61

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x1627

    const v20, -0x135866dd

    xor-int v5, v5, v20

    const v20, 0x52386f7d

    goto/16 :goto_7

    :sswitch_12
    const/16 v21, 0x23

    .line 32
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v0

    if-ltz v0, :cond_b

    :cond_a
    :goto_4
    const-string v0, "\u06d8\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x7b15

    const v20, 0x1fe989fc

    xor-int v5, v5, v20

    const v20, 0x1c98140c

    goto/16 :goto_7

    :cond_b
    const-string v0, "\u073a\u1a7a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x57

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, -0x2db9

    const v20, -0x4f97480d

    xor-int v5, v5, v20

    const v20, -0x11026d13

    goto :goto_7

    :sswitch_13
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_c
    :goto_5
    const-string v0, "\u06eb\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, -0x38d9

    const v20, 0x238cf92f

    xor-int v5, v5, v20

    const v20, -0x7a06f890

    goto :goto_7

    :cond_d
    const-string v0, "\u1a78\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, -0x39eb

    const v20, -0x2ad836be

    xor-int v5, v5, v20

    const v20, -0x4e642c4c

    goto :goto_7

    :sswitch_14
    sget-object v16, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    sget v0, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v0, :cond_e

    :goto_6
    const-string v0, "\u073d\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x7f

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, -0x1baf

    const v20, -0x610f8097

    xor-int v5, v5, v20

    const v20, -0x4fffcb9f

    goto :goto_7

    :cond_e
    const-string v0, "\u06e7\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x71b5

    const v20, -0x69fa79e8

    xor-int v5, v5, v20

    const v20, -0x3a8325c2

    :goto_7
    xor-int v20, v0, v20

    move v0, v5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x741ddc67 -> :sswitch_3
        -0x72435196 -> :sswitch_f
        -0x713a3527 -> :sswitch_12
        -0x6b059493 -> :sswitch_14
        -0x699e06d0 -> :sswitch_14
        -0x67712689 -> :sswitch_2
        -0x5f5a47d2 -> :sswitch_6
        -0x53430290 -> :sswitch_2
        -0x53101441 -> :sswitch_12
        -0x49a4083e -> :sswitch_d
        -0x35f88a4a -> :sswitch_8
        -0x3204d686 -> :sswitch_5
        -0x31e5e905 -> :sswitch_b
        -0x2e84d725 -> :sswitch_4
        -0x2a02b6f7 -> :sswitch_10
        -0x2211114d -> :sswitch_9
        -0x14ce0c3c -> :sswitch_e
        -0x142f42bb -> :sswitch_1
        -0x121f6b94 -> :sswitch_11
        -0x102c47f9 -> :sswitch_4
        -0xeaf4f35 -> :sswitch_7
        -0x4f43439 -> :sswitch_8
        0x46cc645 -> :sswitch_d
        0x12458f1c -> :sswitch_7
        0x1fabcb7d -> :sswitch_a
        0x2148a9cd -> :sswitch_11
        0x2298f886 -> :sswitch_0
        0x247e178a -> :sswitch_6
        0x370126c2 -> :sswitch_10
        0x3d8f3c73 -> :sswitch_5
        0x3f8e37bf -> :sswitch_3
        0x3fa1eff7 -> :sswitch_0
        0x46225219 -> :sswitch_c
        0x5206ea75 -> :sswitch_13
        0x55170989 -> :sswitch_13
        0x631150ce -> :sswitch_f
        0x64e54e90 -> :sswitch_9
        0x661be7aa -> :sswitch_a
        0x67c44b39 -> :sswitch_b
        0x6a2ffa0a -> :sswitch_c
        0x70573127 -> :sswitch_1
        0x7a8b9e12 -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final cancelToast()V
    .locals 6

    const v0, 0x708c3322

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v2, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v3, "\u06d6\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6193

    const v5, -0x321a8fd9    # -4.8116656E8f

    xor-int/2addr v4, v5

    const v5, -0x4bd8abb2

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x385d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 484
    sget-object v3, Ll/᩷᩹ۘ;->᩹:Ll/֡֨ۘ;

    .line 470
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_c

    goto/16 :goto_4

    .line 321
    :sswitch_0
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u06e0\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x31f

    const v5, 0x19558313

    xor-int/2addr v4, v5

    const v5, 0x2cdf0d0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v3

    if-gtz v3, :cond_5

    goto :goto_1

    :sswitch_2
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_b

    goto :goto_1

    .line 426
    :sswitch_3
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    return-void

    .line 94
    :sswitch_5
    new-instance v3, Ll/ᩴ᩺ۘ;

    .line 431
    sget-boolean v4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const/4 v0, 0x1

    .line 94
    invoke-direct {v3, v0}, Ll/ᩴ᩺ۘ;-><init>(I)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :sswitch_6
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_2

    :goto_1
    const-string v3, "\u06da\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7099

    const v5, -0x5127d92b

    xor-int/2addr v4, v5

    const v5, -0x4944b40a

    goto :goto_0

    :cond_2
    const-string v3, "\u06e7\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xc51

    const v5, 0x49223975

    xor-int/2addr v4, v5

    const v5, -0x1b1566b1

    goto/16 :goto_0

    :sswitch_7
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u1a79\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1785

    const v5, 0x336ce4aa    # 5.5156E-8f

    xor-int/2addr v4, v5

    const v5, -0x12379a19

    goto/16 :goto_0

    .line 148
    :sswitch_8
    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u1a76\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4fdb

    const v5, -0x1124fb1e

    xor-int/2addr v4, v5

    const v5, 0x417d0592

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v3

    if-ltz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u1a77\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2eb5

    const v5, 0x6b157067

    xor-int/2addr v4, v5

    const v5, -0x3878fa14

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u05ab\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x9ab

    const v5, -0x2b25a50e

    xor-int/2addr v4, v5

    const v5, 0x5f33bb75

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u06dc\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6727

    const v5, 0x68093761

    xor-int/2addr v4, v5

    const v5, -0x78d4cb17

    goto/16 :goto_0

    .line 272
    :sswitch_b
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v3

    if-ltz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u05ab\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x24b9

    const v5, 0x3bcb11a8

    xor-int/2addr v4, v5

    const v5, 0x11792dbf

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u1a7b\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6183

    const v5, -0x2010f6e8

    xor-int/2addr v4, v5

    const v5, -0x73d174

    goto/16 :goto_0

    .line 59
    :sswitch_d
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_a

    :goto_3
    const-string v3, "\u06d7\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1145

    const v5, -0x784008e9

    xor-int/2addr v4, v5

    const v5, 0xc8faf99

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06df\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6fb1

    const v5, -0x17023320

    xor-int/2addr v4, v5

    const v5, -0x5d396b3d

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v3, "\u06df\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7eed

    const v5, 0x286b3a78

    xor-int/2addr v4, v5

    const v5, 0x5b9ab91c

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xa53

    const v5, -0x251ab42c

    xor-int/2addr v4, v5

    const v5, 0x3e4eb4b8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fba8063 -> :sswitch_3
        -0x7e9c213b -> :sswitch_0
        -0x7aba3a14 -> :sswitch_c
        -0x702f5a72 -> :sswitch_6
        -0x6e9d6ec9 -> :sswitch_b
        -0x6c5396cb -> :sswitch_5
        -0x5c30c694 -> :sswitch_1
        -0x49e652a4 -> :sswitch_c
        -0x3e379002 -> :sswitch_a
        -0x3728f78d -> :sswitch_b
        -0x36b92711 -> :sswitch_d
        -0x34cc8ca6 -> :sswitch_4
        -0x24d2185a -> :sswitch_2
        -0xab25215 -> :sswitch_9
        -0x1e51887 -> :sswitch_d
        0x9d7187b -> :sswitch_0
        0xd135c7c -> :sswitch_7
        0xf116cac -> :sswitch_8
        0x27bb90ac -> :sswitch_4
        0x2ab0fc10 -> :sswitch_8
        0x35aad819 -> :sswitch_9
        0x457f591b -> :sswitch_3
        0x45e85020 -> :sswitch_5
        0x4cc93f4b -> :sswitch_6
        0x64f67392 -> :sswitch_1
        0x64fc9fbd -> :sswitch_7
        0x66862b1e -> :sswitch_2
        0x6705a96c -> :sswitch_a
    .end sparse-switch
.end method

.method public final getAssetLocalString(Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 290
    invoke-virtual {p0, p1}, Ll/ۧ֨ۘ;->ۙ(Ljava/lang/String;)Ll/֡֨ۘ;

    move-result-object p1

    return-object p1
.end method

.method public final getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x62c3c288

    sget v4, Ll/֨ۧ;->֫۠֡:I

    sget v5, Ll/֫֡;->ۡ᩹ۗ:I

    const-string v6, "\u1a7b\u1a74"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x21a9

    const v8, 0x5961c680

    xor-int/2addr v7, v8

    const v8, -0x198ebcdc

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x247d

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 76
    move-object v1, v0

    check-cast v1, Ll/ۨ᩹ۘ;

    .line 110
    sget v6, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v6, :cond_2

    goto/16 :goto_2

    .line 25
    :sswitch_0
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    sget v6, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v6, :cond_6

    goto/16 :goto_4

    .line 151
    :sswitch_1
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget v6, Ll/ۗܺ;->ۨ᩺۠:I

    if-lez v6, :cond_8

    goto/16 :goto_3

    :sswitch_2
    sget-boolean v6, Ll/֨֫;->᩸ۜ᩵:Z

    if-nez v6, :cond_c

    goto/16 :goto_3

    .line 112
    :sswitch_3
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    goto/16 :goto_3

    .line 89
    :sswitch_4
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    const/4 p1, 0x0

    return-object p1

    .line 155
    :sswitch_5
    iget-object v0, p0, Ll/ۧ֨ۘ;->ۘ:Ll/ۛ֨ۘ;

    invoke-interface {v0, p1}, Ll/ۛ֨ۘ;->getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 76
    :sswitch_6
    iput-object v2, p0, Ll/ۧ֨ۘ;->ۘ:Ll/ۛ֨ۘ;

    .line 77
    new-instance v6, Ll/ܿ֨ۘ;

    .line 63
    sget v7, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v7, :cond_0

    goto/16 :goto_4

    .line 77
    :cond_0
    invoke-direct {v6, p0}, Ll/ܿ֨ۘ;-><init>(Ll/ۧ֨ۘ;)V

    iput-object v6, p0, Ll/ۧ֨ۘ;->᩺:Ll/ۤ֨ۘ;

    goto :goto_1

    .line 76
    :sswitch_7
    invoke-static {v1}, Ll/ۨ᩹ۘ;->ۙ(Ll/ۨ᩹ۘ;)Ll/ۗۚۘ;

    move-result-object v2

    .line 42
    sget v6, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v6, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v6, "\u1a7a\u1a74"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x614d

    const v8, 0x5d7b383b

    xor-int/2addr v7, v8

    const v8, -0x78c306b5

    goto :goto_0

    :cond_2
    const-string v6, "\u1a7b\u0736"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x3d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x65bd

    const v8, -0x2ef9f57f

    xor-int/2addr v7, v8

    const v8, -0x7da2cda6

    goto/16 :goto_0

    .line 76
    :sswitch_8
    iget-object v0, p0, Ll/ۧ֨ۘ;->ۜ:Ll/ܳۡۘ;

    iget-object v0, v0, Ll/ܳۡۘ;->ܺ:Ljava/lang/Object;

    .line 93
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v6

    if-ltz v6, :cond_3

    goto :goto_2

    :cond_3
    const-string v6, "\u06d6\u0736"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xf3d

    const v8, 0x167365a3

    xor-int/2addr v7, v8

    const v8, -0x7d5cc0ac

    goto/16 :goto_0

    .line 74
    :sswitch_9
    iget-object v6, p0, Ll/ۧ֨ۘ;->ۘ:Ll/ۛ֨ۘ;

    if-eqz v6, :cond_4

    :goto_1
    const-string v6, "\u1a73\u1a76"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x5

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x11b1

    const v8, 0x407e29b6

    xor-int/2addr v7, v8

    const v8, 0x506107b4

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u06d6\u06e7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x21

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2a01

    const v8, 0x4a85234f    # 4362663.5f

    xor-int/2addr v7, v8

    const v8, 0x1f431edf

    goto/16 :goto_0

    .line 94
    :sswitch_a
    sget v6, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v6, :cond_5

    :goto_2
    const-string v6, "\u06e2\u073f"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x2b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x359d

    const v8, 0x5d4733e1

    xor-int/2addr v7, v8

    const v8, -0x3e700c91

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u06db\u0730"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6097

    const v8, 0x7d35bba7

    xor-int/2addr v7, v8

    const v8, 0xba9e4fb

    goto/16 :goto_0

    .line 153
    :sswitch_b
    sget v6, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v6, :cond_7

    :cond_6
    const-string v6, "\u1a7a\u06d8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6dbb

    const v8, 0x5ef73d95

    xor-int/2addr v7, v8

    const v8, -0x5ba8a816

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06e1\u06e2"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x5f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xcbf

    const v8, 0xebbded7

    xor-int/2addr v7, v8

    const v8, -0x3141f318

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v6, :cond_9

    :cond_8
    const-string v6, "\u06df\u073f"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x3d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x10bf

    const v8, 0x7bb896db

    xor-int/2addr v7, v8

    const v8, -0x843aeba

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u0736\u05a8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x17

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4c6d

    const v8, -0x2d4b4e35

    xor-int/2addr v7, v8

    const v8, 0x15411e73    # 3.900006E-26f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v6

    if-eqz v6, :cond_a

    :goto_3
    const-string v6, "\u06eb\u0736"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2ee5

    const v8, 0x5f26131b

    xor-int/2addr v7, v8

    const v8, -0x29812e54

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u0736\u1a75"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x15

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x69dd

    const v8, -0x5b0b0f22

    xor-int/2addr v7, v8

    const v8, -0x1dd57751

    goto/16 :goto_0

    :sswitch_e
    sget v6, Ll/֫;->ܶܺ᩻:I

    if-ltz v6, :cond_b

    goto :goto_4

    :cond_b
    const-string v6, "\u05a1\u06d6"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x4f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x58eb

    const v8, 0x154a35ab

    xor-int/2addr v7, v8

    const v8, -0x40ce833e

    goto/16 :goto_0

    .line 121
    :sswitch_f
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v6

    if-gtz v6, :cond_d

    :cond_c
    :goto_4
    const-string v6, "\u1a7a\u06db"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0xf

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x10c1

    const v8, 0x3a7369a9

    xor-int/2addr v7, v8

    const v8, 0x559fc768

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u1a77\u06e1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7a17

    const v8, -0x7dc1451c

    xor-int/2addr v7, v8

    const v8, 0x76c378d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d3d8980 -> :sswitch_2
        -0x7c31daed -> :sswitch_f
        -0x7a6a382d -> :sswitch_8
        -0x71e4ce5c -> :sswitch_4
        -0x69ad046e -> :sswitch_e
        -0x5d8c6cdd -> :sswitch_c
        -0x5933da67 -> :sswitch_b
        -0x49bf7b1d -> :sswitch_1
        -0x46ed4d1f -> :sswitch_5
        -0x45cbe0fe -> :sswitch_8
        -0x432ad145 -> :sswitch_7
        -0x42ecbbdd -> :sswitch_d
        -0x2f707bb1 -> :sswitch_3
        -0x2805eb8c -> :sswitch_0
        -0x20a5742e -> :sswitch_6
        -0x205b6b21 -> :sswitch_f
        -0x191c4c80 -> :sswitch_7
        -0xfa104b9 -> :sswitch_a
        -0x3ceae29 -> :sswitch_1
        0x7bb79ba -> :sswitch_d
        0x7bfe682 -> :sswitch_9
        0x28dce2bd -> :sswitch_0
        0x2a580c5c -> :sswitch_6
        0x35e2cd4c -> :sswitch_2
        0x36923f17 -> :sswitch_b
        0x3daf6b64 -> :sswitch_a
        0x41c3031b -> :sswitch_c
        0x5323fb0b -> :sswitch_5
        0x53cc02ed -> :sswitch_9
        0x58c3a17d -> :sswitch_4
        0x62d325a9 -> :sswitch_e
        0x7821d976 -> :sswitch_3
    .end sparse-switch
.end method

.method public final getClipboardText()Ljava/lang/CharSequence;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x3840149b

    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    sget v5, Ll/֨ۧ;->֫۠֡:I

    const-string v6, "\u06e8\u1a75"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x35

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1497

    const v8, -0xb7d3f04

    xor-int/2addr v7, v8

    const v8, -0x370366a8    # -517322.75f

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x544b

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    return-object v2

    :sswitch_0
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    sget-boolean v6, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-nez v6, :cond_c

    goto/16 :goto_5

    .line 120
    :sswitch_1
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v6, Ll/֡᩶;->ۗ֨ܺ:I

    if-lez v6, :cond_a

    goto :goto_1

    .line 235
    :sswitch_2
    sget v6, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v6, :cond_8

    goto :goto_1

    .line 18
    :sswitch_3
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    :goto_1
    const-string v6, "\u1a79\u06e7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x2f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1957

    const v8, 0x233dcfe2

    xor-int/2addr v7, v8

    const v8, -0x5586526d

    goto :goto_0

    .line 135
    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    :try_start_0
    const-string v2, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :sswitch_6
    if-nez v0, :cond_0

    const-string v6, "\u1a76\u0730"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x17

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5047

    const v8, -0x36568d4b

    xor-int/2addr v7, v8

    const v8, 0x568b1468

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_2
    const-string v6, "\u1a7a\u073f"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1eed

    const v8, -0x5729be67

    xor-int/2addr v7, v8

    const v8, -0x27b53df0

    goto :goto_0

    .line 407
    :sswitch_7
    invoke-static {v1}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 404
    :sswitch_8
    :try_start_1
    invoke-direct {p0}, Ll/ۧ֨ۘ;->ۙ()Landroid/content/ClipboardManager;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "\u1a75\u06e7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x29

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7b4b

    const v8, 0x6571a447

    xor-int/2addr v7, v8

    const v8, 0x225c4e4

    goto/16 :goto_0

    :catchall_0
    move-exception v1

    const-string v6, "\u06e2\u1a78"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x37

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x575b

    const v8, -0x5aa9997c

    xor-int/2addr v7, v8

    const v8, 0x1c4e1ada

    goto/16 :goto_0

    .line 54
    :sswitch_9
    sget v6, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v6, "\u073a\u1a74"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x28d1

    const v8, 0x2bda3bfe

    xor-int/2addr v7, v8

    const v8, 0x6eafe285

    goto/16 :goto_0

    .line 80
    :sswitch_a
    sget-boolean v6, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v6, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v6, "\u06d6\u1a74"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x6d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2793

    const v8, -0x70ac4237

    xor-int/2addr v7, v8

    const v8, -0x70ff60ea

    goto/16 :goto_0

    .line 247
    :sswitch_b
    sget-boolean v6, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    const-string v6, "\u06d7\u1a76"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x2d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5579

    const v8, -0x56485f45

    xor-int/2addr v7, v8

    const v8, 0x520e1c8e

    goto/16 :goto_0

    .line 28
    :sswitch_c
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v6

    if-nez v6, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v6, "\u06d6\u06e8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2189

    const v8, 0x65898997

    xor-int/2addr v7, v8

    const v8, 0x30edcace

    goto/16 :goto_0

    .line 81
    :sswitch_d
    sget v6, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v6, :cond_5

    goto :goto_4

    :cond_5
    const-string v6, "\u073d\u06e0"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x71

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x653d

    const v8, 0x77d224dd

    xor-int/2addr v7, v8

    const v8, -0x60aa4b02

    goto/16 :goto_0

    :sswitch_e
    sget v6, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v6, :cond_6

    goto :goto_3

    :cond_6
    const-string v6, "\u06da\u1a7b"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2ae9

    const v8, 0x70202d35

    xor-int/2addr v7, v8

    const v8, -0x3e7cb54b

    goto/16 :goto_0

    .line 235
    :sswitch_f
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v6

    if-gtz v6, :cond_7

    :goto_3
    const-string v6, "\u1a7b\u06eb"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2053

    const v8, -0x703c1492

    xor-int/2addr v7, v8

    const v8, 0x1497975

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06dc\u06d9"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4bb

    const v8, 0x57c14964

    xor-int/2addr v7, v8

    const v8, 0x34a0fb09

    goto/16 :goto_0

    .line 314
    :sswitch_10
    sget-boolean v6, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v6, :cond_9

    :cond_8
    :goto_4
    const-string v6, "\u1a73\u1a74"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x357d

    const v8, -0x14a7e0b5

    xor-int/2addr v7, v8

    const v8, 0x638781f5    # 4.9993497E21f

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06dc\u06db"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x61

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x24b

    const v8, -0x72dabebc

    xor-int/2addr v7, v8

    const v8, 0x1567ba9b

    goto/16 :goto_0

    :sswitch_11
    sget v6, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v6, :cond_b

    :cond_a
    :goto_5
    const-string v6, "\u06d7\u1a78"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5667

    const v8, 0x70be86b5

    xor-int/2addr v7, v8

    const v8, 0x6a27e2fd

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u1a7b\u06e1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x23

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3527

    const v8, 0x41a6e2ad

    xor-int/2addr v7, v8

    const v8, 0x101b9ce4

    goto/16 :goto_0

    .line 8
    :sswitch_12
    sget v6, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v6, :cond_d

    :cond_c
    :goto_6
    const-string v6, "\u06e1\u06da"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4365

    const v8, 0x7d78aa61

    xor-int/2addr v7, v8

    const v8, -0x1b9bc314

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06e7\u06dc"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x3f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x65c3

    const v8, -0x738eb33e

    xor-int/2addr v7, v8

    const v8, 0x7a922fd1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a402495 -> :sswitch_a
        -0x7721eadf -> :sswitch_c
        -0x6ffb67db -> :sswitch_5
        -0x660ffd16 -> :sswitch_f
        -0x5de31376 -> :sswitch_12
        -0x5a2e639a -> :sswitch_0
        -0x383f54ae -> :sswitch_7
        -0x378016f7 -> :sswitch_4
        -0x32ab351f -> :sswitch_6
        -0x1ea45d2b -> :sswitch_3
        -0x1c5c1a92 -> :sswitch_12
        -0x1866370d -> :sswitch_9
        -0xb3c8ee5 -> :sswitch_e
        -0x6fbefe4 -> :sswitch_10
        -0x10f64a7 -> :sswitch_11
        0x1e0f53b -> :sswitch_d
        0x4225622 -> :sswitch_4
        0xb133191 -> :sswitch_8
        0xbe863eb -> :sswitch_e
        0xf9b2512 -> :sswitch_2
        0x183bf064 -> :sswitch_3
        0x1e22938b -> :sswitch_5
        0x22354d6d -> :sswitch_11
        0x2407b19a -> :sswitch_1
        0x297e362e -> :sswitch_d
        0x342f9bff -> :sswitch_6
        0x55513972 -> :sswitch_b
        0x578c1af0 -> :sswitch_b
        0x595ed127 -> :sswitch_2
        0x598507ec -> :sswitch_c
        0x59944135 -> :sswitch_7
        0x5faee173 -> :sswitch_1
        0x6147c464 -> :sswitch_f
        0x64f66bcb -> :sswitch_0
        0x65afb55f -> :sswitch_9
        0x6cbb084e -> :sswitch_10
        0x7715b404 -> :sswitch_8
        0x7c7976be -> :sswitch_a
    .end sparse-switch
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    .line 144
    invoke-static {}, Ll/᩷᩹ۘ;->ܰ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getFileLocalString(Ljava/io/File;Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

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

    const v13, -0x4f000e23

    sget v14, Ll/֨ۧ;->֫۠֡:I

    sget v15, Ll/ۘ֡;->ܰ֡ܽ:I

    const-string v16, "\u06e7\u1a76"

    invoke-static/range {v16 .. v16}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    xor-int v2, v16, v15

    mul-int/lit16 v2, v2, -0x648b

    const v18, 0x35f5aeea

    xor-int v2, v2, v18

    const v18, -0x564a2987

    xor-int v16, v16, v18

    move-object/from16 v18, v6

    move/from16 v17, v16

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, -0x4f000e23

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v7, v16, v15

    mul-int/lit16 v7, v7, -0x443b

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v2, v7

    xor-int v16, v17, v2

    sparse-switch v16, :sswitch_data_0

    move/from16 v19, v8

    move/from16 v17, v9

    move/from16 v20, v11

    move-object/from16 v9, p1

    add-int/lit8 v2, v12, 0x1

    sub-int/2addr v2, v10

    if-gtz v2, :cond_a

    const-string v2, "\u06e2\u06e1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v15

    mul-int/lit8 v2, v2, -0x21

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, 0x4d73

    const v8, 0x2b1502b

    xor-int/2addr v7, v8

    const v8, -0x63a8695b

    goto/16 :goto_e

    .line 276
    :sswitch_0
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget v2, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v2, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v19, v8

    move/from16 v17, v9

    move/from16 v20, v11

    move-object/from16 v9, p1

    goto/16 :goto_d

    :sswitch_1
    sget-boolean v2, Ll/֫ܶ;->ۧ᩵۫:Z

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    move/from16 v19, v8

    move/from16 v17, v9

    move-object/from16 v9, p1

    goto/16 :goto_9

    .line 131
    :sswitch_2
    sget v2, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v2, :cond_2

    :goto_1
    move/from16 v17, v9

    goto :goto_3

    :cond_2
    :goto_2
    const-string v2, "\u06ec\u06e7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v15

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, -0x56b

    const v17, 0x74678612

    xor-int v7, v7, v17

    const v17, -0x19421f35

    xor-int v17, v2, v17

    goto/16 :goto_11

    .line 83
    :sswitch_3
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    const/4 v1, 0x0

    return-object v1

    .line 302
    :sswitch_5
    new-instance v2, Ll/֡֨ۘ;

    .line 47
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    sget-boolean v17, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v17, :cond_3

    move/from16 v17, v9

    move/from16 v20, v11

    move-object/from16 v9, p1

    goto/16 :goto_c

    :cond_3
    move/from16 v17, v9

    .line 47
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v9

    invoke-static {v7, v9}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    sget-boolean v9, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v9, :cond_4

    :goto_3
    const-string v2, "\u06e1\u06e7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v7, v2, v15

    mul-int/lit16 v7, v7, -0x47dd

    const v9, 0x3741d2fa

    xor-int/2addr v7, v9

    const v9, 0x508edd42

    xor-int/2addr v2, v9

    move/from16 v9, v17

    goto/16 :goto_10

    .line 47
    :cond_4
    sget-object v9, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    move/from16 v19, v8

    const/16 v8, 0x34

    move/from16 v20, v11

    const/4 v11, 0x1

    invoke-static {v9, v8, v11, v13}, Ll/֡᩶;->ۢۖ۟([SIII)Ljava/lang/String;

    move-result-object v8

    .line 139
    sget v9, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v9, :cond_5

    :goto_4
    move-object/from16 v9, p1

    :goto_5
    move/from16 v8, v19

    goto/16 :goto_c

    .line 47
    :cond_5
    invoke-static {v7, v8}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v7, v1}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v7}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 368
    sget-boolean v8, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v8, :cond_6

    goto :goto_4

    .line 47
    :cond_6
    new-instance v8, Ll/۟֨ۘ;

    move-object/from16 v9, p1

    invoke-direct {v8, v9}, Ll/۟֨ۘ;-><init>(Ljava/io/File;)V

    .line 182
    sget v11, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v11, :cond_7

    move/from16 v11, v20

    goto/16 :goto_9

    .line 47
    :cond_7
    invoke-direct {v2, v0, v1, v7, v8}, Ll/֡֨ۘ;-><init>(Ll/ۧ֨ۘ;Ljava/lang/String;Ljava/lang/String;Ll/ۤ֨ۘ;)V

    .line 303
    new-instance v6, Ljava/lang/ref/SoftReference;

    invoke-direct {v6, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 304
    invoke-virtual {v3, v1, v6}, Ll/۫۠;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v6, v2

    goto :goto_6

    :sswitch_6
    return-object v6

    :sswitch_7
    move/from16 v19, v8

    move/from16 v17, v9

    move/from16 v20, v11

    move-object/from16 v9, p1

    .line 299
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡֨ۘ;

    goto :goto_7

    :sswitch_8
    move/from16 v19, v8

    move/from16 v17, v9

    move/from16 v20, v11

    move-object/from16 v9, p1

    if-nez v5, :cond_8

    const-string v2, "\u1a79\u073a"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v15

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, 0x5a47

    const v8, -0x5e4c2280

    xor-int/2addr v7, v8

    const v8, 0x544fb73

    goto/16 :goto_e

    :cond_8
    move-object v6, v5

    :goto_6
    const-string v2, "\u06df\u1a75"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v7, v2, v15

    mul-int/lit16 v7, v7, 0x6451

    const v8, -0x64da6713

    xor-int/2addr v7, v8

    const v8, -0x15b261c0

    goto/16 :goto_e

    :sswitch_9
    move/from16 v19, v8

    move/from16 v17, v9

    move/from16 v20, v11

    move-object/from16 v9, p1

    .line 369
    iget-object v3, v0, Ll/ۧ֨ۘ;->ۚ:Ll/۫۠;

    const/4 v2, 0x0

    invoke-virtual {v3, v1, v2}, Ll/۫۠;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 296
    check-cast v4, Ljava/lang/ref/Reference;

    if-eqz v4, :cond_9

    const-string v2, "\u06d9\u1a76"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v7, v2, v15

    mul-int/lit16 v7, v7, -0x137d

    const v8, -0x4349da22

    xor-int/2addr v7, v8

    const v8, -0x67d3905

    goto/16 :goto_e

    :cond_9
    :goto_7
    move-object v5, v2

    const-string v2, "\u073a\u1a79"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v15

    mul-int/lit8 v2, v2, 0x7b

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, -0x2605

    const v8, -0x4e52b85f

    xor-int/2addr v7, v8

    const v8, -0x60361d23

    goto/16 :goto_e

    :sswitch_a
    move/from16 v19, v8

    move/from16 v17, v9

    move/from16 v20, v11

    move-object/from16 v9, p1

    const v2, 0xc18a

    const v13, 0xc18a

    goto :goto_8

    :sswitch_b
    move/from16 v19, v8

    move/from16 v17, v9

    move/from16 v20, v11

    move-object/from16 v9, p1

    const/16 v2, 0x77c8

    const/16 v13, 0x77c8

    :goto_8
    const-string v2, "\u06d7\u1a77"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, 0x63

    xor-int v7, v2, v15

    mul-int/lit16 v7, v7, -0x3dc7

    const v8, -0x1c7a1ad5

    xor-int/2addr v7, v8

    const v8, -0x7956c1c2

    goto/16 :goto_e

    :cond_a
    const-string v2, "\u1a75\u1a74"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v15

    mul-int/lit8 v2, v2, -0x65

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, 0x14e1

    const v8, 0x676b98c8

    xor-int/2addr v7, v8

    const v8, -0xf2bb6b8

    goto/16 :goto_e

    :sswitch_c
    move/from16 v19, v8

    move/from16 v17, v9

    move/from16 v20, v11

    move-object/from16 v9, p1

    mul-int v12, v19, v20

    sget v2, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v2, :cond_b

    goto/16 :goto_b

    :cond_b
    const-string v2, "\u06d6\u06d8"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0xd

    xor-int v7, v2, v15

    mul-int/lit16 v7, v7, 0x6b03

    const v8, -0x25997e53

    xor-int/2addr v7, v8

    const v8, 0x7dc4ff74

    goto/16 :goto_e

    :sswitch_d
    move/from16 v19, v8

    move/from16 v17, v9

    move-object/from16 v9, p1

    add-int v8, v19, v17

    mul-int v10, v8, v8

    const/4 v11, 0x2

    .line 153
    sget v2, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v2, :cond_c

    :goto_9
    const-string v2, "\u1a79\u06eb"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v15

    mul-int/lit8 v2, v2, -0x3f

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, 0x4c75

    const v8, -0x3877b5f6

    xor-int/2addr v7, v8

    const v8, -0x2370e661

    goto :goto_a

    :cond_c
    const-string v2, "\u06da\u06d6"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v15

    mul-int/lit8 v2, v2, 0xb

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, 0x584f

    const v8, -0x24a97967

    xor-int/2addr v7, v8

    const v8, 0x3b02bb4d

    :goto_a
    xor-int/2addr v2, v8

    move/from16 v9, v17

    move/from16 v8, v19

    goto/16 :goto_10

    :sswitch_e
    move-object/from16 v9, p1

    move/from16 v20, v11

    const/16 v2, 0x33

    aget-short v8, v18, v2

    const/4 v2, 0x1

    .line 242
    sget-boolean v7, Ll/᩶;->ۚۤۘ:Z

    if-eqz v7, :cond_d

    const/16 v17, 0x1

    goto :goto_c

    :cond_d
    const-string v7, "\u05a1\u06e7"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v14

    xor-int v11, v7, v15

    mul-int/lit16 v11, v11, -0x3e53

    const v17, 0x4ac40d25    # 6424210.5f

    xor-int v11, v11, v17

    const v17, 0x2eb65762

    xor-int v17, v7, v17

    move v2, v11

    move/from16 v11, v20

    const/4 v9, 0x1

    goto/16 :goto_0

    :sswitch_f
    move/from16 v19, v8

    move/from16 v17, v9

    move/from16 v20, v11

    move-object/from16 v9, p1

    sget-object v18, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    .line 143
    sget v2, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v2, :cond_e

    :goto_b
    goto/16 :goto_5

    :goto_c
    const-string v2, "\u06ec\u06da"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v7, v2, v15

    mul-int/lit16 v7, v7, -0x2d25

    const v11, 0x7c9af88d

    xor-int/2addr v7, v11

    const v11, -0x4e22431a

    xor-int/2addr v2, v11

    move/from16 v9, v17

    goto :goto_f

    :cond_e
    const-string v2, "\u0733\u0736"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x19

    xor-int v7, v2, v15

    mul-int/lit16 v7, v7, -0x7ea3

    const v8, -0x17aea536

    xor-int/2addr v7, v8

    const v8, 0x19fdaf93

    goto :goto_e

    :sswitch_10
    move/from16 v19, v8

    move/from16 v17, v9

    move/from16 v20, v11

    move-object/from16 v9, p1

    .line 108
    sget-boolean v2, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v2, :cond_f

    :goto_d
    const-string v2, "\u073a\u06db"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, 0x65

    xor-int v7, v2, v15

    mul-int/lit16 v7, v7, 0x5201

    const v8, 0x6d736f93

    xor-int/2addr v7, v8

    const v8, -0xc95fa1e

    goto :goto_e

    :cond_f
    const-string v2, "\u06e8\u05ab"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v15, v2

    mul-int/lit8 v2, v2, -0x27

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, -0x27c7

    const v8, -0x333da39e

    xor-int/2addr v7, v8

    const v8, -0x67c61dbb

    :goto_e
    xor-int/2addr v2, v8

    move/from16 v9, v17

    move/from16 v8, v19

    :goto_f
    move/from16 v11, v20

    :goto_10
    move/from16 v17, v2

    :goto_11
    move v2, v7

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x700ea7a8 -> :sswitch_6
        -0x68d6fd4f -> :sswitch_b
        -0x640be7d0 -> :sswitch_d
        -0x63c1fed8 -> :sswitch_7
        -0x6228d378 -> :sswitch_c
        -0x60757d3f -> :sswitch_5
        -0x40804096 -> :sswitch_0
        -0x3e1f62ac -> :sswitch_b
        -0x34821a3e -> :sswitch_8
        -0x33f6f088 -> :sswitch_10
        -0x30dd3a12 -> :sswitch_a
        -0x3012b532 -> :sswitch_9
        -0x2fe81977 -> :sswitch_1
        -0x2b9eb71a -> :sswitch_0
        -0x27604056 -> :sswitch_e
        -0x215790cc -> :sswitch_9
        -0x1e52cb2c -> :sswitch_c
        -0xfcfe7de -> :sswitch_1
        -0xd1a7dab -> :sswitch_f
        -0xc8075bf -> :sswitch_4
        -0x7de8b8a -> :sswitch_7
        -0x12125c5 -> :sswitch_8
        0x9726828 -> :sswitch_e
        0xafe8b4f -> :sswitch_3
        0x155803e8 -> :sswitch_10
        0x1b6299ce -> :sswitch_a
        0x332866f7 -> :sswitch_2
        0x3532280a -> :sswitch_4
        0x37189a45 -> :sswitch_5
        0x3a3e1d3a -> :sswitch_2
        0x3e4ce70e -> :sswitch_6
        0x4b0acb6a -> :sswitch_d
        0x5ed37339 -> :sswitch_f
        0x7c707fe3 -> :sswitch_3
    .end sparse-switch
.end method

.method public final getFilesDir()Ljava/io/File;
    .locals 7

    const/4 v0, 0x0

    const v1, 0x74c22b73

    sget v2, Ll/֫;->ܶܺ᩻:I

    sget v3, Ll/ۗ;->֨۬ۖ:I

    const-string v4, "\u05ab\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x44c7

    const v6, -0x1d499cd1

    xor-int/2addr v5, v6

    const v6, -0x57e42650

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x7249

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_0
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    sget-boolean v4, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v4, :cond_c

    goto/16 :goto_3

    .line 20
    :sswitch_1
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u06e0\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2807

    const v6, -0x7d09f970

    xor-int/2addr v5, v6

    const v6, 0x5ff84f41

    goto :goto_0

    .line 103
    :sswitch_2
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_4

    .line 46
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto/16 :goto_4

    .line 319
    :sswitch_4
    invoke-virtual {v0}, Ll/᩷۠ۚ;->ܽ()Z

    goto :goto_1

    .line 320
    :sswitch_5
    new-instance v1, Ljava/io/File;

    invoke-static {v0}, Ll/֫ܺ;->ܺ᩺᩻(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v1

    .line 318
    :sswitch_6
    invoke-static {v0}, Ll/֨ܰ;->ܽܰ֡(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "\u1a76\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x10ed

    const v6, 0x23c35135

    xor-int/2addr v5, v6

    const v6, -0x323f15d4    # -4.0457152E8f

    goto :goto_0

    :cond_1
    :goto_1
    const-string v4, "\u05a8\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x571f

    const v6, -0x6d4d7627

    xor-int/2addr v5, v6

    const v6, -0x248df929

    goto/16 :goto_0

    :sswitch_7
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u06e2\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6479

    const v6, 0x3d35bc7e

    xor-int/2addr v5, v6

    const v6, 0x6795601f

    goto/16 :goto_0

    .line 131
    :sswitch_8
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u0730\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4fb3

    const v6, -0x235395f3

    xor-int/2addr v5, v6

    const v6, 0x3728bd48

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u1a73\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5a1b

    const v6, -0x34bcc0a

    xor-int/2addr v5, v6

    const v6, -0x1a37a708

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06df\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x77cd

    const v6, -0x45081c45

    xor-int/2addr v5, v6

    const v6, 0x43b4861a

    goto/16 :goto_0

    .line 141
    :sswitch_b
    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_6

    :goto_2
    const-string v4, "\u05a1\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x13b3

    const v6, 0x3d5c2486

    xor-int/2addr v5, v6

    const v6, 0x5ad03e

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a75\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x61cd

    const v6, -0x1b9f41ed

    xor-int/2addr v5, v6

    const v6, -0x59b1e1c3

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u1a7b\u06df"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5a7d

    const v6, -0xba70ec0

    xor-int/2addr v5, v6

    const v6, -0x1e0e0d3e

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_8

    goto :goto_5

    :cond_8
    const-string v4, "\u06db\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3f65

    const v6, -0x6f62493b

    xor-int/2addr v5, v6

    const v6, -0x4bd00ce9

    goto/16 :goto_0

    .line 179
    :sswitch_e
    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u073a\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5f51

    const v6, 0x9cbb98e

    xor-int/2addr v5, v6

    const v6, -0xbd43bb

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a7b\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2c47

    const v6, 0x23cc94c0

    xor-int/2addr v5, v6

    const v6, -0x3c1ceb49

    goto/16 :goto_0

    :sswitch_f
    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_b

    :goto_4
    const-string v4, "\u06da\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7099

    const v6, 0x1a06299a

    xor-int/2addr v5, v6

    const v6, 0x181ad8e3

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06da\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2851

    const v6, -0xe534724

    xor-int/2addr v5, v6

    const v6, 0x59e2aa56

    goto/16 :goto_0

    .line 318
    :sswitch_10
    iget-object v0, p0, Ll/ۧ֨ۘ;->ۖ:Ll/᩷۠ۚ;

    .line 56
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u06eb\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2be9

    const v6, 0x3af64a6d

    xor-int/2addr v5, v6

    const v6, 0xe9f0036

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06d8\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2c5

    const v6, 0x419d5320

    xor-int/2addr v5, v6

    const v6, 0x34c6d9fc

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7dffa55e -> :sswitch_5
        -0x79c9ef8e -> :sswitch_f
        -0x6e8020b1 -> :sswitch_4
        -0x6cf344d6 -> :sswitch_a
        -0x6c7a5446 -> :sswitch_f
        -0x6488e8b6 -> :sswitch_0
        -0x5767ec70 -> :sswitch_6
        -0x4a713f91 -> :sswitch_9
        -0x420b0b53 -> :sswitch_e
        -0x3e4d1f27 -> :sswitch_d
        -0x368885d8 -> :sswitch_e
        -0x350318b4 -> :sswitch_c
        -0x2114336e -> :sswitch_7
        -0x118facbe -> :sswitch_9
        -0x117ab084 -> :sswitch_1
        -0x17c9e25 -> :sswitch_1
        0x1dde4c0 -> :sswitch_8
        0x5e44cb0 -> :sswitch_b
        0x1305a985 -> :sswitch_6
        0x133fc727 -> :sswitch_3
        0x14bd37b4 -> :sswitch_a
        0x14cd63ca -> :sswitch_8
        0x19685e41 -> :sswitch_2
        0x1aeb7dad -> :sswitch_10
        0x1b54c373 -> :sswitch_3
        0x22b5860a -> :sswitch_b
        0x3f644aaa -> :sswitch_5
        0x4ebf62e3 -> :sswitch_7
        0x5039adc6 -> :sswitch_c
        0x5588896f -> :sswitch_10
        0x69f42eac -> :sswitch_2
        0x6f78109d -> :sswitch_0
        0x71103dfd -> :sswitch_d
        0x7f33c152 -> :sswitch_4
    .end sparse-switch
.end method

.method public final getHostPackageName()Ljava/lang/String;
    .locals 1

    .line 112
    invoke-static {}, Ll/ܽܺۘ;->ᩴ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getHostVersionCode()I
    .locals 1

    const v0, 0x18e4545

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

    const v10, -0x79e197c0

    sget v11, Ll/֫ܽ;->֡ᩴܶ:I

    sget v12, Ll/֡֡;->᩶ۤ۠:I

    const-string v13, "\u06e0\u06e8"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x1d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x463f

    const v15, 0x1d664256

    xor-int/2addr v14, v15

    const v15, -0x5f941588

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, 0x5a53

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    sget-object v0, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    .line 0
    sget v13, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v13, :cond_d

    goto/16 :goto_6

    :sswitch_0
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget v13, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v13, :cond_7

    goto/16 :goto_5

    .line 1
    :sswitch_1
    sget v13, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v13, :cond_c

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    sget v13, Ll/ۘۗ;->ۖۧ۬:I

    if-gez v13, :cond_a

    goto :goto_1

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    :goto_1
    const-string v13, "\u06df\u06d6"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x2e1f

    const v15, -0x5a963375

    xor-int/2addr v14, v15

    const v15, 0xdb66e7c

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/4 v0, 0x7

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/֫ܶ;->۟ۢۚ([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    sget-object v8, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    const/16 v9, 0x36

    .line 2
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v13

    if-eqz v13, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v13, "\u073a\u1a77"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x27

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x6f35

    const v15, 0x3267b6c2

    xor-int/2addr v14, v15

    const v15, 0xc9cb78

    goto :goto_0

    :sswitch_7
    const/16 v7, 0x3eee

    goto :goto_2

    :sswitch_8
    const/16 v7, 0x6f25

    :goto_2
    const-string v13, "\u06e8\u1a78"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x33

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x429b

    const v15, -0xb9f35b3

    xor-int/2addr v14, v15

    const v15, -0x682f3c7b

    goto/16 :goto_0

    :sswitch_9
    add-int v13, v5, v6

    sub-int v13, v4, v13

    if-gtz v13, :cond_1

    const-string v13, "\u05a1\u073a"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3a63

    const v15, -0x32145267

    xor-int/2addr v14, v15

    const v15, -0x6301281c

    goto/16 :goto_0

    :cond_1
    const-string v13, "\u1a79\u05ab"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x33

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5f05

    const v15, 0x3341a010

    xor-int/2addr v14, v15

    const v15, 0x20d56bae

    goto/16 :goto_0

    :sswitch_a
    const v6, 0x3aa2141    # 9.999337E-37f

    .line 1
    sget v13, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v13, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v13, "\u06e8\u1a79"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x21

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x452b

    const v15, -0x37cf5048

    xor-int/2addr v14, v15

    const v15, 0x50a83aae

    goto/16 :goto_0

    :sswitch_b
    mul-int v4, v2, v3

    mul-int v5, v2, v2

    sget v13, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v13, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v13, "\u06e7\u073d"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1973

    const v15, -0x7e61d873

    xor-int/2addr v14, v15

    const v15, -0x4668e293

    goto/16 :goto_0

    :sswitch_c
    aget-short v2, v0, v1

    const/16 v3, 0x3d42

    sget v13, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v13, :cond_4

    goto :goto_3

    :cond_4
    const-string v13, "\u1a74\u1a77"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x64eb

    const v15, -0x5f74b5fc

    xor-int/2addr v14, v15

    const v15, 0x2592ac8c

    goto/16 :goto_0

    :sswitch_d
    const/16 v1, 0x35

    .line 4
    sget v13, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v13, :cond_5

    goto :goto_3

    :cond_5
    const-string v13, "\u05a8\u06da"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x26b1

    const v15, 0x69e8da1b

    xor-int/2addr v14, v15

    const v15, 0x326ffa2

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget-boolean v13, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v13, :cond_6

    :goto_3
    const-string v13, "\u06e7\u073a"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x20ff

    const v15, -0x4af828bc

    xor-int/2addr v14, v15

    const v15, -0x5ebec57

    goto/16 :goto_0

    :cond_6
    const-string v13, "\u0736\u073a"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x7465

    const v15, -0x48c7eb8d

    xor-int/2addr v14, v15

    const v15, 0x57cf9d51

    goto/16 :goto_0

    .line 1
    :sswitch_f
    sget v13, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v13, :cond_8

    :cond_7
    :goto_4
    const-string v13, "\u0733\u0733"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x77

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7561

    const v15, -0x491a7277

    xor-int/2addr v14, v15

    const v15, -0x45ce228

    goto/16 :goto_0

    :cond_8
    const-string v13, "\u1a78\u1a74"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x37

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x75bb

    const v15, -0x100c59f5

    xor-int/2addr v14, v15

    const v15, -0x37d541cc

    goto/16 :goto_0

    .line 0
    :sswitch_10
    sget v13, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v13, :cond_9

    goto :goto_6

    :cond_9
    const-string v13, "\u06e2\u06d6"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x2fe5

    const v15, -0x6a8513b3

    xor-int/2addr v14, v15

    const v15, -0x525ec381

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v13

    if-nez v13, :cond_b

    :cond_a
    :goto_5
    const-string v13, "\u06dc\u073d"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x6e71

    const v15, 0x73babf15

    xor-int/2addr v14, v15

    const v15, -0x5155137b

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u06e0\u0736"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x25

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xa57

    const v15, -0x66ca50bf

    xor-int/2addr v14, v15

    const v15, -0x1a26acc5

    goto/16 :goto_0

    :cond_c
    :goto_6
    const-string v13, "\u05ab\u073d"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x37

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1615

    const v15, -0x13077719

    xor-int/2addr v14, v15

    const v15, -0x6007e2eb

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u06e7\u06e1"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x13

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x4db

    const v15, 0x4542c281

    xor-int/2addr v14, v15

    const v15, -0x6d749a8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79570fb7 -> :sswitch_2
        -0x6f0b46d3 -> :sswitch_1
        -0x49c1a887 -> :sswitch_0
        -0x477e05ca -> :sswitch_e
        -0x445c3d94 -> :sswitch_6
        -0x438cf108 -> :sswitch_d
        -0x39669bcb -> :sswitch_6
        -0x33c21f14 -> :sswitch_9
        -0x31d2689e -> :sswitch_b
        -0x2f2b0442 -> :sswitch_8
        -0x2acc5231 -> :sswitch_7
        -0x284518ab -> :sswitch_10
        -0x270e0889 -> :sswitch_b
        -0x1d7f5179 -> :sswitch_3
        -0x19f53f3a -> :sswitch_4
        -0x154e07f2 -> :sswitch_1
        -0x141a386d -> :sswitch_3
        -0xa42a648 -> :sswitch_a
        0x87a7dea -> :sswitch_10
        0xa41bd8a -> :sswitch_4
        0x11908db9 -> :sswitch_d
        0x1688a994 -> :sswitch_c
        0x3a761a3c -> :sswitch_2
        0x3c273410 -> :sswitch_11
        0x3d732e5b -> :sswitch_5
        0x3d9a5f9c -> :sswitch_8
        0x461d9526 -> :sswitch_f
        0x48155480 -> :sswitch_0
        0x4f0cd073 -> :sswitch_c
        0x50d33af5 -> :sswitch_f
        0x5e31b1f3 -> :sswitch_11
        0x61e2e9a9 -> :sswitch_7
        0x65617c0e -> :sswitch_5
        0x66a871a1 -> :sswitch_9
        0x6a084623 -> :sswitch_e
        0x788fcc6d -> :sswitch_a
    .end sparse-switch
.end method

.method public final getLanguage()Ljava/lang/String;
    .locals 1

    .line 139
    invoke-static {}, Ll/᩷᩹ۘ;->ۨ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageCountry()Ljava/lang/String;
    .locals 1

    .line 149
    invoke-static {}, Ll/᩷᩹ۘ;->ۖ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageNameLocalString()Lbin/mt/plugin/api/LocalString;
    .locals 1

    .line 312
    invoke-static {}, Ll/᩷᩹ۘ;->ۚ()Lbin/mt/plugin/api/LocalString;

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

    const v11, 0x55f34c67

    sget v12, Ll/֫᩺;->᩺۟ۘ:I

    sget v13, Ll/ۘۗ;->ۖۧ۬:I

    const-string v14, "\u05a1\u073d"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x6b

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x3011

    const v16, 0x370e9739

    xor-int v15, v15, v16

    const v16, -0xc04162b

    :goto_0
    xor-int v14, v14, v16

    :goto_1
    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, 0x93d

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    sget v14, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v14, :cond_0

    :goto_2
    move-object/from16 v14, p0

    goto/16 :goto_4

    :cond_0
    const-string v14, "\u1a75\u1a78"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x3d45

    const v16, -0x49aac1e3

    xor-int v15, v15, v16

    const v16, -0x16833da1

    goto :goto_0

    .line 149
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v14

    if-gtz v14, :cond_1

    goto :goto_2

    :cond_1
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v5

    goto/16 :goto_9

    :sswitch_1
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget v14, Ll/ۗܺ;->ۨ᩺۠:I

    if-lez v14, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v5

    goto/16 :goto_7

    :sswitch_2
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto :goto_2

    .line 250
    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    const/4 v0, 0x0

    return-object v0

    .line 0
    :sswitch_4
    invoke-static {v8, v9, v10, v7}, Ll/ۘۗ;->᩺ۛۙ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v14, p0

    .line 283
    invoke-virtual {v14, v0}, Ll/ۧ֨ۘ;->ۙ(Ljava/lang/String;)Ll/֡֨ۘ;

    move-result-object v0

    return-object v0

    :sswitch_5
    move-object/from16 v14, p0

    .line 12
    sget v15, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v15, :cond_3

    const/4 v10, 0x6

    goto/16 :goto_4

    :cond_3
    const-string v15, "\u0736\u073f"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v13, v15

    mul-int/lit8 v15, v15, -0x47

    xor-int v10, v15, v12

    mul-int/lit16 v10, v10, -0x3463

    const v17, -0x3ffc2880

    xor-int v10, v10, v17

    const v17, -0x3553d199    # -5642035.5f

    xor-int v15, v15, v17

    move v14, v15

    move v15, v10

    const/4 v10, 0x6

    goto/16 :goto_1

    :sswitch_6
    move-object/from16 v14, p0

    .line 0
    sget-object v8, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    sget-boolean v15, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v15, :cond_4

    const/16 v9, 0x3e

    goto/16 :goto_4

    :cond_4
    const-string v15, "\u1a7b\u1a79"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    xor-int v9, v15, v13

    mul-int/lit16 v9, v9, -0x68fd

    const v17, -0x60a2eb23

    xor-int v9, v9, v17

    const v17, 0x3dc9ef66

    xor-int v15, v15, v17

    move v14, v15

    move v15, v9

    const/16 v9, 0x3e

    goto/16 :goto_1

    :sswitch_7
    move-object/from16 v14, p0

    const/16 v7, 0x6f43

    goto :goto_3

    :sswitch_8
    move-object/from16 v14, p0

    const v7, 0xca0a

    :goto_3
    const-string v15, "\u06d8\u06da"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    move/from16 v16, v7

    xor-int v7, v15, v12

    mul-int/lit16 v7, v7, -0xbef

    const v17, 0x68b385e

    xor-int v7, v7, v17

    const v17, -0x5e95b22d

    xor-int v15, v15, v17

    move v14, v15

    move v15, v7

    move/from16 v7, v16

    goto/16 :goto_1

    :sswitch_9
    move-object/from16 v14, p0

    add-int v15, v2, v6

    mul-int v15, v15, v15

    sub-int v15, v5, v15

    if-ltz v15, :cond_5

    const-string v15, "\u1a76\u06d6"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move/from16 v16, v5

    xor-int v5, v15, v13

    mul-int/lit16 v5, v5, -0x3473

    const v17, 0x3facaf96

    xor-int v5, v5, v17

    const v17, -0x5ccad558

    xor-int v15, v15, v17

    move v14, v15

    move v15, v5

    goto/16 :goto_6

    :cond_5
    move/from16 v16, v5

    const-string v5, "\u06d7\u073a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v13, v5

    mul-int/lit8 v5, v5, -0x65

    xor-int v15, v5, v12

    mul-int/lit16 v15, v15, -0x35cf

    const v17, -0x7fdb4c7d

    xor-int v15, v15, v17

    const v17, 0xbd2623b

    goto/16 :goto_5

    :sswitch_a
    move-object/from16 v14, p0

    move/from16 v16, v5

    const/16 v6, 0xcc9

    .line 77
    sget v5, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v5, :cond_6

    move/from16 v5, v16

    goto :goto_4

    :cond_6
    const-string v5, "\u06ec\u06e0"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v12

    xor-int v15, v5, v13

    mul-int/lit16 v15, v15, 0x2e97

    const v17, -0x28512fad

    xor-int v15, v15, v17

    const v17, 0x1da908f7

    goto :goto_5

    :sswitch_b
    move-object/from16 v14, p0

    add-int v5, v3, v4

    add-int/2addr v5, v5

    sget-boolean v15, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v15, :cond_7

    :goto_4
    const-string v15, "\u0736\u0733"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v12, v15

    mul-int/lit8 v15, v15, 0x23

    move/from16 v17, v3

    xor-int v3, v15, v13

    mul-int/lit16 v3, v3, -0x1521

    const v16, 0x303aff40

    xor-int v3, v3, v16

    const v16, -0x3335668f

    xor-int v15, v15, v16

    move v14, v15

    move v15, v3

    goto/16 :goto_b

    :cond_7
    move/from16 v17, v3

    const-string v3, "\u06d6\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v13

    mul-int/lit8 v3, v3, 0x47

    xor-int v15, v3, v12

    mul-int/lit16 v15, v15, 0x4bb7

    const v16, -0x497e2341

    xor-int v15, v15, v16

    const v16, -0x18c9491

    xor-int v3, v3, v16

    move v14, v3

    goto/16 :goto_b

    :sswitch_c
    move-object/from16 v14, p0

    move/from16 v16, v5

    mul-int v3, v2, v2

    const v4, 0xa375d1

    .line 185
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v5

    if-gtz v5, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v5, "\u073f\u1a79"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v13, v5

    mul-int/lit8 v5, v5, 0x4d

    xor-int v15, v5, v12

    mul-int/lit16 v15, v15, 0x1f87

    const v17, -0x105facb

    xor-int v15, v15, v17

    const v17, -0x66d7467

    :goto_5
    xor-int v5, v5, v17

    move v14, v5

    :goto_6
    move/from16 v5, v16

    goto/16 :goto_1

    :sswitch_d
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v5

    aget-short v2, v0, v1

    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v3, :cond_9

    :goto_7
    const-string v3, "\u06e8\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v13, v3

    mul-int/lit8 v3, v3, -0x51

    xor-int v5, v3, v12

    mul-int/lit16 v5, v5, 0x373d

    const v15, 0x2ec94774

    xor-int/2addr v15, v5

    const v5, 0x1d335614

    goto/16 :goto_a

    :cond_9
    const-string v3, "\u06da\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v12, v3

    mul-int/lit8 v3, v3, -0x43

    xor-int v5, v3, v13

    mul-int/lit16 v5, v5, 0x4aab

    const v15, -0x30ea2bfc

    xor-int/2addr v15, v5

    const v5, 0x43e0bb95

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v5

    const/16 v1, 0x3d

    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v3, :cond_a

    goto/16 :goto_9

    :cond_a
    const-string v3, "\u073a\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v13

    mul-int/lit8 v3, v3, 0x69

    xor-int v5, v3, v12

    mul-int/lit16 v5, v5, -0x420b

    const v15, 0x57be2683

    xor-int/2addr v15, v5

    const v5, 0x122e14d2

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v5

    .line 187
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_9

    :cond_b
    const-string v3, "\u06da\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v12, v3

    mul-int/lit8 v3, v3, 0x45

    xor-int v5, v3, v13

    mul-int/lit16 v5, v5, 0x184b

    const v15, 0x44775c2b

    xor-int/2addr v15, v5

    const v5, 0x7f69eb7d

    goto :goto_a

    :sswitch_10
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v5

    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_c

    move/from16 v3, v17

    :goto_8
    const-string v5, "\u1a78\u1a7a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v12

    xor-int v15, v5, v13

    mul-int/lit16 v15, v15, 0x20d

    const v17, 0x6070cc5    # 2.540006E-35f

    xor-int v15, v15, v17

    const v17, -0x6077907d

    goto/16 :goto_5

    :cond_c
    const-string v3, "\u1a73\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v13

    mul-int/lit8 v3, v3, 0x3b

    xor-int v5, v3, v12

    mul-int/lit16 v5, v5, 0x745d

    const v15, 0x2ca68869

    xor-int/2addr v15, v5

    const v5, 0x5b7a7ac3

    goto :goto_a

    :sswitch_11
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v5

    sget-object v0, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    .line 20
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v3

    if-ltz v3, :cond_d

    :goto_9
    const-string v3, "\u06eb\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v12

    mul-int/lit8 v3, v3, 0x77

    xor-int v5, v3, v13

    mul-int/lit16 v5, v5, 0x68af

    const v15, 0x66ed5814

    xor-int/2addr v15, v5

    const v5, -0x4ecd0450

    goto :goto_a

    :cond_d
    const-string v3, "\u1a74\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v12

    xor-int v5, v3, v13

    mul-int/lit16 v5, v5, 0x1f7d

    const v15, -0x616ab124

    xor-int/2addr v15, v5

    const v5, -0x698a856a

    :goto_a
    xor-int/2addr v3, v5

    move v14, v3

    move/from16 v5, v16

    :goto_b
    move/from16 v3, v17

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74fe7c95 -> :sswitch_b
        -0x6916a125 -> :sswitch_3
        -0x6563185d -> :sswitch_7
        -0x515a6b18 -> :sswitch_f
        -0x3b4c5aa3 -> :sswitch_8
        -0x31807f54 -> :sswitch_5
        -0x2ff4b0df -> :sswitch_f
        -0x2b52687d -> :sswitch_8
        -0x1e123982 -> :sswitch_10
        -0x15b2db10 -> :sswitch_4
        -0x10f7e6b8 -> :sswitch_a
        -0xe9a142d -> :sswitch_c
        0x19eaa6e7 -> :sswitch_11
        0x1f1e35e0 -> :sswitch_2
        0x2371003b -> :sswitch_7
        0x2458e64d -> :sswitch_4
        0x24e44d71 -> :sswitch_d
        0x2880a76b -> :sswitch_1
        0x2bdeaa83 -> :sswitch_a
        0x36c4b792 -> :sswitch_6
        0x42aa5df1 -> :sswitch_e
        0x43c61af4 -> :sswitch_e
        0x4a512633 -> :sswitch_5
        0x4c0e98f5 -> :sswitch_0
        0x51f64726 -> :sswitch_6
        0x5cdfcf80 -> :sswitch_c
        0x661d62bf -> :sswitch_9
        0x6629e457 -> :sswitch_2
        0x6686f1cc -> :sswitch_b
        0x6688783a -> :sswitch_d
        0x68ba39dd -> :sswitch_10
        0x6a17cabe -> :sswitch_11
        0x6a325388 -> :sswitch_9
        0x76126597 -> :sswitch_1
        0x7a17bf6c -> :sswitch_3
        0x7ed1adbf -> :sswitch_0
    .end sparse-switch
.end method

.method public final getPluginId()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ۧ֨ۘ;->֨:Ljava/lang/String;

    return-object v0
.end method

.method public final getPluginName()Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x2b033fe5

    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    const-string v5, "\u1a78\u06d7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x760d

    const v7, 0x7eb652cb

    xor-int/2addr v6, v7

    const v7, -0x5436b3c2

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x57b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    const/4 v5, 0x1

    .line 0
    invoke-static {v5, v0}, Ll/֡۠;->ۡܰ۫(ILjava/lang/Object;)C

    move-result v5

    const/16 v6, 0x7d

    if-ne v5, v6, :cond_1

    const-string v5, "\u06dc\u05a8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x744b

    const v7, 0x4e4d9919    # 8.623407E8f

    xor-int/2addr v6, v7

    const v7, -0x710880e6

    goto :goto_0

    .line 55
    :sswitch_0
    sget-boolean v5, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v5, :cond_c

    goto/16 :goto_1

    .line 61
    :sswitch_1
    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u06e7\u1a75"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x7

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4d4b

    const v7, -0x7acf58ff

    xor-int/2addr v6, v7

    const v7, -0x2cd8e871

    goto :goto_0

    :sswitch_2
    sget v5, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v5, :cond_4

    goto/16 :goto_2

    .line 46
    :sswitch_3
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    return-object v1

    .line 183
    :sswitch_6
    invoke-static {p0, v0}, Ll/ۗ;->֡ۚۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v5, "\u05ab\u06e1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x40e5

    const v7, 0x1216b560

    xor-int/2addr v6, v7

    const v7, 0x58b01046

    goto :goto_0

    :sswitch_7
    const/4 v5, 0x0

    .line 182
    invoke-static {v0, v5}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v5

    const/16 v6, 0x7b

    if-ne v5, v6, :cond_1

    const-string v5, "\u1a78\u06e1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x54d7

    const v7, 0x48356f11

    xor-int/2addr v6, v7

    const v7, -0x5500096e

    goto/16 :goto_0

    :sswitch_8
    return-object v0

    :sswitch_9
    invoke-static {v0}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v5

    const/4 v6, 0x3

    if-lt v5, v6, :cond_1

    const-string v5, "\u05a1\u1a73"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x75

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x77d3

    const v7, 0x624c35c4

    xor-int/2addr v6, v7

    const v7, -0x5d98f1d4

    goto/16 :goto_0

    :cond_1
    const-string v5, "\u1a74\u06ec"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5651

    const v7, -0x261e2cef

    xor-int/2addr v6, v7

    const v7, 0x6bde8215

    goto/16 :goto_0

    .line 44
    :sswitch_a
    sget v5, Ll/֨ۧ;->֫۠֡:I

    if-gtz v5, :cond_2

    const-string v5, "\u073a\u073a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3f15

    const v7, 0x345295eb

    xor-int/2addr v6, v7

    const v7, 0x68191ff7

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u06d6\u0736"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4c8b

    const v7, 0x68732ee

    xor-int/2addr v6, v7

    const v7, 0x6d6da6cd

    goto/16 :goto_0

    .line 69
    :sswitch_b
    sget v5, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u06e8\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x73

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7c65

    const v7, -0x7bd2a02e

    xor-int/2addr v6, v7

    const v7, 0x549b8f5e

    goto/16 :goto_0

    .line 47
    :sswitch_c
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v5

    if-ltz v5, :cond_5

    :cond_4
    :goto_1
    const-string v5, "\u1a77\u073d"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x75

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x642b

    const v7, 0x4fd1e00d

    xor-int/2addr v6, v7

    const v7, 0x165d32cb

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06ec\u06e4"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0xf

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4e63

    const v7, 0x2dcf023e

    xor-int/2addr v6, v7

    const v7, -0x37aeea7b

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v5

    if-gtz v5, :cond_6

    goto :goto_2

    :cond_6
    const-string v5, "\u1a79\u05ab"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x38b3

    const v7, 0x7551abf8

    xor-int/2addr v6, v7

    const v7, -0x50d8c6d1

    goto/16 :goto_0

    .line 132
    :sswitch_e
    sget v5, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v5, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v5, "\u073d\u06df"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x35

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x415

    const v7, 0x2d12c8f0

    xor-int/2addr v6, v7

    const v7, -0xcba6cac

    goto/16 :goto_0

    .line 36
    :sswitch_f
    sget v5, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v5, :cond_8

    :goto_2
    const-string v5, "\u06e1\u06da"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x161d

    const v7, -0x6e192883

    xor-int/2addr v6, v7

    const v7, 0x209e068f

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06eb\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7e81

    const v7, 0x740b51c5

    xor-int/2addr v6, v7

    const v7, -0x50486c0e

    goto/16 :goto_0

    .line 136
    :sswitch_10
    sget v5, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v5, :cond_9

    goto :goto_3

    :cond_9
    const-string v5, "\u06d8\u06e1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x6d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4dcf

    const v7, -0x1ca46feb

    xor-int/2addr v6, v7

    const v7, 0xa336abf

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v5, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v5, :cond_a

    goto :goto_3

    :cond_a
    const-string v5, "\u06ec\u06d6"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x21

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7f11

    const v7, -0x54e1dace

    xor-int/2addr v6, v7

    const v7, 0x2baeb2d8

    goto/16 :goto_0

    :sswitch_12
    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v5, :cond_b

    goto :goto_3

    :cond_b
    const-string v5, "\u0733\u06dc"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x4d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2f71

    const v7, -0x73a1dc56

    xor-int/2addr v6, v7

    const v7, 0x12a93d3e

    goto/16 :goto_0

    .line 182
    :sswitch_13
    iget-object v0, p0, Ll/ۧ֨ۘ;->۬:Ljava/lang/String;

    sget-boolean v5, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v5, :cond_d

    :cond_c
    :goto_3
    const-string v5, "\u06d9\u06df"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x52df

    const v7, -0x1a6ff4c1

    xor-int/2addr v6, v7

    const v7, -0x713b9eac

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06d6\u1a75"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x7d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6ea5

    const v7, 0x735099bb

    xor-int/2addr v6, v7

    const v7, 0x7b19e299

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5fcf121c -> :sswitch_9
        -0x5a2fb108 -> :sswitch_6
        -0x599908ca -> :sswitch_3
        -0x55c97cc7 -> :sswitch_0
        -0x51c59d62 -> :sswitch_b
        -0x39b3dfcf -> :sswitch_d
        -0x380c9149 -> :sswitch_f
        -0x3433d11c -> :sswitch_0
        -0x2af5d13c -> :sswitch_c
        -0x209d46b4 -> :sswitch_c
        -0x200e26d8 -> :sswitch_e
        -0x1850edd1 -> :sswitch_d
        -0x1068381c -> :sswitch_e
        -0x10277a19 -> :sswitch_4
        -0xbcc439e -> :sswitch_b
        -0x88f9ec7 -> :sswitch_7
        -0x49a8f7d -> :sswitch_5
        -0x17dffbd -> :sswitch_1
        -0x14ee099 -> :sswitch_6
        0x1a6e035b -> :sswitch_10
        0x1b9b02dc -> :sswitch_8
        0x1d2bc7dc -> :sswitch_9
        0x287f7e16 -> :sswitch_11
        0x2f73e65f -> :sswitch_5
        0x33c747df -> :sswitch_a
        0x35d8c081 -> :sswitch_10
        0x4371c4a5 -> :sswitch_7
        0x437c4e24 -> :sswitch_13
        0x480e715a -> :sswitch_13
        0x48bd77c9 -> :sswitch_f
        0x4c8e7def -> :sswitch_2
        0x4ee5aefd -> :sswitch_3
        0x50460c8b -> :sswitch_8
        0x56078736 -> :sswitch_2
        0x5b16677d -> :sswitch_a
        0x68d83209 -> :sswitch_11
        0x77c214cb -> :sswitch_4
        0x7a8d98b8 -> :sswitch_1
        0x7bfa40bd -> :sswitch_12
        0x7d94ad71 -> :sswitch_12
    .end sparse-switch
.end method

.method public final getPluginSdkVersion()I
    .locals 1

    .line 97
    iget v0, p0, Ll/ۧ֨ۘ;->᩸:I

    return v0
.end method

.method public final getPluginVersionCode()I
    .locals 1

    .line 102
    iget v0, p0, Ll/ۧ֨ۘ;->ᩴ:I

    return v0
.end method

.method public final getPluginVersionName()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ۧ֨ۘ;->۠:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreferences()Landroid/content/SharedPreferences;
    .locals 2

    .line 127
    iget-object v0, p0, Ll/ۧ֨ۘ;->ᩳ:Landroid/content/SharedPreferences;

    if-nez v0, :cond_1

    move-object v0, p0

    .line 128
    monitor-enter v0

    .line 129
    :try_start_0
    iget-object v1, p0, Ll/ۧ֨ۘ;->ᩳ:Landroid/content/SharedPreferences;

    if-nez v1, :cond_0

    .line 130
    iget-object v1, p0, Ll/ۧ֨ۘ;->ܶ:Ll/ۢۚۘ;

    iget-object v1, v1, Ll/ۢۚۘ;->ܺ:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 168
    invoke-static {v1}, Ll/ܿۚۘ;->ۚ(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 130
    iput-object v1, p0, Ll/ۧ֨ۘ;->ᩳ:Landroid/content/SharedPreferences;

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
    iget-object v0, p0, Ll/ۧ֨ۘ;->ᩳ:Landroid/content/SharedPreferences;

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

    const v9, -0x21dc8e86

    sget v10, Ll/֫۟;->᩸ᩴܿ:I

    sget v11, Ll/֫᩺;->᩺۟ۘ:I

    const-string v12, "\u1a76\u1a73"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x7d1d

    const v14, -0x77f9b976

    xor-int/2addr v13, v14

    const v14, 0x3298d8f2

    :goto_0
    xor-int/2addr v12, v14

    :goto_1
    xor-int/2addr v9, v11

    mul-int/lit16 v9, v9, -0x44d3

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    move-object/from16 v13, p1

    const/16 v8, 0x1b94

    goto/16 :goto_4

    .line 209
    :sswitch_0
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v12, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v12, :cond_1

    :cond_0
    move-object/from16 v13, p1

    goto/16 :goto_8

    :cond_1
    :goto_2
    move-object/from16 v13, p1

    goto/16 :goto_7

    .line 41
    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget v12, Ll/۟;->ۨᩴۛ:I

    if-ltz v12, :cond_2

    goto :goto_3

    :cond_2
    move-object/from16 v13, p1

    goto/16 :goto_5

    :sswitch_2
    sget v12, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v12, :cond_0

    goto :goto_3

    .line 218
    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto :goto_3

    .line 74
    :sswitch_4
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    const/4 v0, 0x0

    :sswitch_5
    return-object v0

    .line 230
    :sswitch_6
    new-instance v12, Ljava/lang/IllegalArgumentException;

    sget-object v13, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    .line 150
    sget v14, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v14, :cond_3

    move-object/from16 v13, p1

    goto/16 :goto_6

    :cond_3
    const/16 v14, 0x45

    sget v15, Ll/֫;->ܶܺ᩻:I

    if-ltz v15, :cond_4

    :goto_3
    const-string v12, "\u06ec\u1a76"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x2e6f

    const v14, 0x1513b638

    xor-int/2addr v13, v14

    const v14, -0x3c7c53c7

    goto :goto_0

    :cond_4
    const/16 v15, 0x12

    .line 42
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v16

    if-gtz v16, :cond_5

    goto :goto_2

    .line 230
    :cond_5
    invoke-static {v13, v14, v15, v8}, Ll/֫ۚ;->᩸ܺ᩷([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v13, p1

    invoke-static {v0, v13}, Ll/ۗܺ;->ۖۗܺ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v12, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v12

    :sswitch_7
    move-object/from16 v13, p1

    .line 228
    invoke-static/range {p0 .. p1}, Ll/ۗ;->֡ۚۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v12, "\u1a76\u1a75"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x1681

    const v15, 0x361225f9

    xor-int/2addr v14, v15

    const v15, -0x895e85e

    goto/16 :goto_9

    :cond_6
    const-string v12, "\u073f\u073f"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x17

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x355f

    const v15, -0x487ad8a6    # -1.587316E-5f

    xor-int/2addr v14, v15

    const v15, 0x51aea7b9

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v13, p1

    const v8, 0xf2eb

    :goto_4
    const-string v12, "\u1a73\u06d8"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v10

    mul-int/lit8 v12, v12, -0x3b

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x741

    const v15, 0x712806d3

    xor-int/2addr v14, v15

    const v15, -0x4c4deff8

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v13, p1

    add-int v12, v3, v7

    mul-int v12, v12, v12

    sub-int v12, v6, v12

    if-ltz v12, :cond_7

    const-string v12, "\u0733\u06da"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x3c15

    const v15, -0xbf49398

    xor-int/2addr v14, v15

    const v15, -0x6455754e

    goto/16 :goto_9

    :cond_7
    const-string v12, "\u05a8\u073d"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x69

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x1c05

    const v15, 0x589182d8

    xor-int/2addr v14, v15

    const v15, -0xc46c1c6

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v13, p1

    const/16 v7, 0x634

    .line 16
    sget-boolean v12, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v12, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v12, "\u1a78\u06d8"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, 0x63

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x633

    const v15, 0x7fc6a989

    xor-int/2addr v14, v15

    const v15, 0x41dcfca2

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v13, p1

    add-int v6, v4, v5

    add-int/2addr v6, v6

    sget v12, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v12, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v12, "\u073d\u06e2"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x27a9

    const v15, -0x4ab99ec4

    xor-int/2addr v14, v15

    const v15, 0x23acf286

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v13, p1

    const v5, 0x267a90

    .line 50
    sget v12, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v12, :cond_a

    goto :goto_6

    :cond_a
    const-string v12, "\u06e8\u1a75"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0xbb7

    const v15, 0x33a8d29a

    xor-int/2addr v14, v15

    const v15, -0x63a47937

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v13, p1

    aget-short v3, v1, v2

    mul-int v4, v3, v3

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v12

    if-ltz v12, :cond_b

    :goto_5
    const-string v12, "\u06eb\u073f"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, -0x61

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x268f

    const v15, -0x13fde7d6

    xor-int/2addr v14, v15

    const v15, -0x69a7e8de

    goto/16 :goto_9

    :cond_b
    const-string v12, "\u06e1\u1a74"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, -0x65

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x65ab

    const v15, -0x37813087

    xor-int/2addr v14, v15

    const v15, -0x1258aad6

    goto/16 :goto_9

    :sswitch_e
    move-object/from16 v13, p1

    const/16 v2, 0x44

    .line 123
    sget v12, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v12, :cond_c

    :goto_6
    const-string v12, "\u06ec\u073f"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v10

    mul-int/lit8 v12, v12, 0x41

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x29e1

    const v15, 0x7b11925a

    xor-int/2addr v14, v15

    const v15, -0x21a99440

    goto/16 :goto_9

    :cond_c
    const-string v12, "\u1a74\u06d7"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x56e3

    const v15, -0x54180512

    xor-int/2addr v14, v15

    const v15, 0x742730dc

    goto :goto_9

    :sswitch_f
    move-object/from16 v13, p1

    sget-object v1, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    .line 28
    sget v12, Ll/֨ۧ;->֫۠֡:I

    if-gtz v12, :cond_d

    :goto_7
    const-string v12, "\u06e4\u06df"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, 0x9

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x2df5

    const v15, -0x36797f86

    xor-int/2addr v14, v15

    const v15, -0x1b6001ec

    goto :goto_9

    :cond_d
    const-string v12, "\u06e4\u06d7"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0xdb

    const v15, 0x9e986fb

    xor-int/2addr v14, v15

    const v15, 0x51bc1541

    goto :goto_9

    :sswitch_10
    move-object/from16 v13, p1

    sget v12, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v12, :cond_e

    :goto_8
    const-string v12, "\u06e7\u073a"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, 0x2d

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x72a3

    const v15, -0x1ea430a2

    xor-int/2addr v14, v15

    const v15, -0x7e32cc55

    goto :goto_9

    :cond_e
    const-string v12, "\u05a1\u1a75"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x5607

    const v15, 0x1fb96691

    xor-int/2addr v14, v15

    const v15, -0x3b6a576

    :goto_9
    xor-int/2addr v12, v15

    move v13, v14

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c98214f -> :sswitch_1
        -0x79c25730 -> :sswitch_f
        -0x6cdde470 -> :sswitch_7
        -0x5a1e8530 -> :sswitch_10
        -0x59a10404 -> :sswitch_7
        -0x57c7f2ce -> :sswitch_0
        -0x553c4f7e -> :sswitch_4
        -0x5509b6c4 -> :sswitch_6
        -0x4ed9be5f -> :sswitch_e
        -0x4be724c8 -> :sswitch_4
        -0x4a3648d4 -> :sswitch_9
        -0x482a90b0 -> :sswitch_1
        -0x3812daa1 -> :sswitch_d
        -0x36f4fb4f -> :sswitch_0
        -0x30f0870d -> :sswitch_a
        -0x2e841572 -> :sswitch_c
        -0x10a4945c -> :sswitch_6
        -0x2e0310c -> :sswitch_8
        0x1403fcc -> :sswitch_3
        0x3bf8c34 -> :sswitch_d
        0xb219adb -> :sswitch_b
        0x21b78897 -> :sswitch_3
        0x24163af7 -> :sswitch_2
        0x26274f39 -> :sswitch_e
        0x375ede01 -> :sswitch_10
        0x3be62383 -> :sswitch_2
        0x4a6d729e -> :sswitch_b
        0x4e14da47 -> :sswitch_8
        0x543793c8 -> :sswitch_a
        0x6013b582 -> :sswitch_5
        0x68f1842e -> :sswitch_5
        0x6b337ee1 -> :sswitch_f
        0x7b50b712 -> :sswitch_c
        0x7e381c83 -> :sswitch_9
    .end sparse-switch
.end method

.method public final varargs getString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    const v0, 0x5b1d591b

    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    sget v2, Ll/ۗ;->֨۬ۖ:I

    const-string v3, "\u06eb\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x611d

    const v5, 0x1e7d6ae

    xor-int/2addr v4, v5

    const v5, 0x516a6887

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0xa47

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 137
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    goto/16 :goto_1

    .line 36
    :sswitch_0
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_1

    .line 22
    :sswitch_1
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-lez v3, :cond_9

    goto/16 :goto_2

    .line 62
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-nez v3, :cond_7

    goto/16 :goto_1

    .line 75
    :sswitch_3
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    const/4 p1, 0x0

    return-object p1

    .line 238
    :sswitch_4
    invoke-virtual {p0, p1}, Ll/ۧ֨ۘ;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ۧ֨ۘ;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 198
    :sswitch_5
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u06db\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x14b3

    const v5, -0x35a6f14a    # -3556269.5f

    xor-int/2addr v4, v5

    const v5, -0x6472b2b9

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06e8\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1571

    const v5, 0x5ed45325

    xor-int/2addr v4, v5

    const v5, -0x76757f26

    goto :goto_0

    .line 5
    :sswitch_7
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    const-string v3, "\u06dc\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x28c5

    const v5, -0x7fd3c223

    xor-int/2addr v4, v5

    const v5, -0x2d896d54

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a76\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x55e9

    const v5, 0x4099edc1

    xor-int/2addr v4, v5

    const v5, 0x161d40d9

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06eb\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6bdf

    const v5, 0x788cfc9b

    xor-int/2addr v4, v5

    const v5, -0x2648e2d3

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_5

    :goto_1
    const-string v3, "\u073a\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x16bf

    const v5, -0x2546e2d0

    xor-int/2addr v4, v5

    const v5, -0x2ab5c949

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e2\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7f9

    const v5, -0x4ff90d9e

    xor-int/2addr v4, v5

    const v5, -0x6a857c31

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06da\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xe95

    const v5, 0x66af98d1

    xor-int/2addr v4, v5

    const v5, 0x4adaddec    # 7171830.0f

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u073f\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4fe3

    const v5, 0x58cd3b78

    xor-int/2addr v4, v5

    const v5, 0x6ea7a442

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e2\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xfc3

    const v5, 0x1e8486c

    xor-int/2addr v4, v5

    const v5, -0x125cdb45

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v3

    if-eqz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u073a\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x72f9

    const v5, 0x1b675646

    xor-int/2addr v4, v5

    const v5, -0x2e91a0bf

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u0730\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5b53

    const v5, -0x2e0ecfb6

    xor-int/2addr v4, v5

    const v5, 0x2d7e586b

    goto/16 :goto_0

    .line 138
    :sswitch_d
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u1a78\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7791

    const v5, -0x2acb83b8

    xor-int/2addr v4, v5

    const v5, -0x43891b8a

    goto/16 :goto_0

    .line 34
    :sswitch_e
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v3

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u1a7b\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x377f

    const v5, -0x2ca97cc5

    xor-int/2addr v4, v5

    const v5, 0x21f9f100

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073f\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x381b

    const v5, 0x75d1c640

    xor-int/2addr v4, v5

    const v5, -0x25aa826e

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75059d57 -> :sswitch_3
        -0x6cc9d093 -> :sswitch_8
        -0x630af9c2 -> :sswitch_d
        -0x5e998cdf -> :sswitch_9
        -0x59f21318 -> :sswitch_4
        -0x3a0578a3 -> :sswitch_5
        -0x393d2bb2 -> :sswitch_b
        -0x26085e5a -> :sswitch_8
        -0x20037418 -> :sswitch_a
        -0x1142aaf1 -> :sswitch_c
        -0x1057b966 -> :sswitch_2
        -0xacd0737 -> :sswitch_0
        0x858dd1f -> :sswitch_6
        0xfafa954 -> :sswitch_3
        0x1021edbc -> :sswitch_4
        0x13141052 -> :sswitch_2
        0x13c30bdb -> :sswitch_9
        0x18743e25 -> :sswitch_0
        0x1ac38ff1 -> :sswitch_e
        0x266ac37d -> :sswitch_c
        0x270e67cf -> :sswitch_b
        0x31e9ef86 -> :sswitch_d
        0x320bb50e -> :sswitch_7
        0x483ead67 -> :sswitch_1
        0x557d307d -> :sswitch_5
        0x59afbcd9 -> :sswitch_1
        0x5f53d9ef -> :sswitch_a
        0x6d8b4583 -> :sswitch_6
        0x6ea5751a -> :sswitch_7
        0x7e9e45f6 -> :sswitch_e
    .end sparse-switch
.end method

.method public final varargs getStringArray([Ljava/lang/String;)[Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x7af34243

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v5, "\u0736\u1a79"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x7b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2c37

    const v7, -0x3b0fe907

    xor-int/2addr v6, v7

    const v7, -0x2d53524d

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x477

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget v5, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v5, :cond_6

    goto/16 :goto_4

    .line 186
    :sswitch_0
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget-boolean v5, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v5, :cond_b

    goto :goto_1

    .line 51
    :sswitch_1
    sget v5, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez v5, :cond_8

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget-boolean v5, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v5, :cond_4

    goto :goto_1

    .line 165
    :sswitch_3
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    :goto_1
    const-string v5, "\u0730\u06d8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1af3

    const v7, 0x7d5a01c2

    xor-int/2addr v6, v7

    const v7, -0x5e685a8a

    goto :goto_0

    .line 152
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    const/4 p1, 0x0

    return-object p1

    :sswitch_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 251
    :sswitch_6
    aput-object v1, p1, v0

    .line 199
    sget-boolean v5, Ll/᩶;->ۚۤۘ:Z

    if-eqz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v5, "\u1a74\u1a7b"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2ef5

    const v7, 0x28ba6074

    xor-int/2addr v6, v7

    const v7, -0x40407bdc

    goto :goto_0

    .line 251
    :sswitch_7
    aget-object v1, p1, v0

    invoke-virtual {p0, v1}, Ll/ۧ֨ۘ;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v5, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u0730\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x51

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x72b9

    const v7, 0x78989e41

    xor-int/2addr v6, v7

    const v7, -0xffd0e46

    goto/16 :goto_0

    :sswitch_8
    return-object p1

    .line 250
    :sswitch_9
    array-length v5, p1

    if-ge v0, v5, :cond_2

    const-string v5, "\u073f\u06db"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x4d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x11bd

    const v7, 0xde4399d

    xor-int/2addr v6, v7

    const v7, 0x449f7ef

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u06e1\u0730"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x169d

    const v7, -0x6d94f8f

    xor-int/2addr v6, v7

    const v7, -0xea57494

    goto/16 :goto_0

    :sswitch_a
    const/4 v0, 0x0

    :goto_2
    const-string v5, "\u06e8\u1a7a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x1f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xa9f

    const v7, -0x7321d5b2

    xor-int/2addr v6, v7

    const v7, 0x3f0b0a3c

    goto/16 :goto_0

    .line 54
    :sswitch_b
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u06e2\u06e2"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x22e7

    const v7, 0x36fc22c4

    xor-int/2addr v6, v7

    const v7, -0x79a95467

    goto/16 :goto_0

    .line 202
    :sswitch_c
    sget v5, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v5, :cond_5

    :cond_4
    const-string v5, "\u1a79\u1a76"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5771

    const v7, -0x6c4559d7

    xor-int/2addr v6, v7

    const v7, 0x46bb6204

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u1a76\u1a79"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x4f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xdeb

    const v7, 0x2379eaf5

    xor-int/2addr v6, v7

    const v7, 0x1557e9f

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06dc\u073f"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x62ed

    const v7, -0xe1df90f

    xor-int/2addr v6, v7

    const v7, 0x7c7bcfa

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v5, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u06d7\u073d"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x9

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7581

    const v7, -0x6a5a41d6

    xor-int/2addr v6, v7

    const v7, -0x3413c31d    # -3.0964166E7f

    goto/16 :goto_0

    .line 97
    :sswitch_e
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v5

    if-ltz v5, :cond_9

    :cond_8
    :goto_3
    const-string v5, "\u06dc\u06d7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xd45

    const v7, 0x6a1e3a29

    xor-int/2addr v6, v7

    const v7, -0x4d6e151b

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u0736\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7813

    const v7, 0x3ea614c9

    xor-int/2addr v6, v7

    const v7, -0x104ce5b6

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/ۗ;->֨۬ۖ:I

    if-ltz v5, :cond_a

    goto :goto_4

    :cond_a
    const-string v5, "\u0736\u06ec"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x50af

    const v7, -0x64aa5f7b

    xor-int/2addr v6, v7

    const v7, 0x9a6311d    # 4.0009232E-33f

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_c

    :cond_b
    const-string v5, "\u06e1\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x19

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x419d

    const v7, 0x5a08af5c

    xor-int/2addr v6, v7

    const v7, 0x3bec564d

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u05a8\u06d9"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5b65

    const v7, 0x18e67331

    xor-int/2addr v6, v7

    const v7, 0x724e4bf2

    goto/16 :goto_0

    :sswitch_11
    sget v5, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v5, :cond_d

    :goto_4
    const-string v5, "\u06e8\u0733"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3fc3

    const v7, 0x558151b1

    xor-int/2addr v6, v7

    const v7, -0xda9137a

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06d7\u06e2"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x686d

    const v7, 0x2064f5aa

    xor-int/2addr v6, v7

    const v7, 0x2a692e6f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7465663d -> :sswitch_b
        -0x73ec7ea8 -> :sswitch_f
        -0x6f12dfd8 -> :sswitch_b
        -0x653d0287 -> :sswitch_5
        -0x4b1bac23 -> :sswitch_9
        -0x3c89d4e3 -> :sswitch_5
        -0x3b814cf2 -> :sswitch_c
        -0x39b309e0 -> :sswitch_10
        -0x31ac1e91 -> :sswitch_a
        -0x2ebfb510 -> :sswitch_11
        -0x2ea772e4 -> :sswitch_3
        -0x2ca5f138 -> :sswitch_6
        -0x2b43c0a7 -> :sswitch_f
        -0x2901d723 -> :sswitch_8
        -0x28d7f9e9 -> :sswitch_0
        -0x2820ec15 -> :sswitch_11
        -0x420b3d1 -> :sswitch_1
        0x40f96da -> :sswitch_d
        0xf17c35e -> :sswitch_10
        0x1c01e70c -> :sswitch_7
        0x1ec848aa -> :sswitch_0
        0x229bbd36 -> :sswitch_9
        0x22b950c3 -> :sswitch_c
        0x278f9f7a -> :sswitch_7
        0x2cd8e0b1 -> :sswitch_e
        0x30ccfc1c -> :sswitch_4
        0x3e908e79 -> :sswitch_1
        0x4a2b35b3 -> :sswitch_4
        0x508e4ede -> :sswitch_2
        0x592d44f3 -> :sswitch_2
        0x596b0eee -> :sswitch_6
        0x626a3440 -> :sswitch_8
        0x62f85025 -> :sswitch_e
        0x63c61ac3 -> :sswitch_3
        0x6568eb91 -> :sswitch_d
        0x6dea02b4 -> :sswitch_a
    .end sparse-switch
.end method

.method public final varargs getStringList([Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 244
    invoke-virtual {p0, p1}, Ll/ۧ֨ۘ;->getStringArray([Ljava/lang/String;)[Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getStringNullable(Ljava/lang/String;)Ljava/lang/String;
    .locals 31

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

    const v23, 0x4c1a82a5    # 4.0503956E7f

    sget v24, Ll/ۗܺ;->ۨ᩺۠:I

    sget v25, Ll/֡֡;->᩶ۤ۠:I

    const-string v26, "\u0730\u06d9"

    invoke-static/range {v26 .. v26}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v26

    xor-int v26, v26, v25

    xor-int v2, v26, v24

    mul-int/lit16 v2, v2, 0x7843

    const v28, 0x3f362fba

    xor-int v2, v2, v28

    const v28, -0x7e538e74

    xor-int v26, v26, v28

    move-object v5, v4

    move-object/from16 v28, v9

    move-object/from16 v15, v20

    move/from16 v27, v26

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v26, 0x4c1a82a5    # 4.0503956E7f

    move-object v9, v8

    move-object/from16 v20, v13

    move-object v8, v7

    move-object v13, v12

    move-object v7, v6

    move-object v12, v11

    const/4 v6, 0x0

    move-object v11, v10

    :goto_0
    xor-int v10, v26, v24

    mul-int/lit16 v10, v10, -0x6643

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v2, v10

    xor-int v26, v27, v2

    sparse-switch v26, :sswitch_data_0

    .line 49
    sget v2, Ll/֡᩸;->ۨ᩵ܽ:I

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "\u0736\u06d6"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v25

    mul-int/lit8 v2, v2, -0x51

    xor-int v10, v2, v24

    mul-int/lit16 v10, v10, 0x7d19

    const v27, -0x49cbc16a

    xor-int v10, v10, v27

    const v27, 0x6ae9e4af

    goto/16 :goto_9

    :sswitch_0
    sget-boolean v2, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string v2, "\u06e1\u1a75"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v24

    mul-int/lit8 v2, v2, 0x57

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, 0x1653

    const v27, 0x5de8820c

    xor-int v10, v10, v27

    const v27, 0x28a48b41

    goto/16 :goto_9

    :sswitch_1
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v2

    if-lez v2, :cond_2

    goto :goto_4

    :cond_2
    :goto_2
    const-string v2, "\u1a78\u06eb"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v25

    xor-int v10, v2, v24

    mul-int/lit16 v10, v10, -0x7d7

    const v27, 0x5efc1710

    xor-int v10, v10, v27

    const v27, 0x22df90d9

    goto/16 :goto_9

    .line 113
    :sswitch_2
    sget v2, Ll/ۧ;->֫۠ᩴ:I

    if-gez v2, :cond_4

    :cond_3
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    goto/16 :goto_17

    :cond_4
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    goto/16 :goto_16

    :sswitch_3
    sget-boolean v2, Ll/֨۟;->ܿ᩻۫:Z

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    move/from16 v2, v22

    move/from16 v10, v23

    goto/16 :goto_a

    .line 229
    :sswitch_4
    sget-boolean v2, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v2, :cond_6

    :goto_3
    move/from16 v2, v22

    move/from16 v10, v23

    goto/16 :goto_15

    :cond_6
    :goto_4
    const-string v2, "\u073d\u0730"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v24

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, -0x1237

    const v27, -0x5b5d5a94

    xor-int v10, v10, v27

    const v27, -0x4143eb53

    goto/16 :goto_9

    .line 181
    :sswitch_5
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget-boolean v2, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v2, :cond_3

    goto :goto_3

    :sswitch_6
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    goto :goto_3

    .line 267
    :sswitch_7
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    const/4 v1, 0x0

    return-object v1

    .line 46
    :sswitch_8
    new-instance v2, Ll/֡֨ۘ;

    sget-object v10, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    move-object/from16 v27, v8

    .line 24
    sget v29, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v29, :cond_7

    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    move-object/from16 v8, v27

    goto/16 :goto_17

    :cond_7
    const/4 v8, 0x7

    .line 40
    sget-boolean v30, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v30, :cond_8

    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    move-object/from16 v8, v27

    goto/16 :goto_11

    :cond_8
    move/from16 v29, v3

    const/16 v3, 0x5c

    .line 46
    invoke-static {v10, v3, v8, v14}, Ll/ۘۗ;->᩺ۛۙ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ll/֡֨ۘ;-><init>(Ljava/lang/String;)V

    sput-object v2, Ll/᩷᩹ۘ;->ܰ:Ll/֡֨ۘ;

    goto :goto_5

    .line 48
    :sswitch_9
    sget-object v1, Ll/᩷᩹ۘ;->ܰ:Ll/֡֨ۘ;

    .line 212
    invoke-virtual {v1, v5, v7}, Ll/֡֨ۘ;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :sswitch_a
    move/from16 v29, v3

    move-object/from16 v27, v8

    .line 45
    sget-object v2, Ll/᩷᩹ۘ;->ܰ:Ll/֡֨ۘ;

    if-nez v2, :cond_9

    const-string v2, "\u06d6\u06dc"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v24

    xor-int v3, v2, v25

    mul-int/lit16 v3, v3, 0x26f9

    const v8, 0x2ffcfc6b

    xor-int/2addr v3, v8

    const v8, -0x66088165

    goto/16 :goto_7

    :cond_9
    :goto_5
    const-string v2, "\u1a79\u06d7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v25

    mul-int/lit8 v2, v2, -0x51

    xor-int v3, v2, v24

    mul-int/lit16 v3, v3, -0x12f

    const v8, 0x465127b4

    xor-int/2addr v3, v8

    const v8, 0x7423c374

    goto/16 :goto_7

    :sswitch_b
    return-object v13

    :sswitch_c
    move/from16 v29, v3

    move-object/from16 v27, v8

    .line 210
    invoke-virtual {v12, v5, v7}, Ll/֡֨ۘ;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_a

    const-string v2, "\u06e7\u06d8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v24

    xor-int v3, v2, v25

    mul-int/lit16 v3, v3, -0x24f

    const v8, 0x614f653

    xor-int/2addr v3, v8

    const v8, -0x25687343

    goto/16 :goto_7

    :cond_a
    const-string v2, "\u0733\u0730"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v25

    mul-int/lit8 v2, v2, 0x7d

    xor-int v3, v2, v24

    mul-int/lit16 v3, v3, 0x3e95

    const v8, -0x48f2e30c

    xor-int/2addr v3, v8

    const v8, -0x273909e1

    goto :goto_7

    .line 312
    :sswitch_d
    invoke-static {}, Ll/᩷᩹ۘ;->ۚ()Lbin/mt/plugin/api/LocalString;

    move-result-object v1

    .line 219
    check-cast v1, Ll/֡֨ۘ;

    invoke-virtual {v1, v9, v7}, Ll/֡֨ۘ;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :sswitch_e
    move/from16 v29, v3

    move-object/from16 v27, v8

    .line 0
    invoke-static {v4, v4, v1}, Ll/᩷ۘᩳ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v5, v2

    move/from16 v10, v23

    goto/16 :goto_e

    :sswitch_f
    move/from16 v29, v3

    move-object/from16 v27, v8

    .line 196
    invoke-virtual {v11}, Ll/ۨ᩹ۘ;->ۨ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۧ֨ۘ;->ۙ(Ljava/lang/String;)Ll/֡֨ۘ;

    move-result-object v2

    .line 197
    iput-object v2, v0, Ll/ۧ֨ۘ;->ۨ:Ll/֡֨ۘ;

    :goto_6
    move-object v12, v2

    goto/16 :goto_8

    :sswitch_10
    move/from16 v29, v3

    move-object/from16 v27, v8

    .line 196
    iget-object v2, v0, Ll/ۧ֨ۘ;->᩹:Ll/ܳۡۘ;

    iget-object v2, v2, Ll/ܳۡۘ;->ܺ:Ljava/lang/Object;

    move-object v11, v2

    check-cast v11, Ll/ۨ᩹ۘ;

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v2

    if-nez v2, :cond_b

    move/from16 v2, v22

    move/from16 v10, v23

    move-object/from16 v8, v27

    goto/16 :goto_16

    :cond_b
    const-string v2, "\u073d\u05a8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v24

    xor-int v3, v2, v25

    mul-int/lit16 v3, v3, -0xd1d

    const v8, -0x1d0084bf

    xor-int/2addr v3, v8

    const v8, 0x6f206fa9

    :goto_7
    xor-int/2addr v2, v8

    move-object/from16 v8, v27

    move/from16 v27, v2

    move v2, v3

    goto/16 :goto_14

    :sswitch_11
    move-object/from16 v27, v8

    .line 217
    invoke-static {v15, v3, v6, v14}, Ll/֨ۧ;->᩻᩵᩵([SIII)Ljava/lang/String;

    move-result-object v2

    .line 218
    invoke-static {v8, v2}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    const-string v2, "\u06d6\u06db"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v24, v2

    mul-int/lit8 v2, v2, 0x5f

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, 0x4c4f

    const v27, -0x7062afef

    xor-int v10, v10, v27

    const v27, 0x9f03bea

    goto/16 :goto_9

    .line 217
    :sswitch_12
    sget-object v15, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    const/16 v3, 0x58

    const/4 v6, 0x4

    sget v2, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v2, :cond_c

    goto/16 :goto_3

    :cond_c
    const-string v2, "\u05a8\u1a76"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v24, v2

    mul-int/lit8 v2, v2, -0x6d

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, -0x7e7

    const v27, -0x14a3ce70

    xor-int v10, v10, v27

    const v27, -0x3a525ee3

    goto/16 :goto_9

    :sswitch_13
    return-object v28

    .line 0
    :sswitch_14
    invoke-static {v4, v1}, Ll/֡ۛ;->ۖۘ۟(ILjava/lang/Object;)C

    move-result v2

    const/16 v10, 0x7d

    if-ne v2, v10, :cond_d

    const-string v2, "\u1a79\u06ec"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v25

    mul-int/lit8 v2, v2, 0x7b

    xor-int v10, v2, v24

    mul-int/lit16 v10, v10, 0x1d65

    const v27, 0x59b9c468

    xor-int v10, v10, v27

    const v27, -0x6f5e7639

    goto/16 :goto_9

    :cond_d
    move/from16 v29, v3

    move/from16 v3, v22

    move/from16 v10, v23

    goto/16 :goto_d

    .line 192
    :sswitch_15
    iget-object v2, v0, Ll/ۧ֨ۘ;->ۨ:Ll/֡֨ۘ;

    if-eqz v2, :cond_e

    goto/16 :goto_6

    :goto_8
    const-string v2, "\u1a7a\u1a73"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v25

    xor-int v10, v2, v24

    mul-int/lit16 v10, v10, -0x7c55

    const v27, -0x256664de

    xor-int v10, v10, v27

    const v27, 0x26da90af

    goto :goto_9

    :cond_e
    const-string v2, "\u0733\u06dc"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v25, v2

    mul-int/lit8 v2, v2, -0xd

    xor-int v10, v2, v24

    mul-int/lit16 v10, v10, -0x3ae3

    const v27, -0x249641f5

    xor-int v10, v10, v27

    const v27, 0x7334daaf

    goto :goto_9

    .line 217
    :sswitch_16
    invoke-virtual {v0, v8}, Ll/ۧ֨ۘ;->ۙ(Ljava/lang/String;)Ll/֡֨ۘ;

    move-result-object v2

    invoke-virtual {v2, v9, v7}, Ll/֡֨ۘ;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    if-nez v28, :cond_f

    const-string v2, "\u06e2\u06dc"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v24

    mul-int/lit8 v2, v2, -0x3f

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, 0x6167

    const v27, -0x77aae2ae

    xor-int v10, v10, v27

    const v27, 0x4a99c735    # 5039002.5f

    goto :goto_9

    :cond_f
    const-string v2, "\u1a78\u06e7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v25

    mul-int/lit8 v2, v2, -0x19

    xor-int v10, v2, v24

    mul-int/lit16 v10, v10, 0x7a67

    const v27, -0x13d681d6

    xor-int v10, v10, v27

    const v27, -0x17299af4

    :goto_9
    xor-int v27, v2, v27

    move v2, v10

    goto/16 :goto_0

    :sswitch_17
    move/from16 v2, v22

    move/from16 v10, v23

    .line 215
    invoke-static {v5, v2, v10}, Ll/ۖܽ;->۠᩹ۖ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v8

    add-int v9, v10, v4

    .line 216
    invoke-static {v5, v9}, Ll/֨᩸;->᩷᩷ۛ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v9

    sget v22, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v22, :cond_10

    :goto_a
    const-string v22, "\u1a7a\u06ec"

    invoke-static/range {v22 .. v22}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v25

    mul-int/lit8 v22, v22, 0x7

    xor-int v0, v22, v24

    mul-int/lit16 v0, v0, 0x5f7f

    const v23, -0x2392b41e

    xor-int v0, v0, v23

    const v23, -0x6450ab2c

    xor-int v27, v22, v23

    move/from16 v22, v2

    move/from16 v23, v10

    move v2, v0

    goto/16 :goto_c

    :cond_10
    const-string v0, "\u05a1\u06e4"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    move/from16 v29, v3

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, -0x74f

    const v22, -0x1a94c527

    xor-int v3, v3, v22

    const v22, -0x42c2dc93

    goto/16 :goto_12

    :sswitch_18
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    .line 204
    invoke-static {v1, v2}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v0

    const/16 v3, 0x7b

    if-ne v0, v3, :cond_11

    const-string v0, "\u06d7\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v25, v0

    mul-int/lit8 v0, v0, 0x63

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, -0x17cb

    const v22, 0x3f51a31e

    xor-int v3, v3, v22

    const v22, -0x7b3e48ea

    goto/16 :goto_12

    :cond_11
    move v3, v2

    goto :goto_d

    :sswitch_19
    move/from16 v29, v3

    move/from16 v2, v22

    const/16 v0, 0x3a

    .line 207
    invoke-static {v5, v0}, Ll/ۗܺ;->᩻᩷ܶ(Ljava/lang/Object;I)I

    move-result v0

    const/4 v3, -0x1

    const/4 v7, 0x0

    if-ne v0, v3, :cond_12

    const-string v3, "\u06e0\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v24

    mul-int/lit8 v3, v3, 0x11

    xor-int v10, v3, v25

    mul-int/lit16 v10, v10, 0x39cf

    const v22, -0x588ab55e

    xor-int v10, v10, v22

    const v22, 0x2a0abd6d

    goto :goto_b

    :cond_12
    const-string v3, "\u1a79\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v24

    xor-int v10, v3, v25

    mul-int/lit16 v10, v10, -0x78ef

    const v22, -0x5ecf3a6f

    xor-int v10, v10, v22

    const v22, 0x426cdc99

    :goto_b
    xor-int v27, v3, v22

    move/from16 v23, v0

    move/from16 v22, v2

    move v2, v10

    move/from16 v3, v29

    :goto_c
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_1a
    move/from16 v29, v3

    move/from16 v10, v23

    .line 204
    invoke-static/range {p1 .. p1}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v0

    const/4 v2, 0x3

    const/16 v22, 0x0

    const/4 v4, 0x1

    if-lt v0, v2, :cond_13

    const-string v0, "\u0733\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    mul-int/lit8 v0, v0, -0x69

    xor-int v2, v0, v25

    mul-int/lit16 v2, v2, 0x1d41

    const v3, -0x2ddbbcaf

    xor-int/2addr v2, v3

    const v3, 0x209937ee

    goto :goto_f

    :cond_13
    const/4 v3, 0x0

    :goto_d
    move-object v5, v1

    move/from16 v22, v3

    :goto_e
    const-string v0, "\u1a79\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v25

    mul-int/lit8 v0, v0, -0x69

    xor-int v2, v0, v24

    mul-int/lit16 v2, v2, -0x1f65

    const v3, -0x24be5513

    xor-int/2addr v2, v3

    const v3, -0x454efef

    :goto_f
    xor-int v27, v0, v3

    move-object/from16 v0, p0

    goto/16 :goto_13

    :sswitch_1b
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    const/16 v0, 0x3213

    const/16 v14, 0x3213

    goto :goto_10

    :sswitch_1c
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    const/16 v0, 0x1a6e

    const/16 v14, 0x1a6e

    :goto_10
    const-string v0, "\u1a74\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v25, v0

    mul-int/lit8 v0, v0, 0x41

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, 0x6593

    const v22, 0x7b5d0e65

    xor-int v3, v3, v22

    const v22, 0x275789a7

    goto/16 :goto_12

    :sswitch_1d
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    add-int/lit8 v0, v19, 0x1

    sub-int v0, v18, v0

    if-ltz v0, :cond_14

    const-string v0, "\u073d\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v25, v0

    mul-int/lit8 v0, v0, 0x77

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, -0x2b89

    const v22, 0x67d92bc5

    xor-int v3, v3, v22

    const v22, 0x773e0852

    goto/16 :goto_12

    :cond_14
    const-string v0, "\u06dc\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, 0x3d6d

    const v22, 0x55fda0bf

    xor-int v3, v3, v22

    const v22, -0x2a810e74

    goto :goto_12

    :sswitch_1e
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    mul-int v18, v17, v17

    mul-int/lit8 v19, v16, 0x2

    .line 303
    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v0, :cond_15

    goto :goto_11

    :cond_15
    const-string v0, "\u073a\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, 0x6b99

    const v22, -0x2ec0d68e

    xor-int v3, v3, v22

    const v22, 0x3d776bea

    goto :goto_12

    :sswitch_1f
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    aget-short v16, v20, v21

    add-int/lit8 v17, v16, 0x1

    .line 276
    sget v0, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v0, :cond_16

    :goto_11
    const-string v0, "\u0730\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v24

    mul-int/lit8 v0, v0, 0x2b

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, -0x17cd

    const v22, -0x1b3b7f8b

    xor-int v3, v3, v22

    const v22, -0x57f7efba

    goto :goto_12

    :cond_16
    const-string v0, "\u1a77\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v24, v0

    mul-int/lit8 v0, v0, 0x6d

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, -0x22d

    const v22, -0x3220194e

    xor-int v3, v3, v22

    const v22, -0x55c26fc4

    :goto_12
    xor-int v27, v0, v22

    move-object/from16 v0, p0

    move/from16 v22, v2

    move v2, v3

    :goto_13
    move/from16 v23, v10

    :goto_14
    move/from16 v3, v29

    goto/16 :goto_0

    :sswitch_20
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    const/16 v21, 0x57

    sget v0, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v0, :cond_17

    move/from16 v3, v29

    :goto_15
    const-string v0, "\u06ec\u06e4"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, 0x5839

    const v22, -0x29c60db5

    xor-int v1, v1, v22

    const v22, -0x16082632

    xor-int v27, v0, v22

    move-object/from16 v0, p0

    move/from16 v22, v2

    move/from16 v23, v10

    goto/16 :goto_19

    :cond_17
    const-string v0, "\u1a75\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v25, v0

    mul-int/lit8 v0, v0, -0x2d

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, -0x6a89

    const v3, 0x27038178

    xor-int/2addr v1, v3

    const v3, 0x67fe1d3e    # 2.400041E24f

    goto :goto_18

    :sswitch_21
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    sget-object v20, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    .line 67
    sget v0, Ll/֫;->ܶܺ᩻:I

    if-ltz v0, :cond_18

    :goto_16
    const-string v0, "\u073d\u06e2"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v1, v0, v25

    mul-int/lit16 v1, v1, -0x4d33

    const v3, -0x38ce01a5

    xor-int/2addr v1, v3

    const v3, 0xda9179c

    goto :goto_18

    :cond_18
    const-string v0, "\u06eb\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, 0x4e15

    const v3, 0x45d5dc36

    xor-int/2addr v1, v3

    const v3, -0x7b18806d

    goto :goto_18

    :sswitch_22
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    .line 130
    sget v0, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v0, :cond_19

    :goto_17
    const-string v0, "\u0730\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v24

    mul-int/lit8 v0, v0, 0x59

    xor-int v1, v0, v25

    mul-int/lit16 v1, v1, -0x2423

    const v3, -0x51e23838

    xor-int/2addr v1, v3

    const v3, 0x4c0b72af    # 3.6555452E7f

    goto :goto_18

    :cond_19
    const-string v0, "\u06e8\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v24

    mul-int/lit8 v0, v0, 0x2b

    xor-int v1, v0, v25

    mul-int/lit16 v1, v1, -0x4bcb

    const v3, 0x4150a5fd

    xor-int/2addr v1, v3

    const v3, -0xac114e2

    :goto_18
    xor-int v27, v0, v3

    move-object/from16 v0, p0

    move/from16 v22, v2

    move/from16 v23, v10

    move/from16 v3, v29

    :goto_19
    move v2, v1

    move-object/from16 v1, p1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74aaf178 -> :sswitch_12
        -0x732a719e -> :sswitch_0
        -0x7173db1d -> :sswitch_4
        -0x6ea340c5 -> :sswitch_9
        -0x6c2e6201 -> :sswitch_a
        -0x640726d7 -> :sswitch_1e
        -0x63c72cfb -> :sswitch_1b
        -0x6377b95d -> :sswitch_8
        -0x635ec6be -> :sswitch_15
        -0x612dcd76 -> :sswitch_1
        -0x5cdfc49c -> :sswitch_b
        -0x5a2262ab -> :sswitch_7
        -0x54ee98a7 -> :sswitch_1e
        -0x539f9e49 -> :sswitch_22
        -0x527591e4 -> :sswitch_18
        -0x4a71455d -> :sswitch_14
        -0x45c8b74b -> :sswitch_21
        -0x455067a0 -> :sswitch_3
        -0x42a79fa4 -> :sswitch_12
        -0x3ac660a3 -> :sswitch_4
        -0x375ca44d -> :sswitch_1f
        -0x3732e964 -> :sswitch_20
        -0x34ba6538 -> :sswitch_6
        -0x3465a260 -> :sswitch_21
        -0x3279f23a -> :sswitch_22
        -0x303a27a0 -> :sswitch_1
        -0x2f71b66c -> :sswitch_c
        -0x2f4e9632 -> :sswitch_8
        -0x2d525dcc -> :sswitch_18
        -0x2c63499d -> :sswitch_10
        -0x1c2076f0 -> :sswitch_e
        -0x160496a1 -> :sswitch_b
        -0x104a0003 -> :sswitch_a
        -0xf441bed -> :sswitch_9
        -0xf1af27d -> :sswitch_14
        -0xee8f013 -> :sswitch_16
        -0x85ed22a -> :sswitch_7
        -0x8376cad -> :sswitch_15
        -0x805c153 -> :sswitch_5
        -0x515fff2 -> :sswitch_1f
        -0x1ce8268 -> :sswitch_1b
        0x109c266 -> :sswitch_20
        0x33d6e55 -> :sswitch_1a
        0x89dc402 -> :sswitch_11
        0x8a08217 -> :sswitch_e
        0x995044b -> :sswitch_1d
        0x9c8057d -> :sswitch_19
        0xb292ad0 -> :sswitch_17
        0x105c0554 -> :sswitch_1c
        0x1906b661 -> :sswitch_f
        0x1a86ff0b -> :sswitch_17
        0x207b210e -> :sswitch_11
        0x26664431 -> :sswitch_f
        0x35ff5365 -> :sswitch_6
        0x39052198 -> :sswitch_d
        0x3a98642f -> :sswitch_19
        0x3c528eda -> :sswitch_0
        0x44ef3d4a -> :sswitch_3
        0x4d433317 -> :sswitch_16
        0x5290d436 -> :sswitch_d
        0x52d50741 -> :sswitch_10
        0x536a8a22 -> :sswitch_2
        0x567ec7d2 -> :sswitch_1c
        0x63a7fffa -> :sswitch_5
        0x67504ff2 -> :sswitch_13
        0x6af34675 -> :sswitch_c
        0x6e9e3f03 -> :sswitch_13
        0x6ef63249 -> :sswitch_2
        0x72adab3a -> :sswitch_1a
        0x7431409f -> :sswitch_1d
    .end sparse-switch
.end method

.method public final hasClipboardText()Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x5fdcd8e8

    sget v2, Ll/ۗᩳ;->ۚۤ֡:I

    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    const-string v4, "\u05ab\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x602b

    const v6, 0x70dfde75

    xor-int/2addr v5, v6

    const v6, 0x3fed5298

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x495b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 195
    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_6

    goto/16 :goto_3

    .line 47
    :sswitch_0
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v4

    if-eqz v4, :cond_9

    goto/16 :goto_1

    :sswitch_1
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_3

    goto/16 :goto_3

    .line 159
    :sswitch_2
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v4, :cond_b

    goto/16 :goto_1

    .line 309
    :sswitch_3
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    goto/16 :goto_1

    .line 317
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    const/4 v0, 0x0

    :sswitch_5
    return v0

    :sswitch_6
    const/4 v0, 0x0

    return v0

    .line 393
    :sswitch_7
    :try_start_0
    invoke-direct {p0}, Ll/ۧ֨ۘ;->ۙ()Landroid/content/ClipboardManager;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "\u073a\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3c8f

    const v6, -0x622f6e95

    xor-int/2addr v5, v6

    const v6, -0x1c3dc9e0

    goto :goto_0

    :catchall_0
    const-string v4, "\u05a1\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7d17

    const v6, -0x43594e46

    xor-int/2addr v5, v6

    const v6, 0x741c441e

    goto :goto_0

    .line 258
    :sswitch_8
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_0

    const-string v4, "\u0733\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x779b

    const v6, -0x3300c9a3

    xor-int/2addr v5, v6

    const v6, 0x2e407d9c

    goto/16 :goto_0

    :cond_0
    const-string v4, "\u0736\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3add

    const v6, -0x1ec10c9b

    xor-int/2addr v5, v6

    const v6, 0x7823d1f7

    goto/16 :goto_0

    .line 112
    :sswitch_9
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06d7\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1515

    const v6, -0x4e927534

    xor-int/2addr v5, v6

    const v6, 0xb3fd058

    goto/16 :goto_0

    .line 281
    :sswitch_a
    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v4, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v4, "\u073d\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x31d9

    const v6, -0x11e0977a

    xor-int/2addr v5, v6

    const v6, 0x5748f1bf

    goto/16 :goto_0

    .line 72
    :sswitch_b
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_4

    :cond_3
    const-string v4, "\u06db\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4593

    const v6, 0x1da63047

    xor-int/2addr v5, v6

    const v6, 0x1ed2a466

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06eb\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7445

    const v6, 0xe612f33

    xor-int/2addr v5, v6

    const v6, -0xd3c87bf

    goto/16 :goto_0

    .line 184
    :sswitch_c
    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v4, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v4, "\u06e2\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5e93

    const v6, -0x76357a81

    xor-int/2addr v5, v6

    const v6, 0x64f093d6

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d7\u06e0"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x74f5

    const v6, 0x15cabd2c

    xor-int/2addr v5, v6

    const v6, -0x13d554c5

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v4

    if-gtz v4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v4, "\u06da\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x2d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2fc3

    const v6, 0x2d1e6993

    xor-int/2addr v5, v6

    const v6, 0x3744e084

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v4, :cond_8

    :goto_1
    const-string v4, "\u1a73\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3777

    const v6, -0x3544edc4    # -6129950.0f

    xor-int/2addr v5, v6

    const v6, -0x31a97650

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u0736\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x47eb

    const v6, 0x1b9c13cc

    xor-int/2addr v5, v6

    const v6, -0x4b0b5e8

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u06e0\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x31a1

    const v6, -0x48c4f6ac

    xor-int/2addr v5, v6

    const v6, 0x74c59c29

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a76\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x1f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x495f

    const v6, -0x202c77f8

    xor-int/2addr v5, v6

    const v6, -0x15b71d03

    goto/16 :goto_0

    .line 230
    :sswitch_10
    sget-boolean v4, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v4, :cond_c

    :cond_b
    :goto_3
    const-string v4, "\u073f\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7a91

    const v6, 0x3ce90ed7

    xor-int/2addr v5, v6

    const v6, 0x74b4a6aa

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06db\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x576d

    const v6, 0x5c9dc8b

    xor-int/2addr v5, v6

    const v6, -0x48a07949

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6cd3ed7e -> :sswitch_2
        -0x639d056e -> :sswitch_2
        -0x5e12ea2d -> :sswitch_10
        -0x5a4f440e -> :sswitch_10
        -0x55c2d46e -> :sswitch_8
        -0x514ed157 -> :sswitch_3
        -0x4d56d5c7 -> :sswitch_8
        -0x49664ae1 -> :sswitch_4
        -0x3c1a8b22 -> :sswitch_6
        -0x36b718b9 -> :sswitch_9
        -0x25c02496 -> :sswitch_0
        -0x25597b82 -> :sswitch_1
        -0x21a946d7 -> :sswitch_7
        -0x19dc39c7 -> :sswitch_7
        -0x11ed25b6 -> :sswitch_e
        -0xd4ad49b -> :sswitch_4
        -0x946f81e -> :sswitch_c
        0xe7d3ff2 -> :sswitch_d
        0x13fe9cc8 -> :sswitch_9
        0x2307435c -> :sswitch_b
        0x295facb0 -> :sswitch_f
        0x38575ff3 -> :sswitch_6
        0x3ddfc572 -> :sswitch_3
        0x44f0622b -> :sswitch_f
        0x4593dafa -> :sswitch_0
        0x4adf3660 -> :sswitch_5
        0x4d286465 -> :sswitch_c
        0x4f589429 -> :sswitch_a
        0x511cb5b8 -> :sswitch_b
        0x53c19d18 -> :sswitch_a
        0x593c939f -> :sswitch_d
        0x6b6b71aa -> :sswitch_e
        0x77a29134 -> :sswitch_1
        0x7dc22171 -> :sswitch_5
    .end sparse-switch
.end method

.method public final log(Ljava/lang/String;)V
    .locals 2

    .line 489
    iget-object v1, p0, Ll/ۧ֨ۘ;->֨:Ljava/lang/String;

    sget-object v0, Ll/᩷᩹ۘ;->᩹:Ll/֡֨ۘ;

    .line 0
    const-class v0, Ll/᩷᩹ۘ;

    monitor-enter v0

    .line 175
    :try_start_0
    invoke-static {v1, p1}, Ll/᩷᩹ۘ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V
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

    const v0, -0x553f462d

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    sget v2, Ll/ۗ۬;->ۤᩴ᩻:I

    const-string v3, "\u06e7\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x244f

    const v5, -0x667b492d

    xor-int/2addr v4, v5

    const v5, 0x62aad1a6

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v3, :cond_7

    goto/16 :goto_3

    .line 217
    :sswitch_0
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_b

    goto/16 :goto_4

    :sswitch_1
    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v3, :cond_8

    goto/16 :goto_2

    .line 29
    :sswitch_2
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_5

    goto :goto_1

    .line 490
    :sswitch_3
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    :goto_1
    const-string v3, "\u06d8\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6dd5

    const v5, -0x1d3508cd

    xor-int/2addr v4, v5

    const v5, 0x66c878c3

    goto :goto_0

    .line 146
    :sswitch_4
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    return-void

    .line 494
    :sswitch_5
    iget-object v0, p0, Ll/ۧ֨ۘ;->֨:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Ll/᩷᩹ۘ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :sswitch_6
    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a79\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4211

    const v5, 0x5d5bd6ef

    xor-int/2addr v4, v5

    const v5, 0x3c937615    # 0.018000642f

    goto :goto_0

    .line 202
    :sswitch_7
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u05a8\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x48f7

    const v5, 0x1b568f3c

    xor-int/2addr v4, v5

    const v5, 0x6d087950

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u06d6\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x484b

    const v5, 0x78f85fcb

    xor-int/2addr v4, v5

    const v5, 0x589532db

    goto/16 :goto_0

    .line 458
    :sswitch_9
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    const-string v3, "\u06d6\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6bf1

    const v5, 0x1cf7f6e5

    xor-int/2addr v4, v5

    const v5, -0x2ca4de56

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v3

    if-gtz v3, :cond_4

    goto :goto_4

    :cond_4
    const-string v3, "\u06dc\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7fe7

    const v5, -0x49a91ca8

    xor-int/2addr v4, v5

    const v5, 0x72377943

    goto/16 :goto_0

    .line 258
    :sswitch_b
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u06d7\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1edf

    const v5, 0x5aa97d8e

    xor-int/2addr v4, v5

    const v5, -0x32109ca9    # -5.0203312E8f

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u0733\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5ca1

    const v5, 0x49f23e6e    # 1984461.8f

    xor-int/2addr v4, v5

    const v5, -0x573bf882

    goto/16 :goto_0

    :goto_3
    const-string v3, "\u06da\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x717

    const v5, 0x71cef376

    xor-int/2addr v4, v5

    const v5, -0x4b35d70f

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u073f\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x386f

    const v5, 0x5bea71b4

    xor-int/2addr v4, v5

    const v5, 0x4d1faa3b    # 1.6742085E8f

    goto/16 :goto_0

    .line 485
    :sswitch_c
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v3

    if-eqz v3, :cond_9

    :cond_8
    :goto_4
    const-string v3, "\u05a1\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4ffd

    const v5, 0x4b9271e8    # 1.9194832E7f

    xor-int/2addr v4, v5

    const v5, -0xcdb8f8

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d6\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x28b1

    const v5, 0x1dd9ab69

    xor-int/2addr v4, v5

    const v5, -0x79cbb638

    goto/16 :goto_0

    .line 413
    :sswitch_d
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u0730\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1d99

    const v5, -0x5df6b27b    # -1.8608E-18f

    xor-int/2addr v4, v5

    const v5, -0x6752f3f1

    goto/16 :goto_0

    .line 71
    :sswitch_e
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u1a76\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5645

    const v5, -0xb9658f

    xor-int/2addr v4, v5

    const v5, 0xb786cf1

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a74\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6561

    const v5, -0x400947dd

    xor-int/2addr v4, v5

    const v5, -0x679d2846

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d9bc095 -> :sswitch_6
        -0x6e02999c -> :sswitch_9
        -0x6438c423 -> :sswitch_5
        -0x59ef0662 -> :sswitch_3
        -0x5586bd98 -> :sswitch_1
        -0x4d006bfe -> :sswitch_b
        -0x4cb2cd07 -> :sswitch_4
        -0x4c8b275b -> :sswitch_d
        -0x485d8837 -> :sswitch_0
        -0x2ec3d509 -> :sswitch_4
        -0x2bd8392e -> :sswitch_2
        -0x28bc81f4 -> :sswitch_0
        -0x2400b7cd -> :sswitch_a
        -0x190573b8 -> :sswitch_3
        -0x12a8b54f -> :sswitch_c
        -0x835b749 -> :sswitch_5
        0x3d448be -> :sswitch_b
        0x9c6f4c6 -> :sswitch_a
        0x2cd22f4c -> :sswitch_e
        0x383cf2ed -> :sswitch_7
        0x461dfa3f -> :sswitch_6
        0x49bf3894 -> :sswitch_e
        0x4ca0012e -> :sswitch_d
        0x525ede15 -> :sswitch_1
        0x59229769 -> :sswitch_9
        0x5faee583 -> :sswitch_2
        0x680ee002 -> :sswitch_8
        0x6d8b82c1 -> :sswitch_c
        0x7259ef00 -> :sswitch_8
        0x7380dead -> :sswitch_7
    .end sparse-switch
.end method

.method public final log(Ljava/lang/Throwable;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x511a77a

    sget v2, Ll/֨ܶ;->ۛۛۛ:I

    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    const-string v4, "\u06df\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x788d

    const v6, -0x7969d4a8

    xor-int/2addr v5, v6

    const v6, 0x313e3ca1

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x510b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 423
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_6

    goto/16 :goto_3

    .line 215
    :sswitch_0
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_9

    goto/16 :goto_4

    :sswitch_1
    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-gez v4, :cond_b

    goto :goto_1

    .line 6
    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    if-lez v4, :cond_2

    goto/16 :goto_2

    .line 311
    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    return-void

    :sswitch_5
    const/4 v1, 0x0

    .line 163
    invoke-static {v0, v1, p1}, Ll/᩷᩹ۘ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 499
    :sswitch_6
    iget-object v0, p0, Ll/ۧ֨ۘ;->֨:Ljava/lang/String;

    .line 100
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v4

    if-gtz v4, :cond_0

    const-string v4, "\u06eb\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6a3f

    const v6, -0x2d72e1f6

    xor-int/2addr v5, v6

    const v6, 0x6aa2bb14

    goto :goto_0

    :cond_0
    const-string v4, "\u06e4\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4bc3

    const v6, 0xbbb2d1f

    xor-int/2addr v5, v6

    const v6, -0x7b9a31f0

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u06e7\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x4b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5ddd

    const v6, 0x7c0fc484

    xor-int/2addr v5, v6

    const v6, 0x4a53453d    # 3461455.2f

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    :goto_1
    const-string v4, "\u1a74\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5979

    const v6, 0x12d5640d

    xor-int/2addr v5, v6

    const v6, 0x6389ca

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06d8\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6c8b

    const v6, -0x6ef79ed3

    xor-int/2addr v5, v6

    const v6, -0x4074d207

    goto/16 :goto_0

    .line 325
    :sswitch_9
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06d8\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6c87

    const v6, 0x7b625634

    xor-int/2addr v5, v6

    const v6, 0x20fed066

    goto/16 :goto_0

    .line 222
    :sswitch_a
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_5

    :goto_2
    const-string v4, "\u0736\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2eb3

    const v6, -0x104c196d

    xor-int/2addr v5, v6

    const v6, -0x7b83e68

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u1a76\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4c03

    const v6, -0x3ed469ff

    xor-int/2addr v5, v6

    const v6, -0x65f659f7

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u0733\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x14c5

    const v6, -0x6cc35a81

    xor-int/2addr v5, v6

    const v6, 0x5fa3116d

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u1a76\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1dbb

    const v6, -0x6805b380

    xor-int/2addr v5, v6

    const v6, -0xc91976c

    goto/16 :goto_0

    .line 112
    :sswitch_c
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u1a7b\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7ffb

    const v6, -0x265f2f43

    xor-int/2addr v5, v6

    const v6, -0x1cf5b953

    goto/16 :goto_0

    .line 357
    :sswitch_d
    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u073a\u0730"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5e5d

    const v6, -0x420fcbd1

    xor-int/2addr v5, v6

    const v6, 0x2f43bc19

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u05ab\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2c33

    const v6, -0x38c433bf

    xor-int/2addr v5, v6

    const v6, -0x5f0d612

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06db\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x41ab

    const v6, -0x599cb529

    xor-int/2addr v5, v6

    const v6, -0x109303fa

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7a\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2141

    const v6, -0x4569f379

    xor-int/2addr v5, v6

    const v6, -0x71c44ad

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x775679fd -> :sswitch_b
        -0x75b6da82 -> :sswitch_c
        -0x63927812 -> :sswitch_3
        -0x5c4a99cc -> :sswitch_3
        -0x59f4d7c0 -> :sswitch_e
        -0x4f493224 -> :sswitch_6
        -0x4202ef8f -> :sswitch_9
        -0x403a91a9 -> :sswitch_7
        -0x1c89a6a2 -> :sswitch_b
        0xf6edf4d -> :sswitch_0
        0x19e1e6c8 -> :sswitch_1
        0x1ae4dc97 -> :sswitch_0
        0x1c5e20ad -> :sswitch_7
        0x22830e18 -> :sswitch_c
        0x25b33b5a -> :sswitch_e
        0x30396049 -> :sswitch_8
        0x39df3ee4 -> :sswitch_9
        0x4ac9a946 -> :sswitch_6
        0x4ce0d85b -> :sswitch_d
        0x50b8b132 -> :sswitch_8
        0x59bc5f3f -> :sswitch_4
        0x5b355767 -> :sswitch_d
        0x61776330 -> :sswitch_4
        0x61bff3a8 -> :sswitch_5
        0x61df9fdf -> :sswitch_2
        0x69ebea21 -> :sswitch_1
        0x6d63925e -> :sswitch_5
        0x78180688 -> :sswitch_a
        0x7b79eaf9 -> :sswitch_a
        0x7d30a0f0 -> :sswitch_2
    .end sparse-switch
.end method

.method public final openBrowser(Ljava/lang/String;)V
    .locals 6

    const v0, -0x58ac4078

    sget v1, Ll/֡ۚ;->ۢܰ᩸:I

    sget v2, Ll/ۖۗ;->᩶۫ۗ:I

    const-string v3, "\u0733\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x11cf

    const v5, -0x40383e8f

    xor-int/2addr v4, v5

    const v5, 0x4d379d7f    # 1.9253451E8f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x5173

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 183
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_3

    .line 129
    :sswitch_0
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v3, :cond_b

    goto/16 :goto_3

    :sswitch_1
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-nez v3, :cond_5

    goto/16 :goto_3

    .line 97
    :sswitch_2
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    goto/16 :goto_3

    .line 267
    :sswitch_3
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    return-void

    .line 344
    :sswitch_4
    new-instance v3, Ll/ۜܺۘ;

    .line 122
    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    .line 344
    invoke-direct {v3, p0, p1, v0}, Ll/ۜܺۘ;-><init>(Ljava/lang/Object;Ljava/io/Serializable;I)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 230
    :sswitch_5
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_1

    :goto_1
    const-string v3, "\u06e2\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x69f1

    const v5, 0x569a696b

    xor-int/2addr v4, v5

    const v5, 0x7cb626f7

    goto :goto_0

    :cond_1
    const-string v3, "\u06d6\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7985

    const v5, 0x50b833ef

    xor-int/2addr v4, v5

    const v5, 0x48002b25

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u05a8\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x61f7

    const v5, -0x61c42668

    xor-int/2addr v4, v5

    const v5, 0x31019afb

    goto :goto_0

    .line 292
    :sswitch_7
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a77\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1c75

    const v5, 0x2ce5245f

    xor-int/2addr v4, v5

    const v5, 0x2af170d7

    goto/16 :goto_0

    .line 174
    :sswitch_8
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u073d\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2823

    const v5, 0x34d4f03d

    xor-int/2addr v4, v5

    const v5, -0x2b969ac4

    goto/16 :goto_0

    .line 285
    :sswitch_9
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_6

    :cond_5
    const-string v3, "\u1a7b\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xa23

    const v5, 0x12392c34

    xor-int/2addr v4, v5

    const v5, 0x1391ff58

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e7\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7eb7

    const v5, -0x598de116

    xor-int/2addr v4, v5

    const v5, -0x3185847a

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v3

    if-ltz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u1a7a\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x398d

    const v5, 0x6a2c6c79

    xor-int/2addr v4, v5

    const v5, 0x4a288b5e    # 2761431.5f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u073f\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4b29

    const v5, 0x377d0907

    xor-int/2addr v4, v5

    const v5, -0x647028e

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u1a7b\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x69a9

    const v5, -0x577fb955

    xor-int/2addr v4, v5

    const v5, -0x20cb9c77

    goto/16 :goto_0

    .line 205
    :sswitch_c
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_a

    :goto_3
    const-string v3, "\u1a74\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3955

    const v5, 0x3b9d5db3

    xor-int/2addr v4, v5

    const v5, -0x7eeb3032

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a75\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x825

    const v5, 0x7218d1c5

    xor-int/2addr v4, v5

    const v5, -0x198806e8

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06d7\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x283f

    const v5, 0x7bbef645

    xor-int/2addr v4, v5

    const v5, 0x272fcc63

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073d\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1031

    const v5, 0x56df77e2

    xor-int/2addr v4, v5

    const v5, 0x25f64a73

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x779c6be9 -> :sswitch_4
        -0x766a39b3 -> :sswitch_d
        -0x6d2b0561 -> :sswitch_5
        -0x5b527be0 -> :sswitch_7
        -0x5618a081 -> :sswitch_3
        -0x22b7c063 -> :sswitch_4
        -0x209cd3c7 -> :sswitch_0
        -0x1ebf3186 -> :sswitch_3
        -0x6bbf78a -> :sswitch_7
        0x708445d -> :sswitch_6
        0x19e801aa -> :sswitch_9
        0x23b80ec3 -> :sswitch_0
        0x31b15f9a -> :sswitch_5
        0x3741f6d1 -> :sswitch_6
        0x3b8d155d -> :sswitch_c
        0x3cb572c3 -> :sswitch_8
        0x4421d6a5 -> :sswitch_b
        0x4b772a7d -> :sswitch_a
        0x5062a159 -> :sswitch_d
        0x5385562c -> :sswitch_1
        0x54c64ed5 -> :sswitch_2
        0x61db8806 -> :sswitch_b
        0x62be67e2 -> :sswitch_9
        0x6357ce53 -> :sswitch_1
        0x6daf7101 -> :sswitch_8
        0x6e2ca8ce -> :sswitch_c
        0x6eced248 -> :sswitch_a
        0x7336c168 -> :sswitch_2
    .end sparse-switch
.end method

.method public final openBuiltinBrowser(Ljava/lang/String;Z)V
    .locals 6

    const v0, -0x47712c77

    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    sget v2, Ll/ۧ;->֫۠ᩴ:I

    const-string v3, "\u1a79\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x787b

    const v5, -0x4e05a1f

    xor-int/2addr v4, v5

    const v5, 0x614c7e7c

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x726d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    return-void

    :sswitch_0
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    .line 238
    :sswitch_1
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v3, :cond_a

    goto/16 :goto_2

    :sswitch_2
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v3, :cond_8

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    goto :goto_1

    .line 359
    :sswitch_4
    new-instance v0, Ll/۫֨ۘ;

    invoke-direct {v0, p0, p1, p2}, Ll/۫֨ۘ;-><init>(Ll/ۧ֨ۘ;Ljava/lang/String;Z)V

    invoke-static {v0}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :sswitch_5
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u1a76\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x89d

    const v5, -0x497be287

    xor-int/2addr v4, v5

    const v5, -0x50a1c44b

    goto :goto_0

    .line 47
    :sswitch_6
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_2

    :cond_1
    const-string v3, "\u0736\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1e33

    const v5, 0x4c537a10    # 5.5437376E7f

    xor-int/2addr v4, v5

    const v5, 0x465fbc3a

    goto :goto_0

    :cond_2
    const-string v3, "\u06d7\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x78ed

    const v5, 0xe50d103

    xor-int/2addr v4, v5

    const v5, 0xf5986d0

    goto :goto_0

    .line 310
    :sswitch_7
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a76\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2c67

    const v5, -0x79c5df3b

    xor-int/2addr v4, v5

    const v5, -0x36f0fde6

    goto/16 :goto_0

    .line 211
    :sswitch_8
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_4

    :goto_1
    const-string v3, "\u06db\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x9d1

    const v5, 0x208e5373

    xor-int/2addr v4, v5

    const v5, -0x27cb6c1f

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e8\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2995

    const v5, -0x63e29e56

    xor-int/2addr v4, v5

    const v5, -0x52f7e8b8

    goto/16 :goto_0

    .line 328
    :sswitch_9
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06db\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x381d

    const v5, -0x361bc55f

    xor-int/2addr v4, v5

    const v5, -0x11ff8617

    goto/16 :goto_0

    .line 40
    :sswitch_a
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u0730\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4585

    const v5, -0x916e69d

    xor-int/2addr v4, v5

    const v5, -0x4fb27e5c

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06df\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3203

    const v5, -0x552302fe

    xor-int/2addr v4, v5

    const v5, 0x93c188c

    goto/16 :goto_0

    .line 346
    :sswitch_c
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u06d7\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2af

    const v5, 0x76ebef58

    xor-int/2addr v4, v5

    const v5, 0x34492025

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e8\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2747

    const v5, -0xda5abd1

    xor-int/2addr v4, v5

    const v5, 0x68fb0e92

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06e2\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2d97

    const v5, 0x22e42e11

    xor-int/2addr v4, v5

    const v5, 0xfe95148

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06df\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4ce1

    const v5, -0x1b4023d

    xor-int/2addr v4, v5

    const v5, -0xd74ff20

    goto/16 :goto_0

    .line 34
    :sswitch_e
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u06da\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2fe5

    const v5, -0x44fb90a1

    xor-int/2addr v4, v5

    const v5, 0x3f1fce96

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05a8\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2e01

    const v5, 0x513694da

    xor-int/2addr v4, v5

    const v5, -0x404f679c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fe423d9 -> :sswitch_0
        -0x7cb74750 -> :sswitch_4
        -0x7b52324a -> :sswitch_3
        -0x7041a715 -> :sswitch_e
        -0x6fb569f4 -> :sswitch_2
        -0x6ce0aa1a -> :sswitch_e
        -0x6ad41b4b -> :sswitch_a
        -0x45167c8a -> :sswitch_5
        -0x3668bf6c -> :sswitch_1
        -0x232dd64d -> :sswitch_a
        -0x1e58ee50 -> :sswitch_3
        -0x1aa593a6 -> :sswitch_2
        -0x16034c94 -> :sswitch_1
        -0x13229d03 -> :sswitch_b
        -0x10d52d3b -> :sswitch_6
        -0xe75792c -> :sswitch_d
        -0x80f754e -> :sswitch_8
        0x32b51a5 -> :sswitch_0
        0x874e919 -> :sswitch_b
        0xa1a08bc -> :sswitch_5
        0xfbf5b81 -> :sswitch_9
        0x1059fc5e -> :sswitch_4
        0x1f2988ea -> :sswitch_9
        0x1f62b1b3 -> :sswitch_c
        0x31f62dbd -> :sswitch_7
        0x6141d12b -> :sswitch_d
        0x72ec8863 -> :sswitch_8
        0x7374586b -> :sswitch_c
        0x7608b0b2 -> :sswitch_6
        0x78e6216a -> :sswitch_7
    .end sparse-switch
.end method

.method public final openLogViewer()V
    .locals 6

    const v0, -0xd8414ec

    sget v1, Ll/ۖۗ;->᩶۫ۗ:I

    sget v2, Ll/֨ܰ;->ۢ᩷۟:I

    const-string v3, "\u1a79\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7919

    const v5, -0x1d01a256

    xor-int/2addr v4, v5

    const v5, 0x668fe9b7

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x6283

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 397
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_3

    goto :goto_1

    .line 359
    :sswitch_0
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_6

    goto :goto_1

    :sswitch_1
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-gez v3, :cond_a

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    return-void

    .line 508
    :sswitch_4
    new-instance v3, Ll/᩺ܺۘ;

    .line 363
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_1

    goto :goto_2

    .line 473
    :cond_1
    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v4, :cond_2

    :goto_1
    const-string v3, "\u06e0\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2c15

    const v5, 0x694f623a

    xor-int/2addr v4, v5

    const v5, 0x1a14fdad

    goto :goto_0

    :cond_2
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v4

    if-ltz v4, :cond_4

    :cond_3
    const-string v3, "\u1a78\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x427b

    const v5, 0xcfa846a

    xor-int/2addr v4, v5

    const v5, 0x1478677e

    goto :goto_0

    :cond_4
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_5

    goto :goto_3

    .line 119
    :cond_5
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u05ab\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x19a9

    const v5, -0x232abdcb

    xor-int/2addr v4, v5

    const v5, 0x36f7e76

    goto/16 :goto_0

    :cond_7
    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_8

    goto :goto_3

    :cond_8
    sget-boolean v4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v4, :cond_9

    goto :goto_3

    .line 235
    :cond_9
    sget-boolean v4, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v4, :cond_b

    :cond_a
    const-string v3, "\u06e8\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x59f5

    const v5, -0x31cb0736    # -7.590509E8f

    xor-int/2addr v4, v5

    const v5, 0x2eee6d34

    goto/16 :goto_0

    :cond_b
    const/4 v4, 0x1

    .line 342
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v5

    if-gtz v5, :cond_c

    :goto_3
    const-string v3, "\u0733\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2f23

    const v5, -0x1fd663aa

    xor-int/2addr v4, v5

    const v5, -0x30603874

    goto/16 :goto_0

    .line 508
    :cond_c
    iget-object v0, p0, Ll/ۧ֨ۘ;->֨:Ljava/lang/String;

    invoke-direct {v3, v0, v4}, Ll/᩺ܺۘ;-><init>(Ljava/lang/String;I)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x763e46a0 -> :sswitch_1
        -0x6b4cb6e2 -> :sswitch_4
        -0x2aae57b7 -> :sswitch_2
        -0x20c1fd02 -> :sswitch_0
        0x193f8e02 -> :sswitch_4
        0x2bd75857 -> :sswitch_1
        0x2e3736d0 -> :sswitch_3
        0x4a1fe077 -> :sswitch_2
        0x59665609 -> :sswitch_0
        0x7fbedcc0 -> :sswitch_3
    .end sparse-switch
.end method

.method public final openPreference(Ljava/lang/Class;)V
    .locals 6

    const v0, -0x1cdfe96e

    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    sget v2, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v3, "\u06e0\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x469

    const v5, -0x640967a4

    xor-int/2addr v4, v5

    const v5, -0x143e9a32

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x797f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_c

    goto/16 :goto_4

    .line 294
    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_9

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06d9\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x31c9

    const v5, -0x6b812b4c

    xor-int/2addr v4, v5

    const v5, 0x2f2130a5

    goto :goto_0

    .line 51
    :sswitch_2
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_6

    goto :goto_1

    .line 170
    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    goto :goto_1

    .line 255
    :sswitch_4
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    return-void

    .line 325
    :sswitch_5
    new-instance v3, Ll/᩺ܺ᩺;

    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const/4 v0, 0x1

    invoke-direct {v3, v0, p0, p1}, Ll/᩺ܺ᩺;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 251
    :sswitch_6
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06df\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x28cf

    const v5, 0x1796e72a

    xor-int/2addr v4, v5

    const v5, -0x5c9dde85

    goto :goto_0

    .line 176
    :sswitch_7
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u073d\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4d3f

    const v5, -0x7c8f0f06

    xor-int/2addr v4, v5

    const v5, -0x34678545    # -1.9985782E7f

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v3, :cond_4

    :goto_1
    const-string v3, "\u073a\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2395

    const v5, 0x25923df0

    xor-int/2addr v4, v5

    const v5, -0x6cc22b05

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a7b\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x11b

    const v5, -0x3544d308    # -6133372.0f

    xor-int/2addr v4, v5

    const v5, 0x3b5de44b

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06eb\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3d3

    const v5, -0xb228def

    xor-int/2addr v4, v5

    const v5, -0x4493f13a

    goto/16 :goto_0

    .line 51
    :sswitch_a
    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06da\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x650f

    const v5, 0x75af6dd5

    xor-int/2addr v4, v5

    const v5, 0x3e5159de

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06dc\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1e73

    const v5, -0xce6d230

    xor-int/2addr v4, v5

    const v5, 0x5630a293

    goto/16 :goto_0

    .line 167
    :sswitch_b
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u1a74\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x74d5

    const v5, -0x807f8f9

    xor-int/2addr v4, v5

    const v5, 0x7884516f

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06e1\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x150d

    const v5, -0x3ec27f15

    xor-int/2addr v4, v5

    const v5, -0x31e0ed94    # -6.6719616E8f

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06eb\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x52cf

    const v5, -0x213e8d8f

    xor-int/2addr v4, v5

    const v5, 0x10541d07

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u0736\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x15bb

    const v5, 0x72b72dd1

    xor-int/2addr v4, v5

    const v5, 0x76553ff4

    goto/16 :goto_0

    :goto_4
    const-string v3, "\u1a75\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1d4f

    const v5, -0x77c20af0

    xor-int/2addr v4, v5

    const v5, 0x7281c3c6

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d9\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1c87

    const v5, -0x3ee337dc

    xor-int/2addr v4, v5

    const v5, 0x7a32e7bb

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ef6989b -> :sswitch_4
        -0x7597e85a -> :sswitch_9
        -0x5c0a2f04 -> :sswitch_c
        -0x5b8d1711 -> :sswitch_2
        -0x47d7f820 -> :sswitch_4
        -0x42689c42 -> :sswitch_8
        -0x40ae29d7 -> :sswitch_5
        -0x36faa39a -> :sswitch_3
        -0x288ff4dc -> :sswitch_c
        -0x26c73629 -> :sswitch_b
        -0x26431cf5 -> :sswitch_9
        -0x1f7257f3 -> :sswitch_6
        -0x140e4186 -> :sswitch_3
        -0x11012972 -> :sswitch_7
        -0x10c96ad0 -> :sswitch_8
        -0xe05f284 -> :sswitch_5
        0x2b9b8a -> :sswitch_1
        0x2202bc3 -> :sswitch_6
        0x87552eb -> :sswitch_2
        0xdcddd1c -> :sswitch_0
        0x1bbfc735 -> :sswitch_1
        0x1f5721fd -> :sswitch_0
        0x33ca481a -> :sswitch_a
        0x4883ff6e -> :sswitch_7
        0x512709c0 -> :sswitch_d
        0x53925e61 -> :sswitch_a
        0x58f4d39d -> :sswitch_d
        0x79887eb4 -> :sswitch_b
    .end sparse-switch
.end method

.method public final setClipboardText(Ljava/lang/CharSequence;)Z
    .locals 20

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

    const v13, 0x266a2345

    sget v14, Ll/֡֡;->᩶ۤ۠:I

    sget v15, Ll/֨ܶ;->ۛۛۛ:I

    const-string v16, "\u06da\u05a8"

    invoke-static/range {v16 .. v16}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    xor-int v0, v16, v15

    mul-int/lit16 v0, v0, -0x54f7

    const v18, 0x448fdce4

    xor-int v0, v0, v18

    const v18, 0x54e86f4

    xor-int v16, v16, v18

    const/16 v17, 0x0

    :goto_0
    xor-int/2addr v13, v15

    mul-int/lit16 v13, v13, 0xa07

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v0, v13

    xor-int v13, v16, v0

    sparse-switch v13, :sswitch_data_0

    move-object/from16 v18, v10

    move/from16 v16, v13

    const v8, 0x11937990

    sget v0, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v0, :cond_9

    goto/16 :goto_9

    .line 103
    :sswitch_0
    sget-boolean v0, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v0, :cond_0

    move/from16 v16, v13

    goto/16 :goto_3

    :cond_0
    const-string v0, "\u05ab\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x9

    move/from16 v16, v13

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, 0x347b

    const v18, 0x13d09504

    xor-int v13, v13, v18

    const v18, -0x39766f69

    goto/16 :goto_5

    :sswitch_1
    move/from16 v16, v13

    .line 100
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget-boolean v0, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-nez v0, :cond_4

    :goto_1
    move-object/from16 v18, v10

    goto/16 :goto_7

    :sswitch_2
    move/from16 v16, v13

    .line 6
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v18, v10

    goto/16 :goto_8

    :sswitch_3
    move/from16 v16, v13

    .line 85
    sget v0, Ll/ۗᩳ;->ۚۤ֡:I

    if-gez v0, :cond_2

    goto/16 :goto_4

    :cond_2
    move-object/from16 v18, v10

    goto/16 :goto_9

    :sswitch_4
    move/from16 v16, v13

    .line 301
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :sswitch_5
    move/from16 v16, v13

    .line 327
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    goto :goto_1

    .line 172
    :sswitch_6
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    :goto_2
    const/4 v0, 0x0

    return v0

    :sswitch_7
    const/4 v0, 0x1

    return v0

    :sswitch_8
    const v0, 0x7e776e09

    xor-int v0, v17, v0

    .line 419
    invoke-static {v0}, Ll/֫۟;->ܿ᩹᩷(I)Ll/ܺۡۜ;

    goto :goto_2

    :sswitch_9
    move/from16 v16, v13

    .line 415
    invoke-static {v10, v11, v12, v9}, Ll/֡ܽ;->ۗܺۛ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v17

    sget v0, Ll/֨ۧ;->֫۠֡:I

    if-gtz v0, :cond_3

    goto :goto_3

    :cond_3
    const-string v0, "\u06da\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, 0x2651

    const v18, 0x73140aa

    xor-int v13, v13, v18

    const v18, -0x3412a9b6    # -3.1108244E7f

    goto :goto_5

    :sswitch_a
    move/from16 v16, v13

    const/4 v12, 0x3

    sget v0, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v0, :cond_5

    :cond_4
    :goto_3
    const-string v0, "\u05ab\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x25

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, -0x2871

    const v18, 0x318f0b07

    xor-int v13, v13, v18

    const v18, -0x450e04ab

    goto :goto_5

    :cond_5
    const-string v0, "\u0736\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, -0x141f

    const v18, 0x75daeeb8

    xor-int v13, v13, v18

    const v18, -0x3f5333ec    # -5.399912f

    goto :goto_5

    :sswitch_b
    move/from16 v16, v13

    sget-object v10, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    const/16 v11, 0x64

    sget v0, Ll/֨ۧ;->֫۠֡:I

    if-gtz v0, :cond_7

    :cond_6
    :goto_4
    const-string v0, "\u06ec\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x39

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, -0x69c7

    const v18, 0x48e66e45

    xor-int v13, v13, v18

    const v18, -0x630d1358

    goto :goto_5

    :cond_7
    const-string v0, "\u1a76\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x2f

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, 0x6d2d

    const v18, -0x6e62caa2

    xor-int v13, v13, v18

    const v18, 0x45580532

    :goto_5
    xor-int v0, v0, v18

    move/from16 v19, v16

    move/from16 v16, v0

    move v0, v13

    move/from16 v13, v19

    goto/16 :goto_0

    :sswitch_c
    move/from16 v16, v13

    .line 414
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/ۧ֨ۘ;->ۙ()Landroid/content/ClipboardManager;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v13, 0x0

    move-object/from16 v18, v10

    move-object/from16 v10, p1

    :try_start_1
    invoke-static {v13, v10}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v13

    invoke-virtual {v0, v13}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    sget-object v0, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    const/16 v13, 0x67

    const/4 v10, 0x3

    invoke-static {v0, v13, v10, v9}, Ll/ۖᩴ;->֨᩶᩵([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    const v10, 0x7ec51cdd

    xor-int/2addr v0, v10

    .line 415
    invoke-static {v0}, Ll/֫۟;->ܿ᩹᩷(I)Ll/ܺۡۜ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v0, "\u06e8\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v10, v0, v15

    mul-int/lit16 v10, v10, -0x1729

    const v13, 0x4a880d5

    xor-int/2addr v10, v13

    const v13, -0x4c9c1b31

    goto/16 :goto_a

    :catchall_0
    move-object/from16 v18, v10

    :catchall_1
    const-string v0, "\u06e4\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v10, v0, v14

    mul-int/lit16 v10, v10, 0x34bd

    const v13, 0xbf83ac5

    xor-int/2addr v10, v13

    const v13, -0x13d5bc50

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v18, v10

    move/from16 v16, v13

    const/16 v0, 0x2515

    const/16 v9, 0x2515

    goto :goto_6

    :sswitch_e
    move-object/from16 v18, v10

    move/from16 v16, v13

    const v0, 0x8315

    const v9, 0x8315

    :goto_6
    const-string v0, "\u06e7\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x7d

    xor-int v10, v0, v14

    mul-int/lit16 v10, v10, -0x3785

    const v13, 0x50df2be1

    xor-int/2addr v10, v13

    const v13, 0x46d807b8

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v18, v10

    move/from16 v16, v13

    add-int v0, v7, v8

    add-int/2addr v0, v0

    sub-int v0, v6, v0

    if-lez v0, :cond_8

    const-string v0, "\u1a79\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x15

    xor-int v10, v0, v15

    mul-int/lit16 v10, v10, 0x2505

    const v13, -0x38b9bf51

    xor-int/2addr v10, v13

    const v13, 0x473bceaa

    goto/16 :goto_a

    :cond_8
    const-string v0, "\u0730\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x65

    xor-int v10, v0, v14

    mul-int/lit16 v10, v10, 0xe93

    const v13, -0x50825210

    xor-int/2addr v10, v13

    const v13, 0x41ef4542

    goto/16 :goto_a

    :cond_9
    const-string v0, "\u06e2\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x5d

    xor-int v10, v0, v15

    mul-int/lit16 v10, v10, -0x7731

    const v13, -0x5f629062

    xor-int/2addr v10, v13

    const v13, 0x5fb0e106

    goto/16 :goto_a

    :sswitch_10
    move-object/from16 v18, v10

    move/from16 v16, v13

    mul-int v6, v5, v5

    mul-int v7, v3, v3

    .line 49
    sget v0, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v0, :cond_a

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u06d7\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x63

    xor-int v10, v0, v14

    mul-int/lit16 v10, v10, 0x727b

    const v13, 0x3e7818c0

    xor-int/2addr v10, v13

    const v13, 0x3825e43f

    goto/16 :goto_a

    :sswitch_11
    move-object/from16 v18, v10

    move/from16 v16, v13

    add-int v5, v3, v4

    .line 398
    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_b

    const-string v0, "\u06df\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x29

    xor-int v10, v0, v14

    mul-int/lit16 v10, v10, -0x157f

    const v13, -0x8a964c8

    xor-int/2addr v10, v13

    const v13, -0x7b2ae919

    goto/16 :goto_a

    :cond_b
    const-string v0, "\u06eb\u06e0"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x41

    xor-int v10, v0, v15

    mul-int/lit16 v10, v10, -0x3a0d

    const v13, 0x65494602

    xor-int/2addr v10, v13

    const v13, -0x1f74d9ba

    goto/16 :goto_a

    :sswitch_12
    move-object/from16 v18, v10

    move/from16 v16, v13

    aget-short v3, v1, v2

    const/16 v4, 0x4314

    .line 244
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v0

    if-eqz v0, :cond_c

    :goto_7
    const-string v0, "\u06d7\u06d7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x27

    xor-int v10, v0, v14

    mul-int/lit16 v10, v10, 0x6ecd

    const v13, 0x19e9a9c8

    xor-int/2addr v10, v13

    const v13, 0x339df975

    goto/16 :goto_a

    :cond_c
    const-string v0, "\u073a\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v10, v0, v14

    mul-int/lit16 v10, v10, 0x3665

    const v13, -0x5f760b07

    xor-int/2addr v10, v13

    const v13, -0x117560dd

    goto/16 :goto_a

    :sswitch_13
    move-object/from16 v18, v10

    move/from16 v16, v13

    const/16 v2, 0x63

    sget v0, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v0, :cond_d

    goto :goto_9

    :cond_d
    const-string v0, "\u06e1\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x6b

    xor-int v10, v0, v15

    mul-int/lit16 v10, v10, 0x6c45

    const v13, 0x748afe3c

    xor-int/2addr v10, v13

    const v13, 0x262fc039

    goto :goto_a

    :sswitch_14
    move-object/from16 v18, v10

    move/from16 v16, v13

    sget-object v1, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v0

    if-nez v0, :cond_e

    :goto_8
    const-string v0, "\u06e1\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x79

    xor-int v10, v0, v14

    mul-int/lit16 v10, v10, 0x3983

    const v13, -0x45f992cb

    xor-int/2addr v10, v13

    const v13, -0xe2e181b

    goto :goto_a

    :cond_e
    const-string v0, "\u06e1\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x31

    xor-int v10, v0, v14

    mul-int/lit16 v10, v10, 0xf27

    const v13, -0x24c7a9c4

    xor-int/2addr v10, v13

    const v13, -0x3d086f28

    goto :goto_a

    :sswitch_15
    move-object/from16 v18, v10

    move/from16 v16, v13

    .line 313
    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_f

    :goto_9
    const-string v0, "\u073d\u06d7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0xd

    xor-int v10, v0, v14

    mul-int/lit16 v10, v10, -0x1b47

    const v13, 0x24720ab6

    xor-int/2addr v10, v13

    const v13, -0x28cdc61e

    goto :goto_a

    :cond_f
    const-string v0, "\u06d9\u05ab"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x59

    xor-int v10, v0, v15

    mul-int/lit16 v10, v10, -0x5109

    const v13, 0x4d63f780    # 2.3904051E8f

    xor-int/2addr v10, v13

    const v13, 0x57c61a

    :goto_a
    xor-int/2addr v0, v13

    move/from16 v13, v16

    move/from16 v16, v0

    move v0, v10

    move-object/from16 v10, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f90b82d -> :sswitch_0
        -0x7ad47cd3 -> :sswitch_14
        -0x7838eb12 -> :sswitch_8
        -0x71404e6b -> :sswitch_a
        -0x6b47c597 -> :sswitch_c
        -0x6983b06d -> :sswitch_5
        -0x64b98f69 -> :sswitch_4
        -0x640a6a32 -> :sswitch_6
        -0x6393daad -> :sswitch_b
        -0x61332095 -> :sswitch_11
        -0x5d4ab114 -> :sswitch_5
        -0x4f156fb0 -> :sswitch_9
        -0x46eea85d -> :sswitch_2
        -0x46cde417 -> :sswitch_a
        -0x40bba934 -> :sswitch_13
        -0x34696e9f -> :sswitch_8
        -0x1f1075dc -> :sswitch_3
        -0x15ac85d1 -> :sswitch_9
        -0x117ee8af -> :sswitch_13
        -0xd61261b -> :sswitch_11
        -0x2ca5abf -> :sswitch_15
        -0xb6725f -> :sswitch_7
        0x1d18667 -> :sswitch_f
        0xb86f988 -> :sswitch_f
        0xc7b2a77 -> :sswitch_12
        0xdad5773 -> :sswitch_e
        0x16fd9877 -> :sswitch_3
        0x297a4ce2 -> :sswitch_6
        0x41c67ad0 -> :sswitch_d
        0x47000244 -> :sswitch_2
        0x4780b4a0 -> :sswitch_1
        0x4964c519 -> :sswitch_15
        0x49ec39b4 -> :sswitch_10
        0x517d3f15 -> :sswitch_e
        0x57d05c96 -> :sswitch_b
        0x5a802e47 -> :sswitch_4
        0x688b66bc -> :sswitch_0
        0x6b0c4433 -> :sswitch_1
        0x707591bd -> :sswitch_7
        0x751918af -> :sswitch_10
        0x7802ecc2 -> :sswitch_d
        0x78149270 -> :sswitch_12
        0x7d96e58e -> :sswitch_c
        0x7e745667 -> :sswitch_14
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

    const v19, -0x499721c

    sget v20, Ll/ۖ᩸;->ۨܽ۬:I

    sget v21, Ll/֡᩶;->ۗ֨ܺ:I

    const-string v22, "\u05a8\u1a75"

    invoke-static/range {v22 .. v22}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v21

    xor-int v1, v22, v20

    mul-int/lit16 v1, v1, 0x6917

    const v24, 0x3dc185b2

    xor-int v1, v1, v24

    const v24, -0x5396af94

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

    const v22, -0x499721c

    const/16 v24, 0x0

    move-object/from16 v16, v10

    move-object v10, v9

    move-object v9, v8

    const/4 v8, 0x0

    :goto_0
    xor-int v15, v22, v20

    mul-int/lit16 v15, v15, 0x6b8f

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v22, v23, v1

    sparse-switch v22, :sswitch_data_0

    .line 430
    :try_start_0
    invoke-static {v6}, Ll/֫ۛ;->ۖۛۖ(Ljava/lang/Object;)Ll/ܺۡۜ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_7

    .line 269
    :sswitch_0
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez v1, :cond_1

    :cond_0
    move-object/from16 v0, p1

    goto/16 :goto_e

    :cond_1
    const-string v1, "\u0733\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x6ae7

    const v23, -0x1257613d

    xor-int v15, v15, v23

    const v23, 0x162fdff1

    goto/16 :goto_8

    .line 27
    :sswitch_1
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    sget-boolean v1, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    :goto_1
    move-object/from16 v0, p1

    goto/16 :goto_c

    :sswitch_2
    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    if-lez v1, :cond_0

    :cond_3
    :goto_2
    move-object/from16 v0, p1

    goto/16 :goto_f

    .line 200
    :sswitch_3
    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_5

    :cond_4
    move-object/from16 v0, p1

    goto/16 :goto_d

    :cond_5
    const-string v1, "\u05a1\u1a79"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x6b

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x7553

    const v23, 0x3c6a8c81

    xor-int v15, v15, v23

    const v23, -0x5dfe8f84

    goto/16 :goto_8

    :sswitch_4
    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v1, :cond_6

    goto :goto_2

    :cond_6
    :goto_3
    const-string v1, "\u06e1\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x6adf

    const v23, -0x272dc847

    xor-int v15, v15, v23

    const v23, 0x7e96891

    goto/16 :goto_8

    .line 195
    :sswitch_5
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    if-lez v1, :cond_3

    :cond_7
    :goto_4
    move-object/from16 v0, p1

    goto/16 :goto_a

    :sswitch_6
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget v1, Ll/֫۟;->᩸ᩴܿ:I

    if-gez v1, :cond_4

    goto :goto_4

    :sswitch_7
    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_7

    :goto_5
    move-object/from16 v0, p1

    goto/16 :goto_b

    .line 395
    :sswitch_8
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    goto :goto_5

    :sswitch_9
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    const/4 v0, 0x0

    return v0

    :sswitch_a
    if-eqz v9, :cond_8

    move-object v6, v9

    goto/16 :goto_6

    :sswitch_b
    move-object/from16 v1, p0

    .line 183
    :try_start_1
    invoke-static {v1, v0}, Ll/ۗ;->֡ۚۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v15, "\u06d6\u06dc"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    add-int v15, v15, v20

    mul-int/lit8 v15, v15, 0x5

    xor-int v1, v15, v21

    mul-int/lit16 v1, v1, -0x47f9

    const v23, -0x2c4de3ef

    xor-int v1, v1, v23

    const v23, 0x1cb305f2

    xor-int v23, v15, v23

    goto/16 :goto_0

    :sswitch_c
    const/16 v1, 0x7d

    if-ne v8, v1, :cond_8

    const-string v1, "\u1a75\u06d8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x77

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x20cd

    const v23, 0x20894768

    xor-int v15, v15, v23

    const v23, -0x103fabe5

    goto/16 :goto_8

    .line 182
    :sswitch_d
    :try_start_2
    invoke-static/range {p2 .. p2}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v1

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ll/ۗ;->᩶᩺ܶ(Ljava/lang/Object;I)C

    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v1, "\u1a77\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x25

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x5ead

    const v23, 0x55c3158e

    xor-int v15, v15, v23

    const v23, 0x47be91f7

    goto/16 :goto_8

    :sswitch_e
    const/16 v1, 0x7b

    if-ne v7, v1, :cond_8

    const-string v1, "\u06e0\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x769f

    const v23, -0x2f09ed7e

    xor-int v15, v15, v23

    const v23, -0x7e63ec73

    goto/16 :goto_8

    :sswitch_f
    :try_start_3
    invoke-static {v0, v2}, Ll/ۗ;->᩶᩺ܶ(Ljava/lang/Object;I)C

    move-result v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v1, "\u05ab\u1a79"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x3d09

    const v23, -0x305854c6

    xor-int v15, v15, v23

    const v23, -0x4d34d063

    goto/16 :goto_8

    :sswitch_10
    const/4 v1, 0x3

    if-lt v5, v1, :cond_8

    const-string v1, "\u06dc\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x10d9

    const v23, 0x35f3ccc2

    xor-int v15, v15, v23

    const v23, 0x32328532

    goto/16 :goto_8

    :cond_8
    move-object v6, v0

    :goto_6
    const-string v1, "\u05a1\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x6a51

    const v23, -0x55c4ff19

    xor-int v15, v15, v23

    const v23, -0x573d96c

    goto/16 :goto_8

    :sswitch_11
    :try_start_4
    invoke-static/range {p2 .. p2}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v1, "\u1a73\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x5b

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x6569

    const v23, 0x64ab8bb3

    xor-int v15, v15, v23

    const v23, -0x15f13da3

    goto/16 :goto_8

    :sswitch_12
    if-nez v4, :cond_9

    const-string v1, "\u0733\u06eb"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0x45

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x6eff

    const v23, -0x2ae9ac5c

    xor-int v15, v15, v23

    const v23, 0x66c44799

    goto/16 :goto_8

    .line 428
    :sswitch_13
    :try_start_5
    invoke-static/range {p2 .. p2}, Ll/ۘۗ;->۬۫ܿ(Ljava/lang/Object;)Z

    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v1, "\u06d8\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, -0x9

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x45f3

    const v23, -0x411aa922

    xor-int v15, v15, v23

    const v23, 0x6152d875

    goto/16 :goto_8

    :sswitch_14
    return v3

    :sswitch_15
    const/4 v3, 0x1

    if-eqz v0, :cond_9

    const-string v1, "\u1a79\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x2d

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x3bc5

    const v23, -0x9d47132

    xor-int v15, v15, v23

    const v23, -0x5d1bbe24

    goto :goto_8

    :cond_9
    :goto_7
    const-string v1, "\u1a77\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x29

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x7e45

    const v23, 0x3acd1743

    xor-int v15, v15, v23

    const v23, 0x3611f8b7

    goto :goto_8

    .line 430
    :sswitch_16
    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7eeb1da6

    xor-int/2addr v0, v1

    .line 435
    invoke-static {v0}, Ll/֨ܶ;->ۚۛۢ(I)Ll/ܺۡۜ;

    return v2

    .line 430
    :sswitch_17
    invoke-static {v13, v14, v12, v11}, Ll/ۘۛ;->᩷ۧ᩹([SIII)Ljava/lang/String;

    move-result-object v10

    .line 337
    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_a

    goto/16 :goto_1

    :cond_a
    const-string v1, "\u06d7\u1a73"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x369

    const v23, 0x4bd5fb90    # 2.8047136E7f

    xor-int v15, v15, v23

    const v23, 0x5550eabf

    goto :goto_8

    .line 430
    :sswitch_18
    sget-object v13, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    const/16 v14, 0x6b

    const/4 v12, 0x3

    sget v1, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v1, :cond_b

    goto/16 :goto_2

    :cond_b
    const-string v1, "\u06df\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x3dcf

    const v23, -0x5e563304

    xor-int v15, v15, v23

    const v23, 0x64ab99b0

    :goto_8
    xor-int v23, v1, v23

    goto/16 :goto_11

    .line 427
    :sswitch_19
    :try_start_6
    invoke-direct/range {p0 .. p0}, Ll/ۧ֨ۘ;->ۙ()Landroid/content/ClipboardManager;

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

    const-string v1, "\u1a74\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x30cd

    const v23, 0x73c551c0

    xor-int v15, v15, v23

    const v23, 0x3f149e86

    goto/16 :goto_10

    :catchall_0
    move-object/from16 v0, p1

    :catchall_1
    const-string v1, "\u0730\u06eb"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x39d9

    const v23, 0x134aa11e

    xor-int v15, v15, v23

    const v23, 0x7a793f04    # 3.2354E35f

    goto/16 :goto_10

    :sswitch_1a
    move-object/from16 v0, p1

    const/4 v2, 0x0

    const-string v1, "\u06e7\u1a7a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x59

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x46ef

    const v23, -0x48e23edd

    xor-int v15, v15, v23

    const v23, 0x606ed970

    goto/16 :goto_10

    :sswitch_1b
    move-object/from16 v0, p1

    const/16 v1, 0xe48

    const/16 v11, 0xe48

    goto :goto_9

    :sswitch_1c
    move-object/from16 v0, p1

    const v1, 0x821d

    const v11, 0x821d

    :goto_9
    const-string v1, "\u1a76\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x23

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x5773

    const v23, 0x7d0f42cd

    xor-int v15, v15, v23

    const v23, -0x5615a73b

    goto/16 :goto_10

    :sswitch_1d
    move-object/from16 v0, p1

    add-int v1, v19, v24

    mul-int v1, v1, v1

    sub-int v1, v1, v18

    if-lez v1, :cond_c

    const-string v1, "\u06e7\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x6c5

    const v23, 0x449405c6

    xor-int v15, v15, v23

    const v23, -0x4e7a582d

    goto/16 :goto_10

    :cond_c
    const-string v1, "\u1a7b\u06e0"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x5d6b

    const v23, 0x1a2a1ddc

    xor-int v15, v15, v23

    const v23, 0x6ff4f4b9

    goto/16 :goto_10

    :sswitch_1e
    move-object/from16 v0, p1

    const/16 v24, 0x2b7e

    .line 87
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v1

    if-eqz v1, :cond_d

    :goto_a
    const-string v1, "\u06e1\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0xf

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x1b29

    const v23, 0x154df29e

    xor-int v15, v15, v23

    const v23, -0x7b0b6a5b

    goto/16 :goto_10

    :cond_d
    const-string v1, "\u1a7a\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0xd1f

    const v23, 0x7a6f8947

    xor-int v15, v15, v23

    const v23, -0x21a8662a

    goto/16 :goto_10

    :sswitch_1f
    move-object/from16 v0, p1

    const v1, 0x7639204

    add-int v1, v17, v1

    add-int v18, v1, v1

    .line 37
    sget v1, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v1, :cond_e

    :goto_b
    const-string v1, "\u073a\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x4b

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x7063

    const v23, -0x12aa3a59

    xor-int v15, v15, v23

    const v23, -0x426fa7ad

    goto/16 :goto_10

    :cond_e
    const-string v1, "\u06eb\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0xb

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x3a37

    const v23, 0x7dbdfd78

    xor-int v15, v15, v23

    const v23, 0x67180782    # 7.179382E23f

    goto/16 :goto_10

    :sswitch_20
    move-object/from16 v0, p1

    const/16 v1, 0x6a

    aget-short v19, v16, v1

    mul-int v17, v19, v19

    .line 86
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v1

    if-gtz v1, :cond_f

    const-string v1, "\u05a8\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, -0x6f

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x3549

    const v23, -0x683fa75a

    xor-int v15, v15, v23

    const v23, 0x691bca62

    goto/16 :goto_10

    :cond_f
    const-string v1, "\u1a79\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x11

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x470b

    const v23, 0x2f6631c5

    xor-int v15, v15, v23

    const v23, 0x1cfe8cf8

    goto/16 :goto_10

    :sswitch_21
    move-object/from16 v0, p1

    sget-object v16, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    .line 125
    sget v1, Ll/֫;->ܶܺ᩻:I

    if-ltz v1, :cond_10

    :goto_c
    const-string v1, "\u06dc\u1a73"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, 0x49

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0xe65

    const v23, 0x4d6ab766    # 2.4611798E8f

    xor-int v15, v15, v23

    const v23, 0x3f7b58d0

    goto/16 :goto_10

    :cond_10
    const-string v1, "\u1a79\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x109f

    const v23, 0x43ed3390

    xor-int v15, v15, v23

    const v23, -0x7ef9715f

    goto/16 :goto_10

    :sswitch_22
    move-object/from16 v0, p1

    .line 396
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v1

    if-gtz v1, :cond_11

    goto :goto_d

    :cond_11
    const-string v1, "\u073f\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x34c9

    const v23, -0x2f21b434

    xor-int v15, v15, v23

    const v23, -0x15092c80

    goto/16 :goto_10

    :sswitch_23
    move-object/from16 v0, p1

    .line 159
    sget v1, Ll/ۗ;->֨۬ۖ:I

    if-ltz v1, :cond_12

    :goto_d
    const-string v1, "\u1a75\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x7b

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x2f77

    const v23, -0x269e6d6c

    xor-int v15, v15, v23

    const v23, -0x66a54cf8

    goto/16 :goto_10

    :cond_12
    const-string v1, "\u1a77\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x43e1

    const v23, 0x28955c11

    xor-int v15, v15, v23

    const v23, 0x48d0f3db

    goto :goto_10

    :sswitch_24
    move-object/from16 v0, p1

    .line 331
    sget v1, Ll/۟;->ۨᩴۛ:I

    if-ltz v1, :cond_13

    :goto_e
    const-string v1, "\u073f\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x3d

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, -0x2705

    const v23, -0x2c292fbe

    xor-int v15, v15, v23

    const v23, 0x3408862a

    goto :goto_10

    :cond_13
    const-string v1, "\u06d7\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit8 v15, v15, -0x79

    const v23, -0x129844fb

    xor-int v15, v15, v23

    const v23, 0x2ed89d64

    goto :goto_10

    :sswitch_25
    move-object/from16 v0, p1

    sget-boolean v1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v1, :cond_14

    :goto_f
    const-string v1, "\u073a\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x2ee1

    const v23, 0x7e3f7985

    xor-int v15, v15, v23

    const v23, 0x4002e435

    goto :goto_10

    :cond_14
    const-string v1, "\u1a7a\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x1f

    xor-int v15, v1, v20

    mul-int/lit16 v15, v15, 0x4885

    const v23, 0x7cb317a5

    xor-int v15, v15, v23

    const v23, 0x81853c1

    :goto_10
    xor-int v23, v1, v23

    move-object/from16 v0, p2

    :goto_11
    move v1, v15

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f4111eb -> :sswitch_16
        -0x7c9e5f82 -> :sswitch_0
        -0x77a913ae -> :sswitch_13
        -0x76ff2369 -> :sswitch_a
        -0x76f3b4a9 -> :sswitch_c
        -0x769a8236 -> :sswitch_f
        -0x6d959a12 -> :sswitch_20
        -0x6ccd1855 -> :sswitch_1c
        -0x6a5d32ae -> :sswitch_9
        -0x6a1317f5 -> :sswitch_6
        -0x61c42222 -> :sswitch_5
        -0x5f8b5322 -> :sswitch_25
        -0x56559a35 -> :sswitch_1e
        -0x5228d380 -> :sswitch_24
        -0x51ae4fab -> :sswitch_d
        -0x5068cf97 -> :sswitch_18
        -0x45e6da56 -> :sswitch_1c
        -0x44a02787 -> :sswitch_20
        -0x40f9b69b -> :sswitch_25
        -0x3fa99a2d -> :sswitch_19
        -0x3c3e2c86 -> :sswitch_1
        -0x38298d97 -> :sswitch_13
        -0x3776c6ba -> :sswitch_4
        -0x35f03310 -> :sswitch_1
        -0x33ef0650 -> :sswitch_15
        -0x338ea101 -> :sswitch_7
        -0x32c48c8b -> :sswitch_1d
        -0x29eafa06 -> :sswitch_1f
        -0x2941824e -> :sswitch_14
        -0x2109fad9 -> :sswitch_19
        -0x1e9ce874 -> :sswitch_3
        -0x1ad22b0e -> :sswitch_17
        -0x14970519 -> :sswitch_1d
        -0xc0649eb -> :sswitch_8
        -0x4c95293 -> :sswitch_23
        -0x4374a96 -> :sswitch_0
        -0x150fabc -> :sswitch_1a
        0x502fa99 -> :sswitch_1b
        0xb190e41 -> :sswitch_1f
        0xd9792b2 -> :sswitch_10
        0xdb21f7c -> :sswitch_22
        0xf9bd379 -> :sswitch_9
        0x12f5933c -> :sswitch_7
        0x148657e0 -> :sswitch_5
        0x1a45d264 -> :sswitch_b
        0x1c2234a0 -> :sswitch_2
        0x215d8e22 -> :sswitch_f
        0x260bb234 -> :sswitch_6
        0x2a72083d -> :sswitch_14
        0x2c7800c0 -> :sswitch_15
        0x2d3a32c4 -> :sswitch_21
        0x301cff53 -> :sswitch_11
        0x304b8958 -> :sswitch_12
        0x3102d6f8 -> :sswitch_1e
        0x311dd9fe -> :sswitch_a
        0x3acda973 -> :sswitch_23
        0x3bd67e9b -> :sswitch_16
        0x3f18de82 -> :sswitch_21
        0x3fa791a7 -> :sswitch_2
        0x54644961 -> :sswitch_4
        0x54722504 -> :sswitch_d
        0x584d1a43 -> :sswitch_e
        0x5957b659 -> :sswitch_b
        0x5a93faf9 -> :sswitch_11
        0x5bbc185c -> :sswitch_22
        0x62e11456 -> :sswitch_24
        0x65327d1f -> :sswitch_8
        0x67250f65 -> :sswitch_e
        0x6a2c90b1 -> :sswitch_3
        0x6dc159c8 -> :sswitch_18
        0x722e5562 -> :sswitch_1a
        0x727cc9c7 -> :sswitch_12
        0x7409dca2 -> :sswitch_17
        0x7428b29b -> :sswitch_c
        0x7436f8d2 -> :sswitch_1b
        0x7950389e -> :sswitch_10
    .end sparse-switch
.end method

.method public final showToast(Ljava/lang/CharSequence;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x45d945d1

    sget v4, Ll/ۘ֡;->ܰ֡ܽ:I

    sget v5, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v6, "\u06d8\u05ab"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x33

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5b8b

    const v8, 0x4f2cd0cd    # 2.899365E9f

    xor-int/2addr v7, v8

    const v8, 0x1209e28a

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x653b

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 111
    sget v6, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v6, :cond_e

    goto/16 :goto_5

    .line 396
    :sswitch_0
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    sget-boolean v6, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v6, :cond_b

    goto/16 :goto_5

    .line 60
    :sswitch_1
    sget-boolean v6, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v6, :cond_8

    goto/16 :goto_3

    .line 228
    :sswitch_2
    sget v6, Ll/ۗ;->֨۬ۖ:I

    if-gez v6, :cond_d

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    goto/16 :goto_3

    .line 162
    :sswitch_4
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    return-void

    .line 172
    :sswitch_5
    invoke-static {p0, v2}, Ll/ۗ;->֡ۚۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    goto/16 :goto_2

    :sswitch_6
    const/4 v6, 0x1

    .line 0
    invoke-static {v6, v2}, Ll/֡ۛ;->ۖۘ۟(ILjava/lang/Object;)C

    move-result v6

    const/16 v7, 0x7d

    if-ne v6, v7, :cond_2

    const-string v6, "\u06e0\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x69

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x30bf

    const v8, -0x7c38a065

    xor-int/2addr v7, v8

    const v8, -0x324e9d51    # -3.7200432E8f

    goto :goto_0

    .line 171
    :sswitch_7
    invoke-static {v2, v0}, Ll/ۗ;->᩶᩺ܶ(Ljava/lang/Object;I)C

    move-result v6

    const/16 v7, 0x7b

    if-ne v6, v7, :cond_2

    const-string v6, "\u06df\u05ab"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x1f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2c61

    const v8, -0x7ed3bc22

    xor-int/2addr v7, v8

    const v8, -0x3001a7be

    goto :goto_0

    :sswitch_8
    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v6

    const/4 v7, 0x3

    if-lt v6, v7, :cond_2

    const-string v6, "\u0730\u1a75"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7621

    const v8, 0x5b086868

    xor-int/2addr v7, v8

    const v8, -0x30031eaf

    goto/16 :goto_0

    .line 443
    :sswitch_9
    sget-object v6, Ll/᩷᩹ۘ;->᩹:Ll/֡֨ۘ;

    .line 86
    new-instance v6, Ll/ۤ᩹ۘ;

    .line 266
    sget-boolean v7, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v7, :cond_0

    goto/16 :goto_5

    .line 86
    :cond_0
    invoke-direct {v6, v0, v1}, Ll/ۤ᩹ۘ;-><init>(ILjava/lang/Object;)V

    invoke-static {v6}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 171
    :sswitch_a
    instance-of v0, p1, Ljava/lang/String;

    const/4 v6, 0x0

    if-eqz v0, :cond_1

    const-string v0, "\u1a73\u06d7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v4

    xor-int v7, v0, v5

    mul-int/lit16 v7, v7, -0x41ef

    const v8, -0x2f7fd9e

    xor-int/2addr v7, v8

    const v8, -0x1eb90088

    xor-int/2addr v0, v8

    move v6, v0

    const/4 v0, 0x0

    goto/16 :goto_1

    :cond_1
    const/4 v0, 0x0

    :cond_2
    move-object v1, p1

    :goto_2
    const-string v6, "\u1a79\u06e0"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x19

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5bd5

    const v8, 0x12365607

    xor-int/2addr v7, v8

    const v8, 0x56b6fb13

    goto/16 :goto_0

    .line 179
    :sswitch_b
    sget-boolean v6, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v6, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v6, "\u06e8\u06d7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5469

    const v8, 0x18d5aa62

    xor-int/2addr v7, v8

    const v8, 0x7f7f8b7a

    goto/16 :goto_0

    .line 318
    :sswitch_c
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v6

    if-gtz v6, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v6, "\u1a79\u06e4"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x3b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6173

    const v8, 0x4e9fa6fa    # 1.3392602E9f

    xor-int/2addr v7, v8

    const v8, -0x1043dcaf

    goto/16 :goto_0

    .line 145
    :sswitch_d
    sget v6, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v6, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v6, "\u06ec\u06df"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6565

    const v8, 0x657b6c32

    xor-int/2addr v7, v8

    const v8, 0x7ed340ac

    goto/16 :goto_0

    .line 342
    :sswitch_e
    sget v6, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v6, :cond_6

    goto :goto_3

    :cond_6
    const-string v6, "\u06e7\u073d"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x3b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x107

    const v8, 0x65b7071d

    xor-int/2addr v7, v8

    const v8, -0x2a625b97

    goto/16 :goto_0

    .line 394
    :sswitch_f
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v6

    if-gtz v6, :cond_7

    :goto_3
    const-string v6, "\u06eb\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x9

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6ef

    const v8, 0x2c399f5b

    xor-int/2addr v7, v8

    const v8, -0x620c8a52

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06e7\u0733"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5015

    const v8, -0x14862dd3

    xor-int/2addr v7, v8

    const v8, 0x38feaa4e

    goto/16 :goto_0

    .line 356
    :sswitch_10
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v6

    if-gtz v6, :cond_9

    :cond_8
    const-string v6, "\u1a78\u06e0"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x39

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x20c5

    const v8, -0x4f37fa10

    xor-int/2addr v7, v8

    const v8, -0x27eb9eef

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u1a79\u1a74"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x15

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x540b

    const v8, -0x79df802a

    xor-int/2addr v7, v8

    const v8, 0x6efa1d9b

    goto/16 :goto_0

    :sswitch_11
    sget v6, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v6, :cond_a

    :goto_4
    const-string v6, "\u06d6\u06d7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x69

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5ed9

    const v8, 0x5dd18c74

    xor-int/2addr v7, v8

    const v8, 0x6508a5ad

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u0736\u0736"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x79

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2b41

    const v8, -0x1b8ddf04

    xor-int/2addr v7, v8

    const v8, 0x53889db8

    goto/16 :goto_0

    :sswitch_12
    sget-boolean v6, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v6, :cond_c

    :cond_b
    const-string v6, "\u06e2\u06eb"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x29ad

    const v8, -0x1fe6080c

    xor-int/2addr v7, v8

    const v8, -0x229ddbdf

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06d8\u1a75"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x6d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xf9b

    const v8, -0x6ac90455

    xor-int/2addr v7, v8

    const v8, 0x53e1f0b8

    goto/16 :goto_0

    :cond_d
    :goto_5
    const-string v6, "\u073a\u1a76"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x77

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x784b

    const v8, -0x134b7061

    xor-int/2addr v7, v8

    const v8, 0x43216395

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06e1\u06d9"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x667f

    const v8, 0xbe0a92

    xor-int/2addr v7, v8

    const v8, 0x74ae46a7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d148714 -> :sswitch_5
        -0x781ce0fc -> :sswitch_d
        -0x6f7c36e9 -> :sswitch_10
        -0x6a0cba2e -> :sswitch_f
        -0x69884b0e -> :sswitch_0
        -0x679f7b3a -> :sswitch_2
        -0x60ed102e -> :sswitch_12
        -0x5a45c184 -> :sswitch_2
        -0x598703e9 -> :sswitch_8
        -0x530ebcc1 -> :sswitch_9
        -0x458c9cf2 -> :sswitch_11
        -0x4554f3ad -> :sswitch_b
        -0x382ef27d -> :sswitch_10
        -0x3575b9e7 -> :sswitch_d
        -0x34982e9a -> :sswitch_12
        -0x2cbdfdf1 -> :sswitch_e
        -0x29419936 -> :sswitch_b
        -0x221e0c63 -> :sswitch_f
        -0x20b9fca8 -> :sswitch_e
        -0x1be12074 -> :sswitch_c
        -0x1a4dea3a -> :sswitch_a
        -0x147df31d -> :sswitch_a
        0x46a8593 -> :sswitch_9
        0x5b80c83 -> :sswitch_3
        0x84aba89 -> :sswitch_6
        0x182503e8 -> :sswitch_4
        0x1b5b364f -> :sswitch_0
        0x24406d79 -> :sswitch_7
        0x2bab5788 -> :sswitch_4
        0x320462df -> :sswitch_c
        0x3ea9033c -> :sswitch_11
        0x42be6b67 -> :sswitch_5
        0x47afba3b -> :sswitch_1
        0x497e01b2 -> :sswitch_3
        0x4f0463a4 -> :sswitch_1
        0x6b904aca -> :sswitch_7
        0x710bdaa3 -> :sswitch_6
        0x7b8887ef -> :sswitch_8
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

    const v16, 0x2224ee65

    sget v17, Ll/ۖۗ;->᩶۫ۗ:I

    sget v18, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v19, "\u05ab\u05a8"

    invoke-static/range {v19 .. v19}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v19

    sub-int v19, v17, v19

    mul-int/lit8 v19, v19, -0x49

    xor-int v3, v19, v18

    mul-int/lit16 v3, v3, 0x5f8b

    const v21, 0x721e4b9

    xor-int v3, v3, v21

    const v21, 0x76ceb678

    xor-int v19, v19, v21

    const/16 v20, 0x0

    :goto_0
    xor-int v1, v16, v18

    mul-int/lit16 v1, v1, 0x58c1

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v3

    xor-int v16, v19, v1

    sparse-switch v16, :sswitch_data_0

    move-object/from16 v1, p1

    .line 61
    sget-boolean v0, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v0, :cond_e

    goto/16 :goto_d

    .line 225
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_1

    :cond_0
    move-object/from16 v1, p1

    goto/16 :goto_d

    :cond_1
    :goto_1
    move-object/from16 v1, p1

    goto/16 :goto_a

    .line 135
    :sswitch_1
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    :goto_2
    move-object/from16 v1, p1

    goto/16 :goto_f

    :cond_3
    const-string v1, "\u1a76\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x1313

    const v19, 0x54c12b9e

    xor-int v3, v3, v19

    const v19, -0xf1717e

    goto/16 :goto_6

    .line 383
    :sswitch_2
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v1

    if-gtz v1, :cond_0

    :cond_4
    :goto_3
    move-object/from16 v1, p1

    goto/16 :goto_b

    :sswitch_3
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v1, "\u0736\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x49

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x61c1

    const v19, 0x27bfd4fb

    xor-int v3, v3, v19

    const v19, -0x35d603cb

    goto/16 :goto_6

    .line 31
    :sswitch_4
    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v1, :cond_2

    goto :goto_3

    .line 52
    :sswitch_5
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    move-object/from16 v1, p1

    goto/16 :goto_c

    :sswitch_6
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_4
    move-object/from16 v1, p1

    goto/16 :goto_10

    :sswitch_7
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto :goto_4

    :sswitch_8
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    return-void

    .line 453
    :sswitch_9
    aput-object v15, v2, v10

    goto/16 :goto_5

    .line 451
    :sswitch_a
    invoke-static {v0, v14}, Ll/ۗ;->֡ۚۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_7

    const-string v1, "\u073f\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x77

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x4c15

    const v19, 0x2378912d

    xor-int v3, v3, v19

    const v19, -0x37d9901d

    goto/16 :goto_6

    .line 0
    :sswitch_b
    invoke-static {v7, v14}, Ll/֡۠;->ۡܰ۫(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v4, :cond_7

    const-string v1, "\u1a78\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x6b

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x4367

    const v19, -0x604e45c5

    xor-int v3, v3, v19

    const v19, 0x2b5c8093

    goto/16 :goto_6

    .line 450
    :sswitch_c
    invoke-static {v14, v8}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v5, :cond_7

    const-string v1, "\u06d6\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x8b5

    const v19, -0x663c282c

    xor-int v3, v3, v19

    const v19, -0x5c2c509f

    goto/16 :goto_6

    .line 172
    :sswitch_d
    invoke-static {v0, v9}, Ll/ۗ;->֡ۚۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    move-object v13, v1

    move-object/from16 v1, p1

    goto/16 :goto_9

    .line 450
    :sswitch_e
    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v6, :cond_7

    const-string v1, "\u06e0\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x53

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x4a9d

    const v19, -0x7259865d

    xor-int v3, v3, v19

    const v19, -0x2e9972a7

    goto/16 :goto_6

    :sswitch_f
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p1

    goto/16 :goto_7

    .line 0
    :sswitch_10
    invoke-static {v7, v9}, Ll/֡ۛ;->ۖۘ۟(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v4, :cond_9

    const-string v1, "\u06d8\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x42fd

    const v19, 0x345c3040

    xor-int v3, v3, v19

    const v19, 0x73c3a6e7

    goto/16 :goto_6

    .line 450
    :sswitch_11
    aget-object v12, v2, v10

    instance-of v1, v12, Ljava/lang/String;

    if-eqz v1, :cond_7

    const-string v1, "\u06df\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x78df

    const v19, 0xc1b2eb2

    xor-int v3, v3, v19

    const v19, -0x162b9679

    goto/16 :goto_6

    :cond_7
    :goto_5
    const-string v1, "\u06e2\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x37

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x4fdb

    const v19, 0x30406466    # 6.999187E-10f

    xor-int v3, v3, v19

    const v19, 0x5dc995b3

    goto/16 :goto_6

    .line 86
    :sswitch_12
    new-instance v1, Ll/ۤ᩹ۘ;

    invoke-direct {v1, v8, v11}, Ll/ۤ᩹ۘ;-><init>(ILjava/lang/Object;)V

    invoke-static {v1}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 457
    :sswitch_13
    invoke-static {v13}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ll/ۧ֨ۘ;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 458
    sget-object v1, Ll/᩷᩹ۘ;->᩹:Ll/֡֨ۘ;

    sget v1, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v1, :cond_8

    goto/16 :goto_1

    :cond_8
    const-string v1, "\u06ec\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x4495

    const v19, -0x30db5168    # -2.7629056E9f

    xor-int v3, v3, v19

    const v19, 0x6096ad2

    goto :goto_6

    .line 171
    :sswitch_14
    invoke-static {v9, v8}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v5, :cond_9

    const-string v1, "\u06dc\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0xd9

    const v19, 0x6fcc5e0b

    xor-int v3, v3, v19

    const v19, -0x450f49a

    goto :goto_6

    :cond_9
    move-object/from16 v1, p1

    goto/16 :goto_8

    .line 449
    :sswitch_15
    array-length v1, v2

    if-ge v10, v1, :cond_a

    const-string v1, "\u0730\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0xd

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x156b

    const v19, 0x311a65c3

    xor-int v3, v3, v19

    const v19, -0x1e260707

    goto :goto_6

    :cond_a
    const-string v1, "\u1a77\u1a73"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x5b

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x4d07

    const v19, -0x1ab3970d

    xor-int v3, v3, v19

    const v19, 0x8751a68

    :goto_6
    xor-int v19, v1, v19

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v1, p1

    .line 171
    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    invoke-static {v9}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v3

    if-lt v3, v6, :cond_b

    const-string v3, "\u06da\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v0, v3, v18

    mul-int/lit16 v0, v0, -0x220d

    const v19, 0x707ec816

    xor-int v0, v0, v19

    const v19, 0x744356d7

    xor-int v19, v3, v19

    move v3, v0

    goto/16 :goto_12

    :sswitch_17
    move-object/from16 v1, p1

    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_7
    const-string v0, "\u1a79\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x4015

    const v19, 0x23b89683

    xor-int v3, v3, v19

    const v19, 0x2d88e69b

    goto/16 :goto_11

    :sswitch_18
    move-object/from16 v1, p1

    const/16 v5, 0x7b

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v20, :cond_b

    const-string v0, "\u0730\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x39f1

    const v19, -0x1f557b4f

    xor-int v3, v3, v19

    const v19, 0x557a7cea

    goto/16 :goto_11

    :cond_b
    :goto_8
    move-object v13, v1

    :goto_9
    const-string v0, "\u073d\u05ab"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x6f

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x19d5

    const v19, -0x282c88fe

    xor-int v3, v3, v19

    const v19, 0x4c37c916    # 4.8178264E7f

    goto/16 :goto_11

    :sswitch_19
    move-object/from16 v1, p1

    instance-of v0, v1, Ljava/lang/String;

    .line 47
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_c

    move/from16 v20, v0

    const/16 v4, 0x7d

    goto/16 :goto_e

    :cond_c
    const-string v3, "\u1a7b\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v18

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x143

    const v20, -0x7d50e070

    xor-int v4, v4, v20

    const v20, 0xf4227f0

    xor-int v3, v3, v20

    move/from16 v20, v0

    move/from16 v19, v3

    move v3, v4

    const/16 v4, 0x7d

    goto/16 :goto_12

    :sswitch_1a
    move-object/from16 v1, p1

    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_d

    :goto_a
    const-string v0, "\u06e0\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x75

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x7471

    const v19, 0x35f86697

    xor-int v3, v3, v19

    const v19, -0x1ae72c52

    goto/16 :goto_11

    :cond_d
    const-string v0, "\u06df\u06d7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x7c99

    const v19, -0x2c3509b6

    xor-int v3, v3, v19

    const v19, -0x638e92b2

    goto/16 :goto_11

    :cond_e
    const-string v0, "\u06d8\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x9

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x4ee5

    const v19, 0x1cea68cb

    xor-int v3, v3, v19

    const v19, 0x3e5ad9c9

    goto/16 :goto_11

    :sswitch_1b
    move-object/from16 v1, p1

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v0

    if-ltz v0, :cond_f

    :goto_b
    const-string v0, "\u1a78\u06d7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x6257

    const v19, -0x1d076a3b

    xor-int v3, v3, v19

    const v19, 0x6875f902

    goto/16 :goto_11

    :cond_f
    const-string v0, "\u06d8\u06e4"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x41e7

    const v19, -0x3865ed4a

    xor-int v3, v3, v19

    const v19, -0x609865b7

    goto/16 :goto_11

    :sswitch_1c
    move-object/from16 v1, p1

    .line 368
    sget v0, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v0, :cond_10

    :goto_c
    const-string v0, "\u06da\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x63

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x2beb

    const v19, -0xcfc2d72

    xor-int v3, v3, v19

    const v19, 0xc048976

    goto/16 :goto_11

    :cond_10
    const-string v0, "\u06e7\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x59

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x3735

    const v19, 0x140d69ee

    xor-int v3, v3, v19

    const v19, -0x6938e9a8

    goto/16 :goto_11

    :sswitch_1d
    move-object/from16 v1, p1

    .line 180
    sget v0, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v0, :cond_11

    :goto_d
    const-string v0, "\u1a79\u1a7a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x1b8d

    const v19, -0x153aa163

    xor-int v3, v3, v19

    const v19, -0x31070355

    goto/16 :goto_11

    :cond_11
    const-string v0, "\u05a8\u06df"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x15

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x523d

    const v19, -0x6fc111b

    xor-int v3, v3, v19

    const v19, 0x47e4f740    # 117230.5f

    goto/16 :goto_11

    :sswitch_1e
    move-object/from16 v1, p1

    .line 425
    sget v0, Ll/ۗ;->֨۬ۖ:I

    if-ltz v0, :cond_12

    :goto_e
    const-string v0, "\u06e7\u073d"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x49c9

    const v19, 0x7e8eec44

    xor-int v3, v3, v19

    const v19, -0x18b44b42

    goto/16 :goto_11

    :cond_12
    const-string v0, "\u1a77\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x19

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x579b

    const v19, -0x775cb78a

    xor-int v3, v3, v19

    const v19, -0x55d8ad70

    goto :goto_11

    :sswitch_1f
    move-object/from16 v1, p1

    sget v0, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v0, :cond_13

    :goto_f
    const-string v0, "\u073d\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x4d

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x7dfb

    const v19, 0x58278a4b

    xor-int v3, v3, v19

    const v19, 0x526d14fa

    goto :goto_11

    :cond_13
    const-string v0, "\u06ec\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x9

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x342f

    const v19, 0x20c9d1d0

    xor-int v3, v3, v19

    const v19, 0x7959fcf4

    goto :goto_11

    :sswitch_20
    move-object/from16 v1, p1

    .line 130
    sget v0, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v0, :cond_14

    :goto_10
    const-string v0, "\u06dc\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x71

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x27f1

    const v19, -0x4d0a1a5c

    xor-int v3, v3, v19

    const v19, 0xcbc0ad2

    goto :goto_11

    :cond_14
    const-string v0, "\u06e2\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x4069

    const v19, 0x57903b39

    xor-int v3, v3, v19

    const v19, 0x75673efa

    :goto_11
    xor-int v19, v0, v19

    :goto_12
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ef94a0f -> :sswitch_19
        -0x79c09919 -> :sswitch_9
        -0x79ac3994 -> :sswitch_20
        -0x708593a4 -> :sswitch_5
        -0x6c18d15e -> :sswitch_1
        -0x69669e1f -> :sswitch_1b
        -0x6394bd86 -> :sswitch_f
        -0x63709ffd -> :sswitch_1e
        -0x63387ab7 -> :sswitch_11
        -0x60c7fd7c -> :sswitch_13
        -0x5c2827dc -> :sswitch_c
        -0x57ea6cce -> :sswitch_7
        -0x53a51c68 -> :sswitch_7
        -0x4c5fd316 -> :sswitch_d
        -0x4bdf2241 -> :sswitch_14
        -0x4ad74c11 -> :sswitch_1d
        -0x45d010d9 -> :sswitch_1e
        -0x4181801f -> :sswitch_a
        -0x3f5bbb88 -> :sswitch_1
        -0x3c83c39d -> :sswitch_17
        -0x3042f36c -> :sswitch_14
        -0x285bf10f -> :sswitch_0
        -0x19272db3 -> :sswitch_10
        -0x17e4ac3b -> :sswitch_1a
        -0x1231b346 -> :sswitch_16
        -0x12170718 -> :sswitch_15
        -0x108cf21e -> :sswitch_10
        -0xb5c492c -> :sswitch_e
        -0x84c74ea -> :sswitch_f
        -0x2d312a2 -> :sswitch_1a
        0x8880377 -> :sswitch_12
        0x9be0ea6 -> :sswitch_b
        0xb2ff229 -> :sswitch_1d
        0xd9b78f4 -> :sswitch_8
        0xe98e2e5 -> :sswitch_3
        0x117ef8e0 -> :sswitch_1f
        0x12143417 -> :sswitch_8
        0x12361f52 -> :sswitch_18
        0x1b7eb466 -> :sswitch_12
        0x1d03d3e1 -> :sswitch_4
        0x247a0ccf -> :sswitch_15
        0x24cf3459 -> :sswitch_11
        0x270b4a19 -> :sswitch_17
        0x272838e7 -> :sswitch_0
        0x2e6c2113 -> :sswitch_3
        0x30d361da -> :sswitch_e
        0x3f6ee4ce -> :sswitch_2
        0x46cb5eeb -> :sswitch_19
        0x480d86c4 -> :sswitch_16
        0x4e11fb04 -> :sswitch_5
        0x4e253061 -> :sswitch_2
        0x4f453d68 -> :sswitch_d
        0x52e7af2b -> :sswitch_4
        0x5377e15e -> :sswitch_1c
        0x552fc8a6 -> :sswitch_20
        0x58f10cf3 -> :sswitch_9
        0x5da4cb5d -> :sswitch_6
        0x63b02527 -> :sswitch_b
        0x64137d65 -> :sswitch_18
        0x6810e1db -> :sswitch_1f
        0x6ac05412 -> :sswitch_6
        0x700db328 -> :sswitch_1c
        0x7022bb11 -> :sswitch_13
        0x7188128d -> :sswitch_c
        0x74130313 -> :sswitch_1b
        0x7a5e2ea9 -> :sswitch_a
    .end sparse-switch
.end method

.method public final showToastL(Ljava/lang/CharSequence;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x52f1e783

    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    sget v5, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v6, "\u06e7\u06ec"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x19

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x21b9

    const v8, 0x739e3545

    xor-int/2addr v7, v8

    const v8, -0x1e43060c

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x525b

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 108
    sget v6, Ll/֫ۚ;->ܽ۠᩹:I

    if-gez v6, :cond_d

    goto/16 :goto_4

    .line 253
    :sswitch_0
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget-boolean v6, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v6, :cond_6

    goto/16 :goto_5

    .line 132
    :sswitch_1
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget-boolean v6, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v6, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v6, "\u1a76\u1a74"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x73

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1aab

    const v8, -0x56c972d

    xor-int/2addr v7, v8

    const v8, -0x44beba8d

    goto :goto_0

    .line 437
    :sswitch_2
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    goto/16 :goto_5

    .line 441
    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    return-void

    .line 172
    :sswitch_4
    invoke-static {p0, v2}, Ll/ۗ;->֡ۚۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    goto/16 :goto_2

    :sswitch_5
    const/4 v6, 0x1

    .line 0
    invoke-static {v6, v2}, Ll/֡۠;->ۡܰ۫(ILjava/lang/Object;)C

    move-result v6

    const/16 v7, 0x7d

    if-ne v6, v7, :cond_3

    const-string v6, "\u1a78\u1a79"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0xdcf

    const v8, 0x5c33133c

    xor-int/2addr v7, v8

    const v8, -0x7239c14

    goto :goto_0

    .line 171
    :sswitch_6
    invoke-static {v2, v0}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v6

    const/16 v7, 0x7b

    if-ne v6, v7, :cond_3

    const-string v6, "\u073d\u06e4"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x55

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7b0d

    const v8, -0x1d5bc8aa

    xor-int/2addr v7, v8

    const v8, 0x2498ed85

    goto/16 :goto_0

    :sswitch_7
    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v6

    const/4 v7, 0x3

    if-lt v6, v7, :cond_3

    const-string v6, "\u06df\u1a74"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x2b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x262f

    const v8, 0x7a5e8fc1

    xor-int/2addr v7, v8

    const v8, 0x312a7da7

    goto/16 :goto_0

    .line 464
    :sswitch_8
    sget-object v6, Ll/᩷᩹ۘ;->᩹:Ll/֡֨ۘ;

    .line 90
    new-instance v6, Ll/۟᩹ۘ;

    .line 288
    sget v7, Ll/֫;->ܶܺ᩻:I

    if-ltz v7, :cond_1

    goto :goto_3

    .line 90
    :cond_1
    invoke-direct {v6, v0, v1}, Ll/۟᩹ۘ;-><init>(ILjava/lang/Object;)V

    invoke-static {v6}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 171
    :sswitch_9
    instance-of v0, p1, Ljava/lang/String;

    const/4 v6, 0x0

    if-eqz v0, :cond_2

    const-string v0, "\u06df\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x79

    xor-int v7, v0, v5

    mul-int/lit16 v7, v7, -0x3db9

    const v8, -0x330295b0

    xor-int/2addr v7, v8

    const v8, 0x4abef090    # 6256712.0f

    xor-int/2addr v0, v8

    move v6, v0

    const/4 v0, 0x0

    goto/16 :goto_1

    :cond_2
    const/4 v0, 0x0

    :cond_3
    move-object v1, p1

    :goto_2
    const-string v6, "\u1a78\u05a1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x6d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4943

    const v8, 0x166a7239

    xor-int/2addr v7, v8

    const v8, -0x55f6df23

    goto/16 :goto_0

    .line 86
    :sswitch_a
    sget v6, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v6, :cond_4

    goto :goto_3

    :cond_4
    const-string v6, "\u06d6\u06ec"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x33

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xd37

    const v8, 0x4c235bd1    # 4.2823492E7f

    xor-int/2addr v7, v8

    const v8, -0x1e54ed26

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v6

    if-gtz v6, :cond_5

    :goto_3
    const-string v6, "\u1a73\u05a1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5727

    const v8, 0x7ba5e06f

    xor-int/2addr v7, v8

    const v8, -0x64a4f677

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u0730\u06df"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x7d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4a89

    const v8, -0x6c1a44f

    xor-int/2addr v7, v8

    const v8, 0x5ebea1ec

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v6

    if-nez v6, :cond_7

    :cond_6
    :goto_4
    const-string v6, "\u06e2\u0736"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2c59

    const v8, -0x4cadb6fe

    xor-int/2addr v7, v8

    const v8, -0x6399360b

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06e8\u1a7a"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x41

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xf3d

    const v8, 0x62f60510

    xor-int/2addr v7, v8

    const v8, -0x50598b46

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v6

    if-gtz v6, :cond_8

    goto :goto_5

    :cond_8
    const-string v6, "\u0733\u06e7"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x47

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4e4b

    const v8, -0x532f148b

    xor-int/2addr v7, v8

    const v8, 0x2ae1158d

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v6

    if-eqz v6, :cond_9

    goto :goto_5

    :cond_9
    const-string v6, "\u06d6\u1a75"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7743

    const v8, 0x49a8ff29

    xor-int/2addr v7, v8

    const v8, 0x18599a91

    goto/16 :goto_0

    .line 75
    :sswitch_f
    sget v6, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v6, :cond_a

    goto :goto_5

    :cond_a
    const-string v6, "\u06d7\u0733"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x68e7

    const v8, -0x114b47bb

    xor-int/2addr v7, v8

    const v8, -0x3c957ca6

    goto/16 :goto_0

    .line 253
    :sswitch_10
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v6

    if-eqz v6, :cond_b

    goto :goto_5

    :cond_b
    const-string v6, "\u06df\u0730"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit8 v7, v7, -0x2b

    const v8, -0xeefca48

    xor-int/2addr v7, v8

    const v8, 0x752802d2

    goto/16 :goto_0

    .line 252
    :sswitch_11
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v6

    if-nez v6, :cond_c

    :goto_5
    const-string v6, "\u1a75\u06e8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xb07

    const v8, 0x47de29cb

    xor-int/2addr v7, v8

    const v8, 0x3f1f2912

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u1a78\u06d6"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3f19

    const v8, 0x70964e9e

    xor-int/2addr v7, v8

    const v8, 0x5c31ad69    # 2.0004695E17f

    goto/16 :goto_0

    .line 141
    :sswitch_12
    sget v6, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v6, :cond_e

    :cond_d
    const-string v6, "\u06da\u1a7b"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x1f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3a53

    const v8, -0x675f725c

    xor-int/2addr v7, v8

    const v8, -0x23f4074b

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06da\u06ec"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xf

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2435

    const v8, -0x7c7f42cf    # -7.5666E-37f

    xor-int/2addr v7, v8

    const v8, -0x10950bee

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f90262b -> :sswitch_1
        -0x7f0853d2 -> :sswitch_12
        -0x74ab8338 -> :sswitch_4
        -0x72f1b23f -> :sswitch_a
        -0x704e5202 -> :sswitch_7
        -0x667f35f7 -> :sswitch_7
        -0x604495e0 -> :sswitch_10
        -0x5eb626ec -> :sswitch_d
        -0x5b1d8a73 -> :sswitch_e
        -0x594aae2a -> :sswitch_3
        -0x4a14e659 -> :sswitch_9
        -0x473425f4 -> :sswitch_a
        -0x46dc4476 -> :sswitch_8
        -0x40fe8563 -> :sswitch_c
        -0x3f262acd -> :sswitch_6
        -0x3e2deb5a -> :sswitch_0
        -0x37548f7b -> :sswitch_12
        -0x37177fff -> :sswitch_d
        -0x2bc94575 -> :sswitch_8
        -0x22670da3 -> :sswitch_f
        -0x18b2fae4 -> :sswitch_5
        -0x105bf018 -> :sswitch_5
        -0x41f96f2 -> :sswitch_2
        0xe370bb3 -> :sswitch_10
        0x106f980d -> :sswitch_11
        0x13dbaca9 -> :sswitch_e
        0x1c934702 -> :sswitch_6
        0x272d4367 -> :sswitch_f
        0x286ed822 -> :sswitch_4
        0x2af4c1df -> :sswitch_11
        0x329add08 -> :sswitch_0
        0x4cd7e1ae -> :sswitch_1
        0x6ad09555 -> :sswitch_c
        0x6d198f85 -> :sswitch_3
        0x72344f05 -> :sswitch_9
        0x7b0885b0 -> :sswitch_2
        0x7c0c672c -> :sswitch_b
        0x7ece3509 -> :sswitch_b
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

    const v16, -0x3f18db3e

    sget v17, Ll/֡᩶;->ۗ֨ܺ:I

    sget v18, Ll/֨᩺;->۬᩺ܰ:I

    const-string v19, "\u1a73\u06d9"

    invoke-static/range {v19 .. v19}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v19

    sub-int v19, v18, v19

    mul-int/lit8 v19, v19, -0x39

    xor-int v3, v19, v17

    mul-int/lit16 v3, v3, -0xe75

    const v21, -0x15cdad0f

    xor-int v3, v3, v21

    const v21, -0x5967bd55

    xor-int v19, v19, v21

    const/16 v20, 0x0

    :goto_0
    xor-int v1, v16, v17

    mul-int/lit16 v1, v1, -0x31b5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v3

    xor-int v16, v19, v1

    sparse-switch v16, :sswitch_data_0

    move-object/from16 v1, p1

    .line 392
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v0

    if-eqz v0, :cond_12

    goto/16 :goto_d

    .line 249
    :sswitch_0
    sget v1, Ll/ۧ;->֫۠ᩴ:I

    if-gez v1, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v1, p1

    goto/16 :goto_c

    :cond_1
    move-object/from16 v1, p1

    goto/16 :goto_f

    .line 441
    :sswitch_1
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget v1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v1, p1

    goto/16 :goto_e

    .line 158
    :sswitch_2
    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v1, :cond_4

    :cond_3
    move-object/from16 v1, p1

    goto/16 :goto_d

    :cond_4
    move-object/from16 v1, p1

    goto/16 :goto_b

    .line 149
    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v1, :cond_3

    goto :goto_1

    :sswitch_4
    sget-boolean v1, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v1, :cond_0

    goto :goto_3

    .line 123
    :sswitch_5
    sget v1, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v1, :cond_5

    :goto_2
    move-object/from16 v1, p1

    goto/16 :goto_a

    :cond_5
    :goto_3
    const-string v1, "\u06ec\u1a75"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x3f1d

    const v19, 0x3e1aa1db

    xor-int v3, v3, v19

    const v19, 0x769fd540

    goto/16 :goto_5

    .line 338
    :sswitch_6
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v1

    if-gtz v1, :cond_6

    goto :goto_2

    :cond_6
    const-string v1, "\u06d7\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x73

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x36ff

    const v19, -0x36423256

    xor-int v3, v3, v19

    const v19, -0x19843699

    goto/16 :goto_5

    .line 41
    :sswitch_7
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto :goto_2

    .line 153
    :sswitch_8
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    return-void

    .line 474
    :sswitch_9
    aput-object v15, v2, v10

    goto/16 :goto_4

    .line 472
    :sswitch_a
    invoke-static {v0, v14}, Ll/ۗ;->֡ۚۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_7

    const-string v1, "\u0730\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0xd

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x4781

    const v19, -0x59327926

    xor-int v3, v3, v19

    const v19, 0x22157385

    goto/16 :goto_5

    .line 0
    :sswitch_b
    invoke-static {v7, v14}, Ll/֡ۛ;->ۖۘ۟(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v4, :cond_7

    const-string v1, "\u05a8\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x2987

    const v19, -0x64984e18

    xor-int v3, v3, v19

    const v19, -0x51da32a0

    goto/16 :goto_5

    .line 471
    :sswitch_c
    invoke-static {v14, v8}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v5, :cond_7

    const-string v1, "\u05a1\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit8 v3, v3, -0x71

    const v19, 0x29d7b043

    xor-int v3, v3, v19

    const v19, -0x5291d2c0

    goto/16 :goto_5

    .line 172
    :sswitch_d
    invoke-static {v0, v9}, Ll/֫ᩳ;->᩺֨۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    move-object v13, v1

    move-object/from16 v1, p1

    goto/16 :goto_8

    .line 471
    :sswitch_e
    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v6, :cond_7

    const-string v1, "\u06eb\u06eb"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x73e7

    const v19, 0x4e35d54d    # 7.6266374E8f

    xor-int v3, v3, v19

    const v19, 0x3901196

    goto/16 :goto_5

    :sswitch_f
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p1

    goto/16 :goto_6

    .line 0
    :sswitch_10
    invoke-static {v7, v9}, Ll/֡۠;->ۡܰ۫(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v4, :cond_9

    const-string v1, "\u1a78\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x1d2b

    const v19, 0x50e13f4b

    xor-int v3, v3, v19

    const v19, -0x501dc8d6

    goto/16 :goto_5

    .line 471
    :sswitch_11
    aget-object v12, v2, v10

    instance-of v1, v12, Ljava/lang/String;

    if-eqz v1, :cond_7

    const-string v1, "\u1a74\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x23

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x2e4d

    const v19, -0x39f93da4

    xor-int v3, v3, v19

    const v19, 0x513f1fd7

    goto/16 :goto_5

    :cond_7
    :goto_4
    const-string v1, "\u073f\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x21

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x4dd1

    const v19, -0x1caa91b

    xor-int v3, v3, v19

    const v19, 0x26926fbb

    goto/16 :goto_5

    .line 90
    :sswitch_12
    new-instance v1, Ll/۟᩹ۘ;

    invoke-direct {v1, v8, v11}, Ll/۟᩹ۘ;-><init>(ILjava/lang/Object;)V

    invoke-static {v1}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 478
    :sswitch_13
    invoke-static {v13}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ll/ۧ֨ۘ;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 479
    sget-object v1, Ll/᩷᩹ۘ;->᩹:Ll/֡֨ۘ;

    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_8

    goto/16 :goto_1

    :cond_8
    const-string v1, "\u1a78\u1a75"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x4b

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x3d3d

    const v19, 0xdc3ab78

    xor-int v3, v3, v19

    const v19, 0x2ddcea44

    goto :goto_5

    .line 171
    :sswitch_14
    invoke-static {v9, v8}, Ll/ۗ;->᩶᩺ܶ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v5, :cond_9

    const-string v1, "\u06e1\u1a73"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x5

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x7a4d

    const v19, 0x3895c2d7

    xor-int v3, v3, v19

    const v19, 0x5f4e0273

    goto :goto_5

    :cond_9
    move-object/from16 v1, p1

    goto/16 :goto_7

    .line 470
    :sswitch_15
    array-length v1, v2

    if-ge v10, v1, :cond_a

    const-string v1, "\u05a1\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x7c47

    const v19, 0x2f3d68b0

    xor-int v3, v3, v19

    const v19, -0x66a11e65

    goto :goto_5

    :cond_a
    const-string v1, "\u073f\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x3909

    const v19, 0x6e4a43f6

    xor-int v3, v3, v19

    const v19, -0xd03f2e1

    :goto_5
    xor-int v19, v1, v19

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v1, p1

    .line 171
    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    invoke-static {v9}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v3

    if-lt v3, v6, :cond_b

    const-string v3, "\u1a76\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v17, v3

    mul-int/lit8 v3, v3, -0x35

    xor-int v0, v3, v18

    mul-int/lit16 v0, v0, -0x5a7d

    const v19, -0x69865f50

    xor-int v0, v0, v19

    const v19, -0x30c42145

    xor-int v19, v3, v19

    move v3, v0

    goto/16 :goto_11

    :sswitch_17
    move-object/from16 v1, p1

    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_6
    const-string v0, "\u06d8\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x1f91

    const v19, 0x7f904f96

    xor-int v3, v3, v19

    const v19, -0x36f88d50    # -554795.0f

    goto/16 :goto_10

    :sswitch_18
    move-object/from16 v1, p1

    const/16 v5, 0x7b

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v20, :cond_b

    const-string v0, "\u06e7\u1a7a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x59c1

    const v19, -0x4c779379

    xor-int v3, v3, v19

    const v19, -0x1587d20e

    goto/16 :goto_10

    :cond_b
    :goto_7
    move-object v13, v1

    :goto_8
    const-string v0, "\u1a77\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0xf

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x5803

    const v19, 0x3035f42

    xor-int v3, v3, v19

    const v19, 0x27c81f6e

    goto/16 :goto_10

    :sswitch_19
    move-object/from16 v1, p1

    instance-of v0, v1, Ljava/lang/String;

    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_c

    const-string v3, "\u06e2\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v18

    mul-int/lit16 v4, v4, 0x35a9

    const v20, 0x75514783

    xor-int v4, v4, v20

    const v20, -0x2b308e67

    goto :goto_9

    :cond_c
    const-string v3, "\u06d8\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v18

    mul-int/lit16 v4, v4, 0x251

    const v20, 0x4f116a13    # 2.439648E9f

    xor-int v4, v4, v20

    const v20, -0x30ab6c45

    :goto_9
    xor-int v3, v3, v20

    move/from16 v20, v0

    move/from16 v19, v3

    move v3, v4

    const/16 v4, 0x7d

    goto/16 :goto_11

    :sswitch_1a
    move-object/from16 v1, p1

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v0

    if-gtz v0, :cond_d

    goto/16 :goto_e

    :cond_d
    const-string v0, "\u1a75\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit8 v3, v3, 0x15

    const v19, 0x55640650

    xor-int v3, v3, v19

    const v19, 0x57cec218

    goto/16 :goto_10

    :sswitch_1b
    move-object/from16 v1, p1

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_b

    :cond_e
    const-string v0, "\u06d8\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x49

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x2db7

    const v19, -0x4f6818be

    xor-int v3, v3, v19

    const v19, 0x21f78d98

    goto/16 :goto_10

    :sswitch_1c
    move-object/from16 v1, p1

    .line 478
    sget v0, Ll/֫;->ܶܺ᩻:I

    if-ltz v0, :cond_f

    :goto_a
    const-string v0, "\u05a8\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x1b

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x53e9

    const v19, 0x3c7a0d4d

    xor-int v3, v3, v19

    const v19, -0x66c786ce

    goto/16 :goto_10

    :cond_f
    const-string v0, "\u073a\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x79dd

    const v19, -0x63e35a13

    xor-int v3, v3, v19

    const v19, 0x667c33fc

    goto/16 :goto_10

    :sswitch_1d
    move-object/from16 v1, p1

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v0

    if-eqz v0, :cond_10

    :goto_b
    const-string v0, "\u06d6\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x49cf

    const v19, -0x1348d2b9

    xor-int v3, v3, v19

    const v19, -0x5fd06636

    goto/16 :goto_10

    :cond_10
    const-string v0, "\u073d\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x805

    const v19, 0x7b785650

    xor-int v3, v3, v19

    const v19, 0x292687e5

    goto/16 :goto_10

    :sswitch_1e
    move-object/from16 v1, p1

    .line 475
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v0

    if-eqz v0, :cond_11

    :goto_c
    const-string v0, "\u1a75\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x1f

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x59b1

    const v19, -0x5c2213f3

    xor-int v3, v3, v19

    const v19, 0x1fdc0bb

    goto/16 :goto_10

    :cond_11
    const-string v0, "\u1a77\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x11

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x1987

    const v19, -0x32820f1c

    xor-int v3, v3, v19

    const v19, -0x1003b9d7

    goto/16 :goto_10

    :goto_d
    const-string v0, "\u06db\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x426d

    const v19, -0x5755569c

    xor-int v3, v3, v19

    const v19, 0x4edf2735    # 1.8719443E9f

    goto/16 :goto_10

    :cond_12
    const-string v0, "\u06e4\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x640b

    const v19, -0x50f6ca4c

    xor-int v3, v3, v19

    const v19, -0x7791ef49

    goto :goto_10

    :sswitch_1f
    move-object/from16 v1, p1

    .line 181
    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v0, :cond_13

    :goto_e
    const-string v0, "\u06df\u06df"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x4d

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x34b3

    const v19, 0x698867b3

    xor-int v3, v3, v19

    const v19, 0x38748d3b

    goto :goto_10

    :cond_13
    const-string v0, "\u06df\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x1853

    const v19, 0x75f6f8d3

    xor-int v3, v3, v19

    const v19, 0x49a54830    # 1353990.0f

    goto :goto_10

    :sswitch_20
    move-object/from16 v1, p1

    .line 118
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v0

    if-nez v0, :cond_14

    :goto_f
    const-string v0, "\u1a7a\u06da"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x1c91

    const v19, -0x504378af

    xor-int v3, v3, v19

    const v19, -0x5a32534e

    goto :goto_10

    :cond_14
    const-string v0, "\u05a1\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x7759

    const v19, 0x6289f68a

    xor-int v3, v3, v19

    const v19, 0x4f076f4e

    :goto_10
    xor-int v19, v0, v19

    :goto_11
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d920f9b -> :sswitch_19
        -0x7cd6f301 -> :sswitch_1b
        -0x72f2086c -> :sswitch_17
        -0x72211daa -> :sswitch_1f
        -0x6be670f1 -> :sswitch_16
        -0x6b9efa0b -> :sswitch_13
        -0x663890e8 -> :sswitch_19
        -0x65d65e5d -> :sswitch_1e
        -0x65582ded -> :sswitch_1f
        -0x5f19f4ce -> :sswitch_18
        -0x5cc0d2cd -> :sswitch_6
        -0x5cb81015 -> :sswitch_17
        -0x5ca33549 -> :sswitch_7
        -0x56585769 -> :sswitch_b
        -0x4f5b605f -> :sswitch_d
        -0x42b52b8a -> :sswitch_a
        -0x41feb7c3 -> :sswitch_b
        -0x4196b39d -> :sswitch_18
        -0x2ba6ee3d -> :sswitch_e
        -0x29cf3a74 -> :sswitch_c
        -0x297244b9 -> :sswitch_20
        -0x26ff916e -> :sswitch_a
        -0x26ef78b8 -> :sswitch_0
        -0x259786ed -> :sswitch_15
        -0x2401b0ab -> :sswitch_1c
        -0x20b7791b -> :sswitch_9
        -0x1ef5bee9 -> :sswitch_8
        -0x19ab16f2 -> :sswitch_20
        -0xe3be3d1 -> :sswitch_4
        -0x4c7afca -> :sswitch_9
        -0x379965a -> :sswitch_1c
        -0x75c3d7 -> :sswitch_11
        -0x4bf96 -> :sswitch_12
        0x407f16f -> :sswitch_c
        0x876546d -> :sswitch_8
        0x918480c -> :sswitch_e
        0x960d56c -> :sswitch_15
        0x18227c4b -> :sswitch_7
        0x1d592953 -> :sswitch_6
        0x1fd4da57 -> :sswitch_2
        0x20229853 -> :sswitch_14
        0x22eabc3b -> :sswitch_1
        0x232f368c -> :sswitch_1a
        0x275ce227 -> :sswitch_13
        0x300eaa88 -> :sswitch_10
        0x35b2c88e -> :sswitch_14
        0x3f02fc86 -> :sswitch_2
        0x3fd89c82 -> :sswitch_5
        0x3fd8d4fb -> :sswitch_16
        0x4cfe5db4 -> :sswitch_11
        0x5065f771 -> :sswitch_3
        0x525f8eca -> :sswitch_f
        0x534d239b -> :sswitch_1d
        0x55288d14 -> :sswitch_1a
        0x583937fa -> :sswitch_f
        0x5aa06b89 -> :sswitch_1d
        0x5bdaedbe -> :sswitch_5
        0x5db02c9c -> :sswitch_4
        0x5dcec545 -> :sswitch_1e
        0x5e778df2 -> :sswitch_0
        0x62e910f7 -> :sswitch_12
        0x706e9e68 -> :sswitch_1
        0x7355829b -> :sswitch_10
        0x751305d0 -> :sswitch_1b
        0x758f4a62 -> :sswitch_3
        0x7a4105e8 -> :sswitch_d
    .end sparse-switch
.end method

.method public final ۙ(Ljava/lang/String;)Ll/֡֨ۘ;
    .locals 24

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

    const v15, -0x14e13b4f

    sget v16, Ll/ۖۧ;->ܺۚۖ:I

    sget v17, Ll/֨᩺;->۬᩺ܰ:I

    const-string v18, "\u06d6\u073f"

    invoke-static/range {v18 .. v18}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v18

    add-int v18, v18, v17

    mul-int/lit8 v18, v18, -0x6b

    xor-int v2, v18, v16

    mul-int/lit16 v2, v2, 0x7be7

    const v20, 0x5660d24e

    xor-int v2, v2, v20

    const v20, -0xa3aaa29

    xor-int v18, v18, v20

    const/16 v19, 0x0

    :goto_0
    xor-int v15, v15, v16

    mul-int/lit16 v15, v15, -0x3207

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v2, v15

    xor-int v15, v18, v2

    sparse-switch v15, :sswitch_data_0

    move/from16 v18, v15

    .line 279
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    sget v2, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v2, :cond_0

    move/from16 v18, v15

    goto/16 :goto_d

    :cond_0
    const-string v2, "\u1a77\u06d6"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    mul-int/lit8 v2, v2, 0x29

    move/from16 v18, v15

    xor-int v15, v2, v17

    mul-int/lit16 v15, v15, -0x3033

    const v20, 0x3940f9de

    xor-int v15, v15, v20

    const v20, -0x389848db

    goto/16 :goto_e

    :sswitch_1
    move/from16 v18, v15

    .line 213
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v2, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v2, :cond_f

    :goto_1
    move-object/from16 v20, v8

    move/from16 v21, v9

    goto/16 :goto_7

    :sswitch_2
    move/from16 v18, v15

    .line 50
    sget v2, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v20, v8

    :goto_2
    move/from16 v21, v9

    goto :goto_4

    .line 320
    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    const/4 v1, 0x0

    return-object v1

    :sswitch_4
    move/from16 v18, v15

    .line 272
    new-instance v2, Ll/֡֨ۘ;

    sget-object v15, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    move-object/from16 v20, v8

    sget v21, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v21, :cond_2

    goto :goto_3

    :cond_2
    const/4 v8, 0x7

    .line 254
    sget v22, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v22, :cond_3

    :goto_3
    goto :goto_2

    :cond_3
    move/from16 v21, v9

    const/16 v9, 0x6f

    .line 272
    invoke-static {v15, v9, v8, v14}, Ll/ۖۧ;->᩶ܽܽ([SIII)Ljava/lang/String;

    move-result-object v8

    .line 0
    invoke-static {v8, v1}, Ll/֡ۜᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 161
    sget v9, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v9, :cond_4

    goto :goto_4

    .line 272
    :cond_4
    iget-object v9, v0, Ll/ۧ֨ۘ;->᩺:Ll/ۤ֨ۘ;

    invoke-direct {v2, v0, v1, v8, v9}, Ll/֡֨ۘ;-><init>(Ll/ۧ֨ۘ;Ljava/lang/String;Ljava/lang/String;Ll/ۤ֨ۘ;)V

    .line 273
    new-instance v8, Ljava/lang/ref/SoftReference;

    .line 351
    sget v9, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v9, :cond_5

    :goto_4
    const-string v2, "\u05ab\u06d6"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x7657

    const v9, -0x799b29cb

    xor-int/2addr v8, v9

    const v9, 0xb0b7c92

    goto/16 :goto_b

    .line 273
    :cond_5
    invoke-direct {v8, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 274
    invoke-virtual {v4, v1, v8}, Ll/۫۠;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v7, v2

    goto :goto_5

    :sswitch_5
    return-object v7

    :sswitch_6
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    .line 269
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡֨ۘ;

    goto :goto_6

    :sswitch_7
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    if-nez v6, :cond_6

    const-string v2, "\u0733\u06d8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v16

    mul-int/lit8 v2, v2, 0x21

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, 0x4491

    const v9, 0x65744514

    xor-int/2addr v8, v9

    const v9, 0x531b64d6

    goto/16 :goto_b

    :cond_6
    move-object v7, v6

    :goto_5
    const-string v2, "\u1a74\u1a76"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, 0x34f3

    const v9, -0x70526913

    xor-int/2addr v8, v9

    const v9, -0x727684b4

    goto/16 :goto_b

    :sswitch_8
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    .line 369
    iget-object v4, v0, Ll/ۧ֨ۘ;->ۙ:Ll/۫۠;

    const/4 v2, 0x0

    invoke-virtual {v4, v1, v2}, Ll/۫۠;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 266
    check-cast v5, Ljava/lang/ref/Reference;

    if-eqz v5, :cond_7

    const-string v2, "\u1a73\u0730"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x25ed

    const v9, -0x7b42f425

    xor-int/2addr v8, v9

    const v9, -0x1be8d55b

    goto/16 :goto_b

    :cond_7
    :goto_6
    move-object v6, v2

    const-string v2, "\u1a73\u1a74"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x3d6b

    const v9, 0x2fa94b91

    xor-int/2addr v8, v9

    const v9, -0x612cc4f2

    goto/16 :goto_b

    :sswitch_9
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    .line 76
    iput-object v3, v0, Ll/ۧ֨ۘ;->ۘ:Ll/ۛ֨ۘ;

    .line 77
    new-instance v2, Ll/ܿ֨ۘ;

    invoke-direct {v2, v0}, Ll/ܿ֨ۘ;-><init>(Ll/ۧ֨ۘ;)V

    iput-object v2, v0, Ll/ۧ֨ۘ;->᩺:Ll/ۤ֨ۘ;

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    .line 76
    invoke-static/range {v19 .. v19}, Ll/ۨ᩹ۘ;->ۙ(Ll/ۨ᩹ۘ;)Ll/ۗۚۘ;

    move-result-object v3

    sget v2, Ll/֨ۧ;->֫۠֡:I

    if-gtz v2, :cond_8

    :goto_7
    const-string v2, "\u06ec\u1a73"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x59

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, 0x6b21

    const v9, 0x1a202282

    xor-int/2addr v8, v9

    const v9, -0x7d1b1207

    goto/16 :goto_b

    :cond_8
    const-string v2, "\u073f\u05a1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x13

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x47db

    const v9, -0x7a6563e4

    xor-int/2addr v8, v9

    const v9, -0x575d872

    goto/16 :goto_b

    :sswitch_b
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    iget-object v2, v0, Ll/ۧ֨ۘ;->ۜ:Ll/ܳۡۘ;

    iget-object v2, v2, Ll/ܳۡۘ;->ܺ:Ljava/lang/Object;

    move-object/from16 v19, v2

    check-cast v19, Ll/ۨ᩹ۘ;

    .line 92
    sget v2, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v2, :cond_9

    goto/16 :goto_a

    :cond_9
    const-string v2, "\u1a7a\u06d6"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x3a3b

    const v9, -0x78fcbeb0

    xor-int/2addr v8, v9

    const v9, -0x4acdb2c0

    goto/16 :goto_b

    :sswitch_c
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    .line 74
    iget-object v2, v0, Ll/ۧ֨ۘ;->ۘ:Ll/ۛ֨ۘ;

    if-eqz v2, :cond_a

    :goto_8
    const-string v2, "\u1a7b\u05a8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, 0x3699

    const v9, 0xad827b8

    xor-int/2addr v8, v9

    const v9, -0x4905e643

    goto/16 :goto_b

    :cond_a
    const-string v2, "\u1a73\u06ec"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x5f

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x56ad

    const v9, 0x6476090a

    xor-int/2addr v8, v9

    const v9, 0x3dfec602

    goto/16 :goto_b

    :sswitch_d
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    const v2, 0x8666

    const v14, 0x8666

    goto :goto_9

    :sswitch_e
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    const/16 v2, 0x1916    # 8.999E-42f

    const/16 v14, 0x1916    # 8.999E-42f

    :goto_9
    const-string v2, "\u06db\u06e1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    mul-int/lit8 v2, v2, 0x67

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x47f5

    const v9, -0x330ac881

    xor-int/2addr v8, v9

    const v9, -0x57b45948

    goto/16 :goto_b

    :sswitch_f
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    mul-int v2, v13, v13

    sub-int/2addr v2, v12

    if-gez v2, :cond_b

    const-string v2, "\u06d7\u0730"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0xef1

    const v9, 0x7ce8215d

    xor-int/2addr v8, v9

    const v9, -0x36eb6dd2

    goto/16 :goto_b

    :cond_b
    const-string v2, "\u1a78\u06eb"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x33a5

    const v9, -0x196b3ea6

    xor-int/2addr v8, v9

    const v9, 0x32bab776

    goto :goto_b

    :sswitch_10
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    mul-int v12, v10, v11

    add-int/lit16 v13, v10, 0x1035

    .line 214
    sget v2, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v2, :cond_c

    goto :goto_a

    :cond_c
    const-string v2, "\u0733\u06eb"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x69

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x3b63

    const v9, -0x1103d2c8

    xor-int/2addr v8, v9

    const v9, -0x51261286

    goto :goto_b

    :sswitch_11
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    aget-short v10, v20, v21

    const/16 v11, 0x40d4

    .line 190
    sget v2, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v2, :cond_d

    :goto_a
    const-string v2, "\u06e2\u0736"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x57

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, 0x7307

    const v9, -0x75106b05

    xor-int/2addr v8, v9

    const v9, -0x5677b989

    goto :goto_b

    :cond_d
    const-string v2, "\u06da\u1a7a"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v16, v2

    mul-int/lit8 v2, v2, 0x1f

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x20cd

    const v9, 0x145f4762

    xor-int/2addr v8, v9

    const v9, -0x2a37a125

    :goto_b
    xor-int/2addr v2, v9

    move/from16 v15, v18

    move/from16 v9, v21

    goto :goto_c

    :sswitch_12
    move-object/from16 v20, v8

    move/from16 v18, v15

    const/16 v9, 0x6e

    .line 318
    sget-boolean v2, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v2, :cond_e

    move-object/from16 v8, v20

    goto :goto_d

    :cond_e
    const-string v2, "\u1a75\u06e2"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    mul-int/lit8 v2, v2, -0x5f

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x700f

    const v15, -0x1d570e20

    xor-int/2addr v8, v15

    const v15, -0x426861e4

    xor-int/2addr v2, v15

    move/from16 v15, v18

    :goto_c
    move/from16 v18, v2

    move v2, v8

    move-object/from16 v8, v20

    goto/16 :goto_0

    :sswitch_13
    move/from16 v21, v9

    move/from16 v18, v15

    sget-object v8, Ll/ۧ֨ۘ;->᩹ۢۜ:[S

    sget v2, Ll/֨ۧ;->֫۠֡:I

    if-gtz v2, :cond_10

    move/from16 v9, v21

    :cond_f
    :goto_d
    const-string v2, "\u1a74\u1a78"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    mul-int/lit8 v2, v2, 0x47

    xor-int v15, v2, v17

    mul-int/lit16 v15, v15, 0x4123

    const v20, 0x2af09fdb

    xor-int v15, v15, v20

    const v20, 0x3582141a

    :goto_e
    xor-int v2, v2, v20

    move/from16 v23, v18

    move/from16 v18, v2

    move v2, v15

    move/from16 v15, v23

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u1a79\u06dc"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, -0x7b

    xor-int v9, v2, v16

    mul-int/lit16 v9, v9, 0x107

    const v15, -0x2b93c525

    xor-int/2addr v9, v15

    const v15, -0x9deda23

    xor-int/2addr v2, v15

    move/from16 v15, v18

    move/from16 v18, v2

    move v2, v9

    move/from16 v9, v21

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x796a735a -> :sswitch_6
        -0x73fa618f -> :sswitch_13
        -0x73a47900 -> :sswitch_c
        -0x6bdae8aa -> :sswitch_6
        -0x6901c5e3 -> :sswitch_7
        -0x684a7fd7 -> :sswitch_c
        -0x58e4c858 -> :sswitch_4
        -0x572efc82 -> :sswitch_12
        -0x5477d072 -> :sswitch_12
        -0x503d851b -> :sswitch_1
        -0x46dab007 -> :sswitch_d
        -0x3aff8fce -> :sswitch_a
        -0x3937da22 -> :sswitch_8
        -0x31dbaf9c -> :sswitch_f
        -0x2e6b9ecc -> :sswitch_9
        -0x2ab8c9c6 -> :sswitch_0
        -0x207bed7e -> :sswitch_9
        -0x1f336921 -> :sswitch_11
        -0x18e67a81 -> :sswitch_e
        -0x1227c279 -> :sswitch_d
        -0xa78fcb6 -> :sswitch_a
        -0x6e6b20b -> :sswitch_3
        0x7850397 -> :sswitch_8
        0x88b95bb -> :sswitch_5
        0x2574ef85 -> :sswitch_4
        0x2870017c -> :sswitch_2
        0x29b4a638 -> :sswitch_e
        0x2aed9116 -> :sswitch_11
        0x3020f595 -> :sswitch_0
        0x34ec6f9c -> :sswitch_b
        0x39ed7172 -> :sswitch_3
        0x3edc6d73 -> :sswitch_2
        0x3f6c515c -> :sswitch_1
        0x40053a08 -> :sswitch_13
        0x401ab769 -> :sswitch_10
        0x4b707c15 -> :sswitch_7
        0x53ad0fd3 -> :sswitch_10
        0x582a3cb4 -> :sswitch_5
        0x715b7f6c -> :sswitch_f
        0x7a689ccf -> :sswitch_b
    .end sparse-switch
.end method

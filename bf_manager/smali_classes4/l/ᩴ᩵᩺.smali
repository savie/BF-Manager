.class public final Ll/ᩴ᩵᩺;
.super Ljava/lang/Object;
.source "44LP"


# static fields
.field private static final ۢۚ۬:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x60

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴ᩵᩺;->ۢۚ۬:[S

    return-void

    :array_0
    .array-data 2
        0x1ab4s
        -0x616as
        0x5153s
        0x5187s
        0x62cs
        0x60fs
        0x620s
        0x637s
        0x603s
        0x634s
        0x635s
        0x635s
        0x62es
        0x62fs
        0x617s
        0x628s
        0x624s
        0x636s
        0x62fs
        0x634s
        0x62ds
        0x62ds
        0x661s
        0x622s
        0x620s
        0x62fs
        0x62fs
        0x62es
        0x635s
        0x661s
        0x623s
        0x624s
        0x661s
        0x622s
        0x620s
        0x632s
        0x635s
        0x661s
        0x635s
        0x62es
        0x661s
        0x62fs
        0x62es
        0x62fs
        0x66cs
        0x62fs
        0x634s
        0x62ds
        0x62ds
        0x661s
        0x635s
        0x638s
        0x631s
        0x624s
        0x661s
        0x620s
        0x62fs
        0x625s
        0x633s
        0x62es
        0x628s
        0x625s
        0x66fs
        0x637s
        0x628s
        0x624s
        0x636s
        0x66fs
        0x617s
        0x628s
        0x624s
        0x636s
        0x633s
        0x62es
        0x635s
        0x620s
        0x635s
        0x628s
        0x62es
        0x62fs
        0x632s
        0x624s
        0x635s
        0x605s
        0x634s
        0x633s
        0x620s
        0x635s
        0x628s
        0x62es
        0x62fs
        0x669s
        0x66fs
        0x66fs
        0x66fs
        0x668s
    .end array-data
.end method

.method public static final ۙ(Ll/۫ܶۘ;)V
    .locals 27

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v19, 0x4296a954

    sget v20, Ll/۟;->ۨᩴۛ:I

    sget v21, Ll/ۖۗ;->᩶۫ۗ:I

    const-string v22, "\u1a74\u06e4"

    invoke-static/range {v22 .. v22}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v22

    sub-int v22, v20, v22

    mul-int/lit8 v22, v22, -0x73

    xor-int v0, v22, v21

    mul-int/lit16 v0, v0, 0x4975

    const v24, -0x52e9dd54

    xor-int v0, v0, v24

    const v24, -0x656c5fb6

    xor-int v22, v22, v24

    move-object v5, v4

    move-object v12, v11

    move-object v14, v13

    move-object/from16 v8, v16

    move/from16 v23, v22

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v22, 0x4296a954

    const/16 v24, 0x0

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v10, v22, v21

    mul-int/lit16 v10, v10, -0x2cdf

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v0, v10

    xor-int v22, v23, v0

    sparse-switch v22, :sswitch_data_0

    .line 306
    invoke-static {v14, v15, v7, v11}, Ll/֨ܶ;->ۢ֡᩷([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v3}, Ll/ۧ;->۟ܿܽ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    move-object v10, v2

    move-object/from16 v23, v3

    const-wide/16 v2, 0x3e8

    .line 307
    invoke-static {v0, v2, v3}, Ll/ۗ;->۫֫ۨ(Ljava/lang/Object;J)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 117
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v0

    if-eqz v0, :cond_9

    move-object/from16 v2, p0

    goto/16 :goto_f

    .line 80
    :sswitch_0
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    sget v0, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v0, :cond_1

    :cond_0
    :goto_1
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    goto/16 :goto_11

    :cond_1
    move-object v10, v2

    move-object/from16 v23, v3

    goto/16 :goto_5

    .line 101
    :sswitch_1
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v0, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "\u1a78\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x71

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, -0x7a1b

    const v23, -0x34cd4d52    # -1.171115E7f

    xor-int v10, v10, v23

    const v23, -0x756f0148

    goto/16 :goto_4

    .line 192
    :sswitch_2
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    sget v0, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v0, :cond_0

    goto :goto_2

    :sswitch_3
    sget v0, Ll/۟;->ۨᩴۛ:I

    if-ltz v0, :cond_4

    :cond_3
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    goto/16 :goto_c

    :cond_4
    :goto_2
    const-string v0, "\u06d8\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x5

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, 0xa61

    const v23, 0x4d85c197    # 2.805071E8f

    xor-int v10, v10, v23

    const v23, 0x20c8090c

    goto/16 :goto_4

    :sswitch_4
    sget v0, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez v0, :cond_5

    goto/16 :goto_3

    :cond_5
    move-object v10, v2

    goto/16 :goto_7

    .line 261
    :sswitch_5
    sget v0, Ll/ۗ;->֨۬ۖ:I

    if-gez v0, :cond_6

    goto :goto_3

    :cond_6
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    goto/16 :goto_10

    .line 219
    :sswitch_6
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v0, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v0, :cond_3

    goto :goto_3

    .line 236
    :sswitch_7
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    goto :goto_3

    .line 241
    :sswitch_8
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    return-void

    .line 308
    :sswitch_9
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v4, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 309
    invoke-static {v4}, Ll/֫ۚ;->ۖۘ۫(Ljava/lang/Object;)V

    move-object v10, v2

    move-object/from16 v23, v3

    goto/16 :goto_a

    .line 307
    :sswitch_a
    invoke-static {v8, v9, v6, v11}, Ll/֫ۘ;->ۜۖܺ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ll/֫ܽ;->ܺ᩵ۙ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    sget v0, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v0, :cond_7

    goto/16 :goto_1

    :cond_7
    const-string v0, "\u06dc\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x3d

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, -0x93d

    const v23, -0x5381b3db

    xor-int v10, v10, v23

    const v23, 0x3a7c9344

    goto :goto_4

    .line 307
    :sswitch_b
    sget-object v8, Ll/ᩴ᩵᩺;->ۢۚ۬:[S

    const/16 v9, 0x50

    const/16 v6, 0x10

    .line 222
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_3
    const-string v0, "\u06d7\u073a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, -0x47

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, 0x7c53

    const v23, 0x271156c0

    xor-int v10, v10, v23

    const v23, -0x60431e1a    # -7.9994815E-20f

    goto :goto_4

    :cond_8
    const-string v0, "\u1a76\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0xb

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, 0x3ea5

    const v23, 0xd89809f

    xor-int v10, v10, v23

    const v23, -0x22283817

    :goto_4
    xor-int v23, v0, v23

    move v0, v10

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06d8\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, 0x5565

    const v3, 0x2d59fc50

    xor-int/2addr v2, v3

    const v3, 0x19a2d32

    goto :goto_6

    :sswitch_c
    move-object v10, v2

    move-object/from16 v23, v3

    const/16 v15, 0x48

    const/16 v7, 0x8

    .line 240
    sget v0, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v0, :cond_a

    :goto_5
    const-string v0, "\u1a76\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x53

    xor-int v2, v0, v21

    mul-int/lit16 v2, v2, -0x42f1

    const v3, -0x6323c944

    xor-int/2addr v2, v3

    const v3, -0x6a08d7ef

    goto :goto_6

    :cond_a
    const-string v0, "\u06dc\u1a7b"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v2, v0, v21

    mul-int/lit16 v2, v2, -0x2779

    const v3, 0x41baf17c

    xor-int/2addr v2, v3

    const v3, -0x5736cd53

    :goto_6
    xor-int/2addr v0, v3

    move-object/from16 v3, v23

    move/from16 v23, v0

    goto :goto_9

    :sswitch_d
    move-object v10, v2

    const/16 v0, 0xd

    new-array v3, v0, [F

    .line 306
    fill-array-data v3, :array_0

    sget-object v14, Ll/ᩴ᩵᩺;->ۢۚ۬:[S

    .line 203
    sget v0, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v0, :cond_b

    :goto_7
    const-string v0, "\u1a76\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, -0x4269

    const v23, -0x4fe18651

    xor-int v2, v2, v23

    const v23, 0x3661e446

    goto :goto_8

    :cond_b
    const-string v0, "\u06e2\u1a75"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, -0x159b

    const v23, -0x1e59628f

    xor-int v2, v2, v23

    const v23, 0x54705bda

    :goto_8
    xor-int v23, v0, v23

    :goto_9
    move v0, v2

    move-object v2, v10

    goto/16 :goto_0

    :sswitch_e
    move-object v10, v2

    move-object/from16 v23, v3

    .line 299
    :try_start_0
    const-class v0, Ll/ۜᩴ;

    sget-object v2, Ll/ᩴ᩵᩺;->ۢۚ۬:[S
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x4

    move-object/from16 v25, v4

    const/16 v4, 0xe

    :try_start_1
    invoke-static {v2, v3, v4, v11}, Ll/֡۠;->֨ۛ֨([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v2, 0x1

    .line 300
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 301
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ll/ᩴ᩵᩺;->ۢۚ۬:[S

    const/16 v3, 0x12

    const/16 v4, 0x36

    invoke-static {v2, v3, v4, v11}, Ll/֨ܶ;->ۢ֡᩷([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ܰ֡۠;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-string v2, "\u073d\u06ec"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v3, v2, v21

    mul-int/lit16 v3, v3, 0x498b

    const v4, 0x4e1d043c    # 6.585751E8f

    xor-int/2addr v3, v4

    const v4, -0xb963261

    xor-int/2addr v2, v4

    move-object/from16 v4, v25

    move/from16 v26, v2

    move-object v2, v0

    move v0, v3

    move-object/from16 v3, v23

    move/from16 v23, v26

    goto/16 :goto_0

    :catch_0
    :goto_a
    move-object/from16 v25, v4

    :catch_1
    move-object/from16 v2, p0

    goto :goto_b

    :sswitch_f
    return-void

    :sswitch_10
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    .line 2
    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7d42a378

    xor-int/2addr v0, v1

    move-object/from16 v2, p0

    .line 295
    invoke-virtual {v2, v0}, Ll/ۤۚ;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۜᩴ;

    if-eqz v1, :cond_c

    const-string v0, "\u06e8\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x1f

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, 0x2e5

    const v4, -0x4cd1d662

    xor-int/2addr v3, v4

    const v4, -0x4cd97840

    goto/16 :goto_12

    :cond_c
    :goto_b
    const-string v0, "\u05a8\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x27

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, 0x6ca1

    const v4, -0x3d687178

    xor-int/2addr v3, v4

    const v4, -0x120bcbb3

    goto/16 :goto_12

    :sswitch_11
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    const/4 v0, 0x3

    .line 2
    invoke-static {v12, v13, v0, v11}, Ll/֫ۛ;->ۖۖۜ([SIII)Ljava/lang/String;

    move-result-object v5

    .line 236
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v0

    if-eqz v0, :cond_d

    :goto_c
    const-string v0, "\u05a1\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x33

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, 0x7bd7

    const v4, 0x76670837

    xor-int/2addr v3, v4

    const v4, -0x1fd71b68

    goto/16 :goto_12

    :cond_d
    const-string v0, "\u05ab\u073d"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, -0x3d

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, 0x4ecd

    const v4, 0x79742baf

    xor-int/2addr v3, v4

    const v4, 0x768dcd17

    goto/16 :goto_12

    :sswitch_12
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    .line 2
    sget v0, Ll/᩵᩵᩺;->ۛ:I

    sget-object v12, Ll/ᩴ᩵᩺;->ۢۚ۬:[S

    const/4 v13, 0x1

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v0

    if-gtz v0, :cond_e

    goto/16 :goto_e

    :cond_e
    const-string v0, "\u06da\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, 0x4b7f

    const v4, 0x148a66f

    xor-int/2addr v3, v4

    const v4, 0x5294eda3

    goto/16 :goto_12

    :sswitch_13
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    const v0, 0x9f19

    const v11, 0x9f19

    goto :goto_d

    :sswitch_14
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    const/16 v0, 0x641

    const/16 v11, 0x641

    :goto_d
    const-string v0, "\u0730\u073a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, -0x3b4f

    const v4, 0x48ac4ddd

    xor-int/2addr v3, v4

    const v4, 0x77e065f8

    goto/16 :goto_12

    :sswitch_15
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    add-int v0, v19, v24

    mul-int v0, v0, v0

    sub-int v0, v18, v0

    if-ltz v0, :cond_f

    const-string v0, "\u05a1\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x7b

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, -0x6a99

    const v4, -0x153e98d

    xor-int/2addr v3, v4

    const v4, 0x5e5f9da8

    goto/16 :goto_12

    :cond_f
    const-string v0, "\u0733\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x71

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, -0x5275

    const v4, 0xc3f0e3d

    xor-int/2addr v3, v4

    const v4, -0x38a8dd6b

    goto/16 :goto_12

    :sswitch_16
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    add-int v0, v16, v17

    add-int v18, v0, v0

    const/16 v24, 0x2ae

    .line 10
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v0

    if-eqz v0, :cond_10

    :goto_e
    move-object/from16 v4, v25

    :goto_f
    const-string v0, "\u0730\u06e4"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, 0xf3

    const v25, -0x6253ed17

    xor-int v3, v3, v25

    const v25, -0x1e62ec15

    xor-int v0, v0, v25

    move-object v2, v10

    goto/16 :goto_13

    :cond_10
    const-string v0, "\u06e4\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, -0x3e99

    const v4, 0x170359ec

    xor-int/2addr v3, v4

    const v4, 0x13eab67

    goto/16 :goto_12

    :sswitch_17
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    mul-int v16, v19, v19

    const v17, 0x72e44

    .line 8
    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_11

    :goto_10
    const-string v0, "\u06d6\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x43

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, 0x7e3f

    const v4, -0x57860d26

    xor-int/2addr v3, v4

    const v4, -0xa8e61b3

    goto :goto_12

    :cond_11
    const-string v0, "\u06d7\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, 0x3b87

    const v4, 0x76f94989

    xor-int/2addr v3, v4

    const v4, -0x30976dda

    goto :goto_12

    :sswitch_18
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    sget-object v0, Ll/ᩴ᩵᩺;->ۢۚ۬:[S

    const/4 v3, 0x0

    aget-short v19, v0, v3

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v0

    if-ltz v0, :cond_12

    :goto_11
    const-string v0, "\u06d8\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, -0x7bed

    const v4, 0x13f59b77    # 6.1999995E-27f

    xor-int/2addr v3, v4

    const v4, -0x48a85ad3

    goto :goto_12

    :cond_12
    const-string v0, "\u05ab\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, -0x5a79

    const v4, -0x6b01c12b

    xor-int/2addr v3, v4

    const v4, -0x1eeb6559

    :goto_12
    xor-int/2addr v0, v4

    move-object v2, v10

    move-object/from16 v4, v25

    :goto_13
    move-object/from16 v26, v23

    move/from16 v23, v0

    move v0, v3

    move-object/from16 v3, v26

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x73ee88af -> :sswitch_3
        -0x730d6a07 -> :sswitch_18
        -0x70e758d0 -> :sswitch_5
        -0x6fb9f4ae -> :sswitch_a
        -0x6d089873 -> :sswitch_11
        -0x6bec1a9a -> :sswitch_c
        -0x5da96597 -> :sswitch_a
        -0x5bc6c023 -> :sswitch_e
        -0x4f3179a0 -> :sswitch_10
        -0x4be670cd -> :sswitch_8
        -0x487c2d63 -> :sswitch_12
        -0x3e065a6c -> :sswitch_b
        -0x3de8141a -> :sswitch_d
        -0x3955b4c4 -> :sswitch_15
        -0x34a5ddc4 -> :sswitch_15
        -0x31a16cc9 -> :sswitch_14
        -0x247cd263 -> :sswitch_11
        -0x19eaf0e7 -> :sswitch_2
        -0x16ba7d96 -> :sswitch_12
        -0x125d0735 -> :sswitch_9
        -0xd203068 -> :sswitch_6
        -0xa64f8b0 -> :sswitch_1
        -0x9fe0414 -> :sswitch_5
        0x50c1de0 -> :sswitch_16
        0x73547ec -> :sswitch_e
        0x96e69d4 -> :sswitch_4
        0x1fb7c70e -> :sswitch_9
        0x21777d58 -> :sswitch_17
        0x299d460d -> :sswitch_13
        0x2bf9a370 -> :sswitch_0
        0x2cce07c6 -> :sswitch_4
        0x3187d694 -> :sswitch_14
        0x332ecb05 -> :sswitch_0
        0x335436e8 -> :sswitch_c
        0x3890b964 -> :sswitch_f
        0x38f6183d -> :sswitch_17
        0x39862eec -> :sswitch_7
        0x3ba56b5e -> :sswitch_1
        0x3e0d7fff -> :sswitch_d
        0x41d5ce6a -> :sswitch_8
        0x4b688484 -> :sswitch_6
        0x4c762b7d -> :sswitch_7
        0x5c3e63d9 -> :sswitch_18
        0x601fd65f -> :sswitch_2
        0x661298f7 -> :sswitch_10
        0x69820a76 -> :sswitch_16
        0x6e07961b -> :sswitch_13
        0x70d827ea -> :sswitch_f
        0x77341ae0 -> :sswitch_3
        0x7d08bdc9 -> :sswitch_b
    .end sparse-switch

    :array_0
    .array-data 4
        0x0
        -0x3da40000    # -55.0f
        0x0
        0x425c0000    # 55.0f
        0x0
        -0x3dcc0000    # -45.0f
        0x0
        0x42340000    # 45.0f
        0x0
        -0x3df40000    # -35.0f
        0x0
        0x420c0000    # 35.0f
        0x0
    .end array-data
.end method

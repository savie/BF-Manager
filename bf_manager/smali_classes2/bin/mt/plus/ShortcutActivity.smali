.class public Lbin/mt/plus/ShortcutActivity;
.super Ll/ۙ᩶ۘ;
.source "ShortcutActivity.java"


# static fields
.field public static final ۠ۙ:Ll/᩷۠ۚ;

.field public static ᩵ۙ:Ljava/lang/Boolean;

.field private static final ᩵᩸ۢ:[S


# direct methods
.method public static constructor <clinit>()V
    .locals 20

    const/16 v0, 0x1e6

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/4 v0, 0x0

    const/4 v1, 0x0

    sget v2, Ll/ۧ;->֫۠ᩴ:I

    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    const-string v4, "\u06d9\u06e2"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5303

    const v6, -0x3f43e529

    xor-int/2addr v5, v6

    const v6, 0x4b1c244e    # 1.023291E7f

    xor-int/2addr v4, v6

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

    const v17, 0x4f3ce08e

    const/4 v8, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    :goto_0
    xor-int v12, v17, v2

    mul-int/lit16 v12, v12, 0x53ed

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v5, v12

    xor-int v17, v4, v5

    sparse-switch v17, :sswitch_data_0

    const/4 v15, 0x1

    .line 283
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v4

    if-eqz v4, :cond_d

    goto/16 :goto_7

    :sswitch_0
    mul-int v4, v13, v13

    sub-int/2addr v4, v11

    if-lez v4, :cond_0

    const-string v4, "\u1a78\u1a77"

    .line 281
    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7a21

    const v12, -0x6be2096a

    xor-int/2addr v5, v12

    const v12, 0x15489006

    goto/16 :goto_8

    :cond_0
    const-string v4, "\u06ec\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3621

    const v12, -0x47340cc1

    xor-int/2addr v5, v12

    const v12, -0x66e97e9c

    goto/16 :goto_8

    .line 284
    :sswitch_1
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v4, "\u1a75\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1e8d

    const v12, -0x549c085a

    xor-int/2addr v5, v12

    const v12, -0x38b059f2

    goto/16 :goto_8

    :sswitch_2
    const/16 v4, 0x78b5

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 280
    :sswitch_4
    invoke-static {v1, v15, v8, v14}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Ll/֨ܶ;->ۡۚܿ(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩷۠ۚ;

    move-result-object v0

    sput-object v0, Lbin/mt/plus/ShortcutActivity;->۠ۙ:Ll/᩷۠ۚ;

    return-void

    :sswitch_5
    sget-object v6, Ll/ۨ᩵ۚ;->ۚ:Ll/᩷۠ۚ;

    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    .line 281
    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06df\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x22c9

    const v12, 0x28a934fc

    xor-int/2addr v5, v12

    const v12, 0x3cd86f33

    goto/16 :goto_8

    .line 284
    :sswitch_6
    sget-object v0, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/4 v7, 0x0

    sget v4, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v4, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v4, "\u06e7\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4d0d

    const v12, 0x52c90b6d

    xor-int/2addr v5, v12

    const v12, 0x9483c72

    goto/16 :goto_8

    .line 281
    :sswitch_7
    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v4, :cond_5

    goto/16 :goto_5

    :sswitch_8
    const/16 v4, 0x43cb

    :goto_1
    const-string v5, "\u1a74\u073d"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v2, v5

    mul-int/lit8 v5, v5, -0x5

    xor-int v12, v5, v3

    mul-int/lit16 v12, v12, 0x1265

    const v14, -0x4c29044b

    xor-int/2addr v12, v14

    const v14, 0x8a9dd8e

    move v14, v4

    move v4, v5

    move v5, v12

    const v12, 0x8a9dd8e

    goto/16 :goto_8

    :sswitch_9
    add-int v11, v10, v10

    const/16 v12, 0x266d

    .line 283
    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u1a74\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4bcb

    const v18, -0x628dd457

    xor-int v5, v5, v18

    const v18, -0x27307aea

    const v12, -0x27307aea

    const/16 v18, 0x266d

    goto/16 :goto_8

    .line 281
    :sswitch_a
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v4

    if-nez v4, :cond_a

    :cond_5
    move/from16 v12, v18

    :goto_2
    const-string v4, "\u06df\u06d6"

    .line 283
    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2087

    const v18, -0x4166ea73

    xor-int v5, v5, v18

    const v18, 0x3e85b008

    move/from16 v18, v12

    const v12, 0x3e85b008

    goto/16 :goto_8

    :sswitch_b
    const/16 v8, 0x9

    .line 284
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v4

    if-eqz v4, :cond_6

    move/from16 v8, v16

    const/16 v4, 0x9

    goto/16 :goto_6

    :cond_6
    const-string v4, "\u1a73\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7b75

    const v12, -0x18c15e84

    xor-int/2addr v5, v12

    const v12, -0x751f3b92

    goto/16 :goto_8

    :sswitch_c
    aget-short v4, v0, v7

    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_7

    move/from16 v19, v8

    move v8, v4

    move/from16 v4, v19

    goto/16 :goto_6

    :cond_7
    const-string v5, "\u06e2\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0xb

    xor-int v12, v5, v2

    mul-int/lit16 v12, v12, 0x43cd

    const v16, -0x5003d4fc

    xor-int v12, v12, v16

    const v16, 0x3e5469b2

    move/from16 v16, v4

    move v4, v5

    move v5, v12

    const v12, 0x3e5469b2

    goto/16 :goto_8

    :sswitch_d
    const v4, 0x5c48a69

    add-int v10, v9, v4

    .line 281
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v4

    if-gtz v4, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v4, "\u06ec\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x165f

    const v12, -0x68de8f04

    xor-int/2addr v5, v12

    const v12, -0x412549d9

    goto/16 :goto_8

    :sswitch_e
    add-int v13, v16, v18

    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "\u06eb\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2d9d

    const v12, -0x21c914de

    xor-int/2addr v5, v12

    const v12, -0x178ef6be

    goto/16 :goto_8

    :sswitch_f
    mul-int v9, v16, v16

    .line 284
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u1a79\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3381

    const v12, 0x2c17877

    xor-int/2addr v5, v12

    const v12, 0x530e8976

    goto/16 :goto_8

    :cond_b
    const-string v4, "\u06ec\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2f79

    const v12, 0x54032b38

    xor-int/2addr v5, v12

    const v12, 0x521df365

    goto :goto_8

    .line 281
    :sswitch_10
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    goto :goto_4

    :sswitch_11
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget-boolean v4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v4, :cond_c

    :goto_4
    const-string v4, "\u06e2\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5e0f

    const v12, -0x127504d7

    xor-int/2addr v5, v12

    const v12, 0x456b9c71

    goto :goto_8

    :cond_c
    :goto_5
    move v4, v8

    move/from16 v8, v16

    :goto_6
    const-string v5, "\u06e7\u0730"

    .line 284
    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x79

    xor-int v12, v5, v2

    mul-int/lit16 v12, v12, -0x6531

    const v16, 0x295331af

    xor-int v12, v12, v16

    const v16, 0x212af800

    move/from16 v16, v8

    move v8, v4

    move v4, v5

    move v5, v12

    const v12, 0x212af800

    goto :goto_8

    :goto_7
    const-string v4, "\u1a73\u06ec"

    .line 281
    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5abd

    const v12, 0x239467d1

    xor-int/2addr v5, v12

    const v12, -0x10c5eaa2

    goto :goto_8

    :cond_d
    const-string v4, "\u06e0\u06eb"

    .line 284
    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4e93

    const v12, -0x769aad5b

    xor-int/2addr v5, v12

    const v12, -0x1119f6c0

    :goto_8
    xor-int/2addr v4, v12

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e7e684c -> :sswitch_11
        -0x7b52dadc -> :sswitch_10
        -0x6f8719d3 -> :sswitch_f
        -0x6e10fb85 -> :sswitch_e
        -0x4ba2c7ef -> :sswitch_d
        -0x47e95313 -> :sswitch_c
        -0x479fcdfb -> :sswitch_f
        -0x431cb731 -> :sswitch_b
        -0x42c34dfd -> :sswitch_a
        -0x337c0c20 -> :sswitch_9
        -0x31fd4117 -> :sswitch_8
        -0x2463437d -> :sswitch_8
        -0x2425fe82 -> :sswitch_7
        -0x1fb165f8 -> :sswitch_d
        -0x1f1197b9 -> :sswitch_6
        -0x1dff1a49 -> :sswitch_5
        -0xecb31b3 -> :sswitch_4
        -0xc818f44 -> :sswitch_4
        -0xc28b1bf -> :sswitch_11
        -0x590436c -> :sswitch_3
        0x926e1a7 -> :sswitch_2
        0x14848982 -> :sswitch_1
        0x181e2dc8 -> :sswitch_9
        0x1a2e1c53 -> :sswitch_c
        0x1a41a5b6 -> :sswitch_6
        0x1abd7b91 -> :sswitch_0
        0x1bdafc3b -> :sswitch_10
        0x319e4e6b -> :sswitch_0
        0x33bdc685 -> :sswitch_7
        0x37d38cf3 -> :sswitch_1
        0x4c5ee7d8 -> :sswitch_5
        0x5066870c -> :sswitch_a
        0x55a2647e -> :sswitch_b
        0x67c83702 -> :sswitch_e
        0x6b3b5754 -> :sswitch_2
        0x6eb90eec -> :sswitch_3
    .end sparse-switch

    :array_0
    .array-data 2
        0x150fs
        0x78c6s
        0x78dds
        0x78das
        0x78c7s
        0x78c1s
        0x78d6s
        0x78c0s
        0x78c1s
        0x78c6s
        0x20e0s
        0x2db3s
        -0x2f11s
        -0x1a07s
        -0x4f9es
        -0x4f87s
        -0x4f87s
        -0x4f86s
        -0x4fc5s
        -0x4f87s
        -0x4f9as
        -0x4f8ds
        -0x4f9cs
        -0x4f89s
        -0x4f9es
        -0x4f81s
        -0x4f87s
        -0x4f88s
        -0x4f9ds
        -0x4f9as
        -0x4f8es
        -0x4f89s
        -0x4f9es
        -0x4f8ds
        -0x4fa6s
        -0x4f89s
        -0x4f8cs
        -0x4f8ds
        -0x4f86s
        -0x4f89s
        -0x4f8bs
        -0x4f8bs
        -0x4f8ds
        -0x4f88s
        -0x4f9es
        -0x4fabs
        -0x4f87s
        -0x4f86s
        -0x4f87s
        -0x4f9cs
        -0x4fa1s
        -0x4f8bs
        -0x4f87s
        -0x4f88s
        -0x4f90s
        -0x4f87s
        -0x4f86s
        -0x4f8es
        -0x4f8ds
        -0x4f9cs
        -0x4fabs
        -0x4f87s
        -0x4f86s
        -0x4f87s
        -0x4f9cs
        -0x4fa1s
        -0x4f8bs
        -0x4f87s
        -0x4f88s
        0x39ffs
        0x232es
        -0x1599s
        0x3c71s
        -0x37e1s
        -0x1981s
        -0x4f81s
        -0x4f9bs
        -0x4faes
        -0x4f81s
        -0x4f9cs
        0x1443s
        0x66ads
        0x66b2s
        0x66a7s
        0x66b0s
        0x66a3s
        0x66b6s
        0x66abs
        0x66ads
        0x66acs
        0x66b2s
        0x66a3s
        0x66b6s
        0x66aas
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66a7s
        0x66bas
        0x66b6s
        0x66b0s
        0x66a3s
        0x66a1s
        0x66b6s
        0x66efs
        0x66a3s
        0x66b2s
        0x66a9s
        0x66a7s
        0x66a6s
        0x66abs
        0x66b6s
        0x66efs
        0x66b6s
        0x66a7s
        0x66bas
        0x66b6s
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66a3s
        0x66b2s
        0x66a9s
        0x66efs
        0x66afs
        0x66a1s
        0x66b2s
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66afs
        0x66b7s
        0x66b1s
        0x66abs
        0x66a1s
        0x66efs
        0x66b2s
        0x66aes
        0x66a3s
        0x66bbs
        0x66a7s
        0x66b0s
        0x66b2s
        0x66b0s
        0x66a7s
        0x66b4s
        0x66abs
        0x66a7s
        0x66b5s
        0x66efs
        0x66aas
        0x66b6s
        0x66afs
        0x66aes
        0x66ads
        0x66b2s
        0x66a7s
        0x66acs
        0x66efs
        0x66acs
        0x66b1s
        0x66aes
        0x66ads
        0x66a1s
        0x66a3s
        0x66b6s
        0x66a7s
        0x66efs
        0x66a1s
        0x66aes
        0x66abs
        0x66a1s
        0x66a9s
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66a1s
        0x66ads
        0x66aes
        0x66ads
        0x66b0s
        0x66efs
        0x66b2s
        0x66abs
        0x66a1s
        0x66a9s
        0x66a7s
        0x66b0s
        0x66aes
        0x66ads
        0x66a1s
        0x66a3s
        0x66b6s
        0x66a7s
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66b6s
        0x66a7s
        0x66b0s
        0x66afs
        0x66abs
        0x66acs
        0x66a3s
        0x66aes
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66b1s
        0x66abs
        0x66a5s
        0x66acs
        0x66a3s
        0x66b6s
        0x66b7s
        0x66b0s
        0x66a7s
        0x66efs
        0x66a9s
        0x66a7s
        0x66bbs
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66a3s
        0x66a1s
        0x66b6s
        0x66abs
        0x66b4s
        0x66abs
        0x66b6s
        0x66bbs
        0x66efs
        0x66b0s
        0x66a7s
        0x66a1s
        0x66ads
        0x66b0s
        0x66a6s
        0x66a5s
        0x66ads
        0x66b6s
        0x66ads
        0x66efs
        0x66ads
        0x66b0s
        0x66efs
        0x66aes
        0x66ads
        0x66a1s
        0x66a3s
        0x66b6s
        0x66a7s
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66b2s
        0x66aes
        0x66b7s
        0x66a5s
        0x66abs
        0x66acs
        0x66efs
        0x66afs
        0x66a3s
        0x66acs
        0x66a3s
        0x66a5s
        0x66a7s
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66b1s
        0x66b6s
        0x66b0s
        0x66a7s
        0x66a3s
        0x66afs
        0x66efs
        0x66afs
        0x66a7s
        0x66a6s
        0x66abs
        0x66a3s
        0x66a5s
        0x66ads
        0x66b6s
        0x66ads
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66b1s
        0x66afs
        0x66a3s
        0x66aes
        0x66abs
        0x66efs
        0x66b3s
        0x66b7s
        0x66a7s
        0x66b0s
        0x66bbs
        0x66a7s
        0x66bas
        0x66a7s
        0x66a1s
        0x66efs
        0x66b1s
        0x66a1s
        0x66b0s
        0x66abs
        0x66b2s
        0x66b6s
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66b6s
        0x66b7s
        0x66b6s
        0x66ads
        0x66b0s
        0x66abs
        0x66a3s
        0x66aes
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66b0s
        0x66a7s
        0x66afs
        0x66ads
        0x66b6s
        0x66a7s
        0x66efs
        0x66b2s
        0x66a3s
        0x66bbs
        0x66aes
        0x66ads
        0x66a3s
        0x66a6s
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66b0s
        0x66a7s
        0x66afs
        0x66ads
        0x66b6s
        0x66a7s
        0x66efs
        0x66afs
        0x66a3s
        0x66acs
        0x66a3s
        0x66a5s
        0x66a7s
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66a1s
        0x66ads
        0x66afs
        0x66afs
        0x66ads
        0x66acs
        0x66efs
        0x66b2s
        0x66a3s
        0x66b1s
        0x66b1s
        0x66b5s
        0x66ads
        0x66b0s
        0x66a6s
        0x66b1s
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66b0s
        0x66a7s
        0x66a1s
        0x66bbs
        0x66a1s
        0x66aes
        0x66a7s
        0x66efs
        0x66a0s
        0x66abs
        0x66acs
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66a3s
        0x66b2s
        0x66b2s
        0x66efs
        0x66b2s
        0x66b0s
        0x66ads
        0x66b6s
        0x66a7s
        0x66a1s
        0x66b6s
        0x66b6s
        0x66ads
        0x66ads
        0x66aes
        0x66efs
        0x66b6s
        0x66a7s
        0x66bas
        0x66b6s
        0x66efs
        0x66a7s
        0x66a6s
        0x66abs
        0x66b6s
        0x66ads
        0x66b0s
        0x66a3s
        0x66acs
        0x66a6s
        0x66b0s
        0x66ads
        0x66abs
        0x66a6s
        0x66ecs
        0x66abs
        0x66acs
        0x66b6s
        0x66a7s
        0x66acs
        0x66b6s
        0x66ecs
        0x66a3s
        0x66a1s
        0x66b6s
        0x66abs
        0x66ads
        0x66acs
        0x66ecs
        0x6694s
        0x668bs
        0x6687s
        0x6695s
        0x66b1s
        0x66aas
        0x66ads
        0x66b0s
        0x66b6s
        0x66a1s
        0x66b7s
        0x66b6s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ll/ۙ᩶ۘ;-><init>()V

    return-void
.end method

.method public static ۙ(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x19519e1b

    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    sget v5, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v6, "\u06e8\u06dc"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6187

    const v8, -0x6744ee9b

    xor-int/2addr v7, v8

    const v8, -0x4b50222f

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x7927

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 298
    :try_start_0
    invoke-static {v1, v2}, Ll/֡᩶;->ᩳ۬ܺ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 187
    :sswitch_0
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    sget v6, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v6, :cond_c

    goto/16 :goto_2

    .line 189
    :sswitch_1
    sget v6, Ll/֨᩺;->۬᩺ܰ:I

    if-gez v6, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v6, "\u06db\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x33a3

    const v8, 0x490fe726    # 589426.4f

    xor-int/2addr v7, v8

    const v8, 0x4307eb24

    goto :goto_0

    .line 245
    :sswitch_2
    sget v6, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v6, "\u06ec\u06e4"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x53

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x44cd

    const v8, -0xc230109

    xor-int/2addr v7, v8

    const v8, -0x74e0bc46

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget v6, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez v6, :cond_e

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v6

    if-nez v6, :cond_9

    goto/16 :goto_6

    .line 126
    :sswitch_5
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v6, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v6, :cond_3

    goto/16 :goto_6

    .line 172
    :sswitch_6
    sget v6, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v6, :cond_7

    goto/16 :goto_6

    .line 179
    :sswitch_7
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto/16 :goto_6

    :sswitch_8
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    return-void

    .line 298
    :sswitch_9
    :try_start_1
    throw v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :sswitch_a
    return-void

    :sswitch_b
    :try_start_2
    invoke-static {v0}, Ll/ۗܳ;->ܺ᩵ۜ(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    const-string v6, "\u06d7\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x615f

    const v8, 0x7f0184cf    # 1.7216E38f

    xor-int/2addr v7, v8

    const v8, -0x13a0e3b0

    goto/16 :goto_0

    :catchall_0
    move-exception v2

    const-string v6, "\u06db\u1a79"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6ed

    const v8, 0x68b29144

    xor-int/2addr v7, v8

    const v8, 0xa63f20a

    goto/16 :goto_0

    :sswitch_c
    return-void

    .line 297
    :sswitch_d
    :try_start_3
    sget-object v6, Lbin/mt/plus/ShortcutActivity;->۠ۙ:Ll/᩷۠ۚ;

    invoke-static {v6}, Ll/ۗܺ;->ܶܳۘ(Ljava/lang/Object;)V

    .line 298
    invoke-static {v6, p0}, Ll/֫۟;->᩶ۡۢ(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩷۠ۚ;

    move-result-object v6

    invoke-virtual {v6}, Ll/᩷۠ۚ;->ۚܰ()Ljava/io/BufferedOutputStream;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 299
    :try_start_4
    sget-object v6, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v7, 0x64

    invoke-virtual {p1, v6, v7, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 300
    :try_start_5
    invoke-static {v0}, Ll/ۗܳ;->ܺ᩵ۜ(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    const-string v6, "\u06d6\u06e1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5d43

    const v8, -0xbbdc327

    xor-int/2addr v7, v8

    const v8, -0x31f0d787

    goto/16 :goto_0

    :catchall_1
    move-exception v1

    const-string v6, "\u1a79\u06e2"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x3d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x603b

    const v8, 0x2625636e

    xor-int/2addr v7, v8

    const v8, -0x2757643

    goto/16 :goto_0

    :catch_0
    const-string v6, "\u06db\u0733"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x4d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5bbf

    const v8, -0x7b6ba105

    xor-int/2addr v7, v8

    const v8, 0x36d76322

    goto/16 :goto_0

    .line 107
    :sswitch_e
    sget v6, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v6, :cond_2

    const-string v6, "\u06d6\u05a8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6a7

    const v8, 0x2af3912d

    xor-int/2addr v7, v8

    const v8, -0x43381009

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u06ec\u1a77"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7d3

    const v8, 0x43568730

    xor-int/2addr v7, v8

    const v8, -0x5b8115e4

    goto/16 :goto_0

    :sswitch_f
    sget v6, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v6, :cond_4

    :cond_3
    :goto_2
    const-string v6, "\u06e0\u0730"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2e41

    const v8, 0x91b5f1

    xor-int/2addr v7, v8

    const v8, 0x3b99ba16

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u06ec\u06e1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x19

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x38d7

    const v8, -0x3db2f16b

    xor-int/2addr v7, v8

    const v8, -0x3607aee4    # -2034211.5f

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v6, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v6, :cond_5

    goto :goto_4

    :cond_5
    const-string v6, "\u06e4\u0736"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x6d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x123d

    const v8, -0x6c75a4e9

    xor-int/2addr v7, v8

    const v8, -0x4c9a9242

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v6, Ll/᩶;->ۚۤۘ:Z

    if-eqz v6, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v6, "\u06d8\u1a7b"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0xb

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0xd99

    const v8, 0x3a1af1b1

    xor-int/2addr v7, v8

    const v8, 0x6c304553

    goto/16 :goto_0

    .line 160
    :sswitch_12
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    :goto_3
    const-string v6, "\u1a76\u0736"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5fc7

    const v8, 0x39db943a

    xor-int/2addr v7, v8

    const v8, -0x7b441fff

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u05ab\u06dc"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x55

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5b95

    const v8, 0x7c745d11

    xor-int/2addr v7, v8

    const v8, -0x63cb2994

    goto/16 :goto_0

    .line 51
    :sswitch_13
    sget v6, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v6, :cond_a

    :cond_9
    :goto_4
    const-string v6, "\u06da\u1a75"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x67

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x684b

    const v8, -0x7e0ea996

    xor-int/2addr v7, v8

    const v8, -0x4a76e3b4

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06d6\u0733"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x19

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2b95

    const v8, -0x583b2739

    xor-int/2addr v7, v8

    const v8, -0x555e780a

    goto/16 :goto_0

    :sswitch_14
    sget v6, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v6, :cond_b

    goto :goto_5

    :cond_b
    const-string v6, "\u0733\u06d8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1649

    const v8, -0x56543f3c

    xor-int/2addr v7, v8

    const v8, -0x17c11d44

    goto/16 :goto_0

    :sswitch_15
    sget v6, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v6, :cond_d

    :cond_c
    const-string v6, "\u06e1\u06d8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x47

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x48ff

    const v8, 0x5d5d78e5

    xor-int/2addr v7, v8

    const v8, -0x681fd599

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06e0\u1a76"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6b97

    const v8, 0x177ac137

    xor-int/2addr v7, v8

    const v8, 0x6eb481bc

    goto/16 :goto_0

    .line 276
    :sswitch_16
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v6

    if-nez v6, :cond_f

    :cond_e
    :goto_5
    const-string v6, "\u073d\u06eb"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4cc5

    const v8, -0x7112af1c

    xor-int/2addr v7, v8

    const v8, -0x51163bb1

    goto/16 :goto_0

    :cond_f
    const-string v6, "\u06d6\u06d9"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x2d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7bdf

    const v8, 0x2337b5ee

    xor-int/2addr v7, v8

    const v8, 0x75c6038e

    goto/16 :goto_0

    :sswitch_17
    sget v6, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v6, :cond_10

    :goto_6
    const-string v6, "\u06e1\u06dc"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0xec9

    const v8, -0x61309591

    xor-int/2addr v7, v8

    const v8, -0x516cc50c

    goto/16 :goto_0

    :cond_10
    const-string v6, "\u073f\u06e4"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x32af

    const v8, 0x6a8757e1    # 8.180999E25f

    xor-int/2addr v7, v8

    const v8, -0x733f988c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7effd333 -> :sswitch_d
        -0x7468eb25 -> :sswitch_4
        -0x74122ecb -> :sswitch_8
        -0x6c6485f5 -> :sswitch_a
        -0x69580ffa -> :sswitch_17
        -0x6646fe41 -> :sswitch_0
        -0x5f40a2fc -> :sswitch_5
        -0x5cd355d4 -> :sswitch_3
        -0x5aea96ee -> :sswitch_12
        -0x59f0971f -> :sswitch_10
        -0x564148d5 -> :sswitch_16
        -0x4e832e72 -> :sswitch_14
        -0x3abf0775 -> :sswitch_e
        -0x390bd38e -> :sswitch_2
        -0x34ecd75c -> :sswitch_1
        -0x318c7be7 -> :sswitch_b
        -0x148e3a98 -> :sswitch_a
        -0xfad9ff2 -> :sswitch_10
        -0x843dab1 -> :sswitch_b
        -0x5f7ee28 -> :sswitch_11
        -0x4d4c33e -> :sswitch_13
        0x3c95de9 -> :sswitch_12
        0xcf3e8f8 -> :sswitch_8
        0xeb7c670 -> :sswitch_2
        0x16a37c45 -> :sswitch_9
        0x171ea98a -> :sswitch_6
        0x177ad776 -> :sswitch_17
        0x180a0d43 -> :sswitch_1
        0x1ee7519c -> :sswitch_6
        0x276d0dd2 -> :sswitch_7
        0x27ee2e7a -> :sswitch_15
        0x341bcab4 -> :sswitch_c
        0x363647aa -> :sswitch_e
        0x38d035a1 -> :sswitch_f
        0x464ac93e -> :sswitch_15
        0x489c4a17 -> :sswitch_7
        0x4ad16506 -> :sswitch_16
        0x4bca59f0 -> :sswitch_14
        0x4bd7f854 -> :sswitch_5
        0x4bebd2ea -> :sswitch_13
        0x4f8a13b2 -> :sswitch_9
        0x60a1301a -> :sswitch_3
        0x62e50f1c -> :sswitch_4
        0x6e2482db -> :sswitch_d
        0x6e48ab0f -> :sswitch_0
        0x7063d518 -> :sswitch_c
        0x72cb5653 -> :sswitch_f
        0x771146cf -> :sswitch_11
    .end sparse-switch
.end method

.method public static ۙ(Ll/۫ܶۘ;Z)V
    .locals 82

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

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const v61, 0x78fec031

    sget v62, Ll/֡֡;->᩶ۤ۠:I

    sget v63, Ll/ۖ᩸;->ۨܽ۬:I

    const-string v64, "\u1a77\u1a74"

    invoke-static/range {v64 .. v64}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v64

    add-int v64, v64, v62

    mul-int/lit8 v64, v64, -0x27

    xor-int v1, v64, v63

    mul-int/lit16 v1, v1, 0x733d

    const v65, 0x1bb0406a

    xor-int v1, v1, v65

    const v65, 0x49b17fb7

    xor-int v64, v64, v65

    move-object/from16 v27, v12

    move-object v3, v15

    move-object/from16 v15, v17

    move-object/from16 v21, v20

    move-object/from16 v9, v23

    move-object/from16 v26, v25

    move-object/from16 v0, v34

    move-object/from16 v14, v35

    move-object/from16 v12, v38

    move-object/from16 v67, v47

    move-object/from16 v69, v49

    move-object/from16 v72, v52

    move-object/from16 v74, v54

    move-object/from16 v77, v57

    move-object/from16 v79, v59

    const/4 v2, 0x0

    const/4 v10, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x0

    const/16 v46, 0x0

    const/16 v66, 0x0

    const/16 v68, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v73, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v78, 0x0

    const/16 v80, 0x0

    move-object/from16 v23, v7

    move-object/from16 v17, v16

    move-object/from16 v20, v19

    move-object/from16 v25, v24

    const/16 v16, 0x0

    move-object v7, v6

    move-object/from16 v24, v8

    move-object/from16 v19, v18

    move-object/from16 v8, v22

    const/16 v18, 0x0

    move-object v6, v5

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    :goto_0
    xor-int v13, v61, v63

    mul-int/lit16 v13, v13, -0x4985

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v1, v13

    xor-int v61, v64, v1

    sparse-switch v61, :sswitch_data_0

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v1

    if-gtz v1, :cond_7

    goto/16 :goto_1

    .line 133
    :sswitch_0
    sget-boolean v1, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v1, :cond_1

    :cond_0
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v1, v67

    move-object/from16 v55, v69

    move/from16 v54, v70

    move/from16 v56, v71

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    goto/16 :goto_31

    :cond_1
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v57, v67

    move-object/from16 v55, v69

    move/from16 v54, v70

    move/from16 v56, v71

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    goto/16 :goto_35

    .line 102
    :sswitch_1
    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v1, :cond_2

    goto/16 :goto_2

    :cond_2
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v57, v67

    move-object/from16 v55, v69

    move/from16 v54, v70

    move/from16 v56, v71

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move-object/from16 v0, v17

    move/from16 v5, v28

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    goto/16 :goto_36

    .line 123
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u06da\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, -0x24eb

    const v47, 0x7b8d8a20

    xor-int v13, v13, v47

    const v47, 0x67241c9e

    goto/16 :goto_e

    :sswitch_3
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v1

    if-nez v1, :cond_0

    :goto_1
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move v0, v4

    move-object/from16 v29, v5

    move-object/from16 v4, v24

    move/from16 v5, v28

    move-object/from16 v28, v17

    goto/16 :goto_32

    .line 183
    :sswitch_4
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    sget-boolean v1, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    const-string v1, "\u1a77\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, 0x6db5

    const v47, 0x2890c5d2

    xor-int v13, v13, v47

    const v47, -0x3daef0c4

    goto/16 :goto_e

    .line 21
    :sswitch_5
    sget v1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    move-object/from16 v48, v7

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v1, v72

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object v0, v6

    move-object/from16 v6, v23

    move/from16 v23, v29

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v73

    goto/16 :goto_2e

    .line 30
    :sswitch_6
    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v1, :cond_6

    goto :goto_1

    :cond_6
    :goto_2
    const-string v1, "\u06d9\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v62, v1

    mul-int/lit8 v1, v1, 0x31

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x8b7

    const v47, -0x4afd3e06

    xor-int v13, v13, v47

    const v47, 0x56452e9e

    goto/16 :goto_e

    :cond_7
    :goto_3
    const-string v1, "\u1a74\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, 0x62f9

    const v47, -0x256920f9

    xor-int v13, v13, v47

    const v47, 0x68211331

    goto/16 :goto_e

    .line 177
    :sswitch_7
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto/16 :goto_1

    :sswitch_8
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    return-void

    .line 202
    :sswitch_9
    invoke-static/range {v39 .. v39}, Ll/ܽܿ;->ܰ(Landroid/graphics/Bitmap;)Ll/ܽܿ;

    move-result-object v1

    invoke-virtual {v12, v1}, Ll/ۢܽ;->ۙ(Ll/ܽܿ;)V

    goto :goto_4

    .line 204
    :sswitch_a
    invoke-virtual {v12}, Ll/ۢܽ;->ۙ()Ll/ۗܽ;

    move-result-object v1

    invoke-static {v2, v1}, Ll/ۖۗ;->ۨۜܰ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 250
    :sswitch_b
    invoke-static/range {v36 .. v36}, Ll/ۨ֡᩹;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_e

    move-object v14, v1

    goto/16 :goto_b

    .line 199
    :sswitch_c
    invoke-virtual {v12, v0}, Ll/ۢܽ;->ۙ(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :sswitch_d
    if-eqz v39, :cond_8

    const-string v1, "\u1a78\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    mul-int/lit8 v1, v1, 0x4f

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0xe1d

    const v47, -0x13271a2f

    xor-int v13, v13, v47

    const v47, -0x1eaf147c

    goto/16 :goto_e

    :cond_8
    :goto_4
    const-string v1, "\u06df\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v63, v1

    mul-int/lit8 v1, v1, -0x3d

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, 0x2d01

    const v47, 0x78ea166f

    xor-int v13, v13, v47

    const v47, -0x20d161ee

    goto/16 :goto_e

    :sswitch_e
    move-object/from16 v1, v36

    .line 249
    invoke-static {v1, v5}, Ll/ۗ᩺;->ۛ֡ܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    const-string v13, "\u06ec\u06d7"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int v13, v13, v62

    mul-int/lit8 v13, v13, -0x19

    move-object/from16 v36, v1

    xor-int v1, v13, v63

    mul-int/lit16 v1, v1, -0x68db

    const v47, -0x61b2374d

    xor-int v1, v1, v47

    const v47, -0x449aed04

    goto/16 :goto_7

    :cond_9
    move-object/from16 v36, v1

    goto/16 :goto_a

    .line 192
    :sswitch_f
    invoke-static/range {v33 .. v33}, Ll/ۨ֡᩹;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_c

    :sswitch_10
    if-eqz v39, :cond_a

    goto/16 :goto_8

    :cond_a
    :goto_5
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    goto/16 :goto_28

    .line 197
    :sswitch_11
    new-instance v12, Ll/ۢܽ;

    invoke-direct {v12, v8}, Ll/ۢܽ;-><init>(Ll/ۗܽ;)V

    if-eqz v0, :cond_b

    const-string v1, "\u06db\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v63

    mul-int/lit8 v1, v1, 0x47

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, 0x5a6f

    const v47, -0x7979831e

    xor-int v13, v13, v47

    const v47, -0x22894feb

    goto/16 :goto_e

    :cond_b
    :goto_6
    const-string v1, "\u1a7b\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x3451

    const v47, 0x198eed2a

    xor-int v13, v13, v47

    const v47, 0x281add63

    goto/16 :goto_e

    :sswitch_12
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v18, v37

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    goto/16 :goto_29

    .line 248
    :sswitch_13
    invoke-static {v15, v6}, Ll/֡ܽ;->֫ۘۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v36

    if-eqz v36, :cond_e

    const-string v1, "\u06e4\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, -0x40a7

    const v47, -0x2e8e6cc1

    xor-int v13, v13, v47

    const v47, 0x37dead8b

    goto/16 :goto_e

    .line 256
    :sswitch_14
    new-instance v1, Ll/ۢܽ;

    invoke-direct {v1, v3}, Ll/ۢܽ;-><init>(Ll/ۗܽ;)V

    .line 257
    invoke-virtual {v1, v14}, Ll/ۢܽ;->ۙ(Ljava/lang/CharSequence;)V

    .line 258
    invoke-static/range {v32 .. v32}, Ll/ܽܿ;->ܰ(Landroid/graphics/Bitmap;)Ll/ܽܿ;

    move-result-object v13

    invoke-virtual {v1, v13}, Ll/ۢܽ;->ۙ(Ll/ܽܿ;)V

    .line 259
    invoke-virtual {v1}, Ll/ۢܽ;->ۙ()Ll/ۗܽ;

    move-result-object v1

    .line 256
    invoke-static {v2, v1}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_9

    :sswitch_15
    move-object/from16 v1, v33

    .line 191
    invoke-static {v1, v5}, Ll/ۗ᩺;->ۛ֡ܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    const-string v13, "\u05a8\u06e7"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v63

    move-object/from16 v33, v1

    xor-int v1, v13, v62

    mul-int/lit16 v1, v1, 0x1187

    const v47, -0x8728804

    xor-int v1, v1, v47

    const v47, -0xaa23a03

    :goto_7
    xor-int v64, v13, v47

    goto/16 :goto_0

    :cond_c
    move-object/from16 v33, v1

    goto/16 :goto_d

    :sswitch_16
    if-nez v0, :cond_d

    const-string v1, "\u06d6\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, -0x6b3d

    const v47, 0x4e8ea4ef    # 1.1965869E9f

    xor-int v13, v13, v47

    const v47, 0x25d11126

    goto/16 :goto_e

    :cond_d
    :goto_8
    const-string v1, "\u06da\u1a7b"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v63

    mul-int/lit8 v1, v1, -0x9

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, 0x4489

    const v47, -0x1e3a319a

    xor-int v13, v13, v47

    const v47, 0x50ee6423

    goto/16 :goto_e

    :goto_9
    :sswitch_17
    const-string v1, "\u1a76\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x4c53

    const v47, -0x66be475a

    xor-int v13, v13, v47

    const v47, -0x5d836a7e

    goto/16 :goto_e

    :sswitch_18
    const/4 v1, 0x0

    .line 247
    invoke-virtual {v15, v7, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "\u05a8\u1a73"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, 0x1e4f

    const v47, -0x48189660

    xor-int v13, v13, v47

    const v47, -0x2aec0c26

    goto/16 :goto_e

    :cond_e
    :goto_a
    move-object/from16 v14, v19

    :goto_b
    const-string v1, "\u06d8\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    mul-int/lit8 v1, v1, -0xf

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x74df

    const v47, 0x5d3760a0

    xor-int v13, v13, v47

    const v47, -0x32b7693

    goto/16 :goto_e

    .line 190
    :sswitch_19
    invoke-static {v9, v6}, Ll/ۗᩳ;->ۢ۬ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v33

    if-eqz v33, :cond_10

    const-string v1, "\u06eb\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, -0x1dff

    const v47, 0x343781b1

    xor-int v13, v13, v47

    const v47, 0x58f74f98

    goto/16 :goto_e

    :sswitch_1a
    const/4 v0, 0x0

    :goto_c
    const-string v1, "\u05ab\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, 0x766b

    const v47, -0x5b17aa8d

    xor-int v13, v13, v47

    const v47, 0x47dfa8bb

    goto :goto_e

    .line 242
    :sswitch_1b
    invoke-static/range {v17 .. v17}, Lbin/mt/plus/ShortcutActivity;->ܰ(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    move-object/from16 v32, v1

    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v0, v17

    move/from16 v17, v4

    goto/16 :goto_10

    :sswitch_1c
    if-nez v32, :cond_f

    const-string v1, "\u06e1\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    mul-int/lit8 v1, v1, 0xb

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, 0x6f73

    const v47, -0x24cb40da

    xor-int v13, v13, v47

    const v47, -0x420c1c0d

    goto :goto_e

    :cond_f
    const-string v1, "\u06e7\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, -0x6f2f

    const v47, 0x39f87cf3

    xor-int v13, v13, v47

    const v47, 0x4da42811    # 3.4426115E8f

    goto :goto_e

    .line 189
    :sswitch_1d
    invoke-virtual {v9, v7, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_10

    const-string v1, "\u06e7\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, -0x302d

    const v47, 0x358e7852

    xor-int v13, v13, v47

    const v47, 0x120ffbf7

    goto :goto_e

    :cond_10
    :goto_d
    const-string v1, "\u06eb\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x785

    const v47, -0x1e36ab51

    xor-int v13, v13, v47

    const v47, 0x3c7643e1

    :goto_e
    xor-int v64, v1, v47

    move v1, v13

    goto/16 :goto_0

    .line 183
    :sswitch_1e
    sget-object v1, Ll/֡᩸᩹;->ܳۙ:Ll/ܺ᩸᩹;

    invoke-virtual {v1}, Ll/ܺ᩸᩹;->ۨ()I

    move-result v1

    invoke-static {v1, v10, v11}, Ll/᩻ۜ᩺;->ۙ(IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_f

    .line 186
    :sswitch_1f
    sget-object v1, Ll/֡᩸᩹;->ۤ:Ll/֡᩸᩹;

    .line 256
    iget-object v13, v1, Ll/֡᩸᩹;->ۙ:Ll/ܺ᩸᩹;

    invoke-virtual {v13}, Ll/ܺ᩸᩹;->ۨ()I

    move-result v13

    iget-object v1, v1, Ll/֡᩸᩹;->᩹:Ll/᩶᩸᩹;

    iget v1, v1, Ll/᩶᩸᩹;->֡:I

    invoke-static {v13, v1, v11}, Ll/᩻ۜ᩺;->ۙ(IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    :goto_f
    move-object/from16 v39, v1

    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v0, v17

    move/from16 v17, v4

    move/from16 v4, v34

    goto/16 :goto_12

    .line 210
    :sswitch_20
    invoke-static {v4}, Ll/֨ܶ;->ۛۤ᩺(I)V

    return-void

    :sswitch_21
    const/4 v1, 0x1

    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move-object/from16 v30, v31

    move/from16 v13, v38

    move/from16 v7, v66

    const/16 v37, 0x1

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    goto/16 :goto_18

    .line 236
    :sswitch_22
    sget-object v1, Ll/֡᩸᩹;->ܳۙ:Ll/ܺ᩸᩹;

    invoke-virtual {v1}, Ll/ܺ᩸᩹;->ۨ()I

    move-result v1

    move/from16 v13, v38

    move-object/from16 v38, v0

    move/from16 v0, v46

    invoke-static {v1, v0, v13}, Ll/᩻ۜ᩺;->ۙ(IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    move-object/from16 v0, v17

    .line 237
    invoke-static {v0, v1}, Lbin/mt/plus/ShortcutActivity;->ۙ(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    move-object/from16 v31, v1

    move/from16 v17, v4

    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v7, v66

    move-object/from16 v29, v5

    move/from16 v5, v28

    goto/16 :goto_17

    :sswitch_23
    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v0, v17

    if-nez v30, :cond_11

    const-string v1, "\u06e7\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    move/from16 v17, v4

    xor-int v4, v1, v62

    mul-int/lit16 v4, v4, -0x2b03

    const v47, 0x18699234

    xor-int v4, v4, v47

    const v47, 0x33d9cfb8

    goto :goto_13

    :cond_11
    move/from16 v17, v4

    move-object/from16 v32, v30

    :goto_10
    const-string v1, "\u06e7\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v4, v1, v63

    mul-int/lit16 v4, v4, 0x1401

    const v47, 0x4f75c617    # 4.1234E9f

    xor-int v4, v4, v47

    const v47, -0x4a914dd6

    goto :goto_13

    .line 264
    :sswitch_24
    invoke-static/range {v35 .. v35}, Ll/֨ܶ;->ۛۤ᩺(I)V

    return-void

    :sswitch_25
    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v0, v17

    move/from16 v17, v4

    .line 178
    sget-object v1, Ll/֡᩸᩹;->ۙܰ:Ll/ܺ᩸᩹;

    invoke-virtual {v1}, Ll/ܺ᩸᩹;->ۨ()I

    move-result v1

    move/from16 v4, v34

    invoke-static {v1, v4, v11}, Ll/᩻ۜ᩺;->ۙ(IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_11

    :sswitch_26
    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v0, v17

    move/from16 v17, v4

    move/from16 v4, v34

    const/4 v1, 0x0

    :goto_11
    move-object/from16 v39, v1

    :goto_12
    const-string v1, "\u06df\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    move/from16 v34, v4

    xor-int v4, v1, v63

    mul-int/lit16 v4, v4, -0x1f0f

    const v47, -0x628186

    xor-int v4, v4, v47

    const v47, -0x6caa4398

    :goto_13
    xor-int v64, v1, v47

    move v1, v4

    move/from16 v4, v17

    move-object/from16 v17, v0

    goto/16 :goto_22

    :sswitch_27
    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v0, v17

    move/from16 v17, v4

    .line 181
    invoke-static/range {v26 .. v26}, Ll/֡᩸᩹;->ۙ(Ljava/lang/String;)I

    move-result v10

    move/from16 v1, v29

    if-eq v10, v1, :cond_12

    const-string v4, "\u1a73\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v63

    move-object/from16 v29, v5

    xor-int v5, v4, v62

    mul-int/lit16 v5, v5, -0x4ce7

    const v47, 0x3ff79d1c

    xor-int v5, v5, v47

    const v47, -0x7e3f27b6

    xor-int v64, v4, v47

    move/from16 v4, v17

    goto/16 :goto_16

    :cond_12
    move-object/from16 v29, v5

    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v5, v28

    move/from16 v7, v66

    goto :goto_14

    :sswitch_28
    move/from16 v1, v29

    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move-object/from16 v0, v17

    move/from16 v17, v4

    .line 183
    sget-object v4, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x4b

    move-object/from16 v47, v6

    const/4 v6, 0x5

    move-object/from16 v48, v7

    move/from16 v7, v66

    invoke-static {v4, v5, v6, v7}, Ll/ۧ;->۫֨۠([SIII)Ljava/lang/String;

    move-result-object v4

    .line 185
    invoke-virtual {v9, v4, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_13

    const-string v4, "\u1a77\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v62

    xor-int v5, v4, v63

    mul-int/lit16 v5, v5, -0x74eb

    const v6, 0x1370e3b8

    xor-int/2addr v5, v6

    const v6, 0x270e991f

    goto :goto_15

    :cond_13
    move/from16 v5, v28

    :goto_14
    move-object/from16 v28, v0

    goto/16 :goto_1a

    :sswitch_29
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move-object/from16 v0, v17

    move/from16 v17, v4

    if-eqz p1, :cond_14

    const-string v4, "\u06d6\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v63

    xor-int v5, v4, v62

    mul-int/lit16 v5, v5, 0x71a3

    const v6, 0x208c50f

    xor-int/2addr v5, v6

    const v6, -0x377e59cd

    :goto_15
    xor-int v64, v4, v6

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v6, v47

    move-object/from16 v7, v48

    :goto_16
    move-object/from16 v17, v0

    move-object/from16 v0, v38

    move/from16 v38, v13

    move-object/from16 v81, v29

    move/from16 v29, v1

    move v1, v5

    goto/16 :goto_1c

    :cond_14
    move/from16 v5, v28

    move-object/from16 v28, v0

    goto/16 :goto_19

    :sswitch_2a
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move-object/from16 v0, v17

    move/from16 v17, v4

    .line 229
    sget-object v4, Ll/֡᩸᩹;->ۙܰ:Ll/ܺ᩸᩹;

    invoke-virtual {v4}, Ll/ܺ᩸᩹;->ۨ()I

    move-result v4

    move/from16 v5, v28

    invoke-static {v4, v5, v13}, Ll/᩻ۜ᩺;->ۙ(IIZ)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 230
    invoke-static {v0, v4}, Lbin/mt/plus/ShortcutActivity;->ۙ(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    move-object/from16 v31, v4

    :goto_17
    const-string v4, "\u06e1\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v63

    mul-int/lit8 v4, v4, 0x6d

    xor-int v6, v4, v62

    mul-int/lit16 v6, v6, -0x3d6f

    const v28, -0x3ed85192

    xor-int v6, v6, v28

    const v28, 0x7bc1d7bd

    xor-int v64, v4, v28

    move/from16 v28, v5

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v5, v29

    move-object/from16 v7, v48

    move-object/from16 v17, v0

    move/from16 v29, v1

    move v1, v6

    move-object/from16 v0, v38

    move-object/from16 v6, v47

    goto/16 :goto_2b

    :sswitch_2b
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move-object/from16 v0, v17

    move/from16 v5, v28

    move/from16 v17, v4

    .line 234
    invoke-static/range {v21 .. v21}, Ll/֡᩸᩹;->ۙ(Ljava/lang/String;)I

    move-result v4

    if-eq v4, v1, :cond_15

    const-string v6, "\u06d6\u0730"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v62

    move-object/from16 v28, v0

    xor-int v0, v6, v63

    mul-int/lit16 v0, v0, -0x23e5

    const v46, 0x1cc5bf1e

    xor-int v0, v0, v46

    const v46, 0x5b34794d

    xor-int v64, v6, v46

    move/from16 v46, v4

    goto/16 :goto_21

    :cond_15
    move-object/from16 v28, v0

    move-object/from16 v0, p0

    move/from16 v46, v4

    goto/16 :goto_1d

    :sswitch_2c
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    const/4 v0, 0x0

    move-object/from16 v30, v0

    move/from16 v37, v18

    :goto_18
    const-string v0, "\u06e4\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    xor-int v4, v0, v62

    mul-int/lit16 v4, v4, -0x2e8f

    const v6, 0x7b8e9936

    xor-int/2addr v4, v6

    const v6, -0x5d2dfc3d

    goto/16 :goto_1b

    :sswitch_2d
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    if-eqz p1, :cond_16

    const-string v0, "\u1a75\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v4, v0, v63

    mul-int/lit16 v4, v4, -0x4097

    const v6, 0x421a2bf4

    xor-int/2addr v4, v6

    const v6, -0x4a027568    # -1.8890305E-6f

    goto/16 :goto_1b

    :sswitch_2e
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    .line 264
    sget-object v0, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v4, 0x48

    const/4 v6, 0x3

    invoke-static {v0, v4, v6, v7}, Ll/֫ܶ;->۟ۢۚ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    const v4, 0x7d0fe775

    xor-int/2addr v0, v4

    .line 269
    invoke-static {v0}, Ll/֨ܶ;->ۛۤ᩺(I)V

    :cond_16
    :goto_19
    move-object/from16 v0, p0

    goto/16 :goto_1e

    :sswitch_2f
    return-void

    :sswitch_30
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    .line 176
    invoke-static/range {v25 .. v25}, Ll/֡᩸᩹;->ۙ(Ljava/lang/String;)I

    move-result v0

    if-eq v0, v1, :cond_17

    const-string v4, "\u06d8\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v63

    xor-int v6, v4, v62

    mul-int/lit16 v6, v6, 0x6fd9

    const v34, 0x5ad7f1c0

    xor-int v6, v6, v34

    const v34, -0x5fbdacdd

    xor-int v64, v4, v34

    move/from16 v34, v0

    goto/16 :goto_20

    :cond_17
    move/from16 v34, v0

    :goto_1a
    const-string v0, "\u1a79\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v4, v0, v63

    mul-int/lit16 v4, v4, -0x19cf

    const v6, -0x199bc4c9

    xor-int/2addr v4, v6

    const v6, -0x5ec861b5

    goto :goto_1b

    :sswitch_31
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    if-eqz v26, :cond_18

    const-string v0, "\u06e7\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v4, v0, v63

    mul-int/lit16 v4, v4, 0x46b

    const v6, -0x3460673e    # -2.091866E7f

    xor-int/2addr v4, v6

    const v6, 0x7752c26d

    goto :goto_1b

    :cond_18
    const-string v0, "\u06d7\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    mul-int/lit8 v0, v0, -0x17

    xor-int v4, v0, v62

    mul-int/lit16 v4, v4, -0x6d5

    const v6, -0x2f733f3a

    xor-int/2addr v4, v6

    const v6, -0x156e7ae8

    :goto_1b
    xor-int v64, v0, v6

    move/from16 v66, v7

    move-object/from16 v0, v38

    move-object/from16 v6, v47

    move-object/from16 v7, v48

    move/from16 v38, v13

    move-object/from16 v81, v29

    move/from16 v29, v1

    move v1, v4

    move/from16 v4, v17

    move-object/from16 v17, v28

    move/from16 v28, v5

    :goto_1c
    move-object/from16 v5, v81

    goto/16 :goto_0

    :sswitch_32
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, p0

    move-object/from16 v28, v17

    move/from16 v17, v4

    .line 208
    invoke-static {v0, v2}, Ll/ۨ۫;->ܰ(Ll/۫ܶۘ;Ljava/util/ArrayList;)Z

    move-result v4

    if-nez v4, :cond_19

    const-string v4, "\u073f\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v62

    xor-int v6, v4, v63

    mul-int/lit16 v6, v6, 0x7277

    const v49, -0x1c852377

    xor-int v6, v6, v49

    const v49, -0x525ca1c4

    goto/16 :goto_1f

    :cond_19
    move-object/from16 v6, v23

    move-object/from16 v4, v24

    move/from16 v23, v1

    goto/16 :goto_23

    :sswitch_33
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, p0

    move-object/from16 v28, v17

    move/from16 v17, v4

    .line 215
    invoke-static {v2}, Ll/ۗ۬;->ܺ᩺ۢ(Ljava/lang/Object;)V

    move/from16 v49, v1

    move-object/from16 v6, v23

    move-object/from16 v0, v24

    move-object/from16 v1, v79

    move-object/from16 v24, v2

    move/from16 v2, v80

    goto/16 :goto_2c

    :sswitch_34
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v28, v17

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move/from16 v17, v4

    move-object/from16 v29, v5

    move-object/from16 v0, p0

    .line 227
    invoke-static/range {v20 .. v20}, Ll/֡᩸᩹;->ۙ(Ljava/lang/String;)I

    move-result v4

    if-eq v4, v1, :cond_1a

    const-string v5, "\u06e7\u06eb"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v63

    mul-int/lit8 v5, v5, 0x25

    xor-int v6, v5, v62

    mul-int/lit16 v6, v6, -0xae1

    const v49, -0x15371c6f

    xor-int v6, v6, v49

    const v49, -0x21c5ffd8

    xor-int v64, v5, v49

    move/from16 v66, v7

    move-object/from16 v5, v29

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move/from16 v29, v1

    move v1, v6

    move/from16 v38, v13

    move-object/from16 v6, v47

    move-object/from16 v81, v28

    move/from16 v28, v4

    goto/16 :goto_26

    :cond_1a
    move v5, v4

    goto :goto_1d

    :sswitch_35
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, p0

    move-object/from16 v28, v17

    move/from16 v17, v4

    if-eqz v21, :cond_1b

    const-string v4, "\u073d\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v62, v4

    mul-int/lit8 v4, v4, 0x13

    xor-int v6, v4, v63

    mul-int/lit16 v6, v6, 0x3a37

    const v49, -0x646ff141

    xor-int v6, v6, v49

    const v49, 0x61801fbf

    goto/16 :goto_1f

    :cond_1b
    :goto_1d
    const-string v4, "\u0736\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v63

    mul-int/lit8 v4, v4, -0x49

    xor-int v6, v4, v62

    mul-int/lit16 v6, v6, 0x5d0f

    const v49, 0x6ef639db

    xor-int v6, v6, v49

    const v49, 0x59ff5b70

    goto/16 :goto_1f

    :sswitch_36
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, p0

    move-object/from16 v28, v17

    move/from16 v17, v4

    .line 262
    invoke-static {v0, v2}, Ll/ۨ۫;->ۙ(Ll/۫ܶۘ;Ljava/util/ArrayList;)Z

    move-result v4

    if-nez v4, :cond_1c

    const-string v4, "\u06e2\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v63

    mul-int/lit8 v4, v4, -0x47

    xor-int v6, v4, v62

    mul-int/lit16 v6, v6, -0x3877

    const v49, -0x23abd327

    xor-int v6, v6, v49

    const v49, -0x21828bcc

    goto :goto_1f

    :cond_1c
    move-object/from16 v6, v23

    move-object/from16 v4, v24

    move/from16 v23, v1

    move-object/from16 v24, v2

    goto/16 :goto_27

    :sswitch_37
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, p0

    move-object/from16 v28, v17

    move/from16 v17, v4

    if-eqz p1, :cond_1d

    const-string v4, "\u06ec\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v62

    mul-int/lit8 v4, v4, 0x77

    xor-int v6, v4, v63

    mul-int/lit16 v6, v6, 0x2deb

    const v49, -0x6101d571

    xor-int v6, v6, v49

    const v49, -0xd0e6b71

    goto :goto_1f

    :cond_1d
    :goto_1e
    const-string v4, "\u06eb\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v62

    xor-int v6, v4, v63

    mul-int/lit16 v6, v6, -0x7541

    const v49, 0x42e13d6a

    xor-int v6, v6, v49

    const v49, -0x79ce51e7

    :goto_1f
    xor-int v64, v4, v49

    :goto_20
    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move/from16 v28, v5

    move/from16 v38, v13

    move-object/from16 v5, v29

    move/from16 v29, v1

    move v1, v6

    goto/16 :goto_3f

    :sswitch_38
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, p0

    move-object/from16 v28, v17

    move/from16 v17, v4

    .line 169
    invoke-static/range {v27 .. v27}, Ll/֡ۛ;->ۨۤ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ll/ۗܽ;

    .line 170
    invoke-virtual {v8}, Ll/ۗܽ;->ܰ()Landroid/content/Intent;

    move-result-object v9

    move-object/from16 v4, v24

    .line 171
    invoke-static {v9, v4}, Ll/ۗᩳ;->ۢ۬ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v25

    move-object/from16 v6, v23

    .line 172
    invoke-static {v9, v6}, Ll/֡ܽ;->֫ۘۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v26

    if-eqz v25, :cond_1e

    const-string v23, "\u05a1\u0730"

    invoke-static/range {v23 .. v23}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v63

    mul-int/lit8 v23, v23, -0x2f

    xor-int v0, v23, v62

    mul-int/lit16 v0, v0, 0x4ff5

    const v24, 0x4e5b94fc    # 9.2099354E8f

    xor-int v0, v0, v24

    const v24, 0x291c2d09

    xor-int v64, v23, v24

    move-object/from16 v24, v4

    move-object/from16 v23, v6

    :goto_21
    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v6, v47

    move-object/from16 v7, v48

    move/from16 v28, v5

    move-object/from16 v5, v29

    move/from16 v29, v1

    move v1, v0

    :goto_22
    move-object/from16 v0, v38

    goto/16 :goto_2b

    :cond_1e
    const-string v0, "\u05ab\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    move/from16 v23, v1

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, -0x57d9

    const v24, 0x613012c3

    xor-int v1, v1, v24

    const v24, 0x1629ef6a

    goto :goto_24

    :sswitch_39
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    .line 207
    invoke-static {v2}, Ll/ۗܳ;->ۤۨ۠(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    const-string v0, "\u06e8\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v63, v0

    mul-int/lit8 v0, v0, -0x71

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, 0x178f

    const v24, -0x6be7bea9

    xor-int v1, v1, v24

    const v24, 0x264b719b

    goto :goto_24

    :cond_1f
    :goto_23
    const-string v0, "\u1a76\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, -0x6a25

    const v24, -0x4804c9ce

    xor-int v1, v1, v24

    const v24, 0x29fb2f67

    :goto_24
    xor-int v64, v0, v24

    move-object/from16 v24, v4

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    goto/16 :goto_33

    :sswitch_3a
    move-object/from16 v38, v0

    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v7, v66

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    .line 223
    invoke-virtual {v3}, Ll/ۗܽ;->ۨ()Ljava/lang/CharSequence;

    move-result-object v19

    .line 224
    invoke-static {v15, v4}, Ll/ۗᩳ;->ۢ۬ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    .line 225
    invoke-static {v15, v6}, Ll/֡ܽ;->֫ۘۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    const/4 v0, 0x1

    if-eqz v20, :cond_20

    const-string v1, "\u06dc\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x5399

    const v24, 0x6c159e30

    xor-int v13, v13, v24

    const v24, -0x44bc957

    goto :goto_25

    :cond_20
    const-string v1, "\u1a7b\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x5ca5

    const v24, 0xe148095

    xor-int v13, v13, v24

    const v24, -0x6a5dff69

    :goto_25
    xor-int v64, v1, v24

    move-object/from16 v24, v4

    move/from16 v66, v7

    move v1, v13

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    const/16 v38, 0x1

    goto/16 :goto_3c

    :sswitch_3b
    move/from16 v17, v4

    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move-object/from16 v4, v24

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    .line 219
    invoke-static/range {v22 .. v22}, Ll/֡ۛ;->ۨۤ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ll/ۗܽ;

    .line 220
    invoke-virtual {v3}, Ll/ۗܽ;->ۙ()Ljava/lang/String;

    move-result-object v0

    .line 221
    invoke-virtual {v3}, Ll/ۗܽ;->ܰ()Landroid/content/Intent;

    move-result-object v15

    .line 177
    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_21

    move-object/from16 v24, v2

    move-object/from16 v57, v67

    move/from16 v2, v68

    move-object/from16 v55, v69

    move/from16 v54, v70

    move/from16 v56, v71

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    goto/16 :goto_36

    :cond_21
    const-string v1, "\u06eb\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    move-object/from16 v24, v0

    xor-int v0, v1, v63

    mul-int/lit16 v0, v0, -0x697

    const v28, 0x79832de2

    xor-int v0, v0, v28

    const v28, 0x1e3caaab

    xor-int v64, v1, v28

    move v1, v0

    move/from16 v28, v5

    move/from16 v66, v7

    move-object/from16 v5, v29

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move/from16 v38, v13

    move/from16 v29, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v47

    move-object/from16 v81, v24

    move-object/from16 v24, v4

    :goto_26
    move/from16 v4, v17

    move-object/from16 v17, v81

    goto/16 :goto_0

    :sswitch_3c
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    .line 256
    sget-object v0, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v1, 0x45

    move-object/from16 v24, v2

    const/4 v2, 0x3

    invoke-static {v0, v1, v2, v7}, Ll/֨ܰ;->ܺۖ۫([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7d05e8b3

    xor-int v35, v0, v1

    if-eqz v18, :cond_22

    const-string v0, "\u0736\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, -0x21e1

    const v2, -0x7ebe94bc

    xor-int/2addr v1, v2

    const v2, -0x133f0f21

    goto/16 :goto_2a

    :cond_22
    :goto_27
    const-string v0, "\u06d6\u073d"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v62, v0

    mul-int/lit8 v0, v0, -0x27

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, 0x35fd

    const v2, 0x21354a74

    xor-int/2addr v1, v2

    const v2, 0x40814016

    goto/16 :goto_2a

    :sswitch_3d
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    .line 169
    invoke-static/range {v27 .. v27}, Ll/֫ۘ;->ۡۘᩴ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    const-string v0, "\u06ec\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, 0x4d03

    const v2, 0x4dc6ed56    # 4.1718035E8f

    xor-int/2addr v1, v2

    const v2, -0x7fd24764

    goto/16 :goto_2a

    :cond_23
    const-string v0, "\u06d9\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    mul-int/lit8 v0, v0, -0x7b

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, -0x57dd

    const v2, 0x554c830f

    xor-int/2addr v1, v2

    const v2, 0x1dc17ad9

    goto/16 :goto_2a

    :sswitch_3e
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    .line 219
    invoke-static/range {v22 .. v22}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    const-string v0, "\u06d6\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    mul-int/lit8 v0, v0, -0x27

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, -0x1bef

    const v2, -0x1367d0a5

    xor-int/2addr v1, v2

    const v2, -0xbe474ea

    goto/16 :goto_2a

    :cond_24
    const-string v0, "\u0730\u06e0"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, 0x754d

    const v2, -0x78f61801

    xor-int/2addr v1, v2

    const v2, 0x49a920f4    # 1385502.5f

    goto/16 :goto_2a

    :sswitch_3f
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    .line 168
    invoke-static/range {p0 .. p0}, Ll/ۨ۫;->ۚ(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 169
    invoke-static {v0}, Ll/֫֡;->ۖ۠᩻(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v27, v0

    :goto_28
    const-string v0, "\u06d6\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v63, v0

    mul-int/lit8 v0, v0, -0x35

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, -0xf35

    const v2, -0x451d0034

    xor-int/2addr v1, v2

    const v2, -0x63dc5a24

    goto :goto_2a

    :sswitch_40
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    .line 218
    invoke-static/range {p0 .. p0}, Ll/ۨ۫;->ۙ(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    .line 219
    invoke-static {v0}, Ll/ۘ֡;->֫᩺ܶ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object/from16 v22, v0

    const/16 v18, 0x0

    :goto_29
    const-string v0, "\u06df\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, 0x2c35

    const v2, 0x1301a5f1

    xor-int/2addr v1, v2

    const v2, 0x258b2fa8

    :goto_2a
    xor-int v64, v0, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    goto/16 :goto_3b

    :sswitch_41
    move-object/from16 v24, v2

    move-object/from16 v29, v5

    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v5, v28

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v28, v17

    move/from16 v17, v4

    const/16 v0, 0xf

    move-object/from16 v1, v79

    move/from16 v2, v80

    .line 167
    invoke-static {v1, v2, v0, v7}, Ll/֨᩸;->۫ۜܽ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    if-eqz v16, :cond_25

    const-string v23, "\u05a8\u1a77"

    invoke-static/range {v23 .. v23}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v63

    xor-int v4, v23, v62

    mul-int/lit16 v4, v4, 0x3393

    const v50, 0x74214c21

    xor-int v4, v4, v50

    const v50, 0x1aaf5e31

    xor-int v64, v23, v50

    move-object/from16 v79, v1

    move/from16 v80, v2

    move v1, v4

    move-object/from16 v23, v6

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v2, v24

    move-object/from16 v17, v28

    move-object/from16 v6, v47

    move-object/from16 v7, v48

    move-object/from16 v24, v0

    move/from16 v28, v5

    move-object/from16 v5, v29

    move-object/from16 v0, v38

    const/16 v29, -0x1

    :goto_2b
    move/from16 v38, v13

    goto/16 :goto_0

    :cond_25
    const/16 v49, -0x1

    :goto_2c
    const-string v4, "\u06e1\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v62, v4

    mul-int/lit8 v4, v4, 0x7b

    move-object/from16 v23, v0

    xor-int v0, v4, v63

    mul-int/lit16 v0, v0, -0x50d9

    const v50, 0x7e89744e

    xor-int v0, v0, v50

    const v50, -0x1150a5e8

    xor-int v64, v4, v50

    move-object/from16 v79, v1

    move/from16 v80, v2

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v2, v24

    move-object/from16 v17, v28

    move-object/from16 v7, v48

    move v1, v0

    move/from16 v28, v5

    move-object/from16 v24, v23

    move-object/from16 v5, v29

    move-object/from16 v0, v38

    move/from16 v29, v49

    goto/16 :goto_30

    :sswitch_42
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    const/16 v0, 0xf

    move-object/from16 v1, v77

    move/from16 v2, v78

    invoke-static {v1, v2, v0, v7}, Ll/ۘۛ;->᩷ۧ᩹([SIII)Ljava/lang/String;

    move-result-object v0

    sget-object v79, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v80, 0x36

    .line 210
    sget v6, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v6, :cond_26

    move-object v6, v0

    move-object/from16 v77, v1

    move/from16 v78, v2

    move-object/from16 v57, v67

    move/from16 v2, v68

    move-object/from16 v55, v69

    move/from16 v54, v70

    move/from16 v56, v71

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    goto/16 :goto_35

    :cond_26
    const-string v6, "\u1a78\u05ab"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v63

    mul-int/lit8 v6, v6, -0x51

    move-object/from16 v49, v0

    xor-int v0, v6, v62

    mul-int/lit16 v0, v0, -0x444b

    const v50, -0x19c93468

    xor-int v0, v0, v50

    const v50, 0x2fcebe8a

    xor-int v64, v6, v50

    move-object/from16 v77, v1

    move/from16 v78, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v6, v47

    move-object/from16 v7, v48

    move v1, v0

    move-object/from16 v24, v4

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move/from16 v28, v5

    move/from16 v38, v13

    move-object/from16 v5, v29

    move/from16 v29, v23

    move-object/from16 v23, v49

    goto/16 :goto_0

    :sswitch_43
    move-object/from16 v47, v6

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move/from16 v1, v75

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, v74

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v76

    .line 167
    invoke-static {v0, v1, v2, v7}, Ll/֫ܳ;->᩵ۘ᩵([SIII)Ljava/lang/String;

    move-result-object v48

    sget-object v77, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v78, 0x27

    sget v51, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v51, :cond_27

    move-object/from16 v52, v0

    move/from16 v51, v1

    move/from16 v53, v2

    move-object/from16 v79, v49

    move/from16 v80, v50

    move-object/from16 v57, v67

    move/from16 v2, v68

    move-object/from16 v55, v69

    move/from16 v54, v70

    move/from16 v56, v71

    goto/16 :goto_35

    :cond_27
    const-string v51, "\u06d6\u06e4"

    invoke-static/range {v51 .. v51}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v51

    xor-int v51, v51, v62

    move-object/from16 v52, v0

    xor-int v0, v51, v63

    mul-int/lit16 v0, v0, -0x602d

    const v53, -0x77c33586

    xor-int v0, v0, v53

    const v53, 0x4899004f

    xor-int v64, v51, v53

    move/from16 v75, v1

    move/from16 v76, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move-object/from16 v74, v52

    :goto_2d
    move v1, v0

    move-object/from16 v24, v4

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    goto/16 :goto_33

    :sswitch_44
    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    const/16 v0, 0x9

    move-object/from16 v1, v72

    move/from16 v2, v73

    invoke-static {v1, v2, v0, v7}, Ll/֨ۧ;->᩻᩵᩵([SIII)Ljava/lang/String;

    move-result-object v0

    sget-object v74, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v75, 0x1c

    const/16 v76, 0xb

    .line 15
    sget v47, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v47, :cond_28

    :goto_2e
    const-string v47, "\u1a79\u06db"

    invoke-static/range {v47 .. v47}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v47

    xor-int v47, v47, v63

    mul-int/lit8 v47, v47, -0x27

    move-object/from16 v51, v0

    xor-int v0, v47, v62

    mul-int/lit16 v0, v0, -0x48fd

    const v52, 0x6c107af1

    xor-int v0, v0, v52

    const v52, -0x33b06c96    # -5.441476E7f

    goto :goto_2f

    :cond_28
    const-string v47, "\u1a7a\u06db"

    invoke-static/range {v47 .. v47}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v47

    xor-int v47, v47, v62

    move-object/from16 v51, v0

    xor-int v0, v47, v63

    mul-int/lit16 v0, v0, 0x7e0f

    const v52, -0x7d0535a

    xor-int v0, v0, v52

    const v52, 0xdbd6c4c

    :goto_2f
    xor-int v64, v47, v52

    move-object/from16 v72, v1

    move/from16 v73, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move v1, v0

    move-object/from16 v24, v4

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move/from16 v28, v5

    move/from16 v38, v13

    move-object/from16 v5, v29

    move/from16 v29, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v51

    goto/16 :goto_0

    :sswitch_45
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v5, v28

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move/from16 v1, v70

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v28, v17

    move-object/from16 v0, v69

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v71

    .line 167
    invoke-static {v0, v1, v2, v7}, Ll/֫ܺ;->᩶֫ۙ([SIII)Ljava/lang/String;

    move-result-object v29

    sget-object v72, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v73, 0x13

    .line 66
    sget-boolean v54, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v54, :cond_29

    const-string v54, "\u1a73\u1a76"

    invoke-static/range {v54 .. v54}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v54

    sub-int v54, v63, v54

    mul-int/lit8 v54, v54, -0x37

    move-object/from16 v55, v0

    xor-int v0, v54, v62

    mul-int/lit16 v0, v0, 0x1f13

    const v56, -0x6b664fb3

    xor-int v0, v0, v56

    const v56, -0x3008b8da

    xor-int v64, v54, v56

    move/from16 v70, v1

    move/from16 v71, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    move-object/from16 v69, v55

    goto/16 :goto_2d

    :cond_29
    move-object/from16 v55, v0

    const-string v0, "\u06e0\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    move/from16 v54, v1

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, 0x19c9

    const v56, -0x66f32458

    xor-int v1, v1, v56

    const v56, 0x5edb0543

    xor-int v64, v0, v56

    move/from16 v71, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    move/from16 v70, v54

    move-object/from16 v69, v55

    goto/16 :goto_3b

    :sswitch_46
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move-object/from16 v4, v24

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v24, v2

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    xor-int v0, v40, v41

    .line 167
    sget-object v69, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v70, 0xe

    const/16 v71, 0x5

    .line 61
    sget v1, Ll/۟;->ۨᩴۛ:I

    if-ltz v1, :cond_2a

    move-object/from16 v2, v24

    goto/16 :goto_32

    :cond_2a
    const-string v1, "\u06df\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v62, v1

    mul-int/lit8 v1, v1, -0x43

    xor-int v2, v1, v63

    mul-int/lit16 v2, v2, 0x37a9

    const v17, -0x7559bc54

    xor-int v2, v2, v17

    const v17, -0x504edd43

    xor-int v64, v1, v17

    move v1, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v17, v28

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    move-object/from16 v24, v4

    move/from16 v28, v5

    move-object/from16 v5, v29

    move v4, v0

    move/from16 v29, v23

    move-object/from16 v0, v38

    :goto_30
    move-object/from16 v23, v6

    move/from16 v38, v13

    goto/16 :goto_3f

    :sswitch_47
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v55, v69

    move/from16 v54, v70

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v71

    const/4 v0, 0x3

    move/from16 v56, v2

    move-object/from16 v1, v67

    move/from16 v2, v68

    .line 167
    invoke-static {v1, v2, v0, v7}, Ll/֡ܳ;->ܶۘۙ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v40

    const v41, 0x7d49d52a

    .line 243
    sget-boolean v0, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v0, :cond_2b

    :goto_31
    const-string v0, "\u06d7\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    move-object/from16 v57, v1

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, -0x37f7

    const v58, -0x67fae8c2

    xor-int v1, v1, v58

    const v58, 0x2792a6e6

    goto/16 :goto_37

    :cond_2b
    move-object/from16 v57, v1

    const-string v0, "\u05ab\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v63

    mul-int/lit8 v0, v0, -0x11

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, 0x4f2b

    const v58, -0x318baf08

    xor-int v1, v1, v58

    const v58, 0x4ff14fce

    goto/16 :goto_37

    :sswitch_48
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v55, v69

    move/from16 v54, v70

    move/from16 v56, v71

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    .line 166
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 167
    invoke-static {}, Lbin/mt/plus/ShortcutActivity;->۠()Z

    move-result v16

    sget-object v67, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v68, 0xb

    .line 199
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v0

    if-gtz v0, :cond_2c

    move/from16 v0, v17

    move/from16 v70, v54

    move-object/from16 v69, v55

    move/from16 v71, v56

    :goto_32
    const-string v1, "\u06eb\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v62, v1

    mul-int/lit8 v1, v1, -0x79

    move/from16 v17, v0

    xor-int v0, v1, v63

    mul-int/lit16 v0, v0, 0x584b

    const v24, -0x49c66d6b

    xor-int v0, v0, v24

    const v24, -0x145454d3

    xor-int v64, v1, v24

    move v1, v0

    move-object/from16 v24, v4

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    goto :goto_33

    :cond_2c
    const-string v0, "\u0736\u1a7a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    mul-int/lit8 v0, v0, -0x71

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, 0x31c5

    const v24, 0x2cc82998

    xor-int v1, v1, v24

    const v24, -0x44f369d0

    xor-int v64, v0, v24

    move-object/from16 v24, v4

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    move/from16 v70, v54

    move-object/from16 v69, v55

    move/from16 v71, v56

    :goto_33
    move/from16 v28, v5

    move/from16 v38, v13

    goto/16 :goto_3d

    :sswitch_49
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move-object/from16 v57, v67

    move-object/from16 v55, v69

    move/from16 v54, v70

    move/from16 v56, v71

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    const/16 v0, 0x69a6

    const/16 v66, 0x69a6

    goto :goto_34

    :sswitch_4a
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move-object/from16 v57, v67

    move-object/from16 v55, v69

    move/from16 v54, v70

    move/from16 v56, v71

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    const v0, 0xb016

    const v66, 0xb016

    :goto_34
    const-string v0, "\u06dc\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    mul-int/lit8 v0, v0, 0x45

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, 0x7279

    const v7, 0x71ec2d8f

    xor-int/2addr v1, v7

    const v7, -0x6f62270f

    xor-int v64, v0, v7

    move/from16 v68, v2

    goto/16 :goto_39

    :sswitch_4b
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v57, v67

    move-object/from16 v55, v69

    move/from16 v54, v70

    move/from16 v56, v71

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    mul-int v0, v45, v45

    mul-int v1, v44, v44

    const v58, 0xcffd900

    add-int v1, v1, v58

    add-int/2addr v1, v1

    sub-int/2addr v1, v0

    if-ltz v1, :cond_2d

    const-string v0, "\u06d8\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, 0x7f91

    const v58, -0x182f29e

    xor-int v1, v1, v58

    const v58, -0x5af8de53

    goto/16 :goto_37

    :cond_2d
    const-string v0, "\u06ec\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v63

    mul-int/lit8 v0, v0, 0x63

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, -0x1a95

    const v58, -0x489a2d2f

    xor-int v1, v1, v58

    const v58, 0x5ccdbdc

    goto/16 :goto_37

    :sswitch_4c
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v57, v67

    move-object/from16 v55, v69

    move/from16 v54, v70

    move/from16 v56, v71

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    aget-short v0, v42, v43

    add-int/lit16 v1, v0, 0x39b0

    .line 260
    sget v44, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v44, :cond_2e

    move/from16 v44, v0

    move/from16 v45, v1

    move-object/from16 v79, v49

    move/from16 v80, v50

    :goto_35
    const-string v0, "\u1a77\u05ab"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, -0x7037

    const v49, 0x2350c9dd

    xor-int v1, v1, v49

    const v49, -0x347cd331    # -1.7193374E7f

    xor-int v64, v0, v49

    move/from16 v68, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    goto/16 :goto_3a

    :cond_2e
    const-string v44, "\u1a78\u06d7"

    invoke-static/range {v44 .. v44}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v44

    xor-int v44, v44, v63

    mul-int/lit8 v44, v44, 0x3b

    move/from16 v45, v0

    xor-int v0, v44, v62

    mul-int/lit16 v0, v0, -0x123f

    const v58, -0x1c93992d

    xor-int v0, v0, v58

    const v58, -0x5f3d3849

    xor-int v64, v44, v58

    move/from16 v68, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move/from16 v44, v45

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    move/from16 v70, v54

    move-object/from16 v69, v55

    move/from16 v71, v56

    move-object/from16 v67, v57

    move/from16 v45, v1

    move-object/from16 v24, v4

    move/from16 v4, v17

    move-object/from16 v17, v28

    move v1, v0

    move/from16 v28, v5

    move-object/from16 v5, v29

    move-object/from16 v0, v38

    move/from16 v38, v13

    goto/16 :goto_3e

    :sswitch_4d
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v57, v67

    move-object/from16 v55, v69

    move/from16 v54, v70

    move/from16 v56, v71

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    sget-object v42, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v43, 0xa

    .line 163
    sget v0, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v0, :cond_2f

    move-object/from16 v0, v28

    :goto_36
    const-string v1, "\u06d7\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    mul-int/lit8 v1, v1, -0x2b

    move-object/from16 v28, v0

    xor-int v0, v1, v63

    mul-int/lit16 v0, v0, 0x3019

    const v58, -0x5a1f1953

    xor-int v0, v0, v58

    const v58, -0x458e91c

    xor-int v64, v1, v58

    move v1, v0

    goto :goto_38

    :cond_2f
    const-string v0, "\u06db\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v62

    mul-int/lit8 v0, v0, -0x7f

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, 0x645

    const v58, -0x369949a

    xor-int v1, v1, v58

    const v58, -0x20e37b87

    :goto_37
    xor-int v64, v0, v58

    :goto_38
    move/from16 v68, v2

    move/from16 v66, v7

    :goto_39
    move-object/from16 v2, v24

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    :goto_3a
    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    move/from16 v70, v54

    move-object/from16 v69, v55

    move/from16 v71, v56

    move-object/from16 v67, v57

    :goto_3b
    move-object/from16 v24, v4

    move/from16 v38, v13

    move/from16 v4, v17

    move-object/from16 v17, v28

    :goto_3c
    move/from16 v28, v5

    :goto_3d
    move-object/from16 v5, v29

    :goto_3e
    move/from16 v29, v23

    move-object/from16 v23, v6

    :goto_3f
    move-object/from16 v6, v47

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b18ec5c -> :sswitch_46
        -0x79cc8ddd -> :sswitch_4d
        -0x785570c8 -> :sswitch_1
        -0x77f6b502 -> :sswitch_c
        -0x74cacc3a -> :sswitch_44
        -0x741df797 -> :sswitch_28
        -0x733046c9 -> :sswitch_17
        -0x6fdfaa40 -> :sswitch_30
        -0x6ed539fa -> :sswitch_4
        -0x6dce0b03 -> :sswitch_16
        -0x6ab8a8a9 -> :sswitch_2e
        -0x665f07ab -> :sswitch_2f
        -0x65994ba7 -> :sswitch_3c
        -0x648ced99 -> :sswitch_3a
        -0x64335ba1 -> :sswitch_22
        -0x63593a3b -> :sswitch_3b
        -0x5e2285fc -> :sswitch_43
        -0x5d4d1f52 -> :sswitch_3b
        -0x5c9996da -> :sswitch_2c
        -0x5b7570a2 -> :sswitch_6
        -0x591e2936 -> :sswitch_2c
        -0x58f43503 -> :sswitch_27
        -0x56e81471 -> :sswitch_20
        -0x536db067 -> :sswitch_5
        -0x5241ad01 -> :sswitch_15
        -0x4d35d2f6 -> :sswitch_3
        -0x4cc20e89 -> :sswitch_3d
        -0x4c340618 -> :sswitch_25
        -0x4bdf8807 -> :sswitch_42
        -0x4a3c0067 -> :sswitch_4a
        -0x48618b62 -> :sswitch_34
        -0x48609321 -> :sswitch_e
        -0x48400999 -> :sswitch_32
        -0x47fa05f9 -> :sswitch_45
        -0x45bec3e3 -> :sswitch_7
        -0x42333cfb -> :sswitch_7
        -0x41f12384 -> :sswitch_49
        -0x415d992d -> :sswitch_45
        -0x3f9fd49f -> :sswitch_32
        -0x3d693b36 -> :sswitch_24
        -0x3c636a32 -> :sswitch_2b
        -0x3a69db93 -> :sswitch_0
        -0x39a8e579 -> :sswitch_3f
        -0x3967db73 -> :sswitch_2b
        -0x381e33f8 -> :sswitch_19
        -0x35e41559 -> :sswitch_2f
        -0x317ef787 -> :sswitch_16
        -0x310431fd -> :sswitch_1b
        -0x30cf944a -> :sswitch_23
        -0x30be82d8 -> :sswitch_3f
        -0x30be5256 -> :sswitch_2
        -0x3006ef5a -> :sswitch_40
        -0x2fbcbb62 -> :sswitch_a
        -0x2d2659d7 -> :sswitch_b
        -0x2cd915f0 -> :sswitch_1a
        -0x27e033a5 -> :sswitch_3e
        -0x26970e90 -> :sswitch_a
        -0x267429d6 -> :sswitch_35
        -0x25ba8ec7 -> :sswitch_47
        -0x2080350e -> :sswitch_1d
        -0x1e76de6a -> :sswitch_29
        -0x1dcf64db -> :sswitch_e
        -0x1d99c32a -> :sswitch_11
        -0x1d48ba88 -> :sswitch_44
        -0x1c42c321 -> :sswitch_2
        -0x1ae6476a -> :sswitch_2d
        -0x1a586eb2 -> :sswitch_19
        -0x19c82ae4 -> :sswitch_1b
        -0x16d2a92d -> :sswitch_4a
        -0x16c148d6 -> :sswitch_6
        -0x1693d9a2 -> :sswitch_4c
        -0x1411b25d -> :sswitch_8
        -0x12f272dc -> :sswitch_4b
        -0x12e1c3e0 -> :sswitch_26
        -0x12095ec5 -> :sswitch_38
        -0x11aac8b9 -> :sswitch_12
        -0x1134323c -> :sswitch_2a
        -0xf188352 -> :sswitch_f
        -0xe8114f3 -> :sswitch_1f
        -0xc33e527 -> :sswitch_31
        -0x6bb0f93 -> :sswitch_1c
        -0x670c617 -> :sswitch_3
        -0x62bd7e0 -> :sswitch_24
        -0x3e903bd -> :sswitch_33
        0xfdd0c7 -> :sswitch_13
        0x18e6d20 -> :sswitch_18
        0x4b34362 -> :sswitch_42
        0x5835ca7 -> :sswitch_3c
        0x60149bb -> :sswitch_29
        0x8b8033a -> :sswitch_47
        0xad6014c -> :sswitch_33
        0xe59f664 -> :sswitch_c
        0xe63a29b -> :sswitch_10
        0xe6f1704 -> :sswitch_1d
        0x14dd0b2b -> :sswitch_15
        0x171e3bb4 -> :sswitch_22
        0x17bcdeae -> :sswitch_5
        0x1aa503cd -> :sswitch_4c
        0x1ce21bac -> :sswitch_49
        0x1d6f97f8 -> :sswitch_20
        0x20b39914 -> :sswitch_f
        0x2522b14a -> :sswitch_37
        0x2995cea5 -> :sswitch_3d
        0x2a7f3cb2 -> :sswitch_11
        0x2b4f5d7c -> :sswitch_39
        0x2cb0f577 -> :sswitch_4d
        0x2d0c11c9 -> :sswitch_28
        0x32b9365f -> :sswitch_46
        0x34a44b9e -> :sswitch_b
        0x3557d512 -> :sswitch_2a
        0x3685c105 -> :sswitch_13
        0x36f0325c -> :sswitch_37
        0x388d02fe -> :sswitch_8
        0x38ef524f -> :sswitch_9
        0x39109085 -> :sswitch_14
        0x392efc6b -> :sswitch_36
        0x39ba55f4 -> :sswitch_48
        0x3a9710a6 -> :sswitch_36
        0x3abbbd3a -> :sswitch_26
        0x3b7886bd -> :sswitch_27
        0x3bf26658 -> :sswitch_0
        0x3d9c5802 -> :sswitch_2e
        0x401ab20e -> :sswitch_30
        0x40decaeb -> :sswitch_1c
        0x4194ce0e -> :sswitch_43
        0x44e89a44 -> :sswitch_18
        0x51f2fc87 -> :sswitch_4b
        0x5216ee1e -> :sswitch_3a
        0x542d7cfb -> :sswitch_1e
        0x55c38e76 -> :sswitch_38
        0x582c9594 -> :sswitch_17
        0x5a03c07d -> :sswitch_31
        0x5d1e2de1 -> :sswitch_39
        0x5e2b34cd -> :sswitch_48
        0x5ebe420f -> :sswitch_d
        0x60bf3248 -> :sswitch_35
        0x6189e3ab -> :sswitch_9
        0x61acf6ad -> :sswitch_41
        0x62ca9f0c -> :sswitch_1
        0x64337e10 -> :sswitch_d
        0x69a16d97 -> :sswitch_3e
        0x69fb520e -> :sswitch_10
        0x6b273b54 -> :sswitch_1f
        0x6bb8e6af -> :sswitch_4
        0x6cd60979 -> :sswitch_21
        0x705c2ae9 -> :sswitch_1a
        0x72168dc8 -> :sswitch_12
        0x72c20bd7 -> :sswitch_34
        0x7402c44a -> :sswitch_2d
        0x75529820 -> :sswitch_14
        0x75ac6297 -> :sswitch_25
        0x76ab98b1 -> :sswitch_40
        0x773c35da -> :sswitch_23
        0x7b6846a1 -> :sswitch_41
        0x7b887c00 -> :sswitch_21
        0x7cd9b2e5 -> :sswitch_1e
    .end sparse-switch
.end method

.method public static ۠()Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x74bb16c2

    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    const-string v4, "\u06e7\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5fa1

    const v6, 0x26f1143b

    xor-int/2addr v5, v6

    const v6, -0x68d8601

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x3bd7

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 275
    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v4, :cond_a

    goto/16 :goto_4

    .line 277
    :sswitch_0
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_b

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_9

    goto/16 :goto_3

    .line 278
    :sswitch_2
    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_7

    goto :goto_1

    .line 276
    :sswitch_3
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    goto :goto_1

    .line 274
    :sswitch_4
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    const/4 v0, 0x0

    return v0

    .line 275
    :sswitch_5
    invoke-static {v0}, Ll/ۖ᩸;->ܰ᩻ۙ(Z)Ljava/lang/Boolean;

    move-result-object v4

    sput-object v4, Lbin/mt/plus/ShortcutActivity;->᩵ۙ:Ljava/lang/Boolean;

    goto/16 :goto_5

    .line 278
    :sswitch_6
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06e2\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3a21

    const v6, -0x300b26e2

    xor-int/2addr v5, v6

    const v6, 0x742b00

    goto :goto_0

    :sswitch_7
    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u06ec\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x58fb

    const v6, 0x6caa06d4

    xor-int/2addr v5, v6

    const v6, 0x3017388d

    goto :goto_0

    :sswitch_8
    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u073d\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2fd1

    const v6, 0x5dfff5f5

    xor-int/2addr v5, v6

    const v6, -0x2d8b5ff

    goto/16 :goto_0

    .line 275
    :sswitch_9
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_3

    :goto_1
    const-string v4, "\u06e4\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x293d

    const v6, -0x3d4eeb4c

    xor-int/2addr v5, v6

    const v6, 0x6e1f83f4

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06dc\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa4d

    const v6, -0xc9dcad

    xor-int/2addr v5, v6

    const v6, -0x12a338e6

    goto/16 :goto_0

    .line 277
    :sswitch_a
    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_4

    goto :goto_3

    :cond_4
    const-string v4, "\u073f\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3c21

    const v6, -0x380f7a78

    xor-int/2addr v5, v6

    const v6, 0x57bf86e8

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    const-string v4, "\u06ec\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7791

    const v6, 0x70c0aa29

    xor-int/2addr v5, v6

    const v6, 0x7164b5c8

    goto/16 :goto_0

    .line 278
    :sswitch_c
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_6

    :goto_2
    const-string v4, "\u06dc\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2dcb

    const v6, 0x4d41685e

    xor-int/2addr v5, v6

    const v6, 0x581debf6

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a77\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x77e1

    const v6, -0x21af4d6e

    xor-int/2addr v5, v6

    const v6, -0x79d51025

    goto/16 :goto_0

    .line 276
    :sswitch_d
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_8

    :cond_7
    :goto_3
    const-string v4, "\u073d\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ddb

    const v6, 0x5a12be10

    xor-int/2addr v5, v6

    const v6, 0xc56b793

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a7a\u06df"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5479

    const v6, -0x275e9f8

    xor-int/2addr v5, v6

    const v6, -0x2dfea429

    goto/16 :goto_0

    :cond_9
    :goto_4
    const-string v4, "\u0730\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xef3

    const v6, -0x5d01f366

    xor-int/2addr v5, v6

    const v6, 0x1deae23d

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u073d\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3083

    const v6, -0x34d5a58c

    xor-int/2addr v5, v6

    const v6, 0x484013f

    goto/16 :goto_0

    .line 275
    :sswitch_e
    invoke-static {}, Ll/֡֡;->ۢܶܳ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Ll/ۨ۫;->᩹(Landroid/content/Context;)Z

    move-result v0

    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_c

    :cond_b
    const-string v4, "\u05a8\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x31b5

    const v6, -0x4ecdb613

    xor-int/2addr v5, v6

    const v6, -0x677c2ffb

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e7\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x136b

    const v6, 0x2fcddd3d

    xor-int/2addr v5, v6

    const v6, 0x135a559c

    goto/16 :goto_0

    .line 277
    :sswitch_f
    sget-object v0, Lbin/mt/plus/ShortcutActivity;->᩵ۙ:Ljava/lang/Boolean;

    invoke-static {v0}, Ll/ۗܺ;->ᩴۡܺ(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 274
    :sswitch_10
    sget-object v4, Lbin/mt/plus/ShortcutActivity;->᩵ۙ:Ljava/lang/Boolean;

    if-nez v4, :cond_d

    const-string v4, "\u06da\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2e7

    const v6, 0xba059bb

    xor-int/2addr v5, v6

    const v6, 0x2fe7bb5

    goto/16 :goto_0

    :cond_d
    :goto_5
    const-string v4, "\u073f\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3fe3

    const v6, -0x48740470

    xor-int/2addr v5, v6

    const v6, -0x49a98fba

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x756f14e7 -> :sswitch_2
        -0x6d10bf4f -> :sswitch_8
        -0x6cf49aee -> :sswitch_d
        -0x6bd490bf -> :sswitch_5
        -0x675f01c5 -> :sswitch_1
        -0x65aa966f -> :sswitch_e
        -0x64d343b9 -> :sswitch_3
        -0x5c4987bb -> :sswitch_10
        -0x5892dae3 -> :sswitch_6
        -0x4d3e41ca -> :sswitch_b
        -0x45ab4cc5 -> :sswitch_10
        -0x372e8b9b -> :sswitch_0
        -0x33e9b9f2 -> :sswitch_4
        -0x2e2f0766 -> :sswitch_2
        -0x25eb0b89 -> :sswitch_b
        -0x20a6fcf0 -> :sswitch_f
        -0x20989390 -> :sswitch_d
        -0x1bc72bb1 -> :sswitch_1
        -0x19e157a2 -> :sswitch_a
        -0xfd3fa8a -> :sswitch_a
        -0x7908a88 -> :sswitch_0
        0x3b22145 -> :sswitch_f
        0x1acc1bfc -> :sswitch_7
        0x20b558ab -> :sswitch_4
        0x267a4edf -> :sswitch_e
        0x280c2016 -> :sswitch_9
        0x32d6b6cf -> :sswitch_7
        0x3a41436e -> :sswitch_c
        0x3f6208e1 -> :sswitch_9
        0x45788ced -> :sswitch_c
        0x495db6f6 -> :sswitch_3
        0x5f43c09a -> :sswitch_6
        0x70e3dabe -> :sswitch_8
        0x79bcee09 -> :sswitch_5
    .end sparse-switch
.end method

.method public static ۨ(Ljava/lang/String;)V
    .locals 1

    .line 307
    sget-object v0, Lbin/mt/plus/ShortcutActivity;->۠ۙ:Ll/᩷۠ۚ;

    invoke-static {v0, p0}, Ll/֫۟;->᩶ۡۢ(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩷۠ۚ;

    move-result-object p0

    invoke-static {p0}, Ll/ۗᩳ;->֫۠᩶(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ܰ(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x4b5331d8

    sget v8, Ll/֨᩺;->۬᩺ܰ:I

    sget v9, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v10, "\u073d\u1a76"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0xa53

    const v12, -0x5090a3ff

    xor-int/2addr v11, v12

    const v12, 0x2e335db2

    :goto_0
    xor-int/2addr v10, v12

    :goto_1
    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, 0x6b6f

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 284
    sget-object v0, Lbin/mt/plus/ShortcutActivity;->۠ۙ:Ll/᩷۠ۚ;

    .line 255
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v10

    if-nez v10, :cond_e

    goto/16 :goto_8

    :sswitch_0
    sget-boolean v10, Ll/᩶;->ۚۤۘ:Z

    if-nez v10, :cond_0

    goto/16 :goto_7

    :cond_0
    const-string v10, "\u05a8\u06e7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x45

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6925

    const v12, -0xb06d7b5

    xor-int/2addr v11, v12

    const v12, 0x7cde998a

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget v10, Ll/֫ᩳ;->۬֨᩸:I

    if-lez v10, :cond_d

    goto/16 :goto_6

    .line 93
    :sswitch_2
    sget v10, Ll/֡᩸;->ۨ᩵ܽ:I

    if-nez v10, :cond_7

    goto/16 :goto_7

    .line 252
    :sswitch_3
    sget v10, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v10, :cond_b

    goto/16 :goto_6

    .line 126
    :sswitch_4
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    goto/16 :goto_6

    :sswitch_5
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    const/4 p0, 0x0

    return-object p0

    .line 288
    :sswitch_6
    :try_start_0
    invoke-static {v5, v6}, Ll/֡᩶;->ᩳ۬ܺ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_7
    throw v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :sswitch_8
    :try_start_1
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    const-string v10, "\u1a79\u1a77"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x2f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x17ab

    const v12, 0x1a563850

    xor-int/2addr v11, v12

    const v12, 0x5afef240

    goto :goto_0

    :catchall_0
    move-exception v6

    const-string v10, "\u06d7\u06e4"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x21

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1349

    const v12, 0x6a26a8d0

    xor-int/2addr v11, v12

    const v12, -0x7c595c6e

    goto/16 :goto_0

    :sswitch_9
    return-object v4

    :sswitch_a
    return-object v2

    :sswitch_b
    :try_start_2
    invoke-virtual {v1}, Ll/᩷۠ۚ;->ܰܰ()Ljava/io/BufferedInputStream;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 289
    :try_start_3
    invoke-static {v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 290
    :try_start_4
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const-string v10, "\u06e7\u1a79"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x2b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4a37

    const v12, 0x19d2023b

    xor-int/2addr v11, v12

    const v12, 0x4dca532a    # 4.24306E8f

    goto/16 :goto_0

    :catchall_1
    move-exception v5

    const-string v10, "\u0730\u06e7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x3575

    const v12, -0x69f3e507

    xor-int/2addr v11, v12

    const v12, -0xaf83799

    goto/16 :goto_0

    :catch_0
    const-string v10, "\u06ec\u05a1"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x665b

    const v12, -0x3f77e5d5

    xor-int/2addr v11, v12

    const v12, 0x201f3b81

    goto/16 :goto_0

    .line 285
    :sswitch_c
    invoke-static {v1}, Ll/ۗܺ;->᩹᩶᩵(Ljava/lang/Object;)Z

    move-result v2

    const/4 v10, 0x0

    if-nez v2, :cond_1

    const-string v2, "\u1a7b\u06da"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v9

    mul-int/lit8 v2, v2, 0x19

    xor-int v11, v2, v8

    mul-int/lit16 v11, v11, -0x73b5

    const v12, 0x5a2d351c

    xor-int/2addr v11, v12

    const v12, 0x74e9482

    goto :goto_3

    :cond_1
    const-string v2, "\u05ab\u06d9"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v8

    mul-int/lit8 v2, v2, 0x4d

    xor-int v11, v2, v9

    mul-int/lit16 v11, v11, 0x84b

    const v12, 0x44e431a6

    xor-int/2addr v11, v12

    const v12, 0x5d6a337b

    :goto_3
    xor-int/2addr v2, v12

    move-object v13, v10

    move v10, v2

    move-object v2, v13

    goto/16 :goto_1

    .line 284
    :sswitch_d
    invoke-static {v0, p0}, Ll/֫۟;->᩶ۡۢ(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩷۠ۚ;

    move-result-object v1

    sget v10, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v10, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v10, "\u1a7b\u1a77"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x51

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2121

    const v12, -0x42544e34

    xor-int/2addr v11, v12

    const v12, 0x18a5f954

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v10

    if-gtz v10, :cond_3

    goto :goto_4

    :cond_3
    const-string v10, "\u06d7\u0733"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x787b

    const v12, 0x5c35745f

    xor-int/2addr v11, v12

    const v12, 0x6ff409bf

    goto/16 :goto_0

    .line 285
    :sswitch_f
    sget-boolean v10, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v10, :cond_4

    goto/16 :goto_8

    :cond_4
    const-string v10, "\u06e0\u06da"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x37

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1da1

    const v12, 0x599fab02

    xor-int/2addr v11, v12

    const v12, -0x1892b342

    goto/16 :goto_0

    .line 221
    :sswitch_10
    sget v10, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v10, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v10, "\u0733\u06da"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x5da9

    const v12, 0x64de78c7

    xor-int/2addr v11, v12

    const v12, -0x734d1748

    goto/16 :goto_0

    .line 72
    :sswitch_11
    sget v10, Ll/ۗ;->֨۬ۖ:I

    if-ltz v10, :cond_6

    goto :goto_5

    :cond_6
    const-string v10, "\u073f\u1a76"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x60c7

    const v12, -0xeeba64b

    xor-int/2addr v11, v12

    const v12, -0x69b9e584

    goto/16 :goto_0

    .line 102
    :sswitch_12
    sget v10, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v10, :cond_8

    :cond_7
    :goto_4
    const-string v10, "\u06e8\u06d8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2b3

    const v12, -0x94c77b1

    xor-int/2addr v11, v12

    const v12, -0xd0c1c21

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u1a77\u1a78"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x27f9

    const v12, 0x47b31f5f

    xor-int/2addr v11, v12

    const v12, 0x19726827

    goto/16 :goto_0

    .line 26
    :sswitch_13
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v10

    if-eqz v10, :cond_9

    :goto_5
    const-string v10, "\u1a73\u1a76"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6529

    const v12, 0x5407b3cb

    xor-int/2addr v11, v12

    const v12, 0x2614bc8d

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u06dc\u073d"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x47

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7b71

    const v12, 0x1c135a48

    xor-int/2addr v11, v12

    const v12, 0x2b87e7ee

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v10

    if-gtz v10, :cond_a

    :goto_6
    const-string v10, "\u1a7a\u06da"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3311

    const v12, 0x760c92e3

    xor-int/2addr v11, v12

    const v12, -0x5e3f8379

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u0733\u1a79"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x431

    const v12, -0x71c49aff

    xor-int/2addr v11, v12

    const v12, 0x11df38e8

    goto/16 :goto_0

    .line 228
    :sswitch_15
    sget v10, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v10, :cond_c

    :cond_b
    :goto_7
    const-string v10, "\u073f\u06d8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x13

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1aa7

    const v12, 0x78676a36

    xor-int/2addr v11, v12

    const v12, -0xd1a9cda

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u05ab\u05a1"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x297b

    const v12, 0x3f801b97    # 1.000842f

    xor-int/2addr v11, v12

    const v12, -0x4ec2e21d

    goto/16 :goto_0

    :cond_d
    :goto_8
    const-string v10, "\u06e4\u1a79"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x55

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x58c1

    const v12, -0x1d032ce6

    xor-int/2addr v11, v12

    const v12, -0x5e9b053b

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u1a79\u05a1"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x15

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1373

    const v12, 0x3d3976b

    xor-int/2addr v11, v12

    const v12, -0x3b49af60

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78787fb4 -> :sswitch_a
        -0x7616be98 -> :sswitch_13
        -0x705cc582 -> :sswitch_4
        -0x6c635cbb -> :sswitch_8
        -0x6aa7e39b -> :sswitch_a
        -0x60d3eb8b -> :sswitch_d
        -0x5294aa1c -> :sswitch_12
        -0x4b9f91dd -> :sswitch_9
        -0x48788fcb -> :sswitch_f
        -0x45ab2407 -> :sswitch_d
        -0x42d563ba -> :sswitch_15
        -0x3b8037cc -> :sswitch_13
        -0x363f2df7 -> :sswitch_11
        -0x35274d3a -> :sswitch_7
        -0x3246285f -> :sswitch_6
        -0x207f306d -> :sswitch_e
        -0x1772caa9 -> :sswitch_1
        -0xa401132 -> :sswitch_a
        -0xa1bd2d5 -> :sswitch_6
        -0x959f9df -> :sswitch_0
        -0x25f8ac2 -> :sswitch_e
        0xaee993f -> :sswitch_7
        0x11ff68cf -> :sswitch_c
        0x145d995b -> :sswitch_2
        0x14cb776e -> :sswitch_5
        0x1b7db1b8 -> :sswitch_15
        0x1c338f1f -> :sswitch_b
        0x1fb5a9b6 -> :sswitch_10
        0x20a724aa -> :sswitch_8
        0x27533655 -> :sswitch_3
        0x295dfe7a -> :sswitch_1
        0x3565f210 -> :sswitch_12
        0x43c6d2c1 -> :sswitch_9
        0x43e6e811 -> :sswitch_10
        0x46f1f5e2 -> :sswitch_11
        0x59851ca0 -> :sswitch_b
        0x5c03fa70 -> :sswitch_f
        0x618c5c7a -> :sswitch_14
        0x65a5ea66 -> :sswitch_4
        0x66566f02 -> :sswitch_c
        0x66c6bfa5 -> :sswitch_2
        0x66ff295c -> :sswitch_a
        0x6dac7150 -> :sswitch_0
        0x6df627fc -> :sswitch_14
        0x7172b3e8 -> :sswitch_5
        0x7cdc7325 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 47

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

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const v39, 0x2cae2f3e

    sget v40, Ll/ۖۗ;->᩶۫ۗ:I

    sget v41, Ll/֫ۚ;->ܽ۠᩹:I

    const-string v42, "\u073f\u1a73"

    invoke-static/range {v42 .. v42}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v42

    xor-int v42, v42, v40

    xor-int v1, v42, v41

    mul-int/lit16 v1, v1, 0x2bf

    const v44, -0x2eb26879

    xor-int v1, v1, v44

    const v44, 0x5f6434

    xor-int v42, v42, v44

    const/4 v4, 0x0

    const/16 v38, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    :goto_0
    xor-int v5, v39, v41

    mul-int/lit16 v5, v5, -0x6eab

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v39, v42, v1

    sparse-switch v39, :sswitch_data_0

    move/from16 v45, v10

    .line 136
    :try_start_0
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    goto/16 :goto_6

    .line 88
    :sswitch_0
    :try_start_1
    invoke-virtual/range {v43 .. v43}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v0, v1, v8}, Lbin/mt/plus/Main;->ۙ(Landroid/app/Activity;Landroid/os/Bundle;Z)V

    goto :goto_1

    .line 104
    :sswitch_1
    invoke-static {v0, v3}, Ll/ۤۡۘ;->ۙ(Lbin/mt/plus/ShortcutActivity;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_1

    .line 93
    :sswitch_2
    :try_start_2
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 94
    invoke-static {v1, v9}, Ll/ۗ;->ۜܳ᩵(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 95
    invoke-static {v1, v6}, Ll/ۗ;->ۜܳ᩵(Ljava/lang/Object;I)Landroid/content/Intent;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    sget-object v5, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-object/from16 v42, v2

    const/16 v2, 0x1c4

    move/from16 v45, v10

    const/16 v10, 0x1a

    :try_start_4
    invoke-static {v5, v2, v10, v4}, Ll/֨᩹;->ۚܺܶ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 96
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 97
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    sget-object v2, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x1de

    const/16 v10, 0x8

    invoke-static {v2, v5, v10, v4}, Ll/֫ۛ;->ۖۖۜ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 98
    invoke-virtual {v1, v2, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 99
    invoke-static {v0, v1}, Ll/֫ۚ;->֨ܺۖ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto/16 :goto_5

    :catch_0
    move-object/from16 v42, v2

    move/from16 v45, v10

    goto/16 :goto_5

    :catch_1
    move-object/from16 v42, v2

    :catch_2
    :goto_1
    move/from16 v45, v10

    goto/16 :goto_9

    :sswitch_3
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v37, :cond_1

    const-string v1, "\u06d9\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, 0x6f

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x7c0d

    const v5, 0x78d997f1

    xor-int/2addr v2, v5

    const v5, 0x5cb9582d

    goto/16 :goto_4

    :sswitch_4
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v36, :cond_1

    const-string v1, "\u06eb\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, -0x3e17

    const v5, 0x5e7f16c

    xor-int/2addr v2, v5

    const v5, 0x65663ac8

    goto/16 :goto_4

    :sswitch_5
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v35, :cond_1

    const-string v1, "\u06df\u1a7b"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x2acf

    const v5, -0x2f96f9da

    xor-int/2addr v2, v5

    const v5, -0x2637170a

    goto/16 :goto_4

    :sswitch_6
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 108
    :try_start_5
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 109
    invoke-static {v1, v9}, Ll/ۗ;->ۜܳ᩵(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 110
    invoke-static {v1, v6}, Ll/֫ᩳ;->۫᩶ۜ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 111
    invoke-static {v0, v1}, Ll/֫ۚ;->֨ܺۖ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_7
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 134
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/ۗ᩺ۜ;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 135
    invoke-static {v1, v9}, Ll/ۗ;->ۜܳ᩵(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 136
    invoke-static {v0, v1}, Ll/ۖۧ;->ܳۨۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_8
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 139
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/᩷۬᩺;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 140
    invoke-static {v1, v9}, Ll/֫ᩳ;->۫᩶ۜ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 141
    invoke-static {v0, v1}, Ll/֫ۚ;->֨ܺۖ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_9
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 129
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/֫ۚۘ;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 130
    invoke-static {v1, v9}, Ll/ۗ;->ۜܳ᩵(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 131
    invoke-static {v0, v1}, Ll/֫ۚ;->֨ܺۖ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_a
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 124
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/ۗܺۜ;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 125
    invoke-static {v1, v9}, Ll/֫ᩳ;->۫᩶ۜ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 126
    invoke-static {v0, v1}, Ll/ۖۧ;->ܳۨۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_b
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 87
    invoke-static {v3}, Ll/ۖۛ;->֨᩶ۜ(Ljava/lang/Object;)Z

    move-result v37
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    const-string v1, "\u1a74\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    mul-int/lit8 v1, v1, 0x49

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x58ff

    const v5, -0x1088f8f7

    xor-int/2addr v2, v5

    const v5, -0x4d2f73f4

    goto/16 :goto_4

    :sswitch_c
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 121
    :try_start_6
    invoke-virtual/range {v43 .. v43}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v0, v1, v8}, Lbin/mt/plus/Main;->ۙ(Landroid/app/Activity;Landroid/os/Bundle;Z)V

    goto/16 :goto_5

    :sswitch_d
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 103
    invoke-static {v3}, Ll/֡ۚ;->۠ܳ۬(Ljava/lang/Object;)Z

    move-result v36
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    const-string v1, "\u1a77\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, -0xb

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, 0x596d

    const v5, 0x41a21a33

    xor-int/2addr v2, v5

    const v5, -0x5e572d6c

    goto/16 :goto_4

    :sswitch_e
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 154
    :try_start_7
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :sswitch_f
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 92
    invoke-static {v3}, Ll/֡ۚ;->۠ܳ۬(Ljava/lang/Object;)Z

    move-result v35
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    const-string v1, "\u0733\u1a7b"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v40, v1

    mul-int/lit8 v1, v1, 0x1b

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x3abf

    const v5, 0x3fc1b512

    xor-int/2addr v2, v5

    const v5, -0x2c5c0aec

    goto/16 :goto_4

    :sswitch_10
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 114
    :try_start_8
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/ۙ۠ۘ;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 115
    invoke-static {v1, v9}, Ll/֫ᩳ;->۫᩶ۜ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 116
    invoke-static {v0, v1}, Ll/ۖۧ;->ܳۨۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    goto/16 :goto_5

    :sswitch_11
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v34, :cond_1

    const-string v1, "\u1a78\u1a73"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, 0x595f

    const v5, -0x48454f49

    xor-int/2addr v2, v5

    const v5, 0x7d062b9c

    goto/16 :goto_4

    :sswitch_12
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v33, :cond_1

    const-string v1, "\u06df\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, -0x37

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, 0x310d

    const v5, 0x588116af

    xor-int/2addr v2, v5

    const v5, -0x61a6c5b6    # -1.1499938E-20f

    goto/16 :goto_4

    :sswitch_13
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v32, :cond_1

    goto/16 :goto_3

    :sswitch_14
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v31, :cond_0

    goto/16 :goto_5

    :sswitch_15
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v30, :cond_0

    goto/16 :goto_5

    :sswitch_16
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v29, :cond_1

    goto/16 :goto_3

    :sswitch_17
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v28, :cond_1

    const-string v1, "\u1a79\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v40, v1

    mul-int/lit8 v1, v1, 0x2d

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x21d

    const v5, -0x393521ae

    xor-int/2addr v2, v5

    const v5, 0x30834c99

    goto/16 :goto_4

    :sswitch_18
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v27, :cond_0

    goto/16 :goto_5

    :sswitch_19
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v26, :cond_0

    goto/16 :goto_5

    :sswitch_1a
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v25, :cond_1

    goto/16 :goto_2

    :sswitch_1b
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v24, :cond_0

    goto/16 :goto_5

    :sswitch_1c
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v23, :cond_1

    const-string v1, "\u0730\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, 0x39

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x1969

    const v5, -0x3ee1a36e

    xor-int/2addr v2, v5

    const v5, 0x571d5958

    goto/16 :goto_4

    :sswitch_1d
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v22, :cond_1

    goto :goto_2

    :sswitch_1e
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v21, :cond_0

    goto/16 :goto_5

    :sswitch_1f
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v20, :cond_0

    goto/16 :goto_5

    :sswitch_20
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v19, :cond_1

    const-string v1, "\u06d8\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, 0x7b

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, 0x77b1

    const v5, -0x754f0b32

    xor-int/2addr v2, v5

    const v5, -0x5e4cba31

    goto/16 :goto_4

    :sswitch_21
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v18, :cond_1

    goto :goto_2

    :sswitch_22
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v17, :cond_0

    goto/16 :goto_5

    :sswitch_23
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v16, :cond_1

    :goto_2
    const-string v1, "\u06e0\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v40, v1

    mul-int/lit8 v1, v1, 0x59

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x6c29

    const v5, -0x2afce0a6

    xor-int/2addr v2, v5

    const v5, 0x1e2f372b

    goto/16 :goto_4

    :sswitch_24
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v15, :cond_1

    :goto_3
    const-string v1, "\u06e8\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, -0x3641

    const v5, 0x6336a04b

    xor-int/2addr v2, v5

    const v5, 0x5a51b282

    goto/16 :goto_4

    :sswitch_25
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v14, :cond_1

    const-string v1, "\u1a73\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x247b

    const v5, 0x654266be

    xor-int/2addr v2, v5

    const v5, -0x4c028503

    goto :goto_4

    :sswitch_26
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v13, :cond_0

    goto :goto_5

    :sswitch_27
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v12, :cond_0

    goto :goto_5

    :cond_0
    const-string v1, "\u0730\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x49

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, -0x47f

    const v5, -0x6b8052c

    xor-int/2addr v2, v5

    const v5, -0x2537e4f7

    goto :goto_4

    :sswitch_28
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v11, :cond_1

    const-string v1, "\u0736\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, -0x66f9

    const v5, 0x792f6df9

    xor-int/2addr v2, v5

    const v5, 0x228378ff

    goto :goto_4

    :sswitch_29
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v45, :cond_1

    const-string v1, "\u06e8\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, -0x25

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x4e67

    const v5, 0x40e26a45

    xor-int/2addr v2, v5

    const v5, 0x35803e16

    :goto_4
    xor-int/2addr v1, v5

    move/from16 v10, v45

    move-object/from16 v46, v42

    move/from16 v42, v1

    move v1, v2

    move-object/from16 v2, v46

    goto/16 :goto_0

    :catch_3
    :cond_1
    :goto_5
    move-object/from16 v2, v42

    goto/16 :goto_9

    :sswitch_2a
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 82
    :try_start_9
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v2, 0x1b4

    const/16 v5, 0x10

    invoke-static {v1, v2, v5, v4}, Ll/֫;->ۗܿܶ([SIII)Ljava/lang/String;

    move-result-object v1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    move-object/from16 v2, v42

    :try_start_a
    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v34
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    const-string v1, "\u1a7a\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x5b55

    const v10, -0x513a011f

    xor-int/2addr v5, v10

    const v10, 0x53220633

    goto/16 :goto_7

    :sswitch_2b
    move/from16 v45, v10

    .line 111
    :try_start_b
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x1a4

    const/16 v10, 0x10

    invoke-static {v1, v5, v10, v4}, Ll/֡ۚ;->ۖ᩶ܿ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v33
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5

    const-string v1, "\u1a73\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x146d

    const v10, 0x3628490c

    xor-int/2addr v5, v10

    const v10, 0x258625b3

    goto/16 :goto_7

    :goto_6
    const/16 v5, 0x194

    const/16 v10, 0x10

    .line 136
    :try_start_c
    invoke-static {v1, v5, v10, v4}, Ll/ۘۛ;->᩷ۧ᩹([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v32
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_5

    const-string v1, "\u06e2\u06d8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x7ee3

    const v10, -0x39e0b070

    xor-int/2addr v5, v10

    const v10, 0x395d4ab9

    goto/16 :goto_7

    :sswitch_2c
    move/from16 v45, v10

    :try_start_d
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x17f

    const/16 v10, 0x15

    invoke-static {v1, v5, v10, v4}, Ll/ۖۧ;->᩶ܽܽ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v31
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    const-string v1, "\u06e2\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x5849

    const v10, 0x5b2c6923

    xor-int/2addr v5, v10

    const v10, 0x4f7650eb

    goto/16 :goto_7

    :sswitch_2d
    move/from16 v45, v10

    :try_start_e
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x16d

    const/16 v10, 0x12

    invoke-static {v1, v5, v10, v4}, Ll/֡ۚ;->ۖ᩶ܿ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v30
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_5

    const-string v1, "\u1a77\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x29b1

    const v10, -0xff208ff

    xor-int/2addr v5, v10

    const v10, 0x32b6be8b

    goto/16 :goto_7

    :sswitch_2e
    move/from16 v45, v10

    :try_start_f
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x15a

    const/16 v10, 0x13

    invoke-static {v1, v5, v10, v4}, Ll/ۗ᩺;->ۧۤ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v29
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_5

    const-string v1, "\u06eb\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x5

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x3883

    const v10, 0x5523b750

    xor-int/2addr v5, v10

    const v10, 0x7c884f79

    goto/16 :goto_7

    :sswitch_2f
    move/from16 v45, v10

    :try_start_10
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x14d

    const/16 v10, 0xd

    invoke-static {v1, v5, v10, v4}, Ll/֡֡;->ۨܶ᩷([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v28
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_5

    const-string v1, "\u06e0\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v40, v1

    mul-int/lit8 v1, v1, -0x1f

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x3793

    const v10, -0x65faadc3

    xor-int/2addr v5, v10

    const v10, 0x5cbe9dbc

    goto/16 :goto_7

    :sswitch_30
    move/from16 v45, v10

    .line 141
    :try_start_11
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x142

    const/16 v10, 0xb

    invoke-static {v1, v5, v10, v4}, Ll/۟;->ܳܳ᩶([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v27
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_5

    const-string v1, "\u1a7b\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0xd2f

    const v10, -0x106b6362

    xor-int/2addr v5, v10

    const v10, 0x2ca4f8b

    goto/16 :goto_7

    :sswitch_31
    move/from16 v45, v10

    :try_start_12
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x132

    const/16 v10, 0x10

    invoke-static {v1, v5, v10, v4}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v26
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_5

    const-string v1, "\u1a74\u06e0"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x395d

    const v10, -0x8360360

    xor-int/2addr v5, v10

    const v10, -0x30f5ec20

    goto/16 :goto_7

    :sswitch_32
    move/from16 v45, v10

    :try_start_13
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x12e

    const/4 v10, 0x4

    invoke-static {v1, v5, v10, v4}, Ll/ۖܽ;->᩸ᩴ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v25
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_5

    const-string v1, "\u05ab\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, 0x39

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x793b

    const v10, -0x4f07b6d3

    xor-int/2addr v5, v10

    const v10, 0x1837683d

    goto/16 :goto_7

    :sswitch_33
    move/from16 v45, v10

    :try_start_14
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x11d

    const/16 v10, 0x11

    invoke-static {v1, v5, v10, v4}, Ll/֨۟;->ᩴۚۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v24
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_5

    const-string v1, "\u06e2\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, -0x67

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x1dd5

    const v10, 0x4276b819

    xor-int/2addr v5, v10

    const v10, 0x16338900

    goto/16 :goto_7

    :sswitch_34
    move/from16 v45, v10

    :try_start_15
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x10b

    const/16 v10, 0x12

    invoke-static {v1, v5, v10, v4}, Ll/ۖܽ;->᩸ᩴ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v23
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_5

    const-string v1, "\u06ec\u1a77"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v40, v1

    mul-int/lit8 v1, v1, 0x2d

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x7dfd

    const v10, 0x5d571366

    xor-int/2addr v5, v10

    const v10, -0x6013403b

    goto/16 :goto_7

    :sswitch_35
    move/from16 v45, v10

    .line 131
    :try_start_16
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0xfd

    const/16 v10, 0xe

    invoke-static {v1, v5, v10, v4}, Ll/ۘۧ;->ܿܶ֫([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v22
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_5

    const-string v1, "\u05a8\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x525b

    const v10, -0x6135b481

    xor-int/2addr v5, v10

    const v10, 0xdeaf02d

    goto/16 :goto_7

    :sswitch_36
    move/from16 v45, v10

    :try_start_17
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0xe9

    const/16 v10, 0x14

    invoke-static {v1, v5, v10, v4}, Ll/֨᩺;->ۧۖܿ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v21
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_5

    const-string v1, "\u0733\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0xf3f

    const v10, -0x73072bbc

    xor-int/2addr v5, v10

    const v10, 0x156611b3

    goto/16 :goto_7

    :sswitch_37
    move/from16 v45, v10

    :try_start_18
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0xd7

    const/16 v10, 0x12

    invoke-static {v1, v5, v10, v4}, Ll/֨֫;->ܺᩴܳ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v20
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_5

    const-string v1, "\u06d9\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v40, v1

    mul-int/lit8 v1, v1, -0x63

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x540f

    const v10, 0x59a51068

    xor-int/2addr v5, v10

    const v10, 0x5db86456

    goto/16 :goto_7

    :sswitch_38
    move/from16 v45, v10

    :try_start_19
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0xca

    const/16 v10, 0xd

    invoke-static {v1, v5, v10, v4}, Ll/֡ۚ;->ۖ᩶ܿ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v19
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_5

    const-string v1, "\u073a\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x73e5

    const v10, 0x88fd14f

    xor-int/2addr v5, v10

    const v10, -0x785fffe4

    goto/16 :goto_7

    :sswitch_39
    move/from16 v45, v10

    .line 126
    :try_start_1a
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0xc4

    const/4 v10, 0x6

    invoke-static {v1, v5, v10, v4}, Ll/ۘۗ;->᩺ۛۙ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v18
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_5

    const-string v1, "\u05a1\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, -0x37

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x5379

    const v10, 0x312ac3b3

    xor-int/2addr v5, v10

    const v10, -0x31bb4664

    goto/16 :goto_7

    :sswitch_3a
    move/from16 v45, v10

    :try_start_1b
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0xb3

    const/16 v10, 0x11

    invoke-static {v1, v5, v10, v4}, Ll/᩶;->ۙ᩷֨([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v17
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_5

    const-string v1, "\u1a75\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, -0x15

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0xd0b

    const v10, 0x13e12639

    xor-int/2addr v5, v10

    const v10, -0x3865457a

    goto/16 :goto_7

    :sswitch_3b
    move/from16 v45, v10

    :try_start_1c
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0xa7

    const/16 v10, 0xc

    invoke-static {v1, v5, v10, v4}, Ll/ۗܺ;->۬ۨܰ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_5

    const-string v1, "\u06df\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, -0x67

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x7fd

    const v10, 0x7e428fc2

    xor-int/2addr v5, v10

    const v10, 0x33f6882e

    goto/16 :goto_7

    :sswitch_3c
    move/from16 v45, v10

    .line 88
    :try_start_1d
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0xa0

    const/4 v10, 0x7

    invoke-static {v1, v5, v10, v4}, Ll/֨۟;->ᩴۚۤ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_5

    const-string v1, "\u06d9\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x3bd

    const v10, 0x7367ab49

    xor-int/2addr v5, v10

    const v10, 0x2ccc9a29

    goto/16 :goto_7

    :sswitch_3d
    move/from16 v45, v10

    .line 121
    :try_start_1e
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x94

    const/16 v10, 0xc

    invoke-static {v1, v5, v10, v4}, Ll/֫ܶ;->۟ۢۚ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_5

    const-string v1, "\u1a74\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, -0x7

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x549b

    const v10, -0x44adb6f9

    xor-int/2addr v5, v10

    const v10, -0x2d645f21

    goto/16 :goto_7

    :sswitch_3e
    move/from16 v45, v10

    .line 104
    :try_start_1f
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x83

    const/16 v10, 0x11

    invoke-static {v1, v5, v10, v4}, Ll/֡֡;->ۨܶ᩷([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_5

    const-string v1, "\u073f\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, -0x41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x3061

    const v10, 0x61522ebe

    xor-int/2addr v5, v10

    const v10, 0x15c38cbe

    goto/16 :goto_7

    :sswitch_3f
    move/from16 v45, v10

    :try_start_20
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x77

    const/16 v10, 0xc

    invoke-static {v1, v5, v10, v4}, Ll/֡۠;->֨ۛ֨([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_5

    const-string v1, "\u06e7\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x24b7

    const v10, 0x6dccf46

    xor-int/2addr v5, v10

    const v10, 0x5f3e304f

    goto/16 :goto_7

    :sswitch_40
    move/from16 v45, v10

    .line 154
    :try_start_21
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x6e

    const/16 v10, 0x9

    invoke-static {v1, v5, v10, v4}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_5

    const-string v1, "\u1a77\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x76ab

    const v10, 0x345d6a2

    xor-int/2addr v5, v10

    const v10, -0x5e57500

    goto/16 :goto_7

    :sswitch_41
    move/from16 v45, v10

    .line 99
    :try_start_22
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x5e

    const/16 v10, 0x10

    invoke-static {v1, v5, v10, v4}, Ll/ۖۧ;->᩶ܽܽ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_5

    const-string v1, "\u06d9\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x29ff

    const v42, -0x4af43f81

    xor-int v5, v5, v42

    const v42, 0x3c70749e

    xor-int v42, v1, v42

    move v1, v5

    goto/16 :goto_0

    :sswitch_42
    return-void

    :sswitch_43
    move/from16 v45, v10

    const/high16 v6, 0x4000000

    const-class v7, Ll/ۨۤۖ;

    const/4 v8, 0x1

    const/high16 v9, 0x10000000

    sparse-switch v44, :sswitch_data_1

    goto/16 :goto_9

    :sswitch_44
    const-string v1, "\u06d6\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, 0x7b

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x355b

    const v10, 0x126d0ed7

    xor-int/2addr v5, v10

    const v10, -0x6aeb9c2e

    goto/16 :goto_7

    :sswitch_45
    const-string v1, "\u1a78\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x56b7

    const v10, 0x69540c0b

    xor-int/2addr v5, v10

    const v10, -0x24299147

    goto/16 :goto_7

    :sswitch_46
    const-string v1, "\u06d7\u06e0"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x9fb

    const v10, 0x1e29c546

    xor-int/2addr v5, v10

    const v10, -0x713f6417

    goto/16 :goto_7

    :sswitch_47
    const-string v1, "\u06e8\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, 0xf

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x5505

    const v10, 0x506c539d

    xor-int/2addr v5, v10

    const v10, -0x2d7ba135

    goto/16 :goto_7

    :sswitch_48
    const-string v1, "\u0730\u1a77"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x670b

    const v10, -0x77f637fe

    xor-int/2addr v5, v10

    const v10, -0x6ee4f7b7

    goto/16 :goto_7

    :sswitch_49
    const-string v1, "\u073f\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x6f77

    const v10, 0x11b1c593

    xor-int/2addr v5, v10

    const v10, -0x7f569bd3

    goto/16 :goto_7

    :sswitch_4a
    const-string v1, "\u1a7b\u06d8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x6ec5

    const v10, -0x410fb812

    xor-int/2addr v5, v10

    const v10, 0x84ecc32

    goto/16 :goto_7

    :sswitch_4b
    const-string v1, "\u05a8\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    mul-int/lit8 v1, v1, -0x27

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x7951

    const v10, -0x19ab8a96

    xor-int/2addr v5, v10

    const v10, 0x47b872f

    goto/16 :goto_7

    :sswitch_4c
    const-string v1, "\u06d8\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, 0x53

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x1e3d

    const v10, -0x58205701

    xor-int/2addr v5, v10

    const v10, 0x6835ecf8

    goto/16 :goto_7

    :sswitch_4d
    const-string v1, "\u1a79\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x3fbd

    const v10, -0x2e71e8a8

    xor-int/2addr v5, v10

    const v10, 0x4390810f

    goto/16 :goto_7

    :sswitch_4e
    const-string v1, "\u06e7\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x7bfb

    const v10, 0x51c5bfd7

    xor-int/2addr v5, v10

    const v10, 0x5692c8f6

    goto/16 :goto_7

    :sswitch_4f
    const-string v1, "\u06dc\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x2937

    const v10, -0x59c5ddca

    xor-int/2addr v5, v10

    const v10, -0x1c8e37f4

    goto/16 :goto_7

    :sswitch_50
    const-string v1, "\u1a78\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x9f1

    const v10, -0x43ef4b45

    xor-int/2addr v5, v10

    const v10, -0x59fc5d7

    goto/16 :goto_7

    :sswitch_51
    const-string v1, "\u06d7\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, -0x31

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x40d5

    const v10, -0x27906aa1

    xor-int/2addr v5, v10

    const v10, 0x6e5bc734

    goto/16 :goto_7

    :sswitch_52
    const-string v1, "\u06eb\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    mul-int/lit8 v1, v1, 0x7b

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x3841

    const v10, 0x67674f5b

    xor-int/2addr v5, v10

    const v10, -0x2a676127

    goto/16 :goto_7

    :sswitch_53
    const-string v1, "\u06dc\u1a73"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, 0x7d

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x1949

    const v10, -0x734bc4d0

    xor-int/2addr v5, v10

    const v10, 0xec3618

    goto/16 :goto_7

    :sswitch_54
    const-string v1, "\u06d7\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x1d4b

    const v10, -0x19453938

    xor-int/2addr v5, v10

    const v10, 0x2c5d6cc0

    goto/16 :goto_7

    :sswitch_55
    const-string v1, "\u1a75\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x548f

    const v10, 0x4c09d328    # 3.612995E7f

    xor-int/2addr v5, v10

    const v10, -0x2386bb22

    goto/16 :goto_7

    :sswitch_56
    const-string v1, "\u06ec\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x74cf

    const v10, -0x2b01857a

    xor-int/2addr v5, v10

    const v10, 0x511c68b7

    goto/16 :goto_7

    :sswitch_57
    const-string v1, "\u1a75\u05ab"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, -0x7b

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x77b9

    const v10, -0x43aebf76

    xor-int/2addr v5, v10

    const v10, -0x1c979986

    goto/16 :goto_7

    :sswitch_58
    const-string v1, "\u06db\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v40, v1

    mul-int/lit8 v1, v1, 0x33

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x21bd

    const v10, -0x1a5f4ae4

    xor-int/2addr v5, v10

    const v10, -0x129a1dfa

    goto/16 :goto_7

    :sswitch_59
    const-string v1, "\u06df\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v41

    mul-int/lit8 v1, v1, 0xf

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0xdc5

    const v10, -0x740024eb

    xor-int/2addr v5, v10

    const v10, -0x6f0ad8db

    goto/16 :goto_7

    :sswitch_5a
    const-string v1, "\u0730\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v40, v1

    mul-int/lit8 v1, v1, 0x5

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x1025

    const v10, 0x5a73d75

    xor-int/2addr v5, v10

    const v10, 0x1aef0657

    goto/16 :goto_7

    :sswitch_5b
    const-string v1, "\u06db\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x2d

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x1739

    const v10, -0x6f051542

    xor-int/2addr v5, v10

    const v10, -0x1bff3a63

    goto/16 :goto_7

    :sswitch_5c
    const-string v1, "\u1a7a\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    mul-int/lit8 v1, v1, -0x1f

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x7ee7

    const v10, 0x3efbd2bc

    xor-int/2addr v5, v10

    const v10, -0x12da5c7e

    goto :goto_7

    :sswitch_5d
    move/from16 v45, v10

    .line 79
    :try_start_23
    invoke-static/range {p0 .. p0}, Ll/֡۠;->۫᩵ۙ(Ljava/lang/Object;)V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_5

    const-string v1, "\u06d7\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x1445

    const v10, 0x686b0d4

    xor-int/2addr v5, v10

    const v10, 0x3e1bfab0

    goto :goto_7

    :sswitch_5e
    move/from16 v45, v10

    .line 82
    :try_start_24
    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v44
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_5

    const-string v1, "\u0733\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x7ae5

    const v10, -0x4cb06001

    xor-int/2addr v5, v10

    const v10, -0x7afc2799

    goto :goto_7

    :sswitch_5f
    move/from16 v45, v10

    if-eqz v38, :cond_2

    const-string v1, "\u1a79\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x57cf

    const v10, -0x190cbfb5

    xor-int/2addr v5, v10

    const v10, -0x34f16eed    # -9343251.0f

    goto :goto_7

    :cond_2
    const-string v1, "\u06e4\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x15e5

    const v10, -0x36b381a2

    xor-int/2addr v5, v10

    const v10, -0x72881b7b

    :goto_7
    xor-int v42, v1, v10

    goto :goto_8

    .line 160
    :sswitch_60
    invoke-static/range {p0 .. p0}, Ll/֡ۛ;->ۨܶ۠(Ljava/lang/Object;)V

    return-void

    :sswitch_61
    move/from16 v45, v10

    .line 75
    :try_start_25
    invoke-static/range {p0 .. p0}, Ll/۟;->ۤۨܺ(Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object v1
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_5

    :try_start_26
    sget-object v5, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v10, 0x51

    const/16 v0, 0x9

    invoke-static {v5, v10, v0, v4}, Ll/ۖ᩸;->ۧۛۘ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-static {v1, v0}, Ll/֡ܽ;->֫ۘۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget-object v0, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v5, 0x5a

    const/4 v10, 0x4

    invoke-static {v0, v5, v10, v4}, Ll/֫᩺;->ܰܶ֨([SIII)Ljava/lang/String;

    move-result-object v0

    .line 77
    invoke-static {v1, v0}, Ll/֡ܽ;->֫ۘۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 78
    invoke-static {v2}, Ll/ۖۛ;->֨᩶ۜ(Ljava/lang/Object;)Z

    move-result v38
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_4

    const-string v0, "\u1a7b\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v41

    xor-int v5, v0, v40

    mul-int/lit16 v5, v5, 0x44f

    const v10, 0x6bdba23a

    xor-int/2addr v5, v10

    const v10, 0x2f3fb13f

    xor-int v42, v0, v10

    move-object/from16 v0, p0

    move-object/from16 v43, v1

    :goto_8
    move v1, v5

    goto/16 :goto_c

    :catch_4
    move-object/from16 v43, v1

    :catch_5
    :goto_9
    const-string v0, "\u0736\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v40, v0

    mul-int/lit8 v0, v0, -0x5b

    xor-int v1, v0, v41

    mul-int/lit16 v1, v1, 0x5a99

    const v5, 0x747f0eb1

    xor-int/2addr v1, v5

    const v5, 0x5b1cbf2e

    goto :goto_b

    :sswitch_62
    move/from16 v45, v10

    .line 73
    invoke-super/range {p0 .. p1}, Ll/ۙ᩶ۘ;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "\u06ec\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v41

    xor-int v1, v0, v40

    mul-int/lit16 v1, v1, -0x74dd

    const v5, 0x6ccbf4dc

    xor-int/2addr v1, v5

    const v5, -0x36743c8d

    goto :goto_b

    :sswitch_63
    move/from16 v45, v10

    const v0, 0x8197

    const v4, 0x8197

    goto :goto_a

    :sswitch_64
    move/from16 v45, v10

    const/16 v0, 0x66c2

    const/16 v4, 0x66c2

    :goto_a
    const-string v0, "\u05a8\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v40, v0

    mul-int/lit8 v0, v0, 0x3d

    xor-int v1, v0, v41

    mul-int/lit16 v1, v1, -0x616b

    const v5, 0x4fdff341

    xor-int/2addr v1, v5

    const v5, -0x16e516c5

    goto :goto_b

    :sswitch_65
    move/from16 v45, v10

    sget-object v0, Lbin/mt/plus/ShortcutActivity;->᩵᩸ۢ:[S

    const/16 v1, 0x50

    aget-short v0, v0, v1

    mul-int v1, v0, v0

    const v5, 0xf837619

    add-int/2addr v1, v5

    add-int/2addr v1, v1

    add-int/lit16 v0, v0, 0x3f05

    mul-int v0, v0, v0

    sub-int/2addr v0, v1

    if-gtz v0, :cond_3

    const-string v0, "\u06db\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v40

    mul-int/lit8 v0, v0, -0x39

    xor-int v1, v0, v41

    mul-int/lit16 v1, v1, 0x4d8f

    const v5, -0x1dc48650

    xor-int/2addr v1, v5

    const v5, -0x59444886

    :goto_b
    xor-int v42, v0, v5

    move-object/from16 v0, p0

    :goto_c
    move/from16 v10, v45

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u0730\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v41

    xor-int v1, v0, v40

    mul-int/lit16 v1, v1, -0x2145

    const v5, 0x151f9a3c

    xor-int/2addr v1, v5

    const v5, -0x5cc3de21

    goto :goto_b

    :sswitch_data_0
    .sparse-switch
        -0x7fc70b09 -> :sswitch_12
        -0x7eb2ffab -> :sswitch_9
        -0x7dd858f0 -> :sswitch_25
        -0x7c0f141a -> :sswitch_32
        -0x7abd043a -> :sswitch_33
        -0x7903a9a7 -> :sswitch_28
        -0x7831a925 -> :sswitch_1
        -0x782d4091 -> :sswitch_60
        -0x77efb34d -> :sswitch_34
        -0x776efab5 -> :sswitch_2b
        -0x754ecff3 -> :sswitch_1
        -0x717150d5 -> :sswitch_1c
        -0x70f5bad5 -> :sswitch_64
        -0x6d860382 -> :sswitch_0
        -0x6d2d4c41 -> :sswitch_6
        -0x6bea7ae9 -> :sswitch_22
        -0x6a096866 -> :sswitch_9
        -0x69a47a6d -> :sswitch_1b
        -0x69969172 -> :sswitch_15
        -0x69931046 -> :sswitch_40
        -0x66034b17 -> :sswitch_5
        -0x65deccff -> :sswitch_14
        -0x63418d14 -> :sswitch_39
        -0x62b8a057 -> :sswitch_3e
        -0x620d29ef -> :sswitch_a
        -0x60a243ed -> :sswitch_27
        -0x5f5e9619 -> :sswitch_14
        -0x590ef2f4 -> :sswitch_36
        -0x56a17227 -> :sswitch_2a
        -0x567c26da -> :sswitch_37
        -0x5579b566 -> :sswitch_31
        -0x4c819029 -> :sswitch_23
        -0x4b43b82d -> :sswitch_30
        -0x4a796b38 -> :sswitch_c
        -0x47378322 -> :sswitch_1b
        -0x46ba3d0b -> :sswitch_33
        -0x45b9fa45 -> :sswitch_37
        -0x45b764d2 -> :sswitch_63
        -0x430914b6 -> :sswitch_11
        -0x416a4e52 -> :sswitch_e
        -0x41349cfb -> :sswitch_3b
        -0x410769f8 -> :sswitch_3d
        -0x40b8e3c4 -> :sswitch_6
        -0x3fc331b1 -> :sswitch_65
        -0x3f14a408 -> :sswitch_5f
        -0x3babda6d -> :sswitch_1f
        -0x3b4ca487 -> :sswitch_5d
        -0x39e0b2b1 -> :sswitch_60
        -0x39b57634 -> :sswitch_19
        -0x37d15920 -> :sswitch_2f
        -0x34fb44e9 -> :sswitch_3c
        -0x332a109b -> :sswitch_40
        -0x32abb7b9 -> :sswitch_f
        -0x31469423 -> :sswitch_3
        -0x30fc434e -> :sswitch_e
        -0x2ed72913 -> :sswitch_13
        -0x2c448963 -> :sswitch_16
        -0x2b15facc -> :sswitch_20
        -0x2afa5928 -> :sswitch_1e
        -0x26348532 -> :sswitch_3b
        -0x24fce310 -> :sswitch_3f
        -0x238b0393 -> :sswitch_32
        -0x220ee144 -> :sswitch_2f
        -0x20e2381f -> :sswitch_2c
        -0x1f98a3c7 -> :sswitch_8
        -0x1ecae711 -> :sswitch_b
        -0x1ec55ee4 -> :sswitch_64
        -0x1dc26f39 -> :sswitch_1d
        -0x1c5111f7 -> :sswitch_2e
        -0x1a2fa51a -> :sswitch_2
        -0x1a19b1ed -> :sswitch_12
        -0x196af659 -> :sswitch_7
        -0x191d94b8 -> :sswitch_1f
        -0x17ad4613 -> :sswitch_3e
        -0x1752aac5 -> :sswitch_17
        -0x13c12cd5 -> :sswitch_39
        -0x1350ed52 -> :sswitch_24
        -0x12e15aba -> :sswitch_18
        -0xd292b57 -> :sswitch_15
        -0xc513dbd -> :sswitch_5e
        -0x6c13820 -> :sswitch_13
        -0x6b01116 -> :sswitch_3d
        -0x3ec03fd -> :sswitch_29
        -0x3ea1c30 -> :sswitch_b
        -0x399c823 -> :sswitch_30
        -0x1878ecb -> :sswitch_42
        -0x12f16ea -> :sswitch_62
        0x3bac07a -> :sswitch_2a
        0x405727c -> :sswitch_10
        0x4bbc518 -> :sswitch_c
        0xa16aff0 -> :sswitch_42
        0xb9b26ec -> :sswitch_16
        0xca6c50a -> :sswitch_34
        0xeea0e5f -> :sswitch_f
        0xf6a7863 -> :sswitch_19
        0xfaeb7d5 -> :sswitch_26
        0x107583cb -> :sswitch_4
        0x10d9c8f1 -> :sswitch_27
        0x11d31a55 -> :sswitch_65
        0x15c89566 -> :sswitch_18
        0x15ce6641 -> :sswitch_28
        0x16e0fa91 -> :sswitch_1e
        0x1873e53a -> :sswitch_35
        0x19ab56e5 -> :sswitch_2
        0x1b031f25 -> :sswitch_38
        0x1c192eb0 -> :sswitch_3a
        0x22afe111 -> :sswitch_21
        0x24c0f638 -> :sswitch_22
        0x24da7c11 -> :sswitch_5d
        0x25469e5b -> :sswitch_10
        0x25e7867c -> :sswitch_31
        0x265ce4a3 -> :sswitch_61
        0x27d9423c -> :sswitch_3c
        0x2a215d88 -> :sswitch_4
        0x2ae5d89e -> :sswitch_5
        0x2c91a69f -> :sswitch_d
        0x2edacfc7 -> :sswitch_29
        0x2fe21001 -> :sswitch_1d
        0x3391711a -> :sswitch_5f
        0x34028303 -> :sswitch_2b
        0x35738f3a -> :sswitch_24
        0x35ee50e5 -> :sswitch_11
        0x37d6003e -> :sswitch_0
        0x3a005019 -> :sswitch_35
        0x3a868a8b -> :sswitch_38
        0x3aeab9db -> :sswitch_2c
        0x3daa72ef -> :sswitch_26
        0x3e60b952 -> :sswitch_62
        0x41f1e162 -> :sswitch_61
        0x492843bf -> :sswitch_1a
        0x49381603 -> :sswitch_8
        0x4a37a020 -> :sswitch_3f
        0x4cd6fd92 -> :sswitch_7
        0x4ceb12ab -> :sswitch_63
        0x4d146ead -> :sswitch_5e
        0x4ea64e51 -> :sswitch_1c
        0x5178a061 -> :sswitch_2d
        0x57cd6c2b -> :sswitch_23
        0x59742175 -> :sswitch_17
        0x5976b2af -> :sswitch_41
        0x5e6123ce -> :sswitch_3a
        0x64c6ce75 -> :sswitch_21
        0x68773021 -> :sswitch_20
        0x69ae2656 -> :sswitch_3
        0x6ad4e8ae -> :sswitch_43
        0x6bcac1be -> :sswitch_a
        0x6f7e5515 -> :sswitch_2e
        0x6fa989a3 -> :sswitch_25
        0x72a56c33 -> :sswitch_2d
        0x739d65fa -> :sswitch_d
        0x77499bfe -> :sswitch_41
        0x798d6c57 -> :sswitch_36
        0x7b7f022f -> :sswitch_43
        0x7ed14402 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x7e8485e5 -> :sswitch_5c
        -0x71f9d0f0 -> :sswitch_5b
        -0x68b6a4cc -> :sswitch_5a
        -0x5a081a62 -> :sswitch_59
        -0x53fe9d70 -> :sswitch_58
        -0x4b4b8bd8 -> :sswitch_57
        -0x48425cb3 -> :sswitch_56
        -0x42b42fb3 -> :sswitch_55
        -0x4169f0ae -> :sswitch_54
        -0x2ed608ef -> :sswitch_53
        -0x27c93fab -> :sswitch_52
        -0x235ea166 -> :sswitch_51
        -0x2162256e -> :sswitch_50
        -0x1c452636 -> :sswitch_4f
        -0xe96ba94 -> :sswitch_4e
        0x308163 -> :sswitch_4d
        0x17cc60a -> :sswitch_4c
        0x219ed87 -> :sswitch_4b
        0x23178ff3 -> :sswitch_4a
        0x2371f7dc -> :sswitch_49
        0x3e118557 -> :sswitch_48
        0x61697b6b -> :sswitch_47
        0x6696ba18 -> :sswitch_46
        0x6dca5a6e -> :sswitch_45
        0x7e226158 -> :sswitch_44
    .end sparse-switch
.end method

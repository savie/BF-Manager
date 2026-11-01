.class public final synthetic Ll/۬᩶ۘ;
.super Ljava/lang/Object;
.source "650G"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۡܳ᩵:[S


# instance fields
.field public final synthetic ܺ:Ll/᩵ۡۜ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۬᩶ۘ;->ۡܳ᩵:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x21d1s
        -0x4e5fs
        -0x6d89s
        0x61e3s
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/᩵ۡۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬᩶ۘ;->ܺ:Ll/᩵ۡۜ;

    return-void
.end method


# virtual methods
.method public final run()V
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

    const/4 v13, 0x0

    const v14, 0x1854e1eb

    sget v15, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v16, Ll/֫ۚ;->ܽ۠᩹:I

    const-string v17, "\u06d7\u1a73"

    invoke-static/range {v17 .. v17}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v17

    sub-int v17, v16, v17

    mul-int/lit8 v17, v17, -0x53

    xor-int v0, v17, v15

    mul-int/lit16 v0, v0, 0x2663

    const v19, -0x2b484d15

    xor-int v0, v0, v19

    const v19, 0x32c5cbe4

    xor-int v17, v17, v19

    move-object/from16 v19, v3

    move-object v12, v11

    move/from16 v18, v17

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, 0x1854e1eb

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v17, v15

    mul-int/lit16 v4, v4, -0x3681

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v17, v18, v0

    sparse-switch v17, :sswitch_data_0

    const/4 v14, 0x3

    sget v0, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v0, :cond_3

    goto/16 :goto_2

    .line 64
    :sswitch_0
    sget-boolean v0, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-nez v0, :cond_2

    goto :goto_1

    .line 89
    :sswitch_1
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v0

    if-lez v0, :cond_8

    goto/16 :goto_7

    :sswitch_2
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v0, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v0, :cond_0

    goto/16 :goto_7

    :cond_0
    :goto_1
    const-string v0, "\u06e2\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x794d

    const v18, -0x4629416e

    xor-int v4, v4, v18

    const v18, 0xc8b520f

    goto/16 :goto_8

    .line 85
    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto/16 :goto_7

    :sswitch_4
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    return-void

    .line 107
    :sswitch_5
    :try_start_0
    invoke-virtual {v1, v2}, Landroid/view/Window;->setWindowAnimations(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    .line 104
    :sswitch_6
    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    const v2, 0x7e46480d

    xor-int/2addr v2, v0

    const-string v0, "\u05a1\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x9

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x567b

    const v18, 0x48e1a7a0    # 462141.0f

    xor-int v4, v4, v18

    const v18, 0x620e64bc

    goto/16 :goto_8

    :sswitch_7
    invoke-static {v12, v13, v14, v11}, Ll/֫ܽ;->ᩴ᩸ۗ([SIII)Ljava/lang/String;

    move-result-object v3

    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v0, :cond_1

    goto/16 :goto_7

    :cond_1
    const-string v0, "\u1a79\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x6d

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x7d53

    const v18, -0x144b2885

    xor-int v4, v4, v18

    const v18, 0x66cab1c

    goto/16 :goto_8

    :cond_2
    :goto_2
    const-string v0, "\u06eb\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x542b

    const v18, -0x16f5c308

    xor-int v4, v4, v18

    const v18, 0x1e80ed84

    goto/16 :goto_8

    :cond_3
    const-string v0, "\u1a77\u1a78"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x6d2b

    const v18, 0x3bb10152

    xor-int v4, v4, v18

    const v18, -0x7d779210

    goto/16 :goto_8

    :sswitch_8
    sget-object v12, Ll/۬᩶ۘ;->ۡܳ᩵:[S

    const/4 v13, 0x1

    .line 5
    sget v0, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v0, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v0, "\u073f\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x76f1

    const v18, 0x76f2a2db

    xor-int v4, v4, v18

    const v18, 0x39ba63f8

    goto/16 :goto_8

    :sswitch_9
    return-void

    :sswitch_a
    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Ll/۬᩶ۘ;->ܺ:Ll/᩵ۡۜ;

    .line 104
    invoke-virtual {v1}, Ll/᩵ۡۜ;->᩹()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v4, "\u06e0\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v16, v4

    mul-int/lit8 v4, v4, 0x5d

    xor-int v0, v4, v15

    mul-int/lit16 v0, v0, 0x121f

    const v18, -0x65c3f128

    xor-int v0, v0, v18

    const v18, 0x4ec534f9

    xor-int v18, v4, v18

    goto/16 :goto_0

    :catch_0
    :cond_5
    :goto_3
    const-string v0, "\u0730\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x59

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x1fdb

    const v18, -0x5f7c78f7

    xor-int v4, v4, v18

    const v18, -0x3f121705    # -7.43469f

    goto/16 :goto_8

    :sswitch_b
    const v0, 0xf00c

    const v11, 0xf00c

    goto :goto_4

    :sswitch_c
    const v0, 0xe6a0

    const v11, 0xe6a0

    :goto_4
    const-string v0, "\u06dc\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x6d6b

    const v18, 0x1681e0f

    xor-int v4, v4, v18

    const v18, 0x1952ce4e

    goto/16 :goto_8

    :sswitch_d
    add-int v0, v6, v10

    mul-int v0, v0, v0

    sub-int/2addr v0, v9

    if-lez v0, :cond_6

    const-string v0, "\u06e1\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0xf07

    const v18, 0xda4c4fe

    xor-int v4, v4, v18

    const v18, -0x4f2fbac2

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u1a75\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x7b

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x43bb

    const v18, 0x2d68ca54

    xor-int v4, v4, v18

    const v18, -0x39cada1c

    goto/16 :goto_8

    :sswitch_e
    const/16 v10, 0x7b5

    .line 28
    sget v0, Ll/֫;->ܶܺ᩻:I

    if-ltz v0, :cond_7

    goto :goto_6

    :cond_7
    const-string v0, "\u06e2\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x3557

    const v18, 0x2873dd3a

    xor-int v4, v4, v18

    const v18, -0x3f84dc0c

    goto/16 :goto_8

    :sswitch_f
    add-int v0, v7, v8

    add-int v9, v0, v0

    .line 69
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_8
    :goto_5
    const-string v0, "\u06e4\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x4867

    const v18, 0x6692aa16

    xor-int v4, v4, v18

    const v18, 0x2bd7497c

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u1a7b\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x77

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x1293

    const v18, 0x4c21bb8c    # 4.239723E7f

    xor-int v4, v4, v18

    const v18, -0x1d474cc2

    goto/16 :goto_8

    :sswitch_10
    mul-int v7, v6, v6

    const v8, 0x3b65f9

    .line 45
    sget v0, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v0, :cond_a

    :goto_6
    const-string v0, "\u05a1\u1a7b"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x2d

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x36d

    const v18, 0x5c3e3d3e

    xor-int v4, v4, v18

    const v18, 0x70f1f440

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u06e0\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x3d

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x57df

    const v18, 0xb313174

    xor-int v4, v4, v18

    const v18, -0x14ed2a42

    goto/16 :goto_8

    :sswitch_11
    aget-short v6, v19, v5

    sget v0, Ll/۟;->ۨᩴۛ:I

    if-ltz v0, :cond_b

    goto :goto_7

    :cond_b
    const-string v0, "\u06e4\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x29db

    const v18, 0x3de45ced

    xor-int v4, v4, v18

    const v18, 0x56d9f111

    goto :goto_8

    :sswitch_12
    const/4 v5, 0x0

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v0

    if-gtz v0, :cond_c

    goto :goto_7

    :cond_c
    const-string v0, "\u06d7\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x79

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x702b

    const v18, 0x11914f51

    xor-int v4, v4, v18

    const v18, -0x512aa996

    goto :goto_8

    .line 9
    :sswitch_13
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_7

    :cond_d
    const-string v0, "\u1a75\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x53e1

    const v18, -0x6628354b

    xor-int v4, v4, v18

    const v18, -0x30ce0565

    goto :goto_8

    :sswitch_14
    sget-object v19, Ll/۬᩶ۘ;->ۡܳ᩵:[S

    .line 101
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v0

    if-ltz v0, :cond_e

    :goto_7
    const-string v0, "\u1a76\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x71

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x38bd

    const v18, 0x1b6f306b

    xor-int v4, v4, v18

    const v18, 0x40b0df02

    goto :goto_8

    :cond_e
    const-string v0, "\u06d8\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x61

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x1651

    const v18, 0x407c7f57

    xor-int v4, v4, v18

    const v18, 0x295361c

    :goto_8
    xor-int v18, v0, v18

    move v0, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x752a7fe3 -> :sswitch_2
        -0x7102faee -> :sswitch_f
        -0x673924b8 -> :sswitch_8
        -0x5e43b18a -> :sswitch_d
        -0x59cf5fe8 -> :sswitch_6
        -0x5129f1fb -> :sswitch_4
        -0x4cd2a9cd -> :sswitch_4
        -0x4c1cd5de -> :sswitch_9
        -0x4b74362e -> :sswitch_14
        -0x47daa282 -> :sswitch_b
        -0x33bef035 -> :sswitch_1
        -0x315d37bf -> :sswitch_7
        -0x2b62cbd2 -> :sswitch_3
        -0x1ca3a716 -> :sswitch_3
        -0x1b4d77c3 -> :sswitch_13
        -0xea8190d -> :sswitch_1
        -0xdb7b93e -> :sswitch_11
        -0x97a3cb8 -> :sswitch_a
        -0x824c783 -> :sswitch_10
        0x2ef9988 -> :sswitch_c
        0x3fae665 -> :sswitch_13
        0xf9761c8 -> :sswitch_14
        0x11d28a69 -> :sswitch_b
        0x1bc4403d -> :sswitch_6
        0x20e5174c -> :sswitch_12
        0x27969a14 -> :sswitch_5
        0x34e63c9c -> :sswitch_5
        0x363f3025 -> :sswitch_c
        0x36bdc60d -> :sswitch_0
        0x37d59a58 -> :sswitch_11
        0x3afddc11 -> :sswitch_9
        0x4445b199 -> :sswitch_12
        0x44ece164 -> :sswitch_2
        0x4958b3de -> :sswitch_f
        0x585a966c -> :sswitch_10
        0x597973bc -> :sswitch_a
        0x59e5e3aa -> :sswitch_0
        0x6179ecbc -> :sswitch_d
        0x6392e0d6 -> :sswitch_e
        0x63a04dd7 -> :sswitch_e
        0x6d5cf5c9 -> :sswitch_7
        0x6fdc1799 -> :sswitch_8
    .end sparse-switch
.end method

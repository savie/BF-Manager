.class public final synthetic Ll/۟᩷ۘ;
.super Ljava/lang/Object;
.source "12B7"

# interfaces
.implements Ljava/util/function/Function;


# static fields
.field private static final ۜܽ۬:[S


# instance fields
.field public final synthetic ܺ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۟᩷ۘ;->ۜܽ۬:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1ef3s
        -0x55d4s
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۟᩷ۘ;->ܺ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩻ᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
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

    const v13, -0x4880b808

    sget v14, Ll/ۖܽ;->ܳ۠᩹:I

    sget v15, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v16, "\u06e7\u1a75"

    invoke-static/range {v16 .. v16}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v16

    add-int v16, v16, v14

    mul-int/lit8 v16, v16, 0x3

    xor-int v0, v16, v15

    mul-int/lit16 v0, v0, 0x1e2f

    const v18, -0x1dd07296

    xor-int v0, v0, v18

    const v18, 0x3f49533d

    xor-int v16, v16, v18

    const/16 v17, 0x0

    :goto_0
    xor-int/2addr v13, v15

    mul-int/lit16 v13, v13, 0x631b

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v0, v13

    xor-int v13, v16, v0

    sparse-switch v13, :sswitch_data_0

    .line 0
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Integer;

    sget v0, Ll/۬ۙۤ;->ܶܰ:I

    const/4 v0, 0x0

    return-object v0

    :sswitch_0
    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-gez v0, :cond_1

    :cond_0
    move/from16 v16, v13

    goto/16 :goto_4

    :cond_1
    move/from16 v16, v13

    goto/16 :goto_6

    .line 197
    :sswitch_1
    sget v0, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v0, :cond_0

    goto :goto_1

    .line 166
    :sswitch_2
    sget-boolean v0, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-eqz v0, :cond_2

    move/from16 v16, v13

    goto/16 :goto_2

    :cond_2
    :goto_1
    const-string v0, "\u06df\u06df"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    move/from16 v16, v13

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, 0x30a9

    const v18, 0x2cc9ebac

    xor-int v13, v13, v18

    const v18, 0x2774a159

    goto/16 :goto_7

    :sswitch_3
    move/from16 v16, v13

    .line 112
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    goto/16 :goto_2

    .line 53
    :sswitch_4
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    const/4 v0, 0x0

    return-object v0

    .line 206
    :sswitch_5
    check-cast v3, Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    move/from16 v16, v13

    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 49
    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v0, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v0, "\u1a77\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x11

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, 0x5cf5

    const v18, 0x558b3f2b

    xor-int v13, v13, v18

    const v18, -0x757f7a4a

    goto/16 :goto_7

    :sswitch_7
    move/from16 v16, v13

    const/4 v0, 0x1

    .line 206
    invoke-static {v11, v12, v0, v10}, Ll/ۗ۬;->᩶ۖۚ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget v0, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v0, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v0, "\u1a76\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x67

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, -0x342b

    const v18, 0x87c07af

    xor-int v13, v13, v18

    const v18, 0x5f0c3a6a

    goto/16 :goto_7

    :sswitch_8
    move/from16 v16, v13

    invoke-static {v1, v2}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v11, Ll/۟᩷ۘ;->ۜܽ۬:[S

    const/4 v12, 0x1

    .line 30
    sget v0, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v0, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u1a76\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, -0x2503

    const v18, 0x6f9a58c0

    xor-int v13, v13, v18

    const v18, -0x362fec9d

    goto/16 :goto_7

    :sswitch_9
    move/from16 v16, v13

    .line 206
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 114
    sget v0, Ll/۟;->ۨᩴۛ:I

    if-ltz v0, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v0, "\u073a\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x2d

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, -0x1537

    const v18, 0x30ad1d82

    xor-int v13, v13, v18

    const v18, -0x20a0700f

    goto/16 :goto_7

    :sswitch_a
    move/from16 v16, v13

    .line 7
    move-object/from16 v17, p1

    check-cast v17, Ljava/util/Map$Entry;

    .line 206
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    sget-boolean v0, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v0, :cond_7

    :goto_2
    const-string v0, "\u06da\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, 0x6e91

    const v18, 0x78bb98ec

    xor-int v13, v13, v18

    const v18, 0x6d377efc

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u1a77\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, 0x19c3

    const v18, -0x98d29df

    xor-int v13, v13, v18

    const v18, 0x8eb066

    goto/16 :goto_7

    .line 0
    :sswitch_b
    move-object/from16 v0, p1

    check-cast v0, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$MF91EOTB8qNRHvQE-KN0aMZrRQ0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object v0

    return-object v0

    :sswitch_c
    move-object/from16 v0, p1

    check-cast v0, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$WM4QFraRCYJq6wL5AfI7fwfZE10(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object v0

    return-object v0

    :sswitch_d
    move-object/from16 v0, p1

    check-cast v0, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$uW4HBIifAUZXF-Euk1B4yNI2ZQs(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object v0

    return-object v0

    :sswitch_e
    move-object/from16 v0, p1

    check-cast v0, Ll/ܰ᩷᩺;

    invoke-virtual {v0}, Ll/ܰ᩷᩺;->ۙ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_f
    move-object/from16 v0, p0

    move/from16 v16, v13

    .line 2
    iget v13, v0, Ll/۟᩷ۘ;->ܺ:I

    packed-switch v13, :pswitch_data_0

    const-string v0, "\u05ab\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x51

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, 0x46f3

    const v18, 0x5b8e2859

    xor-int v13, v13, v18

    const v18, -0x333e5340

    goto/16 :goto_7

    :pswitch_0
    const-string v13, "\u06da\u1a78"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v15

    xor-int v0, v13, v14

    mul-int/lit16 v0, v0, -0x3821

    const v18, 0x9211a60

    xor-int v0, v0, v18

    const v18, 0x636dd875

    xor-int v13, v13, v18

    move/from16 v19, v16

    move/from16 v16, v13

    goto/16 :goto_8

    :pswitch_1
    const-string v0, "\u0736\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x45

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, -0xd6b

    const v18, 0x447689e1

    xor-int v13, v13, v18

    const v18, 0x3d13ee3b

    goto/16 :goto_7

    :pswitch_2
    const-string v0, "\u06e4\u05ab"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x33

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, 0x53ed

    const v18, -0x91688af

    xor-int v13, v13, v18

    const v18, -0x402555fd

    goto/16 :goto_7

    :pswitch_3
    const-string v0, "\u1a79\u1a7a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, 0x51c1

    const v18, 0x4a3876c6    # 3022257.5f

    xor-int v13, v13, v18

    const v18, -0x7662b04c

    goto/16 :goto_7

    :pswitch_4
    const-string v0, "\u06e0\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, -0x23b5

    const v18, 0x7b4408c5

    xor-int v13, v13, v18

    const v18, -0x4ac85f2a

    goto/16 :goto_7

    :sswitch_10
    move/from16 v16, v13

    const/16 v0, 0x52d7

    const/16 v10, 0x52d7

    goto :goto_3

    :sswitch_11
    move/from16 v16, v13

    const v0, 0xaa11

    const v10, 0xaa11

    :goto_3
    const-string v0, "\u06d7\u1a74"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, -0x4757

    const v18, -0x20eca273

    xor-int v13, v13, v18

    const v18, -0x337d68bd    # -6.8467224E7f

    goto/16 :goto_7

    :sswitch_12
    move/from16 v16, v13

    add-int v0, v6, v9

    mul-int v0, v0, v0

    sub-int/2addr v0, v8

    if-gez v0, :cond_8

    const-string v0, "\u06d9\u1a7b"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, -0x7881

    const v18, 0x3767486

    xor-int v13, v13, v18

    const v18, -0xd6b5d01

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u1a75\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, 0x1c2b

    const v18, 0x627862b2

    xor-int v13, v13, v18

    const v18, 0x48009284

    goto/16 :goto_7

    :sswitch_13
    move/from16 v16, v13

    add-int/lit8 v8, v7, 0x1

    const/4 v9, 0x1

    sget v0, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v0, :cond_9

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u06d6\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, -0x4c6f

    const v18, -0x6f627732

    xor-int v13, v13, v18

    const v18, -0x14c666cc

    goto/16 :goto_7

    :sswitch_14
    move/from16 v16, v13

    aget-short v6, v4, v5

    mul-int/lit8 v7, v6, 0x2

    .line 25
    sget-boolean v0, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v0, :cond_a

    goto/16 :goto_6

    :cond_a
    const-string v0, "\u0730\u06df"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x73

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, -0x69db

    const v18, 0x32fb0bf3

    xor-int v13, v13, v18

    const v18, 0x4fb9154c

    goto/16 :goto_7

    :sswitch_15
    move/from16 v16, v13

    const/4 v5, 0x0

    .line 90
    sget-boolean v0, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v0, :cond_b

    :goto_4
    const-string v0, "\u06db\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x7f

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, -0x35d5

    const v18, -0x5164ac4e

    xor-int v13, v13, v18

    const v18, -0x113f671c

    goto/16 :goto_7

    :cond_b
    const-string v0, "\u06d7\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x57

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, -0x6ddb

    const v18, 0x756714d4

    xor-int v13, v13, v18

    const v18, -0x5b4e9d3f

    goto :goto_7

    :sswitch_16
    move/from16 v16, v13

    sget-object v4, Ll/۟᩷ۘ;->ۜܽ۬:[S

    .line 153
    sget v0, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v0, :cond_c

    :goto_5
    const-string v0, "\u1a74\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, 0x74d5

    const v18, 0x6e2eecfd

    xor-int v13, v13, v18

    const v18, 0x395f345e

    goto :goto_7

    :cond_c
    const-string v0, "\u06d8\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x55

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, -0x368b

    const v18, -0x1f91072

    xor-int v13, v13, v18

    const v18, 0x3a06dd45

    goto :goto_7

    :sswitch_17
    move/from16 v16, v13

    .line 160
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v0

    if-ltz v0, :cond_d

    :goto_6
    const-string v0, "\u073a\u06d7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x47

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, -0x7f8b

    const v18, 0x40e2d2a3

    xor-int v13, v13, v18

    const v18, -0x3446000

    goto :goto_7

    :cond_d
    const-string v0, "\u1a78\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, -0x4f09

    const v18, 0x70486ce8

    xor-int v13, v13, v18

    const v18, 0x58ea738b

    :goto_7
    xor-int v0, v0, v18

    move/from16 v19, v16

    move/from16 v16, v0

    move v0, v13

    :goto_8
    move/from16 v13, v19

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7dc9af3d -> :sswitch_13
        -0x7ce7d7cb -> :sswitch_7
        -0x6c6338f1 -> :sswitch_5
        -0x6a0c7b41 -> :sswitch_14
        -0x5553ca8c -> :sswitch_e
        -0x531fc8b1 -> :sswitch_d
        -0x48157193 -> :sswitch_8
        -0x47ca1f99 -> :sswitch_b
        -0x451effeb -> :sswitch_9
        -0x3c8c5f31 -> :sswitch_3
        -0x3970c8ba -> :sswitch_2
        -0x38759a70 -> :sswitch_c
        -0x37609af8 -> :sswitch_d
        -0x2ce6fcfc -> :sswitch_f
        -0x28158419 -> :sswitch_10
        -0x2534a28b -> :sswitch_1
        -0x1a9e06c1 -> :sswitch_14
        -0x18687811 -> :sswitch_6
        -0x16b1b444 -> :sswitch_6
        -0x1581ec65 -> :sswitch_5
        -0x1352e0d0 -> :sswitch_7
        -0xb5df293 -> :sswitch_12
        -0xd416b1 -> :sswitch_16
        0x1430f79 -> :sswitch_13
        0x20a4d63 -> :sswitch_3
        0x121feab4 -> :sswitch_c
        0x139942b9 -> :sswitch_8
        0x16bd722e -> :sswitch_11
        0x1c223960 -> :sswitch_0
        0x1da203c9 -> :sswitch_0
        0x1f168480 -> :sswitch_9
        0x27858499 -> :sswitch_e
        0x2ddcb390 -> :sswitch_12
        0x33364931 -> :sswitch_a
        0x38932411 -> :sswitch_1
        0x38e9feba -> :sswitch_4
        0x3ce99b91 -> :sswitch_17
        0x43745f57 -> :sswitch_2
        0x445007b5 -> :sswitch_15
        0x479e842c -> :sswitch_f
        0x4849a7c7 -> :sswitch_4
        0x48f221b9 -> :sswitch_a
        0x619c6cc5 -> :sswitch_17
        0x6496b609 -> :sswitch_15
        0x6d7d9e4d -> :sswitch_11
        0x794cd4bf -> :sswitch_10
        0x7c774f78 -> :sswitch_b
        0x7d970aaa -> :sswitch_16
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩻ᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

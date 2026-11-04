.class public final Ll/ۡۢ᩻;
.super Ljava/lang/Object;
.source "96NX"


# static fields
.field private static final ֡᩻۠:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x48

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۡۢ᩻;->֡᩻۠:[S

    return-void

    :array_0
    .array-data 2
        0x1ed4s
        0x5969s
        0x597bs
        0x596cs
        0x5976s
        0x5969s
        0x5972s
        0x597as
        0x5970s
        0x37as
        -0x4a09s
        -0x4a0fs
        -0x4a19s
        -0x4a10s
        -0x4a23s
        -0x4a14s
        -0x4a1ds
        -0x4a11s
        -0x4a19s
        -0x4a09s
        -0x4a0fs
        -0x4a19s
        -0x4a10s
        -0x4a23s
        -0x4a11s
        -0x4a1ds
        -0x4a1fs
        -0x4a16s
        -0x4a50s
        -0x4a3fs
        -0x4a1ds
        -0x4a14s
        -0x4a14s
        -0x4a13s
        -0x4a0as
        -0x4a5es
        -0x4a0fs
        -0x4a1ds
        -0x4a0cs
        -0x4a19s
        -0x4a5es
        -0x4a12s
        -0x4a13s
        -0x4a1fs
        -0x4a1ds
        -0x4a12s
        -0x4a5es
        -0x4a12s
        -0x4a13s
        -0x4a1bs
        -0x4a15s
        -0x4a14s
        -0x4a5es
        -0x4a15s
        -0x4a1as
        -0x4a19s
        -0x4a14s
        -0x4a0as
        -0x4a15s
        -0x4a0as
        -0x4a05s
        0x139cs
        -0x6373s
        -0x6375s
        -0x6363s
        -0x6376s
        -0x6359s
        -0x636bs
        -0x6367s
        -0x6365s
        -0x6370s
        -0x6336s
    .end array-data
.end method

.method public static ۙ()Ljava/lang/String;
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

    const v19, -0x5a873a8d

    sget v20, Ll/ۖܰ;->۟֫ܽ:I

    sget v21, Ll/ۗ֡;->ۜ᩻۫:I

    const-string v22, "\u06d6\u06e4"

    invoke-static/range {v22 .. v22}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v21

    xor-int v0, v22, v20

    mul-int/lit16 v0, v0, -0x1dab

    const v24, 0x625fd460

    xor-int v0, v0, v24

    const v24, 0x6fd76739

    xor-int v22, v22, v24

    move-object/from16 v18, v3

    move-object/from16 v24, v4

    move-object/from16 v13, v16

    const/4 v3, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v23, 0x0

    :goto_0
    xor-int v4, v19, v20

    mul-int/lit16 v4, v4, -0x76f5

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v19, v22, v0

    sparse-switch v19, :sswitch_data_0

    .line 48
    invoke-static {v13, v14, v3, v15}, Ll/ۗۖ;->᩵᩻ۘ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 0
    invoke-static {v2, v5, v0}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 50
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    .line 47
    :sswitch_0
    sget v0, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v0, :cond_0

    goto :goto_4

    :cond_0
    :goto_1
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    goto/16 :goto_10

    .line 2
    :sswitch_1
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v0

    if-gez v0, :cond_1

    :goto_2
    move-object/from16 v22, v1

    move/from16 v1, v16

    move-object/from16 v4, v24

    :goto_3
    move-object/from16 v16, v2

    goto/16 :goto_f

    :cond_1
    :goto_4
    const-string v0, "\u05a1\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x51

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, -0x113d

    const v22, -0x8d4c027

    xor-int v4, v4, v22

    const v22, 0x19e74769

    goto/16 :goto_5

    .line 29
    :sswitch_2
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    goto/16 :goto_8

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    return-object v11

    :sswitch_6
    return-object v12

    .line 53
    :sswitch_7
    :try_start_0
    invoke-virtual {v1, v11}, Ll/᩷ۨᩴ;->᩻(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v0, "\u06d8\u1a76"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, 0x7c87

    const v22, 0x5fb68c59

    xor-int v4, v4, v22

    const v22, -0x6bee8f3d

    goto/16 :goto_5

    .line 44
    :sswitch_8
    :try_start_1
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->᩵᩷()Ljava/lang/String;

    move-result-object v12
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    const-string v0, "\u06df\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x45

    xor-int v4, v0, v20

    mul-int/lit16 v4, v4, -0x57c5

    const v22, -0x34e7adb4    # -9982540.0f

    xor-int v4, v4, v22

    const v22, 0x4b098485    # 9012357.0f

    goto/16 :goto_5

    :catch_1
    move-object/from16 v4, v24

    goto/16 :goto_7

    .line 51
    :sswitch_9
    invoke-static {v8, v9, v10}, Ll/ۗ᩵;->᩸ᩴۡ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    const-string v0, "\u06ec\u06e1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v4, v0, v20

    mul-int/lit16 v4, v4, 0x5ac1

    const v22, -0x12347c20

    xor-int v4, v4, v22

    const v22, -0x329c4208

    goto/16 :goto_5

    .line 50
    :sswitch_a
    invoke-static {v6, v7}, Ll/ۘ֡;->ۛܺ۟(Ljava/lang/Object;Ljava/lang/Object;)[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳ֫ܺ;->ۙ([B)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/16 v10, 0x10

    sget v0, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v0, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v0, "\u073d\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, -0x310d

    const v22, 0x2d47dc39

    xor-int v4, v4, v22

    const v22, 0x1799f200

    goto/16 :goto_5

    :cond_4
    const-string v0, "\u06df\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, 0x77

    xor-int v4, v0, v20

    mul-int/lit16 v4, v4, 0x66f

    const v22, -0x476365ef

    xor-int v4, v4, v22

    const v22, -0x7efae2f

    goto :goto_5

    :sswitch_b
    move-object/from16 v4, v24

    .line 48
    invoke-static {v2, v4}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v5, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    sget-object v13, Ll/ۡۢ᩻;->֡᩻۠:[S

    const/4 v14, 0x1

    .line 23
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v0

    if-gtz v0, :cond_5

    move-object/from16 v22, v1

    move/from16 v1, v16

    const/16 v3, 0x8

    goto/16 :goto_3

    :cond_5
    const-string v0, "\u073d\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, 0x169b

    const v24, -0x223c91fa

    xor-int v3, v3, v24

    const v24, 0x16f6bb78

    xor-int v0, v0, v24

    move/from16 v22, v0

    move v0, v3

    move-object/from16 v24, v4

    const/16 v3, 0x8

    goto/16 :goto_0

    .line 48
    :sswitch_c
    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    invoke-static {v2, v0}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v24, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 29
    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_6

    move-object/from16 v22, v1

    move-object/from16 v0, v18

    goto :goto_6

    :cond_6
    const-string v0, "\u073f\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x7b

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, -0x6153

    const v22, 0x5cb4a2c2

    xor-int v4, v4, v22

    const v22, 0x1306a46e

    :goto_5
    xor-int v22, v0, v22

    move v0, v4

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v4, v24

    .line 48
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-static {v2, v0}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-static {v2, v0}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v0, :cond_7

    move-object/from16 v22, v1

    goto/16 :goto_8

    :cond_7
    const-string v0, "\u1a73\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x1d

    move-object/from16 v22, v1

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x24ed

    const v24, 0x1cad343

    xor-int v1, v1, v24

    const v24, 0x7551a592

    goto/16 :goto_c

    :sswitch_e
    move-object/from16 v22, v1

    move-object/from16 v0, v18

    move-object/from16 v4, v24

    invoke-static {v2, v0}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-static {v2, v1}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v1, :cond_8

    move-object/from16 v24, v4

    :goto_6
    const-string v1, "\u06ec\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x73

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x2357

    const v18, 0xdd250b0

    xor-int v4, v4, v18

    const v18, -0x5f0f6a20

    xor-int v1, v1, v18

    move-object/from16 v18, v0

    move v0, v4

    goto/16 :goto_a

    :cond_8
    const-string v1, "\u1a7a\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    move-object/from16 v18, v0

    xor-int v0, v1, v21

    mul-int/lit16 v0, v0, 0x642f

    const v24, -0x68479fd2    # -1.1915E-24f

    xor-int v0, v0, v24

    const v24, 0x64efb877

    goto/16 :goto_9

    :sswitch_f
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    .line 48
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Landroid/os/Build;->BOARD:Ljava/lang/String;

    invoke-static {v2, v0}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v18, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 19
    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v0, :cond_9

    goto/16 :goto_10

    :cond_9
    const-string v0, "\u06db\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x20d

    const v24, -0x3cb47cfe

    xor-int v1, v1, v24

    const v24, 0x77340d7

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v4, v24

    .line 40
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 41
    sget-object v1, Ll/ۛۨᩴ;->ᩴ:Ll/᩷ۨᩴ;

    invoke-static {v1, v0}, Ll/֡۟;->֡ۗᩴ(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩷ۨᩴ;

    move-result-object v1

    .line 42
    invoke-static {v1}, Ll/ۘ۟;->᩻᩺ۧ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "\u073a\u06d6"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x71

    move-object/from16 v22, v1

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x1c83

    const v24, -0x6d66f5f9

    xor-int v1, v1, v24

    const v24, -0x534026b6

    goto/16 :goto_c

    :cond_a
    move-object/from16 v22, v1

    :goto_7
    const-string v0, "\u0730\u06d8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    move-object/from16 v22, v1

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x35ef

    const v24, -0xa5c9f7e

    xor-int v1, v1, v24

    const v24, -0x13c0162f

    goto/16 :goto_c

    :sswitch_11
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    .line 40
    invoke-static {}, Ll/᩶᩷ۧ;->ۙ()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    mul-int/lit16 v0, v0, 0x141

    .line 25
    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v1, :cond_b

    move/from16 v23, v0

    :goto_8
    const-string v0, "\u073f\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, -0x6d

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0xf4b

    const v24, -0xbd19272

    xor-int v1, v1, v24

    const v24, -0x3d483ace

    goto :goto_c

    :cond_b
    const-string v1, "\u06db\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0x5

    move/from16 v23, v0

    xor-int v0, v1, v21

    mul-int/lit16 v0, v0, -0x72fb

    const v24, 0x6b603d57

    xor-int v0, v0, v24

    const v24, 0x4c0b66d1    # 3.65433E7f

    :goto_9
    xor-int v1, v1, v24

    move-object/from16 v24, v4

    :goto_a
    move-object/from16 v25, v22

    move/from16 v22, v1

    goto :goto_e

    :sswitch_12
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    const/16 v0, 0x4bbf

    const/16 v15, 0x4bbf

    goto :goto_b

    :sswitch_13
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    const/16 v0, 0x591f

    const/16 v15, 0x591f

    :goto_b
    const-string v0, "\u06e2\u06e1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x4b

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x11c9

    const v24, -0x1b65ae7e

    xor-int v1, v1, v24

    const v24, 0x3334d2be

    :goto_c
    xor-int v0, v0, v24

    move-object/from16 v24, v4

    move-object/from16 v25, v22

    move/from16 v22, v0

    move v0, v1

    goto :goto_e

    :sswitch_14
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    mul-int v0, v17, v17

    move/from16 v1, v16

    move-object/from16 v16, v2

    mul-int/lit16 v2, v1, 0x2454

    sub-int/2addr v0, v2

    if-ltz v0, :cond_c

    const-string v0, "\u1a75\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, 0x47

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, 0x482b

    const v24, 0x6a46d32b

    xor-int v2, v2, v24

    const v24, -0x1349ec93

    :goto_d
    xor-int v0, v0, v24

    move-object/from16 v24, v4

    move-object/from16 v25, v22

    move/from16 v22, v0

    move v0, v2

    move-object/from16 v2, v16

    move/from16 v16, v1

    :goto_e
    move-object/from16 v1, v25

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u1a78\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x77

    xor-int v2, v0, v21

    mul-int/lit16 v2, v2, -0x77b7

    const v24, -0x551ebd93

    xor-int v2, v2, v24

    const v24, -0x5ab70d4c

    goto :goto_d

    :sswitch_15
    move-object/from16 v22, v1

    move/from16 v1, v16

    move-object/from16 v4, v24

    move-object/from16 v16, v2

    add-int/lit16 v0, v1, 0x915

    .line 36
    sget v2, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v2, :cond_d

    move/from16 v17, v0

    :goto_f
    const-string v0, "\u06e7\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, 0x1f19

    const v24, -0x2f8b8d14

    xor-int v2, v2, v24

    const v24, 0x52965b7f

    goto :goto_d

    :cond_d
    const-string v2, "\u1a7b\u06e0"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v21, v2

    mul-int/lit8 v2, v2, 0x5d

    move/from16 v17, v0

    xor-int v0, v2, v20

    mul-int/lit16 v0, v0, 0x2b39

    const v24, 0x107fd0af

    xor-int v0, v0, v24

    const v24, 0x43ac7f93

    xor-int v2, v2, v24

    move-object/from16 v24, v4

    move-object/from16 v25, v16

    move/from16 v16, v1

    move-object/from16 v1, v22

    move/from16 v22, v2

    move-object/from16 v2, v25

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v22, v1

    move-object/from16 v16, v2

    move-object/from16 v4, v24

    sget-object v0, Ll/ۡۢ᩻;->֡᩻۠:[S

    const/4 v1, 0x0

    aget-short v0, v0, v1

    .line 28
    sget-boolean v1, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v1, :cond_e

    move-object/from16 v2, v16

    move/from16 v16, v0

    :goto_10
    const-string v0, "\u1a78\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x62fb

    const v24, -0x323474ca

    xor-int v1, v1, v24

    const v24, 0x56663bb6

    goto/16 :goto_c

    :cond_e
    const-string v1, "\u1a73\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, 0x2f03

    const v24, -0x10dc54f9

    xor-int v2, v2, v24

    const v24, 0x5c458b10

    xor-int v1, v1, v24

    move-object/from16 v24, v4

    move-object/from16 v25, v16

    move/from16 v16, v0

    move v0, v2

    move-object/from16 v2, v25

    move-object/from16 v26, v22

    move/from16 v22, v1

    move-object/from16 v1, v26

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ff461a3 -> :sswitch_16
        -0x7901cf9f -> :sswitch_a
        -0x76093ee7 -> :sswitch_11
        -0x6600e041 -> :sswitch_4
        -0x654332bc -> :sswitch_a
        -0x60c3a391 -> :sswitch_d
        -0x5bae143b -> :sswitch_f
        -0x591e4e5e -> :sswitch_c
        -0x522d7198 -> :sswitch_14
        -0x4646dc98 -> :sswitch_1
        -0x42b57747 -> :sswitch_4
        -0x3c5c3b53 -> :sswitch_e
        -0x3abace9c -> :sswitch_7
        -0x2984a622 -> :sswitch_0
        -0x262d5d22 -> :sswitch_10
        -0x2380861f -> :sswitch_5
        -0x1cae7245 -> :sswitch_12
        -0x175046b0 -> :sswitch_e
        -0x147a0455 -> :sswitch_3
        -0x82414bd -> :sswitch_8
        -0x6f551de -> :sswitch_0
        -0x8c4a7b -> :sswitch_c
        0x4c5beb4 -> :sswitch_1
        0x9bcf8b0 -> :sswitch_10
        0xcf08d23 -> :sswitch_2
        0xe5954a1 -> :sswitch_12
        0x1189a043 -> :sswitch_9
        0x127966b4 -> :sswitch_6
        0x1428566f -> :sswitch_15
        0x201e9b4e -> :sswitch_b
        0x21bb5d25 -> :sswitch_f
        0x22bf4327 -> :sswitch_7
        0x24d31cd4 -> :sswitch_3
        0x2c82108b -> :sswitch_d
        0x2cd2a785 -> :sswitch_16
        0x3847b800 -> :sswitch_5
        0x493ad75a -> :sswitch_2
        0x55e5e852 -> :sswitch_8
        0x5fd4ea17 -> :sswitch_15
        0x5ff7f282 -> :sswitch_9
        0x61304cce -> :sswitch_b
        0x626041a2 -> :sswitch_14
        0x69950612 -> :sswitch_13
        0x6b6de4a8 -> :sswitch_11
        0x6b8d4bf8 -> :sswitch_13
        0x7963fb87 -> :sswitch_6
    .end sparse-switch
.end method

.method public static ۙ(Ljava/lang/String;)V
    .locals 23

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

    const v15, -0x33f5290a    # -3.639599E7f

    sget v16, Ll/֡᩵;->ۤܳ۬:I

    sget v17, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v18, "\u1a7a\u1a75"

    invoke-static/range {v18 .. v18}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    mul-int/lit8 v18, v18, -0x3d

    xor-int v0, v18, v17

    mul-int/lit16 v0, v0, 0x1c4b

    const v20, -0x3599f82e

    xor-int v0, v0, v20

    const v20, 0x71261d41

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

    const v18, -0x33f5290a    # -3.639599E7f

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v4, v18, v17

    mul-int/lit16 v4, v4, -0x34ed

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    .line 29
    new-instance v0, Ljava/io/IOException;

    sget-object v4, Ll/ۡۢ᩻;->֡᩻۠:[S

    move/from16 v19, v5

    const/16 v5, 0x1d

    .line 15
    sget-boolean v21, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v21, :cond_3

    move-object/from16 v4, p0

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v0

    if-gez v0, :cond_0

    :goto_1
    move-object/from16 v4, p0

    move/from16 v19, v5

    goto/16 :goto_5

    :cond_0
    move-object/from16 v4, p0

    move/from16 v19, v5

    goto/16 :goto_6

    :sswitch_1
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget v0, Ll/ۖۗ;->᩻ܳܶ:I

    if-lez v0, :cond_2

    :cond_1
    move-object/from16 v4, p0

    goto/16 :goto_8

    :cond_2
    move-object/from16 v4, p0

    move-object/from16 v21, v1

    move/from16 v19, v5

    goto/16 :goto_a

    .line 27
    :sswitch_2
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    goto :goto_1

    .line 12
    :sswitch_4
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    :sswitch_5
    return-void

    :cond_3
    const/16 v1, 0x20

    .line 29
    invoke-static {v4, v5, v1, v10}, Ll/֨ۨ;->ۗ۟ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_6
    move/from16 v19, v5

    .line 28
    invoke-static {}, Ll/ۡۢ᩻;->ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3, v0}, Ll/ۗ֫;->ۢ֨֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳ֫ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳ֫ܺ;->commit()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "\u1a75\u05a1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x41

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x5af5

    const v5, -0x1da2967f

    xor-int/2addr v4, v5

    const v5, -0x4f7c6b50

    goto :goto_2

    :cond_4
    const-string v0, "\u06d6\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x25e1

    const v5, 0xf325d25

    xor-int/2addr v4, v5

    const v5, 0x7e80da51

    goto :goto_2

    :sswitch_7
    move/from16 v19, v5

    .line 27
    invoke-static {v13, v14, v15, v10}, Ll/֡ܳ;->ܺܽۧ([SIII)Ljava/lang/String;

    move-result-object v3

    sget v0, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v0, :cond_5

    move-object/from16 v4, p0

    goto :goto_3

    :cond_5
    const-string v0, "\u0733\u06eb"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x2a47

    const v5, -0x20aba933

    xor-int/2addr v4, v5

    const v5, -0x38dba4cb

    goto :goto_2

    :sswitch_8
    move/from16 v19, v5

    sget-object v13, Ll/ۡۢ᩻;->֡᩻۠:[S

    const/16 v14, 0x13

    const/16 v15, 0xa

    .line 2
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v0

    if-gtz v0, :cond_6

    move-object/from16 v4, p0

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u1a79\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0xb

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x22b3

    const v5, -0x4444c85f

    xor-int/2addr v4, v5

    const v5, -0x23bb0d01

    :goto_2
    xor-int/2addr v0, v5

    move/from16 v5, v19

    move/from16 v19, v0

    move v0, v4

    goto/16 :goto_0

    :sswitch_9
    move/from16 v19, v5

    const/16 v0, 0x9

    .line 27
    invoke-static {v11, v12, v0, v10}, Ll/ۘ֡;->۫ܺۡ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v4, p0

    invoke-static {v1, v0, v4}, Ll/ۖ᩹;->ۢۛ۫(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳ֫ܺ;

    move-result-object v2

    .line 17
    sget v0, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v0, :cond_7

    :goto_3
    const-string v0, "\u073a\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x5747

    const v21, 0x4b5c915f    # 1.4455135E7f

    xor-int v5, v5, v21

    const v21, -0x6616e236

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u06d6\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x602d

    const v21, 0x2e431de7

    xor-int v5, v5, v21

    const v21, 0x464625ed

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v4, p0

    move/from16 v19, v5

    const/16 v12, 0xa

    .line 2
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v0

    if-nez v0, :cond_8

    move/from16 v5, v19

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u06d6\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x5ed

    const v21, -0x6e4fa097

    xor-int v5, v5, v21

    const v21, -0x175e3e50

    goto/16 :goto_7

    :sswitch_b
    move-object/from16 v4, p0

    move/from16 v19, v5

    .line 27
    sget-object v0, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    invoke-static {v0}, Ll/ۗܶ;->ܿ᩺ܿ(Ljava/lang/Object;)Ll/ᩳ֫ܺ;

    move-result-object v1

    sget-object v11, Ll/ۡۢ᩻;->֡᩻۠:[S

    .line 10
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v0

    if-gtz v0, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u1a78\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x4cd3

    const v21, -0x6f0a7dd5

    xor-int v5, v5, v21

    const v21, -0x612cdb1f

    goto/16 :goto_7

    :sswitch_c
    move-object/from16 v4, p0

    move/from16 v19, v5

    const/16 v0, 0x4e4f

    const/16 v10, 0x4e4f

    goto :goto_4

    :sswitch_d
    move-object/from16 v4, p0

    move/from16 v19, v5

    const v0, 0xb582

    const v10, 0xb582

    :goto_4
    const-string v0, "\u06e8\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x7a9d

    const v21, -0x433c0275

    xor-int v5, v5, v21

    const v21, 0x97245e8

    goto/16 :goto_7

    :sswitch_e
    move-object/from16 v4, p0

    move/from16 v19, v5

    mul-int v0, v6, v9

    sub-int v0, v8, v0

    if-gez v0, :cond_a

    const-string v0, "\u0736\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x71d3

    const v21, -0xa0de247

    xor-int v5, v5, v21

    const v21, 0x20c67afd

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u06d7\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x9

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x2a7b

    const v21, -0x52eb4dec

    xor-int v5, v5, v21

    const v21, 0x11f9a12f

    goto :goto_7

    :sswitch_f
    move-object/from16 v4, p0

    move/from16 v19, v5

    add-int v0, v6, v7

    mul-int v8, v0, v0

    const v9, 0x10fd0

    sget v0, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v0, :cond_b

    :goto_5
    const-string v0, "\u1a7a\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x17a3

    const v21, 0x35da4386

    xor-int v5, v5, v21

    const v21, -0x5b30b4e6

    goto :goto_7

    :cond_b
    const-string v0, "\u06dc\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x23f

    const v21, -0x69730ec8

    xor-int v5, v5, v21

    const v21, -0x653c7805

    goto :goto_7

    :sswitch_10
    move-object/from16 v4, p0

    move/from16 v19, v5

    aget-short v6, v20, v19

    const/16 v7, 0x43f4

    .line 8
    sget v0, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v0, :cond_c

    :goto_6
    const-string v0, "\u073d\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0xf65

    const v21, -0x2d2c59c0

    xor-int v5, v5, v21

    const v21, 0x57ff8d94

    goto :goto_7

    :cond_c
    const-string v0, "\u1a7b\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x19

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x440b

    const v21, 0x8b52730

    xor-int v5, v5, v21

    const v21, 0x25152a82

    :goto_7
    xor-int v0, v0, v21

    move/from16 v22, v19

    move/from16 v19, v0

    move v0, v5

    move/from16 v5, v22

    goto/16 :goto_0

    :sswitch_11
    move-object/from16 v4, p0

    const/16 v5, 0x9

    .line 28
    sget v0, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v0, :cond_d

    :goto_8
    const-string v0, "\u06e2\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    move-object/from16 v21, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x55af

    const v19, -0x11d175f7

    xor-int v1, v1, v19

    const v19, -0x1034b11f

    goto :goto_9

    :cond_d
    move-object/from16 v21, v1

    const-string v0, "\u073d\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x3a0f

    const v19, -0x357b3aa8    # -4350636.0f

    xor-int v1, v1, v19

    const v19, -0x77ccac5d

    :goto_9
    xor-int v19, v0, v19

    goto :goto_c

    :sswitch_12
    move-object/from16 v4, p0

    move-object/from16 v21, v1

    move/from16 v19, v5

    sget-object v20, Ll/ۡۢ᩻;->֡᩻۠:[S

    .line 27
    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_e

    :goto_a
    const-string v0, "\u06e7\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x2f

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x1fef

    const v5, -0x255ae6dc

    xor-int/2addr v1, v5

    const v5, -0x32534df9

    goto :goto_b

    :cond_e
    const-string v0, "\u06d7\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x40e5

    const v5, 0x2a3914d

    xor-int/2addr v1, v5

    const v5, 0x64d03c7b

    :goto_b
    xor-int/2addr v0, v5

    move/from16 v5, v19

    move/from16 v19, v0

    :goto_c
    move v0, v1

    move-object/from16 v1, v21

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f90305e -> :sswitch_4
        -0x7c58f427 -> :sswitch_b
        -0x6a9cc5b2 -> :sswitch_1
        -0x64143ca6 -> :sswitch_12
        -0x60fc9f8f -> :sswitch_c
        -0x5a62aadc -> :sswitch_7
        -0x5833bb06 -> :sswitch_d
        -0x55ece910 -> :sswitch_c
        -0x536ff477 -> :sswitch_10
        -0x458c3177 -> :sswitch_10
        -0x458c2af8 -> :sswitch_a
        -0x42b5bbc7 -> :sswitch_0
        -0x41c7ffba -> :sswitch_2
        -0x3d74d518 -> :sswitch_f
        -0x34503e21 -> :sswitch_0
        -0x2df0381f -> :sswitch_11
        -0x2509be08 -> :sswitch_9
        -0x2281cc6e -> :sswitch_12
        -0x18e4be53 -> :sswitch_d
        -0x11fab8f5 -> :sswitch_11
        -0x1195a6f -> :sswitch_5
        0x1016fd16 -> :sswitch_e
        0x2ca2243a -> :sswitch_4
        0x487aaf33 -> :sswitch_3
        0x4a4427ff -> :sswitch_5
        0x4df128df -> :sswitch_6
        0x4ea15469 -> :sswitch_7
        0x4ea45d6e -> :sswitch_f
        0x4f5eb49a -> :sswitch_2
        0x5a5ca426 -> :sswitch_e
        0x62748e93 -> :sswitch_9
        0x62e5749d -> :sswitch_8
        0x651e0729 -> :sswitch_3
        0x6d4602be -> :sswitch_b
        0x71002e9c -> :sswitch_a
        0x7231ceab -> :sswitch_6
        0x735cc85a -> :sswitch_1
        0x783723a0 -> :sswitch_8
    .end sparse-switch
.end method

.method public static ᩷()Z
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

    const v15, 0x42b2f6db

    sget v16, Ll/֨᩻;->ۛ֫ܶ:I

    sget v17, Ll/ۗ֡;->ۜ᩻۫:I

    const-string v18, "\u06d9\u1a74"

    invoke-static/range {v18 .. v18}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v18

    add-int v18, v18, v16

    mul-int/lit8 v18, v18, 0x33

    xor-int v0, v18, v17

    mul-int/lit16 v0, v0, -0x6dff

    const v20, 0x17731180

    xor-int v0, v0, v20

    const v20, 0x2b2bf3b4

    xor-int v18, v18, v20

    move-object/from16 v20, v4

    move-object v13, v12

    move/from16 v19, v18

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, 0x42b2f6db

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v5, v18, v17

    mul-int/lit16 v5, v5, 0x4fd9

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    const/4 v8, 0x1

    sget v0, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v0, :cond_a

    goto/16 :goto_4

    .line 35
    :sswitch_0
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_2

    goto/16 :goto_4

    :sswitch_1
    sget-boolean v0, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v0, "\u0736\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x1c99

    const v19, -0xb9cea7a

    xor-int v5, v5, v19

    const v19, 0x601014b3

    goto/16 :goto_5

    :sswitch_2
    sget v0, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v0, :cond_c

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    goto/16 :goto_2

    .line 36
    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    const/4 v0, 0x0

    return v0

    .line 34
    :sswitch_5
    invoke-static {v2, v3, v4}, Ll/ۖܰ;->ۢ֡ᩴ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۖۙ;->ᩴ۫ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0

    :sswitch_6
    invoke-static {v13, v14, v15, v12}, Ll/֡ۢ;->֡֨ۛ([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v0, "\u0736\u06e1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x45b

    const v19, -0x2ffc170c

    xor-int v5, v5, v19

    const v19, -0x5387fc22

    goto/16 :goto_5

    :sswitch_7
    const/16 v14, 0x3e

    const/16 v15, 0xa

    .line 38
    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v0, :cond_3

    :cond_2
    const-string v0, "\u1a79\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x5b

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x7751

    const v19, 0x5d4e8de0

    xor-int v5, v5, v19

    const v19, 0x4076d56e

    goto/16 :goto_5

    :cond_3
    const-string v0, "\u06e2\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x77ef

    const v19, -0x7fc1df70

    xor-int v5, v5, v19

    const v19, -0x17644deb

    goto/16 :goto_5

    .line 34
    :sswitch_8
    sget-object v13, Ll/ۡۢ᩻;->֡᩻۠:[S

    sget v0, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v0, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v0, "\u06eb\u06e8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x37

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x6d5d

    const v19, -0x4b92673d

    xor-int v5, v5, v19

    const v19, -0x515b2b31

    goto/16 :goto_5

    :sswitch_9
    invoke-static {}, Ll/ۡۢ᩻;->ۙ()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v0, "\u0730\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x3909

    const v19, 0x166a8a19

    xor-int v5, v5, v19

    const v19, 0x543281af

    goto/16 :goto_5

    :sswitch_a
    const v0, 0xe943

    const v12, 0xe943

    goto :goto_1

    :sswitch_b
    const v0, 0x9cf8

    const v12, 0x9cf8

    :goto_1
    const-string v0, "\u06d7\u1a76"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0xb

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x6df9

    const v19, -0x478231f7

    xor-int v5, v5, v19

    const v19, 0x2667bf33

    goto/16 :goto_5

    :sswitch_c
    add-int v0, v10, v11

    sub-int/2addr v0, v9

    if-gtz v0, :cond_6

    const-string v0, "\u0733\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x1f37

    const v19, -0x4abfe63

    xor-int v5, v5, v19

    const v19, -0x32d558fa

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u06df\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x37

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x39c9

    const v19, 0x584bd134

    xor-int v5, v5, v19

    const v19, 0xd1d5231

    goto/16 :goto_5

    :sswitch_d
    const/4 v11, 0x1

    sget v0, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v0, :cond_7

    goto :goto_3

    :cond_7
    const-string v0, "\u05a8\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x37

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x46cd

    const v19, 0x199c7ea2

    xor-int v5, v5, v19

    const v19, -0xaa4d4f8

    goto/16 :goto_5

    :sswitch_e
    mul-int/lit8 v10, v7, 0x2

    .line 36
    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v0, :cond_8

    :goto_2
    const-string v0, "\u1a75\u1a74"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x79d1

    const v19, -0x6326e2b

    xor-int v5, v5, v19

    const v19, -0x2dfcb723

    goto/16 :goto_5

    :cond_8
    const-string v0, "\u06e7\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0xad5

    const v19, 0x3cb5a667

    xor-int v5, v5, v19

    const v19, -0x1772689b

    goto/16 :goto_5

    :sswitch_f
    add-int v0, v7, v8

    mul-int v9, v0, v0

    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_9

    :goto_3
    const-string v0, "\u06eb\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x7

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x6135

    const v19, 0x23105661

    xor-int v5, v5, v19

    const v19, -0x476b2e18

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u073d\u1a74"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x71

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x1df7

    const v19, -0x409a6874

    xor-int v5, v5, v19

    const v19, 0x576ebad1

    goto :goto_5

    :cond_a
    const-string v0, "\u05ab\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0xf

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x557d

    const v19, 0x65955e82

    xor-int v5, v5, v19

    const v19, 0x5d17e17b

    goto :goto_5

    :sswitch_10
    aget-short v7, v20, v6

    sget v0, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v0, :cond_b

    goto :goto_4

    :cond_b
    const-string v0, "\u1a73\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x9

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x6b69

    const v19, 0x27f6b4d3

    xor-int v5, v5, v19

    const v19, -0x475cc461

    goto :goto_5

    :sswitch_11
    sget-object v20, Ll/ۡۢ᩻;->֡᩻۠:[S

    const/16 v6, 0x3d

    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_d

    :cond_c
    :goto_4
    const-string v0, "\u1a7b\u06d9"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x5f

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x1481

    const v19, 0x299c224d

    xor-int v5, v5, v19

    const v19, 0x2dc545a9

    goto :goto_5

    :cond_d
    const-string v0, "\u1a74\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x2193

    const v19, 0x77b1395a

    xor-int v5, v5, v19

    const v19, 0x77cfb3aa

    :goto_5
    xor-int v19, v0, v19

    move v0, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a9db62f -> :sswitch_a
        -0x7572e1f4 -> :sswitch_a
        -0x74b30863 -> :sswitch_8
        -0x7469b8c5 -> :sswitch_0
        -0x680cf7ec -> :sswitch_9
        -0x67ef217c -> :sswitch_10
        -0x65f8ebc9 -> :sswitch_2
        -0x5b10d178 -> :sswitch_0
        -0x52b24786 -> :sswitch_11
        -0x50e64fd8 -> :sswitch_f
        -0x441407bb -> :sswitch_9
        -0x40aba7a3 -> :sswitch_5
        -0x40918172 -> :sswitch_2
        -0x3910ea84 -> :sswitch_d
        -0x2e21223f -> :sswitch_3
        -0x2102661d -> :sswitch_10
        -0x151e2662 -> :sswitch_11
        -0x140581e9 -> :sswitch_e
        -0xfdd2199 -> :sswitch_e
        0x26558aa -> :sswitch_1
        0x7474d27 -> :sswitch_6
        0xd7e967d -> :sswitch_4
        0xdc3feb1 -> :sswitch_b
        0x1254d13c -> :sswitch_b
        0x1b76bb32 -> :sswitch_7
        0x28a203df -> :sswitch_1
        0x37f3f72e -> :sswitch_d
        0x42cd005b -> :sswitch_3
        0x43a4c61f -> :sswitch_5
        0x47e5a7dc -> :sswitch_8
        0x4f95b77e -> :sswitch_4
        0x553ba7b3 -> :sswitch_7
        0x691dd4a5 -> :sswitch_c
        0x6acba316 -> :sswitch_f
        0x6e3dd594 -> :sswitch_6
        0x7d3f0fb3 -> :sswitch_c
    .end sparse-switch
.end method

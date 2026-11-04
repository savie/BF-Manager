.class public final Ll/ۧ᩺֫;
.super Ljava/lang/Object;
.source "K3YT"

# interfaces
.implements Ll/۫᩺֫;


# static fields
.field private static final ֨ܳܿ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۧ᩺֫;->֨ܳܿ:[S

    return-void

    :array_0
    .array-data 2
        0x758s
        -0x841s
        -0x80fs
        -0x81ds
        -0x81ds
        -0x80bs
        -0x81cs
        -0x81ds
        -0x841s
        -0x842s
        -0x803s
        -0x81cs
        -0x804s
    .end array-data
.end method


# virtual methods
.method public final ۙ(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 17

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x199ec8fc

    sget v11, Ll/֫۠;->ۢᩴ᩺:I

    sget v12, Ll/ۗ֡;->ۜ᩻۫:I

    const-string v13, "\u06e0\u1a78"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x13

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x2127

    const v15, -0x58268828

    xor-int/2addr v14, v15

    const v15, 0x7b9a2b13

    :goto_0
    xor-int/2addr v13, v15

    const/4 v15, 0x0

    :goto_1
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x68b

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 353
    invoke-static {v15}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Ll/ܺ᩺֫;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    .line 288
    :sswitch_0
    sget-boolean v13, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v13, :cond_1

    :cond_0
    move-object/from16 v0, p2

    goto/16 :goto_6

    :cond_1
    :goto_2
    move-object/from16 v0, p2

    goto/16 :goto_8

    :sswitch_1
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_3

    :sswitch_2
    sget v13, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v13, :cond_2

    goto :goto_3

    :cond_2
    const-string v13, "\u073a\u06db"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x71

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x67b5

    const v16, -0x3923ec2

    xor-int v14, v14, v16

    const v16, -0x6c9d03bc

    goto/16 :goto_9

    .line 184
    :sswitch_3
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    :goto_3
    const-string v13, "\u06d9\u06db"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x13

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1bff

    const v16, -0x25e6c826

    xor-int v14, v14, v16

    const v16, 0x17eb3ab5

    goto/16 :goto_9

    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    const/4 v0, 0x0

    return-object v0

    .line 353
    :sswitch_5
    invoke-static {v15, v1}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    sget v13, Ll/֫֡;->֫ۙۖ:I

    if-gtz v13, :cond_3

    goto :goto_4

    :cond_3
    const-string v13, "\u06d6\u1a75"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x2cc5

    const v16, 0x7e5d57f6

    xor-int v14, v14, v16

    const v16, 0x3b4b66e9

    goto/16 :goto_9

    :sswitch_6
    const/16 v1, 0x9

    const/4 v13, 0x4

    .line 353
    invoke-static {v9, v1, v13, v8}, Ll/֡ۖ;->ܰᩴۢ([SIII)Ljava/lang/String;

    move-result-object v1

    sget v13, Ll/֫֡;->֫ۙۖ:I

    if-gtz v13, :cond_4

    goto :goto_2

    :cond_4
    const-string v13, "\u1a7b\u06ec"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0xa81

    const v16, -0x4d1c1cfc

    xor-int v14, v14, v16

    const v16, 0x7dabd171

    goto/16 :goto_9

    :sswitch_7
    new-instance v15, Ljava/lang/StringBuilder;

    sget-object v13, Ll/ۧ᩺֫;->֨ܳܿ:[S

    const/4 v14, 0x1

    .line 31
    sget v16, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v16, :cond_5

    goto :goto_4

    :cond_5
    const/16 v0, 0x8

    .line 353
    invoke-static {v13, v14, v0, v8}, Ll/ۖۜ;->ۤܿ᩺([SIII)Ljava/lang/String;

    move-result-object v0

    .line 150
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v13

    if-gtz v13, :cond_6

    :goto_4
    move-object/from16 v0, p2

    goto/16 :goto_7

    .line 353
    :cond_6
    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p2

    invoke-static {v15, v0}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v9, Ll/ۧ᩺֫;->֨ܳܿ:[S

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v13

    if-eqz v13, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v13, "\u1a78\u06d7"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xed9

    const v16, 0x7b56d4f8

    xor-int v14, v14, v16

    const v16, -0x2ddd5d7f

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v0, p2

    const v8, 0xfe3b

    goto :goto_5

    :sswitch_9
    move-object/from16 v0, p2

    const v8, 0xf790

    :goto_5
    const-string v13, "\u1a75\u073d"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x7

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4c67

    const v16, 0xdce4b13

    xor-int v14, v14, v16

    const v16, 0x4ae13b9

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v0, p2

    add-int/lit8 v13, v7, 0x1

    sub-int v13, v5, v13

    if-gez v13, :cond_8

    const-string v13, "\u06eb\u06dc"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5a93

    const v16, 0x77fc0dce

    xor-int v14, v14, v16

    const v16, 0x18367560

    goto/16 :goto_9

    :cond_8
    const-string v13, "\u06da\u06df"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x1d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0xd99

    const v16, -0x683163f

    xor-int v14, v14, v16

    const v16, 0x73cefa51

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v0, p2

    mul-int v7, v3, v6

    sget v13, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v13, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v13, "\u1a77\u06d7"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x2b9

    const v16, 0x6973e255

    xor-int v14, v14, v16

    const v16, 0x13064682

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v0, p2

    add-int v5, v3, v4

    mul-int v5, v5, v5

    const/4 v6, 0x2

    .line 94
    sget v13, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v13, :cond_a

    :goto_6
    const-string v13, "\u06e1\u1a75"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x745f

    const v16, -0xc03d7c4

    xor-int v14, v14, v16

    const v16, 0x4dbcd459    # 3.9600413E8f

    goto/16 :goto_9

    :cond_a
    const-string v13, "\u06d9\u1a76"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x61

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xd5f

    const v16, 0x7f20a743

    xor-int v14, v14, v16

    const v16, -0x7eeab4b9

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v0, p2

    const/4 v3, 0x0

    aget-short v3, v2, v3

    const/4 v4, 0x1

    sget v13, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v13, :cond_b

    goto :goto_8

    :cond_b
    const-string v13, "\u06dc\u06dc"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x5c49

    const v16, -0x57cafc05

    xor-int v14, v14, v16

    const v16, -0x5cd0d629

    goto :goto_9

    :sswitch_e
    move-object/from16 v0, p2

    sget-object v2, Ll/ۧ᩺֫;->֨ܳܿ:[S

    sget v13, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v13, :cond_c

    :goto_7
    const-string v13, "\u06da\u06ec"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x45

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x695

    const v15, 0x2e0beb37

    xor-int/2addr v14, v15

    const v15, -0x6df6aa

    goto/16 :goto_0

    :cond_c
    const-string v13, "\u06da\u1a7a"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x209

    const v16, -0x378fd8b2

    xor-int v14, v14, v16

    const v16, 0x49ceff3b

    goto :goto_9

    :sswitch_f
    move-object/from16 v0, p2

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v13

    if-gtz v13, :cond_d

    :goto_8
    const-string v13, "\u1a77\u073a"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x622f

    const v16, 0x16c546ea

    xor-int v14, v14, v16

    const v16, 0x66247a05

    goto :goto_9

    :cond_d
    const-string v13, "\u06d9\u1a7a"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x4d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1941

    const v16, 0xda1771d

    xor-int v14, v14, v16

    const v16, 0x3eb41724

    :goto_9
    xor-int v13, v13, v16

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7f2b779f -> :sswitch_f
        -0x6dfd1df9 -> :sswitch_d
        -0x6d8b36f6 -> :sswitch_5
        -0x6ba72d8f -> :sswitch_e
        -0x69e0e583 -> :sswitch_4
        -0x67ea0fd8 -> :sswitch_6
        -0x5d9fe7b9 -> :sswitch_2
        -0x5902b0be -> :sswitch_0
        -0x5819c922 -> :sswitch_9
        -0x5251d563 -> :sswitch_3
        -0x41cf66c7 -> :sswitch_4
        -0x2c578280 -> :sswitch_8
        -0x1a5afd31 -> :sswitch_e
        -0x17c89984 -> :sswitch_7
        -0x117b6ffd -> :sswitch_5
        -0x103b7101 -> :sswitch_0
        -0x5907167 -> :sswitch_f
        0x3fa782d -> :sswitch_d
        0x77a75ba -> :sswitch_c
        0xd82db12 -> :sswitch_3
        0x2c132850 -> :sswitch_1
        0x4cf3d1fd -> :sswitch_c
        0x517bee30 -> :sswitch_b
        0x5202c1c7 -> :sswitch_8
        0x52e17e93 -> :sswitch_2
        0x52e32ab0 -> :sswitch_9
        0x52f41a95 -> :sswitch_1
        0x59311434 -> :sswitch_a
        0x60dc2f6a -> :sswitch_b
        0x6783d15b -> :sswitch_6
        0x71bbfca5 -> :sswitch_a
        0x744a753b -> :sswitch_7
    .end sparse-switch
.end method

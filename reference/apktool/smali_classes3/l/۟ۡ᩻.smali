.class public final Ll/۟ۡ᩻;
.super Ljava/lang/Object;
.source "51RP"


# static fields
.field private static final ۖܿܳ:[S

.field public static final ۙ:Ll/֨֡᩵;

.field public static final ᩷:Ll/֨֡᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    const/16 v0, 0x77

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۟ۡ᩻;->ۖܿܳ:[S

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x11bca30f

    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    const-string v5, "\u06e0\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x33

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7f71

    const v7, 0x1f85fa25

    xor-int/2addr v6, v7

    const v7, -0x38ec1858

    :goto_0
    xor-int/2addr v5, v7

    move-object v8, v0

    move-object v7, v1

    :goto_1
    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x6a5b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 35
    invoke-static {v8}, Ll/ۡ֡᩵;->ۙ(Ll/ᩴ֨᩵;)Ll/֨֡᩵;

    move-result-object v5

    sput-object v5, Ll/۟ۡ᩻;->ۙ:Ll/֨֡᩵;

    .line 38
    sget v5, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v5, :cond_c

    goto/16 :goto_5

    .line 36
    :sswitch_0
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v5

    if-lez v5, :cond_a

    goto/16 :goto_4

    .line 39
    :sswitch_1
    invoke-static {v7}, Ll/ۡ֡᩵;->ۙ(Ll/ᩴ֨᩵;)Ll/֨֡᩵;

    move-result-object v0

    sput-object v0, Ll/۟ۡ᩻;->᩷:Ll/֨֡᩵;

    return-void

    .line 35
    :sswitch_2
    new-instance v8, Ll/ܽ᩻ܺ;

    const/4 v5, 0x2

    sget v6, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v6, :cond_0

    goto/16 :goto_2

    .line 37
    :cond_0
    sget v6, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    sget v6, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v6, :cond_2

    goto/16 :goto_2

    :cond_2
    sget v6, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v6, :cond_3

    goto/16 :goto_5

    .line 39
    :cond_3
    sget v6, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v6, :cond_4

    goto/16 :goto_3

    .line 36
    :cond_4
    sget-boolean v6, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v6, :cond_5

    goto/16 :goto_5

    .line 35
    :cond_5
    invoke-direct {v8, v5}, Ll/ܽ᩻ܺ;-><init>(I)V

    .line 38
    sget v5, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v5, :cond_6

    goto :goto_2

    :cond_6
    const-string v5, "\u05ab\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1f0f

    const v9, 0x2565b720

    xor-int/2addr v6, v9

    const v9, -0x1f2a023f

    goto/16 :goto_7

    .line 39
    :sswitch_3
    new-instance v7, Ll/ܶ᩻ܺ;

    const/4 v5, 0x1

    sget v6, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v6, :cond_7

    goto :goto_2

    :cond_7
    invoke-direct {v7, v5}, Ll/ܶ᩻ܺ;-><init>(I)V

    .line 35
    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u06db\u0736"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x79ff

    const v9, -0x1e84ffaa

    xor-int/2addr v6, v9

    const v9, 0x24d9282d

    goto/16 :goto_7

    .line 36
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    sget v5, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v5, :cond_9

    goto :goto_4

    :cond_9
    const-string v5, "\u1a77\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1c1d

    const v9, -0x11f290ab

    xor-int/2addr v6, v9

    const v9, 0x374586c8

    goto/16 :goto_7

    .line 38
    :sswitch_5
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-lez v5, :cond_b

    :cond_a
    :goto_2
    const-string v5, "\u06d8\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x68c9

    const v7, -0x7a4783bb

    xor-int/2addr v6, v7

    const v7, -0x2be6ba3c

    goto/16 :goto_0

    :cond_b
    :goto_3
    const-string v5, "\u05a8\u06d9"

    .line 39
    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x10e9

    const v8, 0x1e70ec36

    xor-int/2addr v6, v8

    const v8, 0x3275026d

    goto :goto_6

    :sswitch_6
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    :goto_4
    const-string v5, "\u06d8\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x44cf

    const v9, -0x12953bc0

    xor-int/2addr v6, v9

    const v9, -0x2e43c0c0

    goto :goto_7

    :sswitch_7
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :goto_5
    const-string v5, "\u05ab\u06e8"

    .line 36
    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x52f7

    const v8, -0x61911f52

    xor-int/2addr v6, v8

    const v8, 0x7acb4965

    :goto_6
    xor-int/2addr v5, v8

    move-object v8, v0

    goto/16 :goto_1

    :cond_c
    const-string v5, "\u1a76\u06e0"

    .line 35
    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xb8f

    const v9, 0x273e56fb

    xor-int/2addr v6, v9

    const v9, 0x11e65e39

    :goto_7
    xor-int/2addr v5, v9

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x64777249 -> :sswitch_7
        -0x61d23d54 -> :sswitch_6
        -0x4b763f89 -> :sswitch_5
        -0x47410dd1 -> :sswitch_4
        -0x452ad163 -> :sswitch_6
        -0xf3d4c82 -> :sswitch_3
        0x1b5ee43 -> :sswitch_2
        0x7a44052 -> :sswitch_7
        0x1512785a -> :sswitch_2
        0x1a528473 -> :sswitch_1
        0x20c70e2a -> :sswitch_1
        0x30ff960e -> :sswitch_4
        0x3358403f -> :sswitch_5
        0x4531f752 -> :sswitch_0
        0x51f5a66b -> :sswitch_0
        0x5bd10ce5 -> :sswitch_3
    .end sparse-switch

    :array_0
    .array-data 2
        0xdb1s
        -0x6060s
        -0x605es
        -0x604ds
        -0x606fs
        -0x605as
        -0x6055s
        -0x604es
        -0x605es
        -0x6011s
        -0x6017s
        -0x6017s
        -0x6017s
        -0x6012s
        0xf8fs
        -0x1906s
        -0x1919s
        -0x1906s
        -0x1918s
        -0x1907s
        -0x1920s
        -0x192as
        -0x1904s
        -0x1906s
        -0x1914s
        -0x1905s
        -0x1920s
        -0x1919s
        -0x1911s
        -0x191as
        -0x1913s
        -0x1920s
        -0x1918s
        -0x1919s
        -0x1913s
        -0x1920s
        -0x192as
        -0x1902s
        -0x190fs
        -0x192as
        -0x191bs
        -0x191as
        -0x1912s
        -0x1920s
        -0x1919s
        -0x1912s
        -0x1914s
        -0x1903s
        -0x1921s
        -0x1918s
        -0x191bs
        -0x1904s
        -0x1914s
        -0x195fs
        -0x1959s
        -0x1959s
        -0x1959s
        -0x1960s
        0x687s
        0x17b5s
        0x17b7s
        0x17a0s
        0x17bds
        0x17a2s
        0x17bds
        0x17a0s
        0x17ads
        0x11d4s
        0x5216s
        0x5214s
        0x5203s
        0x521es
        0x5201s
        0x521es
        0x5203s
        0x520es
        0x5204s
        0x5219s
        0x5204s
        0x5216s
        0x5207s
        0x521es
        0x5228s
        0x5202s
        0x5204s
        0x5212s
        0x5205s
        0x521es
        0x5219s
        0x5211s
        0x5218s
        0x5213s
        0x521es
        0x5216s
        0x5219s
        0x5213s
        0x521es
        0x5228s
        0x5200s
        0x520fs
        0x5228s
        0x521bs
        0x5218s
        0x5210s
        0x521es
        0x5219s
        0x5210s
        0x5212s
        0x5203s
        0x5221s
        0x5216s
        0x521bs
        0x5202s
        0x5212s
        0x525fs
        0x5259s
        0x5259s
        0x5259s
        0x525es
    .end array-data
.end method

.method public static ۙ()Ll/ۢۤ᩹;
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

    const v12, -0x44ac6fcc

    sget v13, Ll/֡ۖ;->۫ۙ᩶:I

    sget v14, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v15, "\u06e0\u06e0"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    mul-int/lit8 v15, v15, -0x15

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x2d15

    const v17, -0x6e2471bc

    xor-int v0, v0, v17

    const v17, 0x49092129

    xor-int v15, v15, v17

    move-object v3, v2

    move-object v11, v10

    move/from16 v16, v15

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const v15, -0x44ac6fcc

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, 0x6e49

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    move/from16 v16, v15

    const v0, 0x9fc7

    const v10, 0x9fc7

    goto/16 :goto_2

    .line 37
    :sswitch_0
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    move/from16 v16, v15

    if-nez v0, :cond_b

    goto/16 :goto_5

    :sswitch_1
    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v0, :cond_0

    move/from16 v16, v15

    goto :goto_1

    :cond_0
    const-string v0, "\u06ec\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    move/from16 v16, v15

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x5f57

    const v17, 0x5e8487fd

    xor-int v15, v15, v17

    const v17, -0x4d94b209

    goto/16 :goto_6

    :sswitch_2
    move/from16 v16, v15

    .line 35
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_2

    goto/16 :goto_5

    :sswitch_3
    move/from16 v16, v15

    .line 38
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    goto/16 :goto_5

    .line 37
    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    const/4 v0, 0x0

    return-object v0

    .line 35
    :sswitch_5
    invoke-static {v1, v2}, Ll/֡۟;->ۧۧ۬(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v1, Ll/ۢۤ᩹;

    return-object v1

    :sswitch_6
    move/from16 v16, v15

    const/16 v0, 0xd

    invoke-static {v11, v12, v0, v10}, Ll/ۘ۟;->᩷᩶۟([SIII)Ljava/lang/String;

    move-result-object v2

    sget v0, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v0, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v0, "\u06e2\u1a76"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0xfeb

    const v17, 0x2dd69b32

    xor-int v15, v15, v17

    const v17, -0x16de747b

    goto/16 :goto_6

    :sswitch_7
    move/from16 v16, v15

    const/4 v12, 0x1

    .line 38
    sget v0, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v0, :cond_3

    :cond_2
    :goto_1
    const-string v0, "\u06e2\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x31

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x52cd

    const v17, 0x60d6992f

    xor-int v15, v15, v17

    const v17, 0x78b666cf

    goto/16 :goto_6

    :cond_3
    const-string v0, "\u1a74\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x526b

    const v17, -0xe652d0e

    xor-int v15, v15, v17

    const v17, 0x15b1035

    goto/16 :goto_6

    :sswitch_8
    move/from16 v16, v15

    .line 35
    sget-object v11, Ll/۟ۡ᩻;->ۖܿܳ:[S

    .line 39
    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v0, "\u1a79\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x62ad

    const v17, 0x191e5441

    xor-int v15, v15, v17

    const v17, 0x57a60695

    goto/16 :goto_6

    :sswitch_9
    move/from16 v16, v15

    .line 35
    sget-object v0, Ll/۟ۡ᩻;->ۙ:Ll/֨֡᩵;

    invoke-interface {v0}, Ll/֨֡᩵;->getValue()Ljava/lang/Object;

    move-result-object v1

    sget v0, Ll/ۖ;->ܿۚ֡:I

    if-ltz v0, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u1a73\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x764f

    const v17, 0x35bc5fd6

    xor-int v15, v15, v17

    const v17, 0x6cbd1212

    goto/16 :goto_6

    :sswitch_a
    move/from16 v16, v15

    const/16 v0, 0x18a0

    const/16 v10, 0x18a0

    :goto_2
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x4d

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x1a7

    const v17, -0x7da8dca1

    xor-int v15, v15, v17

    const v17, -0x5631ab50

    goto/16 :goto_6

    :sswitch_b
    move/from16 v16, v15

    mul-int v0, v5, v9

    sub-int v0, v8, v0

    if-ltz v0, :cond_6

    const-string v0, "\u06e2\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x76f9

    const v17, 0x5e814cd3

    xor-int v15, v15, v17

    const v17, 0x2da4c785

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u05ab\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x13

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x116d

    const v17, -0x2e78b592

    xor-int v15, v15, v17

    const v17, -0x78335981

    goto/16 :goto_6

    :sswitch_c
    move/from16 v16, v15

    add-int v8, v6, v7

    const/16 v9, 0x5902

    .line 37
    sget v0, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v0, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v0, "\u06e2\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x31

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0xcab

    const v17, -0x76a42469

    xor-int v15, v15, v17

    const v17, 0x1e781000

    goto/16 :goto_6

    :sswitch_d
    move/from16 v16, v15

    mul-int v6, v5, v5

    const v7, 0x7bc9901

    .line 36
    sget v0, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v0, :cond_8

    goto :goto_3

    :cond_8
    const-string v0, "\u05ab\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x43

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x6cf5

    const v17, -0x7a495008

    xor-int v15, v15, v17

    const v17, 0x503fa6fb

    goto/16 :goto_6

    :sswitch_e
    move/from16 v16, v15

    aget-short v5, v3, v4

    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v0, :cond_9

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u06ec\u0736"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x4389

    const v17, -0x695852a7

    xor-int v15, v15, v17

    const v17, 0x136ddbe6

    goto/16 :goto_6

    :sswitch_f
    move/from16 v16, v15

    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v0, :cond_a

    :goto_3
    const-string v0, "\u06e8\u06da"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x3eb9

    const v17, -0x54f742bf

    xor-int v15, v15, v17

    const v17, -0x5273711d

    goto/16 :goto_6

    :cond_a
    const-string v0, "\u0730\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x3f

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0xdbf

    const v17, 0x58cac04e

    xor-int v15, v15, v17

    const v17, -0x6506425c

    goto :goto_6

    :sswitch_10
    move/from16 v16, v15

    .line 39
    sget-boolean v0, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v0, :cond_c

    :cond_b
    :goto_4
    const-string v0, "\u0730\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x1f

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x751b

    const v17, 0x5437cc44

    xor-int v15, v15, v17

    const v17, -0x1445e9c7

    goto :goto_6

    :cond_c
    const-string v0, "\u06d7\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x5b

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x1a47

    const v17, 0x4e9aa220

    xor-int v15, v15, v17

    const v17, 0x11b49725

    goto :goto_6

    :sswitch_11
    move/from16 v16, v15

    sget-object v3, Ll/۟ۡ᩻;->ۖܿܳ:[S

    const/4 v4, 0x0

    .line 38
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v0

    if-eqz v0, :cond_d

    :goto_5
    const-string v0, "\u1a77\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x57

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x4d87

    const v17, -0x704bb8cb

    xor-int v15, v15, v17

    const v17, -0x7655df0b

    goto :goto_6

    :cond_d
    const-string v0, "\u06eb\u0733"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x32a1

    const v17, -0x7268eb56

    xor-int v15, v15, v17

    const v17, -0x1983a987

    :goto_6
    xor-int v0, v0, v17

    move/from16 v18, v16

    move/from16 v16, v0

    move v0, v15

    move/from16 v15, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6c26396b -> :sswitch_e
        -0x6a62df5c -> :sswitch_9
        -0x69274356 -> :sswitch_f
        -0x68ff0032 -> :sswitch_9
        -0x671bfeb9 -> :sswitch_f
        -0x5ee4c220 -> :sswitch_d
        -0x566d5053 -> :sswitch_0
        -0x51bd5f45 -> :sswitch_11
        -0x498a92c8 -> :sswitch_2
        -0x4473ee3c -> :sswitch_c
        -0x3e9ac581 -> :sswitch_b
        -0x3a977518 -> :sswitch_e
        -0x354323d7 -> :sswitch_4
        -0x340660fc -> :sswitch_1
        -0x2f300cd8 -> :sswitch_8
        -0x2e5c2ece -> :sswitch_c
        -0x25f69ea1 -> :sswitch_8
        -0x1eedffa3 -> :sswitch_7
        -0x13d46ddb -> :sswitch_1
        -0x138c6a83 -> :sswitch_0
        -0x11fdd504 -> :sswitch_4
        -0x15fe7c8 -> :sswitch_3
        0x546d77a -> :sswitch_6
        0x86bf36c -> :sswitch_a
        0xbacc881 -> :sswitch_a
        0x1773fb90 -> :sswitch_d
        0x18bb31f2 -> :sswitch_b
        0x363dfe80 -> :sswitch_7
        0x46b210f1 -> :sswitch_10
        0x4be3a68a -> :sswitch_11
        0x50cbb6f8 -> :sswitch_10
        0x5f965978 -> :sswitch_5
        0x66ac121f -> :sswitch_5
        0x6e9f9613 -> :sswitch_2
        0x7a88aed6 -> :sswitch_6
        0x7e090400 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۙ(Ll/ۘ۠᩻;Ll/֨۠᩻;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x8ac401a

    sget v2, Ll/ۖ;->ܿۚ֡:I

    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v4, "\u06e1\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x25cb

    const v6, -0x5f24abe8

    xor-int/2addr v5, v6

    const v6, 0x60e9b79d

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x2273

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 0
    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_d

    goto/16 :goto_5

    .line 138
    :sswitch_0
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v4, :cond_6

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-lez v4, :cond_b

    goto/16 :goto_2

    .line 39
    :sswitch_2
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v4, :cond_4

    goto/16 :goto_4

    .line 152
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    goto/16 :goto_4

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    return-void

    .line 172
    :sswitch_5
    invoke-static {}, Ll/۟ۡ᩻;->ۙ()Ll/ۢۤ᩹;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۢۤ᩹;->᩷()V

    goto :goto_1

    .line 211
    :sswitch_6
    invoke-static {}, Ll/۟ۡ᩻;->ۙ()Ll/ۢۤ᩹;

    move-result-object p0

    invoke-virtual {p0, p1, v0}, Ll/ۢۤ᩹;->ۙ(Ll/ܽ֡֫;Ll/ᩳۤ᩹;)V

    return-void

    .line 210
    :sswitch_7
    invoke-virtual {p1, v0}, Ll/ܽ֡֫;->ۙ(Ll/ᩳۤ᩹;)V

    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v4, "\u1a7b\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x390f

    const v6, 0x75cd0315

    xor-int/2addr v5, v6

    const v6, -0x60932136

    goto :goto_0

    .line 174
    :sswitch_8
    new-instance v0, Ll/᩶ۡ᩻;

    invoke-direct {v0, p0, p1}, Ll/᩶ۡ᩻;-><init>(Ll/ۘ۠᩻;Ll/֨۠᩻;)V

    .line 101
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06e2\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x51

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6f2b

    const v6, -0x5f1b40de

    xor-int/2addr v5, v6

    const v6, 0x722fd72e

    goto/16 :goto_0

    .line 171
    :sswitch_9
    invoke-static {}, Ll/۟ۡ᩻;->ۙ()Ll/ۢۤ᩹;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۢۤ᩹;->ۙ()Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "\u06da\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1209

    const v6, -0x7ee7f2a2

    xor-int/2addr v5, v6

    const v6, -0x2bfbd1aa

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v4, "\u06d6\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6183

    const v6, -0x7935335e

    xor-int/2addr v5, v6

    const v6, 0xd67b76

    goto/16 :goto_0

    .line 124
    :sswitch_a
    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v4, "\u1a75\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6be3

    const v6, 0x7a6690ff

    xor-int/2addr v5, v6

    const v6, -0x129e9a6c

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_5

    :cond_4
    :goto_2
    const-string v4, "\u06e4\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6b0d

    const v6, 0xdc41296

    xor-int/2addr v5, v6

    const v6, 0x5094366d

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u073d\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7bb7

    const v6, 0x2c14f86c

    xor-int/2addr v5, v6

    const v6, 0x344e5a89

    goto/16 :goto_0

    .line 207
    :sswitch_c
    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v4, :cond_7

    :cond_6
    :goto_3
    const-string v4, "\u073a\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x68f3

    const v6, 0x1143b310

    xor-int/2addr v5, v6

    const v6, 0x876a1d

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u0736\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3269

    const v6, 0x1130c7ab

    xor-int/2addr v5, v6

    const v6, -0xd7e61c7

    goto/16 :goto_0

    .line 170
    :sswitch_d
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u06dc\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3819

    const v6, -0x213c3805

    xor-int/2addr v5, v6

    const v6, 0x4c3dc6ca    # 4.9748776E7f

    goto/16 :goto_0

    .line 121
    :sswitch_e
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v4, "\u06dc\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1a5b

    const v6, -0x4d5e0704

    xor-int/2addr v5, v6

    const v6, 0x72d384b

    goto/16 :goto_0

    .line 91
    :sswitch_f
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_a

    :goto_4
    const-string v4, "\u1a77\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3cb3

    const v6, 0x2ada3072

    xor-int/2addr v5, v6

    const v6, 0x52e4b43b

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u05a8\u06e2"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5fe7

    const v6, -0x112d63e1

    xor-int/2addr v5, v6

    const v6, 0x688f6b0e

    goto/16 :goto_0

    .line 114
    :sswitch_10
    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v4, :cond_c

    :cond_b
    const-string v4, "\u05a8\u1a75"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3393

    const v6, 0x69a46cae

    xor-int/2addr v5, v6

    const v6, -0x7cc61dad

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a1\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6787

    const v6, 0x20178c2

    xor-int/2addr v5, v6

    const v6, 0x490fe255

    goto/16 :goto_0

    :goto_5
    const-string v4, "\u1a79\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4b63

    const v6, -0x6a0ed735

    xor-int/2addr v5, v6

    const v6, 0x6da8c85b

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a73\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2b79

    const v6, -0x2f68ff5

    xor-int/2addr v5, v6

    const v6, -0x2ccecfd3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f6ff195 -> :sswitch_1
        -0x7aaa9d02 -> :sswitch_e
        -0x6ebc5913 -> :sswitch_4
        -0x5cec22d5 -> :sswitch_f
        -0x5665e096 -> :sswitch_a
        -0x5057acca -> :sswitch_3
        -0x5003a988 -> :sswitch_e
        -0x3ef7bcec -> :sswitch_0
        -0x3518740c -> :sswitch_2
        -0x33d57d7a -> :sswitch_c
        -0x333bfc33 -> :sswitch_1
        -0x31f2391e -> :sswitch_5
        -0x2dc0446c -> :sswitch_10
        -0x2490dd5f -> :sswitch_3
        -0x2249b8e1 -> :sswitch_8
        -0x21adb5b9 -> :sswitch_a
        -0x19f742ad -> :sswitch_6
        -0x1535aaa0 -> :sswitch_8
        -0x113bba21 -> :sswitch_0
        -0x1131630b -> :sswitch_6
        -0xae36663 -> :sswitch_7
        0x76ef405 -> :sswitch_c
        0x189d8fcc -> :sswitch_b
        0x29233957 -> :sswitch_4
        0x368ff1c3 -> :sswitch_b
        0x3b0ba328 -> :sswitch_f
        0x3f8142e7 -> :sswitch_5
        0x532594e0 -> :sswitch_10
        0x5daad382 -> :sswitch_7
        0x66731161 -> :sswitch_d
        0x68f356ff -> :sswitch_9
        0x6925dc1a -> :sswitch_2
        0x6d75c098 -> :sswitch_9
        0x72c5d92c -> :sswitch_d
    .end sparse-switch
.end method

.method public static ۙ(Ll/ܰ۠᩻;Ll/֨۠᩻;)V
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

    const v18, 0x17f6b3a3

    sget v19, Ll/֨ۨ;->ۜܳ᩵:I

    sget v20, Ll/ۖᩳ;->᩹ۧܳ:I

    const-string v21, "\u06d7\u06e2"

    invoke-static/range {v21 .. v21}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v21

    sub-int v21, v20, v21

    mul-int/lit8 v21, v21, 0x33

    xor-int v0, v21, v19

    mul-int/lit16 v0, v0, 0xf11

    const v23, 0x4a35b79d    # 2977255.2f

    xor-int v0, v0, v23

    const v23, 0x270cdd1e

    xor-int v21, v21, v23

    move-object/from16 v16, v4

    move-object v13, v12

    move-object v15, v14

    move-object/from16 v7, v17

    move/from16 v22, v21

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v21, 0x17f6b3a3

    const/16 v23, 0x0

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v8, v21, v19

    mul-int/lit16 v8, v8, -0x1109

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v0, v8

    xor-int v21, v22, v0

    sparse-switch v21, :sswitch_data_0

    move-object/from16 v8, p0

    move-object/from16 v22, v2

    .line 88
    sget-object v15, Ll/۟ۡ᩻;->ۖܿܳ:[S

    const/16 v5, 0x1e

    const/16 v6, 0xf

    .line 37
    sget v0, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v0, :cond_7

    goto/16 :goto_8

    .line 74
    :sswitch_0
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v0, :cond_0

    :goto_1
    move-object/from16 v8, p0

    goto/16 :goto_9

    :cond_0
    const-string v0, "\u06df\u06e1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x43

    xor-int v8, v0, v19

    mul-int/lit16 v8, v8, -0x22f5

    const v22, -0x56a370be

    xor-int v8, v8, v22

    const v22, -0x2017bc71

    goto/16 :goto_3

    .line 66
    :sswitch_1
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    sget v0, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v0, :cond_2

    :cond_1
    move-object/from16 v8, p0

    move-object/from16 v22, v2

    goto/16 :goto_5

    :cond_2
    move-object/from16 v8, p0

    move-object/from16 v24, v1

    move-object/from16 v22, v2

    goto/16 :goto_a

    .line 54
    :sswitch_2
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget v0, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v0, :cond_1

    goto :goto_1

    .line 48
    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    goto :goto_1

    .line 99
    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    return-void

    .line 39
    :sswitch_5
    invoke-static {v3, v4}, Ll/֡۟;->ۧۧ۬(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v3, Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 107
    invoke-interface {v3, v1}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    return-void

    :sswitch_6
    const/16 v0, 0x2d

    const/16 v4, 0xd

    .line 39
    invoke-static {v7, v0, v4, v12}, Ll/֫ۤ;->ܽ۠ۙ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "\u06d6\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v8, v0, v20

    mul-int/lit16 v8, v8, 0x76b

    const v22, -0x1062b5a7

    xor-int v8, v8, v22

    const v22, 0x77e868cb

    goto :goto_3

    :sswitch_7
    invoke-interface {v2}, Ll/֨֡᩵;->getValue()Ljava/lang/Object;

    move-result-object v3

    sget-object v7, Ll/۟ۡ᩻;->ۖܿܳ:[S

    .line 72
    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_4

    :goto_2
    move-object/from16 v8, p0

    goto :goto_4

    :cond_4
    const-string v0, "\u1a7b\u06e1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, -0xb

    xor-int v8, v0, v20

    mul-int/lit16 v8, v8, 0x317b

    const v22, -0x2f518f1e

    xor-int v8, v8, v22

    const v22, 0x52f42f63

    :goto_3
    xor-int v22, v0, v22

    move v0, v8

    goto/16 :goto_0

    .line 90
    :sswitch_8
    new-instance v0, Ll/ܺۡ᩻;

    move-object/from16 v8, p0

    move-object/from16 v2, p1

    invoke-direct {v0, v8, v2}, Ll/ܺۡ᩻;-><init>(Ll/ܰ۠᩻;Ll/֨۠᩻;)V

    invoke-static {v0}, Ll/ۧۤۧ;->ۙ(Ll/֫ۤۧ;)V

    .line 39
    sget-object v0, Ll/۟ۡ᩻;->᩷:Ll/֨֡᩵;

    .line 102
    sget v22, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v22, :cond_5

    move-object v2, v0

    goto/16 :goto_9

    :cond_5
    const-string v22, "\u1a73\u06e7"

    invoke-static/range {v22 .. v22}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v22

    add-int v22, v22, v20

    mul-int/lit8 v22, v22, -0x13

    move-object/from16 v24, v0

    xor-int v0, v22, v19

    mul-int/lit16 v0, v0, 0x3d4d

    const v25, -0xfba8133

    xor-int v0, v0, v25

    const v25, 0x5da52fe2

    xor-int v22, v22, v25

    move-object/from16 v2, v24

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v8, p0

    .line 88
    invoke-static {v15, v5, v6, v12}, Ll/ۖۜ;->ۤܿ᩺([SIII)Ljava/lang/String;

    move-result-object v0

    .line 89
    iput-object v0, v1, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;->state:Ljava/lang/String;

    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v0, :cond_6

    :goto_4
    const-string v0, "\u06e7\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    move-object/from16 v22, v2

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, -0x1d2b

    const v24, 0xb729bc6

    xor-int v2, v2, v24

    const v24, -0x7be9d182

    goto/16 :goto_7

    :cond_6
    move-object/from16 v22, v2

    const-string v0, "\u073d\u06d6"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x67

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, 0x4467

    const v24, 0x677a6fc1

    xor-int v2, v2, v24

    const v24, -0x741a436

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u06da\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v2, v0, v19

    mul-int/lit16 v2, v2, -0x22d

    const v24, 0x69b72154

    xor-int v2, v2, v24

    const v24, 0x732d9cb5

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v8, p0

    move-object/from16 v22, v2

    const/16 v0, 0xf

    .line 87
    invoke-static {v13, v14, v0, v12}, Ll/֡۟;->ᩳۧܳ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 88
    iput-object v0, v1, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;->scope:Ljava/lang/String;

    .line 86
    sget v0, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v0, :cond_8

    goto :goto_5

    :cond_8
    const-string v0, "\u05a8\u06e1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v2, v0, v20

    mul-int/lit8 v2, v2, -0x69

    const v24, -0x38c4ae6b

    xor-int v2, v2, v24

    const v24, -0x2f7f5090

    goto/16 :goto_7

    :sswitch_b
    move-object/from16 v8, p0

    move-object/from16 v22, v2

    .line 87
    new-instance v1, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;

    invoke-direct {v1}, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;-><init>()V

    sget-object v13, Ll/۟ۡ᩻;->ۖܿܳ:[S

    const/16 v14, 0xf

    .line 18
    sget v0, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v0, :cond_9

    :goto_5
    const-string v0, "\u1a75\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v2, v0, v19

    mul-int/lit16 v2, v2, 0x2261

    const v24, 0x262bbebc

    xor-int v2, v2, v24

    const v24, 0x757fb2bd

    goto/16 :goto_7

    :cond_9
    const-string v0, "\u05a1\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v2, v0, v19

    mul-int/lit16 v2, v2, -0x1a7b

    const v24, 0x3588988

    xor-int v2, v2, v24

    const v24, -0x356e6914    # -4770678.0f

    goto/16 :goto_7

    :sswitch_c
    move-object/from16 v8, p0

    move-object/from16 v22, v2

    const/16 v0, 0x55dd

    const/16 v12, 0x55dd

    goto :goto_6

    :sswitch_d
    move-object/from16 v8, p0

    move-object/from16 v22, v2

    const v0, 0xe689

    const v12, 0xe689

    :goto_6
    const-string v0, "\u0736\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x4b

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, -0x529d

    const v24, 0x688d7c7a

    xor-int v2, v2, v24

    const v24, -0x395ecf2

    goto :goto_7

    :sswitch_e
    move-object/from16 v8, p0

    move-object/from16 v22, v2

    add-int v0, v10, v11

    add-int/2addr v0, v0

    sub-int/2addr v0, v9

    if-ltz v0, :cond_a

    const-string v0, "\u06d9\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x7b

    xor-int v2, v0, v19

    mul-int/lit16 v2, v2, 0x40c7

    const v24, 0x11bef755

    xor-int v2, v2, v24

    const v24, 0x6fe2489a

    goto :goto_7

    :cond_a
    const-string v0, "\u06e2\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v2, v0, v19

    mul-int/lit16 v2, v2, 0x287

    const v24, 0x7219c7a0

    xor-int v2, v2, v24

    const v24, 0x50a8f862

    goto :goto_7

    :sswitch_f
    move-object/from16 v8, p0

    move-object/from16 v22, v2

    mul-int v9, v23, v23

    mul-int v10, v18, v18

    const v11, 0x9024024

    sget v0, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v0, :cond_b

    move-object/from16 v24, v1

    goto/16 :goto_a

    :cond_b
    const-string v0, "\u06e8\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, 0x794b

    const v24, -0x572e60a

    xor-int v2, v2, v24

    const v24, -0x7031af9c

    :goto_7
    xor-int v0, v0, v24

    move-object/from16 v26, v22

    move/from16 v22, v0

    move v0, v2

    move-object/from16 v2, v26

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v8, p0

    move-object/from16 v22, v2

    aget-short v0, v16, v17

    add-int/lit16 v2, v0, 0x3006

    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v18

    if-ltz v18, :cond_c

    move/from16 v18, v0

    move/from16 v23, v2

    :goto_8
    move-object/from16 v2, v22

    :goto_9
    const-string v0, "\u06e1\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    move-object/from16 v24, v1

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x33cb

    const v22, 0x621fe6c4

    xor-int v1, v1, v22

    const v22, 0x5777da1e

    xor-int v22, v0, v22

    goto :goto_c

    :cond_c
    move-object/from16 v24, v1

    const-string v1, "\u1a76\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    move/from16 v18, v0

    xor-int v0, v1, v20

    mul-int/lit16 v0, v0, -0x3155

    const v23, -0x2ffaf793

    xor-int v0, v0, v23

    const v23, -0x57cf3e34

    xor-int v1, v1, v23

    move/from16 v23, v2

    move-object/from16 v2, v22

    move/from16 v22, v1

    goto :goto_d

    :sswitch_11
    move-object/from16 v8, p0

    move-object/from16 v24, v1

    move-object/from16 v22, v2

    sget-object v16, Ll/۟ۡ᩻;->ۖܿܳ:[S

    const/16 v17, 0xe

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v0

    if-eqz v0, :cond_d

    :goto_a
    const-string v0, "\u06eb\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x1b

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x111

    const v2, 0x7e576775

    xor-int/2addr v1, v2

    const v2, -0x64dd17f1

    goto :goto_b

    :cond_d
    const-string v0, "\u06da\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x43

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x3711

    const v2, -0x6838bd3

    xor-int/2addr v1, v2

    const v2, 0x1157a39d

    :goto_b
    xor-int/2addr v0, v2

    move-object/from16 v2, v22

    move/from16 v22, v0

    :goto_c
    move v0, v1

    :goto_d
    move-object/from16 v1, v24

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bbda121 -> :sswitch_1
        -0x7a271438 -> :sswitch_a
        -0x77bb1e1d -> :sswitch_3
        -0x763c1bbc -> :sswitch_2
        -0x7568a044 -> :sswitch_10
        -0x70db8378 -> :sswitch_4
        -0x6f7d1edb -> :sswitch_f
        -0x6ea91e07 -> :sswitch_9
        -0x6c4d8244 -> :sswitch_0
        -0x60dc1894 -> :sswitch_c
        -0x386e13fb -> :sswitch_5
        -0x2e9fb392 -> :sswitch_10
        -0x2d8f002a -> :sswitch_5
        -0x1f6c621b -> :sswitch_1
        -0x1ba91a23 -> :sswitch_8
        -0x1370b97f -> :sswitch_11
        -0x122d5a5b -> :sswitch_7
        -0x79761c2 -> :sswitch_2
        0x6cd22fe -> :sswitch_a
        0x7366eeb -> :sswitch_8
        0x183eb524 -> :sswitch_4
        0x184aa4ee -> :sswitch_f
        0x1fe19126 -> :sswitch_c
        0x346fad4f -> :sswitch_0
        0x38514b0b -> :sswitch_6
        0x3a353c08 -> :sswitch_3
        0x3c64c7bc -> :sswitch_9
        0x3fb7feeb -> :sswitch_e
        0x40ef0c36 -> :sswitch_7
        0x453d0cc8 -> :sswitch_e
        0x4b81a371 -> :sswitch_11
        0x4fb837d8 -> :sswitch_b
        0x6413c081 -> :sswitch_6
        0x671168f0 -> :sswitch_b
        0x73a735ad -> :sswitch_d
        0x77aa4bc8 -> :sswitch_d
    .end sparse-switch
.end method

.method public static ۙ(Ll/ܽ֡֫;Ll/᩻ۖ᩻;)V
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

    const/4 v13, 0x0

    const v14, -0x7c2f110c    # -1.2280002E-36f

    sget v15, Ll/֫۠;->ۢᩴ᩺:I

    sget v16, Ll/ۖᩳ;->᩹ۧܳ:I

    const-string v17, "\u1a77\u1a78"

    invoke-static/range {v17 .. v17}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v17

    add-int v17, v17, v15

    mul-int/lit8 v17, v17, -0x39

    xor-int v1, v17, v16

    mul-int/lit16 v1, v1, 0x1bc9

    const v19, 0x55d257b7

    xor-int v1, v1, v19

    const v19, 0x12537f1a

    xor-int v17, v17, v19

    move-object/from16 v19, v3

    move-object v12, v11

    move/from16 v18, v17

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, -0x7c2f110c    # -1.2280002E-36f

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v17, v16

    mul-int/lit16 v4, v4, -0x17b3

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    .line 5
    invoke-static {v0, v2}, Ll/ۗ᩺;->֫᩶֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    invoke-static {}, Ll/۟ۡ᩻;->ۙ()Ll/ۢۤ᩹;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢۤ᩹;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "\u06db\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x21

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x169

    const v18, 0x379f8591

    xor-int v4, v4, v18

    const v18, -0x61cc5f20

    goto/16 :goto_7

    .line 154
    :sswitch_0
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-nez v1, :cond_d

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v1

    if-gtz v1, :cond_2

    goto/16 :goto_2

    .line 30
    :sswitch_2
    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v1, :cond_4

    goto/16 :goto_5

    .line 17
    :sswitch_3
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    goto/16 :goto_5

    .line 133
    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    return-void

    .line 112
    :sswitch_5
    invoke-static {}, Ll/۟ۡ᩻;->ۙ()Ll/ۢۤ᩹;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢۤ᩹;->᩷()V

    goto :goto_1

    .line 167
    :sswitch_6
    invoke-static {}, Ll/۟ۡ᩻;->ۙ()Ll/ۢۤ᩹;

    move-result-object v1

    invoke-virtual {v1, v0, v3}, Ll/ۢۤ᩹;->ۙ(Ll/ܽ֡֫;Ll/ᩳۤ᩹;)V

    return-void

    .line 114
    :sswitch_7
    new-instance v3, Ll/֡ۡ᩻;

    move-object/from16 v1, p1

    invoke-direct {v3, v0, v1}, Ll/֡ۡ᩻;-><init>(Ll/ܽ֡֫;Ll/᩻ۖ᩻;)V

    .line 166
    invoke-virtual {v0, v3}, Ll/ܽ֡֫;->ۙ(Ll/ᩳۤ᩹;)V

    .line 115
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v4, "\u06e8\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v16

    xor-int v1, v4, v15

    mul-int/lit16 v1, v1, 0x4735

    const v18, -0x5c7e7a6f

    xor-int v1, v1, v18

    const v18, -0x663d130

    xor-int v18, v4, v18

    goto/16 :goto_0

    :cond_1
    :goto_1
    const-string v1, "\u06df\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x545f

    const v18, 0x153d3800

    xor-int v4, v4, v18

    const v18, 0x78b947f0

    goto/16 :goto_7

    .line 0
    :sswitch_8
    invoke-static {v12, v13, v14, v11}, Ll/ۘ֡;->۫ܺۡ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 54
    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v1, :cond_3

    :cond_2
    const-string v1, "\u073f\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x625

    const v18, 0x4293dd38

    xor-int v4, v4, v18

    const v18, -0x3a17a455

    goto/16 :goto_7

    :cond_3
    const-string v1, "\u06d6\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x79

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x2cd

    const v18, -0x34673e91    # -2.0021982E7f

    xor-int v4, v4, v18

    const v18, 0x5a43b468

    goto/16 :goto_7

    :sswitch_9
    const/16 v14, 0x8

    .line 40
    sget-boolean v1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v1, :cond_5

    :cond_4
    :goto_2
    const-string v1, "\u05ab\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x5801

    const v18, -0x6999f954

    xor-int v4, v4, v18

    const v18, -0x27a2b690

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u1a78\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x2f8d

    const v18, -0x63ec0dc5

    xor-int v4, v4, v18

    const v18, 0x5fdcae0b

    goto/16 :goto_7

    .line 0
    :sswitch_a
    sget-object v12, Ll/۟ۡ᩻;->ۖܿܳ:[S

    const/16 v13, 0x3b

    .line 76
    sget v1, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v1, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v1, "\u06e2\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x4b71

    const v18, -0x64ff7877

    xor-int v4, v4, v18

    const v18, 0x264972ac

    goto/16 :goto_7

    :sswitch_b
    const/16 v1, 0x6972

    const/16 v11, 0x6972

    goto :goto_3

    :sswitch_c
    const/16 v1, 0x17d4

    const/16 v11, 0x17d4

    :goto_3
    const-string v1, "\u0736\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x536f

    const v18, 0x5de2b4b1

    xor-int v4, v4, v18

    const v18, -0x14727f1

    goto/16 :goto_7

    :sswitch_d
    add-int v1, v9, v10

    sub-int/2addr v1, v8

    if-ltz v1, :cond_7

    const-string v1, "\u06eb\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x67

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x1807

    const v18, -0x1edbbe8a

    xor-int v4, v4, v18

    const v18, -0xd218e86

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u06eb\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x73f7

    const v18, -0x1a0070c0

    xor-int v4, v4, v18

    const v18, 0x42823d4b

    goto/16 :goto_7

    :sswitch_e
    const v10, 0x50ce879

    .line 152
    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v1, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v1, "\u06e2\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x3d

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0xb05

    const v18, 0x51cdd49e

    xor-int v4, v4, v18

    const v18, -0x636e3f38

    goto/16 :goto_7

    :sswitch_f
    mul-int v8, v6, v7

    mul-int v9, v6, v6

    .line 49
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v1

    if-eqz v1, :cond_9

    goto/16 :goto_5

    :cond_9
    const-string v1, "\u1a79\u0733"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x23

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x7bbb

    const v18, 0x6c957097

    xor-int v4, v4, v18

    const v18, 0x6ee01763

    goto/16 :goto_7

    :sswitch_10
    aget-short v6, v19, v5

    const/16 v7, 0x47ea

    .line 93
    sget v1, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v1, :cond_a

    goto :goto_4

    :cond_a
    const-string v1, "\u1a7b\u1a7b"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x5d

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x4e0b

    const v18, 0x1682dc8a

    xor-int v4, v4, v18

    const v18, -0xb25d10f

    goto/16 :goto_7

    :sswitch_11
    const/16 v5, 0x3a

    .line 41
    sget v1, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v1, :cond_b

    :goto_4
    const-string v1, "\u1a7b\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x61

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x2b2d

    const v18, -0x27398ba9

    xor-int v4, v4, v18

    const v18, -0x7ef08b99

    goto/16 :goto_7

    :cond_b
    const-string v1, "\u1a78\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x5b

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x5d89

    const v18, -0x1892d105

    xor-int v4, v4, v18

    const v18, 0x7537a8e5

    goto :goto_7

    :sswitch_12
    sget-object v19, Ll/۟ۡ᩻;->ۖܿܳ:[S

    .line 31
    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v1, :cond_c

    :goto_5
    const-string v1, "\u0736\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x23

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x4579

    const v18, -0x558108bd

    xor-int v4, v4, v18

    const v18, 0x47790d85

    goto :goto_7

    :cond_c
    const-string v1, "\u073a\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x5b

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0xfd5

    const v18, 0x48c5fba7

    xor-int v4, v4, v18

    const v18, 0x692d62e1

    goto :goto_7

    :sswitch_13
    sget v1, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v1, :cond_e

    :cond_d
    :goto_6
    const-string v1, "\u073d\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x471f

    const v18, -0x6133a26b

    xor-int v4, v4, v18

    const v18, 0x5b2e6840

    goto :goto_7

    :cond_e
    const-string v1, "\u06dc\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x444d

    const v18, -0x1715ae8b

    xor-int v4, v4, v18

    const v18, 0x4f209dea

    :goto_7
    xor-int v18, v1, v18

    move v1, v4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x755ef607 -> :sswitch_2
        -0x724da273 -> :sswitch_2
        -0x6d961553 -> :sswitch_3
        -0x64e405c5 -> :sswitch_b
        -0x4bd5b24b -> :sswitch_13
        -0x4b73a878 -> :sswitch_a
        -0x492a9472 -> :sswitch_6
        -0x3a20cc9f -> :sswitch_f
        -0x30e7c729 -> :sswitch_6
        -0x2863e64b -> :sswitch_c
        -0x2843e340 -> :sswitch_7
        -0x149dfda4 -> :sswitch_10
        -0x12586382 -> :sswitch_a
        -0x624a41e -> :sswitch_e
        -0x11e620e -> :sswitch_3
        -0xc782ed -> :sswitch_12
        0x69c727 -> :sswitch_12
        0x2016487 -> :sswitch_5
        0x69bd1fd -> :sswitch_9
        0x9ded9e0 -> :sswitch_11
        0xdcb55fa -> :sswitch_b
        0xe96c197 -> :sswitch_5
        0x109620ab -> :sswitch_8
        0x137ad896 -> :sswitch_10
        0x1467274d -> :sswitch_1
        0x1e72571c -> :sswitch_0
        0x20241932 -> :sswitch_8
        0x22484f5c -> :sswitch_11
        0x2aa3d043 -> :sswitch_1
        0x32207a69 -> :sswitch_d
        0x328df5e7 -> :sswitch_7
        0x35b5ab1a -> :sswitch_c
        0x47bd443d -> :sswitch_e
        0x47d0eab0 -> :sswitch_4
        0x6252f610 -> :sswitch_0
        0x69001be7 -> :sswitch_9
        0x6bc4a73b -> :sswitch_13
        0x6f839833 -> :sswitch_4
        0x70350475 -> :sswitch_f
        0x716f86c2 -> :sswitch_d
    .end sparse-switch
.end method

.method public static ᩷(Ll/ܽ֡֫;Ll/᩻ۖ᩻;)V
    .locals 23

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

    const v17, -0x93ff222

    sget v18, Ll/᩺;->۫۬۫:I

    sget v19, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v20, "\u06d6\u06eb"

    invoke-static/range {v20 .. v20}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v19

    mul-int/lit8 v20, v20, 0x37

    xor-int v1, v20, v18

    mul-int/lit16 v1, v1, -0x58ff

    const v22, 0x79659fe4

    xor-int v1, v1, v22

    const v22, -0x5e896077

    xor-int v20, v20, v22

    move-object/from16 v16, v5

    move-object v11, v10

    move-object v15, v14

    move/from16 v21, v20

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const v20, -0x93ff222

    const/16 v22, 0x0

    move-object v5, v4

    move-object v14, v13

    const/4 v13, 0x0

    move-object v4, v3

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v8, v20, v18

    mul-int/lit16 v8, v8, -0x789d

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v1, v8

    xor-int v20, v21, v1

    sparse-switch v20, :sswitch_data_0

    .line 37
    sget v1, Ll/ۖᩳ;->᩹ۧܳ:I

    if-lez v1, :cond_2

    :cond_0
    :goto_1
    move/from16 v8, v22

    goto/16 :goto_7

    .line 9
    :sswitch_0
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v1, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v1, "\u1a79\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x2b

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, 0x7f01

    const v21, 0x7cfefc32

    xor-int v8, v8, v21

    const v21, 0x695d31d2

    goto/16 :goto_4

    :cond_2
    const-string v1, "\u0736\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x2f

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, -0x6f83

    const v21, 0x6aa8be4e    # 1.0199911E26f

    xor-int v8, v8, v21

    const v21, -0x5daee582

    goto/16 :goto_4

    .line 65
    :sswitch_1
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    sget-boolean v1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 32
    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    goto/16 :goto_2

    .line 11
    :sswitch_3
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    return-void

    .line 39
    :sswitch_4
    invoke-static {v4, v5}, Ll/ۖ֨;->ᩴᩴۘ(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v4, Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 83
    invoke-interface {v4, v2}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    return-void

    .line 39
    :sswitch_5
    sget-object v1, Ll/۟ۡ᩻;->ۖܿܳ:[S

    const/16 v5, 0x6a

    const/16 v8, 0xd

    invoke-static {v1, v5, v8, v10}, Ll/֫֡;->ܺۜᩴ([SIII)Ljava/lang/String;

    move-result-object v5

    .line 3
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "\u0733\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, -0x7a49

    const v21, 0x56ae572

    xor-int v8, v8, v21

    const v21, 0x36f5b711

    goto/16 :goto_4

    .line 51
    :sswitch_6
    invoke-static {v3}, Ll/ۧۤۧ;->ۙ(Ll/֫ۤۧ;)V

    .line 39
    sget-object v1, Ll/۟ۡ᩻;->᩷:Ll/֨֡᩵;

    invoke-interface {v1}, Ll/֨֡᩵;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 79
    sget v1, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v1, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v1, "\u1a79\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, -0x1af3

    const v21, 0x30f76c2f

    xor-int v8, v8, v21

    const v21, 0x27b4b38e

    goto/16 :goto_4

    .line 49
    :sswitch_7
    invoke-static {v15, v6, v7, v10}, Ll/֨ۢ;->ܰ֫֡([SIII)Ljava/lang/String;

    move-result-object v1

    .line 50
    iput-object v1, v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;->state:Ljava/lang/String;

    .line 51
    new-instance v3, Ll/᩻ۡ᩻;

    move-object/from16 v1, p1

    invoke-direct {v3, v0, v1}, Ll/᩻ۡ᩻;-><init>(Ll/ܽ֡֫;Ll/᩻ۖ᩻;)V

    .line 40
    sget v8, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v8, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v8, "\u06e2\u073a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v18

    mul-int/lit8 v8, v8, -0x1d

    xor-int v1, v8, v19

    mul-int/lit16 v1, v1, 0x7a3b

    const v21, 0xc480b3f

    xor-int v1, v1, v21

    const v21, -0x575cff8b

    xor-int v21, v8, v21

    goto/16 :goto_0

    .line 49
    :sswitch_8
    sget-object v15, Ll/۟ۡ᩻;->ۖܿܳ:[S

    const/16 v6, 0x5b

    const/16 v7, 0xf

    .line 14
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v1

    if-gtz v1, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v1, "\u06d6\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x19

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, 0x4a81

    const v21, 0x4ba2ebb0    # 2.1354336E7f

    xor-int v8, v8, v21

    const v21, -0x45f78a42

    goto/16 :goto_4

    :sswitch_9
    const/16 v1, 0x4c

    const/16 v8, 0xf

    .line 48
    invoke-static {v14, v1, v8, v10}, Ll/ۖ֡;->ۢ۫᩷([SIII)Ljava/lang/String;

    move-result-object v1

    .line 49
    iput-object v1, v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;->scope:Ljava/lang/String;

    .line 23
    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_7

    goto :goto_2

    :cond_7
    const-string v1, "\u06e0\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x47

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, 0x6127

    const v21, -0x64f09e6e

    xor-int v8, v8, v21

    const v21, -0x46296d4f

    goto/16 :goto_4

    .line 48
    :sswitch_a
    new-instance v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;

    invoke-direct {v2}, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;-><init>()V

    sget-object v14, Ll/۟ۡ᩻;->ۖܿܳ:[S

    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v1, :cond_8

    :goto_2
    const-string v1, "\u05ab\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x11

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, -0x40d5

    const v21, -0x54b2d731

    xor-int v8, v8, v21

    const v21, 0x3c994c75

    goto/16 :goto_4

    :cond_8
    const-string v1, "\u0733\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x4f

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, -0x5337

    const v21, 0x19b8abf9

    xor-int v8, v8, v21

    const v21, 0x4afbf1a3    # 8255697.5f

    goto :goto_4

    .line 0
    :sswitch_b
    invoke-static {v11, v12, v13, v10}, Ll/ۖܰ;->۬ۛܳ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-static {v0, v1}, Ll/ܽ;->᩹ᩳܶ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    sget v1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v1, :cond_9

    goto/16 :goto_5

    :cond_9
    const-string v1, "\u06ec\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, -0x7c41

    const v21, 0x4a4727c

    xor-int v8, v8, v21

    const v21, 0x75a1a77d

    goto :goto_4

    .line 0
    :sswitch_c
    sget-object v11, Ll/۟ۡ᩻;->ۖܿܳ:[S

    const/16 v12, 0x44

    const/16 v13, 0x8

    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v1, :cond_a

    goto/16 :goto_1

    :cond_a
    const-string v1, "\u06e7\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x57

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, 0x4397

    const v21, 0x8736417

    xor-int v8, v8, v21

    const v21, 0x7667866f

    goto :goto_4

    :sswitch_d
    const v1, 0xc80e

    const v10, 0xc80e

    goto :goto_3

    :sswitch_e
    const/16 v1, 0x5277

    const/16 v10, 0x5277

    :goto_3
    const-string v1, "\u06d8\u06e0"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x5f

    xor-int v8, v1, v19

    mul-int/lit8 v8, v8, -0x41

    const v21, 0xf8812bd

    xor-int v8, v8, v21

    const v21, -0x767049ab

    :goto_4
    xor-int v21, v1, v21

    move v1, v8

    goto/16 :goto_0

    :sswitch_f
    mul-int v1, v22, v9

    move/from16 v8, v22

    add-int/lit16 v0, v8, 0x4974

    mul-int v0, v0, v0

    sub-int/2addr v1, v0

    if-lez v1, :cond_b

    const-string v0, "\u06dc\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x6d

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x6083

    const v21, 0x6e23220b

    xor-int v1, v1, v21

    const v21, -0x57dd7212

    goto/16 :goto_8

    :cond_b
    const-string v0, "\u0736\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x477

    const v21, -0x2f1fbb57

    xor-int v1, v1, v21

    const v21, 0x374310e0

    goto :goto_8

    :sswitch_10
    aget-short v22, v16, v17

    const v9, 0x125d0

    sget v0, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v0, :cond_c

    :goto_5
    const-string v0, "\u1a73\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x25

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x743b

    const v8, 0x65f44a21

    xor-int/2addr v1, v8

    const v8, 0x7b48146a

    goto :goto_6

    :cond_c
    const-string v0, "\u1a77\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x4043

    const v8, 0x2d756964

    xor-int/2addr v1, v8

    const v8, 0x6647c26d

    :goto_6
    xor-int v21, v0, v8

    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_11
    move/from16 v8, v22

    sget-object v16, Ll/۟ۡ᩻;->ۖܿܳ:[S

    const/16 v17, 0x43

    .line 51
    sget v0, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v0, :cond_d

    :goto_7
    const-string v0, "\u06d8\u1a74"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x33e3

    const v21, 0xc2271e7

    xor-int v1, v1, v21

    const v21, -0x5b31aa80

    goto :goto_8

    :cond_d
    const-string v0, "\u1a78\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x2b

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x233f

    const v21, 0x1606b77d

    xor-int v1, v1, v21

    const v21, -0x22c3fd6a

    :goto_8
    xor-int v21, v0, v21

    move-object/from16 v0, p0

    move/from16 v22, v8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f92fbf7 -> :sswitch_2
        -0x61243daa -> :sswitch_9
        -0x5322faf5 -> :sswitch_c
        -0x453c3e1f -> :sswitch_d
        -0x3e9812f4 -> :sswitch_10
        -0x3d60939d -> :sswitch_4
        -0x30cb1107 -> :sswitch_e
        -0x2f7e3a42 -> :sswitch_10
        -0x2a6a31cb -> :sswitch_3
        -0x29fc87dd -> :sswitch_7
        -0x25f9bcd7 -> :sswitch_e
        -0x1f617b93 -> :sswitch_2
        -0xb8cc5a8 -> :sswitch_d
        -0x7e578da -> :sswitch_0
        -0x674609b -> :sswitch_6
        -0x5977db9 -> :sswitch_b
        -0x36434e1 -> :sswitch_6
        -0x1e3dd37 -> :sswitch_1
        0x3143710 -> :sswitch_5
        0x1256f1ac -> :sswitch_4
        0x12e0d7ad -> :sswitch_8
        0x229ef743 -> :sswitch_c
        0x25f1f5fb -> :sswitch_11
        0x2a73724f -> :sswitch_9
        0x32459d42 -> :sswitch_b
        0x3a793660 -> :sswitch_8
        0x42e7463b -> :sswitch_f
        0x5102c5a2 -> :sswitch_a
        0x52274857 -> :sswitch_5
        0x61434184 -> :sswitch_0
        0x6be70218 -> :sswitch_7
        0x6c7297a9 -> :sswitch_a
        0x6dc35e22 -> :sswitch_1
        0x71dca79f -> :sswitch_f
        0x73045ebd -> :sswitch_3
        0x7e6c43c9 -> :sswitch_11
    .end sparse-switch
.end method

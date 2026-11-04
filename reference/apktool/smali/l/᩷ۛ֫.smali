.class public final Ll/᩷ۛ֫;
.super Ljava/lang/Object;
.source "O3YD"

# interfaces
.implements Lbin/mt/plugin/api/preference/PluginPreference$PreferenceScreen;


# static fields
.field private static final ܿ᩺᩷:[S


# instance fields
.field public final synthetic ۙ:Ll/ۤۛ֫;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩷ۛ֫;->ܿ᩺᩷:[S

    return-void

    :array_0
    .array-data 2
        0xbes
        0x132es
        0x1303s
        0x1307s
        0x1302s
        0x1303s
        0x1314s
        0x1346s
        0x1308s
        0x1309s
        0x1312s
        0x1346s
        0x1300s
        0x1309s
        0x1313s
        0x1308s
        0x1302s
        0x135cs
        0x1346s
        0x4d3s
        -0x24ccs
        -0x24eas
        -0x24ffs
        -0x24fes
        -0x24ffs
        -0x24eas
        -0x24ffs
        -0x24f6s
        -0x24f9s
        -0x24ffs
        -0x24bcs
        -0x24f6s
        -0x24f5s
        -0x24f0s
        -0x24bcs
        -0x24fes
        -0x24f5s
        -0x24efs
        -0x24f6s
        -0x2500s
        -0x24a2s
        -0x24bcs
    .end array-data
.end method

.method public constructor <init>(Ll/ۤۛ֫;)V
    .locals 0

    .line 503
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۛ֫;->ۙ:Ll/ۤۛ֫;

    return-void
.end method


# virtual methods
.method public final findHeader(Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$PreferenceHeader;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x6e6e6c3e

    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v6, Ll/ۗ᩵;->ᩳܶۤ:I

    const-string v7, "\u1a7b\u073f"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x3861

    const v9, -0x40e7cb2f

    xor-int/2addr v8, v9

    const v9, -0x31d3d3b2

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, 0x58cf

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 495
    sget v7, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v7, :cond_c

    goto/16 :goto_4

    .line 156
    :sswitch_0
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v7, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v7, :cond_a

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    sget v7, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v7, :cond_5

    goto/16 :goto_6

    .line 428
    :sswitch_2
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v7

    if-nez v7, :cond_e

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    const/4 p1, 0x0

    return-object p1

    .line 540
    :sswitch_5
    new-instance v7, Ll/۬ۨ֫;

    invoke-direct {v7, v0, v3}, Ll/۬ۨ֫;-><init>(Ll/ۤۛ֫;Ll/ۛ᩺֫;)V

    iput-object v7, v3, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;

    goto :goto_1

    .line 542
    :sswitch_6
    iget-object p1, v3, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;

    check-cast p1, Lbin/mt/plugin/api/preference/PluginPreference$PreferenceHeader;

    return-object p1

    .line 539
    :sswitch_7
    iget-object v7, v3, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;

    if-nez v7, :cond_0

    const-string v7, "\u06ec\u05a8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3a51

    const v9, -0x3a789261

    xor-int/2addr v8, v9

    const v9, 0x2e11931d

    goto :goto_0

    :cond_0
    :goto_1
    const-string v7, "\u06eb\u073d"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x11

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x615b

    const v9, 0x1346d632

    xor-int/2addr v8, v9

    const v9, -0xaed5131

    goto :goto_0

    .line 538
    :sswitch_8
    move-object v3, v2

    check-cast v3, Ll/ۛ᩺֫;

    iget-object v7, v3, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    invoke-static {p1, v7}, Ll/ۗܶ;->᩵֡ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const-string v7, "\u1a74\u05ab"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x2f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x5bef

    const v9, 0x12a97e9a

    xor-int/2addr v8, v9

    const v9, 0x3f551c07

    goto/16 :goto_0

    .line 537
    :sswitch_9
    invoke-static {v1}, Ll/֨ۚ;->ᩳ᩷ܺ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰ᩺֫;

    .line 538
    instance-of v7, v2, Ll/ۛ᩺֫;

    if-eqz v7, :cond_2

    const-string v7, "\u1a7a\u05ab"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x3b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5e1b

    const v9, -0xae29b0

    xor-int/2addr v8, v9

    const v9, -0x637ae251

    goto/16 :goto_0

    :sswitch_a
    const/4 p1, 0x0

    return-object p1

    .line 537
    :sswitch_b
    invoke-static {v1}, Ll/֫ۢ;->᩷ۤ᩷(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const-string v7, "\u073a\u06e8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x17

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x163

    const v9, 0x580a7ffd

    xor-int/2addr v8, v9

    const v9, -0x35a89f70    # -3528740.0f

    goto/16 :goto_0

    :cond_1
    const-string v7, "\u06e8\u06db"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x6033

    const v9, 0x479e2243

    xor-int/2addr v8, v9

    const v9, -0x5a55888d

    goto/16 :goto_0

    :sswitch_c
    invoke-static {v0}, Ll/ۤۛ֫;->ᩴ(Ll/ۤۛ֫;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Ll/֨ᩳ;->ۛۙۙ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    const-string v7, "\u06db\u1a74"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x25df

    const v9, -0x52d05348

    xor-int/2addr v8, v9

    const v9, 0x7aea9ddd

    goto/16 :goto_0

    :sswitch_d
    iget-object v0, p0, Ll/᩷ۛ֫;->ۙ:Ll/ۤۛ֫;

    .line 148
    sget v7, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v7, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v7, "\u06e0\u05a1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x262b

    const v9, -0x4b61a9ec

    xor-int/2addr v8, v9

    const v9, -0x3277b3d3

    goto/16 :goto_0

    .line 437
    :sswitch_e
    sget v7, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v7, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v7, "\u1a7b\u06e1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x4b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x46d5

    const v9, 0x2b56ed79

    xor-int/2addr v8, v9

    const v9, -0x148f85ad

    goto/16 :goto_0

    .line 342
    :sswitch_f
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    :goto_2
    const-string v7, "\u06da\u1a7b"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x47

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6c9b

    const v9, 0x1e553d71

    xor-int/2addr v8, v9

    const v9, -0x5db7c00b

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u06ec\u06db"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x3d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x330d

    const v9, -0xe21f573

    xor-int/2addr v8, v9

    const v9, -0x2e036362

    goto/16 :goto_0

    .line 211
    :sswitch_10
    sget v7, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v7, :cond_7

    goto :goto_3

    :cond_7
    const-string v7, "\u0736\u06d6"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x46ef

    const v9, -0x2c0614ca

    xor-int/2addr v8, v9

    const v9, -0x41dde8a0

    goto/16 :goto_0

    .line 84
    :sswitch_11
    sget v7, Ll/ۖ;->ܿۚ֡:I

    if-ltz v7, :cond_8

    goto :goto_3

    :cond_8
    const-string v7, "\u1a7a\u073a"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x361d

    const v9, 0x101db760

    xor-int/2addr v8, v9

    const v9, 0x5f4ea7b0

    goto/16 :goto_0

    .line 172
    :sswitch_12
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v7

    if-nez v7, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v7, "\u1a76\u05a8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1c8b

    const v9, 0x541bc539

    xor-int/2addr v8, v9

    const v9, -0x2430d021

    goto/16 :goto_0

    .line 406
    :sswitch_13
    sget v7, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v7, :cond_b

    :cond_a
    :goto_3
    const-string v7, "\u073f\u1a74"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0xa93

    const v9, 0x16066ad2

    xor-int/2addr v8, v9

    const v9, -0x7b455138

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u06df\u05ab"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x77

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4797

    const v9, 0x778674c1

    xor-int/2addr v8, v9

    const v9, -0x5a043dc1

    goto/16 :goto_0

    :goto_4
    const-string v7, "\u1a74\u0730"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x29

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6a7d

    const v9, -0x334756e6    # -9.681531E7f

    xor-int/2addr v8, v9

    const v9, -0x7f425967

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u0733\u06e1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x39

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2bb1

    const v9, 0x46d64a17

    xor-int/2addr v8, v9

    const v9, 0x38a2d5d1

    goto/16 :goto_0

    .line 239
    :sswitch_14
    sget v7, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v7, :cond_d

    :goto_5
    const-string v7, "\u1a78\u1a7b"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x41

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2ce1

    const v9, 0x2bd0d619

    xor-int/2addr v8, v9

    const v9, -0x1d78b0c4

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u0736\u073a"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7a75

    const v9, -0x3cc5693e

    xor-int/2addr v8, v9

    const v9, 0x547f881f    # 4.3900016E12f

    goto/16 :goto_0

    .line 99
    :sswitch_15
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v7

    if-gtz v7, :cond_f

    :cond_e
    :goto_6
    const-string v7, "\u06eb\u1a73"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x3d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x12c3

    const v9, 0xb0289c1

    xor-int/2addr v8, v9

    const v9, -0x333e12a1    # -1.0167372E8f

    goto/16 :goto_0

    :cond_f
    const-string v7, "\u1a7a\u1a7b"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x3

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3c1b

    const v9, -0x62dd9de

    xor-int/2addr v8, v9

    const v9, -0x645a0742

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x799a42da -> :sswitch_c
        -0x78186d25 -> :sswitch_14
        -0x60ce90f1 -> :sswitch_4
        -0x582cec34 -> :sswitch_e
        -0x4f0eb8b2 -> :sswitch_9
        -0x4bbc16ce -> :sswitch_d
        -0x4a875cee -> :sswitch_12
        -0x45231754 -> :sswitch_3
        -0x439c6db1 -> :sswitch_f
        -0x405e4507 -> :sswitch_e
        -0x3a76be88 -> :sswitch_c
        -0x33a2b1f3 -> :sswitch_b
        -0x20c6acf3 -> :sswitch_13
        -0x1bcbbffb -> :sswitch_5
        -0x12f25a1b -> :sswitch_6
        -0x11b87fb6 -> :sswitch_a
        -0xa302536 -> :sswitch_f
        -0x99c4e03 -> :sswitch_14
        0x5d1a860 -> :sswitch_0
        0x14005375 -> :sswitch_2
        0x14a0b07a -> :sswitch_10
        0x180a0eac -> :sswitch_9
        0x27447834 -> :sswitch_7
        0x28f107d6 -> :sswitch_6
        0x2c894264 -> :sswitch_1
        0x2d05e339 -> :sswitch_a
        0x31884156 -> :sswitch_7
        0x320d68f4 -> :sswitch_1
        0x3a6f027f -> :sswitch_13
        0x462ae892 -> :sswitch_12
        0x4694fdef -> :sswitch_b
        0x47a4a4f5 -> :sswitch_15
        0x53466ee6 -> :sswitch_2
        0x56c22693 -> :sswitch_0
        0x5f12a9f8 -> :sswitch_3
        0x65fc64eb -> :sswitch_5
        0x69f28406 -> :sswitch_11
        0x6d7b2b04 -> :sswitch_11
        0x6dcc1252 -> :sswitch_d
        0x77f40b3d -> :sswitch_8
        0x78064237 -> :sswitch_8
        0x78982d43 -> :sswitch_15
        0x79674553 -> :sswitch_10
        0x7ed7c766 -> :sswitch_4
    .end sparse-switch
.end method

.method public final findPreference(Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$PreferenceItem;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x1c999a5b

    sget v4, Ll/֡ۢ;->۟֡᩻:I

    sget v5, Ll/֫֨;->᩶ܺۡ:I

    const-string v6, "\u0730\u0736"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x535d

    const v8, 0x233f9be8

    xor-int/2addr v7, v8

    const v8, -0x5219485a

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x12f7

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 247
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    const/4 p1, 0x0

    return-object p1

    :sswitch_0
    sget v6, Ll/֫֨;->᩶ܺۡ:I

    if-lez v6, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v6, "\u06e1\u06eb"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x79

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3e45

    const v8, -0x2e771ef6

    xor-int/2addr v7, v8

    const v8, 0x33a78d4b

    goto :goto_0

    .line 132
    :sswitch_1
    sget v6, Ll/᩺;->۫۬۫:I

    if-gtz v6, :cond_b

    goto :goto_1

    .line 215
    :sswitch_2
    sget v6, Ll/ۖۙ;->ۤۧۤ:I

    if-gez v6, :cond_1

    goto/16 :goto_5

    :cond_1
    :goto_1
    const-string v6, "\u06ec\u073a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x4b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3b39

    const v8, 0x18ddd4d1

    xor-int/2addr v7, v8

    const v8, -0x60aab3dd

    goto :goto_0

    .line 192
    :sswitch_3
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    goto/16 :goto_5

    .line 564
    :sswitch_4
    new-instance v6, Ll/ۙۛ֫;

    invoke-direct {v6, v0, v2}, Ll/ۙۛ֫;-><init>(Ll/ۤۛ֫;Ll/ܰ᩺֫;)V

    iput-object v6, v2, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;

    goto :goto_2

    .line 566
    :sswitch_5
    iget-object p1, v2, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;

    check-cast p1, Lbin/mt/plugin/api/preference/PluginPreference$PreferenceItem;

    return-object p1

    .line 563
    :sswitch_6
    iget-object v6, v2, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;

    if-nez v6, :cond_2

    const-string v6, "\u06d8\u073a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x5

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5e33

    const v8, -0x2df0bff3

    xor-int/2addr v7, v8

    const v8, -0x3a008f27

    goto :goto_0

    :cond_2
    :goto_2
    const-string v6, "\u073f\u06df"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5f2b

    const v8, 0x2708f77f

    xor-int/2addr v7, v8

    const v8, 0x42d09cb6

    goto/16 :goto_0

    .line 562
    :sswitch_7
    iget-object v6, v2, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    invoke-static {p1, v6}, Ll/ۗܶ;->᩵֡ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const-string v6, "\u06e2\u06dc"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1669

    const v8, -0x758a4f28

    xor-int/2addr v7, v8

    const v8, -0x6f49f8e2

    goto/16 :goto_0

    .line 561
    :sswitch_8
    invoke-static {v1}, Ll/ۘܶ;->֡۟ۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰ᩺֫;

    .line 562
    instance-of v6, v2, Ll/ۛ᩺֫;

    if-nez v6, :cond_4

    const-string v6, "\u06dc\u073d"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x65e7

    const v8, -0x336ad23f    # -7.8212616E7f

    xor-int/2addr v7, v8

    const v8, -0x108f6fff

    goto/16 :goto_0

    :sswitch_9
    const/4 p1, 0x0

    return-object p1

    .line 561
    :sswitch_a
    invoke-static {v1}, Ll/֫ۢ;->᩷ۤ᩷(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v6, "\u06df\u073a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x713b

    const v8, 0x12b6052

    xor-int/2addr v7, v8

    const v8, -0x58c91cee

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u06eb\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x11

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x62ab

    const v8, -0x4028dae3

    xor-int/2addr v7, v8

    const v8, -0x2a13395c

    goto/16 :goto_0

    :sswitch_b
    invoke-static {v0}, Ll/ۤۛ֫;->ᩴ(Ll/ۤۛ֫;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Ll/֨ᩳ;->ۛۙۙ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    const-string v6, "\u06e4\u073f"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x33

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x429

    const v8, -0x28bec354

    xor-int/2addr v7, v8

    const v8, 0x1c49fa1d

    goto/16 :goto_0

    :sswitch_c
    iget-object v0, p0, Ll/᩷ۛ֫;->ۙ:Ll/ۤۛ֫;

    .line 431
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_3

    :cond_5
    const-string v6, "\u1a78\u0733"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x62ad

    const v8, 0x5a0f947d

    xor-int/2addr v7, v8

    const v8, -0x164cd06c

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v6

    if-nez v6, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v6, "\u06dc\u06d6"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x47

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1fcf

    const v8, 0x2d6c020e

    xor-int/2addr v7, v8

    const v8, -0x5952016e

    goto/16 :goto_0

    .line 297
    :sswitch_e
    sget v6, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v6, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v6, "\u1a74\u06eb"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x459f

    const v8, 0x28d23810

    xor-int/2addr v7, v8

    const v8, 0x3042776b

    goto/16 :goto_0

    :sswitch_f
    sget v6, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v6, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v6, "\u0736\u0733"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x19df

    const v8, 0x8f02e51

    xor-int/2addr v7, v8

    const v8, 0x64bce58e

    goto/16 :goto_0

    .line 198
    :sswitch_10
    sget v6, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v6, :cond_9

    :goto_3
    const-string v6, "\u06d6\u0730"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x49

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xab7

    const v8, 0x192698b

    xor-int/2addr v7, v8

    const v8, 0x2cd8a5c0

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u073d\u1a74"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6917

    const v8, -0x264106e3

    xor-int/2addr v7, v8

    const v8, 0x7260cf1c

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v6

    if-ltz v6, :cond_a

    goto/16 :goto_5

    :cond_a
    const-string v6, "\u06d6\u1a79"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3193

    const v8, -0x24a024e9

    xor-int/2addr v7, v8

    const v8, 0x70ac6f1

    goto/16 :goto_0

    .line 240
    :sswitch_12
    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v6, :cond_c

    :cond_b
    :goto_4
    const-string v6, "\u1a7a\u05ab"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x6b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7909

    const v8, 0x16da5467

    xor-int/2addr v7, v8

    const v8, 0x2e51f7fc

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06dc\u1a7a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit8 v7, v7, -0x39

    const v8, -0x18748d52

    xor-int/2addr v7, v8

    const v8, -0x682224bf

    goto/16 :goto_0

    .line 480
    :sswitch_13
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v6

    if-nez v6, :cond_d

    goto :goto_5

    :cond_d
    const-string v6, "\u06e7\u1a7b"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1293

    const v8, -0x36a9211d

    xor-int/2addr v7, v8

    const v8, -0x2ac21763

    goto/16 :goto_0

    .line 556
    :sswitch_14
    sget v6, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v6, :cond_e

    goto :goto_5

    :cond_e
    const-string v6, "\u1a7a\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x71

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4483

    const v8, 0x1975d11

    xor-int/2addr v7, v8

    const v8, 0x31fb1209

    goto/16 :goto_0

    :sswitch_15
    sget-boolean v6, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v6, :cond_f

    :goto_5
    const-string v6, "\u1a74\u06dc"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x39

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x231f

    const v8, -0x24dd9c89

    xor-int/2addr v7, v8

    const v8, -0x2d0532f9

    goto/16 :goto_0

    :cond_f
    const-string v6, "\u0736\u06d9"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x5b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7e3d

    const v8, -0x3b660fcf

    xor-int/2addr v7, v8

    const v8, -0x176bcb16

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7dc3891a -> :sswitch_b
        -0x7cdb2b3c -> :sswitch_14
        -0x7c9be953 -> :sswitch_12
        -0x76564328 -> :sswitch_13
        -0x6f7a8552 -> :sswitch_2
        -0x6afe3dbb -> :sswitch_7
        -0x696d16ad -> :sswitch_c
        -0x5cbc9179 -> :sswitch_10
        -0x5af6da15 -> :sswitch_6
        -0x5111a396 -> :sswitch_d
        -0x42ac2bf8 -> :sswitch_0
        -0x3e69cfc2 -> :sswitch_1
        -0x36bb3348 -> :sswitch_4
        -0x32d098fc -> :sswitch_a
        -0x31fdbf9d -> :sswitch_4
        -0x288e4fed -> :sswitch_15
        -0x25304ad1 -> :sswitch_7
        -0x23f01520 -> :sswitch_b
        -0x225e2166 -> :sswitch_8
        -0x1fe2196b -> :sswitch_8
        -0x1f7d19da -> :sswitch_12
        -0x12b52a14 -> :sswitch_11
        -0x174fb57 -> :sswitch_15
        0x8f7d478 -> :sswitch_f
        0xe37a394 -> :sswitch_9
        0x28037179 -> :sswitch_6
        0x2da19c16 -> :sswitch_1
        0x32b5d65d -> :sswitch_10
        0x3396e838 -> :sswitch_f
        0x38479a85 -> :sswitch_5
        0x4ad6ac2f -> :sswitch_d
        0x504e32dd -> :sswitch_3
        0x5103fdfc -> :sswitch_e
        0x5319444c -> :sswitch_e
        0x5523dd6c -> :sswitch_11
        0x56a5cc19 -> :sswitch_a
        0x56c91a3c -> :sswitch_2
        0x595cb32d -> :sswitch_c
        0x60f7c456 -> :sswitch_5
        0x628fc296 -> :sswitch_14
        0x63ccb913 -> :sswitch_13
        0x710b57dc -> :sswitch_9
        0x759556e8 -> :sswitch_3
        0x7f596c7d -> :sswitch_0
    .end sparse-switch
.end method

.method public final getSubtitle()Ljava/lang/CharSequence;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x483509b3

    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v5, "\u0733\u1a78"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x4b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7a9f

    const v7, 0x629b5bdd

    xor-int/2addr v6, v7

    const v7, 0x2492e92b

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x4f41

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget v5, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v5, :cond_3

    goto/16 :goto_4

    .line 124
    :sswitch_0
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v5

    if-nez v5, :cond_c

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    sget-boolean v5, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v5, :cond_a

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    sget v5, Ll/ۧ;->ۨۗܰ:I

    if-gez v5, :cond_6

    goto :goto_1

    .line 396
    :sswitch_3
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    :goto_1
    const-string v5, "\u06e0\u1a77"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x73

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5311

    const v7, -0x26b86b65

    xor-int/2addr v6, v7

    const v7, 0x3ff86726

    goto :goto_0

    .line 25
    :sswitch_4
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    return-object v1

    :sswitch_6
    const-string v0, ""

    return-object v0

    .line 525
    :sswitch_7
    invoke-static {v0}, Ll/ۤۛ֫;->᩻(Ll/ۤۛ֫;)Ll/ܶ᩹;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩹;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v5, "\u073f\u06e7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x57

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x583b

    const v7, -0x55719d6a

    xor-int/2addr v6, v7

    const v7, -0x6b87f5ab

    goto :goto_0

    :cond_0
    const-string v5, "\u06db\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x7b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7763

    const v7, -0x41e327c

    xor-int/2addr v6, v7

    const v7, -0x2a235131

    goto/16 :goto_0

    .line 231
    :sswitch_8
    sget v5, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v5, :cond_1

    const-string v5, "\u06e2\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7a8f

    const v7, -0x7c25b33f

    xor-int/2addr v6, v7

    const v7, 0x5364d36a

    goto/16 :goto_0

    :cond_1
    const-string v5, "\u06d7\u1a77"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x43

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x715f

    const v7, -0x6c348b6d

    xor-int/2addr v6, v7

    const v7, 0x3ac75015

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_2

    goto :goto_2

    :cond_2
    const-string v5, "\u1a7b\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x7

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1965

    const v7, -0x6bc1a03a

    xor-int/2addr v6, v7

    const v7, 0x54cc9d56

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u05a8\u1a73"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x75

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x37ad

    const v7, -0x11365137

    xor-int/2addr v6, v7

    const v7, 0x7202621c

    goto/16 :goto_0

    :sswitch_a
    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u06e8\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x42b5

    const v7, 0x233aa03c

    xor-int/2addr v6, v7

    const v7, 0x893b853

    goto/16 :goto_0

    .line 343
    :sswitch_b
    sget v5, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v5, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v5, "\u06ec\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6263

    const v7, 0x35422813

    xor-int/2addr v6, v7

    const v7, -0x5f4df819

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v5

    if-gtz v5, :cond_7

    :cond_6
    :goto_2
    const-string v5, "\u073f\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x57

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x65c1

    const v7, 0x6d1432e1

    xor-int/2addr v6, v7

    const v7, 0x22a42432

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06dc\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5f9d

    const v7, -0x1a9cc730

    xor-int/2addr v6, v7

    const v7, 0x6cf5013

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v5, :cond_8

    goto :goto_4

    :cond_8
    const-string v5, "\u06df\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x7b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3c5b

    const v7, -0x329f15f7

    xor-int/2addr v6, v7

    const v7, 0x3857fff6

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v5

    if-ltz v5, :cond_9

    goto :goto_3

    :cond_9
    const-string v5, "\u06ec\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x11

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x25f3

    const v7, -0x5ff656f1

    xor-int/2addr v6, v7

    const v7, 0x36b17cfe

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v5, :cond_b

    :cond_a
    :goto_3
    const-string v5, "\u1a77\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x43

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x32c3

    const v7, -0x1575a2c7

    xor-int/2addr v6, v7

    const v7, -0x76e25417

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06e4\u1a7a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x22e7

    const v7, 0x3066459a

    xor-int/2addr v6, v7

    const v7, -0x36604b84    # -1308303.5f

    goto/16 :goto_0

    .line 525
    :sswitch_10
    iget-object v0, p0, Ll/᩷ۛ֫;->ۙ:Ll/ۤۛ֫;

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    :goto_4
    const-string v5, "\u1a75\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x67

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6d39

    const v7, 0x6827e541

    xor-int/2addr v6, v7

    const v7, -0x2785c5f2    # -1.100509E15f

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u05a8\u06dc"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x18c3

    const v7, 0xc932303    # 2.2670008E-31f

    xor-int/2addr v6, v7

    const v7, 0x2e0029d8

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77bd5190 -> :sswitch_2
        -0x7680521f -> :sswitch_8
        -0x6c9996c0 -> :sswitch_4
        -0x67fc1349 -> :sswitch_8
        -0x5cc4a1a2 -> :sswitch_5
        -0x553882a2 -> :sswitch_d
        -0x52efa1e2 -> :sswitch_7
        -0x52858873 -> :sswitch_e
        -0x4968c9b8 -> :sswitch_9
        -0x3e92e8b4 -> :sswitch_0
        -0x2659fecc -> :sswitch_3
        -0xfc1582a -> :sswitch_1
        -0xb9c58e2 -> :sswitch_c
        0xaaf4662 -> :sswitch_a
        0x10cb3d18 -> :sswitch_9
        0x219cc412 -> :sswitch_5
        0x259b8e7f -> :sswitch_e
        0x296b8e25 -> :sswitch_3
        0x33322834 -> :sswitch_d
        0x36b3658d -> :sswitch_a
        0x37813cb0 -> :sswitch_0
        0x3afdac50 -> :sswitch_b
        0x3b993336 -> :sswitch_6
        0x42845d6f -> :sswitch_7
        0x42de6b6b -> :sswitch_c
        0x464b114f -> :sswitch_2
        0x4e911e2d -> :sswitch_1
        0x5153029a -> :sswitch_4
        0x54024ed7 -> :sswitch_10
        0x5c9ee745 -> :sswitch_f
        0x6b3222c1 -> :sswitch_10
        0x6fc7b854 -> :sswitch_f
        0x729446d4 -> :sswitch_6
        0x7451c7a1 -> :sswitch_b
    .end sparse-switch
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x7369eb4a

    sget v3, Ll/֡᩵;->ۤܳ۬:I

    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v5, "\u1a7b\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xf65

    const v7, -0x7e2742b1

    xor-int/2addr v6, v7

    const v7, 0x6f2c45e6

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x559

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 288
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v5

    if-gtz v5, :cond_a

    goto/16 :goto_2

    .line 129
    :sswitch_0
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget v5, Ll/֡ۢ;->۟֡᩻:I

    if-lez v5, :cond_4

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    sget-boolean v5, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v5, :cond_c

    goto/16 :goto_2

    .line 293
    :sswitch_2
    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v5, :cond_9

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    :goto_1
    const-string v5, "\u06e2\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x3f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6da3

    const v7, -0x34f18c6d    # -9335699.0f

    xor-int/2addr v6, v7

    const v7, 0x7c3c6444

    goto :goto_0

    .line 146
    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    return-object v1

    :sswitch_6
    const-string v0, ""

    return-object v0

    .line 513
    :sswitch_7
    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v5, "\u06eb\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x2b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x56a3

    const v7, -0x3031976c

    xor-int/2addr v6, v7

    const v7, -0x48649bf1

    goto :goto_0

    :cond_0
    const-string v5, "\u06d7\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x401f

    const v7, 0x2dae3e9e

    xor-int/2addr v6, v7

    const v7, -0x291b98d2

    goto :goto_0

    :sswitch_8
    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u073a\u06db"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x75

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2f5d

    const v7, -0x358d9308    # -3971902.0f

    xor-int/2addr v6, v7

    const v7, 0x7a466399

    goto/16 :goto_0

    .line 400
    :sswitch_9
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v5

    if-gtz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u06d8\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x5d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x349b

    const v7, -0x7ccd6223

    xor-int/2addr v6, v7

    const v7, -0xbd2f713

    goto/16 :goto_0

    .line 327
    :sswitch_a
    sget v5, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v5, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v5, "\u06e0\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4f47

    const v7, 0x5dda6444

    xor-int/2addr v6, v7

    const v7, 0x4eca1b8e

    goto/16 :goto_0

    .line 458
    :sswitch_b
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    const-string v5, "\u1a79\u1a73"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6965

    const v7, 0x34214dbc

    xor-int/2addr v6, v7

    const v7, -0x58abd2fe

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u1a7a\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xc5b

    const v7, -0x59959bf9

    xor-int/2addr v6, v7

    const v7, 0x69f4e551

    goto/16 :goto_0

    .line 200
    :sswitch_c
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v5

    if-gtz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u1a73\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1677

    const v7, -0x60729c1

    xor-int/2addr v6, v7

    const v7, 0x1871e47c

    goto/16 :goto_0

    .line 276
    :sswitch_d
    sget v5, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u05a8\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x2b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x74ab

    const v7, 0xacc9933

    xor-int/2addr v6, v7

    const v7, -0x71e586fd

    goto/16 :goto_0

    .line 226
    :sswitch_e
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v5

    if-ltz v5, :cond_8

    goto :goto_2

    :cond_8
    const-string v5, "\u0733\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x42fb

    const v7, -0x6e30178f

    xor-int/2addr v6, v7

    const v7, 0x4547d4e2

    goto/16 :goto_0

    :cond_9
    :goto_2
    const-string v5, "\u1a7a\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x42b

    const v7, 0x4292e542

    xor-int/2addr v6, v7

    const v7, 0x3d79a74a

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a7a\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3a2f

    const v7, -0x69b19c77

    xor-int/2addr v6, v7

    const v7, -0x59af5e8

    goto/16 :goto_0

    .line 269
    :sswitch_f
    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v5, :cond_b

    :goto_3
    const-string v5, "\u1a74\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7f2d

    const v7, 0x1f5a32d2

    xor-int/2addr v6, v7

    const v7, 0x3040f33b

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06da\u1a7b"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x580d

    const v7, -0x145563e9

    xor-int/2addr v6, v7

    const v7, -0x755fb0a9

    goto/16 :goto_0

    .line 513
    :sswitch_10
    iget-object v0, p0, Ll/᩷ۛ֫;->ۙ:Ll/ۤۛ֫;

    .line 421
    sget v5, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v5, :cond_d

    :cond_c
    :goto_4
    const-string v5, "\u06ec\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6d11

    const v7, -0x13580691

    xor-int/2addr v6, v7

    const v7, -0x13a2812a

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06e2\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x78d

    const v7, 0x5147adf3

    xor-int/2addr v6, v7

    const v7, -0x71463304

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7798f4e7 -> :sswitch_5
        -0x7072cfa7 -> :sswitch_2
        -0x6d58b7e5 -> :sswitch_b
        -0x697aed6f -> :sswitch_e
        -0x56b5699c -> :sswitch_4
        -0x4569a3d6 -> :sswitch_0
        -0x42740f6b -> :sswitch_d
        -0x326d0a65 -> :sswitch_e
        -0x2bab03ec -> :sswitch_9
        -0x2ad8c4ee -> :sswitch_d
        -0x215531e6 -> :sswitch_9
        -0x1cddb4a6 -> :sswitch_a
        -0x1aa294b3 -> :sswitch_3
        -0x1a0513ff -> :sswitch_10
        -0x1486d2ab -> :sswitch_0
        -0x143e7e2a -> :sswitch_3
        -0x4169782 -> :sswitch_c
        0x4fe277 -> :sswitch_f
        0x3059920 -> :sswitch_6
        0x46c8580 -> :sswitch_f
        0x30ea90df -> :sswitch_7
        0x31e6b552 -> :sswitch_c
        0x33aa34a1 -> :sswitch_5
        0x37376b88 -> :sswitch_1
        0x4b80f744 -> :sswitch_a
        0x595616bd -> :sswitch_10
        0x5b772b07 -> :sswitch_4
        0x5c312b76 -> :sswitch_6
        0x63a2eba4 -> :sswitch_8
        0x64af5f0b -> :sswitch_8
        0x66881a2d -> :sswitch_2
        0x7675c1f5 -> :sswitch_b
        0x7a347f9c -> :sswitch_1
        0x7ec3459c -> :sswitch_7
    .end sparse-switch
.end method

.method public final recreate()V
    .locals 1

    .line 507
    iget-object v0, p0, Ll/᩷ۛ֫;->ۙ:Ll/ۤۛ֫;

    invoke-static {v0}, Ll/ۤۛ֫;->֫(Ll/ۤۛ֫;)V

    return-void
.end method

.method public final requireHeader(Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$PreferenceHeader;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, -0x24e54e32

    sget v9, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v10, Ll/ۗܰ;->ܶۜ۬:I

    const-string v11, "\u06e8\u1a78"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x3d

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x48f

    const v13, -0x438fcbc6

    xor-int/2addr v12, v13

    const v13, 0x7e091043

    xor-int/2addr v11, v13

    :goto_0
    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, -0x1b89

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 553
    new-instance v11, Ljava/lang/IllegalArgumentException;

    sget-object v12, Ll/᩷ۛ֫;->ܿ᩺᩷:[S

    .line 141
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v13

    if-nez v13, :cond_3

    goto :goto_2

    .line 97
    :sswitch_0
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v11, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v11, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v12, p1

    goto/16 :goto_8

    :cond_1
    :goto_2
    move-object/from16 v12, p1

    goto/16 :goto_7

    .line 28
    :sswitch_1
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget v11, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v11, :cond_0

    :cond_2
    move-object/from16 v12, p1

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    sget v11, Ll/֡᩵;->ۤܳ۬:I

    if-gez v11, :cond_2

    :goto_3
    move-object/from16 v12, p1

    goto/16 :goto_6

    .line 118
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    goto :goto_3

    .line 309
    :sswitch_4
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    const/4 v0, 0x0

    :sswitch_5
    return-object v0

    :cond_3
    const/4 v13, 0x1

    .line 172
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v14

    if-gtz v14, :cond_4

    goto :goto_3

    :cond_4
    const/16 v14, 0x12

    sget v15, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v15, :cond_5

    goto :goto_1

    .line 553
    :cond_5
    invoke-static {v12, v13, v14, v7}, Ll/ۖۗ;->ܳܰ᩺([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v12, p1

    .line 0
    invoke-static {v0, v12}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 553
    invoke-direct {v11, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v11

    :sswitch_6
    move-object/from16 v12, p1

    .line 551
    invoke-virtual/range {p0 .. p1}, Ll/᩷ۛ֫;->findHeader(Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$PreferenceHeader;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v11, "\u06d9\u05a8"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, -0x601b

    const v14, 0x32166990

    xor-int/2addr v13, v14

    const v14, 0x6c2d3161

    goto/16 :goto_9

    :cond_6
    const-string v11, "\u06d8\u05ab"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x21

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, 0x3eb1

    const v14, -0x7e93eee5

    xor-int/2addr v13, v14

    const v14, 0x14998785

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v12, p1

    const/16 v7, 0x3cb6

    goto :goto_4

    :sswitch_8
    move-object/from16 v12, p1

    const/16 v7, 0x1366

    :goto_4
    const-string v11, "\u06d9\u0730"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, 0xb1b

    const v14, -0x33ebbe94    # -3.8864304E7f

    xor-int/2addr v13, v14

    const v14, 0x34aa8245

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v12, p1

    mul-int v11, v3, v6

    sub-int v11, v5, v11

    if-gez v11, :cond_7

    const-string v11, "\u0733\u06dc"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, 0x491

    const v14, 0x5affec6b

    xor-int/2addr v13, v14

    const v14, -0x1cfd47e7

    goto/16 :goto_9

    :cond_7
    const-string v11, "\u0730\u06e8"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, 0x5

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, -0x6ebb

    const v14, 0x65f303bc

    xor-int/2addr v13, v14

    const v14, -0x2ff74640

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v12, p1

    const/16 v6, 0x2ea2

    sget v11, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v11, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v11, "\u0730\u1a7b"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, -0x36d3

    const v14, 0xbcdbcf1

    xor-int/2addr v13, v14

    const v14, 0x2d45aa9f

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v12, p1

    const v5, 0x21fa7a1

    add-int/2addr v5, v4

    .line 432
    sget v11, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v11, :cond_9

    :goto_5
    const-string v11, "\u0733\u1a78"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x4f

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, 0x2771

    const v14, -0x73b268dd

    xor-int/2addr v13, v14

    const v14, -0x67d12bbc

    goto/16 :goto_9

    :cond_9
    const-string v11, "\u06e0\u06db"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, -0x536b

    const v14, 0x2b5158be

    xor-int/2addr v13, v14

    const v14, -0x192c2f8d

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v12, p1

    aget-short v3, v1, v2

    mul-int v4, v3, v3

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v11

    if-nez v11, :cond_a

    const-string v11, "\u06e0\u06e4"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, 0x3fdf

    const v14, -0x45330f31

    xor-int/2addr v13, v14

    const v14, 0x24f21d93    # 1.0500087E-16f

    goto/16 :goto_9

    :cond_a
    const-string v11, "\u073a\u05a1"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x59

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, 0x1c3d

    const v14, 0x2fd9ebc

    xor-int/2addr v13, v14

    const v14, 0x33a40c36

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v12, p1

    const/4 v2, 0x0

    .line 224
    sget v11, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v11, :cond_b

    :goto_6
    const-string v11, "\u06e7\u1a75"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, -0x5bf

    const v14, -0x64d702cf

    xor-int/2addr v13, v14

    const v14, -0x1c1f94bd

    goto/16 :goto_9

    :cond_b
    const-string v11, "\u06dc\u1a78"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x49

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, 0x4aa7

    const v14, 0x32f9343e

    xor-int/2addr v13, v14

    const v14, 0x7de2aff3

    goto/16 :goto_9

    :sswitch_e
    move-object/from16 v12, p1

    sget-object v1, Ll/᩷ۛ֫;->ܿ᩺᩷:[S

    sget v11, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v11, :cond_c

    :goto_7
    const-string v11, "\u1a7a\u073d"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, -0x1f

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, 0x6bc3

    const v14, 0x2fef1e9e

    xor-int/2addr v13, v14

    const v14, -0x11ba7ec9

    goto :goto_9

    :cond_c
    const-string v11, "\u1a7b\u05a1"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x21

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, 0x2c3d

    const v14, 0x6de402f8

    xor-int/2addr v13, v14

    const v14, 0x58518ea6

    goto :goto_9

    :sswitch_f
    move-object/from16 v12, p1

    .line 504
    sget v11, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v11, :cond_d

    goto :goto_8

    :cond_d
    const-string v11, "\u06da\u06e8"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, 0x69

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, 0x401d

    const v14, 0x8f22be2

    xor-int/2addr v13, v14

    const v14, 0xc7607c6

    goto :goto_9

    :sswitch_10
    move-object/from16 v12, p1

    sget v11, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v11, :cond_e

    :goto_8
    const-string v11, "\u06dc\u05a1"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x79

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, 0x27ad

    const v14, 0x20d97eb0

    xor-int/2addr v13, v14

    const v14, 0x6c25957

    goto :goto_9

    :cond_e
    const-string v11, "\u06e4\u06d9"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, 0x3615

    const v14, -0x7335d5a8

    xor-int/2addr v13, v14

    const v14, 0x577d1f0c

    :goto_9
    xor-int/2addr v11, v14

    move v12, v13

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bf4521a -> :sswitch_f
        -0x7b9babd8 -> :sswitch_5
        -0x7324359a -> :sswitch_0
        -0x69b75a69 -> :sswitch_5
        -0x565e3b0a -> :sswitch_e
        -0x5645adf6 -> :sswitch_d
        -0x42900868 -> :sswitch_b
        -0x334482cf -> :sswitch_0
        -0x24f8fb9b -> :sswitch_c
        -0x1d35e3b3 -> :sswitch_6
        -0x1abd7bc0 -> :sswitch_2
        -0x6f6cff5 -> :sswitch_c
        0x7f133b1 -> :sswitch_1
        0x9aca6fb -> :sswitch_3
        0xb4be2b6 -> :sswitch_7
        0xba9278b -> :sswitch_4
        0xe9ab72e -> :sswitch_a
        0x105dc0e8 -> :sswitch_7
        0x1c90e8b3 -> :sswitch_f
        0x1d593f34 -> :sswitch_9
        0x22d5c138 -> :sswitch_4
        0x269dac8b -> :sswitch_10
        0x27c2559d -> :sswitch_10
        0x3133ed74 -> :sswitch_1
        0x42702bbc -> :sswitch_d
        0x49926ade -> :sswitch_e
        0x4abaf9d1 -> :sswitch_3
        0x4e518ec6 -> :sswitch_8
        0x5608cfd3 -> :sswitch_b
        0x59648b66 -> :sswitch_8
        0x6163016d -> :sswitch_2
        0x66a8781e -> :sswitch_9
        0x70b4e873 -> :sswitch_a
        0x7f4772f8 -> :sswitch_6
    .end sparse-switch
.end method

.method public final requirePreference(Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$PreferenceItem;
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

    const v9, 0x51130cc1

    sget v10, Ll/ۖ᩹;->۫ܽۗ:I

    sget v11, Ll/ۗܶ;->ᩴ֫۫:I

    const-string v12, "\u1a7a\u05a8"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x20ad

    const v14, -0x112e34b9

    xor-int/2addr v13, v14

    const v14, -0x7d11c749

    :goto_0
    xor-int/2addr v12, v14

    :goto_1
    xor-int/2addr v9, v10

    mul-int/lit16 v9, v9, 0x48bb

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    move-object/from16 v13, p1

    .line 417
    sget-boolean v12, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v12, :cond_d

    goto/16 :goto_8

    .line 290
    :sswitch_0
    sget v12, Ll/ۖ;->ܿۚ֡:I

    if-gez v12, :cond_0

    goto :goto_3

    :cond_0
    :goto_2
    move-object/from16 v13, p1

    goto/16 :goto_7

    .line 510
    :sswitch_1
    sget v12, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v12, :cond_1

    goto :goto_5

    :cond_1
    :goto_3
    const-string v12, "\u1a78\u1a7a"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, -0x4d

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x28e9

    const v14, -0x1b7fd01

    xor-int/2addr v13, v14

    const v14, -0x1a02bfda

    goto :goto_0

    .line 49
    :sswitch_2
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget v12, Ll/֨ۢ;->۬ܿܺ:I

    if-gez v12, :cond_2

    goto :goto_5

    :cond_2
    :goto_4
    move-object/from16 v13, p1

    goto/16 :goto_9

    :sswitch_3
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    :goto_5
    const-string v12, "\u06e2\u06ec"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x3d39

    const v14, 0x78287eb3

    xor-int/2addr v13, v14

    const v14, -0x614879a8

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    const/4 v0, 0x0

    :sswitch_5
    return-object v0

    .line 577
    :sswitch_6
    new-instance v12, Ljava/lang/IllegalArgumentException;

    sget-object v13, Ll/᩷ۛ֫;->ܿ᩺᩷:[S

    .line 569
    sget v14, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v14, :cond_3

    goto :goto_2

    :cond_3
    const/16 v14, 0x14

    .line 149
    sget v15, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v15, :cond_4

    goto :goto_4

    :cond_4
    const/16 v15, 0x16

    .line 321
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v16

    if-nez v16, :cond_5

    goto :goto_4

    .line 577
    :cond_5
    invoke-static {v13, v14, v15, v8}, Ll/֫֨;->ۡᩴۛ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v13, p1

    .line 0
    invoke-static {v0, v13}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 577
    invoke-direct {v12, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v12

    :sswitch_7
    move-object/from16 v13, p1

    .line 575
    invoke-virtual/range {p0 .. p1}, Ll/᩷ۛ֫;->findPreference(Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$PreferenceItem;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v12, "\u06ec\u1a7a"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x3165

    const v15, -0x7518bc9f

    xor-int/2addr v14, v15

    const v15, 0x660b7a14

    goto/16 :goto_a

    :cond_6
    const-string v12, "\u1a7a\u06d7"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x21

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x3f09

    const v15, 0x14672d95

    xor-int/2addr v14, v15

    const v15, -0x22987425

    goto/16 :goto_a

    :sswitch_8
    move-object/from16 v13, p1

    const/16 v8, 0x40e2

    goto :goto_6

    :sswitch_9
    move-object/from16 v13, p1

    const v8, 0xdb64

    :goto_6
    const-string v12, "\u05a1\u06df"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, 0x73

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0xb1

    const v15, 0x77304b5c

    xor-int/2addr v14, v15

    const v15, -0x66a5c059

    goto/16 :goto_a

    :sswitch_a
    move-object/from16 v13, p1

    mul-int v12, v7, v7

    sub-int v12, v5, v12

    if-gtz v12, :cond_7

    const-string v12, "\u05a8\u06e2"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, 0x31

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x10fb

    const v15, 0x6b6b1b90

    xor-int/2addr v14, v15

    const v15, 0x31e54a85

    goto/16 :goto_a

    :cond_7
    const-string v12, "\u06e7\u1a77"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x4cdd

    const v15, -0x47c0c1af

    xor-int/2addr v14, v15

    const v15, 0x4013abef

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v13, p1

    add-int v7, v3, v6

    .line 346
    sget v12, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v12, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v12, "\u05ab\u06dc"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x79

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x6839

    const v15, 0x516f538d

    xor-int/2addr v14, v15

    const v15, -0x63c6ec6a

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v13, p1

    mul-int v5, v3, v4

    const/16 v6, 0x9d6

    .line 10
    sget v12, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v12, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v12, "\u05a1\u1a77"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, -0x1f

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x2065

    const v15, 0x2dcd6d7

    xor-int/2addr v14, v15

    const v15, -0x2f95eb66

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v13, p1

    aget-short v3, v1, v2

    const/16 v4, 0x2758

    sget v12, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v12, :cond_a

    goto :goto_8

    :cond_a
    const-string v12, "\u06e7\u06e8"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x2b91

    const v15, -0x24d671d2

    xor-int/2addr v14, v15

    const v15, 0x5dee2ee8

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v13, p1

    const/16 v2, 0x13

    .line 152
    sget v12, Ll/۬;->᩸ۜ᩹:I

    if-eqz v12, :cond_b

    :goto_7
    const-string v12, "\u1a75\u06da"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, -0x63

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x45c5

    const v15, -0x4e0327e1

    xor-int/2addr v14, v15

    const v15, 0x24a0e944

    goto/16 :goto_a

    :cond_b
    const-string v12, "\u06db\u06e1"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, 0x1d

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x6f3d

    const v15, 0x3136c5ef

    xor-int/2addr v14, v15

    const v15, 0x4e267f2d    # 6.983381E8f

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v13, p1

    sget-object v1, Ll/᩷ۛ֫;->ܿ᩺᩷:[S

    sget-boolean v12, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v12, :cond_c

    goto :goto_9

    :cond_c
    const-string v12, "\u06e4\u0736"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x7fd9

    const v15, 0x2636415b

    xor-int/2addr v14, v15

    const v15, 0x7d6fd36c

    goto :goto_a

    :goto_8
    const-string v12, "\u06ec\u0730"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x778b

    const v15, -0x7b8a2a86

    xor-int/2addr v14, v15

    const v15, 0x5b2892e5

    goto :goto_a

    :cond_d
    const-string v12, "\u06ec\u1a7b"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x6d6d

    const v15, -0x289596a7

    xor-int/2addr v14, v15

    const v15, 0x2fdb4942

    goto :goto_a

    :sswitch_10
    move-object/from16 v13, p1

    .line 486
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v12

    if-nez v12, :cond_e

    :goto_9
    const-string v12, "\u1a73\u06e8"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x46b5

    const v15, 0x32e39a12

    xor-int/2addr v14, v15

    const v15, -0x4ad0e21b

    goto :goto_a

    :cond_e
    const-string v12, "\u073f\u06e0"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, 0x49

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x14cd

    const v15, 0xadaa7d4

    xor-int/2addr v14, v15

    const v15, -0x79db3a45

    :goto_a
    xor-int/2addr v12, v15

    move v13, v14

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d5ff864 -> :sswitch_d
        -0x7459bf28 -> :sswitch_7
        -0x6ee461f0 -> :sswitch_10
        -0x6aab002c -> :sswitch_5
        -0x60e4003d -> :sswitch_10
        -0x59254407 -> :sswitch_3
        -0x4d3b8272 -> :sswitch_f
        -0x4a08b1cc -> :sswitch_e
        -0x46a8c065 -> :sswitch_6
        -0x3f0ec836 -> :sswitch_c
        -0x332a3218 -> :sswitch_1
        -0x301beaff -> :sswitch_c
        -0x24cbd9a1 -> :sswitch_8
        -0x22f361a4 -> :sswitch_8
        -0x16d224b8 -> :sswitch_0
        -0xd3e0a5e -> :sswitch_4
        -0xc2089e4 -> :sswitch_a
        -0x4ebb127 -> :sswitch_5
        0x3a89fd1 -> :sswitch_4
        0x5d9bb66 -> :sswitch_b
        0x1956b1c2 -> :sswitch_1
        0x1a2cdb03 -> :sswitch_2
        0x20027dd0 -> :sswitch_a
        0x2314b3bc -> :sswitch_9
        0x30e05a7c -> :sswitch_9
        0x33a8bff6 -> :sswitch_f
        0x37336956 -> :sswitch_2
        0x4541d8c5 -> :sswitch_b
        0x48c148be -> :sswitch_3
        0x48ded3e8 -> :sswitch_0
        0x4e536efd -> :sswitch_6
        0x6e2ccab6 -> :sswitch_7
        0x6e999377 -> :sswitch_e
        0x7c9f451b -> :sswitch_d
    .end sparse-switch
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0xf93a320

    sget v6, Ll/᩶;->ᩴ᩶ۛ:I

    sget v7, Ll/֫֨;->᩶ܺۡ:I

    const-string v8, "\u06e7\u06d8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x43

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x1257

    const v10, 0x7655cd35

    xor-int/2addr v9, v10

    const v10, 0x261c0575

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, -0x6a89

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v8

    if-eqz v8, :cond_a

    goto/16 :goto_4

    .line 429
    :sswitch_0
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget v8, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v8, :cond_7

    goto/16 :goto_2

    :sswitch_1
    sget v8, Ll/֡۟;->᩶᩺ܰ:I

    if-lez v8, :cond_9

    goto/16 :goto_5

    .line 530
    :sswitch_2
    sget v8, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v8, :cond_b

    goto/16 :goto_2

    .line 168
    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    goto/16 :goto_2

    .line 15
    :sswitch_4
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    return-void

    .line 172
    :sswitch_5
    invoke-static {v2, v4}, Ll/ۖ;->ۤ᩸۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :sswitch_6
    const/4 v8, 0x1

    .line 0
    invoke-static {v8, v4}, Ll/֨ۨ;->ۖ᩵֡(ILjava/lang/Object;)C

    move-result v8

    const/16 v9, 0x7d

    if-ne v8, v9, :cond_0

    const-string v8, "\u06d9\u0733"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x4f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x146f

    const v10, 0x5b2789d

    xor-int/2addr v9, v10

    const v10, -0x4711eba0

    goto :goto_0

    :sswitch_7
    const/4 v8, 0x0

    .line 171
    invoke-static {v4, v8}, Ll/ۘܽ;->᩷۬ܽ(Ljava/lang/Object;I)C

    move-result v8

    const/16 v9, 0x7b

    if-ne v8, v9, :cond_0

    const-string v8, "\u06eb\u0736"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7439

    const v10, 0x2d8c3c9d

    xor-int/2addr v9, v10

    const v10, -0x65fe1661

    goto :goto_0

    :sswitch_8
    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v8

    const/4 v9, 0x3

    if-lt v8, v9, :cond_0

    const-string v8, "\u1a7a\u1a7a"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x6c83

    const v10, -0x520f277d

    xor-int/2addr v9, v10

    const v10, -0x6b5c6b5f

    goto/16 :goto_0

    .line 531
    :sswitch_9
    invoke-virtual {v1, v3}, Ll/ܶ᩹;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void

    :sswitch_a
    invoke-static {v0}, Ll/ۤۛ֫;->ܺ(Ll/ۤۛ֫;)Ll/ܶ᩹;

    move-result-object v1

    invoke-static {v0}, Ll/ۤۛ֫;->ۤ(Ll/ۤۛ֫;)Lbin/mt/plugin/api/PluginContext;

    move-result-object v2

    .line 171
    instance-of v8, p1, Ljava/lang/String;

    if-eqz v8, :cond_0

    const-string v8, "\u1a73\u1a79"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x3b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0xe9

    const v10, -0x2fd997a4

    xor-int/2addr v9, v10

    const v10, -0x389de80c

    goto/16 :goto_0

    :cond_0
    move-object v3, p1

    :goto_1
    const-string v8, "\u0733\u0733"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x41

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x9b3

    const v10, -0x76412f3a

    xor-int/2addr v9, v10

    const v10, -0x778bc3ef

    goto/16 :goto_0

    .line 531
    :sswitch_b
    iget-object v0, p0, Ll/᩷ۛ֫;->ۙ:Ll/ۤۛ֫;

    .line 262
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v8

    if-nez v8, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v8, "\u06df\u0730"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x7b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x362d

    const v10, 0xe854e4f

    xor-int/2addr v9, v10

    const v10, -0x3822663f

    goto/16 :goto_0

    .line 453
    :sswitch_c
    sget v8, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v8, :cond_2

    :goto_2
    const-string v8, "\u1a79\u06d7"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x77bd

    const v10, 0x20ce05e7

    xor-int/2addr v9, v10

    const v10, 0x11aadd4a

    goto/16 :goto_0

    :cond_2
    const-string v8, "\u0730\u06dc"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x1de3

    const v10, 0x6920effd

    xor-int/2addr v9, v10

    const v10, 0xa366bf2

    goto/16 :goto_0

    :sswitch_d
    sget v8, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v8, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v8, "\u0730\u1a77"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5965

    const v10, 0x64fe1ffc

    xor-int/2addr v9, v10

    const v10, -0x41272055

    goto/16 :goto_0

    .line 409
    :sswitch_e
    sget v8, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v8, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v8, "\u05a1\u073f"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x49

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x193

    const v10, -0x5b593cf5

    xor-int/2addr v9, v10

    const v10, -0x54050eed

    goto/16 :goto_0

    .line 381
    :sswitch_f
    sget v8, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v8, :cond_5

    goto :goto_3

    :cond_5
    const-string v8, "\u05ab\u06db"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0xb

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x144f

    const v10, 0x7b5db33d

    xor-int/2addr v9, v10

    const v10, 0xfe6deb

    goto/16 :goto_0

    :sswitch_10
    sget v8, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v8, :cond_6

    goto :goto_4

    :cond_6
    const-string v8, "\u06eb\u1a7a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5d9f

    const v10, -0x2e22a12f

    xor-int/2addr v9, v10

    const v10, 0x7d891fac

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v8

    if-eqz v8, :cond_8

    :cond_7
    :goto_3
    const-string v8, "\u1a77\u05a1"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x7b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0xdf3

    const v10, -0x776b5095

    xor-int/2addr v9, v10

    const v10, 0x3100ef99

    goto/16 :goto_0

    :cond_8
    const-string v8, "\u073d\u06dc"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x4949

    const v10, 0xd1895f3

    xor-int/2addr v9, v10

    const v10, -0x35f141f6

    goto/16 :goto_0

    :cond_9
    :goto_4
    const-string v8, "\u05a8\u1a7a"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x48b3

    const v10, 0x71c68251

    xor-int/2addr v9, v10

    const v10, 0x2fd7bf8e

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u06d8\u06e2"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4ff

    const v10, 0x1a3f534d

    xor-int/2addr v9, v10

    const v10, 0x12e25924

    goto/16 :goto_0

    .line 8
    :sswitch_12
    sget v8, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v8, :cond_c

    :cond_b
    :goto_5
    const-string v8, "\u073f\u06df"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x7d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3cf9

    const v10, -0x55d58721

    xor-int/2addr v9, v10

    const v10, 0x18e131ad

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u0730\u05ab"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5a73

    const v10, -0x5f1bd7ab

    xor-int/2addr v9, v10

    const v10, -0x6498e259

    goto/16 :goto_0

    .line 421
    :sswitch_13
    sget-boolean v8, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v8, :cond_d

    :goto_6
    const-string v8, "\u1a75\u06e1"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4fb3

    const v10, 0x7db18451

    xor-int/2addr v9, v10

    const v10, -0x7bfc95d

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u05ab\u06da"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x13

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5481

    const v10, -0x5db79d93

    xor-int/2addr v9, v10

    const v10, 0x2a8bc6d0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x73ebc02f -> :sswitch_5
        -0x6f5a7402 -> :sswitch_c
        -0x6beb1197 -> :sswitch_c
        -0x67a63a01 -> :sswitch_1
        -0x5e79de2c -> :sswitch_d
        -0x4f32034f -> :sswitch_6
        -0x33b3f57c -> :sswitch_12
        -0x2d86db6d -> :sswitch_e
        -0x2d703ad6 -> :sswitch_0
        -0x2bb1d4b1 -> :sswitch_7
        -0x267943aa -> :sswitch_1
        -0x1f3d6e50 -> :sswitch_10
        -0x1ab601a5 -> :sswitch_8
        -0x1542b56f -> :sswitch_13
        -0x1489497e -> :sswitch_9
        -0x12115ad9 -> :sswitch_6
        -0x11c8c5ae -> :sswitch_7
        -0xbf51a0b -> :sswitch_0
        -0x9b30885 -> :sswitch_8
        -0x2ac3b24 -> :sswitch_3
        -0x12669ba -> :sswitch_12
        0x5cbaa2c -> :sswitch_10
        0x9150914 -> :sswitch_11
        0xa74f548 -> :sswitch_4
        0x11b68854 -> :sswitch_b
        0x1cc4f992 -> :sswitch_5
        0x20fa46db -> :sswitch_b
        0x217714b7 -> :sswitch_a
        0x23f84ad2 -> :sswitch_2
        0x2c9714b1 -> :sswitch_3
        0x3e57a42e -> :sswitch_f
        0x4480b76a -> :sswitch_e
        0x50b628b1 -> :sswitch_a
        0x554097ef -> :sswitch_2
        0x574527c6 -> :sswitch_f
        0x57de13fc -> :sswitch_9
        0x583fda35 -> :sswitch_13
        0x6875639d -> :sswitch_11
        0x6b3e0787 -> :sswitch_4
        0x7016cd39 -> :sswitch_d
    .end sparse-switch
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x4cd004d7    # 1.09061816E8f

    sget v5, Ll/ۗ֡;->ۜ᩻۫:I

    sget v6, Ll/᩶;->ᩴ᩶ۛ:I

    const-string v7, "\u06d9\u0733"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x3b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x40c7

    const v9, 0x7527a868

    xor-int/2addr v8, v9

    const v9, 0x5f6a8f8f

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, 0xfc7

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 266
    sget v7, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v7, :cond_8

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    sget v7, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v7, :cond_c

    goto/16 :goto_3

    .line 284
    :sswitch_1
    sget v7, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-lez v7, :cond_a

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v7, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v7, :cond_5

    goto/16 :goto_2

    .line 418
    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    goto/16 :goto_2

    .line 462
    :sswitch_4
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    return-void

    .line 172
    :sswitch_5
    invoke-static {v1, v3}, Ll/ۖ;->ۤ᩸۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    goto/16 :goto_1

    :sswitch_6
    const/4 v7, 0x1

    .line 0
    invoke-static {v7, v3}, Ll/ۗ᩶;->ۛ᩹ᩳ(ILjava/lang/Object;)C

    move-result v7

    const/16 v8, 0x7d

    if-ne v7, v8, :cond_0

    const-string v7, "\u06e2\u073d"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x65

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0xa37

    const v9, -0x5becf0c6

    xor-int/2addr v8, v9

    const v9, 0x7470b0aa

    goto :goto_0

    :sswitch_7
    const/4 v7, 0x0

    .line 171
    invoke-static {v3, v7}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v7

    const/16 v8, 0x7b

    if-ne v7, v8, :cond_0

    const-string v7, "\u06da\u1a7b"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x1b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6b21

    const v9, -0x78913dec

    xor-int/2addr v8, v9

    const v9, -0x4bc649f

    goto :goto_0

    :sswitch_8
    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v7

    const/4 v8, 0x3

    if-lt v7, v8, :cond_0

    const-string v7, "\u06d7\u1a75"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x73

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x611b

    const v9, 0x305e70cf

    xor-int/2addr v8, v9

    const v9, -0x4714c052

    goto/16 :goto_0

    .line 519
    :sswitch_9
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    return-void

    :sswitch_a
    invoke-static {v0}, Ll/ۤۛ֫;->ۤ(Ll/ۤۛ֫;)Lbin/mt/plugin/api/PluginContext;

    move-result-object v1

    .line 171
    instance-of v7, p1, Ljava/lang/String;

    if-eqz v7, :cond_0

    const-string v7, "\u06d9\u1a73"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2b6d

    const v9, -0x4c29c8b5

    xor-int/2addr v8, v9

    const v9, -0x259396ae

    goto/16 :goto_0

    :cond_0
    move-object v2, p1

    :goto_1
    const-string v7, "\u073a\u05a1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x2d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4623

    const v9, -0x6cf69bfa

    xor-int/2addr v8, v9

    const v9, -0x61927bc3

    goto/16 :goto_0

    .line 519
    :sswitch_b
    iget-object v0, p0, Ll/᩷ۛ֫;->ۙ:Ll/ۤۛ֫;

    .line 477
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v7

    if-eqz v7, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v7, "\u05ab\u06dc"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6851

    const v9, -0x37fd740c

    xor-int/2addr v8, v9

    const v9, 0x3c95b0de

    goto/16 :goto_0

    :sswitch_c
    sget v7, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v7, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v7, "\u1a74\u073f"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x2d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5215

    const v9, -0xe94065c

    xor-int/2addr v8, v9

    const v9, -0x2ccf0437

    goto/16 :goto_0

    .line 482
    :sswitch_d
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v7

    if-gtz v7, :cond_3

    :goto_2
    const-string v7, "\u1a73\u1a7b"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x3d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x5915

    const v9, 0x140a6ea7

    xor-int/2addr v8, v9

    const v9, -0x5d5ef5b0

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u06d8\u1a78"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xe17

    const v9, -0x4d328aec

    xor-int/2addr v8, v9

    const v9, 0x6e3cbb3d

    goto/16 :goto_0

    .line 323
    :sswitch_e
    sget v7, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v7, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v7, "\u1a7a\u0733"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x6d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x69e5

    const v9, -0x54fe4a91

    xor-int/2addr v8, v9

    const v9, 0x71507723

    goto/16 :goto_0

    :sswitch_f
    sget v7, Ll/ۧ;->ۨۗܰ:I

    if-ltz v7, :cond_6

    :cond_5
    :goto_3
    const-string v7, "\u06dc\u0730"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7b2d

    const v9, 0x2f44acb9

    xor-int/2addr v8, v9

    const v9, 0xc71d5a1

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u0730\u1a7b"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5c2f

    const v9, 0x3ecb4a46

    xor-int/2addr v8, v9

    const v9, -0x218ffb5f

    goto/16 :goto_0

    .line 437
    :sswitch_10
    sget v7, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v7, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v7, "\u06eb\u1a74"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1cd5

    const v9, 0x7dead94d

    xor-int/2addr v8, v9

    const v9, 0x1edf605f

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u1a77\u06da"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x61

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x9d1

    const v9, 0x4bb2409

    xor-int/2addr v8, v9

    const v9, -0x242a5c1b

    goto/16 :goto_0

    :sswitch_11
    sget v7, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v7, :cond_9

    :goto_4
    const-string v7, "\u06dc\u06dc"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x59

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0xf27

    const v9, 0x6cf77970

    xor-int/2addr v8, v9

    const v9, 0x48dcc82e

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u06e8\u06d6"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x13

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x630f

    const v9, -0x68977189

    xor-int/2addr v8, v9

    const v9, 0x16c1764e

    goto/16 :goto_0

    .line 66
    :sswitch_12
    sget v7, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v7, :cond_b

    :cond_a
    :goto_5
    const-string v7, "\u06d9\u06e2"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x3b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7e15

    const v9, 0x28d67d62

    xor-int/2addr v8, v9

    const v9, -0x35bf5815

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u073a\u06e0"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x24db

    const v9, -0x148042a8

    xor-int/2addr v8, v9

    const v9, 0xb5d0838

    goto/16 :goto_0

    :sswitch_13
    sget v7, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v7, :cond_d

    :cond_c
    :goto_6
    const-string v7, "\u06e1\u1a77"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x241b

    const v9, 0x6bd17d3d

    xor-int/2addr v8, v9

    const v9, 0x39d611f7

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u1a75\u1a76"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6cff

    const v9, -0x488d68e5

    xor-int/2addr v8, v9

    const v9, -0x2fb71438

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x719d4bdc -> :sswitch_1
        -0x6a49e567 -> :sswitch_7
        -0x58774b87 -> :sswitch_3
        -0x56c4b6d2 -> :sswitch_9
        -0x48f5c278 -> :sswitch_6
        -0x4848d900 -> :sswitch_9
        -0x3b45a946 -> :sswitch_13
        -0x33c15f90 -> :sswitch_6
        -0x2b087db8 -> :sswitch_0
        -0x2a0f3953 -> :sswitch_0
        -0x244be0a9 -> :sswitch_8
        -0x1cfb32d3 -> :sswitch_10
        -0x1c52d221 -> :sswitch_3
        -0x188442c5 -> :sswitch_13
        -0x17c15e05 -> :sswitch_2
        -0x17482f49 -> :sswitch_2
        -0x15e477c1 -> :sswitch_4
        -0xf76bd40 -> :sswitch_f
        -0xf5fb093 -> :sswitch_8
        0x4173ba2 -> :sswitch_e
        0x68cb526 -> :sswitch_b
        0x8afb630 -> :sswitch_b
        0x108cc1aa -> :sswitch_12
        0x11d489da -> :sswitch_10
        0x131a36c4 -> :sswitch_1
        0x1659ceca -> :sswitch_a
        0x1c4295f0 -> :sswitch_11
        0x2191265b -> :sswitch_11
        0x21e663dc -> :sswitch_a
        0x29bfe101 -> :sswitch_5
        0x31acde40 -> :sswitch_e
        0x34135833 -> :sswitch_f
        0x386d5ad9 -> :sswitch_5
        0x3f9786c3 -> :sswitch_12
        0x41b129fd -> :sswitch_d
        0x44f09d18 -> :sswitch_c
        0x534bcf44 -> :sswitch_d
        0x6283b9d5 -> :sswitch_c
        0x6ecb83d7 -> :sswitch_4
        0x7d7df609 -> :sswitch_7
    .end sparse-switch
.end method

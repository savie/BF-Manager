.class public final Ll/ۨ᩺֫;
.super Ljava/lang/Object;
.source "N3YD"

# interfaces
.implements Lbin/mt/plugin/api/preference/PluginPreference$Builder;


# static fields
.field public static final ۚ:Ljava/lang/Class;

.field private static final ۤᩳۢ:[S


# instance fields
.field public ۙ:Lbin/mt/plugin/api/PluginContext;

.field public ۤ:Lbin/mt/plugin/api/LocalString;

.field public ۫:Ljava/lang/CharSequence;

.field public ܳ:Ljava/lang/CharSequence;

.field public ᩴ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;

.field public ᩷:Ljava/util/ArrayList;

.field public ᩸:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x53

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    const/4 v0, 0x0

    const v1, 0x25fd1fa

    sget v2, Ll/֨ܿ;->᩹᩻۟:I

    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    const-string v4, "\u06db\u06e2"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6a69

    const v6, -0x1e3ebb86

    xor-int/2addr v5, v6

    const v6, -0x2ed284ec

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x3f95

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    goto/16 :goto_5

    .line 8
    :sswitch_0
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v4, :cond_a

    goto/16 :goto_5

    .line 20
    :sswitch_1
    new-instance v4, Ljava/lang/RuntimeException;

    .line 18
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_3

    .line 1
    :cond_0
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v5, :cond_2

    goto :goto_3

    .line 2
    :cond_2
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v5

    if-ltz v5, :cond_4

    goto :goto_1

    .line 16
    :cond_4
    sget v5, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v5, :cond_5

    goto :goto_2

    .line 18
    :cond_5
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_1

    .line 7
    :cond_6
    sget v5, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v5, :cond_7

    goto/16 :goto_4

    :cond_7
    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v5, :cond_8

    goto :goto_1

    .line 13
    :cond_8
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v5

    if-gtz v5, :cond_9

    :goto_1
    const-string v4, "\u06e4\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x30e3

    const v6, -0x67e88509

    xor-int/2addr v5, v6

    const v6, 0x7479d66

    goto :goto_0

    .line 20
    :cond_9
    invoke-direct {v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4

    .line 12
    :sswitch_2
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-lez v4, :cond_b

    :cond_a
    :goto_2
    const-string v4, "\u1a7a\u06e1"

    .line 16
    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xd89

    const v6, 0x97e41b2

    xor-int/2addr v5, v6

    const v6, -0x5c5e2578

    goto/16 :goto_0

    :cond_b
    :goto_3
    const-string v4, "\u0733\u06ec"

    .line 2
    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x773d

    const v6, -0x4b87e1f8

    xor-int/2addr v5, v6

    const v6, -0x7ef936ec

    goto/16 :goto_0

    .line 18
    :sswitch_3
    :try_start_0
    const-class v4, Ll/ۤۛ֫;

    sget v5, Ll/ۤۛ֫;->ܽ᩷:I

    sput-object v4, Ll/ۨ᩺֫;->ۚ:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "\u06e8\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x517

    const v6, -0x11782991

    xor-int/2addr v5, v6

    const v6, 0x4d8ed34e    # 2.995266E8f

    goto/16 :goto_0

    :catch_0
    move-exception v0

    const-string v4, "\u073d\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7a3

    const v6, -0xa7346d3

    xor-int/2addr v5, v6

    const v6, 0x42aa9fcc

    goto/16 :goto_0

    .line 0
    :sswitch_4
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_c

    goto :goto_5

    :cond_c
    :goto_4
    const-string v4, "\u06d6\u06df"

    .line 7
    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7d95

    const v6, 0x4a64e809    # 3750402.2f

    xor-int/2addr v5, v6

    const v6, -0x5f3c7b18

    goto/16 :goto_0

    :sswitch_5
    return-void

    .line 13
    :sswitch_6
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :goto_5
    const-string v4, "\u06e8\u1a78"

    .line 8
    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1687

    const v6, 0x22e882b7

    xor-int/2addr v5, v6

    const v6, 0x7cbea0ad

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6be3466c -> :sswitch_6
        -0x67f48e0e -> :sswitch_5
        -0x5e20619b -> :sswitch_4
        -0x5a386086 -> :sswitch_5
        -0x4262af71 -> :sswitch_3
        -0x25d970ba -> :sswitch_6
        -0x2081b6a3 -> :sswitch_2
        -0x1bcd5808 -> :sswitch_1
        -0x1627d94e -> :sswitch_2
        -0x14e001ea -> :sswitch_0
        -0x44687dd -> :sswitch_1
        0xe233bdd -> :sswitch_4
        0x217d620a -> :sswitch_0
        0x4392c4d5 -> :sswitch_3
    .end sparse-switch

    :array_0
    .array-data 2
        0x1560s
        -0x7ba1s
        -0x7b98s
        -0x7b9bs
        -0x7b84s
        -0x7b94s
        -0x7bd7s
        -0x7b9as
        -0x7b91s
        -0x7bd7s
        -0x7bd7s
        -0x7b96s
        -0x7b98s
        -0x7b99s
        -0x7bd7s
        -0x7b99s
        -0x7b9as
        -0x7b83s
        -0x7bd7s
        -0x7b95s
        -0x7b94s
        -0x7bd7s
        -0x7b99s
        -0x7b84s
        -0x7b9bs
        -0x7b9bs
        0x15e0s
        0x682as
        0x6837s
        0x682as
        0x6832s
        0x683bs
        0x16ces
        -0x7735s
        -0x772as
        -0x7735s
        -0x772ds
        -0x7726s
        -0x772cs
        -0x7726s
        -0x773as
        0x4f7s
        0x22fbs
        0x22e6s
        0x22fbs
        0x22e3s
        0x22eas
        0x22e4s
        0x22eas
        0x22f6s
        0xcd5s
        -0x69d4s
        -0x69cfs
        -0x69d4s
        -0x69ccs
        -0x69c3s
        -0x69cds
        -0x69c3s
        -0x69dfs
        0x27bs
        -0x5e05s
        -0x5e1as
        -0x5e05s
        -0x5e1ds
        -0x5e16s
        -0x5e1cs
        -0x5e16s
        -0x5e0as
        0x11f8s
        0x331bs
        0x3306s
        0x331bs
        0x3303s
        0x330as
        0x95cs
        -0x1e2bs
        -0x1e38s
        -0x1e2bs
        -0x1e33s
        -0x1e3cs
        -0x1e36s
        -0x1e3cs
        -0x1e28s
    .end array-data
.end method

.method public constructor <init>(Lbin/mt/plugin/api/PluginContext;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x23b8c9a

    sget v2, Ll/֨ۨ;->ۜܳ᩵:I

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u0736\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1e09

    const v6, 0x5cf4788f

    xor-int/2addr v5, v6

    const v6, -0x32012f20

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x5af3

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_2

    goto/16 :goto_5

    .line 32
    :sswitch_0
    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    if-lez v4, :cond_5

    goto/16 :goto_4

    .line 21
    :sswitch_1
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v4, Ll/ۖᩳ;->᩹ۧܳ:I

    if-lez v4, :cond_9

    goto/16 :goto_5

    .line 22
    :sswitch_2
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-lez v4, :cond_b

    goto/16 :goto_3

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    goto/16 :goto_3

    .line 31
    :sswitch_4
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 25
    :sswitch_5
    iput-object v0, p0, Ll/ۨ᩺֫;->᩷:Ljava/util/ArrayList;

    .line 34
    iput-object p1, p0, Ll/ۨ᩺֫;->ۙ:Lbin/mt/plugin/api/PluginContext;

    return-void

    .line 27
    :sswitch_6
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06e2\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2b21

    const v6, -0xeef8c6e

    xor-int/2addr v5, v6

    const v6, -0x63bc982a

    goto :goto_0

    :sswitch_7
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u06dc\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6b9b

    const v6, 0x6deb73de

    xor-int/2addr v5, v6

    const v6, -0x722e67cd

    goto :goto_0

    :cond_2
    const-string v4, "\u06e8\u073a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x78dd

    const v6, 0x2acecd33

    xor-int/2addr v5, v6

    const v6, 0x4e711e80

    goto/16 :goto_0

    .line 19
    :sswitch_8
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u06e1\u0736"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7127

    const v6, 0x36a4e378

    xor-int/2addr v5, v6

    const v6, 0x4413d34d

    goto/16 :goto_0

    .line 24
    :sswitch_9
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v4

    if-gtz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06e8\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3f49

    const v6, 0x58cc161b

    xor-int/2addr v5, v6

    const v6, 0x6e7c0b39

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u0730\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1887

    const v6, -0x45499ef3

    xor-int/2addr v5, v6

    const v6, 0x59470389

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u05a8\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x763b

    const v6, 0x17dfdcac

    xor-int/2addr v5, v6

    const v6, 0x35f21187

    goto/16 :goto_0

    .line 18
    :sswitch_b
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_7

    :goto_2
    const-string v4, "\u05ab\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5ab

    const v6, -0x607ddffb

    xor-int/2addr v5, v6

    const v6, 0x49bd83f3

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u05a1\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3b1f

    const v6, 0x557e8764

    xor-int/2addr v5, v6

    const v6, 0xa5a8585

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v4, :cond_8

    :goto_3
    const-string v4, "\u05ab\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1e2d

    const v6, -0x725bc598

    xor-int/2addr v5, v6

    const v6, -0x160fd9a5

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a76\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x165f

    const v6, 0x4b206b8

    xor-int/2addr v5, v6

    const v6, -0x22e6bf57

    goto/16 :goto_0

    .line 18
    :sswitch_d
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v4

    if-ltz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u1a76\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3e65

    const v6, -0xed98990

    xor-int/2addr v5, v6

    const v6, 0x6abd1c87

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06db\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x9f3

    const v6, 0x14884647

    xor-int/2addr v5, v6

    const v6, 0x7ddaabb5

    goto/16 :goto_0

    .line 25
    :sswitch_e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 30
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u05ab\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5b89

    const v6, -0x5ddd2f18

    xor-int/2addr v5, v6

    const v6, -0x28acf700

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a74\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x381b

    const v6, 0x7d184dae

    xor-int/2addr v5, v6

    const v6, 0x2993bb4a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78f9d58b -> :sswitch_9
        -0x7135b0e2 -> :sswitch_e
        -0x686c5d2d -> :sswitch_b
        -0x5fa5be81 -> :sswitch_0
        -0x4373d1d5 -> :sswitch_2
        -0x21fa5a49 -> :sswitch_8
        -0x20abe846 -> :sswitch_d
        -0x1c3f5022 -> :sswitch_9
        -0x16c147c9 -> :sswitch_1
        -0x169c3110 -> :sswitch_7
        -0x81cff5b -> :sswitch_b
        -0x5d751d -> :sswitch_d
        0xfd2a7a -> :sswitch_3
        0x2fb4c9d -> :sswitch_5
        0x3f5eed7 -> :sswitch_3
        0xc2bf9db -> :sswitch_c
        0x109964c3 -> :sswitch_0
        0x23882199 -> :sswitch_a
        0x2c3ae5e3 -> :sswitch_5
        0x2c4a9658 -> :sswitch_7
        0x32f3b97c -> :sswitch_e
        0x39806056 -> :sswitch_4
        0x464ea69d -> :sswitch_4
        0x4d849deb -> :sswitch_6
        0x4d937958 -> :sswitch_a
        0x4fab80e3 -> :sswitch_8
        0x56b0a301 -> :sswitch_2
        0x59f728eb -> :sswitch_1
        0x5be348e6 -> :sswitch_6
        0x607e8df0 -> :sswitch_c
    .end sparse-switch
.end method

.method public static ۙ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 15

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x6c8e772

    sget v8, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v9, Ll/ۗܶ;->ᩴ֫۫:I

    const-string v10, "\u0736\u06e2"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xe4b

    const v12, 0x78cdda13

    xor-int/2addr v11, v12

    const v12, 0x44b787c1

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, 0x2fc3

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 78
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    goto :goto_1

    :sswitch_0
    sget v10, Ll/۬;->᩸ۜ᩹:I

    if-eqz v10, :cond_0

    goto :goto_2

    :cond_0
    move-object/from16 v13, p1

    goto/16 :goto_7

    .line 17
    :sswitch_1
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v10, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v10, :cond_1

    goto :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v10

    if-gtz v10, :cond_3

    :goto_1
    move-object/from16 v13, p1

    goto/16 :goto_8

    :sswitch_3
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    :sswitch_4
    return-void

    .line 132
    :sswitch_5
    new-instance v10, Ljava/lang/NullPointerException;

    sget-object v11, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    const/4 v12, 0x1

    .line 41
    sget v13, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v13, :cond_2

    :cond_1
    :goto_2
    const-string v10, "\u06eb\u0736"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1f17

    const v12, -0x57300a4

    xor-int/2addr v11, v12

    const v12, 0x20d338a2

    goto :goto_0

    :cond_2
    const/16 v13, 0x9

    .line 12
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v14

    if-nez v14, :cond_4

    :cond_3
    :goto_3
    const-string v10, "\u1a74\u0736"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x337

    const v12, -0xe58f833

    xor-int/2addr v11, v12

    const v12, 0x2f37ac8f

    goto :goto_0

    .line 132
    :cond_4
    invoke-static {v11, v12, v13, v6}, Ll/ۘܽ;->ۡۗܺ([SIII)Ljava/lang/String;

    move-result-object v11

    sget-object v12, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 91
    sget-boolean v13, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v13, :cond_5

    :goto_4
    move-object/from16 v13, p1

    goto/16 :goto_6

    :cond_5
    const/16 v13, 0xa

    const/16 v14, 0x10

    .line 132
    invoke-static {v12, v13, v14, v6}, Ll/ۖۖ;->ܺۙᩴ([SIII)Ljava/lang/String;

    move-result-object v12

    .line 102
    sget v13, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v13, :cond_6

    goto :goto_4

    :cond_6
    move-object/from16 v13, p1

    .line 0
    invoke-static {v11, v13, v12}, Ll/ܰ۟ۙ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 132
    invoke-direct {v10, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v10

    :sswitch_6
    move-object/from16 v13, p1

    if-eqz p0, :cond_7

    const-string v10, "\u1a7a\u1a7a"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x59

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2c7d

    const v12, 0x14ef7156

    xor-int/2addr v11, v12

    const v12, -0x4ddefa2b

    goto/16 :goto_0

    :cond_7
    const-string v10, "\u1a79\u1a76"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x53

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1253

    const v12, 0x5d39b9eb

    xor-int/2addr v11, v12

    const v12, 0x35ab8183

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v13, p1

    const v6, 0xf674

    goto :goto_5

    :sswitch_8
    move-object/from16 v13, p1

    const v6, 0x8409

    :goto_5
    const-string v10, "\u073f\u0730"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x14cd

    const v12, -0x55dc5fc7

    xor-int/2addr v11, v12

    const v12, 0x1fa40981

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v13, p1

    mul-int v10, v2, v5

    sub-int v10, v4, v10

    if-ltz v10, :cond_8

    const-string v10, "\u1a74\u073d"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x676b

    const v12, -0x2b9eea6c

    xor-int/2addr v11, v12

    const v12, 0x5068519

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u1a78\u06da"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5647

    const v12, -0xb361ab5

    xor-int/2addr v11, v12

    const v12, 0x3b228234

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v13, p1

    const/16 v5, 0x6a62

    .line 123
    sget-boolean v10, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v10, :cond_9

    goto :goto_6

    :cond_9
    const-string v10, "\u06d6\u1a74"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x63

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3899

    const v12, 0x6f709dee

    xor-int/2addr v11, v12

    const v12, 0x6e0e902b

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v13, p1

    const v4, 0xb0d5361

    add-int/2addr v4, v3

    sget v10, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v10, :cond_a

    goto :goto_6

    :cond_a
    const-string v10, "\u1a77\u06dc"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x1d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x15e5

    const v12, -0x73acd000

    xor-int/2addr v11, v12

    const v12, 0x6a320da3

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v13, p1

    aget-short v2, v0, v1

    mul-int v3, v2, v2

    sget v10, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v10, :cond_b

    :goto_6
    const-string v10, "\u1a79\u05a1"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x63

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0xc2b

    const v12, -0x508681d0

    xor-int/2addr v11, v12

    const v12, 0x60fc7c0c

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u1a75\u06e8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x57

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6d77

    const v12, -0x4af063c9

    xor-int/2addr v11, v12

    const v12, -0x4d56bc16

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v13, p1

    const/4 v1, 0x0

    .line 125
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v10

    if-gtz v10, :cond_c

    goto :goto_7

    :cond_c
    const-string v10, "\u1a79\u1a73"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1827

    const v12, 0x6e2daeac

    xor-int/2addr v11, v12

    const v12, 0x9190496

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v13, p1

    sget-object v0, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 45
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v10

    if-gtz v10, :cond_d

    :goto_7
    const-string v10, "\u06ec\u073d"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x77

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7081

    const v12, -0x793ea806

    xor-int/2addr v11, v12

    const v12, 0x3be979db

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u073a\u06da"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x43

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6d3d

    const v12, 0x2deb043f

    xor-int/2addr v11, v12

    const v12, -0x23781993

    goto/16 :goto_0

    :sswitch_f
    move-object/from16 v13, p1

    sget v10, Ll/ۧ;->ۨۗܰ:I

    if-ltz v10, :cond_e

    :goto_8
    const-string v10, "\u05a1\u05a1"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4f1d

    const v12, -0x755d071d

    xor-int/2addr v11, v12

    const v12, -0x1436a600

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u1a79\u05ab"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x149

    const v12, -0x19f4f23e

    xor-int/2addr v11, v12

    const v12, -0x16238663

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x73e0844f -> :sswitch_1
        -0x5d380f26 -> :sswitch_5
        -0x522d2379 -> :sswitch_2
        -0x4e5a458b -> :sswitch_6
        -0x4d182c39 -> :sswitch_5
        -0x473e3198 -> :sswitch_4
        -0x3b84194a -> :sswitch_0
        -0x2baf4fdd -> :sswitch_e
        -0x239aadfd -> :sswitch_3
        -0x190c91c9 -> :sswitch_9
        -0x103512db -> :sswitch_c
        -0xc4dcd4e -> :sswitch_a
        -0x7c08d17 -> :sswitch_3
        -0x5d620fa -> :sswitch_e
        -0x3c90411 -> :sswitch_d
        0x16f32299 -> :sswitch_8
        0x178fb57a -> :sswitch_a
        0x1ec42a2b -> :sswitch_1
        0x283e09d3 -> :sswitch_4
        0x29bf3fb0 -> :sswitch_9
        0x29f2f330 -> :sswitch_7
        0x3ca9268f -> :sswitch_b
        0x42f76046 -> :sswitch_c
        0x5449c59a -> :sswitch_6
        0x5741fd64 -> :sswitch_f
        0x61f8caf2 -> :sswitch_f
        0x6b3ecec3 -> :sswitch_2
        0x70265fe3 -> :sswitch_8
        0x70cc929c -> :sswitch_7
        0x774be1d7 -> :sswitch_0
        0x7ad548fc -> :sswitch_b
        0x7bcb420f -> :sswitch_d
    .end sparse-switch
.end method


# virtual methods
.method public final addHeader(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Header;
    .locals 19

    move-object/from16 v0, p1

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

    const v13, 0x16d3f850

    sget v14, Ll/ۖۗ;->᩻ܳܶ:I

    sget v15, Ll/ۖۙ;->ۤۧۤ:I

    const-string v16, "\u06df\u06e2"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    xor-int v1, v16, v15

    mul-int/lit16 v1, v1, 0x485b

    const v18, 0xa9593ab

    xor-int v1, v1, v18

    const v18, -0x46a3d86b

    xor-int v16, v16, v18

    move-object/from16 v18, v2

    move-object v11, v10

    move/from16 v17, v16

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, 0x16d3f850

    :goto_0
    xor-int v3, v16, v15

    mul-int/lit16 v3, v3, 0xaf9

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    move-object/from16 v1, p0

    const v0, 0xea1e

    const v10, 0xea1e

    goto/16 :goto_3

    .line 15
    :sswitch_0
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v1, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v1, :cond_1

    :cond_0
    move-object/from16 v1, p0

    goto :goto_2

    :cond_1
    move-object/from16 v1, p0

    goto/16 :goto_5

    :sswitch_1
    sget v1, Ll/۬;->᩸ۜ᩹:I

    if-eqz v1, :cond_0

    :goto_1
    move-object/from16 v1, p0

    goto/16 :goto_6

    .line 8
    :sswitch_2
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    goto/16 :goto_4

    .line 37
    :sswitch_3
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    move-object/from16 v1, p0

    .line 56
    iget-object v0, v1, Ll/ۨ᩺֫;->᩷:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Ll/֨᩻;->ܿ֨᩹(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v2

    :sswitch_6
    move-object/from16 v1, p0

    .line 13
    invoke-static {v11, v12, v13, v10}, Ll/֫֡;->ܺۜᩴ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 14
    invoke-static {v0, v3}, Ll/ۨ᩺֫;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iput-object v0, v2, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    .line 34
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string v3, "\u1a7a\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v15

    xor-int v0, v3, v14

    mul-int/lit16 v0, v0, -0x7bf5

    const v17, -0x75075ecd

    xor-int v0, v0, v17

    const v17, 0x2f9515f4

    xor-int v17, v3, v17

    move v1, v0

    move-object/from16 v0, p1

    goto :goto_0

    :sswitch_7
    move-object/from16 v1, p0

    const/16 v12, 0x1b

    const/4 v13, 0x5

    .line 16
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v0

    if-gtz v0, :cond_4

    :goto_2
    const-string v0, "\u0733\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x7f

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x6021

    const v17, -0x5b1da8f9

    xor-int v3, v3, v17

    const v17, 0x7df61073

    goto/16 :goto_8

    :cond_4
    const-string v0, "\u06d8\u1a76"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x77

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x537d

    const v17, -0x7124bd17

    xor-int v3, v3, v17

    const v17, -0x64f1c60

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v1, p0

    .line 13
    sget-object v11, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 1
    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v0, "\u06e1\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0x3aef

    const v17, 0x476f3e96

    xor-int v3, v3, v17

    const v17, -0x6a6a976d

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v1, p0

    .line 55
    new-instance v2, Ll/ۛ᩺֫;

    .line 13
    invoke-direct {v2}, Ll/ܰ᩺֫;-><init>()V

    .line 21
    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u06d6\u073f"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, -0x7af7

    const v17, 0x663a7a2

    xor-int v3, v3, v17

    const v17, -0x209179b7

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v1, p0

    const/16 v0, 0x685e

    const/16 v10, 0x685e

    :goto_3
    const-string v0, "\u06df\u06e8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x13b1

    const v17, 0x3ecbc634

    xor-int v3, v3, v17

    const v17, -0x7c9a93cb

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v1, p0

    add-int v0, v8, v9

    sub-int v0, v7, v0

    if-lez v0, :cond_7

    const-string v0, "\u1a73\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x63

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0x2ecd

    const v17, 0x12be91d6

    xor-int v3, v3, v17

    const v17, 0x71627b60

    goto/16 :goto_8

    :cond_7
    const-string v0, "\u06da\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x29

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x6073

    const v17, 0x48ca6e92

    xor-int v3, v3, v17

    const v17, 0x1581818f

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v1, p0

    const v9, 0x9024024

    sget v0, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v0, :cond_8

    :goto_4
    const-string v0, "\u1a79\u06d9"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0x136d

    const v17, 0x339da7f

    xor-int v3, v3, v17

    const v17, 0x5e5403c8

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u06e7\u06df"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x59

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x239f

    const v17, -0x403d3479

    xor-int v3, v3, v17

    const v17, -0x5c8dc696

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v1, p0

    mul-int v7, v5, v6

    mul-int v8, v5, v5

    .line 4
    sget v0, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v0, :cond_9

    goto :goto_5

    :cond_9
    const-string v0, "\u06e4\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x5

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, -0x695

    const v17, -0x670936e9

    xor-int v3, v3, v17

    const v17, 0x6ccf846f

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v1, p0

    aget-short v5, v18, v4

    const/16 v6, 0x600c

    .line 11
    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_a

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u05a1\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x5

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0xd55

    const v17, 0x2d437132

    xor-int v3, v3, v17

    const v17, -0x1a45ee03

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v1, p0

    const/16 v4, 0x1a

    sget v0, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v0, :cond_b

    :goto_5
    const-string v0, "\u0730\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x7337

    const v17, -0x6b595694

    xor-int v3, v3, v17

    const v17, 0x53f7ee59

    goto/16 :goto_8

    :cond_b
    const-string v0, "\u05a1\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x6c8d

    const v17, -0x4ffcb787

    xor-int v3, v3, v17

    const v17, -0x7f984ce4

    goto :goto_8

    :sswitch_10
    move-object/from16 v1, p0

    sget-object v18, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 15
    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v0, :cond_c

    :goto_6
    const-string v0, "\u073f\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x565b

    const v17, -0x11ff2b3b

    xor-int v3, v3, v17

    const v17, 0x636259ba

    goto :goto_8

    :cond_c
    const-string v0, "\u1a7b\u06df"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x63

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, -0x4479

    const v17, -0x4c057cfa

    xor-int v3, v3, v17

    const v17, -0x47211e68

    goto :goto_8

    :sswitch_11
    move-object/from16 v1, p0

    .line 40
    sget v0, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v0, :cond_d

    :goto_7
    const-string v0, "\u06da\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x69

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0x7a75

    const v17, -0x32a655be

    xor-int v3, v3, v17

    const v17, -0x3686d374

    goto :goto_8

    :cond_d
    const-string v0, "\u05a8\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x4f

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x172d

    const v17, 0x6c1e4d99

    xor-int v3, v3, v17

    const v17, -0x227ad8b

    :goto_8
    xor-int v17, v0, v17

    move-object/from16 v0, p1

    move v1, v3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7de22db2 -> :sswitch_f
        -0x78532409 -> :sswitch_2
        -0x5dfcd7c0 -> :sswitch_a
        -0x581e101e -> :sswitch_5
        -0x55aaf3ef -> :sswitch_6
        -0x4722f8c2 -> :sswitch_2
        -0x3285e981 -> :sswitch_1
        -0x327d97f1 -> :sswitch_11
        -0x31bd5d9e -> :sswitch_0
        -0x29df063e -> :sswitch_3
        -0x289ef02d -> :sswitch_a
        -0x102553b6 -> :sswitch_3
        -0xb466dd0 -> :sswitch_e
        -0xa2291e2 -> :sswitch_d
        -0x844dc5b -> :sswitch_9
        0x2350693 -> :sswitch_b
        0x2961301 -> :sswitch_f
        0xa3ff087 -> :sswitch_b
        0x11fc1752 -> :sswitch_7
        0x12cfa699 -> :sswitch_10
        0x17bc2a46 -> :sswitch_4
        0x1de27567 -> :sswitch_7
        0x257a1523 -> :sswitch_0
        0x2729836b -> :sswitch_1
        0x2bfaed71 -> :sswitch_4
        0x39626cc2 -> :sswitch_c
        0x3b297ce2 -> :sswitch_8
        0x402c02c9 -> :sswitch_6
        0x472e0414 -> :sswitch_11
        0x4fe0a586 -> :sswitch_d
        0x519b9812 -> :sswitch_10
        0x57199cea -> :sswitch_8
        0x60cdb414 -> :sswitch_5
        0x6f13e6db -> :sswitch_e
        0x70483797 -> :sswitch_9
        0x734fc549 -> :sswitch_c
    .end sparse-switch
.end method

.method public final addHeader(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Header;
    .locals 21

    move-object/from16 v0, p1

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

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, -0x6a0384b7

    sget v16, Ll/ۗ᩺;->֡ۙۜ:I

    sget v17, Ll/֫ۢ;->ۚ᩻᩵:I

    const-string v18, "\u073d\u073f"

    invoke-static/range {v18 .. v18}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    xor-int v2, v18, v17

    mul-int/lit16 v2, v2, 0x7117

    const v20, 0x35dc2611

    xor-int v2, v2, v20

    const v20, 0x5a5f8d68

    xor-int v18, v18, v20

    move-object/from16 v20, v4

    move-object v12, v11

    move-object v15, v14

    move/from16 v19, v18

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v18, -0x6a0384b7

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v5, v18, v17

    mul-int/lit16 v5, v5, -0x5693

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v2, v5

    xor-int v18, v19, v2

    sparse-switch v18, :sswitch_data_0

    move-object/from16 v2, p0

    .line 20
    invoke-static {v1, v4}, Ll/ۨ᩺֫;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v5

    if-nez v5, :cond_3

    goto/16 :goto_5

    .line 31
    :sswitch_0
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v2

    if-gtz v2, :cond_0

    goto :goto_1

    :cond_0
    move-object/from16 v2, p0

    goto/16 :goto_3

    :sswitch_1
    sget v2, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v2, :cond_2

    :cond_1
    move-object/from16 v2, p0

    goto/16 :goto_5

    :cond_2
    move-object/from16 v2, p0

    goto/16 :goto_6

    .line 62
    :sswitch_2
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget v2, Ll/֫֡;->֫ۙۖ:I

    if-gtz v2, :cond_1

    goto :goto_1

    .line 37
    :sswitch_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    :goto_1
    const-string v2, "\u06d9\u1a74"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v16

    mul-int/lit8 v2, v2, -0x51

    xor-int v5, v2, v17

    mul-int/lit16 v5, v5, 0x5de7

    const v19, 0x179777e3

    xor-int v5, v5, v19

    const v19, 0x7f3bf581

    xor-int v19, v2, v19

    goto/16 :goto_8

    .line 29
    :sswitch_4
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    const/4 v0, 0x0

    return-object v0

    .line 21
    :sswitch_5
    iput-object v0, v3, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    .line 22
    iput-object v1, v3, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 63
    iget-object v0, v2, Ll/ۨ᩺֫;->᩷:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :cond_3
    const-string v5, "\u06d6\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v17

    xor-int v1, v5, v16

    mul-int/lit16 v1, v1, 0x7c3b

    const v19, -0x3ba9b8c2

    xor-int v1, v1, v19

    const v19, 0x748c20ac

    xor-int v19, v5, v19

    move v2, v1

    move-object/from16 v1, p2

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v2, p0

    const/16 v1, 0x26

    const/4 v4, 0x3

    .line 19
    invoke-static {v15, v1, v4, v11}, Ll/֨ۚ;->֨֨۟([SIII)Ljava/lang/String;

    move-result-object v4

    sget-boolean v1, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u06db\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x57f

    const v19, -0x7b6e556

    xor-int v5, v5, v19

    const v19, -0x7f5a0c44

    goto/16 :goto_7

    :sswitch_7
    move-object/from16 v2, p0

    .line 18
    invoke-static {v12, v13, v14, v11}, Ll/֡ܳ;->ܺܽۧ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Ll/ۨ᩺֫;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v15, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v1, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u06da\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x7d

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x863

    const v19, 0x5bb4bda

    xor-int v5, v5, v19

    const v19, -0x533f4e28

    goto/16 :goto_7

    :sswitch_8
    move-object/from16 v2, p0

    const/16 v13, 0x21

    const/4 v14, 0x5

    .line 10
    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v1, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v1, "\u1a77\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x580b

    const v19, 0x4e7897f3

    xor-int v5, v5, v19

    const v19, 0x4673fd55

    goto/16 :goto_7

    :sswitch_9
    move-object/from16 v2, p0

    .line 62
    new-instance v3, Ll/ۛ᩺֫;

    .line 18
    invoke-direct {v3}, Ll/ܰ᩺֫;-><init>()V

    sget-object v12, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 29
    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v1, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v1, "\u0733\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x7c3

    const v19, -0x7c6be77d

    xor-int v5, v5, v19

    const v19, 0x6ee2959b

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v2, p0

    const/16 v1, 0x4e4

    const/16 v11, 0x4e4

    goto :goto_2

    :sswitch_b
    move-object/from16 v2, p0

    const v1, 0x88bf

    const v11, 0x88bf

    :goto_2
    const-string v1, "\u05a1\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x2dd3

    const v19, 0x4e2ba874    # 7.199859E8f

    xor-int v5, v5, v19

    const v19, 0x1e0b1d63

    goto/16 :goto_7

    :sswitch_c
    move-object/from16 v2, p0

    add-int/lit8 v1, v10, 0x1

    sub-int v1, v8, v1

    if-gez v1, :cond_8

    const-string v1, "\u06e1\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x74ad

    const v19, -0x78e67daf

    xor-int v5, v5, v19

    const v19, -0x33e5a963    # -4.0458868E7f

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u0733\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x3de7

    const v19, -0x55482e86

    xor-int v5, v5, v19

    const v19, 0x760efa1b

    goto/16 :goto_7

    :sswitch_d
    move-object/from16 v2, p0

    mul-int v10, v6, v9

    .line 35
    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v1, :cond_9

    :goto_3
    const-string v1, "\u1a77\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x5b5b

    const v19, 0x467a583

    xor-int v5, v5, v19

    const v19, -0x6d8fc28a

    goto/16 :goto_7

    :cond_9
    const-string v1, "\u0733\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x27

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x2581

    const v19, 0x360a1fe4

    xor-int v5, v5, v19

    const v19, 0x4e90d4f1

    goto/16 :goto_7

    :sswitch_e
    move-object/from16 v2, p0

    add-int v1, v6, v7

    mul-int v8, v1, v1

    const/4 v9, 0x2

    .line 51
    sget v1, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v1, :cond_a

    goto :goto_5

    :cond_a
    const-string v1, "\u06e0\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x7

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x3c9f

    const v19, 0x5e0c8cb2

    xor-int v5, v5, v19

    const v19, 0x577269da

    goto/16 :goto_7

    :sswitch_f
    move-object/from16 v2, p0

    const/16 v1, 0x20

    aget-short v6, v20, v1

    const/4 v7, 0x1

    .line 62
    sget v1, Ll/ۖ;->ܿۚ֡:I

    if-ltz v1, :cond_b

    :goto_4
    const-string v1, "\u05a1\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x2b25

    const v19, -0x3d6f6c52

    xor-int v5, v5, v19

    const v19, 0x50cbf7    # 7.420008E-39f

    goto/16 :goto_7

    :cond_b
    const-string v1, "\u073a\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x248d

    const v19, 0x283c3457

    xor-int v5, v5, v19

    const v19, 0x3815188f

    goto :goto_7

    :sswitch_10
    move-object/from16 v2, p0

    sget-object v20, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 44
    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_c

    :goto_5
    const-string v1, "\u1a73\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x6d8f

    const v19, 0x170de740

    xor-int v5, v5, v19

    const v19, -0x25aa214a

    goto :goto_7

    :cond_c
    const-string v1, "\u06e0\u05ab"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x45

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x4af7

    const v19, 0x40595720

    xor-int v5, v5, v19

    const v19, 0x6dafafa3

    goto :goto_7

    :sswitch_11
    move-object/from16 v2, p0

    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v1

    if-eqz v1, :cond_d

    :goto_6
    const-string v1, "\u06e2\u05ab"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x6c4d

    const v19, -0x6802e28e

    xor-int v5, v5, v19

    const v19, -0x5405be58

    goto :goto_7

    :cond_d
    const-string v1, "\u1a7a\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x601f

    const v19, 0x668a267f

    xor-int v5, v5, v19

    const v19, 0x25344621

    :goto_7
    xor-int v19, v1, v19

    move-object/from16 v1, p2

    :goto_8
    move v2, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x74e4997b -> :sswitch_9
        -0x71ae1328 -> :sswitch_0
        -0x6a0b881f -> :sswitch_2
        -0x5fae5a5b -> :sswitch_f
        -0x570046af -> :sswitch_a
        -0x55a70433 -> :sswitch_4
        -0x53709067 -> :sswitch_5
        -0x51847435 -> :sswitch_7
        -0x4fe24b24 -> :sswitch_9
        -0x4fd84cd6 -> :sswitch_10
        -0x4409cb90 -> :sswitch_d
        -0x33c6761f -> :sswitch_e
        -0x30e056ba -> :sswitch_2
        -0x30b05b8d -> :sswitch_11
        -0x2c9f82f3 -> :sswitch_7
        -0x4191239 -> :sswitch_c
        -0x3fa8af8 -> :sswitch_b
        -0x1d703c7 -> :sswitch_10
        0x763c869 -> :sswitch_1
        0x97b4707 -> :sswitch_6
        0xa075fd9 -> :sswitch_8
        0x1069fd16 -> :sswitch_5
        0x12eb2f90 -> :sswitch_b
        0x16445a72 -> :sswitch_c
        0x177d2ac6 -> :sswitch_11
        0x3337f8cc -> :sswitch_f
        0x45c964ef -> :sswitch_a
        0x47897032 -> :sswitch_1
        0x49474863 -> :sswitch_4
        0x4f462b23 -> :sswitch_3
        0x5cf0d116 -> :sswitch_e
        0x631cafcd -> :sswitch_3
        0x64b530e4 -> :sswitch_0
        0x656922e0 -> :sswitch_6
        0x6fa73511 -> :sswitch_d
        0x76a91095 -> :sswitch_8
    .end sparse-switch
.end method

.method public final addInput(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Input;
    .locals 19

    move-object/from16 v0, p1

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

    const v13, 0x1fc82704

    sget v14, Ll/ۗܶ;->ᩴ֫۫:I

    sget v15, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v16, "\u05a8\u1a73"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    sub-int v16, v14, v16

    mul-int/lit8 v16, v16, 0x6d

    xor-int v2, v16, v15

    mul-int/lit16 v2, v2, -0x1989

    const v18, -0x25ba0eed

    xor-int v2, v2, v18

    const v18, -0x274f976e

    xor-int v16, v16, v18

    move-object/from16 v18, v5

    move-object v11, v10

    move/from16 v17, v16

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, 0x1fc82704

    move-object v5, v4

    move-object v10, v9

    const/4 v4, 0x0

    const/4 v9, 0x0

    :goto_0
    xor-int v6, v16, v15

    mul-int/lit16 v6, v6, -0x22e3

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v2, v6

    xor-int v16, v17, v2

    sparse-switch v16, :sswitch_data_0

    move-object/from16 v2, p0

    sget-object v18, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v1, :cond_c

    goto/16 :goto_6

    .line 78
    :sswitch_0
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    sget v2, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v2, :cond_1

    :cond_0
    move-object/from16 v2, p0

    goto/16 :goto_4

    :cond_1
    move-object/from16 v2, p0

    goto/16 :goto_7

    .line 12
    :sswitch_1
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v2

    if-nez v2, :cond_2

    :goto_1
    move-object/from16 v2, p0

    goto/16 :goto_6

    :cond_2
    move-object/from16 v2, p0

    goto/16 :goto_5

    .line 61
    :sswitch_2
    sget v2, Ll/ۧ;->ۨۗܰ:I

    if-ltz v2, :cond_0

    goto :goto_1

    .line 70
    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    const/4 v0, 0x0

    return-object v0

    .line 25
    :sswitch_5
    iput-object v0, v3, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    .line 26
    iput-object v1, v3, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 84
    iget-object v0, v2, Ll/ۨ᩺֫;->᩷:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/֨᩻;->ܿ֨᩹(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :sswitch_6
    move-object/from16 v2, p0

    .line 23
    invoke-static {v11, v12, v13, v9}, Ll/ۗ᩺;->۬֫ۜ([SIII)Ljava/lang/String;

    move-result-object v6

    .line 24
    invoke-static {v1, v6}, Ll/ۨ᩺֫;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-boolean v6, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v6, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string v6, "\u06ec\u06d9"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v15

    xor-int v1, v6, v14

    mul-int/lit16 v1, v1, -0x56f3

    const v17, -0x511a0b06

    xor-int v1, v1, v17

    const v17, -0x2908e391

    xor-int v17, v6, v17

    move v2, v1

    move-object/from16 v1, p2

    goto :goto_0

    :sswitch_7
    move-object/from16 v2, p0

    .line 23
    sget-object v11, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    const/16 v12, 0x2f

    const/4 v13, 0x3

    .line 82
    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u1a79\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, 0x3535

    const v17, -0x772b5a8d

    xor-int v6, v6, v17

    const v17, 0x23f613dd

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v2, p0

    .line 23
    invoke-static {v0, v5}, Ll/ۨ᩺֫;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v1, "\u06d7\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, 0x45db

    const v17, 0x1688ea50

    xor-int v6, v6, v17

    const v17, 0x6d93eaca

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v2, p0

    const/16 v1, 0x2a

    const/4 v5, 0x5

    .line 19
    invoke-static {v10, v1, v5, v9}, Ll/ۘܶ;->ۙᩳۜ([SIII)Ljava/lang/String;

    move-result-object v5

    .line 74
    sget-boolean v1, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    const-string v1, "\u06ec\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, 0x1a0d

    const v17, 0x6f52b4cf

    xor-int v6, v6, v17

    const v17, 0x11a92ad2

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v2, p0

    .line 19
    iput v4, v3, Ll/᩺᩺֫;->ۧ:I

    sget-object v10, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v1

    if-eqz v1, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u06d9\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, -0x7233

    const v17, 0x5e2fc9e

    xor-int v6, v6, v17

    const v17, 0x5c8c257c

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v2, p0

    .line 83
    new-instance v3, Ll/᩺᩺֫;

    .line 22
    invoke-direct {v3}, Ll/ܰ᩺֫;-><init>()V

    const/4 v4, 0x1

    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v1, :cond_8

    :goto_2
    const-string v1, "\u073d\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, -0x1741

    const v17, 0x2faae853

    xor-int v6, v6, v17

    const v17, -0x1403a508

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u06ec\u06e0"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x62a3

    const v17, 0x1bbdbd0e

    xor-int v6, v6, v17

    const v17, -0x78c33ca9

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v2, p0

    const v1, 0xd296

    const v9, 0xd296

    goto :goto_3

    :sswitch_d
    move-object/from16 v2, p0

    const/16 v1, 0x228f

    const/16 v9, 0x228f

    :goto_3
    const-string v1, "\u06e8\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x51

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, -0x7439

    const v17, 0x2c1963b0

    xor-int v6, v6, v17

    const v17, 0x343ebfc3

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v2, p0

    mul-int/lit16 v1, v7, 0x238e

    sub-int v1, v8, v1

    if-gez v1, :cond_9

    const-string v1, "\u05ab\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x5d

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x14d7

    const v17, 0x1bb6dfc9

    xor-int v6, v6, v17

    const v17, 0x18c52a5e

    goto/16 :goto_8

    :cond_9
    const-string v1, "\u0730\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x37

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, -0x35b9

    const v17, -0x6d3f7d97

    xor-int v6, v6, v17

    const v17, -0x2b1a69b8

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v2, p0

    mul-int v1, v7, v7

    const v6, 0x13c08b1

    add-int v8, v1, v6

    sget v1, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v1, :cond_a

    :goto_4
    const-string v1, "\u06e2\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, 0x4077

    const v17, 0x5f68fc76

    xor-int v6, v6, v17

    const v17, -0x15ca81ba

    goto/16 :goto_8

    :cond_a
    const-string v1, "\u05a8\u1a77"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x33

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, -0x3ba9

    const v17, -0x453a0f36

    xor-int v6, v6, v17

    const v17, -0x155c8783

    goto/16 :goto_8

    :sswitch_10
    move-object/from16 v2, p0

    const/16 v1, 0x29

    aget-short v7, v18, v1

    .line 25
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v1

    if-ltz v1, :cond_b

    :goto_5
    const-string v1, "\u06d7\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x6daf

    const v17, -0x56c8d1db

    xor-int v6, v6, v17

    const v17, -0x5b5ac400

    goto :goto_8

    :cond_b
    const-string v1, "\u05a1\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x35

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, 0x6f75

    const v17, -0x68104bad

    xor-int v6, v6, v17

    const v17, -0x59a3f009

    goto :goto_8

    :goto_6
    const-string v1, "\u06d8\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x79

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x5bd

    const v17, 0x445a4a15

    xor-int v6, v6, v17

    const v17, 0x4e847a36

    goto :goto_8

    :cond_c
    const-string v1, "\u06e7\u0733"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, 0x4747

    const v17, -0x47b800c9

    xor-int v6, v6, v17

    const v17, -0x7405861a

    goto :goto_8

    :sswitch_11
    move-object/from16 v2, p0

    sget v1, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v1, :cond_d

    :goto_7
    const-string v1, "\u1a75\u06df"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x71

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x1aa5

    const v17, 0x3900605c

    xor-int v6, v6, v17

    const v17, 0x69a959cc

    goto :goto_8

    :cond_d
    const-string v1, "\u1a76\u1a7b"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, 0x72bf

    const v17, 0x15b78aa4

    xor-int v6, v6, v17

    const v17, 0x415a53e4

    :goto_8
    xor-int v17, v1, v17

    move-object/from16 v1, p2

    move v2, v6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7855510f -> :sswitch_f
        -0x713370ff -> :sswitch_11
        -0x6b357d16 -> :sswitch_a
        -0x5939ab21 -> :sswitch_1
        -0x58e5414c -> :sswitch_11
        -0x514e87cc -> :sswitch_d
        -0x50600907 -> :sswitch_2
        -0x4bc2e5c4 -> :sswitch_5
        -0x4b21418a -> :sswitch_6
        -0x48acb14b -> :sswitch_2
        -0x443a411a -> :sswitch_1
        -0x41cc67b1 -> :sswitch_6
        -0x40879914 -> :sswitch_b
        -0x3b36a592 -> :sswitch_10
        -0x345897b2 -> :sswitch_9
        -0x2c2c60e2 -> :sswitch_e
        -0x21e2e6ca -> :sswitch_4
        -0x1ed1c789 -> :sswitch_b
        -0x16974165 -> :sswitch_c
        -0xab2fcb7 -> :sswitch_a
        0x35f792 -> :sswitch_0
        0x25f6b71 -> :sswitch_8
        0x8da3104 -> :sswitch_e
        0xe08f02f -> :sswitch_9
        0x1a3f9e4c -> :sswitch_7
        0x1cd132e6 -> :sswitch_10
        0x1e02349f -> :sswitch_3
        0x2a25a7fd -> :sswitch_8
        0x3baa586e -> :sswitch_d
        0x41dc572e -> :sswitch_5
        0x485071a7 -> :sswitch_4
        0x581c6ca6 -> :sswitch_c
        0x6e407690 -> :sswitch_f
        0x7cd72be9 -> :sswitch_0
        0x7d1e07b2 -> :sswitch_3
        0x7e65ace1 -> :sswitch_7
    .end sparse-switch
.end method

.method public final addList(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$List;
    .locals 20

    move-object/from16 v0, p1

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

    const/4 v13, 0x0

    const v14, -0x2a1d7302

    sget v15, Ll/֡᩵;->ۤܳ۬:I

    sget v16, Ll/֡۟;->᩶᩺ܰ:I

    const-string v17, "\u06da\u1a79"

    invoke-static/range {v17 .. v17}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    mul-int/lit8 v17, v17, 0x77

    xor-int v2, v17, v16

    mul-int/lit16 v2, v2, 0x110b

    const v19, -0x6b2dcde1

    xor-int v2, v2, v19

    const v19, 0x5fc94cab

    xor-int v17, v17, v19

    move-object/from16 v19, v4

    move-object v12, v11

    move/from16 v18, v17

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, -0x2a1d7302

    move-object v4, v3

    move-object v11, v10

    const/4 v3, 0x0

    const/4 v10, 0x0

    :goto_0
    xor-int v5, v17, v16

    mul-int/lit16 v5, v5, -0xcfd

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v2, v5

    xor-int v17, v18, v2

    sparse-switch v17, :sswitch_data_0

    move-object/from16 v2, p0

    .line 21
    invoke-static {v12, v13, v14, v10}, Ll/ۖۗ;->ܳܰ᩺([SIII)Ljava/lang/String;

    move-result-object v5

    .line 22
    invoke-static {v1, v5}, Ll/ۨ᩺֫;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    sget v5, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v5, :cond_3

    goto/16 :goto_3

    .line 41
    :sswitch_0
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move-object/from16 v2, p0

    goto/16 :goto_6

    :cond_0
    move-object/from16 v2, p0

    goto/16 :goto_5

    :sswitch_1
    sget v2, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v2, :cond_2

    :cond_1
    move-object/from16 v2, p0

    goto :goto_2

    :cond_2
    move-object/from16 v2, p0

    goto/16 :goto_3

    .line 65
    :sswitch_2
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget v2, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v2, :cond_1

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    goto :goto_1

    .line 29
    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    const/4 v0, 0x0

    return-object v0

    .line 23
    :sswitch_5
    iput-object v0, v3, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    .line 24
    iput-object v1, v3, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 98
    iget-object v0, v2, Ll/ۨ᩺֫;->᩷:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :cond_3
    const-string v5, "\u06e0\u06d6"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v15

    xor-int v1, v5, v16

    mul-int/lit16 v1, v1, -0x6791

    const v18, -0x14fe6dec

    xor-int v1, v1, v18

    const v18, -0x7bc02716

    xor-int v18, v5, v18

    move v2, v1

    move-object/from16 v1, p2

    goto :goto_0

    :sswitch_6
    move-object/from16 v2, p0

    .line 21
    sget-object v12, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    const/16 v13, 0x38

    const/4 v14, 0x3

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v1

    if-eqz v1, :cond_4

    :goto_2
    const-string v1, "\u05a8\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x1e7d

    const v18, 0x627c0fa7

    xor-int v5, v5, v18

    const v18, -0x67431f3a

    goto/16 :goto_8

    :cond_4
    const-string v1, "\u06df\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x2915

    const v18, -0x5460fe40

    xor-int v5, v5, v18

    const v18, 0x17661cd

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v2, p0

    const/16 v1, 0x33

    const/4 v5, 0x5

    .line 18
    invoke-static {v11, v1, v5, v10}, Ll/ۗ֡;->ۘ᩺ۘ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-static {v0, v1}, Ll/ۨ᩺֫;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v1, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u06ec\u06d7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x39

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x367d

    const v18, -0x5ca1a0f8

    xor-int v5, v5, v18

    const v18, -0x72ecab1f    # -4.540004E-31f

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v2, p0

    iput-object v4, v3, Ll/᩶᩺֫;->֫:Ljava/util/ArrayList;

    sget-object v11, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 38
    sget v1, Ll/᩺;->۫۬۫:I

    if-gtz v1, :cond_6

    :goto_3
    const-string v1, "\u06dc\u0733"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x40e9

    const v18, -0x5a28a2be

    xor-int v5, v5, v18

    const v18, -0x17e76ee7

    goto/16 :goto_8

    :cond_6
    const-string v1, "\u06dc\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x5fc1

    const v18, -0x5031a872

    xor-int v5, v5, v18

    const v18, -0x784352fc

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v2, p0

    .line 97
    new-instance v3, Ll/᩶᩺֫;

    .line 20
    invoke-direct {v3}, Ll/ܰ᩺֫;-><init>()V

    .line 18
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 41
    sget-boolean v1, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v1, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u06db\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x58e5

    const v18, 0x3bbb0a6d

    xor-int v5, v5, v18

    const v18, -0x2397edbb

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v2, p0

    const/16 v1, 0x29d2

    const/16 v10, 0x29d2

    goto :goto_4

    :sswitch_b
    move-object/from16 v2, p0

    const v1, 0x9658

    const v10, 0x9658

    :goto_4
    const-string v1, "\u1a76\u1a77"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x7e6f

    const v18, -0x684c64c1

    xor-int v5, v5, v18

    const v18, -0x2fef2449

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v2, p0

    add-int v1, v6, v9

    mul-int v1, v1, v1

    sub-int/2addr v1, v8

    if-gtz v1, :cond_8

    const-string v1, "\u05ab\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0xf

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x1057

    const v18, 0x69175e1d

    xor-int v5, v5, v18

    const v18, -0x5db8d56b

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u073f\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x3773

    const v18, -0x22fe656e

    xor-int v5, v5, v18

    const v18, 0x37a7e0ce

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v2, p0

    const/16 v9, 0x3ac3

    .line 17
    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v1, "\u06e1\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x79d

    const v18, 0x6157430e

    xor-int v5, v5, v18

    const v18, 0x22e5c897

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v2, p0

    const v1, 0xd7cf089

    add-int/2addr v1, v7

    add-int v8, v1, v1

    .line 54
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    const-string v1, "\u06e2\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x5411

    const v18, -0xbea1648

    xor-int v5, v5, v18

    const v18, -0x102ad56e

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v2, p0

    const/16 v1, 0x32

    aget-short v6, v19, v1

    mul-int v7, v6, v6

    .line 57
    sget-boolean v1, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v1, :cond_b

    :goto_5
    const-string v1, "\u073d\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x53

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x2ca1

    const v18, -0x3aa31df5

    xor-int v5, v5, v18

    const v18, -0x743406ef

    goto/16 :goto_8

    :cond_b
    const-string v1, "\u06e7\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x5d

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x11f

    const v18, -0x6badb9db

    xor-int v5, v5, v18

    const v18, 0x74a585f

    goto :goto_8

    :sswitch_10
    move-object/from16 v2, p0

    sget-object v19, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 18
    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v1, :cond_c

    :goto_6
    const-string v1, "\u05a1\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x3

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x32d

    const v18, 0x4387f7ee

    xor-int v5, v5, v18

    const v18, 0x758a17bd

    goto :goto_8

    :cond_c
    const-string v1, "\u06d6\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x7d69

    const v18, -0x7cfc6d8f

    xor-int v5, v5, v18

    const v18, 0x4be7e143    # 3.0392966E7f

    goto :goto_8

    :sswitch_11
    move-object/from16 v2, p0

    .line 95
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v1

    if-gtz v1, :cond_d

    :goto_7
    const-string v1, "\u1a74\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x67

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x3117

    const v18, -0x3d202a95

    xor-int v5, v5, v18

    const v18, 0x69a0df9

    goto :goto_8

    :cond_d
    const-string v1, "\u06db\u1a7b"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x129d

    const v18, -0x1ca8f46

    xor-int v5, v5, v18

    const v18, 0xe2a92f2

    :goto_8
    xor-int v18, v1, v18

    move-object/from16 v1, p2

    move v2, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6ea357ea -> :sswitch_2
        -0x680d43cf -> :sswitch_e
        -0x646e7ef2 -> :sswitch_6
        -0x5a7a8fca -> :sswitch_6
        -0x570511a0 -> :sswitch_7
        -0x49dd3708 -> :sswitch_7
        -0x48054eec -> :sswitch_3
        -0x3f6c9133 -> :sswitch_d
        -0x3ecd5189 -> :sswitch_f
        -0x3ded78bb -> :sswitch_e
        -0x290af2c0 -> :sswitch_11
        -0x119975ac -> :sswitch_a
        -0x7e953a9 -> :sswitch_9
        -0x7a000c3 -> :sswitch_4
        -0x39e8176 -> :sswitch_0
        -0x5bc2ed -> :sswitch_3
        0x569823b -> :sswitch_c
        0xda38cfd -> :sswitch_c
        0xde7ae23 -> :sswitch_11
        0xeea96ee -> :sswitch_5
        0x14a1a3e5 -> :sswitch_1
        0x18e183c9 -> :sswitch_a
        0x216ce5ed -> :sswitch_10
        0x2eff400e -> :sswitch_10
        0x30ebcd76 -> :sswitch_0
        0x3bdc9d24 -> :sswitch_2
        0x4b1b3708 -> :sswitch_d
        0x56bd694f -> :sswitch_8
        0x59f5d94f -> :sswitch_5
        0x5ac60084 -> :sswitch_9
        0x5b8203a5 -> :sswitch_f
        0x61a0c515 -> :sswitch_8
        0x6f53495f -> :sswitch_b
        0x77be362f -> :sswitch_1
        0x78a99425 -> :sswitch_4
        0x7fc1c3b1 -> :sswitch_b
    .end sparse-switch
.end method

.method public final addSwitch(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Switch;
    .locals 20

    move-object/from16 v0, p1

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

    const/4 v13, 0x0

    const v14, 0x416f27f5

    sget v15, Ll/ۖۖ;->᩵ۜ֨:I

    sget v16, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v17, "\u1a79\u073d"

    invoke-static/range {v17 .. v17}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v2, v17, v16

    mul-int/lit16 v2, v2, -0x12db

    const v19, 0x41ad94fd

    xor-int v2, v2, v19

    const v19, 0x50a84515

    xor-int v17, v17, v19

    move-object/from16 v19, v4

    move-object v11, v10

    move-object v14, v13

    move/from16 v18, v17

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v17, 0x416f27f5

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v5, v17, v16

    mul-int/lit16 v5, v5, 0x467b

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v2, v5

    xor-int v17, v18, v2

    sparse-switch v17, :sswitch_data_0

    move-object/from16 v2, p0

    .line 44
    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v1, :cond_d

    goto/16 :goto_7

    .line 79
    :sswitch_0
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    sget v2, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v2, :cond_0

    :goto_1
    move-object/from16 v2, p0

    goto/16 :goto_6

    :cond_0
    move-object/from16 v2, p0

    goto :goto_2

    .line 48
    :sswitch_1
    sget v2, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v2, p0

    goto/16 :goto_7

    :sswitch_2
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v2

    if-ltz v2, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    const/4 v0, 0x0

    return-object v0

    .line 21
    :sswitch_5
    iput-object v0, v3, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    .line 22
    iput-object v1, v3, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 91
    iget-object v0, v2, Ll/ۨ᩺֫;->᩷:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/֨᩻;->ܿ֨᩹(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :sswitch_6
    move-object/from16 v2, p0

    .line 20
    invoke-static {v1, v4}, Ll/ۨ᩺֫;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "\u06d8\u0736"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v16, v5

    mul-int/lit8 v5, v5, -0x11

    xor-int v1, v5, v15

    mul-int/lit16 v1, v1, -0x5c99

    const v18, -0x3a2a3eeb

    xor-int v1, v1, v18

    const v18, 0x31e4859d

    xor-int v18, v5, v18

    move v2, v1

    move-object/from16 v1, p2

    goto :goto_0

    :sswitch_7
    move-object/from16 v2, p0

    const/16 v1, 0x41

    const/4 v4, 0x3

    .line 19
    invoke-static {v14, v1, v4, v10}, Ll/֨ۚ;->֨֨۟([SIII)Ljava/lang/String;

    move-result-object v4

    .line 43
    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v1, :cond_4

    :goto_2
    const-string v1, "\u05a1\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x6b

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x664d

    const v18, 0x137acba3

    xor-int v5, v5, v18

    const v18, 0x37b11076

    goto/16 :goto_8

    :cond_4
    const-string v1, "\u1a78\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x3b

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x755b

    const v18, -0x351ececb    # -7379098.5f

    xor-int v5, v5, v18

    const v18, -0x7c1f64ad

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v2, p0

    .line 18
    invoke-static {v11, v12, v13, v10}, Ll/ۖ֨;->۟ۢ۫([SIII)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Ll/ۨ᩺֫;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v14, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 4
    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v1, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u06dc\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x5f

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x19c5

    const v18, -0x6c7dd632

    xor-int v5, v5, v18

    const v18, -0x611ce4ea

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v2, p0

    const/16 v12, 0x3c

    const/4 v13, 0x5

    .line 82
    sget v1, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v1, :cond_6

    :goto_3
    const-string v1, "\u06eb\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x7

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x22b7

    const v18, 0x127334b7

    xor-int v5, v5, v18

    const v18, 0x8e9f2e8

    goto/16 :goto_8

    :cond_6
    const-string v1, "\u06da\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0xf

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x2f5f

    const v18, -0x8e8bbea

    xor-int v5, v5, v18

    const v18, -0x3042cd9f

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v2, p0

    .line 90
    new-instance v3, Ll/֡᩺֫;

    .line 18
    invoke-direct {v3}, Ll/ܰ᩺֫;-><init>()V

    sget-object v11, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 66
    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v1, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u06ec\u06d9"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x73b5

    const v18, -0x69f307f4

    xor-int v5, v5, v18

    const v18, -0x21d180f6

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v2, p0

    const v1, 0xbfce

    const v10, 0xbfce

    goto :goto_4

    :sswitch_c
    move-object/from16 v2, p0

    const v1, 0xa18f

    const v10, 0xa18f

    :goto_4
    const-string v1, "\u05a8\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x443

    const v18, 0x8faa8e5

    xor-int v5, v5, v18

    const v18, 0x6df9bdcf

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v2, p0

    add-int v1, v6, v9

    mul-int v1, v1, v1

    sub-int v1, v8, v1

    if-gez v1, :cond_8

    const-string v1, "\u06d7\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x7101

    const v18, 0x365cf7de

    xor-int v5, v5, v18

    const v18, 0x202356c1

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u06e2\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x59

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x7db5

    const v18, 0x44be81fb

    xor-int v5, v5, v18

    const v18, -0x44524107

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v2, p0

    const/16 v9, 0xf5d

    .line 55
    sget v1, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v1, :cond_9

    :goto_5
    const-string v1, "\u06eb\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x6d

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x2a23

    const v18, 0x6991607f

    xor-int v5, v5, v18

    const v18, -0x4e19e3d8    # -6.697082E-9f

    goto/16 :goto_8

    :cond_9
    const-string v1, "\u0733\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x3d

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x5d5f

    const v18, -0x225f35d1

    xor-int v5, v5, v18

    const v18, -0x45b401b7

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v2, p0

    const v1, 0xec07c9

    add-int/2addr v1, v7

    add-int v8, v1, v1

    .line 13
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_6

    :cond_a
    const-string v1, "\u1a7b\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x21a3

    const v18, 0x6f41fdb9

    xor-int v5, v5, v18

    const v18, 0x49321634    # 729443.25f

    goto/16 :goto_8

    :sswitch_10
    move-object/from16 v2, p0

    const/16 v1, 0x3b

    aget-short v6, v19, v1

    mul-int v7, v6, v6

    .line 79
    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v1, :cond_b

    goto :goto_7

    :cond_b
    const-string v1, "\u05ab\u06db"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x23

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x79a1

    const v18, 0x14939057

    xor-int v5, v5, v18

    const v18, 0x2378454a

    goto :goto_8

    :sswitch_11
    move-object/from16 v2, p0

    sget-object v19, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 48
    sget-boolean v1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v1, :cond_c

    :goto_6
    const-string v1, "\u06da\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x7b

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x7c3d

    const v18, 0x83a01d6

    xor-int v5, v5, v18

    const v18, -0x23e5c2d2

    goto :goto_8

    :cond_c
    const-string v1, "\u06e0\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x470f

    const v18, -0x553bb1ad

    xor-int v5, v5, v18

    const v18, 0x329930b9

    goto :goto_8

    :goto_7
    const-string v1, "\u073f\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0xd

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x6a2d

    const v18, 0x809813e

    xor-int v5, v5, v18

    const v18, -0x3ad9e9dd

    goto :goto_8

    :cond_d
    const-string v1, "\u0730\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x33

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x352b

    const v18, 0x49750b20    # 1003698.0f

    xor-int v5, v5, v18

    const v18, 0x5ba75bfb

    :goto_8
    xor-int v18, v1, v18

    move-object/from16 v1, p2

    move v2, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d6ae3d9 -> :sswitch_4
        -0x7bd12e6f -> :sswitch_10
        -0x727bcd11 -> :sswitch_e
        -0x696b4f52 -> :sswitch_b
        -0x5a048c11 -> :sswitch_2
        -0x530f22e1 -> :sswitch_9
        -0x4f37f553 -> :sswitch_0
        -0x4568052b -> :sswitch_7
        -0x3c33ba0a -> :sswitch_d
        -0x3384c427 -> :sswitch_d
        -0x13f8fbe8 -> :sswitch_5
        -0x13d5842a -> :sswitch_6
        -0x12fac62a -> :sswitch_3
        -0xfcde07d -> :sswitch_c
        -0x6db3506 -> :sswitch_10
        -0x799bbd -> :sswitch_e
        0x5b04aad -> :sswitch_3
        0x8512e51 -> :sswitch_4
        0xd161be6 -> :sswitch_7
        0x14ced9a6 -> :sswitch_11
        0x231bbac0 -> :sswitch_a
        0x28f0c671 -> :sswitch_b
        0x4e4eabf7 -> :sswitch_9
        0x4eaeda7e -> :sswitch_5
        0x5b4200c7 -> :sswitch_8
        0x606918b0 -> :sswitch_1
        0x60e6a3fb -> :sswitch_6
        0x61bda64a -> :sswitch_f
        0x6717cf93 -> :sswitch_11
        0x6ee3a1f0 -> :sswitch_1
        0x72112ed4 -> :sswitch_f
        0x7544fe14 -> :sswitch_c
        0x78d7ddd7 -> :sswitch_a
        0x7b7b495a -> :sswitch_8
        0x7d8cf8c4 -> :sswitch_2
        0x7dacfbfb -> :sswitch_0
    .end sparse-switch
.end method

.method public final addText(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Text;
    .locals 19

    move-object/from16 v0, p1

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

    const v12, -0x5b3269e1

    sget v13, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v14, Ll/ۖ᩹;->۫ܽۗ:I

    const-string v15, "\u073d\u06d9"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v14

    mul-int/lit8 v15, v15, -0x41

    xor-int v1, v15, v13

    mul-int/lit16 v1, v1, 0x6bb9

    const v17, 0x42d99561

    xor-int v1, v1, v17

    const v17, 0x6395ab18

    xor-int v15, v15, v17

    move-object v3, v2

    move-object v10, v9

    move/from16 v16, v15

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v15, -0x5b3269e1

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, -0x47ad

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v15, v16, v1

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v1, p0

    move/from16 v16, v15

    .line 17
    invoke-static {v10, v11, v12, v9}, Ll/ۖ֡;->ۢ۫᩷([SIII)Ljava/lang/String;

    move-result-object v15

    .line 18
    invoke-static {v0, v15}, Ll/ۨ᩺֫;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iput-object v0, v2, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    .line 56
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v15

    if-eqz v15, :cond_3

    goto/16 :goto_7

    .line 66
    :sswitch_0
    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-gez v1, :cond_1

    :cond_0
    move-object/from16 v1, p0

    move/from16 v16, v15

    goto/16 :goto_7

    :cond_1
    move-object/from16 v1, p0

    move/from16 v16, v15

    goto/16 :goto_6

    .line 28
    :sswitch_1
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    sget v1, Ll/ۗ֨;->᩹ۜۡ:I

    if-gez v1, :cond_0

    :cond_2
    move-object/from16 v1, p0

    move/from16 v16, v15

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    :goto_1
    const-string v1, "\u073d\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    move/from16 v16, v15

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x3651

    const v17, -0x389d829e

    xor-int v15, v15, v17

    const v17, -0x670bcbae

    xor-int v1, v1, v17

    move/from16 v18, v16

    move/from16 v16, v1

    move v1, v15

    goto :goto_2

    .line 43
    :sswitch_4
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    move-object/from16 v1, p0

    .line 70
    iget-object v0, v1, Ll/ۨ᩺֫;->᩷:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v2

    :cond_3
    const-string v15, "\u1a73\u06db"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x5b11

    const v17, -0x48953246

    xor-int v0, v0, v17

    const v17, 0x2a7df4a0

    xor-int v15, v15, v17

    move v1, v0

    move-object/from16 v0, p1

    move/from16 v18, v16

    move/from16 v16, v15

    :goto_2
    move/from16 v15, v18

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v1, p0

    move/from16 v16, v15

    const/16 v11, 0x45

    const/4 v12, 0x5

    .line 21
    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v0, "\u06dc\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x5ad7

    const v17, 0x1f700b8b

    xor-int v15, v15, v17

    const v17, -0x1279c9a2

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v1, p0

    move/from16 v16, v15

    .line 17
    sget-object v10, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u06da\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x1dab

    const v17, 0x1c2419b5

    xor-int v15, v15, v17

    const v17, -0x20f1fb53

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v1, p0

    move/from16 v16, v15

    .line 69
    new-instance v2, Ll/۟᩺֫;

    .line 17
    invoke-direct {v2}, Ll/ܰ᩺֫;-><init>()V

    .line 32
    sget v0, Ll/᩺;->۫۬۫:I

    if-gtz v0, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u073a\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x51

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x2383

    const v17, -0x32b05ea7

    xor-int v15, v15, v17

    const v17, 0x43cfef14

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v1, p0

    move/from16 v16, v15

    const/16 v0, 0x5086

    const/16 v9, 0x5086

    goto :goto_3

    :sswitch_a
    move-object/from16 v1, p0

    move/from16 v16, v15

    const/16 v0, 0x336f

    const/16 v9, 0x336f

    :goto_3
    const-string v0, "\u06d8\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x28d1

    const v17, 0x7ee21df5

    xor-int v15, v15, v17

    const v17, 0x28e2e95e

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v1, p0

    move/from16 v16, v15

    mul-int v0, v5, v8

    sub-int/2addr v0, v7

    if-lez v0, :cond_7

    const-string v0, "\u06e8\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x5001

    const v17, 0x146f4db4

    xor-int v15, v15, v17

    const v17, 0x12e48d8e

    goto/16 :goto_8

    :cond_7
    const-string v0, "\u06d7\u06e1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x481

    const v17, 0x757c3588

    xor-int v15, v15, v17

    const v17, 0x68279a69

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v1, p0

    move/from16 v16, v15

    const/16 v8, 0xebc

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_4
    const-string v0, "\u06dc\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x39

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x1fe9

    const v17, -0x6b510aa6

    xor-int v15, v15, v17

    const v17, -0x85f696

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u1a77\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x39

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x5127

    const v17, -0x724804f8

    xor-int v15, v15, v17

    const v17, -0x4888f3be

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v1, p0

    move/from16 v16, v15

    const v0, 0x364684

    add-int v7, v6, v0

    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v0, :cond_9

    goto :goto_5

    :cond_9
    const-string v0, "\u073f\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x53

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x24ed

    const v17, 0x391cfda1

    xor-int v15, v15, v17

    const v17, -0x11c5d663

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v1, p0

    move/from16 v16, v15

    aget-short v5, v3, v4

    mul-int v6, v5, v5

    .line 14
    sget v0, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v0, :cond_a

    :goto_5
    const-string v0, "\u06dc\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x15

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x32bf

    const v17, 0xd96795c

    xor-int v15, v15, v17

    const v17, -0x5e7faafc

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u05a1\u06e1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x53

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x2e07

    const v17, -0x59e238af

    xor-int v15, v15, v17

    const v17, -0x3b327ba7

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v1, p0

    move/from16 v16, v15

    const/16 v4, 0x44

    .line 16
    sget v0, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v0, :cond_b

    goto :goto_7

    :cond_b
    const-string v0, "\u1a73\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x4da7

    const v17, 0x1e3cc979

    xor-int v15, v15, v17

    const v17, 0x3179058c

    goto :goto_8

    :sswitch_10
    move-object/from16 v1, p0

    move/from16 v16, v15

    sget-object v3, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 10
    sget v0, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v0, :cond_c

    :goto_6
    const-string v0, "\u06eb\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x7fb1

    const v17, -0x4eee72f4

    xor-int v15, v15, v17

    const v17, -0x363a68c4    # -1618663.5f

    goto :goto_8

    :cond_c
    const-string v0, "\u1a73\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x59

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x2419

    const v17, -0x6dae6077

    xor-int v15, v15, v17

    const v17, 0x496f0972    # 979095.1f

    goto :goto_8

    :sswitch_11
    move-object/from16 v1, p0

    move/from16 v16, v15

    .line 45
    sget v0, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v0, :cond_d

    :goto_7
    const-string v0, "\u073d\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0xb

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x61d7

    const v17, -0x49deb1df

    xor-int v15, v15, v17

    const v17, 0x57b06704

    goto :goto_8

    :cond_d
    const-string v0, "\u1a79\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x6d77

    const v17, -0x60992584

    xor-int v15, v15, v17

    const v17, 0x43836040

    :goto_8
    xor-int v0, v0, v17

    move v1, v15

    move/from16 v15, v16

    move/from16 v16, v0

    move-object/from16 v0, p1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7dd79ea7 -> :sswitch_1
        -0x7ab93629 -> :sswitch_7
        -0x70046c0c -> :sswitch_9
        -0x6febab4a -> :sswitch_e
        -0x6b1c3e7a -> :sswitch_6
        -0x4bca45d7 -> :sswitch_f
        -0x49eed03a -> :sswitch_8
        -0x489ef455 -> :sswitch_5
        -0x420dd014 -> :sswitch_0
        -0x3ca47dc2 -> :sswitch_5
        -0x322d8512 -> :sswitch_0
        -0x2ce61abc -> :sswitch_4
        -0x287cd8f3 -> :sswitch_f
        -0x246f8fac -> :sswitch_d
        -0x20ad4e76 -> :sswitch_3
        -0x1f222249 -> :sswitch_c
        -0x1c2debf0 -> :sswitch_9
        -0x148bce13 -> :sswitch_2
        -0xae954fa -> :sswitch_7
        -0x9d31c6d -> :sswitch_1
        -0x6861d43 -> :sswitch_4
        -0x497deb2 -> :sswitch_3
        -0x810276 -> :sswitch_2
        0x86d04aa -> :sswitch_10
        0x23ca6b49 -> :sswitch_a
        0x2fe3d84b -> :sswitch_11
        0x354a6800 -> :sswitch_d
        0x4e566ca2 -> :sswitch_a
        0x54b21db6 -> :sswitch_c
        0x5a770601 -> :sswitch_b
        0x5cfb81d9 -> :sswitch_10
        0x5f76a3dc -> :sswitch_b
        0x630f186a -> :sswitch_8
        0x75073acb -> :sswitch_6
        0x7921b859 -> :sswitch_11
        0x7a97148f -> :sswitch_e
    .end sparse-switch
.end method

.method public final addText(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Text;
    .locals 18

    move-object/from16 v0, p1

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

    const v12, 0x3792488b

    sget v13, Ll/֡۟;->᩶᩺ܰ:I

    sget v14, Ll/ۗۖ;->ۙ᩶֨:I

    const-string v15, "\u1a78\u1a74"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    xor-int v2, v15, v14

    mul-int/lit16 v2, v2, 0x3b9f

    const v17, -0x6f437977

    xor-int v2, v2, v17

    const v17, 0x25b34a44

    xor-int v15, v15, v17

    move-object v5, v4

    move-object v9, v8

    move-object v12, v11

    move/from16 v16, v15

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v15, 0x3792488b

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, 0x390d

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v2, v15

    xor-int v15, v16, v2

    sparse-switch v15, :sswitch_data_0

    .line 36
    sget v2, Ll/ۗ֨;->᩹ۜۡ:I

    if-gez v2, :cond_a

    goto/16 :goto_4

    :sswitch_0
    sget v2, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v2, :cond_c

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_1

    .line 48
    :sswitch_2
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    goto/16 :goto_1

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    const/4 v0, 0x0

    return-object v0

    .line 25
    :sswitch_4
    iput-object v0, v3, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    .line 26
    iput-object v1, v3, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 77
    iget-object v0, v2, Ll/ۨ᩺֫;->᩷:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/֨᩻;->ܿ֨᩹(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :sswitch_5
    move-object/from16 v2, p0

    .line 24
    invoke-static {v1, v4}, Ll/ۨ᩺֫;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    sget v16, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v16, :cond_0

    goto :goto_1

    :cond_0
    const-string v16, "\u06e8\u073f"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    mul-int/lit8 v16, v16, 0x4d

    xor-int v1, v16, v13

    mul-int/lit16 v1, v1, 0x614b

    const v17, -0x57dca49b

    xor-int v1, v1, v17

    const v17, 0x746e4dac

    xor-int v16, v16, v17

    move v2, v1

    goto/16 :goto_7

    :sswitch_6
    move-object/from16 v2, p0

    const/16 v1, 0x50

    const/4 v4, 0x3

    .line 23
    invoke-static {v12, v1, v4, v8}, Ll/ۗۖ;->᩵᩻ۘ([SIII)Ljava/lang/String;

    move-result-object v4

    .line 42
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v1

    if-gtz v1, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v1, "\u06e8\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x7999

    const v16, -0x6c919d0a

    xor-int v2, v2, v16

    const v16, 0x70a6e99a

    goto/16 :goto_6

    .line 22
    :sswitch_7
    invoke-static {v9, v10, v11, v8}, Ll/֫֡;->ܺۜᩴ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-static {v0, v1}, Ll/ۨ᩺֫;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    sget v1, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v1, "\u06d6\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x37

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x56f7

    const v16, -0x53d0ace5

    xor-int v2, v2, v16

    const v16, 0x1f30ec1b

    goto/16 :goto_6

    :sswitch_8
    const/16 v10, 0x4b

    const/4 v11, 0x5

    .line 75
    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v1, :cond_3

    :goto_1
    const-string v1, "\u06dc\u1a74"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0xeef

    const v16, -0x380cd731

    xor-int v2, v2, v16

    const v16, 0xdaa746c

    goto/16 :goto_6

    :cond_3
    const-string v1, "\u05a1\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x51d7

    const v16, 0x7e5e6d0c

    xor-int v2, v2, v16

    const v16, 0x60870b63

    goto/16 :goto_6

    .line 76
    :sswitch_9
    new-instance v3, Ll/۟᩺֫;

    .line 22
    invoke-direct {v3}, Ll/ܰ᩺֫;-><init>()V

    sget-object v9, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    .line 36
    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v1, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u06e1\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x387f

    const v16, 0x20f14503

    xor-int v2, v2, v16

    const v16, -0x666105e

    goto/16 :goto_6

    :sswitch_a
    const/16 v1, 0x3730

    const/16 v8, 0x3730

    goto :goto_2

    :sswitch_b
    const v1, 0xe1a1

    const v8, 0xe1a1

    :goto_2
    const-string v1, "\u0730\u073a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x7d

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x3b13

    const v16, 0x4a11765d    # 2383255.2f

    xor-int v2, v2, v16

    const v16, -0x182e288c

    goto/16 :goto_6

    :sswitch_c
    mul-int/lit16 v1, v6, 0x505e

    sub-int v1, v7, v1

    if-gez v1, :cond_5

    const-string v1, "\u06dc\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x5297

    const v16, 0x7e8ca032

    xor-int v2, v2, v16

    const v16, -0x5cc1f45f

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u06eb\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x7d

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x7f1f

    const v16, -0x3d722ae8

    xor-int v2, v2, v16

    const v16, 0x4914369a    # 607081.6f

    goto/16 :goto_6

    :sswitch_d
    mul-int v1, v6, v6

    const v2, 0x64eb8a1

    add-int v7, v1, v2

    .line 55
    sget v1, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v1, :cond_6

    goto :goto_4

    :cond_6
    const-string v1, "\u06ec\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x23

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x6071

    const v16, 0x27ac6e8e

    xor-int v2, v2, v16

    const v16, 0x43e5dd8f

    goto/16 :goto_6

    :sswitch_e
    const/16 v1, 0x4a

    aget-short v6, v5, v1

    .line 33
    sget-boolean v1, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v1, :cond_7

    :goto_3
    const-string v1, "\u06dc\u1a7b"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x5

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x3a5d

    const v16, -0x6bc72c6

    xor-int v2, v2, v16

    const v16, 0x77497d7f

    goto/16 :goto_6

    :cond_7
    const-string v1, "\u06e2\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x55d3

    const v16, 0x575d8a36

    xor-int v2, v2, v16

    const v16, -0x21fffb7f

    goto/16 :goto_6

    :sswitch_f
    sget-object v5, Ll/ۨ᩺֫;->ۤᩳۢ:[S

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v1

    if-eqz v1, :cond_9

    :cond_8
    :goto_4
    const-string v1, "\u06d6\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x77

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x50e9

    const v16, 0x27745c9f

    xor-int v2, v2, v16

    const v16, -0x29176695

    goto :goto_6

    :cond_9
    const-string v1, "\u05a1\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x6ef3

    const v16, 0x1c9bbc82

    xor-int v2, v2, v16

    const v16, -0x29f982d6

    goto :goto_6

    .line 19
    :sswitch_10
    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v1, :cond_b

    :cond_a
    const-string v1, "\u1a75\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x6d4f

    const v16, -0xcefe7dd

    xor-int v2, v2, v16

    const v16, -0x23eb218c

    goto :goto_6

    :cond_b
    const-string v1, "\u06e2\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x7

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x4e35

    const v16, 0x3ffcabd3

    xor-int v2, v2, v16

    const v16, -0x3a082363

    goto :goto_6

    :sswitch_11
    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v1, :cond_d

    :cond_c
    :goto_5
    const-string v1, "\u06e8\u06d7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x1cfd

    const v16, -0x63a85204

    xor-int v2, v2, v16

    const v16, -0x202d0685

    goto :goto_6

    :cond_d
    const-string v1, "\u06d9\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x6f

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x5da3

    const v16, 0x65d4c6f7

    xor-int v2, v2, v16

    const v16, -0x598ce7c8

    :goto_6
    xor-int v16, v1, v16

    :goto_7
    move-object/from16 v1, p2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79addd66 -> :sswitch_d
        -0x787f20ee -> :sswitch_1
        -0x7387b7cb -> :sswitch_a
        -0x70e3fdea -> :sswitch_f
        -0x6244925f -> :sswitch_0
        -0x5ec71e74 -> :sswitch_10
        -0x5e340569 -> :sswitch_8
        -0x540e46f1 -> :sswitch_7
        -0x510dfd35 -> :sswitch_3
        -0x509ce898 -> :sswitch_c
        -0x2cdd4f6f -> :sswitch_2
        -0x2b2a3c6b -> :sswitch_11
        -0x28dce21a -> :sswitch_5
        -0x1b244b8f -> :sswitch_4
        -0x18a5c5ca -> :sswitch_e
        -0x14b94e59 -> :sswitch_6
        -0x1274059b -> :sswitch_a
        -0x121796c8 -> :sswitch_10
        -0x107daf90 -> :sswitch_1
        -0xcaef736 -> :sswitch_0
        -0x6bfaf92 -> :sswitch_e
        -0x679d7d6 -> :sswitch_2
        0x64f3a8a -> :sswitch_f
        0xaf69ca7 -> :sswitch_11
        0xfcee69e -> :sswitch_c
        0x13298842 -> :sswitch_8
        0x196bd3d7 -> :sswitch_6
        0x22ec036b -> :sswitch_3
        0x27dfa618 -> :sswitch_d
        0x3839d8d0 -> :sswitch_9
        0x38a0cac2 -> :sswitch_4
        0x4fc12756 -> :sswitch_7
        0x5cf0b30c -> :sswitch_b
        0x5fe08116 -> :sswitch_5
        0x6bc5f56c -> :sswitch_9
        0x6c5f34e4 -> :sswitch_b
    .end sparse-switch
.end method

.method public final onCreated(Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
    .locals 0

    .line 110
    iput-object p1, p0, Ll/ۨ᩺֫;->᩸:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;

    return-object p0
.end method

.method public final onPreferenceChange(Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
    .locals 0

    .line 104
    iput-object p1, p0, Ll/ۨ᩺֫;->ᩴ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;

    return-object p0
.end method

.method public final setLocalString(Lbin/mt/plugin/api/LocalString;)V
    .locals 0

    .line 38
    iput-object p1, p0, Ll/ۨ᩺֫;->ۤ:Lbin/mt/plugin/api/LocalString;

    return-void
.end method

.method public final subtitle(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
    .locals 0

    .line 49
    iput-object p1, p0, Ll/ۨ᩺֫;->ܳ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final title(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
    .locals 0

    .line 43
    iput-object p1, p0, Ll/ۨ᩺֫;->۫:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final ۙ()Ljava/util/ArrayList;
    .locals 25

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

    const v18, -0x2baecb53

    sget v19, Ll/֨ۢ;->۬ܿܺ:I

    sget v20, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v21, "\u06e0\u1a77"

    invoke-static/range {v21 .. v21}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v19

    xor-int v1, v21, v20

    mul-int/lit16 v1, v1, -0x248f

    const v23, -0x48a5aef0

    xor-int v1, v1, v23

    const v23, 0x50aab786

    xor-int v21, v21, v23

    move-object/from16 v23, v5

    move-object v7, v6

    move-object v8, v15

    move-object/from16 v5, v16

    move/from16 v22, v21

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const v21, -0x2baecb53

    move-object v15, v14

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v24, v3

    move-object v3, v2

    move-object/from16 v2, v17

    move-object/from16 v17, v4

    move-object/from16 v4, v24

    :goto_0
    xor-int v6, v21, v20

    mul-int/lit16 v6, v6, 0x5fdb

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v1, v6

    xor-int v21, v22, v1

    sparse-switch v21, :sswitch_data_0

    .line 117
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    goto/16 :goto_3

    .line 15
    :sswitch_0
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    if-gez v1, :cond_1

    :cond_0
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_8

    :cond_1
    const-string v1, "\u06e2\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, -0x6757

    const v22, 0x4dbd9045    # 3.9754358E8f

    xor-int v6, v6, v22

    const v22, -0x7b883e82

    goto/16 :goto_5

    :sswitch_1
    sget v1, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "\u1a75\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x55

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x7f1

    const v22, -0x6e2f471f

    xor-int v6, v6, v22

    const v22, 0x33948c21

    goto/16 :goto_5

    .line 5
    :sswitch_2
    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v1, :cond_0

    goto :goto_1

    .line 112
    :sswitch_3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-lez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_c

    .line 33
    :sswitch_4
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v1, :cond_5

    :cond_4
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_11

    :cond_5
    :goto_1
    const-string v1, "\u06df\u1a74"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0x15

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x697b

    const v22, 0xc26c560

    xor-int v6, v6, v22

    const v22, 0x497a5993

    goto/16 :goto_5

    .line 118
    :sswitch_5
    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v1, :cond_7

    :cond_6
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_d

    :cond_7
    :goto_2
    const-string v1, "\u06e7\u06d8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, 0x52d1

    const v22, 0x34848c1e

    xor-int v6, v6, v22

    const v22, -0x2725f897

    goto/16 :goto_5

    .line 18
    :sswitch_6
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v1, :cond_4

    :goto_3
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_e

    .line 94
    :sswitch_7
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    .line 146
    :sswitch_8
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    const/4 v1, 0x0

    return-object v1

    .line 172
    :sswitch_9
    invoke-static {v3, v2}, Ll/ۖ;->ۤ᩸۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    move-object v5, v1

    goto/16 :goto_4

    :sswitch_a
    invoke-static {v3, v8}, Ll/ۖ;->ۤ᩸۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    move-object v14, v1

    move-object/from16 v6, v18

    goto/16 :goto_7

    .line 0
    :sswitch_b
    invoke-static {v10, v2}, Ll/֨ۨ;->ۖ᩵֡(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v9, :cond_9

    const-string v1, "\u06dc\u06df"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, -0x7d6f

    const v22, -0x23a8df60

    xor-int v6, v6, v22

    const v22, 0x781fd48e

    goto/16 :goto_5

    :sswitch_c
    invoke-static {v10, v8}, Ll/֨ۨ;->ۖ᩵֡(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v9, :cond_8

    const-string v1, "\u06e2\u0733"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, -0x3887

    const v22, 0x303aafde

    xor-int v6, v6, v22

    const v22, -0x2941484

    goto/16 :goto_5

    .line 171
    :sswitch_d
    invoke-static {v2, v12}, Ll/ۘܽ;->᩷۬ܽ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v11, :cond_9

    const-string v1, "\u06e0\u1a74"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0x15

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x55d5

    const v22, 0x6f8066f8

    xor-int v6, v6, v22

    const v22, 0x71a9d14e

    goto/16 :goto_5

    :sswitch_e
    invoke-static {v8, v12}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v11, :cond_8

    const-string v1, "\u06e7\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x35

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x130f

    const v22, 0x64ecd2cd

    xor-int v6, v6, v22

    const v22, 0x19adcdd6

    goto/16 :goto_5

    :sswitch_f
    move-object v2, v15

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v13, :cond_9

    const-string v1, "\u073f\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x39

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, 0x62e7

    const v22, -0x6a4ca98d

    xor-int v6, v6, v22

    const v22, -0x2ad54585

    goto :goto_5

    .line 126
    :sswitch_10
    iput-object v5, v0, Ll/ۨ᩺֫;->ܳ:Ljava/lang/CharSequence;

    return-object v4

    .line 171
    :sswitch_11
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v13, :cond_8

    const-string v1, "\u06d8\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x2b

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, 0x4c91

    const v22, -0xfe93757

    xor-int v6, v6, v22

    const v22, -0x484030f0

    goto :goto_5

    :cond_8
    move-object/from16 v6, v18

    goto/16 :goto_6

    .line 125
    :sswitch_12
    iput-object v14, v0, Ll/ۨ᩺֫;->۫:Ljava/lang/CharSequence;

    .line 126
    iget-object v15, v0, Ll/ۨ᩺֫;->ܳ:Ljava/lang/CharSequence;

    .line 171
    instance-of v1, v15, Ljava/lang/String;

    if-eqz v1, :cond_9

    const-string v1, "\u06e1\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x39

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x4d6b

    const v22, 0x6dbb37d8

    xor-int v6, v6, v22

    const v22, 0x3d184b2

    goto :goto_5

    :cond_9
    move-object v5, v15

    :goto_4
    const-string v1, "\u05ab\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x226d

    const v22, 0x6a071d

    xor-int v6, v6, v22

    const v22, -0x1290aaa

    :goto_5
    xor-int v22, v1, v22

    goto/16 :goto_12

    .line 117
    :sswitch_13
    invoke-static/range {v23 .. v23}, Ll/֨ۚ;->ᩳ᩷ܺ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰ᩺֫;

    move-object/from16 v6, v18

    .line 118
    invoke-virtual {v1, v6}, Ll/ܰ᩺֫;->ۙ(Lbin/mt/plugin/api/LocalString;)V

    move-object/from16 v18, v2

    goto/16 :goto_9

    :sswitch_14
    move-object/from16 v6, v18

    .line 121
    invoke-static/range {v17 .. v17}, Ll/ۘܶ;->֡۟ۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰ᩺֫;

    .line 122
    invoke-virtual {v1, v3}, Ll/ܰ᩺֫;->ۙ(Lbin/mt/plugin/api/PluginContext;)V

    move-object/from16 v18, v2

    goto/16 :goto_a

    :sswitch_15
    move-object/from16 v6, v18

    const/4 v12, 0x0

    const/4 v13, 0x3

    if-eqz v16, :cond_a

    const-string v1, "\u1a73\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, 0x79e3

    const v22, 0x21d34afd

    xor-int v11, v11, v22

    const v22, -0x637073a1

    xor-int v22, v1, v22

    move-object/from16 v18, v6

    move v1, v11

    const/16 v11, 0x7b

    goto/16 :goto_0

    :cond_a
    const/16 v11, 0x7b

    :goto_6
    move-object v14, v7

    :goto_7
    const-string v1, "\u06da\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    move-object/from16 v18, v2

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x4fe5

    const v22, 0x7d46875c

    xor-int v2, v2, v22

    const v22, -0x15efc322

    goto/16 :goto_f

    :sswitch_16
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    const/4 v10, 0x1

    .line 36
    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v1, :cond_b

    goto/16 :goto_b

    :cond_b
    const-string v1, "\u1a76\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x27

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x6a19

    const v22, -0x5497ae4b

    xor-int v2, v2, v22

    const v22, 0x361d9654

    goto/16 :goto_f

    :sswitch_17
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    const/16 v9, 0x7d

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v1, :cond_c

    :goto_8
    const-string v1, "\u06ec\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x54dd

    const v22, -0x7f6890ee

    xor-int v2, v2, v22

    const v22, -0x7466f38e

    goto/16 :goto_f

    :cond_c
    const-string v1, "\u06d8\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x4827

    const v22, -0x56d265d

    xor-int v2, v2, v22

    const v22, -0x2a5f8673

    goto/16 :goto_f

    :sswitch_18
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 125
    iget-object v7, v0, Ll/ۨ᩺֫;->۫:Ljava/lang/CharSequence;

    .line 171
    instance-of v1, v7, Ljava/lang/String;

    .line 21
    sget v2, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v2, :cond_d

    move/from16 v16, v1

    goto/16 :goto_11

    :cond_d
    const-string v2, "\u06dc\u1a7a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v19, v2

    mul-int/lit8 v2, v2, -0x15

    move/from16 v16, v1

    xor-int v1, v2, v20

    mul-int/lit16 v1, v1, -0x257

    const v22, 0x57c4e56a

    xor-int v1, v1, v22

    const v22, -0x606bb38e

    xor-int v22, v2, v22

    goto/16 :goto_10

    :sswitch_19
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 117
    invoke-static/range {v23 .. v23}, Ll/֫ۢ;->᩷ۤ᩷(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "\u1a73\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x6f

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x8af

    const v22, 0x70b8ec94

    xor-int v2, v2, v22

    const v22, -0x42b2944d

    goto/16 :goto_f

    :sswitch_1a
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 121
    invoke-static/range {v17 .. v17}, Ll/֫ۢ;->᩷ۤ᩷(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "\u1a7b\u0730"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x4d

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0x7ab1

    const v22, 0x512fcaab

    xor-int v2, v2, v22

    const v22, 0x23b79389

    goto/16 :goto_f

    :cond_e
    const-string v1, "\u1a76\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x77

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x12db

    const v22, 0x3e7b9219

    xor-int v2, v2, v22

    const v22, -0x62f11a70

    goto/16 :goto_f

    :sswitch_1b
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 117
    invoke-static {v4}, Ll/ۘܽ;->ۘ֨᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v23, v1

    :goto_9
    const-string v1, "\u073f\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0xcb9

    const v22, 0x189af123

    xor-int v2, v2, v22

    const v22, -0x3413baf9    # -3.0968334E7f

    goto/16 :goto_f

    :sswitch_1c
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 121
    invoke-static {v4}, Ll/֨ᩳ;->ۛۙۙ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v17, v1

    :goto_a
    const-string v1, "\u05a1\u06d6"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x67

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x686d

    const v22, -0x55ade054

    xor-int v2, v2, v22

    const v22, -0x764a18c6

    goto/16 :goto_f

    :sswitch_1d
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 116
    iget-object v3, v0, Ll/ۨ᩺֫;->ۙ:Lbin/mt/plugin/api/PluginContext;

    iget-object v4, v0, Ll/ۨ᩺֫;->᩷:Ljava/util/ArrayList;

    if-eqz v6, :cond_f

    const-string v1, "\u05a8\u1a7b"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x3ead

    const v22, 0x31882a78

    xor-int v2, v2, v22

    const v22, 0x3f9800c4

    goto/16 :goto_f

    :cond_f
    const-string v1, "\u1a75\u06e0"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0x66c3

    const v22, 0x4e567835    # 8.995505E8f

    xor-int v2, v2, v22

    const v22, 0x69dadacb

    goto/16 :goto_f

    :sswitch_1e
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 151
    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v1, :cond_10

    goto/16 :goto_e

    :cond_10
    const-string v1, "\u06dc\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x51

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x716f

    const v22, -0x20ebcc72

    xor-int v2, v2, v22

    const v22, 0x27e57608

    goto/16 :goto_f

    :sswitch_1f
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 32
    sget v1, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v1, :cond_11

    :goto_b
    const-string v1, "\u1a78\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x7d

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x2a01

    const v22, 0x32bee436

    xor-int v2, v2, v22

    const v22, 0x3b9df86f

    goto/16 :goto_f

    :cond_11
    const-string v1, "\u06e8\u06e2"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x278b

    const v22, -0xeec8f8c

    xor-int v2, v2, v22

    const v22, -0x31d564bc

    goto/16 :goto_f

    :sswitch_20
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    sget v1, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v1, :cond_12

    :goto_c
    const-string v1, "\u073a\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x3649

    const v22, -0x49e691a9

    xor-int v2, v2, v22

    const v22, -0x7f965c63

    goto/16 :goto_f

    :cond_12
    const-string v1, "\u1a7b\u1a77"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x2b

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x3723

    const v22, -0xd87da3a

    xor-int v2, v2, v22

    const v22, -0xb86cfd0

    goto/16 :goto_f

    :sswitch_21
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 117
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v1

    if-nez v1, :cond_13

    :goto_d
    const-string v1, "\u06e1\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x4b

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x4911

    const v22, 0x73826238

    xor-int v2, v2, v22

    const v22, -0x4d69e58

    goto :goto_f

    :cond_13
    const-string v1, "\u05a8\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x1f

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x559f

    const v22, -0x1916bd0a

    xor-int v2, v2, v22

    const v22, -0x181507df

    goto :goto_f

    :sswitch_22
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 161
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v1

    if-eqz v1, :cond_14

    :goto_e
    const-string v1, "\u073a\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x280f

    const v22, 0x336a436f

    xor-int v2, v2, v22

    const v22, 0x988b40c

    goto :goto_f

    :cond_14
    const-string v1, "\u1a77\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x2f

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x5397

    const v22, 0x773381e3

    xor-int v2, v2, v22

    const v22, 0x1a82e06c

    goto :goto_f

    :sswitch_23
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 56
    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v1, :cond_15

    goto :goto_11

    :cond_15
    const-string v1, "\u1a77\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x41

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x313b

    const v22, -0x1b42fb3c

    xor-int v2, v2, v22

    const v22, -0x7f2b204e

    :goto_f
    xor-int v22, v1, v22

    move v1, v2

    :goto_10
    move-object/from16 v2, v18

    move-object/from16 v18, v6

    goto/16 :goto_0

    :sswitch_24
    move-object/from16 v18, v2

    .line 115
    iget-object v1, v0, Ll/ۨ᩺֫;->ۤ:Lbin/mt/plugin/api/LocalString;

    sget v2, Ll/᩺;->۫۬۫:I

    if-gtz v2, :cond_16

    move-object v6, v1

    :goto_11
    const-string v1, "\u073f\u06d9"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x5a6d

    const v22, -0x4abd34b

    xor-int v2, v2, v22

    const v22, 0x7306a002

    goto :goto_f

    :cond_16
    const-string v2, "\u06eb\u06e0"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v19

    xor-int v6, v2, v20

    mul-int/lit16 v6, v6, -0x5b69

    const v22, -0x217aa554

    xor-int v6, v6, v22

    const v22, 0x6b768c5f

    xor-int v22, v2, v22

    move-object/from16 v2, v18

    move-object/from16 v18, v1

    :goto_12
    move v1, v6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e5db591 -> :sswitch_1f
        -0x7c7f6506 -> :sswitch_1a
        -0x7b124bba -> :sswitch_2
        -0x792624f1 -> :sswitch_17
        -0x7842e433 -> :sswitch_a
        -0x7433f107 -> :sswitch_24
        -0x6d31d35b -> :sswitch_7
        -0x6541bf72 -> :sswitch_18
        -0x6274eaa0 -> :sswitch_1a
        -0x60c5cfe4 -> :sswitch_17
        -0x5c86a61b -> :sswitch_9
        -0x5a3044d5 -> :sswitch_13
        -0x538728b9 -> :sswitch_7
        -0x5345115b -> :sswitch_4
        -0x513f2320 -> :sswitch_23
        -0x4feff81e -> :sswitch_23
        -0x4f76f0a2 -> :sswitch_1c
        -0x4e2eb981 -> :sswitch_20
        -0x4cf97cac -> :sswitch_1d
        -0x49588e01 -> :sswitch_1c
        -0x4733accb -> :sswitch_11
        -0x4293a835 -> :sswitch_1b
        -0x3f2d7814 -> :sswitch_22
        -0x39e90890 -> :sswitch_21
        -0x31529679 -> :sswitch_d
        -0x309c1501 -> :sswitch_5
        -0x30107670 -> :sswitch_f
        -0x2eed1837 -> :sswitch_1d
        -0x29093d3f -> :sswitch_8
        -0x24e7ff49 -> :sswitch_b
        -0x1f2c2cea -> :sswitch_15
        -0x1c346903 -> :sswitch_5
        -0x1b016001 -> :sswitch_1b
        -0x19bde6cb -> :sswitch_14
        -0x190bfaac -> :sswitch_0
        -0x159bbada -> :sswitch_22
        -0xdb0f462 -> :sswitch_0
        -0x907ea1d -> :sswitch_c
        -0x87c8011 -> :sswitch_20
        -0x44a462c -> :sswitch_1
        -0x14c704d -> :sswitch_1e
        0x34b9f94 -> :sswitch_b
        0x3bc8d50 -> :sswitch_6
        0x45dfe52 -> :sswitch_1f
        0x72d5bce -> :sswitch_2
        0xade32a1 -> :sswitch_16
        0xc173dd1 -> :sswitch_9
        0xcbf765c -> :sswitch_d
        0x149232ef -> :sswitch_19
        0x154c1156 -> :sswitch_1e
        0x180cd47b -> :sswitch_8
        0x1af31acc -> :sswitch_19
        0x21a8d3c8 -> :sswitch_10
        0x236aa517 -> :sswitch_10
        0x260d6105 -> :sswitch_a
        0x273b2ba8 -> :sswitch_6
        0x27e3cecf -> :sswitch_13
        0x2c568d8a -> :sswitch_14
        0x3176b164 -> :sswitch_12
        0x3f714eef -> :sswitch_f
        0x47eae074 -> :sswitch_11
        0x54e741cd -> :sswitch_3
        0x569e44c1 -> :sswitch_12
        0x5a47f73a -> :sswitch_3
        0x5b08d676 -> :sswitch_15
        0x5b0f1394 -> :sswitch_4
        0x5c842251 -> :sswitch_c
        0x5dac99cb -> :sswitch_21
        0x5f114bdf -> :sswitch_1
        0x631c0345 -> :sswitch_18
        0x679492a6 -> :sswitch_e
        0x67b8bc26 -> :sswitch_16
        0x6c25aaa9 -> :sswitch_24
        0x6deaab6d -> :sswitch_e
    .end sparse-switch
.end method

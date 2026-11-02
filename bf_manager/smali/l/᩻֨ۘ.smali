.class public final Ll/᩻֨ۘ;
.super Ljava/lang/Object;
.source "N3YD"

# interfaces
.implements Lbin/mt/plugin/api/preference/PluginPreference$Builder;


# static fields
.field public static final ۬:Ljava/lang/Class;

.field private static final ܺ᩵ۙ:[S


# instance fields
.field public ֨:Ljava/lang/CharSequence;

.field public ۖ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;

.field public ۙ:Lbin/mt/plugin/api/PluginContext;

.field public ۚ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;

.field public ۨ:Lbin/mt/plugin/api/LocalString;

.field public ܰ:Ljava/util/ArrayList;

.field public ᩹:Ljava/lang/CharSequence;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x53

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    const/4 v0, 0x0

    const v1, 0x3d839fe6

    sget v2, Ll/֫֡;->ۡ᩹ۗ:I

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v4, "\u05a8\u06e4"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6233

    const v6, 0x7dd4a9c2

    xor-int/2addr v5, v6

    const v6, -0x763c08f1

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x3591

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 12
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto/16 :goto_4

    .line 5
    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 12
    :sswitch_1
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v4

    if-eqz v4, :cond_7

    goto/16 :goto_4

    :sswitch_2
    return-void

    .line 18
    :sswitch_3
    :try_start_0
    const-class v4, Ll/ᩴ᩹ۘ;

    sget v5, Ll/ᩴ᩹ۘ;->᩸ܰ:I

    sput-object v4, Ll/᩻֨ۘ;->۬:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "\u06e2\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1a97

    const v6, -0x5be859a

    xor-int/2addr v5, v6

    const v6, -0x435d17fe

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v4, "\u05ab\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x35b5

    const v6, -0x2ba016fb

    xor-int/2addr v5, v6

    const v6, -0x490ab652

    goto :goto_0

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v4

    if-eqz v4, :cond_9

    goto/16 :goto_4

    .line 20
    :sswitch_5
    new-instance v4, Ljava/lang/RuntimeException;

    .line 11
    sget v5, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v5, :cond_0

    goto :goto_1

    .line 15
    :cond_0
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v5

    if-gtz v5, :cond_1

    goto/16 :goto_3

    .line 1
    :cond_1
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    .line 17
    :cond_2
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v5

    if-ltz v5, :cond_3

    goto :goto_3

    .line 1
    :cond_3
    sget v5, Ll/֨ۧ;->֫۠֡:I

    if-gtz v5, :cond_4

    goto :goto_3

    :cond_4
    sget-boolean v5, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v5, :cond_5

    goto :goto_1

    :cond_5
    sget-boolean v5, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v5, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v5

    if-gtz v5, :cond_8

    :cond_7
    const-string v4, "\u1a75\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4983

    const v6, -0x6f577c1c

    xor-int/2addr v5, v6

    const v6, -0xccfa566

    goto/16 :goto_0

    .line 5
    :cond_8
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v5

    if-eqz v5, :cond_a

    :cond_9
    :goto_1
    const-string v4, "\u1a76\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3145

    const v6, 0x3ef445

    xor-int/2addr v5, v6

    const v6, 0x29e706c

    goto/16 :goto_0

    .line 6
    :cond_a
    sget-boolean v5, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v5, :cond_b

    :goto_2
    const-string v4, "\u06d8\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6bfb

    const v6, 0x356641dc

    xor-int/2addr v5, v6

    const v6, 0x76a33656

    goto/16 :goto_0

    .line 20
    :cond_b
    invoke-direct {v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4

    .line 12
    :sswitch_6
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-gez v4, :cond_c

    goto :goto_4

    :cond_c
    :goto_3
    const-string v4, "\u1a7a\u06e2"

    .line 1
    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7f31

    const v6, -0x39818946

    xor-int/2addr v5, v6

    const v6, 0x12bf2802

    goto/16 :goto_0

    :goto_4
    const-string v4, "\u06eb\u05a8"

    .line 2
    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x686d

    const v6, -0x67f16714

    xor-int/2addr v5, v6

    const v6, 0x2ea3ac09

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78e7f9bc -> :sswitch_6
        -0x756f73c6 -> :sswitch_5
        -0x6c743708 -> :sswitch_5
        -0x561743f1 -> :sswitch_4
        -0x53428917 -> :sswitch_3
        -0x29b2dc20 -> :sswitch_4
        -0x1b38c58b -> :sswitch_2
        -0x11f1dfed -> :sswitch_6
        -0xe8ca8ae -> :sswitch_1
        -0x74dfb83 -> :sswitch_1
        0x12cc86fe -> :sswitch_0
        0x41b1b4e6 -> :sswitch_2
        0x53f0bb84 -> :sswitch_0
        0x5bf13494 -> :sswitch_3
    .end sparse-switch

    :array_0
    .array-data 2
        0x4aas
        -0xac5s
        -0xaf4s
        -0xaffs
        -0xae8s
        -0xaf8s
        -0xab3s
        -0xafes
        -0xaf5s
        -0xab3s
        -0xab3s
        -0xaf2s
        -0xaf4s
        -0xafds
        -0xab3s
        -0xafds
        -0xafes
        -0xae7s
        -0xab3s
        -0xaf1s
        -0xaf8s
        -0xab3s
        -0xafds
        -0xae8s
        -0xaffs
        -0xaffs
        0x5d3s
        -0x5dfds
        -0x5de2s
        -0x5dfds
        -0x5de5s
        -0x5dees
        0x17d7s
        -0x4f43s
        -0x4f60s
        -0x4f43s
        -0x4f5bs
        -0x4f54s
        -0x4f5es
        -0x4f54s
        -0x4f50s
        0x459s
        -0x21e3s
        -0x2200s
        -0x21e3s
        -0x21fbs
        -0x21f4s
        -0x21fes
        -0x21f4s
        -0x21f0s
        0x11a3s
        0x1c55s
        0x1c48s
        0x1c55s
        0x1c4ds
        0x1c44s
        0x1c4as
        0x1c44s
        0x1c58s
        0x4a9s
        -0x57a2s
        -0x57bds
        -0x57a2s
        -0x57bas
        -0x57b1s
        -0x57bfs
        -0x57b1s
        -0x57ads
        0xa9fs
        -0x570ds
        -0x5712s
        -0x570ds
        -0x5715s
        -0x571es
        0x912s
        -0x1812s
        -0x180ds
        -0x1812s
        -0x180as
        -0x1801s
        -0x180fs
        -0x1801s
        -0x181ds
    .end array-data
.end method

.method public constructor <init>(Lbin/mt/plugin/api/PluginContext;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x353e6f98

    sget v2, Ll/ۖۗ;->᩶۫ۗ:I

    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u1a77\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3f85

    const v6, -0x2ccf98e2

    xor-int/2addr v5, v6

    const v6, -0x501e9de5

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x32b9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-gez v4, :cond_9

    goto :goto_1

    .line 16
    :sswitch_0
    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v4, :cond_7

    goto/16 :goto_4

    .line 15
    :sswitch_1
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    sget v4, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v4, :cond_b

    goto :goto_1

    .line 31
    :sswitch_2
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    goto :goto_1

    .line 10
    :sswitch_3
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 25
    :sswitch_4
    iput-object v0, p0, Ll/᩻֨ۘ;->ܰ:Ljava/util/ArrayList;

    .line 34
    iput-object p1, p0, Ll/᩻֨ۘ;->ۙ:Lbin/mt/plugin/api/PluginContext;

    return-void

    :sswitch_5
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v4

    if-ltz v4, :cond_0

    goto :goto_2

    :cond_0
    const-string v4, "\u1a76\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6e7f

    const v6, -0x18f2ea79

    xor-int/2addr v5, v6

    const v6, 0x174f1862

    goto :goto_0

    .line 32
    :sswitch_6
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_1

    :goto_1
    const-string v4, "\u06df\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xeb

    const v6, -0x17a00eb2

    xor-int/2addr v5, v6

    const v6, 0xeba89e7

    goto :goto_0

    :cond_1
    const-string v4, "\u06e2\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7b53

    const v6, 0x232d95bf

    xor-int/2addr v5, v6

    const v6, -0x4fd95423

    goto :goto_0

    :sswitch_7
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_2

    :goto_2
    const-string v4, "\u06e7\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3751

    const v6, 0x4ea8bee3    # 1.4155411E9f

    xor-int/2addr v5, v6

    const v6, -0xde5a0e3

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06df\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7263

    const v6, 0x18715fbb

    xor-int/2addr v5, v6

    const v6, 0x67cacb29

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v4

    if-gtz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06e4\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7907

    const v6, -0x6d2d59d7

    xor-int/2addr v5, v6

    const v6, -0x4ed1cec1

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u1a75\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1dc3

    const v6, 0x408d9dfe

    xor-int/2addr v5, v6

    const v6, 0x4c4e364d    # 5.4057268E7f

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v4, "\u06e7\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x77

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x46cb

    const v6, -0x2af5d7b7

    xor-int/2addr v5, v6

    const v6, -0x4cb6b9fe

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06e0\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1355

    const v6, 0x2f45c231

    xor-int/2addr v5, v6

    const v6, -0x57b35acd

    goto/16 :goto_0

    .line 32
    :sswitch_c
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v4

    if-ltz v4, :cond_8

    :cond_7
    :goto_3
    const-string v4, "\u06db\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xdb3

    const v6, 0x4bdfc5ef    # 2.9330398E7f

    xor-int/2addr v5, v6

    const v6, 0xf268674

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06da\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x36eb

    const v6, 0xa67c0b7

    xor-int/2addr v5, v6

    const v6, 0x2f2f4302

    goto/16 :goto_0

    .line 10
    :sswitch_d
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v4

    if-ltz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u05a1\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4cf5

    const v6, -0x579bda21

    xor-int/2addr v5, v6

    const v6, 0x14fca975

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d8\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4039

    const v6, 0xd7b15d0

    xor-int/2addr v5, v6

    const v6, 0x3818af21

    goto/16 :goto_0

    .line 25
    :sswitch_e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    sget-boolean v4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u0733\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x13bb

    const v6, 0x2599a0dd

    xor-int/2addr v5, v6

    const v6, 0x6c500cb5

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d6\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4605

    const v6, 0x17ed90c7

    xor-int/2addr v5, v6

    const v6, -0x1c30c420

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a30082a -> :sswitch_3
        -0x6b4ac8f0 -> :sswitch_9
        -0x69e41560 -> :sswitch_e
        -0x663f4170 -> :sswitch_3
        -0x53cc4429 -> :sswitch_2
        -0x509d6743 -> :sswitch_c
        -0x47aa8b23 -> :sswitch_b
        -0x3e8cde2b -> :sswitch_1
        -0x32b34c3f -> :sswitch_0
        -0x302e6566 -> :sswitch_a
        -0x28d0f84e -> :sswitch_4
        -0x1f59e01a -> :sswitch_8
        -0xf4f3740 -> :sswitch_6
        -0x8f3e3c5 -> :sswitch_2
        -0x2372806 -> :sswitch_b
        0x5374bfa -> :sswitch_4
        0x714f172 -> :sswitch_1
        0x8afd630 -> :sswitch_5
        0x1c7d2176 -> :sswitch_c
        0x1d4b02a9 -> :sswitch_6
        0x1dea2ca9 -> :sswitch_8
        0x25f73cb4 -> :sswitch_d
        0x263c720a -> :sswitch_9
        0x2ecd85b9 -> :sswitch_a
        0x46651b0d -> :sswitch_0
        0x4b26f542 -> :sswitch_d
        0x4be12ca9 -> :sswitch_7
        0x63335855 -> :sswitch_5
        0x6b00798b -> :sswitch_e
        0x714d9044 -> :sswitch_7
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

    const v7, 0x33f521a8

    sget v8, Ll/֫ܳ;->᩶ۧۛ:I

    sget v9, Ll/֨ۧ;->֫۠֡:I

    const-string v10, "\u06e0\u073a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x5b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xa9

    const v12, 0x375f48c9

    xor-int/2addr v11, v12

    const v12, 0x679d7ab5

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, -0x6583

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    move-object/from16 v13, p1

    const v4, 0x13bf6ea4

    add-int/2addr v4, v3

    .line 57
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v10

    if-ltz v10, :cond_a

    goto/16 :goto_6

    .line 8
    :sswitch_0
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v10

    if-eqz v10, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v13, p1

    goto/16 :goto_6

    :cond_1
    move-object/from16 v13, p1

    goto/16 :goto_5

    :sswitch_1
    sget v10, Ll/֫;->ܶܺ᩻:I

    if-gez v10, :cond_2

    :goto_2
    move-object/from16 v13, p1

    goto/16 :goto_9

    :cond_2
    :goto_3
    move-object/from16 v13, p1

    goto/16 :goto_8

    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget-boolean v10, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v10, :cond_0

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto :goto_2

    .line 59
    :sswitch_4
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    :sswitch_5
    return-void

    .line 132
    :sswitch_6
    new-instance v10, Ljava/lang/NullPointerException;

    sget-object v11, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    const/4 v12, 0x1

    .line 66
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v13

    if-nez v13, :cond_3

    goto :goto_3

    :cond_3
    const/16 v13, 0x9

    .line 3
    sget v14, Ll/۟;->ۨᩴۛ:I

    if-ltz v14, :cond_4

    goto :goto_2

    .line 132
    :cond_4
    invoke-static {v11, v12, v13, v6}, Ll/ۘۚ;->᩷᩺᩷([SIII)Ljava/lang/String;

    move-result-object v11

    sget-object v12, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    sget v13, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v13, :cond_5

    goto :goto_1

    :cond_5
    const/16 v13, 0xa

    const/16 v14, 0x10

    invoke-static {v12, v13, v14, v6}, Ll/ۘ֡;->۫ۡ۫([SIII)Ljava/lang/String;

    move-result-object v12

    .line 24
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v13

    if-gtz v13, :cond_6

    move-object/from16 v13, p1

    goto/16 :goto_7

    :cond_6
    move-object/from16 v13, p1

    .line 0
    invoke-static {v11, v13, v12}, Ll/ܽ۠ᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 132
    invoke-direct {v10, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v10

    :sswitch_7
    move-object/from16 v13, p1

    if-eqz p0, :cond_7

    const-string v10, "\u05a1\u1a7a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6ef7

    const v12, 0x1867b816

    xor-int/2addr v11, v12

    const v12, -0x5b0dc4ab

    goto/16 :goto_0

    :cond_7
    const-string v10, "\u06e8\u073a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x1f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1069

    const v12, -0x7d9c8790

    xor-int/2addr v11, v12

    const v12, 0x59bf1b18

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v13, p1

    const/16 v6, 0x536f

    goto :goto_4

    :sswitch_9
    move-object/from16 v13, p1

    const v6, 0xf56d

    :goto_4
    const-string v10, "\u06e4\u1a79"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x23b1

    const v12, -0x6d1b97d3

    xor-int/2addr v11, v12

    const v12, -0x1864e72c

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v13, p1

    mul-int v10, v2, v5

    sub-int v10, v4, v10

    if-ltz v10, :cond_8

    const-string v10, "\u1a73\u1a7b"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1573

    const v12, 0x25a51240

    xor-int/2addr v11, v12

    const v12, 0x432f3cf4

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u05ab\u073a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x5d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x400d

    const v12, 0x34b110df

    xor-int/2addr v11, v12

    const v12, -0x203d5c37

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v13, p1

    const v5, 0x8e34

    .line 95
    sget-boolean v10, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v10, :cond_9

    :goto_5
    const-string v10, "\u05a1\u06da"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x2d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2ebd

    const v12, 0x3ba3602a

    xor-int/2addr v11, v12

    const v12, -0x4e71d189

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u06e4\u06d8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x3b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x3dbb

    const v12, -0x766a3844

    xor-int/2addr v11, v12

    const v12, 0x66318687

    goto/16 :goto_0

    :goto_6
    const-string v10, "\u06e7\u0730"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7d05

    const v12, 0xbd47338

    xor-int/2addr v11, v12

    const v12, -0x3b62ee6f

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u0733\u05a1"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x1f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x735b

    const v12, 0x51d5cfbd

    xor-int/2addr v11, v12

    const v12, -0x2960487e

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v13, p1

    aget-short v2, v0, v1

    mul-int v3, v2, v2

    .line 7
    sget v10, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v10, :cond_b

    :goto_7
    const-string v10, "\u0736\u06d6"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2783

    const v12, 0x3de0bf46

    xor-int/2addr v11, v12

    const v12, 0x333fcefb

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u073f\u1a77"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x51

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2a21

    const v12, -0xbc17c82

    xor-int/2addr v11, v12

    const v12, -0x55460544

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v13, p1

    const/4 v1, 0x0

    .line 82
    sget v10, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v10, :cond_c

    goto :goto_9

    :cond_c
    const-string v10, "\u073d\u06e2"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x1f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x73f

    const v12, 0x5eebe667

    xor-int/2addr v11, v12

    const v12, -0x553eeabc

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v13, p1

    sget-object v0, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v10

    if-gtz v10, :cond_d

    :goto_8
    const-string v10, "\u073d\u0736"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6717

    const v12, -0x5c1f132e

    xor-int/2addr v11, v12

    const v12, 0x1df1f662

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u1a75\u1a7a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x73

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x18f7

    const v12, -0x33a2a709    # -5.8024924E7f

    xor-int/2addr v11, v12

    const v12, 0x6ea69d4f

    goto/16 :goto_0

    :sswitch_f
    move-object/from16 v13, p1

    .line 108
    sget-boolean v10, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v10, :cond_e

    :goto_9
    const-string v10, "\u073a\u1a75"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x21

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x313f

    const v12, -0x448fead3

    xor-int/2addr v11, v12

    const v12, -0x145b2af6

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u06d6\u0736"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x65

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x45a7

    const v12, -0x6d213935

    xor-int/2addr v11, v12

    const v12, -0x523180c7

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78bcae1e -> :sswitch_b
        -0x64270cb7 -> :sswitch_4
        -0x5ede1a2a -> :sswitch_3
        -0x57e29ecf -> :sswitch_9
        -0x52b3d11e -> :sswitch_a
        -0x524d220d -> :sswitch_8
        -0x4e091caf -> :sswitch_f
        -0x4811086e -> :sswitch_2
        -0x46a54c1d -> :sswitch_6
        -0x45340e64 -> :sswitch_4
        -0x3eb1253e -> :sswitch_5
        -0x2a5f2202 -> :sswitch_8
        -0x245b923a -> :sswitch_d
        -0x22beb7e5 -> :sswitch_1
        -0x19f1454d -> :sswitch_1
        -0x93ffdaa -> :sswitch_2
        -0x85cca28 -> :sswitch_6
        0x4dbef17 -> :sswitch_c
        0x66ce1a9 -> :sswitch_f
        0xcaafb6c -> :sswitch_7
        0x15582a5a -> :sswitch_e
        0x183ef4a9 -> :sswitch_a
        0x1ba8fd24 -> :sswitch_0
        0x295d4d75 -> :sswitch_d
        0x34281ca0 -> :sswitch_9
        0x4608a080 -> :sswitch_3
        0x5020c322 -> :sswitch_5
        0x568301f5 -> :sswitch_0
        0x63048ef2 -> :sswitch_c
        0x67c83098 -> :sswitch_e
        0x6c8aecb7 -> :sswitch_7
        0x7168177e -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method public final addHeader(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Header;
    .locals 20

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

    const/4 v13, 0x0

    const v14, 0x73d1e765

    sget v15, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v16, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v17, "\u06ec\u1a77"

    invoke-static/range {v17 .. v17}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v1, v17, v16

    mul-int/lit16 v1, v1, 0x2a27

    const v19, 0x13d11d0c

    xor-int v1, v1, v19

    const v19, 0x34fa0379

    xor-int v17, v17, v19

    move-object/from16 v19, v2

    move-object v12, v11

    move/from16 v18, v17

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, 0x73d1e765

    :goto_0
    xor-int v3, v17, v16

    mul-int/lit16 v3, v3, 0x7c45

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    move-object/from16 v1, p0

    .line 55
    new-instance v2, Ll/ܳ֨ۘ;

    .line 13
    invoke-direct {v2}, Ll/ۗ֨ۘ;-><init>()V

    sget-object v12, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 8
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_2

    .line 31
    :sswitch_0
    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v1, :cond_1

    :cond_0
    move-object/from16 v1, p0

    goto/16 :goto_2

    :cond_1
    move-object/from16 v1, p0

    goto/16 :goto_7

    .line 8
    :sswitch_1
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    move-object/from16 v1, p0

    goto/16 :goto_6

    :sswitch_2
    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_2

    :goto_1
    move-object/from16 v1, p0

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    goto :goto_1

    .line 24
    :sswitch_4
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    move-object/from16 v1, p0

    .line 56
    iget-object v0, v1, Ll/᩻֨ۘ;->ܰ:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v2

    :sswitch_6
    move-object/from16 v1, p0

    .line 13
    invoke-static {v12, v13, v14, v11}, Ll/֡᩶;->ۢۖ۟([SIII)Ljava/lang/String;

    move-result-object v3

    .line 14
    invoke-static {v0, v3}, Ll/᩻֨ۘ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iput-object v0, v2, Ll/ۗ֨ۘ;->᩹:Ljava/lang/CharSequence;

    .line 35
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v3, "\u0736\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v15

    xor-int v0, v3, v16

    mul-int/lit16 v0, v0, 0x7fcf

    const v18, -0x7133091a

    xor-int v0, v0, v18

    const v18, 0x7baedc69

    xor-int v18, v3, v18

    move v1, v0

    move-object/from16 v0, p1

    goto :goto_0

    :sswitch_7
    move-object/from16 v1, p0

    const/16 v13, 0x1b

    const/4 v14, 0x5

    sget-boolean v0, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v0, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v0, "\u06d9\u1a78"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x13

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x6723

    const v18, 0x7a4c2c73

    xor-int v3, v3, v18

    const v18, -0x10d3228f

    goto/16 :goto_8

    :goto_2
    const-string v0, "\u06d9\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x2681

    const v18, 0x260093dc

    xor-int v3, v3, v18

    const v18, -0x4585f7db

    goto/16 :goto_8

    :cond_5
    const-string v0, "\u06d9\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0x1c0d

    const v18, -0x347590a5    # -1.814495E7f

    xor-int v3, v3, v18

    const v18, 0x5b369306

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v1, p0

    const/16 v0, 0x3c45

    const/16 v11, 0x3c45

    goto :goto_3

    :sswitch_9
    move-object/from16 v1, p0

    const v0, 0xa277

    const v11, 0xa277

    :goto_3
    const-string v0, "\u1a79\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0xf

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x4ed7

    const v18, -0x62bfc93b

    xor-int v3, v3, v18

    const v18, -0x771a3ea0

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v1, p0

    add-int/lit8 v0, v10, 0x1

    sub-int v0, v8, v0

    if-ltz v0, :cond_6

    const-string v0, "\u06ec\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x2573

    const v18, -0x73010f65

    xor-int v3, v3, v18

    const v18, 0x3501c6d3

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u0733\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x33

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x77bd

    const v18, -0x54ecb13

    xor-int v3, v3, v18

    const v18, 0x4b0c0ce2    # 9178338.0f

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v1, p0

    mul-int v10, v5, v9

    .line 41
    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    const-string v0, "\u1a73\u06d9"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x5f

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0x2387

    const v18, 0x6e12e302

    xor-int v3, v3, v18

    const v18, -0x6b46b872

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v1, p0

    mul-int v8, v7, v7

    const/4 v9, 0x2

    .line 50
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v0

    if-gtz v0, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u1a78\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x5ad5

    const v18, -0x1ce6e57

    xor-int v3, v3, v18

    const v18, 0x792b93c5    # 5.5679993E34f

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v1, p0

    add-int v7, v5, v6

    .line 15
    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_9

    goto :goto_5

    :cond_9
    const-string v0, "\u1a79\u1a78"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x770f

    const v18, -0x315b466b

    xor-int v3, v3, v18

    const v18, -0x29dfd5e2

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v1, p0

    aget-short v5, v19, v4

    const/4 v6, 0x1

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v0

    if-gtz v0, :cond_a

    :goto_4
    const-string v0, "\u06e8\u06d9"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x77d1

    const v18, -0x61d27d45

    xor-int v3, v3, v18

    const v18, -0x21ecdbda

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u05a1\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x33

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x719d

    const v18, 0x1d1f50a4

    xor-int v3, v3, v18

    const v18, 0x703cb576

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v1, p0

    const/16 v4, 0x1a

    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_b

    :goto_5
    const-string v0, "\u06d9\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x30a5

    const v18, -0x53a7e854

    xor-int v3, v3, v18

    const v18, -0x6e992d87

    goto/16 :goto_8

    :cond_b
    const-string v0, "\u1a7a\u06e4"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x61

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x157b

    const v18, 0x14fd3aaa

    xor-int v3, v3, v18

    const v18, -0x662ca166

    goto :goto_8

    :sswitch_10
    move-object/from16 v1, p0

    sget-object v19, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 13
    sget v0, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v0, :cond_c

    :goto_6
    const-string v0, "\u06da\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x67

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x162d

    const v18, -0x23485338

    xor-int v3, v3, v18

    const v18, 0x7aebc712

    goto :goto_8

    :cond_c
    const-string v0, "\u0733\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x3

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0x2461

    const v18, 0x6bbdf9cb

    xor-int v3, v3, v18

    const v18, 0x7b489859

    goto :goto_8

    :sswitch_11
    move-object/from16 v1, p0

    sget v0, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v0, :cond_d

    :goto_7
    const-string v0, "\u1a78\u06da"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x1f

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x6c61

    const v18, -0x38753a8a

    xor-int v3, v3, v18

    const v18, -0xd1adfc0

    goto :goto_8

    :cond_d
    const-string v0, "\u1a79\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x4b

    xor-int v3, v0, v15

    mul-int/lit8 v3, v3, -0x3b

    const v18, 0x2df66e3f

    xor-int v3, v3, v18

    const v18, -0x72afbdb2

    :goto_8
    xor-int v18, v0, v18

    move-object/from16 v0, p1

    move v1, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fb0ced2 -> :sswitch_a
        -0x7849d404 -> :sswitch_1
        -0x6d85025d -> :sswitch_0
        -0x6793672f -> :sswitch_c
        -0x60fb1b30 -> :sswitch_2
        -0x4a3362e8 -> :sswitch_e
        -0x458cc400 -> :sswitch_0
        -0x326fb123 -> :sswitch_e
        -0x2fdb3a3b -> :sswitch_3
        -0x22779b7b -> :sswitch_6
        -0x1cd86951 -> :sswitch_f
        -0x1addec2b -> :sswitch_1
        -0x1893a435 -> :sswitch_10
        -0x15fd64f0 -> :sswitch_11
        -0x131423f4 -> :sswitch_10
        -0xb3f6c3e -> :sswitch_f
        -0xb077971 -> :sswitch_d
        -0xaf932d6 -> :sswitch_4
        -0x80f4ac5 -> :sswitch_d
        -0x2c9af04 -> :sswitch_c
        -0x2bf2cef -> :sswitch_b
        -0x9dc964 -> :sswitch_5
        0x7405f4 -> :sswitch_2
        0x1184c5a8 -> :sswitch_11
        0x1e142e5e -> :sswitch_9
        0x2194662c -> :sswitch_8
        0x2d53ef27 -> :sswitch_a
        0x32f511dc -> :sswitch_7
        0x368daefd -> :sswitch_8
        0x5c569f78 -> :sswitch_b
        0x5ed00ddf -> :sswitch_5
        0x6a2e4540 -> :sswitch_6
        0x70261844 -> :sswitch_3
        0x7ca9c62e -> :sswitch_9
        0x7e487ff2 -> :sswitch_7
        0x7e72d6db -> :sswitch_4
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

    const v15, 0x66a0864a

    sget v16, Ll/ۖۗ;->᩶۫ۗ:I

    sget v17, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v18, "\u06dc\u06d9"

    invoke-static/range {v18 .. v18}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v18

    add-int v18, v18, v16

    mul-int/lit8 v18, v18, -0x7f

    xor-int v2, v18, v17

    mul-int/lit16 v2, v2, 0x2fc7

    const v20, -0x28289fba

    xor-int v2, v2, v20

    const v20, -0x24c2e36a

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

    const v18, 0x66a0864a

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v5, v18, v17

    mul-int/lit16 v5, v5, 0x398d

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v2, v5

    xor-int v18, v19, v2

    sparse-switch v18, :sswitch_data_0

    move-object/from16 v2, p0

    const v1, 0xb0c9

    const v11, 0xb0c9

    goto/16 :goto_4

    .line 8
    :sswitch_0
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v2, :cond_1

    :cond_0
    move-object/from16 v2, p0

    goto/16 :goto_3

    :cond_1
    move-object/from16 v2, p0

    goto/16 :goto_7

    .line 15
    :sswitch_1
    sget v2, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v2, :cond_0

    goto :goto_2

    .line 25
    :sswitch_2
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v2

    if-gtz v2, :cond_2

    :goto_1
    move-object/from16 v2, p0

    goto/16 :goto_5

    :cond_2
    :goto_2
    const-string v2, "\u05a8\u06d9"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v5, v2, v16

    mul-int/lit16 v5, v5, -0x57a1

    const v19, 0x60598394

    xor-int v5, v5, v19

    const v19, -0x5ffa01fa

    xor-int v19, v2, v19

    goto/16 :goto_9

    .line 12
    :sswitch_3
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    goto :goto_1

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    const/4 v0, 0x0

    return-object v0

    .line 21
    :sswitch_5
    iput-object v0, v3, Ll/ۗ֨ۘ;->᩹:Ljava/lang/CharSequence;

    .line 22
    iput-object v1, v3, Ll/ۗ֨ۘ;->ۨ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 63
    iget-object v0, v2, Ll/᩻֨ۘ;->ܰ:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :sswitch_6
    move-object/from16 v2, p0

    .line 20
    invoke-static {v1, v4}, Ll/᩻֨ۘ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    sget v5, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v5, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string v5, "\u1a7a\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v16

    xor-int v1, v5, v17

    mul-int/lit16 v1, v1, -0x1d8d

    const v19, -0x30628ace

    xor-int v1, v1, v19

    const v19, -0x48cb834c

    xor-int v19, v5, v19

    move v2, v1

    move-object/from16 v1, p2

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v2, p0

    const/16 v1, 0x26

    const/4 v4, 0x3

    .line 19
    invoke-static {v15, v1, v4, v11}, Ll/ۧ;->۫֨۠([SIII)Ljava/lang/String;

    move-result-object v4

    .line 61
    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v1, :cond_4

    :goto_3
    const-string v1, "\u06d9\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x7f33

    const v19, 0x53f80e0b

    xor-int v5, v5, v19

    const v19, 0x309678e0

    goto/16 :goto_8

    :cond_4
    const-string v1, "\u06ec\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x2f

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x1617

    const v19, -0x333fba38

    xor-int v5, v5, v19

    const v19, -0x58c0cf7b

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v2, p0

    .line 18
    invoke-static {v12, v13, v14, v11}, Ll/֡ܽ;->ۗܺۛ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Ll/᩻֨ۘ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v15, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    sget-boolean v1, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v1, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u0733\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x33f9

    const v19, -0x7b8efc9f

    xor-int v5, v5, v19

    const v19, -0x5dec4026

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v2, p0

    const/16 v13, 0x21

    const/4 v14, 0x5

    sget-boolean v1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v1, :cond_6

    goto/16 :goto_7

    :cond_6
    const-string v1, "\u1a75\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x5397

    const v19, -0x6da6858c

    xor-int v5, v5, v19

    const v19, 0x6606868

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v2, p0

    .line 62
    new-instance v3, Ll/ܳ֨ۘ;

    .line 18
    invoke-direct {v3}, Ll/ۗ֨ۘ;-><init>()V

    sget-object v12, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 52
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v1

    if-eqz v1, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u05ab\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x69

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x71b

    const v19, 0x5ccf3611

    xor-int v5, v5, v19

    const v19, -0x6a898f9d

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v2, p0

    const v1, 0xc2ea

    const v11, 0xc2ea

    :goto_4
    const-string v1, "\u06d6\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x1ed3

    const v19, -0x214b5035

    xor-int v5, v5, v19

    const v19, 0x61a97895

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v2, p0

    add-int/lit8 v1, v10, 0x1

    sub-int v1, v8, v1

    if-gez v1, :cond_8

    const-string v1, "\u06e4\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x11

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x24ad

    const v19, -0x78de56d2

    xor-int v5, v5, v19

    const v19, 0x3ec45d65

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u1a76\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x1d83

    const v19, 0x20ae097d

    xor-int v5, v5, v19

    const v19, -0x2ad6b738

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v2, p0

    mul-int v10, v6, v9

    .line 54
    sget-boolean v1, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v1, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v1, "\u06e7\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x7907

    const v19, -0x7fb9ca8

    xor-int v5, v5, v19

    const v19, 0x5bf251f

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v2, p0

    add-int v1, v6, v7

    mul-int v8, v1, v1

    const/4 v9, 0x2

    .line 60
    sget v1, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v1, :cond_a

    :goto_5
    const-string v1, "\u0733\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x57

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x5acb

    const v19, -0x116af4e9

    xor-int v5, v5, v19

    const v19, -0x5ffd96d5

    goto/16 :goto_8

    :cond_a
    const-string v1, "\u06e7\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x7f73

    const v19, 0x12cede85

    xor-int v5, v5, v19

    const v19, 0x12d7f489

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v2, p0

    const/16 v1, 0x20

    aget-short v6, v20, v1

    const/4 v7, 0x1

    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_b

    goto :goto_7

    :cond_b
    const-string v1, "\u06e1\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x2ff

    const v19, 0x1e2838f3

    xor-int v5, v5, v19

    const v19, 0x2b9634c2

    goto :goto_8

    :sswitch_10
    move-object/from16 v2, p0

    sget-object v20, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 25
    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v1, :cond_c

    :goto_6
    const-string v1, "\u1a79\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0xe0b

    const v19, 0x499abc85

    xor-int v5, v5, v19

    const v19, 0x4bfe802f    # 3.3357918E7f

    goto :goto_8

    :cond_c
    const-string v1, "\u1a7b\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x51

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x7f9

    const v19, -0x2851a53c

    xor-int v5, v5, v19

    const v19, -0x4fe6458b

    goto :goto_8

    :sswitch_11
    move-object/from16 v2, p0

    sget-boolean v1, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v1, :cond_d

    :goto_7
    const-string v1, "\u1a7b\u06e0"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x71

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x22ff

    const v19, -0x52e0f683

    xor-int v5, v5, v19

    const v19, -0x4928e0e

    goto :goto_8

    :cond_d
    const-string v1, "\u1a7a\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0xe65

    const v19, 0x1e344a9c

    xor-int v5, v5, v19

    const v19, 0x675940b5

    :goto_8
    xor-int v19, v1, v19

    move-object/from16 v1, p2

    :goto_9
    move v2, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c713ce2 -> :sswitch_9
        -0x78cc8292 -> :sswitch_f
        -0x7461155f -> :sswitch_0
        -0x739a6720 -> :sswitch_1
        -0x65d09794 -> :sswitch_2
        -0x5f83ce92 -> :sswitch_10
        -0x5e350cd5 -> :sswitch_a
        -0x5b63e3f7 -> :sswitch_11
        -0x5a7e845f -> :sswitch_4
        -0x58c6d44c -> :sswitch_10
        -0x3d992282 -> :sswitch_d
        -0x35f198cb -> :sswitch_9
        -0x2af1f2fd -> :sswitch_c
        -0x2aebd69c -> :sswitch_b
        -0x292d583a -> :sswitch_8
        -0x28f797bd -> :sswitch_d
        -0x198d2368 -> :sswitch_1
        -0x140a40b3 -> :sswitch_e
        -0x1252f311 -> :sswitch_0
        -0xf2c48c6 -> :sswitch_6
        -0xf0a0d0b -> :sswitch_2
        0x8145536 -> :sswitch_6
        0x8efeb3d -> :sswitch_a
        0x17d655a3 -> :sswitch_3
        0x1ae4492a -> :sswitch_b
        0x23dd3c80 -> :sswitch_c
        0x26726344 -> :sswitch_7
        0x45b816eb -> :sswitch_5
        0x48ae2b90 -> :sswitch_f
        0x4c2e6e7f -> :sswitch_4
        0x5570aa7a -> :sswitch_11
        0x5969149b -> :sswitch_8
        0x62700a6d -> :sswitch_7
        0x6c8938fe -> :sswitch_e
        0x70b4bcf8 -> :sswitch_3
        0x775417bc -> :sswitch_5
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

    const v13, 0x36090cb2

    sget v14, Ll/ۖܽ;->ܳ۠᩹:I

    sget v15, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v16, "\u06e8\u06d7"

    invoke-static/range {v16 .. v16}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    mul-int/lit8 v16, v16, -0x3f

    xor-int v2, v16, v15

    mul-int/lit16 v2, v2, 0x26f1

    const v18, -0x83e81c1

    xor-int v2, v2, v18

    const v18, -0x5ad0371e

    xor-int v16, v16, v18

    move-object/from16 v18, v5

    move-object v11, v10

    move/from16 v17, v16

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, 0x36090cb2

    move-object v5, v4

    move-object v10, v9

    const/4 v4, 0x0

    const/4 v9, 0x0

    :goto_0
    xor-int v6, v16, v15

    mul-int/lit16 v6, v6, -0x5a9b

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v2, v6

    xor-int v16, v17, v2

    sparse-switch v16, :sswitch_data_0

    .line 77
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    goto :goto_1

    .line 54
    :sswitch_0
    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v2, :cond_1

    :cond_0
    move-object/from16 v2, p0

    goto/16 :goto_4

    :cond_1
    move-object/from16 v2, p0

    goto/16 :goto_6

    .line 73
    :sswitch_1
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    sget-boolean v2, Ll/֨ۖ;->۫ۗۜ:Z

    if-eqz v2, :cond_0

    :goto_1
    move-object/from16 v2, p0

    goto/16 :goto_3

    .line 74
    :sswitch_2
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v2

    if-gtz v2, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    goto/16 :goto_2

    .line 61
    :sswitch_3
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    const/4 v0, 0x0

    return-object v0

    .line 25
    :sswitch_4
    iput-object v0, v3, Ll/ۗ֨ۘ;->᩹:Ljava/lang/CharSequence;

    .line 26
    iput-object v1, v3, Ll/ۗ֨ۘ;->ۨ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 84
    iget-object v0, v2, Ll/᩻֨ۘ;->ܰ:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/ۖۗ;->ۨۜܰ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :sswitch_5
    move-object/from16 v2, p0

    .line 23
    invoke-static {v11, v12, v13, v9}, Ll/֫ᩳ;->᩵ۡ᩻([SIII)Ljava/lang/String;

    move-result-object v6

    .line 24
    invoke-static {v1, v6}, Ll/᩻֨ۘ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    sget v6, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v6, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v6, "\u073d\u06d7"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v14

    xor-int v1, v6, v15

    mul-int/lit16 v1, v1, 0x4d59

    const v17, 0x6a8a055e

    xor-int v1, v1, v17

    const v17, 0x7be8d0ce

    xor-int v17, v6, v17

    move v2, v1

    move-object/from16 v1, p2

    goto :goto_0

    :sswitch_6
    move-object/from16 v2, p0

    .line 23
    sget-object v11, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    const/16 v12, 0x2f

    const/4 v13, 0x3

    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v1

    if-gtz v1, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v1, "\u073a\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, 0x2bff

    const v17, 0x731d0397

    xor-int v6, v6, v17

    const v17, -0x5ee7a074

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v2, p0

    invoke-static {v0, v5}, Ll/᩻֨ۘ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    sget-boolean v1, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v1, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u1a7a\u1a78"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, 0x7bcb

    const v17, 0x7907cebd

    xor-int v6, v6, v17

    const v17, -0x12e1caba

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v2, p0

    const/16 v1, 0x2a

    const/4 v5, 0x5

    .line 19
    invoke-static {v10, v1, v5, v9}, Ll/֨ۖ;->ۨۜۧ([SIII)Ljava/lang/String;

    move-result-object v5

    .line 21
    sget v1, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v1, :cond_6

    :goto_2
    const-string v1, "\u05a1\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x29

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x6759

    const v17, 0x524e3ad5

    xor-int v6, v6, v17

    const v17, -0x84537e4

    goto/16 :goto_8

    :cond_6
    const-string v1, "\u06e0\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, 0x2627

    const v17, 0x76ebf670

    xor-int v6, v6, v17

    const v17, 0x50260a94

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v2, p0

    .line 19
    iput v4, v3, Ll/֫֨ۘ;->ۜ:I

    sget-object v10, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 15
    sget-boolean v1, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v1, :cond_7

    :goto_3
    const-string v1, "\u073d\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, -0x5ef7

    const v17, 0x56508542

    xor-int v6, v6, v17

    const v17, -0x5a255136

    goto/16 :goto_8

    :cond_7
    const-string v1, "\u073f\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x63

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, 0x3433

    const v17, -0x73a12468

    xor-int v6, v6, v17

    const v17, 0x2a8a8f39

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v2, p0

    .line 83
    new-instance v3, Ll/֫֨ۘ;

    .line 22
    invoke-direct {v3}, Ll/ۗ֨ۘ;-><init>()V

    const/4 v4, 0x1

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v1

    if-nez v1, :cond_8

    :goto_4
    const-string v1, "\u06e1\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, -0x431

    const v17, 0x5f404be7

    xor-int v6, v6, v17

    const v17, 0x1534d160

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u06e0\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, -0x688b

    const v17, 0x4feb4e5c    # 7.895562E9f

    xor-int v6, v6, v17

    const v17, -0x2190138e

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v2, p0

    const v1, 0xa12f

    const v9, 0xa12f

    goto :goto_5

    :sswitch_c
    move-object/from16 v2, p0

    const v1, 0xde69

    const v9, 0xde69

    :goto_5
    const-string v1, "\u06e2\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x75df

    const v17, 0x1eb4d10

    xor-int v6, v6, v17

    const v17, -0x6363a01c

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v2, p0

    const v1, 0x8f9e

    mul-int v1, v1, v7

    sub-int/2addr v1, v8

    if-lez v1, :cond_9

    const-string v1, "\u06e2\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, -0x3d57

    const v17, -0x1dc2b5e2

    xor-int v6, v6, v17

    const v17, 0x7b67de5b

    goto/16 :goto_8

    :cond_9
    const-string v1, "\u06e2\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x13

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x7c89

    const v17, -0x61b86a04

    xor-int v6, v6, v17

    const v17, -0x3418dd0a    # -3.0295532E7f

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v2, p0

    mul-int v1, v7, v7

    const v6, 0x14247961

    add-int v8, v1, v6

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_6

    :cond_a
    const-string v1, "\u1a78\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, 0x4a33

    const v17, -0x6d807a48

    xor-int v6, v6, v17

    const v17, -0x5c972cc7

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v2, p0

    const/16 v1, 0x29

    aget-short v7, v18, v1

    .line 13
    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v1, :cond_b

    goto :goto_7

    :cond_b
    const-string v1, "\u06eb\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, 0x7627

    const v17, 0x5940554a

    xor-int v6, v6, v17

    const v17, -0x1b1ce6a4

    goto :goto_8

    :sswitch_10
    move-object/from16 v2, p0

    sget-object v18, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 71
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v1

    if-gtz v1, :cond_c

    :goto_6
    const-string v1, "\u05a8\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x27c7

    const v17, 0x30da8c7d

    xor-int v6, v6, v17

    const v17, 0x7b6d36cd

    goto :goto_8

    :cond_c
    const-string v1, "\u06e7\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, -0x7c77

    const v17, 0x682256aa

    xor-int v6, v6, v17

    const v17, 0x40415aa

    goto :goto_8

    :sswitch_11
    move-object/from16 v2, p0

    .line 47
    sget-boolean v1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v1, :cond_d

    :goto_7
    const-string v1, "\u1a79\u1a7a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x4f

    xor-int v6, v1, v14

    mul-int/lit16 v6, v6, -0x192d

    const v17, 0x67c54b79

    xor-int v6, v6, v17

    const v17, 0x4b6485a9    # 1.4976425E7f

    goto :goto_8

    :cond_d
    const-string v1, "\u06df\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x1f4b

    const v17, -0x31915bf0    # -1.00093235E9f

    xor-int v6, v6, v17

    const v17, 0x755b77d0

    :goto_8
    xor-int v17, v1, v17

    move-object/from16 v1, p2

    move v2, v6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cf80129 -> :sswitch_a
        -0x74998723 -> :sswitch_0
        -0x6f248848 -> :sswitch_b
        -0x6261c689 -> :sswitch_11
        -0x602c4027 -> :sswitch_a
        -0x4e9a1106 -> :sswitch_f
        -0x44656f9d -> :sswitch_7
        -0x417c3ca9 -> :sswitch_5
        -0x38868bad -> :sswitch_d
        -0x2fff34d8 -> :sswitch_7
        -0x24d645d0 -> :sswitch_11
        -0x21e1d58e -> :sswitch_3
        -0x13ce218b -> :sswitch_4
        -0x104743f8 -> :sswitch_f
        -0x5e58e19 -> :sswitch_b
        -0x487413d -> :sswitch_e
        -0x1778788 -> :sswitch_2
        0x13677b5 -> :sswitch_10
        0x4dc3de1 -> :sswitch_2
        0x6a10f15 -> :sswitch_6
        0x13a49ed8 -> :sswitch_8
        0x259d9e8a -> :sswitch_5
        0x2f744557 -> :sswitch_e
        0x306c32a4 -> :sswitch_8
        0x35d3451d -> :sswitch_9
        0x3abdb398 -> :sswitch_9
        0x48d7e957 -> :sswitch_d
        0x4a8bd771 -> :sswitch_c
        0x4e663c98 -> :sswitch_3
        0x5f6faaee -> :sswitch_0
        0x64734dce -> :sswitch_4
        0x64f6fab7 -> :sswitch_1
        0x6ac0d637 -> :sswitch_10
        0x6c9587ee -> :sswitch_c
        0x73c0e8d5 -> :sswitch_1
        0x7c1747eb -> :sswitch_6
    .end sparse-switch
.end method

.method public final addList(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$List;
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

    const v15, 0x5a32a14c

    sget v16, Ll/֨ܰ;->ۢ᩷۟:I

    sget v17, Ll/ۗ۬;->ۤᩴ᩻:I

    const-string v18, "\u06d6\u06d7"

    invoke-static/range {v18 .. v18}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    xor-int v2, v18, v17

    mul-int/lit16 v2, v2, -0x2047

    const v20, 0x64ff90b1

    xor-int v2, v2, v20

    const v20, 0x6769d75f

    xor-int v18, v18, v20

    move-object/from16 v20, v4

    move-object v13, v12

    move/from16 v19, v18

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, 0x5a32a14c

    move-object v4, v3

    move-object v12, v11

    const/4 v3, 0x0

    const/4 v11, 0x0

    :goto_0
    xor-int v5, v18, v17

    mul-int/lit16 v5, v5, -0x482d

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v2, v5

    xor-int v18, v19, v2

    sparse-switch v18, :sswitch_data_0

    move-object/from16 v2, p0

    .line 47
    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_d

    goto/16 :goto_6

    :sswitch_0
    sget-boolean v2, Ll/֫ܶ;->ۧ᩵۫:Z

    if-eqz v2, :cond_0

    :goto_1
    move-object/from16 v2, p0

    goto/16 :goto_4

    :cond_0
    const-string v2, "\u1a75\u0736"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v5, v2, v17

    mul-int/lit16 v5, v5, 0x30ff

    const v19, 0x73ae664e

    xor-int v5, v5, v19

    const v19, 0x13bcfe0

    xor-int v19, v2, v19

    goto/16 :goto_8

    .line 44
    :sswitch_1
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v2

    if-ltz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v2, p0

    goto/16 :goto_5

    .line 92
    :sswitch_2
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v2

    if-gez v2, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    const/4 v0, 0x0

    return-object v0

    .line 23
    :sswitch_5
    iput-object v0, v3, Ll/ۗ֨ۘ;->᩹:Ljava/lang/CharSequence;

    .line 24
    iput-object v1, v3, Ll/ۗ֨ۘ;->ۨ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 98
    iget-object v0, v2, Ll/᩻֨ۘ;->ܰ:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :sswitch_6
    move-object/from16 v2, p0

    .line 21
    invoke-static {v13, v14, v15, v11}, Ll/ۖۛ;->ܿۤ۟([SIII)Ljava/lang/String;

    move-result-object v5

    .line 22
    invoke-static {v1, v5}, Ll/᩻֨ۘ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v5, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v5, "\u06d8\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v17

    xor-int v1, v5, v16

    mul-int/lit16 v1, v1, 0x5103

    const v19, -0x580bb942

    xor-int v1, v1, v19

    const v19, 0x1bb000f8

    xor-int v19, v5, v19

    move v2, v1

    move-object/from16 v1, p2

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v2, p0

    .line 21
    sget-object v13, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    const/16 v14, 0x38

    const/4 v15, 0x3

    .line 62
    sget-boolean v1, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v1, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u1a74\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x73

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x51b7

    const v19, -0x7407468e

    xor-int v5, v5, v19

    const v19, -0x675f4e8c

    goto/16 :goto_7

    :sswitch_8
    move-object/from16 v2, p0

    const/16 v1, 0x33

    const/4 v5, 0x5

    .line 18
    invoke-static {v12, v1, v5, v11}, Ll/֫;->ۗܿܶ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-static {v0, v1}, Ll/᩻֨ۘ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v1, "\u1a7b\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x75

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x3913

    const v19, -0x14a335f4

    xor-int v5, v5, v19

    const v19, -0x5d4775a9

    goto/16 :goto_7

    :sswitch_9
    move-object/from16 v2, p0

    .line 18
    iput-object v4, v3, Ll/ۙ۬ۘ;->ۘ:Ljava/util/ArrayList;

    sget-object v12, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 84
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v1

    if-gtz v1, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v1, "\u1a73\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x1b4f

    const v19, 0x5f7da538

    xor-int v5, v5, v19

    const v19, -0x6667253b

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v2, p0

    .line 97
    new-instance v3, Ll/ۙ۬ۘ;

    .line 20
    invoke-direct {v3}, Ll/ۗ֨ۘ;-><init>()V

    .line 18
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v1

    if-gtz v1, :cond_7

    :goto_2
    const-string v1, "\u05ab\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x23

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x6057

    const v19, 0x4ae1a6c0    # 7394144.0f

    xor-int v5, v5, v19

    const v19, -0x3ff97285

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u1a76\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x52f7

    const v19, 0x1922d98c

    xor-int v5, v5, v19

    const v19, 0x37671ee3

    goto/16 :goto_7

    :sswitch_b
    move-object/from16 v2, p0

    const/16 v1, 0x57e0

    const/16 v11, 0x57e0

    goto :goto_3

    :sswitch_c
    move-object/from16 v2, p0

    const/16 v1, 0x1c21

    const/16 v11, 0x1c21

    :goto_3
    const-string v1, "\u06e0\u1a79"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x4d

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x167b

    const v19, -0x1ccc7b43

    xor-int v5, v5, v19

    const v19, -0x32365de9

    goto/16 :goto_7

    :sswitch_d
    move-object/from16 v2, p0

    add-int/lit8 v1, v10, 0x1

    sub-int v1, v8, v1

    if-ltz v1, :cond_8

    const-string v1, "\u0736\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x7

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x59bb

    const v19, 0x768d160f

    xor-int v5, v5, v19

    const v19, 0x67fdd7c1

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u06ec\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x1339

    const v19, 0x749b3234

    xor-int v5, v5, v19

    const v19, 0x4dcd0094

    goto/16 :goto_7

    :sswitch_e
    move-object/from16 v2, p0

    mul-int v10, v6, v9

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v1

    if-ltz v1, :cond_9

    goto/16 :goto_5

    :cond_9
    const-string v1, "\u1a78\u1a73"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0xd

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x6c1f

    const v19, -0x5013110

    xor-int v5, v5, v19

    const v19, 0xa71d98c

    goto/16 :goto_7

    :sswitch_f
    move-object/from16 v2, p0

    add-int v1, v6, v7

    mul-int v8, v1, v1

    const/4 v9, 0x2

    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_a

    goto :goto_5

    :cond_a
    const-string v1, "\u0730\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x3643

    const v19, 0xd677a74

    xor-int v5, v5, v19

    const v19, 0x7309c0c0

    goto/16 :goto_7

    :sswitch_10
    move-object/from16 v2, p0

    const/16 v1, 0x32

    aget-short v6, v20, v1

    const/4 v7, 0x1

    .line 65
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v1

    if-nez v1, :cond_b

    :goto_4
    const-string v1, "\u06d6\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x7

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x2429

    const v19, -0x27b9a912

    xor-int v5, v5, v19

    const v19, -0x4c072a36

    goto/16 :goto_7

    :cond_b
    const-string v1, "\u1a73\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x5d

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x45b

    const v19, -0x643b8d84

    xor-int v5, v5, v19

    const v19, 0x3a479b14    # 7.614356E-4f

    goto :goto_7

    :sswitch_11
    move-object/from16 v2, p0

    sget-object v20, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 22
    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v1, :cond_c

    :goto_5
    const-string v1, "\u073a\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x5d

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x72d1

    const v19, 0x25f21c9e    # 4.19997E-16f

    xor-int v5, v5, v19

    const v19, 0x144e1a6a

    goto :goto_7

    :cond_c
    const-string v1, "\u0733\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x1f

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x3a91

    const v19, -0x4a86c73c

    xor-int v5, v5, v19

    const v19, 0x278c0683

    goto :goto_7

    :goto_6
    const-string v1, "\u073a\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0xd

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x4a81

    const v19, 0x296566e5

    xor-int v5, v5, v19

    const v19, -0x60829fa6

    goto :goto_7

    :cond_d
    const-string v1, "\u06e2\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x6cef

    const v19, -0x35cac291

    xor-int v5, v5, v19

    const v19, 0x4dcc172

    :goto_7
    xor-int v19, v1, v19

    move-object/from16 v1, p2

    :goto_8
    move v2, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7abecee1 -> :sswitch_b
        -0x7793c9e2 -> :sswitch_9
        -0x6999cf8f -> :sswitch_9
        -0x63d43bd6 -> :sswitch_11
        -0x5fdec4f9 -> :sswitch_a
        -0x58d78528 -> :sswitch_10
        -0x54100ea0 -> :sswitch_10
        -0x4da4ce94 -> :sswitch_3
        -0x483a0923 -> :sswitch_6
        -0x472a741d -> :sswitch_f
        -0x454d042c -> :sswitch_5
        -0x3d0c67b5 -> :sswitch_e
        -0x3cd68433 -> :sswitch_0
        -0x3b625fc3 -> :sswitch_6
        -0x33626df5 -> :sswitch_5
        -0x3271e806 -> :sswitch_8
        -0x31e6bff2 -> :sswitch_4
        -0x2681ce08 -> :sswitch_d
        -0x1a144092 -> :sswitch_c
        -0x19d7420d -> :sswitch_8
        0x9e99ce9 -> :sswitch_a
        0xcba7893 -> :sswitch_e
        0x29f188d8 -> :sswitch_3
        0x2c1211e9 -> :sswitch_c
        0x327e80b4 -> :sswitch_b
        0x36c110e7 -> :sswitch_7
        0x447c22e7 -> :sswitch_1
        0x4820a88b -> :sswitch_4
        0x5b0b003b -> :sswitch_d
        0x5ce4a2cf -> :sswitch_f
        0x6f4bba74 -> :sswitch_0
        0x70e944e3 -> :sswitch_2
        0x779bb6df -> :sswitch_2
        0x7b6f400d -> :sswitch_11
        0x7bf2f09e -> :sswitch_7
        0x7e8ba966 -> :sswitch_1
    .end sparse-switch
.end method

.method public final addSwitch(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Switch;
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

    const v12, -0x7febf541

    sget v13, Ll/֨ܶ;->ۛۛۛ:I

    sget v14, Ll/֨᩺;->۬᩺ܰ:I

    const-string v15, "\u06e8\u073d"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    mul-int/lit8 v15, v15, -0x6f

    xor-int v2, v15, v13

    mul-int/lit16 v2, v2, -0x4473

    const v17, -0x6a9bd6ff

    xor-int v2, v2, v17

    const v17, 0x61b9d95e

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

    const v15, -0x7febf541

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, -0x5d33

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v2, v15

    xor-int v15, v16, v2

    sparse-switch v15, :sswitch_data_0

    .line 28
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v1

    if-eqz v1, :cond_d

    goto/16 :goto_4

    .line 45
    :sswitch_0
    sget-boolean v2, Ll/ۘۛ;->ۧᩴ۠:Z

    if-eqz v2, :cond_b

    goto/16 :goto_2

    .line 85
    :sswitch_1
    sget v2, Ll/֡᩶;->ۗ֨ܺ:I

    if-lez v2, :cond_9

    goto/16 :goto_2

    .line 65
    :sswitch_2
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget-boolean v2, Ll/֨ۖ;->۫ۗۜ:Z

    if-eqz v2, :cond_7

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    const/4 v0, 0x0

    return-object v0

    .line 21
    :sswitch_5
    iput-object v0, v3, Ll/ۗ֨ۘ;->᩹:Ljava/lang/CharSequence;

    .line 22
    iput-object v1, v3, Ll/ۗ֨ۘ;->ۨ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 91
    iget-object v0, v2, Ll/᩻֨ۘ;->ܰ:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :sswitch_6
    move-object/from16 v2, p0

    .line 20
    invoke-static {v1, v4}, Ll/᩻֨ۘ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    sget v16, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v16, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v16, "\u06e7\u1a75"

    invoke-static/range {v16 .. v16}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    mul-int/lit8 v16, v16, 0x3f

    xor-int v1, v16, v13

    mul-int/lit16 v1, v1, 0x7ef1

    const v17, 0x14493e33

    xor-int v1, v1, v17

    const v17, -0x19199c12

    xor-int v16, v16, v17

    move v2, v1

    goto/16 :goto_6

    :sswitch_7
    move-object/from16 v2, p0

    const/16 v1, 0x41

    const/4 v4, 0x3

    .line 19
    invoke-static {v12, v1, v4, v8}, Ll/ۘ֡;->۫ۡ۫([SIII)Ljava/lang/String;

    move-result-object v4

    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v1, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v1, "\u1a79\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v13, v1

    mul-int/lit8 v1, v1, 0x55

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x7465

    const v16, 0x2b762557

    xor-int v2, v2, v16

    const v16, -0x3f53c1bf

    goto/16 :goto_5

    .line 18
    :sswitch_8
    invoke-static {v9, v10, v11, v8}, Ll/ۘۚ;->᩷᩺᩷([SIII)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Ll/᩻֨ۘ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 53
    sget-boolean v1, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v1, :cond_2

    const-string v1, "\u1a73\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x43

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x7b73

    const v16, -0x62fcb14d

    xor-int v2, v2, v16

    const v16, 0x2baf156

    goto/16 :goto_5

    :cond_2
    const-string v1, "\u1a75\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x13

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x2d2f

    const v16, -0xf3360e8

    xor-int v2, v2, v16

    const v16, -0x3784ce0c

    goto/16 :goto_5

    :sswitch_9
    const/16 v10, 0x3c

    const/4 v11, 0x5

    .line 86
    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u1a79\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x5c49

    const v16, 0x4d1446e

    xor-int v2, v2, v16

    const v16, 0x27e272f3

    goto/16 :goto_5

    .line 90
    :sswitch_a
    new-instance v3, Ll/ۨ۬ۘ;

    .line 18
    invoke-direct {v3}, Ll/ۗ֨ۘ;-><init>()V

    sget-object v9, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 84
    sget-boolean v1, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v1, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v1, "\u1a7b\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x51

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x11d1

    const v16, 0x626b5aaa

    xor-int v2, v2, v16

    const v16, -0x7445a870

    goto/16 :goto_5

    :sswitch_b
    const/16 v1, 0x52ba

    const/16 v8, 0x52ba

    goto :goto_1

    :sswitch_c
    const v1, 0xa82a

    const v8, 0xa82a

    :goto_1
    const-string v1, "\u06d8\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v13, v1

    mul-int/lit8 v1, v1, -0x3f

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x4d3d

    const v16, 0x771eccf5

    xor-int v2, v2, v16

    const v16, 0x22276660

    goto/16 :goto_5

    :sswitch_d
    mul-int/lit16 v1, v6, 0x6170

    sub-int/2addr v1, v7

    if-gtz v1, :cond_5

    const-string v1, "\u1a78\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x27

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x78f3

    const v16, -0x63089e0c

    xor-int v2, v2, v16

    const v16, -0x3e7bf3f3

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u073f\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x5431

    const v16, 0x3aa3d742    # 0.0012500065f

    xor-int v2, v2, v16

    const v16, -0x67d83337

    goto/16 :goto_5

    :sswitch_e
    add-int/lit16 v1, v6, 0x185c

    mul-int v7, v1, v1

    sget v1, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v1, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "\u05ab\u05ab"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x1b

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x443b

    const v16, -0x7e6b71a6

    xor-int v2, v2, v16

    const v16, -0x44886308

    goto/16 :goto_5

    :sswitch_f
    const/16 v1, 0x3b

    aget-short v6, v5, v1

    .line 63
    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_8

    :cond_7
    :goto_2
    const-string v1, "\u06e8\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x1d

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x38fd

    const v16, 0x84f6535

    xor-int v2, v2, v16

    const v16, -0x23012ed2

    goto/16 :goto_5

    :cond_8
    const-string v1, "\u06e8\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x5f0b

    const v16, 0x4ab8d313    # 6056329.5f

    xor-int v2, v2, v16

    const v16, 0x9074f6

    goto/16 :goto_5

    :sswitch_10
    sget-object v5, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 53
    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_a

    :cond_9
    :goto_3
    const-string v1, "\u06e1\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x41

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x5cd

    const v16, -0x41e8335

    xor-int v2, v2, v16

    const v16, -0x7a6dfa6f

    goto :goto_5

    :cond_a
    const-string v1, "\u06e4\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x435d

    const v16, 0x29aaecf1

    xor-int v2, v2, v16

    const v16, 0x74c33f8a

    goto :goto_5

    .line 52
    :sswitch_11
    sget-boolean v1, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v1, :cond_c

    :cond_b
    const-string v1, "\u073a\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x1dd1

    const v16, -0x3381992b    # -6.6689876E7f

    xor-int v2, v2, v16

    const v16, -0x67ebbd99

    goto :goto_5

    :cond_c
    const-string v1, "\u1a7a\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x1f

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x7e1b

    const v16, 0x62a803a8

    xor-int v2, v2, v16

    const v16, 0x14f53ea1

    goto :goto_5

    :goto_4
    const-string v1, "\u06e2\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x321b

    const v16, 0x7e2a339e

    xor-int v2, v2, v16

    const v16, 0x2644e671

    goto :goto_5

    :cond_d
    const-string v1, "\u06e8\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x5557

    const v16, -0x36bdb4ff

    xor-int v2, v2, v16

    const v16, 0x7a71c272

    :goto_5
    xor-int v16, v1, v16

    :goto_6
    move-object/from16 v1, p2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ad0648e -> :sswitch_3
        -0x7a82c08c -> :sswitch_11
        -0x79314d45 -> :sswitch_6
        -0x73726ded -> :sswitch_10
        -0x61e1edb2 -> :sswitch_0
        -0x5a97a96b -> :sswitch_f
        -0x59b04340 -> :sswitch_9
        -0x56c3125f -> :sswitch_4
        -0x502ee9f8 -> :sswitch_11
        -0x4dd49ec4 -> :sswitch_5
        -0x3c4a71e0 -> :sswitch_e
        -0x3a5f9be9 -> :sswitch_d
        -0x39547dad -> :sswitch_10
        -0x3859f239 -> :sswitch_c
        -0x2acf5f22 -> :sswitch_e
        -0x2acf3cf9 -> :sswitch_0
        -0x278c2966 -> :sswitch_2
        -0x253f858e -> :sswitch_c
        -0x227bc394 -> :sswitch_6
        -0x13678960 -> :sswitch_7
        -0xdbebf98 -> :sswitch_8
        -0xcdc82ce -> :sswitch_9
        0x48575ad -> :sswitch_f
        0x7bedcc0 -> :sswitch_2
        0x975aa33 -> :sswitch_1
        0x10391f31 -> :sswitch_3
        0x23c32f3a -> :sswitch_b
        0x3c83bc06 -> :sswitch_d
        0x3d01147c -> :sswitch_8
        0x4d872230 -> :sswitch_b
        0x4db4adf5 -> :sswitch_1
        0x56028075 -> :sswitch_4
        0x5baf50cd -> :sswitch_7
        0x5cb991bf -> :sswitch_a
        0x747b2802 -> :sswitch_5
        0x7ce975ce -> :sswitch_a
    .end sparse-switch
.end method

.method public final addText(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Text;
    .locals 20

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

    const/4 v13, 0x0

    const v14, 0x72a9de24

    sget v15, Ll/֫;->ܶܺ᩻:I

    sget v16, Ll/֫֡;->ۡ᩹ۗ:I

    const-string v17, "\u1a7b\u1a7b"

    invoke-static/range {v17 .. v17}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    mul-int/lit8 v17, v17, 0x23

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, 0x2d89

    const v19, 0x20da8fa5

    xor-int v1, v1, v19

    const v19, -0x569eca44    # -5.0006643E-14f

    xor-int v17, v17, v19

    move-object/from16 v19, v2

    move-object v12, v11

    move/from16 v18, v17

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, 0x72a9de24

    :goto_0
    xor-int v3, v17, v15

    mul-int/lit16 v3, v3, 0x4443

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    move-object/from16 v1, p0

    .line 69
    new-instance v2, Ll/ۖ۬ۘ;

    .line 17
    invoke-direct {v2}, Ll/ۗ֨ۘ;-><init>()V

    sget-object v12, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 27
    sget-boolean v0, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v0, :cond_5

    goto/16 :goto_4

    .line 36
    :sswitch_0
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    sget v1, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v1, :cond_1

    :cond_0
    move-object/from16 v1, p0

    goto/16 :goto_2

    :cond_1
    move-object/from16 v1, p0

    goto/16 :goto_6

    :sswitch_1
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v1

    if-nez v1, :cond_0

    :goto_1
    move-object/from16 v1, p0

    goto/16 :goto_4

    .line 21
    :sswitch_2
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    sget v1, Ll/۟;->ۨᩴۛ:I

    if-gez v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "\u073f\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, -0xf23

    const v18, -0x695930e2

    xor-int v3, v3, v18

    const v18, -0x6aba008c

    xor-int v18, v1, v18

    goto/16 :goto_8

    .line 58
    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    move-object/from16 v1, p0

    .line 70
    iget-object v0, v1, Ll/᩻֨ۘ;->ܰ:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Ll/ۖۗ;->ۨۜܰ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v2

    :sswitch_6
    move-object/from16 v1, p0

    .line 17
    invoke-static {v12, v13, v14, v11}, Ll/֨᩸;->۫ۜܽ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 18
    invoke-static {v0, v3}, Ll/᩻֨ۘ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iput-object v0, v2, Ll/ۗ֨ۘ;->᩹:Ljava/lang/CharSequence;

    .line 29
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v3, "\u1a76\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v15

    xor-int v0, v3, v16

    mul-int/lit16 v0, v0, -0x7f27

    const v18, -0x7035fdf6

    xor-int v0, v0, v18

    const v18, 0x1b7e868f

    xor-int v18, v3, v18

    move v1, v0

    move-object/from16 v0, p1

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v1, p0

    const/16 v13, 0x45

    const/4 v14, 0x5

    .line 2
    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v0, :cond_4

    :goto_2
    const-string v0, "\u05a1\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x63

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x6877

    const v18, -0x60f02239

    xor-int v3, v3, v18

    const v18, -0x5238788e

    goto/16 :goto_7

    :cond_4
    const-string v0, "\u1a77\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x3aab

    const v18, 0x6a6febd5

    xor-int v3, v3, v18

    const v18, 0x69230258

    goto/16 :goto_7

    :cond_5
    const-string v0, "\u06d8\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x6c59

    const v18, 0xad75dc6

    xor-int v3, v3, v18

    const v18, -0x42759e15

    goto/16 :goto_7

    :sswitch_8
    move-object/from16 v1, p0

    const v0, 0x8e86

    const v11, 0x8e86

    goto :goto_3

    :sswitch_9
    move-object/from16 v1, p0

    const v0, 0xa887

    const v11, 0xa887

    :goto_3
    const-string v0, "\u1a79\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x69

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x497

    const v18, -0x33327ee0

    xor-int v3, v3, v18

    const v18, -0x32b9d4aa

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v1, p0

    add-int v0, v9, v10

    add-int/2addr v0, v0

    sub-int/2addr v0, v8

    if-ltz v0, :cond_6

    const-string v0, "\u06e0\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0xbf1

    const v18, -0x29f9ebb4

    xor-int v3, v3, v18

    const v18, -0x283cec3b

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u1a77\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x17cf

    const v18, 0x6bcfc4aa

    xor-int v3, v3, v18

    const v18, -0x271fa222

    goto/16 :goto_7

    :sswitch_b
    move-object/from16 v1, p0

    const v10, 0x12521c10

    sget v0, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v0, :cond_7

    :goto_4
    const-string v0, "\u06db\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0xd

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0xfad

    const v18, -0x36f2aba2

    xor-int v3, v3, v18

    const v18, -0x3ccb5c9f

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u06d9\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x49

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x6d7f

    const v18, -0x44885c7f

    xor-int v3, v3, v18

    const v18, 0x38a28f9b

    goto/16 :goto_7

    :sswitch_c
    move-object/from16 v1, p0

    mul-int v8, v7, v7

    mul-int v9, v5, v5

    .line 5
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v0

    if-gtz v0, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v0, "\u0736\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x29

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0x65c5

    const v18, 0x7e20f445

    xor-int v3, v3, v18

    const v18, 0x21f264fb

    goto/16 :goto_7

    :sswitch_d
    move-object/from16 v1, p0

    add-int v7, v5, v6

    sget v0, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v0, :cond_9

    goto :goto_5

    :cond_9
    const-string v0, "\u05a8\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x67

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x6e57

    const v18, 0x4f06ed40    # 2.2636954E9f

    xor-int v3, v3, v18

    const v18, 0x7d7d7a2b

    goto/16 :goto_7

    :sswitch_e
    move-object/from16 v1, p0

    aget-short v5, v19, v4

    const/16 v6, 0x447c

    .line 44
    sget v0, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v0, :cond_a

    goto :goto_5

    :cond_a
    const-string v0, "\u1a7b\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x70bd

    const v18, -0x6046aee4

    xor-int v3, v3, v18

    const v18, 0x2394ec02

    goto/16 :goto_7

    :sswitch_f
    move-object/from16 v1, p0

    const/16 v4, 0x44

    .line 25
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_6

    :cond_b
    const-string v0, "\u073d\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x48d7

    const v18, 0x64252ecc

    xor-int v3, v3, v18

    const v18, 0x6280e3cc

    goto :goto_7

    :sswitch_10
    move-object/from16 v1, p0

    sget-object v19, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v0

    if-ltz v0, :cond_c

    :goto_5
    const-string v0, "\u06d7\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x77

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x17fb

    const v18, 0x1b060622

    xor-int v3, v3, v18

    const v18, 0x53b58f82

    goto :goto_7

    :cond_c
    const-string v0, "\u1a7a\u06da"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x61

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0x19ff

    const v18, 0x420712a6

    xor-int v3, v3, v18

    const v18, -0x168cc2d4

    goto :goto_7

    :sswitch_11
    move-object/from16 v1, p0

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v0

    if-eqz v0, :cond_d

    :goto_6
    const-string v0, "\u05a1\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x59

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0x3d0b

    const v18, -0x3ec8171e

    xor-int v3, v3, v18

    const v18, -0x7b3c1f0a

    goto :goto_7

    :cond_d
    const-string v0, "\u06eb\u05ab"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x57

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x5455

    const v18, -0x4c840ba

    xor-int v3, v3, v18

    const v18, 0x297acbb

    :goto_7
    xor-int v18, v0, v18

    move-object/from16 v0, p1

    :goto_8
    move v1, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f79a4c1 -> :sswitch_8
        -0x6e716434 -> :sswitch_8
        -0x6c4ca712 -> :sswitch_2
        -0x673b140a -> :sswitch_2
        -0x61496308 -> :sswitch_7
        -0x5997e8b0 -> :sswitch_b
        -0x4993bd6b -> :sswitch_c
        -0x47c2ef46 -> :sswitch_9
        -0x41d3a056 -> :sswitch_4
        -0x409f7aeb -> :sswitch_11
        -0x3ef728c3 -> :sswitch_b
        -0x387ed913 -> :sswitch_d
        -0x372f979a -> :sswitch_1
        -0x32dfc640 -> :sswitch_3
        -0x30c7678d -> :sswitch_4
        -0x12e81f68 -> :sswitch_c
        -0x94b208 -> :sswitch_5
        0x6f7f3d7 -> :sswitch_f
        0x88a8f3e -> :sswitch_10
        0xdabbc15 -> :sswitch_a
        0x168c6436 -> :sswitch_e
        0x20d64e64 -> :sswitch_3
        0x23a170b5 -> :sswitch_1
        0x2c505b15 -> :sswitch_d
        0x2c744d69 -> :sswitch_6
        0x2fdbda97 -> :sswitch_10
        0x30f67646 -> :sswitch_5
        0x31457125 -> :sswitch_6
        0x33d54a7f -> :sswitch_9
        0x3ae5392a -> :sswitch_e
        0x3d7bea27 -> :sswitch_11
        0x44eb0e08 -> :sswitch_0
        0x599c3f05 -> :sswitch_7
        0x5fef7d06 -> :sswitch_0
        0x7672ddac -> :sswitch_a
        0x7ab1c486 -> :sswitch_f
    .end sparse-switch
.end method

.method public final addText(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Text;
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

    const v14, 0x68218098

    sget v15, Ll/֫᩺;->᩺۟ۘ:I

    sget v16, Ll/֨᩺;->۬᩺ܰ:I

    const-string v17, "\u1a76\u06da"

    invoke-static/range {v17 .. v17}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v17

    sub-int v17, v16, v17

    mul-int/lit8 v17, v17, 0x33

    xor-int v2, v17, v15

    mul-int/lit16 v2, v2, 0x70a5

    const v19, -0x3d20bc76

    xor-int v2, v2, v19

    const v19, -0x7993bb1b

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

    const v17, 0x68218098

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v5, v17, v15

    mul-int/lit16 v5, v5, 0x7ec1

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v2, v5

    xor-int v17, v18, v2

    sparse-switch v17, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_0
    sget v2, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v2, :cond_0

    :goto_1
    move-object/from16 v2, p0

    goto/16 :goto_2

    :cond_0
    move-object/from16 v2, p0

    goto/16 :goto_7

    .line 42
    :sswitch_1
    sget v2, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v2, p0

    goto/16 :goto_4

    .line 33
    :sswitch_2
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    sget-boolean v2, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    goto/16 :goto_5

    .line 24
    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    goto :goto_1

    .line 25
    :sswitch_4
    iput-object v0, v3, Ll/ۗ֨ۘ;->᩹:Ljava/lang/CharSequence;

    .line 26
    iput-object v1, v3, Ll/ۗ֨ۘ;->ۨ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 77
    iget-object v0, v2, Ll/᩻֨ۘ;->ܰ:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :sswitch_5
    move-object/from16 v2, p0

    .line 24
    invoke-static {v1, v4}, Ll/᩻֨ۘ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    sget v5, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v5, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v5, "\u06eb\u073f"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v16

    xor-int v1, v5, v15

    mul-int/lit16 v1, v1, -0x3f97

    const v18, -0x1639fa14

    xor-int v1, v1, v18

    const v18, -0x20e65d38

    xor-int v18, v5, v18

    move v2, v1

    move-object/from16 v1, p2

    goto :goto_0

    :sswitch_6
    move-object/from16 v2, p0

    const/16 v1, 0x50

    const/4 v4, 0x3

    .line 23
    invoke-static {v14, v1, v4, v10}, Ll/ۘۚ;->᩷᩺᩷([SIII)Ljava/lang/String;

    move-result-object v4

    .line 50
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u1a77\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x67b9

    const v18, 0x411f976a

    xor-int v5, v5, v18

    const v18, -0x66f5252e

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v2, p0

    .line 22
    invoke-static {v11, v12, v13, v10}, Ll/֡ܽ;->ۗܺۛ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-static {v0, v1}, Ll/᩻֨ۘ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v14, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 44
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u1a73\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0xd

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x3b31

    const v18, -0xeb12d4d

    xor-int v5, v5, v18

    const v18, -0x407ab5ba

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v2, p0

    const/16 v12, 0x4b

    const/4 v13, 0x5

    .line 76
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_2
    const-string v1, "\u05a1\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x2773

    const v18, 0x4967cb96    # 949433.4f

    xor-int v5, v5, v18

    const v18, 0x71d562a2

    goto/16 :goto_8

    :cond_6
    const-string v1, "\u1a73\u06d8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x7c5d

    const v18, -0x443fc228

    xor-int v5, v5, v18

    const v18, -0x457f2eb6

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v2, p0

    new-instance v3, Ll/ۖ۬ۘ;

    .line 22
    invoke-direct {v3}, Ll/ۗ֨ۘ;-><init>()V

    sget-object v11, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 50
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v1

    if-gtz v1, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v1, "\u0730\u1a77"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x37f3

    const v18, -0x5d4d67c

    xor-int v5, v5, v18

    const v18, -0x4f5ad38f

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v2, p0

    const v1, 0xd159

    const v10, 0xd159

    goto :goto_3

    :sswitch_b
    move-object/from16 v2, p0

    const v1, 0xe79a

    const v10, 0xe79a

    :goto_3
    const-string v1, "\u1a76\u06d8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x7b

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x5499

    const v18, 0x585b015

    xor-int v5, v5, v18

    const v18, 0x497ca326

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v2, p0

    add-int v1, v6, v9

    mul-int v1, v1, v1

    sub-int/2addr v1, v8

    if-gtz v1, :cond_8

    const-string v1, "\u06e2\u1a73"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x3b23

    const v18, 0x132fcba0

    xor-int v5, v5, v18

    const v18, 0x19f56633

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u05a1\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x6a6f

    const v18, -0x7fb8c882

    xor-int v5, v5, v18

    const v18, -0x3d3f5068

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v2, p0

    const/16 v9, 0x1743

    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v1, :cond_9

    :goto_4
    const-string v1, "\u06e7\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0xa31

    const v18, -0x792a6741

    xor-int v5, v5, v18

    const v18, -0x16c1b1af

    goto/16 :goto_8

    :cond_9
    const-string v1, "\u1a76\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x1d7d

    const v18, 0x72af820a

    xor-int v5, v5, v18

    const v18, 0x7c1de708

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v2, p0

    const v1, 0x21d1b89

    add-int/2addr v1, v7

    add-int v8, v1, v1

    .line 39
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v1

    if-gtz v1, :cond_a

    goto :goto_5

    :cond_a
    const-string v1, "\u1a79\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x5cf3

    const v18, -0x2af1ef74

    xor-int v5, v5, v18

    const v18, -0x4b1b7b1e

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v2, p0

    const/16 v1, 0x4a

    aget-short v6, v19, v1

    mul-int v7, v6, v6

    sget v1, Ll/֨ۧ;->֫۠֡:I

    if-gtz v1, :cond_b

    :goto_5
    const-string v1, "\u073f\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x25

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x1153

    const v18, -0x6fa402ba

    xor-int v5, v5, v18

    const v18, 0x33e6d8ac

    goto/16 :goto_8

    :cond_b
    const-string v1, "\u1a7b\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x65

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x2139

    const v18, -0x73d1775f

    xor-int v5, v5, v18

    const v18, 0x69805ac8

    goto :goto_8

    :sswitch_10
    move-object/from16 v2, p0

    sget-object v19, Ll/᩻֨ۘ;->ܺ᩵ۙ:[S

    .line 43
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v1

    if-gtz v1, :cond_c

    :goto_6
    const-string v1, "\u0736\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x1e81

    const v18, 0x3e395381

    xor-int v5, v5, v18

    const v18, 0x1d0f6d75

    goto :goto_8

    :cond_c
    const-string v1, "\u1a77\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x345f

    const v18, -0x16df2778

    xor-int v5, v5, v18

    const v18, -0x143bd0f4

    goto :goto_8

    :sswitch_11
    move-object/from16 v2, p0

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v1

    if-gtz v1, :cond_d

    :goto_7
    const-string v1, "\u06e7\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x1631

    const v18, 0x19350222

    xor-int v5, v5, v18

    const v18, 0x6cf6a113

    goto :goto_8

    :cond_d
    const-string v1, "\u1a7a\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x3

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x5a2f

    const v18, 0x18811b16

    xor-int v5, v5, v18

    const v18, 0x2abc3210

    :goto_8
    xor-int v18, v1, v18

    move-object/from16 v1, p2

    move v2, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x615aea8d -> :sswitch_2
        -0x60e0d7f1 -> :sswitch_f
        -0x5bf83a8a -> :sswitch_8
        -0x52c1782e -> :sswitch_6
        -0x4e4174c8 -> :sswitch_7
        -0x4aa46333 -> :sswitch_a
        -0x46e2bf1c -> :sswitch_2
        -0x46a98aa6 -> :sswitch_1
        -0x3c83c75a -> :sswitch_d
        -0x33aa7f68 -> :sswitch_b
        -0x20eaf6fc -> :sswitch_e
        -0x1d12af72 -> :sswitch_0
        -0x1726e42e -> :sswitch_a
        -0x13f2aa2e -> :sswitch_9
        -0x6726cfd -> :sswitch_5
        -0x42e1204 -> :sswitch_7
        -0x2195ee8 -> :sswitch_b
        0x7ab2720 -> :sswitch_11
        0x8515fc7 -> :sswitch_11
        0xab97606 -> :sswitch_4
        0xb855a87 -> :sswitch_c
        0x12b9d1a0 -> :sswitch_9
        0x13e6c087 -> :sswitch_3
        0x213c2113 -> :sswitch_6
        0x24e53bd2 -> :sswitch_c
        0x3e671d3b -> :sswitch_f
        0x3f4959a1 -> :sswitch_3
        0x49183e14 -> :sswitch_e
        0x4a8479f0 -> :sswitch_d
        0x4c74ed5d -> :sswitch_10
        0x4ca9e831 -> :sswitch_5
        0x56dcc127 -> :sswitch_4
        0x6084a3ac -> :sswitch_10
        0x6505dc4c -> :sswitch_8
        0x6a940d1d -> :sswitch_0
        0x79f0e226 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onCreated(Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
    .locals 0

    .line 110
    iput-object p1, p0, Ll/᩻֨ۘ;->ۖ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;

    return-object p0
.end method

.method public final onPreferenceChange(Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
    .locals 0

    .line 104
    iput-object p1, p0, Ll/᩻֨ۘ;->ۚ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;

    return-object p0
.end method

.method public final setLocalString(Lbin/mt/plugin/api/LocalString;)V
    .locals 0

    .line 38
    iput-object p1, p0, Ll/᩻֨ۘ;->ۨ:Lbin/mt/plugin/api/LocalString;

    return-void
.end method

.method public final subtitle(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
    .locals 0

    .line 49
    iput-object p1, p0, Ll/᩻֨ۘ;->᩹:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final title(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
    .locals 0

    .line 43
    iput-object p1, p0, Ll/᩻֨ۘ;->֨:Ljava/lang/CharSequence;

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

    const v18, -0x4e0dd3b3

    sget v19, Ll/ۘۧ;->ܳ᩷᩸:I

    sget v20, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v21, "\u06e1\u1a77"

    invoke-static/range {v21 .. v21}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v19

    xor-int v1, v21, v20

    mul-int/lit16 v1, v1, -0x191b

    const v23, -0x1476f0e0

    xor-int v1, v1, v23

    const v23, -0x126a903b

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

    const v21, -0x4e0dd3b3

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

    mul-int/lit16 v6, v6, 0x9c5

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v1, v6

    xor-int v21, v22, v1

    sparse-switch v21, :sswitch_data_0

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    const/4 v1, 0x0

    return-object v1

    .line 156
    :sswitch_0
    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v1, :cond_1

    :cond_0
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_f

    :cond_1
    const-string v1, "\u06e0\u1a7b"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x3b

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, 0x16c9

    const v22, 0x522c746b

    xor-int v6, v6, v22

    const v22, 0x2435e741

    goto/16 :goto_3

    .line 35
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_9

    :cond_3
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_c

    :sswitch_2
    sget-boolean v1, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v1, :cond_0

    :cond_4
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_b

    :sswitch_3
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v1

    if-ltz v1, :cond_2

    goto :goto_1

    .line 72
    :sswitch_4
    sget v1, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v1, :cond_6

    :cond_5
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_a

    :cond_6
    const-string v1, "\u0730\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x6cc1

    const v22, -0x5aa2e4c3

    xor-int v6, v6, v22

    const v22, -0x471a6810

    goto/16 :goto_3

    .line 46
    :sswitch_5
    sget-boolean v1, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-eqz v1, :cond_4

    goto :goto_1

    .line 157
    :sswitch_6
    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v1, :cond_5

    goto :goto_1

    :sswitch_7
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    sget v1, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v1, :cond_7

    goto :goto_1

    :cond_7
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_8

    .line 144
    :sswitch_8
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    :goto_1
    const-string v1, "\u06dc\u06eb"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x5861

    const v22, -0x4ce11c71

    xor-int v6, v6, v22

    const v22, 0xbad07b2

    goto/16 :goto_3

    .line 172
    :sswitch_9
    invoke-static {v3, v2}, Ll/ۗ;->֡ۚۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    move-object v5, v1

    goto/16 :goto_2

    :sswitch_a
    invoke-static {v3, v8}, Ll/֫ᩳ;->᩺֨۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    move-object v14, v1

    move-object/from16 v6, v18

    goto/16 :goto_5

    .line 0
    :sswitch_b
    invoke-static {v10, v2}, Ll/֡۠;->ۡܰ۫(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v9, :cond_9

    const-string v1, "\u06dc\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, 0x3523

    const v22, -0x75c66ed3

    xor-int v6, v6, v22

    const v22, 0x5acc1db6

    goto/16 :goto_3

    :sswitch_c
    invoke-static {v10, v8}, Ll/֡ۛ;->ۖۘ۟(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v9, :cond_8

    const-string v1, "\u073a\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x33

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, -0x6307

    const v22, -0xa7784b1

    xor-int v6, v6, v22

    const v22, -0x24d279cc

    goto/16 :goto_3

    .line 171
    :sswitch_d
    invoke-static {v2, v12}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v11, :cond_9

    const-string v1, "\u06d9\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x7b

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x280b

    const v22, -0xa694e9d

    xor-int v6, v6, v22

    const v22, -0x650bb931

    goto/16 :goto_3

    :sswitch_e
    invoke-static {v8, v12}, Ll/ۗ;->᩶᩺ܶ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v11, :cond_8

    const-string v1, "\u1a7a\u06d8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x1623

    const v22, -0x7e474c4d

    xor-int v6, v6, v22

    const v22, 0x6ea38c29

    goto/16 :goto_3

    :sswitch_f
    move-object v2, v15

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v13, :cond_9

    const-string v1, "\u06d7\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, -0x1ef1

    const v22, 0x8ade6f8

    xor-int v6, v6, v22

    const v22, -0x55baabb9

    goto :goto_3

    .line 126
    :sswitch_10
    iput-object v5, v0, Ll/᩻֨ۘ;->᩹:Ljava/lang/CharSequence;

    return-object v4

    .line 171
    :sswitch_11
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v13, :cond_8

    const-string v1, "\u0733\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x3d

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, -0x35af

    const v22, 0x4be0886a    # 2.9429972E7f

    xor-int v6, v6, v22

    const v22, -0x35369ea7    # -6598828.5f

    goto :goto_3

    :cond_8
    move-object/from16 v6, v18

    goto/16 :goto_4

    .line 125
    :sswitch_12
    iput-object v14, v0, Ll/᩻֨ۘ;->֨:Ljava/lang/CharSequence;

    .line 126
    iget-object v15, v0, Ll/᩻֨ۘ;->᩹:Ljava/lang/CharSequence;

    .line 171
    instance-of v1, v15, Ljava/lang/String;

    if-eqz v1, :cond_9

    const-string v1, "\u06dc\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, 0x61

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x4a9

    const v22, -0x494db6f6

    xor-int v6, v6, v22

    const v22, -0x41df8872

    goto :goto_3

    :cond_9
    move-object v5, v15

    :goto_2
    const-string v1, "\u05a8\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x1a11

    const v22, 0x24da4e6b

    xor-int v6, v6, v22

    const v22, 0x9f19f16

    :goto_3
    xor-int v22, v1, v22

    goto/16 :goto_10

    .line 117
    :sswitch_13
    invoke-static/range {v23 .. v23}, Ll/֡ۛ;->ۨۤ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ֨ۘ;

    move-object/from16 v6, v18

    .line 118
    invoke-virtual {v1, v6}, Ll/ۗ֨ۘ;->ۙ(Lbin/mt/plugin/api/LocalString;)V

    move-object/from16 v18, v2

    goto/16 :goto_6

    :sswitch_14
    move-object/from16 v6, v18

    .line 121
    invoke-static/range {v17 .. v17}, Ll/֡۠;->ۗۛۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ֨ۘ;

    .line 122
    invoke-virtual {v1, v3}, Ll/ۗ֨ۘ;->ۙ(Lbin/mt/plugin/api/PluginContext;)V

    move-object/from16 v18, v2

    goto/16 :goto_7

    :sswitch_15
    move-object/from16 v6, v18

    const/4 v12, 0x0

    const/4 v13, 0x3

    if-eqz v16, :cond_a

    const-string v1, "\u06e1\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x55

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, -0x181

    const v22, -0x1c9762e8

    xor-int v11, v11, v22

    const v22, -0x2431ee10

    xor-int v22, v1, v22

    move-object/from16 v18, v6

    move v1, v11

    const/16 v11, 0x7b

    goto/16 :goto_0

    :cond_a
    const/16 v11, 0x7b

    :goto_4
    move-object v14, v7

    :goto_5
    const-string v1, "\u0730\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, 0x21

    move-object/from16 v18, v2

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0xbc3

    const v22, 0x2d2e5d3e

    xor-int v2, v2, v22

    const v22, 0x10c8a6c0

    goto/16 :goto_d

    :sswitch_16
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    const/4 v10, 0x1

    .line 70
    sget-boolean v1, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v1, :cond_b

    const-string v1, "\u05ab\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0x40c1

    const v22, 0x50043883

    xor-int v2, v2, v22

    const v22, 0x1b984882

    goto/16 :goto_d

    :cond_b
    const-string v1, "\u05ab\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x17

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x72f1

    const v22, -0x72e73851

    xor-int v2, v2, v22

    const v22, -0x3b4af596

    goto/16 :goto_d

    :sswitch_17
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    const/16 v9, 0x7d

    sget-boolean v1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v1, :cond_c

    goto/16 :goto_f

    :cond_c
    const-string v1, "\u06e7\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x1d

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x4f35

    const v22, -0x79699e4f

    xor-int v2, v2, v22

    const v22, -0x3260d2ee

    goto/16 :goto_d

    :sswitch_18
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 125
    iget-object v7, v0, Ll/᩻֨ۘ;->֨:Ljava/lang/CharSequence;

    .line 171
    instance-of v1, v7, Ljava/lang/String;

    .line 20
    sget v2, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v2, :cond_d

    move/from16 v16, v1

    goto/16 :goto_f

    :cond_d
    const-string v2, "\u06eb\u0733"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    mul-int/lit8 v2, v2, -0x5d

    move/from16 v16, v1

    xor-int v1, v2, v19

    mul-int/lit16 v1, v1, 0x4219

    const v22, -0x2f329809

    xor-int v1, v1, v22

    const v22, 0x796c11fe

    xor-int v22, v2, v22

    goto/16 :goto_e

    :sswitch_19
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 117
    invoke-static/range {v23 .. v23}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "\u1a77\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x37a7

    const v22, -0x11d9be10

    xor-int v2, v2, v22

    const v22, -0x1a52e688

    goto/16 :goto_d

    :sswitch_1a
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 121
    invoke-static/range {v17 .. v17}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "\u1a77\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x3d

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x7593

    const v22, 0x3ac11036

    xor-int v2, v2, v22

    const v22, -0xf4eccaf

    goto/16 :goto_d

    :cond_e
    const-string v1, "\u06ec\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x4d

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x7265

    const v22, -0x63f9a82

    xor-int v2, v2, v22

    const v22, 0xc5015e

    goto/16 :goto_d

    :sswitch_1b
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 117
    invoke-static {v4}, Ll/ۘ֡;->֫᩺ܶ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v23, v1

    :goto_6
    const-string v1, "\u06d9\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x3a0d

    const v22, 0xc30534d

    xor-int v2, v2, v22

    const v22, -0x3e22bc24

    goto/16 :goto_d

    :sswitch_1c
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 121
    invoke-static {v4}, Ll/ۗܺ;->֡ۙۚ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v17, v1

    :goto_7
    const-string v1, "\u06db\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x75b1

    const v22, -0x78d8e72f

    xor-int v2, v2, v22

    const v22, -0x5b0dbfeb

    goto/16 :goto_d

    :sswitch_1d
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 116
    iget-object v3, v0, Ll/᩻֨ۘ;->ۙ:Lbin/mt/plugin/api/PluginContext;

    iget-object v4, v0, Ll/᩻֨ۘ;->ܰ:Ljava/util/ArrayList;

    if-eqz v6, :cond_f

    const-string v1, "\u1a77\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0x2359

    const v22, 0x702da13

    xor-int v2, v2, v22

    const v22, -0x1c4a3afe

    goto/16 :goto_d

    :cond_f
    const-string v1, "\u1a7b\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0x43

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x2f49

    const v22, 0x31192dc0

    xor-int v2, v2, v22

    const v22, 0x200df098

    goto/16 :goto_d

    :sswitch_1e
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    sget v1, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v1, :cond_10

    :goto_8
    const-string v1, "\u06d9\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0x1d

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x3e8b

    const v22, -0x70efecda

    xor-int v2, v2, v22

    const v22, -0x7e71ab35

    goto/16 :goto_d

    :cond_10
    const-string v1, "\u073a\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x29d3

    const v22, 0x2a1cc1a1

    xor-int v2, v2, v22

    const v22, -0x3f48dff9

    goto/16 :goto_d

    :sswitch_1f
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    sget v1, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v1, :cond_11

    :goto_9
    const-string v1, "\u1a73\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0x3425

    const v22, -0x5a209999

    xor-int v2, v2, v22

    const v22, 0x3c9e7ac5

    goto/16 :goto_d

    :cond_11
    const-string v1, "\u073a\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0xd

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x686b

    const v22, -0x6803e439

    xor-int v2, v2, v22

    const v22, -0x3e7528fa

    goto/16 :goto_d

    :sswitch_20
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    sget v1, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v1, :cond_12

    goto/16 :goto_f

    :cond_12
    const-string v1, "\u073f\u06eb"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x2d

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0x3555

    const v22, 0x16ee81b3

    xor-int v2, v2, v22

    const v22, -0x26ad6f17

    goto/16 :goto_d

    :sswitch_21
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 40
    sget v1, Ll/ۗ;->֨۬ۖ:I

    if-ltz v1, :cond_13

    :goto_a
    const-string v1, "\u06df\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x31f9

    const v22, -0x31aecf1d

    xor-int v2, v2, v22

    const v22, -0x535fe7a8

    goto/16 :goto_d

    :cond_13
    const-string v1, "\u06e0\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0xd87

    const v22, -0x102b9f31

    xor-int v2, v2, v22

    const v22, -0x4d277a93

    goto :goto_d

    :sswitch_22
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_14

    :goto_b
    const-string v1, "\u06dc\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x670f

    const v22, -0x6fc75eea

    xor-int v2, v2, v22

    const v22, 0x68138604

    goto :goto_d

    :cond_14
    const-string v1, "\u1a73\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x6d

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x6ee1

    const v22, 0x3ad36937

    xor-int v2, v2, v22

    const v22, 0x44996fc0

    goto :goto_d

    :sswitch_23
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 75
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v1

    if-nez v1, :cond_15

    :goto_c
    const-string v1, "\u06da\u1a75"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, 0xb

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x459b

    const v22, 0x18401105

    xor-int v2, v2, v22

    const v22, -0x2fdc8688

    goto :goto_d

    :cond_15
    const-string v1, "\u06da\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0x469

    const v22, 0x6a966d25

    xor-int v2, v2, v22

    const v22, 0x2623f5c3

    :goto_d
    xor-int v22, v1, v22

    move v1, v2

    :goto_e
    move-object/from16 v2, v18

    move-object/from16 v18, v6

    goto/16 :goto_0

    :sswitch_24
    move-object/from16 v18, v2

    .line 115
    iget-object v1, v0, Ll/᩻֨ۘ;->ۨ:Lbin/mt/plugin/api/LocalString;

    .line 45
    sget v2, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v2, :cond_16

    move-object v6, v1

    :goto_f
    const-string v1, "\u06e2\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x5b

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x2577

    const v22, -0x6cd319ea

    xor-int v2, v2, v22

    const v22, -0x4e44dddc

    goto :goto_d

    :cond_16
    const-string v2, "\u073d\u0730"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v19

    mul-int/lit8 v2, v2, -0xd

    xor-int v6, v2, v20

    mul-int/lit16 v6, v6, 0x2289

    const v22, -0x4d0b565b

    xor-int v6, v6, v22

    const v22, -0x2ce4a30c

    xor-int v22, v2, v22

    move-object/from16 v2, v18

    move-object/from16 v18, v1

    :goto_10
    move v1, v6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f0a73eb -> :sswitch_17
        -0x7ae33d26 -> :sswitch_c
        -0x73c6a012 -> :sswitch_14
        -0x692bb322 -> :sswitch_1d
        -0x6829b510 -> :sswitch_f
        -0x5d776b0e -> :sswitch_1e
        -0x52df345a -> :sswitch_16
        -0x514f5f1e -> :sswitch_9
        -0x4c325721 -> :sswitch_13
        -0x4a79221c -> :sswitch_b
        -0x48874823 -> :sswitch_15
        -0x4409f589 -> :sswitch_24
        -0x383938c6 -> :sswitch_1c
        -0x35ce3b71 -> :sswitch_8
        -0x34a63287 -> :sswitch_11
        -0x3260a412 -> :sswitch_22
        -0x2b6f47cf -> :sswitch_2
        -0x28dec9d0 -> :sswitch_4
        -0x1db2a3b1 -> :sswitch_10
        -0x1d9411e6 -> :sswitch_21
        -0x1792be04 -> :sswitch_d
        -0x14dd0d5f -> :sswitch_19
        -0x14a02ceb -> :sswitch_13
        -0x13cab9a8 -> :sswitch_f
        -0x111d13b5 -> :sswitch_a
        -0xfdb7482 -> :sswitch_0
        -0xed24ec2 -> :sswitch_2
        -0xd6eee2d -> :sswitch_1a
        -0x629fe56 -> :sswitch_1f
        -0x5e0b1e6 -> :sswitch_22
        -0x53cb644 -> :sswitch_7
        -0x4a8e0c1 -> :sswitch_3
        -0x3d9cf3f -> :sswitch_d
        -0x14eba0d -> :sswitch_3
        0x309e2b4 -> :sswitch_18
        0x4b2b0cd -> :sswitch_16
        0x80a8b3f -> :sswitch_1b
        0xcaf4c31 -> :sswitch_9
        0x1547a952 -> :sswitch_c
        0x16bf6cd8 -> :sswitch_15
        0x20be85fc -> :sswitch_23
        0x251aa191 -> :sswitch_17
        0x26fe0f90 -> :sswitch_b
        0x2a61ed9e -> :sswitch_19
        0x2dba0689 -> :sswitch_18
        0x32e21f1a -> :sswitch_1
        0x36bc8839 -> :sswitch_1a
        0x3bafe482 -> :sswitch_4
        0x3cc82326 -> :sswitch_20
        0x3e03e8e9 -> :sswitch_8
        0x3e70d77a -> :sswitch_6
        0x3f8a08ee -> :sswitch_e
        0x3f9c53fd -> :sswitch_1b
        0x49deb471 -> :sswitch_6
        0x4d739f77 -> :sswitch_5
        0x4ffd67a1 -> :sswitch_23
        0x509abb1e -> :sswitch_7
        0x53590729 -> :sswitch_5
        0x55b54092 -> :sswitch_12
        0x5688be9a -> :sswitch_1f
        0x575ae817 -> :sswitch_1
        0x57f47005 -> :sswitch_0
        0x58da76c6 -> :sswitch_1e
        0x59642bf9 -> :sswitch_20
        0x5f499a61 -> :sswitch_e
        0x60ac742c -> :sswitch_24
        0x66309c19 -> :sswitch_14
        0x6e881635 -> :sswitch_1c
        0x702fbcf7 -> :sswitch_10
        0x72a75de9 -> :sswitch_21
        0x73e52ec2 -> :sswitch_12
        0x749bf9bb -> :sswitch_11
        0x793771db -> :sswitch_1d
        0x7ebca786 -> :sswitch_a
    .end sparse-switch
.end method

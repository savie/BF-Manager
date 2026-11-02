.class public final Ll/ۜᩴ᩺;
.super Ljava/lang/Object;
.source "D20P"


# static fields
.field private static final ۨۛܽ:[S


# instance fields
.field public ۙ:Ljava/util/LinkedList;

.field public ۨ:Ljava/util/HashMap;

.field public ܰ:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x28

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۜᩴ᩺;->ۨۛܽ:[S

    return-void

    :array_0
    .array-data 2
        0x31fs
        0x231as
        0x231ds
        0x230fs
        0x2308s
        0x2323s
        0x2309s
        0x230es
        0x2310s
        0x230fs
        0x2300s
        0x1e8s
        0x6e5as
        0x6e5ds
        0x6e4fs
        0x6e48s
        0x6e63s
        0x6e49s
        0x6e4es
        0x6e50s
        0x6e4fs
        0x6e5as
        0x6e5ds
        0x6e4fs
        0x6e48s
        0x6e63s
        0x6e49s
        0x6e4es
        0x6e50s
        0x6e4fs
        0x6e63s
        0x6e59s
        0x6e44s
        0x6e4cs
        0x6e55s
        0x6e4es
        0x6e59s
        0x6e58s
        0x6e60s
        0x6e40s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x1b64a2e1

    sget v3, Ll/۟;->ۨᩴۛ:I

    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v5, "\u1a7b\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2407

    const v7, -0x2c4110b8

    xor-int/2addr v6, v7

    const v7, 0x6ff550c

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x31bf

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 67
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget v5, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v5, :cond_1

    const-string v5, "\u06ec\u06d7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5381

    const v7, 0xc514117

    xor-int/2addr v6, v7

    const v7, -0x476432bb

    goto :goto_0

    .line 47
    :sswitch_0
    sget v5, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v5, :cond_b

    goto/16 :goto_1

    .line 11
    :sswitch_1
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v5

    if-lez v5, :cond_5

    goto/16 :goto_2

    .line 48
    :sswitch_2
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget v5, Ll/֫;->ܶܺ᩻:I

    if-ltz v5, :cond_9

    goto/16 :goto_2

    .line 28
    :sswitch_3
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    goto/16 :goto_2

    .line 1
    :sswitch_4
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 67
    :sswitch_5
    iput-object v1, p0, Ll/ۜᩴ᩺;->ܰ:Ljava/util/ArrayList;

    .line 68
    new-instance v5, Ljava/util/LinkedList;

    .line 62
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_2

    .line 68
    :cond_0
    invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V

    iput-object v5, p0, Ll/ۜᩴ᩺;->ۙ:Ljava/util/LinkedList;

    return-void

    :cond_1
    const-string v5, "\u06d8\u1a7a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x54df

    const v7, -0x1e487a90

    xor-int/2addr v6, v7

    const v7, -0x4c1b3dbc

    goto :goto_0

    .line 66
    :sswitch_6
    iput-object v0, p0, Ll/ۜᩴ᩺;->ۨ:Ljava/util/HashMap;

    .line 38
    sget-boolean v5, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v5, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v5, "\u1a73\u073f"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x394f

    const v7, 0xb1d58a9

    xor-int/2addr v6, v7

    const v7, 0xbf4f193

    goto/16 :goto_0

    .line 2
    :sswitch_7
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_3
    const-string v5, "\u1a76\u06da"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x3f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xefb

    const v7, -0x51419ef1

    xor-int/2addr v6, v7

    const v7, 0x1e3b0c7c

    goto/16 :goto_0

    .line 41
    :sswitch_8
    sget v5, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u06d6\u1a7b"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x23

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2ccd

    const v7, -0x6d359e21

    xor-int/2addr v6, v7

    const v7, -0x61b0fff2    # -1.09585E-20f

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v5, :cond_6

    :cond_5
    :goto_1
    const-string v5, "\u06df\u1a7b"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x66c5

    const v7, 0x646bb91d

    xor-int/2addr v6, v7

    const v7, -0xa111586

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u1a79\u06ec"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x17

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3149

    const v7, -0x36a933b9

    xor-int/2addr v6, v7

    const v7, -0x49923b3

    goto/16 :goto_0

    .line 59
    :sswitch_a
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v5, "\u06e8\u1a77"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x2f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x30a1

    const v7, 0x134478fc

    xor-int/2addr v6, v7

    const v7, 0x56c56dff

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v5, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v5, :cond_8

    :goto_2
    const-string v5, "\u1a74\u06db"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1601

    const v7, 0x17d8ee66

    xor-int/2addr v6, v7

    const v7, 0x56e83b94

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u0733\u06d7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4073

    const v7, 0xd34f7fb

    xor-int/2addr v6, v7

    const v7, 0x6948e3ab

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_a

    :cond_9
    const-string v5, "\u06e1\u06e0"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xa5b

    const v7, -0x3482bd6a    # -1.6597654E7f

    xor-int/2addr v6, v7

    const v7, -0x5495f6fd

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a7b\u073d"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x72ef

    const v7, -0x4c6c88e9

    xor-int/2addr v6, v7

    const v7, 0xb7817c7

    goto/16 :goto_0

    .line 66
    :sswitch_d
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 27
    sget-boolean v5, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v5, :cond_c

    :cond_b
    :goto_3
    const-string v5, "\u073a\u06e8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x2b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x481b

    const v7, -0x9d7f9be

    xor-int/2addr v6, v7

    const v7, -0x590c9e92

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d9\u06d7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x3f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x592f

    const v7, -0x10b386a6

    xor-int/2addr v6, v7

    const v7, 0x48c5e6ba

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e8e85af -> :sswitch_6
        -0x770817fe -> :sswitch_7
        -0x6370aba4 -> :sswitch_4
        -0x60deb128 -> :sswitch_d
        -0x55ff9d9b -> :sswitch_0
        -0x4c6fc6c9 -> :sswitch_c
        -0x45a8aae6 -> :sswitch_a
        -0x35973d36 -> :sswitch_7
        -0x340424c0 -> :sswitch_2
        -0x336a0edb -> :sswitch_d
        -0x26b4b4db -> :sswitch_9
        -0x25e975ac -> :sswitch_6
        -0x1b721951 -> :sswitch_a
        -0xaf238f3 -> :sswitch_8
        -0x7298959 -> :sswitch_1
        0xa68c0ab -> :sswitch_3
        0x117c943e -> :sswitch_3
        0x12e63951 -> :sswitch_5
        0x22f0cc7a -> :sswitch_b
        0x243feecc -> :sswitch_9
        0x33328f5b -> :sswitch_5
        0x37c93e39 -> :sswitch_0
        0x3f8a5029 -> :sswitch_2
        0x4fca5adf -> :sswitch_b
        0x528cf127 -> :sswitch_1
        0x574421bb -> :sswitch_4
        0x73e36e17 -> :sswitch_8
        0x79dcfbb7 -> :sswitch_c
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/ۜᩴ᩺;)Ljava/util/LinkedList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜᩴ᩺;->ۙ:Ljava/util/LinkedList;

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/ۜᩴ᩺;Ljava/util/LinkedList;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۜᩴ᩺;->ۙ:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final ۖ()V
    .locals 8

    sget-object v0, Ll/ۜᩴ᩺;->ۨۛܽ:[S

    const/4 v1, 0x0

    aget-short v0, v0, v1

    mul-int/lit16 v1, v0, 0x4114

    mul-int v0, v0, v0

    const v2, 0x422ca64

    add-int/2addr v0, v2

    sub-int/2addr v1, v0

    if-lez v1, :cond_0

    const v0, 0xffa4

    const v1, 0xffa4

    goto :goto_0

    :cond_0
    const/16 v0, 0x237c

    const/16 v1, 0x237c

    .line 157
    :goto_0
    iget-object v2, p0, Ll/ۜᩴ᩺;->ۙ:Ljava/util/LinkedList;

    move-object v0, v2

    .line 158
    monitor-enter v0

    .line 159
    :try_start_0
    invoke-static {v2}, Ll/֫ܶ;->ۘ᩹֨(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 160
    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 161
    invoke-static {}, Ll/᩺ᩴ᩺;->ۙ()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    sget-object v4, Ll/ۜᩴ᩺;->ۨۛܽ:[S

    const/4 v5, 0x1

    const/16 v6, 0x9

    invoke-static {v4, v5, v6, v1}, Ll/֫ܺ;->᩶֫ۙ([SIII)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/ۜᩴ᩺;->ۨۛܽ:[S

    const/16 v6, 0xa

    const/4 v7, 0x1

    invoke-static {v5, v6, v7, v1}, Ll/ۖۗ;->᩺᩻ܰ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/ۜܶ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 166
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۙ()V
    .locals 6

    .line 199
    iget-object v1, p0, Ll/ۜᩴ᩺;->ۙ:Ljava/util/LinkedList;

    move-object v0, v1

    .line 200
    monitor-enter v0

    .line 201
    :try_start_0
    iget-object v2, p0, Ll/ۜᩴ᩺;->ܰ:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/ۘ֡;->֫᩺ܶ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-static {v2}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, Ll/֡ۛ;->ۨۤ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖ᩷᩺;

    .line 202
    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v4

    invoke-static {}, Ll/᩺ᩴ᩺;->ܰ()I

    move-result v5

    if-lt v4, v5, :cond_1

    .line 203
    monitor-exit v0

    return-void

    .line 204
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 205
    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 208
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۙ(Ll/ۖ᩷᩺;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x4a9d2279

    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    const-string v5, "\u1a73\u073f"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x23eb

    const v7, 0x6d5b19aa

    xor-int/2addr v6, v7

    const v7, -0x2263544

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x671

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v5, :cond_9

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    sget v5, Ll/ۖܽ;->ܳ۠᩹:I

    if-lez v5, :cond_5

    goto/16 :goto_5

    .line 12
    :sswitch_2
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    sget v5, Ll/֡ۛ;->۬᩸ܶ:I

    if-nez v5, :cond_c

    goto/16 :goto_2

    .line 7
    :sswitch_3
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    return-void

    .line 78
    :sswitch_5
    iget-object v5, p0, Ll/ۜᩴ᩺;->ܰ:Ljava/util/ArrayList;

    invoke-static {v5, p1}, Ll/ۖۗ;->ۨۜܰ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    .line 77
    :sswitch_6
    invoke-static {p1}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5, p1}, Ll/ۘۚ;->֫᩶ܺ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget v5, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v5, "\u1a79\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x4f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7285

    const v7, -0x2e957eb2

    xor-int/2addr v6, v7

    const v7, -0x3d534ea4

    goto :goto_0

    .line 76
    :sswitch_7
    iget-object v1, p0, Ll/ۜᩴ᩺;->ۨ:Ljava/util/HashMap;

    invoke-static {v1, v0}, Ll/֫ܶ;->ۛܿ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "\u06eb\u073a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x23

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6807

    const v7, -0x5270ef32

    xor-int/2addr v6, v7

    const v7, 0x1abb9d0b

    goto :goto_0

    :cond_1
    :goto_1
    const-string v5, "\u1a7b\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x15

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2ba1

    const v7, -0x5e949033

    xor-int/2addr v6, v7

    const v7, 0x1f64bb0f

    goto/16 :goto_0

    .line 75
    :sswitch_8
    invoke-static {p1}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 32
    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u06e8\u1a75"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6101

    const v7, -0x508c8487

    xor-int/2addr v6, v7

    const v7, 0x7f03008c

    goto/16 :goto_0

    .line 51
    :sswitch_9
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "\u1a7b\u0736"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7a41

    const v7, -0x3b7b188b

    xor-int/2addr v6, v7

    const v7, -0x260051cc

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v5

    if-nez v5, :cond_4

    :goto_2
    const-string v5, "\u06e1\u06d7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x298d

    const v7, 0x5c0f4419

    xor-int/2addr v6, v7

    const v7, -0x37160957

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06eb\u1a7b"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x3f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6a2d

    const v7, -0x65590c47

    xor-int/2addr v6, v7

    const v7, -0x2dd0be16

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_6

    :cond_5
    const-string v5, "\u06e2\u06d8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x33

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3f7b

    const v7, 0x76bbbc9c

    xor-int/2addr v6, v7

    const v7, -0x51941c22

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06e0\u06ec"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7103

    const v7, -0x5c8773ae

    xor-int/2addr v6, v7

    const v7, 0x7737fa1a

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v5, Ll/᩶;->ۚۤۘ:Z

    if-eqz v5, :cond_7

    goto :goto_4

    :cond_7
    const-string v5, "\u05a8\u06d7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x52a7

    const v7, -0x4ded0782

    xor-int/2addr v6, v7

    const v7, -0x7f257029

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v5, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u06e0\u06d7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5591

    const v7, -0x1e033c52

    xor-int/2addr v6, v7

    const v7, -0x7797f0d6

    goto/16 :goto_0

    .line 41
    :sswitch_e
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u05ab\u1a74"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x45

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3c39

    const v7, -0x1a3b476c

    xor-int/2addr v6, v7

    const v7, -0x438ddba

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a74\u073a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1575

    const v7, -0x77ffcb3a

    xor-int/2addr v6, v7

    const v7, -0x58d2c67

    goto/16 :goto_0

    .line 74
    :sswitch_f
    sget-boolean v5, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v5, :cond_b

    :goto_4
    const-string v5, "\u06e1\u06d8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x21d9

    const v7, 0x7b8995a0

    xor-int/2addr v6, v7

    const v7, -0x49d56eeb

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06e7\u1a79"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x771d

    const v7, -0x68e21a91

    xor-int/2addr v6, v7

    const v7, 0x39726688

    goto/16 :goto_0

    .line 42
    :sswitch_10
    sget-boolean v5, Ll/᩶;->ۚۤۘ:Z

    if-eqz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u05ab\u06df"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x65

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5c69

    const v7, -0x1788867a

    xor-int/2addr v6, v7

    const v7, 0x6009bf29

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a76\u05a1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5827

    const v7, -0x7527a7e8

    xor-int/2addr v6, v7

    const v7, 0x1efb4675

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x789cc6d2 -> :sswitch_3
        -0x74f0ef6b -> :sswitch_2
        -0x6ea1bb48 -> :sswitch_8
        -0x6bcd1c54 -> :sswitch_7
        -0x6bb2c5ee -> :sswitch_3
        -0x682613c9 -> :sswitch_4
        -0x63f9ca45 -> :sswitch_a
        -0x60f46bab -> :sswitch_5
        -0x445cc666 -> :sswitch_7
        -0x3edce0bc -> :sswitch_9
        -0x3d2cfcb3 -> :sswitch_6
        -0x3369b209 -> :sswitch_9
        -0x2c5bcc27 -> :sswitch_1
        -0x211ffb9c -> :sswitch_1
        -0x1d8b6d20 -> :sswitch_d
        -0x1b5110ec -> :sswitch_f
        -0xa3693cd -> :sswitch_f
        -0x6ee386b -> :sswitch_e
        0x1140fb72 -> :sswitch_d
        0x16256f45 -> :sswitch_2
        0x1b27419c -> :sswitch_6
        0x23d83912 -> :sswitch_4
        0x273a2072 -> :sswitch_b
        0x34ada752 -> :sswitch_8
        0x37622f0a -> :sswitch_e
        0x3a918c7f -> :sswitch_a
        0x3db9a0ff -> :sswitch_10
        0x40b96897 -> :sswitch_b
        0x480b85b2 -> :sswitch_c
        0x486b31d3 -> :sswitch_10
        0x52429e40 -> :sswitch_0
        0x5f502619 -> :sswitch_c
        0x71c181d7 -> :sswitch_5
        0x76491c6d -> :sswitch_0
    .end sparse-switch
.end method

.method public final declared-synchronized ۙ(Z)V
    .locals 12

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 87
    :try_start_0
    invoke-static {}, Ll/ܽܺۘ;->᩵()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 88
    monitor-exit v0

    return-void

    .line 90
    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 91
    new-instance v8, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v8}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 93
    invoke-static {}, Ll/᩺ᩴ᩺;->ܰ()I

    move-result v2

    new-array v9, v2, [Ll/ۖ᩷᩺;

    .line 94
    iget-object v2, p0, Ll/ۜᩴ᩺;->ܰ:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/ۘ֡;->֫᩺ܶ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-static {v10}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v10}, Ll/֡ۛ;->ۨۤ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ll/ۖ᩷᩺;

    .line 95
    new-instance v11, Ll/ۘᩴ᩺;

    move-object v2, v11

    move-object v3, p0

    move-object v5, v8

    move-object v6, v1

    move-object v7, v9

    invoke-direct/range {v2 .. v7}, Ll/ۘᩴ᩺;-><init>(Ll/ۜᩴ᩺;Ll/ۖ᩷᩺;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;[Ll/ۖ᩷᩺;)V

    .line 250
    sget-object v2, Ll/ۙܳ᩺;->ۨ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-interface {v2, v11}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_4

    :cond_2
    const-wide/16 v2, 0xa

    .line 136
    :try_start_2
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 137
    invoke-static {v1}, Ll/֫ܺ;->ܿᩳ᩶(Ljava/lang/Object;)I

    move-result p1

    const/4 v2, 0x1

    if-lt p1, v2, :cond_3

    goto :goto_1

    .line 139
    :cond_3
    invoke-static {v8}, Ll/֫ܺ;->ܿᩳ᩶(Ljava/lang/Object;)I

    move-result p1

    iget-object v2, p0, Ll/ۜᩴ᩺;->ܰ:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/֨᩸;->᩵۫ᩳ(Ljava/lang/Object;)I

    move-result v2
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p1, v2, :cond_2

    .line 146
    :catch_0
    :cond_4
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final ۚ()I
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ۜᩴ᩺;->ܰ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/֨᩸;->᩵۫ᩳ(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ۨ()V
    .locals 9

    sget-object v0, Ll/ۜᩴ᩺;->ۨۛܽ:[S

    const/16 v1, 0xb

    aget-short v0, v0, v1

    add-int/lit8 v1, v0, 0x1

    mul-int v1, v1, v1

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    sub-int/2addr v0, v1

    if-lez v0, :cond_0

    const/16 v0, 0xbe8

    goto :goto_0

    :cond_0
    const/16 v0, 0x6e3c

    .line 170
    :goto_0
    invoke-static {}, Ll/᩺ᩴ᩺;->ۙ()Landroid/content/SharedPreferences;

    move-result-object v1

    sget-object v2, Ll/ۜᩴ᩺;->ۨۛܽ:[S

    const/16 v3, 0xc

    const/16 v4, 0x9

    invoke-static {v2, v3, v4, v0}, Ll/ۖ᩸;->ۧۛۘ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Ll/ۘۛ;->ۖܺ᩹(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 171
    invoke-static {}, Ll/᩺ᩴ᩺;->ۙ()Landroid/content/SharedPreferences;

    move-result-object v2

    sget-object v3, Ll/ۜᩴ᩺;->ۨۛܽ:[S

    const/16 v4, 0x15

    const/16 v5, 0x11

    invoke-static {v3, v4, v5, v0}, Ll/֨᩺;->ۧۖܿ([SIII)Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-static {}, Ll/֫;->ᩴ᩶۟()J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v7, 0x1

    cmp-long v8, v2, v4

    if-gez v8, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v1, :cond_3

    sget-object v3, Ll/ۜᩴ᩺;->ۨۛܽ:[S

    const/16 v4, 0x26

    const/4 v5, 0x2

    invoke-static {v3, v4, v5, v0}, Ll/֡ۚ;->ۖ᩶ܿ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 174
    invoke-static {v1, v0}, Ll/֡ܳ;->۫۬᩺(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v1

    array-length v3, v1

    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_3

    aget-object v0, v1, v4

    .line 83
    iget-object v5, p0, Ll/ۜᩴ᩺;->ۨ:Ljava/util/HashMap;

    invoke-static {v5, v0}, Ll/ۖۛ;->ۜ۟ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ll/ۖ᩷᩺;

    if-eqz v5, :cond_2

    .line 177
    iget-object v0, p0, Ll/ۜᩴ᩺;->ۙ:Ljava/util/LinkedList;

    monitor-enter v0

    .line 178
    :try_start_0
    iget-object v8, p0, Ll/ۜᩴ᩺;->ۙ:Ljava/util/LinkedList;

    invoke-virtual {v8, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 179
    monitor-exit v0

    goto :goto_3

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 189
    :cond_3
    iget-object v0, p0, Ll/ۜᩴ᩺;->ۙ:Ljava/util/LinkedList;

    invoke-static {v0}, Ll/ۘۚ;->᩻ۗۜ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    move v7, v2

    .line 192
    :goto_4
    invoke-virtual {p0}, Ll/ۜᩴ᩺;->ۙ()V

    if-eqz v7, :cond_5

    .line 195
    invoke-virtual {p0, v6}, Ll/ۜᩴ᩺;->ۙ(Z)V

    :cond_5
    return-void
.end method

.method public final ܰ()Ll/ۖ᩷᩺;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x14081e7a

    sget v2, Ll/֨ܰ;->ۢ᩷۟:I

    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    const-string v4, "\u1a74\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xf4b

    const v6, -0x7f58f2f2

    xor-int/2addr v5, v6

    const v6, 0xb2448a7

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit8 v1, v1, -0x5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_9

    goto/16 :goto_2

    :sswitch_0
    sget-boolean v4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v4, :cond_7

    goto/16 :goto_3

    .line 111
    :sswitch_1
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_a

    goto/16 :goto_3

    .line 73
    :sswitch_2
    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v4, :cond_c

    goto/16 :goto_2

    .line 63
    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    goto/16 :goto_2

    .line 11
    :sswitch_4
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/4 v4, 0x1

    .line 150
    invoke-virtual {p0, v4}, Ll/ۜᩴ᩺;->ۙ(Z)V

    .line 151
    invoke-virtual {p0}, Ll/ۜᩴ᩺;->ۙ()V

    goto :goto_1

    .line 153
    :sswitch_6
    iget-object v0, p0, Ll/ۜᩴ᩺;->ۙ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖ᩷᩺;

    return-object v0

    .line 149
    :sswitch_7
    invoke-static {v0}, Ll/֫ܶ;->ۘ᩹֨(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u06dc\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x41b

    const v6, 0x64b0861

    xor-int/2addr v5, v6

    const v6, -0x2ab747b3

    goto :goto_0

    :cond_0
    :goto_1
    const-string v4, "\u06dc\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x75c3

    const v6, 0x3159f2c6

    xor-int/2addr v5, v6

    const v6, -0x31bdf363

    goto :goto_0

    .line 39
    :sswitch_8
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_1

    const-string v4, "\u06db\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x120f

    const v6, 0x1b7c66ec

    xor-int/2addr v5, v6

    const v6, 0x1d437c34

    goto/16 :goto_0

    :cond_1
    const-string v4, "\u06dc\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x75b5

    const v6, 0x15246d5a

    xor-int/2addr v5, v6

    const v6, 0x1c402d6d

    goto/16 :goto_0

    .line 71
    :sswitch_9
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06e0\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1633

    const v6, 0x22114c10

    xor-int/2addr v5, v6

    const v6, -0x2682d27b

    goto/16 :goto_0

    .line 151
    :sswitch_a
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u1a7a\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x47ed

    const v6, -0x26a3eb6e

    xor-int/2addr v5, v6

    const v6, -0x58c64ace

    goto/16 :goto_0

    .line 112
    :sswitch_b
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u06e7\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1db5

    const v6, -0x74fdd338

    xor-int/2addr v5, v6

    const v6, -0x74562701

    goto/16 :goto_0

    .line 5
    :sswitch_c
    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06e7\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x164d

    const v6, 0x2ef2aac9

    xor-int/2addr v5, v6

    const v6, -0x31a3b5f7

    goto/16 :goto_0

    .line 44
    :sswitch_d
    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u06df\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7a3f

    const v6, -0x48f70075

    xor-int/2addr v5, v6

    const v6, -0x76eff023

    goto/16 :goto_0

    .line 122
    :sswitch_e
    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_8

    :cond_7
    const-string v4, "\u06dc\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x46c3

    const v6, 0xb146ea6

    xor-int/2addr v5, v6

    const v6, 0x14962acd

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06eb\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x45fb

    const v6, 0x55f7b808

    xor-int/2addr v5, v6

    const v6, 0x48297dba

    goto/16 :goto_0

    :goto_2
    const-string v4, "\u1a7a\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2f65

    const v6, 0x70066fa1

    xor-int/2addr v5, v6

    const v6, 0x742b505e

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a75\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x899

    const v6, 0x7ee53262

    xor-int/2addr v5, v6

    const v6, 0x2502ebb5

    goto/16 :goto_0

    .line 12
    :sswitch_f
    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v4, :cond_b

    :cond_a
    const-string v4, "\u06dc\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3361

    const v6, -0x4fb88a70

    xor-int/2addr v5, v6

    const v6, 0x43bba30a

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a79\u05ab"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5679

    const v6, -0x2f08d517

    xor-int/2addr v5, v6

    const v6, -0x32e55544

    goto/16 :goto_0

    .line 149
    :sswitch_10
    iget-object v0, p0, Ll/ۜᩴ᩺;->ۙ:Ljava/util/LinkedList;

    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_d

    :cond_c
    :goto_3
    const-string v4, "\u05ab\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x38c3

    const v6, 0x3aad0b09

    xor-int/2addr v5, v6

    const v6, 0x23aabf57

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u073d\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x69e3

    const v6, 0x63e6429d

    xor-int/2addr v5, v6

    const v6, -0x1de77215

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x783b04ca -> :sswitch_9
        -0x75540460 -> :sswitch_10
        -0x6dd68e2e -> :sswitch_f
        -0x67d6623f -> :sswitch_3
        -0x56b30891 -> :sswitch_8
        -0x5504f54e -> :sswitch_5
        -0x5322c506 -> :sswitch_a
        -0x51aaa225 -> :sswitch_3
        -0x4e1034cd -> :sswitch_b
        -0x3a9e0d5b -> :sswitch_7
        -0x3a3e4118 -> :sswitch_8
        -0x39214daf -> :sswitch_a
        -0x2cb45412 -> :sswitch_9
        -0x12021cdf -> :sswitch_1
        -0x6de2c6f -> :sswitch_c
        -0x15950c8 -> :sswitch_d
        -0x129431a -> :sswitch_5
        0x8bf35f9 -> :sswitch_4
        0xa74fb13 -> :sswitch_10
        0x162314d9 -> :sswitch_6
        0x22c3c895 -> :sswitch_4
        0x367b93c8 -> :sswitch_6
        0x379afd3d -> :sswitch_d
        0x427dcccc -> :sswitch_2
        0x4cc04b0f -> :sswitch_c
        0x4ea1d723 -> :sswitch_2
        0x5530a3c4 -> :sswitch_e
        0x5b095969 -> :sswitch_f
        0x63a3f731 -> :sswitch_0
        0x63f39f90 -> :sswitch_7
        0x67070700 -> :sswitch_e
        0x6b259831 -> :sswitch_1
        0x6d72a1be -> :sswitch_0
        0x7ef2733e -> :sswitch_b
    .end sparse-switch
.end method

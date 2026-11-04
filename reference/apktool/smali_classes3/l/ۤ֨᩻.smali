.class public final Ll/ۤ֨᩻;
.super Ljava/lang/Object;
.source "D20P"


# static fields
.field private static final ۘܰܿ:[S


# instance fields
.field public ۙ:Ljava/util/LinkedList;

.field public ۤ:Ljava/util/HashMap;

.field public ᩷:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x28

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۤ֨᩻;->ۘܰܿ:[S

    return-void

    :array_0
    .array-data 2
        0x87es
        0xcf6s
        0xcf1s
        0xce3s
        0xce4s
        0xccfs
        0xce5s
        0xce2s
        0xcfcs
        0xce3s
        0xcf6s
        0xcf1s
        0xce3s
        0xce4s
        0xccfs
        0xce5s
        0xce2s
        0xcfcs
        0xce3s
        0xccfs
        0xcf5s
        0xce8s
        0xce0s
        0xcf9s
        0xce2s
        0xcf5s
        0xcf4s
        0xcccs
        0xcecs
        0x2707s
        0x709cs
        0x709bs
        0x7089s
        0x708es
        0x70a5s
        0x708fs
        0x7088s
        0x7096s
        0x7089s
        0x7086s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x2f3f5dbe

    sget v3, Ll/ۖ;->ܿۚ֡:I

    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v5, "\u06d9\u0736"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0xd

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2ead

    const v7, 0x3b6f8576

    xor-int/2addr v6, v7

    const v7, -0x42f95366

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x418f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 23
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v5

    if-gtz v5, :cond_b

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    sget v5, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v5, :cond_9

    goto/16 :goto_3

    .line 24
    :sswitch_2
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    sget-boolean v5, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v5, :cond_7

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    goto/16 :goto_2

    .line 67
    :sswitch_4
    iput-object v1, p0, Ll/ۤ֨᩻;->᩷:Ljava/util/ArrayList;

    .line 68
    new-instance v5, Ljava/util/LinkedList;

    .line 32
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v6

    if-nez v6, :cond_0

    goto/16 :goto_5

    .line 68
    :cond_0
    invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V

    iput-object v5, p0, Ll/ۤ֨᩻;->ۙ:Ljava/util/LinkedList;

    return-void

    .line 67
    :sswitch_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v5, :cond_1

    goto :goto_1

    :cond_1
    const-string v5, "\u06e7\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x1f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6e97

    const v7, -0x4048ecf3

    xor-int/2addr v6, v7

    const v7, -0x4312dadf

    goto :goto_0

    .line 66
    :sswitch_6
    iput-object v0, p0, Ll/ۤ֨᩻;->ۤ:Ljava/util/HashMap;

    .line 62
    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u05a8\u1a7a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x777

    const v7, 0xb84edce

    xor-int/2addr v6, v7

    const v7, 0x7ce6d1aa

    goto/16 :goto_0

    .line 66
    :sswitch_7
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "\u06e7\u06dc"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7467

    const v7, 0x4cee09d8    # 1.248007E8f

    xor-int/2addr v6, v7

    const v7, -0x32cc96a6

    goto/16 :goto_0

    .line 24
    :sswitch_8
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v5

    if-nez v5, :cond_4

    :goto_1
    const-string v5, "\u06d7\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x600d

    const v7, -0x4ecf7ebe

    xor-int/2addr v6, v7

    const v7, 0x264d2a6d

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06e4\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x57

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x50c9

    const v7, 0x5e3aed47

    xor-int/2addr v6, v7

    const v7, -0x28a94c6e

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_5

    goto :goto_2

    :cond_5
    const-string v5, "\u06db\u1a79"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x62b

    const v7, -0x3e09239e

    xor-int/2addr v6, v7

    const v7, -0x29988466

    goto/16 :goto_0

    .line 27
    :sswitch_a
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v5

    if-eqz v5, :cond_6

    :goto_2
    const-string v5, "\u06ec\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4779

    const v7, -0x1cf67f65

    xor-int/2addr v6, v7

    const v7, -0x29a94eda

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u1a75\u06dc"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x59

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4b2f

    const v7, -0x2607213c

    xor-int/2addr v6, v7

    const v7, 0x656ac9c0

    goto/16 :goto_0

    .line 31
    :sswitch_b
    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v5, :cond_8

    :cond_7
    :goto_3
    const-string v5, "\u06d7\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x11bd

    const v7, 0x35a7734c

    xor-int/2addr v6, v7

    const v7, -0x3ba7cda9

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06d8\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x1b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x29cd

    const v7, -0x23cd84c7

    xor-int/2addr v6, v7

    const v7, 0x5ad67ce3

    goto/16 :goto_0

    .line 10
    :sswitch_c
    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_a

    :cond_9
    :goto_4
    const-string v5, "\u1a74\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x901

    const v7, -0x66f038f7

    xor-int/2addr v6, v7

    const v7, 0x1ff3b87d

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a7b\u06ec"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x53ad

    const v7, -0x7241031a

    xor-int/2addr v6, v7

    const v7, -0x6501e59a

    goto/16 :goto_0

    .line 66
    :sswitch_d
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 56
    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u06d7\u06e1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x9

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x37f

    const v7, 0x4c179ca1    # 3.9744132E7f

    xor-int/2addr v6, v7

    const v7, 0x507e9265

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a77\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5e13

    const v7, -0x1de3dd80

    xor-int/2addr v6, v7

    const v7, -0x4c7a6a37

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77c7922e -> :sswitch_0
        -0x7781125b -> :sswitch_b
        -0x69377093 -> :sswitch_1
        -0x6018970c -> :sswitch_2
        -0x5f0ef948 -> :sswitch_7
        -0x5ddfb53a -> :sswitch_4
        -0x5b061233 -> :sswitch_8
        -0x50167a5d -> :sswitch_9
        -0x414039e3 -> :sswitch_3
        -0x3c388758 -> :sswitch_d
        -0x2f5d2d12 -> :sswitch_1
        -0x25705157 -> :sswitch_4
        -0x179ca6e2 -> :sswitch_b
        0xde343a7 -> :sswitch_a
        0xe7860d1 -> :sswitch_5
        0x13103ae4 -> :sswitch_c
        0x1db857e2 -> :sswitch_9
        0x2b64981d -> :sswitch_2
        0x2baf5fda -> :sswitch_7
        0x3bd91113 -> :sswitch_c
        0x3d8654b3 -> :sswitch_6
        0x4c49bc00 -> :sswitch_a
        0x4d242b86 -> :sswitch_6
        0x4e6bacd8 -> :sswitch_3
        0x69c65599 -> :sswitch_8
        0x75038361 -> :sswitch_d
        0x7beda6e1 -> :sswitch_5
        0x7d2b268e -> :sswitch_0
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/ۤ֨᩻;)Ljava/util/LinkedList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤ֨᩻;->ۙ:Ljava/util/LinkedList;

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/ۤ֨᩻;Ljava/util/LinkedList;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۤ֨᩻;->ۙ:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 6

    .line 199
    iget-object v1, p0, Ll/ۤ֨᩻;->ۙ:Ljava/util/LinkedList;

    move-object v0, v1

    .line 200
    monitor-enter v0

    .line 201
    :try_start_0
    iget-object v2, p0, Ll/ۤ֨᩻;->᩷:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/ۘܽ;->ۘ֨᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-static {v2}, Ll/֫ۢ;->᩷ۤ᩷(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, Ll/ۘܶ;->֡۟ۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬۬᩻;

    .line 202
    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v4

    invoke-static {}, Ll/᩸֨᩻;->᩷()I

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

.method public final ۙ(Ll/۬۬᩻;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x5d99fb3

    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    const-string v5, "\u073d\u1a77"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x753d

    const v7, 0x6bc905ab

    xor-int/2addr v6, v7

    const v7, -0x7dac8d75

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x26c5

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v5

    if-eqz v5, :cond_4

    goto/16 :goto_5

    :sswitch_0
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-lez v5, :cond_5

    goto :goto_1

    .line 37
    :sswitch_1
    sget-boolean v5, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v5, :cond_b

    goto/16 :goto_5

    .line 24
    :sswitch_2
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget-boolean v5, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v5, :cond_0

    goto/16 :goto_5

    .line 55
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    goto/16 :goto_5

    .line 63
    :sswitch_4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    return-void

    .line 78
    :sswitch_5
    iget-object v5, p0, Ll/ۤ֨᩻;->᩷:Ljava/util/ArrayList;

    invoke-static {v5, p1}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_2

    .line 77
    :sswitch_6
    invoke-static {p1}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5, p1}, Ll/֨᩻;->֫ۙ᩸(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-boolean v5, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v5, :cond_1

    :cond_0
    :goto_1
    const-string v5, "\u05a1\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3b6b

    const v7, -0x424ca921

    xor-int/2addr v6, v7

    const v7, -0xf063128

    goto :goto_0

    :cond_1
    const-string v5, "\u06e4\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x9

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3805

    const v7, 0x72abe82c

    xor-int/2addr v6, v7

    const v7, 0x75243ad9

    goto :goto_0

    :sswitch_7
    return-void

    .line 76
    :sswitch_8
    iget-object v1, p0, Ll/ۤ֨᩻;->ۤ:Ljava/util/HashMap;

    invoke-static {v1, v0}, Ll/ܽ;->۠ۧ۫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "\u1a7a\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x15

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x8e1

    const v7, 0x784d3fad

    xor-int/2addr v6, v7

    const v7, 0x68b5aaab

    goto/16 :goto_0

    :cond_2
    :goto_2
    const-string v5, "\u05a8\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7551

    const v7, -0x23af086

    xor-int/2addr v6, v7

    const v7, -0x5756a917

    goto/16 :goto_0

    .line 75
    :sswitch_9
    invoke-static {p1}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v5

    if-nez v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u1a76\u1a76"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4eff

    const v7, -0x32e8f013

    xor-int/2addr v6, v7

    const v7, 0x41f4240

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06e2\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x76ed

    const v7, 0x22cda141

    xor-int/2addr v6, v7

    const v7, -0x405cfe9d

    goto/16 :goto_0

    .line 50
    :sswitch_a
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v5

    if-eqz v5, :cond_6

    :cond_5
    const-string v5, "\u0730\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x25

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3faf

    const v7, 0x692f2dbb

    xor-int/2addr v6, v7

    const v7, 0x78c019c5

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u0736\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x72bb

    const v7, -0x5d2c696a

    xor-int/2addr v6, v7

    const v7, 0x12845168

    goto/16 :goto_0

    .line 15
    :sswitch_b
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u06df\u073f"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0xf

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x43c3

    const v7, -0x71f9fff2

    xor-int/2addr v6, v7

    const v7, 0x49388d7e    # 755927.9f

    goto/16 :goto_0

    .line 61
    :sswitch_c
    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u06df\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5d75

    const v7, 0x5f2044ba

    xor-int/2addr v6, v7

    const v7, -0x48cec8e5

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v5

    if-ltz v5, :cond_9

    goto :goto_4

    :cond_9
    const-string v5, "\u05a8\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x607b

    const v7, 0x38f9849a

    xor-int/2addr v6, v7

    const v7, -0x2b1a3c47

    goto/16 :goto_0

    .line 54
    :sswitch_e
    sget v5, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v5, :cond_a

    :goto_3
    const-string v5, "\u06d9\u1a78"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x13f7

    const v7, 0x6dfb75af

    xor-int/2addr v6, v7

    const v7, 0x862d094

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06ec\u06d8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x7f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x71fd

    const v7, -0x7214dc66

    xor-int/2addr v6, v7

    const v7, 0x6ce59829

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v5

    if-gtz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u1a73\u0736"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x730b

    const v7, -0x646d0999

    xor-int/2addr v6, v7

    const v7, -0x7c2c9c9c

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u0736\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x19f

    const v7, 0x5831ba9d

    xor-int/2addr v6, v7

    const v7, -0x559703cc

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v5

    if-eqz v5, :cond_d

    :goto_5
    const-string v5, "\u06dc\u06d7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x616d

    const v7, -0x331f8520    # -1.1769216E8f

    xor-int/2addr v6, v7

    const v7, -0x267fc3e

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06e8\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1aa7

    const v7, -0x504beb33

    xor-int/2addr v6, v7

    const v7, -0x5678f640

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79c02d64 -> :sswitch_8
        -0x7008c062 -> :sswitch_2
        -0x65bc916d -> :sswitch_1
        -0x62b89af9 -> :sswitch_a
        -0x6202db83 -> :sswitch_b
        -0x5760bf2c -> :sswitch_10
        -0x56e36f3e -> :sswitch_2
        -0x53aa8d82 -> :sswitch_9
        -0x53431005 -> :sswitch_4
        -0x494edbf9 -> :sswitch_e
        -0x458eb602 -> :sswitch_f
        -0x422ac72f -> :sswitch_6
        -0x3968fdb7 -> :sswitch_5
        -0x29b0b46d -> :sswitch_3
        -0x269632d8 -> :sswitch_7
        -0x2320158c -> :sswitch_0
        -0x20de0d9a -> :sswitch_d
        -0x1191bb90 -> :sswitch_4
        -0x1d64257 -> :sswitch_c
        0x8aa8905 -> :sswitch_a
        0x15c2d837 -> :sswitch_6
        0x22aef6ae -> :sswitch_0
        0x2ed0c405 -> :sswitch_8
        0x4838a20c -> :sswitch_5
        0x486f9d3d -> :sswitch_10
        0x50d4a2c2 -> :sswitch_b
        0x528c6770 -> :sswitch_c
        0x52d772ce -> :sswitch_f
        0x5458aed6 -> :sswitch_7
        0x6c57821a -> :sswitch_3
        0x73204fdc -> :sswitch_e
        0x75f388f4 -> :sswitch_d
        0x7cb09777 -> :sswitch_9
        0x7dd54d15 -> :sswitch_1
    .end sparse-switch
.end method

.method public final declared-synchronized ۙ(Z)V
    .locals 12

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 87
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->᩵()Z

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
    invoke-static {}, Ll/᩸֨᩻;->᩷()I

    move-result v2

    new-array v9, v2, [Ll/۬۬᩻;

    .line 94
    iget-object v2, p0, Ll/ۤ֨᩻;->᩷:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/֨ᩳ;->ۛۙۙ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-static {v10}, Ll/ۘ۟;->ᩳۘ᩸(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v10}, Ll/ۘܶ;->֡۟ۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ll/۬۬᩻;

    .line 95
    new-instance v11, Ll/᩷֨᩻;

    move-object v2, v11

    move-object v3, p0

    move-object v5, v8

    move-object v6, v1

    move-object v7, v9

    invoke-direct/range {v2 .. v7}, Ll/᩷֨᩻;-><init>(Ll/ۤ֨᩻;Ll/۬۬᩻;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;[Ll/۬۬᩻;)V

    .line 250
    sget-object v2, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/concurrent/ThreadPoolExecutor;

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
    invoke-static {v1}, Ll/֨᩻;->۬ۛܽ(Ljava/lang/Object;)I

    move-result p1

    const/4 v2, 0x1

    if-lt p1, v2, :cond_3

    goto :goto_1

    .line 139
    :cond_3
    invoke-static {v8}, Ll/֨᩻;->۬ۛܽ(Ljava/lang/Object;)I

    move-result p1

    iget-object v2, p0, Ll/ۤ֨᩻;->᩷:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/ۖܰ;->ۨۡܳ(Ljava/lang/Object;)I

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

.method public final ۤ()V
    .locals 9

    sget-object v0, Ll/ۤ֨᩻;->ۘܰܿ:[S

    const/4 v1, 0x0

    aget-short v0, v0, v1

    mul-int/lit16 v1, v0, 0x7916

    mul-int v0, v0, v0

    const v2, 0xe517379

    add-int/2addr v0, v2

    sub-int/2addr v1, v0

    if-lez v1, :cond_0

    const/16 v0, 0x7b14

    goto :goto_0

    :cond_0
    const/16 v0, 0xc90

    .line 170
    :goto_0
    invoke-static {}, Ll/᩸֨᩻;->ۙ()Landroid/content/SharedPreferences;

    move-result-object v1

    sget-object v2, Ll/ۤ֨᩻;->ۘܰܿ:[S

    const/4 v3, 0x1

    const/16 v4, 0x9

    invoke-static {v2, v3, v4, v0}, Ll/֫۠;->۟ܿۖ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Ll/֨ۚ;->ۛ᩻ۚ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 171
    invoke-static {}, Ll/᩸֨᩻;->ۙ()Landroid/content/SharedPreferences;

    move-result-object v2

    sget-object v3, Ll/ۤ֨᩻;->ۘܰܿ:[S

    const/16 v4, 0xa

    const/16 v5, 0x11

    invoke-static {v3, v4, v5, v0}, Ll/֫ۤ;->ܽ۠ۙ([SIII)Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-static {}, Ll/ۗܰ;->ܳܰۚ()J

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

    sget-object v3, Ll/ۤ֨᩻;->ۘܰܿ:[S

    const/16 v4, 0x1b

    const/4 v5, 0x2

    invoke-static {v3, v4, v5, v0}, Ll/֡ᩴ;->ۚ᩹ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 174
    invoke-static {v1, v0}, Ll/ۖ᩵;->ܺۚ۟(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v1

    array-length v3, v1

    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_3

    aget-object v0, v1, v4

    .line 83
    iget-object v5, p0, Ll/ۤ֨᩻;->ۤ:Ljava/util/HashMap;

    invoke-static {v5, v0}, Ll/֡۟;->ۤ֫ܺ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ll/۬۬᩻;

    if-eqz v5, :cond_2

    .line 177
    iget-object v0, p0, Ll/ۤ֨᩻;->ۙ:Ljava/util/LinkedList;

    monitor-enter v0

    .line 178
    :try_start_0
    iget-object v8, p0, Ll/ۤ֨᩻;->ۙ:Ljava/util/LinkedList;

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
    iget-object v0, p0, Ll/ۤ֨᩻;->ۙ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    move v7, v2

    .line 192
    :goto_4
    invoke-virtual {p0}, Ll/ۤ֨᩻;->ۙ()V

    if-eqz v7, :cond_5

    .line 195
    invoke-virtual {p0, v6}, Ll/ۤ֨᩻;->ۙ(Z)V

    :cond_5
    return-void
.end method

.method public final ᩴ()I
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ۤ֨᩻;->᩷:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۖܰ;->ۨۡܳ(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ᩷()Ll/۬۬᩻;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x1b398622

    sget v2, Ll/ۖۗ;->᩻ܳܶ:I

    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    const-string v4, "\u1a7a\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3cab

    const v6, 0x57646be2

    xor-int/2addr v5, v6

    const v6, -0x7bd3fce8

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x7ea9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 149
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u06df\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5b05

    const v6, 0x661f7e6d

    xor-int/2addr v5, v6

    const v6, -0x2165f1db

    goto :goto_0

    :sswitch_0
    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_9

    goto/16 :goto_4

    .line 124
    :sswitch_2
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v4, :cond_c

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/4 v4, 0x1

    .line 150
    invoke-virtual {p0, v4}, Ll/ۤ֨᩻;->ۙ(Z)V

    .line 151
    invoke-virtual {p0}, Ll/ۤ֨᩻;->ۙ()V

    goto :goto_1

    .line 153
    :sswitch_6
    iget-object v0, p0, Ll/ۤ֨᩻;->ۙ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬۬᩻;

    return-object v0

    :cond_0
    :goto_1
    const-string v4, "\u073f\u0736"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4a7f

    const v6, 0x49032977

    xor-int/2addr v5, v6

    const v6, 0x3a1f0987

    goto :goto_0

    .line 22
    :sswitch_7
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "\u1a79\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5a19

    const v6, 0x4ad30a89    # 6915396.5f

    xor-int/2addr v5, v6

    const v6, 0x205449c0

    goto/16 :goto_0

    :cond_1
    const-string v4, "\u0736\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7439

    const v6, 0x2e64c525

    xor-int/2addr v5, v6

    const v6, 0x52530d06

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u0736\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3187

    const v6, 0x56988fb8

    xor-int/2addr v5, v6

    const v6, 0x14ea124e

    goto/16 :goto_0

    .line 124
    :sswitch_9
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_4

    :cond_3
    :goto_2
    const-string v4, "\u05a1\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x17fb

    const v6, 0x1e6bf40b

    xor-int/2addr v5, v6

    const v6, -0x7ffeafcf

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u05a1\u1a75"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7a65

    const v6, -0x52033914

    xor-int/2addr v5, v6

    const v6, 0x4f292b8b

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_5
    const-string v4, "\u06e4\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2fb9

    const v6, -0x3af0af6a

    xor-int/2addr v5, v6

    const v6, 0x2776ba80

    goto/16 :goto_0

    .line 97
    :sswitch_b
    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u06d6\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3097

    const v6, 0x15aac3f

    xor-int/2addr v5, v6

    const v6, 0x1a3b6fdb

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u06e8\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x11

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1d27

    const v6, 0x73894140

    xor-int/2addr v5, v6

    const v6, -0x1a81b6a0

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u06ec\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6877

    const v6, 0x4624ebc0    # 10554.9375f

    xor-int/2addr v5, v6

    const v6, -0x4ffefc4f

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u06e8\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7371

    const v6, -0x2a6de81c

    xor-int/2addr v5, v6

    const v6, -0xfa751fc

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u05a1\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x2b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4793

    const v6, 0xce6c2b5

    xor-int/2addr v5, v6

    const v6, 0x7905db3c

    goto/16 :goto_0

    .line 53
    :sswitch_f
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v4

    if-eqz v4, :cond_b

    :goto_4
    const-string v4, "\u06e0\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3d13

    const v6, -0x41decf86

    xor-int/2addr v5, v6

    const v6, 0x600719f8

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u05a1\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6e3

    const v6, -0x4be18ae4

    xor-int/2addr v5, v6

    const v6, -0x51053cca

    goto/16 :goto_0

    .line 149
    :sswitch_10
    iget-object v0, p0, Ll/ۤ֨᩻;->ۙ:Ljava/util/LinkedList;

    .line 41
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u06e4\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6b99

    const v6, 0x581ebaa

    xor-int/2addr v5, v6

    const v6, -0x2e34b094

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e8\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x2d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x696d

    const v6, 0x10f6d9aa

    xor-int/2addr v5, v6

    const v6, -0x6a384976

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fe439f7 -> :sswitch_3
        -0x73b5804f -> :sswitch_f
        -0x6c08866e -> :sswitch_1
        -0x64815fb9 -> :sswitch_e
        -0x42f31556 -> :sswitch_e
        -0x3dc2f028 -> :sswitch_3
        -0x3293b6f4 -> :sswitch_5
        -0x32198781 -> :sswitch_4
        -0x3136d272 -> :sswitch_8
        -0x3047c099 -> :sswitch_2
        -0x2d9aa7ef -> :sswitch_5
        -0x28e4df94 -> :sswitch_10
        -0x27a99c24 -> :sswitch_b
        -0x1f32797f -> :sswitch_f
        -0x1f2e3cae -> :sswitch_2
        -0x1534db65 -> :sswitch_9
        -0xab9d1b1 -> :sswitch_b
        0x540d947 -> :sswitch_6
        0x9cd29db -> :sswitch_a
        0xae058b9 -> :sswitch_7
        0x14d9621b -> :sswitch_4
        0x15f0e19a -> :sswitch_d
        0x20c45110 -> :sswitch_c
        0x277b4330 -> :sswitch_d
        0x2a2414b1 -> :sswitch_10
        0x33a1ee9b -> :sswitch_0
        0x375194b8 -> :sswitch_c
        0x3a431640 -> :sswitch_0
        0x439c3727 -> :sswitch_1
        0x467de3cf -> :sswitch_9
        0x4ec17a29 -> :sswitch_6
        0x4fd99c9a -> :sswitch_8
        0x60346052 -> :sswitch_7
        0x77e2af45 -> :sswitch_a
    .end sparse-switch
.end method

.method public final ᩸()V
    .locals 8

    sget-object v0, Ll/ۤ֨᩻;->ۘܰܿ:[S

    const/16 v1, 0x1d

    aget-short v0, v0, v1

    mul-int v1, v0, v0

    const v2, 0xa9681

    add-int/2addr v1, v2

    mul-int/lit16 v0, v0, 0x682

    sub-int/2addr v1, v0

    if-ltz v1, :cond_0

    const/16 v0, 0x70fa

    const/16 v1, 0x70fa

    goto :goto_0

    :cond_0
    const/16 v0, 0x57a9

    const/16 v1, 0x57a9

    .line 157
    :goto_0
    iget-object v2, p0, Ll/ۤ֨᩻;->ۙ:Ljava/util/LinkedList;

    move-object v0, v2

    .line 158
    monitor-enter v0

    .line 159
    :try_start_0
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 160
    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 161
    invoke-static {}, Ll/᩸֨᩻;->ۙ()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    sget-object v4, Ll/ۤ֨᩻;->ۘܰܿ:[S

    const/16 v5, 0x1e

    const/16 v6, 0x9

    invoke-static {v4, v5, v6, v1}, Ll/ۗ֡;->ۘ᩺ۘ([SIII)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/ۤ֨᩻;->ۘܰܿ:[S

    const/16 v6, 0x27

    const/4 v7, 0x1

    invoke-static {v5, v6, v7, v1}, Ll/֡۟;->ᩳۧܳ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/᩺ۨۨ;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

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

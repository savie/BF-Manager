.class public Ll/֡֡ۨ;
.super Ll/۫ܶۘ;
.source "14V2"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# static fields
.field private static final ۗ֨ܿ:[S

.field public static final synthetic ᩹ܰ:I


# instance fields
.field public ۖܰ:Ll/᩶֡ۨ;

.field public ۚܰ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2e

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    return-void

    :array_0
    .array-data 2
        0x1be9s
        -0x551fs
        0x42e2s
        0x4f0cs
        -0x5bfds
        -0x5b36s
        -0x40cfs
        0x7a47s
        0x4a55s
        -0x4ec4s
        0x21a9s
        0x3ba0s
        -0x3eb8s
        -0x23a1s
        0x1813s
        0x48dcs
        -0x4d68s
        -0x41a6s
        0x5c67s
        -0x473es
        -0x50ecs
        0x114cs
        -0x281s
        -0x68es
        0x1731s
        -0x10b9s
        -0x868s
        0x15abs
        0x147as
        -0x1e96s
        -0x1eb9s
        -0x1eb3s
        -0x1ea6s
        -0x1eb9s
        -0x1ebfs
        -0x1ec0s
        -0x1eb1s
        -0x1ea4s
        -0x1ea9s
        -0x1e9ds
        -0x1eb1s
        -0x1ec0s
        -0x1eb1s
        -0x1eb7s
        -0x1eb5s
        -0x1ea4s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Ll/۫ܶۘ;-><init>()V

    .line 34
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/֡֡ۨ;->ۚܰ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/֡֡ۨ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡֡ۨ;->ۚܰ:Ljava/util/List;

    return-object p0
.end method

.method public static ۙ(Ll/֡֡ۨ;Ll/֡ۙۖ;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x2011cb75

    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v4, "\u1a74\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x47a3

    const v6, 0x4a010269    # 2113690.2f

    xor-int/2addr v5, v6

    const v6, 0x7539d2dc

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x6afb

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 141
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v4

    if-lez v4, :cond_a

    goto/16 :goto_1

    .line 74
    :sswitch_0
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-eqz v4, :cond_7

    goto/16 :goto_3

    .line 83
    :sswitch_1
    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-lez v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u06e7\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x24bb

    const v6, -0x43441745

    xor-int/2addr v5, v6

    const v6, 0x16dd811

    goto :goto_0

    .line 65
    :sswitch_2
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    goto :goto_1

    .line 118
    :sswitch_3
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    return-void

    .line 120
    :sswitch_4
    iget-object p0, p0, Ll/֡֡ۨ;->ۖܰ:Ll/᩶֡ۨ;

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    .line 119
    :sswitch_5
    invoke-static {}, Ll/ۙܰۖ;->ۙ()Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Ll/֡֡ۨ;->ۚܰ:Ljava/util/List;

    .line 19
    sget-boolean v4, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u06d7\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5aa7

    const v6, -0x1104cd4

    xor-int/2addr v5, v6

    const v6, -0x16088abc

    goto :goto_0

    .line 168
    :sswitch_6
    invoke-static {v0}, Ll/ۗᩳ;->֫۠᩶(Ljava/lang/Object;)Z

    .line 110
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06ec\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7ef1

    const v6, -0x59040540

    xor-int/2addr v5, v6

    const v6, 0x61510484

    goto/16 :goto_0

    .line 168
    :sswitch_7
    invoke-virtual {p1}, Ll/֡ۙۖ;->ܰ()Ll/᩷۠ۚ;

    move-result-object v0

    .line 68
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u1a7b\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3865

    const v6, -0x6f8173a7

    xor-int/2addr v5, v6

    const v6, -0x398f0e08

    goto/16 :goto_0

    .line 142
    :sswitch_8
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v4, :cond_4

    :goto_1
    const-string v4, "\u06d6\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x26bd

    const v6, 0x2d2f7639

    xor-int/2addr v5, v6

    const v6, -0x734642c2

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u1a77\u05ab"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4b63

    const v6, 0x7fc92a2e

    xor-int/2addr v5, v6

    const v6, -0x6522fd8

    goto/16 :goto_0

    .line 35
    :sswitch_9
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06df\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5007

    const v6, -0x6c5564a1

    xor-int/2addr v5, v6

    const v6, -0xea6821d

    goto/16 :goto_0

    .line 101
    :sswitch_a
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u1a7a\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x272d

    const v6, -0x2d0bac91

    xor-int/2addr v5, v6

    const v6, -0x34bf4519    # -1.2630759E7f

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_8

    :cond_7
    :goto_2
    const-string v4, "\u073d\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2ee5

    const v6, 0x5da13b

    xor-int/2addr v5, v6

    const v6, 0x33cc4169

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06eb\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x631d

    const v6, -0x13db49e7

    xor-int/2addr v5, v6

    const v6, -0x35935246    # -3877742.5f

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u1a78\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x37b9

    const v6, 0x2acbc523

    xor-int/2addr v5, v6

    const v6, -0x11525e2d

    goto/16 :goto_0

    .line 15
    :sswitch_d
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u05a1\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x593d

    const v6, 0x377d9889

    xor-int/2addr v5, v6

    const v6, 0x63b6f541

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e2\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x55

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1df9

    const v6, -0x3813f410

    xor-int/2addr v5, v6

    const v6, -0x2f0843b

    goto/16 :goto_0

    .line 58
    :sswitch_e
    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v4, :cond_c

    :goto_4
    const-string v4, "\u05a1\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3ef7

    const v6, -0x7be561f5

    xor-int/2addr v5, v6

    const v6, -0xc23e37f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e8\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x31

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xc39

    const v6, -0x734c7439

    xor-int/2addr v5, v6

    const v6, -0x240d6148

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fb29ba2 -> :sswitch_d
        -0x77e44054 -> :sswitch_e
        -0x71ed3e93 -> :sswitch_c
        -0x714b5a42 -> :sswitch_c
        -0x5aa98d14 -> :sswitch_b
        -0x56ae04be -> :sswitch_5
        -0x5638afdc -> :sswitch_3
        -0x53dfbcfa -> :sswitch_3
        -0x504bc52a -> :sswitch_2
        -0x423b6dc3 -> :sswitch_d
        -0x3f9c6987 -> :sswitch_2
        -0x33766781 -> :sswitch_4
        -0x295d6085 -> :sswitch_0
        -0x232f221a -> :sswitch_7
        -0x10ed9576 -> :sswitch_a
        -0xf230316 -> :sswitch_8
        -0x3971b9e -> :sswitch_b
        0x2730b4b2 -> :sswitch_6
        0x28ba1b7f -> :sswitch_7
        0x351ddd49 -> :sswitch_9
        0x3cb6957f -> :sswitch_0
        0x3d6b6a6c -> :sswitch_5
        0x3ef07b8b -> :sswitch_4
        0x5044dfe4 -> :sswitch_e
        0x528c7787 -> :sswitch_8
        0x56ed211b -> :sswitch_9
        0x5d0375db -> :sswitch_6
        0x607b7bda -> :sswitch_1
        0x6a2c9da4 -> :sswitch_a
        0x74ec477e -> :sswitch_1
    .end sparse-switch
.end method

.method public static ܰ(Ll/֡֡ۨ;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x5196f447

    sget v2, Ll/֡ܳ;->֡۠ۧ:I

    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    const-string v4, "\u0733\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x29fd

    const v6, -0x7fa96d56

    xor-int/2addr v5, v6

    const v6, -0x27a71ac9

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x345f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 119
    invoke-static {}, Ll/ۙܰۖ;->ۙ()Ljava/util/List;

    move-result-object v0

    .line 109
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_c

    goto/16 :goto_3

    :sswitch_0
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_7

    goto/16 :goto_1

    .line 62
    :sswitch_1
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v4

    if-eqz v4, :cond_a

    goto/16 :goto_1

    .line 23
    :sswitch_2
    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u073d\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2081

    const v6, 0x6c2e353c

    xor-int/2addr v5, v6

    const v6, -0x61e9fd5f

    goto :goto_0

    .line 52
    :sswitch_3
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    return-void

    .line 120
    :sswitch_5
    iget-object p0, p0, Ll/֡֡ۨ;->ۖܰ:Ll/᩶֡ۨ;

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    .line 119
    :sswitch_6
    iput-object v0, p0, Ll/֡֡ۨ;->ۚܰ:Ljava/util/List;

    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u1a74\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x231

    const v6, -0x463ab914

    xor-int/2addr v5, v6

    const v6, -0x6435fc33

    goto :goto_0

    .line 59
    :sswitch_7
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u06e2\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x20af

    const v6, 0x2d92e67

    xor-int/2addr v5, v6

    const v6, 0x212c4fc3

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u05a1\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2637

    const v6, 0x2c462981

    xor-int/2addr v5, v6

    const v6, -0x466a2baa

    goto/16 :goto_0

    .line 38
    :sswitch_9
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u0730\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4969

    const v6, 0x1618589b

    xor-int/2addr v5, v6

    const v6, 0x11e1e40e

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_5

    :goto_1
    const-string v4, "\u06e0\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3281

    const v6, -0x3972593e

    xor-int/2addr v5, v6

    const v6, 0x1669b9a6

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06df\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x50ed

    const v6, -0x3246bd6

    xor-int/2addr v5, v6

    const v6, -0x6a7e0b3f

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u1a7a\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1eb9

    const v6, 0x532aa4d9

    xor-int/2addr v5, v6

    const v6, -0x5e5d6d49

    goto/16 :goto_0

    .line 104
    :sswitch_c
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v4

    if-gtz v4, :cond_8

    :cond_7
    const-string v4, "\u06da\u06dc"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7e91

    const v6, 0x70c79eb1

    xor-int/2addr v5, v6

    const v6, 0x16b4f4a2

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06eb\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1d6f

    const v6, -0x7461875f

    xor-int/2addr v5, v6

    const v6, 0x74117658

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_9

    goto :goto_2

    :cond_9
    const-string v4, "\u06ec\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x69fb

    const v6, -0x13669c72

    xor-int/2addr v5, v6

    const v6, -0x9c16cce

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_b

    :cond_a
    :goto_2
    const-string v4, "\u06e4\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x35d9

    const v6, 0x395565fb

    xor-int/2addr v5, v6

    const v6, 0x27d473f

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06da\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6f2f

    const v6, -0x57ef8bda

    xor-int/2addr v5, v6

    const v6, -0x64a2d845

    goto/16 :goto_0

    :goto_3
    const-string v4, "\u05a8\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1685

    const v6, 0x10538b71

    xor-int/2addr v5, v6

    const v6, 0x203bc28f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e7\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xcbf

    const v6, 0x7324a150

    xor-int/2addr v5, v6

    const v6, -0x20234887

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x51a32ae2 -> :sswitch_c
        -0x49acb2d8 -> :sswitch_9
        -0x47f42ef3 -> :sswitch_6
        -0x478e7e7b -> :sswitch_5
        -0x3c1d6e4d -> :sswitch_9
        -0x3aba25a8 -> :sswitch_c
        -0x390fd50e -> :sswitch_a
        -0x34a7ae2e -> :sswitch_4
        -0x32c18912 -> :sswitch_d
        -0x29da91d8 -> :sswitch_a
        -0x1f2f0e10 -> :sswitch_b
        -0x1e0829d5 -> :sswitch_7
        -0xefc6285 -> :sswitch_5
        -0xed847ab -> :sswitch_7
        -0xd988d9a -> :sswitch_e
        -0xb5b9a13 -> :sswitch_e
        -0x6abe26 -> :sswitch_d
        0xcbe56a -> :sswitch_0
        0x1198fe5a -> :sswitch_1
        0x22722112 -> :sswitch_b
        0x40d7a5e4 -> :sswitch_1
        0x41543f65 -> :sswitch_3
        0x4782974c -> :sswitch_8
        0x5a1f000d -> :sswitch_2
        0x5c494530 -> :sswitch_2
        0x68817c0f -> :sswitch_3
        0x6e2095ba -> :sswitch_8
        0x774f2a11 -> :sswitch_6
        0x7859c397 -> :sswitch_0
        0x7a74c9c3 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
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

    const v18, 0x2e923fbb

    sget v19, Ll/֡᩶;->ۗ֨ܺ:I

    sget v20, Ll/֫ۚ;->ܽ۠᩹:I

    const-string v21, "\u1a73\u1a79"

    invoke-static/range {v21 .. v21}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v19

    xor-int v1, v21, v20

    mul-int/lit16 v1, v1, -0x5c59

    const v23, -0x4fdc5f4b

    xor-int v1, v1, v23

    const v23, 0x16ae74d

    xor-int v21, v21, v23

    move-object v3, v2

    move-object/from16 v16, v6

    move-object v12, v11

    move-object v15, v14

    move-object/from16 v9, v17

    move/from16 v22, v21

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v21, 0x2e923fbb

    const/16 v23, 0x0

    :goto_0
    xor-int v10, v21, v20

    mul-int/lit16 v10, v10, -0x55e3

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v1, v10

    xor-int v21, v22, v1

    sparse-switch v21, :sswitch_data_0

    move-object/from16 v22, v12

    .line 47
    invoke-static {v0, v2}, Ll/ۖۛ;->᩵ۖ۠(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/widget/ListView;

    .line 49
    iget-object v1, v0, Ll/۫ܶۘ;->᩻ۙ:Ll/ۜᩴ;

    invoke-static {v0, v1}, Ll/֡۠;->ۧ֫ۘ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    invoke-static/range {p0 .. p0}, Ll/֫ܽ;->֨᩻֡(Ljava/lang/Object;)V

    .line 6
    sget-boolean v1, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v1, :cond_3

    :goto_1
    move-object/from16 v1, v22

    goto/16 :goto_a

    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v1

    if-gtz v1, :cond_b

    :cond_0
    move-object v1, v12

    goto/16 :goto_a

    .line 2
    :sswitch_1
    sget v1, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v1, :cond_1

    :goto_2
    move-object/from16 v22, v12

    goto/16 :goto_4

    :cond_1
    move-object/from16 v22, v12

    goto :goto_3

    :sswitch_2
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v1, :cond_0

    goto :goto_2

    .line 17
    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    goto :goto_2

    .line 15
    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    return-void

    .line 51
    :sswitch_5
    iget-object v1, v0, Ll/۫ܶۘ;->᩻ۙ:Ll/ۜᩴ;

    new-instance v10, Ll/֡᩷ۘ;

    move-object/from16 v22, v12

    const/4 v12, 0x1

    invoke-direct {v10, v12, v0}, Ll/֡᩷ۘ;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, v10}, Ll/֡ܽ;->۫֨᩹(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    new-instance v1, Ll/᩶֡ۨ;

    .line 48
    sget v10, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v10, :cond_2

    goto :goto_1

    .line 52
    :cond_2
    invoke-direct {v1, v0}, Ll/᩶֡ۨ;-><init>(Ll/֡֡ۨ;)V

    iput-object v1, v0, Ll/֡֡ۨ;->ۖܰ:Ll/᩶֡ۨ;

    invoke-virtual {v3, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 53
    invoke-virtual {v3, v0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 54
    invoke-virtual {v3, v0}, Landroid/widget/AdapterView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void

    :cond_3
    const-string v1, "\u05ab\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v10, v1, v19

    mul-int/lit16 v10, v10, -0x3edf

    const v12, 0x6919e83e

    xor-int/2addr v10, v12

    const v12, -0x1015d229

    goto/16 :goto_5

    :sswitch_6
    move-object/from16 v22, v12

    const v1, 0x7e6d9337

    xor-int/2addr v1, v6

    .line 46
    invoke-static {v0, v1}, Ll/֡ۚ;->۬֡ۜ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۜᩴ;

    iput-object v1, v0, Ll/۫ܶۘ;->᩻ۙ:Ll/ۜᩴ;

    const v2, 0x102000a

    .line 21
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v1

    if-eqz v1, :cond_4

    :goto_3
    const-string v1, "\u06d6\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x11

    xor-int v10, v1, v20

    mul-int/lit16 v10, v10, 0x577d

    const v12, 0xcacb64b

    xor-int/2addr v10, v12

    const v12, -0x7837f5f9

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u06ec\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v10, v1, v20

    mul-int/lit16 v10, v10, -0x11d

    const v12, 0x6db2117c

    xor-int/2addr v10, v12

    const v12, 0x5c270401

    goto/16 :goto_5

    :sswitch_7
    move-object/from16 v22, v12

    const/4 v1, 0x7

    const/4 v6, 0x3

    .line 45
    invoke-static {v9, v1, v6, v11}, Ll/֨ܶ;->ۢ֡᩷([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    .line 23
    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_5

    const-string v1, "\u05a1\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x7

    xor-int v10, v1, v19

    mul-int/lit16 v10, v10, -0x570d

    const v12, 0x3081f966

    xor-int/2addr v10, v12

    const v12, 0x3cb8644

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u073a\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x25

    xor-int v10, v1, v19

    mul-int/lit16 v10, v10, 0x3001

    const v12, 0x261014d0

    xor-int/2addr v10, v12

    const v12, -0x178527db

    goto :goto_5

    :sswitch_8
    move-object/from16 v22, v12

    .line 44
    invoke-static {v15, v7, v8, v11}, Ll/֨ۖ;->ۨۜۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    const v9, 0x7ef4d61d

    xor-int/2addr v1, v9

    .line 45
    invoke-static {v0, v1}, Ll/֡ۚ;->۬֡ۜ(Ljava/lang/Object;I)Landroid/view/View;

    sget-object v9, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    .line 35
    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v1, :cond_6

    move-object/from16 v12, v22

    goto/16 :goto_9

    :cond_6
    const-string v1, "\u1a76\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v10, v1, v20

    mul-int/lit16 v10, v10, 0x254f

    const v12, 0x6c85c224

    xor-int/2addr v10, v12

    const v12, -0x1c39501f

    goto :goto_5

    :sswitch_9
    move-object/from16 v22, v12

    xor-int v1, v4, v5

    .line 44
    invoke-static {v0, v1}, Ll/֡ۚ;->۬֡ۜ(Ljava/lang/Object;I)Landroid/view/View;

    sget-object v15, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    const/4 v7, 0x4

    const/4 v8, 0x3

    .line 32
    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v1, :cond_7

    :goto_4
    const-string v1, "\u1a73\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v10, v1, v19

    mul-int/lit16 v10, v10, 0x2553

    const v12, 0x7b05828e

    xor-int/2addr v10, v12

    const v12, 0x5faa3e1d

    goto :goto_5

    :cond_7
    const-string v1, "\u1a74\u05ab"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0xd

    xor-int v10, v1, v20

    mul-int/lit16 v10, v10, -0x6df5

    const v12, 0x7bebf695

    xor-int/2addr v10, v12

    const v12, -0x53b3b843

    :goto_5
    xor-int/2addr v1, v12

    move-object/from16 v12, v22

    move/from16 v22, v1

    goto :goto_7

    :sswitch_a
    move-object v1, v12

    .line 43
    invoke-static {v1, v13, v14, v11}, Ll/֨ۢ;->ۨۡ۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    const v5, 0x7d0e0bb6

    .line 26
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v10

    if-gtz v10, :cond_8

    goto/16 :goto_a

    :cond_8
    const-string v10, "\u06e1\u06dc"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v12, v10, v19

    mul-int/lit16 v12, v12, 0x1e33

    const v22, -0x2fa434cd

    xor-int v12, v12, v22

    const v22, 0x31069e69

    goto/16 :goto_b

    .line 43
    :sswitch_b
    invoke-super/range {p0 .. p1}, Ll/۫ܶۘ;->onCreate(Landroid/os/Bundle;)V

    sget-object v12, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    const/4 v13, 0x1

    const/4 v14, 0x3

    .line 9
    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_9

    goto/16 :goto_9

    :cond_9
    const-string v1, "\u0730\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v10, v1, v20

    mul-int/lit16 v10, v10, -0x1261

    const v22, -0x7bc39c

    xor-int v10, v10, v22

    const v22, 0x14869a79

    :goto_6
    xor-int v22, v1, v22

    :goto_7
    move v1, v10

    goto/16 :goto_0

    :sswitch_c
    move-object v1, v12

    const v10, 0xeb8e

    const v11, 0xeb8e

    goto :goto_8

    :sswitch_d
    move-object v1, v12

    const/16 v10, 0x2663

    const/16 v11, 0x2663

    :goto_8
    const-string v10, "\u1a78\u1a74"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v12, v10, v19

    mul-int/lit8 v12, v12, 0x1f

    const v22, 0x61651cdb

    xor-int v12, v12, v22

    const v22, -0x624511a6

    goto/16 :goto_b

    :sswitch_e
    move-object v1, v12

    mul-int v10, v18, v23

    mul-int v12, v18, v18

    const v22, 0x2a8e240

    add-int v12, v12, v22

    sub-int/2addr v10, v12

    if-gtz v10, :cond_a

    const-string v10, "\u1a73\u06ec"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v12, v10, v19

    mul-int/lit16 v12, v12, 0x837

    const v22, -0x21fe58fa

    xor-int v12, v12, v22

    const v22, -0x6cb54577

    goto/16 :goto_b

    :cond_a
    const-string v10, "\u06da\u06e4"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v19

    mul-int/lit8 v10, v10, 0x6d

    xor-int v12, v10, v20

    mul-int/lit16 v12, v12, 0x4a1

    const v22, -0xa5ab130

    xor-int v12, v12, v22

    const v22, 0xbfc6434

    goto :goto_b

    :sswitch_f
    move-object v1, v12

    aget-short v18, v16, v17

    const/16 v23, 0x3430

    .line 47
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v10

    if-nez v10, :cond_c

    move-object v12, v1

    :cond_b
    :goto_9
    const-string v1, "\u0736\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v10, v1, v19

    mul-int/lit16 v10, v10, -0x6eef

    const v22, -0x6c4fe982

    xor-int v10, v10, v22

    const v22, -0x4f8b0ab4

    goto/16 :goto_6

    :cond_c
    const-string v10, "\u0733\u06e4"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v19, v10

    mul-int/lit8 v10, v10, 0xf

    xor-int v12, v10, v20

    mul-int/lit16 v12, v12, -0x10af

    const v22, -0x3a73df49

    xor-int v12, v12, v22

    const v22, 0x37ab8923

    goto :goto_b

    :sswitch_10
    move-object v1, v12

    sget-object v16, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    const/16 v17, 0x0

    .line 30
    sget-boolean v10, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v10, :cond_d

    :goto_a
    const-string v10, "\u1a79\u06d8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int v10, v10, v19

    mul-int/lit8 v10, v10, 0x73

    xor-int v12, v10, v20

    mul-int/lit16 v12, v12, -0x4175

    const v22, 0x5a01c11e

    xor-int v12, v12, v22

    const v22, -0x3275cb6

    goto :goto_b

    :cond_d
    const-string v10, "\u1a77\u1a75"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v12, v10, v19

    mul-int/lit16 v12, v12, -0x5da1

    const v22, -0x329f0344

    xor-int v12, v12, v22

    const v22, -0x71078009

    :goto_b
    xor-int v22, v10, v22

    move/from16 v24, v12

    move-object v12, v1

    move/from16 v1, v24

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b403823 -> :sswitch_d
        -0x7659467b -> :sswitch_b
        -0x72d7c12f -> :sswitch_0
        -0x6c82be93 -> :sswitch_7
        -0x577b274d -> :sswitch_f
        -0x526130a6 -> :sswitch_8
        -0x50cfec16 -> :sswitch_8
        -0x4f812c1a -> :sswitch_4
        -0x3c609a87 -> :sswitch_a
        -0x340a58fb -> :sswitch_4
        -0x3269ba59 -> :sswitch_2
        -0x212e6b56 -> :sswitch_9
        -0xf55ce1f -> :sswitch_7
        -0xa3d14ac -> :sswitch_0
        0x3d4d81 -> :sswitch_5
        0x7e9b3fb -> :sswitch_a
        0xcea1efc -> :sswitch_9
        0x1170a286 -> :sswitch_3
        0x120679ef -> :sswitch_10
        0x14d4495e -> :sswitch_e
        0x40762153 -> :sswitch_3
        0x4229b4be -> :sswitch_6
        0x46f65cdc -> :sswitch_e
        0x497e716d -> :sswitch_5
        0x4dbb8f42 -> :sswitch_c
        0x566d4474 -> :sswitch_2
        0x5cb343fc -> :sswitch_c
        0x5ee482e6 -> :sswitch_1
        0x5fa3d997 -> :sswitch_1
        0x612ce7f1 -> :sswitch_f
        0x726e767e -> :sswitch_b
        0x76f22ccc -> :sswitch_10
        0x78b72c31 -> :sswitch_6
        0x7c9e5688 -> :sswitch_d
    .end sparse-switch
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
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

    const/4 v12, 0x0

    const v13, -0x65ff7a4a

    sget v14, Ll/ۧ;->֫۠ᩴ:I

    sget v15, Ll/֫᩺;->᩺۟ۘ:I

    const-string v16, "\u1a7b\u073f"

    invoke-static/range {v16 .. v16}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v15

    xor-int v0, v16, v14

    mul-int/lit16 v0, v0, 0x24d

    const v18, -0x5d397059

    xor-int v0, v0, v18

    const v18, -0x7d7b8018

    xor-int v16, v16, v18

    move-object/from16 v18, v3

    move-object v12, v11

    move/from16 v17, v16

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const v16, -0x65ff7a4a

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v16, v14

    mul-int/lit16 v4, v4, 0x64d

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v16, v17, v0

    sparse-switch v16, :sswitch_data_0

    sget-object v18, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v0

    if-ltz v0, :cond_b

    goto/16 :goto_4

    :sswitch_0
    sget v0, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v0, :cond_1

    goto/16 :goto_5

    .line 46
    :sswitch_1
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget v0, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v0, :cond_6

    goto/16 :goto_3

    :sswitch_2
    sget v0, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v0, :cond_c

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    const/4 v0, 0x0

    return v0

    :sswitch_5
    move-object/from16 v0, p1

    .line 59
    invoke-virtual {v1, v2, v0}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const/4 v0, 0x1

    return v0

    :sswitch_6
    move-object/from16 v0, p1

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    const v4, 0x7d1b718a

    xor-int/2addr v2, v4

    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v4, "\u1a77\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v14

    mul-int/lit8 v4, v4, -0x4d

    xor-int v0, v4, v15

    mul-int/lit16 v0, v0, -0x408f

    const v17, 0x7841097c

    xor-int v0, v0, v17

    const v17, 0x4e0dc10f    # 5.9455994E8f

    xor-int v17, v4, v17

    goto :goto_0

    :sswitch_7
    const/4 v0, 0x3

    invoke-static {v12, v13, v0, v11}, Ll/֨۟;->ᩴۚۤ([SIII)Ljava/lang/String;

    move-result-object v3

    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_2

    :cond_1
    const-string v0, "\u1a78\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x49

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x7437

    const v17, -0x636ea63f

    xor-int v4, v4, v17

    const v17, -0x173ddb54

    goto/16 :goto_6

    :cond_2
    const-string v0, "\u1a74\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x4b

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x2b29

    const v17, 0xb2c405

    xor-int v4, v4, v17

    const v17, -0x79b68c3d

    goto/16 :goto_6

    :sswitch_8
    const/16 v13, 0xb

    sget-boolean v0, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v0, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v0, "\u06e7\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x550d

    const v17, -0x6a7ee43c

    xor-int v4, v4, v17

    const v17, -0x61e69730

    goto/16 :goto_6

    :sswitch_9
    invoke-virtual/range {p0 .. p0}, Ll/ۤۚ;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v1

    sget-object v12, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    .line 14
    sget-boolean v0, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    const-string v0, "\u06e2\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x15

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x5b5b

    const v17, 0x30be6696

    xor-int v4, v4, v17

    const v17, -0x439ba1d5

    goto/16 :goto_6

    :sswitch_a
    const v0, 0x86a1

    const v11, 0x86a1

    goto :goto_1

    :sswitch_b
    const v0, 0xb1b4

    const v11, 0xb1b4

    :goto_1
    const-string v0, "\u1a76\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x33

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x4469

    const v17, 0x12535082

    xor-int v4, v4, v17

    const v17, -0x514f950b

    goto/16 :goto_6

    :sswitch_c
    mul-int v0, v10, v10

    sub-int/2addr v0, v8

    if-ltz v0, :cond_5

    const-string v0, "\u1a75\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x4d5f

    const v17, 0x789bb3f0

    xor-int v4, v4, v17

    const v17, -0x4c899e2c

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u06df\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x33

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x3eb7

    const v17, 0x787c7020

    xor-int v4, v4, v17

    const v17, 0x1c15a5c6

    goto/16 :goto_6

    :sswitch_d
    add-int v10, v6, v9

    .line 6
    sget v0, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v0, :cond_7

    :cond_6
    :goto_2
    const-string v0, "\u06e0\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x7

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x2f51

    const v17, 0x468d4831

    xor-int v4, v4, v17

    const v17, -0x1e36ca1a

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u06eb\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x2f

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x728f

    const v17, -0x66d51c3f

    xor-int v4, v4, v17

    const v17, -0x5fe16563

    goto/16 :goto_6

    :sswitch_e
    mul-int v8, v6, v7

    const/16 v9, 0x439a

    .line 47
    sget v0, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v0, :cond_8

    goto :goto_3

    :cond_8
    const-string v0, "\u1a7b\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x3e6f

    const v17, 0x366a3c5d

    xor-int v4, v4, v17

    const v17, -0x6fb0b1f7

    goto/16 :goto_6

    :sswitch_f
    aget-short v6, v18, v5

    const v7, 0x10e68

    .line 30
    sget v0, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v0, :cond_9

    goto :goto_4

    :cond_9
    const-string v0, "\u1a76\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x60bb

    const v17, -0x4fb868

    xor-int v4, v4, v17

    const v17, -0x3e61718b

    goto/16 :goto_6

    :sswitch_10
    const/16 v5, 0xa

    .line 20
    sget v0, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v0, :cond_a

    :goto_3
    const-string v0, "\u06d9\u073a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x57

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x42a5

    const v17, 0x563fea1b

    xor-int v4, v4, v17

    const v17, -0x567b223c

    goto :goto_6

    :cond_a
    const-string v0, "\u0730\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x3f

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x723b

    const v17, 0x529afa55

    xor-int v4, v4, v17

    const v17, 0x225cda70

    goto :goto_6

    :goto_4
    const-string v0, "\u06d8\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x29

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x6f47

    const v17, 0x522c22b6

    xor-int v4, v4, v17

    const v17, -0x3372363d    # -7.4337816E7f

    goto :goto_6

    :cond_b
    const-string v0, "\u1a73\u1a75"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x4b

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x3abb

    const v17, 0x738416dc

    xor-int v4, v4, v17

    const v17, 0x5bc8e086

    goto :goto_6

    .line 1
    :sswitch_11
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v0

    if-eqz v0, :cond_d

    :cond_c
    :goto_5
    const-string v0, "\u073a\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x77d9

    const v17, -0x6e903fc7

    xor-int v4, v4, v17

    const v17, -0x680042d6

    goto :goto_6

    :cond_d
    const-string v0, "\u06e1\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x43

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x3905

    const v17, -0x484c8150

    xor-int v4, v4, v17

    const v17, 0x78000585

    :goto_6
    xor-int v17, v0, v17

    move v0, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d0bd159 -> :sswitch_c
        -0x7a10177c -> :sswitch_9
        -0x79169771 -> :sswitch_7
        -0x5c0f5072 -> :sswitch_e
        -0x561a5ef0 -> :sswitch_4
        -0x535af577 -> :sswitch_10
        -0x4ed0d5a6 -> :sswitch_8
        -0x4e20d3e1 -> :sswitch_c
        -0x4ddf8e9f -> :sswitch_f
        -0x477ad3cb -> :sswitch_6
        -0x424772bb -> :sswitch_a
        -0x3b751c14 -> :sswitch_5
        -0x30f1f708 -> :sswitch_5
        -0x27a81fec -> :sswitch_11
        -0x18280c3d -> :sswitch_d
        -0x14b76279 -> :sswitch_0
        -0x133946c8 -> :sswitch_0
        -0xc0b2922 -> :sswitch_4
        -0xae33a39 -> :sswitch_11
        -0x218bd51 -> :sswitch_d
        0x77aa6ee -> :sswitch_3
        0xc71d321 -> :sswitch_b
        0x1732fded -> :sswitch_8
        0x19027093 -> :sswitch_b
        0x211d486f -> :sswitch_7
        0x28a72d41 -> :sswitch_10
        0x28fba7ac -> :sswitch_3
        0x3025bdcc -> :sswitch_a
        0x3da5b3f6 -> :sswitch_1
        0x41dcb6bc -> :sswitch_2
        0x4f46e750 -> :sswitch_9
        0x5b70640d -> :sswitch_2
        0x670af62a -> :sswitch_f
        0x6e6a3079 -> :sswitch_1
        0x7009d1b4 -> :sswitch_6
        0x7e99499a -> :sswitch_e
    .end sparse-switch
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    const/4 p1, 0x0

    const/4 p2, 0x0

    const p4, -0x4f15f482

    sget p5, Ll/ۗᩳ;->ۚۤ֡:I

    sget v0, Ll/ۘ֡;->ܰ֡ܽ:I

    const-string v1, "\u0733\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p5

    mul-int/lit16 v2, v2, 0x1af1

    const v3, -0x1e4ae46f

    xor-int/2addr v2, v3

    const v3, -0x3e534024

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p4, p5

    mul-int/lit16 p4, p4, -0x445d

    shr-int/lit8 p4, p4, 0x1f

    and-int/2addr p4, v2

    xor-int/2addr p4, v1

    sparse-switch p4, :sswitch_data_0

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_3

    :sswitch_0
    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v1, :cond_4

    goto/16 :goto_4

    .line 59
    :sswitch_1
    sget-boolean v1, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v1, :cond_b

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v1

    if-lez v1, :cond_6

    goto/16 :goto_2

    .line 26
    :sswitch_3
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto/16 :goto_2

    .line 57
    :sswitch_4
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    return-void

    .line 126
    :sswitch_5
    invoke-virtual {p2}, Ll/᩷۠ۚ;->᩷ܰ()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 127
    invoke-static {p0, p1}, Ll/֨᩺;->᩷ܽᩴ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 126
    :sswitch_6
    iget-object p2, p0, Ll/֡֡ۨ;->ۚܰ:Ljava/util/List;

    invoke-static {p2, p3}, Ll/֫ۚ;->ᩳۨ۬(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֡ۙۖ;

    invoke-virtual {p2}, Ll/֡ۙۖ;->ܰ()Ll/᩷۠ۚ;

    move-result-object p2

    .line 83
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v1, "\u05a1\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p5

    mul-int/lit16 v2, v2, -0x5b37

    const v3, -0x49dcfbaf

    xor-int/2addr v2, v3

    const v3, -0x79bc39db

    goto :goto_0

    .line 125
    :sswitch_7
    new-instance p1, Landroid/content/Intent;

    const-class v1, Ll/ۤ֡ۨ;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v1, "\u05a8\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p5

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x7695

    const v3, -0x7a2c8e90

    xor-int/2addr v2, v3

    const v3, -0x3c336172

    goto/16 :goto_0

    .line 110
    :sswitch_8
    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v1, "\u1a78\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p5

    mul-int/lit16 v2, v2, -0x51e3

    const v3, 0x6341230d

    xor-int/2addr v2, v3

    const v3, 0x4b783fad    # 1.6269229E7f

    goto/16 :goto_0

    :cond_3
    const-string v1, "\u1a7b\u06d8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p5

    mul-int/lit8 v1, v1, 0x4d

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x81d

    const v3, -0x2790b07b

    xor-int/2addr v2, v3

    const v3, -0x2b78dbba

    goto/16 :goto_0

    :sswitch_9
    sget v1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v1, :cond_5

    :cond_4
    const-string v1, "\u06e7\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x67

    xor-int v2, v1, p5

    mul-int/lit16 v2, v2, -0x6293

    const v3, 0x58752b2d

    xor-int/2addr v2, v3

    const v3, -0x3148a030

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u1a7a\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p5, v1

    mul-int/lit8 v1, v1, 0x7

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x4795

    const v3, -0x359d4b

    xor-int/2addr v2, v3

    const v3, -0x6a795e5a

    goto/16 :goto_0

    .line 49
    :sswitch_a
    sget v1, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v1, :cond_7

    :cond_6
    :goto_1
    const-string v1, "\u06ec\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p5

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x6937

    const v3, 0x41277edd

    xor-int/2addr v2, v3

    const v3, -0x654e91fc

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06da\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p5

    mul-int/lit16 v2, v2, -0x2c09

    const v3, 0x29bd3716

    xor-int/2addr v2, v3

    const v3, 0x6517dd1b

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_2
    const-string v1, "\u05a1\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p5

    mul-int/lit16 v2, v2, -0x49c7

    const v3, -0x7fbcdc4b

    xor-int/2addr v2, v3

    const v3, -0x431207e2

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06db\u1a75"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x5b

    xor-int v2, v1, p5

    mul-int/lit16 v2, v2, 0x7ead

    const v3, 0x2838dced

    xor-int/2addr v2, v3

    const v3, -0x1806fb80

    goto/16 :goto_0

    .line 126
    :sswitch_c
    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v1, :cond_9

    :goto_3
    const-string v1, "\u1a76\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p5

    mul-int/lit16 v2, v2, 0xd43

    const v3, 0x6a3930f2

    xor-int/2addr v2, v3

    const v3, 0x89b27ca

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u06e8\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p5

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x7043

    const v3, -0x683933be

    xor-int/2addr v2, v3

    const v3, 0x4ee5e4a2

    goto/16 :goto_0

    .line 45
    :sswitch_d
    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v1, :cond_a

    goto :goto_4

    :cond_a
    const-string v1, "\u06da\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p5

    mul-int/lit16 v2, v2, -0x35a7

    const v3, -0x785c2acf

    xor-int/2addr v2, v3

    const v3, 0x79604ea9

    goto/16 :goto_0

    .line 95
    :sswitch_e
    sget-boolean v1, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v1, :cond_c

    :cond_b
    :goto_4
    const-string v1, "\u05a8\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p5, v1

    mul-int/lit8 v1, v1, 0x11

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x496d

    const v3, 0x1de3b791

    xor-int/2addr v2, v3

    const v3, 0x751ac797

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u0736\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p5

    mul-int/lit8 v1, v1, 0x39

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x1c91

    const v3, 0x1c0a4a3f

    xor-int/2addr v2, v3

    const v3, 0xc34bfae

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6daaa14b -> :sswitch_0
        -0x6be8102f -> :sswitch_6
        -0x657d96ed -> :sswitch_b
        -0x53c1779e -> :sswitch_8
        -0x43e1a6dd -> :sswitch_5
        -0x393bfb0f -> :sswitch_2
        -0x3640d4e2 -> :sswitch_1
        -0x2f1a3617 -> :sswitch_b
        -0x2eac5341 -> :sswitch_7
        -0x2e49b976 -> :sswitch_7
        -0x252ce17e -> :sswitch_e
        -0x1c5228a1 -> :sswitch_c
        -0x14f0baae -> :sswitch_d
        -0x25bb2f -> :sswitch_9
        0x4b142c8 -> :sswitch_3
        0xa49ca0c -> :sswitch_4
        0xb1eceb1 -> :sswitch_2
        0xf17c73c -> :sswitch_3
        0x1c8e31cf -> :sswitch_5
        0x1ea75bdd -> :sswitch_a
        0x2259c19c -> :sswitch_d
        0x262072ba -> :sswitch_4
        0x3367d90f -> :sswitch_c
        0x4390ed8a -> :sswitch_a
        0x4693e407 -> :sswitch_0
        0x50b44424 -> :sswitch_9
        0x53a4e6dc -> :sswitch_8
        0x5b611b86 -> :sswitch_e
        0x5dccd900 -> :sswitch_6
        0x797c53a6 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v3, 0x0

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

    const/16 v19, 0x0

    const v20, -0x727f0256

    sget v21, Ll/֨᩹;->᩻ᩳ֨:I

    sget v22, Ll/֫۟;->᩸ᩴܿ:I

    const-string v23, "\u06e2\u0730"

    invoke-static/range {v23 .. v23}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v21

    xor-int v2, v23, v22

    mul-int/lit16 v2, v2, 0x52b9

    const v24, 0x543d52c

    xor-int v2, v2, v24

    const v24, -0x6ebdd895

    xor-int v23, v23, v24

    move-object v5, v3

    move-object/from16 v18, v6

    move-object/from16 p5, v10

    move-object/from16 v14, v17

    const/16 p4, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object v10, v9

    move-object v9, v8

    :goto_0
    xor-int v8, v20, v22

    mul-int/lit16 v8, v8, 0xfa5

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v2, v8

    xor-int v20, v23, v2

    sparse-switch v20, :sswitch_data_0

    move-object/from16 v23, v5

    move/from16 v8, v19

    move-object/from16 v19, v3

    move/from16 v3, p3

    const v2, 0xc550

    const v4, 0xc550

    goto/16 :goto_9

    .line 172
    :sswitch_0
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    sget v2, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v2, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v23, v5

    move/from16 v2, v17

    move/from16 v8, v19

    move/from16 v5, p4

    move-object/from16 v19, v3

    move/from16 v3, p3

    goto/16 :goto_e

    :cond_1
    move-object v2, v3

    move/from16 v8, v19

    move/from16 v3, p3

    goto/16 :goto_7

    :sswitch_1
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v2

    if-eqz v2, :cond_0

    :cond_2
    move-object/from16 v2, p5

    move-object/from16 v23, v5

    move/from16 v8, v19

    move-object/from16 v19, v3

    goto/16 :goto_5

    .line 122
    :sswitch_2
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    sget v2, Ll/֫ᩳ;->۬֨᩸:I

    if-lez v2, :cond_2

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    goto :goto_2

    .line 41
    :sswitch_4
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    const/4 v1, 0x0

    return v1

    .line 137
    :sswitch_5
    invoke-virtual {v7, v10}, Ll/ܺ᩸;->ۙ(Ll/᩷᩸;)V

    .line 175
    invoke-static {v1, v7}, Ll/ۖ᩶᩺;->ۙ(Landroid/view/View;Ll/ܺ᩸;)V

    const/4 v1, 0x1

    return v1

    :sswitch_6
    xor-int v2, v12, v13

    .line 136
    invoke-static {v9, v6, v2, v6, v2}, Ll/ۘۧ;->ۙۙ᩻(Ljava/lang/Object;IIII)Landroid/view/MenuItem;

    .line 137
    new-instance v10, Ll/۟֡ۨ;

    invoke-direct {v10, v0, v5, v3}, Ll/۟֡ۨ;-><init>(Ll/֡֡ۨ;Ljava/lang/String;Ll/֡ۙۖ;)V

    .line 46
    sget v2, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v2, :cond_3

    :goto_2
    const-string v2, "\u073d\u06d7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    mul-int/lit8 v2, v2, 0x9

    xor-int v8, v2, v21

    mul-int/lit16 v8, v8, 0x128d

    const v23, -0x45c52e4c

    xor-int v8, v8, v23

    const v23, -0x5dcdab43

    goto :goto_3

    :cond_3
    const-string v2, "\u06db\u0736"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    mul-int/lit8 v2, v2, -0xb

    xor-int v8, v2, v21

    mul-int/lit16 v8, v8, -0x744f

    const v23, -0x7fb361a7

    xor-int v8, v8, v23

    const v23, 0x4e2eaf10    # 7.326771E8f

    goto :goto_3

    .line 136
    :sswitch_7
    invoke-static {v14, v15, v11, v4}, Ll/ۧ;->۫֨۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    const v13, 0x7d3c02df

    .line 52
    sget v2, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v2, :cond_4

    goto/16 :goto_1

    :cond_4
    const-string v2, "\u0730\u06d8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v8, v2, v22

    mul-int/lit16 v8, v8, -0x5aaf

    const v23, -0x49affbd4

    xor-int v8, v8, v23

    const v23, 0x4956476a    # 877686.6f

    :goto_3
    xor-int v23, v2, v23

    :goto_4
    move v2, v8

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v2, v18

    move/from16 v8, v19

    .line 135
    invoke-static {v2, v6, v8, v6, v8}, Ll/ۘۧ;->ۙۙ᩻(Ljava/lang/Object;IIII)Landroid/view/MenuItem;

    .line 136
    invoke-virtual {v7}, Ll/ܺ᩸;->ۨ()Ll/۫۬;

    move-result-object v9

    sget-object v14, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    const/16 v15, 0x12

    .line 81
    sget v18, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v18, :cond_5

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move-object/from16 v23, v5

    const/4 v11, 0x3

    move-object/from16 v2, p5

    goto :goto_5

    :cond_5
    const-string v18, "\u1a76\u05ab"

    invoke-static/range {v18 .. v18}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v18

    add-int v18, v18, v21

    mul-int/lit8 v18, v18, -0x27

    xor-int v11, v18, v22

    mul-int/lit16 v11, v11, 0x5559

    const v23, 0x1ba5d38b

    xor-int v11, v11, v23

    const v23, -0x49ea053f

    xor-int v23, v18, v23

    move-object/from16 v18, v2

    move/from16 v19, v8

    move v2, v11

    const/4 v11, 0x3

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v2, v18

    .line 135
    invoke-static/range {p5 .. p5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    const v18, 0x7d12e64b

    xor-int v19, v8, v18

    .line 106
    sget v8, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v8, :cond_6

    move-object/from16 v18, v2

    move-object v2, v3

    move/from16 v3, p3

    goto/16 :goto_c

    :cond_6
    const-string v8, "\u1a74\u05a8"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v22

    mul-int/lit8 v8, v8, 0x19

    move-object/from16 v18, v2

    xor-int v2, v8, v21

    mul-int/lit16 v2, v2, 0x3609

    const v23, 0x7b578a4f

    xor-int v2, v2, v23

    const v23, -0x6cbce828

    xor-int v23, v8, v23

    goto/16 :goto_0

    :sswitch_a
    move/from16 v8, v19

    .line 135
    sget-object v2, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    move-object/from16 v19, v3

    const/16 v3, 0xf

    move-object/from16 v23, v5

    const/4 v5, 0x3

    invoke-static {v2, v3, v5, v4}, Ll/֫ۘ;->ۜۖܺ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 36
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_7

    :goto_5
    const-string v3, "\u1a74\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v21

    xor-int v5, v3, v22

    mul-int/lit16 v5, v5, 0x8c7

    const v24, 0x2fb92d50

    xor-int v5, v5, v24

    const v24, -0x34a88015    # -1.4122987E7f

    goto :goto_6

    :cond_7
    const-string v3, "\u0736\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v21, v3

    mul-int/lit8 v3, v3, -0x7f

    xor-int v5, v3, v22

    mul-int/lit16 v5, v5, -0x4531

    const v24, -0x38679b72

    xor-int v5, v5, v24

    const v24, 0x3e64a36c

    :goto_6
    xor-int v3, v3, v24

    move-object/from16 p5, v2

    move v2, v5

    move-object/from16 v5, v23

    move/from16 v23, v3

    move-object/from16 v3, v19

    goto :goto_8

    :sswitch_b
    move/from16 v8, v19

    .line 132
    iget-object v2, v0, Ll/֡֡ۨ;->ۚܰ:Ljava/util/List;

    move/from16 v3, p3

    invoke-static {v2, v3}, Ll/֫ۚ;->ᩳۨ۬(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ۙۖ;

    .line 133
    invoke-virtual {v2}, Ll/֡ۙۖ;->ۖ()Ljava/lang/String;

    move-result-object v5

    .line 134
    new-instance v7, Ll/ܺ᩸;

    .line 166
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v19

    if-gtz v19, :cond_8

    :goto_7
    const-string v7, "\u06d7\u06e2"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v22

    mul-int/lit8 v7, v7, -0x47

    move-object/from16 v19, v2

    xor-int v2, v7, v21

    mul-int/lit16 v2, v2, -0x7c6b

    const v23, -0xf34bd2b

    xor-int v2, v2, v23

    const v23, 0x6947cc9b

    xor-int v23, v7, v23

    move-object/from16 v3, v19

    const/4 v7, 0x0

    goto :goto_8

    :cond_8
    const/4 v6, 0x0

    .line 68
    invoke-direct {v7, v0, v1, v6}, Ll/ܺ᩸;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 135
    invoke-virtual {v7}, Ll/ܺ᩸;->ۨ()Ll/۫۬;

    move-result-object v18

    .line 152
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v19

    if-gtz v19, :cond_9

    goto/16 :goto_b

    :cond_9
    const-string v19, "\u0736\u06e0"

    invoke-static/range {v19 .. v19}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v22

    xor-int v6, v19, v21

    mul-int/lit16 v6, v6, -0x1abf

    const v24, -0x5631f290

    xor-int v6, v6, v24

    const v24, 0x42029ebe

    xor-int v19, v19, v24

    move-object v3, v2

    move v2, v6

    move/from16 v23, v19

    const/4 v6, 0x0

    :goto_8
    move/from16 v19, v8

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v23, v5

    move/from16 v8, v19

    move-object/from16 v19, v3

    move/from16 v3, p3

    const v2, 0xccac

    const v4, 0xccac

    :goto_9
    const-string v2, "\u06e4\u06d9"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v21

    mul-int/lit8 v2, v2, 0x53

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, 0x111f

    const v24, 0x5d86361b

    xor-int v5, v5, v24

    const v24, 0x4aef3f75    # 7839674.5f

    goto :goto_a

    :sswitch_d
    move-object/from16 v23, v5

    move/from16 v8, v19

    move-object/from16 v19, v3

    move/from16 v3, p3

    const v2, 0x92a310

    add-int v2, v16, v2

    add-int/2addr v2, v2

    sub-int v2, v2, p4

    if-gez v2, :cond_a

    const-string v2, "\u0730\u1a78"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, -0x1b7

    const v24, -0x4b92189d

    xor-int v5, v5, v24

    const v24, 0x13ae2c66

    goto :goto_a

    :cond_a
    const-string v2, "\u05ab\u05a1"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v22

    mul-int/lit8 v2, v2, -0x71

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, -0xc85

    const v24, 0x7113de59

    xor-int v5, v5, v24

    const v24, -0x7e72098c

    :goto_a
    xor-int v2, v2, v24

    move-object/from16 v3, v19

    move/from16 v19, v8

    move-object/from16 v25, v23

    move/from16 v23, v2

    move v2, v5

    move-object/from16 v5, v25

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v23, v5

    move/from16 v8, v19

    move-object/from16 v19, v3

    move/from16 v3, p3

    move/from16 v2, v17

    add-int/lit16 v5, v2, 0xc1c

    mul-int v5, v5, v5

    mul-int v16, v2, v2

    .line 85
    sget-boolean v17, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v17, :cond_b

    goto/16 :goto_e

    :cond_b
    const-string v17, "\u06eb\u1a7a"

    invoke-static/range {v17 .. v17}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v21

    xor-int v0, v17, v22

    mul-int/lit16 v0, v0, -0x78eb

    const v24, -0x737b975f

    xor-int v0, v0, v24

    const v24, -0x757fe42

    xor-int v17, v17, v24

    move/from16 p4, v5

    move-object/from16 v3, v19

    move-object/from16 v5, v23

    move/from16 v19, v8

    move/from16 v23, v17

    move/from16 v17, v2

    move v2, v0

    goto :goto_d

    :sswitch_f
    move-object/from16 v23, v5

    move/from16 v8, v19

    move-object/from16 v19, v3

    move/from16 v3, p3

    sget-object v0, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    const/16 v2, 0xe

    aget-short v17, v0, v2

    .line 40
    sget-boolean v0, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v0, :cond_c

    move-object/from16 v2, v19

    move-object/from16 v5, v23

    :goto_b
    move/from16 v19, v8

    :goto_c
    const-string v0, "\u05ab\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x23

    xor-int v8, v0, v21

    mul-int/lit16 v8, v8, 0x16f7

    const v23, -0x46b11c8e

    xor-int v8, v8, v23

    const v23, -0x725a2d2d

    xor-int v23, v0, v23

    move-object/from16 v0, p0

    move-object v3, v2

    goto/16 :goto_4

    :cond_c
    const-string v0, "\u06d6\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x7b

    xor-int v2, v0, v22

    mul-int/lit16 v2, v2, -0x3471

    const v5, 0x2d7699f0

    xor-int/2addr v2, v5

    const v5, 0x3527a312

    xor-int/2addr v0, v5

    move-object/from16 v3, v19

    move-object/from16 v5, v23

    move/from16 v23, v0

    move/from16 v19, v8

    :goto_d
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v23, v5

    move/from16 v2, v17

    move/from16 v8, v19

    move-object/from16 v19, v3

    move/from16 v3, p3

    .line 69
    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v0, :cond_d

    move/from16 v5, p4

    :goto_e
    const-string v0, "\u073f\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x9f

    const v17, -0x37ab33ad

    xor-int v1, v1, v17

    const v17, -0x1ec47d64

    xor-int v0, v0, v17

    move/from16 v17, v2

    move/from16 p4, v5

    goto :goto_f

    :cond_d
    const-string v0, "\u0736\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x346f

    const v5, 0x410d8756    # 8.845541f

    xor-int/2addr v1, v5

    const v5, -0x687bca64

    xor-int/2addr v0, v5

    move/from16 v17, v2

    :goto_f
    move-object/from16 v3, v19

    move-object/from16 v5, v23

    move/from16 v23, v0

    move v2, v1

    move/from16 v19, v8

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e125423 -> :sswitch_7
        -0x7238361f -> :sswitch_9
        -0x6ba2d6b1 -> :sswitch_1
        -0x6177ee2b -> :sswitch_9
        -0x5c1f8b51 -> :sswitch_c
        -0x5141a190 -> :sswitch_0
        -0x4d373a7d -> :sswitch_b
        -0x4abc9064 -> :sswitch_d
        -0x46bf444c -> :sswitch_c
        -0x45f9b6b9 -> :sswitch_1
        -0x45a831e8 -> :sswitch_10
        -0x3f7a0107 -> :sswitch_6
        -0x381f9cbc -> :sswitch_0
        -0x35d1af20 -> :sswitch_2
        -0x2c423b54 -> :sswitch_d
        -0x2a876bb5 -> :sswitch_a
        -0x288fb44d -> :sswitch_e
        -0x26acf71d -> :sswitch_7
        -0x1fbe8c45 -> :sswitch_3
        -0x1cb5cc66 -> :sswitch_8
        -0xe87c390 -> :sswitch_4
        -0xb629250 -> :sswitch_2
        0xfe2306 -> :sswitch_f
        0x334c4b8 -> :sswitch_10
        0x692e1f9 -> :sswitch_f
        0x10516602 -> :sswitch_3
        0x33910e64 -> :sswitch_5
        0x458c5c2f -> :sswitch_b
        0x45d38584 -> :sswitch_5
        0x4a515eb4 -> :sswitch_4
        0x59a6c6eb -> :sswitch_8
        0x602fb033 -> :sswitch_a
        0x6243973f -> :sswitch_6
        0x794127c8 -> :sswitch_e
    .end sparse-switch
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 25

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

    const v19, 0x1ae09f6c

    sget v20, Ll/֡ܳ;->֡۠ۧ:I

    sget v21, Ll/ۗ۬;->ۤᩴ᩻:I

    const-string v22, "\u1a77\u06db"

    invoke-static/range {v22 .. v22}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v21

    xor-int v0, v22, v20

    mul-int/lit16 v0, v0, -0x3c69

    const v24, 0xb166893

    xor-int v0, v0, v24

    const v24, -0x51b655ca

    xor-int v22, v22, v24

    move-object v2, v1

    move-object v14, v13

    move-object/from16 v7, v16

    move/from16 v23, v22

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v22, 0x1ae09f6c

    const/16 v24, 0x0

    move-object/from16 v16, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v10, v22, v20

    mul-int/lit16 v10, v10, -0x6c2d

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v0, v10

    xor-int v22, v23, v0

    sparse-switch v22, :sswitch_data_0

    const/4 v0, 0x0

    return v0

    .line 108
    :sswitch_0
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_0
    move-object/from16 v0, p0

    goto/16 :goto_2

    .line 7
    :sswitch_1
    sget v0, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez v0, :cond_0

    goto/16 :goto_4

    .line 72
    :sswitch_2
    sget v0, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v0, :cond_b

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    goto/16 :goto_4

    .line 44
    :sswitch_4
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    const/4 v0, 0x0

    return v0

    .line 105
    :sswitch_5
    invoke-virtual {v2, v3}, Ll/ܿ۫ۚ;->ۖ(I)V

    const/4 v0, 0x1

    .line 205
    invoke-virtual {v2, v0}, Ll/ܿ۫ۚ;->ܰ(Z)V

    return v0

    :sswitch_6
    xor-int v0, v4, v5

    .line 103
    invoke-virtual {v2, v0}, Ll/ܿ۫ۚ;->᩺(I)V

    .line 104
    invoke-virtual {v2}, Ll/ܿ۫ۚ;->ۙ()V

    const/4 v3, 0x6

    .line 204
    sget v0, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "\u06d6\u1a7a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, -0x57cf

    const v23, 0x35ba8ae4

    xor-int v10, v10, v23

    const v23, 0x4f52f6b8    # 3.5393843E9f

    goto/16 :goto_7

    .line 67
    :sswitch_7
    invoke-static {v7, v8, v9, v13}, Ll/֨ܶ;->ۢ֡᩷([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    const v5, 0x7ef08504

    .line 173
    sget v0, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "\u06e7\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x37

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, -0x77e9

    const v23, -0x2efc0df

    xor-int v10, v10, v23

    const v23, -0x11d82696

    goto/16 :goto_7

    :sswitch_8
    const/16 v8, 0x19

    const/4 v9, 0x3

    .line 105
    sget v0, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v0, :cond_3

    :goto_1
    const-string v0, "\u06da\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x3f

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, -0x5591

    const v23, 0x37c46b9a

    xor-int v10, v10, v23

    const v23, 0x722289a5

    goto/16 :goto_7

    :cond_3
    const-string v0, "\u1a7b\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, -0x5fff

    const v23, 0x76231153

    xor-int v10, v10, v23

    const v23, 0x484a6345

    goto/16 :goto_7

    .line 67
    :sswitch_9
    new-instance v2, Ll/᩷֡ۨ;

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v0}, Ll/᩷֡ۨ;-><init>(Ll/֡֡ۨ;Ll/֡֡ۨ;)V

    sget-object v7, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v10

    if-nez v10, :cond_4

    :goto_2
    const-string v10, "\u073a\u06e8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v21

    xor-int v0, v10, v20

    mul-int/lit16 v0, v0, -0x49a3

    const v23, 0x530816ef

    xor-int v0, v0, v23

    const v23, -0x1a82296e

    xor-int v23, v10, v23

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u073d\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, 0x3c99

    const v23, 0x6cdb3b67

    xor-int v10, v10, v23

    const v23, 0x29133853

    goto/16 :goto_7

    .line 65
    :sswitch_a
    invoke-static {v14, v15, v6, v13}, Ll/֨᩺;->ۧۖܿ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    const v10, 0x7ea4b5d3

    xor-int/2addr v0, v10

    if-ne v1, v0, :cond_5

    const-string v0, "\u06dc\u06df"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, 0x5d8b

    const v23, -0x2dd13e81

    xor-int v10, v10, v23

    const v23, 0x1a7b1533

    goto/16 :goto_7

    :cond_5
    const-string v0, "\u1a77\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, -0x4f17

    const v23, -0x4879ad8d

    xor-int v10, v10, v23

    const v23, -0x2f9cce7c

    goto/16 :goto_7

    :sswitch_b
    const/4 v6, 0x3

    sget v0, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v0, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u06e7\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x51

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, -0x6027

    const v23, 0x7a83e5c2

    xor-int v10, v10, v23

    const v23, -0x5123e929    # -1.0008499E-10f

    goto/16 :goto_7

    :sswitch_c
    invoke-static/range {p1 .. p1}, Ll/۟;->ܶ۠ۘ(Ljava/lang/Object;)I

    move-result v1

    sget-object v14, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    const/16 v15, 0x16

    .line 167
    sget v0, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v0, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u05ab\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, 0x36d

    const v23, 0x5bb77b9

    xor-int v10, v10, v23

    const v23, 0x68ec7a1a

    goto/16 :goto_7

    :sswitch_d
    const/16 v0, 0x6262

    const/16 v13, 0x6262

    goto :goto_3

    :sswitch_e
    const v0, 0x925b

    const v13, 0x925b

    :goto_3
    const-string v0, "\u05a1\u06ec"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x7

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, -0x3eb5

    const v23, 0x7f09bbf3

    xor-int v10, v10, v23

    const v23, 0x780beb4a

    goto/16 :goto_7

    :sswitch_f
    add-int v0, v11, v12

    add-int/2addr v0, v0

    sub-int v0, v0, v24

    if-ltz v0, :cond_8

    const-string v0, "\u1a74\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x45

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, 0x3f9d

    const v23, -0x3cab580c

    xor-int v10, v10, v23

    const v23, -0x601f2c01

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, -0xa23

    const v23, 0x5330884a

    xor-int v10, v10, v23

    const v23, -0x47d9d40b

    goto/16 :goto_7

    :sswitch_10
    mul-int v24, v19, v19

    mul-int v11, v18, v18

    const v12, 0x13f72204

    .line 39
    sget v0, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v0, :cond_9

    goto :goto_4

    :cond_9
    const-string v0, "\u073f\u1a74"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, 0x3647

    const v23, -0x1b93df79

    xor-int v10, v10, v23

    const v23, 0x3bacbfa

    goto/16 :goto_7

    :sswitch_11
    aget-short v0, v16, v17

    add-int/lit16 v10, v0, 0x477e

    .line 118
    sget v18, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v18, :cond_a

    move/from16 v18, v0

    move/from16 v19, v10

    :goto_4
    const-string v0, "\u1a74\u1a7b"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, 0x21

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, 0x53c9

    const v23, 0x7c566e92

    xor-int v10, v10, v23

    const v23, 0x4fa5e311

    goto/16 :goto_7

    :cond_a
    const-string v18, "\u06d9\u1a73"

    invoke-static/range {v18 .. v18}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v21

    move/from16 v19, v0

    xor-int v0, v18, v20

    mul-int/lit16 v0, v0, 0x4527

    const v23, 0x601f420

    xor-int v0, v0, v23

    const v23, 0x6056d0ff

    xor-int v23, v18, v23

    move/from16 v18, v19

    move/from16 v19, v10

    goto/16 :goto_0

    :sswitch_12
    const/16 v17, 0x15

    .line 79
    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_c

    :cond_b
    :goto_5
    const-string v0, "\u1a74\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x5f

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, 0x2769

    const v23, 0x3e14214c

    xor-int v10, v10, v23

    const v23, 0x4ed7c07e

    goto :goto_7

    :cond_c
    const-string v0, "\u06e1\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, -0x5ba1

    const v23, -0x1b0a8041

    xor-int v10, v10, v23

    const v23, 0x53903a72

    goto :goto_7

    :sswitch_13
    sget-object v16, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    .line 97
    sget v0, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v0, :cond_e

    :cond_d
    :goto_6
    const-string v0, "\u1a74\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x49

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, 0x4eeb

    const v23, 0x14622b99

    xor-int v10, v10, v23

    const v23, 0x1d42efc9

    goto :goto_7

    :cond_e
    const-string v0, "\u06d9\u06ec"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, 0x27

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, -0x547d

    const v23, -0x526ff0ab

    xor-int v10, v10, v23

    const v23, 0x5f9cb767

    :goto_7
    xor-int v23, v0, v23

    move v0, v10

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78e05eb5 -> :sswitch_8
        -0x595dc603 -> :sswitch_a
        -0x4c840998 -> :sswitch_d
        -0x4516553a -> :sswitch_0
        -0x448624f9 -> :sswitch_9
        -0x3eabd40e -> :sswitch_10
        -0x3cd1b954 -> :sswitch_f
        -0x2ca4b91e -> :sswitch_2
        -0x1fb82c76 -> :sswitch_d
        -0x1f02495a -> :sswitch_c
        -0x18dcf583 -> :sswitch_3
        -0x16b4b2c2 -> :sswitch_7
        -0x13430446 -> :sswitch_6
        -0x11aff295 -> :sswitch_5
        -0xe988926 -> :sswitch_6
        -0xd6d3f89 -> :sswitch_11
        -0x83484bd -> :sswitch_1
        -0x69c27aa -> :sswitch_11
        0x894531 -> :sswitch_7
        0x1112515 -> :sswitch_1
        0x11d092c -> :sswitch_4
        0x4afd60f -> :sswitch_e
        0xf4884c5 -> :sswitch_13
        0x1a0abe29 -> :sswitch_9
        0x1c51274f -> :sswitch_12
        0x2974354b -> :sswitch_12
        0x2be99fb1 -> :sswitch_4
        0x308e7ba8 -> :sswitch_b
        0x356733b4 -> :sswitch_10
        0x35f2e720 -> :sswitch_e
        0x4439ee2a -> :sswitch_a
        0x447f25cb -> :sswitch_2
        0x4d5c7143 -> :sswitch_0
        0x5a2cd92c -> :sswitch_c
        0x5a46d45a -> :sswitch_13
        0x5bd887c8 -> :sswitch_f
        0x717168e7 -> :sswitch_8
        0x7b105d3b -> :sswitch_5
        0x7b119930 -> :sswitch_b
        0x7d1b9e2a -> :sswitch_3
    .end sparse-switch
.end method

.method public final onResume()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x170e94f5

    sget v2, Ll/֫ᩳ;->۬֨᩸:I

    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v4, "\u05ab\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7713

    const v6, -0x706d12b0

    xor-int/2addr v5, v6

    const v6, -0x52470ec8

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x76b9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 50
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_3

    .line 84
    :sswitch_0
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_1

    .line 31
    :sswitch_1
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_8

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_1

    .line 93
    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto/16 :goto_1

    .line 0
    :sswitch_4
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    return-void

    .line 119
    :sswitch_5
    iput-object v0, p0, Ll/֡֡ۨ;->ۚܰ:Ljava/util/List;

    .line 120
    iget-object v0, p0, Ll/֡֡ۨ;->ۖܰ:Ll/᩶֡ۨ;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    .line 119
    :sswitch_6
    invoke-static {}, Ll/ۙܰۖ;->ۙ()Ljava/util/List;

    move-result-object v0

    .line 0
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u06dc\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x792b

    const v6, -0x75dbda11

    xor-int/2addr v5, v6

    const v6, 0x717e6f0c

    goto :goto_0

    :cond_1
    const-string v4, "\u0730\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x39d3

    const v6, -0xe9fbeb6

    xor-int/2addr v5, v6

    const v6, -0x6c41270c

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v4

    if-gtz v4, :cond_3

    :cond_2
    const-string v4, "\u1a7a\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x819

    const v6, -0x77e16c02

    xor-int/2addr v5, v6

    const v6, -0x75549baf

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e8\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x601b

    const v6, 0xef86e60

    xor-int/2addr v5, v6

    const v6, 0x4b1eb097    # 1.0399895E7f

    goto/16 :goto_0

    .line 77
    :sswitch_8
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u05a1\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x72bf

    const v6, -0x7c19eae5

    xor-int/2addr v5, v6

    const v6, 0x65838c33

    goto/16 :goto_0

    .line 118
    :sswitch_9
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_5

    goto :goto_1

    :cond_5
    const-string v4, "\u06d9\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2eef

    const v6, 0x697422b2

    xor-int/2addr v5, v6

    const v6, 0x4123d871

    goto/16 :goto_0

    .line 63
    :sswitch_a
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_6

    :goto_1
    const-string v4, "\u06e4\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4b07

    const v6, -0x43392f90

    xor-int/2addr v5, v6

    const v6, -0x752879de

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a76\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7869

    const v6, -0x5cce03b9

    xor-int/2addr v5, v6

    const v6, -0x3d4fab95

    goto/16 :goto_0

    .line 5
    :sswitch_b
    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u0736\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x51db

    const v6, -0x626d43d

    xor-int/2addr v5, v6

    const v6, -0x47342be

    goto/16 :goto_0

    .line 49
    :sswitch_c
    sget-boolean v4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u06d8\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4a01

    const v6, -0x540c75b6

    xor-int/2addr v5, v6

    const v6, -0x27a52a14

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06da\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x20fd

    const v6, -0x4152ce53

    xor-int/2addr v5, v6

    const v6, 0x1628b8f9

    goto/16 :goto_0

    .line 40
    :sswitch_d
    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v4, :cond_a

    :goto_3
    const-string v4, "\u06ec\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4e17

    const v6, -0x6628bd2b

    xor-int/2addr v5, v6

    const v6, -0x4251e9f7

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u073f\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x41a1

    const v6, 0x36bf86b1

    xor-int/2addr v5, v6

    const v6, 0x598c0277

    goto/16 :goto_0

    .line 114
    :sswitch_e
    invoke-super {p0}, Ll/۫ܶۘ;->onResume()V

    .line 9
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06da\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x43f3

    const v6, -0x34ca0462    # -1.192643E7f

    xor-int/2addr v5, v6

    const v6, -0x3a2caafa

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073d\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2141

    const v6, -0x457357f2

    xor-int/2addr v5, v6

    const v6, -0x7a47dc34

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79562a86 -> :sswitch_b
        -0x78973e52 -> :sswitch_a
        -0x75dadfa4 -> :sswitch_c
        -0x75a0590c -> :sswitch_2
        -0x718e53b3 -> :sswitch_6
        -0x711bc532 -> :sswitch_4
        -0x685fa676 -> :sswitch_4
        -0x5f9a73e5 -> :sswitch_1
        -0x5e138ce6 -> :sswitch_7
        -0x585c6680 -> :sswitch_9
        -0x56762539 -> :sswitch_a
        -0x4f30c790 -> :sswitch_e
        -0x35baca04 -> :sswitch_e
        -0x31efdde4 -> :sswitch_8
        -0x21d7ed01 -> :sswitch_3
        -0x203b93e0 -> :sswitch_9
        -0x1054a9b6 -> :sswitch_0
        0xb5f60d0 -> :sswitch_b
        0x13269eea -> :sswitch_8
        0x2919f3b2 -> :sswitch_5
        0x2a552b01 -> :sswitch_6
        0x3a30e2bf -> :sswitch_1
        0x3bf49c33 -> :sswitch_7
        0x3f690ae5 -> :sswitch_d
        0x425b0ac1 -> :sswitch_2
        0x44fbe752 -> :sswitch_c
        0x4dc8b71f -> :sswitch_5
        0x63639ba1 -> :sswitch_3
        0x6c2177e0 -> :sswitch_d
        0x7a3aeb5b -> :sswitch_0
    .end sparse-switch
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x4d0e8b3

    sget v11, Ll/֫ۚ;->ܽ۠᩹:I

    sget v12, Ll/֫᩺;->᩺۟ۘ:I

    const-string v13, "\u06da\u1a7a"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x6f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3e19

    const v15, -0xf6a55ad

    xor-int/2addr v14, v15

    const v15, -0x178d88be

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x43eb

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    sget-boolean v13, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v13, :cond_7

    goto/16 :goto_5

    .line 2
    :sswitch_0
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v13

    if-gez v13, :cond_c

    goto/16 :goto_4

    :sswitch_1
    sget v13, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v13, :cond_a

    goto :goto_1

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    :goto_1
    const-string v13, "\u1a7a\u06d8"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x655

    const v15, -0x3a600d5c

    xor-int/2addr v14, v15

    const v15, -0x30f9da87

    goto :goto_0

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_4
    const/16 v0, 0x11

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/᩶;->ۙ᩷֨([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_5
    sget-object v8, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    const/16 v9, 0x1d

    .line 2
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v13

    if-gtz v13, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v13, "\u1a78\u06e4"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x77

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x435f

    const v15, 0x53daec7e

    xor-int/2addr v14, v15

    const v15, 0xc2bdd76    # 1.3240004E-31f

    goto :goto_0

    :sswitch_6
    const/16 v7, 0x41f3

    goto :goto_2

    :sswitch_7
    const v7, 0xe12e

    :goto_2
    const-string v13, "\u1a79\u06d8"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1665

    const v15, -0x135dbae2

    xor-int/2addr v14, v15

    const v15, -0x2272147

    goto/16 :goto_0

    :sswitch_8
    add-int v13, v5, v6

    sub-int v13, v4, v13

    if-lez v13, :cond_1

    const-string v13, "\u1a79\u06e0"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x2b25

    const v15, -0x175e9a27

    xor-int/2addr v14, v15

    const v15, 0xaebdd70

    goto/16 :goto_0

    :cond_1
    const-string v13, "\u06e2\u1a76"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1929

    const v15, 0x13c783aa

    xor-int/2addr v14, v15

    const v15, 0x7a587bf4

    goto/16 :goto_0

    :sswitch_9
    const v6, 0x243c190

    sget v13, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v13, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v13, "\u06e4\u05ab"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x477f

    const v15, -0x56402570

    xor-int/2addr v14, v15

    const v15, 0x177f4c52

    goto/16 :goto_0

    :sswitch_a
    mul-int v4, v2, v3

    mul-int v5, v2, v2

    .line 3
    sget v13, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v13, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v13, "\u1a77\u1a73"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7c29

    const v15, 0x651e9fdc

    xor-int/2addr v14, v15

    const v15, 0x71e00416

    goto/16 :goto_0

    :sswitch_b
    aget-short v2, v0, v1

    const/16 v3, 0x3028

    .line 1
    sget v13, Ll/֨ۧ;->֫۠֡:I

    if-gtz v13, :cond_4

    goto :goto_3

    :cond_4
    const-string v13, "\u1a75\u073f"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0xd

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xc43

    const v15, 0x2cd50341

    xor-int/2addr v14, v15

    const v15, -0x3be5ef4c

    goto/16 :goto_0

    :sswitch_c
    const/16 v1, 0x1c

    .line 3
    sget-boolean v13, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v13, :cond_5

    :goto_3
    const-string v13, "\u1a74\u073a"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0xf

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x603d

    const v15, -0x447cce5a

    xor-int/2addr v14, v15

    const v15, 0x441eaaf6

    goto/16 :goto_0

    :cond_5
    const-string v13, "\u06e4\u1a79"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x34d9

    const v15, -0xdb56eb1

    xor-int/2addr v14, v15

    const v15, -0x2e2926fd

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v13, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v13, :cond_6

    goto :goto_4

    :cond_6
    const-string v13, "\u06db\u073d"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4d5

    const v15, 0x77fe1e27

    xor-int/2addr v14, v15

    const v15, 0x35e3c654

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget-boolean v13, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v13, :cond_8

    :cond_7
    :goto_4
    const-string v13, "\u1a7a\u06d6"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2e8b

    const v15, 0x6e38438c

    xor-int/2addr v14, v15

    const v15, 0x100f508

    goto/16 :goto_0

    :cond_8
    const-string v13, "\u06eb\u1a76"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x43ab

    const v15, -0x13365d15

    xor-int/2addr v14, v15

    const v15, 0x282420a7

    goto/16 :goto_0

    :sswitch_f
    sget v13, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v13, :cond_9

    goto :goto_6

    :cond_9
    const-string v13, "\u073f\u06e0"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4c89

    const v15, 0x65269a66

    xor-int/2addr v14, v15

    const v15, -0x49effb8

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v13, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v13, :cond_b

    :cond_a
    :goto_5
    const-string v13, "\u06eb\u06e7"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x52c7

    const v15, 0x5986620d

    xor-int/2addr v14, v15

    const v15, 0x595b3d11

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u06d9\u073a"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x55

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x2c9

    const v15, 0xf8aebd9

    xor-int/2addr v14, v15

    const v15, -0x52d84b50

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/֡֡ۨ;->ۗ֨ܿ:[S

    .line 3
    sget v13, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v13, :cond_d

    :cond_c
    :goto_6
    const-string v13, "\u06d9\u06da"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3a57

    const v15, 0x2403e6f0

    xor-int/2addr v14, v15

    const v15, -0x27afcb31

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u06e8\u06db"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x2f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x74d5

    const v15, -0x5904ba7e

    xor-int/2addr v14, v15

    const v15, 0x1ab02628

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e220bd4 -> :sswitch_11
        -0x6a70bd08 -> :sswitch_7
        -0x5d524b04 -> :sswitch_a
        -0x59b250e3 -> :sswitch_b
        -0x4973c96b -> :sswitch_2
        -0x25cb34b2 -> :sswitch_c
        -0x22d53b89 -> :sswitch_0
        -0x1f38810a -> :sswitch_1
        -0x1bb1ba62 -> :sswitch_f
        -0x12cafbcd -> :sswitch_10
        -0x1f481e6 -> :sswitch_8
        0x264be78 -> :sswitch_b
        0x678ccc1 -> :sswitch_9
        0x7d38cb1 -> :sswitch_2
        0x120c331e -> :sswitch_5
        0x143834dc -> :sswitch_5
        0x14b63111 -> :sswitch_e
        0x1623170a -> :sswitch_11
        0x162e0bde -> :sswitch_a
        0x20d2c83f -> :sswitch_3
        0x2ba2b884 -> :sswitch_9
        0x301b80e1 -> :sswitch_10
        0x30ac65f9 -> :sswitch_6
        0x36ead995 -> :sswitch_e
        0x44112c4c -> :sswitch_c
        0x496746b4 -> :sswitch_0
        0x5fbf5647 -> :sswitch_d
        0x60e4111e -> :sswitch_8
        0x641e8d61 -> :sswitch_4
        0x64ba864d -> :sswitch_7
        0x73a61d9d -> :sswitch_f
        0x7450abf4 -> :sswitch_3
        0x7698489f -> :sswitch_1
        0x7a6b59c4 -> :sswitch_d
        0x7d7360fc -> :sswitch_6
        0x7e63ad30 -> :sswitch_4
    .end sparse-switch
.end method

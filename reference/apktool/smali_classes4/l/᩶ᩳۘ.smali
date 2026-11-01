.class public final synthetic Ll/᩶ᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܺ:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ᩳۘ;->ܺ:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7

    const/4 v0, 0x0

    const v1, -0x10b6b030

    sget v2, Ll/ۧ;->֫۠ᩴ:I

    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    const-string v4, "\u06ec\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2a59

    const v6, 0x615b8e65

    xor-int/2addr v5, v6

    const v6, 0x51523816

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x5e1d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 2115
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v4

    if-gtz v4, :cond_7

    goto/16 :goto_1

    .line 900
    :sswitch_0
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06d7\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x987

    const v6, 0x655d3a27

    xor-int/2addr v5, v6

    const v6, 0x4b0eda7

    goto :goto_0

    .line 1990
    :sswitch_1
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-gez v4, :cond_6

    goto/16 :goto_3

    .line 616
    :sswitch_2
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_8

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    goto/16 :goto_3

    .line 1795
    :sswitch_4
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    const/4 p1, 0x0

    return p1

    .line 4
    :sswitch_5
    check-cast p2, Ll/ܽᩴۘ;

    .line 6
    sget p1, Ll/ۙ۠ۘ;->᩻ܰ:I

    .line 2291
    iget-object p1, p0, Ll/᩶ᩳۘ;->ܺ:Ljava/util/Comparator;

    invoke-interface {p1, p2, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/ܽᩴۘ;

    .line 2068
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v4

    if-gtz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u06d9\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x133f

    const v6, 0x359bee80

    xor-int/2addr v5, v6

    const v6, -0x5626a33d

    goto :goto_0

    .line 409
    :sswitch_7
    sget-boolean v4, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u1a7a\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5507

    const v6, -0x1a095d59

    xor-int/2addr v5, v6

    const v6, 0x665231f

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u05ab\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1d45

    const v6, 0x340b0e55

    xor-int/2addr v5, v6

    const v6, 0x14f1a7e6

    goto/16 :goto_0

    .line 874
    :sswitch_9
    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u1a7a\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7b2f

    const v6, -0x57ccb024

    xor-int/2addr v5, v6

    const v6, 0x300084b0

    goto/16 :goto_0

    .line 1156
    :sswitch_a
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06df\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x813

    const v6, -0x40194ffd

    xor-int/2addr v5, v6

    const v6, 0x77b9a263

    goto/16 :goto_0

    :cond_6
    :goto_1
    const-string v4, "\u06ec\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5443

    const v6, 0x5b5736a1

    xor-int/2addr v5, v6

    const v6, -0x6fae960e

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u073a\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x39c9

    const v6, -0x341b038d    # -3.001367E7f

    xor-int/2addr v5, v6

    const v6, 0x68fb28db

    goto/16 :goto_0

    .line 1893
    :sswitch_b
    sget-boolean v4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u1a74\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2a91

    const v6, -0x4b0f318a

    xor-int/2addr v5, v6

    const v6, -0x798fdab3

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a7b\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2e4d

    const v6, -0x77673ee8

    xor-int/2addr v5, v6

    const v6, 0x6375f661

    goto/16 :goto_0

    .line 256
    :sswitch_c
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u0736\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x43db

    const v6, 0x1222294c

    xor-int/2addr v5, v6

    const v6, 0x7d253477

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_b

    :goto_3
    const-string v4, "\u0733\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x59ab

    const v6, -0x5e6d1189

    xor-int/2addr v5, v6

    const v6, 0x38ad295b

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06dc\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x65b5

    const v6, -0x34525f4d    # -2.2757734E7f

    xor-int/2addr v5, v6

    const v6, -0x156d0731

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u073f\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7199

    const v6, -0x4a5ca0e0

    xor-int/2addr v5, v6

    const v6, -0x61e9c888

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06dc\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xb67

    const v6, 0x30f94d55

    xor-int/2addr v5, v6

    const v6, -0x52eace03

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fad07d5 -> :sswitch_0
        -0x7856ccc8 -> :sswitch_4
        -0x7405bf71 -> :sswitch_e
        -0x6b424c4b -> :sswitch_e
        -0x67d243a0 -> :sswitch_c
        -0x4eade300 -> :sswitch_8
        -0x4b012df5 -> :sswitch_6
        -0x3dded184 -> :sswitch_b
        -0x332b8c2f -> :sswitch_5
        -0x32fbf385 -> :sswitch_1
        -0x31c972f1 -> :sswitch_a
        -0x3182f337 -> :sswitch_7
        -0x22db12a1 -> :sswitch_d
        -0x1b206170 -> :sswitch_3
        -0x13b38227 -> :sswitch_2
        -0x9bde6ba -> :sswitch_3
        0x6a3359e -> :sswitch_4
        0x7035e29 -> :sswitch_b
        0x12524117 -> :sswitch_8
        0x12aac6f7 -> :sswitch_2
        0x16dd7b87 -> :sswitch_5
        0x1c3bfd8a -> :sswitch_9
        0x49cdf97a -> :sswitch_c
        0x4b1573d5 -> :sswitch_d
        0x6b46361e -> :sswitch_a
        0x724a207f -> :sswitch_9
        0x748131a2 -> :sswitch_1
        0x76571e51 -> :sswitch_6
        0x7bb8b099 -> :sswitch_7
        0x7ff40c83 -> :sswitch_0
    .end sparse-switch
.end method

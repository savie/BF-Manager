.class public final synthetic Ll/ܺ᩷ۘ;
.super Ljava/lang/Object;
.source "12B7"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܺ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܺ᩷ۘ;->ܺ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩻ᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const v0, 0x64dcd50e

    sget v1, Ll/֫;->ܶܺ᩻:I

    sget v2, Ll/ۗ;->֨۬ۖ:I

    const-string v3, "\u073f\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x30e5

    const v5, -0x6172ef4b

    xor-int/2addr v4, v5

    const v5, -0x8a972ce

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x5b0f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4914
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v3

    if-lez v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u1a7b\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1043

    const v5, -0x11345d72

    xor-int/2addr v4, v5

    const v5, -0x66a10136

    goto :goto_0

    .line 177
    :sswitch_0
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v3, :cond_7

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v3

    if-gez v3, :cond_b

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    goto/16 :goto_3

    .line 614
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    const/4 p1, 0x0

    return-object p1

    .line 7
    :sswitch_4
    check-cast p1, Ll/ۜۡ۟;

    .line 1190
    iget-object p1, p1, Ll/ۜۡ۟;->֫:Ll/ۛ᩵ۤ;

    iget-object p1, p1, Ll/᩻᩵ۤ;->ۧ:Ll/ܽۤۤ;

    return-object p1

    .line 0
    :sswitch_5
    check-cast p1, Ll/ܽۤۤ;

    .line 5296
    iget-object p1, p1, Ll/ܽۤۤ;->᩶:Ll/֡᩵ۤ;

    check-cast p1, Ll/᩹᩵ۤ;

    return-object p1

    .line 0
    :sswitch_6
    check-cast p1, Ljava/lang/Integer;

    sget p1, Ll/᩺ۚۤ;->ۙܰ:I

    const/4 p1, 0x0

    return-object p1

    :sswitch_7
    check-cast p1, Ll/۟ۙۤ;

    invoke-static {p1}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :sswitch_8
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$iI8TGVaVp779Csfd1EQBRGyBCw4(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    :sswitch_9
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$U3VuEYWsqMWheBs1r_cUItLqV_I(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :sswitch_a
    check-cast p1, Ll/ܰ᩷᩺;

    invoke-virtual {p1}, Ll/ܰ᩷᩺;->ܰ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 2
    :sswitch_b
    iget v3, p0, Ll/ܺ᩷ۘ;->ܺ:I

    packed-switch v3, :pswitch_data_0

    const-string v3, "\u06e8\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x459f

    const v5, 0x4bcacbe4    # 2.6580936E7f

    xor-int/2addr v4, v5

    const v5, -0x4f987c29

    goto/16 :goto_0

    :pswitch_0
    const-string v3, "\u05a8\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7095

    const v5, 0x779fd28d

    xor-int/2addr v4, v5

    const v5, 0x5a28f40c

    goto/16 :goto_0

    :pswitch_1
    const-string v3, "\u06d8\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1351

    const v5, -0x125faf94

    xor-int/2addr v4, v5

    const v5, -0x2ec8d01a

    goto/16 :goto_0

    :pswitch_2
    const-string v3, "\u1a75\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3b37

    const v5, 0x54f79a65

    xor-int/2addr v4, v5

    const v5, 0x791b83fe

    goto/16 :goto_0

    :pswitch_3
    const-string v3, "\u06d9\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x408d

    const v5, 0x256bc574

    xor-int/2addr v4, v5

    const v5, -0x422c9431

    goto/16 :goto_0

    :pswitch_4
    const-string v3, "\u1a78\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xb0d

    const v5, -0x6409506f

    xor-int/2addr v4, v5

    const v5, -0xa1c8f5a

    goto/16 :goto_0

    :pswitch_5
    const-string v3, "\u1a78\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5eb

    const v5, -0x7b2c0758

    xor-int/2addr v4, v5

    const v5, -0x444394a2

    goto/16 :goto_0

    .line 1396
    :sswitch_c
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-ltz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v3, "\u06df\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x447

    const v5, -0x50505c22

    xor-int/2addr v4, v5

    const v5, 0x200878a8

    goto/16 :goto_0

    .line 1143
    :sswitch_d
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u05a1\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4671

    const v5, -0x7bac6bc6

    xor-int/2addr v4, v5

    const v5, 0x48b4f606

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u0730\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x537b

    const v5, -0x79bb9ddd

    xor-int/2addr v4, v5

    const v5, -0x720cb0d9

    goto/16 :goto_0

    :sswitch_f
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u1a77\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xff5

    const v5, -0x2bfec254

    xor-int/2addr v4, v5

    const v5, -0x2597c5f0

    goto/16 :goto_0

    .line 1321
    :sswitch_10
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u1a77\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2b03

    const v5, 0x5ac509ff

    xor-int/2addr v4, v5

    const v5, -0x15c923df

    goto/16 :goto_0

    .line 4824
    :sswitch_11
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-nez v3, :cond_6

    :goto_1
    const-string v3, "\u1a77\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x66d1

    const v5, 0x6e7cbadc

    xor-int/2addr v4, v5

    const v5, 0x3992a67b

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u073f\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3085

    const v5, 0x601b4f2d

    xor-int/2addr v4, v5

    const v5, 0x5eadb9e6

    goto/16 :goto_0

    .line 3158
    :sswitch_12
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06ec\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x70dd

    const v5, 0x3d0bd343

    xor-int/2addr v4, v5

    const v5, -0x689520f4

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a75\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x32c1

    const v5, -0x30a98ac5

    xor-int/2addr v4, v5

    const v5, 0x783dcc6

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v3

    if-gtz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u073f\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1761

    const v5, 0x7108b5ef

    xor-int/2addr v4, v5

    const v5, 0x27fc676f

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v3

    if-eqz v3, :cond_a

    :goto_3
    const-string v3, "\u06e4\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5e1f

    const v5, 0x62aeb2f3

    xor-int/2addr v4, v5

    const v5, 0x5da09bce

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a7b\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x742b

    const v5, -0x63b63183

    xor-int/2addr v4, v5

    const v5, -0x3b43c56d

    goto/16 :goto_0

    .line 1440
    :sswitch_15
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e1\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x693d

    const v5, 0x4ffa796a

    xor-int/2addr v4, v5

    const v5, -0x68bd927b

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06dc\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x108b

    const v5, -0x612a2144

    xor-int/2addr v4, v5

    const v5, 0x148c2246

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7df8de86 -> :sswitch_0
        -0x7ca23821 -> :sswitch_10
        -0x6d074e02 -> :sswitch_b
        -0x6b2dca83 -> :sswitch_5
        -0x600d9e42 -> :sswitch_c
        -0x5ac41002 -> :sswitch_6
        -0x59831571 -> :sswitch_14
        -0x54b2c83a -> :sswitch_14
        -0x5457939a -> :sswitch_0
        -0x535d3911 -> :sswitch_c
        -0x454438b4 -> :sswitch_10
        -0x3d6c43e2 -> :sswitch_15
        -0x3c1fb664 -> :sswitch_6
        -0x3c15faac -> :sswitch_12
        -0x3867f30b -> :sswitch_11
        -0x3823c16b -> :sswitch_15
        -0x34169004 -> :sswitch_a
        -0x3031c9ba -> :sswitch_d
        -0x16c0ce72 -> :sswitch_13
        -0x16915c7c -> :sswitch_1
        -0x15d9e037 -> :sswitch_9
        -0xc41f5b1 -> :sswitch_5
        -0xb41c9b5 -> :sswitch_1
        -0x3554b11 -> :sswitch_11
        0x4c2960a -> :sswitch_9
        0xb06082c -> :sswitch_f
        0xcb626e1 -> :sswitch_4
        0xf2397ff -> :sswitch_8
        0x139396ec -> :sswitch_12
        0x1610104b -> :sswitch_3
        0x20a9833a -> :sswitch_13
        0x25b290bf -> :sswitch_2
        0x274929a1 -> :sswitch_7
        0x2d1a60c0 -> :sswitch_e
        0x324304a8 -> :sswitch_e
        0x3cf9c94d -> :sswitch_7
        0x3f03a4ef -> :sswitch_d
        0x511a3c45 -> :sswitch_8
        0x53d68bfa -> :sswitch_3
        0x5471f6ea -> :sswitch_4
        0x5614cc89 -> :sswitch_2
        0x563f2a92 -> :sswitch_a
        0x6780ce89 -> :sswitch_f
        0x71ba3fc0 -> :sswitch_b
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩻ᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

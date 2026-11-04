.class public final synthetic Ll/ۗۜ᩻;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۜ᩻;->ܰ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x220dd28e

    sget v2, Ll/ۖܰ;->۟֫ܽ:I

    sget v3, Ll/֡᩵;->ۤܳ۬:I

    const-string v4, "\u06ec\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3c73

    const v6, 0x354e6897

    xor-int/2addr v5, v6

    const v6, -0x28ba3d6b

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x7239

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    return-void

    .line 113
    :sswitch_0
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    sget-boolean v4, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u073d\u0736"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x149

    const v6, -0x7e72f2dd

    xor-int/2addr v5, v6

    const v6, 0x7f6202d6

    goto :goto_0

    .line 37
    :sswitch_1
    sget v4, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v4, :cond_b

    goto/16 :goto_2

    .line 66
    :sswitch_2
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    if-lez v4, :cond_9

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto/16 :goto_1

    .line 4
    :sswitch_4
    check-cast p1, Ll/֫۬᩻;

    .line 140
    iput-object v0, p1, Ll/֫۬᩻;->ۙ:Ljava/util/Map;

    return-void

    .line 2
    :sswitch_5
    iget-object v0, p0, Ll/ۗۜ᩻;->ܰ:Ljava/util/Map;

    .line 107
    sget v4, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v4, :cond_1

    const-string v4, "\u06da\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7419

    const v6, -0x7a39b003

    xor-int/2addr v5, v6

    const v6, -0x137b6b95

    goto :goto_0

    :cond_1
    const-string v4, "\u06e2\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xb39

    const v6, 0x36a013c7

    xor-int/2addr v5, v6

    const v6, 0x7753ddb8

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u1a73\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4d5d

    const v6, -0x324a1d0b

    xor-int/2addr v5, v6

    const v6, -0x26a134c2

    goto/16 :goto_0

    :sswitch_7
    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u1a73\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1641

    const v6, 0x7cb0b656

    xor-int/2addr v5, v6

    const v6, -0x6f6eb98e

    goto/16 :goto_0

    .line 75
    :sswitch_8
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v4

    if-gtz v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u06d7\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3983

    const v6, -0x1b6f917b

    xor-int/2addr v5, v6

    const v6, 0x3fb82584

    goto/16 :goto_0

    .line 97
    :sswitch_9
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v4, "\u0736\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1f93

    const v6, -0x6f61c4d8

    xor-int/2addr v5, v6

    const v6, 0x3b1abef8

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_6

    :goto_1
    const-string v4, "\u1a7a\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x275d

    const v6, -0x57b3b737

    xor-int/2addr v5, v6

    const v6, 0x1e2f3c9e

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a78\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2b89

    const v6, 0x6539054b

    xor-int/2addr v5, v6

    const v6, -0x9d0f680

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u06df\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6903

    const v6, -0x2c643456

    xor-int/2addr v5, v6

    const v6, 0x5cbe139e

    goto/16 :goto_0

    .line 72
    :sswitch_c
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v4, :cond_8

    goto :goto_2

    :cond_8
    const-string v4, "\u06df\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4e43

    const v6, -0x4c3fc0db

    xor-int/2addr v5, v6

    const v6, -0x3788c17

    goto/16 :goto_0

    .line 38
    :sswitch_d
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u06eb\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x171f

    const v6, -0x306f0c63

    xor-int/2addr v5, v6

    const v6, 0x51e85c59

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0736\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6ab7

    const v6, -0x2b79bd21

    xor-int/2addr v5, v6

    const v6, -0xf2f45d3

    goto/16 :goto_0

    .line 136
    :sswitch_e
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v4

    if-eqz v4, :cond_c

    :cond_b
    const-string v4, "\u1a73\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4ed3

    const v6, -0x689bd003

    xor-int/2addr v5, v6

    const v6, 0x60b7fc88

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06dc\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x14e1

    const v6, 0x5854be5c

    xor-int/2addr v5, v6

    const v6, 0x46ced7c8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6b4ce8ae -> :sswitch_8
        -0x5b155769 -> :sswitch_0
        -0x586e9cf6 -> :sswitch_3
        -0x4cb0c828 -> :sswitch_c
        -0x4a929569 -> :sswitch_7
        -0x4741441d -> :sswitch_c
        -0x33e452d3 -> :sswitch_d
        -0x2dc13d38 -> :sswitch_0
        -0x270364f5 -> :sswitch_6
        -0xa488f43 -> :sswitch_1
        -0x16d6ecf -> :sswitch_a
        0x1986664d -> :sswitch_3
        0x1cb58fe8 -> :sswitch_6
        0x1fbe34ae -> :sswitch_e
        0x2f5edef6 -> :sswitch_2
        0x306e8dc3 -> :sswitch_5
        0x3729ecd1 -> :sswitch_1
        0x3f243e87 -> :sswitch_9
        0x3f3de631 -> :sswitch_4
        0x3f6b4c9f -> :sswitch_7
        0x4a213fb1 -> :sswitch_5
        0x5732fe97 -> :sswitch_2
        0x5b7f2c48 -> :sswitch_d
        0x5d908a11 -> :sswitch_e
        0x65d4d795 -> :sswitch_4
        0x6f3689c4 -> :sswitch_b
        0x70e98d90 -> :sswitch_b
        0x7374bf2e -> :sswitch_8
        0x7776ce72 -> :sswitch_a
        0x7cf9d372 -> :sswitch_9
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

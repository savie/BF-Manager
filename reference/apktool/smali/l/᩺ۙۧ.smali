.class public final synthetic Ll/᩺ۙۧ;
.super Ljava/lang/Object;
.source "12B7"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩺ۙۧ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۨܰᩴ;)V
    .locals 5

    const p1, -0x2fa5c43f

    sget v0, Ll/ۖ֨;->֨ۨۧ:I

    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    const/4 v2, 0x1

    .line 0
    iput v2, p0, Ll/᩺ۙۧ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v2, "\u073a\u06dc"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x3

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x215f

    const v4, -0x7c65f6ed

    xor-int/2addr v3, v4

    const v4, -0x4bb93a44

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, 0x18e9

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget v2, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v2, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "\u0733\u06d6"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x5381

    const v4, -0x2a73dc16

    xor-int/2addr v3, v4

    const v4, 0x37c918b0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "\u073a\u06e2"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x2a75

    const v4, -0x52316246

    xor-int/2addr v3, v4

    const v4, -0x28a3bef1

    goto :goto_0

    .line 4
    :sswitch_2
    sget-boolean v2, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const-string v2, "\u073a\u06d8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x4f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x67a3

    const v4, 0x215a7800

    xor-int/2addr v3, v4

    const v4, 0x487ac937

    goto :goto_0

    :goto_1
    const-string v2, "\u06d6\u1a78"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x11

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x194f

    const v4, -0x25246e7c

    xor-int/2addr v3, v4

    const v4, -0x4286e356

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget v2, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v2, :cond_3

    const-string v2, "\u06d7\u06d9"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x55

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4f79

    const v4, 0x4bc3a9f1    # 2.564605E7f

    xor-int/2addr v3, v4

    const v4, 0x57bd2110    # 4.158994E14f

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06dc\u06df"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x73f5

    const v4, -0x3cad92ad

    xor-int/2addr v3, v4

    const v4, -0x5b8ad942

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72aa7cc8 -> :sswitch_3
        -0x60fbaaee -> :sswitch_0
        -0x57044420 -> :sswitch_0
        -0x4cfb45db -> :sswitch_4
        -0x3fd21f01 -> :sswitch_2
        -0x381ddd6c -> :sswitch_1
        -0x228ab5e0 -> :sswitch_4
        0xfc478 -> :sswitch_2
        0x6a271ba -> :sswitch_1
        0xdeddfae -> :sswitch_5
        0x54803c96 -> :sswitch_5
        0x7be7dbbf -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const v0, 0x71661a86

    sget v1, Ll/᩺;->۫۬۫:I

    sget v2, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v3, "\u06e0\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4d81

    const v5, 0x60a2e4b8

    xor-int/2addr v4, v5

    const v5, -0x2600a196

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x18ff

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 169
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_5

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_b

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v3, "\u1a75\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6397

    const v5, 0x4aae2bec    # 5707254.0f

    xor-int/2addr v4, v5

    const v5, -0x7058743e

    goto :goto_0

    .line 73
    :sswitch_2
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    :goto_2
    const-string v3, "\u073a\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2bcf

    const v5, -0x201f9c1d

    xor-int/2addr v4, v5

    const v5, 0x5946b189

    goto :goto_0

    .line 215
    :sswitch_3
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    goto/16 :goto_4

    .line 236
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    const/4 p1, 0x0

    return-object p1

    .line 7
    :sswitch_5
    check-cast p1, Ll/ۢ֨ۘ;

    .line 10
    invoke-static {p1}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 14
    :sswitch_6
    check-cast p1, Ljava/lang/Integer;

    .line 16
    sget p1, Ll/᩺᩻᩺;->ۙ᩷:I

    const/4 p1, 0x0

    return-object p1

    .line 20
    :sswitch_7
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 23
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$BP08d14uw5Tb0y_ZBi-n10CGqfs(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 27
    :sswitch_8
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 30
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$53no_2VMDH8w3XkUWXd1r-1K93o(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    .line 34
    :sswitch_9
    check-cast p1, Ll/᩻᩶ᩴ;

    .line 84
    iget-object p1, p1, Ll/᩻᩶ᩴ;->۫:Ljava/lang/String;

    return-object p1

    .line 0
    :sswitch_a
    check-cast p1, Ll/᩵ۚۤ;

    invoke-static {p1}, Ll/ܺᩴ۫;->ۙ(Ll/᩵ۚۤ;)Ll/ܺᩴ۫;

    move-result-object p1

    return-object p1

    .line 381
    :sswitch_b
    check-cast p1, Ll/᩷ۨᩴ;

    invoke-static {p1}, Ll/ۘ۟;->᩹۬֡(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :sswitch_c
    check-cast p1, Ll/۠۬᩻;

    invoke-virtual {p1}, Ll/۠۬᩻;->ۙ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 2
    :sswitch_d
    iget v3, p0, Ll/᩺ۙۧ;->ܰ:I

    packed-switch v3, :pswitch_data_0

    const-string v3, "\u06e1\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x71d3

    const v5, 0x221cff56

    xor-int/2addr v4, v5

    const v5, 0x2303abec

    goto/16 :goto_0

    :pswitch_0
    const-string v3, "\u1a77\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7601

    const v5, 0x547cf82a

    xor-int/2addr v4, v5

    const v5, -0xf67738b

    goto/16 :goto_0

    :pswitch_1
    const-string v3, "\u06e8\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xd47

    const v5, 0x7686677f

    xor-int/2addr v4, v5

    const v5, -0x38e92865

    goto/16 :goto_0

    :pswitch_2
    const-string v3, "\u1a7a\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7bdd

    const v5, -0x11a6353d

    xor-int/2addr v4, v5

    const v5, -0x2692235

    goto/16 :goto_0

    :pswitch_3
    const-string v3, "\u05a1\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6a79

    const v5, 0x7092be93

    xor-int/2addr v4, v5

    const v5, 0x3da32189

    goto/16 :goto_0

    :pswitch_4
    const-string v3, "\u06e4\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x313b

    const v5, -0x3715c7c6

    xor-int/2addr v4, v5

    const v5, -0x7b167e1b

    goto/16 :goto_0

    :pswitch_5
    const-string v3, "\u1a7a\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5705

    const v5, -0x58e0dda3

    xor-int/2addr v4, v5

    const v5, -0x5673a453

    goto/16 :goto_0

    :pswitch_6
    const-string v3, "\u06d7\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x73a1

    const v5, 0x149953c6

    xor-int/2addr v4, v5

    const v5, -0x17b2de8e

    goto/16 :goto_0

    .line 314
    :sswitch_e
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u05a8\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xcb1

    const v5, 0x38fb2775

    xor-int/2addr v4, v5

    const v5, -0x48df792a

    goto/16 :goto_0

    .line 63
    :sswitch_f
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    const-string v3, "\u06da\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xe9f

    const v5, -0x63127

    xor-int/2addr v4, v5

    const v5, 0x6ae7ddf7

    goto/16 :goto_0

    .line 304
    :sswitch_10
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u1a73\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x22af

    const v5, -0x50248ccb

    xor-int/2addr v4, v5

    const v5, -0x1fadc4e9

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u073f\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2a0f

    const v5, -0x4fc97fb0

    xor-int/2addr v4, v5

    const v5, 0x7a14b7c3

    goto/16 :goto_0

    .line 217
    :sswitch_11
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06e2\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1f45

    const v5, -0x3bc86290

    xor-int/2addr v4, v5

    const v5, 0x5a7ade8a

    goto/16 :goto_0

    .line 159
    :sswitch_12
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_7

    :goto_3
    const-string v3, "\u1a78\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2015

    const v5, 0x72401b6a

    xor-int/2addr v4, v5

    const v5, 0x47476629

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d8\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x48eb

    const v5, -0x54f06992

    xor-int/2addr v4, v5

    const v5, 0x27757f02

    goto/16 :goto_0

    .line 273
    :sswitch_13
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v3

    if-gtz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u1a76\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xbd5

    const v5, 0xa0353e0

    xor-int/2addr v4, v5

    const v5, 0x520adc9a

    goto/16 :goto_0

    .line 129
    :sswitch_14
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v3

    if-gtz v3, :cond_9

    :goto_4
    const-string v3, "\u1a7b\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3057

    const v5, 0x5e96afe4

    xor-int/2addr v4, v5

    const v5, 0x47ca205

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a79\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7453

    const v5, -0x39bf0f3b

    xor-int/2addr v4, v5

    const v5, 0x5d286607

    goto/16 :goto_0

    .line 135
    :sswitch_15
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u06d6\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x54e5

    const v5, 0x13e3b171

    xor-int/2addr v4, v5

    const v5, -0x12503e65

    goto/16 :goto_0

    .line 148
    :sswitch_16
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06da\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a9

    const v5, 0x7ccd217a

    xor-int/2addr v4, v5

    const v5, -0xb2dcb31

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073d\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x62c5

    const v5, 0x285d442f

    xor-int/2addr v4, v5

    const v5, -0x6d8728c4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7dfa312a -> :sswitch_6
        -0x78f799f5 -> :sswitch_f
        -0x723ce372 -> :sswitch_d
        -0x71db46b7 -> :sswitch_16
        -0x6c93b8fe -> :sswitch_b
        -0x6c2613e2 -> :sswitch_7
        -0x6a069b43 -> :sswitch_b
        -0x652c7cd5 -> :sswitch_c
        -0x64e4708e -> :sswitch_13
        -0x5b603f3e -> :sswitch_c
        -0x5a5d5dab -> :sswitch_10
        -0x570a4efa -> :sswitch_f
        -0x4deab637 -> :sswitch_6
        -0x4b90f8ff -> :sswitch_5
        -0x4817056d -> :sswitch_14
        -0x4443f994 -> :sswitch_9
        -0x3972c6c0 -> :sswitch_2
        -0x346ccb0a -> :sswitch_8
        -0x344f42c5 -> :sswitch_11
        -0x31ce4304 -> :sswitch_1
        -0x2efff3d2 -> :sswitch_13
        -0x2d1a349a -> :sswitch_a
        -0x2a788ac8 -> :sswitch_4
        -0x25ad5653 -> :sswitch_7
        -0x20055509 -> :sswitch_8
        -0x1f19b662 -> :sswitch_15
        -0x10a410a6 -> :sswitch_9
        -0xede0e68 -> :sswitch_e
        -0x30e649d -> :sswitch_3
        0x694223a -> :sswitch_16
        0x88a2816 -> :sswitch_10
        0xadb033f -> :sswitch_4
        0xedfd8f0 -> :sswitch_11
        0x10a0583a -> :sswitch_14
        0x18797e14 -> :sswitch_e
        0x20a5005b -> :sswitch_5
        0x241c1f65 -> :sswitch_0
        0x2dc29398 -> :sswitch_2
        0x2f5b9ad7 -> :sswitch_12
        0x39e7dcb5 -> :sswitch_15
        0x44cb2e35 -> :sswitch_12
        0x4f6af0a4 -> :sswitch_d
        0x5b697388 -> :sswitch_a
        0x63a504ee -> :sswitch_3
        0x65f9942c -> :sswitch_1
        0x71b56653 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
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
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

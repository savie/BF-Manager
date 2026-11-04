.class public final Ll/ܽ۫ۚ;
.super Ljava/lang/Object;
.source "077H"


# static fields
.field private static final ܿܳۙ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܽ۫ۚ;->ܿܳۙ:[S

    return-void

    :array_0
    .array-data 2
        0x168bs
        -0x70e9s
        -0x70f1s
        -0x70dds
        -0x70e2s
        -0x70e3s
        -0x70ees
        -0x70dds
        -0x70f4s
        -0x70e9s
        -0x70f1s
        -0x70b0s
        -0x70e6s
        -0x70e3s
        -0x70f8s
        -0x70e3s
        -0x70f0s
        -0x70c3s
        -0x70d4s
        -0x70c9s
        -0x70dds
        -0x70cds
        -0x70d4s
        -0x70c7s
        -0x70ces
        -0x70dds
        -0x70c2s
        -0x70d0s
        -0x70cds
        -0x70c1s
        -0x70c9s
        -0x70c7s
        -0x70c8s
        -0x70d8s
        -0x70ecs
        -0x70ebs
        -0x70f1s
        -0x70a4s
        -0x70c3s
        -0x70d4s
        -0x70c9s
        -0x70a4s
        -0x70f4s
        -0x70e3s
        -0x70e1s
        -0x70e9s
        -0x70e3s
        -0x70e5s
        -0x70e7s
        -0x70a4s
        -0x70ebs
        -0x70f1s
        -0x70a4s
        -0x70ees
        -0x70eds
        -0x70f8s
        -0x70a4s
        -0x70f1s
        -0x70f7s
        -0x70f4s
        -0x70f4s
        -0x70eds
        -0x70f2s
        -0x70f8s
        -0x70e7s
        -0x70e8s
        -0x70a4s
        -0x70e2s
        -0x70fbs
        -0x70a4s
        -0x70efs
        -0x70f8s
        -0x70dds
        -0x70e3s
        -0x70f4s
        -0x70e9s
        -0x70dds
        -0x70f5s
        -0x70eds
        -0x70f2s
        -0x70e9s
        -0x70f1s
        -0x70f4s
        -0x70e3s
        -0x70e1s
        -0x70e7s
        -0x70dds
        -0x70eds
        -0x70f4s
        -0x70e7s
        -0x70ees
        -0x70aes
    .end array-data
.end method

.method public static ۙ(Ljava/lang/String;)V
    .locals 6

    sget-object v0, Ll/ܽ۫ۚ;->ܿܳۙ:[S

    const/4 v1, 0x0

    sget v2, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v2, :cond_0

    goto/16 :goto_2

    :cond_0
    aget-short v0, v0, v1

    .line 24
    sget v1, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    add-int/lit16 v1, v0, 0x4999

    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v2, :cond_2

    goto/16 :goto_2

    :cond_2
    mul-int v1, v1, v1

    mul-int v0, v0, v0

    const v2, 0x15289d71

    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_3

    goto :goto_1

    :cond_3
    add-int/2addr v0, v2

    add-int/2addr v0, v0

    sub-int/2addr v1, v0

    if-gtz v1, :cond_4

    const v0, 0x8f7c

    goto :goto_0

    :cond_4
    const v0, 0xbe45

    .line 26
    :goto_0
    invoke-static {}, Ll/ۧᩴۚ;->ۙ()Ll/ۧᩴۚ;

    move-result-object v1

    sget-object v2, Ll/ܽ۫ۚ;->ܿܳۙ:[S

    const/4 v3, 0x1

    const/16 v4, 0xa

    .line 50
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_4

    .line 26
    :cond_5
    invoke-static {v2, v3, v4, v0}, Ll/ۗ᩶;->ܳܶۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۧᩴۚ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ܽ۫ۚ;->ܿܳۙ:[S

    .line 64
    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_6

    goto :goto_3

    :cond_6
    const/16 v3, 0xb

    const/4 v4, 0x1

    .line 26
    invoke-static {v2, v3, v4, v0}, Ll/ۗ֡;->ۘ᩺ۘ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_5

    .line 26
    :cond_7
    invoke-static {v1, v2}, Ll/ۖ᩵;->ܺۚ۟(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v1

    .line 27
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    return-void

    :cond_8
    sget-object p0, Ll/ܽ۫ۚ;->ܿܳۙ:[S

    const/16 v1, 0xc

    const/4 v2, 0x5

    invoke-static {p0, v1, v2, v0}, Ll/ۧ;->ۘۧۜ([SIII)Ljava/lang/String;

    move-result-object p0

    sget v1, Ll/ۧ;->ۨۗܰ:I

    if-ltz v1, :cond_9

    goto :goto_2

    .line 105
    :cond_9
    invoke-static {}, Ll/֫ۤ;->֨ۨᩳ()Lbin/mt/json/JSONArray;

    move-result-object v1

    sget-object v2, Ll/ܽ۫ۚ;->ܿܳۙ:[S

    const/16 v3, 0x11

    .line 52
    sget v4, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v4, :cond_d

    .line 54
    :goto_1
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget p0, Ll/ۖۙ;->ۤۧۤ:I

    if-gez p0, :cond_a

    goto :goto_4

    :cond_a
    :goto_2
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    sget p0, Ll/ۗ᩵;->ᩳܶۤ:I

    if-lez p0, :cond_b

    goto :goto_4

    .line 10
    :cond_b
    :goto_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget p0, Ll/֡᩻;->᩷ۧ᩺:I

    if-lez p0, :cond_c

    goto :goto_5

    .line 52
    :cond_c
    :goto_4
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    goto :goto_5

    :cond_d
    const/16 v4, 0x10

    .line 105
    invoke-static {v2, v3, v4, v0}, Ll/֡ۢ;->֡֨ۛ([SIII)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ll/ܽ۫ۚ;->ܿܳۙ:[S

    const/16 v4, 0x21

    .line 24
    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v5, :cond_e

    :goto_5
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    return-void

    :cond_e
    const/16 v5, 0x3b

    .line 105
    invoke-static {v3, v4, v5, v0}, Ll/ܽ;->᩷ܰۨ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 103
    invoke-static {v1, v2, v0, p0}, Ll/ۢܳۚ;->᩷(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    .line 28
    throw p0
.end method

.class public final Ll/۟֫ܺ;
.super Ljava/lang/Object;
.source "I5XA"


# static fields
.field public static ۙ:Z

.field public static ۤ:Z

.field public static ᩷:Z

.field private static final ᩷ۙܶ:[S

.field public static ᩸:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۟֫ܺ;->᩷ۙܶ:[S

    .line 15
    invoke-static {}, Ll/۟֫ܺ;->ۙ()V

    return-void

    nop

    :array_0
    .array-data 2
        0x2106s
        0x6e4ds
        0x6e4bs
        0x6e5ds
        0x6e4as
        0x6e16s
        0x6e54s
        0x6e59s
        0x6e56s
        0x6e5fs
        0x6e4ds
        0x6e59s
        0x6e5fs
        0x6e5ds
        0x6e5ds
        0x6e56s
        0x6e42s
        0x6e50s
        0x6e7bs
        0x6e76s
        0x6e4ds
        0x6e4bs
        0x6e5ds
        0x6e4as
        0x6e16s
        0x6e4as
        0x6e5ds
        0x6e5fs
        0x6e51s
        0x6e57s
        0x6e56s
        0x6e4ds
        0x6e4bs
        0x6e5ds
        0x6e4as
        0x6e16s
        0x6e5bs
        0x6e57s
        0x6e4ds
        0x6e56s
        0x6e4cs
        0x6e4as
        0x6e41s
    .end array-data
.end method

.method public static ۙ()V
    .locals 7

    sget-object v0, Ll/۟֫ܺ;->᩷ۙܶ:[S

    const/4 v1, 0x0

    aget-short v0, v0, v1

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v1, :cond_0

    goto :goto_1

    :cond_0
    mul-int v1, v0, v0

    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v2, :cond_1

    goto/16 :goto_3

    :cond_1
    const v2, 0xbaae0f1

    add-int/2addr v1, v2

    sget v2, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v2, :cond_2

    goto/16 :goto_3

    :cond_2
    add-int/2addr v1, v1

    add-int/lit16 v0, v0, 0x36a7

    mul-int v0, v0, v0

    sub-int/2addr v1, v0

    if-ltz v1, :cond_3

    const/16 v0, 0x6e38

    goto :goto_0

    :cond_3
    const v0, 0xf763

    :goto_0
    sget-object v1, Ll/۟֫ܺ;->᩷ۙܶ:[S

    const/4 v2, 0x1

    const/16 v3, 0xd

    invoke-static {v1, v2, v3, v0}, Ll/֫۠;->۟ܿۖ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 17
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v2

    if-gtz v2, :cond_4

    goto/16 :goto_3

    .line 0
    :cond_4
    sget-object v2, Ll/۟֫ܺ;->᩷ۙܶ:[S

    const/16 v3, 0xe

    .line 24
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v4

    if-gtz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const/4 v4, 0x2

    .line 0
    invoke-static {v2, v3, v4, v0}, Ll/ۗ֫;->᩸ᩴ᩶([SIII)Ljava/lang/String;

    move-result-object v2

    .line 20
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 33
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    .line 20
    :cond_6
    sget-object v2, Ll/۟֫ܺ;->᩷ۙܶ:[S

    const/16 v3, 0x10

    .line 29
    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_7

    :goto_1
    sget v0, Ll/֡ܳ;->֨ᩳۢ:I

    if-lez v0, :cond_b

    goto :goto_3

    :cond_7
    const/4 v4, 0x2

    .line 20
    invoke-static {v2, v3, v4, v0}, Ll/ۧ;->ۘۧۜ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ll/ۗܶ;->᩵֡ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_8

    goto :goto_4

    :cond_8
    sput-boolean v1, Ll/۟֫ܺ;->ۤ:Z

    sget-object v3, Ll/۟֫ܺ;->᩷ۙܶ:[S

    .line 38
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_2

    :cond_9
    const/16 v4, 0x12

    const/4 v5, 0x2

    .line 20
    invoke-static {v3, v4, v5, v0}, Ll/ۗ᩶;->ܳܶۢ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_10

    sget-object v1, Ll/۟֫ܺ;->᩷ۙܶ:[S

    const/16 v2, 0x14

    const/16 v6, 0xb

    invoke-static {v1, v2, v6, v0}, Ll/֨᩻;->ۧ᩹ܿ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 22
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    const/16 v0, 0x5f

    .line 25
    invoke-static {v1, v0}, Ll/ۧ;->᩹ۙۨ(Ljava/lang/Object;I)I

    move-result v0

    if-ltz v0, :cond_f

    .line 27
    invoke-static {v1, v5, v0}, Ll/֡ۖ;->ܳ᩶᩷(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_a
    sget-object v1, Ll/۟֫ܺ;->᩷ۙܶ:[S

    const/16 v2, 0x1f

    const/16 v5, 0xc

    sget v6, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v6, :cond_e

    .line 9
    :cond_b
    :goto_2
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_4

    .line 29
    :cond_c
    :goto_3
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_4

    :cond_d
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    .line 30
    :goto_4
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    return-void

    .line 27
    :cond_e
    invoke-static {v1, v2, v5, v0}, Ll/֨ܿ;->᩻ۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    .line 30
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 32
    :cond_f
    :goto_5
    sput-boolean v4, Ll/۟֫ܺ;->ۙ:Z

    .line 33
    invoke-static {v3, v1}, Ll/ۖۙ;->ᩴ۫ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Ll/۟֫ܺ;->᩸:Z

    sput-boolean v0, Ll/۟֫ܺ;->᩷:Z

    return-void

    .line 35
    :cond_10
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/ۗܶ;->᩵֡ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 37
    sput-boolean v4, Ll/۟֫ܺ;->ۤ:Z

    .line 38
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ۗܶ;->᩵֡ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Ll/۟֫ܺ;->᩸:Z

    .line 40
    :cond_11
    sput-boolean v5, Ll/۟֫ܺ;->ۙ:Z

    .line 41
    sput-boolean v5, Ll/۟֫ܺ;->᩷:Z

    return-void
.end method

.method public static ۤ()Z
    .locals 1

    .line 58
    sget-boolean v0, Ll/۟֫ܺ;->᩷:Z

    return v0
.end method

.method public static ᩴ()Z
    .locals 1

    .line 50
    sget-boolean v0, Ll/۟֫ܺ;->᩸:Z

    return v0
.end method

.method public static ᩷()Z
    .locals 1

    .line 54
    sget-boolean v0, Ll/۟֫ܺ;->ۙ:Z

    return v0
.end method

.method public static ᩸()Z
    .locals 1

    .line 46
    sget-boolean v0, Ll/۟֫ܺ;->ۤ:Z

    return v0
.end method

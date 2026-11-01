.class public final Ll/ۖܳ֨;
.super Ljava/lang/Object;
.source "077H"


# static fields
.field private static final ֫ۢ᩸:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۖܳ֨;->֫ۢ᩸:[S

    return-void

    :array_0
    .array-data 2
        0xca0s
        0x2a98s
        0x2a80s
        0x2aacs
        0x2a91s
        0x2a92s
        0x2a9ds
        0x2aacs
        0x2a83s
        0x2a98s
        0x2a80s
        0x2adfs
        0x2a95s
        0x2a92s
        0x2a87s
        0x2a92s
        0x2a9fs
        0x2ab2s
        0x2aa3s
        0x2ab8s
        0x2aacs
        0x2abcs
        0x2aa3s
        0x2ab6s
        0x2abds
        0x2aacs
        0x2ab1s
        0x2abfs
        0x2abcs
        0x2ab0s
        0x2ab8s
        0x2ab6s
        0x2ab7s
        0x2aa7s
        0x2a9bs
        0x2a9as
        0x2a80s
        0x2ad3s
        0x2ab2s
        0x2aa3s
        0x2ab8s
        0x2ad3s
        0x2a83s
        0x2a92s
        0x2a90s
        0x2a98s
        0x2a92s
        0x2a94s
        0x2a96s
        0x2ad3s
        0x2a9as
        0x2a80s
        0x2ad3s
        0x2a9ds
        0x2a9cs
        0x2a87s
        0x2ad3s
        0x2a80s
        0x2a86s
        0x2a83s
        0x2a83s
        0x2a9cs
        0x2a81s
        0x2a87s
        0x2a96s
        0x2a97s
        0x2ad3s
        0x2a91s
        0x2a8as
        0x2ad3s
        0x2a9es
        0x2a87s
        0x2aacs
        0x2a92s
        0x2a83s
        0x2a98s
        0x2aacs
        0x2a84s
        0x2a9cs
        0x2a81s
        0x2a98s
        0x2a80s
        0x2a83s
        0x2a92s
        0x2a90s
        0x2a96s
        0x2aacs
        0x2a9cs
        0x2a83s
        0x2a96s
        0x2a9ds
        0x2adds
    .end array-data
.end method

.method public static ۙ(Ljava/lang/String;)V
    .locals 6

    sget-object v0, Ll/ۖܳ֨;->֫ۢ᩸:[S

    const/4 v1, 0x0

    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v2, :cond_0

    goto/16 :goto_1

    :cond_0
    aget-short v0, v0, v1

    const v1, 0xc2b8

    sget v2, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v2, :cond_1

    goto/16 :goto_4

    :cond_1
    mul-int v1, v1, v0

    add-int/lit16 v0, v0, 0x30ae

    .line 77
    sget-boolean v2, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    mul-int v0, v0, v0

    sub-int/2addr v0, v1

    if-gez v0, :cond_3

    const/16 v0, 0x7f76

    goto :goto_0

    :cond_3
    const/16 v0, 0x2af3

    .line 26
    :goto_0
    invoke-static {}, Ll/ۖܿ֨;->ۙ()Ll/ۖܿ֨;

    move-result-object v1

    sget-object v2, Ll/ۖܳ֨;->֫ۢ᩸:[S

    const/4 v3, 0x1

    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    const/16 v4, 0xa

    sget-boolean v5, Ll/᩶;->ۚۤۘ:Z

    if-eqz v5, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {v2, v3, v4, v0}, Ll/ۗܳ;->ۡܿۘ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۖܿ֨;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ۖܳ֨;->֫ۢ᩸:[S

    .line 71
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_6

    goto :goto_2

    :cond_6
    const/16 v3, 0xb

    const/4 v4, 0x1

    .line 26
    invoke-static {v2, v3, v4, v0}, Ll/ۗᩳ;->ۖ᩶۫([SIII)Ljava/lang/String;

    move-result-object v2

    .line 59
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_7

    goto :goto_2

    .line 26
    :cond_7
    invoke-static {v1, v2}, Ll/֫;->ܳ᩻֨(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v1

    .line 27
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    return-void

    :cond_8
    sget-object p0, Ll/ۖܳ֨;->֫ۢ᩸:[S

    const/16 v1, 0xc

    const/4 v2, 0x5

    invoke-static {p0, v1, v2, v0}, Ll/ۖۗ;->᩺᩻ܰ([SIII)Ljava/lang/String;

    move-result-object p0

    .line 16
    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v1, :cond_9

    goto :goto_3

    .line 98
    :cond_9
    invoke-static {}, Ll/֫ۛ;->᩹ۜۨ()Lbin/mt/json/JSONArray;

    move-result-object v1

    sget-object v2, Ll/ۖܳ֨;->֫ۢ᩸:[S

    const/16 v3, 0x11

    sget-boolean v4, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v4, :cond_a

    .line 2
    :goto_1
    sget p0, Ll/ۖۧ;->ܺۚۖ:I

    if-lez p0, :cond_b

    goto :goto_4

    :cond_a
    const/16 v4, 0x10

    .line 98
    invoke-static {v2, v3, v4, v0}, Ll/֫ᩳ;->᩵ۡ᩻([SIII)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ll/ۖܳ֨;->֫ۢ᩸:[S

    const/16 v4, 0x21

    .line 49
    sget v5, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v5, :cond_e

    :cond_b
    :goto_2
    sget-boolean p0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez p0, :cond_c

    goto :goto_4

    .line 47
    :cond_c
    sget-boolean p0, Ll/֨᩸;->ۚۢۧ:Z

    if-nez p0, :cond_d

    goto :goto_4

    :cond_d
    :goto_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    :goto_4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    return-void

    :cond_e
    const/16 v5, 0x3b

    .line 98
    invoke-static {v3, v4, v5, v0}, Ll/֨۟;->ᩴۚۤ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 96
    invoke-static {v1, v2, v0, p0}, Ll/۫᩻֨;->ܰ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/۫᩻֨;

    move-result-object p0

    .line 28
    throw p0
.end method

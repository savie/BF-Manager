.class public final Ll/۠֫ܺ;
.super Ljava/lang/Object;
.source "35B7"


# direct methods
.method public static ۙ(J)Ljava/lang/String;
    .locals 3

    const-wide/16 v0, 0x400

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, "B"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-wide/32 v0, 0x100000

    cmp-long v2, p0, v0

    if-gez v2, :cond_1

    long-to-double p0, p0

    const-wide/high16 v0, 0x4090000000000000L    # 1024.0

    div-double/2addr p0, v0

    const-string v0, "K"

    .line 73
    invoke-static {v0, p0, p1}, Ll/۠֫ܺ;->ۙ(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-wide/32 v0, 0x40000000

    cmp-long v2, p0, v0

    if-gez v2, :cond_2

    long-to-double p0, p0

    const-wide/high16 v0, 0x4130000000000000L    # 1048576.0

    div-double/2addr p0, v0

    const-string v0, "M"

    .line 75
    invoke-static {v0, p0, p1}, Ll/۠֫ܺ;->ۙ(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-wide v0, 0x10000000000L

    cmp-long v2, p0, v0

    if-gez v2, :cond_3

    long-to-double p0, p0

    const-wide/high16 v0, 0x41d0000000000000L    # 1.073741824E9

    div-double/2addr p0, v0

    const-string v0, "G"

    .line 77
    invoke-static {v0, p0, p1}, Ll/۠֫ܺ;->ۙ(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    long-to-double p0, p0

    const-wide/high16 v0, 0x4270000000000000L    # 1.099511627776E12

    div-double/2addr p0, v0

    const-string v0, "T"

    .line 79
    invoke-static {v0, p0, p1}, Ll/۠֫ܺ;->ۙ(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;D)Ljava/lang/String;
    .locals 5

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    mul-double p1, p1, v0

    .line 100
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    neg-long p1, p1

    :cond_1
    const-wide/16 v1, 0x64

    .line 109
    div-long v3, p1, v1

    .line 110
    rem-long/2addr p1, v1

    .line 113
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x7

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    if-eqz v0, :cond_2

    const/16 v0, 0x2d

    .line 115
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    :cond_2
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x2e

    .line 118
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-wide/16 v2, 0xa

    cmp-long v0, p1, v2

    if-gez v0, :cond_3

    const/16 v0, 0x30

    .line 120
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 0
    :cond_3
    invoke-static {v1, p1, p2, p0}, Ll/ۖܶ᩸;->ۙ(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-ge p0, v1, :cond_0

    return v0

    :cond_0
    const/4 v2, 0x1

    if-ne p0, v1, :cond_1

    return v2

    :cond_1
    and-int/lit16 v1, p0, 0xff

    if-eqz v1, :cond_4

    const/16 v3, 0xff

    if-ne v1, v3, :cond_2

    goto :goto_0

    :cond_2
    const v1, 0xff00

    and-int/2addr p0, v1

    if-nez p0, :cond_3

    return v2

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v2
.end method

.method public static ᩷(J)Ljava/lang/String;
    .locals 3

    const-wide/16 v0, 0x400

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " B"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-wide/32 v0, 0x100000

    cmp-long v2, p0, v0

    if-gez v2, :cond_1

    long-to-double p0, p0

    const-wide/high16 v0, 0x4090000000000000L    # 1024.0

    div-double/2addr p0, v0

    const-string v0, " KB"

    .line 88
    invoke-static {v0, p0, p1}, Ll/۠֫ܺ;->ۙ(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-wide/32 v0, 0x40000000

    cmp-long v2, p0, v0

    if-gez v2, :cond_2

    long-to-double p0, p0

    const-wide/high16 v0, 0x4130000000000000L    # 1048576.0

    div-double/2addr p0, v0

    const-string v0, " MB"

    .line 90
    invoke-static {v0, p0, p1}, Ll/۠֫ܺ;->ۙ(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-wide v0, 0x10000000000L

    cmp-long v2, p0, v0

    if-gez v2, :cond_3

    long-to-double p0, p0

    const-wide/high16 v0, 0x41d0000000000000L    # 1.073741824E9

    div-double/2addr p0, v0

    const-string v0, " GB"

    .line 92
    invoke-static {v0, p0, p1}, Ll/۠֫ܺ;->ۙ(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    long-to-double p0, p0

    const-wide/high16 v0, 0x4270000000000000L    # 1.099511627776E12

    div-double/2addr p0, v0

    const-string v0, " TB"

    .line 94
    invoke-static {v0, p0, p1}, Ll/۠֫ܺ;->ۙ(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

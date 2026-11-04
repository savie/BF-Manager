.class public Ll/ۛۗܺ;
.super Ljava/lang/Object;
.source "DAJ8"


# direct methods
.method public static ۙ(Ll/ܳ֨ܺ;IJ)V
    .locals 2

    .line 93
    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x40

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x7

    shr-int/lit8 v0, v0, 0x3

    mul-int/lit8 v1, v0, 0x8

    rsub-int/lit8 v1, v1, 0x40

    shr-long/2addr p2, v1

    add-int/lit8 v1, v0, -0x1

    shl-int/lit8 v1, v1, 0x5

    or-int/2addr p1, v1

    .line 108
    invoke-virtual {p0, p1}, Ll/ܳ֨ܺ;->᩸(I)V

    :goto_0
    if-lez v0, :cond_1

    long-to-int p1, p2

    int-to-byte p1, p1

    .line 112
    invoke-virtual {p0, p1}, Ll/ܳ֨ܺ;->᩸(I)V

    const/16 p1, 0x8

    shr-long/2addr p2, p1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ᩷(Ll/ܳ֨ܺ;IJ)V
    .locals 2

    .line 66
    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x40

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x7

    shr-int/lit8 v0, v0, 0x3

    add-int/lit8 v1, v0, -0x1

    shl-int/lit8 v1, v1, 0x5

    or-int/2addr p1, v1

    .line 78
    invoke-virtual {p0, p1}, Ll/ܳ֨ܺ;->᩸(I)V

    :goto_0
    if-lez v0, :cond_1

    long-to-int p1, p2

    int-to-byte p1, p1

    .line 82
    invoke-virtual {p0, p1}, Ll/ܳ֨ܺ;->᩸(I)V

    const/16 p1, 0x8

    shr-long/2addr p2, p1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public ۙ(ILjava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۙ(ILl/ܽۙܶ;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۙ(ILl/ܽۙܶ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۙ(Ll/ܽۙܶ;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۤ(ILl/ܽۙܶ;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ᩷(ILl/ܽۙܶ;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ᩷(Ll/ܽۙܶ;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

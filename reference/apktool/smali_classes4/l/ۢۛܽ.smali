.class public final Ll/ۢۛܽ;
.super Ll/ۤܰܽ;
.source "26GL"


# virtual methods
.method public final ۙ([J)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    .line 278
    aget-wide v0, p1, v0

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_1

    const/4 v0, 0x1

    aget-wide v0, p1, v0

    long-to-int p1, v0

    int-to-long v3, p1

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    invoke-static {v2, p1}, Ll/ۙ᩸ۗ;->of(II)Ll/ۙ᩸ۗ;

    move-result-object p1

    return-object p1

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ۙ(Ljava/lang/Object;)[J
    .locals 5

    .line 275
    check-cast p1, Ll/ۙ᩸ۗ;

    .line 283
    invoke-virtual {p1}, Ll/ۙ᩸ۗ;->getYear()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1}, Ll/ۙ᩸ۗ;->getMonthValue()I

    move-result p1

    int-to-long v2, p1

    const/4 p1, 0x2

    new-array p1, p1, [J

    const/4 v4, 0x0

    aput-wide v0, p1, v4

    const/4 v0, 0x1

    aput-wide v2, p1, v0

    return-object p1
.end method

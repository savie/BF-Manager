.class public final Ll/ᩳۛܽ;
.super Ll/ۤܰܽ;
.source "26GL"


# virtual methods
.method public final ۙ([J)Ljava/lang/Object;
    .locals 5

    const/4 v0, 0x0

    .line 265
    aget-wide v0, p1, v0

    long-to-int p1, v0

    int-to-long v2, p1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-static {p1}, Ll/۬ۤۗ;->of(I)Ll/۬ۤۗ;

    move-result-object p1

    return-object p1

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ۙ(Ljava/lang/Object;)[J
    .locals 3

    .line 262
    check-cast p1, Ll/۬ۤۗ;

    .line 270
    invoke-virtual {p1}, Ll/۬ۤۗ;->getValue()I

    move-result p1

    int-to-long v0, p1

    const/4 p1, 0x1

    new-array p1, p1, [J

    const/4 v2, 0x0

    aput-wide v0, p1, v2

    return-object p1
.end method

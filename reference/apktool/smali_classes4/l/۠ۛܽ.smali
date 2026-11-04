.class public final Ll/۠ۛܽ;
.super Ll/ۤܰܽ;
.source "26GL"


# virtual methods
.method public final ۙ([J)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    .line 55
    aget-wide v0, p1, v0

    const/4 v2, 0x1

    aget-wide v2, p1, v2

    invoke-static {v0, v1, v2, v3}, Ll/ܿۤۗ;->ofSeconds(JJ)Ll/ܿۤۗ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ljava/lang/Object;)[J
    .locals 5

    .line 52
    check-cast p1, Ll/ܿۤۗ;

    .line 61
    invoke-virtual {p1}, Ll/ܿۤۗ;->getSeconds()J

    move-result-wide v0

    invoke-virtual {p1}, Ll/ܿۤۗ;->getNano()I

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

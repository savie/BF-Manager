.class public Ll/ۜۤۗ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static convert(Ljava/time/Duration;)Ll/ܿۤۗ;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 185
    :cond_0
    invoke-virtual {p0}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v0

    invoke-virtual {p0}, Ljava/time/Duration;->getNano()I

    move-result p0

    int-to-long v2, p0

    invoke-static {v0, v1, v2, v3}, Ll/ܿۤۗ;->ofSeconds(JJ)Ll/ܿۤۗ;

    move-result-object p0

    return-object p0
.end method

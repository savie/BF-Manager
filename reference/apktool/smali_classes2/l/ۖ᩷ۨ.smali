.class public final Ll/ۖ᩷ۨ;
.super Ljava/lang/Object;
.source "B964"


# static fields
.field public static final ۙ:Ll/ۜ᩷ۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 264
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "CLOSED"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۖ᩷ۨ;->ۙ:Ll/ۜ᩷ۨ;

    return-void
.end method

.method public static final ۙ(Ll/ۤۙۨ;JLl/᩺֨᩵;)Ljava/lang/Object;
    .locals 4

    .line 22
    :cond_0
    :goto_0
    iget-wide v0, p0, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v2, v0, p1

    if-ltz v2, :cond_2

    invoke-virtual {p0}, Ll/ۡ᩷ۨ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    return-object p0

    .line 266
    :cond_2
    :goto_1
    invoke-static {p0}, Ll/۫᩷ۨ;->ۙ(Ll/۫᩷ۨ;)Ljava/lang/Object;

    move-result-object v2

    .line 267
    sget-object v3, Ll/ۖ᩷ۨ;->ۙ:Ll/ۜ᩷ۨ;

    if-ne v2, v3, :cond_3

    return-object v3

    .line 270
    :cond_3
    check-cast v2, Ll/۫᩷ۨ;

    .line 23
    check-cast v2, Ll/ۡ᩷ۨ;

    if-eqz v2, :cond_4

    move-object p0, v2

    goto :goto_0

    :cond_4
    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    .line 28
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p3, v0, p0}, Ll/᩺֨᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡ᩷ۨ;

    .line 29
    invoke-virtual {p0, v0}, Ll/۫᩷ۨ;->ۙ(Ll/ۡ᩷ۨ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 30
    invoke-virtual {p0}, Ll/ۡ᩷ۨ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Ll/۫᩷ۨ;->۫()V

    :cond_5
    move-object p0, v0

    goto :goto_0
.end method

.method public static final synthetic ۙ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/ۖ᩷ۨ;->ۙ:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final ۙ(Ljava/lang/Object;)Ll/ۡ᩷ۨ;
    .locals 1

    .line 259
    invoke-static {}, Ll/ۖ᩷ۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v0

    if-eq p0, v0, :cond_0

    check-cast p0, Ll/ۡ᩷ۨ;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Does not contain segment"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۙ(Ll/۫᩷ۨ;)Ll/۫᩷ۨ;
    .locals 2

    .line 273
    :cond_0
    :goto_0
    invoke-static {p0}, Ll/۫᩷ۨ;->ۙ(Ll/۫᩷ۨ;)Ljava/lang/Object;

    move-result-object v0

    .line 274
    sget-object v1, Ll/ۖ᩷ۨ;->ۙ:Ll/ۜ᩷ۨ;

    if-ne v0, v1, :cond_1

    goto :goto_1

    .line 277
    :cond_1
    check-cast v0, Ll/۫᩷ۨ;

    if-nez v0, :cond_2

    .line 83
    invoke-virtual {p0}, Ll/۫᩷ۨ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    return-object p0

    :cond_2
    move-object p0, v0

    goto :goto_0
.end method

.method public static final ᩷(Ljava/lang/Object;)Z
    .locals 1

    .line 257
    invoke-static {}, Ll/ۖ᩷ۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v0

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

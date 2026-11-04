.class public final Ll/۬ۜ᩵;
.super Ljava/lang/Object;


# direct methods
.method public static ۙ(Ll/ۡۜ᩵;Ll/᩷۬᩵;I)Ll/ۧۜ᩵;
    .locals 9

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 363
    :goto_1
    instance-of p2, p0, Ll/ܳ۬᩵;

    if-eqz p2, :cond_2

    check-cast p0, Ll/ܳ۬᩵;

    invoke-virtual {p0, v0, v1, p1}, Ll/ܳ۬᩵;->ۙ(ZZLl/۟ۜ᩵;)Ll/ۧۜ᩵;

    move-result-object p0

    return-object p0

    .line 364
    :cond_2
    new-instance p2, Ll/ۙ۬᩵;

    const-string v7, "invoke(Ljava/lang/Throwable;)V"

    const/4 v8, 0x0

    const/4 v3, 0x1

    .line 29
    const-class v5, Ll/۟ۜ᩵;

    const-string v6, "invoke"

    move-object v2, p2

    move-object v4, p1

    invoke-direct/range {v2 .. v8}, Ll/ᩴۡ᩵;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 364
    invoke-interface {p0, v0, v1, p2}, Ll/ۡۜ᩵;->ۙ(ZZLl/ۗ֨᩵;)Ll/ۧۜ᩵;

    move-result-object p0

    return-object p0
.end method

.method public static final ۙ(Ll/ۧۢ᩵;)V
    .locals 1

    .line 594
    sget-object v0, Ll/ۡۜ᩵;->ۛ:Ll/֨ۜ᩵;

    sget-object v0, Ll/֨ۜ᩵;->ܰ:Ll/֨ۜ᩵;

    invoke-interface {p0, v0}, Ll/ۧۢ᩵;->ۙ(Ll/֫ۢ᩵;)Ll/ۚۢ᩵;

    move-result-object p0

    check-cast p0, Ll/ۡۜ᩵;

    if-eqz p0, :cond_1

    .line 576
    invoke-interface {p0}, Ll/ۡۜ᩵;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ll/ۡۜ᩵;->ܳ()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static final ۙ(Ll/ۧۢ᩵;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    .line 554
    sget-object v0, Ll/ۡۜ᩵;->ۛ:Ll/֨ۜ᩵;

    sget-object v0, Ll/֨ۜ᩵;->ܰ:Ll/֨ۜ᩵;

    invoke-interface {p0, v0}, Ll/ۧۢ᩵;->ۙ(Ll/֫ۢ᩵;)Ll/ۚۢ᩵;

    move-result-object p0

    check-cast p0, Ll/ۡۜ᩵;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Ll/ۡۜ᩵;->ۙ(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

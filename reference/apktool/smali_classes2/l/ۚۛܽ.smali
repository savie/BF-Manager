.class public final Ll/ۚۛܽ;
.super Ljava/lang/Object;
.source "U87V"


# direct methods
.method public static ۙ(Ljava/lang/Class;Ljava/util/List;)Ll/ۤۨܽ;
    .locals 1

    .line 66
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸ۨܽ;

    .line 67
    invoke-interface {p1}, Ll/᩸ۨܽ;->check()Ll/ۤۨܽ;

    move-result-object p1

    .line 68
    sget-object v0, Ll/ۤۨܽ;->۟:Ll/ۤۨܽ;

    if-eq p1, v0, :cond_0

    return-object p1

    .line 72
    :cond_1
    sget-object p0, Ll/ۤۨܽ;->᩶:Ll/ۤۨܽ;

    return-object p0
.end method

.method public static ۙ(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z
    .locals 1

    .line 78
    sget-object v0, Ll/۫ۛܽ;->ۙ:Ll/۫ۛܽ;

    invoke-virtual {v0, p0, p1}, Ll/۫ۛܽ;->ۙ(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z

    move-result p0

    return p0
.end method

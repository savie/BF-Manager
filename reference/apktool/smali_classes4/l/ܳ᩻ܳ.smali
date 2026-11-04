.class public final Ll/ܳ᩻ܳ;
.super Ljava/lang/Object;
.source "F6KC"


# direct methods
.method public static ۙ(Z)I
    .locals 2

    .line 15
    sget-object v0, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    if-eqz p0, :cond_0

    const-string p0, "mpom"

    goto :goto_0

    :cond_0
    const-string p0, "hpom"

    :goto_0
    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ltz p0, :cond_1

    const/4 v0, 0x2

    if-gt p0, v0, :cond_1

    return p0

    :cond_1
    return v1
.end method

.method public static ۙ(IZ)V
    .locals 1

    if-ltz p0, :cond_1

    const/4 v0, 0x2

    if-gt p0, v0, :cond_1

    .line 21
    sget-object v0, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    invoke-interface {v0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v0

    if-eqz p1, :cond_0

    const-string p1, "mpom"

    goto :goto_0

    :cond_0
    const-string p1, "hpom"

    :goto_0
    invoke-interface {v0, p0, p1}, Ll/ᩳ֫ܺ;->ۙ(ILjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩳ֫ܺ;->apply()V

    return-void

    .line 20
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid preview open mode"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

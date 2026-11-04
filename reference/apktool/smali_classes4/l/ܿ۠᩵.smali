.class public final Ll/ܿ۠᩵;
.super Ljava/lang/Object;
.source "ZB07"


# direct methods
.method public static final ۙ(Ll/ۙۢ᩵;Ll/ۧۢ᩵;)Ll/᩵۬᩵;
    .locals 2

    .line 121
    instance-of v0, p0, Ll/᩺ۢ᩵;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    .line 134
    :cond_0
    sget-object v0, Ll/ۨ۬᩵;->ܰ:Ll/ۨ۬᩵;

    invoke-interface {p1, v0}, Ll/ۧۢ᩵;->ۙ(Ll/֫ۢ᩵;)Ll/ۚۢ᩵;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 136
    check-cast p0, Ll/᩺ۢ᩵;

    .line 144
    :cond_1
    instance-of p1, p0, Ll/ܳۜ᩵;

    if-eqz p1, :cond_2

    goto :goto_0

    .line 145
    :cond_2
    invoke-interface {p0}, Ll/᩺ۢ᩵;->᩷()Ll/᩺ۢ᩵;

    move-result-object p0

    if-nez p0, :cond_3

    :goto_0
    move-object p0, v1

    goto :goto_1

    .line 147
    :cond_3
    instance-of p1, p0, Ll/᩵۬᩵;

    if-eqz p1, :cond_1

    check-cast p0, Ll/᩵۬᩵;

    :goto_1
    if-nez p0, :cond_4

    return-object p0

    .line 137
    :cond_4
    invoke-virtual {p0}, Ll/᩵۬᩵;->᩹()V

    throw v1

    :cond_5
    :goto_2
    return-object v1
.end method

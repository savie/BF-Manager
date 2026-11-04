.class public final synthetic Ll/ۨ۠ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Ll/֨֨;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Lbin/mt/plus/Main;

    .line 195
    invoke-virtual {p1}, Lbin/mt/plus/Main;->᩷ۙ()V

    .line 196
    invoke-virtual {p1}, Lbin/mt/plus/Main;->ۧۙ()Ll/ᩴ᩶ܳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 199
    invoke-virtual {v0}, Ll/ᩴ᩶ܳ;->ۚ()Ll/۠ۨܳ;

    move-result-object v0

    .line 198
    invoke-static {p1, v0}, Ll/ۡۢ۫;->ۙ(Lbin/mt/plus/Main;Ll/۠ۨܳ;)V

    :cond_0
    return-void
.end method

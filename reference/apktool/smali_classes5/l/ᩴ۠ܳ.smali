.class public final synthetic Ll/ᩴ۠ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Ll/֨֨;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Lbin/mt/plus/Main;

    .line 126
    invoke-virtual {p1}, Lbin/mt/plus/Main;->᩷ۙ()V

    .line 127
    invoke-virtual {p1}, Lbin/mt/plus/Main;->ۧۙ()Ll/ᩴ᩶ܳ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 129
    invoke-virtual {p1}, Ll/ᩴ᩶ܳ;->ۚ()Ll/۠ۨܳ;

    move-result-object p1

    new-instance v0, Ll/ܿ۟ۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v0}, Ll/۠ۨܳ;->ۙ(Ll/۬᩵ܳ;)V

    :cond_0
    return-void
.end method

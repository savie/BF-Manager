.class public final synthetic Ll/᩺ᩳ۫;
.super Ljava/lang/Object;
.source "VA36"

# interfaces
.implements Ll/ܽܳۨ;


# virtual methods
.method public final ۙ(Ll/ۙۚۨ;)Ll/ۡܳۨ;
    .locals 2

    .line 2
    sget v0, Ll/ܰᩳ۫;->۠:I

    .line 112
    invoke-virtual {p1}, Ll/ۙۚۨ;->۫()Ll/۟ܳۨ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۙۚۨ;->ۙ(Ll/۟ܳۨ;)Ll/ۡܳۨ;

    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ll/ۡܳۨ;->ۚ()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 116
    :cond_0
    new-instance v0, Ll/֨ܳۨ;

    invoke-direct {v0}, Ll/֨ܳۨ;-><init>()V

    .line 117
    invoke-virtual {p1}, Ll/ۙۚۨ;->۫()Ll/۟ܳۨ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/֨ܳۨ;->ۙ(Ll/۟ܳۨ;)V

    sget-object p1, Ll/ۘܳۨ;->۟:Ll/ۘܳۨ;

    .line 118
    invoke-virtual {v0, p1}, Ll/֨ܳۨ;->ۙ(Ll/ۘܳۨ;)V

    const/16 p1, 0x193

    .line 119
    invoke-virtual {v0, p1}, Ll/֨ܳۨ;->ۙ(I)V

    const-string p1, ""

    .line 120
    invoke-virtual {v0, p1}, Ll/֨ܳۨ;->᩷(Ljava/lang/String;)V

    .line 121
    invoke-static {}, Ll/۠ܳۨ;->ܽ()Ll/۠ܳۨ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/֨ܳۨ;->ۙ(Ll/۠ܳۨ;)V

    .line 122
    invoke-virtual {v0}, Ll/֨ܳۨ;->ۙ()Ll/ۡܳۨ;

    move-result-object p1

    return-object p1
.end method

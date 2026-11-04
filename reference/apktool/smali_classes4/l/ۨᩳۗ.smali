.class public abstract Ll/ۨᩳۗ;
.super Ll/ۚᩳۗ;
.source "IISF"

# interfaces
.implements Ll/᩵ۡۗ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ll/ܺ۟ۗ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 50
    sget-object v0, Ll/ܽۘۗ;->᩶:Ll/ܽۘۗ;

    invoke-static {p0, v0, p1}, Ll/ᩴᩳۗ;->ۙ(Ll/ۛ۟ۗ;Ll/ܽۘۗ;Ljava/lang/String;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, ": "

    .line 0
    invoke-static {p1, v0}, Ll/ۗۚ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 41
    invoke-static {p2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    sget-object p2, Ll/ܽۘۗ;->ۢ:Ll/ܽۘۗ;

    invoke-static {p0, p2, p1}, Ll/ᩴᩳۗ;->ۙ(Ll/ۛ۟ۗ;Ll/ܽۘۗ;Ljava/lang/String;)V

    return-void
.end method

.method public final ۙ(Ll/ܽۘۗ;)Z
    .locals 1

    .line 15
    invoke-interface {p0}, Ll/᩺ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۘۗ;->۫()Ll/ܽۘۗ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܽۘۗ;->ۙ(Ll/ܽۘۗ;)Z

    move-result p1

    return p1
.end method

.method public final ۤ(Ljava/lang/String;)V
    .locals 1

    .line 23
    move-object v0, p0

    check-cast v0, Ll/ۖۡۗ;

    invoke-static {v0, p1}, Ll/᩺֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/lang/String;)V

    .line 24
    sget-object v0, Ll/ܽۘۗ;->ۢ:Ll/ܽۘۗ;

    invoke-static {p0, v0, p1}, Ll/ᩴᩳۗ;->ۙ(Ll/ۛ۟ۗ;Ll/ܽۘۗ;Ljava/lang/String;)V

    .line 25
    sget-object p1, Ll/֫۟ۗ;->ۘۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, p1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    return-void
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 1

    .line 46
    sget-object v0, Ll/ܽۘۗ;->֡:Ll/ܽۘۗ;

    invoke-static {p0, v0, p1}, Ll/ᩴᩳۗ;->ۙ(Ll/ۛ۟ۗ;Ll/ܽۘۗ;Ljava/lang/String;)V

    return-void
.end method

.method public final ᩸(Ljava/lang/String;)V
    .locals 1

    .line 37
    sget-object v0, Ll/ܽۘۗ;->ۢ:Ll/ܽۘۗ;

    invoke-static {p0, v0, p1}, Ll/ᩴᩳۗ;->ۙ(Ll/ۛ۟ۗ;Ll/ܽۘۗ;Ljava/lang/String;)V

    return-void
.end method

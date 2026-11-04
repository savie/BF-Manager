.class public final synthetic Ll/ۘۚ᩵;
.super Ljava/lang/Object;
.source "Z6H9"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ljava/lang/String;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۚ᩵;->ܰ:Ljava/lang/String;

    iput-object p2, p0, Ll/ۘۚ᩵;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 2
    check-cast p1, Ll/ۚܿۗ;

    .line 205
    invoke-interface {p1}, Ll/ۚܿۗ;->name()Ljava/lang/String;

    move-result-object v0

    .line 206
    iget-object v1, p0, Ll/ۘۚ᩵;->ܰ:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 209
    invoke-interface {p1}, Ll/ۚܿۗ;->ۙ()Ljava/lang/String;

    move-result-object v1

    .line 210
    iget-object v2, p0, Ll/ۘۚ᩵;->᩶:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 213
    invoke-interface {p1}, Ll/ۚܿۗ;->values()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    return-void

    .line 215
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Plugin option values is null, option: "

    const-string v3, ", plugin: "

    .line 0
    invoke-static {v1, v0, v3, v2}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 215
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 211
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Plugin option description not set, plugin: "

    .line 0
    invoke-static {v0, v2}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 211
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 207
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Plugin option name should start with plugin id: \'"

    const-string v3, "\', option: "

    .line 0
    invoke-static {v2, v1, v3, v0}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 207
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

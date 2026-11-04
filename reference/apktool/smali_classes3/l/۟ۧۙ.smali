.class public final Ll/۟ۧۙ;
.super Ljava/lang/Object;
.source "J6G6"


# direct methods
.method public static final ۙ(Ll/ܳۢ᩷;Ll/۠ۧۙ;Ljava/lang/String;Landroid/os/Bundle;)Ll/ۡ᩻ۙ;
    .locals 4

    const-string v0, "registry"

    .line 5
    invoke-static {p0, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    .line 10
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0, p2}, Ll/ܳۢ᩷;->ۙ(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p3, v0

    :goto_0
    if-nez p3, :cond_1

    .line 209
    new-instance p3, Ll/ۢ᩻ۙ;

    invoke-direct {p3}, Ll/ۢ᩻ۙ;-><init>()V

    goto :goto_2

    .line 215
    :cond_1
    const-class v0, Ll/ۢ᩻ۙ;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 804
    invoke-virtual {p3}, Landroid/os/BaseBundle;->size()I

    move-result v0

    .line 51
    new-instance v1, Ll/ܰᩳ᩵;

    invoke-direct {v1, v0}, Ll/ܰᩳ᩵;-><init>(I)V

    .line 805
    invoke-virtual {p3}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 806
    invoke-static {v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {p3, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ll/ܰᩳ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 57
    :cond_2
    invoke-virtual {v1}, Ll/ܰᩳ᩵;->ۙ()Ll/ܰᩳ᩵;

    move-result-object p3

    .line 217
    new-instance v0, Ll/ۢ᩻ۙ;

    invoke-direct {v0, p3}, Ll/ۢ᩻ۙ;-><init>(Ll/ܰᩳ᩵;)V

    move-object p3, v0

    .line 35
    :goto_2
    new-instance v0, Ll/ۡ᩻ۙ;

    invoke-direct {v0, p2, p3}, Ll/ۡ᩻ۙ;-><init>(Ljava/lang/String;Ll/ۢ᩻ۙ;)V

    .line 36
    invoke-virtual {v0, p1, p0}, Ll/ۡ᩻ۙ;->ۙ(Ll/۠ۧۙ;Ll/ܳۢ᩷;)V

    .line 37
    invoke-static {p1, p0}, Ll/۟ۧۙ;->ۙ(Ll/۠ۧۙ;Ll/ܳۢ᩷;)V

    return-object v0
.end method

.method public static ۙ(Ll/۠ۧۙ;Ll/ܳۢ᩷;)V
    .locals 2

    .line 56
    invoke-virtual {p0}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v0

    .line 58
    sget-object v1, Ll/ۖۧۙ;->۟:Ll/ۖۧۙ;

    if-eq v0, v1, :cond_1

    .line 59
    sget-object v1, Ll/ۖۧۙ;->ۢ:Ll/ۖۧۙ;

    invoke-virtual {v0, v1}, Ll/ۖۧۙ;->ۙ(Ll/ۖۧۙ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    new-instance v0, Ll/֡ۧۙ;

    invoke-direct {v0, p0, p1}, Ll/֡ۧۙ;-><init>(Ll/۠ۧۙ;Ll/ܳۢ᩷;)V

    .line 63
    invoke-virtual {p0, v0}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    return-void

    .line 61
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll/ܳۢ᩷;->᩷()V

    return-void
.end method

.method public static final ۙ(Ll/۫ܺۙ;Ll/ܳۢ᩷;Ll/۠ۧۙ;)V
    .locals 1

    const-string v0, "registry"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    .line 10
    invoke-static {p2, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0}, Ll/۫ܺۙ;->᩷()Ljava/lang/AutoCloseable;

    move-result-object p0

    check-cast p0, Ll/ۡ᩻ۙ;

    if-eqz p0, :cond_0

    .line 49
    invoke-virtual {p0}, Ll/ۡ᩻ۙ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    .line 50
    invoke-virtual {p0, p2, p1}, Ll/ۡ᩻ۙ;->ۙ(Ll/۠ۧۙ;Ll/ܳۢ᩷;)V

    .line 51
    invoke-static {p2, p1}, Ll/۟ۧۙ;->ۙ(Ll/۠ۧۙ;Ll/ܳۢ᩷;)V

    :cond_0
    return-void
.end method

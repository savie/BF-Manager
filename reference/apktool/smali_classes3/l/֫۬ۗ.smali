.class public final synthetic Ll/֫۬ۗ;
.super Ljava/lang/Object;
.source "66DS"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ll/ܺ֨ۗ;

    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p1, Ll/ۛ֨ۗ;

    if-eqz v0, :cond_0

    .line 146
    check-cast p1, Ll/ۛ֨ۗ;

    .line 147
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 149
    invoke-virtual {v0, p1}, Ll/ܿ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)V

    .line 150
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ۗۙ()V

    :cond_0
    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

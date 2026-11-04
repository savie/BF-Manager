.class public final synthetic Ll/ۛ۬ۗ;
.super Ljava/lang/Object;
.source "Z6E3"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ll/ܺ֨ۗ;

    .line 541
    sget-object v0, Ll/֫۟ۗ;->ۤۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 0
    instance-of v0, p1, Ll/ۛ֨ۗ;

    if-eqz v0, :cond_0

    .line 543
    check-cast p1, Ll/ۛ֨ۗ;

    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۧ֨ۗ;->ۧ()V

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

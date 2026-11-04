.class public final synthetic Ll/ۧ᩷᩵;
.super Ljava/lang/Object;
.source "B6EY"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/᩷ۡۗ;

    .line 136
    invoke-static {p1}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v0

    .line 137
    instance-of v1, v0, Ll/ۡۢۗ;

    if-eqz v1, :cond_0

    .line 138
    check-cast v0, Ll/ۡۢۗ;

    invoke-virtual {v0, p1}, Ll/ۡۢۗ;->ۙ(Ll/᩷ۡۗ;)V

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

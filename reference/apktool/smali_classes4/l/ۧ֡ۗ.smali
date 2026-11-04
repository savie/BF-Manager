.class public final synthetic Ll/ۧ֡ۗ;
.super Ljava/lang/Object;
.source "T6HJ"

# interfaces
.implements Ljava/util/function/ToIntFunction;


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 1

    .line 2
    check-cast p1, Ll/ۨᩳۗ;

    .line 303
    invoke-interface {p1}, Ll/ۧܰۗ;->ۘ()Ll/֫ܰۗ;

    move-result-object p1

    sget-object v0, Ll/֫ܰۗ;->᩶:Ll/֫ܰۗ;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

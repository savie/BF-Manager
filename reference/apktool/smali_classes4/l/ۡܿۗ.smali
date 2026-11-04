.class public final synthetic Ll/ۡܿۗ;
.super Ljava/lang/Object;
.source "N6CC"

# interfaces
.implements Ljava/util/function/ToIntFunction;


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ll/ۜܿۗ;

    .line 78
    invoke-virtual {p1}, Ll/ۜܿۗ;->᩷()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    return p1
.end method

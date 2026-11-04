.class public final synthetic Ll/᩺᩷᩵;
.super Ljava/lang/Object;
.source "P6HD"

# interfaces
.implements Ljava/util/function/ToIntFunction;


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ll/ۛ֨ۗ;

    if-eqz p1, :cond_0

    .line 119
    invoke-virtual {p1}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 121
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getOffset()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

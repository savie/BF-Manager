.class public abstract Ll/ܺ۠ۗ;
.super Ljava/lang/Object;
.source "Q6M7"

# interfaces
.implements Ll/۬ۜۗ;


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 33
    invoke-virtual {p0}, Ll/ܺ۠ۗ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۙ(Ll/֫ۖۗ;)V
    .locals 0

    return-void
.end method

.method public ۙ(Ll/ۖۡۗ;)V
    .locals 0

    return-void
.end method

.method public ۙ(Ll/᩻ۡۗ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

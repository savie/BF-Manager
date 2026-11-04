.class public final synthetic Ll/ۨۢۚ;
.super Ljava/lang/Object;
.source "Y6JG"

# interfaces
.implements Ll/ۘ۫֫;
.implements Ll/ܿ᩻᩷;


# virtual methods
.method public ۙ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 0
    check-cast p1, Ll/᩶۫֫;

    invoke-virtual {p1}, Ll/᩶۫֫;->ۙ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۙ(IIIII)Z
    .locals 4

    const/4 v0, 0x2

    const/16 v1, 0x43

    const/16 v2, 0x49

    const/16 v3, 0x50

    if-ne p1, v0, :cond_0

    if-ne p2, v3, :cond_1

    if-ne p3, v2, :cond_1

    if-ne p4, v1, :cond_1

    goto :goto_0

    :cond_0
    const/16 p1, 0x41

    if-ne p2, p1, :cond_1

    if-ne p3, v3, :cond_1

    if-ne p4, v2, :cond_1

    if-ne p5, v1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

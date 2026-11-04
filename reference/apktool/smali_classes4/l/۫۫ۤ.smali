.class public final synthetic Ll/۫۫ۤ;
.super Ljava/lang/Object;
.source "X4W4"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/᩸ۛܽ;
.implements Ll/֨᩵ۨ;


# direct methods
.method public static ۙ(I)Z
    .locals 2

    const/4 v0, 0x1

    if-ltz p0, :cond_0

    const/16 v1, 0x8

    if-gt p0, v1, :cond_0

    return v0

    :cond_0
    const/16 v1, 0x10

    if-lt p0, v1, :cond_1

    const/16 v1, 0x12

    if-gt p0, v1, :cond_1

    return v0

    :cond_1
    const/16 v1, 0x1c

    if-lt p0, v1, :cond_2

    const/16 v1, 0x1f

    if-gt p0, v1, :cond_2

    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public construct()Ljava/lang/Object;
    .locals 1

    .line 0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

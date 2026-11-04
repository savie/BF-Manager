.class public final Ll/᩵۬᩵;
.super Ll/֨᩷ۨ;
.source "ZB07"


# instance fields
.field public volatile threadLocalIsSet:Z


# virtual methods
.method public final ܶ()V
    .locals 2

    .line 251
    iget-boolean v0, p0, Ll/᩵۬᩵;->threadLocalIsSet:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    throw v1

    .line 252
    :cond_0
    throw v1
.end method

.method public final ᩸(Ljava/lang/Object;)V
    .locals 2

    .line 257
    iget-boolean v0, p0, Ll/᩵۬᩵;->threadLocalIsSet:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 22
    instance-of v0, p1, Ll/ۨ۠᩵;

    if-eqz v0, :cond_0

    .line 23
    check-cast p1, Ll/ۨ۠᩵;

    iget-object p1, p1, Ll/ۨ۠᩵;->ۙ:Ljava/lang/Throwable;

    invoke-static {p1}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Throwable;)Ll/ۤ۟᩵;

    .line 103
    :cond_0
    throw v1

    .line 258
    :cond_1
    throw v1
.end method

.method public final ᩹()V
    .locals 1

    const/4 v0, 0x1

    .line 246
    iput-boolean v0, p0, Ll/᩵۬᩵;->threadLocalIsSet:Z

    const/4 v0, 0x0

    .line 247
    throw v0
.end method

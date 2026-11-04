.class public abstract Ll/ۚ֫ܽ;
.super Ljava/util/AbstractMap;
.source "067E"


# virtual methods
.method public final clear()V
    .locals 2

    .line 3598
    invoke-virtual {p0}, Ll/ۚ֫ܽ;->ۙ()Ljava/util/Iterator;

    move-result-object v0

    .line 957
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1035
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1036
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1037
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 3583
    new-instance v0, Ll/۫֫ܽ;

    invoke-direct {v0, p0}, Ll/۫֫ܽ;-><init>(Ll/ۚ֫ܽ;)V

    return-object v0
.end method

.method public abstract ۙ()Ljava/util/Iterator;
.end method

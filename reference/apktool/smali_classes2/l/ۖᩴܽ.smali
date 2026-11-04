.class public Ll/ۖᩴܽ;
.super Ljava/util/AbstractCollection;
.source "45HA"


# instance fields
.field public final ܰ:Ll/ۛۙܽ;

.field public final ᩶:Ljava/util/Collection;


# direct methods
.method public constructor <init>(Ljava/util/Collection;Ll/ۛۙܽ;)V
    .locals 0

    .line 126
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 127
    iput-object p1, p0, Ll/ۖᩴܽ;->᩶:Ljava/util/Collection;

    .line 128
    iput-object p2, p0, Ll/ۖᩴܽ;->ܰ:Ll/ۛۙܽ;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    .line 137
    iget-object v0, p0, Ll/ۖᩴܽ;->ܰ:Ll/ۛۙܽ;

    invoke-interface {v0, p1}, Ll/ۛۙܽ;->apply(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ll/ۨۙܽ;->ۙ(Z)V

    .line 138
    iget-object v0, p0, Ll/ۖᩴܽ;->᩶:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 3

    .line 143
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 144
    iget-object v2, p0, Ll/ۖᩴܽ;->ܰ:Ll/ۛۙܽ;

    invoke-interface {v2, v1}, Ll/ۛۙܽ;->apply(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ll/ۨۙܽ;->ۙ(Z)V

    goto :goto_0

    .line 146
    :cond_0
    iget-object v0, p0, Ll/ۖᩴܽ;->᩶:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 2

    .line 151
    iget-object v0, p0, Ll/ۖᩴܽ;->᩶:Ljava/util/Collection;

    iget-object v1, p0, Ll/ۖᩴܽ;->ܰ:Ll/ۛۙܽ;

    invoke-static {v0, v1}, Ll/ܺۚܽ;->ۤ(Ljava/lang/Iterable;Ll/ۛۙܽ;)V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    .line 957
    iget-object v0, p0, Ll/ۖᩴܽ;->᩶:Ljava/util/Collection;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 103
    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Ll/ۖᩴܽ;->ܰ:Ll/ۛۙܽ;

    invoke-interface {v0, p1}, Ll/ۛۙܽ;->apply(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 304
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 305
    invoke-virtual {p0, v0}, Ll/ۖᩴܽ;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final isEmpty()Z
    .locals 2

    .line 171
    iget-object v0, p0, Ll/ۖᩴܽ;->᩶:Ljava/util/Collection;

    iget-object v1, p0, Ll/ۖᩴܽ;->ܰ:Ll/ۛۙܽ;

    invoke-static {v0, v1}, Ll/ܺۚܽ;->ۙ(Ljava/lang/Iterable;Ll/ۛۙܽ;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 176
    iget-object v0, p0, Ll/ۖᩴܽ;->᩶:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 957
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Ll/ۖᩴܽ;->ܰ:Ll/ۛۙܽ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    new-instance v2, Ll/᩹ۚܽ;

    invoke-direct {v2, v0, v1}, Ll/᩹ۚܽ;-><init>(Ljava/util/Iterator;Ll/ۛۙܽ;)V

    return-object v2
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 181
    invoke-virtual {p0, p1}, Ll/ۖᩴܽ;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۖᩴܽ;->᩶:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 4

    .line 187
    iget-object v0, p0, Ll/ۖᩴܽ;->᩶:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    .line 188
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 189
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 190
    iget-object v3, p0, Ll/ۖᩴܽ;->ܰ:Ll/ۛۙܽ;

    invoke-interface {v3, v2}, Ll/ۛۙܽ;->apply(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 191
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 4

    .line 201
    iget-object v0, p0, Ll/ۖᩴܽ;->᩶:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    .line 202
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 203
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 204
    iget-object v3, p0, Ll/ۖᩴܽ;->ܰ:Ll/ۛۙܽ;

    invoke-interface {v3, v2}, Ll/ۛۙܽ;->apply(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 205
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final size()I
    .locals 4

    .line 215
    iget-object v0, p0, Ll/ۖᩴܽ;->᩶:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 216
    iget-object v3, p0, Ll/ۖᩴܽ;->ܰ:Ll/ۛۙܽ;

    invoke-interface {v3, v2}, Ll/ۛۙܽ;->apply(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 226
    invoke-virtual {p0}, Ll/ۖᩴܽ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ֫ܽ;->ۙ(Ljava/util/Iterator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 232
    invoke-virtual {p0}, Ll/ۖᩴܽ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ֫ܽ;->ۙ(Ljava/util/Iterator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

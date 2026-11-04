.class public final Ll/֨᩷᩵;
.super Ljava/lang/Object;
.source "Z6H7"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field public final ܰ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 99
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 104
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 109
    instance-of v0, p1, Ll/ۚ۠ۗ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 112
    :cond_0
    check-cast p1, Ll/ۚ۠ۗ;

    .line 113
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 28
    invoke-virtual {p0, p1}, Ll/֨᩷᩵;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 123
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 128
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 133
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 28
    check-cast p1, Ll/ۚ۠ۗ;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Ll/֨᩷᩵;->ۙ(Ll/ۚ۠ۗ;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 1

    .line 143
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 148
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 153
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 158
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۚ۠ۗ;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final ۙ(Ll/ᩴ۠ۗ;)Ljava/util/List;
    .locals 4

    .line 133
    iget-object v0, p0, Ll/֨᩷᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 164
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ۠ۗ;

    .line 165
    invoke-virtual {v1}, Ll/ۚ۠ۗ;->᩸()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 168
    :cond_0
    invoke-virtual {v1}, Ll/ۚ۠ۗ;->ۙ()Ll/ᩴ۠ۗ;

    move-result-object v3

    invoke-virtual {v3, p1}, Ll/ᩴ۠ۗ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_1
    move-object v1, v2

    :cond_2
    if-nez v1, :cond_3

    return-object v2

    .line 177
    :cond_3
    invoke-virtual {p0, v1}, Ll/֨᩷᩵;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

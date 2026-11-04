.class public final Ll/֡ۤ᩵;
.super Ljava/lang/Object;
.source "OIUU"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field public final ܰ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    return-void
.end method

.method public static ۙ(Ll/֡ۤ᩵;)Ll/֡ۤ᩵;
    .locals 4

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    new-instance v0, Ll/֡ۤ᩵;

    invoke-direct {v0}, Ll/֡ۤ᩵;-><init>()V

    .line 156
    iget-object v1, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 213
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 214
    invoke-virtual {p0, v2}, Ll/֡ۤ᩵;->get(Ljava/lang/Object;)Ll/ܿۤ᩵;

    move-result-object v3

    .line 215
    invoke-static {v3}, Ll/ܿۤ᩵;->᩷(Ll/ܿۤ᩵;)Ll/ܿۤ᩵;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ll/֡ۤ᩵;->ۙ(Ll/᩷ۡۗ;Ll/ܿۤ᩵;)Ll/ܿۤ᩵;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۙ(Ll/֡ۤ᩵;Ll/֡ۤ᩵;)V
    .locals 3

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    iget-object p1, p1, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    .line 206
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿۤ᩵;

    .line 196
    invoke-static {v0}, Ll/ܿۤ᩵;->ۙ(Ll/ܿۤ᩵;)Ll/᩷ۡۗ;

    move-result-object v1

    .line 127
    iget-object v2, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 198
    invoke-virtual {p0, v1}, Ll/֡ۤ᩵;->get(Ljava/lang/Object;)Ll/ܿۤ᩵;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ܿۤ᩵;->ۙ(Ll/ܿۤ᩵;Ll/ܿۤ᩵;)V

    goto :goto_0

    .line 200
    :cond_0
    invoke-static {v0}, Ll/ܿۤ᩵;->᩷(Ll/ܿۤ᩵;)Ll/ܿۤ᩵;

    move-result-object v0

    .line 201
    invoke-virtual {p0, v1, v0}, Ll/֡ۤ᩵;->ۙ(Ll/᩷ۡۗ;Ll/ܿۤ᩵;)Ll/ܿۤ᩵;

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 122
    iget-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 127
    iget-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 132
    instance-of v0, p1, Ll/᩷ۡۗ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 135
    :cond_0
    check-cast p1, Ll/᩷ۡۗ;

    .line 136
    iget-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 141
    iget-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 112
    invoke-virtual {p0, p1}, Ll/֡ۤ᩵;->get(Ljava/lang/Object;)Ll/ܿۤ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ll/ܿۤ᩵;
    .locals 1

    .line 146
    iget-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿۤ᩵;

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 151
    iget-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 156
    iget-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 112
    check-cast p1, Ll/᩷ۡۗ;

    check-cast p2, Ll/ܿۤ᩵;

    invoke-virtual {p0, p1, p2}, Ll/֡ۤ᩵;->ۙ(Ll/᩷ۡۗ;Ll/ܿۤ᩵;)Ll/ܿۤ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 1

    .line 166
    iget-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 171
    iget-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿۤ᩵;

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 176
    iget-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 181
    iget-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/᩷ۡۗ;Ll/ܿۤ᩵;)Ll/ܿۤ᩵;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/֡ۤ᩵;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿۤ᩵;

    return-object p1
.end method

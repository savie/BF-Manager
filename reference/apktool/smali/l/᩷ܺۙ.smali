.class public final Ll/᩷ܺۙ;
.super Ljava/lang/Object;
.source "MANZ"

# interfaces
.implements Ll/ᩴۢ᩷;


# instance fields
.field public ۙ:Z

.field public final ۤ:Ll/ܳۢ᩷;

.field public ᩷:Landroid/os/Bundle;

.field public final ᩸:Ll/֨֡᩵;


# direct methods
.method public constructor <init>(Ll/ܳۢ᩷;Ll/ۗܺۙ;)V
    .locals 1

    const-string v0, "savedStateRegistry"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    iput-object p1, p0, Ll/᩷ܺۙ;->ۤ:Ll/ܳۢ᩷;

    .line 156
    new-instance p1, Ll/ᩳ᩷;

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Ll/ᩳ᩷;-><init>(Ll/ۗܺۙ;I)V

    invoke-static {p1}, Ll/ۡ֡᩵;->ۙ(Ll/ᩴ֨᩵;)Ll/֨֡᩵;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܺۙ;->᩸:Ll/֨֡᩵;

    return-void
.end method


# virtual methods
.method public final ۙ()Landroid/os/Bundle;
    .locals 6

    const/4 v0, 0x0

    new-array v1, v0, [Ll/᩷۟᩵;

    .line 37
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/᩷۟᩵;

    invoke-static {v1}, Ll/֫ۢ;->ۙ([Ll/᩷۟᩵;)Landroid/os/Bundle;

    move-result-object v1

    .line 163
    iget-object v2, p0, Ll/᩷ܺۙ;->᩷:Landroid/os/Bundle;

    if-eqz v2, :cond_0

    .line 223
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 156
    :cond_0
    iget-object v2, p0, Ll/᩷ܺۙ;->᩸:Ll/֨֡᩵;

    invoke-interface {v2}, Ll/֨֡᩵;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤܺۙ;

    .line 166
    invoke-virtual {v2}, Ll/ۤܺۙ;->᩸()Ljava/util/LinkedHashMap;

    move-result-object v2

    .line 263
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢ᩻ۙ;

    .line 167
    invoke-virtual {v3}, Ll/ۢ᩻ۙ;->ۙ()Ll/᩵ܺۙ;

    move-result-object v3

    iget-object v3, v3, Ll/᩵ܺۙ;->ۙ:Ll/ۨܺۙ;

    invoke-static {v3}, Ll/ۨܺۙ;->ۙ(Ll/ۨܺۙ;)Landroid/os/Bundle;

    move-result-object v3

    .line 781
    invoke-virtual {v3}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "key"

    .line 0
    invoke-static {v4, v5}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    .line 174
    :cond_2
    iput-boolean v0, p0, Ll/᩷ܺۙ;->ۙ:Z

    return-object v1
.end method

.method public final ۙ(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 4

    .line 196
    invoke-virtual {p0}, Ll/᩷ܺۙ;->᩷()V

    .line 197
    iget-object v0, p0, Ll/᩷ܺۙ;->᩷:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 790
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    return-object v1

    .line 776
    :cond_1
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_2

    const/4 v2, 0x0

    new-array v3, v2, [Ll/᩷۟᩵;

    .line 37
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/᩷۟᩵;

    invoke-static {v2}, Ll/֫ۢ;->ۙ([Ll/᩷۟᩵;)Landroid/os/Bundle;

    move-result-object v2

    .line 227
    :cond_2
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 781
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 203
    iput-object v1, p0, Ll/᩷ܺۙ;->᩷:Landroid/os/Bundle;

    :cond_3
    return-object v2
.end method

.method public final ᩷()V
    .locals 3

    .line 180
    iget-boolean v0, p0, Ll/᩷ܺۙ;->ۙ:Z

    if-nez v0, :cond_2

    .line 181
    iget-object v0, p0, Ll/᩷ܺۙ;->ۤ:Ll/ܳۢ᩷;

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Ll/ܳۢ᩷;->ۙ(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ll/᩷۟᩵;

    .line 37
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/᩷۟᩵;

    invoke-static {v1}, Ll/֫ۢ;->ۙ([Ll/᩷۟᩵;)Landroid/os/Bundle;

    move-result-object v1

    .line 183
    iget-object v2, p0, Ll/᩷ܺۙ;->᩷:Landroid/os/Bundle;

    if-eqz v2, :cond_0

    .line 223
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 182
    :cond_1
    iput-object v1, p0, Ll/᩷ܺۙ;->᩷:Landroid/os/Bundle;

    const/4 v0, 0x1

    .line 186
    iput-boolean v0, p0, Ll/᩷ܺۙ;->ۙ:Z

    .line 156
    iget-object v0, p0, Ll/᩷ܺۙ;->᩸:Ll/֨֡᩵;

    invoke-interface {v0}, Ll/֨֡᩵;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤܺۙ;

    :cond_2
    return-void
.end method

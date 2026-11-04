.class public final Ll/ۚۧ᩵;
.super Ljava/lang/Object;
.source "76EN"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final ܰ:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    invoke-static {p1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v0, Ll/ۢ᩵ܳ;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll/ۢ᩵ܳ;-><init>(I)V

    .line 192
    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p1

    .line 193
    invoke-static {}, Ll/֫ܺۗ;->toSet()Ll/ۚܺۗ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    iput-object p1, p0, Ll/ۚۧ᩵;->ܰ:Ljava/util/Set;

    return-void
.end method

.method private ۙ(Ljava/util/ArrayList;)Z
    .locals 2

    .line 204
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 205
    iget-object v1, p0, Ll/ۚۧ᩵;->ܰ:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 187
    check-cast p1, Ll/ۧۧ᩵;

    check-cast p2, Ll/ۧۧ᩵;

    .line 198
    invoke-virtual {p1}, Ll/ۧۧ᩵;->᩷()Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۚۧ᩵;->ۙ(Ljava/util/ArrayList;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ll/ۧۧ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۚۧ᩵;->ۙ(Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 199
    :goto_1
    invoke-virtual {p2}, Ll/ۧۧ᩵;->᩷()Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۚۧ᩵;->ۙ(Ljava/util/ArrayList;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p2}, Ll/ۧۧ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {p0, p2}, Ll/ۚۧ᩵;->ۙ(Ljava/util/ArrayList;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    .line 200
    :cond_3
    :goto_2
    invoke-static {p1, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result p1

    neg-int p1, p1

    return p1
.end method

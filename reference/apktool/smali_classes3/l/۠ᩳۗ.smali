.class public final Ll/۠ᩳۗ;
.super Ljava/lang/Object;
.source "36FV"


# instance fields
.field public final ۙ:Ljava/util/HashSet;

.field public final ᩷:Ll/ܽ֫ۗ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ll/ܽ֫ۗ;

    invoke-direct {v0}, Ll/ܽ֫ۗ;-><init>()V

    iput-object v0, p0, Ll/۠ᩳۗ;->᩷:Ll/ܽ֫ۗ;

    .line 23
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/۠ᩳۗ;->ۙ:Ljava/util/HashSet;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۠ᩳۗ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;Ll/ܽۡۗ;)V
    .locals 3

    .line 37
    iget-object v0, p0, Ll/۠ᩳۗ;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Ll/۠ᩳۗ;->᩷:Ll/ܽ֫ۗ;

    if-eqz v1, :cond_0

    .line 38
    invoke-virtual {v2, p1}, Ll/ܽ֫ۗ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 41
    :cond_0
    invoke-virtual {v2, p1, p2}, Ll/ܽ֫ۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘۡۗ;

    if-eqz p2, :cond_1

    .line 43
    invoke-virtual {v2, p1}, Ll/ܽ֫ۗ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)V
    .locals 3

    .line 55
    iget-object v0, p0, Ll/۠ᩳۗ;->᩷:Ll/ܽ֫ۗ;

    invoke-virtual {v0}, Ll/ܽ֫ۗ;->entrySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/᩸ۛ֫;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1}, Ll/᩸ۛ֫;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    return-void
.end method

.method public final ۙ(Ljava/lang/Object;)Z
    .locals 1

    .line 51
    iget-object v0, p0, Ll/۠ᩳۗ;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/۠ᩳۗ;->᩷:Ll/ܽ֫ۗ;

    invoke-virtual {v0, p1}, Ll/ܽ֫ۗ;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ᩷(Ljava/lang/Object;)Ll/ۘۡۗ;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/۠ᩳۗ;->᩷:Ll/ܽ֫ۗ;

    invoke-virtual {v0, p1}, Ll/ܽ֫ۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘۡۗ;

    return-object p1
.end method

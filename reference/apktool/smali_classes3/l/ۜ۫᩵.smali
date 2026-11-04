.class public final Ll/ۜ۫᩵;
.super Ljava/lang/Object;
.source "0IXA"


# instance fields
.field public final ۙ:Ljava/util/ArrayList;

.field public final ۤ:Ll/ۖۡۗ;

.field public final ۫:I

.field public ܳ:I

.field public final ᩴ:Ljava/util/IdentityHashMap;

.field public final ᩷:Ll/ۖ۫᩵;

.field public final ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;Ll/ۖ۫᩵;Ll/ۛۘۗ;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/ۜ۫᩵;->ᩴ:Ljava/util/IdentityHashMap;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜ۫᩵;->᩸:Ljava/util/ArrayList;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜ۫᩵;->ۙ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 27
    iput v0, p0, Ll/ۜ۫᩵;->ܳ:I

    .line 30
    iput-object p1, p0, Ll/ۜ۫᩵;->ۤ:Ll/ۖۡۗ;

    .line 31
    iput-object p2, p0, Ll/ۜ۫᩵;->᩷:Ll/ۖ۫᩵;

    .line 32
    invoke-virtual {p1}, Ll/ۖۡۗ;->᩵ۙ()I

    move-result p1

    invoke-virtual {p3}, Ll/ۛۘۗ;->ܰ()I

    move-result p2

    mul-int p2, p2, p1

    iput p2, p0, Ll/ۜ۫᩵;->۫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TypeUpdateInfo{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۜ۫᩵;->᩷:Ll/ۖ۫᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 112
    iget-object v1, p0, Ll/ۜ۫᩵;->ᩴ:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩵ܺۗ;->sorted()Ll/᩵ܺۗ;

    move-result-object v1

    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ܺ֨ۗ;)Ll/֫֨ۗ;
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ۜ۫᩵;->ᩴ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۫᩵;

    if-eqz v0, :cond_0

    .line 98
    invoke-virtual {v0}, Ll/֨۫᩵;->getType()Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 100
    :cond_0
    invoke-virtual {p1}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ()V
    .locals 3

    .line 79
    iget-object v0, p0, Ll/ۜ۫᩵;->ᩴ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩵ܺۗ;->sorted()Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/᩸ۡۗ;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/᩸ۡۗ;-><init>(I)V

    .line 80
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->forEach(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final ۙ(Ll/۬۫᩵;)V
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ۜ۫᩵;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۙ(Ll/ܺ֨ۗ;Ll/֫֨ۗ;)Z
    .locals 1

    .line 88
    iget-object v0, p0, Ll/ۜ۫᩵;->ᩴ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨۫᩵;

    if-eqz p1, :cond_0

    .line 90
    invoke-virtual {p1}, Ll/֨۫᩵;->getType()Ll/֫֨ۗ;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۤ()Ll/ۖۡۗ;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۜ۫᩵;->ۤ:Ll/ۖۡۗ;

    return-object v0
.end method

.method public final ۤ(Ll/ܺ֨ۗ;)V
    .locals 2

    .line 71
    iget-object v0, p0, Ll/ۜ۫᩵;->ᩴ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨۫᩵;

    if-eqz p1, :cond_0

    .line 73
    invoke-virtual {p1}, Ll/֨۫᩵;->᩸()I

    move-result p1

    .line 74
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    new-instance v1, Ll/۠۫᩵;

    invoke-direct {v1, p1}, Ll/۠۫᩵;-><init>(I)V

    invoke-static {v0, v1}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    :cond_0
    return-void
.end method

.method public final ܳ()Ll/۬۫᩵;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ۜ۫᩵;->᩸:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۜ֫᩵;->᩷(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬۫᩵;

    return-object v0
.end method

.method public final ᩴ()Ll/۬۫᩵;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ۜ۫᩵;->ۙ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۜ֫᩵;->᩷(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬۫᩵;

    return-object v0
.end method

.method public final ᩷()Ll/ۖ۫᩵;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ۜ۫᩵;->᩷:Ll/ۖ۫᩵;

    return-object v0
.end method

.method public final ᩷(Ll/۬۫᩵;)V
    .locals 1

    .line 40
    invoke-virtual {p1}, Ll/۬۫᩵;->᩷()Ll/ۘܳ᩵;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 41
    iget-object v0, p0, Ll/ۜ۫᩵;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ᩷(Ll/ܺ֨ۗ;Ll/֫֨ۗ;)V
    .locals 4

    .line 54
    new-instance v0, Ll/֨۫᩵;

    iget v1, p0, Ll/ۜ۫᩵;->ܳ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۜ۫᩵;->ܳ:I

    invoke-direct {v0, v1, p1, p2}, Ll/֨۫᩵;-><init>(ILl/ܺ֨ۗ;Ll/֫֨ۗ;)V

    iget-object v1, p0, Ll/ۜ۫᩵;->ᩴ:Ljava/util/IdentityHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۫᩵;

    if-nez v0, :cond_2

    .line 60
    iget p1, p0, Ll/ۜ۫᩵;->ܳ:I

    iget p2, p0, Ll/ۜ۫᩵;->۫:I

    if-gt p1, p2, :cond_1

    .line 64
    rem-int/lit8 p1, p1, 0x64

    if-nez p1, :cond_0

    .line 66
    invoke-static {}, Ll/ۘۧ᩵;->ۙ()V

    :cond_0
    return-void

    .line 61
    :cond_1
    new-instance p1, Ll/ۖۧ᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Type inference error: updates count limit reached with updateSeq = "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Ll/ۜ۫᩵;->ܳ:I

    const-string v1, ". Try increasing type updates limit count."

    .line 0
    invoke-static {v0, v1, p2}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1

    .line 56
    :cond_2
    new-instance v1, Ll/۠ۧ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected type update override for arg: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " types: prev="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    invoke-virtual {v0}, Ll/֨۫᩵;->getType()Ll/֫֨ۗ;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", new="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", insn: "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    invoke-virtual {p1}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    throw v1
.end method

.method public final ᩷(Ll/ܺ֨ۗ;)Z
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ۜ۫᩵;->ᩴ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ᩸()Z
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ۜ۫᩵;->ᩴ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result v0

    return v0
.end method

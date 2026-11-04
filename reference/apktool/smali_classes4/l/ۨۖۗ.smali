.class public final Ll/ۨۖۗ;
.super Ll/᩵ۖۗ;
.source "1852"


# instance fields
.field public final ۟:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ܿۡۗ;)V
    .locals 1

    .line 18
    invoke-direct {p0, p1}, Ll/᩵ۖۗ;-><init>(Ll/ܿۡۗ;)V

    .line 19
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ۨۖۗ;->۟:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "R"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۨۖۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۛۡۗ;)V
    .locals 1

    .line 28
    invoke-static {p1, p0}, Ll/᩵ۖۗ;->ۙ(Ll/ۛۡۗ;Ll/᩵ۖۗ;)V

    .line 29
    iget-object v0, p0, Ll/ۨۖۗ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۙ(Ll/۬֡ۗ;Ll/ۗۘۗ;)V
    .locals 2

    .line 34
    iget-object v0, p0, Ll/ۨۖۗ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۡۗ;

    .line 35
    invoke-virtual {p1, p2, v1}, Ll/۬֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۛۡۗ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ۛۡۗ;Ll/ۛۡۗ;)Z
    .locals 2

    .line 41
    iget-object v0, p0, Ll/ۨۖۗ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    .line 43
    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 44
    invoke-static {p2, p0}, Ll/᩵ۖۗ;->ۙ(Ll/ۛۡۗ;Ll/᩵ۖۗ;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ()Ljava/util/List;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/ۨۖۗ;->۟:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 4

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    iget-object v1, p0, Ll/ۨۖۗ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x28

    .line 54
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-lez v2, :cond_0

    const/16 v2, 0x3a

    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    new-instance v2, Ll/ᩳۢ֫;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Ll/ᩳۢ֫;-><init>(I)V

    const-string v3, "|"

    invoke-static {v0, v1, v3, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;)V

    :cond_0
    const/16 v1, 0x29

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

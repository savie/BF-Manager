.class public final Ll/ۡۖۗ;
.super Ll/֡ۖۗ;
.source "Y6CU"

# interfaces
.implements Ll/ۗۡۗ;


# instance fields
.field public ֨:Ll/ۛۡۗ;

.field public ۢ:Ll/ۛۡۗ;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IF "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/֡ۖۗ;->۫()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " THEN: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡۖۗ;->֨:Ll/ۛۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " ELSE: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡۖۗ;->ۢ:Ll/ۛۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۨۖۗ;)V
    .locals 0

    .line 36
    iput-object p1, p0, Ll/ۡۖۗ;->ۢ:Ll/ۛۡۗ;

    return-void
.end method

.method public final ۙ(Ll/۬֡ۗ;Ll/ۗۘۗ;)V
    .locals 1

    const/4 v0, 0x1

    .line 90
    invoke-virtual {p1, p0, p2, v0}, Ll/۬֡ۗ;->ۙ(Ll/ۡۖۗ;Ll/ۗۘۗ;Z)V

    return-void
.end method

.method public final ۙ(Ll/ۛۡۗ;Ll/ۛۡۗ;)Z
    .locals 2

    .line 75
    iget-object v0, p0, Ll/ۡۖۗ;->֨:Ll/ۛۡۗ;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    .line 76
    iput-object p2, p0, Ll/ۡۖۗ;->֨:Ll/ۛۡۗ;

    .line 77
    invoke-static {p2, p0}, Ll/᩵ۖۗ;->ۙ(Ll/ۛۡۗ;Ll/᩵ۖۗ;)V

    return v1

    .line 80
    :cond_0
    iget-object v0, p0, Ll/ۡۖۗ;->ۢ:Ll/ۛۡۗ;

    if-ne p1, v0, :cond_1

    .line 81
    iput-object p2, p0, Ll/ۡۖۗ;->ۢ:Ll/ۛۡۗ;

    .line 82
    invoke-static {p2, p0}, Ll/᩵ۖۗ;->ۙ(Ll/ۛۡۗ;Ll/᩵ۖۗ;)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۙۙ()Ll/ۛۡۗ;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/ۡۖۗ;->ۢ:Ll/ۛۡۗ;

    return-object v0
.end method

.method public final ۤۙ()V
    .locals 2

    .line 40
    invoke-virtual {p0}, Ll/֡ۖۗ;->۠()V

    .line 42
    iget-object v0, p0, Ll/ۡۖۗ;->֨:Ll/ۛۡۗ;

    .line 43
    iget-object v1, p0, Ll/ۡۖۗ;->ۢ:Ll/ۛۡۗ;

    iput-object v1, p0, Ll/ۡۖۗ;->֨:Ll/ۛۡۗ;

    .line 44
    iput-object v0, p0, Ll/ۡۖۗ;->ۢ:Ll/ۛۡۗ;

    return-void
.end method

.method public final ۧ()Ljava/util/List;
    .locals 2

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    iget-object v1, p0, Ll/ۡۖۗ;->֨:Ll/ۛۡۗ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    iget-object v1, p0, Ll/ۡۖۗ;->ۢ:Ll/ۛۡۗ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ljava/util/List;
    .locals 3

    .line 53
    invoke-virtual {p0}, Ll/֡ۖۗ;->۫()Ljava/util/List;

    move-result-object v0

    .line 54
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 56
    iget-object v0, p0, Ll/ۡۖۗ;->֨:Ll/ۛۡۗ;

    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    :cond_0
    iget-object v0, p0, Ll/ۡۖۗ;->ۢ:Ll/ۛۡۗ;

    if-eqz v0, :cond_1

    .line 60
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    :cond_1
    invoke-static {v1}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ll/ۨۖۗ;)V
    .locals 0

    .line 28
    iput-object p1, p0, Ll/ۡۖۗ;->֨:Ll/ۛۡۗ;

    return-void
.end method

.method public final ᩷ۙ()Ll/ۛۡۗ;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/ۡۖۗ;->֨:Ll/ۛۡۗ;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 2

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    iget-object v1, p0, Ll/ۡۖۗ;->֨:Ll/ۛۡۗ;

    if-eqz v1, :cond_0

    .line 97
    invoke-interface {v1}, Ll/ۛۡۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    :cond_0
    iget-object v1, p0, Ll/ۡۖۗ;->ۢ:Ll/ۛۡۗ;

    if-eqz v1, :cond_1

    .line 100
    invoke-interface {v1}, Ll/ۛۡۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

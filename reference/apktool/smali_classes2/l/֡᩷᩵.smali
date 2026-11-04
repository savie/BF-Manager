.class public final Ll/֡᩷᩵;
.super Ljava/lang/Object;
.source "LIT4"


# instance fields
.field public final ۙ:Ljava/util/HashSet;

.field public ۤ:Z

.field public ᩷:Z

.field public final ᩸:Ll/᩺ۗܺ;


# direct methods
.method public constructor <init>(Ll/᩺ۗܺ;Z)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/֡᩷᩵;->ۙ:Ljava/util/HashSet;

    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Ll/֡᩷᩵;->᩷:Z

    .line 29
    iput-object p1, p0, Ll/֡᩷᩵;->᩸:Ll/᩺ۗܺ;

    .line 30
    iput-boolean p2, p0, Ll/֡᩷᩵;->ۤ:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CentralityState - "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    iget-boolean v1, p0, Ll/֡᩷᩵;->᩷:Z

    if-eqz v1, :cond_0

    const-string v1, "allows central"

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "disallows central"

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, " | "

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    iget-object v1, p0, Ll/֡᩷᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    .line 43
    invoke-virtual {v2}, Ll/ۛ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/֡᩷᩵;
    .locals 3

    .line 144
    new-instance v0, Ll/֡᩷᩵;

    iget-object v1, p0, Ll/֡᩷᩵;->᩸:Ll/᩺ۗܺ;

    iget-boolean v2, p0, Ll/֡᩷᩵;->ۤ:Z

    invoke-direct {v0, v1, v2}, Ll/֡᩷᩵;-><init>(Ll/᩺ۗܺ;Z)V

    .line 145
    iget-boolean v1, p0, Ll/֡᩷᩵;->᩷:Z

    iput-boolean v1, v0, Ll/֡᩷᩵;->᩷:Z

    .line 146
    iget-object v1, v0, Ll/֡᩷᩵;->ۙ:Ljava/util/HashSet;

    iget-object v2, p0, Ll/֡᩷᩵;->ۙ:Ljava/util/HashSet;

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final ۙ(Ljava/util/HashSet;)V
    .locals 1

    .line 74
    iget-object v0, p0, Ll/֡᩷᩵;->ۙ:Ljava/util/HashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final ۙ(Ll/ۛ֨ۗ;)V
    .locals 1

    .line 70
    iget-object v0, p0, Ll/֡᩷᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۙ(Ll/ᩳۡۗ;)V
    .locals 3

    .line 83
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 84
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 85
    instance-of v2, v1, Ll/ۛ֨ۗ;

    if-nez v2, :cond_0

    goto :goto_0

    .line 88
    :cond_0
    check-cast v1, Ll/ۛ֨ۗ;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 90
    :cond_1
    new-instance p1, Ll/ܿ᩷᩵;

    invoke-direct {p1, p0}, Ll/ܿ᩷᩵;-><init>(Ll/֡᩷᩵;)V

    invoke-static {v0, p1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final ۙ(Z)V
    .locals 0

    .line 58
    iput-boolean p1, p0, Ll/֡᩷᩵;->᩷:Z

    return-void
.end method

.method public final ۤ()Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Ll/֡᩷᩵;->᩷:Z

    return v0
.end method

.method public final ᩴ()V
    .locals 1

    const/4 v0, 0x0

    .line 66
    iput-boolean v0, p0, Ll/֡᩷᩵;->ۤ:Z

    return-void
.end method

.method public final ᩷()Ljava/util/HashSet;
    .locals 1

    .line 151
    iget-object v0, p0, Ll/֡᩷᩵;->ۙ:Ljava/util/HashSet;

    return-object v0
.end method

.method public final ᩷(Ll/ᩳۡۗ;)Z
    .locals 2

    .line 94
    iget-object v0, p0, Ll/֡᩷᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 98
    :cond_0
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 99
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    goto :goto_1

    .line 106
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֨ۗ;

    .line 107
    invoke-virtual {v1, p1}, Ll/ۛ֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩸()Z
    .locals 1

    .line 62
    iget-boolean v0, p0, Ll/֡᩷᩵;->ۤ:Z

    return v0
.end method

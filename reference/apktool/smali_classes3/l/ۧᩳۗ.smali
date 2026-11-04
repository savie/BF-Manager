.class public final Ll/ۧᩳۗ;
.super Ljava/lang/Object;
.source "9IU6"


# instance fields
.field public final ۙ:Ll/᩷ۡۗ;

.field public final ۤ:Ljava/util/HashSet;

.field public final ᩴ:Ll/᩷ۡۗ;

.field public ᩷:I

.field public ᩸:Ll/ۧᩳۗ;


# direct methods
.method public constructor <init>(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/HashSet;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/ۧᩳۗ;->ᩴ:Ll/᩷ۡۗ;

    .line 24
    iput-object p2, p0, Ll/ۧᩳۗ;->ۙ:Ll/᩷ۡۗ;

    .line 25
    iput-object p3, p0, Ll/ۧᩳۗ;->ۤ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LOOP:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۧᩳۗ;->᩷:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۧᩳۗ;->ᩴ:Ll/᩷ۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۧᩳۗ;->ۙ:Ll/᩷ۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/᩷ۡۗ;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/ۧᩳۗ;->ۙ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ۙ(I)V
    .locals 0

    .line 83
    iput p1, p0, Ll/ۧᩳۗ;->᩷:I

    return-void
.end method

.method public final ۙ(Ll/ۧᩳۗ;)Z
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ۧᩳۗ;->᩸:Ll/ۧᩳۗ;

    :goto_0
    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 87
    :cond_1
    iget-object v0, v0, Ll/ۧᩳۗ;->᩸:Ll/ۧᩳۗ;

    goto :goto_0
.end method

.method public final ۚ()Ll/᩷ۡۗ;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ۧᩳۗ;->ᩴ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ۤ()Ljava/util/HashSet;
    .locals 7

    .line 45
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 47
    iget-object v1, p0, Ll/ۧᩳۗ;->ۤ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    .line 49
    invoke-virtual {v3}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    .line 50
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    sget-object v6, Ll/ۧ۟ۗ;->᩻:Ll/ۧ۟ۗ;

    invoke-virtual {v5, v6}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 51
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final ۫()Ll/᩷ۡۗ;
    .locals 2

    .line 75
    iget-object v0, p0, Ll/ۧᩳۗ;->ᩴ:Ll/᩷ۡۗ;

    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ll/ۧᩳۗ;->ۙ:Ll/᩷ۡۗ;

    invoke-static {v1, v0}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ll/ۧᩳۗ;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ۧᩳۗ;->᩸:Ll/ۧᩳۗ;

    return-object v0
.end method

.method public final ᩴ()Ljava/util/Set;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۧᩳۗ;->ۤ:Ljava/util/HashSet;

    return-object v0
.end method

.method public final ᩷()Ljava/util/ArrayList;
    .locals 8

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 64
    iget-object v1, p0, Ll/ۧᩳۗ;->ۤ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    .line 65
    invoke-virtual {v3}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    .line 66
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-static {v5}, Ll/᩹֫᩵;->۫(Ll/᩷ۡۗ;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 67
    new-instance v6, Ll/ܺۡۗ;

    const/4 v7, 0x0

    .line 11
    invoke-direct {v6, v3, v5, v7}, Ll/ܺۡۗ;-><init>(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Z)V

    .line 67
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final ᩷(Ll/ۧᩳۗ;)V
    .locals 0

    .line 91
    iput-object p1, p0, Ll/ۧᩳۗ;->᩸:Ll/ۧᩳۗ;

    return-void
.end method

.method public final ᩸()I
    .locals 1

    .line 79
    iget v0, p0, Ll/ۧᩳۗ;->᩷:I

    return v0
.end method

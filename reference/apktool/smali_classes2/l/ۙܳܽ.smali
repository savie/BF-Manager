.class public final Ll/ۙܳܽ;
.super Ljava/util/AbstractSet;
.source "O2OZ"


# instance fields
.field public final synthetic ܰ:Ll/ܳܳܽ;


# direct methods
.method public constructor <init>(Ll/ܳܳܽ;)V
    .locals 0

    .line 744
    iput-object p1, p0, Ll/ۙܳܽ;->ܰ:Ll/ܳܳܽ;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 752
    iget-object v0, p0, Ll/ۙܳܽ;->ܰ:Ll/ܳܳܽ;

    invoke-virtual {v0}, Ll/ܳܳܽ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    .line 762
    iget-object v0, p0, Ll/ۙܳܽ;->ܰ:Ll/ܳܳܽ;

    invoke-virtual {v0}, Ll/ܳܳܽ;->ۙ()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 764
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 765
    :cond_0
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_1

    .line 766
    check-cast p1, Ljava/util/Map$Entry;

    .line 767
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܳܳܽ;->᩷(Ll/ܳܳܽ;Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 768
    invoke-static {v0, v1}, Ll/ܳܳܽ;->᩷(Ll/ܳܳܽ;I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 808
    iget-object v0, p0, Ll/ۙܳܽ;->ܰ:Ll/ܳܳܽ;

    invoke-virtual {v0}, Ll/ܳܳܽ;->ۙ()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 810
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    .line 812
    :cond_0
    new-instance v1, Ll/ۜᩴܽ;

    invoke-direct {v1, v0}, Ll/ۜᩴܽ;-><init>(Ll/ܳܳܽ;)V

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 9

    .line 775
    iget-object v0, p0, Ll/ۙܳܽ;->ܰ:Ll/ܳܳܽ;

    invoke-virtual {v0}, Ll/ܳܳܽ;->ۙ()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 777
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 778
    :cond_0
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_3

    .line 779
    check-cast p1, Ljava/util/Map$Entry;

    .line 780
    invoke-virtual {v0}, Ll/ܳܳܽ;->᩸()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 783
    :cond_1
    invoke-static {v0}, Ll/ܳܳܽ;->۫(Ll/ܳܳܽ;)I

    move-result v1

    .line 786
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 787
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 789
    invoke-static {v0}, Ll/ܳܳܽ;->᩷(Ll/ܳܳܽ;)Ljava/lang/Object;

    move-result-object v5

    .line 790
    invoke-static {v0}, Ll/ܳܳܽ;->ۤ(Ll/ܳܳܽ;)[I

    move-result-object v6

    .line 791
    invoke-static {v0}, Ll/ܳܳܽ;->᩸(Ll/ܳܳܽ;)[Ljava/lang/Object;

    move-result-object v7

    .line 792
    invoke-static {v0}, Ll/ܳܳܽ;->ᩴ(Ll/ܳܳܽ;)[Ljava/lang/Object;

    move-result-object v8

    move v4, v1

    .line 785
    invoke-static/range {v2 .. v8}, Ll/۫ܳܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_2

    goto :goto_0

    .line 797
    :cond_2
    invoke-virtual {v0, p1, v1}, Ll/ܳܳܽ;->ۙ(II)V

    .line 798
    invoke-static {v0}, Ll/ܳܳܽ;->ܳ(Ll/ܳܳܽ;)V

    .line 799
    invoke-virtual {v0}, Ll/ܳܳܽ;->᩷()V

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    .line 747
    iget-object v0, p0, Ll/ۙܳܽ;->ܰ:Ll/ܳܳܽ;

    invoke-virtual {v0}, Ll/ܳܳܽ;->size()I

    move-result v0

    return v0
.end method

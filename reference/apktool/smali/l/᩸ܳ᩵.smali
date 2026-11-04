.class public abstract Ll/᩸ܳ᩵;
.super Ljava/lang/Object;
.source "A6BV"

# interfaces
.implements Ll/ۛܳ᩵;


# instance fields
.field public final ۙ:Ll/ᩳۡۗ;

.field public final ᩷:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ᩳۡۗ;Ll/ܺ֨ۗ;)V
    .locals 3

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ll/᩸ܳ᩵;->ۙ:Ll/ᩳۡۗ;

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    if-ne v1, p2, :cond_1

    .line 25
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺ֨ۗ;

    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, p2, Ll/ۛ֨ۗ;

    if-eqz v1, :cond_0

    .line 27
    check-cast p2, Ll/ۛ֨ۗ;

    invoke-virtual {p2}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    if-eq v1, p2, :cond_2

    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, v1, Ll/ۛ֨ۗ;

    if-eqz v2, :cond_2

    .line 34
    check-cast v1, Ll/ۛ֨ۗ;

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 19
    :cond_3
    iput-object v0, p0, Ll/᩸ܳ᩵;->᩷:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩸ܳ᩵;->ۙ:Ll/ᩳۡۗ;

    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    new-instance v1, Ll/ۘۜۧ;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ll/ۘۜۧ;-><init>(I)V

    const-string v2, ", "

    .line 83
    iget-object v3, p0, Ll/᩸ܳ᩵;->᩷:Ljava/util/ArrayList;

    invoke-static {v3, v2, v1}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/String;

    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/util/ArrayList;
    .locals 1

    .line 43
    iget-object v0, p0, Ll/᩸ܳ᩵;->᩷:Ljava/util/ArrayList;

    return-object v0
.end method

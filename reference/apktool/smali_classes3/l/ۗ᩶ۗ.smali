.class public final Ll/ۗ᩶ۗ;
.super Ll/ܺ᩶ۗ;
.source "2ITI"


# instance fields
.field public final ܰ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ۗ᩶ۗ;->ܰ:Ljava/util/HashMap;

    return-void
.end method

.method public static ۙ(Ljava/util/List;)Ll/ۗ᩶ۗ;
    .locals 4

    .line 20
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 23
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 24
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩶ۗ;

    .line 25
    invoke-interface {v1}, Ll/۫᩶ۗ;->getVisibility()Ll/ۤ᩶ۗ;

    move-result-object v2

    sget-object v3, Ll/ۤ᩶ۗ;->֡:Ll/ۤ᩶ۗ;

    if-eq v2, v3, :cond_1

    .line 26
    invoke-interface {v1}, Ll/۫᩶ۗ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 29
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    :goto_1
    const/4 p0, 0x0

    return-object p0

    .line 32
    :cond_3
    new-instance p0, Ll/ۗ᩶ۗ;

    invoke-direct {p0, v0}, Ll/ۗ᩶ۗ;-><init>(Ljava/util/HashMap;)V

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ۗ᩶ۗ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 17
    sget-object v0, Ll/᩻᩶ۗ;->ۤ:Ll/᩻᩶ۗ;

    return-object v0
.end method

.method public final ۙ()Ljava/util/Collection;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ۗ᩶ۗ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۗ᩶ۗ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ᩷()Ljava/util/List;
    .locals 2

    .line 50
    iget-object v0, p0, Ll/ۗ᩶ۗ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v1
.end method

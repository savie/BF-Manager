.class public final Ll/ܿۤ᩵;
.super Ljava/lang/Object;
.source "OIUU"


# instance fields
.field public final ۙ:Ll/᩷ۡۗ;

.field public final ᩷:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ll/᩷ۡۗ;)V
    .locals 3

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Ll/ܿۤ᩵;->ۙ:Ll/᩷ۡۗ;

    .line 69
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    .line 70
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Ll/ܿۤ᩵;->᩷:Ljava/util/HashSet;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 72
    iget-object v1, p0, Ll/ܿۤ᩵;->᩷:Ljava/util/HashSet;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Ll/᩷ۡۗ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܿۤ᩵;-><init>(Ll/᩷ۡۗ;)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܿۤ᩵;)Ll/᩷ۡۗ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۤ᩵;->ۙ:Ll/᩷ۡۗ;

    return-object p0
.end method

.method public static ۙ(Ll/ܿۤ᩵;Ll/ܿۤ᩵;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    iget-object v0, p1, Ll/ܿۤ᩵;->ۙ:Ll/᩷ۡۗ;

    iget-object v1, p0, Ll/ܿۤ᩵;->ۙ:Ll/᩷ۡۗ;

    if-eq v0, v1, :cond_0

    return-void

    .line 104
    :cond_0
    iget-object p0, p0, Ll/ܿۤ᩵;->᩷:Ljava/util/HashSet;

    iget-object p1, p1, Ll/ܿۤ᩵;->᩷:Ljava/util/HashSet;

    invoke-interface {p0, p1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static ۙ(Ll/ܿۤ᩵;Ll/ᩳۤ᩵;I)V
    .locals 4

    .line 77
    iget-object v0, p0, Ll/ܿۤ᩵;->᩷:Ljava/util/HashSet;

    invoke-virtual {p1}, Ll/ᩳۤ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object v1

    iget-object p0, p0, Ll/ܿۤ᩵;->ۙ:Ll/᩷ۡۗ;

    if-eq v1, p0, :cond_0

    goto :goto_2

    .line 80
    :cond_0
    invoke-virtual {p1}, Ll/ᩳۤ᩵;->᩸()I

    move-result p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_1

    add-int v3, p0, v2

    .line 83
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {p1}, Ll/ᩳۤ᩵;->ۤ()I

    move-result p1

    sub-int/2addr p0, p1

    if-nez p0, :cond_2

    :goto_1
    if-ge v1, p1, :cond_2

    .line 89
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public static ۤ(Ll/ܿۤ᩵;)Z
    .locals 0

    .line 108
    iget-object p0, p0, Ll/ܿۤ᩵;->᩷:Ljava/util/HashSet;

    invoke-virtual {p0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public static ᩷(Ll/ܿۤ᩵;)Ll/ܿۤ᩵;
    .locals 2

    .line 95
    new-instance v0, Ll/ܿۤ᩵;

    iget-object v1, p0, Ll/ܿۤ᩵;->ۙ:Ll/᩷ۡۗ;

    invoke-direct {v0, v1}, Ll/ܿۤ᩵;-><init>(Ll/᩷ۡۗ;)V

    .line 96
    iget-object v1, v0, Ll/ܿۤ᩵;->᩷:Ljava/util/HashSet;

    iget-object p0, p0, Ll/ܿۤ᩵;->᩷:Ljava/util/HashSet;

    invoke-interface {v1, p0}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    return-object v0
.end method

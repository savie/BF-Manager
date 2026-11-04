.class public final Ll/ۜܶۚ;
.super Ll/ܶ᩸ۤ;
.source "W6LU"


# instance fields
.field public final ۟:Ll/ۤ۫ۤ;

.field public final ۢ:Ljava/util/ArrayList;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۜܳۤ;Ll/ۤ۫ۤ;Ljava/util/ArrayList;)V
    .locals 5

    .line 73
    check-cast p1, Ll/ᩴ᩸ۤ;

    invoke-direct {p0, p1}, Ll/ܶ᩸ۤ;-><init>(Ll/ᩴ᩸ۤ;)V

    .line 68
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۜܶۚ;->ۢ:Ljava/util/ArrayList;

    .line 74
    invoke-interface {p2}, Ll/ۤ۫ۤ;->ۙ᩷()Ll/ܿۤۤ;

    move-result-object p1

    iput-object p1, p0, Ll/ܶ᩸ۤ;->᩶:Ll/ܿۤۤ;

    .line 75
    iput-object p2, p0, Ll/ۜܶۚ;->۟:Ll/ۤ۫ۤ;

    .line 76
    invoke-interface {p2}, Ll/ۤ۫ۤ;->۫()I

    move-result p1

    iput p1, p0, Ll/ܶ᩸ۤ;->ܿ:I

    .line 77
    invoke-interface {p2}, Ll/ۤ۫ۤ;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܶ᩸ۤ;->֡:Ljava/lang/String;

    .line 78
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ll/ۤ۫ۤ;->ۚ᩷()Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Ll/ۜܶۚ;->ᩳ:Ljava/util/ArrayList;

    .line 79
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 80
    invoke-interface {p2}, Ll/ۤ۫ۤ;->ܽ᩷()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ۫ۤ;

    .line 81
    invoke-interface {v0}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v1

    invoke-static {p3, v1}, Ll/ۜܶۚ;->ۙ(Ljava/util/ArrayList;I)Ljava/util/ArrayList;

    move-result-object v1

    .line 82
    iget-object v2, p0, Ll/ۜܶۚ;->ۢ:Ljava/util/ArrayList;

    invoke-interface {v0}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 83
    :cond_0
    new-instance v3, Ll/۬ܶۚ;

    invoke-interface {v0}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v4

    invoke-direct {v3, p0, v0, v4, v1}, Ll/۬ܶۚ;-><init>(Ll/ۤ۫ۤ;Ll/ܳ۫ۤ;ILjava/util/ArrayList;)V

    move-object v0, v3

    .line 82
    :cond_1
    :goto_1
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 85
    :cond_2
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ܶۚ;

    .line 86
    iget v1, v0, Ll/֨ܶۚ;->۫:I

    ushr-int/lit8 v1, v1, 0x10

    and-int/lit16 v1, v1, 0xff

    if-eqz v1, :cond_5

    .line 90
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 91
    :goto_3
    iget-object v2, p0, Ll/ۜܶۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v2, v1, :cond_4

    .line 92
    iget-object v2, p0, Ll/ۜܶۚ;->ᩳ:Ljava/util/ArrayList;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "?"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Ll/ۜܶۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 94
    :cond_4
    iget-object v2, p0, Ll/ۜܶۚ;->ᩳ:Ljava/util/ArrayList;

    add-int/lit8 v3, v1, -0x1

    iget-object v0, v0, Ll/֨ܶۚ;->᩻:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 95
    iget-object v0, p0, Ll/ۜܶۚ;->ۢ:Ljava/util/ArrayList;

    new-instance v2, Ll/۬ܶۚ;

    const/4 v3, 0x0

    invoke-static {p3, v1}, Ll/ۜܶۚ;->ۙ(Ljava/util/ArrayList;I)Ljava/util/ArrayList;

    move-result-object v4

    invoke-direct {v2, p0, v3, v1, v4}, Ll/۬ܶۚ;-><init>(Ll/ۤ۫ۤ;Ll/ܳ۫ۤ;ILjava/util/ArrayList;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    const-string p1, "Resource patch type ID is invalid."

    const-string p2, "RESOURCE_PATCH_CORRUPT"

    .line 264
    invoke-static {p2, p1}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 88
    throw p1

    :cond_6
    return-void
.end method

.method public static ۙ(Ljava/util/ArrayList;I)Ljava/util/ArrayList;
    .locals 3

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 102
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ܶۚ;

    .line 103
    iget v2, v1, Ll/֨ܶۚ;->۫:I

    ushr-int/lit8 v2, v2, 0x10

    and-int/lit16 v2, v2, 0xff

    if-ne v2, p1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final getType(I)Ll/ܳ۫ۤ;
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ۜܶۚ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳ۫ۤ;

    return-object p1
.end method

.method public final ۚ(I)Ll/᩸۫ۤ;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۜܶۚ;->۟:Ll/ۤ۫ۤ;

    invoke-interface {v0, p1}, Ll/ۤ۫ۤ;->ۚ(I)Ll/᩸۫ۤ;

    move-result-object p1

    return-object p1
.end method

.method public final ۚ᩷()Ljava/util/List;
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۜܶۚ;->ᩳ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۛۙ()I
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ۜܶۚ;->۟:Ll/ۤ۫ۤ;

    invoke-interface {v0}, Ll/ۤ۫ۤ;->ۛۙ()I

    move-result v0

    return v0
.end method

.method public final ۟()I
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ۜܶۚ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ܽ(I)Ll/۬ܳۤ;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/ۜܶۚ;->۟:Ll/ۤ۫ۤ;

    invoke-interface {v0, p1}, Ll/ۤ۫ۤ;->ܽ(I)Ll/۬ܳۤ;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ᩷()Ljava/lang/Iterable;
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ۜܶۚ;->ۢ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ᩵()I
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ۜܶۚ;->۟:Ll/ۤ۫ۤ;

    invoke-interface {v0}, Ll/ۤ۫ۤ;->᩵()I

    move-result v0

    return v0
.end method

.method public final ᩵ۙ()Ljava/lang/Iterable;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/ۜܶۚ;->۟:Ll/ۤ۫ۤ;

    invoke-interface {v0}, Ll/ۤ۫ۤ;->᩵ۙ()Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final ᩶()Ljava/lang/Iterable;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ۜܶۚ;->۟:Ll/ۤ۫ۤ;

    invoke-interface {v0}, Ll/ۤ۫ۤ;->᩶()Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final ᩹(I)Ll/ۙ۫ۤ;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ۜܶۚ;->۟:Ll/ۤ۫ۤ;

    invoke-interface {v0, p1}, Ll/ۤ۫ۤ;->᩹(I)Ll/ۙ۫ۤ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩺ۙ()I
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ۜܶۚ;->۟:Ll/ۤ۫ۤ;

    invoke-interface {v0}, Ll/ۤ۫ۤ;->᩺ۙ()I

    move-result v0

    return v0
.end method

.method public final ᩺᩷()Ljava/lang/Iterable;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۜܶۚ;->۟:Ll/ۤ۫ۤ;

    invoke-interface {v0}, Ll/ۤ۫ۤ;->᩺᩷()Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

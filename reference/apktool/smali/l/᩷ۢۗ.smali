.class public final Ll/᩷ۢۗ;
.super Ljava/lang/Object;
.source "Q6BO"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ֡:I

.field public final ֨:Ljava/lang/String;

.field public final ۟:Ljava/lang/String;

.field public final ۢ:Ll/֫֨ۗ;

.field public ܰ:Ljava/lang/String;

.field public final ܿ:Ll/֨ᩳۗ;

.field public final ᩳ:Ljava/lang/String;

.field public final ᩶:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/֨ᩳۗ;Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p2, p0, Ll/᩷ۢۗ;->۟:Ljava/lang/String;

    .line 29
    iput-object p2, p0, Ll/᩷ۢۗ;->ܰ:Ljava/lang/String;

    .line 30
    iput-object p1, p0, Ll/᩷ۢۗ;->ܿ:Ll/֨ᩳۗ;

    .line 31
    iput-object p3, p0, Ll/᩷ۢۗ;->᩶:Ljava/util/List;

    .line 32
    iput-object p4, p0, Ll/᩷ۢۗ;->ۢ:Ll/֫֨ۗ;

    .line 33
    invoke-static {p2, p3, p4}, Ll/᩷ۢۗ;->ۙ(Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/᩷ۢۗ;->֨:Ljava/lang/String;

    .line 34
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/֨ᩳۗ;->᩺()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p4, 0x2e

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Ll/᩷ۢۗ;->ᩳ:Ljava/lang/String;

    .line 169
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    invoke-virtual {p1}, Ll/֨ᩳۗ;->hashCode()I

    move-result p1

    mul-int/lit8 p1, p1, 0x1f

    add-int/2addr p1, p2

    .line 35
    iput p1, p0, Ll/᩷ۢۗ;->֡:I

    return-void
.end method

.method public static ۙ(Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)Ljava/lang/String;
    .locals 1

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x28

    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫֨ۗ;

    .line 86
    invoke-static {p1}, Ll/ܳ۟ۗ;->ۙ(Ll/֫֨ۗ;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const/16 p0, 0x29

    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_1

    .line 90
    invoke-static {p2}, Ll/ܳ۟ۗ;->ۙ(Ll/֫֨ۗ;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)Ll/᩷ۢۗ;
    .locals 1

    .line 61
    new-instance v0, Ll/᩷ۢۗ;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/᩷ۢۗ;-><init>(Ll/֨ᩳۗ;Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)V

    .line 62
    invoke-virtual {p0}, Ll/֫ۖۗ;->ۚۙ()Ll/ۙۢۗ;

    move-result-object p0

    invoke-virtual {p0, v0}, Ll/ۙۢۗ;->ۙ(Ll/᩷ۢۗ;)Ll/᩷ۢۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ll/ۜܰۗ;)Ll/᩷ۢۗ;
    .locals 3

    .line 66
    invoke-interface {p3}, Ll/ۜܰۗ;->ᩴ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/ۗۨᩴ;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ll/ۗۨᩴ;-><init>(I)V

    invoke-static {v0, v1}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object v0

    .line 67
    invoke-interface {p3}, Ll/ۜܰۗ;->ۤ()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ll/֫֨ۗ;->ۤ(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object p3

    .line 68
    invoke-static {p0, p1, p2, v0, p3}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)Ll/᩷ۢۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/֫ۖۗ;Ll/۬ܰۗ;)Ll/᩷ۢۗ;
    .locals 6

    .line 39
    invoke-virtual {p0}, Ll/֫ۖۗ;->ۚۙ()Ll/ۙۢۗ;

    move-result-object v0

    .line 40
    invoke-interface {p1}, Ll/۬ܰۗ;->ܳ()I

    move-result v1

    if-eqz v1, :cond_0

    .line 42
    invoke-virtual {v0, v1}, Ll/ۙۢۗ;->ۙ(I)Ll/᩷ۢۗ;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    .line 47
    :cond_0
    invoke-interface {p1}, Ll/۬ܰۗ;->ۙ()V

    .line 48
    invoke-interface {p1}, Ll/۬ܰۗ;->᩸()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֫֨ۗ;->ۤ(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object v2

    .line 49
    invoke-static {p0, v2}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object p0

    .line 50
    invoke-interface {p1}, Ll/ۜܰۗ;->ۤ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֫֨ۗ;->ۤ(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object v2

    .line 51
    invoke-interface {p1}, Ll/ۜܰۗ;->ᩴ()Ljava/util/List;

    move-result-object v3

    new-instance v4, Ll/ۗۨᩴ;

    const/4 v5, 0x5

    invoke-direct {v4, v5}, Ll/ۗۨᩴ;-><init>(I)V

    invoke-static {v3, v4}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object v3

    .line 52
    new-instance v4, Ll/᩷ۢۗ;

    invoke-interface {p1}, Ll/۬ܰۗ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, p0, p1, v3, v2}, Ll/᩷ۢۗ;-><init>(Ll/֨ᩳۗ;Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)V

    .line 53
    invoke-virtual {v0, v4}, Ll/ۙۢۗ;->ۙ(Ll/᩷ۢۗ;)Ll/᩷ۢۗ;

    move-result-object p0

    if-eqz v1, :cond_1

    .line 55
    invoke-virtual {v0, v1, p0}, Ll/ۙۢۗ;->ۙ(ILl/᩷ۢۗ;)V

    :cond_1
    return-object p0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 15
    check-cast p1, Ll/᩷ۢۗ;

    invoke-virtual {p0, p1}, Ll/᩷ۢۗ;->ۙ(Ll/᩷ۢۗ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 182
    :cond_0
    instance-of v1, p1, Ll/᩷ۢۗ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 185
    :cond_1
    check-cast p1, Ll/᩷ۢۗ;

    .line 186
    iget-object v1, p0, Ll/᩷ۢۗ;->֨:Ljava/lang/String;

    iget-object v3, p1, Ll/᩷ۢۗ;->֨:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/᩷ۢۗ;->ܿ:Ll/֨ᩳۗ;

    iget-object p1, p1, Ll/᩷ۢۗ;->ܿ:Ll/֨ᩳۗ;

    .line 187
    invoke-virtual {v1, p1}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/᩷ۢۗ;->۟:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 174
    iget v0, p0, Ll/᩷ۢۗ;->֡:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 201
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩷ۢۗ;->ܿ:Ll/֨ᩳۗ;

    invoke-virtual {v1}, Ll/֨ᩳۗ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷ۢۗ;->۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷ۢۗ;->᩶:Ljava/util/List;

    const-string v2, ", "

    .line 72
    invoke-static {v1, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "):"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷ۢۗ;->ۢ:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩷ۢۗ;->ܿ:Ll/֨ᩳۗ;

    invoke-virtual {v1}, Ll/֨ᩳۗ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷ۢۗ;->֨:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/᩷ۢۗ;)I
    .locals 2

    .line 192
    iget-object v0, p0, Ll/᩷ۢۗ;->ܿ:Ll/֨ᩳۗ;

    iget-object v1, p1, Ll/᩷ۢۗ;->ܿ:Ll/֨ᩳۗ;

    invoke-virtual {v0, v1}, Ll/֨ᩳۗ;->ۙ(Ll/֨ᩳۗ;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 196
    :cond_0
    iget-object v0, p0, Ll/᩷ۢۗ;->֨:Ljava/lang/String;

    iget-object p1, p1, Ll/᩷ۢۗ;->֨:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Ll/᩷ۢۗ;->ܰ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ(ZZ)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_0

    .line 76
    iget-object p1, p0, Ll/᩷ۢۗ;->ܰ:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll/᩷ۢۗ;->۟:Ljava/lang/String;

    :goto_0
    if-eqz p2, :cond_1

    .line 78
    iget-object p2, p0, Ll/᩷ۢۗ;->ۢ:Ll/֫֨ۗ;

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    .line 76
    :goto_1
    iget-object v0, p0, Ll/᩷ۢۗ;->᩶:Ljava/util/List;

    invoke-static {p1, v0, p2}, Ll/᩷ۢۗ;->ۙ(Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۤ()Ll/֫֨ۗ;
    .locals 1

    .line 133
    iget-object v0, p0, Ll/᩷ۢۗ;->ۢ:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩷ۢۗ;->ܿ:Ll/֨ᩳۗ;

    invoke-virtual {v1}, Ll/֨ᩳۗ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷ۢۗ;->۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۫()Ll/֨ᩳۗ;
    .locals 1

    .line 129
    iget-object v0, p0, Ll/᩷ۢۗ;->ܿ:Ll/֨ᩳۗ;

    return-object v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Ll/᩷ۢۗ;->֨:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()Ljava/util/List;
    .locals 1

    .line 137
    iget-object v0, p0, Ll/᩷ۢۗ;->᩶:Ljava/util/List;

    return-object v0
.end method

.method public final ᩵()Z
    .locals 2

    .line 145
    iget-object v0, p0, Ll/᩷ۢۗ;->۟:Ljava/lang/String;

    const-string v1, "<init>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ᩷(Ll/᩷ۢۗ;)Z
    .locals 2

    .line 96
    iget-object v0, p0, Ll/᩷ۢۗ;->᩶:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p1, Ll/᩷ۢۗ;->᩶:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/᩷ۢۗ;->۟:Ljava/lang/String;

    iget-object v1, p1, Ll/᩷ۢۗ;->۟:Ljava/lang/String;

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩷ۢۗ;->֨:Ljava/lang/String;

    iget-object p1, p1, Ll/᩷ۢۗ;->֨:Ljava/lang/String;

    .line 98
    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩸()I
    .locals 1

    .line 141
    iget-object v0, p0, Ll/᩷ۢۗ;->᩶:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ᩹()Z
    .locals 2

    .line 149
    iget-object v0, p0, Ll/᩷ۢۗ;->۟:Ljava/lang/String;

    const-string v1, "<clinit>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/᩷ۢۗ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

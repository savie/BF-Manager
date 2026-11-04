.class public final Ll/᩶ᩴ᩵;
.super Ljava/lang/Object;
.source "VIV1"


# static fields
.field public static final synthetic ۤ:I


# instance fields
.field public final ۙ:Ll/ۖۡۗ;

.field public final ᩷:Ll/ۗᩴ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 32
    const-class v0, Ll/᩶ᩴ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>(Ll/ۖۡۗ;Ll/ۗᩴ᩵;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/᩶ᩴ᩵;->ۙ:Ll/ۖۡۗ;

    .line 38
    iput-object p2, p0, Ll/᩶ᩴ᩵;->᩷:Ll/ۗᩴ᩵;

    return-void
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)Ll/᩷ۡۗ;
    .locals 3

    .line 118
    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 119
    invoke-virtual {p0}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 121
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 122
    invoke-static {v2, v0}, Ll/᩹֫᩵;->ܳ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 131
    invoke-virtual {p2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 132
    invoke-static {v0, p1, p2}, Ll/᩶ᩴ᩵;->ۙ(Ll/᩷ۡۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)Ll/᩷ۡۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    :cond_2
    return-object v0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/᩶ۖۗ;Ll/ܺ֨ۗ;Ll/᩷ۡۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)V
    .locals 4

    .line 97
    invoke-virtual {p4, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 98
    invoke-virtual {p2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    .line 99
    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    sget-object v3, Ll/᩺ۢۗ;->᩹ۙ:Ll/᩺ۢۗ;

    if-ne v2, v3, :cond_0

    .line 100
    invoke-virtual {v1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x0

    .line 101
    invoke-virtual {v1, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 102
    invoke-interface {p3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 103
    invoke-virtual {p0}, Ll/᩶ۖۗ;->۠()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 107
    :cond_1
    invoke-virtual {p2}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 108
    invoke-virtual {p4, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 109
    invoke-static {p0, p1, v0, p3, p4}, Ll/᩶ᩴ᩵;->ۙ(Ll/᩶ۖۗ;Ll/ܺ֨ۗ;Ll/᩷ۡۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)V

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۨۖۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;Ll/ۨᩴ᩵;)Ll/᩷ۡۗ;
    .locals 6

    .line 42
    new-instance v0, Ll/᩶ۖۗ;

    invoke-direct {v0, p1, p3}, Ll/᩶ۖۗ;-><init>(Ll/ۨۖۗ;Ll/ᩳۡۗ;)V

    .line 43
    invoke-virtual {v0}, Ll/᩶ۖۗ;->ܿ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    invoke-virtual {p1}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 47
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    const/4 v2, 0x0

    .line 48
    invoke-virtual {p3, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p3

    invoke-static {v0, p3, p2, p1, v1}, Ll/᩶ᩴ᩵;->ۙ(Ll/᩶ۖۗ;Ll/ܺ֨ۗ;Ll/᩷ۡۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)V

    .line 50
    invoke-virtual {v0}, Ll/᩶ۖۗ;->۠()Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, p0, Ll/᩶ᩴ᩵;->ۙ:Ll/ۖۡۗ;

    if-eqz v3, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    .line 51
    invoke-static {v4, v3}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Ll/᩷ۡۗ;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 53
    sget-object v5, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 56
    :cond_0
    invoke-virtual {v3, v2}, Ll/ᩳۡۗ;->ᩴ(I)Ll/ܺ֨ۗ;

    .line 57
    sget-object v4, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_0

    .line 60
    :cond_1
    invoke-static {p2}, Ll/᩹֫᩵;->᩸(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object p2

    const/4 p3, 0x0

    if-nez p2, :cond_2

    const-string p1, "Unexpected end of synchronized block"

    .line 62
    invoke-virtual {v4, p1}, Ll/ۨᩳۗ;->ۤ(Ljava/lang/String;)V

    return-object p3

    .line 66
    :cond_2
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    .line 67
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩷ۡۗ;

    invoke-static {p3}, Ll/᩹֫᩵;->᩸(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object p3

    goto :goto_1

    .line 68
    :cond_3
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v2

    if-le v2, v3, :cond_4

    .line 69
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 70
    invoke-static {p2, p1, v1}, Ll/᩶ᩴ᩵;->ۙ(Ll/᩷ۡۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)Ll/᩷ۡۗ;

    move-result-object p3

    .line 73
    :cond_4
    :goto_1
    invoke-virtual {p4, v0}, Ll/ۨᩴ᩵;->ۙ(Ll/᩵ۖۗ;)V

    if-eqz p3, :cond_5

    .line 75
    invoke-virtual {p4, p3}, Ll/ۨᩴ᩵;->ۙ(Ll/᩷ۡۗ;)V

    goto :goto_3

    .line 77
    :cond_5
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 79
    invoke-static {v1}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;)Ljava/util/List;

    move-result-object v2

    .line 80
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-static {v2}, Ll/ۘۧ᩵;->᩷(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    invoke-static {v2, v4}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 81
    :cond_7
    invoke-virtual {p4, v1}, Ll/ۨᩴ᩵;->ۙ(Ll/᩷ۡۗ;)V

    move-object p3, v1

    goto :goto_2

    .line 87
    :cond_8
    :goto_3
    invoke-virtual {v0}, Ll/᩶ۖۗ;->ܿ()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Ll/᩶ᩴ᩵;->᩷:Ll/ۗᩴ᩵;

    invoke-virtual {v0, p2}, Ll/ۗᩴ᩵;->ۤ(Ll/᩷ۡۗ;)Ll/ۨۖۗ;

    move-result-object p2

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    invoke-virtual {p4}, Ll/ۨᩴ᩵;->᩸()V

    return-object p3
.end method

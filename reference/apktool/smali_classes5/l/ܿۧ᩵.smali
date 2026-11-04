.class public final Ll/ܿۧ᩵;
.super Ljava/lang/Object;
.source "86EK"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ll/᩷۬᩹;


# instance fields
.field public final ܰ:Ljava/util/BitSet;

.field public final ᩶:Ll/ۖۡۗ;


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ܿۧ᩵;->᩶:Ll/ۖۡۗ;

    .line 41
    new-instance v0, Ljava/util/BitSet;

    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ljava/util/List;)Ll/ܿۧ᩵;
    .locals 2

    .line 31
    new-instance v0, Ll/ܿۧ᩵;

    invoke-direct {v0, p0}, Ll/ܿۧ᩵;-><init>(Ll/ۖۡۗ;)V

    .line 53
    new-instance p0, Ll/۬֨ۗ;

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Ll/۬֨ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, p0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-object v0
.end method


# virtual methods
.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 4

    .line 127
    iget-object v0, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 130
    :cond_0
    iget-object v1, p0, Ll/ܿۧ᩵;->᩶:Ll/ۖۡۗ;

    invoke-virtual {v1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    .line 131
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v2

    if-ltz v2, :cond_1

    .line 132
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final getFirst()Ll/᩷ۡۗ;
    .locals 3

    .line 122
    iget-object v0, p0, Ll/ܿۧ᩵;->᩶:Ll/ۖۡۗ;

    invoke-virtual {v0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 138
    new-instance v0, Ll/᩶ۧ᩵;

    .line 107
    iget-object v1, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/util/BitSet;->cardinality()I

    move-result v2

    .line 138
    iget-object v3, p0, Ll/ܿۧ᩵;->᩶:Ll/ۖۡۗ;

    invoke-virtual {v3}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Ll/᩶ۧ᩵;-><init>(Ljava/util/BitSet;ILjava/util/List;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ܿۧ᩵;->spliterator()Ll/۠ۚۗ;

    move-result-object v0

    invoke-static {v0}, Ll/ۖۚۗ;->convert(Ll/۠ۚۗ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚۗ;
    .locals 4

    .line 107
    iget-object v0, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v1

    .line 144
    new-instance v2, Ll/᩶ۧ᩵;

    iget-object v3, p0, Ll/ܿۧ᩵;->᩶:Ll/ۖۡۗ;

    invoke-virtual {v3}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Ll/᩶ۧ᩵;-><init>(Ljava/util/BitSet;ILjava/util/List;)V

    int-to-long v0, v1

    const/16 v3, 0x11

    .line 145
    invoke-static {v2, v0, v1, v3}, Ll/۬ۚۗ;->spliterator(Ljava/util/Iterator;JI)Ll/۠ۚۗ;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 166
    invoke-virtual {p0}, Ll/ܿۧ᩵;->ۤ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ljava/util/ArrayList;)Ll/ܿۧ᩵;
    .locals 3

    .line 94
    iget-object v0, p0, Ll/ܿۧ᩵;->᩶:Ll/ۖۡۗ;

    invoke-static {v0, p1}, Ll/ܿۧ᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/List;)Ll/ܿۧ᩵;

    move-result-object p1

    .line 95
    new-instance v1, Ll/ܿۧ᩵;

    invoke-direct {v1, v0}, Ll/ܿۧ᩵;-><init>(Ll/ۖۡۗ;)V

    .line 97
    iget-object v0, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    iget-object v2, v1, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 98
    iget-object p1, p1, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    invoke-virtual {v2, p1}, Ljava/util/BitSet;->and(Ljava/util/BitSet;)V

    return-object v1
.end method

.method public final ۙ(Ll/ܿۧ᩵;)V
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    iget-object p1, p1, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    return-void
.end method

.method public final ۙ(Ll/᩷ۡۗ;)V
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    invoke-virtual {p1}, Ll/᩷ۡۗ;->۫ۙ()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    return-void
.end method

.method public final ۤ()Ljava/util/List;
    .locals 5

    .line 149
    iget-object v0, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    if-eqz v0, :cond_3

    sget-object v1, Ll/᩵֫᩵;->ܰ:Ll/᩵֫᩵;

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 152
    :cond_0
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v1

    if-nez v1, :cond_1

    .line 154
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 156
    :cond_1
    iget-object v2, p0, Ll/ܿۧ᩵;->᩶:Ll/ۖۡۗ;

    invoke-virtual {v2}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v2

    .line 157
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 158
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v1

    if-ltz v1, :cond_2

    .line 159
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v3

    .line 150
    :cond_3
    :goto_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public final ۤ(Ll/᩷ۡۗ;)Z
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    invoke-virtual {p1}, Ll/᩷ۡۗ;->۫ۙ()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    return p1
.end method

.method public final ᩷()Ll/᩷ۡۗ;
    .locals 3

    .line 115
    iget-object v0, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 116
    iget-object v1, p0, Ll/ܿۧ᩵;->᩶:Ll/ۖۡۗ;

    invoke-virtual {v1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩷(Ll/᩷ۡۗ;)Z
    .locals 2

    .line 69
    invoke-virtual {p1}, Ll/᩷ۡۗ;->۫ۙ()I

    move-result p1

    .line 70
    iget-object v0, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    .line 71
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    return v1
.end method

.method public final ᩸(Ll/᩷ۡۗ;)V
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ܿۧ᩵;->ܰ:Ljava/util/BitSet;

    invoke-virtual {p1}, Ll/᩷ۡۗ;->۫ۙ()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->clear(I)V

    return-void
.end method

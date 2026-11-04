.class public final Ll/۠᩵ܳ;
.super Ljava/lang/Object;
.source "969A"


# instance fields
.field public final ۙ:Ll/ܰۗ;

.field public ۤ:I

.field public final ᩷:Ljava/util/Stack;

.field public final ᩸:Ljava/util/Stack;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 859
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 865
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Ll/۠᩵ܳ;->᩸:Ljava/util/Stack;

    .line 870
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Ll/۠᩵ܳ;->᩷:Ljava/util/Stack;

    .line 875
    new-instance v0, Ll/ܰۗ;

    invoke-direct {v0}, Ll/ܰۗ;-><init>()V

    iput-object v0, p0, Ll/۠᩵ܳ;->ۙ:Ll/ܰۗ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖ᩵ܳ;)Ll/ۖ᩵ܳ;
    .locals 1

    .line 919
    iget v0, p0, Ll/۠᩵ܳ;->ۤ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۠᩵ܳ;->ۤ:I

    .line 920
    iget-object v0, p0, Ll/۠᩵ܳ;->᩸:Ljava/util/Stack;

    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 921
    iget-object p1, p0, Ll/۠᩵ܳ;->᩷:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖ᩵ܳ;

    return-object p1
.end method

.method public final ۙ(Ll/ۛۚۤ;)V
    .locals 3

    .line 925
    iget-object v0, p0, Ll/۠᩵ܳ;->᩸:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛۚۤ;->᩻(I)V

    .line 926
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ᩵ܳ;

    .line 984
    iget-object v2, v1, Ll/ۖ᩵ܳ;->ۤ:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    .line 985
    iget v2, v1, Ll/ۖ᩵ܳ;->᩸:I

    invoke-virtual {p1, v2}, Ll/ۛۚۤ;->writeInt(I)V

    .line 986
    iget-boolean v2, v1, Ll/ۖ᩵ܳ;->ۙ:Z

    invoke-virtual {p1, v2}, Ll/ۛۚۤ;->ۙ(Z)V

    .line 987
    iget-object v1, v1, Ll/ۖ᩵ܳ;->᩷:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    goto :goto_0

    .line 929
    :cond_0
    iget-object v0, p0, Ll/۠᩵ܳ;->᩷:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛۚۤ;->᩻(I)V

    .line 930
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ᩵ܳ;

    .line 984
    iget-object v2, v1, Ll/ۖ᩵ܳ;->ۤ:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    .line 985
    iget v2, v1, Ll/ۖ᩵ܳ;->᩸:I

    invoke-virtual {p1, v2}, Ll/ۛۚۤ;->writeInt(I)V

    .line 986
    iget-boolean v2, v1, Ll/ۖ᩵ܳ;->ۙ:Z

    invoke-virtual {p1, v2}, Ll/ۛۚۤ;->ۙ(Z)V

    .line 987
    iget-object v1, v1, Ll/ۖ᩵ܳ;->᩷:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    goto :goto_1

    .line 933
    :cond_1
    iget-object v0, p0, Ll/۠᩵ܳ;->ۙ:Ll/ܰۗ;

    invoke-virtual {v0}, Ll/ۡۗ;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛۚۤ;->᩻(I)V

    .line 934
    invoke-virtual {v0}, Ll/ܰۗ;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 935
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    .line 936
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛۚۤ;->writeInt(I)V

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ۙ(Ll/᩵ۚۤ;)V
    .locals 7

    .line 941
    iget-object v0, p0, Ll/۠᩵ܳ;->᩸:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 942
    iget-object v1, p0, Ll/۠᩵ܳ;->᩷:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    .line 943
    iget-object v2, p0, Ll/۠᩵ܳ;->ۙ:Ll/ܰۗ;

    invoke-virtual {v2}, Ll/ۡۗ;->clear()V

    .line 945
    invoke-virtual {p1}, Ll/᩵ۚۤ;->ۡ᩷()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    .line 947
    new-instance v6, Ll/ۖ᩵ܳ;

    invoke-direct {v6, p1}, Ll/ۖ᩵ܳ;-><init>(Ll/᩵ۚۤ;)V

    invoke-virtual {v0, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 950
    :cond_0
    invoke-virtual {p1}, Ll/᩵ۚۤ;->ۡ᩷()I

    move-result v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_1

    .line 952
    new-instance v5, Ll/ۖ᩵ܳ;

    invoke-direct {v5, p1}, Ll/ۖ᩵ܳ;-><init>(Ll/᩵ۚۤ;)V

    invoke-virtual {v1, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 955
    :cond_1
    invoke-virtual {p1}, Ll/᩵ۚۤ;->ۡ᩷()I

    move-result v0

    :goto_2
    if-ge v4, v0, :cond_2

    .line 957
    invoke-virtual {p1}, Ll/᩵ۚۤ;->᩶()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/᩵ۚۤ;->readInt()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ll/ۡۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ۙ()Z
    .locals 1

    .line 905
    iget-object v0, p0, Ll/۠᩵ܳ;->᩷:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ۤ()V
    .locals 3

    .line 886
    iget-object v0, p0, Ll/۠᩵ܳ;->᩸:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "//SEARCH//"

    if-eqz v1, :cond_1

    .line 887
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ᩵ܳ;

    .line 888
    iget-object v1, v1, Ll/ۖ᩵ܳ;->ۤ:Ljava/lang/String;

    .line 825
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 889
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 892
    :cond_1
    iget-object v0, p0, Ll/۠᩵ܳ;->᩷:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 893
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ᩵ܳ;

    .line 894
    iget-object v1, v1, Ll/ۖ᩵ܳ;->ۤ:Ljava/lang/String;

    .line 825
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 895
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final ۤ(Ll/ۖ᩵ܳ;)V
    .locals 2

    .line 878
    iget v0, p0, Ll/۠᩵ܳ;->ۤ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۠᩵ܳ;->ۤ:I

    .line 879
    iget-object v0, p0, Ll/۠᩵ܳ;->᩷:Ljava/util/Stack;

    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 880
    iget-object p1, p0, Ll/۠᩵ܳ;->᩸:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->clear()V

    .line 881
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    const/16 v1, 0x64

    if-le p1, v1, :cond_0

    const/4 p1, 0x0

    .line 882
    invoke-virtual {v0, p1}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final ᩷(Ll/ۖ᩵ܳ;)Ll/ۖ᩵ܳ;
    .locals 1

    .line 913
    iget v0, p0, Ll/۠᩵ܳ;->ۤ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۠᩵ܳ;->ۤ:I

    .line 914
    iget-object v0, p0, Ll/۠᩵ܳ;->᩷:Ljava/util/Stack;

    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 915
    iget-object p1, p0, Ll/۠᩵ܳ;->᩸:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖ᩵ܳ;

    return-object p1
.end method

.method public final ᩷()Z
    .locals 1

    .line 901
    iget-object v0, p0, Ll/۠᩵ܳ;->᩸:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ᩸()I
    .locals 1

    .line 962
    iget v0, p0, Ll/۠᩵ܳ;->ۤ:I

    return v0
.end method

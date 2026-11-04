.class public Ll/᩸ᩴܽ;
.super Ll/᩷ᩴܽ;
.source "O3K3"

# interfaces
.implements Ljava/util/List;


# instance fields
.field public final synthetic ᩳ:Ll/ᩴᩴܽ;


# direct methods
.method public constructor <init>(Ll/ᩴᩴܽ;Ljava/lang/Object;Ljava/util/List;Ll/᩷ᩴܽ;)V
    .locals 0

    .line 774
    iput-object p1, p0, Ll/᩸ᩴܽ;->ᩳ:Ll/ᩴᩴܽ;

    .line 775
    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ᩴܽ;-><init>(Ll/ᩴᩴܽ;Ljava/lang/Object;Ljava/util/List;Ll/᩷ᩴܽ;)V

    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 2

    .line 815
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->ۤ()V

    .line 437
    iget-object v0, p0, Ll/᩷ᩴܽ;->ܿ:Ljava/util/Collection;

    .line 816
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    .line 437
    iget-object v1, p0, Ll/᩷ᩴܽ;->ܿ:Ljava/util/Collection;

    .line 779
    check-cast v1, Ljava/util/List;

    .line 817
    invoke-interface {v1, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 818
    iget-object p1, p0, Ll/᩸ᩴܽ;->ᩳ:Ll/ᩴᩴܽ;

    invoke-static {p1}, Ll/ᩴᩴܽ;->᩷(Ll/ᩴᩴܽ;)V

    if-eqz v0, :cond_0

    .line 820
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->᩷()V

    :cond_0
    return-void
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 2

    .line 784
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 787
    :cond_0
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->size()I

    move-result v0

    .line 437
    iget-object v1, p0, Ll/᩷ᩴܽ;->ܿ:Ljava/util/Collection;

    .line 779
    check-cast v1, Ljava/util/List;

    .line 788
    invoke-interface {v1, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 437
    iget-object p2, p0, Ll/᩷ᩴܽ;->ܿ:Ljava/util/Collection;

    .line 790
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    .line 791
    iget-object v1, p0, Ll/᩸ᩴܽ;->ᩳ:Ll/ᩴᩴܽ;

    sub-int/2addr p2, v0

    invoke-static {v1, p2}, Ll/ᩴᩴܽ;->ۙ(Ll/ᩴᩴܽ;I)V

    if-nez v0, :cond_1

    .line 793
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->᩷()V

    :cond_1
    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 802
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->ۤ()V

    .line 437
    iget-object v0, p0, Ll/᩷ᩴܽ;->ܿ:Ljava/util/Collection;

    .line 779
    check-cast v0, Ljava/util/List;

    .line 803
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 836
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->ۤ()V

    .line 437
    iget-object v0, p0, Ll/᩷ᩴܽ;->ܿ:Ljava/util/Collection;

    .line 779
    check-cast v0, Ljava/util/List;

    .line 837
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 842
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->ۤ()V

    .line 437
    iget-object v0, p0, Ll/᩷ᩴܽ;->ܿ:Ljava/util/Collection;

    .line 779
    check-cast v0, Ljava/util/List;

    .line 843
    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 848
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->ۤ()V

    .line 849
    new-instance v0, Ll/ۤᩴܽ;

    invoke-direct {v0, p0}, Ll/ۤᩴܽ;-><init>(Ll/᩸ᩴܽ;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 854
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->ۤ()V

    .line 855
    new-instance v0, Ll/ۤᩴܽ;

    invoke-direct {v0, p0, p1}, Ll/ۤᩴܽ;-><init>(Ll/᩸ᩴܽ;I)V

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 1

    .line 827
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->ۤ()V

    .line 437
    iget-object v0, p0, Ll/᩷ᩴܽ;->ܿ:Ljava/util/Collection;

    .line 779
    check-cast v0, Ljava/util/List;

    .line 828
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    .line 829
    iget-object v0, p0, Ll/᩸ᩴܽ;->ᩳ:Ll/ᩴᩴܽ;

    invoke-static {v0}, Ll/ᩴᩴܽ;->ۤ(Ll/ᩴᩴܽ;)V

    .line 830
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->᩸()V

    return-object p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 809
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->ۤ()V

    .line 437
    iget-object v0, p0, Ll/᩷ᩴܽ;->ܿ:Ljava/util/Collection;

    .line 779
    check-cast v0, Ljava/util/List;

    .line 810
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final subList(II)Ljava/util/List;
    .locals 3

    .line 860
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->ۤ()V

    .line 437
    iget-object v0, p0, Ll/᩷ᩴܽ;->ܿ:Ljava/util/Collection;

    .line 779
    check-cast v0, Ljava/util/List;

    .line 863
    invoke-interface {v0, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    .line 864
    iget-object p2, p0, Ll/᩷ᩴܽ;->ܰ:Ll/᩷ᩴܽ;

    if-nez p2, :cond_0

    move-object p2, p0

    .line 310
    :cond_0
    instance-of v0, p1, Ljava/util/RandomAccess;

    iget-object v1, p0, Ll/᩸ᩴܽ;->ᩳ:Ll/ᩴᩴܽ;

    iget-object v2, p0, Ll/᩷ᩴܽ;->֡:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 311
    new-instance v0, Ll/۠᩸ܽ;

    .line 924
    invoke-direct {v0, v1, v2, p1, p2}, Ll/᩸ᩴܽ;-><init>(Ll/ᩴᩴܽ;Ljava/lang/Object;Ljava/util/List;Ll/᩷ᩴܽ;)V

    return-object v0

    .line 312
    :cond_1
    new-instance v0, Ll/᩸ᩴܽ;

    invoke-direct {v0, v1, v2, p1, p2}, Ll/᩸ᩴܽ;-><init>(Ll/ᩴᩴܽ;Ljava/lang/Object;Ljava/util/List;Ll/᩷ᩴܽ;)V

    return-object v0
.end method

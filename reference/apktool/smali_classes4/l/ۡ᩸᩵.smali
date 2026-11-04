.class public final Ll/ۡ᩸᩵;
.super Ll/ۧᩴ᩵;
.source "I6G1"


# direct methods
.method public static ۙ(Ll/ۛۡۗ;)Z
    .locals 3

    .line 105
    instance-of v0, p0, Ll/᩹ۡۗ;

    if-eqz v0, :cond_0

    .line 106
    check-cast p0, Ll/᩹ۡۗ;

    .line 107
    invoke-interface {p0}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Ll/֫۟ۗ;->ᩴ᩷:Ll/֫۟ۗ;

    invoke-interface {p0, v0}, Ll/ۛ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    .line 108
    :cond_0
    instance-of v0, p0, Ll/ܿۡۗ;

    if-eqz v0, :cond_4

    .line 109
    check-cast p0, Ll/ܿۡۗ;

    .line 110
    invoke-interface {p0}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۡۗ;

    .line 111
    invoke-static {v0}, Ll/ۡ᩸᩵;->ۙ(Ll/ۛۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_2
    const/4 p0, 0x0

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x1

    return p0

    .line 117
    :cond_4
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown container type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 117
    throw v0
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;Ll/᩹ۡۗ;Ll/ܿۡۗ;)V
    .locals 4

    .line 42
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    const-class v0, Ll/᩷ۡۗ;

    if-eq p3, v0, :cond_0

    goto/16 :goto_3

    .line 45
    :cond_0
    check-cast p2, Ll/᩷ۡۗ;

    .line 46
    sget-object p3, Ll/֫۟ۗ;->ᩴ᩷:Ll/֫۟ۗ;

    invoke-virtual {p2, p3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result p3

    if-eqz p3, :cond_a

    .line 47
    invoke-virtual {p2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p3

    .line 48
    check-cast p3, Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_a

    .line 58
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܰۙ()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {p1, p2}, Ll/ۖۡۗ;->᩷(Ll/᩷ۡۗ;)Ll/ۧᩳۗ;

    move-result-object p1

    if-eqz p1, :cond_2

    goto/16 :goto_3

    .line 64
    :cond_2
    invoke-virtual {p0}, Ll/ۧᩴ᩵;->ۙ()Ljava/util/ArrayDeque;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿۡۗ;

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/ۜۖۗ;

    if-ne v0, v1, :cond_3

    goto :goto_3

    .line 77
    :cond_4
    :goto_0
    invoke-virtual {p0}, Ll/ۧᩴ᩵;->ۙ()Ljava/util/ArrayDeque;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v0, p2

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۡۗ;

    .line 79
    instance-of v2, v1, Ll/ۗۡۗ;

    if-eqz v2, :cond_5

    goto :goto_2

    .line 83
    :cond_5
    invoke-interface {v1}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object v2

    .line 84
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_8

    .line 85
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v2

    .line 86
    :cond_6
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 87
    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۡۗ;

    if-ne v3, v0, :cond_7

    goto :goto_2

    .line 90
    :cond_7
    invoke-static {v3}, Ll/ۡ᩸᩵;->ۙ(Ll/ۛۡۗ;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_3

    :cond_8
    :goto_2
    move-object v0, v1

    goto :goto_1

    :cond_9
    const/4 p1, 0x0

    .line 51
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 52
    sget-object p1, Ll/֫۟ۗ;->ᩴ᩷:Ll/֫۟ۗ;

    invoke-virtual {p2, p1}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    :cond_a
    :goto_3
    return-void
.end method

.method public final ۤ(Ll/ۖۡۗ;Ll/ܿۡۗ;)Z
    .locals 0

    .line 36
    invoke-super {p0, p1, p2}, Ll/ۧᩴ᩵;->ۤ(Ll/ۖۡۗ;Ll/ܿۡۗ;)Z

    .line 37
    instance-of p1, p2, Ll/ܰۖۗ;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.class public final Ll/ܿ֡᩹;
.super Ljava/lang/Object;
.source "11LW"

# interfaces
.implements Ll/۠֡᩹;
.implements Ll/ᩴۚۗ;


# instance fields
.field public final ܰ:Ll/۠֡᩹;


# direct methods
.method public constructor <init>(Ll/۠֡᩹;)V
    .locals 0

    .line 1340
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1341
    iput-object p1, p0, Ll/ܿ֡᩹;->ܰ:Ll/۠֡᩹;

    return-void
.end method


# virtual methods
.method public final synthetic add(I)V
    .locals 0

    .line 0
    invoke-static {}, Ll/ۖ֡᩹;->ۙ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖ֡᩹;->ۙ(Ll/۠֡᩹;Ljava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 1337
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/ܿ֡᩹;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1382
    iget-object v0, p0, Ll/ܿ֡᩹;->ܰ:Ll/۠֡᩹;

    invoke-interface {v0, p1}, Ll/ۛ֡᩹;->forEachRemaining(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 1

    .line 1376
    iget-object v0, p0, Ll/ܿ֡᩹;->ܰ:Ll/۠֡᩹;

    invoke-interface {v0, p1}, Ll/᩵ۚۗ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 1346
    iget-object v0, p0, Ll/ܿ֡᩹;->ܰ:Ll/۠֡᩹;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 1351
    iget-object v0, p0, Ll/ܿ֡᩹;->ܰ:Ll/۠֡᩹;

    invoke-interface {v0}, Ll/ۜۖ᩹;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Integer;
    .locals 1

    .line 103
    invoke-static {p0}, Ll/ۨ֡᩹;->ۙ(Ll/ۛ֡᩹;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 31
    invoke-virtual {p0}, Ll/ܿ֡᩹;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 1366
    iget-object v0, p0, Ll/ܿ֡᩹;->ܰ:Ll/۠֡᩹;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    return v0
.end method

.method public final nextInt()I
    .locals 1

    .line 1356
    iget-object v0, p0, Ll/ܿ֡᩹;->ܰ:Ll/۠֡᩹;

    invoke-interface {v0}, Ll/᩵ۚۗ;->nextInt()I

    move-result v0

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/ܿ֡᩹;->ܽۙ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 1371
    iget-object v0, p0, Ll/ܿ֡᩹;->ܰ:Ll/۠֡᩹;

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0
.end method

.method public final remove()V
    .locals 1

    .line 70
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖ֡᩹;->᩷(Ll/۠֡᩹;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic ۙ(I)V
    .locals 0

    .line 0
    invoke-static {}, Ll/ۖ֡᩹;->᩷()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic ۙ(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖ֡᩹;->ۙ(Ll/۠֡᩹;Ljava/lang/Integer;)V

    return-void
.end method

.method public final ܽۙ()I
    .locals 1

    .line 1361
    iget-object v0, p0, Ll/ܿ֡᩹;->ܰ:Ll/۠֡᩹;

    invoke-interface {v0}, Ll/۠֡᩹;->ܽۙ()I

    move-result v0

    return v0
.end method

.method public final synthetic ᩷(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖ֡᩹;->᩷(Ll/۠֡᩹;Ljava/lang/Integer;)V

    return-void
.end method

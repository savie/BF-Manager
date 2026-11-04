.class public final Ll/۟ۤۨ;
.super Ljava/lang/Object;
.source "R96D"

# interfaces
.implements Ll/֫۠᩵;
.implements Ll/ᩳۤۨ;
.implements Ll/ۛ۬᩵;


# static fields
.field public static final synthetic ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic state$volatile:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 0
    const-class v0, Ljava/lang/Object;

    const-string v1, "state$volatile"

    const-class v2, Ll/۟ۤۨ;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/۟ۤۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method private final ᩷(Ll/ۡ۬᩵;)I
    .locals 7

    .line 619
    :cond_0
    :goto_0
    sget-object v0, Ll/۟ۤۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 621
    instance-of v2, v1, Ll/ۧ۠᩵;

    if-eqz v2, :cond_1

    goto :goto_0

    .line 637
    :cond_1
    invoke-static {}, Ll/ۢۤۨ;->᩷()Ll/ۜ᩷ۨ;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    instance-of v2, v1, Ll/֡ۤۨ;

    :goto_1
    if-eqz v2, :cond_3

    const/4 p1, 0x3

    return p1

    .line 639
    :cond_3
    invoke-static {}, Ll/ۢۤۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 p1, 0x2

    return p1

    .line 643
    :cond_4
    invoke-static {}, Ll/ۢۤۨ;->ۤ()Ll/ۜ᩷ۨ;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_7

    invoke-static {p1}, Ll/۟۟᩵;->ۙ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 0
    :cond_5
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v4, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v1, :cond_5

    :goto_2
    if-eqz v4, :cond_0

    goto :goto_4

    .line 647
    :cond_7
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_a

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    .line 3374
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v6

    add-int/2addr v6, v3

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 3375
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 3376
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 0
    :cond_8
    invoke-virtual {v0, p0, v1, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 v4, 0x1

    goto :goto_3

    :cond_9
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v1, :cond_8

    :goto_3
    if-eqz v4, :cond_0

    :goto_4
    return v3

    .line 647
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 649
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected state: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ۙ(Ll/ۡ۬᩵;)Ll/֨ۤۨ;
    .locals 3

    .line 615
    invoke-direct {p0, p1}, Ll/۟ۤۨ;->᩷(Ll/ۡ۬᩵;)I

    move-result p1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 865
    sget-object p1, Ll/֨ۤۨ;->ܿ:Ll/֨ۤۨ;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 866
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected internal result: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 864
    :cond_1
    sget-object p1, Ll/֨ۤۨ;->֡:Ll/֨ۤۨ;

    return-object p1

    .line 863
    :cond_2
    sget-object p1, Ll/֨ۤۨ;->۟:Ll/֨ۤۨ;

    return-object p1

    .line 862
    :cond_3
    sget-object p1, Ll/֨ۤۨ;->ᩳ:Ll/֨ۤۨ;

    return-object p1
.end method

.method public final ۙ()V
    .locals 4

    .line 742
    :goto_0
    sget-object v0, Ll/۟ۤۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 750
    invoke-static {}, Ll/ۢۤۨ;->᩷()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v1, v2, :cond_0

    return-void

    .line 751
    :cond_0
    invoke-static {}, Ll/ۢۤۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v2

    .line 0
    :cond_1
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    return-void

    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_1

    goto :goto_0
.end method

.method public final ۙ(Ll/ۤۙۨ;I)V
    .locals 0

    return-void
.end method

.method public final ۙ(Ll/ۡ۬᩵;Ljava/lang/Object;)Z
    .locals 0

    .line 607
    invoke-direct {p0, p1}, Ll/۟ۤۨ;->᩷(Ll/ۡ۬᩵;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

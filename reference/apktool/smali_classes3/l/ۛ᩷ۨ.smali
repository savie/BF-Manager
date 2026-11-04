.class public Ll/ۛ᩷ۨ;
.super Ljava/lang/Object;
.source "TAXM"


# static fields
.field public static final synthetic ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ܿ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic _next$volatile:Ljava/lang/Object;

.field public volatile synthetic _prev$volatile:Ljava/lang/Object;

.field public volatile synthetic _removedRef$volatile:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "_next$volatile"

    .line 0
    const-class v1, Ll/ۛ᩷ۨ;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۛ᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_prev$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۛ᩷ۨ;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_removedRef$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۛ᩷ۨ;->ܿ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p0, p0, Ll/ۛ᩷ۨ;->_next$volatile:Ljava/lang/Object;

    .line 46
    iput-object p0, p0, Ll/ۛ᩷ۨ;->_prev$volatile:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic ֫()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    .line 0
    sget-object v0, Ll/ۛ᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final ۙ(Ll/ۛ᩷ۨ;)V
    .locals 3

    .line 244
    :goto_0
    sget-object v0, Ll/ۛ᩷ۨ;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ᩷ۨ;

    .line 246
    invoke-virtual {p0}, Ll/ۛ᩷ۨ;->᩷()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_0

    goto :goto_1

    .line 0
    :cond_0
    invoke-virtual {v0, p1, v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 250
    invoke-virtual {p0}, Ll/ۛ᩷ۨ;->۫()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p1}, Ll/ۛ᩷ۨ;->ۧ()Ll/ۛ᩷ۨ;

    :cond_1
    :goto_1
    return-void

    .line 0
    :cond_2
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v1, :cond_0

    goto :goto_0
.end method

.method public static final synthetic ۙ(Ll/᩷۬᩵;Ll/֫۬᩵;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Ll/ۛ᩷ۨ;->ۙ(Ll/ۛ᩷ۨ;)V

    return-void
.end method

.method private final ۧ()Ll/ۛ᩷ۨ;
    .locals 9

    .line 269
    :goto_0
    sget-object v0, Ll/ۛ᩷ۨ;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ᩷ۨ;

    const/4 v2, 0x0

    move-object v3, v1

    :goto_1
    move-object v4, v2

    .line 273
    :goto_2
    sget-object v5, Ll/ۛ᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v5, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, p0, :cond_2

    if-ne v1, v3, :cond_0

    goto :goto_3

    .line 0
    :cond_0
    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v1, :cond_0

    goto :goto_0

    .line 286
    :cond_2
    invoke-virtual {p0}, Ll/ۛ᩷ۨ;->۫()Z

    move-result v7

    if-eqz v7, :cond_3

    return-object v2

    :cond_3
    if-nez v6, :cond_4

    :goto_3
    return-object v3

    .line 288
    :cond_4
    instance-of v7, v6, Ll/۟᩷ۨ;

    if-eqz v7, :cond_5

    .line 289
    check-cast v6, Ll/۟᩷ۨ;

    invoke-virtual {v6, v3}, Ll/۟᩷ۨ;->ۙ(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 292
    :cond_5
    instance-of v7, v6, Ll/ᩳ᩷ۨ;

    if-eqz v7, :cond_9

    if-eqz v4, :cond_8

    .line 295
    check-cast v6, Ll/ᩳ᩷ۨ;

    iget-object v6, v6, Ll/ᩳ᩷ۨ;->ۙ:Ll/ۛ᩷ۨ;

    .line 0
    :cond_6
    invoke-virtual {v5, v4, v3, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move-object v3, v4

    goto :goto_1

    :cond_7
    invoke-virtual {v5, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eq v7, v3, :cond_6

    goto :goto_0

    .line 301
    :cond_8
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ᩷ۨ;

    goto :goto_2

    :cond_9
    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    .line 306
    invoke-static {v6, v4}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v6

    check-cast v4, Ll/ۛ᩷ۨ;

    move-object v8, v4

    move-object v4, v3

    move-object v3, v8

    goto :goto_2
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 317
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ll/ۨ᩷ۨ;

    .line 25
    invoke-direct {v1, p0}, Ll/֫ۡ᩵;-><init>(Ll/ۛ᩷ۨ;)V

    .line 317
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/᩷ۜ᩵;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/᩷۬᩵;Ll/֫۬᩵;Ll/ᩴ۬᩵;)I
    .locals 1

    .line 0
    sget-object v0, Ll/ۛ᩷ۨ;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 180
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    sget-object v0, Ll/ۛ᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 182
    iput-object p2, p3, Ll/᩵᩷ۨ;->ۤ:Ll/֫۬᩵;

    .line 0
    :cond_0
    invoke-virtual {v0, p0, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 185
    invoke-virtual {p3, p0}, Ll/ᩴ᩷ۨ;->ۙ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x2

    return p1

    .line 0
    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۙ(Ll/֫۬᩵;)V
    .locals 2

    .line 0
    sget-object v0, Ll/ۛ᩷ۨ;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 104
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    sget-object v0, Ll/ۛ᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    :goto_0
    invoke-virtual {p0}, Ll/ۛ᩷ۨ;->᩷()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p0, :cond_0

    return-void

    .line 0
    :cond_0
    invoke-virtual {v0, p0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 111
    invoke-direct {p1, p0}, Ll/ۛ᩷ۨ;->ۙ(Ll/ۛ᩷ۨ;)V

    return-void

    .line 0
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p0, :cond_0

    goto :goto_0
.end method

.method public final ۚ()V
    .locals 5

    .line 204
    :goto_0
    invoke-virtual {p0}, Ll/ۛ᩷ۨ;->᩷()Ljava/lang/Object;

    move-result-object v0

    .line 205
    instance-of v1, v0, Ll/ᩳ᩷ۨ;

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-ne v0, p0, :cond_1

    .line 206
    check-cast v0, Ll/ۛ᩷ۨ;

    goto :goto_1

    :cond_1
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    .line 207
    invoke-static {v0, v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Ll/ۛ᩷ۨ;

    .line 50
    sget-object v2, Ll/ۛ᩷ۨ;->ܿ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳ᩷ۨ;

    if-nez v3, :cond_2

    new-instance v3, Ll/ᩳ᩷ۨ;

    invoke-direct {v3, v1}, Ll/ᩳ᩷ۨ;-><init>(Ll/ۛ᩷ۨ;)V

    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 0
    :cond_2
    sget-object v2, Ll/ۛ᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 210
    invoke-direct {v1}, Ll/ۛ᩷ۨ;->ۧ()Ll/ۛ᩷ۨ;

    :goto_1
    return-void

    .line 0
    :cond_3
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v0, :cond_2

    goto :goto_0
.end method

.method public ۫()Z
    .locals 1

    .line 74
    invoke-virtual {p0}, Ll/ۛ᩷ۨ;->᩷()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ll/ᩳ᩷ۨ;

    return v0
.end method

.method public final ܳ()Ll/ۛ᩷ۨ;
    .locals 3

    .line 94
    invoke-direct {p0}, Ll/ۛ᩷ۨ;->ۧ()Ll/ۛ᩷ۨ;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v1, Ll/ۛ᩷ۨ;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩷ۨ;

    .line 97
    :goto_0
    invoke-virtual {v0}, Ll/ۛ᩷ۨ;->۫()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    .line 98
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩷ۨ;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ᩴ()Ll/ۛ᩷ۨ;
    .locals 2

    .line 86
    invoke-virtual {p0}, Ll/ۛ᩷ۨ;->᩷()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ll/ᩳ᩷ۨ;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ll/ᩳ᩷ۨ;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    iget-object v1, v1, Ll/ᩳ᩷ۨ;->ۙ:Ll/ۛ᩷ۨ;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    return-object v1

    :cond_2
    :goto_1
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/ۛ᩷ۨ;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/Object;
    .locals 2

    .line 77
    :goto_0
    sget-object v0, Ll/ۛ᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 79
    instance-of v1, v0, Ll/۟᩷ۨ;

    if-nez v1, :cond_0

    return-object v0

    .line 80
    :cond_0
    check-cast v0, Ll/۟᩷ۨ;

    invoke-virtual {v0, p0}, Ll/۟᩷ۨ;->ۙ(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

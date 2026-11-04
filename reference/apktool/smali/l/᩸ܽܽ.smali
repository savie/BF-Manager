.class public final Ll/᩸ܽܽ;
.super Ll/ۤܽܽ;
.source "O7SL"


# static fields
.field public static final ۙ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final ᩴ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final ᩷:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final ᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 648
    const-class v0, Ljava/lang/Thread;

    const-string v1, "\u1a77"

    .line 649
    const-class v2, Ll/ۚܽܽ;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩸ܽܽ;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "\u06d9"

    .line 652
    invoke-static {v2, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩸ܽܽ;->ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "\u073f"

    .line 656
    const-class v1, Ll/֫ܽܽ;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩸ܽܽ;->ᩴ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 659
    const-class v0, Ll/ۜܺܽ;

    const-string v2, "\u0730"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩸ܽܽ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 662
    const-class v0, Ljava/lang/Object;

    const-string v2, "\u1a76"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩸ܽܽ;->᩷:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/֫ܽܽ;Ll/ۚܽܽ;)Ll/ۚܽܽ;
    .locals 1

    .line 693
    sget-object v0, Ll/᩸ܽܽ;->ᩴ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚܽܽ;

    return-object p1
.end method

.method public final ۙ(Ll/֫ܽܽ;Ll/ۜܺܽ;)Ll/ۜܺܽ;
    .locals 1

    .line 688
    sget-object v0, Ll/᩸ܽܽ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜܺܽ;

    return-object p1
.end method

.method public final ۙ(Ll/ۚܽܽ;Ljava/lang/Thread;)V
    .locals 1

    .line 666
    sget-object v0, Ll/᩸ܽܽ;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۙ(Ll/ۚܽܽ;Ll/ۚܽܽ;)V
    .locals 1

    .line 671
    sget-object v0, Ll/᩸ܽܽ;->ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۙ(Ll/֫ܽܽ;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 698
    sget-object v0, Ll/᩸ܽܽ;->᩷:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۙ(Ll/֫ܽܽ;Ll/ۚܽܽ;Ll/ۚܽܽ;)Z
    .locals 2

    .line 677
    sget-object v0, Ll/᩸ܽܽ;->ᩴ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۙ(Ll/֫ܽܽ;Ll/ۜܺܽ;Ll/ۜܺܽ;)Z
    .locals 2

    .line 683
    sget-object v0, Ll/᩸ܽܽ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

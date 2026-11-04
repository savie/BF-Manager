.class public abstract Ll/۫᩷ۨ;
.super Ljava/lang/Object;
.source "B964"


# static fields
.field public static final synthetic ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic _next$volatile:Ljava/lang/Object;

.field public volatile synthetic _prev$volatile:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "_next$volatile"

    .line 0
    const-class v1, Ll/۫᩷ۨ;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/۫᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_prev$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/۫᩷ۨ;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ll/ۤۙۨ;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    iput-object p1, p0, Ll/۫᩷ۨ;->_prev$volatile:Ljava/lang/Object;

    return-void
.end method

.method public static final ۙ(Ll/۫᩷ۨ;)Ljava/lang/Object;
    .locals 1

    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-object v0, Ll/۫᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 96
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۙ(Ll/ۡ᩷ۨ;)Z
    .locals 2

    .line 0
    :cond_0
    sget-object v0, Ll/۫᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۤ()Ll/۫᩷ۨ;
    .locals 2

    .line 0
    sget-object v0, Ll/۫᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 96
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 104
    invoke-static {}, Ll/ۖ᩷ۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 107
    :cond_0
    check-cast v0, Ll/۫᩷ۨ;

    return-object v0
.end method

.method public final ۫()V
    .locals 6

    .line 121
    invoke-virtual {p0}, Ll/۫᩷ۨ;->ۤ()Ll/۫᩷ۨ;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 169
    :cond_0
    invoke-virtual {p0}, Ll/۫᩷ۨ;->᩸()Ll/۫᩷ۨ;

    move-result-object v0

    .line 170
    :goto_0
    sget-object v1, Ll/۫᩷ۨ;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۫᩷ۨ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 171
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫᩷ۨ;

    goto :goto_0

    .line 177
    :cond_1
    invoke-virtual {p0}, Ll/۫᩷ۨ;->ۤ()Ll/۫᩷ۨ;

    move-result-object v2

    invoke-static {v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 178
    :goto_1
    invoke-virtual {v2}, Ll/۫᩷ۨ;->ᩴ()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 179
    invoke-virtual {v2}, Ll/۫᩷ۨ;->ۤ()Ll/۫᩷ۨ;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v3

    goto :goto_1

    .line 148
    :cond_3
    :goto_2
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ll/۫᩷ۨ;

    if-nez v4, :cond_4

    const/4 v4, 0x0

    goto :goto_3

    :cond_4
    move-object v4, v0

    .line 0
    :cond_5
    :goto_3
    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    if-eqz v0, :cond_6

    sget-object v1, Ll/۫᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 159
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 161
    :cond_6
    invoke-virtual {v2}, Ll/۫᩷ۨ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 121
    invoke-virtual {v2}, Ll/۫᩷ۨ;->ۤ()Ll/۫᩷ۨ;

    move-result-object v1

    if-nez v1, :cond_0

    :cond_7
    if-eqz v0, :cond_8

    .line 162
    invoke-virtual {v0}, Ll/۫᩷ۨ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_8
    return-void

    .line 0
    :cond_9
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v3, :cond_5

    goto :goto_2
.end method

.method public final ܳ()Z
    .locals 3

    .line 133
    invoke-static {}, Ll/ۖ᩷ۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v0

    .line 0
    :cond_0
    sget-object v1, Ll/۫᩷ۨ;->ܰ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ᩴ()Z
.end method

.method public final ᩷()V
    .locals 2

    .line 0
    sget-object v0, Ll/۫᩷ۨ;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    .line 128
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩸()Ll/۫᩷ۨ;
    .locals 1

    .line 0
    sget-object v0, Ll/۫᩷ۨ;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 123
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫᩷ۨ;

    return-object v0
.end method

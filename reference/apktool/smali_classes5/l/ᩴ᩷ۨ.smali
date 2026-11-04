.class public abstract Ll/ᩴ᩷ۨ;
.super Ll/۟᩷ۨ;
.source "MAWV"


# static fields
.field public static final synthetic ۙ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic _consensus$volatile:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 0
    const-class v0, Ljava/lang/Object;

    const-string v1, "_consensus$volatile"

    const-class v2, Ll/ᩴ᩷ۨ;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩷ۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    sget-object v0, Ll/᩸᩷ۨ;->ۙ:Ll/ۜ᩷ۨ;

    iput-object v0, p0, Ll/ᩴ᩷ۨ;->_consensus$volatile:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 67
    sget-object v0, Ll/ᩴ᩷ۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 68
    sget-object v2, Ll/᩸᩷ۨ;->ۙ:Ll/ۜ᩷ۨ;

    if-ne v1, v2, :cond_2

    .line 69
    invoke-virtual {p0, p1}, Ll/ᩴ᩷ۨ;->᩷(Ljava/lang/Object;)Ll/ۜ᩷ۨ;

    move-result-object v3

    .line 53
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 0
    :cond_0
    invoke-virtual {v0, p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v2, :cond_0

    .line 56
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 72
    :cond_2
    :goto_0
    invoke-virtual {p0, p1, v1}, Ll/ᩴ᩷ۨ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public abstract ۙ(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract ᩷(Ljava/lang/Object;)Ll/ۜ᩷ۨ;
.end method

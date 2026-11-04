.class public final Ll/ܳۜ᩵;
.super Ll/֨᩷ۨ;
.source "0AW3"


# static fields
.field public static final synthetic ֡:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public volatile synthetic _decision$volatile:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 0
    const-class v0, Ll/ܳۜ᩵;

    const-string v1, "_decision$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ܳۜ᩵;->֡:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method


# virtual methods
.method public final ۤ(Ljava/lang/Object;)V
    .locals 0

    .line 251
    invoke-virtual {p0, p1}, Ll/ܳۜ᩵;->᩸(Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩸(Ljava/lang/Object;)V
    .locals 2

    .line 238
    :cond_0
    sget-object p1, Ll/ܳۜ᩵;->֡:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x0

    .line 257
    invoke-static {p1}, Ll/۬ۧۤ;->ۙ(Ll/ۙۢ᩵;)Ll/ۙۢ᩵;

    throw p1

    .line 242
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    .line 243
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 241
    invoke-virtual {p1, p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void
.end method

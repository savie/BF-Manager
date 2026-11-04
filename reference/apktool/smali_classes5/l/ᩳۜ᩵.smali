.class public final Ll/ᩳۜ᩵;
.super Ll/۠ۜ᩵;
.source "HAYQ"


# static fields
.field public static final synthetic ᩳ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public volatile synthetic _invoked$volatile:I

.field public final ۟:Ll/۟ۜ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 0
    const-class v0, Ll/ᩳۜ᩵;

    const-string v1, "_invoked$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ᩳۜ᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ll/۟ۜ᩵;)V
    .locals 0

    .line 1434
    invoke-direct {p0}, Ll/۠ۜ᩵;-><init>()V

    .line 1433
    iput-object p1, p0, Ll/ᩳۜ᩵;->۟:Ll/۟ۜ᩵;

    return-void
.end method


# virtual methods
.method public final ᩷(Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1438
    sget-object v2, Ll/ᩳۜ᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩳۜ᩵;->۟:Ll/۟ۜ᩵;

    invoke-interface {v0, p1}, Ll/۟ۜ᩵;->᩷(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.class public final Ll/᩶ۘ۫;
.super Ljava/io/BufferedInputStream;
.source "5AG2"

# interfaces
.implements Ll/۠ۜ᩹;


# instance fields
.field public final ܰ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ᩶:Ll/֨ۘ۫;


# direct methods
.method public constructor <init>(Ll/ᩳۘ۫;Ljava/io/InputStream;Ll/֨ۘ۫;)V
    .locals 0

    .line 279
    iput-object p3, p0, Ll/᩶ۘ۫;->᩶:Ll/֨ۘ۫;

    invoke-direct {p0, p2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 280
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Ll/᩶ۘ۫;->ܰ:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 285
    iget-object v2, p0, Ll/᩶ۘ۫;->ܰ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 288
    :cond_0
    invoke-super {p0}, Ljava/io/BufferedInputStream;->close()V

    .line 289
    sget-object v0, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ܰۘ۫;

    iget-object v2, p0, Ll/᩶ۘ۫;->᩶:Ll/֨ۘ۫;

    invoke-direct {v1, p0, v2}, Ll/ܰۘ۫;-><init>(Ll/᩶ۘ۫;Ll/֨ۘ۫;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final finalize()V
    .locals 0

    .line 308
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 309
    invoke-virtual {p0}, Ll/᩶ۘ۫;->close()V

    return-void
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/ۡۜ᩹;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

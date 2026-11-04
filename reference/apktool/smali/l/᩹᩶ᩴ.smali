.class public final synthetic Ll/᩹᩶ᩴ;
.super Ljava/lang/Object;
.source "89SC"

# interfaces
.implements Ll/ܶ᩻ۙ;


# instance fields
.field public final synthetic ܰ:Ll/ܶ᩶ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩶ᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹᩶ᩴ;->ܰ:Ll/ܶ᩶ᩴ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;)V
    .locals 5

    .line 2
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 50
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗ᩶ᩴ;

    if-eqz p1, :cond_2

    .line 52
    invoke-static {p1}, Ll/ۗ᩶ᩴ;->ۙ(Ll/ۗ᩶ᩴ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ll/ۗ᩶ᩴ;->᩷(Ll/ۗ᩶ᩴ;)Ljava/util/concurrent/Callable;

    move-result-object p1

    iget-object v2, p0, Ll/᩹᩶ᩴ;->ܰ:Ll/ܶ᩶ᩴ;

    iget-object v3, v2, Ll/ܶ᩶ᩴ;->ܰ:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, v2, Ll/ܶ᩶ᩴ;->᩶:Ljava/lang/Object;

    check-cast v2, Ll/ܽ֡֫;

    .line 37
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    if-nez v4, :cond_0

    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ۖۧ;

    :goto_0
    if-eqz v0, :cond_1

    .line 39
    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 40
    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    .line 42
    :cond_1
    new-instance v0, Ll/ۗ᩶ᩴ;

    invoke-direct {v0, v1, p1}, Ll/ۗ᩶ᩴ;-><init>(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v0, v2}, Ll/ۗ᩶ᩴ;->ۙ(Ll/ܽ֡֫;)Ll/۠ۖۧ;

    move-result-object p1

    .line 43
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

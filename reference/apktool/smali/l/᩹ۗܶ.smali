.class public Ll/᩹ۗܶ;
.super Ljava/lang/Object;
.source "H9D4"


# instance fields
.field public final ܰ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/᩹ۗܶ;->ܰ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Ll/᩹ۗܶ;->ܰ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public ۙ(Landroid/webkit/WebStorage;)Ll/ۙۙۤ;
    .locals 2

    .line 176
    new-instance v0, Ll/ۙۙۤ;

    iget-object v1, p0, Ll/᩹ۗܶ;->ܰ:Ljava/lang/Object;

    check-cast v1, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 177
    invoke-interface {v1, p1}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertWebStorage(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    .line 176
    const-class v1, Lorg/chromium/support_lib_boundary/WebStorageBoundaryInterface;

    invoke-static {v1, p1}, Ll/۠ۘۨ;->ۙ(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/chromium/support_lib_boundary/WebStorageBoundaryInterface;

    invoke-direct {v0, p1}, Ll/ۙۙۤ;-><init>(Lorg/chromium/support_lib_boundary/WebStorageBoundaryInterface;)V

    return-object v0
.end method

.method public ۙ(Landroid/webkit/WebSettings;)Ll/ۜ۬᩷;
    .locals 2

    .line 60
    new-instance v0, Ll/ۜ۬᩷;

    iget-object v1, p0, Ll/᩹ۗܶ;->ܰ:Ljava/lang/Object;

    check-cast v1, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 61
    invoke-interface {v1, p1}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertSettings(Landroid/webkit/WebSettings;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    .line 60
    const-class v1, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    invoke-static {v1, p1}, Ll/۠ۘۨ;->ۙ(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    invoke-direct {v0, p1}, Ll/ۜ۬᩷;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public ۙ()Ll/᩹ۗܶ;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/᩹ۗܶ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-lez v0, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ᩷()Z
    .locals 1

    .line 47
    iget-object v0, p0, Ll/᩹ۗܶ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

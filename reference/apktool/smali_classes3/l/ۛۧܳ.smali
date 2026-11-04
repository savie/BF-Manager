.class public final Ll/ۛۧܳ;
.super Ljava/lang/Object;
.source "A6IY"


# instance fields
.field public final ۙ:Landroid/content/Context;

.field public final ᩷:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ۛۧܳ;->᩷:Landroid/os/Handler;

    .line 27
    iput-object p1, p0, Ll/ۛۧܳ;->ۙ:Landroid/content/Context;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۛۧܳ;)Landroid/content/Context;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۧܳ;->ۙ:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic ۙ(Ll/ۛۧܳ;Ll/ܺۧܳ;Ljava/util/Map;)V
    .locals 5

    .line 56
    invoke-static {p1}, Ll/ܺۧܳ;->ۙ(Ll/ܺۧܳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_3

    .line 60
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 61
    instance-of v1, v0, Landroid/webkit/WebStorage$Origin;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/webkit/WebStorage$Origin;

    invoke-virtual {v0}, Landroid/webkit/WebStorage$Origin;->getUsage()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 68
    :cond_2
    iget-object p2, p0, Ll/ۛۧܳ;->᩷:Landroid/os/Handler;

    new-instance v0, Ll/ۧۧܳ;

    invoke-direct {v0, p0, p1}, Ll/ۧۧܳ;-><init>(Ll/ۛۧܳ;Ll/ܺۧܳ;)V

    const-wide/16 p0, 0x32

    invoke-virtual {p2, v0, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 67
    :cond_3
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p0}, Ll/ܺۧܳ;->ۙ(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۛۧܳ;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۧܳ;->᩷:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public final ۙ(Ll/᩷ۧܳ;)V
    .locals 5

    .line 32
    iget-object v0, p0, Ll/ۛۧܳ;->᩷:Landroid/os/Handler;

    new-instance v1, Ll/ܺۧܳ;

    invoke-direct {v1, p0, p1}, Ll/ܺۧܳ;-><init>(Ll/ۛۧܳ;Ljava/util/function/Consumer;)V

    :try_start_0
    const-string p1, "DELETE_BROWSING_DATA"

    .line 34
    invoke-static {p1}, Ll/ۧ᩻ܺ;->᩷(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 35
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    move-result-object p1

    new-instance v0, Ll/ܳۧܳ;

    invoke-direct {v0, v1}, Ll/ܳۧܳ;-><init>(Ll/ܺۧܳ;)V

    .line 93
    new-instance v2, Ll/᩸۬᩷;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 71
    sget-object v3, Ll/ᩴۙۤ;->ۤ:Ll/ܶ۬᩷;

    .line 72
    invoke-virtual {v3}, Ll/᩺۬᩷;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 159
    invoke-static {}, Ll/ۚۙۤ;->ۤ()Ll/᩹ۗܶ;

    move-result-object v3

    invoke-virtual {v3, p1}, Ll/᩹ۗܶ;->ۙ(Landroid/webkit/WebStorage;)Ll/ۙۙۤ;

    move-result-object p1

    .line 73
    invoke-virtual {p1, v2, v0}, Ll/ۙۙۤ;->deleteBrowsingData(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V

    return-void

    .line 75
    :cond_0
    invoke-static {}, Ll/ᩴۙۤ;->ۙ()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1

    .line 38
    :cond_1
    new-instance p1, Ll/ܿܿ᩻;

    iget-object v2, p0, Ll/ۛۧܳ;->ۙ:Landroid/content/Context;

    invoke-direct {p1, v2}, Ll/ܿܿ᩻;-><init>(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    .line 40
    :try_start_1
    invoke-virtual {p1, v2}, Landroid/webkit/WebView;->clearCache(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    :try_start_2
    new-instance v2, Ll/۟֫᩸;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p1}, Ll/۟֫᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 45
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebStorage;->deleteAllData()V

    .line 46
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object p1

    new-instance v0, Ll/۫ۧܳ;

    invoke-direct {v0, p0, v1}, Ll/۫ۧܳ;-><init>(Ll/ۛۧܳ;Ll/ܺۧܳ;)V

    invoke-virtual {p1, v0}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    return-void

    :catchall_0
    move-exception v2

    .line 43
    new-instance v3, Ll/۟֫᩸;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p1}, Ll/۟֫᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 44
    throw v2
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 49
    :catch_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1}, Ll/ܺۧܳ;->ۙ(Ljava/lang/Boolean;)V

    return-void
.end method

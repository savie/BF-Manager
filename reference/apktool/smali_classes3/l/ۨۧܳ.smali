.class public final Ll/ۨۧܳ;
.super Ljava/lang/Object;
.source "A6IY"


# instance fields
.field public ۙ:Z

.field public ۤ:Z

.field public ۫:Ll/ܿܿ᩻;

.field public final ܳ:Ll/ܶۧܳ;

.field public final synthetic ᩴ:Ll/ۛۧܳ;

.field public final ᩷:Ll/ۤۧܳ;

.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۛۧܳ;Ljava/lang/String;Ll/ۤۧܳ;)V
    .locals 0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۧܳ;->ᩴ:Ll/ۛۧܳ;

    .line 115
    new-instance p1, Ll/ܶۧܳ;

    invoke-direct {p1, p0}, Ll/ܶۧܳ;-><init>(Ll/ۨۧܳ;)V

    iput-object p1, p0, Ll/ۨۧܳ;->ܳ:Ll/ܶۧܳ;

    .line 121
    iput-object p2, p0, Ll/ۨۧܳ;->᩸:Ljava/lang/String;

    .line 122
    iput-object p3, p0, Ll/ۨۧܳ;->᩷:Ll/ۤۧܳ;

    return-void
.end method

.method public static synthetic ۙ(Ll/ۨۧܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 115
    invoke-direct {p0, v0}, Ll/ۨۧܳ;->ۙ(Z)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ۨۧܳ;Ljava/lang/Long;)V
    .locals 4

    .line 167
    iget-boolean v0, p0, Ll/ۨۧܳ;->ۤ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 168
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/ۨۧܳ;->ۙ(Z)V

    return-void

    .line 169
    :cond_1
    iget-object p1, p0, Ll/ۨۧܳ;->ᩴ:Ll/ۛۧܳ;

    invoke-static {p1}, Ll/ۛۧܳ;->᩷(Ll/ۛۧܳ;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Ll/ܽۧܳ;

    invoke-direct {v0, p0}, Ll/ܽۧܳ;-><init>(Ll/ۨۧܳ;)V

    const-wide/16 v1, 0x32

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private ۙ(Z)V
    .locals 2

    .line 174
    iget-boolean v0, p0, Ll/ۨۧܳ;->ۤ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 175
    iput-boolean v0, p0, Ll/ۨۧܳ;->ۤ:Z

    .line 176
    iget-object v0, p0, Ll/ۨۧܳ;->ᩴ:Ll/ۛۧܳ;

    invoke-static {v0}, Ll/ۛۧܳ;->᩷(Ll/ۛۧܳ;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Ll/ۨۧܳ;->ܳ:Ll/ܶۧܳ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 177
    iget-object v0, p0, Ll/ۨۧܳ;->۫:Ll/ܿܿ᩻;

    if-eqz v0, :cond_1

    .line 178
    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 179
    iget-object v0, p0, Ll/ۨۧܳ;->۫:Ll/ܿܿ᩻;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    const/4 v0, 0x0

    .line 180
    iput-object v0, p0, Ll/ۨۧܳ;->۫:Ll/ܿܿ᩻;

    .line 182
    :cond_1
    iget-object v0, p0, Ll/ۨۧܳ;->᩷:Ll/ۤۧܳ;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۤۧܳ;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static bridge synthetic ۚ(Ll/ۨۧܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0}, Ll/ۨۧܳ;->ۙ(Z)V

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/ۨۧܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۨۧܳ;->ۙ:Z

    return p0
.end method

.method public static ۫(Ll/ۨۧܳ;)V
    .locals 3

    .line 165
    iget-boolean v0, p0, Ll/ۨۧܳ;->ۤ:Z

    if-eqz v0, :cond_0

    return-void

    .line 166
    :cond_0
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    move-result-object v0

    iget-object v1, p0, Ll/ۨۧܳ;->᩸:Ljava/lang/String;

    new-instance v2, Ll/᩹ۧܳ;

    invoke-direct {v2, p0}, Ll/᩹ۧܳ;-><init>(Ll/ۨۧܳ;)V

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebStorage;->getUsageForOrigin(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۨۧܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۨۧܳ;->ۙ:Z

    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/ۨۧܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۧܳ;->᩸:Ljava/lang/String;

    return-object p0
.end method

.method public static ᩷(Ll/ۨۧܳ;)V
    .locals 3

    .line 165
    iget-boolean v0, p0, Ll/ۨۧܳ;->ۤ:Z

    if-eqz v0, :cond_0

    return-void

    .line 166
    :cond_0
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    move-result-object v0

    iget-object v1, p0, Ll/ۨۧܳ;->᩸:Ljava/lang/String;

    new-instance v2, Ll/᩹ۧܳ;

    invoke-direct {v2, p0}, Ll/᩹ۧܳ;-><init>(Ll/ۨۧܳ;)V

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebStorage;->getUsageForOrigin(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public static bridge synthetic ᩸(Ll/ۨۧܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۨۧܳ;->ۤ:Z

    return p0
.end method


# virtual methods
.method public final ۙ()V
    .locals 9

    .line 127
    iget-object v0, p0, Ll/ۨۧܳ;->ᩴ:Ll/ۛۧܳ;

    invoke-static {v0}, Ll/ۛۧܳ;->᩷(Ll/ۛۧܳ;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Ll/ۨۧܳ;->ܳ:Ll/ܶۧܳ;

    const-wide/16 v3, 0x2710

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v1, 0x0

    .line 129
    :try_start_0
    new-instance v2, Ll/ܿܿ᩻;

    invoke-static {v0}, Ll/ۛۧܳ;->ۙ(Ll/ۛۧܳ;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Ll/ܿܿ᩻;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Ll/ۨۧܳ;->۫:Ll/ܿܿ᩻;

    .line 130
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 131
    iget-object v0, p0, Ll/ۨۧܳ;->۫:Ll/ܿܿ᩻;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 132
    iget-object v0, p0, Ll/ۨۧܳ;->۫:Ll/ܿܿ᩻;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 133
    iget-object v0, p0, Ll/ۨۧܳ;->۫:Ll/ܿܿ᩻;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 134
    iget-object v0, p0, Ll/ۨۧܳ;->۫:Ll/ܿܿ᩻;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setBlockNetworkLoads(Z)V

    .line 135
    iget-object v0, p0, Ll/ۨۧܳ;->۫:Ll/ܿܿ᩻;

    new-instance v2, Ll/᩵ۧܳ;

    invoke-direct {v2, p0}, Ll/᩵ۧܳ;-><init>(Ll/ۨۧܳ;)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 157
    iget-object v3, p0, Ll/ۨۧܳ;->۫:Ll/ܿܿ᩻;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ۨۧܳ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "<!doctype html><html></html>"

    const-string v6, "text/html"

    const-string v7, "UTF-8"

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 160
    :catch_0
    invoke-direct {p0, v1}, Ll/ۨۧܳ;->ۙ(Z)V

    return-void
.end method

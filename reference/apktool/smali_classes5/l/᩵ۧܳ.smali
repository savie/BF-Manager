.class public final Ll/᩵ۧܳ;
.super Landroid/webkit/WebViewClient;
.source "A6IY"


# instance fields
.field public final synthetic ۙ:Ll/ۨۧܳ;


# direct methods
.method public constructor <init>(Ll/ۨۧܳ;)V
    .locals 0

    .line 135
    iput-object p1, p0, Ll/᩵ۧܳ;->ۙ:Ll/ۨۧܳ;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 142
    iget-object p2, p0, Ll/᩵ۧܳ;->ۙ:Ll/ۨۧܳ;

    invoke-static {p2}, Ll/ۨۧܳ;->᩸(Ll/ۨۧܳ;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Ll/ۨۧܳ;->ۤ(Ll/ۨۧܳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 143
    :cond_0
    invoke-static {p2}, Ll/ۨۧܳ;->ܳ(Ll/ۨۧܳ;)V

    .line 144
    new-instance p2, Ll/ۗۧܳ;

    invoke-direct {p2, p0}, Ll/ۗۧܳ;-><init>(Ll/᩵ۧܳ;)V

    const-string v0, "(function(){try{localStorage.clear();sessionStorage.clear();return localStorage.length===0;}catch(e){return false;}})()"

    invoke-virtual {p1, v0, p2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 0

    .line 137
    iget-object p1, p0, Ll/᩵ۧܳ;->ۙ:Ll/ۨۧܳ;

    invoke-static {p1}, Ll/ۨۧܳ;->ۚ(Ll/ۨۧܳ;)V

    const/4 p1, 0x1

    return p1
.end method

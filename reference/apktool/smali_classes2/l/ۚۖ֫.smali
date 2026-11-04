.class public final Ll/ۚۖ֫;
.super Landroid/webkit/WebChromeClient;
.source "E72G"


# instance fields
.field public final synthetic ۙ:Ll/ۘۖ֫;


# direct methods
.method public constructor <init>(Ll/ۘۖ֫;)V
    .locals 0

    .line 1026
    iput-object p1, p0, Ll/ۚۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 1

    const/4 v0, 0x0

    .line 1084
    invoke-interface {p2, p1, v0, v0}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    return-void
.end method

.method public final onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    .line 1046
    iget-object p1, p0, Ll/ۚۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {p1, p2}, Ll/ۘۖ֫;->ܳ(Ll/ۘۖ֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, p2, p3, p4, v0}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;Z)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    .line 1053
    iget-object p1, p0, Ll/ۚۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {p1, p2}, Ll/ۘۖ֫;->ܳ(Ll/ۘۖ֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    invoke-static {p1, p2, p3, p4, v0}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;Z)V

    return v0
.end method

.method public final onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 2

    .line 1061
    iget-object p1, p0, Ll/ۚۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {p1}, Ll/ۘۖ֫;->ۗ(Ll/ۘۖ֫;)Ll/ۢۖ֫;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/ۘۖ֫;->ۗ(Ll/ۘۖ֫;)Ll/ۢۖ֫;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p5}, Ll/ۢۖ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 1062
    :cond_0
    invoke-static {p1, p2}, Ll/ۘۖ֫;->ܳ(Ll/ۘۖ֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, p3, p4, p5}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)V

    return v1
.end method

.method public final onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 0

    .line 1077
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->deny()V

    return-void
.end method

.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    const/16 p1, 0x64

    if-ge p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1040
    :goto_0
    iget-object v0, p0, Ll/ۚۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {v0, p1, p2}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;ZI)V

    return-void
.end method

.method public final onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 1030
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۚۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {v1, v0}, Ll/ۘۖ֫;->᩸(Ll/ۘۖ֫;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1031
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ۘۖ֫;->ᩴ(Ll/ۘۖ֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 1032
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 1033
    invoke-virtual {v1, p2}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public final onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 0

    .line 1070
    iget-object p1, p0, Ll/ۚۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {p1, p2, p3}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)V

    const/4 p1, 0x1

    return p1
.end method

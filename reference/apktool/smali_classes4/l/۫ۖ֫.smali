.class public final Ll/۫ۖ֫;
.super Landroid/webkit/WebViewClient;
.source "E72G"


# instance fields
.field public final synthetic ۙ:Ll/ۘۖ֫;


# direct methods
.method public constructor <init>(Ll/ۘۖ֫;)V
    .locals 0

    .line 582
    iput-object p1, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 0

    .line 643
    iget-object p3, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {p3, p1, p2}, Ll/ۘۖ֫;->᩷(Ll/ۘۖ֫;Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public final onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 649
    iget-object v0, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {v0, p1, p2}, Ll/ۘۖ֫;->ۤ(Ll/ۘۖ֫;Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 650
    invoke-static {v0, p1, p2}, Ll/ۘۖ֫;->᩷(Ll/ۘۖ֫;Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 651
    invoke-static {v0, p2}, Ll/ۘۖ֫;->ۤ(Ll/ۘۖ֫;Ljava/lang/String;)V

    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 658
    iget-object v0, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {v0, p1, p2}, Ll/ۘۖ֫;->ۤ(Ll/ۘۖ֫;Landroid/webkit/WebView;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/16 v1, 0x64

    .line 659
    invoke-static {v0, p1, v1}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;ZI)V

    .line 660
    invoke-static {v0}, Ll/ۘۖ֫;->֡(Ll/ۘۖ֫;)V

    .line 661
    invoke-static {v0, p2}, Ll/ۘۖ֫;->ۤ(Ll/ۘۖ֫;Ljava/lang/String;)V

    .line 662
    invoke-static {v0}, Ll/ۘۖ֫;->ۨ(Ll/ۘۖ֫;)Ll/ۜۖ֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۜۖ֫;->ۤ()V

    .line 663
    invoke-static {v0}, Ll/ۘۖ֫;->ۗ(Ll/ۘۖ֫;)Ll/ۢۖ֫;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {v0}, Ll/ۘۖ֫;->ۗ(Ll/ۘۖ֫;)Ll/ۢۖ֫;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ۢۖ֫;->ۙ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 4

    .line 619
    iget-object p3, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {p3}, Ll/ۘۖ֫;->ۨ(Ll/ۘۖ֫;)Ll/ۜۖ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۜۖ֫;->᩸()V

    .line 620
    invoke-static {p3}, Ll/ۘۖ֫;->ܶ(Ll/ۘۖ֫;)Ll/ۢ۬֫;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p3}, Ll/ۘۖ֫;->ܶ(Ll/ۘۖ֫;)Ll/ۢ۬֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ۬֫;->᩻()V

    .line 621
    :cond_0
    invoke-static {p3, p2}, Ll/ۘۖ֫;->᩷(Ll/ۘۖ֫;Ljava/lang/String;)V

    .line 622
    invoke-static {p3}, Ll/ۘۖ֫;->۟(Ll/ۘۖ֫;)V

    .line 623
    invoke-static {p3}, Ll/ۘۖ֫;->ۧ(Ll/ۘۖ֫;)Ll/ܽ֫ܳ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p3}, Ll/ۘۖ֫;->ۧ(Ll/ۘۖ֫;)Ll/ܽ֫ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ֫ܳ;->᩷()V

    .line 624
    :cond_1
    invoke-static {p3}, Ll/ۘۖ֫;->ۗ(Ll/ۘۖ֫;)Ll/ۢۖ֫;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p3}, Ll/ۘۖ֫;->ۗ(Ll/ۘۖ֫;)Ll/ۢۖ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۖ֫;->᩷()V

    .line 625
    :cond_2
    invoke-static {p3}, Ll/ۘۖ֫;->ܽ(Ll/ۘۖ֫;)Ll/᩹ۖ֫;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-static {p3}, Ll/ۘۖ֫;->ܽ(Ll/ۘۖ֫;)Ll/᩹ۖ֫;

    move-result-object v0

    invoke-static {v0, v1}, Ll/᩹ۖ֫;->ۙ(Ll/᩹ۖ֫;Ljava/lang/String;)Ljava/lang/String;

    .line 627
    :cond_3
    new-instance v0, Ll/ܽۖ֫;

    invoke-direct {v0}, Ll/ܽۖ֫;-><init>()V

    invoke-static {p3, v0}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;Ll/ܽۖ֫;)V

    .line 628
    invoke-static {p3}, Ll/ۘۖ֫;->ᩳ(Ll/ۘۖ֫;)V

    .line 629
    invoke-static {p3}, Ll/ۘۖ֫;->ܺ(Ll/ۘۖ֫;)Ll/ܰ֫ܳ;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {p3}, Ll/ۘۖ֫;->ܺ(Ll/ۘۖ֫;)Ll/ܰ֫ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܰ֫ܳ;->᩷()V

    .line 630
    :cond_4
    invoke-static {p3}, Ll/ۘۖ֫;->ۛ(Ll/ۘۖ֫;)Ll/᩺ۖ֫;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ۖ֫;->ۧ(Ll/᩺ۖ֫;)I

    move-result v0

    if-ltz v0, :cond_6

    .line 631
    invoke-static {p3, p2}, Ll/ۘۖ֫;->᩸(Ll/ۘۖ֫;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p3}, Ll/᩹ۡ֫;->ۙ(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x11

    const/16 v2, 0x17

    const/16 v3, 0xd

    .line 632
    invoke-static {v3, v0, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    goto :goto_0

    :cond_5
    const/4 v0, -0x1

    .line 631
    :goto_0
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    :cond_6
    if-nez p2, :cond_7

    goto :goto_1

    .line 634
    :cond_7
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 635
    :goto_1
    invoke-static {p3, v1}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;Landroid/net/Uri;)V

    .line 636
    invoke-static {p3, v1}, Ll/ۘۖ֫;->᩷(Ll/ۘۖ֫;Landroid/net/Uri;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    .line 637
    invoke-static {p3, p1, p2}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;ZI)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 683
    iget-object p1, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ll/ۘۖ֫;->᩷(Ll/ۘۖ֫;Ljava/lang/String;)V

    .line 684
    invoke-static {p1}, Ll/ۘۖ֫;->ܰ(Ll/ۘۖ֫;)V

    .line 685
    invoke-static {p1}, Ll/ۘۖ֫;->ۢ(Ll/ۘۖ֫;)V

    if-nez p4, :cond_0

    goto :goto_0

    .line 686
    :cond_0
    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    :goto_0
    invoke-static {p1, p2}, Ll/ۘۖ֫;->᩸(Ll/ۘۖ֫;Landroid/net/Uri;)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    .line 670
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 671
    iget-object p1, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    const/4 p3, 0x0

    invoke-static {p1, p3}, Ll/ۘۖ֫;->᩷(Ll/ۘۖ֫;Ljava/lang/String;)V

    .line 672
    invoke-static {p1}, Ll/ۘۖ֫;->ܰ(Ll/ۘۖ֫;)V

    .line 673
    invoke-static {p1}, Ll/ۘۖ֫;->ۢ(Ll/ۘۖ֫;)V

    .line 674
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ۘۖ֫;->᩸(Ll/ۘۖ֫;Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public final onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 0

    .line 693
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 694
    iget-object p1, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ll/ۘۖ֫;->᩷(Ll/ۘۖ֫;Ljava/lang/String;)V

    .line 695
    invoke-static {p1}, Ll/ۘۖ֫;->ܰ(Ll/ۘۖ֫;)V

    .line 696
    invoke-static {p1}, Ll/ۘۖ֫;->ۢ(Ll/ۘۖ֫;)V

    :cond_0
    return-void
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 0

    .line 703
    iget-object p1, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {p1}, Ll/ۘۖ֫;->ۢ(Ll/ۘۖ֫;)V

    .line 704
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->cancel()V

    return-void
.end method

.method public final onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 1

    .line 710
    iget-object p2, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {p2}, Ll/ۘۖ֫;->᩶(Ll/ۘۖ֫;)V

    .line 711
    invoke-static {p2}, Ll/ۘۖ֫;->ܶ(Ll/ۘۖ֫;)Ll/ۢ۬֫;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Ll/ۘۖ֫;->ܶ(Ll/ۘۖ֫;)Ll/ۢ۬֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ۬֫;->ۤ()V

    .line 712
    :cond_0
    invoke-static {p2}, Ll/ۘۖ֫;->ᩳ(Ll/ۘۖ֫;)V

    .line 713
    invoke-static {p2}, Ll/ۘۖ֫;->ۧ(Ll/ۘۖ֫;)Ll/ܽ֫ܳ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p2}, Ll/ۘۖ֫;->ۧ(Ll/ۘۖ֫;)Ll/ܽ֫ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ֫ܳ;->ۙ()V

    .line 714
    :cond_1
    invoke-static {p2}, Ll/ۘۖ֫;->ۗ(Ll/ۘۖ֫;)Ll/ۢۖ֫;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p2}, Ll/ۘۖ֫;->ۗ(Ll/ۘۖ֫;)Ll/ۢۖ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۖ֫;->ۙ()V

    .line 715
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    .line 717
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 719
    :cond_3
    invoke-virtual {p1}, Landroid/webkit/WebView;->destroy()V

    .line 720
    invoke-static {p2}, Ll/ۘۖ֫;->᩺(Ll/ۘۖ֫;)Landroid/webkit/WebView;

    move-result-object v0

    if-ne v0, p1, :cond_4

    .line 721
    invoke-static {p2}, Ll/ۘۖ֫;->ܿ(Ll/ۘۖ֫;)V

    .line 723
    :cond_4
    invoke-static {p2}, Ll/ۘۖ֫;->ۢ(Ll/ۘۖ֫;)V

    const p1, 0x7f1208d0

    .line 724
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    .line 725
    invoke-virtual {p2}, Landroid/app/Activity;->finish()V

    const/4 p1, 0x1

    return p1
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 4

    .line 587
    iget-object p1, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {p1}, Ll/ۘۖ֫;->ۧ(Ll/ۘۖ֫;)Ll/ܽ֫ܳ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/ۘۖ֫;->ۧ(Ll/ۘۖ֫;)Ll/ܽ֫ܳ;

    move-result-object v0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ll/ܽ֫ܳ;->ۙ(Landroid/net/Uri;Ljava/lang/String;Z)V

    .line 588
    :cond_0
    invoke-static {p1, p2}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 1

    .line 594
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 597
    :cond_0
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p1

    .line 598
    iget-object p2, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {p2, p1}, Ll/ۘۖ֫;->ۤ(Ll/ۘۖ֫;Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 600
    invoke-static {p2}, Ll/ۘۖ֫;->ۡ(Ll/ۘۖ֫;)V

    .line 601
    invoke-static {p2, p1}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;Landroid/net/Uri;)V

    .line 602
    invoke-static {p2, p1}, Ll/ۘۖ֫;->᩷(Ll/ۘۖ֫;Landroid/net/Uri;)V

    :cond_1
    return v0
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 0

    .line 611
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object p2, p0, Ll/۫ۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {p2, p1}, Ll/ۘۖ֫;->ۤ(Ll/ۘۖ֫;Landroid/net/Uri;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 612
    invoke-static {p2}, Ll/ۘۖ֫;->ۡ(Ll/ۘۖ֫;)V

    :cond_0
    return p1
.end method

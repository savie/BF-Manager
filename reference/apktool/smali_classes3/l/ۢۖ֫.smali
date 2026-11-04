.class public final Ll/ۢۖ֫;
.super Ljava/lang/Object;
.source "D6J8"


# instance fields
.field public ֫:Ll/ᩳ۬᩷;

.field public final ۙ:Ll/ۘۖ֫;

.field public final ۚ:Ljava/lang/String;

.field public final ۤ:Ljava/lang/String;

.field public final ۧ:Landroid/webkit/WebView;

.field public final ۫:Ll/ۗᩳ֫;

.field public ܳ:Z

.field public ᩴ:Z

.field public ᩷:Z

.field public ᩸:Ll/ᩳۖ֫;


# direct methods
.method public constructor <init>(Ll/ۘۖ֫;Landroid/webkit/WebView;)V
    .locals 4

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "__mt_print_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "-"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۢۖ֫;->ۤ:Ljava/lang/String;

    .line 35
    new-instance v1, Ll/ۗᩳ֫;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ۗᩳ֫;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, Ll/ۢۖ֫;->۫:Ll/ۗᩳ֫;

    const/4 v1, 0x1

    .line 37
    iput-boolean v1, p0, Ll/ۢۖ֫;->ᩴ:Z

    .line 43
    iput-object p1, p0, Ll/ۢۖ֫;->ۙ:Ll/ۘۖ֫;

    .line 44
    iput-object p2, p0, Ll/ۢۖ֫;->ۧ:Landroid/webkit/WebView;

    const-string p1, "(function(){\'use strict\';if(window!==window.top)return;var prompt=window.prompt;window.print=function(){prompt.call(window,\'"

    const-string v1, "\',\'\');};})();"

    .line 0
    invoke-static {p1, v0, v1}, Ll/ܰ۟ۙ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 46
    iput-object p1, p0, Ll/ۢۖ֫;->ۚ:Ljava/lang/String;

    const-string v0, "DOCUMENT_START_SCRIPT"

    .line 48
    invoke-static {v0}, Ll/ۧ᩻ܺ;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "*"

    .line 50
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 49
    invoke-static {p2, p1, v0}, Ll/ۧ۬᩷;->ۙ(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Set;)Ll/ᩳ۬᩷;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۖ֫;->֫:Ll/ᩳ۬᩷;

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/ۢۖ֫;)V
    .locals 5

    .line 81
    iget-object v0, p0, Ll/ۢۖ֫;->ۧ:Landroid/webkit/WebView;

    iget-object v1, p0, Ll/ۢۖ֫;->ۙ:Ll/ۘۖ֫;

    iget-boolean v2, p0, Ll/ۢۖ֫;->᩷:Z

    if-nez v2, :cond_7

    iget-boolean v2, p0, Ll/ۢۖ֫;->ᩴ:Z

    if-nez v2, :cond_7

    iget-boolean v2, p0, Ll/ۢۖ֫;->ܳ:Z

    if-eqz v2, :cond_7

    iget-object v2, p0, Ll/ۢۖ֫;->᩸:Ll/ᩳۖ֫;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 82
    iput-boolean v2, p0, Ll/ۢۖ֫;->ܳ:Z

    .line 83
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    const-string v2, "print"

    .line 85
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/print/PrintManager;

    if-eqz v2, :cond_5

    .line 87
    invoke-virtual {v0}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 88
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    const v3, 0x7f120093

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 89
    :cond_3
    new-instance v1, Ll/ᩳۖ֫;

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->createPrintDocumentAdapter(Ljava/lang/String;)Landroid/print/PrintDocumentAdapter;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Ll/ᩳۖ֫;-><init>(Ll/ۢۖ֫;Landroid/print/PrintDocumentAdapter;)V

    iput-object v1, p0, Ll/ۢۖ֫;->᩸:Ll/ᩳۖ֫;

    .line 90
    new-instance v0, Landroid/print/PrintAttributes$Builder;

    invoke-direct {v0}, Landroid/print/PrintAttributes$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/print/PrintAttributes$Builder;->build()Landroid/print/PrintAttributes;

    move-result-object v0

    invoke-virtual {v2, v3, v1, v0}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_0

    .line 91
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Print job unavailable"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Print service unavailable"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    :catch_0
    iget-object p0, p0, Ll/ۢۖ֫;->᩸:Ll/ᩳۖ֫;

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ll/ᩳۖ֫;->onFinish()V

    :cond_6
    const p0, 0x7f1208d0

    .line 95
    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    :cond_7
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۤ(Ll/ۢۖ֫;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ۢۖ֫;->᩸:Ll/ᩳۖ֫;

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۢۖ֫;)Ll/ᩳۖ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۖ֫;->᩸:Ll/ᩳۖ֫;

    return-object p0
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 100
    iget-boolean v0, p0, Ll/ۢۖ֫;->᩷:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 101
    iput-boolean v0, p0, Ll/ۢۖ֫;->᩷:Z

    const/4 v0, 0x0

    .line 102
    iput-boolean v0, p0, Ll/ۢۖ֫;->ܳ:Z

    .line 103
    iget-object v0, p0, Ll/ۢۖ֫;->ۧ:Landroid/webkit/WebView;

    iget-object v1, p0, Ll/ۢۖ֫;->۫:Ll/ۗᩳ֫;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 104
    iget-object v0, p0, Ll/ۢۖ֫;->֫:Ll/ᩳ۬᩷;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ᩳ۬᩷;->ۙ()V

    .line 106
    :cond_1
    iget-object v0, p0, Ll/ۢۖ֫;->᩸:Ll/ᩳۖ֫;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/ᩳۖ֫;->onFinish()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 2

    .line 61
    iget-boolean v0, p0, Ll/ۢۖ֫;->᩷:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۢۖ֫;->ۧ:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 62
    iput-boolean p1, p0, Ll/ۢۖ֫;->ᩴ:Z

    .line 64
    iget-object p1, p0, Ll/ۢۖ֫;->֫:Ll/ᩳ۬᩷;

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/ۢۖ֫;->ۚ:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 65
    :cond_1
    iget-boolean p1, p0, Ll/ۢۖ֫;->ܳ:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll/ۢۖ֫;->۫:Ll/ۗᩳ֫;

    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 1

    .line 70
    iget-object v0, p0, Ll/ۢۖ֫;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string p2, ""

    .line 71
    invoke-virtual {p3, p2}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V

    .line 72
    iget-boolean p2, p0, Ll/ۢۖ֫;->᩷:Z

    const/4 p3, 0x1

    if-nez p2, :cond_1

    iget-object p2, p0, Ll/ۢۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-virtual {p2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Landroid/app/Activity;->isDestroyed()Z

    move-result p2

    if-nez p2, :cond_1

    iget-boolean p2, p0, Ll/ۢۖ֫;->ܳ:Z

    if-nez p2, :cond_1

    iget-object p2, p0, Ll/ۢۖ֫;->᩸:Ll/ᩳۖ֫;

    if-nez p2, :cond_1

    .line 73
    iget-object p2, p0, Ll/ۢۖ֫;->ۧ:Landroid/webkit/WebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 74
    iput-boolean p3, p0, Ll/ۢۖ֫;->ܳ:Z

    .line 75
    iget-boolean p1, p0, Ll/ۢۖ֫;->ᩴ:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/ۢۖ֫;->۫:Ll/ۗᩳ֫;

    invoke-virtual {p2, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return p3
.end method

.method public final ᩷()V
    .locals 2

    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Ll/ۢۖ֫;->ᩴ:Z

    const/4 v0, 0x0

    .line 56
    iput-boolean v0, p0, Ll/ۢۖ֫;->ܳ:Z

    .line 57
    iget-object v0, p0, Ll/ۢۖ֫;->ۧ:Landroid/webkit/WebView;

    iget-object v1, p0, Ll/ۢۖ֫;->۫:Ll/ۗᩳ֫;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

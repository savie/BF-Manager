.class public final Ll/ᩳۖ֫;
.super Landroid/print/PrintDocumentAdapter;
.source "D6J8"


# instance fields
.field public final ۙ:Landroid/print/PrintDocumentAdapter;

.field public final synthetic ۤ:Ll/ۢۖ֫;

.field public ᩷:Z


# direct methods
.method public constructor <init>(Ll/ۢۖ֫;Landroid/print/PrintDocumentAdapter;)V
    .locals 0

    .line 114
    iput-object p1, p0, Ll/ᩳۖ֫;->ۤ:Ll/ۢۖ֫;

    invoke-direct {p0}, Landroid/print/PrintDocumentAdapter;-><init>()V

    iput-object p2, p0, Ll/ᩳۖ֫;->ۙ:Landroid/print/PrintDocumentAdapter;

    return-void
.end method


# virtual methods
.method public final onFinish()V
    .locals 3

    .line 133
    iget-object v0, p0, Ll/ᩳۖ֫;->ۤ:Ll/ۢۖ֫;

    iget-boolean v1, p0, Ll/ᩳۖ֫;->᩷:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 134
    iput-boolean v1, p0, Ll/ᩳۖ֫;->᩷:Z

    .line 135
    :try_start_0
    iget-object v1, p0, Ll/ᩳۖ֫;->ۙ:Landroid/print/PrintDocumentAdapter;

    invoke-virtual {v1}, Landroid/print/PrintDocumentAdapter;->onFinish()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    invoke-static {v0}, Ll/ۢۖ֫;->᩷(Ll/ۢۖ֫;)Ll/ᩳۖ֫;

    move-result-object v1

    if-ne v1, p0, :cond_1

    invoke-static {v0}, Ll/ۢۖ֫;->ۤ(Ll/ۢۖ֫;)V

    :cond_1
    :goto_0
    return-void

    :catchall_0
    move-exception v1

    invoke-static {v0}, Ll/ۢۖ֫;->᩷(Ll/ۢۖ֫;)Ll/ᩳۖ֫;

    move-result-object v2

    if-ne v2, p0, :cond_2

    invoke-static {v0}, Ll/ۢۖ֫;->ۤ(Ll/ۢۖ֫;)V

    :cond_2
    throw v1
.end method

.method public final onLayout(Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;Landroid/os/Bundle;)V
    .locals 7

    .line 122
    iget-boolean v0, p0, Ll/ᩳۖ֫;->᩷:Z

    if-eqz v0, :cond_0

    invoke-virtual {p4}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutCancelled()V

    return-void

    .line 123
    :cond_0
    iget-object v1, p0, Ll/ᩳۖ֫;->ۙ:Landroid/print/PrintDocumentAdapter;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Landroid/print/PrintDocumentAdapter;->onLayout(Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;Landroid/os/Bundle;)V

    return-void
.end method

.method public final onStart()V
    .locals 1

    .line 117
    iget-boolean v0, p0, Ll/ᩳۖ֫;->᩷:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ᩳۖ֫;->ۙ:Landroid/print/PrintDocumentAdapter;

    invoke-virtual {v0}, Landroid/print/PrintDocumentAdapter;->onStart()V

    :cond_0
    return-void
.end method

.method public final onWrite([Landroid/print/PageRange;Landroid/os/ParcelFileDescriptor;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$WriteResultCallback;)V
    .locals 1

    .line 128
    iget-boolean v0, p0, Ll/ᩳۖ֫;->᩷:Z

    if-eqz v0, :cond_0

    invoke-virtual {p4}, Landroid/print/PrintDocumentAdapter$WriteResultCallback;->onWriteCancelled()V

    return-void

    .line 129
    :cond_0
    iget-object v0, p0, Ll/ᩳۖ֫;->ۙ:Landroid/print/PrintDocumentAdapter;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/print/PrintDocumentAdapter;->onWrite([Landroid/print/PageRange;Landroid/os/ParcelFileDescriptor;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$WriteResultCallback;)V

    return-void
.end method

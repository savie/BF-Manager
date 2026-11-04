.class public final Ll/᩹᩸ۙ;
.super Ljava/lang/Object;
.source "EB24"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    const-string v0, "EmojiCompat.EmojiCompatInitializer.run"

    .line 130
    sget v1, Ll/᩶ۢ;->ۙ:I

    .line 108
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 131
    invoke-static {}, Ll/֫᩸ۙ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    invoke-static {}, Ll/֫᩸ۙ;->᩸()Ll/֫᩸ۙ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫᩸ۙ;->᩷()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_0
    move-exception v0

    .line 135
    sget v1, Ll/᩶ۢ;->ۙ:I

    .line 119
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 136
    throw v0
.end method

.class public final Ll/ۨ᩸ۚ;
.super Landroid/content/BroadcastReceiver;
.source "Y6Y9"


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 830
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "bin.mt.mcp.ACTION_FAILED_TO_START"

    .line 831
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 832
    invoke-static {}, Ll/ۛ᩸ۚ;->᩷()V

    const-string p1, "error"

    .line 855
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 856
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 857
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(Ljava/lang/CharSequence;)Ll/᩸۠ۧ;

    goto :goto_0

    .line 834
    :cond_0
    invoke-static {}, Ll/ۛ᩸ۚ;->ۙ()Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "bin.mt.mcp.ACTION_STARTED"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 835
    invoke-static {}, Ll/ۛܳۚ;->֫()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 836
    invoke-static {}, Ll/ۛܳۚ;->ۚ()I

    move-result p2

    invoke-static {}, Ll/֡ܳۚ;->᩸()I

    move-result v0

    if-ne p2, v0, :cond_1

    .line 838
    invoke-static {}, Ll/ۛ᩸ۚ;->᩷()V

    goto :goto_0

    .line 839
    :cond_1
    invoke-static {}, Ll/ۛ᩸ۚ;->ۙ()Z

    move-result p2

    const-wide/16 v0, 0x1f4

    if-eqz p2, :cond_2

    const-string p2, "bin.mt.mcp.ACTION_STOPPED"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 840
    invoke-static {}, Ll/ۛ᩸ۚ;->᩷()V

    .line 841
    new-instance p1, Ll/᩵᩸ۚ;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/᩵᩸ۚ;-><init>(I)V

    invoke-static {p1, v0, v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;J)V

    goto :goto_0

    :cond_2
    const-string p2, "android.net.wifi.WIFI_STATE_CHANGED"

    .line 919
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const-string p2, "android.net.wifi.WIFI_AP_STATE_CHANGED"

    .line 920
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const-string p2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 921
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 844
    :cond_3
    new-instance p1, Ll/ۡۤۚ;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/ۡۤۚ;-><init>(I)V

    invoke-static {p1, v0, v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;J)V

    .line 846
    :cond_4
    :goto_0
    invoke-static {}, Ll/ۛ᩸ۚ;->ᩴ()V

    .line 847
    invoke-static {}, Ll/ۛ᩸ۚ;->ۤ()V

    return-void
.end method

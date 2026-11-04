.class public final Ll/ۤ۬᩷;
.super Ljava/lang/Object;
.source "56YS"


# direct methods
.method public static ۙ(Landroid/webkit/WebSettings;)Ll/ۜ۬᩷;
    .locals 3

    .line 1303
    :try_start_0
    invoke-static {}, Ll/ۚۙۤ;->ۤ()Ll/᩹ۗܶ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/᩹ۗܶ;->ۙ(Landroid/webkit/WebSettings;)Ll/ۜ۬᩷;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 1305
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ne v1, v2, :cond_0

    .line 1307
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "android.webkit.WebSettingsWrapper"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 1316
    new-instance p0, Ll/۬۬᩷;

    const/4 v0, 0x0

    .line 46
    invoke-direct {p0, v0}, Ll/ۜ۬᩷;-><init>(Ljava/lang/Object;)V

    return-object p0

    .line 1318
    :cond_0
    throw v0
.end method

.method public static ۙ(Landroid/webkit/WebSettings;I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 313
    sget-object v0, Ll/ᩴۙۤ;->ᩴ:Ll/ۨ۬᩷;

    .line 314
    invoke-virtual {v0}, Ll/ۨ۬᩷;->᩷()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 315
    invoke-static {p0, p1}, Ll/᩶۬᩷;->ۙ(Landroid/webkit/WebSettings;I)V

    return-void

    .line 316
    :cond_0
    invoke-virtual {v0}, Ll/᩺۬᩷;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 317
    invoke-static {p0}, Ll/ۤ۬᩷;->ۙ(Landroid/webkit/WebSettings;)Ll/ۜ۬᩷;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll/ۜ۬᩷;->ۙ(I)V

    return-void

    .line 319
    :cond_1
    invoke-static {}, Ll/ᩴۙۤ;->ۙ()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static ۤ(Landroid/webkit/WebSettings;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 553
    sget-object v0, Ll/ᩴۙۤ;->ܳ:Ll/ܶ۬᩷;

    .line 554
    invoke-virtual {v0}, Ll/᩺۬᩷;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 555
    invoke-static {p0}, Ll/ۤ۬᩷;->ۙ(Landroid/webkit/WebSettings;)Ll/ۜ۬᩷;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۜ۬᩷;->ᩴ()V

    return-void

    .line 557
    :cond_0
    invoke-static {}, Ll/ᩴۙۤ;->ۙ()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static ᩷(Landroid/webkit/WebSettings;)V
    .locals 1

    .line 446
    sget-object v0, Ll/ᩴۙۤ;->ۙ:Ll/ۛ۬᩷;

    .line 447
    invoke-virtual {v0}, Ll/᩺۬᩷;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 448
    invoke-static {p0}, Ll/ۤ۬᩷;->ۙ(Landroid/webkit/WebSettings;)Ll/ۜ۬᩷;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۜ۬᩷;->᩸()V

    return-void

    .line 450
    :cond_0
    invoke-static {}, Ll/ᩴۙۤ;->ۙ()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

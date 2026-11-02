.class public Ll/ۤۙ;
.super Ljava/lang/Object;
.source "N5R1"


# instance fields
.field public final ۖ:Ljava/util/ArrayList;

.field public ۙ:Ljava/util/HashMap;

.field public final ۚ:Ll/᩹ܰ;

.field public final ۨ:Ljava/lang/Object;

.field public final ܰ:Landroid/media/session/MediaController;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/᩹ܰ;)V
    .locals 2

    .line 2007
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1996
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۤۙ;->ۨ:Ljava/lang/Object;

    .line 1998
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۤۙ;->ۖ:Ljava/util/ArrayList;

    .line 2001
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۤۙ;->ۙ:Ljava/util/HashMap;

    .line 2008
    iput-object p2, p0, Ll/ۤۙ;->ۚ:Ll/᩹ܰ;

    .line 2009
    new-instance v0, Landroid/media/session/MediaController;

    .line 2010
    invoke-virtual {p2}, Ll/᩹ܰ;->ۨ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/session/MediaSession$Token;

    invoke-direct {v0, p1, v1}, Landroid/media/session/MediaController;-><init>(Landroid/content/Context;Landroid/media/session/MediaSession$Token;)V

    iput-object v0, p0, Ll/ۤۙ;->ܰ:Landroid/media/session/MediaController;

    .line 2011
    invoke-virtual {p2}, Ll/᩹ܰ;->ۙ()Ll/᩸ۙ;

    move-result-object p1

    if-nez p1, :cond_0

    .line 2269
    new-instance p1, Ll/᩵ۙ;

    invoke-direct {p1, p0}, Ll/᩵ۙ;-><init>(Ll/ۤۙ;)V

    const-string p2, "android.support.v4.media.session.command.GET_EXTRA_BINDER"

    const/4 v1, 0x0

    .line 2231
    invoke-virtual {v0, p2, v1, p1}, Landroid/media/session/MediaController;->sendCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 6

    .line 2274
    iget-object v0, p0, Ll/ۤۙ;->ۚ:Ll/᩹ܰ;

    invoke-virtual {v0}, Ll/᩹ܰ;->ۙ()Ll/᩸ۙ;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 2277
    :cond_0
    iget-object v1, p0, Ll/ۤۙ;->ۖ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ۙ;

    .line 2278
    new-instance v4, Ll/ۡۙ;

    .line 2342
    invoke-direct {v4, v3}, Ll/ᩴۙ;-><init>(Ll/۠ۙ;)V

    .line 2279
    iget-object v5, p0, Ll/ۤۙ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v5, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2280
    iput-object v4, v3, Ll/۠ۙ;->ۙ:Ll/ۘۙ;

    .line 2282
    :try_start_0
    invoke-virtual {v0}, Ll/᩹ܰ;->ۙ()Ll/᩸ۙ;

    move-result-object v3

    invoke-interface {v3, v4}, Ll/᩸ۙ;->ۙ(Ll/ۘۙ;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2289
    :catch_0
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

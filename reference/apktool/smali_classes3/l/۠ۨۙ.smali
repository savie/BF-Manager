.class public final synthetic Ll/۠ۨۙ;
.super Ljava/lang/Object;
.source "R5PD"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic ۙ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠ۨۙ;->ۙ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 2
    iget v0, p0, Ll/۠ۨۙ;->ۙ:I

    packed-switch v0, :pswitch_data_0

    .line 35
    new-instance v0, Ljava/lang/Thread;

    const-string v1, "remote-file-transfer-conflict-timeout"

    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0

    .line 926
    :pswitch_0
    new-instance v0, Ljava/lang/Thread;

    const-string v1, "ExoPlayer:AudioTrackReleaseThread"

    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

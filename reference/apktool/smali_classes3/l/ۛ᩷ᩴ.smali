.class public final synthetic Ll/ۛ᩷ᩴ;
.super Ljava/lang/Object;
.source "S4H6"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic ۙ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛ᩷ᩴ;->ۙ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 2
    iget v0, p0, Ll/ۛ᩷ᩴ;->ۙ:I

    packed-switch v0, :pswitch_data_0

    .line 93
    new-instance v0, Ljava/lang/Thread;

    const-string v1, "MCP file transfer cleanup"

    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 94
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0

    .line 43
    :pswitch_0
    new-instance v0, Ljava/lang/Thread;

    const-string v1, "Search-Highlight-Timer"

    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

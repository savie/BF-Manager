.class public final synthetic Ll/۫ۙۧ;
.super Ljava/lang/Object;
.source "09LR"

# interfaces
.implements Ll/֫ۛᩴ;


# instance fields
.field public final synthetic ܰ:Ll/ܳܶ֫;


# direct methods
.method public synthetic constructor <init>(Ll/ܳܶ֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۙۧ;->ܰ:Ll/ܳܶ֫;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/᩷ۨᩴ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/۫ۙۧ;->ܰ:Ll/ܳܶ֫;

    .line 507
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ᩴ᩷()Ljava/io/BufferedOutputStream;

    move-result-object p1

    .line 508
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ܳܶ֫;->ۙ(Ljava/io/BufferedOutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 509
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception v0

    .line 507
    :try_start_1
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
.end method

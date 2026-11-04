.class public final synthetic Ll/ᩴۛ᩸;
.super Ljava/lang/Object;
.source "75NJ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴۛ᩸;->ܰ:I

    iput-object p2, p0, Ll/ᩴۛ᩸;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/ᩴۛ᩸;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/ᩴۛ᩸;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/۫᩹᩸;

    .line 202
    iget-object v0, v1, Ll/۫᩹᩸;->᩷:Ll/᩹ܽ᩵;

    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "Checkpoint was superseded or discarded"

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Throwable;)V

    return-void

    .line 0
    :pswitch_0
    check-cast v1, Ll/ܿۛ᩸;

    sget v0, Ll/ܿۛ᩸;->֡᩷:I

    const v0, 0x7f0d0053

    .line 249
    invoke-virtual {v1, v0}, Ll/ܿۛ᩸;->᩸(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

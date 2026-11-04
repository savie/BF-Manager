.class public final synthetic Ll/ۙۛ᩸;
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
    iput p1, p0, Ll/ۙۛ᩸;->ܰ:I

    iput-object p2, p0, Ll/ۙۛ᩸;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۙۛ᩸;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۙۛ᩸;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩷᩶᩸;

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۙۛ᩸;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ᩴۧۧ;

    invoke-interface {v0}, Ll/ᩴۧۧ;->ۙ()V

    return-void

    .line 363
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ll/᩷᩶᩸;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ll/ۗܽ᩵;

    .line 66
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 363
    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

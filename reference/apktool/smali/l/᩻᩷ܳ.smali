.class public final synthetic Ll/᩻᩷ܳ;
.super Ljava/lang/Object;
.source "D5GW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩻᩷ܳ;->ܰ:I

    iput-object p2, p0, Ll/᩻᩷ܳ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩻᩷ܳ;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩻᩷ܳ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩻᩷ܳ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩵᩺֫;

    .line 11
    iget-object v1, p0, Ll/᩻᩷ܳ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v1, Ljava/lang/Class;

    .line 16
    invoke-static {v0, v1}, Ll/᩵᩺֫;->ۙ(Ll/᩵᩺֫;Ljava/lang/Class;)V

    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, Ll/᩻᩷ܳ;->᩶:Ljava/lang/Object;

    .line 21
    check-cast v0, Ljava/lang/Runnable;

    .line 23
    iget-object v1, p0, Ll/᩻᩷ܳ;->ܿ:Ljava/lang/Object;

    .line 25
    check-cast v1, Ljava/lang/Runnable;

    .line 1310
    :try_start_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1312
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 1313
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

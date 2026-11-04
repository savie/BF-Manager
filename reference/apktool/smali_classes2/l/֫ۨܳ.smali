.class public final synthetic Ll/֫ۨܳ;
.super Ljava/lang/Object;
.source "123V"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/lang/Object;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/֫ۨܳ;->ܰ:I

    iput-object p1, p0, Ll/֫ۨܳ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/֫ۨܳ;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/֫ۨܳ;->֡:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/֫ۨܳ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/֫ۨܳ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩻ۧܺ;

    .line 11
    iget-object v1, p0, Ll/֫ۨܳ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    iget-object v2, p0, Ll/֫ۨܳ;->֡:Ljava/lang/Object;

    .line 17
    check-cast v2, Ll/ۛᩴۨ;

    .line 100
    invoke-interface {v0}, Ll/۟֡֫;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 101
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 102
    invoke-interface {v2}, Ll/ۛᩴۨ;->cancel()V

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/֫ۨܳ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܺᩳܳ;

    iget-object v1, p0, Ll/֫ۨܳ;->ܿ:Ljava/lang/Object;

    check-cast v1, Ll/۫ۛܳ;

    iget-object v2, p0, Ll/֫ۨܳ;->֡:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Ll/ܺᩳܳ;->ۙ(Ll/ܺᩳܳ;Ll/۫ۛܳ;Ljava/util/ArrayList;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Ll/֫ۨܳ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/۠ۨܳ;

    iget-object v1, p0, Ll/֫ۨܳ;->ܿ:Ljava/lang/Object;

    check-cast v1, Ll/ۖ᩵ܳ;

    iget-object v2, p0, Ll/֫ۨܳ;->֡:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/۠ۨܳ;->ۙ(Ll/۠ۨܳ;Ll/ۖ᩵ܳ;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Ll/֡ۤۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֡ۤۚ;->ܰ:I

    iput-object p2, p0, Ll/֡ۤۚ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/֡ۤۚ;->ܰ:I

    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Ll/֡ۤۚ;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 10
    check-cast v2, Lcom/google/android/material/search/SearchView;

    .line 13
    invoke-static {v2}, Lcom/google/android/material/search/SearchView;->$r8$lambda$dreB4TGol5yqs3ptMQ4DkiyTx48(Lcom/google/android/material/search/SearchView;)V

    return-void

    .line 16
    :pswitch_0
    check-cast v2, Ll/᩷ۨᩴ;

    .line 431
    invoke-static {v2}, Ll/ᩴ᩸۫;->ۙ(Ll/᩷ۨᩴ;)V

    .line 432
    invoke-static {}, Ll/ۛۤۧ;->᩷()V

    .line 433
    invoke-static {}, Ll/᩸ܿܳ;->۫()V

    return-void

    .line 0
    :pswitch_1
    check-cast v2, Ll/ۧܳۚ;

    sget v0, Ll/ۛܳۚ;->ᩳ:I

    .line 274
    invoke-virtual {v2}, Ll/ۧܳۚ;->᩸()V

    .line 275
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Ll/᩹ܳۚ;

    invoke-direct {v2, v1}, Ll/᩹ܳۚ;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 0
    :pswitch_2
    check-cast v2, Ll/ۤۜᩴ;

    invoke-static {v2}, Ll/ۤۜᩴ;->᩷(Ll/ۤۜᩴ;)V

    return-void

    :pswitch_3
    check-cast v2, Ll/᩹ۖ᩸;

    .line 91
    invoke-virtual {v2}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Ll/᩹ۖ᩸;->֡᩸()V

    :cond_0
    return-void

    .line 0
    :pswitch_4
    check-cast v2, Ll/֫ᩳۙ;

    invoke-static {v2}, Ll/֫ᩳۙ;->ۙ(Ll/֫ᩳۙ;)V

    return-void

    :pswitch_5
    check-cast v2, Ll/ܽ֡֫;

    .line 409
    instance-of v0, v2, Ll/᩵᩸ۧ;

    if-eqz v0, :cond_1

    check-cast v2, Ll/᩵᩸ۧ;

    .line 410
    invoke-virtual {v2, v1}, Ll/᩵᩸ۧ;->᩷(Z)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

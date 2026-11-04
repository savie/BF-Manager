.class public final synthetic Ll/ܶ᩷ۚ;
.super Ljava/lang/Object;
.source "J6WT"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܶ᩷ۚ;->ܰ:I

    iput-object p2, p0, Ll/ܶ᩷ۚ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    iget p1, p0, Ll/ܶ᩷ۚ;->ܰ:I

    .line 4
    iget-object p2, p0, Ll/ܶ᩷ۚ;->᩶:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast p2, Lbin/mt/plus/Main;

    .line 261
    new-instance p1, Ll/۬֨ᩴ;

    const v0, 0x7f12057b

    invoke-direct {p1, p2, v0}, Ll/۬֨ᩴ;-><init>(Ll/ܽ֡֫;I)V

    invoke-virtual {p1}, Ll/۬֨ᩴ;->ܳ()V

    .line 262
    sget-object p2, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/۠۠ۧ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Ll/۠۠ۧ;-><init>(ILjava/lang/Object;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 0
    :pswitch_0
    check-cast p2, Ll/֨֫ۧ;

    invoke-static {p2}, Ll/֨֫ۧ;->ۤ(Ll/֨֫ۧ;)V

    return-void

    :pswitch_1
    check-cast p2, Ljava/lang/Runnable;

    .line 77
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void

    .line 0
    :pswitch_2
    check-cast p2, Ll/ۢ۬ۤ;

    sget p1, Ll/ۢ۬ۤ;->ܰ᩷:I

    .line 396
    invoke-virtual {p2}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_3
    check-cast p2, Ll/۠᩷ۚ;

    invoke-static {p2}, Ll/۠᩷ۚ;->ۙ(Ll/۠᩷ۚ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

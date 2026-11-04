.class public final synthetic Ll/۫᩶ۤ;
.super Ljava/lang/Object;
.source "P676"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۫᩶ۤ;->ܰ:I

    iput-object p2, p0, Ll/۫᩶ۤ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    iget v0, p0, Ll/۫᩶ۤ;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/۫᩶ۤ;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ᩳᩴۧ;

    .line 12
    invoke-static {v1, p2}, Ll/ᩳᩴۧ;->ۙ(Ll/ᩳᩴۧ;I)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/ܽ֡֫;

    .line 120
    new-instance p1, Landroid/content/Intent;

    const-class p2, Ll/ۛۘܳ;

    invoke-direct {p1, v1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 121
    invoke-virtual {v1, p1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/ܰۖᩴ;

    invoke-static {v1, p1, p2}, Ll/ܰۖᩴ;->ۙ(Ll/ܰۖᩴ;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_2
    check-cast v1, Ll/᩸ܿۤ;

    sget-boolean p1, Ll/᩸ܿۤ;->ܺ᩷:Z

    .line 260
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Ll/᩺ۙ᩻;
.super Ljava/lang/Object;
.source "Y9AZ"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩺ۙ᩻;->ܰ:I

    iput-object p2, p0, Ll/᩺ۙ᩻;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    iget p1, p0, Ll/᩺ۙ᩻;->ܰ:I

    .line 4
    iget-object p2, p0, Ll/᩺ۙ᩻;->᩶:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast p2, Ll/֨۠᩻;

    .line 11
    sget p1, Ll/֨۠᩻;->ۧ᩷:I

    .line 880
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p1

    const-string v0, "sal2"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    const p1, 0x7f0a003e

    .line 881
    invoke-virtual {p2, p1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 0
    :pswitch_0
    check-cast p2, Ll/֨ܶ;

    sget-object p1, Ll/᩺ܺۧ;->ۡ:Ll/֡ܿ᩹;

    .line 289
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    .line 27
    sget-object p2, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v0, "psri"

    .line 0
    invoke-static {p2, v0, p1}, Ll/ۛ۬ܳ;->ۙ(Ll/ۢ֫ܺ;Ljava/lang/String;Z)V

    return-void

    :pswitch_1
    check-cast p2, Ll/ܽ֡֫;

    .line 58
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Ll/ᩳ֨ܺ;->ۙ(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_2
    check-cast p2, Ljava/lang/Runnable;

    .line 313
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

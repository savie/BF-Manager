.class public final synthetic Ll/۟֨ܳ;
.super Ljava/lang/Object;
.source "O60D"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۟֨ܳ;->ܰ:I

    iput-object p2, p0, Ll/۟֨ܳ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/۟֨ܳ;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 4

    .line 2
    iget v0, p0, Ll/۟֨ܳ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/۟֨ܳ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/۬ᩳܳ;

    .line 11
    iget-object v1, p0, Ll/۟֨ܳ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v1, Ll/۠ۢᩴ;

    .line 16
    invoke-static {v0, v1, p1}, Ll/۬ᩳܳ;->ۙ(Ll/۬ᩳܳ;Ll/۠ۢᩴ;Landroid/content/DialogInterface;)V

    return-void

    .line 19
    :pswitch_0
    iget-object p1, p0, Ll/۟֨ܳ;->᩶:Ljava/lang/Object;

    .line 21
    check-cast p1, Ll/ۢ֨ܳ;

    .line 23
    iget-object v0, p0, Ll/۟֨ܳ;->ܿ:Ljava/lang/Object;

    .line 25
    check-cast v0, Ljava/lang/String;

    .line 92
    iget-object v1, p1, Ll/ۢ֨ܳ;->֨:Ll/֨ܶ;

    sget-object v2, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v2}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v2

    .line 93
    iget-object v3, p1, Ll/ۢ֨ܳ;->ܿ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_0

    .line 94
    iget-object p1, p1, Ll/ۢ֨ܳ;->ᩳ:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    invoke-interface {v2, p1, v0}, Ll/ᩳ֫ܺ;->ۙ(ILjava/lang/String;)Ll/ᩳ֫ܺ;

    .line 97
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "dzds"

    .line 98
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    invoke-interface {v2, p1, v0}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    .line 100
    :cond_1
    invoke-interface {v2}, Ll/ᩳ֫ܺ;->apply()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

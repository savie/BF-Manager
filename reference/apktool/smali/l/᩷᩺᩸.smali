.class public final synthetic Ll/᩷᩺᩸;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩷᩺᩸;->ܰ:I

    iput-object p2, p0, Ll/᩷᩺᩸;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩷᩺᩸;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 2
    iget p1, p0, Ll/᩷᩺᩸;->ܰ:I

    .line 4
    iget-object v0, p0, Ll/᩷᩺᩸;->ܿ:Ljava/lang/Object;

    .line 6
    iget-object v1, p0, Ll/᩷᩺᩸;->᩶:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 11
    check-cast v1, Ll/ۙۘ֫;

    .line 13
    check-cast v0, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    invoke-interface {v0, v1, p2}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;->onClick(Lbin/mt/plugin/api/ui/dialog/PluginDialog;I)V

    return-void

    .line 0
    :pswitch_0
    check-cast v1, Ll/۟ܰ᩸;

    check-cast v0, Landroid/view/MenuItem;

    .line 1023
    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result p1

    const/4 p2, 0x1

    xor-int/2addr p1, p2

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 1024
    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result p1

    sget v0, Ll/ܿۛ᩸;->֡᩷:I

    .line 1539
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v2, "axml_id_2_name"

    .line 0
    invoke-static {v0, v2, p1}, Ll/ۛ۬ܳ;->ۙ(Ll/ۢ֫ܺ;Ljava/lang/String;Z)V

    const/4 p1, 0x0

    const/4 v0, -0x1

    .line 1025
    invoke-virtual {v1, v0, p1, p2}, Ll/۟ܰ᩸;->ۙ(IZZ)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

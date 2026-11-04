.class public final synthetic Ll/֨ܿ᩻;
.super Ljava/lang/Object;
.source "P9S5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֨ܿ᩻;->ܰ:I

    iput-object p2, p0, Ll/֨ܿ᩻;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget p1, p0, Ll/֨ܿ᩻;->ܰ:I

    const/4 v0, 0x1

    .line 5
    iget-object v1, p0, Ll/֨ܿ᩻;->᩶:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 10
    check-cast v1, Ll/ۚ᩷ۧ;

    .line 12
    sget p1, Ll/ۚ᩷ۧ;->᩻᩷:I

    .line 161
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_0
    check-cast v1, Landroid/widget/CheckedTextView;

    sget p1, Ll/۟ۢ֫;->ۡ᩷:I

    .line 2249
    invoke-virtual {v1}, Landroid/widget/CheckedTextView;->isChecked()Z

    move-result p1

    xor-int/2addr p1, v0

    invoke-virtual {v1, p1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/ܽ֡֫;

    .line 222
    new-instance p1, Landroid/content/Intent;

    const-class v2, Ll/ۘ֡ۤ;

    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "fromDialog"

    .line 223
    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 224
    invoke-virtual {v1, p1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 0
    :pswitch_2
    check-cast v1, Ll/᩶ܺܳ;

    invoke-static {v1}, Ll/᩶ܺܳ;->۫(Ll/᩶ܺܳ;)V

    return-void

    :pswitch_3
    check-cast v1, Ll/ۖ֫᩸;

    invoke-static {v1}, Ll/ۖ֫᩸;->᩷(Ll/ۖ֫᩸;)V

    return-void

    :pswitch_4
    check-cast v1, Ll/ۜܿ᩻;

    sget p1, Ll/ۜܿ᩻;->ۙۙ:I

    .line 274
    invoke-virtual {v1, v0}, Ll/ۜܿ᩻;->᩷(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

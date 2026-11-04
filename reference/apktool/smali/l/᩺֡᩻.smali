.class public final synthetic Ll/᩺֡᩻;
.super Ljava/lang/Object;
.source "U2CZ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/᩺֡᩻;->ܰ:I

    iput-object p1, p0, Ll/᩺֡᩻;->᩶:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 0
    iget p1, p0, Ll/᩺֡᩻;->ܰ:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ll/᩺֡᩻;->᩶:Landroid/view/KeyEvent$Callback;

    check-cast p1, Ll/ۛۙ᩸;

    invoke-static {p1}, Ll/ۛۙ᩸;->ۙ(Ll/ۛۙ᩸;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Ll/᩺֡᩻;->᩶:Landroid/view/KeyEvent$Callback;

    check-cast p1, Ll/ܰ֡᩻;

    invoke-static {p1}, Ll/ܰ֡᩻;->ۙ(Ll/ܰ֡᩻;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

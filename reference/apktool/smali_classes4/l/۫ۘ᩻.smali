.class public final synthetic Ll/۫ۘ᩻;
.super Ljava/lang/Object;
.source "A924"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p3, p0, Ll/۫ۘ᩻;->ܰ:I

    iput-object p1, p0, Ll/۫ۘ᩻;->᩶:Landroid/view/KeyEvent$Callback;

    iput-object p2, p0, Ll/۫ۘ᩻;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 2
    iget p1, p0, Ll/۫ۘ᩻;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/۫ۘ᩻;->᩶:Landroid/view/KeyEvent$Callback;

    .line 9
    check-cast p1, Ll/ۜ۫֫;

    .line 11
    iget-object v0, p0, Ll/۫ۘ᩻;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v0, Landroid/view/GestureDetector;

    .line 16
    invoke-static {p1, v0, p2}, Ll/ۜ۫֫;->ۙ(Ll/ۜ۫֫;Landroid/view/GestureDetector;Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    return p1

    .line 20
    :pswitch_0
    iget-object p1, p0, Ll/۫ۘ᩻;->᩶:Landroid/view/KeyEvent$Callback;

    .line 22
    check-cast p1, Landroid/widget/TextView;

    .line 24
    iget-object v0, p0, Ll/۫ۘ᩻;->ܿ:Ljava/lang/Object;

    .line 26
    check-cast v0, Landroid/text/method/MovementMethod;

    .line 140
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p2

    if-nez p2, :cond_0

    .line 141
    invoke-virtual {p1}, Landroid/widget/TextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object p2

    if-eq p2, v0, :cond_0

    .line 142
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

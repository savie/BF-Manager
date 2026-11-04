.class public final synthetic Ll/᩸ܶ᩸;
.super Ljava/lang/Object;
.source "QB32"

# interfaces
.implements Ll/ܶ᩻ۙ;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/᩸ܶ᩸;->ܰ:I

    iput-object p1, p0, Ll/᩸ܶ᩸;->᩶:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩸ܶ᩸;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/᩸ܶ᩸;->᩶:Landroid/view/KeyEvent$Callback;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ۧۤ᩻;

    .line 11
    check-cast p1, Ljava/lang/Boolean;

    .line 13
    sget v0, Ll/ۧۤ᩻;->ۧ᩷:I

    .line 331
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    .line 332
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    goto :goto_1

    .line 0
    :pswitch_0
    check-cast v1, Landroid/widget/ProgressBar;

    check-cast p1, Ljava/lang/Boolean;

    .line 94
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 101
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, p1, :cond_1

    .line 102
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

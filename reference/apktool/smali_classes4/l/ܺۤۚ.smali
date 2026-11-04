.class public final synthetic Ll/ܺۤۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Landroid/view/View;

.field public final synthetic ᩶:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 0
    iput p3, p0, Ll/ܺۤۚ;->ܰ:I

    iput-object p1, p0, Ll/ܺۤۚ;->᩶:Landroid/view/View;

    iput-object p2, p0, Ll/ܺۤۚ;->ܿ:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 4

    .line 2
    iget p1, p0, Ll/ܺۤۚ;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ܺۤۚ;->᩶:Landroid/view/View;

    .line 9
    check-cast p1, Ll/᩹ۖ᩸;

    .line 11
    iget-object v0, p0, Ll/ܺۤۚ;->ܿ:Landroid/view/View;

    .line 13
    check-cast v0, Ll/᩹ۖ᩸;

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    const-string v2, "INTERNAL:Regex"

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ܺۤۚ;->᩶:Landroid/view/View;

    check-cast p1, Ll/֨ܶ;

    iget-object p2, p0, Ll/ܺۤۚ;->ܿ:Landroid/view/View;

    check-cast p2, Ll/֨ܶ;

    invoke-static {p1, p2}, Ll/ۛ᩸ۚ;->ۙ(Ll/֨ܶ;Ll/֨ܶ;)V

    return-void

    :cond_0
    move-object v2, v1

    :goto_0
    const/4 v3, 0x1

    .line 2119
    invoke-virtual {p1, v2, v3}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/String;Z)V

    if-eqz p2, :cond_1

    const-string v1, "INTERNAL:RegexReplacement"

    :cond_1
    invoke-virtual {v0, v1, v3}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/String;Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

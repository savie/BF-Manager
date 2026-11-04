.class public final synthetic Ll/ܳᩳ᩻;
.super Ljava/lang/Object;
.source "W5L3"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳᩳ᩻;->ܰ:I

    iput-object p2, p0, Ll/ܳᩳ᩻;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 2
    iget v0, p0, Ll/ܳᩳ᩻;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/ܳᩳ᩻;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/᩻᩹֫;

    .line 11
    sget p1, Ll/᩻᩹֫;->ᩴ᩷:I

    .line 42
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_0
    check-cast v1, Ll/ۙܶܳ;

    .line 88
    invoke-virtual {v1}, Ll/ۙܶܳ;->run()V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/ۤۜᩴ;

    invoke-static {v1}, Ll/ۤۜᩴ;->ۙ(Ll/ۤۜᩴ;)V

    return-void

    :pswitch_2
    check-cast v1, [I

    const/4 p1, 0x0

    .line 155
    aget v0, v1, p1

    if-nez v0, :cond_0

    .line 811
    invoke-static {}, Ll/ۗۖۧ;->ۚ()Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/᩸ۢۧ;->᩸()Z

    move-result v0

    .line 155
    :goto_0
    const-class v2, Ll/ۗۖۧ;

    if-eqz v0, :cond_2

    .line 156
    aget p1, v1, p1

    if-nez p1, :cond_1

    .line 837
    sget p1, Ll/ۗۖۧ;->֨:I

    .line 124
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object p1

    .line 125
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    goto :goto_1

    .line 839
    :cond_1
    sget p1, Ll/᩸ۢۧ;->֨:I

    .line 87
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object p1

    .line 88
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/᩸ۢۧ;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 89
    invoke-virtual {p1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    goto :goto_1

    .line 158
    :cond_2
    aget p1, v1, p1

    if-nez p1, :cond_3

    .line 826
    sget p1, Ll/ۗۖۧ;->֨:I

    .line 115
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object p1

    .line 116
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 117
    invoke-static {p1, v0}, Ll/۟֡;->ۙ(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_1

    .line 828
    :cond_3
    invoke-static {}, Ll/᩸ۢۧ;->ᩴ()V

    :goto_1
    return-void

    .line 0
    :pswitch_3
    check-cast v1, Ll/᩹ۖ᩸;

    .line 527
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 528
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v0

    .line 529
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v2

    if-le v0, v2, :cond_4

    move v4, v2

    move v2, v0

    move v0, v4

    .line 535
    :cond_4
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v3

    invoke-interface {v3, v0, v2, p1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 536
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    invoke-virtual {v1, p1}, Ll/᩹ۖ᩸;->᩹(I)V

    return-void

    .line 0
    :pswitch_4
    check-cast v1, Ll/ܽᩳ᩻;

    invoke-static {v1}, Ll/ܽᩳ᩻;->ۙ(Ll/ܽᩳ᩻;)V

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

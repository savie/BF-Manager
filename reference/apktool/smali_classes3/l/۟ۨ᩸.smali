.class public final synthetic Ll/۟ۨ᩸;
.super Ljava/lang/Object;
.source "75NJ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۟ۨ᩸;->ܰ:I

    iput-object p2, p0, Ll/۟ۨ᩸;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget p1, p0, Ll/۟ۨ᩸;->ܰ:I

    .line 4
    iget-object v0, p0, Ll/۟ۨ᩸;->᩶:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast v0, Ll/֨ۗ֫;

    .line 11
    sget p1, Ll/֨ۗ֫;->ۗ᩷:I

    .line 74
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_0
    check-cast v0, Ljava/util/ArrayList;

    .line 491
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 492
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/Spanned;

    .line 493
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 495
    :cond_0
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void

    .line 0
    :pswitch_1
    check-cast v0, Ll/ۛۘܳ;

    sget p1, Ll/ۛۘܳ;->۫᩷:I

    .line 105
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_2
    check-cast v0, Ll/᩶ܺܳ;

    invoke-static {v0}, Ll/᩶ܺܳ;->᩸(Ll/᩶ܺܳ;)V

    return-void

    :pswitch_3
    check-cast v0, Ll/ۢ۬ۤ;

    invoke-static {v0}, Ll/ۢ۬ۤ;->ᩴ(Ll/ۢ۬ۤ;)V

    return-void

    :pswitch_4
    check-cast v0, Ll/ۘ֡ۤ;

    sget p1, Ll/ۘ֡ۤ;->ۗ᩷:I

    .line 101
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_5
    check-cast v0, Ll/ܿۛ᩸;

    invoke-static {v0}, Ll/ܿۛ᩸;->ۤ(Ll/ܿۛ᩸;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

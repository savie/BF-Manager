.class public final synthetic Ll/ۧ᩷ܺ;
.super Ljava/lang/Object;
.source "84GP"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧ᩷ܺ;->ܰ:I

    iput-object p2, p0, Ll/ۧ᩷ܺ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۧ᩷ܺ;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget v0, p0, Ll/ۧ᩷ܺ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۧ᩷ܺ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Landroid/widget/TextView;

    .line 11
    iget-object v1, p0, Ll/ۧ᩷ܺ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v1, Ll/ܰ᩷᩸;

    .line 400
    invoke-virtual {v1}, Ll/ܰ᩷᩸;->ۙ()Ll/᩶᩷᩸;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶᩷᩸;->ۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    invoke-virtual {v1}, Ll/ܰ᩷᩸;->ۙ()Ll/᩶᩷᩸;

    move-result-object v2

    sget-object v3, Ll/᩶᩷᩸;->ܳۙ:Ll/᩶᩷᩸;

    if-eq v2, v3, :cond_1

    .line 402
    invoke-virtual {v1}, Ll/ܰ᩷᩸;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, Ll/ۗۡ֫;->ܶۙ:I

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۧ᩷ܺ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܺ᩷ܺ;

    iget-object v1, p0, Ll/ۧ᩷ܺ;->ܿ:Ljava/lang/Object;

    check-cast v1, Ljava/io/IOException;

    .line 42
    invoke-interface {v0, v1}, Ll/ܺ᩷ܺ;->ۙ(Ljava/io/IOException;)V

    return-void

    .line 402
    :cond_0
    sget v1, Ll/ۗۡ֫;->᩸ۙ:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

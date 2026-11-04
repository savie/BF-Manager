.class public final synthetic Ll/᩹ۙ֫;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Ll/ܶ᩻ۙ;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩹ۙ֫;->ܰ:I

    iput-object p2, p0, Ll/᩹ۙ֫;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/᩹ۙ֫;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩹ۙ֫;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ܿܰۧ;

    .line 11
    check-cast p1, Ll/᩵ۗۧ;

    .line 14
    invoke-static {v0, p1}, Ll/ܿܰۧ;->ۙ(Ll/ܿܰۧ;Ll/᩵ۗۧ;)V

    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, Ll/᩹ۙ֫;->᩶:Ljava/lang/Object;

    .line 19
    check-cast v0, Ll/۬ۨۧ;

    .line 21
    check-cast p1, Ljava/lang/String;

    .line 24
    invoke-static {v0}, Ll/۬ۨۧ;->ۙ(Ll/۬ۨۧ;)V

    return-void

    .line 27
    :pswitch_1
    iget-object v0, p0, Ll/᩹ۙ֫;->᩶:Ljava/lang/Object;

    .line 29
    check-cast v0, Ll/ۡۡܳ;

    .line 31
    check-cast p1, Ljava/util/List;

    .line 46
    invoke-virtual {v0}, Ll/ۡۡܳ;->᩸()V

    return-void

    .line 0
    :pswitch_2
    iget-object v0, p0, Ll/᩹ۙ֫;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܳܶ᩸;

    check-cast p1, Ljava/lang/Boolean;

    .line 144
    invoke-virtual {v0}, Ll/ܳܶ᩸;->run()V

    return-void

    .line 0
    :pswitch_3
    iget-object v0, p0, Ll/᩹ۙ֫;->᩶:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TextView;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Ll/ۗ᩷֫;->᩷(Landroid/widget/TextView;Ljava/lang/Integer;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

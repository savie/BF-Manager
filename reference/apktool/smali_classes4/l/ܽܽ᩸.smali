.class public final synthetic Ll/ܽܽ᩸;
.super Ljava/lang/Object;
.source "Q649"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܽܽ᩸;->ܰ:I

    iput-object p2, p0, Ll/ܽܽ᩸;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ܽܽ᩸;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/ܽܽ᩸;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/֡֨᩻;

    .line 12
    invoke-static {v1}, Ll/֡֨᩻;->᩷(Ll/֡֨᩻;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/ܽܰ᩻;

    .line 17
    sget-object p1, Ll/ܽܰ᩻;->֫᩷:Ll/֡֫ܺ;

    .line 49
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/ۜ۫֫;

    invoke-static {v1, p1}, Ll/ۜ۫֫;->ۙ(Ll/ۜ۫֫;Landroid/view/View;)V

    return-void

    :pswitch_2
    check-cast v1, Ll/۬ᩳܳ;

    invoke-static {v1}, Ll/۬ᩳܳ;->ۙ(Ll/۬ᩳܳ;)V

    return-void

    :pswitch_3
    check-cast v1, Ll/ۘܽ᩸;

    sget p1, Ll/ۘܽ᩸;->᩹᩷:I

    .line 90
    invoke-virtual {v1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    invoke-virtual {v1}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p1

    const v0, 0x102000b

    .line 55
    invoke-virtual {p1, v0}, Ll/۠ۖۧ;->ۙ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 56
    invoke-static {p1}, Ll/ܽ۟֫;->᩷(Landroid/view/View;)V

    .line 57
    new-instance v0, Ll/ܳۙܺ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

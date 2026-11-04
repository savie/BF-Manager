.class public final synthetic Ll/ᩳ᩺ۤ;
.super Ljava/lang/Object;
.source "097X"

# interfaces
.implements Ll/ܽۧܺ;
.implements Ll/ܽ۬᩸;
.implements Ll/᩻᩵ܳ;
.implements Ll/ܿ֫ܺ;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩳ᩺ۤ;->ܰ:I

    iput-object p2, p0, Ll/ᩳ᩺ۤ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۙ()Landroid/view/View;
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ᩳ᩺ۤ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܽ֡֫;

    const v1, 0x7f0a051e

    invoke-virtual {v0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public ۙ(I)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ᩳ᩺ۤ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ᩳ᩺ۤ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/۠ܺ۫;

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Ll/ᩳ᩺ۤ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۢ᩺ۤ;

    :goto_0
    invoke-virtual {v0, p1}, Ll/ᩳۜۧ;->ۧ(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ۙ(JJ)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ᩳ᩺ۤ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܺ᩵ܳ;

    invoke-static {v0, p1, p2, p3, p4}, Ll/ܺ᩵ܳ;->᩷(Ll/ܺ᩵ܳ;JJ)V

    return-void
.end method

.method public ۙ(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ᩳ᩺ۤ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܿܰۧ;

    check-cast p1, Ll/᩶᩵ۧ;

    invoke-static {v0, p1}, Ll/ܿܰۧ;->ۙ(Ll/ܿܰۧ;Ll/᩶᩵ۧ;)V

    return-void
.end method

.method public synthetic ۤ()V
    .locals 0

    return-void
.end method

.method public synthetic ᩷()Ll/᩸᩸ᩴ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

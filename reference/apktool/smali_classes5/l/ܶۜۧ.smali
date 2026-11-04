.class public final synthetic Ll/ܶۜۧ;
.super Ljava/lang/Object;
.source "LAXL"

# interfaces
.implements Ll/ܶ᩻ۙ;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܶۜۧ;->ܰ:I

    iput-object p2, p0, Ll/ܶۜۧ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;)V
    .locals 5

    .line 2
    iget v0, p0, Ll/ܶۜۧ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܶۜۧ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/۬ۨۧ;

    .line 11
    check-cast p1, Ljava/lang/String;

    .line 14
    invoke-static {v0, p1}, Ll/۬ۨۧ;->ۙ(Ll/۬ۨۧ;Ljava/lang/String;)V

    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, Ll/ܶۜۧ;->᩶:Ljava/lang/Object;

    .line 19
    check-cast v0, Ll/᩶ܶۧ;

    .line 21
    check-cast p1, Ll/ۧ᩻ۧ;

    .line 24
    invoke-static {v0, p1}, Ll/᩶ܶۧ;->ۙ(Ll/᩶ܶۧ;Ll/ۧ᩻ۧ;)V

    return-void

    .line 27
    :pswitch_1
    iget-object v0, p0, Ll/ܶۜۧ;->᩶:Ljava/lang/Object;

    .line 29
    check-cast v0, [Landroid/view/MenuItem;

    .line 31
    check-cast p1, Ljava/lang/Boolean;

    .line 117
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 118
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 0
    :pswitch_2
    iget-object v0, p0, Ll/ܶۜۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/۠ۖۧ;

    check-cast p1, Ll/۠۠᩻;

    .line 170
    invoke-virtual {p1}, Ll/۠۠᩻;->᩸()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 171
    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

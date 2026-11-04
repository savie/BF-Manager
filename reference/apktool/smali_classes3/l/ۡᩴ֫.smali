.class public final synthetic Ll/ۡᩴ֫;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡᩴ֫;->ܰ:I

    iput-object p2, p0, Ll/ۡᩴ֫;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 2
    iget p1, p0, Ll/ۡᩴ֫;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۡᩴ֫;->᩶:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/۬ۛۧ;

    .line 12
    invoke-static {p1}, Ll/۬ۛۧ;->᩷(Ll/۬ۛۧ;)V

    return-void

    .line 15
    :pswitch_0
    iget-object p1, p0, Ll/ۡᩴ֫;->᩶:Ljava/lang/Object;

    .line 17
    check-cast p1, Ll/᩹ۖ᩸;

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const/16 p2, 0x8

    .line 99
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 0
    :pswitch_1
    iget-object p1, p0, Ll/ۡᩴ֫;->᩶:Ljava/lang/Object;

    check-cast p1, Ll/᩶ᩳۤ;

    .line 267
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v0

    const-string v1, "apk_signature_info_upper_case"

    invoke-interface {v0, v1, p2}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object p2

    invoke-interface {p2}, Ll/ᩳ֫ܺ;->apply()V

    .line 268
    invoke-virtual {p1}, Ll/᩶ᩳۤ;->run()V

    return-void

    .line 0
    :pswitch_2
    iget-object p1, p0, Ll/ۡᩴ֫;->᩶:Ljava/lang/Object;

    check-cast p1, Ll/ۜ۫֫;

    invoke-static {p1, p2}, Ll/ۜ۫֫;->᩷(Ll/ۜ۫֫;Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Ll/᩶ۤۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩶ۤۚ;->ܰ:I

    iput-object p2, p0, Ll/᩶ۤۚ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget v0, p0, Ll/᩶ۤۚ;->ܰ:I

    const/4 v1, 0x1

    .line 5
    iget-object v2, p0, Ll/᩶ۤۚ;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 10
    check-cast v2, Ll/ۛ᩷᩻;

    .line 12
    sget v0, Ll/ۛ᩷᩻;->ܽ᩷:I

    .line 372
    sget-boolean v0, Ll/᩵ۙ᩻;->᩷:Z

    if-eqz v0, :cond_0

    const v0, 0x7f120bfd

    .line 24
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "term_api29_limit"

    invoke-static {v2, v3, v0, v1}, Ll/۫۠ᩴ;->ۙ(Ll/ܽ֡֫;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast v2, Ll/᩻᩹ۧ;

    .line 212
    new-instance v0, Ll/֫ۡۗ;

    invoke-direct {v0, v1}, Ll/֫ۡۗ;-><init>(I)V

    invoke-virtual {v2, v0}, Ll/ۡ֫ۧ;->ۙ(Ljava/util/function/Consumer;)V

    return-void

    .line 0
    :pswitch_1
    check-cast v2, Ll/᩺᩸ۧ;

    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_2
    check-cast v2, Ll/ۧܽ᩸;

    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    return-void

    :pswitch_3
    check-cast v2, Landroid/view/View;

    invoke-static {v2}, Ll/ۛ᩸ۚ;->ۙ(Landroid/view/View;)V

    return-void

    .line 375
    :cond_0
    :goto_0
    new-instance v0, Ll/ܺܳۚ;

    const/4 v1, 0x6

    invoke-direct {v0, v1, v2}, Ll/ܺܳۚ;-><init>(ILjava/lang/Object;)V

    .line 443
    new-instance v1, Ll/ۛۜ᩻;

    const/4 v3, 0x2

    invoke-direct {v1, v3, v2, v0}, Ll/ۛۜ᩻;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

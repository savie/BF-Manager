.class public final synthetic Ll/᩻ۤۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(ILandroid/view/View;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩻ۤۚ;->ܰ:I

    iput-object p2, p0, Ll/᩻ۤۚ;->᩶:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 2
    iget p1, p0, Ll/᩻ۤۚ;->ܰ:I

    .line 4
    iget-object v0, p0, Ll/᩻ۤۚ;->᩶:Landroid/view/View;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast v0, Ll/ۜܿ᩻;

    .line 11
    sget p1, Ll/ۜܿ᩻;->ۙۙ:I

    .line 182
    invoke-virtual {v0}, Ll/ۜܿ᩻;->ۤ()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x0

    .line 183
    invoke-virtual {v0, p1}, Ll/ۜܿ᩻;->ۙ(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 274
    invoke-virtual {v0, p1}, Ll/ۜܿ᩻;->᩷(Z)V

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast v0, Ll/֨ܶ;

    .line 530
    invoke-virtual {v0}, Ll/֨ܶ;->toggle()V

    return-void

    .line 186
    :cond_0
    invoke-virtual {v0}, Ll/ۜܿ᩻;->᩷()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

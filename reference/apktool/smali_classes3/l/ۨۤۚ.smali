.class public final synthetic Ll/ۨۤۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ll/֨ܶ;


# direct methods
.method public synthetic constructor <init>(Ll/֨ܶ;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ۨۤۚ;->ܰ:I

    iput-object p1, p0, Ll/ۨۤۚ;->᩶:Ll/֨ܶ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 2
    iget p1, p0, Ll/ۨۤۚ;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۨۤۚ;->᩶:Ll/֨ܶ;

    .line 403
    invoke-virtual {p1}, Ll/֨ܶ;->toggle()V

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ۨۤۚ;->᩶:Ll/֨ܶ;

    .line 334
    invoke-virtual {p1}, Ll/֨ܶ;->toggle()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

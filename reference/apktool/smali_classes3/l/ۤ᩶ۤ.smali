.class public final synthetic Ll/ۤ᩶ۤ;
.super Ljava/lang/Object;
.source "P676"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۤ᩶ۤ;->ܰ:I

    iput-object p2, p0, Ll/ۤ᩶ۤ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 2
    iget p1, p0, Ll/ۤ᩶ۤ;->ܰ:I

    .line 4
    iget-object v0, p0, Ll/ۤ᩶ۤ;->᩶:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast v0, Ll/֡ۘۧ;

    .line 12
    invoke-static {v0, p2}, Ll/֡ۘۧ;->ۙ(Ll/֡ۘۧ;I)V

    return-void

    .line 15
    :pswitch_0
    check-cast v0, Ll/ۘۢۨ;

    .line 17
    sget-boolean p1, Ll/᩸ܿۤ;->ܺ᩷:Z

    .line 1127
    invoke-virtual {v0}, Ll/ۘۢۨ;->֫()Ll/᩵۠ۨ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩵۠ۨ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

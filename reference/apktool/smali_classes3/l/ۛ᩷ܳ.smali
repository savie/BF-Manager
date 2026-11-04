.class public final synthetic Ll/ۛ᩷ܳ;
.super Ljava/lang/Object;
.source "C5GL"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛ᩷ܳ;->ܰ:I

    iput-object p2, p0, Ll/ۛ᩷ܳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 2
    iget p1, p0, Ll/ۛ᩷ܳ;->ܰ:I

    .line 4
    iget-object v0, p0, Ll/ۛ᩷ܳ;->᩶:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast v0, [I

    .line 11
    sget p1, Ll/ۚۚᩴ;->ۛ᩷:I

    const/4 p1, 0x0

    .line 421
    aput p2, v0, p1

    return-void

    .line 0
    :pswitch_0
    check-cast v0, Ll/ܿۛ᩸;

    const/4 p1, 0x1

    .line 2905
    invoke-virtual {v0, p1}, Ll/ܿۛ᩸;->ۤ(Z)V

    return-void

    .line 0
    :pswitch_1
    check-cast v0, Ll/ᩳ᩷ܳ;

    invoke-static {v0}, Ll/ᩳ᩷ܳ;->ۙ(Ll/ᩳ᩷ܳ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

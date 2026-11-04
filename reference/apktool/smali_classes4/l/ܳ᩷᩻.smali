.class public final synthetic Ll/ܳ᩷᩻;
.super Ljava/lang/Object;
.source "N1TT"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳ᩷᩻;->ܰ:I

    iput-object p2, p0, Ll/ܳ᩷᩻;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    iget p1, p0, Ll/ܳ᩷᩻;->ܰ:I

    .line 4
    iget-object p2, p0, Ll/ܳ᩷᩻;->᩶:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast p2, Ll/ܶ᩶ۧ;

    .line 12
    invoke-static {p2}, Ll/ܶ᩶ۧ;->ۤ(Ll/ܶ᩶ۧ;)V

    return-void

    .line 15
    :pswitch_0
    check-cast p2, [Z

    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x3

    if-ge p1, v1, :cond_1

    .line 79
    aget-boolean v1, p2, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    shl-int/2addr v1, p1

    or-int/2addr v0, v1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 83
    :cond_1
    invoke-static {v0}, Ll/ۘ᩷ۧ;->ۙ(I)V

    return-void

    .line 0
    :pswitch_1
    check-cast p2, Ll/ۛ᩷᩻;

    sget p1, Ll/ۛ᩷᩻;->ܽ᩷:I

    .line 270
    invoke-virtual {p2}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

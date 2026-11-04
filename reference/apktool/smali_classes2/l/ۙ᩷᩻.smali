.class public final synthetic Ll/ۙ᩷᩻;
.super Ljava/lang/Object;
.source "N1TT"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/ܽ֡֫;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p3, p0, Ll/ۙ᩷᩻;->ܰ:I

    iput-object p1, p0, Ll/ۙ᩷᩻;->᩶:Ll/ܽ֡֫;

    iput-object p2, p0, Ll/ۙ᩷᩻;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget v0, p0, Ll/ۙ᩷᩻;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/ۙ᩷᩻;->ܿ:Ljava/lang/Object;

    .line 6
    iget-object v2, p0, Ll/ۙ᩷᩻;->᩶:Ll/ܽ֡֫;

    packed-switch v0, :pswitch_data_0

    .line 11
    check-cast v2, Ll/ۘ֡ۤ;

    .line 13
    check-cast v1, Ll/ܺۢۤ;

    .line 15
    sget p1, Ll/ۘ֡ۤ;->ۗ᩷:I

    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    invoke-static {v2, v1}, Ll/ܽۢۤ;->ۙ(Ll/ܽ֡֫;Ll/ܺۢۤ;)V

    return-void

    .line 0
    :pswitch_0
    check-cast v2, Ll/ۛ᩷᩻;

    check-cast v1, Ll/۠ۖۧ;

    invoke-static {v2, v1, p1}, Ll/ۛ᩷᩻;->ۙ(Ll/ۛ᩷᩻;Ll/۠ۖۧ;Landroid/view/View;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

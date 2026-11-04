.class public final synthetic Ll/ۘۜ᩸;
.super Ljava/lang/Object;
.source "YAH9"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۘۜ᩸;->ܰ:I

    iput-object p2, p0, Ll/ۘۜ᩸;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    iget p1, p0, Ll/ۘۜ᩸;->ܰ:I

    .line 4
    iget-object p2, p0, Ll/ۘۜ᩸;->᩶:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast p2, Ljava/lang/String;

    .line 11
    sget p1, Ll/۫᩹֫;->ۧ᩷:I

    .line 317
    invoke-static {p2}, Ll/᩺᩵֫;->ۤ(Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_0
    check-cast p2, Ljava/lang/Runnable;

    .line 490
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

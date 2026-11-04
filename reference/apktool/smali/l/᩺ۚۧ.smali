.class public final synthetic Ll/᩺ۚۧ;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩺ۚۧ;->ܰ:I

    iput-object p2, p0, Ll/᩺ۚۧ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩺ۚۧ;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 2
    iget v0, p0, Ll/᩺ۚۧ;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/᩺ۚۧ;->ܿ:Ljava/lang/Object;

    .line 6
    iget-object v2, p0, Ll/᩺ۚۧ;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 11
    check-cast v2, Ll/᩹ۖ᩸;

    .line 13
    check-cast v1, [Ljava/lang/String;

    if-nez p2, :cond_0

    const-string p2, ""

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast v2, [Z

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    sget p1, Ll/֨֫ۧ;->ۡ᩷:I

    const/4 p1, 0x0

    .line 896
    aput-boolean p1, v2, p1

    .line 897
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    .line 476
    :cond_0
    aget-object p2, v1, p2

    :goto_0
    invoke-virtual {v2, p2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 477
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

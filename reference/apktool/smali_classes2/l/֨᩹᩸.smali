.class public final synthetic Ll/֨᩹᩸;
.super Ljava/lang/Object;
.source "J6S5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֨᩹᩸;->ܰ:I

    iput-object p2, p0, Ll/֨᩹᩸;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/֨᩹᩸;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget v0, p0, Ll/֨᩹᩸;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/֨᩹᩸;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩸ۢۙ;

    .line 11
    iget-object v1, p0, Ll/֨᩹᩸;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v1, Ll/ܺ᩶ۙ;

    .line 16
    invoke-static {v0, v1}, Ll/᩸ۢۙ;->᩷(Ll/᩸ۢۙ;Ll/ܺ᩶ۙ;)V

    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, Ll/֨᩹᩸;->᩶:Ljava/lang/Object;

    .line 21
    check-cast v0, Ll/ۘ᩵ۙ;

    .line 23
    iget-object v1, p0, Ll/֨᩹᩸;->ܿ:Ljava/lang/Object;

    .line 26
    invoke-static {v0, v1}, Ll/ۘ᩵ۙ;->᩷(Ll/ۘ᩵ۙ;Ljava/lang/Object;)V

    return-void

    .line 29
    :pswitch_1
    iget-object v0, p0, Ll/֨᩹᩸;->᩶:Ljava/lang/Object;

    .line 31
    check-cast v0, Ll/۠᩹᩸;

    .line 33
    iget-object v1, p0, Ll/֨᩹᩸;->ܿ:Ljava/lang/Object;

    .line 35
    check-cast v1, Ll/᩹ܽ᩵;

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    new-instance v2, Ll/ۡ᩹᩸;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0, v1}, Ll/ۡ᩹᩸;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

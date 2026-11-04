.class public final synthetic Ll/֡ۗ᩸;
.super Ljava/lang/Object;
.source "16SF"

# interfaces
.implements Ll/֫ܶ᩵;
.implements Ll/ܺ֨᩸;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֡ۗ᩸;->ܰ:I

    iput-object p2, p0, Ll/֡ۗ᩸;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۙ(Z)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/֡ۗ᩸;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۧܶ᩸;

    invoke-virtual {v0, p1}, Ll/ۧܶ᩸;->ۙ(Z)V

    return-void
.end method

.method public ᩷(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/֡ۗ᩸;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/֡ۗ᩸;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Lbin/mt/plugin/api/util/ResultCallback;

    .line 11
    check-cast p1, Ljava/lang/Void;

    if-nez v0, :cond_0

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/֡ۗ᩸;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/֨ۗ᩸;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p2}, Ll/֨ۗ᩸;->ۙ(Ll/֨ۗ᩸;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 377
    invoke-interface {v0}, Lbin/mt/plugin/api/util/ResultCallback;->onSuccess()V

    goto :goto_0

    .line 378
    :cond_1
    invoke-static {p2}, Ll/᩷᩷ܺ;->᩷(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/util/ResultCallback;->onFailure(Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

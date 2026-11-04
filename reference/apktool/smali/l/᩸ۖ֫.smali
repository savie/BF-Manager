.class public final synthetic Ll/᩸ۖ֫;
.super Ljava/lang/Object;
.source "E72G"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩸ۖ֫;->ܰ:I

    iput-object p2, p0, Ll/᩸ۖ֫;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩸ۖ֫;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 0
    iget v0, p0, Ll/᩸ۖ֫;->ܰ:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/᩸ۖ֫;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܿ۬ۗ;

    iget-object v1, p0, Ll/᩸ۖ֫;->ܿ:Ljava/lang/Object;

    check-cast v1, Ll/᩻ۡۗ;

    check-cast p1, Ll/ܽۡۗ;

    invoke-static {v0, v1, p1}, Ll/ܿ۬ۗ;->ۙ(Ll/ܿ۬ۗ;Ll/᩻ۡۗ;Ll/ܽۡۗ;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/᩸ۖ֫;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۘۖ֫;

    iget-object v1, p0, Ll/᩸ۖ֫;->ܿ:Ljava/lang/Object;

    check-cast v1, Landroid/os/Bundle;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, v1, p1}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;Landroid/os/Bundle;Ljava/lang/Boolean;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.class public final synthetic Ll/ۧ֫᩺;
.super Ljava/lang/Object;
.source "M7E7"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ۧ֫᩺;->ܰ:I

    iput p1, p0, Ll/ۧ֫᩺;->᩶:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۧ֫᩺;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/᩷ۡۗ;

    .line 208
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    .line 209
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 210
    iget v1, p0, Ll/ۧ֫᩺;->᩶:I

    sub-int v1, v0, v1

    invoke-virtual {p1, v1, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    .line 198
    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void

    .line 0
    :pswitch_0
    iget v0, p0, Ll/ۧ֫᩺;->᩶:I

    check-cast p1, Ll/ۤۧ᩺;

    .line 112
    invoke-interface {p1, v0}, Ll/ۤۧ᩺;->ۙ(I)V

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

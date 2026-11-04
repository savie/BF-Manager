.class public final synthetic Ll/ܽ֫᩵;
.super Ljava/lang/Object;
.source "T6GT"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܽ֫᩵;->ܰ:I

    iput-object p2, p0, Ll/ܽ֫᩵;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ܽ֫᩵;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܽ֫᩵;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ljava/util/HashMap;

    .line 11
    check-cast p1, Ll/۟ܺܺ;

    .line 234
    invoke-virtual {p1}, Ll/۟ܺܺ;->᩶()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܽ֫᩵;->᩶:Ljava/lang/Object;

    check-cast v0, Ljava/util/BitSet;

    check-cast p1, Ll/᩷ۡۗ;

    .line 983
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۤۙ()Ll/᩷ۡۗ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 985
    invoke-virtual {p1}, Ll/᩷ۡۗ;->᩷ۙ()Ljava/util/BitSet;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 986
    invoke-virtual {p1}, Ll/᩷ۡۗ;->getId()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->clear(I)V

    :cond_0
    return-void

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

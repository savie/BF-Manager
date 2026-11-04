.class public final synthetic Ll/ܺ۬ۗ;
.super Ljava/lang/Object;
.source "Z6F5"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ll/ۖۡۗ;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ll/ۖۡۗ;I)V
    .locals 0

    .line 0
    iput p3, p0, Ll/ܺ۬ۗ;->ܰ:I

    iput-object p1, p0, Ll/ܺ۬ۗ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/ܺ۬ۗ;->ܿ:Ll/ۖۡۗ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    iget v0, p0, Ll/ܺ۬ۗ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܺ۬ۗ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 11
    check-cast p1, Ll/᩷ۡۗ;

    .line 136
    new-instance v1, Ljava/util/BitSet;

    iget-object v2, p0, Ll/ܺ۬ۗ;->ܿ:Ll/ۖۡۗ;

    invoke-virtual {v2}, Ll/ۖۡۗ;->ۢۙ()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/BitSet;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܺ۬ۗ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܶ۬ۗ;

    iget-object v1, p0, Ll/ܺ۬ۗ;->ܿ:Ll/ۖۡۗ;

    check-cast p1, Ll/ᩳۡۗ;

    invoke-static {v0, v1, p1}, Ll/ܶ۬ۗ;->ۙ(Ll/ܶ۬ۗ;Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

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

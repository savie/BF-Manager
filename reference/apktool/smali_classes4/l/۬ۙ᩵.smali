.class public final synthetic Ll/۬ۙ᩵;
.super Ljava/lang/Object;
.source "Q6FB"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ll/᩷ۡۗ;

    .line 849
    sget-object v0, Ll/ۧ۟ۗ;->ܰ:Ll/ۧ۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    .line 850
    sget-object v0, Ll/֫۟ۗ;->ܿۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    .line 851
    sget-object v0, Ll/֫۟ۗ;->᩶ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    const/4 v0, 0x0

    .line 852
    invoke-virtual {p1, v0}, Ll/᩷ۡۗ;->᩷(Ljava/util/BitSet;)V

    .line 853
    invoke-virtual {p1, v0}, Ll/᩷ۡۗ;->ۤ(Ll/᩷ۡۗ;)V

    .line 854
    invoke-virtual {p1, v0}, Ll/᩷ۡۗ;->ۙ(Ljava/util/BitSet;)V

    .line 855
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

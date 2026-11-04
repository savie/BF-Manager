.class public final synthetic Ll/᩷ۖۗ;
.super Ljava/lang/Object;
.source "36DM"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ll/ܺ۟ۗ;


# direct methods
.method public synthetic constructor <init>(Ll/ܺ۟ۗ;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/᩷ۖۗ;->ܰ:I

    iput-object p1, p0, Ll/᩷ۖۗ;->᩶:Ll/ܺ۟ۗ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    iget v0, p0, Ll/᩷ۖۗ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩷ۖۗ;->᩶:Ll/ܺ۟ۗ;

    .line 9
    check-cast v0, Ll/᩷ۡۗ;

    .line 11
    check-cast p1, Ll/᩷ۡۗ;

    .line 305
    invoke-virtual {v0}, Ll/᩷ۡۗ;->᩷ۙ()Ljava/util/BitSet;

    move-result-object v1

    invoke-virtual {p1}, Ll/᩷ۡۗ;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-nez v1, :cond_0

    if-ne v0, p1, :cond_1

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/᩷ۖۗ;->᩶:Ll/ܺ۟ۗ;

    check-cast v0, Ll/֫ۖۗ;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {v0, p1}, Ll/֫ۖۗ;->ۙ(Ll/֫ۖۗ;Ljava/util/Map$Entry;)V

    return-void

    .line 306
    :cond_0
    :goto_0
    sget-object v1, Ll/֫۟ۗ;->ܿۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 307
    sget-object v1, Ll/֫۟ۗ;->᩶ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 309
    invoke-static {p1, v0}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ljava/util/HashSet;

    move-result-object v1

    .line 310
    new-instance v2, Ll/ۧᩳۗ;

    invoke-direct {v2, p1, v0, v1}, Ll/ۧᩳۗ;-><init>(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/HashSet;)V

    .line 311
    sget-object v1, Ll/ۧ۟ۗ;->ܰ:Ll/ۧ۟ۗ;

    invoke-virtual {p1, v1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/lang/Object;)V

    .line 312
    invoke-virtual {v0, v1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/lang/Object;)V

    :cond_1
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

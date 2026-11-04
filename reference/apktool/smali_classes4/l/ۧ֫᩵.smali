.class public final synthetic Ll/ۧ֫᩵;
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
    iput p1, p0, Ll/ۧ֫᩵;->ܰ:I

    iput-object p2, p0, Ll/ۧ֫᩵;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۧ֫᩵;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۧ֫᩵;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ljava/util/HashSet;

    .line 11
    check-cast p1, Ll/ܺ֨ۗ;

    .line 199
    instance-of v1, p1, Ll/ۗ֨ۗ;

    if-eqz v1, :cond_0

    .line 200
    check-cast p1, Ll/ۗ֨ۗ;

    invoke-interface {p1}, Ll/ۗ֨ۗ;->getName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 202
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۧ֫᩵;->᩶:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashSet;

    check-cast p1, Ljava/lang/Long;

    .line 3330
    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/ۧ֫᩵;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۘۖ֫;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;Ljava/lang/String;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Ll/ۧ֫᩵;->᩶:Ljava/lang/Object;

    check-cast v0, Ljava/util/BitSet;

    check-cast p1, Ll/᩷ۡۗ;

    .line 1058
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۜ()Ljava/util/BitSet;

    move-result-object p1

    .line 1059
    invoke-virtual {p1}, Ljava/util/BitSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1060
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
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

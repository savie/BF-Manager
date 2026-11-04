.class public final synthetic Ll/᩶ۚ᩵;
.super Ljava/lang/Object;
.source "Z6H9"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩶ۚ᩵;->ܰ:I

    iput-object p2, p0, Ll/᩶ۚ᩵;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    iget v0, p0, Ll/᩶ۚ᩵;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩶ۚ᩵;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ljava/util/ArrayList;

    .line 11
    check-cast p1, Ljava/lang/String;

    const-string v1, "// =="

    .line 227
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/᩶ۚ᩵;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۗۘۗ;

    check-cast p1, Ll/ܳᩳۗ;

    .line 40
    invoke-virtual {p1}, Ll/ܳᩳۗ;->᩸()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܳᩳۗ;->ۙ()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {v0, v1, p1}, Ll/ۚ۟ۗ;->ۙ(Ll/ۗۘۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/᩶ۚ᩵;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۖۚ᩵;

    check-cast p1, Ljava/util/function/Consumer;

    .line 94
    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v1, "\""

    const-string v2, "\";"

    .line 0
    invoke-static {v1, p1, v2}, Ll/ܰ۟ۙ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 227
    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
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

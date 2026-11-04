.class public final synthetic Ll/۬֨ۗ;
.super Ljava/lang/Object;
.source "E6C8"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۬֨ۗ;->ܰ:I

    iput-object p2, p0, Ll/۬֨ۗ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    iget v0, p0, Ll/۬֨ۗ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/۬֨ۗ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۖۡۗ;

    .line 11
    check-cast p1, Ll/ܿ֨ۗ;

    .line 23
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ll/֫֨ۗ;->᩶()Z

    move-result v1

    if-nez v1, :cond_0

    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Type inference failed for: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ll/ܿ֨ۗ;->ۙ(Ll/ۖۡۗ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/۬֨ۗ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܿۧ᩵;

    check-cast p1, Ll/᩷ۡۗ;

    invoke-virtual {v0, p1}, Ll/ܿۧ᩵;->ۙ(Ll/᩷ۡۗ;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Ll/۬֨ۗ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۙۡۗ;

    check-cast p1, Ll/ᩳۡۗ;

    invoke-virtual {v0, p1}, Ll/ᩳۡۗ;->ۤ(Ll/ᩳۡۗ;)V

    return-void

    .line 27
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ֨ۗ;->ᩴ()Ll/֫֨ۗ;

    move-result-object v0

    if-nez v0, :cond_1

    .line 29
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object p1

    sget-object v0, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    invoke-virtual {p1, v0}, Ll/ۧ֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    :cond_1
    return-void

    nop

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

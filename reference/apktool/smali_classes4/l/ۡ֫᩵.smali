.class public final synthetic Ll/ۡ֫᩵;
.super Ljava/lang/Object;
.source "4IX4"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡ֫᩵;->ܰ:I

    iput-object p2, p0, Ll/ۡ֫᩵;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 2
    iget v0, p0, Ll/ۡ֫᩵;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۡ֫᩵;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/۫ᩴۤ;

    .line 11
    check-cast p1, Ljava/lang/String;

    .line 22
    invoke-virtual {v0}, Ll/۫ᩴۤ;->ܿ()Ll/᩻ᩴۤ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩻ᩴۤ;->ۘ()Ll/᩹ᩴۤ;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۡ֫᩵;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/᩷۠ۗ;

    check-cast p1, Ll/ᩳۡۗ;

    .line 77
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ۤۙ()Z

    move-result v1

    sget-object v2, Ll/ۧ۟ۗ;->ۧ:Ll/ۧ۟ۗ;

    if-nez v1, :cond_0

    invoke-virtual {p1, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 78
    :cond_0
    invoke-virtual {p1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p1

    invoke-static {p1, v0}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1

    .line 25
    :cond_2
    invoke-virtual {p1}, Ll/᩹ᩴۤ;->ۚ()Ll/ۛᩴۤ;

    move-result-object p1

    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

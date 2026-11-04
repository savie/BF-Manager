.class public final synthetic Ll/ܳۜۗ;
.super Ljava/lang/Object;
.source "I6DT"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳۜۗ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۧۗ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    iget v0, p0, Ll/ܳۜۗ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Ll/ᩳۧۗ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {p0}, Ll/ᩳۧۗ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {p0}, Ll/ᩳۧۗ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {p0}, Ll/ᩳۧۗ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {p0}, Ll/ᩳۧۗ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {p0}, Ll/ᩳۧۗ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {p0}, Ll/ᩳۧۗ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۧۗ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 4

    .line 2
    iget v0, p0, Ll/ܳۜۗ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/۟ܿۘ;

    .line 226
    sget-object v0, Ll/᩶ܿۘ;->᩶ۤ:Ll/᩶ܿۘ;

    invoke-virtual {p1, v0}, Ll/۟ܿۘ;->ۙ(Ll/᩶ܿۘ;)Z

    move-result p1

    return p1

    .line 0
    :pswitch_0
    check-cast p1, Ll/᩷ܿ᩺;

    .line 1398
    invoke-virtual {p1}, Ll/᩷ܿ᩺;->ۢۙ()Z

    move-result p1

    return p1

    .line 0
    :pswitch_1
    check-cast p1, Ll/᩸۟᩺;

    .line 273
    iget-object p1, p1, Ll/᩸۟᩺;->᩶:Ll/᩸ܿ᩺;

    invoke-virtual {p1}, Ll/ۧܿ᩺;->ᩳ()J

    move-result-wide v0

    const-wide v2, 0x800000000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    .line 0
    :pswitch_2
    check-cast p1, Ll/ܽۛۨ;

    invoke-static {p1}, Ll/ܽۚۗ;->nonNull(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 38
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    .line 0
    :pswitch_4
    check-cast p1, Ll/᩷ۨᩴ;

    .line 30
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, ".mtd"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1

    .line 0
    :pswitch_5
    check-cast p1, Ll/ܽۡۗ;

    .line 227
    invoke-virtual {p1}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۢᩳۗ;->ۗ()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

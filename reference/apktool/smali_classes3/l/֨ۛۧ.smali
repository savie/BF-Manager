.class public final synthetic Ll/֨ۛۧ;
.super Ljava/lang/Object;
.source "H5HP"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֨ۛۧ;->ܰ:I

    iput-object p2, p0, Ll/֨ۛۧ;->᩶:Ljava/lang/Object;

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
    iget v0, p0, Ll/֨ۛۧ;->ܰ:I

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

    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 5

    .line 2
    iget v0, p0, Ll/֨ۛۧ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/֨ۛۧ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩻ۡۗ;

    .line 11
    check-cast p1, Ll/ܽۡۗ;

    .line 287
    invoke-virtual {p1}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v1

    const/16 v2, 0x8

    const/16 v3, 0x10

    const/4 v4, 0x1

    filled-new-array {v4, v2, v3}, [I

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۢᩳۗ;->ۙ([I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 288
    invoke-virtual {p1}, Ll/ܽۡۗ;->᩺()Ll/۬ᩳۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۬ᩳۗ;->᩸()Ll/֫֨ۗ;

    move-result-object p1

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/֨ۛۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/᩸ۡ֫;

    .line 656
    invoke-virtual {v0, p1}, Ll/᩸ۡ֫;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/֨ۛۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast p1, Ljava/lang/String;

    .line 365
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 366
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    :goto_0
    return p1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    return v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

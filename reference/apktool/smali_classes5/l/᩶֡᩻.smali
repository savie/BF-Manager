.class public final synthetic Ll/᩶֡᩻;
.super Ljava/lang/Object;
.source "53XL"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩶֡᩻;->ܰ:I

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
    iget v0, p0, Ll/᩶֡᩻;->ܰ:I

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

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 3

    .line 2
    iget v0, p0, Ll/᩶֡᩻;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-static {p1}, Ll/ܽۚۗ;->isNull(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 12
    :pswitch_0
    check-cast p1, Ll/ۛۡۗ;

    .line 15
    invoke-static {p1}, Ll/᩵ۧ᩵;->۫(Ll/ۛۡۗ;)Z

    move-result p1

    return p1

    .line 19
    :pswitch_1
    check-cast p1, Ll/ۛ֨ۗ;

    .line 193
    invoke-virtual {p1}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 194
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 197
    :cond_0
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->᩹ۙ()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 200
    :cond_1
    sget-object p1, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, p1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result p1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return p1

    .line 0
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    const/16 v0, 0x2f

    .line 504
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, ".apk"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

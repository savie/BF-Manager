.class public final synthetic Ll/ۤۜۗ;
.super Ljava/lang/Object;
.source "I6DT"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ֡:Ll/֫֨ۗ;

.field public final synthetic ۟:Ll/۬ᩳۗ;

.field public final synthetic ܰ:Ll/᩷ۜۗ;

.field public final synthetic ܿ:Ll/ۖۡۗ;

.field public final synthetic ᩶:Ll/ۖۡۗ;


# direct methods
.method public synthetic constructor <init>(Ll/ۧۜۗ;Ll/᩷ۜۗ;Ll/ۖۡۗ;Ll/ۖۡۗ;Ll/֫֨ۗ;Ll/۬ᩳۗ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۤۜۗ;->ܰ:Ll/᩷ۜۗ;

    iput-object p3, p0, Ll/ۤۜۗ;->᩶:Ll/ۖۡۗ;

    iput-object p4, p0, Ll/ۤۜۗ;->ܿ:Ll/ۖۡۗ;

    iput-object p5, p0, Ll/ۤۜۗ;->֡:Ll/֫֨ۗ;

    iput-object p6, p0, Ll/ۤۜۗ;->۟:Ll/۬ᩳۗ;

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
    .locals 7

    .line 2
    check-cast p1, Ll/ᩳۡۗ;

    .line 690
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v1, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ll/ۤۜۗ;->ܰ:Ll/᩷ۜۗ;

    invoke-virtual {v0, p1}, Ll/᩷ۜۗ;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 691
    iget-object v0, p0, Ll/ۤۜۗ;->᩶:Ll/ۖۡۗ;

    iget-object v1, p0, Ll/ۤۜۗ;->ܿ:Ll/ۖۡۗ;

    if-nez v0, :cond_0

    .line 692
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v2

    .line 709
    iget-object v3, p0, Ll/ۤۜۗ;->֡:Ll/֫֨ۗ;

    invoke-static {v2, v3}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v4

    .line 711
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v3}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v3

    const-string v6, "values"

    .line 708
    invoke-static {v2, v4, v6, v5, v3}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)Ll/᩷ۢۗ;

    move-result-object v2

    goto :goto_0

    .line 693
    :cond_0
    invoke-virtual {v0}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v2

    .line 694
    :goto_0
    new-instance v3, Ll/᩶ۢۗ;

    sget-object v4, Ll/֡ۢۗ;->ۢ:Ll/֡ۢۗ;

    const/4 v5, 0x0

    invoke-direct {v3, v2, v4, v5}, Ll/᩶ۢۗ;-><init>(Ll/᩷ۢۗ;Ll/֡ۢۗ;I)V

    .line 695
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    if-nez v0, :cond_1

    .line 698
    sget-object p1, Ll/֫۟ۗ;->᩵ۙ:Ll/֫۟ۗ;

    invoke-virtual {v3, p1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 700
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Replace access to removed values field ("

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۤۜۗ;->۟:Ll/۬ᩳۗ;

    invoke-virtual {v0}, Ll/۬ᩳۗ;->ۤ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") with \'values()\' method"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    return-object v3

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

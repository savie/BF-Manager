.class public final Ll/ܰܿۗ;
.super Ljava/lang/Object;
.source "H6IG"

# interfaces
.implements Ljava/util/function/BiFunction;


# instance fields
.field public ܰ:I


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/BiFunction;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۗۧۗ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 105
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ll/ۧܰۗ;

    .line 110
    sget-object v0, Ll/᩶ܿۗ;->ۙ:[I

    invoke-interface {p2}, Ll/ۧܰۗ;->ۘ()Ll/֫ܰۗ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v0, v1

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v1, v2, :cond_2

    const/4 p2, 0x4

    if-eq v1, p2, :cond_0

    goto :goto_0

    .line 122
    :cond_0
    iget p2, p0, Ll/ܰܿۗ;->ܰ:I

    if-nez p2, :cond_1

    return-object p1

    :cond_1
    sub-int/2addr p2, v3

    .line 125
    iput p2, p0, Ll/ܰܿۗ;->ܰ:I

    goto :goto_0

    .line 112
    :cond_2
    check-cast p2, Ll/ܶܰۗ;

    invoke-virtual {p2}, Ll/ܶܰۗ;->ۤ()Ll/ܺܰۗ;

    move-result-object p1

    .line 113
    invoke-interface {p1}, Ll/ۧܰۗ;->ۘ()Ll/֫ܰۗ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v3, :cond_3

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    goto :goto_0

    .line 116
    :cond_3
    iget p1, p0, Ll/ܰܿۗ;->ܰ:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ܰܿۗ;->ܰ:I

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.class public final Ll/ۢۢۚ;
.super Ljava/lang/Object;
.source "26KB"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public ܰ:Ll/ۡۢۚ;

.field public ᩶:Ll/ۡۢۚ;


# direct methods
.method public static bridge synthetic ۙ(Ll/ۢۢۚ;)Ll/ۡۢۚ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۢۚ;->ܰ:Ll/ۡۢۚ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۢۢۚ;)Ll/ۡۢۚ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۢۚ;->᩶:Ll/ۡۢۚ;

    return-object p0
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
    invoke-static {p0}, Ll/ᩳۧۗ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۧۗ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 2

    .line 170
    check-cast p1, [B

    .line 176
    invoke-static {p1}, Ll/۠ۢۚ;->ۙ([B)Ll/ۡۢۚ;

    move-result-object p1

    .line 177
    invoke-virtual {p1}, Ll/ۡۢۚ;->᩷()Ll/ۖۢۚ;

    move-result-object v0

    sget-object v1, Ll/ۖۢۚ;->۟:Ll/ۖۢۚ;

    if-eq v0, v1, :cond_0

    .line 178
    iput-object p1, p0, Ll/ۢۢۚ;->ܰ:Ll/ۡۢۚ;

    const/4 p1, 0x0

    return p1

    .line 181
    :cond_0
    iput-object p1, p0, Ll/ۢۢۚ;->᩶:Ll/ۡۢۚ;

    const/4 p1, 0x1

    return p1
.end method

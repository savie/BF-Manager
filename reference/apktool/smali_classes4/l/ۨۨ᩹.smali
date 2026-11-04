.class public final synthetic Ll/ۨۨ᩹;
.super Ljava/lang/Object;
.source "4CK5"

# interfaces
.implements Ll/᩺۠ۙ;


# direct methods
.method public static ۙ(IILjava/lang/String;)I
    .locals 0

    .line 0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    add-int/2addr p2, p0

    mul-int p2, p2, p1

    return p2
.end method

.method public static ۙ(Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۛۨ᩹;Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 1

    .line 76
    instance-of v0, p1, Ll/ۛۨ᩹;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۛۨ᩹;

    invoke-interface {p0, p1}, Ll/ۛۨ᩹;->ۙ(Ll/ۛۨ᩹;)Ll/᩵ۨ᩹;

    move-result-object p0

    return-object p0

    .line 77
    :cond_0
    invoke-static {p0, p1}, Ll/ۖ۫ۗ;->$default$thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۙ(Ljava/lang/CharSequence;)Ll/ܽܺۗ;
    .locals 0

    .line 0
    invoke-interface {p0}, Ljava/lang/CharSequence;->codePoints()Ljava/util/stream/IntStream;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܺۗ;->convert(Ljava/util/stream/IntStream;)Ll/ܽܺۗ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ۙ(Ll/ۚۖۙ;Ll/ۘᩴ᩷;Ll/ۛ۠ۙ;)Ll/֡۠ۙ;
    .locals 1

    .line 0
    new-instance v0, Ll/ۙ۠ۙ;

    invoke-direct {v0, p1, p2, p3}, Ll/ۙ۠ۙ;-><init>(Ll/ۚۖۙ;Ll/ۘᩴ᩷;Ll/ۛ۠ۙ;)V

    return-object v0
.end method

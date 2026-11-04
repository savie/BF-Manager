.class public final Ll/᩺ۨۨ;
.super Ljava/lang/Object;
.source "74MB"


# static fields
.field public static final synthetic ۙ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "\\p{InCombiningDiacriticalMarks}+"

    .line 203
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ۙ(Ljava/lang/String;C)I
    .locals 3

    .line 1458
    invoke-static {p0}, Ll/᩺ۨۨ;->ۙ(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 1463
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 1464
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne p1, v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public static ۙ(CI)Ljava/lang/String;
    .locals 1

    if-gtz p1, :cond_0

    const-string p0, ""

    return-object p0

    .line 6045
    :cond_0
    new-instance v0, Ljava/lang/String;

    new-array p1, p1, [C

    .line 73
    invoke-static {p1, p0}, Ljava/util/Arrays;->fill([CC)V

    .line 6045
    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ۙ(ILjava/lang/String;)Ljava/lang/String;
    .locals 5

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-gtz p0, :cond_1

    const-string p0, ""

    return-object p0

    .line 6072
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_8

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    const/16 v3, 0x2000

    if-gt p0, v3, :cond_3

    .line 6077
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1, p0}, Ll/᩺ۨۨ;->ۙ(CI)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    mul-int v3, v0, p0

    if-eq v0, v1, :cond_7

    const/4 v4, 0x2

    if-eq v0, v4, :cond_5

    .line 6093
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_0
    if-ge v2, p0, :cond_4

    .line 6095
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6097
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 6084
    :cond_5
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 6085
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    .line 6086
    new-array v1, v3, [C

    mul-int/lit8 p0, p0, 0x2

    sub-int/2addr p0, v4

    :goto_1
    if-ltz p0, :cond_6

    .line 6088
    aput-char v0, v1, p0

    add-int/lit8 v2, p0, 0x1

    .line 6089
    aput-char p1, v1, v2

    add-int/lit8 p0, p0, -0x2

    goto :goto_1

    .line 6091
    :cond_6
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0

    .line 6082
    :cond_7
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1, p0}, Ll/᩺ۨۨ;->ۙ(CI)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_8
    :goto_2
    return-object p1
.end method

.method public static ۙ(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    if-eqz p2, :cond_0

    .line 737
    invoke-static {p2}, Ll/᩹ܺۗ;->of([Ljava/lang/Object;)Ll/᩵ܺۗ;

    move-result-object p2

    const/4 v0, 0x0

    int-to-long v1, v0

    .line 4600
    invoke-interface {p2, v1, v2}, Ll/᩵ܺۗ;->skip(J)Ll/᩵ܺۗ;

    move-result-object p2

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    int-to-long v0, p0

    invoke-interface {p2, v0, v1}, Ll/᩵ܺۗ;->limit(J)Ll/᩵ܺۗ;

    move-result-object p0

    new-instance p2, Ll/ۛۨۨ;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Ll/ۛۨۨ;-><init>(I)V

    .line 4601
    invoke-static {p1, p2}, Ll/ۡۨۨ;->ۙ(Ljava/lang/String;Ljava/util/function/Function;)Ll/ۚܺۗ;

    move-result-object p1

    invoke-interface {p0, p1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_2

    .line 4284
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 4334
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    const/16 v0, 0x10

    .line 712
    invoke-static {p0, v0}, Ll/۬ۚۗ;->spliteratorUnknownSize(Ljava/util/Iterator;I)Ll/۠ۚۗ;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ll/ۨܺۗ;->stream(Ll/۠ۚۗ;Z)Ll/᩵ܺۗ;

    move-result-object p0

    .line 4337
    new-instance v0, Ll/ۛۨۨ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۛۨۨ;-><init>(I)V

    invoke-static {p1, v0}, Ll/ۡۨۨ;->ۙ(Ljava/lang/String;Ljava/util/function/Function;)Ll/ۚܺۗ;

    move-result-object p1

    invoke-interface {p0, p1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 5194
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    :goto_0
    if-nez v1, :cond_1

    return-object p0

    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    add-int/lit8 v2, v1, -0x1

    .line 7965
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const-string v3, "/"

    invoke-virtual {v3, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 7969
    :cond_2
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/util/Collection;C)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_2

    .line 4264
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 4308
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v1, ""

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const/16 v0, 0x10

    .line 712
    invoke-static {p0, v0}, Ll/۬ۚۗ;->spliteratorUnknownSize(Ljava/util/Iterator;I)Ll/۠ۚۗ;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ll/ۨܺۗ;->stream(Ll/۠ۚۗ;Z)Ll/᩵ܺۗ;

    move-result-object p0

    .line 4311
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    .line 1237
    invoke-static {p1, v1}, Ll/ܽۚۗ;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4311
    new-instance v0, Ll/ۛۨۨ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۛۨۨ;-><init>(I)V

    invoke-static {p1, v0}, Ll/ۡۨۨ;->ۙ(Ljava/lang/String;Ljava/util/function/Function;)Ll/ۚܺۗ;

    move-result-object p1

    invoke-interface {p0, p1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/CharSequence;)Z
    .locals 0

    if-eqz p0, :cond_1

    .line 3537
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    .line 117
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 118
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v2, v1

    const/4 v3, 0x0

    :goto_0
    if-gt v3, v2, :cond_2

    const/4 v4, 0x1

    .line 120
    invoke-static {v3, v1, p0, p1, v4}, Ll/ۗۨۨ;->ۙ(IILjava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_1

    return v4

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v0
.end method

.method public static ᩷(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 5194
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    :goto_0
    if-nez v1, :cond_1

    return-object p0

    :cond_1
    :goto_1
    if-eq v0, v1, :cond_2

    .line 8011
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const-string v3, "/"

    invoke-virtual {v3, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 8015
    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.class public final Ll/ۢۚ᩻;
.super Ll/᩻ܺۨ;
.source "86J8"


# instance fields
.field public ۙ:Ll/ۚ᩸᩻;

.field public final ᩷:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/ۢۚ᩻;->᩷:Ljava/lang/CharSequence;

    return-void
.end method

.method public static ۙ(Ljava/lang/CharSequence;IIZ)I
    .locals 3

    const/4 v0, 0x0

    .line 50
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    const/4 v1, 0x1

    if-le p1, v1, :cond_2

    and-int/lit16 v1, v0, 0x3ff

    if-nez v1, :cond_0

    .line 51
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 52
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v2, 0xa

    if-ne v0, v2, :cond_1

    add-int/lit8 p1, p1, -0x1

    :cond_1
    move v0, v1

    goto :goto_0

    .line 54
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ge v0, p1, :cond_5

    add-int/lit8 p1, p2, -0x1

    if-lez p2, :cond_5

    and-int/lit16 p2, v0, 0x3ff

    if-nez p2, :cond_3

    .line 55
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    :cond_3
    add-int/lit8 p2, v0, 0x1

    .line 56
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-eqz p3, :cond_4

    .line 57
    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p2, v1, :cond_4

    .line 58
    invoke-interface {p0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_4

    add-int/lit8 v0, v0, 0x2

    goto :goto_2

    :cond_4
    move v0, p2

    :goto_2
    move p2, p1

    goto :goto_1

    :cond_5
    return v0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)Ll/ۚ᩸᩻;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x1

    :goto_0
    if-ge v0, p2, :cond_4

    .line 66
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v0, v3, :cond_4

    and-int/lit16 v3, v0, 0x3ff

    if-nez v3, :cond_0

    .line 67
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 68
    :cond_0
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0xd

    const/16 v5, 0xa

    if-ne v3, v4, :cond_1

    add-int/lit8 v2, v0, 0x1

    if-ge v2, p2, :cond_2

    .line 70
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-ne v3, v5, :cond_2

    move v0, v2

    goto :goto_1

    :cond_1
    if-ne v3, v5, :cond_3

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 78
    :cond_4
    new-instance p1, Ll/ۚ᩸᩻;

    invoke-direct {p1, v1, v2, p0}, Ll/ۚ᩸᩻;-><init>(IILjava/lang/String;)V

    return-object p1
.end method

.method public static ۙ(IILjava/lang/CharSequence;)Z
    .locals 5

    const/4 v0, 0x0

    if-le p1, p0, :cond_2

    .line 35
    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    sub-int/2addr p1, v1

    const/4 v2, 0x0

    :goto_0
    if-le p1, p0, :cond_1

    .line 37
    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x5c

    if-ne v3, v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    and-int/lit8 p0, v2, 0x1

    if-nez p0, :cond_2

    return v1

    :cond_2
    :goto_1
    return v0
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    const/4 v0, 0x0

    .line 41
    iput-object v0, p0, Ll/ۢۚ᩻;->ۙ:Ll/ۚ᩸᩻;

    return-void
.end method

.method public final ۙ(ILjava/lang/String;)V
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ۢۚ᩻;->ۙ:Ll/ۚ᩸᩻;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۢۚ᩻;->᩷:Ljava/lang/CharSequence;

    invoke-static {p2, v0, p1}, Ll/ۢۚ᩻;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)Ll/ۚ᩸᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۚ᩻;->ۙ:Ll/ۚ᩸᩻;

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ۡܺۨ;Ljava/lang/Object;IILjava/lang/String;Ll/ۢܺۨ;)V
    .locals 0

    .line 21
    iget-object p1, p0, Ll/ۢۚ᩻;->ۙ:Ll/ۚ᩸᩻;

    if-nez p1, :cond_1

    .line 22
    instance-of p1, p2, Ll/۠ܺۨ;

    iget-object p6, p0, Ll/ۢۚ᩻;->᩷:Ljava/lang/CharSequence;

    if-eqz p1, :cond_0

    check-cast p2, Ll/۠ܺۨ;

    invoke-interface {p2}, Ll/۠ܺۨ;->᩸()I

    move-result p1

    if-ltz p1, :cond_0

    .line 23
    invoke-interface {p2}, Ll/۠ܺۨ;->᩸()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-static {p6, p3, p4, p1}, Ll/ۢۚ᩻;->ۙ(Ljava/lang/CharSequence;IIZ)I

    move-result p1

    .line 24
    :goto_0
    invoke-static {p5, p6, p1}, Ll/ۢۚ᩻;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)Ll/ۚ᩸᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۚ᩻;->ۙ:Ll/ۚ᩸᩻;

    :cond_1
    return-void
.end method

.method public final ᩷()V
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۢۚ᩻;->ۙ:Ll/ۚ᩸᩻;

    if-nez v0, :cond_0

    return-void

    :cond_0
    throw v0
.end method

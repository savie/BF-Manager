.class public final Ll/ۘۨۨ;
.super Ll/᩶ۨۨ;
.source "S4VX"


# virtual methods
.method public final ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
    .locals 3

    if-eqz p1, :cond_5

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    if-gez p3, :cond_1

    const/4 p3, 0x0

    .line 154
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x1

    add-int/2addr v0, v1

    if-le p3, v0, :cond_2

    goto :goto_1

    .line 158
    :cond_2
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_3

    return p3

    :cond_3
    :goto_0
    if-ge p3, v0, :cond_5

    .line 162
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-static {p3, v2, p1, p2, v1}, Ll/ۗۨۨ;->ۙ(IILjava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_4

    return p3

    :cond_4
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    const/4 p1, -0x1

    return p1
.end method

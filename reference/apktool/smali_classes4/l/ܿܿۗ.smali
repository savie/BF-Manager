.class public final Ll/ܿܿۗ;
.super Ljava/lang/Object;
.source "H6IG"


# direct methods
.method public static ۙ(Ll/ۖۡۗ;Ll/᩹ۘۗ;)Ljava/lang/String;
    .locals 6

    .line 101
    invoke-interface {p1}, Ll/᩹ۘۗ;->᩷()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-nez v0, :cond_0

    goto :goto_0

    .line 105
    :cond_0
    invoke-interface {p1}, Ll/᩹ۘۗ;->ۙ()Ll/ۛܰۗ;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۚᩳۗ;->ۖ()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    new-instance v4, Ll/ܰܿۗ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 106
    iput v1, v4, Ll/ܰܿۗ;->ܰ:I

    .line 105
    invoke-virtual {v0, v3, v4}, Ll/ۛܰۗ;->ۙ(ILjava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    :goto_0
    const/4 v0, -0x1

    goto :goto_1

    .line 131
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_1
    if-ne v0, v2, :cond_2

    goto :goto_4

    .line 78
    :cond_2
    invoke-virtual {p0}, Ll/ۚᩳۗ;->ۖ()I

    move-result p0

    .line 79
    invoke-interface {p1}, Ll/᩹ۘۗ;->ۙ()Ll/ۛܰۗ;

    move-result-object v3

    invoke-virtual {v3, p0}, Ll/ۛܰۗ;->ۙ(I)Ll/ۧܰۗ;

    move-result-object v3

    .line 80
    instance-of v4, v3, Ll/ܶܰۗ;

    const/16 v5, 0xa

    if-eqz v4, :cond_4

    .line 81
    check-cast v3, Ll/ܶܰۗ;

    invoke-virtual {v3}, Ll/ܶܰۗ;->ۙ()I

    move-result v3

    if-ltz v3, :cond_4

    if-gt v3, p0, :cond_4

    sub-int v1, p0, v3

    .line 84
    invoke-interface {p1}, Ll/᩹ۘۗ;->ۤ()Ljava/lang/String;

    move-result-object v2

    :goto_2
    if-ge v1, p0, :cond_6

    .line 85
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v5, :cond_3

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0xd

    if-ne v3, v4, :cond_6

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 92
    :cond_4
    invoke-interface {p1}, Ll/᩹ۘۗ;->ۤ()Ljava/lang/String;

    move-result-object v3

    .line 42
    invoke-virtual {v3, v5, p0}, Ljava/lang/String;->lastIndexOf(II)I

    move-result p0

    if-ne p0, v2, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v1, p0, 0x1

    :cond_6
    :goto_3
    if-ge v0, v1, :cond_7

    :goto_4
    const-string p0, ""

    return-object p0

    .line 73
    :cond_7
    invoke-interface {p1}, Ll/᩹ۘۗ;->ۤ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

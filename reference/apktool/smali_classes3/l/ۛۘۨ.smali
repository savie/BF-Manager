.class public final Ll/ۛۘۨ;
.super Ll/ۢۘۨ;
.source "62DG"


# virtual methods
.method public final ۙ(Ljava/lang/CharSequence;Ljava/io/StringWriter;)V
    .locals 10

    const/4 v0, 0x0

    .line 77
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_8

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-eq v0, v1, :cond_0

    goto/16 :goto_5

    .line 83
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-interface {p1, v2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 85
    invoke-static {}, Ll/᩺ۘۨ;->ۙ()[C

    move-result-object v0

    .line 1048
    invoke-static {p1}, Ll/᩺ۨۨ;->ۙ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    if-eqz v0, :cond_1

    .line 1863
    invoke-static {v0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_3

    goto :goto_4

    .line 1051
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 1052
    array-length v2, v0

    add-int/lit8 v3, v1, -0x1

    add-int/lit8 v4, v2, -0x1

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v1, :cond_7

    .line 1056
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v2, :cond_6

    .line 1058
    aget-char v8, v0, v7

    if-ne v8, v6, :cond_5

    .line 1059
    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_4

    if-eq v7, v4, :cond_4

    if-ge v5, v3, :cond_5

    add-int/lit8 v8, v7, 0x1

    aget-char v8, v0, v8

    add-int/lit8 v9, v5, 0x1

    invoke-virtual {p1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ne v8, v9, :cond_5

    .line 87
    :cond_4
    invoke-static {}, Ll/᩺ۘۨ;->ۤ()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ll/᩺ۘۨ;->᩷()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/᩶ۨۨ;->ۤ:Ll/᩶ۨۨ;

    invoke-virtual {v2, p1, v0, v1}, Ll/᩶ۨۨ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 89
    :cond_7
    :goto_4
    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 78
    :cond_8
    :goto_5
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

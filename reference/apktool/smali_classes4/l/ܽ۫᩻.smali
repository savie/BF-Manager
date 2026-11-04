.class public final Ll/ܽ۫᩻;
.super Ljava/lang/Object;
.source "46PA"


# direct methods
.method public static ۙ(Ljava/lang/CharSequence;Ll/ۜ᩸᩻;Ll/۬᩸᩻;Z)Ll/ۙۚ᩻;
    .locals 6

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    .line 46
    new-instance p3, Ll/ۢۚ᩻;

    invoke-direct {p3, p0}, Ll/ۢۚ᩻;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    move-object p3, v0

    .line 61
    :goto_0
    invoke-static {p0, p1, p2, v0, p3}, Ll/ܽ۫᩻;->ۙ(Ljava/lang/CharSequence;Ll/ۜ᩸᩻;Ll/۬᩸᩻;Ll/ܰ۫᩻;Ll/ۢۚ᩻;)Ll/ܺ۫᩻;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 62
    sget-object v2, Ll/ۜ᩸᩻;->ܿ:Ll/ۜ᩸᩻;

    if-eq p1, v2, :cond_4

    iget-object v2, v1, Ll/ܺ۫᩻;->᩸:Ll/ۗܺۨ;

    invoke-virtual {v2}, Ll/ۗܺۨ;->᩸()Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2}, Ll/ܰ۫᩻;->ۙ(Ljava/util/ArrayList;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 64
    iget-object v1, v1, Ll/ܺ۫᩻;->ۙ:Ll/ܰ۫᩻;

    const/4 v2, 0x0

    :goto_1
    const/4 v3, 0x3

    if-ge v2, v3, :cond_3

    .line 68
    invoke-static {p0, p1, p2, v1, p3}, Ll/ܽ۫᩻;->ۙ(Ljava/lang/CharSequence;Ll/ۜ᩸᩻;Ll/۬᩸᩻;Ll/ܰ۫᩻;Ll/ۢۚ᩻;)Ll/ܺ۫᩻;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_2

    .line 70
    :cond_1
    iget-object v4, v3, Ll/ܺ۫᩻;->ۙ:Ll/ܰ۫᩻;

    .line 71
    iget-object v5, v3, Ll/ܺ۫᩻;->᩸:Ll/ۗܺۨ;

    invoke-virtual {v5}, Ll/ۗܺۨ;->᩸()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ll/ܰ۫᩻;->ۙ(Ll/ܰ۫᩻;Ljava/util/ArrayList;)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v1, v3

    goto :goto_3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    move-object v1, v4

    goto :goto_1

    :cond_3
    :goto_2
    move-object v1, v0

    :cond_4
    :goto_3
    if-eqz p3, :cond_5

    .line 48
    invoke-virtual {p3}, Ll/ۢۚ᩻;->᩷()V

    :cond_5
    if-nez v1, :cond_6

    return-object v0

    .line 49
    :cond_6
    iget-object p0, v1, Ll/ܺ۫᩻;->᩷:Ll/ۙۚ᩻;

    .line 50
    iget-object p1, v1, Ll/ܺ۫᩻;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ll/ۙۚ᩻;->ۙ(Ljava/util/List;)V

    .line 51
    iget-object p1, p0, Ll/ۙۚ᩻;->ܳ:Ll/ܰ۫᩻;

    invoke-virtual {p0, p1}, Ll/ۙۚ᩻;->ۙ(Ll/ܰ۫᩻;)V

    return-object p0
.end method

.method public static ۙ(Ljava/lang/CharSequence;Ll/ۜ᩸᩻;Ll/۬᩸᩻;Ll/ܰ۫᩻;Ll/ۢۚ᩻;)Ll/ܺ۫᩻;
    .locals 10

    if-eqz p4, :cond_0

    .line 81
    invoke-virtual {p4}, Ll/ۢۚ᩻;->ۙ()V

    .line 82
    :cond_0
    new-instance v0, Ll/ۜ۫᩻;

    invoke-direct {v0, p0}, Ll/ۜ۫᩻;-><init>(Ljava/lang/CharSequence;)V

    .line 83
    new-instance v1, Ll/ۙᩴ᩻;

    invoke-direct {v1, v0}, Ll/ۙᩴ᩻;-><init>(Ll/ܽܺۨ;)V

    .line 84
    new-instance v2, Ll/ۤۚ᩻;

    invoke-direct {v2, v1, v0}, Ll/ۤۚ᩻;-><init>(Ll/ۙᩴ᩻;Ll/ۜ۫᩻;)V

    invoke-virtual {v1, v2}, Ll/ܰܺۨ;->ۙ(Ll/ۜܺۨ;)V

    .line 85
    sget-object v0, Ll/ۜ᩸᩻;->ܿ:Ll/ۜ᩸᩻;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne p1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Ll/᩸ᩴ᩻;->ۙ(Z)V

    .line 86
    invoke-virtual {v1, p3}, Ll/᩸ᩴ᩻;->ۙ(Ll/ܰ۫᩻;)V

    .line 87
    invoke-virtual {v1}, Ll/ۡܺۨ;->ۧ()V

    if-eqz p4, :cond_2

    .line 88
    invoke-virtual {v1, p4}, Ll/ۡܺۨ;->ۙ(Ll/᩻ܺۨ;)V

    .line 89
    :cond_2
    new-instance v0, Ll/᩻۫᩻;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-direct {v0, v1, v4}, Ll/᩻۫᩻;-><init>(Ll/ۙᩴ᩻;I)V

    .line 90
    invoke-virtual {v0}, Ll/ۗܺۨ;->ۤ()V

    if-eqz p4, :cond_6

    .line 92
    invoke-virtual {v0}, Ll/ۗܺۨ;->᩸()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠ܺۨ;

    .line 93
    invoke-static {}, Ll/ۜ۫᩻;->ۤ()V

    .line 94
    invoke-interface {v4}, Ll/۠ܺۨ;->getType()I

    move-result v5

    invoke-interface {v4}, Ll/۠ܺۨ;->᩸()I

    move-result v6

    invoke-interface {v4}, Ll/۠ܺۨ;->ᩴ()I

    move-result v4

    const/4 v7, 0x6

    if-ne v5, v7, :cond_4

    .line 95
    invoke-static {v6, v4, p0}, Ll/ۢۚ᩻;->ۙ(IILjava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_4

    const-string v4, "Unterminated string literal"

    .line 96
    invoke-virtual {p4, v6, v4}, Ll/ۢۚ᩻;->ۙ(ILjava/lang/String;)V

    goto :goto_1

    :cond_4
    const/4 v7, 0x4

    if-ne v5, v7, :cond_3

    sub-int v5, v4, v6

    const/4 v7, 0x3

    if-lt v5, v7, :cond_5

    add-int/lit8 v5, v4, -0x1

    .line 98
    invoke-interface {p0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v7, 0x2a

    if-ne v5, v7, :cond_5

    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v5, 0x2f

    if-eq v4, v5, :cond_3

    :cond_5
    const-string v4, "Unterminated block comment"

    .line 99
    invoke-virtual {p4, v6, v4}, Ll/ۢۚ᩻;->ۙ(ILjava/lang/String;)V

    goto :goto_1

    .line 103
    :cond_6
    new-instance v1, Ll/ۙۚ᩻;

    invoke-virtual {p2}, Ll/۬᩸᩻;->ۤ()I

    move-result v8

    move-object v4, v1

    move-object v5, p0

    move-object v6, v0

    move-object v7, p1

    move-object v9, p3

    invoke-direct/range {v4 .. v9}, Ll/ۙۚ᩻;-><init>(Ljava/lang/CharSequence;Ll/ۗܺۨ;Ll/ۜ᩸᩻;ILl/ܰ۫᩻;)V

    .line 104
    sget-object p0, Ll/ۜ᩸᩻;->ܿ:Ll/ۜ᩸᩻;

    if-ne p1, p0, :cond_7

    new-instance p2, Ll/ۛ۫᩻;

    invoke-direct {p2, v0}, Ll/ۛ۫᩻;-><init>(Ll/ۗܺۨ;)V

    goto :goto_2

    :cond_7
    new-instance p2, Ll/֫۫᩻;

    invoke-direct {p2, v0}, Ll/֫۫᩻;-><init>(Ll/ۗܺۨ;)V

    .line 105
    :goto_2
    new-instance v4, Ll/֨۫᩻;

    .line 50
    new-instance v5, Ll/֡۫᩻;

    invoke-virtual {p2}, Ll/ۡܺۨ;->ۤ()Ll/ۤܽۨ;

    move-result-object v6

    invoke-direct {v5, v6}, Ll/֡۫᩻;-><init>(Ll/ۤܽۨ;)V

    invoke-direct {v4, p2, v5}, Ll/֨۫᩻;-><init>(Ll/ۧ۫᩻;Ll/֡۫᩻;)V

    .line 105
    invoke-virtual {p2, v4}, Ll/ۡܺۨ;->ۙ(Ll/ܺܽۨ;)V

    .line 106
    sget-object v4, Ll/ۜ᩸᩻;->֡:Ll/ۜ᩸᩻;

    if-ne p1, v4, :cond_8

    const/4 v4, 0x1

    goto :goto_3

    :cond_8
    const/4 v4, 0x0

    :goto_3
    invoke-virtual {p2, v4}, Ll/ۧ۫᩻;->ۙ(Z)V

    .line 107
    invoke-virtual {p2, p3}, Ll/ۧ۫᩻;->ۙ(Ll/ܰ۫᩻;)V

    .line 108
    invoke-virtual {p2}, Ll/ۡܺۨ;->ۧ()V

    if-eqz p4, :cond_9

    .line 109
    invoke-virtual {p2, p4}, Ll/ۡܺۨ;->ۙ(Ll/᩻ܺۨ;)V

    .line 110
    :cond_9
    invoke-virtual {p2, v1}, Ll/ۡܺۨ;->ۙ(Ll/᩻ܺۨ;)V

    .line 111
    new-instance p4, Ll/ܿ۫᩻;

    .line 10
    invoke-direct {p4}, Ll/ۨܺۨ;-><init>()V

    .line 111
    invoke-virtual {p2, p4}, Ll/֡ܺۨ;->ۙ(Ll/ۨܺۨ;)V

    if-eq p1, p0, :cond_a

    .line 112
    invoke-virtual {v0}, Ll/ۗܺۨ;->᩸()Ljava/util/ArrayList;

    move-result-object p4

    invoke-static {p4}, Ll/ܰ۫᩻;->ۙ(Ljava/util/ArrayList;)Z

    move-result p4

    if-eqz p4, :cond_a

    const/4 p4, 0x1

    goto :goto_4

    :cond_a
    const/4 p4, 0x0

    .line 113
    :goto_4
    new-instance v4, Ll/᩶۫᩻;

    if-ne p1, p0, :cond_b

    const/4 p0, 0x1

    goto :goto_5

    :cond_b
    const/4 p0, 0x0

    :goto_5
    if-nez p3, :cond_c

    if-nez p4, :cond_d

    :cond_c
    const/4 v2, 0x1

    :cond_d
    invoke-direct {v4, p0, v2, p4}, Ll/᩶۫᩻;-><init>(ZZZ)V

    .line 114
    invoke-virtual {p2}, Ll/֡ܺۨ;->ۨ()V

    .line 115
    invoke-virtual {p2, v4}, Ll/֡ܺۨ;->ۙ(Ll/ۢ᩹ۨ;)V

    .line 117
    :try_start_0
    instance-of p0, p2, Ll/ۛ۫᩻;

    if-eqz p0, :cond_e

    check-cast p2, Ll/ۛ۫᩻;

    invoke-virtual {p2}, Ll/ۛ۫᩻;->۫ۙ()V

    goto :goto_7

    .line 120
    :cond_e
    :goto_6
    invoke-virtual {v0, v3}, Ll/ۗܺۨ;->᩷(I)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_f

    .line 121
    invoke-virtual {v0}, Ll/ۗܺۨ;->index()I

    move-result p0

    .line 122
    move-object p1, p2

    check-cast p1, Ll/֫۫᩻;

    invoke-virtual {p1}, Ll/֫۫᩻;->᩺᩷()V

    .line 123
    invoke-virtual {v0}, Ll/ۗܺۨ;->index()I

    move-result p1

    if-ne p1, p0, :cond_e

    invoke-virtual {v0}, Ll/ۗܺۨ;->᩷()V
    :try_end_0
    .catch Ll/۬۫᩻; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    .line 130
    :cond_f
    :goto_7
    new-instance p0, Ll/ܺ۫᩻;

    invoke-direct {p0, v0, v1, v4}, Ll/ܺ۫᩻;-><init>(Ll/ۗܺۨ;Ll/ۙۚ᩻;Ll/᩶۫᩻;)V

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/CharSequence;Ll/ۜ᩸᩻;Ll/۫᩸᩻;Ll/۬᩸᩻;ZLl/ۤ᩻ᩴ;)V
    .locals 7

    .line 32
    :try_start_0
    invoke-static {}, Ll/ۜ۫᩻;->ۤ()V

    .line 33
    invoke-virtual {p2}, Ll/۫᩸᩻;->ۤ()Z

    move-result v0

    invoke-static {p0, p1, p3, v0}, Ll/ܽ۫᩻;->ۙ(Ljava/lang/CharSequence;Ll/ۜ᩸᩻;Ll/۬᩸᩻;Z)Ll/ۙۚ᩻;

    move-result-object v2

    if-nez v2, :cond_0

    .line 34
    invoke-virtual {p5, p0}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    return-void

    .line 35
    :cond_0
    invoke-static {}, Ll/ۜ۫᩻;->ۤ()V

    .line 36
    new-instance p0, Ll/ۡ۫᩻;

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Ll/ۡ۫᩻;-><init>(Ll/ۙۚ᩻;Ll/۫᩸᩻;Ll/۬᩸᩻;ZLl/ۤ᩻ᩴ;)V

    invoke-virtual {p0}, Ll/ۡ۫᩻;->ۙ()V
    :try_end_0
    .catch Ll/۠۫᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 40
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Source nesting exceeds formatter limit"

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 38
    :catch_1
    new-instance p0, Ljava/lang/InterruptedException;

    const-string p1, "Code transformation cancelled"

    invoke-direct {p0, p1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

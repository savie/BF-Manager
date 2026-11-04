.class public final Ll/ܳܽ᩻;
.super Ljava/lang/Object;
.source "N6PY"


# direct methods
.method public static ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;
    .locals 3

    .line 236
    new-instance v0, Ll/ۤܽ᩻;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2, p1}, Ll/ۤܽ᩻;-><init>(Ll/ᩴܽ᩻;IILjava/lang/String;)V

    return-object v0
.end method

.method public static ۙ(Ljava/lang/CharSequence;Ll/ۙܽ᩻;)Ll/᩸ܽ᩻;
    .locals 3

    .line 105
    new-instance v0, Ll/ۖܺ᩻;

    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 112
    new-instance v1, Ll/ܺܺۨ;

    new-instance v2, Ll/ۡܺ᩻;

    invoke-direct {v2, p1}, Ll/ۡܺ᩻;-><init>(Ll/ۙܽ᩻;)V

    invoke-direct {v1, p0, v2}, Ll/ܺܺۨ;-><init>(Ljava/lang/CharSequence;Ljava/lang/Runnable;)V

    .line 124
    new-instance p0, Ll/۠ܺ᩻;

    new-instance v2, Ll/᩷ܽ᩻;

    invoke-direct {v2, v1, p1}, Ll/᩷ܽ᩻;-><init>(Ll/ܺܺۨ;Ll/ۙܽ᩻;)V

    invoke-direct {p0, v2, p1}, Ll/۠ܺ᩻;-><init>(Ll/ܽܺۨ;Ll/ۙܽ᩻;)V

    .line 113
    invoke-virtual {p0}, Ll/ۡܺۨ;->ۧ()V

    .line 114
    invoke-virtual {p0, v0}, Ll/ۡܺۨ;->ۙ(Ll/᩻ܺۨ;)V

    .line 145
    new-instance v1, Ll/ۜܺ᩻;

    invoke-direct {v1, p0, p1}, Ll/ۜܺ᩻;-><init>(Ll/۬ܺۨ;Ll/ۙܽ᩻;)V

    .line 116
    invoke-virtual {v1}, Ll/ۗܺۨ;->ۤ()V

    .line 165
    new-instance p0, Ll/۬ܺ᩻;

    invoke-direct {p0, v1, p1}, Ll/۬ܺ᩻;-><init>(Ll/ۗܺۨ;Ll/ۙܽ᩻;)V

    .line 118
    invoke-virtual {p0}, Ll/ۡܺۨ;->ۧ()V

    .line 119
    invoke-virtual {p0, v0}, Ll/ۡܺۨ;->ۙ(Ll/᩻ܺۨ;)V

    .line 120
    new-instance p1, Ll/᩸ܽ᩻;

    invoke-virtual {v1}, Ll/ۗܺۨ;->᩸()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ll/۫ۛ᩻;->ۙ᩷()Ll/ۡܶ᩻;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ll/᩸ܽ᩻;-><init>(Ljava/util/ArrayList;Ll/ۡܶ᩻;)V

    return-object p1
.end method

.method public static ۙ(Ljava/lang/CharSequence;ZILl/ۙܽ᩻;ZLl/ۤ᩻ᩴ;)V
    .locals 4

    .line 80
    invoke-static {p0, p3}, Ll/ܳܽ᩻;->ۙ(Ljava/lang/CharSequence;Ll/ۙܽ᩻;)Ll/᩸ܽ᩻;

    move-result-object v0

    .line 81
    new-instance v1, Ll/᩹ۛ᩻;

    invoke-static {v0}, Ll/᩸ܽ᩻;->᩷(Ll/᩸ܽ᩻;)Ljava/util/List;

    move-result-object v2

    invoke-static {v0}, Ll/᩸ܽ᩻;->ۙ(Ll/᩸ܽ᩻;)Ll/۟ܺۨ;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3, p3}, Ll/᩹ۛ᩻;-><init>(Ljava/lang/CharSequence;Ljava/util/List;Ll/۟ܺۨ;Ll/ۙܽ᩻;)V

    const/16 v2, 0x10

    .line 82
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v2, 0x1

    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-virtual {v1, p1, p2, p4, p5}, Ll/᩹ۛ᩻;->ۙ(ZIZLl/ۤ᩻ᩴ;)V

    .line 84
    invoke-interface {p5}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/high16 p2, 0x100000

    if-gt p1, p2, :cond_d

    .line 85
    invoke-virtual {p3}, Ll/ۙܽ᩻;->ۙ()V

    .line 86
    invoke-interface {p5}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 p2, 0x0

    :goto_1
    if-eqz p1, :cond_3

    .line 87
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-ge p2, p4, :cond_3

    and-int/lit16 p1, p2, 0x3ff

    if-nez p1, :cond_1

    .line 88
    invoke-virtual {p3}, Ll/ۙܽ᩻;->ۙ()V

    .line 89
    :cond_1
    invoke-interface {p5, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    invoke-interface {p0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p4

    if-ne p1, p4, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    return-void

    .line 94
    :cond_4
    :try_start_0
    invoke-static {p5, p3}, Ll/ܳܽ᩻;->ۙ(Ljava/lang/CharSequence;Ll/ۙܽ᩻;)Ll/᩸ܽ᩻;

    move-result-object p0
    :try_end_0
    .catch Ll/ۤܽ᩻; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 202
    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 203
    invoke-static {v0}, Ll/᩸ܽ᩻;->ۙ(Ll/᩸ܽ᩻;)Ll/۟ܺۨ;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 204
    invoke-static {p0}, Ll/᩸ܽ᩻;->ۙ(Ll/᩸ܽ᩻;)Ll/۟ܺۨ;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 205
    :cond_5
    :goto_3
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_a

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_a

    .line 206
    invoke-virtual {p3}, Ll/ۙܽ᩻;->ۙ()V

    .line 207
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩳ᩹ۨ;

    .line 208
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/ᩳ᩹ۨ;

    .line 209
    instance-of p5, p0, Ll/۟ܺۨ;

    if-eqz p5, :cond_7

    move-object p5, p0

    check-cast p5, Ll/۟ܺۨ;

    instance-of v0, p4, Ll/۟ܺۨ;

    if-eqz v0, :cond_7

    check-cast p4, Ll/۟ܺۨ;

    .line 210
    invoke-virtual {p5}, Ll/ۖܺۨ;->᩷()I

    move-result p0

    invoke-virtual {p4}, Ll/ۖܺۨ;->᩷()I

    move-result v0

    if-ne p0, v0, :cond_6

    invoke-virtual {p5}, Ll/۟ܺۨ;->getChildCount()I

    move-result p0

    invoke-virtual {p4}, Ll/۟ܺۨ;->getChildCount()I

    move-result v0

    if-ne p0, v0, :cond_6

    .line 213
    invoke-virtual {p5}, Ll/۟ܺۨ;->getChildCount()I

    move-result p0

    sub-int/2addr p0, v2

    :goto_4
    if-ltz p0, :cond_5

    .line 214
    invoke-virtual {p5, p0}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 215
    invoke-virtual {p4, p0}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    add-int/lit8 p0, p0, -0x1

    goto :goto_4

    .line 211
    :cond_6
    sget-object p0, Ll/ᩴܽ᩻;->᩶:Ll/ᩴܽ᩻;

    const-string p1, "Syntax structure changed during formatting"

    invoke-static {p0, p1}, Ll/ܳܽ᩻;->ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;

    move-result-object p0

    throw p0

    .line 217
    :cond_7
    instance-of p5, p0, Ll/֨᩹ۨ;

    if-eqz p5, :cond_9

    check-cast p0, Ll/֨᩹ۨ;

    instance-of p5, p4, Ll/֨᩹ۨ;

    if-eqz p5, :cond_9

    check-cast p4, Ll/֨᩹ۨ;

    .line 218
    invoke-interface {p0}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object p0

    .line 219
    invoke-interface {p4}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object p4

    .line 220
    invoke-interface {p0}, Ll/۠ܺۨ;->getType()I

    move-result p5

    invoke-interface {p4}, Ll/۠ܺۨ;->getType()I

    move-result v0

    if-ne p5, v0, :cond_8

    invoke-interface {p0}, Ll/۠ܺۨ;->getType()I

    move-result p5

    invoke-static {p5}, Ll/ܳܽ᩻;->ۙ(I)Z

    move-result p5

    if-nez p5, :cond_5

    invoke-interface {p0}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p4}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    goto/16 :goto_3

    .line 221
    :cond_8
    sget-object p0, Ll/ᩴܽ᩻;->᩶:Ll/ᩴܽ᩻;

    const-string p1, "Token content changed during formatting"

    invoke-static {p0, p1}, Ll/ܳܽ᩻;->ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;

    move-result-object p0

    throw p0

    .line 224
    :cond_9
    sget-object p0, Ll/ᩴܽ᩻;->᩶:Ll/ᩴܽ᩻;

    const-string p1, "Syntax node changed during formatting"

    invoke-static {p0, p1}, Ll/ܳܽ᩻;->ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;

    move-result-object p0

    throw p0

    .line 227
    :cond_a
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_b

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_b

    .line 101
    invoke-virtual {p3}, Ll/ۙܽ᩻;->ۙ()V

    return-void

    .line 227
    :cond_b
    sget-object p0, Ll/ᩴܽ᩻;->᩶:Ll/ᩴܽ᩻;

    const-string p1, "Syntax length changed"

    invoke-static {p0, p1}, Ll/ܳܽ᩻;->ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;

    move-result-object p0

    throw p0

    :catch_0
    move-exception p0

    .line 97
    iget-object p1, p0, Ll/ۤܽ᩻;->ܿ:Ll/ᩴܽ᩻;

    sget-object p2, Ll/ᩴܽ᩻;->۟:Ll/ᩴܽ᩻;

    if-eq p1, p2, :cond_c

    throw p0

    .line 98
    :cond_c
    sget-object p1, Ll/ᩴܽ᩻;->᩶:Ll/ᩴܽ᩻;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Formatted output could not be parsed: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ܳܽ᩻;->ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;

    move-result-object p0

    throw p0

    .line 84
    :cond_d
    sget-object p0, Ll/ᩴܽ᩻;->֡:Ll/ᩴܽ᩻;

    const-string p1, "Formatted source length limit exceeded"

    invoke-static {p0, p1}, Ll/ܳܽ᩻;->ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۙ(Ljava/lang/CharSequence;ZIZLl/ۤ᩻ᩴ;)V
    .locals 8

    .line 56
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_4

    .line 57
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/high16 v1, 0x100000

    if-gt v0, v1, :cond_3

    .line 58
    new-instance v0, Ll/ۙܽ᩻;

    invoke-direct {v0}, Ll/ۙܽ᩻;-><init>()V

    const/4 v6, 0x0

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v5, v0

    move-object v7, p4

    .line 61
    :try_start_0
    invoke-static/range {v2 .. v7}, Ll/ܳܽ᩻;->ۙ(Ljava/lang/CharSequence;ZILl/ۙܽ᩻;ZLl/ۤ᩻ᩴ;)V
    :try_end_0
    .catch Ll/ۤܽ᩻; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/۟ۚ᩻; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_0
    move-exception v1

    .line 63
    :try_start_1
    iget-object v2, v1, Ll/ۤܽ᩻;->ܿ:Ll/ᩴܽ᩻;

    sget-object v3, Ll/ᩴܽ᩻;->۟:Ll/ᩴܽ᩻;

    if-ne v2, v3, :cond_1

    if-nez p3, :cond_0

    .line 65
    invoke-static {p0, p1, p2, v0, p4}, Ll/֫ۛ᩻;->ۙ(Ljava/lang/CharSequence;ZILl/ۙܽ᩻;Ll/ۤ᩻ᩴ;)V

    return-void

    .line 64
    :cond_0
    iget p1, v1, Ll/ۤܽ᩻;->᩶:I

    iget p2, v1, Ll/ۤܽ᩻;->ܰ:I

    const/4 p3, 0x1

    invoke-static {p0, p1, p2, p3}, Ll/ۢۚ᩻;->ۙ(Ljava/lang/CharSequence;IIZ)I

    move-result p1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p0, p1}, Ll/ۢۚ᩻;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)Ll/ۚ᩸᩻;

    move-result-object p0

    throw p0

    .line 63
    :cond_1
    throw v1
    :try_end_1
    .catch Ll/ۤܽ᩻; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ll/۟ۚ᩻; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/StackOverflowError; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    :catch_1
    sget-object p0, Ll/ᩴܽ᩻;->֡:Ll/ᩴܽ᩻;

    const-string p1, "Parser stack limit exceeded"

    invoke-static {p0, p1}, Ll/ܳܽ᩻;->ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;

    move-result-object p0

    throw p0

    .line 71
    :catch_2
    new-instance p0, Ljava/lang/InterruptedException;

    invoke-direct {p0}, Ljava/lang/InterruptedException;-><init>()V

    throw p0

    :catch_3
    move-exception p0

    .line 68
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->isInterrupted()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p0, Ljava/lang/InterruptedException;

    invoke-direct {p0}, Ljava/lang/InterruptedException;-><init>()V

    throw p0

    .line 69
    :cond_2
    throw p0

    .line 57
    :cond_3
    sget-object p0, Ll/ᩴܽ᩻;->֡:Ll/ᩴܽ᩻;

    const-string p1, "Source length limit exceeded"

    invoke-static {p0, p1}, Ll/ܳܽ᩻;->ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;

    move-result-object p0

    throw p0

    .line 56
    :cond_4
    new-instance p0, Ljava/lang/InterruptedException;

    invoke-direct {p0}, Ljava/lang/InterruptedException;-><init>()V

    throw p0
.end method

.method public static ۙ(I)Z
    .locals 1

    const/16 v0, 0x66

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

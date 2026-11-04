.class public final Ll/֫᩸ܶ;
.super Ljava/lang/Object;
.source "R5PD"


# direct methods
.method public static ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 115
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x46

    if-eq v1, v2, :cond_b

    const/16 v2, 0x4c

    const/4 v3, 0x1

    if-eq v1, v2, :cond_9

    const/16 v2, 0x53

    if-eq v1, v2, :cond_8

    const/16 v2, 0x56

    if-eq v1, v2, :cond_7

    const/16 v2, 0x49

    if-eq v1, v2, :cond_6

    const/16 v2, 0x4a

    if-eq v1, v2, :cond_5

    const/16 v2, 0x5a

    if-eq v1, v2, :cond_4

    const/16 v2, 0x5b

    if-eq v1, v2, :cond_0

    packed-switch v1, :pswitch_data_0

    .line 151
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0

    :pswitch_0
    const-string p0, "double"

    return-object p0

    :pswitch_1
    const-string p0, "char"

    return-object p0

    :pswitch_2
    const-string p0, "byte"

    return-object p0

    .line 140
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v3, v1, :cond_2

    .line 141
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 145
    :cond_2
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/֫᩸ܶ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    if-ge v0, v3, :cond_3

    const-string p0, "[]"

    .line 147
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 149
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    const-string p0, "boolean"

    return-object p0

    :cond_5
    const-string p0, "long"

    return-object p0

    :cond_6
    const-string p0, "int"

    return-object p0

    :cond_7
    const-string p0, "void"

    return-object p0

    :cond_8
    const-string p0, "short"

    return-object p0

    :cond_9
    const/16 v0, 0x2f

    .line 135
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-gez v0, :cond_a

    const/4 v0, 0x1

    goto :goto_3

    :cond_a
    add-int/2addr v0, v3

    .line 0
    :goto_3
    invoke-static {v3, v0, p0}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_b
    const-string p0, "float"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۙ(Ll/ۜ᩶ۗ;Ljava/util/List;)Ll/ᩳۡۗ;
    .locals 4

    .line 53
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    sub-int/2addr v0, v1

    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ܶ()I

    move-result v2

    add-int/2addr v0, v2

    .line 54
    new-instance v2, Ll/ᩳۡۗ;

    sget-object v3, Ll/᩺ۢۗ;->ۖۙ:Ll/᩺ۢۗ;

    invoke-direct {v2, v3, v0}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 55
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩶ۗ;

    invoke-virtual {v0}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 56
    invoke-static {v0, v2, p1, p0}, Ll/֫᩸ܶ;->ۙ(Ljava/lang/String;Ll/ᩳۡۗ;Ljava/util/List;Ll/ۜ᩶ۗ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p0

    .line 63
    new-instance p1, Ll/ᩳۡۗ;

    sget-object v0, Ll/᩺ۢۗ;->᩶ۙ:Ll/᩺ۢۗ;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 64
    sget-object v0, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 65
    new-instance v0, Ll/ܳᩳۗ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to process dynamic string concat: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Ll/ܶۨᩴ;->ۙ(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 65
    invoke-direct {v0, v1, p0}, Ll/ܳᩳۗ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p0, Ll/ۧ۟ۗ;->ۛ:Ll/ۧ۟ۗ;

    invoke-virtual {p1, p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static ۙ(Ljava/lang/String;Ll/ᩳۡۗ;Ljava/util/List;Ll/ۜ᩶ۗ;)V
    .locals 10

    .line 71
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v0, :cond_a

    .line 77
    invoke-virtual {p0, v4}, Ljava/lang/String;->codePointAt(I)I

    move-result v6

    .line 78
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v7

    add-int/2addr v4, v7

    const/4 v7, 0x1

    if-ne v6, v7, :cond_0

    const/4 v8, 0x1

    goto :goto_1

    :cond_0
    const/4 v8, 0x0

    :goto_1
    const/4 v9, 0x2

    if-ne v6, v9, :cond_1

    goto :goto_2

    :cond_1
    const/4 v7, 0x0

    :goto_2
    if-nez v8, :cond_3

    if-eqz v7, :cond_2

    goto :goto_3

    .line 93
    :cond_2
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 82
    :cond_3
    :goto_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-eqz v6, :cond_4

    .line 83
    new-instance v6, Ll/ۚۢۗ;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ll/ۚۢۗ;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object v6

    invoke-virtual {p1, v6}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 84
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    :cond_4
    if-eqz v8, :cond_5

    add-int/lit8 v6, v5, 0x1

    .line 87
    sget-object v7, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    invoke-static {p3, v5, v7}, Ll/ܺ֨ۗ;->ۙ(Ll/ۜ᩶ۗ;ILl/֫֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object v5

    invoke-virtual {p1, v5}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    move v5, v6

    goto :goto_0

    :cond_5
    add-int/lit8 v6, v3, 0x1

    .line 89
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩶ۗ;

    .line 102
    invoke-static {v3}, Ll/ۛ֫᩵;->ۙ(Ll/ܳ᩶ۗ;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_6

    .line 104
    sget-object v3, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    sget v7, Ll/ܺ֨ۗ;->۟:I

    const-wide/16 v7, 0x0

    .line 62
    invoke-static {v7, v8, v3}, Ll/᩹֨ۗ;->᩷(JLl/֫֨ۗ;)Ll/᩹֨ۗ;

    move-result-object v3

    goto :goto_4

    .line 106
    :cond_6
    instance-of v8, v7, Ll/᩹֨ۗ;

    if-eqz v8, :cond_7

    .line 107
    move-object v3, v7

    check-cast v3, Ll/᩹֨ۗ;

    goto :goto_4

    .line 109
    :cond_7
    instance-of v8, v7, Ll/֫֨ۗ;

    if-eqz v8, :cond_8

    .line 110
    new-instance v3, Ll/۫ۢۗ;

    check-cast v7, Ll/֫֨ۗ;

    invoke-direct {v3, v7}, Ll/۫ۢۗ;-><init>(Ll/֫֨ۗ;)V

    invoke-static {v3}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object v3

    goto :goto_4

    .line 112
    :cond_8
    instance-of v8, v7, Ljava/lang/String;

    if-eqz v8, :cond_9

    .line 113
    new-instance v3, Ll/ۚۢۗ;

    check-cast v7, Ljava/lang/String;

    invoke-direct {v3, v7}, Ll/ۚۢۗ;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object v3

    .line 90
    :goto_4
    invoke-virtual {p1, v3}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    move v3, v6

    goto/16 :goto_0

    .line 115
    :cond_9
    new-instance p0, Ll/۠ۧ᩵;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Can\'t build insn arg from encoded value: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 115
    throw p0

    .line 96
    :cond_a
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    if-eqz p0, :cond_b

    .line 97
    new-instance p0, Ll/ۚۢۗ;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Ll/ۚۢۗ;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    :cond_b
    return-void
.end method

.method public static ۙ(Ljava/util/List;)Z
    .locals 4

    .line 28
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩶ۗ;

    invoke-virtual {v0}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܰۗ;

    .line 32
    invoke-interface {v0}, Ll/۠ܰۗ;->getType()Ll/᩷᩶ۗ;

    move-result-object v1

    sget-object v3, Ll/᩷᩶ۗ;->֨:Ll/᩷᩶ۗ;

    if-eq v1, v3, :cond_1

    goto :goto_0

    .line 35
    :cond_1
    invoke-interface {v0}, Ll/۠ܰۗ;->ۤ()Ll/۬ܰۗ;

    move-result-object v0

    .line 36
    invoke-interface {v0}, Ll/۬ܰۗ;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "makeConcatWithConstants"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 39
    :cond_2
    invoke-interface {v0}, Ll/۬ܰۗ;->᩸()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Ljava/lang/invoke/StringConcatFactory;"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    .line 42
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۗ;

    invoke-virtual {v1}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v3}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x3

    .line 45
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳ᩶ۗ;

    invoke-virtual {p0}, Ll/ܳ᩶ۗ;->ۙ()Ll/᩸᩶ۗ;

    move-result-object p0

    sget-object v1, Ll/᩸᩶ۗ;->ᩴۙ:Ll/᩸᩶ۗ;

    if-eq p0, v1, :cond_5

    :goto_0
    return v2

    :cond_5
    return v0
.end method

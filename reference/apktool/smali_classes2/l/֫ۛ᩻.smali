.class public final Ll/֫ۛ᩻;
.super Ljava/lang/Object;
.source "W6O3"


# direct methods
.method public static ۙ(Ljava/lang/CharSequence;ZILl/ۙܽ᩻;Ll/ۤ᩻ᩴ;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    .line 22
    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ljava/lang/Character;->codePointCount(Ljava/lang/CharSequence;II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    new-array v2, v0, [I

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 24
    aput v4, v2, v3

    .line 25
    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v4, v5, :cond_0

    invoke-static {v1, v4}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->charCount(I)I

    move-result v5

    add-int/2addr v4, v5

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 27
    :cond_1
    new-instance v0, Ll/ܺܺۨ;

    new-instance v3, Ll/ۡܺ᩻;

    invoke-direct {v3, v8}, Ll/ۡܺ᩻;-><init>(Ll/ۙܽ᩻;)V

    invoke-direct {v0, v1, v3}, Ll/ܺܺۨ;-><init>(Ljava/lang/CharSequence;Ljava/lang/Runnable;)V

    .line 124
    new-instance v3, Ll/۠ܺ᩻;

    new-instance v4, Ll/᩷ܽ᩻;

    invoke-direct {v4, v0, v8}, Ll/᩷ܽ᩻;-><init>(Ll/ܺܺۨ;Ll/ۙܽ᩻;)V

    invoke-direct {v3, v4, v8}, Ll/۠ܺ᩻;-><init>(Ll/ܽܺۨ;Ll/ۙܽ᩻;)V

    .line 28
    invoke-virtual {v3}, Ll/ۡܺۨ;->ۧ()V

    .line 29
    new-instance v0, Ll/ۚۛ᩻;

    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {v3, v0}, Ll/ۡܺۨ;->ۙ(Ll/᩻ܺۨ;)V

    .line 36
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v10, 0x0

    .line 43
    :goto_1
    :try_start_0
    invoke-virtual/range {p3 .. p3}, Ll/ۙܽ᩻;->ۙ()V

    const v11, 0x30d40

    if-ge v5, v11, :cond_16

    .line 47
    invoke-virtual {v3}, Ll/ۚܽ᩻;->nextToken()Ll/۠ܺۨ;

    move-result-object v11

    .line 48
    invoke-interface {v11}, Ll/۠ܺۨ;->getType()I

    move-result v12

    const/4 v13, -0x1

    if-ne v12, v13, :cond_2

    if-nez v6, :cond_17

    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_2
    const/16 v13, 0x67

    if-ne v12, v13, :cond_4

    .line 54
    invoke-interface {v11}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    const-string v14, "# fmt: off"

    .line 56
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3

    const-string v14, "# fmt: on"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    :cond_3
    invoke-virtual {v9, v1}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    return-void

    :cond_4
    const/4 v13, 0x5

    if-eq v12, v13, :cond_5

    const/16 v13, 0x8

    if-ne v12, v13, :cond_6

    :cond_5
    add-int/lit8 v6, v6, 0x1

    :cond_6
    const/4 v13, 0x7

    if-eq v12, v13, :cond_13

    const/16 v13, 0xa

    if-ne v12, v13, :cond_7

    goto/16 :goto_4

    :cond_7
    if-gtz v6, :cond_15

    .line 64
    invoke-interface {v11}, Ll/۠ܺۨ;->᩷()I

    move-result v13

    if-eqz v13, :cond_8

    goto/16 :goto_6

    :cond_8
    const/16 v13, 0x66

    if-ne v12, v13, :cond_9

    .line 66
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_15

    const/4 v7, 0x1

    goto/16 :goto_6

    :cond_9
    const/4 v13, 0x2

    if-eq v12, v13, :cond_15

    const/4 v13, 0x3

    if-ne v12, v13, :cond_a

    goto/16 :goto_6

    :cond_a
    if-eqz v7, :cond_e

    .line 70
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-interface {v11}, Ll/۠ܺۨ;->ۙ()I

    move-result v7

    if-nez v7, :cond_e

    .line 71
    invoke-interface {v11}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object v7

    const-string v13, "elif"

    .line 72
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    const-string v13, "else"

    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    const-string v13, "except"

    .line 73
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    const-string v13, "finally"

    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    const-string v13, "case"

    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    goto :goto_2

    :cond_b
    const/4 v13, 0x0

    goto :goto_3

    :cond_c
    :goto_2
    const/4 v13, 0x1

    .line 74
    :goto_3
    invoke-interface {v11}, Ll/۠ܺۨ;->᩸()I

    move-result v11

    aget v11, v2, v11

    if-lez v11, :cond_d

    if-nez v13, :cond_d

    if-nez v10, :cond_d

    .line 75
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    const-string v10, "@"

    .line 77
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    :cond_e
    const/16 v7, 0xc

    const/16 v11, 0xf

    if-ne v12, v7, :cond_f

    .line 80
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_5

    :cond_f
    const/16 v7, 0xd

    const/16 v13, 0x10

    if-ne v12, v7, :cond_10

    .line 81
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_5

    :cond_10
    const/16 v7, 0xe

    const/16 v14, 0x11

    if-ne v12, v7, :cond_11

    .line 82
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_5

    :cond_11
    if-eq v12, v11, :cond_12

    if-eq v12, v13, :cond_12

    if-ne v12, v14, :cond_14

    .line 84
    :cond_12
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_17

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-eq v7, v12, :cond_14

    goto :goto_7

    :cond_13
    :goto_4
    add-int/lit8 v6, v6, -0x1

    :cond_14
    :goto_5
    const/4 v7, 0x0

    :cond_15
    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    .line 45
    :cond_16
    sget-object v0, Ll/ᩴܽ᩻;->֡:Ll/ᩴܽ᩻;

    const-string v2, "Token count limit exceeded"

    invoke-static {v0, v2}, Ll/ܳܽ᩻;->ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;

    move-result-object v0

    throw v0
    :try_end_0
    .catch Ll/ۤܽ᩻; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 89
    iget-object v2, v0, Ll/ۤܽ᩻;->ܿ:Ll/ᩴܽ᩻;

    sget-object v3, Ll/ᩴܽ᩻;->۟:Ll/ᩴܽ᩻;

    if-ne v2, v3, :cond_1c

    .line 92
    :cond_17
    :goto_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v0, 0x0

    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v11, "Formatted source length limit exceeded"

    const/high16 v12, 0x100000

    if-eqz v2, :cond_1a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v13

    .line 93
    invoke-virtual/range {p3 .. p3}, Ll/ۙܽ᩻;->ۙ()V

    .line 94
    new-instance v14, Ll/ܿ۫ܺ;

    invoke-direct {v14, v0, v13, v1}, Ll/ܿ۫ܺ;-><init>(IILjava/lang/CharSequence;)V

    .line 95
    invoke-virtual/range {p4 .. p4}, Ll/ۤ᩻ᩴ;->ۙ()Ll/ۤ᩻ᩴ;

    move-result-object v15

    const/4 v6, 0x1

    move-object v2, v14

    move/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v5, p3

    move-object v7, v15

    .line 98
    :try_start_1
    invoke-static/range {v2 .. v7}, Ll/ܳܽ᩻;->ۙ(Ljava/lang/CharSequence;ZILl/ۙܽ᩻;ZLl/ۤ᩻ᩴ;)V
    :try_end_1
    .catch Ll/ۤܽ᩻; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v14, v15

    goto :goto_9

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto :goto_a

    :catch_1
    move-exception v0

    move-object v2, v0

    .line 101
    :try_start_2
    iget-object v0, v2, Ll/ۤܽ᩻;->ܿ:Ll/ᩴܽ᩻;

    sget-object v3, Ll/ᩴܽ᩻;->֡:Ll/ᩴܽ᩻;

    if-eq v0, v3, :cond_19

    .line 103
    :goto_9
    invoke-virtual {v9, v14}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 104
    invoke-virtual {v15}, Ll/ۤ᩻ᩴ;->close()V

    .line 105
    invoke-interface/range {p4 .. p4}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt v0, v12, :cond_18

    move v0, v13

    goto :goto_8

    .line 106
    :cond_18
    sget-object v0, Ll/ᩴܽ᩻;->֡:Ll/ᩴܽ᩻;

    invoke-static {v0, v11}, Ll/ܳܽ᩻;->ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;

    move-result-object v0

    throw v0

    .line 101
    :cond_19
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 95
    :goto_a
    :try_start_4
    invoke-virtual {v15}, Ll/ۤ᩻ᩴ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v1

    .line 110
    :cond_1a
    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-virtual {v9, v0, v2, v1}, Ll/ۤ᩻ᩴ;->ۙ(IILjava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    .line 111
    invoke-interface/range {p4 .. p4}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt v0, v12, :cond_1b

    .line 114
    invoke-virtual/range {p3 .. p3}, Ll/ۙܽ᩻;->ۙ()V

    return-void

    .line 112
    :cond_1b
    sget-object v0, Ll/ᩴܽ᩻;->֡:Ll/ᩴܽ᩻;

    invoke-static {v0, v11}, Ll/ܳܽ᩻;->ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;

    move-result-object v0

    throw v0

    .line 89
    :cond_1c
    throw v0
.end method

.class public final Ll/۫ۧ᩻;
.super Ljava/lang/Object;
.source "X6PO"


# direct methods
.method public static ۙ(Ljava/lang/CharSequence;IILl/᩻ۧ᩻;Ll/ۤ᩻ᩴ;)V
    .locals 3

    sub-int v0, p2, p1

    const/high16 v1, 0x100000

    .line 142
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_1

    :goto_0
    if-ge p1, p2, :cond_0

    .line 146
    invoke-virtual {p3}, Ll/᩻ۧ᩻;->ۙ()V

    add-int/lit16 v0, p1, 0x1000

    .line 147
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p4, p1, v1, p0}, Ll/ۤ᩻ᩴ;->ۙ(IILjava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    move p1, v0

    goto :goto_0

    .line 149
    :cond_0
    invoke-virtual {p3}, Ll/᩻ۧ᩻;->ۙ()V

    return-void

    .line 143
    :cond_1
    sget-object p0, Ll/ۙ֫᩻;->ܿ:Ll/ۙ֫᩻;

    const-string p1, "Formatted source length limit exceeded"

    invoke-static {p0, p1}, Ll/ܶۧ᩻;->ۙ(Ll/ۙ֫᩻;Ljava/lang/String;)Ll/᩷֫᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۙ(Ljava/lang/CharSequence;Ll/۫᩸᩻;Ljava/lang/String;Ll/᩻ۧ᩻;Ll/ۤ᩻ᩴ;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    .line 21
    :try_start_0
    invoke-static {v1, v8}, Ll/ܶۧ᩻;->ۙ(Ljava/lang/CharSequence;Ll/᩻ۧ᩻;)Ll/ۗܺۨ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺۨ;->᩸()Ljava/util/ArrayList;

    move-result-object v10
    :try_end_0
    .catch Ll/᩷֫᩻; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v0, 0x6

    .line 91
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 63
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 64
    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 68
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۠ܺۨ;

    .line 69
    invoke-virtual/range {p3 .. p3}, Ll/᩻ۧ᩻;->ۙ()V

    .line 70
    invoke-interface {v7}, Ll/۠ܺۨ;->getType()I

    move-result v12

    const/4 v13, -0x1

    if-ne v12, v13, :cond_0

    goto/16 :goto_4

    .line 72
    :cond_0
    invoke-interface {v7}, Ll/۠ܺۨ;->᩷()I

    move-result v13

    if-eqz v13, :cond_1

    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v13

    const/16 v14, 0xe

    const/4 v15, 0x7

    if-eqz v13, :cond_5

    if-eqz v4, :cond_5

    invoke-interface {v4}, Ll/۠ܺۨ;->᩸()I

    move-result v13

    if-lt v13, v5, :cond_5

    const/16 v13, 0x12

    if-eq v12, v13, :cond_2

    const/16 v13, 0xa

    if-eq v12, v13, :cond_2

    if-eq v12, v15, :cond_2

    if-eq v12, v14, :cond_2

    const/16 v13, 0x8

    if-eq v12, v13, :cond_2

    const/4 v13, 0x5

    if-eq v12, v13, :cond_2

    const/16 v13, 0x15

    if-eq v12, v13, :cond_2

    const/4 v13, 0x3

    if-eq v12, v13, :cond_2

    const/4 v13, 0x4

    if-ne v12, v13, :cond_5

    .line 74
    :cond_2
    invoke-interface {v4}, Ll/۠ܺۨ;->ᩴ()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-interface {v7}, Ll/۠ܺۨ;->᩸()I

    move-result v13

    invoke-static {v4, v13, v1}, Ll/᩵ۧ᩻;->ۙ(IILjava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 75
    invoke-interface {v7}, Ll/۠ܺۨ;->᩸()I

    move-result v4

    :goto_1
    if-le v4, v5, :cond_4

    add-int/lit8 v13, v4, -0x1

    .line 76
    invoke-interface {v1, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    const/16 v15, 0x20

    if-eq v13, v15, :cond_3

    const/16 v15, 0x9

    if-eq v13, v15, :cond_3

    const/16 v15, 0xc

    if-eq v13, v15, :cond_3

    const/16 v15, 0xb

    if-ne v13, v15, :cond_4

    :cond_3
    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    :cond_4
    if-le v4, v5, :cond_5

    .line 78
    new-instance v13, Ll/ܳۧ᩻;

    const/4 v15, 0x1

    invoke-direct {v13, v5, v4, v15}, Ll/ܳۧ᩻;-><init>(IIZ)V

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v5, v4

    :cond_5
    const/16 v4, 0x15

    if-ne v12, v4, :cond_6

    .line 83
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v6, 0x0

    goto/16 :goto_4

    :cond_6
    const/16 v4, 0x11

    if-eq v12, v4, :cond_c

    const/16 v4, 0x1e

    const/16 v13, 0x1f

    if-eq v12, v4, :cond_b

    if-eq v12, v13, :cond_9

    packed-switch v12, :pswitch_data_0

    packed-switch v12, :pswitch_data_1

    goto/16 :goto_3

    .line 103
    :pswitch_0
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_2

    :pswitch_1
    const/16 v4, 0x9

    .line 92
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_3

    .line 94
    :pswitch_2
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_3

    .line 96
    :pswitch_3
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v4, v14, :cond_7

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v13, 0x7

    if-ne v4, v13, :cond_8

    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 97
    :cond_8
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_4
    const/16 v4, 0x30

    .line 89
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_5
    const/16 v4, 0x2e

    .line 90
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_3

    .line 100
    :cond_9
    :pswitch_6
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v4, v12, :cond_d

    :cond_a
    :goto_2
    const/4 v4, 0x0

    const/4 v6, 0x0

    goto :goto_3

    .line 88
    :cond_b
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_3

    .line 91
    :cond_c
    :pswitch_7
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_d
    :goto_3
    if-nez v6, :cond_e

    goto :goto_4

    .line 107
    :cond_e
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->size()I

    move-result v4

    const/16 v13, 0x100

    if-gt v4, v13, :cond_10

    const/4 v4, 0x1

    if-ne v12, v4, :cond_f

    .line 108
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_f

    .line 109
    invoke-interface {v7}, Ll/۠ܺۨ;->ᩴ()I

    move-result v12

    add-int/2addr v12, v4

    .line 110
    new-instance v13, Ll/ܳۧ᩻;

    invoke-direct {v13, v5, v12, v4}, Ll/ܳۧ᩻;-><init>(IIZ)V

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v5, v12

    :cond_f
    move-object v4, v7

    goto/16 :goto_0

    .line 107
    :cond_10
    sget-object v0, Ll/ۙ֫᩻;->ܿ:Ll/ۙ֫᩻;

    const-string v1, "Recovery nesting limit exceeded"

    invoke-static {v0, v1}, Ll/ܶۧ᩻;->ۙ(Ll/ۙ֫᩻;Ljava/lang/String;)Ll/᩷֫᩻;

    move-result-object v0

    throw v0

    .line 115
    :cond_11
    :goto_4
    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge v5, v0, :cond_13

    new-instance v0, Ll/ܳۧ᩻;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-eqz v6, :cond_12

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_12

    const/4 v2, 0x1

    goto :goto_5

    :cond_12
    const/4 v2, 0x0

    :goto_5
    invoke-direct {v0, v5, v3, v2}, Ll/ܳۧ᩻;-><init>(IIZ)V

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    :cond_13
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v12, v0, [Z

    .line 123
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :cond_14
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ܺۨ;

    .line 124
    invoke-virtual/range {p3 .. p3}, Ll/᩻ۧ᩻;->ۙ()V

    .line 125
    invoke-static {v3}, Ll/᩵ۧ᩻;->ۙ(Ll/۠ܺۨ;)Z

    move-result v4

    if-nez v4, :cond_15

    goto :goto_6

    .line 126
    :cond_15
    :goto_7
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_16

    invoke-interface {v3}, Ll/۠ܺۨ;->᩸()I

    move-result v4

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳۧ᩻;

    invoke-static {v5}, Ll/ܳۧ᩻;->᩷(Ll/ܳۧ᩻;)I

    move-result v5

    if-lt v4, v5, :cond_16

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_16
    add-int/lit8 v3, v2, -0x1

    const/4 v4, 0x0

    .line 127
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    :goto_8
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v5, v2, 0x2

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-ge v3, v4, :cond_14

    const/4 v4, 0x1

    aput-boolean v4, v12, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_17
    const/4 v0, 0x0

    const/4 v13, 0x0

    .line 30
    :goto_9
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v13, v0, :cond_1b

    .line 31
    invoke-virtual/range {p3 .. p3}, Ll/᩻ۧ᩻;->ۙ()V

    .line 32
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۧ᩻;

    .line 33
    invoke-static {v0}, Ll/ܳۧ᩻;->ۙ(Ll/ܳۧ᩻;)Z

    move-result v2

    if-eqz v2, :cond_1a

    aget-boolean v2, v12, v13

    if-eqz v2, :cond_18

    goto :goto_d

    .line 37
    :cond_18
    new-instance v14, Ll/ܿ۫ܺ;

    invoke-static {v0}, Ll/ܳۧ᩻;->ۤ(Ll/ܳۧ᩻;)I

    move-result v2

    invoke-static {v0}, Ll/ܳۧ᩻;->᩷(Ll/ܳۧ᩻;)I

    move-result v0

    invoke-direct {v14, v2, v0, v1}, Ll/ܿ۫ܺ;-><init>(IILjava/lang/CharSequence;)V

    .line 38
    invoke-virtual/range {p4 .. p4}, Ll/ۤ᩻ᩴ;->ۙ()Ll/ۤ᩻ᩴ;

    move-result-object v15

    const/4 v6, 0x1

    move-object v2, v14

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object v7, v15

    .line 41
    :try_start_1
    invoke-static/range {v2 .. v7}, Ll/ܶۧ᩻;->ۙ(Ljava/lang/CharSequence;Ll/۫᩸᩻;Ljava/lang/String;Ll/᩻ۧ᩻;ZLl/ۤ᩻ᩴ;)V
    :try_end_1
    .catch Ll/᩷֫᩻; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v14, v15

    goto :goto_a

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto :goto_b

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 45
    :try_start_2
    iget-object v0, v2, Ll/᩷֫᩻;->ܿ:Ll/ۙ֫᩻;

    sget-object v3, Ll/ۙ֫᩻;->֡:Ll/ۙ֫᩻;

    if-ne v0, v3, :cond_19

    .line 48
    :goto_a
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v14, v2, v0, v8, v9}, Ll/۫ۧ᩻;->ۙ(Ljava/lang/CharSequence;IILl/᩻ۧ᩻;Ll/ۤ᩻ᩴ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    invoke-virtual {v15}, Ll/ۤ᩻ᩴ;->close()V

    goto :goto_e

    .line 45
    :cond_19
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 38
    :goto_b
    :try_start_4
    invoke-virtual {v15}, Ll/ۤ᩻ᩴ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_c

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw v1

    .line 34
    :cond_1a
    :goto_d
    invoke-static {v0}, Ll/ܳۧ᩻;->ۤ(Ll/ܳۧ᩻;)I

    move-result v2

    invoke-static {v0}, Ll/ܳۧ᩻;->᩷(Ll/ܳۧ᩻;)I

    move-result v0

    invoke-static {v1, v2, v0, v8, v9}, Ll/۫ۧ᩻;->ۙ(Ljava/lang/CharSequence;IILl/᩻ۧ᩻;Ll/ۤ᩻ᩴ;)V

    :goto_e
    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    .line 53
    :cond_1b
    :try_start_5
    invoke-static {v9, v8}, Ll/ܶۧ᩻;->ۙ(Ljava/lang/CharSequence;Ll/᩻ۧ᩻;)Ll/ۗܺۨ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺۨ;->᩸()Ljava/util/ArrayList;

    move-result-object v0
    :try_end_5
    .catch Ll/᩷֫᩻; {:try_start_5 .. :try_end_5} :catch_1

    .line 58
    invoke-static {v1, v10, v9, v0, v8}, Ll/ܶۧ᩻;->ۙ(Ljava/lang/CharSequence;Ljava/util/List;Ll/ۤ᩻ᩴ;Ljava/util/List;Ll/᩻ۧ᩻;)V

    return-void

    :catch_1
    move-exception v0

    .line 55
    iget-object v1, v0, Ll/᩷֫᩻;->ܿ:Ll/ۙ֫᩻;

    sget-object v2, Ll/ۙ֫᩻;->֡:Ll/ۙ֫᩻;

    if-eq v1, v2, :cond_1c

    throw v0

    .line 56
    :cond_1c
    sget-object v0, Ll/ۙ֫᩻;->᩶:Ll/ۙ֫᩻;

    const-string v1, "Formatted output could not be tokenized"

    invoke-static {v0, v1}, Ll/ܶۧ᩻;->ۙ(Ll/ۙ֫᩻;Ljava/lang/String;)Ll/᩷֫᩻;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    .line 24
    iget-object v2, v0, Ll/᩷֫᩻;->ܿ:Ll/ۙ֫᩻;

    sget-object v3, Ll/ۙ֫᩻;->֡:Ll/ۙ֫᩻;

    if-ne v2, v3, :cond_1d

    .line 25
    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v8, v9}, Ll/۫ۧ᩻;->ۙ(Ljava/lang/CharSequence;IILl/᩻ۧ᩻;Ll/ۤ᩻ᩴ;)V

    return-void

    .line 24
    :cond_1d
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_3
        :pswitch_6
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2d
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_6
    .end packed-switch
.end method

.class public final Ll/۫֫ۚ;
.super Ljava/lang/Object;
.source "Z73J"


# direct methods
.method public static ۙ(Ll/۠۫ۛ;)Ljava/lang/String;
    .locals 3

    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    invoke-interface {p0}, Ll/۠۫ۛ;->getParameters()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬۫ۛ;

    .line 177
    invoke-interface {v2}, Ll/ᩴۧۛ;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 179
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ll/ۙۧۛ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ll/ۙۧۛ;->ۤ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/᩸ۤۛ;)Ljava/util/LinkedHashMap;
    .locals 7

    .line 82
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 83
    invoke-virtual {p0}, Ll/᩸ۤۛ;->getFields()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ۫ۛ;

    .line 84
    invoke-interface {v1}, Ll/ۖ۫ۛ;->᩷()I

    move-result v2

    .line 85
    sget-object v3, Ll/ۖ۠ۨ;->ܳۙ:Ll/ۖ۠ۨ;

    invoke-virtual {v3, v2}, Ll/ۖ۠ۨ;->ۙ(I)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Ll/ۖ۠ۨ;->۬:Ll/ۖ۠ۨ;

    invoke-virtual {v3, v2}, Ll/ۖ۠ۨ;->ۙ(I)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 88
    :cond_1
    invoke-interface {v1}, Ll/ۖ۫ۛ;->ۨۙ()Ll/ܺۧۛ;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 105
    :cond_2
    new-instance v3, Ll/ܿܽۤ;

    invoke-direct {v3}, Ll/ܿܽۤ;-><init>()V

    .line 107
    :try_start_0
    new-instance v4, Ll/֫᩶ۛ;

    new-instance v5, Ll/֡ܽۤ;

    invoke-direct {v5, v3}, Ll/֡ܽۤ;-><init>(Ll/ܿܽۤ;)V

    invoke-direct {v4, v5}, Ll/֫᩶ۛ;-><init>(Ljava/io/Writer;)V

    invoke-static {v4, v2}, Ll/ۗᩳۨ;->ۙ(Ll/֫᩶ۛ;Ll/ܺۧۛ;)V

    .line 108
    invoke-virtual {v3}, Ll/ܿܽۤ;->toString()Ljava/lang/String;

    move-result-object v2

    .line 109
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->codePointCount(II)I

    move-result v3

    const/16 v5, 0xf0

    if-le v3, v5, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_4

    .line 219
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    invoke-static {v4, v6, v5, v2}, Ll/֨۫ۚ;->ۙ(IIILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 115
    :cond_4
    new-instance v4, Ll/ۜۚۚ;

    invoke-direct {v4, v2, v3}, Ll/ۜۚۚ;-><init>(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_0

    .line 168
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v1}, Ll/۠֫ۛ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ll/۠֫ۛ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 94
    invoke-virtual {v0, v1, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_5
    return-object v0
.end method

.method public static ۙ(Ll/᩸ۤۛ;Ljava/io/Writer;)V
    .locals 2

    .line 61
    new-instance v0, Ll/ۚۢۨ;

    invoke-direct {v0}, Ll/ۚۢۨ;-><init>()V

    const/4 v1, 0x0

    .line 62
    iput-boolean v1, v0, Ll/ۚۢۨ;->ܳ:Z

    const/4 v1, 0x1

    .line 63
    iput-boolean v1, v0, Ll/ۚۢۨ;->ۤ:Z

    .line 56
    invoke-static {p1, p0, v0}, Ll/۫ۢۨ;->ۙ(Ljava/io/Writer;Ll/ۢ۫ۛ;Ll/ۚۢۨ;)V

    return-void
.end method

.method public static ۤ(Ll/᩸ۤۛ;)Ljava/lang/String;
    .locals 3

    .line 61
    new-instance v0, Ll/ۚۢۨ;

    invoke-direct {v0}, Ll/ۚۢۨ;-><init>()V

    const/4 v1, 0x0

    .line 62
    iput-boolean v1, v0, Ll/ۚۢۨ;->ܳ:Z

    const/4 v1, 0x1

    .line 63
    iput-boolean v1, v0, Ll/ۚۢۨ;->ۤ:Z

    .line 37
    new-instance v1, Ll/ܿܽۤ;

    invoke-direct {v1}, Ll/ܿܽۤ;-><init>()V

    .line 43
    new-instance v2, Ll/֡ܽۤ;

    invoke-direct {v2, v1}, Ll/֡ܽۤ;-><init>(Ll/ܿܽۤ;)V

    invoke-static {v2, p0, v0}, Ll/۫ۢۨ;->ۙ(Ljava/io/Writer;Ll/ۢ۫ۛ;Ll/ۚۢۨ;)V

    .line 39
    invoke-virtual {v1}, Ll/ܿܽۤ;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Ll/᩸ۤۛ;)Ljava/util/LinkedHashMap;
    .locals 18

    .line 71
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 72
    invoke-virtual/range {p0 .. p0}, Ll/᩸ۤۛ;->getMethods()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠۫ۛ;

    .line 73
    invoke-static {v2}, Ll/۫֫ۚ;->ۙ(Ll/۠۫ۛ;)Ljava/lang/String;

    move-result-object v3

    .line 125
    invoke-interface {v2}, Ll/۠۫ۛ;->֫᩷()Ll/ۜ۫ۛ;

    move-result-object v2

    if-nez v2, :cond_0

    .line 37
    new-instance v2, Ll/᩷֫ۚ;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Ll/᩷֫ۚ;-><init>(IIIILjava/util/AbstractCollection;Ljava/util/AbstractCollection;)V

    move-object/from16 p0, v1

    goto/16 :goto_9

    .line 133
    :cond_0
    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 134
    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 135
    invoke-interface {v2}, Ll/ۜ۫ۛ;->ۙ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩹ۚۛ;

    add-int/lit8 v12, v12, 0x1

    .line 137
    invoke-interface {v6}, Ll/᩹ۚۛ;->ۤ()Ll/᩸ۜۨ;

    move-result-object v7

    .line 138
    instance-of v8, v6, Ll/ۛۚۛ;

    const/4 v9, 0x0

    if-eqz v8, :cond_1

    .line 139
    move-object v8, v6

    check-cast v8, Ll/ۛۚۛ;

    goto :goto_2

    :cond_1
    move-object v8, v9

    :goto_2
    if-nez v8, :cond_2

    goto :goto_3

    .line 140
    :cond_2
    invoke-interface {v8}, Ll/ۛۚۛ;->getReference()Ll/ۤۧۛ;

    move-result-object v9

    :goto_3
    const/4 v10, 0x5

    if-eqz v8, :cond_7

    .line 141
    iget v11, v7, Ll/᩸ۜۨ;->ᩳ:I

    if-nez v11, :cond_7

    instance-of v11, v9, Ll/᩸ۧۛ;

    if-eqz v11, :cond_7

    add-int/lit8 v13, v13, 0x1

    .line 144
    move-object v8, v9

    check-cast v8, Ll/᩸ۧۛ;

    invoke-interface {v8}, Ll/᩸ۧۛ;->getString()Ljava/lang/String;

    move-result-object v8

    .line 186
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v11

    if-ge v11, v10, :cond_6

    if-eqz v8, :cond_6

    .line 206
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_6

    .line 207
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v10

    const/4 v11, 0x0

    invoke-virtual {v8, v11, v10}, Ljava/lang/String;->codePointCount(II)I

    move-result v10

    const/16 v11, 0x50

    if-le v10, v11, :cond_3

    goto :goto_5

    :cond_3
    const/4 v10, 0x0

    .line 210
    :goto_4
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v10, v11, :cond_5

    .line 211
    invoke-virtual {v8, v10}, Ljava/lang/String;->codePointAt(I)I

    move-result v11

    move-object/from16 p0, v1

    const/16 v1, 0xa

    if-eq v11, v1, :cond_a

    const/16 v1, 0xd

    if-eq v11, v1, :cond_a

    .line 212
    invoke-static {v11}, Ljava/lang/Character;->isISOControl(I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_6

    .line 215
    :cond_4
    invoke-static {v11}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr v10, v1

    move-object/from16 v1, p0

    goto :goto_4

    :cond_5
    move-object/from16 p0, v1

    .line 189
    invoke-virtual {v4, v8}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_6
    :goto_5
    move-object/from16 p0, v1

    goto :goto_6

    :cond_7
    move-object/from16 p0, v1

    if-eqz v8, :cond_a

    .line 145
    iget v1, v7, Ll/᩸ۜۨ;->ᩳ:I

    const/4 v8, 0x2

    if-ne v1, v8, :cond_a

    instance-of v1, v9, Ll/۠֫ۛ;

    if-eqz v1, :cond_a

    move-object v1, v9

    check-cast v1, Ll/۠֫ۛ;

    const-string v8, "I"

    .line 237
    invoke-interface {v1}, Ll/۠֫ۛ;->getType()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_6

    .line 240
    :cond_8
    invoke-interface {v1}, Ll/۠֫ۛ;->ܳ()Ljava/lang/String;

    move-result-object v1

    const-string v8, "/R$"

    .line 241
    invoke-virtual {v1, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_9

    const-string v8, "LR$"

    invoke-virtual {v1, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    :cond_9
    add-int/lit8 v14, v14, 0x1

    .line 149
    :cond_a
    :goto_6
    instance-of v1, v6, Ll/ᩳۚۛ;

    if-eqz v1, :cond_d

    check-cast v6, Ll/ᩳۚۛ;

    .line 150
    invoke-interface {v6}, Ll/ᩳۚۛ;->ܰ()J

    move-result-wide v10

    const-wide/16 v16, 0x0

    cmp-long v1, v10, v16

    if-ltz v1, :cond_d

    const-wide v16, 0xffffffffL

    cmp-long v1, v10, v16

    if-lez v1, :cond_b

    goto :goto_7

    :cond_b
    long-to-int v1, v10

    ushr-int/lit8 v6, v1, 0x18

    and-int/lit16 v6, v6, 0xff

    ushr-int/lit8 v1, v1, 0x10

    and-int/lit16 v1, v1, 0xff

    const/16 v8, 0x7f

    if-eq v6, v8, :cond_c

    const/4 v8, 0x1

    if-ne v6, v8, :cond_d

    :cond_c
    if-eqz v1, :cond_d

    add-int/lit8 v14, v14, 0x1

    .line 153
    :cond_d
    :goto_7
    iget-object v1, v7, Ll/᩸ۜۨ;->۟:Ljava/lang/String;

    const-string v6, "invoke-"

    invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    add-int/lit8 v15, v15, 0x1

    .line 155
    instance-of v1, v9, Ll/ۙۧۛ;

    if-eqz v1, :cond_f

    .line 156
    check-cast v9, Ll/ۙۧۛ;

    .line 196
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v6, 0x5

    if-lt v1, v6, :cond_e

    goto :goto_8

    .line 199
    :cond_e
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v9}, Ll/ۙۧۛ;->ܳ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "->"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v9}, Ll/ۙۧۛ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_f
    :goto_8
    move-object/from16 v1, p0

    goto/16 :goto_1

    :cond_10
    move-object/from16 p0, v1

    .line 160
    new-instance v2, Ll/᩷֫ۚ;

    move-object v11, v2

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    invoke-direct/range {v11 .. v17}, Ll/᩷֫ۚ;-><init>(IIIILjava/util/AbstractCollection;Ljava/util/AbstractCollection;)V

    .line 73
    :goto_9
    invoke-virtual {v0, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, p0

    goto/16 :goto_0

    :cond_11
    return-object v0
.end method

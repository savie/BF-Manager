.class public final Ll/֫ۤ᩵;
.super Ll/ۙۤ᩵;
.source "I6FF"


# direct methods
.method public static ۙ(Ljava/util/ArrayList;Ljava/util/List;Ljava/util/Stack;I)V
    .locals 4

    .line 218
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ne v0, p3, :cond_0

    .line 219
    new-instance v0, Ll/ᩴۤ᩵;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2, v0}, Ll/֨۫ۗ;->toArray(Ljava/util/Collection;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩷ۡۗ;

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    :cond_0
    new-instance v0, Ll/ܳۤ᩵;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v0}, Ll/֨۫ۗ;->toArray(Ljava/util/Collection;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩷ۡۗ;

    .line 222
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 223
    invoke-virtual {p2, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    invoke-interface {p1, v3}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 225
    invoke-static {p0, p1, p2, p3}, Ll/֫ۤ᩵;->ۙ(Ljava/util/ArrayList;Ljava/util/List;Ljava/util/Stack;I)V

    .line 226
    invoke-virtual {p2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    invoke-interface {p1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ᩷()Ljava/util/List;
    .locals 17

    .line 118
    invoke-virtual/range {p0 .. p0}, Ll/ۙۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v0

    .line 119
    invoke-virtual {v0}, Ll/۟ۤ᩵;->ܳ()Ll/ܺܳܺ;

    move-result-object v1

    .line 121
    invoke-virtual {v0}, Ll/۟ۤ᩵;->ᩴ()Ll/֨ۤ᩵;

    move-result-object v2

    check-cast v2, Ll/ܶۤ᩵;

    .line 123
    invoke-virtual {v0}, Ll/۟ۤ᩵;->᩸()Ll/֨ۤ᩵;

    move-result-object v3

    check-cast v3, Ll/ܶۤ᩵;

    .line 125
    invoke-virtual {v2}, Ll/ܶۤ᩵;->᩻()Ll/᩷ۡۗ;

    move-result-object v4

    .line 126
    invoke-virtual {v3}, Ll/ܶۤ᩵;->᩻()Ll/᩷ۡۗ;

    move-result-object v5

    .line 50
    invoke-virtual {v2}, Ll/ܶۤ᩵;->᩻()Ll/᩷ۡۗ;

    move-result-object v6

    .line 51
    invoke-virtual {v3}, Ll/ܶۤ᩵;->᩻()Ll/᩷ۡۗ;

    move-result-object v7

    .line 52
    invoke-virtual {v2}, Ll/֨ۤ᩵;->ᩴ()Ll/ۡ᩷᩵;

    move-result-object v8

    .line 53
    invoke-virtual {v3}, Ll/֨ۤ᩵;->ᩴ()Ll/ۡ᩷᩵;

    move-result-object v9

    .line 55
    new-instance v10, Ll/۫ۤ᩵;

    invoke-direct {v10, v8, v6, v9, v7}, Ll/۫ۤ᩵;-><init>(Ll/ۡ᩷᩵;Ll/᩷ۡۗ;Ll/ۡ᩷᩵;Ll/᩷ۡۗ;)V

    .line 130
    invoke-virtual {v3}, Ll/ܶۤ᩵;->ۧ()Ljava/util/List;

    move-result-object v6

    .line 210
    new-instance v7, Ljava/util/Stack;

    invoke-direct {v7}, Ljava/util/Stack;-><init>()V

    .line 211
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 212
    move-object v9, v6

    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-static {v8, v6, v7, v9}, Ll/֫ۤ᩵;->ۙ(Ljava/util/ArrayList;Ljava/util/List;Ljava/util/Stack;I)V

    .line 133
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Ll/᩷ۡۗ;

    .line 134
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v11, 0x0

    .line 135
    :goto_1
    invoke-virtual {v2}, Ll/ܶۤ᩵;->ۧ()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v11, v12, :cond_0

    .line 136
    invoke-virtual {v2}, Ll/ܶۤ᩵;->ۧ()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/util/ArrayList;

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩷ۡۗ;

    .line 137
    aget-object v13, v7, v11

    .line 139
    invoke-virtual {v2}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v14

    invoke-virtual {v14}, Ll/֡᩷᩵;->ۙ()Ll/֡᩷᩵;

    move-result-object v14

    .line 140
    invoke-virtual {v3}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v15

    invoke-virtual {v15}, Ll/֡᩷᩵;->ۙ()Ll/֡᩷᩵;

    move-result-object v15

    move-object/from16 v16, v6

    .line 142
    new-instance v6, Ll/ᩳۤ᩵;

    .line 17
    invoke-direct {v6, v12, v8, v8}, Ll/ᩳۤ᩵;-><init>(Ll/᩷ۡۗ;II)V

    .line 143
    new-instance v12, Ll/ᩳۤ᩵;

    .line 17
    invoke-direct {v12, v13, v8, v8}, Ll/ᩳۤ᩵;-><init>(Ll/᩷ۡۗ;II)V

    .line 145
    invoke-static {v14, v6}, Ll/ۗۤ᩵;->ۙ(Ll/֡᩷᩵;Ll/ᩳۤ᩵;)Ll/۬᩷᩵;

    move-result-object v6

    .line 146
    invoke-static {v15, v12}, Ll/ۗۤ᩵;->ۙ(Ll/֡᩷᩵;Ll/ᩳۤ᩵;)Ll/۬᩷᩵;

    move-result-object v12

    .line 148
    invoke-static {v0, v6, v12}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v6

    .line 149
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v6, v16

    goto :goto_1

    :cond_0
    move-object/from16 v16, v6

    .line 152
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 154
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۟ۤ᩵;

    .line 155
    new-instance v11, Ll/ۖ᩷᩵;

    invoke-direct {v11, v10}, Ll/ۖ᩷᩵;-><init>(Ljava/util/function/Function;)V

    .line 158
    invoke-virtual {v11, v9}, Ll/ۖ᩷᩵;->ۙ(Ll/۟ۤ᩵;)Ljava/util/List;

    move-result-object v9

    .line 163
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 174
    :cond_1
    invoke-virtual {v1, v4, v5}, Ll/ܺܳܺ;->᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v7

    .line 68
    new-instance v9, Ll/ۚۤ᩵;

    invoke-direct {v9}, Ll/ۚۤ᩵;-><init>()V

    .line 69
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۟ۤ᩵;

    .line 72
    invoke-virtual {v12}, Ll/۟ۤ᩵;->ᩴ()Ll/֨ۤ᩵;

    move-result-object v13

    invoke-virtual {v13}, Ll/֨ۤ᩵;->֫()Z

    move-result v13

    if-nez v13, :cond_3

    invoke-virtual {v12}, Ll/۟ۤ᩵;->᩸()Ll/֨ۤ᩵;

    move-result-object v13

    invoke-virtual {v13}, Ll/֨ۤ᩵;->֫()Z

    move-result v13

    if-eqz v13, :cond_2

    goto :goto_4

    .line 91
    :cond_2
    invoke-virtual {v12}, Ll/۟ۤ᩵;->ᩴ()Ll/֨ۤ᩵;

    move-result-object v13

    .line 92
    invoke-virtual {v12}, Ll/۟ۤ᩵;->᩸()Ll/֨ۤ᩵;

    move-result-object v12

    goto :goto_5

    .line 73
    :cond_3
    :goto_4
    invoke-virtual {v12}, Ll/۟ۤ᩵;->ᩴ()Ll/֨ۤ᩵;

    move-result-object v13

    .line 74
    invoke-virtual {v12}, Ll/۟ۤ᩵;->᩸()Ll/֨ۤ᩵;

    move-result-object v12

    .line 75
    instance-of v14, v13, Ll/᩺ۤ᩵;

    .line 76
    instance-of v15, v12, Ll/᩺ۤ᩵;

    if-eqz v14, :cond_7

    if-nez v15, :cond_4

    goto :goto_7

    .line 82
    :cond_4
    check-cast v13, Ll/᩺ۤ᩵;

    .line 83
    check-cast v12, Ll/᩺ۤ᩵;

    .line 84
    invoke-virtual {v13}, Ll/᩺ۤ᩵;->ۧ()Z

    move-result v14

    if-nez v14, :cond_6

    invoke-virtual {v12}, Ll/᩺ۤ᩵;->ۧ()Z

    move-result v14

    if-eqz v14, :cond_5

    goto :goto_6

    .line 88
    :cond_5
    invoke-virtual {v13}, Ll/᩺ۤ᩵;->᩻()Ll/֨ۤ᩵;

    move-result-object v13

    .line 89
    invoke-virtual {v12}, Ll/᩺ۤ᩵;->᩻()Ll/֨ۤ᩵;

    move-result-object v12

    .line 94
    :goto_5
    invoke-virtual {v13}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v13

    .line 95
    invoke-virtual {v12}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v12

    .line 96
    iget-boolean v14, v9, Ll/ۚۤ᩵;->᩸:Z

    invoke-virtual {v13}, Ll/֡᩷᩵;->ۤ()Z

    move-result v15

    and-int/2addr v14, v15

    iput-boolean v14, v9, Ll/ۚۤ᩵;->᩸:Z

    .line 97
    iget-boolean v14, v9, Ll/ۚۤ᩵;->᩷:Z

    invoke-virtual {v12}, Ll/֡᩷᩵;->ۤ()Z

    move-result v15

    and-int/2addr v14, v15

    iput-boolean v14, v9, Ll/ۚۤ᩵;->᩷:Z

    .line 98
    iget-object v14, v9, Ll/ۚۤ᩵;->ۤ:Ljava/util/HashSet;

    invoke-virtual {v13}, Ll/֡᩷᩵;->᩷()Ljava/util/HashSet;

    move-result-object v13

    invoke-interface {v14, v13}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 99
    iget-object v13, v9, Ll/ۚۤ᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v12}, Ll/֡᩷᩵;->᩷()Ljava/util/HashSet;

    move-result-object v12

    invoke-interface {v13, v12}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_3

    .line 85
    :cond_6
    :goto_6
    iput-boolean v8, v9, Ll/ۚۤ᩵;->ᩴ:Z

    goto/16 :goto_3

    .line 78
    :cond_7
    :goto_7
    iput-boolean v8, v9, Ll/ۚۤ᩵;->ᩴ:Z

    goto/16 :goto_3

    .line 176
    :cond_8
    iget-boolean v11, v9, Ll/ۚۤ᩵;->ᩴ:Z

    if-nez v11, :cond_a

    if-nez v7, :cond_a

    move-object/from16 v6, v16

    goto/16 :goto_0

    :cond_9
    const/4 v6, 0x0

    move-object v9, v6

    :cond_a
    const/4 v1, 0x1

    if-eqz v6, :cond_c

    if-nez v9, :cond_b

    goto :goto_9

    .line 188
    :cond_b
    invoke-virtual {v2}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/֡᩷᩵;->ۙ()Ll/֡᩷᩵;

    move-result-object v4

    .line 189
    iget-boolean v5, v9, Ll/ۚۤ᩵;->᩸:Z

    invoke-virtual {v4, v5}, Ll/֡᩷᩵;->ۙ(Z)V

    .line 190
    iget-object v5, v9, Ll/ۚۤ᩵;->ۤ:Ljava/util/HashSet;

    invoke-virtual {v4, v5}, Ll/֡᩷᩵;->ۙ(Ljava/util/HashSet;)V

    .line 191
    invoke-virtual {v3}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v5

    invoke-virtual {v5}, Ll/֡᩷᩵;->ۙ()Ll/֡᩷᩵;

    move-result-object v5

    .line 192
    iget-boolean v7, v9, Ll/ۚۤ᩵;->᩷:Z

    invoke-virtual {v5, v7}, Ll/֡᩷᩵;->ۙ(Z)V

    .line 193
    iget-object v7, v9, Ll/ۚۤ᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v5, v7}, Ll/֡᩷᩵;->ۙ(Ljava/util/HashSet;)V

    .line 195
    new-instance v7, Ll/ᩳۤ᩵;

    invoke-virtual {v2}, Ll/ܶۤ᩵;->᩻()Ll/᩷ۡۗ;

    move-result-object v2

    .line 17
    invoke-direct {v7, v2, v8, v8}, Ll/ᩳۤ᩵;-><init>(Ll/᩷ۡۗ;II)V

    .line 196
    new-instance v2, Ll/ᩳۤ᩵;

    invoke-virtual {v3}, Ll/ܶۤ᩵;->᩻()Ll/᩷ۡۗ;

    move-result-object v3

    .line 17
    invoke-direct {v2, v3, v8, v8}, Ll/ᩳۤ᩵;-><init>(Ll/᩷ۡۗ;II)V

    .line 199
    invoke-static {v4, v7}, Ll/ۗۤ᩵;->ۙ(Ll/֡᩷᩵;Ll/ᩳۤ᩵;)Ll/۬᩷᩵;

    move-result-object v3

    .line 201
    invoke-static {v5, v2}, Ll/ۗۤ᩵;->ۙ(Ll/֡᩷᩵;Ll/ᩳۤ᩵;)Ll/۬᩷᩵;

    move-result-object v2

    .line 204
    invoke-static {v0, v3, v2}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v0

    .line 205
    invoke-virtual {v0, v6}, Ll/۟ۤ᩵;->ۙ(Ljava/util/List;)V

    new-array v2, v1, [Ljava/lang/Object;

    aput-object v0, v2, v8

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v1, v2, v8

    :goto_8
    invoke-static {v1, v0, v1, v0}, Ll/᩺᩸ۚ;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 31
    :cond_c
    :goto_9
    sget-object v2, Ll/ܰۤ᩵;->֡:Ll/ܰۤ᩵;

    .line 32
    invoke-static {v2}, Ll/᩶ۤ᩵;->ۙ(Ll/ܰۤ᩵;)Ll/۬᩷᩵;

    move-result-object v3

    .line 34
    invoke-static {v2}, Ll/᩶ۤ᩵;->ۙ(Ll/ܰۤ᩵;)Ll/۬᩷᩵;

    move-result-object v2

    .line 36
    invoke-static {v0, v3, v2}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v0

    new-array v2, v1, [Ljava/lang/Object;

    aput-object v0, v2, v8

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v1, v2, v8

    goto :goto_8
.end method

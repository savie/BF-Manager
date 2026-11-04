.class public final Ll/᩸᩹ܳ;
.super Ljava/lang/Object;
.source "Q6F5"


# instance fields
.field public final ۙ:Ljava/util/HashMap;

.field public final ᩷:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩸᩹ܳ;->ۙ:Ljava/util/HashMap;

    .line 34
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/᩸᩹ܳ;->᩷:Landroid/content/Context;

    return-void
.end method

.method public static ۙ(Landroid/content/pm/ApplicationInfo;)Ljava/util/ArrayList;
    .locals 5

    .line 115
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 116
    new-instance v1, Ll/᩷᩹ܳ;

    iget-object v2, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v1, v2}, Ll/᩷᩹ܳ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    if-eqz p0, :cond_0

    .line 118
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    new-instance v4, Ll/᩷᩹ܳ;

    invoke-direct {v4, v3}, Ll/᩷᩹ܳ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۙ(Ll/᩶ۚۤ;Ljava/util/HashMap;Ll/᩻ܶܳ;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 153
    invoke-virtual/range {p0 .. p0}, Ll/᩶ۚۤ;->ۙ()I

    move-result v2

    const/16 v3, 0xc

    if-lt v2, v3, :cond_1f

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ll/᩶ۚۤ;->ܳ(I)I

    move-result v2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1f

    const/4 v2, 0x4

    .line 154
    invoke-virtual {v0, v2}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Ll/᩶ۚۤ;->ۙ()I

    move-result v5

    if-ne v2, v5, :cond_1f

    .line 155
    invoke-virtual {v0, v4}, Ll/᩶ۚۤ;->ܳ(I)I

    move-result v2

    if-lt v2, v3, :cond_1e

    .line 156
    invoke-virtual/range {p0 .. p0}, Ll/᩶ۚۤ;->ۙ()I

    move-result v3

    if-gt v2, v3, :cond_1e

    const/4 v3, 0x0

    .line 158
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ll/᩶ۚۤ;->ۙ()I

    move-result v4

    const/16 v5, 0x18

    const/16 v6, 0x10

    const/16 v7, 0xff

    const/16 v8, 0x8

    if-ge v2, v4, :cond_10

    .line 159
    invoke-static/range {p2 .. p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    .line 160
    invoke-virtual {v0, v2}, Ll/᩶ۚۤ;->ۙ(I)I

    move-result v4

    if-lt v4, v8, :cond_f

    add-int/lit8 v4, v2, 0x2

    .line 161
    invoke-virtual {v0, v4}, Ll/᩶ۚۤ;->ܳ(I)I

    move-result v4

    add-int/lit8 v9, v2, 0x4

    .line 162
    invoke-virtual {v0, v9}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v9

    if-lt v4, v8, :cond_e

    if-lt v9, v4, :cond_e

    .line 163
    invoke-virtual {v0, v2}, Ll/᩶ۚۤ;->ۙ(I)I

    move-result v10

    if-gt v9, v10, :cond_e

    .line 165
    invoke-virtual {v0, v2}, Ll/᩶ۚۤ;->ܳ(I)I

    move-result v10

    const/16 v11, 0x200

    if-ne v10, v11, :cond_d

    add-int/lit8 v3, v3, 0x1

    const/16 v10, 0x11c

    if-lt v4, v10, :cond_c

    add-int/lit8 v10, v2, 0x8

    .line 168
    invoke-virtual {v0, v10}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v10

    if-lez v10, :cond_b

    if-gt v10, v7, :cond_b

    const/16 v7, 0x120

    if-lt v4, v7, :cond_0

    add-int/lit16 v7, v2, 0x11c

    .line 170
    invoke-virtual {v0, v7}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v7

    if-nez v7, :cond_b

    :cond_0
    add-int/2addr v4, v2

    add-int v7, v2, v9

    :goto_1
    if-ge v4, v7, :cond_d

    .line 183
    invoke-static/range {p2 .. p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    sub-int v10, v7, v4

    if-lt v10, v8, :cond_a

    add-int/lit8 v11, v4, 0x2

    .line 185
    invoke-virtual {v0, v11}, Ll/᩶ۚۤ;->ܳ(I)I

    move-result v11

    add-int/lit8 v12, v4, 0x4

    .line 186
    invoke-virtual {v0, v12}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v12

    if-lt v11, v8, :cond_9

    if-lt v12, v11, :cond_9

    if-gt v12, v10, :cond_9

    .line 189
    invoke-virtual {v0, v4}, Ll/᩶ۚۤ;->ܳ(I)I

    move-result v8

    const/16 v10, 0x202

    const/16 v13, 0x201

    if-eq v8, v10, :cond_2

    if-ne v8, v13, :cond_1

    goto :goto_2

    :cond_1
    move v15, v7

    goto :goto_5

    :cond_2
    :goto_2
    if-lt v11, v6, :cond_8

    add-int/lit8 v6, v4, 0xc

    .line 192
    invoke-virtual {v0, v6}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v6

    if-ltz v6, :cond_7

    const/high16 v10, 0x10000

    if-gt v6, v10, :cond_7

    if-ne v8, v13, :cond_1

    if-lt v11, v5, :cond_6

    add-int/lit8 v5, v4, 0x10

    .line 196
    invoke-virtual {v0, v5}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v5

    add-int/lit8 v8, v4, 0x9

    .line 197
    invoke-virtual {v0, v8}, Ll/᩶ۚۤ;->᩷(I)B

    move-result v8

    and-int/lit8 v10, v8, 0x1

    if-nez v10, :cond_4

    and-int/lit8 v8, v8, 0x2

    if-nez v8, :cond_3

    goto :goto_3

    :cond_3
    const/4 v8, 0x2

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v8, 0x4

    :goto_4
    int-to-long v10, v11

    int-to-long v13, v6

    move v15, v7

    int-to-long v6, v8

    mul-long v13, v13, v6

    add-long/2addr v13, v10

    int-to-long v6, v5

    cmp-long v8, v13, v6

    if-gtz v8, :cond_5

    if-gt v5, v12, :cond_5

    goto :goto_5

    .line 200
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource entry offsets"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 195
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource config header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_5
    add-int/2addr v4, v12

    const/16 v5, 0x18

    const/16 v6, 0x10

    const/16 v8, 0x8

    move v7, v15

    goto :goto_1

    .line 193
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource type entry count"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 191
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource type header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 188
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource package chunk"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 184
    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated resource package chunk"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 171
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported dynamic resource package or type ID offset"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 167
    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource package header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    add-int/2addr v2, v9

    goto/16 :goto_0

    .line 164
    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource table chunk"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 160
    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated resource table chunk"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    const/16 v2, 0x8

    .line 176
    invoke-virtual {v0, v2}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v2

    if-ne v3, v2, :cond_1d

    .line 126
    new-instance v2, Ll/᩺۫ۤ;

    invoke-direct {v2, v0}, Ll/᩺۫ۤ;-><init>(Ll/᩶ۚۤ;)V

    invoke-virtual {v2}, Ll/᩺۫ۤ;->ۚ()V

    .line 127
    invoke-virtual {v2}, Ll/᩺۫ۤ;->ۨ()I

    move-result v0

    if-ne v0, v3, :cond_1c

    .line 128
    invoke-virtual {v2}, Ll/ᩴ᩸ۤ;->۠()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟۫ۤ;

    .line 129
    invoke-virtual {v2}, Ll/ܶ᩸ۤ;->ܽ᩷()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_12
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳ۫ۤ;

    .line 130
    invoke-static/range {p2 .. p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    const-string v5, "id"

    .line 131
    invoke-interface {v4}, Ll/ܳ۫ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    goto :goto_6

    .line 132
    :cond_13
    invoke-interface {v4}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v5

    if-lez v5, :cond_1a

    invoke-interface {v4}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v5

    if-gt v5, v7, :cond_1a

    .line 134
    invoke-interface {v4}, Ll/ܳ۫ۤ;->ۧ()Ljava/lang/Iterable;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۖܳۤ;

    .line 135
    invoke-interface {v6}, Ll/ۖܳۤ;->ۛ()I

    move-result v8

    const v9, 0xffff

    if-gt v8, v9, :cond_19

    const/4 v8, 0x0

    .line 136
    :goto_7
    invoke-interface {v6}, Ll/ۖܳۤ;->ۛ()I

    move-result v9

    if-gt v8, v9, :cond_14

    .line 137
    invoke-static/range {p2 .. p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    .line 138
    invoke-interface {v6, v8}, Ll/ۖܳۤ;->ۤ(I)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_15

    goto :goto_9

    .line 140
    :cond_15
    invoke-interface {v6, v8}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v10

    if-eqz v10, :cond_18

    .line 141
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ll/ܶ᩸ۤ;->getPackageName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ":id/"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 142
    invoke-virtual {v2}, Ll/ܶ᩸ۤ;->۫()I

    move-result v10

    shl-int/lit8 v10, v10, 0x18

    invoke-interface {v4}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v11

    shl-int/lit8 v11, v11, 0x10

    or-int/2addr v10, v11

    or-int/2addr v10, v8

    .line 143
    invoke-virtual {v1, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    if-eqz v11, :cond_17

    .line 144
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    if-ne v11, v10, :cond_16

    goto :goto_8

    :cond_16
    const/4 v10, 0x0

    :cond_17
    :goto_8
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v1, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    .line 140
    :cond_18
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource entry"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 135
    :cond_19
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource entry ID"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_1a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource type ID"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    return-void

    .line 127
    :cond_1c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete resource table"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 176
    :cond_1d
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Resource package count mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 156
    :cond_1e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource table header size"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 154
    :cond_1f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource table header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/16 v1, 0x3a

    .line 108
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    const/16 v4, 0x2f

    .line 109
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    if-lez v2, :cond_1

    if-le v5, v3, :cond_1

    .line 110
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v6, 0x1

    sub-int/2addr v2, v6

    if-ge v5, v2, :cond_1

    .line 111
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    if-gez v1, :cond_1

    add-int/2addr v5, v6

    invoke-virtual {p0, v4, v5}, Ljava/lang/String;->indexOf(II)I

    move-result p0

    if-gez p0, :cond_1

    return v6

    :cond_1
    return v0
.end method


# virtual methods
.method public final ۙ(Ll/ܳ᩹ܳ;Ll/᩻ܶܳ;)Ljava/util/Map;
    .locals 13

    .line 38
    iget-object v0, p0, Ll/᩸᩹ܳ;->᩷:Landroid/content/Context;

    invoke-static {p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    .line 39
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 40
    iget-object p1, p1, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "package"

    const-string v5, "android:"

    const-string v6, "resource-id"

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴ᩹ܳ;

    .line 41
    invoke-static {p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    .line 42
    iget-object v7, v3, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 43
    invoke-static {v6}, Ll/᩸᩹ܳ;->ۙ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v6, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 44
    iget-object v3, v3, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 45
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 48
    :cond_1
    iget-object v2, p0, Ll/᩸᩹ܳ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    .line 49
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 50
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v7, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 51
    invoke-static {p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    .line 54
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v10

    invoke-virtual {v10, v7, v9}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v9

    .line 55
    invoke-static {v9}, Ll/᩸᩹ܳ;->ۙ(Landroid/content/pm/ApplicationInfo;)Ljava/util/ArrayList;

    move-result-object v8

    .line 56
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۤ᩹ܳ;

    if-eqz v9, :cond_2

    .line 57
    iget-object v10, v9, Ll/ۤ᩹ܳ;->ۙ:Ljava/util/ArrayList;

    invoke-interface {v10, v8}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    .line 58
    :cond_2
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 59
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_3
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷᩹ܳ;

    .line 60
    invoke-static {p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    .line 61
    iget-object v11, v11, Ll/᩷᩹ܳ;->ۙ:Ljava/io/File;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v12

    invoke-static {v11, v12, p2}, Ll/ۢܽܳ;->ۙ(Ljava/io/File;Ljava/io/File;Ll/᩻ܶܳ;)Ll/ۢܽܳ;

    move-result-object v11
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v11, :cond_4

    .line 62
    :try_start_1
    iget-object v12, v11, Ll/ۢܽܳ;->ܰ:Ll/᩶ۚۤ;

    invoke-static {v12, v9, p2}, Ll/᩸᩹ܳ;->ۙ(Ll/᩶ۚۤ;Ljava/util/HashMap;Ll/᩻ܶܳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v9

    .line 61
    :try_start_2
    invoke-virtual {v11}, Ll/ۢܽܳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v10

    :try_start_3
    invoke-virtual {v9, v10}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v9

    :cond_4
    :goto_4
    if-eqz v11, :cond_3

    .line 63
    invoke-virtual {v11}, Ll/ۢܽܳ;->close()V

    goto :goto_2

    .line 65
    :cond_5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v10, v7, v11}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v10

    invoke-static {v10}, Ll/᩸᩹ܳ;->ۙ(Landroid/content/pm/ApplicationInfo;)Ljava/util/ArrayList;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 67
    new-instance v10, Ll/ۤ᩹ܳ;

    invoke-direct {v10, v8, v9}, Ll/ۤ᩹ܳ;-><init>(Ljava/util/ArrayList;Ljava/util/Map;)V

    .line 68
    invoke-virtual {v2, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v9, v10

    .line 70
    :cond_6
    iget-object v9, v9, Ll/ۤ᩹ܳ;->᩷:Ljava/util/Map;

    invoke-virtual {v3, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    .line 66
    :cond_7
    new-instance v9, Ljava/io/IOException;

    const-string v10, "APK changed during resource ID lookup"

    invoke-direct {v9, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v9
    :try_end_3
    .catch Ljava/io/InterruptedIOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    if-nez v8, :cond_8

    .line 76
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    .line 77
    :cond_8
    new-instance v9, Ll/ۤ᩹ܳ;

    sget-object v10, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-direct {v9, v8, v10}, Ll/ۤ᩹ܳ;-><init>(Ljava/util/ArrayList;Ljava/util/Map;)V

    invoke-virtual {v2, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :catch_1
    move-exception p1

    .line 72
    throw p1

    .line 81
    :cond_9
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    .line 82
    :goto_5
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_f

    .line 83
    invoke-static {p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    .line 84
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴ᩹ܳ;

    .line 85
    iget-object v7, v2, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 86
    invoke-static {v7}, Ll/᩸᩹ܳ;->ۙ(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_a

    goto :goto_8

    .line 88
    :cond_a
    invoke-virtual {v7, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_b

    .line 89
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    .line 90
    invoke-virtual {v2, v7, v8, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v9

    if-eqz v9, :cond_d

    .line 92
    :try_start_4
    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_4
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_4 .. :try_end_4} :catch_2

    if-nez v2, :cond_d

    :catch_2
    goto :goto_6

    .line 96
    :cond_b
    iget-object v2, v2, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-eqz v2, :cond_c

    const/4 v9, 0x0

    .line 97
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v2, v7, v9}, Ll/ۧۚۗ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_7

    :cond_c
    :goto_6
    const/4 v9, 0x0

    :cond_d
    :goto_7
    if-eqz v9, :cond_e

    .line 99
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v9, v10, v11

    const-string v9, "0x%08x"

    invoke-static {v7, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    :goto_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 101
    :cond_f
    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ()V
    .locals 1

    .line 104
    iget-object v0, p0, Ll/᩸᩹ܳ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

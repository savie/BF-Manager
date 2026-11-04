.class public final Ll/۫ۖ۫;
.super Ljava/lang/Object;
.source "V6JD"


# instance fields
.field public final ۙ:Ljava/util/List;

.field public final ۤ:[J

.field public final ᩷:J

.field public final ᩸:[J


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 13

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/۫ۖ۫;->ۙ:Ljava/util/List;

    .line 40
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Ll/۫ۖ۫;->ۤ:[J

    .line 41
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Ll/۫ۖ۫;->᩸:[J

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-wide v4, v0

    .line 43
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_2

    .line 44
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۨᩴ;

    .line 45
    invoke-virtual {v6}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_1

    .line 48
    invoke-virtual {v6}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v9

    cmp-long v7, v9, v0

    if-ltz v7, :cond_0

    const-wide v11, 0x7fffffffffffffffL

    sub-long/2addr v11, v4

    cmp-long v7, v9, v11

    if-gtz v7, :cond_0

    .line 52
    iget-object v7, p0, Ll/۫ۖ۫;->ۤ:[J

    aput-wide v9, v7, v3

    .line 53
    iget-object v7, p0, Ll/۫ۖ۫;->᩸:[J

    invoke-virtual {v6}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v11

    aput-wide v11, v7, v3

    add-long/2addr v4, v9

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 50
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v6}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    new-array v1, v8, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const v0, 0x7f120be2

    invoke-static {v0, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 46
    :cond_1
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v6}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    new-array v1, v8, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const v0, 0x7f120be1

    invoke-static {v0, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 56
    :cond_2
    iput-wide v4, p0, Ll/۫ۖ۫;->᩷:J

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 62
    invoke-static {p0}, Ll/ܽܳ᩸;->᩷(Ljava/lang/String;)Ll/ܺܳ᩸;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 63
    invoke-virtual {p0}, Ll/ܺܳ᩸;->᩷()Ll/᩻ܳ᩸;

    move-result-object v0

    sget-object v1, Ll/᩻ܳ᩸;->ܿ:Ll/᩻ܳ᩸;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ll/ܺܳ᩸;->ۙ()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/᩷ۨᩴ;)Ll/۫ۖ۫;
    .locals 14

    .line 68
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/۫ۖ۫;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Ll/۫ۖ۫;

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/۫ۖ۫;-><init>(Ljava/util/List;)V

    return-object v0

    .line 72
    :cond_0
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->۫ۙ()Ll/᩷ۨᩴ;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_11

    const-string v4, ".part"

    .line 76
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 77
    new-instance v5, Ljava/util/TreeMap;

    invoke-direct {v5}, Ljava/util/TreeMap;-><init>()V

    .line 413
    invoke-virtual {v1, v3}, Ll/᩷ۨᩴ;->᩷(Z)Ljava/util/List;

    move-result-object v1

    .line 78
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۨᩴ;

    .line 79
    invoke-virtual {v6}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v7

    .line 81
    invoke-static {v7}, Ll/۫ۖ۫;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 82
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    .line 83
    invoke-virtual {v5, v7, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_2

    goto :goto_0

    .line 84
    :cond_2
    new-instance p0, Ljava/io/IOException;

    new-array v0, v3, [Ljava/lang/Object;

    aput-object v7, v0, v2

    const v1, 0x7f120be5

    invoke-static {v1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 88
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 90
    invoke-virtual {v5}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v6, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 91
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const/16 v9, 0x61

    if-nez v6, :cond_5

    const/4 v6, 0x0

    .line 93
    :goto_2
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v10

    if-ge v6, v10, :cond_e

    .line 94
    invoke-virtual {v8, v6}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-ne v10, v9, :cond_4

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 95
    :cond_4
    new-instance p0, Ljava/io/IOException;

    new-array v0, v3, [Ljava/lang/Object;

    aput-object v4, v0, v2

    const v1, 0x7f1207ea

    invoke-static {v1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 116
    :cond_5
    invoke-virtual {v6}, Ljava/lang/String;->toCharArray()[C

    move-result-object v10

    .line 117
    array-length v11, v10

    sub-int/2addr v11, v3

    :goto_3
    const/16 v12, 0x7a

    if-ltz v11, :cond_7

    .line 118
    aget-char v13, v10, v11

    if-eq v13, v12, :cond_6

    add-int/lit8 v13, v13, 0x1

    int-to-char v9, v13

    .line 119
    aput-char v9, v10, v11

    .line 120
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v10}, Ljava/lang/String;-><init>([C)V

    goto :goto_4

    .line 122
    :cond_6
    aput-char v9, v10, v11

    add-int/lit8 v11, v11, -0x1

    goto :goto_3

    :cond_7
    const-string v9, ""

    :goto_4
    const/4 v10, 0x0

    .line 129
    :goto_5
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v10, v11, :cond_8

    invoke-virtual {v6, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v11, v12, :cond_8

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 132
    :cond_8
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v11

    sub-int/2addr v11, v3

    if-ge v10, v11, :cond_c

    add-int/lit8 v11, v10, 0x1

    invoke-virtual {v6, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v13, 0x79

    if-eq v10, v13, :cond_9

    goto :goto_7

    .line 135
    :cond_9
    :goto_6
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v10

    if-ge v11, v10, :cond_b

    add-int/lit8 v10, v11, 0x1

    .line 136
    invoke-virtual {v6, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-eq v11, v12, :cond_a

    goto :goto_7

    :cond_a
    move v11, v10

    goto :goto_6

    :cond_b
    const-string v10, "aa"

    .line 101
    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const/4 v10, 0x1

    goto :goto_8

    :cond_c
    :goto_7
    const/4 v10, 0x0

    .line 102
    :goto_8
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    if-eqz v10, :cond_d

    goto :goto_9

    .line 103
    :cond_d
    new-instance p0, Ljava/io/IOException;

    .line 0
    invoke-static {v4, v6}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const v0, 0x7f120be7

    .line 103
    invoke-static {v0, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 106
    :cond_e
    :goto_9
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۨᩴ;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v6, v8

    goto/16 :goto_1

    .line 109
    :cond_f
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_10

    invoke-virtual {v5, p0}, Ljava/util/TreeMap;->containsValue(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 112
    new-instance p0, Ll/۫ۖ۫;

    invoke-direct {p0, v0}, Ll/۫ۖ۫;-><init>(Ljava/util/List;)V

    return-object p0

    .line 110
    :cond_10
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p0, v1, v2

    const p0, 0x7f120be6

    invoke-static {p0, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_11
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p0, v1, v2

    const p0, 0x7f120be4

    invoke-static {p0, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic ۙ(Ll/۫ۖ۫;I)Ll/ܳܽۤ;
    .locals 0

    .line 181
    iget-object p0, p0, Ll/۫ۖ۫;->ۙ:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷ۨᩴ;

    const-string p1, "r"

    invoke-virtual {p0, p1}, Ll/᩷ۨᩴ;->֫(Ljava/lang/String;)Ll/ܳܽۤ;

    move-result-object p0

    return-object p0
.end method

.method private ۫()Ll/۬ܺۤ;
    .locals 3

    .line 176
    invoke-virtual {p0}, Ll/۫ۖ۫;->ܳ()V

    .line 177
    iget-object v0, p0, Ll/۫ۖ۫;->ۙ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 178
    invoke-virtual {p0}, Ll/۫ۖ۫;->᩷()Ll/᩷ۨᩴ;

    move-result-object v0

    const-string v1, "r"

    invoke-virtual {v0, v1}, Ll/᩷ۨᩴ;->ۧ(Ljava/lang/String;)Ll/۬ܺۤ;

    move-result-object v0

    return-object v0

    .line 180
    :cond_0
    invoke-virtual {p0}, Ll/۫ۖ۫;->᩷()Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll/֡۠֫;

    invoke-direct {v1, p0}, Ll/֡۠֫;-><init>(Ljava/lang/Object;)V

    iget-object v2, p0, Ll/۫ۖ۫;->ۤ:[J

    invoke-static {v0, v2, v1}, Ll/᩵ܽۤ;->ۙ(Ljava/lang/String;[JLl/ۗܽۤ;)Ll/᩵ܽۤ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧܽۤ;->ۙ(Ll/ܳܽۤ;)Ll/۬ܺۤ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 148
    iget-object v0, p0, Ll/۫ۖ۫;->ۙ:Ljava/util/List;

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;Z)Ll/ۚۗۨ;
    .locals 1

    .line 207
    invoke-direct {p0}, Ll/۫ۖ۫;->۫()Ll/۬ܺۤ;

    move-result-object v0

    if-eqz p2, :cond_0

    .line 210
    :try_start_0
    new-instance p2, Ll/ۚۗۨ;

    invoke-direct {p2, v0, p1}, Ll/ۚۗۨ;-><init>(Ll/۬ܺۤ;Ljava/lang/String;)V

    return-object p2

    .line 212
    :cond_0
    new-instance p2, Ll/ܳۖ۫;

    invoke-direct {p2, v0, p1}, Ll/ۚۗۨ;-><init>(Ll/۬ܺۤ;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 220
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ll/۬ܺۤ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_1

    :catch_2
    move-exception p2

    .line 222
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 224
    :goto_1
    throw p1
.end method

.method public final ۙ(Ljava/security/MessageDigest;)V
    .locals 6

    const/4 v0, 0x0

    .line 168
    :goto_0
    iget-object v1, p0, Ll/۫ۖ۫;->ۙ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 169
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۨᩴ;

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/ܳ֫ܺ;->ۙ(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 170
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/۫ۖ۫;->ۤ:[J

    aget-wide v4, v3, v0

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/۫ۖ۫;->᩸:[J

    aget-wide v3, v2, v0

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/ܳ֫ܺ;->ۙ(Ljava/security/MessageDigest;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۤ()Z
    .locals 3

    .line 158
    :try_start_0
    invoke-virtual {p0}, Ll/۫ۖ۫;->᩷()Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۫ۖ۫;->ۙ(Ll/᩷ۨᩴ;)Ll/۫ۖ۫;

    move-result-object v0

    .line 159
    iget-object v1, p0, Ll/۫ۖ۫;->ۙ:Ljava/util/List;

    iget-object v2, v0, Ll/۫ۖ۫;->ۙ:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/۫ۖ۫;->ۤ:[J

    iget-object v2, v0, Ll/۫ۖ۫;->ۤ:[J

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/۫ۖ۫;->᩸:[J

    iget-object v0, v0, Ll/۫ۖ۫;->᩸:[J

    .line 160
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 186
    :goto_0
    iget-object v2, p0, Ll/۫ۖ۫;->ۙ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 187
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۨᩴ;

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۨᩴ;

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v3

    iget-object v5, p0, Ll/۫ۖ۫;->ۤ:[J

    aget-wide v6, v5, v1

    cmp-long v5, v3, v6

    if-nez v5, :cond_0

    .line 188
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۨᩴ;

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v3

    iget-object v5, p0, Ll/۫ۖ۫;->᩸:[J

    aget-wide v6, v5, v1

    cmp-long v5, v3, v6

    if-nez v5, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 189
    :cond_0
    new-instance v3, Ljava/io/IOException;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۨᩴ;

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v0

    const v0, 0x7f120be0

    invoke-static {v0, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_1
    return-void
.end method

.method public final ᩴ()Ljava/io/BufferedInputStream;
    .locals 6

    .line 196
    invoke-direct {p0}, Ll/۫ۖ۫;->۫()Ll/۬ܺۤ;

    move-result-object v0

    .line 197
    new-instance v1, Ljava/io/BufferedInputStream;

    new-instance v2, Ll/ᩴۖ۫;

    .line 195
    new-instance v3, Ll/᩻ܽۤ;

    .line 215
    invoke-virtual {v0}, Ll/۬ܺۤ;->getFilePointer()J

    move-result-wide v4

    invoke-direct {v3, v4, v5, v0}, Ll/᩻ܽۤ;-><init>(JLl/۬ܺۤ;)V

    .line 197
    invoke-direct {v2, v3, v0}, Ll/ᩴۖ۫;-><init>(Ll/᩻ܽۤ;Ll/۬ܺۤ;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v1
.end method

.method public final ᩷()Ll/᩷ۨᩴ;
    .locals 2

    .line 144
    iget-object v0, p0, Ll/۫ۖ۫;->ۙ:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۨᩴ;

    return-object v0
.end method

.method public final ᩸()J
    .locals 2

    .line 152
    iget-wide v0, p0, Ll/۫ۖ۫;->᩷:J

    return-wide v0
.end method

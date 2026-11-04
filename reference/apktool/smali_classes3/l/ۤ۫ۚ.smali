.class public final Ll/ۤ۫ۚ;
.super Ljava/lang/Object;
.source "P776"


# instance fields
.field public final ۙ:Ll/᩷ܿۚ;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ll/᩷ܿۚ;

    .line 32
    invoke-static {}, Ll/ᩴᩴۚ;->ۙ()Ll/᩸ᩴۚ;

    move-result-object v1

    invoke-static {}, Ll/ᩴᩴۚ;->᩷()Ll/ۢܿۚ;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/᩷ܿۚ;-><init>(Ll/᩸ᩴۚ;Ll/ۢܿۚ;)V

    iput-object v0, p0, Ll/ۤ۫ۚ;->ۙ:Ll/᩷ܿۚ;

    return-void
.end method

.method public static ۙ(Ll/᩷ۨᩴ;Ll/ۡۘۚ;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 11

    .line 126
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 127
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 128
    new-instance v2, Ll/ۜܳۚ;

    const-string v3, ""

    invoke-direct {v2, p0, v3}, Ll/ۜܳۚ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 129
    :cond_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_5

    .line 130
    invoke-virtual {v1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۜܳۚ;

    .line 131
    iget-object v2, p0, Ll/ۜܳۚ;->ۙ:Ll/᩷ۨᩴ;

    iget-object p0, p0, Ll/ۜܳۚ;->᩷:Ljava/lang/String;

    const/4 v3, 0x1

    .line 413
    invoke-virtual {v2, v3}, Ll/᩷ۨᩴ;->᩷(Z)Ljava/util/List;

    move-result-object v2

    .line 132
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ll/᩷ۨᩴ;

    .line 134
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/ۡۘۚ;->ۙ(Ljava/lang/String;)Ll/ۢۘۚ;

    move-result-object v3

    iget-object v3, v3, Ll/ۢۘۚ;->ۙ:Ll/۟ۘۚ;

    invoke-virtual {v3}, Ll/۟ۘۚ;->ۙ()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 137
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 138
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_3
    const-string v3, "/"

    .line 0
    invoke-static {p0, v3}, Ll/ۗۚ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 139
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_1
    move-object v6, v3

    .line 140
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ۛۙ()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 202
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ܰۙ()Z

    move-result v3

    if-nez v3, :cond_1

    .line 142
    new-instance v3, Ll/ۜܳۚ;

    invoke-direct {v3, v5, v6}, Ll/ۜܳۚ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    .line 144
    :cond_4
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 202
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ܰۙ()Z

    move-result v3

    if-nez v3, :cond_1

    .line 144
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 195
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, ".apk"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 145
    invoke-virtual {v6, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 146
    new-instance v3, Ll/۬ܳۚ;

    invoke-virtual {v5}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v7

    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v9

    move-object v4, v3

    invoke-direct/range {v4 .. v10}, Ll/۬ܳۚ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    return-object v0
.end method

.method private ۙ(Ll/۬ܳۚ;)Ll/ۙ۫ۚ;
    .locals 17

    move-object/from16 v1, p1

    const/4 v2, 0x0

    move-object/from16 v3, p0

    .line 211
    :try_start_0
    iget-object v0, v3, Ll/ۤ۫ۚ;->ۙ:Ll/᩷ܿۚ;

    iget-object v4, v1, Ll/۬ܳۚ;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v0, v4}, Ll/᩷ܿۚ;->ۙ(Ll/᩷ۨᩴ;)V

    .line 212
    new-instance v4, Ll/᩸ܽܺ;

    iget-object v0, v1, Ll/۬ܳۚ;->ۙ:Ll/᩷ۨᩴ;

    invoke-direct {v4, v0}, Ll/᩸ܽܺ;-><init>(Ll/᩷ۨᩴ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    :try_start_1
    invoke-static {v4}, Ll/ۙۚۚ;->ۙ(Ll/᩸ܽܺ;)Ll/ۜ۫ۚ;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 214
    :try_start_2
    invoke-virtual {v4}, Ll/᩸ܽܺ;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v5, v0

    .line 212
    :try_start_3
    invoke-virtual {v4}, Ll/᩸ܽܺ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v4, v0

    :try_start_4
    invoke-virtual {v5, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    .line 248
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    const-string v0, "Failed to parse APK manifest."

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 40
    :goto_1
    new-instance v4, Ll/ۜ۫ۚ;

    invoke-direct {v4}, Ll/ۜ۫ۚ;-><init>()V

    .line 41
    iput-boolean v2, v4, Ll/ۜ۫ۚ;->ۤ:Z

    .line 42
    iput-object v0, v4, Ll/ۜ۫ۚ;->᩸:Ljava/lang/String;

    move-object v0, v4

    .line 218
    :goto_2
    iget-object v4, v0, Ll/ۜ۫ۚ;->ۙ:Ljava/lang/String;

    if-eqz v4, :cond_1

    :goto_3
    move-object v11, v4

    goto :goto_4

    :cond_1
    iget-object v4, v0, Ll/ۜ۫ۚ;->᩷:Ljava/lang/String;

    goto :goto_3

    .line 219
    :goto_4
    new-instance v4, Ll/ۙ۫ۚ;

    iget-object v6, v1, Ll/۬ܳۚ;->ۤ:Ljava/lang/String;

    iget-wide v7, v1, Ll/۬ܳۚ;->᩸:J

    iget-wide v9, v1, Ll/۬ܳۚ;->᩷:J

    iget-object v12, v0, Ll/ۜ۫ۚ;->۫:Ljava/lang/String;

    iget-object v13, v0, Ll/ۜ۫ۚ;->ۧ:Ljava/lang/String;

    iget-object v1, v0, Ll/ۜ۫ۚ;->֫:Ljava/lang/String;

    const/4 v5, 0x0

    if-eqz v1, :cond_5

    .line 228
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_2

    goto :goto_6

    .line 231
    :cond_2
    :goto_5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v2, v14, :cond_4

    .line 232
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v14

    const/16 v15, 0x30

    if-lt v14, v15, :cond_5

    const/16 v15, 0x39

    if-le v14, v15, :cond_3

    goto :goto_6

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 238
    :cond_4
    :try_start_5
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_1

    move-object v14, v1

    goto :goto_7

    :catch_1
    :cond_5
    :goto_6
    move-object v14, v5

    .line 220
    :goto_7
    iget-boolean v15, v0, Ll/ۜ۫ۚ;->ۤ:Z

    iget-object v0, v0, Ll/ۜ۫ۚ;->᩸:Ljava/lang/String;

    move-object v5, v4

    move-object/from16 v16, v0

    invoke-direct/range {v5 .. v16}, Ll/ۙ۫ۚ;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;)V

    return-object v4
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 256
    :cond_0
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 257
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, ""

    const-string v3, "prefix"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 255
    invoke-static {p1, v3, p0, v0, v1}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;IIZ)Ll/᩷۫ۚ;
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v7, p2

    .line 45
    iget-object v2, v1, Ll/ۤ۫ۚ;->ۙ:Ll/᩷ܿۚ;

    if-eqz v0, :cond_18

    .line 100
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    const-string v0, ""

    :cond_0
    move-object v3, v0

    goto/16 :goto_6

    .line 103
    :cond_1
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v6, 0x2f

    if-eq v3, v6, :cond_17

    const/16 v3, 0x5c

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-gez v3, :cond_17

    invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-gez v3, :cond_17

    const/16 v3, 0x3a

    .line 264
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-gtz v3, :cond_2

    goto :goto_3

    :cond_2
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_17

    .line 269
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x7a

    const/16 v10, 0x61

    const/16 v11, 0x5a

    const/16 v12, 0x41

    if-nez v6, :cond_4

    if-lt v8, v12, :cond_3

    if-le v8, v11, :cond_5

    :cond_3
    if-lt v8, v10, :cond_9

    if-gt v8, v9, :cond_9

    goto :goto_1

    :cond_4
    if-lt v8, v12, :cond_6

    if-le v8, v11, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    move/from16 v10, p3

    goto/16 :goto_e

    :cond_6
    :goto_2
    if-lt v8, v10, :cond_7

    if-le v8, v9, :cond_5

    :cond_7
    const/16 v9, 0x30

    if-lt v8, v9, :cond_8

    const/16 v9, 0x39

    if-le v8, v9, :cond_5

    :cond_8
    const/16 v9, 0x2b

    if-eq v8, v9, :cond_5

    const/16 v9, 0x2d

    if-eq v8, v9, :cond_5

    const/16 v9, 0x2e

    if-ne v8, v9, :cond_9

    goto :goto_1

    :cond_9
    :goto_3
    const-string v3, "/"

    const/4 v6, -0x1

    .line 107
    invoke-virtual {v0, v3, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    .line 108
    :goto_4
    array-length v8, v3

    if-ge v6, v8, :cond_0

    .line 109
    aget-object v8, v3, v6

    .line 110
    array-length v9, v3

    sub-int/2addr v9, v4

    if-ne v6, v9, :cond_a

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_a

    goto :goto_5

    .line 114
    :cond_a
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_b

    const-string v9, "."

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    const-string v9, ".."

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :goto_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_b
    const-string v2, "prefix must not contain empty, dot, or parent segments"

    .line 115
    invoke-static {v0, v2}, Ll/ۤ۫ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0

    .line 46
    :goto_6
    invoke-static {}, Ll/ᩴᩴۚ;->ۙ()Ll/᩸ᩴۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ᩴۚ;->ۙ()Ll/ۡۘۚ;

    move-result-object v0

    .line 47
    iget-object v4, v0, Ll/ۡۘۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ll/ۡۘۚ;->ۤ(Ljava/lang/String;)V

    const/4 v6, 0x0

    if-eqz p4, :cond_d

    .line 48
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_d

    .line 158
    invoke-static {}, Ll/᩻۫ۚ;->ۙ()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_c

    goto :goto_7

    :cond_c
    :try_start_0
    const-string v9, "path"

    .line 163
    invoke-static {v8, v9}, Ll/֡ܰۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8
    :try_end_0
    .catch Ll/ۢܳۚ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    :cond_d
    :goto_7
    move-object v8, v6

    :goto_8
    if-nez v8, :cond_e

    .line 51
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    goto :goto_9

    .line 52
    :cond_e
    filled-new-array {v4, v8}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    :goto_9
    new-array v10, v5, [Ljava/lang/String;

    .line 53
    invoke-static {v4, v10}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v4

    .line 55
    invoke-static {}, Ll/ᩴᩴۚ;->᩷()Ll/ۢܿۚ;

    move-result-object v10

    invoke-virtual {v10, v9}, Ll/ۢܿۚ;->ۙ(Ljava/util/List;)Ll/ᩳܿۚ;

    move-result-object v9

    .line 56
    :try_start_1
    invoke-virtual {v2, v4}, Ll/᩷ܿۚ;->ۙ(Ll/᩷ۨᩴ;)V

    .line 57
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->֨()Z

    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v11, "warning"

    if-eqz v10, :cond_16

    .line 61
    :try_start_2
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ۛۙ()Z

    move-result v10

    if-eqz v10, :cond_15

    .line 65
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->᩹()Z

    move-result v10

    if-eqz v10, :cond_14

    .line 70
    invoke-static {v4, v0, v3}, Ll/ۤ۫ۚ;->ۙ(Ll/᩷ۨᩴ;Ll/ۡۘۚ;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 71
    new-instance v4, Ll/۠ܳۚ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v4}, Ll/ۖ۫ۗ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v4

    invoke-static {v0, v4}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 72
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move/from16 v10, p3

    invoke-static {v10, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    const/4 v10, 0x1

    .line 73
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v7}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz p4, :cond_12

    if-nez v4, :cond_12

    .line 76
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_12

    if-nez v8, :cond_f

    goto :goto_a

    :cond_f
    new-array v5, v5, [Ljava/lang/String;

    .line 178
    invoke-static {v8, v5}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 180
    :try_start_3
    invoke-virtual {v2, v13}, Ll/᩷ܿۚ;->ۙ(Ll/᩷ۨᩴ;)V
    :try_end_3
    .catch Ll/ۢܳۚ; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    :try_start_4
    invoke-virtual {v13}, Ll/᩷ۨᩴ;->֨()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual {v13}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_a

    .line 188
    :cond_10
    new-instance v2, Ll/۬ܳۚ;

    const-string v14, "mt://current-apk"

    invoke-virtual {v13}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v15

    invoke-virtual {v13}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v17

    move-object v12, v2

    invoke-direct/range {v12 .. v18}, Ll/۬ܳۚ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;JJ)V

    invoke-direct {v1, v2}, Ll/ۤ۫ۚ;->ۙ(Ll/۬ܳۚ;)Ll/ۙ۫ۚ;

    move-result-object v6

    goto :goto_a

    :catch_1
    nop

    :cond_11
    :goto_a
    if-eqz v6, :cond_12

    .line 79
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v7, -0x1

    goto :goto_b

    :cond_12
    const/4 v10, 0x0

    move v2, v7

    :goto_b
    add-int/2addr v2, v4

    .line 84
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v8

    :goto_c
    if-ge v4, v8, :cond_13

    .line 86
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ܳۚ;

    invoke-direct {v1, v2}, Ll/ۤ۫ۚ;->ۙ(Ll/۬ܳۚ;)Ll/ۙ۫ۚ;

    move-result-object v2

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    .line 88
    :cond_13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int v6, v2, v10

    .line 89
    new-instance v10, Ll/᩷۫ۚ;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    move-object v2, v10

    move-object v4, v11

    move/from16 v7, p2

    invoke-direct/range {v2 .. v8}, Ll/᩷۫ۚ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;IIII)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 90
    invoke-virtual {v9}, Ll/ᩳܿۚ;->close()V

    return-object v10

    :cond_14
    :try_start_5
    const-string v0, "AVAILABLE_APK_DIRECTORY_UNREADABLE"

    const-string v2, "Available APK directory is not readable."

    .line 66
    invoke-static {v6, v0, v2, v11}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0

    :cond_15
    const-string v0, "AVAILABLE_APK_DIRECTORY_NOT_DIRECTORY"

    const-string v2, "Available APK path is not a directory."

    .line 62
    invoke-static {v0, v2}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0

    :cond_16
    const-string v0, "AVAILABLE_APK_DIRECTORY_NOT_FOUND"

    const-string v2, "Available APK directory does not exist."

    .line 58
    invoke-static {v6, v0, v2, v11}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 54
    :try_start_6
    invoke-virtual {v9}, Ll/ᩳܿۚ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_d

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_d
    throw v2

    :goto_e
    add-int/lit8 v6, v6, 0x1

    const/4 v4, 0x1

    goto/16 :goto_0

    :cond_17
    const-string v2, "prefix must be a relative path prefix"

    .line 105
    invoke-static {v0, v2}, Ll/ۤ۫ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0

    :cond_18
    const-string v2, "prefix must be a string"

    .line 98
    invoke-static {v0, v2}, Ll/ۤ۫ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0
.end method

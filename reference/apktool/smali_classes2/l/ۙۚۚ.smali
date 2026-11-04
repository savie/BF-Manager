.class public final Ll/ۙۚۚ;
.super Ljava/lang/Object;
.source "M7AC"


# direct methods
.method public static ۙ(Ll/ۡ᩻ܺ;Ljava/lang/String;Ll/᩶ۤۤ;)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    .line 179
    :goto_0
    invoke-virtual {p0}, Ll/ۡ᩻ܺ;->getAttributeCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 180
    invoke-virtual {p0, v0}, Ll/ۡ᩻ܺ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 181
    sget p1, Ll/ۤۚۚ;->ۙ:I

    .line 283
    new-instance p1, Ll/ܿܽۤ;

    invoke-direct {p1}, Ll/ܿܽۤ;-><init>()V

    .line 294
    invoke-virtual {p0, v0}, Ll/ۡ᩻ܺ;->۫(I)I

    move-result v2

    invoke-virtual {p0, v0}, Ll/ۡ᩻ܺ;->᩸(I)I

    move-result v3

    .line 295
    invoke-virtual {p0, v0}, Ll/ۡ᩻ܺ;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v0}, Ll/ۡ᩻ܺ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v5

    .line 296
    invoke-virtual {p0, v0}, Ll/ۡ᩻ܺ;->getAttributeNameResource(I)I

    move-result v6

    invoke-virtual {p0, v0}, Ll/ۡ᩻ܺ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v7

    move-object v1, p1

    move-object v8, p2

    .line 294
    invoke-static/range {v1 .. v8}, Ll/ۤۚۚ;->ۙ(Ll/ܿܽۤ;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ll/᩶ۤۤ;)V

    .line 285
    invoke-virtual {p1}, Ll/ܿܽۤ;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/᩸ܽܺ;)Ll/ۜ۫ۚ;
    .locals 1

    const/4 v0, 0x0

    .line 32
    invoke-static {p0, v0}, Ll/ۙۚۚ;->ۙ(Ll/᩸ܽܺ;Z)Ll/ۜ۫ۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/᩸ܽܺ;Z)Ll/ۜ۫ۚ;
    .locals 10

    const-string v0, "AndroidManifest.xml"

    .line 41
    invoke-virtual {p0, v0}, Ll/᩸ܽܺ;->getEntry(Ljava/lang/String;)Ll/۟ܺܺ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 40
    new-instance p0, Ll/ۜ۫ۚ;

    invoke-direct {p0}, Ll/ۜ۫ۚ;-><init>()V

    .line 41
    iput-boolean v1, p0, Ll/ۜ۫ۚ;->ۤ:Z

    const-string p1, "AndroidManifest.xml not found"

    .line 42
    :goto_0
    iput-object p1, p0, Ll/ۜ۫ۚ;->᩸:Ljava/lang/String;

    return-object p0

    :cond_0
    const-string v2, "resources.arsc"

    .line 45
    invoke-virtual {p0, v2}, Ll/᩸ܽܺ;->getEntry(Ljava/lang/String;)Ll/۟ܺܺ;

    move-result-object v2

    if-eqz p1, :cond_3

    .line 47
    invoke-virtual {v0}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    if-nez v2, :cond_1

    move-wide v7, v5

    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {v2}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v7

    :goto_1
    cmp-long v9, v3, v5

    if-ltz v9, :cond_2

    cmp-long v9, v7, v5

    if-ltz v9, :cond_2

    const-wide/32 v5, 0x200000

    cmp-long v9, v3, v5

    if-gtz v9, :cond_2

    sub-long/2addr v5, v3

    cmp-long v3, v7, v5

    if-lez v3, :cond_3

    .line 40
    :cond_2
    new-instance p0, Ll/ۜ۫ۚ;

    invoke-direct {p0}, Ll/ۜ۫ۚ;-><init>()V

    .line 41
    iput-boolean v1, p0, Ll/ۜ۫ۚ;->ۤ:Z

    const-string p1, "Manifest log input exceeds size limit"

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    .line 1757
    :try_start_0
    invoke-virtual {p0, v0, v3}, Ll/᩸ܽܺ;->ۙ(Ll/۟ܺܺ;Ll/ۗۧܺ;)[B

    move-result-object v0

    .line 55
    invoke-static {v0}, Ll/ܰ᩻ܺ;->᩷([B)Ll/ܰ᩻ܺ;

    move-result-object v0

    .line 56
    new-instance v4, Ll/ۜ۫ۚ;

    invoke-direct {v4}, Ll/ۜ۫ۚ;-><init>()V

    if-nez v2, :cond_4

    .line 58
    new-instance p0, Ll/᩶ۤۤ;

    invoke-direct {p0}, Ll/᩶ۤۤ;-><init>()V

    goto :goto_3

    :cond_4
    if-eqz p1, :cond_5

    .line 59
    new-instance p1, Ll/᩶ۤۤ;

    new-instance v5, Ll/᩺۫ۤ;

    .line 1757
    invoke-virtual {p0, v2, v3}, Ll/᩸ܽܺ;->ۙ(Ll/۟ܺܺ;Ll/ۗۧܺ;)[B

    move-result-object p0

    .line 59
    invoke-direct {v5, p0}, Ll/᩺۫ۤ;-><init>([B)V

    .line 90
    invoke-direct {p1, v1, v5}, Ll/᩶ۤۤ;-><init>(ILl/ۜܳۤ;)V

    goto :goto_2

    .line 60
    :cond_5
    new-instance p1, Ll/᩶ۤۤ;

    invoke-direct {p1, p0}, Ll/᩶ۤۤ;-><init>(Ll/᩸ܽܺ;)V

    :goto_2
    move-object p0, p1

    .line 61
    :goto_3
    invoke-virtual {v0, p0}, Ll/ܰ᩻ܺ;->ۙ(Ll/᩶ۤۤ;)[B

    .line 62
    invoke-virtual {v0}, Ll/ܰ᩻ܺ;->۫()Ll/ۡ᩻ܺ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    :goto_4
    move-object v0, v3

    .line 65
    :cond_7
    :goto_5
    :try_start_1
    invoke-virtual {p1}, Ll/ۡ᩻ܺ;->next()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v5, 0x1

    if-eq v2, v5, :cond_1b

    const/4 v6, 0x2

    const-string v7, "intent-filter"

    const-string v8, "activity-alias"

    const-string v9, "activity"

    if-ne v2, v6, :cond_17

    .line 67
    :try_start_2
    invoke-virtual {p1}, Ll/ۡ᩻ܺ;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v6, "manifest"

    .line 68
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const-string v2, "package"

    .line 69
    invoke-static {p1, v2, p0}, Ll/ۙۚۚ;->ۙ(Ll/ۡ᩻ܺ;Ljava/lang/String;Ll/᩶ۤۤ;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Ll/ۜ۫ۚ;->۫:Ljava/lang/String;

    const-string v2, "versionName"

    .line 70
    invoke-static {p1, v2, p0}, Ll/ۙۚۚ;->ۙ(Ll/ۡ᩻ܺ;Ljava/lang/String;Ll/᩶ۤۤ;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Ll/ۜ۫ۚ;->ۧ:Ljava/lang/String;

    const-string v2, "versionCode"

    .line 71
    invoke-static {p1, v2, p0}, Ll/ۙۚۚ;->ۙ(Ll/ۡ᩻ܺ;Ljava/lang/String;Ll/᩶ۤۤ;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Ll/ۜ۫ۚ;->֫:Ljava/lang/String;

    goto :goto_5

    :cond_8
    const-string v6, "uses-sdk"

    .line 72
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    const-string v2, "minSdkVersion"

    .line 73
    invoke-static {p1, v2, p0}, Ll/ۙۚۚ;->ۙ(Ll/ۡ᩻ܺ;Ljava/lang/String;Ll/᩶ۤۤ;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Ll/ۜ۫ۚ;->ܳ:Ljava/lang/String;

    const-string v2, "targetSdkVersion"

    .line 74
    invoke-static {p1, v2, p0}, Ll/ۙۚۚ;->ۙ(Ll/ۡ᩻ܺ;Ljava/lang/String;Ll/᩶ۤۤ;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Ll/ۜ۫ۚ;->ۚ:Ljava/lang/String;

    goto :goto_5

    :cond_9
    const-string v6, "uses-permission"

    .line 75
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_5

    :cond_a
    const-string v6, "application"

    .line 77
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 78
    invoke-static {v4, p1, p0}, Ll/ۙۚۚ;->ۙ(Ll/ۜ۫ۚ;Ll/ۡ᩻ܺ;Ll/᩶ۤۤ;)V

    goto :goto_5

    .line 79
    :cond_b
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v9, "name"

    if-nez v6, :cond_12

    :try_start_3
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    goto/16 :goto_6

    :cond_c
    if-eqz v0, :cond_d

    .line 83
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 249
    iput-boolean v5, v0, Ll/۬۫ۚ;->ۤ:Z

    .line 250
    iput-boolean v1, v0, Ll/۬۫ۚ;->᩷:Z

    .line 251
    iput-boolean v1, v0, Ll/۬۫ۚ;->ۙ:Z

    goto/16 :goto_5

    :cond_d
    const-string v5, "service"

    .line 85
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    goto/16 :goto_5

    :cond_e
    const-string v5, "receiver"

    .line 87
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    goto/16 :goto_5

    :cond_f
    const-string v5, "provider"

    .line 89
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    goto/16 :goto_5

    :cond_10
    if-eqz v0, :cond_11

    const-string v5, "action"

    .line 91
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    .line 92
    invoke-static {p1, v9, p0}, Ll/ۙۚۚ;->ۙ(Ll/ۡ᩻ܺ;Ljava/lang/String;Ll/᩶ۤۤ;)Ljava/lang/String;

    move-result-object v2

    .line 258
    iget-boolean v5, v0, Ll/۬۫ۚ;->ۤ:Z

    if-eqz v5, :cond_7

    .line 259
    iget-boolean v5, v0, Ll/۬۫ۚ;->᩷:Z

    const-string v6, "android.intent.action.MAIN"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v5

    iput-boolean v2, v0, Ll/۬۫ۚ;->᩷:Z

    goto/16 :goto_5

    :cond_11
    if-eqz v0, :cond_7

    const-string v5, "category"

    .line 93
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 94
    invoke-static {p1, v9, p0}, Ll/ۙۚۚ;->ۙ(Ll/ۡ᩻ܺ;Ljava/lang/String;Ll/᩶ۤۤ;)Ljava/lang/String;

    move-result-object v2

    .line 267
    iget-boolean v5, v0, Ll/۬۫ۚ;->ۤ:Z

    if-eqz v5, :cond_7

    .line 268
    iget-boolean v5, v0, Ll/۬۫ۚ;->ۙ:Z

    const-string v6, "android.intent.category.LAUNCHER"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v5

    iput-boolean v2, v0, Ll/۬۫ۚ;->ۙ:Z

    goto/16 :goto_5

    .line 81
    :cond_12
    :goto_6
    new-instance v0, Ll/۬۫ۚ;

    iget-object v5, v4, Ll/ۜ۫ۚ;->۫:Ljava/lang/String;

    .line 82
    invoke-static {p1, v9, p0}, Ll/ۙۚۚ;->ۙ(Ll/ۡ᩻ܺ;Ljava/lang/String;Ll/᩶ۤۤ;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "targetActivity"

    invoke-static {p1, v7, p0}, Ll/ۙۚۚ;->ۙ(Ll/ۡ᩻ܺ;Ljava/lang/String;Ll/᩶ۤۤ;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "activity-alias"

    .line 210
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    if-eqz v7, :cond_13

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_13

    move-object v6, v7

    :cond_13
    if-eqz v6, :cond_16

    .line 192
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_16

    if-eqz v5, :cond_16

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_7

    :cond_14
    const/4 v2, 0x0

    .line 195
    invoke-virtual {v6, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v7, 0x2e

    if-ne v2, v7, :cond_15

    .line 196
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_7

    .line 198
    :cond_15
    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-gez v2, :cond_16

    const-string v2, "."

    .line 0
    invoke-static {v5, v2, v6}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 81
    :cond_16
    :goto_7
    invoke-direct {v0, v6}, Ll/۬۫ۚ;-><init>(Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_17
    const/4 v6, 0x3

    if-ne v2, v6, :cond_7

    .line 97
    invoke-virtual {p1}, Ll/ۡ᩻ܺ;->getName()Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_19

    .line 98
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_19

    .line 276
    iget-boolean v2, v0, Ll/۬۫ۚ;->ۤ:Z

    if-eqz v2, :cond_18

    iget-boolean v2, v0, Ll/۬۫ۚ;->᩷:Z

    if-eqz v2, :cond_18

    iget-boolean v2, v0, Ll/۬۫ۚ;->ۙ:Z

    if-eqz v2, :cond_18

    .line 277
    iput-boolean v5, v0, Ll/۬۫ۚ;->᩸:Z

    .line 279
    :cond_18
    iput-boolean v1, v0, Ll/۬۫ۚ;->ۤ:Z

    .line 280
    iput-boolean v1, v0, Ll/۬۫ۚ;->᩷:Z

    .line 281
    iput-boolean v1, v0, Ll/۬۫ۚ;->ۙ:Z

    goto/16 :goto_5

    :cond_19
    if-eqz v0, :cond_7

    .line 100
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1a

    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 101
    :cond_1a
    iget-boolean v2, v0, Ll/۬۫ۚ;->᩸:Z

    if-eqz v2, :cond_6

    iget-object v0, v0, Ll/۬۫ۚ;->ᩴ:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 102
    iget-object v2, v4, Ll/ۜ۫ۚ;->ᩴ:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_4

    .line 108
    :cond_1b
    :try_start_4
    invoke-virtual {p1}, Ll/ۡ᩻ܺ;->close()V

    .line 109
    iput-boolean v5, v4, Ll/ۜ۫ۚ;->ۤ:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object v4

    :catchall_0
    move-exception p0

    .line 62
    :try_start_5
    invoke-virtual {p1}, Ll/ۡ᩻ܺ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception p1

    :try_start_6
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception p0

    .line 113
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1c

    const-string p0, "Failed to parse manifest"

    goto :goto_9

    :cond_1c
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    .line 40
    :goto_9
    new-instance p1, Ll/ۜ۫ۚ;

    invoke-direct {p1}, Ll/ۜ۫ۚ;-><init>()V

    .line 41
    iput-boolean v1, p1, Ll/ۜ۫ۚ;->ۤ:Z

    .line 42
    iput-object p0, p1, Ll/ۜ۫ۚ;->᩸:Ljava/lang/String;

    return-object p1
.end method

.method public static ۙ(Ll/ۜ۫ۚ;Ll/ۡ᩻ܺ;Ll/᩶ۤۤ;)V
    .locals 10

    const/4 v0, 0x0

    .line 136
    :goto_0
    invoke-virtual {p1}, Ll/ۡ᩻ܺ;->getAttributeCount()I

    move-result v1

    if-ge v0, v1, :cond_8

    const-string v1, "label"

    .line 137
    invoke-virtual {p1, v0}, Ll/ۡ᩻ܺ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 140
    :cond_0
    sget v1, Ll/ۤۚۚ;->ۙ:I

    .line 283
    new-instance v1, Ll/ܿܽۤ;

    invoke-direct {v1}, Ll/ܿܽۤ;-><init>()V

    .line 294
    invoke-virtual {p1, v0}, Ll/ۡ᩻ܺ;->۫(I)I

    move-result v3

    invoke-virtual {p1, v0}, Ll/ۡ᩻ܺ;->᩸(I)I

    move-result v4

    .line 295
    invoke-virtual {p1, v0}, Ll/ۡ᩻ܺ;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v0}, Ll/ۡ᩻ܺ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v6

    .line 296
    invoke-virtual {p1, v0}, Ll/ۡ᩻ܺ;->getAttributeNameResource(I)I

    move-result v7

    invoke-virtual {p1, v0}, Ll/ۡ᩻ܺ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v8

    move-object v2, v1

    move-object v9, p2

    .line 294
    invoke-static/range {v2 .. v9}, Ll/ۤۚۚ;->ۙ(Ll/ܿܽۤ;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ll/᩶ۤۤ;)V

    .line 285
    invoke-virtual {v1}, Ll/ܿܽۤ;->toString()Ljava/lang/String;

    move-result-object v1

    .line 140
    iput-object v1, p0, Ll/ۜ۫ۚ;->᩷:Ljava/lang/String;

    .line 141
    invoke-virtual {p1, v0}, Ll/ۡ᩻ܺ;->۫(I)I

    move-result v1

    .line 142
    invoke-virtual {p1, v0}, Ll/ۡ᩻ܺ;->᩸(I)I

    move-result v2

    invoke-virtual {p1, v0}, Ll/ۡ᩻ܺ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v3, 0x3

    if-ne v1, v3, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    .line 224
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_6

    :goto_1
    move-object p1, v0

    goto :goto_2

    :cond_2
    const/4 p1, 0x1

    if-ne v1, p1, :cond_7

    if-nez v2, :cond_3

    goto :goto_3

    .line 163
    :cond_3
    :try_start_0
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 164
    invoke-virtual {p2, v2, v1, p1}, Ll/᩶ۤۤ;->ۙ(ILandroid/util/TypedValue;Z)V

    .line 165
    iget p1, v1, Landroid/util/TypedValue;->type:I

    if-ne p1, v3, :cond_7

    iget-object p1, v1, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-nez p1, :cond_4

    goto :goto_3

    .line 168
    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_3

    .line 224
    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    move-object v0, p1

    goto :goto_3

    :catch_0
    nop

    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    .line 144
    iput-object v0, p0, Ll/ۜ۫ۚ;->ۙ:Ljava/lang/String;

    :cond_8
    return-void
.end method

.method public static ᩷(Ll/᩸ܽܺ;)Ll/ۜ۫ۚ;
    .locals 1

    const/4 v0, 0x1

    .line 37
    invoke-static {p0, v0}, Ll/ۙۚۚ;->ۙ(Ll/᩸ܽܺ;Z)Ll/ۜ۫ۚ;

    move-result-object p0

    return-object p0
.end method

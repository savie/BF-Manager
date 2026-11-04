.class public final Ll/ۧ۫ۚ;
.super Ljava/lang/Object;
.source "66FP"


# direct methods
.method public static ۙ(Ljava/lang/String;)Ljava/lang/Long;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 169
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 170
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    .line 171
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v1

    const-wide v3, 0x1fffffffffffffL

    cmp-long p0, v1, v3

    if-gtz p0, :cond_2

    .line 172
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static ۙ(Landroid/content/pm/ApplicationInfo;)Ljava/util/ArrayList;
    .locals 6

    .line 156
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 157
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 158
    iget-object v2, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 159
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    if-eqz p0, :cond_1

    .line 160
    array-length v2, p0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, p0, v3

    if-eqz v4, :cond_0

    .line 161
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/ۚ۫ۚ;
    .locals 25

    move-object/from16 v1, p2

    .line 82
    invoke-static {}, Ll/᩶᩷ۧ;->ܶ()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 85
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_4

    .line 89
    new-instance v4, Ll/ܳ۫ۚ;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Ll/ܳ۫ۚ;-><init>(I)V

    invoke-static {v0, v4}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 90
    new-instance v4, Ll/۫۫ۚ;

    invoke-direct {v4, v5}, Ll/۫۫ۚ;-><init>(I)V

    invoke-static {v4}, Ll/ۖ۫ۗ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v4

    invoke-static {v0, v4}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 91
    new-instance v4, Ll/ۚ۫ۚ;

    invoke-direct {v4}, Ll/ۚ۫ۚ;-><init>()V

    const-string v5, "com.android.permission.GET_INSTALLED_APPS"

    .line 144
    sget-object v6, Ll/᩶᩷ۧ;->᩷:Ll/ܽܿ֫;

    .line 145
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1e

    const/4 v9, 0x1

    if-lt v7, v8, :cond_0

    const-string v7, "android.permission.QUERY_ALL_PACKAGES"

    .line 146
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    .line 145
    invoke-virtual {v2, v7, v8}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_0

    .line 148
    :cond_0
    :try_start_1
    invoke-virtual {v2, v5, v3}, Landroid/content/pm/PackageManager;->getPermissionInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;

    .line 149
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v5, v3}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v3, :cond_1

    :goto_0
    const/4 v3, 0x1

    goto :goto_1

    :catch_0
    :cond_1
    const/4 v3, 0x0

    .line 92
    :goto_1
    iput-boolean v3, v4, Ll/ۚ۫ۚ;->ᩴ:Z

    .line 93
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v5, p0

    invoke-virtual {v5, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 95
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const-string v0, ""

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_23

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/pm/PackageInfo;

    .line 96
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v7

    if-nez v7, :cond_22

    .line 99
    iget-object v7, v6, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 100
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p3

    .line 102
    invoke-virtual {v7, v8}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_3

    goto :goto_5

    .line 103
    :cond_3
    iget-object v10, v6, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-nez v10, :cond_4

    .line 104
    iget v0, v4, Ll/ۚ۫ۚ;->᩸:I

    add-int/2addr v0, v9

    iput v0, v4, Ll/ۚ۫ۚ;->᩸:I

    goto :goto_5

    .line 105
    :cond_4
    iget v0, v10, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v0, v0, 0x81

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    const/4 v11, 0x1

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    const/4 v11, 0x0

    :goto_3
    const-string v0, "user"

    .line 106
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-nez v11, :cond_a

    :cond_6
    const-string v0, "system"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    if-nez v11, :cond_7

    goto :goto_5

    .line 109
    :cond_7
    :try_start_2
    invoke-virtual {v10, v2}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 110
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    :cond_8
    const/4 v0, 0x0

    :goto_4
    move-object v12, v0

    .line 114
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_b

    if-eqz v12, :cond_9

    .line 115
    invoke-virtual {v12, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    :cond_9
    if-nez v12, :cond_a

    .line 116
    iget v0, v4, Ll/ۚ۫ۚ;->᩸:I

    add-int/2addr v0, v9

    iput v0, v4, Ll/ۚ۫ۚ;->᩸:I

    :cond_a
    :goto_5
    move/from16 v14, p1

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    goto/16 :goto_1b

    .line 119
    :cond_b
    iget-object v13, v4, Ll/ۚ۫ۚ;->᩷:Lbin/mt/json/JSONArray;

    invoke-virtual {v13}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    move/from16 v14, p1

    if-ne v0, v14, :cond_c

    iput-boolean v9, v4, Ll/ۚ۫ۚ;->ۙ:Z

    goto/16 :goto_1c

    .line 120
    :cond_c
    invoke-static {v10}, Ll/ۧ۫ۚ;->ۙ(Landroid/content/pm/ApplicationInfo;)Ljava/util/ArrayList;

    move-result-object v15

    .line 121
    iget-object v0, v10, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-static {v0}, Ll/ۧ۫ۚ;->ۙ(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v16

    .line 123
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v17, v16

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/String;

    .line 124
    invoke-static/range {v18 .. v18}, Ll/ۧ۫ۚ;->ۙ(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v18

    if-eqz v17, :cond_e

    if-eqz v18, :cond_e

    .line 125
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    move-result-wide v19

    const-wide v21, 0x1fffffffffffffL

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Long;->longValue()J

    move-result-wide v23

    sub-long v21, v21, v23

    cmp-long v23, v19, v21

    if-lez v23, :cond_d

    goto :goto_7

    :cond_d
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    move-result-wide v19

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    add-long v17, v17, v19

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    goto :goto_6

    :cond_e
    :goto_7
    const/16 v17, 0x0

    goto :goto_6

    .line 193
    :cond_f
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 177
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    move-object/from16 p0, v0

    const/16 v0, 0x18

    if-lt v9, v0, :cond_10

    invoke-static {v10}, Ll/ۗ᩻ܺ;->ۙ(Landroid/content/pm/ApplicationInfo;)I

    move-result v0

    if-lez v0, :cond_11

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    goto/16 :goto_15

    .line 178
    :cond_10
    iget-object v0, v10, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    if-nez v0, :cond_12

    :catch_2
    :cond_11
    move-object/from16 v18, v2

    move-object/from16 v19, v3

    goto/16 :goto_14

    .line 179
    :cond_12
    :try_start_3
    new-instance v9, Ll/᩸ܽܺ;

    invoke-direct {v9, v0}, Ll/᩸ܽܺ;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :try_start_4
    const-string v0, "AndroidManifest.xml"

    .line 180
    invoke-virtual {v9, v0}, Ll/᩸ܽܺ;->getEntry(Ljava/lang/String;)Ll/۟ܺܺ;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 181
    invoke-virtual {v0}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v18

    const-wide/16 v20, 0x0

    cmp-long v22, v18, v20

    if-ltz v22, :cond_1a

    invoke-virtual {v0}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v18

    const-wide/32 v20, 0x200000

    cmp-long v22, v18, v20

    if-lez v22, :cond_13

    goto/16 :goto_11

    :cond_13
    const/4 v1, 0x0

    .line 1757
    invoke-virtual {v9, v0, v1}, Ll/᩸ܽܺ;->ۙ(Ll/۟ܺܺ;Ll/ۗۧܺ;)[B

    move-result-object v0

    .line 182
    invoke-static {v0}, Ll/ܰ᩻ܺ;->᩷([B)Ll/ܰ᩻ܺ;

    move-result-object v0

    .line 183
    invoke-virtual {v0}, Ll/ܰ᩻ܺ;->۫()Ll/ۡ᩻ܺ;

    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 185
    :goto_8
    :try_start_5
    invoke-virtual {v1}, Ll/ۡ᩻ܺ;->next()I

    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object/from16 v18, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_19

    const/4 v2, 0x2

    if-ne v0, v2, :cond_18

    :try_start_6
    const-string v0, "uses-sdk"

    .line 186
    invoke-virtual {v1}, Ll/ۡ᩻ܺ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_c

    :cond_14
    const/4 v0, 0x0

    .line 187
    :goto_9
    invoke-virtual {v1}, Ll/ۡ᩻ܺ;->getAttributeCount()I

    move-result v2

    if-ge v0, v2, :cond_17

    .line 188
    invoke-virtual {v1, v0}, Ll/ۡ᩻ܺ;->getAttributeNameResource(I)I

    move-result v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object/from16 v19, v3

    const v3, 0x101020c

    if-ne v2, v3, :cond_16

    const/4 v2, -0x1

    .line 189
    :try_start_7
    invoke-virtual {v1, v0, v2}, Ll/ۡ᩻ܺ;->getAttributeIntValue(II)I

    move-result v0

    if-lez v0, :cond_15

    .line 190
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_a

    :cond_15
    const/4 v0, 0x0

    .line 195
    :goto_a
    :try_start_8
    invoke-virtual {v1}, Ll/ۡ᩻ܺ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 197
    :try_start_9
    invoke-virtual {v9}, Ll/᩸ܽܺ;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    goto :goto_15

    :catchall_0
    move-exception v0

    goto :goto_f

    :cond_16
    add-int/lit8 v0, v0, 0x1

    move-object/from16 v3, v19

    goto :goto_9

    :cond_17
    move-object/from16 v19, v3

    .line 195
    :goto_b
    :try_start_a
    invoke-virtual {v1}, Ll/ۡ᩻ܺ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_d

    :catchall_1
    move-exception v0

    goto :goto_e

    :cond_18
    :goto_c
    move-object/from16 v19, v3

    move-object/from16 v2, v18

    move-object/from16 v3, v19

    goto :goto_8

    :cond_19
    move-object/from16 v19, v3

    goto :goto_b

    .line 197
    :goto_d
    :try_start_b
    invoke-virtual {v9}, Ll/᩸ܽܺ;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3

    move-object/from16 v0, p0

    goto :goto_15

    :catchall_2
    move-exception v0

    goto :goto_12

    :catchall_3
    move-exception v0

    move-object/from16 v18, v2

    :goto_e
    move-object/from16 v19, v3

    :goto_f
    move-object v2, v0

    .line 183
    :try_start_c
    invoke-virtual {v1}, Ll/ۡ᩻ܺ;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    goto :goto_10

    :catchall_4
    move-exception v0

    move-object v1, v0

    :try_start_d
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_10
    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    :cond_1a
    :goto_11
    move-object/from16 v18, v2

    move-object/from16 v19, v3

    .line 197
    :try_start_e
    invoke-virtual {v9}, Ll/᩸ܽܺ;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_3

    goto :goto_14

    :catchall_5
    move-exception v0

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    :goto_12
    move-object v1, v0

    .line 179
    :try_start_f
    invoke-virtual {v9}, Ll/᩸ܽܺ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    goto :goto_13

    :catchall_6
    move-exception v0

    move-object v2, v0

    :try_start_10
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_13
    throw v1
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_3

    :catch_3
    :goto_14
    const/4 v0, 0x0

    :goto_15
    if-eqz v12, :cond_1b

    if-eqz v16, :cond_1b

    if-eqz v17, :cond_1b

    if-nez v0, :cond_1c

    .line 128
    :cond_1b
    iget v1, v4, Ll/ۚ۫ۚ;->᩸:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v4, Ll/ۚ۫ۚ;->᩸:I

    .line 129
    :cond_1c
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_1d

    invoke-virtual {v6}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v1

    goto :goto_16

    :cond_1d
    iget v1, v6, Landroid/content/pm/PackageInfo;->versionCode:I

    int-to-long v1, v1

    const-wide v20, 0xffffffffL

    and-long v1, v1, v20

    :goto_16
    const-string v3, "appLabel"

    const-string v9, "packageName"

    .line 0
    invoke-static {v3, v12, v9, v7}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "versionName"

    .line 130
    iget-object v6, v6, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 131
    invoke-virtual {v3, v9, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "versionCode"

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "systemApp"

    .line 132
    invoke-virtual {v1, v2, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "enabled"

    iget-boolean v3, v10, Landroid/content/pm/ApplicationInfo;->enabled:Z

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    if-nez v0, :cond_1e

    .line 133
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_17

    :cond_1e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v0

    :goto_17
    const-string v2, "minSdk"

    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 134
    iget v1, v10, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    if-lez v1, :cond_1f

    invoke-static {v1}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v1

    goto :goto_18

    :cond_1f
    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_18
    const-string v2, "targetSdk"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-nez v17, :cond_20

    .line 135
    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_19

    :cond_20
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    :goto_19
    const-string v2, "size"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-nez v16, :cond_21

    .line 136
    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1a

    :cond_21
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    :goto_1a
    const-string v2, "baseApkSize"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "splitCount"

    .line 137
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt://installed-app/"

    invoke-virtual {v1, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "path"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 130
    invoke-virtual {v13, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 138
    iput-object v7, v4, Ll/ۚ۫ۚ;->ۤ:Ljava/lang/String;

    :goto_1b
    const/4 v9, 0x1

    move-object/from16 v1, p2

    move-object v0, v7

    move-object/from16 v2, v18

    move-object/from16 v3, v19

    goto/16 :goto_2

    :cond_22
    const-string v0, "CANCELLED"

    const-string v1, "Installed app query interrupted"

    .line 97
    invoke-static {v0, v1}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0

    :cond_23
    :goto_1c
    return-object v4

    :catch_4
    const-string v0, "INSTALLED_APPS_ACCESS_DENIED"

    const-string v1, "Cannot query installed apps"

    .line 87
    invoke-static {v0, v1}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0
.end method

.method public static ᩷(Ljava/lang/String;)Ll/֫۫ۚ;
    .locals 6

    const/16 v0, 0x13

    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xff

    if-gt v1, v2, :cond_7

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2e

    if-eq v2, v3, :cond_7

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_7

    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 67
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v2, v5, :cond_5

    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v3, :cond_0

    if-nez v4, :cond_7

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/16 v4, 0x61

    if-lt v5, v4, :cond_1

    const/16 v4, 0x7a

    if-le v5, v4, :cond_4

    :cond_1
    const/16 v4, 0x41

    if-lt v5, v4, :cond_2

    const/16 v4, 0x5a

    if-le v5, v4, :cond_4

    :cond_2
    const/16 v4, 0x30

    if-lt v5, v4, :cond_3

    const/16 v4, 0x39

    if-le v5, v4, :cond_4

    :cond_3
    const/16 v4, 0x5f

    if-ne v5, v4, :cond_7

    :cond_4
    const/4 v4, 0x0

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 49
    :cond_5
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->ܶ()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 50
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz p0, :cond_6

    .line 51
    iget-object v1, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    if-eqz v1, :cond_6

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isAbsolute()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 54
    new-instance v1, Ll/֫۫ۚ;

    iget-object v2, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-static {p0}, Ll/ۧ۫ۚ;->ۙ(Landroid/content/pm/ApplicationInfo;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    invoke-direct {v1, p0, v0, v2}, Ll/֫۫ۚ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_6
    const-string p0, "INSTALLED_APP_UNAVAILABLE"

    const-string v0, "Installed APK is unavailable"

    .line 52
    invoke-static {p0, v0}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string p0, "INSTALLED_APPS_ACCESS_DENIED"

    const-string v0, "Cannot query installed app"

    .line 59
    invoke-static {p0, v0}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0

    :catch_1
    const-string p0, "Installed app is no longer available"

    const-string v0, "warning"

    const/4 v1, 0x0

    const-string v2, "INSTALLED_APP_NOT_FOUND"

    .line 56
    invoke-static {v1, v2, p0, v0}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0

    .line 45
    :cond_7
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    .line 46
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt://installed-app/com.example.app"

    const-string v3, "path"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid installed app target"

    .line 45
    invoke-static {v2, v3, p0, v0, v1}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0
.end method

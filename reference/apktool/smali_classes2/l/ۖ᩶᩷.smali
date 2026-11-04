.class public final Ll/ۖ᩶᩷;
.super Ljava/lang/Object;
.source "D9O0"


# static fields
.field public static final ۙ:Ljava/lang/Object;

.field public static final ۤ:Ll/ۧ᩵;

.field public static ᩷:Ll/ۡ᩶᩷;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 78
    invoke-static {}, Ll/ۧ᩵;->᩷()Ll/ۧ᩵;

    move-result-object v0

    sput-object v0, Ll/ۖ᩶᩷;->ۤ:Ll/ۧ᩵;

    .line 79
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۖ᩶᩷;->ۙ:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 83
    sput-object v0, Ll/ۖ᩶᩷;->᩷:Ll/ۡ᩶᩷;

    return-void
.end method

.method public static ۙ(Landroid/content/Context;)J
    .locals 3

    .line 320
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 321
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_0

    .line 322
    invoke-static {v0, p0}, Ll/ۢ᩶᩷;->ۙ(Landroid/content/pm/PackageManager;Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    return-wide v0

    .line 324
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    return-wide v0
.end method

.method public static ۙ()Ll/ۡ᩶᩷;
    .locals 2

    .line 305
    new-instance v0, Ll/ۡ᩶᩷;

    .line 542
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 305
    sput-object v0, Ll/ۖ᩶᩷;->᩷:Ll/ۡ᩶᩷;

    .line 311
    sget-object v1, Ll/ۖ᩶᩷;->ۤ:Ll/ۧ᩵;

    invoke-virtual {v1, v0}, Ll/ۧ᩵;->᩷(Ljava/lang/Object;)Z

    .line 312
    sget-object v0, Ll/ۖ᩶᩷;->᩷:Ll/ۡ᩶᩷;

    return-object v0
.end method

.method public static ۙ(Landroid/content/Context;Z)V
    .locals 21

    if-nez p1, :cond_0

    .line 130
    sget-object v0, Ll/ۖ᩶᩷;->᩷:Ll/ۡ᩶᩷;

    if-eqz v0, :cond_0

    goto/16 :goto_a

    .line 134
    :cond_0
    sget-object v0, Ll/ۖ᩶᩷;->ۙ:Ljava/lang/Object;

    move-object v13, v0

    monitor-enter v13

    if-nez p1, :cond_1

    .line 136
    :try_start_0
    sget-object v0, Ll/ۖ᩶᩷;->᩷:Ll/ۡ᩶᩷;

    if-eqz v0, :cond_1

    .line 137
    monitor-exit v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :cond_1
    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 142
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v5, "dexopt/baseline.prof"

    invoke-virtual {v0, v5}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v5
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    :try_start_2
    invoke-virtual {v5}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    cmp-long v0, v6, v1

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 144
    :goto_0
    :try_start_3
    invoke-virtual {v5}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v6, v0

    if-eqz v5, :cond_3

    .line 142
    :try_start_4
    invoke-virtual {v5}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v5, v0

    :try_start_5
    invoke-virtual {v6, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v6
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_0
    const/4 v0, 0x0

    .line 149
    :goto_2
    :try_start_6
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1c

    if-lt v5, v6, :cond_11

    const/16 v6, 0x1e

    if-ne v5, v6, :cond_4

    goto/16 :goto_9

    .line 162
    :cond_4
    new-instance v5, Ljava/io/File;

    new-instance v6, Ljava/io/File;

    const-string v7, "/data/misc/profiles/ref/"

    .line 163
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "primary.prof"

    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 164
    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v6

    .line 166
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_5

    cmp-long v5, v6, v1

    if-lez v5, :cond_5

    const/4 v5, 0x1

    goto :goto_3

    :cond_5
    const/4 v5, 0x0

    .line 169
    :goto_3
    new-instance v8, Ljava/io/File;

    new-instance v9, Ljava/io/File;

    const-string v10, "/data/misc/profiles/cur/0/"

    .line 170
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v9, v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v10, "primary.prof"

    invoke-direct {v8, v9, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 171
    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v19

    .line 173
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v8, :cond_6

    cmp-long v8, v19, v1

    if-lez v8, :cond_6

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    .line 179
    :goto_4
    :try_start_7
    invoke-static/range {p0 .. p0}, Ll/ۖ᩶᩷;->ۙ(Landroid/content/Context;)J

    move-result-wide v17
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 190
    :try_start_8
    new-instance v2, Ljava/io/File;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v8

    const-string v9, "profileInstalled"

    invoke-direct {v2, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 192
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v8
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-eqz v8, :cond_7

    .line 194
    :try_start_9
    invoke-static {v2}, Ll/֨᩶᩷;->᩷(Ljava/io/File;)Ll/֨᩶᩷;

    move-result-object v8
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_5

    .line 196
    :catch_1
    :try_start_a
    invoke-static {}, Ll/ۖ᩶᩷;->ۙ()Ll/ۡ᩶᩷;

    monitor-exit v13

    goto :goto_a

    :cond_7
    const/4 v8, 0x0

    :goto_5
    const/4 v9, 0x2

    if-eqz v8, :cond_9

    .line 217
    iget-wide v10, v8, Ll/֨᩶᩷;->᩷:J

    cmp-long v12, v10, v17

    if-nez v12, :cond_9

    iget v10, v8, Ll/֨᩶᩷;->ۤ:I

    if-ne v10, v9, :cond_8

    goto :goto_6

    :cond_8
    move v4, v10

    goto :goto_7

    :cond_9
    :goto_6
    if-nez v0, :cond_a

    const/high16 v4, 0x50000

    goto :goto_7

    :cond_a
    if-eqz v5, :cond_b

    const/4 v4, 0x1

    goto :goto_7

    :cond_b
    if-eqz v1, :cond_c

    const/4 v4, 0x2

    :cond_c
    :goto_7
    if-eqz p1, :cond_d

    if-eqz v1, :cond_d

    if-eq v4, v3, :cond_d

    const/4 v4, 0x2

    :cond_d
    if-eqz v8, :cond_e

    .line 251
    iget v0, v8, Ll/֨᩶᩷;->ۤ:I

    if-ne v0, v9, :cond_e

    if-ne v4, v3, :cond_e

    .line 265
    iget-wide v0, v8, Ll/֨᩶᩷;->ۙ:J

    cmp-long v3, v6, v0

    if-gez v3, :cond_e

    const/4 v0, 0x3

    const/16 v16, 0x3

    goto :goto_8

    :cond_e
    move/from16 v16, v4

    .line 271
    :goto_8
    new-instance v0, Ll/֨᩶᩷;

    const/4 v15, 0x1

    move-object v14, v0

    invoke-direct/range {v14 .. v20}, Ll/֨᩶᩷;-><init>(IIJJ)V

    if-eqz v8, :cond_f

    .line 280
    invoke-virtual {v8, v0}, Ll/֨᩶᩷;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-nez v1, :cond_10

    .line 282
    :cond_f
    :try_start_b
    invoke-virtual {v0, v2}, Ll/֨᩶᩷;->ۙ(Ljava/io/File;)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 290
    :catch_2
    :cond_10
    :try_start_c
    invoke-static {}, Ll/ۖ᩶᩷;->ۙ()Ll/ۡ᩶᩷;

    monitor-exit v13

    goto :goto_a

    .line 181
    :catch_3
    invoke-static {}, Ll/ۖ᩶᩷;->ۙ()Ll/ۡ᩶᩷;

    monitor-exit v13

    goto :goto_a

    .line 151
    :cond_11
    :goto_9
    invoke-static {}, Ll/ۖ᩶᩷;->ۙ()Ll/ۡ᩶᩷;

    monitor-exit v13

    :goto_a
    return-void

    .line 296
    :goto_b
    monitor-exit v13
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    throw v0
.end method

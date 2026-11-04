.class public final Ll/ܶۘۚ;
.super Ljava/lang/Object;
.source "D6W4"

# interfaces
.implements Ll/ܽᩴۚ;


# static fields
.field public static final ֫:[B

.field public static final ۚ:Ljava/util/concurrent/ScheduledExecutorService;

.field public static ۧ:Ll/ܶۘۚ;


# instance fields
.field public final ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ۤ:Ll/ܽ֫ۗ;

.field public final ۫:Ll/᩹ۘۚ;

.field public volatile ܳ:Ll/ܺۘۚ;

.field public final ᩴ:Ljava/security/SecureRandom;

.field public final ᩷:Ljava/util/concurrent/ScheduledExecutorService;

.field public final ᩸:Ll/ۢ֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x40

    new-array v0, v0, [B

    .line 36
    sput-object v0, Ll/ܶۘۚ;->֫:[B

    .line 37
    new-instance v0, Ll/ۧ֡ܶ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۧ֡ܶ;-><init>(I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Ll/ܶۘۚ;->ۚ:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public constructor <init>(Ll/ۢ֫ܺ;Ljava/io/File;)V
    .locals 10

    .line 66
    sget-object v0, Ll/ܶۘۚ;->ۚ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    iput-object v1, p0, Ll/ܶۘۚ;->ᩴ:Ljava/security/SecureRandom;

    .line 47
    new-instance v1, Ll/ܽ֫ۗ;

    invoke-direct {v1}, Ll/ܽ֫ۗ;-><init>()V

    iput-object v1, p0, Ll/ܶۘۚ;->ۤ:Ll/ܽ֫ۗ;

    .line 48
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v1, p0, Ll/ܶۘۚ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 71
    iput-object p1, p0, Ll/ܶۘۚ;->᩸:Ll/ۢ֫ܺ;

    .line 72
    iput-object v0, p0, Ll/ܶۘۚ;->᩷:Ljava/util/concurrent/ScheduledExecutorService;

    .line 73
    new-instance v0, Ll/᩹ۘۚ;

    invoke-direct {v0, p2}, Ll/᩹ۘۚ;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Ll/ܶۘۚ;->۫:Ll/᩹ۘۚ;

    const-string p2, "amae"

    const/4 v1, 0x0

    .line 74
    invoke-interface {p1, p2, v1}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 78
    :try_start_0
    invoke-virtual {v0}, Ll/᩹ۘۚ;->ۙ()Ljava/util/ArrayList;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p2, 0x1

    move-object v9, p1

    const/4 v4, 0x1

    goto :goto_0

    .line 0
    :catch_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 p2, 0x0

    move-object v9, p1

    const/4 v4, 0x0

    .line 83
    :goto_0
    new-instance p1, Ll/ܺۘۚ;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Ll/ܺۘۚ;-><init>(ZZJJLjava/util/List;)V

    iput-object p1, p0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    return-void
.end method

.method private ۙ(Ljava/util/ArrayList;)V
    .locals 20

    move-object/from16 v0, p0

    .line 257
    iget-object v1, v0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    const-wide/16 v2, 0x1

    .line 259
    :try_start_0
    iget-object v4, v0, Ll/ܶۘۚ;->۫:Ll/᩹ۘۚ;

    move-object/from16 v12, p1

    invoke-virtual {v4, v12}, Ll/᩹ۘۚ;->ۙ(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    new-instance v4, Ll/ܺۘۚ;

    iget-boolean v6, v1, Ll/ܺۘۚ;->ᩴ:Z

    iget-wide v7, v1, Ll/ܺۘۚ;->ܳ:J

    add-long v8, v7, v2

    iget-wide v10, v1, Ll/ܺۘۚ;->ۙ:J

    const/4 v7, 0x1

    move-object v5, v4

    move-object/from16 v12, p1

    invoke-direct/range {v5 .. v12}, Ll/ܺۘۚ;-><init>(ZZJJLjava/util/List;)V

    iput-object v4, v0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    return-void

    .line 261
    :catch_0
    new-instance v4, Ll/ܺۘۚ;

    iget-boolean v13, v1, Ll/ܺۘۚ;->ᩴ:Z

    iget-wide v5, v1, Ll/ܺۘۚ;->ܳ:J

    add-long v15, v5, v2

    iget-wide v1, v1, Ll/ܺۘۚ;->ۙ:J

    .line 0
    sget-object v19, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v14, 0x0

    move-object v12, v4

    move-wide/from16 v17, v1

    .line 261
    invoke-direct/range {v12 .. v19}, Ll/ܺۘۚ;-><init>(ZZJJLjava/util/List;)V

    iput-object v4, v0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    .line 262
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Cannot save MCP credentials"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ۙ(ILjava/lang/String;)Z
    .locals 4

    .line 315
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p0, :cond_5

    .line 319
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x41

    if-lt v2, v3, :cond_1

    const/16 v3, 0x5a

    if-le v2, v3, :cond_4

    :cond_1
    const/16 v3, 0x61

    if-lt v2, v3, :cond_2

    const/16 v3, 0x7a

    if-le v2, v3, :cond_4

    :cond_2
    const/16 v3, 0x30

    if-lt v2, v3, :cond_3

    const/16 v3, 0x39

    if-le v2, v3, :cond_4

    :cond_3
    const/16 v3, 0x2d

    if-eq v2, v3, :cond_4

    const/16 v3, 0x5f

    if-eq v2, v3, :cond_4

    :goto_1
    return v1

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    const/4 p0, 0x1

    return p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 305
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x42

    if-ne v0, v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mtmcp_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 p1, 0x17

    .line 306
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0x2b

    .line 307
    invoke-static {p1, p0}, Ll/ܶۘۚ;->ۙ(ILjava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/16 p1, 0xb

    .line 308
    invoke-static {p0, p1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 309
    array-length v1, v0

    const/16 v2, 0x20

    if-ne v1, v2, :cond_2

    invoke-static {v0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 283
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object p0

    .line 310
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static declared-synchronized ۤ()Ll/ܶۘۚ;
    .locals 6

    .line 2
    const-class v0, Ll/ܶۘۚ;

    .line 3
    monitor-enter v0

    .line 53
    :try_start_0
    sget-object v1, Ll/ܶۘۚ;->ۧ:Ll/ܶۘۚ;

    if-nez v1, :cond_0

    .line 54
    new-instance v1, Ll/ܶۘۚ;

    sget-object v2, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    .line 61
    new-instance v3, Ljava/io/File;

    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v4

    const-string v5, "apk-mcp-credentials.json"

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 54
    invoke-direct {v1, v2, v3}, Ll/ܶۘۚ;-><init>(Ll/ۢ֫ܺ;Ljava/io/File;)V

    sput-object v1, Ll/ܶۘۚ;->ۧ:Ll/ܶۘۚ;

    .line 56
    :cond_0
    sget-object v1, Ll/ܶۘۚ;->ۧ:Ll/ܶۘۚ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static ᩴ(Ljava/lang/String;)V
    .locals 4

    const-string v0, "Invalid MCP client name"

    if-eqz p0, :cond_4

    .line 288
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->codePointCount(II)I

    move-result v1

    const/16 v3, 0x40

    if-gt v1, v3, :cond_4

    .line 291
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v2, v1, :cond_3

    .line 292
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 293
    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    .line 294
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v2, v1, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 295
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 297
    :cond_1
    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v1}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v1

    if-nez v1, :cond_2

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 298
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    return-void

    .line 289
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final declared-synchronized ۙ(Ljava/lang/String;)Ll/ۧۘۚ;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v16, p0

    .line 1
    monitor-enter v16

    .line 122
    :try_start_0
    invoke-static/range {p1 .. p1}, Ll/ܶۘۚ;->ᩴ(Ljava/lang/String;)V

    .line 123
    iget-object v0, v1, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    .line 124
    iget-object v2, v0, Ll/ܺۘۚ;->᩸:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/16 v3, 0x20

    if-ge v2, v3, :cond_1

    :cond_0
    const/16 v2, 0xc

    new-array v2, v2, [B

    .line 278
    iget-object v4, v1, Ll/ܶۘۚ;->ᩴ:Ljava/security/SecureRandom;

    invoke-virtual {v4, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/16 v4, 0xb

    .line 279
    invoke-static {v2, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v6

    .line 130
    invoke-static {v0}, Ll/ܺۘۚ;->ۙ(Ll/ܺۘۚ;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    new-array v2, v3, [B

    .line 278
    iget-object v3, v1, Ll/ܶۘۚ;->ᩴ:Ljava/security/SecureRandom;

    invoke-virtual {v3, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 279
    invoke-static {v2, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    .line 132
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mtmcp_"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 133
    new-instance v15, Ll/᩻ۘۚ;

    invoke-static {v2, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    .line 283
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v2

    invoke-static {v2}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object v8

    .line 134
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    const-string v14, ""

    const-wide/16 v12, 0x0

    move-object v5, v15

    move-object/from16 v7, p1

    move-object v9, v3

    invoke-direct/range {v5 .. v14}, Ll/᩻ۘۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V

    .line 135
    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, v0, Ll/ܺۘۚ;->᩸:Ljava/util/List;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 136
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    invoke-direct {v1, v2}, Ll/ܶۘۚ;->ۙ(Ljava/util/ArrayList;)V

    .line 138
    new-instance v0, Ll/ۧۘۚ;

    invoke-direct {v0, v3}, Ll/ۧۘۚ;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v16

    return-object v0

    .line 125
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "MCP credential limit reached"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 130
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final ۙ(Ll/ۗ᩻ܳ;)Ll/᩻ᩴۚ;
    .locals 16

    move-object/from16 v0, p0

    .line 162
    iget-object v1, v0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    .line 163
    iget-boolean v2, v1, Ll/ܺۘۚ;->ᩴ:Z

    const-string v3, ""

    if-nez v2, :cond_0

    .line 164
    iget-wide v1, v1, Ll/ܺۘۚ;->ۙ:J

    invoke-static {v1, v2, v3}, Ll/᩻ᩴۚ;->ۙ(JLjava/lang/String;)Ll/᩻ᩴۚ;

    move-result-object v1

    return-object v1

    .line 166
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩻ܳ;->ۤ()Ljava/util/List;

    move-result-object v2

    .line 167
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v4, v7, :cond_9

    iget-boolean v4, v1, Ll/ܺۘۚ;->᩷:Z

    if-eqz v4, :cond_9

    .line 168
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_9

    .line 195
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v8, 0x200

    if-le v4, v8, :cond_1

    goto/16 :goto_2

    :cond_1
    const/4 v4, 0x0

    .line 198
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v9, 0x20

    if-ge v4, v8, :cond_3

    .line 199
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v9, :cond_9

    const/16 v9, 0x7e

    if-le v8, v9, :cond_2

    goto/16 :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 204
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 205
    invoke-virtual {v2, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v8, 0x6

    if-ne v4, v8, :cond_9

    const/4 v14, 0x0

    const/4 v15, 0x6

    const/4 v11, 0x1

    const/4 v12, 0x0

    const-string v13, "Bearer"

    move-object v10, v2

    .line 206
    invoke-virtual/range {v10 .. v15}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v10

    if-nez v10, :cond_4

    goto/16 :goto_2

    :cond_4
    add-int/2addr v4, v7

    .line 209
    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 210
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v10, 0x42

    if-ne v4, v10, :cond_9

    const-string v4, "mtmcp_"

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    const/16 v4, 0x16

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v11, 0x5f

    if-eq v10, v11, :cond_5

    goto :goto_2

    .line 213
    :cond_5
    invoke-virtual {v2, v8, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0x17

    .line 214
    invoke-virtual {v2, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const/16 v8, 0x10

    .line 215
    invoke-static {v8, v4}, Ll/ܶۘۚ;->ۙ(ILjava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x2b

    invoke-static {v8, v2}, Ll/ܶۘۚ;->ۙ(ILjava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_2

    :cond_6
    const/16 v8, 0xb

    .line 218
    invoke-static {v2, v8}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v10

    .line 220
    array-length v11, v10

    if-ne v11, v9, :cond_9

    invoke-static {v10, v8}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    .line 223
    :cond_7
    invoke-static {v1}, Ll/ܺۘۚ;->ۙ(Ll/ܺۘۚ;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۘۚ;

    if-nez v2, :cond_8

    .line 224
    sget-object v4, Ll/ܶۘۚ;->֫:[B

    goto :goto_1

    :cond_8
    invoke-static {v2}, Ll/᩻ۘۚ;->ۙ(Ll/᩻ۘۚ;)Ljava/lang/String;

    move-result-object v4

    sget-object v8, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    .line 283
    :goto_1
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v8

    invoke-virtual {v8, v10}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v8

    invoke-static {v8}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object v8

    .line 226
    sget-object v9, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {v8, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v8

    .line 225
    invoke-static {v4, v8}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result v4

    if-eqz v4, :cond_9

    move-object v5, v2

    :cond_9
    :goto_2
    if-nez v5, :cond_a

    .line 171
    sget-object v1, Ll/᩶᩻ܳ;->᩺ۙ:Ll/᩶᩻ܳ;

    const-string v2, "text/plain"

    const-string v3, "Unauthorized"

    invoke-static {v1, v2, v3}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v1

    const-string v2, "WWW-Authenticate"

    const-string v3, "Bearer realm=\"MT MCP\""

    .line 173
    invoke-virtual {v1, v2, v3}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    invoke-static {v1}, Ll/᩻ᩴۚ;->ۙ(Ll/ܿ᩻ܳ;)Ll/᩻ᩴۚ;

    move-result-object v1

    return-object v1

    .line 176
    :cond_a
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩻ܳ;->᩻()Ljava/lang/String;

    move-result-object v2

    .line 177
    iget-object v4, v0, Ll/ܶۘۚ;->ۤ:Ll/ܽ֫ۗ;

    iget-object v8, v5, Ll/᩻ۘۚ;->ۤ:Ljava/lang/String;

    new-instance v9, Ll/ܽۘۚ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    if-eqz v2, :cond_c

    .line 178
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v12

    const/16 v13, 0x80

    if-le v12, v13, :cond_b

    goto :goto_3

    :cond_b
    move-object v3, v2

    :cond_c
    :goto_3
    invoke-direct {v9, v10, v11, v3}, Ll/ܽۘۚ;-><init>(JLjava/lang/String;)V

    .line 177
    invoke-virtual {v4, v8, v9}, Ll/ܽ֫ۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    iget-object v2, v0, Ll/ܶۘۚ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v6, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 180
    iget-object v2, v0, Ll/ܶۘۚ;->᩷:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v3, Ll/֫ۘۚ;

    invoke-direct {v3, v0}, Ll/֫ۘۚ;-><init>(Ll/ܶۘۚ;)V

    const-wide/16 v6, 0x1e

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v3, v6, v7, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 182
    :cond_d
    iget-object v2, v5, Ll/᩻ۘۚ;->ۤ:Ljava/lang/String;

    iget-wide v3, v1, Ll/ܺۘۚ;->ۙ:J

    invoke-static {v3, v4, v2}, Ll/᩻ᩴۚ;->ۙ(JLjava/lang/String;)Ll/᩻ᩴۚ;

    move-result-object v1

    return-object v1
.end method

.method public final declared-synchronized ۙ()V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v16, p0

    .line 3
    monitor-enter v16

    .line 233
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 235
    iget-object v2, v1, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    iget-object v2, v2, Ll/ܺۘۚ;->᩸:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩻ۘۚ;

    .line 236
    iget-object v5, v1, Ll/ܶۘۚ;->ۤ:Ll/ܽ֫ۗ;

    iget-object v6, v4, Ll/᩻ۘۚ;->ۤ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ll/ܽ֫ۗ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۘۚ;

    if-nez v5, :cond_0

    goto :goto_1

    .line 237
    :cond_0
    new-instance v17, Ll/᩻ۘۚ;

    iget-object v7, v4, Ll/᩻ۘۚ;->ۤ:Ljava/lang/String;

    iget-object v8, v4, Ll/᩻ۘۚ;->ۙ:Ljava/lang/String;

    invoke-static {v4}, Ll/᩻ۘۚ;->ۙ(Ll/᩻ۘۚ;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v4}, Ll/᩻ۘۚ;->᩷(Ll/᩻ۘۚ;)Ljava/lang/String;

    move-result-object v10

    iget-wide v11, v4, Ll/᩻ۘۚ;->᩷:J

    iget-wide v13, v5, Ll/ܽۘۚ;->ۙ:J

    iget-object v15, v5, Ll/ܽۘۚ;->᩷:Ljava/lang/String;

    move-object/from16 v6, v17

    invoke-direct/range {v6 .. v15}, Ll/᩻ۘۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V

    move-object/from16 v4, v17

    :goto_1
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v5, :cond_1

    const/4 v4, 0x1

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    :goto_2
    or-int/2addr v3, v4

    goto :goto_0

    .line 241
    :cond_2
    iget-object v2, v1, Ll/ܶۘۚ;->ۤ:Ll/ܽ֫ۗ;

    invoke-virtual {v2}, Ll/ܽ֫ۗ;->keySet()Ljava/util/Set;

    move-result-object v2

    iget-object v4, v1, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    invoke-static {v4}, Ll/ܺۘۚ;->ۙ(Ll/ܺۘۚ;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    if-eqz v3, :cond_3

    .line 242
    iget-object v2, v1, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    iget-boolean v2, v2, Ll/ܺۘۚ;->᩷:Z

    if-eqz v2, :cond_3

    .line 243
    invoke-direct {v1, v0}, Ll/ܶۘۚ;->ۙ(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    :cond_3
    :try_start_1
    iget-object v0, v1, Ll/ܶۘۚ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 249
    iget-object v0, v1, Ll/ܶۘۚ;->ۤ:Ll/ܽ֫ۗ;

    invoke-virtual {v0}, Ll/ܽ֫ۗ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v1, Ll/ܶۘۚ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 250
    iget-object v0, v1, Ll/ܶۘۚ;->᩷:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Ll/֫ۘۚ;

    invoke-direct {v2, v1}, Ll/֫ۘۚ;-><init>(Ll/ܶۘۚ;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    .line 248
    iget-object v2, v1, Ll/ܶۘۚ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 249
    iget-object v2, v1, Ll/ܶۘۚ;->ۤ:Ll/ܽ֫ۗ;

    invoke-virtual {v2}, Ll/ܽ֫ۗ;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v1, Ll/ܶۘۚ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 250
    iget-object v2, v1, Ll/ܶۘۚ;->᩷:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v3, Ll/֫ۘۚ;

    invoke-direct {v3, v1}, Ll/֫ۘۚ;-><init>(Ll/ܶۘۚ;)V

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1e

    invoke-interface {v2, v3, v5, v6, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 252
    :cond_4
    throw v0

    .line 248
    :catch_0
    iget-object v0, v1, Ll/ܶۘۚ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 249
    iget-object v0, v1, Ll/ܶۘۚ;->ۤ:Ll/ܽ֫ۗ;

    invoke-virtual {v0}, Ll/ܽ֫ۗ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v1, Ll/ܶۘۚ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 250
    iget-object v0, v1, Ll/ܶۘۚ;->᩷:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Ll/֫ۘۚ;

    invoke-direct {v2, v1}, Ll/֫ۘۚ;-><init>(Ll/ܶۘۚ;)V

    :goto_3
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x1e

    invoke-interface {v0, v2, v4, v5, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 253
    :cond_5
    monitor-exit v16

    return-void

    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public final declared-synchronized ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v15, p0

    .line 1
    monitor-enter v15

    .line 143
    :try_start_0
    invoke-static/range {p2 .. p2}, Ll/ܶۘۚ;->ᩴ(Ljava/lang/String;)V

    .line 144
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, v1, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    iget-object v2, v2, Ll/ܺۘۚ;->᩸:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 268
    iget-object v2, v1, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    invoke-static {v2}, Ll/ܺۘۚ;->ۙ(Ll/ܺۘۚ;)Ljava/util/Map;

    move-result-object v2

    move-object/from16 v4, p1

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۘۚ;

    if-eqz v2, :cond_0

    .line 146
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v13

    new-instance v14, Ll/᩻ۘۚ;

    invoke-static {v2}, Ll/᩻ۘۚ;->ۙ(Ll/᩻ۘۚ;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2}, Ll/᩻ۘۚ;->᩷(Ll/᩻ۘۚ;)Ljava/lang/String;

    move-result-object v7

    iget-wide v8, v2, Ll/᩻ۘۚ;->᩷:J

    iget-wide v10, v2, Ll/᩻ۘۚ;->ܳ:J

    iget-object v12, v2, Ll/᩻ۘۚ;->ᩴ:Ljava/lang/String;

    move-object v3, v14

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    invoke-direct/range {v3 .. v12}, Ll/᩻ۘۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V

    invoke-virtual {v0, v13, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 148
    invoke-direct {v1, v0}, Ll/ܶۘۚ;->ۙ(Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    monitor-exit v15

    return-void

    .line 270
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unknown MCP credential"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 149
    monitor-exit v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized ۙ(Z)V
    .locals 11

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 111
    :try_start_0
    iget-object v1, p0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    if-eqz p1, :cond_1

    .line 112
    iget-boolean v2, v1, Ll/ܺۘۚ;->᩷:Z

    if-eqz v2, :cond_0

    iget-object v2, v1, Ll/ܺۘۚ;->᩸:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 113
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "MCP authentication requires a credential"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 115
    :cond_1
    :goto_0
    iget-object v2, p0, Ll/ܶۘۚ;->᩸:Ll/ۢ֫ܺ;

    invoke-interface {v2}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v2

    const-string v3, "amae"

    invoke-interface {v2, v3, p1}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object v2

    invoke-interface {v2}, Ll/ᩳ֫ܺ;->apply()V

    .line 116
    new-instance v2, Ll/ܺۘۚ;

    iget-boolean v5, v1, Ll/ܺۘۚ;->᩷:Z

    iget-wide v3, v1, Ll/ܺۘۚ;->ܳ:J

    const-wide/16 v6, 0x1

    add-long/2addr v6, v3

    iget-wide v3, v1, Ll/ܺۘۚ;->ۙ:J

    .line 117
    iget-boolean v8, v1, Ll/ܺۘۚ;->ᩴ:Z

    if-ne p1, v8, :cond_2

    const/4 v8, 0x0

    goto :goto_1

    :cond_2
    const/4 v8, 0x1

    :goto_1
    int-to-long v8, v8

    add-long/2addr v8, v3

    iget-object v10, v1, Ll/ܺۘۚ;->᩸:Ljava/util/List;

    move-object v3, v2

    move v4, p1

    invoke-direct/range {v3 .. v10}, Ll/ܺۘۚ;-><init>(ZZJJLjava/util/List;)V

    iput-object v2, p0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(JLjava/lang/String;)Z
    .locals 4

    .line 187
    iget-object v0, p0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    .line 188
    iget-wide v1, v0, Ll/ܺۘۚ;->ۙ:J

    cmp-long v3, v1, p1

    if-nez v3, :cond_1

    iget-boolean p1, v0, Ll/ܺۘۚ;->ᩴ:Z

    if-eqz p1, :cond_0

    iget-boolean p1, v0, Ll/ܺۘۚ;->᩷:Z

    if-eqz p1, :cond_1

    .line 189
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {v0}, Ll/ܺۘۚ;->ۙ(Ll/ܺۘۚ;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 190
    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final declared-synchronized ۤ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 105
    :try_start_0
    iget-object v1, p0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    invoke-static {v1}, Ll/ܺۘۚ;->ۙ(Ll/ܺۘۚ;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ۘۚ;

    if-eqz p1, :cond_1

    .line 106
    invoke-static {p1}, Ll/᩻ۘۚ;->᩷(Ll/᩻ۘۚ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/᩻ۘۚ;->᩷(Ll/᩻ۘۚ;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ᩷()Ll/ܺۘۚ;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    return-object v0
.end method

.method public final declared-synchronized ᩷(Ljava/lang/String;)Ll/᩻ۘۚ;
    .locals 14

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 93
    :try_start_0
    iget-object v1, p0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    invoke-static {v1}, Ll/ܺۘۚ;->ۙ(Ll/ܺۘۚ;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۘۚ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 95
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    .line 97
    :cond_0
    :try_start_1
    iget-object v2, p0, Ll/ܶۘۚ;->ۤ:Ll/ܽ֫ۗ;

    invoke-virtual {v2, p1}, Ll/ܽ֫ۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۘۚ;

    if-nez v2, :cond_1

    goto :goto_0

    .line 98
    :cond_1
    new-instance v13, Ll/᩻ۘۚ;

    iget-object v5, v1, Ll/᩻ۘۚ;->ۙ:Ljava/lang/String;

    invoke-static {v1}, Ll/᩻ۘۚ;->ۙ(Ll/᩻ۘۚ;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1}, Ll/᩻ۘۚ;->᩷(Ll/᩻ۘۚ;)Ljava/lang/String;

    move-result-object v7

    iget-wide v8, v1, Ll/᩻ۘۚ;->᩷:J

    iget-wide v10, v2, Ll/ܽۘۚ;->ۙ:J

    iget-object v12, v2, Ll/ܽۘۚ;->᩷:Ljava/lang/String;

    move-object v3, v13

    move-object v4, p1

    invoke-direct/range {v3 .. v12}, Ll/᩻ۘۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v1, v13

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ᩸(Ljava/lang/String;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 153
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    iget-object v2, v2, Ll/ܺۘۚ;->᩸:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 268
    iget-object v2, p0, Ll/ܶۘۚ;->ܳ:Ll/ܺۘۚ;

    invoke-static {v2}, Ll/ܺۘۚ;->ۙ(Ll/ܺۘۚ;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۘۚ;

    if-eqz v2, :cond_0

    .line 154
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 155
    invoke-direct {p0, v1}, Ll/ܶۘۚ;->ۙ(Ljava/util/ArrayList;)V

    .line 156
    iget-object v1, p0, Ll/ܶۘۚ;->ۤ:Ll/ܽ֫ۗ;

    invoke-virtual {v1, p1}, Ll/ܽ֫ۗ;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    monitor-exit v0

    return-void

    .line 270
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown MCP credential"

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 157
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

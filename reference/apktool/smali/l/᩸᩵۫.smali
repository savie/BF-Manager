.class public final Ll/᩸᩵۫;
.super Ll/֫᩶ܳ;
.source "D9TI"


# static fields
.field public static ֫:J

.field public static final ۚ:Landroid/net/ConnectivityManager;

.field public static ۧ:Z

.field public static ܺ:Z

.field public static ܽ:Z

.field public static ᩻:I


# instance fields
.field public final ۫:Ll/ᩳۛ۫;

.field public final ܳ:Ll/ۘۛ۫;

.field public ᩴ:Ljava/lang/String;

.field public ᩸:Ll/֡ۗ۫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "connectivity"

    .line 42
    invoke-static {v0}, Ll/᩶᩷ۧ;->᩷(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    sput-object v0, Ll/᩸᩵۫;->ۚ:Landroid/net/ConnectivityManager;

    const/4 v0, 0x1

    .line 43
    sput-boolean v0, Ll/᩸᩵۫;->ܺ:Z

    return-void
.end method

.method public constructor <init>(Ll/ᩳۛ۫;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Ll/᩸᩵۫;->۫:Ll/ᩳۛ۫;

    .line 72
    new-instance v0, Ll/ۘۛ۫;

    invoke-direct {v0, p1}, Ll/ۘۛ۫;-><init>(Ll/ᩳۛ۫;)V

    iput-object v0, p0, Ll/᩸᩵۫;->ܳ:Ll/ۘۛ۫;

    return-void
.end method

.method public static ۙ(Ll/᩸᩵۫;Ll/ۖۗܳ;)Landroid/graphics/Bitmap;
    .locals 4

    .line 335
    new-instance v0, Ll/۠ۗ۫;

    iget-object p0, p0, Ll/᩸᩵۫;->۫:Ll/ᩳۛ۫;

    .line 74
    new-instance v1, Ll/ۢۗ۫;

    invoke-direct {v1, p0, p1}, Ll/ۢۗ۫;-><init>(Ll/ᩳۛ۫;Ll/ۖۗܳ;)V

    .line 79
    invoke-interface {p1}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v2

    .line 74
    invoke-direct {v0, v1, p0, v2, v3}, Ll/۠ۗ۫;-><init>(Ll/ۖۗ۫;Ljava/lang/String;J)V

    .line 525
    new-instance p0, Ll/֨ۗ۫;

    invoke-direct {p0, v0}, Ll/֨ۗ۫;-><init>(Ll/۠ۗ۫;)V

    .line 205
    invoke-static {p0}, Ll/۠֡᩻;->᩷(Landroid/media/MediaDataSource;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/᩸᩵۫;Ll/ۖۗܳ;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;)Landroid/graphics/Bitmap;
    .locals 6

    .line 335
    new-instance v0, Ll/۠ۗ۫;

    iget-object v1, p0, Ll/᩸᩵۫;->۫:Ll/ᩳۛ۫;

    .line 74
    new-instance v2, Ll/ۢۗ۫;

    invoke-direct {v2, v1, p1}, Ll/ۢۗ۫;-><init>(Ll/ᩳۛ۫;Ll/ۖۗܳ;)V

    .line 79
    invoke-interface {p1}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v3

    .line 74
    invoke-direct {v0, v2, v1, v3, v4}, Ll/۠ۗ۫;-><init>(Ll/ۖۗ۫;Ljava/lang/String;J)V

    .line 525
    new-instance v1, Ll/֨ۗ۫;

    invoke-direct {v1, v0}, Ll/֨ۗ۫;-><init>(Ll/۠ۗ۫;)V

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 497
    :try_start_0
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹۬ۚ;

    if-nez v3, :cond_0

    .line 499
    invoke-static {v1}, Ll/ۘ۬ۚ;->ۙ(Landroid/media/MediaDataSource;)Ll/᩹۬ۚ;

    move-result-object v3

    .line 500
    invoke-virtual {p2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 346
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v4, "network:"

    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/᩸᩵۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 348
    invoke-interface {p1}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v4

    .line 347
    invoke-static {p0, p1, v4, v5}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/ۖۗܳ;J)Ljava/lang/String;

    move-result-object p0

    .line 395
    invoke-static {p0, v3}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/᩹۬ۚ;)V

    .line 502
    sget-object p0, Ll/᩹۬ۚ;->֡:Ll/᩹۬ۚ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v3, p0, :cond_0

    .line 517
    invoke-static {v1}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    return-object v0

    .line 401
    :cond_0
    :try_start_1
    new-instance p0, Ll/᩻۬ۧ;

    const/4 p2, 0x1

    invoke-direct {p0, p2}, Ll/᩻۬ۧ;-><init>(I)V

    invoke-interface {p1, p0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v2, 0x1

    .line 510
    :try_start_2
    invoke-static {v1}, Ll/۠֡᩻;->ۙ(Landroid/media/MediaDataSource;)Ll/ۗ۬ۚ;

    move-result-object p0

    .line 511
    invoke-virtual {p3, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 512
    invoke-virtual {p0}, Ll/ۗ۬ۚ;->ۙ()Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    if-nez v2, :cond_1

    .line 517
    invoke-static {v1}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    .line 519
    :cond_1
    throw p0

    .line 517
    :catch_0
    invoke-static {v1}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    :catch_1
    return-object v0
.end method

.method public static bridge synthetic ۙ(Ll/᩸᩵۫;)Ll/ۘۛ۫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸᩵۫;->ܳ:Ll/ۘۛ۫;

    return-object p0
.end method

.method private ۙ(Ljava/lang/String;Ll/᩵ܰܳ;Ll/᩵ܰܳ;Ll/᩶ۚܺ;)Ll/ۨ֡֫;
    .locals 3

    .line 299
    invoke-static {}, Ll/᩸᩵۫;->ᩴ()V

    .line 300
    invoke-direct {p0}, Ll/᩸᩵۫;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 301
    iget-object p1, p3, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 303
    :cond_0
    invoke-static {p1}, Ll/֫᩶ܳ;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 304
    iget-object p1, p2, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 306
    :cond_1
    invoke-static {p1}, Ll/֫᩶ܳ;->ۤ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 307
    iget-object p1, p3, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 310
    :cond_2
    sget-object v0, Ll/᩸᩵۫;->ۚ:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_7

    .line 311
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 85
    iget-object v1, p0, Ll/᩸᩵۫;->۫:Ll/ᩳۛ۫;

    iget-object v1, v1, Ll/ᩳۛ۫;->᩶:Ll/֡ۗ۫;

    .line 86
    iget-boolean v2, v1, Ll/֡ۗ۫;->ܰ:Z

    if-eqz v2, :cond_4

    .line 87
    sget-boolean v1, Ll/᩸᩵۫;->ܽ:Z

    goto :goto_1

    .line 89
    :cond_4
    iget-boolean v1, v1, Ll/֡ۗ۫;->ۖ:Z

    :goto_1
    if-eqz v1, :cond_5

    .line 312
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    and-int/lit8 v0, v0, 0x9

    if-nez v0, :cond_5

    goto :goto_2

    .line 321
    :cond_5
    :try_start_0
    invoke-direct {p0}, Ll/᩸᩵۫;->᩷()I

    move-result v0

    invoke-static {p1, p4, v0}, Ll/֡ۚܺ;->ۙ(Ljava/lang/String;Ll/᩶ۚܺ;I)Landroid/graphics/Bitmap;

    move-result-object p4

    invoke-static {p4}, Ll/ۨ֡֫;->ۙ(Landroid/graphics/Bitmap;)Ll/ۨ֡֫;

    move-result-object p3
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p3, :cond_6

    .line 327
    iget-object p2, p2, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    .line 328
    invoke-static {p1}, Ll/֫᩶ܳ;->᩸(Ljava/lang/String;)V

    return-object p2

    :cond_6
    return-object p3

    .line 323
    :catch_0
    invoke-static {p1}, Ll/֫᩶ܳ;->ᩴ(Ljava/lang/String;)V

    .line 324
    iget-object p1, p3, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 313
    :cond_7
    :goto_2
    invoke-static {p1}, Ll/֡ۚܺ;->ۙ(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 315
    invoke-static {p1}, Ll/ۨ֡֫;->ۙ(Landroid/graphics/Bitmap;)Ll/ۨ֡֫;

    move-result-object p1

    return-object p1

    .line 317
    :cond_8
    iget-object p1, p3, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1
.end method

.method private ۤ(Ll/ۖۗܳ;)Ljava/lang/String;
    .locals 3

    .line 339
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩸᩵۫;->۫:Ll/ᩳۛ۫;

    invoke-virtual {v1}, Ll/ᩳۛ۫;->ܶ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 340
    invoke-static {p1}, Ll/ܳ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private ۤ()Z
    .locals 2

    .line 76
    iget-object v0, p0, Ll/᩸᩵۫;->۫:Ll/ᩳۛ۫;

    iget-object v0, v0, Ll/ᩳۛ۫;->᩶:Ll/֡ۗ۫;

    .line 77
    iget-boolean v1, v0, Ll/֡ۗ۫;->ܰ:Z

    if-eqz v1, :cond_0

    .line 78
    sget-boolean v0, Ll/᩸᩵۫;->ۧ:Z

    return v0

    .line 80
    :cond_0
    iget-boolean v0, v0, Ll/֡ۗ۫;->ۢ:Z

    return v0
.end method

.method public static declared-synchronized ᩴ()V
    .locals 4

    .line 2
    const-class v0, Ll/᩸᩵۫;

    .line 3
    monitor-enter v0

    .line 60
    :try_start_0
    sget-boolean v1, Ll/᩸᩵۫;->ܺ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 61
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 63
    :try_start_1
    sput-boolean v1, Ll/᩸᩵۫;->ܺ:Z

    .line 64
    sget-object v1, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v2, "network_thumb_enable"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    sput-boolean v1, Ll/᩸᩵۫;->ۧ:Z

    .line 65
    sget-object v1, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v2, "network_thumb_only_load_on_wifi"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    sput-boolean v1, Ll/᩸᩵۫;->ܽ:Z

    .line 66
    sget-object v1, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v2, "network_thumb_time_limit"

    const/16 v3, 0xa

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    sput v1, Ll/᩸᩵۫;->᩻:I

    .line 67
    sget-object v1, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v2, "network_thumb_image_file_size_limit"

    const-string v3, "10MB"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡ۗ۫;->ۙ(Ljava/lang/String;)J

    move-result-wide v1

    sput-wide v1, Ll/᩸᩵۫;->֫:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method private ᩷()I
    .locals 2

    .line 103
    iget-object v0, p0, Ll/᩸᩵۫;->۫:Ll/ᩳۛ۫;

    iget-object v0, v0, Ll/ᩳۛ۫;->᩶:Ll/֡ۗ۫;

    .line 104
    iget-boolean v1, v0, Ll/֡ۗ۫;->ܰ:Z

    if-eqz v1, :cond_0

    .line 105
    sget v0, Ll/᩸᩵۫;->᩻:I

    return v0

    .line 107
    :cond_0
    iget v0, v0, Ll/֡ۗ۫;->֨:I

    return v0
.end method

.method private ᩸(Ll/ۖۗܳ;)Ljava/lang/String;
    .locals 5

    .line 362
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 369
    :try_start_0
    iget-object v2, p0, Ll/᩸᩵۫;->۫:Ll/ᩳۛ۫;

    iget-object v2, v2, Ll/ᩳۛ۫;->᩶:Ll/֡ۗ۫;

    .line 370
    iget-object v3, p0, Ll/᩸᩵۫;->ᩴ:Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v3, p0, Ll/᩸᩵۫;->᩸:Ll/֡ۗ۫;

    .line 371
    invoke-virtual {v2, v3}, Ll/֡ۗ۫;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 372
    iget-object v2, p0, Ll/᩸᩵۫;->ᩴ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    .line 375
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ll/֡ۗ۫;->clone()Ll/֡ۗ۫;

    move-result-object v2

    .line 376
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v3

    const-string v4, "net"

    .line 377
    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/security/MessageDigest;->update([B)V

    .line 378
    invoke-virtual {v2}, Ll/֡ۗ۫;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ܳ֫ܺ;->ۙ(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 379
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    invoke-static {v3}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/᩸᩵۫;->ᩴ:Ljava/lang/String;

    .line 380
    iput-object v2, p0, Ll/᩸᩵۫;->᩸:Ll/֡ۗ۫;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 381
    monitor-exit v0

    move-object v2, v3

    .line 362
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 363
    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 381
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public static ᩸()V
    .locals 1

    const/4 v0, 0x1

    .line 56
    sput-boolean v0, Ll/᩸᩵۫;->ܺ:Z

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۗܳ;I)Ljava/lang/String;
    .locals 0

    .line 234
    invoke-static {}, Ll/᩸᩵۫;->ᩴ()V

    .line 235
    invoke-direct {p0}, Ll/᩸᩵۫;->ۤ()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Ll/᩸᩵۫;->ۤ(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ(Ll/ۜ᩵ܳ;Ll/ۖۗܳ;I)Ll/ۨ֡֫;
    .locals 8

    const/16 p1, 0xc

    if-ne p3, p1, :cond_0

    .line 354
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 355
    invoke-direct {p0, p2}, Ll/᩸᩵۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܳ֫ܺ;->ۙ(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 356
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 188
    :cond_0
    invoke-direct {p0, p2}, Ll/᩸᩵۫;->ۤ(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-ne p3, p1, :cond_1

    .line 191
    invoke-interface {p2}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v1

    .line 190
    invoke-static {v0, p2, v1, v2}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/ۖۗܳ;J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    const/4 v1, 0x1

    if-eq p3, v1, :cond_1e

    const/4 v2, 0x2

    if-eq p3, v2, :cond_1e

    const/4 v2, 0x4

    .line 193
    sget-object v3, Ll/᩸᩵۫;->ۚ:Landroid/net/ConnectivityManager;

    const/4 v4, 0x0

    iget-object v5, p0, Ll/᩸᩵۫;->۫:Ll/ᩳۛ۫;

    const/16 v6, 0x17

    if-eq p3, v2, :cond_12

    if-eq p3, p1, :cond_2

    const/16 p1, 0xd

    if-ne p3, p1, :cond_1d

    .line 210
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v6, :cond_1d

    invoke-interface {p2}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-lez p1, :cond_1d

    .line 211
    invoke-static {}, Ll/᩸᩵۫;->ᩴ()V

    .line 213
    :try_start_0
    new-instance p1, Ll/֫ۗ۫;

    invoke-direct {p0}, Ll/᩸᩵۫;->᩷()I

    move-result p3

    invoke-direct {p1, v5, p2, p3}, Ll/֫ۗ۫;-><init>(Ll/ᩳۛ۫;Ll/ۖۗܳ;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 215
    :try_start_1
    sget-object p3, Ll/᩵ܰܳ;->ܺ:Ll/᩵ܰܳ;

    new-instance v1, Ll/۬ۗ۫;

    invoke-direct {v1, p1, p2}, Ll/۬ۗ۫;-><init>(Ll/֫ۗ۫;Ll/ۖۗܳ;)V

    invoke-direct {p0, v0, p3, p3, v1}, Ll/᩸᩵۫;->ۙ(Ljava/lang/String;Ll/᩵ܰܳ;Ll/᩵ܰܳ;Ll/᩶ۚܺ;)Ll/ۨ֡֫;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 218
    :try_start_2
    invoke-virtual {p1}, Ll/֫ۗ۫;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    return-object p2

    :catchall_0
    move-exception p2

    .line 213
    :try_start_3
    invoke-virtual {p1}, Ll/֫ۗ۫;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 223
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v6, :cond_1d

    .line 409
    invoke-static {v0}, Ll/֡ۚܺ;->ۙ(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 410
    invoke-static {p1}, Ll/ۨ֡֫;->ۙ(Landroid/graphics/Bitmap;)Ll/ۨ֡֫;

    move-result-object p1

    const-string p3, "network:"

    if-eqz p1, :cond_3

    .line 412
    sget-object v0, Ll/᩹۬ۚ;->᩶:Ll/᩹۬ۚ;

    .line 346
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p2}, Ll/᩸᩵۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 348
    invoke-interface {p2}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v2

    .line 347
    invoke-static {p3, p2, v2, v3}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/ۖۗܳ;J)Ljava/lang/String;

    move-result-object p3

    .line 395
    invoke-static {p3, v0}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/᩹۬ۚ;)V

    .line 401
    new-instance p3, Ll/᩻۬ۧ;

    invoke-direct {p3, v1}, Ll/᩻۬ۧ;-><init>(I)V

    invoke-interface {p2, p3}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    return-object p1

    .line 346
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p2}, Ll/᩸᩵۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 348
    invoke-interface {p2}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v6

    .line 347
    invoke-static {p1, p2, v6, v7}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/ۖۗܳ;J)Ljava/lang/String;

    move-result-object p1

    .line 387
    invoke-static {p1}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;)Ll/᩹۬ۚ;

    move-result-object p1

    .line 419
    sget-object v2, Ll/᩹۬ۚ;->֡:Ll/᩹۬ۚ;

    if-ne p1, v2, :cond_4

    .line 420
    invoke-interface {p2, v4}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 34
    invoke-static {p2}, Ll/۟᩷۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 423
    :cond_4
    sget-object v6, Ll/᩹۬ۚ;->ܿ:Ll/᩹۬ۚ;

    if-ne p1, v6, :cond_5

    .line 401
    new-instance p1, Ll/᩻۬ۧ;

    invoke-direct {p1, v1}, Ll/᩻۬ۧ;-><init>(I)V

    invoke-interface {p2, p1}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 426
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 428
    :cond_5
    invoke-static {v0}, Ll/֫᩶ܳ;->ۤ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 429
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    :cond_6
    if-eqz v3, :cond_7

    .line 432
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    goto :goto_2

    :cond_7
    move-object v3, v4

    .line 433
    :goto_2
    invoke-direct {p0}, Ll/᩸᩵۫;->ۤ()Z

    move-result v7

    if-eqz v7, :cond_11

    if-eqz v3, :cond_11

    .line 435
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v7

    if-eqz v7, :cond_11

    .line 85
    iget-object v5, v5, Ll/ᩳۛ۫;->᩶:Ll/֡ۗ۫;

    .line 86
    iget-boolean v7, v5, Ll/֡ۗ۫;->ܰ:Z

    if-eqz v7, :cond_8

    .line 87
    sget-boolean v5, Ll/᩸᩵۫;->ܽ:Z

    goto :goto_3

    .line 89
    :cond_8
    iget-boolean v5, v5, Ll/֡ۗ۫;->ۖ:Z

    :goto_3
    if-eqz v5, :cond_9

    .line 437
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getType()I

    move-result v3

    and-int/lit8 v3, v3, 0x9

    if-nez v3, :cond_9

    goto/16 :goto_6

    .line 442
    :cond_9
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v3, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 444
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 448
    :try_start_5
    new-instance v5, Ll/ۙ᩵۫;

    invoke-direct {v5, p0, p2, v3, p1}, Ll/ۙ᩵۫;-><init>(Ll/᩸᩵۫;Ll/ۖۗܳ;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 451
    invoke-direct {p0}, Ll/᩸᩵۫;->᩷()I

    move-result v7

    .line 448
    invoke-static {v0, v5, v7}, Ll/֡ۚܺ;->ۙ(Ljava/lang/String;Ll/᩶ۚܺ;I)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_5
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_5 .. :try_end_5} :catch_0

    .line 465
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹۬ۚ;

    if-eqz v0, :cond_b

    .line 467
    sget-object p1, Ll/᩹۬ۚ;->᩶:Ll/᩹۬ۚ;

    .line 346
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p2}, Ll/᩸᩵۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 348
    invoke-interface {p2}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v2

    .line 347
    invoke-static {p3, p2, v2, v3}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/ۖۗܳ;J)Ljava/lang/String;

    move-result-object p3

    .line 395
    invoke-static {p3, p1}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/᩹۬ۚ;)V

    .line 401
    new-instance p1, Ll/᩻۬ۧ;

    invoke-direct {p1, v1}, Ll/᩻۬ۧ;-><init>(I)V

    invoke-interface {p2, p1}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 469
    invoke-static {v0}, Ll/ۨ֡֫;->ۙ(Landroid/graphics/Bitmap;)Ll/ۨ֡֫;

    move-result-object p1

    if-eqz p1, :cond_a

    return-object p1

    .line 470
    :cond_a
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    :cond_b
    if-ne v3, v2, :cond_c

    .line 473
    invoke-interface {p2, v4}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 34
    invoke-static {p2}, Ll/۟᩷۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 476
    :cond_c
    sget-object v0, Ll/᩹۬ۚ;->᩶:Ll/᩹۬ۚ;

    if-ne v3, v0, :cond_d

    .line 401
    new-instance v0, Ll/᩻۬ۧ;

    invoke-direct {v0, v1}, Ll/᩻۬ۧ;-><init>(I)V

    invoke-interface {p2, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 479
    :cond_d
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗ۬ۚ;

    if-eqz p1, :cond_e

    .line 480
    invoke-virtual {p1}, Ll/ۗ۬ۚ;->᩷()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 346
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p2}, Ll/᩸᩵۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 348
    invoke-interface {p2}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v0

    .line 347
    invoke-static {p1, p2, v0, v1}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/ۖۗܳ;J)Ljava/lang/String;

    move-result-object p1

    .line 395
    invoke-static {p1, v6}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/᩹۬ۚ;)V

    .line 485
    :cond_e
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    :catch_0
    nop

    .line 453
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹۬ۚ;

    .line 454
    sget-object p3, Ll/᩹۬ۚ;->֡:Ll/᩹۬ۚ;

    if-ne p1, p3, :cond_f

    .line 455
    invoke-interface {p2, v4}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 34
    invoke-static {p2}, Ll/۟᩷۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    :goto_4
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    goto :goto_5

    .line 458
    :cond_f
    sget-object p3, Ll/᩹۬ۚ;->᩶:Ll/᩹۬ۚ;

    if-ne p1, p3, :cond_10

    .line 401
    new-instance p1, Ll/᩻۬ۧ;

    invoke-direct {p1, v1}, Ll/᩻۬ۧ;-><init>(I)V

    invoke-interface {p2, p1}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 461
    :cond_10
    invoke-static {v0}, Ll/֫᩶ܳ;->ᩴ(Ljava/lang/String;)V

    .line 462
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    goto :goto_4

    :goto_5
    return-object p1

    .line 439
    :cond_11
    :goto_6
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 200
    :cond_12
    invoke-interface {p2}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object p1

    sget p3, Ll/ۜۖۚ;->ۙ:I

    .line 78
    invoke-static {p1}, Ll/᩷᩸֫;->᩷(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1c

    .line 242
    invoke-static {}, Ll/᩸᩵۫;->ᩴ()V

    .line 243
    invoke-virtual {p0, p2}, Ll/᩸᩵۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 244
    invoke-direct {p0}, Ll/᩸᩵۫;->ۤ()Z

    move-result p3

    if-eqz p3, :cond_1b

    invoke-static {v0}, Ll/֫᩶ܳ;->ۤ(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_13

    goto :goto_a

    :cond_13
    if-eqz v3, :cond_14

    .line 247
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v4

    :cond_14
    if-eqz v4, :cond_1a

    .line 248
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p3

    if-eqz p3, :cond_1a

    .line 85
    iget-object p3, v5, Ll/ᩳۛ۫;->᩶:Ll/֡ۗ۫;

    .line 86
    iget-boolean v1, p3, Ll/֡ۗ۫;->ܰ:Z

    if-eqz v1, :cond_15

    .line 87
    sget-boolean p3, Ll/᩸᩵۫;->ܽ:Z

    goto :goto_7

    .line 89
    :cond_15
    iget-boolean p3, p3, Ll/֡ۗ۫;->ۖ:Z

    :goto_7
    if-eqz p3, :cond_16

    .line 249
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getType()I

    move-result p3

    and-int/lit8 p3, p3, 0x9

    if-nez p3, :cond_16

    goto :goto_9

    .line 254
    :cond_16
    invoke-direct {p0}, Ll/᩸᩵۫;->᩷()I

    move-result p3

    .line 253
    invoke-static {v5, p2, p3}, Ll/ۜۖۚ;->ۙ(Ll/۟ۘܳ;Ll/ۖۗܳ;I)Ll/ۡۖۚ;

    move-result-object p2

    .line 255
    invoke-virtual {p2}, Ll/ۡۖۚ;->᩷()Ll/ۖۖۚ;

    move-result-object p3

    sget-object v1, Ll/ۖۖۚ;->֡:Ll/ۖۖۚ;

    if-ne p3, v1, :cond_17

    .line 256
    invoke-virtual {p2}, Ll/ۡۖۚ;->ۙ()Landroid/graphics/Bitmap;

    move-result-object p3

    invoke-static {p3}, Ll/ۨ֡֫;->ۙ(Landroid/graphics/Bitmap;)Ll/ۨ֡֫;

    move-result-object p3

    if-eqz p3, :cond_17

    return-object p3

    .line 261
    :cond_17
    invoke-virtual {p2}, Ll/ۡۖۚ;->᩷()Ll/ۖۖۚ;

    move-result-object p3

    sget-object v1, Ll/ۖۖۚ;->۟:Ll/ۖۖۚ;

    if-ne p3, v1, :cond_18

    .line 262
    invoke-static {v0}, Ll/֫᩶ܳ;->ᩴ(Ljava/lang/String;)V

    goto :goto_8

    .line 263
    :cond_18
    invoke-virtual {p2}, Ll/ۡۖۚ;->᩷()Ll/ۖۖۚ;

    move-result-object p2

    sget-object p3, Ll/ۖۖۚ;->ܿ:Ll/ۖۖۚ;

    if-ne p2, p3, :cond_19

    .line 264
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    :cond_19
    :goto_8
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    :cond_1a
    :goto_9
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    :cond_1b
    :goto_a
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 203
    :cond_1c
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v6, :cond_1d

    .line 204
    sget-object p1, Ll/᩵ܰܳ;->۟ۙ:Ll/᩵ܰܳ;

    new-instance p3, Ll/ᩴۨܳ;

    invoke-direct {p3, p0, p2}, Ll/ᩴۨܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0, v0, p1, p1, p3}, Ll/᩸᩵۫;->ۙ(Ljava/lang/String;Ll/᩵ܰܳ;Ll/᩵ܰܳ;Ll/᩶ۚܺ;)Ll/ۨ֡֫;

    move-result-object p1

    return-object p1

    .line 228
    :catch_1
    :cond_1d
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 196
    :cond_1e
    sget-object p1, Ll/᩵ܰܳ;->ᩳ:Ll/᩵ܰܳ;

    new-instance p3, Ll/ۜۗ۫;

    invoke-direct {p3, p0, p2}, Ll/ۜۗ۫;-><init>(Ll/᩸᩵۫;Ll/ۖۗܳ;)V

    invoke-direct {p0, v0, p1, p1, p3}, Ll/᩸᩵۫;->ۙ(Ljava/lang/String;Ll/᩵ܰܳ;Ll/᩵ܰܳ;Ll/᩶ۚܺ;)Ll/ۨ֡֫;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;
    .locals 3

    .line 113
    invoke-interface {p1}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    invoke-interface {p1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v1

    .line 114
    invoke-static {v1, v2, v0}, Ll/ۘ۬ۚ;->ۙ(JLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 346
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "network:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/᩸᩵۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 348
    invoke-interface {p1}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v1

    .line 347
    invoke-static {v0, p1, v1, v2}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/ۖۗܳ;J)Ljava/lang/String;

    move-result-object v0

    .line 387
    invoke-static {v0}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;)Ll/᩹۬ۚ;

    move-result-object v0

    .line 118
    sget-object v1, Ll/᩹۬ۚ;->֡:Ll/᩹۬ۚ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 119
    invoke-interface {p1, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    goto :goto_0

    .line 121
    :cond_0
    sget-object v1, Ll/᩹۬ۚ;->ܿ:Ll/᩹۬ۚ;

    if-ne v0, v1, :cond_1

    .line 401
    new-instance v0, Ll/᩻۬ۧ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/᩻۬ۧ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 124
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    return-object p1

    .line 126
    :cond_1
    sget-object v1, Ll/᩹۬ۚ;->᩶:Ll/᩹۬ۚ;

    if-ne v0, v1, :cond_2

    .line 401
    new-instance v0, Ll/᩻۬ۧ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/᩻۬ۧ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 129
    :cond_2
    sget-object p1, Ll/᩵ܰܳ;->۟ۙ:Ll/᩵ܰܳ;

    return-object p1

    .line 34
    :cond_3
    :goto_0
    invoke-static {p1}, Ll/۟᩷۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(Ll/ۖۗܳ;)I
    .locals 10

    .line 137
    invoke-static {}, Ll/᩸᩵۫;->ᩴ()V

    .line 138
    invoke-direct {p0}, Ll/᩸᩵۫;->ۤ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 141
    :cond_0
    invoke-interface {p1}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 142
    invoke-interface {p1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۘ۬ۚ;->᩷(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    const/16 v3, 0x17

    if-eqz v0, :cond_6

    .line 144
    invoke-interface {p1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v4

    .line 143
    invoke-static {v4, v5, v0}, Ll/ۘ۬ۚ;->ۙ(JLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v3, :cond_1

    goto :goto_0

    .line 346
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "network:"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/᩸᩵۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 348
    invoke-interface {p1}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v3

    .line 347
    invoke-static {v0, p1, v3, v4}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/ۖۗܳ;J)Ljava/lang/String;

    move-result-object v0

    .line 387
    invoke-static {v0}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;)Ll/᩹۬ۚ;

    move-result-object v0

    .line 151
    sget-object v3, Ll/᩹۬ۚ;->֡:Ll/᩹۬ۚ;

    if-ne v0, v3, :cond_2

    const/4 v0, 0x0

    .line 152
    invoke-interface {p1, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 153
    invoke-interface {p1, v1}, Ll/ۖۗܳ;->᩷(I)V

    return v1

    .line 156
    :cond_2
    sget-object v3, Ll/᩹۬ۚ;->ܿ:Ll/᩹۬ۚ;

    if-ne v0, v3, :cond_3

    .line 401
    new-instance v0, Ll/᩻۬ۧ;

    invoke-direct {v0, v2}, Ll/᩻۬ۧ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 159
    invoke-interface {p1, v1}, Ll/ۖۗܳ;->᩷(I)V

    return v1

    .line 162
    :cond_3
    sget-object v1, Ll/᩹۬ۚ;->᩶:Ll/᩹۬ۚ;

    if-ne v0, v1, :cond_4

    .line 401
    new-instance v0, Ll/᩻۬ۧ;

    invoke-direct {v0, v2}, Ll/᩻۬ۧ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    :cond_4
    const/16 p1, 0xc

    return p1

    .line 146
    :cond_5
    :goto_0
    invoke-interface {p1, v1}, Ll/ۖۗܳ;->᩷(I)V

    return v1

    .line 167
    :cond_6
    invoke-interface {p1}, Ll/ۖۗܳ;->᩺ۙ()Ljava/lang/String;

    move-result-object v0

    const-string v4, "image/svg+xml"

    .line 168
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, p0, Ll/᩸᩵۫;->۫:Ll/ᩳۛ۫;

    if-eqz v4, :cond_8

    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v6

    .line 94
    iget-object v4, v5, Ll/ᩳۛ۫;->᩶:Ll/֡ۗ۫;

    .line 95
    iget-boolean v8, v4, Ll/֡ۗ۫;->ܰ:Z

    if-eqz v8, :cond_7

    .line 96
    sget-wide v8, Ll/᩸᩵۫;->֫:J

    goto :goto_1

    .line 98
    :cond_7
    iget-wide v8, v4, Ll/֡ۗ۫;->۟:J

    :goto_1
    cmp-long v4, v6, v8

    if-gez v4, :cond_8

    const/4 p1, 0x2

    return p1

    :cond_8
    const-string v4, "image/"

    .line 170
    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v6

    .line 94
    iget-object v4, v5, Ll/ᩳۛ۫;->᩶:Ll/֡ۗ۫;

    .line 95
    iget-boolean v5, v4, Ll/֡ۗ۫;->ܰ:Z

    if-eqz v5, :cond_9

    .line 96
    sget-wide v4, Ll/᩸᩵۫;->֫:J

    goto :goto_2

    .line 98
    :cond_9
    iget-wide v4, v4, Ll/֡ۗ۫;->۟:J

    :goto_2
    cmp-long v8, v6, v4

    if-gez v8, :cond_a

    return v2

    .line 172
    :cond_a
    invoke-interface {p1}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v2

    sget v4, Ll/ۜۖۚ;->ۙ:I

    .line 78
    invoke-static {v2}, Ll/᩷᩸֫;->᩷(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_3

    .line 174
    :cond_b
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v3, :cond_d

    const-string v2, "video/"

    .line 175
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    :goto_3
    const/4 p1, 0x4

    return p1

    :cond_c
    const-string v2, "audio/"

    .line 177
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-lez p1, :cond_d

    const/16 p1, 0xd

    return p1

    :cond_d
    :goto_4
    return v1
.end method

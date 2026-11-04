.class public Ll/۫᩻۫;
.super Ll/֫᩶ܳ;
.source "I23M"


# static fields
.field public static final ᩴ:Ll/۫᩻۫;

.field public static final ᩸:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Ll/۫᩻۫;

    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    sput-object v0, Ll/۫᩻۫;->ᩴ:Ll/۫᩻۫;

    const-string v0, "/data/user(_de)?/\\d+/"

    .line 41
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/۫᩻۫;->᩸:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ᩷()Z
    .locals 3

    .line 470
    sget-object v0, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v1, "external_storage_thumb_enable"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static ᩸(Ll/ۖۗܳ;)Ljava/lang/String;
    .locals 4

    .line 373
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "local:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 374
    invoke-interface {p0}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 376
    invoke-interface {p0}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v1

    .line 375
    invoke-static {v0, p0, v1, v2}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/ۖۗܳ;J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۙ(Ll/ۖۗܳ;I)Ljava/lang/String;
    .locals 4

    .line 48
    invoke-virtual {p0, p1}, Ll/۫᩻۫;->ۤ(Ll/ۖۗܳ;)Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, v0, Ll/ܳ᩶ᩴ;

    if-eqz v0, :cond_0

    .line 48
    invoke-static {}, Ll/۫᩻۫;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 49
    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v0

    const-wide/32 v2, 0x10000000

    cmp-long p2, v0, v2

    if-lez p2, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 365
    :cond_1
    invoke-interface {p1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v0

    invoke-interface {p1}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v2

    sget p1, Ll/֡ۚܺ;->ۙ:I

    .line 51
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-static {p1}, Ll/ܳ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/ۜ᩵ܳ;Ll/ۖۗܳ;I)Ll/ۨ֡֫;
    .locals 8

    .line 365
    invoke-interface {p2}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v1

    invoke-interface {p2}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v3

    sget v5, Ll/֡ۚܺ;->ۙ:I

    .line 51
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-static {v0}, Ll/ܳ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    if-ne p3, v1, :cond_0

    .line 198
    invoke-interface {p2}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v1

    .line 197
    invoke-static {v0, p2, v1, v2}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/ۖۗܳ;J)Ljava/lang/String;

    move-result-object v0

    .line 200
    :cond_0
    invoke-virtual {p0, p2}, Ll/۫᩻۫;->ۤ(Ll/ۖۗܳ;)Ll/᩷ۨᩴ;

    move-result-object v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    packed-switch p3, :pswitch_data_0

    .line 330
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 246
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ܳ᩶ᩴ;

    if-eqz p1, :cond_1

    .line 246
    invoke-static {}, Ll/۫᩻۫;->᩷()Z

    move-result p1

    if-nez p1, :cond_1

    .line 247
    invoke-virtual {p0, p2}, Ll/۫᩻۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 250
    :cond_1
    sget-object p1, Ll/᩵ܰܳ;->ܺ:Ll/᩵ܰܳ;

    new-instance p2, Ll/ۛᩴܺ;

    invoke-direct {p2, v2, v1}, Ll/ۛᩴܺ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, p1, v5, p2}, Ll/֫᩶ܳ;->ۙ(Ljava/lang/String;Ll/᩵ܰܳ;ZLl/᩶ۚܺ;)Ll/ۨ֡֫;

    move-result-object p1

    return-object p1

    .line 413
    :pswitch_1
    invoke-static {v0}, Ll/֡ۚܺ;->ۙ(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 414
    invoke-static {p1}, Ll/ۨ֡֫;->ۙ(Landroid/graphics/Bitmap;)Ll/ۨ֡֫;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 416
    sget-object p3, Ll/᩹۬ۚ;->᩶:Ll/᩹۬ۚ;

    .line 396
    invoke-static {p2}, Ll/۫᩻۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object v0

    .line 395
    invoke-static {v0, p3}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/᩹۬ۚ;)V

    .line 403
    new-instance p3, Ll/ܳ᩻۫;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2, p3}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    return-object p1

    .line 386
    :cond_2
    invoke-static {p2}, Ll/۫᩻۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object p1

    .line 385
    invoke-static {p1}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;)Ll/᩹۬ۚ;

    move-result-object p1

    .line 423
    sget-object p3, Ll/᩹۬ۚ;->֡:Ll/᩹۬ۚ;

    if-ne p1, p3, :cond_3

    .line 424
    invoke-interface {p2, v3}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 34
    invoke-static {p2}, Ll/۟᩷۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 427
    :cond_3
    sget-object v2, Ll/᩹۬ۚ;->ܿ:Ll/᩹۬ۚ;

    if-ne p1, v2, :cond_4

    .line 403
    new-instance p1, Ll/ܳ᩻۫;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2, p1}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 430
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    :cond_4
    if-nez p1, :cond_7

    .line 434
    :try_start_0
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ۧ᩷()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 435
    :try_start_1
    invoke-static {p1}, Ll/ۘ۬ۚ;->ۙ(Ljava/io/InputStream;)Ll/᩹۬ۚ;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_5

    .line 436
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 396
    :cond_5
    invoke-static {p2}, Ll/۫᩻۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object p1

    .line 395
    invoke-static {p1, v5}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/᩹۬ۚ;)V

    if-ne v5, p3, :cond_7

    .line 442
    invoke-interface {p2, v3}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 34
    invoke-static {p2}, Ll/۟᩷۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    :catchall_0
    move-exception p2

    if-eqz p1, :cond_6

    .line 434
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_0
    throw p2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 438
    :catch_0
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 403
    :cond_7
    new-instance p1, Ll/ܳ᩻۫;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2, p1}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 448
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 450
    sget-object p3, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    new-instance v3, Ll/ܶ۫۫;

    invoke-direct {v3, v1, p1}, Ll/ܶ۫۫;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, p3, v4, v3}, Ll/֫᩶ܳ;->ۙ(Ljava/lang/String;Ll/᩵ܰܳ;ZLl/᩶ۚܺ;)Ll/ۨ֡֫;

    move-result-object p3

    .line 460
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗ۬ۚ;

    if-eqz p1, :cond_8

    .line 461
    invoke-virtual {p1}, Ll/ۗ۬ۚ;->᩷()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 396
    invoke-static {p2}, Ll/۫᩻۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object p1

    .line 395
    invoke-static {p1, v2}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;Ll/᩹۬ۚ;)V

    :cond_8
    return-object p3

    .line 263
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ܳ᩶ᩴ;

    if-eqz p1, :cond_9

    .line 263
    invoke-static {}, Ll/۫᩻۫;->᩷()Z

    move-result p1

    if-nez p1, :cond_9

    .line 264
    invoke-virtual {p0, p2}, Ll/۫᩻۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 266
    :cond_9
    sget-object p1, Ll/᩵ܰܳ;->֫:Ll/᩵ܰܳ;

    new-instance p2, Ll/ᩳܿ᩻;

    invoke-direct {p2, v1}, Ll/ᩳܿ᩻;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1, v5, p2}, Ll/֫᩶ܳ;->ۙ(Ljava/lang/String;Ll/᩵ܰܳ;ZLl/᩶ۚܺ;)Ll/ۨ֡֫;

    move-result-object p2

    .line 269
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    if-ne p2, p1, :cond_a

    return-object p2

    .line 272
    :cond_a
    invoke-static {p2, v0}, Ll/᩶ܿ᩻;->ۙ(Ll/ۨ֡֫;Ljava/lang/String;)Ll/᩷ۡ;

    move-result-object p1

    invoke-static {p1}, Ll/ۨ֡֫;->ۙ(Ll/᩷ۡ;)Ll/ۨ֡֫;

    move-result-object p1

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    .line 313
    :pswitch_3
    :try_start_5
    check-cast p2, Ll/ۚ᩻۫;

    invoke-virtual {p2}, Ll/ۚ᩻۫;->᩷()Ll/᩻᩶ᩴ;

    move-result-object p1

    .line 314
    iget-object p1, p1, Ll/᩻᩶ᩴ;->ܳ:Landroid/net/Uri;

    .line 315
    sget p2, Ll/ܺ᩶ᩴ;->ۙ:I

    .line 131
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p2

    const-string p3, ".MTDataFilesProvider"

    invoke-virtual {p2, p3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_b

    .line 316
    invoke-static {p1}, Ll/ܺ᩶ᩴ;->᩷(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    .line 317
    invoke-static {p1}, Ll/᩶ܿ᩻;->ۙ(Ljava/lang/String;)Ll/᩷ۡ;

    move-result-object p1

    invoke-static {p1}, Ll/ۨ֡֫;->ۙ(Ll/᩷ۡ;)Ll/ۨ֡֫;

    move-result-object v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_1

    :catch_1
    nop

    :cond_b
    :goto_1
    if-nez v3, :cond_c

    .line 323
    sget-object p1, Ll/᩵ܰܳ;->᩺:Ll/᩵ܰܳ;

    .line 245
    iget-object v3, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    :cond_c
    return-object v3

    :pswitch_4
    :try_start_6
    const-string p1, "r"

    .line 299
    invoke-virtual {v1, p1}, Ll/᩷ۨᩴ;->ۧ(Ljava/lang/String;)Ll/۬ܺۤ;

    move-result-object p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 300
    :try_start_7
    sget p2, Ll/֫ۗۨ;->ۙ:I

    .line 54
    invoke-virtual {p1}, Ll/۬ܺۤ;->length()J

    move-result-wide p2

    const-wide/16 v0, 0x28

    cmp-long v2, p2, v0

    if-lez v2, :cond_d

    invoke-virtual {p1}, Ll/۬ܺۤ;->readInt()I

    move-result p2

    const p3, 0x4955494d

    if-ne p2, p3, :cond_d

    invoke-virtual {p1}, Ll/۬ܺۤ;->readInt()I

    move-result p2

    const p3, 0x43414220

    if-ne p2, p3, :cond_d

    invoke-virtual {p1}, Ll/۬ܺۤ;->readInt()I

    move-result p2

    const p3, 0xa50554b

    if-ne p2, p3, :cond_d

    .line 301
    sget-object p2, Ll/᩵ܰܳ;->᩵:Ll/᩵ܰܳ;

    .line 245
    :goto_2
    iget-object p2, p2, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    goto :goto_3

    .line 303
    :cond_d
    sget-object p2, Ll/᩵ܰܳ;->ۛ:Ll/᩵ܰܳ;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_2

    .line 305
    :goto_3
    :try_start_8
    invoke-virtual {p1}, Ll/۬ܺۤ;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    return-object p2

    :catchall_2
    move-exception p2

    .line 299
    :try_start_9
    invoke-virtual {p1}, Ll/۬ܺۤ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p1

    :try_start_a
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p2
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2

    .line 306
    :catch_2
    sget-object p1, Ll/᩵ܰܳ;->ۛ:Ll/᩵ܰܳ;

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 292
    :pswitch_5
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ܿ᩻;->᩷(Ljava/lang/String;)Ll/᩷ۡ;

    move-result-object p1

    invoke-static {p1}, Ll/ۨ֡֫;->ۙ(Ll/᩷ۡ;)Ll/ۨ֡֫;

    move-result-object p1

    if-nez p1, :cond_e

    .line 294
    sget-object p1, Ll/᩵ܰܳ;->᩺:Ll/᩵ܰܳ;

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    :cond_e
    return-object p1

    .line 285
    :pswitch_6
    invoke-interface {p2}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ܿ᩻;->ۙ(Ljava/lang/String;)Ll/᩷ۡ;

    move-result-object p1

    invoke-static {p1}, Ll/ۨ֡֫;->ۙ(Ll/᩷ۡ;)Ll/ۨ֡֫;

    move-result-object p1

    if-nez p1, :cond_f

    .line 287
    sget-object p1, Ll/᩵ܰܳ;->᩺:Ll/᩵ܰܳ;

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    :cond_f
    return-object p1

    .line 276
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ܳ᩶ᩴ;

    if-eqz p1, :cond_10

    .line 276
    invoke-static {}, Ll/۫᩻۫;->᩷()Z

    move-result p1

    if-nez p1, :cond_10

    .line 277
    invoke-virtual {p0, p2}, Ll/۫᩻۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 279
    :cond_10
    sget-object p1, Ll/᩵ܰܳ;->ᩴۙ:Ll/᩵ܰܳ;

    new-instance p2, Ll/ۙᩳᩴ;

    const/4 p3, 0x4

    invoke-direct {p2, p3, v1}, Ll/ۙᩳᩴ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, p1, v5, p2}, Ll/֫᩶ܳ;->ۙ(Ljava/lang/String;Ll/᩵ܰܳ;ZLl/᩶ۚܺ;)Ll/ۨ֡֫;

    move-result-object p1

    return-object p1

    .line 255
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ܳ᩶ᩴ;

    if-eqz p1, :cond_11

    .line 255
    invoke-static {}, Ll/۫᩻۫;->᩷()Z

    move-result p1

    if-nez p1, :cond_11

    .line 256
    invoke-virtual {p0, p2}, Ll/۫᩻۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 258
    :cond_11
    sget-object p1, Ll/᩵ܰܳ;->ۧ:Ll/᩵ܰܳ;

    new-instance p2, Ll/᩺ᩴܺ;

    invoke-direct {p2, v1}, Ll/᩺ᩴܺ;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1, v4, p2}, Ll/֫᩶ܳ;->ۙ(Ljava/lang/String;Ll/᩵ܰܳ;ZLl/᩶ۚܺ;)Ll/ۨ֡֫;

    move-result-object p1

    return-object p1

    .line 235
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p3, v1, Ll/ܳ᩶ᩴ;

    if-eqz p3, :cond_12

    .line 235
    invoke-static {}, Ll/۫᩻۫;->᩷()Z

    move-result p3

    if-nez p3, :cond_12

    .line 236
    invoke-virtual {p0, p2}, Ll/۫᩻۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 238
    :cond_12
    invoke-interface {p2}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object p3

    sget v2, Ll/ۜۖۚ;->ۙ:I

    .line 78
    invoke-static {p3}, Ll/᩷᩸֫;->᩷(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_16

    if-nez p1, :cond_13

    .line 349
    sget-object p1, Ll/ۧ᩻۫;->᩶:Ll/ۧ᩻۫;

    goto :goto_5

    :cond_13
    invoke-virtual {p1}, Ll/ۜ᩵ܳ;->ܿ()Ll/۟ۘܳ;

    move-result-object p1

    :goto_5
    const/4 p3, 0x5

    .line 350
    invoke-static {p1, p2, p3}, Ll/ۜۖۚ;->ۙ(Ll/۟ۘܳ;Ll/ۖۗܳ;I)Ll/ۡۖۚ;

    move-result-object p1

    .line 352
    invoke-virtual {p1}, Ll/ۡۖۚ;->᩷()Ll/ۖۖۚ;

    move-result-object p3

    sget-object v0, Ll/ۖۖۚ;->֡:Ll/ۖۖۚ;

    if-ne p3, v0, :cond_14

    .line 353
    invoke-virtual {p1}, Ll/ۡۖۚ;->ۙ()Landroid/graphics/Bitmap;

    move-result-object p3

    invoke-static {p3}, Ll/ۨ֡֫;->ۙ(Landroid/graphics/Bitmap;)Ll/ۨ֡֫;

    move-result-object p3

    if-eqz p3, :cond_14

    return-object p3

    .line 358
    :cond_14
    invoke-virtual {p1}, Ll/ۡۖۚ;->᩷()Ll/ۖۖۚ;

    move-result-object p1

    sget-object p3, Ll/ۖۖۚ;->ܿ:Ll/ۖۖۚ;

    if-ne p1, p3, :cond_15

    .line 359
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 361
    :cond_15
    invoke-virtual {p0, p2}, Ll/۫᩻۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 241
    :cond_16
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    new-instance p2, Ll/ܿۛܳ;

    invoke-direct {p2, v1}, Ll/ܿۛܳ;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1, v5, p2}, Ll/֫᩶ܳ;->ۙ(Ljava/lang/String;Ll/᩵ܰܳ;ZLl/᩶ۚܺ;)Ll/ۨ֡֫;

    move-result-object p1

    return-object p1

    .line 223
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ܳ᩶ᩴ;

    if-eqz p1, :cond_17

    .line 223
    invoke-static {}, Ll/۫᩻۫;->᩷()Z

    move-result p1

    if-nez p1, :cond_17

    .line 224
    invoke-virtual {p0, p2}, Ll/۫᩻۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 226
    :cond_17
    sget-object p1, Ll/᩵ܰܳ;->ۖۙ:Ll/᩵ܰܳ;

    new-instance p3, Ll/ۜܺܺ;

    invoke-direct {p3, v2, v1}, Ll/ۜܺܺ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, p1, v5, p3}, Ll/֫᩶ܳ;->ۙ(Ljava/lang/String;Ll/᩵ܰܳ;ZLl/᩶ۚܺ;)Ll/ۨ֡֫;

    move-result-object p3

    .line 229
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    if-eq p3, p1, :cond_18

    const p1, 0x7f0a02c7

    .line 230
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1, v0}, Ll/ۖۗܳ;->᩷(ILjava/lang/Object;)V

    :cond_18
    return-object p3

    .line 215
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ܳ᩶ᩴ;

    if-eqz p1, :cond_19

    .line 215
    invoke-static {}, Ll/۫᩻۫;->᩷()Z

    move-result p1

    if-nez p1, :cond_19

    .line 216
    invoke-virtual {p0, p2}, Ll/۫᩻۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 218
    :cond_19
    sget-object p1, Ll/᩵ܰܳ;->ۢ:Ll/᩵ܰܳ;

    new-instance p2, Ll/ܽۚۧ;

    invoke-direct {p2, v1}, Ll/ܽۚۧ;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1, v5, p2}, Ll/֫᩶ܳ;->ۙ(Ljava/lang/String;Ll/᩵ܰܳ;ZLl/᩶ۚܺ;)Ll/ۨ֡֫;

    move-result-object p1

    return-object p1

    .line 203
    :pswitch_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ܳ᩶ᩴ;

    if-eqz p1, :cond_1a

    .line 203
    invoke-static {}, Ll/۫᩻۫;->᩷()Z

    move-result p1

    if-nez p1, :cond_1a

    .line 204
    invoke-virtual {p0, p2}, Ll/۫᩻۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 207
    :cond_1a
    invoke-interface {p2}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v2

    const-wide/32 v6, 0x10000000

    cmp-long p1, v2, v6

    if-lez p1, :cond_1b

    .line 208
    invoke-virtual {p0, p2}, Ll/۫᩻۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object p1

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    return-object p1

    .line 210
    :cond_1b
    sget-object p1, Ll/᩵ܰܳ;->ۢ:Ll/᩵ܰܳ;

    new-instance p2, Ll/᩶ۗۧ;

    invoke-direct {p2, v1}, Ll/᩶ۗۧ;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1, v5, p2}, Ll/֫᩶ܳ;->ۙ(Ljava/lang/String;Ll/᩵ܰܳ;ZLl/᩶ۚܺ;)Ll/ۨ֡֫;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;
    .locals 3

    .line 55
    invoke-interface {p1}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 56
    invoke-interface {p1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v1

    .line 55
    invoke-static {v1, v2, v0}, Ll/ۘ۬ۚ;->ۙ(JLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 386
    invoke-static {p1}, Ll/۫᩻۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object v0

    .line 385
    invoke-static {v0}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;)Ll/᩹۬ۚ;

    move-result-object v0

    .line 59
    sget-object v1, Ll/᩹۬ۚ;->֡:Ll/᩹۬ۚ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 60
    invoke-interface {p1, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    goto :goto_0

    .line 62
    :cond_0
    sget-object v1, Ll/᩹۬ۚ;->ܿ:Ll/᩹۬ۚ;

    if-ne v0, v1, :cond_1

    .line 403
    new-instance v0, Ll/ܳ᩻۫;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 65
    sget-object p1, Ll/᩵ܰܳ;->ᩳۙ:Ll/᩵ܰܳ;

    return-object p1

    .line 67
    :cond_1
    sget-object v1, Ll/᩹۬ۚ;->᩶:Ll/᩹۬ۚ;

    if-ne v0, v1, :cond_2

    .line 403
    new-instance v0, Ll/ܳ᩻۫;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 70
    :cond_2
    sget-object p1, Ll/᩵ܰܳ;->۟ۙ:Ll/᩵ܰܳ;

    return-object p1

    .line 34
    :cond_3
    :goto_0
    invoke-static {p1}, Ll/۟᩷۫;->ۙ(Ll/ۖۗܳ;)Ll/᩵ܰܳ;

    move-result-object v0

    .line 74
    sget-object v1, Ll/᩵ܰܳ;->ۛ:Ll/᩵ܰܳ;

    if-ne v0, v1, :cond_6

    .line 75
    invoke-interface {p1}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mapping"

    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, ".bin"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 77
    sget-object p1, Ll/᩵ܰܳ;->᩶ۙ:Ll/᩵ܰܳ;

    return-object p1

    .line 78
    :cond_4
    instance-of v2, p1, Ll/ۚ᩻۫;

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ll/ۖۗܳ;->getParent()Ljava/lang/String;

    move-result-object p1

    const-string v2, "/keys/"

    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    const-string p1, ".aes"

    .line 79
    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, ".key"

    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, ".enc"

    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, ".pk8"

    .line 80
    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, ".x509.pem"

    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 81
    :cond_5
    sget-object p1, Ll/᩵ܰܳ;->۠:Ll/᩵ܰܳ;

    return-object p1

    :cond_6
    return-object v0
.end method

.method public ۤ(Ll/ۖۗܳ;)Ll/᩷ۨᩴ;
    .locals 0

    .line 334
    invoke-interface {p1}, Ll/ۖۗܳ;->ۘ᩷()Ll/᩷ۨᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(Ll/ۖۗܳ;)I
    .locals 12

    .line 91
    invoke-interface {p1}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v0

    const/16 v1, 0x9

    const/4 v2, 0x6

    const/16 v3, 0xb

    const/4 v4, 0x5

    const/16 v5, 0xd

    const/4 v6, 0x1

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/16 v9, 0xc

    const/4 v10, 0x4

    const/4 v11, 0x0

    if-eqz v0, :cond_d

    .line 92
    invoke-interface {p1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۘ۬ۚ;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 94
    invoke-interface {p1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v1

    .line 93
    invoke-static {v1, v2, v0}, Ll/ۘ۬ۚ;->ۙ(JLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 95
    invoke-interface {p1, v11}, Ll/ۖۗܳ;->᩷(I)V

    return v11

    .line 386
    :cond_0
    invoke-static {p1}, Ll/۫᩻۫;->᩸(Ll/ۖۗܳ;)Ljava/lang/String;

    move-result-object v0

    .line 385
    invoke-static {v0}, Ll/ۘ۬ۚ;->ۙ(Ljava/lang/String;)Ll/᩹۬ۚ;

    move-result-object v0

    .line 100
    sget-object v1, Ll/᩹۬ۚ;->֡:Ll/᩹۬ۚ;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 101
    invoke-interface {p1, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 102
    invoke-interface {p1, v11}, Ll/ۖۗܳ;->᩷(I)V

    return v11

    .line 105
    :cond_1
    sget-object v1, Ll/᩹۬ۚ;->ܿ:Ll/᩹۬ۚ;

    if-ne v0, v1, :cond_2

    .line 403
    new-instance v0, Ll/ܳ᩻۫;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    .line 108
    invoke-interface {p1, v11}, Ll/ۖۗܳ;->᩷(I)V

    return v11

    .line 111
    :cond_2
    sget-object v1, Ll/᩹۬ۚ;->᩶:Ll/᩹۬ۚ;

    if-ne v0, v1, :cond_3

    .line 403
    new-instance v0, Ll/ܳ᩻۫;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Ll/ۖۗܳ;->ۙ(Ll/᩷ۡ;)V

    :cond_3
    return v9

    .line 116
    :cond_4
    invoke-interface {p1}, Ll/ۖۗܳ;->᩺ۙ()Ljava/lang/String;

    move-result-object v0

    const-string v9, "image/svg+xml"

    .line 117
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    return v8

    :cond_5
    const-string v8, "text/xml"

    .line 119
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    return v7

    :cond_6
    const-string v7, "image/"

    .line 121
    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    return v6

    :cond_7
    const-string v6, "video/"

    .line 123
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    return v10

    :cond_8
    const-string v6, "audio/"

    .line 125
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_9

    return v5

    :cond_9
    const-string v5, "application/vnd.android.package-archive"

    .line 127
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    return v4

    :cond_a
    const-string v4, "application/vnd.android.package-archives"

    .line 129
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    return v3

    :cond_b
    const-string v3, "application/mt-plugin"

    .line 131
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    return v2

    .line 133
    :cond_c
    invoke-interface {p1}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, ".bak"

    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    const-string v2, ".bak.bak"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    return v1

    .line 138
    :cond_d
    invoke-interface {p1}, Ll/ۖۗܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_28

    instance-of v0, p1, Ll/ۚ᩻۫;

    if-eqz v0, :cond_28

    move-object v0, p1

    check-cast v0, Ll/ۚ᩻۫;

    .line 139
    invoke-virtual {v0}, Ll/ۚ᩻۫;->ᩴ()Z

    move-result v0

    const/16 v2, 0xa

    if-eqz v0, :cond_e

    return v2

    .line 142
    :cond_e
    invoke-interface {p1}, Ll/ۖۗܳ;->getParent()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v2, 0x8

    const-string v3, "/data/app/"

    const/4 v4, 0x7

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "/data/data/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v1, 0x15

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "/system/product/overlay/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v1, 0x14

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "/cust/app/customized/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v1, 0x13

    goto/16 :goto_1

    :sswitch_3
    const-string v0, "/system/data-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v1, 0x12

    goto/16 :goto_1

    :sswitch_4
    const-string v0, "/product/data-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v1, 0x11

    goto/16 :goto_1

    :sswitch_5
    const-string v0, "/system_ext/priv-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v1, 0x10

    goto/16 :goto_1

    :sswitch_6
    const-string v0, "/data/user/0/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v1, 0xf

    goto/16 :goto_1

    :sswitch_7
    const-string v0, "/system/priv-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v1, 0xe

    goto/16 :goto_1

    :sswitch_8
    const-string v0, "/system/app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v1, 0xd

    goto/16 :goto_1

    :sswitch_9
    const-string v0, "/product/app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v1, 0xc

    goto/16 :goto_1

    :sswitch_a
    const-string v0, "/product/priv-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v1, 0xb

    goto/16 :goto_1

    :sswitch_b
    const-string v0, "/data/user/999/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v1, 0xa

    goto/16 :goto_1

    :sswitch_c
    const-string v0, "/system/product/app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "/data/user_de/0/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v1, 0x8

    goto/16 :goto_1

    :sswitch_e
    const-string v0, "/system/product/data-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_0

    :cond_1c
    const/4 v1, 0x7

    goto :goto_1

    :sswitch_f
    const-string v0, "/data/user_de/999/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_0

    :cond_1d
    const/4 v1, 0x6

    goto :goto_1

    :sswitch_10
    const-string v0, "/odm/priv-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_0

    :cond_1e
    const/4 v1, 0x5

    goto :goto_1

    :sswitch_11
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_0

    :cond_1f
    const/4 v1, 0x4

    goto :goto_1

    :sswitch_12
    const-string v0, "/product/overlay/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_0

    :cond_20
    const/4 v1, 0x3

    goto :goto_1

    :sswitch_13
    const-string v0, "/system/product/priv-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_0

    :cond_21
    const/4 v1, 0x2

    goto :goto_1

    :sswitch_14
    const-string v0, "/cust/data-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto :goto_0

    :cond_22
    const/4 v1, 0x1

    goto :goto_1

    :sswitch_15
    const-string v0, "/system_ext/app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto :goto_0

    :cond_23
    const/4 v1, 0x0

    goto :goto_1

    :goto_0
    const/4 v1, -0x1

    :cond_24
    :goto_1
    packed-switch v1, :pswitch_data_0

    const-string v0, "/data/user"

    .line 175
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_25

    const/16 v0, 0x2f

    invoke-static {p1, v0}, Ll/᩺ۨۨ;->ۙ(Ljava/lang/String;C)I

    move-result v0

    if-ne v0, v10, :cond_25

    .line 176
    sget-object v0, Ll/۫᩻۫;->᩸:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_25

    goto :goto_2

    :cond_25
    const-string v0, "/android/data/"

    .line 180
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_27

    const-string v0, "/android/obb/"

    .line 181
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_27

    const-string v0, "/android/media/"

    .line 182
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_26

    goto :goto_2

    .line 185
    :cond_26
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-static {p1}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_28

    :pswitch_0
    return v2

    :cond_27
    :goto_2
    :pswitch_1
    return v4

    :cond_28
    return v11

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e1ac2a3 -> :sswitch_15
        -0x7898485c -> :sswitch_14
        -0x6d076345 -> :sswitch_13
        -0x40e346d2 -> :sswitch_12
        -0x3ed9d5dc -> :sswitch_11
        -0x3e8f115a -> :sswitch_10
        -0x242aab7a -> :sswitch_f
        -0x2421cb60 -> :sswitch_e
        -0x215617b1 -> :sswitch_d
        -0x178a9561 -> :sswitch_c
        -0x1450043c -> :sswitch_b
        -0xfd16ae3 -> :sswitch_a
        0x3da3cfd -> :sswitch_9
        0xb700a7f -> :sswitch_8
        0xd06e8db -> :sswitch_7
        0x1ee1470d -> :sswitch_6
        0x24d4d0bd -> :sswitch_5
        0x39142d02 -> :sswitch_4
        0x55ec80c0 -> :sswitch_3
        0x5d8acfd3 -> :sswitch_2
        0x614445d0 -> :sswitch_1
        0x63c2a48f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

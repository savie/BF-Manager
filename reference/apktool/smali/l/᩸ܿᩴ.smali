.class public Ll/᩸ܿᩴ;
.super Ll/᩷ۨᩴ;
.source "715Z"


# instance fields
.field public ۟:Ljava/lang/String;

.field public ᩳ:Ll/۟᩶ᩴ;


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ll/᩷ۨᩴ;-><init>()V

    .line 38
    new-instance v0, Ll/۟᩶ᩴ;

    invoke-direct {v0, p1}, Ll/۟᩶ᩴ;-><init>(Landroid/net/Uri;)V

    iput-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    return-void
.end method

.method public static synthetic ۙ(Ll/᩸ܿᩴ;Z)Ljava/io/OutputStream;
    .locals 2

    .line 224
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v1}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v1

    if-eqz p1, :cond_0

    const-string p1, "wa"

    goto :goto_0

    :cond_0
    const-string p1, "wt"

    :goto_0
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 226
    :goto_1
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/᩸ܿᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static synthetic ۙ(Ll/᩸ܿᩴ;)Ljava/lang/Boolean;
    .locals 0

    .line 189
    iget-object p0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {p0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴ᩶ᩴ;->᩷(Landroid/net/Uri;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 3

    .line 294
    sget-object v0, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    .line 296
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x7d0

    invoke-interface {p0, v1, v2, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    .line 312
    invoke-interface {p0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 313
    new-instance p0, Ljava/io/IOException;

    const-string v1, "Timeout"

    invoke-direct {p0, v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0

    :catch_1
    move-exception p0

    .line 310
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p0

    .line 298
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 299
    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_2

    .line 302
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-nez v1, :cond_1

    .line 305
    instance-of v1, v0, Ljava/lang/Error;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Error;

    .line 306
    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0

    .line 308
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 302
    :cond_1
    check-cast v0, Ljava/lang/RuntimeException;

    .line 303
    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0

    .line 299
    :cond_2
    check-cast v0, Ljava/io/IOException;

    .line 300
    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ۙ(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 2

    .line 322
    sget-object v0, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    int-to-long v0, p2

    .line 324
    :try_start_0
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v0, v1, p2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p2, 0x1

    .line 337
    invoke-interface {p0, p2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-object p1

    :catch_1
    move-exception p0

    .line 328
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    .line 329
    instance-of p2, p0, Ljava/lang/RuntimeException;

    if-nez p2, :cond_1

    .line 332
    instance-of p2, p0, Ljava/lang/Error;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    check-cast p0, Ljava/lang/Error;

    .line 333
    invoke-static {p0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw p0

    .line 329
    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    .line 330
    invoke-static {p0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw p0

    :catch_2
    :goto_0
    return-object p1
.end method

.method public static synthetic ۙ(Ll/᩸ܿᩴ;Ljava/lang/String;)Ll/ܳܽۤ;
    .locals 0

    .line 238
    iget-object p0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {p0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0, p1}, Ll/ۧܽۤ;->ۙ(Landroid/net/Uri;Ljava/lang/String;)Ll/ܳܽۤ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۚ(Ll/᩸ܿᩴ;)Ljava/lang/Boolean;
    .locals 0

    .line 144
    iget-object p0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {p0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴ᩶ᩴ;->۫(Landroid/net/Uri;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۤ(Ll/᩸ܿᩴ;)Ljava/io/InputStream;
    .locals 2

    .line 213
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v1}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 215
    :goto_0
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/᩸ܿᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static synthetic ۫(Ll/᩸ܿᩴ;)Ljava/lang/Boolean;
    .locals 0

    .line 181
    iget-object p0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {p0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴ᩶ᩴ;->ۙ(Landroid/net/Uri;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ܳ(Ll/᩸ܿᩴ;)Ljava/lang/Boolean;
    .locals 0

    .line 152
    iget-object p0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {p0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴ᩶ᩴ;->ܳ(Landroid/net/Uri;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)I
    .locals 2

    const-string v0, "r"

    .line 265
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 p0, 0x10000000

    return p0

    :cond_0
    const-string v0, "w"

    .line 267
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "wt"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "wa"

    .line 271
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 p0, 0x2a000000

    return p0

    :cond_2
    const-string v0, "rw"

    .line 275
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/high16 p0, 0x38000000

    return p0

    :cond_3
    const-string v0, "rwt"

    .line 278
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/high16 p0, 0x3c000000    # 0.0078125f

    return p0

    .line 283
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid mode: "

    .line 0
    invoke-static {v1, p0}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 283
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_0
    const/high16 p0, 0x2c000000

    return p0
.end method

.method public static synthetic ᩴ(Ll/᩸ܿᩴ;)Ljava/lang/Long;
    .locals 2

    .line 165
    iget-object p0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {p0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴ᩶ᩴ;->֫(Landroid/net/Uri;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩷(Ll/᩸ܿᩴ;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 2

    .line 246
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v1}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 248
    :goto_0
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/᩸ܿᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static synthetic ᩷(Ll/᩸ܿᩴ;)Ljava/lang/Boolean;
    .locals 0

    .line 136
    iget-object p0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {p0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴ᩶ᩴ;->᩸(Landroid/net/Uri;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩸(Ll/᩸ܿᩴ;)Ljava/lang/Long;
    .locals 2

    .line 173
    iget-object p0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {p0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴ᩶ᩴ;->ۚ(Landroid/net/Uri;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 3

    .line 84
    iget-object v0, p0, Ll/᩸ܿᩴ;->۟:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 85
    iget-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩶ᩴ;->ᩴ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ܿᩴ;->۟:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 87
    iget-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 91
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ܿᩴ;->۟:Ljava/lang/String;

    goto :goto_0

    .line 89
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t get name from uri: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v2}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩸ܿᩴ;->۟:Ljava/lang/String;

    return-object v0
.end method

.method public getParent()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ֡()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ֨()Z
    .locals 3

    .line 135
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    new-instance v0, Ll/ۡ᩶ᩴ;

    invoke-direct {v0, p0}, Ll/ۡ᩶ᩴ;-><init>(Ll/᩸ܿᩴ;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 318
    invoke-static {v0, v1, v2}, Ll/᩸ܿᩴ;->ۙ(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 136
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 138
    :cond_0
    iget-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩶ᩴ;->᩸(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ֫(Ljava/lang/String;)Ll/ܳܽۤ;
    .locals 1

    .line 238
    new-instance v0, Ll/ۜ᩶ᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۜ᩶ᩴ;-><init>(Ll/᩸ܿᩴ;Ljava/lang/String;)V

    invoke-static {v0}, Ll/᩸ܿᩴ;->ۙ(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳܽۤ;

    return-object p1
.end method

.method public final ۖ()V
    .locals 0

    return-void
.end method

.method public final ۗۙ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۘ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۙ(Landroid/net/Uri;Z)V
    .locals 0

    .line 42
    new-instance p2, Ll/۟᩶ᩴ;

    invoke-direct {p2, p1}, Ll/۟᩶ᩴ;-><init>(Landroid/net/Uri;)V

    iput-object p2, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    .line 43
    invoke-virtual {p0}, Ll/᩸ܿᩴ;->ܿ᩷()V

    return-void
.end method

.method public final ۚ(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 1

    .line 244
    new-instance v0, Ll/᩷ܿᩴ;

    invoke-direct {v0, p0, p1}, Ll/᩷ܿᩴ;-><init>(Ll/᩸ܿᩴ;Ljava/lang/String;)V

    invoke-static {v0}, Ll/᩸ܿᩴ;->ۙ(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    return-object p1
.end method

.method public final ۚ᩷()Ljava/nio/channels/FileChannel;
    .locals 2

    .line 233
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۛ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۛۙ()Z
    .locals 3

    .line 151
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    new-instance v0, Ll/ۙܿᩴ;

    invoke-direct {v0, p0}, Ll/ۙܿᩴ;-><init>(Ll/᩸ܿᩴ;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 318
    invoke-static {v0, v1, v2}, Ll/᩸ܿᩴ;->ۙ(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 152
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 154
    :cond_0
    iget-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩶ᩴ;->ܳ(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public final ۜۙ()Ljava/util/List;
    .locals 3

    const/4 v0, 0x1

    .line 206
    invoke-virtual {p0, v0}, Ll/᩸ܿᩴ;->᩷(Z)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ۗۨᩴ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۗۨᩴ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v0

    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public ۟()Z
    .locals 2

    const/4 v0, 0x0

    .line 54
    :try_start_0
    invoke-virtual {p0, v0}, Ll/᩸ܿᩴ;->ۤ(Z)Ljava/io/OutputStream;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :catch_0
    return v0
.end method

.method public ۠ۙ()J
    .locals 3

    .line 164
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    new-instance v0, Ll/ۖ᩶ᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۖ᩶ᩴ;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, -0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/16 v2, 0x1f4

    .line 318
    invoke-static {v0, v1, v2}, Ll/᩸ܿᩴ;->ۙ(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 165
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 167
    :cond_0
    iget-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩶ᩴ;->֫(Landroid/net/Uri;)J

    move-result-wide v0

    return-wide v0
.end method

.method public ۡۙ()J
    .locals 3

    .line 172
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    new-instance v0, Ll/۬᩶ᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/۬᩶ᩴ;-><init>(ILjava/io/Serializable;)V

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/16 v2, 0x1f4

    .line 318
    invoke-static {v0, v1, v2}, Ll/᩸ܿᩴ;->ۙ(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 173
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 175
    :cond_0
    iget-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩶ᩴ;->ۚ(Landroid/net/Uri;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۢۙ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۤ(Z)Ljava/io/OutputStream;
    .locals 1

    .line 222
    new-instance v0, Ll/֨᩶ᩴ;

    invoke-direct {v0, p0, p1}, Ll/֨᩶ᩴ;-><init>(Ll/᩸ܿᩴ;Z)V

    invoke-static {v0}, Ll/᩸ܿᩴ;->ۙ(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/OutputStream;

    return-object p1
.end method

.method public final ۤۙ()Landroid/net/Uri;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ᩷()Ljava/io/InputStream;
    .locals 1

    .line 211
    new-instance v0, Ll/۠᩶ᩴ;

    invoke-direct {v0, p0}, Ll/۠᩶ᩴ;-><init>(Ll/᩸ܿᩴ;)V

    invoke-static {v0}, Ll/᩸ܿᩴ;->ۙ(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    return-object v0
.end method

.method public final ܺ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ܺۙ()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v0}, Ll/۟᩶ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ܿ᩷()V
    .locals 1

    const/4 v0, 0x0

    .line 48
    iput-object v0, p0, Ll/᩸ܿᩴ;->۟:Ljava/lang/String;

    return-void
.end method

.method public ᩳ()Z
    .locals 1

    .line 125
    iget-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩶ᩴ;->ۤ(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public final ᩵ۙ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ᩷(Z)Ljava/util/List;
    .locals 0

    .line 201
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public ᩷(Ll/᩷ۨᩴ;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩹()Z
    .locals 3

    .line 180
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    new-instance v0, Ll/ۢ᩶ᩴ;

    invoke-direct {v0, p0}, Ll/ۢ᩶ᩴ;-><init>(Ll/᩸ܿᩴ;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 318
    invoke-static {v0, v1, v2}, Ll/᩸ܿᩴ;->ۙ(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 181
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 183
    :cond_0
    iget-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩶ᩴ;->ۙ(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public final ᩺()Z
    .locals 3

    .line 188
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 189
    new-instance v0, Ll/ۤܿᩴ;

    invoke-direct {v0, p0}, Ll/ۤܿᩴ;-><init>(Ll/᩸ܿᩴ;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 318
    invoke-static {v0, v1, v2}, Ll/᩸ܿᩴ;->ۙ(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 189
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 191
    :cond_0
    iget-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩶ᩴ;->᩷(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ᩺ۙ()Z
    .locals 3

    .line 143
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    new-instance v0, Ll/ᩳ᩶ᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ᩳ᩶ᩴ;-><init>(ILjava/lang/Object;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 318
    invoke-static {v0, v1, v2}, Ll/᩸ܿᩴ;->ۙ(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 144
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 146
    :cond_0
    iget-object v0, p0, Ll/᩸ܿᩴ;->ᩳ:Ll/۟᩶ᩴ;

    invoke-virtual {v0}, Ll/۟᩶ᩴ;->ۙ()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩶ᩴ;->۫(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ᩻()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ܳ᩶ᩴ;

    return v0
.end method

.class public final synthetic Ll/᩺᩹᩸;
.super Ljava/lang/Object;
.source "76RQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩺᩹᩸;->ܰ:I

    iput-object p2, p0, Ll/᩺᩹᩸;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget v0, p0, Ll/᩺᩹᩸;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/᩺᩹᩸;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ljava/lang/String;

    .line 1174
    invoke-static {v1}, Ll/ۛۤۧ;->ۙ(Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_0
    check-cast v1, Ll/۟ܰ᩸;

    invoke-static {v1}, Ll/۟ܰ᩸;->ۙ(Ll/۟ܰ᩸;)V

    return-void

    :pswitch_1
    check-cast v1, Ll/᩺۬᩹;

    .line 55
    :try_start_0
    sget-object v0, Ll/᩵۬᩹;->NOFOLLOW_LINKS:Ll/᩵۬᩹;

    const/4 v2, 0x1

    new-array v3, v2, [Ll/᩵۬᩹;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v3}, Ll/ۗ۬᩹;->isDirectory(Ll/᩺۬᩹;[Ll/᩵۬᩹;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "session.lock"

    .line 56
    invoke-interface {v1, v3}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v3

    new-array v2, v2, [Ll/᩵۬᩹;

    aput-object v0, v2, v4

    invoke-static {v3, v2}, Ll/ۗ۬᩹;->exists(Ll/᩺۬᩹;[Ll/᩵۬᩹;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v1}, Ll/ܽۢ᩸;->ۙ(Ll/᩺۬᩹;)V

    goto :goto_0

    .line 59
    :cond_1
    invoke-static {v1}, Ll/ۗ۬᩹;->list(Ll/᩺۬᩹;)Ll/᩵ܺۗ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-interface {v0}, Ll/᩵ܺۗ;->findAny()Ll/ܶۚۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶۚۗ;->isPresent()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    :try_start_2
    invoke-interface {v0}, Ll/ᩴܺۗ;->close()V

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ll/ᩴܺۗ;->close()V

    .line 60
    invoke-static {v1}, Ll/ۗ۬᩹;->deleteIfExists(Ll/᩺۬᩹;)Z

    .line 61
    invoke-interface {v1}, Ll/᩺۬᩹;->getParent()Ll/᩺۬᩹;

    move-result-object v0

    .line 212
    sget-object v1, Ll/᩸֨᩸;->ۙ:Ll/᩸֨᩸;

    invoke-interface {v1, v0}, Ll/᩸֨᩸;->ۙ(Ll/᩺۬᩹;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_0
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_3

    .line 59
    :try_start_3
    invoke-interface {v0}, Ll/ᩴܺۗ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    .line 63
    new-instance v1, Ll/ۗܽ᩵;

    .line 66
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 63
    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

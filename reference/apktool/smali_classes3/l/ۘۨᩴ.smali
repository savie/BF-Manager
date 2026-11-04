.class public final Ll/ۘۨᩴ;
.super Ll/ۖ֨ܺ;
.source "D18B"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩷:Ll/᩷ۨᩴ;


# direct methods
.method public constructor <init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V
    .locals 0

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۨᩴ;->᩷:Ll/᩷ۨᩴ;

    iput-object p2, p0, Ll/ۘۨᩴ;->ۙ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 190
    instance-of v0, p1, Ll/ۘۨᩴ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۘۨᩴ;

    iget-object v0, p0, Ll/ۘۨᩴ;->᩷:Ll/᩷ۨᩴ;

    iget-object v1, p1, Ll/ۘۨᩴ;->᩷:Ll/᩷ۨᩴ;

    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۘۨᩴ;->ۙ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۘۨᩴ;->ۙ:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 190
    iget-object v0, p0, Ll/ۘۨᩴ;->᩷:Ll/᩷ۨᩴ;

    invoke-static {v0}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ۘۨᩴ;->ۙ:Ljava/lang/String;

    invoke-static {v1}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 190
    iget-object v2, p0, Ll/ۘۨᩴ;->᩷:Ll/᩷ۨᩴ;

    aput-object v2, v0, v1

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ۘۨᩴ;->ۙ:Ljava/lang/String;

    aput-object v3, v0, v2

    const-string v3, "file;candidatePath"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v3, v1, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "["

    .line 0
    const-class v6, Ll/ۘۨᩴ;

    invoke-static {v6, v4, v5}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 190
    :goto_1
    array-length v5, v3

    if-ge v1, v5, :cond_2

    aget-object v5, v3, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v0, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v3

    sub-int/2addr v5, v2

    if-eq v1, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 1

    .line 190
    iget-object v0, p0, Ll/ۘۨᩴ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ll/᩷ۨᩴ;
    .locals 6

    .line 193
    iget-object v0, p0, Ll/ۘۨᩴ;->ۙ:Ljava/lang/String;

    if-eqz v0, :cond_7

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    .line 194
    invoke-static {v0, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->᩹()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 248
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_0

    goto/16 :goto_1

    .line 255
    :cond_0
    invoke-static {}, Ll/ۘ۟ᩴ;->᩸()Ll/᩹۟ᩴ;

    move-result-object v1

    .line 256
    invoke-interface {v1}, Ll/᩹۟ᩴ;->᩷()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_1

    .line 259
    :cond_1
    instance-of v2, v0, Ll/ܿܰᩴ;

    if-eqz v2, :cond_5

    move-object v2, v0

    check-cast v2, Ll/ܿܰᩴ;

    .line 260
    invoke-interface {v1}, Ll/᩹۟ᩴ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 261
    sget-object v1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/᩹ۨᩴ;

    invoke-direct {v3, v2}, Ll/᩹ۨᩴ;-><init>(Ll/ܿܰᩴ;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v1

    const/4 v2, 0x1

    .line 269
    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x1

    invoke-interface {v1, v4, v5, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v3, v4, :cond_2

    .line 274
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v3

    if-nez v3, :cond_6

    .line 275
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-object v0

    .line 274
    :cond_2
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v3

    if-nez v3, :cond_3

    .line 275
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 277
    :cond_3
    throw v0

    .line 274
    :catch_0
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_7

    .line 275
    :goto_0
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_2

    .line 279
    :cond_4
    invoke-virtual {v2}, Ll/ܿܰᩴ;->ۗۙ()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 280
    :try_start_1
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v2}, Ll/ܿܰᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v2

    const-string v3, "r"

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 282
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 286
    :cond_5
    instance-of v1, v0, Ll/ܺ᩵ᩴ;

    if-eqz v1, :cond_6

    move-object v1, v0

    check-cast v1, Ll/ܺ᩵ᩴ;

    .line 287
    :try_start_2
    invoke-virtual {v1}, Ll/֨ۨᩴ;->ۧ᩷()Ljava/io/InputStream;

    move-result-object v1

    .line 289
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :cond_6
    :goto_1
    return-object v0

    .line 199
    :catch_1
    :cond_7
    :goto_2
    iget-object v0, p0, Ll/ۘۨᩴ;->᩷:Ll/᩷ۨᩴ;

    return-object v0
.end method

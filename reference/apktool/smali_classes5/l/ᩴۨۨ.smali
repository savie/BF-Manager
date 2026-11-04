.class public abstract Ll/ᩴۨۨ;
.super Ljava/io/FilterInputStream;
.source "P2G3"

# interfaces
.implements Ll/۠ۜ᩹;


# instance fields
.field public final ܰ:Ll/۫۫ۤ;

.field public volatile ᩶:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ll/ۙۨۨ;)V
    .locals 0

    .line 138
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 139
    sget-object p1, Ll/֨᩵ۨ;->᩺:Ll/۫۫ۤ;

    iput-object p1, p0, Ll/ᩴۨۨ;->ܰ:Ll/۫۫ۤ;

    return-void
.end method


# virtual methods
.method public available()I
    .locals 1

    .line 172
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 248
    iget-boolean v0, p0, Ll/ᩴۨۨ;->᩶:Z

    if-nez v0, :cond_0

    .line 174
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public close()V
    .locals 2

    .line 223
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 748
    :try_start_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 755
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 239
    throw v1

    :catch_1
    move-exception v0

    throw v0

    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 224
    iput-boolean v0, p0, Ll/ᩴۨۨ;->᩶:Z

    return-void
.end method

.method public read()I
    .locals 2

    .line 285
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    .line 286
    :cond_0
    invoke-virtual {p0, v1}, Ll/ᩴۨۨ;->ۙ(I)V

    return v0
.end method

.method public read([BII)I
    .locals 1

    .line 337
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    .line 338
    invoke-virtual {p0, p1}, Ll/ᩴۨۨ;->ۙ(I)V

    return p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/ۡۜ᩹;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public ۙ(I)V
    .locals 0

    .line 161
    iget-object p1, p0, Ll/ᩴۨۨ;->ܰ:Ll/۫۫ۤ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

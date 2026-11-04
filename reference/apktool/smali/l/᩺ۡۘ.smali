.class public final Ll/᩺ۡۘ;
.super Ljava/lang/Object;
.source "17L3"


# static fields
.field public static final ۙ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 42
    fill-array-data v0, :array_0

    sput-object v0, Ll/᩺ۡۘ;->ۙ:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x4at
        0x4dt
        0x1t
        0x0t
    .end array-data
.end method

.method public static ۙ(Ll/᩺۬᩹;)V
    .locals 7

    const-string v0, "Unsupported jmod version: "

    const/4 v1, 0x0

    new-array v2, v1, [Ll/ۨ۬᩹;

    .line 48
    invoke-static {p0, v2}, Ll/ۗ۬᩹;->newInputStream(Ll/᩺۬᩹;[Ll/ۨ۬᩹;)Ljava/io/InputStream;

    move-result-object v2

    const/4 v3, 0x4

    .line 50
    :try_start_0
    invoke-static {v2, v3}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object v4

    .line 51
    array-length v5, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "Invalid JMOD file: "

    if-ne v5, v3, :cond_3

    .line 54
    :try_start_1
    aget-byte v3, v4, v1

    sget-object v5, Ll/᩺ۡۘ;->ۙ:[B

    aget-byte v1, v5, v1

    if-ne v3, v1, :cond_2

    const/4 v1, 0x1

    aget-byte v3, v4, v1

    aget-byte v5, v5, v1

    if-ne v3, v5, :cond_2

    const/4 v3, 0x2

    .line 58
    aget-byte v5, v4, v3

    const/4 v6, 0x3

    if-gt v5, v1, :cond_1

    if-ne v5, v1, :cond_0

    aget-byte v1, v4, v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gtz v1, :cond_1

    .line 63
    :cond_0
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return-void

    .line 60
    :cond_1
    :try_start_2
    new-instance v1, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-byte v0, v4, v3

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-byte v0, v4, v6

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " in "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    invoke-interface {p0}, Ll/᩺۬᩹;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 56
    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ll/᩺۬᩹;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p0

    if-eqz v2, :cond_4

    .line 48
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    throw p0
.end method

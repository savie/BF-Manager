.class public final Ll/֫ۨۨ;
.super Ljava/io/OutputStream;
.source "J2K4"


# static fields
.field public static final ܰ:Ll/֫ۨۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Ll/֫ۨۨ;

    .line 54
    invoke-direct {v0}, Ljava/io/OutputStream;-><init>()V

    .line 41
    sput-object v0, Ll/֫ۨۨ;->ܰ:Ll/֫ۨۨ;

    return-void
.end method


# virtual methods
.method public final flush()V
    .locals 2

    .line 65
    new-instance v0, Ljava/io/IOException;

    const-string v1, "flush() failed: stream is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final write(I)V
    .locals 1

    .line 92
    new-instance p1, Ljava/io/IOException;

    const-string v0, "write(int) failed: stream is closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([BII)V
    .locals 0

    .line 80
    invoke-static {p2, p3, p1}, Ll/ۙ᩵ۨ;->ۙ(II[B)V

    .line 81
    new-instance p1, Ljava/io/IOException;

    const-string p2, "write(byte[], int, int) failed: stream is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

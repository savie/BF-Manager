.class public final Ll/֫᩹ܳ;
.super Ljava/io/Writer;
.source "O6EN"


# instance fields
.field public final ܰ:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 199
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 200
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/֫᩹ܳ;->ܰ:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final flush()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/֫᩹ܳ;->ܰ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final write([CII)V
    .locals 3

    .line 204
    iget-object v0, p0, Ll/֫᩹ܳ;->ܰ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/high16 v2, 0x1000000

    sub-int/2addr v2, v1

    if-gt p3, v2, :cond_0

    .line 206
    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    return-void

    .line 205
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Snapshot exceeds XML size limit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

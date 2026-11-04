.class public final Ll/᩷᩹ܳ;
.super Ljava/lang/Object;
.source "Q6F5"


# instance fields
.field public final ۙ:Ljava/io/File;

.field public final ۤ:J

.field public final ᩷:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 219
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    .line 221
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/᩷᩹ܳ;->ۙ:Ljava/io/File;

    .line 222
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 223
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v1

    iput-wide v1, p0, Ll/᩷᩹ܳ;->᩷:J

    .line 224
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩷᩹ܳ;->ۤ:J

    return-void

    .line 222
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "APK is unavailable: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Missing APK path"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 227
    instance-of v0, p1, Ll/᩷᩹ܳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩷᩹ܳ;

    .line 228
    iget-object v0, p0, Ll/᩷᩹ܳ;->ۙ:Ljava/io/File;

    iget-object v2, p1, Ll/᩷᩹ܳ;->ۙ:Ljava/io/File;

    invoke-virtual {v0, v2}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v2, p0, Ll/᩷᩹ܳ;->᩷:J

    iget-wide v4, p1, Ll/᩷᩹ܳ;->᩷:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-wide v2, p0, Ll/᩷᩹ܳ;->ۤ:J

    iget-wide v4, p1, Ll/᩷᩹ܳ;->ۤ:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 5

    .line 230
    iget-wide v0, p0, Ll/᩷᩹ܳ;->᩷:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v1, p0, Ll/᩷᩹ܳ;->ۤ:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Ll/᩷᩹ܳ;->ۙ:Ljava/io/File;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    invoke-static {v2}, Ll/ܽۚۗ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

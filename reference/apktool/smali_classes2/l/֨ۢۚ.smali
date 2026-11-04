.class public final Ll/֨ۢۚ;
.super Landroid/media/MediaDataSource;
.source "26KB"


# instance fields
.field public volatile ܰ:Z

.field public final ᩶:Landroid/media/MediaDataSource;


# direct methods
.method public constructor <init>(Landroid/media/MediaDataSource;)V
    .locals 0

    .line 267
    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    .line 268
    iput-object p1, p0, Ll/֨ۢۚ;->᩶:Landroid/media/MediaDataSource;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/֨ۢۚ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֨ۢۚ;->ܰ:Z

    return p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 293
    iget-object v0, p0, Ll/֨ۢۚ;->᩶:Landroid/media/MediaDataSource;

    invoke-virtual {v0}, Landroid/media/MediaDataSource;->close()V

    return-void
.end method

.method public final getSize()J
    .locals 2

    .line 284
    :try_start_0
    iget-object v0, p0, Ll/֨ۢۚ;->᩶:Landroid/media/MediaDataSource;

    invoke-virtual {v0}, Landroid/media/MediaDataSource;->getSize()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    .line 286
    iput-boolean v1, p0, Ll/֨ۢۚ;->ܰ:Z

    .line 287
    throw v0
.end method

.method public final readAt(J[BII)I
    .locals 6

    .line 274
    :try_start_0
    iget-object v0, p0, Ll/֨ۢۚ;->᩶:Landroid/media/MediaDataSource;

    move-wide v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaDataSource;->readAt(J[BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    .line 276
    iput-boolean p2, p0, Ll/֨ۢۚ;->ܰ:Z

    .line 277
    throw p1
.end method

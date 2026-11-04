.class public final Ll/ۙ᩷;
.super Ljava/lang/Object;
.source "U6BF"


# direct methods
.method public static ۙ(Landroid/media/session/MediaSession$QueueItem;)Landroid/media/MediaDescription;
    .locals 0

    .line 2298
    invoke-virtual {p0}, Landroid/media/session/MediaSession$QueueItem;->getDescription()Landroid/media/MediaDescription;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Landroid/media/session/MediaSession$QueueItem;)J
    .locals 2

    .line 2303
    invoke-virtual {p0}, Landroid/media/session/MediaSession$QueueItem;->getQueueId()J

    move-result-wide v0

    return-wide v0
.end method

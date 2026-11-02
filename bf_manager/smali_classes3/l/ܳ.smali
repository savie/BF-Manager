.class public final Ll/ܳ;
.super Ljava/lang/Object;
.source "J622"


# direct methods
.method public static ۙ(Landroid/media/MediaDescription;)Landroid/net/Uri;
    .locals 0

    .line 683
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getMediaUri()Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Landroid/media/MediaDescription$Builder;Landroid/net/Uri;)V
    .locals 0

    .line 677
    invoke-virtual {p0, p1}, Landroid/media/MediaDescription$Builder;->setMediaUri(Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;

    return-void
.end method

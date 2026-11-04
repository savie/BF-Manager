.class public final synthetic Ll/۟ۢۚ;
.super Ljava/lang/Object;
.source "26KB"

# interfaces
.implements Ll/ۨ۠ۚ;


# instance fields
.field public final synthetic ۙ:Landroid/media/MediaDataSource;


# direct methods
.method public synthetic constructor <init>(Landroid/media/MediaDataSource;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۢۚ;->ۙ:Landroid/media/MediaDataSource;

    return-void
.end method


# virtual methods
.method public final ۙ(J[BII)I
    .locals 6

    .line 0
    iget-object v0, p0, Ll/۟ۢۚ;->ۙ:Landroid/media/MediaDataSource;

    move-wide v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaDataSource;->readAt(J[BII)I

    move-result p1

    return p1
.end method

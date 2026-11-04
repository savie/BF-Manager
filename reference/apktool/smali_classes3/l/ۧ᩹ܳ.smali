.class public final Ll/ۧ᩹ܳ;
.super Ljava/lang/Object;
.source "O6EN"


# instance fields
.field public ۙ:I

.field public final ᩷:J


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3a98

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۧ᩹ܳ;->᩷:J

    return-void
.end method

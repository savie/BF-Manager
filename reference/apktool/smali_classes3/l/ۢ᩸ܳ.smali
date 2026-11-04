.class public final Ll/ۢ᩸ܳ;
.super Ljava/lang/Object;
.source "J57U"


# instance fields
.field public final ۙ:Z

.field public final ۤ:I

.field public final ᩷:J


# direct methods
.method public constructor <init>(JIZ)V
    .locals 0

    .line 836
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 837
    iput-wide p1, p0, Ll/ۢ᩸ܳ;->᩷:J

    .line 838
    iput p3, p0, Ll/ۢ᩸ܳ;->ۤ:I

    .line 839
    iput-boolean p4, p0, Ll/ۢ᩸ܳ;->ۙ:Z

    return-void
.end method

.method public static ۙ()Ll/ۢ᩸ܳ;
    .locals 5

    .line 849
    new-instance v0, Ll/ۢ᩸ܳ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ۢ᩸ܳ;-><init>(JIZ)V

    return-object v0
.end method

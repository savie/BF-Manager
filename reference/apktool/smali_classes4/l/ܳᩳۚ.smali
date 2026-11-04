.class public final Ll/ܳᩳۚ;
.super Ljava/lang/Object;
.source "Y6IM"


# instance fields
.field public ۙ:Ljava/lang/String;

.field public final ۤ:Ll/ۗ᩻ܳ;

.field public final ᩴ:Ll/۫ᩳۚ;

.field public ᩷:J

.field public final ᩸:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ll/۫ᩳۚ;Ll/ۗ᩻ܳ;J)V
    .locals 1

    .line 453
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 449
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll/ܳᩳۚ;->᩸:Ljava/lang/Thread;

    .line 454
    iput-object p1, p0, Ll/ܳᩳۚ;->ᩴ:Ll/۫ᩳۚ;

    .line 455
    iput-object p2, p0, Ll/ܳᩳۚ;->ۤ:Ll/ۗ᩻ܳ;

    .line 456
    iput-wide p3, p0, Ll/ܳᩳۚ;->᩷:J

    return-void
.end method

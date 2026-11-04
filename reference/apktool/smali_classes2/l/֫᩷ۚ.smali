.class public final Ll/֫᩷ۚ;
.super Ljava/lang/Object;
.source "I6DO"


# instance fields
.field public ۙ:Z

.field public ۤ:Landroid/content/Intent;

.field public ܳ:Ll/᩸۫ۚ;

.field public final ᩴ:Ll/ᩴ۫ۚ;

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public constructor <init>(Ll/ᩴ۫ۚ;)V
    .locals 2

    .line 330
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 323
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫᩷ۚ;->᩷:Ljava/lang/String;

    .line 325
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Ll/֫᩷ۚ;->᩸:Ljava/util/concurrent/CountDownLatch;

    .line 330
    iput-object p1, p0, Ll/֫᩷ۚ;->ᩴ:Ll/ᩴ۫ۚ;

    return-void
.end method

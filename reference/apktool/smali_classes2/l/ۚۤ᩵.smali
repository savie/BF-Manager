.class public final Ll/ۚۤ᩵;
.super Ljava/lang/Object;
.source "I6FF"


# instance fields
.field public final ۙ:Ljava/util/HashSet;

.field public final ۤ:Ljava/util/HashSet;

.field public ᩴ:Z

.field public ᩷:Z

.field public ᩸:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۚۤ᩵;->ۤ:Ljava/util/HashSet;

    .line 106
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۚۤ᩵;->ۙ:Ljava/util/HashSet;

    const/4 v0, 0x1

    .line 109
    iput-boolean v0, p0, Ll/ۚۤ᩵;->ᩴ:Z

    return-void
.end method

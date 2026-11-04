.class public final Ll/֨۟᩷;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public ۙ:J

.field public ۤ:I

.field public ᩷:J

.field public final ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 6299
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6300
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֨۟᩷;->᩸:Ljava/util/ArrayList;

    const/4 v0, 0x5

    .line 6301
    iput v0, p0, Ll/֨۟᩷;->ۤ:I

    const-wide/16 v0, 0x0

    .line 6302
    iput-wide v0, p0, Ll/֨۟᩷;->᩷:J

    .line 6303
    iput-wide v0, p0, Ll/֨۟᩷;->ۙ:J

    return-void
.end method

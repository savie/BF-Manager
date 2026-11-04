.class public final Ll/᩺ᩳ᩷;
.super Ljava/lang/Object;
.source "8539"


# instance fields
.field public ۙ:Z

.field public ۤ:I

.field public final synthetic ۫:Ll/ۢᩳ᩷;

.field public ܳ:Z

.field public ᩴ:[I

.field public ᩷:Z

.field public ᩸:I


# direct methods
.method public constructor <init>(Ll/ۢᩳ᩷;)V
    .locals 0

    .line 3294
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ᩳ᩷;->۫:Ll/ۢᩳ᩷;

    .line 3295
    invoke-virtual {p0}, Ll/᩺ᩳ᩷;->ۙ()V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    const/4 v0, -0x1

    .line 3299
    iput v0, p0, Ll/᩺ᩳ᩷;->᩸:I

    const/high16 v1, -0x80000000

    .line 3300
    iput v1, p0, Ll/᩺ᩳ᩷;->ۤ:I

    const/4 v1, 0x0

    .line 3301
    iput-boolean v1, p0, Ll/᩺ᩳ᩷;->᩷:Z

    .line 3302
    iput-boolean v1, p0, Ll/᩺ᩳ᩷;->ۙ:Z

    .line 3303
    iput-boolean v1, p0, Ll/᩺ᩳ᩷;->ܳ:Z

    .line 3304
    iget-object v1, p0, Ll/᩺ᩳ᩷;->ᩴ:[I

    if-eqz v1, :cond_0

    .line 3305
    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([II)V

    :cond_0
    return-void
.end method

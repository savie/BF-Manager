.class public final Ll/ܽܽۚ;
.super Ljava/lang/Object;
.source "EIS7"


# instance fields
.field public ۙ:I

.field public ۤ:I

.field public final ᩴ:Ljava/util/HashSet;

.field public ᩷:I

.field public final ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 176
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܽܽۚ;->ᩴ:Ljava/util/HashSet;

    .line 177
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽܽۚ;->᩸:Ljava/util/ArrayList;

    return-void
.end method

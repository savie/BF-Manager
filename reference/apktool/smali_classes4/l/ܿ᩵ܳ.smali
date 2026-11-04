.class public abstract Ll/ܿ᩵ܳ;
.super Ljava/lang/Object;
.source "969A"


# instance fields
.field public final ۙ:I

.field public final ۤ:I

.field public ᩷:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 999
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1000
    iput p1, p0, Ll/ܿ᩵ܳ;->ۤ:I

    .line 1001
    iput p2, p0, Ll/ܿ᩵ܳ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final ۙ()I
    .locals 1

    .line 1009
    iget v0, p0, Ll/ܿ᩵ܳ;->ۙ:I

    return v0
.end method

.method public abstract ۙ(Ll/۠ۨܳ;)V
.end method

.method public final ۙ(Ll/ܿ᩵ܳ;)V
    .locals 1

    .line 1031
    iget-object v0, p0, Ll/ܿ᩵ܳ;->᩷:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 1032
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿ᩵ܳ;->᩷:Ljava/util/ArrayList;

    .line 1034
    :cond_0
    iget-object v0, p0, Ll/ܿ᩵ܳ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۤ()I
    .locals 1

    .line 1005
    iget v0, p0, Ll/ܿ᩵ܳ;->ۤ:I

    return v0
.end method

.method public ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ᩴ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩷()Ljava/util/List;
    .locals 1

    .line 1038
    iget-object v0, p0, Ll/ܿ᩵ܳ;->᩷:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :cond_0
    return-object v0
.end method

.method public ᩷(Ll/۠ۨܳ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public ᩸()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

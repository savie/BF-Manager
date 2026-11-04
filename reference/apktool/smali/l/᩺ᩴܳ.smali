.class public final Ll/᩺ᩴܳ;
.super Ljava/lang/Object;
.source "8IQX"


# instance fields
.field public ۙ:I

.field public ۤ:I

.field public ܳ:I

.field public ᩴ:Z

.field public final ᩷:Ljava/util/ArrayList;

.field public ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ᩴܳ;->᩷:Ljava/util/ArrayList;

    return-void
.end method

.method private ᩷()V
    .locals 6

    .line 89
    iget v0, p0, Ll/᩺ᩴܳ;->ۙ:I

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll/᩺ᩴܳ;->ᩴ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 90
    :cond_0
    iget-object v0, p0, Ll/᩺ᩴܳ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/high16 v2, 0x10000

    if-lt v1, v2, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll/᩺ᩴܳ;->ᩴ:Z

    goto :goto_0

    .line 91
    :cond_1
    new-instance v1, Ll/ۘᩴܳ;

    iget v2, p0, Ll/᩺ᩴܳ;->ܳ:I

    iget v3, p0, Ll/᩺ᩴܳ;->᩸:I

    iget v4, p0, Ll/᩺ᩴܳ;->ۤ:I

    iget v5, p0, Ll/᩺ᩴܳ;->ۙ:I

    invoke-direct {v1, v2, v3, v4, v5}, Ll/ۘᩴܳ;-><init>(IIII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    const/4 v0, 0x0

    .line 92
    iput v0, p0, Ll/᩺ᩴܳ;->ۙ:I

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final ۙ()Ll/ܰᩴܳ;
    .locals 11

    .line 95
    invoke-direct {p0}, Ll/᩺ᩴܳ;->᩷()V

    .line 96
    new-instance v10, Ll/ܰᩴܳ;

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩺ᩴܳ;->᩷:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 97
    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x0

    iget-boolean v9, p0, Ll/᩺ᩴܳ;->ᩴ:Z

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Ll/ܰᩴܳ;-><init>(JJIILjava/util/List;ZZ)V

    return-object v10
.end method

.method public final ۙ(IIII)V
    .locals 8

    .line 78
    iget-boolean v0, p0, Ll/᩺ᩴܳ;->ᩴ:Z

    if-nez v0, :cond_2

    if-eqz p4, :cond_2

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    goto :goto_0

    .line 79
    :cond_0
    iget v0, p0, Ll/᩺ᩴܳ;->ۙ:I

    if-eqz v0, :cond_1

    iget v1, p0, Ll/᩺ᩴܳ;->᩸:I

    if-ne v1, p2, :cond_1

    iget v1, p0, Ll/᩺ᩴܳ;->ۤ:I

    if-ne v1, p3, :cond_1

    iget v1, p0, Ll/᩺ᩴܳ;->ܳ:I

    int-to-long v1, v1

    int-to-long v3, v0

    int-to-long v5, p3

    mul-long v5, v5, v3

    add-long/2addr v5, v1

    int-to-long v1, p1

    cmp-long v7, v5, v1

    if-nez v7, :cond_1

    int-to-long v1, p4

    add-long/2addr v3, v1

    const-wide/32 v1, 0x7fffffff

    cmp-long v5, v3, v1

    if-gtz v5, :cond_1

    add-int/2addr v0, p4

    .line 82
    iput v0, p0, Ll/᩺ᩴܳ;->ۙ:I

    return-void

    .line 85
    :cond_1
    invoke-direct {p0}, Ll/᩺ᩴܳ;->᩷()V

    .line 86
    iput p1, p0, Ll/᩺ᩴܳ;->ܳ:I

    iput p2, p0, Ll/᩺ᩴܳ;->᩸:I

    iput p3, p0, Ll/᩺ᩴܳ;->ۤ:I

    iput p4, p0, Ll/᩺ᩴܳ;->ۙ:I

    :cond_2
    :goto_0
    return-void
.end method

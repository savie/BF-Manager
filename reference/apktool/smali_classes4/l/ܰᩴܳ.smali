.class public final Ll/ܰᩴܳ;
.super Ljava/lang/Object;
.source "8IQX"


# instance fields
.field public final ۙ:J

.field public final ۤ:J

.field public final ۫:Z

.field public final ܳ:Z

.field public final ᩴ:Ljava/util/List;

.field public final ᩷:I

.field public final ᩸:I


# direct methods
.method public constructor <init>(JJIILjava/util/List;ZZ)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-wide p1, p0, Ll/ܰᩴܳ;->ۤ:J

    iput-wide p3, p0, Ll/ܰᩴܳ;->ۙ:J

    .line 26
    iput p5, p0, Ll/ܰᩴܳ;->᩸:I

    iput p6, p0, Ll/ܰᩴܳ;->᩷:I

    .line 27
    iput-object p7, p0, Ll/ܰᩴܳ;->ᩴ:Ljava/util/List;

    iput-boolean p8, p0, Ll/ܰᩴܳ;->ܳ:Z

    iput-boolean p9, p0, Ll/ܰᩴܳ;->۫:Z

    return-void
.end method


# virtual methods
.method public final ۙ()Ll/ۘᩴܳ;
    .locals 16

    move-object/from16 v0, p0

    .line 46
    iget-boolean v1, v0, Ll/ܰᩴܳ;->۫:Z

    if-nez v1, :cond_5

    .line 47
    iget-object v1, v0, Ll/ܰᩴܳ;->ᩴ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    new-instance v1, Ll/ۘᩴܳ;

    invoke-direct {v1, v4, v4, v4, v3}, Ll/ۘᩴܳ;-><init>(IIII)V

    return-object v1

    .line 49
    :cond_0
    iget v2, v0, Ll/ܰᩴܳ;->᩸:I

    int-to-long v5, v2

    move v7, v2

    move v8, v7

    .line 50
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    if-ge v4, v9, :cond_4

    .line 51
    iget-boolean v9, v0, Ll/ܰᩴܳ;->ܳ:Z

    if-eqz v9, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v10

    sub-int/2addr v10, v3

    sub-int/2addr v10, v4

    goto :goto_1

    :cond_1
    move v10, v4

    :goto_1
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘᩴܳ;

    if-eqz v9, :cond_2

    .line 52
    iget v10, v3, Ll/ۘᩴܳ;->᩷:I

    goto :goto_2

    :cond_2
    iget v10, v3, Ll/ۘᩴܳ;->ۤ:I

    :goto_2
    int-to-long v10, v10

    iget v12, v3, Ll/ۘᩴܳ;->ۙ:I

    iget v13, v3, Ll/ۘᩴܳ;->᩸:I

    int-to-long v14, v12

    mul-long v10, v10, v14

    if-eqz v9, :cond_3

    .line 53
    iget v3, v3, Ll/ۘᩴܳ;->ۤ:I

    goto :goto_3

    :cond_3
    iget v3, v3, Ll/ۘᩴܳ;->᩷:I

    :goto_3
    move-object v9, v1

    int-to-long v0, v3

    mul-long v0, v0, v14

    .line 54
    invoke-static {v7, v13}, Ljava/lang/Math;->min(II)I

    move-result v7

    int-to-long v14, v8

    int-to-long v12, v13

    sub-long v12, v5, v12

    sub-long/2addr v12, v10

    .line 55
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    long-to-int v8, v12

    sub-long/2addr v0, v10

    add-long/2addr v5, v0

    add-int/lit8 v4, v4, 0x1

    const/4 v3, 0x1

    move-object/from16 v0, p0

    move-object v1, v9

    goto :goto_0

    .line 58
    :cond_4
    new-instance v0, Ll/ۘᩴܳ;

    sub-int/2addr v2, v7

    sub-int/2addr v2, v8

    move-object/from16 v1, p0

    iget v3, v1, Ll/ܰᩴܳ;->᩷:I

    sub-int/2addr v3, v7

    sub-int/2addr v3, v8

    const/4 v4, 0x1

    invoke-direct {v0, v7, v2, v3, v4}, Ll/ۘᩴܳ;-><init>(IIII)V

    return-object v0

    :cond_5
    move-object v1, v0

    .line 46
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Reset has no edit coordinates"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(IIJJZ)Ll/ܰᩴܳ;
    .locals 12

    move-object v0, p0

    .line 64
    new-instance v11, Ll/ܰᩴܳ;

    iget-boolean v1, v0, Ll/ܰᩴܳ;->ܳ:Z

    xor-int v9, v1, p7

    iget-boolean v10, v0, Ll/ܰᩴܳ;->۫:Z

    iget-object v8, v0, Ll/ܰᩴܳ;->ᩴ:Ljava/util/List;

    move-object v1, v11

    move-wide v2, p3

    move-wide/from16 v4, p5

    move v6, p1

    move v7, p2

    invoke-direct/range {v1 .. v10}, Ll/ܰᩴܳ;-><init>(JJIILjava/util/List;ZZ)V

    return-object v11
.end method

.method public final ۤ()Ljava/util/List;
    .locals 8

    .line 32
    iget-boolean v0, p0, Ll/ܰᩴܳ;->ܳ:Z

    iget-object v1, p0, Ll/ܰᩴܳ;->ᩴ:Ljava/util/List;

    if-nez v0, :cond_0

    return-object v1

    .line 33
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_1

    .line 35
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘᩴܳ;

    .line 37
    new-instance v4, Ll/ۘᩴܳ;

    iget v5, v3, Ll/ۘᩴܳ;->᩸:I

    iget v6, v3, Ll/ۘᩴܳ;->᩷:I

    iget v7, v3, Ll/ۘᩴܳ;->ۤ:I

    iget v3, v3, Ll/ۘᩴܳ;->ۙ:I

    invoke-direct {v4, v5, v6, v7, v3}, Ll/ۘᩴܳ;-><init>(IIII)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 39
    :cond_1
    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()I
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ܰᩴܳ;->ᩴ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ᩸()J
    .locals 4

    .line 61
    iget-object v0, p0, Ll/ܰᩴܳ;->ᩴ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x28

    mul-long v0, v0, v2

    const-wide/16 v2, 0x40

    add-long/2addr v0, v2

    return-wide v0
.end method

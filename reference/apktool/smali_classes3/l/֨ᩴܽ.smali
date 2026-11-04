.class public abstract Ll/֨ᩴܽ;
.super Ljava/lang/Object;
.source "V7NG"

# interfaces
.implements Ll/۠ۚۗ;


# instance fields
.field public final ֡:Ll/ۢۧۧ;

.field public ۟:Ll/۠ۚۗ;

.field public ܰ:I

.field public final ܿ:Ll/۠ۚۗ;

.field public ᩶:J


# direct methods
.method public constructor <init>(Ll/۠ۚۗ;Ll/۠ۚۗ;Ll/ۢۧۧ;Ll/۬ܳܳ;IJ)V
    .locals 0

    .line 338
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 339
    iput-object p1, p0, Ll/֨ᩴܽ;->۟:Ll/۠ۚۗ;

    .line 340
    iput-object p2, p0, Ll/֨ᩴܽ;->ܿ:Ll/۠ۚۗ;

    .line 341
    iput-object p3, p0, Ll/֨ᩴܽ;->֡:Ll/ۢۧۧ;

    .line 343
    iput p5, p0, Ll/֨ᩴܽ;->ܰ:I

    .line 344
    iput-wide p6, p0, Ll/֨ᩴܽ;->᩶:J

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    .line 422
    iget v0, p0, Ll/֨ᩴܽ;->ܰ:I

    return v0
.end method

.method public final estimateSize()J
    .locals 5

    .line 414
    iget-object v0, p0, Ll/֨ᩴܽ;->۟:Ll/۠ۚۗ;

    if-eqz v0, :cond_0

    .line 415
    iget-wide v1, p0, Ll/֨ᩴܽ;->᩶:J

    invoke-interface {v0}, Ll/۠ۚۗ;->estimateSize()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Ll/֨ᩴܽ;->᩶:J

    .line 417
    :cond_0
    iget-wide v0, p0, Ll/֨ᩴܽ;->᩶:J

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 2

    .line 373
    iget-object v0, p0, Ll/֨ᩴܽ;->۟:Ll/۠ۚۗ;

    if-eqz v0, :cond_0

    .line 374
    invoke-interface {v0, p1}, Ll/۠ۚۗ;->forEachRemaining(Ljava/util/function/Consumer;)V

    const/4 v0, 0x0

    .line 375
    iput-object v0, p0, Ll/֨ᩴܽ;->۟:Ll/۠ۚۗ;

    .line 377
    :cond_0
    new-instance v0, Ll/۫ܿۧ;

    invoke-direct {v0, p0, p1}, Ll/۫ܿۧ;-><init>(Ll/֨ᩴܽ;Ljava/util/function/Consumer;)V

    iget-object p1, p0, Ll/֨ᩴܽ;->ܿ:Ll/۠ۚۗ;

    invoke-interface {p1, v0}, Ll/۠ۚۗ;->forEachRemaining(Ljava/util/function/Consumer;)V

    const-wide/16 v0, 0x0

    .line 384
    iput-wide v0, p0, Ll/֨ᩴܽ;->᩶:J

    return-void
.end method

.method public synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ܿۚۗ;->$default$getComparator(Ll/۠ۚۗ;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic getExactSizeIfKnown()J
    .locals 2

    .line 0
    invoke-static {p0}, Ll/ܿۚۗ;->$default$getExactSizeIfKnown(Ll/۠ۚۗ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿۚۗ;->$default$hasCharacteristics(Ll/۠ۚۗ;I)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 4

    .line 357
    :cond_0
    iget-object v0, p0, Ll/֨ᩴܽ;->۟:Ll/۠ۚۗ;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Ll/۠ۚۗ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 358
    iget-wide v0, p0, Ll/֨ᩴܽ;->᩶:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    .line 359
    iput-wide v0, p0, Ll/֨ᩴܽ;->᩶:J

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 v0, 0x0

    .line 363
    iput-object v0, p0, Ll/֨ᩴܽ;->۟:Ll/۠ۚۗ;

    .line 365
    new-instance v0, Ll/ۢᩴܽ;

    invoke-direct {v0, p0}, Ll/ۢᩴܽ;-><init>(Ll/֨ᩴܽ;)V

    iget-object v1, p0, Ll/֨ᩴܽ;->ܿ:Ll/۠ۚۗ;

    invoke-interface {v1, v0}, Ll/۠ۚۗ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final trySplit()Ll/۠ۚۗ;
    .locals 9

    .line 389
    iget-object v0, p0, Ll/֨ᩴܽ;->ܿ:Ll/۠ۚۗ;

    invoke-interface {v0}, Ll/۠ۚۗ;->trySplit()Ll/۠ۚۗ;

    move-result-object v3

    const/4 v0, 0x0

    if-eqz v3, :cond_1

    .line 391
    iget v1, p0, Ll/֨ᩴܽ;->ܰ:I

    and-int/lit8 v5, v1, -0x41

    .line 392
    invoke-virtual {p0}, Ll/֨ᩴܽ;->estimateSize()J

    move-result-wide v1

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v4, v1, v6

    if-gez v4, :cond_0

    const-wide/16 v6, 0x2

    .line 394
    div-long/2addr v1, v6

    .line 395
    iget-wide v6, p0, Ll/֨ᩴܽ;->᩶:J

    sub-long/2addr v6, v1

    iput-wide v6, p0, Ll/֨ᩴܽ;->᩶:J

    .line 396
    iput v5, p0, Ll/֨ᩴܽ;->ܰ:I

    :cond_0
    move-wide v6, v1

    .line 398
    iget-object v2, p0, Ll/֨ᩴܽ;->۟:Ll/۠ۚۗ;

    .line 399
    new-instance v8, Ll/ۡᩴܽ;

    iget-object v4, p0, Ll/֨ᩴܽ;->֡:Ll/ۢۧۧ;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Ll/ۡᩴܽ;-><init>(Ll/۠ۚۗ;Ll/۠ۚۗ;Ll/ۢۧۧ;IJ)V

    .line 401
    iput-object v0, p0, Ll/֨ᩴܽ;->۟:Ll/۠ۚۗ;

    return-object v8

    .line 403
    :cond_1
    iget-object v1, p0, Ll/֨ᩴܽ;->۟:Ll/۠ۚۗ;

    if-eqz v1, :cond_2

    .line 405
    iput-object v0, p0, Ll/֨ᩴܽ;->۟:Ll/۠ۚۗ;

    return-object v1

    :cond_2
    return-object v0
.end method

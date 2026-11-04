.class public final Ll/۟ۤ᩵;
.super Ljava/lang/Object;
.source "OIUU"


# instance fields
.field public final ۙ:Ll/֡ۤ᩵;

.field public final ۚ:Ljava/util/Set;

.field public final ۤ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final ۫:Ljava/util/concurrent/atomic/AtomicReference;

.field public final ܳ:Ll/ۡ᩷᩵;

.field public final ᩴ:Ll/֡ۤ᩵;

.field public final ᩷:Ll/ۡ᩷᩵;

.field public final ᩸:Ll/ܺܳܺ;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ll/֡ۤ᩵;Ll/֡ۤ᩵;Ll/ܺܳܺ;Ll/ۡ᩷᩵;Ll/ۡ᩷᩵;)V
    .locals 1

    .line 267
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 268
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/۟ۤ᩵;->۫:Ljava/util/concurrent/atomic/AtomicReference;

    .line 269
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/۟ۤ᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 270
    iput-object p1, p0, Ll/۟ۤ᩵;->ۚ:Ljava/util/Set;

    .line 271
    iput-object p5, p0, Ll/۟ۤ᩵;->ܳ:Ll/ۡ᩷᩵;

    .line 272
    iput-object p6, p0, Ll/۟ۤ᩵;->᩷:Ll/ۡ᩷᩵;

    .line 273
    iput-object p4, p0, Ll/۟ۤ᩵;->᩸:Ll/ܺܳܺ;

    .line 274
    iput-object p2, p0, Ll/۟ۤ᩵;->ᩴ:Ll/֡ۤ᩵;

    .line 275
    iput-object p3, p0, Ll/۟ۤ᩵;->ۙ:Ll/֡ۤ᩵;

    return-void
.end method

.method public constructor <init>(Ll/ۖۡۗ;Ll/᩺ۗܺ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/List;Ljava/util/List;)V
    .locals 3

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 238
    invoke-virtual {p3}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 239
    invoke-virtual {p4}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    .line 240
    new-instance v2, Ll/֡᩷᩵;

    invoke-direct {v2, p2, v0}, Ll/֡᩷᩵;-><init>(Ll/᩺ۗܺ;Z)V

    .line 241
    new-instance v0, Ll/֡᩷᩵;

    invoke-direct {v0, p2, v1}, Ll/֡᩷᩵;-><init>(Ll/᩺ۗܺ;Z)V

    .line 243
    new-instance p2, Ll/ᩳۤ᩵;

    const/4 v1, 0x0

    .line 17
    invoke-direct {p2, p3, v1, v1}, Ll/ᩳۤ᩵;-><init>(Ll/᩷ۡۗ;II)V

    .line 244
    new-instance p3, Ll/ᩳۤ᩵;

    .line 17
    invoke-direct {p3, p4, v1, v1}, Ll/ᩳۤ᩵;-><init>(Ll/᩷ۡۗ;II)V

    .line 246
    new-instance p4, Ll/ۗۤ᩵;

    invoke-direct {p4, p0, v2, p2}, Ll/ۗۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ll/ᩳۤ᩵;)V

    .line 247
    new-instance p2, Ll/ۗۤ᩵;

    invoke-direct {p2, p0, v0, p3}, Ll/ۗۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ll/ᩳۤ᩵;)V

    .line 249
    new-instance p3, Ll/ۡ᩷᩵;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-direct {p3, v0}, Ll/ۡ᩷᩵;-><init>(Ljava/util/HashSet;)V

    iput-object p3, p0, Ll/۟ۤ᩵;->ܳ:Ll/ۡ᩷᩵;

    .line 250
    new-instance p3, Ll/ۡ᩷᩵;

    new-instance p5, Ljava/util/HashSet;

    invoke-direct {p5, p6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-direct {p3, p5}, Ll/ۡ᩷᩵;-><init>(Ljava/util/HashSet;)V

    iput-object p3, p0, Ll/۟ۤ᩵;->᩷:Ll/ۡ᩷᩵;

    .line 251
    new-instance p3, Ll/ܺܳܺ;

    invoke-direct {p3, p1}, Ll/ܺܳܺ;-><init>(Ll/ۖۡۗ;)V

    iput-object p3, p0, Ll/۟ۤ᩵;->᩸:Ll/ܺܳܺ;

    .line 253
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1, p4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/۟ۤ᩵;->۫:Ljava/util/concurrent/atomic/AtomicReference;

    .line 254
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/۟ۤ᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 255
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/۟ۤ᩵;->ۚ:Ljava/util/Set;

    .line 256
    new-instance p1, Ll/֡ۤ᩵;

    invoke-direct {p1}, Ll/֡ۤ᩵;-><init>()V

    iput-object p1, p0, Ll/۟ۤ᩵;->ᩴ:Ll/֡ۤ᩵;

    .line 257
    new-instance p1, Ll/֡ۤ᩵;

    invoke-direct {p1}, Ll/֡ۤ᩵;-><init>()V

    iput-object p1, p0, Ll/۟ۤ᩵;->ۙ:Ll/֡ۤ᩵;

    return-void
.end method

.method public static ۙ(Ll/֡ۤ᩵;)Ljava/util/HashSet;
    .locals 3

    .line 376
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 377
    invoke-virtual {p0}, Ll/֡ۤ᩵;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۤ᩵;

    .line 378
    invoke-static {v1}, Ll/ܿۤ᩵;->ۤ(Ll/ܿۤ᩵;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 381
    :cond_0
    invoke-static {v1}, Ll/ܿۤ᩵;->ۙ(Ll/ܿۤ᩵;)Ll/᩷ۡۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;
    .locals 8

    .line 46
    new-instance v7, Ll/۟ۤ᩵;

    iget-object v1, p0, Ll/۟ۤ᩵;->ۚ:Ljava/util/Set;

    iget-object v2, p0, Ll/۟ۤ᩵;->ᩴ:Ll/֡ۤ᩵;

    iget-object v3, p0, Ll/۟ۤ᩵;->ۙ:Ll/֡ۤ᩵;

    iget-object v4, p0, Ll/۟ۤ᩵;->᩸:Ll/ܺܳܺ;

    iget-object v5, p0, Ll/۟ۤ᩵;->ܳ:Ll/ۡ᩷᩵;

    iget-object v6, p0, Ll/۟ۤ᩵;->᩷:Ll/ۡ᩷᩵;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/۟ۤ᩵;-><init>(Ljava/util/Set;Ll/֡ۤ᩵;Ll/֡ۤ᩵;Ll/ܺܳܺ;Ll/ۡ᩷᩵;Ll/ۡ᩷᩵;)V

    .line 52
    invoke-virtual {p1, v7}, Ll/۬᩷᩵;->᩷(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;

    move-result-object p0

    .line 53
    invoke-virtual {p2, v7}, Ll/۬᩷᩵;->᩷(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;

    move-result-object p1

    .line 54
    iget-object p2, v7, Ll/۟ۤ᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 55
    iget-object p1, v7, Ll/۟ۤ᩵;->۫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-object v7
.end method


# virtual methods
.method public final ۙ()Ll/۟ۤ᩵;
    .locals 8

    .line 279
    new-instance v1, Ljava/util/HashSet;

    iget-object v0, p0, Ll/۟ۤ᩵;->ۚ:Ljava/util/Set;

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 280
    iget-object v0, p0, Ll/۟ۤ᩵;->ᩴ:Ll/֡ۤ᩵;

    invoke-static {v0}, Ll/֡ۤ᩵;->ۙ(Ll/֡ۤ᩵;)Ll/֡ۤ᩵;

    move-result-object v2

    .line 281
    iget-object v0, p0, Ll/۟ۤ᩵;->ۙ:Ll/֡ۤ᩵;

    invoke-static {v0}, Ll/֡ۤ᩵;->ۙ(Ll/֡ۤ᩵;)Ll/֡ۤ᩵;

    move-result-object v3

    .line 282
    new-instance v7, Ll/۟ۤ᩵;

    iget-object v5, p0, Ll/۟ۤ᩵;->ܳ:Ll/ۡ᩷᩵;

    iget-object v6, p0, Ll/۟ۤ᩵;->᩷:Ll/ۡ᩷᩵;

    iget-object v4, p0, Ll/۟ۤ᩵;->᩸:Ll/ܺܳܺ;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/۟ۤ᩵;-><init>(Ljava/util/Set;Ll/֡ۤ᩵;Ll/֡ۤ᩵;Ll/ܺܳܺ;Ll/ۡ᩷᩵;Ll/ۡ᩷᩵;)V

    .line 286
    invoke-virtual {p0}, Ll/۟ۤ᩵;->ᩴ()Ll/֨ۤ᩵;

    move-result-object v0

    .line 48
    invoke-virtual {v0, v7}, Ll/֨ۤ᩵;->᩷(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;

    move-result-object v0

    .line 287
    invoke-virtual {p0}, Ll/۟ۤ᩵;->᩸()Ll/֨ۤ᩵;

    move-result-object v1

    .line 48
    invoke-virtual {v1, v7}, Ll/֨ۤ᩵;->᩷(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;

    move-result-object v1

    .line 288
    iget-object v2, v7, Ll/۟ۤ᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 289
    iget-object v1, v7, Ll/۟ۤ᩵;->۫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-object v7
.end method

.method public final ۙ(Ll/֨ۤ᩵;)Ll/ۡ᩷᩵;
    .locals 1

    .line 325
    iget-object v0, p0, Ll/۟ۤ᩵;->۫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 326
    iget-object p1, p0, Ll/۟ۤ᩵;->ܳ:Ll/ۡ᩷᩵;

    return-object p1

    .line 328
    :cond_0
    iget-object v0, p0, Ll/۟ۤ᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_1

    .line 329
    iget-object p1, p0, Ll/۟ۤ᩵;->᩷:Ll/ۡ᩷᩵;

    return-object p1

    .line 331
    :cond_1
    new-instance p1, Ll/۠ۧ᩵;

    const-string v0, "Orphaned TraverserState node"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 331
    throw p1
.end method

.method public final ۙ(Ljava/util/List;)V
    .locals 3

    .line 347
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ۤ᩵;

    .line 348
    iget-object v1, p0, Ll/۟ۤ᩵;->ۚ:Ljava/util/Set;

    .line 310
    iget-object v2, v0, Ll/۟ۤ᩵;->ۚ:Ljava/util/Set;

    .line 348
    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 350
    iget-object v1, p0, Ll/۟ۤ᩵;->ᩴ:Ll/֡ۤ᩵;

    iget-object v2, v0, Ll/۟ۤ᩵;->ᩴ:Ll/֡ۤ᩵;

    invoke-static {v1, v2}, Ll/֡ۤ᩵;->ۙ(Ll/֡ۤ᩵;Ll/֡ۤ᩵;)V

    .line 351
    iget-object v1, p0, Ll/۟ۤ᩵;->ۙ:Ll/֡ۤ᩵;

    iget-object v0, v0, Ll/۟ۤ᩵;->ۙ:Ll/֡ۤ᩵;

    invoke-static {v1, v0}, Ll/֡ۤ᩵;->ۙ(Ll/֡ۤ᩵;Ll/֡ۤ᩵;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ᩳۤ᩵;I)V
    .locals 4

    .line 356
    invoke-virtual {p1}, Ll/ᩳۤ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object v0

    .line 357
    iget-object v1, p0, Ll/۟ۤ᩵;->ܳ:Ll/ۡ᩷᩵;

    invoke-virtual {v1, v0}, Ll/ۡ᩷᩵;->ۙ(Ll/᩷ۡۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 360
    iget-object v0, p0, Ll/۟ۤ᩵;->ᩴ:Ll/֡ۤ᩵;

    goto :goto_0

    .line 362
    :cond_0
    iget-object v0, p0, Ll/۟ۤ᩵;->ۙ:Ll/֡ۤ᩵;

    .line 364
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    invoke-virtual {p1}, Ll/ᩳۤ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object v1

    .line 186
    invoke-virtual {v0, v1}, Ll/֡ۤ᩵;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 187
    invoke-virtual {v0, v1}, Ll/֡ۤ᩵;->get(Ljava/lang/Object;)Ll/ܿۤ᩵;

    move-result-object v0

    invoke-static {v0, p1, p2}, Ll/ܿۤ᩵;->ۙ(Ll/ܿۤ᩵;Ll/ᩳۤ᩵;I)V

    return-void

    .line 189
    :cond_1
    new-instance v2, Ll/ܿۤ᩵;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Ll/ܿۤ᩵;-><init>(Ll/᩷ۡۗ;I)V

    .line 190
    invoke-static {v2, p1, p2}, Ll/ܿۤ᩵;->ۙ(Ll/ܿۤ᩵;Ll/ᩳۤ᩵;I)V

    .line 191
    invoke-virtual {v0, v1, v2}, Ll/֡ۤ᩵;->ۙ(Ll/᩷ۡۗ;Ll/ܿۤ᩵;)Ll/ܿۤ᩵;

    return-void
.end method

.method public final ۤ()Ljava/util/HashSet;
    .locals 1

    .line 368
    iget-object v0, p0, Ll/۟ۤ᩵;->ᩴ:Ll/֡ۤ᩵;

    invoke-static {v0}, Ll/۟ۤ᩵;->ۙ(Ll/֡ۤ᩵;)Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public final ۫()Ljava/util/Set;
    .locals 1

    .line 310
    iget-object v0, p0, Ll/۟ۤ᩵;->ۚ:Ljava/util/Set;

    return-object v0
.end method

.method public final ܳ()Ll/ܺܳܺ;
    .locals 1

    .line 343
    iget-object v0, p0, Ll/۟ۤ᩵;->᩸:Ll/ܺܳܺ;

    return-object v0
.end method

.method public final ᩴ()Ll/֨ۤ᩵;
    .locals 1

    .line 294
    iget-object v0, p0, Ll/۟ۤ᩵;->۫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ۤ᩵;

    return-object v0
.end method

.method public final ᩷()Ljava/util/HashSet;
    .locals 1

    .line 372
    iget-object v0, p0, Ll/۟ۤ᩵;->ۙ:Ll/֡ۤ᩵;

    invoke-static {v0}, Ll/۟ۤ᩵;->ۙ(Ll/֡ۤ᩵;)Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ll/֨ۤ᩵;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 2

    .line 315
    iget-object v0, p0, Ll/۟ۤ᩵;->۫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p1, :cond_0

    return-object v0

    .line 318
    :cond_0
    iget-object v0, p0, Ll/۟ۤ᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p1, :cond_1

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ᩸()Ll/֨ۤ᩵;
    .locals 1

    .line 298
    iget-object v0, p0, Ll/۟ۤ᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ۤ᩵;

    return-object v0
.end method

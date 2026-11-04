.class public final Ll/ܰ᩷ۨ;
.super Ljava/lang/Object;
.source "4AYL"


# static fields
.field public static final synthetic ۫:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic ܳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final ᩴ:Ll/ۜ᩷ۨ;


# instance fields
.field public volatile synthetic _next$volatile:Ljava/lang/Object;

.field public volatile synthetic _state$volatile:J

.field public final synthetic ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

.field public final ۤ:I

.field public final ᩷:I

.field public final ᩸:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 2
    const-class v0, Ljava/lang/Object;

    const-string v1, "_next$volatile"

    .line 6
    const-class v2, Ll/ܰ᩷ۨ;

    .line 9
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    .line 12
    sput-object v0, Ll/ܰ᩷ۨ;->ܳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_state$volatile"

    .line 17
    invoke-static {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    .line 20
    sput-object v0, Ll/ܰ᩷ۨ;->۫:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 284
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "REMOVE_FROZEN"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ܰ᩷ۨ;->ᩴ:Ll/ۜ᩷ۨ;

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 2

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput p1, p0, Ll/ܰ᩷ۨ;->᩷:I

    .line 74
    iput-boolean p2, p0, Ll/ܰ᩷ۨ;->᩸:Z

    add-int/lit8 p2, p1, -0x1

    .line 76
    iput p2, p0, Ll/ܰ᩷ۨ;->ۤ:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 79
    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object v0, p0, Ll/ܰ᩷ۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const v0, 0x3fffffff    # 1.9999999f

    const-string v1, "Check failed."

    if-gt p2, v0, :cond_1

    and-int/2addr p1, p2

    if-nez p1, :cond_0

    return-void

    .line 83
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 82
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;)I
    .locals 14

    .line 100
    :cond_0
    sget-object v0, Ll/ܰ᩷ۨ;->۫:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide/high16 v1, 0x3000000000000000L    # 1.727233711018889E-77

    and-long/2addr v1, v3

    const-wide/16 v7, 0x0

    cmp-long v5, v1, v7

    if-eqz v5, :cond_1

    const-wide/high16 v0, 0x2000000000000000L

    and-long/2addr v0, v3

    cmp-long p1, v0, v7

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    return p1

    :cond_1
    const-wide/32 v1, 0x3fffffff

    and-long/2addr v1, v3

    long-to-int v2, v1

    const-wide v5, 0xfffffffc0000000L

    and-long/2addr v5, v3

    const/16 v1, 0x1e

    shr-long/2addr v5, v1

    long-to-int v9, v5

    add-int/lit8 v5, v9, 0x2

    .line 107
    iget v10, p0, Ll/ܰ᩷ۨ;->ۤ:I

    and-int/2addr v5, v10

    and-int v6, v2, v10

    if-ne v5, v6, :cond_2

    goto :goto_0

    .line 110
    :cond_2
    iget-boolean v5, p0, Ll/ܰ᩷ۨ;->᩸:Z

    const v6, 0x3fffffff    # 1.9999999f

    iget-object v11, p0, Ll/ܰ᩷ۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    if-nez v5, :cond_4

    and-int v5, v9, v10

    invoke-virtual {v11, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    const/16 v0, 0x400

    .line 116
    iget v1, p0, Ll/ܰ᩷ۨ;->᩷:I

    if-lt v1, v0, :cond_3

    sub-int/2addr v9, v2

    and-int v0, v9, v6

    shr-int/lit8 v1, v1, 0x1

    if-le v0, v1, :cond_0

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    add-int/lit8 v2, v9, 0x1

    and-int/2addr v2, v6

    const-wide v5, -0xfffffffc0000001L    # -3.1050369248997324E231

    and-long/2addr v5, v3

    int-to-long v12, v2

    shl-long v1, v12, v1

    or-long/2addr v5, v1

    .line 123
    sget-object v1, Ll/ܰ᩷ۨ;->۫:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    and-int v1, v9, v10

    .line 125
    invoke-virtual {v11, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    move-object v1, p0

    .line 129
    :cond_5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide/high16 v4, 0x1000000000000000L

    and-long/2addr v2, v4

    cmp-long v4, v2, v7

    if-eqz v4, :cond_7

    .line 130
    invoke-virtual {v1}, Ll/ܰ᩷ۨ;->᩸()Ll/ܰ᩷ۨ;

    move-result-object v1

    .line 0
    iget-object v2, v1, Ll/ܰ᩷ۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 139
    iget v3, v1, Ll/ܰ᩷ۨ;->ۤ:I

    and-int/2addr v3, v9

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 150
    instance-of v5, v4, Ll/ۘ᩷ۨ;

    if-eqz v5, :cond_6

    check-cast v4, Ll/ۘ᩷ۨ;

    iget v4, v4, Ll/ۘ᩷ۨ;->ۙ:I

    if-ne v4, v9, :cond_6

    .line 151
    invoke-virtual {v2, v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    goto :goto_1

    :cond_6
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_5

    :cond_7
    const/4 p1, 0x0

    return p1
.end method

.method public final ۙ()Z
    .locals 11

    .line 90
    :cond_0
    sget-object v0, Ll/ܰ᩷ۨ;->۫:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide/high16 v4, 0x2000000000000000L

    and-long v6, v2, v4

    const/4 v8, 0x1

    const-wide/16 v9, 0x0

    cmp-long v1, v6, v9

    if-eqz v1, :cond_1

    return v8

    :cond_1
    const-wide/high16 v6, 0x1000000000000000L

    and-long/2addr v6, v2

    cmp-long v1, v6, v9

    if-eqz v1, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    or-long/2addr v4, v2

    move-object v1, p0

    .line 94
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return v8
.end method

.method public final ۤ()Z
    .locals 6

    .line 0
    sget-object v0, Ll/ܰ᩷ۨ;->۫:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 87
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/32 v2, 0x3fffffff

    and-long/2addr v2, v0

    long-to-int v3, v2

    const-wide v4, 0xfffffffc0000000L

    and-long/2addr v0, v4

    const/16 v2, 0x1e

    shr-long/2addr v0, v2

    long-to-int v1, v0

    if-ne v3, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩴ()Ljava/lang/Object;
    .locals 29

    move-object/from16 v6, p0

    .line 160
    :cond_0
    sget-object v7, Ll/ܰ᩷ۨ;->۫:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide/high16 v8, 0x1000000000000000L

    and-long v0, v2, v8

    const-wide/16 v10, 0x0

    cmp-long v4, v0, v10

    if-eqz v4, :cond_1

    .line 162
    sget-object v0, Ll/ܰ᩷ۨ;->ᩴ:Ll/ۜ᩷ۨ;

    return-object v0

    :cond_1
    const-wide/32 v12, 0x3fffffff

    and-long v0, v2, v12

    long-to-int v1, v0

    const-wide v4, 0xfffffffc0000000L

    and-long/2addr v4, v2

    const/16 v0, 0x1e

    shr-long/2addr v4, v0

    long-to-int v0, v4

    .line 164
    iget v4, v6, Ll/ܰ᩷ۨ;->ۤ:I

    and-int/2addr v0, v4

    and-int v14, v1, v4

    const/4 v15, 0x0

    if-ne v0, v14, :cond_2

    goto :goto_0

    .line 165
    :cond_2
    iget-object v4, v6, Ll/ܰ᩷ۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v4, v14}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 166
    iget-boolean v0, v6, Ll/ܰ᩷ۨ;->᩸:Z

    if-nez v5, :cond_3

    if-eqz v0, :cond_0

    goto :goto_0

    .line 173
    :cond_3
    instance-of v10, v5, Ll/ۘ᩷ۨ;

    if-eqz v10, :cond_4

    :goto_0
    return-object v15

    :cond_4
    add-int/lit8 v1, v1, 0x1

    const v10, 0x3fffffff    # 1.9999999f

    and-int/2addr v1, v10

    const-wide/32 v10, -0x40000000

    and-long v18, v2, v10

    int-to-long v10, v1

    or-long v18, v18, v10

    .line 176
    sget-object v1, Ll/ܰ᩷ۨ;->۫:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move/from16 v22, v0

    move-object v0, v1

    move-object/from16 v1, p0

    move-object v8, v4

    move-object v9, v5

    move-wide/from16 v4, v18

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 179
    invoke-virtual {v8, v14, v15}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-object v9

    :cond_5
    if-eqz v22, :cond_0

    move-object v0, v6

    .line 194
    :cond_6
    invoke-virtual {v7, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v25

    and-long v1, v25, v12

    long-to-int v2, v1

    const-wide/high16 v3, 0x1000000000000000L

    and-long v18, v25, v3

    const-wide/16 v16, 0x0

    cmp-long v1, v18, v16

    if-eqz v1, :cond_7

    .line 200
    invoke-virtual {v0}, Ll/ܰ᩷ۨ;->᩸()Ll/ܰ᩷ۨ;

    move-result-object v0

    const-wide/32 v18, -0x40000000

    goto :goto_1

    :cond_7
    const-wide/32 v18, -0x40000000

    and-long v20, v25, v18

    or-long v27, v20, v10

    .line 202
    sget-object v23, Ll/ܰ᩷ۨ;->۫:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object/from16 v24, v0

    invoke-virtual/range {v23 .. v28}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 0
    iget-object v1, v0, Ll/ܰ᩷ۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 203
    iget v0, v0, Ll/ܰ᩷ۨ;->ۤ:I

    and-int/2addr v0, v2

    invoke-virtual {v1, v0, v15}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    move-object v0, v15

    :goto_1
    if-nez v0, :cond_6

    return-object v9
.end method

.method public final ᩷()I
    .locals 6

    .line 0
    sget-object v0, Ll/ܰ᩷ۨ;->۫:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 88
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/32 v2, 0x3fffffff

    and-long/2addr v2, v0

    long-to-int v3, v2

    const-wide v4, 0xfffffffc0000000L

    and-long/2addr v0, v4

    const/16 v2, 0x1e

    shr-long/2addr v0, v2

    long-to-int v1, v0

    sub-int/2addr v1, v3

    const v0, 0x3fffffff    # 1.9999999f

    and-int/2addr v0, v1

    return v0
.end method

.method public final ᩸()Ll/ܰ᩷ۨ;
    .locals 10

    .line 212
    :cond_0
    sget-object v6, Ll/ܰ᩷ۨ;->۫:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide/high16 v0, 0x1000000000000000L

    and-long v4, v2, v0

    const-wide/16 v7, 0x0

    cmp-long v9, v4, v7

    if-eqz v9, :cond_1

    goto :goto_0

    :cond_1
    or-long v7, v2, v0

    move-object v0, v6

    move-object v1, p0

    move-wide v4, v7

    .line 215
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    move-wide v2, v7

    .line 218
    :goto_0
    sget-object v0, Ll/ܰ᩷ۨ;->ܳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰ᩷ۨ;

    if-eqz v1, :cond_2

    return-object v1

    .line 226
    :cond_2
    new-instance v1, Ll/ܰ᩷ۨ;

    iget v4, p0, Ll/ܰ᩷ۨ;->᩷:I

    mul-int/lit8 v4, v4, 0x2

    iget-boolean v5, p0, Ll/ܰ᩷ۨ;->᩸:Z

    invoke-direct {v1, v4, v5}, Ll/ܰ᩷ۨ;-><init>(IZ)V

    const-wide/32 v4, 0x3fffffff

    and-long/2addr v4, v2

    long-to-int v5, v4

    const-wide v7, 0xfffffffc0000000L

    and-long/2addr v7, v2

    const/16 v4, 0x1e

    shr-long/2addr v7, v4

    long-to-int v4, v7

    .line 229
    :goto_1
    iget v7, p0, Ll/ܰ᩷ۨ;->ۤ:I

    and-int v8, v5, v7

    and-int/2addr v7, v4

    if-eq v8, v7, :cond_4

    .line 0
    iget-object v7, p0, Ll/ܰ᩷ۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 231
    invoke-virtual {v7, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_3

    new-instance v7, Ll/ۘ᩷ۨ;

    invoke-direct {v7, v5}, Ll/ۘ᩷ۨ;-><init>(I)V

    .line 232
    :cond_3
    iget v8, v1, Ll/ܰ᩷ۨ;->ۤ:I

    and-int/2addr v8, v5

    iget-object v9, v1, Ll/ܰ᩷ۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v9, v8, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    const-wide v4, -0x1000000000000001L    # -3.1050361846014175E231

    and-long/2addr v4, v2

    .line 235
    invoke-virtual {v6, v1, v4, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    :cond_5
    const/4 v4, 0x0

    .line 0
    invoke-virtual {v0, p0, v4, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_5

    goto :goto_0
.end method

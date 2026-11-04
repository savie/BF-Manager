.class public final Ll/ۚ᩸ܽ;
.super Ljava/util/AbstractMap;
.source "E3QI"

# interfaces
.implements Ljava/util/concurrent/ConcurrentMap;
.implements Ll/ۗ֫ۗ;


# static fields
.field public static final ۧۙ:Ljava/util/Queue;

.field public static final ܺۙ:Ljava/util/logging/Logger;

.field public static final ᩻ۙ:Ll/᩺᩷ܽ;


# instance fields
.field public ֡:Ljava/util/Set;

.field public final ֨:Ll/۫ۙܽ;

.field public final ֫ۙ:Ll/ۨ᩸ܽ;

.field public final ۖ:Ll/ۘۤܽ;

.field public final ۙۙ:Ljava/util/AbstractQueue;

.field public ۚۙ:Ljava/util/Collection;

.field public final ۜ:J

.field public final ۟:J

.field public final ۠:J

.field public ۡ:Ljava/util/Set;

.field public final ۢ:Ll/ۚ᩷ܽ;

.field public final ۤۙ:I

.field public final ۫ۙ:Ll/ۘۤܽ;

.field public final ۬:Ll/ۗ᩸ܽ;

.field public final ܰ:I

.field public final ܳۙ:Ll/۫ۙܽ;

.field public final ܿ:Ll/ۙۤܽ;

.field public final ᩳ:J

.field public final ᩴۙ:Ll/ܳ᩷ܽ;

.field public final ᩶:Ll/᩵᩷ܽ;

.field public final ᩷ۙ:I

.field public final ᩸ۙ:[Ll/ۗۤܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 167
    const-class v0, Ll/ۚ᩸ܽ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ۚ᩸ܽ;->ܺۙ:Ljava/util/logging/Logger;

    .line 708
    new-instance v0, Ll/᩺᩷ܽ;

    .line 709
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 708
    sput-object v0, Ll/ۚ᩸ܽ;->᩻ۙ:Ll/᩺᩷ܽ;

    .line 925
    new-instance v0, Ll/ۘ᩷ܽ;

    invoke-direct {v0}, Ll/ۘ᩷ܽ;-><init>()V

    sput-object v0, Ll/ۚ᩸ܽ;->ۧۙ:Ljava/util/Queue;

    return-void
.end method

.method public constructor <init>(Ll/᩹᩷ܽ;Ll/᩵᩷ܽ;)V
    .locals 18

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    .line 243
    invoke-direct/range {p0 .. p0}, Ljava/util/AbstractMap;-><init>()V

    .line 474
    iget v1, v0, Ll/᩹᩷ܽ;->ۙ:I

    iget-object v7, v0, Ll/᩹᩷ܽ;->֫:Ll/ۜۙܽ;

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x4

    :cond_0
    const/high16 v2, 0x10000

    .line 244
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v6, Ll/ۚ᩸ܽ;->ܰ:I

    .line 646
    iget-object v1, v0, Ll/᩹᩷ܽ;->ᩴ:Ll/ۘۤܽ;

    sget-object v2, Ll/ۘۤܽ;->ܿ:Ll/ۘۤܽ;

    invoke-static {v1, v2}, Ll/᩵ۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘۤܽ;

    .line 246
    iput-object v1, v6, Ll/ۚ᩸ܽ;->ۖ:Ll/ۘۤܽ;

    .line 706
    iget-object v3, v0, Ll/᩹᩷ܽ;->ܽ:Ll/ۘۤܽ;

    invoke-static {v3, v2}, Ll/᩵ۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘۤܽ;

    .line 247
    iput-object v3, v6, Ll/ۚ᩸ܽ;->۫ۙ:Ll/ۘۤܽ;

    .line 380
    iget-object v3, v0, Ll/᩹᩷ܽ;->᩸:Ll/۫ۙܽ;

    .line 646
    iget-object v4, v0, Ll/᩹᩷ܽ;->ᩴ:Ll/ۘۤܽ;

    invoke-static {v4, v2}, Ll/᩵ۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘۤܽ;

    .line 380
    invoke-virtual {v4}, Ll/ۘۤܽ;->ۙ()Ll/۫ۙܽ;

    move-result-object v4

    invoke-static {v3, v4}, Ll/᩵ۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫ۙܽ;

    .line 249
    iput-object v3, v6, Ll/ۚ᩸ܽ;->֨:Ll/۫ۙܽ;

    .line 402
    iget-object v3, v0, Ll/᩹᩷ܽ;->ܺ:Ll/۫ۙܽ;

    .line 706
    iget-object v4, v0, Ll/᩹᩷ܽ;->ܽ:Ll/ۘۤܽ;

    invoke-static {v4, v2}, Ll/᩵ۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘۤܽ;

    .line 402
    invoke-virtual {v2}, Ll/ۘۤܽ;->ۙ()Ll/۫ۙܽ;

    move-result-object v2

    invoke-static {v3, v2}, Ll/᩵ۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫ۙܽ;

    .line 250
    iput-object v2, v6, Ll/ۚ᩸ܽ;->ܳۙ:Ll/۫ۙܽ;

    .line 604
    iget-wide v2, v0, Ll/᩹᩷ܽ;->ۤ:J

    const-wide/16 v4, 0x0

    cmp-long v8, v2, v4

    if-eqz v8, :cond_3

    iget-wide v2, v0, Ll/᩹᩷ܽ;->᩷:J

    cmp-long v8, v2, v4

    if-nez v8, :cond_1

    goto :goto_0

    .line 607
    :cond_1
    iget-object v2, v0, Ll/᩹᩷ܽ;->ܶ:Ll/ۨ᩸ܽ;

    if-nez v2, :cond_2

    iget-wide v2, v0, Ll/᩹᩷ܽ;->ܳ:J

    goto :goto_1

    :cond_2
    iget-wide v2, v0, Ll/᩹᩷ܽ;->۫:J

    goto :goto_1

    :cond_3
    :goto_0
    move-wide v2, v4

    .line 252
    :goto_1
    iput-wide v2, v6, Ll/ۚ᩸ܽ;->۠:J

    .line 613
    iget-object v8, v0, Ll/᩹᩷ܽ;->ܶ:Ll/ۨ᩸ܽ;

    sget-object v9, Ll/ܶ᩷ܽ;->᩶:Ll/ܶ᩷ܽ;

    invoke-static {v8, v9}, Ll/᩵ۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۨ᩸ܽ;

    .line 253
    iput-object v8, v6, Ll/ۚ᩸ܽ;->֫ۙ:Ll/ۨ᩸ܽ;

    .line 858
    iget-wide v10, v0, Ll/᩹᩷ܽ;->᩷:J

    const-wide/16 v12, -0x1

    cmp-long v14, v10, v12

    if-nez v14, :cond_4

    move-wide v10, v4

    .line 254
    :cond_4
    iput-wide v10, v6, Ll/ۚ᩸ܽ;->۟:J

    .line 777
    iget-wide v10, v0, Ll/᩹᩷ܽ;->ۤ:J

    cmp-long v14, v10, v12

    if-nez v14, :cond_5

    move-wide v10, v4

    .line 255
    :cond_5
    iput-wide v10, v6, Ll/ۚ᩸ܽ;->ᩳ:J

    .line 256
    iput-wide v4, v6, Ll/ۚ᩸ܽ;->ۜ:J

    .line 1006
    iget-object v10, v0, Ll/᩹᩷ܽ;->ۚ:Ll/ۗ᩸ܽ;

    sget-object v11, Ll/ܽ᩷ܽ;->᩶:Ll/ܽ᩷ܽ;

    .line 1007
    invoke-static {v10, v11}, Ll/᩵ۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۗ᩸ܽ;

    .line 258
    iput-object v10, v6, Ll/ۚ᩸ܽ;->۬:Ll/ۗ᩸ܽ;

    if-ne v10, v11, :cond_6

    .line 261
    sget-object v10, Ll/ۚ᩸ܽ;->ۧۙ:Ljava/util/Queue;

    goto :goto_2

    .line 262
    :cond_6
    new-instance v10, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v10}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    :goto_2
    check-cast v10, Ljava/util/AbstractQueue;

    iput-object v10, v6, Ll/ۚ᩸ܽ;->ۙۙ:Ljava/util/AbstractQueue;

    .line 353
    invoke-virtual/range {p0 .. p0}, Ll/ۚ᩸ܽ;->᩸()Z

    move-result v10

    const/4 v11, 0x0

    if-nez v10, :cond_9

    cmp-long v10, v4, v4

    if-lez v10, :cond_7

    goto :goto_3

    .line 357
    :cond_7
    invoke-virtual/range {p0 .. p0}, Ll/ۚ᩸ܽ;->᩷()Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_3

    :cond_8
    const/4 v10, 0x0

    goto :goto_4

    :cond_9
    :goto_3
    const/4 v10, 0x1

    .line 966
    :goto_4
    iget-object v0, v0, Ll/᩹᩷ܽ;->᩻:Ll/ܳ᩷ܽ;

    if-eqz v0, :cond_a

    goto :goto_5

    :cond_a
    if-eqz v10, :cond_b

    .line 969
    invoke-static {}, Ll/ܳ᩷ܽ;->᩷()Ll/ܳ᩷ܽ;

    move-result-object v0

    goto :goto_5

    :cond_b
    sget-object v0, Ll/᩹᩷ܽ;->ۗ:Ll/ܳ᩷ܽ;

    .line 264
    :goto_5
    iput-object v0, v6, Ll/ۚ᩸ܽ;->ᩴۙ:Ll/ܳ᩷ܽ;

    .line 345
    invoke-virtual/range {p0 .. p0}, Ll/ۚ᩸ܽ;->᩷()Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual/range {p0 .. p0}, Ll/ۚ᩸ܽ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_6

    .line 357
    :cond_c
    invoke-virtual/range {p0 .. p0}, Ll/ۚ᩸ܽ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_6

    :cond_d
    const/4 v0, 0x0

    goto :goto_7

    :cond_e
    :goto_6
    const/4 v0, 0x1

    .line 349
    :goto_7
    invoke-virtual/range {p0 .. p0}, Ll/ۚ᩸ܽ;->᩸()Z

    move-result v10

    if-nez v10, :cond_10

    .line 353
    invoke-virtual/range {p0 .. p0}, Ll/ۚ᩸ܽ;->᩸()Z

    move-result v10

    if-nez v10, :cond_10

    cmp-long v10, v4, v4

    if-lez v10, :cond_f

    goto :goto_8

    :cond_f
    const/4 v4, 0x0

    goto :goto_9

    :cond_10
    :goto_8
    const/4 v4, 0x1

    .line 265
    :goto_9
    invoke-static {v1, v0, v4}, Ll/ۙۤܽ;->ۙ(Ll/ۘۤܽ;ZZ)Ll/ۙۤܽ;

    move-result-object v0

    iput-object v0, v6, Ll/ۚ᩸ܽ;->ܿ:Ll/ۙۤܽ;

    .line 266
    invoke-interface {v7}, Ll/ۜۙܽ;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ᩷ܽ;

    iput-object v0, v6, Ll/ۚ᩸ܽ;->ۢ:Ll/ۚ᩷ܽ;

    move-object/from16 v0, p2

    .line 267
    iput-object v0, v6, Ll/ۚ᩸ܽ;->᩶:Ll/᩵᩷ܽ;

    const/16 v0, 0x10

    const/high16 v1, 0x40000000    # 2.0f

    .line 269
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 270
    invoke-virtual/range {p0 .. p0}, Ll/ۚ᩸ܽ;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_12

    if-eq v8, v9, :cond_11

    goto :goto_a

    :cond_11
    int-to-long v0, v0

    .line 271
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    :cond_12
    :goto_a
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 281
    :goto_b
    iget v3, v6, Ll/ۚ᩸ܽ;->ܰ:I

    if-ge v1, v3, :cond_14

    .line 282
    invoke-virtual/range {p0 .. p0}, Ll/ۚ᩸ܽ;->ۙ()Z

    move-result v3

    if-eqz v3, :cond_13

    int-to-long v3, v1

    const-wide/16 v8, 0x14

    mul-long v3, v3, v8

    iget-wide v8, v6, Ll/ۚ᩸ܽ;->۠:J

    cmp-long v5, v3, v8

    if-gtz v5, :cond_14

    :cond_13
    add-int/lit8 v2, v2, 0x1

    shl-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_14
    rsub-int/lit8 v2, v2, 0x20

    .line 286
    iput v2, v6, Ll/ۚ᩸ܽ;->ۤۙ:I

    add-int/lit8 v2, v1, -0x1

    .line 287
    iput v2, v6, Ll/ۚ᩸ܽ;->᩷ۙ:I

    .line 1850
    new-array v2, v1, [Ll/ۗۤܽ;

    .line 289
    iput-object v2, v6, Ll/ۚ᩸ܽ;->᩸ۙ:[Ll/ۗۤܽ;

    .line 291
    div-int v2, v0, v1

    mul-int v3, v2, v1

    if-ge v3, v0, :cond_15

    add-int/lit8 v2, v2, 0x1

    :cond_15
    const/4 v0, 0x1

    const/4 v8, 0x1

    :goto_c
    if-ge v8, v2, :cond_16

    shl-int/lit8 v8, v8, 0x1

    goto :goto_c

    .line 301
    :cond_16
    invoke-virtual/range {p0 .. p0}, Ll/ۚ᩸ܽ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_18

    .line 303
    iget-wide v2, v6, Ll/ۚ᩸ܽ;->۠:J

    int-to-long v0, v1

    div-long v4, v2, v0

    const-wide/16 v9, 0x1

    add-long/2addr v4, v9

    .line 304
    rem-long v12, v2, v0

    .line 305
    :goto_d
    iget-object v14, v6, Ll/ۚ᩸ܽ;->᩸ۙ:[Ll/ۗۤܽ;

    array-length v0, v14

    if-ge v11, v0, :cond_19

    int-to-long v0, v11

    cmp-long v2, v0, v12

    if-nez v2, :cond_17

    sub-long/2addr v4, v9

    :cond_17
    move-wide v15, v4

    .line 310
    invoke-interface {v7}, Ll/ۜۙܽ;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ll/ۚ᩷ܽ;

    .line 1766
    new-instance v17, Ll/ۗۤܽ;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    move v2, v8

    move-wide v3, v15

    invoke-direct/range {v0 .. v5}, Ll/ۗۤܽ;-><init>(Ll/ۚ᩸ܽ;IJLl/ۚ᩷ܽ;)V

    .line 310
    aput-object v17, v14, v11

    add-int/lit8 v11, v11, 0x1

    move-wide v4, v15

    goto :goto_d

    .line 313
    :cond_18
    :goto_e
    iget-object v9, v6, Ll/ۚ᩸ܽ;->᩸ۙ:[Ll/ۗۤܽ;

    array-length v0, v9

    if-ge v11, v0, :cond_19

    .line 315
    invoke-interface {v7}, Ll/ۜۙܽ;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ll/ۚ᩷ܽ;

    .line 1766
    new-instance v10, Ll/ۗۤܽ;

    const-wide/16 v3, -0x1

    move-object v0, v10

    move-object/from16 v1, p0

    move v2, v8

    invoke-direct/range {v0 .. v5}, Ll/ۗۤܽ;-><init>(Ll/ۚ᩸ܽ;IJLl/ۚ᩷ܽ;)V

    .line 315
    aput-object v10, v9, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_e

    :cond_19
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 12

    .line 4169
    iget-object v0, p0, Ll/ۚ᩸ܽ;->᩸ۙ:[Ll/ۗۤܽ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_b

    aget-object v4, v0, v3

    .line 3122
    iget v5, v4, Ll/ۗۤܽ;->᩶:I

    if-eqz v5, :cond_a

    .line 3123
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 3125
    :try_start_0
    iget-object v5, v4, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v5, v5, Ll/ۚ᩸ܽ;->ᩴۙ:Ll/ܳ᩷ܽ;

    invoke-virtual {v5}, Ll/ܳ᩷ܽ;->ۙ()J

    move-result-wide v5

    .line 3374
    invoke-virtual {v4, v5, v6}, Ll/ۗۤܽ;->᩷(J)V

    .line 3128
    iget-object v5, v4, Ll/ۗۤܽ;->ۖ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v6, 0x0

    .line 3129
    :goto_1
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v7

    if-ge v6, v7, :cond_4

    .line 3130
    invoke-virtual {v5, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֫᩸ܽ;

    :goto_2
    if-eqz v7, :cond_3

    .line 3132
    invoke-interface {v7}, Ll/֫᩸ܽ;->ᩴ()Ll/ۢۤܽ;

    move-result-object v8

    invoke-interface {v8}, Ll/ۢۤܽ;->ۤ()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 3133
    invoke-interface {v7}, Ll/֫᩸ܽ;->getKey()Ljava/lang/Object;

    move-result-object v8

    .line 3134
    invoke-interface {v7}, Ll/֫᩸ܽ;->ᩴ()Ll/ۢۤܽ;

    move-result-object v9

    invoke-interface {v9}, Ll/ۢۤܽ;->get()Ljava/lang/Object;

    move-result-object v9

    if-eqz v8, :cond_1

    if-nez v9, :cond_0

    goto :goto_3

    .line 3136
    :cond_0
    sget-object v10, Ll/᩹᩸ܽ;->֡:Ll/᩹᩸ܽ;

    goto :goto_4

    :cond_1
    :goto_3
    sget-object v10, Ll/᩹᩸ܽ;->᩶:Ll/᩹᩸ܽ;

    .line 3138
    :goto_4
    invoke-interface {v7}, Ll/֫᩸ܽ;->getHash()I

    invoke-interface {v7}, Ll/֫᩸ܽ;->ᩴ()Ll/ۢۤܽ;

    move-result-object v11

    invoke-interface {v11}, Ll/ۢۤܽ;->᩷()I

    move-result v11

    .line 3137
    invoke-virtual {v4, v8, v9, v11, v10}, Ll/ۗۤܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;ILl/᩹᩸ܽ;)V

    .line 3130
    :cond_2
    invoke-interface {v7}, Ll/֫᩸ܽ;->getNext()Ll/֫᩸ܽ;

    move-result-object v7

    goto :goto_2

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    .line 3142
    :goto_5
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v7

    if-ge v6, v7, :cond_5

    const/4 v7, 0x0

    .line 3143
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    .line 2424
    :cond_5
    iget-object v5, v4, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    .line 373
    iget-object v6, v5, Ll/ۚ᩸ܽ;->ۖ:Ll/ۘۤܽ;

    sget-object v7, Ll/ۘۤܽ;->ܿ:Ll/ۘۤܽ;

    if-eq v6, v7, :cond_6

    const/4 v6, 0x1

    goto :goto_6

    :cond_6
    const/4 v6, 0x0

    :goto_6
    if-eqz v6, :cond_7

    .line 2433
    :goto_7
    iget-object v6, v4, Ll/ۗۤܽ;->ܿ:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v6}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v6

    if-eqz v6, :cond_7

    goto :goto_7

    .line 377
    :cond_7
    iget-object v5, v5, Ll/ۚ᩸ܽ;->۫ۙ:Ll/ۘۤܽ;

    sget-object v6, Ll/ۘۤܽ;->ܿ:Ll/ۘۤܽ;

    if-eq v5, v6, :cond_8

    const/4 v5, 0x1

    goto :goto_8

    :cond_8
    const/4 v5, 0x0

    :goto_8
    if-eqz v5, :cond_9

    .line 2437
    :goto_9
    iget-object v5, v4, Ll/ۗۤܽ;->۬:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v5}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v5

    if-eqz v5, :cond_9

    goto :goto_9

    .line 3146
    :cond_9
    iget-object v5, v4, Ll/ۗۤܽ;->ۙۙ:Ljava/util/AbstractQueue;

    invoke-interface {v5}, Ljava/util/Collection;->clear()V

    .line 3147
    iget-object v5, v4, Ll/ۗۤܽ;->ܰ:Ljava/util/AbstractQueue;

    invoke-interface {v5}, Ljava/util/Collection;->clear()V

    .line 3148
    iget-object v5, v4, Ll/ۗۤܽ;->ۢ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 3150
    iget v5, v4, Ll/ۗۤܽ;->ᩳ:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v4, Ll/ۗۤܽ;->ᩳ:I

    .line 3151
    iput v2, v4, Ll/ۗۤܽ;->᩶:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3153
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v4}, Ll/ۗۤܽ;->ᩴ()V

    goto :goto_a

    :catchall_0
    move-exception v0

    .line 3153
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v4}, Ll/ۗۤܽ;->ᩴ()V

    .line 3155
    throw v0

    :cond_a
    :goto_a
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method public synthetic compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ܶ֫ۗ;->$default$compute(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ܶ֫ۗ;->$default$computeIfAbsent(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ܶ֫ۗ;->$default$computeIfPresent(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 4058
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۚ᩸ܽ;->ۙ(Ljava/lang/Object;)I

    move-result v1

    .line 4059
    invoke-virtual {p0, v1}, Ll/ۚ᩸ܽ;->᩷(I)Ll/ۗۤܽ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2663
    :try_start_0
    iget v3, v2, Ll/ۗۤܽ;->᩶:I

    if-eqz v3, :cond_6

    .line 2664
    iget-object v3, v2, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v3, v3, Ll/ۚ᩸ܽ;->ᩴۙ:Ll/ܳ᩷ܽ;

    invoke-virtual {v3}, Ll/ܳ᩷ܽ;->ۙ()J

    move-result-wide v3

    .line 2629
    invoke-virtual {v2, v1, p1}, Ll/ۗۤܽ;->ۙ(ILjava/lang/Object;)Ll/֫᩸ܽ;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    goto :goto_0

    .line 2632
    :cond_1
    iget-object v5, v2, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    invoke-virtual {v5, p1, v3, v4}, Ll/ۚ᩸ܽ;->ۙ(Ll/֫᩸ܽ;J)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 2515
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_2

    .line 2517
    :try_start_1
    invoke-virtual {v2, v3, v4}, Ll/ۗۤܽ;->ۙ(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2519
    :try_start_2
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 2521
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_2
    :goto_0
    move-object p1, v1

    :cond_3
    if-nez p1, :cond_4

    .line 2674
    invoke-virtual {v2}, Ll/ۗۤܽ;->᩸()V

    return v0

    .line 2669
    :cond_4
    :try_start_3
    invoke-interface {p1}, Ll/֫᩸ܽ;->ᩴ()Ll/ۢۤܽ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۢۤܽ;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz p1, :cond_5

    const/4 v0, 0x1

    .line 2674
    :cond_5
    invoke-virtual {v2}, Ll/ۗۤܽ;->᩸()V

    return v0

    :cond_6
    invoke-virtual {v2}, Ll/ۗۤܽ;->᩸()V

    return v0

    :catchall_1
    move-exception p1

    invoke-virtual {v2}, Ll/ۗۤܽ;->᩸()V

    .line 2675
    throw p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 4074
    :cond_0
    iget-object v2, v0, Ll/ۚ᩸ܽ;->ᩴۙ:Ll/ܳ᩷ܽ;

    invoke-virtual {v2}, Ll/ܳ᩷ܽ;->ۙ()J

    move-result-wide v2

    .line 4075
    iget-object v4, v0, Ll/ۚ᩸ܽ;->᩸ۙ:[Ll/ۗۤܽ;

    const-wide/16 v5, -0x1

    const/4 v7, 0x0

    :goto_0
    const/4 v8, 0x3

    if-ge v7, v8, :cond_6

    .line 4079
    array-length v8, v4

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v8, :cond_4

    aget-object v12, v4, v11

    .line 4081
    iget v13, v12, Ll/ۗۤܽ;->᩶:I

    .line 4083
    iget-object v13, v12, Ll/ۗۤܽ;->ۖ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v14, 0x0

    .line 4084
    :goto_2
    invoke-virtual {v13}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v15

    if-ge v14, v15, :cond_3

    .line 4085
    invoke-virtual {v13, v14}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/֫᩸ܽ;

    :goto_3
    if-eqz v15, :cond_2

    move-object/from16 v16, v4

    .line 4086
    invoke-virtual {v12, v15, v2, v3}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;J)Ljava/lang/Object;

    move-result-object v4

    move-wide/from16 v17, v2

    if-eqz v4, :cond_1

    .line 4087
    iget-object v2, v0, Ll/ۚ᩸ܽ;->ܳۙ:Ll/۫ۙܽ;

    invoke-virtual {v2, v1, v4}, Ll/۫ۙܽ;->᩷(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v1, 0x1

    return v1

    .line 4085
    :cond_1
    invoke-interface {v15}, Ll/֫᩸ܽ;->getNext()Ll/֫᩸ܽ;

    move-result-object v15

    move-object/from16 v4, v16

    move-wide/from16 v2, v17

    goto :goto_3

    :cond_2
    move-wide/from16 v17, v2

    move-object/from16 v16, v4

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    :cond_3
    move-wide/from16 v17, v2

    move-object/from16 v16, v4

    .line 4092
    iget v2, v12, Ll/ۗۤܽ;->ᩳ:I

    int-to-long v2, v2

    add-long/2addr v9, v2

    add-int/lit8 v11, v11, 0x1

    move-wide/from16 v2, v17

    goto :goto_1

    :cond_4
    move-wide/from16 v17, v2

    move-object/from16 v16, v4

    const/4 v2, 0x0

    cmp-long v3, v9, v5

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v7, v7, 0x1

    move-wide v5, v9

    move-object/from16 v4, v16

    move-wide/from16 v2, v17

    goto :goto_0

    :cond_6
    const/4 v2, 0x0

    :goto_4
    return v2
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 4211
    iget-object v0, p0, Ll/ۚ᩸ܽ;->֡:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 4213
    new-instance v0, Ll/ۤۤܽ;

    invoke-direct {v0, p0}, Ll/ۤۤܽ;-><init>(Ll/ۚ᩸ܽ;)V

    iput-object v0, p0, Ll/ۚ᩸ܽ;->֡:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public synthetic forEach(Ljava/util/function/BiConsumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܶ֫ۗ;->$default$forEach(Ljava/util/concurrent/ConcurrentMap;Ljava/util/function/BiConsumer;)V

    return-void
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 3873
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۚ᩸ܽ;->ۙ(Ljava/lang/Object;)I

    move-result v4

    .line 3874
    invoke-virtual {p0, v4}, Ll/ۚ᩸ܽ;->᩷(I)Ll/ۗۤܽ;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2086
    :try_start_0
    iget v1, v9, Ll/ۗۤܽ;->᩶:I

    if-eqz v1, :cond_6

    .line 2087
    iget-object v1, v9, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v1, v1, Ll/ۚ᩸ܽ;->ᩴۙ:Ll/ܳ᩷ܽ;

    invoke-virtual {v1}, Ll/ܳ᩷ܽ;->ۙ()J

    move-result-wide v6

    .line 2629
    invoke-virtual {v9, v4, p1}, Ll/ۗۤܽ;->ۙ(ILjava/lang/Object;)Ll/֫᩸ܽ;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 2632
    :cond_1
    iget-object v1, v9, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    invoke-virtual {v1, p1, v6, v7}, Ll/ۚ᩸ܽ;->ۙ(Ll/֫᩸ܽ;J)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2515
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_2

    .line 2517
    :try_start_1
    invoke-virtual {v9, v6, v7}, Ll/ۗۤܽ;->ۙ(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2519
    :try_start_2
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 2521
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_2
    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_3
    move-object v2, p1

    :goto_1
    if-nez v2, :cond_4

    .line 2102
    invoke-virtual {v9}, Ll/ۗۤܽ;->᩸()V

    return-object v0

    .line 2093
    :cond_4
    :try_start_3
    invoke-interface {v2}, Ll/֫᩸ܽ;->ᩴ()Ll/ۢۤܽ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۢۤܽ;->get()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 2095
    invoke-virtual {v9, v2, v6, v7}, Ll/ۗۤܽ;->ۤ(Ll/֫᩸ܽ;J)V

    .line 2096
    invoke-interface {v2}, Ll/֫᩸ܽ;->getKey()Ljava/lang/Object;

    move-result-object v3

    iget-object p1, v9, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v8, p1, Ll/ۚ᩸ܽ;->᩶:Ll/᩵᩷ܽ;

    move-object v1, v9

    invoke-virtual/range {v1 .. v8}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;Ljava/lang/Object;ILjava/lang/Object;JLl/᩵᩷ܽ;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 2102
    invoke-virtual {v9}, Ll/ۗۤܽ;->᩸()V

    return-object p1

    .line 2098
    :cond_5
    :try_start_4
    invoke-virtual {v9}, Ll/ۗۤܽ;->ܳ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 2102
    :cond_6
    invoke-virtual {v9}, Ll/ۗۤܽ;->᩸()V

    return-object v0

    :catchall_1
    move-exception p1

    invoke-virtual {v9}, Ll/ۗۤܽ;->᩸()V

    .line 2103
    throw p1
.end method

.method public final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3896
    invoke-virtual {p0, p1}, Ll/ۚ᩸ܽ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method public final isEmpty()Z
    .locals 11

    .line 3833
    iget-object v0, p0, Ll/ۚ᩸ܽ;->᩸ۙ:[Ll/ۗۤܽ;

    .line 3834
    array-length v1, v0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v6, v2

    :goto_0
    if-ge v5, v1, :cond_1

    aget-object v8, v0, v5

    .line 3835
    iget v9, v8, Ll/ۗۤܽ;->᩶:I

    if-eqz v9, :cond_0

    return v4

    .line 3838
    :cond_0
    iget v8, v8, Ll/ۗۤܽ;->ᩳ:I

    int-to-long v8, v8

    add-long/2addr v6, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    cmp-long v5, v6, v2

    if-eqz v5, :cond_5

    .line 3842
    array-length v5, v0

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v5, :cond_3

    aget-object v9, v0, v8

    .line 3843
    iget v10, v9, Ll/ۗۤܽ;->᩶:I

    if-eqz v10, :cond_2

    return v4

    .line 3846
    :cond_2
    iget v9, v9, Ll/ۗۤܽ;->ᩳ:I

    int-to-long v9, v9

    sub-long/2addr v6, v9

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_3
    cmp-long v0, v6, v2

    if-nez v0, :cond_4

    return v1

    :cond_4
    return v4

    :cond_5
    return v1
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 4186
    iget-object v0, p0, Ll/ۚ᩸ܽ;->ۡ:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 4188
    new-instance v0, Ll/ܳۤܽ;

    invoke-direct {v0, p0}, Ll/ܳۤܽ;-><init>(Ll/ۚ᩸ܽ;)V

    iput-object v0, p0, Ll/ۚ᩸ܽ;->ۡ:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public synthetic merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/ܶ֫ۗ;->$default$merge(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 957
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4107
    invoke-virtual {p0, p1}, Ll/ۚ᩸ܽ;->ۙ(Ljava/lang/Object;)I

    move-result v0

    .line 4108
    invoke-virtual {p0, v0}, Ll/ۚ᩸ܽ;->᩷(I)Ll/ۗۤܽ;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, p2, v2}, Ll/ۗۤܽ;->ۙ(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 2

    .line 4121
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 4122
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Ll/ۚ᩸ܽ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 957
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4115
    invoke-virtual {p0, p1}, Ll/ۚ᩸ܽ;->ۙ(Ljava/lang/Object;)I

    move-result v0

    .line 4116
    invoke-virtual {p0, v0}, Ll/ۚ᩸ܽ;->᩷(I)Ll/ۗۤܽ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, p2, v2}, Ll/ۗۤܽ;->ۙ(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 4132
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۚ᩸ܽ;->ۙ(Ljava/lang/Object;)I

    move-result v1

    .line 4133
    invoke-virtual {p0, v1}, Ll/ۚ᩸ܽ;->᩷(I)Ll/ۗۤܽ;

    move-result-object v9

    .line 2969
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 2971
    :try_start_0
    iget-object v2, v9, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v2, v2, Ll/ۚ᩸ܽ;->ᩴۙ:Ll/ܳ᩷ܽ;

    invoke-virtual {v2}, Ll/ܳ᩷ܽ;->ۙ()J

    move-result-wide v2

    .line 3374
    invoke-virtual {v9, v2, v3}, Ll/ۗۤܽ;->᩷(J)V

    .line 2975
    iget-object v10, v9, Ll/ۗۤܽ;->ۖ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2976
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    and-int v11, v1, v2

    .line 2977
    invoke-virtual {v10, v11}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ll/֫᩸ܽ;

    move-object v4, v3

    :goto_0
    if-eqz v4, :cond_3

    .line 2980
    invoke-interface {v4}, Ll/֫᩸ܽ;->getKey()Ljava/lang/Object;

    move-result-object v5

    .line 2981
    invoke-interface {v4}, Ll/֫᩸ܽ;->getHash()I

    move-result v2

    if-ne v2, v1, :cond_2

    if-eqz v5, :cond_2

    iget-object v2, v9, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v2, v2, Ll/ۚ᩸ܽ;->֨:Ll/۫ۙܽ;

    .line 2983
    invoke-virtual {v2, p1, v5}, Ll/۫ۙܽ;->᩷(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2984
    invoke-interface {v4}, Ll/֫᩸ܽ;->ᩴ()Ll/ۢۤܽ;

    move-result-object v7

    .line 2985
    invoke-interface {v7}, Ll/ۢۤܽ;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2989
    sget-object v0, Ll/᩹᩸ܽ;->֡:Ll/᩹᩸ܽ;

    :goto_1
    move-object v8, v0

    goto :goto_2

    .line 2990
    :cond_1
    invoke-interface {v7}, Ll/ۢۤܽ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2991
    sget-object v0, Ll/᩹᩸ܽ;->᩶:Ll/᩹᩸ܽ;

    goto :goto_1

    .line 2997
    :goto_2
    iget v0, v9, Ll/ۗۤܽ;->ᩳ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v9, Ll/ۗۤܽ;->ᩳ:I

    move-object v2, v9

    move-object v6, p1

    .line 2999
    invoke-virtual/range {v2 .. v8}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;Ll/֫᩸ܽ;Ljava/lang/Object;Ljava/lang/Object;Ll/ۢۤܽ;Ll/᩹᩸ܽ;)Ll/֫᩸ܽ;

    move-result-object v0

    .line 3000
    iget v1, v9, Ll/ۗۤܽ;->᩶:I

    add-int/lit8 v1, v1, -0x1

    .line 3001
    invoke-virtual {v10, v11, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3002
    iput v1, v9, Ll/ۗۤܽ;->᩶:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3009
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v9}, Ll/ۗۤܽ;->ᩴ()V

    return-object p1

    .line 2979
    :cond_2
    :try_start_1
    invoke-interface {v4}, Ll/֫᩸ܽ;->getNext()Ll/֫᩸ܽ;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 3009
    :cond_3
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v9}, Ll/ۗۤܽ;->ᩴ()V

    return-object v0

    :catchall_0
    move-exception p1

    .line 3009
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v9}, Ll/ۗۤܽ;->ᩴ()V

    .line 3011
    throw p1
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 12

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    if-nez p2, :cond_0

    goto/16 :goto_3

    .line 4142
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۚ᩸ܽ;->ۙ(Ljava/lang/Object;)I

    move-result v1

    .line 4143
    invoke-virtual {p0, v1}, Ll/ۚ᩸ܽ;->᩷(I)Ll/ۗۤܽ;

    move-result-object v9

    .line 3015
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 3017
    :try_start_0
    iget-object v2, v9, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v2, v2, Ll/ۚ᩸ܽ;->ᩴۙ:Ll/ܳ᩷ܽ;

    invoke-virtual {v2}, Ll/ܳ᩷ܽ;->ۙ()J

    move-result-wide v2

    .line 3374
    invoke-virtual {v9, v2, v3}, Ll/ۗۤܽ;->᩷(J)V

    .line 3021
    iget-object v10, v9, Ll/ۗۤܽ;->ۖ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3022
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    and-int v11, v1, v2

    .line 3023
    invoke-virtual {v10, v11}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ll/֫᩸ܽ;

    move-object v4, v3

    :goto_0
    if-eqz v4, :cond_3

    .line 3026
    invoke-interface {v4}, Ll/֫᩸ܽ;->getKey()Ljava/lang/Object;

    move-result-object v5

    .line 3027
    invoke-interface {v4}, Ll/֫᩸ܽ;->getHash()I

    move-result v2

    if-ne v2, v1, :cond_2

    if-eqz v5, :cond_2

    iget-object v2, v9, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v2, v2, Ll/ۚ᩸ܽ;->֨:Ll/۫ۙܽ;

    .line 3029
    invoke-virtual {v2, p1, v5}, Ll/۫ۙܽ;->᩷(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 3030
    invoke-interface {v4}, Ll/֫᩸ܽ;->ᩴ()Ll/ۢۤܽ;

    move-result-object v7

    .line 3031
    invoke-interface {v7}, Ll/ۢۤܽ;->get()Ljava/lang/Object;

    move-result-object v6

    .line 3034
    iget-object p1, v9, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object p1, p1, Ll/ۚ᩸ܽ;->ܳۙ:Ll/۫ۙܽ;

    invoke-virtual {p1, p2, v6}, Ll/۫ۙܽ;->᩷(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3035
    sget-object p1, Ll/᩹᩸ܽ;->֡:Ll/᩹᩸ܽ;

    goto :goto_1

    :cond_1
    if-nez v6, :cond_3

    .line 3036
    invoke-interface {v7}, Ll/ۢۤܽ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 3037
    sget-object p1, Ll/᩹᩸ܽ;->᩶:Ll/᩹᩸ܽ;

    .line 3043
    :goto_1
    iget p2, v9, Ll/ۗۤܽ;->ᩳ:I

    add-int/lit8 p2, p2, 0x1

    iput p2, v9, Ll/ۗۤܽ;->ᩳ:I

    move-object v2, v9

    move-object v8, p1

    .line 3045
    invoke-virtual/range {v2 .. v8}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;Ll/֫᩸ܽ;Ljava/lang/Object;Ljava/lang/Object;Ll/ۢۤܽ;Ll/᩹᩸ܽ;)Ll/֫᩸ܽ;

    move-result-object p2

    .line 3046
    iget v1, v9, Ll/ۗۤܽ;->᩶:I

    add-int/lit8 v1, v1, -0x1

    .line 3047
    invoke-virtual {v10, v11, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3048
    iput v1, v9, Ll/ۗۤܽ;->᩶:I

    .line 3049
    sget-object p2, Ll/᩹᩸ܽ;->֡:Ll/᩹᩸ܽ;

    if-ne p1, p2, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    .line 3025
    :cond_2
    invoke-interface {v4}, Ll/֫᩸ܽ;->getNext()Ll/֫᩸ܽ;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 3055
    :cond_3
    :goto_2
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v9}, Ll/ۗۤܽ;->ᩴ()V

    return v0

    :catchall_0
    move-exception p1

    .line 3055
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v9}, Ll/ۗۤܽ;->ᩴ()V

    .line 3057
    throw p1

    :cond_4
    :goto_3
    return v0
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 957
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4163
    invoke-virtual {p0, p1}, Ll/ۚ᩸ܽ;->ۙ(Ljava/lang/Object;)I

    move-result v0

    .line 4164
    invoke-virtual {p0, v0}, Ll/ۚ᩸ܽ;->᩷(I)Ll/ۗۤܽ;

    move-result-object v8

    .line 2915
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 2917
    :try_start_0
    iget-object v1, v8, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v1, v1, Ll/ۚ᩸ܽ;->ᩴۙ:Ll/ܳ᩷ܽ;

    invoke-virtual {v1}, Ll/ܳ᩷ܽ;->ۙ()J

    move-result-wide v5

    .line 3374
    invoke-virtual {v8, v5, v6}, Ll/ۗۤܽ;->᩷(J)V

    .line 2920
    iget-object v9, v8, Ll/ۗۤܽ;->ۖ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2921
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    and-int v10, v0, v1

    .line 2922
    invoke-virtual {v9, v10}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ll/֫᩸ܽ;

    move-object v7, v2

    :goto_0
    const/4 v11, 0x0

    if-eqz v7, :cond_2

    .line 2925
    invoke-interface {v7}, Ll/֫᩸ܽ;->getKey()Ljava/lang/Object;

    move-result-object v4

    .line 2926
    invoke-interface {v7}, Ll/֫᩸ܽ;->getHash()I

    move-result v1

    if-ne v1, v0, :cond_1

    if-eqz v4, :cond_1

    iget-object v1, v8, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v1, v1, Ll/ۚ᩸ܽ;->֨:Ll/۫ۙܽ;

    .line 2928
    invoke-virtual {v1, p1, v4}, Ll/۫ۙܽ;->᩷(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2929
    invoke-interface {v7}, Ll/֫᩸ܽ;->ᩴ()Ll/ۢۤܽ;

    move-result-object v0

    .line 2930
    invoke-interface {v0}, Ll/ۢۤܽ;->get()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_0

    .line 2932
    invoke-interface {v0}, Ll/ۢۤܽ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 2935
    iget p1, v8, Ll/ۗۤܽ;->ᩳ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, v8, Ll/ۗۤܽ;->ᩳ:I

    .line 2936
    sget-object p1, Ll/᩹᩸ܽ;->᩶:Ll/᩹᩸ܽ;

    move-object v1, v8

    move-object v3, v7

    move-object v5, v12

    move-object v6, v0

    move-object v7, p1

    .line 2937
    invoke-virtual/range {v1 .. v7}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;Ll/֫᩸ܽ;Ljava/lang/Object;Ljava/lang/Object;Ll/ۢۤܽ;Ll/᩹᩸ܽ;)Ll/֫᩸ܽ;

    move-result-object p1

    .line 2945
    iget p2, v8, Ll/ۗۤܽ;->᩶:I

    add-int/lit8 p2, p2, -0x1

    .line 2946
    invoke-virtual {v9, v10, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 2947
    iput p2, v8, Ll/ۗۤܽ;->᩶:I

    goto :goto_1

    .line 2952
    :cond_0
    iget v1, v8, Ll/ۗۤܽ;->ᩳ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v8, Ll/ۗۤܽ;->ᩳ:I

    .line 2954
    invoke-interface {v0}, Ll/ۢۤܽ;->᩷()I

    move-result v0

    sget-object v1, Ll/᩹᩸ܽ;->۟:Ll/᩹᩸ܽ;

    .line 2953
    invoke-virtual {v8, p1, v12, v0, v1}, Ll/ۗۤܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;ILl/᩹᩸ܽ;)V

    move-object v1, v8

    move-object v2, v7

    move-object v3, p1

    move-object v4, p2

    .line 2955
    invoke-virtual/range {v1 .. v6}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 2956
    invoke-virtual {v8, v7}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2963
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v8}, Ll/ۗۤܽ;->ᩴ()V

    return-object v12

    .line 2924
    :cond_1
    :try_start_1
    invoke-interface {v7}, Ll/֫᩸ܽ;->getNext()Ll/֫᩸ܽ;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 2963
    :cond_2
    :goto_1
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v8}, Ll/ۗۤܽ;->ᩴ()V

    return-object v11

    :catchall_0
    move-exception p1

    .line 2963
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v8}, Ll/ۗۤܽ;->ᩴ()V

    .line 2965
    throw p1
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 957
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 4154
    :cond_0
    invoke-virtual/range {p0 .. p1}, Ll/ۚ᩸ܽ;->ۙ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v7, p0

    .line 4155
    invoke-virtual {v7, v3}, Ll/ۚ᩸ܽ;->᩷(I)Ll/ۗۤܽ;

    move-result-object v15

    .line 2854
    invoke-virtual {v15}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 2856
    :try_start_0
    iget-object v4, v15, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v4, v4, Ll/ۚ᩸ܽ;->ᩴۙ:Ll/ܳ᩷ܽ;

    invoke-virtual {v4}, Ll/ܳ᩷ܽ;->ۙ()J

    move-result-wide v5

    .line 3374
    invoke-virtual {v15, v5, v6}, Ll/ۗۤܽ;->᩷(J)V

    .line 2859
    iget-object v4, v15, Ll/ۗۤܽ;->ۖ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2860
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v8

    const/16 v16, 0x1

    add-int/lit8 v8, v8, -0x1

    and-int v14, v8, v3

    .line 2861
    invoke-virtual {v4, v14}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ll/֫᩸ܽ;

    move-object v10, v9

    :goto_0
    if-eqz v10, :cond_4

    .line 2864
    invoke-interface {v10}, Ll/֫᩸ܽ;->getKey()Ljava/lang/Object;

    move-result-object v11

    .line 2865
    invoke-interface {v10}, Ll/֫᩸ܽ;->getHash()I

    move-result v8

    if-ne v8, v3, :cond_3

    if-eqz v11, :cond_3

    iget-object v8, v15, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v8, v8, Ll/ۚ᩸ܽ;->֨:Ll/۫ۙܽ;

    .line 2867
    invoke-virtual {v8, v0, v11}, Ll/۫ۙܽ;->᩷(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 2868
    invoke-interface {v10}, Ll/֫᩸ܽ;->ᩴ()Ll/ۢۤܽ;

    move-result-object v13

    .line 2869
    invoke-interface {v13}, Ll/ۢۤܽ;->get()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_1

    .line 2871
    invoke-interface {v13}, Ll/ۢۤܽ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2874
    iget v0, v15, Ll/ۗۤܽ;->ᩳ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v15, Ll/ۗۤܽ;->ᩳ:I

    .line 2875
    sget-object v0, Ll/᩹᩸ܽ;->᩶:Ll/᩹᩸ܽ;

    move-object v8, v15

    move v1, v14

    move-object v14, v0

    .line 2876
    invoke-virtual/range {v8 .. v14}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;Ll/֫᩸ܽ;Ljava/lang/Object;Ljava/lang/Object;Ll/ۢۤܽ;Ll/᩹᩸ܽ;)Ll/֫᩸ܽ;

    move-result-object v0

    .line 2884
    iget v3, v15, Ll/ۗۤܽ;->᩶:I

    add-int/lit8 v3, v3, -0x1

    .line 2885
    invoke-virtual {v4, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 2886
    iput v3, v15, Ll/ۗۤܽ;->᩶:I

    goto :goto_1

    .line 2891
    :cond_1
    iget-object v3, v15, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v3, v3, Ll/ۚ᩸ܽ;->ܳۙ:Ll/۫ۙܽ;

    invoke-virtual {v3, v1, v12}, Ll/۫ۙܽ;->᩷(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2892
    iget v1, v15, Ll/ۗۤܽ;->ᩳ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v15, Ll/ۗۤܽ;->ᩳ:I

    .line 2894
    invoke-interface {v13}, Ll/ۢۤܽ;->᩷()I

    move-result v1

    sget-object v2, Ll/᩹᩸ܽ;->۟:Ll/᩹᩸ܽ;

    .line 2893
    invoke-virtual {v15, v0, v12, v1, v2}, Ll/ۗۤܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;ILl/᩹᩸ܽ;)V

    move-object v1, v15

    move-object v2, v10

    move-object/from16 v3, p1

    move-object/from16 v4, p3

    .line 2895
    invoke-virtual/range {v1 .. v6}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 2896
    invoke-virtual {v15, v10}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2909
    invoke-virtual {v15}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v15}, Ll/ۗۤܽ;->ᩴ()V

    return v16

    :catchall_0
    move-exception v0

    goto :goto_2

    .line 2901
    :cond_2
    :try_start_1
    invoke-virtual {v15, v10, v5, v6}, Ll/ۗۤܽ;->᩷(Ll/֫᩸ܽ;J)V

    goto :goto_1

    :cond_3
    move v8, v14

    .line 2863
    invoke-interface {v10}, Ll/֫᩸ܽ;->getNext()Ll/֫᩸ܽ;

    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v14, v8

    goto :goto_0

    .line 2909
    :cond_4
    :goto_1
    invoke-virtual {v15}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v15}, Ll/ۗۤܽ;->ᩴ()V

    return v2

    .line 2909
    :goto_2
    invoke-virtual {v15}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3379
    invoke-virtual {v15}, Ll/ۗۤܽ;->ᩴ()V

    .line 2911
    throw v0
.end method

.method public synthetic replaceAll(Ljava/util/function/BiFunction;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܶ֫ۗ;->$default$replaceAll(Ljava/util/concurrent/ConcurrentMap;Ljava/util/function/BiFunction;)V

    return-void
.end method

.method public final size()I
    .locals 8

    .line 3854
    iget-object v0, p0, Ll/ۚ᩸ܽ;->᩸ۙ:[Ll/ۗۤܽ;

    .line 3856
    array-length v1, v0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_0

    aget-object v6, v0, v5

    .line 3857
    iget v6, v6, Ll/ۗۤܽ;->᩶:I

    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v2, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 3864
    :cond_0
    invoke-static {v2, v3}, Ll/ܿܺܽ;->᩷(J)I

    move-result v0

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 4198
    iget-object v0, p0, Ll/ۚ᩸ܽ;->ۚۙ:Ljava/util/Collection;

    if-nez v0, :cond_0

    .line 4200
    new-instance v0, Ll/֨ۤܽ;

    invoke-direct {v0, p0}, Ll/֨ۤܽ;-><init>(Ll/ۚ᩸ܽ;)V

    iput-object v0, p0, Ll/ۚ᩸ܽ;->ۚۙ:Ljava/util/Collection;

    :cond_0
    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;)I
    .locals 2

    .line 1729
    iget-object v0, p0, Ll/ۚ᩸ܽ;->֨:Ll/۫ۙܽ;

    invoke-virtual {v0, p1}, Ll/۫ۙܽ;->᩷(Ljava/lang/Object;)I

    move-result p1

    shl-int/lit8 v0, p1, 0xf

    xor-int/lit16 v0, v0, -0x3283

    add-int/2addr p1, v0

    ushr-int/lit8 v0, p1, 0xa

    xor-int/2addr p1, v0

    shl-int/lit8 v0, p1, 0x3

    add-int/2addr p1, v0

    ushr-int/lit8 v0, p1, 0x6

    xor-int/2addr p1, v0

    shl-int/lit8 v0, p1, 0x2

    shl-int/lit8 v1, p1, 0xe

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    ushr-int/lit8 p1, v0, 0x10

    xor-int/2addr p1, v0

    return p1
.end method

.method public final ۙ(Ljava/lang/Object;Ll/᩵᩷ܽ;)Ljava/lang/Object;
    .locals 9

    .line 957
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3879
    invoke-virtual {p0, p1}, Ll/ۚ᩸ܽ;->ۙ(Ljava/lang/Object;)I

    move-result v3

    .line 3880
    invoke-virtual {p0, v3}, Ll/ۚ᩸ܽ;->᩷(I)Ll/ۗۤܽ;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 957
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2051
    :try_start_0
    iget v0, v8, Ll/ۗۤܽ;->᩶:I

    if-eqz v0, :cond_1

    .line 2053
    invoke-virtual {v8, v3, p1}, Ll/ۗۤܽ;->ۙ(ILjava/lang/Object;)Ll/֫᩸ܽ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 2055
    iget-object v0, v8, Ll/ۗۤܽ;->֡:Ll/ۚ᩸ܽ;

    iget-object v0, v0, Ll/ۚ᩸ܽ;->ᩴۙ:Ll/ܳ᩷ܽ;

    invoke-virtual {v0}, Ll/ܳ᩷ܽ;->ۙ()J

    move-result-wide v5

    .line 2056
    invoke-virtual {v8, v1, v5, v6}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;J)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 2058
    invoke-virtual {v8, v1, v5, v6}, Ll/ۗۤܽ;->ۤ(Ll/֫᩸ܽ;J)V

    .line 2059
    iget-object v0, v8, Ll/ۗۤܽ;->ۡ:Ll/ۚ᩷ܽ;

    invoke-interface {v0}, Ll/ۚ᩷ܽ;->ۤ()V

    move-object v0, v8

    move-object v2, p1

    move-object v7, p2

    .line 2060
    invoke-virtual/range {v0 .. v7}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;Ljava/lang/Object;ILjava/lang/Object;JLl/᩵᩷ܽ;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2080
    invoke-virtual {v8}, Ll/ۗۤܽ;->᩸()V

    return-object p1

    .line 2062
    :cond_0
    :try_start_1
    invoke-interface {v1}, Ll/֫᩸ܽ;->ᩴ()Ll/ۢۤܽ;

    move-result-object v0

    .line 2063
    invoke-interface {v0}, Ll/ۢۤܽ;->ۙ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2064
    invoke-virtual {v8, v1, p1, v0}, Ll/ۗۤܽ;->ۙ(Ll/֫᩸ܽ;Ljava/lang/Object;Ll/ۢۤܽ;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2080
    invoke-virtual {v8}, Ll/ۗۤܽ;->᩸()V

    return-object p1

    .line 2070
    :cond_1
    :try_start_2
    invoke-virtual {v8, p1, v3, p2}, Ll/ۗۤܽ;->ۙ(Ljava/lang/Object;ILl/᩵᩷ܽ;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 2080
    invoke-virtual {v8}, Ll/ۗۤܽ;->᩸()V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2072
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    .line 2073
    instance-of v0, p2, Ljava/lang/Error;

    if-nez v0, :cond_3

    .line 2075
    instance-of v0, p2, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_2

    .line 2076
    new-instance p1, Ll/۟ܽܽ;

    .line 91
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 2076
    throw p1

    .line 2078
    :cond_2
    throw p1

    .line 2074
    :cond_3
    new-instance p1, Ll/ܽܽܽ;

    check-cast p2, Ljava/lang/Error;

    .line 86
    invoke-direct {p1, p2}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    .line 2074
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2080
    :goto_0
    invoke-virtual {v8}, Ll/ۗۤܽ;->᩸()V

    .line 2081
    throw p1
.end method

.method public final ۙ()Z
    .locals 5

    .line 321
    iget-wide v0, p0, Ll/ۚ᩸ܽ;->۠:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۙ(Ll/֫᩸ܽ;J)Z
    .locals 6

    .line 957
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1795
    invoke-virtual {p0}, Ll/ۚ᩸ܽ;->᩷()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll/֫᩸ܽ;->᩻()J

    move-result-wide v2

    sub-long v2, p2, v2

    iget-wide v4, p0, Ll/ۚ᩸ܽ;->۟:J

    cmp-long v0, v2, v4

    if-ltz v0, :cond_0

    return v1

    .line 1798
    :cond_0
    invoke-virtual {p0}, Ll/ۚ᩸ܽ;->᩸()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ll/֫᩸ܽ;->ۧ()J

    move-result-wide v2

    sub-long/2addr p2, v2

    iget-wide v2, p0, Ll/ۚ᩸ܽ;->ᩳ:J

    cmp-long p1, p2, v2

    if-ltz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷(I)Ll/ۗۤܽ;
    .locals 1

    .line 1761
    iget v0, p0, Ll/ۚ᩸ܽ;->ۤۙ:I

    ushr-int/2addr p1, v0

    iget v0, p0, Ll/ۚ᩸ܽ;->᩷ۙ:I

    and-int/2addr p1, v0

    iget-object v0, p0, Ll/ۚ᩸ܽ;->᩸ۙ:[Ll/ۗۤܽ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ᩷()Z
    .locals 5

    .line 337
    iget-wide v0, p0, Ll/ۚ᩸ܽ;->۟:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩸()Z
    .locals 5

    .line 333
    iget-wide v0, p0, Ll/ۚ᩸ܽ;->ᩳ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.class public final Ll/۟ۙܳ;
.super Ljava/lang/Object;
.source "FIQP"


# instance fields
.field public ۙ:Ll/֡ۙܳ;

.field public ۤ:Ll/֨ۙܳ;

.field public ᩷:J

.field public final ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 527
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 528
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۟ۙܳ;->᩸:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ۙ(IIIII)V
    .locals 19

    move-object/from16 v0, p0

    if-nez p4, :cond_0

    if-nez p5, :cond_0

    return-void

    .line 536
    :cond_0
    iget-object v1, v0, Ll/۟ۙܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const v3, 0x186a0

    const/4 v4, 0x1

    if-lt v2, v3, :cond_1

    .line 0
    invoke-static {v1, v4}, Ll/ܿ֫᩸;->ۙ(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    .line 537
    check-cast v2, Ll/ۡۙܳ;

    .line 538
    iget-wide v5, v2, Ll/ۡۙܳ;->۫:J

    iput-wide v5, v0, Ll/۟ۙܳ;->᩷:J

    .line 539
    iget v3, v2, Ll/ۡۙܳ;->ۤ:I

    iget v5, v2, Ll/ۡۙܳ;->ᩴ:I

    iget v6, v2, Ll/ۡۙܳ;->᩸:I

    add-int v6, p4, v6

    iget v2, v2, Ll/ۡۙܳ;->ܳ:I

    add-int v2, p5, v2

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    move/from16 v7, p1

    move/from16 v3, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v2, p5

    :goto_0
    const/4 v8, 0x2

    const/4 v9, 0x3

    if-nez v6, :cond_2

    const/4 v7, 0x3

    goto :goto_1

    :cond_2
    if-nez v2, :cond_3

    const/4 v7, 0x2

    .line 545
    :cond_3
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_5

    .line 0
    invoke-static {v1, v4}, Lcom/umeng/analytics/pro/j$$ExternalSyntheticOutline0;->m(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v10

    .line 546
    check-cast v10, Ll/ۡۙܳ;

    .line 547
    iget v11, v10, Ll/ۡۙܳ;->᩷:I

    iget v12, v10, Ll/ۡۙܳ;->ܳ:I

    iget v13, v10, Ll/ۡۙܳ;->ᩴ:I

    iget v14, v10, Ll/ۡۙܳ;->᩸:I

    iget v15, v10, Ll/ۡۙܳ;->ۤ:I

    if-ne v11, v7, :cond_5

    add-int v11, v15, v14

    if-ne v11, v3, :cond_5

    add-int v11, v13, v12

    if-ne v11, v5, :cond_5

    if-eqz v7, :cond_4

    if-eq v7, v8, :cond_4

    if-eq v7, v9, :cond_4

    if-ne v14, v12, :cond_5

    if-ne v6, v2, :cond_5

    .line 0
    :cond_4
    invoke-static {v1, v4}, Ll/ۖܶ᩸;->ۙ(Ljava/util/ArrayList;I)V

    .line 551
    iget-wide v3, v10, Ll/ۡۙܳ;->۫:J

    iput-wide v3, v0, Ll/۟ۙܳ;->᩷:J

    add-int/2addr v6, v14

    add-int/2addr v2, v12

    move v12, v15

    goto :goto_2

    :cond_5
    move v12, v3

    move v13, v5

    .line 555
    :goto_2
    new-instance v3, Ll/ۡۙܳ;

    iget-wide v4, v0, Ll/۟ۙܳ;->᩷:J

    move-object v10, v3

    move v11, v7

    move v14, v6

    move v15, v2

    move-wide/from16 v16, v4

    move/from16 v18, v7

    .line 35
    invoke-direct/range {v10 .. v18}, Ll/ۡۙܳ;-><init>(IIIIIJI)V

    .line 555
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 556
    iget-wide v3, v0, Ll/۟ۙܳ;->᩷:J

    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-long v1, v1

    add-long/2addr v3, v1

    iput-wide v3, v0, Ll/۟ۙܳ;->᩷:J

    return-void
.end method

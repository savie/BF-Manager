.class public final Ll/᩶ܳܳ;
.super Ljava/lang/Object;
.source "D70T"


# instance fields
.field public final ֫:J

.field public ۙ:Ll/ܰᩴܳ;

.field public ۚ:Ll/ܶܳܳ;

.field public final ۤ:J

.field public final ۧ:J

.field public final ۫:J

.field public final ܳ:J

.field public final ܺ:Ll/۬۫ܳ;

.field public final ᩴ:J

.field public final ᩷:Z

.field public final ᩸:Ll/ܺᩴܳ;

.field public final ᩻:J


# direct methods
.method public synthetic constructor <init>(Ll/۬۫ܳ;Ll/ܺᩴܳ;JJJJJJLl/ܶܳܳ;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move-wide/from16 v12, p11

    move-wide/from16 v14, p13

    move-object/from16 v16, p15

    const/4 v3, 0x1

    .line 0
    invoke-direct/range {v0 .. v16}, Ll/᩶ܳܳ;-><init>(Ll/۬۫ܳ;Ll/ܺᩴܳ;ZJJJJJJLl/ܶܳܳ;)V

    return-void
.end method

.method public constructor <init>(Ll/۬۫ܳ;Ll/ܺᩴܳ;ZJJJJJJ)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-wide/from16 v10, p10

    move-wide/from16 v12, p12

    move-wide/from16 v14, p14

    const/16 v16, 0x0

    .line 5227
    invoke-direct/range {v0 .. v16}, Ll/᩶ܳܳ;-><init>(Ll/۬۫ܳ;Ll/ܺᩴܳ;ZJJJJJJLl/ܶܳܳ;)V

    return-void
.end method

.method public constructor <init>(Ll/۬۫ܳ;Ll/ܺᩴܳ;ZJJJJJJLl/ܶܳܳ;)V
    .locals 9

    move-object v0, p0

    move-wide/from16 v1, p8

    move-wide/from16 v3, p10

    .line 5236
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v5, p1

    .line 5237
    iput-object v5, v0, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    move-object v6, p2

    .line 5238
    iput-object v6, v0, Ll/᩶ܳܳ;->᩸:Ll/ܺᩴܳ;

    move v7, p3

    .line 5239
    iput-boolean v7, v0, Ll/᩶ܳܳ;->᩷:Z

    move-wide v7, p4

    .line 5240
    iput-wide v7, v0, Ll/᩶ܳܳ;->ܳ:J

    move-wide v7, p6

    .line 5241
    iput-wide v7, v0, Ll/᩶ܳܳ;->ۤ:J

    .line 5242
    iput-wide v1, v0, Ll/᩶ܳܳ;->۫:J

    .line 5243
    iput-wide v3, v0, Ll/᩶ܳܳ;->֫:J

    move-wide/from16 v7, p12

    .line 5244
    iput-wide v7, v0, Ll/᩶ܳܳ;->ۧ:J

    move-wide/from16 v7, p14

    .line 5245
    iput-wide v7, v0, Ll/᩶ܳܳ;->ᩴ:J

    move-object/from16 v7, p16

    .line 5246
    iput-object v7, v0, Ll/᩶ܳܳ;->ۚ:Ll/ܶܳܳ;

    .line 5249
    invoke-static {p1}, Ll/ᩴۚܳ;->ܳ(Ll/۬۫ܳ;)J

    move-result-wide v7

    .line 5248
    invoke-static {v1, v2, v7, v8}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v1

    .line 5250
    invoke-static {p1}, Ll/ᩴۚܳ;->ܽ(Ll/۬۫ܳ;)J

    move-result-wide v7

    invoke-static {v1, v2, v7, v8}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v1

    .line 5251
    invoke-static {v1, v2, v3, v4}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v1

    .line 5252
    invoke-static {p2}, Ll/᩵ᩴܳ;->ܳ(Ll/ܺᩴܳ;)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v1

    iput-wide v1, v0, Ll/᩶ܳܳ;->᩻:J

    return-void
.end method


# virtual methods
.method public final ۙ()I
    .locals 1

    .line 45
    iget-object v0, p0, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Ll/۬۫ܳ;->۫:I

    return v0
.end method

.method public final ۙ(J)Ll/᩶ܳܳ;
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v5, p1

    .line 5260
    new-instance v13, Ll/᩶ܳܳ;

    move-object v1, v13

    iget-wide v2, v0, Ll/᩶ܳܳ;->ᩴ:J

    move-wide v15, v2

    iget-object v2, v0, Ll/᩶ܳܳ;->ۚ:Ll/ܶܳܳ;

    move-object/from16 v17, v2

    iget-object v2, v0, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    iget-object v3, v0, Ll/᩶ܳܳ;->᩸:Ll/ܺᩴܳ;

    iget-boolean v4, v0, Ll/᩶ܳܳ;->᩷:Z

    iget-wide v7, v0, Ll/᩶ܳܳ;->ۤ:J

    iget-wide v9, v0, Ll/᩶ܳܳ;->۫:J

    iget-wide v11, v0, Ll/᩶ܳܳ;->֫:J

    move-object/from16 p1, v13

    iget-wide v13, v0, Ll/᩶ܳܳ;->ۧ:J

    move-object/from16 v18, p1

    invoke-direct/range {v1 .. v17}, Ll/᩶ܳܳ;-><init>(Ll/۬۫ܳ;Ll/ܺᩴܳ;ZJJJJJJLl/ܶܳܳ;)V

    .line 5264
    iget-object v1, v0, Ll/᩶ܳܳ;->ۙ:Ll/ܰᩴܳ;

    move-object/from16 v2, v18

    iput-object v1, v2, Ll/᩶ܳܳ;->ۙ:Ll/ܰᩴܳ;

    return-object v2
.end method

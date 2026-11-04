.class public final Ll/᩵ܶۚ;
.super Ljava/lang/Object;
.source "G7AI"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۙ:Ljava/lang/String;

.field public final ۚ:Z

.field public final ۤ:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ۫:Ljava/lang/String;

.field public final ܳ:Z

.field public final ᩴ:Ljava/lang/String;

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Ljava/lang/String;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2532
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2533
    iput-object p1, p0, Ll/᩵ܶۚ;->᩻:Ljava/lang/String;

    .line 2534
    iput-object p2, p0, Ll/᩵ܶۚ;->֫:Ljava/lang/String;

    .line 2535
    iput-boolean p3, p0, Ll/᩵ܶۚ;->ܳ:Z

    .line 2536
    iput-boolean p4, p0, Ll/᩵ܶۚ;->ۚ:Z

    .line 2537
    iput-object p5, p0, Ll/᩵ܶۚ;->ۧ:Ljava/lang/String;

    .line 2538
    iput-object p6, p0, Ll/᩵ܶۚ;->ᩴ:Ljava/lang/String;

    .line 2539
    iput-object p7, p0, Ll/᩵ܶۚ;->ۙ:Ljava/lang/String;

    .line 2540
    iput-object p8, p0, Ll/᩵ܶۚ;->۫:Ljava/lang/String;

    .line 2541
    iput-object p9, p0, Ll/᩵ܶۚ;->᩷:Ljava/lang/String;

    .line 2542
    iput-object p10, p0, Ll/᩵ܶۚ;->᩸:Ljava/lang/String;

    .line 2543
    iput-object p11, p0, Ll/᩵ܶۚ;->ۤ:Ljava/lang/String;

    return-void
.end method

.method public static ۙ(Ll/ۗܶۚ;Ll/ۗܶۚ;Ljava/lang/String;Ljava/lang/String;)Ll/᩵ܶۚ;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-nez v1, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 2518
    :goto_0
    new-instance v15, Ll/᩵ܶۚ;

    iget-object v4, v0, Ll/ۗܶۚ;->ۛ:Ljava/lang/String;

    iget-object v5, v0, Ll/ۗܶۚ;->᩹:Ljava/lang/String;

    iget-boolean v6, v2, Ll/ۗܶۚ;->֫:Z

    iget-boolean v7, v2, Ll/ۗܶۚ;->ܽ:Z

    iget-object v10, v2, Ll/ۗܶۚ;->ۤ:Ljava/lang/String;

    iget-object v11, v2, Ll/ۗܶۚ;->ۧ:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez v1, :cond_1

    move-object v12, v0

    goto :goto_1

    .line 2520
    :cond_1
    iget-object v2, v1, Ll/ۗܶۚ;->ܳ:Ljava/lang/String;

    move-object v12, v2

    :goto_1
    if-nez v1, :cond_2

    move-object v13, v0

    goto :goto_2

    .line 2521
    :cond_2
    iget-object v2, v1, Ll/ۗܶۚ;->᩹:Ljava/lang/String;

    move-object v13, v2

    :goto_2
    if-nez v1, :cond_3

    :goto_3
    move-object v14, v0

    goto :goto_4

    .line 2522
    :cond_3
    iget-object v0, v1, Ll/ۗܶۚ;->۫:Ljava/lang/String;

    goto :goto_3

    :goto_4
    move-object v3, v15

    move-object/from16 v8, p3

    move-object/from16 v9, p2

    invoke-direct/range {v3 .. v14}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v15
.end method

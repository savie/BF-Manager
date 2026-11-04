.class public final Ll/֫۫;
.super Ll/ۘ۫;
.source "Y22J"


# instance fields
.field public ۙۙ:Ll/ۖۗ;

.field public ᩷ۙ:Ll/ᩳۗ;


# direct methods
.method public constructor <init>(Ll/֫۫;Ll/ܶ۫;Landroid/content/res/Resources;)V
    .locals 0

    .line 328
    invoke-direct {p0, p1, p2, p3}, Ll/᩵۫;-><init>(Ll/ۘ۫;Ll/ܰ۫;Landroid/content/res/Resources;)V

    if-eqz p1, :cond_0

    .line 331
    iget-object p2, p1, Ll/ۘ۫;->۬:[[I

    iput-object p2, p0, Ll/ۘ۫;->۬:[[I

    goto :goto_0

    .line 795
    :cond_0
    iget-object p2, p0, Ll/᩵۫;->᩺:[Landroid/graphics/drawable/Drawable;

    array-length p2, p2

    .line 333
    new-array p2, p2, [[I

    iput-object p2, p0, Ll/ۘ۫;->۬:[[I

    :goto_0
    if-eqz p1, :cond_1

    .line 636
    iget-object p2, p1, Ll/֫۫;->᩷ۙ:Ll/ᩳۗ;

    iput-object p2, p0, Ll/֫۫;->᩷ۙ:Ll/ᩳۗ;

    .line 637
    iget-object p1, p1, Ll/֫۫;->ۙۙ:Ll/ۖۗ;

    iput-object p1, p0, Ll/֫۫;->ۙۙ:Ll/ۖۗ;

    return-void

    .line 639
    :cond_1
    new-instance p1, Ll/ᩳۗ;

    invoke-direct {p1}, Ll/ᩳۗ;-><init>()V

    iput-object p1, p0, Ll/֫۫;->᩷ۙ:Ll/ᩳۗ;

    .line 640
    new-instance p1, Ll/ۖۗ;

    invoke-direct {p1}, Ll/ۖۗ;-><init>()V

    iput-object p1, p0, Ll/֫۫;->ۙۙ:Ll/ۖۗ;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 701
    new-instance v0, Ll/ܶ۫;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ܶ۫;-><init>(Ll/֫۫;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public final newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 707
    new-instance v0, Ll/ܶ۫;

    invoke-direct {v0, p0, p1}, Ll/ܶ۫;-><init>(Ll/֫۫;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public final ۙ(IILandroid/graphics/drawable/Drawable;Z)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    .line 651
    invoke-virtual {v0, v1}, Ll/᩵۫;->ۙ(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    move/from16 v2, p1

    int-to-long v2, v2

    const/16 v4, 0x20

    shl-long v5, v2, v4

    move/from16 v7, p2

    int-to-long v7, v7

    or-long/2addr v5, v7

    if-eqz p4, :cond_0

    const-wide v9, 0x200000000L

    goto :goto_0

    :cond_0
    const-wide/16 v9, 0x0

    .line 657
    :goto_0
    iget-object v11, v0, Ll/֫۫;->᩷ۙ:Ll/ᩳۗ;

    int-to-long v12, v1

    or-long v14, v12, v9

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-virtual {v11, v5, v6, v14}, Ll/ᩳۗ;->ۙ(JLjava/lang/Long;)V

    if-eqz p4, :cond_1

    shl-long v4, v7, v4

    or-long/2addr v2, v4

    .line 660
    iget-object v4, v0, Ll/֫۫;->᩷ۙ:Ll/ᩳۗ;

    const-wide v5, 0x100000000L

    or-long/2addr v5, v12

    or-long/2addr v5, v9

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v2, v3, v5}, Ll/ᩳۗ;->ۙ(JLjava/lang/Long;)V

    :cond_1
    return v1
.end method

.method public final ᩴ()V
    .locals 1

    .line 646
    iget-object v0, p0, Ll/֫۫;->᩷ۙ:Ll/ᩳۗ;

    invoke-virtual {v0}, Ll/ᩳۗ;->clone()Ll/ᩳۗ;

    move-result-object v0

    iput-object v0, p0, Ll/֫۫;->᩷ۙ:Ll/ᩳۗ;

    .line 647
    iget-object v0, p0, Ll/֫۫;->ۙۙ:Ll/ۖۗ;

    invoke-virtual {v0}, Ll/ۖۗ;->clone()Ll/ۖۗ;

    move-result-object v0

    iput-object v0, p0, Ll/֫۫;->ۙۙ:Ll/ۖۗ;

    return-void
.end method

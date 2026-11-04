.class public final Ll/ᩳۤ۫;
.super Ljava/lang/Object;
.source "J4L7"


# instance fields
.field public ۙ:Landroid/view/View;

.field public final ۤ:Ljava/util/function/Supplier;

.field public final synthetic ۫:Ll/ۢۤ۫;

.field public final ܳ:I

.field public ᩴ:Landroid/view/View;

.field public final ᩷:Ljava/lang/String;

.field public ᩸:Ll/᩹ۖ᩸;


# direct methods
.method public constructor <init>(Ll/ۢۤ۫;ILjava/lang/String;Ljava/util/function/Supplier;)V
    .locals 0

    .line 468
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۤ۫;->۫:Ll/ۢۤ۫;

    .line 469
    iput p2, p0, Ll/ᩳۤ۫;->ܳ:I

    .line 470
    iput-object p3, p0, Ll/ᩳۤ۫;->᩷:Ljava/lang/String;

    .line 471
    iput-object p4, p0, Ll/ᩳۤ۫;->ۤ:Ljava/util/function/Supplier;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 6

    .line 496
    iget-object v0, p0, Ll/ᩳۤ۫;->۫:Ll/ۢۤ۫;

    invoke-static {v0}, Ll/ۢۤ۫;->۫(Ll/ۢۤ۫;)Ll/֡ۤ۫;

    move-result-object v1

    iget v2, p0, Ll/ᩳۤ۫;->ܳ:I

    invoke-virtual {v1, v2}, Ll/֡ۤ۫;->᩷(I)Ljava/lang/String;

    move-result-object v1

    .line 497
    invoke-static {v0}, Ll/ۢۤ۫;->۫(Ll/ۢۤ۫;)Ll/֡ۤ۫;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/֡ۤ۫;->ۤ(I)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 498
    :goto_0
    iget-object v4, p0, Ll/ᩳۤ۫;->ᩴ:Landroid/view/View;

    if-eqz v2, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    const/16 v5, 0x8

    :goto_1
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 499
    iget-object v4, p0, Ll/ᩳۤ۫;->᩸:Ll/᩹ۖ᩸;

    if-eqz v2, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    const/16 v5, 0x8

    :goto_2
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 500
    iget-object v4, p0, Ll/ᩳۤ۫;->ۙ:Landroid/view/View;

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    const/16 v3, 0x8

    :goto_3
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    if-eqz v2, :cond_5

    .line 502
    iget-object v2, p0, Ll/ᩳۤ۫;->᩸:Ll/᩹ۖ᩸;

    invoke-static {v0}, Ll/ۢۤ۫;->ۧ(Ll/ۢۤ۫;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-virtual {v2, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    :cond_5
    return-void
.end method

.method public final ۙ(IIILandroid/view/View;)V
    .locals 0

    .line 478
    invoke-virtual {p4, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ᩳۤ۫;->ᩴ:Landroid/view/View;

    .line 479
    invoke-virtual {p4, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/᩹ۖ᩸;

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ᩳۤ۫;->᩸:Ll/᩹ۖ᩸;

    .line 480
    invoke-virtual {p1}, Ll/᩹ۖ᩸;->۟᩸()V

    .line 481
    invoke-virtual {p4, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ᩳۤ۫;->ۙ:Landroid/view/View;

    .line 482
    iget-object p1, p0, Ll/ᩳۤ۫;->᩸:Ll/᩹ۖ᩸;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ll/᩺ۜ᩸;->᩻(Z)V

    .line 483
    iget-object p1, p0, Ll/ᩳۤ۫;->ۙ:Landroid/view/View;

    new-instance p2, Ll/۟ۤ۫;

    invoke-direct {p2, p0}, Ll/۟ۤ۫;-><init>(Ll/ᩳۤ۫;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 489
    invoke-virtual {p0}, Ll/ᩳۤ۫;->ۙ()V

    return-void
.end method

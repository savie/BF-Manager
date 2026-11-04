.class public abstract Ll/۬ۡ᩸;
.super Ljava/lang/Object;
.source "UAZD"


# instance fields
.field public ֡:I

.field public final ֨:I

.field public final ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ֫ۙ:Landroid/graphics/RectF;

.field public ۖ:Z

.field public ۗ:Z

.field public ۘ:Ll/ۜۙᩴ;

.field public ۙ:I

.field public final ۙۙ:Ljava/lang/Runnable;

.field public final ۚ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ۚۙ:Ll/ܰۤᩴ;

.field public final ۛ:Landroid/graphics/Rect;

.field public ۜ:Ll/ܳܿ᩸;

.field public ۟:Ll/ۜۙᩴ;

.field public ۠:I

.field public ۡ:Z

.field public ۢ:Ll/ᩳ۬᩸;

.field public volatile ۤ:Ll/ܳܿ᩸;

.field public final ۤۙ:[I

.field public final ۧ:Ll/۠ۡ᩸;

.field public final ۧۙ:Landroid/graphics/RectF;

.field public final ۨ:Landroid/graphics/Rect;

.field public ۫:I

.field public volatile ۫ۙ:Z

.field public final ۬:Ljava/lang/Object;

.field public ܰ:Ll/ܽۙᩴ;

.field public volatile ܳ:Ll/ܳۜ᩸;

.field public ܳۙ:Z

.field public final ܶ:Ll/᩸᩷ܺ;

.field public ܺ:Ll/᩺ۜ᩸;

.field public volatile ܺۙ:I

.field public final ܽ:Ll/᩸᩷ܺ;

.field public ܿ:I

.field public volatile ᩳ:Z

.field public final ᩴ:Ll/ۢ۬᩸;

.field public ᩴۙ:Z

.field public final ᩵:Ljava/util/ArrayList;

.field public ᩶:Ll/ܳۙᩴ;

.field public ᩷:Ll/ᩳ۬᩸;

.field public final ᩷ۙ:[I

.field public volatile ᩸:Z

.field public ᩸ۙ:Z

.field public ᩹:Z

.field public ᩺:Ljava/lang/String;

.field public ᩻:Z

.field public final ᩻ۙ:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Ll/᩺ۜ᩸;Ll/ܰۤᩴ;)V
    .locals 3

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    .line 46
    invoke-static {v0}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v0

    iput v0, p0, Ll/۬ۡ᩸;->֨:I

    .line 50
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->۬:Ljava/lang/Object;

    .line 96
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->ۚ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 97
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 98
    new-instance v0, Ll/ۡۡ᩸;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۡۡ᩸;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/۬ۡ᩸;->ۙۙ:Ljava/lang/Runnable;

    .line 102
    new-instance v0, Ll/۠ۡ᩸;

    invoke-direct {v0, p0}, Ll/۠ۡ᩸;-><init>(Ll/۬ۡ᩸;)V

    iput-object v0, p0, Ll/۬ۡ᩸;->ۧ:Ll/۠ۡ᩸;

    .line 106
    new-instance v0, Ll/ۜۙᩴ;

    invoke-direct {v0}, Ll/ۜۙᩴ;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    .line 107
    new-instance v0, Ll/ܽۙᩴ;

    invoke-direct {v0}, Ll/ܽۙᩴ;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    .line 113
    new-instance v0, Ll/ۜۙᩴ;

    invoke-direct {v0}, Ll/ۜۙᩴ;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->ۘ:Ll/ۜۙᩴ;

    const/4 v0, -0x1

    .line 131
    iput v0, p0, Ll/۬ۡ᩸;->۠:I

    const/4 v1, 0x1

    .line 387
    iput-boolean v1, p0, Ll/۬ۡ᩸;->ܳۙ:Z

    .line 644
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/۬ۡ᩸;->֫ۙ:Landroid/graphics/RectF;

    .line 645
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/۬ۡ᩸;->ۧۙ:Landroid/graphics/RectF;

    .line 646
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/۬ۡ᩸;->᩻ۙ:Landroid/graphics/RectF;

    .line 647
    new-instance v2, Ll/᩸᩷ܺ;

    invoke-direct {v2, v0}, Ll/᩸᩷ܺ;-><init>(I)V

    iput-object v2, p0, Ll/۬ۡ᩸;->ܶ:Ll/᩸᩷ܺ;

    .line 648
    new-instance v0, Ll/᩸᩷ܺ;

    invoke-direct {v0, v1}, Ll/᩸᩷ܺ;-><init>(I)V

    iput-object v0, p0, Ll/۬ۡ᩸;->ܽ:Ll/᩸᩷ܺ;

    .line 765
    new-instance v0, Ll/ܳۙᩴ;

    invoke-direct {v0}, Ll/ܳۙᩴ;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->᩶:Ll/ܳۙᩴ;

    .line 824
    new-instance v0, Ll/ۢ۬᩸;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 824
    iput-object v0, p0, Ll/۬ۡ᩸;->ᩴ:Ll/ۢ۬᩸;

    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 825
    iput-object v0, p0, Ll/۬ۡ᩸;->᩷ۙ:[I

    const/4 v0, 0x7

    new-array v0, v0, [I

    .line 826
    iput-object v0, p0, Ll/۬ۡ᩸;->ۤۙ:[I

    .line 1847
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->ۨ:Landroid/graphics/Rect;

    .line 1848
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->ۛ:Landroid/graphics/Rect;

    .line 1849
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/۬ۡ᩸;->᩵:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 2151
    iput-boolean v0, p0, Ll/۬ۡ᩸;->ᩳ:Z

    .line 2152
    iput-boolean v0, p0, Ll/۬ۡ᩸;->۫ۙ:Z

    .line 140
    iput-object p1, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    .line 141
    iput-object p2, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    .line 142
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܽۤ()Ll/ܳۜ᩸;

    move-result-object p1

    iput-object p1, p0, Ll/۬ۡ᩸;->ܳ:Ll/ܳۜ᩸;

    return-void
.end method

.method public constructor <init>(Ll/᩺ۜ᩸;Ll/ᩳ۬᩸;Ll/ܰۤᩴ;Ll/᩵ۚۤ;)V
    .locals 7

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    .line 46
    invoke-static {v0}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v0

    iput v0, p0, Ll/۬ۡ᩸;->֨:I

    .line 50
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->۬:Ljava/lang/Object;

    .line 96
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->ۚ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 97
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 98
    new-instance v0, Ll/ۡۡ᩸;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۡۡ᩸;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/۬ۡ᩸;->ۙۙ:Ljava/lang/Runnable;

    .line 102
    new-instance v0, Ll/۠ۡ᩸;

    invoke-direct {v0, p0}, Ll/۠ۡ᩸;-><init>(Ll/۬ۡ᩸;)V

    iput-object v0, p0, Ll/۬ۡ᩸;->ۧ:Ll/۠ۡ᩸;

    .line 106
    new-instance v0, Ll/ۜۙᩴ;

    invoke-direct {v0}, Ll/ۜۙᩴ;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    .line 107
    new-instance v0, Ll/ܽۙᩴ;

    invoke-direct {v0}, Ll/ܽۙᩴ;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    .line 113
    new-instance v0, Ll/ۜۙᩴ;

    invoke-direct {v0}, Ll/ۜۙᩴ;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->ۘ:Ll/ۜۙᩴ;

    const/4 v0, -0x1

    .line 131
    iput v0, p0, Ll/۬ۡ᩸;->۠:I

    const/4 v1, 0x1

    .line 387
    iput-boolean v1, p0, Ll/۬ۡ᩸;->ܳۙ:Z

    .line 644
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/۬ۡ᩸;->֫ۙ:Landroid/graphics/RectF;

    .line 645
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/۬ۡ᩸;->ۧۙ:Landroid/graphics/RectF;

    .line 646
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/۬ۡ᩸;->᩻ۙ:Landroid/graphics/RectF;

    .line 647
    new-instance v2, Ll/᩸᩷ܺ;

    invoke-direct {v2, v0}, Ll/᩸᩷ܺ;-><init>(I)V

    iput-object v2, p0, Ll/۬ۡ᩸;->ܶ:Ll/᩸᩷ܺ;

    .line 648
    new-instance v0, Ll/᩸᩷ܺ;

    invoke-direct {v0, v1}, Ll/᩸᩷ܺ;-><init>(I)V

    iput-object v0, p0, Ll/۬ۡ᩸;->ܽ:Ll/᩸᩷ܺ;

    .line 765
    new-instance v0, Ll/ܳۙᩴ;

    invoke-direct {v0}, Ll/ܳۙᩴ;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->᩶:Ll/ܳۙᩴ;

    .line 824
    new-instance v0, Ll/ۢ۬᩸;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 824
    iput-object v0, p0, Ll/۬ۡ᩸;->ᩴ:Ll/ۢ۬᩸;

    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 825
    iput-object v0, p0, Ll/۬ۡ᩸;->᩷ۙ:[I

    const/4 v0, 0x7

    new-array v0, v0, [I

    .line 826
    iput-object v0, p0, Ll/۬ۡ᩸;->ۤۙ:[I

    .line 1847
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->ۨ:Landroid/graphics/Rect;

    .line 1848
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/۬ۡ᩸;->ۛ:Landroid/graphics/Rect;

    .line 1849
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/۬ۡ᩸;->᩵:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 2151
    iput-boolean v0, p0, Ll/۬ۡ᩸;->ᩳ:Z

    .line 2152
    iput-boolean v0, p0, Ll/۬ۡ᩸;->۫ۙ:Z

    .line 146
    iput-object p1, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    .line 147
    iput-object p3, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    .line 148
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܽۤ()Ll/ܳۜ᩸;

    move-result-object p1

    iput-object p1, p0, Ll/۬ۡ᩸;->ܳ:Ll/ܳۜ᩸;

    .line 149
    invoke-virtual {p4}, Ll/᩵ۚۤ;->readInt()I

    move-result p1

    iput p1, p0, Ll/۬ۡ᩸;->֡:I

    .line 150
    invoke-virtual {p4}, Ll/᩵ۚۤ;->readInt()I

    move-result p1

    .line 151
    iget-object v1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v1, -0xedc86dd

    .line 152
    invoke-virtual {p4, v1}, Ll/᩵ۚۤ;->ۙ(I)Z

    move-result v1

    .line 153
    new-instance v2, Ll/ܰۙᩴ;

    invoke-direct {v2}, Ll/ܰۙᩴ;-><init>()V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_1

    .line 155
    invoke-virtual {p4}, Ll/᩵ۚۤ;->readInt()I

    move-result v4

    invoke-virtual {p4}, Ll/᩵ۚۤ;->readInt()I

    move-result v5

    invoke-virtual {p4}, Ll/᩵ۚۤ;->readInt()I

    move-result v6

    invoke-virtual {v2, v4, v5, v6}, Ll/ܰۙᩴ;->ۙ(III)V

    .line 156
    iget-object v4, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v4, v2}, Ll/ۜۙᩴ;->ۙ(Ll/ܰۙᩴ;)V

    if-nez v1, :cond_0

    const/4 v4, 0x4

    .line 89
    invoke-virtual {p4, v4}, Ll/᩵ۚۤ;->skipBytes(I)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const p1, 0x723a4824

    .line 161
    invoke-virtual {p4, p1}, Ll/᩵ۚۤ;->ۙ(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 162
    invoke-virtual {p4}, Ll/᩵ۚۤ;->readInt()I

    move-result p1

    :goto_1
    if-ge v0, p1, :cond_2

    .line 164
    invoke-virtual {p4}, Ll/᩵ۚۤ;->ۡ᩷()I

    move-result p2

    .line 165
    invoke-virtual {p4}, Ll/᩵ۚۤ;->readByte()B

    move-result p3

    and-int/lit16 p3, p3, 0xff

    .line 166
    iget-object v1, p0, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    shl-int/lit8 p3, p3, 0x10

    or-int/2addr p2, p3

    invoke-virtual {v1, p2}, Ll/ܽۙᩴ;->add(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 168
    :cond_2
    iget-object p1, p0, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    invoke-virtual {p1}, Ll/ܽۙᩴ;->ۤ()V

    return-void

    .line 170
    :cond_3
    iget-object p1, p0, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    iget-object p4, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {p3}, Ll/ۚۚܺ;->ܽ()I

    move-result p3

    invoke-virtual {p1, p0, p2, p4, p3}, Ll/ܽۙᩴ;->ۙ(Ll/۬ۡ᩸;Ll/ۡ᩶᩸;Ll/ۜۙᩴ;I)V

    return-void
.end method

.method private ۖ()V
    .locals 2

    .line 195
    iget-boolean v0, p0, Ll/۬ۡ᩸;->᩻:Z

    if-nez v0, :cond_1

    iget v0, p0, Ll/۬ۡ᩸;->ۙ:I

    iget-object v1, p0, Ll/۬ۡ᩸;->ۚ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/۬ۡ᩸;->᩷:Ll/ᩳ۬᩸;

    iget-object v1, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    if-eq v0, v1, :cond_1

    .line 200
    :cond_0
    iget-object v0, p0, Ll/۬ۡ᩸;->ۤ:Ll/ܳܿ᩸;

    const/4 v1, 0x0

    .line 201
    iput-object v1, p0, Ll/۬ۡ᩸;->ۤ:Ll/ܳܿ᩸;

    .line 202
    iput-object v1, p0, Ll/۬ۡ᩸;->᩷:Ll/ᩳ۬᩸;

    if-eqz v0, :cond_1

    .line 203
    invoke-virtual {v0}, Ll/ܳܿ᩸;->close()V

    :cond_1
    return-void
.end method

.method private ۙ(DZ)I
    .locals 2

    .line 427
    invoke-virtual {p0, p3}, Ll/۬ۡ᩸;->᩷(Z)F

    move-result v0

    float-to-double v0, v0

    sub-double/2addr p1, v0

    iget-object v0, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    invoke-virtual {v0}, Ll/ۚۚܺ;->֫()F

    move-result v0

    float-to-double v0, v0

    div-double/2addr p1, v0

    double-to-int p1, p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-eqz p3, :cond_1

    .line 431
    iget-object p2, p0, Ll/۬ۡ᩸;->ۘ:Ll/ۜۙᩴ;

    invoke-virtual {p2}, Ll/ۜۙᩴ;->size()I

    move-result p2

    if-lt p1, p2, :cond_2

    .line 432
    iget-object p1, p0, Ll/۬ۡ᩸;->ۘ:Ll/ۜۙᩴ;

    invoke-virtual {p1}, Ll/ۜۙᩴ;->ᩴ()I

    move-result p1

    return p1

    .line 435
    :cond_1
    iget-object p2, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {p2}, Ll/ۜۙᩴ;->size()I

    move-result p2

    if-lt p1, p2, :cond_2

    .line 436
    iget-object p1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {p1}, Ll/ۜۙᩴ;->ᩴ()I

    move-result p1

    :cond_2
    return p1
.end method

.method public static ۙ(Ll/᩺ۜ᩸;Ll/ᩳ۬᩸;Ll/ܰۤᩴ;I)Ll/۬ۡ᩸;
    .locals 2

    if-nez p3, :cond_0

    .line 125
    new-instance p3, Ll/᩸ۙᩴ;

    invoke-direct {p3, p0, p1, p2}, Ll/᩸ۙᩴ;-><init>(Ll/᩺ۜ᩸;Ll/ᩳ۬᩸;Ll/ܰۤᩴ;)V

    return-object p3

    .line 127
    :cond_0
    new-instance v0, Ll/ۡ᩸ᩴ;

    const/4 v1, 0x1

    if-ne p3, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0, p0, p1, p2, v1}, Ll/ۡ᩸ᩴ;-><init>(Ll/᩺ۜ᩸;Ll/ᩳ۬᩸;Ll/ܰۤᩴ;Z)V

    return-object v0
.end method

.method private ۙ(IILjava/lang/CharSequence;)Ll/ᩴۚܺ;
    .locals 6

    .line 465
    iget-object v0, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    invoke-virtual {v0}, Ll/ۚۚܺ;->᩻()Ll/۫ۚܺ;

    move-result-object v1

    if-nez v1, :cond_0

    iget-boolean v1, v0, Ll/ܰۤᩴ;->ۙۤ:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    iget-object v2, v1, Ll/᩺ۜ᩸;->۠᩸:Ll/֨ܽᩴ;

    invoke-virtual {v2}, Ll/֨ܽᩴ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 466
    iget-object v1, v1, Ll/᩺ۜ᩸;->۠᩸:Ll/֨ܽᩴ;

    invoke-virtual {v1, p1, p2, v0, p3}, Ll/֨ܽᩴ;->ۙ(IILl/ۚۚܺ;Ljava/lang/CharSequence;)Ll/ᩴۚܺ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 821
    iget-object v0, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    move-object v1, p3

    move v2, p1

    move v3, p2

    invoke-virtual/range {v0 .. v5}, Ll/ۚۚܺ;->ۙ(Ljava/lang/CharSequence;IIFLl/֡ܽᩴ;)Ll/ᩴۚܺ;

    move-result-object p1

    return-object p1
.end method

.method private ۙ(Landroid/graphics/Canvas;IIIIF)V
    .locals 8

    .line 2021
    iget-object v0, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    iget-boolean v1, v0, Ll/ܰۤᩴ;->ۡ᩷:Z

    if-nez v1, :cond_0

    goto/16 :goto_3

    .line 2022
    :cond_0
    iget-boolean v1, v0, Ll/ܰۤᩴ;->᩻᩷:Z

    .line 2023
    iget-boolean v2, v0, Ll/ܰۤᩴ;->֨ۙ:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    if-eqz v1, :cond_1

    move p6, p2

    goto :goto_0

    :cond_1
    iget p6, p0, Ll/۬ۡ᩸;->֡:I

    sub-int p6, p4, p6

    :goto_0
    int-to-float p6, p6

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p6, 0x0

    goto :goto_1

    .line 2024
    :cond_3
    iget v1, p0, Ll/۬ۡ᩸;->֡:I

    int-to-float v1, v1

    sub-float/2addr p6, v1

    :goto_1
    int-to-float p4, p4

    cmpg-float v1, p4, p6

    if-ltz v1, :cond_6

    int-to-float p2, p2

    .line 2025
    iget v1, p0, Ll/۬ۡ᩸;->֡:I

    int-to-float v1, v1

    add-float/2addr v1, p6

    cmpl-float v1, p2, v1

    if-lez v1, :cond_4

    goto :goto_3

    .line 2026
    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 2028
    :try_start_0
    invoke-virtual {p1, p6, v3}, Landroid/graphics/Canvas;->translate(FF)V

    sub-float/2addr p2, p6

    .line 2029
    invoke-static {v3, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    int-to-float p3, p3

    iget v2, p0, Ll/۬ۡ᩸;->֡:I

    int-to-float v2, v2

    sub-float/2addr p4, p6

    invoke-static {v2, p4}, Ljava/lang/Math;->min(FF)F

    move-result p4

    int-to-float p5, p5

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 2030
    iget-object p2, v0, Ll/ܰۤᩴ;->ۚ᩷:Ll/ۢܺۤ;

    .line 2031
    iget p4, v0, Ll/ܰۤᩴ;->᩸᩷:I

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 2032
    iget p4, p0, Ll/۬ۡ᩸;->֡:I

    int-to-float v5, p4

    const/4 v3, 0x0

    move-object v2, p1

    move v4, p3

    move v6, p5

    move-object v7, p2

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 2041
    iget p4, v0, Ll/ܰۤᩴ;->ܳ᩷:I

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 2042
    iget-boolean p4, v0, Ll/ܰۤᩴ;->᩻᩷:Z

    if-eqz p4, :cond_5

    iget p4, p0, Ll/۬ۡ᩸;->֡:I

    add-int/lit8 p4, p4, -0x1

    int-to-float p4, p4

    move v5, p4

    goto :goto_2

    :cond_5
    const/high16 p4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    :goto_2
    move-object v2, p1

    move v3, v5

    move v4, p3

    move v6, p5

    move-object v7, p2

    .line 2043
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2035
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 2036
    throw p2

    :cond_6
    :goto_3
    return-void
.end method

.method private ۙ(Landroid/graphics/Canvas;IIIIIIFZLl/ܰۤᩴ;Ll/ۢܺۤ;)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v11, p4

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    .line 2049
    iget-boolean v14, v12, Ll/ܰۤᩴ;->᩻᩷:Z

    .line 2050
    iget v15, v0, Ll/۬ۡ᩸;->֡:I

    .line 2051
    iget-object v3, v0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {v3}, Ll/᩺ۜ᩸;->֫ۙ()I

    move-result v3

    const/16 v4, 0xff

    if-ge v3, v4, :cond_0

    const/4 v3, 0x1

    const/16 v16, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/16 v16, 0x0

    :goto_0
    if-nez v16, :cond_1

    .line 2053
    iget v3, v12, Ll/ܰۤᩴ;->᩸᩷:I

    invoke-virtual {v13, v3}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v5, v1

    int-to-float v6, v15

    int-to-float v7, v2

    const/4 v4, 0x0

    move-object/from16 v3, p1

    move-object/from16 v8, p11

    .line 2054
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 2056
    :cond_1
    iget v10, v12, Ll/ܰۤᩴ;->ۧ᩷:F

    .line 2057
    iget-object v3, v12, Ll/ܰۤᩴ;->ܺۙ:Ll/ܰۡ᩸;

    if-eqz v3, :cond_2

    .line 2059
    iget-object v4, v0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    move/from16 v5, p4

    move/from16 v6, p5

    move v7, v15

    move-object/from16 v8, p1

    move-object/from16 v9, p11

    move/from16 v17, v10

    move-object/from16 v10, p10

    invoke-interface/range {v3 .. v10}, Ll/ܰۡ᩸;->ۙ(Ll/ۜۙᩴ;IIILandroid/graphics/Canvas;Landroid/graphics/Paint;Ll/ܰۤᩴ;)V

    goto :goto_1

    :cond_2
    move/from16 v17, v10

    :goto_1
    if-nez v16, :cond_4

    .line 2041
    iget-object v3, v0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    iget v4, v3, Ll/ܰۤᩴ;->ܳ᩷:I

    invoke-virtual {v13, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 2042
    iget-boolean v3, v3, Ll/ܰۤᩴ;->᩻᩷:Z

    if-eqz v3, :cond_3

    iget v3, v0, Ll/۬ۡ᩸;->֡:I

    add-int/lit8 v3, v3, -0x1

    int-to-float v3, v3

    move v4, v3

    goto :goto_2

    :cond_3
    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x3f800000    # 1.0f

    :goto_2
    int-to-float v3, v1

    int-to-float v5, v2

    move-object/from16 v1, p1

    move v2, v4

    move-object/from16 v6, p11

    .line 2043
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_4
    if-eqz v14, :cond_5

    int-to-float v1, v15

    sub-float v10, v1, v17

    goto :goto_3

    :cond_5
    move/from16 v10, v17

    .line 2065
    :goto_3
    invoke-virtual {v0, v11}, Ll/۬ۡ᩸;->ۤ(I)F

    move-result v1

    iget v2, v12, Ll/ܰۤᩴ;->֫᩷:F

    add-float/2addr v1, v2

    .line 2066
    iget v2, v12, Ll/ܰۤᩴ;->ᩴ᩷:I

    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setColor(I)V

    if-lez v11, :cond_6

    .line 2069
    iget-object v2, v0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    add-int/lit8 v3, v11, -0x1

    invoke-virtual {v2, v3}, Ll/ۜۙᩴ;->᩻(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    .line 2072
    :goto_4
    iget-object v3, v0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v3}, Ll/ۜۙᩴ;->᩷()Ll/ܿۙᩴ;

    move-result-object v8

    move/from16 v6, p5

    move v9, v1

    move v7, v2

    :goto_5
    if-gt v11, v6, :cond_e

    .line 2074
    invoke-virtual {v8, v11}, Ll/ܿۙᩴ;->ۙ(I)Ll/ܰۙᩴ;

    move-result-object v1

    .line 2075
    iget v5, v1, Ll/ܰۙᩴ;->᩶:I

    move/from16 v4, p7

    if-gt v5, v4, :cond_8

    move/from16 v3, p6

    if-gt v3, v5, :cond_8

    .line 2077
    iget v1, v12, Ll/ܰۤᩴ;->۫᩷:I

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2078
    iget v1, v12, Ll/ܰۤᩴ;->֫᩷:F

    sub-float v16, v9, v1

    add-float v18, v16, p8

    if-eqz v14, :cond_7

    add-int/lit8 v1, v15, -0x3

    int-to-float v2, v1

    int-to-float v1, v15

    move/from16 v19, v1

    move-object/from16 v1, p1

    move/from16 v3, v16

    move/from16 v4, v19

    move/from16 v19, v5

    move/from16 v5, v18

    move-object/from16 v6, p11

    .line 2082
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_6

    :cond_7
    move/from16 v19, v5

    const/4 v2, 0x0

    const/high16 v4, 0x40400000    # 3.0f

    move-object/from16 v1, p1

    move/from16 v3, v16

    move/from16 v5, v18

    move-object/from16 v6, p11

    .line 2084
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 2086
    :goto_6
    iget v1, v12, Ll/ܰۤᩴ;->ᩴ᩷:I

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_7

    :cond_8
    move/from16 v19, v5

    :goto_7
    add-int/lit8 v6, v19, 0x1

    if-eq v7, v6, :cond_d

    const/4 v1, 0x1

    if-eqz p9, :cond_9

    if-ne v6, v1, :cond_d

    .line 2090
    :cond_9
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v16

    if-eqz v14, :cond_b

    .line 2093
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v1

    move/from16 v18, v2

    move/from16 v19, v10

    :goto_8
    if-ltz v18, :cond_a

    add-int/lit8 v4, v18, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, v16

    move/from16 v3, v18

    move/from16 v5, v19

    move/from16 v20, v6

    move v6, v9

    move-object/from16 v7, p11

    .line 2094
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    sub-float v19, v19, v17

    add-int/lit8 v18, v18, -0x1

    move/from16 v6, v20

    goto :goto_8

    :cond_a
    move/from16 v20, v6

    goto :goto_a

    :cond_b
    move/from16 v20, v6

    .line 2098
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v1, 0x0

    move/from16 v18, v10

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v7, :cond_c

    add-int/lit8 v19, v3, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, v16

    move/from16 v4, v19

    move/from16 v5, v18

    move v6, v9

    move/from16 v21, v7

    move-object/from16 v7, p11

    .line 2099
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    add-float v18, v18, v17

    move/from16 v3, v19

    move/from16 v7, v21

    goto :goto_9

    :cond_c
    :goto_a
    move/from16 v7, v20

    :cond_d
    add-int/lit8 v11, v11, 0x1

    .line 2105
    invoke-virtual {v0, v11}, Ll/۬ۡ᩸;->ۤ(I)F

    move-result v1

    iget v2, v12, Ll/ܰۤᩴ;->֫᩷:F

    add-float v9, v1, v2

    move/from16 v6, p5

    goto/16 :goto_5

    :cond_e
    return-void
.end method

.method private ۙ(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 7

    .line 1852
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_6

    iget-object v0, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩻᩷()Ll/ܿ۠᩸;

    move-result-object v1

    if-nez v1, :cond_6

    .line 1853
    iget-object v1, p0, Ll/۬ۡ᩸;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1854
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    const/4 v3, 0x0

    .line 1855
    iget-object v4, p0, Ll/۬ۡ᩸;->ۨ:Landroid/graphics/Rect;

    const/16 v5, 0xc8

    if-eqz p1, :cond_1

    .line 1856
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {v4, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 1857
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result p1

    neg-int p1, p1

    iget p2, p0, Ll/۬ۡ᩸;->۫:I

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result p3

    sub-int/2addr p2, p3

    invoke-virtual {v4, p1, p2}, Landroid/graphics/Rect;->offset(II)V

    .line 1858
    iget p1, v4, Landroid/graphics/Rect;->right:I

    if-ge p1, v5, :cond_0

    .line 1859
    iput v3, v4, Landroid/graphics/Rect;->left:I

    .line 1860
    iput v5, v4, Landroid/graphics/Rect;->right:I

    .line 1861
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 1862
    :cond_0
    iget p1, v4, Landroid/graphics/Rect;->left:I

    add-int/lit16 p2, v2, -0xc8

    if-le p1, p2, :cond_5

    .line 1863
    iput p2, v4, Landroid/graphics/Rect;->left:I

    .line 1864
    iput v2, v4, Landroid/graphics/Rect;->right:I

    .line 1865
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_3

    .line 1869
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {v4, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 1870
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result p1

    neg-int p1, p1

    iget p2, p0, Ll/۬ۡ᩸;->۫:I

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v6

    sub-int/2addr p2, v6

    invoke-virtual {v4, p1, p2}, Landroid/graphics/Rect;->offset(II)V

    .line 1871
    iget p1, v4, Landroid/graphics/Rect;->right:I

    if-ge p1, v5, :cond_2

    .line 1872
    iput v3, v4, Landroid/graphics/Rect;->left:I

    .line 1873
    iput v5, v4, Landroid/graphics/Rect;->right:I

    .line 1874
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1875
    :cond_2
    iget p1, v4, Landroid/graphics/Rect;->left:I

    add-int/lit16 p2, v2, -0xc8

    if-le p1, p2, :cond_3

    .line 1876
    iput p2, v4, Landroid/graphics/Rect;->left:I

    .line 1877
    iput v2, v4, Landroid/graphics/Rect;->right:I

    .line 1878
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    if-eqz p3, :cond_5

    .line 1882
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;

    move-result-object p1

    iget-object p2, p0, Ll/۬ۡ᩸;->ۛ:Landroid/graphics/Rect;

    invoke-virtual {p2, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 1883
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result p1

    neg-int p1, p1

    iget p3, p0, Ll/۬ۡ᩸;->۫:I

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v4

    sub-int/2addr p3, v4

    invoke-virtual {p2, p1, p3}, Landroid/graphics/Rect;->offset(II)V

    .line 1884
    iget p1, p2, Landroid/graphics/Rect;->right:I

    if-ge p1, v5, :cond_4

    .line 1885
    iput v3, p2, Landroid/graphics/Rect;->left:I

    .line 1886
    iput v5, p2, Landroid/graphics/Rect;->right:I

    .line 1887
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1888
    :cond_4
    iget p1, p2, Landroid/graphics/Rect;->left:I

    add-int/lit16 p3, v2, -0xc8

    if-le p1, p3, :cond_5

    .line 1889
    iput p3, p2, Landroid/graphics/Rect;->left:I

    .line 1890
    iput v2, p2, Landroid/graphics/Rect;->right:I

    .line 1891
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1895
    :cond_5
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemGestureExclusionRects(Ljava/util/List;)V

    :cond_6
    return-void
.end method

.method private ۙ(Ll/֨ܽᩴ;II)V
    .locals 3

    .line 2000
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0, p2}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v0

    .line 2001
    iget-object v1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v1, p3}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v1

    .line 2003
    iget-object v2, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    iget v0, v0, Ll/ܰۙᩴ;->ܿ:I

    invoke-virtual {v1}, Ll/ܰۙᩴ;->ۙ()I

    move-result v1

    invoke-virtual {p1, v2, v0, v1}, Ll/֨ܽᩴ;->᩸(Ll/ۡ᩶᩸;II)V

    .line 67
    iget v0, p0, Ll/۬ۡ᩸;->ܿ:I

    const v1, 0xf4240

    if-le v0, v1, :cond_0

    .line 2006
    iget-object v0, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩺()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2008
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0, p2}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v0

    .line 2009
    iget-object v1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v1, p3}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v1

    .line 2010
    iget v0, v0, Ll/ܰۙᩴ;->ܿ:I

    invoke-virtual {v1}, Ll/ܰۙᩴ;->ۙ()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ll/֨ܽᩴ;->ܳ(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2011
    invoke-direct {p0, p2, p3}, Ll/۬ۡ᩸;->ܳ(II)J

    move-result-wide p2

    .line 2012
    iget-object v0, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    const/16 v1, 0x20

    ushr-long v1, p2, v1

    long-to-int v2, v1

    long-to-int p3, p2

    invoke-virtual {p1, v0, v2, p3}, Ll/֨ܽᩴ;->ۤ(Ll/ۡ᩶᩸;II)V

    :cond_0
    return-void
.end method

.method public static synthetic ۙ(Ll/۬ۡ᩸;)V
    .locals 2

    .line 99
    iget-object v0, p0, Ll/۬ۡ᩸;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 100
    invoke-direct {p0}, Ll/۬ۡ᩸;->ۖ()V

    return-void
.end method

.method private ۙ(Ll/ܿ۠᩸;Landroid/graphics/Canvas;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p4, :cond_2

    if-eqz p1, :cond_1

    .line 1907
    iget p2, p5, Landroid/graphics/RectF;->left:F

    iget-object p4, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {p4}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr p2, v1

    float-to-int p2, p2

    invoke-virtual {p4}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    add-int/2addr v1, p2

    .line 1908
    iget p2, p5, Landroid/graphics/RectF;->top:F

    iget v2, p0, Ll/۬ۡ᩸;->۫:I

    invoke-virtual {p4}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    add-float/2addr p2, v2

    float-to-int p2, p2

    invoke-virtual {p4}, Landroid/view/View;->getPaddingTop()I

    move-result p4

    add-int/2addr p4, p2

    .line 1909
    invoke-virtual {p5}, Landroid/graphics/RectF;->setEmpty()V

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 1911
    invoke-virtual {p1, p6, v1, p4, p2}, Ll/ܿ۠᩸;->ۙ(IIIZ)V

    return-void

    .line 1913
    :cond_0
    invoke-virtual {p1, p6, v0, v0, v0}, Ll/ܿ۠᩸;->ۙ(IIIZ)V

    return-void

    .line 1916
    :cond_1
    invoke-virtual {p4, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    .line 1919
    :cond_2
    invoke-virtual {p5}, Landroid/graphics/RectF;->setEmpty()V

    if-eqz p1, :cond_3

    .line 1921
    invoke-virtual {p1, p6, v0, v0, v0}, Ll/ܿ۠᩸;->ۙ(IIIZ)V

    :cond_3
    return-void
.end method

.method private ۡ()Ll/ܳܿ᩸;
    .locals 4

    .line 208
    iget-object v0, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    .line 209
    iget-object v1, p0, Ll/۬ۡ᩸;->ۚ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    .line 210
    iget-object v2, p0, Ll/۬ۡ᩸;->ۤ:Ll/ܳܿ᩸;

    if-eqz v2, :cond_0

    iget-object v2, p0, Ll/۬ۡ᩸;->᩷:Ll/ᩳ۬᩸;

    if-ne v2, v0, :cond_0

    iget v2, p0, Ll/۬ۡ᩸;->ۙ:I

    if-ne v2, v1, :cond_0

    iget-object v2, p0, Ll/۬ۡ᩸;->ۤ:Ll/ܳܿ᩸;

    .line 211
    invoke-interface {v0, v2}, Ll/ۡ᩶᩸;->ۙ(Ll/ܳܿ᩸;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 200
    :cond_0
    iget-object v2, p0, Ll/۬ۡ᩸;->ۤ:Ll/ܳܿ᩸;

    const/4 v3, 0x0

    .line 201
    iput-object v3, p0, Ll/۬ۡ᩸;->ۤ:Ll/ܳܿ᩸;

    .line 202
    iput-object v3, p0, Ll/۬ۡ᩸;->᩷:Ll/ᩳ۬᩸;

    if-eqz v2, :cond_1

    .line 203
    invoke-virtual {v2}, Ll/ܳܿ᩸;->close()V

    .line 213
    :cond_1
    iput-object v0, p0, Ll/۬ۡ᩸;->᩷:Ll/ᩳ۬᩸;

    .line 214
    iput v1, p0, Ll/۬ۡ᩸;->ۙ:I

    .line 215
    invoke-interface {v0}, Ll/ۡ᩶᩸;->ܽۙ()Ll/ܳܿ᩸;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۡ᩸;->ۤ:Ll/ܳܿ᩸;

    .line 217
    iget-object v0, p0, Ll/۬ۡ᩸;->ۤ:Ll/ܳܿ᩸;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ܳܿ᩸;->ᩳ:Z

    .line 219
    :cond_2
    iget-object v0, p0, Ll/۬ۡ᩸;->ۤ:Ll/ܳܿ᩸;

    return-object v0
.end method

.method private ۤ(Z)I
    .locals 3

    .line 327
    iget-object v0, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    instance-of v1, v0, Ll/᩹ۖ᩸;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ll/᩹ۖ᩸;

    iget-object v0, v0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    if-ne v0, p0, :cond_1

    instance-of v0, p0, Ll/᩸ۙᩴ;

    if-eqz v0, :cond_1

    .line 328
    invoke-virtual {p0}, Ll/۬ۡ᩸;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0}, Ll/ۜۙᩴ;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ll/۬ۡ᩸;->ۡ:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/۬ۡ᩸;->ۘ:Ll/ۜۙᩴ;

    .line 329
    invoke-virtual {p1}, Ll/ۜۙᩴ;->size()I

    move-result p1

    if-eq p1, v2, :cond_0

    goto :goto_0

    .line 330
    :cond_0
    invoke-virtual {v1}, Ll/᩹ۖ᩸;->ۨ᩸()I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۤ(Landroid/graphics/RectF;I)V
    .locals 2

    .line 508
    iget-object v0, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    invoke-virtual {v0}, Ll/ۚۚܺ;->֫()F

    move-result v0

    int-to-float p2, p2

    mul-float p2, p2, v0

    const/4 v1, 0x0

    .line 509
    invoke-virtual {p0, v1}, Ll/۬ۡ᩸;->᩷(Z)F

    move-result v1

    add-float/2addr p2, v1

    iput p2, p1, Landroid/graphics/RectF;->top:F

    add-float/2addr p2, v0

    .line 510
    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    return-void
.end method

.method private ܳ(II)J
    .locals 4

    .line 1990
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0, p1}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v0

    .line 1991
    iget-object v1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v1, p2}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v1

    .line 1992
    iget v0, v0, Ll/ܰۙᩴ;->ܿ:I

    add-int/lit16 v0, v0, -0x2710

    const/4 v2, 0x0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1993
    iget-object v3, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    add-int/lit16 p1, p1, -0xc8

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {v3, p1}, Ll/ۜۙᩴ;->ۨ(I)I

    move-result p1

    .line 67
    iget v2, p0, Ll/۬ۡ᩸;->ܿ:I

    .line 1994
    invoke-virtual {v1}, Ll/ܰۙᩴ;->᩷()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Ll/ܰۙᩴ;->ۙ()I

    move-result v1

    goto :goto_0

    :cond_0
    iget v1, v1, Ll/ܰۙᩴ;->ܰ:I

    add-int/lit16 v1, v1, 0x2710

    :goto_0
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 1995
    iget-object v2, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v2}, Ll/ۜۙᩴ;->ᩴ()I

    move-result v3

    add-int/lit16 p2, p2, 0xc8

    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-virtual {v2, p2}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ܰۙᩴ;->ۙ()I

    move-result p2

    .line 1996
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-long v2, p1

    const/16 p1, 0x20

    shl-long/2addr v2, p1

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-long p1, p1

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    or-long/2addr p1, v2

    return-wide p1
.end method

.method private ᩷(Landroid/graphics/Canvas;IIIIIILl/ۖۡ᩸;Ll/֨ܽᩴ;Ll/ۖ᩷ᩴ;Ll/ܽ֨᩸;)V
    .locals 107

    move-object/from16 v13, p0

    move-object/from16 v15, p1

    move/from16 v0, p2

    move/from16 v1, p3

    move/from16 v14, p5

    move/from16 v12, p6

    move-object/from16 v11, p8

    move-object/from16 v10, p9

    add-int v9, v0, p4

    .line 886
    iget v2, v13, Ll/۬ۡ᩸;->۫:I

    sub-int v8, v1, v2

    add-int v7, v8, v14

    .line 889
    iget-object v6, v13, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    if-nez v1, :cond_0

    .line 890
    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int v2, v8, v2

    move v5, v2

    goto :goto_0

    :cond_0
    move v5, v8

    .line 892
    :goto_0
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ܿۙ()I

    move-result v2

    sub-int v4, v8, v2

    .line 897
    iget-object v3, v13, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    iget-object v2, v3, Ll/ۚۚܺ;->۠:Ll/ۢܺۤ;

    iget v12, v3, Ll/ܰۤᩴ;->ܿۙ:I

    move/from16 v16, v12

    iget v12, v3, Ll/ܰۤᩴ;->۟ۙ:I

    move/from16 v17, v12

    iget v12, v3, Ll/ܰۤᩴ;->ۢۙ:I

    move/from16 v18, v12

    iget v12, v3, Ll/ۚۚܺ;->ܳ:F

    move/from16 v19, v12

    iget v12, v3, Ll/ܰۤᩴ;->֫ۙ:I

    move/from16 v20, v12

    iget v12, v3, Ll/ܰۤᩴ;->ᩳۙ:I

    move/from16 v21, v12

    .line 898
    iget-object v12, v3, Ll/ܰۤᩴ;->ۚ᩷:Ll/ۢܺۤ;

    .line 899
    invoke-virtual {v3}, Ll/ۚۚܺ;->֫()F

    move-result v27

    .line 900
    invoke-virtual {v3}, Ll/ۚۚܺ;->ۚ()F

    move-result v28

    move-object/from16 v22, v12

    .line 901
    invoke-virtual {v3}, Ll/ܰۤᩴ;->ܰ()I

    move-result v12

    move/from16 v23, v12

    .line 902
    iget v12, v3, Ll/ܰۤᩴ;->ܽۙ:I

    move/from16 v24, v12

    .line 903
    iget v12, v13, Ll/۬ۡ᩸;->֡:I

    .line 904
    iget-boolean v11, v3, Ll/ܰۤᩴ;->᩸ۙ:Z

    .line 905
    invoke-virtual {v3}, Ll/ۚۚܺ;->᩻()Ll/۫ۚܺ;

    move-result-object v25

    const/16 v26, 0x1

    if-nez v25, :cond_1

    move-object/from16 v25, v2

    iget-boolean v2, v3, Ll/ܰۤᩴ;->֨᩷:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    const/16 v29, 0x1

    goto :goto_1

    :cond_1
    move-object/from16 v25, v2

    :cond_2
    const/4 v2, 0x0

    const/16 v29, 0x0

    .line 906
    :goto_1
    iget-boolean v2, v3, Ll/ܰۤᩴ;->ۡۙ:Z

    move/from16 v30, v11

    .line 907
    iget-object v11, v3, Ll/ܰۤᩴ;->ۧۤ:Ll/᩻۠᩷;

    move-object/from16 v31, v11

    .line 908
    iget-object v11, v3, Ll/ܰۤᩴ;->֫ۤ:Ll/᩻۠᩷;

    move/from16 v32, v4

    .line 909
    iget-object v4, v13, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    invoke-virtual {v4}, Ll/ܽۙᩴ;->᩷()Ll/ۧۙᩴ;

    move-result-object v4

    move-object/from16 v33, v11

    .line 911
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->᩻᩷()Ll/ܿ۠᩸;

    move-result-object v11

    .line 912
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->᩵ۙ()Ll/ۢ۬᩸;

    move-result-object v34

    move-object/from16 v35, v11

    .line 916
    invoke-virtual/range {p0 .. p0}, Ll/۬ۡ᩸;->᩺()Z

    move-result v11

    if-eqz v11, :cond_3

    move-object/from16 v36, v4

    .line 917
    iget-object v4, v13, Ll/۬ۡ᩸;->ۘ:Ll/ۜۙᩴ;

    goto :goto_2

    :cond_3
    move-object/from16 v36, v4

    iget-object v4, v13, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    :goto_2
    if-eqz v2, :cond_4

    mul-int v37, p4, v12

    move/from16 v38, v2

    move/from16 v2, v37

    goto :goto_3

    :cond_4
    const/16 v37, 0x0

    move/from16 v38, v2

    const/4 v2, 0x0

    :goto_3
    int-to-float v2, v2

    .line 920
    invoke-virtual {v3}, Ll/ۚۚܺ;->ᩴ()F

    move-result v37

    move/from16 v39, v5

    sub-float v5, v37, v28

    .line 921
    invoke-virtual {v3}, Ll/ۚۚܺ;->ܳ()F

    move-result v37

    add-float v37, v37, v28

    invoke-virtual {v3}, Ll/ۚۚܺ;->ᩴ()F

    move-result v40

    sub-float v37, v37, v40

    move/from16 v40, v8

    sub-float v8, v37, v27

    .line 920
    invoke-static {v5, v8}, Ljava/lang/Math;->max(FF)F

    move-result v5

    add-float/2addr v5, v2

    const/4 v2, 0x0

    cmpl-float v2, v27, v2

    if-lez v2, :cond_5

    div-float v5, v5, v27

    move/from16 v37, v7

    float-to-double v7, v5

    .line 922
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-int v2, v7

    const/4 v5, 0x0

    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_4

    :cond_5
    move/from16 v37, v7

    const/4 v2, 0x0

    :goto_4
    int-to-double v7, v1

    .line 923
    invoke-direct {v13, v7, v8, v11}, Ll/۬ۡ᩸;->ۙ(DZ)I

    move-result v1

    sub-int/2addr v1, v2

    const/4 v5, 0x0

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 924
    invoke-virtual {v4}, Ll/ۜۙᩴ;->ᩴ()I

    move-result v1

    move/from16 v41, v9

    int-to-double v9, v14

    add-double/2addr v9, v7

    invoke-direct {v13, v9, v10, v11}, Ll/۬ۡ᩸;->ۙ(DZ)I

    move-result v9

    add-int/2addr v9, v2

    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 925
    invoke-virtual/range {p0 .. p0}, Ll/۬ۡ᩸;->ۙ()Z

    move-result v42

    xor-int/lit8 v43, v42, 0x1

    .line 926
    invoke-virtual {v13, v11}, Ll/۬ۡ᩸;->᩷(Z)F

    move-result v44

    .line 927
    invoke-virtual {v13, v5}, Ll/۬ۡ᩸;->ۤ(I)F

    move-result v1

    add-float v45, v1, v44

    .line 930
    iget-object v1, v13, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-static {v1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v9

    .line 931
    iget-object v1, v13, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-static {v1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    .line 932
    invoke-static {v9, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 933
    invoke-static {v9, v2}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 935
    invoke-virtual {v6}, Landroid/view/View;->isFocused()Z

    move-result v46

    move/from16 p3, v2

    if-eqz v46, :cond_6

    iget v2, v3, Ll/ܰۤᩴ;->ᩳ᩷:I

    goto :goto_5

    :cond_6
    iget v2, v3, Ll/ܰۤᩴ;->ۨ᩷:I

    :goto_5
    move/from16 v46, v9

    .line 937
    iget v9, v3, Ll/ܰۤᩴ;->ܰ᩷:I

    move/from16 v47, v9

    .line 938
    iget v9, v3, Ll/ܰۤᩴ;->ۘ᩷:I

    move-object/from16 v48, v4

    .line 940
    invoke-virtual/range {p0 .. p0}, Ll/۬ۡ᩸;->ܳ()I

    move-result v4

    int-to-float v4, v4

    move/from16 v49, v5

    const/4 v5, 0x0

    invoke-virtual {v13, v5}, Ll/۬ۡ᩸;->ۙ(Z)F

    move-result v5

    add-float/2addr v5, v4

    .line 941
    invoke-virtual/range {p0 .. p0}, Ll/۬ۡ᩸;->ۧ()F

    move-result v50

    .line 944
    invoke-virtual {v3}, Ll/ۚۚܺ;->᩻()Ll/۫ۚܺ;

    move-result-object v4

    if-nez v4, :cond_7

    iget-boolean v4, v3, Ll/ܰۤᩴ;->ۙۤ:Z

    if-eqz v4, :cond_7

    invoke-virtual/range {p9 .. p9}, Ll/֨ܽᩴ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_7

    const/4 v4, 0x1

    const/16 v51, 0x1

    goto :goto_6

    :cond_7
    const/4 v4, 0x0

    const/16 v51, 0x0

    .line 945
    :goto_6
    invoke-virtual {v3}, Ll/ۚۚܺ;->᩻()Ll/۫ۚܺ;

    move-result-object v4

    if-nez v4, :cond_8

    invoke-virtual/range {p10 .. p10}, Ll/ۖ᩷ᩴ;->᩷()Z

    move-result v4

    if-eqz v4, :cond_8

    const/4 v4, 0x1

    const/16 v52, 0x1

    goto :goto_7

    :cond_8
    const/4 v4, 0x0

    const/16 v52, 0x0

    :goto_7
    const/16 v53, 0x0

    if-nez v11, :cond_b

    if-nez v51, :cond_9

    goto :goto_9

    .line 953
    :cond_9
    invoke-virtual/range {p11 .. p11}, Ll/ܽ֨᩸;->ᩴ()Z

    move-result v4

    if-eqz v4, :cond_a

    .line 955
    iget-object v4, v13, Ll/۬ۡ᩸;->ۤۙ:[I

    const/16 v55, 0x0

    aput v2, v4, v55

    .line 956
    aput v1, v4, v26

    const/16 v26, 0x2

    .line 957
    aput v14, v4, v26

    .line 958
    invoke-virtual/range {p11 .. p11}, Ll/ܽ֨᩸;->ۤ()I

    move-result v26

    const/16 v54, 0x3

    aput v26, v4, v54

    add-int/lit8 v26, v26, 0x1

    const/16 v54, 0x4

    .line 959
    aput v26, v4, v54

    .line 960
    invoke-virtual/range {p11 .. p11}, Ll/ܽ֨᩸;->᩸()I

    move-result v26

    const/16 v54, 0x5

    aput v26, v4, v54

    const/16 v54, 0x6

    add-int/lit8 v26, v26, 0x1

    .line 961
    aput v26, v4, v54

    goto :goto_8

    .line 964
    :cond_a
    iget-object v4, v13, Ll/۬ۡ᩸;->᩷ۙ:[I

    const/16 v55, 0x0

    aput v2, v4, v55

    .line 965
    aput v1, v4, v26

    const/16 v26, 0x2

    .line 966
    aput v14, v4, v26

    :goto_8
    move-object/from16 v26, v4

    goto :goto_a

    :cond_b
    :goto_9
    move-object/from16 v26, v53

    .line 970
    :goto_a
    iget-object v4, v13, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-static {v4}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result v4

    move/from16 v54, v1

    .line 971
    iget-object v1, v13, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-static {v1}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanEnd(Landroid/text/Spannable;)I

    move-result v1

    move/from16 v55, v14

    if-ge v1, v4, :cond_c

    move/from16 v106, v4

    move v4, v1

    move/from16 v1, v106

    .line 978
    :cond_c
    iget-object v14, v13, Ll/۬ۡ᩸;->ᩴ:Ll/ۢ۬᩸;

    if-ltz v4, :cond_d

    if-ge v4, v1, :cond_d

    move/from16 v56, v2

    const/4 v2, 0x1

    .line 980
    iput-boolean v2, v14, Ll/ۢ۬᩸;->ۙ:Z

    .line 981
    iput v4, v14, Ll/ۢ۬᩸;->ۤ:I

    .line 982
    iput v1, v14, Ll/ۢ۬᩸;->᩷:I

    goto :goto_b

    :cond_d
    move/from16 v56, v2

    const/4 v1, 0x0

    .line 984
    iput-boolean v1, v14, Ll/ۢ۬᩸;->ۙ:Z

    .line 988
    :goto_b
    iget v1, v3, Ll/ܰۤᩴ;->ᩴۙ:I

    invoke-virtual {v15, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 989
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->֫ۙ()I

    move-result v4

    .line 990
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ܰ᩷()Z

    move-result v57

    const/16 v1, 0xff

    if-nez v57, :cond_f

    if-ge v4, v1, :cond_e

    goto :goto_c

    :cond_e
    move-object/from16 v58, v3

    move-object/from16 v62, v6

    move-wide/from16 v59, v7

    move/from16 v63, v10

    move-object/from16 v61, v36

    move/from16 v10, v37

    move/from16 v64, v54

    move/from16 v8, p3

    move-object/from16 v54, v25

    move/from16 p3, v32

    move/from16 v25, v38

    move/from16 v32, v56

    move/from16 v56, v9

    move-object/from16 v38, v14

    move/from16 v14, v39

    move-object/from16 v39, v48

    move/from16 v48, v49

    move/from16 v49, v5

    goto/16 :goto_d

    .line 993
    :cond_f
    :goto_c
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 995
    :try_start_0
    invoke-virtual {v6}, Landroid/view/View;->getPaddingLeft()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    int-to-float v1, v1

    move/from16 v58, v2

    :try_start_1
    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v15, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move/from16 v2, v54

    move-object/from16 v1, p0

    move-wide/from16 v59, v7

    move-object/from16 v54, v25

    move/from16 v25, v38

    move/from16 v8, p3

    move v7, v2

    move-object/from16 v38, v14

    move/from16 v14, v56

    move/from16 v56, v9

    move/from16 v9, v58

    move-object/from16 v2, p1

    move-object/from16 v58, v3

    move/from16 v3, p2

    move/from16 p3, v32

    move-object/from16 v61, v36

    move/from16 v36, v4

    move/from16 v32, v14

    move-object/from16 v14, v48

    move/from16 v4, p3

    move/from16 v48, v49

    move/from16 v49, v5

    move/from16 v106, v39

    move-object/from16 v39, v14

    move/from16 v14, v106

    move/from16 v5, v41

    move-object/from16 v62, v6

    move/from16 v6, v37

    move/from16 v64, v7

    move/from16 v63, v10

    move/from16 v10, v37

    move/from16 v7, v50

    .line 996
    :try_start_2
    invoke-direct/range {v1 .. v7}, Ll/۬ۡ᩸;->ۙ(Landroid/graphics/Canvas;IIIIF)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 998
    invoke-virtual {v15, v9}, Landroid/graphics/Canvas;->restoreToCount(I)V

    if-eqz v57, :cond_10

    move-object v11, v13

    goto/16 :goto_7c

    .line 1002
    :cond_10
    invoke-virtual/range {v62 .. v62}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-float v2, v1

    .line 1003
    invoke-virtual/range {v62 .. v62}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v1

    iget v3, v13, Ll/۬ۡ᩸;->۫:I

    sub-int/2addr v1, v3

    int-to-float v3, v1

    .line 1005
    invoke-virtual/range {v62 .. v62}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    add-float v4, v1, v2

    .line 1006
    invoke-virtual/range {v62 .. v62}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    add-float v5, v1, v3

    move-object/from16 v1, p1

    move/from16 v6, v36

    .line 1005
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->saveLayerAlpha(FFFFI)I

    :goto_d
    if-eqz v11, :cond_11

    move-object/from16 v1, v53

    goto :goto_e

    .line 1009
    :cond_11
    invoke-direct/range {p0 .. p0}, Ll/۬ۡ᩸;->ۡ()Ll/ܳܿ᩸;

    move-result-object v1

    :goto_e
    if-eqz v25, :cond_12

    .line 1011
    iget-object v2, v13, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    :goto_f
    move-object v9, v2

    goto :goto_10

    :cond_12
    if-nez v1, :cond_13

    const-string v2, ""

    goto :goto_f

    :cond_13
    move-object v9, v1

    .line 1012
    :goto_10
    iget-object v7, v13, Ll/۬ۡ᩸;->᩶:Ll/ܳۙᩴ;

    if-eqz v29, :cond_1d

    if-eqz v1, :cond_1d

    move-object/from16 v6, v62

    .line 1013
    iget v2, v6, Ll/᩺ۜ᩸;->ۧۙ:I

    .line 770
    iget v3, v7, Ll/ܳۙᩴ;->ۙ:I

    if-ne v2, v3, :cond_14

    iget v3, v7, Ll/ܳۙᩴ;->᩸:I

    if-ne v8, v3, :cond_14

    goto/16 :goto_17

    .line 773
    :cond_14
    iput v2, v7, Ll/ܳۙᩴ;->ۙ:I

    .line 774
    iput v8, v7, Ll/ܳۙᩴ;->᩸:I

    .line 775
    iget-object v2, v13, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    .line 549
    iget-boolean v3, v13, Ll/۬ۡ᩸;->ܳۙ:Z

    invoke-virtual {v13, v8, v3}, Ll/۬ۡ᩸;->ۙ(IZ)I

    move-result v3

    .line 127
    invoke-virtual {v2, v3}, Ll/ۜۙᩴ;->᩸(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v2

    .line 776
    iget v3, v2, Ll/ܰۙᩴ;->᩶:I

    .line 777
    iget-object v4, v13, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    new-instance v5, Ll/ۧۙᩴ;

    invoke-direct {v5, v4}, Ll/ۧۙᩴ;-><init>(Ll/ܽۙᩴ;)V

    .line 779
    invoke-virtual {v5, v3}, Ll/ۧۙᩴ;->ۤ(I)Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-virtual {v5}, Ll/ۧۙᩴ;->᩷()I

    move-result v4

    if-nez v4, :cond_15

    goto/16 :goto_16

    .line 784
    :cond_15
    invoke-virtual/range {v58 .. v58}, Ll/ۚۚܺ;->ܽ()I

    move-result v4

    .line 786
    iget v2, v2, Ll/ܰۙᩴ;->ܿ:I

    const/16 v25, 0x0

    move/from16 v25, v3

    const/4 v3, 0x0

    :goto_11
    if-ge v2, v8, :cond_18

    move/from16 v36, v8

    .line 787
    invoke-virtual {v1, v2}, Ll/ܳܿ᩸;->charAt(I)C

    move-result v8

    move-object/from16 v37, v1

    const/16 v1, 0xa

    if-eq v8, v1, :cond_18

    const/16 v1, 0xd

    if-ne v8, v1, :cond_16

    goto :goto_13

    :cond_16
    const/16 v1, 0x9

    if-ne v8, v1, :cond_17

    .line 791
    rem-int v1, v3, v4

    sub-int v1, v4, v1

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_12

    :cond_17
    add-int/lit8 v3, v3, 0x1

    :goto_12
    add-int/lit8 v2, v2, 0x1

    move/from16 v8, v36

    move-object/from16 v1, v37

    goto :goto_11

    .line 799
    :cond_18
    :goto_13
    invoke-virtual {v5, v3}, Ll/ۧۙᩴ;->ۙ(I)Z

    move-result v1

    if-eqz v1, :cond_1b

    move/from16 v1, v25

    :goto_14
    if-lez v1, :cond_19

    add-int/lit8 v2, v1, -0x1

    .line 802
    invoke-virtual {v5, v2}, Ll/ۧۙᩴ;->ۤ(I)Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-virtual {v5, v3}, Ll/ۧۙᩴ;->ۙ(I)Z

    move-result v2

    if-eqz v2, :cond_19

    add-int/lit8 v1, v1, -0x1

    goto :goto_14

    :cond_19
    :goto_15
    add-int/lit8 v2, v25, 0x1

    .line 810
    invoke-virtual {v5, v2}, Ll/ۧۙᩴ;->ۤ(I)Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-virtual {v5, v3}, Ll/ۧۙᩴ;->ۙ(I)Z

    move-result v4

    if-eqz v4, :cond_1a

    move/from16 v25, v2

    goto :goto_15

    .line 816
    :cond_1a
    iput v3, v7, Ll/ܳۙᩴ;->ᩴ:I

    .line 817
    iput v1, v7, Ll/ܳۙᩴ;->᩷:I

    .line 818
    iput v2, v7, Ll/ܳۙᩴ;->ۤ:I

    goto :goto_17

    :cond_1b
    const/4 v1, -0x1

    .line 820
    iput v1, v7, Ll/ܳۙᩴ;->ᩴ:I

    goto :goto_17

    :cond_1c
    :goto_16
    const/4 v1, -0x1

    .line 780
    iput v1, v7, Ll/ܳۙᩴ;->ᩴ:I

    goto :goto_17

    :cond_1d
    move-object/from16 v6, v62

    .line 1015
    :goto_17
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v8

    .line 1016
    invoke-virtual {v6}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v15, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    move-object/from16 v5, v58

    .line 1027
    iget-boolean v1, v5, Ll/ܰۤᩴ;->ۡ᩷:Z

    if-eqz v1, :cond_25

    .line 1031
    invoke-virtual/range {p11 .. p11}, Ll/ܽ֨᩸;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_1f

    .line 1032
    invoke-virtual/range {p11 .. p11}, Ll/ܽ֨᩸;->ۙ()I

    move-result v1

    .line 1033
    invoke-virtual/range {p11 .. p11}, Ll/ܽ֨᩸;->᩷()I

    move-result v2

    if-ne v1, v2, :cond_1e

    goto :goto_18

    :cond_1e
    move/from16 v25, v1

    move/from16 v36, v2

    goto :goto_19

    :cond_1f
    :goto_18
    const/4 v1, -0x1

    const/4 v2, -0x1

    const/16 v25, -0x1

    const/16 v36, -0x1

    .line 1041
    :goto_19
    iget-boolean v1, v5, Ll/ܰۤᩴ;->֨ۙ:Z

    .line 1042
    iget-boolean v2, v5, Ll/ܰۤᩴ;->᩻᩷:Z

    if-eqz v1, :cond_21

    .line 1045
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    if-eqz v2, :cond_20

    int-to-float v1, v0

    const/4 v2, 0x0

    .line 1047
    invoke-virtual {v15, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_1a

    :cond_20
    const/4 v1, 0x0

    sub-int v2, v41, v12

    int-to-float v2, v2

    .line 1049
    invoke-virtual {v15, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    :goto_1a
    move/from16 v3, p3

    .line 1051
    invoke-static {v14, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v15, v2, v1, v12, v10}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v4, v10

    move-object/from16 v58, v5

    move/from16 v5, v48

    move-object/from16 v65, v6

    move/from16 v6, v63

    move-object/from16 v66, v7

    move/from16 v7, v25

    move/from16 v68, v8

    move/from16 v67, v40

    move/from16 v8, v36

    move-object/from16 v72, v9

    move/from16 v13, v41

    move/from16 v69, v46

    move/from16 v70, v47

    move/from16 v71, v56

    move/from16 v9, v27

    move v13, v10

    move v10, v11

    move/from16 p3, v11

    move-object/from16 v73, v31

    move-object/from16 v74, v33

    move-object/from16 v11, v58

    move/from16 v46, v13

    move/from16 v31, v16

    move/from16 v77, v17

    move/from16 v33, v18

    move/from16 v16, v19

    move/from16 v37, v20

    move/from16 v78, v21

    move-object/from16 v40, v22

    move/from16 v75, v23

    move/from16 v76, v24

    move v13, v12

    move-object/from16 v12, v40

    .line 1052
    invoke-direct/range {v1 .. v12}, Ll/۬ۡ᩸;->ۙ(Landroid/graphics/Canvas;IIIIIIFZLl/ܰۤᩴ;Ll/ۢܺۤ;)V

    .line 1055
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    move/from16 v0, v46

    goto/16 :goto_1b

    :cond_21
    move/from16 v3, p3

    move-object/from16 v58, v5

    move-object/from16 v65, v6

    move-object/from16 v66, v7

    move/from16 v68, v8

    move-object/from16 v72, v9

    move/from16 p3, v11

    move v13, v12

    move/from16 v77, v17

    move/from16 v37, v20

    move/from16 v78, v21

    move/from16 v75, v23

    move/from16 v76, v24

    move-object/from16 v73, v31

    move-object/from16 v74, v33

    move/from16 v67, v40

    move/from16 v69, v46

    move/from16 v70, v47

    move/from16 v71, v56

    move/from16 v46, v10

    move/from16 v31, v16

    move/from16 v33, v18

    move/from16 v16, v19

    move-object/from16 v40, v22

    if-eqz v2, :cond_23

    if-gt v0, v13, :cond_22

    .line 1059
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 1060
    invoke-static {v14, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    move/from16 v12, v46

    invoke-virtual {v15, v0, v1, v13, v12}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v4, v12

    move/from16 v5, v48

    move/from16 v6, v63

    move/from16 v7, v25

    move/from16 v8, v36

    move/from16 v9, v27

    move/from16 v10, p3

    move-object/from16 v11, v58

    move v0, v12

    move-object/from16 v12, v40

    .line 1061
    invoke-direct/range {v1 .. v12}, Ll/۬ۡ᩸;->ۙ(Landroid/graphics/Canvas;IIIIIIFZLl/ܰۤᩴ;Ll/ۢܺۤ;)V

    .line 1064
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    :goto_1b
    move/from16 v12, p2

    move v11, v0

    move/from16 v0, v41

    goto/16 :goto_1e

    :cond_22
    move/from16 v12, p2

    move/from16 v0, v41

    goto :goto_1d

    :cond_23
    move/from16 v0, v46

    int-to-float v1, v13

    sub-float v1, v50, v1

    move/from16 v12, v41

    int-to-float v2, v12

    cmpl-float v4, v2, v1

    if-ltz v4, :cond_24

    .line 1070
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    const/4 v4, 0x0

    .line 1071
    invoke-virtual {v15, v1, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1072
    invoke-static {v14, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v2, v1

    int-to-float v1, v0

    const/4 v5, 0x0

    invoke-virtual {v15, v5, v4, v2, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v4, v0

    move/from16 v5, v48

    move/from16 v6, v63

    move/from16 v7, v25

    move/from16 v8, v36

    move/from16 v9, v27

    move/from16 v10, p3

    move-object/from16 v11, v58

    move/from16 v46, v0

    move v0, v12

    move-object/from16 v12, v40

    .line 1073
    invoke-direct/range {v1 .. v12}, Ll/۬ۡ᩸;->ۙ(Landroid/graphics/Canvas;IIIIIIFZLl/ܰۤᩴ;Ll/ۢܺۤ;)V

    .line 1076
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_1c

    :cond_24
    move/from16 v46, v0

    move v0, v12

    :goto_1c
    move/from16 v12, p2

    :goto_1d
    move/from16 v11, v46

    goto :goto_1e

    :cond_25
    move-object/from16 v58, v5

    move-object/from16 v65, v6

    move-object/from16 v66, v7

    move/from16 v68, v8

    move-object/from16 v72, v9

    move/from16 p3, v11

    move v13, v12

    move/from16 v77, v17

    move/from16 v37, v20

    move/from16 v78, v21

    move/from16 v75, v23

    move/from16 v76, v24

    move-object/from16 v73, v31

    move-object/from16 v74, v33

    move/from16 v67, v40

    move/from16 v0, v41

    move/from16 v69, v46

    move/from16 v70, v47

    move/from16 v71, v56

    move/from16 v31, v16

    move/from16 v33, v18

    move/from16 v16, v19

    move-object/from16 v40, v22

    move/from16 v12, p2

    move v11, v10

    :goto_1e
    int-to-float v10, v12

    int-to-float v9, v0

    move-object/from16 v8, v58

    .line 1088
    iget-boolean v1, v8, Ll/ܰۤᩴ;->ۡ᩷:Z

    if-eqz v1, :cond_29

    .line 1089
    iget-boolean v1, v8, Ll/ܰۤᩴ;->֨ۙ:Z

    if-eqz v1, :cond_27

    .line 1091
    iget-boolean v1, v8, Ll/ܰۤᩴ;->᩻᩷:Z

    if-eqz v1, :cond_26

    add-int v1, v12, v13

    goto :goto_1f

    :cond_26
    sub-int v1, v0, v13

    int-to-float v1, v1

    goto :goto_20

    .line 1098
    :cond_27
    iget-boolean v1, v8, Ll/ܰۤᩴ;->᩻᩷:Z

    if-eqz v1, :cond_28

    .line 1099
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_1f
    int-to-float v1, v1

    goto :goto_21

    :cond_28
    int-to-float v1, v13

    sub-float v1, v50, v1

    .line 1101
    invoke-static {v9, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    :goto_20
    const/4 v2, 0x0

    move v2, v1

    move v1, v10

    goto :goto_22

    :cond_29
    move v1, v10

    :goto_21
    const/4 v2, 0x0

    move v2, v9

    :goto_22
    move/from16 v7, v49

    const/4 v3, 0x0

    .line 1106
    invoke-virtual {v15, v7, v3}, Landroid/graphics/Canvas;->translate(FF)V

    sub-float v6, v1, v7

    sub-float v5, v2, v7

    int-to-float v14, v14

    int-to-float v4, v11

    .line 1110
    invoke-virtual {v15, v6, v14, v5, v4}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 1113
    invoke-virtual {v8}, Ll/ۚۚܺ;->᩸()F

    move-result v1

    sub-float v1, v6, v1

    float-to-int v3, v1

    .line 1114
    invoke-virtual {v8}, Ll/ۚۚܺ;->᩸()F

    move-result v1

    add-float/2addr v1, v5

    float-to-int v2, v1

    move/from16 v41, v0

    move/from16 v0, v55

    move/from16 v1, v64

    if-eq v1, v0, :cond_2a

    const/16 v17, 0x1

    const/16 v36, 0x1

    goto :goto_23

    :cond_2a
    const/16 v17, 0x0

    const/16 v36, 0x0

    :goto_23
    if-nez v36, :cond_2b

    move/from16 v17, v2

    move/from16 v46, v13

    move-object/from16 v13, p0

    .line 1120
    invoke-virtual {v13, v1}, Ll/۬ۡ᩸;->᩸(I)I

    move-result v2

    move-object/from16 v12, v39

    invoke-virtual {v12, v2}, Ll/ۜۙᩴ;->᩻(I)I

    move-result v2

    move/from16 v64, v1

    goto :goto_24

    :cond_2b
    move/from16 v17, v2

    move/from16 v46, v13

    move-object/from16 v12, v39

    move-object/from16 v13, p0

    .line 1123
    invoke-virtual {v13, v1}, Ll/۬ۡ᩸;->᩸(I)I

    move-result v2

    invoke-virtual {v12, v2}, Ll/ۜۙᩴ;->᩻(I)I

    move-result v2

    move/from16 v64, v1

    .line 1124
    invoke-virtual {v13, v0}, Ll/۬ۡ᩸;->᩸(I)I

    move-result v1

    invoke-virtual {v12, v1}, Ll/ۜۙᩴ;->᩻(I)I

    move-result v1

    if-ne v2, v1, :cond_2c

    goto :goto_24

    :cond_2c
    const/4 v2, -0x1

    .line 1136
    :goto_24
    iget-object v1, v13, Ll/۬ۡ᩸;->ۧ:Ll/۠ۡ᩸;

    move/from16 v55, v0

    move-object/from16 v0, v72

    iput-object v0, v1, Ll/۠ۡ᩸;->ܳ:Ljava/lang/CharSequence;

    move/from16 v18, v2

    if-eqz v51, :cond_2d

    move-object/from16 v2, p9

    goto :goto_25

    :cond_2d
    move-object/from16 v2, v53

    .line 1137
    :goto_25
    iput-object v2, v1, Ll/۠ۡ᩸;->ۙ:Ll/֨ܽᩴ;

    move/from16 v2, p3

    .line 1138
    iput-boolean v2, v1, Ll/۠ۡ᩸;->᩷:Z

    move-object/from16 v72, v0

    move/from16 v19, v14

    move/from16 v0, v48

    move/from16 v15, v63

    move-object/from16 v14, p9

    if-eqz v51, :cond_2e

    .line 1142
    invoke-direct {v13, v14, v0, v15}, Ll/۬ۡ᩸;->ۙ(Ll/֨ܽᩴ;II)V

    :cond_2e
    if-nez v2, :cond_30

    if-lez p4, :cond_30

    move/from16 v79, v55

    move-object/from16 v20, v1

    if-lez p5, :cond_2f

    .line 1148
    invoke-virtual {v12, v0}, Ll/ۜۙᩴ;->ۨ(I)I

    move-result v1

    invoke-virtual {v12, v15}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v21

    move/from16 p3, v2

    invoke-virtual/range {v21 .. v21}, Ll/ܰۙᩴ;->ۙ()I

    move-result v2

    move-object/from16 v14, v65

    .line 1147
    invoke-virtual {v14, v13, v1, v2}, Ll/᩺ۜ᩸;->ۙ(Ll/۬ۡ᩸;II)V

    goto :goto_27

    :cond_2f
    move/from16 p3, v2

    goto :goto_26

    :cond_30
    move-object/from16 v20, v1

    move/from16 p3, v2

    move/from16 v79, v55

    :goto_26
    move-object/from16 v14, v65

    .line 1152
    :goto_27
    iget-object v2, v8, Ll/ܰۤᩴ;->ܺۙ:Ll/ܰۡ᩸;

    if-eqz v2, :cond_31

    .line 1154
    invoke-virtual/range {p0 .. p0}, Ll/۬ۡ᩸;->ۛ()Z

    move-result v21

    move-object/from16 v62, v14

    move-object/from16 p4, v20

    move/from16 v14, v64

    move-object v1, v2

    move/from16 v39, p3

    move-object/from16 v48, v2

    move/from16 v47, v17

    move/from16 v14, v18

    move-object v2, v12

    move/from16 v49, v3

    move v3, v0

    move v14, v4

    move v4, v15

    move/from16 v55, v5

    move v5, v6

    move/from16 v56, v6

    move/from16 v6, v55

    move/from16 v17, v7

    move/from16 v7, v21

    move-object/from16 v58, v8

    move-object/from16 v8, p1

    move/from16 v57, v9

    move-object/from16 v9, v40

    move/from16 v63, v10

    move-object/from16 v10, p4

    move/from16 v65, v11

    move-object/from16 v11, v58

    invoke-interface/range {v1 .. v11}, Ll/ܰۡ᩸;->ۙ(Ll/ۜۙᩴ;IIFFZLandroid/graphics/Canvas;Ll/ۢܺۤ;Ll/۟ۤᩴ;Ll/ܰۤᩴ;)V

    goto :goto_28

    :cond_31
    move/from16 v39, p3

    move-object/from16 v48, v2

    move/from16 v49, v3

    move/from16 v55, v5

    move/from16 v56, v6

    move-object/from16 v58, v8

    move/from16 v57, v9

    move/from16 v63, v10

    move/from16 v65, v11

    move-object/from16 v62, v14

    move/from16 v47, v17

    move-object/from16 p4, v20

    move v14, v4

    move/from16 v17, v7

    :goto_28
    move-object/from16 v11, v58

    .line 1157
    iget-object v10, v11, Ll/ܰۤᩴ;->ܽ᩷:Ll/ܰܿ᩹;

    .line 1158
    invoke-virtual {v10}, Ll/ܰܿ᩹;->size()I

    move-result v9

    if-lez v0, :cond_32

    add-int/lit8 v5, v0, -0x1

    .line 1170
    invoke-virtual {v12, v5}, Ll/ۜۙᩴ;->᩻(I)I

    move-result v1

    .line 1171
    invoke-virtual {v12, v5}, Ll/ۜۙᩴ;->᩸(I)I

    move-result v2

    invoke-virtual {v12, v2}, Ll/ۜۙᩴ;->ۨ(I)I

    move-result v2

    .line 1172
    invoke-virtual {v12, v5}, Ll/ۜۙᩴ;->ᩴ(I)I

    move-result v3

    invoke-virtual {v12, v3}, Ll/ۜۙᩴ;->᩷(I)I

    move-result v3

    goto :goto_29

    :cond_32
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v1, -0x1

    .line 1180
    :goto_29
    invoke-virtual {v12}, Ll/ۜۙᩴ;->᩷()Ll/ܿۙᩴ;

    move-result-object v8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    move v7, v0

    move/from16 v6, v45

    move-object/from16 p3, v53

    move-object/from16 v4, p3

    move-object/from16 v22, v4

    const/4 v5, -0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_2a
    const v45, 0x493e0

    move/from16 v23, v0

    .line 1182
    iget-object v0, v13, Ll/۬ۡ᩸;->᩻ۙ:Landroid/graphics/RectF;

    move-object/from16 v58, v0

    iget-object v0, v13, Ll/۬ۡ᩸;->ۧۙ:Landroid/graphics/RectF;

    const/high16 v80, 0x3fc00000    # 1.5f

    if-gt v7, v15, :cond_70

    move/from16 v24, v15

    .line 1183
    invoke-virtual {v8, v7}, Ll/ܿۙᩴ;->ۙ(I)Ll/ܰۙᩴ;

    move-result-object v15

    move/from16 p5, v2

    .line 1190
    iget v2, v15, Ll/ܰۙᩴ;->᩶:I

    if-ne v1, v2, :cond_34

    .line 1192
    invoke-virtual/range {p0 .. p0}, Ll/۬ۡ᩸;->ۛ()Z

    move-result v2

    if-nez v2, :cond_33

    const/4 v2, 0x0

    goto :goto_2b

    :cond_33
    move/from16 v2, v75

    :goto_2b
    move-object/from16 v25, v12

    move v12, v3

    move v3, v1

    move/from16 v1, p5

    goto :goto_2c

    .line 1197
    :cond_34
    invoke-virtual {v12, v7}, Ll/ۜۙᩴ;->᩸(I)I

    move-result v1

    invoke-virtual {v12, v1}, Ll/ۜۙᩴ;->ۨ(I)I

    move-result v1

    .line 1198
    invoke-virtual {v12, v7}, Ll/ۜۙᩴ;->ᩴ(I)I

    move-result v3

    invoke-virtual {v12, v3}, Ll/ۜۙᩴ;->᩷(I)I

    move-result v3

    const/16 v25, 0x0

    move-object/from16 v25, v12

    move v12, v3

    move v3, v2

    const/4 v2, 0x0

    :goto_2c
    move-object/from16 v81, v0

    int-to-float v0, v2

    move/from16 p5, v2

    const/4 v2, 0x0

    move-object/from16 v82, v8

    move/from16 v83, v24

    move-object/from16 v8, p1

    .line 1202
    invoke-virtual {v8, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    sub-float v24, v56, v0

    sub-float v84, v55, v0

    .line 1208
    invoke-virtual {v15}, Ll/ܰۙᩴ;->᩷()Z

    move-result v2

    .line 1209
    iget v8, v15, Ll/ܰۙᩴ;->ܿ:I

    if-eqz v2, :cond_35

    add-int v45, v8, v45

    move/from16 v85, v0

    move/from16 v2, v45

    goto :goto_2d

    .line 1210
    :cond_35
    iget v2, v15, Ll/ܰۙᩴ;->ܰ:I

    move/from16 v85, v0

    :goto_2d
    float-to-int v0, v6

    move-object/from16 v86, v10

    int-to-float v10, v0

    move/from16 v45, v0

    add-int/lit8 v0, v7, 0x1

    .line 1212
    invoke-virtual {v13, v0}, Ll/۬ۡ᩸;->ۤ(I)F

    move-result v87

    move/from16 v88, v2

    add-float v2, v87, v44

    float-to-int v2, v2

    int-to-float v2, v2

    cmpg-float v87, v10, v14

    if-gez v87, :cond_36

    move/from16 v87, v14

    move/from16 v14, v67

    move/from16 v67, v3

    int-to-float v3, v14

    cmpg-float v3, v3, v2

    if-gez v3, :cond_37

    const/4 v3, 0x1

    move/from16 v3, v70

    const/16 v70, 0x1

    goto :goto_2e

    :cond_36
    move/from16 v87, v14

    move/from16 v14, v67

    move/from16 v67, v3

    :cond_37
    const/4 v3, 0x0

    move/from16 v3, v70

    const/16 v70, 0x0

    :goto_2e
    move/from16 v106, v71

    move/from16 v71, v14

    move/from16 v14, v106

    if-eq v3, v14, :cond_3a

    if-ltz v3, :cond_3a

    if-ltz v14, :cond_3a

    if-gt v1, v3, :cond_38

    if-lt v3, v12, :cond_39

    :cond_38
    if-gt v3, v1, :cond_3a

    if-ge v1, v14, :cond_3a

    :cond_39
    move/from16 v91, p5

    move/from16 v90, v0

    move/from16 p5, v2

    move-object/from16 v89, v4

    move/from16 v93, v6

    move-object/from16 v92, v11

    move-object/from16 v0, v40

    move/from16 v13, v88

    move v11, v5

    move/from16 v88, v7

    move-object/from16 v40, v15

    move v15, v1

    move v7, v3

    goto/16 :goto_2f

    :cond_3a
    move/from16 v89, v1

    .line 1224
    iget v1, v15, Ll/ܰۙᩴ;->᩶:I

    move/from16 v90, v0

    move/from16 v0, v18

    if-ne v0, v1, :cond_3c

    iget-boolean v1, v11, Ll/ܰۤᩴ;->᩶᩷:Z

    if-eqz v1, :cond_3b

    iget-boolean v1, v11, Ll/ܰۤᩴ;->۬ۙ:Z

    if-eqz v1, :cond_3c

    .line 1226
    :cond_3b
    iget v1, v11, Ll/ܰۤᩴ;->ۚۙ:I

    move/from16 v18, v0

    move-object/from16 v0, v40

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v40, v15

    move/from16 v15, v89

    move-object/from16 v1, p1

    move/from16 v91, p5

    move/from16 p5, v2

    move/from16 v13, v88

    move/from16 v2, v24

    move/from16 v88, v7

    move v7, v3

    move/from16 v106, v67

    move/from16 v67, v9

    move/from16 v9, v106

    move v3, v10

    move-object/from16 v89, v4

    move/from16 v4, v84

    move-object/from16 v92, v11

    move v11, v5

    move/from16 v5, p5

    move/from16 v93, v6

    move-object v6, v0

    .line 1227
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move v5, v11

    move-object/from16 v94, v72

    goto/16 :goto_33

    :cond_3c
    move/from16 v91, p5

    move/from16 v18, v0

    move/from16 p5, v2

    move/from16 v93, v6

    move-object/from16 v92, v11

    move-object/from16 v0, v40

    move/from16 v13, v88

    move v11, v5

    move/from16 v88, v7

    move-object/from16 v40, v15

    move/from16 v15, v89

    move v7, v3

    move-object/from16 v89, v4

    :goto_2f
    move/from16 v106, v67

    move/from16 v67, v9

    move/from16 v9, v106

    if-nez v39, :cond_3e

    if-eqz v51, :cond_3e

    move-object/from16 v6, p9

    move-object/from16 v5, v72

    if-eq v9, v11, :cond_3d

    .line 1234
    invoke-virtual {v6, v15, v12, v5}, Ll/֨ܽᩴ;->ۙ(IILjava/lang/CharSequence;)Ll/ۧ᩻ᩴ;

    move-result-object v22

    move v11, v9

    :cond_3d
    move-object/from16 v72, v22

    goto :goto_30

    :cond_3e
    move-object/from16 v6, p9

    move-object/from16 v5, v72

    move-object/from16 v72, v22

    move-object/from16 v22, v53

    :goto_30
    if-eqz v22, :cond_44

    .line 1243
    invoke-virtual/range {v22 .. v22}, Ll/ۧ᩻ᩴ;->ܽ()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move/from16 v2, v24

    move v3, v10

    move/from16 v4, v84

    move-object/from16 v94, v5

    move/from16 v5, p5

    move-object v6, v0

    .line 1244
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-eq v7, v14, :cond_45

    if-ltz v7, :cond_45

    if-ltz v14, :cond_45

    if-gt v8, v7, :cond_3f

    if-ge v13, v7, :cond_41

    :cond_3f
    if-gt v8, v14, :cond_40

    if-ge v13, v14, :cond_41

    :cond_40
    if-le v8, v7, :cond_45

    if-ge v13, v14, :cond_45

    :cond_41
    const/4 v1, 0x0

    if-ge v8, v7, :cond_42

    move-object/from16 v6, p4

    .line 1250
    invoke-virtual {v6, v8, v1, v7}, Ll/۠ۡ᩸;->ۙ(IFI)F

    move-result v2

    goto :goto_31

    :cond_42
    move-object/from16 v6, p4

    move/from16 v2, v24

    :goto_31
    if-ge v13, v14, :cond_43

    move/from16 v4, v84

    goto :goto_32

    .line 1251
    :cond_43
    invoke-virtual {v6, v8, v1, v14}, Ll/۠ۡ᩸;->ۙ(IFI)F

    move-result v1

    move v4, v1

    :goto_32
    move-object/from16 v5, v92

    .line 1252
    iget v1, v5, Ll/ܰۤᩴ;->ᩴۙ:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move v3, v10

    move-object/from16 v92, v5

    move/from16 v5, p5

    move-object/from16 p4, v6

    move-object v6, v0

    .line 1253
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move/from16 v22, v11

    goto :goto_34

    :cond_44
    move-object/from16 v94, v5

    :cond_45
    move v5, v11

    move-object/from16 v22, v72

    :goto_33
    move-object/from16 v72, v22

    move/from16 v22, v5

    :goto_34
    if-lez v67, :cond_49

    const/4 v1, 0x0

    move/from16 v6, v67

    const/4 v11, 0x0

    :goto_35
    if-ge v11, v6, :cond_48

    move-object/from16 v5, v86

    .line 1263
    invoke-virtual {v5, v11}, Ll/ܰܿ᩹;->getInt(I)I

    move-result v1

    move/from16 v4, v45

    if-ge v1, v4, :cond_46

    move/from16 v67, v4

    move-object/from16 v45, v5

    move/from16 v86, v6

    goto :goto_37

    :cond_46
    if-le v1, v4, :cond_47

    move-object/from16 v45, v5

    :goto_36
    move/from16 v86, v6

    goto :goto_38

    :cond_47
    add-int/lit8 v1, v11, 0x1

    .line 1271
    invoke-virtual {v5, v1}, Ll/ܰܿ᩹;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float v2, v1, v85

    add-int/lit8 v1, v11, 0x2

    .line 1272
    invoke-virtual {v5, v1}, Ll/ܰܿ᩹;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float v45, v1, v85

    add-int/lit8 v1, v11, 0x3

    .line 1273
    invoke-virtual {v5, v1}, Ll/ܰܿ᩹;->getInt(I)I

    move-result v1

    .line 1274
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move v3, v10

    move/from16 v67, v4

    move/from16 v4, v45

    move-object/from16 v45, v5

    move/from16 v5, p5

    move/from16 v86, v6

    move-object v6, v0

    .line 1275
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_37
    add-int/lit8 v11, v11, 0x4

    move/from16 v6, v86

    move-object/from16 v86, v45

    move/from16 v45, v67

    goto :goto_35

    :cond_48
    move-object/from16 v45, v86

    goto :goto_36

    :cond_49
    move-object/from16 v45, v86

    move/from16 v86, v67

    :goto_38
    if-eqz v52, :cond_4a

    move-object/from16 v1, p10

    move-object/from16 v2, p1

    move v3, v8

    move v4, v13

    move v5, v10

    move/from16 v6, p5

    move v11, v7

    move/from16 v67, v88

    move-object v7, v0

    move-object/from16 v95, v82

    move/from16 v82, v8

    move-object/from16 v8, v92

    move/from16 v88, v9

    move-object/from16 v9, p4

    .line 1280
    invoke-virtual/range {v1 .. v9}, Ll/ۖ᩷ᩴ;->ۙ(Landroid/graphics/Canvas;IIFFLl/ۢܺۤ;Ll/ܰۤᩴ;Ll/۟ۤᩴ;)V

    goto :goto_39

    :cond_4a
    move v11, v7

    move-object/from16 v95, v82

    move/from16 v67, v88

    move/from16 v82, v8

    move/from16 v88, v9

    .line 1283
    :goto_39
    invoke-virtual/range {p11 .. p11}, Ll/ܽ֨᩸;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_4b

    move-object/from16 v1, p11

    move-object/from16 v2, p1

    move/from16 v3, v82

    move v4, v13

    move v5, v10

    move/from16 v6, p5

    move-object v7, v0

    move-object/from16 v8, v92

    move-object/from16 v9, p4

    .line 1284
    invoke-virtual/range {v1 .. v9}, Ll/ܽ֨᩸;->ۙ(Landroid/graphics/Canvas;IIFFLl/ۢܺۤ;Ll/ܰۤᩴ;Ll/۟ۤᩴ;)V

    :cond_4b
    if-eqz v36, :cond_63

    move/from16 v9, v64

    move/from16 v7, v82

    if-gt v7, v9, :cond_4d

    if-ge v13, v9, :cond_4c

    goto :goto_3a

    :cond_4c
    move/from16 v8, v79

    goto :goto_3b

    :cond_4d
    :goto_3a
    move/from16 v8, v79

    if-gt v7, v8, :cond_4e

    if-ge v13, v8, :cond_4f

    :cond_4e
    if-le v7, v9, :cond_62

    if-ge v13, v8, :cond_62

    .line 1295
    :cond_4f
    :goto_3b
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1296
    invoke-static {v13, v8}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x0

    move-object/from16 v6, p4

    .line 1297
    invoke-virtual {v6, v7, v3, v1}, Ll/۠ۡ᩸;->ۙ(IFI)F

    move-result v64

    .line 1298
    invoke-virtual {v6, v7, v3, v2}, Ll/۠ۡ᩸;->ۙ(IFI)F

    move-result v1

    if-ge v13, v8, :cond_51

    if-nez v42, :cond_50

    if-ne v13, v12, :cond_51

    :cond_50
    move-object/from16 v5, v92

    .line 1301
    iget v2, v5, Ll/ܰۤᩴ;->ܳۙ:F

    add-float/2addr v1, v2

    goto :goto_3c

    :cond_51
    move-object/from16 v5, v92

    :goto_3c
    move/from16 v4, v32

    move/from16 v32, v1

    .line 1303
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move/from16 v2, v64

    move v3, v10

    move/from16 v79, v4

    move/from16 v4, v32

    move/from16 v82, v13

    move-object v13, v5

    move/from16 v5, p5

    move/from16 v92, v10

    move-object v10, v6

    move-object v6, v0

    .line 1304
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/high16 v1, 0x3f400000    # 0.75f

    if-lt v9, v7, :cond_5a

    const/high16 v2, 0x3e800000    # 0.25f

    if-eqz v42, :cond_52

    move-object/from16 v6, p0

    move/from16 v5, v82

    goto :goto_3d

    :cond_52
    move-object/from16 v6, p0

    move/from16 v5, v82

    .line 1312
    iget-boolean v3, v6, Ll/۬ۡ᩸;->ܳۙ:Z

    if-eqz v3, :cond_53

    if-ne v9, v5, :cond_55

    if-lt v9, v12, :cond_54

    goto :goto_3d

    :cond_53
    if-ne v9, v7, :cond_55

    if-gt v9, v15, :cond_54

    goto :goto_3d

    :cond_54
    const/4 v3, 0x0

    goto :goto_3e

    :cond_55
    :goto_3d
    const/4 v3, 0x1

    :goto_3e
    if-eqz v3, :cond_57

    if-eqz v70, :cond_56

    cmpg-float v4, v24, v64

    if-gtz v4, :cond_56

    cmpg-float v4, v64, v84

    if-gtz v4, :cond_56

    const/16 v20, 0x1

    goto :goto_3f

    :cond_56
    const/4 v3, 0x0

    :cond_57
    :goto_3f
    if-eqz v3, :cond_58

    move-object/from16 v4, p8

    .line 1328
    iget-boolean v3, v4, Ll/ۖۡ᩸;->ܳ:Z

    if-eqz v3, :cond_59

    .line 1329
    iget-object v3, v13, Ll/ܰۤᩴ;->ܳۤ:Landroid/graphics/drawable/Drawable;

    move/from16 v82, v9

    .line 1330
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v9

    int-to-float v9, v9

    mul-float v89, v9, v1

    sub-float v89, v64, v89

    mul-float v96, v16, v80

    sub-float v89, v89, v96

    add-float v89, v89, v85

    add-float v1, v89, v17

    mul-float v9, v9, v2

    add-float v9, v9, v64

    sub-float v9, v9, v96

    add-float v9, v9, v85

    add-float v9, v9, v17

    move/from16 v64, v2

    .line 1335
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    int-to-float v2, v2

    move-object/from16 v96, v0

    move/from16 v0, p5

    add-float/2addr v2, v0

    move-object/from16 p5, v10

    move-object/from16 v10, v81

    .line 1336
    invoke-virtual {v10, v1, v0, v9, v2}, Landroid/graphics/RectF;->set(FFFF)V

    float-to-int v1, v1

    float-to-int v10, v0

    move-object/from16 v97, v13

    move/from16 v81, v14

    float-to-double v13, v9

    .line 1337
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v13

    double-to-int v9, v13

    float-to-double v13, v2

    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v13

    double-to-int v2, v13

    invoke-virtual {v3, v1, v10, v9, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    move-object/from16 v89, v3

    :goto_40
    move/from16 v2, v64

    goto :goto_41

    :cond_58
    move-object/from16 v4, p8

    :cond_59
    move-object/from16 v96, v0

    move/from16 v64, v2

    move/from16 v82, v9

    move-object/from16 v97, v13

    move/from16 v81, v14

    move/from16 v0, p5

    move-object/from16 p5, v10

    goto :goto_40

    :cond_5a
    move-object/from16 v6, p0

    move-object/from16 v4, p8

    move-object/from16 v96, v0

    move-object/from16 v97, v13

    move/from16 v81, v14

    move/from16 v5, v82

    move/from16 v0, p5

    move/from16 v82, v9

    move-object/from16 p5, v10

    const/high16 v2, 0x3e800000    # 0.25f

    :goto_41
    if-gt v8, v5, :cond_61

    if-eqz v42, :cond_5b

    goto :goto_42

    .line 1346
    :cond_5b
    iget-boolean v1, v6, Ll/۬ۡ᩸;->ܳۙ:Z

    if-eqz v1, :cond_5c

    if-ne v8, v5, :cond_5e

    if-lt v8, v12, :cond_5d

    goto :goto_42

    :cond_5c
    if-ne v8, v7, :cond_5e

    if-gt v8, v15, :cond_5d

    goto :goto_42

    :cond_5d
    const/4 v1, 0x0

    goto :goto_43

    :cond_5e
    :goto_42
    const/4 v1, 0x1

    :goto_43
    if-eqz v1, :cond_60

    if-eqz v70, :cond_5f

    cmpg-float v3, v24, v32

    if-gtz v3, :cond_5f

    cmpg-float v3, v32, v84

    if-gtz v3, :cond_5f

    const/4 v3, 0x1

    const/16 v21, 0x1

    goto :goto_44

    :cond_5f
    const/4 v1, 0x0

    :cond_60
    :goto_44
    if-eqz v1, :cond_61

    .line 1362
    iget-boolean v1, v4, Ll/ۖۡ᩸;->ܳ:Z

    if-eqz v1, :cond_61

    move-object/from16 v13, v97

    .line 1363
    iget-object v1, v13, Ll/ܰۤᩴ;->۫ۤ:Landroid/graphics/drawable/Drawable;

    .line 1364
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    mul-float v2, v2, v3

    sub-float v2, v32, v2

    mul-float v9, v16, v80

    add-float/2addr v2, v9

    add-float v2, v2, v85

    add-float v2, v2, v17

    const/high16 v10, 0x3f400000    # 0.75f

    mul-float v3, v3, v10

    add-float v3, v3, v32

    add-float/2addr v3, v9

    add-float v3, v3, v85

    add-float v3, v3, v17

    .line 1369
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v9

    int-to-float v9, v9

    add-float/2addr v9, v0

    move-object/from16 v14, v58

    .line 1370
    invoke-virtual {v14, v2, v0, v3, v9}, Landroid/graphics/RectF;->set(FFFF)V

    float-to-int v2, v2

    float-to-int v10, v0

    float-to-double v3, v3

    .line 1371
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v3, v3

    move/from16 v32, v8

    float-to-double v8, v9

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-int v4, v8

    invoke-virtual {v1, v2, v10, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    move-object v14, v1

    goto :goto_46

    :cond_61
    move/from16 v32, v8

    move-object/from16 v13, v97

    goto :goto_45

    :cond_62
    move-object/from16 v6, p0

    move-object/from16 v96, v0

    move/from16 v82, v9

    move v5, v13

    move/from16 v81, v14

    move/from16 v79, v32

    move-object/from16 v13, v92

    move/from16 v0, p5

    move/from16 v32, v8

    move/from16 v92, v10

    move-object/from16 p5, p4

    goto :goto_45

    :cond_63
    move-object/from16 v6, p0

    move-object/from16 v96, v0

    move v5, v13

    move/from16 v81, v14

    move/from16 v7, v82

    move-object/from16 v13, v92

    move/from16 v0, p5

    move/from16 v92, v10

    move/from16 v82, v64

    move-object/from16 p5, p4

    move/from16 v106, v79

    move/from16 v79, v32

    move/from16 v32, v106

    :goto_45
    move-object/from16 v14, p3

    :goto_46
    move/from16 v10, v81

    if-eq v11, v10, :cond_69

    if-ltz v11, :cond_69

    if-ltz v10, :cond_69

    if-gt v7, v11, :cond_64

    if-ge v5, v11, :cond_66

    :cond_64
    if-gt v7, v10, :cond_65

    if-ge v5, v10, :cond_66

    :cond_65
    if-le v7, v11, :cond_69

    if-ge v5, v10, :cond_69

    :cond_66
    const/4 v1, 0x0

    move-object/from16 v9, p5

    if-ge v7, v11, :cond_67

    .line 1382
    invoke-virtual {v9, v7, v1, v11}, Ll/۠ۡ᩸;->ۙ(IFI)F

    move-result v2

    goto :goto_47

    :cond_67
    move/from16 v2, v24

    :goto_47
    if-ge v5, v10, :cond_68

    move/from16 v4, v84

    goto :goto_48

    .line 1383
    :cond_68
    invoke-virtual {v9, v7, v1, v10}, Ll/۠ۡ᩸;->ۙ(IFI)F

    move-result v1

    move v4, v1

    .line 1384
    :goto_48
    iget v1, v13, Ll/ܰۤᩴ;->᩺᩷:I

    move-object/from16 v8, v96

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move/from16 v3, v92

    move/from16 v24, v12

    move-object/from16 v12, p8

    move-object/from16 p4, v9

    move v9, v5

    move v5, v0

    move-object v12, v6

    move-object v6, v8

    .line 1385
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_49

    :cond_69
    move-object/from16 p4, p5

    move v9, v5

    move/from16 v24, v12

    move-object/from16 v8, v96

    move-object v12, v6

    :goto_49
    if-eqz v29, :cond_6e

    move-object/from16 v6, v66

    .line 1393
    iget v1, v6, Ll/ܳۙᩴ;->᩷:I

    move-object/from16 v2, v40

    iget v2, v2, Ll/ܰۙᩴ;->᩶:I

    if-gt v1, v2, :cond_6a

    iget v1, v6, Ll/ܳۙᩴ;->ۤ:I

    if-ge v2, v1, :cond_6a

    .line 1394
    iget v1, v6, Ll/ܳۙᩴ;->ᩴ:I

    move v5, v1

    goto :goto_4a

    :cond_6a
    const/4 v1, -0x1

    const/4 v5, -0x1

    :goto_4a
    move-object/from16 v4, v61

    .line 1396
    invoke-virtual {v4, v2}, Ll/ۧۙᩴ;->ۤ(I)Z

    move-result v1

    if-eqz v1, :cond_6d

    .line 1397
    invoke-virtual {v4}, Ll/ۧۙᩴ;->᩷()I

    move-result v3

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_4b
    if-ge v2, v3, :cond_6d

    .line 1398
    invoke-virtual {v4, v2}, Ll/ۧۙᩴ;->᩷(I)I

    move-result v1

    if-ne v5, v1, :cond_6b

    const/16 v40, 0x1

    goto :goto_4c

    :cond_6b
    const/16 v40, 0x0

    :goto_4c
    int-to-float v1, v1

    .line 1400
    invoke-virtual {v13}, Ll/ۚۚܺ;->ܺ()F

    move-result v58

    mul-float v1, v1, v58

    float-to-int v1, v1

    move-object/from16 p3, v14

    move/from16 v14, v91

    sub-int/2addr v1, v14

    move/from16 v81, v10

    add-int/lit8 v10, v1, -0x1

    move/from16 v58, v2

    .line 1402
    iget v2, v13, Ll/ܰۤᩴ;->ᩴۙ:I

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v2, v1

    move-object/from16 v1, p1

    move/from16 v61, v2

    move/from16 v64, v3

    move/from16 v3, v92

    move-object/from16 v66, v4

    move/from16 v4, v61

    move/from16 v61, v5

    move v5, v0

    move-object/from16 v70, v6

    move-object v6, v8

    .line 1403
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    if-eqz v40, :cond_6c

    .line 1405
    iget v1, v13, Ll/ܰۤᩴ;->ۤ᩷:I

    goto :goto_4d

    :cond_6c
    iget v1, v13, Ll/ܰۤᩴ;->᩷᩷:I

    :goto_4d
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v4, v10

    move-object/from16 v1, p1

    move v2, v4

    move/from16 v3, v92

    move v5, v0

    move-object v6, v8

    .line 1406
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v2, v58, 0x1

    move/from16 v91, v14

    move/from16 v5, v61

    move/from16 v3, v64

    move-object/from16 v4, v66

    move-object/from16 v6, v70

    move/from16 v10, v81

    move-object/from16 v14, p3

    goto :goto_4b

    :cond_6d
    move-object/from16 v66, v4

    move-object/from16 v70, v6

    move/from16 v81, v10

    move-object/from16 p3, v14

    move/from16 v14, v91

    goto :goto_4e

    :cond_6e
    move/from16 v81, v10

    move-object/from16 p3, v14

    move-object/from16 v70, v66

    move/from16 v14, v91

    move-object/from16 v66, v61

    :goto_4e
    if-nez v39, :cond_6f

    if-eqz v51, :cond_6f

    if-ge v7, v9, :cond_6f

    sub-int v10, v47, v14

    move-object/from16 v1, p9

    move-object/from16 v2, p1

    move-object/from16 v3, v94

    move v4, v7

    move v5, v9

    move/from16 v6, v93

    move v7, v0

    move-object v0, v8

    move/from16 v9, v32

    move v8, v10

    move-object/from16 v32, p4

    move-object/from16 v40, v0

    move v0, v9

    move/from16 v10, v82

    move-object/from16 v9, v54

    move/from16 v58, v15

    move-object/from16 v98, v32

    move-object/from16 v61, v45

    move/from16 v32, v81

    move v15, v10

    move-object v10, v13

    move/from16 v64, v11

    move-object/from16 v11, v26

    .line 1411
    invoke-virtual/range {v1 .. v11}, Ll/֨ܽᩴ;->ۙ(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFILl/ۢܺۤ;Ll/ܰۤᩴ;[I)V

    goto :goto_4f

    :cond_6f
    move-object/from16 v98, p4

    move-object/from16 v40, v8

    move/from16 v64, v11

    move/from16 v58, v15

    move/from16 v0, v32

    move-object/from16 v61, v45

    move/from16 v32, v81

    move/from16 v15, v82

    :goto_4f
    move/from16 v7, v90

    .line 1415
    invoke-virtual {v12, v7}, Ll/۬ۡ᩸;->ۤ(I)F

    move-result v1

    add-float v6, v1, v44

    neg-int v1, v14

    int-to-float v1, v1

    const/4 v2, 0x0

    move-object/from16 v4, p1

    .line 1417
    invoke-virtual {v4, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    add-int/lit8 v7, v67, 0x1

    move-object v11, v13

    move/from16 v5, v22

    move/from16 v3, v24

    move/from16 v2, v58

    move-object/from16 v10, v61

    move-object/from16 v61, v66

    move-object/from16 v66, v70

    move/from16 v67, v71

    move-object/from16 v22, v72

    move/from16 v9, v86

    move/from16 v14, v87

    move/from16 v1, v88

    move-object/from16 v4, v89

    move-object/from16 v72, v94

    move-object/from16 v8, v95

    move-object/from16 p4, v98

    move-object v13, v12

    move-object/from16 v12, v25

    move/from16 v71, v32

    move/from16 v70, v64

    move/from16 v32, v79

    move/from16 v79, v0

    move/from16 v64, v15

    move/from16 v0, v23

    move/from16 v15, v83

    goto/16 :goto_2a

    :cond_70
    move-object/from16 v98, p4

    move/from16 p5, v2

    move-object/from16 v89, v4

    move-object/from16 v95, v8

    move/from16 v86, v9

    move-object/from16 v61, v10

    move-object/from16 v25, v12

    move-object v12, v13

    move/from16 v87, v14

    move/from16 v83, v15

    move-object/from16 v14, v58

    move/from16 v15, v64

    move/from16 v71, v67

    move-object/from16 v94, v72

    move-object/from16 v4, p1

    move-object v10, v0

    move-object v13, v11

    move/from16 v0, v79

    if-lez v86, :cond_71

    .line 1421
    invoke-virtual/range {v61 .. v61}, Ll/ܰܿ᩹;->clear()V

    .line 1430
    :cond_71
    iget-boolean v1, v13, Ll/ܰۤᩴ;->۫ۙ:Z

    if-eqz v1, :cond_73

    .line 1433
    iget-boolean v1, v13, Ll/ܰۤᩴ;->᩻᩷:Z

    if-eqz v1, :cond_72

    move/from16 v1, v76

    int-to-float v2, v1

    add-float v6, v56, v2

    move/from16 v11, v78

    add-int/2addr v1, v11

    goto :goto_50

    :cond_72
    move/from16 v1, v76

    move/from16 v11, v78

    add-int v2, v11, v1

    int-to-float v2, v2

    add-float v6, v56, v2

    :goto_50
    int-to-float v1, v1

    sub-float v5, v55, v1

    move/from16 v1, v19

    move/from16 v2, v87

    .line 1440
    invoke-virtual {v4, v6, v1, v5, v2}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    goto :goto_51

    :cond_73
    move/from16 v11, v78

    move/from16 v2, v87

    :goto_51
    move/from16 v1, v23

    .line 1443
    invoke-virtual {v12, v1}, Ll/۬ۡ᩸;->ۤ(I)F

    move-result v5

    add-float v5, v5, v44

    add-float v6, v5, v28

    if-lez v1, :cond_74

    add-int/lit8 v3, v1, -0x1

    move-object/from16 v7, v25

    .line 1447
    invoke-virtual {v7, v3}, Ll/ۜۙᩴ;->᩻(I)I

    move-result v8

    .line 1448
    invoke-virtual {v7, v3}, Ll/ۜۙᩴ;->᩸(I)I

    move-result v9

    invoke-virtual {v7, v9}, Ll/ۜۙᩴ;->ۨ(I)I

    move-result v9

    .line 1449
    invoke-virtual {v7, v3}, Ll/ۜۙᩴ;->ᩴ(I)I

    move-result v3

    invoke-virtual {v7, v3}, Ll/ۜۙᩴ;->᩷(I)I

    move-result v3

    goto :goto_52

    :cond_74
    move-object/from16 v7, v25

    const/4 v8, -0x1

    move/from16 v9, p5

    :goto_52
    move/from16 v29, v6

    move v6, v9

    move/from16 v78, v11

    move/from16 v32, v21

    move-object/from16 p4, v53

    move v9, v1

    move-object v1, v12

    move/from16 v12, v20

    .line 1454
    :goto_53
    iget-object v11, v1, Ll/۬ۡ᩸;->֫ۙ:Landroid/graphics/RectF;

    const/high16 v52, 0x40400000    # 3.0f

    const v53, 0xffffff

    move/from16 v58, v12

    move/from16 v12, v83

    if-gt v9, v12, :cond_9d

    move/from16 p5, v3

    move/from16 v83, v12

    move-object/from16 v12, v95

    .line 1455
    invoke-virtual {v12, v9}, Ll/ܿۙᩴ;->ۙ(I)Ll/ܰۙᩴ;

    move-result-object v3

    move/from16 p10, v6

    .line 1458
    invoke-virtual {v7}, Ll/ۜۙᩴ;->ᩴ()I

    move-result v6

    if-ge v9, v6, :cond_75

    add-int/lit8 v6, v9, 0x1

    invoke-virtual {v7, v6}, Ll/ۜۙᩴ;->᩻(I)I

    move-result v6

    move-object/from16 v81, v10

    iget v10, v3, Ll/ܰۙᩴ;->᩶:I

    if-ne v6, v10, :cond_76

    const/4 v6, 0x1

    const/16 v61, 0x1

    goto :goto_54

    :cond_75
    move-object/from16 v81, v10

    :cond_76
    const/4 v6, 0x0

    const/16 v61, 0x0

    .line 1462
    :goto_54
    iget v6, v3, Ll/ܰۙᩴ;->᩶:I

    if-ne v8, v6, :cond_78

    .line 1463
    invoke-virtual {v1}, Ll/۬ۡ᩸;->ۛ()Z

    move-result v6

    if-nez v6, :cond_77

    const/4 v6, 0x0

    goto :goto_55

    :cond_77
    move/from16 v6, v75

    :goto_55
    move/from16 v10, p5

    move/from16 v64, v8

    move v8, v6

    move/from16 v6, p10

    goto :goto_56

    .line 1467
    :cond_78
    invoke-virtual {v7, v9}, Ll/ۜۙᩴ;->᩸(I)I

    move-result v8

    invoke-virtual {v7, v8}, Ll/ۜۙᩴ;->ۨ(I)I

    move-result v8

    .line 1468
    invoke-virtual {v7, v9}, Ll/ۜۙᩴ;->ᩴ(I)I

    move-result v10

    invoke-virtual {v7, v10}, Ll/ۜۙᩴ;->᩷(I)I

    move-result v10

    const/16 v16, 0x0

    move/from16 v64, v6

    move v6, v8

    const/4 v8, 0x0

    :goto_56
    move-object/from16 v95, v12

    int-to-float v12, v8

    move-object/from16 v25, v7

    const/4 v7, 0x0

    .line 1471
    invoke-virtual {v4, v12, v7}, Landroid/graphics/Canvas;->translate(FF)V

    sub-float v66, v56, v12

    sub-float v67, v55, v12

    .line 1476
    invoke-virtual {v3}, Ll/ܰۙᩴ;->᩷()Z

    move-result v70

    .line 1477
    iget v7, v3, Ll/ܰۙᩴ;->ܿ:I

    if-eqz v70, :cond_79

    add-int v3, v7, v45

    goto :goto_57

    .line 1478
    :cond_79
    iget v3, v3, Ll/ܰۙᩴ;->ܰ:I

    :goto_57
    float-to-int v5, v5

    int-to-float v5, v5

    move-object/from16 v72, v11

    add-int/lit8 v11, v9, 0x1

    .line 1480
    invoke-virtual {v1, v11}, Ll/۬ۡ᩸;->ۤ(I)F

    move-result v16

    move/from16 v76, v9

    add-float v9, v16, v44

    float-to-int v9, v9

    int-to-float v9, v9

    cmpg-float v16, v5, v2

    move/from16 v87, v2

    if-gez v16, :cond_7a

    move-object/from16 v16, v14

    move/from16 v2, v71

    int-to-float v14, v2

    cmpg-float v14, v14, v9

    if-gez v14, :cond_7b

    const/4 v14, 0x1

    const/16 v71, 0x1

    goto :goto_58

    :cond_7a
    move-object/from16 v16, v14

    move/from16 v2, v71

    :cond_7b
    const/4 v14, 0x0

    const/16 v71, 0x0

    :goto_58
    if-eq v7, v3, :cond_86

    if-nez v30, :cond_80

    .line 1486
    iget-boolean v14, v13, Ll/ܰۤᩴ;->᩶᩷:Z

    if-eqz v14, :cond_7c

    iget-boolean v14, v13, Ll/ܰۤᩴ;->۬ۙ:Z

    if-eqz v14, :cond_80

    :cond_7c
    if-gt v6, v15, :cond_7d

    if-le v15, v10, :cond_80

    :cond_7d
    if-gt v6, v0, :cond_7e

    if-le v0, v10, :cond_80

    :cond_7e
    if-ge v15, v6, :cond_7f

    if-ge v10, v0, :cond_7f

    goto :goto_59

    :cond_7f
    const/4 v14, 0x0

    const/16 v79, 0x0

    goto :goto_5a

    :cond_80
    :goto_59
    const/4 v14, 0x1

    const/16 v79, 0x1

    :goto_5a
    const/high16 v82, 0x40000000    # 2.0f

    if-eqz v79, :cond_81

    if-lez v8, :cond_81

    move/from16 v14, v75

    move/from16 v75, v0

    int-to-float v0, v14

    sub-float v18, v27, v0

    div-float v18, v18, v82

    move/from16 v19, v2

    add-float v2, v18, v5

    add-float/2addr v0, v2

    move/from16 v84, v5

    neg-int v5, v14

    int-to-float v5, v5

    float-to-int v5, v5

    float-to-int v2, v2

    move/from16 v85, v6

    const/4 v6, 0x0

    move/from16 v88, v9

    move/from16 v86, v10

    float-to-double v9, v6

    .line 1500
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-int v6, v9

    float-to-double v9, v0

    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-int v0, v9

    move-object/from16 v10, v73

    invoke-virtual {v10, v5, v2, v6, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1501
    invoke-virtual {v10, v4}, Ll/᩻۠᩷;->draw(Landroid/graphics/Canvas;)V

    goto :goto_5b

    :cond_81
    move/from16 v19, v2

    move/from16 v84, v5

    move/from16 v85, v6

    move/from16 v88, v9

    move/from16 v86, v10

    move-object/from16 v10, v73

    move/from16 v14, v75

    move/from16 v75, v0

    :goto_5b
    sub-int v0, v49, v8

    sub-int v9, v47, v8

    if-eqz v39, :cond_82

    .line 1510
    iget v2, v13, Ll/ܰۤᩴ;->ۙ᩷:I

    move-object/from16 v6, v54

    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v2, 0x1

    .line 1512
    invoke-virtual {v1, v2}, Ll/۬ۡ᩸;->ۙ(Z)F

    move-result v2

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Ll/۬ۡ᩸;->ۙ(Z)F

    move-result v5

    sub-float/2addr v2, v5

    .line 1513
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    const/4 v5, 0x0

    .line 1514
    invoke-virtual {v4, v2, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1515
    iget-object v1, v1, Ll/۬ۡ᩸;->᩺:Ljava/lang/String;

    int-to-float v0, v0

    sub-float/2addr v0, v2

    float-to-double v4, v0

    .line 1516
    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v0, v4

    int-to-float v4, v9

    sub-float/2addr v4, v2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v2, v4

    const/4 v4, 0x0

    const/16 v26, 0x0

    const/4 v5, 0x0

    const/16 v23, 0x0

    move/from16 v100, v14

    move/from16 v101, v15

    move-object/from16 v102, v16

    move/from16 v54, v17

    move/from16 v99, v19

    move-object/from16 v73, v38

    move-object/from16 v15, p9

    move-object/from16 v38, v25

    move-object v14, v13

    move-object/from16 v15, p1

    move-object/from16 v16, v1

    move/from16 v17, v7

    move/from16 v18, v3

    move/from16 v19, v5

    move/from16 v20, v29

    move/from16 v21, v0

    move/from16 v22, v2

    move-object/from16 v24, v6

    move/from16 v25, v4

    .line 1515
    invoke-virtual/range {v14 .. v26}, Ll/ۚۚܺ;->ۙ(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFIIFLandroid/graphics/Paint;IZ)F

    .line 1517
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    move v14, v3

    move-object v0, v6

    move/from16 p10, v7

    move/from16 v18, v9

    move-object/from16 v19, v10

    move/from16 p5, v11

    move/from16 v17, v76

    move-object/from16 v103, v81

    move/from16 v15, v84

    move/from16 v11, v85

    move/from16 v16, v88

    move v10, v8

    goto/16 :goto_5c

    :cond_82
    move/from16 v100, v14

    move/from16 v101, v15

    move-object/from16 v102, v16

    move/from16 v99, v19

    move-object/from16 v73, v38

    move-object/from16 v6, v54

    move/from16 v54, v17

    move-object/from16 v38, v25

    if-eqz v51, :cond_83

    move-object/from16 v1, p9

    move-object/from16 v2, p1

    move v14, v3

    move-object/from16 v3, v94

    move v4, v7

    move/from16 v15, v84

    move v5, v14

    move-object/from16 v25, v6

    move/from16 p5, v11

    move/from16 v11, v85

    move/from16 v6, v29

    move/from16 p10, v7

    move v7, v0

    move v0, v8

    move v8, v9

    move/from16 v18, v9

    move/from16 v17, v76

    move/from16 v16, v88

    move-object/from16 v9, v25

    move-object/from16 v19, v10

    move-object/from16 v103, v81

    move-object v10, v13

    .line 1520
    invoke-virtual/range {v1 .. v10}, Ll/֨ܽᩴ;->ۙ(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIILl/ۢܺۤ;Ll/ܰۤᩴ;)V

    move v10, v0

    move-object/from16 v0, v25

    goto :goto_5c

    :cond_83
    move v14, v3

    move-object/from16 v25, v6

    move/from16 p10, v7

    move/from16 v18, v9

    move-object/from16 v19, v10

    move/from16 p5, v11

    move/from16 v17, v76

    move-object/from16 v103, v81

    move/from16 v15, v84

    move/from16 v11, v85

    move/from16 v16, v88

    move v10, v8

    .line 1523
    invoke-virtual {v13}, Ll/ۚۚܺ;->ܶ()I

    move-result v1

    move-object/from16 v9, v25

    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object v1, v13

    move-object/from16 v2, p1

    move-object/from16 v3, v94

    move/from16 v4, p10

    move v5, v14

    move/from16 v6, v29

    move v7, v0

    move/from16 v8, v18

    move-object v0, v9

    .line 1524
    invoke-virtual/range {v1 .. v9}, Ll/ۚۚܺ;->ۙ(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIILl/ۢܺۤ;)V

    :goto_5c
    if-eqz v70, :cond_84

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, v17

    move/from16 v4, v29

    move/from16 v5, v18

    move-object v6, v0

    .line 1528
    invoke-virtual/range {v1 .. v6}, Ll/۬ۡ᩸;->ۙ(Landroid/graphics/Canvas;IFILl/ۢܺۤ;)V

    :cond_84
    if-eqz v79, :cond_85

    .line 1533
    invoke-virtual/range {p0 .. p0}, Ll/۬ۡ᩸;->ۨ()Z

    move-result v1

    if-eqz v1, :cond_85

    if-eqz v61, :cond_85

    move/from16 v9, v100

    int-to-float v1, v9

    sub-float v2, v27, v1

    div-float v2, v2, v82

    add-float/2addr v2, v15

    add-float v3, v2, v1

    const/4 v4, 0x0

    move/from16 v7, p10

    move-object/from16 v8, v98

    .line 1536
    invoke-virtual {v8, v7, v4, v14}, Ll/۠ۡ᩸;->ۙ(IFI)F

    move-result v4

    add-float v4, v4, v52

    add-float/2addr v1, v4

    float-to-int v4, v4

    float-to-int v2, v2

    float-to-double v5, v1

    .line 1538
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v1, v5

    float-to-double v5, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v3, v5

    move-object/from16 v6, v74

    invoke-virtual {v6, v4, v2, v1, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    move-object/from16 v5, p1

    .line 1539
    invoke-virtual {v6, v5}, Ll/᩻۠᩷;->draw(Landroid/graphics/Canvas;)V

    goto :goto_5d

    :cond_85
    move-object/from16 v5, p1

    move/from16 v7, p10

    move-object/from16 v6, v74

    move-object/from16 v8, v98

    move/from16 v9, v100

    :goto_5d
    move-object/from16 v4, p0

    goto :goto_5e

    :cond_86
    move/from16 v99, v2

    move v14, v3

    move/from16 v86, v10

    move/from16 p5, v11

    move/from16 v101, v15

    move-object/from16 v102, v16

    move-object/from16 v19, v73

    move-object/from16 v103, v81

    move v15, v5

    move v11, v6

    move v10, v8

    move/from16 v16, v9

    move-object/from16 v73, v38

    move-object/from16 v6, v74

    move/from16 v9, v75

    move-object/from16 v8, v98

    move/from16 v75, v0

    move-object v5, v4

    move-object/from16 v38, v25

    move-object/from16 v0, v54

    move/from16 v54, v17

    move/from16 v17, v76

    move-object v4, v1

    :goto_5e
    move-object/from16 v1, v34

    move-object/from16 v2, p1

    move v3, v7

    move/from16 v18, v12

    move-object v12, v4

    move v4, v14

    move/from16 v5, v86

    move-object/from16 v20, v6

    move v6, v15

    move/from16 p10, v7

    move/from16 v7, v43

    move-object/from16 v98, v8

    move-object/from16 v8, v40

    move/from16 v21, v9

    move-object/from16 v9, v98

    move/from16 v104, v10

    move-object v10, v13

    .line 1545
    invoke-virtual/range {v1 .. v10}, Ll/ۢ۬᩸;->ۙ(Landroid/graphics/Canvas;IIIFZLl/ۢܺۤ;Ll/۟ۤᩴ;Ll/ܰۤᩴ;)V

    move-object/from16 v1, v73

    move/from16 v3, p10

    .line 1547
    invoke-virtual/range {v1 .. v10}, Ll/ۢ۬᩸;->ۙ(Landroid/graphics/Canvas;IIIFZLl/ۢܺۤ;Ll/۟ۤᩴ;Ll/ܰۤᩴ;)V

    if-eqz v71, :cond_9b

    .line 1551
    iget-boolean v1, v13, Ll/ܰۤᩴ;->᩶᩷:Z

    if-eqz v1, :cond_87

    iget-boolean v1, v13, Ll/ܰۤᩴ;->ۢ᩷:Z

    if-eqz v1, :cond_9b

    :cond_87
    if-nez v36, :cond_9b

    move/from16 v1, p10

    move/from16 v7, v101

    if-gt v1, v7, :cond_9a

    if-lt v14, v7, :cond_9a

    if-eqz v39, :cond_88

    const/4 v2, 0x0

    .line 1553
    invoke-virtual {v12, v2}, Ll/۬ۡ᩸;->᩷(Z)F

    move-result v2

    add-float v9, v2, v27

    move v15, v2

    goto :goto_5f

    :cond_88
    move/from16 v9, v16

    :goto_5f
    if-eqz v42, :cond_8a

    :cond_89
    move/from16 v10, v86

    goto :goto_60

    .line 1560
    :cond_8a
    iget-boolean v2, v12, Ll/۬ۡ᩸;->ܳۙ:Z

    if-eqz v2, :cond_8b

    if-ne v7, v14, :cond_89

    move/from16 v10, v86

    if-lt v7, v10, :cond_8c

    goto :goto_60

    :cond_8b
    move/from16 v10, v86

    if-ne v7, v1, :cond_8d

    if-gt v7, v11, :cond_8c

    goto :goto_60

    :cond_8c
    move/from16 v101, v7

    move/from16 v86, v10

    move/from16 v85, v11

    move/from16 v22, v69

    move-object/from16 v8, v98

    move-object/from16 v11, p0

    move-object/from16 v10, p8

    goto/16 :goto_69

    :cond_8d
    :goto_60
    const/4 v2, 0x0

    move-object/from16 v8, v98

    .line 1566
    invoke-virtual {v8, v1, v2, v7}, Ll/۠ۡ᩸;->ۙ(IFI)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v14

    add-int/lit8 v1, v14, 0x3

    int-to-float v1, v1

    cmpg-float v1, v66, v1

    if-gtz v1, :cond_8e

    int-to-float v2, v14

    cmpg-float v2, v2, v67

    if-gtz v2, :cond_8e

    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object/from16 v6, p0

    move-object/from16 v5, p8

    const/16 v32, 0x1

    const/16 v58, 0x1

    goto :goto_61

    :cond_8e
    move-object/from16 v6, p0

    move-object/from16 v5, p8

    .line 1572
    :goto_61
    iget-boolean v2, v5, Ll/ۖۡ᩸;->ᩴ:Z

    if-nez v2, :cond_90

    iget-boolean v2, v5, Ll/ۖۡ᩸;->ܳ:Z

    if-eqz v2, :cond_8f

    goto :goto_62

    :cond_8f
    move/from16 v101, v7

    move/from16 v86, v10

    move/from16 v85, v11

    move/from16 v22, v69

    move-object v10, v5

    move-object v11, v6

    goto/16 :goto_69

    :cond_90
    :goto_62
    if-gtz v1, :cond_91

    int-to-float v1, v14

    cmpg-float v1, v1, v67

    if-gtz v1, :cond_91

    const/4 v1, 0x1

    goto :goto_63

    :cond_91
    const/4 v1, 0x0

    :goto_63
    int-to-float v4, v14

    cmpg-float v2, v4, v66

    if-ltz v2, :cond_92

    cmpl-float v2, v4, v67

    if-lez v2, :cond_93

    .line 1574
    :cond_92
    iget-boolean v2, v5, Ll/ۖۡ᩸;->ܳ:Z

    if-eqz v2, :cond_93

    .line 1575
    invoke-virtual/range {v62 .. v62}, Ll/᩺ۜ᩸;->ᩴۤ()Z

    move-result v2

    if-nez v2, :cond_93

    .line 1576
    invoke-virtual/range {v62 .. v62}, Ll/᩺ۜ᩸;->᩵ۤ()V

    :cond_93
    if-eqz v1, :cond_8f

    .line 1580
    iget-boolean v1, v5, Ll/ۖۡ᩸;->ᩴ:Z

    if-eqz v1, :cond_99

    if-eqz v51, :cond_94

    .line 1585
    invoke-virtual {v13}, Ll/ۚۚܺ;->ܶ()I

    move-result v1

    move-object/from16 v3, p9

    move/from16 v2, v69

    invoke-virtual {v3, v2, v1}, Ll/֨ܽᩴ;->ۙ(II)J

    move-result-wide v22

    goto :goto_64

    :cond_94
    move-object/from16 v3, p9

    move/from16 v2, v69

    .line 1587
    invoke-virtual {v13}, Ll/ۚۚܺ;->ܶ()I

    move-result v1

    int-to-long v1, v1

    const-wide v22, 0xffffffffL

    and-long v22, v1, v22

    :goto_64
    move-wide/from16 v1, v22

    move/from16 v101, v7

    .line 1589
    iget-boolean v7, v5, Ll/ۖۡ᩸;->۫:Z

    const-wide v22, -0x100000000L

    and-long v22, v1, v22

    const-wide/16 v24, 0x0

    const/high16 v16, 0x60000000

    cmp-long v26, v22, v24

    if-nez v26, :cond_96

    if-eqz v7, :cond_95

    long-to-int v2, v1

    and-int v1, v2, v53

    or-int v1, v1, v16

    goto :goto_65

    :cond_95
    long-to-int v1, v1

    .line 1593
    :goto_65
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    add-int v1, v14, v37

    int-to-float v7, v1

    move-object/from16 v1, p1

    move/from16 v22, v69

    move v2, v4

    move v3, v15

    move/from16 v23, v4

    move v4, v7

    move-object v7, v5

    move v5, v9

    move-object v15, v6

    move-object v6, v0

    .line 1594
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move/from16 v86, v10

    move/from16 v85, v11

    move-object v11, v15

    move-object v10, v7

    goto :goto_67

    :cond_96
    move/from16 v23, v4

    move/from16 v22, v69

    long-to-int v3, v1

    if-eqz v7, :cond_97

    and-int v3, v3, v53

    or-int v3, v3, v16

    .line 1597
    :cond_97
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    add-int v3, v14, v37

    int-to-float v4, v3

    move-wide/from16 v24, v1

    move-object/from16 v1, p1

    move/from16 v2, v23

    move v3, v15

    move/from16 v26, v4

    move/from16 v86, v10

    move-object v10, v5

    move v5, v9

    move/from16 v85, v11

    move-object v11, v6

    move-object v6, v0

    .line 1598
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/16 v1, 0x20

    ushr-long v1, v24, v1

    if-eqz v7, :cond_98

    long-to-int v2, v1

    and-int v1, v2, v53

    or-int v1, v1, v16

    goto :goto_66

    :cond_98
    long-to-int v1, v1

    .line 1599
    :goto_66
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    add-float v2, v23, v80

    move-object/from16 v1, p1

    move v3, v15

    move/from16 v4, v26

    move v5, v9

    move-object v6, v0

    .line 1600
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_67

    :cond_99
    move/from16 v23, v4

    move/from16 v101, v7

    move/from16 v86, v10

    move/from16 v85, v11

    move/from16 v22, v69

    move-object v10, v5

    move-object v11, v6

    :goto_67
    cmpg-float v1, v66, v23

    if-gtz v1, :cond_9c

    cmpg-float v1, v23, v67

    if-gtz v1, :cond_9c

    .line 1604
    iget-boolean v1, v10, Ll/ۖۡ᩸;->ܳ:Z

    if-eqz v1, :cond_9c

    .line 1605
    iget-object v1, v13, Ll/ܰۤᩴ;->ۤۤ:Landroid/graphics/drawable/Drawable;

    .line 1606
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    sub-int v3, v14, v2

    int-to-float v3, v3

    add-float v3, v3, v80

    add-float v3, v3, v18

    add-float v3, v3, v54

    add-int/2addr v2, v14

    int-to-float v2, v2

    add-float v2, v2, v80

    add-float v2, v2, v18

    add-float v2, v2, v54

    .line 1611
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, v9

    move-object/from16 v6, v72

    .line 1612
    invoke-virtual {v6, v3, v9, v2, v4}, Landroid/graphics/RectF;->set(FFFF)V

    float-to-int v3, v3

    float-to-int v5, v9

    float-to-double v6, v2

    .line 1613
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-int v2, v6

    float-to-double v6, v4

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-int v4, v6

    invoke-virtual {v1, v3, v5, v2, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_6a

    :cond_9a
    move-object/from16 v10, p8

    move/from16 v101, v7

    goto :goto_68

    :cond_9b
    move-object/from16 v10, p8

    :goto_68
    move/from16 v85, v11

    move/from16 v22, v69

    move-object/from16 v8, v98

    move-object/from16 v11, p0

    :cond_9c
    :goto_69
    move-object/from16 v1, p4

    :goto_6a
    move/from16 v9, p5

    .line 1620
    invoke-virtual {v12, v9}, Ll/۬ۡ᩸;->ۤ(I)F

    move-result v2

    add-float v5, v2, v44

    add-float v29, v5, v28

    move/from16 v6, v104

    neg-int v2, v6

    int-to-float v2, v2

    const/4 v3, 0x0

    move-object/from16 v14, p1

    .line 1623
    invoke-virtual {v14, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    add-int/lit8 v9, v17, 0x1

    move-object/from16 p4, v1

    move-object/from16 v98, v8

    move-object v1, v12

    move-object v4, v14

    move-object/from16 v74, v20

    move/from16 v69, v22

    move-object/from16 v7, v38

    move/from16 v17, v54

    move/from16 v12, v58

    move/from16 v8, v64

    move-object/from16 v38, v73

    move/from16 v6, v85

    move/from16 v3, v86

    move/from16 v2, v87

    move/from16 v71, v99

    move/from16 v15, v101

    move-object/from16 v14, v102

    move-object/from16 v10, v103

    move-object/from16 v54, v0

    move-object/from16 v73, v19

    move/from16 v0, v75

    move/from16 v75, v21

    goto/16 :goto_53

    :cond_9d
    move-object/from16 v38, v7

    move-object/from16 v103, v10

    move-object v6, v11

    move-object/from16 v102, v14

    move/from16 v12, v68

    move/from16 v99, v71

    move-object/from16 v11, p0

    move-object/from16 v10, p8

    move-object v14, v4

    .line 1626
    invoke-virtual {v14, v12}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1627
    invoke-virtual/range {v62 .. v62}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual/range {v62 .. v62}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v14, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    move/from16 v0, v58

    .line 1638
    iput-boolean v0, v1, Ll/۬ۡ᩸;->ᩴۙ:Z

    move/from16 v0, v32

    .line 1639
    iput-boolean v0, v1, Ll/۬ۡ᩸;->᩸ۙ:Z

    .line 1640
    invoke-virtual/range {v62 .. v62}, Ll/᩺ۜ᩸;->᩶᩷()Z

    move-result v0

    const/4 v7, 0x0

    const/4 v8, 0x2

    move-object/from16 v2, v35

    move-object/from16 v3, p1

    move v4, v0

    move-object/from16 v5, p4

    .line 1642
    invoke-direct/range {v1 .. v7}, Ll/۬ۡ᩸;->ۙ(Ll/ܿ۠᩸;Landroid/graphics/Canvas;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V

    .line 1645
    invoke-virtual/range {v62 .. v62}, Ll/᩺ۜ᩸;->ۜ᩷()Z

    move-result v1

    if-eqz v1, :cond_9f

    move-object/from16 v9, v102

    move-object/from16 v6, v103

    invoke-static {v6, v9}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    move-result v1

    move-object/from16 v15, v35

    if-eqz v1, :cond_a0

    if-nez v15, :cond_a0

    .line 1646
    invoke-virtual/range {v62 .. v62}, Ll/᩺ۜ᩸;->۬᩷()Z

    move-result v1

    if-eqz v1, :cond_9e

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object v2, v15

    move-object/from16 v3, p1

    move v4, v0

    move-object/from16 v5, v89

    .line 1648
    invoke-direct/range {v1 .. v7}, Ll/۬ۡ᩸;->ۙ(Ll/ܿ۠᩸;Landroid/graphics/Canvas;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V

    const/4 v0, 0x0

    if-eqz v15, :cond_a1

    .line 1650
    invoke-virtual {v15, v8, v0, v0, v0}, Ll/ܿ۠᩸;->ۙ(IIIZ)V

    goto :goto_6b

    :cond_9e
    const/4 v8, 0x0

    const/4 v7, 0x2

    move-object/from16 v1, p0

    move-object v2, v15

    move-object/from16 v3, p1

    move v4, v0

    move-object/from16 v5, p3

    move-object v6, v9

    .line 1654
    invoke-direct/range {v1 .. v7}, Ll/۬ۡ᩸;->ۙ(Ll/ܿ۠᩸;Landroid/graphics/Canvas;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V

    const/4 v0, 0x1

    if-eqz v15, :cond_a1

    .line 1656
    invoke-virtual {v15, v0, v8, v8, v8}, Ll/ܿ۠᩸;->ۙ(IIIZ)V

    goto :goto_6b

    :cond_9f
    move-object/from16 v15, v35

    move-object/from16 v9, v102

    move-object/from16 v6, v103

    :cond_a0
    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object v2, v15

    move-object/from16 v3, p1

    move v4, v0

    move-object/from16 v5, v89

    .line 1661
    invoke-direct/range {v1 .. v7}, Ll/۬ۡ᩸;->ۙ(Ll/ܿ۠᩸;Landroid/graphics/Canvas;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V

    const/4 v7, 0x2

    move-object/from16 v5, p3

    move-object v6, v9

    .line 1662
    invoke-direct/range {v1 .. v7}, Ll/۬ۡ᩸;->ۙ(Ll/ܿ۠᩸;Landroid/graphics/Canvas;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V

    :cond_a1
    :goto_6b
    move-object/from16 v2, p3

    move-object/from16 v1, p4

    move-object/from16 v0, v89

    .line 1665
    invoke-direct {v11, v1, v0, v2}, Ll/۬ۡ᩸;->ۙ(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1674
    invoke-virtual/range {v62 .. v62}, Ll/᩺ۜ᩸;->ۗۙ()I

    move-result v0

    add-int v1, p7, v0

    add-int v0, v65, v0

    .line 1680
    iget-boolean v15, v10, Ll/ۖۡ᩸;->᩷:Z

    .line 1681
    iget v9, v10, Ll/ۖۡ᩸;->᩸:F

    .line 1683
    iget v8, v11, Ll/۬ۡ᩸;->֨:I

    const/4 v2, 0x0

    cmpl-float v2, v9, v2

    if-lez v2, :cond_ab

    .line 1684
    invoke-virtual/range {p0 .. p0}, Ll/۬ۡ᩸;->ᩴ()D

    move-result-wide v16

    int-to-double v6, v1

    sub-double v1, v16, v6

    const-wide/16 v3, 0x0

    cmpl-double v5, v1, v3

    if-lez v5, :cond_ab

    sub-double v3, v1, v59

    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    cmpg-double v5, v3, v18

    if-gez v5, :cond_a2

    goto :goto_6c

    :cond_a2
    div-double v18, v59, v1

    .line 1689
    :goto_6c
    iget-boolean v5, v13, Ll/ܰۤᩴ;->᩻᩷:Z

    .line 1692
    iget-boolean v1, v13, Ll/ܰۤᩴ;->ܰۙ:Z

    if-eqz v1, :cond_a7

    div-double v1, v16, v6

    const-wide/high16 v3, 0x4008000000000000L    # 3.0

    cmpl-double v20, v1, v3

    if-lez v20, :cond_a7

    and-int v1, v33, v53

    ushr-int/lit8 v2, v33, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-float v2, v2

    mul-float v2, v2, v9

    float-to-int v2, v2

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr v1, v2

    move-object/from16 v7, v40

    .line 1701
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v6, v78

    int-to-float v1, v6

    mul-float v16, v1, v9

    move/from16 v4, v77

    int-to-float v3, v4

    if-eqz v5, :cond_a3

    sub-float v2, v57, v16

    move/from16 v17, v3

    move/from16 v1, v99

    int-to-float v3, v1

    move/from16 v20, v5

    int-to-float v5, v0

    const/16 v21, 0xff

    move v10, v1

    move-object/from16 v1, p1

    move/from16 v105, v4

    move/from16 v4, v57

    move/from16 v68, v12

    move v12, v6

    move-object v6, v7

    .line 1706
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_6d

    :cond_a3
    move/from16 v17, v3

    move/from16 v105, v4

    move/from16 v20, v5

    move/from16 v68, v12

    move/from16 v10, v99

    move v12, v6

    const/16 v21, 0xff

    int-to-float v3, v10

    add-float v4, v63, v16

    int-to-float v5, v0

    move-object/from16 v1, p1

    move/from16 v2, v63

    move-object v6, v7

    .line 1708
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_6d
    if-eqz v48, :cond_a4

    int-to-float v4, v10

    int-to-float v6, v0

    move-object/from16 v1, v48

    move-object/from16 v2, v38

    move/from16 v3, v63

    move/from16 v5, v57

    move-object/from16 v40, v7

    move-object/from16 v7, p1

    move v14, v8

    move-object/from16 v8, v40

    move/from16 v22, v9

    move-object v9, v13

    .line 1713
    invoke-interface/range {v1 .. v9}, Ll/ܰۡ᩸;->ۙ(Ll/ۜۙᩴ;FFFFLandroid/graphics/Canvas;Ll/ۢܺۤ;Ll/ܰۤᩴ;)V

    const/4 v1, 0x1

    const/4 v7, 0x1

    goto :goto_6e

    :cond_a4
    move-object/from16 v40, v7

    move v14, v8

    move/from16 v22, v9

    const/4 v1, 0x0

    const/4 v7, 0x0

    :goto_6e
    if-eqz v15, :cond_a5

    .line 1718
    iget v1, v13, Ll/ܰۤᩴ;->֡ۙ:I

    goto :goto_6f

    :cond_a5
    move/from16 v1, v31

    :goto_6f
    and-int v2, v1, v53

    ushr-int/lit8 v1, v1, 0x18

    and-int v1, v1, v21

    int-to-float v1, v1

    mul-float v1, v1, v22

    float-to-int v1, v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    move-object/from16 v15, v40

    .line 1722
    invoke-virtual {v15, v1}, Landroid/graphics/Paint;->setColor(I)V

    sub-int v1, v0, v10

    int-to-float v1, v1

    sub-float v1, v1, v17

    float-to-double v1, v1

    mul-double v1, v1, v18

    double-to-int v1, v1

    add-int/2addr v1, v10

    if-eqz v20, :cond_a6

    sub-int v9, v41, v12

    int-to-float v3, v9

    int-to-float v8, v1

    add-float v9, v8, v17

    .line 1728
    iget-object v1, v11, Ll/۬ۡ᩸;->ܶ:Ll/᩸᩷ܺ;

    const/4 v2, 0x3

    move v4, v8

    move/from16 v5, v57

    move v6, v9

    invoke-virtual/range {v1 .. v6}, Ll/᩸᩷ܺ;->ۙ(IFFFF)V

    sub-float v2, v57, v16

    move-object/from16 v1, p1

    move v3, v8

    move/from16 v4, v57

    move v5, v9

    move-object v6, v15

    .line 1729
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_70

    :cond_a6
    int-to-float v8, v1

    add-int v1, p2, v12

    int-to-float v5, v1

    add-float v9, v8, v17

    .line 1732
    iget-object v1, v11, Ll/۬ۡ᩸;->ܶ:Ll/᩸᩷ܺ;

    const/4 v2, 0x2

    move/from16 v3, v63

    move v4, v8

    move v6, v9

    invoke-virtual/range {v1 .. v6}, Ll/᩸᩷ܺ;->ۙ(IFFFF)V

    add-float v4, v63, v16

    move-object/from16 v1, p1

    move/from16 v2, v63

    move v3, v8

    move v5, v9

    move-object v6, v15

    .line 1733
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_70
    const/4 v1, 0x1

    goto/16 :goto_73

    :cond_a7
    move/from16 v20, v5

    move v14, v8

    move/from16 v22, v9

    move/from16 v68, v12

    move-object/from16 v15, v40

    move/from16 v105, v77

    move/from16 v12, v78

    move/from16 v10, v99

    .line 1736
    iget-boolean v1, v13, Ll/ܰۤᩴ;->᩶ۙ:Z

    if-eqz v1, :cond_ac

    if-eqz v48, :cond_a8

    int-to-float v4, v10

    int-to-float v8, v0

    move-object/from16 v1, v48

    move-object/from16 v2, v38

    move/from16 v3, v63

    move/from16 v5, v57

    move-wide/from16 v23, v6

    move v6, v8

    move-object/from16 v7, p1

    move-object v8, v15

    move-object v9, v13

    .line 1739
    invoke-interface/range {v1 .. v9}, Ll/ܰۡ᩸;->ۙ(Ll/ۜۙᩴ;FFFFLandroid/graphics/Canvas;Ll/ۢܺۤ;Ll/ܰۤᩴ;)V

    const/4 v1, 0x1

    const/4 v7, 0x1

    goto :goto_71

    :cond_a8
    move-wide/from16 v23, v6

    const/4 v1, 0x0

    const/4 v7, 0x0

    .line 1743
    :goto_71
    iget v1, v13, Ll/ܰۤᩴ;->֡᩷:I

    and-int v2, v1, v53

    ushr-int/lit8 v1, v1, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    mul-float v1, v1, v22

    float-to-int v1, v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    .line 1746
    invoke-virtual {v15, v1}, Landroid/graphics/Paint;->setColor(I)V

    mul-double v1, v23, v23

    div-double v1, v1, v16

    double-to-float v1, v1

    int-to-float v2, v14

    cmpg-float v3, v1, v2

    if-gez v3, :cond_a9

    move v1, v2

    :cond_a9
    sub-int v2, v0, v10

    int-to-float v2, v2

    sub-float/2addr v2, v1

    float-to-double v2, v2

    mul-double v2, v2, v18

    double-to-int v2, v2

    add-int/2addr v2, v10

    if-eqz v20, :cond_aa

    .line 1754
    iget v3, v13, Ll/ܰۤᩴ;->۟᩷:F

    sub-float v3, v57, v3

    int-to-float v4, v2

    add-float v5, v1, v4

    move-object/from16 v1, p1

    move v2, v3

    move v3, v4

    move/from16 v4, v57

    move-object v6, v15

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_72

    :cond_aa
    int-to-float v3, v2

    .line 1756
    iget v2, v13, Ll/ܰۤᩴ;->۟᩷:F

    add-float v4, v63, v2

    add-float v5, v3, v1

    move-object/from16 v1, p1

    move/from16 v2, v63

    move-object v6, v15

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_72
    const/4 v1, 0x0

    :goto_73
    const/4 v2, 0x1

    move v9, v1

    const/16 v16, 0x1

    goto :goto_74

    :cond_ab
    move v14, v8

    move/from16 v68, v12

    move-object/from16 v15, v40

    move/from16 v105, v77

    move/from16 v12, v78

    move/from16 v10, v99

    :cond_ac
    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/16 v16, 0x0

    :goto_74
    if-eqz v48, :cond_ad

    if-nez v7, :cond_ad

    int-to-float v4, v10

    int-to-float v6, v0

    move-object/from16 v1, v48

    move-object/from16 v2, v38

    move/from16 v3, v63

    move/from16 v5, v57

    move-object/from16 v7, p1

    move-object v8, v15

    move v10, v9

    move-object v9, v13

    .line 1764
    invoke-interface/range {v1 .. v9}, Ll/ܰۡ᩸;->ۙ(Ll/ۜۙᩴ;FFFFLandroid/graphics/Canvas;Ll/ۢܺۤ;Ll/ܰۤᩴ;)V

    goto :goto_75

    :cond_ad
    move v10, v9

    .line 1767
    :goto_75
    iput-boolean v10, v11, Ll/۬ۡ᩸;->ۗ:Z

    move-object/from16 v1, p1

    move v3, v14

    move/from16 v2, v68

    .line 1775
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    move-object/from16 v2, p8

    .line 1777
    iget-boolean v4, v2, Ll/ۖۡ᩸;->ۙ:Z

    .line 1778
    iget v2, v2, Ll/ۖۡ᩸;->ۤ:F

    const/4 v5, 0x0

    cmpl-float v6, v2, v5

    if-lez v6, :cond_b4

    move/from16 v6, p6

    int-to-float v7, v6

    sub-float v8, v50, v7

    cmpl-float v5, v8, v5

    if-lez v5, :cond_b4

    .line 1785
    iget-boolean v5, v13, Ll/ܰۤᩴ;->ۡ᩷:Z

    if-eqz v5, :cond_af

    iget-boolean v5, v13, Ll/ܰۤᩴ;->֨ۙ:Z

    if-eqz v5, :cond_af

    .line 1786
    iget-boolean v5, v13, Ll/ܰۤᩴ;->᩻᩷:Z

    if-eqz v5, :cond_ae

    add-int v5, p2, v46

    goto :goto_76

    :cond_ae
    sub-int v9, v41, v46

    move/from16 v5, p2

    goto :goto_77

    :cond_af
    move/from16 v5, p2

    :goto_76
    move/from16 v9, v41

    :goto_77
    sub-float v10, v8, v63

    const/high16 v14, 0x3f800000    # 1.0f

    cmpg-float v10, v10, v14

    if-gez v10, :cond_b0

    goto :goto_78

    :cond_b0
    div-float v14, v63, v8

    .line 1796
    :goto_78
    iget-boolean v8, v13, Ll/ܰۤᩴ;->ۛۙ:Z

    if-eqz v8, :cond_b2

    div-float v7, v50, v7

    cmpl-float v7, v7, v52

    if-lez v7, :cond_b2

    and-int v3, v33, v53

    ushr-int/lit8 v6, v33, 0x18

    and-int/lit16 v6, v6, 0xff

    int-to-float v6, v6

    mul-float v6, v6, v2

    float-to-int v6, v6

    shl-int/lit8 v6, v6, 0x18

    or-int/2addr v3, v6

    .line 1805
    invoke-virtual {v15, v3}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v3, v105

    int-to-float v3, v3

    int-to-float v6, v12

    mul-float v6, v6, v2

    int-to-float v7, v5

    int-to-float v8, v0

    sub-float v6, v8, v6

    int-to-float v10, v9

    move-object/from16 p2, p1

    move/from16 p3, v7

    move/from16 p4, v6

    move/from16 p5, v10

    move/from16 p6, v8

    move-object/from16 p7, v15

    .line 1808
    invoke-virtual/range {p2 .. p7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-eqz v4, :cond_b1

    .line 1811
    iget v4, v13, Ll/ܰۤᩴ;->֡ۙ:I

    goto :goto_79

    :cond_b1
    move/from16 v4, v31

    :goto_79
    and-int v7, v4, v53

    ushr-int/lit8 v4, v4, 0x18

    and-int/lit16 v4, v4, 0xff

    int-to-float v4, v4

    mul-float v4, v4, v2

    float-to-int v2, v4

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr v2, v7

    .line 1815
    invoke-virtual {v15, v2}, Landroid/graphics/Paint;->setColor(I)V

    sub-int/2addr v9, v5

    int-to-float v2, v9

    sub-float/2addr v2, v3

    mul-float v2, v2, v14

    float-to-int v2, v2

    add-int/2addr v5, v2

    int-to-float v2, v5

    sub-int/2addr v0, v12

    int-to-float v0, v0

    add-float/2addr v3, v2

    .line 1819
    iget-object v4, v11, Ll/۬ۡ᩸;->ܽ:Ll/᩸᩷ܺ;

    invoke-virtual {v4, v2, v0, v3, v8}, Ll/᩸᩷ܺ;->ۙ(FFFF)V

    move/from16 p2, v2

    move/from16 p3, v6

    move/from16 p4, v3

    move/from16 p5, v8

    move-object/from16 p6, v15

    .line 1820
    invoke-virtual/range {p1 .. p6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/4 v0, 0x1

    goto :goto_7a

    .line 1822
    :cond_b2
    iget-boolean v4, v13, Ll/ܰۤᩴ;->᩺ۙ:Z

    if-eqz v4, :cond_b4

    .line 1824
    iget v4, v13, Ll/ܰۤᩴ;->֡᩷:I

    and-int v7, v4, v53

    ushr-int/lit8 v4, v4, 0x18

    and-int/lit16 v4, v4, 0xff

    int-to-float v4, v4

    mul-float v4, v4, v2

    float-to-int v2, v4

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr v2, v7

    .line 1827
    invoke-virtual {v15, v2}, Landroid/graphics/Paint;->setColor(I)V

    mul-int v2, v6, v6

    int-to-float v2, v2

    div-float v2, v2, v50

    int-to-float v3, v3

    cmpg-float v4, v2, v3

    if-gez v4, :cond_b3

    move v2, v3

    :cond_b3
    sub-int/2addr v9, v5

    int-to-float v3, v9

    sub-float/2addr v3, v2

    mul-float v3, v3, v14

    float-to-int v3, v3

    add-int/2addr v5, v3

    int-to-float v3, v5

    int-to-float v0, v0

    .line 1834
    iget v4, v13, Ll/ܰۤᩴ;->۟᩷:F

    sub-float v4, v0, v4

    add-float/2addr v2, v3

    move/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v2

    move/from16 p5, v0

    move-object/from16 p6, v15

    invoke-virtual/range {p1 .. p6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/4 v0, 0x0

    :goto_7a
    const/16 v16, 0x1

    goto :goto_7b

    :cond_b4
    const/4 v0, 0x0

    .line 1839
    :goto_7b
    iput-boolean v0, v11, Ll/۬ۡ᩸;->᩹:Z

    if-eqz v16, :cond_b5

    .line 1843
    invoke-virtual/range {v62 .. v62}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_b5
    :goto_7c
    return-void

    :catchall_0
    move-exception v0

    :goto_7d
    move-object v11, v13

    move-object v1, v15

    goto :goto_7e

    :catchall_1
    move-exception v0

    move-object v11, v13

    move-object v1, v15

    move/from16 v9, v58

    goto :goto_7e

    :catchall_2
    move-exception v0

    move v9, v2

    goto :goto_7d

    .line 998
    :goto_7e
    invoke-virtual {v1, v9}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 999
    throw v0
.end method


# virtual methods
.method public final ֡()V
    .locals 2

    .line 72
    iget-object v0, p0, Ll/۬ۡ᩸;->۬:Ljava/lang/Object;

    monitor-enter v0

    .line 73
    :try_start_0
    iget-object v1, p0, Ll/۬ۡ᩸;->ۜ:Ll/ܳܿ᩸;

    if-eqz v1, :cond_0

    .line 74
    invoke-virtual {v1}, Ll/ܳܿ᩸;->close()V

    const/4 v1, 0x0

    .line 75
    iput-object v1, p0, Ll/۬ۡ᩸;->ۜ:Ll/ܳܿ᩸;

    .line 77
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public abstract ֨()I
.end method

.method public abstract ֫()B
.end method

.method public final ۗ()Z
    .locals 1

    .line 394
    iget-boolean v0, p0, Ll/۬ۡ᩸;->ܳۙ:Z

    return v0
.end method

.method public abstract ۘ()V
.end method

.method public final ۙ(Z)F
    .locals 3

    .line 334
    invoke-direct {p0, p1}, Ll/۬ۡ᩸;->ۤ(Z)I

    move-result v0

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 335
    :cond_0
    move-object v0, p0

    check-cast v0, Ll/᩸ۙᩴ;

    invoke-virtual {v0, p1}, Ll/᩸ۙᩴ;->ۤ(Z)F

    move-result p1

    cmpg-float v0, p1, v2

    if-gez v0, :cond_1

    :goto_0
    return v2

    .line 337
    :cond_1
    iget-object v0, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩻ۙ()I

    move-result v0

    invoke-virtual {p0}, Ll/۬ۡ᩸;->ܳ()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Ll/۬ۡ᩸;->ۚ()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    sub-float/2addr v0, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr v0, p1

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    return p1
.end method

.method public final ۙ(D)I
    .locals 3

    const/4 v0, 0x0

    .line 415
    invoke-virtual {p0, v0}, Ll/۬ۡ᩸;->᩷(Z)F

    move-result v1

    float-to-double v1, v1

    sub-double/2addr p1, v1

    iget-object v1, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    invoke-virtual {v1}, Ll/ۚۚܺ;->֫()F

    move-result v1

    float-to-double v1, v1

    div-double/2addr p1, v1

    double-to-int p1, p1

    const/4 p2, 0x1

    if-gez p1, :cond_0

    .line 417
    iput-boolean p2, p0, Ll/۬ۡ᩸;->ۖ:Z

    return v0

    .line 419
    :cond_0
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0}, Ll/ۜۙᩴ;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 420
    iput-boolean p2, p0, Ll/۬ۡ᩸;->ۖ:Z

    .line 421
    iget-object p1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {p1}, Ll/ۜۙᩴ;->ᩴ()I

    move-result p1

    :cond_1
    return p1
.end method

.method public final ۙ(FF)I
    .locals 2

    const/4 v0, 0x0

    .line 404
    iput-boolean v0, p0, Ll/۬ۡ᩸;->ۖ:Z

    float-to-double v0, p2

    .line 405
    invoke-virtual {p0, v0, v1}, Ll/۬ۡ᩸;->ۙ(D)I

    move-result p2

    .line 407
    invoke-virtual {p0, p2}, Ll/۬ۡ᩸;->ᩴ(I)F

    move-result v0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-virtual {p0, v0, p2, p1}, Ll/۬ۡ᩸;->ۙ(Ljava/lang/CharSequence;IF)I

    move-result p1

    return p1

    .line 408
    :cond_0
    iget-object v0, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-interface {v0}, Ll/ۡ᩶᩸;->ܽۙ()Ll/ܳܿ᩸;

    move-result-object v0

    .line 409
    :try_start_0
    invoke-virtual {p0, v0, p2, p1}, Ll/۬ۡ᩸;->ۙ(Ljava/lang/CharSequence;IF)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 410
    invoke-virtual {v0}, Ll/ܳܿ᩸;->close()V

    return p1

    :catchall_0
    move-exception p1

    .line 408
    :try_start_1
    invoke-virtual {v0}, Ll/ܳܿ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ۙ(I)I
    .locals 4

    .line 374
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0}, Ll/ۜۙᩴ;->᩸()Ll/ܰۙᩴ;

    move-result-object v0

    iget v0, v0, Ll/ܰۙᩴ;->᩶:I

    int-to-long v0, v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    int-to-long v2, p1

    add-long/2addr v0, v2

    .line 379
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    int-to-float p1, p1

    iget-object v0, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    iget v1, v0, Ll/ܰۤᩴ;->ܺ᩷:F

    add-float/2addr p1, v1

    iget v0, v0, Ll/ܰۤᩴ;->ۧ᩷:F

    mul-float p1, p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public ۙ(II)I
    .locals 4

    .line 1958
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0}, Ll/ۜۙᩴ;->size()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    long-to-float v0, v0

    iget-object v1, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    invoke-virtual {v1}, Ll/ۚۚܺ;->֫()F

    move-result v1

    mul-float v1, v1, v0

    float-to-int v0, v1

    sub-int/2addr v0, p2

    add-int/lit8 v0, v0, -0x1

    const/4 p2, 0x0

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1959
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public final ۙ(IZ)I
    .locals 8

    const/4 v0, 0x0

    if-gtz p1, :cond_0

    return v0

    .line 555
    :cond_0
    iget-object v1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v1}, Ll/ۜۙᩴ;->᩸()Ll/ܰۙᩴ;

    move-result-object v1

    iget v1, v1, Ll/ܰۙᩴ;->ܰ:I

    if-lt p1, v1, :cond_1

    .line 556
    iget-object p1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {p1}, Ll/ۜۙᩴ;->ᩴ()I

    move-result p1

    return p1

    .line 558
    :cond_1
    iget-object v1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    .line 560
    invoke-virtual {v1}, Ll/ۜۙᩴ;->size()I

    move-result v2

    .line 562
    invoke-virtual {v1}, Ll/ۜۙᩴ;->᩷()Ll/ܿۙᩴ;

    move-result-object v3

    :goto_0
    add-int v4, v0, v2

    ushr-int/lit8 v4, v4, 0x1

    .line 565
    invoke-virtual {v3, v4}, Ll/ܿۙᩴ;->ۙ(I)Ll/ܰۙᩴ;

    move-result-object v5

    .line 566
    iget v6, v5, Ll/ܰۙᩴ;->ܿ:I

    if-ge p1, v6, :cond_2

    move v2, v4

    goto :goto_0

    .line 569
    :cond_2
    iget v7, v5, Ll/ܰۙᩴ;->ܰ:I

    if-lt p1, v7, :cond_5

    if-eq v0, v4, :cond_3

    move v0, v4

    goto :goto_0

    :cond_3
    if-ne p1, v7, :cond_4

    goto :goto_1

    .line 575
    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_5
    :goto_1
    if-ne p1, v6, :cond_7

    .line 220
    invoke-virtual {v1, v4}, Ll/ۜۙᩴ;->۫(I)Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz p2, :cond_6

    goto :goto_2

    :cond_6
    add-int/lit8 v4, v4, -0x1

    return v4

    .line 580
    :cond_7
    iget v0, v5, Ll/ܰۙᩴ;->ܰ:I

    if-ne p1, v0, :cond_8

    .line 224
    invoke-virtual {v1, v4}, Ll/ۜۙᩴ;->ۚ(I)Z

    move-result p1

    if-nez p1, :cond_8

    if-eqz p2, :cond_8

    add-int/lit8 v4, v4, 0x1

    :cond_8
    :goto_2
    return v4
.end method

.method public final ۙ(Ljava/lang/CharSequence;IF)I
    .locals 4

    .line 446
    invoke-virtual {p0, p2}, Ll/۬ۡ᩸;->ᩴ(I)F

    move-result v0

    sub-float/2addr p3, v0

    .line 447
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0, p2}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v0

    .line 448
    iget v1, v0, Ll/ܰۙᩴ;->ܿ:I

    .line 449
    invoke-virtual {v0}, Ll/ܰۙᩴ;->ۙ()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    cmpg-float v2, p3, v2

    if-gtz v2, :cond_0

    .line 452
    iput-boolean v3, p0, Ll/۬ۡ᩸;->ܳۙ:Z

    return v1

    .line 456
    :cond_0
    invoke-direct {p0, v1, v0, p1}, Ll/۬ۡ᩸;->ۙ(IILjava/lang/CharSequence;)Ll/ᩴۚܺ;

    move-result-object p1

    .line 457
    invoke-virtual {p1, p3}, Ll/ᩴۚܺ;->ۙ(F)I

    move-result v2

    if-ne v2, v0, :cond_2

    .line 458
    invoke-virtual {p1}, Ll/ᩴۚܺ;->ۙ()F

    move-result p1

    cmpl-float p1, p3, p1

    if-lez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/۬ۡ᩸;->ۖ:Z

    :cond_2
    if-eq v2, v1, :cond_4

    .line 460
    iget-object p1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {p1, p2}, Ll/ۜۙᩴ;->ۚ(I)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :cond_4
    :goto_1
    iput-boolean v3, p0, Ll/۬ۡ᩸;->ܳۙ:Z

    return v2
.end method

.method public abstract ۙ(Ll/ۜۡ᩸;)I
.end method

.method public final ۙ(Ll/ܳܿ᩸;II)Ll/᩸ܿ᩸;
    .locals 1

    .line 605
    iget-object v0, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۫ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    move p2, p3

    :cond_0
    invoke-virtual {p1, p2, p3}, Ll/ܳܿ᩸;->ۙ(II)Ll/᩸ܿ᩸;

    move-result-object p1

    return-object p1
.end method

.method public abstract ۙ(F)V
.end method

.method public abstract ۙ(III)V
.end method

.method public ۙ(Landroid/graphics/Canvas;IFILl/ۢܺۤ;)V
    .locals 0

    return-void
.end method

.method public final ۙ(Landroid/graphics/Canvas;IIII)V
    .locals 8

    .line 742
    iget-object v0, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    iget v0, v0, Ll/ܰۤᩴ;->ᩴۙ:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    int-to-float v7, p4

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    .line 745
    invoke-direct/range {v1 .. v7}, Ll/۬ۡ᩸;->ۙ(Landroid/graphics/Canvas;IIIIF)V

    return-void
.end method

.method public final ۙ(Landroid/graphics/Canvas;IIIIIILl/ۖۡ᩸;Ll/֨ܽᩴ;Ll/ۖ᩷ᩴ;Ll/ܽ֨᩸;)V
    .locals 4

    .line 857
    iget-object v0, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    iget-object v1, p0, Ll/۬ۡ᩸;->ۧ:Ll/۠ۡ᩸;

    instance-of v2, p0, Ll/᩸ۙᩴ;

    if-eqz v2, :cond_0

    move-object v2, p0

    check-cast v2, Ll/᩸ۙᩴ;

    invoke-virtual {v2, p3, p5}, Ll/᩸ۙᩴ;->ܳ(II)V

    :cond_0
    const/4 v2, 0x1

    .line 859
    iput-boolean v2, p0, Ll/۬ۡ᩸;->᩻:Z

    .line 860
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 862
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v0

    sub-int/2addr v3, v0

    iput v3, p0, Ll/۬ۡ᩸;->۫:I

    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 864
    :try_start_0
    invoke-direct/range {p0 .. p11}, Ll/۬ۡ᩸;->᩷(Landroid/graphics/Canvas;IIIIIILl/ۖۡ᩸;Ll/֨ܽᩴ;Ll/ۖ᩷ᩴ;Ll/ܽ֨᩸;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 868
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 869
    iput-object v3, v1, Ll/۠ۡ᩸;->ܳ:Ljava/lang/CharSequence;

    .line 870
    iput-object v3, v1, Ll/۠ۡ᩸;->ۙ:Ll/֨ܽᩴ;

    .line 871
    iput-object v3, v1, Ll/۠ۡ᩸;->ᩴ:Ll/ᩴۚܺ;

    .line 872
    iput-boolean v0, p0, Ll/۬ۡ᩸;->᩻:Z

    .line 874
    invoke-direct {p0}, Ll/۬ۡ᩸;->ۖ()V

    return-void

    :catchall_0
    move-exception p2

    .line 868
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 869
    iput-object v3, v1, Ll/۠ۡ᩸;->ܳ:Ljava/lang/CharSequence;

    .line 870
    iput-object v3, v1, Ll/۠ۡ᩸;->ۙ:Ll/֨ܽᩴ;

    .line 871
    iput-object v3, v1, Ll/۠ۡ᩸;->ᩴ:Ll/ᩴۚܺ;

    .line 872
    iput-boolean v0, p0, Ll/۬ۡ᩸;->᩻:Z

    .line 200
    iget-object p1, p0, Ll/۬ۡ᩸;->ۤ:Ll/ܳܿ᩸;

    .line 201
    iput-object v3, p0, Ll/۬ۡ᩸;->ۤ:Ll/ܳܿ᩸;

    .line 202
    iput-object v3, p0, Ll/۬ۡ᩸;->᩷:Ll/ᩳ۬᩸;

    if-eqz p1, :cond_1

    .line 203
    invoke-virtual {p1}, Ll/ܳܿ᩸;->close()V

    .line 875
    :cond_1
    throw p2
.end method

.method public ۙ(Landroid/graphics/RectF;I)V
    .locals 9

    if-gez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 67
    :cond_0
    iget v0, p0, Ll/۬ۡ᩸;->ܿ:I

    if-le p2, v0, :cond_1

    move p2, v0

    .line 549
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/۬ۡ᩸;->ܳۙ:Z

    invoke-virtual {p0, p2, v0}, Ll/۬ۡ᩸;->ۙ(IZ)I

    move-result v0

    .line 516
    iget-object v1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v1, v0}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v1

    .line 518
    invoke-virtual {p0, v0}, Ll/۬ۡ᩸;->ᩴ(I)F

    move-result v2

    .line 520
    invoke-virtual {v1}, Ll/ܰۙᩴ;->ۙ()I

    move-result v3

    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 521
    iget v3, v1, Ll/ܰۙᩴ;->ܿ:I

    iget v4, v1, Ll/ܰۙᩴ;->ܰ:I

    iget-object v5, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    if-ne v3, v4, :cond_2

    .line 523
    iget p2, v5, Ll/ܰۤᩴ;->ܳۙ:F

    const/4 v1, 0x0

    goto :goto_2

    .line 525
    :cond_2
    iget-object v3, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-interface {v3}, Ll/ۡ᩶᩸;->ܽۙ()Ll/ܳܿ᩸;

    move-result-object v3

    .line 526
    :try_start_0
    iget v4, v1, Ll/ܰۙᩴ;->ܿ:I

    invoke-virtual {v1}, Ll/ܰۙᩴ;->ۙ()I

    move-result v6

    invoke-direct {p0, v4, v6, v3}, Ll/۬ۡ᩸;->ۙ(IILjava/lang/CharSequence;)Ll/ᩴۚܺ;

    move-result-object v4

    const/high16 v6, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 918
    invoke-virtual {v4, v6, p2}, Ll/ᩴۚܺ;->ۙ(FI)F

    move-result v7

    .line 528
    invoke-virtual {v1}, Ll/ܰۙᩴ;->ۙ()I

    move-result v8

    if-gt v8, p2, :cond_3

    .line 529
    iget p2, v5, Ll/ܰۤᩴ;->ܳۙ:F

    add-float/2addr p2, v7

    goto :goto_1

    .line 531
    :cond_3
    invoke-virtual {v1}, Ll/ܰۙᩴ;->ۙ()I

    move-result v1

    invoke-static {p2, v1, v3}, Ll/֫ۚܺ;->ۙ(IILjava/lang/CharSequence;)I

    move-result p2

    .line 918
    invoke-virtual {v4, v6, p2}, Ll/ᩴۚܺ;->ۙ(FI)F

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 533
    :goto_1
    invoke-virtual {v3}, Ll/ܳܿ᩸;->close()V

    move v1, v7

    :goto_2
    add-float/2addr v1, v2

    .line 535
    iput v1, p1, Landroid/graphics/RectF;->left:F

    add-float/2addr p2, v2

    .line 536
    iput p2, p1, Landroid/graphics/RectF;->right:F

    .line 537
    invoke-direct {p0, p1, v0}, Ll/۬ۡ᩸;->ۤ(Landroid/graphics/RectF;I)V

    return-void

    :catchall_0
    move-exception p1

    .line 525
    :try_start_1
    invoke-virtual {v3}, Ll/ܳܿ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public ۙ(Ljava/lang/String;)V
    .locals 8

    .line 234
    iput-object p1, p0, Ll/۬ۡ᩸;->᩺:Ljava/lang/String;

    const/16 v0, 0xa

    if-eqz p1, :cond_0

    .line 235
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-ltz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Ll/۬ۡ᩸;->ۡ:Z

    if-eqz p1, :cond_5

    .line 236
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_3

    .line 240
    :cond_1
    new-instance v1, Ll/ۜۙᩴ;

    invoke-direct {v1}, Ll/ۜۙᩴ;-><init>()V

    .line 245
    new-instance v2, Ll/ܰۙᩴ;

    invoke-direct {v2}, Ll/ܰۙᩴ;-><init>()V

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-eqz v3, :cond_4

    .line 609
    iget-object v6, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {v6}, Ll/᩺ۜ᩸;->۫ۤ()Z

    move-result v6

    const/4 v7, -0x1

    if-eqz v6, :cond_2

    const/4 v6, -0x1

    goto :goto_2

    .line 612
    :cond_2
    invoke-virtual {p1, v0, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    :goto_2
    if-ne v6, v7, :cond_3

    .line 250
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v3, 0x0

    .line 252
    :cond_3
    invoke-virtual {v2, v4, v6, v5}, Ll/ܰۙᩴ;->ۙ(III)V

    .line 253
    invoke-virtual {v1, v2}, Ll/ۜۙᩴ;->ۙ(Ll/ܰۙᩴ;)V

    add-int/lit8 v4, v6, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 257
    :cond_4
    iput-object v1, p0, Ll/۬ۡ᩸;->ۘ:Ll/ۜۙᩴ;

    return-void

    .line 237
    :cond_5
    :goto_3
    iget-object p1, p0, Ll/۬ۡ᩸;->ۘ:Ll/ۜۙᩴ;

    invoke-virtual {p1}, Ll/ۜۙᩴ;->clear()V

    return-void
.end method

.method public ۙ(Ll/ۛۚۤ;)V
    .locals 6

    .line 2119
    invoke-virtual {p0}, Ll/۬ۡ᩸;->֫()B

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->writeByte(I)V

    .line 2120
    iget v0, p0, Ll/۬ۡ᩸;->֡:I

    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->writeInt(I)V

    .line 2122
    iget-boolean v0, p0, Ll/۬ۡ᩸;->ᩳ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/۬ۡ᩸;->֫()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2125
    new-instance v0, Ll/ۜۙᩴ;

    iget-object v1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-direct {v0, v1}, Ll/ۜۙᩴ;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    .line 2127
    :cond_0
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    .line 2129
    :goto_0
    invoke-virtual {v0}, Ll/ۜۙᩴ;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛۚۤ;->writeInt(I)V

    const v1, -0xedc86dd

    .line 2130
    invoke-virtual {p1, v1}, Ll/ۛۚۤ;->writeInt(I)V

    .line 2131
    invoke-virtual {v0}, Ll/ۜۙᩴ;->᩷()Ll/ܿۙᩴ;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 2132
    :goto_1
    invoke-virtual {v0}, Ll/ۜۙᩴ;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 2133
    invoke-virtual {v1, v3}, Ll/ܿۙᩴ;->ۙ(I)Ll/ܰۙᩴ;

    move-result-object v4

    .line 2134
    iget v5, v4, Ll/ܰۙᩴ;->ܿ:I

    invoke-virtual {p1, v5}, Ll/ۛۚۤ;->writeInt(I)V

    .line 2135
    iget v5, v4, Ll/ܰۙᩴ;->ܰ:I

    invoke-virtual {p1, v5}, Ll/ۛۚۤ;->writeInt(I)V

    .line 2136
    iget v4, v4, Ll/ܰۙᩴ;->᩶:I

    invoke-virtual {p1, v4}, Ll/ۛۚۤ;->writeInt(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const v0, 0x723a4824

    .line 2138
    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->writeInt(I)V

    .line 2139
    iget-object v0, p0, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    invoke-virtual {v0}, Ll/ܽۙᩴ;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->writeInt(I)V

    .line 2140
    iget-object v0, p0, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    new-instance v1, Ll/ۧۙᩴ;

    invoke-direct {v1, v0}, Ll/ۧۙᩴ;-><init>(Ll/ܽۙᩴ;)V

    .line 2141
    :goto_2
    iget-object v0, p0, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    invoke-virtual {v0}, Ll/ܽۙᩴ;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 2142
    invoke-virtual {v1, v2}, Ll/ۧۙᩴ;->ۤ(I)Z

    .line 2143
    invoke-virtual {v1}, Ll/ۧۙᩴ;->ۤ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->᩻(I)V

    .line 2144
    invoke-virtual {v1}, Ll/ۧۙᩴ;->ۙ()C

    move-result v0

    const/16 v3, 0xff

    if-le v0, v3, :cond_2

    const/16 v0, 0xff

    .line 2147
    :cond_2
    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->writeByte(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final ۙ(Ll/ᩳ۬᩸;)V
    .locals 2

    .line 176
    iget-object v0, p0, Ll/۬ۡ᩸;->۬:Ljava/lang/Object;

    monitor-enter v0

    .line 177
    :try_start_0
    iget-object v1, p0, Ll/۬ۡ᩸;->ۜ:Ll/ܳܿ᩸;

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    if-eq v1, p1, :cond_1

    :cond_0
    invoke-interface {p1}, Ll/ۡ᩶᩸;->ܽۙ()Ll/ܳܿ᩸;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Ll/۬ۡ᩸;->ۙ(Ll/ᩳ۬᩸;Ll/ܳܿ᩸;)V

    .line 178
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    invoke-virtual {p0}, Ll/۬ۡ᩸;->ܺ()V

    return-void

    :catchall_0
    move-exception p1

    .line 178
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(Ll/ᩳ۬᩸;Ll/ܳܿ᩸;)V
    .locals 1

    .line 81
    iget-object v0, p0, Ll/۬ۡ᩸;->۬:Ljava/lang/Object;

    monitor-enter v0

    .line 82
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۡ᩸;->֡()V

    .line 83
    iput-object p1, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    .line 84
    iput-object p2, p0, Ll/۬ۡ᩸;->ۜ:Ll/ܳܿ᩸;

    .line 85
    invoke-virtual {p2}, Ll/ܳܿ᩸;->ܳ()I

    move-result p1

    iput p1, p0, Ll/۬ۡ᩸;->ܺۙ:I

    .line 86
    invoke-virtual {p2}, Ll/ܳܿ᩸;->length()I

    move-result p1

    iput p1, p0, Ll/۬ۡ᩸;->ܿ:I

    .line 87
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    invoke-virtual {p0}, Ll/۬ۡ᩸;->ܺ()V

    return-void

    :catchall_0
    move-exception p1

    .line 87
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public abstract ۙ()Z
.end method

.method public final ۙ(Landroid/graphics/RectF;)Z
    .locals 9

    .line 475
    iget-object v0, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v0

    .line 476
    iget-object v1, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-static {v1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    if-le v0, v1, :cond_1

    move v8, v1

    move v1, v0

    move v0, v8

    .line 549
    :cond_1
    iget-boolean v2, p0, Ll/۬ۡ᩸;->ܳۙ:Z

    invoke-virtual {p0, v0, v2}, Ll/۬ۡ᩸;->ۙ(IZ)I

    move-result v2

    .line 485
    iget-object v3, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v3, v2}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v3

    .line 486
    iget v4, v3, Ll/ܰۙᩴ;->ܿ:I

    if-ge v4, v1, :cond_2

    iget v4, v3, Ll/ܰۙᩴ;->ܰ:I

    if-gt v1, v4, :cond_2

    .line 487
    invoke-virtual {p0, v2}, Ll/۬ۡ᩸;->ᩴ(I)F

    move-result v4

    .line 488
    iget-object v5, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-interface {v5}, Ll/ۡ᩶᩸;->ܽۙ()Ll/ܳܿ᩸;

    move-result-object v5

    .line 489
    :try_start_0
    iget v6, v3, Ll/ܰۙᩴ;->ܿ:I

    invoke-virtual {v3}, Ll/ܰۙᩴ;->ۙ()I

    move-result v7

    invoke-direct {p0, v6, v7, v5}, Ll/۬ۡ᩸;->ۙ(IILjava/lang/CharSequence;)Ll/ᩴۚܺ;

    move-result-object v6

    .line 490
    invoke-virtual {v3}, Ll/ܰۙᩴ;->ۙ()I

    move-result v7

    invoke-static {v0, v7}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 918
    invoke-virtual {v6, v7, v0}, Ll/ᩴۚܺ;->ۙ(FI)F

    move-result v0

    .line 491
    invoke-virtual {v3}, Ll/ܰۙᩴ;->ۙ()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 918
    invoke-virtual {v6, v7, v1}, Ll/ᩴۚܺ;->ۙ(FI)F

    move-result v1

    add-float/2addr v0, v4

    .line 492
    iput v0, p1, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v4

    .line 493
    iput v1, p1, Landroid/graphics/RectF;->right:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 494
    invoke-virtual {v5}, Ll/ܳܿ᩸;->close()V

    .line 495
    invoke-direct {p0, p1, v2}, Ll/۬ۡ᩸;->ۤ(Landroid/graphics/RectF;I)V

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    .line 488
    :try_start_1
    invoke-virtual {v5}, Ll/ܳܿ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public ۚ()I
    .locals 3

    .line 351
    iget-object v0, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    iget-boolean v1, v0, Ll/ܰۤᩴ;->᩻᩷:Z

    iget v2, v0, Ll/ܰۤᩴ;->ᩳۙ:I

    if-eqz v1, :cond_1

    .line 352
    iget-boolean v1, v0, Ll/ܰۤᩴ;->ۨۙ:Z

    if-eqz v1, :cond_0

    .line 353
    iget v0, v0, Ll/ܰۤᩴ;->ܽۙ:I

    add-int/2addr v2, v0

    return v2

    .line 355
    :cond_0
    iget v0, v0, Ll/ܰۤᩴ;->ܽۙ:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    .line 358
    :cond_1
    iget-boolean v1, v0, Ll/ܰۤᩴ;->ۡ᩷:Z

    if-eqz v1, :cond_2

    iget v1, p0, Ll/۬ۡ᩸;->֡:I

    iget v0, v0, Ll/ܰۤᩴ;->ܽۙ:I

    add-int/2addr v1, v0

    return v1

    :cond_2
    iget v0, v0, Ll/ܰۤᩴ;->ܶۙ:I

    return v0
.end method

.method public ۛ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۟()V
    .locals 1

    const/4 v0, 0x1

    .line 390
    iput-boolean v0, p0, Ll/۬ۡ᩸;->ܳۙ:Z

    return-void
.end method

.method public final ۢ()I
    .locals 1

    .line 66
    iget v0, p0, Ll/۬ۡ᩸;->ܺۙ:I

    return v0
.end method

.method public final ۤ(I)F
    .locals 4

    int-to-double v0, p1

    .line 641
    iget-object p1, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    invoke-virtual {p1}, Ll/ۚۚܺ;->֫()F

    move-result p1

    float-to-double v2, p1

    mul-double v0, v0, v2

    iget p1, p0, Ll/۬ۡ᩸;->۫:I

    int-to-double v2, p1

    sub-double/2addr v0, v2

    double-to-float p1, v0

    return p1
.end method

.method public ۤ(II)J
    .locals 4

    .line 1975
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/۬ۡ᩸;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, p0}, Ll/᩺ۜ᩸;->᩷(Ll/۬ۡ᩸;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1976
    :cond_0
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    int-to-double v1, p1

    invoke-virtual {p0, v1, v2}, Ll/۬ۡ᩸;->ۙ(D)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v0

    .line 1977
    iget-object v1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    add-int/2addr p1, p2

    int-to-double p1, p1

    invoke-virtual {p0, p1, p2}, Ll/۬ۡ᩸;->ۙ(D)I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object p1

    .line 1978
    iget p2, v0, Ll/ܰۙᩴ;->ܿ:I

    int-to-long v0, p2

    const/16 p2, 0x20

    shl-long/2addr v0, p2

    invoke-virtual {p1}, Ll/ܰۙᩴ;->ۙ()I

    move-result p1

    int-to-long p1, p1

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    or-long/2addr p1, v0

    return-wide p1

    :cond_1
    :goto_0
    const-wide/16 p1, -0x1

    return-wide p1
.end method

.method public final ۤ()V
    .locals 2

    .line 117
    instance-of v0, p0, Ll/ۡ᩸ᩴ;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ll/ۡ᩸ᩴ;

    .line 118
    invoke-virtual {v0}, Ll/ۡ᩸ᩴ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 120
    :goto_0
    iget-object v1, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {v1, v0}, Ll/᩺ۜ᩸;->۫(I)Ll/ܳۜ᩸;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۡ᩸;->ܳ:Ll/ܳۜ᩸;

    return-void
.end method

.method public abstract ۧ()F
.end method

.method public ۨ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۫()Ll/ۜۡ᩸;
    .locals 11

    .line 1941
    iget v0, p0, Ll/۬ۡ᩸;->۠:I

    if-ltz v0, :cond_5

    invoke-virtual {p0, v0}, Ll/۬ۡ᩸;->᩷(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1942
    :cond_0
    iget-object v0, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩻ۙ()I

    move-result v1

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۧۙ()I

    move-result v2

    if-lez v1, :cond_5

    if-gtz v2, :cond_1

    goto :goto_0

    .line 1944
    :cond_1
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 1945
    iget v4, p0, Ll/۬ۡ᩸;->۠:I

    invoke-virtual {p0, v3, v4}, Ll/۬ۡ᩸;->ۙ(Landroid/graphics/RectF;I)V

    .line 1947
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v0

    const/4 v4, 0x0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1948
    iget v5, v3, Landroid/graphics/RectF;->top:F

    int-to-float v6, v0

    cmpg-float v6, v5, v6

    if-ltz v6, :cond_2

    iget v6, v3, Landroid/graphics/RectF;->bottom:F

    int-to-long v7, v0

    int-to-long v9, v2

    add-long/2addr v7, v9

    long-to-float v7, v7

    cmpl-float v6, v6, v7

    if-lez v6, :cond_3

    :cond_2
    float-to-int v0, v5

    .line 1949
    div-int/lit8 v5, v2, 0x2

    sub-int/2addr v0, v5

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 267
    :cond_3
    invoke-virtual {p0}, Ll/۬ۡ᩸;->ᩴ()D

    move-result-wide v5

    double-to-float v5, v5

    float-to-int v5, v5

    sub-int/2addr v5, v2

    .line 1951
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 1952
    invoke-virtual {p0}, Ll/۬ۡ᩸;->ۙ()Z

    move-result v5

    if-eqz v5, :cond_4

    iget v3, v3, Landroid/graphics/RectF;->right:F

    float-to-int v3, v3

    div-int/lit8 v5, v1, 0x2

    sub-int/2addr v3, v5

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 1953
    :cond_4
    new-instance v3, Ll/ۜۡ᩸;

    invoke-direct {v3, v4, v0, v1, v2}, Ll/ۜۡ᩸;-><init>(IIII)V

    return-object v3

    :cond_5
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract ܰ()V
.end method

.method public ܳ()I
    .locals 3

    .line 307
    iget-object v0, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    iget-boolean v1, v0, Ll/ܰۤᩴ;->᩻᩷:Z

    iget v2, v0, Ll/ܰۤᩴ;->ᩳۙ:I

    if-eqz v1, :cond_1

    .line 308
    iget-boolean v1, v0, Ll/ܰۤᩴ;->ۡ᩷:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/۬ۡ᩸;->֡:I

    iget v0, v0, Ll/ܰۤᩴ;->ܽۙ:I

    add-int/2addr v1, v0

    return v1

    :cond_0
    iget v0, v0, Ll/ܰۤᩴ;->ܶۙ:I

    return v0

    .line 310
    :cond_1
    iget-boolean v1, v0, Ll/ܰۤᩴ;->ۨۙ:Z

    if-eqz v1, :cond_2

    .line 311
    iget v0, v0, Ll/ܰۤᩴ;->ܽۙ:I

    add-int/2addr v2, v0

    return v2

    .line 313
    :cond_2
    iget v0, v0, Ll/ܰۤᩴ;->ܽۙ:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public ܳ(I)V
    .locals 0

    return-void
.end method

.method public final ܶ()Z
    .locals 1

    .line 620
    iget-boolean v0, p0, Ll/۬ۡ᩸;->᩸ۙ:Z

    return v0
.end method

.method public final ܺ()V
    .locals 3

    .line 184
    instance-of v0, p0, Ll/᩸ۙᩴ;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ll/᩸ۙᩴ;

    invoke-virtual {v0}, Ll/᩸ۙᩴ;->ۖ()V

    .line 185
    :cond_0
    iget-object v0, p0, Ll/۬ۡ᩸;->ۚ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 186
    iget-object v0, p0, Ll/۬ۡ᩸;->ۤ:Ll/ܳܿ᩸;

    if-nez v0, :cond_1

    goto :goto_0

    .line 187
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 188
    invoke-direct {p0}, Ll/۬ۡ᩸;->ۖ()V

    return-void

    .line 189
    :cond_2
    iget-object v0, p0, Ll/۬ۡ᩸;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 190
    iget-object v0, p0, Ll/۬ۡ᩸;->ۙۙ:Ljava/lang/Runnable;

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public ܽ()Z
    .locals 1

    .line 2158
    iget-boolean v0, p0, Ll/۬ۡ᩸;->ᩳ:Z

    return v0
.end method

.method public abstract ܿ()Ljava/lang/Throwable;
.end method

.method public final ᩳ()I
    .locals 1

    .line 67
    iget v0, p0, Ll/۬ۡ᩸;->ܿ:I

    return v0
.end method

.method public final ᩴ()D
    .locals 7

    .line 272
    invoke-virtual {p0}, Ll/۬ۡ᩸;->᩺()Z

    move-result v0

    .line 773
    iget-object v1, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    iget-object v2, v1, Ll/᩺ۜ᩸;->᩷ۙ:Ll/ܽᩴᩴ;

    .line 274
    iget-object v3, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    invoke-virtual {v3}, Ll/ۚۚܺ;->֫()F

    move-result v3

    float-to-double v3, v3

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۬ۡ᩸;->ۘ:Ll/ۜۙᩴ;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    :goto_0
    invoke-virtual {v0}, Ll/ۜۙᩴ;->size()I

    move-result v0

    int-to-double v5, v0

    mul-double v3, v3, v5

    .line 275
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/ܽᩴᩴ;->ۙ()I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-double v0, v0

    add-double/2addr v3, v0

    return-wide v3
.end method

.method public final ᩴ(I)F
    .locals 2

    .line 319
    invoke-virtual {p0}, Ll/۬ۡ᩸;->ܳ()I

    move-result v0

    .line 320
    invoke-virtual {p0}, Ll/۬ۡ᩸;->ۛ()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    .line 220
    invoke-virtual {v1, p1}, Ll/ۜۙᩴ;->۫(I)Z

    move-result p1

    if-nez p1, :cond_0

    .line 321
    iget-object p1, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    invoke-virtual {p1}, Ll/ܰۤᩴ;->ܰ()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    int-to-float p1, v0

    const/4 v0, 0x0

    .line 347
    invoke-virtual {p0, v0}, Ll/۬ۡ᩸;->ۙ(Z)F

    move-result v0

    add-float/2addr p1, v0

    return p1
.end method

.method public ᩴ(II)Z
    .locals 11

    .line 67
    iget v0, p0, Ll/۬ۡ᩸;->ܿ:I

    const/4 v1, 0x0

    .line 2197
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 2198
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v0, 0x1

    if-ge p1, p2, :cond_3

    .line 2199
    iget-object v2, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    invoke-virtual {v2}, Ll/ܽۙᩴ;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_3

    .line 2202
    :cond_0
    invoke-virtual {p0, p1, v0}, Ll/۬ۡ᩸;->ۙ(IZ)I

    move-result p1

    sub-int/2addr p2, v0

    .line 2203
    invoke-virtual {p0, p2, v1}, Ll/۬ۡ᩸;->ۙ(IZ)I

    move-result p2

    .line 2204
    iget-object v1, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v1, p1}, Ll/ۜۙᩴ;->᩻(I)I

    move-result v1

    .line 2205
    iget-object v2, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v2, p2}, Ll/ۜۙᩴ;->᩻(I)I

    move-result p2

    add-int/2addr p2, v0

    .line 2206
    iget-object v2, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v2, p1}, Ll/ۜۙᩴ;->᩸(I)I

    move-result p1

    .line 2207
    iget-object v2, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    invoke-virtual {v2}, Ll/ۚۚܺ;->ܽ()I

    move-result v2

    .line 2209
    iget-object v3, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-interface {v3}, Ll/ۡ᩶᩸;->ܽۙ()Ll/ܳܿ᩸;

    move-result-object v9

    move v10, v1

    :goto_0
    if-ge v10, p2, :cond_2

    .line 2211
    :try_start_0
    iget-object v3, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v3, v10, p1}, Ll/ۜۙᩴ;->᩸(II)I

    move-result p1

    const/4 v3, -0x1

    if-eq p1, v3, :cond_2

    .line 2212
    iget-object v3, p0, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    invoke-virtual {v3}, Ll/ܽۙᩴ;->size()I

    move-result v3

    if-lt v10, v3, :cond_1

    goto :goto_2

    .line 2215
    :cond_1
    iget-object v3, p0, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    iget-object v4, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v4, p1}, Ll/ۜۙᩴ;->ۨ(I)I

    move-result v7

    move v4, v10

    move-object v5, p0

    move-object v6, v9

    move v8, v2

    invoke-virtual/range {v3 .. v8}, Ll/ܽۙᩴ;->ۙ(ILl/۬ۡ᩸;Ll/ܳܿ᩸;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 2209
    :try_start_1
    invoke-virtual {v9}, Ll/ܳܿ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1

    .line 2217
    :cond_2
    :goto_2
    invoke-virtual {v9}, Ll/ܳܿ᩸;->close()V

    .line 2218
    iget-object p1, p0, Ll/۬ۡ᩸;->ܰ:Ll/ܽۙᩴ;

    invoke-virtual {p1, v1, p2}, Ll/ܽۙᩴ;->᩸(II)V

    .line 2220
    iget-object p1, p0, Ll/۬ۡ᩸;->᩶:Ll/ܳۙᩴ;

    const/high16 p2, -0x80000000

    iput p2, p1, Ll/ܳۙᩴ;->᩸:I

    :cond_3
    :goto_3
    return v0
.end method

.method public final ᩵()Z
    .locals 2

    .line 68
    iget-object v0, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    if-eqz v0, :cond_0

    iget v0, p0, Ll/۬ۡ᩸;->ܺۙ:I

    iget-object v1, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-interface {v1}, Ll/ۡ᩶᩸;->ۛ᩷()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩶()Ll/ܳܿ᩸;
    .locals 2

    .line 57
    iget-object v0, p0, Ll/۬ۡ᩸;->۬:Ljava/lang/Object;

    monitor-enter v0

    .line 58
    :try_start_0
    iget-object v1, p0, Ll/۬ۡ᩸;->ۜ:Ll/ܳܿ᩸;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-interface {v1}, Ll/ۡ᩶᩸;->ܽۙ()Ll/ܳܿ᩸;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll/ܳܿ᩸;->ۙ()Ll/ܳܿ᩸;

    move-result-object v1

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 59
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩷(F)F
    .locals 2

    .line 636
    iget-object v0, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr p1, v1

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v0

    iget v1, p0, Ll/۬ۡ᩸;->۫:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    add-float/2addr p1, v0

    return p1
.end method

.method public final ᩷(Z)F
    .locals 2

    .line 341
    invoke-direct {p0, p1}, Ll/۬ۡ᩸;->ۤ(Z)I

    move-result p1

    and-int/lit8 p1, p1, 0x70

    const/16 v0, 0x10

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    return v1

    .line 342
    :cond_0
    iget-object p1, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ۧۙ()I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Ll/۬ۡ᩸;->ۚۙ:Ll/ܰۤᩴ;

    invoke-virtual {v0}, Ll/ۚۚܺ;->֫()F

    move-result v0

    sub-float/2addr p1, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    return p1
.end method

.method public ᩷(II)J
    .locals 2

    .line 1983
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/۬ۡ᩸;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, p0}, Ll/᩺ۜ᩸;->᩷(Ll/۬ۡ᩸;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    int-to-double v0, p1

    .line 1984
    invoke-virtual {p0, v0, v1}, Ll/۬ۡ᩸;->ۙ(D)I

    move-result v0

    add-int/2addr p1, p2

    int-to-double p1, p1

    .line 1985
    invoke-virtual {p0, p1, p2}, Ll/۬ۡ᩸;->ۙ(D)I

    move-result p1

    .line 1984
    invoke-direct {p0, v0, p1}, Ll/۬ۡ᩸;->ܳ(II)J

    move-result-wide p1

    return-wide p1

    :cond_1
    :goto_0
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public abstract ᩷()V
.end method

.method public final ᩷(Landroid/graphics/RectF;I)V
    .locals 1

    if-gez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 67
    :cond_0
    iget v0, p0, Ll/۬ۡ᩸;->ܿ:I

    if-le p2, v0, :cond_1

    move p2, v0

    .line 549
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/۬ۡ᩸;->ܳۙ:Z

    invoke-virtual {p0, p2, v0}, Ll/۬ۡ᩸;->ۙ(IZ)I

    move-result p2

    .line 504
    invoke-direct {p0, p1, p2}, Ll/۬ۡ᩸;->ۤ(Landroid/graphics/RectF;I)V

    return-void
.end method

.method public abstract ᩷(Ll/ᩳ۬᩸;)V
.end method

.method public ᩷(I)Z
    .locals 1

    .line 1970
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0}, Ll/ۜۙᩴ;->᩸()Ll/ܰۙᩴ;

    move-result-object v0

    iget v0, v0, Ll/ܰۙᩴ;->ܰ:I

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract ᩷(Ll/ۜۡ᩸;)Z
.end method

.method public final ᩸(I)I
    .locals 1

    .line 549
    iget-boolean v0, p0, Ll/۬ۡ᩸;->ܳۙ:Z

    invoke-virtual {p0, p1, v0}, Ll/۬ۡ᩸;->ۙ(IZ)I

    move-result p1

    return p1
.end method

.method public final ᩸()V
    .locals 2

    .line 226
    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    invoke-virtual {v0}, Ll/ۜۙᩴ;->᩸()Ll/ܰۙᩴ;

    move-result-object v0

    iget v0, v0, Ll/ܰۙᩴ;->ܰ:I

    .line 67
    iget v1, p0, Ll/۬ۡ᩸;->ܿ:I

    if-ne v0, v1, :cond_0

    return-void

    .line 229
    :cond_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "Lines check fail. Try fix."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 230
    iget-object v0, p0, Ll/۬ۡ᩸;->ۢ:Ll/ᩳ۬᩸;

    invoke-virtual {p0, v0}, Ll/۬ۡ᩸;->᩷(Ll/ᩳ۬᩸;)V

    return-void
.end method

.method public final ᩸(II)Z
    .locals 2

    const/4 v0, 0x0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 67
    :cond_0
    iget v1, p0, Ll/۬ۡ᩸;->ܿ:I

    if-le p1, v1, :cond_1

    move p1, v1

    :cond_1
    :goto_0
    if-gez p2, :cond_2

    const/4 p2, 0x0

    goto :goto_1

    :cond_2
    iget v1, p0, Ll/۬ۡ᩸;->ܿ:I

    if-le p2, v1, :cond_3

    move p2, v1

    .line 549
    :cond_3
    :goto_1
    iget-boolean v1, p0, Ll/۬ۡ᩸;->ܳۙ:Z

    invoke-virtual {p0, p1, v1}, Ll/۬ۡ᩸;->ۙ(IZ)I

    move-result p1

    iget-boolean v1, p0, Ll/۬ۡ᩸;->ܳۙ:Z

    invoke-virtual {p0, p2, v1}, Ll/۬ۡ᩸;->ۙ(IZ)I

    move-result p2

    if-ne p1, p2, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    return v0
.end method

.method public final ᩹()Z
    .locals 1

    .line 616
    iget-boolean v0, p0, Ll/۬ۡ᩸;->ᩴۙ:Z

    return v0
.end method

.method public final ᩺()Z
    .locals 1

    .line 2255
    iget-object v0, p0, Ll/۬ۡ᩸;->ܺ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->֡᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    iget v0, p0, Ll/۬ۡ᩸;->ܿ:I

    if-nez v0, :cond_0

    .line 2255
    iget-object v0, p0, Ll/۬ۡ᩸;->ۘ:Ll/ۜۙᩴ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 63
    iget-object v0, p0, Ll/۬ۡ᩸;->۬:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/۬ۡ᩸;->ۜ:Ll/ܳܿ᩸;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

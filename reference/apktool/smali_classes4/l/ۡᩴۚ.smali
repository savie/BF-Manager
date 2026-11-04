.class public final Ll/ۡᩴۚ;
.super Ll/ܽ֡֫;
.source "26HN"


# static fields
.field public static final synthetic ᩺᩷:I


# instance fields
.field public final ֫᩷:Landroid/os/Handler;

.field public ۗ᩷:Landroid/view/MenuItem;

.field public ۚ᩷:J

.field public final ۛ᩷:Ljava/lang/Runnable;

.field public ۧ᩷:Ll/ۚܿ᩻;

.field public final ۨ᩷:Landroid/content/BroadcastReceiver;

.field public ۫᩷:Ljava/util/List;

.field public ܳ᩷:Landroid/view/MenuItem;

.field public ܶ᩷:I

.field public ܺ᩷:Z

.field public ܽ᩷:J

.field public final ᩴ᩷:Ll/ۤۤۚ;

.field public ᩵᩷:Z

.field public final ᩸᩷:Ll/ᩳᩴۚ;

.field public ᩹᩷:Z

.field public final ᩻᩷:Ll/ۙۨܳ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 46
    invoke-direct {p0}, Ll/ܽ֡֫;-><init>()V

    .line 51
    invoke-static {}, Ll/ۤۤۚ;->۫()Ll/ۤۤۚ;

    move-result-object v0

    iput-object v0, p0, Ll/ۡᩴۚ;->ᩴ᩷:Ll/ۤۤۚ;

    .line 52
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ۡᩴۚ;->֫᩷:Landroid/os/Handler;

    .line 53
    new-instance v0, Ll/ᩳᩴۚ;

    invoke-direct {v0, p0}, Ll/ᩳᩴۚ;-><init>(Ll/ۡᩴۚ;)V

    iput-object v0, p0, Ll/ۡᩴۚ;->᩸᩷:Ll/ᩳᩴۚ;

    .line 54
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۡᩴۚ;->۫᩷:Ljava/util/List;

    .line 58
    new-instance v0, Ll/᩶ᩴۚ;

    invoke-direct {v0, p0}, Ll/᩶ᩴۚ;-><init>(Ll/ۡᩴۚ;)V

    iput-object v0, p0, Ll/ۡᩴۚ;->ۨ᩷:Landroid/content/BroadcastReceiver;

    const-wide/16 v0, -0x1

    .line 69
    iput-wide v0, p0, Ll/ۡᩴۚ;->ۚ᩷:J

    .line 70
    iput-wide v0, p0, Ll/ۡᩴۚ;->ܽ᩷:J

    .line 74
    new-instance v0, Ll/ۙۨܳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ۙۨܳ;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/ۡᩴۚ;->᩻᩷:Ll/ۙۨܳ;

    .line 108
    new-instance v0, Ll/ܿᩴۚ;

    invoke-direct {v0, p0}, Ll/ܿᩴۚ;-><init>(Ll/ۡᩴۚ;)V

    iput-object v0, p0, Ll/ۡᩴۚ;->ۛ᩷:Ljava/lang/Runnable;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡᩴۚ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/ۡᩴۚ;->᩵᩷:Z

    return-void
.end method

.method public static ۙ(Ll/ۡᩴۚ;)V
    .locals 3

    .line 283
    iget-boolean v0, p0, Ll/ۡᩴۚ;->᩹᩷:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۡᩴۚ;->ܺ᩷:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 284
    iput-boolean v0, p0, Ll/ۡᩴۚ;->ܺ᩷:Z

    .line 285
    iget-object v0, p0, Ll/ۡᩴۚ;->֫᩷:Landroid/os/Handler;

    iget-object p0, p0, Ll/ۡᩴۚ;->᩻᩷:Ll/ۙۨܳ;

    const-wide/16 v1, 0x32

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۡᩴۚ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۡᩴۚ;->ۚ᩷:J

    return-void
.end method

.method public static bridge synthetic ۚ(Ll/ۡᩴۚ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۡᩴۚ;->᩹᩷:Z

    return p0
.end method

.method public static synthetic ۤ(Ll/ۡᩴۚ;)V
    .locals 13

    const/4 v0, 0x0

    .line 75
    iput-boolean v0, p0, Ll/ۡᩴۚ;->ܺ᩷:Z

    .line 76
    iget-boolean v1, p0, Ll/ۡᩴۚ;->᩹᩷:Z

    if-nez v1, :cond_0

    goto/16 :goto_5

    .line 77
    :cond_0
    iget-object v1, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v1

    .line 78
    iget-object v3, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    invoke-virtual {v3}, Ll/ۚܿ᩻;->getLayoutManager()Ll/֡֡᩷;

    move-result-object v3

    .line 79
    invoke-virtual {v3}, Ll/֡֡᩷;->findFirstVisibleItemPosition()I

    move-result v4

    const-wide/16 v5, -0x1

    if-ltz v4, :cond_1

    .line 80
    iget-object v7, p0, Ll/ۡᩴۚ;->۫᩷:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v4, v7, :cond_1

    iget-object v7, p0, Ll/ۡᩴۚ;->۫᩷:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۬᩷ۚ;

    iget-wide v7, v7, Ll/۬᩷ۚ;->᩸:J

    goto :goto_0

    :cond_1
    move-wide v7, v5

    .line 81
    :goto_0
    invoke-virtual {v3, v4}, Ll/֡֡᩷;->findViewByPosition(I)Landroid/view/View;

    move-result-object v9

    if-nez v9, :cond_2

    const/4 v9, 0x0

    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {v9}, Landroid/view/View;->getTop()I

    move-result v9

    iget-object v10, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    invoke-virtual {v10}, Landroid/view/View;->getPaddingTop()I

    move-result v10

    sub-int/2addr v9, v10

    .line 83
    :goto_1
    iget-wide v10, p0, Ll/ۡᩴۚ;->ܽ᩷:J

    cmp-long v12, v10, v5

    if-eqz v12, :cond_3

    const/4 v12, 0x1

    goto :goto_2

    :cond_3
    const/4 v12, 0x0

    :goto_2
    if-eqz v12, :cond_4

    .line 86
    iget v9, p0, Ll/ۡᩴۚ;->ܶ᩷:I

    .line 87
    iput-wide v5, p0, Ll/ۡᩴۚ;->ܽ᩷:J

    move-wide v7, v10

    .line 89
    :cond_4
    iget-object v5, p0, Ll/ۡᩴۚ;->ᩴ᩷:Ll/ۤۤۚ;

    invoke-virtual {v5}, Ll/ۤۤۚ;->᩸()Ljava/util/ArrayList;

    move-result-object v5

    iput-object v5, p0, Ll/ۡᩴۚ;->۫᩷:Ljava/util/List;

    .line 90
    iget-object v6, p0, Ll/ۡᩴۚ;->ܳ᩷:Landroid/view/MenuItem;

    if-eqz v6, :cond_5

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    invoke-interface {v6, v5}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 91
    :cond_5
    iget-object v5, p0, Ll/ۡᩴۚ;->᩸᩷:Ll/ᩳᩴۚ;

    invoke-virtual {v5}, Ll/۫۟᩷;->notifyDataSetChanged()V

    if-nez v12, :cond_6

    if-nez v1, :cond_6

    if-eq v4, v2, :cond_6

    .line 93
    iget-object p0, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    invoke-virtual {p0, v0}, Ll/ۚܿ᩻;->scrollToPosition(I)V

    return-void

    :cond_6
    const/4 v1, 0x0

    .line 97
    :goto_3
    iget-object v2, p0, Ll/ۡᩴۚ;->۫᩷:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_8

    .line 98
    iget-object v2, p0, Ll/ۡᩴۚ;->۫᩷:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬᩷ۚ;

    iget-wide v4, v2, Ll/۬᩷ۚ;->᩸:J

    cmp-long v2, v4, v7

    if-nez v2, :cond_7

    .line 99
    invoke-virtual {v3, v1, v9}, Ll/֡֡᩷;->scrollToPositionWithOffset(II)V

    const/4 v1, 0x1

    goto :goto_4

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_8
    const/4 v1, 0x0

    :goto_4
    if-eqz v12, :cond_9

    if-nez v1, :cond_9

    .line 105
    iget-object p0, p0, Ll/ۡᩴۚ;->۫᩷:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-virtual {v3, p0, v0}, Ll/֡֡᩷;->scrollToPositionWithOffset(II)V

    :cond_9
    :goto_5
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۡᩴۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۡᩴۚ;->᩷ۙ()V

    return-void
.end method

.method public static bridge synthetic ۫(Ll/ۡᩴۚ;)Ll/ۚܿ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۡᩴۚ;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡᩴۚ;->֫᩷:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic ᩴ(Ll/ۡᩴۚ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۡᩴۚ;->ۚ᩷:J

    return-wide v0
.end method

.method public static ᩷(Ll/ۡᩴۚ;J)Ljava/lang/String;
    .locals 5

    const-wide/16 v0, 0x3e8

    const/4 v2, 0x0

    const/4 v3, 0x1

    cmp-long v4, p1, v0

    if-gez v4, :cond_0

    .line 324
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    new-array p2, v3, [Ljava/lang/Object;

    aput-object p1, p2, v2

    const p1, 0x7f120693

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    long-to-double p1, p1

    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double/2addr p1, v0

    .line 325
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    new-array p2, v3, [Ljava/lang/Object;

    aput-object p1, p2, v2

    const p1, 0x7f1206c1

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Ll/ۡᩴۚ;)V
    .locals 10

    .line 269
    iget-object v0, p0, Ll/ۡᩴۚ;->ᩴ᩷:Ll/ۤۤۚ;

    invoke-virtual {v0}, Ll/ۤۤۚ;->᩷()V

    const-wide/16 v0, -0x1

    .line 270
    iput-wide v0, p0, Ll/ۡᩴۚ;->ܽ᩷:J

    .line 271
    iget-object v2, p0, Ll/ۡᩴۚ;->֫᩷:Landroid/os/Handler;

    iget-object v3, p0, Ll/ۡᩴۚ;->᩻᩷:Ll/ۙۨܳ;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 272
    invoke-virtual {v3}, Ll/ۙۨܳ;->run()V

    .line 275
    iget-object v2, p0, Ll/ۡᩴۚ;->۫᩷:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۬᩷ۚ;

    .line 276
    iget-wide v5, v5, Ll/۬᩷ۚ;->᩸:J

    iget-wide v7, p0, Ll/ۡᩴۚ;->ۚ᩷:J

    cmp-long v9, v5, v7

    if-nez v9, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    if-nez v4, :cond_2

    .line 278
    iput-wide v0, p0, Ll/ۡᩴۚ;->ۚ᩷:J

    .line 279
    :cond_2
    iget-object p0, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    invoke-virtual {p0, v3}, Ll/ۚܿ᩻;->scrollToPosition(I)V

    return-void
.end method

.method private ᩷ۙ()V
    .locals 3

    .line 217
    invoke-static {}, Ll/ۛܳۚ;->֫()Z

    move-result v0

    .line 218
    iget-object v1, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    if-eqz v0, :cond_0

    const v2, 0x7f1206c2

    goto :goto_0

    :cond_0
    const v2, 0x7f12075f

    :goto_0
    invoke-virtual {v1, v2}, Ll/ܶ᩹;->setSubtitle(I)V

    .line 220
    iget-object v1, p0, Ll/ۡᩴۚ;->ۗ᩷:Landroid/view/MenuItem;

    if-eqz v1, :cond_3

    if-eqz v0, :cond_1

    const v2, 0x7f120ba1

    goto :goto_1

    :cond_1
    const v2, 0x7f120b91

    .line 221
    :goto_1
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    .line 222
    iget-object v1, p0, Ll/ۡᩴۚ;->ۗ᩷:Landroid/view/MenuItem;

    if-eqz v0, :cond_2

    const v0, 0x7f0801e2

    goto :goto_2

    :cond_2
    const v0, 0x7f0801e1

    :goto_2
    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 223
    iget-object v0, p0, Ll/ۡᩴۚ;->ۗ᩷:Landroid/view/MenuItem;

    iget-boolean v1, p0, Ll/ۡᩴۚ;->᩵᩷:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    :cond_3
    return-void
.end method

.method public static bridge synthetic ᩸(Ll/ۡᩴۚ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡᩴۚ;->۫᩷:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 147
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onCreate(Landroid/os/Bundle;)V

    .line 149
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    const v0, 0x7f0d004c

    .line 150
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    const v0, 0x7f1206d3

    .line 151
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    const v0, 0x7f0a068a

    .line 152
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܶ᩹;

    iput-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    .line 153
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->ۙ(Ll/ܶ᩹;)V

    .line 154
    invoke-virtual {p0}, Ll/ܽ֡֫;->ۖ()V

    .line 155
    invoke-virtual {p0}, Ll/ۚۤ;->getOnBackPressedDispatcher()Ll/ۜۤ;

    move-result-object v0

    new-instance v1, Ll/֡ᩴۚ;

    invoke-direct {v1, p0}, Ll/֡ᩴۚ;-><init>(Ll/ۡᩴۚ;)V

    invoke-virtual {v0, p0, v1}, Ll/ۜۤ;->ۙ(Ll/ۤ᩻ۙ;Ll/ۛۤ;)V

    .line 161
    iget-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    new-instance v1, Ll/ۛᩴۚ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/ۛᩴۚ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ܶ᩹;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    iget-object v0, p0, Ll/ۡᩴۚ;->ᩴ᩷:Ll/ۤۤۚ;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ll/ۤۤۚ;->ۤ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "log_instance"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "expanded"

    const-wide/16 v2, -0x1

    .line 163
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Ll/ۡᩴۚ;->ۚ᩷:J

    const-string v1, "anchor_id"

    .line 164
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۡᩴۚ;->ܽ᩷:J

    const-string v1, "anchor_offset"

    .line 165
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۡᩴۚ;->ܶ᩷:I

    :cond_0
    const p1, 0x7f0a04d5

    .line 167
    invoke-virtual {p0, p1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۚܿ᩻;

    iput-object p1, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    const p1, 0x7f0a019e

    .line 168
    invoke-virtual {p0, p1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const v1, 0x7f120622

    .line 169
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 170
    iget-object v1, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    invoke-virtual {v1, p1}, Ll/ۚܿ᩻;->ۤ(Landroid/view/View;)V

    .line 171
    iget-object p1, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ll/᩻ᩳ᩷;->setItemAnimator(Ll/ۗ۟᩷;)V

    .line 172
    iget-object p1, p0, Ll/ۡᩴۚ;->᩸᩷:Ll/ᩳᩴۚ;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ll/۫۟᩷;->setHasStableIds(Z)V

    .line 173
    iget-object v1, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    invoke-virtual {v1, p1}, Ll/ۚܿ᩻;->setAdapter(Ll/۫۟᩷;)V

    .line 174
    invoke-virtual {v0}, Ll/ۤۤۚ;->ۙ()Ll/ܽ᩻ۙ;

    move-result-object p1

    new-instance v0, Ll/᩺ᩴۚ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/᩺ᩴۚ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p0, v0}, Ll/ܺ᩻ۙ;->ۙ(Ll/ۤ᩻ۙ;Ll/ܶ᩻ۙ;)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 4

    const v0, 0x7f120b91

    const/4 v1, 0x0

    .line 229
    invoke-interface {p1, v1, v0, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    iput-object v0, p0, Ll/ۡᩴۚ;->ۗ᩷:Landroid/view/MenuItem;

    const/4 v2, 0x2

    .line 230
    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 231
    invoke-direct {p0}, Ll/ۡᩴۚ;->᩷ۙ()V

    const v0, 0x7f12060d

    const/4 v3, 0x1

    .line 232
    invoke-interface {p1, v1, v0, v3, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    iput-object p1, p0, Ll/ۡᩴۚ;->ܳ᩷:Landroid/view/MenuItem;

    const v0, 0x7f0801bd

    .line 233
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 234
    iget-object p1, p0, Ll/ۡᩴۚ;->ܳ᩷:Landroid/view/MenuItem;

    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 235
    iget-object p1, p0, Ll/ۡᩴۚ;->ܳ᩷:Landroid/view/MenuItem;

    iget-object v0, p0, Ll/ۡᩴۚ;->۫᩷:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v3

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return v3
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4

    .line 241
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f120b91

    const/4 v2, 0x1

    if-ne v0, v1, :cond_3

    .line 242
    iget-boolean p1, p0, Ll/ۡᩴۚ;->᩵᩷:Z

    if-eqz p1, :cond_0

    return v2

    .line 243
    :cond_0
    invoke-static {}, Ll/ۛܳۚ;->֫()Z

    move-result p1

    .line 244
    iput-boolean v2, p0, Ll/ۡᩴۚ;->᩵᩷:Z

    .line 245
    invoke-direct {p0}, Ll/ۡᩴۚ;->᩷ۙ()V

    if-eqz p1, :cond_1

    .line 124
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object p1

    .line 125
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/ۛܳۚ;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    return v2

    .line 248
    :cond_1
    invoke-static {}, Ll/ۛܳۚ;->ܺ()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 250
    iput-boolean v0, p0, Ll/ۡᩴۚ;->᩵᩷:Z

    .line 251
    invoke-direct {p0}, Ll/ۡᩴۚ;->᩷ۙ()V

    .line 252
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const p1, 0x7f12030b

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(Ljava/lang/CharSequence;)Ll/᩸۠ۧ;

    return v2

    .line 256
    :cond_3
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f12060d

    if-ne v0, v1, :cond_4

    .line 257
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    .line 258
    invoke-virtual {p1, v1}, Ll/ۖۖۧ;->᩷(I)V

    const v0, 0x7f12060e

    .line 259
    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->ۙ(I)V

    new-instance v0, Ll/ۘᩴۚ;

    const/4 v3, 0x0

    invoke-direct {v0, v3, p0}, Ll/ۘᩴۚ;-><init>(ILjava/lang/Object;)V

    .line 260
    invoke-virtual {p1, v1, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120161

    const/4 v1, 0x0

    .line 261
    invoke-virtual {p1, v0, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 262
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return v2

    .line 265
    :cond_4
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final onPause()V
    .locals 3

    const/4 v0, 0x0

    .line 299
    iput-boolean v0, p0, Ll/ۡᩴۚ;->᩹᩷:Z

    .line 300
    iget-object v1, p0, Ll/ۡᩴۚ;->᩻᩷:Ll/ۙۨܳ;

    iget-object v2, p0, Ll/ۡᩴۚ;->֫᩷:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 301
    iget-object v1, p0, Ll/ۡᩴۚ;->ۛ᩷:Ljava/lang/Runnable;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 302
    iput-boolean v0, p0, Ll/ۡᩴۚ;->ܺ᩷:Z

    .line 303
    invoke-super {p0}, Ll/ܽ֡֫;->onPause()V

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 183
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onRestoreInstanceState(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    .line 178
    iget-object v0, p0, Ll/ۡᩴۚ;->ᩴ᩷:Ll/ۤۤۚ;

    invoke-virtual {v0}, Ll/ۤۤۚ;->ۤ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "log_instance"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 185
    :cond_0
    iget-object p1, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۚܿ᩻;->scrollToPosition(I)V

    return-void
.end method

.method public final onResume()V
    .locals 2

    .line 291
    invoke-super {p0}, Ll/ܽ֡֫;->onResume()V

    const/4 v0, 0x1

    .line 292
    iput-boolean v0, p0, Ll/ۡᩴۚ;->᩹᩷:Z

    .line 293
    iget-object v0, p0, Ll/ۡᩴۚ;->᩻᩷:Ll/ۙۨܳ;

    invoke-virtual {v0}, Ll/ۙۨܳ;->run()V

    .line 294
    iget-object v0, p0, Ll/ۡᩴۚ;->֫᩷:Landroid/os/Handler;

    iget-object v1, p0, Ll/ۡᩴۚ;->ۛ᩷:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 7

    .line 308
    iget-object v0, p0, Ll/ۡᩴۚ;->ᩴ᩷:Ll/ۤۤۚ;

    invoke-virtual {v0}, Ll/ۤۤۚ;->ۤ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "log_instance"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "expanded"

    .line 309
    iget-wide v1, p0, Ll/ۡᩴۚ;->ۚ᩷:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 310
    iget-object v0, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    invoke-virtual {v0}, Ll/ۚܿ᩻;->getLayoutManager()Ll/֡֡᩷;

    move-result-object v0

    .line 311
    invoke-virtual {v0}, Ll/֡֡᩷;->findFirstVisibleItemPosition()I

    move-result v1

    .line 312
    invoke-virtual {v0, v1}, Ll/֡֡᩷;->findViewByPosition(I)Landroid/view/View;

    move-result-object v0

    const-string v2, "anchor_offset"

    const-string v3, "anchor_id"

    if-eqz v0, :cond_0

    if-ltz v1, :cond_0

    .line 313
    iget-object v4, p0, Ll/ۡᩴۚ;->۫᩷:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_0

    iget-object v4, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    const/4 v5, -0x1

    invoke-virtual {v4, v5}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 314
    iget-object v4, p0, Ll/ۡᩴۚ;->۫᩷:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩷ۚ;

    iget-wide v4, v1, Ll/۬᩷ۚ;->᩸:J

    invoke-virtual {p1, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 315
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget-object v1, p0, Ll/ۡᩴۚ;->ۧ᩷:Ll/ۚܿ᩻;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 316
    :cond_0
    iget-wide v0, p0, Ll/ۡᩴۚ;->ܽ᩷:J

    const-wide/16 v4, -0x1

    cmp-long v6, v0, v4

    if-eqz v6, :cond_1

    .line 317
    invoke-virtual {p1, v3, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 318
    iget v0, p0, Ll/ۡᩴۚ;->ܶ᩷:I

    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 320
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/ۚۤ;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public final onStart()V
    .locals 2

    .line 199
    invoke-super {p0}, Ll/ܽ֡֫;->onStart()V

    .line 200
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "bin.mt.mcp.ACTION_STARTED"

    .line 201
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "bin.mt.mcp.ACTION_STOPPED"

    .line 202
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "bin.mt.mcp.ACTION_FAILED_TO_START"

    .line 203
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 204
    iget-object v1, p0, Ll/ۡᩴۚ;->ۨ᩷:Landroid/content/BroadcastReceiver;

    invoke-static {v1, v0}, Ll/᩶᩷ۧ;->ۙ(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    const/4 v0, 0x0

    .line 206
    iput-boolean v0, p0, Ll/ۡᩴۚ;->᩵᩷:Z

    .line 207
    invoke-direct {p0}, Ll/ۡᩴۚ;->᩷ۙ()V

    return-void
.end method

.method public final onStop()V
    .locals 1

    .line 212
    iget-object v0, p0, Ll/ۡᩴۚ;->ۨ᩷:Landroid/content/BroadcastReceiver;

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Landroid/content/BroadcastReceiver;)V

    .line 213
    invoke-super {p0}, Ll/ܽ֡֫;->onStop()V

    return-void
.end method

.method public final ᩶()Ljava/lang/String;
    .locals 1

    const-string v0, "McpLogActivity"

    return-object v0
.end method

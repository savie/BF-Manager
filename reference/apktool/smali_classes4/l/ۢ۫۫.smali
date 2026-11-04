.class public final Ll/ۢ۫۫;
.super Ll/ۢۗܳ;
.source "Q28R"


# instance fields
.field public ۟:Ll/ۛ۫۫;

.field public ۢ:Ljava/util/ArrayList;

.field public ᩳ:Ll/ۤ᩻۫;


# direct methods
.method public static synthetic ۙ(Ll/ۢ۫۫;)V
    .locals 2

    .line 84
    iget-object p0, p0, Ll/ۢ۫۫;->ۢ:Ljava/util/ArrayList;

    invoke-static {p0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p0

    new-instance v0, Ll/᩺ۙۧ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll/᩺ۙۧ;-><init>(I)V

    invoke-interface {p0, v0}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p0

    invoke-static {}, Ll/֫ܺۗ;->toSet()Ll/ۚܺۗ;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    invoke-static {p0}, Ll/ܺ᩶ᩴ;->ۙ(Ljava/util/Set;)V

    .line 85
    invoke-static {}, Ll/ۛۤۧ;->᩷()V

    return-void
.end method


# virtual methods
.method public final ۤ(Ll/۫ۛܳ;)V
    .locals 11

    const-string v0, "local"

    .line 64
    invoke-virtual {p1, v0}, Ll/۫ۛܳ;->ۙ(Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Ll/ۢ۫۫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const v4, 0x7f120161

    const v5, 0x7f1208c9

    const/4 v6, 0x0

    const v7, 0x7f120787

    if-eqz v1, :cond_7

    .line 96
    new-instance v0, Ll/ۤ᩻۫;

    invoke-virtual {p1}, Ll/۫ۛܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۤ᩻۫;-><init>(Lbin/mt/plus/Main;)V

    iput-object v0, p0, Ll/ۢ۫۫;->ᩳ:Ll/ۤ᩻۫;

    .line 97
    invoke-virtual {p1}, Ll/۫ۛܳ;->᩹()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ll/۫ۛܳ;->᩸()Ll/ۜ᩵ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۜ᩵ܳ;->᩶()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ll/۫ۛܳ;->۫()Ljava/lang/String;

    move-result-object v1

    :goto_0
    new-array v8, v6, [Ljava/lang/String;

    invoke-static {v1, v8}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    .line 98
    iget-object v8, v0, Ll/ۤ᩻۫;->᩹:Landroid/widget/TextView;

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setText(I)V

    .line 99
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܺ()I

    move-result v7

    const/16 v8, 0x1f4

    if-gt v7, v8, :cond_2

    .line 100
    invoke-static {}, Ll/ᩴۛᩴ;->ܳ()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ۨ᩷()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 101
    new-instance v1, Ll/ۛ۫۫;

    invoke-direct {v1, v0}, Ll/ۛ۫۫;-><init>(Ll/ۤ᩻۫;)V

    iput-object v1, p0, Ll/ۢ۫۫;->۟:Ll/ۛ۫۫;

    .line 102
    invoke-static {p1}, Ll/ۢۗܳ;->ܳ(Ll/۫ۛܳ;)Ljava/lang/String;

    move-result-object v1

    if-ne v7, v2, :cond_1

    .line 103
    invoke-virtual {p1}, Ll/۫ۛܳ;->᩻()Ll/ۖۗܳ;

    move-result-object v7

    invoke-interface {v7}, Ll/ۖۗܳ;->۠()Ljava/lang/String;

    move-result-object v7

    new-array v8, v2, [Ljava/lang/Object;

    aput-object v7, v8, v6

    const v7, 0x7f1207ff

    invoke-static {v7, v8}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 104
    :cond_1
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-array v8, v2, [Ljava/lang/Object;

    aput-object v7, v8, v6

    const v7, 0x7f1207fe

    invoke-static {v7, v8}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 105
    :goto_1
    invoke-virtual {v0, v1, v7}, Ll/ۤ᩻۫;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 107
    :cond_2
    iget-object v1, v0, Ll/ۤ᩻۫;->ۧ:Landroid/widget/TextView;

    invoke-static {p1}, Ll/ۢۗܳ;->ܳ(Ll/۫ۛܳ;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    :goto_2
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    iget-object v7, v0, Ll/ۤ᩻۫;->ۗ:Landroid/view/View;

    .line 110
    invoke-virtual {v1, v7}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    new-instance v7, Ll/᩺۫۫;

    invoke-direct {v7, p0, p1}, Ll/᩺۫۫;-><init>(Ll/ۢ۫۫;Ll/۫ۛܳ;)V

    .line 111
    invoke-virtual {v1, v5, v7}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 112
    invoke-virtual {v1, v4, v3}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 113
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v1

    .line 114
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 115
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܽ()Ljava/util/List;

    move-result-object v4

    .line 116
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۖۗܳ;

    .line 117
    invoke-interface {v5}, Ll/ۖۗܳ;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 118
    iget v7, v0, Ll/ۤ᩻۫;->ᩴ:I

    add-int/2addr v7, v2

    iput v7, v0, Ll/ۤ᩻۫;->ᩴ:I

    .line 119
    invoke-interface {v5}, Ll/ۖۗܳ;->ᩳ()Z

    move-result v7

    if-nez v7, :cond_3

    .line 120
    invoke-interface {v5}, Ll/ۖۗܳ;->ۘ᩷()Ll/᩷ۨᩴ;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 123
    :cond_4
    iget v7, v0, Ll/ۤ᩻۫;->᩸:I

    add-int/2addr v7, v2

    iput v7, v0, Ll/ۤ᩻۫;->᩸:I

    .line 124
    invoke-interface {v5}, Ll/ۖۗܳ;->ᩳ()Z

    move-result v7

    if-nez v7, :cond_3

    .line 125
    iget-wide v7, v0, Ll/ۤ᩻۫;->ܳ:J

    invoke-interface {v5}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v9

    add-long/2addr v9, v7

    iput-wide v9, v0, Ll/ۤ᩻۫;->ܳ:J

    goto :goto_3

    .line 103
    :cond_5
    new-instance v2, Ll/ۚۛܳ;

    const/4 v4, 0x6

    invoke-direct {v2, v4, v0}, Ll/ۚۛܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v2}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    .line 130
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 131
    iget-object p1, v0, Ll/ۤ᩻۫;->۫:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    .line 133
    :cond_6
    sget-object v2, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Ll/ۘ۫۫;

    invoke-direct {v4, p1, v3, v1, v0}, Ll/ۘ۫۫;-><init>(Ll/۫ۛܳ;Ljava/util/LinkedList;Ll/۠ۖۧ;Ll/ۤ᩻۫;)V

    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_4

    .line 68
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v2, :cond_8

    .line 69
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻᩶ᩴ;

    .line 70
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    .line 71
    invoke-virtual {p1, v7}, Ll/ۖۖۧ;->᩷(I)V

    iget-object v1, v0, Ll/᩻᩶ᩴ;->ᩴ:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v6

    const v1, 0x7f120240

    .line 72
    invoke-static {v1, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/᩵۫۫;

    invoke-direct {v1, v0}, Ll/᩵۫۫;-><init>(Ll/᩻᩶ᩴ;)V

    .line 73
    invoke-virtual {p1, v5, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 77
    invoke-virtual {p1, v4, v3}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 78
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v1

    goto :goto_4

    .line 80
    :cond_8
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    .line 81
    invoke-virtual {p1, v7}, Ll/ۖۖۧ;->᩷(I)V

    .line 82
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    aput-object v0, v1, v6

    const v0, 0x7f120241

    invoke-static {v0, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/ۨ۫۫;

    invoke-direct {v0, p0}, Ll/ۨ۫۫;-><init>(Ll/ۢ۫۫;)V

    .line 83
    invoke-virtual {p1, v5, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 87
    invoke-virtual {p1, v4, v3}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 88
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v1

    .line 90
    :goto_4
    invoke-virtual {v1}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object p1

    .line 91
    invoke-virtual {p1, v6}, Landroid/view/View;->setClickable(Z)V

    .line 92
    new-instance v0, Ll/᩻֫᩸;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p1}, Ll/᩻֫᩸;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, 0x12c

    invoke-static {v1, v2, v0}, Ll/᩶᩷ۧ;->ۙ(JLjava/lang/Runnable;)V

    return-void
.end method

.method public final ᩴ(Ll/۫ۛܳ;)V
    .locals 2

    .line 187
    sget v0, Ll/۬ۜۧ;->ۙ:I

    .line 268
    new-instance v0, Ll/۠ۜۧ;

    const-class v1, Ll/ᩳ۫۫;

    invoke-direct {v0, v1}, Ll/۠ۜۧ;-><init>(Ljava/lang/Class;)V

    .line 188
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܽ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۠ۜۧ;->ۙ(Ljava/util/List;)V

    .line 189
    invoke-virtual {v0, p1}, Ll/۠ۜۧ;->ۤ(Ll/۫ۛܳ;)V

    const-string v1, "deleteFrom"

    .line 190
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܶ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Ll/ۢ۫۫;->۟:Ll/ۛ۫۫;

    if-eqz p1, :cond_0

    .line 191
    iget-object p1, p1, Ll/ۛ۫۫;->ܰ:Ll/ۤ᩻۫;

    invoke-virtual {p1}, Ll/ۤ᩻۫;->᩷()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v1, "recycle"

    invoke-virtual {v0, v1, p1}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Z)V

    iget-object p1, p0, Ll/ۢ۫۫;->ᩳ:Ll/ۤ᩻۫;

    .line 192
    invoke-virtual {p1}, Ll/ۤ᩻۫;->ۤ()Z

    move-result p1

    const-string v1, "speedMode"

    invoke-virtual {v0, v1, p1}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Z)V

    iget-object p1, p0, Ll/ۢ۫۫;->ᩳ:Ll/ۤ᩻۫;

    iget v1, p1, Ll/ۤ᩻۫;->᩸:I

    iget p1, p1, Ll/ۤ᩻۫;->ᩴ:I

    add-int/2addr v1, p1

    const-string p1, "minTotal"

    .line 193
    invoke-virtual {v0, v1, p1}, Ll/۠ۜۧ;->ۙ(ILjava/lang/String;)V

    .line 194
    invoke-virtual {v0}, Ll/۠ۜۧ;->ۙ()I

    return-void
.end method

.method public final ᩸(Ll/۫ۛܳ;)Z
    .locals 5

    .line 170
    iget-object v0, p0, Ll/ۢ۫۫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 171
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܽ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۗܳ;

    .line 172
    instance-of v4, v3, Ll/ۚ᩻۫;

    if-eqz v4, :cond_0

    check-cast v3, Ll/ۚ᩻۫;

    invoke-virtual {v3}, Ll/ۚ᩻۫;->ᩴ()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 173
    invoke-virtual {v3}, Ll/ۚ᩻۫;->᩷()Ll/᩻᩶ᩴ;

    move-result-object v3

    .line 174
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 179
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_3

    if-nez v2, :cond_2

    return v0

    :cond_2
    return v1

    :cond_3
    const/4 p1, 0x0

    xor-int/2addr p1, v0

    return p1
.end method

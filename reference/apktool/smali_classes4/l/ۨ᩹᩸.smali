.class public final Ll/ۨ᩹᩸;
.super Ljava/lang/Object;
.source "P6SA"

# interfaces
.implements Ll/ۖ᩹᩸;


# instance fields
.field public ֫:J

.field public final ۗ:Landroid/graphics/Point;

.field public final ۘ:Ll/᩺ۜ᩸;

.field public ۙ:Ll/᩹ܽ᩵;

.field public ۚ:Ljava/lang/String;

.field public ۛ:Z

.field public ۤ:Z

.field public final ۧ:Ll/۟ܰ᩸;

.field public ۨ:Ll/ܶۜ᩸;

.field public final ۫:Z

.field public ܰ:Z

.field public ܳ:Landroid/view/View$OnAttachStateChangeListener;

.field public ܶ:Ll/᩵᩹᩸;

.field public final ܺ:Landroid/os/Handler;

.field public final ܽ:Ll/ܶ᩵᩸;

.field public ᩴ:Ljava/lang/String;

.field public final ᩵:Landroid/graphics/Point;

.field public final ᩷:Landroid/os/Bundle;

.field public ᩸:Ljava/lang/Throwable;

.field public final ᩹:Ll/᩸᩶᩸;

.field public final ᩺:I

.field public final ᩻:Ll/᩹۬᩸;


# direct methods
.method public constructor <init>(Ll/۟ܰ᩸;Ll/ܶ᩵᩸;ILl/᩸᩶᩸;Z)V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ۨ᩹᩸;->ܺ:Landroid/os/Handler;

    const-string v0, "created"

    .line 39
    iput-object v0, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    .line 63
    iput-object p1, p0, Ll/ۨ᩹᩸;->ۧ:Ll/۟ܰ᩸;

    iput-object p2, p0, Ll/ۨ᩹᩸;->ܽ:Ll/ܶ᩵᩸;

    iput p3, p0, Ll/ۨ᩹᩸;->᩺:I

    .line 64
    iput-boolean p5, p0, Ll/ۨ᩹᩸;->۫:Z

    .line 65
    iget-object p2, p1, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    iput-object p2, p0, Ll/ۨ᩹᩸;->ۘ:Ll/᩺ۜ᩸;

    iget-object p3, p1, Ll/۟ܰ᩸;->ۜ:Ll/᩹۬᩸;

    iput-object p3, p0, Ll/ۨ᩹᩸;->᩻:Ll/᩹۬᩸;

    .line 66
    invoke-virtual {p2}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result p3

    invoke-virtual {p2, p3}, Ll/᩺ۜ᩸;->ۤ(I)Landroid/graphics/Point;

    move-result-object p3

    iput-object p3, p0, Ll/ۨ᩹᩸;->᩵:Landroid/graphics/Point;

    .line 67
    new-instance p3, Landroid/graphics/Point;

    invoke-virtual {p2}, Landroid/view/View;->getScrollX()I

    move-result p5

    invoke-virtual {p2}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result p2

    invoke-direct {p3, p5, p2}, Landroid/graphics/Point;-><init>(II)V

    iput-object p3, p0, Ll/ۨ᩹᩸;->ۗ:Landroid/graphics/Point;

    .line 68
    new-instance p2, Landroid/os/Bundle;

    iget-object p1, p1, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-direct {p2, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object p2, p0, Ll/ۨ᩹᩸;->᩷:Landroid/os/Bundle;

    if-nez p4, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {p4}, Ll/᩸᩶᩸;->ۙ()Ll/᩸᩶᩸;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/ۨ᩹᩸;->᩹:Ll/᩸᩶᩸;

    return-void
.end method

.method private ֫()V
    .locals 7

    .line 133
    iget-object v0, p0, Ll/ۨ᩹᩸;->ܽ:Ll/ܶ᩵᩸;

    iget-boolean v1, p0, Ll/ۨ᩹᩸;->۫:Z

    iget-object v2, p0, Ll/ۨ᩹᩸;->ۘ:Ll/᩺ۜ᩸;

    if-eqz v1, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "waiting_view_detach"

    .line 134
    iput-object v0, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    .line 135
    iget-object v0, p0, Ll/ۨ᩹᩸;->ܳ:Landroid/view/View$OnAttachStateChangeListener;

    if-nez v0, :cond_0

    .line 136
    new-instance v0, Ll/ۗ᩹᩸;

    invoke-direct {v0, p0}, Ll/ۗ᩹᩸;-><init>(Ll/ۨ᩹᩸;)V

    iput-object v0, p0, Ll/ۨ᩹᩸;->ܳ:Landroid/view/View$OnAttachStateChangeListener;

    .line 145
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_0
    return-void

    :cond_1
    :try_start_0
    const-string v1, "waiting_release_ready"

    .line 150
    iput-object v1, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    .line 152
    iget-object v1, v0, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v1}, Ll/ۗۤᩴ;->ܳ᩷()Ll/ܽۢ᩸;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢ᩸;->۠()J

    move-result-wide v3

    iget-wide v5, p0, Ll/ۨ᩹᩸;->֫:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    invoke-direct {p0}, Ll/ۨ᩹᩸;->ۚ()V

    return-void

    .line 153
    :cond_2
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ܳۤ()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v0, p0, Ll/ۨ᩹᩸;->ܺ:Landroid/os/Handler;

    new-instance v1, Ll/᩹᩹᩸;

    invoke-direct {v1, p0}, Ll/᩹᩹᩸;-><init>(Ll/ۨ᩹᩸;)V

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_3
    const-string v1, "detaching_text"

    .line 154
    iput-object v1, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    .line 155
    iget-object v1, v0, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v2, v1}, Ll/᩺ۜ᩸;->ۙ(Ll/ᩳ۬᩸;)V

    const/4 v1, 0x1

    .line 156
    iput-boolean v1, p0, Ll/ۨ᩹᩸;->ۤ:Z

    .line 157
    iget-boolean v1, p0, Ll/ۨ᩹᩸;->ܰ:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/ۨ᩹᩸;->᩻:Ll/᩹۬᩸;

    invoke-virtual {v1}, Ll/᩹۬᩸;->ᩴ()V

    :cond_4
    const-string v1, "waiting_owner_close"

    .line 163
    iput-object v1, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    .line 164
    iget-wide v1, p0, Ll/ۨ᩹᩸;->֫:J

    invoke-virtual {v0, v1, v2}, Ll/ܶ᩵᩸;->ۙ(J)Ll/᩹ܽ᩵;

    move-result-object v0

    new-instance v1, Ll/ܺ᩹᩸;

    invoke-direct {v1, p0}, Ll/ܺ᩹᩸;-><init>(Ll/ۨ᩹᩸;)V

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 159
    invoke-direct {p0, v0}, Ll/ۨ᩹᩸;->ۙ(Ljava/lang/Throwable;)V

    return-void
.end method

.method private ۙ(Ljava/lang/Throwable;)V
    .locals 1

    .line 175
    instance-of v0, p1, Ll/ۗܽ᩵;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 176
    :cond_0
    iget-object v0, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    iput-object v0, p0, Ll/ۨ᩹᩸;->ۚ:Ljava/lang/String;

    const-string v0, "failed"

    .line 177
    iput-object v0, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    .line 178
    iput-object p1, p0, Ll/ۨ᩹᩸;->᩸:Ljava/lang/Throwable;

    .line 179
    iget-object v0, p0, Ll/ۨ᩹᩸;->ۙ:Ll/᩹ܽ᩵;

    invoke-virtual {v0, p1}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Throwable;)V

    .line 180
    iget-object v0, p0, Ll/ۨ᩹᩸;->ۧ:Ll/۟ܰ᩸;

    invoke-virtual {v0, p0, p1}, Ll/۟ܰ᩸;->ۙ(Ll/ۨ᩹᩸;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ۨ᩹᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۨ᩹᩸;->֫()V

    return-void
.end method

.method public static synthetic ۙ(Ll/ۨ᩹᩸;Ljava/lang/Long;Ljava/lang/Throwable;)V
    .locals 2

    .line 118
    iget-object v0, p0, Ll/ۨ᩹᩸;->ܺ:Landroid/os/Handler;

    new-instance v1, Ll/ܽ᩹᩸;

    invoke-direct {v1, p0, p1, p2}, Ll/ܽ᩹᩸;-><init>(Ll/ۨ᩹᩸;Ljava/lang/Long;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ۙ(Ll/ۨ᩹᩸;Ljava/lang/Throwable;)V
    .locals 1

    .line 165
    iget-object v0, p0, Ll/ۨ᩹᩸;->ۘ:Ll/᩺ۜ᩸;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Ll/ۨ᩹᩸;->ۙ(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 166
    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ۧ(Z)V

    .line 167
    iget-object p1, p0, Ll/ۨ᩹᩸;->ۨ:Ll/ܶۜ᩸;

    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ۙ(Ll/ܶۜ᩸;)V

    .line 168
    iget-object p1, p0, Ll/ۨ᩹᩸;->ۧ:Ll/۟ܰ᩸;

    invoke-virtual {p1, p0}, Ll/۟ܰ᩸;->ۙ(Ll/ۨ᩹᩸;)V

    const-string p1, "finished"

    .line 169
    iput-object p1, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    .line 170
    iget-object p0, p0, Ll/ۨ᩹᩸;->ۙ:Ll/᩹ܽ᩵;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Object;)V

    return-void
.end method

.method private ۚ()V
    .locals 15

    .line 101
    iget-object v0, p0, Ll/ۨ᩹᩸;->᩻:Ll/᩹۬᩸;

    :try_start_0
    iget-boolean v1, p0, Ll/ۨ᩹᩸;->ۤ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Ll/ۨ᩹᩸;->ܽ:Ll/ܶ᩵᩸;

    if-eqz v1, :cond_0

    :try_start_1
    const-string v0, "waiting_owner_close"

    .line 163
    iput-object v0, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    .line 164
    iget-wide v0, p0, Ll/ۨ᩹᩸;->֫:J

    invoke-virtual {v2, v0, v1}, Ll/ܶ᩵᩸;->ۙ(J)Ll/᩹ܽ᩵;

    move-result-object v0

    new-instance v1, Ll/ܺ᩹᩸;

    invoke-direct {v1, p0}, Ll/ܺ᩹᩸;-><init>(Ll/ۨ᩹᩸;)V

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    return-void

    .line 102
    :cond_0
    iget-boolean v1, p0, Ll/ۨ᩹᩸;->ۛ:Z

    if-nez v1, :cond_2

    const-string v1, "waiting_capture_ready"

    .line 103
    iput-object v1, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    .line 104
    iget-object v1, p0, Ll/ۨ᩹᩸;->ۘ:Ll/᩺ۜ᩸;

    iget-object v3, v2, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    iget-object v4, p0, Ll/ۨ᩹᩸;->ۨ:Ll/ܶۜ᩸;

    invoke-virtual {v1, v3, v4}, Ll/᩺ۜ᩸;->ۙ(Ll/ۗۤᩴ;Ll/ܶۜ᩸;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Ll/ۨ᩹᩸;->ܺ:Landroid/os/Handler;

    new-instance v1, Ll/۫᩵᩸;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Ll/۫᩵᩸;-><init>(Ll/ۖ᩹᩸;I)V

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    const/4 v1, 0x1

    .line 105
    iput-boolean v1, p0, Ll/ۨ᩹᩸;->ۛ:Z

    :cond_2
    const-string v1, "capturing_checkpoint"

    .line 107
    iput-object v1, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    .line 108
    new-instance v1, Ll/ۛۚۤ;

    invoke-direct {v1}, Ll/ۛۚۤ;-><init>()V

    new-instance v3, Ll/ۛۚۤ;

    invoke-direct {v3}, Ll/ۛۚۤ;-><init>()V

    .line 109
    invoke-virtual {v0, v1}, Ll/᩹۬᩸;->᩷(Ll/ۛۚۤ;)V

    invoke-virtual {v0, v3}, Ll/᩹۬᩸;->ۙ(Ll/ۛۚۤ;)V

    .line 110
    iget-object v0, p0, Ll/ۨ᩹᩸;->᩷:Landroid/os/Bundle;

    const-string v4, "changed"

    iget-object v5, p0, Ll/ۨ᩹᩸;->ۧ:Ll/۟ܰ᩸;

    iget-object v6, v2, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v6}, Ll/ۗۤᩴ;->isChanged()Z

    move-result v6

    invoke-virtual {v5, v6}, Ll/۟ܰ᩸;->᩸(Z)Z

    move-result v5

    invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 111
    invoke-virtual {v1}, Ll/ۛۚۤ;->۫()[B

    move-result-object v0

    invoke-virtual {v3}, Ll/ۛۚۤ;->۫()[B

    move-result-object v1

    .line 112
    iget-object v6, p0, Ll/ۨ᩹᩸;->ۘ:Ll/᩺ۜ᩸;

    iget-object v7, p0, Ll/ۨ᩹᩸;->᩷:Landroid/os/Bundle;

    iget-object v8, p0, Ll/ۨ᩹᩸;->᩹:Ll/᩸᩶᩸;

    iget v11, p0, Ll/ۨ᩹᩸;->᩺:I

    const-wide/16 v12, -0x1

    const/4 v14, 0x0

    move-object v9, v0

    move-object v10, v1

    .line 62
    invoke-static/range {v6 .. v14}, Ll/ۙۗ᩸;->ۙ(Ll/᩺ۜ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;[B[BIJ[B)Ll/ۙۗ᩸;

    move-result-object v3

    .line 114
    new-instance v4, Ll/᩵᩹᩸;

    invoke-virtual {v3}, Ll/ۙۗ᩸;->᩹()Ll/ۨۤᩴ;

    move-result-object v5

    invoke-direct {v4, v5, v0, v1}, Ll/᩵᩹᩸;-><init>(Ll/ۨۤᩴ;[B[B)V

    iput-object v4, p0, Ll/ۨ᩹᩸;->ܶ:Ll/᩵᩹᩸;

    const-string v0, "persisting_checkpoint"

    .line 116
    iput-object v0, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    .line 117
    iget-object v0, v2, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    invoke-virtual {v0, v3}, Ll/ۚ᩹᩸;->ۙ(Ll/ۙۗ᩸;)Ll/᩹ܽ᩵;

    move-result-object v0

    iget-object v1, v2, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v1}, Ll/ۗۤᩴ;->ܳ᩷()Ll/ܽۢ᩸;

    move-result-object v1

    invoke-static {v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/᩻᩹᩸;

    invoke-direct {v2, v1}, Ll/᩻᩹᩸;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/᩹ܽ᩵;->ۤ(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v0

    new-instance v1, Ll/ۚ᩵᩸;

    invoke-direct {v1, p0}, Ll/ۚ᩵᩸;-><init>(Ll/ۖ᩹᩸;)V

    .line 118
    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 128
    invoke-direct {p0, v0}, Ll/ۨ᩹᩸;->ۙ(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic ۤ(Ll/ۨ᩹᩸;)Ll/᩹ܽ᩵;
    .locals 1

    .line 80
    iget-boolean v0, p0, Ll/ۨ᩹᩸;->ܰ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۨ᩹᩸;->۫()Ll/᩹ܽ᩵;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ll/ۨ᩹᩸;->ۤ()Ll/᩹ܽ᩵;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۤ(Ll/ۨ᩹᩸;Ljava/lang/Throwable;)V
    .locals 0

    if-nez p1, :cond_0

    .line 83
    invoke-direct {p0}, Ll/ۨ᩹᩸;->ۚ()V

    return-void

    :cond_0
    invoke-direct {p0, p1}, Ll/ۨ᩹᩸;->ۙ(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۨ᩹᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۨ᩹᩸;->֫()V

    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/ۨ᩹᩸;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ۨ᩹᩸;->ܳ:Landroid/view/View$OnAttachStateChangeListener;

    return-void
.end method

.method public static synthetic ᩷(Ll/ۨ᩹᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۨ᩹᩸;->ۚ()V

    return-void
.end method

.method public static synthetic ᩷(Ll/ۨ᩹᩸;Ljava/lang/Long;Ljava/lang/Throwable;)V
    .locals 4

    if-eqz p2, :cond_0

    .line 119
    invoke-direct {p0, p2}, Ll/ۨ᩹᩸;->ۙ(Ljava/lang/Throwable;)V

    return-void

    .line 121
    :cond_0
    iget-object p2, p0, Ll/ۨ᩹᩸;->ܽ:Ll/ܶ᩵᩸;

    iget-object p2, p2, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {p2}, Ll/ۗۤᩴ;->ܳ᩷()Ll/ܽۢ᩸;

    move-result-object p2

    invoke-virtual {p2}, Ll/ܽۢ᩸;->۠()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p2, v0, v2

    if-eqz p2, :cond_1

    const-string p1, "recapturing_changed_revision"

    .line 122
    iput-object p1, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    .line 123
    iget-object p1, p0, Ll/ۨ᩹᩸;->ܺ:Landroid/os/Handler;

    new-instance p2, Ll/۫᩵᩸;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Ll/۫᩵᩸;-><init>(Ll/ۖ᩹᩸;I)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 125
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۨ᩹᩸;->֫:J

    .line 126
    invoke-direct {p0}, Ll/ۨ᩹᩸;->֫()V

    return-void
.end method

.method public static synthetic ᩷(Ll/ۨ᩹᩸;Ljava/lang/Throwable;)V
    .locals 2

    .line 164
    iget-object v0, p0, Ll/ۨ᩹᩸;->ܺ:Landroid/os/Handler;

    new-instance v1, Ll/ܶ᩹᩸;

    invoke-direct {v1, p0, p1}, Ll/ܶ᩹᩸;-><init>(Ll/ۨ᩹᩸;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static bridge synthetic ᩸(Ll/ۨ᩹᩸;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨ᩹᩸;->ܺ:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic ᩸(Ll/ۨ᩹᩸;Ljava/lang/Throwable;)V
    .locals 2

    .line 82
    iget-object v0, p0, Ll/ۨ᩹᩸;->ܺ:Landroid/os/Handler;

    new-instance v1, Ll/ۧ᩹᩸;

    invoke-direct {v1, p0, p1}, Ll/ۧ᩹᩸;-><init>(Ll/ۨ᩹᩸;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 4

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "stage="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nowner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۨ᩹᩸;->ܽ:Ll/ܶ᩵᩸;

    invoke-static {v1}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\nownerReleaseStage="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    invoke-virtual {v1}, Ll/ܶ᩵᩸;->ۤ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nfragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    iget-object v1, p0, Ll/ۨ᩹᩸;->ۧ:Ll/۟ܰ᩸;

    invoke-static {v1}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\nactivity="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    invoke-virtual {v1}, Ll/ۧ۫ۙ;->getActivity()Ll/ۗ۫ۙ;

    move-result-object v1

    invoke-static {v1}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nattempt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۨ᩹᩸;->ۙ:Ll/᩹ܽ᩵;

    .line 48
    invoke-static {v1}, Ll/۠᩹᩸;->ۙ(Ll/᩹ܽ᩵;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nexitingView="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ۨ᩹᩸;->۫:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\nviewDestroyed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ۨ᩹᩸;->ܰ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\nreserved="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ۨ᩹᩸;->ۛ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\ndetached="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ۨ᩹᩸;->ۤ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\nexitListener="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۨ᩹᩸;->ܳ:Landroid/view/View$OnAttachStateChangeListener;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\nfinalRevision="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۨ᩹᩸;->֫:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "\nfailedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۨ᩹᩸;->ۚ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nfailure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۨ᩹᩸;->᩸:Ljava/lang/Throwable;

    .line 52
    invoke-static {v1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    iget-object v2, p0, Ll/ۨ᩹᩸;->ۘ:Ll/᩺ۜ᩸;

    invoke-static {v2}, Ll/۠᩹᩸;->ۙ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۤ()Ll/᩹ܽ᩵;
    .locals 3

    .line 91
    iget-object v0, p0, Ll/ۨ᩹᩸;->ۙ:Ll/᩹ܽ᩵;

    new-instance v1, Ll/ۖܶ᩸;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۖܶ᩸;-><init>(I)V

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->᩷(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ۫()Ll/᩹ܽ᩵;
    .locals 3

    .line 74
    iget-object v0, p0, Ll/ۨ᩹᩸;->ۙ:Ll/᩹ܽ᩵;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->᩸()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ۨ᩹᩸;->ۤ()Ll/᩹ܽ᩵;

    move-result-object v0

    return-object v0

    .line 75
    :cond_0
    new-instance v0, Ll/᩹ܽ᩵;

    invoke-direct {v0}, Ll/᩹ܽ᩵;-><init>()V

    iput-object v0, p0, Ll/ۨ᩹᩸;->ۙ:Ll/᩹ܽ᩵;

    const/4 v0, 0x0

    .line 76
    iput-object v0, p0, Ll/ۨ᩹᩸;->᩸:Ljava/lang/Throwable;

    .line 77
    iput-object v0, p0, Ll/ۨ᩹᩸;->ۚ:Ljava/lang/String;

    const-string v0, "stopping_input"

    .line 78
    iput-object v0, p0, Ll/ۨ᩹᩸;->ᩴ:Ljava/lang/String;

    const-string v0, "session_close"

    .line 79
    iget-object v1, p0, Ll/ۨ᩹᩸;->ܽ:Ll/ܶ᩵᩸;

    invoke-virtual {v1, v0, p0}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;Ll/ۖ᩹᩸;)V

    .line 80
    new-instance v0, Ll/֫᩹᩸;

    invoke-direct {v0, p0}, Ll/֫᩹᩸;-><init>(Ll/ۨ᩹᩸;)V

    invoke-virtual {v1, v0}, Ll/ܶ᩵᩸;->ۙ(Ll/֫᩹᩸;)V

    .line 81
    iget-object v0, p0, Ll/ۨ᩹᩸;->ۨ:Ll/ܶۜ᩸;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۨ᩹᩸;->ۘ:Ll/᩺ۜ᩸;

    iget-object v2, v1, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v0, v2}, Ll/᩺ۜ᩸;->ۙ(Ll/ۗۤᩴ;)Ll/ܶۜ᩸;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩹᩸;->ۨ:Ll/ܶۜ᩸;

    .line 82
    :cond_1
    invoke-virtual {v1}, Ll/ܶ᩵᩸;->᩸()Ll/᩹ܽ᩵;

    move-result-object v0

    new-instance v1, Ll/ᩴ᩵᩸;

    invoke-direct {v1, p0}, Ll/ᩴ᩵᩸;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    .line 85
    invoke-virtual {p0}, Ll/ۨ᩹᩸;->ۤ()Ll/᩹ܽ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Landroid/graphics/Point;
    .locals 2

    .line 88
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Ll/ۨ᩹᩸;->᩵:Landroid/graphics/Point;

    invoke-direct {v0, v1}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    return-object v0
.end method

.method public final ᩴ()Landroid/graphics/Point;
    .locals 2

    .line 89
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Ll/ۨ᩹᩸;->ۗ:Landroid/graphics/Point;

    invoke-direct {v0, v1}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    return-object v0
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x1

    .line 94
    iput-boolean v0, p0, Ll/ۨ᩹᩸;->ܰ:Z

    .line 96
    iget-boolean v0, p0, Ll/ۨ᩹᩸;->ۤ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۨ᩹᩸;->᩻:Ll/᩹۬᩸;

    invoke-virtual {v0}, Ll/᩹۬᩸;->ᩴ()V

    :cond_0
    return-void
.end method

.method public final ᩸()Ll/᩵᩹᩸;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ۨ᩹᩸;->ܶ:Ll/᩵᩹᩸;

    return-object v0
.end method

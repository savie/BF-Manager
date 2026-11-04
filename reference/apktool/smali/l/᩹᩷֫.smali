.class public final Ll/᩹᩷֫;
.super Ljava/lang/Object;
.source "K5ZN"


# static fields
.field public static final ܶ:Ljava/lang/Object;


# instance fields
.field public final ֫:Ll/֡᩷֫;

.field public ۙ:I

.field public final ۚ:J

.field public ۤ:Ll/ܶ᩷֫;

.field public ۧ:Ll/ܰ᩹ۙ;

.field public ۫:Z

.field public ܳ:Z

.field public ܺ:Z

.field public final ܽ:Ll/۟ۘܳ;

.field public final ᩴ:Ll/ۧۙ֫;

.field public ᩷:Z

.field public final ᩸:Z

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 580
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩹᩷֫;->ܶ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/۟ۘܳ;Ljava/util/List;IZ)V
    .locals 7

    .line 604
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 589
    invoke-static {}, Ll/ۗ᩷֫;->᩷()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩹᩷֫;->ۚ:J

    const/4 v0, -0x1

    .line 595
    iput v0, p0, Ll/᩹᩷֫;->᩻:I

    .line 605
    iput-object p1, p0, Ll/᩹᩷֫;->ܽ:Ll/۟ۘܳ;

    .line 606
    iput-boolean p4, p0, Ll/᩹᩷֫;->᩸:Z

    .line 607
    new-instance v4, Ll/ۧۙ֫;

    invoke-direct {v4, p0, p2, p3}, Ll/ۧۙ֫;-><init>(Ll/᩹᩷֫;Ljava/util/List;I)V

    iput-object v4, p0, Ll/᩹᩷֫;->ᩴ:Ll/ۧۙ֫;

    .line 608
    new-instance p2, Ll/ܽ᩷֫;

    invoke-direct {p2, p0}, Ll/ܽ᩷֫;-><init>(Ll/᩹᩷֫;)V

    .line 12
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x17

    if-lt p3, p4, :cond_0

    .line 13
    new-instance p3, Ll/ۙ֨ۚ;

    invoke-direct {p3, p1, v4, p2}, Ll/ۙ֨ۚ;-><init>(Ll/۟ۘܳ;Ll/֨֨ۚ;Ll/᩶᩷֫;)V

    goto :goto_0

    .line 15
    :cond_0
    new-instance p3, Ll/֫֨ۚ;

    .line 50
    new-instance p4, Ll/ۢ֨ۚ;

    .line 83
    sget-object v5, Ll/ᩳ֨ۚ;->ܿ:Ll/ᩳ֨ۚ;

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v1, p4

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Ll/ۢ֨ۚ;-><init>(Ll/ۜ۫֫;Ll/۟ۘܳ;Ll/֨֨ۚ;Ll/ᩳ֨ۚ;Ll/ܶᩴ֫;)V

    .line 51
    new-instance v0, Ll/᩸֨ۚ;

    invoke-direct {v0, p2}, Ll/᩸֨ۚ;-><init>(Ll/᩶᩷֫;)V

    invoke-virtual {p4, v0}, Ll/ۢ֨ۚ;->ۙ(Ll/ܳ֡᩹;)V

    .line 46
    invoke-direct {p3, p1, p4, p2}, Ll/֫֨ۚ;-><init>(Ll/۟ۘܳ;Ll/ۢ֨ۚ;Ll/᩶᩷֫;)V

    .line 608
    :goto_0
    iput-object p3, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    return-void
.end method

.method private ֫()Z
    .locals 2

    .line 782
    iget-object v0, p0, Ll/᩹᩷֫;->ۤ:Ll/ܶ᩷֫;

    if-eqz v0, :cond_0

    .line 783
    invoke-virtual {v0}, Ll/ܶ᩷֫;->ۙ()Ll/ܰ᩹ۙ;

    move-result-object v0

    iget-object v1, p0, Ll/᩹᩷֫;->ᩴ:Ll/ۧۙ֫;

    invoke-virtual {v1}, Ll/֨֨ۚ;->ܳ()Ll/ܰ᩹ۙ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ۙ(J)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩹᩷֫;->᩷(J)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ᩳ۬ۚ;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/᩹᩷֫;->᩷(Ll/ᩳ۬ۚ;)V

    return-void
.end method

.method public static ۙ(Ll/᩹᩷֫;ILl/ܰ᩹ۙ;Ll/۟۬ۚ;)V
    .locals 4

    .line 816
    iget v0, p0, Ll/᩹᩷֫;->ۙ:I

    if-ne p1, v0, :cond_4

    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object p1

    if-ne p1, p0, :cond_4

    .line 982
    iget-object p1, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {p1}, Ll/֡᩷֫;->۫()Z

    move-result p1

    if-nez p1, :cond_4

    .line 816
    iget-object p1, p0, Ll/᩹᩷֫;->ᩴ:Ll/ۧۙ֫;

    .line 817
    invoke-virtual {p1}, Ll/֨֨ۚ;->ܳ()Ll/ܰ᩹ۙ;

    move-result-object p1

    if-eq p1, p2, :cond_0

    goto :goto_1

    .line 820
    :cond_0
    invoke-virtual {p3}, Ll/۟۬ۚ;->᩷()Ll/ᩳ۬ۚ;

    move-result-object p1

    invoke-static {p1}, Ll/᩹᩷֫;->᩷(Ll/ᩳ۬ۚ;)V

    .line 821
    invoke-virtual {p3}, Ll/۟۬ۚ;->ۙ()J

    move-result-wide p1

    invoke-static {p1, p2}, Ll/᩹᩷֫;->᩷(J)V

    .line 823
    invoke-virtual {p3}, Ll/۟۬ۚ;->ۙ()J

    move-result-wide p1

    .line 833
    iget p3, p0, Ll/᩹᩷֫;->᩻:I

    const/4 v0, 0x0

    if-gtz p3, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-lez v3, :cond_3

    int-to-long v1, p3

    cmp-long v3, v1, p1

    if-ltz v3, :cond_3

    .line 838
    iput v0, p0, Ll/᩹᩷֫;->᩻:I

    .line 906
    iget-boolean p1, p0, Ll/᩹᩷֫;->᩸:Z

    if-eqz p1, :cond_2

    .line 907
    iget-object p0, p0, Ll/᩹᩷֫;->ܽ:Ll/۟ۘܳ;

    invoke-static {p0}, Ll/ᩳ᩷֫;->ۙ(Ll/۟ۘܳ;)V

    :cond_2
    :goto_0
    const/4 p3, 0x0

    .line 824
    :cond_3
    invoke-static {p3}, Ll/᩹᩷֫;->ܳ(I)V

    :cond_4
    :goto_1
    return-void
.end method

.method public static ۙ(Ll/᩹᩷֫;Ll/ܶ᩷֫;Ll/ܰ᩹ۙ;)V
    .locals 2

    .line 769
    iget-object v0, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    iget-object v1, p0, Ll/᩹᩷֫;->ۤ:Ll/ܶ᩷֫;

    if-ne v1, p1, :cond_2

    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object p1

    if-ne p1, p0, :cond_2

    .line 982
    invoke-interface {v0}, Ll/֡᩷֫;->۫()Z

    move-result p1

    if-nez p1, :cond_2

    .line 769
    iget-object p1, p0, Ll/᩹᩷֫;->ᩴ:Ll/ۧۙ֫;

    .line 770
    invoke-virtual {p1}, Ll/֨֨ۚ;->ܳ()Ll/ܰ᩹ۙ;

    move-result-object p1

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 773
    iput-object p1, p0, Ll/᩹᩷֫;->ۤ:Ll/ܶ᩷֫;

    .line 1054
    iget-boolean p1, p0, Ll/᩹᩷֫;->ܳ:Z

    if-eqz p1, :cond_2

    .line 774
    invoke-interface {v0}, Ll/֡᩷֫;->isPlaying()Z

    move-result p1

    if-nez p1, :cond_2

    .line 889
    invoke-direct {p0}, Ll/᩹᩷֫;->֫()Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    .line 892
    :cond_1
    invoke-interface {v0}, Ll/֡᩷֫;->start()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩹᩷֫;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩹᩷֫;->֫()Z

    move-result p0

    return p0
.end method

.method private ۚ()Z
    .locals 2

    .line 1039
    iget-object v0, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {v0}, Ll/֡᩷֫;->isPlaying()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ll/֡᩷֫;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Ll/᩹᩷֫;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static bridge synthetic ۤ(I)I
    .locals 0

    .line 0
    invoke-static {p0}, Ll/᩹᩷֫;->ᩴ(I)I

    move-result p0

    return p0
.end method

.method public static ۤ(Ll/᩹᩷֫;)V
    .locals 1

    .line 889
    invoke-direct {p0}, Ll/᩹᩷֫;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 892
    :cond_0
    iget-object p0, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {p0}, Ll/֡᩷֫;->start()V

    return-void
.end method

.method private ۧ()V
    .locals 9

    .line 865
    iget-object v0, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {v0}, Ll/֡᩷֫;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 869
    :cond_0
    iget v1, p0, Ll/᩹᩷֫;->ۙ:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Ll/᩹᩷֫;->ۙ:I

    .line 915
    iget-boolean v1, p0, Ll/᩹᩷֫;->۫:Z

    if-eqz v1, :cond_1

    goto :goto_0

    .line 918
    :cond_1
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v1

    .line 920
    sget v3, Ll/ۘ᩷֫;->۟:I

    .line 194
    new-instance v3, Landroid/content/Intent;

    const-class v4, Ll/ۘ᩷֫;

    invoke-direct {v3, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v4, "playbackSessionId"

    .line 195
    iget-wide v5, p0, Ll/᩹᩷֫;->ۚ:J

    invoke-virtual {v3, v4, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object v3

    .line 919
    invoke-static {v1, v3}, Ll/۟֡;->ۙ(Landroid/content/Context;Landroid/content/Intent;)V

    .line 922
    iput-boolean v2, p0, Ll/᩹᩷֫;->۫:Z

    .line 871
    :goto_0
    iget-object v1, p0, Ll/᩹᩷֫;->ᩴ:Ll/ۧۙ֫;

    invoke-virtual {v1}, Ll/֨֨ۚ;->ܳ()Ll/ܰ᩹ۙ;

    move-result-object v1

    .line 872
    iget-object v2, p0, Ll/᩹᩷֫;->ۤ:Ll/ܶ᩷֫;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ll/ܶ᩷֫;->ۙ()Ll/ܰ᩹ۙ;

    move-result-object v2

    if-eq v2, v1, :cond_2

    .line 788
    iput-object v3, p0, Ll/᩹᩷֫;->ۤ:Ll/ܶ᩷֫;

    .line 875
    :cond_2
    invoke-interface {v0}, Ll/֡᩷֫;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Ll/᩹᩷֫;->ۧ:Ll/ܰ᩹ۙ;

    if-ne v2, v1, :cond_4

    .line 889
    invoke-direct {p0}, Ll/᩹᩷֫;->֫()Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    return-void

    .line 892
    :cond_3
    invoke-interface {v0}, Ll/֡᩷֫;->start()V

    return-void

    .line 879
    :cond_4
    iput-object v3, p0, Ll/᩹᩷֫;->ۧ:Ll/ܰ᩹ۙ;

    .line 881
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object v2

    sget-object v3, Ll/᩹᩷֫;->ܶ:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 882
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object v2

    new-instance v4, Ll/֫᩷֫;

    invoke-direct {v4, v1}, Ll/֫᩷֫;-><init>(Ll/ܰ᩹ۙ;)V

    .line 883
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    const-wide/16 v7, 0x190

    add-long/2addr v5, v7

    .line 882
    invoke-virtual {v2, v4, v3, v5, v6}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 884
    invoke-interface {v0, v1}, Ll/֡᩷֫;->ۙ(Ll/ܰ᩹ۙ;)V

    return-void
.end method

.method public static bridge synthetic ۫()Ljava/lang/Object;
    .locals 1

    .line 0
    sget-object v0, Ll/᩹᩷֫;->ܶ:Ljava/lang/Object;

    return-object v0
.end method

.method public static ܳ(I)V
    .locals 3

    .line 959
    div-int/lit8 v0, p0, 0x32

    .line 960
    sget-object v1, Ll/ۗ᩷֫;->ܺ:Ll/ܽ᩻ۙ;

    invoke-virtual {v1}, Ll/ܺ᩻ۙ;->ۙ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-static {v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eq v0, v2, :cond_0

    .line 961
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    :cond_0
    int-to-long v0, p0

    .line 963
    invoke-static {v0, v1}, Ll/ۗ᩷֫;->ۙ(J)I

    move-result p0

    .line 964
    sget-object v0, Ll/ۗ᩷֫;->ܽ:Ll/ܽ᩻ۙ;

    invoke-virtual {v0}, Ll/ܺ᩻ۙ;->ۙ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq p0, v1, :cond_1

    .line 965
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public static ᩴ(I)I
    .locals 2

    const/4 v0, 0x0

    .line 973
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 974
    sget-object v0, Ll/ۗ᩷֫;->ۗ:Ll/ܽ᩻ۙ;

    invoke-virtual {v0}, Ll/ܺ᩻ۙ;->ۙ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 975
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lez v1, :cond_0

    .line 976
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit8 v0, v0, 0x32

    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    :cond_0
    return p0
.end method

.method public static ᩷(J)V
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p0, v0

    if-nez v2, :cond_0

    const-wide/16 p0, 0x0

    .line 860
    :cond_0
    sget-object v0, Ll/ۗ᩷֫;->ۗ:Ll/ܽ᩻ۙ;

    const-wide/16 v1, 0x32

    div-long v1, p0, v1

    long-to-int v2, v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 861
    sget-object v0, Ll/ۗ᩷֫;->᩺:Ll/ܽ᩻ۙ;

    invoke-static {p0, p1}, Ll/ۗ᩷֫;->ۙ(J)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    return-void
.end method

.method public static ᩷(Ll/ᩳ۬ۚ;)V
    .locals 2

    .line 847
    sget-object v0, Ll/ۗ᩷֫;->ۛ:Ll/ܽ᩻ۙ;

    iget-object v1, p0, Ll/ᩳ۬ۚ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 848
    sget-object v0, Ll/ۗ᩷֫;->ۧ:Ll/ܽ᩻ۙ;

    iget-object v1, p0, Ll/ᩳ۬ۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 849
    sget-object v0, Ll/ۗ᩷֫;->᩻:Ll/ܽ᩻ۙ;

    invoke-virtual {v0, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 850
    sget-object v0, Ll/ۗ᩷֫;->ܶ:Ll/ܽ᩻ۙ;

    iget-object v1, p0, Ll/ᩳ۬ۚ;->᩸:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 851
    sget-object v0, Ll/ۗ᩷֫;->֫:Ll/ܽ᩻ۙ;

    iget-object v1, p0, Ll/ᩳ۬ۚ;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 852
    sget-object v0, Ll/ۗ᩷֫;->᩹:Ll/ܽ᩻ۙ;

    iget-object p0, p0, Ll/ᩳ۬ۚ;->ᩴ:Landroid/graphics/Bitmap;

    invoke-virtual {v0, p0}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/᩹᩷֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩹᩷֫;->ۧ()V

    return-void
.end method

.method public static bridge synthetic ᩸(I)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/᩹᩷֫;->ܳ(I)V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    .line 1054
    iget-boolean v0, p0, Ll/᩹᩷֫;->ܳ:Z

    if-eqz v0, :cond_0

    .line 1016
    invoke-direct {p0}, Ll/᩹᩷֫;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 1049
    iput-boolean v0, p0, Ll/᩹᩷֫;->ܳ:Z

    .line 1018
    iget-object v0, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {v0}, Ll/֡᩷֫;->pause()V

    :cond_0
    return-void
.end method

.method public final ۙ(I)V
    .locals 7

    const/4 v0, 0x0

    .line 934
    iput-boolean v0, p0, Ll/᩹᩷֫;->ܺ:Z

    .line 935
    invoke-static {p1}, Ll/᩹᩷֫;->ᩴ(I)I

    move-result p1

    .line 936
    iget-object v0, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {v0}, Ll/֡᩷֫;->ۤ()Z

    move-result v1

    iget-object v2, p0, Ll/᩹᩷֫;->ܽ:Ll/۟ۘܳ;

    iget-boolean v3, p0, Ll/᩹᩷֫;->᩸:Z

    iget-object v4, p0, Ll/᩹᩷֫;->ᩴ:Ll/ۧۙ֫;

    if-nez v1, :cond_1

    .line 937
    invoke-interface {v0}, Ll/֡᩷֫;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Ll/᩹᩷֫;->᩻:I

    if-ltz v0, :cond_3

    .line 938
    iput p1, p0, Ll/᩹᩷֫;->᩻:I

    .line 939
    invoke-static {p1}, Ll/᩹᩷֫;->ܳ(I)V

    .line 940
    iget-boolean v0, p0, Ll/᩹᩷֫;->᩷:Z

    if-eqz v0, :cond_3

    if-nez v3, :cond_0

    goto :goto_0

    .line 901
    :cond_0
    invoke-virtual {v4}, Ll/֨֨ۚ;->ۤ()I

    move-result v0

    .line 900
    invoke-static {v2, v0, p1}, Ll/ᩳ᩷֫;->ۙ(Ll/۟ۘܳ;II)V

    return-void

    .line 946
    :cond_1
    invoke-virtual {v4}, Ll/֨֨ۚ;->ܳ()Ll/ܰ᩹ۙ;

    move-result-object v1

    .line 766
    new-instance v5, Ll/ܶ᩷֫;

    invoke-direct {v5, v1, p1}, Ll/ܶ᩷֫;-><init>(Ll/ܰ᩹ۙ;I)V

    .line 767
    iput-object v5, p0, Ll/᩹᩷֫;->ۤ:Ll/ܶ᩷֫;

    .line 768
    new-instance v6, Ll/ۧ᩷֫;

    invoke-direct {v6, p0, v5, v1}, Ll/ۧ᩷֫;-><init>(Ll/᩹᩷֫;Ll/ܶ᩷֫;Ll/ܰ᩹ۙ;)V

    invoke-interface {v0, p1, v6}, Ll/֡᩷֫;->ۙ(ILl/ۧ᩷֫;)V

    .line 947
    invoke-static {p1}, Ll/᩹᩷֫;->ܳ(I)V

    .line 948
    iget-boolean v0, p0, Ll/᩹᩷֫;->᩷:Z

    if-eqz v0, :cond_3

    .line 949
    iput p1, p0, Ll/᩹᩷֫;->᩻:I

    if-nez v3, :cond_2

    goto :goto_0

    .line 901
    :cond_2
    invoke-virtual {v4}, Ll/֨֨ۚ;->ۤ()I

    move-result v0

    .line 900
    invoke-static {v2, v0, p1}, Ll/ᩳ᩷֫;->ۙ(Ll/۟ۘܳ;II)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final ۙ(Z)V
    .locals 3

    .line 986
    iget-object v0, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {v0}, Ll/֡᩷֫;->۫()Z

    move-result v1

    if-nez v1, :cond_0

    .line 988
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object v1

    sget-object v2, Ll/᩹᩷֫;->ܶ:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 989
    iget v1, p0, Ll/᩹᩷֫;->ۙ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩹᩷֫;->ۙ:I

    const/4 v1, 0x0

    .line 788
    iput-object v1, p0, Ll/᩹᩷֫;->ۤ:Ll/ܶ᩷֫;

    .line 991
    invoke-interface {v0}, Ll/֡᩷֫;->ۙ()V

    .line 992
    invoke-static {p0}, Ll/ۗ᩷֫;->ۙ(Ll/᩹᩷֫;)V

    if-eqz p1, :cond_0

    .line 994
    new-instance p1, Landroid/content/Intent;

    const-string v0, "bin.mt.media.ACTION_MUSIC_PLAYER_STATE_RELEASED"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 995
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Ll/ۜܺۙ;->ۙ(Landroid/content/ContextWrapper;)Ll/ۜܺۙ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۜܺۙ;->ۙ(Landroid/content/Intent;)Z

    :cond_0
    return-void
.end method

.method public final ۤ()V
    .locals 1

    .line 1054
    iget-boolean v0, p0, Ll/᩹᩷֫;->ܳ:Z

    if-eqz v0, :cond_0

    .line 1001
    invoke-direct {p0}, Ll/᩹᩷֫;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1002
    invoke-virtual {p0}, Ll/᩹᩷֫;->᩷()V

    return-void

    .line 1004
    :cond_0
    invoke-virtual {p0}, Ll/᩹᩷֫;->᩸()V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 1080
    iget-object v0, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {v0}, Ll/֡᩷֫;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1044
    iput-boolean v0, p0, Ll/᩹᩷֫;->ܳ:Z

    .line 1084
    iget-object v0, p0, Ll/᩹᩷֫;->ᩴ:Ll/ۧۙ֫;

    invoke-virtual {v0}, Ll/֨֨ۚ;->֫()V

    .line 1085
    invoke-direct {p0}, Ll/᩹᩷֫;->ۧ()V

    return-void
.end method

.method public final ᩴ()V
    .locals 1

    .line 1071
    iget-object v0, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {v0}, Ll/֡᩷֫;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1044
    iput-boolean v0, p0, Ll/᩹᩷֫;->ܳ:Z

    .line 1075
    iget-object v0, p0, Ll/᩹᩷֫;->ᩴ:Ll/ۧۙ֫;

    invoke-virtual {v0}, Ll/֨֨ۚ;->ۚ()V

    .line 1076
    invoke-direct {p0}, Ll/᩹᩷֫;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 3

    .line 1054
    iget-boolean v0, p0, Ll/᩹᩷֫;->ܳ:Z

    if-eqz v0, :cond_3

    .line 1024
    invoke-direct {p0}, Ll/᩹᩷֫;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 1025
    iput-boolean v0, p0, Ll/᩹᩷֫;->ܳ:Z

    .line 1026
    iget-object v1, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {v1}, Ll/֡᩷֫;->pause()V

    const/4 v2, 0x1

    .line 1027
    iput-boolean v2, p0, Ll/᩹᩷֫;->᩷:Z

    .line 1028
    invoke-direct {p0}, Ll/᩹᩷֫;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1029
    iget-object v0, p0, Ll/᩹᩷֫;->ۤ:Ll/ܶ᩷֫;

    invoke-virtual {v0}, Ll/ܶ᩷֫;->position()I

    move-result v0

    goto :goto_0

    .line 1030
    :cond_0
    invoke-interface {v1}, Ll/֡᩷֫;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ll/֡᩷֫;->getCurrentPosition()I

    move-result v0

    goto :goto_0

    .line 1031
    :cond_1
    iget v1, p0, Ll/᩹᩷֫;->᩻:I

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1032
    :goto_0
    iput v0, p0, Ll/᩹᩷֫;->᩻:I

    .line 897
    iget-boolean v1, p0, Ll/᩹᩷֫;->᩸:Z

    if-nez v1, :cond_2

    goto :goto_1

    .line 900
    :cond_2
    iget-object v1, p0, Ll/᩹᩷֫;->ᩴ:Ll/ۧۙ֫;

    .line 901
    invoke-virtual {v1}, Ll/֨֨ۚ;->ۤ()I

    move-result v1

    .line 900
    iget-object v2, p0, Ll/᩹᩷֫;->ܽ:Ll/۟ۘܳ;

    invoke-static {v2, v1, v0}, Ll/ᩳ᩷֫;->ۙ(Ll/۟ۘܳ;II)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final ᩷(I)Z
    .locals 2

    .line 1058
    iget-object v0, p0, Ll/᩹᩷֫;->ᩴ:Ll/ۧۙ֫;

    invoke-virtual {v0}, Ll/֨֨ۚ;->ۤ()I

    move-result v1

    if-ne v1, p1, :cond_0

    goto :goto_0

    .line 1061
    :cond_0
    iget-object v1, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {v1}, Ll/֡᩷֫;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 v1, 0x1

    .line 1044
    iput-boolean v1, p0, Ll/᩹᩷֫;->ܳ:Z

    .line 1065
    invoke-virtual {v0, p1}, Ll/֨֨ۚ;->ۙ(I)V

    .line 1066
    invoke-direct {p0}, Ll/᩹᩷֫;->ۧ()V

    return v1
.end method

.method public final ᩸()V
    .locals 2

    const/4 v0, 0x1

    .line 1044
    iput-boolean v0, p0, Ll/᩹᩷֫;->ܳ:Z

    .line 1010
    iget-object v0, p0, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {v0}, Ll/֡᩷֫;->ᩴ()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ll/֡᩷֫;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1011
    invoke-direct {p0}, Ll/᩹᩷֫;->ۧ()V

    :cond_0
    return-void
.end method

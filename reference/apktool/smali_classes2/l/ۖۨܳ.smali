.class public final Ll/ۖۨܳ;
.super Ljava/lang/Object;
.source "123V"


# instance fields
.field public ۙ:Ljava/lang/Runnable;

.field public final synthetic ۤ:Ll/۠ۨܳ;

.field public volatile ᩷:Z


# direct methods
.method public constructor <init>(Ll/۠ۨܳ;Ljava/lang/Runnable;)V
    .locals 0

    .line 1745
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۨܳ;->ۤ:Ll/۠ۨܳ;

    const/4 p1, 0x0

    .line 1741
    iput-boolean p1, p0, Ll/ۖۨܳ;->᩷:Z

    .line 1746
    iput-object p2, p0, Ll/ۖۨܳ;->ۙ:Ljava/lang/Runnable;

    return-void
.end method

.method public static ۙ(Ll/ۖۨܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 1795
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->ۙ(Z)V

    return-void
.end method

.method private ۙ(Z)V
    .locals 6

    move-object v0, p0

    .line 1801
    monitor-enter v0

    .line 1802
    :try_start_0
    iget-boolean v1, p0, Ll/ۖۨܳ;->᩷:Z

    if-eqz v1, :cond_0

    .line 1803
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 1804
    iput-boolean v1, p0, Ll/ۖۨܳ;->᩷:Z

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    .line 1806
    iget-object p1, p0, Ll/ۖۨܳ;->ۙ:Ljava/lang/Runnable;

    goto :goto_0

    :cond_1
    move-object p1, v2

    .line 1808
    :goto_0
    iput-object v2, p0, Ll/ۖۨܳ;->ۙ:Ljava/lang/Runnable;

    .line 1809
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1811
    iget-object v0, p0, Ll/ۖۨܳ;->ۤ:Ll/۠ۨܳ;

    invoke-static {v0}, Ll/۠ۨܳ;->ᩴ(Ll/۠ۨܳ;)Ljava/util/HashSet;

    move-result-object v0

    monitor-enter v0

    .line 1812
    :try_start_1
    iget-object v3, p0, Ll/ۖۨܳ;->ۤ:Ll/۠ۨܳ;

    invoke-static {v3}, Ll/۠ۨܳ;->ᩴ(Ll/۠ۨܳ;)Ljava/util/HashSet;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 1813
    monitor-exit v0

    return-void

    .line 1814
    :cond_2
    iget-object v3, p0, Ll/ۖۨܳ;->ۤ:Ll/۠ۨܳ;

    invoke-static {v3}, Ll/۠ۨܳ;->ᩴ(Ll/۠ۨܳ;)Ljava/util/HashSet;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    move-result v3

    .line 1815
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_3

    .line 1817
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_3
    if-eqz v3, :cond_8

    .line 1820
    iget-object p1, p0, Ll/ۖۨܳ;->ۤ:Ll/۠ۨܳ;

    invoke-static {p1}, Ll/۠ۨܳ;->᩸(Ll/۠ۨܳ;)Ll/ۢۨܳ;

    move-result-object p1

    .line 1905
    iget-object v0, p1, Ll/ۢۨܳ;->ᩴ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_7

    iget-object v0, p1, Ll/ۢۨܳ;->ۙ:Ll/ۨۖܶ;

    if-eqz v0, :cond_7

    iget-object v3, p1, Ll/ۢۨܳ;->᩷:Ll/ۨۖܶ;

    if-nez v3, :cond_4

    goto :goto_1

    .line 1907
    :cond_4
    invoke-virtual {v0}, Ll/ۧ۠ܶ;->cancel()V

    .line 1908
    iget-object v0, p1, Ll/ۢۨܳ;->᩷:Ll/ۨۖܶ;

    invoke-virtual {v0}, Ll/ۧ۠ܶ;->cancel()V

    .line 1909
    iget-object v0, p1, Ll/ۢۨܳ;->ۤ:Ll/ۨۖܶ;

    if-eqz v0, :cond_5

    .line 1910
    invoke-virtual {v0}, Ll/ۧ۠ܶ;->cancel()V

    .line 1911
    :cond_5
    iget-object v0, p1, Ll/ۢۨܳ;->ᩴ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    move-result v0

    const v3, 0x3d8f5c29    # 0.07f

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_6

    .line 1912
    iget-object v0, p1, Ll/ۢۨܳ;->ᩴ:Landroid/view/ViewGroup;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1913
    iput-object v2, p1, Ll/ۢۨܳ;->ᩴ:Landroid/view/ViewGroup;

    .line 1914
    iput-object v2, p1, Ll/ۢۨܳ;->ۙ:Ll/ۨۖܶ;

    .line 1915
    iput-object v2, p1, Ll/ۢۨܳ;->᩷:Ll/ۨۖܶ;

    .line 1916
    iput-object v2, p1, Ll/ۢۨܳ;->ۤ:Ll/ۨۖܶ;

    goto :goto_1

    .line 1919
    :cond_6
    iget-object v0, p1, Ll/ۢۨܳ;->ᩴ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    move-result v3

    const/4 v4, 0x2

    new-array v4, v4, [F

    const/4 v5, 0x0

    aput v3, v4, v5

    const/4 v3, 0x0

    aput v3, v4, v1

    invoke-static {v0, v4}, Ll/ۨۖܶ;->ۙ(Ljava/lang/Object;[F)Ll/ۨۖܶ;

    move-result-object v0

    iput-object v0, p1, Ll/ۢۨܳ;->᩸:Ll/ۨۖܶ;

    .line 1920
    new-instance v1, Ll/ᩳۨܳ;

    invoke-direct {v1, p1}, Ll/ᩳۨܳ;-><init>(Ll/ۢۨܳ;)V

    invoke-virtual {v0, v1}, Ll/᩻ۖܶ;->ۙ(Ll/ܺۖܶ;)V

    .line 1930
    iget-object v0, p1, Ll/ۢۨܳ;->᩸:Ll/ۨۖܶ;

    invoke-virtual {v0}, Ll/ۧ۠ܶ;->ܳ()V

    .line 1931
    iput-object v2, p1, Ll/ۢۨܳ;->ۙ:Ll/ۨۖܶ;

    .line 1932
    iput-object v2, p1, Ll/ۢۨܳ;->᩷:Ll/ۨۖܶ;

    .line 1933
    iput-object v2, p1, Ll/ۢۨܳ;->ۤ:Ll/ۨۖܶ;

    .line 1821
    :cond_7
    :goto_1
    iget-object p1, p0, Ll/ۖۨܳ;->ۤ:Ll/۠ۨܳ;

    new-instance v0, Ll/֨ۨܳ;

    invoke-direct {v0, p1}, Ll/֨ۨܳ;-><init>(Ll/۠ۨܳ;)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    .line 1815
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 1809
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    const/4 v0, 0x0

    .line 1790
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->ۙ(Z)V

    return-void
.end method

.method public final ۤ()Z
    .locals 1

    .line 1754
    iget-boolean v0, p0, Ll/ۖۨܳ;->᩷:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 1750
    iget-boolean v0, p0, Ll/ۖۨܳ;->᩷:Z

    return v0
.end method

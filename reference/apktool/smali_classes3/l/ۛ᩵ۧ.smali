.class public final Ll/ۛ᩵ۧ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ֡:Ljava/lang/Object;

.field public final synthetic ֨:Ll/᩻֫ܺ;

.field public final synthetic ۖ:Ljava/util/ArrayList;

.field public final synthetic ۟:Ll/ۧۧۧ;

.field public final synthetic ۡ:Ll/ۗۧܺ;

.field public final synthetic ۢ:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public volatile ܰ:Z

.field public volatile ܿ:I

.field public final synthetic ᩳ:Ll/᩹ۧۧ;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ConcurrentLinkedQueue;Ll/᩹ۧۧ;Ll/ۗۧܺ;Ll/ۧۧۧ;Ljava/util/ArrayList;Ll/᩻֫ܺ;)V
    .locals 0

    .line 782
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ᩵ۧ;->ۢ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iput-object p2, p0, Ll/ۛ᩵ۧ;->ᩳ:Ll/᩹ۧۧ;

    iput-object p3, p0, Ll/ۛ᩵ۧ;->ۡ:Ll/ۗۧܺ;

    iput-object p4, p0, Ll/ۛ᩵ۧ;->۟:Ll/ۧۧۧ;

    iput-object p5, p0, Ll/ۛ᩵ۧ;->ۖ:Ljava/util/ArrayList;

    iput-object p6, p0, Ll/ۛ᩵ۧ;->֨:Ll/᩻֫ܺ;

    .line 784
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ᩵ۧ;->֡:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 785
    iput p1, p0, Ll/ۛ᩵ۧ;->ܿ:I

    const/4 p2, 0x1

    .line 786
    iput-boolean p2, p0, Ll/ۛ᩵ۧ;->ܰ:Z

    .line 787
    iput-boolean p1, p0, Ll/ۛ᩵ۧ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 791
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ۛ᩵ۧ;->ۢ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 792
    iget v0, p0, Ll/ۛ᩵ۧ;->ܿ:I

    const/16 v1, 0x3e8

    const/4 v2, 0x1

    if-le v0, v1, :cond_5

    .line 793
    iget v0, p0, Ll/ۛ᩵ۧ;->ܿ:I

    const v1, 0x3d090

    if-le v0, v1, :cond_2

    .line 794
    iget-object v0, p0, Ll/ۛ᩵ۧ;->֡:Ljava/lang/Object;

    monitor-enter v0

    .line 795
    :try_start_0
    iget-boolean v1, p0, Ll/ۛ᩵ۧ;->᩶:Z

    if-nez v1, :cond_1

    .line 796
    iget-object v1, p0, Ll/ۛ᩵ۧ;->ᩳ:Ll/᩹ۧۧ;

    new-instance v3, Ll/ۙ۠᩸;

    const/4 v4, 0x5

    invoke-direct {v3, v4, v1}, Ll/ۙ۠᩸;-><init>(ILjava/lang/Object;)V

    invoke-static {v3}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    .line 797
    iput-boolean v2, p0, Ll/ۛ᩵ۧ;->᩶:Z

    .line 799
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 802
    :cond_2
    iget-boolean v0, p0, Ll/ۛ᩵ۧ;->ܰ:Z

    if-eqz v0, :cond_4

    .line 803
    iget-object v0, p0, Ll/ۛ᩵ۧ;->֡:Ljava/lang/Object;

    monitor-enter v0

    .line 804
    :try_start_1
    iget-boolean v1, p0, Ll/ۛ᩵ۧ;->ܰ:Z

    if-eqz v1, :cond_3

    .line 805
    iget-object v1, p0, Ll/ۛ᩵ۧ;->ᩳ:Ll/᩹ۧۧ;

    invoke-interface {v1}, Ll/᩹ۧۧ;->ᩴ()Z

    move-result v1

    iput-boolean v1, p0, Ll/ۛ᩵ۧ;->᩶:Z

    const/4 v1, 0x0

    .line 806
    iput-boolean v1, p0, Ll/ۛ᩵ۧ;->ܰ:Z

    .line 808
    :cond_3
    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v1

    .line 810
    :cond_4
    :goto_1
    iget-boolean v0, p0, Ll/ۛ᩵ۧ;->᩶:Z

    if-eqz v0, :cond_5

    goto :goto_2

    .line 815
    :cond_5
    iget-object v0, p0, Ll/ۛ᩵ۧ;->ۢ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ܰ᩹ۧ;

    if-eqz v1, :cond_7

    .line 816
    iget-object v0, p0, Ll/ۛ᩵ۧ;->ᩳ:Ll/᩹ۧۧ;

    invoke-interface {v0}, Ll/᩹ۧۧ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_2

    .line 819
    :cond_6
    iget-object v0, p0, Ll/ۛ᩵ۧ;->ۡ:Ll/ۗۧܺ;

    .line 41
    invoke-virtual {v0, v2}, Ll/ۗۧܺ;->ۙ(I)Z

    .line 820
    iget-object v0, p0, Ll/ۛ᩵ۧ;->۟:Ll/ۧۧۧ;

    invoke-interface {v0, v1}, Ll/ۧۧۧ;->accept(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object v0, p0

    .line 822
    monitor-enter v0

    .line 823
    :try_start_2
    iget v3, p0, Ll/ۛ᩵ۧ;->ܿ:I

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v3, v4

    iput v3, p0, Ll/ۛ᩵ۧ;->ܿ:I

    .line 824
    iget-object v3, p0, Ll/ۛ᩵ۧ;->ۖ:Ljava/util/ArrayList;

    new-instance v4, Ll/ۚۧۧ;

    invoke-interface {v1}, Ll/ܰ᩹ۧ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1, v2}, Ll/ۚۧۧ;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 825
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 826
    iget-object v0, p0, Ll/ۛ᩵ۧ;->֨:Ll/᩻֫ܺ;

    invoke-virtual {v0}, Ll/᩻֫ܺ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 827
    iget-object v0, p0, Ll/ۛ᩵ۧ;->ᩳ:Ll/᩹ۧۧ;

    iget v1, p0, Ll/ۛ᩵ۧ;->ܿ:I

    invoke-interface {v0, v1}, Ll/᩹ۧۧ;->ۙ(I)V

    goto/16 :goto_0

    :catchall_2
    move-exception v1

    .line 825
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v1

    :cond_7
    :goto_2
    return-void
.end method

.class public final Ll/۟ܳܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֡:Ll/ᩳܳܳ;

.field public final ۟:Ll/᩶ܳܳ;

.field public ܰ:Z

.field public final ܿ:J

.field public final ᩶:J


# direct methods
.method public constructor <init>(Ll/ᩳܳܳ;JJLl/᩶ܳܳ;)V
    .locals 1

    .line 3739
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3737
    iput-boolean v0, p0, Ll/۟ܳܳ;->ܰ:Z

    .line 3740
    iput-object p1, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    .line 3741
    iput-wide p2, p0, Ll/۟ܳܳ;->᩶:J

    .line 3742
    iput-wide p4, p0, Ll/۟ܳܳ;->ܿ:J

    .line 3743
    iput-object p6, p0, Ll/۟ܳܳ;->۟:Ll/᩶ܳܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/۟ܳܳ;)Ll/᩶ܳܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ܳܳ;->۟:Ll/᩶ܳܳ;

    return-object p0
.end method

.method private ۤ()V
    .locals 6

    .line 3931
    iget-boolean v0, p0, Ll/۟ܳܳ;->ܰ:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/۟ܳܳ;->᩶:J

    iget-object v2, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    invoke-static {v2}, Ll/ᩳܳܳ;->֫(Ll/ᩳܳܳ;)J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    invoke-static {v2}, Ll/ᩳܳܳ;->ۤ(Ll/ᩳܳܳ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 3932
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "VersionHandle is not active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܳ()V
    .locals 2

    .line 3839
    iget-object v0, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    monitor-enter v0

    .line 3840
    :try_start_0
    invoke-direct {p0}, Ll/۟ܳܳ;->ۤ()V

    .line 3841
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3842
    iget-object v0, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->᩶()V

    .line 3843
    iget-object v0, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    monitor-enter v0

    .line 3844
    :try_start_1
    invoke-direct {p0}, Ll/۟ܳܳ;->ۤ()V

    .line 3845
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    .line 3841
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public static bridge synthetic ᩷(Ll/۟ܳܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/۟ܳܳ;->ܰ:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 3942
    iget-object v0, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    monitor-enter v0

    .line 3943
    :try_start_0
    iget-boolean v1, p0, Ll/۟ܳܳ;->ܰ:Z

    if-nez v1, :cond_0

    .line 3944
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 3946
    iput-boolean v1, p0, Ll/۟ܳܳ;->ܰ:Z

    .line 3947
    iget-object v1, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    invoke-static {v1}, Ll/ᩳܳܳ;->ۧ(Ll/ᩳܳܳ;)Ljava/util/IdentityHashMap;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3948
    iget-object v1, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    invoke-static {v1}, Ll/ᩳܳܳ;->ܺ(Ll/ᩳܳܳ;)[Ll/᩸۫ܳ;

    move-result-object v1

    .line 3949
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3950
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ([Ll/᩸۫ܳ;)V

    return-void

    :catchall_0
    move-exception v1

    .line 3949
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۙ()J
    .locals 3

    .line 3748
    iget-object v0, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    monitor-enter v0

    .line 3749
    :try_start_0
    invoke-direct {p0}, Ll/۟ܳܳ;->ۤ()V

    .line 3750
    iget-wide v1, p0, Ll/۟ܳܳ;->ܿ:J

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    .line 3751
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۙ(Ll/۟֡֫;)Ll/ۙ۫ܳ;
    .locals 12

    .line 3772
    iget-object v0, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    monitor-enter v0

    .line 3773
    :try_start_0
    invoke-direct {p0}, Ll/۟ܳܳ;->ۤ()V

    .line 3774
    iget-object v1, p0, Ll/۟ܳܳ;->۟:Ll/᩶ܳܳ;

    .line 3775
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3777
    invoke-static {p1}, Ll/ܿ֡֫;->ۙ(Ll/۟֡֫;)Ll/۟֡֫;

    move-result-object p1

    .line 3851
    invoke-interface {p1}, Ll/۟֡֫;->۫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3779
    invoke-direct {p0}, Ll/۟ܳܳ;->ܳ()V

    const/4 v0, 0x0

    .line 3782
    :try_start_1
    new-instance v11, Ll/ۙ۫ܳ;

    iget-object v2, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    invoke-static {v2}, Ll/ᩳܳܳ;->ۚ(Ll/ᩳܳܳ;)J

    move-result-wide v3

    iget-wide v5, p0, Ll/۟ܳܳ;->᩶:J

    iget-wide v7, p0, Ll/۟ܳܳ;->ܿ:J

    iget-object v9, v1, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    iget-object v10, v1, Ll/᩶ܳܳ;->᩸:Ll/ܺᩴܳ;

    move-object v2, v11

    invoke-direct/range {v2 .. v10}, Ll/ۙ۫ܳ;-><init>(JJJLl/۬۫ܳ;Ll/ܺᩴܳ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_3

    .line 3785
    :try_start_2
    invoke-virtual {v11}, Ll/ۙ۫ܳ;->ۤ()V

    .line 3786
    invoke-direct {p0}, Ll/۟ܳܳ;->ܳ()V

    .line 3851
    invoke-interface {p1}, Ll/۟֡֫;->۫()Z

    move-result p1

    if-nez p1, :cond_0

    return-object v11

    .line 3852
    :cond_0
    new-instance p1, Ll/ۡܳܳ;

    invoke-direct {p1}, Ll/ۡܳܳ;-><init>()V

    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    move-object v0, v11

    goto :goto_1

    :catch_3
    move-exception p1

    goto :goto_1

    :catch_4
    move-exception p1

    goto :goto_1

    :catch_5
    move-exception p1

    :goto_1
    if-nez v0, :cond_1

    goto :goto_2

    .line 3923
    :cond_1
    :try_start_3
    invoke-virtual {v0}, Ll/ۙ۫ܳ;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6

    goto :goto_2

    :catch_6
    move-exception v0

    .line 3925
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 3793
    :goto_2
    throw p1

    .line 3852
    :cond_2
    new-instance p1, Ll/ۡܳܳ;

    invoke-direct {p1}, Ll/ۡܳܳ;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    .line 3775
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final ۙ(IILjava/io/File;Ll/᩵ۤܳ;)Ll/ۜܳܳ;
    .locals 17

    move-object/from16 v1, p0

    move/from16 v0, p1

    move/from16 v2, p2

    .line 3864
    iget-object v3, v1, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    move-object/from16 v16, v3

    monitor-enter v16

    .line 3865
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/۟ܳܳ;->ۤ()V

    .line 3866
    iget-object v3, v1, Ll/۟ܳܳ;->۟:Ll/᩶ܳܳ;

    invoke-virtual {v3}, Ll/᩶ܳܳ;->ۙ()I

    move-result v3

    invoke-static {v3, v0, v2}, Ll/۬ܳܳ;->᩷(III)V

    const/high16 v3, 0x2000000

    if-gt v2, v3, :cond_5

    .line 3870
    iget-object v3, v1, Ll/۟ܳܳ;->۟:Ll/᩶ܳܳ;

    .line 3871
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3873
    invoke-static/range {p4 .. p4}, Ll/ܿ֡֫;->ۙ(Ll/۟֡֫;)Ll/۟֡֫;

    move-result-object v4

    .line 3874
    invoke-interface {v4}, Ll/۟֡֫;->۫()Z

    move-result v5

    if-nez v5, :cond_4

    const/4 v5, 0x0

    .line 3881
    :try_start_1
    new-instance v15, Ll/ۜܳܳ;

    iget-object v6, v1, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    invoke-static {v6}, Ll/ᩳܳܳ;->ۚ(Ll/ᩳܳܳ;)J

    move-result-wide v7

    iget-wide v9, v1, Ll/۟ܳܳ;->᩶:J

    iget-wide v11, v1, Ll/۟ܳܳ;->ܿ:J

    iget-object v6, v3, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    .line 3882
    invoke-static {v6, v0, v2}, Ll/ᩴۚܳ;->ۙ(Ll/۬۫ܳ;II)Ll/۬۫ܳ;

    move-result-object v13

    iget-object v3, v3, Ll/᩶ܳܳ;->᩸:Ll/ܺᩴܳ;

    .line 3883
    invoke-static {v3, v0, v2}, Ll/᩵ᩴܳ;->ۙ(Ll/ܺᩴܳ;II)Ll/ܺᩴܳ;

    move-result-object v14

    move-object v6, v15

    invoke-direct/range {v6 .. v14}, Ll/ۜܳܳ;-><init>(JJJLl/۬۫ܳ;Ll/ܺᩴܳ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_6

    move-object/from16 v0, p3

    .line 3884
    :try_start_2
    invoke-static {v15, v0, v4}, Ll/ᩳܳܳ;->ۙ(Ll/ۜܳܳ;Ljava/io/File;Ll/۟֡֫;)Ll/ۜܳܳ;

    move-result-object v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_3

    if-ne v2, v15, :cond_0

    goto :goto_0

    :cond_0
    move-object v5, v15

    .line 3888
    :goto_0
    :try_start_3
    iget-object v0, v1, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    move-object/from16 v16, v0

    monitor-enter v16
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_0

    .line 3889
    :try_start_4
    invoke-direct/range {p0 .. p0}, Ll/۟ܳܳ;->ۤ()V

    .line 3890
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v5, :cond_1

    .line 3892
    :try_start_5
    invoke-virtual {v5}, Ll/ۜܳܳ;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_0

    :cond_1
    return-object v2

    :catchall_0
    move-exception v0

    .line 3890
    :try_start_6
    monitor-exit v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw v0
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    :goto_1
    move-object v15, v5

    move-object v5, v2

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_2

    :catch_4
    move-exception v0

    goto :goto_2

    :catch_5
    move-exception v0

    :goto_2
    move-object v2, v0

    goto :goto_4

    :catch_6
    move-exception v0

    goto :goto_3

    :catch_7
    move-exception v0

    goto :goto_3

    :catch_8
    move-exception v0

    :goto_3
    move-object v2, v0

    move-object v15, v5

    :goto_4
    if-nez v5, :cond_2

    goto :goto_5

    .line 3911
    :cond_2
    :try_start_8
    invoke-virtual {v5}, Ll/ۜܳܳ;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_9

    goto :goto_5

    :catch_9
    move-exception v0

    move-object v3, v0

    .line 3913
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    if-nez v15, :cond_3

    goto :goto_6

    .line 3911
    :cond_3
    :try_start_9
    invoke-virtual {v15}, Ll/ۜܳܳ;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_a

    goto :goto_6

    :catch_a
    move-exception v0

    move-object v3, v0

    .line 3913
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 3901
    :goto_6
    throw v2

    .line 3875
    :cond_4
    new-instance v0, Ll/ۡܳܳ;

    invoke-direct {v0}, Ll/ۡܳܳ;-><init>()V

    throw v0

    .line 3868
    :cond_5
    :try_start_a
    new-instance v0, Ll/۫ᩴܳ;

    invoke-direct {v0}, Ll/۫ᩴܳ;-><init>()V

    throw v0

    :catchall_1
    move-exception v0

    .line 3871
    monitor-exit v16
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    throw v0
.end method

.method public final ۙ(IILl/۟֡֫;)Ll/ۜܳܳ;
    .locals 12

    .line 3809
    iget-object v0, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    monitor-enter v0

    .line 3810
    :try_start_0
    invoke-direct {p0}, Ll/۟ܳܳ;->ۤ()V

    .line 3811
    iget-object v1, p0, Ll/۟ܳܳ;->۟:Ll/᩶ܳܳ;

    invoke-virtual {v1}, Ll/᩶ܳܳ;->ۙ()I

    move-result v1

    invoke-static {v1, p1, p2}, Ll/۬ܳܳ;->᩷(III)V

    .line 3812
    iget-object v1, p0, Ll/۟ܳܳ;->۟:Ll/᩶ܳܳ;

    .line 3813
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3815
    invoke-static {p3}, Ll/ܿ֡֫;->ۙ(Ll/۟֡֫;)Ll/۟֡֫;

    move-result-object p3

    .line 3851
    invoke-interface {p3}, Ll/۟֡֫;->۫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3817
    invoke-direct {p0}, Ll/۟ܳܳ;->ܳ()V

    const/4 v0, 0x0

    .line 3820
    :try_start_1
    iget-object v2, v1, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    .line 3821
    invoke-static {v2, p1, p2}, Ll/ᩴۚܳ;->ۙ(Ll/۬۫ܳ;II)Ll/۬۫ܳ;

    move-result-object v2

    .line 3820
    invoke-static {v2, p3}, Ll/ᩳܳܳ;->ۙ(Ll/۬۫ܳ;Ll/۟֡֫;)Ll/۬۫ܳ;

    move-result-object v10

    .line 3823
    new-instance v2, Ll/ۜܳܳ;

    iget-object v3, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    invoke-static {v3}, Ll/ᩳܳܳ;->ۚ(Ll/ᩳܳܳ;)J

    move-result-wide v4

    iget-wide v6, p0, Ll/۟ܳܳ;->᩶:J

    iget-wide v8, p0, Ll/۟ܳܳ;->ܿ:J

    iget-object v1, v1, Ll/᩶ܳܳ;->᩸:Ll/ܺᩴܳ;

    .line 3824
    invoke-static {v1, p1, p2}, Ll/᩵ᩴܳ;->ۙ(Ll/ܺᩴܳ;II)Ll/ܺᩴܳ;

    move-result-object v11

    move-object v3, v2

    invoke-direct/range {v3 .. v11}, Ll/ۜܳܳ;-><init>(JJJLl/۬۫ܳ;Ll/ܺᩴܳ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_3

    .line 3825
    :try_start_2
    invoke-virtual {v2}, Ll/ۜܳܳ;->᩷()V

    .line 3826
    invoke-direct {p0}, Ll/۟ܳܳ;->ܳ()V

    .line 3851
    invoke-interface {p3}, Ll/۟֡֫;->۫()Z

    move-result p1

    if-nez p1, :cond_0

    return-object v2

    .line 3852
    :cond_0
    new-instance p1, Ll/ۡܳܳ;

    invoke-direct {p1}, Ll/ۡܳܳ;-><init>()V

    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    move-object v0, v2

    goto :goto_1

    :catch_3
    move-exception p1

    goto :goto_1

    :catch_4
    move-exception p1

    goto :goto_1

    :catch_5
    move-exception p1

    :goto_1
    if-nez v0, :cond_1

    goto :goto_2

    .line 3911
    :cond_1
    :try_start_3
    invoke-virtual {v0}, Ll/ۜܳܳ;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6

    goto :goto_2

    :catch_6
    move-exception p2

    .line 3913
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 3833
    :goto_2
    throw p1

    .line 3852
    :cond_2
    new-instance p1, Ll/ۡܳܳ;

    invoke-direct {p1}, Ll/ۡܳܳ;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    .line 3813
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final ᩷()Z
    .locals 6

    .line 3756
    iget-object v0, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    monitor-enter v0

    .line 3757
    :try_start_0
    iget-boolean v1, p0, Ll/۟ܳܳ;->ܰ:Z

    if-eqz v1, :cond_0

    iget-wide v1, p0, Ll/۟ܳܳ;->᩶:J

    iget-object v3, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    invoke-static {v3}, Ll/ᩳܳܳ;->֫(Ll/ᩳܳܳ;)J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    iget-object v1, p0, Ll/۟ܳܳ;->֡:Ll/ᩳܳܳ;

    invoke-static {v1}, Ll/ᩳܳܳ;->ۤ(Ll/ᩳܳܳ;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3758
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

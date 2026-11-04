.class public final Ll/᩷᩷ܳ;
.super Ljava/lang/Object;
.source "X4ZQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ܰ:Ll/ۤ᩷ܳ;

.field public ᩶:Ll/᩸᩷ܳ;


# direct methods
.method public constructor <init>(Ll/ۤ᩷ܳ;)V
    .locals 0

    .line 706
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 707
    iput-object p1, p0, Ll/᩷᩷ܳ;->ܰ:Ll/ۤ᩷ܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩷᩷ܳ;)Ll/᩸᩷ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩷ܳ;->᩶:Ll/᩸᩷ܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/᩷᩷ܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/᩷᩷ܳ;->ܰ:Ll/ۤ᩷ܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 727
    :goto_0
    const-class v0, Ll/ۚ᩷ܳ;

    monitor-enter v0

    .line 728
    :try_start_0
    invoke-static {}, Ll/ۚ᩷ܳ;->᩺()Ll/᩷᩷ܳ;

    move-result-object v1

    if-eq v1, p0, :cond_0

    .line 729
    monitor-exit v0

    goto :goto_2

    .line 731
    :cond_0
    iget-object v1, p0, Ll/᩷᩷ܳ;->ܰ:Ll/ۤ᩷ܳ;

    if-nez v1, :cond_1

    .line 733
    invoke-static {}, Ll/ۚ᩷ܳ;->ܰ()V

    .line 734
    monitor-exit v0

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    .line 736
    iput-object v2, p0, Ll/᩷᩷ܳ;->ܰ:Ll/ۤ᩷ܳ;

    .line 737
    invoke-static {}, Ll/ۚ᩷ܳ;->ۘ()Ll/ۜܳܳ;

    move-result-object v3

    invoke-static {v1}, Ll/ۤ᩷ܳ;->᩷(Ll/ۤ᩷ܳ;)Ll/ۜܳܳ;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-ne v3, v4, :cond_2

    .line 740
    :try_start_1
    new-instance v3, Ll/᩸᩷ܳ;

    invoke-static {v1}, Ll/ۤ᩷ܳ;->᩷(Ll/ۤ᩷ܳ;)Ll/ۜܳܳ;

    move-result-object v4

    .line 741
    invoke-virtual {v4}, Ll/ۜܳܳ;->ۤ()Ll/۠ܳܳ;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Ll/᩸᩷ܳ;-><init>(Ll/ۤ᩷ܳ;Ll/۠ܳܳ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 742
    :try_start_2
    iput-object v3, p0, Ll/᩷᩷ܳ;->᩶:Ll/᩸᩷ܳ;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catch_0
    :cond_2
    move-object v3, v2

    .line 747
    :catch_1
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v3, :cond_3

    .line 753
    invoke-static {v3}, Ll/ۚ᩷ܳ;->ۙ(Ll/᩸᩷ܳ;)V

    .line 756
    :cond_3
    const-class v0, Ll/ۚ᩷ܳ;

    monitor-enter v0

    .line 758
    :try_start_4
    invoke-static {}, Ll/ۚ᩷ܳ;->᩺()Ll/᩷᩷ܳ;

    move-result-object v1

    if-eq v1, p0, :cond_4

    .line 759
    monitor-exit v0

    goto :goto_2

    .line 761
    :cond_4
    iget-object v1, p0, Ll/᩷᩷ܳ;->᩶:Ll/᩸᩷ܳ;

    if-ne v1, v3, :cond_5

    .line 762
    iput-object v2, p0, Ll/᩷᩷ܳ;->᩶:Ll/᩸᩷ܳ;

    .line 764
    :cond_5
    iget-object v1, p0, Ll/᩷᩷ܳ;->ܰ:Ll/ۤ᩷ܳ;

    if-nez v1, :cond_6

    .line 765
    invoke-static {}, Ll/ۚ᩷ܳ;->ܰ()V

    .line 766
    monitor-exit v0

    :goto_2
    return-void

    .line 768
    :cond_6
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    .line 747
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method

.method public final ۙ(Ll/ۤ᩷ܳ;)V
    .locals 0

    .line 718
    iput-object p1, p0, Ll/᩷᩷ܳ;->ܰ:Ll/ۤ᩷ܳ;

    return-void
.end method

.method public final ۙ(Ll/ۜܳܳ;)Z
    .locals 1

    .line 712
    iget-object v0, p0, Ll/᩷᩷ܳ;->᩶:Ll/᩸᩷ܳ;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ll/᩸᩷ܳ;->ۙ(Ll/᩸᩷ܳ;)Ll/ۤ᩷ܳ;

    move-result-object v0

    invoke-static {v0}, Ll/ۤ᩷ܳ;->᩷(Ll/ۤ᩷ܳ;)Ll/ۜܳܳ;

    move-result-object v0

    if-eq v0, p1, :cond_1

    :cond_0
    iget-object v0, p0, Ll/᩷᩷ܳ;->ܰ:Ll/ۤ᩷ܳ;

    if-eqz v0, :cond_2

    invoke-static {v0}, Ll/ۤ᩷ܳ;->᩷(Ll/ۤ᩷ܳ;)Ll/ۜܳܳ;

    move-result-object v0

    if-ne v0, p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

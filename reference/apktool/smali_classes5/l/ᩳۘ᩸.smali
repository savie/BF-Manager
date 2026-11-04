.class public final Ll/ᩳۘ᩸;
.super Ll/ۖۙܺ;
.source "3B3L"


# instance fields
.field public ֫:Ll/ۚܰ᩸;

.field public final synthetic ۗ:Ll/ۡܰ᩸;

.field public ۚ:Ll/ܺۜ᩸;

.field public ۧ:Z

.field public ۫:Ll/᩹ܽ᩵;

.field public ܳ:Z

.field public final synthetic ܶ:Lbin/mt/plugin/api/util/ResultCallback;

.field public final synthetic ܺ:Ll/۟ܰ᩸;

.field public final synthetic ܽ:Ll/ܿۛ᩸;

.field public final synthetic ᩹:Z

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/۟ܰ᩸;Ll/ܿۛ᩸;Ll/ۡܰ᩸;ZLbin/mt/plugin/api/util/ResultCallback;)V
    .locals 0

    .line 2103
    iput-object p1, p0, Ll/ᩳۘ᩸;->ܺ:Ll/۟ܰ᩸;

    iput-object p2, p0, Ll/ᩳۘ᩸;->ܽ:Ll/ܿۛ᩸;

    iput-object p3, p0, Ll/ᩳۘ᩸;->ۗ:Ll/ۡܰ᩸;

    iput-boolean p4, p0, Ll/ᩳۘ᩸;->᩹:Z

    iput-object p5, p0, Ll/ᩳۘ᩸;->ܶ:Lbin/mt/plugin/api/util/ResultCallback;

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    return-void
.end method

.method public static synthetic ۙ(Ll/ᩳۘ᩸;)V
    .locals 3

    .line 2155
    iget-object v0, p0, Ll/ᩳۘ᩸;->ܺ:Ll/۟ܰ᩸;

    iget-boolean v1, v0, Ll/۟ܰ᩸;->۠ۙ:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    iget-object v2, p0, Ll/ᩳۘ᩸;->֫:Ll/ۚܰ᩸;

    iget-object v2, v2, Ll/ۚܰ᩸;->ᩳ:Ll/᩺ۜ᩸;

    if-ne v1, v2, :cond_0

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    iget-object p0, p0, Ll/ᩳۘ᩸;->֫:Ll/ۚܰ᩸;

    iget-object p0, p0, Ll/ۚܰ᩸;->ܰ:Ll/ᩳ۬᩸;

    if-ne v1, p0, :cond_0

    .line 2156
    iget-object p0, v0, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۘ᩷()Z

    move-result p0

    invoke-virtual {v0, p0}, Ll/۟ܰ᩸;->᩸(Z)Z

    move-result p0

    invoke-virtual {v0, p0}, Ll/ۜܽ᩸;->ۙ(Z)Z

    invoke-static {v0}, Ll/۟ܰ᩸;->֨(Ll/۟ܰ᩸;)V

    .line 2157
    iget-object p0, v0, Ll/ۜܽ᩸;->᩶:Ll/ۧܶ᩸;

    invoke-virtual {v0}, Ll/ۜܽ᩸;->ۚ()Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۧܶ᩸;->ۧ(Z)V

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/ᩳۘ᩸;Ll/ۡܰ᩸;)V
    .locals 6

    .line 2124
    iget-object p1, p1, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    iget-object v0, p0, Ll/ᩳۘ᩸;->ܺ:Ll/۟ܰ᩸;

    iget-object v1, p0, Ll/ᩳۘ᩸;->֫:Ll/ۚܰ᩸;

    invoke-virtual {v1}, Ll/ۚܰ᩸;->ۢ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 2125
    :cond_0
    iget-object v1, p0, Ll/ᩳۘ᩸;->֫:Ll/ۚܰ᩸;

    .line 2555
    invoke-virtual {v1}, Ll/ۚܰ᩸;->ۙ()Z

    move-result v2

    .line 2556
    invoke-virtual {v1}, Ll/ۚܰ᩸;->ۢ()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    .line 2557
    iget-object v3, v1, Ll/ۚܰ᩸;->ᩳ:Ll/᩺ۜ᩸;

    invoke-virtual {v3, v5}, Ll/᩺ۜ᩸;->ܳ(Z)V

    :cond_2
    if-eqz v2, :cond_3

    .line 2558
    invoke-virtual {v1}, Ll/ۚܰ᩸;->ۢ()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v4, 0x1

    .line 2125
    :cond_3
    :goto_0
    iput-boolean v4, p0, Ll/ᩳۘ᩸;->ۧ:Z

    .line 2126
    iget-object v1, p0, Ll/ᩳۘ᩸;->֫:Ll/ۚܰ᩸;

    invoke-virtual {v1}, Ll/ۚܰ᩸;->ۢ()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    .line 58
    :cond_4
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 1167
    invoke-static {v1}, Ll/ۡۧᩴ;->᩸(Ljava/lang/String;)Ll/ܺۧᩴ;

    move-result-object v1

    const-string v2, "Text"

    if-nez v1, :cond_5

    move-object v1, v2

    goto :goto_1

    .line 1168
    :cond_5
    invoke-virtual {v1}, Ll/ܺۧᩴ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 2128
    :goto_1
    invoke-static {}, Ll/ۗ۬᩸;->ܶ()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v0, Ll/۟ܰ᩸;->ۜ:Ll/᩹۬᩸;

    invoke-virtual {v3}, Ll/᩹۬᩸;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 2129
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 2130
    iget-object v2, v0, Ll/۟ܰ᩸;->ۜ:Ll/᩹۬᩸;

    invoke-virtual {v2, v1}, Ll/᩹۬᩸;->᩷(Ljava/lang/String;)V

    .line 2132
    :cond_6
    iget-object v1, p0, Ll/ᩳۘ᩸;->֫:Ll/ۚܰ᩸;

    invoke-virtual {v1}, Ll/ۚܰ᩸;->ۢ()Z

    move-result v1

    if-nez v1, :cond_7

    :goto_2
    return-void

    .line 2133
    :cond_7
    iget-object v1, v0, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    iget-object v2, v0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ۘ᩷()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/۟ܰ᩸;->᩸(Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۜܽ᩸;->ۙ(Z)Z

    const-string v1, "save_as_path"

    .line 2134
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    const-string v1, "filePath"

    .line 256
    invoke-virtual {v2, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۟ܰ᩸;->ۙ([Ljava/lang/String;)V

    .line 2136
    invoke-static {v0}, Ll/۟ܰ᩸;->᩺(Ll/۟ܰ᩸;)V

    .line 2137
    invoke-static {v0}, Ll/۟ܰ᩸;->ۡ(Ll/۟ܰ᩸;)V

    .line 2138
    invoke-static {v0}, Ll/۟ܰ᩸;->᩶(Ll/۟ܰ᩸;)V

    .line 2139
    iget-object p1, v0, Ll/ۜܽ᩸;->᩶:Ll/ۧܶ᩸;

    iget-object v1, v0, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ۘ᩷()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/۟ܰ᩸;->᩸(Z)Z

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۧܶ᩸;->ۧ(Z)V

    .line 2140
    iget-object p1, v0, Ll/ۜܽ᩸;->᩶:Ll/ۧܶ᩸;

    invoke-virtual {v0}, Ll/۟ܰ᩸;->ܰ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۧܶ᩸;->ۙ(Ljava/lang/String;)V

    .line 2141
    iget-object p1, v0, Ll/ۜܽ᩸;->᩶:Ll/ۧܶ᩸;

    sget v1, Ll/ۗۡ֫;->ܺۙ:I

    invoke-virtual {p1, v1}, Ll/ۧܶ᩸;->ۙ(I)V

    .line 2142
    invoke-virtual {v0}, Ll/ۜܽ᩸;->ۗ()V

    .line 2143
    iget-wide v1, p0, Ll/ᩳۘ᩸;->᩻:J

    invoke-virtual {v0, v1, v2}, Ll/ۜܽ᩸;->ۙ(J)V

    .line 2144
    invoke-virtual {v0, v5}, Ll/ۜܽ᩸;->᩷(Z)V

    .line 2145
    iget-object p1, p0, Ll/ᩳۘ᩸;->֫:Ll/ۚܰ᩸;

    iget-object p1, p1, Ll/ۚܰ᩸;->ᩳ:Ll/᩺ۜ᩸;

    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܿ()Ll/ܺۜ᩸;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۘ᩸;->ۚ:Ll/ܺۜ᩸;

    .line 2147
    invoke-static {v0}, Ll/۟ܰ᩸;->ۨ(Ll/۟ܰ᩸;)Ll/ܶ᩵᩸;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-static {v0}, Ll/۟ܰ᩸;->֡(Ll/۟ܰ᩸;)Ll/᩹ܽ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۘ᩸;->۫:Ll/᩹ܽ᩵;

    .line 2148
    :cond_8
    iput-boolean v5, p0, Ll/ᩳۘ᩸;->ܳ:Z

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 3

    .line 2168
    iget-boolean v0, p0, Ll/ᩳۘ᩸;->ܳ:Z

    if-eqz v0, :cond_0

    const v0, 0x7f120a90

    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    .line 2169
    :cond_0
    iget-boolean v0, p0, Ll/ᩳۘ᩸;->ܳ:Z

    iget-object v1, p0, Ll/ᩳۘ᩸;->ܺ:Ll/۟ܰ᩸;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ᩳۘ᩸;->ۧ:Z

    if-eqz v0, :cond_1

    iget-object v0, v1, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    iget-object v2, p0, Ll/ᩳۘ᩸;->֫:Ll/ۚܰ᩸;

    iget-object v2, v2, Ll/ۚܰ᩸;->ᩳ:Ll/᩺ۜ᩸;

    if-ne v0, v2, :cond_1

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    iget-object v2, p0, Ll/ᩳۘ᩸;->֫:Ll/ۚܰ᩸;

    iget-object v2, v2, Ll/ۚܰ᩸;->ܰ:Ll/ᩳ۬᩸;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Ll/ᩳۘ᩸;->ۗ:Ll/ۡܰ᩸;

    .line 63
    iget-object v0, v0, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    .line 2170
    invoke-virtual {v1}, Ll/ۜܽ᩸;->ۤ()Ll/ۡܰ᩸;

    move-result-object v2

    .line 63
    iget-object v2, v2, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    .line 2170
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    iget-object v2, p0, Ll/ᩳۘ᩸;->ۚ:Ll/ܺۜ᩸;

    invoke-virtual {v0, v2}, Ll/᩺ۜ᩸;->᩷(Ll/ܺۜ᩸;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2171
    invoke-virtual {v1}, Ll/ۜܽ᩸;->ۚ()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 2172
    :goto_0
    iget-boolean v2, p0, Ll/ᩳۘ᩸;->᩹:Z

    if-eqz v2, :cond_2

    if-eqz v0, :cond_2

    .line 2173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3264
    iget-object v0, p0, Ll/ᩳۘ᩸;->ܽ:Ll/ܿۛ᩸;

    invoke-virtual {v0, v1}, Ll/ܿۛ᩸;->ۙ(Ll/۟ܰ᩸;)V

    .line 2175
    :cond_2
    iget-object v0, p0, Ll/ᩳۘ᩸;->ܶ:Lbin/mt/plugin/api/util/ResultCallback;

    if-eqz v0, :cond_3

    .line 2177
    invoke-interface {v0}, Lbin/mt/plugin/api/util/ResultCallback;->onSuccess()V

    :cond_3
    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 2

    .line 2183
    iget-object v0, p0, Ll/ᩳۘ᩸;->ܺ:Ll/۟ܰ᩸;

    iget-object v1, p0, Ll/ᩳۘ᩸;->ܽ:Ll/ܿۛ᩸;

    invoke-static {v0, p1, v1}, Ll/۟ܰ᩸;->ۙ(Ll/۟ܰ᩸;Ljava/lang/Exception;Ll/ܿۛ᩸;)V

    .line 2184
    iget-object v0, p0, Ll/ᩳۘ᩸;->ܶ:Lbin/mt/plugin/api/util/ResultCallback;

    if-eqz v0, :cond_0

    .line 2185
    invoke-static {p1}, Ll/᩷᩷ܺ;->᩷(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/util/ResultCallback;->onFailure(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ᩴ()V
    .locals 4

    .line 2118
    iget-object v0, p0, Ll/ᩳۘ᩸;->ܺ:Ll/۟ܰ᩸;

    invoke-static {v0}, Ll/۟ܰ᩸;->ܶ(Ll/۟ܰ᩸;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 2119
    :try_start_0
    iget-object v1, p0, Ll/ᩳۘ᩸;->ܺ:Ll/۟ܰ᩸;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ll/۟ܰ᩸;->ۙ(Ll/۟ܰ᩸;Ll/᩸᩶᩸;)Ll/ۚܰ᩸;

    move-result-object v1

    iput-object v1, p0, Ll/ᩳۘ᩸;->֫:Ll/ۚܰ᩸;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 2121
    :try_start_1
    iget-object v2, v1, Ll/ۚܰ᩸;->᩶:Ll/ܺ᩶᩸;

    iget-object v3, p0, Ll/ᩳۘ᩸;->ۗ:Ll/ۡܰ᩸;

    invoke-virtual {v2, v3}, Ll/ܺ᩶᩸;->ۙ(Ll/ۖܰ᩸;)V

    .line 2122
    iget-object v2, p0, Ll/ᩳۘ᩸;->ۗ:Ll/ۡܰ᩸;

    .line 73
    iget-object v2, v2, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v2

    .line 2122
    iput-wide v2, p0, Ll/ᩳۘ᩸;->᩻:J

    .line 2123
    iget-object v2, p0, Ll/ᩳۘ᩸;->ۗ:Ll/ۡܰ᩸;

    new-instance v3, Ll/֡ۘ᩸;

    invoke-direct {v3, p0, v2}, Ll/֡ۘ᩸;-><init>(Ll/ᩳۘ᩸;Ll/ۡܰ᩸;)V

    invoke-static {v3}, Ll/۟ܰ᩸;->ۙ(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 2151
    iget-boolean v2, p0, Ll/ᩳۘ᩸;->ܳ:Z

    if-eqz v2, :cond_1

    .line 2152
    iget-object v2, p0, Ll/ᩳۘ᩸;->۫:Ll/᩹ܽ᩵;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ll/᩹ܽ᩵;->get()Ljava/lang/Object;

    .line 2153
    :cond_0
    iget-object v2, v1, Ll/ۚܰ᩸;->᩶:Ll/ܺ᩶᩸;

    invoke-virtual {v2}, Ll/ܺ᩶᩸;->ۙ()V

    .line 2154
    new-instance v2, Ll/۟ۘ᩸;

    invoke-direct {v2, p0}, Ll/۟ۘ᩸;-><init>(Ll/ᩳۘ᩸;)V

    invoke-static {v2}, Ll/۟ܰ᩸;->ۙ(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2162
    :cond_1
    :try_start_2
    invoke-virtual {v1}, Ll/ۚܰ᩸;->close()V

    .line 2163
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return-void

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_2

    .line 2120
    :try_start_3
    invoke-virtual {v1}, Ll/ۚܰ᩸;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw v2

    :catchall_2
    move-exception v1

    .line 2163
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v1
.end method

.method public final ᩷()V
    .locals 2

    .line 2113
    iget-object v0, p0, Ll/ᩳۘ᩸;->ܺ:Ll/۟ܰ᩸;

    invoke-static {v0}, Ll/۟ܰ᩸;->ᩳ(Ll/۟ܰ᩸;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f1201dd

    goto :goto_0

    :cond_0
    const v0, 0x7f120a91

    :goto_0
    iget-object v1, p0, Ll/ᩳۘ᩸;->ܽ:Ll/ܿۛ᩸;

    invoke-virtual {p0, v1, v0}, Ll/ۖۙܺ;->ۙ(Ll/ܽ֡֫;I)V

    return-void
.end method

.method public final ᩸()V
    .locals 0

    .line 2191
    invoke-virtual {p0}, Ll/ۖۙܺ;->ۤ()V

    return-void
.end method

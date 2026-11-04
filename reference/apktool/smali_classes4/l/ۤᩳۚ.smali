.class public final Ll/ۤᩳۚ;
.super Ll/ܿ᩻ܳ;
.source "56G1"


# instance fields
.field public final ۙۙ:Ll/ܳᩳۚ;

.field public ۤۙ:Z

.field public final synthetic ۫ۙ:Ll/᩸ᩳۚ;

.field public ܳۙ:Z

.field public final ᩴۙ:Ll/᩷ᩳۚ;

.field public final ᩷ۙ:Ll/ᩳܿۚ;

.field public final ᩸ۙ:Z


# direct methods
.method public constructor <init>(Ll/᩸ᩳۚ;Ll/ܳᩳۚ;Ljava/io/InputStream;Ll/ᩳܿۚ;JZ)V
    .locals 7

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 156
    :cond_0
    new-instance v6, Ll/᩷ᩳۚ;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p3

    move-object v3, p2

    move-wide v4, p5

    invoke-direct/range {v0 .. v5}, Ll/᩷ᩳۚ;-><init>(Ll/᩸ᩳۚ;Ljava/io/InputStream;Ll/ܳᩳۚ;J)V

    move-object p3, v6

    .line 160
    :goto_0
    iput-object p1, p0, Ll/ۤᩳۚ;->۫ۙ:Ll/᩸ᩳۚ;

    .line 161
    sget-object v1, Ll/᩶᩻ܳ;->ۚۙ:Ll/᩶᩻ܳ;

    const-string v2, "application/octet-stream"

    move-object v0, p0

    move-object v3, p3

    move-wide v4, p5

    invoke-direct/range {v0 .. v5}, Ll/ܿ᩻ܳ;-><init>(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/io/InputStream;J)V

    .line 162
    iput-object p2, p0, Ll/ۤᩳۚ;->ۙۙ:Ll/ܳᩳۚ;

    .line 163
    iput-object p4, p0, Ll/ۤᩳۚ;->᩷ۙ:Ll/ᩳܿۚ;

    .line 164
    iput-object p3, p0, Ll/ۤᩳۚ;->ᩴۙ:Ll/᩷ᩳۚ;

    .line 165
    iput-boolean p7, p0, Ll/ۤᩳۚ;->᩸ۙ:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 7

    .line 180
    iget-object v0, p0, Ll/ۤᩳۚ;->᩷ۙ:Ll/ᩳܿۚ;

    const-string v1, "The download response was closed before completion."

    const-string v2, "TRANSFER_SEND_FAILED"

    iget-object v3, p0, Ll/ۤᩳۚ;->ۙۙ:Ll/ܳᩳۚ;

    iget-object v4, p0, Ll/ۤᩳۚ;->۫ۙ:Ll/᩸ᩳۚ;

    iget-boolean v5, p0, Ll/ۤᩳۚ;->ܳۙ:Z

    if-eqz v5, :cond_0

    return-void

    :cond_0
    const/4 v5, 0x1

    .line 181
    iput-boolean v5, p0, Ll/ۤᩳۚ;->ܳۙ:Z

    .line 183
    :try_start_0
    invoke-super {p0}, Ll/ܿ᩻ܳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    iget-boolean v5, p0, Ll/ۤᩳۚ;->ۤۙ:Z

    if-nez v5, :cond_1

    invoke-static {v4}, Ll/᩸ᩳۚ;->ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;

    move-result-object v5

    invoke-static {v2, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v1

    invoke-virtual {v5, v3, v1}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;Ll/ۢܳۚ;)V

    .line 187
    :cond_1
    invoke-virtual {v0}, Ll/ᩳܿۚ;->close()V

    .line 188
    invoke-static {v4}, Ll/᩸ᩳۚ;->ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/ۚᩳۚ;->᩷(Ll/ܳᩳۚ;)V

    return-void

    :catchall_0
    move-exception v5

    .line 185
    iget-boolean v6, p0, Ll/ۤᩳۚ;->ۤۙ:Z

    if-nez v6, :cond_2

    invoke-static {v4}, Ll/᩸ᩳۚ;->ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;

    move-result-object v6

    invoke-static {v2, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v1

    invoke-virtual {v6, v3, v1}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;Ll/ۢܳۚ;)V

    .line 187
    :cond_2
    invoke-virtual {v0}, Ll/ᩳܿۚ;->close()V

    .line 188
    invoke-static {v4}, Ll/᩸ᩳۚ;->ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/ۚᩳۚ;->᩷(Ll/ܳᩳۚ;)V

    .line 189
    throw v5
.end method

.method public final ۙ(Z)V
    .locals 4

    const/4 v0, 0x1

    .line 170
    iput-boolean v0, p0, Ll/ۤᩳۚ;->ۤۙ:Z

    if-nez p1, :cond_0

    .line 171
    iget-object p1, p0, Ll/ۤᩳۚ;->۫ۙ:Ll/᩸ᩳۚ;

    invoke-static {p1}, Ll/᩸ᩳۚ;->ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;

    move-result-object p1

    iget-object v0, p0, Ll/ۤᩳۚ;->ۙۙ:Ll/ܳᩳۚ;

    const-string v1, "TRANSFER_SEND_FAILED"

    const-string v2, "The download response could not be completely sent."

    invoke-static {v1, v2}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;Ll/ۢܳۚ;)V

    goto :goto_0

    .line 173
    :cond_0
    iget-boolean p1, p0, Ll/ۤᩳۚ;->᩸ۙ:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/ۤᩳۚ;->۫ۙ:Ll/᩸ᩳۚ;

    invoke-static {p1}, Ll/᩸ᩳۚ;->ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;

    move-result-object p1

    iget-object v0, p0, Ll/ۤᩳۚ;->ۙۙ:Ll/ܳᩳۚ;

    iget-object v1, p0, Ll/ۤᩳۚ;->ᩴۙ:Ll/᩷ᩳۚ;

    iget-object v1, v1, Ll/᩷ᩳۚ;->᩶:Ljava/security/MessageDigest;

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    invoke-static {v1}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V

    goto :goto_0

    .line 174
    :cond_1
    iget-object p1, p0, Ll/ۤᩳۚ;->۫ۙ:Ll/᩸ᩳۚ;

    invoke-static {p1}, Ll/᩸ᩳۚ;->ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;

    move-result-object p1

    iget-object v1, p0, Ll/ۤᩳۚ;->ۙۙ:Ll/ܳᩳۚ;

    move-object v0, p1

    .line 0
    monitor-enter v0

    .line 227
    :try_start_0
    iget-object v2, v1, Ll/ܳᩳۚ;->ۙ:Ljava/lang/String;

    if-eqz v2, :cond_2

    const-string v3, "File transfer was interrupted."

    invoke-static {v2, v3}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;Ll/ۢܳۚ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 228
    :cond_2
    monitor-exit v0

    .line 175
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Ll/ۤᩳۚ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception p1

    .line 228
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

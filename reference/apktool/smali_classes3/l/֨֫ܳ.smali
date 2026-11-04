.class public final Ll/֨֫ܳ;
.super Ljava/lang/Object;
.source "G72T"

# interfaces
.implements Ll/۫۬᩷;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ֡:I

.field public final ֨:Z

.field public final ۖ:Ljava/lang/Object;

.field public final ۜ:Ljava/lang/Object;

.field public final ۟:Ll/᩷ۨᩴ;

.field public final ۠:Ljava/lang/String;

.field public final ۡ:Ljava/util/HashSet;

.field public final ۢ:Z

.field public final ۬:Ll/۟ۘܳ;

.field public final ܰ:Ll/ۘۖ֫;

.field public ܿ:Z

.field public final ᩳ:Ljava/lang/String;

.field public final ᩶:Z


# direct methods
.method public constructor <init>(Ll/ۘۖ֫;Ll/۟ۘܳ;Ljava/lang/String;ZLl/᩷ۨᩴ;Ljava/lang/String;Z)V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/֨֫ܳ;->ۜ:Ljava/lang/Object;

    .line 41
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/֨֫ܳ;->ۡ:Ljava/util/HashSet;

    .line 65
    iput-object p1, p0, Ll/֨֫ܳ;->ܰ:Ll/ۘۖ֫;

    .line 66
    iput-object p2, p0, Ll/֨֫ܳ;->۬:Ll/۟ۘܳ;

    .line 68
    instance-of p1, p2, Ll/ܺᩴ۫;

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    iput-object p1, p0, Ll/֨֫ܳ;->ۖ:Ljava/lang/Object;

    .line 69
    iput-object p3, p0, Ll/֨֫ܳ;->۠:Ljava/lang/String;

    .line 70
    iput-boolean p4, p0, Ll/֨֫ܳ;->ۢ:Z

    .line 71
    instance-of p1, p2, Ll/ᩳۛ۫;

    iput-boolean p1, p0, Ll/֨֫ܳ;->֨:Z

    .line 72
    iput-object p5, p0, Ll/֨֫ܳ;->۟:Ll/᩷ۨᩴ;

    .line 73
    iput-object p6, p0, Ll/֨֫ܳ;->ᩳ:Ljava/lang/String;

    .line 74
    iput-boolean p7, p0, Ll/֨֫ܳ;->᩶:Z

    return-void
.end method

.method private ۙ(ILjava/lang/String;Z)Landroid/webkit/WebResourceResponse;
    .locals 8

    .line 239
    iget-boolean v0, p0, Ll/֨֫ܳ;->֨:Z

    if-eqz v0, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    .line 240
    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "<!doctype html><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width\"><p>"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const v0, 0x7f1208d0

    .line 242
    invoke-static {v0}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->escapeHtml(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "</p><p><a href=\"\">"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x7f1207b2

    .line 244
    invoke-static {v0}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->escapeHtml(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "</a></p>"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 245
    new-instance v7, Landroid/webkit/WebResourceResponse;

    .line 246
    invoke-static {}, Ll/֨֫ܳ;->᩷()Ljava/util/HashMap;

    move-result-object v5

    new-instance v6, Ljava/io/ByteArrayInputStream;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p3, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p3

    invoke-direct {v6, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const-string v1, "text/html"

    const-string v2, "UTF-8"

    move-object v0, v7

    move v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    return-object v7

    .line 239
    :cond_1
    :goto_0
    invoke-static {p1, p2}, Ll/֨֫ܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method private ۙ(Ljava/lang/String;Ljava/lang/String;Ll/᩹֫ܳ;I)Landroid/webkit/WebResourceResponse;
    .locals 8

    .line 210
    iget-object v0, p0, Ll/֨֫ܳ;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 211
    :try_start_0
    iget-boolean v1, p0, Ll/֨֫ܳ;->ܿ:Z

    if-nez v1, :cond_0

    iget v1, p0, Ll/֨֫ܳ;->֡:I

    if-ne p4, v1, :cond_0

    .line 212
    iget-object p4, p0, Ll/֨֫ܳ;->ۡ:Ljava/util/HashSet;

    invoke-virtual {p4, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 213
    new-instance p4, Landroid/webkit/WebResourceResponse;

    const-string v5, "OK"

    .line 214
    invoke-static {}, Ll/֨֫ܳ;->᩷()Ljava/util/HashMap;

    move-result-object v6

    const/16 v4, 0xc8

    move-object v1, p4

    move-object v2, p1

    move-object v3, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    monitor-exit v0

    return-object p4

    .line 216
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    invoke-virtual {p3}, Ll/᩹֫ܳ;->close()V

    const/16 p1, 0x194

    const-string p2, "Not Found"

    .line 218
    invoke-static {p1, p2}, Ll/֨֫ܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 216
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ۙ(Ljava/lang/String;Z)Landroid/webkit/WebResourceResponse;
    .locals 7

    .line 134
    iget-object v0, p0, Ll/֨֫ܳ;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 135
    :try_start_0
    iget v2, p0, Ll/֨֫ܳ;->֡:I

    .line 136
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 137
    invoke-direct {p0, v2}, Ll/֨֫ܳ;->ۙ(I)Z

    move-result v0

    const/16 v3, 0x194

    if-nez v0, :cond_0

    const-string p1, "Not Found"

    .line 138
    invoke-static {v3, p1}, Ll/֨֫ܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 140
    :cond_0
    invoke-static {p1}, Ll/ܿ֫ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 141
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "/"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 143
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "index.html"

    goto :goto_0

    :cond_2
    const-string p1, "/index.html"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v0, p1

    :cond_3
    move-object p1, v0

    .line 145
    iget-object v0, p0, Ll/֨֫ܳ;->۠:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ܿ֫ܳ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz p1, :cond_10

    if-nez v4, :cond_4

    goto/16 :goto_6

    .line 151
    :cond_4
    :try_start_1
    iget-object v0, p0, Ll/֨֫ܳ;->۟:Ll/᩷ۨᩴ;

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/֨֫ܳ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p1, "text/html"

    const-string v0, "UTF-8"

    .line 152
    new-instance v1, Ll/᩹֫ܳ;

    iget-object v4, p0, Ll/֨֫ܳ;->۟:Ll/᩷ۨᩴ;

    .line 153
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ۧ᩷()Ljava/io/InputStream;

    move-result-object v4

    new-instance v5, Ll/ᩳ֫ܳ;

    invoke-direct {v5, p0}, Ll/ᩳ֫ܳ;-><init>(Ll/֨֫ܳ;)V

    invoke-direct {v1, v4, v5}, Ll/᩹֫ܳ;-><init>(Ljava/io/InputStream;Ljava/util/function/Consumer;)V

    .line 152
    invoke-direct {p0, p1, v0, v1, v2}, Ll/֨֫ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/᩹֫ܳ;I)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 156
    :cond_5
    iget-boolean v0, p0, Ll/֨֫ܳ;->᩶:Z

    if-nez v0, :cond_6

    const-string p1, "Not Found"

    .line 157
    invoke-static {v3, p1}, Ll/֨֫ܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 160
    :cond_6
    iget-object v0, p0, Ll/֨֫ܳ;->ۖ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 162
    :try_start_2
    iget-object v1, p0, Ll/֨֫ܳ;->۬:Ll/۟ۘܳ;

    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 163
    :try_start_3
    invoke-direct {p0, v2}, Ll/֨֫ܳ;->ۙ(I)Z

    move-result v5

    if-nez v5, :cond_7

    const-string p1, "Not Found"

    .line 164
    invoke-static {v3, p1}, Ll/֨֫ܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-object p1

    .line 166
    :cond_7
    :try_start_5
    iget-boolean v5, p0, Ll/֨֫ܳ;->֨:Z

    if-eqz v5, :cond_8

    if-eqz p2, :cond_8

    .line 168
    iget-object v5, p0, Ll/֨֫ܳ;->۬:Ll/۟ۘܳ;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ll/۟ۘܳ;->ۙ(Z)V

    .line 170
    :cond_8
    iget-boolean v5, p0, Ll/֨֫ܳ;->ۢ:Z

    if-nez v5, :cond_a

    iget-boolean v5, p0, Ll/֨֫ܳ;->֨:Z

    if-eqz v5, :cond_9

    goto :goto_1

    .line 172
    :cond_9
    iget-object v5, p0, Ll/֨֫ܳ;->۬:Ll/۟ۘܳ;

    invoke-virtual {v5, v4}, Ll/۟ۘܳ;->ۙ(Ljava/lang/String;)Ll/ۖۗܳ;

    move-result-object v4

    goto :goto_2

    .line 171
    :cond_a
    :goto_1
    invoke-direct {p0, p1}, Ll/֨֫ܳ;->᩸(Ljava/lang/String;)Ll/ۖۗܳ;

    move-result-object v4

    :goto_2
    if-eqz v4, :cond_e

    .line 173
    move-object v5, v4

    check-cast v5, Ll/۫᩶ܳ;

    invoke-virtual {v5}, Ll/۫᩶ܳ;->֡ۙ()Z

    move-result v5

    if-nez v5, :cond_b

    goto :goto_4

    .line 176
    :cond_b
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 177
    :try_start_6
    iget-boolean v1, p0, Ll/֨֫ܳ;->֨:Z

    if-eqz v1, :cond_c

    .line 178
    new-instance v1, Ll/᩹֫ܳ;

    new-instance v5, Ll/ۢ֫ܳ;

    invoke-direct {v5, p0, v2, v4}, Ll/ۢ֫ܳ;-><init>(Ll/֨֫ܳ;ILl/ۖۗܳ;)V

    new-instance v4, Ll/ᩳ֫ܳ;

    invoke-direct {v4, p0}, Ll/ᩳ֫ܳ;-><init>(Ll/֨֫ܳ;)V

    invoke-direct {v1, v5, v4}, Ll/᩹֫ܳ;-><init>(Ll/ܶ֫ܳ;Ljava/util/function/Consumer;)V

    goto :goto_3

    .line 188
    :cond_c
    iget-object v1, p0, Ll/֨֫ܳ;->۬:Ll/۟ۘܳ;

    iget-object v5, p0, Ll/֨֫ܳ;->ܰ:Ll/ۘۖ֫;

    invoke-virtual {v1, v5, v4}, Ll/۟ۘܳ;->ۙ(Ll/ܽ֡֫;Ll/ۖۗܳ;)Ljava/io/InputStream;

    move-result-object v1

    if-nez v1, :cond_d

    const-string p1, "Not Found"

    .line 189
    invoke-static {v3, p1}, Ll/֨֫ܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 190
    :cond_d
    new-instance v4, Ll/᩹֫ܳ;

    new-instance v5, Ll/ᩳ֫ܳ;

    invoke-direct {v5, p0}, Ll/ᩳ֫ܳ;-><init>(Ll/֨֫ܳ;)V

    invoke-direct {v4, v1, v5}, Ll/᩹֫ܳ;-><init>(Ljava/io/InputStream;Ljava/util/function/Consumer;)V

    move-object v1, v4

    .line 192
    :goto_3
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 193
    :try_start_7
    invoke-static {p1}, Ll/ۧۚܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Ll/֨֫ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/᩹֫ܳ;I)Landroid/webkit/WebResourceResponse;

    move-result-object p1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_0

    return-object p1

    :cond_e
    :goto_4
    :try_start_8
    const-string p1, "Not Found"

    .line 174
    invoke-direct {p0, v3, p1, p2}, Ll/֨֫ܳ;->ۙ(ILjava/lang/String;Z)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    return-object p1

    :catchall_0
    move-exception p1

    .line 176
    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    throw p1

    :catchall_1
    move-exception p1

    .line 192
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :try_start_c
    throw p1
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_0

    .line 196
    :catch_0
    iget-boolean p1, p0, Ll/֨֫ܳ;->֨:Z

    if-eqz p1, :cond_f

    invoke-direct {p0, v2}, Ll/֨֫ܳ;->ۙ(I)Z

    move-result p1

    if-eqz p1, :cond_f

    const/16 p1, 0x1f6

    const-string v0, "Bad Gateway"

    .line 197
    invoke-direct {p0, p1, v0, p2}, Ll/֨֫ܳ;->ۙ(ILjava/lang/String;Z)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    goto :goto_5

    :cond_f
    const-string p1, "Not Found"

    .line 198
    invoke-static {v3, p1}, Ll/֨֫ܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    :goto_5
    return-object p1

    :cond_10
    :goto_6
    const-string p1, "Not Found"

    .line 147
    invoke-static {v3, p1}, Ll/֨֫ܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :catchall_2
    move-exception p1

    .line 136
    :try_start_d
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    throw p1
.end method

.method public static synthetic ۙ(Ll/֨֫ܳ;ILl/ۖۗܳ;)Ljava/io/InputStream;
    .locals 1

    .line 179
    iget-object v0, p0, Ll/֨֫ܳ;->۬:Ll/۟ۘܳ;

    monitor-enter v0

    .line 180
    :try_start_0
    invoke-direct {p0, p1}, Ll/֨֫ܳ;->ۙ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 183
    iget-object p1, p0, Ll/֨֫ܳ;->۬:Ll/۟ۘܳ;

    iget-object p0, p0, Ll/֨֫ܳ;->ܰ:Ll/ۘۖ֫;

    invoke-virtual {p1, p0, p2}, Ll/۟ۘܳ;->ۙ(Ll/ܽ֡֫;Ll/ۖۗܳ;)Ljava/io/InputStream;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 181
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "HTML preview request was cancelled"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 184
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۙ(Ll/֨֫ܳ;Ll/᩹֫ܳ;)V
    .locals 1

    .line 298
    iget-object v0, p0, Ll/֨֫ܳ;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 299
    :try_start_0
    iget-object p0, p0, Ll/֨֫ܳ;->ۡ:Ljava/util/HashSet;

    invoke-virtual {p0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 300
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private ۙ(Z)V
    .locals 3

    .line 282
    iget-object v0, p0, Ll/֨֫ܳ;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 283
    :try_start_0
    iget-boolean v1, p0, Ll/֨֫ܳ;->ܿ:Z

    or-int/2addr p1, v1

    iput-boolean p1, p0, Ll/֨֫ܳ;->ܿ:Z

    .line 284
    iget p1, p0, Ll/֨֫ܳ;->֡:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֨֫ܳ;->֡:I

    .line 285
    iget-object p1, p0, Ll/֨֫ܳ;->ۡ:Ljava/util/HashSet;

    const/4 v1, 0x0

    new-array v2, v1, [Ll/᩹֫ܳ;

    invoke-virtual {p1, v2}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/᩹֫ܳ;

    .line 286
    iget-object v2, p0, Ll/֨֫ܳ;->ۡ:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->clear()V

    .line 287
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    array-length v0, p1

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {v2}, Ll/᩹֫ܳ;->close()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 287
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ۙ(I)Z
    .locals 2

    .line 292
    iget-object v0, p0, Ll/֨֫ܳ;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 293
    :try_start_0
    iget-boolean v1, p0, Ll/֨֫ܳ;->ܿ:Z

    if-nez v1, :cond_0

    iget v1, p0, Ll/֨֫ܳ;->֡:I

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 294
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static ᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 8

    .line 254
    new-instance v7, Landroid/webkit/WebResourceResponse;

    .line 255
    invoke-static {}, Ll/֨֫ܳ;->᩷()Ljava/util/HashMap;

    move-result-object v5

    new-instance v6, Ljava/io/ByteArrayInputStream;

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-direct {v6, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const-string v1, "text/plain"

    const-string v2, "UTF-8"

    move-object v0, v7

    move v3, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    return-object v7
.end method

.method public static ᩷()Ljava/util/HashMap;
    .locals 3

    .line 262
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Cache-Control"

    const-string v2, "no-store"

    .line 263
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Referrer-Policy"

    const-string v2, "same-origin"

    .line 264
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Cross-Origin-Resource-Policy"

    .line 265
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private ᩸(Ljava/lang/String;)Ll/ۖۗܳ;
    .locals 7

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 113
    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/֨֫ܳ;->۠:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 115
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_4

    const/16 v3, 0x2f

    .line 116
    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_1

    .line 119
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    .line 121
    :cond_1
    invoke-virtual {v1, p1, v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    if-eqz v5, :cond_2

    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v5, :cond_3

    .line 124
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    add-int/lit8 v2, v4, 0x1

    goto :goto_0

    .line 228
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move-object v1, v0

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 229
    iget-object v2, p0, Ll/֨֫ܳ;->۬:Ll/۟ۘܳ;

    invoke-virtual {v2, v1}, Ll/۟ۘܳ;->ۙ(Ljava/lang/String;)Ll/ۖۗܳ;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 230
    move-object v2, v1

    check-cast v2, Ll/۫᩶ܳ;

    invoke-virtual {v2}, Ll/۫᩶ܳ;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_6
    return-object v0

    :cond_7
    return-object v1
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x1

    .line 277
    invoke-direct {p0, v0}, Ll/֨֫ܳ;->ۙ(Z)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1

    const/4 v0, 0x0

    .line 83
    invoke-direct {p0, p1, v0}, Ll/֨֫ܳ;->ۙ(Ljava/lang/String;Z)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v1, "/"

    const-string v2, "/"

    const-string v3, "/"

    .line 107
    invoke-static {p1}, Ll/ܿ֫ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    .line 109
    :cond_0
    iget-object v0, p0, Ll/֨֫ܳ;->۟:Ll/᩷ۨᩴ;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/֨֫ܳ;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v5, p0, Ll/֨֫ܳ;->۠:Ljava/lang/String;

    .line 110
    invoke-static {v5, p1}, Ll/ܿ֫ܳ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p2, "/"

    .line 111
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 112
    :cond_1
    iget-boolean v0, p0, Ll/֨֫ܳ;->᩶:Z

    if-nez v0, :cond_2

    :goto_0
    return-object v4

    .line 113
    :cond_2
    iget-object v0, p0, Ll/֨֫ܳ;->۬:Ll/۟ۘܳ;

    monitor-enter v0

    .line 114
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    move-object v5, v4

    goto :goto_1

    :cond_3
    invoke-direct {p0, p1}, Ll/֨֫ܳ;->᩸(Ljava/lang/String;)Ll/ۖۗܳ;

    move-result-object v5

    .line 116
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_4

    if-nez v5, :cond_4

    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Ll/֨֫ܳ;->᩸(Ljava/lang/String;)Ll/ۖۗܳ;

    move-result-object v5

    .line 117
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    if-nez v5, :cond_5

    .line 118
    monitor-exit v0

    return-object v4

    .line 119
    :cond_5
    check-cast v5, Ll/۫᩶ܳ;

    invoke-virtual {v5}, Ll/۫᩶ܳ;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 121
    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    const-string p1, ""

    goto :goto_2

    :cond_7
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 122
    :goto_2
    array-length v1, p2

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v1, :cond_a

    aget-object v3, p2, v2

    .line 123
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5}, Ll/֨֫ܳ;->᩸(Ljava/lang/String;)Ll/ۖۗܳ;

    move-result-object v5

    if-eqz v5, :cond_9

    .line 125
    move-object v6, v5

    check-cast v6, Ll/۫᩶ܳ;

    invoke-virtual {v6}, Ll/۫᩶ܳ;->֡ۙ()Z

    move-result v6

    if-eqz v6, :cond_9

    iget-boolean v6, p0, Ll/֨֫ܳ;->ۢ:Z

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ll/ۖۗܳ;->ۘ᩷()Ll/᩷ۨᩴ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 126
    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 128
    :cond_a
    monitor-exit v0

    return-object v4

    :catchall_0
    move-exception p1

    .line 129
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۙ()V
    .locals 1

    const/4 v0, 0x0

    .line 271
    invoke-direct {p0, v0}, Ll/֨֫ܳ;->ۙ(Z)V

    return-void
.end method

.method public final ᩷(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1

    .line 89
    iget-boolean v0, p0, Ll/֨֫ܳ;->֨:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 271
    invoke-direct {p0, v0}, Ll/֨֫ܳ;->ۙ(Z)V

    :cond_0
    const/4 v0, 0x1

    .line 90
    invoke-direct {p0, p1, v0}, Ll/֨֫ܳ;->ۙ(Ljava/lang/String;Z)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 96
    iget-boolean v0, p0, Ll/֨֫ܳ;->֨:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Ll/֨֫ܳ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v1, 0x0

    .line 271
    invoke-direct {p0, v1}, Ll/֨֫ܳ;->ۙ(Z)V

    .line 98
    iget-object v0, p0, Ll/֨֫ܳ;->۬:Ll/۟ۘܳ;

    monitor-enter v0

    .line 99
    :try_start_0
    iget-object v2, p0, Ll/֨֫ܳ;->۬:Ll/۟ۘܳ;

    invoke-virtual {v2, v1}, Ll/۟ۘܳ;->ۙ(Z)V

    .line 100
    invoke-virtual {p0, p1, p2}, Ll/֨֫ܳ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 101
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

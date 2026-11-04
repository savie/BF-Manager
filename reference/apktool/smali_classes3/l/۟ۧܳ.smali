.class public final Ll/۟ۧܳ;
.super Ljava/lang/Object;
.source "56K2"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ᩳ:[Ljava/lang/String;


# instance fields
.field public final ֡:Ll/֨֫ܳ;

.field public final ۟:Ljava/lang/String;

.field public final ܰ:Landroid/content/res/AssetManager;

.field public final ܿ:Z

.field public volatile ᩶:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "index.html"

    const-string v1, "index.htm"

    const-string v2, "index.md"

    const-string v3, "index.markdown"

    .line 24
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/۟ۧܳ;->ᩳ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/֨֫ܳ;Landroid/content/res/AssetManager;Ljava/lang/String;Z)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Ll/۟ۧܳ;->֡:Ll/֨֫ܳ;

    .line 34
    iput-object p2, p0, Ll/۟ۧܳ;->ܰ:Landroid/content/res/AssetManager;

    if-nez p3, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string p1, "/"

    .line 35
    invoke-virtual {p1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/۟ۧܳ;->۟:Ljava/lang/String;

    .line 36
    iput-boolean p4, p0, Ll/۟ۧܳ;->ܿ:Z

    return-void
.end method

.method public static ۙ(I)Landroid/webkit/WebResourceResponse;
    .locals 2

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<!doctype html><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width\"><p>"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    invoke-static {p0}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/Html;->escapeHtml(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "</p>"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x194

    .line 100
    invoke-static {v0, p0}, Ll/۟ۧܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 42
    :cond_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v1, ".md"

    .line 43
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ".markdown"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 8

    .line 105
    new-instance v7, Landroid/webkit/WebResourceResponse;

    const/16 v0, 0xc8

    if-ne p0, v0, :cond_0

    const-string v0, "OK"

    goto :goto_0

    :cond_0
    const-string v0, "Not Found"

    :goto_0
    move-object v4, v0

    .line 106
    invoke-static {}, Ll/֨֫ܳ;->᩷()Ljava/util/HashMap;

    move-result-object v5

    new-instance v6, Ljava/io/ByteArrayInputStream;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 107
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-direct {v6, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const-string v1, "text/html"

    const-string v2, "UTF-8"

    move-object v0, v7

    move v3, p0

    invoke-direct/range {v0 .. v6}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    return-object v7
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x1

    .line 110
    iput-boolean v0, p0, Ll/۟ۧܳ;->᩶:Z

    return-void
.end method

.method public final ۙ(Landroid/net/Uri;)Landroid/webkit/WebResourceResponse;
    .locals 13

    const-string v0, "<!doctype html><meta charset=\"utf-8\"><script>try{var key=\'mt-markdown-position:\'+location.pathname+location.search;if(sessionStorage.getItem(\'mt-markdown-link\')===key){var next=document.createElement(\'a\');next.href="

    const v1, 0x7f1208d0

    .line 49
    :try_start_0
    iget-boolean v2, p0, Ll/۟ۧܳ;->᩶:Z
    :try_end_0
    .catch Ll/᩷᩻ܳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "Not Found"

    const/16 v4, 0x194

    if-eqz v2, :cond_0

    :try_start_1
    invoke-static {v4, v3}, Ll/֨֫ܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 50
    :cond_0
    iget-object v2, p0, Ll/۟ۧܳ;->֡:Ll/֨֫ܳ;

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ll/۟ۧܳ;->ᩳ:[Ljava/lang/String;

    invoke-virtual {v2, v5, v6}, Ll/֨֫ܳ;->᩷(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    const p1, 0x7f12059f

    .line 51
    invoke-static {p1}, Ll/۟ۧܳ;->ۙ(I)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 52
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/16 v6, 0xc8

    if-nez v5, :cond_2

    .line 54
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/net/Uri$Builder;->query(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    .line 55
    invoke-static {p1}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "<"

    const-string v3, "\\u003c"

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 57
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "+location.search;sessionStorage.setItem(\'mt-markdown-link\',\'mt-markdown-position:\'+next.pathname+next.search);}}catch(e){}location.replace("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "+location.search+location.hash)</script>"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v6, p1}, Ll/۟ۧܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 64
    :cond_2
    iget-object v0, p0, Ll/۟ۧܳ;->֡:Ll/֨֫ܳ;

    invoke-virtual {v0, v2}, Ll/֨֫ܳ;->ۙ(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    move-result v5

    if-eq v5, v6, :cond_4

    .line 66
    invoke-virtual {v0}, Landroid/webkit/WebResourceResponse;->getData()Ljava/io/InputStream;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Landroid/webkit/WebResourceResponse;->getData()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 67
    :cond_3
    invoke-static {v1}, Ll/۟ۧܳ;->ۙ(I)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 69
    :cond_4
    iget-object v5, p0, Ll/۟ۧܳ;->۟:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    invoke-static {v2}, Ll/۟ۧܳ;->ۙ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_4

    .line 70
    :cond_5
    new-instance v7, Ll/۬ۧܳ;

    invoke-direct {v7}, Ll/۬ۧܳ;-><init>()V

    .line 71
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Landroid/webkit/WebResourceResponse;->getData()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ll/᩷᩻ܳ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    const/16 v0, 0x2000

    :try_start_2
    new-array v5, v0, [B

    .line 73
    invoke-virtual {v2, v0}, Ljava/io/BufferedInputStream;->mark(I)V

    const/4 v8, 0x0

    .line 2096
    invoke-static {v2, v5, v8, v0}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/InputStream;[BII)I

    move-result v0

    .line 75
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->reset()V

    if-nez v0, :cond_6

    .line 76
    sget v0, Ll/ۖۚۤ;->ۗ:I

    goto :goto_0

    :cond_6
    invoke-static {v0, v5}, Ll/ۖۚۤ;->᩷(I[B)I

    move-result v0

    .line 77
    :goto_0
    new-instance v5, Ljava/io/InputStreamReader;

    invoke-static {v0}, Ll/ۖۚۤ;->ۙ(I)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v5, v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    const/16 v0, 0x1000

    new-array v0, v0, [C

    const/4 v9, 0x1

    .line 80
    :goto_1
    invoke-virtual {v5, v0}, Ljava/io/Reader;->read([C)I

    move-result v10

    const/4 v11, -0x1

    if-eq v10, v11, :cond_9

    .line 81
    iget-boolean v12, p0, Ll/۟ۧܳ;->᩶:Z

    if-nez v12, :cond_8

    if-eqz v9, :cond_7

    if-lez v10, :cond_7

    .line 82
    aget-char v9, v0, v8

    const v12, 0xfeff

    if-ne v9, v12, :cond_7

    const/4 v9, 0x1

    goto :goto_2

    :cond_7
    const/4 v9, 0x0

    .line 84
    :goto_2
    new-instance v12, Ljava/lang/String;

    sub-int/2addr v10, v9

    invoke-direct {v12, v0, v9, v10}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {v7, v11, v12}, Ll/۬ۧܳ;->ۙ(ILjava/lang/CharSequence;)V

    const/4 v9, 0x0

    goto :goto_1

    .line 81
    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Markdown preview closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    :cond_9
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V

    .line 87
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 88
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v8

    iget-boolean v9, p0, Ll/۟ۧܳ;->ܿ:Z

    iget-object v10, p0, Ll/۟ۧܳ;->ܰ:Landroid/content/res/AssetManager;

    const p1, 0x7f1205a4

    .line 89
    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v12

    move-object v11, v0

    .line 88
    invoke-static/range {v7 .. v12}, Ll/ۤ᩻ܳ;->ۙ(Ll/۬ۧܳ;Ljava/lang/String;ZLandroid/content/res/AssetManager;Ljava/io/Writer;Ljava/lang/String;)V

    .line 90
    iget-boolean p1, p0, Ll/۟ۧܳ;->᩶:Z

    if-eqz p1, :cond_a

    invoke-static {v4, v3}, Ll/֨֫ܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 91
    :cond_a
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v6, p1}, Ll/۟ۧܳ;->᩷(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1
    :try_end_3
    .catch Ll/᩷᩻ܳ; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 71
    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
    :try_end_5
    .catch Ll/᩷᩻ܳ; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0

    :cond_b
    :goto_4
    return-object v0

    .line 95
    :catch_0
    invoke-static {v1}, Ll/۟ۧܳ;->ۙ(I)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :catch_1
    const p1, 0x7f1205a3

    .line 93
    invoke-static {p1}, Ll/۟ۧܳ;->ۙ(I)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

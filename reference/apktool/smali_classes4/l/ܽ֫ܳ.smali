.class public final Ll/ܽ֫ܳ;
.super Ljava/lang/Object;
.source "R6JU"


# instance fields
.field public final ֫:Ll/ܺ֫ܳ;

.field public final ۙ:Ll/ۘۖ֫;

.field public ۚ:Ll/᩻֫ܳ;

.field public ۤ:Ll/᩻֫ܳ;

.field public ۧ:Ll/ᩳ۬᩷;

.field public final ۫:Ljava/util/LinkedHashSet;

.field public ܳ:Z

.field public final ܺ:Ljava/util/concurrent/ExecutorService;

.field public final ᩴ:Ll/᩶֨֫;

.field public final ᩷:Ljava/lang/String;

.field public ᩸:Z

.field public final ᩻:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(Ll/ۘۖ֫;Landroid/webkit/WebView;Ll/ܺ֫ܳ;)V
    .locals 5

    const-string v0, "*"

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    iput-object v1, p0, Ll/ܽ֫ܳ;->ܺ:Ljava/util/concurrent/ExecutorService;

    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "__mtDownload"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "-"

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܽ֫ܳ;->᩷:Ljava/lang/String;

    .line 74
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v2, p0, Ll/ܽ֫ܳ;->۫:Ljava/util/LinkedHashSet;

    .line 103
    iput-object p1, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    .line 104
    iput-object p2, p0, Ll/ܽ֫ܳ;->᩻:Landroid/webkit/WebView;

    .line 105
    iput-object p3, p0, Ll/ܽ֫ܳ;->֫:Ll/ܺ֫ܳ;

    .line 106
    invoke-virtual {p1}, Ll/ۚۤ;->ۙ()Ll/ۨ᩸;

    move-result-object p3

    new-instance v2, Ll/ۚ֫ܳ;

    invoke-direct {v2, p0}, Ll/ۚ֫ܳ;-><init>(Ll/ܽ֫ܳ;)V

    const-string v3, "html_preview_download_directory"

    invoke-static {p3, v3, v2}, Ll/ۧۡ֫;->ۙ(Ll/ۨ᩸;Ljava/lang/String;Ll/֡֨֫;)Ll/᩶֨֫;

    move-result-object p3

    iput-object p3, p0, Ll/ܽ֫ܳ;->ᩴ:Ll/᩶֨֫;

    const-string p3, "WEB_MESSAGE_LISTENER"

    .line 119
    invoke-static {p3}, Ll/ۧ᩻ܺ;->᩷(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    const-string p3, "DOCUMENT_START_SCRIPT"

    .line 120
    invoke-static {p3}, Ll/ۧ᩻ܺ;->᩷(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 121
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    const-string p3, "preview/download.js"

    invoke-virtual {p1, p3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :try_start_1
    sget-object p3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p1, p3}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p3

    const-string v2, "__MT_DOWNLOAD_BRIDGE__"

    .line 123
    invoke-virtual {p3, v2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p3

    .line 125
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    new-instance v3, Ll/ۤܿۛ;

    invoke-direct {v3, p0}, Ll/ۤܿۛ;-><init>(Ljava/lang/Object;)V

    invoke-static {p2, v1, v2, v3}, Ll/ۧ۬᩷;->ۙ(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Set;Ll/ۤܿۛ;)V

    .line 128
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 127
    invoke-static {p2, p3, v0}, Ll/ۧ۬᩷;->ۙ(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Set;)Ll/ᩳ۬᩷;

    move-result-object p2

    iput-object p2, p0, Ll/ܽ֫ܳ;->ۧ:Ll/ᩳ۬᩷;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    .line 129
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception p2

    if-eqz p1, :cond_0

    .line 121
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw p2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 130
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Missing HTML download script"

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_1
    return-void
.end method

.method public static ֫(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V
    .locals 3

    .line 265
    :try_start_0
    invoke-static {p1}, Ll/ܽ֫ܳ;->᩷(Ll/᩻֫ܳ;)V

    .line 266
    new-instance v0, Ll/ۚۚܳ;

    iget-object v1, p1, Ll/᩻֫ܳ;->ᩴ:Ljava/lang/String;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    iget-object v2, p1, Ll/᩻֫ܳ;->ܺ:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ll/ۚۚܳ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V

    iput-object v0, p1, Ll/᩻֫ܳ;->۫:Ll/ۚۚܳ;

    .line 267
    invoke-static {p1}, Ll/ܽ֫ܳ;->᩷(Ll/᩻֫ܳ;)V

    .line 268
    iget-boolean v0, p1, Ll/᩻֫ܳ;->֫:Z

    if-eqz v0, :cond_0

    .line 269
    new-instance v0, Ll/۠ۚܳ;

    invoke-direct {v0, p0, p1}, Ll/۠ۚܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    .line 273
    :cond_0
    invoke-direct {p0, p1}, Ll/ܽ֫ܳ;->᩸(Ll/᩻֫ܳ;)V

    .line 323
    invoke-static {p1}, Ll/ܽ֫ܳ;->᩷(Ll/᩻֫ܳ;)V

    .line 324
    iget-object v0, p1, Ll/᩻֫ܳ;->۫:Ll/ۚۚܳ;

    invoke-virtual {v0}, Ll/ۚۚܳ;->᩷()Ll/᩷ۨᩴ;

    move-result-object v0

    .line 325
    new-instance v1, Ll/ۢۚܳ;

    invoke-direct {v1, p0, p1, v0}, Ll/ۢۚܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;Ll/᩷ۨᩴ;)V

    invoke-static {v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 276
    :catch_0
    invoke-direct {p0, p1}, Ll/ܽ֫ܳ;->ۤ(Ll/᩻֫ܳ;)V

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 544
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 547
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_6

    .line 548
    invoke-virtual {p0, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    .line 549
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    add-int/2addr v1, v4

    const/16 v4, 0x20

    if-lt v3, v4, :cond_0

    const/16 v4, 0x7f

    if-eq v3, v4, :cond_0

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_0

    const/16 v4, 0x5c

    if-ne v3, v4, :cond_1

    :cond_0
    const/16 v3, 0x5f

    :cond_1
    const/16 v4, 0x80

    if-ge v3, v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/16 v4, 0x800

    if-ge v3, v4, :cond_3

    const/4 v4, 0x2

    goto :goto_1

    :cond_3
    const/high16 v4, 0x10000

    if-ge v3, v4, :cond_4

    const/4 v4, 0x3

    goto :goto_1

    :cond_4
    const/4 v4, 0x4

    :goto_1
    add-int/2addr v2, v4

    const/16 v4, 0xb4

    if-le v2, v4, :cond_5

    goto :goto_2

    .line 553
    :cond_5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 555
    :cond_6
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v0, "."

    .line 556
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, ".."

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    return-object p0

    :cond_8
    :goto_3
    const-string p0, ""

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "data:"

    .line 538
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "download"

    if-nez v0, :cond_0

    const-string v0, "blob:"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-object p0, v1

    :cond_1
    invoke-static {p0, p1, p2}, Ll/ۙ۬᩷;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܽ֫ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 540
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    return-object v1

    :cond_2
    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/ܽ֫ܳ;)Ll/᩻֫ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;

    return-object p0
.end method

.method public static synthetic ۙ(Ll/ܽ֫ܳ;Ljava/lang/String;)V
    .locals 0

    .line 479
    iget-object p0, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    invoke-static {p0, p1}, Lbin/mt/plus/Main;->᩷(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܽ֫ܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 7

    .line 145
    invoke-direct {p0}, Ll/ܽ֫ܳ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "false"

    invoke-virtual {v0, p8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p8

    if-eqz p8, :cond_0

    iget-object p8, p0, Ll/ܽ֫ܳ;->᩻:Landroid/webkit/WebView;

    invoke-virtual {p8}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p8

    invoke-static {p1, p8}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-wide v5, p6

    .line 146
    invoke-direct/range {v0 .. v6}, Ll/ܽ֫ܳ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/ܽ֫ܳ;Ll/᩷۬᩷;Landroid/net/Uri;ZLl/۟۬᩷;)V
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v8, p4

    .line 349
    iget-boolean v0, v7, Ll/ܽ֫ܳ;->᩸:Z

    if-nez v0, :cond_1a

    if-eqz p3, :cond_1a

    iget-object v0, v7, Ll/ܽ֫ܳ;->᩻:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 527
    :cond_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "http"

    .line 528
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "https"

    if-nez v1, :cond_1

    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_5

    .line 529
    :cond_1
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1a

    .line 530
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1a

    .line 534
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getPort()I

    move-result v1

    const/16 v3, 0x1bb

    const/4 v4, -0x1

    const/16 v5, 0x50

    if-eq v1, v4, :cond_2

    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getPort()I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x1bb

    goto :goto_0

    :cond_3
    const/16 v1, 0x50

    :goto_0
    invoke-virtual {v0}, Landroid/net/Uri;->getPort()I

    move-result v6

    if-eq v6, v4, :cond_4

    invoke-virtual {v0}, Landroid/net/Uri;->getPort()I

    move-result v3

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    const/16 v3, 0x50

    :goto_1
    if-ne v1, v3, :cond_1a

    .line 350
    invoke-virtual/range {p1 .. p1}, Ll/᩷۬᩷;->᩷()I

    move-result v0

    if-eqz v0, :cond_6

    goto/16 :goto_5

    .line 351
    :cond_6
    invoke-virtual/range {p1 .. p1}, Ll/᩷۬᩷;->ۙ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 352
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const v2, 0x18000

    if-le v1, v2, :cond_7

    goto/16 :goto_5

    :cond_7
    const/4 v9, 0x1

    .line 354
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "type"

    .line 355
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "id"

    .line 356
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 357
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v5, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v2, "offer"

    .line 358
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const v3, 0x7f120a1d

    if-eqz v2, :cond_12

    .line 359
    invoke-direct/range {p0 .. p0}, Ll/ܽ֫ܳ;->ۤ()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v11, "cancel"

    if-nez v0, :cond_9

    :try_start_1
    invoke-direct {v7, v8, v10, v11}, Ll/ܽ֫ܳ;->ۙ(Ll/᩷ۢܺ;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catch_0
    nop

    goto/16 :goto_4

    :cond_9
    const-string v0, "url"

    .line 360
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v0, "blob:"

    .line 361
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v13, 0x0

    const-string v2, "data:"

    if-nez v0, :cond_b

    :try_start_2
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_2

    :cond_a
    const/4 v0, 0x0

    const/4 v14, 0x0

    goto :goto_3

    :cond_b
    :goto_2
    const/4 v0, 0x1

    const/4 v14, 0x1

    :goto_3
    if-nez v14, :cond_c

    .line 362
    invoke-static {v12}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v7, v0}, Ll/ܽ֫ܳ;->ۙ(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_c

    invoke-direct {v7, v8, v10, v11}, Ll/ܽ֫ܳ;->ۙ(Ll/᩷ۢܺ;Ljava/lang/String;Ljava/lang/String;)V

    const v0, 0x7f120483

    .line 177
    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    :cond_c
    const-string v0, "size"

    .line 363
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    if-eqz v14, :cond_e

    const-wide/16 v15, 0x0

    cmp-long v0, v5, v15

    if-ltz v0, :cond_d

    .line 364
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const-wide/32 v15, 0x1000000

    cmp-long v0, v5, v15

    if-lez v0, :cond_e

    .line 365
    :cond_d
    invoke-direct {v7, v8, v10, v11}, Ll/ܽ֫ܳ;->ۙ(Ll/᩷ۢܺ;Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    invoke-static {v3}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    :cond_e
    const-string v0, "name"

    .line 369
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܽ֫ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 370
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_f

    const-string v0, "mime"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v12, v1, v0}, Ll/ܽ֫ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_f
    move-object v3, v0

    .line 371
    new-instance v15, Ll/᩻֫ܳ;

    iget-object v0, v7, Ll/ܽ֫ܳ;->᩻:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v4

    move-object v0, v15

    move-object/from16 v1, p0

    move-object v2, v12

    invoke-direct/range {v0 .. v6}, Ll/᩻֫ܳ;-><init>(Ll/ܽ֫ܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 372
    iput-object v10, v15, Ll/᩻֫ܳ;->᩻:Ljava/lang/String;

    .line 373
    iput-object v8, v15, Ll/᩻֫ܳ;->᩺:Ll/᩷ۢܺ;

    .line 374
    iput-boolean v14, v15, Ll/᩻֫ܳ;->֫:Z

    if-nez v14, :cond_10

    .line 375
    iget-object v0, v7, Ll/ܽ֫ܳ;->֫:Ll/ܺ֫ܳ;

    invoke-static {v12}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܺ֫ܳ;->᩷(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_11

    :cond_10
    const/4 v13, 0x1

    :cond_11
    iput-boolean v13, v15, Ll/᩻֫ܳ;->ܽ:Z

    .line 376
    invoke-direct {v7, v15}, Ll/ܽ֫ܳ;->ᩴ(Ll/᩻֫ܳ;)V

    if-nez v14, :cond_1a

    .line 488
    iget-object v0, v15, Ll/᩻֫ܳ;->᩺:Ll/᩷ۢܺ;

    if-eqz v0, :cond_1a

    iget-object v1, v15, Ll/᩻֫ܳ;->᩻:Ljava/lang/String;

    invoke-direct {v7, v0, v1, v11}, Ll/ܽ֫ܳ;->ۙ(Ll/᩷ۢܺ;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_12
    const-string v2, "large"

    .line 380
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v0, v7, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;

    if-nez v0, :cond_1a

    invoke-static {v3}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 381
    :cond_13
    iget-object v2, v7, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const-string v3, "error"

    if-nez v2, :cond_14

    .line 382
    :try_start_3
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    const v0, 0x7f1202d0

    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    :cond_14
    if-eqz v2, :cond_1a

    .line 383
    iget-boolean v4, v2, Ll/᩻֫ܳ;->֫:Z

    if-eqz v4, :cond_1a

    iget-object v4, v2, Ll/᩻֫ܳ;->᩻:Ljava/lang/String;

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1a

    iget-object v4, v2, Ll/᩻֫ܳ;->᩺:Ll/᩷ۢܺ;

    if-ne v8, v4, :cond_1a

    iget-boolean v4, v2, Ll/᩻֫ܳ;->ۙ:Z

    if-eqz v4, :cond_15

    goto :goto_5

    .line 384
    :cond_15
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    .line 427
    iput-boolean v9, v2, Ll/᩻֫ܳ;->ۘ:Z

    invoke-direct {v7, v2}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;)V

    return-void

    .line 385
    :cond_16
    iget-boolean v3, v2, Ll/᩻֫ܳ;->֡:Z

    if-eqz v3, :cond_1a

    iget-boolean v3, v2, Ll/᩻֫ܳ;->᩷:Z

    if-nez v3, :cond_1a

    const-string v3, "seq"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    iget v4, v2, Ll/᩻֫ܳ;->ܰ:I

    if-eq v3, v4, :cond_17

    goto :goto_5

    .line 386
    :cond_17
    iput-boolean v9, v2, Ll/᩻֫ܳ;->᩷:Z

    .line 387
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object v3

    iget-object v4, v2, Ll/᩻֫ܳ;->ᩳ:Ll/֫֫ܳ;

    invoke-virtual {v3, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-string v3, "chunk"

    .line 388
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    const-string v0, "data"

    .line 389
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 390
    iget v1, v2, Ll/᩻֫ܳ;->ܰ:I

    add-int/2addr v1, v9

    iput v1, v2, Ll/᩻֫ܳ;->ܰ:I

    .line 391
    iget-object v1, v7, Ll/ܽ֫ܳ;->ܺ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/ۤ֫ܳ;

    invoke-direct {v3, v7, v2, v0}, Ll/ۤ֫ܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_18
    const-string v1, "end"

    .line 409
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 410
    iget-object v0, v7, Ll/ܽ֫ܳ;->ܺ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/᩸֫ܳ;

    invoke-direct {v1, v7, v2}, Ll/᩸֫ܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 427
    :cond_19
    iput-boolean v9, v2, Ll/᩻֫ܳ;->ۘ:Z

    invoke-direct {v7, v2}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    .line 418
    :goto_4
    iget-object v0, v7, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;

    if-eqz v0, :cond_1a

    iget-boolean v1, v0, Ll/᩻֫ܳ;->֫:Z

    if-eqz v1, :cond_1a

    .line 427
    iput-boolean v9, v0, Ll/᩻֫ܳ;->ۘ:Z

    invoke-direct {v7, v0}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;)V

    :cond_1a
    :goto_5
    return-void
.end method

.method public static ۙ(Ll/ܽ֫ܳ;Ll/᩹ۖ᩸;Ll/᩻֫ܳ;Ll/֫ۖ᩸;Ll/֫ۖ᩸;Ll/۠ۖۧ;)V
    .locals 8

    .line 209
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 210
    iget-object v1, p2, Ll/᩻֫ܳ;->ܳ:Ll/᩹ۖ᩸;

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 211
    invoke-static {v0}, Ll/ۚۚܳ;->ۙ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 212
    iget-object p0, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    const p2, 0x7f1203b0

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 213
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void

    :cond_0
    const-string p1, "/"

    .line 241
    invoke-virtual {v1, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    const/4 v2, 0x0

    .line 242
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 243
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-lt v3, v4, :cond_4

    const/16 v4, 0x7f

    if-ne v3, v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    new-array p3, p3, [Ljava/lang/String;

    .line 246
    invoke-static {v1, p3}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p3

    .line 247
    invoke-virtual {p3}, Ll/᩷ۨᩴ;->֨()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p3}, Ll/᩷ۨᩴ;->ۛۙ()Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_2

    .line 217
    :cond_4
    :goto_1
    iget-object p0, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    const p1, 0x7f12047e

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p4, p0}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 218
    iget-object p0, p2, Ll/᩻֫ܳ;->ܳ:Ll/᩹ۖ᩸;

    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 221
    :cond_5
    :goto_2
    iput-object v0, p2, Ll/᩻֫ܳ;->ܺ:Ljava/lang/String;

    .line 222
    iput-object v1, p2, Ll/᩻֫ܳ;->ᩴ:Ljava/lang/String;

    .line 224
    sget-object p3, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    invoke-interface {p3}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p3

    const-string p4, "hpdd"

    invoke-interface {p3, p4, v1}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p3

    invoke-interface {p3}, Ll/ᩳ֫ܺ;->apply()V

    const/4 p3, 0x1

    .line 225
    iput-boolean p3, p2, Ll/᩻֫ܳ;->֡:Z

    .line 226
    invoke-virtual {p5}, Ll/۠ۖۧ;->dismiss()V

    .line 251
    iget-object p3, p2, Ll/᩻֫ܳ;->ᩴ:Ljava/lang/String;

    invoke-static {p3}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_7

    .line 252
    iget-object p3, p2, Ll/᩻֫ܳ;->ᩴ:Ljava/lang/String;

    invoke-static {p3}, Ll/ܰۨᩴ;->᩸(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_6

    goto :goto_3

    :cond_6
    iget-object p1, p2, Ll/᩻֫ܳ;->ᩴ:Ljava/lang/String;

    :goto_3
    move-object p3, p1

    .line 253
    :cond_7
    new-instance p1, Ll/۫֨ᩴ;

    iget-object p4, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    invoke-direct {p1, p4}, Ll/۫֨ᩴ;-><init>(Ll/ܽ֡֫;)V

    const p4, 0x7f1202d4

    .line 123
    invoke-static {p4}, Ll/᩶᩷ۧ;->ۤ(I)Ljava/lang/CharSequence;

    move-result-object p4

    invoke-virtual {p1, p4}, Ll/۫֨ᩴ;->ᩴ(Ljava/lang/CharSequence;)V

    .line 255
    invoke-virtual {p1, p3}, Ll/۫֨ᩴ;->ܳ(Ljava/lang/CharSequence;)V

    new-instance p3, Ll/֨ۚܳ;

    invoke-direct {p3, p0, p2}, Ll/֨ۚܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V

    .line 256
    invoke-virtual {p1, p3}, Ll/۫֨ᩴ;->ۙ(Ljava/lang/Runnable;)V

    new-instance p3, Ll/ۡۚܳ;

    invoke-direct {p3, p2}, Ll/ۡۚܳ;-><init>(Ll/᩻֫ܳ;)V

    const p4, 0x7f120161

    .line 257
    invoke-virtual {p1, p4, p3}, Ll/۫֨ᩴ;->ۙ(ILandroid/view/View$OnClickListener;)V

    .line 258
    invoke-virtual {p1}, Ll/۫֨ᩴ;->ܳ()V

    iput-object p1, p2, Ll/᩻֫ܳ;->ۗ:Ll/۫֨ᩴ;

    .line 259
    iget-object p3, p2, Ll/᩻֫ܳ;->ܺ:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ll/۫֨ᩴ;->ۤ(Ljava/lang/CharSequence;)V

    .line 261
    iget-wide p3, p2, Ll/᩻֫ܳ;->᩶:J

    const-wide/16 v0, 0x0

    cmp-long p1, p3, v0

    if-ltz p1, :cond_8

    iget-wide v4, p2, Ll/᩻֫ܳ;->᩶:J

    const-wide/16 v6, 0x0

    const-wide/16 v2, 0x0

    move-object v0, p0

    move-object v1, p2

    invoke-direct/range {v0 .. v7}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;JJJ)V

    .line 262
    :cond_8
    iget-object p1, p2, Ll/᩻֫ܳ;->ܿ:Ll/۫ۛᩴ;

    invoke-virtual {p1}, Ll/۫ۛᩴ;->᩷()V

    .line 263
    iget-object p1, p0, Ll/ܽ֫ܳ;->ܺ:Ljava/util/concurrent/ExecutorService;

    new-instance p3, Ll/ۖۚܳ;

    invoke-direct {p3, p0, p2}, Ll/ۖۚܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ۙ(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V
    .locals 3

    .line 401
    iget-object v0, p0, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;

    if-ne v0, p1, :cond_1

    iget-boolean v0, p1, Ll/᩻֫ܳ;->ۙ:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 402
    iput-boolean v0, p1, Ll/᩻֫ܳ;->᩷:Z

    .line 488
    iget-object v0, p1, Ll/᩻֫ܳ;->᩺:Ll/᩷ۢܺ;

    if-eqz v0, :cond_0

    iget-object v1, p1, Ll/᩻֫ܳ;->᩻:Ljava/lang/String;

    const-string v2, "read"

    invoke-direct {p0, v0, v1, v2}, Ll/ܽ֫ܳ;->ۙ(Ll/᩷ۢܺ;Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    :cond_0
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object p0

    iget-object v0, p1, Ll/᩻֫ܳ;->ᩳ:Ll/֫֫ܳ;

    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 424
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object p0

    iget-object p1, p1, Ll/᩻֫ܳ;->ᩳ:Ll/֫֫ܳ;

    const-wide/16 v0, 0x7530

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;JJJ)V
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p7}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;JJJ)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;Ljava/lang/String;)V
    .locals 6

    .line 393
    :try_start_0
    invoke-static {p1}, Ll/ܽ֫ܳ;->᩷(Ll/᩻֫ܳ;)V

    const/4 v0, 0x2

    .line 394
    invoke-static {p2, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p2

    .line 395
    array-length v0, p2

    if-eqz v0, :cond_0

    array-length v0, p2

    const v1, 0xc000

    if-gt v0, v1, :cond_0

    array-length v0, p2

    int-to-long v0, v0

    iget-wide v2, p1, Ll/᩻֫ܳ;->᩶:J

    iget-object v4, p1, Ll/᩻֫ܳ;->ۛ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    sub-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 397
    iget-object v0, p1, Ll/᩻֫ܳ;->۫:Ll/ۚۚܳ;

    array-length v1, p2

    invoke-virtual {v0, v1, p2}, Ll/ۚۚܳ;->ۙ(I[B)V

    .line 398
    iget-object v0, p1, Ll/᩻֫ܳ;->ۛ:Ljava/util/concurrent/atomic/AtomicLong;

    array-length v1, p2

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 399
    array-length p2, p2

    invoke-static {p1, p2}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;I)V

    .line 400
    new-instance p2, Ll/ᩳۚܳ;

    invoke-direct {p2, p0, p1}, Ll/ᩳۚܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V

    invoke-static {p2}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    .line 396
    :cond_0
    new-instance p2, Ljava/io/IOException;

    const-string v0, "Invalid download chunk"

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 407
    :catch_0
    invoke-direct {p0, p1}, Ll/ܽ֫ܳ;->ۤ(Ll/᩻֫ܳ;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;Ll/᩷ۨᩴ;)V
    .locals 1

    .line 325
    invoke-virtual {p2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private ۙ(Ll/᩷ۢܺ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 493
    iget-boolean v0, p0, Ll/ܽ֫ܳ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "WEB_MESSAGE_LISTENER"

    .line 494
    invoke-static {v0}, Ll/ۧ᩻ܺ;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 501
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{\"id\":"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ",\"type\":"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "}"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 495
    invoke-virtual {p1, p2}, Ll/᩷ۢܺ;->ۙ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method private ۙ(Ll/᩻֫ܳ;)V
    .locals 4

    .line 430
    iget-boolean v0, p1, Ll/᩻֫ܳ;->ۙ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 431
    iput-boolean v0, p1, Ll/᩻֫ܳ;->ۙ:Z

    .line 432
    iget-object v0, p1, Ll/᩻֫ܳ;->ܿ:Ll/۫ۛᩴ;

    invoke-virtual {v0}, Ll/۫ۛᩴ;->ۤ()V

    .line 433
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p1, Ll/᩻֫ܳ;->ۨ:Ll/ۧ֫ܳ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 434
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p1, Ll/᩻֫ܳ;->ᩳ:Ll/֫֫ܳ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 488
    iget-object v0, p1, Ll/᩻֫ܳ;->᩺:Ll/᩷ۢܺ;

    if-eqz v0, :cond_1

    iget-object v1, p1, Ll/᩻֫ܳ;->᩻:Ljava/lang/String;

    const-string v2, "cancel"

    invoke-direct {p0, v0, v1, v2}, Ll/ܽ֫ܳ;->ۙ(Ll/᩷ۢܺ;Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    :cond_1
    iget-object v0, p1, Ll/᩻֫ܳ;->᩸:Ll/۠ۖۧ;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    .line 437
    :cond_2
    iget-object v0, p1, Ll/᩻֫ܳ;->ۗ:Ll/۫֨ᩴ;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ll/۫֨ᩴ;->᩷()V

    .line 438
    :cond_3
    iget-object v0, p1, Ll/᩻֫ܳ;->ۧ:Ll/֫ۚܳ;

    if-eqz v0, :cond_4

    .line 440
    invoke-virtual {v0}, Ll/֫ۚܳ;->ۙ()V

    .line 441
    :cond_4
    iget-object v0, p1, Ll/᩻֫ܳ;->᩹:Ljava/io/InputStream;

    if-eqz v0, :cond_5

    .line 442
    sget-object v1, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v2, Ll/ۚۛܳ;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v0}, Ll/ۚۛܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 445
    :cond_5
    iget-object v0, p0, Ll/ܽ֫ܳ;->ܺ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/۬ۚܳ;

    invoke-direct {v1, p0, p1}, Ll/۬ۚܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ۙ(Ll/᩻֫ܳ;I)V
    .locals 3

    .line 329
    iget-object v0, p0, Ll/᩻֫ܳ;->ܿ:Ll/۫ۛᩴ;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ll/۫ۛᩴ;->ۙ(J)V

    .line 330
    iget-object p1, p0, Ll/᩻֫ܳ;->ܿ:Ll/۫ۛᩴ;

    invoke-virtual {p1}, Ll/۫ۛᩴ;->ۙ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩻֫ܳ;->ۤ:J

    .line 332
    iget-object p1, p0, Ll/᩻֫ܳ;->᩵:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 333
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object p1

    iget-object p0, p0, Ll/᩻֫ܳ;->ۨ:Ll/ۧ֫ܳ;

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private ۙ(Ll/᩻֫ܳ;JJJ)V
    .locals 8

    .line 338
    iget-object v0, p0, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;

    if-ne v0, p1, :cond_5

    iget-boolean v0, p1, Ll/᩻֫ܳ;->ۙ:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, Ll/ܽ֫ܳ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_4

    .line 339
    :cond_0
    iget-object v0, p1, Ll/᩻֫ܳ;->ۗ:Ll/۫֨ᩴ;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    cmp-long v4, p4, v2

    if-gez v4, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v0, v5}, Ll/۫֨ᩴ;->ۙ(Z)V

    .line 340
    iget-object v0, p1, Ll/᩻֫ܳ;->ۗ:Ll/۫֨ᩴ;

    if-gez v4, :cond_2

    const v5, 0x7f12047f

    goto :goto_1

    :cond_2
    const v5, 0x7f1203be

    :goto_1
    invoke-virtual {v0, v5}, Ll/۫֨ᩴ;->᩷(I)V

    .line 341
    iget-object v0, p1, Ll/᩻֫ܳ;->ۗ:Ll/۫֨ᩴ;

    if-gez v4, :cond_3

    invoke-static {p2, p3}, Ll/۠֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 342
    :cond_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sub-long v6, p4, p2

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/۠֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p4, p5}, Ll/۠֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 341
    :goto_2
    invoke-virtual {v0, v2}, Ll/۫֨ᩴ;->᩸(Ljava/lang/CharSequence;)V

    .line 343
    iget-object v0, p1, Ll/᩻֫ܳ;->ۗ:Ll/۫֨ᩴ;

    invoke-virtual {v0, p6, p7}, Ll/۫֨ᩴ;->ۙ(J)V

    if-ltz v4, :cond_5

    .line 344
    iget-object p1, p1, Ll/᩻֫ܳ;->ۗ:Ll/۫֨ᩴ;

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    long-to-double p2, p2

    const-wide/high16 p6, 0x4059000000000000L    # 100.0

    mul-double p2, p2, p6

    long-to-double p4, p4

    div-double/2addr p2, p4

    invoke-static {p6, p7, p2, p3}, Ljava/lang/Math;->min(DD)D

    move-result-wide p2

    double-to-int v1, p2

    :goto_3
    invoke-virtual {p1, v1}, Ll/۫֨ᩴ;->ۙ(I)V

    :cond_5
    :goto_4
    return-void
.end method

.method private ۙ(Ll/᩻֫ܳ;Ljava/io/InputStream;)V
    .locals 5

    .line 308
    new-instance v0, Ll/ۜۚܳ;

    invoke-direct {v0, p0, p1}, Ll/ۜۚܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    const/high16 v0, 0x10000

    new-array v0, v0, [B

    .line 312
    :goto_0
    invoke-static {p1}, Ll/ܽ֫ܳ;->᩷(Ll/᩻֫ܳ;)V

    .line 313
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    .line 319
    iget-wide v0, p1, Ll/᩻֫ܳ;->᩶:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-ltz p2, :cond_1

    iget-object p2, p1, Ll/᩻֫ܳ;->ۛ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-wide p1, p1, Ll/᩻֫ܳ;->᩶:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Incomplete download"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    return-void

    .line 315
    :cond_2
    iget-object v2, p1, Ll/᩻֫ܳ;->۫:Ll/ۚۚܳ;

    invoke-virtual {v2, v1, v0}, Ll/ۚۚܳ;->ۙ(I[B)V

    .line 316
    iget-object v2, p1, Ll/᩻֫ܳ;->ۛ:Ljava/util/concurrent/atomic/AtomicLong;

    int-to-long v3, v1

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 317
    invoke-static {p1, v1}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;I)V

    goto :goto_0
.end method

.method private ۙ(Ll/᩻֫ܳ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 468
    iget-object v0, p0, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;

    if-eq v0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 469
    iput-object v0, p0, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;

    .line 470
    iget-object v1, p1, Ll/᩻֫ܳ;->ܿ:Ll/۫ۛᩴ;

    invoke-virtual {v1}, Ll/۫ۛᩴ;->ۤ()V

    .line 471
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p1, Ll/᩻֫ܳ;->ۨ:Ll/ۧ֫ܳ;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 472
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p1, Ll/᩻֫ܳ;->ᩳ:Ll/֫֫ܳ;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 488
    iget-object v1, p1, Ll/᩻֫ܳ;->᩺:Ll/᩷ۢܺ;

    if-eqz v1, :cond_1

    iget-object v2, p1, Ll/᩻֫ܳ;->᩻:Ljava/lang/String;

    const-string v3, "cancel"

    invoke-direct {p0, v1, v2, v3}, Ll/ܽ֫ܳ;->ۙ(Ll/᩷ۢܺ;Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    :cond_1
    iget-object v1, p1, Ll/᩻֫ܳ;->ۗ:Ll/۫֨ᩴ;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ll/۫֨ᩴ;->᩷()V

    .line 475
    :cond_2
    iget-boolean v1, p0, Ll/ܽ֫ܳ;->᩸:Z

    if-nez v1, :cond_7

    iget-object v1, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_4

    .line 476
    iget-object p1, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    const p3, 0x7f120481

    invoke-virtual {p1, p3}, Ll/ۖۖۧ;->᩷(I)V

    iget-object p3, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v1

    const v1, 0x7f1203a6

    .line 477
    invoke-virtual {p3, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    const p3, 0x7f12018c

    .line 478
    invoke-virtual {p1, p3, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p3, Ll/ۢۢ֫;

    const/4 v0, 0x2

    invoke-direct {p3, v0, p0, p2}, Ll/ۢۢ֫;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p2, 0x7f120583

    .line 479
    invoke-virtual {p1, p2, p3}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 480
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void

    :cond_4
    const p2, 0x7f1202d0

    if-eqz p3, :cond_5

    .line 481
    iget-object p1, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ۖۖۧ;->᩷(I)V

    iget-object p2, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p3, v2, v1

    const p3, 0x7f120480

    .line 482
    invoke-virtual {p2, p3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    const p2, 0x7f1208c9

    .line 483
    invoke-virtual {p1, p2, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void

    .line 484
    :cond_5
    iget-boolean p3, p1, Ll/᩻֫ܳ;->ۙ:Z

    if-eqz p3, :cond_6

    iget-boolean p1, p1, Ll/᩻֫ܳ;->ۘ:Z

    if-eqz p1, :cond_7

    :cond_6
    invoke-static {p2}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    :cond_7
    :goto_0
    return-void
.end method

.method private ۙ(Landroid/net/Uri;)Z
    .locals 4

    .line 171
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "data"

    .line 172
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    const-string v1, "http"

    .line 173
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    const-string v1, "https"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return v3

    .line 174
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, ""

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ll/֫ۚܳ;->ۙ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/ܽ֫ܳ;->֫:Ll/ܺ֫ܳ;

    invoke-interface {v0, p1}, Ll/ܺ֫ܳ;->᩷(Landroid/net/Uri;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    return v3

    :cond_4
    :goto_1
    return v2
.end method

.method public static ۚ(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V
    .locals 8

    .line 196
    iget-object v0, p0, Ll/ܽ֫ܳ;->ۚ:Ll/᩻֫ܳ;

    if-eqz v0, :cond_0

    return-void

    .line 197
    :cond_0
    iput-object p1, p0, Ll/ܽ֫ܳ;->ۚ:Ll/᩻֫ܳ;

    .line 198
    iget-object v0, p1, Ll/᩻֫ܳ;->ܳ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 199
    :try_start_0
    iget-object v1, p0, Ll/ܽ֫ܳ;->ᩴ:Ll/᩶֨֫;

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_1
    iget-object v0, p1, Ll/᩻֫ܳ;->ᩴ:Ljava/lang/String;

    goto :goto_0

    :goto_1
    const/4 v6, 0x0

    const/4 v7, 0x0

    const v3, 0x7f120ae6

    const/4 v2, 0x0

    const/4 v5, 0x0

    .line 1654
    invoke-virtual/range {v1 .. v7}, Ll/ܶ֨֫;->ۙ(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    .line 200
    iput-object p1, p0, Ll/ܽ֫ܳ;->ۚ:Ll/᩻֫ܳ;

    const p0, 0x7f1208d0

    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/ܽ֫ܳ;)Landroid/webkit/WebView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ֫ܳ;->᩻:Landroid/webkit/WebView;

    return-object p0
.end method

.method public static synthetic ۤ(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V
    .locals 0

    .line 445
    invoke-direct {p0, p1}, Ll/ܽ֫ܳ;->ۤ(Ll/᩻֫ܳ;)V

    return-void
.end method

.method private ۤ(Ll/᩻֫ܳ;)V
    .locals 2

    .line 454
    iget-boolean v0, p1, Ll/᩻֫ܳ;->ۚ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 455
    iput-boolean v0, p1, Ll/᩻֫ܳ;->ۚ:Z

    .line 458
    iget-object v0, p1, Ll/᩻֫ܳ;->۫:Ll/ۚۚܳ;

    if-eqz v0, :cond_1

    .line 459
    :try_start_0
    invoke-virtual {v0}, Ll/ۚۚܳ;->ۙ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 460
    :goto_0
    iget-object v0, p1, Ll/᩻֫ܳ;->۫:Ll/ۚۚܳ;

    invoke-virtual {v0}, Ll/ۚۚܳ;->ۤ()Ll/᩷ۨᩴ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 461
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 464
    :goto_1
    new-instance v1, Ll/᩷֫ܳ;

    invoke-direct {v1, p0, p1, v0}, Ll/᩷֫ܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;Ljava/lang/String;)V

    invoke-static {v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method private ۤ()Z
    .locals 2

    .line 166
    iget-boolean v0, p0, Ll/ܽ֫ܳ;->᩸:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܽ֫ܳ;->ۚ:Ll/᩻֫ܳ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ۧ(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 427
    iput-boolean v0, p1, Ll/᩻֫ܳ;->ۘ:Z

    invoke-direct {p0, p1}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;)V

    return-void
.end method

.method public static synthetic ۫(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V
    .locals 9

    .line 308
    iget-object v0, p1, Ll/᩻֫ܳ;->ۛ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v3

    iget-wide v5, p1, Ll/᩻֫ܳ;->᩶:J

    iget-wide v7, p1, Ll/᩻֫ܳ;->ۤ:J

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;JJJ)V

    return-void
.end method

.method public static ܳ(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V
    .locals 3

    .line 270
    iget-object v0, p0, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;

    if-ne v0, p1, :cond_1

    iget-boolean v0, p1, Ll/᩻֫ܳ;->ۙ:Z

    if-nez v0, :cond_1

    .line 488
    iget-object v0, p1, Ll/᩻֫ܳ;->᩺:Ll/᩷ۢܺ;

    if-eqz v0, :cond_0

    iget-object v1, p1, Ll/᩻֫ܳ;->᩻:Ljava/lang/String;

    const-string v2, "read"

    invoke-direct {p0, v0, v1, v2}, Ll/ܽ֫ܳ;->ۙ(Ll/᩷ۢܺ;Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    :cond_0
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object p0

    iget-object v0, p1, Ll/᩻֫ܳ;->ᩳ:Ll/֫֫ܳ;

    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 424
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object p0

    iget-object p1, p1, Ll/᩻֫ܳ;->ᩳ:Ll/֫֫ܳ;

    const-wide/16 v0, 0x7530

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method public static synthetic ᩴ(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V
    .locals 0

    .line 256
    invoke-direct {p0, p1}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;)V

    return-void
.end method

.method private ᩴ(Ll/᩻֫ܳ;)V
    .locals 11

    .line 181
    iput-object p1, p0, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;

    .line 182
    sget-object v0, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    const-string v1, "hpdd"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ll/᩻֫ܳ;->ᩴ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 183
    invoke-static {}, Ll/ۛۨᩴ;->ۤ()Ll/᩷ۨᩴ;

    move-result-object v0

    const-string v1, "download"

    invoke-virtual {v0, v1}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ll/᩻֫ܳ;->ᩴ:Ljava/lang/String;

    :cond_0
    const v0, 0x7f0d012e

    .line 184
    iget-object v1, p0, Ll/ܽ֫ܳ;->ۙ:Ll/ۘۖ֫;

    invoke-virtual {v1, v0}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v0

    const v3, 0x7f0a0284

    .line 185
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/᩹ۖ᩸;

    const v4, 0x7f0a0285

    .line 186
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ll/֫ۖ᩸;

    const v4, 0x7f0a0283

    .line 187
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Ll/֫ۖ᩸;

    const v4, 0x7f0a0282

    .line 188
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Ll/᩹ۖ᩸;

    iput-object v4, p1, Ll/᩻֫ܳ;->ܳ:Ll/᩹ۖ᩸;

    .line 189
    iget-object v4, p1, Ll/᩻֫ܳ;->ܺ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 190
    iget-object v4, p1, Ll/᩻֫ܳ;->ܳ:Ll/᩹ۖ᩸;

    iget-object v5, p1, Ll/᩻֫ܳ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    const/4 v4, 0x5

    .line 191
    invoke-virtual {v3, v4}, Ll/᩹ۖ᩸;->᩶(I)V

    .line 192
    invoke-static {v8}, Ll/۟۫ܺ;->ۙ(Ll/֫ۖ᩸;)V

    .line 193
    iget-object v4, p1, Ll/᩻֫ܳ;->ܳ:Ll/᩹ۖ᩸;

    const/4 v5, 0x6

    invoke-virtual {v4, v5}, Ll/᩹ۖ᩸;->᩶(I)V

    .line 194
    invoke-static {v9}, Ll/۟۫ܺ;->ۙ(Ll/֫ۖ᩸;)V

    .line 195
    new-instance v4, Ll/ᩴ֫ܳ;

    invoke-direct {v4, p0, p1}, Ll/ᩴ֫ܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V

    invoke-virtual {v9, v4}, Ll/֫ۖ᩸;->ۙ(Landroid/view/View$OnClickListener;)V

    .line 202
    invoke-virtual {v1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    const v4, 0x7f120482

    invoke-virtual {v1, v4}, Ll/ۖۖۧ;->᩷(I)V

    .line 203
    invoke-virtual {v1, v0}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v0, 0x7f12078d

    invoke-virtual {v1, v0, v2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120161

    .line 204
    invoke-virtual {v1, v0, v2}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ll/ܳ֫ܳ;

    invoke-direct {v0, p0, p1}, Ll/ܳ֫ܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V

    .line 205
    invoke-virtual {v1, v0}, Ll/ۖۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    invoke-virtual {v1}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object v0

    .line 206
    iput-object v0, p1, Ll/᩻֫ܳ;->᩸:Ll/۠ۖۧ;

    .line 207
    invoke-virtual {v0}, Ll/۠ۖۧ;->ۚ()V

    .line 208
    invoke-virtual {v0}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/۫֫ܳ;

    move-object v4, v2

    move-object v5, p0

    move-object v6, v3

    move-object v7, p1

    move-object v10, v0

    invoke-direct/range {v4 .. v10}, Ll/۫֫ܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩹ۖ᩸;Ll/᩻֫ܳ;Ll/֫ۖ᩸;Ll/֫ۖ᩸;Ll/۠ۖۧ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 230
    iget-object v1, p1, Ll/᩻֫ܳ;->ܳ:Ll/᩹ۖ᩸;

    new-instance v2, Ll/۟ۚܳ;

    invoke-direct {v2, v0}, Ll/۟ۚܳ;-><init>(Ll/۠ۖۧ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 235
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    .line 236
    iget-object v0, p1, Ll/᩻֫ܳ;->ܺ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object p1, p1, Ll/᩻֫ܳ;->ܺ:Ljava/lang/String;

    invoke-static {p1}, Ll/᩷ۨᩴ;->ܺ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr v0, p1

    const/4 p1, 0x0

    invoke-virtual {v3, p1, v0}, Ll/᩹ۖ᩸;->ۧ(II)V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ܽ֫ܳ;)Ll/᩻֫ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ֫ܳ;->ۚ:Ll/᩻֫ܳ;

    return-object p0
.end method

.method private ᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 9

    .line 154
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 155
    invoke-direct {p0, v0}, Ll/ܽ֫ܳ;->ۙ(Landroid/net/Uri;)Z

    move-result v1

    if-nez v1, :cond_0

    const p1, 0x7f120483

    .line 177
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    :cond_0
    const-string v1, "data"

    .line 156
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    int-to-double v1, v1

    const-wide v3, 0x4176666666666666L    # 2.34881024E7

    cmpl-double v5, v1, v3

    if-lez v5, :cond_1

    const p1, 0x7f120a1d

    .line 157
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 160
    :cond_1
    new-instance v8, Ll/᩻֫ܳ;

    invoke-static {p1, p3, p4}, Ll/ܽ֫ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-wide v6, p5

    invoke-direct/range {v1 .. v7}, Ll/᩻֫ܳ;-><init>(Ll/ܽ֫ܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 161
    iget-object p1, p0, Ll/ܽ֫ܳ;->֫:Ll/ܺ֫ܳ;

    invoke-interface {p1, v0}, Ll/ܺ֫ܳ;->᩷(Landroid/net/Uri;)Z

    move-result p1

    iput-boolean p1, v8, Ll/᩻֫ܳ;->ܽ:Z

    .line 162
    invoke-direct {p0, v8}, Ll/ܽ֫ܳ;->ᩴ(Ll/᩻֫ܳ;)V

    return-void
.end method

.method public static ᩷(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V
    .locals 5

    .line 412
    :try_start_0
    iget-object v0, p1, Ll/᩻֫ܳ;->ۛ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-wide v2, p1, Ll/᩻֫ܳ;->᩶:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 323
    invoke-static {p1}, Ll/ܽ֫ܳ;->᩷(Ll/᩻֫ܳ;)V

    .line 324
    iget-object v0, p1, Ll/᩻֫ܳ;->۫:Ll/ۚۚܳ;

    invoke-virtual {v0}, Ll/ۚۚܳ;->᩷()Ll/᩷ۨᩴ;

    move-result-object v0

    .line 325
    new-instance v1, Ll/ۢۚܳ;

    invoke-direct {v1, p0, p1, v0}, Ll/ۢۚܳ;-><init>(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;Ll/᩷ۨᩴ;)V

    invoke-static {v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    .line 412
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete generated download"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 414
    :catch_0
    invoke-direct {p0, p1}, Ll/ܽ֫ܳ;->ۤ(Ll/᩻֫ܳ;)V

    return-void
.end method

.method public static synthetic ᩷(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 464
    invoke-direct {p0, p1, v0, p2}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ᩷(Ll/᩻֫ܳ;)V
    .locals 1

    .line 449
    iget-boolean p0, p0, Ll/᩻֫ܳ;->ۙ:Z

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Download canceled"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ᩸(Ll/ܽ֫ܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ܽ֫ܳ;->ۚ:Ll/᩻֫ܳ;

    return-void
.end method

.method public static synthetic ᩸(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;)V
    .locals 1

    .line 205
    iget-boolean v0, p1, Ll/᩻֫ܳ;->֡:Z

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;)V

    :cond_0
    return-void
.end method

.method private ᩸(Ll/᩻֫ܳ;)V
    .locals 12

    .line 281
    iget-object v0, p1, Ll/᩻֫ܳ;->ۢ:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 282
    iget-boolean v1, p1, Ll/᩻֫ܳ;->ܽ:Z

    if-eqz v1, :cond_2

    .line 283
    iget-object v1, p0, Ll/ܽ֫ܳ;->֫:Ll/ܺ֫ܳ;

    invoke-interface {v1, v0}, Ll/ܺ֫ܳ;->ۙ(Landroid/net/Uri;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    .line 284
    invoke-virtual {v0}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_1

    .line 285
    invoke-virtual {v0}, Landroid/webkit/WebResourceResponse;->getData()Ljava/io/InputStream;

    move-result-object v0

    .line 286
    :try_start_0
    iput-object v0, p1, Ll/᩻֫ܳ;->᩹:Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    .line 287
    :try_start_1
    invoke-direct {p0, p1, v0}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 288
    :try_start_2
    iput-object v1, p1, Ll/᩻֫ܳ;->᩹:Ljava/io/InputStream;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 289
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception v2

    .line 288
    :try_start_3
    iput-object v1, p1, Ll/᩻֫ܳ;->᩹:Ljava/io/InputStream;

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    if-eqz v0, :cond_0

    .line 285
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw p1

    .line 284
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Preview download unavailable"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const-string v1, "data"

    .line 290
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 291
    iget-object v0, p1, Ll/᩻֫ܳ;->ۢ:Ljava/lang/String;

    const/16 v1, 0x23

    .line 561
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, 0x0

    if-ltz v1, :cond_3

    .line 562
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_3
    const/16 v1, 0x2c

    .line 563
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-ltz v1, :cond_12

    .line 564
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-double v3, v3

    const-wide v5, 0x4176666666666666L    # 2.34881024E7

    cmpl-double v7, v3, v5

    if-gtz v7, :cond_12

    .line 565
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 567
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 568
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    const-string v8, "Data download too large"

    if-ge v1, v7, :cond_9

    .line 569
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v9, 0x25

    if-ne v7, v9, :cond_6

    add-int/lit8 v7, v1, 0x2

    .line 571
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    const-string v10, "Invalid percent escape"

    if-ge v7, v9, :cond_5

    add-int/lit8 v1, v1, 0x1

    .line 572
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v9, 0x10

    invoke-static {v1, v9}, Ljava/lang/Character;->digit(CI)I

    move-result v1

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v11

    invoke-static {v11, v9}, Ljava/lang/Character;->digit(CI)I

    move-result v9

    if-ltz v1, :cond_4

    if-ltz v9, :cond_4

    shl-int/lit8 v1, v1, 0x4

    or-int/2addr v1, v9

    .line 574
    invoke-virtual {v4, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    move v1, v7

    goto :goto_2

    .line 573
    :cond_4
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 571
    :cond_5
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const/16 v9, 0x80

    if-ge v7, v9, :cond_7

    .line 575
    invoke-virtual {v4, v7}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_2

    .line 577
    :cond_7
    invoke-virtual {v0, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v7

    .line 578
    new-instance v9, Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/lang/String;-><init>([C)V

    sget-object v10, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v9, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v9

    .line 579
    array-length v10, v9

    invoke-virtual {v4, v9, v2, v10}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 580
    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    add-int/2addr v1, v7

    .line 582
    :goto_2
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v7

    int-to-double v9, v7

    cmpl-double v7, v9, v5

    if-gtz v7, :cond_8

    goto :goto_1

    :cond_8
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 584
    :cond_9
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 585
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v3, ";base64"

    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 586
    array-length v1, v0

    const/4 v3, 0x0

    :goto_3
    const-string v4, "Invalid base64 data"

    if-ge v3, v1, :cond_f

    aget-byte v5, v0, v3

    and-int/lit16 v5, v5, 0xff

    const/16 v6, 0x41

    if-lt v5, v6, :cond_a

    const/16 v6, 0x5a

    if-le v5, v6, :cond_e

    :cond_a
    const/16 v6, 0x61

    if-lt v5, v6, :cond_b

    const/16 v6, 0x7a

    if-le v5, v6, :cond_e

    :cond_b
    const/16 v6, 0x30

    if-lt v5, v6, :cond_c

    const/16 v6, 0x39

    if-le v5, v6, :cond_e

    :cond_c
    const/16 v6, 0x2b

    if-eq v5, v6, :cond_e

    const/16 v6, 0x2f

    if-eq v5, v6, :cond_e

    const/16 v6, 0x3d

    if-eq v5, v6, :cond_e

    const/16 v6, 0x20

    if-eq v5, v6, :cond_e

    const/16 v6, 0xa

    if-eq v5, v6, :cond_e

    const/16 v6, 0xd

    if-eq v5, v6, :cond_e

    const/16 v6, 0x9

    if-ne v5, v6, :cond_d

    goto :goto_4

    .line 590
    :cond_d
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 592
    :cond_f
    :try_start_5
    invoke-static {v0, v2}, Landroid/util/Base64;->decode([BI)[B

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_5

    :catch_0
    move-exception p1

    .line 593
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v4, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 595
    :cond_10
    :goto_5
    array-length v1, v0

    const/high16 v2, 0x1000000

    if-gt v1, v2, :cond_11

    .line 292
    array-length v1, v0

    int-to-long v1, v1

    iput-wide v1, p1, Ll/᩻֫ܳ;->᩶:J

    .line 293
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :try_start_6
    invoke-direct {p0, p1, v1}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;Ljava/io/InputStream;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_3
    move-exception p1

    :try_start_7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_6

    :catchall_4
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p1

    .line 595
    :cond_11
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 564
    :cond_12
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid data download"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 295
    :cond_13
    new-instance v0, Ll/֫ۚܳ;

    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 295
    iput-object v0, p1, Ll/᩻֫ܳ;->ۧ:Ll/֫ۚܳ;

    .line 296
    iget-boolean v0, p1, Ll/᩻֫ܳ;->ۙ:Z

    if-eqz v0, :cond_14

    iget-object v0, p1, Ll/᩻֫ܳ;->ۧ:Ll/֫ۚܳ;

    invoke-virtual {v0}, Ll/֫ۚܳ;->ۙ()V

    .line 297
    :cond_14
    iget-object v0, p1, Ll/᩻֫ܳ;->ۧ:Ll/֫ۚܳ;

    iget-object v1, p1, Ll/᩻֫ܳ;->ۢ:Ljava/lang/String;

    iget-object v2, p1, Ll/᩻֫ܳ;->֨:Ljava/lang/String;

    iget-object v3, p1, Ll/᩻֫ܳ;->ܶ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Ll/֫ۚܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۡܳۨ;

    move-result-object v0

    .line 298
    :try_start_8
    invoke-virtual {v0}, Ll/ۡܳۨ;->ۙ()Ll/۠ܳۨ;

    move-result-object v1

    if-eqz v1, :cond_15

    .line 300
    invoke-virtual {v1}, Ll/۠ܳۨ;->ۤ()J

    move-result-wide v2

    iput-wide v2, p1, Ll/᩻֫ܳ;->᩶:J

    .line 301
    invoke-virtual {v1}, Ll/۠ܳۨ;->ۙ()Ljava/io/InputStream;

    move-result-object v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    :try_start_9
    invoke-direct {p0, p1, v1}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;Ljava/io/InputStream;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :try_start_a
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 302
    invoke-virtual {v0}, Ll/ۡܳۨ;->close()V

    return-void

    :catchall_5
    move-exception p1

    .line 301
    :try_start_b
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    goto :goto_7

    :catchall_6
    move-exception v1

    :try_start_c
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw p1

    .line 299
    :cond_15
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Missing download response body"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    :catchall_7
    move-exception p1

    .line 297
    :try_start_d
    invoke-virtual {v0}, Ll/ۡܳۨ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    goto :goto_8

    :catchall_8
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw p1
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 512
    iget-boolean v0, p0, Ll/ܽ֫ܳ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    .line 513
    :cond_0
    iget-object v0, p0, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;)V

    :cond_1
    const/4 v0, 0x1

    .line 514
    iput-boolean v0, p0, Ll/ܽ֫ܳ;->᩸:Z

    .line 515
    iget-object v0, p0, Ll/ܽ֫ܳ;->ᩴ:Ll/᩶֨֫;

    invoke-virtual {v0}, Ll/ܶ֨֫;->ۙ()V

    .line 516
    iget-object v0, p0, Ll/ܽ֫ܳ;->ۧ:Ll/ᩳ۬᩷;

    if-eqz v0, :cond_3

    const-string v1, "DOCUMENT_START_SCRIPT"

    .line 517
    invoke-static {v1}, Ll/ۧ᩻ܺ;->᩷(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 518
    invoke-virtual {v0}, Ll/ᩳ۬᩷;->ۙ()V

    :cond_2
    const-string v0, "WEB_MESSAGE_LISTENER"

    .line 519
    invoke-static {v0}, Ll/ۧ᩻ܺ;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 520
    iget-object v0, p0, Ll/ܽ֫ܳ;->᩻:Landroid/webkit/WebView;

    iget-object v1, p0, Ll/ܽ֫ܳ;->᩷:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۬᩷;->ۙ(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 522
    :cond_3
    iget-object v0, p0, Ll/ܽ֫ܳ;->ܺ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method public final declared-synchronized ۙ(Landroid/net/Uri;Ljava/lang/String;Z)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    :try_start_0
    const-string v1, "GET"

    .line 79
    invoke-virtual {v1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    xor-int/lit8 v1, p2, 0x1

    if-eqz p3, :cond_0

    .line 80
    iput-boolean v1, p0, Ll/ܽ֫ܳ;->ܳ:Z

    .line 81
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p2, :cond_1

    .line 83
    iget-object p2, p0, Ll/ܽ֫ܳ;->۫:Ljava/util/LinkedHashSet;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 84
    iget-object p1, p0, Ll/ܽ֫ܳ;->۫:Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    const/16 p2, 0x40

    if-le p1, p2, :cond_2

    iget-object p1, p0, Ll/ܽ֫ܳ;->۫:Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 85
    :cond_1
    iget-object p2, p0, Ll/ܽ֫ܳ;->۫:Ljava/util/LinkedHashSet;

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 15

    move-object v10, p0

    move-object/from16 v0, p1

    .line 138
    invoke-direct {p0}, Ll/ܽ֫ܳ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    move-object v14, p0

    .line 0
    monitor-enter v14

    .line 90
    :try_start_0
    invoke-static/range {p1 .. p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "http"

    .line 91
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_1

    const-string v2, "https"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    monitor-exit v14

    goto :goto_1

    .line 92
    :cond_1
    :try_start_1
    iget-boolean v1, v10, Ll/ܽ֫ܳ;->ܳ:Z

    if-nez v1, :cond_2

    iget-object v1, v10, Ll/ܽ֫ܳ;->۫:Ljava/util/LinkedHashSet;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    monitor-exit v14

    :goto_1
    if-nez v3, :cond_3

    const v0, 0x7f120483

    .line 177
    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 140
    :cond_3
    iget-object v1, v10, Ll/ܽ֫ܳ;->ۧ:Ll/ᩳ۬᩷;

    if-eqz v1, :cond_4

    .line 142
    iget-object v1, v10, Ll/ܽ֫ܳ;->᩻:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v3

    .line 143
    iget-object v11, v10, Ll/ܽ֫ܳ;->᩻:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "!!(window.__mtHtmlDownload && window.__mtHtmlDownload("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    invoke-static/range {p1 .. p1}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-static {v0, v6, v7}, Ll/ܽ֫ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "))"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ll/ۙ֫ܳ;

    move-object v1, v13

    move-object v2, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-wide/from16 v8, p5

    invoke-direct/range {v1 .. v9}, Ll/ۙ֫ܳ;-><init>(Ll/ܽ֫ܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 143
    invoke-virtual {v11, v12, v13}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void

    :cond_4
    move-object/from16 v6, p3

    move-object/from16 v7, p4

    .line 150
    invoke-direct/range {p0 .. p6}, Ll/ܽ֫ܳ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-void

    :catchall_0
    move-exception v0

    .line 92
    :try_start_2
    monitor-exit v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final ᩷()V
    .locals 2

    .line 506
    iget-object v0, p0, Ll/ܽ֫ܳ;->ۤ:Ll/᩻֫ܳ;

    if-eqz v0, :cond_1

    .line 507
    iget-boolean v1, v0, Ll/᩻֫ܳ;->֡:Z

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Ll/᩻֫ܳ;->ܽ:Z

    if-eqz v1, :cond_1

    :cond_0
    invoke-direct {p0, v0}, Ll/ܽ֫ܳ;->ۙ(Ll/᩻֫ܳ;)V

    :cond_1
    return-void
.end method

.class public final Ll/᩵᩶ᩴ;
.super Ljava/lang/Object;
.source "89SC"


# static fields
.field public static final ۙ:Ll/᩻֫ܺ;

.field public static final ᩷:Ll/ܽ᩻ۙ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3e8

    .line 31
    invoke-static {v0}, Ll/᩻֫ܺ;->ۙ(I)Ll/᩻֫ܺ;

    move-result-object v0

    sput-object v0, Ll/᩵᩶ᩴ;->ۙ:Ll/᩻֫ܺ;

    .line 32
    new-instance v0, Ll/ܽ᩻ۙ;

    .line 40
    invoke-direct {v0}, Ll/ܺ᩻ۙ;-><init>()V

    .line 32
    sput-object v0, Ll/᩵᩶ᩴ;->᩷:Ll/ܽ᩻ۙ;

    return-void
.end method

.method public static ۙ(Ll/֫᩶ᩴ;Z)Ll/ۗ᩶ᩴ;
    .locals 6

    .line 91
    invoke-virtual {p0}, Ll/᩸ܿᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v0

    .line 92
    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.android.externalstorage.documents"

    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_0

    .line 96
    :cond_0
    invoke-static {}, Ll/᩶᩷ۧ;->ܶ()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 97
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.content.action.DOCUMENTS_PROVIDER"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    .line 98
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    .line 99
    iget-object v5, v4, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    iget-object v5, v5, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 101
    :try_start_0
    iget-object v0, v4, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    iget-object v0, v0, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 102
    invoke-virtual {v1, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 103
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v2, v1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v3

    const v2, 0x7f120545

    .line 104
    invoke-static {v2, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eqz p1, :cond_2

    .line 106
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n\n"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0x7f120546

    invoke-static {v2}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 107
    :cond_2
    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    if-nez p1, :cond_3

    .line 0
    instance-of v1, p0, Ll/֡᩶ᩴ;

    if-nez v1, :cond_3

    goto :goto_0

    .line 109
    :cond_3
    new-instance v1, Ll/ܽ᩶ᩴ;

    invoke-direct {v1, p0, v0, p1}, Ll/ܽ᩶ᩴ;-><init>(Ll/֫᩶ᩴ;Ljava/lang/String;Landroid/content/Intent;)V

    .line 127
    new-instance p0, Ll/ۗ᩶ᩴ;

    invoke-direct {p0, v2, v1}, Ll/ۗ᩶ᩴ;-><init>(Ljava/lang/String;Ljava/util/concurrent/Callable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_4
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/᩷ۨᩴ;)Ll/ۗ᩶ᩴ;
    .locals 8

    .line 70
    instance-of v0, p0, Ll/֫᩶ᩴ;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p0, Ll/֫᩶ᩴ;

    .line 72
    :try_start_0
    invoke-virtual {p0}, Ll/֫᩶ᩴ;->ۙۤ()Ll/᩻᩶ᩴ;

    move-result-object v0

    iget-object v0, v0, Ll/᩻᩶ᩴ;->ܳ:Landroid/net/Uri;

    invoke-static {v0}, Ll/᩸᩶ᩴ;->᩷(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v3

    .line 73
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v0, "document_id"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 76
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-object v1

    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    const/4 v0, 0x1

    .line 83
    :try_start_1
    invoke-static {p0, v0}, Ll/᩵᩶ᩴ;->ۙ(Ll/֫᩶ᩴ;Z)Ll/ۗ᩶ᩴ;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    :cond_2
    return-object v1
.end method

.method public static ۙ(Ll/֫᩶ᩴ;)V
    .locals 1

    .line 59
    sget-object v0, Ll/᩵᩶ᩴ;->ۙ:Ll/᩻֫ܺ;

    invoke-virtual {v0}, Ll/᩻֫ܺ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 62
    invoke-static {p0, v0}, Ll/᩵᩶ᩴ;->ۙ(Ll/֫᩶ᩴ;Z)Ll/ۗ᩶ᩴ;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 63
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sget-object p0, Ll/᩵᩶ᩴ;->᩷:Ll/ܽ᩻ۙ;

    invoke-virtual {p0, v0}, Ll/ܽ᩻ۙ;->ۙ(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۙ(Ll/ܽ֡֫;)V
    .locals 2

    .line 35
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 36
    new-instance v1, Ll/ܶ᩶ᩴ;

    invoke-direct {v1, v0, p0}, Ll/ܶ᩶ᩴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    new-instance v0, Ll/᩹᩶ᩴ;

    invoke-direct {v0, v1}, Ll/᩹᩶ᩴ;-><init>(Ll/ܶ᩶ᩴ;)V

    sget-object v1, Ll/᩵᩶ᩴ;->᩷:Ll/ܽ᩻ۙ;

    invoke-virtual {v1, p0, v0}, Ll/ܺ᩻ۙ;->ۙ(Ll/ۤ᩻ۙ;Ll/ܶ᩻ۙ;)V

    return-void
.end method

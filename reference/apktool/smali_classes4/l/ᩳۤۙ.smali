.class public final Ll/ᩳۤۙ;
.super Ljava/lang/Object;
.source "UB1K"


# instance fields
.field public final ۙ:Ll/ۢۤۙ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 242
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 243
    new-instance v0, Ll/֨ۤۙ;

    .line 253
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    .line 245
    :cond_0
    new-instance v0, Ll/ۢۤۙ;

    .line 253
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 118
    :goto_0
    iput-object v0, p0, Ll/ᩳۤۙ;->ۙ:Ll/ۢۤۙ;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/Context;)Ll/ᩳ᩸ۙ;
    .locals 8

    .line 155
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "Package manager required to locate emoji font provider"

    .line 157
    invoke-static {v0, v1}, Ll/ۧ֫ܺ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    new-instance v1, Landroid/content/Intent;

    const-string v2, "androidx.content.action.LOAD_EMOJI_FONT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ᩳۤۙ;->ۙ:Ll/ۢۤۙ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    .line 261
    invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    .line 182
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    .line 271
    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    if-eqz v4, :cond_0

    .line 197
    iget-object v6, v4, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v6, :cond_0

    iget v6, v6, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v7, 0x1

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_0

    goto :goto_0

    :cond_1
    move-object v4, v5

    :goto_0
    if-nez v4, :cond_2

    goto :goto_2

    .line 215
    :cond_2
    :try_start_0
    iget-object v1, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 216
    iget-object v4, v4, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 218
    invoke-virtual {v2, v0, v4}, Ll/ۢۤۙ;->ۙ(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;

    move-result-object v0

    .line 230
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 231
    array-length v6, v0

    :goto_1
    if-ge v3, v6, :cond_3

    aget-object v7, v0, v3

    .line 232
    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 234
    :cond_3
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 221
    new-instance v2, Ll/᩷֨;

    const-string v3, "emojicompat-emoji-font"

    invoke-direct {v2, v1, v4, v3, v0}, Ll/᩷֨;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    :goto_2
    move-object v2, v5

    :goto_3
    if-nez v2, :cond_4

    goto :goto_4

    .line 142
    :cond_4
    new-instance v5, Ll/ᩳ᩸ۙ;

    invoke-direct {v5, p1, v2}, Ll/ᩳ᩸ۙ;-><init>(Landroid/content/Context;Ll/᩷֨;)V

    :goto_4
    return-object v5
.end method

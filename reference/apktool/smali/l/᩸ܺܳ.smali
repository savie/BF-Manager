.class public final Ll/᩸ܺܳ;
.super Ljava/lang/Object;
.source "66H7"


# instance fields
.field public final ۙ:Landroid/content/Context;

.field public ۤ:Ljava/lang/String;

.field public ᩷:Ll/ۤܺܳ;

.field public ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܽܿ֫;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ܺܳ;->ۙ:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    const/4 v0, 0x0

    .line 48
    iput-object v0, p0, Ll/᩸ܺܳ;->᩷:Ll/ۤܺܳ;

    invoke-virtual {p0}, Ll/᩸ܺܳ;->ۤ()V

    return-void
.end method

.method public final ۙ(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 6

    .line 19
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getClassName()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz v0, :cond_6

    if-nez p1, :cond_0

    goto :goto_1

    .line 22
    :cond_0
    iget-object v1, p0, Ll/᩸ܺܳ;->᩸:Ljava/lang/String;

    invoke-static {v1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩸ܺܳ;->ۤ:Ljava/lang/String;

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 23
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 24
    iget-object v1, p0, Ll/᩸ܺܳ;->ۙ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 25
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    .line 28
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v4, Landroid/content/ComponentName;

    invoke-direct {v4, v0, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v3

    .line 33
    :goto_0
    iput-object v0, p0, Ll/᩸ܺܳ;->᩸:Ljava/lang/String;

    .line 34
    iput-object p1, p0, Ll/᩸ܺܳ;->ۤ:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 37
    iget-object v3, v1, Landroid/content/pm/ActivityInfo;->targetActivity:Ljava/lang/String;

    if-nez v3, :cond_2

    iget-object v3, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    :cond_2
    if-eqz v2, :cond_5

    .line 38
    const-class v1, Ll/۫ܺܳ;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_3
    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v3

    .line 44
    :cond_5
    new-instance v1, Ll/ۤܺܳ;

    invoke-direct {v1, v0, p1}, Ll/ۤܺܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Ll/᩸ܺܳ;->᩷:Ll/ۤܺܳ;

    :cond_6
    :goto_1
    return-void
.end method

.method public final ۤ()V
    .locals 1

    const/4 v0, 0x0

    .line 51
    iput-object v0, p0, Ll/᩸ܺܳ;->ۤ:Ljava/lang/String;

    iput-object v0, p0, Ll/᩸ܺܳ;->᩸:Ljava/lang/String;

    return-void
.end method

.method public final ᩷()Ll/ۤܺܳ;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/᩸ܺܳ;->᩷:Ll/ۤܺܳ;

    return-object v0
.end method

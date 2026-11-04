.class public Ll/ܿܳۧ;
.super Ll/ۧᩴۧ;
.source "V6YU"


# instance fields
.field public final ۢۙ:Ll/ܰܳۧ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Ll/ۧᩴۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    new-instance p1, Ll/ܰܳۧ;

    invoke-direct {p1, p0}, Ll/ܰܳۧ;-><init>(Ll/ܿܳۧ;)V

    iput-object p1, p0, Ll/ܿܳۧ;->ۢۙ:Ll/ܰܳۧ;

    .line 32
    invoke-virtual {p0}, Ll/ۘۘ᩷;->ۜ()V

    .line 33
    new-instance p1, Ll/۬ۧۧ;

    const/4 p2, 0x5

    invoke-direct {p1, p2, p0}, Ll/۬ۧۧ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll/ۘۘ᩷;->ۙ(Ll/᩺ۘ᩷;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܿܳۧ;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    const-string v0, "ssvc"

    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 23
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/ۘۘ᩷;->۟()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ܽ֡֫;)V
    .locals 8

    .line 66
    invoke-virtual {p0}, Ll/ۘۘ᩷;->ۙ()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/᩺᩷ۧ;->ۙ(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v0

    .line 67
    invoke-static {}, Ll/ۘ᩷ۧ;->ۙ()I

    move-result v1

    const/4 v2, 0x3

    new-array v3, v2, [Z

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_1

    const/4 v6, 0x1

    shl-int v7, v6, v5

    and-int/2addr v7, v1

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    .line 70
    :goto_1
    aput-boolean v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    .line 73
    invoke-virtual {p0}, Ll/ۘۘ᩷;->ۛ()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۖۖۧ;->᩷(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/᩶ܳۧ;

    const/4 v2, 0x0

    invoke-direct {v1, v3, v2}, Ll/᩶ܳۧ;-><init>([ZI)V

    .line 74
    invoke-virtual {p1, v0, v3, v1}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)V

    const v0, 0x7f0d00fc

    .line 75
    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->ۤ(I)V

    new-instance v0, Ll/ܳ᩷᩻;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v3}, Ll/ܳ᩷᩻;-><init>(ILjava/lang/Object;)V

    const v1, 0x7f1208c9

    .line 76
    invoke-virtual {p1, v1, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120161

    const/4 v1, 0x0

    .line 85
    invoke-virtual {p1, v0, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 86
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p1

    const v0, 0x7f0a0139

    .line 87
    invoke-virtual {p1, v0}, Ll/۠ۖۧ;->ۙ(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/view/View;->setMinimumHeight(I)V

    return-void
.end method

.method public final ۡ()V
    .locals 2

    .line 57
    invoke-virtual {p0}, Ll/ۧᩴۧ;->۫ۙ()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Ll/ܿܳۧ;->ۢۙ:Ll/ܰܳۧ;

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 58
    invoke-super {p0}, Ll/ۘۘ᩷;->ۡ()V

    return-void
.end method

.method public final ۢ()V
    .locals 2

    .line 50
    invoke-super {p0}, Ll/ۘۘ᩷;->ۢ()V

    .line 51
    invoke-virtual {p0}, Ll/ۧᩴۧ;->۫ۙ()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Ll/ܿܳۧ;->ۢۙ:Ll/ܰܳۧ;

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

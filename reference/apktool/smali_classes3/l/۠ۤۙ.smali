.class public final Ll/۠ۤۙ;
.super Ljava/lang/Object;
.source "DB30"


# instance fields
.field public final ۙ:Ll/֫᩸ۙ;

.field public volatile ۤ:Ll/ܰ᩸ۙ;

.field public volatile ᩷:Ll/۠᩸ۙ;


# direct methods
.method public constructor <init>(Ll/֫᩸ۙ;)V
    .locals 0

    .line 1649
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1650
    iput-object p1, p0, Ll/۠ۤۙ;->ۙ:Ll/֫᩸ۙ;

    return-void
.end method

.method public static synthetic ۙ(Ll/۠ۤۙ;)Ll/֫᩸ۙ;
    .locals 0

    .line 1636
    iget-object p0, p0, Ll/۠ۤۙ;->ۙ:Ll/֫᩸ۙ;

    return-object p0
.end method


# virtual methods
.method public final ۙ(Ljava/lang/CharSequence;IIZ)Ljava/lang/CharSequence;
    .locals 1

    .line 1716
    iget-object v0, p0, Ll/۠ۤۙ;->ۤ:Ll/ܰ᩸ۙ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܰ᩸ۙ;->ۙ(Ljava/lang/CharSequence;IIZ)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ()V
    .locals 3

    .line 1655
    iget-object v0, p0, Ll/۠ۤۙ;->ۙ:Ll/֫᩸ۙ;

    :try_start_0
    new-instance v1, Ll/ۖۤۙ;

    invoke-direct {v1, p0}, Ll/ۖۤۙ;-><init>(Ll/۠ۤۙ;)V

    .line 1666
    iget-object v2, v0, Ll/֫᩸ۙ;->۫:Ll/ܳ᩸ۙ;

    invoke-interface {v2, v1}, Ll/ܳ᩸ۙ;->ۙ(Ll/۫᩸ۙ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    .line 1668
    invoke-virtual {v0, v1}, Ll/֫᩸ۙ;->ۙ(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ۙ(Landroid/view/inputmethod/EditorInfo;)V
    .locals 3

    .line 1720
    iget-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    iget-object v1, p0, Ll/۠ۤۙ;->᩷:Ll/۠᩸ۙ;

    invoke-virtual {v1}, Ll/۠᩸ۙ;->ۤ()I

    move-result v1

    const-string v2, "android.support.text.emoji.emojiCompat_metadataVersion"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 1721
    iget-object p1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    const-string v0, "android.support.text.emoji.emojiCompat_replaceAll"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ۙ(Ll/۠᩸ۙ;)V
    .locals 5

    .line 1680
    iput-object p1, p0, Ll/۠ۤۙ;->᩷:Ll/۠᩸ۙ;

    .line 1681
    new-instance p1, Ll/ܰ᩸ۙ;

    iget-object v0, p0, Ll/۠ۤۙ;->᩷:Ll/۠᩸ۙ;

    iget-object v1, p0, Ll/۠ۤۙ;->ۙ:Ll/֫᩸ۙ;

    .line 1683
    invoke-static {v1}, Ll/֫᩸ۙ;->ۙ(Ll/֫᩸ۙ;)Ll/۬ۤۙ;

    move-result-object v1

    iget-object v2, p0, Ll/۠ۤۙ;->ۙ:Ll/֫᩸ۙ;

    .line 1684
    invoke-static {v2}, Ll/֫᩸ۙ;->᩷(Ll/֫᩸ۙ;)Ll/ۙ᩸ۙ;

    move-result-object v2

    .line 34
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x22

    if-lt v3, v4, :cond_0

    .line 48
    invoke-static {}, Ll/᩵᩸ۙ;->ۙ()Ljava/util/Set;

    move-result-object v3

    goto :goto_0

    .line 37
    :cond_0
    invoke-static {}, Ll/᩵᩸ۙ;->ۙ()Ljava/util/Set;

    move-result-object v3

    .line 1687
    :goto_0
    invoke-direct {p1, v0, v1, v2, v3}, Ll/ܰ᩸ۙ;-><init>(Ll/۠᩸ۙ;Ll/۬ۤۙ;Ll/ۙ᩸ۙ;Ljava/util/Set;)V

    iput-object p1, p0, Ll/۠ۤۙ;->ۤ:Ll/ܰ᩸ۙ;

    .line 1690
    iget-object p1, p0, Ll/۠ۤۙ;->ۙ:Ll/֫᩸ۙ;

    invoke-virtual {p1}, Ll/֫᩸ۙ;->ۤ()V

    return-void
.end method

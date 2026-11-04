.class public abstract Ll/ۜܽ᩸;
.super Ll/ۧ۫ۙ;
.source "CB3L"


# instance fields
.field public ֡:Ll/ۘܶ᩸;

.field public ۟:Ll/ۨۧۧ;

.field public ۢ:Ll/֨ܰ᩸;

.field public final ܰ:Landroid/os/Bundle;

.field public ܿ:Landroid/graphics/drawable/Drawable;

.field public final ᩳ:Ljava/lang/Object;

.field public ᩶:Ll/ۧܶ᩸;


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, 0x7f0d0053

    .line 45
    invoke-direct {p0, v0}, Ll/ۧ۫ۙ;-><init>(I)V

    .line 31
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۜܽ᩸;->ᩳ:Ljava/lang/Object;

    .line 40
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    return-void
.end method

.method private ۙ(Ljava/lang/String;Z)Z
    .locals 2

    .line 302
    iget-object v0, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eq v1, p2, :cond_0

    .line 303
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 304
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۜܽ᩸;->ۙ([Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 50
    invoke-super {p0, p1}, Ll/ۧ۫ۙ;->onCreate(Landroid/os/Bundle;)V

    .line 51
    new-instance v0, Ll/ܶܺۙ;

    move-object v1, p0

    check-cast v1, Ll/۟ܰ᩸;

    .line 401
    invoke-virtual {v1}, Ll/ۧ۫ۙ;->requireActivity()Ll/ۗ۫ۙ;

    move-result-object v1

    check-cast v1, Ll/ܿۛ᩸;

    .line 51
    invoke-direct {v0, v1}, Ll/ܶܺۙ;-><init>(Ll/ۗܺۙ;)V

    const-class v1, Ll/֨ܰ᩸;

    invoke-virtual {v0, v1}, Ll/ܶܺۙ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object v0

    check-cast v0, Ll/֨ܰ᩸;

    iput-object v0, p0, Ll/ۜܽ᩸;->ۢ:Ll/֨ܰ᩸;

    .line 52
    new-instance v0, Ll/ܶܺۙ;

    invoke-virtual {p0}, Ll/ۧ۫ۙ;->requireActivity()Ll/ۗ۫ۙ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ܶܺۙ;-><init>(Ll/ۗܺۙ;)V

    const-class v1, Ll/ۨۧۧ;

    invoke-virtual {v0, v1}, Ll/ܶܺۙ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object v0

    check-cast v0, Ll/ۨۧۧ;

    iput-object v0, p0, Ll/ۜܽ᩸;->۟:Ll/ۨۧۧ;

    .line 53
    new-instance v0, Ll/ܶܺۙ;

    invoke-direct {v0, p0}, Ll/ܶܺۙ;-><init>(Ll/ۗܺۙ;)V

    const-class v1, Ll/ۧܶ᩸;

    invoke-virtual {v0, v1}, Ll/ܶܺۙ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object v0

    check-cast v0, Ll/ۧܶ᩸;

    iput-object v0, p0, Ll/ۜܽ᩸;->᩶:Ll/ۧܶ᩸;

    if-eqz p1, :cond_1

    .line 56
    :try_start_0
    invoke-virtual {p0}, Ll/ۜܽ᩸;->᩹()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 v0, 0x1

    .line 59
    invoke-virtual {p0, v0}, Ll/ۜܽ᩸;->ۤ(Z)Z

    .line 60
    iget-object v0, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v1, "filePath"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "untitled"

    .line 61
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    :cond_0
    iget-object v0, p0, Ll/ۜܽ᩸;->ۢ:Ll/֨ܰ᩸;

    invoke-virtual {v0, p1}, Ll/֨ܰ᩸;->ۙ(Ljava/lang/Throwable;)V

    .line 66
    :cond_1
    iget-object p1, p0, Ll/ۜܽ᩸;->᩶:Ll/ۧܶ᩸;

    invoke-virtual {p0}, Ll/ۜܽ᩸;->ܺ()Z

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۧܶ᩸;->۫(Z)V

    return-void
.end method

.method public onPause()V
    .locals 1

    .line 396
    invoke-super {p0}, Ll/ۧ۫ۙ;->onPause()V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 352
    invoke-virtual {p0, v0}, Ll/ۜܽ᩸;->ۙ([Ljava/lang/String;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 390
    invoke-super {p0, p1}, Ll/ۧ۫ۙ;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 391
    invoke-virtual {p0}, Ll/ۜܽ᩸;->᩵()V

    return-void
.end method

.method public final ֫()Z
    .locals 2

    const-string v0, "error"

    .line 298
    iget-object v1, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final ۗ()V
    .locals 1

    .line 311
    move-object v0, p0

    check-cast v0, Ll/۟ܰ᩸;

    .line 405
    invoke-virtual {v0}, Ll/ۧ۫ۙ;->getActivity()Ll/ۗ۫ۙ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 407
    check-cast v0, Ll/ܿۛ᩸;

    invoke-virtual {v0}, Ll/ܿۛ᩸;->ܳۙ()V

    :cond_0
    return-void
.end method

.method public final ۙ(I)V
    .locals 3

    const/4 v0, 0x0

    .line 175
    iget-object v1, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v2, "sideIconType"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-eq p1, v0, :cond_0

    .line 180
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const/4 p1, 0x0

    .line 181
    iput-object p1, p0, Ll/ۜܽ᩸;->ܿ:Landroid/graphics/drawable/Drawable;

    .line 182
    invoke-virtual {p0}, Ll/ۜܽ᩸;->ۗ()V

    .line 183
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۜܽ᩸;->ۙ([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ۙ(J)V
    .locals 5

    .line 289
    iget-object v0, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v1, "fileTime"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v4, v2, p1

    if-eqz v4, :cond_0

    .line 290
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 291
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۜܽ᩸;->ۙ([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public varargs abstract ۙ([Ljava/lang/String;)V
.end method

.method public final ۙ(Z)Z
    .locals 1

    const-string v0, "changed"

    .line 265
    invoke-direct {p0, v0, p1}, Ll/ۜܽ᩸;->ۙ(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final ۚ()Z
    .locals 2

    const-string v0, "changed"

    .line 298
    iget-object v1, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final ۤ()Ll/ۡܰ᩸;
    .locals 3

    .line 251
    iget-object v0, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v1, "filePath"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    new-instance v1, Ll/ۡܰ᩸;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v0, v2}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ۡܰ᩸;-><init>(Ll/᩷ۨᩴ;)V

    return-object v1
.end method

.method public ۤ(Z)Z
    .locals 1

    const-string v0, "error"

    .line 273
    invoke-direct {p0, v0, p1}, Ll/ۜܽ᩸;->ۙ(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 3

    .line 105
    invoke-virtual {p0}, Ll/ۧ۫ۙ;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "top"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final ۫()Ljava/lang/String;
    .locals 2

    .line 101
    invoke-virtual {p0}, Ll/ۧ۫ۙ;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "state"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final ܳ()Ll/᩷ۨᩴ;
    .locals 1

    .line 159
    invoke-virtual {p0}, Ll/ۜܽ᩸;->۫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۨ᩸;->᩷(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ܶ()Ll/ۘܶ᩸;
    .locals 2

    .line 362
    iget-object v0, p0, Ll/ۜܽ᩸;->֡:Ll/ۘܶ᩸;

    if-nez v0, :cond_0

    .line 363
    invoke-static {}, Ll/᩶ۨ᩸;->ۙ()Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۛ۬᩹;->of(Ljava/lang/String;[Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۜܽ᩸;->۫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/֨ܶ᩸;->᩷(Ljava/lang/String;Ll/᩺۬᩹;)Ll/᩺۬᩹;

    move-result-object v0

    .line 364
    invoke-static {v0}, Ll/ۘܶ᩸;->ۙ(Ll/᩺۬᩹;)Ll/ۘܶ᩸;

    move-result-object v0

    iput-object v0, p0, Ll/ۜܽ᩸;->֡:Ll/ۘܶ᩸;

    .line 366
    :cond_0
    iget-object v0, p0, Ll/ۜܽ᩸;->֡:Ll/ۘܶ᩸;

    return-object v0
.end method

.method public abstract ܺ()Z
.end method

.method public final ܽ()Z
    .locals 2

    .line 225
    iget-object v0, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v1, "filePath"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "untitled"

    .line 226
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩴ()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 74
    iget-object v0, p0, Ll/ۜܽ᩸;->ܿ:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    const-string v0, "sideIconType"

    const/4 v1, 0x0

    .line 175
    iget-object v2, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-virtual {v2, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f0802bd

    goto :goto_0

    :cond_0
    const v0, 0x7f0802bc

    .line 75
    :goto_0
    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Ll/ۜܽ᩸;->ܿ:Landroid/graphics/drawable/Drawable;

    .line 77
    :cond_1
    iget-object v0, p0, Ll/ۜܽ᩸;->ܿ:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public abstract ᩵()V
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 2

    .line 90
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    .line 92
    invoke-virtual {p0}, Ll/ۧ۫ۙ;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    .line 94
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_0
    const-string v1, "state"

    .line 96
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    invoke-virtual {p0, v0}, Ll/ۧ۫ۙ;->setArguments(Landroid/os/Bundle;)V

    return-void
.end method

.method public final ᩷(Z)V
    .locals 1

    const-string v0, "checkFileExists"

    .line 281
    invoke-direct {p0, v0, p1}, Ll/ۜܽ᩸;->ۙ(Ljava/lang/String;Z)Z

    return-void
.end method

.method public final ᩷()Z
    .locals 2

    .line 221
    iget-object v0, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v1, "filePath"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩸()I
    .locals 3

    .line 201
    iget-object v0, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v1, "pageCount"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-eq v0, v2, :cond_0

    return v0

    .line 203
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final ᩹()V
    .locals 4

    .line 315
    invoke-static {}, Ll/᩶ۨ᩸;->ۙ()Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-static {v0, v2}, Ll/ۛ۬᩹;->of(Ljava/lang/String;[Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۜܽ᩸;->۫()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Ll/֨ܶ᩸;->᩷(Ljava/lang/String;Ll/᩺۬᩹;)Ll/᩺۬᩹;

    move-result-object v0

    .line 316
    invoke-static {v0}, Ll/ۢ᩵᩸;->ۙ(Ll/᩺۬᩹;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 318
    :try_start_0
    iget-object v1, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/Bundle;->clear()V

    iget-object v1, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-static {v0}, Ll/֨᩵᩸;->ۙ(Ll/᩺۬᩹;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 321
    iget-object v1, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v2, "filePath"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v2, "filePath"

    const-string v3, "untitled"

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    :cond_0
    iget-object v1, p0, Ll/ۜܽ᩸;->ۢ:Ll/֨ܰ᩸;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Ll/֨ܰ᩸;->ۙ(Ljava/lang/Throwable;)V

    .line 324
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۜܽ᩸;->᩶:Ll/ۧܶ᩸;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ll/ۜܽ᩸;->ܺ()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۧܶ᩸;->۫(Z)V

    goto :goto_1

    .line 328
    :cond_2
    invoke-virtual {p0}, Ll/ۜܽ᩸;->ܶ()Ll/ۘܶ᩸;

    move-result-object v0

    iget-object v0, v0, Ll/ۘܶ᩸;->ۤ:Ljava/lang/Object;

    monitor-enter v0

    .line 171
    :try_start_1
    invoke-virtual {p0}, Ll/ۜܽ᩸;->۫()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩶ۨ᩸;->ۙ(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v2

    .line 330
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->֨()Z

    move-result v3

    if-nez v3, :cond_3

    .line 331
    monitor-exit v0

    return-void

    .line 333
    :cond_3
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܶ᩷()[B

    move-result-object v2

    .line 334
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 335
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 336
    array-length v3, v2

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 337
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 338
    iget-object v1, p0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->readFromParcel(Landroid/os/Parcel;)V

    .line 339
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 340
    iget-object v0, p0, Ll/ۜܽ᩸;->᩶:Ll/ۧܶ᩸;

    if-eqz v0, :cond_4

    .line 341
    invoke-virtual {p0}, Ll/ۜܽ᩸;->ܺ()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۧܶ᩸;->۫(Z)V

    :cond_4
    :goto_1
    return-void

    :catchall_0
    move-exception v1

    .line 334
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

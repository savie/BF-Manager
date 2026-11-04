.class public final Ll/᩷ܰ᩸;
.super Ll/ۢۜ᩸;
.source "3B3L"


# instance fields
.field public final synthetic ۤ:Ll/۟ܰ᩸;


# direct methods
.method public constructor <init>(Ll/۟ܰ᩸;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 349
    iput-object p1, p0, Ll/᩷ܰ᩸;->ۤ:Ll/۟ܰ᩸;

    return-void
.end method


# virtual methods
.method public final ۙ()I
    .locals 2

    .line 369
    iget-object v0, p0, Ll/᩷ܰ᩸;->ۤ:Ll/۟ܰ᩸;

    invoke-static {v0}, Ll/۟ܰ᩸;->ۢ(Ll/۟ܰ᩸;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/۟ܰ᩸;->ۨ(Ll/۟ܰ᩸;)Ll/ܶ᩵᩸;

    move-result-object v0

    iget v0, v0, Ll/ܶ᩵᩸;->᩻:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۙ(ILbin/mt/plugin/api/util/ResultCallback;)V
    .locals 2

    .line 371
    iget-object v0, p0, Ll/᩷ܰ᩸;->ۤ:Ll/۟ܰ᩸;

    invoke-static {v0}, Ll/۟ܰ᩸;->ۢ(Ll/۟ܰ᩸;)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Unsupported operation"

    .line 372
    invoke-interface {p2, p1}, Lbin/mt/plugin/api/util/ResultCallback;->onFailure(Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    const/4 v1, 0x0

    .line 375
    invoke-static {v0, p1, v1}, Ll/۟ܰ᩸;->ۙ(Ll/۟ܰ᩸;ILl/ۙ᩸ᩴ;)Ll/᩹ܽ᩵;

    move-result-object p1

    new-instance v0, Ll/֡ۗ᩸;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p2}, Ll/֡ۗ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    return-void
.end method

.method public final ۙ(Lbin/mt/plugin/api/util/ResultCallback;)V
    .locals 4

    .line 389
    iget-object v0, p0, Ll/᩷ܰ᩸;->ۤ:Ll/۟ܰ᩸;

    invoke-virtual {v0}, Ll/ۜܽ᩸;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/۟ܰ᩸;->ܽ(Ll/۟ܰ᩸;)Ll/᩺֨֫;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 390
    invoke-static {v0, p1}, Ll/۟ܰ᩸;->ۙ(Ll/۟ܰ᩸;Lbin/mt/plugin/api/util/ResultCallback;)V

    .line 391
    invoke-static {v0}, Ll/۟ܰ᩸;->ܽ(Ll/۟ܰ᩸;)Ll/᩺֨֫;

    move-result-object p1

    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    invoke-virtual {v0}, Ll/ۜܽ᩸;->ۤ()Ll/ۡܰ᩸;

    move-result-object v0

    .line 58
    iget-object v0, v0, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const v3, 0x7f1207b9

    .line 391
    invoke-virtual {p1, v2, v3, v0, v1}, Ll/᩺֨֫;->ۙ(Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)V

    return-void

    .line 401
    :cond_0
    invoke-virtual {v0}, Ll/ۧ۫ۙ;->requireActivity()Ll/ۗ۫ۙ;

    move-result-object v1

    check-cast v1, Ll/ܿۛ᩸;

    .line 393
    invoke-virtual {v0, v1, p1}, Ll/۟ܰ᩸;->ۙ(Ll/ܿۛ᩸;Lbin/mt/plugin/api/util/ResultCallback;)V

    return-void
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 2

    .line 360
    iget-object v0, p0, Ll/᩷ܰ᩸;->ۤ:Ll/۟ܰ᩸;

    iget-object v0, v0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v1, "filePath"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "untitled"

    .line 361
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 367
    iget-object v0, p0, Ll/᩷ܰ᩸;->ۤ:Ll/۟ܰ᩸;

    invoke-static {v0}, Ll/۟ܰ᩸;->ۢ(Ll/۟ܰ᩸;)Z

    move-result v0

    return v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 384
    iget-object v0, p0, Ll/᩷ܰ᩸;->ۤ:Ll/۟ܰ᩸;

    invoke-virtual {v0}, Ll/ۜܽ᩸;->ۚ()Z

    move-result v0

    return v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 2

    .line 353
    iget-object v0, p0, Ll/᩷ܰ᩸;->ۤ:Ll/۟ܰ᩸;

    iget-object v0, v0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v1, "filePath"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "untitled"

    return-object v0

    .line 354
    :cond_0
    invoke-static {v0}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()I
    .locals 2

    .line 368
    iget-object v0, p0, Ll/᩷ܰ᩸;->ۤ:Ll/۟ܰ᩸;

    invoke-static {v0}, Ll/۟ܰ᩸;->ۢ(Ll/۟ܰ᩸;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/۟ܰ᩸;->ۨ(Ll/۟ܰ᩸;)Ll/ܶ᩵᩸;

    move-result-object v0

    iget-object v0, v0, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    invoke-virtual {v0}, Ll/۬ܶ᩸;->ۤ()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

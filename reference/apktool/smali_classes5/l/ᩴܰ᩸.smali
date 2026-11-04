.class public final Ll/ᩴܰ᩸;
.super Ll/ۖۙܺ;
.source "3B3L"


# instance fields
.field public final synthetic ֫:Ll/۟ܰ᩸;

.field public final ۚ:Ll/ۧۤܺ;

.field public final synthetic ۧ:Ll/ܿۛ᩸;

.field public ۫:Ll/ܰܶܺ;

.field public ܳ:Ll/ܳܿ᩸;

.field public final synthetic ܺ:Ljava/lang/String;

.field public final synthetic ᩻:Ll/᩷ۨᩴ;


# direct methods
.method public constructor <init>(Ll/۟ܰ᩸;Ll/ܿۛ᩸;Ljava/lang/String;Ll/᩷ۨᩴ;)V
    .locals 0

    .line 1235
    iput-object p1, p0, Ll/ᩴܰ᩸;->֫:Ll/۟ܰ᩸;

    iput-object p2, p0, Ll/ᩴܰ᩸;->ۧ:Ll/ܿۛ᩸;

    iput-object p3, p0, Ll/ᩴܰ᩸;->ܺ:Ljava/lang/String;

    iput-object p4, p0, Ll/ᩴܰ᩸;->᩻:Ll/᩷ۨᩴ;

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    .line 1237
    invoke-virtual {p1}, Ll/ۧ۫ۙ;->getViewLifecycleOwner()Ll/ۤ᩻ۙ;

    move-result-object p1

    invoke-static {p1}, Ll/ۧۤܺ;->ۙ(Ll/ۤ᩻ۙ;)Ll/ۧۤܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴܰ᩸;->ۚ:Ll/ۧۤܺ;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 4

    .line 1257
    iget-object v0, p0, Ll/ᩴܰ᩸;->ۚ:Ll/ۧۤܺ;

    invoke-virtual {v0}, Ll/ۧۤܺ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1258
    :cond_0
    iget-object v0, p0, Ll/ᩴܰ᩸;->᩻:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v0

    iget-object v2, p0, Ll/ᩴܰ᩸;->֫:Ll/۟ܰ᩸;

    invoke-static {v2, v0, v1}, Ll/۟ܰ᩸;->ۙ(Ll/۟ܰ᩸;J)V

    .line 1259
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {v2}, Ll/ۧ۫ۙ;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v3, Ll/ۜ۬ۤ;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v0}, Ll/ۧ۫ۙ;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 2

    .line 1264
    iget-object v0, p0, Ll/ᩴܰ᩸;->ۚ:Ll/ۧۤܺ;

    invoke-virtual {v0}, Ll/ۧۤܺ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1265
    :cond_0
    iget-object v0, p0, Ll/ᩴܰ᩸;->ۧ:Ll/ܿۛ᩸;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 1266
    instance-of v0, p1, Ll/ۢܽۤ;

    if-eqz v0, :cond_1

    .line 1267
    check-cast p1, Ll/ۢܽۤ;

    invoke-virtual {p1}, Ll/ۢܽۤ;->ۙ()Ll/ۡܽۤ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۡܽۤ;->ۤ()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    .line 1269
    iget-object v0, p0, Ll/ᩴܰ᩸;->֫:Ll/۟ܰ᩸;

    iget-object v0, v0, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ܶ(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ᩴ()V
    .locals 4

    .line 1248
    iget-object v0, p0, Ll/ᩴܰ᩸;->ܳ:Ll/ܳܿ᩸;

    .line 1249
    :try_start_0
    invoke-static {v0}, Ll/ۡ۬ۤ;->᩷(Ljava/lang/CharSequence;)Ll/ܰܶܺ;

    move-result-object v1

    iput-object v1, p0, Ll/ᩴܰ᩸;->۫:Ll/ܰܶܺ;

    const-string v2, "<--id-c5skl23kjndf-->"

    .line 1250
    iget-object v3, p0, Ll/ᩴܰ᩸;->ܺ:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ll/ܰܶܺ;->ۙ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1251
    iget-object v1, p0, Ll/ᩴܰ᩸;->᩻:Ll/᩷ۨᩴ;

    iget-object v2, p0, Ll/ᩴܰ᩸;->۫:Ll/ܰܶܺ;

    .line 574
    invoke-virtual {v2}, Ll/ۨܶܺ;->᩷()Ljava/lang/String;

    move-result-object v2

    .line 1251
    invoke-virtual {v1, v2}, Ll/᩷ۨᩴ;->᩻(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 1252
    invoke-virtual {v0}, Ll/ܳܿ᩸;->close()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_1

    .line 1248
    :try_start_1
    invoke-virtual {v0}, Ll/ܳܿ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v1
.end method

.method public final ᩷()V
    .locals 2

    .line 1242
    iget-object v0, p0, Ll/ᩴܰ᩸;->֫:Ll/۟ܰ᩸;

    iget-object v0, v0, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-interface {v0}, Ll/ۡ᩶᩸;->ۘ()Ll/ܳܿ᩸;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴܰ᩸;->ܳ:Ll/ܳܿ᩸;

    .line 1243
    iget-object v0, p0, Ll/ᩴܰ᩸;->ۧ:Ll/ܿۛ᩸;

    iget-object v1, p0, Ll/ᩴܰ᩸;->ۚ:Ll/ۧۤܺ;

    invoke-virtual {p0, v0, v1}, Ll/ۖۙܺ;->ۙ(Ll/ܽ֡֫;Ll/ۧۤܺ;)V

    return-void
.end method

.method public final ᩸()V
    .locals 1

    .line 1275
    iget-object v0, p0, Ll/ᩴܰ᩸;->ܳ:Ll/ܳܿ᩸;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܳܿ᩸;->close()V

    .line 1276
    :cond_0
    invoke-virtual {p0}, Ll/ۖۙܺ;->ۤ()V

    return-void
.end method

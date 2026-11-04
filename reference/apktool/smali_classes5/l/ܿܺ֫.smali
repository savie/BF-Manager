.class public final Ll/ܿܺ֫;
.super Ll/ۖۙܺ;
.source "OIRX"


# instance fields
.field public final synthetic ֫:Ll/۟ܺ֫;

.field public ۚ:Ll/᩷ۨᩴ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public ۫:Ll/᩷ۨᩴ;

.field public ܳ:Ll/۠ۨܳ;

.field public final synthetic ᩻:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Ll/۟ܺ֫;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 167
    iput-object p1, p0, Ll/ܿܺ֫;->֫:Ll/۟ܺ֫;

    iput-object p2, p0, Ll/ܿܺ֫;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/ܿܺ֫;->᩻:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 6

    .line 191
    invoke-static {}, Ll/ۛۤۧ;->᩷()V

    .line 192
    iget-object v0, p0, Ll/ܿܺ֫;->֫:Ll/۟ܺ֫;

    invoke-static {v0}, Ll/۟ܺ֫;->᩸(Ll/۟ܺ֫;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 193
    :cond_0
    iget-object v1, p0, Ll/ܿܺ֫;->ܳ:Ll/۠ۨܳ;

    if-eqz v1, :cond_1

    iget-object v2, p0, Ll/ܿܺ֫;->ۚ:Ll/᩷ۨᩴ;

    invoke-virtual {v1, v2}, Ll/۠ۨܳ;->ۙ(Ll/᩷ۨᩴ;)V

    .line 194
    :cond_1
    invoke-static {v0}, Ll/۟ܺ֫;->ۙ(Ll/۟ܺ֫;)Ll/ܽ֡֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    const v2, 0x7f120a90

    invoke-virtual {v1, v2}, Ll/ۖۖۧ;->᩷(I)V

    invoke-static {v0}, Ll/۟ܺ֫;->ۙ(Ll/۟ܺ֫;)Ll/ܽ֡֫;

    move-result-object v2

    iget-object v3, p0, Ll/ܿܺ֫;->ۚ:Ll/᩷ۨᩴ;

    .line 195
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const v3, 0x7f120206

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    const v2, 0x7f1208c9

    const/4 v3, 0x0

    .line 196
    invoke-virtual {v1, v2, v3}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v1

    invoke-static {v0, v1}, Ll/۟ܺ֫;->ۙ(Ll/۟ܺ֫;Ll/۠ۖۧ;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 2

    .line 200
    iget-object v0, p0, Ll/ܿܺ֫;->֫:Ll/۟ܺ֫;

    invoke-static {v0}, Ll/۟ܺ֫;->᩸(Ll/۟ܺ֫;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/۟ܺ֫;->ۙ(Ll/۟ܺ֫;)Ll/ܽ֡֫;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_0
    return-void
.end method

.method public final ᩴ()V
    .locals 5

    .line 182
    iget-object v0, p0, Ll/ܿܺ֫;->۫:Ll/᩷ۨᩴ;

    if-nez v0, :cond_0

    const-string v0, "[:\\\\/*?<>\"|]"

    const-string v1, "_"

    .line 184
    iget-object v2, p0, Ll/ܿܺ֫;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s"

    const-string v2, " "

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 185
    invoke-static {}, Ll/ۛۨᩴ;->ۤ()Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ܿܺ֫;->۫:Ll/᩷ۨᩴ;

    .line 187
    :cond_0
    iget-object v0, p0, Ll/ܿܺ֫;->᩻:Landroid/graphics/Bitmap;

    iget-object v1, p0, Ll/ܿܺ֫;->۫:Ll/᩷ۨᩴ;

    const/4 v2, 0x1

    .line 1147
    invoke-virtual {v1, v2}, Ll/᩷ۨᩴ;->ۙ(Z)Ll/᩷ۨᩴ;

    move-result-object v1

    .line 217
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->۟()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    .line 446
    :try_start_0
    invoke-virtual {v1, v2}, Ll/᩷ۨᩴ;->ۤ(Z)Ljava/io/OutputStream;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 221
    :try_start_1
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x64

    invoke-virtual {v0, v3, v4, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_2

    if-eqz v2, :cond_1

    .line 224
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 187
    :cond_1
    iput-object v1, p0, Ll/ܿܺ֫;->ۚ:Ll/᩷ۨᩴ;

    return-void

    .line 222
    :cond_2
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Could not encode cover image"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz v2, :cond_3

    .line 220
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_5
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    .line 228
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ᩳ()Z

    .line 229
    throw v0

    .line 217
    :cond_4
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not create cover image: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v1, v2}, Ll/֨᩵ᩴ;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 217
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩷()V
    .locals 3

    .line 172
    invoke-static {}, Ll/ۛۤۧ;->ۙ()Lbin/mt/plus/Main;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 174
    invoke-virtual {v0}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v1

    sget-object v2, Ll/ۖۧۙ;->ۢ:Ll/ۖۧۙ;

    invoke-virtual {v1, v2}, Ll/ۖۧۙ;->ۙ(Ll/ۖۧۙ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 175
    invoke-virtual {v0}, Lbin/mt/plus/Main;->ۧۙ()Ll/ᩴ᩶ܳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 176
    invoke-virtual {v0}, Ll/ᩴ᩶ܳ;->ۚ()Ll/۠ۨܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ܿܺ֫;->ܳ:Ll/۠ۨܳ;

    .line 177
    iget-object v1, p0, Ll/ܿܺ֫;->ۧ:Ljava/lang/String;

    const/4 v2, 0x0

    .line 2157
    invoke-virtual {v0, v1, v2}, Ll/۠ۨܳ;->ۙ(Ljava/lang/String;Z)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 177
    iput-object v0, p0, Ll/ܿܺ֫;->۫:Ll/᩷ۨᩴ;

    :cond_0
    return-void
.end method

.method public final ᩸()V
    .locals 2

    .line 204
    iget-object v0, p0, Ll/ܿܺ֫;->֫:Ll/۟ܺ֫;

    invoke-static {v0}, Ll/۟ܺ֫;->ۤ(Ll/۟ܺ֫;)Landroid/view/MenuItem;

    move-result-object v1

    invoke-static {v0}, Ll/۟ܺ֫;->᩷(Ll/۟ܺ֫;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return-void
.end method

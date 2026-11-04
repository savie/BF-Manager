.class public final Ll/ᩴ֡;
.super Ljava/lang/Object;
.source "374"


# direct methods
.method public static ۙ(Ll/ܳ֡;)Landroid/app/Person;
    .locals 2

    .line 425
    new-instance v0, Landroid/app/Person$Builder;

    invoke-direct {v0}, Landroid/app/Person$Builder;-><init>()V

    .line 161
    iget-object v1, p0, Ll/ܳ֡;->᩸:Ljava/lang/String;

    .line 426
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setName(Ljava/lang/CharSequence;)Landroid/app/Person$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 427
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Person$Builder;

    move-result-object v0

    .line 185
    iget-object v1, p0, Ll/ܳ֡;->ᩴ:Ljava/lang/String;

    .line 428
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setUri(Ljava/lang/String;)Landroid/app/Person$Builder;

    move-result-object v0

    .line 194
    iget-object v1, p0, Ll/ܳ֡;->ۤ:Ljava/lang/String;

    .line 429
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setKey(Ljava/lang/String;)Landroid/app/Person$Builder;

    move-result-object v0

    .line 202
    iget-boolean v1, p0, Ll/ܳ֡;->ۙ:Z

    .line 430
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setBot(Z)Landroid/app/Person$Builder;

    move-result-object v0

    .line 210
    iget-boolean p0, p0, Ll/ܳ֡;->᩷:Z

    .line 431
    invoke-virtual {v0, p0}, Landroid/app/Person$Builder;->setImportant(Z)Landroid/app/Person$Builder;

    move-result-object p0

    .line 432
    invoke-virtual {p0}, Landroid/app/Person$Builder;->build()Landroid/app/Person;

    move-result-object p0

    return-object p0
.end method

.class public final synthetic Ll/ۢ᩺ᩴ;
.super Ljava/lang/Object;
.source "313P"

# interfaces
.implements Ll/ۚۘܳ;
.implements Ll/᩶ܽ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۢ᩺ᩴ;->ܰ:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۢ᩺ᩴ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۢ᩺ᩴ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ᩳܽۧ;

    iget-object v1, p0, Ll/ۢ᩺ᩴ;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/۟᩺᩻;

    invoke-static {v0, v1, p1}, Ll/ᩳܽۧ;->ۙ(Ll/ᩳܽۧ;Ll/۟᩺᩻;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 10

    .line 2
    iget-object v0, p0, Ll/ۢ᩺ᩴ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۠ۨܳ;

    .line 6
    iget-object v1, p0, Ll/ۢ᩺ᩴ;->᩶:Ljava/lang/Object;

    .line 8
    check-cast v1, Ll/ۖۗܳ;

    .line 136
    invoke-virtual {v0}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v0

    sget v2, Ll/ۧۤ᩻;->ۧ᩷:I

    const/4 v2, 0x0

    .line 411
    :try_start_0
    new-instance v3, Ljava/io/DataInputStream;

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۧ᩷()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 412
    :try_start_1
    invoke-virtual {v3}, Ljava/io/DataInputStream;->readInt()I

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    int-to-long v4, v4

    const-wide/32 v6, 0x7f454c46

    cmp-long v8, v4, v6

    if-nez v8, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 416
    :goto_0
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    nop

    goto :goto_2

    :catchall_0
    move-exception v4

    .line 411
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v3

    :try_start_4
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    const/4 v4, 0x0

    :goto_2
    const v3, 0x7f120aaf

    .line 419
    invoke-static {v3}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v3

    .line 420
    new-instance v5, Landroid/text/SpannableString;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, "\n"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v7, 0x7f120d46

    invoke-static {v7}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 421
    new-instance v6, Landroid/text/style/ForegroundColorSpan;

    sget v7, Ll/ۗۡ֫;->᩸ۙ:I

    invoke-direct {v6, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v5}, Landroid/text/SpannableString;->length()I

    move-result v8

    const/16 v9, 0x11

    invoke-virtual {v5, v6, v7, v8, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 422
    new-instance v6, Landroid/text/style/AbsoluteSizeSpan;

    const/high16 v7, 0x41400000    # 12.0f

    invoke-static {v7}, Ll/ۜۙܺ;->ۤ(F)I

    move-result v7

    invoke-direct {v6, v7}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v5}, Landroid/text/SpannableString;->length()I

    move-result v8

    invoke-virtual {v5, v6, v7, v8, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 424
    invoke-virtual {v0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v6

    .line 425
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ll/ۖۖۧ;->᩷(Ljava/lang/CharSequence;)V

    .line 478
    sget-object v7, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v8, "ewrp"

    invoke-interface {v7, v8, v2}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_1

    move-object v7, v5

    goto :goto_3

    :cond_1
    move-object v7, v3

    .line 426
    :goto_3
    invoke-virtual {v6, v7}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    new-instance v7, Ll/ܳۖᩴ;

    const/4 v8, 0x2

    invoke-direct {v7, v0, p1, v1, v8}, Ll/ܳۖᩴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v8, 0x7f120315

    .line 427
    invoke-virtual {v6, v8, v7}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v7, Ll/ۙۤ᩻;

    invoke-direct {v7, v0, p1, v1}, Ll/ۙۤ᩻;-><init>(Ll/ܽ֡֫;Ll/᩷ۨᩴ;Ll/ۖۗܳ;)V

    const p1, 0x7f1202e1

    .line 431
    invoke-virtual {v6, p1, v7}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120b08

    const/4 v0, 0x0

    .line 435
    invoke-virtual {v6, p1, v0}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 436
    invoke-virtual {v6}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p1

    if-eqz v4, :cond_2

    .line 438
    invoke-virtual {p1}, Ll/۠ۖۧ;->ۤ()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 440
    :cond_2
    invoke-static {p1}, Ll/ۚۙܺ;->ۙ(Ll/۠ۖۧ;)V

    .line 441
    invoke-virtual {p1}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/᩷ۤ᩻;

    invoke-direct {v1, p1, v5, v3, v2}, Ll/᩷ۤ᩻;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.class public final Ll/ᩳۜ᩸;
.super Ljava/lang/Object;
.source "YAH9"


# direct methods
.method public static ֫(Ll/᩺ۜ᩸;)V
    .locals 9

    .line 248
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 249
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v1

    const/4 v2, 0x0

    .line 250
    aget v3, v1, v2

    const/4 v4, 0x1

    .line 251
    aget v1, v1, v4

    .line 4718
    iget-object v5, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {v5}, Ll/ۚۚܺ;->ܽ()I

    move-result v5

    const/16 v6, 0x20

    const-string v7, "\t"

    if-ne v3, v1, :cond_3

    .line 255
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ᩳ᩷()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 256
    invoke-interface {v0, v3, v7}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    return-void

    .line 258
    :cond_0
    invoke-static {v3, v0}, Ll/ᩳۜ᩸;->᩷(ILjava/lang/CharSequence;)I

    move-result p0

    const/4 v1, 0x0

    :goto_0
    if-ge p0, v3, :cond_2

    .line 261
    invoke-interface {v0, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v4, 0x9

    if-ne v2, v4, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    :goto_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    .line 267
    :cond_2
    rem-int/2addr v1, v5

    sub-int/2addr v5, v1

    .line 649
    new-array p0, v5, [C

    .line 650
    invoke-static {p0, v6}, Ljava/util/Arrays;->fill([CC)V

    .line 651
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p0}, Ljava/lang/String;-><init>([C)V

    .line 268
    invoke-interface {v0, v3, v1}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    return-void

    .line 271
    :cond_3
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ᩳ᩷()Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_2

    .line 649
    :cond_4
    new-array v5, v5, [C

    .line 650
    invoke-static {v5, v6}, Ljava/util/Arrays;->fill([CC)V

    .line 651
    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, v5}, Ljava/lang/String;-><init>([C)V

    .line 272
    :goto_2
    invoke-static {v3, v0}, Ll/ᩳۜ᩸;->᩷(ILjava/lang/CharSequence;)I

    move-result v5

    .line 273
    invoke-interface {v0, v5, v7}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 274
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v3

    .line 275
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v1

    .line 276
    invoke-static {v5, v0}, Ll/ᩳۜ᩸;->ۙ(ILjava/lang/CharSequence;)I

    move-result v1

    :goto_3
    add-int/2addr v1, v4

    if-le v1, v3, :cond_5

    .line 285
    invoke-virtual {p0, v5, v3}, Ll/᩺ۜ᩸;->ۧ(II)V

    .line 1061
    invoke-virtual {p0, v2}, Ll/᩺ۜ᩸;->᩸(Z)V

    return-void

    .line 281
    :cond_5
    invoke-interface {v0, v1, v7}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 282
    invoke-static {v1, v0}, Ll/ᩳۜ᩸;->ۙ(ILjava/lang/CharSequence;)I

    move-result v1

    .line 283
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v3, v6

    goto :goto_3
.end method

.method public static ۙ(ILjava/lang/CharSequence;)I
    .locals 1

    const/16 v0, 0xa

    .line 642
    invoke-static {p1, v0, p0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result p0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    .line 644
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p0

    :cond_0
    return p0
.end method

.method public static ۙ(Ll/ᩳ۬᩸;II)I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p2, :cond_2

    add-int v2, p1, v0

    .line 329
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lt v2, v3, :cond_0

    goto :goto_1

    .line 331
    :cond_0
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x20

    if-ne v2, v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/16 p2, 0x9

    if-ne v2, p2, :cond_2

    add-int/lit8 v1, v1, 0x1

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    add-int p2, p1, v1

    .line 342
    invoke-interface {p0, p1, p2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    :cond_3
    return v1
.end method

.method public static ۙ(Ll/ܽ֡֫;Ll/᩺ۜ᩸;Ljava/lang/Exception;ZZLjava/lang/Runnable;)V
    .locals 5

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    .line 481
    instance-of p3, p2, Ll/ۚ᩸᩻;

    if-eqz p3, :cond_1

    check-cast p2, Ll/ۚ᩸᩻;

    .line 484
    invoke-virtual {p2}, Ll/ۚ᩸᩻;->᩷()I

    move-result p3

    invoke-virtual {p2}, Ll/ۚ᩸᩻;->ۙ()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ll/ܳۧۧ;->ۙ(II)Ll/ܳۧۧ;

    move-result-object p3

    invoke-virtual {p3, p1}, Ll/ܳۧۧ;->ۙ(Ll/᩺ۜ᩸;)V

    .line 485
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    const p3, 0x7f120310

    .line 486
    invoke-virtual {p1, p3}, Ll/ۖۖۧ;->᩷(I)V

    .line 488
    invoke-virtual {p2}, Ll/ۚ᩸᩻;->᩷()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2}, Ll/ۚ᩸᩻;->ۙ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p3, v3, v4

    aput-object v1, v3, v2

    const/4 p3, 0x2

    aput-object p2, v3, p3

    const p2, 0x7f120408

    .line 487
    invoke-virtual {p0, p2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    if-eqz p4, :cond_0

    const p0, 0x7f120407

    goto :goto_0

    :cond_0
    const p0, 0x7f120406

    .line 489
    :goto_0
    new-instance p2, Ll/ۘۜ᩸;

    invoke-direct {p2, v4, p5}, Ll/ۘۜ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p0, p2}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12018c

    .line 491
    invoke-virtual {p1, p0, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 492
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void

    .line 546
    :cond_1
    invoke-virtual {p0, p2, v0}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩺ۜ᩸;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, v0}, Ll/ᩳۜ᩸;->᩷(Ll/᩺ۜ᩸;Z)V

    return-void
.end method

.method public static ۙ(Ll/᩺ۜ᩸;Ll/۠ܿ᩸;)V
    .locals 3

    .line 501
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 502
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v1

    .line 504
    :try_start_0
    new-instance v2, Ll/ܰۜ᩸;

    invoke-direct {v2, p0, v0, p1, v1}, Ll/ܰۜ᩸;-><init>(Ll/᩺ۜ᩸;Ll/ᩳ۬᩸;Ll/۠ܿ᩸;I)V

    invoke-interface {v0, v2}, Ll/ᩳ۬᩸;->ۙ(Ljava/lang/Runnable;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 513
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ll/᩺ۜ᩸;->֫ۙ:Ll/۫ۜ᩸;

    if-eqz p1, :cond_0

    .line 514
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۛ()Z

    move-result v0

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۨ()Z

    move-result v1

    invoke-interface {p1, v0, v1}, Ll/۫ۜ᩸;->ۙ(ZZ)V

    .line 517
    :cond_0
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->֫᩸()V

    return-void

    .line 510
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Text editor is not ready for formatted output"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 513
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Ll/᩺ۜ᩸;->֫ۙ:Ll/۫ۜ᩸;

    if-eqz v0, :cond_2

    .line 514
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۛ()Z

    move-result v1

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۨ()Z

    move-result p0

    invoke-interface {v0, v1, p0}, Ll/۫ۜ᩸;->ۙ(ZZ)V

    .line 516
    :cond_2
    throw p1
.end method

.method public static ۙ(Ll/᩺ۜ᩸;Z)V
    .locals 5

    .line 233
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 234
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v1

    const/4 v2, 0x0

    .line 235
    aget v3, v1, v2

    const/4 v4, 0x1

    .line 236
    aget v1, v1, v4

    if-ne v3, v1, :cond_0

    const p0, 0x7f12077c

    .line 238
    invoke-static {p0}, Ll/᩸۠ۧ;->᩷(I)V

    return-void

    .line 241
    :cond_0
    invoke-interface {v0, v3, v1}, Ll/ۡ᩶᩸;->᩷(II)Ljava/lang/String;

    move-result-object v4

    if-eqz p1, :cond_1

    .line 242
    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 243
    :goto_0
    invoke-interface {v0, v3, v1, p1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 1061
    invoke-virtual {p0, v2}, Ll/᩺ۜ᩸;->᩸(Z)V

    return-void
.end method

.method public static ۚ(Ll/᩺ۜ᩸;)V
    .locals 8

    .line 211
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 212
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v1

    const/4 v2, 0x0

    .line 213
    aget v3, v1, v2

    const/4 v4, 0x1

    .line 214
    aget v1, v1, v4

    sub-int/2addr v3, v4

    const/16 v5, 0xa

    .line 215
    invoke-static {v0, v5, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v3

    add-int/2addr v3, v4

    .line 216
    invoke-static {v0, v5, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1

    add-int/2addr v1, v4

    if-nez v1, :cond_0

    .line 218
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    :cond_0
    const/4 v4, 0x0

    move v6, v3

    :goto_0
    if-ge v6, v1, :cond_2

    .line 221
    invoke-interface {v0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-ne v7, v5, :cond_1

    add-int/lit8 v4, v4, 0x1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 225
    :cond_2
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ne v1, v6, :cond_3

    add-int v6, v3, v4

    goto :goto_1

    :cond_3
    add-int v6, v3, v4

    add-int/lit8 v6, v6, -0x1

    .line 226
    :goto_1
    invoke-static {v5, v4}, Ll/᩺ۨۨ;->ۙ(CI)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v1, v4}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 227
    invoke-virtual {p0, v6}, Ll/᩺ۜ᩸;->᩹(I)V

    .line 1061
    invoke-virtual {p0, v2}, Ll/᩺ۜ᩸;->᩸(Z)V

    .line 229
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->֫᩸()V

    return-void
.end method

.method public static ۤ(Ll/᩺ۜ᩸;)V
    .locals 5

    .line 111
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 112
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v1

    const/4 v2, 0x0

    .line 113
    aget v2, v1, v2

    const/4 v3, 0x1

    .line 114
    aget v1, v1, v3

    sub-int/2addr v2, v3

    const/16 v4, 0xa

    .line 115
    invoke-static {v0, v4, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v2

    add-int/2addr v2, v3

    .line 116
    invoke-static {v0, v4, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    .line 118
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 119
    :cond_0
    invoke-virtual {p0, v2, v1}, Ll/᩺ۜ᩸;->ۧ(II)V

    .line 120
    invoke-interface {v0, v2, v1}, Ll/ۡ᩶᩸;->᩷(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "\n"

    .line 121
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 122
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 123
    :cond_1
    invoke-static {p0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ۤ(Ll/᩺ۜ᩸;Z)V
    .locals 3

    .line 9256
    iget-object v0, p0, Ll/᩺ۜ᩸;->۠᩸:Ll/֨ܽᩴ;

    invoke-virtual {v0}, Ll/֨ܽᩴ;->ᩴ()Ll/۠֫ᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    const p0, 0x7f120b37

    .line 421
    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 424
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Ll/ۗۚܺ;->ۙ(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v1

    check-cast v1, Ll/ܽ֡֫;

    .line 425
    new-instance v2, Ll/۟ۜ᩸;

    invoke-direct {v2, p0, v1, v0, p1}, Ll/۟ۜ᩸;-><init>(Ll/᩺ۜ᩸;Ll/ܽ֡֫;Ll/۠֫ᩴ;Z)V

    .line 475
    invoke-virtual {v2}, Ll/ۖۙܺ;->۫()V

    return-void
.end method

.method public static ۧ(Ll/᩺ۜ᩸;)V
    .locals 1

    const/4 v0, 0x1

    .line 347
    invoke-static {p0, v0}, Ll/ᩳۜ᩸;->᩷(Ll/᩺ۜ᩸;Z)V

    return-void
.end method

.method public static ۫(Ll/᩺ۜ᩸;)V
    .locals 8

    .line 167
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 168
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v1

    const/4 v2, 0x0

    .line 169
    aget v3, v1, v2

    const/4 v4, 0x1

    .line 170
    aget v5, v1, v4

    sub-int/2addr v3, v4

    const/16 v6, 0xa

    .line 171
    invoke-static {v0, v6, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v3

    add-int/2addr v3, v4

    .line 172
    invoke-static {v0, v6, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v5

    add-int/2addr v5, v4

    if-nez v5, :cond_0

    .line 175
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    .line 176
    invoke-interface {v0, v6}, Landroid/text/Editable;->append(C)Landroid/text/Editable;

    .line 177
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    .line 178
    aget v7, v1, v2

    add-int/2addr v7, v4

    aput v7, v1, v2

    .line 179
    aget v7, v1, v4

    add-int/2addr v7, v4

    aput v7, v1, v4

    goto :goto_0

    :cond_0
    move v6, v5

    :goto_0
    sub-int v7, v5, v3

    .line 184
    invoke-interface {v0, v3, v5}, Ll/ۡ᩶᩸;->᩷(II)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v6, v3}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 185
    aget v0, v1, v2

    add-int/2addr v0, v7

    aget v1, v1, v4

    add-int/2addr v1, v7

    invoke-virtual {p0, v0, v1}, Ll/᩺ۜ᩸;->ۧ(II)V

    .line 1061
    invoke-virtual {p0, v2}, Ll/᩺ۜ᩸;->᩸(Z)V

    return-void
.end method

.method public static ۫(Ll/᩺ۜ᩸;Z)V
    .locals 3

    .line 50
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 51
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/16 v2, 0xa

    invoke-static {v0, v2, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-eqz p1, :cond_0

    .line 53
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result p1

    invoke-virtual {p0, p1, v0}, Ll/᩺ۜ᩸;->ۧ(II)V

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p0, v0}, Ll/᩺ۜ᩸;->᩹(I)V

    .line 56
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->֫᩸()V

    :goto_0
    const/4 p1, 0x0

    .line 1378
    invoke-virtual {p0, v0, p1}, Ll/᩺ۜ᩸;->ۙ(IZ)Z

    return-void
.end method

.method public static ܳ(Ll/᩺ۜ᩸;)V
    .locals 6

    .line 190
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 191
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 194
    :cond_0
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v1

    const/4 v2, 0x0

    .line 195
    aget v2, v1, v2

    const/4 v3, 0x1

    .line 196
    aget v1, v1, v3

    sub-int/2addr v2, v3

    const/16 v4, 0xa

    .line 197
    invoke-static {v0, v4, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v2

    add-int/lit8 v5, v2, 0x1

    .line 198
    invoke-static {v0, v4, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1

    add-int/2addr v1, v3

    if-nez v1, :cond_1

    .line 200
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v5, :cond_1

    goto :goto_0

    :cond_1
    move v2, v5

    .line 205
    :goto_0
    invoke-interface {v0, v2, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 206
    invoke-virtual {p0, v2}, Ll/᩺ۜ᩸;->᩹(I)V

    .line 207
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->֫᩸()V

    return-void
.end method

.method public static ܳ(Ll/᩺ۜ᩸;Z)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 87
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result p1

    invoke-virtual {p0, p1, v0}, Ll/᩺ۜ᩸;->ۧ(II)V

    goto :goto_0

    .line 89
    :cond_0
    invoke-virtual {p0, v0}, Ll/᩺ۜ᩸;->᩹(I)V

    .line 90
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->֫᩸()V

    .line 1378
    :goto_0
    invoke-virtual {p0, v0, v0}, Ll/᩺ۜ᩸;->ۙ(IZ)Z

    return-void
.end method

.method public static ܺ(Ll/᩺ۜ᩸;)V
    .locals 1

    const/4 v0, 0x1

    .line 415
    invoke-static {p0, v0}, Ll/ᩳۜ᩸;->ۤ(Ll/᩺ۜ᩸;Z)V

    return-void
.end method

.method public static ܽ(Ll/᩺ۜ᩸;)V
    .locals 15

    .line 521
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->᩸᩷()Ljava/util/List;

    move-result-object v0

    .line 522
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const p0, 0x7f120c4f

    .line 523
    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 526
    :cond_0
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    .line 527
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v2

    const/4 v3, 0x0

    .line 528
    aget v4, v2, v3

    const/4 v5, 0x1

    aget v6, v2, v5

    if-ne v4, v6, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 530
    :goto_0
    invoke-static {v4, v1}, Ll/ᩳۜ᩸;->᩷(ILjava/lang/CharSequence;)I

    move-result v4

    .line 531
    aget v7, v2, v3

    invoke-static {v7, v1}, Ll/ᩳۜ᩸;->ۙ(ILjava/lang/CharSequence;)I

    move-result v7

    .line 532
    new-instance v8, Ll/ܰܿ᩹;

    invoke-direct {v8}, Ll/ܰܿ᩹;-><init>()V

    .line 533
    new-instance v9, Ll/ܰܿ᩹;

    invoke-direct {v9}, Ll/ܰܿ᩹;-><init>()V

    .line 534
    invoke-virtual {v8, v4}, Ll/ܰܿ᩹;->add(I)Z

    .line 535
    invoke-virtual {v9, v7}, Ll/ܰܿ᩹;->add(I)Z

    const/4 v4, 0x1

    :goto_1
    add-int/2addr v7, v5

    .line 539
    aget v10, v2, v5

    if-le v7, v10, :cond_d

    .line 550
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    if-ne v7, v5, :cond_2

    move-object v7, v0

    goto :goto_2

    .line 553
    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 554
    invoke-static {v7}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 556
    :goto_2
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۜ᩹ᩴ;

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v4, :cond_4

    .line 559
    invoke-virtual {v8, v11}, Ll/ܰܿ᩹;->getInt(I)I

    move-result v12

    invoke-virtual {v9, v11}, Ll/ܰܿ᩹;->getInt(I)I

    move-result v13

    invoke-interface {v10, v1, v12, v13}, Ll/ۜ᩹ᩴ;->ۙ(Ll/ᩳ۬᩸;II)Z

    move-result v12

    if-nez v12, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_4
    const/4 v7, 0x1

    goto :goto_5

    :cond_5
    const/4 v10, 0x0

    const/4 v7, 0x0

    :goto_5
    if-nez v10, :cond_8

    .line 572
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۜ᩹ᩴ;

    .line 573
    instance-of v13, v12, Ll/۬᩹ᩴ;

    if-eqz v13, :cond_6

    move-object v10, v12

    :cond_7
    if-nez v10, :cond_8

    .line 579
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ll/ۜ᩹ᩴ;

    .line 583
    :cond_8
    invoke-interface {v1}, Ll/ᩳ۬᩸;->ܺۙ()Ll/ۢ᩶᩸;

    move-result-object v0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_6
    if-ge v11, v4, :cond_b

    .line 586
    invoke-virtual {v8, v11}, Ll/ܰܿ᩹;->getInt(I)I

    move-result v13

    add-int/2addr v13, v12

    .line 587
    invoke-virtual {v9, v11}, Ll/ܰܿ᩹;->getInt(I)I

    move-result v14

    add-int/2addr v14, v12

    if-eqz v7, :cond_9

    .line 589
    invoke-interface {v10, v0, v13, v14, v2}, Ll/ۜ᩹ᩴ;->ۙ(Ll/ۢ᩶᩸;II[I)I

    move-result v13

    sub-int/2addr v12, v13

    goto :goto_7

    .line 591
    :cond_9
    invoke-interface {v10, v0, v13, v14, v2}, Ll/ۜ᩹ᩴ;->᩷(Ll/ۢ᩶᩸;II[I)I

    move-result v13

    add-int/2addr v13, v12

    move v12, v13

    .line 593
    :goto_7
    rem-int/lit16 v13, v4, 0x1f4

    if-nez v13, :cond_a

    .line 594
    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    :cond_a
    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    .line 597
    :cond_b
    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    if-eqz v6, :cond_c

    .line 599
    aget v0, v2, v3

    .line 629
    invoke-static {v0, v1}, Ll/ᩳۜ᩸;->ۙ(ILjava/lang/CharSequence;)I

    move-result v2

    add-int/2addr v2, v5

    .line 630
    invoke-static {v2, v1}, Ll/ᩳۜ᩸;->ۙ(ILjava/lang/CharSequence;)I

    move-result v4

    .line 631
    invoke-static {v0, v1}, Ll/ᩳۜ᩸;->᩷(ILjava/lang/CharSequence;)I

    move-result v1

    sub-int/2addr v0, v1

    add-int/2addr v0, v2

    .line 632
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 633
    invoke-virtual {p0, v0}, Ll/᩺ۜ᩸;->᩹(I)V

    .line 634
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->֫᩸()V

    goto :goto_8

    .line 601
    :cond_c
    aget v0, v2, v3

    aget v1, v2, v5

    invoke-virtual {p0, v0, v1}, Ll/᩺ۜ᩸;->ۧ(II)V

    .line 1061
    :goto_8
    invoke-virtual {p0, v3}, Ll/᩺ۜ᩸;->᩸(Z)V

    return-void

    .line 541
    :cond_d
    invoke-static {v7, v1}, Ll/ᩳۜ᩸;->ۙ(ILjava/lang/CharSequence;)I

    move-result v10

    .line 542
    invoke-virtual {v8, v7}, Ll/ܰܿ᩹;->add(I)Z

    .line 543
    invoke-virtual {v9, v10}, Ll/ܰܿ᩹;->add(I)Z

    add-int/lit8 v4, v4, 0x1

    move v7, v10

    goto/16 :goto_1
.end method

.method public static ᩴ(Ll/᩺ۜ᩸;)V
    .locals 9

    .line 291
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 292
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v1

    const/4 v2, 0x0

    .line 293
    aget v3, v1, v2

    const/4 v4, 0x1

    .line 294
    aget v1, v1, v4

    .line 4718
    iget-object v4, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {v4}, Ll/ۚۚܺ;->ܽ()I

    move-result v4

    .line 296
    invoke-static {v3, v0}, Ll/ᩳۜ᩸;->᩷(ILjava/lang/CharSequence;)I

    move-result v5

    .line 297
    invoke-static {v0, v5, v4}, Ll/ᩳۜ᩸;->ۙ(Ll/ᩳ۬᩸;II)I

    move-result v6

    .line 298
    invoke-static {v5, v0}, Ll/ᩳۜ᩸;->ۙ(ILjava/lang/CharSequence;)I

    move-result v7

    add-int v8, v5, v6

    if-lt v3, v8, :cond_0

    sub-int/2addr v3, v6

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    if-lt v1, v8, :cond_1

    sub-int v5, v1, v6

    :cond_1
    :goto_1
    add-int/lit8 v1, v7, 0x1

    if-le v1, v5, :cond_2

    .line 321
    invoke-virtual {p0, v3, v5}, Ll/᩺ۜ᩸;->ۧ(II)V

    .line 1061
    invoke-virtual {p0, v2}, Ll/᩺ۜ᩸;->᩸(Z)V

    return-void

    .line 313
    :cond_2
    invoke-static {v0, v1, v4}, Ll/ᩳۜ᩸;->ۙ(Ll/ᩳ۬᩸;II)I

    move-result v6

    .line 314
    invoke-static {v1, v0}, Ll/ᩳۜ᩸;->ۙ(ILjava/lang/CharSequence;)I

    move-result v7

    add-int v8, v1, v6

    if-lt v5, v8, :cond_3

    sub-int/2addr v5, v6

    goto :goto_1

    :cond_3
    move v5, v1

    goto :goto_1
.end method

.method public static ᩴ(Ll/᩺ۜ᩸;Z)V
    .locals 3

    .line 66
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    const/16 v1, 0xa

    .line 67
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v2

    invoke-static {v0, v1, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 69
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    :cond_0
    if-eqz p1, :cond_1

    .line 72
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result p1

    invoke-virtual {p0, p1, v1}, Ll/᩺ۜ᩸;->ۧ(II)V

    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p0, v1}, Ll/᩺ۜ᩸;->᩹(I)V

    .line 75
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->֫᩸()V

    :goto_0
    const/4 p1, 0x0

    .line 1378
    invoke-virtual {p0, v1, p1}, Ll/᩺ۜ᩸;->ۙ(IZ)Z

    return-void
.end method

.method public static ᩷(ILjava/lang/CharSequence;)I
    .locals 1

    add-int/lit8 p0, p0, -0x1

    const/16 v0, 0xa

    .line 638
    invoke-static {p1, v0, p0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/᩺ۜ᩸;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, v0}, Ll/ᩳۜ᩸;->ۤ(Ll/᩺ۜ᩸;Z)V

    return-void
.end method

.method public static ᩷(Ll/᩺ۜ᩸;Z)V
    .locals 3

    .line 9252
    iget-object v0, p0, Ll/᩺ۜ᩸;->۠᩸:Ll/֨ܽᩴ;

    invoke-virtual {v0}, Ll/֨ܽᩴ;->᩸()Ll/֨֫ᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    const p0, 0x7f1209bd

    .line 353
    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 356
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Ll/ۗۚܺ;->ۙ(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v1

    check-cast v1, Ll/ܽ֡֫;

    .line 357
    new-instance v2, Ll/ܿۜ᩸;

    invoke-direct {v2, p0, v1, v0, p1}, Ll/ܿۜ᩸;-><init>(Ll/᩺ۜ᩸;Ll/ܽ֡֫;Ll/֨֫ᩴ;Z)V

    .line 411
    invoke-virtual {v2}, Ll/ۖۙܺ;->۫()V

    return-void
.end method

.method public static ᩸(Ll/᩺ۜ᩸;)V
    .locals 6

    .line 127
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 128
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v1

    const/4 v2, 0x0

    .line 129
    aget v2, v1, v2

    const/4 v3, 0x1

    .line 130
    aget v1, v1, v3

    sub-int/2addr v2, v3

    const/16 v4, 0xa

    .line 131
    invoke-static {v0, v4, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v2

    add-int/2addr v2, v3

    .line 132
    invoke-static {v0, v4, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1

    add-int/2addr v1, v3

    if-nez v1, :cond_0

    .line 134
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 135
    :cond_0
    invoke-interface {v0, v2, v1}, Ll/ۡ᩶᩸;->᩷(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\n"

    .line 136
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 137
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 138
    :cond_1
    invoke-static {v3}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/CharSequence;)V

    .line 139
    invoke-interface {v0, v2, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 140
    invoke-virtual {p0, v2}, Ll/᩺ۜ᩸;->᩹(I)V

    .line 141
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->֫᩸()V

    return-void
.end method

.method public static ᩸(Ll/᩺ۜ᩸;Z)V
    .locals 1

    .line 100
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v0

    if-eqz p1, :cond_0

    .line 102
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result p1

    invoke-virtual {p0, p1, v0}, Ll/᩺ۜ᩸;->ۧ(II)V

    goto :goto_0

    .line 104
    :cond_0
    invoke-virtual {p0, v0}, Ll/᩺ۜ᩸;->᩹(I)V

    .line 105
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->֫᩸()V

    :goto_0
    const/4 p1, 0x0

    .line 1378
    invoke-virtual {p0, v0, p1}, Ll/᩺ۜ᩸;->ۙ(IZ)Z

    return-void
.end method

.method public static ᩻(Ll/᩺ۜ᩸;)V
    .locals 6

    .line 145
    invoke-static {}, Ll/᩶᩷ۧ;->ܳ()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const p0, 0x7f120c48

    .line 147
    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    :cond_0
    const-string v1, "\n"

    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 153
    :cond_1
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    .line 154
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v2

    const/4 v3, 0x0

    .line 155
    aget v3, v2, v3

    const/4 v4, 0x1

    .line 156
    aget v2, v2, v4

    sub-int/2addr v3, v4

    const/16 v5, 0xa

    .line 157
    invoke-static {v1, v5, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v3

    add-int/2addr v3, v4

    .line 158
    invoke-static {v1, v5, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v2

    add-int/2addr v2, v4

    if-nez v2, :cond_2

    .line 160
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 161
    :cond_2
    invoke-interface {v1, v3, v2, v0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 162
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v3

    invoke-virtual {p0, v0}, Ll/᩺ۜ᩸;->᩹(I)V

    .line 163
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->֫᩸()V

    return-void
.end method

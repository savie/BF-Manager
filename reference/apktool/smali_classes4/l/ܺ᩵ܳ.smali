.class public final Ll/ܺ᩵ܳ;
.super Ljava/lang/Object;
.source "C76R"


# instance fields
.field public final ۙ:Ll/ܽ֡֫;

.field public final ᩷:Ll/֫᩵ܳ;


# direct methods
.method public constructor <init>(Ll/ܽ֡֫;Ll/֫᩵ܳ;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Ll/ܺ᩵ܳ;->ۙ:Ll/ܽ֡֫;

    .line 47
    iput-object p2, p0, Ll/ܺ᩵ܳ;->᩷:Ll/֫᩵ܳ;

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    if-eqz p0, :cond_4

    .line 214
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 217
    :cond_0
    invoke-static {p0}, Ll/ܺ᩵ܳ;->᩷(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    return-object p0

    .line 221
    :cond_1
    invoke-static {p0}, Ll/᩸֫ܺ;->᩷(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_3

    .line 222
    invoke-static {v0, v1}, Ll/᩸֫ܺ;->᩷(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    .line 223
    :cond_2
    invoke-static {v0, v1}, Ll/᩸֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    :cond_4
    :goto_1
    return-object p0
.end method

.method public static ۙ(Lbin/mt/plus/Main;JJLl/ܽۙۚ;)V
    .locals 9

    const-string v0, ""

    const-wide/16 v1, -0x1

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    move-object v5, v0

    goto :goto_0

    .line 238
    :cond_0
    invoke-static {p1, p2}, Ll/᩸֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object p1

    move-object v5, p1

    :goto_0
    cmp-long p1, p3, v1

    if-nez p1, :cond_1

    :goto_1
    move-object v6, v0

    goto :goto_2

    :cond_1
    invoke-static {p3, p4}, Ll/᩸֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :goto_2
    const/4 v7, 0x0

    const v4, 0x7f1203e2

    move-object v3, p0

    move-object v8, p5

    .line 140
    invoke-static/range {v3 .. v8}, Ll/ܺ᩵ܳ;->ۙ(Ll/ܽ֡֫;ILjava/lang/String;Ljava/lang/String;ZLl/᩻᩵ܳ;)V

    return-void
.end method

.method public static ۙ(Lbin/mt/plus/Main;JJLl/ܽ᩷᩻;)V
    .locals 13

    const-wide/16 v0, 0x1

    const-wide/16 v2, -0x1

    cmp-long v4, p1, v2

    if-nez v4, :cond_0

    cmp-long v5, p3, v2

    if-nez v5, :cond_0

    const/4 v5, 0x1

    const/4 v10, 0x1

    goto :goto_2

    :cond_0
    const/4 v5, 0x3

    :goto_0
    if-lez v5, :cond_4

    mul-int/lit8 v6, v5, 0xa

    shl-long v6, v0, v6

    const-wide/16 v8, 0x0

    if-eqz v4, :cond_1

    .line 341
    rem-long v10, p1, v6

    cmp-long v12, v10, v8

    if-nez v12, :cond_2

    :cond_1
    cmp-long v10, p3, v2

    if-eqz v10, :cond_3

    rem-long v6, p3, v6

    cmp-long v10, v6, v8

    if-nez v10, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    :cond_3
    :goto_1
    move v10, v5

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    const/4 v10, 0x0

    :goto_2
    mul-int/lit8 v5, v10, 0xa

    shl-long/2addr v0, v5

    const-string v5, ""

    if-nez v4, :cond_5

    move-object v8, v5

    goto :goto_3

    .line 353
    :cond_5
    div-long v6, p1, v0

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    move-object v8, v4

    :goto_3
    cmp-long v4, p3, v2

    if-nez v4, :cond_6

    move-object v9, v5

    goto :goto_4

    :cond_6
    div-long v0, p3, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    :goto_4
    const/4 v11, 0x0

    const v7, 0x7f1203e1

    move-object v6, p0

    move-object/from16 v12, p5

    .line 259
    invoke-static/range {v6 .. v12}, Ll/ܺ᩵ܳ;->ۙ(Ll/ܽ֡֫;ILjava/lang/String;Ljava/lang/String;IZLl/ۧ᩵ܳ;)V

    return-void
.end method

.method public static ۙ(Ll/ܺ᩵ܳ;I)V
    .locals 13

    const/4 v0, 0x3

    if-ltz p1, :cond_0

    if-gt p1, v0, :cond_0

    .line 58
    iget-object p0, p0, Ll/ܺ᩵ܳ;->᩷:Ll/֫᩵ܳ;

    invoke-interface {p0, p1}, Ll/֫᩵ܳ;->ۙ(I)V

    return-void

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-ne p1, v2, :cond_2

    .line 115
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v0, "smint"

    .line 116
    invoke-interface {p1, v0, v3}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 115
    invoke-static {p1}, Ll/ܺ᩵ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 117
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v4, "smaxt"

    .line 118
    invoke-interface {v0, v4, v3}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 117
    invoke-static {v0}, Ll/ܺ᩵ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez p1, :cond_1

    .line 121
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    const/16 v0, 0xb

    .line 122
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v0, 0xc

    .line 123
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v0, 0xd

    .line 124
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v0, 0xe

    .line 125
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 126
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/᩸֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object p1

    :cond_1
    move-object v5, p1

    .line 128
    iget-object v3, p0, Ll/ܺ᩵ܳ;->ۙ:Ll/ܽ֡֫;

    new-instance v8, Ll/ᩳ᩺ۤ;

    invoke-direct {v8, v2, p0}, Ll/ᩳ᩺ۤ;-><init>(ILjava/lang/Object;)V

    const v4, 0x7f120adf

    const/4 v7, 0x1

    invoke-static/range {v3 .. v8}, Ll/ܺ᩵ܳ;->ۙ(Ll/ܽ֡֫;ILjava/lang/String;Ljava/lang/String;ZLl/᩻᩵ܳ;)V

    return-void

    :cond_2
    const/4 v4, 0x5

    const/4 v5, 0x1

    if-ne p1, v4, :cond_3

    .line 242
    iget-object v6, p0, Ll/ܺ᩵ܳ;->ۙ:Ll/ܽ֡֫;

    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v0, "smins"

    .line 243
    invoke-interface {p1, v0, v3}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v0, "smaxs"

    .line 244
    invoke-interface {p1, v0, v3}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v0, "ssun"

    .line 245
    invoke-interface {p1, v0, v5}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result v10

    new-instance v12, Ll/ۡ᩺ۤ;

    invoke-direct {v12, p0}, Ll/ۡ᩺ۤ;-><init>(Ljava/lang/Object;)V

    const v7, 0x7f120ade

    const/4 v11, 0x1

    .line 242
    invoke-static/range {v6 .. v12}, Ll/ܺ᩵ܳ;->ۙ(Ll/ܽ֡֫;ILjava/lang/String;Ljava/lang/String;IZLl/ۧ᩵ܳ;)V

    return-void

    :cond_3
    const/4 v4, 0x6

    if-ne p1, v4, :cond_7

    .line 357
    iget-object p1, p0, Ll/ܺ᩵ܳ;->ۙ:Ll/ܽ֡֫;

    const v4, 0x7f0d00f5

    invoke-virtual {p1, v4}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v4

    const v6, 0x7f0a0186

    .line 358
    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Ll/ܽᩳ᩻;

    const v7, 0x7f0a00e2

    .line 359
    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Landroid/widget/CheckBox;

    const v7, 0x7f0a04c4

    .line 361
    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RadioButton;

    const v8, 0x7f0a04c5

    .line 362
    invoke-virtual {v4, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/RadioButton;

    const v9, 0x7f0a04c6

    .line 363
    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/RadioButton;

    const v10, 0x7f0a04c7

    .line 364
    invoke-virtual {v4, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/RadioButton;

    new-array v11, v2, [Landroid/widget/RadioButton;

    aput-object v7, v11, v1

    aput-object v8, v11, v5

    const/4 v7, 0x2

    aput-object v9, v11, v7

    aput-object v10, v11, v0

    .line 366
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v7, "skc"

    invoke-interface {v0, v7, v1}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v12, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 367
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v7, "skt"

    invoke-interface {v0, v7, v1}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result v0

    new-array v10, v5, [I

    aput v0, v10, v1

    if-ltz v0, :cond_4

    if-lt v0, v2, :cond_5

    :cond_4
    aput v1, v10, v1

    .line 372
    :cond_5
    new-instance v7, Ll/ۨۘᩴ;

    invoke-direct {v7, v5, v11, v10}, Ll/ۨۘᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 383
    aget v8, v10, v1

    aget-object v8, v11, v8

    invoke-virtual {v8, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :goto_0
    if-ge v1, v2, :cond_6

    .line 384
    aget-object v5, v11, v1

    .line 385
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 387
    :cond_6
    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    .line 388
    invoke-virtual {p1, v4}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    new-instance v1, Ll/᩷᩵ܳ;

    move-object v7, v1

    move-object v8, p0

    move-object v9, v6

    move v11, v0

    invoke-direct/range {v7 .. v12}, Ll/᩷᩵ܳ;-><init>(Ll/ܺ᩵ܳ;Ll/ܽᩳ᩻;[IILandroid/widget/CheckBox;)V

    const p0, 0x7f1208c9

    .line 389
    invoke-virtual {p1, p0, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f120161

    .line 414
    invoke-virtual {p1, p0, v3}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 415
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    .line 416
    invoke-virtual {v6}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object p0

    invoke-static {p0}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    return-void

    .line 66
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static synthetic ۙ(Ll/ܺ᩵ܳ;JJ)V
    .locals 3

    .line 246
    iget-object p0, p0, Ll/ܺ᩵ܳ;->᩷:Ll/֫᩵ܳ;

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    cmp-long v2, p3, v0

    if-nez v2, :cond_1

    const-wide p3, 0x7fffffffffffffffL

    :cond_1
    invoke-interface {p0, p1, p2, p3, p4}, Ll/֫᩵ܳ;->ۙ(JJ)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܺ᩵ܳ;Ll/ܽᩳ᩻;[IILandroid/widget/CheckBox;)V
    .locals 3

    .line 390
    invoke-virtual {p1}, Ll/ܽᩳ᩻;->ܳ()V

    const/4 v0, 0x0

    .line 391
    aget v1, p2, v0

    if-eq v1, p3, :cond_0

    .line 392
    sget-object p3, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p3}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p3

    const-string v1, "skt"

    aget v2, p2, v0

    invoke-interface {p3, v2, v1}, Ll/ᩳ֫ܺ;->ۙ(ILjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p3

    invoke-interface {p3}, Ll/ᩳ֫ܺ;->apply()V

    .line 394
    :cond_0
    sget-object p3, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p3}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p3

    const-string v1, "skc"

    invoke-virtual {p4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    invoke-interface {p3, v1, v2}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object p3

    invoke-interface {p3}, Ll/ᩳ֫ܺ;->apply()V

    .line 395
    invoke-virtual {p1}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 396
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_1

    return-void

    .line 400
    :cond_1
    invoke-virtual {p4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p3

    .line 401
    aget p2, p2, v0

    if-eqz p2, :cond_5

    const/4 p4, 0x1

    if-eq p2, p4, :cond_4

    const/4 p4, 0x2

    if-eq p2, p4, :cond_3

    const/4 p4, 0x3

    if-ne p2, p4, :cond_2

    .line 409
    new-instance p2, Ll/۬ۗܳ;

    invoke-direct {p2, p3, p1}, Ll/۬ۗܳ;-><init>(ZLjava/lang/String;)V

    goto :goto_0

    .line 410
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 407
    :cond_3
    new-instance p2, Ll/۫᩵ܳ;

    invoke-direct {p2, p3, p1}, Ll/۫᩵ܳ;-><init>(ZLjava/lang/String;)V

    goto :goto_0

    .line 405
    :cond_4
    new-instance p2, Ll/ܳ᩵ܳ;

    invoke-direct {p2, p3, p1}, Ll/ܳ᩵ܳ;-><init>(ZLjava/lang/String;)V

    goto :goto_0

    .line 403
    :cond_5
    new-instance p2, Ll/ᩴ᩵ܳ;

    invoke-direct {p2, p3, p1}, Ll/ᩴ᩵ܳ;-><init>(ZLjava/lang/String;)V

    .line 412
    :goto_0
    iget-object p0, p0, Ll/ܺ᩵ܳ;->᩷:Ll/֫᩵ܳ;

    invoke-interface {p0, p2}, Ll/֫᩵ܳ;->ۙ(Ll/ۙۡ;)V

    return-void
.end method

.method public static ۙ(Ll/ܽ֡֫;ILjava/lang/String;Ljava/lang/String;IZLl/ۧ᩵ܳ;)V
    .locals 8

    const v0, 0x7f0d00f6

    .line 272
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0681

    .line 273
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    const p1, 0x7f0a0186

    .line 274
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/᩹ۖ᩸;

    const v1, 0x7f0a0187

    .line 275
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/᩹ۖ᩸;

    const v1, 0x7f0a05a0

    .line 276
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/Spinner;

    .line 277
    new-instance v1, Ll/ۚ᩵ܳ;

    const-string v2, "MB"

    const-string v5, "GB"

    const-string v6, "B"

    const-string v7, "KB"

    filled-new-array {v6, v7, v2, v5}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Ll/ۗ֡᩻;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v4, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 285
    invoke-virtual {p1, p2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 286
    invoke-virtual {v3, p3}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 287
    invoke-virtual {v4, p4}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 288
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p0

    .line 289
    invoke-virtual {p0, v0}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const/4 p2, 0x0

    const p3, 0x7f120161

    const p4, 0x7f1208c9

    .line 0
    invoke-static {p0, p4, p2, p3, p2}, Ll/ܰ۟ۙ;->ۙ(Ll/ۖۖۧ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/۠ۖۧ;

    move-result-object v7

    .line 293
    invoke-virtual {v7}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object p0

    new-instance p2, Ll/ۙ᩵ܳ;

    move-object v1, p2

    move-object v2, p1

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v1 .. v7}, Ll/ۙ᩵ܳ;-><init>(Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Landroid/widget/Spinner;ZLl/ۧ᩵ܳ;Ll/۠ۖۧ;)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 329
    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    return-void
.end method

.method public static ۙ(Ll/ܽ֡֫;ILjava/lang/String;Ljava/lang/String;ZLl/᩻᩵ܳ;)V
    .locals 10

    const v0, 0x7f0d00f7

    .line 150
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0681

    .line 151
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    const p1, 0x7f0a0620

    .line 152
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ll/֫ۖ᩸;

    const p1, 0x7f0a0622

    .line 153
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ll/֫ۖ᩸;

    .line 154
    invoke-virtual {v4}, Ll/֫ۖ᩸;->ۙ()Ll/᩹ۖ᩸;

    move-result-object p1

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    invoke-virtual {v5}, Ll/֫ۖ᩸;->ۙ()Ll/᩹ۖ᩸;

    move-result-object v9

    invoke-static {v9}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    invoke-virtual {p1, p2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 157
    invoke-virtual {v9, p3}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 158
    new-instance p2, Ll/ۙۧ۫;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Ll/ۙۧ۫;-><init>(Z)V

    invoke-virtual {p1, p2}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 159
    new-instance p2, Ll/ۙۧ۫;

    invoke-direct {p2, p3}, Ll/ۙۧ۫;-><init>(Z)V

    invoke-virtual {v9, p2}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 160
    invoke-static {v4}, Ll/۟۫ܺ;->ۙ(Ll/֫ۖ᩸;)V

    .line 161
    invoke-static {v5}, Ll/۟۫ܺ;->ۙ(Ll/֫ۖ᩸;)V

    .line 162
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p0

    .line 163
    invoke-virtual {p0, v0}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const p2, 0x7f1208c9

    const/4 p3, 0x0

    invoke-virtual {p0, p2, p3}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p2, 0x7f120161

    const v0, 0x7f120213

    .line 0
    invoke-static {p0, p2, p3, v0, p3}, Ll/۠᩹ᩴ;->ۙ(Ll/ۖۖۧ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/۠ۖۧ;

    move-result-object p0

    .line 167
    invoke-virtual {p0}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object p2

    new-instance p3, Ll/ۤ᩵ܳ;

    move-object v1, p3

    move-object v2, p1

    move-object v3, v9

    move v6, p4

    move-object v7, p5

    move-object v8, p0

    invoke-direct/range {v1 .. v8}, Ll/ۤ᩵ܳ;-><init>(Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/֫ۖ᩸;Ll/֫ۖ᩸;ZLl/᩻᩵ܳ;Ll/۠ۖۧ;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 200
    invoke-virtual {p0}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object p0

    new-instance p2, Ll/᩸᩵ܳ;

    invoke-direct {p2, v9, p1}, Ll/᩸᩵ܳ;-><init>(Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 207
    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    return-void
.end method

.method public static ۙ(IJ)[J
    .locals 6

    .line 76
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 77
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/16 p1, 0xb

    const/4 p2, 0x0

    .line 78
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xc

    .line 79
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xd

    .line 80
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xe

    .line 81
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/4 p1, 0x2

    const/4 v1, 0x5

    const/4 v2, 0x1

    if-eqz p0, :cond_3

    if-eq p0, v2, :cond_2

    if-eq p0, p1, :cond_1

    const/4 v1, 0x3

    if-ne p0, v1, :cond_0

    const/4 p0, 0x6

    .line 104
    invoke-virtual {v0, p0, v2}, Ljava/util/Calendar;->set(II)V

    .line 105
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    .line 106
    invoke-virtual {v0, v2, v2}, Ljava/util/Calendar;->add(II)V

    .line 107
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    goto :goto_0

    .line 109
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 98
    :cond_1
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 99
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    .line 100
    invoke-virtual {v0, p1, v2}, Ljava/util/Calendar;->add(II)V

    .line 101
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    goto :goto_0

    .line 92
    :cond_2
    invoke-virtual {v0}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result p0

    const/4 v3, 0x7

    invoke-virtual {v0, v3, p0}, Ljava/util/Calendar;->set(II)V

    .line 93
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    .line 94
    invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->add(II)V

    .line 95
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    move-wide v3, v4

    goto :goto_0

    .line 86
    :cond_3
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    .line 88
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 89
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    :goto_0
    new-array p0, p1, [J

    aput-wide v3, p0, p2

    aput-wide v0, p0, v2

    return-object p0
.end method

.method public static ᩷(Ljava/lang/String;)J
    .locals 5

    .line 230
    invoke-static {p0}, Ll/᩸֫ܺ;->ۙ(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 231
    invoke-static {v0, v1}, Ll/᩸֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public static synthetic ᩷(Ll/ܺ᩵ܳ;JJ)V
    .locals 3

    .line 129
    iget-object p0, p0, Ll/ܺ᩵ܳ;->᩷:Ll/֫᩵ܳ;

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    cmp-long v2, p3, v0

    if-nez v2, :cond_1

    const-wide p3, 0x7fffffffffffffffL

    :cond_1
    invoke-interface {p0, p1, p2, p3, p4}, Ll/֫᩵ܳ;->᩷(JJ)V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 3

    .line 54
    iget-object v0, p0, Ll/ܺ᩵ܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    const v1, 0x7f1207f2

    .line 55
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v1, Ll/ۜۗܳ;

    invoke-direct {v1, p0}, Ll/ۜۗܳ;-><init>(Ll/ܺ᩵ܳ;)V

    const v2, 0x7f030022

    .line 56
    invoke-virtual {v0, v2, v1}, Ll/ۖۖۧ;->ۙ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 69
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method

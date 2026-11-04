.class public final Ll/ۙܶ۫;
.super Ll/ۢۗܳ;
.source "195F"


# static fields
.field public static final ۟:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [B

    .line 86
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۙܶ۫;->۟:[B

    return-void

    nop

    :array_0
    .array-data 1
        -0x11t
        -0x45t
        -0x41t
    .end array-data
.end method

.method public static bridge synthetic ۙ(Ll/ۨܽ۫;Landroid/widget/TextView;Ll/᩹ۖ᩸;Landroid/widget/Spinner;Landroid/widget/TextView;Ll/᩹ۖ᩸;Ll/֫ۖ᩸;Landroid/widget/CheckBox;Landroid/widget/TextView;Landroid/widget/Spinner;Landroid/widget/CheckBox;)V
    .locals 0

    .line 0
    invoke-static/range {p0 .. p10}, Ll/ۙܶ۫;->᩷(Ll/ۨܽ۫;Landroid/widget/TextView;Ll/᩹ۖ᩸;Landroid/widget/Spinner;Landroid/widget/TextView;Ll/᩹ۖ᩸;Ll/֫ۖ᩸;Landroid/widget/CheckBox;Landroid/widget/TextView;Landroid/widget/Spinner;Landroid/widget/CheckBox;)V

    return-void
.end method

.method public static ۙ(Ll/ۨܽ۫;Ll/᩹ۖ᩸;Landroid/widget/Spinner;Ll/᩹ۖ᩸;Landroid/widget/CheckBox;Landroid/widget/Spinner;Landroid/widget/CheckBox;)V
    .locals 0

    .line 339
    :try_start_0
    invoke-static/range {p0 .. p6}, Ll/ۙܶ۫;->᩷(Ll/ۨܽ۫;Ll/᩹ۖ᩸;Landroid/widget/Spinner;Ll/᩹ۖ᩸;Landroid/widget/CheckBox;Landroid/widget/Spinner;Landroid/widget/CheckBox;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ۙ(Ll/᩹ۖ᩸;)V
    .locals 4

    const/4 v0, 0x2

    .line 327
    invoke-virtual {p0, v0}, Ll/᩹ۖ᩸;->ܿ(I)V

    .line 328
    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v1, 0x1

    new-array v2, v1, [Landroid/text/InputFilter;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {p0, v2}, Ll/᩹ۖ᩸;->ۙ([Landroid/text/InputFilter;)V

    .line 329
    invoke-virtual {p0, v1}, Ll/᩹ۖ᩸;->ۘ(Z)V

    return-void
.end method

.method public static ۙ(Ll/᩹ۖ᩸;Ll/ۨܽ۫;Ll/᩹ۖ᩸;Landroid/widget/Spinner;Ll/᩹ۖ᩸;Landroid/widget/CheckBox;Landroid/widget/Spinner;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Ll/۠ۖۧ;Ll/۫ۛܳ;Ll/ۖۗܳ;)V
    .locals 1

    .line 202
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v0

    if-nez v0, :cond_0

    .line 203
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    return-void

    :cond_0
    const v0, 0x7f120d11

    .line 353
    :try_start_0
    invoke-static/range {p1 .. p7}, Ll/ۙܶ۫;->᩷(Ll/ۨܽ۫;Ll/᩹ۖ᩸;Landroid/widget/Spinner;Ll/᩹ۖ᩸;Landroid/widget/CheckBox;Landroid/widget/Spinner;Landroid/widget/CheckBox;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 396
    :try_start_1
    iget p3, p1, Ll/ۨܽ۫;->ۢ:I

    if-nez p3, :cond_2

    .line 397
    iget p3, p1, Ll/ۨܽ۫;->۟:I

    if-lez p3, :cond_1

    goto/16 :goto_0

    .line 398
    :cond_1
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0}, Ljava/lang/NumberFormatException;-><init>()V

    throw p0

    :cond_2
    const/4 p5, 0x1

    if-ne p3, p5, :cond_4

    .line 401
    iget p3, p1, Ll/ۨܽ۫;->֡:I

    if-lez p3, :cond_3

    goto :goto_0

    .line 402
    :cond_3
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0}, Ljava/lang/NumberFormatException;-><init>()V

    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_4
    const/4 p6, 0x2

    const-string p7, "UTF-8-BOM"

    if-ne p3, p6, :cond_7

    .line 405
    :try_start_2
    iget p3, p1, Ll/ۨܽ۫;->ۡ:I

    if-lt p3, p5, :cond_6

    const p5, 0x3b9ac9ff

    if-gt p3, p5, :cond_6

    .line 449
    invoke-virtual {p4}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p3

    .line 450
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p5

    if-nez p5, :cond_9

    invoke-virtual {p7, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_5

    goto :goto_0

    .line 453
    :cond_5
    invoke-static {p3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    goto :goto_0

    .line 406
    :cond_6
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0}, Ljava/lang/NumberFormatException;-><init>()V

    throw p0

    :cond_7
    const/4 p5, 0x3

    if-ne p3, p5, :cond_9

    .line 410
    iget-object p3, p1, Ll/ۨܽ۫;->۠:Ljava/lang/String;

    invoke-static {p3}, Ll/۬ܽ۫;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_8

    const p0, 0x7f120b89

    .line 411
    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    .line 412
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 449
    :cond_8
    invoke-virtual {p4}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p3

    .line 450
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p5

    if-nez p5, :cond_9

    invoke-virtual {p7, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz p5, :cond_5

    .line 213
    :cond_9
    :goto_0
    invoke-virtual {p8}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    iput-boolean p2, p1, Ll/ۨܽ۫;->֨:Z

    .line 214
    invoke-virtual {p1}, Ll/ۨܽ۫;->᩷()V

    .line 215
    invoke-virtual {p9}, Ll/۠ۖۧ;->dismiss()V

    .line 216
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "{D}"

    .line 217
    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_a

    .line 218
    invoke-virtual {p0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 220
    :cond_a
    sget p2, Ll/۬ۜۧ;->ۙ:I

    .line 268
    new-instance p2, Ll/۠ۜۧ;

    const-class p3, Ll/ۢܽ۫;

    invoke-direct {p2, p3}, Ll/۠ۜۧ;-><init>(Ljava/lang/Class;)V

    .line 221
    invoke-virtual {p2, p10}, Ll/۠ۜۧ;->ۤ(Ll/۫ۛܳ;)V

    const-string p3, "file"

    .line 222
    invoke-interface {p11}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p3, p4}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "arguments"

    .line 223
    invoke-virtual {p2, p3, p1}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string p1, "pattern"

    .line 224
    invoke-virtual {p2, p1, p0}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    invoke-virtual {p2}, Ll/۠ۜۧ;->ۙ()I

    return-void

    :catch_0
    move-exception p0

    .line 419
    instance-of p1, p0, Ljava/lang/NumberFormatException;

    if-eqz p1, :cond_b

    .line 420
    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    goto :goto_1

    .line 421
    :cond_b
    instance-of p1, p0, Ljava/nio/charset/IllegalCharsetNameException;

    if-nez p1, :cond_d

    instance-of p1, p0, Ljava/nio/charset/UnsupportedCharsetException;

    if-eqz p1, :cond_c

    goto :goto_2

    .line 427
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(Ljava/lang/CharSequence;)Ll/᩸۠ۧ;

    .line 429
    :goto_1
    invoke-virtual {p2}, Ll/᩹ۖ᩸;->֡᩸()V

    .line 430
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    goto :goto_4

    .line 422
    :cond_d
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(Ljava/lang/CharSequence;)Ll/᩸۠ۧ;

    .line 423
    invoke-virtual {p4}, Ll/᩹ۖ᩸;->֡᩸()V

    .line 424
    invoke-virtual {p4}, Landroid/view/View;->requestFocus()Z

    goto :goto_4

    :catch_1
    move-exception p0

    .line 357
    instance-of p1, p0, Ljava/lang/NumberFormatException;

    if-eqz p1, :cond_e

    .line 358
    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    goto :goto_3

    .line 360
    :cond_e
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(Ljava/lang/CharSequence;)Ll/᩸۠ۧ;

    .line 362
    :goto_3
    invoke-virtual {p2}, Ll/᩹ۖ᩸;->֡᩸()V

    .line 363
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    :goto_4
    return-void
.end method

.method public static bridge synthetic ۫()[B
    .locals 1

    .line 0
    sget-object v0, Ll/ۙܶ۫;->۟:[B

    return-object v0
.end method

.method public static ᩷(I)I
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :cond_1
    :goto_0
    return p0
.end method

.method public static ᩷(Ll/ۨܽ۫;Landroid/widget/TextView;Ll/᩹ۖ᩸;Landroid/widget/Spinner;Landroid/widget/TextView;Ll/᩹ۖ᩸;Ll/֫ۖ᩸;Landroid/widget/CheckBox;Landroid/widget/TextView;Landroid/widget/Spinner;Landroid/widget/CheckBox;)V
    .locals 14

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p7

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    .line 283
    iget v7, v0, Ll/ۨܽ۫;->ۢ:I

    const/16 v8, 0x8

    const/4 v9, 0x0

    if-nez v7, :cond_0

    const/4 v10, 0x0

    goto :goto_0

    :cond_0
    const/16 v10, 0x8

    .line 284
    :goto_0
    invoke-virtual {v3, v10}, Landroid/view/View;->setVisibility(I)V

    .line 774
    iget v10, v0, Ll/ۨܽ۫;->ۢ:I

    const/4 v11, 0x2

    const/4 v12, 0x3

    if-eq v10, v11, :cond_2

    if-ne v10, v12, :cond_1

    goto :goto_1

    :cond_1
    const/16 v10, 0x8

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v10, 0x0

    :goto_2
    move-object/from16 v13, p4

    .line 285
    invoke-virtual {v13, v10}, Landroid/view/View;->setVisibility(I)V

    .line 774
    iget v10, v0, Ll/ۨܽ۫;->ۢ:I

    if-eq v10, v11, :cond_4

    if-ne v10, v12, :cond_3

    goto :goto_3

    :cond_3
    const/16 v10, 0x8

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v10, 0x0

    :goto_4
    move-object/from16 v13, p6

    .line 286
    invoke-virtual {v13, v10}, Landroid/view/View;->setVisibility(I)V

    if-ne v7, v11, :cond_5

    const/4 v10, 0x0

    goto :goto_5

    :cond_5
    const/16 v10, 0x8

    .line 287
    :goto_5
    invoke-virtual {v4, v10}, Landroid/view/View;->setVisibility(I)V

    if-ne v7, v12, :cond_6

    const/4 v10, 0x0

    goto :goto_6

    :cond_6
    const/16 v10, 0x8

    :goto_6
    move-object/from16 v13, p8

    .line 288
    invoke-virtual {v13, v10}, Landroid/view/View;->setVisibility(I)V

    if-ne v7, v12, :cond_7

    const/4 v10, 0x0

    goto :goto_7

    :cond_7
    const/16 v10, 0x8

    .line 289
    :goto_7
    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    if-ne v7, v12, :cond_8

    const/4 v8, 0x0

    .line 290
    :cond_8
    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    .line 291
    iget-object v8, v0, Ll/ۨܽ۫;->ܰ:Ljava/lang/String;

    move-object/from16 v10, p5

    invoke-virtual {v10, v8}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    if-nez v7, :cond_9

    .line 293
    invoke-static/range {p2 .. p2}, Ll/ۙܶ۫;->ۙ(Ll/᩹ۖ᩸;)V

    const v4, 0x7f120b81

    .line 294
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(I)V

    .line 295
    iget v1, v0, Ll/ۨܽ۫;->۟:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 296
    iget v1, v0, Ll/ۨܽ۫;->ᩳ:I

    invoke-virtual {v3, v1}, Landroid/widget/AdapterView;->setSelection(I)V

    goto :goto_8

    :cond_9
    const/4 v3, 0x1

    if-ne v7, v3, :cond_a

    .line 298
    invoke-static/range {p2 .. p2}, Ll/ۙܶ۫;->ۙ(Ll/᩹ۖ᩸;)V

    const v3, 0x7f120b7e

    .line 299
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 300
    iget v1, v0, Ll/ۨܽ۫;->֡:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    goto :goto_8

    :cond_a
    if-ne v7, v11, :cond_b

    .line 302
    invoke-static/range {p2 .. p2}, Ll/ۙܶ۫;->ۙ(Ll/᩹ۖ᩸;)V

    const v3, 0x7f120b83

    .line 303
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 304
    iget v1, v0, Ll/ۨܽ۫;->ۡ:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    const v1, 0x7f120b87

    .line 305
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(I)V

    .line 306
    iget-boolean v1, v0, Ll/ۨܽ۫;->ۖ:Z

    invoke-virtual {v4, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_8

    :cond_b
    const v4, 0x80001

    .line 308
    invoke-virtual {v2, v4}, Ll/᩹ۖ᩸;->ܿ(I)V

    new-array v4, v9, [Landroid/text/InputFilter;

    .line 309
    invoke-virtual {v2, v4}, Ll/᩹ۖ᩸;->ۙ([Landroid/text/InputFilter;)V

    .line 310
    invoke-virtual {v2, v3}, Ll/᩹ۖ᩸;->ۘ(Z)V

    const v4, 0x7f120b85

    .line 311
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(I)V

    .line 312
    iget-object v1, v0, Ll/ۨܽ۫;->۠:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 313
    iget v1, v0, Ll/ۨܽ۫;->ۜ:I

    if-eqz v1, :cond_c

    if-eq v1, v3, :cond_c

    if-ne v1, v11, :cond_d

    :cond_c
    move v9, v1

    :cond_d
    invoke-virtual {v5, v9}, Landroid/widget/AdapterView;->setSelection(I)V

    const v1, 0x7f120b8d

    .line 314
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(I)V

    .line 315
    iget-boolean v1, v0, Ll/ۨܽ۫;->۬:Z

    invoke-virtual {v6, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 316
    invoke-virtual/range {p2 .. p2}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v1

    invoke-virtual {v2, v1}, Ll/᩹ۖ᩸;->᩹(I)V

    :goto_8
    if-eq v7, v12, :cond_e

    .line 319
    iget-boolean v0, v0, Ll/ۨܽ۫;->۬:Z

    invoke-virtual {v6, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :cond_e
    return-void
.end method

.method public static ᩷(Ll/ۨܽ۫;Ll/᩹ۖ᩸;Landroid/widget/Spinner;Ll/᩹ۖ᩸;Landroid/widget/CheckBox;Landroid/widget/Spinner;Landroid/widget/CheckBox;)V
    .locals 2

    .line 374
    iget v0, p0, Ll/ۨܽ۫;->ۢ:I

    if-nez v0, :cond_0

    .line 375
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۨܽ۫;->۟:I

    .line 376
    invoke-virtual {p2}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    iput p1, p0, Ll/ۨܽ۫;->ᩳ:I

    return-void

    :cond_0
    const/4 p2, 0x1

    if-ne v0, p2, :cond_1

    .line 378
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۨܽ۫;->֡:I

    return-void

    :cond_1
    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 380
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۨܽ۫;->ۡ:I

    .line 381
    invoke-virtual {p4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۨܽ۫;->ۖ:Z

    .line 382
    invoke-virtual {p3}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۨܽ۫;->ܰ:Ljava/lang/String;

    return-void

    :cond_2
    const/4 p4, 0x3

    if-ne v0, p4, :cond_5

    .line 384
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۨܽ۫;->۠:Ljava/lang/String;

    .line 385
    invoke-virtual {p5}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    if-eqz p1, :cond_4

    if-eq p1, p2, :cond_4

    if-ne p1, v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :cond_4
    :goto_0
    iput p1, p0, Ll/ۨܽ۫;->ۜ:I

    .line 386
    invoke-virtual {p6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۨܽ۫;->۬:Z

    .line 387
    invoke-virtual {p3}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۨܽ۫;->ܰ:Ljava/lang/String;

    :cond_5
    return-void
.end method


# virtual methods
.method public final ۤ(Ll/۫ۛܳ;)V
    .locals 34

    .line 110
    invoke-virtual/range {p1 .. p1}, Ll/۫ۛܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v14

    .line 111
    invoke-virtual/range {p1 .. p1}, Ll/۫ۛܳ;->᩻()Ll/ۖۗܳ;

    move-result-object v15

    const v0, 0x7f0d00b3

    .line 113
    invoke-virtual {v14, v0}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v13

    const v0, 0x7f0a062a

    .line 114
    invoke-virtual {v13, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0a062d

    .line 115
    invoke-virtual {v13, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0a05a2

    .line 116
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/Spinner;

    const v2, 0x7f0a0610

    .line 117
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/TextView;

    const v2, 0x7f0a0186

    .line 118
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ll/᩹ۖ᩸;

    const v2, 0x7f0a05a4

    .line 119
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/Spinner;

    const v2, 0x7f0a0617

    .line 120
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v27, v2

    check-cast v27, Landroid/widget/TextView;

    const v2, 0x7f0a00df

    .line 121
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ll/᩹ۖ᩸;

    const v2, 0x7f0a00e0

    .line 122
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ll/֫ۖ᩸;

    const v2, 0x7f0a0187

    .line 123
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ll/᩹ۖ᩸;

    const v2, 0x7f0a00fd

    .line 124
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v28, v2

    check-cast v28, Landroid/widget/CheckBox;

    const v2, 0x7f0a062c

    .line 125
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v29, v2

    check-cast v29, Landroid/widget/TextView;

    const v2, 0x7f0a05a7

    .line 126
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v30, v2

    check-cast v30, Landroid/widget/Spinner;

    const v2, 0x7f0a00fe

    .line 127
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v31, v2

    check-cast v31, Landroid/widget/CheckBox;

    const v2, 0x7f0a0611

    .line 128
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v32, v2

    check-cast v32, Landroid/widget/TextView;

    const v2, 0x7f0a00e1

    .line 129
    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/CheckBox;

    .line 130
    invoke-virtual {v14}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/high16 v3, 0x7f110000

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    invoke-interface {v15}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    invoke-interface {v15}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/۠֫ܺ;->᩷(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x2

    .line 134
    invoke-virtual {v6, v0}, Ll/᩹ۖ᩸;->ۗ(I)V

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v15}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".{D}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 137
    new-instance v0, Ll/ۗ֡᩻;

    const-string v1, "MB"

    const-string v2, "GB"

    const-string v3, "B"

    const-string v4, "KB"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v14, v1}, Ll/ۗ֡᩻;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v10, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 460
    new-instance v0, Ll/ܶܽ۫;

    invoke-direct {v0, v14, v8}, Ll/ܶܽ۫;-><init>(Lbin/mt/plus/Main;Ll/᩹ۖ᩸;)V

    invoke-virtual {v7, v0}, Ll/֫ۖ᩸;->ۙ(Landroid/view/View$OnClickListener;)V

    .line 139
    new-instance v4, Ll/ۨܽ۫;

    invoke-direct {v4}, Ll/ۨܽ۫;-><init>()V

    .line 140
    invoke-virtual {v4}, Ll/ۨܽ۫;->ۙ()V

    .line 141
    iget-boolean v0, v4, Ll/ۨܽ۫;->֨:Z

    invoke-virtual {v5, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 142
    iget v0, v4, Ll/ۨܽ۫;->ۢ:I

    invoke-virtual {v12, v0}, Landroid/widget/AdapterView;->setSelection(I)V

    move-object/from16 v16, v4

    move-object/from16 v17, v9

    move-object/from16 v18, v11

    move-object/from16 v19, v10

    move-object/from16 v20, v27

    move-object/from16 v21, v8

    move-object/from16 v22, v7

    move-object/from16 v23, v28

    move-object/from16 v24, v29

    move-object/from16 v25, v30

    move-object/from16 v26, v31

    .line 143
    invoke-static/range {v16 .. v26}, Ll/ۙܶ۫;->᩷(Ll/ۨܽ۫;Landroid/widget/TextView;Ll/᩹ۖ᩸;Landroid/widget/Spinner;Landroid/widget/TextView;Ll/᩹ۖ᩸;Ll/֫ۖ᩸;Landroid/widget/CheckBox;Landroid/widget/TextView;Landroid/widget/Spinner;Landroid/widget/CheckBox;)V

    .line 147
    invoke-interface {v15}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v2

    .line 148
    new-instance v1, Ll/ܺܽ۫;

    move-object v0, v1

    move-object/from16 v16, v1

    move-object v1, v14

    move-object/from16 v17, v4

    move-object v4, v12

    move-object/from16 v18, v5

    move-object v5, v11

    move-object/from16 v19, v6

    move-object v6, v10

    move-object/from16 v20, v7

    move-object/from16 v7, v32

    invoke-direct/range {v0 .. v7}, Ll/ܺܽ۫;-><init>(Lbin/mt/plus/Main;JLandroid/widget/Spinner;Ll/᩹ۖ᩸;Landroid/widget/Spinner;Landroid/widget/TextView;)V

    .line 150
    invoke-virtual/range {v16 .. v16}, Ll/ܺܽ۫;->run()V

    .line 152
    new-instance v7, Ll/᩹ܽ۫;

    move-object v0, v7

    move-object/from16 v1, v17

    move-object v2, v11

    move-object v3, v10

    move-object v4, v8

    move-object/from16 v5, v28

    move-object/from16 v6, v30

    move-object/from16 v21, v15

    move-object v15, v7

    move-object/from16 v7, v31

    move-object/from16 v22, v8

    move-object v8, v14

    move-object/from16 v23, v14

    move-object v14, v10

    move-object/from16 v10, v27

    move-object/from16 v24, v14

    move-object v14, v11

    move-object/from16 v11, v20

    move-object/from16 v20, v14

    move-object v14, v12

    move-object/from16 v12, v29

    move-object/from16 v33, v13

    move-object/from16 v13, v16

    invoke-direct/range {v0 .. v13}, Ll/᩹ܽ۫;-><init>(Ll/ۨܽ۫;Ll/᩹ۖ᩸;Landroid/widget/Spinner;Ll/᩹ۖ᩸;Landroid/widget/CheckBox;Landroid/widget/Spinner;Landroid/widget/CheckBox;Lbin/mt/plus/Main;Landroid/widget/TextView;Landroid/widget/TextView;Ll/֫ۖ᩸;Landroid/widget/TextView;Ll/ܺܽ۫;)V

    invoke-virtual {v14, v15}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 169
    new-instance v0, Ll/ۗܽ۫;

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Ll/ۗܽ۫;-><init>(Ll/ܺܽ۫;)V

    move-object/from16 v3, v20

    invoke-virtual {v3, v0}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 185
    new-instance v0, Ll/᩵ܽ۫;

    invoke-direct {v0, v1}, Ll/᩵ܽ۫;-><init>(Ll/ܺܽ۫;)V

    move-object/from16 v4, v24

    invoke-virtual {v4, v0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 196
    invoke-virtual/range {v23 .. v23}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    move-object/from16 v1, v33

    .line 197
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const/4 v1, 0x0

    const v2, 0x7f120161

    const v5, 0x7f1208c9

    .line 0
    invoke-static {v0, v5, v1, v2, v1}, Ll/ܰ۟ۙ;->ۙ(Ll/ۖۖۧ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/۠ۖۧ;

    move-result-object v10

    .line 201
    invoke-virtual {v10}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v13

    new-instance v14, Ll/ܽܽ۫;

    move-object v0, v14

    move-object/from16 v1, v19

    move-object/from16 v2, v17

    move-object/from16 v5, v22

    move-object/from16 v6, v28

    move-object/from16 v7, v30

    move-object/from16 v8, v31

    move-object/from16 v9, v18

    move-object/from16 v11, p1

    move-object/from16 v12, v21

    invoke-direct/range {v0 .. v12}, Ll/ܽܽ۫;-><init>(Ll/᩹ۖ᩸;Ll/ۨܽ۫;Ll/᩹ۖ᩸;Landroid/widget/Spinner;Ll/᩹ۖ᩸;Landroid/widget/CheckBox;Landroid/widget/Spinner;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Ll/۠ۖۧ;Ll/۫ۛܳ;Ll/ۖۗܳ;)V

    invoke-virtual {v13, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ᩸(Ll/۫ۛܳ;)Z
    .locals 2

    const-string v0, "local"

    .line 98
    invoke-virtual {p1, v0}, Ll/۫ۛܳ;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {p1}, Ll/۫ۛܳ;->᩹()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 104
    :cond_1
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܺ()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Ll/۫ۛܳ;->᩻()Ll/ۖۗܳ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

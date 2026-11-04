.class public final Ll/ۤۤܳ;
.super Ljava/lang/Object;
.source "95HF"

# interfaces
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public ֡:Landroid/widget/TextView;

.field public ۟:Landroid/widget/TextView;

.field public ܰ:I

.field public final synthetic ܿ:Ll/ᩴۤܳ;

.field public ᩳ:Landroid/view/ViewGroup;

.field public ᩶:I


# direct methods
.method public constructor <init>(Ll/ᩴۤܳ;II)V
    .locals 0

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۤܳ;->ܿ:Ll/ᩴۤܳ;

    .line 181
    iput p2, p0, Ll/ۤۤܳ;->᩶:I

    .line 182
    iput p3, p0, Ll/ۤۤܳ;->ܰ:I

    .line 183
    invoke-static {p1}, Ll/ᩴۤܳ;->ۙ(Ll/ᩴۤܳ;)Ll/ܽ֡֫;

    move-result-object p1

    invoke-virtual {p1, p3}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Ll/ۤۤܳ;->ᩳ:Landroid/view/ViewGroup;

    .line 184
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 185
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const/4 p2, 0x1

    .line 186
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Ll/ۤۤܳ;->۟:Landroid/widget/TextView;

    const/4 p2, 0x0

    .line 187
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۤۤܳ;->֡:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 321
    new-instance p1, Landroid/text/SpannableString;

    iget-object v0, p0, Ll/ۤۤܳ;->ܿ:Ll/ᩴۤܳ;

    invoke-static {v0}, Ll/ᩴۤܳ;->ۤ(Ll/ᩴۤܳ;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 322
    invoke-static {v0}, Ll/ᩴۤܳ;->᩷(Ll/ᩴۤܳ;)Landroid/text/style/BackgroundColorSpan;

    move-result-object v1

    iget v2, p0, Ll/ۤۤܳ;->᩶:I

    mul-int/lit8 v2, v2, 0x3

    add-int/lit8 v2, v2, -0x1

    const/16 v3, 0x21

    const/4 v4, 0x0

    invoke-virtual {p1, v1, v4, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 323
    invoke-static {v0}, Ll/ᩴۤܳ;->ۤ(Ll/ᩴۤܳ;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 16

    move-object/from16 v11, p0

    .line 241
    iget-object v0, v11, Ll/ۤۤܳ;->ܿ:Ll/ᩴۤܳ;

    invoke-static {v0}, Ll/ᩴۤܳ;->ᩴ(Ll/ᩴۤܳ;)Ll/᩹ۤܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩹ۤܳ;->ܺ()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    .line 244
    :cond_0
    invoke-static {v0}, Ll/ᩴۤܳ;->ᩴ(Ll/ᩴۤܳ;)Ll/᩹ۤܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩹ۤܳ;->᩸()Ll/ۨ᩷ܳ;

    move-result-object v4

    .line 480
    iget-object v1, v4, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v5

    .line 246
    invoke-virtual {v5}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v6

    .line 1222
    iget-object v1, v4, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v8

    .line 248
    iget-object v1, v11, Ll/ۤۤܳ;->۟:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v1, 0x0

    .line 249
    invoke-virtual {v11, v1}, Ll/ۤۤܳ;->onClick(Landroid/view/View;)V

    .line 250
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v9, 0x7f0d00b8

    invoke-static {v3, v9, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const v3, 0x7f0a0186

    .line 251
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ll/᩹ۖ᩸;

    const v3, 0x7f0a0681

    .line 252
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v9, 0x7f0a0634

    .line 253
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    .line 254
    iget-object v13, v11, Ll/ۤۤܳ;->֡:Landroid/widget/TextView;

    invoke-virtual {v13}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v13

    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v3, 0x7f0a0576

    const/4 v13, 0x1

    .line 256
    iget v14, v11, Ll/ۤۤܳ;->ܰ:I

    if-eq v14, v3, :cond_5

    const v3, 0x7f0a0579

    if-eq v14, v3, :cond_5

    const v3, 0x7f0a0577

    if-eq v14, v3, :cond_5

    const v3, 0x7f0a0578

    if-ne v14, v3, :cond_1

    goto :goto_1

    :cond_1
    const v3, 0x7f0a06b0

    if-eq v14, v3, :cond_4

    const v3, 0x7f0a06b3

    if-eq v14, v3, :cond_4

    const v3, 0x7f0a06b1

    if-eq v14, v3, :cond_4

    const v3, 0x7f0a06b2

    if-ne v14, v3, :cond_2

    goto :goto_0

    :cond_2
    const v3, 0x7f0a026d

    if-eq v14, v3, :cond_3

    const v3, 0x7f0a026c

    if-ne v14, v3, :cond_6

    :cond_3
    const-string v3, "0123456789-.eE"

    .line 261
    invoke-static {v3}, Landroid/text/method/DigitsKeyListener;->getInstance(Ljava/lang/String;)Landroid/text/method/DigitsKeyListener;

    move-result-object v3

    .line 262
    invoke-virtual {v3}, Landroid/text/method/DigitsKeyListener;->getInputType()I

    move-result v15

    invoke-virtual {v12, v15}, Ll/᩹ۖ᩸;->ܿ(I)V

    new-array v15, v13, [Landroid/text/InputFilter;

    aput-object v3, v15, v2

    goto :goto_3

    :cond_4
    :goto_0
    const/4 v3, 0x2

    .line 259
    invoke-virtual {v12, v3}, Ll/᩹ۖ᩸;->ܿ(I)V

    goto :goto_2

    :cond_5
    :goto_1
    const/16 v3, 0x1002

    .line 257
    invoke-virtual {v12, v3}, Ll/᩹ۖ᩸;->ܿ(I)V

    :cond_6
    :goto_2
    const/4 v15, 0x0

    .line 267
    :goto_3
    invoke-virtual {v12}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v3

    if-eqz v15, :cond_7

    goto :goto_4

    .line 268
    :cond_7
    invoke-interface {v3}, Landroid/text/Editable;->getFilters()[Landroid/text/InputFilter;

    move-result-object v15

    :goto_4
    new-array v2, v2, [Landroid/text/InputFilter;

    .line 269
    invoke-interface {v3, v2}, Landroid/text/Editable;->setFilters([Landroid/text/InputFilter;)V

    .line 271
    :try_start_0
    invoke-virtual {v12, v10}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 273
    invoke-interface {v3, v15}, Landroid/text/Editable;->setFilters([Landroid/text/InputFilter;)V

    .line 275
    invoke-virtual {v12}, Ll/᩹ۖ᩸;->֡᩸()V

    .line 276
    new-instance v3, Ll/᩸ۤܳ;

    invoke-static {v0}, Ll/ᩴۤܳ;->᩸(Ll/ᩴۤܳ;)Landroid/widget/CompoundButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    invoke-direct {v3, v12, v9, v14, v0}, Ll/᩸ۤܳ;-><init>(Ll/᩹ۖ᩸;Landroid/widget/TextView;IZ)V

    .line 277
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v2, Ll/ۖۖۧ;

    invoke-direct {v2, v0}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 278
    invoke-virtual {v2, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v0, 0x7f1208c9

    const/4 v1, 0x0

    .line 279
    invoke-virtual {v2, v0, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120161

    .line 280
    invoke-virtual {v2, v0, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 281
    invoke-virtual {v2}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v9

    .line 282
    invoke-virtual {v9}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v0

    new-instance v14, Ll/᩷ۤܳ;

    move-object v1, v14

    move-object/from16 v2, p0

    invoke-direct/range {v1 .. v10}, Ll/᩷ۤܳ;-><init>(Ll/ۤۤܳ;Ll/᩸ۤܳ;Ll/ۨ᩷ܳ;Ll/ᩳܳܳ;JILl/۠ۖۧ;Ljava/lang/String;)V

    invoke-virtual {v0, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 315
    invoke-static {v12}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    return v13

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 273
    invoke-interface {v3, v15}, Landroid/text/Editable;->setFilters([Landroid/text/InputFilter;)V

    .line 274
    throw v1
.end method

.method public final ۙ([B)J
    .locals 7

    .line 225
    iget-object v0, p0, Ll/ۤۤܳ;->ܿ:Ll/ᩴۤܳ;

    invoke-static {v0}, Ll/ᩴۤܳ;->᩸(Ll/ᩴۤܳ;)Landroid/widget/CompoundButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    const/16 v1, 0x8

    iget v2, p0, Ll/ۤۤܳ;->᩶:I

    const-wide/16 v3, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    shl-long/2addr v3, v1

    .line 228
    aget-byte v5, p1, v0

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    or-long/2addr v3, v5

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-wide v3

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_2

    shl-long/2addr v3, v1

    .line 233
    aget-byte v0, p1, v2

    and-int/lit16 v0, v0, 0xff

    int-to-long v5, v0

    or-long/2addr v3, v5

    goto :goto_1

    :cond_2
    return-wide v3
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 208
    iget-object v0, p0, Ll/ۤۤܳ;->۟:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۙ(I)Z
    .locals 4

    .line 191
    iget v0, p0, Ll/ۤۤܳ;->᩶:I

    iget-object v1, p0, Ll/ۤۤܳ;->ᩳ:Landroid/view/ViewGroup;

    iget-object v2, p0, Ll/ۤۤܳ;->֡:Landroid/widget/TextView;

    iget-object v3, p0, Ll/ۤۤܳ;->۟:Landroid/widget/TextView;

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    .line 192
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 193
    invoke-virtual {v3, v0}, Landroid/view/View;->setAlpha(F)V

    .line 194
    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 195
    invoke-virtual {v1, p1}, Landroid/view/View;->setEnabled(Z)V

    return p1

    :cond_0
    const-string p1, "----"

    .line 198
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    .line 199
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    const v0, 0x3e99999a    # 0.3f

    .line 200
    invoke-virtual {v3, v0}, Landroid/view/View;->setAlpha(F)V

    .line 201
    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 202
    invoke-virtual {v1, p1}, Landroid/view/View;->setEnabled(Z)V

    return p1
.end method

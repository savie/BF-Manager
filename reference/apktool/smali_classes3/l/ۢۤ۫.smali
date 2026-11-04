.class public final Ll/ۢۤ۫;
.super Ljava/lang/Object;
.source "J4L7"

# interfaces
.implements Landroid/text/TextWatcher;


# static fields
.field public static final ۖ:[I

.field public static final ۠:[I

.field public static final ۡ:[Ljava/lang/String;


# instance fields
.field public final ֡:Ll/֡ۤ۫;

.field public final ֨:Ll/۠ۨܳ;

.field public final ۟:Ll/ۖۗܳ;

.field public ۢ:Z

.field public final ܰ:Lbin/mt/plus/Main;

.field public ܿ:Ll/᩹ۖ᩸;

.field public final ᩳ:[Ll/ᩳۤ۫;

.field public ᩶:Landroid/widget/TextView;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const/16 v0, 0x10

    const/4 v1, 0x2

    const/4 v2, 0x4

    const/16 v3, 0x8

    .line 55
    filled-new-array {v1, v2, v3, v0}, [I

    move-result-object v0

    sput-object v0, Ll/ۢۤ۫;->۠:[I

    const/16 v0, 0x28

    const/16 v1, 0x40

    const/16 v2, 0x20

    .line 61
    filled-new-array {v2, v0, v1, v3}, [I

    move-result-object v0

    sput-object v0, Ll/ۢۤ۫;->ۖ:[I

    const-string v7, "sha256sum"

    const-string v8, "crc32sum"

    const-string v1, "md5"

    const-string v2, "sha1"

    const-string v3, "sha256"

    const-string v4, "crc32"

    const-string v5, "md5sum"

    const-string v6, "sha1sum"

    .line 62
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۢۤ۫;->ۡ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/۠ۨܳ;Ll/ۖۗܳ;)V
    .locals 10

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v0, Ll/ᩳۤ۫;

    new-instance v1, Ll/᩵ۤ۫;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/᩵ۤ۫;-><init>(I)V

    const-string v3, "MD5"

    invoke-direct {v0, p0, v2, v3, v1}, Ll/ᩳۤ۫;-><init>(Ll/ۢۤ۫;ILjava/lang/String;Ljava/util/function/Supplier;)V

    new-instance v1, Ll/ᩳۤ۫;

    new-instance v3, Ll/ۨۤ۫;

    invoke-direct {v3, v2}, Ll/ۨۤ۫;-><init>(I)V

    const/4 v4, 0x1

    const-string v5, "SHA1"

    invoke-direct {v1, p0, v4, v5, v3}, Ll/ᩳۤ۫;-><init>(Ll/ۢۤ۫;ILjava/lang/String;Ljava/util/function/Supplier;)V

    new-instance v3, Ll/ᩳۤ۫;

    new-instance v5, Ll/ۛۤ۫;

    invoke-direct {v5, v2}, Ll/ۛۤ۫;-><init>(I)V

    const/4 v6, 0x2

    const-string v7, "SHA256"

    invoke-direct {v3, p0, v6, v7, v5}, Ll/ᩳۤ۫;-><init>(Ll/ۢۤ۫;ILjava/lang/String;Ljava/util/function/Supplier;)V

    new-instance v5, Ll/ᩳۤ۫;

    new-instance v7, Ll/᩺ۤ۫;

    invoke-direct {v7, v2}, Ll/᩺ۤ۫;-><init>(I)V

    const/4 v8, 0x3

    const-string v9, "CRC32"

    invoke-direct {v5, p0, v8, v9, v7}, Ll/ᩳۤ۫;-><init>(Ll/ۢۤ۫;ILjava/lang/String;Ljava/util/function/Supplier;)V

    const/4 v7, 0x4

    new-array v7, v7, [Ll/ᩳۤ۫;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    iput-object v7, p0, Ll/ۢۤ۫;->ᩳ:[Ll/ᩳۤ۫;

    .line 125
    invoke-virtual {p1}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v0

    iput-object v0, p0, Ll/ۢۤ۫;->ܰ:Lbin/mt/plus/Main;

    .line 126
    iput-object p1, p0, Ll/ۢۤ۫;->֨:Ll/۠ۨܳ;

    .line 127
    iput-object p2, p0, Ll/ۢۤ۫;->۟:Ll/ۖۗܳ;

    .line 128
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string p2, "fsuc"

    invoke-interface {p1, p2, v2}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۢۤ۫;->ۢ:Z

    .line 129
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string p2, "fsf"

    invoke-interface {p1, p2, v2}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result p1

    .line 130
    new-instance p2, Ll/֡ۤ۫;

    invoke-direct {p2, p1}, Ll/֡ۤ۫;-><init>(I)V

    iput-object p2, p0, Ll/ۢۤ۫;->֡:Ll/֡ۤ۫;

    .line 131
    new-instance p1, Ll/۠ۡۘ;

    invoke-direct {p1, v6, p0}, Ll/۠ۡۘ;-><init>(ILjava/lang/Object;)V

    .line 138
    invoke-virtual {p2}, Ll/֡ۤ۫;->ۙ()[I

    move-result-object p2

    .line 139
    array-length v0, p2

    if-nez v0, :cond_0

    .line 140
    invoke-virtual {p1}, Ll/۠ۡۘ;->run()V

    return-void

    .line 143
    :cond_0
    new-instance v0, Ll/ܿۤ۫;

    invoke-direct {v0, p0, p2, p1}, Ll/ܿۤ۫;-><init>(Ll/ۢۤ۫;[ILjava/lang/Runnable;)V

    .line 216
    invoke-virtual {v0}, Ll/ۖۙܺ;->۫()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢۤ۫;)[Ll/ᩳۤ۫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۤ۫;->ᩳ:[Ll/ᩳۤ۫;

    return-object p0
.end method

.method public static ۙ(Ll/ۢۤ۫;Ljava/lang/CharSequence;II)Landroid/text/SpannableString;
    .locals 10

    .line 273
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;II)V

    .line 274
    instance-of v1, p1, Landroid/text/Spanned;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Landroid/text/Spanned;

    .line 276
    const-class v3, Ljava/lang/Object;

    invoke-interface {p1, p2, p3, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 277
    invoke-interface {p1, v6}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v7

    and-int/lit16 v8, v7, 0x100

    if-eqz v8, :cond_0

    .line 279
    invoke-interface {p1, v6}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v8

    invoke-static {p2, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    sub-int/2addr v8, p2

    .line 280
    invoke-interface {p1, v6}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v9

    invoke-static {p3, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    sub-int/2addr v9, p2

    .line 279
    invoke-virtual {v0, v6, v8, v9, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 285
    :cond_1
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x0

    :goto_1
    if-ltz p1, :cond_4

    .line 286
    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result p3

    const/16 v3, 0x20

    if-eq p3, v3, :cond_2

    const/16 v3, 0x9

    if-lt p3, v3, :cond_3

    const/16 v3, 0xd

    if-gt p3, v3, :cond_3

    :cond_2
    add-int/lit8 p2, p1, 0x1

    .line 289
    invoke-virtual {v0, p1, p2}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    const/4 p2, 0x1

    :cond_3
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    .line 294
    :cond_4
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p1

    const/16 p3, 0xa

    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/16 p3, 0x3a

    invoke-static {v0, p3, v2, p1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result p1

    if-lez p1, :cond_6

    .line 296
    invoke-virtual {v0, v2, p1}, Landroid/text/SpannableStringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    :goto_2
    const/16 v5, 0x8

    if-ge v4, v5, :cond_6

    .line 297
    sget-object v5, Ll/ۢۤ۫;->ۡ:[Ljava/lang/String;

    aget-object v5, v5, v4

    .line 298
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    add-int/lit8 p1, p1, 0x1

    .line 299
    invoke-virtual {v0, v2, p1}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    const/4 p2, 0x1

    goto :goto_3

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 305
    :cond_6
    :goto_3
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_4
    if-ltz p1, :cond_b

    .line 306
    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v2

    if-ne v2, p3, :cond_7

    add-int/lit8 p2, p1, 0x1

    .line 308
    invoke-virtual {v0, p1, p2}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    goto :goto_7

    .line 310
    :cond_7
    iget-boolean v3, p0, Ll/ۢۤ۫;->ۢ:Z

    if-eqz v3, :cond_8

    const/16 v4, 0x61

    if-lt v2, v4, :cond_a

    const/16 v4, 0x7a

    if-gt v2, v4, :cond_a

    goto :goto_5

    :cond_8
    const/16 v4, 0x41

    if-lt v2, v4, :cond_a

    const/16 v4, 0x5a

    if-gt v2, v4, :cond_a

    :goto_5
    add-int/lit8 p2, p1, 0x1

    if-eqz v3, :cond_9

    add-int/lit8 v2, v2, -0x20

    goto :goto_6

    :cond_9
    add-int/lit8 v2, v2, 0x20

    :goto_6
    int-to-char v2, v2

    .line 312
    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, p2, v2}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :goto_7
    const/4 p2, 0x1

    :cond_a
    add-int/lit8 p1, p1, -0x1

    goto :goto_4

    :cond_b
    if-nez p2, :cond_d

    if-eqz v1, :cond_c

    goto :goto_8

    :cond_c
    const/4 p0, 0x0

    return-object p0

    .line 317
    :cond_d
    :goto_8
    new-instance p0, Landroid/text/SpannableString;

    invoke-direct {p0, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public static synthetic ۙ(Landroid/widget/Button;Ll/۠ۨܳ;Ll/ۖۗܳ;)V
    .locals 2

    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Ll/ۗۚܺ;->ۙ(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    invoke-static {p0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ll/ܽ֡֫;

    .line 86
    new-instance v0, Ll/ܶ᩵ܳ;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p1, p2}, Ll/ܶ᩵ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v0}, Ll/ۢۤ۫;->ۙ(Ll/ܽ֡֫;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/۠ۨܳ;Ll/ۖۗܳ;)V
    .locals 1

    .line 83
    new-instance v0, Ll/ۢۤ۫;

    invoke-direct {v0, p0, p1}, Ll/ۢۤ۫;-><init>(Ll/۠ۨܳ;Ll/ۖۗܳ;)V

    return-void
.end method

.method public static ۙ(Ll/ۢۤ۫;)V
    .locals 10

    .line 223
    iget-object v0, p0, Ll/ۢۤ۫;->ܰ:Lbin/mt/plus/Main;

    const v1, 0x7f0d00b4

    invoke-virtual {v0, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a0418

    .line 224
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/᩹ۖ᩸;

    .line 225
    invoke-virtual {v2}, Ll/᩹ۖ᩸;->۟᩸()V

    .line 226
    iget-object v3, p0, Ll/ۢۤ۫;->۟:Ll/ۖۗܳ;

    invoke-interface {v3}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    const/4 v3, 0x1

    .line 227
    invoke-virtual {v2, v3}, Ll/᩺ۜ᩸;->᩻(Z)V

    .line 229
    iget-object v2, p0, Ll/ۢۤ۫;->ᩳ:[Ll/ᩳۤ۫;

    const/4 v4, 0x0

    aget-object v5, v2, v4

    const v6, 0x7f0a035d

    const v7, 0x7f0a035b

    const v8, 0x7f0a035c

    invoke-virtual {v5, v8, v6, v7, v1}, Ll/ᩳۤ۫;->ۙ(IIILandroid/view/View;)V

    .line 230
    aget-object v5, v2, v3

    const v6, 0x7f0a0561

    const v7, 0x7f0a055f

    const v8, 0x7f0a0560

    invoke-virtual {v5, v8, v6, v7, v1}, Ll/ᩳۤ۫;->ۙ(IIILandroid/view/View;)V

    const/4 v5, 0x2

    .line 231
    aget-object v6, v2, v5

    const v7, 0x7f0a0564

    const v8, 0x7f0a0562

    const v9, 0x7f0a0563

    invoke-virtual {v6, v9, v7, v8, v1}, Ll/ᩳۤ۫;->ۙ(IIILandroid/view/View;)V

    const/4 v6, 0x3

    .line 232
    aget-object v2, v2, v6

    const v7, 0x7f0a0127

    const v8, 0x7f0a0125

    const v9, 0x7f0a0126

    invoke-virtual {v2, v9, v7, v8, v1}, Ll/ᩳۤ۫;->ۙ(IIILandroid/view/View;)V

    const v2, 0x7f0a018a

    .line 234
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/᩹ۖ᩸;

    iput-object v2, p0, Ll/ۢۤ۫;->ܿ:Ll/᩹ۖ᩸;

    .line 235
    invoke-virtual {v2}, Ll/᩹ۖ᩸;->۟᩸()V

    .line 237
    iget-object v2, p0, Ll/ۢۤ۫;->ܿ:Ll/᩹ۖ᩸;

    new-instance v7, Ll/ܶۤ۫;

    invoke-direct {v7, p0}, Ll/ܶۤ۫;-><init>(Ll/ۢۤ۫;)V

    new-instance v8, Landroid/text/InputFilter$LengthFilter;

    const/16 v9, 0x40

    invoke-direct {v8, v9}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    new-array v9, v5, [Landroid/text/InputFilter;

    aput-object v7, v9, v4

    aput-object v8, v9, v3

    invoke-virtual {v2, v9}, Ll/᩹ۖ᩸;->ۙ([Landroid/text/InputFilter;)V

    const v2, 0x7f0a0634

    .line 241
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/ۢۤ۫;->᩶:Landroid/widget/TextView;

    .line 242
    iget-object v2, p0, Ll/ۢۤ۫;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v2, p0}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    const v2, 0x7f0a055a

    .line 243
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Ll/᩷ۤۧ;

    invoke-direct {v3, v5, p0}, Ll/᩷ۤۧ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0a00ac

    .line 245
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Ll/ۗ᩷ۚ;

    invoke-direct {v3, v6, p0}, Ll/ۗ᩷ۚ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 252
    invoke-virtual {v0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v1, 0x7f12018c

    const/4 v3, 0x0

    .line 253
    invoke-virtual {v2, v1, v3}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120b5d

    .line 254
    invoke-virtual {v2, v1, v3}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 255
    invoke-virtual {v2}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v2

    .line 256
    invoke-virtual {v2}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v2

    .line 257
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 258
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    const v4, 0x7f0d01d6

    .line 259
    invoke-virtual {v0, v4}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 260
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 261
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 262
    invoke-virtual {v3, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 263
    iget-boolean v1, p0, Ll/ۢۤ۫;->ۢ:Z

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 264
    new-instance v1, Ll/᩹ۤ۫;

    invoke-direct {v1, p0}, Ll/᩹ۤ۫;-><init>(Ll/ۢۤ۫;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public static ۙ(Ll/ۢۤ۫;Z)V
    .locals 5

    .line 265
    iput-boolean p1, p0, Ll/ۢۤ۫;->ۢ:Z

    .line 266
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v1, "fsuc"

    .line 0
    invoke-static {v0, v1, p1}, Ll/ۛ۬ܳ;->ۙ(Ll/ۢ֫ܺ;Ljava/lang/String;Z)V

    .line 516
    iget-object p1, p0, Ll/ۢۤ۫;->ᩳ:[Ll/ᩳۤ۫;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 517
    iget-object v3, p0, Ll/ۢۤ۫;->֡:Ll/֡ۤ۫;

    iget v4, v2, Ll/ᩳۤ۫;->ܳ:I

    invoke-virtual {v3, v4}, Ll/֡ۤ۫;->ۤ(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 518
    iget-object v2, v2, Ll/ᩳۤ۫;->᩸:Ll/᩹ۖ᩸;

    .line 519
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 520
    iget-boolean v4, p0, Ll/ۢۤ۫;->ۢ:Z

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {v2, v3}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 523
    :cond_2
    iget-object p1, p0, Ll/ۢۤ۫;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 524
    iget-object v0, p0, Ll/ۢۤ۫;->ܿ:Ll/᩹ۖ᩸;

    iget-boolean p0, p0, Ll/ۢۤ۫;->ۢ:Z

    if-eqz p0, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    :goto_2
    invoke-virtual {v0, p0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ۙ(Ll/ܽ֡֫;Ljava/lang/Runnable;)V
    .locals 6

    const/4 v0, 0x4

    new-array v1, v0, [Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const-string v3, "MD5"

    aput-object v3, v1, v2

    const/4 v3, 0x1

    const-string v4, "SHA1"

    aput-object v4, v1, v3

    const-string v3, "SHA256"

    const/4 v4, 0x2

    aput-object v3, v1, v4

    const-string v3, "CRC32"

    const/4 v4, 0x3

    aput-object v3, v1, v4

    .line 101
    sget-object v3, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v4, "fsf"

    invoke-interface {v3, v4, v2}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result v2

    new-array v3, v0, [Z

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_1

    .line 358
    sget-object v5, Ll/ۢۤ۫;->۠:[I

    aget v5, v5, v4

    and-int/2addr v5, v2

    if-nez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    aput-boolean v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 103
    :cond_1
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p0

    const v0, 0x7f12016f

    .line 104
    invoke-virtual {p0, v0}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v0, Ll/ۘۤ۫;

    invoke-direct {v0, v3}, Ll/ۘۤ۫;-><init>([Z)V

    .line 105
    invoke-virtual {p0, v1, v3, v0}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)V

    const/4 v0, 0x0

    const v1, 0x7f120161

    const v2, 0x7f1208c9

    .line 0
    invoke-static {p0, v2, v0, v1, v0}, Ll/ܰ۟ۙ;->ۙ(Ll/ۖۖۧ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/۠ۖۧ;

    move-result-object p0

    .line 109
    invoke-virtual {p0}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ܰۤ۫;

    invoke-direct {v1, v3, p0, p1}, Ll/ܰۤ۫;-><init>([ZLl/۠ۖۧ;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ۙ([ZLl/۠ۖۧ;Ljava/lang/Runnable;)V
    .locals 4

    const/4 v0, 0x0

    .line 110
    aget-boolean v1, p0, v0

    const/4 v2, 0x1

    if-nez v1, :cond_0

    aget-boolean v1, p0, v2

    if-nez v1, :cond_0

    const/4 v1, 0x2

    aget-boolean v1, p0, v1

    if-nez v1, :cond_0

    const/4 v1, 0x3

    aget-boolean v1, p0, v1

    if-nez v1, :cond_0

    const p0, 0x7f120ae5

    .line 111
    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 367
    :cond_0
    array-length v1, p0

    const/4 v3, 0x4

    if-ne v1, v3, :cond_3

    :goto_0
    if-ge v0, v3, :cond_2

    .line 370
    aget-boolean v1, p0, v0

    if-nez v1, :cond_1

    .line 371
    sget-object v1, Ll/ۢۤ۫;->۠:[I

    aget v1, v1, v0

    or-int/2addr v1, v2

    move v2, v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 115
    :cond_2
    sget-object p0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p0

    const-string v0, "fsf"

    invoke-interface {p0, v2, v0}, Ll/ᩳ֫ܺ;->ۙ(ILjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩳ֫ܺ;->apply()V

    .line 116
    invoke-virtual {p1}, Ll/۠ۖۧ;->dismiss()V

    .line 117
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void

    .line 442
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unexpected checksum item count"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ۙ()[I
    .locals 1

    .line 0
    sget-object v0, Ll/ۢۤ۫;->ۖ:[I

    return-object v0
.end method

.method public static bridge synthetic ۚ(Ll/ۢۤ۫;)Ll/ۖۗܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۤ۫;->۟:Ll/ۖۗܳ;

    return-object p0
.end method

.method public static synthetic ۤ(Ll/ۢۤ۫;)V
    .locals 3

    .line 244
    iget-object v0, p0, Ll/ۢۤ۫;->ܰ:Lbin/mt/plus/Main;

    new-instance v1, Ll/ۙ۠᩸;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Ll/ۙ۠᩸;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/ۢۤ۫;->ۙ(Ll/ܽ֡֫;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۢۤ۫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۢۤ۫;->ۢ:Z

    return p0
.end method

.method public static bridge synthetic ۫(Ll/ۢۤ۫;)Ll/֡ۤ۫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۤ۫;->֡:Ll/֡ۤ۫;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۢۤ۫;)Lbin/mt/plus/Main;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۤ۫;->ܰ:Lbin/mt/plus/Main;

    return-object p0
.end method

.method public static synthetic ᩴ(Ll/ۢۤ۫;)V
    .locals 2

    .line 246
    invoke-static {}, Ll/᩶᩷ۧ;->ܳ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 248
    iget-object v1, p0, Ll/ۢۤ۫;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v1, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 249
    iget-object p0, p0, Ll/ۢۤ۫;->ܿ:Ll/᩹ۖ᩸;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ll/᩹ۖ᩸;->᩹(I)V

    :cond_0
    return-void
.end method

.method public static ᩷(Landroid/widget/Button;Ll/۠ۨܳ;Ll/ۖۗܳ;)V
    .locals 1

    .line 83
    new-instance v0, Ll/ܽۤ۫;

    invoke-direct {v0, p1, p2}, Ll/ܽۤ۫;-><init>(Ll/۠ۨܳ;Ll/ۖۗܳ;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    new-instance v0, Ll/ۗۤ۫;

    invoke-direct {v0, p0, p1, p2}, Ll/ۗۤ۫;-><init>(Landroid/widget/Button;Ll/۠ۨܳ;Ll/ۖۗܳ;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public static synthetic ᩷(Ll/۠ۨܳ;Ll/ۖۗܳ;)V
    .locals 1

    .line 86
    new-instance v0, Ll/ۢۤ۫;

    invoke-direct {v0, p0, p1}, Ll/ۢۤ۫;-><init>(Ll/۠ۨܳ;Ll/ۖۗܳ;)V

    return-void
.end method

.method public static ᩷(Ll/ۢۤ۫;)V
    .locals 5

    .line 324
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v1, "fsf"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 325
    iget-object v1, p0, Ll/ۢۤ۫;->֡:Ll/֡ۤ۫;

    invoke-virtual {v1, v0}, Ll/֡ۤ۫;->ۙ(I)V

    .line 326
    iget-object v0, p0, Ll/ۢۤ۫;->ᩳ:[Ll/ᩳۤ۫;

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v4, v0, v2

    .line 327
    invoke-virtual {v4}, Ll/ᩳۤ۫;->ۙ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 329
    :cond_0
    iget-object v0, p0, Ll/ۢۤ۫;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢۤ۫;->afterTextChanged(Landroid/text/Editable;)V

    .line 330
    new-instance v0, Ll/ۚۛܳ;

    const/4 v2, 0x5

    invoke-direct {v0, v2, p0}, Ll/ۚۛܳ;-><init>(ILjava/lang/Object;)V

    .line 138
    invoke-virtual {v1}, Ll/֡ۤ۫;->ۙ()[I

    move-result-object v1

    .line 139
    array-length v2, v1

    if-nez v2, :cond_1

    .line 140
    invoke-virtual {v0}, Ll/ۚۛܳ;->run()V

    return-void

    .line 143
    :cond_1
    new-instance v2, Ll/ܿۤ۫;

    invoke-direct {v2, p0, v1, v0}, Ll/ܿۤ۫;-><init>(Ll/ۢۤ۫;[ILjava/lang/Runnable;)V

    .line 216
    invoke-virtual {v2}, Ll/ۖۙܺ;->۫()V

    return-void
.end method

.method public static bridge synthetic ᩷()[I
    .locals 1

    .line 0
    sget-object v0, Ll/ۢۤ۫;->۠:[I

    return-object v0
.end method

.method public static synthetic ᩸(Ll/ۢۤ۫;)V
    .locals 4

    .line 331
    iget-object v0, p0, Ll/ۢۤ۫;->ᩳ:[Ll/ᩳۤ۫;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 332
    invoke-virtual {v3}, Ll/ᩳۤ۫;->ۙ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 334
    :cond_0
    iget-object v0, p0, Ll/ۢۤ۫;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢۤ۫;->afterTextChanged(Landroid/text/Editable;)V

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ۢۤ۫;)Ll/۠ۨܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۤ۫;->֨:Ll/۠ۨܳ;

    return-object p0
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 10

    .line 540
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 541
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 542
    iget-object v0, p0, Ll/ۢۤ۫;->ᩳ:[Ll/ᩳۤ۫;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    sget-object v4, Ll/ۢۤ۫;->ۖ:[I

    iget-object v5, p0, Ll/ۢۤ۫;->֡:Ll/֡ۤ۫;

    if-ge v3, v1, :cond_4

    aget-object v6, v0, v3

    .line 543
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    iget v8, v6, Ll/ᩳۤ۫;->ܳ:I

    iget-object v9, v6, Ll/ᩳۤ۫;->᩷:Ljava/lang/String;

    aget v4, v4, v8

    if-eq v7, v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 546
    :cond_0
    invoke-virtual {v5, v8}, Ll/֡ۤ۫;->᩷(I)Ljava/lang/String;

    move-result-object v0

    .line 547
    iget v1, v6, Ll/ᩳۤ۫;->ܳ:I

    invoke-virtual {v5, v1}, Ll/֡ۤ۫;->ۤ(I)Z

    move-result v1

    if-eqz v1, :cond_3

    if-nez v0, :cond_1

    goto :goto_1

    .line 552
    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 553
    iget-object p1, p0, Ll/ۢۤ۫;->᩶:Landroid/widget/TextView;

    const-string v0, " \u221a"

    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 554
    iget-object p1, p0, Ll/ۢۤ۫;->᩶:Landroid/widget/TextView;

    sget v0, Ll/ۗۡ֫;->ᩴۙ:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 556
    :cond_2
    iget-object p1, p0, Ll/ۢۤ۫;->᩶:Landroid/widget/TextView;

    const-string v0, " \u00d7"

    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 557
    iget-object p1, p0, Ll/ۢۤ۫;->᩶:Landroid/widget/TextView;

    sget v0, Ll/ۗۡ֫;->᩸ۙ:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 548
    :cond_3
    :goto_1
    iget-object p1, p0, Ll/ۢۤ۫;->᩶:Landroid/widget/TextView;

    const-string v0, " ?"

    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 549
    iget-object p1, p0, Ll/ۢۤ۫;->᩶:Landroid/widget/TextView;

    sget v0, Ll/ۗۡ֫;->᩸ۙ:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 561
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v3, 0x8

    if-le v1, v3, :cond_7

    .line 562
    array-length v1, v0

    :goto_2
    if-ge v2, v1, :cond_7

    aget-object v3, v0, v2

    .line 563
    iget v6, v3, Ll/ᩳۤ۫;->ܳ:I

    invoke-virtual {v5, v6}, Ll/֡ۤ۫;->᩷(I)Ljava/lang/String;

    move-result-object v7

    .line 564
    invoke-virtual {v5, v6}, Ll/֡ۤ۫;->ۤ(I)Z

    move-result v8

    if-eqz v8, :cond_6

    if-eqz v7, :cond_6

    .line 565
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    aget v6, v4, v6

    if-lt v8, v6, :cond_5

    goto :goto_3

    .line 568
    :cond_5
    sget v6, Ll/᩺ۨۨ;->ۙ:I

    .line 7772
    sget-object v6, Ll/᩶ۨۨ;->᩷:Ll/᩶ۨۨ;

    invoke-virtual {v6, p1, v7}, Ll/᩶ۨۨ;->᩷(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 569
    iget-object p1, p0, Ll/ۢۤ۫;->᩶:Landroid/widget/TextView;

    iget-object v0, v3, Ll/ᩳۤ۫;->᩷:Ljava/lang/String;

    const-string v1, " \u2248"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 570
    iget-object p1, p0, Ll/ۢۤ۫;->᩶:Landroid/widget/TextView;

    sget v0, Ll/ۗۡ֫;->ᩴۙ:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_6
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 575
    :cond_7
    iget-object p1, p0, Ll/ۢۤ۫;->᩶:Landroid/widget/TextView;

    const-string v0, "?"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 576
    iget-object p1, p0, Ll/ۢۤ۫;->᩶:Landroid/widget/TextView;

    sget v0, Ll/ۗۡ֫;->ۙ:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 578
    :cond_8
    iget-object p1, p0, Ll/ۢۤ۫;->᩶:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.class public abstract Ll/᩺֨ܳ;
.super Ljava/lang/Object;
.source "052E"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final ۡ:Ljava/util/ArrayList;


# instance fields
.field public final ֡:Ll/ܽᩳ᩻;

.field public final ֨:Ll/֨ܶ;

.field public final ۟:Ll/ܽᩳ᩻;

.field public final ۢ:Landroid/view/View;

.field public final ܰ:Ll/ܽ֡֫;

.field public final ܿ:Ll/۠ۖۧ;

.field public final ᩳ:Ll/ܽᩳ᩻;

.field public final ᩶:Ll/֨ܶ;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/᩺֨ܳ;->ۡ:Ljava/util/ArrayList;

    .line 119
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v1, "mrir"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->ۙ(Ljava/lang/String;[B)[B

    move-result-object v0

    if-eqz v0, :cond_0

    .line 121
    new-instance v1, Ll/᩵ۚۤ;

    invoke-direct {v1, v0}, Ll/᩵ۚۤ;-><init>([B)V

    .line 122
    invoke-virtual {v1}, Ll/᩵ۚۤ;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 124
    sget-object v3, Ll/᩺֨ܳ;->ۡ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۛ֨ܳ;->ۙ(Ll/᩵ۚۤ;)Ll/ۛ֨ܳ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ll/ܽ֡֫;Ljava/util/ArrayList;ZZ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 58
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object v1, v0, Ll/᩺֨ܳ;->ܰ:Ll/ܽ֡֫;

    const v2, 0x7f0d00af

    .line 60
    invoke-virtual {v1, v2}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0a0691

    .line 61
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    new-instance v4, Ll/۠ۙ֫;

    const/4 v5, 0x1

    move-object/from16 v6, p2

    invoke-direct {v4, v5, v1, v6}, Ll/۠ۙ֫;-><init>(ILl/ۤ᩻ۙ;Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f0a0186

    .line 62
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/ܽᩳ᩻;

    iput-object v3, v0, Ll/᩺֨ܳ;->֡:Ll/ܽᩳ᩻;

    const v4, 0x7f0a0187

    .line 63
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Ll/ܽᩳ᩻;

    iput-object v4, v0, Ll/᩺֨ܳ;->۟:Ll/ܽᩳ᩻;

    const v5, 0x7f0a0188

    .line 64
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/ܽᩳ᩻;

    iput-object v5, v0, Ll/᩺֨ܳ;->ᩳ:Ll/ܽᩳ᩻;

    const v6, 0x7f0a05c5

    .line 65
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Ll/֨ܶ;

    iput-object v6, v0, Ll/᩺֨ܳ;->֨:Ll/֨ܶ;

    const v7, 0x7f0a05c6

    .line 66
    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Ll/֨ܶ;

    iput-object v7, v0, Ll/᩺֨ܳ;->᩶:Ll/֨ܶ;

    const v7, 0x7f0a0279

    .line 67
    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    iput-object v7, v0, Ll/᩺֨ܳ;->ۢ:Landroid/view/View;

    .line 68
    new-instance v8, Ll/ۛᩴۚ;

    const/4 v9, 0x2

    invoke-direct {v8, v9, v0}, Ll/ۛᩴۚ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    sget-object v8, Ll/᩺֨ܳ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    const/4 v9, 0x1

    xor-int/2addr v8, v9

    invoke-virtual {v7, v8}, Landroid/view/View;->setEnabled(Z)V

    const-string v7, "{P}{S}"

    .line 70
    invoke-virtual {v3, v7}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/CharSequence;)V

    .line 71
    invoke-virtual {v3}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v7

    invoke-virtual {v7}, Ll/᩹ۖ᩸;->ۗ᩸()V

    const-string v7, ""

    .line 72
    invoke-virtual {v4, v7}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/CharSequence;)V

    .line 73
    invoke-virtual {v5, v7}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/CharSequence;)V

    .line 74
    new-instance v4, Ll/֫֨ܳ;

    invoke-direct {v4, v0}, Ll/֫֨ܳ;-><init>(Ll/᩺֨ܳ;)V

    invoke-virtual {v6, v4}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 78
    sget-object v4, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v5, "rename_multi_regex"

    const/4 v7, 0x0

    invoke-interface {v4, v5, v7}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v6, v4}, Ll/֨ܶ;->setChecked(Z)V

    .line 79
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-direct {v4}, Landroid/text/SpannableStringBuilder;-><init>()V

    const v5, 0x7f120a4a

    .line 80
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "\n\n"

    .line 81
    invoke-virtual {v5, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v8

    const-string v10, "\n{N}"

    .line 82
    invoke-virtual {v5, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    const/4 v11, -0x1

    if-eq v8, v11, :cond_3

    if-eq v10, v11, :cond_3

    if-lt v8, v10, :cond_3

    .line 87
    invoke-virtual {v4, v5, v7, v10}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    move-result-object v11

    const-string v12, "\n"

    invoke-virtual {v11, v12}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 89
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v11

    const v13, 0x7f120a4d

    .line 90
    invoke-virtual {v1, v13}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4, v14}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 91
    new-instance v14, Ll/ۧ֨ܳ;

    invoke-direct {v14, v0, v1}, Ll/ۧ֨ܳ;-><init>(Ll/᩺֨ܳ;Ll/ܽ֡֫;)V

    const-string v15, "%.+?%"

    .line 192
    invoke-static {v15}, Ll/ܿܶۤ;->ۙ(Ljava/lang/String;)Ll/ܿܶۤ;

    move-result-object v15

    invoke-virtual {v15, v4}, Ll/ܿܶۤ;->matcher(Ljava/lang/CharSequence;)Ll/ۘܶۤ;

    move-result-object v15

    .line 193
    invoke-virtual {v15, v11}, Ll/ۘܶۤ;->find(I)Z

    move-result v11

    if-eqz v11, :cond_2

    .line 194
    invoke-virtual {v15}, Ll/ۘܶۤ;->end()I

    move-result v11

    sub-int/2addr v11, v9

    invoke-virtual {v15}, Ll/ۘܶۤ;->end()I

    move-result v13

    invoke-virtual {v4, v11, v13}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 195
    invoke-virtual {v15}, Ll/ۘܶۤ;->start()I

    move-result v11

    invoke-virtual {v15}, Ll/ۘܶۤ;->start()I

    move-result v13

    add-int/2addr v13, v9

    invoke-virtual {v4, v11, v13}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 196
    new-instance v11, Ll/᩹֨ܳ;

    invoke-direct {v11, v14}, Ll/᩹֨ܳ;-><init>(Ll/ۧ֨ܳ;)V

    .line 206
    invoke-virtual {v15}, Ll/ۘܶۤ;->start()I

    move-result v13

    invoke-virtual {v15}, Ll/ۘܶۤ;->end()I

    move-result v14

    add-int/lit8 v14, v14, -0x2

    const/16 v15, 0x11

    .line 196
    invoke-virtual {v4, v11, v13, v14, v15}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    if-eqz p4, :cond_0

    .line 94
    invoke-virtual {v4, v12}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v11

    const v12, 0x7f120a4c

    invoke-virtual {v1, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 187
    :cond_0
    invoke-virtual {v4, v6}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 188
    new-instance v11, Landroid/text/style/RelativeSizeSpan;

    const/high16 v12, 0x3e800000    # 0.25f

    invoke-direct {v11, v12}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v13

    add-int/lit8 v13, v13, -0x2

    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v14

    invoke-virtual {v4, v11, v13, v14, v15}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    add-int/2addr v10, v9

    .line 99
    invoke-virtual {v4, v5, v10, v8}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    if-eqz p3, :cond_1

    .line 187
    invoke-virtual {v4, v6}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 188
    new-instance v6, Landroid/text/style/RelativeSizeSpan;

    invoke-direct {v6, v12}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v10

    add-int/lit8 v10, v10, -0x2

    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v11

    invoke-virtual {v4, v6, v10, v11, v15}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    const v6, 0x7f120a4b

    .line 104
    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 106
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v4, v5, v8, v6}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    const v5, 0x7f0a03f4

    .line 108
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 109
    invoke-virtual {v3}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v3

    invoke-static {v3}, Ll/᩻ۡᩴ;->ۙ(Ll/᩹ۖ᩸;)Ljava/util/function/Consumer;

    move-result-object v3

    invoke-static {v5, v4, v9, v3}, Ll/᩻ۡᩴ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;ZLjava/util/function/Consumer;)V

    .line 111
    invoke-virtual/range {p1 .. p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    invoke-virtual {v1, v7}, Ll/ۖۖۧ;->ۙ(Z)V

    const v2, 0x7f12095b

    const/4 v3, 0x0

    .line 112
    invoke-virtual {v1, v2, v3}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f120161

    .line 113
    invoke-virtual {v1, v2, v3}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 114
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object v1

    iput-object v1, v0, Ll/᩺֨ܳ;->ܿ:Ll/۠ۖۧ;

    .line 115
    invoke-static {v1}, Ll/᩶ۢᩴ;->ۙ(Ll/۠ۖۧ;)V

    return-void

    .line 209
    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1, v13}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 84
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private ۙ(Landroid/view/View;)V
    .locals 4

    .line 160
    sget-object v0, Ll/᩺֨ܳ;->ۡ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/᩻֨ܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ܺ֨ܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 161
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/CharSequence;

    .line 162
    iget-object v1, p0, Ll/᩺֨ܳ;->ܰ:Ll/ܽ֡֫;

    invoke-virtual {v1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    const v2, 0x7f12047c

    .line 163
    invoke-virtual {v1, v2}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v2, Ll/֡ۚۧ;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p0}, Ll/֡ۚۧ;-><init>(ILjava/lang/Object;)V

    .line 164
    invoke-virtual {v1, v0, v2}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 165
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v1

    .line 166
    invoke-virtual {v1}, Ll/۠ۖۧ;->᩷()Ll/᩹ᩴ;

    move-result-object v2

    new-instance v3, Ll/ܽ֨ܳ;

    invoke-direct {v3, p0, v0, v1, p1}, Ll/ܽ֨ܳ;-><init>(Ll/᩺֨ܳ;[Ljava/lang/CharSequence;Ll/۠ۖۧ;Landroid/view/View;)V

    invoke-virtual {v2, v3}, Ll/ᩴܿ᩻;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void
.end method

.method public static ۙ(Ll/᩺֨ܳ;I)V
    .locals 2

    .line 164
    sget-object v0, Ll/᩺֨ܳ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ֨ܳ;

    .line 153
    iget-object v0, p0, Ll/᩺֨ܳ;->֡:Ll/ܽᩳ᩻;

    invoke-static {p1}, Ll/ۛ֨ܳ;->ۙ(Ll/ۛ֨ܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/CharSequence;)V

    .line 154
    iget-object v0, p0, Ll/᩺֨ܳ;->۟:Ll/ܽᩳ᩻;

    invoke-static {p1}, Ll/ۛ֨ܳ;->᩸(Ll/ۛ֨ܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/CharSequence;)V

    .line 155
    iget-object v0, p0, Ll/᩺֨ܳ;->ᩳ:Ll/ܽᩳ᩻;

    invoke-static {p1}, Ll/ۛ֨ܳ;->ۤ(Ll/ۛ֨ܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/CharSequence;)V

    .line 156
    iget-object p0, p0, Ll/᩺֨ܳ;->֨:Ll/֨ܶ;

    invoke-static {p1}, Ll/ۛ֨ܳ;->᩷(Ll/ۛ֨ܳ;)Z

    move-result p1

    invoke-virtual {p0, p1}, Ll/֨ܶ;->setChecked(Z)V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩺֨ܳ;ILl/۠ۖۧ;Landroid/view/View;)V
    .locals 1

    .line 171
    sget-object v0, Ll/᩺֨ܳ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 172
    invoke-static {}, Ll/᩺֨ܳ;->ܺ()V

    .line 173
    invoke-virtual {p2}, Ll/۠ۖۧ;->dismiss()V

    .line 174
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 175
    iget-object p0, p0, Ll/᩺֨ܳ;->ۢ:Landroid/view/View;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void

    .line 177
    :cond_0
    invoke-direct {p0, p3}, Ll/᩺֨ܳ;->ۙ(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩺֨ܳ;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩺֨ܳ;->ۙ(Landroid/view/View;)V

    return-void
.end method

.method public static ܺ()V
    .locals 3

    .line 140
    new-instance v0, Ll/ۛۚۤ;

    invoke-direct {v0}, Ll/ۛۚۤ;-><init>()V

    .line 141
    sget-object v1, Ll/᩺֨ܳ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۛۚۤ;->writeByte(I)V

    .line 142
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ܳ;

    .line 143
    invoke-virtual {v2, v0}, Ll/ۛ֨ܳ;->ۙ(Ll/ۛۚۤ;)V

    goto :goto_0

    .line 145
    :cond_0
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v1

    const-string v2, "mrir"

    invoke-virtual {v0}, Ll/ۛۚۤ;->۫()[B

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ll/ᩳ֫ܺ;->ۙ(Ljava/lang/String;[B)Ll/ᩳ֫ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳ֫ܺ;->apply()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 351
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x1020019

    if-ne p1, v0, :cond_1

    .line 308
    iget-object p1, p0, Ll/᩺֨ܳ;->֨:Ll/֨ܶ;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 353
    invoke-virtual {p0}, Ll/᩺֨ܳ;->ᩴ()Ljava/lang/String;

    move-result-object p1

    .line 355
    :try_start_0
    invoke-static {p1}, Ll/ܿܶۤ;->ۙ(Ljava/lang/String;)Ll/ܿܶۤ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 357
    iget-object v0, p0, Ll/᩺֨ܳ;->ܰ:Ll/ܽ֡֫;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 358
    iget-object p1, p0, Ll/᩺֨ܳ;->۟:Ll/ܽᩳ᩻;

    invoke-virtual {p1}, Ll/ܽᩳ᩻;->֫()V

    .line 359
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 363
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ll/᩺֨ܳ;->ۚ()V

    :cond_1
    return-void
.end method

.method public final ֫()V
    .locals 7

    .line 149
    new-instance v6, Ll/ۛ֨ܳ;

    invoke-virtual {p0}, Ll/᩺֨ܳ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ll/᩺֨ܳ;->ᩴ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ll/᩺֨ܳ;->᩸()Ljava/lang/String;

    move-result-object v4

    .line 308
    iget-object v0, p0, Ll/᩺֨ܳ;->֨:Ll/֨ܶ;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v5

    const/4 v1, 0x0

    move-object v0, v6

    .line 149
    invoke-direct/range {v0 .. v5}, Ll/ۛ֨ܳ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 131
    sget-object v0, Ll/᩺֨ܳ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 132
    invoke-virtual {v0, v1, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 133
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v2, 0x64

    if-le v1, v2, :cond_0

    const/4 v1, 0x1

    .line 0
    invoke-static {v0, v1}, Ll/ۖܶ᩸;->ۙ(Ljava/util/ArrayList;I)V

    goto :goto_0

    .line 136
    :cond_0
    invoke-static {}, Ll/᩺֨ܳ;->ܺ()V

    return-void
.end method

.method public final ۙ()V
    .locals 1

    .line 292
    iget-object v0, p0, Ll/᩺֨ܳ;->ܿ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    return-void
.end method

.method public abstract ۚ()V
.end method

.method public final ۤ()Ll/۠ۖۧ;
    .locals 1

    .line 331
    iget-object v0, p0, Ll/᩺֨ܳ;->ܿ:Ll/۠ۖۧ;

    return-object v0
.end method

.method public final ۧ()V
    .locals 3

    .line 337
    iget-object v0, p0, Ll/᩺֨ܳ;->֡:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->᩸()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p0}, Ll/᩺֨ܳ;->ܳ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "{P}{S}"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 338
    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ܳ()V

    .line 340
    :cond_0
    iget-object v0, p0, Ll/᩺֨ܳ;->۟:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->᩸()I

    move-result v1

    if-lez v1, :cond_1

    .line 341
    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ܳ()V

    .line 343
    :cond_1
    iget-object v0, p0, Ll/᩺֨ܳ;->ᩳ:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->᩸()I

    move-result v1

    if-lez v1, :cond_2

    .line 344
    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ܳ()V

    .line 346
    :cond_2
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v0

    .line 308
    iget-object v1, p0, Ll/᩺֨ܳ;->֨:Ll/֨ܶ;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    const-string v2, "rename_multi_regex"

    .line 346
    invoke-interface {v0, v2, v1}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳ֫ܺ;->apply()V

    return-void
.end method

.method public final ۫()Z
    .locals 1

    .line 308
    iget-object v0, p0, Ll/᩺֨ܳ;->֨:Ll/֨ܶ;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    return v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 296
    iget-object v0, p0, Ll/᩺֨ܳ;->֡:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 1

    .line 300
    iget-object v0, p0, Ll/᩺֨ܳ;->۟:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ll/֨ܶ;
    .locals 2

    const/4 v0, 0x0

    .line 326
    iget-object v1, p0, Ll/᩺֨ܳ;->᩶:Ll/֨ܶ;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-object v1
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    .line 304
    iget-object v0, p0, Ll/᩺֨ܳ;->ᩳ:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()V
    .locals 2

    .line 313
    iget-object v0, p0, Ll/᩺֨ܳ;->ܿ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->ۚ()V

    .line 314
    invoke-virtual {v0}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 315
    invoke-static {v0}, Ll/ۚۙܺ;->᩷(Ll/۠ۖۧ;)V

    .line 316
    iget-object v0, p0, Ll/᩺֨ܳ;->֡:Ll/ܽᩳ᩻;

    invoke-static {v0}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    return-void
.end method

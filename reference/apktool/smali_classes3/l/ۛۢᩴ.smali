.class public final Ll/ۛۢᩴ;
.super Ljava/lang/Object;
.source "192I"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final ֡:Ll/۠ۖۧ;

.field public final ֨:Ll/᩹ۖ᩸;

.field public final ۖ:Ll/᩹ۖ᩸;

.field public ۟:Z

.field public ۠:Ll/ۨۢᩴ;

.field public final ۡ:Ll/᩹ۖ᩸;

.field public final ۢ:Ll/᩹ۖ᩸;

.field public final ܰ:Z

.field public final ܿ:Ll/᩶᩶᩻;

.field public final ᩳ:Ll/᩹ۖ᩸;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 10

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, Ll/ۛۢᩴ;->᩶:Z

    .line 47
    iput-boolean p2, p0, Ll/ۛۢᩴ;->ܰ:Z

    .line 48
    instance-of v1, p1, Ll/ܽ֡֫;

    const/4 v2, 0x0

    const v3, 0x7f0d008c

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Ll/ܽ֡֫;

    invoke-virtual {v1, v3}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 49
    :goto_0
    sget v3, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v3, Ll/ۖۖۧ;

    invoke-direct {v3, p1}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 50
    invoke-virtual {v3, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v4, 0x7f1208c9

    .line 51
    invoke-virtual {v3, v4, p0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v4, 0x7f120161

    .line 52
    invoke-virtual {v3, v4, v2}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 53
    invoke-virtual {v3}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object v2

    iput-object v2, p0, Ll/ۛۢᩴ;->֡:Ll/۠ۖۧ;

    .line 54
    invoke-static {v2}, Ll/᩶ۢᩴ;->ۙ(Ll/۠ۖۧ;)V

    const-string v3, "input_method"

    .line 55
    invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/inputmethod/InputMethodManager;

    const v4, 0x7f0a010f

    .line 56
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Ll/᩶᩶᩻;

    iput-object v4, p0, Ll/ۛۢᩴ;->ܿ:Ll/᩶᩶᩻;

    .line 57
    new-instance v5, Ll/᩻᩹᩸;

    invoke-direct {v5, p0}, Ll/᩻᩹᩸;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Ll/᩶᩶᩻;->ۙ(Ll/᩻᩹᩸;)V

    .line 63
    new-instance v5, Ll/ܶۢᩴ;

    invoke-direct {v5, v3}, Ll/ܶۢᩴ;-><init>(Landroid/view/inputmethod/InputMethodManager;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    const v3, 0x7f0a0186

    .line 68
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/᩹ۖ᩸;

    iput-object v3, p0, Ll/ۛۢᩴ;->ᩳ:Ll/᩹ۖ᩸;

    const v5, 0x7f0a0187

    .line 69
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/᩹ۖ᩸;

    iput-object v5, p0, Ll/ۛۢᩴ;->ۖ:Ll/᩹ۖ᩸;

    const v6, 0x7f0a0188

    .line 70
    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Ll/᩹ۖ᩸;

    iput-object v6, p0, Ll/ۛۢᩴ;->֨:Ll/᩹ۖ᩸;

    const v7, 0x7f0a0189

    .line 71
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Ll/᩹ۖ᩸;

    iput-object v7, p0, Ll/ۛۢᩴ;->ۢ:Ll/᩹ۖ᩸;

    const v8, 0x7f0a018a

    .line 72
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Ll/᩹ۖ᩸;

    iput-object v8, p0, Ll/ۛۢᩴ;->ۡ:Ll/᩹ۖ᩸;

    const/16 v9, 0x8

    if-nez p2, :cond_1

    .line 74
    invoke-virtual {v4}, Ll/᩶᩶᩻;->᩷()V

    const v4, 0x7f0a0610

    .line 75
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 76
    invoke-virtual {v3, v9}, Landroid/view/View;->setVisibility(I)V

    .line 78
    :cond_1
    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v9, 0x6

    .line 79
    :goto_1
    invoke-direct {v1, v9}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const-string p2, "0123456789abcdefABCDEF"

    .line 80
    invoke-static {p2}, Landroid/text/method/DigitsKeyListener;->getInstance(Ljava/lang/String;)Landroid/text/method/DigitsKeyListener;

    move-result-object p2

    const/4 v4, 0x3

    new-array v4, v4, [Landroid/text/InputFilter;

    const/4 v9, 0x0

    aput-object v1, v4, v9

    aput-object p2, v4, v0

    sget-object p2, Ll/ܰ۫ܺ;->ܰ:Landroid/text/InputFilter;

    const/4 v0, 0x2

    aput-object p2, v4, v0

    .line 83
    invoke-virtual {v8, v4}, Ll/᩹ۖ᩸;->ۙ([Landroid/text/InputFilter;)V

    .line 86
    new-instance p2, Ll/᩹ۢᩴ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 98
    invoke-virtual {v3, p2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 99
    invoke-virtual {v5, p2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 100
    invoke-virtual {v6, p2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 101
    invoke-virtual {v7, p2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 102
    invoke-virtual {v8, p2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 104
    new-instance p2, Ll/ۗۢᩴ;

    invoke-direct {p2, p0}, Ll/ۗۢᩴ;-><init>(Ll/ۛۢᩴ;)V

    .line 139
    invoke-virtual {v3, p2}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 140
    invoke-virtual {v5, p2}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 141
    invoke-virtual {v6, p2}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 142
    invoke-virtual {v7, p2}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 143
    new-instance p2, Ll/᩵ۢᩴ;

    invoke-direct {p2, p0}, Ll/᩵ۢᩴ;-><init>(Ll/ۛۢᩴ;)V

    invoke-virtual {v8, p2}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 170
    instance-of p1, p1, Landroid/app/Activity;

    if-nez p1, :cond_4

    .line 171
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1a

    if-lt p1, p2, :cond_3

    .line 172
    invoke-virtual {v2}, Ll/۠ۖۧ;->ܳ()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x7f6

    invoke-virtual {p1, p2}, Landroid/view/Window;->setType(I)V

    return-void

    .line 174
    :cond_3
    invoke-virtual {v2}, Ll/۠ۖۧ;->ܳ()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x7d3

    invoke-virtual {p1, p2}, Landroid/view/Window;->setType(I)V

    :cond_4
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛۢᩴ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/ۛۢᩴ;->᩶:Z

    return-void
.end method

.method private ۙ(IZ)V
    .locals 5

    .line 180
    iget-object v0, p0, Ll/ۛۢᩴ;->ᩳ:Ll/᩹ۖ᩸;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p2, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-nez v3, :cond_1

    .line 181
    :cond_0
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x42c80000    # 100.0f

    mul-float v3, v3, v4

    const/high16 v4, 0x437f0000    # 255.0f

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 182
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 183
    iput-boolean v2, p0, Ll/ۛۢᩴ;->۟:Z

    .line 184
    invoke-virtual {v0, v3}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 185
    iput-boolean v1, p0, Ll/ۛۢᩴ;->۟:Z

    .line 188
    :cond_1
    iget-object v0, p0, Ll/ۛۢᩴ;->ۖ:Ll/᩹ۖ᩸;

    if-nez p2, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-nez v3, :cond_3

    .line 189
    :cond_2
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 190
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 191
    iput-boolean v2, p0, Ll/ۛۢᩴ;->۟:Z

    .line 192
    invoke-virtual {v0, v3}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 193
    iput-boolean v1, p0, Ll/ۛۢᩴ;->۟:Z

    .line 196
    :cond_3
    iget-object v0, p0, Ll/ۛۢᩴ;->֨:Ll/᩹ۖ᩸;

    if-nez p2, :cond_4

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-nez v3, :cond_5

    .line 197
    :cond_4
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 198
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 199
    iput-boolean v2, p0, Ll/ۛۢᩴ;->۟:Z

    .line 200
    invoke-virtual {v0, v3}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 201
    iput-boolean v1, p0, Ll/ۛۢᩴ;->۟:Z

    .line 204
    :cond_5
    iget-object v0, p0, Ll/ۛۢᩴ;->ۢ:Ll/᩹ۖ᩸;

    if-nez p2, :cond_6

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-nez v3, :cond_7

    .line 205
    :cond_6
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 206
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_7

    .line 207
    iput-boolean v2, p0, Ll/ۛۢᩴ;->۟:Z

    .line 208
    invoke-virtual {v0, v3}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 209
    iput-boolean v1, p0, Ll/ۛۢᩴ;->۟:Z

    .line 212
    :cond_7
    iget-object v0, p0, Ll/ۛۢᩴ;->ۡ:Ll/᩹ۖ᩸;

    if-nez p2, :cond_8

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result p2

    if-nez p2, :cond_a

    .line 213
    :cond_8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, v2, [Ljava/lang/Object;

    aput-object p1, p2, v1

    const-string p1, "%08X"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 214
    iget-boolean p2, p0, Ll/ۛۢᩴ;->ܰ:Z

    if-nez p2, :cond_9

    const/4 p2, 0x2

    .line 215
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 217
    :cond_9
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_a

    .line 218
    iput-boolean v2, p0, Ll/ۛۢᩴ;->۟:Z

    .line 219
    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 220
    iput-boolean v1, p0, Ll/ۛۢᩴ;->۟:Z

    :cond_a
    return-void
.end method

.method public static synthetic ۙ(Ll/ۛۢᩴ;I)V
    .locals 1

    const/4 v0, 0x1

    .line 58
    invoke-direct {p0, p1, v0}, Ll/ۛۢᩴ;->ۙ(IZ)V

    .line 59
    iget-boolean p1, p0, Ll/ۛۢᩴ;->᩶:Z

    if-eqz p1, :cond_0

    .line 60
    iget-object p1, p0, Ll/ۛۢᩴ;->֡:Ll/۠ۖۧ;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ll/ۛۢᩴ;->᩶:Z

    invoke-virtual {p1, v0}, Ll/۠ۖۧ;->ۙ(Z)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۛۢᩴ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛۢᩴ;->᩶:Z

    return p0
.end method

.method public static bridge synthetic ۚ(Ll/ۛۢᩴ;)Ll/᩹ۖ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۢᩴ;->ۖ:Ll/᩹ۖ᩸;

    return-object p0
.end method

.method public static bridge synthetic ۤ(Ll/ۛۢᩴ;)Ll/۠ۖۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۢᩴ;->֡:Ll/۠ۖۧ;

    return-object p0
.end method

.method public static bridge synthetic ۫(Ll/ۛۢᩴ;)Ll/᩹ۖ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۢᩴ;->֨:Ll/᩹ۖ᩸;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۛۢᩴ;)Ll/᩹ۖ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۢᩴ;->ۢ:Ll/᩹ۖ᩸;

    return-object p0
.end method

.method public static bridge synthetic ᩴ(Ll/ۛۢᩴ;)Ll/᩹ۖ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۢᩴ;->ᩳ:Ll/᩹ۖ᩸;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۛۢᩴ;)Ll/᩶᩶᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۢᩴ;->ܿ:Ll/᩶᩶᩻;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۛۢᩴ;I)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, p1, v0}, Ll/ۛۢᩴ;->ۙ(IZ)V

    return-void
.end method

.method public static bridge synthetic ᩸(Ll/ۛۢᩴ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛۢᩴ;->۟:Z

    return p0
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 255
    iget-object p1, p0, Ll/ۛۢᩴ;->۠:Ll/ۨۢᩴ;

    if-eqz p1, :cond_0

    .line 256
    iget-object p2, p0, Ll/ۛۢᩴ;->ܿ:Ll/᩶᩶᩻;

    invoke-virtual {p2}, Ll/᩶᩶᩻;->ۙ()I

    move-result p2

    invoke-interface {p1, p2}, Ll/ۨۢᩴ;->ۙ(I)V

    :cond_0
    return-void
.end method

.method public final ۙ(I)V
    .locals 1

    .line 241
    iget-boolean v0, p0, Ll/ۛۢᩴ;->ܰ:Z

    if-nez v0, :cond_0

    const/high16 v0, -0x1000000

    or-int/2addr p1, v0

    .line 244
    :cond_0
    iget-object v0, p0, Ll/ۛۢᩴ;->ܿ:Ll/᩶᩶᩻;

    invoke-virtual {v0, p1}, Ll/᩶᩶᩻;->ۙ(I)V

    const/4 v0, 0x1

    .line 245
    invoke-direct {p0, p1, v0}, Ll/ۛۢᩴ;->ۙ(IZ)V

    .line 246
    iget-object p1, p0, Ll/ۛۢᩴ;->֡:Ll/۠ۖۧ;

    invoke-virtual {p1}, Ll/۠ۖۧ;->ۚ()V

    return-void
.end method

.method public final ۙ(Ll/ۨۢᩴ;)V
    .locals 0

    .line 226
    iput-object p1, p0, Ll/ۛۢᩴ;->۠:Ll/ۨۢᩴ;

    return-void
.end method

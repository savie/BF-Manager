.class public final Ll/֫ܶܳ;
.super Landroid/widget/LinearLayout;
.source "W6DR"


# static fields
.field public static final synthetic ֫ۙ:I


# instance fields
.field public final ֡:Ll/֫ܶܳ;

.field public ֨:Landroid/widget/TextView;

.field public ۖ:Landroid/widget/TextView;

.field public ۙۙ:Ll/᩹᩹ܳ;

.field public final ۚۙ:Ll/ܽܽܳ;

.field public final ۜ:Ll/ۘ۠֫;

.field public ۟:I

.field public ۠:Landroid/widget/ListView;

.field public ۡ:Ll/ۚܺ;

.field public ۢ:Landroid/widget/TextView;

.field public ۤۙ:Landroid/widget/ImageView;

.field public ۫ۙ:Landroid/widget/BaseAdapter;

.field public ۬:Ljava/util/Map;

.field public ܰ:Ljava/lang/String;

.field public ܳۙ:Landroid/widget/ListView;

.field public ܿ:Landroid/widget/TextView;

.field public ᩳ:I

.field public ᩴۙ:Ll/ܳ᩹ܳ;

.field public ᩶:Z

.field public final ᩷ۙ:Ll/᩶ܶܳ;

.field public ᩸ۙ:Z


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;Ll/᩶ܶܳ;)V
    .locals 2

    .line 55
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 40
    iput-object p0, p0, Ll/֫ܶܳ;->֡:Ll/֫ܶܳ;

    .line 51
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, Ll/֫ܶܳ;->۬:Ljava/util/Map;

    .line 52
    new-instance v0, Ll/ۘ۠֫;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ۘ۠֫;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/֫ܶܳ;->ۜ:Ll/ۘ۠֫;

    .line 56
    iput-object p2, p0, Ll/֫ܶܳ;->᩷ۙ:Ll/᩶ܶܳ;

    .line 57
    new-instance p2, Ll/ܽܽܳ;

    invoke-direct {p2, p1}, Ll/ܽܽܳ;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ll/֫ܶܳ;->ۚۙ:Ll/ܽܽܳ;

    const/4 p1, 0x1

    .line 58
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ܶܳ;)Ll/ܽܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ܶܳ;->ۚۙ:Ll/ܽܽܳ;

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    const/16 v0, 0x2e

    const/4 v1, 0x1

    .line 0
    invoke-static {v0, v1, p0}, Ll/ܿۘۙ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ۙ(Landroid/widget/LinearLayout;II)V
    .locals 10

    .line 208
    iget v0, p0, Ll/֫ܶܳ;->۟:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, p3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 209
    :goto_0
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v4, 0x11

    .line 210
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 211
    invoke-virtual {v3, v0}, Landroid/view/View;->setSelected(Z)V

    .line 212
    new-instance v4, Landroid/graphics/drawable/RippleDrawable;

    const v5, 0x22ffffff

    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    if-eqz v0, :cond_1

    const v6, -0xd3bfac

    goto :goto_1

    :cond_1
    const v6, -0xcdc4ba

    :goto_1
    if-eqz v0, :cond_2

    const v7, -0xcea387

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    .line 213
    :goto_2
    iget-object v8, p0, Ll/֫ܶܳ;->ۚۙ:Ll/ܽܽܳ;

    const/4 v9, 0x5

    invoke-virtual {v8, v6, v9, v7}, Ll/ܽܽܳ;->ۙ(III)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v6

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 212
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 214
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v4, -0xe0b09

    if-eqz v0, :cond_3

    const v5, -0xc74001

    goto :goto_3

    :cond_3
    const v5, -0xe0b09

    :goto_3
    const/16 v6, 0xb

    invoke-virtual {v8, v6, v5, p2}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object p2

    .line 215
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 216
    invoke-virtual {v3, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 217
    new-instance v5, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const v6, 0x7f080231

    .line 218
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz v0, :cond_4

    const v4, -0xc74001

    .line 219
    :cond_4
    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    if-eqz v0, :cond_5

    const/high16 v4, 0x43340000    # 180.0f

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    .line 220
    :goto_4
    invoke-virtual {v5, v4}, Landroid/view/View;->setRotation(F)V

    .line 221
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v6, 0x10

    invoke-direct {p0, v6}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v7

    invoke-direct {p0, v6}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v6

    invoke-direct {v4, v7, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v6, 0x6

    .line 222
    invoke-direct {p0, v6}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v6

    iput v6, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 223
    invoke-virtual {v3, v5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 224
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    if-eqz v0, :cond_6

    const v5, 0x7f1205a1

    goto :goto_5

    :cond_6
    const v5, 0x7f1205a2

    .line 225
    :goto_5
    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v2

    .line 224
    invoke-virtual {v4, v5, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 226
    new-instance p2, Ll/۬ܽܳ;

    invoke-direct {p2, p0, v0, p3}, Ll/۬ܽܳ;-><init>(Ll/֫ܶܳ;ZI)V

    invoke-virtual {v3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 227
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/16 p3, 0x20

    invoke-direct {p0, p3}, Ll/֫ܶܳ;->ۤ(I)I

    move-result p3

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p2, v2, p3, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/4 p3, 0x2

    .line 228
    invoke-direct {p0, p3}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v0

    invoke-direct {p0, p3}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v1

    invoke-direct {p0, p3}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v2

    invoke-direct {p0, p3}, Ll/֫ܶܳ;->ۤ(I)I

    move-result p3

    invoke-virtual {p2, v0, v1, v2, p3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 229
    invoke-virtual {p1, v3, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/֫ܶܳ;)V
    .locals 2

    .line 179
    iget-object p0, p0, Ll/֫ܶܳ;->᩷ۙ:Ll/᩶ܶܳ;

    invoke-virtual {p0}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object p0

    .line 180
    iget-object v0, p0, Ll/֨ܽܳ;->᩶:Ll/ᩳܶܳ;

    iget-object v0, v0, Ll/ᩳܶܳ;->ۤ:[I

    invoke-virtual {p0}, Ll/֨ܽܳ;->᩸()I

    move-result v1

    aget v0, v0, v1

    invoke-virtual {p0, v0}, Ll/֨ܽܳ;->ۙ(I)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/֫ܶܳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֫ܶܳ;->᩷(I)V

    return-void
.end method

.method public static synthetic ۙ(Ll/֫ܶܳ;Ll/֨ܽܳ;I)V
    .locals 0

    .line 300
    iget-object p0, p0, Ll/֫ܶܳ;->᩷ۙ:Ll/᩶ܶܳ;

    invoke-virtual {p0}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object p0

    if-ne p0, p1, :cond_0

    invoke-virtual {p1, p2}, Ll/֨ܽܳ;->ۙ(I)V

    :cond_0
    return-void
.end method

.method public static synthetic ۙ(Ll/֫ܶܳ;Ll/֨ܽܳ;Landroid/view/MenuItem;)V
    .locals 0

    .line 311
    iget-object p0, p0, Ll/֫ܶܳ;->᩷ۙ:Ll/᩶ܶܳ;

    invoke-virtual {p0}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object p0

    if-ne p0, p1, :cond_0

    .line 312
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p0

    invoke-virtual {p1, p0}, Ll/֨ܽܳ;->ۙ(I)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/֫ܶܳ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/֫ܶܳ;->᩸ۙ:Z

    return-void
.end method

.method public static synthetic ۙ(Ll/֫ܶܳ;ZI)V
    .locals 0

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    .line 226
    :cond_0
    iput p2, p0, Ll/֫ܶܳ;->۟:I

    invoke-direct {p0}, Ll/֫ܶܳ;->ܳ()V

    return-void
.end method

.method public static bridge synthetic ۚ(Ll/֫ܶܳ;)Ll/ܳ᩹ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    return-object p0
.end method

.method private ۤ(I)I
    .locals 1

    int-to-float p1, p1

    .line 459
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method

.method public static synthetic ۤ(Ll/֫ܶܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/֫ܶܳ;->ᩴ()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/֫ܶܳ;)I
    .locals 1

    const/4 v0, 0x4

    .line 0
    invoke-direct {p0, v0}, Ll/֫ܶܳ;->ۤ(I)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۫(Ll/֫ܶܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֫ܶܳ;->᩸ۙ:Z

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/֫ܶܳ;)Ll/᩶ܶܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ܶܳ;->᩷ۙ:Ll/᩶ܶܳ;

    return-object p0
.end method

.method private ܳ()V
    .locals 15

    .line 129
    iget-object v0, p0, Ll/֫ܶܳ;->ۜ:Ll/ۘ۠֫;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 130
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v0, 0x0

    .line 131
    iput-object v0, p0, Ll/֫ܶܳ;->ۡ:Ll/ۚܺ;

    iput-object v0, p0, Ll/֫ܶܳ;->ܿ:Landroid/widget/TextView;

    iput-object v0, p0, Ll/֫ܶܳ;->ۖ:Landroid/widget/TextView;

    iput-object v0, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    iput-object v0, p0, Ll/֫ܶܳ;->֨:Landroid/widget/TextView;

    .line 132
    iput-object v0, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    .line 133
    iput-object v0, p0, Ll/֫ܶܳ;->ܳۙ:Landroid/widget/ListView;

    .line 134
    iput-object v0, p0, Ll/֫ܶܳ;->۫ۙ:Landroid/widget/BaseAdapter;

    .line 135
    iget-object v0, p0, Ll/֫ܶܳ;->ۚۙ:Ll/ܽܽܳ;

    iget-object v1, p0, Ll/֫ܶܳ;->֡:Ll/֫ܶܳ;

    invoke-virtual {v0, v1}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    move-result-object v8

    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f120554

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xf

    const v4, -0xe0b09

    invoke-virtual {v0, v3, v4, v2}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v2

    .line 137
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, 0x0

    const/4 v4, -0x2

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-direct {v3, v9, v4, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v8, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    iget-object v11, p0, Ll/֫ܶܳ;->᩷ۙ:Ll/᩶ܶܳ;

    invoke-static {v11}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Ll/֫ܿ֫;

    const/4 v2, 0x1

    invoke-direct {v6, v2, v11}, Ll/֫ܿ֫;-><init>(ILjava/lang/Object;)V

    const v7, -0xc74001

    .line 138
    iget-object v2, p0, Ll/֫ܶܳ;->ۚۙ:Ll/ܽܽܳ;

    const v4, 0x7f080248

    const v5, 0x7f12055f

    move-object v3, v8

    invoke-virtual/range {v2 .. v7}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;IILjava/lang/Runnable;I)Landroid/widget/ImageView;

    move-result-object v2

    const/4 v12, 0x7

    .line 140
    invoke-direct {p0, v12}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v3

    invoke-direct {p0, v12}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v4

    invoke-direct {p0, v12}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v5

    invoke-direct {p0, v12}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v6

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 141
    iget-boolean v3, p0, Ll/֫ܶܳ;->᩶:Z

    const/4 v13, 0x1

    xor-int/2addr v3, v13

    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 142
    iget-boolean v3, p0, Ll/֫ܶܳ;->᩶:Z

    if-eqz v3, :cond_0

    const v3, 0x3ecccccd    # 0.4f

    goto :goto_0

    :cond_0
    const/high16 v3, 0x3f800000    # 1.0f

    :goto_0
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 143
    new-instance v2, Ll/ۡܽܳ;

    invoke-direct {v2, v11}, Ll/ۡܽܳ;-><init>(Ll/᩶ܶܳ;)V

    invoke-virtual {v11}, Ll/᩶ܶܳ;->ܳ()Z

    move-result v3

    invoke-virtual {v0, v8, v2, v3}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;Ljava/lang/Runnable;Z)Landroid/widget/ImageView;

    move-result-object v2

    iput-object v2, p0, Ll/֫ܶܳ;->ۤۙ:Landroid/widget/ImageView;

    .line 144
    new-instance v6, Ll/ۖܽܳ;

    invoke-direct {v6, v11}, Ll/ۖܽܳ;-><init>(Ll/᩶ܶܳ;)V

    const v14, -0x4e443b

    iget-object v2, p0, Ll/֫ܶܳ;->ۚۙ:Ll/ܽܽܳ;

    const v4, 0x7f08024c

    const v5, 0x7f1207e7

    move-object v3, v8

    move v7, v14

    invoke-virtual/range {v2 .. v7}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;IILjava/lang/Runnable;I)Landroid/widget/ImageView;

    .line 145
    new-instance v6, Ll/ۚۛܳ;

    const/4 v2, 0x3

    invoke-direct {v6, v2, v11}, Ll/ۚۛܳ;-><init>(ILjava/lang/Object;)V

    iget-object v2, p0, Ll/֫ܶܳ;->ۚۙ:Ll/ܽܽܳ;

    const v4, 0x7f0801bf

    const v5, 0x7f12018c

    invoke-virtual/range {v2 .. v7}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;IILjava/lang/Runnable;I)Landroid/widget/ImageView;

    .line 146
    iget-object v2, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    const/16 v3, 0x8

    const/4 v4, 0x4

    const/16 v5, 0xb

    const-string v6, ""

    const/4 v7, 0x2

    if-eqz v2, :cond_3

    .line 147
    iget-object v2, v2, Ll/ܳ᩹ܳ;->᩷:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v6

    goto :goto_1

    :cond_1
    iget-object v2, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    iget-object v2, v2, Ll/ܳ᩹ܳ;->᩷:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 148
    :goto_1
    iget-object v8, p0, Ll/֫ܶܳ;->ܰ:Ljava/lang/String;

    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v8

    :goto_2
    const v8, -0xc74001

    invoke-virtual {v0, v5, v8, v2}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v2

    .line 149
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 150
    sget-object v8, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 151
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 152
    invoke-direct {p0, v7}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v2, v8, v10}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 153
    invoke-direct {p0, v4}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v8

    invoke-direct {p0, v3}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v11

    invoke-virtual {v2, v9, v8, v9, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 154
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 156
    :cond_3
    invoke-virtual {v0, v1}, Ll/ܽܽܳ;->ۙ(Ll/֫ܶܳ;)Landroid/view/View;

    .line 157
    iget-boolean v2, p0, Ll/֫ܶܳ;->᩶:Z

    const v8, -0x4e443b

    if-nez v2, :cond_4

    iget v2, p0, Ll/֫ܶܳ;->ᩳ:I

    if-eqz v2, :cond_6

    .line 158
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-boolean v11, p0, Ll/֫ܶܳ;->᩶:Z

    if-eqz v11, :cond_5

    const v11, 0x7f12057b

    goto :goto_3

    :cond_5
    iget v11, p0, Ll/֫ܶܳ;->ᩳ:I

    :goto_3
    invoke-virtual {v2, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/16 v11, 0xa

    invoke-virtual {v0, v11, v8, v2}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v2

    .line 159
    invoke-direct {p0, v12}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v11

    invoke-direct {p0, v12}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v14

    invoke-virtual {v2, v9, v11, v9, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 160
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 162
    :cond_6
    iget-object v2, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    if-eqz v2, :cond_a

    const/16 v2, 0xd

    const/16 v11, -0x47a5

    .line 163
    invoke-virtual {v0, v2, v11, v6}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v2

    iput-object v2, p0, Ll/֫ܶܳ;->֨:Landroid/widget/TextView;

    .line 164
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 165
    iget-object v2, p0, Ll/֫ܶܳ;->֨:Landroid/widget/TextView;

    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 166
    iget-object v2, p0, Ll/֫ܶܳ;->֨:Landroid/widget/TextView;

    invoke-direct {p0, v7}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v2, v11, v10}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 167
    iget-object v2, p0, Ll/֫ܶܳ;->֨:Landroid/widget/TextView;

    invoke-direct {p0, v3}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v3

    invoke-virtual {v2, v9, v3, v9, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 168
    invoke-virtual {v0, v5, v8, v6}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v2

    iput-object v2, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    .line 169
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 170
    iget-object v2, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    sget-object v3, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 171
    iget-object v2, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 172
    iget-object v2, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    invoke-direct {p0, v7}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v2, v3, v10}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 173
    iget-object v2, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    invoke-direct {p0, v4}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v3

    invoke-virtual {v2, v9, v3, v9, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 174
    iget-object v2, p0, Ll/֫ܶܳ;->֨:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 175
    iget-object v2, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 176
    invoke-virtual {v0, v1}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    move-result-object v2

    .line 177
    invoke-direct {p0, v12}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v3

    invoke-direct {p0, v12}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v6

    invoke-virtual {v2, v9, v3, v9, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 178
    new-instance v3, Ll/ܳۤۧ;

    const/4 v6, 0x2

    invoke-direct {v3, v6, p0}, Ll/ܳۤۧ;-><init>(ILjava/lang/Object;)V

    const v6, 0x7f120558

    invoke-virtual {v0, v2, v6, v3}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;ILjava/lang/Runnable;)Landroid/widget/TextView;

    move-result-object v3

    iput-object v3, p0, Ll/֫ܶܳ;->ۖ:Landroid/widget/TextView;

    .line 182
    new-instance v3, Ll/᩸۬᩸;

    const/4 v6, 0x3

    invoke-direct {v3, v6, p0}, Ll/᩸۬᩸;-><init>(ILjava/lang/Object;)V

    const v6, 0x7f120551

    invoke-virtual {v0, v2, v6, v3}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;ILjava/lang/Runnable;)Landroid/widget/TextView;

    move-result-object v3

    iput-object v3, p0, Ll/֫ܶܳ;->ܿ:Landroid/widget/TextView;

    .line 183
    new-instance v3, Ll/ۨۨ᩸;

    const/4 v6, 0x4

    invoke-direct {v3, v6, p0}, Ll/ۨۨ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2, v3}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;Ll/ۨۨ᩸;)Ll/ۚܺ;

    move-result-object v2

    iput-object v2, p0, Ll/֫ܶܳ;->ۡ:Ll/ۚܺ;

    .line 184
    invoke-virtual {v0, v1}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    move-result-object v2

    const v3, 0x7f120565

    .line 185
    invoke-direct {p0, v2, v3, v13}, Ll/֫ܶܳ;->ۙ(Landroid/widget/LinearLayout;II)V

    const v3, 0x7f12054c

    .line 186
    invoke-direct {p0, v2, v3, v7}, Ll/֫ܶܳ;->ۙ(Landroid/widget/LinearLayout;II)V

    .line 187
    iget v2, p0, Ll/֫ܶܳ;->۟:I

    if-eqz v2, :cond_7

    .line 188
    invoke-virtual {v0, v1}, Ll/ܽܽܳ;->ۙ(Ll/֫ܶܳ;)Landroid/view/View;

    move-result-object v2

    .line 189
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 190
    invoke-direct {p0, v4}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v4

    invoke-virtual {v3, v9, v4, v9, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 191
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 193
    :cond_7
    iget v2, p0, Ll/֫ܶܳ;->۟:I

    if-ne v2, v13, :cond_8

    .line 320
    invoke-direct {p0}, Ll/֫ܶܳ;->᩸()Landroid/widget/ListView;

    move-result-object v0

    iput-object v0, p0, Ll/֫ܶܳ;->ܳۙ:Landroid/widget/ListView;

    .line 321
    new-instance v0, Ll/ۤܶܳ;

    invoke-direct {v0, p0}, Ll/ۤܶܳ;-><init>(Ll/֫ܶܳ;)V

    iput-object v0, p0, Ll/֫ܶܳ;->۫ۙ:Landroid/widget/BaseAdapter;

    .line 340
    iget-object v1, p0, Ll/֫ܶܳ;->ܳۙ:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto :goto_4

    :cond_8
    if-ne v2, v7, :cond_9

    .line 195
    invoke-direct {p0}, Ll/֫ܶܳ;->᩸()Landroid/widget/ListView;

    move-result-object v2

    iput-object v2, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    .line 196
    invoke-virtual {v2, v13}, Landroid/widget/ListView;->setItemsCanFocus(Z)V

    .line 197
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f120556

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v5, v8, v2}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v2, 0x11

    .line 198
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 199
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v3, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v4, -0x1

    invoke-direct {v2, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 200
    iget-object v1, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/AdapterView;->setEmptyView(Landroid/view/View;)V

    .line 202
    :cond_9
    :goto_4
    invoke-virtual {p0}, Ll/֫ܶܳ;->ۤ()V

    :cond_a
    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/֫ܶܳ;)Ll/᩹᩹ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ܶܳ;->ۙۙ:Ll/᩹᩹ܳ;

    return-object p0
.end method

.method private ᩴ()V
    .locals 7

    .line 98
    iget-object v0, p0, Ll/֫ܶܳ;->ۜ:Ll/ۘ۠֫;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 99
    iget-object v1, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    if-eqz v1, :cond_9

    iget-object v1, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    if-eqz v1, :cond_9

    iget-object v1, p0, Ll/֫ܶܳ;->᩷ۙ:Ll/᩶ܶܳ;

    invoke-virtual {v1}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object v2

    if-nez v2, :cond_0

    goto/16 :goto_4

    .line 100
    :cond_0
    invoke-virtual {v1}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ܽܳ;->᩸()I

    move-result v1

    if-gez v1, :cond_1

    goto/16 :goto_4

    .line 102
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v2

    .line 103
    instance-of v3, v2, Landroid/widget/TextView;

    if-eqz v3, :cond_2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->hasSelection()Z

    move-result v2

    if-eqz v2, :cond_2

    const-wide/16 v1, 0x12c

    .line 105
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 108
    :cond_2
    invoke-direct {p0, v1}, Ll/֫ܶܳ;->᩸(I)V

    .line 109
    iget-object v0, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    if-nez v0, :cond_3

    goto/16 :goto_4

    .line 110
    :cond_3
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v0

    .line 111
    iget-object v2, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    .line 112
    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    .line 113
    :goto_0
    iget-object v4, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    invoke-virtual {v4}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_5

    move-object v4, v5

    goto :goto_1

    :cond_5
    iget-object v4, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    invoke-virtual {v4}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v4

    invoke-interface {v4, v0}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v4

    .line 114
    :goto_1
    instance-of v6, v4, Ljava/util/Map$Entry;

    if-eqz v6, :cond_6

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    .line 115
    :cond_6
    invoke-direct {p0, v1}, Ll/֫ܶܳ;->᩷(I)V

    if-eqz v5, :cond_8

    .line 117
    :goto_2
    iget-object v1, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    if-ge v3, v1, :cond_8

    .line 118
    iget-object v1, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1, v3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    .line 119
    instance-of v4, v1, Ljava/util/Map$Entry;

    if-eqz v4, :cond_7

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    move v0, v3

    goto :goto_3

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 125
    :cond_8
    :goto_3
    iget-object v1, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    invoke-virtual {v1, v0, v2}, Landroid/widget/AbsListView;->setSelectionFromTop(II)V

    :cond_9
    :goto_4
    return-void
.end method

.method private ᩷(I)V
    .locals 5

    if-gez p1, :cond_0

    .line 364
    iget-object p1, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void

    .line 367
    :cond_0
    iget-object v0, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    iget-object v0, v0, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴ᩹ܳ;

    iget-object v0, v0, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    .line 368
    iget-boolean v1, p0, Ll/֫ܶܳ;->᩸ۙ:Z

    .line 369
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    iget-object v3, p0, Ll/֫ܶܳ;->۬:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 368
    invoke-static {v0, v1, v2, v3}, Ll/ۙ᩹ܳ;->ۙ(Ljava/util/Map;ZFLjava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 370
    iget-object v1, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    new-instance v2, Ll/ܳܶܳ;

    invoke-direct {v2, p0, v0, p1}, Ll/ܳܶܳ;-><init>(Ll/֫ܶܳ;Ljava/util/ArrayList;I)V

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public static ᩷(Ll/֫ܶܳ;)V
    .locals 9

    .line 289
    iget-object v0, p0, Ll/֫ܶܳ;->᩷ۙ:Ll/᩶ܶܳ;

    invoke-virtual {v0}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object v1

    .line 290
    iget-object v2, v1, Ll/֨ܽܳ;->᩶:Ll/ᩳܶܳ;

    invoke-virtual {v1}, Ll/֨ܽܳ;->᩸()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ᩳܶܳ;->ۙ(I)Ljava/util/ArrayList;

    move-result-object v2

    .line 291
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v3, v5, :cond_0

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v1, p0}, Ll/֨ܽܳ;->ۙ(I)V

    return-void

    .line 292
    :cond_0
    iget-object v3, p0, Ll/֫ܶܳ;->ܿ:Landroid/widget/TextView;

    .line 306
    invoke-virtual {v0, v3}, Ll/᩶ܶܳ;->ۙ(Landroid/widget/TextView;)Ll/ܿܽ;

    move-result-object v0

    .line 307
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0}, Ll/ܿܽ;->ۤ()Ll/ۢۚ;

    move-result-object v5

    const-string v6, "#"

    const-string v7, " "

    .line 0
    invoke-static {v3, v6, v7}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 307
    iget-object v7, v1, Ll/֨ܽܳ;->ۢ:Ll/ܳ᩹ܳ;

    iget-object v7, v7, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    .line 308
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ᩴ᩹ܳ;

    iget-object v7, v7, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    const-string v8, "class"

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ll/֫ܶܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 307
    invoke-interface {v5, v4, v3, v4, v6}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v5

    .line 309
    invoke-virtual {v1}, Ll/֨ܽܳ;->᩸()I

    move-result v6

    if-ne v3, v6, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-interface {v5, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    goto :goto_0

    .line 310
    :cond_2
    new-instance v2, Ll/۠ܽܳ;

    invoke-direct {v2, p0, v1}, Ll/۠ܽܳ;-><init>(Ll/֫ܶܳ;Ll/֨ܽܳ;)V

    invoke-virtual {v0, v2}, Ll/ܿܽ;->ۙ(Ll/᩶ܽ;)V

    .line 316
    invoke-virtual {v0}, Ll/ܿܽ;->ᩴ()V

    return-void
.end method

.method private ᩸()Landroid/widget/ListView;
    .locals 5

    .line 346
    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f13016f

    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 347
    new-instance v1, Ll/᩸ܶܳ;

    invoke-direct {v1, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 355
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 356
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 454
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 455
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "window"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/WindowManager;

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 358
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v3, 0xb4

    invoke-direct {p0, v3}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v3

    const/16 v4, 0x60

    invoke-direct {p0, v4}, Ll/֫ܶܳ;->ۤ(I)I

    move-result v4

    iget v0, v0, Landroid/graphics/Point;->y:I

    div-int/lit8 v0, v0, 0x3

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v3, -0x1

    invoke-direct {v2, v3, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v0, p0, Ll/֫ܶܳ;->֡:Ll/֫ܶܳ;

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v1
.end method

.method private ᩸(I)V
    .locals 3

    if-gez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 280
    :cond_0
    iget-object v0, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    iget-object v0, v0, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴ᩹ܳ;

    iget-object v0, v0, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    const-string v1, "resource-id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 281
    :goto_0
    iget-object v1, p0, Ll/֫ܶܳ;->۬:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 282
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    if-nez v1, :cond_2

    goto :goto_2

    .line 283
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 282
    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f120555

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 284
    :goto_2
    iget-object v1, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 285
    :cond_4
    iget-object v0, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    if-gez p1, :cond_5

    const/16 p1, 0x8

    goto :goto_3

    :cond_5
    const/4 p1, 0x0

    :goto_3
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static ᩸(Ll/֫ܶܳ;)V
    .locals 10

    .line 296
    iget-object v0, p0, Ll/֫ܶܳ;->᩷ۙ:Ll/᩶ܶܳ;

    invoke-virtual {v0}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object v1

    .line 297
    new-instance v3, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v4, 0x7f130170

    invoke-direct {v3, v2, v4}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 298
    new-instance v9, Ll/۠ܶܳ;

    iget-object v4, p0, Ll/֫ܶܳ;->ۡ:Ll/ۚܺ;

    invoke-virtual {v1}, Ll/֨ܽܳ;->᩷()Ljava/util/List;

    move-result-object v5

    iget-object v6, v1, Ll/֨ܽܳ;->ۢ:Ll/ܳ᩹ܳ;

    .line 299
    invoke-virtual {v1}, Ll/֨ܽܳ;->᩸()I

    move-result v7

    new-instance v8, Ll/ۜܽܳ;

    invoke-direct {v8, p0, v1}, Ll/ۜܽܳ;-><init>(Ll/֫ܶܳ;Ll/֨ܽܳ;)V

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Ll/۠ܶܳ;-><init>(Landroid/view/ContextThemeWrapper;Ll/ۚܺ;Ljava/util/List;Ll/ܳ᩹ܳ;ILl/ۜܽܳ;)V

    .line 298
    invoke-virtual {v0, v9}, Ll/᩶ܶܳ;->ۙ(Ll/۠ܶܳ;)V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 64
    iget-object v0, p0, Ll/֫ܶܳ;->ۜ:Ll/ۘ۠֫;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 65
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, Ll/֫ܶܳ;->۬:Ljava/util/Map;

    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    iput-object v0, p0, Ll/֫ܶܳ;->ۙۙ:Ll/᩹᩹ܳ;

    iput-object v0, p0, Ll/֫ܶܳ;->ܰ:Ljava/lang/String;

    const/4 v1, 0x0

    iput v1, p0, Ll/֫ܶܳ;->ᩳ:I

    iput v1, p0, Ll/֫ܶܳ;->۟:I

    iput-boolean v1, p0, Ll/֫ܶܳ;->᩶:Z

    .line 67
    iput-boolean v1, p0, Ll/֫ܶܳ;->᩸ۙ:Z

    .line 68
    iput-object v0, p0, Ll/֫ܶܳ;->ۡ:Ll/ۚܺ;

    iput-object v0, p0, Ll/֫ܶܳ;->ܿ:Landroid/widget/TextView;

    iput-object v0, p0, Ll/֫ܶܳ;->ۖ:Landroid/widget/TextView;

    iput-object v0, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    iput-object v0, p0, Ll/֫ܶܳ;->֨:Landroid/widget/TextView;

    .line 69
    iput-object v0, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    .line 70
    iput-object v0, p0, Ll/֫ܶܳ;->ܳۙ:Landroid/widget/ListView;

    .line 71
    iput-object v0, p0, Ll/֫ܶܳ;->۫ۙ:Landroid/widget/BaseAdapter;

    .line 72
    iput-object v0, p0, Ll/֫ܶܳ;->ۤۙ:Landroid/widget/ImageView;

    .line 73
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    return-void
.end method

.method public final ۙ(I)V
    .locals 1

    .line 85
    iget-object v0, p0, Ll/֫ܶܳ;->ۜ:Ll/ۘ۠֫;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 86
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, Ll/֫ܶܳ;->۬:Ljava/util/Map;

    const/4 v0, 0x0

    .line 87
    iput-object v0, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    iput-object v0, p0, Ll/֫ܶܳ;->ۙۙ:Ll/᩹᩹ܳ;

    const/4 v0, 0x0

    iput v0, p0, Ll/֫ܶܳ;->۟:I

    iput p1, p0, Ll/֫ܶܳ;->ᩳ:I

    invoke-direct {p0}, Ll/֫ܶܳ;->ܳ()V

    return-void
.end method

.method public final ۙ(Ll/ܳ᩹ܳ;Ljava/lang/String;)V
    .locals 1

    .line 76
    iget-object v0, p0, Ll/֫ܶܳ;->ۜ:Ll/ۘ۠֫;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 77
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, Ll/֫ܶܳ;->۬:Ljava/util/Map;

    .line 78
    iput-object p1, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    .line 79
    iput-object p2, p0, Ll/֫ܶܳ;->ܰ:Ljava/lang/String;

    .line 80
    new-instance p1, Ll/᩹᩹ܳ;

    iget-object p2, p0, Ll/֫ܶܳ;->᩷ۙ:Ll/᩶ܶܳ;

    invoke-virtual {p2}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object p2

    iget-object p2, p2, Ll/֨ܽܳ;->᩶:Ll/ᩳܶܳ;

    iget-object p2, p2, Ll/ᩳܶܳ;->ۤ:[I

    invoke-direct {p1, p2}, Ll/᩹᩹ܳ;-><init>([I)V

    iput-object p1, p0, Ll/֫ܶܳ;->ۙۙ:Ll/᩹᩹ܳ;

    const/4 p1, 0x0

    .line 81
    iput p1, p0, Ll/֫ܶܳ;->ᩳ:I

    iput p1, p0, Ll/֫ܶܳ;->۟:I

    .line 82
    invoke-direct {p0}, Ll/֫ܶܳ;->ܳ()V

    return-void
.end method

.method public final ۙ(Ll/ܳ᩹ܳ;Ljava/util/Map;)V
    .locals 1

    .line 92
    iget-object v0, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Ll/֫ܶܳ;->۬:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 93
    :cond_0
    iput-object p2, p0, Ll/֫ܶܳ;->۬:Ljava/util/Map;

    .line 94
    invoke-direct {p0}, Ll/֫ܶܳ;->ᩴ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۙ(Z)V
    .locals 0

    .line 62
    iput-boolean p1, p0, Ll/֫ܶܳ;->᩶:Z

    invoke-direct {p0}, Ll/֫ܶܳ;->ܳ()V

    return-void
.end method

.method public final ۤ()V
    .locals 8

    .line 238
    iget-object v0, p0, Ll/֫ܶܳ;->ۜ:Ll/ۘ۠֫;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 239
    iget-object v0, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    if-eqz v0, :cond_e

    iget-object v0, p0, Ll/֫ܶܳ;->᩷ۙ:Ll/᩶ܶܳ;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object v1

    if-eqz v1, :cond_e

    iget-object v1, p0, Ll/֫ܶܳ;->֨:Landroid/widget/TextView;

    if-nez v1, :cond_0

    goto/16 :goto_5

    .line 240
    :cond_0
    invoke-virtual {v0}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object v0

    .line 241
    invoke-virtual {v0}, Ll/֨ܽܳ;->᩸()I

    move-result v1

    iget-object v2, v0, Ll/֨ܽܳ;->᩶:Ll/ᩳܶܳ;

    .line 243
    iget-object v3, p0, Ll/֫ܶܳ;->֨:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/view/View;->clearFocus()V

    .line 244
    iget-object v3, p0, Ll/֫ܶܳ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/view/View;->clearFocus()V

    .line 245
    iget-object v3, p0, Ll/֫ܶܳ;->֨:Landroid/widget/TextView;

    const-string v4, " "

    if-gez v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v6, 0x7f12055e

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_1
    const-string v5, "#"

    .line 0
    invoke-static {v1, v5, v4}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 246
    iget-object v6, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    iget-object v6, v6, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩴ᩹ܳ;

    iget-object v6, v6, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    const-string v7, "class"

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ll/֫ܶܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 245
    :goto_0
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-ltz v1, :cond_2

    .line 248
    iget-object v3, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    iget-object v3, v3, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴ᩹ܳ;

    iget-object v3, v3, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    const-string v5, "text"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 249
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    iget-object v5, p0, Ll/֫ܶܳ;->֨:Landroid/widget/TextView;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "  \u201c"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v7, 0x50

    invoke-static {v7, v3}, Ll/ᩳۡܶ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\u201d"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 251
    :cond_2
    invoke-direct {p0, v1}, Ll/֫ܶܳ;->᩸(I)V

    .line 252
    iget-object v3, p0, Ll/֫ܶܳ;->ۖ:Landroid/widget/TextView;

    const/4 v5, 0x0

    if-ltz v1, :cond_3

    iget-object v6, v2, Ll/ᩳܶܳ;->ۤ:[I

    aget v6, v6, v1

    if-ltz v6, :cond_3

    const/4 v6, 0x1

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 253
    iget-object v3, p0, Ll/֫ܶܳ;->ܿ:Landroid/widget/TextView;

    if-ltz v1, :cond_4

    invoke-virtual {v2, v1}, Ll/ᩳܶܳ;->ۙ(I)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 254
    iget-object v2, p0, Ll/֫ܶܳ;->ۡ:Ll/ۚܺ;

    invoke-virtual {v0}, Ll/֨ܽܳ;->ۙ()I

    move-result v3

    if-lez v3, :cond_5

    const/4 v5, 0x1

    :cond_5
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 255
    iget-object v2, p0, Ll/֫ܶܳ;->ۖ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z

    move-result v3

    const v5, -0x7f4e443b

    if-eqz v3, :cond_6

    const v3, -0xe0b09

    goto :goto_3

    :cond_6
    const v3, -0x7f4e443b

    :goto_3
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 256
    iget-object v2, p0, Ll/֫ܶܳ;->ܿ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_7

    const v3, -0xe0b09

    goto :goto_4

    :cond_7
    const v3, -0x7f4e443b

    :goto_4
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 257
    iget-object v2, p0, Ll/֫ܶܳ;->ۡ:Ll/ۚܺ;

    invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_8

    const v5, -0xe0b09

    :cond_8
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 258
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f120557

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 259
    invoke-virtual {v0}, Ll/֨ܽܳ;->ۙ()I

    move-result v3

    if-lez v3, :cond_a

    .line 260
    invoke-virtual {v0}, Ll/֨ܽܳ;->ۤ()I

    move-result v3

    .line 0
    invoke-static {v2, v4}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-ltz v3, :cond_9

    invoke-static {v2}, Ll/ۤ۠֫;->ۙ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    add-int/lit8 v3, v3, 0x1

    .line 262
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 0
    :cond_9
    invoke-static {v2}, Ll/ۤ۠֫;->ۙ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 263
    invoke-virtual {v0}, Ll/֨ܽܳ;->ۙ()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 265
    :cond_a
    iget-object v0, p0, Ll/֫ܶܳ;->ۡ:Ll/ۚܺ;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 266
    iget-object v0, p0, Ll/֫ܶܳ;->۫ۙ:Landroid/widget/BaseAdapter;

    if-eqz v0, :cond_d

    if-ltz v1, :cond_b

    .line 267
    iget-object v0, p0, Ll/֫ܶܳ;->ۙۙ:Ll/᩹᩹ܳ;

    invoke-virtual {v0, v1}, Ll/᩹᩹ܳ;->ۤ(I)V

    .line 268
    :cond_b
    iget-object v0, p0, Ll/֫ܶܳ;->۫ۙ:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    if-ltz v1, :cond_d

    .line 270
    iget-object v0, p0, Ll/֫ܶܳ;->ۙۙ:Ll/᩹᩹ܳ;

    iget-object v0, v0, Ll/᩹᩹ܳ;->۫:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 272
    iget-object v2, p0, Ll/֫ܶܳ;->ܳۙ:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v2

    if-lt v0, v2, :cond_c

    iget-object v2, p0, Ll/֫ܶܳ;->ܳۙ:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    move-result v2

    if-le v0, v2, :cond_d

    .line 273
    :cond_c
    iget-object v2, p0, Ll/֫ܶܳ;->ܳۙ:Landroid/widget/ListView;

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->setSelection(I)V

    .line 276
    :cond_d
    iget-object v0, p0, Ll/֫ܶܳ;->۠:Landroid/widget/ListView;

    if-eqz v0, :cond_e

    invoke-direct {p0, v1}, Ll/֫ܶܳ;->᩷(I)V

    :cond_e
    :goto_5
    return-void
.end method

.method public final ᩷(Z)V
    .locals 1

    .line 234
    iget-object v0, p0, Ll/֫ܶܳ;->ۤۙ:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    :cond_0
    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 61
    iget-object v0, p0, Ll/֫ܶܳ;->ᩴۙ:Ll/ܳ᩹ܳ;

    if-nez v0, :cond_1

    iget v0, p0, Ll/֫ܶܳ;->ᩳ:I

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/֫ܶܳ;->᩶:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

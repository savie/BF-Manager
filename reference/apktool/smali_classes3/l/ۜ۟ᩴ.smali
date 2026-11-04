.class public final Ll/ۜ۟ᩴ;
.super Landroid/view/ActionMode;
.source "P6HO"


# instance fields
.field public final ֫:Ll/ۢۚ;

.field public final ۗ:Ll/ۖᩳᩴ;

.field public final ۙ:Landroid/view/View$OnAttachStateChangeListener;

.field public final ۚ:[I

.field public final ۤ:Landroid/graphics/Rect;

.field public ۧ:Z

.field public final ۨ:Landroid/graphics/Rect;

.field public final ۫:Ljava/util/ArrayList;

.field public ܳ:Z

.field public final ܶ:Landroid/view/View;

.field public final ܺ:Ll/֨۟ᩴ;

.field public final ܽ:Landroid/graphics/Rect;

.field public final ᩴ:I

.field public final ᩵:Landroid/view/View;

.field public final ᩷:Landroid/view/ActionMode$Callback;

.field public ᩸:Z

.field public final ᩹:Ll/᩸֫᩸;

.field public final ᩻:Ll/ۗܽܳ;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/ActionMode$Callback;Ll/ۗܽܳ;)V
    .locals 3

    .line 47
    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    .line 30
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۜ۟ᩴ;->ۤ:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۜ۟ᩴ;->ۨ:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۜ۟ᩴ;->ܽ:Landroid/graphics/Rect;

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 31
    iput-object v0, p0, Ll/ۜ۟ᩴ;->ۚ:[I

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜ۟ᩴ;->۫:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Ll/ۜ۟ᩴ;->ۧ:Z

    .line 34
    new-instance v1, Ll/᩸֫᩸;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/᩸֫᩸;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, Ll/ۜ۟ᩴ;->᩹:Ll/᩸֫᩸;

    .line 38
    new-instance v1, Ll/֨۟ᩴ;

    invoke-direct {v1, p0}, Ll/֨۟ᩴ;-><init>(Ll/ۜ۟ᩴ;)V

    iput-object v1, p0, Ll/ۜ۟ᩴ;->ܺ:Ll/֨۟ᩴ;

    .line 42
    new-instance v1, Ll/ۖ۟ᩴ;

    invoke-direct {v1, p0}, Ll/ۖ۟ᩴ;-><init>(Ll/ۜ۟ᩴ;)V

    iput-object v1, p0, Ll/ۜ۟ᩴ;->ۙ:Landroid/view/View$OnAttachStateChangeListener;

    .line 48
    iput-object p1, p0, Ll/ۜ۟ᩴ;->᩵:Landroid/view/View;

    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/ۜ۟ᩴ;->ܶ:Landroid/view/View;

    .line 50
    iput-object p2, p0, Ll/ۜ۟ᩴ;->᩷:Landroid/view/ActionMode$Callback;

    .line 51
    iput-object p3, p0, Ll/ۜ۟ᩴ;->᩻:Ll/ۗܽܳ;

    .line 52
    new-instance p3, Ll/ۢۚ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p3, v1}, Ll/ۢۚ;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Ll/ۜ۟ᩴ;->֫:Ll/ۢۚ;

    .line 53
    invoke-virtual {p3, v0}, Ll/ۢۚ;->setDefaultShowAsAction(I)Ll/ۢۚ;

    .line 54
    new-instance v1, Ll/۠۟ᩴ;

    invoke-direct {v1, p0, p2}, Ll/۠۟ᩴ;-><init>(Ll/ۜ۟ᩴ;Landroid/view/ActionMode$Callback;)V

    invoke-virtual {p3, v1}, Ll/ۢۚ;->setCallback(Ll/۟ۚ;)V

    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    .line 97
    new-instance p3, Ll/ۖᩳᩴ;

    invoke-direct {p3, p2, p1}, Ll/ۖᩳᩴ;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 60
    iput-object p3, p0, Ll/ۜ۟ᩴ;->ۗ:Ll/ۖᩳᩴ;

    .line 61
    sget-object p2, Ll/۠ᩳᩴ;->ۢ:Ll/۠ᩳᩴ;

    invoke-virtual {p3, p2, p2}, Ll/ۖᩳᩴ;->ۙ(Ll/۠ᩳᩴ;Ll/۠ᩳᩴ;)V

    .line 63
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x17

    if-lt p2, p3, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/ActionMode;->setType(I)V

    .line 171
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x10102c5

    const p3, 0x10102c6

    filled-new-array {p2, p3}, [I

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    .line 174
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez p3, :cond_1

    const/4 p3, 0x0

    goto :goto_0

    .line 175
    :cond_1
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result p3

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result p2

    :goto_1
    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 64
    iput p2, p0, Ll/ۜ۟ᩴ;->ᩴ:I

    return-void

    :catchall_0
    move-exception p2

    .line 177
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 178
    throw p2
.end method

.method public static ۙ(Landroid/view/View;Landroid/view/ActionMode$Callback;Ll/ۗܽܳ;)Ll/ۜ۟ᩴ;
    .locals 1

    .line 69
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 70
    :cond_0
    new-instance v0, Ll/ۜ۟ᩴ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۜ۟ᩴ;-><init>(Landroid/view/View;Landroid/view/ActionMode$Callback;Ll/ۗܽܳ;)V

    .line 71
    iget-object p2, v0, Ll/ۜ۟ᩴ;->֫:Ll/ۢۚ;

    invoke-interface {p1, v0, p2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 72
    :cond_1
    iget-object p1, v0, Ll/ۜ۟ᩴ;->ۙ:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {p0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    iget-object p1, v0, Ll/ۜ۟ᩴ;->ܺ:Ll/֨۟ᩴ;

    invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 75
    invoke-virtual {v0}, Ll/ۜ۟ᩴ;->invalidate()V

    return-object v0
.end method

.method private ۙ(Landroid/view/Menu;)V
    .locals 3

    const/4 v0, 0x0

    .line 182
    :goto_0
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 183
    invoke-interface {p1, v0}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    .line 184
    invoke-interface {v1}, Landroid/view/MenuItem;->isVisible()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 185
    :cond_0
    invoke-interface {v1}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/ۜ۟ᩴ;->ۙ(Landroid/view/Menu;)V

    goto :goto_1

    .line 186
    :cond_1
    iget-object v2, p0, Ll/ۜ۟ᩴ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static synthetic ۙ(Ll/ۜ۟ᩴ;)V
    .locals 1

    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, Ll/ۜ۟ᩴ;->ܳ:Z

    .line 36
    invoke-direct {p0}, Ll/ۜ۟ᩴ;->᩷()V

    return-void
.end method

.method public static synthetic ۙ(Ll/ۜ۟ᩴ;Landroid/view/MenuItem;)Z
    .locals 1

    .line 155
    iget-object p0, p0, Ll/ۜ۟ᩴ;->֫:Ll/ۢۚ;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ll/ۢۚ;->performItemAction(Landroid/view/MenuItem;I)Z

    move-result p0

    return p0
.end method

.method private ᩷()V
    .locals 11

    .line 111
    iget-boolean v0, p0, Ll/ۜ۟ᩴ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_2

    .line 113
    :cond_0
    iget-object v0, p0, Ll/ۜ۟ᩴ;->᩵:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 162
    iget-object v1, p0, Ll/ۜ۟ᩴ;->ܶ:Landroid/view/View;

    if-ne v0, v1, :cond_1

    goto :goto_1

    .line 163
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_e

    if-ne v2, v1, :cond_d

    .line 117
    :goto_1
    iget-boolean v2, p0, Ll/ۜ۟ᩴ;->ܳ:Z

    if-eqz v2, :cond_2

    :goto_2
    return-void

    .line 118
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v2

    iget-object v3, p0, Ll/ۜ۟ᩴ;->ۗ:Ll/ۖᩳᩴ;

    if-eqz v2, :cond_c

    iget-object v2, p0, Ll/ۜ۟ᩴ;->ۨ:Landroid/graphics/Rect;

    invoke-virtual {v0, v2}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_5

    .line 122
    :cond_3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x17

    iget v6, p0, Ll/ۜ۟ᩴ;->ᩴ:I

    const/4 v7, 0x0

    iget-object v8, p0, Ll/ۜ۟ᩴ;->ۤ:Landroid/graphics/Rect;

    if-lt v4, v5, :cond_4

    iget-object v4, p0, Ll/ۜ۟ᩴ;->᩷:Landroid/view/ActionMode$Callback;

    instance-of v5, v4, Landroid/view/ActionMode$Callback2;

    if-eqz v5, :cond_4

    .line 123
    check-cast v4, Landroid/view/ActionMode$Callback2;

    invoke-virtual {v4, p0, v0, v8}, Landroid/view/ActionMode$Callback2;->onGetContentRect(Landroid/view/ActionMode;Landroid/view/View;Landroid/graphics/Rect;)V

    goto :goto_3

    .line 125
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v5

    add-int/2addr v5, v6

    invoke-virtual {v8, v7, v7, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 128
    :goto_3
    invoke-static {v8, v2}, Landroid/graphics/Rect;->intersects(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 129
    invoke-virtual {v3}, Ll/ۖᩳᩴ;->ۤ()V

    return-void

    .line 133
    :cond_5
    iget v4, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v4, v6

    iput v4, v2, Landroid/graphics/Rect;->bottom:I

    .line 134
    invoke-virtual {v8, v2}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    .line 135
    iget-object v4, p0, Ll/ۜ۟ᩴ;->ۚ:[I

    invoke-virtual {v0, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 136
    aget v5, v4, v7

    const/4 v6, 0x1

    aget v9, v4, v6

    invoke-virtual {v8, v5, v9}, Landroid/graphics/Rect;->offset(II)V

    .line 137
    invoke-virtual {v1, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 138
    aget v5, v4, v7

    aget v9, v4, v6

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v10

    add-int/2addr v10, v5

    aget v4, v4, v6

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr v6, v4

    invoke-virtual {v2, v5, v9, v10, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 139
    invoke-virtual {v8, v2}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 140
    invoke-virtual {v3}, Ll/ۖᩳᩴ;->ۤ()V

    return-void

    .line 143
    :cond_6
    invoke-virtual {v1, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 144
    invoke-virtual {v8, v2}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 145
    invoke-virtual {v3}, Ll/ۖᩳᩴ;->ۤ()V

    return-void

    .line 148
    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    move-result v0

    invoke-virtual {v3, v0}, Ll/ۖᩳᩴ;->ۙ(F)V

    .line 149
    iget-boolean v0, p0, Ll/ۜ۟ᩴ;->ۧ:Z

    iget-object v1, p0, Ll/ۜ۟ᩴ;->۫:Ljava/util/ArrayList;

    if-eqz v0, :cond_8

    .line 150
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 151
    iget-object v0, p0, Ll/ۜ۟ᩴ;->֫:Ll/ۢۚ;

    invoke-direct {p0, v0}, Ll/ۜ۟ᩴ;->ۙ(Landroid/view/Menu;)V

    .line 153
    :cond_8
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    iget-object v2, p0, Ll/ۜ۟ᩴ;->ܽ:Landroid/graphics/Rect;

    if-eqz v0, :cond_9

    invoke-virtual {v3}, Ll/ۖᩳᩴ;->ۤ()V

    goto :goto_4

    .line 154
    :cond_9
    iget-boolean v0, p0, Ll/ۜ۟ᩴ;->ۧ:Z

    if-nez v0, :cond_a

    invoke-virtual {v2, v8}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v3}, Ll/ۖᩳᩴ;->᩸()Z

    move-result v0

    if-nez v0, :cond_b

    .line 155
    :cond_a
    new-instance v0, Ll/ۡ۟ᩴ;

    invoke-direct {v0, p0}, Ll/ۡ۟ᩴ;-><init>(Ll/ۜ۟ᩴ;)V

    invoke-virtual {v3, v1, v0, v8}, Ll/ۖᩳᩴ;->ۙ(Ljava/util/ArrayList;Landroid/view/MenuItem$OnMenuItemClickListener;Landroid/graphics/Rect;)V

    .line 157
    :cond_b
    :goto_4
    iput-boolean v7, p0, Ll/ۜ۟ᩴ;->ۧ:Z

    .line 158
    invoke-virtual {v2, v8}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void

    .line 119
    :cond_c
    :goto_5
    invoke-virtual {v3}, Ll/ۖᩳᩴ;->ۤ()V

    return-void

    .line 163
    :cond_d
    invoke-interface {v2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    goto/16 :goto_0

    .line 114
    :cond_e
    invoke-virtual {p0}, Ll/ۜ۟ᩴ;->finish()V

    return-void
.end method

.method public static synthetic ᩷(Ll/ۜ۟ᩴ;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ll/ۜ۟ᩴ;->᩷()V

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 3

    .line 191
    iget-object v0, p0, Ll/ۜ۟ᩴ;->᩻:Ll/ۗܽܳ;

    iget-boolean v1, p0, Ll/ۜ۟ᩴ;->᩸:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 192
    iput-boolean v1, p0, Ll/ۜ۟ᩴ;->᩸:Z

    .line 193
    iget-object v1, p0, Ll/ۜ۟ᩴ;->᩹:Ll/᩸֫᩸;

    iget-object v2, p0, Ll/ۜ۟ᩴ;->᩵:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 194
    iget-object v1, p0, Ll/ۜ۟ᩴ;->ۙ:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v2, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 195
    iget-object v1, p0, Ll/ۜ۟ᩴ;->ܶ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 196
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iget-object v2, p0, Ll/ۜ۟ᩴ;->ܺ:Ll/֨۟ᩴ;

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 197
    :cond_1
    iget-object v1, p0, Ll/ۜ۟ᩴ;->ۗ:Ll/ۖᩳᩴ;

    invoke-virtual {v1}, Ll/ۖᩳᩴ;->ۙ()V

    .line 198
    :try_start_0
    iget-object v1, p0, Ll/ۜ۟ᩴ;->᩷:Landroid/view/ActionMode$Callback;

    invoke-interface {v1, p0}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    invoke-virtual {v0}, Ll/ۗܽܳ;->run()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ll/ۗܽܳ;->run()V

    throw v1
.end method

.method public final getCustomView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMenu()Landroid/view/Menu;
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ۜ۟ᩴ;->֫:Ll/ۢۚ;

    return-object v0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 203
    new-instance v0, Landroid/view/MenuInflater;

    iget-object v1, p0, Ll/ۜ۟ᩴ;->᩵:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final hide(J)V
    .locals 6

    .line 96
    iget-boolean v0, p0, Ll/ۜ۟ᩴ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    .line 97
    :cond_0
    iget-object v0, p0, Ll/ۜ۟ᩴ;->᩵:Landroid/view/View;

    iget-object v1, p0, Ll/ۜ۟ᩴ;->᩹:Ll/᩸֫᩸;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-nez v4, :cond_1

    const/4 p1, 0x0

    .line 99
    iput-boolean p1, p0, Ll/ۜ۟ᩴ;->ܳ:Z

    .line 100
    invoke-direct {p0}, Ll/ۜ۟ᩴ;->᩷()V

    return-void

    :cond_1
    const/4 v5, 0x1

    .line 103
    iput-boolean v5, p0, Ll/ۜ۟ᩴ;->ܳ:Z

    .line 104
    iget-object v5, p0, Ll/ۜ۟ᩴ;->ۗ:Ll/ۖᩳᩴ;

    invoke-virtual {v5}, Ll/ۖᩳᩴ;->ۤ()V

    if-gez v4, :cond_2

    .line 105
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x17

    if-lt v4, v5, :cond_2

    .line 106
    invoke-static {}, Landroid/view/ViewConfiguration;->getDefaultActionModeHideDuration()J

    move-result-wide p1

    goto :goto_0

    :cond_2
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    :goto_0
    const-wide/16 v2, 0xbb8

    .line 107
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-virtual {v0, v1, p1, p2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final invalidate()V
    .locals 2

    .line 82
    iget-boolean v0, p0, Ll/ۜ۟ᩴ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    .line 83
    :cond_0
    iget-object v0, p0, Ll/ۜ۟ᩴ;->᩷:Landroid/view/ActionMode$Callback;

    iget-object v1, p0, Ll/ۜ۟ᩴ;->֫:Ll/ۢۚ;

    invoke-interface {v0, p0, v1}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Ll/ۜ۟ᩴ;->ۧ:Z

    .line 85
    invoke-virtual {p0}, Ll/ۜ۟ᩴ;->invalidateContentRect()V

    return-void
.end method

.method public final invalidateContentRect()V
    .locals 2

    .line 90
    iget-boolean v0, p0, Ll/ۜ۟ᩴ;->ܳ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ۜ۟ᩴ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 91
    :cond_0
    iget-object v0, p0, Ll/ۜ۟ᩴ;->᩵:Landroid/view/View;

    iget-object v1, p0, Ll/ۜ۟ᩴ;->᩹:Ll/᩸֫᩸;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 92
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final setCustomView(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final setSubtitle(I)V
    .locals 0

    return-void
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method public final setTitle(I)V
    .locals 0

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method public final ۙ()Landroid/view/View;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ۜ۟ᩴ;->᩵:Landroid/view/View;

    return-object v0
.end method

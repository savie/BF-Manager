.class public Ll/ܺܽ;
.super Ljava/lang/Object;
.source "25PA"

# interfaces
.implements Ll/ܺ֫;


# static fields
.field public static ۗۙ:Ljava/lang/reflect/Method;

.field public static ᩵ۙ:Ljava/lang/reflect/Method;

.field public static ᩹ۙ:Ljava/lang/reflect/Method;


# instance fields
.field public ֡:I

.field public ֨:I

.field public ֫ۙ:Landroid/widget/PopupWindow;

.field public ۖ:I

.field public final ۙۙ:Ll/۫ܽ;

.field public ۚۙ:Z

.field public ۜ:Landroid/graphics/Rect;

.field public ۟:I

.field public ۠:I

.field public ۡ:Z

.field public ۢ:Ll/ۡܺ;

.field public ۤۙ:Landroid/widget/AdapterView$OnItemSelectedListener;

.field public ۧۙ:Landroid/view/View;

.field public ۫ۙ:Z

.field public final ۬:Landroid/os/Handler;

.field public ܰ:Landroid/widget/ListAdapter;

.field public ܳۙ:Landroid/database/DataSetObserver;

.field public final ܶۙ:Ll/ۧܽ;

.field public final ܺۙ:Ll/֫ܽ;

.field public final ܽۙ:Landroid/graphics/Rect;

.field public ܿ:Landroid/view/View;

.field public ᩳ:I

.field public ᩴۙ:Z

.field public ᩶:Landroid/content/Context;

.field public ᩷ۙ:Landroid/widget/AdapterView$OnItemClickListener;

.field public ᩸ۙ:I

.field public final ᩻ۙ:Ll/᩻ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 86
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x0

    const/4 v3, 0x1

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v5, Landroid/widget/PopupWindow;

    if-gt v0, v1, :cond_0

    :try_start_0
    const-string v0, "setClipToScreenEnabled"

    new-array v1, v3, [Ljava/lang/Class;

    aput-object v4, v1, v2

    .line 88
    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/ܺܽ;->ۗۙ:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    const-string v0, "setEpicenterBounds"

    new-array v1, v3, [Ljava/lang/Class;

    .line 95
    const-class v6, Landroid/graphics/Rect;

    aput-object v6, v1, v2

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/ܺܽ;->᩵ۙ:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    nop

    .line 102
    :cond_0
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-gt v0, v1, :cond_1

    :try_start_2
    const-string v0, "getMaxAvailableHeight"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Class;

    .line 104
    const-class v6, Landroid/view/View;

    aput-object v6, v1, v2

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v4, v1, v2

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/ܺܽ;->᩹ۙ:Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const v1, 0x7f040300

    .line 226
    invoke-direct {p0, p1, v0, v1}, Ll/ܺܽ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f040300

    .line 237
    invoke-direct {p0, p1, p2, v0}, Ll/ܺܽ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 250
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ܺܽ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 263
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p4, -0x2

    .line 117
    iput p4, p0, Ll/ܺܽ;->۟:I

    .line 118
    iput p4, p0, Ll/ܺܽ;->ۖ:I

    const/16 p4, 0x3ea

    .line 121
    iput p4, p0, Ll/ܺܽ;->۠:I

    const/4 p4, 0x0

    .line 126
    iput p4, p0, Ll/ܺܽ;->֡:I

    const v0, 0x7fffffff

    .line 130
    iput v0, p0, Ll/ܺܽ;->᩸ۙ:I

    .line 144
    new-instance v0, Ll/᩻ܽ;

    invoke-direct {v0, p0}, Ll/᩻ܽ;-><init>(Ll/ܺܽ;)V

    iput-object v0, p0, Ll/ܺܽ;->᩻ۙ:Ll/᩻ܽ;

    .line 145
    new-instance v0, Ll/ۧܽ;

    invoke-direct {v0, p0}, Ll/ۧܽ;-><init>(Ll/ܺܽ;)V

    iput-object v0, p0, Ll/ܺܽ;->ܶۙ:Ll/ۧܽ;

    .line 146
    new-instance v0, Ll/֫ܽ;

    invoke-direct {v0, p0}, Ll/֫ܽ;-><init>(Ll/ܺܽ;)V

    iput-object v0, p0, Ll/ܺܽ;->ܺۙ:Ll/֫ܽ;

    .line 147
    new-instance v0, Ll/۫ܽ;

    invoke-direct {v0, p0}, Ll/۫ܽ;-><init>(Ll/ܺܽ;)V

    iput-object v0, p0, Ll/ܺܽ;->ۙۙ:Ll/۫ܽ;

    .line 152
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ܺܽ;->ܽۙ:Landroid/graphics/Rect;

    .line 264
    iput-object p1, p0, Ll/ܺܽ;->᩶:Landroid/content/Context;

    .line 265
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ܺܽ;->۬:Landroid/os/Handler;

    .line 267
    sget-object v0, Ll/ۢ᩸;->᩵:[I

    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 269
    invoke-virtual {v0, p4, p4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v1

    iput v1, p0, Ll/ܺܽ;->ᩳ:I

    const/4 v1, 0x1

    .line 271
    invoke-virtual {v0, v1, p4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Ll/ܺܽ;->֨:I

    if-eqz v2, :cond_0

    .line 274
    iput-boolean v1, p0, Ll/ܺܽ;->ۡ:Z

    .line 276
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 278
    new-instance v0, Ll/ۚ᩻;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/ۚ᩻;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v0, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    .line 279
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void
.end method


# virtual methods
.method public final dismiss()V
    .locals 3

    .line 771
    iget-object v0, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 788
    iget-object v1, p0, Ll/ܺܽ;->ۧۙ:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 789
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 790
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    .line 791
    check-cast v1, Landroid/view/ViewGroup;

    .line 792
    iget-object v2, p0, Ll/ܺܽ;->ۧۙ:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    const/4 v1, 0x0

    .line 773
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 774
    iput-object v1, p0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    .line 775
    iget-object v0, p0, Ll/ܺܽ;->۬:Landroid/os/Handler;

    iget-object v1, p0, Ll/ܺܽ;->᩻ۙ:Ll/᩻ܽ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final getBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 422
    iget-object v0, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final isShowing()Z
    .locals 1

    .line 859
    iget-object v0, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    return v0
.end method

.method public final setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 431
    iget-object v0, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public show()V
    .locals 16

    move-object/from16 v0, p0

    .line 1157
    iget-object v1, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    const/4 v3, -0x1

    iget-object v4, v0, Ll/ܺܽ;->᩶:Landroid/content/Context;

    iget-object v5, v0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez v1, :cond_3

    .line 1177
    iget-boolean v1, v0, Ll/ܺܽ;->ᩴۙ:Z

    xor-int/2addr v1, v6

    invoke-virtual {v0, v4, v1}, Ll/ܺܽ;->ۙ(Landroid/content/Context;Z)Ll/ۡܺ;

    move-result-object v1

    iput-object v1, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    .line 1181
    iget-object v8, v0, Ll/ܺܽ;->ܰ:Landroid/widget/ListAdapter;

    invoke-virtual {v1, v8}, Ll/ᩴܿ᩻;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1182
    iget-object v1, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    iget-object v8, v0, Ll/ܺܽ;->᩷ۙ:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v1, v8}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1183
    iget-object v1, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    invoke-virtual {v1, v6}, Landroid/view/View;->setFocusable(Z)V

    .line 1184
    iget-object v1, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    invoke-virtual {v1, v6}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 1185
    iget-object v1, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    new-instance v8, Ll/᩸ܽ;

    invoke-direct {v8, v0}, Ll/᩸ܽ;-><init>(Ll/ܺܽ;)V

    invoke-virtual {v1, v8}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 1203
    iget-object v1, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    iget-object v8, v0, Ll/ܺܽ;->ܺۙ:Ll/֫ܽ;

    invoke-virtual {v1, v8}, Ll/ᩴܿ᩻;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 1205
    iget-object v1, v0, Ll/ܺܽ;->ۤۙ:Landroid/widget/AdapterView$OnItemSelectedListener;

    if-eqz v1, :cond_0

    .line 1206
    iget-object v8, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    invoke-virtual {v8, v1}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 1209
    :cond_0
    iget-object v1, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    .line 1211
    iget-object v8, v0, Ll/ܺܽ;->ۧۙ:Landroid/view/View;

    if-eqz v8, :cond_2

    .line 1215
    new-instance v9, Landroid/widget/LinearLayout;

    invoke-direct {v9, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1216
    invoke-virtual {v9, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1218
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-direct {v6, v3, v7, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1229
    invoke-virtual {v9, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1230
    invoke-virtual {v9, v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1242
    iget v1, v0, Ll/ܺܽ;->ۖ:I

    if-ltz v1, :cond_1

    const/high16 v6, -0x80000000

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    const/4 v6, 0x0

    .line 1249
    :goto_0
    invoke-static {v1, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 1251
    invoke-virtual {v8, v1, v7}, Landroid/view/View;->measure(II)V

    .line 1253
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 1254
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    iget v8, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v6, v8

    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v6, v1

    move-object v1, v9

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    .line 1260
    :goto_1
    invoke-virtual {v5, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    goto :goto_2

    .line 1262
    :cond_3
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 1263
    iget-object v1, v0, Ll/ܺܽ;->ۧۙ:Landroid/view/View;

    if-eqz v1, :cond_4

    .line 1266
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1267
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget v8, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v1, v8

    iget v6, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v6, v1

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    .line 1275
    :goto_2
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 1276
    iget-object v8, v0, Ll/ܺܽ;->ܽۙ:Landroid/graphics/Rect;

    if-eqz v1, :cond_5

    .line 1277
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1278
    iget v1, v8, Landroid/graphics/Rect;->top:I

    iget v9, v8, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v9, v1

    .line 1282
    iget-boolean v10, v0, Ll/ܺܽ;->ۡ:Z

    if-nez v10, :cond_6

    neg-int v1, v1

    .line 1283
    iput v1, v0, Ll/ܺܽ;->֨:I

    goto :goto_3

    .line 1286
    :cond_5
    invoke-virtual {v8}, Landroid/graphics/Rect;->setEmpty()V

    const/4 v9, 0x0

    .line 1292
    :cond_6
    :goto_3
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v1

    const/4 v10, 0x2

    if-ne v1, v10, :cond_7

    const/4 v1, 0x1

    goto :goto_4

    :cond_7
    const/4 v1, 0x0

    .line 459
    :goto_4
    iget-object v11, v0, Ll/ܺܽ;->ܿ:Landroid/view/View;

    .line 1293
    iget v12, v0, Ll/ܺܽ;->֨:I

    .line 1443
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x17

    if-gt v13, v14, :cond_9

    .line 1444
    sget-object v13, Ll/ܺܽ;->᩹ۙ:Ljava/lang/reflect/Method;

    if-eqz v13, :cond_8

    .line 1446
    :try_start_0
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 1447
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v15, 0x1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v11, v2, v7

    aput-object v14, v2, v15

    aput-object v1, v2, v10

    .line 1446
    invoke-virtual {v13, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    .line 1453
    :catch_0
    :cond_8
    invoke-virtual {v5, v11, v12}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;I)I

    move-result v1

    goto :goto_5

    .line 1455
    :cond_9
    invoke-static {v5, v11, v12, v1}, Ll/ᩴܽ;->ۙ(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    move-result v1

    .line 1295
    :goto_5
    iget v2, v0, Ll/ܺܽ;->۟:I

    const/4 v11, -0x2

    if-ne v2, v3, :cond_a

    add-int/2addr v1, v9

    goto :goto_7

    .line 1300
    :cond_a
    iget v12, v0, Ll/ܺܽ;->ۖ:I

    if-eq v12, v11, :cond_c

    const/high16 v13, 0x40000000    # 2.0f

    if-eq v12, v3, :cond_b

    .line 1314
    invoke-static {v12, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    goto :goto_6

    .line 1309
    :cond_b
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v12, v8, Landroid/graphics/Rect;->left:I

    iget v8, v8, Landroid/graphics/Rect;->right:I

    add-int/2addr v12, v8

    sub-int/2addr v4, v12

    .line 1308
    invoke-static {v4, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    goto :goto_6

    .line 1303
    :cond_c
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v12, v8, Landroid/graphics/Rect;->left:I

    iget v8, v8, Landroid/graphics/Rect;->right:I

    add-int/2addr v12, v8

    sub-int/2addr v4, v12

    const/high16 v8, -0x80000000

    .line 1302
    invoke-static {v4, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 1320
    :goto_6
    iget-object v8, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    sub-int/2addr v1, v6

    invoke-virtual {v8, v4, v1}, Ll/ۡܺ;->ۙ(II)I

    move-result v1

    if-lez v1, :cond_d

    .line 1323
    iget-object v4, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    iget-object v8, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    .line 1324
    invoke-virtual {v8}, Landroid/view/View;->getPaddingBottom()I

    move-result v8

    add-int/2addr v8, v4

    add-int/2addr v8, v9

    add-int/2addr v6, v8

    :cond_d
    add-int/2addr v1, v6

    .line 867
    :goto_7
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v4

    if-ne v4, v10, :cond_e

    const/4 v4, 0x1

    goto :goto_8

    :cond_e
    const/4 v4, 0x0

    .line 665
    :goto_8
    iget v6, v0, Ll/ܺܽ;->۠:I

    invoke-static {v5, v6}, Ll/᩵ۙۙ;->ۙ(Landroid/widget/PopupWindow;I)V

    .line 667
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v6

    if-eqz v6, :cond_1a

    .line 459
    iget-object v6, v0, Ll/ܺܽ;->ܿ:Landroid/view/View;

    .line 668
    invoke-virtual {v6}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v6

    if-nez v6, :cond_f

    goto/16 :goto_13

    .line 673
    :cond_f
    iget v6, v0, Ll/ܺܽ;->ۖ:I

    if-ne v6, v3, :cond_10

    const/4 v6, -0x1

    goto :goto_9

    :cond_10
    if-ne v6, v11, :cond_11

    .line 459
    iget-object v6, v0, Ll/ܺܽ;->ܿ:Landroid/view/View;

    .line 678
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v6

    :cond_11
    :goto_9
    if-ne v2, v3, :cond_16

    if-eqz v4, :cond_12

    move v2, v1

    goto :goto_a

    :cond_12
    const/4 v1, -0x1

    const/4 v2, -0x1

    :goto_a
    if-eqz v4, :cond_14

    .line 689
    iget v1, v0, Ll/ܺܽ;->ۖ:I

    if-ne v1, v3, :cond_13

    const/4 v1, -0x1

    goto :goto_b

    :cond_13
    const/4 v1, 0x0

    :goto_b
    invoke-virtual {v5, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 691
    invoke-virtual {v5, v7}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_c

    .line 693
    :cond_14
    iget v1, v0, Ll/ܺܽ;->ۖ:I

    if-ne v1, v3, :cond_15

    const/4 v7, -0x1

    :cond_15
    invoke-virtual {v5, v7}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 695
    invoke-virtual {v5, v3}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_c

    :cond_16
    if-ne v2, v11, :cond_17

    move v2, v1

    :cond_17
    :goto_c
    const/4 v1, 0x1

    .line 703
    invoke-virtual {v5, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 459
    iget-object v1, v0, Ll/ܺܽ;->ܿ:Landroid/view/View;

    .line 705
    iget v7, v0, Ll/ܺܽ;->ᩳ:I

    iget v8, v0, Ll/ܺܽ;->֨:I

    if-gez v6, :cond_18

    const/4 v3, -0x1

    const/4 v9, -0x1

    goto :goto_d

    :cond_18
    move v9, v6

    :goto_d
    if-gez v2, :cond_19

    const/4 v2, -0x1

    const/4 v10, -0x1

    goto :goto_e

    :cond_19
    move v10, v2

    :goto_e
    move-object v6, v1

    invoke-virtual/range {v5 .. v10}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    goto/16 :goto_13

    .line 710
    :cond_1a
    iget v4, v0, Ll/ܺܽ;->ۖ:I

    if-ne v4, v3, :cond_1b

    const/4 v4, -0x1

    goto :goto_f

    :cond_1b
    if-ne v4, v11, :cond_1c

    .line 459
    iget-object v4, v0, Ll/ܺܽ;->ܿ:Landroid/view/View;

    .line 714
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    :cond_1c
    :goto_f
    if-ne v2, v3, :cond_1d

    const/4 v2, -0x1

    goto :goto_10

    :cond_1d
    if-ne v2, v11, :cond_1e

    move v2, v1

    .line 731
    :cond_1e
    :goto_10
    invoke-virtual {v5, v4}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 732
    invoke-virtual {v5, v2}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 1429
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-gt v1, v2, :cond_20

    .line 1430
    sget-object v1, Ll/ܺܽ;->ۗۙ:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_1f

    const/4 v4, 0x1

    :try_start_1
    new-array v4, v4, [Ljava/lang/Object;

    .line 1432
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v6, v4, v7

    invoke-virtual {v1, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1f
    const/4 v1, 0x1

    goto :goto_11

    :cond_20
    const/4 v1, 0x1

    .line 1438
    invoke-static {v5, v1}, Ll/ܳܽ;->ۙ(Landroid/widget/PopupWindow;Z)V

    .line 737
    :goto_11
    invoke-virtual {v5, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 738
    iget-object v1, v0, Ll/ܺܽ;->ܶۙ:Ll/ۧܽ;

    invoke-virtual {v5, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 739
    iget-boolean v1, v0, Ll/ܺܽ;->ۚۙ:Z

    if-eqz v1, :cond_21

    .line 740
    iget-boolean v1, v0, Ll/ܺܽ;->۫ۙ:Z

    invoke-static {v5, v1}, Ll/᩵ۙۙ;->ۙ(Landroid/widget/PopupWindow;Z)V

    .line 742
    :cond_21
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v1, v2, :cond_22

    .line 743
    sget-object v1, Ll/ܺܽ;->᩵ۙ:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_23

    .line 745
    :try_start_2
    iget-object v2, v0, Ll/ܺܽ;->ۜ:Landroid/graphics/Rect;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v7

    invoke-virtual {v1, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_12

    :catch_2
    nop

    goto :goto_12

    .line 751
    :cond_22
    iget-object v1, v0, Ll/ܺܽ;->ۜ:Landroid/graphics/Rect;

    invoke-static {v5, v1}, Ll/ܳܽ;->ۙ(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    .line 459
    :cond_23
    :goto_12
    iget-object v1, v0, Ll/ܺܽ;->ܿ:Landroid/view/View;

    .line 753
    iget v2, v0, Ll/ܺܽ;->ᩳ:I

    iget v4, v0, Ll/ܺܽ;->֨:I

    iget v6, v0, Ll/ܺܽ;->֡:I

    .line 67
    invoke-virtual {v5, v1, v2, v4, v6}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 755
    iget-object v1, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    invoke-virtual {v1, v3}, Ll/ᩴܿ᩻;->setSelection(I)V

    .line 757
    iget-boolean v1, v0, Ll/ܺܽ;->ᩴۙ:Z

    if-eqz v1, :cond_24

    iget-object v1, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    invoke-virtual {v1}, Ll/ۡܺ;->isInTouchMode()Z

    move-result v1

    if-eqz v1, :cond_25

    .line 845
    :cond_24
    iget-object v1, v0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    if-eqz v1, :cond_25

    const/4 v2, 0x1

    .line 848
    invoke-virtual {v1, v2}, Ll/ۡܺ;->ۙ(Z)V

    .line 850
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 760
    :cond_25
    iget-boolean v1, v0, Ll/ܺܽ;->ᩴۙ:Z

    if-nez v1, :cond_26

    .line 761
    iget-object v1, v0, Ll/ܺܽ;->۬:Landroid/os/Handler;

    iget-object v2, v0, Ll/ܺܽ;->ۙۙ:Ll/۫ܽ;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_26
    :goto_13
    return-void
.end method

.method public final ֫()I
    .locals 1

    .line 544
    iget v0, p0, Ll/ܺܽ;->ۖ:I

    return v0
.end method

.method public final ۙ()I
    .locals 1

    .line 476
    iget v0, p0, Ll/ܺܽ;->ᩳ:I

    return v0
.end method

.method public ۙ(Landroid/content/Context;Z)Ll/ۡܺ;
    .locals 1

    .line 949
    new-instance v0, Ll/ۡܺ;

    invoke-direct {v0, p1, p2}, Ll/ۡܺ;-><init>(Landroid/content/Context;Z)V

    return-object v0
.end method

.method public final ۙ(I)V
    .locals 0

    .line 485
    iput p1, p0, Ll/ܺܽ;->ᩳ:I

    return-void
.end method

.method public final ۙ(Landroid/graphics/Rect;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 516
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ll/ܺܽ;->ۜ:Landroid/graphics/Rect;

    return-void
.end method

.method public final ۙ(Landroid/view/View;)V
    .locals 0

    .line 469
    iput-object p1, p0, Ll/ܺܽ;->ܿ:Landroid/view/View;

    return-void
.end method

.method public final ۙ(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0

    .line 618
    iput-object p1, p0, Ll/ܺܽ;->᩷ۙ:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method public final ۙ(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 0

    .line 629
    iput-object p1, p0, Ll/ܺܽ;->ۤۙ:Landroid/widget/AdapterView$OnItemSelectedListener;

    return-void
.end method

.method public ۙ(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 289
    iget-object v0, p0, Ll/ܺܽ;->ܳۙ:Landroid/database/DataSetObserver;

    if-nez v0, :cond_0

    .line 290
    new-instance v0, Ll/ۚܽ;

    invoke-direct {v0, p0}, Ll/ۚܽ;-><init>(Ll/ܺܽ;)V

    iput-object v0, p0, Ll/ܺܽ;->ܳۙ:Landroid/database/DataSetObserver;

    goto :goto_0

    .line 291
    :cond_0
    iget-object v1, p0, Ll/ܺܽ;->ܰ:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_1

    .line 292
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 294
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/ܺܽ;->ܰ:Landroid/widget/ListAdapter;

    if-eqz p1, :cond_2

    .line 296
    iget-object v0, p0, Ll/ܺܽ;->ܳۙ:Landroid/database/DataSetObserver;

    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 299
    :cond_2
    iget-object p1, p0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    if-eqz p1, :cond_3

    .line 300
    iget-object v0, p0, Ll/ܺܽ;->ܰ:Landroid/widget/ListAdapter;

    invoke-virtual {p1, v0}, Ll/ᩴܿ᩻;->setAdapter(Landroid/widget/ListAdapter;)V

    :cond_3
    return-void
.end method

.method public final ۙ(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 1

    .line 784
    iget-object v0, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void
.end method

.method public final ۚ()Landroid/view/View;
    .locals 1

    .line 859
    iget-object v0, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 936
    :cond_0
    iget-object v0, p0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final ۤ()I
    .locals 1

    .line 492
    iget-boolean v0, p0, Ll/ܺܽ;->ۡ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 495
    :cond_0
    iget v0, p0, Ll/ܺܽ;->֨:I

    return v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 347
    iget-boolean v0, p0, Ll/ܺܽ;->ᩴۙ:Z

    return v0
.end method

.method public final ۫()I
    .locals 1

    .line 859
    iget-object v0, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 910
    :cond_0
    iget-object v0, p0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    return v0
.end method

.method public final ܳ()J
    .locals 2

    .line 859
    iget-object v0, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    .line 923
    :cond_0
    iget-object v0, p0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemId()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܳ(I)V
    .locals 2

    .line 829
    iget-object v0, p0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    .line 859
    iget-object v1, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 831
    invoke-virtual {v0, v1}, Ll/ۡܺ;->ۙ(Z)V

    .line 832
    invoke-virtual {v0, p1}, Ll/ᩴܿ᩻;->setSelection(I)V

    .line 834
    invoke-virtual {v0}, Landroid/widget/AbsListView;->getChoiceMode()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 835
    invoke-virtual {v0, p1, v1}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    :cond_0
    return-void
.end method

.method public final ܶ()V
    .locals 1

    const/4 v0, 0x1

    .line 1336
    iput-boolean v0, p0, Ll/ܺܽ;->ۚۙ:Z

    .line 1337
    iput-boolean v0, p0, Ll/ܺܽ;->۫ۙ:Z

    return-void
.end method

.method public final ܺ()V
    .locals 2

    const/4 v0, 0x2

    .line 810
    iget-object v1, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void
.end method

.method public final ܽ()V
    .locals 2

    const/4 v0, 0x1

    .line 337
    iput-boolean v0, p0, Ll/ܺܽ;->ᩴۙ:Z

    .line 338
    iget-object v1, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    return-void
.end method

.method public final ᩴ()Ljava/lang/Object;
    .locals 1

    .line 859
    iget-object v0, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 897
    :cond_0
    iget-object v0, p0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ(I)V
    .locals 0

    .line 537
    iput p1, p0, Ll/ܺܽ;->֡:I

    return-void
.end method

.method public final ᩷(I)V
    .locals 0

    .line 504
    iput p1, p0, Ll/ܺܽ;->֨:I

    const/4 p1, 0x1

    .line 505
    iput-boolean p1, p0, Ll/ܺܽ;->ۡ:Z

    return-void
.end method

.method public final ᩷(Landroid/view/View;)V
    .locals 3

    .line 859
    iget-object v0, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 788
    iget-object v1, p0, Ll/ܺܽ;->ۧۙ:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 789
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 790
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    .line 791
    check-cast v1, Landroid/view/ViewGroup;

    .line 792
    iget-object v2, p0, Ll/ܺܽ;->ۧۙ:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 643
    :cond_0
    iput-object p1, p0, Ll/ܺܽ;->ۧۙ:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 645
    invoke-virtual {p0}, Ll/ܺܽ;->show()V

    :cond_1
    return-void
.end method

.method public final ᩸()Landroid/widget/ListView;
    .locals 1

    .line 945
    iget-object v0, p0, Ll/ܺܽ;->ۢ:Ll/ۡܺ;

    return-object v0
.end method

.method public final ᩸(I)V
    .locals 2

    .line 564
    iget-object v0, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 566
    iget-object v1, p0, Ll/ܺܽ;->ܽۙ:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 567
    iget v0, v1, Landroid/graphics/Rect;->left:I

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    iput v0, p0, Ll/ܺܽ;->ۖ:I

    return-void

    .line 554
    :cond_0
    iput p1, p0, Ll/ܺܽ;->ۖ:I

    return-void
.end method

.method public final ᩻()V
    .locals 2

    const/4 v0, 0x0

    .line 440
    iget-object v1, p0, Ll/ܺܽ;->֫ۙ:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    return-void
.end method

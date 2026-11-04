.class public final Ll/᩸ܰᩴ;
.super Ljava/lang/Object;
.source "313O"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ֡:Ljava/util/WeakHashMap;

.field public final ܰ:Ll/ܽۘᩴ;

.field public final ܿ:I

.field public final ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ܽۘᩴ;I)V
    .locals 1

    .line 841
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 839
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Ll/᩸ܰᩴ;->֡:Ljava/util/WeakHashMap;

    .line 842
    iput-object p1, p0, Ll/᩸ܰᩴ;->᩶:Ljava/lang/String;

    .line 843
    iput-object p2, p0, Ll/᩸ܰᩴ;->ܰ:Ll/ܽۘᩴ;

    .line 844
    iput p3, p0, Ll/᩸ܰᩴ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 865
    iget v0, p0, Ll/᩸ܰᩴ;->ܿ:I

    const/4 v1, 0x0

    .line 869
    :try_start_0
    iget-object v2, p0, Ll/᩸ܰᩴ;->ܰ:Ll/ܽۘᩴ;

    invoke-static {}, Ll/᩶᩷ۧ;->ܶ()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ܽۘᩴ;->ۙ(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 886
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Ll/᩶᩷ۧ;->ۗ()Landroid/content/res/Resources;

    move-result-object v4

    sget-object v5, Ll/᩶ܿ᩻;->᩶:Landroid/graphics/ColorMatrixColorFilter;

    .line 411
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 412
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v6

    .line 413
    invoke-virtual {v2, v1, v1, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 414
    new-instance v7, Landroid/graphics/Canvas;

    invoke-direct {v7, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v2, v7}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 415
    invoke-virtual {v2, v6}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 886
    invoke-direct {v3, v4, v5}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    const v2, 0x7f0802cf

    .line 873
    :try_start_1
    invoke-static {v2}, Ll/᩶᩷ۧ;->ۙ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 886
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Ll/᩶᩷ۧ;->ۗ()Landroid/content/res/Resources;

    move-result-object v4

    sget-object v5, Ll/᩶ܿ᩻;->᩶:Landroid/graphics/ColorMatrixColorFilter;

    .line 411
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 412
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v6

    .line 413
    invoke-virtual {v2, v1, v1, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 414
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 415
    invoke-virtual {v2, v6}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 886
    invoke-direct {v3, v4, v5}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 880
    :goto_0
    new-instance v0, Ll/ܶۛᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, v3}, Ll/ܶۛᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :goto_1
    new-instance v1, Ll/ۤܰᩴ;

    invoke-direct {v1, p0}, Ll/ۤܰᩴ;-><init>(Ll/᩸ܰᩴ;)V

    invoke-static {v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    .line 881
    throw v0

    .line 880
    :catch_1
    new-instance v0, Ll/ۤܰᩴ;

    invoke-direct {v0, p0}, Ll/ۤܰᩴ;-><init>(Ll/᩸ܰᩴ;)V

    :goto_2
    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۙ(Landroid/graphics/drawable/BitmapDrawable;)V
    .locals 5

    .line 891
    invoke-static {}, Ll/ᩴܰᩴ;->᩷()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ܰᩴ;->᩶:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-void

    .line 892
    :cond_0
    invoke-static {}, Ll/ᩴܰᩴ;->᩷()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 893
    invoke-static {}, Ll/ᩴܰᩴ;->ۙ()Ll/֨ۗ;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Ll/֨ۗ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 894
    :cond_1
    iget-object v0, p0, Ll/᩸ܰᩴ;->֡:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 895
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 896
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ܰᩴ;

    if-eqz v3, :cond_2

    .line 897
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, p0, :cond_2

    const/4 v4, 0x0

    .line 898
    invoke-virtual {v3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    if-eqz p1, :cond_2

    if-eqz v2, :cond_2

    .line 899
    invoke-static {v2}, Ll/᩻ܰᩴ;->֫(Ll/᩻ܰᩴ;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v2}, Ll/᩻ܰᩴ;->ۚ(Ll/᩻ܰᩴ;)Ll/۠ۖۧ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۠ۖۧ;->۫()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 900
    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 904
    :cond_3
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    return-void
.end method

.method public final ۙ(Ll/᩻ܰᩴ;)V
    .locals 4

    .line 850
    iget-object v0, p0, Ll/᩸ܰᩴ;->֡:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 851
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 852
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 853
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 854
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ܰᩴ;

    if-eqz v2, :cond_1

    .line 855
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p0, :cond_1

    if-eqz v1, :cond_1

    if-eq v1, p1, :cond_1

    invoke-static {v1}, Ll/᩻ܰᩴ;->֫(Ll/᩻ܰᩴ;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v1}, Ll/᩻ܰᩴ;->ۚ(Ll/᩻ܰᩴ;)Ll/۠ۖۧ;

    move-result-object v1

    .line 856
    invoke-virtual {v1}, Ll/۠ۖۧ;->۫()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    if-eqz v2, :cond_2

    .line 857
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p0, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 858
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-void
.end method

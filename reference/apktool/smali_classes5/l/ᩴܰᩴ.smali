.class public final Ll/ᩴܰᩴ;
.super Ljava/lang/Object;
.source "313O"


# static fields
.field public static final ۙ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static final ۤ:Ljava/util/HashMap;

.field public static final ᩷:Ll/֨ۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 767
    new-instance v0, Ll/֨ۗ;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ll/֨ۗ;-><init>(I)V

    sput-object v0, Ll/ᩴܰᩴ;->᩷:Ll/֨ۗ;

    .line 768
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ᩴܰᩴ;->ۤ:Ljava/util/HashMap;

    .line 769
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v2, 0x2

    const/4 v3, 0x2

    const-wide/16 v4, 0xa

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    sput-object v0, Ll/ᩴܰᩴ;->ۙ:Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v1, 0x1

    .line 773
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    return-void
.end method

.method public static bridge synthetic ۙ()Ll/֨ۗ;
    .locals 1

    .line 0
    sget-object v0, Ll/ᩴܰᩴ;->᩷:Ll/֨ۗ;

    return-object v0
.end method

.method public static ۙ(Landroid/widget/ImageView;)V
    .locals 4

    .line 814
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    .line 815
    invoke-virtual {p0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 816
    instance-of v2, v0, Ll/᩸ܰᩴ;

    if-eqz v2, :cond_0

    check-cast v0, Ll/᩸ܰᩴ;

    iget-object v2, v0, Ll/᩸ܰᩴ;->᩶:Ljava/lang/String;

    iget-object v3, v0, Ll/᩸ܰᩴ;->֡:Ljava/util/WeakHashMap;

    .line 817
    invoke-virtual {v3, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 818
    invoke-virtual {v0, v1}, Ll/᩸ܰᩴ;->ۙ(Ll/᩻ܰᩴ;)V

    .line 819
    invoke-virtual {v3}, Ljava/util/WeakHashMap;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ll/ᩴܰᩴ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {p0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    sget-object v1, Ll/ᩴܰᩴ;->ۙ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->remove(Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 820
    invoke-virtual {p0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/ܽۘᩴ;Landroid/widget/ImageView;Ll/᩻ܰᩴ;)V
    .locals 6

    .line 778
    invoke-static {p2}, Ll/᩻ܰᩴ;->֫(Ll/᩻ܰᩴ;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {p2}, Ll/᩻ܰᩴ;->ۚ(Ll/᩻ܰᩴ;)Ll/۠ۖۧ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/high16 v0, 0x42480000    # 50.0f

    .line 782
    invoke-static {v0}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v0

    .line 783
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܽۘᩴ;->᩸()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 784
    sget-object v2, Ll/ᩴܰᩴ;->᩷:Ll/֨ۗ;

    invoke-virtual {v2, v1}, Ll/֨ۗ;->ۙ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    .line 786
    invoke-static {p1}, Ll/ᩴܰᩴ;->ۙ(Landroid/widget/ImageView;)V

    .line 787
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 790
    :cond_1
    sget-object v2, Ll/ᩴܰᩴ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸ܰᩴ;

    if-eqz v3, :cond_2

    .line 792
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v3, :cond_3

    :cond_2
    invoke-static {p1}, Ll/ᩴܰᩴ;->ۙ(Landroid/widget/ImageView;)V

    :cond_3
    const/4 v4, 0x0

    .line 793
    invoke-virtual {p1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-nez v3, :cond_4

    const/4 v5, 0x1

    goto :goto_0

    :cond_4
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_5

    .line 796
    new-instance v3, Ll/᩸ܰᩴ;

    invoke-direct {v3, v1, p0, v0}, Ll/᩸ܰᩴ;-><init>(Ljava/lang/String;Ll/ܽۘᩴ;I)V

    .line 797
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 799
    :cond_5
    iget-object p0, v3, Ll/᩸ܰᩴ;->֡:Ljava/util/WeakHashMap;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 800
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    if-eqz v5, :cond_6

    .line 803
    :try_start_0
    sget-object p0, Ll/ᩴܰᩴ;->ۙ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 806
    :catch_0
    invoke-virtual {v3, v4}, Ll/᩸ܰᩴ;->ۙ(Landroid/graphics/drawable/BitmapDrawable;)V

    :cond_6
    return-void

    .line 779
    :cond_7
    :goto_1
    invoke-static {p1}, Ll/ᩴܰᩴ;->ۙ(Landroid/widget/ImageView;)V

    return-void
.end method

.method public static ۙ(Ll/᩻ܰᩴ;)V
    .locals 3

    .line 826
    sget-object v0, Ll/ᩴܰᩴ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 827
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 828
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ܰᩴ;

    .line 829
    invoke-virtual {v1, p0}, Ll/᩸ܰᩴ;->ۙ(Ll/᩻ܰᩴ;)V

    .line 831
    iget-object v2, v1, Ll/᩸ܰᩴ;->֡:Ljava/util/WeakHashMap;

    invoke-virtual {v2}, Ljava/util/WeakHashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Ll/ᩴܰᩴ;->ۙ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->remove(Ljava/lang/Runnable;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static bridge synthetic ᩷()Ljava/util/HashMap;
    .locals 1

    .line 0
    sget-object v0, Ll/ᩴܰᩴ;->ۤ:Ljava/util/HashMap;

    return-object v0
.end method

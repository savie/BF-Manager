.class public final synthetic Ll/֨ۤۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֨ۤۚ;->ܰ:I

    iput-object p2, p0, Ll/֨ۤۚ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/֨ۤۚ;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/֨ۤۚ;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Lcom/google/android/material/search/SearchView;

    .line 12
    invoke-virtual {v1}, Lcom/google/android/material/search/SearchView;->show()V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 18
    invoke-static {v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->$r8$lambda$EVyYoVT11DpL60suE9bxns8qbCM(Lcom/google/android/material/carousel/CarouselLayoutManager;)V

    return-void

    .line 21
    :pswitch_1
    check-cast v1, Ll/᩸ܺ֫;

    .line 23
    sget v0, Ll/᩸ܺ֫;->᩸᩷:I

    .line 41
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getWindowVisibility()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void

    .line 0
    :pswitch_2
    check-cast v1, [Ll/۠ۖۧ;

    const/4 v0, 0x0

    .line 165
    aget-object v0, v1, v0

    if-eqz v0, :cond_1

    .line 166
    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

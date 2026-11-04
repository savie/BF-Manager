.class public final Ll/ܳۖ᩸;
.super Ljava/lang/Object;
.source "T6J6"

# interfaces
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


# instance fields
.field public final synthetic ܰ:Ll/֫ۖ᩸;


# direct methods
.method public constructor <init>(Ll/֫ۖ᩸;)V
    .locals 0

    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۖ᩸;->ܰ:Ll/֫ۖ᩸;

    return-void
.end method


# virtual methods
.method public final onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    .line 208
    instance-of v0, p2, Ll/᩹ۖ᩸;

    iget-object v1, p0, Ll/ܳۖ᩸;->ܰ:Ll/֫ۖ᩸;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ll/᩹ۖ᩸;

    invoke-static {v1, v0}, Ll/֫ۖ᩸;->ۙ(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)V

    .line 209
    :cond_0
    invoke-static {v1}, Ll/֫ۖ᩸;->ܳ(Ll/֫ۖ᩸;)Landroid/view/ViewGroup$OnHierarchyChangeListener;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v1}, Ll/֫ۖ᩸;->ܳ(Ll/֫ۖ᩸;)Landroid/view/ViewGroup$OnHierarchyChangeListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewAdded(Landroid/view/View;Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    .line 212
    iget-object v0, p0, Ll/ܳۖ᩸;->ܰ:Ll/֫ۖ᩸;

    invoke-static {v0}, Ll/֫ۖ᩸;->᩷(Ll/֫ۖ᩸;)Ll/᩹ۖ᩸;

    move-result-object v1

    if-ne p2, v1, :cond_0

    invoke-static {v0}, Ll/֫ۖ᩸;->ۧ(Ll/֫ۖ᩸;)V

    .line 213
    :cond_0
    invoke-static {v0}, Ll/֫ۖ᩸;->ܳ(Ll/֫ۖ᩸;)Landroid/view/ViewGroup$OnHierarchyChangeListener;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ll/֫ۖ᩸;->ܳ(Ll/֫ۖ᩸;)Landroid/view/ViewGroup$OnHierarchyChangeListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V

    :cond_1
    return-void
.end method

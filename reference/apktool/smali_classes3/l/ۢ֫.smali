.class public final Ll/ۢ֫;
.super Ljava/lang/Object;
.source "Q63C"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ۖ֫;


# direct methods
.method public constructor <init>(Ll/ۖ֫;)V
    .locals 0

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ֫;->ܰ:Ll/ۖ֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 139
    iget-object v0, p0, Ll/ۢ֫;->ܰ:Ll/ۖ֫;

    invoke-virtual {v0}, Ll/ۖ֫;->ۚ()V

    .line 140
    iget-object v1, v0, Ll/ۖ֫;->᩶:Ll/᩶֫;

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget-object v2, v0, Ll/ۖ֫;->᩶:Ll/᩶֫;

    .line 141
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget-object v2, v0, Ll/ۖ֫;->ܽۙ:Landroid/animation/AnimatorListenerAdapter;

    .line 142
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iput-object v1, v0, Ll/ۖ֫;->ۖ:Landroid/view/ViewPropertyAnimator;

    return-void
.end method

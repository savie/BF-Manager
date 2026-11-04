.class public final Ll/ܽۙܳ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "YIPT"


# instance fields
.field public final synthetic ۙ:Ll/ܶۙܳ;


# direct methods
.method public constructor <init>(Ll/ܶۙܳ;)V
    .locals 0

    .line 59
    iput-object p1, p0, Ll/ܽۙܳ;->ۙ:Ll/ܶۙܳ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 61
    iget-object p1, p0, Ll/ܽۙܳ;->ۙ:Ll/ܶۙܳ;

    invoke-static {p1}, Ll/ܶۙܳ;->᩷(Ll/ܶۙܳ;)V

    .line 62
    invoke-static {p1}, Ll/ܶۙܳ;->ۙ(Ll/ܶۙܳ;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.class public final Ll/ܺܺܳ;
.super Ljava/lang/Object;
.source "CIUF"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ܰ:Ll/ܽܺܳ;

.field public final synthetic ᩶:Ll/᩵ܿ᩻;


# direct methods
.method public constructor <init>(Ll/ܽܺܳ;Ll/᩵ܿ᩻;)V
    .locals 0

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺܺܳ;->ܰ:Ll/ܽܺܳ;

    iput-object p2, p0, Ll/ܺܺܳ;->᩶:Ll/᩵ܿ᩻;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 217
    new-instance p1, Ll/᩻ܺܳ;

    iget-object v0, p0, Ll/ܺܺܳ;->᩶:Ll/᩵ܿ᩻;

    invoke-direct {p1, p0, v0}, Ll/᩻ܺܳ;-><init>(Ll/ܺܺܳ;Ll/᩵ܿ᩻;)V

    invoke-static {p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

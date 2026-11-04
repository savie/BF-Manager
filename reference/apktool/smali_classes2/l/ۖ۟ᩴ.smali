.class public final Ll/ۖ۟ᩴ;
.super Ljava/lang/Object;
.source "P6HO"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ܰ:Ll/ۜ۟ᩴ;


# direct methods
.method public constructor <init>(Ll/ۜ۟ᩴ;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ۟ᩴ;->ܰ:Ll/ۜ۟ᩴ;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 44
    iget-object p1, p0, Ll/ۖ۟ᩴ;->ܰ:Ll/ۜ۟ᩴ;

    invoke-virtual {p1}, Ll/ۜ۟ᩴ;->finish()V

    return-void
.end method

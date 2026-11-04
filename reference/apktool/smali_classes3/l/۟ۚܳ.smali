.class public final synthetic Ll/۟ۚܳ;
.super Ljava/lang/Object;
.source "R6JU"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic ܰ:Ll/۠ۖۧ;


# direct methods
.method public synthetic constructor <init>(Ll/۠ۖۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۚܳ;->ܰ:Ll/۠ۖۧ;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/16 p1, 0x42

    if-eq p2, p1, :cond_0

    const/16 p1, 0xa0

    if-eq p2, p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 232
    :cond_0
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Ll/۟ۚܳ;->ܰ:Ll/۠ۖۧ;

    invoke-virtual {p1}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    :cond_1
    return p2
.end method

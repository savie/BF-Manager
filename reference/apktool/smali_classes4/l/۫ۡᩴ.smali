.class public final Ll/۫ۡᩴ;
.super Landroid/text/style/ClickableSpan;
.source "36IP"


# instance fields
.field public final synthetic ܰ:Ljava/util/function/Consumer;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/function/Consumer;)V
    .locals 0

    .line 41
    iput-object p2, p0, Ll/۫ۡᩴ;->ܰ:Ljava/util/function/Consumer;

    iput-object p1, p0, Ll/۫ۡᩴ;->᩶:Ljava/lang/String;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 43
    iget-object p1, p0, Ll/۫ۡᩴ;->ܰ:Ljava/util/function/Consumer;

    iget-object v0, p0, Ll/۫ۡᩴ;->᩶:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 47
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    const/4 v0, 0x0

    .line 48
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    return-void
.end method

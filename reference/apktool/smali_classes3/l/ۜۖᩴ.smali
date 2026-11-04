.class public final Ll/ۜۖᩴ;
.super Ljava/lang/Object;
.source "I4HH"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public ܰ:Ll/᩻֫ܺ;

.field public final synthetic ᩶:Ll/ۤ۠ᩴ;


# direct methods
.method public constructor <init>(Ll/ۤ۠ᩴ;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۖᩴ;->᩶:Ll/ۤ۠ᩴ;

    .line 73
    invoke-static {}, Ll/᩻֫ܺ;->ܳ()Ll/᩻֫ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜۖᩴ;->ܰ:Ll/᩻֫ܺ;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 77
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x4

    if-ne p2, p1, :cond_2

    .line 78
    iget-object p1, p0, Ll/ۜۖᩴ;->᩶:Ll/ۤ۠ᩴ;

    iget-boolean p1, p1, Ll/ۤ۠ᩴ;->᩷:Z

    if-nez p1, :cond_1

    .line 79
    iget-object p1, p0, Ll/ۜۖᩴ;->ܰ:Ll/᩻֫ܺ;

    invoke-virtual {p1}, Ll/᩻֫ܺ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 80
    iget-object p1, p0, Ll/ۜۖᩴ;->᩶:Ll/ۤ۠ᩴ;

    invoke-virtual {p1}, Ll/ۤ۠ᩴ;->᩷()V

    goto :goto_0

    :cond_0
    const p1, 0x7f120162

    .line 82
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

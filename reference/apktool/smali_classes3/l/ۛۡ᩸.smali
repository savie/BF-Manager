.class public final Ll/ۛۡ᩸;
.super Ll/۠ۢᩴ;
.source "V8VP"


# instance fields
.field public final synthetic ۜ:Ll/᩺ۜ᩸;


# direct methods
.method public constructor <init>(Ll/ۖ֫᩸;Ll/᩺ۜ᩸;)V
    .locals 0

    .line 648
    iput-object p2, p0, Ll/ۛۡ᩸;->ۜ:Ll/᩺ۜ᩸;

    const/4 p2, -0x1

    .line 39
    invoke-direct {p0, p1, p2}, Ll/۠ۢᩴ;-><init>(Ll/ܽ֡֫;I)V

    return-void
.end method


# virtual methods
.method public final ܶ()V
    .locals 2

    .line 653
    iget-object v0, p0, Ll/ۛۡ᩸;->ۜ:Ll/᩺ۜ᩸;

    :try_start_0
    invoke-virtual {p0}, Ll/۠ۢᩴ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ll/᩺ۜ᩸;->ܳ(I)Z

    move-result v1

    if-nez v1, :cond_0

    const v1, 0x7f120311

    .line 654
    invoke-virtual {p0, v1}, Ll/۠ۢᩴ;->᩷(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    nop

    .line 659
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-nez v1, :cond_1

    .line 660
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 662
    :cond_1
    invoke-virtual {p0}, Ll/۠ۢᩴ;->᩷()V

    return-void
.end method

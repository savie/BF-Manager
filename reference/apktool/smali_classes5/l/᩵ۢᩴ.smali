.class public final Ll/᩵ۢᩴ;
.super Ljava/lang/Object;
.source "192I"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ܰ:Ll/ۛۢᩴ;


# direct methods
.method public constructor <init>(Ll/ۛۢᩴ;)V
    .locals 0

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۢᩴ;->ܰ:Ll/ۛۢᩴ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 156
    iget-object v0, p0, Ll/᩵ۢᩴ;->ܰ:Ll/ۛۢᩴ;

    invoke-static {v0}, Ll/ۛۢᩴ;->᩸(Ll/ۛۢᩴ;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 159
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 160
    invoke-static {p1}, Ll/ۧܺܺ;->ۤ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 161
    invoke-static {p1}, Ll/ۧܺܺ;->֫(Ljava/lang/String;)I

    move-result p1

    .line 162
    invoke-static {v0}, Ll/ۛۢᩴ;->᩷(Ll/ۛۢᩴ;)Ll/᩶᩶᩻;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/᩶᩶᩻;->ۙ(I)V

    .line 163
    invoke-static {v0, p1}, Ll/ۛۢᩴ;->᩷(Ll/ۛۢᩴ;I)V

    .line 164
    invoke-static {v0}, Ll/ۛۢᩴ;->ۙ(Ll/ۛۢᩴ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 165
    invoke-static {v0}, Ll/ۛۢᩴ;->ۤ(Ll/ۛۢᩴ;)Ll/۠ۖۧ;

    move-result-object p1

    invoke-static {v0}, Ll/ۛۢᩴ;->֫(Ll/ۛۢᩴ;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/۠ۖۧ;->ۙ(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

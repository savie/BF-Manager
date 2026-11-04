.class public final Ll/᩺ᩴ;
.super Ljava/lang/Object;
.source "V4WV"

# interfaces
.implements Ll/ۚ᩸;


# instance fields
.field public final synthetic ۙ:Ll/ۘᩴ;


# direct methods
.method public constructor <init>(Ll/ۘᩴ;)V
    .locals 0

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ᩴ;->ۙ:Ll/ۘᩴ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۚۤ;)V
    .locals 2

    .line 127
    iget-object p1, p0, Ll/᩺ᩴ;->ۙ:Ll/ۘᩴ;

    invoke-virtual {p1}, Ll/ۘᩴ;->᩵()Ll/֨ᩴ;

    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ll/֨ᩴ;->۫()V

    .line 129
    invoke-virtual {p1}, Ll/ۚۤ;->getSavedStateRegistry()Ll/ܳۢ᩷;

    move-result-object p1

    const-string v1, "androidx:appcompat"

    .line 130
    invoke-virtual {p1, v1}, Ll/ܳۢ᩷;->ۙ(Ljava/lang/String;)Landroid/os/Bundle;

    .line 129
    invoke-virtual {v0}, Ll/֨ᩴ;->֫()V

    return-void
.end method

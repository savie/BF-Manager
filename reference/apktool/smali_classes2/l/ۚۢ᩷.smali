.class public final Ll/ۚۢ᩷;
.super Ljava/lang/Object;
.source "EIUY"


# instance fields
.field public final ۙ:Ll/᩻ۢ᩷;

.field public final ᩷:Ll/ܳۢ᩷;


# direct methods
.method public constructor <init>(Ll/᩻ۢ᩷;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/ۚۢ᩷;->ۙ:Ll/᩻ۢ᩷;

    .line 26
    new-instance v0, Ll/ܳۢ᩷;

    invoke-direct {v0, p1}, Ll/ܳۢ᩷;-><init>(Ll/᩻ۢ᩷;)V

    iput-object v0, p0, Ll/ۚۢ᩷;->᩷:Ll/ܳۢ᩷;

    return-void
.end method


# virtual methods
.method public final ۙ()Ll/ܳۢ᩷;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ۚۢ᩷;->᩷:Ll/ܳۢ᩷;

    return-object v0
.end method

.method public final ۙ(Landroid/os/Bundle;)V
    .locals 1

    .line 35
    iget-object v0, p0, Ll/ۚۢ᩷;->ۙ:Ll/᩻ۢ᩷;

    invoke-virtual {v0, p1}, Ll/᩻ۢ᩷;->ۙ(Landroid/os/Bundle;)V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ۚۢ᩷;->ۙ:Ll/᩻ۢ᩷;

    invoke-virtual {v0}, Ll/᩻ۢ᩷;->ۤ()V

    return-void
.end method

.method public final ᩷(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "outBundle"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Ll/ۚۢ᩷;->ۙ:Ll/᩻ۢ᩷;

    invoke-virtual {v0, p1}, Ll/᩻ۢ᩷;->᩷(Landroid/os/Bundle;)V

    return-void
.end method

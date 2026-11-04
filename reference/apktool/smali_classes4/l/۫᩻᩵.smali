.class public final Ll/۫᩻᩵;
.super Ljava/lang/Object;
.source "M6BR"

# interfaces
.implements Ll/᩺ܰۗ;


# instance fields
.field public final ۙ:Ll/᩸᩻᩵;

.field public final ᩷:Ll/ᩴ᩻᩵;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ll/ᩴ᩻᩵;

    .line 5
    invoke-direct {v0}, Ll/ܺܿۗ;-><init>()V

    .line 24
    iput-object v0, p0, Ll/۫᩻᩵;->᩷:Ll/ᩴ᩻᩵;

    .line 25
    new-instance v1, Ll/᩸᩻᩵;

    invoke-direct {v1, v0}, Ll/᩸᩻᩵;-><init>(Ll/ᩴ᩻᩵;)V

    iput-object v1, p0, Ll/۫᩻᩵;->ۙ:Ll/᩸᩻᩵;

    .line 34
    invoke-virtual {v0, p1}, Ll/ܺܿۗ;->ۙ(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final ۙ()Ll/֡ۧۤ;
    .locals 2

    .line 39
    new-instance v0, Ll/֡ۧۤ;

    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Ll/֡ۧۤ;-><init>(I)V

    return-object v0
.end method

.method public final ۙ(Ljava/util/List;)Ll/ۘܰۗ;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/۫᩻᩵;->ۙ:Ll/᩸᩻᩵;

    invoke-virtual {v0, p1}, Ll/᩸᩻᩵;->ۙ(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 54
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    sget-object p1, Ll/ۢ᩶ۗ;->ܰ:Ll/ۢ᩶ۗ;

    return-object p1

    .line 57
    :cond_0
    new-instance v0, Ll/ۚ᩻᩵;

    invoke-direct {v0, p1}, Ll/ۚ᩻᩵;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final ۙ([B)Ll/ۚ᩻᩵;
    .locals 2

    const-string v0, "input.dex"

    .line 62
    iget-object v1, p0, Ll/۫᩻᩵;->ۙ:Ll/᩸᩻᩵;

    invoke-virtual {v1, v0, p1}, Ll/᩸᩻᩵;->ۙ(Ljava/lang/String;[B)Ljava/util/List;

    move-result-object p1

    .line 63
    new-instance v0, Ll/ۚ᩻᩵;

    invoke-direct {v0, p1}, Ll/ۚ᩻᩵;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final ۙ(Ll/֨ۚ᩵;)V
    .locals 1

    .line 44
    iget-object v0, p0, Ll/۫᩻᩵;->᩷:Ll/ᩴ᩻᩵;

    invoke-virtual {p1, v0}, Ll/֨ۚ᩵;->ۙ(Ll/۫ܿۗ;)V

    .line 45
    new-instance v0, Ll/ܳ᩻᩵;

    invoke-direct {v0, p0}, Ll/ܳ᩻᩵;-><init>(Ll/۫᩻᩵;)V

    invoke-virtual {p1, v0}, Ll/֨ۚ᩵;->ۙ(Ll/ܳ᩻᩵;)V

    return-void
.end method

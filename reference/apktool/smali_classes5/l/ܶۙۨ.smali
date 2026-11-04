.class public final Ll/ܶۙۨ;
.super Ljava/lang/Object;
.source "QAND"

# interfaces
.implements Ll/᩹ۙۨ;


# instance fields
.field public final ܰ:Ll/᩺֨᩵;

.field public final ܿ:Ll/ۗۢ᩷;

.field public final ᩶:Ll/ۗ֨᩵;


# direct methods
.method public constructor <init>(Ll/ۗۢ᩷;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Ll/ܶۙۨ;->ܿ:Ll/ۗۢ᩷;

    .line 63
    sget-object p1, Ll/ۛۙۨ;->᩶:Ll/ۛۙۨ;

    iput-object p1, p0, Ll/ܶۙۨ;->᩶:Ll/ۗ֨᩵;

    .line 64
    sget-object p1, Ll/ۨۙۨ;->᩶:Ll/ۨۙۨ;

    iput-object p1, p0, Ll/ܶۙۨ;->ܰ:Ll/᩺֨᩵;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۗۙۨ;Ll/ۙۢ᩵;)Ljava/lang/Object;
    .locals 2

    .line 67
    new-instance v0, Ll/᩻ۡ᩵;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 67
    sget-object v1, Ll/۠ۙۨ;->ۙ:Ll/ۜ᩷ۨ;

    iput-object v1, v0, Ll/᩻ۡ᩵;->ܰ:Ljava/lang/Object;

    .line 68
    new-instance v1, Ll/ܽۙۨ;

    invoke-direct {v1, p0, v0, p1}, Ll/ܽۙۨ;-><init>(Ll/ܶۙۨ;Ll/᩻ۡ᩵;Ll/ۗۙۨ;)V

    iget-object p1, p0, Ll/ܶۙۨ;->ܿ:Ll/ۗۢ᩷;

    invoke-virtual {p1, v1, p2}, Ll/ۗۢ᩷;->ۙ(Ll/ۗۙۨ;Ll/ۙۢ᩵;)Ljava/lang/Object;

    move-result-object p1

    .line 57
    sget-object p2, Ll/ܺۢ᩵;->ܿ:Ll/ܺۢ᩵;

    if-ne p1, p2, :cond_0

    return-object p1

    .line 68
    :cond_0
    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object p1
.end method

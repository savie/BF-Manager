.class public Ll/᩵ۤۨ;
.super Ll/᩺ۜ᩵;
.source "54FB"


# instance fields
.field public ܿ:Ll/ܺۤۨ;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 7

    .line 97
    invoke-direct {p0}, Ll/᩺ۜ᩵;-><init>()V

    .line 106
    new-instance v6, Ll/ܺۤۨ;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Ll/ܺۤۨ;-><init>(IIJLjava/lang/String;)V

    .line 103
    iput-object v6, p0, Ll/᩵ۤۨ;->ܿ:Ll/ܺۤۨ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Runnable;Ll/ۛۤۨ;)V
    .locals 1

    .line 114
    iget-object v0, p0, Ll/᩵ۤۨ;->ܿ:Ll/ܺۤۨ;

    invoke-virtual {v0, p1, p2}, Ll/ܺۤۨ;->ۙ(Ljava/lang/Runnable;Ll/ۛۤۨ;)V

    return-void
.end method

.method public final ۙ(Ll/ۧۢ᩵;Ljava/lang/Runnable;)V
    .locals 1

    .line 108
    sget-object p1, Ll/ܺۤۨ;->֨:Ll/ۜ᩷ۨ;

    .line 389
    sget-object p1, Ll/ܰۤۨ;->ܳ:Ll/ۛۤۨ;

    iget-object v0, p0, Ll/᩵ۤۨ;->ܿ:Ll/ܺۤۨ;

    invoke-virtual {v0, p2, p1}, Ll/ܺۤۨ;->ۙ(Ljava/lang/Runnable;Ll/ۛۤۨ;)V

    return-void
.end method

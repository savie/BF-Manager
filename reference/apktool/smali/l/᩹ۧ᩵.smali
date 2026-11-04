.class public final Ll/᩹ۧ᩵;
.super Ll/ۛ᩸ۨ;
.source "W856"


# instance fields
.field public final synthetic ᩶:Ll/۬֨ۗ;


# direct methods
.method public constructor <init>(Ll/۬֨ۗ;)V
    .locals 1

    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, v0}, Ll/ۛ᩸ۨ;-><init>(I)V

    .line 632
    iput-object p1, p0, Ll/᩹ۧ᩵;->᩶:Ll/۬֨ۗ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;Ll/᩹ۡۗ;)V
    .locals 0

    .line 635
    instance-of p1, p2, Ll/᩷ۡۗ;

    if-eqz p1, :cond_0

    .line 636
    iget-object p1, p0, Ll/᩹ۧ᩵;->᩶:Ll/۬֨ۗ;

    check-cast p2, Ll/᩷ۡۗ;

    invoke-virtual {p1, p2}, Ll/۬֨ۗ;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

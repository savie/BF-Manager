.class public final Ll/ܶ᩸᩵;
.super Ll/ۛ᩸ۨ;
.source "76DY"


# instance fields
.field public final synthetic ᩶:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ljava/util/HashSet;)V
    .locals 1

    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, v0}, Ll/ۛ᩸ۨ;-><init>(I)V

    .line 40
    iput-object p1, p0, Ll/ܶ᩸᩵;->᩶:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;Ll/᩹ۡۗ;)V
    .locals 0

    .line 43
    instance-of p1, p2, Ll/᩷ۡۗ;

    if-nez p1, :cond_0

    return-void

    .line 46
    :cond_0
    check-cast p2, Ll/᩷ۡۗ;

    .line 47
    iget-object p1, p0, Ll/ܶ᩸᩵;->᩶:Ljava/util/HashSet;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

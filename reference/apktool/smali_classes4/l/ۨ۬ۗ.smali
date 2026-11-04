.class public final Ll/ۨ۬ۗ;
.super Ll/ܺ۠ۗ;
.source "L57K"


# instance fields
.field public final ܰ:Ljava/lang/String;

.field public final ᩶:Ljava/util/function/Consumer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/function/Consumer;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Ll/ۨ۬ۗ;->ܰ:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Ll/ۨ۬ۗ;->᩶:Ljava/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ۨ۬ۗ;->ܰ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 1

    .line 20
    iget-object v0, p0, Ll/ۨ۬ۗ;->᩶:Ljava/util/function/Consumer;

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

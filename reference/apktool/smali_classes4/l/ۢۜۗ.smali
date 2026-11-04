.class public final synthetic Ll/ۢۜۗ;
.super Ljava/lang/Object;
.source "2IWY"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic ܰ:Ll/ۡ۟ۗ;

.field public final synthetic ᩶:Ll/֨ۢۗ;


# direct methods
.method public synthetic constructor <init>(Ll/ۡ۟ۗ;Ll/֨ۢۗ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۜۗ;->ܰ:Ll/ۡ۟ۗ;

    iput-object p2, p0, Ll/ۢۜۗ;->᩶:Ll/֨ۢۗ;

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۢۜۗ;->᩶:Ll/֨ۢۗ;

    .line 171
    invoke-virtual {v0, p1}, Ll/֨ۢۗ;->۫(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ll/ۢۜۗ;->ܰ:Ll/ۡ۟ۗ;

    invoke-virtual {v0, p1}, Ll/ۡ۟ۗ;->ۙ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

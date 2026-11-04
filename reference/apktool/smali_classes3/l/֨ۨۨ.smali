.class public final Ll/֨ۨۨ;
.super Ljava/lang/Object;
.source "X6CH"

# interfaces
.implements Ll/ۚܺۗ;


# instance fields
.field public final ۙ:Ll/ᩳۨۨ;

.field public final ۤ:Ll/ۢۨۨ;

.field public final ᩴ:Ll/۟ۨۨ;

.field public final ᩷:Ljava/util/Set;

.field public final ᩸:Ll/᩹֡ۗ;


# direct methods
.method public constructor <init>(Ll/۟ۨۨ;Ll/ᩳۨۨ;Ll/ۢۨۨ;Ll/᩹֡ۗ;Ljava/util/Set;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Ll/֨ۨۨ;->ᩴ:Ll/۟ۨۨ;

    .line 62
    iput-object p2, p0, Ll/֨ۨۨ;->ۙ:Ll/ᩳۨۨ;

    .line 63
    iput-object p3, p0, Ll/֨ۨۨ;->ۤ:Ll/ۢۨۨ;

    .line 64
    iput-object p4, p0, Ll/֨ۨۨ;->᩸:Ll/᩹֡ۗ;

    .line 65
    iput-object p5, p0, Ll/֨ۨۨ;->᩷:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final accumulator()Ljava/util/function/BiConsumer;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/֨ۨۨ;->ۙ:Ll/ᩳۨۨ;

    return-object v0
.end method

.method public final characteristics()Ljava/util/Set;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/֨ۨۨ;->᩷:Ljava/util/Set;

    return-object v0
.end method

.method public final combiner()Ljava/util/function/BinaryOperator;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/֨ۨۨ;->ۤ:Ll/ۢۨۨ;

    return-object v0
.end method

.method public final finisher()Ljava/util/function/Function;
    .locals 1

    .line 85
    iget-object v0, p0, Ll/֨ۨۨ;->᩸:Ll/᩹֡ۗ;

    return-object v0
.end method

.method public final supplier()Ljava/util/function/Supplier;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/֨ۨۨ;->ᩴ:Ll/۟ۨۨ;

    return-object v0
.end method

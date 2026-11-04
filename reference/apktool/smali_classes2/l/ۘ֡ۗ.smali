.class public final Ll/ۘ֡ۗ;
.super Ljava/lang/Object;
.source "B6EJ"


# instance fields
.field public final ۙ:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۘ֡ۗ;->ۙ:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/util/ArrayDeque;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ۘ֡ۗ;->ۙ:Ljava/util/ArrayDeque;

    return-object v0
.end method

.method public final ۙ(Ll/ۢۖۗ;)V
    .locals 1

    .line 33
    iget-object v0, p0, Ll/ۘ֡ۗ;->ۙ:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ᩷()V
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۘ֡ۗ;->ۙ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۖۗ;

    return-void
.end method

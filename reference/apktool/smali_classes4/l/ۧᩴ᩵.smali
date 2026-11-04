.class public abstract Ll/ۧᩴ᩵;
.super Ljava/lang/Object;
.source "J6E6"

# interfaces
.implements Ll/ܰ᩸᩵;


# instance fields
.field public final ܰ:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۧᩴ᩵;->ܰ:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/util/ArrayDeque;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ۧᩴ᩵;->ܰ:Ljava/util/ArrayDeque;

    return-object v0
.end method

.method public final ۙ(Ll/ۖۡۗ;Ll/᩹ۡۗ;)V
    .locals 1

    .line 22
    iget-object v0, p0, Ll/ۧᩴ᩵;->ܰ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿۡۗ;

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    invoke-virtual {p0, p1, p2, v0}, Ll/ۧᩴ᩵;->ۙ(Ll/ۖۡۗ;Ll/᩹ۡۗ;Ll/ܿۡۗ;)V

    return-void
.end method

.method public abstract ۙ(Ll/ۖۡۗ;Ll/᩹ۡۗ;Ll/ܿۡۗ;)V
.end method

.method public ۤ(Ll/ۖۡۗ;Ll/ܿۡۗ;)Z
    .locals 0

    .line 16
    iget-object p1, p0, Ll/ۧᩴ᩵;->ܰ:Ljava/util/ArrayDeque;

    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ᩷(Ll/ۖۡۗ;Ll/ܿۡۗ;)V
    .locals 0

    .line 30
    iget-object p1, p0, Ll/ۧᩴ᩵;->ܰ:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    return-void
.end method

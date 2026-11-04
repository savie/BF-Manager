.class public final Ll/֡ۧ᩵;
.super Ljava/lang/Object;
.source "86HZ"


# instance fields
.field public final ۙ:Ljava/util/function/Function;

.field public final ۤ:Ll/ܿۧ᩵;

.field public final ᩷:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Function;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p3, p0, Ll/֡ۧ᩵;->ۙ:Ljava/util/function/Function;

    .line 20
    new-instance p3, Ljava/util/ArrayDeque;

    invoke-direct {p3}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p3, p0, Ll/֡ۧ᩵;->᩷:Ljava/util/ArrayDeque;

    .line 21
    new-instance v0, Ll/ܿۧ᩵;

    invoke-direct {v0, p1}, Ll/ܿۧ᩵;-><init>(Ll/ۖۡۗ;)V

    iput-object v0, p0, Ll/֡ۧ᩵;->ۤ:Ll/ܿۧ᩵;

    .line 22
    invoke-virtual {p3, p2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 23
    invoke-virtual {v0, p2}, Ll/ܿۧ᩵;->ۙ(Ll/᩷ۡۗ;)V

    return-void
.end method


# virtual methods
.method public final ۙ()Ll/᩷ۡۗ;
    .locals 6

    .line 27
    iget-object v0, p0, Ll/֡ۧ᩵;->᩷:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 31
    :cond_0
    iget-object v2, p0, Ll/֡ۧ᩵;->ۙ:Ljava/util/function/Function;

    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 32
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    :cond_1
    :goto_0
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_2

    .line 34
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    .line 35
    iget-object v5, p0, Ll/֡ۧ᩵;->ۤ:Ll/ܿۧ᩵;

    invoke-virtual {v5, v4}, Ll/ܿۧ᩵;->᩷(Ll/᩷ۡۗ;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 36
    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-object v1
.end method

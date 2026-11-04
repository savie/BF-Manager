.class public final Ll/᩹ۘۨ;
.super Ll/ۗۘۨ;
.source "V2DV"


# instance fields
.field public final ᩷:Ljava/util/ArrayList;


# direct methods
.method public varargs constructor <init>([Ll/ۗۘۨ;)V
    .locals 3

    .line 44
    invoke-direct {p0}, Ll/ۗۘۨ;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩹ۘۨ;->᩷:Ljava/util/ArrayList;

    .line 46
    invoke-static {p1}, Ll/᩹ܺۗ;->of([Ljava/lang/Object;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v1, Ll/ᩳۨᩴ;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ll/ᩳۨᩴ;-><init>(I)V

    invoke-interface {p1, v1}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v1, Ll/ᩳ֫᩵;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ll/ᩳ֫᩵;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v1}, Ll/᩵ܺۗ;->forEach(Ljava/util/function/Consumer;)V

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/CharSequence;ILjava/io/StringWriter;)I
    .locals 2

    .line 57
    iget-object v0, p0, Ll/᩹ۘۨ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۘۨ;

    .line 58
    invoke-virtual {v1, p1, p2, p3}, Ll/ۗۘۨ;->ۙ(Ljava/lang/CharSequence;ILjava/io/StringWriter;)I

    move-result v1

    if-eqz v1, :cond_0

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

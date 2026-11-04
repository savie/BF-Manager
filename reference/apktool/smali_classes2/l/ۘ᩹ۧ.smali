.class public final Ll/ۘ᩹ۧ;
.super Ljava/lang/Object;
.source "KAQ1"


# instance fields
.field public final ۙ:[Ljava/lang/String;

.field public final ۤ:[Ljava/lang/String;

.field public final ۫:[Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ᩴ:Ljava/lang/String;

.field public final ᩷:[Ljava/lang/String;

.field public final ᩸:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۗ᩹ܳ;)V
    .locals 3

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-virtual {p1}, Ll/ۗ᩹ܳ;->ܳ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘ᩹ۧ;->ܳ:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Ll/ۗ᩹ܳ;->ᩴ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘ᩹ۧ;->ᩴ:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Ll/ۗ᩹ܳ;->ۤ()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/ۘ᩹ۧ;->ۤ:[Ljava/lang/String;

    .line 42
    invoke-virtual {p1}, Ll/ۗ᩹ܳ;->᩸()Ljava/util/List;

    move-result-object v0

    new-array v2, v1, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/ۘ᩹ۧ;->᩸:[Ljava/lang/String;

    .line 43
    invoke-virtual {p1}, Ll/ۗ᩹ܳ;->᩷()Ljava/util/List;

    move-result-object v0

    new-array v2, v1, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/ۘ᩹ۧ;->᩷:[Ljava/lang/String;

    .line 44
    invoke-virtual {p1}, Ll/ۗ᩹ܳ;->ۙ()Ljava/util/List;

    move-result-object v0

    new-array v2, v1, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/ۘ᩹ۧ;->ۙ:[Ljava/lang/String;

    .line 45
    invoke-virtual {p1}, Ll/ۗ᩹ܳ;->۫()Ljava/util/List;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Ll/ۘ᩹ۧ;->۫:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ۢ۫ۛ;)V
    .locals 4

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-interface {p1}, Ll/ᩴۧۛ;->getType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘ᩹ۧ;->ܳ:Ljava/lang/String;

    .line 27
    invoke-interface {p1}, Ll/ۢ۫ۛ;->֫ۤ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘ᩹ۧ;->ᩴ:Ljava/lang/String;

    .line 28
    invoke-interface {p1}, Ll/ۢ۫ۛ;->ܳۙ()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/ۘ᩹ۧ;->ۤ:[Ljava/lang/String;

    .line 29
    new-instance v0, Ll/֡᩷᩸;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v1, Ll/ۨ᩹ۧ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۨ᩹ۧ;-><init>(I)V

    .line 31
    invoke-interface {p1}, Ll/ۢ۫ۛ;->ۖۙ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-static {v2, v0}, Ll/ܺۚܽ;->ۙ(Ljava/lang/Iterable;Ll/ۚۙܽ;)Ljava/lang/Iterable;

    move-result-object v2

    const-class v3, Ljava/lang/String;

    invoke-static {v2, v3}, Ll/ܺۚܽ;->ۙ(Ljava/lang/Iterable;Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    iput-object v2, p0, Ll/ۘ᩹ۧ;->᩸:[Ljava/lang/String;

    .line 32
    invoke-interface {p1}, Ll/ۢ۫ۛ;->ۜ᩷()Ljava/lang/Iterable;

    move-result-object v2

    invoke-static {v2, v0}, Ll/ܺۚܽ;->ۙ(Ljava/lang/Iterable;Ll/ۚۙܽ;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0, v3}, Ll/ܺۚܽ;->ۙ(Ljava/lang/Iterable;Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/ۘ᩹ۧ;->᩷:[Ljava/lang/String;

    .line 33
    invoke-interface {p1}, Ll/ۢ۫ۛ;->᩷ۤ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ܺۚܽ;->ۙ(Ljava/lang/Iterable;Ll/ۚۙܽ;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0, v3}, Ll/ܺۚܽ;->ۙ(Ljava/lang/Iterable;Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/ۘ᩹ۧ;->ۙ:[Ljava/lang/String;

    .line 34
    invoke-interface {p1}, Ll/ۢ۫ۛ;->ܳۤ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ܺۚܽ;->ۙ(Ljava/lang/Iterable;Ll/ۚۙܽ;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-static {p1, v3}, Ll/ܺۚܽ;->ۙ(Ljava/lang/Iterable;Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Ll/ۘ᩹ۧ;->۫:[Ljava/lang/String;

    return-void
.end method

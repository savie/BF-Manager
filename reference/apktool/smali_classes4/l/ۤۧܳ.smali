.class public final synthetic Ll/ۤۧܳ;
.super Ljava/lang/Object;
.source "N6JA"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ll/ᩴۧܳ;

.field public final synthetic ܿ:Ljava/util/LinkedHashSet;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴۧܳ;Ljava/lang/String;Ljava/util/LinkedHashSet;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۧܳ;->ܰ:Ll/ᩴۧܳ;

    iput-object p2, p0, Ll/ۤۧܳ;->᩶:Ljava/lang/String;

    iput-object p3, p0, Ll/ۤۧܳ;->ܿ:Ljava/util/LinkedHashSet;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 0
    iget-object v0, p0, Ll/ۤۧܳ;->ܿ:Ljava/util/LinkedHashSet;

    check-cast p1, Ljava/lang/Boolean;

    iget-object v1, p0, Ll/ۤۧܳ;->ܰ:Ll/ᩴۧܳ;

    iget-object v2, p0, Ll/ۤۧܳ;->᩶:Ljava/lang/String;

    invoke-static {v1, v2, v0, p1}, Ll/ᩴۧܳ;->ۙ(Ll/ᩴۧܳ;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/lang/Boolean;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

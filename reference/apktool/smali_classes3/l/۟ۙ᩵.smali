.class public final synthetic Ll/۟ۙ᩵;
.super Ljava/lang/Object;
.source "A6I0"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܰ:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۙ᩵;->ܰ:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 2
    check-cast p1, Ll/֨ᩳۗ;

    .line 4
    check-cast p2, Ll/֨ᩳۗ;

    .line 743
    invoke-virtual {p1}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    invoke-virtual {p2}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v1

    iget-object v2, p0, Ll/۟ۙ᩵;->ܰ:Ljava/util/Comparator;

    invoke-interface {v2, v0, v1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    .line 746
    invoke-virtual {p1, p2}, Ll/֨ᩳۗ;->ۙ(Ll/֨ᩳۗ;)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

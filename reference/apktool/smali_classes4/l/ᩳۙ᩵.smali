.class public final synthetic Ll/ᩳۙ᩵;
.super Ljava/lang/Object;
.source "A6I0"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܰ:Ll/۫۠ۗ;

.field public final synthetic ᩶:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Ll/۫۠ۗ;Ljava/util/Comparator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۙ᩵;->ܰ:Ll/۫۠ۗ;

    iput-object p2, p0, Ll/ᩳۙ᩵;->᩶:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 2
    check-cast p1, Ll/ᩴ۠ۗ;

    .line 4
    check-cast p2, Ll/ᩴ۠ۗ;

    .line 726
    invoke-virtual {p1, p2}, Ll/ᩴ۠ۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 729
    invoke-virtual {p1}, Ll/ᩴ۠ۗ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 732
    :cond_0
    invoke-virtual {p2}, Ll/ᩴ۠ۗ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, -0x1

    return p1

    .line 736
    :cond_1
    invoke-virtual {p1}, Ll/ᩴ۠ۗ;->ᩴ()Ljava/util/ArrayList;

    move-result-object p1

    const/4 v0, 0x0

    .line 84
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    .line 736
    check-cast p1, Ll/֨ᩳۗ;

    invoke-virtual {p2}, Ll/ᩴ۠ۗ;->ᩴ()Ljava/util/ArrayList;

    move-result-object p2

    .line 84
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    .line 736
    check-cast p2, Ll/֨ᩳۗ;

    .line 743
    invoke-virtual {p1}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    invoke-virtual {p2}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v1

    iget-object v2, p0, Ll/ᩳۙ᩵;->᩶:Ljava/util/Comparator;

    invoke-interface {v2, v0, v1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x2

    if-ne v0, v1, :cond_2

    .line 746
    invoke-virtual {p1, p2}, Ll/֨ᩳۗ;->ۙ(Ll/֨ᩳۗ;)I

    move-result p1

    return p1

    :cond_2
    return v0

    .line 727
    :cond_3
    new-instance p1, Ll/۠ۧ᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Same handlers in try block: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ᩳۙ᩵;->ܰ:Ll/۫۠ۗ;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 727
    throw p1
.end method

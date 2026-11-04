.class public final synthetic Ll/֫֫᩵;
.super Ljava/lang/Object;
.source "T6GT"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ll/ۖۡۗ;

.field public final synthetic ᩶:Ljava/util/BitSet;


# direct methods
.method public synthetic constructor <init>(Ll/ۖۡۗ;Ljava/util/BitSet;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫֫᩵;->ܰ:Ll/ۖۡۗ;

    iput-object p2, p0, Ll/֫֫᩵;->᩶:Ljava/util/BitSet;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/ᩴ۠ۗ;

    .line 1083
    invoke-virtual {p1}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1085
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null handler block in: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/֫֫᩵;->ܰ:Ll/ۖۡۗ;

    invoke-virtual {v0, p1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    return-void

    .line 1088
    :cond_0
    invoke-virtual {v0}, Ll/᩷ۡۗ;->getId()I

    move-result p1

    iget-object v0, p0, Ll/֫֫᩵;->᩶:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

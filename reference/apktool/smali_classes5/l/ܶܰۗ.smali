.class public final Ll/ܶܰۗ;
.super Ljava/lang/Object;
.source "36HO"

# interfaces
.implements Ll/ۧܰۗ;


# instance fields
.field public final ܰ:I

.field public final ᩶:Ll/ܺܰۗ;


# direct methods
.method public constructor <init>(Ll/ܺܰۗ;I)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ll/ܺܰۗ;

    iput-object p1, p0, Ll/ܶܰۗ;->᩶:Ll/ܺܰۗ;

    .line 22
    iput p2, p0, Ll/ܶܰۗ;->ܰ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 51
    :cond_0
    instance-of v0, p1, Ll/ܶܰۗ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 54
    :cond_1
    check-cast p1, Ll/ܶܰۗ;

    iget-object p1, p1, Ll/ܶܰۗ;->᩶:Ll/ܺܰۗ;

    iget-object v0, p0, Ll/ܶܰۗ;->᩶:Ll/ܺܰۗ;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ܶܰۗ;->᩶:Ll/ܺܰۗ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NodeDeclareRef{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܶܰۗ;->᩶:Ll/ܺܰۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ll/֫ܰۗ;
    .locals 1

    .line 43
    sget-object v0, Ll/֫ܰۗ;->ܿ:Ll/֫ܰۗ;

    return-object v0
.end method

.method public final ۙ()I
    .locals 1

    .line 26
    iget v0, p0, Ll/ܶܰۗ;->ܰ:I

    return v0
.end method

.method public final ۤ()Ll/ܺܰۗ;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ܶܰۗ;->᩶:Ll/ܺܰۗ;

    return-object v0
.end method

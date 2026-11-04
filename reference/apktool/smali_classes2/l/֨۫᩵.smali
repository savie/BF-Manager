.class public final Ll/֨۫᩵;
.super Ljava/lang/Object;
.source "W6FK"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ܰ:Ll/ܺ֨ۗ;

.field public final ܿ:Ll/֫֨ۗ;

.field public final ᩶:I


# direct methods
.method public constructor <init>(ILl/ܺ֨ۗ;Ll/֫֨ۗ;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput p1, p0, Ll/֨۫᩵;->᩶:I

    .line 15
    iput-object p2, p0, Ll/֨۫᩵;->ܰ:Ll/ܺ֨ۗ;

    .line 16
    iput-object p3, p0, Ll/֨۫᩵;->ܿ:Ll/֫֨ۗ;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 8
    check-cast p1, Ll/֨۫᩵;

    .line 33
    iget v0, p0, Ll/֨۫᩵;->᩶:I

    iget p1, p1, Ll/֨۫᩵;->᩶:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public final getType()Ll/֫֨ۗ;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/֨۫᩵;->ܿ:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/֨۫᩵;->ܿ:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨۫᩵;->ܰ:Ll/ܺ֨ۗ;

    invoke-virtual {v1}, Ll/ܺ۟ۗ;->֨()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " in "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/ܺ֨ۗ;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/֨۫᩵;->ܰ:Ll/ܺ֨ۗ;

    return-object v0
.end method

.method public final ᩸()I
    .locals 1

    .line 20
    iget v0, p0, Ll/֨۫᩵;->᩶:I

    return v0
.end method

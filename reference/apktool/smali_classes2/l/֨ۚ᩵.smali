.class public final Ll/֨ۚ᩵;
.super Ljava/lang/Object;
.source "17QS"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ܰ:Ljava/util/ArrayList;

.field public final ᩶:Ll/ۖۚ᩵;


# direct methods
.method public constructor <init>(Ll/ۖۚ᩵;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֨ۚ᩵;->ܰ:Ljava/util/ArrayList;

    .line 44
    iput-object p1, p0, Ll/֨ۚ᩵;->᩶:Ll/ۖۚ᩵;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 33
    check-cast p1, Ll/֨ۚ᩵;

    .line 131
    iget-object v0, p0, Ll/֨ۚ᩵;->᩶:Ll/ۖۚ᩵;

    invoke-virtual {v0}, Ll/ۖۚ᩵;->۫()Ljava/lang/String;

    iget-object p1, p1, Ll/֨ۚ᩵;->᩶:Ll/ۖۚ᩵;

    invoke-virtual {p1}, Ll/ۖۚ᩵;->۫()Ljava/lang/String;

    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 161
    :cond_0
    instance-of v1, p1, Ll/֨ۚ᩵;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 131
    :cond_1
    iget-object v1, p0, Ll/֨ۚ᩵;->᩶:Ll/ۖۚ᩵;

    invoke-virtual {v1}, Ll/ۖۚ᩵;->۫()Ljava/lang/String;

    .line 164
    check-cast p1, Ll/֨ۚ᩵;

    .line 131
    iget-object p1, p1, Ll/֨ۚ᩵;->᩶:Ll/ۖۚ᩵;

    invoke-virtual {p1}, Ll/ۖۚ᩵;->۫()Ljava/lang/String;

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 131
    iget-object v0, p0, Ll/֨ۚ᩵;->᩶:Ll/ۖۚ᩵;

    invoke-virtual {v0}, Ll/ۖۚ᩵;->۫()Ljava/lang/String;

    const v0, 0x5434294

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Ll/֨ۚ᩵;->᩶:Ll/ۖۚ᩵;

    invoke-virtual {v0}, Ll/ۖۚ᩵;->۫()Ljava/lang/String;

    const-string v0, "dex-input"

    return-object v0
.end method

.method public final ۙ()Ljava/util/ArrayList;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/֨ۚ᩵;->ܰ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۙ(Ll/۫ܿۗ;)V
    .locals 1

    .line 79
    iget-object v0, p0, Ll/֨ۚ᩵;->᩶:Ll/ۖۚ᩵;

    invoke-virtual {v0, p1}, Ll/ۖۚ᩵;->ۙ(Ll/۫ܿۗ;)V

    return-void
.end method

.method public final ۙ(Ll/ܳ᩻᩵;)V
    .locals 1

    .line 69
    iget-object v0, p0, Ll/֨ۚ᩵;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Ll/֨ۚ᩵;->᩶:Ll/ۖۚ᩵;

    invoke-virtual {v0}, Ll/ۖۚ᩵;->۫()Ljava/lang/String;

    const-string v0, "dex-input"

    return-object v0
.end method

.method public final ᩸()Ll/۫ܿۗ;
    .locals 1

    .line 136
    iget-object v0, p0, Ll/֨ۚ᩵;->᩶:Ll/ۖۚ᩵;

    invoke-virtual {v0}, Ll/ۖۚ᩵;->᩸()Ll/۫ܿۗ;

    move-result-object v0

    return-object v0
.end method

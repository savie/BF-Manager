.class public final Ll/ᩴ֨ۗ;
.super Ll/᩷֨ۗ;
.source "J6GG"


# instance fields
.field public final ۤۙ:Ll/ۨ֨ۗ;


# direct methods
.method public constructor <init>(Ll/ۨ֨ۗ;)V
    .locals 0

    .line 178
    invoke-direct {p0}, Ll/֫֨ۗ;-><init>()V

    .line 207
    iput-object p1, p0, Ll/ᩴ֨ۗ;->ۤۙ:Ll/ۨ֨ۗ;

    .line 208
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iput p1, p0, Ll/֫֨ۗ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 228
    iget-object v0, p0, Ll/ᩴ֨ۗ;->ۤۙ:Ll/ۨ֨ۗ;

    invoke-virtual {v0}, Ll/ۨ֨ۗ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;)Z
    .locals 1

    .line 223
    check-cast p1, Ll/ᩴ֨ۗ;

    iget-object p1, p1, Ll/ᩴ֨ۗ;->ۤۙ:Ll/ۨ֨ۗ;

    iget-object v0, p0, Ll/ᩴ֨ۗ;->ۤۙ:Ll/ۨ֨ۗ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܶ()Ll/ۨ֨ۗ;
    .locals 1

    .line 213
    iget-object v0, p0, Ll/ᩴ֨ۗ;->ۤۙ:Ll/ۨ֨ۗ;

    return-object v0
.end method

.class public final Ll/᩷ܳ᩵;
.super Ljava/lang/Object;
.source "9IT7"


# instance fields
.field public final ۙ:Ll/᩷ۡۗ;

.field public final ۤ:[Ll/ܿ֨ۗ;

.field public final ᩷:Ll/ۖۡۗ;

.field public final ᩸:[I


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;Ll/᩷ۡۗ;[Ll/ܿ֨ۗ;[I)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/᩷ܳ᩵;->᩷:Ll/ۖۡۗ;

    .line 43
    iput-object p2, p0, Ll/᩷ܳ᩵;->ۙ:Ll/᩷ۡۗ;

    .line 44
    iput-object p3, p0, Ll/᩷ܳ᩵;->ۤ:[Ll/ܿ֨ۗ;

    .line 45
    iput-object p4, p0, Ll/᩷ܳ᩵;->᩸:[I

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;)Ll/᩷ܳ᩵;
    .locals 4

    .line 17
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۢۙ()I

    move-result v0

    .line 18
    new-instance v1, Ll/᩷ܳ᩵;

    .line 20
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v2

    new-array v3, v0, [Ll/ܿ֨ۗ;

    new-array v0, v0, [I

    invoke-direct {v1, p0, v2, v3, v0}, Ll/᩷ܳ᩵;-><init>(Ll/ۖۡۗ;Ll/᩷ۡۗ;[Ll/ܿ֨ۗ;[I)V

    .line 23
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 25
    invoke-virtual {v1, v0}, Ll/᩷ܳ᩵;->ۙ(Ll/ۛ֨ۗ;)Ll/ܿ֨ۗ;

    .line 27
    :cond_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ֨ۗ;

    .line 28
    invoke-virtual {v1, v0}, Ll/᩷ܳ᩵;->ۙ(Ll/ۛ֨ۗ;)Ll/ܿ֨ۗ;

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static ۙ(Ll/᩷ܳ᩵;Ll/᩷ۡۗ;)Ll/᩷ܳ᩵;
    .locals 4

    .line 34
    new-instance v0, Ll/᩷ܳ᩵;

    iget-object v1, p0, Ll/᩷ܳ᩵;->᩷:Ll/ۖۡۗ;

    iget-object v2, p0, Ll/᩷ܳ᩵;->ۤ:[Ll/ܿ֨ۗ;

    array-length v3, v2

    .line 37
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/ܿ֨ۗ;

    iget-object p0, p0, Ll/᩷ܳ᩵;->᩸:[I

    invoke-direct {v0, v1, p1, v2, p0}, Ll/᩷ܳ᩵;-><init>(Ll/ۖۡۗ;Ll/᩷ۡۗ;[Ll/ܿ֨ۗ;[I)V

    return-object v0
.end method


# virtual methods
.method public final ۙ(I)Ll/ܿ֨ۗ;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/᩷ܳ᩵;->ۤ:[Ll/ܿ֨ۗ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۙ(Ll/ۛ֨ۗ;)Ll/ܿ֨ۗ;
    .locals 4

    .line 57
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v0

    .line 58
    iget-object v1, p0, Ll/᩷ܳ᩵;->᩸:[I

    aget v2, v1, v0

    add-int/lit8 v3, v2, 0x1

    aput v3, v1, v0

    .line 59
    iget-object v1, p0, Ll/᩷ܳ᩵;->᩷:Ll/ۖۡۗ;

    invoke-virtual {v1, v0, v2, p1}, Ll/ۖۡۗ;->ۙ(IILl/ۛ֨ۗ;)Ll/ܿ֨ۗ;

    move-result-object p1

    .line 60
    iget-object v1, p0, Ll/᩷ܳ᩵;->ۤ:[Ll/ܿ֨ۗ;

    aput-object p1, v1, v0

    return-object p1
.end method

.method public final ۙ()Ll/᩷ۡۗ;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/᩷ܳ᩵;->ۙ:Ll/᩷ۡۗ;

    return-object v0
.end method

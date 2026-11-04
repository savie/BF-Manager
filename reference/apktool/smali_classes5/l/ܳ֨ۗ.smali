.class public final Ll/ܳ֨ۗ;
.super Ll/֫֨ۗ;
.source "J6GG"


# instance fields
.field public final ᩷ۙ:[Ll/ۨ֨ۗ;


# direct methods
.method public constructor <init>([Ll/ۨ֨ۗ;)V
    .locals 0

    .line 532
    invoke-direct {p0}, Ll/֫֨ۗ;-><init>()V

    .line 533
    iput-object p1, p0, Ll/ܳ֨ۗ;->᩷ۙ:[Ll/ۨ֨ۗ;

    .line 534
    invoke-static {p1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Ll/֫֨ۗ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 575
    iget-object v0, p0, Ll/ܳ֨ۗ;->᩷ۙ:[Ll/ۨ֨ۗ;

    array-length v1, v0

    invoke-static {}, Ll/ۨ֨ۗ;->values()[Ll/ۨ֨ۗ;

    move-result-object v2

    array-length v2, v2

    if-ne v1, v2, :cond_0

    const-string v0, "??"

    return-object v0

    .line 578
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "??["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    if-nez v0, :cond_1

    const/4 v3, 0x0

    goto :goto_0

    .line 110
    :cond_1
    array-length v3, v0

    :goto_0
    if-nez v3, :cond_2

    const-string v0, ""

    goto :goto_2

    .line 114
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    aget-object v2, v0, v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    :goto_1
    if-ge v2, v3, :cond_3

    const-string v5, ", "

    .line 117
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v0, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 119
    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 578
    :goto_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;)Z
    .locals 1

    .line 570
    check-cast p1, Ll/ܳ֨ۗ;

    iget-object p1, p1, Ll/ܳ֨ۗ;->᩷ۙ:[Ll/ۨ֨ۗ;

    iget-object v0, p0, Ll/ܳ֨ۗ;->᩷ۙ:[Ll/ۨ֨ۗ;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۟()Ll/֫֨ۗ;
    .locals 2

    .line 559
    sget-object v0, Ll/ۨ֨ۗ;->۬:Ll/ۨ֨ۗ;

    invoke-virtual {p0, v0}, Ll/ܳ֨ۗ;->᩷(Ll/ۨ֨ۗ;)Z

    move-result v0

    sget-object v1, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    if-eqz v0, :cond_0

    return-object v1

    .line 562
    :cond_0
    sget-object v0, Ll/ۨ֨ۗ;->۟:Ll/ۨ֨ۗ;

    invoke-virtual {p0, v0}, Ll/ܳ֨ۗ;->᩷(Ll/ۨ֨ۗ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    new-instance v0, Ll/ۜۢۗ;

    invoke-direct {v0, v1}, Ll/ۜۢۗ;-><init>(Ll/֫֨ۗ;)V

    return-object v0

    .line 565
    :cond_1
    iget-object v0, p0, Ll/ܳ֨ۗ;->᩷ۙ:[Ll/ۨ֨ۗ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 85
    new-instance v1, Ll/ᩴ֨ۗ;

    invoke-direct {v1, v0}, Ll/ᩴ֨ۗ;-><init>(Ll/ۨ֨ۗ;)V

    return-object v1
.end method

.method public final ܽ()[Ll/ۨ֨ۗ;
    .locals 1

    .line 539
    iget-object v0, p0, Ll/ܳ֨ۗ;->᩷ۙ:[Ll/ۨ֨ۗ;

    return-object v0
.end method

.method public final ᩷(Ll/ۨ֨ۗ;)Z
    .locals 5

    .line 549
    iget-object v0, p0, Ll/ܳ֨ۗ;->᩷ۙ:[Ll/ۨ֨ۗ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    if-ne v4, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.class public final Ll/ۜۢۗ;
.super Ll/᩷֨ۗ;
.source "J6GG"


# static fields
.field public static final ᩸ۙ:[Ll/ۨ֨ۗ;


# instance fields
.field public final ۤۙ:Ll/֫֨ۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ۨ֨ۗ;

    .line 469
    sget-object v1, Ll/ۨ֨ۗ;->۟:Ll/ۨ֨ۗ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Ll/ۜۢۗ;->᩸ۙ:[Ll/ۨ֨ۗ;

    return-void
.end method

.method public constructor <init>(Ll/֫֨ۗ;)V
    .locals 0

    .line 178
    invoke-direct {p0}, Ll/֫֨ۗ;-><init>()V

    .line 473
    iput-object p1, p0, Ll/ۜۢۗ;->ۤۙ:Ll/֫֨ۗ;

    .line 930
    iget p1, p1, Ll/֫֨ۗ;->ۙ:I

    .line 474
    iput p1, p0, Ll/֫֨ۗ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 525
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۜۢۗ;->ۤۙ:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "[]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;)Z
    .locals 1

    .line 519
    check-cast p1, Ll/ۜۢۗ;

    .line 520
    iget-object v0, p0, Ll/ۜۢۗ;->ۤۙ:Ll/֫֨ۗ;

    .line 479
    iget-object p1, p1, Ll/ۜۢۗ;->ۤۙ:Ll/֫֨ۗ;

    .line 520
    invoke-virtual {v0, p1}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۟()Ll/֫֨ۗ;
    .locals 2

    .line 499
    iget-object v0, p0, Ll/ۜۢۗ;->ۤۙ:Ll/֫֨ۗ;

    invoke-virtual {v0}, Ll/֫֨ۗ;->۟()Ll/֫֨ۗ;

    move-result-object v0

    .line 160
    new-instance v1, Ll/ۜۢۗ;

    invoke-direct {v1, v0}, Ll/ۜۢۗ;-><init>(Ll/֫֨ۗ;)V

    return-object v1
.end method

.method public final ۫()Ll/֫֨ۗ;
    .locals 1

    .line 514
    iget-object v0, p0, Ll/ۜۢۗ;->ۤۙ:Ll/֫֨ۗ;

    invoke-virtual {v0}, Ll/֫֨ۗ;->۫()Ll/֫֨ۗ;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ll/֫֨ۗ;
    .locals 1

    .line 479
    iget-object v0, p0, Ll/ۜۢۗ;->ۤۙ:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final ܶ()Ll/ۨ֨ۗ;
    .locals 1

    .line 489
    sget-object v0, Ll/ۨ֨ۗ;->۟:Ll/ۨ֨ۗ;

    return-object v0
.end method

.method public final ܽ()[Ll/ۨ֨ۗ;
    .locals 1

    .line 504
    sget-object v0, Ll/ۜۢۗ;->᩸ۙ:[Ll/ۨ֨ۗ;

    return-object v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 509
    iget-object v0, p0, Ll/ۜۢۗ;->ۤۙ:Ll/֫֨ۗ;

    invoke-virtual {v0}, Ll/֫֨ۗ;->ᩴ()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ᩶()Z
    .locals 1

    .line 494
    iget-object v0, p0, Ll/ۜۢۗ;->ۤۙ:Ll/֫֨ۗ;

    invoke-virtual {v0}, Ll/֫֨ۗ;->᩶()Z

    move-result v0

    return v0
.end method

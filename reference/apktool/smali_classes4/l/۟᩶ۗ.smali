.class public final Ll/۟᩶ۗ;
.super Ljava/lang/Object;
.source "ZIVQ"

# interfaces
.implements Ll/ᩳܰۗ;


# instance fields
.field public final ۙ:I

.field public final ۤ:[Ljava/lang/String;

.field public final ᩷:[I


# direct methods
.method public constructor <init>(I[Ljava/lang/String;[I)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p3, p0, Ll/۟᩶ۗ;->᩷:[I

    .line 14
    iput-object p2, p0, Ll/۟᩶ۗ;->ۤ:[Ljava/lang/String;

    .line 15
    iput p1, p0, Ll/۟᩶ۗ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 8

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Catch:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    iget-object v1, p0, Ll/۟᩶ۗ;->ۤ:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    const-string v6, "0x%04x"

    if-ge v4, v2, :cond_0

    const/16 v7, 0x20

    .line 38
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-object v7, v1, v4

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "->"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Ll/۟᩶ۗ;->᩷:[I

    aget v7, v7, v4

    .line 5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v7, v5, v3

    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 38
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    .line 40
    iget v2, p0, Ll/۟᩶ۗ;->ۙ:I

    if-eq v2, v1, :cond_1

    const-string v1, " all->"

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    aput-object v1, v2, v3

    invoke-static {v6, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()[Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/۟᩶ۗ;->ۤ:[Ljava/lang/String;

    return-object v0
.end method

.method public final ۤ()I
    .locals 1

    .line 30
    iget v0, p0, Ll/۟᩶ۗ;->ۙ:I

    return v0
.end method

.method public final ᩷()[I
    .locals 1

    .line 20
    iget-object v0, p0, Ll/۟᩶ۗ;->᩷:[I

    return-object v0
.end method

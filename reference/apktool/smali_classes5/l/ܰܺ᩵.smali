.class public final Ll/ܰܺ᩵;
.super Ljava/lang/Object;
.source "FIRW"

# interfaces
.implements Ll/ۡܰۗ;


# instance fields
.field public ۙ:I

.field public final ۤ:Ljava/lang/String;

.field public final ۫:Ljava/lang/String;

.field public ܳ:I

.field public final ᩴ:Ljava/lang/String;

.field public ᩷:Z

.field public final ᩸:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput p2, p0, Ll/ܰܺ᩵;->᩸:I

    .line 32
    iput-object p1, p0, Ll/ܰܺ᩵;->ۤ:Ljava/lang/String;

    .line 33
    iput-object p3, p0, Ll/ܰܺ᩵;->۫:Ljava/lang/String;

    .line 34
    iput-object p4, p0, Ll/ܰܺ᩵;->ᩴ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ۨܺ᩵;IIII)V
    .locals 0

    .line 23
    invoke-virtual {p1, p3}, Ll/ۨܺ᩵;->ܳ(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p4}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p5}, Ll/ۨܺ᩵;->ܳ(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p3, p2, p4, p1}, Ll/ܰܺ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ܰܺ᩵;->ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ܰܺ᩵;->ᩴ:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ܰܺ᩵;->۫:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/ܰܺ᩵;->ܳ:I

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-string v5, "0x%04x"

    if-ne v1, v2, :cond_0

    const-string v1, "-1 "

    goto :goto_0

    .line 90
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v1, v2, v3

    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 113
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 114
    iget-boolean v1, p0, Ll/ܰܺ᩵;->᩷:Z

    if-eqz v1, :cond_1

    iget v1, p0, Ll/ܰܺ᩵;->ۙ:I

    .line 90
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v1, v2, v3

    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const-string v1, "      "

    .line 114
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": r"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܰܺ᩵;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܰܺ᩵;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܰܺ᩵;->۫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    iget-object v1, p0, Ll/ܰܺ᩵;->ᩴ:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v2, ", signature: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    const-string v1, ""

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()I
    .locals 1

    .line 94
    iget v0, p0, Ll/ܰܺ᩵;->ۙ:I

    return v0
.end method

.method public final ۙ(I)Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Ll/ܰܺ᩵;->᩷:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x1

    .line 52
    iput-boolean v0, p0, Ll/ܰܺ᩵;->᩷:Z

    .line 53
    iput p1, p0, Ll/ܰܺ᩵;->ۙ:I

    return v0
.end method

.method public final ۤ()I
    .locals 1

    .line 59
    iget v0, p0, Ll/ܰܺ᩵;->᩸:I

    return v0
.end method

.method public final ᩴ()V
    .locals 1

    const/4 v0, -0x1

    .line 84
    iput v0, p0, Ll/ܰܺ᩵;->ܳ:I

    return-void
.end method

.method public final ᩷()I
    .locals 1

    .line 80
    iget v0, p0, Ll/ܰܺ᩵;->ܳ:I

    return v0
.end method

.method public final ᩷(I)V
    .locals 1

    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Ll/ܰܺ᩵;->᩷:Z

    .line 39
    iput p1, p0, Ll/ܰܺ᩵;->ܳ:I

    return-void
.end method

.method public final ᩸()Z
    .locals 1

    .line 98
    iget-boolean v0, p0, Ll/ܰܺ᩵;->᩷:Z

    return v0
.end method

.class public final Ll/ܽܺ᩵;
.super Ljava/lang/Object;
.source "X6CD"


# instance fields
.field public final ֫:I

.field public ۙ:I

.field public final ۚ:I

.field public final ۤ:I

.field public final ۫:I

.field public final ܳ:I

.field public ᩴ:I

.field public final ᩷:I

.field public final ᩸:I


# direct methods
.method public constructor <init>(Ll/ۨܺ᩵;)V
    .locals 5

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 23
    invoke-virtual {p1, v0}, Ll/ۨܺ᩵;->֫(I)[B

    .line 134
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Ll/ۨܺ᩵;->֫(I)[B

    move-result-object v1

    sget-object v2, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const/4 v0, 0x1

    .line 25
    invoke-virtual {p1, v0}, Ll/ۨܺ᩵;->᩻(I)V

    .line 26
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    const/16 v0, 0x14

    .line 27
    invoke-virtual {p1, v0}, Ll/ۨܺ᩵;->֫(I)[B

    .line 28
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    .line 29
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    .line 30
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    const v1, 0x12345678

    if-ne v0, v1, :cond_3

    .line 34
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    .line 35
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    .line 36
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    .line 37
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    .line 38
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v1

    iput v1, p0, Ll/ܽܺ᩵;->ۚ:I

    .line 39
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    .line 40
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v1

    iput v1, p0, Ll/ܽܺ᩵;->֫:I

    .line 41
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    .line 42
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v1

    iput v1, p0, Ll/ܽܺ᩵;->۫:I

    .line 43
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    .line 44
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v1

    iput v1, p0, Ll/ܽܺ᩵;->᩸:I

    .line 45
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    .line 46
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v1

    iput v1, p0, Ll/ܽܺ᩵;->ܳ:I

    .line 47
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v1

    iput v1, p0, Ll/ܽܺ᩵;->ۤ:I

    .line 48
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v1

    iput v1, p0, Ll/ܽܺ᩵;->᩷:I

    .line 49
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    .line 50
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    .line 56
    invoke-virtual {p1, v0}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 57
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 59
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ܶ()I

    move-result v2

    const/4 v3, 0x6

    .line 60
    invoke-virtual {p1, v3}, Ll/ۨܺ᩵;->᩻(I)V

    .line 61
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v3

    const/4 v4, 0x7

    if-eq v2, v4, :cond_1

    const/16 v4, 0x8

    if-eq v2, v4, :cond_0

    goto :goto_1

    .line 69
    :cond_0
    iput v3, p0, Ll/ܽܺ᩵;->ᩴ:I

    goto :goto_1

    .line 65
    :cond_1
    iput v3, p0, Ll/ܽܺ᩵;->ۙ:I

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void

    .line 32
    :cond_3
    new-instance p1, Ll/۬ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected endian tag: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v1, v0}, Ll/ۙۡۙ;->ۙ(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 32
    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 92
    iget v0, p0, Ll/ܽܺ᩵;->֫:I

    return v0
.end method

.method public final ۙ()I
    .locals 1

    .line 124
    iget v0, p0, Ll/ܽܺ᩵;->ۙ:I

    return v0
.end method

.method public final ۚ()I
    .locals 1

    .line 88
    iget v0, p0, Ll/ܽܺ᩵;->ۚ:I

    return v0
.end method

.method public final ۤ()I
    .locals 1

    .line 80
    iget v0, p0, Ll/ܽܺ᩵;->ۤ:I

    return v0
.end method

.method public final ۫()I
    .locals 1

    .line 112
    iget v0, p0, Ll/ܽܺ᩵;->۫:I

    return v0
.end method

.method public final ܳ()I
    .locals 1

    .line 116
    iget v0, p0, Ll/ܽܺ᩵;->ܳ:I

    return v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 128
    iget v0, p0, Ll/ܽܺ᩵;->ᩴ:I

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 84
    iget v0, p0, Ll/ܽܺ᩵;->᩷:I

    return v0
.end method

.method public final ᩸()I
    .locals 1

    .line 104
    iget v0, p0, Ll/ܽܺ᩵;->᩸:I

    return v0
.end method

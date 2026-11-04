.class public final Ll/۟ܶܳ;
.super Ljava/lang/Object;
.source "66CT"


# instance fields
.field public final ۙ:I

.field public final ۤ:I

.field public final ᩷:I

.field public final ᩸:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput p1, p0, Ll/۟ܶܳ;->᩷:I

    .line 61
    iput p2, p0, Ll/۟ܶܳ;->᩸:I

    .line 62
    iput p3, p0, Ll/۟ܶܳ;->ۤ:I

    .line 63
    iput p4, p0, Ll/۟ܶܳ;->ۙ:I

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)Ll/۟ܶܳ;
    .locals 8

    if-eqz p0, :cond_2

    .line 76
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x5b

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x2c

    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    const-string v3, "]["

    .line 78
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v3

    add-int/lit8 v4, v3, 0x2

    .line 79
    invoke-virtual {p0, v0, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    const/4 v5, 0x2

    if-lt v1, v5, :cond_2

    add-int/lit8 v5, v1, 0x2

    if-lt v3, v5, :cond_2

    add-int/lit8 v5, v3, 0x3

    if-lt v0, v5, :cond_2

    const/4 v5, 0x1

    .line 0
    invoke-static {v5, p0}, Ll/᩷᩶᩻;->ۙ(ILjava/lang/String;)C

    move-result v6

    const/16 v7, 0x5d

    if-eq v6, v7, :cond_1

    goto :goto_0

    .line 83
    :cond_1
    :try_start_0
    new-instance v6, Ll/۟ܶܳ;

    invoke-virtual {p0, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 84
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 85
    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    add-int/2addr v0, v5

    .line 86
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v5

    invoke-virtual {p0, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-direct {v6, v1, v2, v3, p0}, Ll/۟ܶܳ;-><init>(IIII)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v6

    :catch_0
    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.class public final Ll/ۙ۬ᩴ;
.super Ljava/lang/Object;
.source "0IQU"


# instance fields
.field public final ֫:I

.field public final ۙ:Z

.field public final ۚ:I

.field public final ۤ:I

.field public final ۧ:I

.field public final ۫:Ll/ۙ۬ᩴ;

.field public final ܳ:I

.field public final ܶ:Ll/ۙ۬ᩴ;

.field public final ܺ:Z

.field public final ܽ:I

.field public final ᩴ:I

.field public final ᩷:Z

.field public final ᩸:I

.field public final ᩻:J


# direct methods
.method public constructor <init>(IIII)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p3, :cond_c

    if-ltz p4, :cond_c

    if-nez p3, :cond_0

    if-eqz p4, :cond_c

    :cond_0
    const/4 v0, 0x5

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    if-nez p3, :cond_2

    const/4 v1, 0x3

    goto :goto_1

    :cond_2
    if-nez p4, :cond_3

    const/4 v1, 0x2

    goto :goto_1

    :cond_3
    :goto_0
    move v1, p1

    .line 17
    :goto_1
    iput v1, p0, Ll/ۙ۬ᩴ;->֫:I

    if-nez v1, :cond_5

    if-ne p3, p4, :cond_4

    goto :goto_2

    .line 19
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unequal SAME extent"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    if-ne p1, v0, :cond_6

    goto :goto_3

    :cond_6
    move p2, v1

    .line 20
    :goto_3
    iput p2, p0, Ll/ۙ۬ᩴ;->ܳ:I

    .line 21
    iput p3, p0, Ll/ۙ۬ᩴ;->ۧ:I

    iput p4, p0, Ll/ۙ۬ᩴ;->ܽ:I

    .line 22
    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-long p3, p1

    iput-wide p3, p0, Ll/ۙ۬ᩴ;->᩻:J

    const/4 p1, 0x1

    iput p1, p0, Ll/ۙ۬ᩴ;->ۚ:I

    iput p1, p0, Ll/ۙ۬ᩴ;->ۤ:I

    if-nez v1, :cond_7

    const/4 p3, 0x0

    goto :goto_4

    :cond_7
    const/4 p3, 0x1

    .line 23
    :goto_4
    iput p3, p0, Ll/ۙ۬ᩴ;->᩸:I

    if-nez p2, :cond_8

    const/4 p2, 0x0

    goto :goto_5

    :cond_8
    const/4 p2, 0x1

    .line 24
    :goto_5
    iput p2, p0, Ll/ۙ۬ᩴ;->ᩴ:I

    if-ne v1, v0, :cond_9

    const/4 p2, 0x1

    goto :goto_6

    :cond_9
    const/4 p2, 0x0

    .line 25
    :goto_6
    iput-boolean p2, p0, Ll/ۙ۬ᩴ;->ۙ:Z

    iput-boolean p2, p0, Ll/ۙ۬ᩴ;->ܺ:Z

    const/4 p3, 0x4

    if-eq v1, p3, :cond_b

    if-eqz p2, :cond_a

    goto :goto_7

    :cond_a
    const/4 p1, 0x0

    .line 26
    :cond_b
    :goto_7
    iput-boolean p1, p0, Ll/ۙ۬ᩴ;->᩷:Z

    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    iput-object p1, p0, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    return-void

    .line 16
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid alignment extent"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V
    .locals 6

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    iput-object p2, p0, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    .line 32
    iget v0, p1, Ll/ۙ۬ᩴ;->ۧ:I

    int-to-long v0, v0

    iget v2, p2, Ll/ۙ۬ᩴ;->ۧ:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_6

    iput v2, p0, Ll/ۙ۬ᩴ;->ۧ:I

    .line 33
    iget v0, p1, Ll/ۙ۬ᩴ;->ܽ:I

    int-to-long v0, v0

    iget v2, p2, Ll/ۙ۬ᩴ;->ܽ:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_5

    iput v2, p0, Ll/ۙ۬ᩴ;->ܽ:I

    .line 34
    iget-wide v0, p1, Ll/ۙ۬ᩴ;->᩻:J

    iget-wide v2, p2, Ll/ۙ۬ᩴ;->᩻:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۙ۬ᩴ;->᩻:J

    .line 35
    iget v0, p1, Ll/ۙ۬ᩴ;->ۤ:I

    iget v1, p2, Ll/ۙ۬ᩴ;->ۤ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۙ۬ᩴ;->ۤ:I

    .line 36
    iget v0, p1, Ll/ۙ۬ᩴ;->᩸:I

    iget v1, p2, Ll/ۙ۬ᩴ;->᩸:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۙ۬ᩴ;->᩸:I

    .line 37
    iget v0, p1, Ll/ۙ۬ᩴ;->ᩴ:I

    iget v1, p2, Ll/ۙ۬ᩴ;->ᩴ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۙ۬ᩴ;->ᩴ:I

    .line 38
    iget v0, p1, Ll/ۙ۬ᩴ;->ۚ:I

    iget v1, p2, Ll/ۙ۬ᩴ;->ۚ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۙ۬ᩴ;->ۚ:I

    .line 39
    iget-boolean v0, p1, Ll/ۙ۬ᩴ;->᩷:Z

    if-nez v0, :cond_1

    iget-boolean v0, p2, Ll/ۙ۬ᩴ;->᩷:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Ll/ۙ۬ᩴ;->᩷:Z

    .line 40
    iget-boolean v0, p1, Ll/ۙ۬ᩴ;->ܺ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p2, Ll/ۙ۬ᩴ;->ܺ:Z

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v0, 0x1

    :goto_3
    iput-boolean v0, p0, Ll/ۙ۬ᩴ;->ܺ:Z

    .line 41
    iget-boolean p1, p1, Ll/ۙ۬ᩴ;->ۙ:Z

    if-eqz p1, :cond_4

    iget-boolean p1, p2, Ll/ۙ۬ᩴ;->ۙ:Z

    if-eqz p1, :cond_4

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    iput-boolean v1, p0, Ll/ۙ۬ᩴ;->ۙ:Z

    const/4 p1, -0x1

    .line 42
    iput p1, p0, Ll/ۙ۬ᩴ;->ܳ:I

    iput p1, p0, Ll/ۙ۬ᩴ;->֫:I

    return-void

    .line 0
    :cond_5
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public static ۙ(III)Ll/ۙ۬ᩴ;
    .locals 2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 46
    :cond_0
    new-instance v0, Ll/ۙ۬ᩴ;

    if-nez p1, :cond_1

    const/4 v1, 0x3

    goto :goto_0

    :cond_1
    if-nez p2, :cond_2

    const/4 v1, 0x2

    goto :goto_0

    :cond_2
    move v1, p0

    .line 47
    :goto_0
    invoke-direct {v0, p0, v1, p1, p2}, Ll/ۙ۬ᩴ;-><init>(IIII)V

    return-object v0
.end method

.method public static ۙ(IILjava/util/List;)Ll/ۙ۬ᩴ;
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sub-int v0, p1, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 53
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۡۙܳ;

    .line 54
    iget p1, p0, Ll/ۡۙܳ;->᩷:I

    iget p2, p0, Ll/ۡۙܳ;->᩸:I

    iget p0, p0, Ll/ۡۙܳ;->ܳ:I

    invoke-static {p1, p2, p0}, Ll/ۙ۬ᩴ;->ۙ(III)Ll/ۙ۬ᩴ;

    move-result-object p0

    return-object p0

    :cond_1
    add-int v0, p0, p1

    ushr-int/2addr v0, v1

    .line 57
    new-instance v1, Ll/ۙ۬ᩴ;

    invoke-static {p0, v0, p2}, Ll/ۙ۬ᩴ;->ۙ(IILjava/util/List;)Ll/ۙ۬ᩴ;

    move-result-object p0

    invoke-static {v0, p1, p2}, Ll/ۙ۬ᩴ;->ۙ(IILjava/util/List;)Ll/ۙ۬ᩴ;

    move-result-object p1

    invoke-direct {v1, p0, p1}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    return-object v1
.end method

.method public static ۙ(Ll/ۙ۬ᩴ;JJ)Ll/ۙ۬ᩴ;
    .locals 7

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_6

    cmp-long v3, p3, p1

    if-ltz v3, :cond_6

    if-nez p0, :cond_0

    move-wide v3, v0

    goto :goto_0

    .line 61
    :cond_0
    iget-wide v3, p0, Ll/ۙ۬ᩴ;->᩻:J

    :goto_0
    cmp-long v5, p3, v3

    if-gtz v5, :cond_6

    cmp-long v3, p1, p3

    if-nez v3, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    if-nez v2, :cond_2

    .line 162
    iget-wide v2, p0, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v4, p3, v2

    if-nez v4, :cond_2

    return-object p0

    .line 163
    :cond_2
    iget-object v2, p0, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    iget-object v3, p0, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    iget v4, p0, Ll/ۙ۬ᩴ;->ܽ:I

    iget v5, p0, Ll/ۙ۬ᩴ;->ۧ:I

    if-nez v2, :cond_3

    new-instance v0, Ll/ۙ۬ᩴ;

    iget v1, p0, Ll/ۙ۬ᩴ;->֫:I

    iget p0, p0, Ll/ۙ۬ᩴ;->ܳ:I

    int-to-long v2, v5

    .line 164
    invoke-static {p3, p4, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    sub-long/2addr v5, v2

    long-to-int v2, v5

    int-to-long v3, v4

    .line 165
    invoke-static {p3, p4, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p3

    invoke-static {p1, p2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    sub-long/2addr p3, p1

    long-to-int p1, p3

    invoke-direct {v0, v1, p0, v2, p1}, Ll/ۙ۬ᩴ;-><init>(IIII)V

    return-object v0

    .line 166
    :cond_3
    iget-wide v4, v2, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long p0, p3, v4

    if-gtz p0, :cond_4

    .line 167
    invoke-static {v2, p1, p2, p3, p4}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;JJ)Ll/ۙ۬ᩴ;

    move-result-object p0

    return-object p0

    :cond_4
    cmp-long p0, p1, v4

    if-ltz p0, :cond_5

    sub-long/2addr p1, v4

    sub-long/2addr p3, v4

    .line 168
    invoke-static {v3, p1, p2, p3, p4}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;JJ)Ll/ۙ۬ᩴ;

    move-result-object p0

    return-object p0

    .line 169
    :cond_5
    invoke-static {v2, p1, p2, v4, v5}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;JJ)Ll/ۙ۬ᩴ;

    move-result-object p0

    sub-long/2addr p3, v4

    invoke-static {v3, v0, v1, p3, p4}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;JJ)Ll/ۙ۬ᩴ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ۙ۬ᩴ;->ۤ(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;

    move-result-object p0

    return-object p0

    .line 160
    :cond_6
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p0
.end method

.method public static ۙ(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;
    .locals 6

    .line 143
    iget v0, p0, Ll/ۙ۬ᩴ;->ۚ:I

    iget-object v1, p0, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    iget v2, p1, Ll/ۙ۬ᩴ;->ۚ:I

    iget-object v3, p1, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    iget-object v4, p1, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    add-int/lit8 v5, v2, 0x1

    if-le v0, v5, :cond_1

    .line 144
    iget-object p0, p0, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    iget v0, p0, Ll/ۙ۬ᩴ;->ۚ:I

    iget v2, v1, Ll/ۙ۬ᩴ;->ۚ:I

    if-lt v0, v2, :cond_0

    .line 145
    new-instance v0, Ll/ۙ۬ᩴ;

    new-instance v2, Ll/ۙ۬ᩴ;

    invoke-direct {v2, v1, p1}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    invoke-direct {v0, p0, v2}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    return-object v0

    .line 146
    :cond_0
    new-instance v0, Ll/ۙ۬ᩴ;

    new-instance v2, Ll/ۙ۬ᩴ;

    iget-object v3, v1, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    invoke-direct {v2, p0, v3}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    new-instance p0, Ll/ۙ۬ᩴ;

    iget-object v1, v1, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    invoke-direct {p0, v1, p1}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    invoke-direct {v0, v2, p0}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    return-object v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    if-le v2, v0, :cond_3

    .line 150
    iget p1, v4, Ll/ۙ۬ᩴ;->ۚ:I

    iget v0, v3, Ll/ۙ۬ᩴ;->ۚ:I

    if-lt p1, v0, :cond_2

    .line 151
    new-instance p1, Ll/ۙ۬ᩴ;

    new-instance v0, Ll/ۙ۬ᩴ;

    invoke-direct {v0, p0, v3}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    invoke-direct {p1, v0, v4}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    return-object p1

    .line 152
    :cond_2
    new-instance p1, Ll/ۙ۬ᩴ;

    new-instance v0, Ll/ۙ۬ᩴ;

    iget-object v1, v3, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    invoke-direct {v0, p0, v1}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    new-instance p0, Ll/ۙ۬ᩴ;

    iget-object v1, v3, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    invoke-direct {p0, v1, v4}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    invoke-direct {p1, v0, p0}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    return-object p1

    .line 155
    :cond_3
    new-instance v0, Ll/ۙ۬ᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    return-object v0
.end method

.method public static ۙ(Ll/ۙ۬ᩴ;Z)Ll/ۙ۬ᩴ;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 113
    :cond_0
    iget-object v0, p0, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    if-nez v0, :cond_2

    new-instance v0, Ll/ۙ۬ᩴ;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    .line 114
    :cond_1
    iget p1, p0, Ll/ۙ۬ᩴ;->ܳ:I

    :goto_0
    iget v1, p0, Ll/ۙ۬ᩴ;->ۧ:I

    iget p0, p0, Ll/ۙ۬ᩴ;->ܽ:I

    const/4 v2, 0x5

    invoke-direct {v0, v2, p1, v1, p0}, Ll/ۙ۬ᩴ;-><init>(IIII)V

    return-object v0

    .line 115
    :cond_2
    invoke-static {v0, p1}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;Z)Ll/ۙ۬ᩴ;

    move-result-object v0

    iget-object p0, p0, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    invoke-static {p0, p1}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;Z)Ll/ۙ۬ᩴ;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ۙ۬ᩴ;->ۤ(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ۤ(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;
    .locals 3

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    .line 66
    :cond_1
    iget v0, p0, Ll/ۙ۬ᩴ;->ۚ:I

    iget v1, p1, Ll/ۙ۬ᩴ;->ۚ:I

    add-int/lit8 v2, v1, 0x1

    if-le v0, v2, :cond_2

    iget-object v0, p0, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    iget-object p0, p0, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    invoke-static {p0, p1}, Ll/ۙ۬ᩴ;->ۤ(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    if-le v1, v0, :cond_3

    .line 67
    iget-object v0, p1, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    invoke-static {p0, v0}, Ll/ۙ۬ᩴ;->ۤ(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;

    move-result-object p0

    iget-object p1, p1, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    invoke-static {p0, p1}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;

    move-result-object p0

    return-object p0

    .line 68
    :cond_3
    new-instance v0, Ll/ۙ۬ᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۙ۬ᩴ;-><init>(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)V

    return-object v0
.end method

.method public static ᩷(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;
    .locals 13

    if-eqz p0, :cond_7

    if-nez p1, :cond_0

    goto/16 :goto_2

    :cond_0
    move-object v0, p0

    .line 75
    :goto_0
    iget-object v1, v0, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    iget v2, v0, Ll/ۙ۬ᩴ;->ܽ:I

    iget v3, v0, Ll/ۙ۬ᩴ;->ۧ:I

    if-eqz v1, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    move-object v1, p1

    .line 76
    :goto_1
    iget-object v4, v1, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    iget v5, v1, Ll/ۙ۬ᩴ;->ܽ:I

    iget v6, v1, Ll/ۙ۬ᩴ;->ۧ:I

    if-eqz v4, :cond_2

    move-object v1, v4

    goto :goto_1

    .line 77
    :cond_2
    iget v4, v0, Ll/ۙ۬ᩴ;->֫:I

    iget v7, v1, Ll/ۙ۬ᩴ;->֫:I

    if-ne v4, v7, :cond_6

    iget v7, v0, Ll/ۙ۬ᩴ;->ܳ:I

    iget v8, v1, Ll/ۙ۬ᩴ;->ܳ:I

    if-ne v7, v8, :cond_6

    if-eqz v4, :cond_3

    const/4 v8, 0x2

    if-eq v4, v8, :cond_3

    const/4 v8, 0x3

    if-eq v4, v8, :cond_3

    if-ne v3, v2, :cond_6

    if-ne v6, v5, :cond_6

    .line 80
    :cond_3
    new-instance v8, Ll/ۙ۬ᩴ;

    int-to-long v9, v3

    int-to-long v11, v6

    add-long/2addr v9, v11

    long-to-int v3, v9

    int-to-long v11, v3

    cmp-long v6, v9, v11

    if-nez v6, :cond_5

    int-to-long v9, v2

    int-to-long v5, v5

    add-long/2addr v9, v5

    long-to-int v2, v9

    int-to-long v5, v2

    cmp-long v11, v9, v5

    if-nez v11, :cond_4

    .line 81
    invoke-direct {v8, v4, v7, v3, v2}, Ll/ۙ۬ᩴ;-><init>(IIII)V

    .line 82
    iget-wide v2, p0, Ll/ۙ۬ᩴ;->᩻:J

    iget-wide v4, v0, Ll/ۙ۬ᩴ;->᩻:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x0

    invoke-static {p0, v4, v5, v2, v3}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;JJ)Ll/ۙ۬ᩴ;

    move-result-object p0

    invoke-static {p0, v8}, Ll/ۙ۬ᩴ;->ۤ(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;

    move-result-object p0

    iget-wide v0, v1, Ll/ۙ۬ᩴ;->᩻:J

    iget-wide v2, p1, Ll/ۙ۬ᩴ;->᩻:J

    invoke-static {p1, v0, v1, v2, v3}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;JJ)Ll/ۙ۬ᩴ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ۙ۬ᩴ;->ۤ(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;

    move-result-object p0

    return-object p0

    .line 0
    :cond_4
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0

    .line 84
    :cond_6
    invoke-static {p0, p1}, Ll/ۙ۬ᩴ;->ۤ(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;

    move-result-object p0

    return-object p0

    .line 73
    :cond_7
    :goto_2
    invoke-static {p0, p1}, Ll/ۙ۬ᩴ;->ۤ(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۙ(IZ)I
    .locals 4

    if-ltz p1, :cond_4

    if-eqz p2, :cond_0

    .line 200
    iget v0, p0, Ll/ۙ۬ᩴ;->ᩴ:I

    goto :goto_0

    :cond_0
    iget v0, p0, Ll/ۙ۬ᩴ;->᩸:I

    :goto_0
    if-ge p1, v0, :cond_4

    const/4 v0, 0x0

    move-object v1, p0

    .line 202
    :goto_1
    iget-object v2, v1, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    if-eqz v2, :cond_3

    if-eqz p2, :cond_1

    .line 203
    iget v3, v2, Ll/ۙ۬ᩴ;->ᩴ:I

    goto :goto_2

    :cond_1
    iget v3, v2, Ll/ۙ۬ᩴ;->᩸:I

    :goto_2
    if-ge p1, v3, :cond_2

    move-object v1, v2

    goto :goto_1

    :cond_2
    sub-int/2addr p1, v3

    .line 205
    iget v2, v2, Ll/ۙ۬ᩴ;->ۤ:I

    add-int/2addr v0, v2

    iget-object v1, v1, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    goto :goto_1

    :cond_3
    return v0

    .line 200
    :cond_4
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ۙ(JZ)I
    .locals 6

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_6

    .line 132
    iget-wide v0, p0, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v2, p1, v0

    if-gtz v2, :cond_6

    cmp-long v2, p1, v0

    if-nez v2, :cond_1

    if-eqz p3, :cond_0

    .line 133
    iget p1, p0, Ll/ۙ۬ᩴ;->ۧ:I

    return p1

    :cond_0
    iget p1, p0, Ll/ۙ۬ᩴ;->ܽ:I

    return p1

    :cond_1
    const/4 v0, 0x0

    move-object v1, p0

    .line 135
    :goto_0
    iget-object v2, v1, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    if-eqz v2, :cond_4

    .line 136
    iget-wide v3, v2, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v5, p1, v3

    if-gez v5, :cond_2

    move-object v1, v2

    goto :goto_0

    :cond_2
    sub-long/2addr p1, v3

    if-eqz p3, :cond_3

    .line 137
    iget v2, v2, Ll/ۙ۬ᩴ;->ۧ:I

    goto :goto_1

    :cond_3
    iget v2, v2, Ll/ۙ۬ᩴ;->ܽ:I

    :goto_1
    add-int/2addr v0, v2

    iget-object v1, v1, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    goto :goto_0

    :cond_4
    if-eqz p3, :cond_5

    .line 139
    iget p3, v1, Ll/ۙ۬ᩴ;->ۧ:I

    goto :goto_2

    :cond_5
    iget p3, v1, Ll/ۙ۬ᩴ;->ܽ:I

    :goto_2
    int-to-long v1, p3

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    add-int/2addr v0, p2

    return v0

    .line 132
    :cond_6
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ۙ(JZZ)I
    .locals 7

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    cmp-long v3, p1, v0

    if-gez v3, :cond_0

    return v2

    .line 215
    :cond_0
    iget-wide v0, p0, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v3, p1, v0

    if-ltz v3, :cond_2

    if-eqz p4, :cond_1

    iget p1, p0, Ll/ۙ۬ᩴ;->ᩴ:I

    return p1

    :cond_1
    iget p1, p0, Ll/ۙ۬ᩴ;->᩸:I

    return p1

    :cond_2
    const/4 v0, 0x0

    move-object v1, p0

    .line 217
    :goto_0
    iget-object v3, v1, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    if-eqz v3, :cond_5

    .line 218
    iget-wide v4, v3, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v6, p1, v4

    if-gez v6, :cond_3

    move-object v1, v3

    goto :goto_0

    :cond_3
    sub-long/2addr p1, v4

    if-eqz p4, :cond_4

    .line 219
    iget v3, v3, Ll/ۙ۬ᩴ;->ᩴ:I

    goto :goto_1

    :cond_4
    iget v3, v3, Ll/ۙ۬ᩴ;->᩸:I

    :goto_1
    add-int/2addr v0, v3

    iget-object v1, v1, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    goto :goto_0

    :cond_5
    if-eqz p4, :cond_6

    .line 221
    iget p4, v1, Ll/ۙ۬ᩴ;->ᩴ:I

    goto :goto_2

    :cond_6
    iget p4, v1, Ll/ۙ۬ᩴ;->᩸:I

    :goto_2
    if-eqz p4, :cond_8

    if-nez p3, :cond_7

    iget-wide p3, v1, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v1, p1, p3

    if-ltz v1, :cond_8

    :cond_7
    const/4 v2, 0x1

    :cond_8
    add-int/2addr v0, v2

    return v0
.end method

.method public final ۙ(J)J
    .locals 8

    .line 100
    iget-boolean v0, p0, Ll/ۙ۬ᩴ;->ܺ:Z

    const-wide/16 v1, -0x1

    if-eqz v0, :cond_4

    iget-wide v3, p0, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v0, p1, v3

    if-ltz v0, :cond_0

    goto :goto_0

    .line 101
    :cond_0
    iget-object v0, p0, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    const-wide/16 v3, 0x0

    if-nez v0, :cond_1

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1

    .line 102
    :cond_1
    iget-wide v5, v0, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v7, p1, v5

    if-gez v7, :cond_2

    .line 103
    invoke-virtual {v0, p1, p2}, Ll/ۙ۬ᩴ;->ۙ(J)J

    move-result-wide v5

    cmp-long v7, v5, v3

    if-ltz v7, :cond_2

    return-wide v5

    .line 106
    :cond_2
    iget-wide v5, v0, Ll/ۙ۬ᩴ;->᩻:J

    sub-long/2addr p1, v5

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iget-object v5, p0, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    invoke-virtual {v5, p1, p2}, Ll/ۙ۬ᩴ;->ۙ(J)J

    move-result-wide p1

    cmp-long v5, p1, v3

    if-gez v5, :cond_3

    return-wide v1

    .line 107
    :cond_3
    iget-wide v0, v0, Ll/ۙ۬ᩴ;->᩻:J

    add-long/2addr v0, p1

    return-wide v0

    :cond_4
    :goto_0
    return-wide v1
.end method

.method public final ᩷(IZ)J
    .locals 5

    if-eqz p2, :cond_0

    .line 252
    iget v0, p0, Ll/ۙ۬ᩴ;->ۧ:I

    goto :goto_0

    :cond_0
    iget v0, p0, Ll/ۙ۬ᩴ;->ܽ:I

    :goto_0
    if-lt p1, v0, :cond_1

    iget-wide p1, p0, Ll/ۙ۬ᩴ;->᩻:J

    return-wide p1

    :cond_1
    const-wide/16 v0, 0x0

    if-gez p1, :cond_2

    return-wide v0

    :cond_2
    move-object v2, p0

    .line 255
    :goto_1
    iget-object v3, v2, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    if-eqz v3, :cond_5

    if-eqz p2, :cond_3

    .line 256
    iget v4, v3, Ll/ۙ۬ᩴ;->ۧ:I

    goto :goto_2

    :cond_3
    iget v4, v3, Ll/ۙ۬ᩴ;->ܽ:I

    :goto_2
    if-ge p1, v4, :cond_4

    move-object v2, v3

    goto :goto_1

    :cond_4
    sub-int/2addr p1, v4

    .line 258
    iget-wide v3, v3, Ll/ۙ۬ᩴ;->᩻:J

    add-long/2addr v0, v3

    iget-object v2, v2, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    goto :goto_1

    :cond_5
    int-to-long p1, p1

    add-long/2addr v0, p1

    return-wide v0
.end method

.method public final ᩷(J)J
    .locals 8

    .line 120
    iget-boolean v0, p0, Ll/ۙ۬ᩴ;->ۙ:Z

    const-wide/16 v1, -0x1

    if-nez v0, :cond_4

    iget-wide v3, p0, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v0, p1, v3

    if-ltz v0, :cond_0

    goto :goto_0

    .line 121
    :cond_0
    iget-object v0, p0, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    const-wide/16 v3, 0x0

    if-nez v0, :cond_1

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1

    .line 122
    :cond_1
    iget-wide v5, v0, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v7, p1, v5

    if-gez v7, :cond_2

    .line 123
    invoke-virtual {v0, p1, p2}, Ll/ۙ۬ᩴ;->᩷(J)J

    move-result-wide v5

    cmp-long v7, v5, v3

    if-ltz v7, :cond_2

    return-wide v5

    .line 126
    :cond_2
    iget-wide v5, v0, Ll/ۙ۬ᩴ;->᩻:J

    sub-long/2addr p1, v5

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iget-object v5, p0, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    invoke-virtual {v5, p1, p2}, Ll/ۙ۬ᩴ;->᩷(J)J

    move-result-wide p1

    cmp-long v5, p1, v3

    if-gez v5, :cond_3

    return-wide v1

    .line 127
    :cond_3
    iget-wide v0, v0, Ll/ۙ۬ᩴ;->᩻:J

    add-long/2addr v0, p1

    return-wide v0

    :cond_4
    :goto_0
    return-wide v1
.end method

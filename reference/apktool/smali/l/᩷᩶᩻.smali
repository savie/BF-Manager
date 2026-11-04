.class public final synthetic Ll/᩷᩶᩻;
.super Ljava/lang/Object;
.source "Y169"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ܶ᩸֫;
.implements Ll/ۜۖۧ;
.implements Ll/ۚۙܽ;
.implements Ll/᩵ۜۛ;


# direct methods
.method public static ۙ(ILjava/lang/String;)C
    .locals 1

    .line 0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, p0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۙ(Landroid/system/StructStat;)Landroid/system/StructTimespec;
    .locals 0

    .line 0
    iget-object p0, p0, Landroid/system/StructStat;->st_mtim:Landroid/system/StructTimespec;

    return-object p0
.end method

.method public static synthetic ۙ(J)Ljava/lang/String;
    .locals 7

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-nez v2, :cond_0

    const-string p0, "0"

    return-object p0

    :cond_0
    const/16 v3, 0x10

    if-lez v2, :cond_1

    .line 0
    invoke-static {p0, p1, v3}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 v2, 0x40

    new-array v4, v2, [C

    invoke-static {v3}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v5

    :cond_2
    add-int/lit8 v2, v2, -0x1

    long-to-int v6, p0

    and-int/lit8 v6, v6, 0xf

    invoke-static {v6, v3}, Ljava/lang/Character;->forDigit(II)C

    move-result v6

    aput-char v6, v4, v2

    ushr-long/2addr p0, v5

    cmp-long v6, p0, v0

    if-nez v6, :cond_2

    new-instance p0, Ljava/lang/String;

    rsub-int/lit8 p1, v2, 0x40

    invoke-direct {p0, v4, v2, p1}, Ljava/lang/String;-><init>([CII)V

    return-object p0
.end method

.method public static bridge synthetic ۙ()Ljava/security/cert/PKIXRevocationChecker$Option;
    .locals 1

    .line 0
    sget-object v0, Ljava/security/cert/PKIXRevocationChecker$Option;->NO_FALLBACK:Ljava/security/cert/PKIXRevocationChecker$Option;

    return-object v0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 4
    invoke-static {p0}, Ll/֫ۨۙ;->᩸(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public apply(Ll/ᩴۜۛ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p1, p2, p3}, Ll/ܶۜۛ;->ۙ(Ll/ᩴۜۛ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 699
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ۙ(Ll/᩻᩺ۙ;)Ljava/lang/String;
    .locals 1

    .line 876
    iget-object p1, p1, Ll/᩻᩺ۙ;->ᩴ:Ljava/lang/String;

    if-eqz p1, :cond_0

    return-object p1

    .line 877
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "HLS thumbnail cache key is missing"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۙ(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 0

    .line 0
    check-cast p1, Ll/ۧ᩶᩻;

    invoke-static {p1}, Ll/ۧ᩶᩻;->ۙ(Ll/ۧ᩶᩻;)V

    return-void
.end method

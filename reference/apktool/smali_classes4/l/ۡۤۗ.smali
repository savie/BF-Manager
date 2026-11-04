.class public final Ll/ۡۤۗ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/֨ܳۗ;
.implements Ll/֫۫ۗ;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final synthetic c:I = 0x0

.field public static final serialVersionUID:J = 0x1fbfbc5d57d80062L


# instance fields
.field public final a:Ll/ᩳۤۗ;

.field public final b:Ll/ۤ᩸ۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 138
    sget-object v0, Ll/ᩳۤۗ;->c:Ll/ᩳۤۗ;

    sget-object v1, Ll/ۤ᩸ۗ;->h:Ll/ۤ᩸ۗ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1766
    invoke-static {v0, v1}, Ll/ۡۤۗ;->of(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)Ll/ۡۤۗ;

    .line 146
    sget-object v0, Ll/ᩳۤۗ;->d:Ll/ᩳۤۗ;

    sget-object v1, Ll/ۤ᩸ۗ;->g:Ll/ۤ᩸ۗ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1766
    invoke-static {v0, v1}, Ll/ۡۤۗ;->of(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)Ll/ۡۤۗ;

    return-void
.end method

.method public constructor <init>(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)V
    .locals 1

    .line 412
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "dateTime"

    .line 413
    invoke-static {p1, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۤۗ;

    iput-object p1, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    const-string p1, "offset"

    .line 414
    invoke-static {p2, p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ᩸ۗ;

    iput-object p1, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    return-void
.end method

.method public static R(Ll/ۡܳۗ;)Ll/ۡۤۗ;
    .locals 5

    .line 355
    instance-of v0, p0, Ll/ۡۤۗ;

    if-eqz v0, :cond_0

    .line 356
    check-cast p0, Ll/ۡۤۗ;

    return-object p0

    .line 359
    :cond_0
    :try_start_0
    invoke-static {p0}, Ll/ۤ᩸ۗ;->X(Ll/ۡܳۗ;)Ll/ۤ᩸ۗ;

    move-result-object v0

    .line 360
    sget-object v1, Ll/ܽ۫ۗ;->f:Ll/ܰۜ᩹;

    invoke-interface {p0, v1}, Ll/ۡܳۗ;->P(Ll/ܰۜ᩹;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۤۗ;

    .line 361
    sget-object v2, Ll/ܽ۫ۗ;->g:Ll/ܰۜ᩹;

    invoke-interface {p0, v2}, Ll/ۡܳۗ;->P(Ll/ܰۜ᩹;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢۤۗ;

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    .line 262
    invoke-static {v1, v2}, Ll/ᩳۤۗ;->of(Ll/۟ۤۗ;Ll/ۢۤۗ;)Ll/ᩳۤۗ;

    move-result-object v1

    .line 263
    new-instance v2, Ll/ۡۤۗ;

    invoke-direct {v2, v1, v0}, Ll/ۡۤۗ;-><init>(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)V

    return-object v2

    .line 365
    :cond_1
    invoke-static {p0}, Ll/֡ۤۗ;->S(Ll/ۡܳۗ;)Ll/֡ۤۗ;

    move-result-object v1

    .line 366
    invoke-static {v1, v0}, Ll/ۡۤۗ;->S(Ll/֡ۤۗ;Ll/᩷᩸ۗ;)Ll/ۡۤۗ;

    move-result-object p0
    :try_end_0
    .catch Ll/᩶ۤۗ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 369
    new-instance v1, Ll/᩶ۤۗ;

    .line 370
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unable to obtain OffsetDateTime from TemporalAccessor: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 98
    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 370
    throw v1
.end method

.method public static S(Ll/֡ۤۗ;Ll/᩷᩸ۗ;)Ll/ۡۤۗ;
    .locals 2

    const-string v0, "instant"

    .line 324
    invoke-static {p0, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "zone"

    .line 325
    invoke-static {p1, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 326
    invoke-virtual {p1}, Ll/᩷᩸ۗ;->S()Ll/᩶۫ۗ;

    move-result-object p1

    .line 327
    invoke-virtual {p1, p0}, Ll/᩶۫ۗ;->d(Ll/֡ۤۗ;)Ll/ۤ᩸ۗ;

    move-result-object p1

    .line 328
    invoke-virtual {p0}, Ll/֡ۤۗ;->getEpochSecond()J

    move-result-wide v0

    invoke-virtual {p0}, Ll/֡ۤۗ;->getNano()I

    move-result p0

    invoke-static {v0, v1, p0, p1}, Ll/ᩳۤۗ;->U(JILl/ۤ᩸ۗ;)Ll/ᩳۤۗ;

    move-result-object p0

    .line 329
    new-instance v0, Ll/ۡۤۗ;

    invoke-direct {v0, p0, p1}, Ll/ۡۤۗ;-><init>(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)V

    return-object v0
.end method

.method public static of(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)Ll/ۡۤۗ;
    .locals 1

    .line 276
    new-instance v0, Ll/ۡۤۗ;

    invoke-direct {v0, p0, p1}, Ll/ۡۤۗ;-><init>(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)V

    return-object v0
.end method

.method public static parse(Ljava/lang/CharSequence;)Ll/ۡۤۗ;
    .locals 6

    .line 387
    sget-object v0, Ll/᩹ᩴۗ;->g:Ll/᩹ᩴۗ;

    const-string v1, "formatter"

    .line 401
    invoke-static {v0, v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 402
    new-instance v1, Ll/ܰۜ᩹;

    const/4 v2, 0x1

    .line 0
    invoke-direct {v1, v2}, Ll/ܰۜ᩹;-><init>(I)V

    .line 402
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "text"

    .line 1898
    invoke-static {p0, v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v2, "query"

    .line 1899
    invoke-static {v1, v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1901
    :try_start_0
    invoke-virtual {v0, p0}, Ll/᩹ᩴۗ;->a(Ljava/lang/CharSequence;)Ll/ܰᩴۗ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ܰᩴۗ;->P(Ll/ܰۜ᩹;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ll/ܺܳۗ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 402
    check-cast p0, Ll/ۡۤۗ;

    return-object p0

    :catch_0
    move-exception v0

    .line 1965
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/16 v2, 0x40

    if-le v1, v2, :cond_0

    const/4 v1, 0x0

    .line 1966
    invoke-interface {p0, v1, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "..."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 1968
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1970
    :goto_0
    new-instance v2, Ll/ܺܳۗ;

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Text \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' could not be parsed: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 98
    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 1905
    throw v2

    :catch_1
    move-exception p0

    .line 1903
    throw p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1939
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1929
    new-instance v0, Ll/᩶ܳۗ;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p0}, Ll/᩶ܳۗ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final C(Ll/ܺ۫ۗ;)J
    .locals 2

    .line 634
    instance-of v0, p1, Ll/۠ܳۗ;

    if-eqz v0, :cond_2

    .line 635
    sget-object v0, Ll/ۘܳۗ;->a:[I

    move-object v1, p1

    check-cast v1, Ll/۠ܳۗ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 639
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v0, p1}, Ll/ᩳۤۗ;->C(Ll/ܺ۫ۗ;)J

    move-result-wide v0

    return-wide v0

    .line 637
    :cond_0
    invoke-virtual {p0}, Ll/ۡۤۗ;->getOffset()Ll/ۤ᩸ۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤ᩸ۗ;->getTotalSeconds()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    .line 1774
    :cond_1
    iget-object p1, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    iget-object v0, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-static {p1, v0}, Ll/֫ۜ᩹;->j(Ll/ۨ᩸ۗ;Ll/ۤ᩸ۗ;)J

    move-result-wide v0

    return-wide v0

    .line 641
    :cond_2
    invoke-interface {p1, p0}, Ll/ܺ۫ۗ;->z(Ll/ۡܳۗ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final P(Ll/ܰۜ᩹;)Ljava/lang/Object;
    .locals 1

    .line 1545
    sget-object v0, Ll/ܽ۫ۗ;->d:Ll/ܰۜ᩹;

    if-eq p1, v0, :cond_6

    sget-object v0, Ll/ܽ۫ۗ;->e:Ll/ܰۜ᩹;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 1547
    :cond_0
    sget-object v0, Ll/ܽ۫ۗ;->a:Ll/ܰۜ᩹;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 1549
    :cond_1
    sget-object v0, Ll/ܽ۫ۗ;->f:Ll/ܰۜ᩹;

    if-ne p1, v0, :cond_2

    .line 728
    iget-object p1, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {p1}, Ll/ᩳۤۗ;->toLocalDate()Ll/۟ۤۗ;

    move-result-object p1

    return-object p1

    .line 1551
    :cond_2
    sget-object v0, Ll/ܽ۫ۗ;->g:Ll/ܰۜ᩹;

    if-ne p1, v0, :cond_3

    .line 823
    iget-object p1, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {p1}, Ll/ᩳۤۗ;->toLocalTime()Ll/ۢۤۗ;

    move-result-object p1

    return-object p1

    .line 1553
    :cond_3
    sget-object v0, Ll/ܽ۫ۗ;->b:Ll/ܰۜ᩹;

    if-ne p1, v0, :cond_4

    .line 1554
    sget-object p1, Ll/ᩴᩴۗ;->c:Ll/ᩴᩴۗ;

    return-object p1

    .line 1555
    :cond_4
    sget-object v0, Ll/ܽ۫ۗ;->c:Ll/ܰۜ᩹;

    if-ne p1, v0, :cond_5

    .line 1556
    sget-object p1, Ll/ۢܳۗ;->NANOS:Ll/ۢܳۗ;

    return-object p1

    .line 1560
    :cond_5
    invoke-virtual {p1, p0}, Ll/ܰۜ᩹;->g(Ll/ۡܳۗ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1546
    :cond_6
    :goto_0
    invoke-virtual {p0}, Ll/ۡۤۗ;->getOffset()Ll/ۤ᩸ۗ;

    move-result-object p1

    return-object p1
.end method

.method public final T(JLl/ۖܳۗ;)Ll/ۡۤۗ;
    .locals 1

    .line 1189
    instance-of v0, p3, Ll/ۢܳۗ;

    if-eqz v0, :cond_0

    .line 1190
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ᩳۤۗ;->V(JLl/ۖܳۗ;)Ll/ᩳۤۗ;

    move-result-object p1

    iget-object p2, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    invoke-virtual {p0, p1, p2}, Ll/ۡۤۗ;->U(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)Ll/ۡۤۗ;

    move-result-object p1

    return-object p1

    .line 1192
    :cond_0
    invoke-interface {p3, p0, p1, p2}, Ll/ۖܳۗ;->j(Ll/֨ܳۗ;J)Ll/֨ܳۗ;

    move-result-object p1

    check-cast p1, Ll/ۡۤۗ;

    return-object p1
.end method

.method public final U(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)Ll/ۡۤۗ;
    .locals 1

    .line 424
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    invoke-virtual {v0, p2}, Ll/ۤ᩸ۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 427
    :cond_0
    new-instance v0, Ll/ۡۤۗ;

    invoke-direct {v0, p1, p2}, Ll/ۡۤۗ;-><init>(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)V

    return-object v0
.end method

.method public final b(JLl/ܺ۫ۗ;)Ll/֨ܳۗ;
    .locals 3

    .line 968
    instance-of v0, p3, Ll/۠ܳۗ;

    if-eqz v0, :cond_2

    .line 969
    move-object v0, p3

    check-cast v0, Ll/۠ܳۗ;

    .line 970
    sget-object v1, Ll/ۘܳۗ;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    .line 976
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ᩳۤۗ;->Y(JLl/ܺ۫ۗ;)Ll/ᩳۤۗ;

    move-result-object p1

    iget-object p2, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    invoke-virtual {p0, p1, p2}, Ll/ۡۤۗ;->U(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)Ll/ۡۤۗ;

    move-result-object p1

    return-object p1

    .line 973
    :cond_0
    iget-object p3, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    .line 669
    iget-object v1, v0, Ll/۠ܳۗ;->b:Ll/᩹۫ۗ;

    .line 732
    invoke-virtual {v1, p1, p2, v0}, Ll/᩹۫ۗ;->a(JLl/ܺ۫ۗ;)I

    move-result p1

    .line 973
    invoke-static {p1}, Ll/ۤ᩸ۗ;->ofTotalSeconds(I)Ll/ۤ᩸ۗ;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Ll/ۡۤۗ;->U(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)Ll/ۡۤۗ;

    move-result-object p1

    return-object p1

    .line 971
    :cond_1
    invoke-virtual {p0}, Ll/ۡۤۗ;->getNano()I

    move-result p3

    int-to-long v0, p3

    invoke-static {p1, p2, v0, v1}, Ll/֡ۤۗ;->ofEpochSecond(JJ)Ll/֡ۤۗ;

    move-result-object p1

    iget-object p2, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    invoke-static {p1, p2}, Ll/ۡۤۗ;->S(Ll/֡ۤۗ;Ll/᩷᩸ۗ;)Ll/ۡۤۗ;

    move-result-object p1

    return-object p1

    .line 978
    :cond_2
    invoke-interface {p3, p0, p1, p2}, Ll/ܺ۫ۗ;->C(Ll/֨ܳۗ;J)Ll/֨ܳۗ;

    move-result-object p1

    check-cast p1, Ll/ۡۤۗ;

    return-object p1
.end method

.method public final bridge synthetic c(JLl/ۖܳۗ;)Ll/֨ܳۗ;
    .locals 0

    .line 128
    invoke-virtual {p0, p1, p2, p3}, Ll/ۡۤۗ;->T(JLl/ۖܳۗ;)Ll/ۡۤۗ;

    move-result-object p1

    return-object p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 128
    check-cast p1, Ll/ۡۤۗ;

    .line 174
    invoke-virtual {p0}, Ll/ۡۤۗ;->getOffset()Ll/ۤ᩸ۗ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۡۤۗ;->getOffset()Ll/ۤ᩸ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤ᩸ۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    invoke-virtual {p0}, Ll/ۡۤۗ;->toLocalDateTime()Ll/ᩳۤۗ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۡۤۗ;->toLocalDateTime()Ll/ᩳۤۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩳۤۗ;->H(Ll/ۨ᩸ۗ;)I

    move-result v0

    goto :goto_0

    .line 1774
    :cond_0
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    iget-object v1, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-static {v0, v1}, Ll/֫ۜ᩹;->j(Ll/ۨ᩸ۗ;Ll/ۤ᩸ۗ;)J

    move-result-wide v0

    .line 1774
    iget-object v2, p1, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    iget-object v3, p1, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-static {v2, v3}, Ll/֫ۜ᩹;->j(Ll/ۨ᩸ۗ;Ll/ۤ᩸ۗ;)J

    move-result-wide v2

    .line 177
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-nez v0, :cond_1

    .line 823
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v0}, Ll/ᩳۤۗ;->toLocalTime()Ll/ۢۤۗ;

    move-result-object v0

    .line 179
    invoke-virtual {v0}, Ll/ۢۤۗ;->getNano()I

    move-result v0

    .line 823
    iget-object v1, p1, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v1}, Ll/ᩳۤۗ;->toLocalTime()Ll/ۢۤۗ;

    move-result-object v1

    .line 179
    invoke-virtual {v1}, Ll/ۢۤۗ;->getNano()I

    move-result v1

    sub-int/2addr v0, v1

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 1805
    invoke-virtual {p0}, Ll/ۡۤۗ;->toLocalDateTime()Ll/ᩳۤۗ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۡۤۗ;->toLocalDateTime()Ll/ᩳۤۗ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ᩳۤۗ;->H(Ll/ۨ᩸ۗ;)I

    move-result p1

    return p1

    :cond_2
    return v0
.end method

.method public final d(Ll/ܺ۫ۗ;)Z
    .locals 1

    .line 485
    instance-of v0, p1, Ll/۠ܳۗ;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1, p0}, Ll/ܺ۫ۗ;->i(Ll/ۡܳۗ;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1876
    :cond_0
    instance-of v1, p1, Ll/ۡۤۗ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 1877
    check-cast p1, Ll/ۡۤۗ;

    .line 1878
    iget-object v1, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    iget-object v3, p1, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v1, v3}, Ll/ᩳۤۗ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    iget-object p1, p1, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    invoke-virtual {v1, p1}, Ll/ۤ᩸ۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Ll/֨ܳۗ;Ll/ۖܳۗ;)J
    .locals 3

    .line 1655
    invoke-static {p1}, Ll/ۡۤۗ;->R(Ll/ۡܳۗ;)Ll/ۡۤۗ;

    move-result-object p1

    .line 1656
    instance-of v0, p2, Ll/ۢܳۗ;

    if-eqz v0, :cond_1

    .line 1657
    iget-object v0, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    .line 697
    iget-object v1, p1, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    invoke-virtual {v0, v1}, Ll/ۤ᩸ۗ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 700
    :cond_0
    invoke-virtual {v0}, Ll/ۤ᩸ۗ;->getTotalSeconds()I

    move-result v1

    iget-object v2, p1, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    invoke-virtual {v2}, Ll/ۤ᩸ۗ;->getTotalSeconds()I

    move-result v2

    sub-int/2addr v1, v2

    .line 701
    iget-object p1, p1, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    int-to-long v1, v1

    invoke-virtual {p1, v1, v2}, Ll/ᩳۤۗ;->W(J)Ll/ᩳۤۗ;

    move-result-object p1

    .line 702
    new-instance v1, Ll/ۡۤۗ;

    invoke-direct {v1, p1, v0}, Ll/ۡۤۗ;-><init>(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)V

    move-object p1, v1

    .line 1658
    :goto_0
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    iget-object p1, p1, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v0, p1, p2}, Ll/ᩳۤۗ;->f(Ll/֨ܳۗ;Ll/ۖܳۗ;)J

    move-result-wide p1

    return-wide p1

    .line 1660
    :cond_1
    invoke-interface {p2, p0, p1}, Ll/ۖܳۗ;->i(Ll/֨ܳۗ;Ll/֨ܳۗ;)J

    move-result-wide p1

    return-wide p1
.end method

.method public getNano()I
    .locals 1

    .line 859
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    .line 868
    iget-object v0, v0, Ll/ᩳۤۗ;->b:Ll/ۢۤۗ;

    invoke-virtual {v0}, Ll/ۢۤۗ;->getNano()I

    move-result v0

    return v0
.end method

.method public getOffset()Ll/ۤ᩸ۗ;
    .locals 1

    .line 653
    iget-object v0, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1890
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v0}, Ll/ᩳۤۗ;->hashCode()I

    move-result v0

    iget-object v1, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    .line 736
    iget v1, v1, Ll/ۤ᩸ۗ;->b:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(Ll/ܺ۫ۗ;)I
    .locals 2

    .line 597
    instance-of v0, p1, Ll/۠ܳۗ;

    if-eqz v0, :cond_2

    .line 598
    sget-object v0, Ll/ۘܳۗ;->a:[I

    move-object v1, p1

    check-cast v1, Ll/۠ܳۗ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 604
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v0, p1}, Ll/ᩳۤۗ;->i(Ll/ܺ۫ۗ;)I

    move-result p1

    return p1

    .line 602
    :cond_0
    invoke-virtual {p0}, Ll/ۡۤۗ;->getOffset()Ll/ۤ᩸ۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤ᩸ۗ;->getTotalSeconds()I

    move-result p1

    return p1

    .line 600
    :cond_1
    new-instance p1, Ll/ܶ۫ۗ;

    const-string v0, "Invalid field \'InstantSeconds\' for get() method, use getLong() instead"

    .line 88
    invoke-direct {p1, v0}, Ll/᩶ۤۗ;-><init>(Ljava/lang/String;)V

    .line 600
    throw p1

    .line 606
    :cond_2
    invoke-static {p0, p1}, Ll/ܽ۫ۗ;->a(Ll/ۡܳۗ;Ll/ܺ۫ۗ;)I

    move-result p1

    return p1
.end method

.method public final j(Ll/۟ۤۗ;)Ll/֨ܳۗ;
    .locals 2

    .line 911
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    .line 920
    iget-object v1, v0, Ll/ᩳۤۗ;->b:Ll/ۢۤۗ;

    invoke-virtual {v0, p1, v1}, Ll/ᩳۤۗ;->Z(Ll/۟ۤۗ;Ll/ۢۤۗ;)Ll/ᩳۤۗ;

    move-result-object p1

    .line 911
    iget-object v0, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    invoke-virtual {p0, p1, v0}, Ll/ۡۤۗ;->U(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)Ll/ۡۤۗ;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ll/ܺ۫ۗ;)Ll/᩹۫ۗ;
    .locals 1

    .line 558
    instance-of v0, p1, Ll/۠ܳۗ;

    if-eqz v0, :cond_2

    .line 559
    sget-object v0, Ll/۠ܳۗ;->INSTANT_SECONDS:Ll/۠ܳۗ;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/۠ܳۗ;->OFFSET_SECONDS:Ll/۠ܳۗ;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 562
    :cond_0
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v0, p1}, Ll/ᩳۤۗ;->k(Ll/ܺ۫ۗ;)Ll/᩹۫ۗ;

    move-result-object p1

    return-object p1

    .line 560
    :cond_1
    :goto_0
    check-cast p1, Ll/۠ܳۗ;

    .line 669
    iget-object p1, p1, Ll/۠ܳۗ;->b:Ll/᩹۫ۗ;

    return-object p1

    .line 564
    :cond_2
    invoke-interface {p1, p0}, Ll/ܺ۫ۗ;->j(Ll/ۡܳۗ;)Ll/᩹۫ۗ;

    move-result-object p1

    return-object p1
.end method

.method public final p(Ll/֨ܳۗ;)Ll/֨ܳۗ;
    .locals 3

    .line 1595
    sget-object v0, Ll/۠ܳۗ;->EPOCH_DAY:Ll/۠ܳۗ;

    .line 728
    iget-object v1, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v1}, Ll/ᩳۤۗ;->toLocalDate()Ll/۟ۤۗ;

    move-result-object v1

    .line 1596
    invoke-virtual {v1}, Ll/۟ۤۗ;->D()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ll/֨ܳۗ;->b(JLl/ܺ۫ۗ;)Ll/֨ܳۗ;

    move-result-object p1

    sget-object v0, Ll/۠ܳۗ;->NANO_OF_DAY:Ll/۠ܳۗ;

    .line 823
    iget-object v1, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v1}, Ll/ᩳۤۗ;->toLocalTime()Ll/ۢۤۗ;

    move-result-object v1

    .line 1597
    invoke-virtual {v1}, Ll/ۢۤۗ;->c0()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ll/֨ܳۗ;->b(JLl/ܺ۫ۗ;)Ll/֨ܳۗ;

    move-result-object p1

    sget-object v0, Ll/۠ܳۗ;->OFFSET_SECONDS:Ll/۠ܳۗ;

    .line 1598
    invoke-virtual {p0}, Ll/ۡۤۗ;->getOffset()Ll/ۤ᩸ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۤ᩸ۗ;->getTotalSeconds()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Ll/֨ܳۗ;->b(JLl/ܺ۫ۗ;)Ll/֨ܳۗ;

    move-result-object p1

    return-object p1
.end method

.method public toInstant()Ll/֡ۤۗ;
    .locals 2

    .line 1761
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    iget-object v1, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-static {v0, v1}, Ll/֫ۜ᩹;->l(Ll/ۨ᩸ۗ;Ll/ۤ᩸ۗ;)Ll/֡ۤۗ;

    move-result-object v0

    return-object v0
.end method

.method public toLocalDateTime()Ll/ᩳۤۗ;
    .locals 1

    .line 715
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1912
    iget-object v0, p0, Ll/ۡۤۗ;->a:Ll/ᩳۤۗ;

    invoke-virtual {v0}, Ll/ᩳۤۗ;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۡۤۗ;->b:Ll/ۤ᩸ۗ;

    .line 747
    iget-object v1, v1, Ll/ۤ᩸ۗ;->c:Ljava/lang/String;

    .line 1912
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z(JLl/ۢܳۗ;)Ll/֨ܳۗ;
    .locals 3

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 1381
    invoke-virtual {p0, p1, p2, p3}, Ll/ۡۤۗ;->T(JLl/ۖܳۗ;)Ll/ۡۤۗ;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ll/ۡۤۗ;->T(JLl/ۖܳۗ;)Ll/ۡۤۗ;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ll/ۡۤۗ;->T(JLl/ۖܳۗ;)Ll/ۡۤۗ;

    move-result-object p1

    return-object p1
.end method

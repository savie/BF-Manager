.class public final Ll/᩸᩻᩵;
.super Ljava/lang/Object;
.source "B6FR"


# static fields
.field public static ۤ:I

.field public static final ᩷:Ll/᩻ܽ᩺;


# instance fields
.field public final ۙ:Ll/ᩴ᩻᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 23
    const-class v0, Ll/᩸᩻᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/᩸᩻᩵;->᩷:Ll/᩻ܽ᩺;

    const/4 v0, 0x1

    .line 26
    sput v0, Ll/᩸᩻᩵;->ۤ:I

    return-void
.end method

.method public constructor <init>(Ll/ᩴ᩻᩵;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/᩸᩻᩵;->ۙ:Ll/ᩴ᩻᩵;

    return-void
.end method

.method private ۙ(Ljava/lang/String;I[B)Ll/֫᩻᩵;
    .locals 5

    .line 70
    iget-object v0, p0, Ll/᩸᩻᩵;->ۙ:Ll/ᩴ᩻᩵;

    invoke-virtual {v0}, Ll/ᩴ᩻᩵;->᩷()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    add-int/lit8 v0, p2, 0x20

    add-int/lit8 v2, p2, 0x24

    .line 10
    array-length v3, p3

    if-gt v2, v3, :cond_2

    .line 13
    invoke-static {v0, p3}, Ll/ܶܿ֫;->ۙ(I[B)I

    move-result v0

    add-int v2, p2, v0

    .line 14
    array-length v3, p3

    if-gt v2, v3, :cond_1

    add-int/lit8 v2, p2, 0x8

    .line 17
    invoke-static {v2, p3}, Ll/ܶܿ֫;->ۙ(I[B)I

    move-result v2

    .line 18
    new-instance v3, Ljava/util/zip/Adler32;

    invoke-direct {v3}, Ljava/util/zip/Adler32;-><init>()V

    add-int/lit8 v4, p2, 0xc

    add-int/lit8 v0, v0, -0xc

    .line 19
    invoke-virtual {v3, p3, v4, v0}, Ljava/util/zip/Adler32;->update([BII)V

    .line 20
    invoke-virtual {v3}, Ljava/util/zip/Adler32;->getValue()J

    move-result-wide v3

    long-to-int v0, v3

    if-ne v2, v0, :cond_0

    goto :goto_0

    .line 22
    :cond_0
    new-instance p2, Ll/۬ۧ᩵;

    const-string p3, "Bad dex file checksum: 0x%08x, expected: 0x%08x, file: %s"

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    aput-object v2, v3, v1

    const/4 v0, 0x2

    aput-object p1, v3, v0

    .line 22
    invoke-static {p3, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 22
    throw p2

    .line 15
    :cond_1
    new-instance p2, Ll/۬ۧ᩵;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "Dex file truncated, length in header: "

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", file: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 15
    throw p2

    .line 11
    :cond_2
    new-instance p2, Ll/۬ۧ᩵;

    const-string p3, "Dex file truncated, can\'t read file length, file: "

    .line 0
    invoke-static {p3, p1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 73
    :cond_3
    :goto_0
    new-instance v2, Ll/֫᩻᩵;

    .line 0
    const-class v0, Ll/᩸᩻᩵;

    monitor-enter v0

    .line 95
    :try_start_0
    sget v3, Ll/᩸᩻᩵;->ۤ:I

    add-int/2addr v3, v1

    sput v3, Ll/᩸᩻᩵;->ۤ:I

    const v4, 0xffff

    if-lt v3, v4, :cond_4

    .line 97
    sput v1, Ll/᩸᩻᩵;->ۤ:I

    .line 99
    :cond_4
    sget v1, Ll/᩸᩻᩵;->ۤ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    .line 73
    invoke-direct {v2, v1, p2, p1, p3}, Ll/֫᩻᩵;-><init>(IILjava/lang/String;[B)V

    return-object v2

    :catchall_0
    move-exception p1

    .line 99
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static synthetic ۙ(Ll/᩸᩻᩵;Ljava/lang/String;[BLjava/lang/Integer;)Ll/֫᩻᩵;
    .locals 0

    .line 62
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-direct {p0, p1, p3, p2}, Ll/᩸᩻᩵;->ۙ(Ljava/lang/String;I[B)Ll/֫᩻᩵;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۙ(Ll/֫᩻᩵;)V
    .locals 2

    .line 40
    sget-object v0, Ll/᩸᩻᩵;->᩷:Ll/᩻ܽ᩺;

    const-string v1, "Loading dex: {}"

    invoke-interface {v0, p0, v1}, Ll/᩻ܽ᩺;->ᩴ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;[B)Ljava/util/List;
    .locals 5

    .line 54
    array-length v0, p2

    const/16 v1, 0x70

    if-lt v0, v1, :cond_2

    const/4 v0, 0x0

    aget-byte v2, p2, v0

    const/16 v3, 0x64

    if-ne v2, v3, :cond_2

    const/4 v2, 0x1

    aget-byte v2, p2, v2

    const/16 v3, 0x65

    if-ne v2, v3, :cond_2

    const/4 v2, 0x2

    aget-byte v2, p2, v2

    const/16 v3, 0x78

    if-ne v2, v3, :cond_2

    const/4 v2, 0x3

    aget-byte v2, p2, v2

    const/16 v4, 0xa

    if-ne v2, v4, :cond_2

    const/16 v2, 0x24

    .line 13
    invoke-static {v2, p2}, Ll/ܶܿ֫;->ۙ(I[B)I

    move-result v2

    if-ge v2, v3, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x20

    .line 17
    invoke-static {v2, p2}, Ll/ܶܿ֫;->ۙ(I[B)I

    move-result v2

    .line 18
    invoke-static {v1, p2}, Ll/ܶܿ֫;->ۙ(I[B)I

    move-result v1

    const/16 v3, 0x74

    .line 19
    invoke-static {v3, p2}, Ll/ܶܿ֫;->ۙ(I[B)I

    .line 20
    new-instance v3, Ll/ܶܺ᩵;

    invoke-direct {v3, v2, v1}, Ll/ܶܺ᩵;-><init>(II)V

    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 60
    invoke-static {p2, v1}, Ll/ܶܺ᩵;->ۙ([BLl/ܶܺ᩵;)Ljava/util/ArrayList;

    move-result-object v0

    .line 61
    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ۙ᩻᩵;

    invoke-direct {v1, p0, p1, p2}, Ll/ۙ᩻᩵;-><init>(Ll/᩸᩻᩵;Ljava/lang/String;[B)V

    .line 62
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p1

    .line 63
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    .line 65
    :cond_1
    invoke-direct {p0, p1, v0, p2}, Ll/᩸᩻᩵;->ۙ(Ljava/lang/String;I[B)Ll/֫᩻᩵;

    move-result-object p1

    .line 66
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 56
    :cond_2
    new-instance p2, Ll/۬ۧ᩵;

    const-string v0, "Invalid DEX header: "

    .line 0
    invoke-static {v0, p1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p2
.end method

.method public final ۙ(Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 35
    invoke-static {p1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v0, Ll/ۢ֡ۗ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll/ۢ֡ۗ;-><init>(I)V

    .line 36
    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v0, Ll/᩷᩻᩵;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/᩷᩻᩵;-><init>(ILjava/lang/Object;)V

    .line 37
    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v0, Ll/ܳۜۗ;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/ܳۜۗ;-><init>(I)V

    .line 38
    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v0, Ll/ۘۜۧ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۘۜۧ;-><init>(I)V

    .line 39
    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->flatMap(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v0, Ll/ۤ᩻᩵;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->peek(Ljava/util/function/Consumer;)Ll/᩵ܺۗ;

    move-result-object p1

    .line 41
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

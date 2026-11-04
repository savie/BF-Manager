.class public final Ll/ۗۛۨ;
.super Ljava/lang/Object;
.source "P4VD"


# static fields
.field public static final ᩸:[Ll/ܽۛۨ;


# instance fields
.field public ۙ:Ljava/util/LinkedList;

.field public final ۤ:Z

.field public final ᩷:Ll/ܶۛۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ll/ܽۛۨ;

    .line 76
    sput-object v0, Ll/ۗۛۨ;->᩸:[Ll/ܽۛۨ;

    return-void
.end method

.method public constructor <init>(Ll/ܶۛۨ;Ll/ۧۛۨ;)V
    .locals 0

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    iput-object p2, p0, Ll/ۗۛۨ;->ۙ:Ljava/util/LinkedList;

    .line 79
    invoke-interface {p2}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 100
    iput-object p1, p0, Ll/ۗۛۨ;->᩷:Ll/ܶۛۨ;

    const/4 p1, 0x0

    .line 101
    iput-boolean p1, p0, Ll/ۗۛۨ;->ۤ:Z

    return-void
.end method

.method public static synthetic ۙ(Ll/ۗۛۨ;Ljava/lang/String;)Ll/ܽۛۨ;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/ۗۛۨ;->᩷:Ll/ܶۛۨ;

    invoke-interface {v0, p1}, Ll/ܶۛۨ;->ۙ(Ljava/lang/String;)Ll/ܽۛۨ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 118
    iget-boolean p0, p0, Ll/ۗۛۨ;->ۤ:Z

    if-eqz p0, :cond_0

    new-instance p0, Ll/ܽۛۨ;

    invoke-direct {p0, p1}, Ll/ܽۛۨ;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final ۙ(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 4

    .line 271
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/ۗۛۨ;->ۙ:Ljava/util/LinkedList;

    .line 241
    iget-object v0, p0, Ll/ۗۛۨ;->᩷:Ll/ܶۛۨ;

    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    sget v3, Ll/ܿۗۨ;->ۙ:I

    .line 258
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v3

    if-nez p2, :cond_0

    goto :goto_0

    .line 271
    :cond_0
    invoke-static {p2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v3

    .line 241
    :goto_0
    invoke-direct {v2, p1, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 242
    :try_start_0
    invoke-interface {v0, v1}, Ll/ܶۛۨ;->ۙ(Ljava/io/BufferedReader;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_1

    .line 244
    iget-object p2, p0, Ll/ۗۛۨ;->ۙ:Ljava/util/LinkedList;

    invoke-virtual {p2, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 245
    invoke-interface {v0, v1}, Ll/ܶۛۨ;->ۙ(Ljava/io/BufferedReader;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 247
    :cond_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 273
    iget-object p1, p0, Ll/ۗۛۨ;->ۙ:Ljava/util/LinkedList;

    invoke-interface {v0, p1}, Ll/ܶۛۨ;->ۙ(Ljava/util/LinkedList;)Ljava/util/List;

    .line 281
    iget-object p1, p0, Ll/ۗۛۨ;->ۙ:Ljava/util/LinkedList;

    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    return-void

    :catchall_0
    move-exception p1

    .line 241
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final ۙ()[Ll/ܽۛۨ;
    .locals 3

    .line 116
    iget-object v0, p0, Ll/ۗۛۨ;->ۙ:Ljava/util/LinkedList;

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/᩷᩻᩵;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Ll/᩷᩻᩵;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v0

    .line 119
    new-instance v1, Ll/ܳۜۗ;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ll/ܳۜۗ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v0

    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 148
    sget-object v1, Ll/ۗۛۨ;->᩸:[Ll/ܽۛۨ;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܽۛۨ;

    return-object v0
.end method

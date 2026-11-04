.class public Ll/۬۫ܽ;
.super Ll/ۛ۫ܽ;
.source "C3A0"


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final transient ۢ:Ll/۠۫ܽ;

.field public transient ᩳ:Ll/۬۫ܽ;


# direct methods
.method public constructor <init>(Ll/ܽ۫ܽ;ILjava/util/Comparator;)V
    .locals 0

    .line 533
    invoke-direct {p0, p1, p2}, Ll/ۛ۫ܽ;-><init>(Ll/ܽ۫ܽ;I)V

    if-nez p3, :cond_0

    .line 674
    sget p1, Ll/۠۫ܽ;->ܿ:I

    .line 82
    sget-object p1, Ll/۫ۧܽ;->ۡ:Ll/۫ۧܽ;

    goto :goto_0

    .line 675
    :cond_0
    invoke-static {p3}, Ll/ۚۚܽ;->ۙ(Ljava/util/Comparator;)Ll/ۚۧܽ;

    move-result-object p1

    .line 534
    :goto_0
    iput-object p1, p0, Ll/۬۫ܽ;->ۢ:Ll/۠۫ܽ;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 10

    .line 706
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 708
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Comparator;

    .line 709
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v1

    if-ltz v1, :cond_5

    .line 713
    invoke-static {}, Ll/ܽ۫ܽ;->᩷()Ll/᩻۫ܽ;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    .line 717
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v6

    if-lez v6, :cond_3

    if-nez v0, :cond_0

    .line 681
    new-instance v7, Ll/ۡ۫ܽ;

    invoke-direct {v7}, Ll/ۡ۫ܽ;-><init>()V

    goto :goto_1

    .line 682
    :cond_0
    new-instance v7, Ll/ܳۚܽ;

    invoke-direct {v7, v0}, Ll/ܳۚܽ;-><init>(Ljava/util/Comparator;)V

    :goto_1
    const/4 v8, 0x0

    :goto_2
    if-ge v8, v6, :cond_1

    .line 725
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v9}, Ll/ۡ۫ܽ;->ۙ(Ljava/lang/Object;)Ll/ۡ۫ܽ;

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 727
    :cond_1
    invoke-virtual {v7}, Ll/ۡ۫ܽ;->ۙ()Ll/۠۫ܽ;

    move-result-object v7

    .line 728
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    move-result v8

    if-ne v8, v6, :cond_2

    .line 731
    invoke-virtual {v2, v5, v7}, Ll/᩻۫ܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩻۫ܽ;

    add-int/2addr v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 729
    :cond_2
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Duplicate key-value pairs exist for key "

    .line 0
    invoke-static {v0, v5}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 729
    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 720
    :cond_3
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Invalid value count "

    .line 0
    invoke-static {v6, v0}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 720
    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 737
    :cond_4
    :try_start_0
    invoke-virtual {v2}, Ll/᩻۫ܽ;->᩷()Ll/ܽ۫ܽ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 742
    new-instance v1, Ll/۬۫ܽ;

    invoke-direct {v1, p1, v4, v0}, Ll/۬۫ܽ;-><init>(Ll/ܽ۫ܽ;ILjava/util/Comparator;)V

    iput-object v1, p0, Ll/۬۫ܽ;->ᩳ:Ll/۬۫ܽ;

    return-void

    :catch_0
    move-exception p1

    .line 739
    new-instance v0, Ljava/io/InvalidObjectException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/io/InvalidObjectException;

    throw p1

    .line 711
    :cond_5
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Invalid key count "

    .line 0
    invoke-static {v1, v0}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 711
    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 748
    iget-object v0, p0, Ll/۬۫ܽ;->ᩳ:Ll/۬۫ܽ;

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 2

    .line 692
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 698
    iget-object v0, p0, Ll/۬۫ܽ;->ۢ:Ll/۠۫ܽ;

    instance-of v1, v0, Ll/ۚۚܽ;

    if-eqz v1, :cond_0

    .line 699
    check-cast v0, Ll/ۚۚܽ;

    .line 567
    iget-object v0, v0, Ll/ۚۚܽ;->֡:Ljava/util/Comparator;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 693
    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 694
    invoke-static {p0, p1}, Ll/᩻ۧܽ;->ۙ(Ll/᩹֫ܽ;Ljava/io/ObjectOutputStream;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 0

    .line 61
    invoke-virtual {p0, p1}, Ll/۬۫ܽ;->get(Ljava/lang/Object;)Ll/۠۫ܽ;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ll/۠۫ܽ;
    .locals 1

    .line 547
    iget-object v0, p0, Ll/ۛ۫ܽ;->֡:Ll/ܽ۫ܽ;

    invoke-virtual {v0, p1}, Ll/ܽ۫ܽ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠۫ܽ;

    .line 548
    iget-object v0, p0, Ll/۬۫ܽ;->ۢ:Ll/۠۫ܽ;

    invoke-static {p1, v0}, Ll/᩵ۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠۫ܽ;

    return-object p1
.end method

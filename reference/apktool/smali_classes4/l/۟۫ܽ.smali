.class public Ll/۟۫ܽ;
.super Ljava/lang/Object;
.source "V5XH"

# interfaces
.implements Ll/۠֫ܽ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J

.field public static final ֡:Ll/۟۫ܽ;

.field public static final synthetic ܿ:I


# instance fields
.field public final transient ܰ:Ll/֫۫ܽ;

.field public final transient ᩶:Ll/֫۫ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 53
    new-instance v0, Ll/۟۫ܽ;

    .line 54
    sget v1, Ll/֫۫ܽ;->᩶:I

    .line 89
    sget-object v1, Ll/ۙۧܽ;->ᩳ:Ll/֫۫ܽ;

    .line 54
    invoke-direct {v0, v1, v1}, Ll/۟۫ܽ;-><init>(Ll/֫۫ܽ;Ll/֫۫ܽ;)V

    sput-object v0, Ll/۟۫ܽ;->֡:Ll/۟۫ܽ;

    return-void
.end method

.method public constructor <init>(Ll/֫۫ܽ;Ll/֫۫ܽ;)V
    .locals 0

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    iput-object p1, p0, Ll/۟۫ܽ;->ܰ:Ll/֫۫ܽ;

    .line 180
    iput-object p2, p0, Ll/۟۫ܽ;->᩶:Ll/֫۫ܽ;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 445
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use SerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ۙ(Ll/۟۫ܽ;)Ll/֫۫ܽ;
    .locals 0

    .line 51
    iget-object p0, p0, Ll/۟۫ܽ;->ܰ:Ll/֫۫ܽ;

    return-object p0
.end method

.method public static ᩷()Ll/۟۫ܽ;
    .locals 1

    .line 77
    sget-object v0, Ll/۟۫ܽ;->֡:Ll/۟۫ܽ;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 396
    instance-of v0, p1, Ll/۠֫ܽ;

    if-eqz v0, :cond_0

    .line 397
    check-cast p1, Ll/۠֫ܽ;

    .line 398
    invoke-virtual {p0}, Ll/۟۫ܽ;->ۙ()Ll/ܽ۫ܽ;

    move-result-object v0

    invoke-interface {p1}, Ll/۠֫ܽ;->ۙ()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1105
    invoke-static {v0, p1}, Ll/ܶ֫ܽ;->ۙ(Ljava/util/Map;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 391
    invoke-virtual {p0}, Ll/۟۫ܽ;->ۙ()Ll/ܽ۫ܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ۫ܽ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 405
    invoke-virtual {p0}, Ll/۟۫ܽ;->ۙ()Ll/ܽ۫ܽ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1121
    invoke-static {v0}, Ll/ܶ֫ܽ;->ۙ(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 2

    .line 440
    new-instance v0, Ll/֡۫ܽ;

    invoke-virtual {p0}, Ll/۟۫ܽ;->ۙ()Ll/ܽ۫ܽ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֡۫ܽ;-><init>(Ll/ܽ۫ܽ;)V

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Integer;)Ljava/lang/Object;
    .locals 6

    .line 185
    new-instance v1, Ll/᩺۫ܽ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 310
    new-instance v2, Ll/ۗܳܽ;

    .line 315
    invoke-direct {v2, p1}, Ll/᩵ܳܽ;-><init>(Ljava/lang/Comparable;)V

    .line 189
    sget-object v4, Ll/۠ۧܽ;->᩶:Ll/۠ۧܽ;

    sget-object v5, Ll/۟ۧܽ;->֡:Ll/۟ۧܽ;

    .line 174
    sget-object v3, Ll/֡֫ܽ;->ܰ:Ll/֡֫ܽ;

    .line 226
    iget-object v0, p0, Ll/۟۫ܽ;->ܰ:Ll/֫۫ܽ;

    invoke-static/range {v0 .. v5}, Ll/ۜۧܽ;->ۙ(Ljava/util/List;Ll/ۚۙܽ;Ljava/lang/Comparable;Ljava/util/Comparator;Ll/۠ۧܽ;Ll/۟ۧܽ;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 195
    :cond_0
    iget-object v1, p0, Ll/۟۫ܽ;->ܰ:Ll/֫۫ܽ;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ֫ܽ;

    .line 196
    invoke-virtual {v1, p1}, Ll/ۖ֫ܽ;->ۙ(Ljava/lang/Comparable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/۟۫ܽ;->᩶:Ll/֫۫ܽ;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic ۙ()Ljava/util/Map;
    .locals 1

    .line 50
    invoke-virtual {p0}, Ll/۟۫ܽ;->ۙ()Ll/ܽ۫ܽ;

    move-result-object v0

    return-object v0
.end method

.method public ۙ(Ll/ۖ֫ܽ;)Ll/۟۫ܽ;
    .locals 10

    .line 314
    invoke-virtual {p1}, Ll/ۖ֫ܽ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 316
    :cond_0
    iget-object v0, p0, Ll/۟۫ܽ;->ܰ:Ll/֫۫ܽ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 219
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x0

    .line 222
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ֫ܽ;

    .line 223
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖ֫ܽ;

    .line 224
    iget-object v1, v1, Ll/ۖ֫ܽ;->ܰ:Ll/᩵ܳܽ;

    iget-object v2, v2, Ll/ۖ֫ܽ;->᩶:Ll/᩵ܳܽ;

    invoke-static {v1, v2}, Ll/ۖ֫ܽ;->ۙ(Ll/᩵ܳܽ;Ll/᩵ܳܽ;)Ll/ۖ֫ܽ;

    move-result-object v1

    .line 316
    invoke-virtual {p1, v1}, Ll/ۖ֫ܽ;->ۙ(Ll/ۖ֫ܽ;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 319
    :cond_1
    new-instance v2, Ll/ۘ۫ܽ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v3, p1, Ll/ۖ֫ܽ;->ܰ:Ll/᩵ܳܽ;

    sget-object v5, Ll/۠ۧܽ;->ܿ:Ll/۠ۧܽ;

    sget-object v7, Ll/۟ۧܽ;->ܿ:Ll/۟ۧܽ;

    .line 957
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    sget-object v8, Ll/֡֫ܽ;->ܰ:Ll/֡֫ܽ;

    move-object v1, v0

    move-object v4, v8

    move-object v6, v7

    .line 226
    invoke-static/range {v1 .. v6}, Ll/ۜۧܽ;->ۙ(Ljava/util/List;Ll/ۚۙܽ;Ljava/lang/Comparable;Ljava/util/Comparator;Ll/۠ۧܽ;Ll/۟ۧܽ;)I

    move-result v9

    .line 326
    new-instance v2, Ll/᩺۫ܽ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v3, p1, Ll/ۖ֫ܽ;->᩶:Ll/᩵ܳܽ;

    sget-object v5, Ll/۠ۧܽ;->᩶:Ll/۠ۧܽ;

    .line 957
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    invoke-static/range {v1 .. v6}, Ll/ۜۧܽ;->ۙ(Ljava/util/List;Ll/ۚۙܽ;Ljava/lang/Comparable;Ljava/util/Comparator;Ll/۠ۧܽ;Ll/۟ۧܽ;)I

    move-result v0

    if-lt v9, v0, :cond_2

    .line 315
    :goto_0
    sget-object p1, Ll/۟۫ܽ;->֡:Ll/۟۫ܽ;

    return-object p1

    :cond_2
    sub-int v1, v0, v9

    .line 338
    new-instance v2, Ll/ܰ۫ܽ;

    invoke-direct {v2, p0, v1, v9, p1}, Ll/ܰ۫ܽ;-><init>(Ll/۟۫ܽ;IILl/ۖ֫ܽ;)V

    .line 369
    new-instance v1, Ll/᩶۫ܽ;

    iget-object v3, p0, Ll/۟۫ܽ;->᩶:Ll/֫۫ܽ;

    invoke-virtual {v3, v9, v0}, Ll/֫۫ܽ;->subList(II)Ll/֫۫ܽ;

    move-result-object v0

    invoke-direct {v1, v2, v0, p1, p0}, Ll/᩶۫ܽ;-><init>(Ll/֫۫ܽ;Ll/֫۫ܽ;Ll/ۖ֫ܽ;Ll/۟۫ܽ;)V

    return-object v1

    .line 220
    :cond_3
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1

    :cond_4
    :goto_1
    return-object p0
.end method

.method public final ۙ()Ll/ܽ۫ܽ;
    .locals 4

    .line 294
    iget-object v0, p0, Ll/۟۫ܽ;->ܰ:Ll/֫۫ܽ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 125
    sget-object v0, Ll/ܳۧܽ;->۟:Ll/ܽ۫ܽ;

    return-object v0

    .line 297
    :cond_0
    new-instance v1, Ll/ۚۧܽ;

    .line 298
    sget v2, Ll/ۖ֫ܽ;->ܿ:I

    .line 129
    sget-object v2, Ll/ۡ֫ܽ;->ܰ:Ll/ᩳ֫ܽ;

    .line 298
    invoke-direct {v1, v0, v2}, Ll/ۚۧܽ;-><init>(Ll/֫۫ܽ;Ljava/util/Comparator;)V

    .line 299
    new-instance v0, Ll/ᩴۚܽ;

    iget-object v2, p0, Ll/۟۫ܽ;->᩶:Ll/֫۫ܽ;

    const/4 v3, 0x0

    .line 850
    invoke-direct {v0, v1, v2, v3}, Ll/ᩴۚܽ;-><init>(Ll/ۚۧܽ;Ll/֫۫ܽ;Ll/ᩴۚܽ;)V

    return-object v0
.end method

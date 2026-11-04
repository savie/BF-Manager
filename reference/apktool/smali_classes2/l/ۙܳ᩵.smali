.class public final Ll/ۙܳ᩵;
.super Ljava/lang/Object;
.source "VIWW"


# static fields
.field public static final ܳ:Ll/᩻ܽ᩺;


# instance fields
.field public ۙ:[Ljava/util/BitSet;

.field public ۤ:[Ljava/util/BitSet;

.field public ᩴ:[Ljava/util/BitSet;

.field public ᩷:[Ljava/util/BitSet;

.field public final ᩸:Ll/ۖۡۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 17
    const-class v0, Ll/ۙܳ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ۙܳ᩵;->ܳ:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>(Ll/ۖۡۗ;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/ۙܳ᩵;->᩸:Ll/ۖۡۗ;

    return-void
.end method

.method public static ᩷(II)[Ljava/util/BitSet;
    .locals 3

    .line 114
    new-array v0, p0, [Ljava/util/BitSet;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_0

    .line 116
    new-instance v2, Ljava/util/BitSet;

    invoke-direct {v2, p1}, Ljava/util/BitSet;-><init>(I)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final ۙ(I)Ljava/util/BitSet;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ۙܳ᩵;->ۙ:[Ljava/util/BitSet;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۙ()V
    .locals 13

    .line 31
    iget-object v0, p0, Ll/ۙܳ᩵;->᩸:Ll/ۖۡۗ;

    invoke-virtual {v0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 32
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۢۙ()I

    move-result v2

    .line 33
    invoke-static {v1, v2}, Ll/ۙܳ᩵;->᩷(II)[Ljava/util/BitSet;

    move-result-object v3

    iput-object v3, p0, Ll/ۙܳ᩵;->ᩴ:[Ljava/util/BitSet;

    .line 34
    invoke-static {v1, v2}, Ll/ۙܳ᩵;->᩷(II)[Ljava/util/BitSet;

    move-result-object v3

    iput-object v3, p0, Ll/ۙܳ᩵;->᩷:[Ljava/util/BitSet;

    .line 35
    invoke-static {v2, v1}, Ll/ۙܳ᩵;->᩷(II)[Ljava/util/BitSet;

    move-result-object v1

    iput-object v1, p0, Ll/ۙܳ᩵;->ۙ:[Ljava/util/BitSet;

    .line 57
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 58
    invoke-virtual {v2}, Ll/᩷ۡۗ;->getId()I

    move-result v3

    .line 59
    iget-object v4, p0, Ll/ۙܳ᩵;->ᩴ:[Ljava/util/BitSet;

    aget-object v4, v4, v3

    .line 60
    iget-object v5, p0, Ll/ۙܳ᩵;->᩷:[Ljava/util/BitSet;

    aget-object v5, v5, v3

    .line 61
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۡۗ;

    .line 62
    invoke-virtual {v6}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܺ֨ۗ;

    .line 63
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v9, v8, Ll/ۛ֨ۗ;

    if-eqz v9, :cond_2

    .line 64
    check-cast v8, Ll/ۛ֨ۗ;

    invoke-virtual {v8}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v8

    .line 65
    invoke-virtual {v5, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-nez v9, :cond_2

    .line 66
    invoke-virtual {v4, v8}, Ljava/util/BitSet;->set(I)V

    goto :goto_1

    .line 70
    :cond_3
    invoke-virtual {v6}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 72
    invoke-virtual {v6}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v6

    .line 73
    invoke-virtual {v5, v6}, Ljava/util/BitSet;->set(I)V

    .line 74
    iget-object v7, p0, Ll/ۙܳ᩵;->ۙ:[Ljava/util/BitSet;

    aget-object v6, v7, v6

    invoke-virtual {v6, v3}, Ljava/util/BitSet;->set(I)V

    goto :goto_0

    .line 81
    :cond_4
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 82
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۢۙ()I

    move-result v2

    .line 83
    invoke-static {v1, v2}, Ll/ۙܳ᩵;->᩷(II)[Ljava/util/BitSet;

    move-result-object v1

    .line 84
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    .line 85
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    mul-int/lit8 v4, v3, 0xa

    const/4 v5, 0x0

    .line 91
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    :cond_5
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    .line 92
    invoke-virtual {v8}, Ll/᩷ۡۗ;->getId()I

    move-result v9

    .line 93
    aget-object v10, v1, v9

    .line 94
    new-instance v11, Ljava/util/BitSet;

    invoke-direct {v11, v2}, Ljava/util/BitSet;-><init>(I)V

    .line 95
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩷ۡۗ;

    .line 96
    invoke-virtual {v12}, Ll/᩷ۡۗ;->getId()I

    move-result v12

    aget-object v12, v1, v12

    invoke-virtual {v11, v12}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    goto :goto_4

    .line 98
    :cond_6
    iget-object v8, p0, Ll/ۙܳ᩵;->᩷:[Ljava/util/BitSet;

    aget-object v8, v8, v9

    invoke-virtual {v11, v8}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 99
    iget-object v8, p0, Ll/ۙܳ᩵;->ᩴ:[Ljava/util/BitSet;

    aget-object v8, v8, v9

    invoke-virtual {v11, v8}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 100
    invoke-virtual {v10, v11}, Ljava/util/BitSet;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    .line 102
    aput-object v11, v1, v9

    const/4 v7, 0x1

    goto :goto_3

    :cond_7
    add-int/lit8 v6, v5, 0x1

    if-gt v5, v4, :cond_9

    if-nez v7, :cond_8

    .line 110
    iput-object v1, p0, Ll/ۙܳ᩵;->ۤ:[Ljava/util/BitSet;

    return-void

    :cond_8
    move v5, v6

    goto :goto_2

    .line 106
    :cond_9
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Live variable analysis reach iterations limit, blocks count: "

    .line 0
    invoke-static {v3, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 106
    throw v0
.end method

.method public final ۙ(II)Z
    .locals 2

    .line 45
    iget-object v0, p0, Ll/ۙܳ᩵;->ۤ:[Ljava/util/BitSet;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, Ll/ۙܳ᩵;->ۤ:[Ljava/util/BitSet;

    array-length p2, p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object v0, Ll/ۙܳ᩵;->ܳ:Ll/᩻ܽ᩺;

    const-string v1, "LiveVarAnalysis: out of bounds block: {}, max: {}"

    invoke-interface {v0, v1, p1, p2}, Ll/᩻ܽ᩺;->ۤ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    .line 49
    :cond_0
    aget-object p1, v0, p1

    invoke-virtual {p1, p2}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    return p1
.end method

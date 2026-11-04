.class public final Ll/ܺ᩶᩸;
.super Ljava/lang/Object;
.source "G6RC"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֡:Ll/ܳܿ᩸;

.field public final ֨:Ljava/lang/CharSequence;

.field public final ۟:I

.field public final ۢ:Ll/᩸᩶᩸;

.field public ܰ:Z

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/util/List;

.field public ᩶:Ll/ۜܶ᩸;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x7c

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Ll/ܳܿ᩸;Ljava/lang/String;Ll/᩸᩶᩸;ILjava/util/List;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/ܺ᩶᩸;->֨:Ljava/lang/CharSequence;

    .line 36
    iput-object p2, p0, Ll/ܺ᩶᩸;->֡:Ll/ܳܿ᩸;

    .line 37
    iput-object p3, p0, Ll/ܺ᩶᩸;->ܿ:Ljava/lang/String;

    .line 38
    iput-object p4, p0, Ll/ܺ᩶᩸;->ۢ:Ll/᩸᩶᩸;

    .line 39
    iput p5, p0, Ll/ܺ᩶᩸;->۟:I

    .line 40
    iput-object p6, p0, Ll/ܺ᩶᩸;->ᩳ:Ljava/util/List;

    return-void
.end method

.method public static ۙ(Ljava/lang/CharSequence;Ljava/lang/String;Ll/᩸᩶᩸;ILjava/util/ArrayList;)Ll/ܺ᩶᩸;
    .locals 7

    .line 67
    invoke-virtual {p2}, Ll/᩸᩶᩸;->ۙ()Ll/᩸᩶᩸;

    move-result-object v4

    const/4 p2, 0x0

    if-nez p4, :cond_0

    move-object v6, p2

    goto :goto_1

    .line 0
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p4}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p4

    move-object v6, p4

    :goto_1
    if-eqz v6, :cond_3

    if-ltz p3, :cond_2

    .line 69
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result p4

    if-ge p3, p4, :cond_2

    goto :goto_2

    .line 70
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid saving page index"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 74
    :cond_3
    :goto_2
    :try_start_0
    instance-of p4, p0, Ll/ۡ᩶᩸;

    if-eqz p4, :cond_4

    move-object p4, p0

    check-cast p4, Ll/ۡ᩶᩸;

    invoke-interface {p4}, Ll/ۡ᩶᩸;->ۘ()Ll/ܳܿ᩸;

    move-result-object p2

    .line 76
    :cond_4
    new-instance p4, Ll/ܺ᩶᩸;

    if-nez p2, :cond_5

    move-object v1, p0

    goto :goto_3

    :cond_5
    move-object v1, p2

    :goto_3
    move-object v0, p4

    move-object v2, p2

    move-object v3, p1

    move v5, p3

    invoke-direct/range {v0 .. v6}, Ll/ܺ᩶᩸;-><init>(Ljava/lang/CharSequence;Ll/ܳܿ᩸;Ljava/lang/String;Ll/᩸᩶᩸;ILjava/util/List;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p4

    :catch_0
    move-exception p0

    goto :goto_4

    :catch_1
    move-exception p0

    :goto_4
    if-eqz p2, :cond_6

    .line 79
    invoke-virtual {p2}, Ll/ܳܿ᩸;->close()V

    .line 80
    :cond_6
    throw p0
.end method

.method public static ۙ(Ll/ܶ᩵᩸;Ljava/lang/String;Ll/᩸᩶᩸;)Ll/ܺ᩶᩸;
    .locals 3

    .line 50
    iget-object v0, p0, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 45
    invoke-static {v0, p1, p2, v1, v2}, Ll/ܺ᩶᩸;->ۙ(Ljava/lang/CharSequence;Ljava/lang/String;Ll/᩸᩶᩸;ILjava/util/ArrayList;)Ll/ܺ᩶᩸;

    move-result-object p1

    .line 51
    iget-object p2, p0, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ll/۬ܶ᩸;->ۤ()I

    move-result p2

    const/4 v0, 0x1

    if-le p2, v0, :cond_0

    .line 52
    :try_start_0
    iget-object p2, p0, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    iget v0, p0, Ll/ܶ᩵᩸;->᩻:I

    iget-object v1, p1, Ll/ܺ᩶᩸;->֨:Ljava/lang/CharSequence;

    iget-object p0, p0, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    iget-object p0, p0, Ll/ۚ᩹᩸;->ܽ:Ll/ᩳ᩵᩸;

    invoke-virtual {p2, v0, v1, p0}, Ll/۬ܶ᩸;->ۙ(ILjava/lang/CharSequence;Ll/ᩳ᩵᩸;)Ll/ۜܶ᩸;

    move-result-object p0

    iput-object p0, p1, Ll/ܺ᩶᩸;->᩶:Ll/ۜܶ᩸;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 53
    :goto_0
    invoke-virtual {p1}, Ll/ܺ᩶᩸;->close()V

    throw p0

    :cond_0
    return-object p1
.end method

.method public static ۙ(Ll/ᩳ۬᩸;Ljava/lang/String;Ll/᩸᩶᩸;)Ll/ܺ᩶᩸;
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 45
    invoke-static {p0, p1, p2, v0, v1}, Ll/ܺ᩶᩸;->ۙ(Ljava/lang/CharSequence;Ljava/lang/String;Ll/᩸᩶᩸;ILjava/util/ArrayList;)Ll/ܺ᩶᩸;

    move-result-object p0

    return-object p0
.end method

.method private ᩷()V
    .locals 2

    .line 150
    iget-boolean v0, p0, Ll/ܺ᩶᩸;->ܰ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Saving request is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 155
    iget-boolean v0, p0, Ll/ܺ᩶᩸;->ܰ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 156
    iput-boolean v0, p0, Ll/ܺ᩶᩸;->ܰ:Z

    .line 157
    :try_start_0
    iget-object v0, p0, Ll/ܺ᩶᩸;->֡:Ll/ܳܿ᩸;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ܳܿ᩸;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    :cond_1
    iget-object v0, p0, Ll/ܺ᩶᩸;->᩶:Ll/ۜܶ᩸;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/ۜܶ᩸;->close()V

    :cond_2
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ll/ܺ᩶᩸;->᩶:Ll/ۜܶ᩸;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ll/ۜܶ᩸;->close()V

    :cond_3
    throw v0
.end method

.method public final ۙ(I)Ll/۬ۧܳ;
    .locals 5

    .line 132
    invoke-direct {p0}, Ll/ܺ᩶᩸;->᩷()V

    .line 133
    new-instance v0, Ll/۬ۧܳ;

    invoke-direct {v0}, Ll/۬ۧܳ;-><init>()V

    .line 134
    iget-object v1, p0, Ll/ܺ᩶᩸;->᩶:Ll/ۜܶ᩸;

    iget-object v2, p0, Ll/ܺ᩶᩸;->֨:Ljava/lang/CharSequence;

    if-nez v1, :cond_0

    .line 135
    invoke-virtual {v0, p1, v2}, Ll/۬ۧܳ;->ۙ(ILjava/lang/CharSequence;)V

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 137
    :goto_0
    iget-object v3, p0, Ll/ܺ᩶᩸;->᩶:Ll/ۜܶ᩸;

    .line 198
    iget-object v3, v3, Ll/ۜܶ᩸;->۟:Ll/۬ܶ᩸;

    invoke-virtual {v3}, Ll/۬ܶ᩸;->ۤ()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 138
    iget-object v3, p0, Ll/ܺ᩶᩸;->᩶:Ll/ۜܶ᩸;

    invoke-virtual {v3}, Ll/ۜܶ᩸;->ۙ()I

    move-result v3

    if-ne v1, v3, :cond_1

    invoke-virtual {v0, p1, v2}, Ll/۬ۧܳ;->ۙ(ILjava/lang/CharSequence;)V

    goto :goto_1

    .line 139
    :cond_1
    iget-object v3, p0, Ll/ܺ᩶᩸;->᩶:Ll/ۜܶ᩸;

    invoke-virtual {v3, v1}, Ll/ۜܶ᩸;->ۙ(I)Ll/ܳܿ᩸;

    move-result-object v3

    const/4 v4, -0x1

    :try_start_0
    invoke-virtual {v0, v4, v3}, Ll/۬ۧܳ;->ۙ(ILjava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Ll/ܳܿ᩸;->close()V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v3}, Ll/ܳܿ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    :cond_2
    return-object v0
.end method

.method public final ۙ()V
    .locals 1

    .line 60
    invoke-direct {p0}, Ll/ܺ᩶᩸;->᩷()V

    .line 61
    iget-object v0, p0, Ll/ܺ᩶᩸;->᩶:Ll/ۜܶ᩸;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۜܶ᩸;->᩷()V

    :cond_0
    return-void
.end method

.method public native ۙ(Ll/ۖܰ᩸;)V
.end method

.method public final ۙ(Ll/᩷ۨᩴ;)V
    .locals 3

    .line 97
    invoke-direct {p0}, Ll/ܺ᩶᩸;->᩷()V

    .line 98
    iget-object v0, p0, Ll/ܺ᩶᩸;->᩶:Ll/ۜܶ᩸;

    iget-object v1, p0, Ll/ܺ᩶᩸;->ۢ:Ll/᩸᩶᩸;

    iget-object v2, p0, Ll/ܺ᩶᩸;->ܿ:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܺ᩶᩸;->֨:Ljava/lang/CharSequence;

    iget v1, v1, Ll/᩸᩶᩸;->ۤ:I

    invoke-static {p1, v0, v2, v1}, Ll/֡᩶᩸;->᩷(Ll/᩷ۨᩴ;Ljava/lang/CharSequence;Ljava/lang/String;I)V

    return-void

    .line 99
    :cond_0
    iget v1, v1, Ll/᩸᩶᩸;->ۤ:I

    invoke-static {p1, v2, v1, v0}, Ll/֡᩶᩸;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/String;ILl/ۜܶ᩸;)V

    return-void
.end method

.method public final ۙ(Ll/᩸᩶᩸;)Z
    .locals 9

    .line 114
    iget-object v0, p0, Ll/ܺ᩶᩸;->ۢ:Ll/᩸᩶᩸;

    iget-object v1, v0, Ll/᩸᩶᩸;->᩸:Ljava/util/Map;

    const/4 v2, 0x0

    if-eqz p1, :cond_8

    iget-object v3, p1, Ll/᩸᩶᩸;->᩸:Ljava/util/Map;

    iget v4, v0, Ll/᩸᩶᩸;->۫:I

    iget v5, p1, Ll/᩸᩶᩸;->۫:I

    if-ne v4, v5, :cond_8

    iget v4, v0, Ll/᩸᩶᩸;->ۤ:I

    iget v5, p1, Ll/᩸᩶᩸;->ۤ:I

    if-ne v4, v5, :cond_8

    iget-boolean v4, v0, Ll/᩸᩶᩸;->ᩴ:Z

    iget-boolean v5, p1, Ll/᩸᩶᩸;->ᩴ:Z

    if-ne v4, v5, :cond_8

    iget v4, v0, Ll/᩸᩶᩸;->ܳ:I

    iget v5, p1, Ll/᩸᩶᩸;->ܳ:I

    if-ne v4, v5, :cond_8

    iget-object v4, v0, Ll/᩸᩶᩸;->᩷:Ll/᩶ۤۤ;

    iget-object v5, p1, Ll/᩸᩶᩸;->᩷:Ll/᩶ۤۤ;

    if-ne v4, v5, :cond_8

    iget-object v0, v0, Ll/᩸᩶᩸;->ۙ:Ll/᩷ۨᩴ;

    iget-object p1, p1, Ll/᩸᩶᩸;->ۙ:Ll/᩷ۨᩴ;

    .line 116
    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_2

    :cond_0
    if-eqz v1, :cond_6

    if-nez v3, :cond_1

    goto/16 :goto_1

    .line 118
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    .line 119
    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 120
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۤۤ;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۤۤ;

    .line 121
    iget v4, v1, Ll/ۖۤۤ;->᩸:I

    iget-object v5, v1, Ll/ۖۤۤ;->ᩴ:[Ll/۬ۤۤ;

    iget v6, v0, Ll/ۖۤۤ;->᩸:I

    iget-object v7, v0, Ll/ۖۤۤ;->ᩴ:[Ll/۬ۤۤ;

    if-ne v4, v6, :cond_8

    iget v4, v1, Ll/ۖۤۤ;->ۙ:I

    iget v6, v0, Ll/ۖۤۤ;->ۙ:I

    if-ne v4, v6, :cond_8

    iget-object v1, v1, Ll/ۖۤۤ;->᩷:Ljava/lang/String;

    iget-object v0, v0, Ll/ۖۤۤ;->᩷:Ljava/lang/String;

    invoke-static {v1, v0}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    array-length v0, v5

    array-length v1, v7

    if-eq v0, v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    .line 123
    :goto_0
    array-length v1, v5

    if-ge v0, v1, :cond_3

    .line 124
    aget-object v1, v5, v0

    aget-object v4, v7, v0

    .line 125
    iget v6, v1, Ll/۬ۤۤ;->᩷:I

    iget v8, v4, Ll/۬ۤۤ;->᩷:I

    if-ne v6, v8, :cond_8

    iget v6, v1, Ll/۬ۤۤ;->ۤ:I

    iget v8, v4, Ll/۬ۤۤ;->ۤ:I

    if-ne v6, v8, :cond_8

    iget-object v1, v1, Ll/۬ۤۤ;->ۙ:Ljava/lang/String;

    iget-object v4, v4, Ll/۬ۤۤ;->ۙ:Ljava/lang/String;

    invoke-static {v1, v4}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    if-ne v1, v3, :cond_8

    :cond_7
    const/4 p1, 0x1

    return p1

    :cond_8
    :goto_2
    return v2
.end method

.method public final ᩷(Ll/᩷ۨᩴ;)V
    .locals 7

    .line 104
    iget-object v0, p0, Ll/ܺ᩶᩸;->ۢ:Ll/᩸᩶᩸;

    iget-object v1, v0, Ll/᩸᩶᩸;->᩷:Ll/᩶ۤۤ;

    invoke-direct {p0}, Ll/ܺ᩶᩸;->᩷()V

    .line 106
    iget-object v2, p0, Ll/ܺ᩶᩸;->᩶:Ll/ۜܶ᩸;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iget-object v2, p0, Ll/ܺ᩶᩸;->֨:Ljava/lang/CharSequence;

    instance-of v4, v2, Ll/ܳܿ᩸;

    if-eqz v4, :cond_0

    check-cast v2, Ll/ܳܿ᩸;

    invoke-virtual {v2}, Ll/ܳܿ᩸;->length()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Ll/ܳܿ᩸;->subSequence(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 108
    :cond_1
    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    .line 109
    iget-object v4, p0, Ll/ܺ᩶᩸;->᩶:Ll/ۜܶ᩸;

    invoke-virtual {v4, v2}, Ll/ۜܶ᩸;->ۙ(Ljava/io/Writer;)V

    .line 110
    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v2

    .line 112
    :goto_0
    new-instance v4, Ll/ۛۚۤ;

    invoke-direct {v4}, Ll/ۛۚۤ;-><init>()V

    .line 113
    new-instance v5, Ll/᩷ܺܺ;

    invoke-direct {v5, v1}, Ll/᩷ܺܺ;-><init>(Ll/᩶ۤۤ;)V

    iget-object v6, v0, Ll/᩸᩶᩸;->᩸:Ljava/util/Map;

    invoke-virtual {v5, v6}, Ll/᩷ܺܺ;->ۙ(Ljava/util/Map;)V

    iget-boolean v0, v0, Ll/᩸᩶᩸;->ᩴ:Z

    .line 114
    invoke-virtual {v5, v0}, Ll/᩷ܺܺ;->ۙ(Z)V

    invoke-virtual {v5, v2}, Ll/᩷ܺܺ;->ۙ(Ljava/lang/CharSequence;)V

    invoke-virtual {v5, v4}, Ll/᩷ܺܺ;->ۙ(Ll/ۛۚۤ;)V

    .line 115
    invoke-virtual {p1, v4}, Ll/᩷ۨᩴ;->ۙ(Ll/ۛۚۤ;)V

    if-eqz v1, :cond_4

    .line 116
    invoke-virtual {v1}, Ll/᩶ۤۤ;->ۙ()Ll/ۜܳۤ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 117
    invoke-virtual {v1}, Ll/᩶ۤۤ;->ۙ()Ll/ۜܳۤ;

    move-result-object v0

    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".arsc"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Ljava/lang/String;

    invoke-static {p1, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p1

    .line 119
    instance-of v1, v0, Ll/᩺۫ۤ;

    if-eqz v1, :cond_3

    check-cast v0, Ll/᩺۫ۤ;

    .line 446
    invoke-virtual {p1, v3}, Ll/᩷ۨᩴ;->ۤ(Z)Ljava/io/OutputStream;

    move-result-object p1

    .line 121
    :try_start_0
    invoke-virtual {v0, p1}, Ll/᩺۫ۤ;->ۙ(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception v0

    if-eqz p1, :cond_2

    :try_start_1
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw v0

    .line 123
    :cond_3
    new-instance v1, Ll/ۛۚۤ;

    invoke-direct {v1}, Ll/ۛۚۤ;-><init>()V

    .line 124
    sget-object v2, Ll/ۤᩴۤ;->᩶:Ll/ۤᩴۤ;

    .line 95
    invoke-static {v0, v2, v3}, Ll/᩸ᩴۤ;->ۙ(Ll/ۜܳۤ;Ll/ۤᩴۤ;Z)Ll/᩸ᩴۤ;

    move-result-object v0

    const/4 v2, 0x0

    .line 247
    invoke-virtual {v0, v1, v2}, Ll/᩸ᩴۤ;->ۙ(Ll/᩹ۚۤ;Ll/ۗۧܺ;)V

    .line 125
    invoke-virtual {p1, v1}, Ll/᩷ۨᩴ;->ۙ(Ll/ۛۚۤ;)V

    :cond_4
    return-void
.end method

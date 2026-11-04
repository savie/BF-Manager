.class public final Ll/ۖ᩷᩵;
.super Ljava/lang/Object;
.source "36GR"


# instance fields
.field public final ۙ:Ljava/util/function/Function;


# direct methods
.method public constructor <init>(Ljava/util/function/Function;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Ll/ۖ᩷᩵;->ۙ:Ljava/util/function/Function;

    return-void
.end method

.method public static ۙ(Ll/۟ۤ᩵;Ll/ۧ᩸ۨ;)Ljava/util/List;
    .locals 2

    .line 39
    instance-of v0, p1, Ll/᩷ۤ᩵;

    if-eqz v0, :cond_0

    .line 40
    check-cast p1, Ll/᩷ۤ᩵;

    invoke-virtual {p1}, Ll/᩷ۤ᩵;->ۤ()V

    const/4 p1, 0x1

    new-array v0, p1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    .line 0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    aget-object p1, v0, v1

    invoke-static {p1, p0, p1, p0}, Ll/᩺᩸ۚ;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 42
    :cond_0
    instance-of p0, p1, Ll/ۙۤ᩵;

    if-eqz p0, :cond_1

    .line 43
    check-cast p1, Ll/ۙۤ᩵;

    invoke-virtual {p1}, Ll/ۙۤ᩵;->ۤ()Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 45
    :cond_1
    new-instance p0, Ll/۠ۧ᩵;

    const-string p1, "A sealed class, AbstractBlockPathTraverserHandler, has an unknown implementation"

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    throw p0
.end method

.method private ۙ(Ll/۟ۤ᩵;Ll/֨ۤ᩵;Z)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 175
    iget-object v2, p0, Ll/ۖ᩷᩵;->ۙ:Ljava/util/function/Function;

    if-eqz v2, :cond_0

    invoke-interface {v2, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v2, :cond_1

    if-nez v3, :cond_3

    .line 177
    :cond_1
    invoke-virtual {p2}, Ll/֨ۤ᩵;->᩸()Ll/ۢۤ᩵;

    move-result-object v2

    sget-object v4, Ll/ۢۤ᩵;->ܿ:Ll/ۢۤ᩵;

    if-eq v2, v4, :cond_2

    .line 178
    invoke-virtual {p2}, Ll/֨ۤ᩵;->᩸()Ll/ۢۤ᩵;

    move-result-object v2

    sget-object v4, Ll/ۢۤ᩵;->᩶:Ll/ۢۤ᩵;

    if-ne v2, v4, :cond_3

    if-eqz p3, :cond_3

    .line 180
    :cond_2
    invoke-virtual {p2}, Ll/֨ۤ᩵;->ܳ()Ll/ۧ᩸ۨ;

    move-result-object p2

    .line 181
    invoke-static {p1, p2}, Ll/ۖ᩷᩵;->ۙ(Ll/۟ۤ᩵;Ll/ۧ᩸ۨ;)Ljava/util/List;

    move-result-object p2

    .line 182
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ne p3, v1, :cond_4

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p1, :cond_4

    :cond_3
    return v3

    .line 183
    :cond_4
    new-instance p1, Ll/۠ۧ᩵;

    const-string p2, "A traverser handler which was not expected to change path states actually did"

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 183
    throw p1
.end method


# virtual methods
.method public final ۙ(Ll/۟ۤ᩵;)Ljava/util/List;
    .locals 10

    .line 76
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 77
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 103
    :goto_0
    invoke-virtual {p1}, Ll/۟ۤ᩵;->ܳ()Ll/ܺܳܺ;

    move-result-object v3

    .line 104
    invoke-virtual {p1}, Ll/۟ۤ᩵;->ᩴ()Ll/֨ۤ᩵;

    move-result-object v4

    .line 105
    invoke-virtual {p1}, Ll/۟ۤ᩵;->᩸()Ll/֨ۤ᩵;

    move-result-object v5

    .line 107
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-ne v6, v4, :cond_0

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_0

    .line 108
    sget-object v3, Ll/ܰۤ᩵;->ᩳ:Ll/ܰۤ᩵;

    .line 109
    invoke-static {v3}, Ll/᩶ۤ᩵;->ۙ(Ll/ܰۤ᩵;)Ll/۬᩷᩵;

    move-result-object v4

    .line 111
    invoke-static {v3}, Ll/᩶ۤ᩵;->ۙ(Ll/ܰۤ᩵;)Ll/۬᩷᩵;

    move-result-object v3

    .line 112
    invoke-static {p1, v4, v3}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v3

    new-array v4, v8, [Ljava/lang/Object;

    aput-object v3, v4, v7

    .line 0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v4, v4, v7

    invoke-static {v4, v3, v4, v3}, Ll/᩺᩸ۚ;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    .line 114
    :cond_0
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 115
    invoke-virtual {v2, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 116
    invoke-virtual {v4}, Ll/֨ۤ᩵;->֫()Z

    move-result v6

    if-nez v6, :cond_a

    invoke-virtual {v5}, Ll/֨ۤ᩵;->֫()Z

    move-result v6

    if-eqz v6, :cond_1

    goto/16 :goto_6

    .line 119
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 120
    invoke-virtual {v4}, Ll/֨ۤ᩵;->᩸()Ll/ۢۤ᩵;

    move-result-object v6

    sget-object v9, Ll/ۢۤ᩵;->֡:Ll/ۢۤ᩵;

    if-ne v6, v9, :cond_6

    .line 121
    invoke-virtual {v5}, Ll/֨ۤ᩵;->᩸()Ll/ۢۤ᩵;

    move-result-object v6

    if-ne v6, v9, :cond_6

    .line 124
    invoke-virtual {v4}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object v4

    .line 125
    invoke-virtual {v5}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object v6

    if-eqz v4, :cond_2

    if-eqz v6, :cond_2

    .line 127
    invoke-virtual {v4}, Ll/ᩳۤ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object v4

    .line 128
    invoke-virtual {v6}, Ll/ᩳۤ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v4, v1

    move-object v6, v4

    :goto_1
    if-eqz v4, :cond_3

    if-eqz v6, :cond_3

    .line 135
    invoke-virtual {v3, v4, v6}, Ll/ܺܳܺ;->᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v9

    goto :goto_2

    :cond_3
    const/4 v9, 0x0

    :goto_2
    if-eqz v9, :cond_5

    .line 140
    invoke-virtual {v3, v4, v6}, Ll/ܺܳܺ;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ljava/util/List;

    move-result-object v3

    .line 141
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 142
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۟ۤ᩵;

    .line 143
    invoke-virtual {v6}, Ll/۟ۤ᩵;->ᩴ()Ll/֨ۤ᩵;

    move-result-object v9

    .line 144
    invoke-virtual {v6}, Ll/۟ۤ᩵;->᩸()Ll/֨ۤ᩵;

    move-result-object v6

    .line 145
    invoke-static {v9}, Ll/᩺ۤ᩵;->ۙ(Ll/֨ۤ᩵;)Ll/۬᩷᩵;

    move-result-object v9

    .line 147
    invoke-static {v6}, Ll/᩺ۤ᩵;->ۙ(Ll/֨ۤ᩵;)Ll/۬᩷᩵;

    move-result-object v6

    .line 149
    invoke-static {p1, v9, v6}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v6

    .line 150
    invoke-virtual {v6, v3}, Ll/۟ۤ᩵;->ۙ(Ljava/util/List;)V

    .line 151
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    move-object v3, v4

    goto :goto_7

    .line 155
    :cond_5
    invoke-virtual {v5}, Ll/֨ۤ᩵;->ܳ()Ll/ۧ᩸ۨ;

    move-result-object v3

    .line 156
    invoke-static {p1, v3}, Ll/ۖ᩷᩵;->ۙ(Ll/۟ۤ᩵;Ll/ۧ᩸ۨ;)Ljava/util/List;

    move-result-object v3

    goto :goto_7

    .line 158
    :cond_6
    invoke-virtual {v4}, Ll/֨ۤ᩵;->᩸()Ll/ۢۤ᩵;

    move-result-object v3

    sget-object v6, Ll/ۢۤ᩵;->֡:Ll/ۢۤ᩵;

    if-eq v3, v6, :cond_8

    .line 159
    invoke-virtual {v5}, Ll/֨ۤ᩵;->᩸()Ll/ۢۤ᩵;

    move-result-object v3

    if-ne v3, v6, :cond_7

    goto :goto_4

    :cond_7
    const/4 v3, 0x0

    goto :goto_5

    :cond_8
    :goto_4
    const/4 v3, 0x1

    .line 160
    :goto_5
    invoke-direct {p0, p1, v4, v3}, Ll/ۖ᩷᩵;->ۙ(Ll/۟ۤ᩵;Ll/֨ۤ᩵;Z)Z

    move-result v4

    .line 161
    invoke-direct {p0, p1, v5, v3}, Ll/ۖ᩷᩵;->ۙ(Ll/۟ۤ᩵;Ll/֨ۤ᩵;Z)Z

    move-result v3

    if-eqz v4, :cond_9

    if-eqz v3, :cond_9

    goto :goto_6

    :cond_9
    new-array v3, v8, [Ljava/lang/Object;

    aput-object p1, v3, v7

    .line 0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v3, v3, v7

    invoke-static {v3, v4, v3, v4}, Ll/᩺᩸ۚ;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v3

    goto :goto_7

    :cond_a
    :goto_6
    move-object v3, v1

    :goto_7
    if-eqz v3, :cond_e

    .line 80
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_9

    .line 83
    :cond_b
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p1

    if-eq p1, v8, :cond_d

    .line 84
    new-instance p1, Ll/ۖ᩷᩵;

    iget-object v0, p0, Ll/ۖ᩷᩵;->ۙ:Ljava/util/function/Function;

    invoke-direct {p1, v0}, Ll/ۖ᩷᩵;-><init>(Ljava/util/function/Function;)V

    .line 85
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ۤ᩵;

    .line 87
    invoke-virtual {p1, v2}, Ll/ۖ᩷᩵;->ۙ(Ll/۟ۤ᩵;)Ljava/util/List;

    move-result-object v2

    .line 88
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_8

    :cond_c
    return-object v0

    .line 92
    :cond_d
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ۤ᩵;

    goto/16 :goto_0

    :cond_e
    :goto_9
    new-array v0, v8, [Ljava/lang/Object;

    aput-object p1, v0, v7

    .line 0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v8}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v0, v0, v7

    invoke-static {v0, p1, v0, p1}, Ll/᩺᩸ۚ;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

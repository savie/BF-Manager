.class public final Ll/ᩳۘۗ;
.super Ljava/lang/Object;
.source "HIVL"


# instance fields
.field public final ۙ:Ll/᩻ۡۗ;

.field public final ۚ:Ll/ᩳۘۗ;

.field public ۤ:Ljava/util/List;

.field public ۫:Ljava/util/List;

.field public ܳ:Z

.field public ᩴ:Ljava/util/List;

.field public final ᩷:Ll/֡ۘۗ;

.field public ᩸:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/᩻ۡۗ;Ll/֡ۘۗ;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ᩳۘۗ;->ᩴ:Ljava/util/List;

    .line 32
    iput-object v0, p0, Ll/ᩳۘۗ;->᩸:Ljava/util/List;

    .line 33
    iput-object v0, p0, Ll/ᩳۘۗ;->ۤ:Ljava/util/List;

    .line 34
    iput-object v0, p0, Ll/ᩳۘۗ;->۫:Ljava/util/List;

    .line 38
    iput-object p2, p0, Ll/ᩳۘۗ;->᩷:Ll/֡ۘۗ;

    .line 39
    iput-object p1, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    const/4 p1, 0x0

    .line 40
    iput-object p1, p0, Ll/ᩳۘۗ;->ۚ:Ll/ᩳۘۗ;

    return-void
.end method

.method public constructor <init>(Ll/᩻ۡۗ;Ll/ᩳۘۗ;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ᩳۘۗ;->ᩴ:Ljava/util/List;

    .line 32
    iput-object v0, p0, Ll/ᩳۘۗ;->᩸:Ljava/util/List;

    .line 33
    iput-object v0, p0, Ll/ᩳۘۗ;->ۤ:Ljava/util/List;

    .line 34
    iput-object v0, p0, Ll/ᩳۘۗ;->۫:Ljava/util/List;

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Ll/ᩳۘۗ;->᩷:Ll/֡ۘۗ;

    .line 48
    iput-object p1, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    .line 49
    iput-object p2, p0, Ll/ᩳۘۗ;->ۚ:Ll/ᩳۘۗ;

    return-void
.end method

.method private ۤ()V
    .locals 6

    const/4 v0, 0x1

    .line 140
    iput-boolean v0, p0, Ll/ᩳۘۗ;->ܳ:Z

    .line 141
    invoke-virtual {p0}, Ll/ᩳۘۗ;->᩷()Ll/֡ۘۗ;

    move-result-object v1

    .line 142
    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 144
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ۡۗ;

    .line 146
    sget-object v4, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 147
    invoke-virtual {v1, v3}, Ll/֡ۘۗ;->ۙ(Ll/᩻ۡۗ;)Ll/ᩳۘۗ;

    move-result-object v3

    .line 148
    invoke-direct {v3}, Ll/ᩳۘۗ;->ۤ()V

    .line 149
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 152
    :cond_1
    invoke-static {v2}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۘۗ;->ᩴ:Ljava/util/List;

    .line 154
    :cond_2
    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->᩹ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_4

    .line 156
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 157
    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->᩹ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ۡۗ;

    .line 158
    invoke-virtual {v1, v3}, Ll/֡ۘۗ;->ۙ(Ll/᩻ۡۗ;)Ll/ᩳۘۗ;

    move-result-object v3

    .line 159
    invoke-direct {v3}, Ll/ᩳۘۗ;->ۤ()V

    .line 160
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 162
    :cond_3
    invoke-static {v2}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۘۗ;->᩸:Ljava/util/List;

    .line 165
    :cond_4
    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_8

    .line 167
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 168
    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ll/ܽۡۗ;

    .line 169
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v4, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-nez v0, :cond_5

    move-object v0, v1

    .line 0
    monitor-enter v0

    .line 307
    :try_start_0
    invoke-virtual {v4}, Ll/ܽۡۗ;->ۙۙ()Ll/ۢۘۗ;

    move-result-object v5

    if-nez v5, :cond_6

    .line 309
    invoke-virtual {v4}, Ll/ܽۡۗ;->᩷ۙ()Ll/᩻ۡۗ;

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/֡ۘۗ;->ۙ(Ll/᩻ۡۗ;)Ll/ᩳۘۗ;

    .line 310
    new-instance v5, Ll/ۢۘۗ;

    invoke-direct {v5, v4}, Ll/ۢۘۗ;-><init>(Ll/ܽۡۗ;)V

    .line 311
    invoke-virtual {v4, v5}, Ll/ܽۡۗ;->ۙ(Ll/ۢۘۗ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 313
    :cond_6
    monitor-exit v0

    .line 170
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catchall_0
    move-exception v1

    .line 313
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    .line 173
    :cond_7
    invoke-static {v2}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۘۗ;->ۤ:Ljava/util/List;

    .line 176
    :cond_8
    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_b

    .line 178
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 179
    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۡۗ;

    .line 180
    sget-object v4, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v4

    if-nez v4, :cond_9

    .line 181
    invoke-virtual {v1, v3}, Ll/֡ۘۗ;->ۙ(Ll/ۖۡۗ;)Ll/֨ۘۗ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 184
    :cond_a
    new-instance v0, Ll/۟ۘۗ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۟ۘۗ;-><init>(I)V

    invoke-static {v0}, Ll/ۖ۫ۗ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v2, v0}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 185
    invoke-static {v2}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۘۗ;->۫:Ljava/util/List;

    :cond_b
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    .line 356
    instance-of v0, p1, Ll/ᩳۘۗ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ᩳۘۗ;

    iget-object p1, p1, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0, p1}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

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

.method public final hashCode()I
    .locals 1

    .line 361
    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 249
    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܽۙ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 3

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 125
    :try_start_0
    iget-boolean v1, p0, Ll/ᩳۘۗ;->ܳ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 126
    monitor-exit v0

    goto :goto_1

    .line 129
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v1}, Ll/᩻ۡۗ;->getState()Ll/ۜۡۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۜۡۗ;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 133
    :cond_1
    iget-object v1, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v1}, Ll/᩻ۡۗ;->ۜ()Ll/᩹ۘۗ;

    move-result-object v2

    .line 135
    :goto_0
    invoke-direct {p0}, Ll/ᩳۘۗ;->ۤ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    monitor-exit v0

    :goto_1
    if-eqz v2, :cond_2

    goto :goto_2

    .line 61
    :cond_2
    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ۜ()Ll/᩹ۘۗ;

    move-result-object v2

    .line 53
    :goto_2
    invoke-interface {v2}, Ll/᩹ۘۗ;->ۤ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 136
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ۙ(Ljava/lang/String;)Ll/֨ۘۗ;
    .locals 1

    .line 328
    iget-object v0, p0, Ll/ᩳۘۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0, p1}, Ll/᩻ۡۗ;->ᩴ(Ljava/lang/String;)Ll/ۖۡۗ;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 332
    :cond_0
    invoke-virtual {p0}, Ll/ᩳۘۗ;->᩷()Ll/֡ۘۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֡ۘۗ;->ۙ(Ll/ۖۡۗ;)Ll/֨ۘۗ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷()Ll/֡ۘۗ;
    .locals 1

    .line 190
    iget-object v0, p0, Ll/ᩳۘۗ;->ۚ:Ll/ᩳۘۗ;

    if-eqz v0, :cond_0

    .line 191
    invoke-virtual {v0}, Ll/ᩳۘۗ;->᩷()Ll/֡ۘۗ;

    move-result-object v0

    return-object v0

    .line 193
    :cond_0
    iget-object v0, p0, Ll/ᩳۘۗ;->᩷:Ll/֡ۘۗ;

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

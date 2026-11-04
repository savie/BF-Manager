.class public Ll/ܳۤۨ;
.super Ljava/lang/Object;
.source "AAYE"


# static fields
.field public static final synthetic ᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public volatile synthetic _size$volatile:I

.field public ۙ:[Ll/۫ۤۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 0
    const-class v0, Ll/ܳۤۨ;

    const-string v1, "_size$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ܳۤۨ;->᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final ۙ(II)V
    .locals 3

    .line 150
    iget-object v0, p0, Ll/ܳۤۨ;->ۙ:[Ll/۫ۤۨ;

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 151
    aget-object v1, v0, p2

    invoke-static {v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 152
    aget-object v2, v0, p1

    invoke-static {v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 153
    aput-object v1, v0, p1

    .line 154
    aput-object v2, v0, p2

    .line 155
    invoke-interface {v1, p1}, Ll/۫ۤۨ;->ۙ(I)V

    .line 156
    invoke-interface {v2, p2}, Ll/۫ۤۨ;->ۙ(I)V

    return-void
.end method

.method private final ᩷(I)V
    .locals 3

    :goto_0
    if-gtz p1, :cond_0

    goto :goto_1

    .line 122
    :cond_0
    iget-object v0, p0, Ll/ܳۤۨ;->ۙ:[Ll/۫ۤۨ;

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    add-int/lit8 v1, p1, -0x1

    .line 123
    div-int/lit8 v1, v1, 0x2

    .line 124
    aget-object v2, v0, v1

    invoke-static {v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Comparable;

    aget-object v0, v0, p1

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-interface {v2, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_1

    :goto_1
    return-void

    .line 125
    :cond_1
    invoke-direct {p0, p1, v1}, Ll/ܳۤۨ;->ۙ(II)V

    move p1, v1

    goto :goto_0
.end method


# virtual methods
.method public final ۙ()Ll/۫ۤۨ;
    .locals 2

    .line 84
    iget-object v0, p0, Ll/ܳۤۨ;->ۙ:[Ll/۫ۤۨ;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۙ(I)Ll/۫ۤۨ;
    .locals 8

    .line 89
    iget-object v0, p0, Ll/ܳۤۨ;->ۙ:[Ll/۫ۤۨ;

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 26
    sget-object v1, Ll/ܳۤۨ;->᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    add-int/2addr v2, v3

    .line 27
    invoke-virtual {v1, p0, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 26
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    if-ge p1, v2, :cond_4

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    .line 92
    invoke-direct {p0, p1, v2}, Ll/ܳۤۨ;->ۙ(II)V

    add-int/lit8 v2, p1, -0x1

    .line 93
    div-int/lit8 v2, v2, 0x2

    if-lez p1, :cond_0

    .line 94
    aget-object v4, v0, p1

    invoke-static {v4}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/Comparable;

    aget-object v5, v0, v2

    invoke-static {v5}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-interface {v4, v5}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-gez v4, :cond_0

    .line 95
    invoke-direct {p0, p1, v2}, Ll/ܳۤۨ;->ۙ(II)V

    .line 96
    invoke-direct {p0, v2}, Ll/ܳۤۨ;->᩷(I)V

    goto :goto_2

    :cond_0
    :goto_0
    mul-int/lit8 v2, p1, 0x2

    add-int/lit8 v4, v2, 0x1

    .line 26
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v5

    if-lt v4, v5, :cond_1

    goto :goto_2

    .line 132
    :cond_1
    iget-object v5, p0, Ll/ܳۤۨ;->ۙ:[Ll/۫ۤۨ;

    invoke-static {v5}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x2

    .line 26
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v6

    if-ge v2, v6, :cond_2

    .line 133
    aget-object v6, v5, v2

    invoke-static {v6}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    check-cast v6, Ljava/lang/Comparable;

    aget-object v7, v5, v4

    invoke-static {v7}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-interface {v6, v7}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v6

    if-gez v6, :cond_2

    goto :goto_1

    :cond_2
    move v2, v4

    .line 134
    :goto_1
    aget-object v4, v5, p1

    invoke-static {v4}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/Comparable;

    aget-object v5, v5, v2

    invoke-static {v5}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-interface {v4, v5}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-gtz v4, :cond_3

    goto :goto_2

    .line 135
    :cond_3
    invoke-direct {p0, p1, v2}, Ll/ܳۤۨ;->ۙ(II)V

    move p1, v2

    goto :goto_0

    .line 26
    :cond_4
    :goto_2
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    .line 101
    aget-object p1, v0, p1

    invoke-static {p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    const/4 v2, 0x0

    .line 103
    invoke-interface {p1, v2}, Ll/۫ۤۨ;->ۙ(Ll/ܳۤۨ;)V

    .line 104
    invoke-interface {p1, v3}, Ll/۫ۤۨ;->ۙ(I)V

    .line 26
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    .line 105
    aput-object v2, v0, v1

    return-object p1
.end method

.method public final ۙ(Ll/ܽۜ᩵;)V
    .locals 4

    .line 112
    invoke-virtual {p1, p0}, Ll/ܽۜ᩵;->ۙ(Ll/ܳۤۨ;)V

    .line 141
    iget-object v0, p0, Ll/ܳۤۨ;->ۙ:[Ll/۫ۤۨ;

    .line 143
    sget-object v1, Ll/ܳۤۨ;->᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    if-nez v0, :cond_0

    const/4 v0, 0x4

    new-array v0, v0, [Ll/۫ۤۨ;

    iput-object v0, p0, Ll/ܳۤۨ;->ۙ:[Ll/۫ۤۨ;

    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    .line 144
    array-length v3, v0

    if-lt v2, v3, :cond_1

    .line 26
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    .line 144
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v2, "copyOf(...)"

    invoke-static {v0, v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ll/۫ۤۨ;

    iput-object v0, p0, Ll/ܳۤۨ;->ۙ:[Ll/۫ۤۨ;

    .line 26
    :cond_1
    :goto_0
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    .line 27
    invoke-virtual {v1, p0, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 115
    aput-object p1, v0, v2

    .line 116
    invoke-virtual {p1, v2}, Ll/ܽۜ᩵;->ۙ(I)V

    .line 117
    invoke-direct {p0, v2}, Ll/ܳۤۨ;->᩷(I)V

    return-void
.end method

.method public final ۤ()Ll/۫ۤۨ;
    .locals 2

    move-object v0, p0

    .line 16
    monitor-enter v0

    .line 41
    :try_start_0
    invoke-virtual {p0}, Ll/ܳۤۨ;->ۙ()Ll/۫ۤۨ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final ᩷(Ll/ܽۜ᩵;)V
    .locals 2

    move-object v0, p0

    .line 16
    monitor-enter v0

    .line 73
    :try_start_0
    invoke-virtual {p1}, Ll/ܽۜ᩵;->ۙ()Ll/ܳۤۨ;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p1}, Ll/ܽۜ᩵;->ᩴ()I

    move-result p1

    .line 78
    invoke-virtual {p0, p1}, Ll/ܳۤۨ;->ۙ(I)Ll/۫ۤۨ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final ᩷()Z
    .locals 1

    .line 0
    sget-object v0, Ll/ܳۤۨ;->᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 26
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩸()Ll/۫ۤۨ;
    .locals 2

    move-object v0, p0

    .line 16
    monitor-enter v0

    .line 0
    :try_start_0
    sget-object v1, Ll/ܳۤۨ;->᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 26
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 45
    invoke-virtual {p0, v1}, Ll/ܳۤۨ;->ۙ(I)Ll/۫ۤۨ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

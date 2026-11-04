.class public final Ll/ۤۙۨ;
.super Ll/ۡ᩷ۨ;
.source "D97F"


# instance fields
.field public final ۟:Ll/ۡ۬᩵;

.field public final synthetic ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceArray;


# direct methods
.method public constructor <init>(JLl/ۤۙۨ;Ll/ۡ۬᩵;I)V
    .locals 0

    .line 2772
    invoke-direct {p0, p1, p2, p3, p5}, Ll/ۡ᩷ۨ;-><init>(JLl/ۤۙۨ;I)V

    .line 2773
    iput-object p4, p0, Ll/ۤۙۨ;->۟:Ll/ۡ۬᩵;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2776
    sget p2, Ll/۠۬᩵;->᩹:I

    mul-int/lit8 p2, p2, 0x2

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object p1, p0, Ll/ۤۙۨ;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 2777
    sget v0, Ll/۠۬᩵;->᩹:I

    return v0
.end method

.method public final ۙ(ILl/ۜ᩷ۨ;)Ljava/lang/Object;
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    .line 2812
    iget-object v0, p0, Ll/ۤۙۨ;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(I)V
    .locals 2

    mul-int/lit8 p1, p1, 0x2

    .line 2797
    iget-object v0, p0, Ll/ۤۙۨ;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-void
.end method

.method public final ۙ(ILjava/lang/Object;)V
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    .line 2807
    iget-object v0, p0, Ll/ۤۙۨ;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-void
.end method

.method public final ۙ(ILl/ۧۢ᩵;)V
    .locals 5

    .line 2822
    sget p2, Ll/۠۬᩵;->᩹:I

    if-lt p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    sub-int/2addr p1, p2

    .line 2826
    :cond_1
    invoke-virtual {p0, p1}, Ll/ۤۙۨ;->᩷(I)Ljava/lang/Object;

    .line 2831
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Ll/ۤۙۨ;->ۤ(I)Ljava/lang/Object;

    move-result-object p2

    .line 2834
    instance-of v1, p2, Ll/ۛ۬᩵;

    iget-object v2, p0, Ll/ۤۙۨ;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget-object v3, p0, Ll/ۤۙۨ;->۟:Ll/ۡ۬᩵;

    const/4 v4, 0x0

    if-nez v1, :cond_9

    instance-of v1, p2, Ll/֫ۙۨ;

    if-eqz v1, :cond_3

    goto :goto_3

    .line 2855
    :cond_3
    invoke-static {}, Ll/۠۬᩵;->ᩴ()Ll/ۜ᩷ۨ;

    move-result-object v1

    if-eq p2, v1, :cond_8

    invoke-static {}, Ll/۠۬᩵;->᩸()Ll/ۜ᩷ۨ;

    move-result-object v1

    if-ne p2, v1, :cond_4

    goto :goto_2

    .line 2871
    :cond_4
    invoke-static {}, Ll/۠۬᩵;->᩻()Ll/ۜ᩷ۨ;

    move-result-object v1

    if-eq p2, v1, :cond_2

    invoke-static {}, Ll/۠۬᩵;->ܺ()Ll/ۜ᩷ۨ;

    move-result-object v1

    if-ne p2, v1, :cond_5

    goto :goto_1

    .line 2874
    :cond_5
    invoke-static {}, Ll/۠۬᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object p1

    if-eq p2, p1, :cond_b

    sget-object p1, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    if-ne p2, p1, :cond_6

    goto :goto_5

    .line 2877
    :cond_6
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object p1

    if-ne p2, p1, :cond_7

    goto :goto_5

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2878
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unexpected state: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    mul-int/lit8 p1, p1, 0x2

    .line 2797
    invoke-virtual {v2, p1, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    if-eqz v0, :cond_b

    .line 2774
    invoke-static {v3}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    return-void

    :cond_9
    :goto_3
    if-eqz v0, :cond_a

    .line 2837
    invoke-static {}, Ll/۠۬᩵;->ᩴ()Ll/ۜ᩷ۨ;

    move-result-object v1

    goto :goto_4

    :cond_a
    invoke-static {}, Ll/۠۬᩵;->᩸()Ll/ۜ᩷ۨ;

    move-result-object v1

    .line 2838
    :goto_4
    invoke-virtual {p0, p1, p2, v1}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    mul-int/lit8 p2, p1, 0x2

    .line 2797
    invoke-virtual {v2, p2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    xor-int/lit8 p2, v0, 0x1

    .line 2846
    invoke-virtual {p0, p1, p2}, Ll/ۤۙۨ;->ۙ(IZ)V

    if-eqz v0, :cond_b

    .line 2774
    invoke-static {v3}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    :cond_b
    :goto_5
    return-void
.end method

.method public final ۙ(ILl/۬᩷ۤ;)V
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    .line 2797
    iget-object v0, p0, Ll/ۤۙۨ;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-void
.end method

.method public final ۙ(IZ)V
    .locals 4

    if-eqz p2, :cond_0

    .line 2774
    iget-object p2, p0, Ll/ۤۙۨ;->۟:Ll/ۡ۬᩵;

    invoke-static {p2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 2888
    sget v0, Ll/۠۬᩵;->᩹:I

    int-to-long v0, v0

    iget-wide v2, p0, Ll/ۡ᩷ۨ;->ܿ:J

    mul-long v2, v2, v0

    int-to-long v0, p1

    add-long/2addr v2, v0

    invoke-virtual {p2, v2, v3}, Ll/ۡ۬᩵;->᩷(J)V

    .line 2889
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩷ۨ;->ۧ()V

    return-void
.end method

.method public final ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z
    .locals 3

    mul-int/lit8 p1, p1, 0x2

    const/4 v0, 0x1

    add-int/2addr p1, v0

    .line 0
    :cond_0
    iget-object v1, p0, Ll/ۤۙۨ;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v1, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v0

    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۤ(I)Ljava/lang/Object;
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    .line 2804
    iget-object v0, p0, Ll/ۤۙۨ;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ܺ()Ll/ۡ۬᩵;
    .locals 1

    .line 2774
    iget-object v0, p0, Ll/ۤۙۨ;->۟:Ll/ۡ۬᩵;

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ᩷(I)Ljava/lang/Object;
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    .line 2788
    iget-object v0, p0, Ll/ۤۙۨ;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ᩸(I)Ljava/lang/Object;
    .locals 3

    .line 2790
    invoke-virtual {p0, p1}, Ll/ۤۙۨ;->᩷(I)Ljava/lang/Object;

    move-result-object v0

    mul-int/lit8 p1, p1, 0x2

    .line 2797
    iget-object v1, p0, Ll/ۤۙۨ;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-object v0
.end method

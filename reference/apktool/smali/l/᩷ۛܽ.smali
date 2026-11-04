.class public final Ll/᩷ۛܽ;
.super Ljava/util/AbstractMap;
.source "1AZL"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ֡:Ll/ۜۨܽ;

.field public ۟:I

.field public ۢ:I

.field public final ܰ:Z

.field public final ܿ:Ll/ۙۛܽ;

.field public ᩳ:Ll/ۙۛܽ;

.field public ᩶:Ll/ۖۨܽ;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    const/4 v0, 0x0

    .line 52
    iput v0, p0, Ll/᩷ۛܽ;->ۢ:I

    .line 53
    iput v0, p0, Ll/᩷ۛܽ;->۟:I

    .line 85
    iput-boolean p1, p0, Ll/᩷ۛܽ;->ܰ:Z

    .line 86
    new-instance v0, Ll/ۙۛܽ;

    invoke-direct {v0, p1}, Ll/ۙۛܽ;-><init>(Z)V

    iput-object v0, p0, Ll/᩷ۛܽ;->ܿ:Ll/ۙۛܽ;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 675
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization is unsupported"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 1

    .line 669
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method private ۙ(Ll/ۙۛܽ;)V
    .locals 5

    .line 390
    iget-object v0, p1, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    .line 391
    iget-object v1, p1, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    .line 392
    iget-object v2, v1, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    .line 393
    iget-object v3, v1, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    .line 396
    iput-object v2, p1, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    if-eqz v2, :cond_0

    .line 398
    iput-object p1, v2, Ll/ۙۛܽ;->ᩳ:Ll/ۙۛܽ;

    .line 401
    :cond_0
    invoke-direct {p0, p1, v1}, Ll/᩷ۛܽ;->ۙ(Ll/ۙۛܽ;Ll/ۙۛܽ;)V

    .line 404
    iput-object p1, v1, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    .line 405
    iput-object v1, p1, Ll/ۙۛܽ;->ᩳ:Ll/ۙۛܽ;

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    .line 409
    iget v0, v0, Ll/ۙۛܽ;->᩶:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_2

    iget v2, v2, Ll/ۙۛܽ;->᩶:I

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Ll/ۙۛܽ;->᩶:I

    if-eqz v3, :cond_3

    .line 410
    iget v4, v3, Ll/ۙۛܽ;->᩶:I

    :cond_3
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v1, Ll/ۙۛܽ;->᩶:I

    return-void
.end method

.method private ۙ(Ll/ۙۛܽ;Ll/ۙۛܽ;)V
    .locals 2

    .line 304
    iget-object v0, p1, Ll/ۙۛܽ;->ᩳ:Ll/ۙۛܽ;

    const/4 v1, 0x0

    .line 305
    iput-object v1, p1, Ll/ۙۛܽ;->ᩳ:Ll/ۙۛܽ;

    if-eqz p2, :cond_0

    .line 307
    iput-object v0, p2, Ll/ۙۛܽ;->ᩳ:Ll/ۙۛܽ;

    :cond_0
    if-eqz v0, :cond_2

    .line 311
    iget-object v1, v0, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    if-ne v1, p1, :cond_1

    .line 312
    iput-object p2, v0, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    return-void

    .line 315
    :cond_1
    iput-object p2, v0, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    return-void

    .line 318
    :cond_2
    iput-object p2, p0, Ll/᩷ۛܽ;->ᩳ:Ll/ۙۛܽ;

    return-void
.end method

.method private ᩷(Ll/ۙۛܽ;)V
    .locals 5

    .line 415
    iget-object v0, p1, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    .line 416
    iget-object v1, p1, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    .line 417
    iget-object v2, v0, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    .line 418
    iget-object v3, v0, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    .line 421
    iput-object v3, p1, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    if-eqz v3, :cond_0

    .line 423
    iput-object p1, v3, Ll/ۙۛܽ;->ᩳ:Ll/ۙۛܽ;

    .line 426
    :cond_0
    invoke-direct {p0, p1, v0}, Ll/᩷ۛܽ;->ۙ(Ll/ۙۛܽ;Ll/ۙۛܽ;)V

    .line 429
    iput-object p1, v0, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    .line 430
    iput-object v0, p1, Ll/ۙۛܽ;->ᩳ:Ll/ۙۛܽ;

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    .line 434
    iget v1, v1, Ll/ۙۛܽ;->᩶:I

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v3, :cond_2

    iget v3, v3, Ll/ۙۛܽ;->᩶:I

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p1, Ll/ۙۛܽ;->᩶:I

    if-eqz v2, :cond_3

    .line 435
    iget v4, v2, Ll/ۙۛܽ;->᩶:I

    :cond_3
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Ll/ۙۛܽ;->᩶:I

    return-void
.end method

.method private ᩷(Ll/ۙۛܽ;Z)V
    .locals 7

    :goto_0
    if-eqz p1, :cond_e

    .line 330
    iget-object v0, p1, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    .line 331
    iget-object v1, p1, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 332
    iget v3, v0, Ll/ۙۛܽ;->᩶:I

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-eqz v1, :cond_1

    .line 333
    iget v4, v1, Ll/ۙۛܽ;->᩶:I

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    :goto_2
    sub-int v5, v3, v4

    const/4 v6, -0x2

    if-ne v5, v6, :cond_6

    .line 337
    iget-object v0, v1, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    .line 338
    iget-object v3, v1, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    if-eqz v3, :cond_2

    .line 339
    iget v3, v3, Ll/ۙۛܽ;->᩶:I

    goto :goto_3

    :cond_2
    const/4 v3, 0x0

    :goto_3
    if-eqz v0, :cond_3

    .line 340
    iget v2, v0, Ll/ۙۛܽ;->᩶:I

    :cond_3
    sub-int/2addr v2, v3

    const/4 v0, -0x1

    if-eq v2, v0, :cond_5

    if-nez v2, :cond_4

    if-nez p2, :cond_4

    goto :goto_4

    .line 347
    :cond_4
    invoke-direct {p0, v1}, Ll/᩷ۛܽ;->᩷(Ll/ۙۛܽ;)V

    .line 348
    invoke-direct {p0, p1}, Ll/᩷ۛܽ;->ۙ(Ll/ۙۛܽ;)V

    goto :goto_5

    .line 344
    :cond_5
    :goto_4
    invoke-direct {p0, p1}, Ll/᩷ۛܽ;->ۙ(Ll/ۙۛܽ;)V

    :goto_5
    if-eqz p2, :cond_d

    goto :goto_9

    :cond_6
    const/4 v1, 0x2

    const/4 v6, 0x1

    if-ne v5, v1, :cond_b

    .line 355
    iget-object v1, v0, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    .line 356
    iget-object v3, v0, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    if-eqz v3, :cond_7

    .line 357
    iget v3, v3, Ll/ۙۛܽ;->᩶:I

    goto :goto_6

    :cond_7
    const/4 v3, 0x0

    :goto_6
    if-eqz v1, :cond_8

    .line 358
    iget v2, v1, Ll/ۙۛܽ;->᩶:I

    :cond_8
    sub-int/2addr v2, v3

    if-eq v2, v6, :cond_a

    if-nez v2, :cond_9

    if-nez p2, :cond_9

    goto :goto_7

    .line 365
    :cond_9
    invoke-direct {p0, v0}, Ll/᩷ۛܽ;->ۙ(Ll/ۙۛܽ;)V

    .line 366
    invoke-direct {p0, p1}, Ll/᩷ۛܽ;->᩷(Ll/ۙۛܽ;)V

    goto :goto_8

    .line 362
    :cond_a
    :goto_7
    invoke-direct {p0, p1}, Ll/᩷ۛܽ;->᩷(Ll/ۙۛܽ;)V

    :goto_8
    if-eqz p2, :cond_d

    goto :goto_9

    :cond_b
    if-nez v5, :cond_c

    add-int/lit8 v3, v3, 0x1

    .line 373
    iput v3, p1, Ll/ۙۛܽ;->᩶:I

    if-eqz p2, :cond_d

    goto :goto_9

    .line 380
    :cond_c
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v6

    iput v0, p1, Ll/ۙۛܽ;->᩶:I

    if-nez p2, :cond_d

    goto :goto_9

    .line 329
    :cond_d
    iget-object p1, p1, Ll/ۙۛܽ;->ᩳ:Ll/ۙۛܽ;

    goto :goto_0

    :cond_e
    :goto_9
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    .line 122
    iput-object v0, p0, Ll/᩷ۛܽ;->ᩳ:Ll/ۙۛܽ;

    const/4 v0, 0x0

    .line 123
    iput v0, p0, Ll/᩷ۛܽ;->ۢ:I

    .line 124
    iget v0, p0, Ll/᩷ۛܽ;->۟:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩷ۛܽ;->۟:I

    .line 128
    iget-object v0, p0, Ll/᩷ۛܽ;->ܿ:Ll/ۙۛܽ;

    iput-object v0, v0, Ll/ۙۛܽ;->ۢ:Ll/ۙۛܽ;

    iput-object v0, v0, Ll/ۙۛܽ;->۟:Ll/ۙۛܽ;

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 206
    :try_start_0
    invoke-virtual {p0, p1, v0}, Ll/᩷ۛܽ;->ۙ(Ljava/lang/Object;Z)Ll/ۙۛܽ;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 443
    iget-object v0, p0, Ll/᩷ۛܽ;->᩶:Ll/ۖۨܽ;

    if-nez v0, :cond_0

    .line 445
    new-instance v0, Ll/ۖۨܽ;

    invoke-direct {v0, p0}, Ll/ۖۨܽ;-><init>(Ll/᩷ۛܽ;)V

    iput-object v0, p0, Ll/᩷ۛܽ;->᩶:Ll/ۖۨܽ;

    :cond_0
    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    .line 206
    :try_start_0
    invoke-virtual {p0, p1, v1}, Ll/᩷ۛܽ;->ۙ(Ljava/lang/Object;Z)Ll/ۙۛܽ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    .line 97
    iget-object p1, p1, Ll/ۙۛܽ;->ۡ:Ljava/lang/Object;

    return-object p1

    :cond_1
    return-object v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 452
    iget-object v0, p0, Ll/᩷ۛܽ;->֡:Ll/ۜۨܽ;

    if-nez v0, :cond_0

    .line 454
    new-instance v0, Ll/ۜۨܽ;

    invoke-direct {v0, p0}, Ll/ۜۨܽ;-><init>(Ll/᩷ۛܽ;)V

    iput-object v0, p0, Ll/᩷ۛܽ;->֡:Ll/ۜۨܽ;

    :cond_0
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    .line 111
    iget-boolean v0, p0, Ll/᩷ۛܽ;->ܰ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 112
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 114
    invoke-virtual {p0, p1, v0}, Ll/᩷ۛܽ;->ۙ(Ljava/lang/Object;Z)Ll/ۙۛܽ;

    move-result-object p1

    .line 115
    iget-object v0, p1, Ll/ۙۛܽ;->ۡ:Ljava/lang/Object;

    .line 116
    iput-object p2, p1, Ll/ۙۛܽ;->ۡ:Ljava/lang/Object;

    return-object v0

    .line 109
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "key == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    .line 206
    :try_start_0
    invoke-virtual {p0, p1, v1}, Ll/᩷ۛܽ;->ۙ(Ljava/lang/Object;Z)Ll/ۙۛܽ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    const/4 v1, 0x1

    .line 297
    invoke-virtual {p0, p1, v1}, Ll/᩷ۛܽ;->ۙ(Ll/ۙۛܽ;Z)V

    :cond_1
    if-eqz p1, :cond_2

    .line 134
    iget-object p1, p1, Ll/ۙۛܽ;->ۡ:Ljava/lang/Object;

    return-object p1

    :cond_2
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 91
    iget v0, p0, Ll/᩷ۛܽ;->ۢ:I

    return v0
.end method

.method public final ۙ(Ljava/lang/Object;Z)Ll/ۙۛܽ;
    .locals 9

    .line 144
    iget-object v0, p0, Ll/᩷ۛܽ;->ᩳ:Ll/ۙۛܽ;

    if-eqz v0, :cond_3

    .line 150
    move-object v1, p1

    check-cast v1, Ljava/lang/Comparable;

    .line 154
    :goto_0
    iget-object v2, v0, Ll/ۙۛܽ;->ܿ:Ljava/lang/Object;

    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    invoke-interface {v1, v2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    if-gez v2, :cond_1

    .line 164
    iget-object v3, v0, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    goto :goto_1

    :cond_1
    iget-object v3, v0, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    :goto_1
    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_2
    if-nez p2, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    const/4 p2, 0x1

    .line 181
    iget-object v7, p0, Ll/᩷ۛܽ;->ܿ:Ll/ۙۛܽ;

    if-nez v0, :cond_6

    .line 183
    instance-of v1, p1, Ljava/lang/Comparable;

    if-eqz v1, :cond_5

    .line 186
    new-instance v1, Ll/ۙۛܽ;

    iget-boolean v4, p0, Ll/᩷ۛܽ;->ܰ:Z

    iget-object v8, v7, Ll/ۙۛܽ;->ۢ:Ll/ۙۛܽ;

    move-object v3, v1

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v3 .. v8}, Ll/ۙۛܽ;-><init>(ZLl/ۙۛܽ;Ljava/lang/Object;Ll/ۙۛܽ;Ll/ۙۛܽ;)V

    .line 187
    iput-object v1, p0, Ll/᩷ۛܽ;->ᩳ:Ll/ۙۛܽ;

    goto :goto_4

    .line 184
    :cond_5
    new-instance p2, Ljava/lang/ClassCastException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, " is not Comparable"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 189
    :cond_6
    new-instance v1, Ll/ۙۛܽ;

    iget-boolean v4, p0, Ll/᩷ۛܽ;->ܰ:Z

    iget-object v8, v7, Ll/ۙۛܽ;->ۢ:Ll/ۙۛܽ;

    move-object v3, v1

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v3 .. v8}, Ll/ۙۛܽ;-><init>(ZLl/ۙۛܽ;Ljava/lang/Object;Ll/ۙۛܽ;Ll/ۙۛܽ;)V

    if-gez v2, :cond_7

    .line 191
    iput-object v1, v0, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    goto :goto_3

    .line 193
    :cond_7
    iput-object v1, v0, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    .line 195
    :goto_3
    invoke-direct {p0, v0, p2}, Ll/᩷ۛܽ;->᩷(Ll/ۙۛܽ;Z)V

    .line 197
    :goto_4
    iget p1, p0, Ll/᩷ۛܽ;->ۢ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/᩷ۛܽ;->ۢ:I

    .line 198
    iget p1, p0, Ll/᩷ۛܽ;->۟:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/᩷ۛܽ;->۟:I

    return-object v1
.end method

.method public final ۙ(Ll/ۙۛܽ;Z)V
    .locals 6

    if-eqz p2, :cond_0

    .line 237
    iget-object p2, p1, Ll/ۙۛܽ;->ۢ:Ll/ۙۛܽ;

    iget-object v0, p1, Ll/ۙۛܽ;->۟:Ll/ۙۛܽ;

    iput-object v0, p2, Ll/ۙۛܽ;->۟:Ll/ۙۛܽ;

    .line 238
    iget-object v0, p1, Ll/ۙۛܽ;->۟:Ll/ۙۛܽ;

    iput-object p2, v0, Ll/ۙۛܽ;->ۢ:Ll/ۙۛܽ;

    .line 241
    :cond_0
    iget-object p2, p1, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    .line 242
    iget-object v0, p1, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    .line 243
    iget-object v1, p1, Ll/ۙۛܽ;->ᩳ:Ll/ۙۛܽ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p2, :cond_5

    if-eqz v0, :cond_5

    .line 255
    iget v1, p2, Ll/ۙۛܽ;->᩶:I

    iget v4, v0, Ll/ۙۛܽ;->᩶:I

    if-le v1, v4, :cond_1

    .line 543
    iget-object v0, p2, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    :goto_0
    move-object v5, v0

    move-object v0, p2

    move-object p2, v5

    if-eqz p2, :cond_2

    .line 546
    iget-object v0, p2, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    goto :goto_0

    .line 532
    :cond_1
    iget-object p2, v0, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    :goto_1
    if-eqz p2, :cond_2

    .line 535
    iget-object v0, p2, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    move-object v5, v0

    move-object v0, p2

    move-object p2, v5

    goto :goto_1

    .line 256
    :cond_2
    invoke-virtual {p0, v0, v2}, Ll/᩷ۛܽ;->ۙ(Ll/ۙۛܽ;Z)V

    .line 259
    iget-object p2, p1, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    if-eqz p2, :cond_3

    .line 261
    iget v1, p2, Ll/ۙۛܽ;->᩶:I

    .line 262
    iput-object p2, v0, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    .line 263
    iput-object v0, p2, Ll/ۙۛܽ;->ᩳ:Ll/ۙۛܽ;

    .line 264
    iput-object v3, p1, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    .line 268
    :goto_2
    iget-object p2, p1, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    if-eqz p2, :cond_4

    .line 270
    iget v2, p2, Ll/ۙۛܽ;->᩶:I

    .line 271
    iput-object p2, v0, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    .line 272
    iput-object v0, p2, Ll/ۙۛܽ;->ᩳ:Ll/ۙۛܽ;

    .line 273
    iput-object v3, p1, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    .line 276
    :cond_4
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    iput p2, v0, Ll/ۙۛܽ;->᩶:I

    .line 277
    invoke-direct {p0, p1, v0}, Ll/᩷ۛܽ;->ۙ(Ll/ۙۛܽ;Ll/ۙۛܽ;)V

    return-void

    :cond_5
    if-eqz p2, :cond_6

    .line 280
    invoke-direct {p0, p1, p2}, Ll/᩷ۛܽ;->ۙ(Ll/ۙۛܽ;Ll/ۙۛܽ;)V

    .line 281
    iput-object v3, p1, Ll/ۙۛܽ;->֡:Ll/ۙۛܽ;

    goto :goto_3

    :cond_6
    if-eqz v0, :cond_7

    .line 283
    invoke-direct {p0, p1, v0}, Ll/᩷ۛܽ;->ۙ(Ll/ۙۛܽ;Ll/ۙۛܽ;)V

    .line 284
    iput-object v3, p1, Ll/ۙۛܽ;->֨:Ll/ۙۛܽ;

    goto :goto_3

    .line 286
    :cond_7
    invoke-direct {p0, p1, v3}, Ll/᩷ۛܽ;->ۙ(Ll/ۙۛܽ;Ll/ۙۛܽ;)V

    .line 289
    :goto_3
    invoke-direct {p0, v1, v2}, Ll/᩷ۛܽ;->᩷(Ll/ۙۛܽ;Z)V

    .line 290
    iget p1, p0, Ll/᩷ۛܽ;->ۢ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/᩷ۛܽ;->ۢ:I

    .line 291
    iget p1, p0, Ll/᩷ۛܽ;->۟:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/᩷ۛܽ;->۟:I

    return-void
.end method

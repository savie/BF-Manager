.class public final Ll/ܰᩳ᩵;
.super Ljava/lang/Object;
.source "S6IE"

# interfaces
.implements Ljava/util/Map;
.implements Ljava/io/Serializable;


# static fields
.field public static final ۙۙ:Ll/ܰᩳ᩵;


# instance fields
.field public ֡:Z

.field public ֨:I

.field public ۖ:[I

.field public ۜ:[Ljava/lang/Object;

.field public ۟:[Ljava/lang/Object;

.field public ۠:I

.field public ۡ:I

.field public ۢ:I

.field public ۬:Ll/֡ᩳ᩵;

.field public ܰ:Ll/᩶ᩳ᩵;

.field public ܿ:I

.field public ᩳ:Ll/ܿᩳ᩵;

.field public ᩶:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 481
    new-instance v0, Ll/ܰᩳ᩵;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܰᩳ᩵;-><init>(I)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ܰᩳ᩵;->֡:Z

    sput-object v0, Ll/ܰᩳ᩵;->ۙۙ:Ll/ܰᩳ᩵;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    if-ltz p1, :cond_1

    .line 624
    new-array v0, p1, [Ljava/lang/Object;

    .line 59
    new-array v1, p1, [I

    const/4 v2, 0x1

    if-ge p1, v2, :cond_0

    const/4 p1, 0x1

    :cond_0
    mul-int/lit8 p1, p1, 0x3

    .line 483
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p1

    .line 60
    new-array v3, p1, [I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object v0, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    .line 20
    iput-object v1, p0, Ll/ܰᩳ᩵;->ۖ:[I

    .line 22
    iput-object v3, p0, Ll/ܰᩳ᩵;->᩶:[I

    const/4 v0, 0x2

    .line 24
    iput v0, p0, Ll/ܰᩳ᩵;->֨:I

    const/4 v0, 0x0

    .line 26
    iput v0, p0, Ll/ܰᩳ᩵;->ۢ:I

    .line 485
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    add-int/2addr p1, v2

    .line 28
    iput p1, p0, Ll/ܰᩳ᩵;->ܿ:I

    return-void

    .line 622
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "capacity must be non-negative."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 77
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization is supported via proxy only"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    .line 72
    iget-boolean v0, p0, Ll/ܰᩳ᩵;->֡:Z

    if-eqz v0, :cond_0

    .line 73
    new-instance v0, Ll/۟ᩳ᩵;

    invoke-direct {v0, p0}, Ll/۟ᩳ᩵;-><init>(Ljava/util/Map;)V

    return-object v0

    .line 75
    :cond_0
    new-instance v0, Ljava/io/NotSerializableException;

    const-string v1, "The map cannot be serialized while it is being built."

    invoke-direct {v0, v1}, Ljava/io/NotSerializableException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic ۙ(Ll/ܰᩳ᩵;I)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->ᩴ(I)V

    return-void
.end method

.method private final ۙ(Z)V
    .locals 7

    .line 245
    iget-object v0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 246
    :goto_0
    iget v3, p0, Ll/ܰᩳ᩵;->ۢ:I

    if-ge v1, v3, :cond_3

    .line 247
    iget-object v3, p0, Ll/ܰᩳ᩵;->ۖ:[I

    aget v4, v3, v1

    if-ltz v4, :cond_2

    .line 249
    iget-object v5, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    aget-object v6, v5, v1

    aput-object v6, v5, v2

    if-eqz v0, :cond_0

    .line 250
    aget-object v5, v0, v1

    aput-object v5, v0, v2

    :cond_0
    if-eqz p1, :cond_1

    .line 252
    aput v4, v3, v2

    .line 253
    iget-object v3, p0, Ll/ܰᩳ᩵;->᩶:[I

    add-int/lit8 v5, v2, 0x1

    aput v5, v3, v4

    :cond_1
    add-int/lit8 v2, v2, 0x1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 259
    :cond_3
    iget-object p1, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    invoke-static {v2, v3, p1}, Ll/᩹ᩳ᩵;->ۙ(II[Ljava/lang/Object;)V

    if-eqz v0, :cond_4

    .line 260
    iget p1, p0, Ll/ܰᩳ᩵;->ۢ:I

    invoke-static {v2, p1, v0}, Ll/᩹ᩳ᩵;->ۙ(II[Ljava/lang/Object;)V

    .line 261
    :cond_4
    iput v2, p0, Ll/ܰᩳ᩵;->ۢ:I

    return-void
.end method

.method public static final ۙ(Ll/ܰᩳ᩵;)[Ljava/lang/Object;
    .locals 1

    .line 233
    iget-object v0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    .line 193
    :cond_0
    iget-object v0, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    array-length v0, v0

    if-ltz v0, :cond_1

    .line 624
    new-array v0, v0, [Ljava/lang/Object;

    .line 236
    iput-object v0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    return-object v0

    .line 622
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "capacity must be non-negative."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic ۤ(Ll/ܰᩳ᩵;)I
    .locals 0

    .line 14
    iget p0, p0, Ll/ܰᩳ᩵;->ۢ:I

    return p0
.end method

.method private final ۤ(I)V
    .locals 5

    .line 197
    iget v0, p0, Ll/ܰᩳ᩵;->ۡ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܰᩳ᩵;->ۡ:I

    .line 269
    iget v0, p0, Ll/ܰᩳ᩵;->ۢ:I

    .line 42
    iget v1, p0, Ll/ܰᩳ᩵;->۠:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    .line 269
    invoke-direct {p0, v2}, Ll/ܰᩳ᩵;->ۙ(Z)V

    .line 270
    :cond_0
    new-array v0, p1, [I

    iput-object v0, p0, Ll/ܰᩳ᩵;->᩶:[I

    .line 485
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 271
    iput p1, p0, Ll/ܰᩳ᩵;->ܿ:I

    .line 274
    :goto_0
    iget p1, p0, Ll/ܰᩳ᩵;->ۢ:I

    if-ge v2, p1, :cond_4

    add-int/lit8 p1, v2, 0x1

    .line 284
    iget-object v0, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    aget-object v0, v0, v2

    invoke-direct {p0, v0}, Ll/ܰᩳ᩵;->ܳ(Ljava/lang/Object;)I

    move-result v0

    .line 285
    iget v1, p0, Ll/ܰᩳ᩵;->֨:I

    .line 287
    :goto_1
    iget-object v3, p0, Ll/ܰᩳ᩵;->᩶:[I

    aget v4, v3, v0

    if-nez v4, :cond_1

    .line 289
    aput p1, v3, v0

    .line 290
    iget-object v1, p0, Ll/ܰᩳ᩵;->ۖ:[I

    aput v0, v1, v2

    move v2, p1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_3

    add-int/lit8 v4, v0, -0x1

    if-nez v0, :cond_2

    .line 194
    array-length v0, v3

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_2
    move v0, v4

    goto :goto_1

    .line 276
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method

.method private final ܳ(Ljava/lang/Object;)I
    .locals 1

    if-eqz p1, :cond_0

    .line 240
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const v0, -0x61c88647

    mul-int p1, p1, v0

    iget v0, p0, Ll/ܰᩳ᩵;->ܿ:I

    ushr-int/2addr p1, v0

    return p1
.end method

.method public static final synthetic ܳ(Ll/ܰᩳ᩵;)[Ljava/lang/Object;
    .locals 0

    .line 14
    iget-object p0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    return-object p0
.end method

.method private final ᩴ(Ljava/lang/Object;)I
    .locals 2

    .line 311
    iget v0, p0, Ll/ܰᩳ᩵;->ۢ:I

    :cond_0
    const/4 v1, -0x1

    add-int/2addr v0, v1

    if-ltz v0, :cond_1

    .line 313
    iget-object v1, p0, Ll/ܰᩳ᩵;->ۖ:[I

    aget v1, v1, v0

    if-ltz v1, :cond_0

    iget-object v1, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    invoke-static {v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    aget-object v1, v1, v0

    invoke-static {v1, p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_1
    return v1
.end method

.method private final ᩴ(I)V
    .locals 9

    .line 363
    iget-object v0, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    const-string v1, "<this>"

    .line 0
    invoke-static {v0, v1}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 673
    aput-object v1, v0, p1

    .line 364
    iget-object v0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 673
    aput-object v1, v0, p1

    .line 365
    :cond_0
    iget-object v0, p0, Ll/ܰᩳ᩵;->ۖ:[I

    aget v0, v0, p1

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    move v3, v0

    :cond_1
    add-int/lit8 v4, v3, -0x1

    if-nez v3, :cond_2

    .line 194
    iget-object v3, p0, Ll/ܰᩳ᩵;->᩶:[I

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_2
    move v3, v4

    .line 377
    :goto_1
    iget-object v4, p0, Ll/ܰᩳ᩵;->᩶:[I

    aget v5, v4, v3

    add-int/lit8 v2, v2, 0x1

    .line 378
    iget v6, p0, Ll/ܰᩳ᩵;->֨:I

    if-le v2, v6, :cond_3

    .line 380
    aput v1, v4, v0

    goto :goto_2

    :cond_3
    if-nez v5, :cond_4

    .line 385
    aput v1, v4, v0

    .line 366
    :goto_2
    iget-object v0, p0, Ll/ܰᩳ᩵;->ۖ:[I

    const/4 v1, -0x1

    aput v1, v0, p1

    .line 42
    iget p1, p0, Ll/ܰᩳ᩵;->۠:I

    add-int/2addr p1, v1

    .line 367
    iput p1, p0, Ll/ܰᩳ᩵;->۠:I

    .line 197
    iget p1, p0, Ll/ܰᩳ᩵;->ۡ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܰᩳ᩵;->ۡ:I

    return-void

    .line 388
    :cond_4
    iget-object v4, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    add-int/lit8 v6, v5, -0x1

    aget-object v4, v4, v6

    invoke-direct {p0, v4}, Ll/ܰᩳ᩵;->ܳ(Ljava/lang/Object;)I

    move-result v4

    sub-int/2addr v4, v3

    .line 194
    iget-object v7, p0, Ll/ܰᩳ᩵;->᩶:[I

    array-length v8, v7

    add-int/lit8 v8, v8, -0x1

    and-int/2addr v4, v8

    if-lt v4, v2, :cond_1

    .line 395
    aput v5, v7, v0

    .line 396
    iget-object v2, p0, Ll/ܰᩳ᩵;->ۖ:[I

    aput v0, v2, v6

    move v0, v3

    goto :goto_0
.end method

.method public static final synthetic ᩴ(Ll/ܰᩳ᩵;)[I
    .locals 0

    .line 14
    iget-object p0, p0, Ll/ܰᩳ᩵;->ۖ:[I

    return-object p0
.end method

.method private final ᩷(I)V
    .locals 5

    .line 193
    iget-object v0, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    array-length v1, v0

    .line 213
    iget v2, p0, Ll/ܰᩳ᩵;->ۢ:I

    sub-int/2addr v1, v2

    .line 42
    iget v3, p0, Ll/ܰᩳ᩵;->۠:I

    sub-int v3, v2, v3

    const/4 v4, 0x1

    if-ge v1, p1, :cond_0

    add-int/2addr v1, v3

    if-lt v1, p1, :cond_0

    .line 193
    array-length v1, v0

    .line 217
    div-int/lit8 v1, v1, 0x4

    if-lt v3, v1, :cond_0

    .line 206
    invoke-direct {p0, v4}, Ll/ܰᩳ᩵;->ۙ(Z)V

    return-void

    :cond_0
    add-int/2addr v2, p1

    if-ltz v2, :cond_7

    .line 193
    array-length p1, v0

    if-le v2, p1, :cond_6

    array-length p1, v0

    shr-int/lit8 v1, p1, 0x1

    add-int/2addr p1, v1

    sub-int v1, p1, v2

    if-gez v1, :cond_1

    move p1, v2

    :cond_1
    const v1, 0x7ffffff7

    sub-int v3, p1, v1

    if-lez v3, :cond_3

    if-le v2, v1, :cond_2

    const p1, 0x7fffffff

    goto :goto_0

    :cond_2
    const p1, 0x7ffffff7

    .line 668
    :cond_3
    :goto_0
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    iput-object v0, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    .line 225
    iget-object v0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    if-eqz v0, :cond_4

    .line 668
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    .line 225
    :goto_1
    iput-object v0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    .line 226
    iget-object v0, p0, Ll/ܰᩳ᩵;->ۖ:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ll/ܰᩳ᩵;->ۖ:[I

    if-ge p1, v4, :cond_5

    goto :goto_2

    :cond_5
    move v4, p1

    :goto_2
    mul-int/lit8 v4, v4, 0x3

    .line 483
    invoke-static {v4}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p1

    .line 194
    iget-object v0, p0, Ll/ܰᩳ᩵;->᩶:[I

    array-length v0, v0

    if-le p1, v0, :cond_6

    .line 228
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->ۤ(I)V

    :cond_6
    return-void

    .line 221
    :cond_7
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1
.end method

.method public static final synthetic ᩷(Ll/ܰᩳ᩵;)[Ljava/lang/Object;
    .locals 0

    .line 14
    iget-object p0, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    return-object p0
.end method

.method private final ᩸(Ljava/lang/Object;)I
    .locals 5

    .line 299
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->ܳ(Ljava/lang/Object;)I

    move-result v0

    .line 300
    iget v1, p0, Ll/ܰᩳ᩵;->֨:I

    .line 302
    :goto_0
    iget-object v2, p0, Ll/ܰᩳ᩵;->᩶:[I

    aget v2, v2, v0

    const/4 v3, -0x1

    if-nez v2, :cond_0

    return v3

    .line 304
    :cond_0
    iget-object v4, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    add-int/lit8 v2, v2, -0x1

    aget-object v4, v4, v2

    invoke-static {v4, p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v2

    :cond_1
    add-int/2addr v1, v3

    if-gez v1, :cond_2

    return v3

    :cond_2
    add-int/lit8 v2, v0, -0x1

    if-nez v0, :cond_3

    .line 194
    iget-object v0, p0, Ll/ܰᩳ᩵;->᩶:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_0
.end method

.method public static final synthetic ᩸(Ll/ܰᩳ᩵;)I
    .locals 0

    .line 14
    iget p0, p0, Ll/ܰᩳ᩵;->ۡ:I

    return p0
.end method


# virtual methods
.method public final clear()V
    .locals 6

    .line 118
    invoke-virtual {p0}, Ll/ܰᩳ᩵;->᩷()V

    .line 120
    iget v0, p0, Ll/ܰᩳ᩵;->ۢ:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    if-ltz v0, :cond_1

    const/4 v2, 0x0

    .line 121
    :goto_0
    iget-object v3, p0, Ll/ܰᩳ᩵;->ۖ:[I

    aget v4, v3, v2

    if-ltz v4, :cond_0

    .line 123
    iget-object v5, p0, Ll/ܰᩳ᩵;->᩶:[I

    aput v1, v5, v4

    const/4 v4, -0x1

    .line 124
    aput v4, v3, v2

    :cond_0
    if-eq v2, v0, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 127
    :cond_1
    iget-object v0, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    iget v2, p0, Ll/ܰᩳ᩵;->ۢ:I

    invoke-static {v1, v2, v0}, Ll/᩹ᩳ᩵;->ۙ(II[Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget v2, p0, Ll/ܰᩳ᩵;->ۢ:I

    invoke-static {v1, v2, v0}, Ll/᩹ᩳ᩵;->ۙ(II[Ljava/lang/Object;)V

    .line 129
    :cond_2
    iput v1, p0, Ll/ܰᩳ᩵;->۠:I

    .line 130
    iput v1, p0, Ll/ܰᩳ᩵;->ۢ:I

    .line 197
    iget v0, p0, Ll/ܰᩳ᩵;->ۡ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܰᩳ᩵;->ۡ:I

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->᩸(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->ᩴ(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 153
    iget-object v0, p0, Ll/ܰᩳ᩵;->ܰ:Ll/᩶ᩳ᩵;

    if-nez v0, :cond_0

    .line 155
    new-instance v0, Ll/᩶ᩳ᩵;

    invoke-direct {v0, p0}, Ll/᩶ᩳ᩵;-><init>(Ll/ܰᩳ᩵;)V

    .line 156
    iput-object v0, p0, Ll/ܰᩳ᩵;->ܰ:Ll/᩶ᩳ᩵;

    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-eq p1, p0, :cond_1

    .line 163
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 164
    check-cast p1, Ljava/util/Map;

    .line 42
    iget v0, p0, Ll/ܰᩳ᩵;->۠:I

    .line 409
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܰᩳ᩵;->ۙ(Ljava/util/Collection;)Z

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

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 84
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->᩸(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 86
    :cond_0
    iget-object v0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 5

    .line 473
    new-instance v0, Ll/᩵ᩳ᩵;

    .line 544
    invoke-direct {v0, p0}, Ll/ۛᩳ᩵;-><init>(Ll/ܰᩳ᩵;)V

    const/4 v1, 0x0

    .line 170
    :goto_0
    invoke-virtual {v0}, Ll/ۛᩳ᩵;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 556
    invoke-virtual {v0}, Ll/ۛᩳ᩵;->᩷()I

    move-result v2

    invoke-virtual {v0}, Ll/ۛᩳ᩵;->᩸()Ll/ܰᩳ᩵;

    move-result-object v3

    invoke-static {v3}, Ll/ܰᩳ᩵;->ۤ(Ll/ܰᩳ᩵;)I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 557
    invoke-virtual {v0}, Ll/ۛᩳ᩵;->᩷()I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {v0, v3}, Ll/ۛᩳ᩵;->᩷(I)V

    invoke-virtual {v0, v2}, Ll/ۛᩳ᩵;->ۤ(I)V

    .line 558
    invoke-virtual {v0}, Ll/ۛᩳ᩵;->᩸()Ll/ܰᩳ᩵;

    move-result-object v2

    invoke-static {v2}, Ll/ܰᩳ᩵;->᩷(Ll/ܰᩳ᩵;)[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Ll/ۛᩳ᩵;->ۤ()I

    move-result v3

    aget-object v2, v2, v3

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v0}, Ll/ۛᩳ᩵;->᩸()Ll/ܰᩳ᩵;

    move-result-object v3

    invoke-static {v3}, Ll/ܰᩳ᩵;->ܳ(Ll/ܰᩳ᩵;)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/ۛᩳ᩵;->ۤ()I

    move-result v4

    aget-object v3, v3, v4

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    :goto_2
    xor-int/2addr v2, v3

    .line 559
    invoke-virtual {v0}, Ll/ۛᩳ᩵;->ᩴ()V

    add-int/2addr v1, v2

    goto :goto_0

    .line 556
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_3
    return v1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 42
    iget v0, p0, Ll/ܰᩳ᩵;->۠:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 135
    iget-object v0, p0, Ll/ܰᩳ᩵;->ᩳ:Ll/ܿᩳ᩵;

    if-nez v0, :cond_0

    .line 137
    new-instance v0, Ll/ܿᩳ᩵;

    invoke-direct {v0, p0}, Ll/ܿᩳ᩵;-><init>(Ll/ܰᩳ᩵;)V

    .line 138
    iput-object v0, p0, Ll/ܰᩳ᩵;->ᩳ:Ll/ܿᩳ᩵;

    :cond_0
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 90
    invoke-virtual {p0}, Ll/ܰᩳ᩵;->᩷()V

    .line 91
    invoke-virtual {p0, p1}, Ll/ܰᩳ᩵;->ۙ(Ljava/lang/Object;)I

    move-result p1

    .line 233
    iget-object v0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 193
    :cond_0
    iget-object v0, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    array-length v0, v0

    if-ltz v0, :cond_2

    .line 624
    new-array v0, v0, [Ljava/lang/Object;

    .line 236
    iput-object v0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    :goto_0
    if-gez p1, :cond_1

    neg-int p1, p1

    add-int/lit8 p1, p1, -0x1

    .line 94
    aget-object v1, v0, p1

    .line 95
    aput-object p2, v0, p1

    return-object v1

    .line 98
    :cond_1
    aput-object p2, v0, p1

    const/4 p1, 0x0

    return-object p1

    .line 622
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "capacity must be non-negative."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 5

    const-string v0, "from"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-virtual {p0}, Ll/ܰᩳ᩵;->᩷()V

    .line 105
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    .line 443
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 444
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {p0, v0}, Ll/ܰᩳ᩵;->᩷(I)V

    .line 445
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 447
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 448
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 427
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ܰᩳ᩵;->ۙ(Ljava/lang/Object;)I

    move-result v1

    .line 233
    iget-object v2, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    if-eqz v2, :cond_2

    goto :goto_1

    .line 193
    :cond_2
    iget-object v2, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    array-length v2, v2

    if-ltz v2, :cond_4

    .line 624
    new-array v2, v2, [Ljava/lang/Object;

    .line 236
    iput-object v2, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    :goto_1
    if-ltz v1, :cond_3

    .line 430
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v2, v1

    goto :goto_0

    :cond_3
    neg-int v1, v1

    add-int/lit8 v1, v1, -0x1

    .line 433
    aget-object v3, v2, v1

    .line 434
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v3}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 435
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v2, v1

    goto :goto_0

    .line 622
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "capacity must be non-negative."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 109
    invoke-virtual {p0}, Ll/ܰᩳ᩵;->᩷()V

    .line 110
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->᩸(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 112
    :cond_0
    iget-object v0, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    aget-object v0, v0, p1

    .line 113
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->ᩴ(I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 42
    iget v0, p0, Ll/ܰᩳ᩵;->۠:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    iget v1, p0, Ll/ܰᩳ᩵;->۠:I

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, 0x2

    .line 177
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "{"

    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    new-instance v1, Ll/᩵ᩳ᩵;

    .line 544
    invoke-direct {v1, p0}, Ll/ۛᩳ᩵;-><init>(Ll/ܰᩳ᩵;)V

    const/4 v2, 0x0

    .line 181
    :goto_0
    invoke-virtual {v1}, Ll/ۛᩳ᩵;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    if-lez v2, :cond_0

    const-string v3, ", "

    .line 182
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    :cond_0
    invoke-virtual {v1}, Ll/ۛᩳ᩵;->᩷()I

    move-result v3

    invoke-virtual {v1}, Ll/ۛᩳ᩵;->᩸()Ll/ܰᩳ᩵;

    move-result-object v4

    invoke-static {v4}, Ll/ܰᩳ᩵;->ۤ(Ll/ܰᩳ᩵;)I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 565
    invoke-virtual {v1}, Ll/ۛᩳ᩵;->᩷()I

    move-result v3

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v1, v4}, Ll/ۛᩳ᩵;->᩷(I)V

    invoke-virtual {v1, v3}, Ll/ۛᩳ᩵;->ۤ(I)V

    .line 566
    invoke-virtual {v1}, Ll/ۛᩳ᩵;->᩸()Ll/ܰᩳ᩵;

    move-result-object v3

    invoke-static {v3}, Ll/ܰᩳ᩵;->᩷(Ll/ܰᩳ᩵;)[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1}, Ll/ۛᩳ᩵;->ۤ()I

    move-result v4

    aget-object v3, v3, v4

    .line 567
    invoke-virtual {v1}, Ll/ۛᩳ᩵;->᩸()Ll/ܰᩳ᩵;

    move-result-object v4

    const-string v5, "(this Map)"

    if-ne v3, v4, :cond_1

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_1
    const/16 v3, 0x3d

    .line 568
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 569
    invoke-virtual {v1}, Ll/ۛᩳ᩵;->᩸()Ll/ܰᩳ᩵;

    move-result-object v3

    invoke-static {v3}, Ll/ܰᩳ᩵;->ܳ(Ll/ܰᩳ᩵;)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ll/ۛᩳ᩵;->ۤ()I

    move-result v4

    aget-object v3, v3, v4

    .line 570
    invoke-virtual {v1}, Ll/ۛᩳ᩵;->᩸()Ll/ܰᩳ᩵;

    move-result-object v4

    if-ne v3, v4, :cond_2

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 571
    :goto_2
    invoke-virtual {v1}, Ll/ۛᩳ᩵;->ᩴ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 564
    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_4
    const-string v1, "}"

    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 144
    iget-object v0, p0, Ll/ܰᩳ᩵;->۬:Ll/֡ᩳ᩵;

    if-nez v0, :cond_0

    .line 146
    new-instance v0, Ll/֡ᩳ᩵;

    invoke-direct {v0, p0}, Ll/֡ᩳ᩵;-><init>(Ll/ܰᩳ᩵;)V

    .line 147
    iput-object v0, p0, Ll/ܰᩳ᩵;->۬:Ll/֡ᩳ᩵;

    :cond_0
    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;)I
    .locals 7

    .line 320
    invoke-virtual {p0}, Ll/ܰᩳ᩵;->᩷()V

    .line 322
    :goto_0
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->ܳ(Ljava/lang/Object;)I

    move-result v0

    .line 324
    iget v1, p0, Ll/ܰᩳ᩵;->֨:I

    mul-int/lit8 v1, v1, 0x2

    .line 194
    iget-object v2, p0, Ll/ܰᩳ᩵;->᩶:[I

    array-length v2, v2

    .line 324
    div-int/lit8 v2, v2, 0x2

    if-le v1, v2, :cond_0

    move v1, v2

    :cond_0
    const/4 v2, 0x0

    .line 327
    :goto_1
    iget-object v3, p0, Ll/ܰᩳ᩵;->᩶:[I

    aget v4, v3, v0

    const/4 v5, 0x1

    if-nez v4, :cond_3

    .line 329
    iget v1, p0, Ll/ܰᩳ᩵;->ۢ:I

    .line 193
    iget-object v4, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    array-length v6, v4

    if-lt v1, v6, :cond_1

    .line 330
    invoke-direct {p0, v5}, Ll/ܰᩳ᩵;->᩷(I)V

    goto :goto_0

    :cond_1
    add-int/lit8 v6, v1, 0x1

    .line 333
    iput v6, p0, Ll/ܰᩳ᩵;->ۢ:I

    .line 334
    aput-object p1, v4, v1

    .line 335
    iget-object p1, p0, Ll/ܰᩳ᩵;->ۖ:[I

    aput v0, p1, v1

    .line 336
    aput v6, v3, v0

    .line 42
    iget p1, p0, Ll/ܰᩳ᩵;->۠:I

    add-int/2addr p1, v5

    .line 337
    iput p1, p0, Ll/ܰᩳ᩵;->۠:I

    .line 197
    iget p1, p0, Ll/ܰᩳ᩵;->ۡ:I

    add-int/2addr p1, v5

    iput p1, p0, Ll/ܰᩳ᩵;->ۡ:I

    .line 339
    iget p1, p0, Ll/ܰᩳ᩵;->֨:I

    if-le v2, p1, :cond_2

    iput v2, p0, Ll/ܰᩳ᩵;->֨:I

    :cond_2
    return v1

    .line 342
    :cond_3
    iget-object v3, p0, Ll/ܰᩳ᩵;->۟:[Ljava/lang/Object;

    add-int/lit8 v6, v4, -0x1

    aget-object v3, v3, v6

    invoke-static {v3, p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    neg-int p1, v4

    return p1

    :cond_4
    add-int/lit8 v2, v2, 0x1

    if-le v2, v1, :cond_5

    .line 194
    iget-object v0, p0, Ll/ܰᩳ᩵;->᩶:[I

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    .line 346
    invoke-direct {p0, v0}, Ll/ܰᩳ᩵;->ۤ(I)V

    goto :goto_0

    :cond_5
    add-int/lit8 v3, v0, -0x1

    if-nez v0, :cond_6

    .line 194
    iget-object v0, p0, Ll/ܰᩳ᩵;->᩶:[I

    array-length v0, v0

    sub-int/2addr v0, v5

    goto :goto_1

    :cond_6
    move v0, v3

    goto :goto_1
.end method

.method public final ۙ()Ll/ܰᩳ᩵;
    .locals 2

    .line 65
    invoke-virtual {p0}, Ll/ܰᩳ᩵;->᩷()V

    const/4 v0, 0x1

    .line 66
    iput-boolean v0, p0, Ll/ܰᩳ᩵;->֡:Z

    .line 42
    iget v0, p0, Ll/ܰᩳ᩵;->۠:I

    if-lez v0, :cond_0

    return-object p0

    :cond_0
    const-string v0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>"

    .line 68
    sget-object v1, Ll/ܰᩳ᩵;->ۙۙ:Ll/ܰᩳ᩵;

    invoke-static {v1, v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final ۙ(Ljava/util/Collection;)Z
    .locals 2

    const-string v0, "m"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 413
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 414
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 417
    :try_start_0
    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0, v0}, Ll/ܰᩳ᩵;->ۙ(Ljava/util/Map$Entry;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    :catch_0
    :cond_1
    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final ۙ(Ljava/util/Map$Entry;)Z
    .locals 2

    const-string v0, "entry"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܰᩳ᩵;->᩸(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 406
    :cond_0
    iget-object v1, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    invoke-static {v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    aget-object v0, v1, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۤ(Ljava/lang/Object;)Z
    .locals 0

    .line 464
    invoke-virtual {p0}, Ll/ܰᩳ᩵;->᩷()V

    .line 465
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->ᩴ(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 467
    :cond_0
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->ᩴ(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ᩷()V
    .locals 1

    .line 201
    iget-boolean v0, p0, Ll/ܰᩳ᩵;->֡:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ᩷(Ljava/lang/Object;)Z
    .locals 0

    .line 355
    invoke-virtual {p0}, Ll/ܰᩳ᩵;->᩷()V

    .line 356
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->᩸(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 358
    :cond_0
    invoke-direct {p0, p1}, Ll/ܰᩳ᩵;->ᩴ(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ᩷(Ljava/util/Map$Entry;)Z
    .locals 2

    const-string v0, "entry"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 455
    invoke-virtual {p0}, Ll/ܰᩳ᩵;->᩷()V

    .line 456
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܰᩳ᩵;->᩸(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    goto :goto_0

    .line 458
    :cond_0
    iget-object v1, p0, Ll/ܰᩳ᩵;->ۜ:[Ljava/lang/Object;

    invoke-static {v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    aget-object v1, v1, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 459
    :cond_1
    invoke-direct {p0, v0}, Ll/ܰᩳ᩵;->ᩴ(I)V

    const/4 p1, 0x1

    return p1
.end method

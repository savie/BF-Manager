.class public final Ll/ܰۡۛ;
.super Ljava/lang/Object;
.source "Z5U8"


# instance fields
.field public final ۙ:[I

.field public final ۤ:[Ll/ᩳۡۛ;

.field public final ۫:I

.field public final ܳ:I

.field public final ᩴ:[I

.field public final ᩷:[B

.field public final ᩸:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 7

    .line 346
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v0

    const/16 v1, 0x100

    if-ge v0, v1, :cond_0

    const/16 v0, 0x1000

    goto :goto_0

    :cond_0
    const/high16 v1, 0x100000

    .line 355
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 325
    :goto_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 326
    :try_start_0
    new-array v2, v0, [B

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 329
    :goto_1
    invoke-virtual {p1, v2, v3, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1

    .line 330
    invoke-virtual {v1, v2, v3, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 333
    :cond_1
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    const/4 p1, 0x1

    if-ne v4, p1, :cond_2

    goto :goto_2

    .line 337
    :cond_2
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 338
    :goto_2
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 166
    array-length v0, v2

    .line 180
    invoke-direct {p0, v2, p1}, Ll/ܰۡۛ;-><init>([BZ)V

    return-void

    :catchall_0
    move-exception p1

    .line 325
    :try_start_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    throw p1
.end method

.method public constructor <init>([BZ)V
    .locals 12

    .line 193
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 194
    iput-object p1, p0, Ll/ܰۡۛ;->᩷:[B

    const/4 v0, 0x4

    if-eqz p2, :cond_1

    const/4 p2, 0x6

    .line 200
    invoke-virtual {p0, p2}, Ll/ܰۡۛ;->᩸(I)S

    move-result v1

    const/16 v2, 0x48

    if-gt v1, v2, :cond_0

    if-ne v1, v2, :cond_1

    .line 201
    invoke-virtual {p0, v0}, Ll/ܰۡۛ;->᩸(I)S

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 202
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 204
    invoke-virtual {p0, p2}, Ll/ܰۡۛ;->᩸(I)S

    move-result p2

    .line 206
    invoke-virtual {p0, v0}, Ll/ܰۡۛ;->᩸(I)S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    const-string v1, "Unsupported class file version "

    const-string v2, "."

    .line 0
    invoke-static {v1, p2, v0, v2}, Ll/ۜۚ᩸;->ۙ(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 206
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/16 p2, 0x8

    .line 210
    invoke-virtual {p0, p2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    .line 211
    new-array v2, v1, [I

    iput-object v2, p0, Ll/ܰۡۛ;->ᩴ:[I

    .line 212
    new-array v2, v1, [Ljava/lang/String;

    iput-object v2, p0, Ll/ܰۡۛ;->᩸:[Ljava/lang/String;

    const/4 v2, 0x0

    const/16 v3, 0xa

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_1
    if-ge v4, v1, :cond_3

    .line 224
    iget-object v8, p0, Ll/ܰۡۛ;->ᩴ:[I

    add-int/lit8 v9, v4, 0x1

    add-int/lit8 v10, v3, 0x1

    aput v10, v8, v4

    .line 226
    aget-byte v8, p1, v3

    const/4 v11, 0x3

    packed-switch v8, :pswitch_data_0

    .line 269
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_1
    const/4 v6, 0x1

    :pswitch_2
    const/4 v7, 0x1

    goto :goto_2

    :pswitch_3
    const/4 v4, 0x4

    goto :goto_3

    :pswitch_4
    add-int/lit8 v4, v4, 0x2

    const/16 v8, 0x9

    move v9, v4

    const/16 v4, 0x9

    goto :goto_3

    :goto_2
    :pswitch_5
    const/4 v4, 0x5

    goto :goto_3

    .line 250
    :pswitch_6
    invoke-virtual {p0, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v4

    add-int/2addr v11, v4

    if-le v11, v5, :cond_2

    move v4, v11

    move v5, v4

    goto :goto_3

    :cond_2
    :pswitch_7
    move v4, v11

    :goto_3
    add-int/2addr v3, v4

    move v4, v9

    goto :goto_1

    .line 273
    :cond_3
    iput v5, p0, Ll/ܰۡۛ;->۫:I

    .line 275
    iput v3, p0, Ll/ܰۡۛ;->ܳ:I

    const/4 p1, 0x0

    if-eqz v6, :cond_4

    .line 278
    new-array v1, v1, [Ll/ᩳۡۛ;

    goto :goto_4

    :cond_4
    move-object v1, p1

    :goto_4
    iput-object v1, p0, Ll/ܰۡۛ;->ۤ:[Ll/ᩳۡۛ;

    if-eqz v7, :cond_9

    .line 3529
    new-array p1, v5, [C

    .line 3530
    invoke-virtual {p0}, Ll/ܰۡۛ;->ۙ()I

    move-result v1

    add-int/lit8 v3, v1, -0x2

    .line 3531
    invoke-virtual {p0, v3}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v3

    :goto_5
    if-lez v3, :cond_8

    .line 3533
    invoke-virtual {p0, p1, v1}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, v1, 0x2

    .line 3534
    invoke-virtual {p0, v5}, Ll/ܰۡۛ;->᩷(I)I

    move-result v5

    add-int/lit8 v6, v1, 0x6

    const-string v7, "BootstrapMethods"

    .line 3536
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 3537
    iget-object p1, p0, Ll/ܰۡۛ;->᩷:[B

    array-length p1, p1

    sub-int/2addr p1, v6

    if-gt v5, p1, :cond_6

    .line 3541
    invoke-virtual {p0, v6}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p1

    new-array v3, p1, [I

    add-int/2addr v1, p2

    :goto_6
    if-ge v2, p1, :cond_5

    .line 3545
    aput v1, v3, v2

    add-int/lit8 p2, v1, 0x2

    .line 3549
    invoke-virtual {p0, p2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    add-int/2addr p2, v0

    add-int/2addr v1, p2

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_5
    move-object p1, v3

    goto :goto_7

    .line 3538
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_7
    add-int v1, v6, v5

    add-int/lit8 v3, v3, -0x1

    goto :goto_5

    .line 3555
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 282
    :cond_9
    :goto_7
    iput-object p1, p0, Ll/ܰۡۛ;->ۙ:[I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_7
        :pswitch_7
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_7
        :pswitch_1
        :pswitch_2
        :pswitch_7
        :pswitch_7
    .end packed-switch
.end method

.method private ۙ(I[I)I
    .locals 2

    if-eqz p2, :cond_1

    .line 2877
    array-length v0, p2

    if-ge p1, v0, :cond_1

    aget v0, p2, p1

    .line 2879
    invoke-virtual {p0, v0}, Ll/ܰۡۛ;->ۙ(I)I

    move-result v0

    const/16 v1, 0x43

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2882
    :cond_0
    aget p1, p2, p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method private ۙ(I[Ljava/lang/Object;I[C[Ll/ۤۖۛ;)I
    .locals 3

    add-int/lit8 v0, p1, 0x1

    .line 3433
    iget-object v1, p0, Ll/ܰۡۛ;->᩷:[B

    aget-byte v1, v1, p1

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x3

    packed-switch v1, :pswitch_data_0

    .line 3465
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 3461
    :pswitch_0
    invoke-virtual {p0, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p4

    invoke-static {p4, p5}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    move-result-object p4

    aput-object p4, p2, p3

    goto :goto_0

    .line 3815
    :pswitch_1
    invoke-direct {p0, p4, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object p4

    .line 3457
    aput-object p4, p2, p3

    :goto_0
    add-int/2addr p1, v2

    return p1

    :pswitch_2
    const/4 p1, 0x6

    .line 3454
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    :pswitch_3
    const/4 p1, 0x5

    .line 3451
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    :pswitch_4
    const/4 p1, 0x4

    .line 3448
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    .line 3445
    :pswitch_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    :pswitch_6
    const/4 p1, 0x2

    .line 3442
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    :pswitch_7
    const/4 p1, 0x1

    .line 3439
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    :pswitch_8
    const/4 p1, 0x0

    .line 3436
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private ۙ(Ll/֨ۡۛ;I)I
    .locals 9

    .line 2898
    invoke-virtual {p0, p2}, Ll/ܰۡۛ;->᩷(I)I

    move-result v0

    ushr-int/lit8 v1, v0, 0x18

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    if-eq v1, v2, :cond_0

    const/high16 v3, -0x1000000

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    .line 2956
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    and-int/2addr v0, v3

    add-int/2addr p2, v2

    goto :goto_2

    :pswitch_1
    const v1, -0xffff01

    and-int/2addr v0, v1

    add-int/lit8 p2, p2, 0x4

    goto :goto_2

    :pswitch_2
    and-int/2addr v0, v3

    goto :goto_0

    :pswitch_3
    and-int/lit16 v0, v0, -0x100

    :goto_0
    add-int/lit8 p2, p2, 0x3

    goto :goto_2

    :pswitch_4
    and-int/2addr v0, v3

    add-int/lit8 v1, p2, 0x1

    .line 2915
    invoke-virtual {p0, v1}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 p2, p2, 0x3

    .line 2917
    new-array v3, v1, [Ll/ۤۖۛ;

    iput-object v3, p1, Ll/֨ۡۛ;->ܺ:[Ll/ۤۖۛ;

    .line 2918
    new-array v3, v1, [Ll/ۤۖۛ;

    iput-object v3, p1, Ll/֨ۡۛ;->ۧ:[Ll/ۤۖۛ;

    .line 2919
    new-array v3, v1, [I

    iput-object v3, p1, Ll/֨ۡۛ;->᩻:[I

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    .line 2921
    invoke-virtual {p0, p2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v4

    add-int/lit8 v5, p2, 0x2

    .line 2922
    invoke-virtual {p0, v5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v5

    add-int/lit8 v6, p2, 0x4

    .line 2923
    invoke-virtual {p0, v6}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v6

    add-int/lit8 p2, p2, 0x6

    .line 2925
    iget-object v7, p1, Ll/֨ۡۛ;->ܺ:[Ll/ۤۖۛ;

    iget-object v8, p1, Ll/֨ۡۛ;->᩹:[Ll/ۤۖۛ;

    .line 2926
    invoke-static {v4, v8}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    move-result-object v8

    aput-object v8, v7, v3

    .line 2927
    iget-object v7, p1, Ll/֨ۡۛ;->ۧ:[Ll/ۤۖۛ;

    add-int/2addr v4, v5

    iget-object v5, p1, Ll/֨ۡۛ;->᩹:[Ll/ۤۖۛ;

    .line 2928
    invoke-static {v4, v5}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    move-result-object v4

    aput-object v4, v7, v3

    .line 2929
    iget-object v4, p1, Ll/֨ۡۛ;->᩻:[I

    aput v6, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    :pswitch_5
    const/high16 v1, -0x10000

    and-int/2addr v0, v1

    add-int/lit8 p2, p2, 0x2

    .line 2958
    :cond_1
    :goto_2
    iput v0, p1, Ll/֨ۡۛ;->᩵:I

    .line 2960
    invoke-virtual {p0, p2}, Ll/ܰۡۛ;->ۙ(I)I

    move-result v0

    if-nez v0, :cond_2

    const/4 v1, 0x0

    goto :goto_3

    .line 2962
    :cond_2
    new-instance v1, Ll/᩵ۖۛ;

    iget-object v3, p0, Ll/ܰۡۛ;->᩷:[B

    invoke-direct {v1, v3, p2}, Ll/᩵ۖۛ;-><init>([BI)V

    :goto_3
    iput-object v1, p1, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    add-int/2addr p2, v2

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p2

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x40
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private ۙ(Ll/ۗۡۛ;ILjava/lang/String;[CI)I
    .locals 10

    const/16 v0, 0x65

    const/16 v1, 0x5b

    const/16 v2, 0x40

    .line 3073
    iget-object v3, p0, Ll/ܰۡۛ;->᩷:[B

    if-nez p1, :cond_3

    .line 3074
    aget-byte p1, v3, p2

    and-int/lit16 p1, p1, 0xff

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    if-eq p1, v0, :cond_0

    add-int/lit8 p2, p2, 0x3

    return p2

    :cond_0
    add-int/lit8 p2, p2, 0x5

    return p2

    :cond_1
    add-int/lit8 v2, p2, 0x1

    const/4 v3, 0x0

    add-int/lit8 v5, p5, 0x1

    const/4 v1, 0x0

    move-object v0, p0

    move-object v4, p4

    .line 3081
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result p1

    return p1

    :cond_2
    add-int/lit8 v2, p2, 0x3

    const/4 v3, 0x1

    add-int/lit8 v5, p5, 0x1

    const/4 v1, 0x0

    move-object v0, p0

    move-object v4, p4

    .line 3078
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result p1

    return p1

    :cond_3
    add-int/lit8 v4, p2, 0x1

    .line 3087
    aget-byte v5, v3, p2

    and-int/lit16 v5, v5, 0xff

    if-eq v5, v2, :cond_1b

    const/16 v2, 0x46

    if-eq v5, v2, :cond_1a

    const/16 v6, 0x53

    iget-object v7, p0, Ll/ܰۡۛ;->ᩴ:[I

    if-eq v5, v6, :cond_19

    const/16 v8, 0x63

    if-eq v5, v8, :cond_18

    if-eq v5, v0, :cond_17

    const/16 v0, 0x73

    if-eq v5, v0, :cond_16

    const/16 v0, 0x49

    if-eq v5, v0, :cond_1a

    const/16 v8, 0x4a

    if-eq v5, v8, :cond_1a

    const/16 v9, 0x5a

    if-eq v5, v9, :cond_14

    if-eq v5, v1, :cond_4

    packed-switch v5, :pswitch_data_0

    .line 3236
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 3095
    :pswitch_0
    invoke-virtual {p0, v4}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p4

    aget p4, v7, p4

    invoke-virtual {p0, p4}, Ll/ܰۡۛ;->᩷(I)I

    move-result p4

    int-to-char p4, p4

    invoke-static {p4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p4

    .line 3094
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3090
    :pswitch_1
    invoke-virtual {p0, v4}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p4

    aget p4, v7, p4

    invoke-virtual {p0, p4}, Ll/ܰۡۛ;->᩷(I)I

    move-result p4

    int-to-byte p4, p4

    invoke-static {p4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p4

    .line 3089
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3145
    :cond_4
    invoke-virtual {p0, v4}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 p2, p2, 0x3

    if-nez v1, :cond_5

    .line 3149
    invoke-virtual {p1, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/String;)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x0

    add-int/lit8 v5, p5, 0x1

    move-object v0, p0

    move v2, v4

    move-object v4, p4

    .line 3148
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result p1

    return p1

    .line 3155
    :cond_5
    aget-byte v3, v3, p2

    and-int/lit16 v3, v3, 0xff

    const/4 v5, 0x0

    if-eq v3, v2, :cond_12

    if-eq v3, v6, :cond_10

    if-eq v3, v9, :cond_d

    if-eq v3, v0, :cond_b

    if-eq v3, v8, :cond_9

    packed-switch v3, :pswitch_data_1

    .line 3227
    invoke-virtual {p1, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/String;)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x0

    add-int/lit8 v5, p5, 0x1

    move-object v0, p0

    move v2, v4

    move-object v4, p4

    .line 3226
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result p1

    return p1

    .line 3215
    :pswitch_2
    new-array p4, v1, [D

    :goto_0
    if-ge v5, v1, :cond_6

    add-int/lit8 p5, p2, 0x1

    .line 3219
    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p5

    aget p5, v7, p5

    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->ۤ(I)J

    move-result-wide v2

    .line 3218
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    aput-wide v2, p4, v5

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 3222
    :cond_6
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3181
    :pswitch_3
    new-array p4, v1, [C

    :goto_1
    if-ge v5, v1, :cond_7

    add-int/lit8 p5, p2, 0x1

    .line 3183
    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p5

    aget p5, v7, p5

    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->᩷(I)I

    move-result p5

    int-to-char p5, p5

    aput-char p5, p4, v5

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 3186
    :cond_7
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3157
    :pswitch_4
    new-array p4, v1, [B

    :goto_2
    if-ge v5, v1, :cond_8

    add-int/lit8 p5, p2, 0x1

    .line 3159
    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p5

    aget p5, v7, p5

    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->᩷(I)I

    move-result p5

    int-to-byte p5, p5

    aput-byte p5, p4, v5

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 3162
    :cond_8
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3197
    :cond_9
    new-array p4, v1, [J

    :goto_3
    if-ge v5, v1, :cond_a

    add-int/lit8 p5, p2, 0x1

    .line 3199
    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p5

    aget p5, v7, p5

    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->ۤ(I)J

    move-result-wide v2

    aput-wide v2, p4, v5

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 3202
    :cond_a
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3189
    :cond_b
    new-array p4, v1, [I

    :goto_4
    if-ge v5, v1, :cond_c

    add-int/lit8 p5, p2, 0x1

    .line 3191
    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p5

    aget p5, v7, p5

    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->᩷(I)I

    move-result p5

    aput p5, p4, v5

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 3194
    :cond_c
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3165
    :cond_d
    new-array p4, v1, [Z

    const/4 p5, 0x0

    :goto_5
    if-ge p5, v1, :cond_f

    add-int/lit8 v0, p2, 0x1

    .line 3167
    invoke-virtual {p0, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    aget v0, v7, v0

    invoke-virtual {p0, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, 0x1

    goto :goto_6

    :cond_e
    const/4 v0, 0x0

    :goto_6
    aput-boolean v0, p4, p5

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 p5, p5, 0x1

    goto :goto_5

    .line 3170
    :cond_f
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3173
    :cond_10
    new-array p4, v1, [S

    :goto_7
    if-ge v5, v1, :cond_11

    add-int/lit8 p5, p2, 0x1

    .line 3175
    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p5

    aget p5, v7, p5

    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->᩷(I)I

    move-result p5

    int-to-short p5, p5

    aput-short p5, p4, v5

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    .line 3178
    :cond_11
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3205
    :cond_12
    new-array p4, v1, [F

    :goto_8
    if-ge v5, v1, :cond_13

    add-int/lit8 p5, p2, 0x1

    .line 3209
    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p5

    aget p5, v7, p5

    invoke-virtual {p0, p5}, Ll/ܰۡۛ;->᩷(I)I

    move-result p5

    .line 3208
    invoke-static {p5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p5

    aput p5, p4, v5

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    .line 3212
    :cond_13
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3115
    :cond_14
    invoke-virtual {p0, v4}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p4

    aget p4, v7, p4

    invoke-virtual {p0, p4}, Ll/ܰۡۛ;->᩷(I)I

    move-result p4

    if-nez p4, :cond_15

    .line 3116
    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_9

    .line 3117
    :cond_15
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 3113
    :goto_9
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3121
    :cond_16
    invoke-virtual {p0, p4, v4}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3127
    :cond_17
    invoke-virtual {p0, p4, v4}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object p5

    add-int/lit8 v0, p2, 0x3

    .line 3128
    invoke-virtual {p0, p4, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object p4

    .line 3125
    invoke-virtual {p1, p3, p5, p4}, Ll/ۗۡۛ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x5

    return p2

    .line 3132
    :cond_18
    invoke-virtual {p0, p4, v4}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Ll/ۗۖۛ;->ۚ(Ljava/lang/String;)Ll/ۗۖۛ;

    move-result-object p4

    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3108
    :cond_19
    invoke-virtual {p0, v4}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p4

    aget p4, v7, p4

    invoke-virtual {p0, p4}, Ll/ܰۡۛ;->᩷(I)I

    move-result p4

    int-to-short p4, p4

    invoke-static {p4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p4

    .line 3107
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3103
    :cond_1a
    :pswitch_5
    invoke-virtual {p0, v4}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p5

    invoke-virtual {p0, p4, p5}, Ll/ܰۡۛ;->ۙ([CI)Ljava/lang/Object;

    move-result-object p4

    .line 3102
    invoke-virtual {p1, p4, p3}, Ll/ۗۡۛ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3138
    :cond_1b
    invoke-virtual {p0, p4, v4}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Ll/ۗۡۛ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۡۛ;

    move-result-object v2

    add-int/lit8 v3, p2, 0x3

    const/4 v4, 0x1

    add-int/lit8 v6, p5, 0x1

    move-object v1, p0

    move-object v5, p4

    .line 3137
    invoke-direct/range {v1 .. v6}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_1
        :pswitch_0
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private ۙ(Ll/ۗۡۛ;IZ[CI)I
    .locals 7

    const/16 v0, 0x100

    if-ge p5, v0, :cond_4

    .line 3032
    invoke-virtual {p0, p2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 p2, p2, 0x2

    if-eqz p3, :cond_0

    :goto_0
    add-int/lit8 p3, v0, -0x1

    if-lez v0, :cond_2

    .line 3037
    invoke-virtual {p0, p4, p2}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v3, p2, 0x2

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    move v6, p5

    .line 3039
    invoke-direct/range {v1 .. v6}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;ILjava/lang/String;[CI)I

    move-result p2

    move v0, p3

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_1
    add-int/lit8 p2, v0, -0x1

    if-lez v0, :cond_1

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    .line 3045
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;ILjava/lang/String;[CI)I

    move-result v2

    move v0, p2

    goto :goto_1

    :cond_1
    move p2, v2

    :cond_2
    if-eqz p1, :cond_3

    .line 3050
    invoke-virtual {p1}, Ll/ۗۡۛ;->ۙ()V

    :cond_3
    return p2

    .line 3028
    :cond_4
    new-instance p1, Ll/᩸ۖۛ;

    const-string p2, "Too many nested annotations"

    .line 18
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 3028
    throw p1
.end method

.method private ۙ(Ll/ܿۡۛ;Ll/֨ۡۛ;I)I
    .locals 44

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    move/from16 v0, p3

    .line 1269
    iget-object v10, v9, Ll/֨ۡۛ;->᩷:[C

    .line 1273
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    iput v1, v9, Ll/֨ۡۛ;->ܽ:I

    add-int/lit8 v1, v0, 0x2

    .line 1274
    invoke-virtual {v8, v10, v1}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v9, Ll/֨ۡۛ;->ۗ:Ljava/lang/String;

    add-int/lit8 v11, v0, 0x4

    .line 1275
    invoke-virtual {v8, v10, v11}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v9, Ll/֨ۡۛ;->ܶ:Ljava/lang/String;

    add-int/lit8 v1, v0, 0x6

    .line 1310
    invoke-virtual {v8, v1}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v3, v12

    move-object/from16 v24, v15

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move v12, v0

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v19, v1, -0x1

    move/from16 p3, v7

    const-string v7, "RuntimeInvisibleTypeAnnotations"

    move/from16 v25, v15

    const-string v15, "RuntimeVisibleTypeAnnotations"

    const/high16 v26, 0x20000

    if-lez v1, :cond_f

    .line 1314
    invoke-virtual {v8, v10, v12}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    move/from16 v20, v0

    add-int/lit8 v0, v12, 0x2

    .line 1315
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v21

    add-int/lit8 v0, v12, 0x6

    move/from16 v22, v2

    const-string v2, "Code"

    .line 1319
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1320
    iget v1, v9, Ll/֨ۡۛ;->ۛ:I

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_4

    move/from16 v7, p3

    move/from16 v20, v0

    goto/16 :goto_2

    :cond_0
    const-string v2, "Exceptions"

    .line 1323
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1325
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    new-array v2, v1, [Ljava/lang/String;

    add-int/lit8 v12, v12, 0x8

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v1, :cond_1

    .line 3815
    invoke-direct {v8, v10, v12}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v15

    .line 1328
    aput-object v15, v2, v7

    add-int/lit8 v12, v12, 0x2

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    move/from16 v7, p3

    move/from16 v17, v0

    move-object/from16 v24, v2

    goto/16 :goto_2

    :cond_2
    const-string v2, "Signature"

    .line 1331
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1332
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    move v7, v1

    goto/16 :goto_2

    :cond_3
    const-string v2, "Deprecated"

    .line 1333
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1334
    iget v1, v9, Ll/֨ۡۛ;->ܽ:I

    or-int v1, v1, v26

    iput v1, v9, Ll/֨ۡۛ;->ܽ:I

    :cond_4
    move/from16 v7, p3

    goto/16 :goto_2

    :cond_5
    const-string v2, "RuntimeVisibleAnnotations"

    .line 1335
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move/from16 v7, p3

    move v13, v0

    move/from16 v29, v4

    move/from16 v2, v22

    move/from16 v15, v25

    move/from16 v0, v20

    move/from16 v20, v13

    goto/16 :goto_5

    .line 1337
    :cond_6
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    move/from16 v7, p3

    move v15, v0

    move/from16 v2, v22

    goto/16 :goto_4

    :cond_7
    const-string v2, "AnnotationDefault"

    .line 1339
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    move/from16 v7, p3

    move/from16 v18, v0

    goto :goto_2

    :cond_8
    const-string v2, "Synthetic"

    .line 1341
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 1343
    iget v1, v9, Ll/֨ۡۛ;->ܽ:I

    or-int/lit16 v1, v1, 0x1000

    iput v1, v9, Ll/֨ۡۛ;->ܽ:I

    const/16 v16, 0x1

    move/from16 v7, p3

    move/from16 v2, v22

    move/from16 v15, v25

    move/from16 v43, v20

    move/from16 v20, v0

    move/from16 v0, v43

    goto/16 :goto_6

    :cond_9
    const-string v2, "RuntimeInvisibleAnnotations"

    .line 1344
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    move/from16 v7, p3

    move v14, v0

    goto :goto_2

    .line 1346
    :cond_a
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    move/from16 v7, p3

    move v6, v0

    goto :goto_2

    :cond_b
    const-string v2, "RuntimeVisibleParameterAnnotations"

    .line 1348
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    move/from16 v7, p3

    move v5, v0

    :goto_2
    move/from16 v2, v22

    :goto_3
    move/from16 v15, v25

    goto :goto_4

    :cond_c
    const-string v2, "RuntimeInvisibleParameterAnnotations"

    .line 1350
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    move/from16 v7, p3

    move v4, v0

    move/from16 v2, v22

    move/from16 v15, v25

    move/from16 v0, v20

    move/from16 v20, v4

    goto :goto_6

    :cond_d
    const-string v2, "MethodParameters"

    .line 1352
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    move/from16 v7, p3

    move v2, v0

    goto :goto_3

    :goto_4
    move/from16 v29, v4

    move/from16 v43, v20

    move/from16 v20, v0

    move/from16 v0, v43

    goto :goto_5

    .line 1355
    :cond_e
    iget-object v2, v9, Ll/֨ۡۛ;->ۙ:[Ll/᩺ۡۛ;

    const/4 v7, -0x1

    const/4 v12, 0x0

    move/from16 v15, v20

    move/from16 v20, v0

    move-object/from16 v0, p0

    move-object/from16 v23, v1

    move-object v1, v2

    move/from16 v27, v22

    move-object/from16 v2, v23

    move-object/from16 v28, v3

    move/from16 v3, v20

    move/from16 v29, v4

    move/from16 v4, v21

    move/from16 v30, v5

    move-object v5, v10

    move/from16 v22, v15

    move v15, v6

    move v6, v7

    move/from16 v31, v15

    move/from16 v15, p3

    move-object v7, v12

    .line 1356
    invoke-direct/range {v0 .. v7}, Ll/ܰۡۛ;->ۙ([Ll/᩺ۡۛ;Ljava/lang/String;II[CI[Ll/ۤۖۛ;)Ll/᩺ۡۛ;

    move-result-object v3

    move-object/from16 v6, v28

    .line 1364
    iput-object v6, v3, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    move v7, v15

    move/from16 v0, v22

    move/from16 v15, v25

    move/from16 v2, v27

    move/from16 v5, v30

    move/from16 v6, v31

    :goto_5
    move/from16 v4, v29

    :goto_6
    add-int v12, v20, v21

    move/from16 v1, v19

    goto/16 :goto_0

    :cond_f
    move/from16 v27, v2

    move/from16 v29, v4

    move/from16 v30, v5

    move/from16 v31, v6

    move-object v5, v15

    move/from16 v15, p3

    move v4, v0

    move-object v6, v3

    const/16 v28, 0x2

    .line 1371
    iget v0, v9, Ll/֨ۡۛ;->ܽ:I

    iget-object v1, v9, Ll/֨ۡۛ;->ۗ:Ljava/lang/String;

    iget-object v2, v9, Ll/֨ۡۛ;->ܶ:Ljava/lang/String;

    if-nez v15, :cond_10

    const/4 v3, 0x0

    goto :goto_7

    .line 1376
    :cond_10
    invoke-virtual {v8, v10, v15}, Ll/ܰۡۛ;->ۤ([CI)Ljava/lang/String;

    move-result-object v3

    :goto_7
    move-object/from16 v23, v3

    move-object/from16 v19, p1

    move/from16 v20, v0

    move-object/from16 v21, v1

    move-object/from16 v22, v2

    .line 1372
    invoke-virtual/range {v19 .. v24}, Ll/ܿۡۛ;->ۙ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ll/ܳۖۛ;

    move-result-object v3

    if-nez v3, :cond_11

    return v12

    .line 1386
    :cond_11
    instance-of v0, v3, Ll/۫ۖۛ;

    if-eqz v0, :cond_13

    .line 1387
    move-object v0, v3

    check-cast v0, Ll/۫ۖۛ;

    .line 1388
    iget v1, v9, Ll/֨ۡۛ;->ܽ:I

    and-int v1, v1, v26

    if-eqz v1, :cond_12

    const/4 v1, 0x1

    const/16 v19, 0x1

    goto :goto_8

    :cond_12
    const/4 v1, 0x0

    const/16 v19, 0x0

    .line 1392
    :goto_8
    invoke-virtual {v8, v11}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v11

    move-object/from16 v1, p0

    move/from16 v2, v16

    move/from16 v16, v12

    move-object v12, v3

    move/from16 v3, v19

    move-object/from16 p3, v7

    move v7, v4

    move v4, v11

    move-object v11, v5

    move v5, v15

    move-object v15, v6

    move/from16 v6, v17

    .line 1388
    invoke-virtual/range {v0 .. v6}, Ll/۫ۖۛ;->ۙ(Ll/ܰۡۛ;ZZIII)Z

    goto :goto_9

    :cond_13
    move-object v11, v5

    move-object v15, v6

    move-object/from16 p3, v7

    move/from16 v16, v12

    move-object v12, v3

    move v7, v4

    :goto_9
    move/from16 v2, v27

    if-eqz v2, :cond_14

    .line 1401
    iget v0, v9, Ll/֨ۡۛ;->ۛ:I

    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_14

    .line 1402
    invoke-virtual {v8, v2}, Ll/ܰۡۛ;->ۙ(I)I

    move-result v0

    add-int/lit8 v2, v2, 0x1

    :goto_a
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_14

    .line 1407
    invoke-virtual {v8, v10, v2}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v3, v2, 0x2

    .line 1408
    invoke-virtual {v8, v3}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v3

    .line 1406
    invoke-virtual {v12, v3, v0}, Ll/ܳۖۛ;->᩷(ILjava/lang/String;)V

    add-int/lit8 v2, v2, 0x4

    move v0, v1

    goto :goto_a

    :cond_14
    if-eqz v18, :cond_15

    .line 1415
    invoke-virtual {v12}, Ll/ܳۖۛ;->ۙ()Ll/ۗۡۛ;

    move-result-object v6

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v1, v6

    move/from16 v2, v18

    move-object v4, v10

    .line 1416
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;ILjava/lang/String;[CI)I

    if-eqz v6, :cond_15

    .line 1418
    invoke-virtual {v6}, Ll/ۗۡۛ;->ۙ()V

    :cond_15
    if-eqz v13, :cond_16

    .line 1424
    invoke-virtual {v8, v13}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v13, v13, 0x2

    :goto_b
    add-int/lit8 v6, v0, -0x1

    if-lez v0, :cond_16

    .line 1428
    invoke-virtual {v8, v10, v13}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v2, v13, 0x2

    const/4 v1, 0x1

    .line 1433
    invoke-virtual {v12, v0, v1}, Ll/ܳۖۛ;->ۙ(Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v4, v10

    .line 1432
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v13

    move v0, v6

    goto :goto_b

    :cond_16
    if-eqz v14, :cond_17

    .line 1443
    invoke-virtual {v8, v14}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v14, v14, 0x2

    :goto_c
    add-int/lit8 v6, v0, -0x1

    if-lez v0, :cond_17

    .line 1447
    invoke-virtual {v8, v10, v14}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v2, v14, 0x2

    const/4 v1, 0x0

    .line 1452
    invoke-virtual {v12, v0, v1}, Ll/ܳۖۛ;->ۙ(Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v4, v10

    .line 1451
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v14

    move v0, v6

    goto :goto_c

    :cond_17
    if-eqz v25, :cond_18

    move/from16 v4, v25

    .line 1462
    invoke-virtual {v8, v4}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v1, v4, 0x2

    :goto_d
    add-int/lit8 v6, v0, -0x1

    if-lez v0, :cond_18

    .line 1466
    invoke-direct {v8, v9, v1}, Ll/ܰۡۛ;->ۙ(Ll/֨ۡۛ;I)I

    move-result v0

    .line 1468
    invoke-virtual {v8, v10, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    .line 1471
    iget v0, v9, Ll/֨ۡۛ;->᩵:I

    iget-object v3, v9, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    const/4 v4, 0x1

    .line 1473
    invoke-virtual {v12, v0, v3, v1, v4}, Ll/ܳۖۛ;->ۤ(ILl/᩵ۖۛ;Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v4, v10

    .line 1472
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v1

    move v0, v6

    goto :goto_d

    :cond_18
    if-eqz v31, :cond_19

    move/from16 v5, v31

    .line 1487
    invoke-virtual {v8, v5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v6, v5, 0x2

    :goto_e
    add-int/lit8 v13, v0, -0x1

    if-lez v0, :cond_19

    .line 1491
    invoke-direct {v8, v9, v6}, Ll/ܰۡۛ;->ۙ(Ll/֨ۡۛ;I)I

    move-result v0

    .line 1493
    invoke-virtual {v8, v10, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    .line 1496
    iget v0, v9, Ll/֨ۡۛ;->᩵:I

    iget-object v3, v9, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    const/4 v4, 0x0

    .line 1498
    invoke-virtual {v12, v0, v3, v1, v4}, Ll/ܳۖۛ;->ۤ(ILl/᩵ۖۛ;Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v4, v10

    .line 1497
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v6

    move v0, v13

    goto :goto_e

    :cond_19
    move/from16 v5, v30

    if-eqz v5, :cond_1a

    const/4 v0, 0x1

    .line 1512
    invoke-direct {v8, v12, v9, v5, v0}, Ll/ܰۡۛ;->ۙ(Ll/ܳۖۛ;Ll/֨ۡۛ;IZ)V

    :cond_1a
    move/from16 v4, v29

    if-eqz v4, :cond_1b

    const/4 v0, 0x0

    .line 1518
    invoke-direct {v8, v12, v9, v4, v0}, Ll/ܰۡۛ;->ۙ(Ll/ܳۖۛ;Ll/֨ۡۛ;IZ)V

    :cond_1b
    move-object v3, v15

    :goto_f
    if-eqz v3, :cond_1c

    .line 1525
    iget-object v0, v3, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    const/4 v1, 0x0

    .line 1526
    iput-object v1, v3, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    .line 1527
    invoke-virtual {v12, v3}, Ll/ܳۖۛ;->ۙ(Ll/᩺ۡۛ;)V

    move-object v3, v0

    goto :goto_f

    :cond_1c
    if-eqz v7, :cond_7a

    .line 1533
    invoke-virtual {v12}, Ll/ܳۖۛ;->᩷()V

    .line 1560
    iget-object v10, v9, Ll/֨ۡۛ;->᩷:[C

    .line 1561
    invoke-virtual {v8, v7}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v13

    add-int/lit8 v0, v7, 0x2

    .line 1562
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v14

    add-int/lit8 v0, v7, 0x4

    .line 1563
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v15

    add-int/lit8 v17, v7, 0x8

    const v0, 0xffff

    if-gt v15, v0, :cond_79

    .line 1565
    iget-object v6, v8, Ll/ܰۡۛ;->᩷:[B

    array-length v0, v6

    sub-int v0, v0, v17

    if-gt v15, v0, :cond_79

    add-int v5, v17, v15

    add-int/lit8 v0, v15, 0x1

    .line 1572
    new-array v4, v0, [Ll/ۤۖۛ;

    iput-object v4, v9, Ll/֨ۡۛ;->᩹:[Ll/ۤۖۛ;

    move/from16 v0, v17

    :goto_10
    const/16 v1, 0x84

    if-ge v0, v5, :cond_20

    sub-int v2, v0, v17

    .line 1575
    aget-byte v3, v6, v0

    and-int/lit16 v3, v3, 0xff

    packed-switch v3, :pswitch_data_0

    .line 1863
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :pswitch_0
    add-int/lit8 v1, v0, 0x1

    .line 1765
    invoke-virtual {v8, v1}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/2addr v1, v2

    invoke-static {v1, v4}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    goto/16 :goto_14

    :pswitch_1
    add-int/lit8 v1, v0, 0x1

    .line 1771
    invoke-virtual {v8, v1}, Ll/ܰۡۛ;->᩷(I)I

    move-result v1

    add-int/2addr v1, v2

    invoke-static {v1, v4}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    goto :goto_11

    :pswitch_2
    add-int/lit8 v2, v0, 0x1

    .line 1775
    aget-byte v2, v6, v2

    and-int/lit16 v2, v2, 0xff

    if-eq v2, v1, :cond_1e

    const/16 v1, 0xa9

    if-eq v2, v1, :cond_1d

    packed-switch v2, :pswitch_data_1

    packed-switch v2, :pswitch_data_2

    .line 1793
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_1d
    :pswitch_3
    add-int/lit8 v0, v0, 0x4

    goto :goto_10

    :cond_1e
    add-int/lit8 v0, v0, 0x6

    goto :goto_10

    :goto_11
    :pswitch_4
    add-int/lit8 v0, v0, 0x5

    goto :goto_10

    :pswitch_5
    and-int/lit8 v1, v2, 0x3

    rsub-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v0

    .line 1813
    invoke-virtual {v8, v1}, Ll/ܰۡۛ;->᩷(I)I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {v0, v4}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    add-int/lit8 v0, v1, 0x4

    .line 1814
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v0

    add-int/lit8 v1, v1, 0x8

    :goto_12
    add-int/lit8 v3, v0, -0x1

    if-lez v0, :cond_1f

    add-int/lit8 v0, v1, 0x4

    .line 1818
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {v0, v4}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    add-int/lit8 v1, v1, 0x8

    move v0, v3

    goto :goto_12

    :pswitch_6
    and-int/lit8 v1, v2, 0x3

    rsub-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v0

    .line 1800
    invoke-virtual {v8, v1}, Ll/ܰۡۛ;->᩷(I)I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {v0, v4}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    add-int/lit8 v0, v1, 0x8

    .line 1801
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v0

    add-int/lit8 v3, v1, 0x4

    invoke-virtual {v8, v3}, Ll/ܰۡۛ;->᩷(I)I

    move-result v3

    sub-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0xc

    :goto_13
    add-int/lit8 v3, v0, -0x1

    if-lez v0, :cond_1f

    .line 1805
    invoke-virtual {v8, v1}, Ll/ܰۡۛ;->᩷(I)I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {v0, v4}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    add-int/lit8 v1, v1, 0x4

    move v0, v3

    goto :goto_13

    :cond_1f
    move v0, v1

    goto/16 :goto_10

    :pswitch_7
    add-int/lit8 v1, v0, 0x1

    .line 1744
    invoke-virtual {v8, v1}, Ll/ܰۡۛ;->᩸(I)S

    move-result v1

    add-int/2addr v1, v2

    invoke-static {v1, v4}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    :goto_14
    :pswitch_8
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_10

    :pswitch_9
    add-int/lit8 v0, v0, 0x2

    goto/16 :goto_10

    :pswitch_a
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_10

    .line 1869
    :cond_20
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x2

    :goto_15
    add-int/lit8 v2, v1, -0x1

    .line 1871
    iget-object v3, v8, Ll/ܰۡۛ;->ᩴ:[I

    if-lez v1, :cond_21

    .line 1872
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    invoke-static {v1, v4}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    move-result-object v1

    move/from16 p1, v2

    add-int/lit8 v2, v0, 0x2

    .line 1873
    invoke-virtual {v8, v2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v2

    invoke-static {v2, v4}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    move-result-object v2

    move/from16 v18, v5

    add-int/lit8 v5, v0, 0x4

    .line 1874
    invoke-virtual {v8, v5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v5

    invoke-static {v5, v4}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    move-result-object v5

    move-object/from16 v19, v6

    add-int/lit8 v6, v0, 0x6

    .line 1875
    invoke-virtual {v8, v6}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v6

    aget v3, v3, v6

    invoke-virtual {v8, v10, v3}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v0, v0, 0x8

    .line 1877
    invoke-virtual {v12, v1, v2, v5, v3}, Ll/ܳۖۛ;->ۙ(Ll/ۤۖۛ;Ll/ۤۖۛ;Ll/ۤۖۛ;Ljava/lang/String;)V

    move/from16 v1, p1

    move/from16 v5, v18

    move-object/from16 v6, v19

    goto :goto_15

    :cond_21
    move/from16 v18, v5

    move-object/from16 v19, v6

    .line 1905
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x2

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v43, v6

    move-object v6, v2

    move-object/from16 v2, v43

    :goto_16
    add-int/lit8 v25, v1, -0x1

    if-lez v1, :cond_33

    .line 1909
    invoke-virtual {v8, v10, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    move-object/from16 p1, v2

    add-int/lit8 v2, v0, 0x2

    .line 1910
    invoke-virtual {v8, v2}, Ll/ܰۡۛ;->᩷(I)I

    move-result v26

    add-int/lit8 v2, v0, 0x6

    move-object/from16 v27, v3

    const-string v3, "LocalVariableTable"

    .line 1912
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28

    .line 1913
    iget v1, v9, Ll/֨ۡۛ;->ۛ:I

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_27

    .line 1917
    invoke-virtual {v8, v2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x8

    :goto_17
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_26

    .line 1920
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    .line 2748
    aget-object v23, v4, v1

    if-nez v23, :cond_23

    if-nez v23, :cond_22

    .line 2719
    new-instance v23, Ll/ۤۖۛ;

    invoke-direct/range {v23 .. v23}, Ll/ۤۖۛ;-><init>()V

    aput-object v23, v4, v1

    :cond_22
    move/from16 v23, v3

    .line 2721
    aget-object v3, v4, v1

    move-object/from16 v29, v5

    .line 2749
    iget-short v5, v3, Ll/ۤۖۛ;->᩷:S

    or-int/lit8 v5, v5, 0x1

    int-to-short v5, v5

    iput-short v5, v3, Ll/ۤۖۛ;->᩷:S

    goto :goto_18

    :cond_23
    move/from16 v23, v3

    move-object/from16 v29, v5

    :goto_18
    add-int/lit8 v3, v0, 0x2

    .line 1922
    invoke-virtual {v8, v3}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v3

    add-int/2addr v3, v1

    .line 2748
    aget-object v1, v4, v3

    if-nez v1, :cond_25

    if-nez v1, :cond_24

    .line 2719
    new-instance v1, Ll/ۤۖۛ;

    invoke-direct {v1}, Ll/ۤۖۛ;-><init>()V

    aput-object v1, v4, v3

    .line 2721
    :cond_24
    aget-object v1, v4, v3

    .line 2749
    iget-short v3, v1, Ll/ۤۖۛ;->᩷:S

    or-int/lit8 v3, v3, 0x1

    int-to-short v3, v3

    iput-short v3, v1, Ll/ۤۖۛ;->᩷:S

    :cond_25
    add-int/lit8 v0, v0, 0xa

    move/from16 v1, v23

    move-object/from16 v5, v29

    goto :goto_17

    :cond_26
    move-object/from16 v29, v5

    move/from16 v23, v2

    goto :goto_19

    :cond_27
    move-object/from16 v29, v5

    goto/16 :goto_1c

    :cond_28
    move-object/from16 v29, v5

    const-string v3, "LocalVariableTypeTable"

    .line 1928
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_29

    move/from16 v21, v2

    :goto_19
    move/from16 v31, v2

    move/from16 v32, v7

    move-object/from16 v30, v11

    move-object/from16 v5, v29

    move-object/from16 v2, p1

    move-object/from16 v29, p3

    move-object/from16 p1, v4

    move-object/from16 p3, v10

    goto/16 :goto_1f

    :cond_29
    const-string v3, "LineNumberTable"

    .line 1932
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2c

    .line 1933
    iget v1, v9, Ll/֨ۡۛ;->ۛ:I

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_2d

    .line 1936
    invoke-virtual {v8, v2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x8

    :goto_1a
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_2d

    .line 1939
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v5, v0, 0x2

    .line 1940
    invoke-virtual {v8, v5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v5

    add-int/lit8 v0, v0, 0x4

    .line 2748
    aget-object v30, v4, v1

    if-nez v30, :cond_2b

    if-nez v30, :cond_2a

    .line 2719
    new-instance v30, Ll/ۤۖۛ;

    invoke-direct/range {v30 .. v30}, Ll/ۤۖۛ;-><init>()V

    aput-object v30, v4, v1

    :cond_2a
    move/from16 v30, v0

    .line 2721
    aget-object v0, v4, v1

    move/from16 v31, v3

    .line 2749
    iget-short v3, v0, Ll/ۤۖۛ;->᩷:S

    or-int/lit8 v3, v3, 0x1

    int-to-short v3, v3

    iput-short v3, v0, Ll/ۤۖۛ;->᩷:S

    goto :goto_1b

    :cond_2b
    move/from16 v30, v0

    move/from16 v31, v3

    .line 1943
    :goto_1b
    aget-object v0, v4, v1

    invoke-virtual {v0, v5}, Ll/ۤۖۛ;->ۙ(I)V

    move/from16 v0, v30

    move/from16 v1, v31

    goto :goto_1a

    .line 1946
    :cond_2c
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2e

    const/4 v0, 0x1

    .line 1948
    invoke-direct {v8, v12, v9, v2, v0}, Ll/ܰۡۛ;->᩷(Ll/ܳۖۛ;Ll/֨ۡۛ;IZ)[I

    move-result-object v6

    :cond_2d
    :goto_1c
    move-object/from16 v5, p3

    goto :goto_1d

    :cond_2e
    move-object/from16 v5, p3

    .line 1955
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2f

    const/4 v0, 0x0

    .line 1957
    invoke-direct {v8, v12, v9, v2, v0}, Ll/ܰۡۛ;->᩷(Ll/ܳۖۛ;Ll/֨ۡۛ;IZ)[I

    move-result-object v0

    move-object/from16 v29, v0

    goto :goto_1d

    :cond_2f
    const-string v3, "StackMapTable"

    .line 1959
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_30

    .line 1960
    iget v1, v9, Ll/֨ۡۛ;->ۛ:I

    and-int/lit8 v1, v1, 0x4

    if-nez v1, :cond_31

    add-int/lit8 v24, v0, 0x8

    add-int v20, v2, v26

    goto :goto_1d

    :cond_30
    const-string v3, "StackMap"

    .line 1973
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_32

    .line 1974
    iget v1, v9, Ll/֨ۡۛ;->ۛ:I

    and-int/lit8 v1, v1, 0x4

    if-nez v1, :cond_31

    add-int/lit8 v0, v0, 0x8

    add-int v1, v2, v26

    const/4 v3, 0x0

    move/from16 v24, v0

    move/from16 v20, v1

    move/from16 v31, v2

    move/from16 v32, v7

    move-object/from16 p3, v10

    move-object/from16 v30, v11

    const/16 v22, 0x0

    goto :goto_1e

    :cond_31
    :goto_1d
    move/from16 v31, v2

    move/from16 v32, v7

    move-object/from16 p3, v10

    move-object/from16 v30, v11

    :goto_1e
    move-object/from16 v2, p1

    move-object/from16 p1, v4

    move-object/from16 v43, v29

    move-object/from16 v29, v5

    move-object/from16 v5, v43

    goto :goto_1f

    .line 1984
    :cond_32
    iget-object v3, v9, Ll/֨ۡۛ;->ۙ:[Ll/᩺ۡۛ;

    move-object/from16 v0, p0

    move-object/from16 v30, v1

    move-object v1, v3

    move-object/from16 v3, p1

    move/from16 v31, v2

    move-object/from16 v2, v30

    move-object/from16 v30, v11

    move-object v11, v3

    move/from16 v3, v31

    move-object/from16 p1, v4

    move/from16 v4, v26

    move-object/from16 v38, v29

    move-object/from16 v29, v5

    move-object v5, v10

    move-object/from16 p3, v10

    move-object v10, v6

    move v6, v7

    move/from16 v32, v7

    move-object/from16 v7, p1

    .line 1985
    invoke-direct/range {v0 .. v7}, Ll/ܰۡۛ;->ۙ([Ll/᩺ۡۛ;Ljava/lang/String;II[CI[Ll/ۤۖۛ;)Ll/᩺ۡۛ;

    move-result-object v0

    .line 1993
    iput-object v11, v0, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    move-object v2, v0

    move-object v6, v10

    move-object/from16 v5, v38

    :goto_1f
    add-int v0, v31, v26

    move-object/from16 v4, p1

    move-object/from16 v10, p3

    move/from16 v1, v25

    move-object/from16 v3, v27

    move-object/from16 p3, v29

    move-object/from16 v11, v30

    move/from16 v7, v32

    goto/16 :goto_16

    :cond_33
    move-object v11, v2

    move-object/from16 v27, v3

    move-object/from16 p1, v4

    move-object/from16 v38, v5

    move-object/from16 p3, v10

    move-object v10, v6

    .line 2001
    iget v1, v9, Ll/֨ۡۛ;->ۛ:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_34

    const/4 v1, 0x1

    goto :goto_20

    :cond_34
    const/4 v1, 0x0

    :goto_20
    const/4 v2, -0x1

    if-eqz v24, :cond_42

    .line 2006
    iput v2, v9, Ll/֨ۡۛ;->ܳ:I

    const/4 v2, 0x0

    .line 2007
    iput v2, v9, Ll/֨ۡۛ;->֫:I

    .line 2008
    iput v2, v9, Ll/֨ۡۛ;->ۤ:I

    .line 2009
    iput v2, v9, Ll/֨ۡۛ;->᩸:I

    .line 2010
    new-array v3, v14, [Ljava/lang/Object;

    iput-object v3, v9, Ll/֨ۡۛ;->ᩴ:[Ljava/lang/Object;

    .line 2011
    iput v2, v9, Ll/֨ۡۛ;->۫:I

    .line 2012
    new-array v2, v13, [Ljava/lang/Object;

    iput-object v2, v9, Ll/֨ۡۛ;->ۚ:[Ljava/lang/Object;

    if-eqz v1, :cond_40

    .line 3252
    iget-object v2, v9, Ll/֨ۡۛ;->ܶ:Ljava/lang/String;

    .line 3255
    iget v5, v9, Ll/֨ۡۛ;->ܽ:I

    and-int/lit8 v5, v5, 0x8

    if-nez v5, :cond_36

    const-string v5, "<init>"

    .line 3256
    iget-object v6, v9, Ll/֨ۡۛ;->ۗ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_35

    const/4 v5, 0x6

    .line 3257
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v3, v6

    goto :goto_21

    :cond_35
    const/4 v5, 0x0

    .line 3259
    iget v6, v8, Ll/ܰۡۛ;->ܳ:I

    add-int/lit8 v6, v6, 0x2

    iget-object v7, v9, Ll/֨ۡۛ;->᩷:[C

    .line 3815
    invoke-direct {v8, v7, v6}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v6

    .line 3259
    aput-object v6, v3, v5

    :goto_21
    const/4 v5, 0x1

    goto :goto_22

    :cond_36
    const/4 v5, 0x0

    :goto_22
    const/4 v6, 0x1

    :goto_23
    add-int/lit8 v7, v6, 0x1

    .line 3267
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v4, 0x46

    if-eq v0, v4, :cond_3f

    const/16 v4, 0x4c

    if-eq v0, v4, :cond_3d

    const/16 v4, 0x53

    if-eq v0, v4, :cond_3c

    const/16 v4, 0x49

    if-eq v0, v4, :cond_3c

    const/16 v4, 0x4a

    if-eq v0, v4, :cond_3b

    const/16 v4, 0x5a

    if-eq v0, v4, :cond_3a

    const/16 v4, 0x5b

    if-eq v0, v4, :cond_37

    packed-switch v0, :pswitch_data_3

    .line 3307
    iput v5, v9, Ll/֨ۡۛ;->ۤ:I

    goto/16 :goto_29

    :pswitch_b
    add-int/lit8 v0, v5, 0x1

    const/16 v26, 0x3

    .line 3282
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    goto/16 :goto_28

    :cond_37
    const/16 v26, 0x3

    .line 3285
    :goto_24
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v4, :cond_38

    add-int/lit8 v7, v7, 0x1

    goto :goto_24

    .line 3288
    :cond_38
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v4, 0x4c

    if-ne v0, v4, :cond_39

    :goto_25
    add-int/lit8 v7, v7, 0x1

    .line 3290
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v4, 0x3b

    if-eq v0, v4, :cond_39

    goto :goto_25

    :cond_39
    add-int/lit8 v0, v5, 0x1

    add-int/lit8 v7, v7, 0x1

    .line 3295
    invoke-virtual {v2, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    goto :goto_28

    :cond_3a
    :pswitch_c
    const/16 v26, 0x3

    const/4 v4, 0x4

    goto :goto_26

    :cond_3b
    const/16 v26, 0x3

    add-int/lit8 v0, v5, 0x1

    const/4 v4, 0x4

    .line 3279
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v5

    goto :goto_28

    :cond_3c
    const/4 v4, 0x4

    const/16 v26, 0x3

    :goto_26
    add-int/lit8 v0, v5, 0x1

    const/4 v6, 0x1

    .line 3273
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v5

    goto :goto_28

    :cond_3d
    const/4 v4, 0x4

    const/16 v26, 0x3

    move v0, v7

    .line 3299
    :goto_27
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v4, 0x3b

    if-eq v6, v4, :cond_3e

    add-int/lit8 v0, v0, 0x1

    const/4 v4, 0x4

    goto :goto_27

    :cond_3e
    add-int/lit8 v4, v5, 0x1

    add-int/lit8 v6, v0, 0x1

    .line 3303
    invoke-virtual {v2, v7, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v5

    move v5, v4

    goto/16 :goto_23

    :cond_3f
    const/16 v26, 0x3

    add-int/lit8 v0, v5, 0x1

    .line 3276
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    :goto_28
    move v5, v0

    move v6, v7

    goto/16 :goto_23

    :cond_40
    :goto_29
    move/from16 v0, v24

    :goto_2a
    add-int/lit8 v2, v20, -0x2

    if-ge v0, v2, :cond_42

    .line 2024
    aget-byte v2, v19, v0

    const/16 v3, 0x8

    if-ne v2, v3, :cond_41

    add-int/lit8 v2, v0, 0x1

    .line 2025
    invoke-virtual {v8, v2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v2

    if-ltz v2, :cond_41

    if-ge v2, v15, :cond_41

    add-int v3, v17, v2

    .line 2026
    aget-byte v3, v19, v3

    and-int/lit16 v3, v3, 0xff

    const/16 v4, 0xbb

    if-ne v3, v4, :cond_41

    move-object/from16 v3, p1

    .line 2030
    invoke-static {v2, v3}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    goto :goto_2b

    :cond_41
    move-object/from16 v3, p1

    :goto_2b
    add-int/lit8 v0, v0, 0x1

    move-object/from16 p1, v3

    goto :goto_2a

    :cond_42
    move-object/from16 v3, p1

    if-eqz v1, :cond_43

    .line 2035
    iget v0, v9, Ll/֨ۡۛ;->ۛ:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_43

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v33, -0x1

    const/16 v36, 0x0

    move-object/from16 v32, v12

    move/from16 v34, v14

    .line 2042
    invoke-virtual/range {v32 .. v37}, Ll/ܳۖۛ;->ۙ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_43
    const/4 v0, 0x0

    .line 2053
    invoke-direct {v8, v0, v10}, Ll/ܰۡۛ;->ۙ(I[I)I

    move-result v2

    move-object/from16 v5, v38

    .line 2059
    invoke-direct {v8, v0, v5}, Ll/ܰۡۛ;->ۙ(I[I)I

    move-result v0

    .line 2068
    iget v4, v9, Ll/֨ۡۛ;->ۛ:I

    and-int/lit16 v4, v4, 0x100

    if-nez v4, :cond_44

    const/16 v4, 0x21

    goto :goto_2c

    :cond_44
    const/4 v4, 0x0

    :goto_2c
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v25, 0x0

    move/from16 p1, v0

    move v6, v4

    move-object/from16 v26, v8

    move-object/from16 p2, v11

    move-object v4, v12

    move v12, v13

    move v11, v14

    move/from16 v7, v18

    move/from16 v0, v20

    move-object/from16 v13, p3

    move/from16 p3, v2

    move-object v14, v10

    move/from16 v20, v15

    move/from16 v18, v16

    move/from16 v10, v17

    move/from16 v2, v21

    const/16 v16, 0x0

    move-object v15, v5

    move/from16 v21, v10

    const/16 v17, 0x0

    move-object v5, v3

    move/from16 v3, v23

    :goto_2d
    if-ge v10, v7, :cond_6b

    sub-int v8, v10, v21

    move/from16 v23, v7

    .line 2076
    aget-object v7, v5, v8

    move/from16 v28, v10

    if-eqz v7, :cond_46

    .line 2078
    iget v10, v9, Ll/֨ۡۛ;->ۛ:I

    and-int/lit8 v10, v10, 0x2

    if-nez v10, :cond_45

    const/4 v10, 0x1

    goto :goto_2e

    :cond_45
    const/4 v10, 0x0

    :goto_2e
    invoke-virtual {v7, v4, v10}, Ll/ۤۖۛ;->ۙ(Ll/ܳۖۛ;Z)V

    :cond_46
    move/from16 v7, v24

    :goto_2f
    if-eqz v7, :cond_59

    .line 2082
    iget v10, v9, Ll/֨ۡۛ;->ܳ:I

    move/from16 v24, v11

    const/4 v11, -0x1

    if-eq v10, v8, :cond_48

    if-ne v10, v11, :cond_47

    goto :goto_30

    :cond_47
    move/from16 v40, v12

    move-object/from16 v41, v14

    move-object/from16 v42, v15

    move/from16 v39, v24

    move-object/from16 v15, v26

    move/from16 v34, v28

    move/from16 v26, v0

    move/from16 v24, v2

    move-object v2, v13

    goto/16 :goto_3e

    :cond_48
    :goto_30
    if-eq v10, v11, :cond_4b

    if-eqz v22, :cond_4a

    if-eqz v1, :cond_49

    goto :goto_31

    .line 2096
    :cond_49
    iget v11, v9, Ll/֨ۡۛ;->֫:I

    iget v10, v9, Ll/֨ۡۛ;->᩸:I

    move-object/from16 v29, v14

    iget-object v14, v9, Ll/֨ۡۛ;->ᩴ:[Ljava/lang/Object;

    move-object/from16 v30, v13

    iget v13, v9, Ll/֨ۡۛ;->۫:I

    move-object/from16 v31, v15

    iget-object v15, v9, Ll/֨ۡۛ;->ۚ:[Ljava/lang/Object;

    move/from16 v25, v10

    move/from16 v34, v28

    move-object v10, v4

    move/from16 v39, v24

    move/from16 v40, v12

    move/from16 v12, v25

    move/from16 v24, v2

    move-object/from16 v2, v30

    move-object/from16 v41, v29

    move-object/from16 v42, v31

    invoke-virtual/range {v10 .. v15}, Ll/ܳۖۛ;->ۙ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_32

    :cond_4a
    :goto_31
    move/from16 v40, v12

    move-object/from16 v41, v14

    move-object/from16 v42, v15

    move/from16 v39, v24

    move/from16 v34, v28

    move/from16 v24, v2

    move-object v2, v13

    .line 2089
    iget v12, v9, Ll/֨ۡۛ;->ۤ:I

    iget-object v14, v9, Ll/֨ۡۛ;->ᩴ:[Ljava/lang/Object;

    iget v13, v9, Ll/֨ۡۛ;->۫:I

    iget-object v15, v9, Ll/֨ۡۛ;->ۚ:[Ljava/lang/Object;

    const/4 v11, -0x1

    move-object v10, v4

    invoke-virtual/range {v10 .. v15}, Ll/ܳۖۛ;->ۙ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :goto_32
    const/4 v10, 0x0

    const/16 v25, 0x0

    goto :goto_33

    :cond_4b
    move/from16 v40, v12

    move-object/from16 v41, v14

    move-object/from16 v42, v15

    move/from16 v39, v24

    move/from16 v34, v28

    move/from16 v24, v2

    move-object v2, v13

    :goto_33
    if-ge v7, v0, :cond_58

    .line 3333
    iget-object v10, v9, Ll/֨ۡۛ;->᩷:[C

    .line 3334
    iget-object v11, v9, Ll/֨ۡۛ;->᩹:[Ll/ۤۖۛ;

    if-eqz v22, :cond_4c

    add-int/lit8 v12, v7, 0x1

    .line 3338
    aget-byte v7, v19, v7

    and-int/lit16 v7, v7, 0xff

    goto :goto_34

    :cond_4c
    const/4 v12, -0x1

    .line 3341
    iput v12, v9, Ll/֨ۡۛ;->ܳ:I

    const/16 v12, 0xff

    move v12, v7

    const/16 v7, 0xff

    :goto_34
    const/4 v13, 0x0

    .line 3344
    iput v13, v9, Ll/֨ۡۛ;->᩸:I

    const/16 v13, 0x40

    if-ge v7, v13, :cond_4d

    const/4 v10, 0x3

    .line 3347
    iput v10, v9, Ll/֨ۡۛ;->֫:I

    const/4 v10, 0x0

    .line 3348
    iput v10, v9, Ll/֨ۡۛ;->۫:I

    :goto_35
    move-object/from16 v15, v26

    move/from16 v26, v0

    goto/16 :goto_3c

    :cond_4d
    const/16 v13, 0x80

    if-ge v7, v13, :cond_4e

    add-int/lit8 v7, v7, -0x40

    .line 3351
    iget-object v13, v9, Ll/֨ۡۛ;->ۚ:[Ljava/lang/Object;

    const/16 v31, 0x0

    move-object/from16 v28, v26

    move/from16 v29, v12

    move-object/from16 v30, v13

    move-object/from16 v32, v10

    move-object/from16 v33, v11

    .line 3352
    invoke-direct/range {v28 .. v33}, Ll/ܰۡۛ;->ۙ(I[Ljava/lang/Object;I[C[Ll/ۤۖۛ;)I

    move-result v10

    const/4 v12, 0x4

    .line 3354
    iput v12, v9, Ll/֨ۡۛ;->֫:I

    const/4 v12, 0x1

    .line 3355
    iput v12, v9, Ll/֨ۡۛ;->۫:I

    move v12, v10

    goto :goto_35

    :cond_4e
    const/16 v13, 0xf7

    if-lt v7, v13, :cond_57

    move-object/from16 v15, v26

    .line 3357
    invoke-virtual {v15, v12}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v14

    move/from16 v26, v0

    add-int/lit8 v0, v12, 0x2

    if-ne v7, v13, :cond_4f

    .line 3360
    iget-object v7, v9, Ll/֨ۡۛ;->ۚ:[Ljava/lang/Object;

    const/16 v31, 0x0

    const/4 v12, 0x4

    move-object/from16 v28, v15

    move/from16 v29, v0

    move-object/from16 v30, v7

    move-object/from16 v32, v10

    move-object/from16 v33, v11

    .line 3361
    invoke-direct/range {v28 .. v33}, Ll/ܰۡۛ;->ۙ(I[Ljava/lang/Object;I[C[Ll/ۤۖۛ;)I

    move-result v0

    .line 3363
    iput v12, v9, Ll/֨ۡۛ;->֫:I

    const/4 v7, 0x1

    .line 3364
    iput v7, v9, Ll/֨ۡۛ;->۫:I

    move/from16 v35, v14

    goto/16 :goto_3b

    :cond_4f
    const/16 v13, 0xf8

    move/from16 v35, v14

    const/16 v14, 0xfb

    if-lt v7, v13, :cond_50

    if-ge v7, v14, :cond_50

    const/4 v10, 0x2

    .line 3366
    iput v10, v9, Ll/֨ۡۛ;->֫:I

    rsub-int v7, v7, 0xfb

    .line 3367
    iput v7, v9, Ll/֨ۡۛ;->᩸:I

    .line 3368
    iget v10, v9, Ll/֨ۡۛ;->ۤ:I

    sub-int/2addr v10, v7

    iput v10, v9, Ll/֨ۡۛ;->ۤ:I

    const/4 v7, 0x0

    .line 3369
    iput v7, v9, Ll/֨ۡۛ;->۫:I

    goto/16 :goto_3b

    :cond_50
    const/4 v13, 0x0

    if-ne v7, v14, :cond_51

    const/4 v7, 0x3

    .line 3371
    iput v7, v9, Ll/֨ۡۛ;->֫:I

    .line 3372
    iput v13, v9, Ll/֨ۡۛ;->۫:I

    goto/16 :goto_3b

    :cond_51
    const/16 v13, 0xff

    if-ge v7, v13, :cond_54

    if-eqz v1, :cond_52

    .line 3374
    iget v12, v9, Ll/֨ۡۛ;->ۤ:I

    goto :goto_36

    :cond_52
    const/4 v12, 0x0

    :goto_36
    add-int/lit16 v7, v7, -0xfb

    move/from16 v29, v0

    move v0, v7

    move/from16 v31, v12

    :goto_37
    if-lez v0, :cond_53

    .line 3376
    iget-object v12, v9, Ll/֨ۡۛ;->ᩴ:[Ljava/lang/Object;

    add-int/lit8 v13, v31, 0x1

    move-object/from16 v28, v15

    move-object/from16 v30, v12

    move-object/from16 v32, v10

    move-object/from16 v33, v11

    .line 3377
    invoke-direct/range {v28 .. v33}, Ll/ܰۡۛ;->ۙ(I[Ljava/lang/Object;I[C[Ll/ۤۖۛ;)I

    move-result v29

    add-int/lit8 v0, v0, -0x1

    move/from16 v31, v13

    goto :goto_37

    :cond_53
    const/4 v0, 0x1

    .line 3380
    iput v0, v9, Ll/֨ۡۛ;->֫:I

    .line 3381
    iput v7, v9, Ll/֨ۡۛ;->᩸:I

    .line 3382
    iget v0, v9, Ll/֨ۡۛ;->ۤ:I

    add-int/2addr v0, v7

    iput v0, v9, Ll/֨ۡۛ;->ۤ:I

    const/4 v0, 0x0

    .line 3383
    iput v0, v9, Ll/֨ۡۛ;->۫:I

    goto :goto_3a

    :cond_54
    const/4 v7, 0x0

    .line 3385
    invoke-virtual {v15, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v12, v12, 0x4

    .line 3387
    iput v7, v9, Ll/֨ۡۛ;->֫:I

    .line 3388
    iput v0, v9, Ll/֨ۡۛ;->᩸:I

    .line 3389
    iput v0, v9, Ll/֨ۡۛ;->ۤ:I

    :goto_38
    if-ge v7, v0, :cond_55

    .line 3391
    iget-object v13, v9, Ll/֨ۡۛ;->ᩴ:[Ljava/lang/Object;

    move-object/from16 v28, v15

    move/from16 v29, v12

    move-object/from16 v30, v13

    move/from16 v31, v7

    move-object/from16 v32, v10

    move-object/from16 v33, v11

    .line 3392
    invoke-direct/range {v28 .. v33}, Ll/ܰۡۛ;->ۙ(I[Ljava/lang/Object;I[C[Ll/ۤۖۛ;)I

    move-result v12

    add-int/lit8 v7, v7, 0x1

    goto :goto_38

    .line 3395
    :cond_55
    invoke-virtual {v15, v12}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v12, v12, 0x2

    .line 3397
    iput v0, v9, Ll/֨ۡۛ;->۫:I

    const/4 v7, 0x0

    move/from16 v29, v12

    :goto_39
    if-ge v7, v0, :cond_56

    .line 3399
    iget-object v12, v9, Ll/֨ۡۛ;->ۚ:[Ljava/lang/Object;

    move-object/from16 v28, v15

    move-object/from16 v30, v12

    move/from16 v31, v7

    move-object/from16 v32, v10

    move-object/from16 v33, v11

    .line 3400
    invoke-direct/range {v28 .. v33}, Ll/ܰۡۛ;->ۙ(I[Ljava/lang/Object;I[C[Ll/ۤۖۛ;)I

    move-result v29

    add-int/lit8 v7, v7, 0x1

    goto :goto_39

    :cond_56
    :goto_3a
    move/from16 v0, v29

    :goto_3b
    move v12, v0

    move/from16 v7, v35

    .line 3407
    :goto_3c
    iget v0, v9, Ll/֨ۡۛ;->ܳ:I

    add-int/lit8 v7, v7, 0x1

    add-int/2addr v7, v0

    iput v7, v9, Ll/֨ۡۛ;->ܳ:I

    .line 3408
    invoke-static {v7, v11}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    move-object v13, v2

    move v7, v12

    move/from16 v2, v24

    move/from16 v0, v26

    goto :goto_3d

    .line 3405
    :cond_57
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_58
    move-object/from16 v15, v26

    move/from16 v26, v0

    const/4 v7, 0x0

    move-object v13, v2

    move/from16 v2, v24

    :goto_3d
    move/from16 v28, v34

    move/from16 v11, v39

    move/from16 v12, v40

    move-object/from16 v14, v41

    move-object/from16 v26, v15

    move-object/from16 v15, v42

    goto/16 :goto_2f

    :cond_59
    move/from16 v24, v2

    move/from16 v39, v11

    move/from16 v40, v12

    move-object v2, v13

    move-object/from16 v41, v14

    move-object/from16 v42, v15

    move-object/from16 v15, v26

    move/from16 v34, v28

    move/from16 v26, v0

    :goto_3e
    if-eqz v25, :cond_5b

    .line 2118
    iget v0, v9, Ll/֨ۡۛ;->ۛ:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_5a

    const/4 v13, 0x0

    const/4 v0, 0x0

    const/16 v11, 0x100

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object v10, v4

    move/from16 v28, v1

    move-object v1, v15

    move-object v15, v0

    .line 2119
    invoke-virtual/range {v10 .. v15}, Ll/ܳۖۛ;->ۙ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_3f

    :cond_5a
    move/from16 v28, v1

    move-object v1, v15

    :goto_3f
    const/16 v25, 0x0

    goto :goto_40

    :cond_5b
    move/from16 v28, v1

    move-object v1, v15

    .line 2125
    :goto_40
    aget-byte v0, v19, v34

    and-int/lit16 v0, v0, 0xff

    const/16 v10, 0xc8

    packed-switch v0, :pswitch_data_4

    .line 2518
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :pswitch_d
    add-int/lit8 v0, v34, 0x1

    .line 2365
    invoke-virtual {v1, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v0

    add-int/2addr v0, v8

    aget-object v0, v5, v0

    .line 2364
    invoke-virtual {v4, v10, v0}, Ll/ܳۖۛ;->ۙ(ILl/ۤۖۛ;)V

    add-int/lit8 v10, v34, 0x5

    const/4 v0, 0x1

    goto/16 :goto_47

    :pswitch_e
    const/16 v10, 0xda

    if-ge v0, v10, :cond_5c

    add-int/lit8 v0, v0, -0x31

    goto :goto_41

    :cond_5c
    add-int/lit8 v0, v0, -0x14

    :goto_41
    add-int/lit8 v10, v34, 0x1

    .line 2343
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v10

    add-int/2addr v10, v8

    aget-object v10, v5, v10

    const/16 v11, 0xa7

    if-eq v0, v11, :cond_5f

    const/16 v11, 0xa8

    if-ne v0, v11, :cond_5d

    goto :goto_43

    :cond_5d
    const/16 v11, 0xa7

    if-ge v0, v11, :cond_5e

    add-int/lit8 v0, v0, 0x1

    xor-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_42

    :cond_5e
    xor-int/lit8 v0, v0, 0x1

    :goto_42
    add-int/lit8 v11, v8, 0x3

    .line 2352
    invoke-static {v11, v5}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    move-result-object v11

    .line 2353
    invoke-virtual {v4, v0, v11}, Ll/ܳۖۛ;->ۙ(ILl/ۤۖۛ;)V

    const/16 v0, 0xc8

    .line 2354
    invoke-virtual {v4, v0, v10}, Ll/ܳۖۛ;->ۙ(ILl/ۤۖۛ;)V

    const/4 v0, 0x1

    const/16 v25, 0x1

    goto :goto_45

    :cond_5f
    :goto_43
    add-int/lit8 v0, v0, 0x21

    .line 2346
    invoke-virtual {v4, v0, v10}, Ll/ܳۖۛ;->ۙ(ILl/ۤۖۛ;)V

    goto :goto_45

    :pswitch_f
    sub-int/2addr v0, v6

    add-int/lit8 v10, v34, 0x1

    .line 2311
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->᩷(I)I

    move-result v10

    add-int/2addr v10, v8

    aget-object v10, v5, v10

    .line 2309
    invoke-virtual {v4, v0, v10}, Ll/ܳۖۛ;->ۙ(ILl/ۤۖۛ;)V

    add-int/lit8 v10, v34, 0x5

    goto :goto_46

    :pswitch_10
    add-int/lit8 v10, v34, 0x1

    .line 3815
    invoke-direct {v1, v2, v10}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v10, v34, 0x3

    .line 2514
    aget-byte v10, v19, v10

    and-int/lit16 v10, v10, 0xff

    .line 2513
    invoke-virtual {v4, v10, v0}, Ll/ܳۖۛ;->ۙ(ILjava/lang/String;)V

    :goto_44
    add-int/lit8 v10, v34, 0x4

    goto :goto_46

    :pswitch_11
    add-int/lit8 v10, v34, 0x1

    .line 2373
    aget-byte v0, v19, v10

    and-int/lit16 v0, v0, 0xff

    const/16 v10, 0x84

    if-ne v0, v10, :cond_60

    add-int/lit8 v10, v34, 0x2

    .line 2376
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v10, v34, 0x4

    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->᩸(I)S

    move-result v10

    .line 2375
    invoke-virtual {v4, v0, v10}, Ll/ܳۖۛ;->ۙ(II)V

    add-int/lit8 v10, v34, 0x6

    goto :goto_46

    :cond_60
    add-int/lit8 v10, v34, 0x2

    .line 2379
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v10

    invoke-virtual {v4, v0, v10}, Ll/ܳۖۛ;->᩸(II)V

    goto :goto_44

    :pswitch_12
    add-int/lit8 v10, v34, 0x1

    .line 3815
    invoke-direct {v1, v2, v10}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v10

    .line 2504
    invoke-virtual {v4, v0, v10}, Ll/ܳۖۛ;->ۤ(ILjava/lang/String;)V

    :goto_45
    add-int/lit8 v10, v34, 0x3

    :goto_46
    move/from16 v0, v25

    :goto_47
    move/from16 v32, v0

    move-object v15, v1

    move-object/from16 v33, v15

    move-object v13, v2

    move/from16 v31, v7

    move-object v14, v9

    move/from16 v9, v17

    move-object/from16 v25, v19

    move/from16 v29, v21

    move/from16 v30, v22

    move/from16 v7, v23

    move-object/from16 v34, v27

    move-object/from16 v12, v41

    move-object/from16 v11, v42

    move/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v1, p3

    move/from16 v23, v18

    move/from16 v27, v20

    goto/16 :goto_54

    :pswitch_13
    add-int/lit8 v10, v34, 0x1

    .line 2480
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    aget v0, v27, v0

    add-int/lit8 v10, v0, 0x2

    .line 2481
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v10

    aget v10, v27, v10

    .line 2482
    invoke-virtual {v1, v2, v10}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v11

    add-int/lit8 v10, v10, 0x2

    .line 2483
    invoke-virtual {v1, v2, v10}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v10

    .line 2484
    iget-object v12, v1, Ll/ܰۡۛ;->ۙ:[I

    invoke-virtual {v1, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    aget v0, v12, v0

    .line 2486
    invoke-virtual {v1, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v12

    invoke-virtual {v1, v2, v12}, Ll/ܰۡۛ;->ۙ([CI)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۙۖۛ;

    add-int/lit8 v13, v0, 0x2

    .line 2488
    invoke-virtual {v1, v13}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v13

    new-array v14, v13, [Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x4

    const/4 v15, 0x0

    :goto_48
    if-ge v15, v13, :cond_61

    move/from16 v29, v6

    .line 2492
    invoke-virtual {v1, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v6

    invoke-virtual {v1, v2, v6}, Ll/ܰۡۛ;->ۙ([CI)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v14, v15

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v15, v15, 0x1

    move/from16 v6, v29

    goto :goto_48

    :cond_61
    move/from16 v29, v6

    .line 2495
    invoke-virtual {v4, v11, v10, v12, v14}, Ll/ܳۖۛ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/ۙۖۛ;[Ljava/lang/Object;)V

    :goto_49
    add-int/lit8 v10, v34, 0x5

    goto/16 :goto_53

    :pswitch_14
    move/from16 v29, v6

    add-int/lit8 v10, v34, 0x1

    .line 2459
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v6

    aget v6, v27, v6

    add-int/lit8 v10, v6, 0x2

    .line 2460
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v10

    aget v10, v27, v10

    .line 3815
    invoke-direct {v1, v2, v6}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v12

    .line 2462
    invoke-virtual {v1, v2, v10}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v13

    add-int/lit8 v10, v10, 0x2

    .line 2463
    invoke-virtual {v1, v2, v10}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v14

    const/16 v10, 0xb6

    if-ge v0, v10, :cond_62

    .line 2465
    invoke-virtual {v4, v12, v0, v13, v14}, Ll/ܳۖۛ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_4b

    :cond_62
    add-int/lit8 v6, v6, -0x1

    .line 2467
    aget-byte v6, v19, v6

    const/16 v10, 0xb

    if-ne v6, v10, :cond_63

    const/4 v6, 0x1

    const/4 v15, 0x1

    goto :goto_4a

    :cond_63
    const/4 v6, 0x0

    const/4 v15, 0x0

    :goto_4a
    move-object v10, v4

    move v11, v0

    .line 2469
    invoke-virtual/range {v10 .. v15}, Ll/ܳۖۛ;->ۙ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_4b
    const/16 v6, 0xb9

    if-ne v0, v6, :cond_66

    goto :goto_49

    :pswitch_15
    move/from16 v29, v6

    and-int/lit8 v0, v8, 0x3

    rsub-int/lit8 v0, v0, 0x4

    add-int v0, v0, v34

    .line 2405
    invoke-virtual {v1, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v6

    add-int/2addr v6, v8

    aget-object v6, v5, v6

    add-int/lit8 v10, v0, 0x4

    .line 2406
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->᩷(I)I

    move-result v10

    add-int/lit8 v0, v0, 0x8

    .line 2408
    new-array v11, v10, [I

    .line 2409
    new-array v12, v10, [Ll/ۤۖۛ;

    const/4 v13, 0x0

    :goto_4c
    if-ge v13, v10, :cond_64

    .line 2411
    invoke-virtual {v1, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v14

    aput v14, v11, v13

    add-int/lit8 v14, v0, 0x4

    .line 2412
    invoke-virtual {v1, v14}, Ll/ܰۡۛ;->᩷(I)I

    move-result v14

    add-int/2addr v14, v8

    aget-object v14, v5, v14

    aput-object v14, v12, v13

    add-int/lit8 v0, v0, 0x8

    add-int/lit8 v13, v13, 0x1

    goto :goto_4c

    .line 2415
    :cond_64
    invoke-virtual {v4, v6, v11, v12}, Ll/ܳۖۛ;->ۙ(Ll/ۤۖۛ;[I[Ll/ۤۖۛ;)V

    goto/16 :goto_51

    :pswitch_16
    move/from16 v29, v6

    and-int/lit8 v0, v8, 0x3

    rsub-int/lit8 v0, v0, 0x4

    add-int v0, v0, v34

    .line 2388
    invoke-virtual {v1, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v6

    add-int/2addr v6, v8

    aget-object v6, v5, v6

    add-int/lit8 v10, v0, 0x4

    .line 2389
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->᩷(I)I

    move-result v10

    add-int/lit8 v11, v0, 0x8

    .line 2390
    invoke-virtual {v1, v11}, Ll/ܰۡۛ;->᩷(I)I

    move-result v11

    add-int/lit8 v0, v0, 0xc

    sub-int v12, v11, v10

    add-int/lit8 v12, v12, 0x1

    .line 2392
    new-array v13, v12, [Ll/ۤۖۛ;

    const/4 v14, 0x0

    :goto_4d
    if-ge v14, v12, :cond_65

    .line 2394
    invoke-virtual {v1, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v15

    add-int/2addr v15, v8

    aget-object v15, v5, v15

    aput-object v15, v13, v14

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v14, v14, 0x1

    goto :goto_4d

    .line 2397
    :cond_65
    invoke-virtual {v4, v10, v11, v6, v13}, Ll/ܳۖۛ;->ۙ(IILl/ۤۖۛ;[Ll/ۤۖۛ;)V

    goto :goto_51

    :pswitch_17
    move/from16 v29, v6

    add-int/lit8 v10, v34, 0x1

    .line 2304
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->᩸(I)S

    move-result v6

    add-int/2addr v6, v8

    aget-object v6, v5, v6

    .line 2303
    invoke-virtual {v4, v0, v6}, Ll/ܳۖۛ;->ۙ(ILl/ۤۖۛ;)V

    goto :goto_50

    :pswitch_18
    move/from16 v29, v6

    add-int/lit8 v10, v34, 0x1

    .line 2508
    aget-byte v0, v19, v10

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v10, v34, 0x2

    aget-byte v6, v19, v10

    invoke-virtual {v4, v0, v6}, Ll/ܳۖۛ;->ۙ(II)V

    goto :goto_50

    :pswitch_19
    move/from16 v29, v6

    add-int/lit8 v0, v0, -0x3b

    shr-int/lit8 v6, v0, 0x2

    add-int/lit8 v6, v6, 0x36

    and-int/lit8 v0, v0, 0x3

    .line 2282
    invoke-virtual {v4, v6, v0}, Ll/ܳۖۛ;->᩸(II)V

    goto :goto_4e

    :pswitch_1a
    move/from16 v29, v6

    add-int/lit8 v0, v0, -0x1a

    shr-int/lit8 v6, v0, 0x2

    add-int/lit8 v6, v6, 0x15

    and-int/lit8 v0, v0, 0x3

    .line 2258
    invoke-virtual {v4, v6, v0}, Ll/ܳۖۛ;->᩸(II)V

    :goto_4e
    add-int/lit8 v10, v34, 0x1

    goto :goto_4f

    :pswitch_1b
    move/from16 v29, v6

    add-int/lit8 v10, v34, 0x1

    .line 2429
    aget-byte v6, v19, v10

    and-int/lit16 v6, v6, 0xff

    invoke-virtual {v4, v0, v6}, Ll/ܳۖۛ;->᩸(II)V

    add-int/lit8 v10, v34, 0x2

    :goto_4f
    move v0, v10

    goto :goto_51

    :pswitch_1c
    move/from16 v29, v6

    add-int/lit8 v10, v34, 0x1

    .line 2447
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Ll/ܰۡۛ;->ۙ([CI)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ll/ܳۖۛ;->ۙ(Ljava/lang/Object;)V

    :goto_50
    add-int/lit8 v10, v34, 0x3

    goto :goto_4f

    :goto_51
    move-object v15, v1

    move-object/from16 v33, v15

    move-object v13, v2

    move/from16 v31, v7

    move-object v14, v9

    move/from16 v10, v16

    move/from16 v9, v17

    move/from16 v30, v22

    move/from16 v7, v23

    move/from16 v32, v25

    move-object/from16 v34, v27

    move/from16 v6, v29

    move-object/from16 v12, v41

    move-object/from16 v11, v42

    move/from16 v2, p1

    move/from16 v1, p3

    move/from16 v16, v0

    move/from16 v23, v18

    move-object/from16 v25, v19

    move/from16 v27, v20

    move/from16 v29, v21

    move-object/from16 v0, p2

    goto/16 :goto_55

    :pswitch_1d
    move/from16 v29, v6

    add-int/lit8 v10, v34, 0x1

    .line 2442
    aget-byte v0, v19, v10

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {v1, v2, v0}, Ll/ܰۡۛ;->ۙ([CI)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ll/ܳۖۛ;->ۙ(Ljava/lang/Object;)V

    goto :goto_52

    :pswitch_1e
    move/from16 v29, v6

    add-int/lit8 v10, v34, 0x1

    .line 2438
    invoke-virtual {v1, v10}, Ll/ܰۡۛ;->᩸(I)S

    move-result v6

    invoke-virtual {v4, v0, v6}, Ll/ܳۖۛ;->᩷(II)V

    :cond_66
    add-int/lit8 v10, v34, 0x3

    goto :goto_53

    :pswitch_1f
    move/from16 v29, v6

    add-int/lit8 v10, v34, 0x1

    .line 2434
    aget-byte v6, v19, v10

    invoke-virtual {v4, v0, v6}, Ll/ܳۖۛ;->᩷(II)V

    :goto_52
    add-int/lit8 v10, v34, 0x2

    goto :goto_53

    :pswitch_20
    move/from16 v29, v6

    .line 2234
    invoke-virtual {v4, v0}, Ll/ܳۖۛ;->ۙ(I)V

    add-int/lit8 v10, v34, 0x1

    :goto_53
    move-object/from16 v0, p2

    move-object v15, v1

    move-object/from16 v33, v15

    move-object v13, v2

    move/from16 v31, v7

    move-object v14, v9

    move/from16 v9, v17

    move/from16 v30, v22

    move/from16 v7, v23

    move/from16 v32, v25

    move-object/from16 v34, v27

    move/from16 v6, v29

    move-object/from16 v12, v41

    move-object/from16 v11, v42

    move/from16 v2, p1

    move/from16 v1, p3

    move/from16 v23, v18

    move-object/from16 v25, v19

    move/from16 v27, v20

    move/from16 v29, v21

    :goto_54
    move/from16 v43, v16

    move/from16 v16, v10

    move/from16 v10, v43

    :goto_55
    move-object/from16 p1, v0

    if-eqz v12, :cond_68

    .line 2522
    array-length v0, v12

    if-ge v10, v0, :cond_68

    if-gt v1, v8, :cond_68

    if-ne v1, v8, :cond_67

    .line 2527
    aget v0, v12, v10

    .line 2528
    invoke-direct {v15, v14, v0}, Ll/ܰۡۛ;->ۙ(Ll/֨ۡۛ;I)I

    move-result v0

    .line 2531
    invoke-virtual {v15, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v19, v0, 0x2

    .line 2534
    iget v0, v14, Ll/֨ۡۛ;->᩵:I

    iget-object v15, v14, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    move/from16 p2, v2

    const/4 v2, 0x1

    .line 2535
    invoke-virtual {v4, v0, v15, v1, v2}, Ll/ܳۖۛ;->ۙ(ILl/᩵ۖۛ;Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v18

    const/16 v20, 0x1

    const/16 v22, 0x0

    move-object/from16 v17, v33

    move-object/from16 v21, v13

    .line 2534
    invoke-direct/range {v17 .. v22}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-object/from16 v15, v33

    goto :goto_56

    :cond_67
    move/from16 p2, v2

    :goto_56
    add-int/lit8 v0, v10, 0x1

    .line 2546
    invoke-direct {v15, v0, v12}, Ll/ܰۡۛ;->ۙ(I[I)I

    move-result v1

    move/from16 v2, p2

    move v10, v0

    move-object/from16 v0, p1

    goto :goto_55

    :cond_68
    move/from16 p2, v2

    move/from16 v0, p2

    move v2, v9

    :goto_57
    if-eqz v11, :cond_6a

    .line 2551
    array-length v9, v11

    if-ge v2, v9, :cond_6a

    if-gt v0, v8, :cond_6a

    if-ne v0, v8, :cond_69

    .line 2556
    aget v0, v11, v2

    .line 2557
    invoke-direct {v15, v14, v0}, Ll/ܰۡۛ;->ۙ(Ll/֨ۡۛ;I)I

    move-result v0

    .line 2560
    invoke-virtual {v15, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v0, v0, 0x2

    move/from16 v17, v1

    .line 2563
    iget v1, v14, Ll/֨ۡۛ;->᩵:I

    move/from16 p2, v3

    iget-object v3, v14, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    move-object/from16 p3, v5

    const/4 v5, 0x0

    .line 2564
    invoke-virtual {v4, v1, v3, v9, v5}, Ll/ܳۖۛ;->ۙ(ILl/᩵ۖۛ;Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    move-object v9, v15

    move/from16 v18, v10

    move-object v10, v1

    move-object v1, v11

    move v11, v0

    move-object/from16 v41, v12

    move v12, v3

    move-object v3, v13

    move-object/from16 v19, v14

    move v14, v5

    .line 2563
    invoke-direct/range {v9 .. v14}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    goto :goto_58

    :cond_69
    move/from16 v17, v1

    move/from16 p2, v3

    move-object/from16 p3, v5

    move/from16 v18, v10

    move-object v1, v11

    move-object/from16 v41, v12

    move-object v3, v13

    move-object/from16 v19, v14

    :goto_58
    add-int/lit8 v2, v2, 0x1

    .line 2575
    invoke-direct {v15, v2, v1}, Ll/ܰۡۛ;->ۙ(I[I)I

    move-result v0

    move-object/from16 v5, p3

    move-object v11, v1

    move-object v13, v3

    move/from16 v1, v17

    move/from16 v10, v18

    move-object/from16 v14, v19

    move-object/from16 v12, v41

    move/from16 v3, p2

    goto :goto_57

    :cond_6a
    move/from16 v17, v1

    move/from16 p2, v3

    move-object/from16 p3, v5

    move/from16 v18, v10

    move-object v1, v11

    move-object/from16 v41, v12

    move-object v3, v13

    move-object/from16 v19, v14

    move-object/from16 v5, p3

    move-object v13, v3

    move-object v8, v15

    move/from16 v10, v16

    move/from16 p3, v17

    move/from16 v16, v18

    move-object/from16 v9, v19

    move/from16 v18, v23

    move-object/from16 v19, v25

    move/from16 v20, v27

    move/from16 v21, v29

    move/from16 v22, v30

    move/from16 v25, v32

    move-object/from16 v27, v34

    move/from16 v11, v39

    move/from16 v12, v40

    move-object/from16 v14, v41

    move/from16 v3, p2

    move-object v15, v1

    move/from16 v17, v2

    move/from16 v2, v24

    move/from16 v1, v28

    move/from16 v24, v31

    move-object/from16 p2, p1

    move/from16 p1, v0

    move/from16 v0, v26

    move-object/from16 v26, v33

    goto/16 :goto_2d

    :cond_6b
    move/from16 v24, v2

    move/from16 v39, v11

    move/from16 v40, v12

    move-object v2, v13

    move-object/from16 v41, v14

    move-object/from16 v42, v15

    move-object/from16 v1, v26

    .line 2579
    aget-object v0, v5, v20

    if-eqz v0, :cond_6c

    .line 2580
    invoke-virtual {v4, v0}, Ll/ܳۖۛ;->ۙ(Ll/ۤۖۛ;)V

    :cond_6c
    if-eqz v3, :cond_71

    .line 2584
    iget v0, v9, Ll/֨ۡۛ;->ۛ:I

    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_71

    if-eqz v24, :cond_6d

    move/from16 v0, v24

    .line 2588
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v6

    mul-int/lit8 v6, v6, 0x3

    new-array v7, v6, [I

    add-int/lit8 v0, v0, 0x2

    :goto_59
    if-lez v6, :cond_6e

    add-int/lit8 v10, v6, -0x1

    add-int/lit8 v11, v0, 0x6

    .line 2593
    aput v11, v7, v10

    add-int/lit8 v10, v6, -0x2

    add-int/lit8 v11, v0, 0x8

    .line 2594
    invoke-virtual {v8, v11}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v11

    aput v11, v7, v10

    add-int/lit8 v6, v6, -0x3

    .line 2595
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v10

    aput v10, v7, v6

    add-int/lit8 v0, v0, 0xa

    goto :goto_59

    :cond_6d
    const/4 v7, 0x0

    .line 2599
    :cond_6e
    invoke-virtual {v8, v3}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v3, v3, 0x2

    :goto_5a
    add-int/lit8 v6, v0, -0x1

    if-lez v0, :cond_71

    .line 2602
    invoke-virtual {v8, v3}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v10, v3, 0x2

    .line 2603
    invoke-virtual {v8, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v10

    add-int/lit8 v11, v3, 0x4

    .line 2604
    invoke-virtual {v8, v2, v11}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v11

    add-int/lit8 v12, v3, 0x6

    .line 2605
    invoke-virtual {v8, v2, v12}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v12

    add-int/lit8 v13, v3, 0x8

    .line 2606
    invoke-virtual {v8, v13}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v15

    add-int/lit8 v3, v3, 0xa

    if-eqz v7, :cond_70

    const/4 v13, 0x0

    .line 2610
    :goto_5b
    array-length v14, v7

    if-ge v13, v14, :cond_70

    .line 2611
    aget v14, v7, v13

    if-ne v14, v0, :cond_6f

    add-int/lit8 v14, v13, 0x1

    aget v14, v7, v14

    if-ne v14, v15, :cond_6f

    add-int/lit8 v13, v13, 0x2

    .line 2612
    aget v13, v7, v13

    invoke-virtual {v8, v2, v13}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v13

    goto :goto_5c

    :cond_6f
    add-int/lit8 v13, v13, 0x3

    goto :goto_5b

    :cond_70
    const/4 v13, 0x0

    .line 2617
    :goto_5c
    aget-object v14, v5, v0

    add-int/2addr v0, v10

    aget-object v0, v5, v0

    move-object v10, v4

    move/from16 v16, v15

    move-object v15, v0

    invoke-virtual/range {v10 .. v16}, Ll/ܳۖۛ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۤۖۛ;Ll/ۤۖۛ;I)V

    move v0, v6

    goto :goto_5a

    :cond_71
    const/16 v0, 0x41

    move-object/from16 v3, v41

    if-eqz v3, :cond_74

    .line 2624
    array-length v5, v3

    const/4 v6, 0x0

    :goto_5d
    if-ge v6, v5, :cond_74

    aget v7, v3, v6

    .line 2625
    invoke-virtual {v8, v7}, Ll/ܰۡۛ;->ۙ(I)I

    move-result v10

    const/16 v11, 0x40

    if-eq v10, v11, :cond_72

    if-ne v10, v0, :cond_73

    .line 2629
    :cond_72
    invoke-direct {v8, v9, v7}, Ll/ܰۡۛ;->ۙ(Ll/֨ۡۛ;I)I

    move-result v7

    .line 2631
    invoke-virtual {v8, v2, v7}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v16

    add-int/lit8 v22, v7, 0x2

    .line 2634
    iget v11, v9, Ll/֨ۡۛ;->᩵:I

    iget-object v12, v9, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    iget-object v13, v9, Ll/֨ۡۛ;->ܺ:[Ll/ۤۖۛ;

    iget-object v14, v9, Ll/֨ۡۛ;->ۧ:[Ll/ۤۖۛ;

    iget-object v15, v9, Ll/֨ۡۛ;->᩻:[I

    const/16 v17, 0x1

    move-object v10, v4

    .line 2635
    invoke-virtual/range {v10 .. v17}, Ll/ܳۖۛ;->ۙ(ILl/᩵ۖۛ;[Ll/ۤۖۛ;[Ll/ۤۖۛ;[ILjava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v21

    const/16 v23, 0x1

    const/16 v25, 0x0

    move-object/from16 v20, v8

    move-object/from16 v24, v2

    .line 2634
    invoke-direct/range {v20 .. v25}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    :cond_73
    add-int/lit8 v6, v6, 0x1

    goto :goto_5d

    :cond_74
    move-object/from16 v5, v42

    if-eqz v5, :cond_77

    .line 2653
    array-length v3, v5

    const/4 v6, 0x0

    :goto_5e
    if-ge v6, v3, :cond_77

    aget v7, v5, v6

    .line 2654
    invoke-virtual {v8, v7}, Ll/ܰۡۛ;->ۙ(I)I

    move-result v10

    const/16 v11, 0x40

    if-eq v10, v11, :cond_75

    if-ne v10, v0, :cond_76

    .line 2658
    :cond_75
    invoke-direct {v8, v9, v7}, Ll/ܰۡۛ;->ۙ(Ll/֨ۡۛ;I)I

    move-result v7

    .line 2660
    invoke-virtual {v8, v2, v7}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v16

    add-int/lit8 v22, v7, 0x2

    .line 2663
    iget v11, v9, Ll/֨ۡۛ;->᩵:I

    iget-object v12, v9, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    iget-object v13, v9, Ll/֨ۡۛ;->ܺ:[Ll/ۤۖۛ;

    iget-object v14, v9, Ll/֨ۡۛ;->ۧ:[Ll/ۤۖۛ;

    iget-object v15, v9, Ll/֨ۡۛ;->᩻:[I

    const/16 v17, 0x0

    move-object v10, v4

    .line 2664
    invoke-virtual/range {v10 .. v17}, Ll/ܳۖۛ;->ۙ(ILl/᩵ۖۛ;[Ll/ۤۖۛ;[Ll/ۤۖۛ;[ILjava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v21

    const/16 v23, 0x1

    const/16 v25, 0x0

    move-object/from16 v20, v8

    move-object/from16 v24, v2

    .line 2663
    invoke-direct/range {v20 .. v25}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    :cond_76
    add-int/lit8 v6, v6, 0x1

    move-object v8, v1

    goto :goto_5e

    :cond_77
    move-object/from16 v2, p2

    :goto_5f
    if-eqz v2, :cond_78

    .line 2683
    iget-object v0, v2, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    const/4 v1, 0x0

    .line 2684
    iput-object v1, v2, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    .line 2685
    invoke-virtual {v4, v2}, Ll/ܳۖۛ;->ۙ(Ll/᩺ۡۛ;)V

    move-object v2, v0

    goto :goto_5f

    :cond_78
    move/from16 v14, v39

    move/from16 v13, v40

    .line 2690
    invoke-virtual {v4, v13, v14}, Ll/ܳۖۛ;->ۤ(II)V

    move-object v3, v4

    move/from16 v12, v18

    goto :goto_60

    .line 1566
    :cond_79
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_7a
    move-object v3, v12

    move/from16 v12, v16

    .line 1538
    :goto_60
    invoke-virtual {v3}, Ll/ܳۖۛ;->ۤ()V

    return v12

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_8
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_9
        :pswitch_6
        :pswitch_5
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_4
        :pswitch_4
        :pswitch_8
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_a
        :pswitch_8
        :pswitch_8
        :pswitch_a
        :pswitch_a
        :pswitch_2
        :pswitch_3
        :pswitch_7
        :pswitch_7
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x36
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x42
        :pswitch_c
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1c
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_18
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_1b
        :pswitch_16
        :pswitch_15
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_1f
        :pswitch_12
        :pswitch_20
        :pswitch_20
        :pswitch_12
        :pswitch_12
        :pswitch_20
        :pswitch_20
        :pswitch_11
        :pswitch_10
        :pswitch_17
        :pswitch_17
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
    .end packed-switch
.end method

.method public static ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;
    .locals 1

    .line 2718
    aget-object v0, p1, p0

    if-nez v0, :cond_0

    .line 2719
    new-instance v0, Ll/ۤۖۛ;

    invoke-direct {v0}, Ll/ۤۖۛ;-><init>()V

    aput-object v0, p1, p0

    .line 2721
    :cond_0
    aget-object p0, p1, p0

    .line 2735
    iget-short p1, p0, Ll/ۤۖۛ;->᩷:S

    and-int/lit8 p1, p1, -0x2

    int-to-short p1, p1

    iput-short p1, p0, Ll/ۤۖۛ;->᩷:S

    return-object p0
.end method

.method private ۙ([CII)Ll/ᩳۡۛ;
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    if-eqz p3, :cond_4

    .line 3863
    iget-object v2, v0, Ll/ܰۡۛ;->ۤ:[Ll/ᩳۡۛ;

    aget-object v3, v2, p2

    if-eqz v3, :cond_0

    return-object v3

    .line 3867
    :cond_0
    iget-object v3, v0, Ll/ܰۡۛ;->ᩴ:[I

    aget v4, v3, p2

    add-int/lit8 v5, v4, 0x2

    .line 3868
    invoke-virtual {p0, v5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v5

    aget v5, v3, v5

    .line 3869
    invoke-virtual {p0, v1, v5}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v5, v5, 0x2

    .line 3870
    invoke-virtual {p0, v1, v5}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v5

    .line 3871
    iget-object v7, v0, Ll/ܰۡۛ;->ۙ:[I

    invoke-virtual {p0, v4}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v4

    aget v4, v7, v4

    .line 3872
    invoke-virtual {p0, v4}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v7

    .line 3898
    aget v8, v3, v7

    add-int/lit8 v8, v8, -0x1

    .line 3899
    iget-object v9, v0, Ll/ܰۡۛ;->᩷:[B

    aget-byte v8, v9, v8

    const/16 v10, 0x11

    if-eq v8, v10, :cond_3

    .line 3876
    invoke-virtual {p0, v1, v7}, Ll/ܰۡۛ;->ۙ([CI)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۙۖۛ;

    add-int/lit8 v8, v4, 0x2

    .line 3877
    invoke-virtual {p0, v8}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v8

    new-array v11, v8, [Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x4

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v8, :cond_2

    .line 3880
    invoke-virtual {p0, v4}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v13

    .line 3898
    aget v14, v3, v13

    add-int/lit8 v14, v14, -0x1

    .line 3899
    aget-byte v14, v9, v14

    if-ne v14, v10, :cond_1

    add-int/lit8 v14, p3, -0x1

    .line 3883
    invoke-direct {p0, v1, v13, v14}, Ll/ܰۡۛ;->ۙ([CII)Ll/ᩳۡۛ;

    move-result-object v13

    goto :goto_1

    .line 3884
    :cond_1
    invoke-virtual {p0, v1, v13}, Ll/ܰۡۛ;->ۙ([CI)Ljava/lang/Object;

    move-result-object v13

    :goto_1
    aput-object v13, v11, v12

    add-int/lit8 v4, v4, 0x2

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 3887
    :cond_2
    new-instance v1, Ll/ᩳۡۛ;

    invoke-direct {v1, v6, v5, v7, v11}, Ll/ᩳۡۛ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ۙۖۛ;[Ljava/lang/Object;)V

    aput-object v1, v2, p2

    return-object v1

    .line 3874
    :cond_3
    new-instance v1, Ljava/lang/ClassCastException;

    const-string v2, "ConstantDynamic cannot be cast to Handle"

    invoke-direct {v1, v2}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 3861
    :cond_4
    new-instance v1, Ll/᩸ۖۛ;

    const-string v2, "Too many nested ConstantDynamic"

    .line 18
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 3861
    throw v1
.end method

.method private ۙ([Ll/᩺ۡۛ;Ljava/lang/String;II[CI[Ll/ۤۖۛ;)Ll/᩺ۡۛ;
    .locals 2

    .line 3586
    iget-object p6, p0, Ll/ܰۡۛ;->᩷:[B

    array-length p6, p6

    sub-int/2addr p6, p3

    if-gt p4, p6, :cond_2

    .line 3589
    array-length p6, p1

    const/4 p7, 0x0

    :goto_0
    if-ge p7, p6, :cond_1

    aget-object v0, p1, p7

    .line 3590
    iget-object v1, v0, Ll/᩺ۡۛ;->ۤ:Ljava/lang/String;

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3591
    invoke-virtual {v0, p0, p3, p4, p5}, Ll/᩺ۡۛ;->ۙ(Ll/ܰۡۛ;II[C)Ll/᩺ۡۛ;

    move-result-object p1

    return-object p1

    :cond_0
    add-int/lit8 p7, p7, 0x1

    goto :goto_0

    .line 3595
    :cond_1
    new-instance p1, Ll/᩺ۡۛ;

    invoke-direct {p1, p2}, Ll/᩺ۡۛ;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-virtual {p1, p0, p3, p4, p2}, Ll/᩺ۡۛ;->ۙ(Ll/ܰۡۛ;II[C)Ll/᩺ۡۛ;

    move-result-object p1

    return-object p1

    .line 3587
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method private ۙ(Ll/ܳۖۛ;Ll/֨ۡۛ;IZ)V
    .locals 9

    add-int/lit8 v0, p3, 0x1

    .line 2984
    iget-object v1, p0, Ll/ܰۡۛ;->᩷:[B

    aget-byte p3, v1, p3

    and-int/lit16 p3, p3, 0xff

    .line 2985
    invoke-virtual {p1, p3, p4}, Ll/ܳۖۛ;->ۙ(IZ)V

    .line 2986
    iget-object p2, p2, Ll/֨ۡۛ;->᩷:[C

    const/4 v1, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, p3, :cond_1

    .line 2988
    invoke-virtual {p0, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x2

    :goto_1
    add-int/lit8 v8, v1, -0x1

    if-lez v1, :cond_0

    .line 2992
    invoke-virtual {p0, p2, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v3, v0, 0x2

    .line 2997
    invoke-virtual {p1, v7, v1, p4}, Ll/ܳۖۛ;->ۙ(ILjava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v2

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    move-object v5, p2

    .line 2996
    invoke-direct/range {v1 .. v6}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v0

    move v1, v8

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ᩷([CII)Ljava/lang/String;
    .locals 7

    add-int/2addr p3, p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge p2, p3, :cond_2

    add-int/lit8 v2, p2, 0x1

    .line 3767
    iget-object v3, p0, Ll/ܰۡۛ;->᩷:[B

    aget-byte v4, v3, p2

    and-int/lit16 v5, v4, 0x80

    if-nez v5, :cond_0

    add-int/lit8 p2, v1, 0x1

    and-int/lit8 v3, v4, 0x7f

    int-to-char v3, v3

    .line 3769
    aput-char v3, p1, v1

    move v1, p2

    move p2, v2

    goto :goto_0

    :cond_0
    and-int/lit16 v5, v4, 0xe0

    const/16 v6, 0xc0

    if-ne v5, v6, :cond_1

    add-int/lit8 v5, v1, 0x1

    and-int/lit8 v4, v4, 0x1f

    shl-int/lit8 v4, v4, 0x6

    add-int/lit8 p2, p2, 0x2

    .line 3771
    aget-byte v2, v3, v2

    and-int/lit8 v2, v2, 0x3f

    add-int/2addr v4, v2

    int-to-char v2, v4

    aput-char v2, p1, v1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v1, 0x1

    and-int/lit8 v4, v4, 0xf

    shl-int/lit8 v4, v4, 0xc

    add-int/lit8 v6, p2, 0x2

    .line 3774
    aget-byte v2, v3, v2

    and-int/lit8 v2, v2, 0x3f

    shl-int/lit8 v2, v2, 0x6

    add-int/2addr v4, v2

    add-int/lit8 p2, p2, 0x3

    aget-byte v2, v3, v6

    and-int/lit8 v2, v2, 0x3f

    add-int/2addr v4, v2

    int-to-char v2, v4

    aput-char v2, p1, v1

    :goto_1
    move v1, v5

    goto :goto_0

    .line 3781
    :cond_2
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p1, v0, v1}, Ljava/lang/String;-><init>([CII)V

    return-object p2
.end method

.method private ᩷(Ll/ܳۖۛ;Ll/֨ۡۛ;IZ)[I
    .locals 11

    .line 2776
    iget-object v6, p2, Ll/֨ۡۛ;->᩷:[C

    .line 2779
    invoke-virtual {p0, p3}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v7

    new-array v8, v7, [I

    const/4 v9, 0x2

    add-int/2addr p3, v9

    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v7, :cond_4

    .line 2783
    aput p3, v8, v10

    .line 2786
    invoke-virtual {p0, p3}, Ll/ܰۡۛ;->᩷(I)I

    move-result v0

    ushr-int/lit8 v1, v0, 0x18

    const/16 v2, 0x17

    if-eq v1, v2, :cond_0

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    .line 2829
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    add-int/lit8 p3, p3, 0x4

    goto :goto_2

    :pswitch_1
    add-int/lit8 v2, p3, 0x1

    .line 2792
    invoke-virtual {p0, v2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v2

    add-int/lit8 p3, p3, 0x3

    :goto_1
    add-int/lit8 v3, v2, -0x1

    if-lez v2, :cond_1

    .line 2795
    invoke-virtual {p0, p3}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v2

    add-int/lit8 v4, p3, 0x2

    .line 2796
    invoke-virtual {p0, v4}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v4

    add-int/lit8 p3, p3, 0x6

    .line 2799
    iget-object v5, p2, Ll/֨ۡۛ;->᩹:[Ll/ۤۖۛ;

    invoke-static {v2, v5}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    add-int/2addr v2, v4

    .line 2800
    iget-object v4, p2, Ll/֨ۡۛ;->᩹:[Ll/ۤۖۛ;

    invoke-static {v2, v4}, Ll/ܰۡۛ;->ۙ(I[Ll/ۤۖۛ;)Ll/ۤۖۛ;

    move v2, v3

    goto :goto_1

    :cond_0
    :pswitch_2
    add-int/lit8 p3, p3, 0x3

    .line 2833
    :cond_1
    :goto_2
    invoke-virtual {p0, p3}, Ll/ܰۡۛ;->ۙ(I)I

    move-result v2

    const/16 v3, 0x42

    if-ne v1, v3, :cond_3

    if-nez v2, :cond_2

    const/4 v1, 0x0

    goto :goto_3

    .line 2836
    :cond_2
    new-instance v1, Ll/᩵ۖۛ;

    iget-object v3, p0, Ll/ܰۡۛ;->᩷:[B

    invoke-direct {v1, v3, p3}, Ll/᩵ۖۛ;-><init>([BI)V

    :goto_3
    const/4 v3, 0x1

    invoke-static {v2, v9, v3, p3}, Ll/ۨ᩹ۧ;->ۙ(IIII)I

    move-result p3

    .line 2839
    invoke-virtual {p0, v6, p3}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v2

    add-int/2addr p3, v9

    and-int/lit16 v0, v0, -0x100

    .line 2844
    invoke-virtual {p1, v0, v1, v2, p4}, Ll/ܳۖۛ;->᩷(ILl/᩵ۖۛ;Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v5, 0x0

    move-object v0, p0

    move v2, p3

    move-object v4, v6

    .line 2843
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result p3

    goto :goto_4

    :cond_3
    const/4 v0, 0x3

    .line 2850
    invoke-static {v2, v9, v0, p3}, Ll/ۨ᩹ۧ;->ۙ(IIII)I

    move-result v2

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    move-object v4, v6

    .line 2858
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result p3

    :goto_4
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_4
    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x40
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ᩸([CI)Ljava/lang/String;
    .locals 1

    .line 3800
    iget-object v0, p0, Ll/ܰۡۛ;->ᩴ:[I

    invoke-virtual {p0, p2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result p2

    aget p2, v0, p2

    invoke-virtual {p0, p1, p2}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ۙ()I
    .locals 4

    .line 3484
    iget v0, p0, Ll/ܰۡۛ;->ܳ:I

    add-int/lit8 v1, v0, 0x8

    add-int/lit8 v0, v0, 0x6

    invoke-virtual {p0, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    .line 3487
    invoke-virtual {p0, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x2

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_1

    add-int/lit8 v1, v0, 0x6

    .line 3494
    invoke-virtual {p0, v1}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x8

    :goto_1
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_0

    add-int/lit8 v1, v0, 0x2

    .line 3502
    invoke-virtual {p0, v1}, Ll/ܰۡۛ;->᩷(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x6

    add-int/2addr v0, v1

    move v1, v3

    goto :goto_1

    :cond_0
    move v1, v2

    goto :goto_0

    .line 3507
    :cond_1
    invoke-virtual {p0, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x2

    :goto_2
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_3

    add-int/lit8 v1, v0, 0x6

    .line 3510
    invoke-virtual {p0, v1}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x8

    :goto_3
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_2

    add-int/lit8 v1, v0, 0x2

    .line 3513
    invoke-virtual {p0, v1}, Ll/ܰۡۛ;->᩷(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x6

    add-int/2addr v0, v1

    move v1, v3

    goto :goto_3

    :cond_2
    move v1, v2

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ۙ(I)I
    .locals 1

    .line 3644
    iget-object v0, p0, Ll/ܰۡۛ;->᩷:[B

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public final ۙ([CI)Ljava/lang/Object;
    .locals 7

    .line 3917
    iget-object v0, p0, Ll/ܰۡۛ;->ᩴ:[I

    aget v1, v0, p2

    add-int/lit8 v2, v1, -0x1

    .line 3918
    iget-object v3, p0, Ll/ܰۡۛ;->᩷:[B

    aget-byte v2, v3, v2

    packed-switch v2, :pswitch_data_0

    packed-switch v2, :pswitch_data_1

    .line 3951
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 3930
    :pswitch_0
    invoke-virtual {p0, p1, v1}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3928
    :pswitch_1
    invoke-virtual {p0, p1, v1}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۗۖۛ;->ᩴ(Ljava/lang/String;)Ll/ۗۖۛ;

    move-result-object p1

    return-object p1

    .line 3926
    :pswitch_2
    invoke-virtual {p0, v1}, Ll/ܰۡۛ;->ۤ(I)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 3924
    :pswitch_3
    invoke-virtual {p0, v1}, Ll/ܰۡۛ;->ۤ(I)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 3922
    :pswitch_4
    invoke-virtual {p0, v1}, Ll/ܰۡۛ;->᩷(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    .line 3920
    :pswitch_5
    invoke-virtual {p0, v1}, Ll/ܰۡۛ;->᩷(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_6
    const/16 v0, 0x7f

    .line 3945
    invoke-direct {p0, p1, p2, v0}, Ll/ܰۡۛ;->ۙ([CII)Ll/ᩳۡۛ;

    move-result-object p1

    const/16 p2, 0x1000

    .line 3946
    invoke-virtual {p1, p2}, Ll/ᩳۡۛ;->᩷(I)I

    move-result p2

    if-lez p2, :cond_0

    return-object p1

    .line 3947
    :cond_0
    new-instance p1, Ll/᩸ۖۛ;

    const-string p2, "Too many nested ConstantDynamic"

    .line 18
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 3947
    throw p1

    .line 3932
    :pswitch_7
    invoke-virtual {p0, p1, v1}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۗۖۛ;->᩸(Ljava/lang/String;)Ll/ۗۖۛ;

    move-result-object p1

    return-object p1

    .line 3934
    :pswitch_8
    invoke-virtual {p0, v1}, Ll/ܰۡۛ;->ۙ(I)I

    move-result p2

    add-int/lit8 v1, v1, 0x1

    .line 3935
    invoke-virtual {p0, v1}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    aget v1, v0, v1

    add-int/lit8 v2, v1, 0x2

    .line 3936
    invoke-virtual {p0, v2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v2

    aget v0, v0, v2

    .line 3815
    invoke-direct {p0, p1, v1}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v2

    .line 3938
    invoke-virtual {p0, p1, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v0, v0, 0x2

    .line 3939
    invoke-virtual {p0, p1, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v1, v1, -0x1

    .line 3940
    aget-byte v0, v3, v1

    const/16 v1, 0xb

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 3942
    :goto_0
    new-instance v6, Ll/ۙۖۛ;

    move-object v0, v6

    move v1, p2

    move-object v3, v4

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Ll/ۙۖۛ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xf
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public final ۙ(Ll/ܿۡۛ;[Ll/᩺ۡۛ;I)V
    .locals 55

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move/from16 v10, p3

    .line 452
    new-instance v11, Ll/֨ۡۛ;

    .line 36
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    move-object/from16 v12, p2

    .line 453
    iput-object v12, v11, Ll/֨ۡۛ;->ۙ:[Ll/᩺ۡۛ;

    .line 454
    iput v10, v11, Ll/֨ۡۛ;->ۛ:I

    .line 455
    iget v0, v8, Ll/ܰۡۛ;->۫:I

    new-array v13, v0, [C

    iput-object v13, v11, Ll/֨ۡۛ;->᩷:[C

    .line 460
    iget v0, v8, Ll/ܰۡۛ;->ܳ:I

    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v2, v0, 0x2

    .line 3815
    invoke-direct {v8, v13, v2}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v14

    add-int/lit8 v2, v0, 0x4

    invoke-direct {v8, v13, v2}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v15

    add-int/lit8 v2, v0, 0x6

    .line 463
    invoke-virtual {v8, v2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v2

    new-array v7, v2, [Ljava/lang/String;

    add-int/lit8 v0, v0, 0x8

    const/4 v3, 0x0

    move v6, v0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 3815
    invoke-direct {v8, v13, v6}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v0

    .line 466
    aput-object v0, v7, v3

    add-int/lit8 v6, v6, 0x2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 508
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ll/ܰۡۛ;->ۙ()I

    move-result v0

    add-int/lit8 v2, v0, -0x2

    .line 509
    invoke-virtual {v8, v2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move/from16 v16, v2

    move-object v2, v5

    move-object/from16 v30, v18

    move-object/from16 v31, v19

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    move v5, v1

    move-object/from16 v18, v7

    const/4 v1, 0x0

    move-object/from16 v54, v4

    move-object v4, v3

    move-object/from16 v3, v54

    :goto_1
    const-string v7, "Synthetic"

    const/high16 v19, 0x20000

    const-string v12, "Deprecated"

    move-object/from16 v20, v11

    const-string v11, "RuntimeInvisibleTypeAnnotations"

    const-string v9, "RuntimeInvisibleAnnotations"

    const-string v10, "RuntimeVisibleTypeAnnotations"

    move/from16 v21, v6

    const-string v6, "RuntimeVisibleAnnotations"

    move-object/from16 v22, v15

    const-string v15, "Signature"

    if-lez v16, :cond_15

    move-object/from16 v23, v2

    .line 511
    invoke-virtual {v8, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v2

    move/from16 v24, v1

    add-int/lit8 v1, v0, 0x2

    .line 512
    invoke-virtual {v8, v1}, Ll/ܰۡۛ;->᩷(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x6

    move-object/from16 v25, v3

    const-string v3, "SourceFile"

    .line 516
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 517
    invoke-virtual {v8, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_3

    :cond_1
    const-string v3, "InnerClasses"

    .line 518
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move/from16 v39, v0

    goto/16 :goto_3

    :cond_2
    const-string v3, "EnclosingMethod"

    .line 520
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    move/from16 v32, v0

    goto/16 :goto_3

    :cond_3
    const-string v3, "NestHost"

    .line 522
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 3815
    invoke-direct {v8, v13, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v30

    goto/16 :goto_3

    :cond_4
    const-string v3, "NestMembers"

    .line 524
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    move/from16 v37, v0

    goto/16 :goto_3

    :cond_5
    const-string v3, "PermittedSubclasses"

    .line 526
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    move/from16 v38, v0

    goto/16 :goto_3

    .line 528
    :cond_6
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 529
    invoke-virtual {v8, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v17

    goto/16 :goto_3

    .line 530
    :cond_7
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    move/from16 v33, v0

    goto :goto_3

    .line 532
    :cond_8
    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    move/from16 v35, v0

    goto :goto_3

    .line 534
    :cond_9
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    or-int v2, v5, v19

    goto :goto_2

    .line 536
    :cond_a
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    or-int/lit16 v2, v5, 0x1000

    :goto_2
    move v5, v2

    goto :goto_3

    :cond_b
    const-string v3, "SourceDebugExtension"

    .line 538
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 539
    iget-object v2, v8, Ll/ܰۡۛ;->᩷:[B

    array-length v2, v2

    sub-int/2addr v2, v0

    if-gt v1, v2, :cond_c

    .line 542
    new-array v2, v1, [C

    .line 543
    invoke-direct {v8, v2, v0, v1}, Ll/ܰۡۛ;->᩷([CII)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v2, v23

    goto :goto_5

    .line 540
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 544
    :cond_d
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    move/from16 v34, v0

    goto :goto_3

    .line 546
    :cond_e
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    move/from16 v36, v0

    goto :goto_3

    :cond_f
    const-string v3, "Record"

    .line 548
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    const/high16 v2, 0x10000

    or-int/2addr v2, v5

    move/from16 v40, v0

    goto :goto_2

    :goto_3
    move-object/from16 v2, v23

    :goto_4
    move-object/from16 v3, v25

    goto :goto_5

    :cond_10
    const-string v3, "Module"

    .line 551
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    move/from16 v41, v0

    goto :goto_3

    :cond_11
    const-string v3, "ModuleMainClass"

    .line 553
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 3815
    invoke-direct {v8, v13, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_12
    const-string v3, "ModulePackages"

    .line 555
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    move/from16 v24, v0

    goto :goto_3

    :goto_5
    move v9, v0

    move v11, v1

    move/from16 v10, v21

    move/from16 v1, v24

    goto :goto_7

    :cond_13
    const-string v3, "BootstrapMethods"

    .line 557
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    const/4 v6, -0x1

    const/4 v7, 0x0

    move v9, v0

    move-object/from16 v0, p0

    move v11, v1

    move/from16 v10, v24

    move-object/from16 v1, p2

    move-object/from16 v12, v23

    move-object/from16 v15, v25

    move v3, v9

    move-object/from16 v42, v4

    move v4, v11

    move/from16 v23, v5

    move-object v5, v13

    move/from16 v10, v21

    .line 560
    invoke-direct/range {v0 .. v7}, Ll/ܰۡۛ;->ۙ([Ll/᩺ۡۛ;Ljava/lang/String;II[CI[Ll/ۤۖۛ;)Ll/᩺ۡۛ;

    move-result-object v0

    move-object/from16 v5, v31

    .line 568
    iput-object v5, v0, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    move-object/from16 v31, v0

    goto :goto_6

    :cond_14
    move v9, v0

    move v11, v1

    move-object/from16 v42, v4

    move/from16 v10, v21

    move-object/from16 v12, v23

    move-object/from16 v15, v25

    move/from16 v23, v5

    move-object/from16 v5, v31

    :goto_6
    move-object v2, v12

    move-object v3, v15

    move/from16 v5, v23

    move/from16 v1, v24

    move-object/from16 v4, v42

    :goto_7
    add-int v0, v9, v11

    add-int/lit8 v16, v16, -0x1

    move-object/from16 v9, p1

    move-object/from16 v12, p2

    move v6, v10

    move-object/from16 v11, v20

    move-object/from16 v15, v22

    move/from16 v10, p3

    goto/16 :goto_1

    :cond_15
    move-object/from16 v42, v4

    move/from16 v23, v5

    move-object/from16 v16, v10

    move/from16 v10, v21

    move-object/from16 v5, v31

    move v4, v1

    .line 576
    iget-object v1, v8, Ll/ܰۡۛ;->ᩴ:[I

    const/4 v0, 0x1

    aget v0, v1, v0

    add-int/lit8 v0, v0, -0x7

    .line 577
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v21

    const/4 v0, 0x1

    move-object/from16 v24, v7

    const/4 v7, 0x1

    move-object/from16 v0, p1

    move-object/from16 v25, v1

    move/from16 v1, v21

    move-object v7, v2

    move/from16 v2, v23

    move-object/from16 v23, v9

    move-object v9, v3

    move-object v3, v14

    move v14, v4

    move-object/from16 v4, v17

    move-object/from16 v5, v22

    move-object/from16 v17, v12

    move-object v12, v6

    move-object/from16 v6, v18

    .line 576
    invoke-virtual/range {v0 .. v6}, Ll/ܿۡۛ;->ۙ(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    move-object/from16 v6, v16

    and-int/lit8 v0, p3, 0x2

    if-nez v0, :cond_17

    move-object/from16 v3, v42

    if-nez v3, :cond_16

    if-eqz v9, :cond_17

    :cond_16
    move-object/from16 v5, p1

    move-object/from16 v4, v23

    .line 582
    invoke-virtual {v5, v3, v9}, Ll/ܿۡۛ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    :cond_17
    move-object/from16 v5, p1

    move-object/from16 v4, v23

    :goto_8
    move/from16 v0, v41

    if-eqz v0, :cond_25

    move-object/from16 v9, v20

    .line 784
    iget-object v1, v9, Ll/֨ۡۛ;->᩷:[C

    .line 3830
    invoke-direct {v8, v1, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v0, 0x2

    .line 789
    invoke-virtual {v8, v3}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v3

    move-object/from16 v23, v4

    add-int/lit8 v4, v0, 0x4

    .line 790
    invoke-virtual {v8, v1, v4}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v4

    move/from16 v16, v10

    add-int/lit8 v10, v0, 0x6

    .line 792
    invoke-virtual {v5, v3, v2, v4}, Ll/ܿۡۛ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ll/ۚۖۛ;

    move-result-object v2

    if-nez v2, :cond_18

    goto/16 :goto_12

    :cond_18
    if-eqz v7, :cond_19

    .line 799
    invoke-virtual {v2, v7}, Ll/ۚۖۛ;->ۙ(Ljava/lang/String;)V

    :cond_19
    if-eqz v14, :cond_1a

    .line 804
    invoke-virtual {v8, v14}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v3

    add-int/lit8 v4, v14, 0x2

    :goto_9
    add-int/lit8 v7, v3, -0x1

    if-lez v3, :cond_1a

    .line 3845
    invoke-direct {v8, v1, v4}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v3

    .line 807
    invoke-virtual {v2, v3}, Ll/ۚۖۛ;->᩷(Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x2

    move v3, v7

    goto :goto_9

    .line 813
    :cond_1a
    invoke-virtual {v8, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v3

    add-int/lit8 v41, v0, 0x8

    move/from16 v0, v41

    :goto_a
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_1b

    .line 3830
    invoke-direct {v8, v1, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v7, v0, 0x2

    .line 818
    invoke-virtual {v8, v7}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v7

    add-int/lit8 v10, v0, 0x4

    .line 819
    invoke-virtual {v8, v1, v10}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v10

    add-int/lit8 v0, v0, 0x6

    .line 821
    invoke-virtual {v2, v7, v3, v10}, Ll/ۚۖۛ;->ۙ(ILjava/lang/String;Ljava/lang/String;)V

    move v3, v4

    goto :goto_a

    .line 825
    :cond_1b
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v3

    add-int/lit8 v0, v0, 0x2

    :goto_b
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_1e

    .line 3845
    invoke-direct {v8, v1, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v7, v0, 0x2

    .line 831
    invoke-virtual {v8, v7}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v7

    add-int/lit8 v10, v0, 0x4

    .line 832
    invoke-virtual {v8, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v10

    add-int/lit8 v0, v0, 0x6

    if-eqz v10, :cond_1c

    .line 836
    new-array v14, v10, [Ljava/lang/String;

    const/16 v18, 0x0

    move/from16 p2, v4

    const/4 v4, 0x0

    :goto_c
    if-ge v4, v10, :cond_1d

    .line 3830
    invoke-direct {v8, v1, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v18

    .line 838
    aput-object v18, v14, v4

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    :cond_1c
    move/from16 p2, v4

    const/4 v14, 0x0

    .line 842
    :cond_1d
    invoke-virtual {v2, v3, v7, v14}, Ll/ۚۖۛ;->ۙ(Ljava/lang/String;I[Ljava/lang/String;)V

    move/from16 v3, p2

    goto :goto_b

    .line 846
    :cond_1e
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v3

    add-int/lit8 v0, v0, 0x2

    :goto_d
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_21

    .line 3845
    invoke-direct {v8, v1, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v7, v0, 0x2

    .line 851
    invoke-virtual {v8, v7}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v7

    add-int/lit8 v10, v0, 0x4

    .line 852
    invoke-virtual {v8, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v10

    add-int/lit8 v0, v0, 0x6

    if-eqz v10, :cond_1f

    .line 856
    new-array v14, v10, [Ljava/lang/String;

    const/16 v18, 0x0

    move/from16 p2, v4

    const/4 v4, 0x0

    :goto_e
    if-ge v4, v10, :cond_20

    .line 3830
    invoke-direct {v8, v1, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v18

    .line 858
    aput-object v18, v14, v4

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v4, v4, 0x1

    goto :goto_e

    :cond_1f
    move/from16 p2, v4

    const/4 v14, 0x0

    .line 862
    :cond_20
    invoke-virtual {v2, v3, v7, v14}, Ll/ۚۖۛ;->᩷(Ljava/lang/String;I[Ljava/lang/String;)V

    move/from16 v3, p2

    goto :goto_d

    .line 866
    :cond_21
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v3

    add-int/lit8 v0, v0, 0x2

    :goto_f
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_22

    .line 3815
    invoke-direct {v8, v1, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v3

    .line 869
    invoke-virtual {v2, v3}, Ll/ۚۖۛ;->ۤ(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x2

    move v3, v4

    goto :goto_f

    .line 874
    :cond_22
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v3

    add-int/lit8 v0, v0, 0x2

    :goto_10
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_24

    .line 3815
    invoke-direct {v8, v1, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v7, v0, 0x2

    .line 879
    invoke-virtual {v8, v7}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v7

    add-int/lit8 v0, v0, 0x4

    .line 881
    new-array v10, v7, [Ljava/lang/String;

    const/4 v14, 0x0

    :goto_11
    if-ge v14, v7, :cond_23

    .line 3815
    invoke-direct {v8, v1, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v18

    .line 883
    aput-object v18, v10, v14

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v14, v14, 0x1

    goto :goto_11

    .line 886
    :cond_23
    invoke-virtual {v2, v3, v10}, Ll/ۚۖۛ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)V

    move v3, v4

    goto :goto_10

    .line 890
    :cond_24
    invoke-virtual {v2}, Ll/ۚۖۛ;->ۙ()V

    goto :goto_12

    :cond_25
    move-object/from16 v23, v4

    move/from16 v16, v10

    move-object/from16 v9, v20

    :goto_12
    move-object/from16 v0, v30

    if-eqz v0, :cond_26

    .line 593
    invoke-virtual {v5, v0}, Ll/ܿۡۛ;->ۙ(Ljava/lang/String;)V

    :cond_26
    move/from16 v0, v32

    if-eqz v0, :cond_29

    .line 3815
    invoke-direct {v8, v13, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x2

    .line 599
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    if-nez v0, :cond_27

    const/4 v2, 0x0

    goto :goto_13

    .line 600
    :cond_27
    aget v2, v25, v0

    invoke-virtual {v8, v13, v2}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v2

    :goto_13
    if-nez v0, :cond_28

    const/4 v0, 0x0

    goto :goto_14

    .line 601
    :cond_28
    aget v0, v25, v0

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {v8, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v0

    .line 602
    :goto_14
    invoke-virtual {v5, v1, v2, v0}, Ll/ܿۡۛ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_29
    move/from16 v0, v33

    if-eqz v0, :cond_2a

    .line 607
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v33, v0, 0x2

    move/from16 v0, v33

    :goto_15
    add-int/lit8 v7, v1, -0x1

    if-lez v1, :cond_2a

    .line 611
    invoke-virtual {v8, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    const/4 v0, 0x1

    .line 616
    invoke-virtual {v5, v1, v0}, Ll/ܿۡۛ;->ۙ(Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v10, 0x0

    move-object/from16 v0, p0

    move-object/from16 v14, v23

    move-object v4, v13

    move/from16 p2, v7

    move-object v7, v5

    move v5, v10

    .line 615
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v0

    move/from16 v1, p2

    move-object v5, v7

    goto :goto_15

    :cond_2a
    move-object v7, v5

    move-object/from16 v14, v23

    move/from16 v0, v34

    if-eqz v0, :cond_2b

    .line 626
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v34, v0, 0x2

    move/from16 v0, v34

    :goto_16
    add-int/lit8 v10, v1, -0x1

    if-lez v1, :cond_2b

    .line 630
    invoke-virtual {v8, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    const/4 v0, 0x0

    .line 635
    invoke-virtual {v7, v1, v0}, Ll/ܿۡۛ;->ۙ(Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v4, v13

    .line 634
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v0

    move v1, v10

    goto :goto_16

    :cond_2b
    move/from16 v0, v35

    if-eqz v0, :cond_2c

    .line 645
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v35, v0, 0x2

    move/from16 v0, v35

    :goto_17
    add-int/lit8 v10, v1, -0x1

    if-lez v1, :cond_2c

    .line 649
    invoke-direct {v8, v9, v0}, Ll/ܰۡۛ;->ۙ(Ll/֨ۡۛ;I)I

    move-result v0

    .line 651
    invoke-virtual {v8, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    .line 654
    iget v0, v9, Ll/֨ۡۛ;->᩵:I

    iget-object v3, v9, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    const/4 v5, 0x1

    .line 656
    invoke-virtual {v7, v0, v3, v1, v5}, Ll/ܿۡۛ;->ۙ(ILl/᩵ۖۛ;Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object v4, v13

    const/16 v20, 0x1

    move/from16 v5, v18

    .line 655
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v0

    move v1, v10

    goto :goto_17

    :cond_2c
    move/from16 v0, v36

    if-eqz v0, :cond_2d

    .line 670
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v36, v0, 0x2

    move/from16 v0, v36

    :goto_18
    add-int/lit8 v10, v1, -0x1

    if-lez v1, :cond_2d

    .line 674
    invoke-direct {v8, v9, v0}, Ll/ܰۡۛ;->ۙ(Ll/֨ۡۛ;I)I

    move-result v0

    .line 676
    invoke-virtual {v8, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    .line 679
    iget v0, v9, Ll/֨ۡۛ;->᩵:I

    iget-object v3, v9, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    const/4 v4, 0x0

    .line 681
    invoke-virtual {v7, v0, v3, v1, v4}, Ll/ܿۡۛ;->ۙ(ILl/᩵ۖۛ;Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v4, v13

    .line 680
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v0

    move v1, v10

    goto :goto_18

    :cond_2d
    move-object/from16 v0, v31

    :goto_19
    if-eqz v0, :cond_2e

    .line 696
    iget-object v1, v0, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    const/4 v2, 0x0

    .line 697
    iput-object v2, v0, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    .line 698
    invoke-virtual {v7, v0}, Ll/ܿۡۛ;->ۙ(Ll/᩺ۡۛ;)V

    move-object v0, v1

    goto :goto_19

    :cond_2e
    move/from16 v0, v37

    if-eqz v0, :cond_2f

    .line 704
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v37, v0, 0x2

    move/from16 v0, v37

    :goto_1a
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_2f

    .line 3815
    invoke-direct {v8, v13, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v1

    .line 707
    invoke-virtual {v7, v1}, Ll/ܿۡۛ;->᩷(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x2

    move v1, v2

    goto :goto_1a

    :cond_2f
    move/from16 v0, v38

    if-eqz v0, :cond_30

    .line 714
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v38, v0, 0x2

    move/from16 v0, v38

    :goto_1b
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_30

    .line 3815
    invoke-direct {v8, v13, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v1

    .line 717
    invoke-virtual {v7, v1}, Ll/ܿۡۛ;->ۤ(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x2

    move v1, v2

    goto :goto_1b

    :cond_30
    move/from16 v0, v39

    if-eqz v0, :cond_31

    .line 725
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v39, v0, 0x2

    move/from16 v0, v39

    :goto_1c
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_31

    .line 3815
    invoke-direct {v8, v13, v0}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v3, v0, 0x2

    invoke-direct {v8, v13, v3}, Ll/ܰۡۛ;->᩸([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v4, v0, 0x4

    .line 731
    invoke-virtual {v8, v13, v4}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, v0, 0x6

    .line 732
    invoke-virtual {v8, v5}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v5

    .line 728
    invoke-virtual {v7, v1, v5, v3, v4}, Ll/ܿۡۛ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x8

    move v1, v2

    goto :goto_1c

    :cond_31
    move/from16 v0, v40

    if-eqz v0, :cond_3f

    .line 739
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v40, v0, 0x2

    move-object v5, v7

    move/from16 v0, v40

    :goto_1d
    add-int/lit8 v10, v1, -0x1

    if-lez v1, :cond_3e

    .line 903
    iget-object v13, v9, Ll/֨ۡۛ;->᩷:[C

    .line 906
    invoke-virtual {v8, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v1, v0, 0x2

    .line 907
    invoke-virtual {v8, v13, v1}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v1, v0, 0x4

    .line 928
    invoke-virtual {v8, v1}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x6

    const/4 v2, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v45, v21

    move-object/from16 v46, v22

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v47, 0x0

    move-object/from16 v54, v5

    move v5, v0

    move-object/from16 v0, v54

    :goto_1e
    add-int/lit8 v18, v1, -0x1

    if-lez v1, :cond_37

    .line 932
    invoke-virtual {v8, v13, v5}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    move/from16 p2, v2

    add-int/lit8 v2, v5, 0x2

    .line 933
    invoke-virtual {v8, v2}, Ll/ܰۡۛ;->᩷(I)I

    move-result v20

    add-int/lit8 v5, v5, 0x6

    .line 937
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_32

    .line 938
    invoke-virtual {v8, v13, v5}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    move/from16 v2, p2

    move-object/from16 v45, v1

    move-object/from16 v49, v3

    move-object/from16 v50, v4

    move/from16 v23, v5

    :goto_1f
    move/from16 p2, v10

    move-object/from16 v21, v11

    move-object/from16 v11, v24

    move-object v10, v6

    goto/16 :goto_21

    .line 939
    :cond_32
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_33

    move-object/from16 v49, v3

    move-object/from16 v50, v4

    move v2, v5

    move/from16 v23, v2

    :goto_20
    move-object v0, v7

    goto :goto_1f

    .line 941
    :cond_33
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_34

    move/from16 v2, p2

    move-object/from16 v49, v3

    move-object/from16 v50, v4

    move/from16 v23, v5

    move/from16 v44, v23

    goto :goto_20

    .line 943
    :cond_34
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_35

    move/from16 v2, p2

    move-object/from16 v49, v3

    move-object/from16 v50, v4

    move/from16 v23, v5

    move/from16 v43, v23

    goto :goto_20

    .line 945
    :cond_35
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_36

    move/from16 v2, p2

    move-object/from16 v49, v3

    move-object/from16 v50, v4

    move/from16 v23, v5

    move/from16 v47, v23

    goto :goto_20

    .line 948
    :cond_36
    iget-object v2, v9, Ll/֨ۡۛ;->ۙ:[Ll/᩺ۡۛ;

    const/16 v21, -0x1

    const/16 v22, 0x0

    move-object/from16 v0, p0

    move-object/from16 v23, v1

    move-object v1, v2

    move/from16 v48, p2

    move-object/from16 v2, v23

    move-object/from16 v49, v3

    move v3, v5

    move-object/from16 v50, v4

    move/from16 v4, v20

    move/from16 v23, v5

    move-object v5, v13

    move/from16 p2, v10

    move-object v10, v6

    move/from16 v6, v21

    move-object/from16 v21, v11

    move-object/from16 v11, v24

    move-object/from16 v7, v22

    .line 949
    invoke-direct/range {v0 .. v7}, Ll/ܰۡۛ;->ۙ([Ll/᩺ۡۛ;Ljava/lang/String;II[CI[Ll/ۤۖۛ;)Ll/᩺ۡۛ;

    move-result-object v0

    move-object/from16 v6, v46

    .line 957
    iput-object v6, v0, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    move-object/from16 v46, v0

    move/from16 v2, v48

    move-object/from16 v0, p1

    :goto_21
    add-int v5, v23, v20

    move-object/from16 v7, p1

    move-object v6, v10

    move-object/from16 v24, v11

    move/from16 v1, v18

    move-object/from16 v11, v21

    move-object/from16 v3, v49

    move-object/from16 v4, v50

    move/from16 v10, p2

    goto/16 :goto_1e

    :cond_37
    move/from16 v48, v2

    move-object v2, v3

    move-object v1, v4

    move/from16 p2, v10

    move-object/from16 v21, v11

    move-object/from16 v11, v24

    move-object/from16 v3, v45

    move-object v10, v6

    move-object/from16 v6, v46

    .line 964
    invoke-virtual {v0, v1, v2, v3}, Ll/ܿۡۛ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۧۖۛ;

    move-result-object v7

    if-nez v7, :cond_38

    move-object/from16 v22, v0

    move/from16 v23, v5

    goto/16 :goto_27

    :cond_38
    move/from16 v2, v48

    if-eqz v2, :cond_39

    .line 971
    invoke-virtual {v8, v2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v2, v2, 0x2

    :goto_22
    add-int/lit8 v18, v1, -0x1

    if-lez v1, :cond_39

    .line 975
    invoke-virtual {v8, v13, v2}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v2, 0x2

    const/4 v3, 0x1

    .line 980
    invoke-virtual {v7, v1, v3}, Ll/ۧۖۛ;->ۙ(Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/16 v20, 0x0

    move-object/from16 v22, v0

    move-object/from16 v0, p0

    move-object v4, v13

    move/from16 v23, v5

    move/from16 v5, v20

    .line 979
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v2

    move/from16 v1, v18

    move-object/from16 v0, v22

    move/from16 v5, v23

    goto :goto_22

    :cond_39
    move-object/from16 v22, v0

    move/from16 v23, v5

    move/from16 v0, v43

    if-eqz v0, :cond_3a

    .line 990
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v43, v0, 0x2

    move/from16 v0, v43

    :goto_23
    add-int/lit8 v18, v1, -0x1

    if-lez v1, :cond_3a

    .line 994
    invoke-virtual {v8, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    const/4 v0, 0x0

    .line 999
    invoke-virtual {v7, v1, v0}, Ll/ۧۖۛ;->ۙ(Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v4, v13

    .line 998
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v0

    move/from16 v1, v18

    goto :goto_23

    :cond_3a
    move/from16 v0, v44

    if-eqz v0, :cond_3b

    .line 1009
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v44, v0, 0x2

    move/from16 v0, v44

    :goto_24
    add-int/lit8 v18, v1, -0x1

    if-lez v1, :cond_3b

    .line 1013
    invoke-direct {v8, v9, v0}, Ll/ܰۡۛ;->ۙ(Ll/֨ۡۛ;I)I

    move-result v0

    .line 1015
    invoke-virtual {v8, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    .line 1018
    iget v0, v9, Ll/֨ۡۛ;->᩵:I

    iget-object v3, v9, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    const/4 v4, 0x1

    .line 1020
    invoke-virtual {v7, v0, v3, v1, v4}, Ll/ۧۖۛ;->ۙ(ILl/᩵ۖۛ;Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v4, v13

    .line 1019
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v0

    move/from16 v1, v18

    goto :goto_24

    :cond_3b
    move/from16 v0, v47

    if-eqz v0, :cond_3c

    .line 1034
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v47, v0, 0x2

    move/from16 v0, v47

    :goto_25
    add-int/lit8 v18, v1, -0x1

    if-lez v1, :cond_3c

    .line 1038
    invoke-direct {v8, v9, v0}, Ll/ܰۡۛ;->ۙ(Ll/֨ۡۛ;I)I

    move-result v0

    .line 1040
    invoke-virtual {v8, v13, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    .line 1043
    iget v0, v9, Ll/֨ۡۛ;->᩵:I

    iget-object v3, v9, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    const/4 v4, 0x0

    .line 1045
    invoke-virtual {v7, v0, v3, v1, v4}, Ll/ۧۖۛ;->ۙ(ILl/᩵ۖۛ;Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v4, v13

    .line 1044
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v0

    move/from16 v1, v18

    goto :goto_25

    :cond_3c
    :goto_26
    if-eqz v6, :cond_3d

    .line 1060
    iget-object v0, v6, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    const/4 v1, 0x0

    .line 1061
    iput-object v1, v6, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    .line 1062
    invoke-virtual {v7, v6}, Ll/ۧۖۛ;->ۙ(Ll/᩺ۡۛ;)V

    move-object v6, v0

    goto :goto_26

    .line 1067
    :cond_3d
    invoke-virtual {v7}, Ll/ۧۖۛ;->ۙ()V

    :goto_27
    move-object/from16 v7, p1

    move/from16 v1, p2

    move-object v6, v10

    move-object/from16 v24, v11

    move-object/from16 v11, v21

    move-object/from16 v5, v22

    move/from16 v0, v23

    goto/16 :goto_1d

    :cond_3e
    move-object v10, v6

    move-object/from16 v21, v11

    move-object/from16 v11, v24

    move-object v13, v5

    goto :goto_28

    :cond_3f
    move-object v10, v6

    move-object/from16 v21, v11

    move-object/from16 v11, v24

    move-object/from16 v13, p1

    :goto_28
    move/from16 v0, v16

    .line 747
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v6, v0, 0x2

    :goto_29
    add-int/lit8 v16, v1, -0x1

    if-lez v1, :cond_50

    .line 1081
    iget-object v7, v9, Ll/֨ۡۛ;->᩷:[C

    .line 1085
    invoke-virtual {v8, v6}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v1, v6, 0x2

    .line 1086
    invoke-virtual {v8, v7, v1}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v26

    add-int/lit8 v1, v6, 0x4

    .line 1087
    invoke-virtual {v8, v7, v1}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v27

    add-int/lit8 v1, v6, 0x6

    .line 1108
    invoke-virtual {v8, v1}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v6, v6, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    move v2, v6

    move-object/from16 v28, v18

    move-object/from16 v29, v20

    const/16 p1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move v6, v0

    const/4 v0, 0x0

    :goto_2a
    add-int/lit8 v18, v1, -0x1

    if-lez v1, :cond_49

    .line 1112
    invoke-virtual {v8, v7, v2}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    move/from16 p2, v0

    add-int/lit8 v0, v2, 0x2

    .line 1113
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->᩷(I)I

    move-result v20

    add-int/lit8 v2, v2, 0x6

    const-string v0, "ConstantValue"

    .line 1117
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_41

    .line 1118
    invoke-virtual {v8, v2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    if-nez v0, :cond_40

    const/4 v0, 0x0

    goto :goto_2b

    .line 1119
    :cond_40
    invoke-virtual {v8, v7, v0}, Ll/ܰۡۛ;->ۙ([CI)Ljava/lang/Object;

    move-result-object v0

    :goto_2b
    move-object/from16 v29, v0

    move-object/from16 v0, v17

    goto :goto_2d

    .line 1120
    :cond_41
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_42

    .line 1121
    invoke-virtual {v8, v7, v2}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    move-object/from16 v28, v0

    move-object/from16 v0, v17

    move/from16 v17, p1

    goto :goto_2f

    :cond_42
    move-object/from16 v0, v17

    .line 1122
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_43

    or-int v1, v6, v19

    :goto_2c
    move v6, v1

    goto :goto_2d

    .line 1124
    :cond_43
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_44

    or-int/lit16 v1, v6, 0x1000

    goto :goto_2c

    :goto_2d
    move/from16 v1, p2

    :goto_2e
    move/from16 v17, v6

    move-object/from16 v6, v21

    goto :goto_30

    .line 1126
    :cond_44
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_45

    move/from16 v17, p1

    move/from16 v1, p2

    move v3, v2

    :goto_2f
    move-object/from16 v54, v21

    move/from16 v21, v6

    move-object/from16 v6, v54

    goto :goto_31

    .line 1128
    :cond_45
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_46

    move/from16 v1, p2

    move/from16 v17, v2

    goto :goto_2f

    .line 1130
    :cond_46
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_47

    move v1, v2

    goto :goto_2e

    :cond_47
    move/from16 p3, v6

    move-object/from16 v6, v21

    .line 1132
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_48

    move/from16 v1, p2

    move/from16 v17, p3

    move v5, v2

    :goto_30
    move/from16 v21, v17

    move/from16 v17, p1

    :goto_31
    move-object/from16 v23, v0

    move v0, v1

    move/from16 v24, v2

    move-object/from16 v30, v6

    move-object/from16 v31, v11

    move/from16 v11, v17

    move/from16 v6, v21

    move-object/from16 v17, v10

    move-object/from16 v21, v12

    move-object v12, v7

    goto :goto_32

    :cond_48
    move-object/from16 v17, v1

    .line 1135
    iget-object v1, v9, Ll/֨ۡۛ;->ۙ:[Ll/᩺ۡۛ;

    const/16 v21, -0x1

    const/16 v22, 0x0

    move/from16 v51, p2

    move-object/from16 v23, v0

    move-object/from16 v0, p0

    move/from16 v24, v2

    move-object/from16 v2, v17

    move/from16 v52, v3

    move/from16 v3, v24

    move-object/from16 v53, v4

    move/from16 v4, v20

    move-object/from16 v17, v10

    move v10, v5

    move-object v5, v7

    move/from16 v25, p3

    move-object/from16 v30, v6

    move-object/from16 v31, v11

    move/from16 v11, p1

    move/from16 v6, v21

    move-object/from16 v21, v12

    move-object v12, v7

    move-object/from16 v7, v22

    .line 1136
    invoke-direct/range {v0 .. v7}, Ll/ܰۡۛ;->ۙ([Ll/᩺ۡۛ;Ljava/lang/String;II[CI[Ll/ۤۖۛ;)Ll/᩺ۡۛ;

    move-result-object v0

    move-object/from16 v6, v53

    .line 1144
    iput-object v6, v0, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    move-object v4, v0

    move v5, v10

    move/from16 v6, v25

    move/from16 v0, v51

    move/from16 v3, v52

    :goto_32
    add-int v2, v24, v20

    move/from16 p1, v11

    move-object v7, v12

    move-object/from16 v10, v17

    move/from16 v1, v18

    move-object/from16 v12, v21

    move-object/from16 v17, v23

    move-object/from16 v21, v30

    move-object/from16 v11, v31

    goto/16 :goto_2a

    :cond_49
    move/from16 v51, v0

    move/from16 v52, v3

    move/from16 v25, v6

    move-object/from16 v31, v11

    move-object/from16 v23, v17

    move-object/from16 v30, v21

    move/from16 v11, p1

    move-object v6, v4

    move-object/from16 v17, v10

    move-object/from16 v21, v12

    move v10, v5

    move-object v12, v7

    move-object/from16 v24, v13

    .line 1152
    invoke-virtual/range {v24 .. v29}, Ll/ܿۡۛ;->ۙ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ll/۠ۡۛ;

    move-result-object v7

    if-nez v7, :cond_4a

    move/from16 v20, v2

    goto/16 :goto_38

    :cond_4a
    move/from16 v3, v52

    if-eqz v3, :cond_4b

    .line 1159
    invoke-virtual {v8, v3}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v3, v3, 0x2

    :goto_33
    add-int/lit8 v18, v0, -0x1

    if-lez v0, :cond_4b

    .line 1163
    invoke-virtual {v8, v12, v3}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v3, v3, 0x2

    const/4 v1, 0x1

    .line 1168
    invoke-virtual {v7, v0, v1}, Ll/۠ۡۛ;->ۙ(Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v20, v2

    move v2, v3

    move v3, v4

    move-object v4, v12

    .line 1167
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v3

    move/from16 v0, v18

    move/from16 v2, v20

    goto :goto_33

    :cond_4b
    move/from16 v20, v2

    move/from16 v0, v51

    if-eqz v0, :cond_4c

    .line 1178
    invoke-virtual {v8, v0}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x2

    :goto_34
    add-int/lit8 v18, v1, -0x1

    if-lez v1, :cond_4c

    .line 1182
    invoke-virtual {v8, v12, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    const/4 v0, 0x0

    .line 1187
    invoke-virtual {v7, v1, v0}, Ll/۠ۡۛ;->ۙ(Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v4, v12

    .line 1186
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v0

    move/from16 v1, v18

    goto :goto_34

    :cond_4c
    if-eqz v11, :cond_4d

    .line 1197
    invoke-virtual {v8, v11}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v1, v11, 0x2

    :goto_35
    add-int/lit8 v11, v0, -0x1

    if-lez v0, :cond_4d

    .line 1201
    invoke-direct {v8, v9, v1}, Ll/ܰۡۛ;->ۙ(Ll/֨ۡۛ;I)I

    move-result v0

    .line 1203
    invoke-virtual {v8, v12, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    .line 1206
    iget v0, v9, Ll/֨ۡۛ;->᩵:I

    iget-object v3, v9, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    const/4 v4, 0x1

    .line 1208
    invoke-virtual {v7, v0, v3, v1, v4}, Ll/۠ۡۛ;->ۙ(ILl/᩵ۖۛ;Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v4, v12

    .line 1207
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v1

    move v0, v11

    goto :goto_35

    :cond_4d
    if-eqz v10, :cond_4e

    .line 1222
    invoke-virtual {v8, v10}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v5, v10, 0x2

    :goto_36
    add-int/lit8 v10, v0, -0x1

    if-lez v0, :cond_4e

    .line 1226
    invoke-direct {v8, v9, v5}, Ll/ܰۡۛ;->ۙ(Ll/֨ۡۛ;I)I

    move-result v0

    .line 1228
    invoke-virtual {v8, v12, v0}, Ll/ܰۡۛ;->᩷([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    .line 1231
    iget v0, v9, Ll/֨ۡۛ;->᩵:I

    iget-object v3, v9, Ll/֨ۡۛ;->ۨ:Ll/᩵ۖۛ;

    const/4 v4, 0x0

    .line 1233
    invoke-virtual {v7, v0, v3, v1, v4}, Ll/۠ۡۛ;->ۙ(ILl/᩵ۖۛ;Ljava/lang/String;Z)Ll/ۗۡۛ;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v4, v12

    .line 1232
    invoke-direct/range {v0 .. v5}, Ll/ܰۡۛ;->ۙ(Ll/ۗۡۛ;IZ[CI)I

    move-result v5

    move v0, v10

    goto :goto_36

    :cond_4e
    move-object v4, v6

    :goto_37
    if-eqz v4, :cond_4f

    .line 1248
    iget-object v0, v4, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    const/4 v1, 0x0

    .line 1249
    iput-object v1, v4, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    .line 1250
    invoke-virtual {v7, v4}, Ll/۠ۡۛ;->ۙ(Ll/᩺ۡۛ;)V

    move-object v4, v0

    goto :goto_37

    .line 1255
    :cond_4f
    invoke-virtual {v7}, Ll/۠ۡۛ;->ۙ()V

    :goto_38
    move/from16 v1, v16

    move-object/from16 v10, v17

    move/from16 v6, v20

    move-object/from16 v12, v21

    move-object/from16 v17, v23

    move-object/from16 v21, v30

    move-object/from16 v11, v31

    goto/16 :goto_29

    .line 752
    :cond_50
    invoke-virtual {v8, v6}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    add-int/lit8 v6, v6, 0x2

    :goto_39
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_51

    .line 755
    invoke-direct {v8, v13, v9, v6}, Ll/ܰۡۛ;->ۙ(Ll/ܿۡۛ;Ll/֨ۡۛ;I)I

    move-result v6

    move v0, v1

    goto :goto_39

    .line 759
    :cond_51
    invoke-virtual {v13}, Ll/ܿۡۛ;->ۙ()V

    return-void
.end method

.method public final ۤ(I)J
    .locals 6

    .line 3708
    invoke-virtual {p0, p1}, Ll/ܰۡۛ;->᩷(I)I

    move-result v0

    int-to-long v0, v0

    add-int/lit8 p1, p1, 0x4

    .line 3709
    invoke-virtual {p0, p1}, Ll/ܰۡۛ;->᩷(I)I

    move-result p1

    int-to-long v2, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final ۤ([CI)Ljava/lang/String;
    .locals 3

    .line 3743
    iget-object v0, p0, Ll/ܰۡۛ;->᩸:[Ljava/lang/String;

    aget-object v1, v0, p2

    if-eqz v1, :cond_0

    return-object v1

    .line 3747
    :cond_0
    iget-object v1, p0, Ll/ܰۡۛ;->ᩴ:[I

    aget v1, v1, p2

    add-int/lit8 v2, v1, 0x2

    .line 3749
    invoke-virtual {p0, v1}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v1

    invoke-direct {p0, p1, v2, v1}, Ll/ܰۡۛ;->᩷([CII)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, p2

    return-object p1
.end method

.method public final ᩴ(I)I
    .locals 2

    .line 3670
    iget-object v0, p0, Ll/ܰۡۛ;->᩷:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 p1, p1, 0x1

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v1

    return p1
.end method

.method public final ᩷(I)I
    .locals 3

    .line 3694
    iget-object v0, p0, Ll/ܰۡۛ;->᩷:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    add-int/lit8 v2, p1, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    add-int/lit8 v2, p1, 0x2

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 p1, p1, 0x3

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v1

    return p1
.end method

.method public final ᩷([CI)Ljava/lang/String;
    .locals 1

    .line 3726
    invoke-virtual {p0, p2}, Ll/ܰۡۛ;->ᩴ(I)I

    move-result v0

    if-eqz p2, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 3730
    :cond_0
    invoke-virtual {p0, p1, v0}, Ll/ܰۡۛ;->ۤ([CI)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ᩸(I)S
    .locals 2

    .line 3682
    iget-object v0, p0, Ll/ܰۡۛ;->᩷:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 p1, p1, 0x1

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v1

    int-to-short p1, p1

    return p1
.end method

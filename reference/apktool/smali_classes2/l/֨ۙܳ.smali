.class public final Ll/֨ۙܳ;
.super Ljava/lang/Object;
.source "FIQP"


# instance fields
.field public final ۙ:[I

.field public ۤ:[I

.field public ܳ:[I

.field public ᩴ:[[I

.field public ᩷:[I

.field public ᩸:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 415
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v0, v0, [I

    .line 416
    iput-object v0, p0, Ll/֨ۙܳ;->ۙ:[I

    return-void
.end method

.method public static ۙ(I[B)I
    .locals 1

    add-int/lit8 v0, p0, -0x1

    .line 472
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    ushr-int/lit8 p1, p0, 0x6

    xor-int/2addr p0, p1

    and-int/lit16 p0, p0, 0x3ff

    return p0
.end method

.method public static bridge synthetic ۙ(Ll/֨ۙܳ;[I)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֨ۙܳ;->᩷:[I

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/֨ۙܳ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۙܳ;->᩷:[I

    return-object p0
.end method

.method public static bridge synthetic ۤ(Ll/֨ۙܳ;)[[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۙܳ;->ᩴ:[[I

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/֨ۙܳ;[I)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֨ۙܳ;->ۤ:[I

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/֨ۙܳ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۙܳ;->ۤ:[I

    return-object p0
.end method

.method public static bridge synthetic ᩸(Ll/֨ۙܳ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۙܳ;->ܳ:[I

    return-object p0
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 477
    iget-object v0, p0, Ll/֨ۙܳ;->ܳ:[I

    if-nez v0, :cond_0

    const/16 v0, 0x203

    new-array v0, v0, [I

    .line 478
    iput-object v0, p0, Ll/֨ۙܳ;->ܳ:[I

    const/16 v0, 0x100

    new-array v0, v0, [[I

    .line 479
    iput-object v0, p0, Ll/֨ۙܳ;->ᩴ:[[I

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 480
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    return-void
.end method

.method public final ۙ([BII[BIIZ)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    add-int/lit16 v1, p3, -0x100

    .line 422
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, p6

    :goto_0
    if-eqz p7, :cond_1

    add-int/lit16 p7, p3, 0x100

    .line 423
    invoke-static {p6, p7}, Ljava/lang/Math;->min(II)I

    move-result p6

    :cond_1
    if-le v1, p6, :cond_2

    goto :goto_7

    .line 425
    :cond_2
    iget-object p7, p0, Ll/֨ۙܳ;->ۙ:[I

    invoke-static {p7, v0}, Ljava/util/Arrays;->fill([II)V

    const/4 v2, 0x0

    :goto_1
    const/4 v3, 0x1

    if-ge v2, p3, :cond_3

    add-int v4, p2, v2

    .line 426
    aget-byte v4, p1, v4

    and-int/lit16 v4, v4, 0xff

    aget v5, p7, v4

    add-int/2addr v5, v3

    aput v5, p7, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_2
    if-ge p1, v1, :cond_4

    add-int p2, p5, p1

    .line 427
    aget-byte p2, p4, p2

    and-int/lit16 p2, p2, 0xff

    aget p3, p7, p2

    sub-int/2addr p3, v3

    aput p3, p7, p2

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    .line 429
    :cond_4
    array-length p1, p7

    const/4 p2, 0x0

    const/4 p3, 0x0

    :goto_3
    if-ge p2, p1, :cond_5

    aget v2, p7, p2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    add-int/2addr p3, v2

    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_5
    const/16 p1, 0x100

    if-gt p3, p1, :cond_6

    goto :goto_6

    :cond_6
    :goto_4
    if-ge v1, p6, :cond_9

    add-int p2, p5, v1

    .line 433
    aget-byte p2, p4, p2

    and-int/lit16 p2, p2, 0xff

    .line 434
    aget v2, p7, p2

    add-int/lit8 v4, v2, -0x1

    aput v4, p7, p2

    if-lez v2, :cond_7

    const/4 p2, -0x1

    goto :goto_5

    :cond_7
    const/4 p2, 0x1

    :goto_5
    add-int/2addr p3, p2

    if-gt p3, p1, :cond_8

    :goto_6
    return v3

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_9
    :goto_7
    return v0
.end method

.method public final ۙ([BII[BIIZLjava/util/function/BooleanSupplier;)Z
    .locals 6

    .line 443
    invoke-static {p8}, Ll/۬ۙܳ;->ۙ(Ljava/util/function/BooleanSupplier;)V

    add-int v0, p3, p6

    const/16 v1, 0x302

    const/4 v2, 0x1

    if-gt v0, v1, :cond_0

    goto/16 :goto_7

    :cond_0
    const/4 v0, 0x0

    if-eqz p7, :cond_1

    add-int/lit16 v1, p3, -0x100

    .line 446
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_0

    :cond_1
    move v1, p6

    :goto_0
    if-eqz p7, :cond_2

    add-int/lit16 p7, p3, 0x100

    .line 447
    invoke-static {p6, p7}, Ljava/lang/Math;->min(II)I

    move-result p6

    :cond_2
    if-le v1, p6, :cond_3

    goto/16 :goto_8

    .line 449
    :cond_3
    iget-object p7, p0, Ll/֨ۙܳ;->᩸:[I

    if-nez p7, :cond_4

    const/16 p7, 0x400

    new-array p7, p7, [I

    iput-object p7, p0, Ll/֨ۙܳ;->᩸:[I

    goto :goto_1

    .line 450
    :cond_4
    invoke-static {p7, v0}, Ljava/util/Arrays;->fill([II)V

    :goto_1
    const/4 p7, 0x1

    :goto_2
    if-ge p7, p3, :cond_6

    and-int/lit16 v3, p7, 0x3ff

    if-nez v3, :cond_5

    .line 452
    invoke-static {p8}, Ll/۬ۙܳ;->ۙ(Ljava/util/function/BooleanSupplier;)V

    .line 453
    :cond_5
    iget-object v3, p0, Ll/֨ۙܳ;->᩸:[I

    add-int v4, p2, p7

    invoke-static {v4, p1}, Ll/֨ۙܳ;->ۙ(I[B)I

    move-result v4

    aget v5, v3, v4

    add-int/2addr v5, v2

    aput v5, v3, v4

    add-int/lit8 p7, p7, 0x1

    goto :goto_2

    :cond_6
    const/4 p1, 0x1

    :goto_3
    if-ge p1, v1, :cond_8

    and-int/lit16 p2, p1, 0x3ff

    if-nez p2, :cond_7

    .line 456
    invoke-static {p8}, Ll/۬ۙܳ;->ۙ(Ljava/util/function/BooleanSupplier;)V

    .line 457
    :cond_7
    iget-object p2, p0, Ll/֨ۙܳ;->᩸:[I

    add-int p3, p5, p1

    invoke-static {p3, p4}, Ll/֨ۙܳ;->ۙ(I[B)I

    move-result p3

    aget p7, p2, p3

    sub-int/2addr p7, v2

    aput p7, p2, p3

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    .line 460
    :cond_8
    iget-object p1, p0, Ll/֨ۙܳ;->᩸:[I

    array-length p2, p1

    const/4 p3, 0x0

    const/4 p7, 0x0

    :goto_4
    if-ge p3, p2, :cond_9

    aget v3, p1, p3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    add-int/2addr p7, v3

    add-int/lit8 p3, p3, 0x1

    goto :goto_4

    :cond_9
    const/16 p1, 0x300

    if-gt p7, p1, :cond_a

    goto :goto_7

    :cond_a
    :goto_5
    if-ge v1, p6, :cond_f

    and-int/lit16 p2, v1, 0x3ff

    if-nez p2, :cond_b

    .line 464
    invoke-static {p8}, Ll/۬ۙܳ;->ۙ(Ljava/util/function/BooleanSupplier;)V

    :cond_b
    if-lez v1, :cond_d

    .line 465
    iget-object p2, p0, Ll/֨ۙܳ;->᩸:[I

    add-int p3, p5, v1

    invoke-static {p3, p4}, Ll/֨ۙܳ;->ۙ(I[B)I

    move-result p3

    aget v3, p2, p3

    add-int/lit8 v4, v3, -0x1

    aput v4, p2, p3

    if-lez v3, :cond_c

    const/4 p2, -0x1

    goto :goto_6

    :cond_c
    const/4 p2, 0x1

    :goto_6
    add-int/2addr p7, p2

    :cond_d
    if-gt p7, p1, :cond_e

    :goto_7
    return v2

    :cond_e
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_f
    :goto_8
    return v0
.end method

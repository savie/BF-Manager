.class public final Ll/᩸ۤܳ;
.super Ljava/lang/Object;
.source "95HF"

# interfaces
.implements Landroid/text/TextWatcher;


# static fields
.field public static final ֨:Ljava/math/BigInteger;

.field public static final ۖ:Ljava/math/BigInteger;

.field public static final ۡ:Ljava/math/BigInteger;


# instance fields
.field public ֡:Z

.field public final ۟:Z

.field public final ۢ:Landroid/widget/TextView;

.field public final ܰ:Ll/᩹ۖ᩸;

.field public ܿ:Z

.field public final ᩳ:I

.field public ᩶:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-wide v0, 0x7fffffffffffffffL

    .line 519
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Ll/᩸ۤܳ;->֨:Ljava/math/BigInteger;

    const-wide/high16 v0, -0x8000000000000000L

    .line 520
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Ll/᩸ۤܳ;->ۖ:Ljava/math/BigInteger;

    .line 521
    new-instance v0, Ljava/math/BigInteger;

    const-string v1, "FFFFFFFFFFFFFFFF"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸ۤܳ;->ۡ:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>(Ll/᩹ۖ᩸;Landroid/widget/TextView;IZ)V
    .locals 1

    .line 348
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 346
    iput-boolean v0, p0, Ll/᩸ۤܳ;->ܿ:Z

    .line 349
    iput-object p1, p0, Ll/᩸ۤܳ;->ܰ:Ll/᩹ۖ᩸;

    .line 350
    iput-object p2, p0, Ll/᩸ۤܳ;->ۢ:Landroid/widget/TextView;

    .line 351
    iput p3, p0, Ll/᩸ۤܳ;->ᩳ:I

    .line 352
    iput-boolean p4, p0, Ll/᩸ۤܳ;->۟:Z

    .line 354
    invoke-virtual {p0}, Ll/᩸ۤܳ;->᩷()V

    .line 355
    invoke-virtual {p1, p0}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 585
    invoke-virtual {p0}, Ll/᩸ۤܳ;->᩷()V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final ۙ()V
    .locals 7

    .line 403
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩸ۤܳ;->᩶:[B

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x3

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 404
    iget-object v1, p0, Ll/᩸ۤܳ;->᩶:[B

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-byte v5, v1, v4

    and-int/lit16 v5, v5, 0xff

    .line 405
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v5, v6, v3

    const-string v5, "%02X "

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 407
    :cond_0
    iget-object v1, p0, Ll/᩸ۤܳ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۙ(IJ)V
    .locals 7

    .line 444
    new-array v0, p1, [B

    iput-object v0, p0, Ll/᩸ۤܳ;->᩶:[B

    .line 445
    iget-boolean v0, p0, Ll/᩸ۤܳ;->۟:Z

    const/16 v1, 0x8

    const-wide/16 v2, 0xff

    if-eqz v0, :cond_0

    :goto_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_1

    .line 447
    iget-object v0, p0, Ll/᩸ۤܳ;->᩶:[B

    and-long v4, p2, v2

    long-to-int v5, v4

    int-to-byte v4, v5

    aput-byte v4, v0, p1

    ushr-long/2addr p2, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_1

    .line 452
    iget-object v4, p0, Ll/᩸ۤܳ;->᩶:[B

    and-long v5, p2, v2

    long-to-int v6, v5

    int-to-byte v5, v6

    aput-byte v5, v4, v0

    ushr-long/2addr p2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 456
    :cond_1
    invoke-virtual {p0}, Ll/᩸ۤܳ;->ۙ()V

    return-void
.end method

.method public final ᩷()V
    .locals 12

    .line 367
    iget-object v0, p0, Ll/᩸ۤܳ;->ܰ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 368
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    iget-object v3, p0, Ll/᩸ۤܳ;->ۢ:Landroid/widget/TextView;

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .line 369
    iput-object v0, p0, Ll/᩸ۤܳ;->᩶:[B

    .line 370
    iput-boolean v2, p0, Ll/᩸ۤܳ;->֡:Z

    .line 371
    iput-boolean v4, p0, Ll/᩸ۤܳ;->ܿ:Z

    const v0, 0x7f120308

    .line 372
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    return-void

    .line 375
    :cond_0
    iput-boolean v2, p0, Ll/᩸ۤܳ;->ܿ:Z

    .line 376
    iput-boolean v2, p0, Ll/᩸ۤܳ;->֡:Z

    const v1, 0x7f0a0576

    const-wide/16 v5, 0xff

    const v7, 0x7f120311

    const v8, 0x7f120d11

    .line 377
    iget v9, p0, Ll/᩸ۤܳ;->ᩳ:I

    if-ne v9, v1, :cond_3

    .line 413
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v9, -0x80

    cmp-long v11, v0, v9

    if-ltz v11, :cond_2

    const-wide/16 v9, 0x7f

    cmp-long v11, v0, v9

    if-lez v11, :cond_1

    goto :goto_0

    :cond_1
    and-long/2addr v0, v5

    long-to-int v1, v0

    int-to-byte v0, v1

    new-array v1, v4, [B

    aput-byte v0, v1, v2

    .line 419
    iput-object v1, p0, Ll/᩸ۤܳ;->᩶:[B

    .line 420
    invoke-virtual {p0}, Ll/᩸ۤܳ;->ۙ()V

    goto/16 :goto_8

    .line 415
    :cond_2
    :goto_0
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 416
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    .line 422
    :catch_0
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 423
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_3
    const v1, 0x7f0a06b0

    const-wide/16 v10, 0x0

    if-ne v9, v1, :cond_6

    .line 429
    :try_start_1
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v9, v0, v10

    if-ltz v9, :cond_5

    cmp-long v9, v0, v5

    if-lez v9, :cond_4

    goto :goto_1

    :cond_4
    and-long/2addr v0, v5

    long-to-int v1, v0

    int-to-byte v0, v1

    new-array v1, v4, [B

    aput-byte v0, v1, v2

    .line 435
    iput-object v1, p0, Ll/᩸ۤܳ;->᩶:[B

    .line 436
    invoke-virtual {p0}, Ll/᩸ۤܳ;->ۙ()V

    goto/16 :goto_8

    .line 431
    :cond_5
    :goto_1
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 432
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_8

    .line 438
    :catch_1
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 439
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_6
    const v1, 0x7f0a0579

    const/4 v2, 0x2

    if-ne v9, v1, :cond_9

    .line 461
    :try_start_2
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v5, -0x8000

    cmp-long v9, v0, v5

    if-ltz v9, :cond_8

    const-wide/16 v5, 0x7fff

    cmp-long v9, v0, v5

    if-lez v9, :cond_7

    goto :goto_2

    .line 467
    :cond_7
    invoke-virtual {p0, v2, v0, v1}, Ll/᩸ۤܳ;->ۙ(IJ)V

    goto/16 :goto_8

    .line 463
    :cond_8
    :goto_2
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 464
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_8

    .line 469
    :catch_2
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 470
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_9
    const v1, 0x7f0a06b3

    if-ne v9, v1, :cond_c

    .line 476
    :try_start_3
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v5, v0, v10

    if-ltz v5, :cond_b

    const-wide/32 v5, 0xffff

    cmp-long v9, v0, v5

    if-lez v9, :cond_a

    goto :goto_3

    .line 482
    :cond_a
    invoke-virtual {p0, v2, v0, v1}, Ll/᩸ۤܳ;->ۙ(IJ)V

    goto/16 :goto_8

    .line 478
    :cond_b
    :goto_3
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 479
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_8

    .line 484
    :catch_3
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 485
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_c
    const v1, 0x7f0a0577

    const/4 v2, 0x4

    if-ne v9, v1, :cond_f

    .line 491
    :try_start_4
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/32 v5, -0x80000000

    cmp-long v9, v0, v5

    if-ltz v9, :cond_e

    const-wide/32 v5, 0x7fffffff

    cmp-long v9, v0, v5

    if-lez v9, :cond_d

    goto :goto_4

    .line 497
    :cond_d
    invoke-virtual {p0, v2, v0, v1}, Ll/᩸ۤܳ;->ۙ(IJ)V

    goto/16 :goto_8

    .line 493
    :cond_e
    :goto_4
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 494
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    goto/16 :goto_8

    .line 499
    :catch_4
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 500
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_f
    const v1, 0x7f0a06b1

    if-ne v9, v1, :cond_12

    .line 506
    :try_start_5
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v5, v0, v10

    if-ltz v5, :cond_11

    const-wide v5, 0xffffffffL

    cmp-long v9, v0, v5

    if-lez v9, :cond_10

    goto :goto_5

    .line 512
    :cond_10
    invoke-virtual {p0, v2, v0, v1}, Ll/᩸ۤܳ;->ۙ(IJ)V

    goto/16 :goto_8

    .line 508
    :cond_11
    :goto_5
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 509
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5

    goto/16 :goto_8

    .line 514
    :catch_5
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 515
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_12
    const v1, 0x7f0a0578

    const/16 v5, 0x8

    if-ne v9, v1, :cond_15

    .line 525
    :try_start_6
    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 526
    sget-object v0, Ll/᩸ۤܳ;->ۖ:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-ltz v0, :cond_14

    sget-object v0, Ll/᩸ۤܳ;->֨:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-lez v0, :cond_13

    goto :goto_6

    .line 531
    :cond_13
    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v5, v0, v1}, Ll/᩸ۤܳ;->ۙ(IJ)V

    goto/16 :goto_8

    .line 527
    :cond_14
    :goto_6
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 528
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_8

    .line 533
    :catch_6
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 534
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto :goto_8

    :cond_15
    const v1, 0x7f0a06b2

    if-ne v9, v1, :cond_18

    .line 540
    :try_start_7
    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 541
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-ltz v0, :cond_17

    sget-object v0, Ll/᩸ۤܳ;->ۡ:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-lez v0, :cond_16

    goto :goto_7

    .line 546
    :cond_16
    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v5, v0, v1}, Ll/᩸ۤܳ;->ۙ(IJ)V

    goto :goto_8

    .line 542
    :cond_17
    :goto_7
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 543
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_8

    .line 548
    :catch_7
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 549
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto :goto_8

    :cond_18
    const v1, 0x7f0a026d

    if-ne v9, v1, :cond_19

    .line 555
    :try_start_8
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    .line 556
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0, v2, v0, v1}, Ll/᩸ۤܳ;->ۙ(IJ)V
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_8

    .line 558
    :catch_8
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 559
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto :goto_8

    :cond_19
    const v1, 0x7f0a026c

    if-ne v9, v1, :cond_1a

    .line 565
    :try_start_9
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    .line 566
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-virtual {p0, v5, v0, v1}, Ll/᩸ۤܳ;->ۙ(IJ)V
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_8

    .line 568
    :catch_9
    iput-boolean v4, p0, Ll/᩸ۤܳ;->֡:Z

    .line 569
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    :goto_8
    return-void

    .line 398
    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

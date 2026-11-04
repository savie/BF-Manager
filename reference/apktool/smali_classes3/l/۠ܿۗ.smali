.class public final Ll/۠ܿۗ;
.super Ljava/lang/Object;
.source "N6CC"


# static fields
.field public static final ܳ:[Ll/֫֨ۗ;

.field public static final ᩴ:Ll/᩻ܽ᩺;

.field public static final ᩸:[Ll/֫֨ۗ;


# instance fields
.field public ۙ:I

.field public final ۤ:Ll/֫ۖۗ;

.field public ᩷:[Ll/ۜܿۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 41
    const-class v0, Ll/۠ܿۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/۠ܿۗ;->ᩴ:Ll/᩻ܽ᩺;

    const/4 v0, 0x0

    new-array v1, v0, [Ll/֫֨ۗ;

    .line 50
    sput-object v1, Ll/۠ܿۗ;->᩸:[Ll/֫֨ۗ;

    const/4 v1, 0x1

    new-array v1, v1, [Ll/֫֨ۗ;

    .line 51
    sget-object v2, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    aput-object v2, v1, v0

    sput-object v1, Ll/۠ܿۗ;->ܳ:[Ll/֫֨ۗ;

    return-void
.end method

.method public constructor <init>(Ll/֫ۖۗ;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/۠ܿۗ;->ۤ:Ll/֫ۖۗ;

    return-void
.end method

.method private ۙ(Ljava/io/DataInputStream;Ll/֨ᩳۗ;)Ljava/util/ArrayList;
    .locals 16

    .line 342
    invoke-virtual/range {p1 .. p1}, Ljava/io/DataInputStream;->readShort()S

    move-result v0

    .line 343
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 351
    invoke-static/range {p1 .. p1}, Ll/۠ܿۗ;->ۤ(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v3

    .line 352
    invoke-direct/range {p0 .. p1}, Ll/۠ܿۗ;->᩷(Ljava/io/DataInputStream;)Ljava/util/List;

    move-result-object v4

    .line 353
    invoke-direct/range {p0 .. p1}, Ll/۠ܿۗ;->ۙ(Ljava/io/DataInputStream;)Ll/֫֨ۗ;

    move-result-object v5

    .line 354
    invoke-direct/range {p0 .. p1}, Ll/۠ܿۗ;->᩷(Ljava/io/DataInputStream;)Ljava/util/List;

    move-result-object v6

    .line 355
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {v6, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    move-object v10, v6

    goto :goto_2

    :cond_1
    :goto_1
    move-object v10, v4

    .line 358
    :goto_2
    invoke-direct/range {p0 .. p1}, Ll/۠ܿۗ;->ۙ(Ljava/io/DataInputStream;)Ll/֫֨ۗ;

    move-result-object v6

    .line 359
    invoke-static {v6, v5}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v11, v5

    goto :goto_3

    :cond_2
    move-object v11, v6

    .line 362
    :goto_3
    invoke-direct/range {p0 .. p1}, Ll/۠ܿۗ;->᩷(Ljava/io/DataInputStream;)Ljava/util/List;

    move-result-object v12

    .line 363
    invoke-virtual/range {p1 .. p1}, Ljava/io/DataInputStream;->readInt()I

    move-result v14

    .line 364
    invoke-direct/range {p0 .. p1}, Ll/۠ܿۗ;->᩷(Ljava/io/DataInputStream;)Ljava/util/List;

    move-result-object v13

    move-object/from16 v6, p0

    .line 365
    iget-object v7, v6, Ll/۠ܿۗ;->ۤ:Ll/֫ۖۗ;

    move-object/from16 v15, p2

    invoke-static {v7, v15, v3, v4, v5}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)Ll/᩷ۢۗ;

    move-result-object v9

    .line 366
    new-instance v3, Ll/ۤ֡ۗ;

    move-object v8, v3

    invoke-direct/range {v8 .. v14}, Ll/ۤ֡ۗ;-><init>(Ll/᩷ۢۗ;Ljava/util/List;Ll/֫֨ۗ;Ljava/util/List;Ljava/util/List;I)V

    .line 345
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    move-object/from16 v6, p0

    return-object v1
.end method

.method private ۙ(Ljava/io/DataInputStream;)Ll/֫֨ۗ;
    .locals 2

    .line 403
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 407
    :cond_0
    invoke-static {}, Ll/ۖܿۗ;->values()[Ll/ۖܿۗ;

    move-result-object v1

    aget-object v1, v1, v0

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 441
    new-instance p1, Ll/۠ۧ᩵;

    const-string v1, "Unsupported Arg Type: "

    .line 0
    invoke-static {v0, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 441
    throw p1

    .line 437
    :pswitch_0
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    move-result p1

    int-to-char p1, p1

    .line 438
    invoke-static {p1}, Ll/֫֨ۗ;->ۙ(C)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 434
    :pswitch_1
    invoke-direct {p0, p1}, Ll/۠ܿۗ;->ۙ(Ljava/io/DataInputStream;)Ll/֫֨ۗ;

    move-result-object p1

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 431
    :pswitch_2
    iget-object v0, p0, Ll/۠ܿۗ;->᩷:[Ll/ۜܿۗ;

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    move-result p1

    aget-object p1, v0, p1

    invoke-virtual {p1}, Ll/ۜܿۗ;->ۙ()Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 417
    :pswitch_3
    invoke-direct {p0, p1}, Ll/۠ܿۗ;->ۙ(Ljava/io/DataInputStream;)Ll/֫֨ۗ;

    move-result-object v0

    .line 418
    invoke-direct {p0, p1}, Ll/۠ܿۗ;->ۙ(Ljava/io/DataInputStream;)Ll/֫֨ۗ;

    move-result-object p1

    .line 419
    invoke-static {v0, p1}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 426
    :pswitch_4
    invoke-static {p1}, Ll/۠ܿۗ;->ۤ(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v0

    .line 427
    invoke-direct {p0, p1}, Ll/۠ܿۗ;->᩷(Ljava/io/DataInputStream;)Ljava/util/List;

    move-result-object p1

    .line 428
    invoke-static {v0, p1}, Ll/֫֨ۗ;->᩷(Ljava/lang/String;Ljava/util/List;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 422
    :pswitch_5
    iget-object v0, p0, Ll/۠ܿۗ;->᩷:[Ll/ۜܿۗ;

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ll/ۜܿۗ;->ۙ()Ll/֫֨ۗ;

    move-result-object v0

    .line 423
    invoke-direct {p0, p1}, Ll/۠ܿۗ;->᩷(Ljava/io/DataInputStream;)Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;Ljava/util/List;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 409
    :pswitch_6
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    invoke-static {v0}, Ll/۫֨ۗ;->ۙ(I)Ll/۫֨ۗ;

    move-result-object v0

    .line 410
    sget-object v1, Ll/۫֨ۗ;->ᩳ:Ll/۫֨ۗ;

    if-ne v0, v1, :cond_1

    .line 411
    sget-object p1, Ll/֫֨ۗ;->ۙۙ:Ll/֫֨ۗ;

    return-object p1

    .line 413
    :cond_1
    invoke-direct {p0, p1}, Ll/۠ܿۗ;->ۙ(Ljava/io/DataInputStream;)Ll/֫֨ۗ;

    move-result-object p1

    .line 414
    invoke-static {p1, v0}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;Ll/۫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۙ(Ll/᩻ۡۗ;)[Ll/֫֨ۗ;
    .locals 3

    .line 147
    invoke-virtual {p0}, Ll/᩻ۡۗ;->۟ۙ()Ll/֫֨ۗ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 150
    sget-object p0, Ll/۠ܿۗ;->᩸:[Ll/֫֨ۗ;

    return-object p0

    .line 152
    :cond_0
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܳۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 153
    sget-object v2, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    if-ne v0, v2, :cond_1

    .line 154
    sget-object p0, Ll/۠ܿۗ;->ܳ:[Ll/֫֨ۗ;

    return-object p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 156
    new-array v1, v1, [Ll/֫֨ۗ;

    const/4 v2, 0x0

    .line 157
    aput-object v0, v1, v2

    .line 159
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܳۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x1

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫֨ۗ;

    .line 160
    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static ۤ(Ljava/io/DataInputStream;)Ljava/lang/String;
    .locals 5

    .line 482
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 461
    new-array v1, v0, [B

    .line 462
    invoke-virtual {p0, v1}, Ljava/io/DataInputStream;->read([B)I

    move-result v2

    :goto_0
    if-eq v2, v0, :cond_1

    sub-int v3, v0, v2

    .line 464
    invoke-virtual {p0, v1, v2, v3}, Ljava/io/DataInputStream;->read([BII)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    add-int/2addr v2, v3

    goto :goto_0

    .line 466
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "String read error"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 471
    :cond_1
    new-instance p0, Ljava/lang/String;

    const-string v0, "US-ASCII"

    invoke-direct {p0, v1, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object p0
.end method

.method private ᩷(Ljava/io/DataInputStream;)Ljava/util/List;
    .locals 4

    .line 372
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    if-nez v0, :cond_0

    .line 374
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 376
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 378
    invoke-direct {p0, p1}, Ll/۠ܿۗ;->ۙ(Ljava/io/DataInputStream;)Ll/֫֨ۗ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final ۙ()I
    .locals 1

    .line 486
    iget-object v0, p0, Ll/۠ܿۗ;->᩷:[Ll/ۜܿۗ;

    array-length v0, v0

    return v0
.end method

.method public final ۙ(Ljava/util/HashMap;)V
    .locals 5

    .line 490
    iget-object v0, p0, Ll/۠ܿۗ;->᩷:[Ll/ۜܿۗ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 491
    invoke-virtual {v3}, Ll/ۜܿۗ;->ۤ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩷()V
    .locals 12

    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 75
    invoke-static {}, Ll/ۛ᩹ܳ;->᩷()Ll/ۛ᩹ܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۛ᩹ܳ;->ۙ()Ljava/io/ByteArrayInputStream;

    move-result-object v2

    const-string v3, ", expect: 5"

    const-string v4, "Wrong jadx class set version, got: "

    .line 302
    new-instance v5, Ljava/io/DataInputStream;

    new-instance v6, Ljava/io/BufferedInputStream;

    invoke-direct {v6, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v5, v6}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    const/16 v2, 0x8

    :try_start_0
    new-array v6, v2, [B

    .line 304
    invoke-virtual {v5, v6}, Ljava/io/DataInputStream;->read([B)I

    move-result v7

    if-ne v7, v2, :cond_9

    const-string v2, "jadx-cst"

    .line 305
    new-instance v7, Ljava/lang/String;

    const-string v8, "US-ASCII"

    invoke-direct {v7, v6, v8}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 306
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 309
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readByte()B

    move-result v2

    const/4 v6, 0x5

    if-ne v2, v6, :cond_8

    .line 313
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    iput v2, p0, Ll/۠ܿۗ;->ۙ:I

    .line 314
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    .line 315
    new-array v3, v2, [Ll/ۜܿۗ;

    iput-object v3, p0, Ll/۠ܿۗ;->᩷:[Ll/ۜܿۗ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    .line 317
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readInt()I

    move-result v6

    .line 482
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readByte()B

    move-result v7

    and-int/lit16 v7, v7, 0xff

    .line 334
    invoke-static {}, Ll/۬ܿۗ;->values()[Ll/۬ܿۗ;

    move-result-object v8

    if-ltz v7, :cond_0

    .line 335
    array-length v9, v8

    if-gt v7, v9, :cond_0

    .line 338
    aget-object v7, v8, v7

    .line 319
    invoke-static {v5}, Ll/۠ܿۗ;->ۤ(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v7

    .line 320
    iget-object v8, p0, Ll/۠ܿۗ;->᩷:[Ll/ۜܿۗ;

    new-instance v9, Ll/ۜܿۗ;

    invoke-static {v7}, Ll/֫֨ۗ;->᩷(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object v7

    invoke-direct {v9, v6, v7}, Ll/ۜܿۗ;-><init>(ILl/֫֨ۗ;)V

    aput-object v9, v8, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 336
    :cond_0
    new-instance v0, Ll/ᩳۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong jadx source identifier: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 336
    throw v0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_6

    .line 323
    iget-object v6, p0, Ll/۠ܿۗ;->᩷:[Ll/ۜܿۗ;

    aget-object v6, v6, v4

    .line 324
    iget-object v7, p0, Ll/۠ܿۗ;->ۤ:Ll/֫ۖۗ;

    invoke-virtual {v6}, Ll/ۜܿۗ;->ۙ()Ll/֫֨ۗ;

    move-result-object v8

    invoke-static {v7, v8}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v7

    .line 385
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readByte()B

    move-result v8

    const/4 v9, -0x2

    if-eq v8, v9, :cond_4

    const/4 v9, -0x1

    if-eq v8, v9, :cond_3

    if-eqz v8, :cond_2

    .line 394
    new-array v9, v8, [Ll/֫֨ۗ;

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v8, :cond_5

    .line 396
    invoke-direct {p0, v5}, Ll/۠ܿۗ;->ۙ(Ljava/io/DataInputStream;)Ll/֫֨ۗ;

    move-result-object v11

    aput-object v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 392
    :cond_2
    sget-object v9, Ll/۠ܿۗ;->᩸:[Ll/֫֨ۗ;

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    goto :goto_3

    .line 390
    :cond_4
    sget-object v9, Ll/۠ܿۗ;->ܳ:[Ll/֫֨ۗ;

    .line 325
    :cond_5
    :goto_3
    invoke-virtual {v6, v9}, Ll/ۜܿۗ;->ۙ([Ll/֫֨ۗ;)V

    .line 326
    invoke-direct {p0, v5}, Ll/۠ܿۗ;->᩷(Ljava/io/DataInputStream;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v6, v8}, Ll/ۜܿۗ;->ۙ(Ljava/util/List;)V

    .line 327
    invoke-direct {p0, v5, v7}, Ll/۠ܿۗ;->ۙ(Ljava/io/DataInputStream;Ll/֨ᩳۗ;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v6, v7}, Ll/ۜܿۗ;->ۙ(Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 329
    :cond_6
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 76
    sget-object v2, Ll/۠ܿۗ;->ᩴ:Ll/᩻ܽ᩺;

    invoke-interface {v2}, Ll/᩻ܽ᩺;->ۙ()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    .line 78
    iget-object v0, p0, Ll/۠ܿۗ;->᩷:[Ll/ۜܿۗ;

    invoke-static {v0}, Ll/᩹ܺۗ;->of([Ljava/lang/Object;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ۡܿۗ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ܽܺۗ;

    move-result-object v0

    invoke-interface {v0}, Ll/ܽܺۗ;->sum()I

    move-result v0

    .line 80
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget v4, p0, Ll/۠ܿۗ;->ۙ:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, p0, Ll/۠ܿۗ;->᩷:[Ll/ۜܿۗ;

    array-length v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v1, v6, v3

    const/4 v1, 0x1

    aput-object v4, v6, v1

    const/4 v1, 0x2

    aput-object v5, v6, v1

    const/4 v1, 0x3

    aput-object v0, v6, v1

    const-string v0, "Clst file loaded in {}ms, android api: {}, classes: {}, methods: {}"

    .line 79
    invoke-interface {v2, v0, v6}, Ll/᩻ܽ᩺;->᩷(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    return-void

    .line 311
    :cond_8
    :try_start_1
    new-instance v0, Ll/ᩳۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 311
    throw v0

    .line 307
    :cond_9
    new-instance v0, Ll/ᩳۧ᩵;

    const-string v1, "Wrong jadx class set header"

    .line 12
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 307
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 302
    :try_start_2
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v0
.end method

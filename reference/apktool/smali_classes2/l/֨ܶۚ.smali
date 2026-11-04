.class public final Ll/֨ܶۚ;
.super Ljava/lang/Object;
.source "A774"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۙ:[B

.field public final ۚ:[B

.field public final ۤ:[B

.field public final ۧ:I

.field public final ۫:I

.field public final ܳ:I

.field public final ܺ:Ljava/lang/String;

.field public final ᩴ:Ljava/lang/String;

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Ljava/lang/String;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput p10, p0, Ll/֨ܶۚ;->ܳ:I

    .line 54
    iput p1, p0, Ll/֨ܶۚ;->۫:I

    .line 55
    iput-object p2, p0, Ll/֨ܶۚ;->ܺ:Ljava/lang/String;

    .line 56
    iput-object p8, p0, Ll/֨ܶۚ;->᩻:Ljava/lang/String;

    .line 57
    iput-object p9, p0, Ll/֨ܶۚ;->᩷:Ljava/lang/String;

    .line 58
    iput p11, p0, Ll/֨ܶۚ;->ۧ:I

    .line 59
    array-length p1, p3

    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/֨ܶۚ;->ۚ:[B

    .line 60
    invoke-static {p3}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/֨ܶۚ;->֫:Ljava/lang/String;

    .line 61
    iput-object p5, p0, Ll/֨ܶۚ;->ᩴ:Ljava/lang/String;

    .line 62
    iput-object p6, p0, Ll/֨ܶۚ;->᩸:Ljava/lang/String;

    .line 63
    array-length p1, p4

    invoke-static {p4, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/֨ܶۚ;->ۙ:[B

    .line 64
    array-length p1, p7

    invoke-static {p7, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/֨ܶۚ;->ۤ:[B

    return-void
.end method

.method public static ۙ(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 2

    .line 308
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 309
    new-instance p0, Ll/ۤۖۗ;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Ll/ۤۖۗ;-><init>(I)V

    invoke-static {p0}, Ll/ۖ۫ۗ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object p0

    invoke-static {v0, p0}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static ۙ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)Ll/֨ܶۚ;
    .locals 13

    .line 82
    new-instance v12, Ll/֨ܶۚ;

    invoke-static {p0, p1}, Ll/֨ܶۚ;->ۙ(ILjava/lang/String;)[B

    move-result-object v3

    .line 83
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v0

    move-object/from16 v7, p4

    invoke-virtual {v0, v7}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    .line 84
    invoke-static/range {p4 .. p4}, Ll/ۘܽۚ;->ۙ([B)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v5, "missing"

    move-object v0, v12

    move v1, p0

    move-object v2, p1

    move-object v8, p2

    move-object/from16 v9, p3

    invoke-direct/range {v0 .. v11}, Ll/֨ܶۚ;-><init>(ILjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;II)V

    return-object v12
.end method

.method public static ۙ(Ljava/lang/String;IILjava/lang/String;)Ll/֨ܶۚ;
    .locals 13

    move v11, p2

    if-ltz v11, :cond_0

    const/high16 v0, 0x10000

    if-gt v11, v0, :cond_0

    const/4 v0, 0x0

    new-array v7, v0, [B

    .line 116
    new-instance v12, Ll/֨ܶۚ;

    .line 125
    new-instance v0, Ll/ۛۚۤ;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ll/ۛۚۤ;-><init>(I)V

    const/4 v1, 0x1

    .line 126
    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->writeInt(I)V

    move v1, p1

    .line 127
    invoke-virtual {v0, p1}, Ll/ۛۚۤ;->writeInt(I)V

    move-object v2, p0

    .line 128
    invoke-virtual {v0, p0}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    const/4 v10, 0x2

    .line 129
    invoke-virtual {v0, v10}, Ll/ۛۚۤ;->writeInt(I)V

    .line 130
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ۛۚۤ;->ۙ(Ljava/security/MessageDigest;)[B

    move-result-object v3

    .line 117
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    const-string v5, "missing"

    const-string v6, "missing"

    const/4 v9, 0x0

    move-object v0, v12

    move-object/from16 v8, p3

    move v11, p2

    invoke-direct/range {v0 .. v11}, Ll/֨ܶۚ;-><init>(ILjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;II)V

    return-object v12

    .line 108
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid resource type entry count"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/֨ܶۚ;
    .locals 13

    const/4 v0, 0x0

    new-array v8, v0, [B

    .line 116
    new-instance v0, Ll/֨ܶۚ;

    .line 125
    new-instance v1, Ll/ۛۚۤ;

    const/16 v2, 0x40

    invoke-direct {v1, v2}, Ll/ۛۚۤ;-><init>(I)V

    const/4 v2, 0x1

    .line 126
    invoke-virtual {v1, v2}, Ll/ۛۚۤ;->writeInt(I)V

    move v2, p1

    .line 127
    invoke-virtual {v1, p1}, Ll/ۛۚۤ;->writeInt(I)V

    move-object v3, p0

    .line 128
    invoke-virtual {v1, p0}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    const/4 v11, 0x1

    .line 129
    invoke-virtual {v1, v11}, Ll/ۛۚۤ;->writeInt(I)V

    .line 130
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/ۛۚۤ;->ۙ(Ljava/security/MessageDigest;)[B

    move-result-object v4

    .line 117
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v5

    const-string v6, "missing"

    const-string v7, "missing"

    const/4 v12, 0x0

    move-object v1, v0

    move-object v9, p2

    move-object/from16 v10, p3

    invoke-direct/range {v1 .. v12}, Ll/֨ܶۚ;-><init>(ILjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;II)V

    return-object v0
.end method

.method public static ۙ(Ll/᩷ۨᩴ;Ljava/lang/String;)Ll/᩷ۨᩴ;
    .locals 1

    .line 242
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".bin"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p0

    return-object p0
.end method

.method private ۙ(Ljava/io/OutputStream;)V
    .locals 6

    .line 324
    new-instance v0, Ll/ۛۚۤ;

    const/16 v1, 0x60

    invoke-direct {v0, v1}, Ll/ۛۚۤ;-><init>(I)V

    const v1, 0x4d525050    # 2.2052992E8f

    .line 325
    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->writeInt(I)V

    const/4 v1, 0x4

    .line 326
    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->writeInt(I)V

    .line 327
    iget v1, p0, Ll/֨ܶۚ;->ܳ:I

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->writeByte(I)V

    .line 328
    iget v1, p0, Ll/֨ܶۚ;->۫:I

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->writeInt(I)V

    .line 329
    iget-object v1, p0, Ll/֨ܶۚ;->ܺ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 330
    iget-object v2, p0, Ll/֨ܶۚ;->᩻:Ljava/lang/String;

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0, v3}, Ll/ۛۚۤ;->ۙ(Z)V

    if-eqz v2, :cond_1

    .line 332
    invoke-virtual {v0, v2}, Ll/ۛۚۤ;->ۙ(Ljava/lang/CharSequence;)V

    .line 333
    iget-object v2, p0, Ll/֨ܶۚ;->᩷:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Ll/ۛۚۤ;->ۙ(Ljava/lang/CharSequence;)V

    .line 335
    :cond_1
    invoke-virtual {p0}, Ll/֨ܶۚ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ll/֨ܶۚ;->ۧ:I

    invoke-virtual {v0, v2}, Ll/ۛۚۤ;->writeInt(I)V

    .line 336
    :cond_2
    iget-object v2, p0, Ll/֨ܶۚ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    .line 337
    iget-object v2, p0, Ll/֨ܶۚ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    .line 338
    iget-object v2, p0, Ll/֨ܶۚ;->ۙ:[B

    invoke-virtual {v0, v2}, Ll/ۛۚۤ;->write([B)V

    .line 339
    iget-object v2, p0, Ll/֨ܶۚ;->ۤ:[B

    array-length v3, v2

    invoke-virtual {v0, v3}, Ll/ۛۚۤ;->writeInt(I)V

    .line 340
    new-instance v3, Ljava/util/zip/CRC32;

    invoke-direct {v3}, Ljava/util/zip/CRC32;-><init>()V

    .line 341
    invoke-virtual {v0}, Ll/ۛۚۤ;->᩷()[B

    move-result-object v4

    invoke-virtual {v0}, Ll/ۛۚۤ;->size()I

    move-result v5

    invoke-virtual {v3, v4, v1, v5}, Ljava/util/zip/CRC32;->update([BII)V

    .line 342
    array-length v4, v2

    invoke-virtual {v3, v2, v1, v4}, Ljava/util/zip/CRC32;->update([BII)V

    .line 343
    invoke-virtual {v0, p1}, Ll/ۛۚۤ;->ۙ(Ljava/io/OutputStream;)V

    .line 344
    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 346
    invoke-virtual {v0}, Ll/ۛۚۤ;->ۤ()V

    .line 347
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v2, v1

    invoke-virtual {v0, v2}, Ll/ۛۚۤ;->writeInt(I)V

    .line 348
    invoke-virtual {v0, p1}, Ll/ۛۚۤ;->ۙ(Ljava/io/OutputStream;)V

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 249
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x44

    if-ne v1, v2, :cond_5

    const-string v1, ".bin"

    .line 250
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x40

    if-ge v1, v2, :cond_4

    .line 254
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_1

    const/16 v3, 0x39

    if-le v2, v3, :cond_2

    :cond_1
    const/16 v3, 0x61

    if-lt v2, v3, :cond_3

    const/16 v3, 0x66

    if-le v2, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0

    :cond_4
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_2
    return v0
.end method

.method public static ۙ(ILjava/lang/String;)[B
    .locals 2

    .line 266
    new-instance v0, Ll/ۛۚۤ;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ll/ۛۚۤ;-><init>(I)V

    const/4 v1, 0x1

    .line 267
    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->writeInt(I)V

    .line 268
    invoke-virtual {v0, p0}, Ll/ۛۚۤ;->writeInt(I)V

    .line 269
    invoke-virtual {v0, p1}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    .line 270
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ۛۚۤ;->ۙ(Ljava/security/MessageDigest;)[B

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/util/ArrayList;[B)[B
    .locals 3

    .line 277
    invoke-static {p0}, Ll/֨ܶۚ;->ۙ(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p0

    .line 278
    new-instance v0, Ll/ۛۚۤ;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x40

    add-int/lit8 v1, v1, 0x40

    invoke-direct {v0, v1}, Ll/ۛۚۤ;-><init>(I)V

    const/4 v1, 0x4

    .line 279
    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->writeInt(I)V

    .line 44
    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Ll/ۛۚۤ;->write([BII)V

    .line 281
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۛۚۤ;->writeInt(I)V

    .line 282
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ܶۚ;

    .line 283
    iget-object v1, p1, Ll/֨ܶۚ;->ۚ:[B

    iget-object v2, p1, Ll/֨ܶۚ;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->write([B)V

    .line 284
    iget-object v1, p1, Ll/֨ܶۚ;->ۙ:[B

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->write([B)V

    .line 285
    iget v1, p1, Ll/֨ܶۚ;->ܳ:I

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->writeByte(I)V

    .line 286
    iget v1, p1, Ll/֨ܶۚ;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->writeInt(I)V

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 287
    :goto_1
    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->ۙ(Z)V

    if-eqz v2, :cond_1

    .line 289
    invoke-virtual {v0, v2}, Ll/ۛۚۤ;->ۙ(Ljava/lang/CharSequence;)V

    .line 290
    iget-object v1, p1, Ll/֨ܶۚ;->᩷:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->ۙ(Ljava/lang/CharSequence;)V

    .line 292
    :cond_1
    iget-object p1, p1, Ll/֨ܶۚ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    goto :goto_0

    .line 294
    :cond_2
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ۛۚۤ;->ۙ(Ljava/security/MessageDigest;)[B

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)Ll/֨ܶۚ;
    .locals 13

    .line 73
    invoke-static {p0, p1}, Ll/֨ܶۚ;->ۙ(ILjava/lang/String;)[B

    move-result-object v3

    .line 74
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v0

    move-object/from16 v7, p4

    invoke-virtual {v0, v7}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    .line 75
    new-instance v12, Ll/֨ܶۚ;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, v12

    move v1, p0

    move-object v2, p1

    move-object v5, p2

    move-object/from16 v6, p3

    invoke-direct/range {v0 .. v11}, Ll/֨ܶۚ;-><init>(ILjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;II)V

    return-object v12
.end method

.method public static ᩷(Ll/᩷ۨᩴ;)Ll/֨ܶۚ;
    .locals 23

    const-string v0, ".bin"

    const-string v1, "sha256:"

    .line 137
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 138
    invoke-static {v2}, Ll/֨ܶۚ;->ۙ(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "RESOURCE_PATCH_CORRUPT"

    if-eqz v3, :cond_18

    .line 142
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۨᩴ;->ܶ᩷()[B

    move-result-object v3

    .line 143
    new-instance v5, Ll/᩵ۚۤ;

    invoke-direct {v5, v3}, Ll/᩵ۚۤ;-><init>([B)V

    .line 144
    invoke-virtual {v5}, Ll/᩵ۚۤ;->readInt()I

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const v7, 0x4d525050    # 2.2052992E8f

    const-string v8, "Unsupported resource patch format"

    if-ne v6, v7, :cond_16

    .line 147
    :try_start_1
    invoke-virtual {v5}, Ll/᩵ۚۤ;->readInt()I

    move-result v6

    const/4 v7, 0x1

    if-lt v6, v7, :cond_15

    const/4 v7, 0x4

    if-gt v6, v7, :cond_15

    const/4 v8, 0x3

    if-lt v6, v8, :cond_0

    .line 151
    invoke-virtual {v5}, Ll/᩵ۚۤ;->readByte()B

    move-result v8

    and-int/lit16 v8, v8, 0xff

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    if-ltz v8, :cond_14

    const/4 v9, 0x2

    if-gt v8, v9, :cond_14

    .line 155
    invoke-virtual {v5}, Ll/᩵ۚۤ;->readInt()I

    move-result v10

    .line 156
    invoke-virtual {v5}, Ll/᩵ۚۤ;->᩶()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    if-lt v6, v9, :cond_4

    .line 159
    invoke-virtual {v5}, Ll/᩵ۚۤ;->ܳ()Z

    move-result v13

    if-eqz v13, :cond_4

    .line 160
    invoke-virtual {v5}, Ll/᩵ۚۤ;->ܿ()Ljava/lang/String;

    move-result-object v13

    if-ne v8, v9, :cond_1

    goto :goto_1

    .line 161
    :cond_1
    invoke-virtual {v5}, Ll/᩵ۚۤ;->ܿ()Ljava/lang/String;

    move-result-object v12

    :goto_1
    if-nez v8, :cond_3

    .line 163
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_2

    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_2

    goto :goto_2

    .line 164
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource patch identity"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    move-object/from16 v18, v12

    move-object/from16 v17, v13

    goto :goto_3

    :cond_4
    move-object/from16 v17, v12

    move-object/from16 v18, v17

    :goto_3
    if-lt v6, v7, :cond_5

    if-ne v8, v9, :cond_5

    .line 167
    invoke-virtual {v5}, Ll/᩵ۚۤ;->readInt()I

    move-result v7

    goto :goto_4

    :cond_5
    const/4 v7, 0x0

    :goto_4
    if-ltz v7, :cond_13

    const/high16 v9, 0x10000

    if-gt v7, v9, :cond_13

    .line 171
    invoke-virtual {v5}, Ll/᩵ۚۤ;->᩶()Ljava/lang/String;

    move-result-object v14

    .line 172
    invoke-virtual {v5}, Ll/᩵ۚۤ;->᩶()Ljava/lang/String;

    move-result-object v9

    const/16 v12, 0x20

    new-array v13, v12, [B

    .line 61
    invoke-virtual {v5, v12, v13}, Ll/᩵ۚۤ;->ۙ(I[B)V

    .line 175
    invoke-virtual {v5}, Ll/᩵ۚۤ;->readInt()I

    move-result v12

    if-ltz v12, :cond_12

    move-object v15, v0

    move-object/from16 v16, v1

    int-to-long v0, v12

    .line 176
    invoke-virtual {v5}, Ll/᩵ۚۤ;->available()J

    move-result-wide v19

    const-wide/16 v21, 0x4

    sub-long v19, v19, v21

    cmp-long v21, v0, v19

    if-gtz v21, :cond_12

    .line 179
    new-array v0, v12, [B

    .line 61
    invoke-virtual {v5, v12, v0}, Ll/᩵ۚۤ;->ۙ(I[B)V

    .line 181
    invoke-virtual {v5}, Ll/᩵ۚۤ;->readInt()I

    move-result v1

    .line 182
    invoke-virtual {v5}, Ll/᩵ۚۤ;->available()J

    move-result-wide v19

    const-wide/16 v21, 0x0

    cmp-long v5, v19, v21

    if-nez v5, :cond_11

    .line 185
    new-instance v5, Ljava/util/zip/CRC32;

    invoke-direct {v5}, Ljava/util/zip/CRC32;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 p0, v15

    const/4 v15, 0x1

    move-object/from16 v21, v4

    if-ne v6, v15, :cond_6

    move-object v4, v0

    goto :goto_5

    :cond_6
    move-object v4, v3

    :goto_5
    if-ne v6, v15, :cond_7

    move v3, v12

    goto :goto_6

    .line 187
    :cond_7
    :try_start_2
    array-length v3, v3

    add-int/lit8 v3, v3, -0x4

    :goto_6
    const/4 v6, 0x0

    .line 186
    invoke-virtual {v5, v4, v6, v3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 188
    invoke-virtual {v5}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v3

    long-to-int v4, v3

    if-ne v4, v1, :cond_10

    .line 191
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    invoke-static {v13, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz v1, :cond_f

    const-string v1, "missing"

    if-eqz v8, :cond_9

    if-eqz v17, :cond_8

    if-nez v12, :cond_8

    .line 195
    :try_start_3
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, 0x2

    if-ne v8, v3, :cond_9

    const v3, 0xffff

    and-int/2addr v3, v10

    if-nez v3, :cond_8

    goto :goto_7

    .line 197
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource deletion patch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_7
    if-nez v8, :cond_a

    .line 200
    invoke-static {v0}, Ll/ۘܽۚ;->ۙ([B)Ljava/lang/String;

    move-result-object v1

    :cond_a
    move-object v15, v1

    .line 202
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 203
    invoke-static {v13}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, v16

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 204
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v3, 0x28

    if-ne v1, v3, :cond_b

    .line 205
    invoke-static {}, Ll/ܳ֫ܺ;->᩷()Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    .line 204
    invoke-static {v1}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object v1

    .line 205
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_8

    .line 206
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Resource patch targetVersion mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_8
    if-nez v8, :cond_d

    .line 208
    invoke-static {v10, v11}, Ll/֨ܶۚ;->ۙ(ILjava/lang/String;)[B

    move-result-object v1

    :goto_9
    move-object v12, v1

    goto :goto_a

    .line 125
    :cond_d
    new-instance v1, Ll/ۛۚۤ;

    const/16 v3, 0x40

    invoke-direct {v1, v3}, Ll/ۛۚۤ;-><init>(I)V

    const/4 v3, 0x1

    .line 126
    invoke-virtual {v1, v3}, Ll/ۛۚۤ;->writeInt(I)V

    .line 127
    invoke-virtual {v1, v10}, Ll/ۛۚۤ;->writeInt(I)V

    .line 128
    invoke-virtual {v1, v11}, Ll/ۛۚۤ;->ᩴ(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v1, v8}, Ll/ۛۚۤ;->writeInt(I)V

    .line 130
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۛۚۤ;->ۙ(Ljava/security/MessageDigest;)[B

    move-result-object v1

    goto :goto_9

    .line 210
    :goto_a
    invoke-static {v12}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, p0

    .line 211
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 214
    new-instance v1, Ll/֨ܶۚ;

    move-object v9, v1

    move-object/from16 v16, v0

    move/from16 v19, v8

    move/from16 v20, v7

    invoke-direct/range {v9 .. v20}, Ll/֨ܶۚ;-><init>(ILjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;II)V

    return-object v1

    .line 212
    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Resource patch target hash mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 192
    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Resource patch entry hash mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 189
    :cond_10
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Resource patch CRC mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    move-object/from16 v21, v4

    .line 183
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing resource patch bytes"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    move-object/from16 v21, v4

    .line 177
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource patch payload length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    move-object/from16 v21, v4

    .line 169
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource type entry count"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    move-object/from16 v21, v4

    .line 153
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource patch operation"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    move-object/from16 v21, v4

    .line 149
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    move-object/from16 v21, v4

    .line 145
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    goto :goto_b

    :catch_1
    move-exception v0

    move-object/from16 v21, v4

    .line 217
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_17

    const-string v0, "Resource patch is corrupt."

    goto :goto_c

    :cond_17
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    :goto_c
    move-object/from16 v1, v21

    .line 352
    invoke-static {v1, v0}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    .line 217
    throw v0

    :cond_18
    move-object v1, v4

    const-string v0, "Invalid resource patch file name."

    .line 352
    invoke-static {v1, v0}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    .line 139
    throw v0
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;[BLjava/lang/String;)Ll/֨ܶۚ;
    .locals 14

    move-object v0, p0

    .line 89
    new-instance v13, Ll/֨ܶۚ;

    .line 90
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v1

    move-object/from16 v8, p2

    invoke-virtual {v1, v8}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v5

    const/4 v11, 0x0

    const/4 v12, 0x0

    iget v2, v0, Ll/֨ܶۚ;->۫:I

    iget-object v3, v0, Ll/֨ܶۚ;->ܺ:Ljava/lang/String;

    iget-object v4, v0, Ll/֨ܶۚ;->ۚ:[B

    iget-object v9, v0, Ll/֨ܶۚ;->᩻:Ljava/lang/String;

    iget-object v10, v0, Ll/֨ܶۚ;->᩷:Ljava/lang/String;

    move-object v1, v13

    move-object v6, p1

    move-object/from16 v7, p3

    invoke-direct/range {v1 .. v12}, Ll/֨ܶۚ;-><init>(ILjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;II)V

    return-object v13
.end method

.method public final ۙ(Ll/᩷ۨᩴ;)V
    .locals 4

    .line 225
    iget-object v0, p0, Ll/֨ܶۚ;->֫:Ljava/lang/String;

    invoke-static {p1, v0}, Ll/֨ܶۚ;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p1

    .line 226
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۖ()V

    const-string v0, ".resource_patch"

    .line 227
    invoke-virtual {p1, v0}, Ll/᩷ۨᩴ;->ܳ(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    const/4 v1, 0x0

    .line 446
    :try_start_0
    invoke-virtual {v0, v1}, Ll/᩷ۨᩴ;->ۤ(Z)Ljava/io/OutputStream;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 230
    :try_start_1
    invoke-direct {p0, v2}, Ll/֨ܶۚ;->ۙ(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 231
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 232
    invoke-virtual {v0, p1, v1, v2, v3}, Ll/᩷ۨᩴ;->ۙ(Ll/᩷ۨᩴ;ZZLjava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 356
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->֨()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 357
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ᩳ()Z

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_1

    .line 229
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 356
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->֨()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 357
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ᩳ()Z

    .line 235
    :cond_2
    throw p1
.end method

.method public final ۙ()Z
    .locals 1

    .line 96
    iget v0, p0, Ll/֨ܶۚ;->ܳ:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֨ܶۚ;->᩻:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۤ()Z
    .locals 2

    .line 122
    iget v0, p0, Ll/֨ܶۚ;->ܳ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 121
    iget v0, p0, Ll/֨ܶۚ;->ܳ:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
